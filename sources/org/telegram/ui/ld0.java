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
public final class ld0 extends org.telegram.ui.Components.iu0 {
    public final ImageView f49593a;
    public final hi.e f49594b;
    public final di.h0[] f49595c;
    public Bundle d;
    public String f49596e;
    public boolean f49597f;
    public String h;
    public String f49598n;
    public long f49599r;
    public int f49600s;
    public final de0 f49601w;

    public ld0(de0 de0Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.h6 h6Var;
        org.telegram.ui.ActionBar.h6 h6Var2;
        org.telegram.ui.ActionBar.h6 h6Var3;
        org.telegram.ui.ActionBar.h6 h6Var4;
        this.f49601w = de0Var;
        this.f49595c = r4;
        this.f49600s = -1;
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        setPadding(0, 0, 0, org.telegram.messenger.g0.L(16.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        addView(frameLayout, c8.ma.o(-1, 200));
        ki.e eVar = new ki.e(context, 3);
        frameLayout.addView(eVar, c8.ma.e(-1, 200, 119));
        ImageView imageView = new ImageView(context);
        this.f49593a = imageView;
        imageView.setImageResource(2131231244);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i7 = org.telegram.ui.ActionBar.m6.G6;
        h6Var = ((org.telegram.ui.ActionBar.g2) de0Var).resourceProvider;
        org.telegram.ui.ActionBar.t6.s(imageView, i7, h6Var, PorterDuff.Mode.SRC_IN);
        int i10 = org.telegram.ui.ActionBar.m6.f29473i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.x0(null, i10, false), 1, -1);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i10);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.t6.j(imageView, h02, null, M, null);
        frameLayout.addView(imageView, c8.ma.d(32, 32.0f, 53, 0.0f, 16.0f, -2.0f, 0.0f));
        di.bc bcVar = new di.bc(context, 1, 1, 1);
        bcVar.setStarParticlesView(eVar);
        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i11 = org.telegram.ui.ActionBar.m6.Dk;
        canvas.drawColor(i0.a.f(0.5f, org.telegram.ui.ActionBar.m6.x0(null, i11, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29454h5, false)));
        bcVar.setBackgroundBitmap(createBitmap);
        vg.f fVar = bcVar.f59505b;
        fVar.f59489z = i11;
        fVar.A = org.telegram.ui.ActionBar.m6.Ck;
        fVar.b();
        frameLayout.addView(bcVar, c8.ma.e(160, 160, 1));
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.hd.N0(2131745770, null));
        org.telegram.messenger.f3.l(textView, i7, null, 1, 20.0f);
        textView.setGravity(17);
        frameLayout.addView(textView, c8.ma.d(-1, -2.0f, 49, 16.0f, 152.0f, 16.0f, 0.0f));
        h6Var2 = ((org.telegram.ui.ActionBar.g2) de0Var).resourceProvider;
        di.h0 h0Var = new di.h0(1, context, h6Var2);
        h0Var.a(2131231834, org.telegram.messenger.hd.N0(2131745784, null), org.telegram.messenger.hd.N0(2131745786, null));
        addView(r4[0], c8.ma.t(-1, -2, 55, 0, 0, 0, 6));
        h6Var3 = ((org.telegram.ui.ActionBar.g2) de0Var).resourceProvider;
        di.h0 h0Var2 = new di.h0(1, context, h6Var3);
        h0Var2.a(2131231797, org.telegram.messenger.hd.N0(2131745782, null), org.telegram.messenger.hd.N0(2131745783, null));
        addView(r4[1], c8.ma.t(-1, -2, 55, 0, 0, 0, 6));
        h6Var4 = ((org.telegram.ui.ActionBar.g2) de0Var).resourceProvider;
        di.h0 h0Var3 = new di.h0(1, context, h6Var4);
        di.h0[] h0VarArr = {h0Var, h0Var2, h0Var3};
        h0Var3.a(2131231803, org.telegram.messenger.g0.I2(org.telegram.messenger.g0.T2(org.telegram.messenger.hd.N0(2131745777, null), new hd0(this, 1)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)), org.telegram.messenger.hd.N0(2131745781, null));
        addView(h0VarArr[2], c8.ma.t(-1, -2, 55, 0, 0, 0, 6));
        addView(new Space(context), c8.ma.p(0, 0, 1.0f, 119));
        hi.e g10 = org.telegram.messenger.o10.g(24, context, null, true);
        this.f49594b = g10;
        g10.setLoading(true);
        addView(g10, c8.ma.t(-1, 48, 7, 0, 16, 0, 16));
    }

    public static void n(org.telegram.ui.ld0 r11, java.lang.String r12, java.lang.String r13, java.lang.String r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ld0.n(org.telegram.ui.ld0, java.lang.String, java.lang.String, java.lang.String):void");
    }

    @Override
    public final void g() {
        int i7;
        if (this.f49600s >= 0) {
            i7 = ((org.telegram.ui.ActionBar.g2) this.f49601w).currentAccount;
            ConnectionsManager.getInstance(i7).cancelRequest(this.f49600s, true);
            this.f49600s = -1;
        }
        this.f49597f = false;
        this.f49594b.setLoading(false);
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
        String i02 = org.telegram.messenger.hd.i0(2131750504, string);
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
        di.h0[] h0VarArr = this.f49595c;
        if (isEmpty) {
            h0VarArr[0].f8924c.setText(org.telegram.messenger.hd.N0(2131745786, null));
            z11 = false;
        } else {
            z11 = false;
            h0VarArr[0].f8924c.setText(org.telegram.messenger.hd.a0(null, null, 2131745785, i02));
        }
        di.h0 h0Var = h0VarArr[2];
        if (i7 == 7) {
            H = org.telegram.messenger.hd.N0(2131745781, null);
        } else {
            H = org.telegram.messenger.hd.H(',', "SMSFee3TextDays", i7);
        }
        h0Var.setSubtitle(H);
        this.f49593a.setOnClickListener(new bi.p6(this, string5, string6, string3, 15));
        hi.e eVar = this.f49594b;
        eVar.setEnabled(true);
        eVar.setOnClickListener(null);
        if (org.telegram.messenger.s2.b()) {
            if (!TextUtils.isEmpty(string7) && j3 > 0) {
                boolean z12 = z11;
                eVar.setVisibility(z12 ? 1 : 0);
                eVar.setLoading(z12);
                Object[] objArr = new Object[1];
                objArr[z12 ? 1 : 0] = org.telegram.messenger.r1.i().f(j3, string7);
                eVar.i(org.telegram.messenger.hd.a0(null, null, 2131745771, objArr), z12, true);
                if (i7 == 7) {
                    H2 = org.telegram.messenger.hd.N0(2131745775, null);
                } else {
                    H2 = org.telegram.messenger.hd.H(',', "SMSFeePurchaseTextDays", i7);
                }
                eVar.g(H2, z12);
                eVar.setOnClickListener(new di.q0(this, string7, j3, string4, string3, i7));
                return;
            }
            boolean z13 = z11;
            eVar.setVisibility(z13 ? 1 : 0);
            eVar.setLoading(z13);
            eVar.setEnabled(z13);
            eVar.i(org.telegram.messenger.hd.N0(2131743668, null), z13, true);
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
        ai.i1 i1Var = new ai.i1(this, string2, str, string3, i11, 24);
        if (!org.telegram.messenger.r1.i().k()) {
            org.telegram.messenger.r1.i().f26556i.add(i1Var);
        } else {
            i1Var.run();
        }
    }

    public final void o() {
        int i7;
        if (!this.f49597f) {
            return;
        }
        TLRPC.TL_checkPaidAuth tL_checkPaidAuth = new TLRPC.TL_checkPaidAuth();
        tL_checkPaidAuth.form_id = this.f49599r;
        tL_checkPaidAuth.phone_number = this.h;
        tL_checkPaidAuth.phone_code_hash = this.f49598n;
        i7 = ((org.telegram.ui.ActionBar.g2) this.f49601w).currentAccount;
        this.f49600s = ConnectionsManager.getInstance(i7).sendRequest(tL_checkPaidAuth, new l(this, 14), 1096);
    }
}
