package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class ct extends s4.s0 {
    public boolean f31768a;
    public boolean f31769b;
    public final ContactsActivity f31770c;

    public ct(ContactsActivity contactsActivity) {
        this.f31770c = contactsActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            ContactsActivity contactsActivity = this.f31770c;
            if ((contactsActivity.F && contactsActivity.E) || contactsActivity.Z.f24572r.isFocused()) {
                AndroidUtilities.hideKeyboard(contactsActivity.getParentActivity().getCurrentFocus());
            }
            this.f31769b = true;
            return;
        }
        this.f31769b = false;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        zg.e eVar;
        boolean z10;
        ContactsActivity contactsActivity = this.f31770c;
        int L0 = contactsActivity.f29863n.L0();
        boolean z11 = false;
        View childAt = recyclerView.getChildAt(0);
        if (childAt != null) {
            i12 = childAt.getTop();
        } else {
            i12 = 0;
        }
        if (contactsActivity.f29875w != null && !contactsActivity.F) {
            if (i11 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i11 != 0 && this.f31768a && (z10 || this.f31769b)) {
                contactsActivity.f29877x = !z10;
                ContactsActivity.e0(contactsActivity);
            }
            this.f31768a = true;
        }
        contactsActivity.Y.b((L0 != 0 || i12 < contactsActivity.f29855f.getPaddingTop()) ? true : true, true);
        if (Build.VERSION.SDK_INT >= 31 && (eVar = contactsActivity.f29872t0) != null) {
            eVar.f(i10, i11);
            contactsActivity.g0();
        }
        ContactsActivity.d0(contactsActivity);
    }
}
