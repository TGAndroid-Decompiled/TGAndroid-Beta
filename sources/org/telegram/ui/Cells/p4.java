package org.telegram.ui.Cells;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.op;
import org.telegram.ui.Components.yh0;
public final class p4 extends FrameLayout {
    public final org.telegram.ui.Components.w9 f20559a;
    public final org.telegram.ui.ActionBar.i5 f20560b;
    public final org.telegram.ui.ActionBar.i5 f20561c;
    public final org.telegram.ui.Components.h9 d;
    public final op e;
    public ContactsController.Contact f20562f;
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
        this.d = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.f20559a = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(23.0f));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(w9Var, w7.x5.d(46, 46.0f, i10 | 48, 13.0f, 6.0f, 13.0f, 6.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 72;
        }
        addView(linearLayout, w7.x5.d(-1, -1.0f, 119, i11, 0.0f, z11 ? 72 : 0, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        linearLayout.addView(frameLayout, w7.x5.l(1.0f, 0, 58));
        org.telegram.ui.ActionBar.i5 i5Var = new org.telegram.ui.ActionBar.i5(context);
        this.f20560b = i5Var;
        i5Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.G6, false));
        i5Var.setTypeface(AndroidUtilities.bold());
        i5Var.setTextSize(15);
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        i5Var.setGravity(i12 | 48);
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        frameLayout.addView(i5Var, w7.x5.d(-1, 20.0f, i13 | 48, 0.0f, 9.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.i5 i5Var2 = new org.telegram.ui.ActionBar.i5(context);
        this.f20561c = i5Var2;
        i5Var2.setTextSize(13);
        if (LocaleController.isRTL) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        i5Var2.setGravity(i14 | 48);
        if (LocaleController.isRTL) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        frameLayout.addView(i5Var2, w7.x5.d(-1, 20.0f, i15 | 48, 0.0f, 33.0f, 0.0f, 0.0f));
        if (z10) {
            op opVar = new op(context, 21, null);
            this.e = opVar;
            opVar.b(-1, org.telegram.ui.ActionBar.h6.f18789d6, org.telegram.ui.ActionBar.h6.f18917k7);
            opVar.setDrawUnchecked(false);
            opVar.setDrawBackgroundAsArc(3);
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
            addView(opVar, w7.x5.d(24, 24.0f, i16, f7, 32.0f, f10, 0.0f));
            return;
        }
        this.e = null;
        yh0 yh0Var = new yh0(context);
        yh0Var.setText(LocaleController.getString(R.string.Invite));
        yh0Var.setTextSize(1, 14.0f);
        yh0Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Sh, false));
        yh0Var.setProgressColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Nh, false));
        int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.hl, false);
        org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Qh, false);
        yh0Var.setBackground(org.telegram.ui.ActionBar.x5.e(new float[]{16.0f}, w02));
        yh0Var.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        linearLayout.addView(yh0Var, w7.x5.p(-2, 28, 0.0f, 16, 18, 0, 18, 0));
        yh0Var.setOnClickListener(new a(this, 6));
    }

    public final void a() {
        ContactsController.Contact contact = this.f20562f;
        if (contact == null) {
            return;
        }
        String str = contact.first_name;
        String str2 = contact.last_name;
        org.telegram.ui.Components.h9 h9Var = this.d;
        h9Var.o(contact.contact_id, str, str2, null, null);
        CharSequence charSequence = this.h;
        org.telegram.ui.ActionBar.i5 i5Var = this.f20560b;
        if (charSequence != null) {
            i5Var.l(charSequence, true);
        } else {
            ContactsController.Contact contact2 = this.f20562f;
            i5Var.l(ContactsController.formatName(contact2.first_name, contact2.last_name), false);
        }
        int i10 = org.telegram.ui.ActionBar.h6.f19170y6;
        Integer valueOf = Integer.valueOf(i10);
        org.telegram.ui.ActionBar.i5 i5Var2 = this.f20561c;
        i5Var2.setTag(valueOf);
        i5Var2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
        ContactsController.Contact contact3 = this.f20562f;
        int i11 = contact3.imported;
        if (i11 > 0) {
            i5Var2.l(LocaleController.formatPluralString("TelegramContacts", i11, new Object[0]), false);
        } else {
            i5Var2.l(contact3.phones.get(0), false);
        }
        this.f20559a.setImageDrawable(h9Var);
    }

    public ContactsController.Contact getContact() {
        return this.f20562f;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }
}
