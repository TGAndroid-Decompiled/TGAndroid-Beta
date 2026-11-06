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
public class di extends org.telegram.ui.ActionBar.v2 implements org.telegram.messenger.ls, org.telegram.ui.ActionBar.p2, te.b {
    public static final int E4 = 0;
    public org.telegram.messenger.v10 A1;
    public final int[] A2;
    public int A3;
    public final ri.c A4;
    public int B1;
    public final dh B2;
    public org.telegram.messenger.ij B3;
    public final dh.c B4;
    public int C1;
    public final lh C2;
    public boolean C3;
    public final dh.c C4;
    public boolean D1;
    public final TextPaint D2;
    public final int D3;
    public final ug D4;
    public boolean E1;
    public final RectF E2;
    public boolean E3;
    public boolean F1;
    public final Paint F2;
    public boolean F3;
    public boolean G1;
    public AnimatorSet G2;
    public boolean G3;
    public h30 H1;
    public long H2;
    public boolean H3;
    public boolean I1;
    public final bi.x5 I2;
    public boolean I3;
    public final ec0 J1;
    public final ih J2;
    public boolean J3;
    public cn K1;
    public int K2;
    public boolean K3;
    public j30 L1;
    public qs L2;
    public boolean L3;
    public boolean M1;
    public boolean M2;
    public int M3;
    public boolean N1;
    public boolean N2;
    public boolean N3;
    public mj O1;
    public boolean O2;
    public boolean O3;
    public ki P1;
    public final float P2;
    public float P3;
    public long Q1;
    public long Q2;
    public float Q3;
    public boolean R1;
    public final r7 R2;
    public ValueAnimator R3;
    public final dh.d S1;
    public AnimatorSet S2;
    public int S3;
    public boolean T1;
    public AnimatorSet T2;
    public bi T3;
    public float U1;
    public final org.telegram.ui.ActionBar.r0 U2;
    public om U3;
    public final oh V1;
    public final fi.u V2;
    public final int[] V3;
    public final org.telegram.ui.ActionBar.f2 W1;
    public final org.telegram.ui.ActionBar.r0 W2;
    public int W3;
    public final boolean X1;
    public fi.m3 X2;
    public float X3;
    public ue Y1;
    public final org.telegram.ui.ActionBar.r0 Y2;
    public float Y3;
    public boolean Z1;
    public final ei.k Z2;
    public boolean Z3;
    public final ChatAttachAlertPhotoLayout f32895a2;
    public float f32896a3;
    public float f32897a4;
    public fj f32898b2;
    public float f32899b3;
    public final boolean f32900b4;
    public ni f32901c2;
    public final dh f32902c3;
    public boolean f32903c4;
    public bn d2;
    public final TextView f32904d3;
    public final ArrayList f32905d4;
    public bn f32906e2;
    public final org.telegram.ui.ActionBar.r0 f32907e3;
    public final Rect f32908e4;
    public wk f32909f2;
    public final LinearLayout f32910f3;
    public float f32911f4;
    public vj f32912g2;
    public final ImageView f32913g3;
    public boolean f32914g4;
    public bm f32915h2;
    public final LinearLayout f32916h3;
    public int f32917h4;
    public final te.a f32918i1;
    public qi f32919i2;
    public final TextView f32920i3;
    public final oh f32921i4;
    public final te.a f32922j1;
    public kg.g0 f32923j2;
    public float j3;
    public r1.g f32924j4;
    public final te.a f32925k1;
    public wj f32926k2;
    public boolean f32927k3;
    public AnimatorSet f32928k4;
    public final te.a l1;
    public wj f32929l2;
    public final qh f32930l3;
    public int f32931l4;
    public final te.a f32932m1;
    public li.p f32933m2;
    public boolean f32934m3;
    public int f32935m4;
    public final te.a n1;
    public ik f32936n2;
    public Object f32937n3;
    public boolean f32938n4;
    public final te.j f32939o1;
    public boolean f32940o2;
    public boolean f32941o3;
    public boolean o4;
    public org.telegram.ui.ym f32942p1;
    public float f32943p2;
    public final lh.f f32944p3;
    public boolean f32945p4;
    public final j6 f32946q1;
    public final vh[] f32947q2;
    public final fh f32948q3;
    public vk f32949q4;
    public final j6 f32950r1;
    public final LongSparseArray f32951r2;
    public final dh f32952r3;
    public boolean f32953r4;
    public final ImageView f32954s1;
    public vh f32955s2;
    public final eh f32956s3;
    public boolean f32957s4;
    public final org.telegram.ui.ActionBar.u2 f32958t1;
    public vh f32959t2;
    public final v4.b0 f32960t3;
    public File f32961t4;
    public final ImageView f32962u1;
    public final fh.g f32963u2;
    public final ai f32964u3;
    public double[] f32965u4;
    public final org.telegram.ui.ActionBar.u2 f32966v1;
    public final fh.g f32967v2;
    public boolean f32968v3;
    public boolean f32969v4;
    public boolean f32970w1;
    public final kg.j f32971w2;
    public final RadialProgressView f32972w3;
    public boolean f32973w4;
    public boolean f32974x1;
    public final dh f32975x2;
    public boolean f32976x3;
    public boolean f32977x4;
    public boolean f32978y1;
    public final gh f32979y2;
    public final j6 f32980y3;
    public fi.i f32981y4;
    public int f32982z1;
    public final ImageView f32983z2;
    public float f32984z3;
    public final dh.g f32985z4;

    public di(Context context, org.telegram.ui.ActionBar.f2 f2Var, boolean z9, boolean z10, boolean z11, final org.telegram.ui.ActionBar.f6 f6Var) {
        super(1, context, f6Var, false);
        org.telegram.ui.ActionBar.r0 r0Var;
        ei.k kVar;
        boolean z12;
        float f10;
        xq xqVar = xq.h;
        this.f32918i1 = new te.a(0, this, xqVar, 380L, false);
        this.f32922j1 = new te.a(1, this, xqVar, 380L, false);
        this.f32925k1 = new te.a(2, this, xqVar, 380L, false);
        this.l1 = new te.a(3, this, xqVar, 380L, false);
        this.f32932m1 = new te.a(4, this, xqVar, 380L, true);
        this.n1 = new te.a(5, this, xqVar, 320L, false);
        te.j jVar = new te.j(new mg(this, 2), xqVar, 380L);
        this.f32939o1 = jVar;
        this.D1 = false;
        this.E1 = false;
        this.F1 = false;
        this.G1 = false;
        this.U1 = 0.0f;
        this.V1 = new oh(this, 0);
        this.Z1 = false;
        vh[] vhVarArr = new vh[12];
        this.f32947q2 = vhVarArr;
        this.f32951r2 = new LongSparseArray();
        this.A2 = new int[2];
        TextPaint textPaint = new TextPaint(1);
        this.D2 = textPaint;
        this.E2 = new RectF();
        this.F2 = new Paint(1);
        this.O2 = true;
        this.P2 = 1.0f;
        this.f32968v3 = false;
        this.f32976x3 = false;
        int i7 = org.telegram.messenger.p10.f24459s0;
        this.D3 = i7;
        this.E3 = true;
        this.F3 = true;
        this.G3 = true;
        this.H3 = true;
        this.I3 = true;
        this.J3 = true;
        this.K3 = true;
        this.M3 = -1;
        this.N3 = true;
        this.S3 = org.telegram.messenger.g0.L(85.0f);
        new DecelerateInterpolator();
        this.V3 = new int[2];
        new Paint(1);
        this.f32903c4 = false;
        ArrayList arrayList = new ArrayList();
        this.f32905d4 = arrayList;
        Rect rect = new Rect();
        this.f32908e4 = rect;
        this.f32921i4 = new oh(this, 1);
        this.o4 = true;
        this.f32945p4 = false;
        this.f32973w4 = false;
        this.f32977x4 = false;
        this.f28652y = true;
        ri.c cVar = new ri.c();
        this.A4 = cVar;
        cVar.a(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27848d6, this.I0));
        this.X0.E.add(new oi.o(cVar, new mg(this, 4)));
        if (Build.VERSION.SDK_INT >= 31 && org.telegram.messenger.iz.f()) {
            dh.g gVar = new dh.g(false);
            this.f32985z4 = gVar;
            this.X0.a(gVar);
            ri.f fVar = new ri.f(cVar);
            fVar.f54481f = cVar;
            fVar.d = gVar;
            fVar.f54480e = -2;
            ri.f fVar2 = new ri.f(null);
            fVar2.f54481f = cVar;
            fVar2.d = gVar;
            fVar2.f54480e = -3;
            dh.c cVar2 = new dh.c(fVar, fVar, fVar);
            this.B4 = cVar2;
            cVar2.f8710k = true;
            int L = org.telegram.messenger.rc.e(262144) ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(48.0f);
            cVar2.d = L;
            cVar2.f8705e = L;
            dh.c cVar3 = new dh.c(fVar2, fVar2, fVar2);
            this.C4 = cVar3;
            cVar3.f8710k = true;
            int L2 = org.telegram.messenger.g0.L(48.0f);
            cVar3.d = L2;
            cVar3.f8705e = L2;
        } else {
            this.f32985z4 = null;
            this.B4 = new dh.c(cVar, cVar, cVar);
            this.C4 = new dh.c(cVar, cVar, cVar);
        }
        dh.c cVar4 = new dh.c(cVar, cVar, cVar);
        this.D4 = new ug(this, 0);
        this.f32900b4 = z9;
        this.X1 = (f2Var instanceof org.telegram.ui.an) && f2Var.isInBubbleMode();
        this.f28634k0 = new OvershootInterpolator(0.7f);
        this.W1 = f2Var;
        this.F = true;
        this.f28653y0 = this;
        org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.T0);
        org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.W4);
        org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.f24984f5);
        org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.F1);
        arrayList.add(rect);
        qh qhVar = new qh(this, context);
        this.f32930l3 = qhVar;
        qhVar.setDelegate(new rh(this));
        this.f28615b = qhVar;
        qhVar.setWillNotDraw(false);
        this.f28615b.setClipChildren(false);
        this.f28615b.setClipToPadding(false);
        ViewGroup viewGroup = this.f28615b;
        int i10 = this.f28645t0;
        viewGroup.setPadding(i10, 0, i10, 0);
        r7 r7Var = new r7(this, context, f6Var, 1);
        this.R2 = r7Var;
        r7Var.f27654c1 = true;
        r7Var.setForcedMenuWidth(org.telegram.messenger.g0.L(46.0f));
        r7Var.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        int i11 = org.telegram.ui.ActionBar.k6.f27956j5;
        org.telegram.ui.ActionBar.r6.m(r7Var, 1, i11, f6Var);
        int i12 = org.telegram.ui.ActionBar.k6.I5;
        org.telegram.ui.ActionBar.r6.m(r7Var, 3, i12, f6Var);
        org.telegram.ui.ActionBar.r6.m(r7Var, 5, i11, f6Var);
        r7Var.setOccupyStatusBar(true);
        r7Var.setAlpha(0.0f);
        r7Var.setActionBarMenuOnItemClick(new org.telegram.ui.w9(this, 12));
        org.telegram.ui.ActionBar.r0 r0Var2 = new org.telegram.ui.ActionBar.r0(context, null, 0, org.telegram.ui.ActionBar.k6.w0(i11, this.I0), false, f6Var);
        this.U2 = r0Var2;
        r0Var2.setLongClickEnabled(false);
        r0Var2.setIcon(2131231244);
        r0Var2.setContentDescription(org.telegram.messenger.hd.M0(2131754839, null));
        r0Var2.setVisibility(4);
        r0Var2.setAlpha(0.0f);
        r0Var2.setScaleX(0.6f);
        r0Var2.setScaleY(0.6f);
        r0Var2.setSubMenuOpenSide(2);
        r0Var2.setDelegate(new mg(this, 10));
        r0Var2.setAdditionalYOffset(org.telegram.messenger.g0.L(72.0f));
        r0Var2.setTranslationX(org.telegram.messenger.g0.L(1.0f));
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i12, this.I0), 6, -1);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i12);
        r0Var2.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(r0Var2, h02, null, N, f6Var);
        r0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final di f37672b;

            {
                this.f37672b = this;
            }

            @Override
            public final void onClick(View view) {
                hi.c4 c4Var;
                int i13;
                boolean z13 = false;
                switch (r2) {
                    case 0:
                        di diVar = this.f37672b;
                        if (diVar.f32955s2 != diVar.f32915h2) {
                            z13 = true;
                        }
                        diVar.O1(z13);
                        return;
                    case 1:
                        di diVar2 = this.f37672b;
                        long j3 = diVar2.Q2;
                        if (j3 < 0 && (c4Var = (hi.c4) diVar2.f32951r2.get(-j3)) != null) {
                            org.telegram.ui.web.x0 webViewContainer = c4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        di diVar3 = this.f37672b;
                        boolean z14 = diVar3.T1;
                        if (!z14) {
                            diVar3.v1(!z14, true);
                            return;
                        }
                        return;
                    case 3:
                        di diVar4 = this.f37672b;
                        boolean z15 = diVar4.T1;
                        if (z15) {
                            diVar4.v1(!z15, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f37672b.n1();
                        return;
                    case 5:
                        this.f37672b.U2.U(null, null);
                        return;
                    case 6:
                        di diVar5 = this.f37672b;
                        if (diVar5.f32895a2 != null) {
                            boolean U = ChatAttachAlertPhotoLayout.U();
                            boolean z16 = !U;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = diVar5.f32895a2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.f31185s1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.gf) {
                                        org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) entry.getValue();
                                        if (gfVar.d()) {
                                            gfVar.O = Boolean.valueOf(U);
                                            for (int i14 = 0; i14 < chatAttachAlertPhotoLayout.E.getChildCount(); i14++) {
                                                View childAt = chatAttachAlertPhotoLayout.E.getChildAt(i14);
                                                if (childAt instanceof org.telegram.ui.Cells.q5) {
                                                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                                    if (q5Var.getPhotoEntry() == gfVar) {
                                                        q5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.f25555b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.iz.f23381i1 = z16;
                                edit.putBoolean("photoLiveDefault", z16).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            diVar5.N1(true);
                            org.telegram.ui.ActionBar.r0 r0Var3 = diVar5.W2;
                            fi.m3 m3Var = diVar5.X2;
                            if (m3Var != null) {
                                m3Var.f(true);
                            }
                            fi.m3 m3Var2 = new fi.m3(diVar5.getContext(), 1);
                            diVar5.X2 = m3Var2;
                            if (!U) {
                                i13 = 2131748831;
                            } else {
                                i13 = 2131748832;
                            }
                            m3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(i13, null)));
                            diVar5.X2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            diVar5.X2.p(1.0f, -((diVar5.f28615b.getWidth() - ((r0Var3.getWidth() / 2.0f) + r0Var3.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            diVar5.X2.setTranslationY(diVar5.U2.getTranslationY());
                            fi.m3 m3Var3 = diVar5.X2;
                            m3Var3.f12436q0 = new f(11, diVar5, m3Var2);
                            diVar5.f28615b.addView(m3Var3, c8.ha.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            diVar5.X2.w();
                            return;
                        }
                        return;
                    case 7:
                        vh vhVar = this.f37672b.f32955s2;
                        if (vhVar != null) {
                            vhVar.w(40);
                            return;
                        }
                        return;
                    default:
                        this.f37672b.f32907e3.U(null, null);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.r0 r0Var3 = new org.telegram.ui.ActionBar.r0(context, null, 0, org.telegram.ui.ActionBar.k6.w0(i11, this.I0), false, f6Var);
        this.W2 = r0Var3;
        r0Var3.setLongClickEnabled(false);
        fi.u uVar = new fi.u();
        this.V2 = uVar;
        r0Var3.setIcon(uVar);
        r0Var3.setContentDescription(org.telegram.messenger.hd.M0(2131754839, null));
        r0Var3.setVisibility(8);
        r0Var3.setAlpha(0.0f);
        r0Var3.setScaleX(0.6f);
        r0Var3.setScaleY(0.6f);
        r0Var3.setAdditionalYOffset(org.telegram.messenger.g0.L(72.0f));
        r0Var3.setTranslationX(-org.telegram.messenger.g0.L(3.0f));
        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i12, this.I0), 6, -1);
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i12);
        r0Var3.setBackground(h03);
        org.telegram.ui.ActionBar.r6.k(r0Var3, h03, null, N2, f6Var);
        r0Var3.setOnClickListener(new View.OnClickListener(this) {
            public final di f37672b;

            {
                this.f37672b = this;
            }

            @Override
            public final void onClick(View view) {
                hi.c4 c4Var;
                int i13;
                boolean z13 = false;
                switch (r2) {
                    case 0:
                        di diVar = this.f37672b;
                        if (diVar.f32955s2 != diVar.f32915h2) {
                            z13 = true;
                        }
                        diVar.O1(z13);
                        return;
                    case 1:
                        di diVar2 = this.f37672b;
                        long j3 = diVar2.Q2;
                        if (j3 < 0 && (c4Var = (hi.c4) diVar2.f32951r2.get(-j3)) != null) {
                            org.telegram.ui.web.x0 webViewContainer = c4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        di diVar3 = this.f37672b;
                        boolean z14 = diVar3.T1;
                        if (!z14) {
                            diVar3.v1(!z14, true);
                            return;
                        }
                        return;
                    case 3:
                        di diVar4 = this.f37672b;
                        boolean z15 = diVar4.T1;
                        if (z15) {
                            diVar4.v1(!z15, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f37672b.n1();
                        return;
                    case 5:
                        this.f37672b.U2.U(null, null);
                        return;
                    case 6:
                        di diVar5 = this.f37672b;
                        if (diVar5.f32895a2 != null) {
                            boolean U = ChatAttachAlertPhotoLayout.U();
                            boolean z16 = !U;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = diVar5.f32895a2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.f31185s1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.gf) {
                                        org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) entry.getValue();
                                        if (gfVar.d()) {
                                            gfVar.O = Boolean.valueOf(U);
                                            for (int i14 = 0; i14 < chatAttachAlertPhotoLayout.E.getChildCount(); i14++) {
                                                View childAt = chatAttachAlertPhotoLayout.E.getChildAt(i14);
                                                if (childAt instanceof org.telegram.ui.Cells.q5) {
                                                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                                    if (q5Var.getPhotoEntry() == gfVar) {
                                                        q5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.f25555b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.iz.f23381i1 = z16;
                                edit.putBoolean("photoLiveDefault", z16).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            diVar5.N1(true);
                            org.telegram.ui.ActionBar.r0 r0Var32 = diVar5.W2;
                            fi.m3 m3Var = diVar5.X2;
                            if (m3Var != null) {
                                m3Var.f(true);
                            }
                            fi.m3 m3Var2 = new fi.m3(diVar5.getContext(), 1);
                            diVar5.X2 = m3Var2;
                            if (!U) {
                                i13 = 2131748831;
                            } else {
                                i13 = 2131748832;
                            }
                            m3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(i13, null)));
                            diVar5.X2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            diVar5.X2.p(1.0f, -((diVar5.f28615b.getWidth() - ((r0Var32.getWidth() / 2.0f) + r0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            diVar5.X2.setTranslationY(diVar5.U2.getTranslationY());
                            fi.m3 m3Var3 = diVar5.X2;
                            m3Var3.f12436q0 = new f(11, diVar5, m3Var2);
                            diVar5.f28615b.addView(m3Var3, c8.ha.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            diVar5.X2.w();
                            return;
                        }
                        return;
                    case 7:
                        vh vhVar = this.f37672b.f32955s2;
                        if (vhVar != null) {
                            vhVar.w(40);
                            return;
                        }
                        return;
                    default:
                        this.f37672b.f32907e3.U(null, null);
                        return;
                }
            }
        });
        ei.k kVar2 = new ei.k(this, context);
        org.telegram.ui.ActionBar.r6.V(kVar2, org.telegram.ui.ActionBar.k6.Gi, f6Var);
        kVar2.setText(org.telegram.messenger.hd.M0(2131751753, null));
        kVar2.setTypeface(org.telegram.messenger.g0.o());
        kVar2.setTextSize(1, 14.0f);
        kVar2.setVisibility(4);
        kVar2.setAlpha(0.0f);
        kVar2.setGravity(17);
        kVar2.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        kVar2.setTranslationX(-org.telegram.messenger.g0.L(12.0f));
        kVar2.setOnClickListener(new View.OnClickListener(this) {
            public final di f37672b;

            {
                this.f37672b = this;
            }

            @Override
            public final void onClick(View view) {
                hi.c4 c4Var;
                int i13;
                boolean z13 = false;
                switch (r2) {
                    case 0:
                        di diVar = this.f37672b;
                        if (diVar.f32955s2 != diVar.f32915h2) {
                            z13 = true;
                        }
                        diVar.O1(z13);
                        return;
                    case 1:
                        di diVar2 = this.f37672b;
                        long j3 = diVar2.Q2;
                        if (j3 < 0 && (c4Var = (hi.c4) diVar2.f32951r2.get(-j3)) != null) {
                            org.telegram.ui.web.x0 webViewContainer = c4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        di diVar3 = this.f37672b;
                        boolean z14 = diVar3.T1;
                        if (!z14) {
                            diVar3.v1(!z14, true);
                            return;
                        }
                        return;
                    case 3:
                        di diVar4 = this.f37672b;
                        boolean z15 = diVar4.T1;
                        if (z15) {
                            diVar4.v1(!z15, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f37672b.n1();
                        return;
                    case 5:
                        this.f37672b.U2.U(null, null);
                        return;
                    case 6:
                        di diVar5 = this.f37672b;
                        if (diVar5.f32895a2 != null) {
                            boolean U = ChatAttachAlertPhotoLayout.U();
                            boolean z16 = !U;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = diVar5.f32895a2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.f31185s1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.gf) {
                                        org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) entry.getValue();
                                        if (gfVar.d()) {
                                            gfVar.O = Boolean.valueOf(U);
                                            for (int i14 = 0; i14 < chatAttachAlertPhotoLayout.E.getChildCount(); i14++) {
                                                View childAt = chatAttachAlertPhotoLayout.E.getChildAt(i14);
                                                if (childAt instanceof org.telegram.ui.Cells.q5) {
                                                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                                    if (q5Var.getPhotoEntry() == gfVar) {
                                                        q5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.f25555b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.iz.f23381i1 = z16;
                                edit.putBoolean("photoLiveDefault", z16).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            diVar5.N1(true);
                            org.telegram.ui.ActionBar.r0 r0Var32 = diVar5.W2;
                            fi.m3 m3Var = diVar5.X2;
                            if (m3Var != null) {
                                m3Var.f(true);
                            }
                            fi.m3 m3Var2 = new fi.m3(diVar5.getContext(), 1);
                            diVar5.X2 = m3Var2;
                            if (!U) {
                                i13 = 2131748831;
                            } else {
                                i13 = 2131748832;
                            }
                            m3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(i13, null)));
                            diVar5.X2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            diVar5.X2.p(1.0f, -((diVar5.f28615b.getWidth() - ((r0Var32.getWidth() / 2.0f) + r0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            diVar5.X2.setTranslationY(diVar5.U2.getTranslationY());
                            fi.m3 m3Var3 = diVar5.X2;
                            m3Var3.f12436q0 = new f(11, diVar5, m3Var2);
                            diVar5.f28615b.addView(m3Var3, c8.ha.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            diVar5.X2.w();
                            return;
                        }
                        return;
                    case 7:
                        vh vhVar = this.f37672b.f32955s2;
                        if (vhVar != null) {
                            vhVar.w(40);
                            return;
                        }
                        return;
                    default:
                        this.f37672b.f32907e3.U(null, null);
                        return;
                }
            }
        });
        c8.ka.a(kVar2);
        this.Z2 = kVar2;
        L1();
        if (f2Var != null) {
            r0Var = r0Var3;
            kVar = kVar2;
            f10 = 14.0f;
            org.telegram.ui.ActionBar.r0 r0Var4 = new org.telegram.ui.ActionBar.r0(context, null, 0, org.telegram.ui.ActionBar.k6.w0(i11, this.I0), false, f6Var);
            this.Y2 = r0Var4;
            r0Var4.setLongClickEnabled(false);
            r0Var4.setIcon(2131232486);
            r0Var4.setContentDescription(org.telegram.messenger.hd.M0(2131745837, null));
            r0Var4.setVisibility(4);
            z12 = false;
            r0Var4.setAlpha(0.0f);
            r0Var4.setTranslationX(-org.telegram.messenger.g0.L(42.0f));
            org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i12, this.I0), 6, -1);
            org.telegram.ui.ActionBar.n6 N3 = org.telegram.ui.ActionBar.r6.N(i12);
            r0Var4.setBackground(h04);
            org.telegram.ui.ActionBar.r6.k(r0Var4, h04, null, N3, f6Var);
            r0Var4.setOnClickListener(new di.a2(5, this, z10));
        } else {
            r0Var = r0Var3;
            kVar = kVar2;
            z12 = false;
            f10 = 14.0f;
        }
        org.telegram.ui.ActionBar.r0 r0Var5 = new org.telegram.ui.ActionBar.r0(context, null, 0, org.telegram.ui.ActionBar.k6.w0(i11, this.I0), false, f6Var);
        this.f32907e3 = r0Var5;
        r0Var5.setLongClickEnabled(false);
        r0Var5.setIcon(2131231244);
        r0Var5.setContentDescription(org.telegram.messenger.hd.M0(2131754839, null));
        r0Var5.setVisibility(8);
        org.telegram.ui.Cells.y h05 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i12, this.I0), 3, -1);
        org.telegram.ui.ActionBar.n6 N4 = org.telegram.ui.ActionBar.r6.N(i12);
        r0Var5.setBackground(h05);
        org.telegram.ui.ActionBar.r6.k(r0Var5, h05, null, N4, f6Var);
        r0Var5.e(1, 2131232044, org.telegram.messenger.hd.M0(2131744878, null)).setOnClickListener(new View.OnClickListener(this) {
            public final di f38048b;

            {
                this.f38048b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z13;
                boolean z14;
                org.telegram.ui.an anVar;
                switch (r3) {
                    case 0:
                        final di diVar = this.f38048b;
                        gh ghVar = diVar.f32979y2;
                        if (ghVar != null) {
                            org.telegram.messenger.qp.e1().edit().putInt("aihintshown", 3).apply();
                            g0 g0Var = new g0(diVar.getContext(), f6Var);
                            g0Var.r1(ghVar.getText());
                            g0Var.f33677b2 = new org.telegram.messenger.c20() {
                                @Override
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            gh ghVar2 = diVar.f32979y2;
                                            ghVar2.setText(charSequence);
                                            ghVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            ih ihVar = diVar.J2;
                                            ihVar.setText(charSequence);
                                            ihVar.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j3 = diVar.Q1;
                            if (diVar.B3 != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            wg wgVar = new wg(diVar, 0);
                            g0Var.d2 = j3;
                            g0Var.f33679e2 = z13;
                            g0Var.f33680f2 = wgVar;
                            g0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final di diVar2 = this.f38048b;
                        ih ihVar = diVar2.J2;
                        if (ihVar != null) {
                            org.telegram.messenger.qp.e1().edit().putInt("aihintshown", 3).apply();
                            g0 g0Var2 = new g0(diVar2.getContext(), f6Var);
                            g0Var2.r1(ihVar.getText());
                            g0Var2.f33677b2 = new org.telegram.messenger.c20() {
                                @Override
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            gh ghVar2 = diVar2.f32979y2;
                                            ghVar2.setText(charSequence);
                                            ghVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            ih ihVar2 = diVar2.J2;
                                            ihVar2.setText(charSequence);
                                            ihVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j10 = diVar2.Q1;
                            if (diVar2.B3 != null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            wg wgVar2 = new wg(diVar2, 1);
                            g0Var2.d2 = j10;
                            g0Var2.f33679e2 = z14;
                            g0Var2.f33680f2 = wgVar2;
                            g0Var2.show();
                            return;
                        }
                        return;
                    default:
                        di diVar3 = this.f38048b;
                        diVar3.f32907e3.U(null, null);
                        PhotoViewer p12 = PhotoViewer.p1();
                        org.telegram.ui.ActionBar.f2 f2Var2 = diVar3.W1;
                        p12.H2(null, f2Var2, f6Var);
                        PhotoViewer.p1().I2(diVar3);
                        PhotoViewer p13 = PhotoViewer.p1();
                        int i13 = diVar3.M3;
                        boolean z15 = diVar3.N3;
                        p13.h = i13;
                        p13.f41458n = z15;
                        if (!diVar3.T3.f0()) {
                            org.telegram.messenger.g0.v1(f2Var2.getFragmentView().findFocus());
                            org.telegram.messenger.g0.v1(diVar3.f28618c.findFocus());
                        }
                        File w10 = fi.e7.w(diVar3.D3, "webp");
                        Point point = org.telegram.messenger.g0.f22537q;
                        int i14 = point.x;
                        int i15 = point.y;
                        if (i14 > 1080 || i15 > 1080) {
                            float min = Math.min(i14, i15) / 1080.0f;
                            i14 = (int) (i14 * min);
                            i15 = (int) (i15 * min);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(i14, i15, Bitmap.Config.ARGB_8888);
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w10));
                        } catch (Throwable th2) {
                            org.telegram.messenger.a8.g(th2, true);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList2 = new ArrayList();
                        org.telegram.messenger.gf gfVar = new org.telegram.messenger.gf(0, w10.getAbsolutePath(), 0, false, 0, 0);
                        arrayList2.add(gfVar);
                        PhotoViewer p14 = PhotoViewer.p1();
                        uh uhVar = new uh(diVar3, gfVar);
                        if (f2Var2 instanceof org.telegram.ui.an) {
                            anVar = (org.telegram.ui.an) f2Var2;
                        } else {
                            anVar = null;
                        }
                        p14.e2(arrayList2, 0, 11, false, uhVar, anVar);
                        if (diVar3.f32974x1) {
                            PhotoViewer.p1().S0(null, null, true, diVar3.A1);
                            return;
                        }
                        return;
                }
            }
        });
        r0Var5.setMenuYOffset(org.telegram.messenger.g0.L(-12.0f));
        r0Var5.setAdditionalXOffset(org.telegram.messenger.g0.L(12.0f));
        r0Var5.setOnClickListener(new View.OnClickListener(this) {
            public final di f37672b;

            {
                this.f37672b = this;
            }

            @Override
            public final void onClick(View view) {
                hi.c4 c4Var;
                int i13;
                boolean z13 = false;
                switch (r2) {
                    case 0:
                        di diVar = this.f37672b;
                        if (diVar.f32955s2 != diVar.f32915h2) {
                            z13 = true;
                        }
                        diVar.O1(z13);
                        return;
                    case 1:
                        di diVar2 = this.f37672b;
                        long j3 = diVar2.Q2;
                        if (j3 < 0 && (c4Var = (hi.c4) diVar2.f32951r2.get(-j3)) != null) {
                            org.telegram.ui.web.x0 webViewContainer = c4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        di diVar3 = this.f37672b;
                        boolean z14 = diVar3.T1;
                        if (!z14) {
                            diVar3.v1(!z14, true);
                            return;
                        }
                        return;
                    case 3:
                        di diVar4 = this.f37672b;
                        boolean z15 = diVar4.T1;
                        if (z15) {
                            diVar4.v1(!z15, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f37672b.n1();
                        return;
                    case 5:
                        this.f37672b.U2.U(null, null);
                        return;
                    case 6:
                        di diVar5 = this.f37672b;
                        if (diVar5.f32895a2 != null) {
                            boolean U = ChatAttachAlertPhotoLayout.U();
                            boolean z16 = !U;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = diVar5.f32895a2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.f31185s1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.gf) {
                                        org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) entry.getValue();
                                        if (gfVar.d()) {
                                            gfVar.O = Boolean.valueOf(U);
                                            for (int i14 = 0; i14 < chatAttachAlertPhotoLayout.E.getChildCount(); i14++) {
                                                View childAt = chatAttachAlertPhotoLayout.E.getChildAt(i14);
                                                if (childAt instanceof org.telegram.ui.Cells.q5) {
                                                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                                    if (q5Var.getPhotoEntry() == gfVar) {
                                                        q5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.f25555b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.iz.f23381i1 = z16;
                                edit.putBoolean("photoLiveDefault", z16).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            diVar5.N1(true);
                            org.telegram.ui.ActionBar.r0 r0Var32 = diVar5.W2;
                            fi.m3 m3Var = diVar5.X2;
                            if (m3Var != null) {
                                m3Var.f(true);
                            }
                            fi.m3 m3Var2 = new fi.m3(diVar5.getContext(), 1);
                            diVar5.X2 = m3Var2;
                            if (!U) {
                                i13 = 2131748831;
                            } else {
                                i13 = 2131748832;
                            }
                            m3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(i13, null)));
                            diVar5.X2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            diVar5.X2.p(1.0f, -((diVar5.f28615b.getWidth() - ((r0Var32.getWidth() / 2.0f) + r0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            diVar5.X2.setTranslationY(diVar5.U2.getTranslationY());
                            fi.m3 m3Var3 = diVar5.X2;
                            m3Var3.f12436q0 = new f(11, diVar5, m3Var2);
                            diVar5.f28615b.addView(m3Var3, c8.ha.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            diVar5.X2.w();
                            return;
                        }
                        return;
                    case 7:
                        vh vhVar = this.f37672b.f32955s2;
                        if (vhVar != null) {
                            vhVar.w(40);
                            return;
                        }
                        return;
                    default:
                        this.f37672b.f32907e3.U(null, null);
                        return;
                }
            }
        });
        dh dhVar = new dh(this, context, 0);
        this.f32902c3 = dhVar;
        dhVar.setOnClickListener(new View.OnClickListener(this) {
            public final di f37672b;

            {
                this.f37672b = this;
            }

            @Override
            public final void onClick(View view) {
                hi.c4 c4Var;
                int i13;
                boolean z13 = false;
                switch (r2) {
                    case 0:
                        di diVar = this.f37672b;
                        if (diVar.f32955s2 != diVar.f32915h2) {
                            z13 = true;
                        }
                        diVar.O1(z13);
                        return;
                    case 1:
                        di diVar2 = this.f37672b;
                        long j3 = diVar2.Q2;
                        if (j3 < 0 && (c4Var = (hi.c4) diVar2.f32951r2.get(-j3)) != null) {
                            org.telegram.ui.web.x0 webViewContainer = c4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        di diVar3 = this.f37672b;
                        boolean z14 = diVar3.T1;
                        if (!z14) {
                            diVar3.v1(!z14, true);
                            return;
                        }
                        return;
                    case 3:
                        di diVar4 = this.f37672b;
                        boolean z15 = diVar4.T1;
                        if (z15) {
                            diVar4.v1(!z15, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f37672b.n1();
                        return;
                    case 5:
                        this.f37672b.U2.U(null, null);
                        return;
                    case 6:
                        di diVar5 = this.f37672b;
                        if (diVar5.f32895a2 != null) {
                            boolean U = ChatAttachAlertPhotoLayout.U();
                            boolean z16 = !U;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = diVar5.f32895a2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.f31185s1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.gf) {
                                        org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) entry.getValue();
                                        if (gfVar.d()) {
                                            gfVar.O = Boolean.valueOf(U);
                                            for (int i14 = 0; i14 < chatAttachAlertPhotoLayout.E.getChildCount(); i14++) {
                                                View childAt = chatAttachAlertPhotoLayout.E.getChildAt(i14);
                                                if (childAt instanceof org.telegram.ui.Cells.q5) {
                                                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                                    if (q5Var.getPhotoEntry() == gfVar) {
                                                        q5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.f25555b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.iz.f23381i1 = z16;
                                edit.putBoolean("photoLiveDefault", z16).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            diVar5.N1(true);
                            org.telegram.ui.ActionBar.r0 r0Var32 = diVar5.W2;
                            fi.m3 m3Var = diVar5.X2;
                            if (m3Var != null) {
                                m3Var.f(true);
                            }
                            fi.m3 m3Var2 = new fi.m3(diVar5.getContext(), 1);
                            diVar5.X2 = m3Var2;
                            if (!U) {
                                i13 = 2131748831;
                            } else {
                                i13 = 2131748832;
                            }
                            m3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(i13, null)));
                            diVar5.X2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            diVar5.X2.p(1.0f, -((diVar5.f28615b.getWidth() - ((r0Var32.getWidth() / 2.0f) + r0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            diVar5.X2.setTranslationY(diVar5.U2.getTranslationY());
                            fi.m3 m3Var3 = diVar5.X2;
                            m3Var3.f12436q0 = new f(11, diVar5, m3Var2);
                            diVar5.f28615b.addView(m3Var3, c8.ha.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            diVar5.X2.w();
                            return;
                        }
                        return;
                    case 7:
                        vh vhVar = this.f37672b.f32955s2;
                        if (vhVar != null) {
                            vhVar.w(40);
                            return;
                        }
                        return;
                    default:
                        this.f37672b.f32907e3.U(null, null);
                        return;
                }
            }
        });
        dhVar.setAlpha(0.0f);
        dhVar.setVisibility(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f32910f3 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.f32904d3 = textView;
        org.telegram.messenger.k5.n(textView, i11, f6Var, 1, 16.0f);
        textView.setGravity(19);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, c8.ha.r(-2, -2, 16));
        ImageView imageView = new ImageView(context);
        this.f32913g3 = imageView;
        Drawable mutate = getContext().getResources().getDrawable(2131230875).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.r6.y(imageView, mutate, i11, f6Var, mode);
        imageView.setImageDrawable(mutate);
        imageView.setVisibility(8);
        linearLayout.addView(imageView, c8.ha.t(-2, -2, 16, 4, 1, 0, 0));
        linearLayout.setAlpha(1.0f);
        dhVar.addView(linearLayout, c8.ha.c(-1.0f, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f32916h3 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        ImageView imageView2 = new ImageView(context);
        Drawable mutate2 = getContext().getResources().getDrawable(2131230874).mutate();
        org.telegram.ui.ActionBar.r6.y(imageView2, mutate2, i11, f6Var, mode);
        imageView2.setImageDrawable(mutate2);
        linearLayout2.addView(imageView2, c8.ha.t(-2, -2, 16, 0, 1, 4, 0));
        TextView textView2 = new TextView(context);
        this.f32920i3 = textView2;
        org.telegram.messenger.k5.n(textView2, i11, f6Var, 1, 16.0f);
        org.telegram.messenger.k5.m(textView2, 19, "AttachMediaPreview", 2131753958);
        linearLayout2.setAlpha(0.0f);
        linearLayout2.addView(textView2, c8.ha.r(-2, -2, 16));
        dhVar.addView(linearLayout2, c8.ha.c(-1.0f, -2));
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = new ChatAttachAlertPhotoLayout(this, context, z9, z11, f6Var);
        this.f32895a2 = chatAttachAlertPhotoLayout;
        vhVarArr[0] = chatAttachAlertPhotoLayout;
        chatAttachAlertPhotoLayout.setTranslationX(0.0f);
        this.f32955s2 = chatAttachAlertPhotoLayout;
        this.Q2 = 1L;
        this.f28615b.addView(chatAttachAlertPhotoLayout, c8.ha.c(-1.0f, -1));
        lh.f fVar3 = new lh.f(context);
        this.f32944p3 = fVar3;
        fVar3.setup(cVar4);
        fVar3.setFadeTopAlpha(0);
        fVar3.setFadeHeightTop(org.telegram.messenger.g0.L(48.0f));
        fVar3.setFadeHeightBottom(org.telegram.messenger.g0.L(48.0f));
        fVar3.setFadeZoneTop(org.telegram.messenger.g0.L(5.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22531m);
        this.f28615b.addView(fVar3, c8.ha.g());
        this.f28615b.addView(dhVar, c8.ha.d(-1, -2.0f, 51, 23.0f, 0.0f, 21.0f, 0.0f));
        bi.x5 x5Var = new bi.x5(context, 12);
        this.I2 = x5Var;
        this.f28615b.addView(x5Var, c8.ha.e(-1, -2, 55));
        this.f28615b.addView(r7Var, c8.ha.c(-2.0f, -1));
        this.f28615b.addView(r0Var2, c8.ha.e(48, 48, 53));
        this.f28615b.addView(r0Var, c8.ha.d(48, 48.0f, 53, 0.0f, 0.0f, 48.0f, 0.0f));
        org.telegram.ui.ActionBar.r0 r0Var6 = this.Y2;
        if (r0Var6 != null) {
            this.f28615b.addView(r0Var6, c8.ha.e(48, 48, 53));
        }
        dhVar.addView(r0Var5, c8.ha.d(32, 32.0f, 21, 0.0f, 0.0f, 0.0f, 8.0f));
        this.f28615b.addView(kVar, c8.ha.e(-2, 48, 53));
        dh dhVar2 = new dh(this, context, 1);
        this.f32952r3 = dhVar2;
        eh ehVar = new eh(context, 0);
        this.f32956s3 = ehVar;
        ehVar.setClipChildren(true);
        ehVar.setClipToPadding(false);
        ai aiVar = new ai(this, context);
        this.f32964u3 = aiVar;
        ehVar.setAdapter(aiVar);
        v4.b0 b0Var = new v4.b0(0, false);
        this.f32960t3 = b0Var;
        ehVar.setLayoutManager(b0Var);
        ehVar.setVerticalScrollBarEnabled(false);
        ehVar.setHorizontalScrollBarEnabled(false);
        ehVar.setItemAnimator(null);
        ehVar.setLayoutAnimation(null);
        org.telegram.ui.ActionBar.r6.m(ehVar, 21, org.telegram.ui.ActionBar.k6.A5, f6Var);
        ehVar.f36961y2 = true;
        ehVar.setOverScrollMode(2);
        dh.c cVar5 = this.B4;
        oi.q qVar = this.X0;
        cVar5.f8709j = qVar;
        this.C4.f8709j = qVar;
        cVar4.f8709j = qVar;
        fh fhVar = new fh(this, context, 0);
        this.f32948q3 = fhVar;
        dh.d dVar = new dh.d(cVar4.c(fhVar, null, false));
        this.S1 = dVar;
        if (org.telegram.messenger.iz.f()) {
            org.telegram.messenger.rc.e(262144);
        }
        dVar.b(org.telegram.messenger.g0.L(72.0f), true);
        this.f28615b.addView(fhVar, c8.ha.g());
        fh.g c10 = this.B4.c(dhVar2, c8.g0.f(f6Var), false);
        c10.r(org.telegram.messenger.g0.L(28.0f));
        c10.q(org.telegram.messenger.g0.L(7.0f));
        dhVar2.setBackground(c10);
        ehVar.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f));
        ehVar.setClipToOutline(true);
        bg.q0 q0Var = bg.u0.f3380a;
        ehVar.setOutlineProvider(new bg.s0(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(28.0f)));
        ehVar.setImportantForAccessibility(1);
        dhVar2.addView(ehVar, c8.ha.g());
        this.f28615b.addView(dhVar2, c8.ha.e(-1, 70, 81));
        ehVar.setOnItemClickListener(new di.p4(9, this, f6Var));
        ehVar.setOnItemLongClickListener(new mg(this, 3));
        j6 j6Var = new j6(context, true, false, true);
        this.f32980y3 = j6Var;
        j6Var.setVisibility(8);
        j6Var.setAlpha(0.0f);
        j6Var.setGravity(17);
        j6Var.setTypeface(org.telegram.messenger.g0.o());
        int L3 = org.telegram.messenger.g0.L(16.0f);
        j6Var.setPadding(L3, 0, L3, 0);
        j6Var.setTextSize(org.telegram.messenger.g0.L(f10));
        j6Var.setOnClickListener(new View.OnClickListener(this) {
            public final di f37672b;

            {
                this.f37672b = this;
            }

            @Override
            public final void onClick(View view) {
                hi.c4 c4Var;
                int i13;
                boolean z13 = false;
                switch (r2) {
                    case 0:
                        di diVar = this.f37672b;
                        if (diVar.f32955s2 != diVar.f32915h2) {
                            z13 = true;
                        }
                        diVar.O1(z13);
                        return;
                    case 1:
                        di diVar2 = this.f37672b;
                        long j3 = diVar2.Q2;
                        if (j3 < 0 && (c4Var = (hi.c4) diVar2.f32951r2.get(-j3)) != null) {
                            org.telegram.ui.web.x0 webViewContainer = c4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        di diVar3 = this.f37672b;
                        boolean z14 = diVar3.T1;
                        if (!z14) {
                            diVar3.v1(!z14, true);
                            return;
                        }
                        return;
                    case 3:
                        di diVar4 = this.f37672b;
                        boolean z15 = diVar4.T1;
                        if (z15) {
                            diVar4.v1(!z15, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f37672b.n1();
                        return;
                    case 5:
                        this.f37672b.U2.U(null, null);
                        return;
                    case 6:
                        di diVar5 = this.f37672b;
                        if (diVar5.f32895a2 != null) {
                            boolean U = ChatAttachAlertPhotoLayout.U();
                            boolean z16 = !U;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = diVar5.f32895a2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.f31185s1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.gf) {
                                        org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) entry.getValue();
                                        if (gfVar.d()) {
                                            gfVar.O = Boolean.valueOf(U);
                                            for (int i14 = 0; i14 < chatAttachAlertPhotoLayout2.E.getChildCount(); i14++) {
                                                View childAt = chatAttachAlertPhotoLayout2.E.getChildAt(i14);
                                                if (childAt instanceof org.telegram.ui.Cells.q5) {
                                                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                                    if (q5Var.getPhotoEntry() == gfVar) {
                                                        q5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.f25555b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.iz.f23381i1 = z16;
                                edit.putBoolean("photoLiveDefault", z16).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            diVar5.N1(true);
                            org.telegram.ui.ActionBar.r0 r0Var32 = diVar5.W2;
                            fi.m3 m3Var = diVar5.X2;
                            if (m3Var != null) {
                                m3Var.f(true);
                            }
                            fi.m3 m3Var2 = new fi.m3(diVar5.getContext(), 1);
                            diVar5.X2 = m3Var2;
                            if (!U) {
                                i13 = 2131748831;
                            } else {
                                i13 = 2131748832;
                            }
                            m3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(i13, null)));
                            diVar5.X2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            diVar5.X2.p(1.0f, -((diVar5.f28615b.getWidth() - ((r0Var32.getWidth() / 2.0f) + r0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            diVar5.X2.setTranslationY(diVar5.U2.getTranslationY());
                            fi.m3 m3Var3 = diVar5.X2;
                            m3Var3.f12436q0 = new f(11, diVar5, m3Var2);
                            diVar5.f28615b.addView(m3Var3, c8.ha.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            diVar5.X2.w();
                            return;
                        }
                        return;
                    case 7:
                        vh vhVar = this.f37672b.f32955s2;
                        if (vhVar != null) {
                            vhVar.w(40);
                            return;
                        }
                        return;
                    default:
                        this.f37672b.f32907e3.U(null, null);
                        return;
                }
            }
        });
        this.f28615b.addView(j6Var, c8.ha.e(-1, 48, 83));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f32972w3 = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(18.0f));
        radialProgressView.setAlpha(0.0f);
        radialProgressView.setScaleX(0.1f);
        radialProgressView.setScaleY(0.1f);
        radialProgressView.setVisibility(8);
        this.f28615b.addView(radialProgressView, c8.ha.d(28, 28.0f, 85, 0.0f, 0.0f, 10.0f, 10.0f));
        ImageView imageView3 = new ImageView(context);
        this.f32983z2 = imageView3;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        int i13 = org.telegram.ui.ActionBar.k6.f28258z6;
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.r6.t(imageView3, i13, f6Var, mode2);
        imageView3.setImageResource(2131231838);
        imageView3.setVisibility(8);
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final di f37672b;

            {
                this.f37672b = this;
            }

            @Override
            public final void onClick(View view) {
                hi.c4 c4Var;
                int i132;
                boolean z13 = false;
                switch (r2) {
                    case 0:
                        di diVar = this.f37672b;
                        if (diVar.f32955s2 != diVar.f32915h2) {
                            z13 = true;
                        }
                        diVar.O1(z13);
                        return;
                    case 1:
                        di diVar2 = this.f37672b;
                        long j3 = diVar2.Q2;
                        if (j3 < 0 && (c4Var = (hi.c4) diVar2.f32951r2.get(-j3)) != null) {
                            org.telegram.ui.web.x0 webViewContainer = c4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        di diVar3 = this.f37672b;
                        boolean z14 = diVar3.T1;
                        if (!z14) {
                            diVar3.v1(!z14, true);
                            return;
                        }
                        return;
                    case 3:
                        di diVar4 = this.f37672b;
                        boolean z15 = diVar4.T1;
                        if (z15) {
                            diVar4.v1(!z15, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f37672b.n1();
                        return;
                    case 5:
                        this.f37672b.U2.U(null, null);
                        return;
                    case 6:
                        di diVar5 = this.f37672b;
                        if (diVar5.f32895a2 != null) {
                            boolean U = ChatAttachAlertPhotoLayout.U();
                            boolean z16 = !U;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = diVar5.f32895a2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.f31185s1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.gf) {
                                        org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) entry.getValue();
                                        if (gfVar.d()) {
                                            gfVar.O = Boolean.valueOf(U);
                                            for (int i14 = 0; i14 < chatAttachAlertPhotoLayout2.E.getChildCount(); i14++) {
                                                View childAt = chatAttachAlertPhotoLayout2.E.getChildAt(i14);
                                                if (childAt instanceof org.telegram.ui.Cells.q5) {
                                                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                                    if (q5Var.getPhotoEntry() == gfVar) {
                                                        q5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.f25555b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.iz.f23381i1 = z16;
                                edit.putBoolean("photoLiveDefault", z16).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            diVar5.N1(true);
                            org.telegram.ui.ActionBar.r0 r0Var32 = diVar5.W2;
                            fi.m3 m3Var = diVar5.X2;
                            if (m3Var != null) {
                                m3Var.f(true);
                            }
                            fi.m3 m3Var2 = new fi.m3(diVar5.getContext(), 1);
                            diVar5.X2 = m3Var2;
                            if (!U) {
                                i132 = 2131748831;
                            } else {
                                i132 = 2131748832;
                            }
                            m3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(i132, null)));
                            diVar5.X2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            diVar5.X2.p(1.0f, -((diVar5.f28615b.getWidth() - ((r0Var32.getWidth() / 2.0f) + r0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            diVar5.X2.setTranslationY(diVar5.U2.getTranslationY());
                            fi.m3 m3Var3 = diVar5.X2;
                            m3Var3.f12436q0 = new f(11, diVar5, m3Var2);
                            diVar5.f28615b.addView(m3Var3, c8.ha.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            diVar5.X2.w();
                            return;
                        }
                        return;
                    case 7:
                        vh vhVar = this.f37672b.f32955s2;
                        if (vhVar != null) {
                            vhVar.w(40);
                            return;
                        }
                        return;
                    default:
                        this.f37672b.f32907e3.U(null, null);
                        return;
                }
            }
        });
        dh dhVar3 = new dh(this, context, 2);
        this.f32975x2 = dhVar3;
        kg.j jVar2 = new kg.j(this, context);
        this.f32971w2 = jVar2;
        dhVar3.addView(jVar2, c8.ha.e(-1, -1, 119));
        fh.g c11 = this.C4.c(qhVar, c8.g0.o(f6Var), false);
        this.f32963u2 = c11;
        c11.S = true;
        c11.s(org.telegram.messenger.g0.L(29.0f), org.telegram.messenger.g0.L(29.0f), 0.0f, 0.0f);
        c11.u(org.telegram.messenger.g0.L(32.0f));
        c11.Q.f11510g = 0.4f;
        c11.n();
        fh.g c12 = this.B4.c(jVar2, c8.g0.o(f6Var), false);
        this.f32967v2 = c12;
        c12.r(org.telegram.messenger.g0.L(22.0f));
        c12.q(org.telegram.messenger.g0.L(7.0f));
        jVar2.setPadding(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(5.0f));
        dhVar3.setWillNotDraw(false);
        dhVar3.setVisibility(4);
        dhVar3.setAlpha(0.0f);
        this.f28615b.addView(dhVar3, c8.ha.e(-1, -2, 83));
        dhVar3.setOnTouchListener(new ei.b(13));
        j6 j6Var2 = new j6(context, false, false, false);
        this.f32946q1 = j6Var2;
        j6Var2.setAllowCancel(true);
        j6Var2.setScaleProperty(0.6f);
        j6Var2.setVisibility(8);
        j6Var2.setTextSize(org.telegram.messenger.g0.L(15.0f));
        int i14 = org.telegram.ui.ActionBar.k6.f28240y6;
        org.telegram.ui.ActionBar.r6.Z(j6Var2, i14, f6Var);
        j6Var2.setTypeface(org.telegram.messenger.g0.o());
        j6Var2.setGravity(17);
        jVar2.addView(j6Var2, c8.ha.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 50.0f));
        ImageView imageView4 = new ImageView(context);
        this.f32954s1 = imageView4;
        org.telegram.ui.ActionBar.u2 u2Var = new org.telegram.ui.ActionBar.u2(context);
        this.f32958t1 = u2Var;
        imageView4.setImageDrawable(u2Var);
        imageView4.setScaleType(scaleType);
        int i15 = org.telegram.ui.ActionBar.k6.Kl;
        org.telegram.ui.ActionBar.r6.t(imageView4, i15, f6Var, mode);
        int i16 = org.telegram.ui.ActionBar.k6.f27940i6;
        org.telegram.ui.Cells.y h06 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i16, this.I0), 1, org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.n6 N5 = org.telegram.ui.ActionBar.r6.N(i16);
        imageView4.setBackground(h06);
        org.telegram.ui.ActionBar.r6.k(imageView4, h06, null, N5, f6Var);
        jVar2.addView(imageView4, c8.ha.d(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(org.telegram.messenger.hd.M0(2131755006, null));
        c8.ka.a(imageView4);
        imageView4.setOnClickListener(new View.OnClickListener(this) {
            public final di f38048b;

            {
                this.f38048b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z13;
                boolean z14;
                org.telegram.ui.an anVar;
                switch (r3) {
                    case 0:
                        final di diVar = this.f38048b;
                        gh ghVar = diVar.f32979y2;
                        if (ghVar != null) {
                            org.telegram.messenger.qp.e1().edit().putInt("aihintshown", 3).apply();
                            g0 g0Var = new g0(diVar.getContext(), f6Var);
                            g0Var.r1(ghVar.getText());
                            g0Var.f33677b2 = new org.telegram.messenger.c20() {
                                @Override
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            gh ghVar2 = diVar.f32979y2;
                                            ghVar2.setText(charSequence);
                                            ghVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            ih ihVar2 = diVar.J2;
                                            ihVar2.setText(charSequence);
                                            ihVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j3 = diVar.Q1;
                            if (diVar.B3 != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            wg wgVar = new wg(diVar, 0);
                            g0Var.d2 = j3;
                            g0Var.f33679e2 = z13;
                            g0Var.f33680f2 = wgVar;
                            g0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final di diVar2 = this.f38048b;
                        ih ihVar = diVar2.J2;
                        if (ihVar != null) {
                            org.telegram.messenger.qp.e1().edit().putInt("aihintshown", 3).apply();
                            g0 g0Var2 = new g0(diVar2.getContext(), f6Var);
                            g0Var2.r1(ihVar.getText());
                            g0Var2.f33677b2 = new org.telegram.messenger.c20() {
                                @Override
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            gh ghVar2 = diVar2.f32979y2;
                                            ghVar2.setText(charSequence);
                                            ghVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            ih ihVar2 = diVar2.J2;
                                            ihVar2.setText(charSequence);
                                            ihVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j10 = diVar2.Q1;
                            if (diVar2.B3 != null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            wg wgVar2 = new wg(diVar2, 1);
                            g0Var2.d2 = j10;
                            g0Var2.f33679e2 = z14;
                            g0Var2.f33680f2 = wgVar2;
                            g0Var2.show();
                            return;
                        }
                        return;
                    default:
                        di diVar3 = this.f38048b;
                        diVar3.f32907e3.U(null, null);
                        PhotoViewer p12 = PhotoViewer.p1();
                        org.telegram.ui.ActionBar.f2 f2Var2 = diVar3.W1;
                        p12.H2(null, f2Var2, f6Var);
                        PhotoViewer.p1().I2(diVar3);
                        PhotoViewer p13 = PhotoViewer.p1();
                        int i132 = diVar3.M3;
                        boolean z15 = diVar3.N3;
                        p13.h = i132;
                        p13.f41458n = z15;
                        if (!diVar3.T3.f0()) {
                            org.telegram.messenger.g0.v1(f2Var2.getFragmentView().findFocus());
                            org.telegram.messenger.g0.v1(diVar3.f28618c.findFocus());
                        }
                        File w10 = fi.e7.w(diVar3.D3, "webp");
                        Point point = org.telegram.messenger.g0.f22537q;
                        int i142 = point.x;
                        int i152 = point.y;
                        if (i142 > 1080 || i152 > 1080) {
                            float min = Math.min(i142, i152) / 1080.0f;
                            i142 = (int) (i142 * min);
                            i152 = (int) (i152 * min);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(i142, i152, Bitmap.Config.ARGB_8888);
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w10));
                        } catch (Throwable th2) {
                            org.telegram.messenger.a8.g(th2, true);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList2 = new ArrayList();
                        org.telegram.messenger.gf gfVar = new org.telegram.messenger.gf(0, w10.getAbsolutePath(), 0, false, 0, 0);
                        arrayList2.add(gfVar);
                        PhotoViewer p14 = PhotoViewer.p1();
                        uh uhVar = new uh(diVar3, gfVar);
                        if (f2Var2 instanceof org.telegram.ui.an) {
                            anVar = (org.telegram.ui.an) f2Var2;
                        } else {
                            anVar = null;
                        }
                        p14.e2(arrayList2, 0, 11, false, uhVar, anVar);
                        if (diVar3.f32974x1) {
                            PhotoViewer.p1().S0(null, null, true, diVar3.A1);
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
        this.B1 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24459s0).H0();
        gh ghVar = new gh(this, context, qhVar, f6Var);
        this.f32979y2 = ghVar;
        ghVar.J = true;
        ghVar.setHint(org.telegram.messenger.hd.M0(2131754454, "AddCaption"));
        ghVar.s();
        ghVar.getEditText().setLayoutParams(c8.ha.d(-1, -1.0f, 19, 48.0f, 0.0f, 36.0f, 0.0f));
        ghVar.getEditText().addTextChangedListener(new hh(this, 0));
        jVar2.addView(ghVar, c8.ha.d(-1, -2.0f, 83, 0.0f, 0.0f, 84.0f, 0.0f));
        jVar2.setClipChildren(false);
        dhVar3.setClipChildren(false);
        ghVar.setClipChildren(false);
        x5Var.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
        x5Var.setWillNotDraw(false);
        ih ihVar = new ih(this, context, qhVar, f6Var);
        this.J2 = ihVar;
        ihVar.J = true;
        ihVar.getEditText().addTextChangedListener(new kh(this, f2Var));
        ihVar.getEditText().setPadding(0, org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f));
        ihVar.getEditText().setLayoutParams(c8.ha.d(-1, -1.0f, 19, 48.0f, 0.0f, 96.0f, 0.0f));
        ihVar.getEditText().setTextSize(1, 17.0f);
        ihVar.getEmojiButton().setLayoutParams(c8.ha.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        ihVar.setHint(org.telegram.messenger.hd.M0(2131754454, "AddCaption"));
        x5Var.addView(ihVar, c8.ha.e(-1, -2, 119));
        x5Var.setAlpha(0.0f);
        x5Var.setVisibility(8);
        ghVar.addView(imageView3, c8.ha.d(40, 40.0f, 85, 0.0f, 0.0f, 0.0f, 4.0f));
        fh.g c13 = this.B4.c(x5Var, c8.g0.o(f6Var), false);
        c13.r(org.telegram.messenger.g0.L(22.0f));
        c13.q(org.telegram.messenger.g0.L(7.0f));
        x5Var.setBackground(c13);
        x5Var.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(9.0f));
        j6 j6Var3 = new j6(context, false, false, false);
        this.f32950r1 = j6Var3;
        j6Var3.setScaleProperty(0.6f);
        j6Var3.setVisibility(8);
        j6Var3.setTextSize(org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.r6.Z(j6Var3, i14, f6Var);
        j6Var3.setTypeface(org.telegram.messenger.g0.o());
        j6Var3.setGravity(17);
        j6Var3.setAllowCancel(true);
        x5Var.addView(j6Var3, c8.ha.d(56, 20.0f, 53, 3.0f, 45.0f, 3.0f, 0.0f));
        ImageView imageView5 = new ImageView(context);
        imageView5.setScaleType(scaleType);
        imageView5.setImageResource(2131231839);
        org.telegram.ui.ActionBar.r6.t(imageView5, org.telegram.ui.ActionBar.k6.Le, f6Var, mode2);
        ihVar.addView(imageView5, c8.ha.d(40, 40.0f, 85, 0.0f, 0.0f, 60.0f, 0.0f));
        imageView5.setOnClickListener(new View.OnClickListener(this) {
            public final di f37672b;

            {
                this.f37672b = this;
            }

            @Override
            public final void onClick(View view) {
                hi.c4 c4Var;
                int i132;
                boolean z13 = false;
                switch (r2) {
                    case 0:
                        di diVar = this.f37672b;
                        if (diVar.f32955s2 != diVar.f32915h2) {
                            z13 = true;
                        }
                        diVar.O1(z13);
                        return;
                    case 1:
                        di diVar2 = this.f37672b;
                        long j3 = diVar2.Q2;
                        if (j3 < 0 && (c4Var = (hi.c4) diVar2.f32951r2.get(-j3)) != null) {
                            org.telegram.ui.web.x0 webViewContainer = c4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        di diVar3 = this.f37672b;
                        boolean z14 = diVar3.T1;
                        if (!z14) {
                            diVar3.v1(!z14, true);
                            return;
                        }
                        return;
                    case 3:
                        di diVar4 = this.f37672b;
                        boolean z15 = diVar4.T1;
                        if (z15) {
                            diVar4.v1(!z15, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f37672b.n1();
                        return;
                    case 5:
                        this.f37672b.U2.U(null, null);
                        return;
                    case 6:
                        di diVar5 = this.f37672b;
                        if (diVar5.f32895a2 != null) {
                            boolean U = ChatAttachAlertPhotoLayout.U();
                            boolean z16 = !U;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = diVar5.f32895a2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.f31185s1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.gf) {
                                        org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) entry.getValue();
                                        if (gfVar.d()) {
                                            gfVar.O = Boolean.valueOf(U);
                                            for (int i142 = 0; i142 < chatAttachAlertPhotoLayout2.E.getChildCount(); i142++) {
                                                View childAt = chatAttachAlertPhotoLayout2.E.getChildAt(i142);
                                                if (childAt instanceof org.telegram.ui.Cells.q5) {
                                                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                                    if (q5Var.getPhotoEntry() == gfVar) {
                                                        q5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.f25555b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.iz.f23381i1 = z16;
                                edit.putBoolean("photoLiveDefault", z16).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            diVar5.N1(true);
                            org.telegram.ui.ActionBar.r0 r0Var32 = diVar5.W2;
                            fi.m3 m3Var = diVar5.X2;
                            if (m3Var != null) {
                                m3Var.f(true);
                            }
                            fi.m3 m3Var2 = new fi.m3(diVar5.getContext(), 1);
                            diVar5.X2 = m3Var2;
                            if (!U) {
                                i132 = 2131748831;
                            } else {
                                i132 = 2131748832;
                            }
                            m3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(i132, null)));
                            diVar5.X2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            diVar5.X2.p(1.0f, -((diVar5.f28615b.getWidth() - ((r0Var32.getWidth() / 2.0f) + r0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            diVar5.X2.setTranslationY(diVar5.U2.getTranslationY());
                            fi.m3 m3Var3 = diVar5.X2;
                            m3Var3.f12436q0 = new f(11, diVar5, m3Var2);
                            diVar5.f28615b.addView(m3Var3, c8.ha.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            diVar5.X2.w();
                            return;
                        }
                        return;
                    case 7:
                        vh vhVar = this.f37672b.f32955s2;
                        if (vhVar != null) {
                            vhVar.w(40);
                            return;
                        }
                        return;
                    default:
                        this.f37672b.f32907e3.U(null, null);
                        return;
                }
            }
        });
        ImageView imageView6 = new ImageView(context);
        this.f32962u1 = imageView6;
        org.telegram.ui.ActionBar.u2 u2Var2 = new org.telegram.ui.ActionBar.u2(context);
        this.f32966v1 = u2Var2;
        imageView6.setImageDrawable(u2Var2);
        imageView6.setScaleType(scaleType);
        org.telegram.ui.ActionBar.r6.t(imageView6, i15, f6Var, mode);
        org.telegram.ui.Cells.y h07 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i16, this.I0), 1, org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.n6 N6 = org.telegram.ui.ActionBar.r6.N(i16);
        imageView6.setBackground(h07);
        org.telegram.ui.ActionBar.r6.k(imageView6, h07, null, N6, f6Var);
        x5Var.addView(imageView6, c8.ha.d(44, 44.0f, 85, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView6.setContentDescription(org.telegram.messenger.hd.M0(2131755006, null));
        c8.ka.a(imageView6);
        imageView6.setOnClickListener(new View.OnClickListener(this) {
            public final di f38048b;

            {
                this.f38048b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z13;
                boolean z14;
                org.telegram.ui.an anVar;
                switch (r3) {
                    case 0:
                        final di diVar = this.f38048b;
                        gh ghVar2 = diVar.f32979y2;
                        if (ghVar2 != null) {
                            org.telegram.messenger.qp.e1().edit().putInt("aihintshown", 3).apply();
                            g0 g0Var = new g0(diVar.getContext(), f6Var);
                            g0Var.r1(ghVar2.getText());
                            g0Var.f33677b2 = new org.telegram.messenger.c20() {
                                @Override
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            gh ghVar22 = diVar.f32979y2;
                                            ghVar22.setText(charSequence);
                                            ghVar22.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            ih ihVar2 = diVar.J2;
                                            ihVar2.setText(charSequence);
                                            ihVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j3 = diVar.Q1;
                            if (diVar.B3 != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            wg wgVar = new wg(diVar, 0);
                            g0Var.d2 = j3;
                            g0Var.f33679e2 = z13;
                            g0Var.f33680f2 = wgVar;
                            g0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final di diVar2 = this.f38048b;
                        ih ihVar2 = diVar2.J2;
                        if (ihVar2 != null) {
                            org.telegram.messenger.qp.e1().edit().putInt("aihintshown", 3).apply();
                            g0 g0Var2 = new g0(diVar2.getContext(), f6Var);
                            g0Var2.r1(ihVar2.getText());
                            g0Var2.f33677b2 = new org.telegram.messenger.c20() {
                                @Override
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            gh ghVar22 = diVar2.f32979y2;
                                            ghVar22.setText(charSequence);
                                            ghVar22.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            ih ihVar22 = diVar2.J2;
                                            ihVar22.setText(charSequence);
                                            ihVar22.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j10 = diVar2.Q1;
                            if (diVar2.B3 != null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            wg wgVar2 = new wg(diVar2, 1);
                            g0Var2.d2 = j10;
                            g0Var2.f33679e2 = z14;
                            g0Var2.f33680f2 = wgVar2;
                            g0Var2.show();
                            return;
                        }
                        return;
                    default:
                        di diVar3 = this.f38048b;
                        diVar3.f32907e3.U(null, null);
                        PhotoViewer p12 = PhotoViewer.p1();
                        org.telegram.ui.ActionBar.f2 f2Var2 = diVar3.W1;
                        p12.H2(null, f2Var2, f6Var);
                        PhotoViewer.p1().I2(diVar3);
                        PhotoViewer p13 = PhotoViewer.p1();
                        int i132 = diVar3.M3;
                        boolean z15 = diVar3.N3;
                        p13.h = i132;
                        p13.f41458n = z15;
                        if (!diVar3.T3.f0()) {
                            org.telegram.messenger.g0.v1(f2Var2.getFragmentView().findFocus());
                            org.telegram.messenger.g0.v1(diVar3.f28618c.findFocus());
                        }
                        File w10 = fi.e7.w(diVar3.D3, "webp");
                        Point point = org.telegram.messenger.g0.f22537q;
                        int i142 = point.x;
                        int i152 = point.y;
                        if (i142 > 1080 || i152 > 1080) {
                            float min = Math.min(i142, i152) / 1080.0f;
                            i142 = (int) (i142 * min);
                            i152 = (int) (i152 * min);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(i142, i152, Bitmap.Config.ARGB_8888);
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w10));
                        } catch (Throwable th2) {
                            org.telegram.messenger.a8.g(th2, true);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList2 = new ArrayList();
                        org.telegram.messenger.gf gfVar = new org.telegram.messenger.gf(0, w10.getAbsolutePath(), 0, false, 0, 0);
                        arrayList2.add(gfVar);
                        PhotoViewer p14 = PhotoViewer.p1();
                        uh uhVar = new uh(diVar3, gfVar);
                        if (f2Var2 instanceof org.telegram.ui.an) {
                            anVar = (org.telegram.ui.an) f2Var2;
                        } else {
                            anVar = null;
                        }
                        p14.e2(arrayList2, 0, 11, false, uhVar, anVar);
                        if (diVar3.f32974x1) {
                            PhotoViewer.p1().S0(null, null, true, diVar3.A1);
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
        dh dhVar4 = new dh(this, context, 3);
        this.B2 = dhVar4;
        dhVar4.setFocusable(true);
        dhVar4.setFocusableInTouchMode(true);
        dhVar4.setVisibility(4);
        dhVar4.setScaleX(0.2f);
        dhVar4.setScaleY(0.2f);
        dhVar4.setAlpha(0.0f);
        dhVar4.setClipChildren(false);
        dhVar4.setClipToPadding(false);
        this.f28615b.addView(dhVar4, c8.ha.e(110, 50, 85));
        lh lhVar = new lh(context, f6Var, this);
        this.C2 = lhVar;
        lhVar.setImportantForAccessibility(2);
        dhVar4.addView(lhVar, c8.ha.e(-1, -1, 119));
        lhVar.setTranslationX(this.f28645t0);
        int L4 = org.telegram.messenger.g0.L(52.0f);
        int L5 = org.telegram.messenger.g0.L(38.0f);
        lhVar.I = L4;
        lhVar.J = L5;
        lhVar.M = org.telegram.messenger.g0.L(7.0f);
        lhVar.N = org.telegram.messenger.g0.L(6.0f);
        lhVar.f32859h0 = true;
        lhVar.setOnClickListener(new View.OnClickListener(this) {
            public final di f37672b;

            {
                this.f37672b = this;
            }

            @Override
            public final void onClick(View view) {
                hi.c4 c4Var;
                int i132;
                boolean z13 = false;
                switch (r2) {
                    case 0:
                        di diVar = this.f37672b;
                        if (diVar.f32955s2 != diVar.f32915h2) {
                            z13 = true;
                        }
                        diVar.O1(z13);
                        return;
                    case 1:
                        di diVar2 = this.f37672b;
                        long j3 = diVar2.Q2;
                        if (j3 < 0 && (c4Var = (hi.c4) diVar2.f32951r2.get(-j3)) != null) {
                            org.telegram.ui.web.x0 webViewContainer = c4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        di diVar3 = this.f37672b;
                        boolean z14 = diVar3.T1;
                        if (!z14) {
                            diVar3.v1(!z14, true);
                            return;
                        }
                        return;
                    case 3:
                        di diVar4 = this.f37672b;
                        boolean z15 = diVar4.T1;
                        if (z15) {
                            diVar4.v1(!z15, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f37672b.n1();
                        return;
                    case 5:
                        this.f37672b.U2.U(null, null);
                        return;
                    case 6:
                        di diVar5 = this.f37672b;
                        if (diVar5.f32895a2 != null) {
                            boolean U = ChatAttachAlertPhotoLayout.U();
                            boolean z16 = !U;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = diVar5.f32895a2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.f31185s1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.gf) {
                                        org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) entry.getValue();
                                        if (gfVar.d()) {
                                            gfVar.O = Boolean.valueOf(U);
                                            for (int i142 = 0; i142 < chatAttachAlertPhotoLayout2.E.getChildCount(); i142++) {
                                                View childAt = chatAttachAlertPhotoLayout2.E.getChildAt(i142);
                                                if (childAt instanceof org.telegram.ui.Cells.q5) {
                                                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                                    if (q5Var.getPhotoEntry() == gfVar) {
                                                        q5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.f25555b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.iz.f23381i1 = z16;
                                edit.putBoolean("photoLiveDefault", z16).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            diVar5.N1(true);
                            org.telegram.ui.ActionBar.r0 r0Var32 = diVar5.W2;
                            fi.m3 m3Var = diVar5.X2;
                            if (m3Var != null) {
                                m3Var.f(true);
                            }
                            fi.m3 m3Var2 = new fi.m3(diVar5.getContext(), 1);
                            diVar5.X2 = m3Var2;
                            if (!U) {
                                i132 = 2131748831;
                            } else {
                                i132 = 2131748832;
                            }
                            m3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(i132, null)));
                            diVar5.X2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            diVar5.X2.p(1.0f, -((diVar5.f28615b.getWidth() - ((r0Var32.getWidth() / 2.0f) + r0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            diVar5.X2.setTranslationY(diVar5.U2.getTranslationY());
                            fi.m3 m3Var3 = diVar5.X2;
                            m3Var3.f12436q0 = new f(11, diVar5, m3Var2);
                            diVar5.f28615b.addView(m3Var3, c8.ha.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            diVar5.X2.w();
                            return;
                        }
                        return;
                    case 7:
                        vh vhVar = this.f37672b.f32955s2;
                        if (vhVar != null) {
                            vhVar.w(40);
                            return;
                        }
                        return;
                    default:
                        this.f37672b.f32907e3.U(null, null);
                        return;
                }
            }
        });
        lhVar.setOnLongClickListener(new org.telegram.ui.of(this, context, f6Var, f2Var, 1));
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        fh fhVar2 = new fh(this, context, 1);
        fhVar2.setAlpha(0.0f);
        fhVar2.setScaleX(0.2f);
        fhVar2.setScaleY(0.2f);
        if (z9) {
            P0();
            this.F0 = -1;
        }
        chatAttachAlertPhotoLayout.E.getFastScroll().a(this.B4, c8.g0.o(f6Var));
        ec0 ec0Var = new ec0(context);
        this.J1 = ec0Var;
        this.f28615b.addView(ec0Var, c8.ha.c(-1.0f, -1));
        gh.e eVar = new gh.e(f6Var);
        eVar.f13971e = new mg(this, 5);
        eVar.f13970c = new mg(this, 6);
        eVar.d = new mg(this, 7);
        eVar.f13969b = new mg(this, 8);
        float N7 = org.telegram.messenger.g0.N(3.3333333f);
        float N8 = org.telegram.messenger.g0.N(0.6666667f);
        eVar.f13973n = N7;
        eVar.f13974r = N8;
        float N9 = org.telegram.messenger.g0.N(1.0f);
        float N10 = org.telegram.messenger.g0.N(0.6666667f);
        eVar.f13972f = N9;
        eVar.h = N10;
        r7Var.M(this.B4, eVar, false);
        jVar.f(1L, false);
        this.X0.i(this.f28615b);
        oi.q qVar2 = this.X0;
        qVar2.f21096a = new mg(this, 9);
        qVar2.d = new qi.b(org.telegram.messenger.g0.L(48.0f));
    }

    public static void I0(di diVar) {
        boolean z9;
        boolean q10;
        int i7;
        r7 r7Var = diVar.R2;
        lh.f fVar = diVar.f32944p3;
        if (fVar != null && r7Var != null) {
            vh vhVar = diVar.f32959t2;
            if (vhVar == null) {
                vhVar = diVar.f32955s2;
            }
            int i10 = 0;
            if (vhVar != null && vhVar.f()) {
                z9 = true;
            } else {
                z9 = false;
            }
            org.telegram.ui.ActionBar.f6 f6Var = diVar.I0;
            if (f6Var != null) {
                q10 = f6Var.a();
            } else {
                q10 = org.telegram.ui.ActionBar.k6.I.q();
            }
            if (!z9 && r7Var.getVisibility() == 0) {
                if (q10) {
                    i7 = 255;
                } else {
                    i7 = 160;
                }
                i10 = (int) (r7Var.getAlpha() * i7);
            }
            fVar.setFadeTopAlpha(i10);
        }
    }

    public static void K0(di diVar) {
        fi.i iVar = new fi.i(diVar, diVar.getContext(), diVar.Q1, LaunchActivity.Q(), diVar.I0, 1);
        diVar.f32981y4 = iVar;
        iVar.p(new h9.f1(diVar, 29));
        ViewGroup viewGroup = diVar.f28615b;
        viewGroup.addView(diVar.f32981y4, viewGroup.indexOfChild(diVar.f32975x2), c8.ha.e(-1, -1, 83));
        fi.i iVar2 = diVar.f32981y4;
        iVar2.getAdapter().f16773c = false;
        iVar2.getAdapter().d = false;
        iVar2.getAdapter().f16776e = false;
        org.telegram.ui.ActionBar.f2 f2Var = diVar.W1;
        boolean z9 = true;
        if (f2Var instanceof org.telegram.ui.an) {
            iVar2.getAdapter().m0 = false;
            org.telegram.ui.an anVar = (org.telegram.ui.an) f2Var;
            jg.i1 adapter = iVar2.getAdapter();
            anVar.j();
            TLRPC.Chat chat = anVar.f43772e;
            adapter.getClass();
            adapter.f16785l0 = chat;
            iVar2.getAdapter().W(anVar.f43917p8);
            jg.i1 adapter2 = iVar2.getAdapter();
            if (anVar.f43772e == null) {
                z9 = false;
            }
            adapter2.f16777e0 = z9;
        } else {
            iVar2.getAdapter().m0 = true;
            iVar2.getAdapter().W(null);
            iVar2.getAdapter().f16777e0 = false;
        }
        iVar2.getAdapter().f16779f0 = false;
        diVar.J1();
    }

    public static int L0(di diVar) {
        vh vhVar = diVar.f32955s2;
        bn bnVar = diVar.d2;
        if (vhVar == bnVar && bnVar.E != null) {
            return bnVar.getEmojiPadding();
        }
        bn bnVar2 = diVar.f32906e2;
        if (vhVar == bnVar2 && bnVar2.E != null) {
            return bnVar2.getEmojiPadding();
        }
        if (diVar.T1) {
            return diVar.J2.getEmojiPadding();
        }
        return diVar.f32979y2.getEmojiPadding();
    }

    public static boolean g1(TLRPC.User user) {
        if (user != null && !org.telegram.messenger.t10.B(user) && !org.telegram.messenger.t10.t(user) && !org.telegram.messenger.t10.x(user) && !org.telegram.messenger.t10.A(user.f27101id) && !org.telegram.messenger.t10.z(user) && !org.telegram.messenger.t10.s(user) && user.f27101id != 489000 && !org.telegram.messenger.qp.F2(user)) {
            return true;
        }
        return false;
    }

    public static void s1(vh vhVar) {
        if (vhVar != null) {
            int i7 = org.telegram.ui.ActionBar.r6.f28475b;
            Object tag = vhVar.getTag(2131296710);
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == i7) {
                return;
            }
            vhVar.setTag(2131296710, Integer.valueOf(i7));
            try {
                org.telegram.ui.ActionBar.r6.d0(vhVar, true);
                vhVar.d();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final void A1(String str) {
        boolean z9 = true;
        this.K2 = 1;
        this.f32970w1 = true;
        this.M2 = false;
        this.G3 = false;
        this.f32952r3.setVisibility(8);
        this.f32904d3.setText(str);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f32895a2;
        if (chatAttachAlertPhotoLayout != null) {
            di diVar = chatAttachAlertPhotoLayout.f38948b;
            if (diVar.K2 == 0 || diVar.f32970w1) {
                z9 = false;
            }
            chatAttachAlertPhotoLayout.f31201g1 = z9;
        }
    }

    public final void B1(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.di.B1(boolean):void");
    }

    public final void C1(long r28, java.lang.String r30, boolean r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.di.C1(long, java.lang.String, boolean, boolean):void");
    }

    public final void D1(org.telegram.ui.ActionBar.f2 f2Var) {
        if ((f2Var instanceof org.telegram.ui.an) && org.telegram.messenger.t3.V(((org.telegram.ui.an) f2Var).f43772e)) {
            new hc(this.f32930l3, this.I0).f(org.telegram.messenger.qp.s1(this.D3).U4, new f(12, this, f2Var)).j();
        }
    }

    public final boolean E1(boolean z9, boolean z10) {
        boolean z11;
        Integer num;
        boolean z12;
        float f10;
        float f11;
        float f12;
        int i7;
        float f13;
        float f14;
        float f15;
        int i10;
        float f16;
        float f17;
        float f18;
        vh vhVar;
        float f19;
        float L;
        long N1;
        float f20;
        float f21;
        r7 r7Var;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        float f27;
        float f28;
        float L2;
        this.f32922j1.a(z9, true);
        dh dhVar = this.f32975x2;
        if (dhVar.getTag() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z9 == z11) {
            return false;
        }
        AnimatorSet animatorSet = this.G2;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z9) {
            num = 1;
        } else {
            num = null;
        }
        dhVar.setTag(num);
        gh ghVar = this.f32979y2;
        if (ghVar.getEditText().isFocused()) {
            org.telegram.messenger.g0.v1(ghVar.getEditText());
        }
        ghVar.k(true);
        this.J2.k(true);
        dh dhVar2 = this.f32952r3;
        dh dhVar3 = this.B2;
        if (z9) {
            if (!this.E1) {
                dhVar.setVisibility(0);
            }
            dhVar3.setVisibility(0);
        } else if (this.M2) {
            dhVar2.setVisibility(0);
        }
        vh vhVar2 = this.f32955s2;
        if ((vhVar2 == this.f32895a2 || vhVar2 == this.f32915h2) && this.T1) {
            z12 = true;
        } else {
            z12 = false;
        }
        r7 r7Var2 = this.R2;
        bi.x5 x5Var = this.I2;
        kg.j jVar = this.f32971w2;
        lh lhVar = this.C2;
        float f29 = 1.0f;
        if (z10) {
            this.G2 = new AnimatorSet();
            if (z12) {
                x5Var.setVisibility(0);
            }
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            if (z9) {
                f20 = 1.0f;
            } else {
                f20 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(dhVar, property, f20));
            if (z9 && !z12) {
                f21 = 1.0f;
            } else {
                f21 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(jVar, property, f21));
            if (z9 && !z12) {
                jVar.setVisibility(0);
                r7Var = r7Var2;
                arrayList.add(ObjectAnimator.ofFloat(jVar, View.TRANSLATION_Y, 0.0f));
            } else {
                r7Var = r7Var2;
            }
            if (z9 && z12) {
                f22 = 1.0f;
            } else {
                f22 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(x5Var, property, f22));
            Property property2 = View.SCALE_X;
            if (z9) {
                f23 = 1.0f;
            } else {
                f23 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(dhVar3, property2, f23));
            Property property3 = View.SCALE_Y;
            if (z9) {
                f24 = 1.0f;
            } else {
                f24 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(dhVar3, property3, f24));
            if (z9) {
                f25 = 1.0f;
            } else {
                f25 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(dhVar3, property, f25));
            if (z9) {
                f26 = 1.0f;
            } else {
                f26 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(lhVar, property2, f26));
            if (z9) {
                f27 = 1.0f;
            } else {
                f27 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(lhVar, property3, f27));
            if (r7Var.getTag() != null) {
                Property property4 = View.TRANSLATION_Y;
                if (z9) {
                    L2 = 0.0f;
                } else {
                    L2 = org.telegram.messenger.g0.L(48.0f);
                }
                arrayList.add(ObjectAnimator.ofFloat(dhVar, property4, L2));
            } else if (this.M2) {
                Property property5 = View.TRANSLATION_Y;
                if (z9) {
                    f28 = org.telegram.messenger.g0.L(36.0f);
                } else {
                    f28 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(dhVar2, property5, f28));
                if (z9) {
                    f29 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(dhVar2, property, f29));
            }
            if (z12) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new og(this, 5));
                arrayList.add(ofFloat);
            }
            this.G2.playTogether(arrayList);
            this.G2.setInterpolator(new DecelerateInterpolator());
            this.G2.setDuration(180L);
            this.G2.addListener(new org.telegram.ui.ActionBar.g(this, z9, z12, 3));
            this.G2.start();
            i7 = 0;
        } else {
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            dhVar.setAlpha(f10);
            if (z9 && z12) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            jVar.setAlpha(f11);
            if (z9 && !z12) {
                i7 = 0;
                jVar.setVisibility(0);
                f12 = 0.0f;
                jVar.setTranslationY(0.0f);
            } else {
                f12 = 0.0f;
                i7 = 0;
            }
            if (z9) {
                f13 = 1.0f;
            } else {
                f13 = 0.2f;
            }
            dhVar3.setScaleX(f13);
            if (z9) {
                f14 = 1.0f;
            } else {
                f14 = 0.2f;
            }
            dhVar3.setScaleY(f14);
            if (z9) {
                f15 = 1.0f;
            } else {
                f15 = f12;
            }
            dhVar3.setAlpha(f15);
            if (z9 && z12) {
                i10 = i7;
            } else {
                i10 = 8;
            }
            x5Var.setVisibility(i10);
            if (z9 && z12) {
                f16 = 1.0f;
            } else {
                f16 = f12;
            }
            x5Var.setAlpha(f16);
            if (z9) {
                f17 = 1.0f;
            } else {
                f17 = 0.2f;
            }
            lhVar.setScaleX(f17);
            if (z9) {
                f18 = 1.0f;
            } else {
                f18 = 0.2f;
            }
            lhVar.setScaleY(f18);
            if (r7Var2.getTag() != null) {
                if (z9) {
                    L = f12;
                } else {
                    L = org.telegram.messenger.g0.L(48.0f);
                }
                dhVar.setTranslationY(L);
            } else if (this.M2 && ((vhVar = this.f32955s2) == null || vhVar.M())) {
                if (z9) {
                    f19 = org.telegram.messenger.g0.L(84.0f);
                } else {
                    f19 = f12;
                }
                dhVar2.setTranslationY(f19);
            }
            if (!z9) {
                dhVar.setVisibility(4);
                dhVar3.setVisibility(4);
            }
            if (z12) {
                Q1();
            }
        }
        if (z9) {
            i7 = Math.max(1, this.f32955s2.getSelectedItemsCount());
        }
        lhVar.e(i7, z10);
        if (this.B3 != null) {
            N1 = 0;
        } else {
            N1 = org.telegram.messenger.qp.s1(this.D3).N1(b1());
        }
        lhVar.i(X0() + this.f32955s2.getSelectedItemsCount(), N1, true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ghVar.getLayoutParams();
        int max = Math.max(org.telegram.messenger.g0.L(48.0f), lhVar.l());
        if (marginLayoutParams.rightMargin != max) {
            marginLayoutParams.rightMargin = max;
            ghVar.setLayoutParams(marginLayoutParams);
        }
        return true;
    }

    public final void F1(vh vhVar) {
        long j3 = this.Q2;
        cn cnVar = this.K1;
        if (vhVar == cnVar) {
            j3 = cnVar.f32618s;
        } else if (vhVar == this.f32895a2) {
            j3 = 1;
        } else if (vhVar == this.f32901c2) {
            j3 = 3;
        } else if (vhVar == this.f32912g2) {
            j3 = 4;
        } else if (vhVar == this.f32898b2) {
            j3 = 5;
        } else if (vhVar == this.f32909f2) {
            j3 = 6;
        } else if (vhVar == this.d2) {
            j3 = 9;
        } else if (vhVar == this.f32919i2) {
            j3 = 10;
        } else if (vhVar == this.f32923j2) {
            j3 = 11;
        } else if (vhVar == this.f32906e2) {
            j3 = 12;
        } else if (vhVar == this.f32926k2) {
            j3 = 14;
        } else if (vhVar == this.f32929l2) {
            j3 = 13;
        } else if (vhVar == this.f32933m2) {
            j3 = 16;
        } else if (vhVar == this.f32936n2) {
            j3 = 17;
        }
        G1(vhVar, j3, true);
    }

    @Override
    public final boolean G() {
        return false;
    }

    public final void G1(vh vhVar, long j3, boolean z9) {
        boolean z10;
        int i7;
        ql qlVar;
        boolean z11;
        Integer num;
        ql qlVar2;
        int i10;
        int L;
        Float f10;
        int i11;
        boolean z12;
        Float valueOf = Float.valueOf(0.0f);
        if (this.f32937n3 == null && this.G2 == null) {
            vh vhVar2 = this.f32955s2;
            if (vhVar2 == vhVar) {
                vhVar2.J();
            } else if (vhVar == this.f32906e2 && !org.telegram.messenger.p10.i(this.D3).q()) {
                new ug.w0(this.W1, 39, false).show();
            } else {
                int i12 = (j3 > 1L ? 1 : (j3 == 1L ? 0 : -1));
                if (i12 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f32932m1.a(z10, z9);
                this.f32939o1.f(Long.valueOf(j3), z9);
                this.f32976x3 = false;
                this.f32968v3 = false;
                this.f32984z3 = 0.0f;
                this.f32980y3.setVisibility(8);
                RadialProgressView radialProgressView = this.f32972w3;
                radialProgressView.setAlpha(0.0f);
                radialProgressView.setScaleX(0.1f);
                radialProgressView.setScaleY(0.1f);
                radialProgressView.setVisibility(8);
                dh dhVar = this.f32952r3;
                dhVar.setAlpha(1.0f);
                dhVar.setTranslationY(this.f32984z3);
                int i13 = 0;
                while (true) {
                    LongSparseArray longSparseArray = this.f32951r2;
                    if (i13 >= longSparseArray.size()) {
                        break;
                    }
                    ((hi.c4) longSparseArray.valueAt(i13)).setMeasureOffsetY(0);
                    i13++;
                }
                this.Q2 = j3;
                eh ehVar = this.f32956s3;
                int childCount = ehVar.getChildCount();
                int i14 = 0;
                while (i14 < childCount) {
                    View childAt = ehVar.getChildAt(i14);
                    if (childAt instanceof xh) {
                        xh xhVar = (xh) childAt;
                        i11 = childCount;
                        f10 = valueOf;
                        if (xhVar.f40278b == xhVar.f40279c.Q2) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        xhVar.f40634a.f(z12, true);
                    } else {
                        f10 = valueOf;
                        i11 = childCount;
                        if (childAt instanceof wh) {
                            ((wh) childAt).a(true);
                        }
                    }
                    i14++;
                    childCount = i11;
                    valueOf = f10;
                }
                Float f11 = valueOf;
                int firstOffset = (this.f32955s2.getFirstOffset() - org.telegram.messenger.g0.L(11.0f)) - this.V3[0];
                this.f32959t2 = vhVar;
                S0(vhVar);
                if (this.f32959t2.j() != 0) {
                    i7 = 0;
                } else {
                    i7 = 4;
                }
                r7 r7Var = this.R2;
                r7Var.setVisibility(i7);
                if (r7Var.f27676n0) {
                    r7Var.l(true);
                }
                this.f32955s2.u();
                vh vhVar3 = this.f32959t2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f32895a2;
                if (vhVar3 == chatAttachAlertPhotoLayout) {
                    chatAttachAlertPhotoLayout.setCheckCameraWhenShown(true);
                }
                this.f32959t2.H(this.f32955s2);
                this.f32959t2.setVisibility(0);
                if (vhVar.getParent() != null) {
                    this.f28615b.removeView(this.f32959t2);
                }
                int indexOfChild = this.f28615b.indexOfChild(this.f32955s2);
                if (this.f32959t2.getParent() != this.f28615b) {
                    s1(this.f32959t2);
                    ViewGroup viewGroup = this.f28615b;
                    vh vhVar4 = this.f32959t2;
                    if (vhVar4 != this.f32909f2) {
                        indexOfChild++;
                    }
                    viewGroup.addView(vhVar4, indexOfChild, c8.ha.c(-1.0f, -1));
                }
                qg qgVar = new qg(this, 5);
                vh vhVar5 = this.f32955s2;
                boolean z13 = vhVar5 instanceof bm;
                oh ohVar = this.V1;
                if (!z13 && !(this.f32959t2 instanceof bm)) {
                    if (z9) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        this.f32959t2.setAlpha(0.0f);
                        this.f32959t2.setTranslationY(org.telegram.messenger.g0.L(78.0f));
                        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f32955s2, View.TRANSLATION_Y, org.telegram.messenger.g0.L(78.0f) + firstOffset), ObjectAnimator.ofFloat(this.f32955s2, ohVar, 0.0f, 1.0f), ObjectAnimator.ofFloat(r7Var, View.ALPHA, r7Var.getAlpha(), 0.0f));
                        animatorSet.setDuration(180L);
                        animatorSet.setInterpolator(xq.f40329f);
                        animatorSet.addListener(new bi.y4(this, firstOffset, qgVar, 1));
                        this.f32937n3 = animatorSet;
                        vh vhVar6 = this.f32955s2;
                        ohVar.getClass();
                        ohVar.a(vhVar6, f11);
                        animatorSet.start();
                    } else {
                        vhVar5.setAlpha(0.0f);
                        qgVar.run();
                        P1(0);
                        this.f28615b.invalidate();
                    }
                } else {
                    int max = Math.max(this.f32959t2.getWidth(), this.f32955s2.getWidth());
                    vh vhVar7 = this.f32959t2;
                    if (vhVar7 instanceof bm) {
                        vhVar7.setTranslationX(max);
                        vh vhVar8 = this.f32955s2;
                        if ((vhVar8 instanceof ChatAttachAlertPhotoLayout) && (qlVar2 = ((ChatAttachAlertPhotoLayout) vhVar8).P) != null) {
                            qlVar2.setVisibility(4);
                        }
                    } else {
                        this.f32955s2.setTranslationX(-max);
                        vh vhVar9 = this.f32959t2;
                        if (vhVar9 == chatAttachAlertPhotoLayout && (qlVar = ((ChatAttachAlertPhotoLayout) vhVar9).P) != null) {
                            qlVar.setVisibility(0);
                        }
                    }
                    this.f32959t2.setAlpha(1.0f);
                    this.f32955s2.setAlpha(1.0f);
                    if (z9) {
                        vh vhVar10 = this.f32955s2;
                        ohVar.getClass();
                        ohVar.a(vhVar10, f11);
                        org.telegram.messenger.g0.h3(new ng(this, vhVar, qgVar, 0));
                    } else {
                        if (this.f32959t2.getCurrentItemTop() <= vhVar.getButtonsHideOffset()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f32955s2.v(1.0f);
                        this.f32959t2.v(1.0f);
                        this.f32955s2.m(this.f32911f4);
                        this.f32959t2.m(this.f32911f4);
                        this.f28615b.invalidate();
                        this.X0.g();
                        vh vhVar11 = this.f32955s2;
                        Float valueOf2 = Float.valueOf(1.0f);
                        ohVar.getClass();
                        ohVar.a(vhVar11, valueOf2);
                        if (z11) {
                            num = 1;
                        } else {
                            num = null;
                        }
                        r7Var.setTag(num);
                        qgVar.run();
                    }
                }
                if (this.f32914g4 && !(vhVar instanceof hi.c4)) {
                    i10 = 0;
                    this.f32914g4 = false;
                    r7Var.updateColors();
                    r7Var.invalidate();
                    i1();
                } else {
                    i10 = 0;
                }
                if (i12 != 0 && j3 != 6 && j3 != 17 && !(vhVar instanceof hi.c4)) {
                    if (j3 == 4) {
                        L = org.telegram.messenger.g0.L(84.0f);
                    } else {
                        L = i10;
                    }
                } else {
                    L = org.telegram.messenger.g0.L(46.0f);
                }
                r7Var.setForcedMenuWidth(L);
            }
        }
    }

    @Override
    public final boolean H() {
        return this.f32955s2.b();
    }

    @Override
    public final boolean H0() {
        vh vhVar = this.f32955s2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f32895a2;
        if (vhVar == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout.f31205i1) {
            return true;
        }
        return false;
    }

    public final void H1(boolean z9, Boolean bool) {
        di diVar;
        if (this.d2 == null) {
            diVar = this;
            bn bnVar = new bn(diVar, getContext(), false, this.I0, bool);
            diVar.d2 = bnVar;
            diVar.f32947q2[1] = bnVar;
            bnVar.setDelegate(new mg(this, 17));
        } else {
            diVar = this;
        }
        G1(diVar.d2, 9L, z9);
    }

    public final void I1(boolean z9, boolean z10) {
        Integer num;
        boolean z11;
        float f10;
        float f11;
        vh vhVar;
        float f12;
        float f13;
        float f14;
        int i7;
        boolean z12;
        this.f32925k1.a(z9, z10);
        r7 r7Var = this.R2;
        if ((z9 && r7Var.getTag() == null) || (!z9 && r7Var.getTag() != null)) {
            if (z9) {
                num = 1;
            } else {
                num = null;
            }
            r7Var.setTag(num);
            AnimatorSet animatorSet = this.S2;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.S2 = null;
            }
            if (!this.f32970w1 && !this.N2 && ((this.K2 != 0 || !this.f32927k3) && this.f32955s2 == this.f32895a2 && (this.F3 || this.G3))) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.f32955s2 == this.K1) {
                z11 = false;
            }
            dh dhVar = this.f32952r3;
            org.telegram.ui.ActionBar.r0 r0Var = this.U2;
            if (z9) {
                if (z11) {
                    r0Var.setVisibility(0);
                    r0Var.setClickable(true);
                }
            } else if (this.M2 && this.f32975x2.getTag() == null) {
                dhVar.setVisibility(0);
            }
            org.telegram.ui.ActionBar.f2 f2Var = this.W1;
            if (f2Var != null) {
                if (z9) {
                    if (this.f32900b4) {
                        i7 = org.telegram.ui.ActionBar.k6.f27931hh;
                    } else {
                        i7 = org.telegram.ui.ActionBar.k6.f27921h5;
                    }
                    if (i0.a.h(org.telegram.ui.ActionBar.k6.w0(i7, this.I0)) > 0.699999988079071d) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    org.telegram.messenger.g0.q3(this, z12);
                } else {
                    org.telegram.messenger.g0.q3(this, f2Var.isLightStatusBar());
                }
            }
            float f15 = 0.6f;
            float f16 = 0.0f;
            if (z10) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.S2 = animatorSet2;
                if (z9) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                animatorSet2.setDuration(Math.abs(f12 - r7Var.getAlpha()) * 180.0f);
                ArrayList arrayList = new ArrayList();
                Property property = View.ALPHA;
                if (z9) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(r7Var, property, f13);
                ofFloat.addUpdateListener(new og(this, 4));
                arrayList.add(ofFloat);
                if (z11) {
                    if (z9) {
                        f16 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(r0Var, property, f16));
                    Property property2 = View.SCALE_X;
                    if (z9) {
                        f14 = 1.0f;
                    } else {
                        f14 = 0.6f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(r0Var, property2, f14));
                    Property property3 = View.SCALE_Y;
                    if (z9) {
                        f15 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(r0Var, property3, f15));
                }
                this.S2.playTogether(arrayList);
                this.S2.addListener(new t9(2, this, z9));
                this.S2.setInterpolator(xq.h);
                this.S2.setDuration(380L);
                this.S2.start();
                return;
            }
            if (z9 && this.M2 && ((vhVar = this.f32955s2) == null || vhVar.M())) {
                dhVar.setVisibility(4);
            }
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            r7Var.setAlpha(f10);
            if (z11) {
                if (z9) {
                    f16 = 1.0f;
                }
                r0Var.setAlpha(f16);
                if (z9) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.6f;
                }
                r0Var.setScaleX(f11);
                if (z9) {
                    f15 = 1.0f;
                }
                r0Var.setScaleY(f15);
            }
            if (!z9) {
                org.telegram.ui.ActionBar.r0 r0Var2 = this.Y2;
                if (r0Var2 != null) {
                    r0Var2.setVisibility(4);
                }
                if (this.K2 != 0 || !this.f32927k3) {
                    r0Var.setVisibility(4);
                }
            }
        }
    }

    @Override
    public final void J() {
        AnimatorSet animatorSet = this.f28654z0;
        if (animatorSet != null) {
            animatorSet.cancel();
            r1.g gVar = this.f32924j4;
            if (gVar != null) {
                gVar.d();
            }
            AnimatorSet animatorSet2 = this.f32928k4;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            this.f28654z0 = null;
            this.A0 = 0;
        }
    }

    public final void J1() {
        float alpha;
        int[] iArr = this.A2;
        gh ghVar = this.f32979y2;
        ghVar.getLocationOnScreen(iArr);
        if (this.f32981y4 != null) {
            vh vhVar = this.f32955s2;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f32895a2;
            if ((vhVar == chatAttachAlertPhotoLayout || vhVar == this.f32915h2) && this.T1) {
                bi.x5 x5Var = this.I2;
                alpha = (x5Var.getAlpha() * x5Var.getMeasuredHeight()) + (x5Var.getY() - this.f32981y4.getTop());
            } else {
                alpha = -ghVar.getHeight();
            }
            if (Math.abs(this.f32981y4.getTranslationY() - alpha) > 0.5f) {
                this.f32981y4.setTranslationY(alpha);
                this.f32981y4.invalidate();
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.X();
                }
            }
        }
        U0();
    }

    @Override
    public void K() {
        bi biVar = this.T3;
        if (biVar != null) {
            biVar.c0(new qg(this, 4));
        } else {
            t1();
        }
    }

    public final void K1(int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.di.K1(int):void");
    }

    @Override
    public final void L(int i7) {
        super.L(i7);
        this.f32955s2.r(i7);
    }

    public final void L1() {
        boolean i7;
        float f10;
        float f11;
        float f12;
        vh vhVar = this.f32955s2;
        int i10 = 0;
        if (vhVar == null) {
            i7 = false;
        } else {
            i7 = vhVar.i();
        }
        ei.k kVar = this.Z2;
        kVar.setEnabled(i7);
        vh vhVar2 = this.f32955s2;
        float f13 = 0.5f;
        if (vhVar2 != null) {
            if (vhVar2.i()) {
                f11 = 1.0f;
            } else {
                f11 = 0.5f;
            }
            if (this.f32959t2 == null) {
                f12 = 1.0f;
            } else {
                f12 = this.U1;
            }
            f10 = (f11 * f12) + 0.0f;
        } else {
            f10 = 0.0f;
        }
        vh vhVar3 = this.f32959t2;
        if (vhVar3 != null) {
            if (vhVar3.i()) {
                f13 = 1.0f;
            }
            f10 = com.google.android.recaptcha.internal.a.z(1.0f, this.U1, f13, f10);
        }
        this.f32896a3 = f10;
        if (kVar != null) {
            float f14 = f10 * this.f32899b3;
            kVar.setAlpha(f14);
            if (f14 <= 0.0f) {
                i10 = 4;
            }
            kVar.setVisibility(i10);
        }
    }

    public final void M0() {
        if (a1().f35416a.length() <= 0) {
            return;
        }
        this.f32955s2.a(a1().getText());
    }

    public final void M1(vh vhVar, int i7) {
        boolean z9;
        int i10;
        int i11;
        if (vhVar != null) {
            dh.g gVar = this.f32985z4;
            if (gVar != null && Build.VERSION.SDK_INT >= 31) {
                gVar.f(0.0f, i7);
            }
            int currentItemTop = vhVar.getCurrentItemTop();
            if (currentItemTop != Integer.MAX_VALUE) {
                boolean z10 = false;
                if (vhVar == this.f32955s2 && currentItemTop <= vhVar.getButtonsHideOffset()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                this.I1 = z9;
                if (vhVar == this.f32955s2) {
                    I1(z9, true);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) vhVar.getLayoutParams();
                if (layoutParams == null) {
                    i10 = 0;
                } else {
                    i10 = layoutParams.topMargin;
                }
                int D = org.telegram.messenger.camera.q.D(11.0f, i10, currentItemTop);
                vh vhVar2 = this.f32955s2;
                if (vhVar2 == vhVar) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                if ((vhVar2 instanceof bm) || (this.f32959t2 instanceof bm)) {
                    Object obj = this.f32937n3;
                    if ((obj instanceof r1.g) && ((r1.g) obj).f54169f) {
                        z10 = true;
                    }
                }
                int[] iArr = this.V3;
                int i12 = iArr[i11];
                if (i12 == D && !z10) {
                    if (i7 != 0) {
                        this.W3 = i12;
                        return;
                    }
                    return;
                }
                this.W3 = i12;
                iArr[i11] = D;
                P1(i11);
                this.f28615b.invalidate();
            }
        }
    }

    public final boolean N0() {
        org.telegram.ui.ActionBar.f2 f2Var = this.W1;
        if ((f2Var instanceof org.telegram.ui.an) && ((org.telegram.ui.an) f2Var).Y6()) {
            return true;
        }
        return false;
    }

    public final void N1(boolean z9) {
        fi.u uVar;
        boolean z10;
        float f10;
        float f11;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f32895a2;
        if (chatAttachAlertPhotoLayout != null && (uVar = this.V2) != null) {
            int i7 = 0;
            if (this.f32927k3 && this.Z1 && this.f32955s2 == chatAttachAlertPhotoLayout && ChatAttachAlertPhotoLayout.f0()) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z11 = !ChatAttachAlertPhotoLayout.U();
            uVar.f12872f = z11;
            if (!z9) {
                ((w5) uVar.f12873g).a(z11);
            }
            uVar.invalidateSelf();
            float f12 = 0.0f;
            float f13 = 0.6f;
            org.telegram.ui.ActionBar.r0 r0Var = this.W2;
            if (z9 && this.f32927k3) {
                r0Var.setVisibility(0);
                ViewPropertyAnimator animate = r0Var.animate();
                if (z10) {
                    f12 = 1.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f12);
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.6f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f11);
                if (z10) {
                    f13 = 1.0f;
                }
                scaleX.scaleY(f13).setDuration(320L).setInterpolator(xq.h).withEndAction(new zg(this, z10, 0)).start();
                return;
            }
            if (!z10) {
                i7 = 8;
            }
            r0Var.setVisibility(i7);
            if (z10) {
                f12 = 1.0f;
            }
            r0Var.setAlpha(f12);
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.6f;
            }
            r0Var.setScaleX(f10);
            if (z10) {
                f13 = 1.0f;
            }
            r0Var.setScaleY(f13);
        }
    }

    public final boolean O0(CharSequence charSequence) {
        org.telegram.ui.ActionBar.f2 f2Var = this.W1;
        if (f2Var instanceof org.telegram.ui.an) {
            return ChatActivityEnterView.C(this.D3, ((org.telegram.ui.an) f2Var).a(), f2Var, charSequence);
        }
        return false;
    }

    public final void O1(boolean z9) {
        boolean z10;
        float f10;
        vh vhVar = this.f32895a2;
        if (z9) {
            if (!this.D1) {
                return;
            }
            if (this.f32915h2 == null) {
                Context context = getContext();
                org.telegram.ui.ActionBar.f6 f6Var = this.f32942p1;
                if (f6Var == null) {
                    f6Var = this.I0;
                }
                ?? vhVar2 = new vh(context, f6Var, this);
                vhVar2.D = 0.0f;
                vhVar2.E = 0.0f;
                vhVar2.F = 0.0f;
                vhVar2.G = 0.0f;
                vhVar2.H = 0.0f;
                vhVar2.I = 0.0f;
                vhVar2.J = null;
                vhVar2.K = false;
                vhVar2.M = 0.0f;
                vhVar2.Q = false;
                vhVar2.S = false;
                Point point = org.telegram.messenger.g0.f22537q;
                if (point.y > point.x) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                vhVar2.T = z10;
                vhVar2.f32164n = f6Var;
                vhVar2.f38951f = true;
                vhVar2.setWillNotDraw(false);
                di diVar = vhVar2.f38948b;
                org.telegram.ui.ActionBar.y q10 = diVar.R2.q();
                TextView textView = new TextView(context);
                vhVar2.f32169y = textView;
                org.telegram.ui.ActionBar.f6 f6Var2 = vhVar2.f38947a;
                fi.w2 w2Var = new fi.w2(vhVar2, context, q10, f6Var2, 2);
                r7 r7Var = diVar.R2;
                if (org.telegram.messenger.g0.Q1()) {
                    f10 = 64.0f;
                } else {
                    f10 = 56.0f;
                }
                r7Var.addView(w2Var, 0, c8.ha.d(-2, -1.0f, 51, f10, 0.0f, 40.0f, 0.0f));
                textView.setImportantForAccessibility(2);
                textView.setGravity(3);
                textView.setSingleLine(true);
                textView.setLines(1);
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27956j5, f6Var2);
                textView.setText(org.telegram.messenger.hd.M0(2131753958, null));
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setCompoundDrawablePadding(org.telegram.messenger.g0.L(4.0f));
                textView.setPadding(0, 0, org.telegram.messenger.g0.L(10.0f), 0);
                textView.setAlpha(0.0f);
                w2Var.addView(textView, c8.ha.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
                bi.q1 q1Var = new bi.q1(vhVar2, context, f6Var2, 17);
                vhVar2.f32165r = q1Var;
                q1Var.setAdapter(new org.telegram.ui.x7(vhVar2, 3));
                v4.b0 b0Var = new v4.b0(1, false);
                vhVar2.f32166s = b0Var;
                q1Var.setLayoutManager(b0Var);
                q1Var.setClipChildren(false);
                q1Var.setClipToPadding(false);
                q1Var.setOverScrollMode(2);
                q1Var.setVerticalScrollBarEnabled(false);
                am amVar = new am(vhVar2, context);
                vhVar2.f32167w = amVar;
                amVar.setClipToPadding(true);
                amVar.setClipChildren(true);
                vhVar2.addView(q1Var, c8.ha.c(-1.0f, -1));
                vhVar2.P = diVar.f32895a2;
                amVar.f31849c.clear();
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = vhVar2.P;
                amVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
                amVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
                amVar.c();
                UndoView undoView = new UndoView(context, null, false, diVar.f32942p1);
                vhVar2.f32168x = undoView;
                undoView.setEnterOffsetMargin(org.telegram.messenger.g0.L(32.0f));
                vhVar2.addView(undoView, c8.ha.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 52.0f));
                vhVar2.N = context.getResources().getDrawable(2131232549);
                this.f32915h2 = vhVar2;
                vhVar2.bringToFront();
            }
            vh vhVar3 = this.f32955s2;
            bm bmVar = this.f32915h2;
            if (vhVar3 != bmVar) {
                vhVar = bmVar;
            }
            F1(vhVar);
            return;
        }
        F1(vhVar);
    }

    public final void P0() {
        int i7;
        int i10;
        int i11;
        boolean z9;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        eh ehVar = this.f32956s3;
        if (ehVar == null) {
            return;
        }
        int childCount = ehVar.getChildCount();
        boolean z10 = false;
        for (int i17 = 0; i17 < childCount; i17++) {
            ehVar.getChildAt(i17);
        }
        boolean z11 = this.f32900b4;
        if (z11) {
            i7 = org.telegram.ui.ActionBar.k6.Vg;
        } else {
            i7 = org.telegram.ui.ActionBar.k6.f27956j5;
        }
        org.telegram.ui.ActionBar.r6.V(this.f32904d3, i7, this.I0);
        if (z11) {
            i10 = org.telegram.ui.ActionBar.k6.Vg;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.f27956j5;
        }
        org.telegram.ui.ActionBar.r6.V(this.f32920i3, i10, this.I0);
        org.telegram.ui.ActionBar.r6.V(this.Z2, org.telegram.ui.ActionBar.k6.Gi, this.I0);
        if (z11) {
            i11 = org.telegram.ui.ActionBar.k6.Vg;
        } else {
            i11 = org.telegram.ui.ActionBar.k6.f27956j5;
        }
        int w02 = org.telegram.ui.ActionBar.k6.w0(i11, this.I0);
        if (this.f32938n4 && w02 == this.f32935m4) {
            z9 = false;
        } else {
            z9 = true;
        }
        this.f32938n4 = true;
        this.f32935m4 = w02;
        org.telegram.ui.ActionBar.r0 r0Var = this.U2;
        if (z9) {
            r0Var.setIconColor(w02);
        }
        Drawable background = r0Var.getBackground();
        if (z11) {
            i12 = org.telegram.ui.ActionBar.k6.Wg;
        } else {
            i12 = org.telegram.ui.ActionBar.k6.I5;
        }
        org.telegram.ui.ActionBar.k6.C1(org.telegram.ui.ActionBar.k6.w0(i12, this.I0), background);
        int i18 = org.telegram.ui.ActionBar.k6.E8;
        r0Var.O(org.telegram.ui.ActionBar.k6.w0(i18, this.I0), false);
        r0Var.O(org.telegram.ui.ActionBar.k6.w0(i18, this.I0), true);
        r0Var.H(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G8, this.I0));
        org.telegram.ui.ActionBar.r0 r0Var2 = this.W2;
        if (r0Var2 != null && z9) {
            r0Var2.setIconColor(w02);
        }
        org.telegram.ui.ActionBar.r0 r0Var3 = this.Y2;
        if (r0Var3 != null) {
            if (z9) {
                r0Var3.setIconColor(w02);
            }
            Drawable background2 = r0Var3.getBackground();
            if (z11) {
                i16 = org.telegram.ui.ActionBar.k6.Wg;
            } else {
                i16 = org.telegram.ui.ActionBar.k6.I5;
            }
            org.telegram.ui.ActionBar.k6.C1(org.telegram.ui.ActionBar.k6.w0(i16, this.I0), background2);
        }
        gh ghVar = this.f32979y2;
        org.telegram.ui.ActionBar.f6 f6Var = ghVar.M;
        et etVar = ghVar.f35416a;
        int i19 = ghVar.L;
        if (i19 == 0) {
            etVar.setHintTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.H6, f6Var));
            int i20 = org.telegram.ui.ActionBar.k6.G6;
            etVar.setCursorColor(org.telegram.ui.ActionBar.k6.w0(i20, f6Var));
            etVar.setTextColor(org.telegram.ui.ActionBar.k6.w0(i20, f6Var));
        } else if (i19 != 2 && i19 != 3) {
            etVar.setHintTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28144t5, f6Var));
            etVar.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27956j5, f6Var));
        } else {
            etVar.setHintTextColor(-1929379841);
            etVar.setTextColor(-1);
            etVar.setCursorColor(-1);
            etVar.setHandlesColor(-1);
            etVar.setHighlightColor(822083583);
            etVar.D = -1;
        }
        ghVar.f35418c.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Le, f6Var), PorterDuff.Mode.MULTIPLY));
        ft ftVar = ghVar.d;
        if (ftVar != null) {
            ftVar.updateColors();
        }
        org.telegram.ui.ActionBar.r6.m(ehVar, 21, org.telegram.ui.ActionBar.k6.A5, this.I0);
        if (z11) {
            i13 = org.telegram.ui.ActionBar.k6.Vg;
        } else {
            i13 = org.telegram.ui.ActionBar.k6.f27956j5;
        }
        org.telegram.ui.ActionBar.f6 f6Var2 = this.I0;
        r7 r7Var = this.R2;
        org.telegram.ui.ActionBar.r6.m(r7Var, 1, i13, f6Var2);
        if (z11) {
            i14 = org.telegram.ui.ActionBar.k6.Wg;
        } else {
            i14 = org.telegram.ui.ActionBar.k6.I5;
        }
        org.telegram.ui.ActionBar.r6.m(r7Var, 3, i14, this.I0);
        if (z11) {
            i15 = org.telegram.ui.ActionBar.k6.Vg;
        } else {
            i15 = org.telegram.ui.ActionBar.k6.f27956j5;
        }
        org.telegram.ui.ActionBar.r6.m(r7Var, 5, i15, this.I0);
        int d12 = d1(false);
        org.telegram.ui.ActionBar.k6.C1(d12, this.f28642r0);
        ri.c cVar = this.A4;
        if (cVar.f54472b != d12) {
            cVar.a(d12);
            lh.f fVar = this.f32944p3;
            if (fVar != null) {
                fVar.invalidate();
            }
            fh fhVar = this.f32948q3;
            if (fhVar != null) {
                fhVar.invalidate();
            }
        }
        this.f28615b.invalidate();
        int i21 = 0;
        while (true) {
            vh[] vhVarArr = this.f32947q2;
            if (i21 >= vhVarArr.length) {
                break;
            }
            vh vhVar = vhVarArr[i21];
            if (vhVar != null) {
                vhVar.d();
            }
            i21++;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            this.F0 = -1;
            this.G0 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27939i5, this.I0);
            org.telegram.messenger.g0.u3(this, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27921h5, this.I0), false, null);
            if (org.telegram.messenger.g0.B(this.G0) > 0.721d) {
                z10 = true;
            }
            org.telegram.messenger.g0.n3(this, z10);
            return;
        }
        P(org.telegram.ui.ActionBar.k6.f27921h5);
    }

    public final void P1(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.di.P1(int):void");
    }

    public final void Q0(boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.di.Q0(boolean):void");
    }

    public final void Q1() {
        int i7 = 0;
        P1(0);
        this.f32930l3.invalidate();
        bi.x5 x5Var = this.I2;
        x5Var.invalidate();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f32895a2;
        if (chatAttachAlertPhotoLayout != null) {
            jl jlVar = chatAttachAlertPhotoLayout.E;
            chatAttachAlertPhotoLayout.X();
            if (jlVar != null && jlVar.getFastScroll() != null) {
                ui0 fastScroll = jlVar.getFastScroll();
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + chatAttachAlertPhotoLayout.f31217p1;
                if (this.T1) {
                    i7 = (int) (x5Var.getAlpha() * x5Var.getMeasuredHeight());
                }
                fastScroll.f38653h0 = currentActionBarHeight + i7;
                jlVar.getFastScroll().invalidate();
            }
        }
        J1();
        U0();
    }

    public final void R0() {
        float f10 = this.f32922j1.f55395e;
        float f11 = (1.0f - this.f32918i1.f55395e) * f10;
        this.f32948q3.setTranslationY(org.telegram.messenger.g0.L(48.0f) * Math.min(Math.min(1.0f, 1.0f - ((1.0f - f10) * (1.0f - this.f32925k1.f55395e))), 1.0f - f11));
    }

    public final void S0(vh vhVar) {
        int L;
        boolean e10 = vhVar.e();
        int i7 = 0;
        lh.f fVar = this.f32944p3;
        if (fVar != null) {
            if (e10) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(48.0f);
            }
            fVar.setFadeHeightBottom(L);
        }
        fh fhVar = this.f32948q3;
        if (fhVar != null) {
            if (e10) {
                i7 = 4;
            }
            fhVar.setVisibility(i7);
        }
    }

    public final void T0() {
        float f10;
        float f11 = this.l1.f55395e;
        float f12 = this.f32932m1.f55395e;
        float a10 = a8.j7.a(this.n1.f55395e);
        if (this.L3) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        p00.d(this.f32983z2, com.google.android.recaptcha.internal.a.D(f11, f12, a10, f10));
    }

    @Override
    public final ArrayList U() {
        ArrayList<org.telegram.ui.ActionBar.t6> themeDescriptions;
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        while (true) {
            vh[] vhVarArr = this.f32947q2;
            if (i7 < vhVarArr.length) {
                vh vhVar = vhVarArr[i7];
                if (vhVar != null && (themeDescriptions = vhVar.getThemeDescriptions()) != null) {
                    arrayList.addAll(themeDescriptions);
                }
                i7++;
            } else {
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.f28618c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27939i5));
                return arrayList;
            }
        }
    }

    public final void U0() {
        lh lhVar = this.C2;
        dh dhVar = this.B2;
        bi.x5 x5Var = this.I2;
        if (x5Var != null && x5Var.getVisibility() == 0 && x5Var.getAlpha() != 0.0f) {
            float f10 = this.f32918i1.f55395e;
            float abs = Math.abs(org.telegram.messenger.g0.T1(-1.0f, 1.0f, f10));
            lhVar.setAlpha(abs * abs * abs * abs);
            dhVar.setTranslationY(org.telegram.messenger.g0.T1(this.f32897a4, ((x5Var.getTranslationY() + x5Var.getTop()) - dhVar.getTop()) + org.telegram.messenger.g0.L(8.0f), xq.f40332j.getInterpolation(f10)));
            return;
        }
        dhVar.setTranslationY(this.f32897a4);
        lhVar.setAlpha(1.0f);
    }

    public final void V0(int i7) {
        this.M2 = true;
        this.f32952r3.setVisibility(0);
        this.f32978y1 = true;
        this.f32982z1 = i7;
        this.K2 = 0;
        this.f32970w1 = false;
        this.f32974x1 = false;
        this.A1 = null;
        org.telegram.ui.ActionBar.r0 r0Var = this.f32907e3;
        if (r0Var != null) {
            this.f32904d3.setTranslationY(0.0f);
            r0Var.setVisibility(8);
        }
    }

    public final void W0(hi.u1 u1Var) {
        String M0 = org.telegram.messenger.hd.M0(2131752122, null);
        TextView textView = this.f32904d3;
        textView.setText(M0);
        this.M2 = false;
        this.f32952r3.setVisibility(8);
        this.K2 = 1;
        this.f32970w1 = true;
        this.f32974x1 = true;
        this.Z1 = false;
        this.A1 = u1Var;
        org.telegram.ui.ActionBar.r0 r0Var = this.f32907e3;
        if (r0Var != null) {
            textView.setTranslationY(-org.telegram.messenger.g0.L(8.0f));
            r0Var.setVisibility(0);
            r0Var.setClickable(true);
            r0Var.setAlpha(1.0f);
            r0Var.setScaleX(1.0f);
            r0Var.setScaleY(1.0f);
        }
    }

    public final int X0() {
        org.telegram.messenger.mj mjVar;
        org.telegram.messenger.kj kjVar;
        org.telegram.ui.ActionBar.f2 f2Var = this.W1;
        if (!(f2Var instanceof org.telegram.ui.an) || (mjVar = ((org.telegram.ui.an) f2Var).f43991v5) == null || (kjVar = mjVar.f24019b) == null) {
            return 0;
        }
        return kjVar.f23691g.size();
    }

    @Override
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        vh vhVar;
        int i10;
        if (i7 == 0) {
            U0();
            R0();
            return;
        }
        int i11 = 1;
        if (i7 == 2) {
            R0();
            bn bnVar = this.d2;
            if (bnVar != null && ((vhVar = this.f32959t2) == bnVar || this.f32955s2 == bnVar)) {
                if (vhVar == bnVar) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                P1(i10);
            }
            bn bnVar2 = this.f32906e2;
            if (bnVar2 != null) {
                vh vhVar2 = this.f32959t2;
                if (vhVar2 == bnVar2 || this.f32955s2 == bnVar2) {
                    if (vhVar2 != bnVar2) {
                        i11 = 0;
                    }
                    P1(i11);
                }
            }
        } else if (i7 == 1) {
            R0();
        } else if (i7 == 3) {
            T0();
        } else if (i7 == 4) {
            T0();
        } else if (i7 == 5) {
            T0();
            lh lhVar = this.C2;
            if (lhVar != null) {
                lhVar.setEphemeralFactor(f10);
                lhVar.setSameWidthFactor(f10);
            }
        }
    }

    public final TLRPC.Chat Y0() {
        org.telegram.ui.ActionBar.f2 f2Var = this.W1;
        if (f2Var instanceof org.telegram.ui.an) {
            return ((org.telegram.ui.an) f2Var).f43772e;
        }
        return org.telegram.messenger.qp.s1(this.D3).M0(Long.valueOf(-this.Q1));
    }

    public final float Z0() {
        dh dhVar = this.f32975x2;
        float alpha = 1.0f - dhVar.getAlpha();
        return dhVar.getMeasuredHeight() - (alpha * (dhVar.getMeasuredHeight() - org.telegram.messenger.g0.L(84.0f)));
    }

    @Override
    public final void a(boolean z9) {
        if (z9) {
            this.f32977x4 = z9;
        }
        dismiss();
    }

    public final kt a1() {
        vh vhVar;
        if (this.T1 && ((vhVar = this.f32955s2) == this.f32895a2 || vhVar == this.f32915h2)) {
            return this.J2;
        }
        return this.f32979y2;
    }

    public final long b1() {
        org.telegram.ui.ActionBar.f2 f2Var = this.W1;
        if (f2Var instanceof org.telegram.ui.an) {
            return ((org.telegram.ui.an) f2Var).a();
        }
        return this.Q1;
    }

    public final int c1(int i7) {
        vh vhVar = this.f32959t2;
        int[] iArr = this.V3;
        if (vhVar != null && ((this.f32955s2 instanceof bm) || (vhVar instanceof bm))) {
            return org.telegram.messenger.g0.W1(this.U1, iArr[0], iArr[1]);
        }
        return iArr[i7];
    }

    public final int d1(boolean z9) {
        boolean q10;
        int i7;
        r7 r7Var;
        if (this.f32900b4) {
            return org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27931hh, this.I0);
        }
        org.telegram.ui.ActionBar.f6 f6Var = this.I0;
        if (f6Var != null) {
            q10 = f6Var.a();
        } else {
            q10 = org.telegram.ui.ActionBar.k6.I.q();
        }
        Iterator it = this.f32939o1.iterator();
        float f10 = 0.0f;
        while (it.hasNext()) {
            te.e eVar = (te.e) it.next();
            long longValue = ((Long) eVar.f55404a).longValue();
            if (longValue == 1 || longValue == 3 || longValue == 4 || longValue == 5 || longValue == 6 || longValue == 9 || longValue == 11 || longValue == 12) {
                f10 += eVar.c();
            }
        }
        float a10 = c8.j9.a(f10, 0.0f, 1.0f);
        if (z9 && (r7Var = this.R2) != null && r7Var.getVisibility() == 0) {
            a10 *= 1.0f - r7Var.getAlpha();
        }
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27921h5, this.I0);
        if (q10) {
            i7 = org.telegram.ui.ActionBar.k6.f27792a7;
        } else {
            i7 = org.telegram.ui.ActionBar.k6.f27939i5;
        }
        return i0.a.f(a10, w02, org.telegram.ui.ActionBar.k6.w0(i7, this.I0));
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 != org.telegram.messenger.qs.T0 && i7 != org.telegram.messenger.qs.W4 && i7 != org.telegram.messenger.qs.F1) {
            if (i7 == org.telegram.messenger.qs.f24984f5) {
                this.B1 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24459s0).H0();
                return;
            }
            return;
        }
        ai aiVar = this.f32964u3;
        if (aiVar != null) {
            aiVar.f();
        }
    }

    @Override
    public final void dismiss() {
        boolean z9;
        ih ihVar;
        gh ghVar;
        if (!this.f32955s2.q() && !this.I) {
            vh vhVar = this.f32955s2;
            ik ikVar = this.f32936n2;
            if (vhVar == ikVar && ikVar != null && !ikVar.K && ikVar.P0 != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.f32940o2 = z9;
            if (!z9 && (ghVar = this.f32979y2) != null) {
                org.telegram.messenger.g0.v1(ghVar.getEditText());
            }
            if (!this.f32940o2 && (ihVar = this.J2) != null) {
                org.telegram.messenger.g0.v1(ihVar.getEditText());
            }
            this.f32951r2.clear();
            org.telegram.ui.ActionBar.f2 f2Var = this.W1;
            if (f2Var == null) {
                f2Var = LaunchActivity.Q();
            }
            if (!this.f32977x4 && f2Var != null && this.f32955s2.getSelectedItemsCount() > 0 && !this.f32970w1) {
                if (!this.f32973w4) {
                    this.f32973w4 = true;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, f2Var.getParentActivity(), this.I0);
                    String M0 = org.telegram.messenger.hd.M0(2131751400, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
                    u1Var.R = M0;
                    u1Var.T = org.telegram.messenger.hd.M0(2131751401, null);
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751407, null), new mg(this, 1));
                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                    u1Var.setOnCancelListener(new tg(this, 0));
                    u1Var.N = new p0(this, 4);
                    u1Var.show();
                    TextView textView = (TextView) u1Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28089q7, this.I0);
                        return;
                    }
                    return;
                }
                return;
            }
            int i7 = 0;
            while (true) {
                vh[] vhVarArr = this.f32947q2;
                if (i7 >= vhVarArr.length) {
                    break;
                }
                vh vhVar2 = vhVarArr[i7];
                if (vhVar2 != null && this.f32955s2 != vhVar2) {
                    vhVar2.q();
                }
                i7++;
            }
            org.telegram.messenger.g0.u3(this, i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27792a7, this.I0), 0), true, new mg(this, 11));
            if (f2Var != null) {
                org.telegram.messenger.g0.q3(this, f2Var.isLightStatusBar());
            }
            this.f32903c4 = false;
            super.dismiss();
            this.f32977x4 = false;
        }
    }

    public final void e1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.di.e1():void");
    }

    @Override
    public final boolean f0(MotionEvent motionEvent) {
        return this.f32955s2.o(motionEvent);
    }

    public final boolean f1() {
        if (this.T1) {
            vh vhVar = this.f32955s2;
            if (vhVar == this.f32895a2 || vhVar == this.f32915h2) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void h1(EditTextBoldCursor editTextBoldCursor, boolean z9) {
        long j3;
        bi biVar = this.T3;
        if (biVar != null && !this.f32941o3) {
            boolean f02 = biVar.f0();
            this.f32941o3 = true;
            bi.u7 u7Var = new bi.u7(this, editTextBoldCursor, z9, 19);
            if (f02) {
                j3 = 200;
            } else {
                j3 = 0;
            }
            org.telegram.messenger.g0.i3(u7Var, j3);
        }
    }

    public final void i1() {
        if (this.f28642r0 != null && this.f28615b != null) {
            int d12 = d1(false);
            org.telegram.ui.ActionBar.k6.C1(d12, this.f28642r0);
            ri.c cVar = this.A4;
            if (cVar.f54472b != d12) {
                cVar.a(d12);
                lh.f fVar = this.f32944p3;
                if (fVar != null) {
                    fVar.invalidate();
                }
                fh fhVar = this.f32948q3;
                if (fhVar != null) {
                    fhVar.invalidate();
                }
            }
            L1();
            this.f28615b.invalidate();
        }
    }

    @Override
    public final boolean j0() {
        TL_wallet.walletTransaction wallettransaction;
        final ik ikVar = this.f32936n2;
        if (ikVar != null && this.f32955s2 == ikVar) {
            final qg qgVar = new qg(this, 1);
            int i7 = ikVar.f34668n;
            org.telegram.ui.Wallet.m9 m9Var = ikVar.R;
            di diVar = ikVar.f38948b;
            AnimatorSet animatorSet = null;
            if (!ikVar.K && (wallettransaction = ikVar.P0) != null && ikVar.Q0 == null && ikVar.R0 == null) {
                if (ikVar.S0) {
                    org.telegram.ui.Wallet.y5 y5Var = new org.telegram.ui.Wallet.y5();
                    y5Var.setCurrentAccount(i7);
                    org.telegram.ui.ActionBar.f2 f2Var = diVar.W1;
                    if (f2Var != null && f2Var.presentFragment(y5Var, false, true)) {
                        org.telegram.ui.Wallet.ba baVar = new org.telegram.ui.Wallet.ba(diVar.f28618c, diVar.f28615b, m9Var.getDiamondView(), y5Var, ikVar.P0, new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        if (!ikVar.K) {
                                            qgVar.run();
                                            return;
                                        }
                                        return;
                                    default:
                                        if (!ikVar.K) {
                                            qgVar.run();
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, diVar);
                        ikVar.R0 = baVar;
                        animatorSet = baVar.f42191m;
                    }
                } else if (wallettransaction.localMessageId != 0) {
                    org.telegram.ui.Wallet.w6 diamondView = m9Var.getDiamondView();
                    if (diamondView.f43295f != null && diamondView.isShown() && diamondView.getAlpha() > 0.01f) {
                        org.telegram.ui.ActionBar.f2 f2Var2 = diVar.W1;
                        if (f2Var2 instanceof org.telegram.ui.an) {
                            org.telegram.ui.an anVar = (org.telegram.ui.an) f2Var2;
                            if (anVar.getCurrentAccount() == i7 && anVar.a() == ikVar.f34673r.f27101id && anVar.f43791f4 == 0 && anVar.getFragmentView() != null && anVar.getFragmentView().isAttachedToWindow()) {
                                org.telegram.ui.Wallet.o6 o6Var = new org.telegram.ui.Wallet.o6(diVar.f28618c, diVar.f28615b, m9Var.getDiamondView(), anVar, ikVar.P0, new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                if (!ikVar.K) {
                                                    qgVar.run();
                                                    return;
                                                }
                                                return;
                                            default:
                                                if (!ikVar.K) {
                                                    qgVar.run();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                }, diVar);
                                ikVar.Q0 = o6Var;
                                animatorSet = o6Var.f42918m;
                            }
                        }
                    }
                }
            }
            if (animatorSet != null) {
                this.f28654z0 = animatorSet;
                this.A0 = 2;
                return true;
            }
        }
        return false;
    }

    public final void j1() {
        int i7 = 0;
        while (true) {
            vh[] vhVarArr = this.f32947q2;
            if (i7 >= vhVarArr.length) {
                break;
            }
            vh vhVar = vhVarArr[i7];
            if (vhVar != null) {
                vhVar.p();
            }
            i7++;
        }
        int i10 = this.D3;
        org.telegram.messenger.qs.f(i10).n(this, org.telegram.messenger.qs.T0);
        org.telegram.messenger.qs.f(i10).n(this, org.telegram.messenger.qs.W4);
        org.telegram.messenger.qs.f(i10).n(this, org.telegram.messenger.qs.f24984f5);
        org.telegram.messenger.qs.f(i10).n(this, org.telegram.messenger.qs.F1);
        this.M1 = true;
        gh ghVar = this.f32979y2;
        if (ghVar != null) {
            ghVar.o();
        }
        ih ihVar = this.J2;
        if (ihVar != null) {
            ihVar.o();
        }
    }

    @Override
    public final boolean k0(View view, int i7, int i10, int i11, int i12) {
        boolean z9;
        int L;
        int measuredWidth;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f32895a2;
        q71 q71Var = chatAttachAlertPhotoLayout.f31210l0;
        bi.e5 e5Var = chatAttachAlertPhotoLayout.f31206j0;
        TextView textView = chatAttachAlertPhotoLayout.f31216p0;
        jl jlVar = chatAttachAlertPhotoLayout.f31219r;
        int i13 = i11 - i7;
        int i14 = i12 - i10;
        if (i13 < i14) {
            z9 = true;
        } else {
            z9 = false;
        }
        int i15 = org.telegram.messenger.g0.f22532n;
        if (view == e5Var) {
            if (z9) {
                if (jlVar.getVisibility() == 0) {
                    e5Var.layout(0, org.telegram.messenger.k5.z(222.0f, i12, i15), i13, org.telegram.messenger.k5.z(96.0f, i12, i15));
                    return true;
                }
                e5Var.layout(0, org.telegram.messenger.k5.z(126.0f, i12, i15), i13, i12 - i15);
                return true;
            } else if (jlVar.getVisibility() == 0) {
                e5Var.layout(org.telegram.messenger.k5.z(222.0f, i11, i15), 0, i11 - org.telegram.messenger.g0.L(96.0f), i14 - i15);
                return true;
            } else {
                e5Var.layout(org.telegram.messenger.k5.z(126.0f, i11, i15), 0, i11, i14 - i15);
                return true;
            }
        } else if (view == q71Var) {
            if (z9) {
                if (jlVar.getVisibility() == 0) {
                    q71Var.layout(0, org.telegram.messenger.k5.z(310.0f, i12, i15), i13, org.telegram.messenger.k5.z(260.0f, i12, i15));
                    return true;
                }
                q71Var.layout(0, org.telegram.messenger.k5.z(176.0f, i12, i15), i13, org.telegram.messenger.k5.z(126.0f, i12, i15));
                return true;
            } else if (jlVar.getVisibility() == 0) {
                q71Var.layout(org.telegram.messenger.k5.z(310.0f, i11, i15), 0, i11 - org.telegram.messenger.g0.L(260.0f), i14 - i15);
                return true;
            } else {
                q71Var.layout(org.telegram.messenger.k5.z(176.0f, i11, i15), 0, i11 - org.telegram.messenger.g0.L(126.0f), i14 - i15);
                return true;
            }
        } else if (view == textView) {
            if (z9) {
                L = (i13 - textView.getMeasuredWidth()) / 2;
                int L2 = i12 - org.telegram.messenger.g0.L(167.0f);
                textView.setRotation(0.0f);
                if (jlVar.getVisibility() == 0) {
                    L2 -= org.telegram.messenger.g0.L(96.0f);
                }
                measuredWidth = L2 - i15;
            } else {
                L = i11 - org.telegram.messenger.g0.L(167.0f);
                measuredWidth = (textView.getMeasuredWidth() / 2) + (i14 / 2);
                textView.setRotation(-90.0f);
                if (jlVar.getVisibility() == 0) {
                    L -= org.telegram.messenger.g0.L(96.0f);
                }
            }
            textView.layout(L, measuredWidth, textView.getMeasuredWidth() + L, textView.getMeasuredHeight() + measuredWidth);
            return true;
        } else if (view != jlVar) {
            return false;
        } else {
            if (z9) {
                int z10 = org.telegram.messenger.k5.z(88.0f, i14, i15);
                view.layout(0, z10, view.getMeasuredWidth(), view.getMeasuredHeight() + z10);
                return true;
            }
            int L3 = (i7 + i13) - org.telegram.messenger.g0.L(88.0f);
            view.layout(L3, 0, view.getMeasuredWidth() + L3, view.getMeasuredHeight());
            return true;
        }
    }

    public final void k1(TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        String p10;
        if (tL_attachMenuBot != null) {
            p10 = tL_attachMenuBot.short_name;
        } else {
            p10 = org.telegram.messenger.t10.p(user);
        }
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = org.telegram.messenger.ui.b0(this.D3).f25791b.bots;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i7);
            i7++;
            if (tL_attachMenuBot2.bot_id == user.f27101id) {
                break;
            }
        }
        String a02 = org.telegram.messenger.hd.a0("BotRemoveFromMenu", null, 2131753002, p10);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        String M0 = org.telegram.messenger.hd.M0(2131753001, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
        u1Var.R = M0;
        if (tL_attachMenuBot == null) {
            a02 = org.telegram.messenger.hd.a0("BotRemoveInlineFromMenu", null, 2131753000, p10);
        }
        u1Var.T = org.telegram.messenger.g0.X2(a02);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747830, "OK"), new a3.h(this, tL_attachMenuBot, user, 24));
        jg.g.w("Cancel", 2131752589, alertDialog$Builder, null);
    }

    @Override
    public final boolean l0(View view, int i7, int i10) {
        boolean z9;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f32895a2;
        tl tlVar = chatAttachAlertPhotoLayout.f31226w;
        di diVar = chatAttachAlertPhotoLayout.f38948b;
        jl jlVar = chatAttachAlertPhotoLayout.f31219r;
        jg.b0 b0Var = chatAttachAlertPhotoLayout.f31221s;
        if (i7 < i10) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (view == chatAttachAlertPhotoLayout.P) {
            if (chatAttachAlertPhotoLayout.f31190b0 && !chatAttachAlertPhotoLayout.f31194d0) {
                chatAttachAlertPhotoLayout.P.measure(View.MeasureSpec.makeMeasureSpec(diVar.T() + diVar.S() + i7, 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
                return true;
            }
        } else {
            bi.e5 e5Var = chatAttachAlertPhotoLayout.f31206j0;
            if (view == e5Var) {
                if (z9) {
                    e5Var.measure(View.MeasureSpec.makeMeasureSpec(i7, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(126.0f), 1073741824));
                    return true;
                }
                e5Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(126.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
                return true;
            }
            q71 q71Var = chatAttachAlertPhotoLayout.f31210l0;
            if (view == q71Var) {
                if (z9) {
                    q71Var.measure(View.MeasureSpec.makeMeasureSpec(i7, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824));
                    return true;
                }
                q71Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
                return true;
            } else if (view == jlVar) {
                chatAttachAlertPhotoLayout.J0 = true;
                if (z9) {
                    jlVar.measure(View.MeasureSpec.makeMeasureSpec(i7, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(80.0f), 1073741824));
                    if (b0Var.f56921o != 0) {
                        jlVar.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                        b0Var.j1(0);
                        tlVar.f();
                    }
                } else {
                    jlVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(80.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
                    if (b0Var.f56921o != 1) {
                        jlVar.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
                        b0Var.j1(1);
                        tlVar.f();
                    }
                }
                chatAttachAlertPhotoLayout.J0 = false;
                return true;
            }
        }
        return false;
    }

    public final void l1() {
        int i7 = 0;
        while (true) {
            vh[] vhVarArr = this.f32947q2;
            if (i7 < vhVarArr.length) {
                vh vhVar = vhVarArr[i7];
                if (vhVar != null) {
                    vhVar.A();
                }
                i7++;
            } else {
                this.Z3 = true;
                return;
            }
        }
    }

    @Override
    public final boolean m0() {
        int i7;
        this.f32895a2.setTranslationX(0.0f);
        this.f32916h3.setAlpha(0.0f);
        this.f32910f3.setAlpha(1.0f);
        this.f28615b.setTranslationY(this.f28615b.getMeasuredHeight());
        AnimatorSet animatorSet = new AnimatorSet();
        this.f32928k4 = animatorSet;
        oh ohVar = this.f32921i4;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, ohVar, 0.0f, 400.0f));
        this.f32928k4.setDuration(400L);
        this.f32928k4.setStartDelay(20L);
        Float valueOf = Float.valueOf(0.0f);
        ohVar.getClass();
        ohVar.a(this, valueOf);
        this.f32928k4.start();
        ValueAnimator valueAnimator = this.B0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.C0, 1.0f);
        this.B0 = ofFloat;
        ofFloat.addUpdateListener(new og(this, 2));
        r1.g gVar = this.f32924j4;
        if (gVar != null) {
            gVar.d();
        }
        r1.g gVar2 = new r1.g((Object) this.f28615b, (r1.e) r1.g.f54159p, 0.0f);
        this.f32924j4 = gVar2;
        if (this.B3 != null) {
            gVar2.f54175m.a(0.75f);
            this.f32924j4.f54175m.b(350.0f);
        } else {
            gVar2.f54175m.a(0.75f);
            this.f32924j4.f54175m.b(350.0f);
        }
        this.f32924j4.h();
        if (this.J) {
            this.f28618c.setLayerType(2, null);
        }
        this.A0 = 1;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f28654z0 = animatorSet2;
        k6 k6Var = m6.d;
        if (this.f28638o0) {
            i7 = this.f28639p0;
        } else {
            i7 = 0;
        }
        animatorSet2.playTogether(ObjectAnimator.ofInt(this.Y, k6Var, i7));
        this.f28654z0.setDuration(400L);
        this.f28654z0.setStartDelay(20L);
        this.f28654z0.setInterpolator(this.f28634k0);
        h2.f fVar = new h2.f((int[]) null);
        ng ngVar = new ng(this, fVar, this.f28653y0, 1);
        this.f32924j4.a(new hi.y3(2, this, ngVar));
        this.f28654z0.addListener(new ah.l(25, this, ngVar));
        fVar.d();
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25004j1, 512);
        this.f28654z0.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        z1(0.0f);
        ofFloat2.addUpdateListener(new og(this, 3));
        ofFloat2.setStartDelay(25L);
        ofFloat2.setDuration(200L);
        ofFloat2.setInterpolator(xq.f40329f);
        ofFloat2.start();
        return true;
    }

    public final void m1() {
        int i7 = 0;
        this.Z3 = false;
        while (true) {
            vh[] vhVarArr = this.f32947q2;
            if (i7 >= vhVarArr.length) {
                break;
            }
            vh vhVar = vhVarArr[i7];
            if (vhVar != null) {
                vhVar.C();
            }
            i7++;
        }
        if (isShowing()) {
            this.T3.f0();
        }
        ai aiVar = this.f32964u3;
        if (aiVar != null) {
            aiVar.f();
        }
    }

    public final void n1() {
        org.telegram.messenger.ij ijVar = this.B3;
        org.telegram.ui.ActionBar.f2 f2Var = this.W1;
        int i7 = this.D3;
        if (ijVar != null && ijVar.q5() && !org.telegram.messenger.t3.z(i7, 24, org.telegram.messenger.ij.B0(this.B3.f23237k)) && (f2Var instanceof org.telegram.ui.an)) {
            org.telegram.ui.an anVar = (org.telegram.ui.an) f2Var;
            org.telegram.messenger.nj njVar = anVar.f44005w5;
            if (njVar == null) {
                njVar = org.telegram.messenger.nj.b(this.B3.f23237k.suggested_post);
            }
            if (!bi.ea.T(i7, njVar.f24189a)) {
                anVar.wc(njVar);
                return;
            }
        }
        if (this.B1 - this.C1 < 0) {
            org.telegram.messenger.g0.F3(this.f32946q1);
            org.telegram.messenger.g0.F3(this.f32950r1);
            try {
                this.C2.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            if (!org.telegram.messenger.qp.s1(i7).D3() && org.telegram.messenger.qp.s1(i7).U4 > this.C1) {
                D1(f2Var);
                return;
            }
            return;
        }
        if (this.B3 == null && (f2Var instanceof org.telegram.ui.an)) {
            org.telegram.ui.an anVar2 = (org.telegram.ui.an) f2Var;
            if (anVar2.c()) {
                v4.J(getContext(), anVar2.a(), new mg(this, 14), this.I0);
                return;
            }
        }
        vh vhVar = this.f32955s2;
        if (vhVar != this.f32895a2 && vhVar != this.f32915h2) {
            if (!vhVar.L(true, 0, 0, this.H2, f1())) {
                this.f32977x4 = true;
                dismiss();
                return;
            }
            return;
        }
        u1(true, 0, 0, this.H2, f1());
    }

    @Override
    public final void o0() {
        if (this.f32955s2.s()) {
            dismiss();
        }
    }

    public final void o1(int i7) {
        Activity activity;
        boolean z9 = true;
        org.telegram.ui.ActionBar.f2 f2Var = this.W1;
        if (i7 == 3) {
            if (this.H3 || !N0()) {
                if (f2Var != null) {
                    activity = f2Var.getParentActivity();
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
                p1(true);
            }
        } else if (i7 == 6 && org.telegram.messenger.g0.J1(f2Var)) {
            if (this.f32909f2 == null) {
                wk wkVar = new wk(this, getContext(), this.I0, (this.f32978y1 || this.L3) ? false : false);
                this.f32909f2 = wkVar;
                this.f32947q2[5] = wkVar;
                vk vkVar = this.f32949q4;
                if (vkVar != null) {
                    wkVar.setDelegate(vkVar);
                } else if (f2Var instanceof org.telegram.ui.an) {
                    wkVar.setDelegate(new mg(this, 18));
                }
            }
            F1(this.f32909f2);
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
        r7 r7Var = this.R2;
        if (r7Var.f27676n0) {
            r7Var.l(true);
        } else if (this.f32955s2.k()) {
        } else {
            if (a1() != null && a1().f35419e) {
                a1().k(true);
            } else {
                super.onBackPressed();
            }
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        org.telegram.ui.ActionBar.f2 f2Var = this.W1;
        if (f2Var != null) {
            org.telegram.messenger.g0.q3(this, f2Var.isLightStatusBar());
        }
    }

    @Override
    public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
        if (this.f32955s2.G(i7)) {
            return true;
        }
        return super.onKeyDown(i7, keyEvent);
    }

    @Override
    public final void onStart() {
        super.onStart();
        Context context = getContext();
        if ((context instanceof ContextWrapper) && !(context instanceof LaunchActivity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof LaunchActivity) {
            ((LaunchActivity) context).f41298z0.add(this.J1);
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
            ((LaunchActivity) context).f41298z0.remove(this.J1);
        }
    }

    public final void p1(boolean z9) {
        if (!this.H3 && z9) {
            cn cnVar = new cn(3, getContext(), this.I0, this);
            this.K1 = cnVar;
            F1(cnVar);
        }
        int i7 = 1;
        if (this.f32901c2 == null) {
            ni niVar = new ni(getContext(), this.I0, this);
            this.f32901c2 = niVar;
            this.f32947q2[3] = niVar;
            niVar.setupBlurredSearchField(this.B4);
            this.f32901c2.setDelegate(new mg(this, 15));
            if (this.f32978y1) {
                this.f32901c2.setMaxSelectedFiles(1);
            }
        }
        org.telegram.ui.ActionBar.f2 f2Var = this.W1;
        if (f2Var instanceof org.telegram.ui.an) {
            TLRPC.Chat chat = ((org.telegram.ui.an) f2Var).f43772e;
            ni niVar2 = this.f32901c2;
            if ((chat == null || org.telegram.messenger.t3.N(chat) || !chat.slowmode_enabled) && this.B3 == null) {
                i7 = -1;
            }
            niVar2.setMaxSelectedFiles(i7);
        }
        if (z9) {
            F1(this.f32901c2);
        }
    }

    public final void q1() {
        boolean z9;
        if (!this.K3) {
            cn cnVar = new cn(5, getContext(), this.I0, this);
            this.K1 = cnVar;
            F1(cnVar);
        }
        if (this.f32898b2 == null) {
            fj fjVar = new fj(getContext(), this.I0, this);
            this.f32898b2 = fjVar;
            this.f32947q2[2] = fjVar;
            fjVar.setupBlurredSearchField(this.B4);
            this.f32898b2.setDelegate(new mh(this));
        }
        org.telegram.ui.ActionBar.f2 f2Var = this.W1;
        if (f2Var instanceof org.telegram.ui.an) {
            TLRPC.Chat chat = ((org.telegram.ui.an) f2Var).f43772e;
            fj fjVar2 = this.f32898b2;
            if (chat != null && !org.telegram.messenger.t3.N(chat) && chat.slowmode_enabled) {
                z9 = false;
            } else {
                z9 = true;
            }
            fjVar2.setMultipleSelectionAllowed(z9);
        }
        F1(this.f32898b2);
    }

    public final void r1(boolean z9) {
        int i7;
        if (!this.E3 && z9) {
            cn cnVar = new cn(4, getContext(), this.I0, this);
            this.K1 = cnVar;
            F1(cnVar);
        }
        boolean z10 = false;
        if (this.f32912g2 == null) {
            if (this.E1) {
                i7 = 2;
            } else {
                i7 = 0;
            }
            vj vjVar = new vj(i7, getContext(), this.I0, this);
            this.f32912g2 = vjVar;
            this.f32947q2[4] = vjVar;
            vjVar.setDelegate(new nh(this));
        }
        int i10 = 1;
        if (this.f32978y1) {
            this.f32912g2.setMaxSelectedFiles(1);
        } else {
            org.telegram.ui.ActionBar.f2 f2Var = this.W1;
            if (f2Var instanceof org.telegram.ui.an) {
                TLRPC.Chat chat = ((org.telegram.ui.an) f2Var).f43772e;
                vj vjVar2 = this.f32912g2;
                if ((chat == null || org.telegram.messenger.t3.N(chat) || !chat.slowmode_enabled) && this.B3 == null) {
                    i10 = -1;
                }
                vjVar2.setMaxSelectedFiles(i10);
            } else {
                this.f32912g2.setMaxSelectedFiles(this.M3);
                vj vjVar3 = this.f32912g2;
                if (!this.E1 && !this.N1) {
                    z10 = true;
                }
                vjVar3.setCanSelectOnlyImageFiles(z10);
            }
        }
        vj vjVar4 = this.f32912g2;
        vjVar4.f38960d0 = this.E1;
        if (z9) {
            F1(vjVar4);
        }
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            P0();
            dh.d dVar = this.S1;
            if (dVar != null) {
                dVar.updateColors();
            }
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27956j5, this.I0);
            org.telegram.ui.ActionBar.r0 r0Var = this.f32907e3;
            if (r0Var != null && w02 != this.f32931l4) {
                this.f32931l4 = w02;
                r0Var.setIconColor(w02);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void show() {
        boolean z9;
        super.show();
        this.C3 = false;
        org.telegram.ui.ActionBar.f2 f2Var = this.W1;
        if (f2Var instanceof org.telegram.ui.an) {
            this.f28631h0 = ((org.telegram.ui.an) f2Var).T9();
        }
        L1();
        this.f32934m3 = false;
        if (Build.VERSION.SDK_INT >= 30) {
            this.F0 = -1;
            int o4 = i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27792a7, this.I0), 0);
            this.G0 = o4;
            org.telegram.messenger.g0.u3(this, o4, false, null);
            if (org.telegram.messenger.g0.B(this.G0) > 0.721d) {
                z9 = true;
            } else {
                z9 = false;
            }
            org.telegram.messenger.g0.n3(this, z9);
        }
        if (this.f32914g4) {
            this.f32914g4 = false;
            r7 r7Var = this.R2;
            r7Var.updateColors();
            r7Var.invalidate();
            i1();
        }
    }

    public final void t1() {
        ViewGroup viewGroup = this.f28615b;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
        r7 r7Var = this.R2;
        int i7 = 1;
        if (r7Var.f27676n0) {
            r7Var.l(true);
        }
        this.f32898b2 = null;
        this.f32923j2 = null;
        this.f32901c2 = null;
        this.d2 = null;
        this.f32906e2 = null;
        this.f32909f2 = null;
        this.f32912g2 = null;
        this.f32936n2 = null;
        while (true) {
            vh[] vhVarArr = this.f32947q2;
            if (i7 >= vhVarArr.length) {
                break;
            }
            vh vhVar = vhVarArr[i7];
            if (vhVar != null) {
                vhVar.p();
                this.f28615b.removeView(vhVarArr[i7]);
                vhVarArr[i7] = null;
            }
            i7++;
        }
        I1(false, false);
        super.K();
        if (this.f32940o2) {
            this.f32940o2 = false;
            this.f32943p2 = 0.0f;
            org.telegram.ui.ActionBar.f2 f2Var = this.W1;
            if (f2Var != null && f2Var.getFragmentView() != null) {
                View fragmentView = f2Var.getFragmentView();
                WeakHashMap weakHashMap = r0.i0.f54098a;
                r0.y.c(fragmentView);
            }
        }
    }

    @Override
    public final void u0(boolean z9) {
        this.f28640q0 = true;
    }

    public final boolean u1(final boolean z9, final int i7, final int i10, final long j3, final boolean z10) {
        if (this.C3) {
            return false;
        }
        org.telegram.ui.ActionBar.f2 f2Var = this.W1;
        if (f2Var instanceof org.telegram.ui.an) {
            org.telegram.ui.an anVar = (org.telegram.ui.an) f2Var;
            TLRPC.Chat chat = anVar.f43772e;
            if (anVar.j() != null || ((org.telegram.messenger.t3.T(chat) && chat.megagroup) || !org.telegram.messenger.t3.T(chat))) {
                SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(this.D3).f24749d7.edit();
                edit.putBoolean("silent_" + anVar.a(), !z9).commit();
            }
        }
        int i11 = 1;
        if (O0(a1().getText())) {
            return true;
        }
        M0();
        if (this.n1.f55396f) {
            this.C3 = true;
            this.T3.o1(7, true, z9, i7, i10, j3, z10, false, 0L);
            return true;
        }
        long b12 = b1();
        vh vhVar = this.f32955s2;
        if (vhVar != null) {
            i11 = vhVar.getSelectedItemsCount();
        }
        return v4.Y(this.D3, b12, X0() + i11, new org.telegram.messenger.c20() {
            @Override
            public final void a(Object obj) {
                di diVar = di.this;
                diVar.C3 = true;
                diVar.T3.o1(7, true, z9, i7, i10, j3, z10, false, ((Long) obj).longValue());
            }
        }, 0L);
    }

    @Override
    public final void v() {
        if (this.W1 instanceof org.telegram.ui.an) {
            String[] strArr = MediaController.V1;
        } else {
            String[] strArr2 = MediaController.V1;
        }
        this.f32955s2.x();
        org.telegram.messenger.g0.i2(org.telegram.messenger.hd.M0(2131754921, "AccDescrAttachButton"));
        this.f32934m3 = true;
        if (!this.G3 && !this.F3) {
            N0();
        }
    }

    public final void v1(boolean z9, boolean z10) {
        final boolean z11;
        boolean z12;
        final boolean z13;
        int i7;
        float f10;
        float f11;
        float measuredHeight;
        this.f32918i1.a(z9, z10);
        kt a12 = a1();
        this.T1 = z9;
        kt a13 = a1();
        int i10 = 0;
        if (this.f32975x2.getTag() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        vh vhVar = this.f32955s2;
        if (vhVar != this.f32895a2 && vhVar != this.f32915h2) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (this.T1 && z12) {
            z13 = true;
        } else {
            z13 = false;
        }
        int i11 = 8;
        float f12 = 1.0f;
        bi.x5 x5Var = this.I2;
        kg.j jVar = this.f32971w2;
        float f13 = 0.0f;
        if (z10) {
            if (z11) {
                i11 = 0;
            }
            x5Var.setVisibility(i11);
            ViewPropertyAnimator animate = x5Var.animate();
            if (z13 && z11) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f11).setDuration(320L);
            xq xqVar = xq.h;
            duration.setInterpolator(xqVar).setUpdateListener(new og(this, 0)).withEndAction(new Runnable(this) {
                public final di f36879b;

                {
                    this.f36879b = this;
                }

                @Override
                public final void run() {
                    switch (r4) {
                        case 0:
                            di diVar = this.f36879b;
                            if (!z13 || !z11) {
                                diVar.I2.setVisibility(8);
                            }
                            diVar.Q1();
                            return;
                        default:
                            if (z13 || !z11) {
                                this.f36879b.f32971w2.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            jVar.setVisibility(0);
            ViewPropertyAnimator animate2 = jVar.animate();
            if (!z13 && z11) {
                measuredHeight = 0.0f;
            } else {
                measuredHeight = jVar.getMeasuredHeight();
            }
            ViewPropertyAnimator translationY = animate2.translationY(measuredHeight);
            if (z13 || !z11) {
                f12 = 0.0f;
            }
            translationY.alpha(f12).setDuration(320L).setInterpolator(xqVar).setUpdateListener(new og(this, 1)).withEndAction(new Runnable(this) {
                public final di f36879b;

                {
                    this.f36879b = this;
                }

                @Override
                public final void run() {
                    switch (r4) {
                        case 0:
                            di diVar = this.f36879b;
                            if (!z13 || !z11) {
                                diVar.I2.setVisibility(8);
                            }
                            diVar.Q1();
                            return;
                        default:
                            if (z13 || !z11) {
                                this.f36879b.f32971w2.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
        } else {
            if (z13 && z11) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            x5Var.setVisibility(i7);
            if (z13 && z11) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            x5Var.setAlpha(f10);
            Q1();
            if (z13 || !z11) {
                f12 = 0.0f;
            }
            jVar.setAlpha(f12);
            if (z13 || !z11) {
                f13 = jVar.getMeasuredHeight();
            }
            jVar.setTranslationY(f13);
            if (z13 || !z11) {
                i10 = 8;
            }
            jVar.setVisibility(i10);
        }
        if (a12 != a13) {
            a12.k(true);
            a13.setText(r5.cloneSpans(a12.getText()));
            a13.getEditText().setAllowTextEntitiesIntersection(a12.getEditText().getAllowTextEntitiesIntersection());
            if (a12.getEditText().isFocused()) {
                a13.getEditText().requestFocus();
                a13.getEditText().setSelection(a12.getEditText().getSelectionStart(), a12.getEditText().getSelectionEnd());
            }
        }
        org.telegram.messenger.g0.h3(new qg(this, 0));
    }

    public final void w1(int i7, org.telegram.messenger.ij ijVar) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        if (ijVar != null && (chatAttachAlertPhotoLayout = this.f32895a2) != null) {
            chatAttachAlertPhotoLayout.c0();
        }
        if (this.B3 == ijVar && this.A3 == i7) {
            return;
        }
        this.B3 = ijVar;
        if (ijVar != null && ijVar.A2()) {
            if (this.B3.J3()) {
                i7 = 2;
            } else if (this.B3.V2()) {
                i7 = 1;
            } else {
                i7 = 0;
            }
        }
        this.A3 = i7;
        if (this.B3 != null) {
            this.M3 = 1;
            this.N3 = false;
        } else {
            this.M3 = -1;
            this.N3 = true;
        }
        this.f32964u3.f();
        K1(0);
    }

    @Override
    public final boolean x() {
        return true;
    }

    public final void x1(float f10) {
        int i7;
        float translationY = this.f28615b.getTranslationY() - this.f32943p2;
        this.f32943p2 = this.f28615b.getHeight() * f10;
        this.f28615b.setTranslationY(translationY);
        ik ikVar = this.f32936n2;
        if (ikVar != null) {
            ikVar.setSendTransitionProgress(f10);
        }
        if (this.f28638o0) {
            i7 = Math.round((1.0f - f10) * this.f28639p0);
        } else {
            i7 = 0;
        }
        this.Y.setAlpha(i7);
        this.C0 = 1.0f - f10;
        this.f28618c.invalidate();
    }

    public final void y1(int i7, boolean z9) {
        if (this.B3 != null) {
            return;
        }
        this.M3 = i7;
        this.N3 = z9;
    }

    public final void z1(float f10) {
        boolean z9 = false;
        int o4 = i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27792a7, this.I0), Math.min(255, Math.max(0, (int) (f10 * 255.0f))));
        this.G0 = o4;
        org.telegram.messenger.g0.u3(this, o4, false, null);
        if (org.telegram.messenger.g0.B(this.G0) > 0.721d) {
            z9 = true;
        }
        org.telegram.messenger.g0.n3(this, z9);
        this.f28618c.invalidate();
    }

    @Override
    public final void F(float f10, int i7) {
    }

    public di(Activity activity, org.telegram.ui.ActionBar.f2 f2Var, boolean z9, boolean z10) {
        this(activity, f2Var, z9, z10, true, null);
    }
}
