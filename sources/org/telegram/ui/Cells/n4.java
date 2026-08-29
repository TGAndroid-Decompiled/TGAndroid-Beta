package org.telegram.ui.Cells;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.th0;
public final class n4 extends FrameLayout {
    public final org.telegram.ui.Components.t9 f24745a;
    public final org.telegram.ui.ActionBar.h5 f24746b;
    public final org.telegram.ui.ActionBar.h5 f24747c;
    public final org.telegram.ui.Components.e9 d;
    public final hp f24748e;
    public ContactsController.Contact f24749f;
    public CharSequence h;

    public n4(Context context, boolean z10) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f9;
        float f10;
        this.d = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
        org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context);
        this.f24745a = t9Var;
        t9Var.setRoundRadius(AndroidUtilities.dp(23.0f));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(t9Var, i7.f6.d(46, 46.0f, i10 | 48, 13.0f, 6.0f, 13.0f, 6.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 72;
        }
        addView(linearLayout, i7.f6.d(-1, -1.0f, 119, i11, 0.0f, z11 ? 72 : 0, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        linearLayout.addView(frameLayout, i7.f6.l(1.0f, 0, 58));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f24746b = h5Var;
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
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
        frameLayout.addView(h5Var, i7.f6.d(-1, 20.0f, i13 | 48, 0.0f, 9.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(context);
        this.f24747c = h5Var2;
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
        frameLayout.addView(h5Var2, i7.f6.d(-1, 20.0f, i15 | 48, 0.0f, 33.0f, 0.0f, 0.0f));
        if (z10) {
            hp hpVar = new hp(context, 21, null);
            this.f24748e = hpVar;
            hpVar.b(-1, org.telegram.ui.ActionBar.g6.f23062d6, org.telegram.ui.ActionBar.g6.f23190k7);
            hpVar.setDrawUnchecked(false);
            hpVar.setDrawBackgroundAsArc(3);
            boolean z12 = LocaleController.isRTL;
            int i16 = (z12 ? 5 : 3) | 48;
            if (z12) {
                f9 = 0.0f;
            } else {
                f9 = 40.0f;
            }
            if (z12) {
                f10 = 39.0f;
            } else {
                f10 = 0.0f;
            }
            addView(hpVar, i7.f6.d(24, 24.0f, i16, f9, 32.0f, f10, 0.0f));
            return;
        }
        this.f24748e = null;
        th0 th0Var = new th0(context);
        th0Var.setText(LocaleController.getString(R.string.Invite));
        th0Var.setTextSize(1, 14.0f);
        th0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
        th0Var.setProgressColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Nh, false));
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.hl, false);
        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Qh, false);
        th0Var.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{16.0f}, w02));
        th0Var.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        linearLayout.addView(th0Var, i7.f6.p(-2, 28, 0.0f, 16, 18, 0, 18, 0));
        th0Var.setOnClickListener(new a(this, 6));
    }

    public final void a() {
        ContactsController.Contact contact = this.f24749f;
        if (contact == null) {
            return;
        }
        String str = contact.first_name;
        String str2 = contact.last_name;
        org.telegram.ui.Components.e9 e9Var = this.d;
        e9Var.o(contact.contact_id, str, str2, null, null);
        CharSequence charSequence = this.h;
        org.telegram.ui.ActionBar.h5 h5Var = this.f24746b;
        if (charSequence != null) {
            h5Var.l(charSequence, true);
        } else {
            ContactsController.Contact contact2 = this.f24749f;
            h5Var.l(ContactsController.formatName(contact2.first_name, contact2.last_name), false);
        }
        int i10 = org.telegram.ui.ActionBar.g6.f23433y6;
        Integer valueOf = Integer.valueOf(i10);
        org.telegram.ui.ActionBar.h5 h5Var2 = this.f24747c;
        h5Var2.setTag(valueOf);
        h5Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        ContactsController.Contact contact3 = this.f24749f;
        int i11 = contact3.imported;
        if (i11 > 0) {
            h5Var2.l(LocaleController.formatPluralString("TelegramContacts", i11, new Object[0]), false);
        } else {
            h5Var2.l(contact3.phones.get(0), false);
        }
        this.f24745a.setImageDrawable(e9Var);
    }

    public ContactsController.Contact getContact() {
        return this.f24749f;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }
}
