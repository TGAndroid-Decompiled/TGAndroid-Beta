package org.telegram.ui.Cells;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.aq;
import org.telegram.ui.Components.yi0;
public final class p4 extends FrameLayout {
    public final org.telegram.ui.Components.z9 f21697a;
    public final org.telegram.ui.ActionBar.h5 f21698b;
    public final org.telegram.ui.ActionBar.h5 f21699c;
    public final org.telegram.ui.Components.k9 d;
    public final aq e;
    public ContactsController.Contact f21700f;
    public CharSequence h;

    public p4(Context context, boolean z10) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f7;
        this.d = new org.telegram.ui.Components.k9((org.telegram.ui.ActionBar.c6) null);
        org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(context);
        this.f21697a = z9Var;
        z9Var.setRoundRadius(AndroidUtilities.dp(23.0f));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(z9Var, w7.a6.a(46.0f, 13.0f, 6.0f, 13.0f, 6.0f, 46, i10 | 48));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 72;
        }
        addView(linearLayout, w7.a6.a(-1.0f, i11, 0.0f, z11 ? 72 : 0, 0.0f, -1, 119));
        FrameLayout frameLayout = new FrameLayout(context);
        linearLayout.addView(frameLayout, w7.a6.l(1.0f, 0, 58));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f21698b = h5Var;
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.G6, false));
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setTextSize(15);
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        h5Var.setGravity(i12 | 48);
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        frameLayout.addView(h5Var, w7.a6.a(20.0f, 0.0f, 9.0f, 0.0f, 0.0f, -1, i13 | 48));
        org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(context);
        this.f21699c = h5Var2;
        h5Var2.setTextSize(13);
        if (LocaleController.isRTL) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        h5Var2.setGravity(i14 | 48);
        if (LocaleController.isRTL) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        frameLayout.addView(h5Var2, w7.a6.a(20.0f, 0.0f, 33.0f, 0.0f, 0.0f, -1, i15 | 48));
        if (z10) {
            aq aqVar = new aq(context, 21, null);
            this.e = aqVar;
            aqVar.b(-1, org.telegram.ui.ActionBar.g6.f19901d6, org.telegram.ui.ActionBar.g6.f20029k7);
            aqVar.setDrawUnchecked(false);
            aqVar.setDrawBackgroundAsArc(3);
            boolean z12 = LocaleController.isRTL;
            int i16 = (z12 ? 5 : 3) | 48;
            if (z12) {
                f7 = 0.0f;
            } else {
                f7 = 40.0f;
            }
            addView(aqVar, w7.a6.a(24.0f, f7, 32.0f, z12 ? 39.0f : 0.0f, 0.0f, 24, i16));
            return;
        }
        this.e = null;
        yi0 yi0Var = new yi0(context);
        yi0Var.setText(LocaleController.getString(R.string.Invite));
        yi0Var.setTextSize(1, 14.0f);
        yi0Var.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Sh, false));
        yi0Var.setProgressColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Nh, false));
        int x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.hl, false);
        org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Qh, false);
        yi0Var.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{16.0f}, x02));
        yi0Var.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        linearLayout.addView(yi0Var, w7.a6.p(-2, 28, 0.0f, 16, 18, 0, 18, 0));
        yi0Var.setOnClickListener(new a(this, 6));
    }

    public final void a() {
        ContactsController.Contact contact = this.f21700f;
        if (contact == null) {
            return;
        }
        String str = contact.first_name;
        String str2 = contact.last_name;
        org.telegram.ui.Components.k9 k9Var = this.d;
        k9Var.o(contact.contact_id, str, str2, null, null);
        CharSequence charSequence = this.h;
        org.telegram.ui.ActionBar.h5 h5Var = this.f21698b;
        if (charSequence != null) {
            h5Var.l(charSequence, true);
        } else {
            ContactsController.Contact contact2 = this.f21700f;
            h5Var.l(ContactsController.formatName(contact2.first_name, contact2.last_name), false);
        }
        int i10 = org.telegram.ui.ActionBar.g6.f20288y6;
        Integer valueOf = Integer.valueOf(i10);
        org.telegram.ui.ActionBar.h5 h5Var2 = this.f21699c;
        h5Var2.setTag(valueOf);
        h5Var2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i10, false));
        ContactsController.Contact contact3 = this.f21700f;
        int i11 = contact3.imported;
        if (i11 > 0) {
            h5Var2.l(LocaleController.formatPluralString("TelegramContacts", i11, new Object[0]), false);
        } else {
            h5Var2.l(contact3.phones.get(0), false);
        }
        this.f21697a.setImageDrawable(k9Var);
    }

    public ContactsController.Contact getContact() {
        return this.f21700f;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }
}
