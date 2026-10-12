package org.telegram.ui.Cells;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.fj0;
import org.telegram.ui.Components.fq;
public final class p4 extends FrameLayout {
    public final org.telegram.ui.Components.y9 f22415a;
    public final org.telegram.ui.ActionBar.h5 f22416b;
    public final org.telegram.ui.ActionBar.h5 f22417c;
    public final org.telegram.ui.Components.j9 d;
    public final fq f22418e;
    public ContactsController.Contact f22419f;
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
        this.d = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.c6) null);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.f22415a = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(23.0f));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(y9Var, w7.w5.a(46.0f, 13.0f, 6.0f, 13.0f, 6.0f, 46, i10 | 48));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 72;
        }
        addView(linearLayout, w7.w5.a(-1.0f, i11, 0.0f, z11 ? 72 : 0, 0.0f, -1, 119));
        FrameLayout frameLayout = new FrameLayout(context);
        linearLayout.addView(frameLayout, w7.w5.l(1.0f, 0, 58));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f22416b = h5Var;
        h5Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G6, false));
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
        frameLayout.addView(h5Var, w7.w5.a(20.0f, 0.0f, 9.0f, 0.0f, 0.0f, -1, i13 | 48));
        org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(context);
        this.f22417c = h5Var2;
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
        frameLayout.addView(h5Var2, w7.w5.a(20.0f, 0.0f, 33.0f, 0.0f, 0.0f, -1, i15 | 48));
        if (z10) {
            fq fqVar = new fq(context, 21, null);
            this.f22418e = fqVar;
            fqVar.b(-1, org.telegram.ui.ActionBar.h6.f20560d6, org.telegram.ui.ActionBar.h6.f20689k7);
            fqVar.setDrawUnchecked(false);
            fqVar.setDrawBackgroundAsArc(3);
            boolean z12 = LocaleController.isRTL;
            int i16 = (z12 ? 5 : 3) | 48;
            if (z12) {
                f7 = 0.0f;
            } else {
                f7 = 40.0f;
            }
            addView(fqVar, w7.w5.a(24.0f, f7, 32.0f, z12 ? 39.0f : 0.0f, 0.0f, 24, i16));
            return;
        }
        this.f22418e = null;
        fj0 fj0Var = new fj0(context);
        fj0Var.setText(LocaleController.getString(R.string.Invite));
        fj0Var.setTextSize(1, 14.0f);
        fj0Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Sh, false));
        fj0Var.setProgressColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Nh, false));
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.hl, false);
        org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Qh, false);
        fj0Var.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{16.0f}, x02));
        fj0Var.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        linearLayout.addView(fj0Var, w7.w5.p(-2, 28, 0.0f, 16, 18, 0, 18, 0));
        fj0Var.setOnClickListener(new a(this, 6));
    }

    public final void a() {
        ContactsController.Contact contact = this.f22419f;
        if (contact == null) {
            return;
        }
        String str = contact.first_name;
        String str2 = contact.last_name;
        org.telegram.ui.Components.j9 j9Var = this.d;
        j9Var.o(contact.contact_id, str, str2, null, null);
        CharSequence charSequence = this.h;
        org.telegram.ui.ActionBar.h5 h5Var = this.f22416b;
        if (charSequence != null) {
            h5Var.l(charSequence, true);
        } else {
            ContactsController.Contact contact2 = this.f22419f;
            h5Var.l(ContactsController.formatName(contact2.first_name, contact2.last_name), false);
        }
        int i10 = org.telegram.ui.ActionBar.h6.f20946y6;
        Integer valueOf = Integer.valueOf(i10);
        org.telegram.ui.ActionBar.h5 h5Var2 = this.f22417c;
        h5Var2.setTag(valueOf);
        h5Var2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        ContactsController.Contact contact3 = this.f22419f;
        int i11 = contact3.imported;
        if (i11 > 0) {
            h5Var2.l(LocaleController.formatPluralString("TelegramContacts", i11, new Object[0]), false);
        } else {
            h5Var2.l(contact3.phones.get(0), false);
        }
        this.f22415a.setImageDrawable(j9Var);
    }

    public ContactsController.Contact getContact() {
        return this.f22419f;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }
}
