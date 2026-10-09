package org.telegram.ui.Cells;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.dq;
public final class p4 extends FrameLayout {
    public final org.telegram.ui.Components.y9 f22651a;
    public final org.telegram.ui.ActionBar.j5 f22652b;
    public final org.telegram.ui.ActionBar.j5 f22653c;
    public final org.telegram.ui.Components.j9 d;
    public final dq f22654e;
    public ContactsController.Contact f22655f;
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
        this.d = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.e6) null);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.f22651a = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(23.0f));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(y9Var, w7.x5.a(46.0f, 13.0f, 6.0f, 13.0f, 6.0f, 46, i10 | 48));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 72;
        }
        addView(linearLayout, w7.x5.a(-1.0f, i11, 0.0f, z11 ? 72 : 0, 0.0f, -1, 119));
        FrameLayout frameLayout = new FrameLayout(context);
        linearLayout.addView(frameLayout, w7.x5.l(1.0f, 0, 58));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f22652b = j5Var;
        j5Var.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.G6, false));
        j5Var.setTypeface(AndroidUtilities.bold());
        j5Var.setTextSize(15);
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        j5Var.setGravity(i12 | 48);
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        frameLayout.addView(j5Var, w7.x5.a(20.0f, 0.0f, 9.0f, 0.0f, 0.0f, -1, i13 | 48));
        org.telegram.ui.ActionBar.j5 j5Var2 = new org.telegram.ui.ActionBar.j5(context);
        this.f22653c = j5Var2;
        j5Var2.setTextSize(13);
        if (LocaleController.isRTL) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        j5Var2.setGravity(i14 | 48);
        if (LocaleController.isRTL) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        frameLayout.addView(j5Var2, w7.x5.a(20.0f, 0.0f, 33.0f, 0.0f, 0.0f, -1, i15 | 48));
        if (z10) {
            dq dqVar = new dq(context, 21, null);
            this.f22654e = dqVar;
            dqVar.b(-1, org.telegram.ui.ActionBar.i6.f20797d6, org.telegram.ui.ActionBar.i6.f20926k7);
            dqVar.setDrawUnchecked(false);
            dqVar.setDrawBackgroundAsArc(3);
            boolean z12 = LocaleController.isRTL;
            int i16 = (z12 ? 5 : 3) | 48;
            if (z12) {
                f7 = 0.0f;
            } else {
                f7 = 40.0f;
            }
            addView(dqVar, w7.x5.a(24.0f, f7, 32.0f, z12 ? 39.0f : 0.0f, 0.0f, 24, i16));
            return;
        }
        this.f22654e = null;
        cj0 cj0Var = new cj0(context);
        cj0Var.setText(LocaleController.getString(R.string.Invite));
        cj0Var.setTextSize(1, 14.0f);
        cj0Var.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Sh, false));
        cj0Var.setProgressColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Nh, false));
        int x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.hl, false);
        org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Qh, false);
        cj0Var.setBackground(org.telegram.ui.ActionBar.y5.e(new float[]{16.0f}, x02));
        cj0Var.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        linearLayout.addView(cj0Var, w7.x5.p(-2, 28, 0.0f, 16, 18, 0, 18, 0));
        cj0Var.setOnClickListener(new a(this, 6));
    }

    public final void a() {
        ContactsController.Contact contact = this.f22655f;
        if (contact == null) {
            return;
        }
        String str = contact.first_name;
        String str2 = contact.last_name;
        org.telegram.ui.Components.j9 j9Var = this.d;
        j9Var.o(contact.contact_id, str, str2, null, null);
        CharSequence charSequence = this.h;
        org.telegram.ui.ActionBar.j5 j5Var = this.f22652b;
        if (charSequence != null) {
            j5Var.l(charSequence, true);
        } else {
            ContactsController.Contact contact2 = this.f22655f;
            j5Var.l(ContactsController.formatName(contact2.first_name, contact2.last_name), false);
        }
        int i10 = org.telegram.ui.ActionBar.i6.f21181y6;
        Integer valueOf = Integer.valueOf(i10);
        org.telegram.ui.ActionBar.j5 j5Var2 = this.f22653c;
        j5Var2.setTag(valueOf);
        j5Var2.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i10, false));
        ContactsController.Contact contact3 = this.f22655f;
        int i11 = contact3.imported;
        if (i11 > 0) {
            j5Var2.l(LocaleController.formatPluralString("TelegramContacts", i11, new Object[0]), false);
        } else {
            j5Var2.l(contact3.phones.get(0), false);
        }
        this.f22651a.setImageDrawable(j9Var);
    }

    public ContactsController.Contact getContact() {
        return this.f22655f;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }
}
