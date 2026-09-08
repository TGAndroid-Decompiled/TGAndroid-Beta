package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class bt extends s4.s0 {
    public boolean f34945a;
    public boolean f34946b;
    public final ContactsActivity f34947c;

    public bt(ContactsActivity contactsActivity) {
        this.f34947c = contactsActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            ContactsActivity contactsActivity = this.f34947c;
            if ((contactsActivity.F && contactsActivity.E) || contactsActivity.Z.f24549r.isFocused()) {
                AndroidUtilities.hideKeyboard(contactsActivity.getParentActivity().getCurrentFocus());
            }
            this.f34946b = true;
            return;
        }
        this.f34946b = false;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        bh.f fVar;
        boolean z10;
        ContactsActivity contactsActivity = this.f34947c;
        int L0 = contactsActivity.f33381n.L0();
        boolean z11 = false;
        View childAt = recyclerView.getChildAt(0);
        if (childAt != null) {
            i12 = childAt.getTop();
        } else {
            i12 = 0;
        }
        if (contactsActivity.f33393w != null && !contactsActivity.F) {
            if (i11 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i11 != 0 && this.f34945a && (z10 || this.f34946b)) {
                contactsActivity.f33395x = !z10;
                ContactsActivity.e0(contactsActivity);
            }
            this.f34945a = true;
        }
        contactsActivity.Y.b((L0 != 0 || i12 < contactsActivity.f33373f.getPaddingTop()) ? true : true, true);
        if (Build.VERSION.SDK_INT >= 31 && (fVar = contactsActivity.f33390t0) != null) {
            fVar.f(i10, i11);
            contactsActivity.g0();
        }
        ContactsActivity.d0(contactsActivity);
    }
}
