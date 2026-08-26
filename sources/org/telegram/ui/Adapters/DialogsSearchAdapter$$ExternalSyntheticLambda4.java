package org.telegram.ui.Adapters;

import android.view.View;
import android.widget.TextView;
import androidx.collection.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda112;

public final class DialogsSearchAdapter$$ExternalSyntheticLambda4 implements DialogsSearchAdapter.OnRecentSearchLoaded, RecyclerListView.OnItemLongClickListener {
    public final DialogsSearchAdapter f$0;

    public DialogsSearchAdapter$$ExternalSyntheticLambda4(DialogsSearchAdapter dialogsSearchAdapter) {
        this.f$0 = dialogsSearchAdapter;
    }

    @Override
    public boolean onItemClick(int i, View view) {
        TLRPC.User user;
        DialogsActivity.AnonymousClass48 anonymousClass48 = this.f$0.delegate;
        if (anonymousClass48 != null) {
            Long l = (Long) view.getTag();
            long jLongValue = l.longValue();
            DialogsActivity dialogsActivity = DialogsActivity.this;
            if (dialogsActivity.getParentActivity() != null && (user = dialogsActivity.getMessagesController().getUser(l)) != null) {
                AlertDialog.Builder builder = new AlertDialog.Builder(dialogsActivity.getParentActivity(), 0, null);
                String string = LocaleController.getString(R.string.ChatHintsDeleteAlertTitle);
                AlertDialog alertDialog = builder.alertDialog;
                alertDialog.title = string;
                alertDialog.message = AndroidUtilities.replaceTags(LocaleController.formatString("ChatHintsDeleteAlert", R.string.ChatHintsDeleteAlert, ContactsController.formatName(user.first_name, user.last_name)));
                builder.setPositiveButton(LocaleController.getString(R.string.StickersRemove), new LaunchActivity$$ExternalSyntheticLambda112(anonymousClass48, jLongValue, 8));
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                dialogsActivity.showDialog(alertDialog);
                TextView textView = (TextView) alertDialog.getButton(-1);
                if (textView != null) {
                    textView.setTextColor(dialogsActivity.getThemedColor(Theme.key_text_RedBold));
                }
            }
        }
        return true;
    }

    @Override
    public void setRecentSearch(ArrayList arrayList, LongSparseArray longSparseArray) {
        DialogsSearchAdapter dialogsSearchAdapter = this.f$0;
        dialogsSearchAdapter.recentSearchObjects = arrayList;
        dialogsSearchAdapter.recentSearchObjectsById = longSparseArray;
        for (int i = 0; i < dialogsSearchAdapter.recentSearchObjects.size(); i++) {
            DialogsSearchAdapter.RecentSearchObject recentSearchObject = (DialogsSearchAdapter.RecentSearchObject) dialogsSearchAdapter.recentSearchObjects.get(i);
            TLObject tLObject = recentSearchObject.object;
            boolean z = tLObject instanceof TLRPC.User;
            int i2 = dialogsSearchAdapter.currentAccount;
            if (z) {
                MessagesController.getInstance(i2).putUser((TLRPC.User) recentSearchObject.object, true);
            } else if (tLObject instanceof TLRPC.Chat) {
                MessagesController.getInstance(i2).putChat((TLRPC.Chat) recentSearchObject.object, true);
            } else if (tLObject instanceof TLRPC.EncryptedChat) {
                MessagesController.getInstance(i2).putEncryptedChat((TLRPC.EncryptedChat) recentSearchObject.object, true);
            }
        }
        dialogsSearchAdapter.filterRecent(null);
        dialogsSearchAdapter.notifyDataSetChanged();
    }
}
