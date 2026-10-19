package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class os extends s4.r0 {
    public boolean f39963a;
    public boolean f39964b;
    public final ContactsActivity f39965c;

    public os(ContactsActivity contactsActivity) {
        this.f39965c = contactsActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            ContactsActivity contactsActivity = this.f39965c;
            if ((contactsActivity.F && contactsActivity.E) || contactsActivity.Z.f27686r.isFocused()) {
                AndroidUtilities.hideKeyboard(contactsActivity.getParentActivity().getCurrentFocus());
            }
            this.f39964b = true;
            return;
        }
        this.f39964b = false;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        bh.f fVar;
        boolean z10;
        ContactsActivity contactsActivity = this.f39965c;
        int L0 = contactsActivity.f33085n.L0();
        boolean z11 = false;
        View childAt = recyclerView.getChildAt(0);
        if (childAt != null) {
            i12 = childAt.getTop();
        } else {
            i12 = 0;
        }
        if (contactsActivity.f33097w != null && !contactsActivity.F) {
            if (i11 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i11 != 0 && this.f39963a && (z10 || this.f39964b)) {
                contactsActivity.f33099x = !z10;
                ContactsActivity.e0(contactsActivity);
            }
            this.f39963a = true;
        }
        if (L0 != 0 || i12 < contactsActivity.f33077f.getPaddingTop()) {
            z11 = true;
        }
        contactsActivity.Y.b(z11, true);
        if (Build.VERSION.SDK_INT >= 31 && (fVar = contactsActivity.f33094t0) != null) {
            fVar.f(i10, i11);
            contactsActivity.g0();
        }
        ContactsActivity.d0(contactsActivity);
    }
}
