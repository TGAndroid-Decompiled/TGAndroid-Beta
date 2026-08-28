package org.telegram.ui.Cells;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.jh0;
public final class p4 extends FrameLayout {
    public final org.telegram.ui.Components.o9 f24867a;
    public final org.telegram.ui.ActionBar.h5 f24868b;
    public final org.telegram.ui.ActionBar.h5 f24869c;
    public final org.telegram.ui.Components.z8 d;
    public final dp f24870e;
    public ContactsController.Contact f24871f;
    public CharSequence h;

    public p4(Context context, boolean z10) {
        super(context);
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f10;
        float f11;
        this.d = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
        this.f24867a = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(23.0f));
        if (LocaleController.isRTL) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        addView(o9Var, g7.e6.d(46, 46.0f, i9 | 48, 13.0f, 6.0f, 13.0f, 6.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i10 = 0;
        } else {
            i10 = 72;
        }
        addView(linearLayout, g7.e6.d(-1, -1.0f, 119, i10, 0.0f, z11 ? 72 : 0, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        linearLayout.addView(frameLayout, g7.e6.l(1.0f, 0, 58));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f24868b = h5Var;
        h5Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setTextSize(15);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        h5Var.setGravity(i11 | 48);
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        frameLayout.addView(h5Var, g7.e6.d(-1, 20.0f, i12 | 48, 0.0f, 9.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(context);
        this.f24869c = h5Var2;
        h5Var2.setTextSize(13);
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        h5Var2.setGravity(i13 | 48);
        if (LocaleController.isRTL) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        frameLayout.addView(h5Var2, g7.e6.d(-1, 20.0f, i14 | 48, 0.0f, 33.0f, 0.0f, 0.0f));
        if (z10) {
            dp dpVar = new dp(context, 21, null);
            this.f24870e = dpVar;
            dpVar.b(-1, org.telegram.ui.ActionBar.f6.f23001d6, org.telegram.ui.ActionBar.f6.f23128k7);
            dpVar.setDrawUnchecked(false);
            dpVar.setDrawBackgroundAsArc(3);
            boolean z12 = LocaleController.isRTL;
            int i15 = (z12 ? 5 : 3) | 48;
            if (z12) {
                f10 = 0.0f;
            } else {
                f10 = 40.0f;
            }
            if (z12) {
                f11 = 39.0f;
            } else {
                f11 = 0.0f;
            }
            addView(dpVar, g7.e6.d(24, 24.0f, i15, f10, 32.0f, f11, 0.0f));
            return;
        }
        this.f24870e = null;
        jh0 jh0Var = new jh0(context);
        jh0Var.setText(LocaleController.getString(R.string.Invite));
        jh0Var.setTextSize(1, 14.0f);
        jh0Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Sh, false));
        jh0Var.setProgressColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Nh, false));
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.hl, false);
        org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Qh, false);
        jh0Var.setBackground(org.telegram.ui.ActionBar.v5.e(new float[]{16.0f}, w02));
        jh0Var.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        linearLayout.addView(jh0Var, g7.e6.p(-2, 28, 0.0f, 16, 18, 0, 18, 0));
        jh0Var.setOnClickListener(new a(this, 6));
    }

    public final void a() {
        ContactsController.Contact contact = this.f24871f;
        if (contact == null) {
            return;
        }
        String str = contact.first_name;
        String str2 = contact.last_name;
        org.telegram.ui.Components.z8 z8Var = this.d;
        z8Var.o(contact.contact_id, str, str2, null, null);
        CharSequence charSequence = this.h;
        org.telegram.ui.ActionBar.h5 h5Var = this.f24868b;
        if (charSequence != null) {
            h5Var.l(charSequence, true);
        } else {
            ContactsController.Contact contact2 = this.f24871f;
            h5Var.l(ContactsController.formatName(contact2.first_name, contact2.last_name), false);
        }
        int i9 = org.telegram.ui.ActionBar.f6.f23369y6;
        Integer valueOf = Integer.valueOf(i9);
        org.telegram.ui.ActionBar.h5 h5Var2 = this.f24869c;
        h5Var2.setTag(valueOf);
        h5Var2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        ContactsController.Contact contact3 = this.f24871f;
        int i10 = contact3.imported;
        if (i10 > 0) {
            h5Var2.l(LocaleController.formatPluralString("TelegramContacts", i10, new Object[0]), false);
        } else {
            h5Var2.l(contact3.phones.get(0), false);
        }
        this.f24867a.setImageDrawable(z8Var);
    }

    public ContactsController.Contact getContact() {
        return this.f24871f;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }
}
