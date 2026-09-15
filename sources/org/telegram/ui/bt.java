package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class bt extends s4.s0 {
    public boolean f32579a;
    public boolean f32580b;
    public final ContactsActivity f32581c;

    public bt(ContactsActivity contactsActivity) {
        this.f32581c = contactsActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            ContactsActivity contactsActivity = this.f32581c;
            if ((contactsActivity.F && contactsActivity.E) || contactsActivity.Z.f22573r.isFocused()) {
                AndroidUtilities.hideKeyboard(contactsActivity.getParentActivity().getCurrentFocus());
            }
            this.f32580b = true;
            return;
        }
        this.f32580b = false;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        ah.h hVar;
        boolean z10;
        ContactsActivity contactsActivity = this.f32581c;
        int L0 = contactsActivity.f30750n.L0();
        boolean z11 = false;
        View childAt = recyclerView.getChildAt(0);
        if (childAt != null) {
            i12 = childAt.getTop();
        } else {
            i12 = 0;
        }
        if (contactsActivity.f30762w != null && !contactsActivity.F) {
            if (i11 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i11 != 0 && this.f32579a && (z10 || this.f32580b)) {
                contactsActivity.f30764x = !z10;
                ContactsActivity.e0(contactsActivity);
            }
            this.f32579a = true;
        }
        contactsActivity.Y.b((L0 != 0 || i12 < contactsActivity.f30742f.getPaddingTop()) ? true : true, true);
        if (Build.VERSION.SDK_INT >= 31 && (hVar = contactsActivity.f30759t0) != null) {
            hVar.f(i10, i11);
            contactsActivity.g0();
        }
        ContactsActivity.d0(contactsActivity);
    }
}
