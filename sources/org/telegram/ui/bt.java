package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class bt extends s4.s0 {
    public boolean f32554a;
    public boolean f32555b;
    public final ContactsActivity f32556c;

    public bt(ContactsActivity contactsActivity) {
        this.f32556c = contactsActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            ContactsActivity contactsActivity = this.f32556c;
            if ((contactsActivity.F && contactsActivity.E) || contactsActivity.Z.f22811r.isFocused()) {
                AndroidUtilities.hideKeyboard(contactsActivity.getParentActivity().getCurrentFocus());
            }
            this.f32555b = true;
            return;
        }
        this.f32555b = false;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        ah.i iVar;
        boolean z10;
        ContactsActivity contactsActivity = this.f32556c;
        int L0 = contactsActivity.f31055n.L0();
        boolean z11 = false;
        View childAt = recyclerView.getChildAt(0);
        if (childAt != null) {
            i12 = childAt.getTop();
        } else {
            i12 = 0;
        }
        if (contactsActivity.f31067w != null && !contactsActivity.F) {
            if (i11 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i11 != 0 && this.f32554a && (z10 || this.f32555b)) {
                contactsActivity.f31069x = !z10;
                ContactsActivity.e0(contactsActivity);
            }
            this.f32554a = true;
        }
        contactsActivity.Y.b((L0 != 0 || i12 < contactsActivity.f31047f.getPaddingTop()) ? true : true, true);
        if (Build.VERSION.SDK_INT >= 31 && (iVar = contactsActivity.f31064t0) != null) {
            iVar.f(i10, i11);
            contactsActivity.g0();
        }
        ContactsActivity.d0(contactsActivity);
    }
}
