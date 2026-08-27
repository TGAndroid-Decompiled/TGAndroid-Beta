package org.telegram.ui.Cells;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.bp;
import org.telegram.ui.Components.lh0;

public final class m4 extends FrameLayout {

    public final org.telegram.ui.Components.n9 f24679a;

    public final org.telegram.ui.ActionBar.h5 f24680b;

    public final org.telegram.ui.ActionBar.h5 f24681c;
    public final org.telegram.ui.Components.y8 d;

    public final bp f24682e;

    public ContactsController.Contact f24683f;
    public CharSequence h;

    public m4(Context context, boolean z10) {
        super(context);
        this.d = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
        this.f24679a = n9Var;
        n9Var.setRoundRadius(AndroidUtilities.dp(23.0f));
        addView(n9Var, h7.z5.d(46, 46.0f, (LocaleController.isRTL ? 5 : 3) | 48, 13.0f, 6.0f, 13.0f, 6.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        boolean z11 = LocaleController.isRTL;
        addView(linearLayout, h7.z5.d(-1, -1.0f, 119, z11 ? 0 : 72, 0.0f, z11 ? 72 : 0, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        linearLayout.addView(frameLayout, h7.z5.l(1.0f, 0, 58));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f24680b = h5Var;
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setTextSize(15);
        h5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        frameLayout.addView(h5Var, h7.z5.d(-1, 20.0f, (LocaleController.isRTL ? 5 : 3) | 48, 0.0f, 9.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(context);
        this.f24681c = h5Var2;
        h5Var2.setTextSize(13);
        h5Var2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        frameLayout.addView(h5Var2, h7.z5.d(-1, 20.0f, (LocaleController.isRTL ? 5 : 3) | 48, 0.0f, 33.0f, 0.0f, 0.0f));
        if (z10) {
            bp bpVar = new bp(context, 21, null);
            this.f24682e = bpVar;
            bpVar.b(-1, org.telegram.ui.ActionBar.g6.f23053d6, org.telegram.ui.ActionBar.g6.f23182k7);
            bpVar.setDrawUnchecked(false);
            bpVar.setDrawBackgroundAsArc(3);
            boolean z12 = LocaleController.isRTL;
            addView(bpVar, h7.z5.d(24, 24.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : 40.0f, 32.0f, z12 ? 39.0f : 0.0f, 0.0f));
            return;
        }
        this.f24682e = null;
        lh0 lh0Var = new lh0(context);
        lh0Var.setText(LocaleController.getString(R.string.Invite));
        lh0Var.setTextSize(1, 14.0f);
        lh0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
        lh0Var.setProgressColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Nh, false));
        int iW0 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.hl, false);
        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Qh, false);
        lh0Var.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{16.0f}, iW0));
        lh0Var.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        linearLayout.addView(lh0Var, h7.z5.p(-2, 28, 0.0f, 16, 18, 0, 18, 0));
        lh0Var.setOnClickListener(new a(this, 6));
    }

    public final void a() {
        ContactsController.Contact contact = this.f24683f;
        if (contact == null) {
            return;
        }
        long j10 = contact.contact_id;
        String str = contact.first_name;
        String str2 = contact.last_name;
        org.telegram.ui.Components.y8 y8Var = this.d;
        y8Var.o(j10, str, str2, null, null);
        CharSequence charSequence = this.h;
        org.telegram.ui.ActionBar.h5 h5Var = this.f24680b;
        if (charSequence != null) {
            h5Var.l(charSequence, true);
        } else {
            ContactsController.Contact contact2 = this.f24683f;
            h5Var.l(ContactsController.formatName(contact2.first_name, contact2.last_name), false);
        }
        int i10 = org.telegram.ui.ActionBar.g6.f23423y6;
        Integer numValueOf = Integer.valueOf(i10);
        org.telegram.ui.ActionBar.h5 h5Var2 = this.f24681c;
        h5Var2.setTag(numValueOf);
        h5Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        ContactsController.Contact contact3 = this.f24683f;
        int i11 = contact3.imported;
        if (i11 > 0) {
            h5Var2.l(LocaleController.formatPluralString("TelegramContacts", i11, new Object[0]), false);
        } else {
            h5Var2.l(contact3.phones.get(0), false);
        }
        this.f24679a.setImageDrawable(y8Var);
    }

    public ContactsController.Contact getContact() {
        return this.f24683f;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }
}
