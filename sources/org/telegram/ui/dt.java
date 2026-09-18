package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class dt extends s4.s0 {
    public boolean f33221a;
    public boolean f33222b;
    public final ContactsActivity f33223c;

    public dt(ContactsActivity contactsActivity) {
        this.f33223c = contactsActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            ContactsActivity contactsActivity = this.f33223c;
            if ((contactsActivity.F && contactsActivity.E) || contactsActivity.Z.f22546r.isFocused()) {
                AndroidUtilities.hideKeyboard(contactsActivity.getParentActivity().getCurrentFocus());
            }
            this.f33222b = true;
            return;
        }
        this.f33222b = false;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        ah.i iVar;
        boolean z10;
        ContactsActivity contactsActivity = this.f33223c;
        int L0 = contactsActivity.f30767n.L0();
        boolean z11 = false;
        View childAt = recyclerView.getChildAt(0);
        if (childAt != null) {
            i12 = childAt.getTop();
        } else {
            i12 = 0;
        }
        if (contactsActivity.f30779w != null && !contactsActivity.F) {
            if (i11 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i11 != 0 && this.f33221a && (z10 || this.f33222b)) {
                contactsActivity.f30781x = !z10;
                ContactsActivity.e0(contactsActivity);
            }
            this.f33221a = true;
        }
        contactsActivity.Y.b((L0 != 0 || i12 < contactsActivity.f30759f.getPaddingTop()) ? true : true, true);
        if (Build.VERSION.SDK_INT >= 31 && (iVar = contactsActivity.f30776t0) != null) {
            iVar.f(i10, i11);
            contactsActivity.g0();
        }
        ContactsActivity.d0(contactsActivity);
    }
}
