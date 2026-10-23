package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class os extends s4.r0 {
    public boolean f39973a;
    public boolean f39974b;
    public final ContactsActivity f39975c;

    public os(ContactsActivity contactsActivity) {
        this.f39975c = contactsActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            ContactsActivity contactsActivity = this.f39975c;
            if ((contactsActivity.F && contactsActivity.E) || contactsActivity.Z.f27730r.isFocused()) {
                AndroidUtilities.hideKeyboard(contactsActivity.getParentActivity().getCurrentFocus());
            }
            this.f39974b = true;
            return;
        }
        this.f39974b = false;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        bh.f fVar;
        boolean z10;
        ContactsActivity contactsActivity = this.f39975c;
        int L0 = contactsActivity.f33096n.L0();
        boolean z11 = false;
        View childAt = recyclerView.getChildAt(0);
        if (childAt != null) {
            i12 = childAt.getTop();
        } else {
            i12 = 0;
        }
        if (contactsActivity.f33108w != null && !contactsActivity.F) {
            if (i11 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i11 != 0 && this.f39973a && (z10 || this.f39974b)) {
                contactsActivity.f33110x = !z10;
                ContactsActivity.e0(contactsActivity);
            }
            this.f39973a = true;
        }
        if (L0 != 0 || i12 < contactsActivity.f33088f.getPaddingTop()) {
            z11 = true;
        }
        contactsActivity.Y.b(z11, true);
        if (Build.VERSION.SDK_INT >= 31 && (fVar = contactsActivity.f33105t0) != null) {
            fVar.f(i10, i11);
            contactsActivity.g0();
        }
        ContactsActivity.d0(contactsActivity);
    }
}
