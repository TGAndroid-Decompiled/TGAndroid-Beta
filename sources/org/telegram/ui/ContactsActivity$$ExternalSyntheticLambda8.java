package org.telegram.ui;

import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.RecyclerAnimationScrollHelper;
import org.telegram.ui.Components.RecyclerListView;

public final class ContactsActivity$$ExternalSyntheticLambda8 implements RecyclerAnimationScrollHelper.ScrollListener, RecyclerListView.OnItemLongClickListener, OnApplyWindowInsetsListener, AlertDialog.OnButtonClickListener {
    public final ContactsActivity f$0;

    public ContactsActivity$$ExternalSyntheticLambda8(ContactsActivity contactsActivity) {
        this.f$0 = contactsActivity;
    }

    @Override
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        return this.f$0.onApplyWindowInsets(view, windowInsetsCompat);
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        this.f$0.lambda$performSelectedContactsDelete$8(alertDialog, i);
    }

    @Override
    public boolean onItemClick(View view, int i) {
        return this.f$0.lambda$createView$6(view, i);
    }

    @Override
    public void onScroll() {
        this.f$0.lambda$createView$2();
    }
}
