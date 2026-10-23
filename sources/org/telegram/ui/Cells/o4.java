package org.telegram.ui.Cells;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.Components.xp;
public final class o4 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.Components.w9 f22838a;
    public final org.telegram.ui.ActionBar.n5 f22839b;
    public final org.telegram.ui.ActionBar.n5 f22840c;
    public final org.telegram.ui.Components.h9 d;
    public final xp e;
    public ContactsController.Contact f22841f;
    public CharSequence h;
    public int f22842n;

    public o4(Context context, boolean z10) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f7;
        this.d = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.g6) null);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.f22838a = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(23.0f));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(w9Var, w7.z5.d(46, 46.0f, i10 | 48, 13.0f, 6.0f, 13.0f, 6.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 72;
        }
        addView(linearLayout, w7.z5.d(-1, -1.0f, 119, i11, 0.0f, z11 ? 72 : 0, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        linearLayout.addView(frameLayout, w7.z5.l(1.0f, 0, 58));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.f22839b = n5Var;
        org.telegram.ui.ActionBar.r6.Z(n5Var, org.telegram.ui.ActionBar.k6.G6, null);
        n5Var.setTypeface(AndroidUtilities.bold());
        n5Var.setTextSize(15);
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        n5Var.setGravity(i12 | 48);
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        frameLayout.addView(n5Var, w7.z5.d(-1, 20.0f, i13 | 48, 0.0f, 9.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.n5 n5Var2 = new org.telegram.ui.ActionBar.n5(context);
        this.f22840c = n5Var2;
        n5Var2.setTextSize(13);
        if (LocaleController.isRTL) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        n5Var2.setGravity(i14 | 48);
        if (LocaleController.isRTL) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        frameLayout.addView(n5Var2, w7.z5.d(-1, 20.0f, i15 | 48, 0.0f, 33.0f, 0.0f, 0.0f));
        if (z10) {
            xp xpVar = new xp(context, 21, null);
            this.e = xpVar;
            xpVar.b(-1, org.telegram.ui.ActionBar.k6.f21183d6, org.telegram.ui.ActionBar.k6.f21311k7);
            xpVar.setDrawUnchecked(false);
            xpVar.setDrawBackgroundAsArc(3);
            boolean z12 = LocaleController.isRTL;
            int i16 = (z12 ? 5 : 3) | 48;
            if (z12) {
                f7 = 0.0f;
            } else {
                f7 = 40.0f;
            }
            addView(xpVar, w7.z5.d(24, 24.0f, i16, f7, 32.0f, z12 ? 39.0f : 0.0f, 0.0f));
            return;
        }
        this.e = null;
        xi0 xi0Var = new xi0(context);
        xi0Var.setText(LocaleController.getString(R.string.Invite));
        xi0Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.W(xi0Var, org.telegram.ui.ActionBar.k6.Sh, null);
        xi0Var.setProgressColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Nh, false));
        int i17 = org.telegram.ui.ActionBar.k6.hl;
        y e = org.telegram.ui.ActionBar.a6.e(new float[]{16.0f}, org.telegram.ui.ActionBar.k6.x0(null, i17, false));
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i17);
        org.telegram.ui.ActionBar.n6 f10 = org.telegram.ui.ActionBar.r6.f(i17);
        xi0Var.setBackground(e);
        org.telegram.ui.ActionBar.r6.k(xi0Var, e, O, f10, null);
        xi0Var.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        linearLayout.addView(xi0Var, w7.z5.p(-2, 28, 0.0f, 16, 18, 0, 18, 0));
        xi0Var.setOnClickListener(new a(this, 6));
    }

    public final void a(ContactsController.Contact contact, CharSequence charSequence) {
        this.f22841f = contact;
        this.h = charSequence;
        if (contact == null) {
            return;
        }
        String str = contact.first_name;
        String str2 = contact.last_name;
        org.telegram.ui.Components.h9 h9Var = this.d;
        h9Var.o(contact.contact_id, str, str2, null, null);
        CharSequence charSequence2 = this.h;
        org.telegram.ui.ActionBar.n5 n5Var = this.f22839b;
        if (charSequence2 != null) {
            n5Var.l(charSequence2, true);
        } else {
            ContactsController.Contact contact2 = this.f22841f;
            n5Var.l(ContactsController.formatName(contact2.first_name, contact2.last_name), false);
        }
        int i10 = org.telegram.ui.ActionBar.k6.f21571y6;
        Integer valueOf = Integer.valueOf(i10);
        org.telegram.ui.ActionBar.n5 n5Var2 = this.f22840c;
        n5Var2.setTag(valueOf);
        org.telegram.ui.ActionBar.r6.Z(n5Var2, i10, null);
        ContactsController.Contact contact3 = this.f22841f;
        int i11 = contact3.imported;
        if (i11 > 0) {
            n5Var2.l(LocaleController.formatPluralString("TelegramContacts", i11, new Object[0]), false);
        } else {
            n5Var2.l(contact3.phones.get(0), false);
        }
        this.f22838a.setImageDrawable(h9Var);
    }

    public ContactsController.Contact getContact() {
        return this.f22841f;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void updateColors() {
        try {
            int x02 = (((((((((((((org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.J7, false) * 31) + org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.O7, false)) * 31) + org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.P7, false)) * 31) + org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Q7, false)) * 31) + org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.R7, false)) * 31) + org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.S7, false)) * 31) + org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.T7, false)) * 31) + org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.U7, false);
            if (x02 != this.f22842n) {
                this.f22842n = x02;
                org.telegram.ui.Components.w9 w9Var = this.f22838a;
                if (w9Var != null) {
                    w9Var.invalidate();
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
