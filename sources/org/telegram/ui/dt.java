package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class dt extends s4.s0 {
    public boolean f33217a;
    public boolean f33218b;
    public final ContactsActivity f33219c;

    public dt(ContactsActivity contactsActivity) {
        this.f33219c = contactsActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            ContactsActivity contactsActivity = this.f33219c;
            if ((contactsActivity.F && contactsActivity.E) || contactsActivity.Z.f22543r.isFocused()) {
                AndroidUtilities.hideKeyboard(contactsActivity.getParentActivity().getCurrentFocus());
            }
            this.f33218b = true;
            return;
        }
        this.f33218b = false;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        ah.i iVar;
        boolean z10;
        ContactsActivity contactsActivity = this.f33219c;
        int L0 = contactsActivity.f30764n.L0();
        boolean z11 = false;
        View childAt = recyclerView.getChildAt(0);
        if (childAt != null) {
            i12 = childAt.getTop();
        } else {
            i12 = 0;
        }
        if (contactsActivity.f30776w != null && !contactsActivity.F) {
            if (i11 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i11 != 0 && this.f33217a && (z10 || this.f33218b)) {
                contactsActivity.f30778x = !z10;
                ContactsActivity.e0(contactsActivity);
            }
            this.f33217a = true;
        }
        contactsActivity.Y.b((L0 != 0 || i12 < contactsActivity.f30756f.getPaddingTop()) ? true : true, true);
        if (Build.VERSION.SDK_INT >= 31 && (iVar = contactsActivity.f30773t0) != null) {
            iVar.f(i10, i11);
            contactsActivity.g0();
        }
        ContactsActivity.d0(contactsActivity);
    }
}
