package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
public class bi extends org.telegram.ui.ActionBar.z2 implements org.telegram.messenger.us, org.telegram.ui.ActionBar.t2, fe.e {
    public static final int E4 = 0;
    public org.telegram.messenger.j20 A1;
    public final int[] A2;
    public int A3;
    public final hi.c A4;
    public int B1;
    public final ah B2;
    public org.telegram.messenger.jj B3;
    public final tg.b B4;
    public int C1;
    public final ih C2;
    public boolean C3;
    public final tg.b C4;
    public boolean D1;
    public final TextPaint D2;
    public final int D3;
    public final qg D4;
    public boolean E1;
    public final RectF E2;
    public boolean E3;
    public boolean F1;
    public final Paint F2;
    public boolean F3;
    public boolean G1;
    public AnimatorSet G2;
    public boolean G3;
    public z30 H1;
    public long H2;
    public boolean H3;
    public boolean I1;
    public final fg.i I2;
    public boolean I3;
    public final zc0 J1;
    public final fh J2;
    public boolean J3;
    public kn K1;
    public int K2;
    public boolean K3;
    public b40 L1;
    public ct L2;
    public boolean L3;
    public boolean M1;
    public boolean M2;
    public int M3;
    public boolean N1;
    public boolean N2;
    public boolean N3;
    public nj O1;
    public boolean O2;
    public boolean O3;
    public ji P1;
    public final float P2;
    public float P3;
    public long Q1;
    public long Q2;
    public float Q3;
    public boolean R1;
    public final kg.g1 R2;
    public ValueAnimator R3;
    public final tg.c S1;
    public AnimatorSet S2;
    public int S3;
    public boolean T1;
    public AnimatorSet T2;
    public ai T3;
    public float U1;
    public final org.telegram.ui.ActionBar.t0 U2;
    public wm U3;
    public final mh V1;
    public final ob0 V2;
    public final int[] V3;
    public final org.telegram.ui.ActionBar.k2 W1;
    public final org.telegram.ui.ActionBar.t0 W2;
    public int W3;
    public final boolean X1;
    public vh.p2 X2;
    public float X3;
    public pe Y1;
    public final org.telegram.ui.ActionBar.t0 Y2;
    public float Y3;
    public boolean Z1;
    public final bi.j6 Z2;
    public boolean Z3;
    public final ChatAttachAlertPhotoLayout a2;
    public float f24659a3;
    public float f24660a4;
    public ej f24661b2;
    public float f24662b3;
    public final boolean f24663b4;
    public mi f24664c2;
    public final ah f24665c3;
    public boolean f24666c4;
    public jn f24667d2;
    public final TextView f24668d3;
    public final ArrayList f24669d4;
    public jn f24670e2;
    public final org.telegram.ui.ActionBar.t0 f24671e3;
    public final Rect f24672e4;
    public bl f24673f2;
    public final LinearLayout f24674f3;
    public float f24675f4;
    public xj f24676g2;
    public final ImageView f24677g3;
    public boolean f24678g4;
    public jm f24679h2;
    public final LinearLayout f24680h3;
    public int f24681h4;
    public final fe.b f24682i1;
    public qi f24683i2;
    public final TextView f24684i3;
    public final mh f24685i4;
    public final fe.b f24686j1;
    public ag.h1 f24687j2;
    public float f24688j3;
    public o1.j f24689j4;
    public final fe.b f24690k1;
    public yj f24691k2;
    public boolean f24692k3;
    public AnimatorSet f24693k4;
    public final fe.b l1;
    public yj f24694l2;
    public final ph f24695l3;
    public int l4;
    public final fe.b f24696m1;
    public bi.t f24697m2;
    public boolean f24698m3;
    public int f24699m4;
    public final fe.b f24700n1;
    public kk f24701n2;
    public Object f24702n3;
    public boolean f24703n4;
    public final fe.m f24704o1;
    public boolean f24705o2;
    public boolean f24706o3;
    public boolean f24707o4;
    public org.telegram.ui.sn f24708p1;
    public float f24709p2;
    public final bh.i f24710p3;
    public boolean f24711p4;
    public final f6 f24712q1;
    public final uh[] f24713q2;
    public final ch f24714q3;
    public wk f24715q4;
    public final f6 f24716r1;
    public final LongSparseArray f24717r2;
    public final ah f24718r3;
    public boolean f24719r4;
    public final ImageView f24720s1;
    public uh f24721s2;
    public final bh f24722s3;
    public boolean f24723s4;
    public final org.telegram.ui.ActionBar.y2 f24724t1;
    public uh f24725t2;
    public final s4.a0 f24726t3;
    public File f24727t4;
    public final ImageView f24728u1;
    public final vg.f f24729u2;
    public final zh f24730u3;
    public double[] f24731u4;
    public final org.telegram.ui.ActionBar.y2 f24732v1;
    public final vg.f f24733v2;
    public boolean f24734v3;
    public boolean f24735v4;
    public boolean f24736w1;
    public final ag.q f24737w2;
    public final RadialProgressView f24738w3;
    public boolean f24739w4;
    public boolean f24740x1;
    public final ah f24741x2;
    public boolean f24742x3;
    public boolean f24743x4;
    public boolean f24744y1;
    public final dh f24745y2;
    public final f6 y3;
    public oh f24746y4;
    public int f24747z1;
    public final ImageView f24748z2;
    public float f24749z3;
    public final tg.f f24750z4;

    public bi(Context context, org.telegram.ui.ActionBar.k2 k2Var, boolean z10, boolean z11, boolean z12, final org.telegram.ui.ActionBar.p6 p6Var) {
        super(1, context, p6Var, false);
        org.telegram.ui.ActionBar.t0 t0Var;
        bi.j6 j6Var;
        boolean z13;
        char c10;
        float f7;
        gr grVar = gr.h;
        this.f24682i1 = new fe.b(0, this, grVar, 380L, false);
        this.f24686j1 = new fe.b(1, this, grVar, 380L, false);
        this.f24690k1 = new fe.b(2, this, grVar, 380L, false);
        this.l1 = new fe.b(3, this, grVar, 380L, false);
        this.f24696m1 = new fe.b(4, this, grVar, 380L, true);
        this.f24700n1 = new fe.b(5, this, grVar, 320L, false);
        fe.m mVar = new fe.m(new ig(this, 2), grVar, 380L);
        this.f24704o1 = mVar;
        this.D1 = false;
        this.E1 = false;
        this.F1 = false;
        this.G1 = false;
        this.U1 = 0.0f;
        this.V1 = new mh(this, 0);
        this.Z1 = false;
        uh[] uhVarArr = new uh[12];
        this.f24713q2 = uhVarArr;
        this.f24717r2 = new LongSparseArray();
        this.A2 = new int[2];
        TextPaint textPaint = new TextPaint(1);
        this.D2 = textPaint;
        this.E2 = new RectF();
        this.F2 = new Paint(1);
        this.O2 = true;
        this.P2 = 1.0f;
        this.f24734v3 = false;
        this.f24742x3 = false;
        int i10 = org.telegram.messenger.d20.f15147s0;
        this.D3 = i10;
        this.E3 = true;
        this.F3 = true;
        this.G3 = true;
        this.H3 = true;
        this.I3 = true;
        this.J3 = true;
        this.K3 = true;
        this.M3 = -1;
        this.N3 = true;
        this.S3 = org.telegram.messenger.i0.L(85.0f);
        new DecelerateInterpolator();
        this.V3 = new int[2];
        new Paint(1);
        this.f24666c4 = false;
        ArrayList arrayList = new ArrayList();
        this.f24669d4 = arrayList;
        Rect rect = new Rect();
        this.f24672e4 = rect;
        this.f24685i4 = new mh(this, 1);
        this.f24707o4 = true;
        this.f24711p4 = false;
        this.f24739w4 = false;
        this.f24743x4 = false;
        this.f21622y = true;
        hi.c cVar = new hi.c();
        this.A4 = cVar;
        cVar.a(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20929d6, this.I0));
        this.X0.E.add(new ei.p(cVar, new ig(this, 4)));
        if (Build.VERSION.SDK_INT >= 31 && org.telegram.messenger.tz.f()) {
            tg.f fVar = new tg.f(false);
            this.f24750z4 = fVar;
            this.X0.a(fVar);
            hi.f fVar2 = new hi.f(cVar);
            fVar2.f7719f = cVar;
            fVar2.d = fVar;
            fVar2.e = -2;
            hi.f fVar3 = new hi.f(null);
            fVar3.f7719f = cVar;
            fVar3.d = fVar;
            fVar3.e = -3;
            tg.b bVar = new tg.b(fVar2);
            this.B4 = bVar;
            bVar.f48702i = true;
            int L = org.telegram.messenger.sc.e(262144) ? org.telegram.messenger.i0.L(8.0f) : org.telegram.messenger.i0.L(48.0f);
            bVar.f48698b = L;
            bVar.f48699c = L;
            tg.b bVar2 = new tg.b(fVar3);
            this.C4 = bVar2;
            bVar2.f48702i = true;
            int L2 = org.telegram.messenger.i0.L(48.0f);
            bVar2.f48698b = L2;
            bVar2.f48699c = L2;
        } else {
            this.f24750z4 = null;
            this.B4 = new tg.b(cVar);
            this.C4 = new tg.b(cVar);
        }
        tg.b bVar3 = new tg.b(cVar);
        this.D4 = new qg(this, 0);
        this.f24663b4 = z10;
        this.X1 = (k2Var instanceof org.telegram.ui.un) && k2Var.isInBubbleMode();
        this.f21604k0 = new OvershootInterpolator(0.7f);
        this.W1 = k2Var;
        this.F = true;
        this.f21623y0 = this;
        org.telegram.messenger.zs.f(i10).c(this, org.telegram.messenger.zs.T0);
        org.telegram.messenger.zs.f(i10).c(this, org.telegram.messenger.zs.W4);
        org.telegram.messenger.zs.f(i10).c(this, org.telegram.messenger.zs.f19613f5);
        org.telegram.messenger.zs.f(i10).c(this, org.telegram.messenger.zs.F1);
        arrayList.add(rect);
        ph phVar = new ph(this, context);
        this.f24695l3 = phVar;
        phVar.setDelegate(new qh(this));
        this.f21586b = phVar;
        phVar.setWillNotDraw(false);
        this.f21586b.setClipChildren(false);
        this.f21586b.setClipToPadding(false);
        ViewGroup viewGroup = this.f21586b;
        int i11 = this.f21615t0;
        viewGroup.setPadding(i11, 0, i11, 0);
        kg.g1 g1Var = new kg.g1(this, context, p6Var, 2);
        this.R2 = g1Var;
        g1Var.f20473b1 = true;
        g1Var.setForcedMenuWidth(org.telegram.messenger.i0.L(46.0f));
        g1Var.setBackButtonDrawable(new org.telegram.ui.ActionBar.c2(false));
        int i12 = org.telegram.ui.ActionBar.t6.f21037j5;
        org.telegram.ui.ActionBar.a7.m(g1Var, 1, i12, p6Var);
        int i13 = org.telegram.ui.ActionBar.t6.I5;
        org.telegram.ui.ActionBar.a7.m(g1Var, 3, i13, p6Var);
        org.telegram.ui.ActionBar.a7.m(g1Var, 5, i12, p6Var);
        g1Var.setOccupyStatusBar(true);
        g1Var.setAlpha(0.0f);
        g1Var.setActionBarMenuOnItemClick(new org.telegram.ui.ar(this, 3));
        org.telegram.ui.ActionBar.t0 t0Var2 = new org.telegram.ui.ActionBar.t0(context, null, 0, org.telegram.ui.ActionBar.t6.w0(i12, this.I0), false, p6Var);
        this.U2 = t0Var2;
        t0Var2.setLongClickEnabled(false);
        t0Var2.setIcon(2131231245);
        t0Var2.setContentDescription(org.telegram.messenger.cd.L0(2131754839, null));
        t0Var2.setVisibility(4);
        t0Var2.setAlpha(0.0f);
        t0Var2.setScaleX(0.6f);
        t0Var2.setScaleY(0.6f);
        t0Var2.setSubMenuOpenSide(2);
        t0Var2.setDelegate(new ig(this, 10));
        t0Var2.setAdditionalYOffset(org.telegram.messenger.i0.L(72.0f));
        t0Var2.setTranslationX(org.telegram.messenger.i0.L(1.0f));
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i13, this.I0), 6, -1);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i13);
        t0Var2.setBackground(h02);
        org.telegram.ui.ActionBar.a7.k(t0Var2, h02, null, N, p6Var);
        t0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final bi f28789b;

            {
                this.f28789b = this;
            }

            @Override
            public final void onClick(View view) {
                xh.i3 i3Var;
                int i14;
                boolean z14 = false;
                switch (r2) {
                    case 0:
                        bi biVar = this.f28789b;
                        if (biVar.f24721s2 != biVar.f24679h2) {
                            z14 = true;
                        }
                        biVar.N1(z14);
                        return;
                    case 1:
                        bi biVar2 = this.f28789b;
                        long j10 = biVar2.Q2;
                        if (j10 < 0 && (i3Var = (xh.i3) biVar2.f24717r2.get(-j10)) != null) {
                            org.telegram.ui.web.z0 webViewContainer = i3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.x("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        bi biVar3 = this.f28789b;
                        boolean z15 = biVar3.T1;
                        if (!z15) {
                            biVar3.u1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        bi biVar4 = this.f28789b;
                        boolean z16 = biVar4.T1;
                        if (z16) {
                            biVar4.u1(!z16, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f28789b.m1();
                        return;
                    case 5:
                        this.f28789b.U2.U(null, null);
                        return;
                    case 6:
                        bi biVar5 = this.f28789b;
                        if (biVar5.a2 != null) {
                            boolean T = ChatAttachAlertPhotoLayout.T();
                            boolean z17 = !T;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = biVar5.a2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.f23847s1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ef) {
                                        org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) entry.getValue();
                                        if (efVar.d()) {
                                            efVar.O = Boolean.valueOf(T);
                                            for (int i15 = 0; i15 < chatAttachAlertPhotoLayout.E.getChildCount(); i15++) {
                                                View childAt = chatAttachAlertPhotoLayout.E.getChildAt(i15);
                                                if (childAt instanceof org.telegram.ui.Cells.v5) {
                                                    org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) childAt;
                                                    if (v5Var.getPhotoEntry() == efVar) {
                                                        v5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.w0.f19025b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.tz.f18154i1 = z17;
                                edit.putBoolean("photoLiveDefault", z17).apply();
                                chatAttachAlertPhotoLayout.w0();
                            }
                            biVar5.M1(true);
                            org.telegram.ui.ActionBar.t0 t0Var3 = biVar5.W2;
                            vh.p2 p2Var = biVar5.X2;
                            if (p2Var != null) {
                                p2Var.e(true);
                            }
                            vh.p2 p2Var2 = new vh.p2(biVar5.getContext(), 1);
                            biVar5.X2 = p2Var2;
                            if (!T) {
                                i14 = 2131748842;
                            } else {
                                i14 = 2131748843;
                            }
                            p2Var2.s(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(i14, null)));
                            biVar5.X2.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
                            biVar5.X2.m(1.0f, -((biVar5.f21586b.getWidth() - ((t0Var3.getWidth() / 2.0f) + t0Var3.getX())) - org.telegram.messenger.i0.L(14.0f)));
                            biVar5.X2.setTranslationY(biVar5.U2.getTranslationY());
                            vh.p2 p2Var3 = biVar5.X2;
                            p2Var3.f51740l0 = new cd(5, biVar5, p2Var2);
                            biVar5.f21586b.addView(p2Var3, w7.b6.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            biVar5.X2.u();
                            return;
                        }
                        return;
                    case 7:
                        uh uhVar = this.f28789b.f24721s2;
                        if (uhVar != null) {
                            uhVar.w(40);
                            return;
                        }
                        return;
                    default:
                        this.f28789b.f24671e3.U(null, null);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.t0 t0Var3 = new org.telegram.ui.ActionBar.t0(context, null, 0, org.telegram.ui.ActionBar.t6.w0(i12, this.I0), false, p6Var);
        this.W2 = t0Var3;
        t0Var3.setLongClickEnabled(false);
        ob0 ob0Var = new ob0();
        this.V2 = ob0Var;
        t0Var3.setIcon(ob0Var);
        t0Var3.setContentDescription(org.telegram.messenger.cd.L0(2131754839, null));
        t0Var3.setVisibility(8);
        t0Var3.setAlpha(0.0f);
        t0Var3.setScaleX(0.6f);
        t0Var3.setScaleY(0.6f);
        t0Var3.setAdditionalYOffset(org.telegram.messenger.i0.L(72.0f));
        t0Var3.setTranslationX(-org.telegram.messenger.i0.L(3.0f));
        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i13, this.I0), 6, -1);
        org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i13);
        t0Var3.setBackground(h03);
        org.telegram.ui.ActionBar.a7.k(t0Var3, h03, null, N2, p6Var);
        t0Var3.setOnClickListener(new View.OnClickListener(this) {
            public final bi f28789b;

            {
                this.f28789b = this;
            }

            @Override
            public final void onClick(View view) {
                xh.i3 i3Var;
                int i14;
                boolean z14 = false;
                switch (r2) {
                    case 0:
                        bi biVar = this.f28789b;
                        if (biVar.f24721s2 != biVar.f24679h2) {
                            z14 = true;
                        }
                        biVar.N1(z14);
                        return;
                    case 1:
                        bi biVar2 = this.f28789b;
                        long j10 = biVar2.Q2;
                        if (j10 < 0 && (i3Var = (xh.i3) biVar2.f24717r2.get(-j10)) != null) {
                            org.telegram.ui.web.z0 webViewContainer = i3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.x("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        bi biVar3 = this.f28789b;
                        boolean z15 = biVar3.T1;
                        if (!z15) {
                            biVar3.u1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        bi biVar4 = this.f28789b;
                        boolean z16 = biVar4.T1;
                        if (z16) {
                            biVar4.u1(!z16, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f28789b.m1();
                        return;
                    case 5:
                        this.f28789b.U2.U(null, null);
                        return;
                    case 6:
                        bi biVar5 = this.f28789b;
                        if (biVar5.a2 != null) {
                            boolean T = ChatAttachAlertPhotoLayout.T();
                            boolean z17 = !T;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = biVar5.a2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.f23847s1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ef) {
                                        org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) entry.getValue();
                                        if (efVar.d()) {
                                            efVar.O = Boolean.valueOf(T);
                                            for (int i15 = 0; i15 < chatAttachAlertPhotoLayout.E.getChildCount(); i15++) {
                                                View childAt = chatAttachAlertPhotoLayout.E.getChildAt(i15);
                                                if (childAt instanceof org.telegram.ui.Cells.v5) {
                                                    org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) childAt;
                                                    if (v5Var.getPhotoEntry() == efVar) {
                                                        v5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.w0.f19025b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.tz.f18154i1 = z17;
                                edit.putBoolean("photoLiveDefault", z17).apply();
                                chatAttachAlertPhotoLayout.w0();
                            }
                            biVar5.M1(true);
                            org.telegram.ui.ActionBar.t0 t0Var32 = biVar5.W2;
                            vh.p2 p2Var = biVar5.X2;
                            if (p2Var != null) {
                                p2Var.e(true);
                            }
                            vh.p2 p2Var2 = new vh.p2(biVar5.getContext(), 1);
                            biVar5.X2 = p2Var2;
                            if (!T) {
                                i14 = 2131748842;
                            } else {
                                i14 = 2131748843;
                            }
                            p2Var2.s(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(i14, null)));
                            biVar5.X2.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
                            biVar5.X2.m(1.0f, -((biVar5.f21586b.getWidth() - ((t0Var32.getWidth() / 2.0f) + t0Var32.getX())) - org.telegram.messenger.i0.L(14.0f)));
                            biVar5.X2.setTranslationY(biVar5.U2.getTranslationY());
                            vh.p2 p2Var3 = biVar5.X2;
                            p2Var3.f51740l0 = new cd(5, biVar5, p2Var2);
                            biVar5.f21586b.addView(p2Var3, w7.b6.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            biVar5.X2.u();
                            return;
                        }
                        return;
                    case 7:
                        uh uhVar = this.f28789b.f24721s2;
                        if (uhVar != null) {
                            uhVar.w(40);
                            return;
                        }
                        return;
                    default:
                        this.f28789b.f24671e3.U(null, null);
                        return;
                }
            }
        });
        bi.j6 j6Var2 = new bi.j6(this, context);
        org.telegram.ui.ActionBar.a7.V(j6Var2, org.telegram.ui.ActionBar.t6.Gi, p6Var);
        j6Var2.setText(org.telegram.messenger.cd.L0(2131751753, null));
        j6Var2.setTypeface(org.telegram.messenger.i0.o());
        j6Var2.setTextSize(1, 14.0f);
        j6Var2.setVisibility(4);
        j6Var2.setAlpha(0.0f);
        j6Var2.setGravity(17);
        j6Var2.setPadding(org.telegram.messenger.i0.L(12.0f), 0, org.telegram.messenger.i0.L(12.0f), 0);
        j6Var2.setTranslationX(-org.telegram.messenger.i0.L(12.0f));
        j6Var2.setOnClickListener(new View.OnClickListener(this) {
            public final bi f28789b;

            {
                this.f28789b = this;
            }

            @Override
            public final void onClick(View view) {
                xh.i3 i3Var;
                int i14;
                boolean z14 = false;
                switch (r2) {
                    case 0:
                        bi biVar = this.f28789b;
                        if (biVar.f24721s2 != biVar.f24679h2) {
                            z14 = true;
                        }
                        biVar.N1(z14);
                        return;
                    case 1:
                        bi biVar2 = this.f28789b;
                        long j10 = biVar2.Q2;
                        if (j10 < 0 && (i3Var = (xh.i3) biVar2.f24717r2.get(-j10)) != null) {
                            org.telegram.ui.web.z0 webViewContainer = i3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.x("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        bi biVar3 = this.f28789b;
                        boolean z15 = biVar3.T1;
                        if (!z15) {
                            biVar3.u1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        bi biVar4 = this.f28789b;
                        boolean z16 = biVar4.T1;
                        if (z16) {
                            biVar4.u1(!z16, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f28789b.m1();
                        return;
                    case 5:
                        this.f28789b.U2.U(null, null);
                        return;
                    case 6:
                        bi biVar5 = this.f28789b;
                        if (biVar5.a2 != null) {
                            boolean T = ChatAttachAlertPhotoLayout.T();
                            boolean z17 = !T;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = biVar5.a2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.f23847s1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ef) {
                                        org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) entry.getValue();
                                        if (efVar.d()) {
                                            efVar.O = Boolean.valueOf(T);
                                            for (int i15 = 0; i15 < chatAttachAlertPhotoLayout.E.getChildCount(); i15++) {
                                                View childAt = chatAttachAlertPhotoLayout.E.getChildAt(i15);
                                                if (childAt instanceof org.telegram.ui.Cells.v5) {
                                                    org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) childAt;
                                                    if (v5Var.getPhotoEntry() == efVar) {
                                                        v5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.w0.f19025b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.tz.f18154i1 = z17;
                                edit.putBoolean("photoLiveDefault", z17).apply();
                                chatAttachAlertPhotoLayout.w0();
                            }
                            biVar5.M1(true);
                            org.telegram.ui.ActionBar.t0 t0Var32 = biVar5.W2;
                            vh.p2 p2Var = biVar5.X2;
                            if (p2Var != null) {
                                p2Var.e(true);
                            }
                            vh.p2 p2Var2 = new vh.p2(biVar5.getContext(), 1);
                            biVar5.X2 = p2Var2;
                            if (!T) {
                                i14 = 2131748842;
                            } else {
                                i14 = 2131748843;
                            }
                            p2Var2.s(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(i14, null)));
                            biVar5.X2.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
                            biVar5.X2.m(1.0f, -((biVar5.f21586b.getWidth() - ((t0Var32.getWidth() / 2.0f) + t0Var32.getX())) - org.telegram.messenger.i0.L(14.0f)));
                            biVar5.X2.setTranslationY(biVar5.U2.getTranslationY());
                            vh.p2 p2Var3 = biVar5.X2;
                            p2Var3.f51740l0 = new cd(5, biVar5, p2Var2);
                            biVar5.f21586b.addView(p2Var3, w7.b6.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            biVar5.X2.u();
                            return;
                        }
                        return;
                    case 7:
                        uh uhVar = this.f28789b.f24721s2;
                        if (uhVar != null) {
                            uhVar.w(40);
                            return;
                        }
                        return;
                    default:
                        this.f28789b.f24671e3.U(null, null);
                        return;
                }
            }
        });
        w7.e6.a(j6Var2);
        this.Z2 = j6Var2;
        K1();
        if (k2Var != null) {
            t0Var = t0Var3;
            j6Var = j6Var2;
            f7 = 14.0f;
            org.telegram.ui.ActionBar.t0 t0Var4 = new org.telegram.ui.ActionBar.t0(context, null, 0, org.telegram.ui.ActionBar.t6.w0(i12, this.I0), false, p6Var);
            this.Y2 = t0Var4;
            t0Var4.setLongClickEnabled(false);
            t0Var4.setIcon(2131232485);
            t0Var4.setContentDescription(org.telegram.messenger.cd.L0(2131745853, null));
            t0Var4.setVisibility(4);
            z13 = false;
            t0Var4.setAlpha(0.0f);
            t0Var4.setTranslationX(-org.telegram.messenger.i0.L(42.0f));
            org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i13, this.I0), 6, -1);
            org.telegram.ui.ActionBar.w6 N3 = org.telegram.ui.ActionBar.a7.N(i13);
            t0Var4.setBackground(h04);
            org.telegram.ui.ActionBar.a7.k(t0Var4, h04, null, N3, p6Var);
            c10 = 3;
            t0Var4.setOnClickListener(new org.telegram.ui.ActionBar.c0(3, this, z11));
        } else {
            t0Var = t0Var3;
            j6Var = j6Var2;
            z13 = false;
            c10 = 3;
            f7 = 14.0f;
        }
        org.telegram.ui.ActionBar.t0 t0Var5 = new org.telegram.ui.ActionBar.t0(context, null, 0, org.telegram.ui.ActionBar.t6.w0(i12, this.I0), false, p6Var);
        this.f24671e3 = t0Var5;
        t0Var5.setLongClickEnabled(false);
        t0Var5.setIcon(2131231245);
        t0Var5.setContentDescription(org.telegram.messenger.cd.L0(2131754839, null));
        t0Var5.setVisibility(8);
        org.telegram.ui.Cells.y h05 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i13, this.I0), 3, -1);
        org.telegram.ui.ActionBar.w6 N4 = org.telegram.ui.ActionBar.a7.N(i13);
        t0Var5.setBackground(h05);
        org.telegram.ui.ActionBar.a7.k(t0Var5, h05, null, N4, p6Var);
        t0Var5.e(1, 2131232043, org.telegram.messenger.cd.L0(2131744895, null)).setOnClickListener(new View.OnClickListener(this) {
            public final bi f29074b;

            {
                this.f29074b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z14;
                boolean z15;
                org.telegram.ui.un unVar;
                switch (r3) {
                    case 0:
                        final bi biVar = this.f29074b;
                        dh dhVar = biVar.f24745y2;
                        if (dhVar != null) {
                            org.telegram.messenger.vp.d1().edit().putInt("aihintshown", 3).apply();
                            g0 g0Var = new g0(biVar.getContext(), p6Var);
                            g0Var.r1(dhVar.getText());
                            g0Var.f26179b2 = new org.telegram.messenger.q20() {
                                @Override
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            dh dhVar2 = biVar.f24745y2;
                                            dhVar2.setText(charSequence);
                                            dhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            fh fhVar = biVar.J2;
                                            fhVar.setText(charSequence);
                                            fhVar.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j10 = biVar.Q1;
                            if (biVar.B3 != null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            sg sgVar = new sg(biVar, 0);
                            g0Var.f26181d2 = j10;
                            g0Var.f26182e2 = z14;
                            g0Var.f26183f2 = sgVar;
                            g0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final bi biVar2 = this.f29074b;
                        fh fhVar = biVar2.J2;
                        if (fhVar != null) {
                            org.telegram.messenger.vp.d1().edit().putInt("aihintshown", 3).apply();
                            g0 g0Var2 = new g0(biVar2.getContext(), p6Var);
                            g0Var2.r1(fhVar.getText());
                            g0Var2.f26179b2 = new org.telegram.messenger.q20() {
                                @Override
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            dh dhVar2 = biVar2.f24745y2;
                                            dhVar2.setText(charSequence);
                                            dhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            fh fhVar2 = biVar2.J2;
                                            fhVar2.setText(charSequence);
                                            fhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j11 = biVar2.Q1;
                            if (biVar2.B3 != null) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            sg sgVar2 = new sg(biVar2, 1);
                            g0Var2.f26181d2 = j11;
                            g0Var2.f26182e2 = z15;
                            g0Var2.f26183f2 = sgVar2;
                            g0Var2.show();
                            return;
                        }
                        return;
                    default:
                        bi biVar3 = this.f29074b;
                        biVar3.f24671e3.U(null, null);
                        PhotoViewer v12 = PhotoViewer.v1();
                        org.telegram.ui.ActionBar.k2 k2Var2 = biVar3.W1;
                        v12.N2(null, k2Var2, p6Var);
                        PhotoViewer.v1().O2(biVar3);
                        PhotoViewer v13 = PhotoViewer.v1();
                        int i14 = biVar3.M3;
                        boolean z16 = biVar3.N3;
                        v13.h = i14;
                        v13.f33547n = z16;
                        if (!biVar3.T3.D()) {
                            org.telegram.messenger.i0.v1(k2Var2.getFragmentView().findFocus());
                            org.telegram.messenger.i0.v1(biVar3.f21589c.findFocus());
                        }
                        File w9 = vh.n5.w(biVar3.D3, "webp");
                        Point point = org.telegram.messenger.i0.f16026q;
                        int i15 = point.x;
                        int i16 = point.y;
                        if (i15 > 1080 || i16 > 1080) {
                            float min = Math.min(i15, i16) / 1080.0f;
                            i15 = (int) (i15 * min);
                            i16 = (int) (i16 * min);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(i15, i16, Bitmap.Config.ARGB_8888);
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w9));
                        } catch (Throwable th2) {
                            org.telegram.messenger.f8.g(th2, true);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList2 = new ArrayList();
                        org.telegram.messenger.ef efVar = new org.telegram.messenger.ef(0, w9.getAbsolutePath(), 0, false, 0, 0);
                        arrayList2.add(efVar);
                        PhotoViewer v14 = PhotoViewer.v1();
                        th thVar = new th(biVar3, efVar);
                        if (k2Var2 instanceof org.telegram.ui.un) {
                            unVar = (org.telegram.ui.un) k2Var2;
                        } else {
                            unVar = null;
                        }
                        v14.j2(arrayList2, 0, 11, false, thVar, unVar);
                        if (biVar3.f24740x1) {
                            PhotoViewer.v1().Z0(null, null, true, biVar3.A1);
                            return;
                        }
                        return;
                }
            }
        });
        t0Var5.setMenuYOffset(org.telegram.messenger.i0.L(-12.0f));
        t0Var5.setAdditionalXOffset(org.telegram.messenger.i0.L(12.0f));
        t0Var5.setOnClickListener(new View.OnClickListener(this) {
            public final bi f28789b;

            {
                this.f28789b = this;
            }

            @Override
            public final void onClick(View view) {
                xh.i3 i3Var;
                int i14;
                boolean z14 = false;
                switch (r2) {
                    case 0:
                        bi biVar = this.f28789b;
                        if (biVar.f24721s2 != biVar.f24679h2) {
                            z14 = true;
                        }
                        biVar.N1(z14);
                        return;
                    case 1:
                        bi biVar2 = this.f28789b;
                        long j10 = biVar2.Q2;
                        if (j10 < 0 && (i3Var = (xh.i3) biVar2.f24717r2.get(-j10)) != null) {
                            org.telegram.ui.web.z0 webViewContainer = i3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.x("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        bi biVar3 = this.f28789b;
                        boolean z15 = biVar3.T1;
                        if (!z15) {
                            biVar3.u1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        bi biVar4 = this.f28789b;
                        boolean z16 = biVar4.T1;
                        if (z16) {
                            biVar4.u1(!z16, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f28789b.m1();
                        return;
                    case 5:
                        this.f28789b.U2.U(null, null);
                        return;
                    case 6:
                        bi biVar5 = this.f28789b;
                        if (biVar5.a2 != null) {
                            boolean T = ChatAttachAlertPhotoLayout.T();
                            boolean z17 = !T;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = biVar5.a2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.f23847s1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ef) {
                                        org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) entry.getValue();
                                        if (efVar.d()) {
                                            efVar.O = Boolean.valueOf(T);
                                            for (int i15 = 0; i15 < chatAttachAlertPhotoLayout.E.getChildCount(); i15++) {
                                                View childAt = chatAttachAlertPhotoLayout.E.getChildAt(i15);
                                                if (childAt instanceof org.telegram.ui.Cells.v5) {
                                                    org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) childAt;
                                                    if (v5Var.getPhotoEntry() == efVar) {
                                                        v5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.w0.f19025b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.tz.f18154i1 = z17;
                                edit.putBoolean("photoLiveDefault", z17).apply();
                                chatAttachAlertPhotoLayout.w0();
                            }
                            biVar5.M1(true);
                            org.telegram.ui.ActionBar.t0 t0Var32 = biVar5.W2;
                            vh.p2 p2Var = biVar5.X2;
                            if (p2Var != null) {
                                p2Var.e(true);
                            }
                            vh.p2 p2Var2 = new vh.p2(biVar5.getContext(), 1);
                            biVar5.X2 = p2Var2;
                            if (!T) {
                                i14 = 2131748842;
                            } else {
                                i14 = 2131748843;
                            }
                            p2Var2.s(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(i14, null)));
                            biVar5.X2.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
                            biVar5.X2.m(1.0f, -((biVar5.f21586b.getWidth() - ((t0Var32.getWidth() / 2.0f) + t0Var32.getX())) - org.telegram.messenger.i0.L(14.0f)));
                            biVar5.X2.setTranslationY(biVar5.U2.getTranslationY());
                            vh.p2 p2Var3 = biVar5.X2;
                            p2Var3.f51740l0 = new cd(5, biVar5, p2Var2);
                            biVar5.f21586b.addView(p2Var3, w7.b6.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            biVar5.X2.u();
                            return;
                        }
                        return;
                    case 7:
                        uh uhVar = this.f28789b.f24721s2;
                        if (uhVar != null) {
                            uhVar.w(40);
                            return;
                        }
                        return;
                    default:
                        this.f28789b.f24671e3.U(null, null);
                        return;
                }
            }
        });
        ah ahVar = new ah(this, context, 0);
        this.f24665c3 = ahVar;
        ahVar.setOnClickListener(new View.OnClickListener(this) {
            public final bi f28789b;

            {
                this.f28789b = this;
            }

            @Override
            public final void onClick(View view) {
                xh.i3 i3Var;
                int i14;
                boolean z14 = false;
                switch (r2) {
                    case 0:
                        bi biVar = this.f28789b;
                        if (biVar.f24721s2 != biVar.f24679h2) {
                            z14 = true;
                        }
                        biVar.N1(z14);
                        return;
                    case 1:
                        bi biVar2 = this.f28789b;
                        long j10 = biVar2.Q2;
                        if (j10 < 0 && (i3Var = (xh.i3) biVar2.f24717r2.get(-j10)) != null) {
                            org.telegram.ui.web.z0 webViewContainer = i3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.x("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        bi biVar3 = this.f28789b;
                        boolean z15 = biVar3.T1;
                        if (!z15) {
                            biVar3.u1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        bi biVar4 = this.f28789b;
                        boolean z16 = biVar4.T1;
                        if (z16) {
                            biVar4.u1(!z16, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f28789b.m1();
                        return;
                    case 5:
                        this.f28789b.U2.U(null, null);
                        return;
                    case 6:
                        bi biVar5 = this.f28789b;
                        if (biVar5.a2 != null) {
                            boolean T = ChatAttachAlertPhotoLayout.T();
                            boolean z17 = !T;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = biVar5.a2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.f23847s1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ef) {
                                        org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) entry.getValue();
                                        if (efVar.d()) {
                                            efVar.O = Boolean.valueOf(T);
                                            for (int i15 = 0; i15 < chatAttachAlertPhotoLayout.E.getChildCount(); i15++) {
                                                View childAt = chatAttachAlertPhotoLayout.E.getChildAt(i15);
                                                if (childAt instanceof org.telegram.ui.Cells.v5) {
                                                    org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) childAt;
                                                    if (v5Var.getPhotoEntry() == efVar) {
                                                        v5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.w0.f19025b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.tz.f18154i1 = z17;
                                edit.putBoolean("photoLiveDefault", z17).apply();
                                chatAttachAlertPhotoLayout.w0();
                            }
                            biVar5.M1(true);
                            org.telegram.ui.ActionBar.t0 t0Var32 = biVar5.W2;
                            vh.p2 p2Var = biVar5.X2;
                            if (p2Var != null) {
                                p2Var.e(true);
                            }
                            vh.p2 p2Var2 = new vh.p2(biVar5.getContext(), 1);
                            biVar5.X2 = p2Var2;
                            if (!T) {
                                i14 = 2131748842;
                            } else {
                                i14 = 2131748843;
                            }
                            p2Var2.s(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(i14, null)));
                            biVar5.X2.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
                            biVar5.X2.m(1.0f, -((biVar5.f21586b.getWidth() - ((t0Var32.getWidth() / 2.0f) + t0Var32.getX())) - org.telegram.messenger.i0.L(14.0f)));
                            biVar5.X2.setTranslationY(biVar5.U2.getTranslationY());
                            vh.p2 p2Var3 = biVar5.X2;
                            p2Var3.f51740l0 = new cd(5, biVar5, p2Var2);
                            biVar5.f21586b.addView(p2Var3, w7.b6.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            biVar5.X2.u();
                            return;
                        }
                        return;
                    case 7:
                        uh uhVar = this.f28789b.f24721s2;
                        if (uhVar != null) {
                            uhVar.w(40);
                            return;
                        }
                        return;
                    default:
                        this.f28789b.f24671e3.U(null, null);
                        return;
                }
            }
        });
        ahVar.setAlpha(0.0f);
        ahVar.setVisibility(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f24674f3 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.f24668d3 = textView;
        org.telegram.messenger.m5.m(textView, i12, p6Var, 1, 16.0f);
        textView.setGravity(19);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, w7.b6.r(-2, -2, 16));
        ImageView imageView = new ImageView(context);
        this.f24677g3 = imageView;
        Drawable mutate = getContext().getResources().getDrawable(2131230875).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.a7.y(imageView, mutate, i12, p6Var, mode);
        imageView.setImageDrawable(mutate);
        imageView.setVisibility(8);
        linearLayout.addView(imageView, w7.b6.t(-2, -2, 16, 4, 1, 0, 0));
        linearLayout.setAlpha(1.0f);
        ahVar.addView(linearLayout, w7.b6.c(-1.0f, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f24680h3 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        ImageView imageView2 = new ImageView(context);
        Drawable mutate2 = getContext().getResources().getDrawable(2131230874).mutate();
        org.telegram.ui.ActionBar.a7.y(imageView2, mutate2, i12, p6Var, mode);
        imageView2.setImageDrawable(mutate2);
        linearLayout2.addView(imageView2, w7.b6.t(-2, -2, 16, 0, 1, 4, 0));
        TextView textView2 = new TextView(context);
        this.f24684i3 = textView2;
        org.telegram.messenger.m5.m(textView2, i12, p6Var, 1, 16.0f);
        org.telegram.messenger.m5.l(textView2, 19, "AttachMediaPreview", 2131753958);
        linearLayout2.setAlpha(0.0f);
        linearLayout2.addView(textView2, w7.b6.r(-2, -2, 16));
        ahVar.addView(linearLayout2, w7.b6.c(-1.0f, -2));
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = new ChatAttachAlertPhotoLayout(this, context, z10, z12, p6Var);
        this.a2 = chatAttachAlertPhotoLayout;
        uhVarArr[0] = chatAttachAlertPhotoLayout;
        chatAttachAlertPhotoLayout.setTranslationX(0.0f);
        this.f24721s2 = chatAttachAlertPhotoLayout;
        this.Q2 = 1L;
        this.f21586b.addView(chatAttachAlertPhotoLayout, w7.b6.c(-1.0f, -1));
        bh.i iVar = new bh.i(context);
        this.f24710p3 = iVar;
        iVar.setup(bVar3);
        iVar.setFadeTopAlpha(0);
        iVar.setFadeHeightTop(org.telegram.messenger.i0.L(48.0f));
        iVar.setFadeHeightBottom(org.telegram.messenger.i0.L(48.0f));
        iVar.setFadeZoneTop(org.telegram.messenger.i0.L(5.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.f16020m);
        this.f21586b.addView(iVar, w7.b6.g());
        this.f21586b.addView(ahVar, w7.b6.d(-1, -2.0f, 51, 23.0f, 0.0f, 21.0f, 0.0f));
        fg.i iVar2 = new fg.i(context);
        this.I2 = iVar2;
        this.f21586b.addView(iVar2, w7.b6.e(-1, -2, 55));
        this.f21586b.addView(g1Var, w7.b6.c(-2.0f, -1));
        this.f21586b.addView(t0Var2, w7.b6.e(48, 48, 53));
        this.f21586b.addView(t0Var, w7.b6.d(48, 48.0f, 53, 0.0f, 0.0f, 48.0f, 0.0f));
        org.telegram.ui.ActionBar.t0 t0Var6 = this.Y2;
        if (t0Var6 != null) {
            this.f21586b.addView(t0Var6, w7.b6.e(48, 48, 53));
        }
        ahVar.addView(t0Var5, w7.b6.d(32, 32.0f, 21, 0.0f, 0.0f, 0.0f, 8.0f));
        this.f21586b.addView(j6Var, w7.b6.e(-2, 48, 53));
        ah ahVar2 = new ah(this, context, 1);
        this.f24718r3 = ahVar2;
        bh bhVar = new bh(context, 0);
        this.f24722s3 = bhVar;
        bhVar.setClipChildren(true);
        bhVar.setClipToPadding(false);
        zh zhVar = new zh(this, context);
        this.f24730u3 = zhVar;
        bhVar.setAdapter(zhVar);
        s4.a0 a0Var = new s4.a0(0, false);
        this.f24726t3 = a0Var;
        bhVar.setLayoutManager(a0Var);
        bhVar.setVerticalScrollBarEnabled(false);
        bhVar.setHorizontalScrollBarEnabled(false);
        bhVar.setItemAnimator(null);
        bhVar.setLayoutAnimation(null);
        org.telegram.ui.ActionBar.a7.m(bhVar, 21, org.telegram.ui.ActionBar.t6.A5, p6Var);
        bhVar.f30647y2 = true;
        bhVar.setOverScrollMode(2);
        tg.b bVar4 = this.B4;
        ei.r rVar = this.X0;
        bVar4.h = rVar;
        this.C4.h = rVar;
        bVar3.h = rVar;
        ch chVar = new ch(this, context, 0);
        this.f24714q3 = chVar;
        tg.c cVar2 = new tg.c(bVar3.c(chVar, null, false));
        this.S1 = cVar2;
        if (org.telegram.messenger.tz.f()) {
            org.telegram.messenger.sc.e(262144);
        }
        cVar2.b(org.telegram.messenger.i0.L(72.0f), true);
        this.f21586b.addView(chVar, w7.b6.g());
        vg.f c11 = this.B4.c(ahVar2, w7.b9.f(p6Var), false);
        c11.q(org.telegram.messenger.i0.L(28.0f));
        c11.p(org.telegram.messenger.i0.L(7.0f));
        ahVar2.setBackground(c11);
        bhVar.setPadding(org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.i0.L(11.0f));
        bhVar.setClipToOutline(true);
        bi.d2 d2Var = rf.e0.f46526a;
        bhVar.setOutlineProvider(new rf.c0(org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.i0.L(28.0f)));
        bhVar.setImportantForAccessibility(1);
        ahVar2.addView(bhVar, w7.b6.g());
        this.f21586b.addView(ahVar2, w7.b6.e(-1, 70, 81));
        bhVar.setOnItemClickListener(new mg.q0(8, this, p6Var));
        bhVar.setOnItemLongClickListener(new ig(this, 3));
        f6 f6Var = new f6(context, true, false, true);
        this.y3 = f6Var;
        f6Var.setVisibility(8);
        f6Var.setAlpha(0.0f);
        f6Var.setGravity(17);
        f6Var.setTypeface(org.telegram.messenger.i0.o());
        int L3 = org.telegram.messenger.i0.L(16.0f);
        f6Var.setPadding(L3, 0, L3, 0);
        f6Var.setTextSize(org.telegram.messenger.i0.L(f7));
        f6Var.setOnClickListener(new View.OnClickListener(this) {
            public final bi f28789b;

            {
                this.f28789b = this;
            }

            @Override
            public final void onClick(View view) {
                xh.i3 i3Var;
                int i14;
                boolean z14 = false;
                switch (r2) {
                    case 0:
                        bi biVar = this.f28789b;
                        if (biVar.f24721s2 != biVar.f24679h2) {
                            z14 = true;
                        }
                        biVar.N1(z14);
                        return;
                    case 1:
                        bi biVar2 = this.f28789b;
                        long j10 = biVar2.Q2;
                        if (j10 < 0 && (i3Var = (xh.i3) biVar2.f24717r2.get(-j10)) != null) {
                            org.telegram.ui.web.z0 webViewContainer = i3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.x("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        bi biVar3 = this.f28789b;
                        boolean z15 = biVar3.T1;
                        if (!z15) {
                            biVar3.u1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        bi biVar4 = this.f28789b;
                        boolean z16 = biVar4.T1;
                        if (z16) {
                            biVar4.u1(!z16, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f28789b.m1();
                        return;
                    case 5:
                        this.f28789b.U2.U(null, null);
                        return;
                    case 6:
                        bi biVar5 = this.f28789b;
                        if (biVar5.a2 != null) {
                            boolean T = ChatAttachAlertPhotoLayout.T();
                            boolean z17 = !T;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = biVar5.a2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.f23847s1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ef) {
                                        org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) entry.getValue();
                                        if (efVar.d()) {
                                            efVar.O = Boolean.valueOf(T);
                                            for (int i15 = 0; i15 < chatAttachAlertPhotoLayout2.E.getChildCount(); i15++) {
                                                View childAt = chatAttachAlertPhotoLayout2.E.getChildAt(i15);
                                                if (childAt instanceof org.telegram.ui.Cells.v5) {
                                                    org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) childAt;
                                                    if (v5Var.getPhotoEntry() == efVar) {
                                                        v5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.w0.f19025b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.tz.f18154i1 = z17;
                                edit.putBoolean("photoLiveDefault", z17).apply();
                                chatAttachAlertPhotoLayout2.w0();
                            }
                            biVar5.M1(true);
                            org.telegram.ui.ActionBar.t0 t0Var32 = biVar5.W2;
                            vh.p2 p2Var = biVar5.X2;
                            if (p2Var != null) {
                                p2Var.e(true);
                            }
                            vh.p2 p2Var2 = new vh.p2(biVar5.getContext(), 1);
                            biVar5.X2 = p2Var2;
                            if (!T) {
                                i14 = 2131748842;
                            } else {
                                i14 = 2131748843;
                            }
                            p2Var2.s(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(i14, null)));
                            biVar5.X2.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
                            biVar5.X2.m(1.0f, -((biVar5.f21586b.getWidth() - ((t0Var32.getWidth() / 2.0f) + t0Var32.getX())) - org.telegram.messenger.i0.L(14.0f)));
                            biVar5.X2.setTranslationY(biVar5.U2.getTranslationY());
                            vh.p2 p2Var3 = biVar5.X2;
                            p2Var3.f51740l0 = new cd(5, biVar5, p2Var2);
                            biVar5.f21586b.addView(p2Var3, w7.b6.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            biVar5.X2.u();
                            return;
                        }
                        return;
                    case 7:
                        uh uhVar = this.f28789b.f24721s2;
                        if (uhVar != null) {
                            uhVar.w(40);
                            return;
                        }
                        return;
                    default:
                        this.f28789b.f24671e3.U(null, null);
                        return;
                }
            }
        });
        this.f21586b.addView(f6Var, w7.b6.e(-1, 48, 83));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f24738w3 = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.i0.L(18.0f));
        radialProgressView.setAlpha(0.0f);
        radialProgressView.setScaleX(0.1f);
        radialProgressView.setScaleY(0.1f);
        radialProgressView.setVisibility(8);
        this.f21586b.addView(radialProgressView, w7.b6.d(28, 28.0f, 85, 0.0f, 0.0f, 10.0f, 10.0f));
        ImageView imageView3 = new ImageView(context);
        this.f24748z2 = imageView3;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        int i14 = org.telegram.ui.ActionBar.t6.f21330z6;
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.a7.t(imageView3, i14, p6Var, mode2);
        imageView3.setImageResource(2131231837);
        imageView3.setVisibility(8);
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final bi f28789b;

            {
                this.f28789b = this;
            }

            @Override
            public final void onClick(View view) {
                xh.i3 i3Var;
                int i142;
                boolean z14 = false;
                switch (r2) {
                    case 0:
                        bi biVar = this.f28789b;
                        if (biVar.f24721s2 != biVar.f24679h2) {
                            z14 = true;
                        }
                        biVar.N1(z14);
                        return;
                    case 1:
                        bi biVar2 = this.f28789b;
                        long j10 = biVar2.Q2;
                        if (j10 < 0 && (i3Var = (xh.i3) biVar2.f24717r2.get(-j10)) != null) {
                            org.telegram.ui.web.z0 webViewContainer = i3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.x("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        bi biVar3 = this.f28789b;
                        boolean z15 = biVar3.T1;
                        if (!z15) {
                            biVar3.u1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        bi biVar4 = this.f28789b;
                        boolean z16 = biVar4.T1;
                        if (z16) {
                            biVar4.u1(!z16, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f28789b.m1();
                        return;
                    case 5:
                        this.f28789b.U2.U(null, null);
                        return;
                    case 6:
                        bi biVar5 = this.f28789b;
                        if (biVar5.a2 != null) {
                            boolean T = ChatAttachAlertPhotoLayout.T();
                            boolean z17 = !T;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = biVar5.a2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.f23847s1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ef) {
                                        org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) entry.getValue();
                                        if (efVar.d()) {
                                            efVar.O = Boolean.valueOf(T);
                                            for (int i15 = 0; i15 < chatAttachAlertPhotoLayout2.E.getChildCount(); i15++) {
                                                View childAt = chatAttachAlertPhotoLayout2.E.getChildAt(i15);
                                                if (childAt instanceof org.telegram.ui.Cells.v5) {
                                                    org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) childAt;
                                                    if (v5Var.getPhotoEntry() == efVar) {
                                                        v5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.w0.f19025b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.tz.f18154i1 = z17;
                                edit.putBoolean("photoLiveDefault", z17).apply();
                                chatAttachAlertPhotoLayout2.w0();
                            }
                            biVar5.M1(true);
                            org.telegram.ui.ActionBar.t0 t0Var32 = biVar5.W2;
                            vh.p2 p2Var = biVar5.X2;
                            if (p2Var != null) {
                                p2Var.e(true);
                            }
                            vh.p2 p2Var2 = new vh.p2(biVar5.getContext(), 1);
                            biVar5.X2 = p2Var2;
                            if (!T) {
                                i142 = 2131748842;
                            } else {
                                i142 = 2131748843;
                            }
                            p2Var2.s(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(i142, null)));
                            biVar5.X2.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
                            biVar5.X2.m(1.0f, -((biVar5.f21586b.getWidth() - ((t0Var32.getWidth() / 2.0f) + t0Var32.getX())) - org.telegram.messenger.i0.L(14.0f)));
                            biVar5.X2.setTranslationY(biVar5.U2.getTranslationY());
                            vh.p2 p2Var3 = biVar5.X2;
                            p2Var3.f51740l0 = new cd(5, biVar5, p2Var2);
                            biVar5.f21586b.addView(p2Var3, w7.b6.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            biVar5.X2.u();
                            return;
                        }
                        return;
                    case 7:
                        uh uhVar = this.f28789b.f24721s2;
                        if (uhVar != null) {
                            uhVar.w(40);
                            return;
                        }
                        return;
                    default:
                        this.f28789b.f24671e3.U(null, null);
                        return;
                }
            }
        });
        ah ahVar3 = new ah(this, context, 2);
        this.f24741x2 = ahVar3;
        ag.q qVar = new ag.q(this, context);
        this.f24737w2 = qVar;
        ahVar3.addView(qVar, w7.b6.e(-1, -1, 119));
        vg.f c12 = this.C4.c(phVar, w7.b9.o(p6Var), false);
        this.f24729u2 = c12;
        c12.O = true;
        c12.r(org.telegram.messenger.i0.L(29.0f), org.telegram.messenger.i0.L(29.0f), 0.0f, 0.0f);
        c12.t(org.telegram.messenger.i0.L(32.0f));
        c12.M.f50834g = 0.4f;
        c12.m();
        vg.f c13 = this.B4.c(qVar, w7.b9.o(p6Var), false);
        this.f24733v2 = c13;
        c13.q(org.telegram.messenger.i0.L(22.0f));
        c13.p(org.telegram.messenger.i0.L(7.0f));
        qVar.setPadding(org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(5.0f));
        ahVar3.setWillNotDraw(false);
        ahVar3.setVisibility(4);
        ahVar3.setAlpha(0.0f);
        this.f21586b.addView(ahVar3, w7.b6.e(-1, -2, 83));
        ahVar3.setOnTouchListener(new org.telegram.ui.ActionBar.n2(12));
        f6 f6Var2 = new f6(context, false, false, false);
        this.f24712q1 = f6Var2;
        f6Var2.setAllowCancel(true);
        f6Var2.setScaleProperty(0.6f);
        f6Var2.setVisibility(8);
        f6Var2.setTextSize(org.telegram.messenger.i0.L(15.0f));
        int i15 = org.telegram.ui.ActionBar.t6.f21311y6;
        org.telegram.ui.ActionBar.a7.Z(f6Var2, i15, p6Var);
        f6Var2.setTypeface(org.telegram.messenger.i0.o());
        f6Var2.setGravity(17);
        qVar.addView(f6Var2, w7.b6.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 50.0f));
        ImageView imageView4 = new ImageView(context);
        this.f24720s1 = imageView4;
        org.telegram.ui.ActionBar.y2 y2Var = new org.telegram.ui.ActionBar.y2(context);
        this.f24724t1 = y2Var;
        imageView4.setImageDrawable(y2Var);
        imageView4.setScaleType(scaleType);
        int i16 = org.telegram.ui.ActionBar.t6.Kl;
        org.telegram.ui.ActionBar.a7.t(imageView4, i16, p6Var, mode);
        int i17 = org.telegram.ui.ActionBar.t6.f21020i6;
        org.telegram.ui.Cells.y h06 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i17, this.I0), 1, org.telegram.messenger.i0.L(16.0f));
        org.telegram.ui.ActionBar.w6 N5 = org.telegram.ui.ActionBar.a7.N(i17);
        imageView4.setBackground(h06);
        org.telegram.ui.ActionBar.a7.k(imageView4, h06, null, N5, p6Var);
        qVar.addView(imageView4, w7.b6.d(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(org.telegram.messenger.cd.L0(2131755006, null));
        w7.e6.a(imageView4);
        imageView4.setOnClickListener(new View.OnClickListener(this) {
            public final bi f29074b;

            {
                this.f29074b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z14;
                boolean z15;
                org.telegram.ui.un unVar;
                switch (r3) {
                    case 0:
                        final bi biVar = this.f29074b;
                        dh dhVar = biVar.f24745y2;
                        if (dhVar != null) {
                            org.telegram.messenger.vp.d1().edit().putInt("aihintshown", 3).apply();
                            g0 g0Var = new g0(biVar.getContext(), p6Var);
                            g0Var.r1(dhVar.getText());
                            g0Var.f26179b2 = new org.telegram.messenger.q20() {
                                @Override
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            dh dhVar2 = biVar.f24745y2;
                                            dhVar2.setText(charSequence);
                                            dhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            fh fhVar2 = biVar.J2;
                                            fhVar2.setText(charSequence);
                                            fhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j10 = biVar.Q1;
                            if (biVar.B3 != null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            sg sgVar = new sg(biVar, 0);
                            g0Var.f26181d2 = j10;
                            g0Var.f26182e2 = z14;
                            g0Var.f26183f2 = sgVar;
                            g0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final bi biVar2 = this.f29074b;
                        fh fhVar = biVar2.J2;
                        if (fhVar != null) {
                            org.telegram.messenger.vp.d1().edit().putInt("aihintshown", 3).apply();
                            g0 g0Var2 = new g0(biVar2.getContext(), p6Var);
                            g0Var2.r1(fhVar.getText());
                            g0Var2.f26179b2 = new org.telegram.messenger.q20() {
                                @Override
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            dh dhVar2 = biVar2.f24745y2;
                                            dhVar2.setText(charSequence);
                                            dhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            fh fhVar2 = biVar2.J2;
                                            fhVar2.setText(charSequence);
                                            fhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j11 = biVar2.Q1;
                            if (biVar2.B3 != null) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            sg sgVar2 = new sg(biVar2, 1);
                            g0Var2.f26181d2 = j11;
                            g0Var2.f26182e2 = z15;
                            g0Var2.f26183f2 = sgVar2;
                            g0Var2.show();
                            return;
                        }
                        return;
                    default:
                        bi biVar3 = this.f29074b;
                        biVar3.f24671e3.U(null, null);
                        PhotoViewer v12 = PhotoViewer.v1();
                        org.telegram.ui.ActionBar.k2 k2Var2 = biVar3.W1;
                        v12.N2(null, k2Var2, p6Var);
                        PhotoViewer.v1().O2(biVar3);
                        PhotoViewer v13 = PhotoViewer.v1();
                        int i142 = biVar3.M3;
                        boolean z16 = biVar3.N3;
                        v13.h = i142;
                        v13.f33547n = z16;
                        if (!biVar3.T3.D()) {
                            org.telegram.messenger.i0.v1(k2Var2.getFragmentView().findFocus());
                            org.telegram.messenger.i0.v1(biVar3.f21589c.findFocus());
                        }
                        File w9 = vh.n5.w(biVar3.D3, "webp");
                        Point point = org.telegram.messenger.i0.f16026q;
                        int i152 = point.x;
                        int i162 = point.y;
                        if (i152 > 1080 || i162 > 1080) {
                            float min = Math.min(i152, i162) / 1080.0f;
                            i152 = (int) (i152 * min);
                            i162 = (int) (i162 * min);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(i152, i162, Bitmap.Config.ARGB_8888);
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w9));
                        } catch (Throwable th2) {
                            org.telegram.messenger.f8.g(th2, true);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList2 = new ArrayList();
                        org.telegram.messenger.ef efVar = new org.telegram.messenger.ef(0, w9.getAbsolutePath(), 0, false, 0, 0);
                        arrayList2.add(efVar);
                        PhotoViewer v14 = PhotoViewer.v1();
                        th thVar = new th(biVar3, efVar);
                        if (k2Var2 instanceof org.telegram.ui.un) {
                            unVar = (org.telegram.ui.un) k2Var2;
                        } else {
                            unVar = null;
                        }
                        v14.j2(arrayList2, 0, 11, false, thVar, unVar);
                        if (biVar3.f24740x1) {
                            PhotoViewer.v1().Z0(null, null, true, biVar3.A1);
                            return;
                        }
                        return;
                }
            }
        });
        imageView4.setVisibility(8);
        imageView4.setAlpha(0.0f);
        imageView4.setScaleX(0.6f);
        imageView4.setScaleY(0.6f);
        org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.f15147s0);
        this.B1 = r12.getUserConfig().q() ? r12.V4 : r12.U4;
        dh dhVar = new dh(this, context, phVar, p6Var);
        this.f24745y2 = dhVar;
        dhVar.J = true;
        dhVar.setHint(org.telegram.messenger.cd.L0(2131754454, "AddCaption"));
        dhVar.s();
        dhVar.getEditText().setLayoutParams(w7.b6.d(-1, -1.0f, 19, 48.0f, 0.0f, 36.0f, 0.0f));
        dhVar.getEditText().addTextChangedListener(new eh(this, 0));
        qVar.addView(dhVar, w7.b6.d(-1, -2.0f, 83, 0.0f, 0.0f, 84.0f, 0.0f));
        qVar.setClipChildren(false);
        ahVar3.setClipChildren(false);
        dhVar.setClipChildren(false);
        iVar2.setPadding(org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f));
        iVar2.setWillNotDraw(false);
        fh fhVar = new fh(this, context, phVar, p6Var);
        this.J2 = fhVar;
        fhVar.J = true;
        fhVar.getEditText().addTextChangedListener(new hh(this, k2Var));
        fhVar.getEditText().setPadding(0, org.telegram.messenger.i0.L(9.0f), 0, org.telegram.messenger.i0.L(9.0f));
        fhVar.getEditText().setLayoutParams(w7.b6.d(-1, -1.0f, 19, 48.0f, 0.0f, 96.0f, 0.0f));
        fhVar.getEditText().setTextSize(1, 17.0f);
        fhVar.getEmojiButton().setLayoutParams(w7.b6.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        fhVar.setHint(org.telegram.messenger.cd.L0(2131754454, "AddCaption"));
        iVar2.addView(fhVar, w7.b6.e(-1, -2, 119));
        iVar2.setAlpha(0.0f);
        iVar2.setVisibility(8);
        dhVar.addView(imageView3, w7.b6.d(40, 40.0f, 85, 0.0f, 0.0f, 0.0f, 4.0f));
        vg.f c14 = this.B4.c(iVar2, w7.b9.o(p6Var), false);
        c14.q(org.telegram.messenger.i0.L(22.0f));
        c14.p(org.telegram.messenger.i0.L(7.0f));
        iVar2.setBackground(c14);
        iVar2.setPadding(org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.i0.L(9.0f));
        f6 f6Var3 = new f6(context, false, false, false);
        this.f24716r1 = f6Var3;
        f6Var3.setScaleProperty(0.6f);
        f6Var3.setVisibility(8);
        f6Var3.setTextSize(org.telegram.messenger.i0.L(15.0f));
        org.telegram.ui.ActionBar.a7.Z(f6Var3, i15, p6Var);
        f6Var3.setTypeface(org.telegram.messenger.i0.o());
        f6Var3.setGravity(17);
        f6Var3.setAllowCancel(true);
        iVar2.addView(f6Var3, w7.b6.d(56, 20.0f, 53, 3.0f, 45.0f, 3.0f, 0.0f));
        ImageView imageView5 = new ImageView(context);
        imageView5.setScaleType(scaleType);
        imageView5.setImageResource(2131231838);
        org.telegram.ui.ActionBar.a7.t(imageView5, org.telegram.ui.ActionBar.t6.Le, p6Var, mode2);
        fhVar.addView(imageView5, w7.b6.d(40, 40.0f, 85, 0.0f, 0.0f, 60.0f, 0.0f));
        imageView5.setOnClickListener(new View.OnClickListener(this) {
            public final bi f28789b;

            {
                this.f28789b = this;
            }

            @Override
            public final void onClick(View view) {
                xh.i3 i3Var;
                int i142;
                boolean z14 = false;
                switch (r2) {
                    case 0:
                        bi biVar = this.f28789b;
                        if (biVar.f24721s2 != biVar.f24679h2) {
                            z14 = true;
                        }
                        biVar.N1(z14);
                        return;
                    case 1:
                        bi biVar2 = this.f28789b;
                        long j10 = biVar2.Q2;
                        if (j10 < 0 && (i3Var = (xh.i3) biVar2.f24717r2.get(-j10)) != null) {
                            org.telegram.ui.web.z0 webViewContainer = i3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.x("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        bi biVar3 = this.f28789b;
                        boolean z15 = biVar3.T1;
                        if (!z15) {
                            biVar3.u1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        bi biVar4 = this.f28789b;
                        boolean z16 = biVar4.T1;
                        if (z16) {
                            biVar4.u1(!z16, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f28789b.m1();
                        return;
                    case 5:
                        this.f28789b.U2.U(null, null);
                        return;
                    case 6:
                        bi biVar5 = this.f28789b;
                        if (biVar5.a2 != null) {
                            boolean T = ChatAttachAlertPhotoLayout.T();
                            boolean z17 = !T;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = biVar5.a2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.f23847s1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ef) {
                                        org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) entry.getValue();
                                        if (efVar.d()) {
                                            efVar.O = Boolean.valueOf(T);
                                            for (int i152 = 0; i152 < chatAttachAlertPhotoLayout2.E.getChildCount(); i152++) {
                                                View childAt = chatAttachAlertPhotoLayout2.E.getChildAt(i152);
                                                if (childAt instanceof org.telegram.ui.Cells.v5) {
                                                    org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) childAt;
                                                    if (v5Var.getPhotoEntry() == efVar) {
                                                        v5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.w0.f19025b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.tz.f18154i1 = z17;
                                edit.putBoolean("photoLiveDefault", z17).apply();
                                chatAttachAlertPhotoLayout2.w0();
                            }
                            biVar5.M1(true);
                            org.telegram.ui.ActionBar.t0 t0Var32 = biVar5.W2;
                            vh.p2 p2Var = biVar5.X2;
                            if (p2Var != null) {
                                p2Var.e(true);
                            }
                            vh.p2 p2Var2 = new vh.p2(biVar5.getContext(), 1);
                            biVar5.X2 = p2Var2;
                            if (!T) {
                                i142 = 2131748842;
                            } else {
                                i142 = 2131748843;
                            }
                            p2Var2.s(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(i142, null)));
                            biVar5.X2.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
                            biVar5.X2.m(1.0f, -((biVar5.f21586b.getWidth() - ((t0Var32.getWidth() / 2.0f) + t0Var32.getX())) - org.telegram.messenger.i0.L(14.0f)));
                            biVar5.X2.setTranslationY(biVar5.U2.getTranslationY());
                            vh.p2 p2Var3 = biVar5.X2;
                            p2Var3.f51740l0 = new cd(5, biVar5, p2Var2);
                            biVar5.f21586b.addView(p2Var3, w7.b6.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            biVar5.X2.u();
                            return;
                        }
                        return;
                    case 7:
                        uh uhVar = this.f28789b.f24721s2;
                        if (uhVar != null) {
                            uhVar.w(40);
                            return;
                        }
                        return;
                    default:
                        this.f28789b.f24671e3.U(null, null);
                        return;
                }
            }
        });
        ImageView imageView6 = new ImageView(context);
        this.f24728u1 = imageView6;
        org.telegram.ui.ActionBar.y2 y2Var2 = new org.telegram.ui.ActionBar.y2(context);
        this.f24732v1 = y2Var2;
        imageView6.setImageDrawable(y2Var2);
        imageView6.setScaleType(scaleType);
        org.telegram.ui.ActionBar.a7.t(imageView6, i16, p6Var, mode);
        org.telegram.ui.Cells.y h07 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i17, this.I0), 1, org.telegram.messenger.i0.L(16.0f));
        org.telegram.ui.ActionBar.w6 N6 = org.telegram.ui.ActionBar.a7.N(i17);
        imageView6.setBackground(h07);
        org.telegram.ui.ActionBar.a7.k(imageView6, h07, null, N6, p6Var);
        iVar2.addView(imageView6, w7.b6.d(44, 44.0f, 85, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView6.setContentDescription(org.telegram.messenger.cd.L0(2131755006, null));
        w7.e6.a(imageView6);
        imageView6.setOnClickListener(new View.OnClickListener(this) {
            public final bi f29074b;

            {
                this.f29074b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z14;
                boolean z15;
                org.telegram.ui.un unVar;
                switch (r3) {
                    case 0:
                        final bi biVar = this.f29074b;
                        dh dhVar2 = biVar.f24745y2;
                        if (dhVar2 != null) {
                            org.telegram.messenger.vp.d1().edit().putInt("aihintshown", 3).apply();
                            g0 g0Var = new g0(biVar.getContext(), p6Var);
                            g0Var.r1(dhVar2.getText());
                            g0Var.f26179b2 = new org.telegram.messenger.q20() {
                                @Override
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            dh dhVar22 = biVar.f24745y2;
                                            dhVar22.setText(charSequence);
                                            dhVar22.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            fh fhVar2 = biVar.J2;
                                            fhVar2.setText(charSequence);
                                            fhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j10 = biVar.Q1;
                            if (biVar.B3 != null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            sg sgVar = new sg(biVar, 0);
                            g0Var.f26181d2 = j10;
                            g0Var.f26182e2 = z14;
                            g0Var.f26183f2 = sgVar;
                            g0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final bi biVar2 = this.f29074b;
                        fh fhVar2 = biVar2.J2;
                        if (fhVar2 != null) {
                            org.telegram.messenger.vp.d1().edit().putInt("aihintshown", 3).apply();
                            g0 g0Var2 = new g0(biVar2.getContext(), p6Var);
                            g0Var2.r1(fhVar2.getText());
                            g0Var2.f26179b2 = new org.telegram.messenger.q20() {
                                @Override
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            dh dhVar22 = biVar2.f24745y2;
                                            dhVar22.setText(charSequence);
                                            dhVar22.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            fh fhVar22 = biVar2.J2;
                                            fhVar22.setText(charSequence);
                                            fhVar22.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j11 = biVar2.Q1;
                            if (biVar2.B3 != null) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            sg sgVar2 = new sg(biVar2, 1);
                            g0Var2.f26181d2 = j11;
                            g0Var2.f26182e2 = z15;
                            g0Var2.f26183f2 = sgVar2;
                            g0Var2.show();
                            return;
                        }
                        return;
                    default:
                        bi biVar3 = this.f29074b;
                        biVar3.f24671e3.U(null, null);
                        PhotoViewer v12 = PhotoViewer.v1();
                        org.telegram.ui.ActionBar.k2 k2Var2 = biVar3.W1;
                        v12.N2(null, k2Var2, p6Var);
                        PhotoViewer.v1().O2(biVar3);
                        PhotoViewer v13 = PhotoViewer.v1();
                        int i142 = biVar3.M3;
                        boolean z16 = biVar3.N3;
                        v13.h = i142;
                        v13.f33547n = z16;
                        if (!biVar3.T3.D()) {
                            org.telegram.messenger.i0.v1(k2Var2.getFragmentView().findFocus());
                            org.telegram.messenger.i0.v1(biVar3.f21589c.findFocus());
                        }
                        File w9 = vh.n5.w(biVar3.D3, "webp");
                        Point point = org.telegram.messenger.i0.f16026q;
                        int i152 = point.x;
                        int i162 = point.y;
                        if (i152 > 1080 || i162 > 1080) {
                            float min = Math.min(i152, i162) / 1080.0f;
                            i152 = (int) (i152 * min);
                            i162 = (int) (i162 * min);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(i152, i162, Bitmap.Config.ARGB_8888);
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w9));
                        } catch (Throwable th2) {
                            org.telegram.messenger.f8.g(th2, true);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList2 = new ArrayList();
                        org.telegram.messenger.ef efVar = new org.telegram.messenger.ef(0, w9.getAbsolutePath(), 0, false, 0, 0);
                        arrayList2.add(efVar);
                        PhotoViewer v14 = PhotoViewer.v1();
                        th thVar = new th(biVar3, efVar);
                        if (k2Var2 instanceof org.telegram.ui.un) {
                            unVar = (org.telegram.ui.un) k2Var2;
                        } else {
                            unVar = null;
                        }
                        v14.j2(arrayList2, 0, 11, false, thVar, unVar);
                        if (biVar3.f24740x1) {
                            PhotoViewer.v1().Z0(null, null, true, biVar3.A1);
                            return;
                        }
                        return;
                }
            }
        });
        imageView6.setVisibility(8);
        imageView6.setAlpha(0.0f);
        imageView6.setScaleX(0.6f);
        imageView6.setScaleY(0.6f);
        ah ahVar4 = new ah(this, context, 3);
        this.B2 = ahVar4;
        ahVar4.setFocusable(true);
        ahVar4.setFocusableInTouchMode(true);
        ahVar4.setVisibility(4);
        ahVar4.setScaleX(0.2f);
        ahVar4.setScaleY(0.2f);
        ahVar4.setAlpha(0.0f);
        ahVar4.setClipChildren(false);
        ahVar4.setClipToPadding(false);
        this.f21586b.addView(ahVar4, w7.b6.e(110, 50, 85));
        ih ihVar = new ih(context, p6Var, this);
        this.C2 = ihVar;
        ihVar.setImportantForAccessibility(2);
        ahVar4.addView(ihVar, w7.b6.e(-1, -1, 119));
        ihVar.setTranslationX(this.f21615t0);
        int L4 = org.telegram.messenger.i0.L(52.0f);
        int L5 = org.telegram.messenger.i0.L(38.0f);
        ihVar.I = L4;
        ihVar.J = L5;
        ihVar.M = org.telegram.messenger.i0.L(7.0f);
        ihVar.N = org.telegram.messenger.i0.L(6.0f);
        ihVar.f33040h0 = true;
        ihVar.setOnClickListener(new View.OnClickListener(this) {
            public final bi f28789b;

            {
                this.f28789b = this;
            }

            @Override
            public final void onClick(View view) {
                xh.i3 i3Var;
                int i142;
                boolean z14 = false;
                switch (r2) {
                    case 0:
                        bi biVar = this.f28789b;
                        if (biVar.f24721s2 != biVar.f24679h2) {
                            z14 = true;
                        }
                        biVar.N1(z14);
                        return;
                    case 1:
                        bi biVar2 = this.f28789b;
                        long j10 = biVar2.Q2;
                        if (j10 < 0 && (i3Var = (xh.i3) biVar2.f24717r2.get(-j10)) != null) {
                            org.telegram.ui.web.z0 webViewContainer = i3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.x("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        bi biVar3 = this.f28789b;
                        boolean z15 = biVar3.T1;
                        if (!z15) {
                            biVar3.u1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        bi biVar4 = this.f28789b;
                        boolean z16 = biVar4.T1;
                        if (z16) {
                            biVar4.u1(!z16, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f28789b.m1();
                        return;
                    case 5:
                        this.f28789b.U2.U(null, null);
                        return;
                    case 6:
                        bi biVar5 = this.f28789b;
                        if (biVar5.a2 != null) {
                            boolean T = ChatAttachAlertPhotoLayout.T();
                            boolean z17 = !T;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = biVar5.a2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.f23847s1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ef) {
                                        org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) entry.getValue();
                                        if (efVar.d()) {
                                            efVar.O = Boolean.valueOf(T);
                                            for (int i152 = 0; i152 < chatAttachAlertPhotoLayout2.E.getChildCount(); i152++) {
                                                View childAt = chatAttachAlertPhotoLayout2.E.getChildAt(i152);
                                                if (childAt instanceof org.telegram.ui.Cells.v5) {
                                                    org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) childAt;
                                                    if (v5Var.getPhotoEntry() == efVar) {
                                                        v5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.w0.f19025b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.tz.f18154i1 = z17;
                                edit.putBoolean("photoLiveDefault", z17).apply();
                                chatAttachAlertPhotoLayout2.w0();
                            }
                            biVar5.M1(true);
                            org.telegram.ui.ActionBar.t0 t0Var32 = biVar5.W2;
                            vh.p2 p2Var = biVar5.X2;
                            if (p2Var != null) {
                                p2Var.e(true);
                            }
                            vh.p2 p2Var2 = new vh.p2(biVar5.getContext(), 1);
                            biVar5.X2 = p2Var2;
                            if (!T) {
                                i142 = 2131748842;
                            } else {
                                i142 = 2131748843;
                            }
                            p2Var2.s(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(i142, null)));
                            biVar5.X2.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
                            biVar5.X2.m(1.0f, -((biVar5.f21586b.getWidth() - ((t0Var32.getWidth() / 2.0f) + t0Var32.getX())) - org.telegram.messenger.i0.L(14.0f)));
                            biVar5.X2.setTranslationY(biVar5.U2.getTranslationY());
                            vh.p2 p2Var3 = biVar5.X2;
                            p2Var3.f51740l0 = new cd(5, biVar5, p2Var2);
                            biVar5.f21586b.addView(p2Var3, w7.b6.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            biVar5.X2.u();
                            return;
                        }
                        return;
                    case 7:
                        uh uhVar = this.f28789b.f24721s2;
                        if (uhVar != null) {
                            uhVar.w(40);
                            return;
                        }
                        return;
                    default:
                        this.f28789b.f24671e3.U(null, null);
                        return;
                }
            }
        });
        ihVar.setOnLongClickListener(new org.telegram.ui.bg(this, context, p6Var, k2Var, 1));
        textPaint.setTextSize(org.telegram.messenger.i0.L(12.0f));
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        ch chVar2 = new ch(this, context, 1);
        chVar2.setAlpha(0.0f);
        chVar2.setScaleX(0.2f);
        chVar2.setScaleY(0.2f);
        if (z10) {
            P0();
            this.F0 = -1;
        }
        zj0 fastScroll = chatAttachAlertPhotoLayout.E.getFastScroll();
        tg.b bVar5 = this.B4;
        wg.d o10 = w7.b9.o(p6Var);
        tk0 tk0Var = fastScroll.f33095p0;
        vg.f c15 = bVar5.c(tk0Var.f30605d1, o10, false);
        fastScroll.f33083e0 = c15;
        c15.p(org.telegram.messenger.i0.L(4.0f));
        fastScroll.f33083e0.q(org.telegram.messenger.i0.L(24.0f));
        vg.f c16 = bVar5.c(tk0Var.f30605d1, o10, false);
        fastScroll.f33085f0 = c16;
        c16.p(org.telegram.messenger.i0.L(6.0f));
        fastScroll.f33085f0.t(org.telegram.messenger.i0.L(4.0f));
        fastScroll.f33085f0.q(org.telegram.messenger.i0.L(f7));
        zc0 zc0Var = new zc0(context);
        this.J1 = zc0Var;
        this.f21586b.addView(zc0Var, w7.b6.c(-1.0f, -1));
        wg.d dVar = new wg.d(p6Var);
        dVar.e = new ig(this, 5);
        dVar.f52847c = new ig(this, 6);
        dVar.d = new ig(this, 7);
        dVar.f52846b = new ig(this, 8);
        float N7 = org.telegram.messenger.i0.N(3.3333333f);
        float N8 = org.telegram.messenger.i0.N(0.6666667f);
        dVar.f52849n = N7;
        dVar.f52850r = N8;
        float N9 = org.telegram.messenger.i0.N(1.0f);
        float N10 = org.telegram.messenger.i0.N(0.6666667f);
        dVar.f52848f = N9;
        dVar.h = N10;
        g1Var.M(this.B4, dVar, false);
        mVar.l(1L, false);
        this.X0.i(this.f21586b);
        ei.r rVar2 = this.X0;
        rVar2.f6670a = new ig(this, 9);
        rVar2.d = new gi.b(org.telegram.messenger.i0.L(48.0f));
    }

    public static void I0(bi biVar) {
        boolean z10;
        boolean q6;
        int i10;
        kg.g1 g1Var = biVar.R2;
        bh.i iVar = biVar.f24710p3;
        if (iVar != null && g1Var != null) {
            uh uhVar = biVar.f24725t2;
            if (uhVar == null) {
                uhVar = biVar.f24721s2;
            }
            int i11 = 0;
            if (uhVar != null && (uhVar instanceof kk)) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.ActionBar.p6 p6Var = biVar.I0;
            if (p6Var != null) {
                q6 = p6Var.a();
            } else {
                q6 = org.telegram.ui.ActionBar.t6.I.q();
            }
            if (!z10 && g1Var.getVisibility() == 0) {
                if (q6) {
                    i10 = 255;
                } else {
                    i10 = 160;
                }
                i11 = (int) (g1Var.getAlpha() * i10);
            }
            iVar.setFadeTopAlpha(i11);
        }
    }

    public static void K0(bi biVar) {
        oh ohVar = new oh(biVar, biVar.getContext(), biVar.Q1, LaunchActivity.Q(), biVar.I0, 0);
        biVar.f24746y4 = ohVar;
        ohVar.p(new k2.m0(biVar));
        ViewGroup viewGroup = biVar.f21586b;
        viewGroup.addView(biVar.f24746y4, viewGroup.indexOfChild(biVar.f24741x2), w7.b6.e(-1, -1, 83));
        oh ohVar2 = biVar.f24746y4;
        ohVar2.getAdapter().f55647c = false;
        ohVar2.getAdapter().d = false;
        ohVar2.getAdapter().e = false;
        org.telegram.ui.ActionBar.k2 k2Var = biVar.W1;
        boolean z10 = true;
        if (k2Var instanceof org.telegram.ui.un) {
            ohVar2.getAdapter().m0 = false;
            org.telegram.ui.un unVar = (org.telegram.ui.un) k2Var;
            zf.x0 adapter = ohVar2.getAdapter();
            unVar.j();
            TLRPC.Chat chat = unVar.e;
            adapter.getClass();
            adapter.f55658l0 = chat;
            ohVar2.getAdapter().W(unVar.f42374p8);
            zf.x0 adapter2 = ohVar2.getAdapter();
            if (unVar.e == null) {
                z10 = false;
            }
            adapter2.f55650e0 = z10;
        } else {
            ohVar2.getAdapter().m0 = true;
            ohVar2.getAdapter().W(null);
            ohVar2.getAdapter().f55650e0 = false;
        }
        ohVar2.getAdapter().f55652f0 = false;
        biVar.I1();
    }

    public static int L0(bi biVar) {
        uh uhVar = biVar.f24721s2;
        jn jnVar = biVar.f24667d2;
        if (uhVar == jnVar && jnVar.E != null) {
            return jnVar.getEmojiPadding();
        }
        jn jnVar2 = biVar.f24670e2;
        if (uhVar == jnVar2 && jnVar2.E != null) {
            return jnVar2.getEmojiPadding();
        }
        if (biVar.T1) {
            return biVar.J2.getEmojiPadding();
        }
        return biVar.f24745y2.getEmojiPadding();
    }

    public static boolean f1(TLRPC.User user) {
        if (user != null && !org.telegram.messenger.h20.B(user) && !org.telegram.messenger.h20.t(user) && !org.telegram.messenger.h20.x(user) && !org.telegram.messenger.h20.A(user.f19942id) && !org.telegram.messenger.h20.z(user) && !org.telegram.messenger.h20.s(user) && user.f19942id != 489000 && !org.telegram.messenger.vp.E2(user)) {
            return true;
        }
        return false;
    }

    public static void r1(uh uhVar) {
        if (uhVar != null) {
            int i10 = org.telegram.ui.ActionBar.a7.f20158b;
            Object tag = uhVar.getTag(2131296710);
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == i10) {
                return;
            }
            uhVar.setTag(2131296710, Integer.valueOf(i10));
            try {
                org.telegram.ui.ActionBar.a7.d0(uhVar, true);
                uhVar.d();
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
    }

    public final void A1(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bi.A1(boolean):void");
    }

    public final void B1(long r26, java.lang.String r28, boolean r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bi.B1(long, java.lang.String, boolean, boolean):void");
    }

    public final void C1(org.telegram.ui.ActionBar.k2 k2Var) {
        if ((k2Var instanceof org.telegram.ui.un) && org.telegram.messenger.w3.V(((org.telegram.ui.un) k2Var).e)) {
            new cc(this.f24695l3, this.I0).f(org.telegram.messenger.vp.r1(this.D3).V4, new cd(6, this, k2Var)).j();
        }
    }

    public final boolean D1(boolean z10, boolean z11) {
        boolean z12;
        Integer num;
        boolean z13;
        float f7;
        float f10;
        float f11;
        int i10;
        float f12;
        float f13;
        float f14;
        int i11;
        float f15;
        float f16;
        float f17;
        uh uhVar;
        float f18;
        float L;
        long M1;
        float f19;
        float f20;
        kg.g1 g1Var;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        float f27;
        float L2;
        this.f24686j1.a(z10, true);
        ah ahVar = this.f24741x2;
        if (ahVar.getTag() != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z10 == z12) {
            return false;
        }
        AnimatorSet animatorSet = this.G2;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        ahVar.setTag(num);
        dh dhVar = this.f24745y2;
        if (dhVar.getEditText().isFocused()) {
            org.telegram.messenger.i0.v1(dhVar.getEditText());
        }
        dhVar.k(true);
        this.J2.k(true);
        ah ahVar2 = this.f24718r3;
        ah ahVar3 = this.B2;
        if (z10) {
            if (!this.E1) {
                ahVar.setVisibility(0);
            }
            ahVar3.setVisibility(0);
        } else if (this.M2) {
            ahVar2.setVisibility(0);
        }
        uh uhVar2 = this.f24721s2;
        if ((uhVar2 == this.a2 || uhVar2 == this.f24679h2) && this.T1) {
            z13 = true;
        } else {
            z13 = false;
        }
        kg.g1 g1Var2 = this.R2;
        fg.i iVar = this.I2;
        ag.q qVar = this.f24737w2;
        ih ihVar = this.C2;
        float f28 = 1.0f;
        if (z11) {
            this.G2 = new AnimatorSet();
            if (z13) {
                iVar.setVisibility(0);
            }
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            if (z10) {
                f19 = 1.0f;
            } else {
                f19 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(ahVar, property, f19));
            if (z10 && !z13) {
                f20 = 1.0f;
            } else {
                f20 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(qVar, property, f20));
            if (z10 && !z13) {
                qVar.setVisibility(0);
                g1Var = g1Var2;
                arrayList.add(ObjectAnimator.ofFloat(qVar, View.TRANSLATION_Y, 0.0f));
            } else {
                g1Var = g1Var2;
            }
            if (z10 && z13) {
                f21 = 1.0f;
            } else {
                f21 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(iVar, property, f21));
            Property property2 = View.SCALE_X;
            if (z10) {
                f22 = 1.0f;
            } else {
                f22 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(ahVar3, property2, f22));
            Property property3 = View.SCALE_Y;
            if (z10) {
                f23 = 1.0f;
            } else {
                f23 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(ahVar3, property3, f23));
            if (z10) {
                f24 = 1.0f;
            } else {
                f24 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(ahVar3, property, f24));
            if (z10) {
                f25 = 1.0f;
            } else {
                f25 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(ihVar, property2, f25));
            if (z10) {
                f26 = 1.0f;
            } else {
                f26 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(ihVar, property3, f26));
            if (g1Var.getTag() != null) {
                Property property4 = View.TRANSLATION_Y;
                if (z10) {
                    L2 = 0.0f;
                } else {
                    L2 = org.telegram.messenger.i0.L(48.0f);
                }
                arrayList.add(ObjectAnimator.ofFloat(ahVar, property4, L2));
            } else if (this.M2) {
                Property property5 = View.TRANSLATION_Y;
                if (z10) {
                    f27 = org.telegram.messenger.i0.L(36.0f);
                } else {
                    f27 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(ahVar2, property5, f27));
                if (z10) {
                    f28 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(ahVar2, property, f28));
            }
            if (z13) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new kg(this, 5));
                arrayList.add(ofFloat);
            }
            this.G2.playTogether(arrayList);
            this.G2.setInterpolator(new DecelerateInterpolator());
            this.G2.setDuration(180L);
            this.G2.addListener(new org.telegram.ui.ActionBar.g(this, z10, z13, 3));
            this.G2.start();
            i10 = 0;
        } else {
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ahVar.setAlpha(f7);
            if (z10 && z13) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            qVar.setAlpha(f10);
            if (z10 && !z13) {
                i10 = 0;
                qVar.setVisibility(0);
                f11 = 0.0f;
                qVar.setTranslationY(0.0f);
            } else {
                f11 = 0.0f;
                i10 = 0;
            }
            if (z10) {
                f12 = 1.0f;
            } else {
                f12 = 0.2f;
            }
            ahVar3.setScaleX(f12);
            if (z10) {
                f13 = 1.0f;
            } else {
                f13 = 0.2f;
            }
            ahVar3.setScaleY(f13);
            if (z10) {
                f14 = 1.0f;
            } else {
                f14 = f11;
            }
            ahVar3.setAlpha(f14);
            if (z10 && z13) {
                i11 = i10;
            } else {
                i11 = 8;
            }
            iVar.setVisibility(i11);
            if (z10 && z13) {
                f15 = 1.0f;
            } else {
                f15 = f11;
            }
            iVar.setAlpha(f15);
            if (z10) {
                f16 = 1.0f;
            } else {
                f16 = 0.2f;
            }
            ihVar.setScaleX(f16);
            if (z10) {
                f17 = 1.0f;
            } else {
                f17 = 0.2f;
            }
            ihVar.setScaleY(f17);
            if (g1Var2.getTag() != null) {
                if (z10) {
                    L = f11;
                } else {
                    L = org.telegram.messenger.i0.L(48.0f);
                }
                ahVar.setTranslationY(L);
            } else if (this.M2 && ((uhVar = this.f24721s2) == null || uhVar.L())) {
                if (z10) {
                    f18 = org.telegram.messenger.i0.L(84.0f);
                } else {
                    f18 = f11;
                }
                ahVar2.setTranslationY(f18);
            }
            if (!z10) {
                ahVar.setVisibility(4);
                ahVar3.setVisibility(4);
            }
            if (z13) {
                P1();
            }
        }
        if (z10) {
            i10 = Math.max(1, this.f24721s2.getSelectedItemsCount());
        }
        ihVar.g(i10, z11);
        if (this.B3 != null) {
            M1 = 0;
        } else {
            M1 = org.telegram.messenger.vp.r1(this.D3).M1(a1());
        }
        ihVar.i(W0() + this.f24721s2.getSelectedItemsCount(), M1, true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) dhVar.getLayoutParams();
        int max = Math.max(org.telegram.messenger.i0.L(48.0f), ihVar.l());
        if (marginLayoutParams.rightMargin != max) {
            marginLayoutParams.rightMargin = max;
            dhVar.setLayoutParams(marginLayoutParams);
        }
        return true;
    }

    public final void E1(uh uhVar) {
        long j10 = this.Q2;
        kn knVar = this.K1;
        if (uhVar == knVar) {
            j10 = knVar.f27828s;
        } else if (uhVar == this.a2) {
            j10 = 1;
        } else if (uhVar == this.f24664c2) {
            j10 = 3;
        } else if (uhVar == this.f24676g2) {
            j10 = 4;
        } else if (uhVar == this.f24661b2) {
            j10 = 5;
        } else if (uhVar == this.f24673f2) {
            j10 = 6;
        } else if (uhVar == this.f24667d2) {
            j10 = 9;
        } else if (uhVar == this.f24683i2) {
            j10 = 10;
        } else if (uhVar == this.f24687j2) {
            j10 = 11;
        } else if (uhVar == this.f24670e2) {
            j10 = 12;
        } else if (uhVar == this.f24691k2) {
            j10 = 14;
        } else if (uhVar == this.f24694l2) {
            j10 = 13;
        } else if (uhVar == this.f24697m2) {
            j10 = 16;
        } else if (uhVar == this.f24701n2) {
            j10 = 17;
        }
        F1(uhVar, j10, true);
    }

    public final void F1(uh uhVar, long j10, boolean z10) {
        boolean z11;
        int i10;
        yl ylVar;
        boolean z12;
        Integer num;
        yl ylVar2;
        int i11;
        int L;
        Float f7;
        int i12;
        boolean z13;
        Float valueOf = Float.valueOf(0.0f);
        if (this.f24702n3 == null && this.G2 == null) {
            uh uhVar2 = this.f24721s2;
            if (uhVar2 == uhVar) {
                uhVar2.I();
                return;
            }
            int i13 = 0;
            if (uhVar == this.f24670e2 && !org.telegram.messenger.d20.i(this.D3).q()) {
                new kg.i1(this.W1, 39, false).show();
                return;
            }
            int i14 = (j10 > 1L ? 1 : (j10 == 1L ? 0 : -1));
            if (i14 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f24696m1.a(z11, z10);
            this.f24704o1.l(Long.valueOf(j10), z10);
            this.f24742x3 = false;
            this.f24734v3 = false;
            this.f24749z3 = 0.0f;
            this.y3.setVisibility(8);
            RadialProgressView radialProgressView = this.f24738w3;
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleX(0.1f);
            radialProgressView.setScaleY(0.1f);
            radialProgressView.setVisibility(8);
            ah ahVar = this.f24718r3;
            ahVar.setAlpha(1.0f);
            ahVar.setTranslationY(this.f24749z3);
            int i15 = 0;
            while (true) {
                LongSparseArray longSparseArray = this.f24717r2;
                if (i15 >= longSparseArray.size()) {
                    break;
                }
                ((xh.i3) longSparseArray.valueAt(i15)).setMeasureOffsetY(0);
                i15++;
            }
            this.Q2 = j10;
            bh bhVar = this.f24722s3;
            int childCount = bhVar.getChildCount();
            int i16 = 0;
            while (i16 < childCount) {
                View childAt = bhVar.getChildAt(i16);
                if (childAt instanceof wh) {
                    wh whVar = (wh) childAt;
                    i12 = childCount;
                    f7 = valueOf;
                    if (whVar.f32182b == whVar.f32183c.Q2) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    whVar.f32471a.f(z13, true);
                } else {
                    f7 = valueOf;
                    i12 = childCount;
                    if (childAt instanceof vh) {
                        ((vh) childAt).a(true);
                    }
                }
                i16++;
                childCount = i12;
                valueOf = f7;
            }
            Float f10 = valueOf;
            int firstOffset = (this.f24721s2.getFirstOffset() - org.telegram.messenger.i0.L(11.0f)) - this.V3[0];
            this.f24725t2 = uhVar;
            boolean e = uhVar.e();
            bh.i iVar = this.f24710p3;
            if (iVar != null) {
                if (e) {
                    L = 0;
                } else {
                    L = org.telegram.messenger.i0.L(48.0f);
                }
                iVar.setFadeHeightBottom(L);
            }
            ch chVar = this.f24714q3;
            if (chVar != null) {
                if (e) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                chVar.setVisibility(i11);
            }
            if (this.f24725t2.i() != 0) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            kg.g1 g1Var = this.R2;
            g1Var.setVisibility(i10);
            if (g1Var.f20497n0) {
                g1Var.k(true);
            }
            this.f24721s2.t();
            uh uhVar3 = this.f24725t2;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.a2;
            if (uhVar3 == chatAttachAlertPhotoLayout) {
                chatAttachAlertPhotoLayout.setCheckCameraWhenShown(true);
            }
            this.f24725t2.G(this.f24721s2);
            this.f24725t2.setVisibility(0);
            if (uhVar.getParent() != null) {
                this.f21586b.removeView(this.f24725t2);
            }
            int indexOfChild = this.f21586b.indexOfChild(this.f24721s2);
            if (this.f24725t2.getParent() != this.f21586b) {
                r1(this.f24725t2);
                ViewGroup viewGroup = this.f21586b;
                uh uhVar4 = this.f24725t2;
                if (uhVar4 != this.f24673f2) {
                    indexOfChild++;
                }
                viewGroup.addView(uhVar4, indexOfChild, w7.b6.c(-1.0f, -1));
            }
            mg mgVar = new mg(this, 5);
            uh uhVar5 = this.f24721s2;
            boolean z14 = uhVar5 instanceof jm;
            mh mhVar = this.V1;
            if (!z14 && !(this.f24725t2 instanceof jm)) {
                if (z10) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    this.f24725t2.setAlpha(0.0f);
                    this.f24725t2.setTranslationY(org.telegram.messenger.i0.L(78.0f));
                    animatorSet.playTogether(ObjectAnimator.ofFloat(this.f24721s2, View.TRANSLATION_Y, org.telegram.messenger.i0.L(78.0f) + firstOffset), ObjectAnimator.ofFloat(this.f24721s2, mhVar, 0.0f, 1.0f), ObjectAnimator.ofFloat(g1Var, View.ALPHA, g1Var.getAlpha(), 0.0f));
                    animatorSet.setDuration(180L);
                    animatorSet.setInterpolator(gr.f26495f);
                    animatorSet.addListener(new jh(this, firstOffset, mgVar, 0));
                    this.f24702n3 = animatorSet;
                    uh uhVar6 = this.f24721s2;
                    mhVar.getClass();
                    mhVar.a(uhVar6, f10);
                    animatorSet.start();
                } else {
                    uhVar5.setAlpha(0.0f);
                    mgVar.run();
                    O1(0);
                    this.f21586b.invalidate();
                }
            } else {
                int max = Math.max(this.f24725t2.getWidth(), this.f24721s2.getWidth());
                uh uhVar7 = this.f24725t2;
                if (uhVar7 instanceof jm) {
                    uhVar7.setTranslationX(max);
                    uh uhVar8 = this.f24721s2;
                    if ((uhVar8 instanceof ChatAttachAlertPhotoLayout) && (ylVar2 = ((ChatAttachAlertPhotoLayout) uhVar8).P) != null) {
                        ylVar2.setVisibility(4);
                    }
                } else {
                    this.f24721s2.setTranslationX(-max);
                    uh uhVar9 = this.f24725t2;
                    if (uhVar9 == chatAttachAlertPhotoLayout && (ylVar = ((ChatAttachAlertPhotoLayout) uhVar9).P) != null) {
                        ylVar.setVisibility(0);
                    }
                }
                this.f24725t2.setAlpha(1.0f);
                this.f24721s2.setAlpha(1.0f);
                if (z10) {
                    uh uhVar10 = this.f24721s2;
                    mhVar.getClass();
                    mhVar.a(uhVar10, f10);
                    org.telegram.messenger.i0.g3(new jg(this, uhVar, mgVar, 0));
                } else {
                    if (this.f24725t2.getCurrentItemTop() <= uhVar.getButtonsHideOffset()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.f24721s2.u(1.0f);
                    this.f24725t2.u(1.0f);
                    this.f24721s2.l(this.f24675f4);
                    this.f24725t2.l(this.f24675f4);
                    this.f21586b.invalidate();
                    this.X0.g();
                    uh uhVar11 = this.f24721s2;
                    Float valueOf2 = Float.valueOf(1.0f);
                    mhVar.getClass();
                    mhVar.a(uhVar11, valueOf2);
                    if (z12) {
                        num = 1;
                    } else {
                        num = null;
                    }
                    g1Var.setTag(num);
                    mgVar.run();
                }
            }
            if (this.f24678g4 && !(uhVar instanceof xh.i3)) {
                this.f24678g4 = false;
                g1Var.updateColors();
                g1Var.invalidate();
                h1();
            }
            if (i14 != 0 && j10 != 6 && j10 != 17 && !(uhVar instanceof xh.i3)) {
                if (j10 == 4) {
                    i13 = org.telegram.messenger.i0.L(84.0f);
                }
            } else {
                i13 = org.telegram.messenger.i0.L(46.0f);
            }
            g1Var.setForcedMenuWidth(i13);
        }
    }

    public final void G1(boolean z10, Boolean bool) {
        bi biVar;
        if (this.f24667d2 == null) {
            biVar = this;
            jn jnVar = new jn(biVar, getContext(), false, this.I0, bool);
            biVar.f24667d2 = jnVar;
            biVar.f24713q2[1] = jnVar;
            jnVar.setDelegate(new ig(this, 17));
        } else {
            biVar = this;
        }
        F1(biVar.f24667d2, 9L, z10);
    }

    @Override
    public final boolean H() {
        return false;
    }

    @Override
    public final boolean H0() {
        uh uhVar = this.f24721s2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.a2;
        if (uhVar == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout.f23867i1) {
            return true;
        }
        return false;
    }

    public final void H1(boolean z10, boolean z11) {
        Integer num;
        boolean z12;
        float f7;
        float f10;
        uh uhVar;
        float f11;
        float f12;
        float f13;
        int i10;
        boolean z13;
        this.f24690k1.a(z10, z11);
        kg.g1 g1Var = this.R2;
        if ((z10 && g1Var.getTag() == null) || (!z10 && g1Var.getTag() != null)) {
            if (z10) {
                num = 1;
            } else {
                num = null;
            }
            g1Var.setTag(num);
            AnimatorSet animatorSet = this.S2;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.S2 = null;
            }
            if (!this.f24736w1 && !this.N2 && ((this.K2 != 0 || !this.f24692k3) && this.f24721s2 == this.a2 && (this.F3 || this.G3))) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (this.f24721s2 == this.K1) {
                z12 = false;
            }
            ah ahVar = this.f24718r3;
            org.telegram.ui.ActionBar.t0 t0Var = this.U2;
            if (z10) {
                if (z12) {
                    t0Var.setVisibility(0);
                    t0Var.setClickable(true);
                }
            } else if (this.M2 && this.f24741x2.getTag() == null) {
                ahVar.setVisibility(0);
            }
            org.telegram.ui.ActionBar.k2 k2Var = this.W1;
            if (k2Var != null) {
                if (z10) {
                    if (this.f24663b4) {
                        i10 = org.telegram.ui.ActionBar.t6.f21011hh;
                    } else {
                        i10 = org.telegram.ui.ActionBar.t6.f21001h5;
                    }
                    if (i0.b.h(org.telegram.ui.ActionBar.t6.w0(i10, this.I0)) > 0.699999988079071d) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    org.telegram.messenger.i0.p3(this, z13);
                } else {
                    org.telegram.messenger.i0.p3(this, k2Var.isLightStatusBar());
                }
            }
            float f14 = 0.6f;
            float f15 = 0.0f;
            if (z11) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.S2 = animatorSet2;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                animatorSet2.setDuration(Math.abs(f11 - g1Var.getAlpha()) * 180.0f);
                ArrayList arrayList = new ArrayList();
                Property property = View.ALPHA;
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(g1Var, property, f12);
                ofFloat.addUpdateListener(new kg(this, 4));
                arrayList.add(ofFloat);
                if (z12) {
                    if (z10) {
                        f15 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(t0Var, property, f15));
                    Property property2 = View.SCALE_X;
                    if (z10) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.6f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(t0Var, property2, f13));
                    Property property3 = View.SCALE_Y;
                    if (z10) {
                        f14 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(t0Var, property3, f14));
                }
                this.S2.playTogether(arrayList);
                this.S2.addListener(new eg.m(18, this, z10));
                this.S2.setInterpolator(gr.h);
                this.S2.setDuration(380L);
                this.S2.start();
                return;
            }
            if (z10 && this.M2 && ((uhVar = this.f24721s2) == null || uhVar.L())) {
                ahVar.setVisibility(4);
            }
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            g1Var.setAlpha(f7);
            if (z12) {
                if (z10) {
                    f15 = 1.0f;
                }
                t0Var.setAlpha(f15);
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.6f;
                }
                t0Var.setScaleX(f10);
                if (z10) {
                    f14 = 1.0f;
                }
                t0Var.setScaleY(f14);
            }
            if (!z10) {
                org.telegram.ui.ActionBar.t0 t0Var2 = this.Y2;
                if (t0Var2 != null) {
                    t0Var2.setVisibility(4);
                }
                if (this.K2 != 0 || !this.f24692k3) {
                    t0Var.setVisibility(4);
                }
            }
        }
    }

    @Override
    public final boolean I() {
        return this.f24721s2.b();
    }

    public final void I1() {
        float alpha;
        int[] iArr = this.A2;
        dh dhVar = this.f24745y2;
        dhVar.getLocationOnScreen(iArr);
        if (this.f24746y4 != null) {
            uh uhVar = this.f24721s2;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.a2;
            if ((uhVar == chatAttachAlertPhotoLayout || uhVar == this.f24679h2) && this.T1) {
                fg.i iVar = this.I2;
                alpha = (iVar.getAlpha() * iVar.getMeasuredHeight()) + (iVar.getY() - this.f24746y4.getTop());
            } else {
                alpha = -dhVar.getHeight();
            }
            if (Math.abs(this.f24746y4.getTranslationY() - alpha) > 0.5f) {
                this.f24746y4.setTranslationY(alpha);
                this.f24746y4.invalidate();
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.W();
                }
            }
        }
        T0();
    }

    public final void J1(int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bi.J1(int):void");
    }

    @Override
    public final void K() {
        AnimatorSet animatorSet = this.f21624z0;
        if (animatorSet != null) {
            animatorSet.cancel();
            o1.j jVar = this.f24689j4;
            if (jVar != null) {
                jVar.d();
            }
            AnimatorSet animatorSet2 = this.f24693k4;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            this.f21624z0 = null;
            this.A0 = 0;
        }
    }

    public final void K1() {
        boolean h;
        float f7;
        float f10;
        float f11;
        uh uhVar = this.f24721s2;
        int i10 = 0;
        if (uhVar == null) {
            h = false;
        } else {
            h = uhVar.h();
        }
        bi.j6 j6Var = this.Z2;
        j6Var.setEnabled(h);
        uh uhVar2 = this.f24721s2;
        float f12 = 0.5f;
        if (uhVar2 != null) {
            if (uhVar2.h()) {
                f10 = 1.0f;
            } else {
                f10 = 0.5f;
            }
            if (this.f24725t2 == null) {
                f11 = 1.0f;
            } else {
                f11 = this.U1;
            }
            f7 = (f10 * f11) + 0.0f;
        } else {
            f7 = 0.0f;
        }
        uh uhVar3 = this.f24725t2;
        if (uhVar3 != null) {
            if (uhVar3.h()) {
                f12 = 1.0f;
            }
            f7 = c3.i0.z(1.0f, this.U1, f12, f7);
        }
        this.f24659a3 = f7;
        if (j6Var != null) {
            float f13 = f7 * this.f24662b3;
            j6Var.setAlpha(f13);
            if (f13 <= 0.0f) {
                i10 = 4;
            }
            j6Var.setVisibility(i10);
        }
    }

    @Override
    public void L() {
        ai aiVar = this.T3;
        if (aiVar != null) {
            aiVar.C(new mg(this, 4));
        } else {
            s1();
        }
    }

    public final void L1(uh uhVar, int i10) {
        boolean z10;
        int i11;
        int i12;
        if (uhVar != null) {
            tg.f fVar = this.f24750z4;
            if (fVar != null && Build.VERSION.SDK_INT >= 31) {
                fVar.f(0.0f, i10);
            }
            int currentItemTop = uhVar.getCurrentItemTop();
            if (currentItemTop != Integer.MAX_VALUE) {
                boolean z11 = false;
                if (uhVar == this.f24721s2 && currentItemTop <= uhVar.getButtonsHideOffset()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.I1 = z10;
                if (uhVar == this.f24721s2) {
                    H1(z10, true);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) uhVar.getLayoutParams();
                if (layoutParams == null) {
                    i11 = 0;
                } else {
                    i11 = layoutParams.topMargin;
                }
                int D = org.telegram.messenger.z20.D(11.0f, i11, currentItemTop);
                uh uhVar2 = this.f24721s2;
                if (uhVar2 == uhVar) {
                    i12 = 0;
                } else {
                    i12 = 1;
                }
                if ((uhVar2 instanceof jm) || (this.f24725t2 instanceof jm)) {
                    Object obj = this.f24702n3;
                    if ((obj instanceof o1.j) && ((o1.j) obj).f13951f) {
                        z11 = true;
                    }
                }
                int[] iArr = this.V3;
                int i13 = iArr[i12];
                if (i13 == D && !z11) {
                    if (i10 != 0) {
                        this.W3 = i13;
                        return;
                    }
                    return;
                }
                this.W3 = i13;
                iArr[i12] = D;
                O1(i12);
                this.f21586b.invalidate();
            }
        }
    }

    public final void M0() {
        if (Z0().f32239a.length() <= 0) {
            return;
        }
        this.f24721s2.a(Z0().getText());
    }

    public final void M1(boolean z10) {
        ob0 ob0Var;
        boolean z11;
        float f7;
        float f10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.a2;
        if (chatAttachAlertPhotoLayout != null && (ob0Var = this.V2) != null) {
            int i10 = 0;
            if (this.f24692k3 && this.Z1 && this.f24721s2 == chatAttachAlertPhotoLayout && ChatAttachAlertPhotoLayout.d0()) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z12 = !ChatAttachAlertPhotoLayout.T();
            ob0Var.f29027f = z12;
            if (!z10) {
                ((t5) ob0Var.f29028g).a(z12);
            }
            ob0Var.invalidateSelf();
            float f11 = 0.0f;
            float f12 = 0.6f;
            org.telegram.ui.ActionBar.t0 t0Var = this.W2;
            if (z10 && this.f24692k3) {
                t0Var.setVisibility(0);
                ViewPropertyAnimator animate = t0Var.animate();
                if (z11) {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f11);
                if (z11) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.6f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f10);
                if (z11) {
                    f12 = 1.0f;
                }
                scaleX.scaleY(f12).setDuration(320L).setInterpolator(gr.h).withEndAction(new wg(this, z11, 0)).start();
                return;
            }
            if (!z11) {
                i10 = 8;
            }
            t0Var.setVisibility(i10);
            if (z11) {
                f11 = 1.0f;
            }
            t0Var.setAlpha(f11);
            if (z11) {
                f7 = 1.0f;
            } else {
                f7 = 0.6f;
            }
            t0Var.setScaleX(f7);
            if (z11) {
                f12 = 1.0f;
            }
            t0Var.setScaleY(f12);
        }
    }

    @Override
    public final void N(int i10) {
        super.N(i10);
        this.f24721s2.q(i10);
    }

    public final boolean N0() {
        org.telegram.ui.ActionBar.k2 k2Var = this.W1;
        if ((k2Var instanceof org.telegram.ui.un) && ((org.telegram.ui.un) k2Var).S6()) {
            return true;
        }
        return false;
    }

    public final void N1(boolean z10) {
        boolean z11;
        float f7;
        uh uhVar = this.a2;
        if (z10) {
            if (!this.D1) {
                return;
            }
            if (this.f24679h2 == null) {
                Context context = getContext();
                org.telegram.ui.ActionBar.p6 p6Var = this.f24708p1;
                if (p6Var == null) {
                    p6Var = this.I0;
                }
                ?? uhVar2 = new uh(context, p6Var, this);
                uhVar2.D = 0.0f;
                uhVar2.E = 0.0f;
                uhVar2.F = 0.0f;
                uhVar2.G = 0.0f;
                uhVar2.H = 0.0f;
                uhVar2.I = 0.0f;
                uhVar2.J = null;
                uhVar2.K = false;
                uhVar2.M = 0.0f;
                uhVar2.Q = false;
                uhVar2.S = false;
                Point point = org.telegram.messenger.i0.f16026q;
                if (point.y > point.x) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                uhVar2.T = z11;
                uhVar2.f27401n = p6Var;
                uhVar2.f30949f = true;
                uhVar2.setWillNotDraw(false);
                bi biVar = uhVar2.f30947b;
                org.telegram.ui.ActionBar.y p5 = biVar.R2.p();
                TextView textView = new TextView(context);
                uhVar2.f27406y = textView;
                org.telegram.ui.ActionBar.p6 p6Var2 = uhVar2.f30946a;
                tl tlVar = new tl(uhVar2, context, p5, p6Var2, 1);
                kg.g1 g1Var = biVar.R2;
                if (org.telegram.messenger.i0.Q1()) {
                    f7 = 64.0f;
                } else {
                    f7 = 56.0f;
                }
                g1Var.addView(tlVar, 0, w7.b6.d(-2, -1.0f, 51, f7, 0.0f, 40.0f, 0.0f));
                textView.setImportantForAccessibility(2);
                textView.setGravity(3);
                textView.setSingleLine(true);
                textView.setLines(1);
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21037j5, p6Var2);
                textView.setText(org.telegram.messenger.cd.L0(2131753958, null));
                textView.setTypeface(org.telegram.messenger.i0.o());
                textView.setCompoundDrawablePadding(org.telegram.messenger.i0.L(4.0f));
                textView.setPadding(0, 0, org.telegram.messenger.i0.L(10.0f), 0);
                textView.setAlpha(0.0f);
                tlVar.addView(textView, w7.b6.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
                ag.b1 b1Var = new ag.b1(uhVar2, context, p6Var2, 12);
                uhVar2.f27402r = b1Var;
                b1Var.setAdapter(new org.telegram.ui.x7(uhVar2, 3));
                s4.a0 a0Var = new s4.a0(1, false);
                uhVar2.f27403s = a0Var;
                b1Var.setLayoutManager(a0Var);
                b1Var.setClipChildren(false);
                b1Var.setClipToPadding(false);
                b1Var.setOverScrollMode(2);
                b1Var.setVerticalScrollBarEnabled(false);
                im imVar = new im(uhVar2, context);
                uhVar2.f27404w = imVar;
                imVar.setClipToPadding(true);
                imVar.setClipChildren(true);
                uhVar2.addView(b1Var, w7.b6.c(-1.0f, -1));
                uhVar2.P = biVar.a2;
                imVar.f27010c.clear();
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = uhVar2.P;
                imVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
                imVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
                imVar.c();
                UndoView undoView = new UndoView(context, null, false, biVar.f24708p1);
                uhVar2.f27405x = undoView;
                undoView.setEnterOffsetMargin(org.telegram.messenger.i0.L(32.0f));
                uhVar2.addView(undoView, w7.b6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 52.0f));
                uhVar2.N = context.getResources().getDrawable(2131232546);
                this.f24679h2 = uhVar2;
                uhVar2.bringToFront();
            }
            uh uhVar3 = this.f24721s2;
            jm jmVar = this.f24679h2;
            if (uhVar3 != jmVar) {
                uhVar = jmVar;
            }
            E1(uhVar);
            return;
        }
        E1(uhVar);
    }

    public final boolean O0(CharSequence charSequence) {
        org.telegram.ui.ActionBar.k2 k2Var = this.W1;
        if (k2Var instanceof org.telegram.ui.un) {
            return ChatActivityEnterView.C(this.D3, ((org.telegram.ui.un) k2Var).a(), k2Var, charSequence);
        }
        return false;
    }

    public final void O1(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bi.O1(int):void");
    }

    public final void P0() {
        int i10;
        int i11;
        int i12;
        boolean z10;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        bh bhVar = this.f24722s3;
        if (bhVar == null) {
            return;
        }
        int childCount = bhVar.getChildCount();
        boolean z11 = false;
        for (int i18 = 0; i18 < childCount; i18++) {
            bhVar.getChildAt(i18);
        }
        boolean z12 = this.f24663b4;
        if (z12) {
            i10 = org.telegram.ui.ActionBar.t6.Vg;
        } else {
            i10 = org.telegram.ui.ActionBar.t6.f21037j5;
        }
        org.telegram.ui.ActionBar.a7.V(this.f24668d3, i10, this.I0);
        if (z12) {
            i11 = org.telegram.ui.ActionBar.t6.Vg;
        } else {
            i11 = org.telegram.ui.ActionBar.t6.f21037j5;
        }
        org.telegram.ui.ActionBar.a7.V(this.f24684i3, i11, this.I0);
        org.telegram.ui.ActionBar.a7.V(this.Z2, org.telegram.ui.ActionBar.t6.Gi, this.I0);
        if (z12) {
            i12 = org.telegram.ui.ActionBar.t6.Vg;
        } else {
            i12 = org.telegram.ui.ActionBar.t6.f21037j5;
        }
        int w02 = org.telegram.ui.ActionBar.t6.w0(i12, this.I0);
        if (this.f24703n4 && w02 == this.f24699m4) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f24703n4 = true;
        this.f24699m4 = w02;
        org.telegram.ui.ActionBar.t0 t0Var = this.U2;
        if (z10) {
            t0Var.setIconColor(w02);
        }
        Drawable background = t0Var.getBackground();
        if (z12) {
            i13 = org.telegram.ui.ActionBar.t6.Wg;
        } else {
            i13 = org.telegram.ui.ActionBar.t6.I5;
        }
        org.telegram.ui.ActionBar.t6.C1(org.telegram.ui.ActionBar.t6.w0(i13, this.I0), background);
        int i19 = org.telegram.ui.ActionBar.t6.E8;
        t0Var.O(org.telegram.ui.ActionBar.t6.w0(i19, this.I0), false);
        t0Var.O(org.telegram.ui.ActionBar.t6.w0(i19, this.I0), true);
        t0Var.H(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G8, this.I0));
        org.telegram.ui.ActionBar.t0 t0Var2 = this.W2;
        if (t0Var2 != null && z10) {
            t0Var2.setIconColor(w02);
        }
        org.telegram.ui.ActionBar.t0 t0Var3 = this.Y2;
        if (t0Var3 != null) {
            if (z10) {
                t0Var3.setIconColor(w02);
            }
            Drawable background2 = t0Var3.getBackground();
            if (z12) {
                i17 = org.telegram.ui.ActionBar.t6.Wg;
            } else {
                i17 = org.telegram.ui.ActionBar.t6.I5;
            }
            org.telegram.ui.ActionBar.t6.C1(org.telegram.ui.ActionBar.t6.w0(i17, this.I0), background2);
        }
        dh dhVar = this.f24745y2;
        org.telegram.ui.ActionBar.p6 p6Var = dhVar.M;
        rt rtVar = dhVar.f32239a;
        int i20 = dhVar.L;
        if (i20 == 0) {
            rtVar.setHintTextColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.H6, p6Var));
            int i21 = org.telegram.ui.ActionBar.t6.G6;
            rtVar.setCursorColor(org.telegram.ui.ActionBar.t6.w0(i21, p6Var));
            rtVar.setTextColor(org.telegram.ui.ActionBar.t6.w0(i21, p6Var));
        } else if (i20 != 2 && i20 != 3) {
            rtVar.setHintTextColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21222t5, p6Var));
            rtVar.setTextColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21037j5, p6Var));
        } else {
            rtVar.setHintTextColor(-1929379841);
            rtVar.setTextColor(-1);
            rtVar.setCursorColor(-1);
            rtVar.setHandlesColor(-1);
            rtVar.setHighlightColor(822083583);
            rtVar.D = -1;
        }
        dhVar.f32241c.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Le, p6Var), PorterDuff.Mode.MULTIPLY));
        st stVar = dhVar.d;
        if (stVar != null) {
            stVar.updateColors();
        }
        org.telegram.ui.ActionBar.a7.m(bhVar, 21, org.telegram.ui.ActionBar.t6.A5, this.I0);
        if (z12) {
            i14 = org.telegram.ui.ActionBar.t6.Vg;
        } else {
            i14 = org.telegram.ui.ActionBar.t6.f21037j5;
        }
        org.telegram.ui.ActionBar.p6 p6Var2 = this.I0;
        kg.g1 g1Var = this.R2;
        org.telegram.ui.ActionBar.a7.m(g1Var, 1, i14, p6Var2);
        if (z12) {
            i15 = org.telegram.ui.ActionBar.t6.Wg;
        } else {
            i15 = org.telegram.ui.ActionBar.t6.I5;
        }
        org.telegram.ui.ActionBar.a7.m(g1Var, 3, i15, this.I0);
        if (z12) {
            i16 = org.telegram.ui.ActionBar.t6.Vg;
        } else {
            i16 = org.telegram.ui.ActionBar.t6.f21037j5;
        }
        org.telegram.ui.ActionBar.a7.m(g1Var, 5, i16, this.I0);
        int c12 = c1(false);
        org.telegram.ui.ActionBar.t6.C1(c12, this.f21612r0);
        hi.c cVar = this.A4;
        if (cVar.f7711b != c12) {
            cVar.a(c12);
            bh.i iVar = this.f24710p3;
            if (iVar != null) {
                iVar.invalidate();
            }
            ch chVar = this.f24714q3;
            if (chVar != null) {
                chVar.invalidate();
            }
        }
        this.f21586b.invalidate();
        int i22 = 0;
        while (true) {
            uh[] uhVarArr = this.f24713q2;
            if (i22 >= uhVarArr.length) {
                break;
            }
            uh uhVar = uhVarArr[i22];
            if (uhVar != null) {
                uhVar.d();
            }
            i22++;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            this.F0 = -1;
            this.G0 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21019i5, this.I0);
            org.telegram.messenger.i0.t3(this, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21001h5, this.I0), false, null);
            if (org.telegram.messenger.i0.B(this.G0) > 0.721d) {
                z11 = true;
            }
            org.telegram.messenger.i0.m3(this, z11);
            return;
        }
        Q(org.telegram.ui.ActionBar.t6.f21001h5);
    }

    public final void P1() {
        int i10 = 0;
        O1(0);
        this.f24695l3.invalidate();
        fg.i iVar = this.I2;
        iVar.invalidate();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.a2;
        if (chatAttachAlertPhotoLayout != null) {
            pl plVar = chatAttachAlertPhotoLayout.E;
            chatAttachAlertPhotoLayout.W();
            if (plVar != null && plVar.getFastScroll() != null) {
                zj0 fastScroll = plVar.getFastScroll();
                int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + chatAttachAlertPhotoLayout.f23880p1;
                if (this.T1) {
                    i10 = (int) (iVar.getAlpha() * iVar.getMeasuredHeight());
                }
                fastScroll.f33087h0 = currentActionBarHeight + i10;
                plVar.getFastScroll().invalidate();
            }
        }
        I1();
        T0();
    }

    public final void Q0(boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bi.Q0(boolean):void");
    }

    public final void R0() {
        float f7 = this.f24686j1.e;
        float f10 = (1.0f - this.f24682i1.e) * f7;
        this.f24714q3.setTranslationY(org.telegram.messenger.i0.L(48.0f) * Math.min(Math.min(1.0f, 1.0f - ((1.0f - f7) * (1.0f - this.f24690k1.e))), 1.0f - f10));
    }

    public final void S0() {
        float f7;
        float f10 = this.l1.e;
        float f11 = this.f24696m1.e;
        float a2 = w7.n7.a(this.f24700n1.e);
        if (this.L3) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        f10.d(this.f24748z2, c3.i0.E(f10, f11, a2, f7));
    }

    public final void T0() {
        ih ihVar = this.C2;
        ah ahVar = this.B2;
        fg.i iVar = this.I2;
        if (iVar != null && iVar.getVisibility() == 0 && iVar.getAlpha() != 0.0f) {
            float f7 = this.f24682i1.e;
            float abs = Math.abs(org.telegram.messenger.i0.T1(-1.0f, 1.0f, f7));
            ihVar.setAlpha(abs * abs * abs * abs);
            ahVar.setTranslationY(org.telegram.messenger.i0.T1(this.f24660a4, ((iVar.getTranslationY() + iVar.getTop()) - ahVar.getTop()) + org.telegram.messenger.i0.L(8.0f), gr.f26498j.getInterpolation(f7)));
            return;
        }
        ahVar.setTranslationY(this.f24660a4);
        ihVar.setAlpha(1.0f);
    }

    public final void U0(int i10) {
        this.M2 = true;
        this.f24718r3.setVisibility(0);
        this.f24744y1 = true;
        this.f24747z1 = i10;
        this.K2 = 0;
        this.f24736w1 = false;
        this.f24740x1 = false;
        this.A1 = null;
        org.telegram.ui.ActionBar.t0 t0Var = this.f24671e3;
        if (t0Var != null) {
            this.f24668d3.setTranslationY(0.0f);
            t0Var.setVisibility(8);
        }
    }

    @Override
    public final ArrayList V() {
        ArrayList<org.telegram.ui.ActionBar.c7> themeDescriptions;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            uh[] uhVarArr = this.f24713q2;
            if (i10 < uhVarArr.length) {
                uh uhVar = uhVarArr[i10];
                if (uhVar != null && (themeDescriptions = uhVar.getThemeDescriptions()) != null) {
                    arrayList.addAll(themeDescriptions);
                }
                i10++;
            } else {
                arrayList.add(new org.telegram.ui.ActionBar.c7(this.f21589c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21019i5));
                return arrayList;
            }
        }
    }

    public final void V0(ag.a aVar) {
        String L0 = org.telegram.messenger.cd.L0(2131752122, null);
        TextView textView = this.f24668d3;
        textView.setText(L0);
        this.M2 = false;
        this.f24718r3.setVisibility(8);
        this.K2 = 1;
        this.f24736w1 = true;
        this.f24740x1 = true;
        this.Z1 = false;
        this.A1 = aVar;
        org.telegram.ui.ActionBar.t0 t0Var = this.f24671e3;
        if (t0Var != null) {
            textView.setTranslationY(-org.telegram.messenger.i0.L(8.0f));
            t0Var.setVisibility(0);
            t0Var.setClickable(true);
            t0Var.setAlpha(1.0f);
            t0Var.setScaleX(1.0f);
            t0Var.setScaleY(1.0f);
        }
    }

    public final int W0() {
        org.telegram.messenger.nj njVar;
        org.telegram.messenger.lj ljVar;
        org.telegram.ui.ActionBar.k2 k2Var = this.W1;
        if (!(k2Var instanceof org.telegram.ui.un) || (njVar = ((org.telegram.ui.un) k2Var).f42446v5) == null || (ljVar = njVar.f17115b) == null) {
            return 0;
        }
        return ljVar.f16750g.size();
    }

    public final TLRPC.Chat X0() {
        org.telegram.ui.ActionBar.k2 k2Var = this.W1;
        if (k2Var instanceof org.telegram.ui.un) {
            return ((org.telegram.ui.un) k2Var).e;
        }
        return org.telegram.messenger.vp.r1(this.D3).L0(Long.valueOf(-this.Q1));
    }

    public final float Y0() {
        ah ahVar = this.f24741x2;
        float alpha = 1.0f - ahVar.getAlpha();
        return ahVar.getMeasuredHeight() - (alpha * (ahVar.getMeasuredHeight() - org.telegram.messenger.i0.L(84.0f)));
    }

    public final wt Z0() {
        uh uhVar;
        if (this.T1 && ((uhVar = this.f24721s2) == this.a2 || uhVar == this.f24679h2)) {
            return this.J2;
        }
        return this.f24745y2;
    }

    @Override
    public final void a(boolean z10) {
        if (z10) {
            this.f24743x4 = z10;
        }
        dismiss();
    }

    public final long a1() {
        org.telegram.ui.ActionBar.k2 k2Var = this.W1;
        if (k2Var instanceof org.telegram.ui.un) {
            return ((org.telegram.ui.un) k2Var).a();
        }
        return this.Q1;
    }

    public final int b1(int i10) {
        uh uhVar = this.f24725t2;
        int[] iArr = this.V3;
        if (uhVar != null && ((this.f24721s2 instanceof jm) || (uhVar instanceof jm))) {
            return org.telegram.messenger.i0.W1(this.U1, iArr[0], iArr[1]);
        }
        return iArr[i10];
    }

    public final int c1(boolean z10) {
        boolean q6;
        int i10;
        kg.g1 g1Var;
        if (this.f24663b4) {
            return org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21011hh, this.I0);
        }
        org.telegram.ui.ActionBar.p6 p6Var = this.I0;
        if (p6Var != null) {
            q6 = p6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.t6.I.q();
        }
        Iterator it = this.f24704o1.iterator();
        float f7 = 0.0f;
        while (it.hasNext()) {
            fe.h hVar = (fe.h) it.next();
            long longValue = ((Long) hVar.f7034a).longValue();
            if (longValue == 1 || longValue == 3 || longValue == 4 || longValue == 5 || longValue == 6 || longValue == 9 || longValue == 11 || longValue == 12) {
                f7 += hVar.c();
            }
        }
        float a2 = w7.u.a(f7, 0.0f, 1.0f);
        if (z10 && (g1Var = this.R2) != null && g1Var.getVisibility() == 0) {
            a2 *= 1.0f - g1Var.getAlpha();
        }
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21001h5, this.I0);
        if (q6) {
            i10 = org.telegram.ui.ActionBar.t6.f20872a7;
        } else {
            i10 = org.telegram.ui.ActionBar.t6.f21019i5;
        }
        return i0.b.f(a2, w02, org.telegram.ui.ActionBar.t6.w0(i10, this.I0));
    }

    public final void d1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bi.d1():void");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        if (i10 != org.telegram.messenger.zs.T0 && i10 != org.telegram.messenger.zs.W4 && i10 != org.telegram.messenger.zs.F1) {
            if (i10 == org.telegram.messenger.zs.f19613f5) {
                org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.f15147s0);
                if (r12.getUserConfig().q()) {
                    i12 = r12.V4;
                } else {
                    i12 = r12.U4;
                }
                this.B1 = i12;
                return;
            }
            return;
        }
        zh zhVar = this.f24730u3;
        if (zhVar != null) {
            zhVar.f();
        }
    }

    @Override
    public final void dismiss() {
        boolean z10;
        fh fhVar;
        dh dhVar;
        if (!this.f24721s2.p() && !this.I) {
            uh uhVar = this.f24721s2;
            kk kkVar = this.f24701n2;
            if (uhVar == kkVar && kkVar != null && !kkVar.K && kkVar.P0 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f24705o2 = z10;
            if (!z10 && (dhVar = this.f24745y2) != null) {
                org.telegram.messenger.i0.v1(dhVar.getEditText());
            }
            if (!this.f24705o2 && (fhVar = this.J2) != null) {
                org.telegram.messenger.i0.v1(fhVar.getEditText());
            }
            this.f24717r2.clear();
            org.telegram.ui.ActionBar.k2 k2Var = this.W1;
            if (k2Var == null) {
                k2Var = LaunchActivity.Q();
            }
            if (!this.f24743x4 && k2Var != null && this.f24721s2.getSelectedItemsCount() > 0 && !this.f24736w1) {
                if (!this.f24739w4) {
                    this.f24739w4 = true;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, k2Var.getParentActivity(), this.I0);
                    String L0 = org.telegram.messenger.cd.L0(2131751400, null);
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                    x1Var.R = L0;
                    x1Var.T = org.telegram.messenger.cd.L0(2131751401, null);
                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751407, null), new ig(this, 1));
                    alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                    x1Var.setOnCancelListener(new pg(this, 0));
                    x1Var.N = new r0(this, 4);
                    x1Var.show();
                    TextView textView = (TextView) x1Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21170q7, this.I0);
                        return;
                    }
                    return;
                }
                return;
            }
            int i10 = 0;
            while (true) {
                uh[] uhVarArr = this.f24713q2;
                if (i10 >= uhVarArr.length) {
                    break;
                }
                uh uhVar2 = uhVarArr[i10];
                if (uhVar2 != null && this.f24721s2 != uhVar2) {
                    uhVar2.p();
                }
                i10++;
            }
            org.telegram.messenger.i0.t3(this, i0.b.o(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20872a7, this.I0), 0), true, new ig(this, 11));
            if (k2Var != null) {
                org.telegram.messenger.i0.p3(this, k2Var.isLightStatusBar());
            }
            this.f24666c4 = false;
            super.dismiss();
            this.f24743x4 = false;
        }
    }

    public final boolean e1() {
        if (this.T1) {
            uh uhVar = this.f24721s2;
            if (uhVar == this.a2 || uhVar == this.f24679h2) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean f0(MotionEvent motionEvent) {
        return this.f24721s2.n(motionEvent);
    }

    public final void g1(EditTextBoldCursor editTextBoldCursor, boolean z10) {
        long j10;
        ai aiVar = this.T3;
        if (aiVar != null && !this.f24706o3) {
            boolean D = aiVar.D();
            this.f24706o3 = true;
            ag.j0 j0Var = new ag.j0(this, editTextBoldCursor, z10, 16);
            if (D) {
                j10 = 200;
            } else {
                j10 = 0;
            }
            org.telegram.messenger.i0.h3(j0Var, j10);
        }
    }

    public final void h1() {
        if (this.f21612r0 != null && this.f21586b != null) {
            int c12 = c1(false);
            org.telegram.ui.ActionBar.t6.C1(c12, this.f21612r0);
            hi.c cVar = this.A4;
            if (cVar.f7711b != c12) {
                cVar.a(c12);
                bh.i iVar = this.f24710p3;
                if (iVar != null) {
                    iVar.invalidate();
                }
                ch chVar = this.f24714q3;
                if (chVar != null) {
                    chVar.invalidate();
                }
            }
            K1();
            this.f21586b.invalidate();
        }
    }

    public final void i1() {
        int i10 = 0;
        while (true) {
            uh[] uhVarArr = this.f24713q2;
            if (i10 >= uhVarArr.length) {
                break;
            }
            uh uhVar = uhVarArr[i10];
            if (uhVar != null) {
                uhVar.o();
            }
            i10++;
        }
        int i11 = this.D3;
        org.telegram.messenger.zs.f(i11).n(this, org.telegram.messenger.zs.T0);
        org.telegram.messenger.zs.f(i11).n(this, org.telegram.messenger.zs.W4);
        org.telegram.messenger.zs.f(i11).n(this, org.telegram.messenger.zs.f19613f5);
        org.telegram.messenger.zs.f(i11).n(this, org.telegram.messenger.zs.F1);
        this.M1 = true;
        dh dhVar = this.f24745y2;
        if (dhVar != null) {
            dhVar.o();
        }
        fh fhVar = this.J2;
        if (fhVar != null) {
            fhVar.o();
        }
    }

    @Override
    public final boolean j0() {
        TL_wallet.walletTransaction wallettransaction;
        final kk kkVar = this.f24701n2;
        if (kkVar != null && this.f24721s2 == kkVar) {
            final mg mgVar = new mg(this, 1);
            int i10 = kkVar.f27793n;
            org.telegram.ui.Wallet.q9 q9Var = kkVar.R;
            bi biVar = kkVar.f30947b;
            AnimatorSet animatorSet = null;
            if (!kkVar.K && (wallettransaction = kkVar.P0) != null && kkVar.Q0 == null && kkVar.R0 == null) {
                if (kkVar.S0) {
                    org.telegram.ui.Wallet.b6 b6Var = new org.telegram.ui.Wallet.b6();
                    b6Var.setCurrentAccount(i10);
                    org.telegram.ui.ActionBar.k2 k2Var = biVar.W1;
                    if (k2Var != null && k2Var.presentFragment(b6Var, false, true)) {
                        org.telegram.ui.Wallet.fa faVar = new org.telegram.ui.Wallet.fa(biVar.f21589c, biVar.f21586b, q9Var.getDiamondView(), b6Var, kkVar.P0, new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        if (!kkVar.K) {
                                            mgVar.run();
                                            return;
                                        }
                                        return;
                                    default:
                                        if (!kkVar.K) {
                                            mgVar.run();
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, biVar);
                        kkVar.R0 = faVar;
                        animatorSet = faVar.f34521m;
                    }
                } else if (wallettransaction.localMessageId != 0) {
                    org.telegram.ui.Wallet.a7 diamondView = q9Var.getDiamondView();
                    if (diamondView.f34200f != null && diamondView.isShown() && diamondView.getAlpha() > 0.01f) {
                        org.telegram.ui.ActionBar.k2 k2Var2 = biVar.W1;
                        if (k2Var2 instanceof org.telegram.ui.un) {
                            org.telegram.ui.un unVar = (org.telegram.ui.un) k2Var2;
                            if (unVar.getCurrentAccount() == i10 && unVar.a() == kkVar.f27798r.f19942id && unVar.f42248f4 == 0 && unVar.getFragmentView() != null && unVar.getFragmentView().isAttachedToWindow()) {
                                org.telegram.ui.Wallet.s6 s6Var = new org.telegram.ui.Wallet.s6(biVar.f21589c, biVar.f21586b, q9Var.getDiamondView(), unVar, kkVar.P0, new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                if (!kkVar.K) {
                                                    mgVar.run();
                                                    return;
                                                }
                                                return;
                                            default:
                                                if (!kkVar.K) {
                                                    mgVar.run();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                }, biVar);
                                kkVar.Q0 = s6Var;
                                animatorSet = s6Var.f35190m;
                            }
                        }
                    }
                }
            }
            if (animatorSet != null) {
                this.f21624z0 = animatorSet;
                this.A0 = 2;
                return true;
            }
        }
        return false;
    }

    public final void j1(TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        String p5;
        if (tL_attachMenuBot != null) {
            p5 = tL_attachMenuBot.short_name;
        } else {
            p5 = org.telegram.messenger.h20.p(user);
        }
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = org.telegram.messenger.ui.b0(this.D3).f18307b.bots;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i10);
            i10++;
            if (tL_attachMenuBot2.bot_id == user.f19942id) {
                break;
            }
        }
        String a02 = org.telegram.messenger.cd.a0("BotRemoveFromMenu", null, 2131753002, p5);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        String L0 = org.telegram.messenger.cd.L0(2131753001, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        x1Var.R = L0;
        if (tL_attachMenuBot == null) {
            a02 = org.telegram.messenger.cd.a0("BotRemoveInlineFromMenu", null, 2131753000, p5);
        }
        x1Var.T = org.telegram.messenger.i0.W2(a02);
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, "OK"), new androidx.car.app.utils.a(this, tL_attachMenuBot, user, 16));
        i0.a.s("Cancel", 2131752589, alertDialog$Builder, null);
    }

    @Override
    public final boolean k0(View view, int i10, int i11, int i12, int i13) {
        boolean z10;
        int L;
        int measuredWidth;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.a2;
        s81 s81Var = chatAttachAlertPhotoLayout.f23872l0;
        jg.l0 l0Var = chatAttachAlertPhotoLayout.f23868j0;
        TextView textView = chatAttachAlertPhotoLayout.f23879p0;
        pl plVar = chatAttachAlertPhotoLayout.f23882r;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (i14 < i15) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i16 = org.telegram.messenger.i0.f16021n;
        if (view == l0Var) {
            if (z10) {
                if (plVar.getVisibility() == 0) {
                    l0Var.layout(0, org.telegram.messenger.m5.z(222.0f, i13, i16), i14, org.telegram.messenger.m5.z(96.0f, i13, i16));
                    return true;
                }
                l0Var.layout(0, org.telegram.messenger.m5.z(126.0f, i13, i16), i14, i13 - i16);
                return true;
            } else if (plVar.getVisibility() == 0) {
                l0Var.layout(org.telegram.messenger.m5.z(222.0f, i12, i16), 0, i12 - org.telegram.messenger.i0.L(96.0f), i15 - i16);
                return true;
            } else {
                l0Var.layout(org.telegram.messenger.m5.z(126.0f, i12, i16), 0, i12, i15 - i16);
                return true;
            }
        } else if (view == s81Var) {
            if (z10) {
                if (plVar.getVisibility() == 0) {
                    s81Var.layout(0, org.telegram.messenger.m5.z(310.0f, i13, i16), i14, org.telegram.messenger.m5.z(260.0f, i13, i16));
                    return true;
                }
                s81Var.layout(0, org.telegram.messenger.m5.z(176.0f, i13, i16), i14, org.telegram.messenger.m5.z(126.0f, i13, i16));
                return true;
            } else if (plVar.getVisibility() == 0) {
                s81Var.layout(org.telegram.messenger.m5.z(310.0f, i12, i16), 0, i12 - org.telegram.messenger.i0.L(260.0f), i15 - i16);
                return true;
            } else {
                s81Var.layout(org.telegram.messenger.m5.z(176.0f, i12, i16), 0, i12 - org.telegram.messenger.i0.L(126.0f), i15 - i16);
                return true;
            }
        } else if (view == textView) {
            if (z10) {
                L = (i14 - textView.getMeasuredWidth()) / 2;
                int L2 = i13 - org.telegram.messenger.i0.L(167.0f);
                textView.setRotation(0.0f);
                if (plVar.getVisibility() == 0) {
                    L2 -= org.telegram.messenger.i0.L(96.0f);
                }
                measuredWidth = L2 - i16;
            } else {
                L = i12 - org.telegram.messenger.i0.L(167.0f);
                measuredWidth = (textView.getMeasuredWidth() / 2) + (i15 / 2);
                textView.setRotation(-90.0f);
                if (plVar.getVisibility() == 0) {
                    L -= org.telegram.messenger.i0.L(96.0f);
                }
            }
            textView.layout(L, measuredWidth, textView.getMeasuredWidth() + L, textView.getMeasuredHeight() + measuredWidth);
            return true;
        } else if (view != plVar) {
            return false;
        } else {
            if (z10) {
                int z11 = org.telegram.messenger.m5.z(88.0f, i15, i16);
                view.layout(0, z11, view.getMeasuredWidth(), view.getMeasuredHeight() + z11);
                return true;
            }
            int L3 = (i10 + i14) - org.telegram.messenger.i0.L(88.0f);
            view.layout(L3, 0, view.getMeasuredWidth() + L3, view.getMeasuredHeight());
            return true;
        }
    }

    public final void k1() {
        int i10 = 0;
        while (true) {
            uh[] uhVarArr = this.f24713q2;
            if (i10 < uhVarArr.length) {
                uh uhVar = uhVarArr[i10];
                if (uhVar != null) {
                    uhVar.A();
                }
                i10++;
            } else {
                this.Z3 = true;
                return;
            }
        }
    }

    @Override
    public final boolean l0(View view, int i10, int i11) {
        boolean z10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.a2;
        bm bmVar = chatAttachAlertPhotoLayout.f23889w;
        bi biVar = chatAttachAlertPhotoLayout.f30947b;
        pl plVar = chatAttachAlertPhotoLayout.f23882r;
        dh.f fVar = chatAttachAlertPhotoLayout.f23884s;
        if (i10 < i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (view == chatAttachAlertPhotoLayout.P) {
            if (chatAttachAlertPhotoLayout.f23852b0 && !chatAttachAlertPhotoLayout.f23856d0) {
                chatAttachAlertPhotoLayout.P.measure(View.MeasureSpec.makeMeasureSpec(biVar.U() + biVar.T() + i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                return true;
            }
        } else {
            jg.l0 l0Var = chatAttachAlertPhotoLayout.f23868j0;
            if (view == l0Var) {
                if (z10) {
                    l0Var.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(126.0f), 1073741824));
                    return true;
                }
                l0Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(126.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                return true;
            }
            s81 s81Var = chatAttachAlertPhotoLayout.f23872l0;
            if (view == s81Var) {
                if (z10) {
                    s81Var.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(50.0f), 1073741824));
                    return true;
                }
                s81Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(50.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                return true;
            } else if (view == plVar) {
                chatAttachAlertPhotoLayout.J0 = true;
                if (z10) {
                    plVar.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(80.0f), 1073741824));
                    if (fVar.f47868o != 0) {
                        plVar.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
                        fVar.j1(0);
                        bmVar.f();
                    }
                } else {
                    plVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(80.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                    if (fVar.f47868o != 1) {
                        plVar.setPadding(0, org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f));
                        fVar.j1(1);
                        bmVar.f();
                    }
                }
                chatAttachAlertPhotoLayout.J0 = false;
                return true;
            }
        }
        return false;
    }

    public final void l1() {
        int i10 = 0;
        this.Z3 = false;
        while (true) {
            uh[] uhVarArr = this.f24713q2;
            if (i10 >= uhVarArr.length) {
                break;
            }
            uh uhVar = uhVarArr[i10];
            if (uhVar != null) {
                uhVar.C();
            }
            i10++;
        }
        if (isShowing()) {
            this.T3.D();
        }
        zh zhVar = this.f24730u3;
        if (zhVar != null) {
            zhVar.f();
        }
    }

    @Override
    public final boolean m0() {
        int i10;
        this.a2.setTranslationX(0.0f);
        this.f24680h3.setAlpha(0.0f);
        this.f24674f3.setAlpha(1.0f);
        this.f21586b.setTranslationY(this.f21586b.getMeasuredHeight());
        AnimatorSet animatorSet = new AnimatorSet();
        this.f24693k4 = animatorSet;
        mh mhVar = this.f24685i4;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, mhVar, 0.0f, 400.0f));
        this.f24693k4.setDuration(400L);
        this.f24693k4.setStartDelay(20L);
        Float valueOf = Float.valueOf(0.0f);
        mhVar.getClass();
        mhVar.a(this, valueOf);
        this.f24693k4.start();
        ValueAnimator valueAnimator = this.B0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.C0, 1.0f);
        this.B0 = ofFloat;
        ofFloat.addUpdateListener(new kg(this, 2));
        o1.j jVar = this.f24689j4;
        if (jVar != null) {
            jVar.d();
        }
        o1.j jVar2 = new o1.j((Object) this.f21586b, (o1.h) o1.j.f13942p, 0.0f);
        this.f24689j4 = jVar2;
        if (this.B3 != null) {
            jVar2.f13957m.a(0.75f);
            this.f24689j4.f13957m.b(350.0f);
        } else {
            jVar2.f13957m.a(0.75f);
            this.f24689j4.f13957m.b(350.0f);
        }
        this.f24689j4.h();
        if (this.J) {
            this.f21589c.setLayerType(2, null);
        }
        this.A0 = 1;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f21624z0 = animatorSet2;
        g6 g6Var = i6.d;
        if (this.f21608o0) {
            i10 = this.f21609p0;
        } else {
            i10 = 0;
        }
        animatorSet2.playTogether(ObjectAnimator.ofInt(this.Y, g6Var, i10));
        this.f21624z0.setDuration(400L);
        this.f21624z0.setStartDelay(20L);
        this.f21624z0.setInterpolator(this.f21604k0);
        e2.f fVar = new e2.f(null);
        jg jgVar = new jg(this, fVar, this.f21623y0, 1);
        this.f24689j4.a(new za(1, this, jgVar));
        this.f21624z0.addListener(new bg.f(20, this, jgVar));
        fVar.d();
        org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.f19633j1, 512);
        this.f21624z0.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        y1(0.0f);
        ofFloat2.addUpdateListener(new kg(this, 3));
        ofFloat2.setStartDelay(25L);
        ofFloat2.setDuration(200L);
        ofFloat2.setInterpolator(gr.f26495f);
        ofFloat2.start();
        return true;
    }

    public final void m1() {
        org.telegram.messenger.jj jjVar = this.B3;
        org.telegram.ui.ActionBar.k2 k2Var = this.W1;
        int i10 = this.D3;
        if (jjVar != null && jjVar.p5() && !org.telegram.messenger.w3.z(i10, 24, org.telegram.messenger.jj.B0(this.B3.f16337k)) && (k2Var instanceof org.telegram.ui.un)) {
            org.telegram.ui.un unVar = (org.telegram.ui.un) k2Var;
            org.telegram.messenger.oj ojVar = unVar.f42459w5;
            if (ojVar == null) {
                ojVar = org.telegram.messenger.oj.b(this.B3.f16337k.suggested_post);
            }
            if (!rh.e6.T(i10, ojVar.f17275a)) {
                unVar.mc(ojVar);
                return;
            }
        }
        if (this.B1 - this.C1 < 0) {
            org.telegram.messenger.i0.E3(this.f24712q1);
            org.telegram.messenger.i0.E3(this.f24716r1);
            try {
                this.C2.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            if (!org.telegram.messenger.vp.r1(i10).A3() && org.telegram.messenger.vp.r1(i10).V4 > this.C1) {
                C1(k2Var);
                return;
            }
            return;
        }
        if (this.B3 == null && (k2Var instanceof org.telegram.ui.un)) {
            org.telegram.ui.un unVar2 = (org.telegram.ui.un) k2Var;
            if (unVar2.c()) {
                s4.L(getContext(), unVar2.a(), new ig(this, 14), this.I0);
                return;
            }
        }
        uh uhVar = this.f24721s2;
        if (uhVar != this.a2 && uhVar != this.f24679h2) {
            if (!uhVar.J(true, 0, 0, this.H2, e1())) {
                this.f24743x4 = true;
                dismiss();
                return;
            }
            return;
        }
        t1(true, 0, 0, this.H2, e1());
    }

    public final void n1(int i10) {
        Activity activity;
        boolean z10 = true;
        org.telegram.ui.ActionBar.k2 k2Var = this.W1;
        if (i10 == 3) {
            if (this.H3 || !N0()) {
                if (k2Var != null) {
                    activity = k2Var.getParentActivity();
                } else {
                    activity = null;
                }
                if (activity != null) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        if (activity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                            activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 4);
                            return;
                        }
                    } else if (activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                        activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                        return;
                    }
                }
                o1(true);
            }
        } else if (i10 == 6 && org.telegram.messenger.i0.J1(k2Var)) {
            if (this.f24673f2 == null) {
                bl blVar = new bl(this, getContext(), this.I0, (this.f24744y1 || this.L3) ? false : false);
                this.f24673f2 = blVar;
                this.f24713q2[5] = blVar;
                wk wkVar = this.f24715q4;
                if (wkVar != null) {
                    blVar.setDelegate(wkVar);
                } else if (k2Var instanceof org.telegram.ui.un) {
                    blVar.setDelegate(new ig(this, 18));
                }
            }
            E1(this.f24673f2);
        }
    }

    @Override
    public final void o0() {
        if (this.f24721s2.r()) {
            dismiss();
        }
    }

    public final void o1(boolean z10) {
        if (!this.H3 && z10) {
            kn knVar = new kn(3, getContext(), this.I0, this);
            this.K1 = knVar;
            E1(knVar);
        }
        int i10 = 1;
        if (this.f24664c2 == null) {
            mi miVar = new mi(getContext(), this.I0, this);
            this.f24664c2 = miVar;
            this.f24713q2[3] = miVar;
            miVar.setupBlurredSearchField(this.B4);
            this.f24664c2.setDelegate(new ig(this, 15));
            if (this.f24744y1) {
                this.f24664c2.setMaxSelectedFiles(1);
            }
        }
        org.telegram.ui.ActionBar.k2 k2Var = this.W1;
        if (k2Var instanceof org.telegram.ui.un) {
            TLRPC.Chat chat = ((org.telegram.ui.un) k2Var).e;
            mi miVar2 = this.f24664c2;
            if ((chat == null || org.telegram.messenger.w3.N(chat) || !chat.slowmode_enabled) && this.B3 == null) {
                i10 = -1;
            }
            miVar2.setMaxSelectedFiles(i10);
        }
        if (z10) {
            E1(this.f24664c2);
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.J1.getVisibility() == 0) {
            if (getOwnerActivity() != null) {
                getOwnerActivity().finish();
                return;
            }
            return;
        }
        kg.g1 g1Var = this.R2;
        if (g1Var.f20497n0) {
            g1Var.k(true);
        } else if (this.f24721s2.j()) {
        } else {
            if (Z0() != null && Z0().e) {
                Z0().k(true);
            } else {
                super.onBackPressed();
            }
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        org.telegram.ui.ActionBar.k2 k2Var = this.W1;
        if (k2Var != null) {
            org.telegram.messenger.i0.p3(this, k2Var.isLightStatusBar());
        }
    }

    @Override
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.f24721s2.F(i10)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override
    public final void onStart() {
        super.onStart();
        Context context = getContext();
        if ((context instanceof ContextWrapper) && !(context instanceof LaunchActivity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof LaunchActivity) {
            ((LaunchActivity) context).B0.add(this.J1);
        }
    }

    @Override
    public final void onStop() {
        super.onStop();
        Context context = getContext();
        if ((context instanceof ContextWrapper) && !(context instanceof LaunchActivity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof LaunchActivity) {
            ((LaunchActivity) context).B0.remove(this.J1);
        }
    }

    public final void p1() {
        boolean z10;
        if (!this.K3) {
            kn knVar = new kn(5, getContext(), this.I0, this);
            this.K1 = knVar;
            E1(knVar);
        }
        if (this.f24661b2 == null) {
            ej ejVar = new ej(getContext(), this.I0, this);
            this.f24661b2 = ejVar;
            this.f24713q2[2] = ejVar;
            ejVar.setupBlurredSearchField(this.B4);
            this.f24661b2.setDelegate(new kh(this));
        }
        org.telegram.ui.ActionBar.k2 k2Var = this.W1;
        if (k2Var instanceof org.telegram.ui.un) {
            TLRPC.Chat chat = ((org.telegram.ui.un) k2Var).e;
            ej ejVar2 = this.f24661b2;
            if (chat != null && !org.telegram.messenger.w3.N(chat) && chat.slowmode_enabled) {
                z10 = false;
            } else {
                z10 = true;
            }
            ejVar2.setMultipleSelectionAllowed(z10);
        }
        E1(this.f24661b2);
    }

    public final void q1(boolean z10) {
        int i10;
        if (!this.E3 && z10) {
            kn knVar = new kn(4, getContext(), this.I0, this);
            this.K1 = knVar;
            E1(knVar);
        }
        boolean z11 = false;
        if (this.f24676g2 == null) {
            if (this.E1) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            xj xjVar = new xj(i10, getContext(), this.I0, this);
            this.f24676g2 = xjVar;
            this.f24713q2[4] = xjVar;
            xjVar.setDelegate(new lh(this));
        }
        int i11 = 1;
        if (this.f24744y1) {
            this.f24676g2.setMaxSelectedFiles(1);
        } else {
            org.telegram.ui.ActionBar.k2 k2Var = this.W1;
            if (k2Var instanceof org.telegram.ui.un) {
                TLRPC.Chat chat = ((org.telegram.ui.un) k2Var).e;
                xj xjVar2 = this.f24676g2;
                if ((chat == null || org.telegram.messenger.w3.N(chat) || !chat.slowmode_enabled) && this.B3 == null) {
                    i11 = -1;
                }
                xjVar2.setMaxSelectedFiles(i11);
            } else {
                this.f24676g2.setMaxSelectedFiles(this.M3);
                xj xjVar3 = this.f24676g2;
                if (!this.E1 && !this.N1) {
                    z11 = true;
                }
                xjVar3.setCanSelectOnlyImageFiles(z11);
            }
        }
        xj xjVar4 = this.f24676g2;
        xjVar4.f32483d0 = this.E1;
        if (z10) {
            E1(xjVar4);
        }
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            P0();
            tg.c cVar = this.S1;
            if (cVar != null) {
                cVar.updateColors();
            }
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21037j5, this.I0);
            org.telegram.ui.ActionBar.t0 t0Var = this.f24671e3;
            if (t0Var != null && w02 != this.l4) {
                this.l4 = w02;
                t0Var.setIconColor(w02);
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final void s1() {
        ViewGroup viewGroup = this.f21586b;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
        kg.g1 g1Var = this.R2;
        int i10 = 1;
        if (g1Var.f20497n0) {
            g1Var.k(true);
        }
        this.f24661b2 = null;
        this.f24687j2 = null;
        this.f24664c2 = null;
        this.f24667d2 = null;
        this.f24670e2 = null;
        this.f24673f2 = null;
        this.f24676g2 = null;
        this.f24701n2 = null;
        while (true) {
            uh[] uhVarArr = this.f24713q2;
            if (i10 >= uhVarArr.length) {
                break;
            }
            uh uhVar = uhVarArr[i10];
            if (uhVar != null) {
                uhVar.o();
                this.f21586b.removeView(uhVarArr[i10]);
                uhVarArr[i10] = null;
            }
            i10++;
        }
        H1(false, false);
        super.L();
        if (this.f24705o2) {
            this.f24705o2 = false;
            this.f24709p2 = 0.0f;
            org.telegram.ui.ActionBar.k2 k2Var = this.W1;
            if (k2Var != null && k2Var.getFragmentView() != null) {
                View fragmentView = k2Var.getFragmentView();
                WeakHashMap weakHashMap = r0.h0.f46123a;
                r0.x.c(fragmentView);
            }
        }
    }

    @Override
    public final void show() {
        boolean z10;
        super.show();
        this.C3 = false;
        org.telegram.ui.ActionBar.k2 k2Var = this.W1;
        if (k2Var instanceof org.telegram.ui.un) {
            this.f21601h0 = ((org.telegram.ui.un) k2Var).J9();
        }
        K1();
        this.f24698m3 = false;
        if (Build.VERSION.SDK_INT >= 30) {
            this.F0 = -1;
            int o10 = i0.b.o(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20872a7, this.I0), 0);
            this.G0 = o10;
            org.telegram.messenger.i0.t3(this, o10, false, null);
            if (org.telegram.messenger.i0.B(this.G0) > 0.721d) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.messenger.i0.m3(this, z10);
        }
        if (this.f24678g4) {
            this.f24678g4 = false;
            kg.g1 g1Var = this.R2;
            g1Var.updateColors();
            g1Var.invalidate();
            h1();
        }
    }

    public final boolean t1(final boolean z10, final int i10, final int i11, final long j10, final boolean z11) {
        if (this.C3) {
            return false;
        }
        org.telegram.ui.ActionBar.k2 k2Var = this.W1;
        if (k2Var instanceof org.telegram.ui.un) {
            org.telegram.ui.un unVar = (org.telegram.ui.un) k2Var;
            TLRPC.Chat chat = unVar.e;
            if (unVar.j() != null || ((org.telegram.messenger.w3.T(chat) && chat.megagroup) || !org.telegram.messenger.w3.T(chat))) {
                SharedPreferences.Editor edit = org.telegram.messenger.vp.r1(this.D3).e7.edit();
                edit.putBoolean("silent_" + unVar.a(), !z10).commit();
            }
        }
        int i12 = 1;
        if (O0(Z0().getText())) {
            return true;
        }
        M0();
        if (this.f24700n1.f7021f) {
            this.C3 = true;
            this.T3.H0(7, true, z10, i10, i11, j10, z11, false, 0L);
            return true;
        }
        long a12 = a1();
        uh uhVar = this.f24721s2;
        if (uhVar != null) {
            i12 = uhVar.getSelectedItemsCount();
        }
        return s4.a0(this.D3, a12, W0() + i12, new org.telegram.messenger.q20() {
            @Override
            public final void a(Object obj) {
                bi biVar = bi.this;
                biVar.C3 = true;
                biVar.T3.H0(7, true, z10, i10, i11, j10, z11, false, ((Long) obj).longValue());
            }
        }, 0L);
    }

    @Override
    public final void u0(boolean z10) {
        this.f21610q0 = true;
    }

    public final void u1(boolean z10, boolean z11) {
        final boolean z12;
        boolean z13;
        final boolean z14;
        int i10;
        float f7;
        float f10;
        float measuredHeight;
        this.f24682i1.a(z10, z11);
        wt Z0 = Z0();
        this.T1 = z10;
        wt Z02 = Z0();
        int i11 = 0;
        if (this.f24741x2.getTag() != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        uh uhVar = this.f24721s2;
        if (uhVar != this.a2 && uhVar != this.f24679h2) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (this.T1 && z13) {
            z14 = true;
        } else {
            z14 = false;
        }
        int i12 = 8;
        float f11 = 1.0f;
        fg.i iVar = this.I2;
        ag.q qVar = this.f24737w2;
        float f12 = 0.0f;
        if (z11) {
            if (z12) {
                i12 = 0;
            }
            iVar.setVisibility(i12);
            ViewPropertyAnimator animate = iVar.animate();
            if (z14 && z12) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f10).setDuration(320L);
            gr grVar = gr.h;
            duration.setInterpolator(grVar).setUpdateListener(new kg(this, 0)).withEndAction(new Runnable(this) {
                public final bi f28108b;

                {
                    this.f28108b = this;
                }

                @Override
                public final void run() {
                    switch (r4) {
                        case 0:
                            bi biVar = this.f28108b;
                            if (!z14 || !z12) {
                                biVar.I2.setVisibility(8);
                            }
                            biVar.P1();
                            return;
                        default:
                            if (z14 || !z12) {
                                this.f28108b.f24737w2.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            qVar.setVisibility(0);
            ViewPropertyAnimator animate2 = qVar.animate();
            if (!z14 && z12) {
                measuredHeight = 0.0f;
            } else {
                measuredHeight = qVar.getMeasuredHeight();
            }
            ViewPropertyAnimator translationY = animate2.translationY(measuredHeight);
            if (z14 || !z12) {
                f11 = 0.0f;
            }
            translationY.alpha(f11).setDuration(320L).setInterpolator(grVar).setUpdateListener(new kg(this, 1)).withEndAction(new Runnable(this) {
                public final bi f28108b;

                {
                    this.f28108b = this;
                }

                @Override
                public final void run() {
                    switch (r4) {
                        case 0:
                            bi biVar = this.f28108b;
                            if (!z14 || !z12) {
                                biVar.I2.setVisibility(8);
                            }
                            biVar.P1();
                            return;
                        default:
                            if (z14 || !z12) {
                                this.f28108b.f24737w2.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
        } else {
            if (z14 && z12) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            iVar.setVisibility(i10);
            if (z14 && z12) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            iVar.setAlpha(f7);
            P1();
            if (z14 || !z12) {
                f11 = 0.0f;
            }
            qVar.setAlpha(f11);
            if (z14 || !z12) {
                f12 = qVar.getMeasuredHeight();
            }
            qVar.setTranslationY(f12);
            if (z14 || !z12) {
                i11 = 8;
            }
            qVar.setVisibility(i11);
        }
        if (Z0 != Z02) {
            Z0.k(true);
            Z02.setText(o5.cloneSpans(Z0.getText()));
            Z02.getEditText().setAllowTextEntitiesIntersection(Z0.getEditText().getAllowTextEntitiesIntersection());
            if (Z0.getEditText().isFocused()) {
                Z02.getEditText().requestFocus();
                Z02.getEditText().setSelection(Z0.getEditText().getSelectionStart(), Z0.getEditText().getSelectionEnd());
            }
        }
        org.telegram.messenger.i0.g3(new mg(this, 0));
    }

    @Override
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        uh uhVar;
        int i11;
        if (i10 == 0) {
            T0();
            R0();
            return;
        }
        int i12 = 1;
        if (i10 == 2) {
            R0();
            jn jnVar = this.f24667d2;
            if (jnVar != null && ((uhVar = this.f24725t2) == jnVar || this.f24721s2 == jnVar)) {
                if (uhVar == jnVar) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                O1(i11);
            }
            jn jnVar2 = this.f24670e2;
            if (jnVar2 != null) {
                uh uhVar2 = this.f24725t2;
                if (uhVar2 == jnVar2 || this.f24721s2 == jnVar2) {
                    if (uhVar2 != jnVar2) {
                        i12 = 0;
                    }
                    O1(i12);
                }
            }
        } else if (i10 == 1) {
            R0();
        } else if (i10 == 3) {
            S0();
        } else if (i10 == 4) {
            S0();
        } else if (i10 == 5) {
            S0();
            ih ihVar = this.C2;
            if (ihVar != null) {
                ihVar.setEphemeralFactor(f7);
                ihVar.setSameWidthFactor(f7);
            }
        }
    }

    public final void v1(int i10, org.telegram.messenger.jj jjVar) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        if (jjVar != null && (chatAttachAlertPhotoLayout = this.a2) != null) {
            chatAttachAlertPhotoLayout.a0();
        }
        if (this.B3 == jjVar && this.A3 == i10) {
            return;
        }
        this.B3 = jjVar;
        if (jjVar != null && jjVar.z2()) {
            if (this.B3.I3()) {
                i10 = 2;
            } else if (this.B3.U2()) {
                i10 = 1;
            } else {
                i10 = 0;
            }
        }
        this.A3 = i10;
        if (this.B3 != null) {
            this.M3 = 1;
            this.N3 = false;
        } else {
            this.M3 = -1;
            this.N3 = true;
        }
        this.f24730u3.f();
        J1(0);
    }

    @Override
    public final void w() {
        if (this.W1 instanceof org.telegram.ui.un) {
            String[] strArr = MediaController.U1;
        } else {
            String[] strArr2 = MediaController.U1;
        }
        this.f24721s2.x();
        org.telegram.messenger.i0.i2(org.telegram.messenger.cd.L0(2131754921, "AccDescrAttachButton"));
        this.f24698m3 = true;
        if (!this.G3 && !this.F3) {
            N0();
        }
    }

    public final void w1(float f7) {
        int i10;
        float translationY = this.f21586b.getTranslationY() - this.f24709p2;
        this.f24709p2 = this.f21586b.getHeight() * f7;
        this.f21586b.setTranslationY(translationY);
        kk kkVar = this.f24701n2;
        if (kkVar != null) {
            kkVar.setSendTransitionProgress(f7);
        }
        if (this.f21608o0) {
            i10 = Math.round((1.0f - f7) * this.f21609p0);
        } else {
            i10 = 0;
        }
        this.Y.setAlpha(i10);
        this.C0 = 1.0f - f7;
        this.f21589c.invalidate();
    }

    public final void x1(int i10, boolean z10) {
        if (this.B3 != null) {
            return;
        }
        this.M3 = i10;
        this.N3 = z10;
    }

    @Override
    public final boolean y() {
        return true;
    }

    public final void y1(float f7) {
        boolean z10 = false;
        int o10 = i0.b.o(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20872a7, this.I0), Math.min(255, Math.max(0, (int) (f7 * 255.0f))));
        this.G0 = o10;
        org.telegram.messenger.i0.t3(this, o10, false, null);
        if (org.telegram.messenger.i0.B(this.G0) > 0.721d) {
            z10 = true;
        }
        org.telegram.messenger.i0.m3(this, z10);
        this.f21589c.invalidate();
    }

    public final void z1(String str) {
        boolean z10 = true;
        this.K2 = 1;
        this.f24736w1 = true;
        this.M2 = false;
        this.G3 = false;
        this.f24718r3.setVisibility(8);
        this.f24668d3.setText(str);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.a2;
        if (chatAttachAlertPhotoLayout != null) {
            bi biVar = chatAttachAlertPhotoLayout.f30947b;
            if (biVar.K2 == 0 || biVar.f24736w1) {
                z10 = false;
            }
            chatAttachAlertPhotoLayout.f23863g1 = z10;
        }
    }

    @Override
    public final void E(float f7, int i10) {
    }

    public bi(Activity activity, org.telegram.ui.ActionBar.k2 k2Var, boolean z10, boolean z11) {
        this(activity, k2Var, z10, z11, true, null);
    }
}
