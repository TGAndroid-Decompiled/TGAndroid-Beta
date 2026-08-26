package org.telegram.ui;

import android.view.View;
import androidx.collection.LongSparseArray;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Cells.ProfileSearchCell;
import org.telegram.ui.Cells.UserCell;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.RecyclerAnimationScrollHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.StickerEmptyView;

public final class ContactsActivity$$ExternalSyntheticLambda7 implements OnApplyWindowInsetsListener, AlertDialog.OnButtonClickListener, RecyclerAnimationScrollHelper.ScrollListener, RecyclerListView.OnItemLongClickListener {
    public final ContactsActivity f$0;

    public ContactsActivity$$ExternalSyntheticLambda7(ContactsActivity contactsActivity) {
        this.f$0 = contactsActivity;
    }

    @Override
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        ContactsActivity contactsActivity = this.f$0;
        contactsActivity.navigationBarHeight = AndroidUtilities.getDefaultWindowInsets(windowInsetsCompat, false).bottom;
        contactsActivity.checkUi_listViewPadding$2();
        contactsActivity.checkUi_floatingButtonPosition();
        StickerEmptyView stickerEmptyView = contactsActivity.emptyView;
        if (stickerEmptyView != null) {
            stickerEmptyView.setKeyboardHeight(Math.max(contactsActivity.navigationBarHeight + contactsActivity.additionNavigationBarHeight, contactsActivity.imeInsetAnimatedHeight), false);
        }
        return WindowInsetsCompat.CONSUMED;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        ContactsActivity contactsActivity = this.f$0;
        contactsActivity.getClass();
        LongSparseArray longSparseArray = contactsActivity.selectedContacts;
        ArrayList<TLRPC.User> arrayList = new ArrayList<>(longSparseArray.size());
        for (int i2 = 0; i2 < longSparseArray.size(); i2++) {
            arrayList.add((TLRPC.User) longSparseArray.get(longSparseArray.keyAt(i2)));
        }
        contactsActivity.getContactsController().deleteContactsUndoable(contactsActivity.getParentActivity(), contactsActivity, arrayList);
        contactsActivity.hideActionMode$2();
    }

    @Override
    public boolean onItemClick(int i, View view) {
        ContactsActivity contactsActivity = this.f$0;
        RecyclerView.Adapter adapter = contactsActivity.listView.getAdapter();
        ContactsActivity.AnonymousClass4 anonymousClass4 = contactsActivity.listViewAdapter;
        if (adapter == anonymousClass4) {
            int sectionForPosition = anonymousClass4.getSectionForPosition(i);
            int positionInSectionForPosition = contactsActivity.listViewAdapter.getPositionInSectionForPosition(i);
            Bulletin bulletin = Bulletin.visibleBulletin;
            if (bulletin != null) {
                bulletin.hide();
            }
            if (positionInSectionForPosition < 0 || sectionForPosition < 0) {
                return false;
            }
        }
        boolean z = contactsActivity.returnAsResult;
        if (!z && !contactsActivity.createSecretChat && (view instanceof UserCell)) {
            contactsActivity.showOrUpdateActionMode((UserCell) view);
            return true;
        }
        if (z || contactsActivity.createSecretChat || !(view instanceof ProfileSearchCell)) {
            return false;
        }
        ProfileSearchCell profileSearchCell = (ProfileSearchCell) view;
        if (profileSearchCell.getUser() != null && profileSearchCell.getUser().contact) {
            contactsActivity.showOrUpdateActionMode(profileSearchCell);
        }
        return true;
    }

    @Override
    public void onScroll() {
        this.f$0.blur3_InvalidateBlur$3();
    }
}
