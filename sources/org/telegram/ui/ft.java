package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class ft extends s4.r0 {
    public boolean f36222a;
    public boolean f36223b;
    public final ContactsActivity f36224c;

    public ft(ContactsActivity contactsActivity) {
        this.f36224c = contactsActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            ContactsActivity contactsActivity = this.f36224c;
            if ((contactsActivity.F && contactsActivity.E) || contactsActivity.Z.f27815r.isFocused()) {
                AndroidUtilities.hideKeyboard(contactsActivity.getParentActivity().getCurrentFocus());
            }
            this.f36223b = true;
            return;
        }
        this.f36223b = false;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        bh.f fVar;
        boolean z10;
        ContactsActivity contactsActivity = this.f36224c;
        int L0 = contactsActivity.f32039n.L0();
        boolean z11 = false;
        View childAt = recyclerView.getChildAt(0);
        if (childAt != null) {
            i12 = childAt.getTop();
        } else {
            i12 = 0;
        }
        if (contactsActivity.f32051w != null && !contactsActivity.F) {
            if (i11 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i11 != 0 && this.f36222a && (z10 || this.f36223b)) {
                contactsActivity.f32053x = !z10;
                ContactsActivity.e0(contactsActivity);
            }
            this.f36222a = true;
        }
        if (L0 != 0 || i12 < contactsActivity.f32031f.getPaddingTop()) {
            z11 = true;
        }
        contactsActivity.Y.b(z11, true);
        if (Build.VERSION.SDK_INT >= 31 && (fVar = contactsActivity.f32048t0) != null) {
            fVar.f(i10, i11);
            contactsActivity.g0();
        }
        ContactsActivity.d0(contactsActivity);
    }
}
