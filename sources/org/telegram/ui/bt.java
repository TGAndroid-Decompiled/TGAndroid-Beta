package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class bt extends s4.s0 {
    public boolean f32451a;
    public boolean f32452b;
    public final ContactsActivity f32453c;

    public bt(ContactsActivity contactsActivity) {
        this.f32453c = contactsActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            ContactsActivity contactsActivity = this.f32453c;
            if ((contactsActivity.F && contactsActivity.E) || contactsActivity.Z.f22787r.isFocused()) {
                AndroidUtilities.hideKeyboard(contactsActivity.getParentActivity().getCurrentFocus());
            }
            this.f32452b = true;
            return;
        }
        this.f32452b = false;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        ah.i iVar;
        boolean z10;
        ContactsActivity contactsActivity = this.f32453c;
        int L0 = contactsActivity.f30994n.L0();
        boolean z11 = false;
        View childAt = recyclerView.getChildAt(0);
        if (childAt != null) {
            i12 = childAt.getTop();
        } else {
            i12 = 0;
        }
        if (contactsActivity.f31006w != null && !contactsActivity.F) {
            if (i11 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i11 != 0 && this.f32451a && (z10 || this.f32452b)) {
                contactsActivity.f31008x = !z10;
                ContactsActivity.e0(contactsActivity);
            }
            this.f32451a = true;
        }
        contactsActivity.Y.b((L0 != 0 || i12 < contactsActivity.f30986f.getPaddingTop()) ? true : true, true);
        if (Build.VERSION.SDK_INT >= 31 && (iVar = contactsActivity.f31003t0) != null) {
            iVar.f(i10, i11);
            contactsActivity.g0();
        }
        ContactsActivity.d0(contactsActivity);
    }
}
