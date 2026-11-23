package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class ld0 extends org.telegram.ui.Components.hu0 {
    public final ImageView f49727a;
    public final hi.e f49728b;
    public final di.h0[] f49729c;
    public Bundle d;
    public String f49730e;
    public boolean f49731f;
    public String h;
    public String f49732n;
    public long f49733r;
    public int f49734s;
    public final de0 f49735w;

    public ld0(de0 de0Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.i6 i6Var;
        org.telegram.ui.ActionBar.i6 i6Var2;
        org.telegram.ui.ActionBar.i6 i6Var3;
        org.telegram.ui.ActionBar.i6 i6Var4;
        this.f49735w = de0Var;
        this.f49729c = r4;
        this.f49734s = -1;
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        setPadding(0, 0, 0, org.telegram.messenger.g0.L(16.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        addView(frameLayout, c8.na.o(-1, 200));
        ki.e eVar = new ki.e(context, 3);
        frameLayout.addView(eVar, c8.na.e(-1, 200, 119));
        ImageView imageView = new ImageView(context);
        this.f49727a = imageView;
        imageView.setImageResource(2131231247);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i7 = org.telegram.ui.ActionBar.n6.G6;
        i6Var = ((org.telegram.ui.ActionBar.g2) de0Var).resourceProvider;
        org.telegram.ui.ActionBar.u6.s(imageView, i7, i6Var, PorterDuff.Mode.SRC_IN);
        int i10 = org.telegram.ui.ActionBar.n6.f29543i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.x0(null, i10, false), 1, -1);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i10);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.u6.j(imageView, h02, null, M, null);
        frameLayout.addView(imageView, c8.na.d(32, 32.0f, 53, 0.0f, 16.0f, -2.0f, 0.0f));
        di.bc bcVar = new di.bc(context, 1, 1, 1);
        bcVar.setStarParticlesView(eVar);
        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i11 = org.telegram.ui.ActionBar.n6.Dk;
        canvas.drawColor(i0.a.f(0.5f, org.telegram.ui.ActionBar.n6.x0(null, i11, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29524h5, false)));
        bcVar.setBackgroundBitmap(createBitmap);
        vg.f fVar = bcVar.f59590b;
        fVar.f59574z = i11;
        fVar.A = org.telegram.ui.ActionBar.n6.Ck;
        fVar.b();
        frameLayout.addView(bcVar, c8.na.e(160, 160, 1));
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.gd.N0(2131745770, null));
        org.telegram.messenger.f3.l(textView, i7, null, 1, 20.0f);
        textView.setGravity(17);
        frameLayout.addView(textView, c8.na.d(-1, -2.0f, 49, 16.0f, 152.0f, 16.0f, 0.0f));
        i6Var2 = ((org.telegram.ui.ActionBar.g2) de0Var).resourceProvider;
        di.h0 h0Var = new di.h0(1, context, i6Var2);
        h0Var.a(2131231837, org.telegram.messenger.gd.N0(2131745784, null), org.telegram.messenger.gd.N0(2131745786, null));
        addView(r4[0], c8.na.t(-1, -2, 55, 0, 0, 0, 6));
        i6Var3 = ((org.telegram.ui.ActionBar.g2) de0Var).resourceProvider;
        di.h0 h0Var2 = new di.h0(1, context, i6Var3);
        h0Var2.a(2131231800, org.telegram.messenger.gd.N0(2131745782, null), org.telegram.messenger.gd.N0(2131745783, null));
        addView(r4[1], c8.na.t(-1, -2, 55, 0, 0, 0, 6));
        i6Var4 = ((org.telegram.ui.ActionBar.g2) de0Var).resourceProvider;
        di.h0 h0Var3 = new di.h0(1, context, i6Var4);
        di.h0[] h0VarArr = {h0Var, h0Var2, h0Var3};
        h0Var3.a(2131231806, org.telegram.messenger.g0.I2(org.telegram.messenger.g0.T2(org.telegram.messenger.gd.N0(2131745777, null), new hd0(this, 1)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)), org.telegram.messenger.gd.N0(2131745781, null));
        addView(h0VarArr[2], c8.na.t(-1, -2, 55, 0, 0, 0, 6));
        addView(new Space(context), c8.na.p(0, 0, 1.0f, 119));
        hi.e g10 = org.telegram.messenger.m10.g(24, context, null, true);
        this.f49728b = g10;
        g10.setLoading(true);
        addView(g10, c8.na.t(-1, 48, 7, 0, 16, 0, 16));
    }

    public static void n(org.telegram.ui.ld0 r11, java.lang.String r12, java.lang.String r13, java.lang.String r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ld0.n(org.telegram.ui.ld0, java.lang.String, java.lang.String, java.lang.String):void");
    }

    @Override
    public final void g() {
        int i7;
        if (this.f49734s >= 0) {
            i7 = ((org.telegram.ui.ActionBar.g2) this.f49735w).currentAccount;
            ConnectionsManager.getInstance(i7).cancelRequest(this.f49734s, true);
            this.f49734s = -1;
        }
        this.f49731f = false;
        this.f49728b.setLoading(false);
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        long j3;
        int i7;
        boolean z11;
        String H;
        String H2;
        this.d = bundle;
        if (bundle == null) {
            string = null;
        } else {
            string = bundle.getString("country");
        }
        String i02 = org.telegram.messenger.gd.i0(2131750504, string);
        if (bundle == null) {
            string2 = null;
        } else {
            string2 = bundle.getString("product");
        }
        if (bundle == null) {
            string3 = null;
        } else {
            string3 = bundle.getString("phoneFormated");
        }
        if (bundle == null) {
            string4 = null;
        } else {
            string4 = bundle.getString("phoneHash");
        }
        if (bundle == null) {
            string5 = null;
        } else {
            string5 = bundle.getString("support_email_email");
        }
        if (bundle == null) {
            string6 = null;
        } else {
            string6 = bundle.getString("support_email_subject");
        }
        if (bundle == null) {
            string7 = null;
        } else {
            string7 = bundle.getString("currency");
        }
        if (bundle == null) {
            j3 = 0;
        } else {
            j3 = bundle.getLong("amount");
        }
        if (bundle == null) {
            i7 = 0;
        } else {
            i7 = bundle.getInt("premium_days");
        }
        boolean isEmpty = TextUtils.isEmpty(i02);
        di.h0[] h0VarArr = this.f49729c;
        if (isEmpty) {
            h0VarArr[0].f8885c.setText(org.telegram.messenger.gd.N0(2131745786, null));
            z11 = false;
        } else {
            z11 = false;
            h0VarArr[0].f8885c.setText(org.telegram.messenger.gd.a0(null, null, 2131745785, i02));
        }
        di.h0 h0Var = h0VarArr[2];
        if (i7 == 7) {
            H = org.telegram.messenger.gd.N0(2131745781, null);
        } else {
            H = org.telegram.messenger.gd.H(',', "SMSFee3TextDays", i7);
        }
        h0Var.setSubtitle(H);
        this.f49727a.setOnClickListener(new bi.s6(this, string5, string6, string3, 15));
        hi.e eVar = this.f49728b;
        eVar.setEnabled(true);
        eVar.setOnClickListener(null);
        if (org.telegram.messenger.s2.b()) {
            if (!TextUtils.isEmpty(string7) && j3 > 0) {
                boolean z12 = z11;
                eVar.setVisibility(z12 ? 1 : 0);
                eVar.setLoading(z12);
                Object[] objArr = new Object[1];
                objArr[z12 ? 1 : 0] = org.telegram.messenger.r1.i().f(j3, string7);
                eVar.i(org.telegram.messenger.gd.a0(null, null, 2131745771, objArr), z12, true);
                if (i7 == 7) {
                    H2 = org.telegram.messenger.gd.N0(2131745775, null);
                } else {
                    H2 = org.telegram.messenger.gd.H(',', "SMSFeePurchaseTextDays", i7);
                }
                eVar.g(H2, z12);
                eVar.setOnClickListener(new di.q0(this, string7, j3, string4, string3, i7));
                return;
            }
            boolean z13 = z11;
            eVar.setVisibility(z13 ? 1 : 0);
            eVar.setLoading(z13);
            eVar.setEnabled(z13);
            eVar.i(org.telegram.messenger.gd.N0(2131743666, null), z13, true);
            return;
        }
        int i10 = z11;
        String str = string4;
        int i11 = i7;
        if (TextUtils.isEmpty(string2)) {
            eVar.setVisibility(8);
            return;
        }
        eVar.setVisibility(i10);
        eVar.setLoading(true);
        ai.d1 d1Var = new ai.d1(this, string2, str, string3, i11, 24);
        if (!org.telegram.messenger.r1.i().k()) {
            org.telegram.messenger.r1.i().f26632i.add(d1Var);
        } else {
            d1Var.run();
        }
    }

    public final void o() {
        int i7;
        if (!this.f49731f) {
            return;
        }
        TLRPC.TL_checkPaidAuth tL_checkPaidAuth = new TLRPC.TL_checkPaidAuth();
        tL_checkPaidAuth.form_id = this.f49733r;
        tL_checkPaidAuth.phone_number = this.h;
        tL_checkPaidAuth.phone_code_hash = this.f49732n;
        i7 = ((org.telegram.ui.ActionBar.g2) this.f49735w).currentAccount;
        this.f49734s = ConnectionsManager.getInstance(i7).sendRequest(tL_checkPaidAuth, new l(this, 14), 1096);
    }
}
