package org.telegram.ui.Cells;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.fi0;
import org.telegram.ui.Components.kp;
public final class o4 extends FrameLayout {
    public final org.telegram.ui.Components.p9 f21480a;
    public final org.telegram.ui.ActionBar.k5 f21481b;
    public final org.telegram.ui.ActionBar.k5 f21482c;
    public final org.telegram.ui.Components.z8 d;
    public final kp e;
    public ContactsController.Contact f21483f;
    public CharSequence h;

    public o4(Context context, boolean z4) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f10;
        float f11;
        this.d = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.f21480a = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(23.0f));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(p9Var, k7.b6.d(46, 46.0f, i10 | 48, 13.0f, 6.0f, 13.0f, 6.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i11 = 0;
        } else {
            i11 = 72;
        }
        addView(linearLayout, k7.b6.d(-1, -1.0f, 119, i11, 0.0f, z10 ? 72 : 0, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        linearLayout.addView(frameLayout, k7.b6.l(1.0f, 0, 58));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.f21481b = k5Var;
        k5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        k5Var.setTypeface(AndroidUtilities.bold());
        k5Var.setTextSize(15);
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        k5Var.setGravity(i12 | 48);
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        frameLayout.addView(k5Var, k7.b6.d(-1, 20.0f, i13 | 48, 0.0f, 9.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var2 = new org.telegram.ui.ActionBar.k5(context);
        this.f21482c = k5Var2;
        k5Var2.setTextSize(13);
        if (LocaleController.isRTL) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        k5Var2.setGravity(i14 | 48);
        if (LocaleController.isRTL) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        frameLayout.addView(k5Var2, k7.b6.d(-1, 20.0f, i15 | 48, 0.0f, 33.0f, 0.0f, 0.0f));
        if (z4) {
            kp kpVar = new kp(context, 21, null);
            this.e = kpVar;
            kpVar.b(-1, org.telegram.ui.ActionBar.j6.f19881d6, org.telegram.ui.ActionBar.j6.f20007k7);
            kpVar.setDrawUnchecked(false);
            kpVar.setDrawBackgroundAsArc(3);
            boolean z11 = LocaleController.isRTL;
            int i16 = (z11 ? 5 : 3) | 48;
            if (z11) {
                f10 = 0.0f;
            } else {
                f10 = 40.0f;
            }
            if (z11) {
                f11 = 39.0f;
            } else {
                f11 = 0.0f;
            }
            addView(kpVar, k7.b6.d(24, 24.0f, i16, f10, 32.0f, f11, 0.0f));
            return;
        }
        this.e = null;
        fi0 fi0Var = new fi0(context);
        fi0Var.setText(LocaleController.getString(R.string.Invite));
        fi0Var.setTextSize(1, 14.0f);
        fi0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
        fi0Var.setProgressColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Nh, false));
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.hl, false);
        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Qh, false);
        fi0Var.setBackground(org.telegram.ui.ActionBar.z5.e(new float[]{16.0f}, w02));
        fi0Var.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        linearLayout.addView(fi0Var, k7.b6.p(-2, 28, 0.0f, 16, 18, 0, 18, 0));
        fi0Var.setOnClickListener(new a(this, 6));
    }

    public final void a() {
        ContactsController.Contact contact = this.f21483f;
        if (contact == null) {
            return;
        }
        String str = contact.first_name;
        String str2 = contact.last_name;
        org.telegram.ui.Components.z8 z8Var = this.d;
        z8Var.o(contact.contact_id, str, str2, null, null);
        CharSequence charSequence = this.h;
        org.telegram.ui.ActionBar.k5 k5Var = this.f21481b;
        if (charSequence != null) {
            k5Var.l(charSequence, true);
        } else {
            ContactsController.Contact contact2 = this.f21483f;
            k5Var.l(ContactsController.formatName(contact2.first_name, contact2.last_name), false);
        }
        int i10 = org.telegram.ui.ActionBar.j6.f20256y6;
        Integer valueOf = Integer.valueOf(i10);
        org.telegram.ui.ActionBar.k5 k5Var2 = this.f21482c;
        k5Var2.setTag(valueOf);
        k5Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        ContactsController.Contact contact3 = this.f21483f;
        int i11 = contact3.imported;
        if (i11 > 0) {
            k5Var2.l(LocaleController.formatPluralString("TelegramContacts", i11, new Object[0]), false);
        } else {
            k5Var2.l(contact3.phones.get(0), false);
        }
        this.f21480a.setImageDrawable(z8Var);
    }

    public ContactsController.Contact getContact() {
        return this.f21483f;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }
}
