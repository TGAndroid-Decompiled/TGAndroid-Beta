package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class bt extends s4.s0 {
    public boolean f32572a;
    public boolean f32573b;
    public final ContactsActivity f32574c;

    public bt(ContactsActivity contactsActivity) {
        this.f32574c = contactsActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            ContactsActivity contactsActivity = this.f32574c;
            if ((contactsActivity.F && contactsActivity.E) || contactsActivity.Z.f22569r.isFocused()) {
                AndroidUtilities.hideKeyboard(contactsActivity.getParentActivity().getCurrentFocus());
            }
            this.f32573b = true;
            return;
        }
        this.f32573b = false;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        ah.h hVar;
        boolean z10;
        ContactsActivity contactsActivity = this.f32574c;
        int L0 = contactsActivity.f30747n.L0();
        boolean z11 = false;
        View childAt = recyclerView.getChildAt(0);
        if (childAt != null) {
            i12 = childAt.getTop();
        } else {
            i12 = 0;
        }
        if (contactsActivity.f30759w != null && !contactsActivity.F) {
            if (i11 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i11 != 0 && this.f32572a && (z10 || this.f32573b)) {
                contactsActivity.f30761x = !z10;
                ContactsActivity.e0(contactsActivity);
            }
            this.f32572a = true;
        }
        contactsActivity.Y.b((L0 != 0 || i12 < contactsActivity.f30739f.getPaddingTop()) ? true : true, true);
        if (Build.VERSION.SDK_INT >= 31 && (hVar = contactsActivity.f30756t0) != null) {
            hVar.f(i10, i11);
            contactsActivity.g0();
        }
        ContactsActivity.d0(contactsActivity);
    }
}
