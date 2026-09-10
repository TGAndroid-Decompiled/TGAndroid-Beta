package org.telegram.ui.Cells;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.hi0;
import org.telegram.ui.Components.tp;
public final class p4 extends FrameLayout {
    public final org.telegram.ui.Components.w9 f19672a;
    public final org.telegram.ui.ActionBar.l5 f19673b;
    public final org.telegram.ui.ActionBar.l5 f19674c;
    public final org.telegram.ui.Components.g9 d;
    public final tp e;
    public ContactsController.Contact f19675f;
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
        float f10;
        this.d = new org.telegram.ui.Components.g9((org.telegram.ui.ActionBar.f6) null);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.f19672a = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(23.0f));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(w9Var, w7.a6.d(46, 46.0f, i10 | 48, 13.0f, 6.0f, 13.0f, 6.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 72;
        }
        addView(linearLayout, w7.a6.d(-1, -1.0f, 119, i11, 0.0f, z11 ? 72 : 0, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        linearLayout.addView(frameLayout, w7.a6.l(1.0f, 0, 58));
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.f19673b = l5Var;
        l5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        l5Var.setTypeface(AndroidUtilities.bold());
        l5Var.setTextSize(15);
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        l5Var.setGravity(i12 | 48);
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        frameLayout.addView(l5Var, w7.a6.d(-1, 20.0f, i13 | 48, 0.0f, 9.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.l5 l5Var2 = new org.telegram.ui.ActionBar.l5(context);
        this.f19674c = l5Var2;
        l5Var2.setTextSize(13);
        if (LocaleController.isRTL) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        l5Var2.setGravity(i14 | 48);
        if (LocaleController.isRTL) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        frameLayout.addView(l5Var2, w7.a6.d(-1, 20.0f, i15 | 48, 0.0f, 33.0f, 0.0f, 0.0f));
        if (z10) {
            tp tpVar = new tp(context, 21, null);
            this.e = tpVar;
            tpVar.b(-1, org.telegram.ui.ActionBar.j6.f17928d6, org.telegram.ui.ActionBar.j6.f18056k7);
            tpVar.setDrawUnchecked(false);
            tpVar.setDrawBackgroundAsArc(3);
            boolean z12 = LocaleController.isRTL;
            int i16 = (z12 ? 5 : 3) | 48;
            if (z12) {
                f7 = 0.0f;
            } else {
                f7 = 40.0f;
            }
            if (z12) {
                f10 = 39.0f;
            } else {
                f10 = 0.0f;
            }
            addView(tpVar, w7.a6.d(24, 24.0f, i16, f7, 32.0f, f10, 0.0f));
            return;
        }
        this.e = null;
        hi0 hi0Var = new hi0(context);
        hi0Var.setText(LocaleController.getString(R.string.Invite));
        hi0Var.setTextSize(1, 14.0f);
        hi0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
        hi0Var.setProgressColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Nh, false));
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.hl, false);
        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Qh, false);
        hi0Var.setBackground(org.telegram.ui.ActionBar.z5.e(new float[]{16.0f}, w02));
        hi0Var.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        linearLayout.addView(hi0Var, w7.a6.p(-2, 28, 0.0f, 16, 18, 0, 18, 0));
        hi0Var.setOnClickListener(new a(this, 6));
    }

    public final void a() {
        ContactsController.Contact contact = this.f19675f;
        if (contact == null) {
            return;
        }
        String str = contact.first_name;
        String str2 = contact.last_name;
        org.telegram.ui.Components.g9 g9Var = this.d;
        g9Var.o(contact.contact_id, str, str2, null, null);
        CharSequence charSequence = this.h;
        org.telegram.ui.ActionBar.l5 l5Var = this.f19673b;
        if (charSequence != null) {
            l5Var.l(charSequence, true);
        } else {
            ContactsController.Contact contact2 = this.f19675f;
            l5Var.l(ContactsController.formatName(contact2.first_name, contact2.last_name), false);
        }
        int i10 = org.telegram.ui.ActionBar.j6.f18306y6;
        Integer valueOf = Integer.valueOf(i10);
        org.telegram.ui.ActionBar.l5 l5Var2 = this.f19674c;
        l5Var2.setTag(valueOf);
        l5Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        ContactsController.Contact contact3 = this.f19675f;
        int i11 = contact3.imported;
        if (i11 > 0) {
            l5Var2.l(LocaleController.formatPluralString("TelegramContacts", i11, new Object[0]), false);
        } else {
            l5Var2.l(contact3.phones.get(0), false);
        }
        this.f19672a.setImageDrawable(g9Var);
    }

    public ContactsController.Contact getContact() {
        return this.f19675f;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }
}
