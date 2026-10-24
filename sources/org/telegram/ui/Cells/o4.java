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
import org.telegram.ui.Components.vp;
import org.telegram.ui.Components.wi0;
public final class o4 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.Components.u9 f22839a;
    public final org.telegram.ui.ActionBar.n5 f22840b;
    public final org.telegram.ui.ActionBar.n5 f22841c;
    public final org.telegram.ui.Components.f9 d;
    public final vp e;
    public ContactsController.Contact f22842f;
    public CharSequence h;
    public int f22843n;

    public o4(Context context, boolean z10) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f7;
        this.d = new org.telegram.ui.Components.f9((org.telegram.ui.ActionBar.g6) null);
        org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(context);
        this.f22839a = u9Var;
        u9Var.setRoundRadius(AndroidUtilities.dp(23.0f));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(u9Var, w7.z5.d(46, 46.0f, i10 | 48, 13.0f, 6.0f, 13.0f, 6.0f));
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
        this.f22840b = n5Var;
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
        this.f22841c = n5Var2;
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
            vp vpVar = new vp(context, 21, null);
            this.e = vpVar;
            vpVar.b(-1, org.telegram.ui.ActionBar.k6.f21184d6, org.telegram.ui.ActionBar.k6.f21312k7);
            vpVar.setDrawUnchecked(false);
            vpVar.setDrawBackgroundAsArc(3);
            boolean z12 = LocaleController.isRTL;
            int i16 = (z12 ? 5 : 3) | 48;
            if (z12) {
                f7 = 0.0f;
            } else {
                f7 = 40.0f;
            }
            addView(vpVar, w7.z5.d(24, 24.0f, i16, f7, 32.0f, z12 ? 39.0f : 0.0f, 0.0f));
            return;
        }
        this.e = null;
        wi0 wi0Var = new wi0(context);
        wi0Var.setText(LocaleController.getString(R.string.Invite));
        wi0Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.W(wi0Var, org.telegram.ui.ActionBar.k6.Sh, null);
        wi0Var.setProgressColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Nh, false));
        int i17 = org.telegram.ui.ActionBar.k6.hl;
        y e = org.telegram.ui.ActionBar.a6.e(new float[]{16.0f}, org.telegram.ui.ActionBar.k6.x0(null, i17, false));
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i17);
        org.telegram.ui.ActionBar.n6 f10 = org.telegram.ui.ActionBar.r6.f(i17);
        wi0Var.setBackground(e);
        org.telegram.ui.ActionBar.r6.k(wi0Var, e, O, f10, null);
        wi0Var.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        linearLayout.addView(wi0Var, w7.z5.p(-2, 28, 0.0f, 16, 18, 0, 18, 0));
        wi0Var.setOnClickListener(new a(this, 6));
    }

    public final void a(ContactsController.Contact contact, CharSequence charSequence) {
        this.f22842f = contact;
        this.h = charSequence;
        if (contact == null) {
            return;
        }
        String str = contact.first_name;
        String str2 = contact.last_name;
        org.telegram.ui.Components.f9 f9Var = this.d;
        f9Var.o(contact.contact_id, str, str2, null, null);
        CharSequence charSequence2 = this.h;
        org.telegram.ui.ActionBar.n5 n5Var = this.f22840b;
        if (charSequence2 != null) {
            n5Var.l(charSequence2, true);
        } else {
            ContactsController.Contact contact2 = this.f22842f;
            n5Var.l(ContactsController.formatName(contact2.first_name, contact2.last_name), false);
        }
        int i10 = org.telegram.ui.ActionBar.k6.f21572y6;
        Integer valueOf = Integer.valueOf(i10);
        org.telegram.ui.ActionBar.n5 n5Var2 = this.f22841c;
        n5Var2.setTag(valueOf);
        org.telegram.ui.ActionBar.r6.Z(n5Var2, i10, null);
        ContactsController.Contact contact3 = this.f22842f;
        int i11 = contact3.imported;
        if (i11 > 0) {
            n5Var2.l(LocaleController.formatPluralString("TelegramContacts", i11, new Object[0]), false);
        } else {
            n5Var2.l(contact3.phones.get(0), false);
        }
        this.f22839a.setImageDrawable(f9Var);
    }

    public ContactsController.Contact getContact() {
        return this.f22842f;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void updateColors() {
        try {
            int x02 = (((((((((((((org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.J7, false) * 31) + org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.O7, false)) * 31) + org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.P7, false)) * 31) + org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Q7, false)) * 31) + org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.R7, false)) * 31) + org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.S7, false)) * 31) + org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.T7, false)) * 31) + org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.U7, false);
            if (x02 != this.f22843n) {
                this.f22843n = x02;
                org.telegram.ui.Components.u9 u9Var = this.f22839a;
                if (u9Var != null) {
                    u9Var.invalidate();
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
