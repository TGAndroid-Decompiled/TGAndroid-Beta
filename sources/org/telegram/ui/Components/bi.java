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
public class bi extends org.telegram.ui.ActionBar.t2 implements org.telegram.messenger.cs, org.telegram.ui.ActionBar.n2, qe.b {
    public static final int F4 = 0;
    public int A1;
    public final ImageView A2;
    public float A3;
    public final eh.g A4;
    public org.telegram.messenger.n10 B1;
    public final int[] B2;
    public int B3;
    public final si.c B4;
    public int C1;
    public final ah C2;
    public org.telegram.messenger.zi C3;
    public final eh.c C4;
    public int D1;
    public final ih D2;
    public boolean D3;
    public final eh.c D4;
    public boolean E1;
    public final TextPaint E2;
    public final int E3;
    public final rg E4;
    public boolean F1;
    public final RectF F2;
    public boolean F3;
    public boolean G1;
    public final Paint G2;
    public boolean G3;
    public boolean H1;
    public AnimatorSet H2;
    public boolean H3;
    public d30 I1;
    public long I2;
    public boolean I3;
    public boolean J1;
    public final ai.c0 J2;
    public boolean J3;
    public final zb0 K1;
    public final fh K2;
    public boolean K3;
    public bn L1;
    public int L2;
    public boolean L3;
    public f30 M1;
    public qs M2;
    public boolean M3;
    public boolean N1;
    public boolean N2;
    public int N3;
    public boolean O1;
    public boolean O2;
    public boolean O3;
    public lj P1;
    public boolean P2;
    public boolean P3;
    public ki Q1;
    public final float Q2;
    public float Q3;
    public long R1;
    public long R2;
    public float R3;
    public boolean S1;
    public final p7 S2;
    public ValueAnimator S3;
    public final eh.d T1;
    public AnimatorSet T2;
    public int T3;
    public boolean U1;
    public AnimatorSet U2;
    public zh U3;
    public float V1;
    public final org.telegram.ui.ActionBar.q0 V2;
    public nm V3;
    public final lh W1;
    public final gi.u W2;
    public final int[] W3;
    public final org.telegram.ui.ActionBar.d2 X1;
    public final org.telegram.ui.ActionBar.q0 X2;
    public int X3;
    public final boolean Y1;
    public gi.l3 Y2;
    public float Y3;
    public se Z1;
    public final org.telegram.ui.ActionBar.q0 Z2;
    public float Z3;
    public boolean f32212a2;
    public final fi.j f32213a3;
    public boolean f32214a4;
    public final ChatAttachAlertPhotoLayout f32215b2;
    public float f32216b3;
    public float f32217b4;
    public ej c2;
    public float f32218c3;
    public final boolean f32219c4;
    public ni f32220d2;
    public final ah f32221d3;
    public boolean f32222d4;
    public an f32223e2;
    public final TextView f32224e3;
    public final ArrayList f32225e4;
    public an f32226f2;
    public final org.telegram.ui.ActionBar.q0 f32227f3;
    public final Rect f32228f4;
    public uk f32229g2;
    public final LinearLayout f32230g3;
    public float f32231g4;
    public uj f32232h2;
    public final ImageView f32233h3;
    public boolean f32234h4;
    public am f32235i2;
    public final LinearLayout i3;
    public int f32236i4;
    public final qe.a f32237j1;
    public qi f32238j2;
    public final TextView f32239j3;
    public final lh f32240j4;
    public final qe.a k1;
    public lg.h0 f32241k2;
    public float f32242k3;
    public q1.g f32243k4;
    public final qe.a f32244l1;
    public vj f32245l2;
    public boolean f32246l3;
    public AnimatorSet f32247l4;
    public final qe.a m1;
    public vj f32248m2;
    public final oh f32249m3;
    public int f32250m4;
    public final qe.a f32251n1;
    public mi.p f32252n2;
    public boolean f32253n3;
    public int n4;
    public final qe.a f32254o1;
    public hk f32255o2;
    public Object f32256o3;
    public boolean f32257o4;
    public final qe.j f32258p1;
    public boolean f32259p2;
    public boolean f32260p3;
    public boolean f32261p4;
    public org.telegram.ui.um f32262q1;
    public float f32263q2;
    public final mh.f f32264q3;
    public boolean f32265q4;
    public final h6 f32266r1;
    public final th[] f32267r2;
    public final ch f32268r3;
    public tk f32269r4;
    public final h6 f32270s1;
    public final LongSparseArray f32271s2;
    public final ah f32272s3;
    public boolean f32273s4;
    public final ImageView f32274t1;
    public th f32275t2;
    public final bh f32276t3;
    public boolean f32277t4;
    public final org.telegram.ui.ActionBar.s2 f32278u1;
    public th f32279u2;
    public final u4.b0 f32280u3;
    public File f32281u4;
    public final ImageView f32282v1;
    public final gh.g f32283v2;
    public final yh f32284v3;
    public double[] f32285v4;
    public final org.telegram.ui.ActionBar.s2 f32286w1;
    public final gh.g f32287w2;
    public boolean f32288w3;
    public boolean f32289w4;
    public boolean f32290x1;
    public final lg.j f32291x2;
    public final RadialProgressView f32292x3;
    public boolean f32293x4;
    public boolean f32294y1;
    public final ah f32295y2;
    public boolean f32296y3;
    public boolean f32297y4;
    public boolean f32298z1;
    public final dh f32299z2;
    public final h6 f32300z3;
    public gi.i f32301z4;

    public bi(Context context, org.telegram.ui.ActionBar.d2 d2Var, boolean z10, boolean z11, boolean z12, final org.telegram.ui.ActionBar.e6 e6Var) {
        super(1, context, e6Var, false);
        float f10;
        TextPaint textPaint;
        qe.j jVar;
        boolean z13;
        org.telegram.ui.ActionBar.q0 q0Var;
        fi.j jVar2;
        xq xqVar = xq.h;
        this.f32237j1 = new qe.a(0, this, xqVar, 380L, false);
        this.k1 = new qe.a(1, this, xqVar, 380L, false);
        this.f32244l1 = new qe.a(2, this, xqVar, 380L, false);
        this.m1 = new qe.a(3, this, xqVar, 380L, false);
        this.f32251n1 = new qe.a(4, this, xqVar, 380L, true);
        this.f32254o1 = new qe.a(5, this, xqVar, 320L, false);
        qe.j jVar3 = new qe.j(new kg(this, 2), xqVar, 380L);
        this.f32258p1 = jVar3;
        this.E1 = false;
        this.F1 = false;
        this.G1 = false;
        this.H1 = false;
        this.V1 = 0.0f;
        this.W1 = new lh(this, 0);
        this.f32212a2 = false;
        th[] thVarArr = new th[12];
        this.f32267r2 = thVarArr;
        this.f32271s2 = new LongSparseArray();
        this.B2 = new int[2];
        TextPaint textPaint2 = new TextPaint(1);
        this.E2 = textPaint2;
        this.F2 = new RectF();
        this.G2 = new Paint(1);
        this.P2 = true;
        this.Q2 = 1.0f;
        this.f32288w3 = false;
        this.f32296y3 = false;
        int i3 = org.telegram.messenger.h10.f22829t0;
        this.E3 = i3;
        this.F3 = true;
        this.G3 = true;
        this.H3 = true;
        this.I3 = true;
        this.J3 = true;
        this.K3 = true;
        this.L3 = true;
        this.N3 = -1;
        this.O3 = true;
        this.T3 = org.telegram.messenger.g0.L(85.0f);
        new DecelerateInterpolator();
        this.W3 = new int[2];
        new Paint(1);
        this.f32222d4 = false;
        ArrayList arrayList = new ArrayList();
        this.f32225e4 = arrayList;
        Rect rect = new Rect();
        this.f32228f4 = rect;
        this.f32240j4 = new lh(this, 1);
        this.f32261p4 = true;
        this.f32265q4 = false;
        this.f32293x4 = false;
        this.f32297y4 = false;
        this.f28624y = true;
        si.c cVar = new si.c();
        this.B4 = cVar;
        cVar.a(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27878d6, this.J0));
        this.Y0.E.add(new pi.o(cVar, new kg(this, 4)));
        if (Build.VERSION.SDK_INT >= 31 && org.telegram.messenger.az.f()) {
            eh.g gVar = new eh.g(false);
            this.A4 = gVar;
            this.Y0.a(gVar);
            si.f fVar = new si.f(cVar);
            fVar.f54756f = cVar;
            fVar.d = gVar;
            fVar.f54755e = -2;
            si.f fVar2 = new si.f(null);
            fVar2.f54756f = cVar;
            fVar2.d = gVar;
            fVar2.f54755e = -3;
            eh.c cVar2 = new eh.c(fVar, fVar, fVar);
            this.C4 = cVar2;
            cVar2.f9988k = true;
            int L = org.telegram.messenger.lc.e(262144) ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(48.0f);
            cVar2.d = L;
            cVar2.f9983e = L;
            eh.c cVar3 = new eh.c(fVar2, fVar2, fVar2);
            this.D4 = cVar3;
            cVar3.f9988k = true;
            int L2 = org.telegram.messenger.g0.L(48.0f);
            cVar3.d = L2;
            cVar3.f9983e = L2;
        } else {
            this.A4 = null;
            this.C4 = new eh.c(cVar, cVar, cVar);
            this.D4 = new eh.c(cVar, cVar, cVar);
        }
        eh.c cVar4 = new eh.c(cVar, cVar, cVar);
        this.E4 = new rg(this, 0);
        this.f32219c4 = z10;
        this.Y1 = (d2Var instanceof org.telegram.ui.wm) && d2Var.isInBubbleMode();
        this.f28607l0 = new OvershootInterpolator(0.7f);
        this.X1 = d2Var;
        this.G = true;
        this.f28626z0 = this;
        org.telegram.messenger.hs.f(i3).c(this, org.telegram.messenger.hs.T0);
        org.telegram.messenger.hs.f(i3).c(this, org.telegram.messenger.hs.W4);
        org.telegram.messenger.hs.f(i3).c(this, org.telegram.messenger.hs.f23230f5);
        org.telegram.messenger.hs.f(i3).c(this, org.telegram.messenger.hs.F1);
        arrayList.add(rect);
        oh ohVar = new oh(this, context);
        this.f32249m3 = ohVar;
        ohVar.setDelegate(new ph(this));
        this.f28586b = ohVar;
        ohVar.setWillNotDraw(false);
        this.f28586b.setClipChildren(false);
        this.f28586b.setClipToPadding(false);
        ViewGroup viewGroup = this.f28586b;
        int i10 = this.f28618u0;
        viewGroup.setPadding(i10, 0, i10, 0);
        p7 p7Var = new p7(this, context, e6Var, 1);
        this.S2 = p7Var;
        p7Var.f27707d1 = true;
        p7Var.setForcedMenuWidth(org.telegram.messenger.g0.L(46.0f));
        p7Var.setBackButtonDrawable(new org.telegram.ui.ActionBar.w1(false));
        int i11 = org.telegram.ui.ActionBar.k6.f27988j5;
        org.telegram.ui.ActionBar.r6.m(p7Var, 1, i11, e6Var);
        int i12 = org.telegram.ui.ActionBar.k6.I5;
        org.telegram.ui.ActionBar.r6.m(p7Var, 3, i12, e6Var);
        org.telegram.ui.ActionBar.r6.m(p7Var, 5, i11, e6Var);
        p7Var.setOccupyStatusBar(true);
        p7Var.setAlpha(0.0f);
        p7Var.setActionBarMenuOnItemClick(new org.telegram.ui.o9(this, 13));
        org.telegram.ui.ActionBar.q0 q0Var2 = new org.telegram.ui.ActionBar.q0(context, null, 0, org.telegram.ui.ActionBar.k6.w0(i11, this.J0), false, e6Var);
        this.V2 = q0Var2;
        q0Var2.setLongClickEnabled(false);
        q0Var2.setIcon(2131231244);
        q0Var2.setContentDescription(org.telegram.messenger.bd.M0(2131754839, null));
        q0Var2.setVisibility(4);
        q0Var2.setAlpha(0.0f);
        q0Var2.setScaleX(0.6f);
        q0Var2.setScaleY(0.6f);
        q0Var2.setSubMenuOpenSide(2);
        q0Var2.setDelegate(new kg(this, 10));
        q0Var2.setAdditionalYOffset(org.telegram.messenger.g0.L(72.0f));
        q0Var2.setTranslationX(org.telegram.messenger.g0.L(1.0f));
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i12, this.J0), 6, -1);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i12);
        q0Var2.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(q0Var2, h02, null, N, e6Var);
        q0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final bi f36823b;

            {
                this.f36823b = this;
            }

            @Override
            public final void onClick(View view) {
                ii.d4 d4Var;
                int i13;
                boolean z14 = false;
                switch (r2) {
                    case 0:
                        bi biVar = this.f36823b;
                        if (biVar.f32275t2 != biVar.f32235i2) {
                            z14 = true;
                        }
                        biVar.O1(z14);
                        return;
                    case 1:
                        bi biVar2 = this.f36823b;
                        long j10 = biVar2.R2;
                        if (j10 < 0 && (d4Var = (ii.d4) biVar2.f32271s2.get(-j10)) != null) {
                            org.telegram.ui.web.w0 webViewContainer = d4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        bi biVar3 = this.f36823b;
                        boolean z15 = biVar3.U1;
                        if (!z15) {
                            biVar3.v1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        bi biVar4 = this.f36823b;
                        boolean z16 = biVar4.U1;
                        if (z16) {
                            biVar4.v1(!z16, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f36823b.n1();
                        return;
                    case 5:
                        this.f36823b.V2.U(null, null);
                        return;
                    case 6:
                        bi biVar5 = this.f36823b;
                        if (biVar5.f32215b2 != null) {
                            boolean U = ChatAttachAlertPhotoLayout.U();
                            boolean z17 = !U;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = biVar5.f32215b2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.f31260t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ye) {
                                        org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) entry.getValue();
                                        if (yeVar.d()) {
                                            yeVar.O = Boolean.valueOf(U);
                                            for (int i14 = 0; i14 < chatAttachAlertPhotoLayout.F.getChildCount(); i14++) {
                                                View childAt = chatAttachAlertPhotoLayout.F.getChildAt(i14);
                                                if (childAt instanceof org.telegram.ui.Cells.q5) {
                                                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                                    if (q5Var.getPhotoEntry() == yeVar) {
                                                        q5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.f25457b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.az.f21636i1 = z17;
                                edit.putBoolean("photoLiveDefault", z17).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            biVar5.N1(true);
                            org.telegram.ui.ActionBar.q0 q0Var3 = biVar5.X2;
                            gi.l3 l3Var = biVar5.Y2;
                            if (l3Var != null) {
                                l3Var.f(true);
                            }
                            gi.l3 l3Var2 = new gi.l3(biVar5.getContext(), 1);
                            biVar5.Y2 = l3Var2;
                            if (!U) {
                                i13 = 2131748840;
                            } else {
                                i13 = 2131748841;
                            }
                            l3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(i13, null)));
                            biVar5.Y2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            biVar5.Y2.p(1.0f, -((biVar5.f28586b.getWidth() - ((q0Var3.getWidth() / 2.0f) + q0Var3.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            biVar5.Y2.setTranslationY(biVar5.V2.getTranslationY());
                            gi.l3 l3Var3 = biVar5.Y2;
                            l3Var3.f13100r0 = new org.telegram.ui.lo(16, biVar5, l3Var2);
                            biVar5.f28586b.addView(l3Var3, b8.mf.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            biVar5.Y2.w();
                            return;
                        }
                        return;
                    case 7:
                        th thVar = this.f36823b.f32275t2;
                        if (thVar != null) {
                            thVar.w(40);
                            return;
                        }
                        return;
                    default:
                        this.f36823b.f32227f3.U(null, null);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.q0 q0Var3 = new org.telegram.ui.ActionBar.q0(context, null, 0, org.telegram.ui.ActionBar.k6.w0(i11, this.J0), false, e6Var);
        this.X2 = q0Var3;
        q0Var3.setLongClickEnabled(false);
        gi.u uVar = new gi.u();
        this.W2 = uVar;
        q0Var3.setIcon(uVar);
        q0Var3.setContentDescription(org.telegram.messenger.bd.M0(2131754839, null));
        q0Var3.setVisibility(8);
        q0Var3.setAlpha(0.0f);
        q0Var3.setScaleX(0.6f);
        q0Var3.setScaleY(0.6f);
        q0Var3.setAdditionalYOffset(org.telegram.messenger.g0.L(72.0f));
        q0Var3.setTranslationX(-org.telegram.messenger.g0.L(3.0f));
        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i12, this.J0), 6, -1);
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i12);
        q0Var3.setBackground(h03);
        org.telegram.ui.ActionBar.r6.k(q0Var3, h03, null, N2, e6Var);
        q0Var3.setOnClickListener(new View.OnClickListener(this) {
            public final bi f36823b;

            {
                this.f36823b = this;
            }

            @Override
            public final void onClick(View view) {
                ii.d4 d4Var;
                int i13;
                boolean z14 = false;
                switch (r2) {
                    case 0:
                        bi biVar = this.f36823b;
                        if (biVar.f32275t2 != biVar.f32235i2) {
                            z14 = true;
                        }
                        biVar.O1(z14);
                        return;
                    case 1:
                        bi biVar2 = this.f36823b;
                        long j10 = biVar2.R2;
                        if (j10 < 0 && (d4Var = (ii.d4) biVar2.f32271s2.get(-j10)) != null) {
                            org.telegram.ui.web.w0 webViewContainer = d4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        bi biVar3 = this.f36823b;
                        boolean z15 = biVar3.U1;
                        if (!z15) {
                            biVar3.v1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        bi biVar4 = this.f36823b;
                        boolean z16 = biVar4.U1;
                        if (z16) {
                            biVar4.v1(!z16, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f36823b.n1();
                        return;
                    case 5:
                        this.f36823b.V2.U(null, null);
                        return;
                    case 6:
                        bi biVar5 = this.f36823b;
                        if (biVar5.f32215b2 != null) {
                            boolean U = ChatAttachAlertPhotoLayout.U();
                            boolean z17 = !U;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = biVar5.f32215b2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.f31260t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ye) {
                                        org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) entry.getValue();
                                        if (yeVar.d()) {
                                            yeVar.O = Boolean.valueOf(U);
                                            for (int i14 = 0; i14 < chatAttachAlertPhotoLayout.F.getChildCount(); i14++) {
                                                View childAt = chatAttachAlertPhotoLayout.F.getChildAt(i14);
                                                if (childAt instanceof org.telegram.ui.Cells.q5) {
                                                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                                    if (q5Var.getPhotoEntry() == yeVar) {
                                                        q5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.f25457b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.az.f21636i1 = z17;
                                edit.putBoolean("photoLiveDefault", z17).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            biVar5.N1(true);
                            org.telegram.ui.ActionBar.q0 q0Var32 = biVar5.X2;
                            gi.l3 l3Var = biVar5.Y2;
                            if (l3Var != null) {
                                l3Var.f(true);
                            }
                            gi.l3 l3Var2 = new gi.l3(biVar5.getContext(), 1);
                            biVar5.Y2 = l3Var2;
                            if (!U) {
                                i13 = 2131748840;
                            } else {
                                i13 = 2131748841;
                            }
                            l3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(i13, null)));
                            biVar5.Y2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            biVar5.Y2.p(1.0f, -((biVar5.f28586b.getWidth() - ((q0Var32.getWidth() / 2.0f) + q0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            biVar5.Y2.setTranslationY(biVar5.V2.getTranslationY());
                            gi.l3 l3Var3 = biVar5.Y2;
                            l3Var3.f13100r0 = new org.telegram.ui.lo(16, biVar5, l3Var2);
                            biVar5.f28586b.addView(l3Var3, b8.mf.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            biVar5.Y2.w();
                            return;
                        }
                        return;
                    case 7:
                        th thVar = this.f36823b.f32275t2;
                        if (thVar != null) {
                            thVar.w(40);
                            return;
                        }
                        return;
                    default:
                        this.f36823b.f32227f3.U(null, null);
                        return;
                }
            }
        });
        fi.j jVar4 = new fi.j(this, context);
        org.telegram.ui.ActionBar.r6.V(jVar4, org.telegram.ui.ActionBar.k6.Gi, e6Var);
        jVar4.setText(org.telegram.messenger.bd.M0(2131751753, null));
        jVar4.setTypeface(org.telegram.messenger.g0.o());
        jVar4.setTextSize(1, 14.0f);
        jVar4.setVisibility(4);
        jVar4.setAlpha(0.0f);
        jVar4.setGravity(17);
        jVar4.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        jVar4.setTranslationX(-org.telegram.messenger.g0.L(12.0f));
        jVar4.setOnClickListener(new View.OnClickListener(this) {
            public final bi f36823b;

            {
                this.f36823b = this;
            }

            @Override
            public final void onClick(View view) {
                ii.d4 d4Var;
                int i13;
                boolean z14 = false;
                switch (r2) {
                    case 0:
                        bi biVar = this.f36823b;
                        if (biVar.f32275t2 != biVar.f32235i2) {
                            z14 = true;
                        }
                        biVar.O1(z14);
                        return;
                    case 1:
                        bi biVar2 = this.f36823b;
                        long j10 = biVar2.R2;
                        if (j10 < 0 && (d4Var = (ii.d4) biVar2.f32271s2.get(-j10)) != null) {
                            org.telegram.ui.web.w0 webViewContainer = d4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        bi biVar3 = this.f36823b;
                        boolean z15 = biVar3.U1;
                        if (!z15) {
                            biVar3.v1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        bi biVar4 = this.f36823b;
                        boolean z16 = biVar4.U1;
                        if (z16) {
                            biVar4.v1(!z16, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f36823b.n1();
                        return;
                    case 5:
                        this.f36823b.V2.U(null, null);
                        return;
                    case 6:
                        bi biVar5 = this.f36823b;
                        if (biVar5.f32215b2 != null) {
                            boolean U = ChatAttachAlertPhotoLayout.U();
                            boolean z17 = !U;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = biVar5.f32215b2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.f31260t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ye) {
                                        org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) entry.getValue();
                                        if (yeVar.d()) {
                                            yeVar.O = Boolean.valueOf(U);
                                            for (int i14 = 0; i14 < chatAttachAlertPhotoLayout.F.getChildCount(); i14++) {
                                                View childAt = chatAttachAlertPhotoLayout.F.getChildAt(i14);
                                                if (childAt instanceof org.telegram.ui.Cells.q5) {
                                                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                                    if (q5Var.getPhotoEntry() == yeVar) {
                                                        q5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.f25457b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.az.f21636i1 = z17;
                                edit.putBoolean("photoLiveDefault", z17).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            biVar5.N1(true);
                            org.telegram.ui.ActionBar.q0 q0Var32 = biVar5.X2;
                            gi.l3 l3Var = biVar5.Y2;
                            if (l3Var != null) {
                                l3Var.f(true);
                            }
                            gi.l3 l3Var2 = new gi.l3(biVar5.getContext(), 1);
                            biVar5.Y2 = l3Var2;
                            if (!U) {
                                i13 = 2131748840;
                            } else {
                                i13 = 2131748841;
                            }
                            l3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(i13, null)));
                            biVar5.Y2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            biVar5.Y2.p(1.0f, -((biVar5.f28586b.getWidth() - ((q0Var32.getWidth() / 2.0f) + q0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            biVar5.Y2.setTranslationY(biVar5.V2.getTranslationY());
                            gi.l3 l3Var3 = biVar5.Y2;
                            l3Var3.f13100r0 = new org.telegram.ui.lo(16, biVar5, l3Var2);
                            biVar5.f28586b.addView(l3Var3, b8.mf.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            biVar5.Y2.w();
                            return;
                        }
                        return;
                    case 7:
                        th thVar = this.f36823b.f32275t2;
                        if (thVar != null) {
                            thVar.w(40);
                            return;
                        }
                        return;
                    default:
                        this.f36823b.f32227f3.U(null, null);
                        return;
                }
            }
        });
        b8.pf.a(jVar4);
        this.f32213a3 = jVar4;
        L1();
        if (d2Var != null) {
            f10 = 14.0f;
            textPaint = textPaint2;
            jVar = jVar3;
            q0Var = q0Var3;
            jVar2 = jVar4;
            org.telegram.ui.ActionBar.q0 q0Var4 = new org.telegram.ui.ActionBar.q0(context, null, 0, org.telegram.ui.ActionBar.k6.w0(i11, this.J0), false, e6Var);
            this.Z2 = q0Var4;
            q0Var4.setLongClickEnabled(false);
            q0Var4.setIcon(2131232486);
            q0Var4.setContentDescription(org.telegram.messenger.bd.M0(2131745846, null));
            q0Var4.setVisibility(4);
            z13 = false;
            q0Var4.setAlpha(0.0f);
            q0Var4.setTranslationX(-org.telegram.messenger.g0.L(42.0f));
            org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i12, this.J0), 6, -1);
            org.telegram.ui.ActionBar.n6 N3 = org.telegram.ui.ActionBar.r6.N(i12);
            q0Var4.setBackground(h04);
            org.telegram.ui.ActionBar.r6.k(q0Var4, h04, null, N3, e6Var);
            q0Var4.setOnClickListener(new ei.e2(5, this, z11));
        } else {
            f10 = 14.0f;
            textPaint = textPaint2;
            jVar = jVar3;
            z13 = false;
            q0Var = q0Var3;
            jVar2 = jVar4;
        }
        org.telegram.ui.ActionBar.q0 q0Var5 = new org.telegram.ui.ActionBar.q0(context, null, 0, org.telegram.ui.ActionBar.k6.w0(i11, this.J0), false, e6Var);
        this.f32227f3 = q0Var5;
        q0Var5.setLongClickEnabled(false);
        q0Var5.setIcon(2131231244);
        q0Var5.setContentDescription(org.telegram.messenger.bd.M0(2131754839, null));
        q0Var5.setVisibility(8);
        org.telegram.ui.Cells.y h05 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i12, this.J0), 3, -1);
        org.telegram.ui.ActionBar.n6 N4 = org.telegram.ui.ActionBar.r6.N(i12);
        q0Var5.setBackground(h05);
        org.telegram.ui.ActionBar.r6.k(q0Var5, h05, null, N4, e6Var);
        q0Var5.e(1, 2131232044, org.telegram.messenger.bd.M0(2131744887, null)).setOnClickListener(new View.OnClickListener(this) {
            public final bi f37148b;

            {
                this.f37148b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z14;
                boolean z15;
                org.telegram.ui.wm wmVar;
                switch (r3) {
                    case 0:
                        final bi biVar = this.f37148b;
                        dh dhVar = biVar.f32299z2;
                        if (dhVar != null) {
                            org.telegram.messenger.hp.e1().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var = new e0(biVar.getContext(), e6Var);
                            e0Var.r1(dhVar.getText());
                            e0Var.c2 = new org.telegram.messenger.u10() {
                                @Override
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            dh dhVar2 = biVar.f32299z2;
                                            dhVar2.setText(charSequence);
                                            dhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            fh fhVar = biVar.K2;
                                            fhVar.setText(charSequence);
                                            fhVar.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j10 = biVar.R1;
                            if (biVar.C3 != null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            tg tgVar = new tg(biVar, 0);
                            e0Var.f33237e2 = j10;
                            e0Var.f33238f2 = z14;
                            e0Var.f33239g2 = tgVar;
                            e0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final bi biVar2 = this.f37148b;
                        fh fhVar = biVar2.K2;
                        if (fhVar != null) {
                            org.telegram.messenger.hp.e1().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var2 = new e0(biVar2.getContext(), e6Var);
                            e0Var2.r1(fhVar.getText());
                            e0Var2.c2 = new org.telegram.messenger.u10() {
                                @Override
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            dh dhVar2 = biVar2.f32299z2;
                                            dhVar2.setText(charSequence);
                                            dhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            fh fhVar2 = biVar2.K2;
                                            fhVar2.setText(charSequence);
                                            fhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j11 = biVar2.R1;
                            if (biVar2.C3 != null) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            tg tgVar2 = new tg(biVar2, 1);
                            e0Var2.f33237e2 = j11;
                            e0Var2.f33238f2 = z15;
                            e0Var2.f33239g2 = tgVar2;
                            e0Var2.show();
                            return;
                        }
                        return;
                    default:
                        bi biVar3 = this.f37148b;
                        biVar3.f32227f3.U(null, null);
                        PhotoViewer v12 = PhotoViewer.v1();
                        org.telegram.ui.ActionBar.d2 d2Var2 = biVar3.X1;
                        v12.N2(null, d2Var2, e6Var);
                        PhotoViewer.v1().O2(biVar3);
                        PhotoViewer v13 = PhotoViewer.v1();
                        int i13 = biVar3.N3;
                        boolean z16 = biVar3.O3;
                        v13.h = i13;
                        v13.f41486n = z16;
                        if (!biVar3.U3.g0()) {
                            org.telegram.messenger.g0.v1(d2Var2.getFragmentView().findFocus());
                            org.telegram.messenger.g0.v1(biVar3.f28589c.findFocus());
                        }
                        File w10 = gi.f7.w(biVar3.E3, "webp");
                        Point point = org.telegram.messenger.g0.f22608q;
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
                        org.telegram.messenger.ye yeVar = new org.telegram.messenger.ye(0, w10.getAbsolutePath(), 0, false, 0, 0);
                        arrayList2.add(yeVar);
                        PhotoViewer v14 = PhotoViewer.v1();
                        sh shVar = new sh(biVar3, yeVar);
                        if (d2Var2 instanceof org.telegram.ui.wm) {
                            wmVar = (org.telegram.ui.wm) d2Var2;
                        } else {
                            wmVar = null;
                        }
                        v14.j2(arrayList2, 0, 11, false, shVar, wmVar);
                        if (biVar3.f32294y1) {
                            PhotoViewer.v1().Z0(null, null, true, biVar3.B1);
                            return;
                        }
                        return;
                }
            }
        });
        q0Var5.setMenuYOffset(org.telegram.messenger.g0.L(-12.0f));
        q0Var5.setAdditionalXOffset(org.telegram.messenger.g0.L(12.0f));
        q0Var5.setOnClickListener(new View.OnClickListener(this) {
            public final bi f36823b;

            {
                this.f36823b = this;
            }

            @Override
            public final void onClick(View view) {
                ii.d4 d4Var;
                int i13;
                boolean z14 = false;
                switch (r2) {
                    case 0:
                        bi biVar = this.f36823b;
                        if (biVar.f32275t2 != biVar.f32235i2) {
                            z14 = true;
                        }
                        biVar.O1(z14);
                        return;
                    case 1:
                        bi biVar2 = this.f36823b;
                        long j10 = biVar2.R2;
                        if (j10 < 0 && (d4Var = (ii.d4) biVar2.f32271s2.get(-j10)) != null) {
                            org.telegram.ui.web.w0 webViewContainer = d4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        bi biVar3 = this.f36823b;
                        boolean z15 = biVar3.U1;
                        if (!z15) {
                            biVar3.v1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        bi biVar4 = this.f36823b;
                        boolean z16 = biVar4.U1;
                        if (z16) {
                            biVar4.v1(!z16, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f36823b.n1();
                        return;
                    case 5:
                        this.f36823b.V2.U(null, null);
                        return;
                    case 6:
                        bi biVar5 = this.f36823b;
                        if (biVar5.f32215b2 != null) {
                            boolean U = ChatAttachAlertPhotoLayout.U();
                            boolean z17 = !U;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = biVar5.f32215b2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.f31260t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ye) {
                                        org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) entry.getValue();
                                        if (yeVar.d()) {
                                            yeVar.O = Boolean.valueOf(U);
                                            for (int i14 = 0; i14 < chatAttachAlertPhotoLayout.F.getChildCount(); i14++) {
                                                View childAt = chatAttachAlertPhotoLayout.F.getChildAt(i14);
                                                if (childAt instanceof org.telegram.ui.Cells.q5) {
                                                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                                    if (q5Var.getPhotoEntry() == yeVar) {
                                                        q5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.f25457b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.az.f21636i1 = z17;
                                edit.putBoolean("photoLiveDefault", z17).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            biVar5.N1(true);
                            org.telegram.ui.ActionBar.q0 q0Var32 = biVar5.X2;
                            gi.l3 l3Var = biVar5.Y2;
                            if (l3Var != null) {
                                l3Var.f(true);
                            }
                            gi.l3 l3Var2 = new gi.l3(biVar5.getContext(), 1);
                            biVar5.Y2 = l3Var2;
                            if (!U) {
                                i13 = 2131748840;
                            } else {
                                i13 = 2131748841;
                            }
                            l3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(i13, null)));
                            biVar5.Y2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            biVar5.Y2.p(1.0f, -((biVar5.f28586b.getWidth() - ((q0Var32.getWidth() / 2.0f) + q0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            biVar5.Y2.setTranslationY(biVar5.V2.getTranslationY());
                            gi.l3 l3Var3 = biVar5.Y2;
                            l3Var3.f13100r0 = new org.telegram.ui.lo(16, biVar5, l3Var2);
                            biVar5.f28586b.addView(l3Var3, b8.mf.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            biVar5.Y2.w();
                            return;
                        }
                        return;
                    case 7:
                        th thVar = this.f36823b.f32275t2;
                        if (thVar != null) {
                            thVar.w(40);
                            return;
                        }
                        return;
                    default:
                        this.f36823b.f32227f3.U(null, null);
                        return;
                }
            }
        });
        ah ahVar = new ah(this, context, 0);
        this.f32221d3 = ahVar;
        ahVar.setOnClickListener(new View.OnClickListener(this) {
            public final bi f36823b;

            {
                this.f36823b = this;
            }

            @Override
            public final void onClick(View view) {
                ii.d4 d4Var;
                int i13;
                boolean z14 = false;
                switch (r2) {
                    case 0:
                        bi biVar = this.f36823b;
                        if (biVar.f32275t2 != biVar.f32235i2) {
                            z14 = true;
                        }
                        biVar.O1(z14);
                        return;
                    case 1:
                        bi biVar2 = this.f36823b;
                        long j10 = biVar2.R2;
                        if (j10 < 0 && (d4Var = (ii.d4) biVar2.f32271s2.get(-j10)) != null) {
                            org.telegram.ui.web.w0 webViewContainer = d4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        bi biVar3 = this.f36823b;
                        boolean z15 = biVar3.U1;
                        if (!z15) {
                            biVar3.v1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        bi biVar4 = this.f36823b;
                        boolean z16 = biVar4.U1;
                        if (z16) {
                            biVar4.v1(!z16, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f36823b.n1();
                        return;
                    case 5:
                        this.f36823b.V2.U(null, null);
                        return;
                    case 6:
                        bi biVar5 = this.f36823b;
                        if (biVar5.f32215b2 != null) {
                            boolean U = ChatAttachAlertPhotoLayout.U();
                            boolean z17 = !U;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = biVar5.f32215b2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.f31260t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ye) {
                                        org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) entry.getValue();
                                        if (yeVar.d()) {
                                            yeVar.O = Boolean.valueOf(U);
                                            for (int i14 = 0; i14 < chatAttachAlertPhotoLayout.F.getChildCount(); i14++) {
                                                View childAt = chatAttachAlertPhotoLayout.F.getChildAt(i14);
                                                if (childAt instanceof org.telegram.ui.Cells.q5) {
                                                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                                    if (q5Var.getPhotoEntry() == yeVar) {
                                                        q5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.f25457b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.az.f21636i1 = z17;
                                edit.putBoolean("photoLiveDefault", z17).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            biVar5.N1(true);
                            org.telegram.ui.ActionBar.q0 q0Var32 = biVar5.X2;
                            gi.l3 l3Var = biVar5.Y2;
                            if (l3Var != null) {
                                l3Var.f(true);
                            }
                            gi.l3 l3Var2 = new gi.l3(biVar5.getContext(), 1);
                            biVar5.Y2 = l3Var2;
                            if (!U) {
                                i13 = 2131748840;
                            } else {
                                i13 = 2131748841;
                            }
                            l3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(i13, null)));
                            biVar5.Y2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            biVar5.Y2.p(1.0f, -((biVar5.f28586b.getWidth() - ((q0Var32.getWidth() / 2.0f) + q0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            biVar5.Y2.setTranslationY(biVar5.V2.getTranslationY());
                            gi.l3 l3Var3 = biVar5.Y2;
                            l3Var3.f13100r0 = new org.telegram.ui.lo(16, biVar5, l3Var2);
                            biVar5.f28586b.addView(l3Var3, b8.mf.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            biVar5.Y2.w();
                            return;
                        }
                        return;
                    case 7:
                        th thVar = this.f36823b.f32275t2;
                        if (thVar != null) {
                            thVar.w(40);
                            return;
                        }
                        return;
                    default:
                        this.f36823b.f32227f3.U(null, null);
                        return;
                }
            }
        });
        ahVar.setAlpha(0.0f);
        ahVar.setVisibility(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f32230g3 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.f32224e3 = textView;
        org.telegram.messenger.k5.n(textView, i11, e6Var, 1, 16.0f);
        textView.setGravity(19);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, b8.mf.r(-2, -2, 16));
        ImageView imageView = new ImageView(context);
        this.f32233h3 = imageView;
        Drawable mutate = getContext().getResources().getDrawable(2131230875).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.r6.y(imageView, mutate, i11, e6Var, mode);
        imageView.setImageDrawable(mutate);
        imageView.setVisibility(8);
        linearLayout.addView(imageView, b8.mf.t(-2, -2, 16, 4, 1, 0, 0));
        linearLayout.setAlpha(1.0f);
        ahVar.addView(linearLayout, b8.mf.c(-1.0f, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.i3 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        ImageView imageView2 = new ImageView(context);
        Drawable mutate2 = getContext().getResources().getDrawable(2131230874).mutate();
        org.telegram.ui.ActionBar.r6.y(imageView2, mutate2, i11, e6Var, mode);
        imageView2.setImageDrawable(mutate2);
        linearLayout2.addView(imageView2, b8.mf.t(-2, -2, 16, 0, 1, 4, 0));
        TextView textView2 = new TextView(context);
        this.f32239j3 = textView2;
        org.telegram.messenger.k5.n(textView2, i11, e6Var, 1, 16.0f);
        org.telegram.messenger.k5.m(textView2, 19, "AttachMediaPreview", 2131753958);
        linearLayout2.setAlpha(0.0f);
        linearLayout2.addView(textView2, b8.mf.r(-2, -2, 16));
        ahVar.addView(linearLayout2, b8.mf.c(-1.0f, -2));
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = new ChatAttachAlertPhotoLayout(this, context, z10, z12, e6Var);
        this.f32215b2 = chatAttachAlertPhotoLayout;
        thVarArr[0] = chatAttachAlertPhotoLayout;
        chatAttachAlertPhotoLayout.setTranslationX(0.0f);
        this.f32275t2 = chatAttachAlertPhotoLayout;
        this.R2 = 1L;
        this.f28586b.addView(chatAttachAlertPhotoLayout, b8.mf.c(-1.0f, -1));
        mh.f fVar3 = new mh.f(context);
        this.f32264q3 = fVar3;
        fVar3.setup(cVar4);
        fVar3.setFadeTopAlpha(0);
        fVar3.setFadeHeightTop(org.telegram.messenger.g0.L(48.0f));
        fVar3.setFadeHeightBottom(org.telegram.messenger.g0.L(48.0f));
        fVar3.setFadeZoneTop(org.telegram.messenger.g0.L(5.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22602m);
        this.f28586b.addView(fVar3, b8.mf.g());
        this.f28586b.addView(ahVar, b8.mf.d(-1, -2.0f, 51, 23.0f, 0.0f, 21.0f, 0.0f));
        ai.c0 c0Var = new ai.c0(context, 13);
        this.J2 = c0Var;
        this.f28586b.addView(c0Var, b8.mf.e(-1, -2, 55));
        this.f28586b.addView(p7Var, b8.mf.c(-2.0f, -1));
        this.f28586b.addView(q0Var2, b8.mf.e(48, 48, 53));
        this.f28586b.addView(q0Var, b8.mf.d(48, 48.0f, 53, 0.0f, 0.0f, 48.0f, 0.0f));
        org.telegram.ui.ActionBar.q0 q0Var6 = this.Z2;
        if (q0Var6 != null) {
            this.f28586b.addView(q0Var6, b8.mf.e(48, 48, 53));
        }
        ahVar.addView(q0Var5, b8.mf.d(32, 32.0f, 21, 0.0f, 0.0f, 0.0f, 8.0f));
        this.f28586b.addView(jVar2, b8.mf.e(-2, 48, 53));
        ah ahVar2 = new ah(this, context, 1);
        this.f32272s3 = ahVar2;
        bh bhVar = new bh(context, 0);
        this.f32276t3 = bhVar;
        bhVar.setClipChildren(true);
        bhVar.setClipToPadding(false);
        yh yhVar = new yh(this, context);
        this.f32284v3 = yhVar;
        bhVar.setAdapter(yhVar);
        u4.b0 b0Var = new u4.b0(0, false);
        this.f32280u3 = b0Var;
        bhVar.setLayoutManager(b0Var);
        bhVar.setVerticalScrollBarEnabled(false);
        bhVar.setHorizontalScrollBarEnabled(false);
        bhVar.setItemAnimator(null);
        bhVar.setLayoutAnimation(null);
        org.telegram.ui.ActionBar.r6.m(bhVar, 21, org.telegram.ui.ActionBar.k6.A5, e6Var);
        bhVar.f38482z2 = true;
        bhVar.setOverScrollMode(2);
        eh.c cVar5 = this.C4;
        pi.q qVar = this.Y0;
        cVar5.f9987j = qVar;
        this.D4.f9987j = qVar;
        cVar4.f9987j = qVar;
        ch chVar = new ch(this, context, 0);
        this.f32268r3 = chVar;
        eh.d dVar = new eh.d(cVar4.c(chVar, null, false));
        this.T1 = dVar;
        if (org.telegram.messenger.az.f()) {
            org.telegram.messenger.lc.e(262144);
        }
        dVar.b(org.telegram.messenger.g0.L(72.0f), true);
        this.f28586b.addView(chVar, b8.mf.g());
        gh.g c2 = this.C4.c(ahVar2, b8.cd.f(e6Var), false);
        c2.r(org.telegram.messenger.g0.L(28.0f));
        c2.q(org.telegram.messenger.g0.L(7.0f));
        ahVar2.setBackground(c2);
        bhVar.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f));
        bhVar.setClipToOutline(true);
        cg.p0 p0Var = cg.t0.f4745a;
        bhVar.setOutlineProvider(new cg.r0(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(28.0f)));
        bhVar.setImportantForAccessibility(1);
        ahVar2.addView(bhVar, b8.mf.g());
        this.f28586b.addView(ahVar2, b8.mf.e(-1, 70, 81));
        bhVar.setOnItemClickListener(new ei.q4(9, this, e6Var));
        bhVar.setOnItemLongClickListener(new kg(this, 3));
        h6 h6Var = new h6(context, true, false, true);
        this.f32300z3 = h6Var;
        h6Var.setVisibility(8);
        h6Var.setAlpha(0.0f);
        h6Var.setGravity(17);
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        int L3 = org.telegram.messenger.g0.L(16.0f);
        h6Var.setPadding(L3, 0, L3, 0);
        h6Var.setTextSize(org.telegram.messenger.g0.L(f10));
        h6Var.setOnClickListener(new View.OnClickListener(this) {
            public final bi f36823b;

            {
                this.f36823b = this;
            }

            @Override
            public final void onClick(View view) {
                ii.d4 d4Var;
                int i13;
                boolean z14 = false;
                switch (r2) {
                    case 0:
                        bi biVar = this.f36823b;
                        if (biVar.f32275t2 != biVar.f32235i2) {
                            z14 = true;
                        }
                        biVar.O1(z14);
                        return;
                    case 1:
                        bi biVar2 = this.f36823b;
                        long j10 = biVar2.R2;
                        if (j10 < 0 && (d4Var = (ii.d4) biVar2.f32271s2.get(-j10)) != null) {
                            org.telegram.ui.web.w0 webViewContainer = d4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        bi biVar3 = this.f36823b;
                        boolean z15 = biVar3.U1;
                        if (!z15) {
                            biVar3.v1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        bi biVar4 = this.f36823b;
                        boolean z16 = biVar4.U1;
                        if (z16) {
                            biVar4.v1(!z16, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f36823b.n1();
                        return;
                    case 5:
                        this.f36823b.V2.U(null, null);
                        return;
                    case 6:
                        bi biVar5 = this.f36823b;
                        if (biVar5.f32215b2 != null) {
                            boolean U = ChatAttachAlertPhotoLayout.U();
                            boolean z17 = !U;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = biVar5.f32215b2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.f31260t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ye) {
                                        org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) entry.getValue();
                                        if (yeVar.d()) {
                                            yeVar.O = Boolean.valueOf(U);
                                            for (int i14 = 0; i14 < chatAttachAlertPhotoLayout2.F.getChildCount(); i14++) {
                                                View childAt = chatAttachAlertPhotoLayout2.F.getChildAt(i14);
                                                if (childAt instanceof org.telegram.ui.Cells.q5) {
                                                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                                    if (q5Var.getPhotoEntry() == yeVar) {
                                                        q5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.f25457b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.az.f21636i1 = z17;
                                edit.putBoolean("photoLiveDefault", z17).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            biVar5.N1(true);
                            org.telegram.ui.ActionBar.q0 q0Var32 = biVar5.X2;
                            gi.l3 l3Var = biVar5.Y2;
                            if (l3Var != null) {
                                l3Var.f(true);
                            }
                            gi.l3 l3Var2 = new gi.l3(biVar5.getContext(), 1);
                            biVar5.Y2 = l3Var2;
                            if (!U) {
                                i13 = 2131748840;
                            } else {
                                i13 = 2131748841;
                            }
                            l3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(i13, null)));
                            biVar5.Y2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            biVar5.Y2.p(1.0f, -((biVar5.f28586b.getWidth() - ((q0Var32.getWidth() / 2.0f) + q0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            biVar5.Y2.setTranslationY(biVar5.V2.getTranslationY());
                            gi.l3 l3Var3 = biVar5.Y2;
                            l3Var3.f13100r0 = new org.telegram.ui.lo(16, biVar5, l3Var2);
                            biVar5.f28586b.addView(l3Var3, b8.mf.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            biVar5.Y2.w();
                            return;
                        }
                        return;
                    case 7:
                        th thVar = this.f36823b.f32275t2;
                        if (thVar != null) {
                            thVar.w(40);
                            return;
                        }
                        return;
                    default:
                        this.f36823b.f32227f3.U(null, null);
                        return;
                }
            }
        });
        this.f28586b.addView(h6Var, b8.mf.e(-1, 48, 83));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f32292x3 = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(18.0f));
        radialProgressView.setAlpha(0.0f);
        radialProgressView.setScaleX(0.1f);
        radialProgressView.setScaleY(0.1f);
        radialProgressView.setVisibility(8);
        this.f28586b.addView(radialProgressView, b8.mf.d(28, 28.0f, 85, 0.0f, 0.0f, 10.0f, 10.0f));
        ImageView imageView3 = new ImageView(context);
        this.A2 = imageView3;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        int i13 = org.telegram.ui.ActionBar.k6.f28290z6;
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.r6.t(imageView3, i13, e6Var, mode2);
        imageView3.setImageResource(2131231838);
        imageView3.setVisibility(8);
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final bi f36823b;

            {
                this.f36823b = this;
            }

            @Override
            public final void onClick(View view) {
                ii.d4 d4Var;
                int i132;
                boolean z14 = false;
                switch (r2) {
                    case 0:
                        bi biVar = this.f36823b;
                        if (biVar.f32275t2 != biVar.f32235i2) {
                            z14 = true;
                        }
                        biVar.O1(z14);
                        return;
                    case 1:
                        bi biVar2 = this.f36823b;
                        long j10 = biVar2.R2;
                        if (j10 < 0 && (d4Var = (ii.d4) biVar2.f32271s2.get(-j10)) != null) {
                            org.telegram.ui.web.w0 webViewContainer = d4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        bi biVar3 = this.f36823b;
                        boolean z15 = biVar3.U1;
                        if (!z15) {
                            biVar3.v1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        bi biVar4 = this.f36823b;
                        boolean z16 = biVar4.U1;
                        if (z16) {
                            biVar4.v1(!z16, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f36823b.n1();
                        return;
                    case 5:
                        this.f36823b.V2.U(null, null);
                        return;
                    case 6:
                        bi biVar5 = this.f36823b;
                        if (biVar5.f32215b2 != null) {
                            boolean U = ChatAttachAlertPhotoLayout.U();
                            boolean z17 = !U;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = biVar5.f32215b2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.f31260t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ye) {
                                        org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) entry.getValue();
                                        if (yeVar.d()) {
                                            yeVar.O = Boolean.valueOf(U);
                                            for (int i14 = 0; i14 < chatAttachAlertPhotoLayout2.F.getChildCount(); i14++) {
                                                View childAt = chatAttachAlertPhotoLayout2.F.getChildAt(i14);
                                                if (childAt instanceof org.telegram.ui.Cells.q5) {
                                                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                                    if (q5Var.getPhotoEntry() == yeVar) {
                                                        q5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.f25457b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.az.f21636i1 = z17;
                                edit.putBoolean("photoLiveDefault", z17).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            biVar5.N1(true);
                            org.telegram.ui.ActionBar.q0 q0Var32 = biVar5.X2;
                            gi.l3 l3Var = biVar5.Y2;
                            if (l3Var != null) {
                                l3Var.f(true);
                            }
                            gi.l3 l3Var2 = new gi.l3(biVar5.getContext(), 1);
                            biVar5.Y2 = l3Var2;
                            if (!U) {
                                i132 = 2131748840;
                            } else {
                                i132 = 2131748841;
                            }
                            l3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(i132, null)));
                            biVar5.Y2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            biVar5.Y2.p(1.0f, -((biVar5.f28586b.getWidth() - ((q0Var32.getWidth() / 2.0f) + q0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            biVar5.Y2.setTranslationY(biVar5.V2.getTranslationY());
                            gi.l3 l3Var3 = biVar5.Y2;
                            l3Var3.f13100r0 = new org.telegram.ui.lo(16, biVar5, l3Var2);
                            biVar5.f28586b.addView(l3Var3, b8.mf.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            biVar5.Y2.w();
                            return;
                        }
                        return;
                    case 7:
                        th thVar = this.f36823b.f32275t2;
                        if (thVar != null) {
                            thVar.w(40);
                            return;
                        }
                        return;
                    default:
                        this.f36823b.f32227f3.U(null, null);
                        return;
                }
            }
        });
        ah ahVar3 = new ah(this, context, 2);
        this.f32295y2 = ahVar3;
        lg.j jVar5 = new lg.j(this, context);
        this.f32291x2 = jVar5;
        ahVar3.addView(jVar5, b8.mf.e(-1, -1, 119));
        gh.g c10 = this.D4.c(ohVar, b8.cd.o(e6Var), false);
        this.f32283v2 = c10;
        c10.T = true;
        c10.s(org.telegram.messenger.g0.L(29.0f), org.telegram.messenger.g0.L(29.0f), 0.0f, 0.0f);
        c10.u(org.telegram.messenger.g0.L(32.0f));
        c10.R.f12304g = 0.4f;
        c10.n();
        gh.g c11 = this.C4.c(jVar5, b8.cd.o(e6Var), false);
        this.f32287w2 = c11;
        c11.r(org.telegram.messenger.g0.L(22.0f));
        c11.q(org.telegram.messenger.g0.L(7.0f));
        jVar5.setPadding(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(5.0f));
        ahVar3.setWillNotDraw(false);
        ahVar3.setVisibility(4);
        ahVar3.setAlpha(0.0f);
        this.f28586b.addView(ahVar3, b8.mf.e(-1, -2, 83));
        ahVar3.setOnTouchListener(new fi.a(13));
        h6 h6Var2 = new h6(context, false, false, false);
        this.f32266r1 = h6Var2;
        h6Var2.setAllowCancel(true);
        h6Var2.setScaleProperty(0.6f);
        h6Var2.setVisibility(8);
        h6Var2.setTextSize(org.telegram.messenger.g0.L(15.0f));
        int i14 = org.telegram.ui.ActionBar.k6.f28273y6;
        org.telegram.ui.ActionBar.r6.Z(h6Var2, i14, e6Var);
        h6Var2.setTypeface(org.telegram.messenger.g0.o());
        h6Var2.setGravity(17);
        jVar5.addView(h6Var2, b8.mf.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 50.0f));
        ImageView imageView4 = new ImageView(context);
        this.f32274t1 = imageView4;
        org.telegram.ui.ActionBar.s2 s2Var = new org.telegram.ui.ActionBar.s2(context);
        this.f32278u1 = s2Var;
        imageView4.setImageDrawable(s2Var);
        imageView4.setScaleType(scaleType);
        int i15 = org.telegram.ui.ActionBar.k6.Kl;
        org.telegram.ui.ActionBar.r6.t(imageView4, i15, e6Var, mode);
        int i16 = org.telegram.ui.ActionBar.k6.f27972i6;
        org.telegram.ui.Cells.y h06 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i16, this.J0), 1, org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.n6 N5 = org.telegram.ui.ActionBar.r6.N(i16);
        imageView4.setBackground(h06);
        org.telegram.ui.ActionBar.r6.k(imageView4, h06, null, N5, e6Var);
        jVar5.addView(imageView4, b8.mf.d(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(org.telegram.messenger.bd.M0(2131755006, null));
        b8.pf.a(imageView4);
        imageView4.setOnClickListener(new View.OnClickListener(this) {
            public final bi f37148b;

            {
                this.f37148b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z14;
                boolean z15;
                org.telegram.ui.wm wmVar;
                switch (r3) {
                    case 0:
                        final bi biVar = this.f37148b;
                        dh dhVar = biVar.f32299z2;
                        if (dhVar != null) {
                            org.telegram.messenger.hp.e1().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var = new e0(biVar.getContext(), e6Var);
                            e0Var.r1(dhVar.getText());
                            e0Var.c2 = new org.telegram.messenger.u10() {
                                @Override
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            dh dhVar2 = biVar.f32299z2;
                                            dhVar2.setText(charSequence);
                                            dhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            fh fhVar2 = biVar.K2;
                                            fhVar2.setText(charSequence);
                                            fhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j10 = biVar.R1;
                            if (biVar.C3 != null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            tg tgVar = new tg(biVar, 0);
                            e0Var.f33237e2 = j10;
                            e0Var.f33238f2 = z14;
                            e0Var.f33239g2 = tgVar;
                            e0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final bi biVar2 = this.f37148b;
                        fh fhVar = biVar2.K2;
                        if (fhVar != null) {
                            org.telegram.messenger.hp.e1().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var2 = new e0(biVar2.getContext(), e6Var);
                            e0Var2.r1(fhVar.getText());
                            e0Var2.c2 = new org.telegram.messenger.u10() {
                                @Override
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            dh dhVar2 = biVar2.f32299z2;
                                            dhVar2.setText(charSequence);
                                            dhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            fh fhVar2 = biVar2.K2;
                                            fhVar2.setText(charSequence);
                                            fhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j11 = biVar2.R1;
                            if (biVar2.C3 != null) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            tg tgVar2 = new tg(biVar2, 1);
                            e0Var2.f33237e2 = j11;
                            e0Var2.f33238f2 = z15;
                            e0Var2.f33239g2 = tgVar2;
                            e0Var2.show();
                            return;
                        }
                        return;
                    default:
                        bi biVar3 = this.f37148b;
                        biVar3.f32227f3.U(null, null);
                        PhotoViewer v12 = PhotoViewer.v1();
                        org.telegram.ui.ActionBar.d2 d2Var2 = biVar3.X1;
                        v12.N2(null, d2Var2, e6Var);
                        PhotoViewer.v1().O2(biVar3);
                        PhotoViewer v13 = PhotoViewer.v1();
                        int i132 = biVar3.N3;
                        boolean z16 = biVar3.O3;
                        v13.h = i132;
                        v13.f41486n = z16;
                        if (!biVar3.U3.g0()) {
                            org.telegram.messenger.g0.v1(d2Var2.getFragmentView().findFocus());
                            org.telegram.messenger.g0.v1(biVar3.f28589c.findFocus());
                        }
                        File w10 = gi.f7.w(biVar3.E3, "webp");
                        Point point = org.telegram.messenger.g0.f22608q;
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
                        org.telegram.messenger.ye yeVar = new org.telegram.messenger.ye(0, w10.getAbsolutePath(), 0, false, 0, 0);
                        arrayList2.add(yeVar);
                        PhotoViewer v14 = PhotoViewer.v1();
                        sh shVar = new sh(biVar3, yeVar);
                        if (d2Var2 instanceof org.telegram.ui.wm) {
                            wmVar = (org.telegram.ui.wm) d2Var2;
                        } else {
                            wmVar = null;
                        }
                        v14.j2(arrayList2, 0, 11, false, shVar, wmVar);
                        if (biVar3.f32294y1) {
                            PhotoViewer.v1().Z0(null, null, true, biVar3.B1);
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
        this.C1 = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0).H0();
        dh dhVar = new dh(this, context, ohVar, e6Var);
        this.f32299z2 = dhVar;
        dhVar.K = true;
        dhVar.setHint(org.telegram.messenger.bd.M0(2131754454, "AddCaption"));
        dhVar.s();
        dhVar.getEditText().setLayoutParams(b8.mf.d(-1, -1.0f, 19, 48.0f, 0.0f, 36.0f, 0.0f));
        dhVar.getEditText().addTextChangedListener(new eh(this, 0));
        jVar5.addView(dhVar, b8.mf.d(-1, -2.0f, 83, 0.0f, 0.0f, 84.0f, 0.0f));
        jVar5.setClipChildren(false);
        ahVar3.setClipChildren(false);
        dhVar.setClipChildren(false);
        c0Var.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
        c0Var.setWillNotDraw(false);
        fh fhVar = new fh(this, context, ohVar, e6Var);
        this.K2 = fhVar;
        fhVar.K = true;
        fhVar.getEditText().addTextChangedListener(new hh(this, d2Var));
        fhVar.getEditText().setPadding(0, org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f));
        fhVar.getEditText().setLayoutParams(b8.mf.d(-1, -1.0f, 19, 48.0f, 0.0f, 96.0f, 0.0f));
        fhVar.getEditText().setTextSize(1, 17.0f);
        fhVar.getEmojiButton().setLayoutParams(b8.mf.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        fhVar.setHint(org.telegram.messenger.bd.M0(2131754454, "AddCaption"));
        c0Var.addView(fhVar, b8.mf.e(-1, -2, 119));
        c0Var.setAlpha(0.0f);
        c0Var.setVisibility(8);
        dhVar.addView(imageView3, b8.mf.d(40, 40.0f, 85, 0.0f, 0.0f, 0.0f, 4.0f));
        gh.g c12 = this.C4.c(c0Var, b8.cd.o(e6Var), false);
        c12.r(org.telegram.messenger.g0.L(22.0f));
        c12.q(org.telegram.messenger.g0.L(7.0f));
        c0Var.setBackground(c12);
        c0Var.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(9.0f));
        h6 h6Var3 = new h6(context, false, false, false);
        this.f32270s1 = h6Var3;
        h6Var3.setScaleProperty(0.6f);
        h6Var3.setVisibility(8);
        h6Var3.setTextSize(org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.r6.Z(h6Var3, i14, e6Var);
        h6Var3.setTypeface(org.telegram.messenger.g0.o());
        h6Var3.setGravity(17);
        h6Var3.setAllowCancel(true);
        c0Var.addView(h6Var3, b8.mf.d(56, 20.0f, 53, 3.0f, 45.0f, 3.0f, 0.0f));
        ImageView imageView5 = new ImageView(context);
        imageView5.setScaleType(scaleType);
        imageView5.setImageResource(2131231839);
        org.telegram.ui.ActionBar.r6.t(imageView5, org.telegram.ui.ActionBar.k6.Le, e6Var, mode2);
        fhVar.addView(imageView5, b8.mf.d(40, 40.0f, 85, 0.0f, 0.0f, 60.0f, 0.0f));
        imageView5.setOnClickListener(new View.OnClickListener(this) {
            public final bi f36823b;

            {
                this.f36823b = this;
            }

            @Override
            public final void onClick(View view) {
                ii.d4 d4Var;
                int i132;
                boolean z14 = false;
                switch (r2) {
                    case 0:
                        bi biVar = this.f36823b;
                        if (biVar.f32275t2 != biVar.f32235i2) {
                            z14 = true;
                        }
                        biVar.O1(z14);
                        return;
                    case 1:
                        bi biVar2 = this.f36823b;
                        long j10 = biVar2.R2;
                        if (j10 < 0 && (d4Var = (ii.d4) biVar2.f32271s2.get(-j10)) != null) {
                            org.telegram.ui.web.w0 webViewContainer = d4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        bi biVar3 = this.f36823b;
                        boolean z15 = biVar3.U1;
                        if (!z15) {
                            biVar3.v1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        bi biVar4 = this.f36823b;
                        boolean z16 = biVar4.U1;
                        if (z16) {
                            biVar4.v1(!z16, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f36823b.n1();
                        return;
                    case 5:
                        this.f36823b.V2.U(null, null);
                        return;
                    case 6:
                        bi biVar5 = this.f36823b;
                        if (biVar5.f32215b2 != null) {
                            boolean U = ChatAttachAlertPhotoLayout.U();
                            boolean z17 = !U;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = biVar5.f32215b2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.f31260t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ye) {
                                        org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) entry.getValue();
                                        if (yeVar.d()) {
                                            yeVar.O = Boolean.valueOf(U);
                                            for (int i142 = 0; i142 < chatAttachAlertPhotoLayout2.F.getChildCount(); i142++) {
                                                View childAt = chatAttachAlertPhotoLayout2.F.getChildAt(i142);
                                                if (childAt instanceof org.telegram.ui.Cells.q5) {
                                                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                                    if (q5Var.getPhotoEntry() == yeVar) {
                                                        q5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.f25457b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.az.f21636i1 = z17;
                                edit.putBoolean("photoLiveDefault", z17).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            biVar5.N1(true);
                            org.telegram.ui.ActionBar.q0 q0Var32 = biVar5.X2;
                            gi.l3 l3Var = biVar5.Y2;
                            if (l3Var != null) {
                                l3Var.f(true);
                            }
                            gi.l3 l3Var2 = new gi.l3(biVar5.getContext(), 1);
                            biVar5.Y2 = l3Var2;
                            if (!U) {
                                i132 = 2131748840;
                            } else {
                                i132 = 2131748841;
                            }
                            l3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(i132, null)));
                            biVar5.Y2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            biVar5.Y2.p(1.0f, -((biVar5.f28586b.getWidth() - ((q0Var32.getWidth() / 2.0f) + q0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            biVar5.Y2.setTranslationY(biVar5.V2.getTranslationY());
                            gi.l3 l3Var3 = biVar5.Y2;
                            l3Var3.f13100r0 = new org.telegram.ui.lo(16, biVar5, l3Var2);
                            biVar5.f28586b.addView(l3Var3, b8.mf.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            biVar5.Y2.w();
                            return;
                        }
                        return;
                    case 7:
                        th thVar = this.f36823b.f32275t2;
                        if (thVar != null) {
                            thVar.w(40);
                            return;
                        }
                        return;
                    default:
                        this.f36823b.f32227f3.U(null, null);
                        return;
                }
            }
        });
        ImageView imageView6 = new ImageView(context);
        this.f32282v1 = imageView6;
        org.telegram.ui.ActionBar.s2 s2Var2 = new org.telegram.ui.ActionBar.s2(context);
        this.f32286w1 = s2Var2;
        imageView6.setImageDrawable(s2Var2);
        imageView6.setScaleType(scaleType);
        org.telegram.ui.ActionBar.r6.t(imageView6, i15, e6Var, mode);
        org.telegram.ui.Cells.y h07 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i16, this.J0), 1, org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.n6 N6 = org.telegram.ui.ActionBar.r6.N(i16);
        imageView6.setBackground(h07);
        org.telegram.ui.ActionBar.r6.k(imageView6, h07, null, N6, e6Var);
        c0Var.addView(imageView6, b8.mf.d(44, 44.0f, 85, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView6.setContentDescription(org.telegram.messenger.bd.M0(2131755006, null));
        b8.pf.a(imageView6);
        imageView6.setOnClickListener(new View.OnClickListener(this) {
            public final bi f37148b;

            {
                this.f37148b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z14;
                boolean z15;
                org.telegram.ui.wm wmVar;
                switch (r3) {
                    case 0:
                        final bi biVar = this.f37148b;
                        dh dhVar2 = biVar.f32299z2;
                        if (dhVar2 != null) {
                            org.telegram.messenger.hp.e1().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var = new e0(biVar.getContext(), e6Var);
                            e0Var.r1(dhVar2.getText());
                            e0Var.c2 = new org.telegram.messenger.u10() {
                                @Override
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            dh dhVar22 = biVar.f32299z2;
                                            dhVar22.setText(charSequence);
                                            dhVar22.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            fh fhVar2 = biVar.K2;
                                            fhVar2.setText(charSequence);
                                            fhVar2.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j10 = biVar.R1;
                            if (biVar.C3 != null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            tg tgVar = new tg(biVar, 0);
                            e0Var.f33237e2 = j10;
                            e0Var.f33238f2 = z14;
                            e0Var.f33239g2 = tgVar;
                            e0Var.show();
                            return;
                        }
                        return;
                    case 1:
                        final bi biVar2 = this.f37148b;
                        fh fhVar2 = biVar2.K2;
                        if (fhVar2 != null) {
                            org.telegram.messenger.hp.e1().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var2 = new e0(biVar2.getContext(), e6Var);
                            e0Var2.r1(fhVar2.getText());
                            e0Var2.c2 = new org.telegram.messenger.u10() {
                                @Override
                                public final void a(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (r2) {
                                        case 0:
                                            dh dhVar22 = biVar2.f32299z2;
                                            dhVar22.setText(charSequence);
                                            dhVar22.w(charSequence.length(), charSequence.length());
                                            return;
                                        default:
                                            fh fhVar22 = biVar2.K2;
                                            fhVar22.setText(charSequence);
                                            fhVar22.w(charSequence.length(), charSequence.length());
                                            return;
                                    }
                                }
                            };
                            long j11 = biVar2.R1;
                            if (biVar2.C3 != null) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            tg tgVar2 = new tg(biVar2, 1);
                            e0Var2.f33237e2 = j11;
                            e0Var2.f33238f2 = z15;
                            e0Var2.f33239g2 = tgVar2;
                            e0Var2.show();
                            return;
                        }
                        return;
                    default:
                        bi biVar3 = this.f37148b;
                        biVar3.f32227f3.U(null, null);
                        PhotoViewer v12 = PhotoViewer.v1();
                        org.telegram.ui.ActionBar.d2 d2Var2 = biVar3.X1;
                        v12.N2(null, d2Var2, e6Var);
                        PhotoViewer.v1().O2(biVar3);
                        PhotoViewer v13 = PhotoViewer.v1();
                        int i132 = biVar3.N3;
                        boolean z16 = biVar3.O3;
                        v13.h = i132;
                        v13.f41486n = z16;
                        if (!biVar3.U3.g0()) {
                            org.telegram.messenger.g0.v1(d2Var2.getFragmentView().findFocus());
                            org.telegram.messenger.g0.v1(biVar3.f28589c.findFocus());
                        }
                        File w10 = gi.f7.w(biVar3.E3, "webp");
                        Point point = org.telegram.messenger.g0.f22608q;
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
                        org.telegram.messenger.ye yeVar = new org.telegram.messenger.ye(0, w10.getAbsolutePath(), 0, false, 0, 0);
                        arrayList2.add(yeVar);
                        PhotoViewer v14 = PhotoViewer.v1();
                        sh shVar = new sh(biVar3, yeVar);
                        if (d2Var2 instanceof org.telegram.ui.wm) {
                            wmVar = (org.telegram.ui.wm) d2Var2;
                        } else {
                            wmVar = null;
                        }
                        v14.j2(arrayList2, 0, 11, false, shVar, wmVar);
                        if (biVar3.f32294y1) {
                            PhotoViewer.v1().Z0(null, null, true, biVar3.B1);
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
        this.C2 = ahVar4;
        ahVar4.setFocusable(true);
        ahVar4.setFocusableInTouchMode(true);
        ahVar4.setVisibility(4);
        ahVar4.setScaleX(0.2f);
        ahVar4.setScaleY(0.2f);
        ahVar4.setAlpha(0.0f);
        ahVar4.setClipChildren(false);
        ahVar4.setClipToPadding(false);
        this.f28586b.addView(ahVar4, b8.mf.e(110, 50, 85));
        ih ihVar = new ih(context, e6Var, this);
        this.D2 = ihVar;
        ihVar.setImportantForAccessibility(2);
        ahVar4.addView(ihVar, b8.mf.e(-1, -1, 119));
        ihVar.setTranslationX(this.f28618u0);
        int L4 = org.telegram.messenger.g0.L(52.0f);
        int L5 = org.telegram.messenger.g0.L(38.0f);
        ihVar.J = L4;
        ihVar.K = L5;
        ihVar.N = org.telegram.messenger.g0.L(7.0f);
        ihVar.O = org.telegram.messenger.g0.L(6.0f);
        ihVar.f32192i0 = true;
        ihVar.setOnClickListener(new View.OnClickListener(this) {
            public final bi f36823b;

            {
                this.f36823b = this;
            }

            @Override
            public final void onClick(View view) {
                ii.d4 d4Var;
                int i132;
                boolean z14 = false;
                switch (r2) {
                    case 0:
                        bi biVar = this.f36823b;
                        if (biVar.f32275t2 != biVar.f32235i2) {
                            z14 = true;
                        }
                        biVar.O1(z14);
                        return;
                    case 1:
                        bi biVar2 = this.f36823b;
                        long j10 = biVar2.R2;
                        if (j10 < 0 && (d4Var = (ii.d4) biVar2.f32271s2.get(-j10)) != null) {
                            org.telegram.ui.web.w0 webViewContainer = d4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            return;
                        }
                        return;
                    case 2:
                        bi biVar3 = this.f36823b;
                        boolean z15 = biVar3.U1;
                        if (!z15) {
                            biVar3.v1(!z15, true);
                            return;
                        }
                        return;
                    case 3:
                        bi biVar4 = this.f36823b;
                        boolean z16 = biVar4.U1;
                        if (z16) {
                            biVar4.v1(!z16, true);
                            return;
                        }
                        return;
                    case 4:
                        this.f36823b.n1();
                        return;
                    case 5:
                        this.f36823b.V2.U(null, null);
                        return;
                    case 6:
                        bi biVar5 = this.f36823b;
                        if (biVar5.f32215b2 != null) {
                            boolean U = ChatAttachAlertPhotoLayout.U();
                            boolean z17 = !U;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = biVar5.f32215b2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.f31260t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof org.telegram.messenger.ye) {
                                        org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) entry.getValue();
                                        if (yeVar.d()) {
                                            yeVar.O = Boolean.valueOf(U);
                                            for (int i142 = 0; i142 < chatAttachAlertPhotoLayout2.F.getChildCount(); i142++) {
                                                View childAt = chatAttachAlertPhotoLayout2.F.getChildAt(i142);
                                                if (childAt instanceof org.telegram.ui.Cells.q5) {
                                                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                                    if (q5Var.getPhotoEntry() == yeVar) {
                                                        q5Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = org.telegram.messenger.t0.f25457b.getSharedPreferences("mainconfig", 0).edit();
                                org.telegram.messenger.az.f21636i1 = z17;
                                edit.putBoolean("photoLiveDefault", z17).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            biVar5.N1(true);
                            org.telegram.ui.ActionBar.q0 q0Var32 = biVar5.X2;
                            gi.l3 l3Var = biVar5.Y2;
                            if (l3Var != null) {
                                l3Var.f(true);
                            }
                            gi.l3 l3Var2 = new gi.l3(biVar5.getContext(), 1);
                            biVar5.Y2 = l3Var2;
                            if (!U) {
                                i132 = 2131748840;
                            } else {
                                i132 = 2131748841;
                            }
                            l3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(i132, null)));
                            biVar5.Y2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                            biVar5.Y2.p(1.0f, -((biVar5.f28586b.getWidth() - ((q0Var32.getWidth() / 2.0f) + q0Var32.getX())) - org.telegram.messenger.g0.L(14.0f)));
                            biVar5.Y2.setTranslationY(biVar5.V2.getTranslationY());
                            gi.l3 l3Var3 = biVar5.Y2;
                            l3Var3.f13100r0 = new org.telegram.ui.lo(16, biVar5, l3Var2);
                            biVar5.f28586b.addView(l3Var3, b8.mf.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            biVar5.Y2.w();
                            return;
                        }
                        return;
                    case 7:
                        th thVar = this.f36823b.f32275t2;
                        if (thVar != null) {
                            thVar.w(40);
                            return;
                        }
                        return;
                    default:
                        this.f36823b.f32227f3.U(null, null);
                        return;
                }
            }
        });
        ihVar.setOnLongClickListener(new org.telegram.ui.lf(this, context, e6Var, d2Var, 1));
        TextPaint textPaint3 = textPaint;
        textPaint3.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint3.setTypeface(org.telegram.messenger.g0.o());
        ch chVar2 = new ch(this, context, 1);
        chVar2.setAlpha(0.0f);
        chVar2.setScaleX(0.2f);
        chVar2.setScaleY(0.2f);
        if (z10) {
            P0();
            this.G0 = -1;
        }
        chatAttachAlertPhotoLayout.F.getFastScroll().a(this.C4, b8.cd.o(e6Var));
        zb0 zb0Var = new zb0(context);
        this.K1 = zb0Var;
        this.f28586b.addView(zb0Var, b8.mf.c(-1.0f, -1));
        hh.e eVar = new hh.e(e6Var);
        eVar.f14417e = new kg(this, 5);
        eVar.f14416c = new kg(this, 6);
        eVar.d = new kg(this, 7);
        eVar.f14415b = new kg(this, 8);
        float N7 = org.telegram.messenger.g0.N(3.3333333f);
        float N8 = org.telegram.messenger.g0.N(0.6666667f);
        eVar.f14419n = N7;
        eVar.f14420r = N8;
        float N9 = org.telegram.messenger.g0.N(1.0f);
        float N10 = org.telegram.messenger.g0.N(0.6666667f);
        eVar.f14418f = N9;
        eVar.h = N10;
        p7Var.M(this.C4, eVar, false);
        jVar.h(1L, false);
        this.Y0.i(this.f28586b);
        pi.q qVar2 = this.Y0;
        qVar2.f53602a = new kg(this, 9);
        qVar2.d = new ri.b(org.telegram.messenger.g0.L(48.0f));
    }

    public static void I0(bi biVar) {
        boolean z10;
        boolean q10;
        int i3;
        p7 p7Var = biVar.S2;
        mh.f fVar = biVar.f32264q3;
        if (fVar != null && p7Var != null) {
            th thVar = biVar.f32279u2;
            if (thVar == null) {
                thVar = biVar.f32275t2;
            }
            int i10 = 0;
            if (thVar != null && thVar.f()) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.ActionBar.e6 e6Var = biVar.J0;
            if (e6Var != null) {
                q10 = e6Var.a();
            } else {
                q10 = org.telegram.ui.ActionBar.k6.I.q();
            }
            if (!z10 && p7Var.getVisibility() == 0) {
                if (q10) {
                    i3 = 255;
                } else {
                    i3 = 160;
                }
                i10 = (int) (p7Var.getAlpha() * i3);
            }
            fVar.setFadeTopAlpha(i10);
        }
    }

    public static void K0(bi biVar) {
        gi.i iVar = new gi.i(biVar, biVar.getContext(), biVar.R1, LaunchActivity.Q(), biVar.J0, 1);
        biVar.f32301z4 = iVar;
        iVar.p(new nh(biVar, 0));
        ViewGroup viewGroup = biVar.f28586b;
        viewGroup.addView(biVar.f32301z4, viewGroup.indexOfChild(biVar.f32295y2), b8.mf.e(-1, -1, 83));
        gi.i iVar2 = biVar.f32301z4;
        iVar2.getAdapter().f16992c = false;
        iVar2.getAdapter().d = false;
        iVar2.getAdapter().f16995e = false;
        org.telegram.ui.ActionBar.d2 d2Var = biVar.X1;
        boolean z10 = true;
        if (d2Var instanceof org.telegram.ui.wm) {
            iVar2.getAdapter().f17006n0 = false;
            org.telegram.ui.wm wmVar = (org.telegram.ui.wm) d2Var;
            kg.e1 adapter = iVar2.getAdapter();
            wmVar.j();
            TLRPC.Chat chat = wmVar.f51292e;
            adapter.getClass();
            adapter.m0 = chat;
            iVar2.getAdapter().W(wmVar.f51453q8);
            kg.e1 adapter2 = iVar2.getAdapter();
            if (wmVar.f51292e == null) {
                z10 = false;
            }
            adapter2.f16998f0 = z10;
        } else {
            iVar2.getAdapter().f17006n0 = true;
            iVar2.getAdapter().W(null);
            iVar2.getAdapter().f16998f0 = false;
        }
        iVar2.getAdapter().f16999g0 = false;
        biVar.J1();
    }

    public static int L0(bi biVar) {
        th thVar = biVar.f32275t2;
        an anVar = biVar.f32223e2;
        if (thVar == anVar && anVar.F != null) {
            return anVar.getEmojiPadding();
        }
        an anVar2 = biVar.f32226f2;
        if (thVar == anVar2 && anVar2.F != null) {
            return anVar2.getEmojiPadding();
        }
        if (biVar.U1) {
            return biVar.K2.getEmojiPadding();
        }
        return biVar.f32299z2.getEmojiPadding();
    }

    public static boolean g1(TLRPC.User user) {
        if (user != null && !org.telegram.messenger.l10.B(user) && !org.telegram.messenger.l10.t(user) && !org.telegram.messenger.l10.x(user) && !org.telegram.messenger.l10.A(user.f27150id) && !org.telegram.messenger.l10.z(user) && !org.telegram.messenger.l10.s(user) && user.f27150id != 489000 && !org.telegram.messenger.hp.F2(user)) {
            return true;
        }
        return false;
    }

    public static void s1(th thVar) {
        if (thVar != null) {
            int i3 = org.telegram.ui.ActionBar.r6.f28515b;
            Object tag = thVar.getTag(2131296710);
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == i3) {
                return;
            }
            thVar.setTag(2131296710, Integer.valueOf(i3));
            try {
                org.telegram.ui.ActionBar.r6.d0(thVar, true);
                thVar.d();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final void A1(String str) {
        boolean z10 = true;
        this.L2 = 1;
        this.f32290x1 = true;
        this.N2 = false;
        this.H3 = false;
        this.f32272s3.setVisibility(8);
        this.f32224e3.setText(str);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f32215b2;
        if (chatAttachAlertPhotoLayout != null) {
            bi biVar = chatAttachAlertPhotoLayout.f38416b;
            if (biVar.L2 == 0 || biVar.f32290x1) {
                z10 = false;
            }
            chatAttachAlertPhotoLayout.f31278h1 = z10;
        }
    }

    public final void B1(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bi.B1(boolean):void");
    }

    public final void C1(long r26, java.lang.String r28, boolean r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bi.C1(long, java.lang.String, boolean, boolean):void");
    }

    public final void D1(org.telegram.ui.ActionBar.d2 d2Var) {
        if ((d2Var instanceof org.telegram.ui.wm) && org.telegram.messenger.t3.V(((org.telegram.ui.wm) d2Var).f51292e)) {
            new fc(this.f32249m3, this.J0).f(org.telegram.messenger.hp.s1(this.E3).U4, new org.telegram.ui.lo(17, this, d2Var)).j();
        }
    }

    public final boolean E1(boolean z10, boolean z11) {
        boolean z12;
        Integer num;
        boolean z13;
        float f10;
        float f11;
        float f12;
        int i3;
        float f13;
        float f14;
        float f15;
        int i10;
        float f16;
        float f17;
        float f18;
        th thVar;
        float f19;
        float L;
        long N1;
        float f20;
        float f21;
        p7 p7Var;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        float f27;
        float f28;
        float L2;
        this.k1.a(z10, true);
        ah ahVar = this.f32295y2;
        if (ahVar.getTag() != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z10 == z12) {
            return false;
        }
        AnimatorSet animatorSet = this.H2;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        ahVar.setTag(num);
        dh dhVar = this.f32299z2;
        if (dhVar.getEditText().isFocused()) {
            org.telegram.messenger.g0.v1(dhVar.getEditText());
        }
        dhVar.k(true);
        this.K2.k(true);
        ah ahVar2 = this.f32272s3;
        ah ahVar3 = this.C2;
        if (z10) {
            if (!this.F1) {
                ahVar.setVisibility(0);
            }
            ahVar3.setVisibility(0);
        } else if (this.N2) {
            ahVar2.setVisibility(0);
        }
        th thVar2 = this.f32275t2;
        if ((thVar2 == this.f32215b2 || thVar2 == this.f32235i2) && this.U1) {
            z13 = true;
        } else {
            z13 = false;
        }
        p7 p7Var2 = this.S2;
        ai.c0 c0Var = this.J2;
        lg.j jVar = this.f32291x2;
        ih ihVar = this.D2;
        float f29 = 1.0f;
        if (z11) {
            this.H2 = new AnimatorSet();
            if (z13) {
                c0Var.setVisibility(0);
            }
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            if (z10) {
                f20 = 1.0f;
            } else {
                f20 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(ahVar, property, f20));
            if (z10 && !z13) {
                f21 = 1.0f;
            } else {
                f21 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(jVar, property, f21));
            if (z10 && !z13) {
                jVar.setVisibility(0);
                p7Var = p7Var2;
                arrayList.add(ObjectAnimator.ofFloat(jVar, View.TRANSLATION_Y, 0.0f));
            } else {
                p7Var = p7Var2;
            }
            if (z10 && z13) {
                f22 = 1.0f;
            } else {
                f22 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(c0Var, property, f22));
            Property property2 = View.SCALE_X;
            if (z10) {
                f23 = 1.0f;
            } else {
                f23 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(ahVar3, property2, f23));
            Property property3 = View.SCALE_Y;
            if (z10) {
                f24 = 1.0f;
            } else {
                f24 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(ahVar3, property3, f24));
            if (z10) {
                f25 = 1.0f;
            } else {
                f25 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(ahVar3, property, f25));
            if (z10) {
                f26 = 1.0f;
            } else {
                f26 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(ihVar, property2, f26));
            if (z10) {
                f27 = 1.0f;
            } else {
                f27 = 0.2f;
            }
            arrayList.add(ObjectAnimator.ofFloat(ihVar, property3, f27));
            if (p7Var.getTag() != null) {
                Property property4 = View.TRANSLATION_Y;
                if (z10) {
                    L2 = 0.0f;
                } else {
                    L2 = org.telegram.messenger.g0.L(48.0f);
                }
                arrayList.add(ObjectAnimator.ofFloat(ahVar, property4, L2));
            } else if (this.N2) {
                Property property5 = View.TRANSLATION_Y;
                if (z10) {
                    f28 = org.telegram.messenger.g0.L(36.0f);
                } else {
                    f28 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(ahVar2, property5, f28));
                if (z10) {
                    f29 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(ahVar2, property, f29));
            }
            if (z13) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new lg(this, 5));
                arrayList.add(ofFloat);
            }
            this.H2.playTogether(arrayList);
            this.H2.setInterpolator(new DecelerateInterpolator());
            this.H2.setDuration(180L);
            this.H2.addListener(new org.telegram.ui.ActionBar.g(this, z10, z13, 3));
            this.H2.start();
            i3 = 0;
        } else {
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ahVar.setAlpha(f10);
            if (z10 && z13) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            jVar.setAlpha(f11);
            if (z10 && !z13) {
                i3 = 0;
                jVar.setVisibility(0);
                f12 = 0.0f;
                jVar.setTranslationY(0.0f);
            } else {
                f12 = 0.0f;
                i3 = 0;
            }
            if (z10) {
                f13 = 1.0f;
            } else {
                f13 = 0.2f;
            }
            ahVar3.setScaleX(f13);
            if (z10) {
                f14 = 1.0f;
            } else {
                f14 = 0.2f;
            }
            ahVar3.setScaleY(f14);
            if (z10) {
                f15 = 1.0f;
            } else {
                f15 = f12;
            }
            ahVar3.setAlpha(f15);
            if (z10 && z13) {
                i10 = i3;
            } else {
                i10 = 8;
            }
            c0Var.setVisibility(i10);
            if (z10 && z13) {
                f16 = 1.0f;
            } else {
                f16 = f12;
            }
            c0Var.setAlpha(f16);
            if (z10) {
                f17 = 1.0f;
            } else {
                f17 = 0.2f;
            }
            ihVar.setScaleX(f17);
            if (z10) {
                f18 = 1.0f;
            } else {
                f18 = 0.2f;
            }
            ihVar.setScaleY(f18);
            if (p7Var2.getTag() != null) {
                if (z10) {
                    L = f12;
                } else {
                    L = org.telegram.messenger.g0.L(48.0f);
                }
                ahVar.setTranslationY(L);
            } else if (this.N2 && ((thVar = this.f32275t2) == null || thVar.M())) {
                if (z10) {
                    f19 = org.telegram.messenger.g0.L(84.0f);
                } else {
                    f19 = f12;
                }
                ahVar2.setTranslationY(f19);
            }
            if (!z10) {
                ahVar.setVisibility(4);
                ahVar3.setVisibility(4);
            }
            if (z13) {
                Q1();
            }
        }
        if (z10) {
            i3 = Math.max(1, this.f32275t2.getSelectedItemsCount());
        }
        ihVar.e(i3, z11);
        if (this.C3 != null) {
            N1 = 0;
        } else {
            N1 = org.telegram.messenger.hp.s1(this.E3).N1(b1());
        }
        ihVar.i(X0() + this.f32275t2.getSelectedItemsCount(), N1, true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) dhVar.getLayoutParams();
        int max = Math.max(org.telegram.messenger.g0.L(48.0f), ihVar.l());
        if (marginLayoutParams.rightMargin != max) {
            marginLayoutParams.rightMargin = max;
            dhVar.setLayoutParams(marginLayoutParams);
        }
        return true;
    }

    public final void F1(th thVar) {
        long j10 = this.R2;
        bn bnVar = this.L1;
        if (thVar == bnVar) {
            j10 = bnVar.f32326s;
        } else if (thVar == this.f32215b2) {
            j10 = 1;
        } else if (thVar == this.f32220d2) {
            j10 = 3;
        } else if (thVar == this.f32232h2) {
            j10 = 4;
        } else if (thVar == this.c2) {
            j10 = 5;
        } else if (thVar == this.f32229g2) {
            j10 = 6;
        } else if (thVar == this.f32223e2) {
            j10 = 9;
        } else if (thVar == this.f32238j2) {
            j10 = 10;
        } else if (thVar == this.f32241k2) {
            j10 = 11;
        } else if (thVar == this.f32226f2) {
            j10 = 12;
        } else if (thVar == this.f32245l2) {
            j10 = 14;
        } else if (thVar == this.f32248m2) {
            j10 = 13;
        } else if (thVar == this.f32252n2) {
            j10 = 16;
        } else if (thVar == this.f32255o2) {
            j10 = 17;
        }
        G1(thVar, j10, true);
    }

    @Override
    public final boolean G() {
        return false;
    }

    public final void G1(th thVar, long j10, boolean z10) {
        boolean z11;
        int i3;
        pl plVar;
        boolean z12;
        Integer num;
        pl plVar2;
        int i10;
        int L;
        Float f10;
        int i11;
        boolean z13;
        Float valueOf = Float.valueOf(0.0f);
        if (this.f32256o3 == null && this.H2 == null) {
            th thVar2 = this.f32275t2;
            if (thVar2 == thVar) {
                thVar2.J();
            } else if (thVar == this.f32226f2 && !org.telegram.messenger.h10.i(this.E3).q()) {
                new vg.v0(this.X1, 39, false).show();
            } else {
                int i12 = (j10 > 1L ? 1 : (j10 == 1L ? 0 : -1));
                if (i12 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f32251n1.a(z11, z10);
                this.f32258p1.h(Long.valueOf(j10), z10);
                this.f32296y3 = false;
                this.f32288w3 = false;
                this.A3 = 0.0f;
                this.f32300z3.setVisibility(8);
                RadialProgressView radialProgressView = this.f32292x3;
                radialProgressView.setAlpha(0.0f);
                radialProgressView.setScaleX(0.1f);
                radialProgressView.setScaleY(0.1f);
                radialProgressView.setVisibility(8);
                ah ahVar = this.f32272s3;
                ahVar.setAlpha(1.0f);
                ahVar.setTranslationY(this.A3);
                int i13 = 0;
                while (true) {
                    LongSparseArray longSparseArray = this.f32271s2;
                    if (i13 >= longSparseArray.size()) {
                        break;
                    }
                    ((ii.d4) longSparseArray.valueAt(i13)).setMeasureOffsetY(0);
                    i13++;
                }
                this.R2 = j10;
                bh bhVar = this.f32276t3;
                int childCount = bhVar.getChildCount();
                int i14 = 0;
                while (i14 < childCount) {
                    View childAt = bhVar.getChildAt(i14);
                    if (childAt instanceof vh) {
                        vh vhVar = (vh) childAt;
                        i11 = childCount;
                        f10 = valueOf;
                        if (vhVar.f39114b == vhVar.f39115c.R2) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        vhVar.f40008a.f(z13, true);
                    } else {
                        f10 = valueOf;
                        i11 = childCount;
                        if (childAt instanceof uh) {
                            ((uh) childAt).a(true);
                        }
                    }
                    i14++;
                    childCount = i11;
                    valueOf = f10;
                }
                Float f11 = valueOf;
                int firstOffset = (this.f32275t2.getFirstOffset() - org.telegram.messenger.g0.L(11.0f)) - this.W3[0];
                this.f32279u2 = thVar;
                S0(thVar);
                if (this.f32279u2.j() != 0) {
                    i3 = 0;
                } else {
                    i3 = 4;
                }
                p7 p7Var = this.S2;
                p7Var.setVisibility(i3);
                if (p7Var.f27728o0) {
                    p7Var.l(true);
                }
                this.f32275t2.u();
                th thVar3 = this.f32279u2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f32215b2;
                if (thVar3 == chatAttachAlertPhotoLayout) {
                    chatAttachAlertPhotoLayout.setCheckCameraWhenShown(true);
                }
                this.f32279u2.H(this.f32275t2);
                this.f32279u2.setVisibility(0);
                if (thVar.getParent() != null) {
                    this.f28586b.removeView(this.f32279u2);
                }
                int indexOfChild = this.f28586b.indexOfChild(this.f32275t2);
                if (this.f32279u2.getParent() != this.f28586b) {
                    s1(this.f32279u2);
                    ViewGroup viewGroup = this.f28586b;
                    th thVar4 = this.f32279u2;
                    if (thVar4 != this.f32229g2) {
                        indexOfChild++;
                    }
                    viewGroup.addView(thVar4, indexOfChild, b8.mf.c(-1.0f, -1));
                }
                ng ngVar = new ng(this, 5);
                th thVar5 = this.f32275t2;
                boolean z14 = thVar5 instanceof am;
                lh lhVar = this.W1;
                if (!z14 && !(this.f32279u2 instanceof am)) {
                    if (z10) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        this.f32279u2.setAlpha(0.0f);
                        this.f32279u2.setTranslationY(org.telegram.messenger.g0.L(78.0f));
                        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f32275t2, View.TRANSLATION_Y, org.telegram.messenger.g0.L(78.0f) + firstOffset), ObjectAnimator.ofFloat(this.f32275t2, lhVar, 0.0f, 1.0f), ObjectAnimator.ofFloat(p7Var, View.ALPHA, p7Var.getAlpha(), 0.0f));
                        animatorSet.setDuration(180L);
                        animatorSet.setInterpolator(xq.f40452f);
                        animatorSet.addListener(new ci.h4(this, firstOffset, ngVar, 1));
                        this.f32256o3 = animatorSet;
                        th thVar6 = this.f32275t2;
                        lhVar.getClass();
                        lhVar.a(thVar6, f11);
                        animatorSet.start();
                    } else {
                        thVar5.setAlpha(0.0f);
                        ngVar.run();
                        P1(0);
                        this.f28586b.invalidate();
                    }
                } else {
                    int max = Math.max(this.f32279u2.getWidth(), this.f32275t2.getWidth());
                    th thVar7 = this.f32279u2;
                    if (thVar7 instanceof am) {
                        thVar7.setTranslationX(max);
                        th thVar8 = this.f32275t2;
                        if ((thVar8 instanceof ChatAttachAlertPhotoLayout) && (plVar2 = ((ChatAttachAlertPhotoLayout) thVar8).Q) != null) {
                            plVar2.setVisibility(4);
                        }
                    } else {
                        this.f32275t2.setTranslationX(-max);
                        th thVar9 = this.f32279u2;
                        if (thVar9 == chatAttachAlertPhotoLayout && (plVar = ((ChatAttachAlertPhotoLayout) thVar9).Q) != null) {
                            plVar.setVisibility(0);
                        }
                    }
                    this.f32279u2.setAlpha(1.0f);
                    this.f32275t2.setAlpha(1.0f);
                    if (z10) {
                        th thVar10 = this.f32275t2;
                        lhVar.getClass();
                        lhVar.a(thVar10, f11);
                        org.telegram.messenger.g0.h3(new e7(this, thVar, ngVar, 4));
                    } else {
                        if (this.f32279u2.getCurrentItemTop() <= thVar.getButtonsHideOffset()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        this.f32275t2.v(1.0f);
                        this.f32279u2.v(1.0f);
                        this.f32275t2.m(this.f32231g4);
                        this.f32279u2.m(this.f32231g4);
                        this.f28586b.invalidate();
                        this.Y0.g();
                        th thVar11 = this.f32275t2;
                        Float valueOf2 = Float.valueOf(1.0f);
                        lhVar.getClass();
                        lhVar.a(thVar11, valueOf2);
                        if (z12) {
                            num = 1;
                        } else {
                            num = null;
                        }
                        p7Var.setTag(num);
                        ngVar.run();
                    }
                }
                if (this.f32234h4 && !(thVar instanceof ii.d4)) {
                    i10 = 0;
                    this.f32234h4 = false;
                    p7Var.updateColors();
                    p7Var.invalidate();
                    i1();
                } else {
                    i10 = 0;
                }
                if (i12 != 0 && j10 != 6 && j10 != 17 && !(thVar instanceof ii.d4)) {
                    if (j10 == 4) {
                        L = org.telegram.messenger.g0.L(84.0f);
                    } else {
                        L = i10;
                    }
                } else {
                    L = org.telegram.messenger.g0.L(46.0f);
                }
                p7Var.setForcedMenuWidth(L);
            }
        }
    }

    @Override
    public final boolean H() {
        return this.f32275t2.b();
    }

    @Override
    public final boolean H0() {
        th thVar = this.f32275t2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f32215b2;
        if (thVar == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout.f31282j1) {
            return true;
        }
        return false;
    }

    public final void H1(boolean z10, Boolean bool) {
        bi biVar;
        if (this.f32223e2 == null) {
            biVar = this;
            an anVar = new an(biVar, getContext(), false, this.J0, bool);
            biVar.f32223e2 = anVar;
            biVar.f32267r2[1] = anVar;
            anVar.setDelegate(new kg(this, 17));
        } else {
            biVar = this;
        }
        G1(biVar.f32223e2, 9L, z10);
    }

    public final void I1(boolean z10, boolean z11) {
        Integer num;
        boolean z12;
        float f10;
        float f11;
        th thVar;
        float f12;
        float f13;
        float f14;
        int i3;
        boolean z13;
        this.f32244l1.a(z10, z11);
        p7 p7Var = this.S2;
        if ((z10 && p7Var.getTag() == null) || (!z10 && p7Var.getTag() != null)) {
            if (z10) {
                num = 1;
            } else {
                num = null;
            }
            p7Var.setTag(num);
            AnimatorSet animatorSet = this.T2;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.T2 = null;
            }
            if (!this.f32290x1 && !this.O2 && ((this.L2 != 0 || !this.f32246l3) && this.f32275t2 == this.f32215b2 && (this.G3 || this.H3))) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (this.f32275t2 == this.L1) {
                z12 = false;
            }
            ah ahVar = this.f32272s3;
            org.telegram.ui.ActionBar.q0 q0Var = this.V2;
            if (z10) {
                if (z12) {
                    q0Var.setVisibility(0);
                    q0Var.setClickable(true);
                }
            } else if (this.N2 && this.f32295y2.getTag() == null) {
                ahVar.setVisibility(0);
            }
            org.telegram.ui.ActionBar.d2 d2Var = this.X1;
            if (d2Var != null) {
                if (z10) {
                    if (this.f32219c4) {
                        i3 = org.telegram.ui.ActionBar.k6.f27964hh;
                    } else {
                        i3 = org.telegram.ui.ActionBar.k6.f27954h5;
                    }
                    if (i0.a.h(org.telegram.ui.ActionBar.k6.w0(i3, this.J0)) > 0.699999988079071d) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    org.telegram.messenger.g0.q3(this, z13);
                } else {
                    org.telegram.messenger.g0.q3(this, d2Var.isLightStatusBar());
                }
            }
            float f15 = 0.6f;
            float f16 = 0.0f;
            if (z11) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.T2 = animatorSet2;
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                animatorSet2.setDuration(Math.abs(f12 - p7Var.getAlpha()) * 180.0f);
                ArrayList arrayList = new ArrayList();
                Property property = View.ALPHA;
                if (z10) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(p7Var, property, f13);
                ofFloat.addUpdateListener(new lg(this, 4));
                arrayList.add(ofFloat);
                if (z12) {
                    if (z10) {
                        f16 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(q0Var, property, f16));
                    Property property2 = View.SCALE_X;
                    if (z10) {
                        f14 = 1.0f;
                    } else {
                        f14 = 0.6f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(q0Var, property2, f14));
                    Property property3 = View.SCALE_Y;
                    if (z10) {
                        f15 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(q0Var, property3, f15));
                }
                this.T2.playTogether(arrayList);
                this.T2.addListener(new s9(2, this, z10));
                this.T2.setInterpolator(xq.h);
                this.T2.setDuration(380L);
                this.T2.start();
                return;
            }
            if (z10 && this.N2 && ((thVar = this.f32275t2) == null || thVar.M())) {
                ahVar.setVisibility(4);
            }
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            p7Var.setAlpha(f10);
            if (z12) {
                if (z10) {
                    f16 = 1.0f;
                }
                q0Var.setAlpha(f16);
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.6f;
                }
                q0Var.setScaleX(f11);
                if (z10) {
                    f15 = 1.0f;
                }
                q0Var.setScaleY(f15);
            }
            if (!z10) {
                org.telegram.ui.ActionBar.q0 q0Var2 = this.Z2;
                if (q0Var2 != null) {
                    q0Var2.setVisibility(4);
                }
                if (this.L2 != 0 || !this.f32246l3) {
                    q0Var.setVisibility(4);
                }
            }
        }
    }

    @Override
    public final void J() {
        AnimatorSet animatorSet = this.A0;
        if (animatorSet != null) {
            animatorSet.cancel();
            q1.g gVar = this.f32243k4;
            if (gVar != null) {
                gVar.d();
            }
            AnimatorSet animatorSet2 = this.f32247l4;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            this.A0 = null;
            this.B0 = 0;
        }
    }

    public final void J1() {
        float alpha;
        int[] iArr = this.B2;
        dh dhVar = this.f32299z2;
        dhVar.getLocationOnScreen(iArr);
        if (this.f32301z4 != null) {
            th thVar = this.f32275t2;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f32215b2;
            if ((thVar == chatAttachAlertPhotoLayout || thVar == this.f32235i2) && this.U1) {
                ai.c0 c0Var = this.J2;
                alpha = (c0Var.getAlpha() * c0Var.getMeasuredHeight()) + (c0Var.getY() - this.f32301z4.getTop());
            } else {
                alpha = -dhVar.getHeight();
            }
            if (Math.abs(this.f32301z4.getTranslationY() - alpha) > 0.5f) {
                this.f32301z4.setTranslationY(alpha);
                this.f32301z4.invalidate();
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.X();
                }
            }
        }
        U0();
    }

    @Override
    public void K() {
        zh zhVar = this.U3;
        if (zhVar != null) {
            zhVar.Y(new ng(this, 4));
        } else {
            t1();
        }
    }

    public final void K1(int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bi.K1(int):void");
    }

    @Override
    public final void L(int i3) {
        super.L(i3);
        this.f32275t2.r(i3);
    }

    public final void L1() {
        boolean i3;
        float f10;
        float f11;
        float f12;
        th thVar = this.f32275t2;
        int i10 = 0;
        if (thVar == null) {
            i3 = false;
        } else {
            i3 = thVar.i();
        }
        fi.j jVar = this.f32213a3;
        jVar.setEnabled(i3);
        th thVar2 = this.f32275t2;
        float f13 = 0.5f;
        if (thVar2 != null) {
            if (thVar2.i()) {
                f11 = 1.0f;
            } else {
                f11 = 0.5f;
            }
            if (this.f32279u2 == null) {
                f12 = 1.0f;
            } else {
                f12 = this.V1;
            }
            f10 = (f11 * f12) + 0.0f;
        } else {
            f10 = 0.0f;
        }
        th thVar3 = this.f32279u2;
        if (thVar3 != null) {
            if (thVar3.i()) {
                f13 = 1.0f;
            }
            f10 = com.google.android.recaptcha.internal.a.y(1.0f, this.V1, f13, f10);
        }
        this.f32216b3 = f10;
        if (jVar != null) {
            float f14 = f10 * this.f32218c3;
            jVar.setAlpha(f14);
            if (f14 <= 0.0f) {
                i10 = 4;
            }
            jVar.setVisibility(i10);
        }
    }

    public final void M0() {
        if (a1().f35188a.length() <= 0) {
            return;
        }
        this.f32275t2.a(a1().getText());
    }

    public final void M1(th thVar, int i3) {
        boolean z10;
        int i10;
        int i11;
        if (thVar != null) {
            eh.g gVar = this.A4;
            if (gVar != null && Build.VERSION.SDK_INT >= 31) {
                gVar.f(0.0f, i3);
            }
            int currentItemTop = thVar.getCurrentItemTop();
            if (currentItemTop != Integer.MAX_VALUE) {
                boolean z11 = false;
                if (thVar == this.f32275t2 && currentItemTop <= thVar.getButtonsHideOffset()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.J1 = z10;
                if (thVar == this.f32275t2) {
                    I1(z10, true);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) thVar.getLayoutParams();
                if (layoutParams == null) {
                    i10 = 0;
                } else {
                    i10 = layoutParams.topMargin;
                }
                int D = org.telegram.messenger.camera.q.D(11.0f, i10, currentItemTop);
                th thVar2 = this.f32275t2;
                if (thVar2 == thVar) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                if ((thVar2 instanceof am) || (this.f32279u2 instanceof am)) {
                    Object obj = this.f32256o3;
                    if ((obj instanceof q1.g) && ((q1.g) obj).f53647f) {
                        z11 = true;
                    }
                }
                int[] iArr = this.W3;
                int i12 = iArr[i11];
                if (i12 == D && !z11) {
                    if (i3 != 0) {
                        this.X3 = i12;
                        return;
                    }
                    return;
                }
                this.X3 = i12;
                iArr[i11] = D;
                P1(i11);
                this.f28586b.invalidate();
            }
        }
    }

    public final boolean N0() {
        org.telegram.ui.ActionBar.d2 d2Var = this.X1;
        if ((d2Var instanceof org.telegram.ui.wm) && ((org.telegram.ui.wm) d2Var).Y6()) {
            return true;
        }
        return false;
    }

    public final void N1(boolean z10) {
        gi.u uVar;
        boolean z11;
        float f10;
        float f11;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f32215b2;
        if (chatAttachAlertPhotoLayout != null && (uVar = this.W2) != null) {
            int i3 = 0;
            if (this.f32246l3 && this.f32212a2 && this.f32275t2 == chatAttachAlertPhotoLayout && ChatAttachAlertPhotoLayout.f0()) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z12 = !ChatAttachAlertPhotoLayout.U();
            uVar.f13644f = z12;
            if (!z10) {
                ((u5) uVar.f13645g).a(z12);
            }
            uVar.invalidateSelf();
            float f12 = 0.0f;
            float f13 = 0.6f;
            org.telegram.ui.ActionBar.q0 q0Var = this.X2;
            if (z10 && this.f32246l3) {
                q0Var.setVisibility(0);
                ViewPropertyAnimator animate = q0Var.animate();
                if (z11) {
                    f12 = 1.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f12);
                if (z11) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.6f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f11);
                if (z11) {
                    f13 = 1.0f;
                }
                scaleX.scaleY(f13).setDuration(320L).setInterpolator(xq.h).withEndAction(new wg(this, z11, 0)).start();
                return;
            }
            if (!z11) {
                i3 = 8;
            }
            q0Var.setVisibility(i3);
            if (z11) {
                f12 = 1.0f;
            }
            q0Var.setAlpha(f12);
            if (z11) {
                f10 = 1.0f;
            } else {
                f10 = 0.6f;
            }
            q0Var.setScaleX(f10);
            if (z11) {
                f13 = 1.0f;
            }
            q0Var.setScaleY(f13);
        }
    }

    public final boolean O0(CharSequence charSequence) {
        org.telegram.ui.ActionBar.d2 d2Var = this.X1;
        if (d2Var instanceof org.telegram.ui.wm) {
            return ChatActivityEnterView.C(this.E3, ((org.telegram.ui.wm) d2Var).a(), d2Var, charSequence);
        }
        return false;
    }

    public final void O1(boolean z10) {
        boolean z11;
        float f10;
        th thVar = this.f32215b2;
        if (z10) {
            if (!this.E1) {
                return;
            }
            if (this.f32235i2 == null) {
                Context context = getContext();
                org.telegram.ui.ActionBar.e6 e6Var = this.f32262q1;
                if (e6Var == null) {
                    e6Var = this.J0;
                }
                ?? thVar2 = new th(context, e6Var, this);
                thVar2.E = 0.0f;
                thVar2.F = 0.0f;
                thVar2.G = 0.0f;
                thVar2.H = 0.0f;
                thVar2.I = 0.0f;
                thVar2.J = 0.0f;
                thVar2.K = null;
                thVar2.L = false;
                thVar2.N = 0.0f;
                thVar2.R = false;
                thVar2.T = false;
                Point point = org.telegram.messenger.g0.f22608q;
                if (point.y > point.x) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                thVar2.U = z11;
                thVar2.f31895n = e6Var;
                thVar2.f38419f = true;
                thVar2.setWillNotDraw(false);
                bi biVar = thVar2.f38416b;
                org.telegram.ui.ActionBar.x q10 = biVar.S2.q();
                TextView textView = new TextView(context);
                thVar2.f31900y = textView;
                org.telegram.ui.ActionBar.e6 e6Var2 = thVar2.f38415a;
                gi.u2 u2Var = new gi.u2(thVar2, context, q10, e6Var2, 2);
                p7 p7Var = biVar.S2;
                if (org.telegram.messenger.g0.Q1()) {
                    f10 = 64.0f;
                } else {
                    f10 = 56.0f;
                }
                p7Var.addView(u2Var, 0, b8.mf.d(-2, -1.0f, 51, f10, 0.0f, 40.0f, 0.0f));
                textView.setImportantForAccessibility(2);
                textView.setGravity(3);
                textView.setSingleLine(true);
                textView.setLines(1);
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27988j5, e6Var2);
                textView.setText(org.telegram.messenger.bd.M0(2131753958, null));
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setCompoundDrawablePadding(org.telegram.messenger.g0.L(4.0f));
                textView.setPadding(0, 0, org.telegram.messenger.g0.L(10.0f), 0);
                textView.setAlpha(0.0f);
                u2Var.addView(textView, b8.mf.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
                ci.j1 j1Var = new ci.j1(thVar2, context, e6Var2, 17);
                thVar2.f31896r = j1Var;
                j1Var.setAdapter(new org.telegram.ui.y7(thVar2, 3));
                u4.b0 b0Var = new u4.b0(1, false);
                thVar2.f31897s = b0Var;
                j1Var.setLayoutManager(b0Var);
                j1Var.setClipChildren(false);
                j1Var.setClipToPadding(false);
                j1Var.setOverScrollMode(2);
                j1Var.setVerticalScrollBarEnabled(false);
                zl zlVar = new zl(thVar2, context);
                thVar2.f31898w = zlVar;
                zlVar.setClipToPadding(true);
                zlVar.setClipChildren(true);
                thVar2.addView(j1Var, b8.mf.c(-1.0f, -1));
                thVar2.Q = biVar.f32215b2;
                zlVar.f41064c.clear();
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = thVar2.Q;
                zlVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
                zlVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
                zlVar.c();
                UndoView undoView = new UndoView(context, null, false, biVar.f32262q1);
                thVar2.f31899x = undoView;
                undoView.setEnterOffsetMargin(org.telegram.messenger.g0.L(32.0f));
                thVar2.addView(undoView, b8.mf.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 52.0f));
                thVar2.O = context.getResources().getDrawable(2131232547);
                this.f32235i2 = thVar2;
                thVar2.bringToFront();
            }
            th thVar3 = this.f32275t2;
            am amVar = this.f32235i2;
            if (thVar3 != amVar) {
                thVar = amVar;
            }
            F1(thVar);
            return;
        }
        F1(thVar);
    }

    public final void P0() {
        int i3;
        int i10;
        int i11;
        boolean z10;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        bh bhVar = this.f32276t3;
        if (bhVar == null) {
            return;
        }
        int childCount = bhVar.getChildCount();
        boolean z11 = false;
        for (int i17 = 0; i17 < childCount; i17++) {
            bhVar.getChildAt(i17);
        }
        boolean z12 = this.f32219c4;
        if (z12) {
            i3 = org.telegram.ui.ActionBar.k6.Vg;
        } else {
            i3 = org.telegram.ui.ActionBar.k6.f27988j5;
        }
        org.telegram.ui.ActionBar.r6.V(this.f32224e3, i3, this.J0);
        if (z12) {
            i10 = org.telegram.ui.ActionBar.k6.Vg;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.f27988j5;
        }
        org.telegram.ui.ActionBar.r6.V(this.f32239j3, i10, this.J0);
        org.telegram.ui.ActionBar.r6.V(this.f32213a3, org.telegram.ui.ActionBar.k6.Gi, this.J0);
        if (z12) {
            i11 = org.telegram.ui.ActionBar.k6.Vg;
        } else {
            i11 = org.telegram.ui.ActionBar.k6.f27988j5;
        }
        int w02 = org.telegram.ui.ActionBar.k6.w0(i11, this.J0);
        if (this.f32257o4 && w02 == this.n4) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f32257o4 = true;
        this.n4 = w02;
        org.telegram.ui.ActionBar.q0 q0Var = this.V2;
        if (z10) {
            q0Var.setIconColor(w02);
        }
        Drawable background = q0Var.getBackground();
        if (z12) {
            i12 = org.telegram.ui.ActionBar.k6.Wg;
        } else {
            i12 = org.telegram.ui.ActionBar.k6.I5;
        }
        org.telegram.ui.ActionBar.k6.C1(org.telegram.ui.ActionBar.k6.w0(i12, this.J0), background);
        int i18 = org.telegram.ui.ActionBar.k6.E8;
        q0Var.O(org.telegram.ui.ActionBar.k6.w0(i18, this.J0), false);
        q0Var.O(org.telegram.ui.ActionBar.k6.w0(i18, this.J0), true);
        q0Var.H(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G8, this.J0));
        org.telegram.ui.ActionBar.q0 q0Var2 = this.X2;
        if (q0Var2 != null && z10) {
            q0Var2.setIconColor(w02);
        }
        org.telegram.ui.ActionBar.q0 q0Var3 = this.Z2;
        if (q0Var3 != null) {
            if (z10) {
                q0Var3.setIconColor(w02);
            }
            Drawable background2 = q0Var3.getBackground();
            if (z12) {
                i16 = org.telegram.ui.ActionBar.k6.Wg;
            } else {
                i16 = org.telegram.ui.ActionBar.k6.I5;
            }
            org.telegram.ui.ActionBar.k6.C1(org.telegram.ui.ActionBar.k6.w0(i16, this.J0), background2);
        }
        dh dhVar = this.f32299z2;
        org.telegram.ui.ActionBar.e6 e6Var = dhVar.N;
        dt dtVar = dhVar.f35188a;
        int i19 = dhVar.M;
        if (i19 == 0) {
            dtVar.setHintTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.H6, e6Var));
            int i20 = org.telegram.ui.ActionBar.k6.G6;
            dtVar.setCursorColor(org.telegram.ui.ActionBar.k6.w0(i20, e6Var));
            dtVar.setTextColor(org.telegram.ui.ActionBar.k6.w0(i20, e6Var));
        } else if (i19 != 2 && i19 != 3) {
            dtVar.setHintTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28176t5, e6Var));
            dtVar.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27988j5, e6Var));
        } else {
            dtVar.setHintTextColor(-1929379841);
            dtVar.setTextColor(-1);
            dtVar.setCursorColor(-1);
            dtVar.setHandlesColor(-1);
            dtVar.setHighlightColor(822083583);
            dtVar.E = -1;
        }
        dhVar.f35190c.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Le, e6Var), PorterDuff.Mode.MULTIPLY));
        et etVar = dhVar.d;
        if (etVar != null) {
            etVar.updateColors();
        }
        org.telegram.ui.ActionBar.r6.m(bhVar, 21, org.telegram.ui.ActionBar.k6.A5, this.J0);
        if (z12) {
            i13 = org.telegram.ui.ActionBar.k6.Vg;
        } else {
            i13 = org.telegram.ui.ActionBar.k6.f27988j5;
        }
        org.telegram.ui.ActionBar.e6 e6Var2 = this.J0;
        p7 p7Var = this.S2;
        org.telegram.ui.ActionBar.r6.m(p7Var, 1, i13, e6Var2);
        if (z12) {
            i14 = org.telegram.ui.ActionBar.k6.Wg;
        } else {
            i14 = org.telegram.ui.ActionBar.k6.I5;
        }
        org.telegram.ui.ActionBar.r6.m(p7Var, 3, i14, this.J0);
        if (z12) {
            i15 = org.telegram.ui.ActionBar.k6.Vg;
        } else {
            i15 = org.telegram.ui.ActionBar.k6.f27988j5;
        }
        org.telegram.ui.ActionBar.r6.m(p7Var, 5, i15, this.J0);
        int d12 = d1(false);
        org.telegram.ui.ActionBar.k6.C1(d12, this.f28616s0);
        si.c cVar = this.B4;
        if (cVar.f54747b != d12) {
            cVar.a(d12);
            mh.f fVar = this.f32264q3;
            if (fVar != null) {
                fVar.invalidate();
            }
            ch chVar = this.f32268r3;
            if (chVar != null) {
                chVar.invalidate();
            }
        }
        this.f28586b.invalidate();
        int i21 = 0;
        while (true) {
            th[] thVarArr = this.f32267r2;
            if (i21 >= thVarArr.length) {
                break;
            }
            th thVar = thVarArr[i21];
            if (thVar != null) {
                thVar.d();
            }
            i21++;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            this.G0 = -1;
            this.H0 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27971i5, this.J0);
            org.telegram.messenger.g0.u3(this, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27954h5, this.J0), false, null);
            if (org.telegram.messenger.g0.B(this.H0) > 0.721d) {
                z11 = true;
            }
            org.telegram.messenger.g0.n3(this, z11);
            return;
        }
        P(org.telegram.ui.ActionBar.k6.f27954h5);
    }

    public final void P1(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bi.P1(int):void");
    }

    public final void Q0(boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bi.Q0(boolean):void");
    }

    public final void Q1() {
        int i3 = 0;
        P1(0);
        this.f32249m3.invalidate();
        ai.c0 c0Var = this.J2;
        c0Var.invalidate();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f32215b2;
        if (chatAttachAlertPhotoLayout != null) {
            il ilVar = chatAttachAlertPhotoLayout.F;
            chatAttachAlertPhotoLayout.X();
            if (ilVar != null && ilVar.getFastScroll() != null) {
                yi0 fastScroll = ilVar.getFastScroll();
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + chatAttachAlertPhotoLayout.f31294q1;
                if (this.U1) {
                    i3 = (int) (c0Var.getAlpha() * c0Var.getMeasuredHeight());
                }
                fastScroll.f40741i0 = currentActionBarHeight + i3;
                ilVar.getFastScroll().invalidate();
            }
        }
        J1();
        U0();
    }

    public final void R0() {
        float f10 = this.k1.f53840e;
        float f11 = (1.0f - this.f32237j1.f53840e) * f10;
        this.f32268r3.setTranslationY(org.telegram.messenger.g0.L(48.0f) * Math.min(Math.min(1.0f, 1.0f - ((1.0f - f10) * (1.0f - this.f32244l1.f53840e))), 1.0f - f11));
    }

    public final void S0(th thVar) {
        int L;
        boolean e10 = thVar.e();
        int i3 = 0;
        mh.f fVar = this.f32264q3;
        if (fVar != null) {
            if (e10) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(48.0f);
            }
            fVar.setFadeHeightBottom(L);
        }
        ch chVar = this.f32268r3;
        if (chVar != null) {
            if (e10) {
                i3 = 4;
            }
            chVar.setVisibility(i3);
        }
    }

    public final void T0() {
        float f10;
        float f11 = this.m1.f53840e;
        float f12 = this.f32251n1.f53840e;
        float a10 = b8.v9.a(this.f32254o1.f53840e);
        if (this.M3) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        l00.d(this.A2, com.google.android.recaptcha.internal.a.C(f11, f12, a10, f10));
    }

    @Override
    public final ArrayList U() {
        ArrayList<org.telegram.ui.ActionBar.t6> themeDescriptions;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        while (true) {
            th[] thVarArr = this.f32267r2;
            if (i3 < thVarArr.length) {
                th thVar = thVarArr[i3];
                if (thVar != null && (themeDescriptions = thVar.getThemeDescriptions()) != null) {
                    arrayList.addAll(themeDescriptions);
                }
                i3++;
            } else {
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.f28589c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27971i5));
                return arrayList;
            }
        }
    }

    public final void U0() {
        ih ihVar = this.D2;
        ah ahVar = this.C2;
        ai.c0 c0Var = this.J2;
        if (c0Var != null && c0Var.getVisibility() == 0 && c0Var.getAlpha() != 0.0f) {
            float f10 = this.f32237j1.f53840e;
            float abs = Math.abs(org.telegram.messenger.g0.T1(-1.0f, 1.0f, f10));
            ihVar.setAlpha(abs * abs * abs * abs);
            ahVar.setTranslationY(org.telegram.messenger.g0.T1(this.f32217b4, ((c0Var.getTranslationY() + c0Var.getTop()) - ahVar.getTop()) + org.telegram.messenger.g0.L(8.0f), xq.f40455j.getInterpolation(f10)));
            return;
        }
        ahVar.setTranslationY(this.f32217b4);
        ihVar.setAlpha(1.0f);
    }

    public final void V0(int i3) {
        this.N2 = true;
        this.f32272s3.setVisibility(0);
        this.f32298z1 = true;
        this.A1 = i3;
        this.L2 = 0;
        this.f32290x1 = false;
        this.f32294y1 = false;
        this.B1 = null;
        org.telegram.ui.ActionBar.q0 q0Var = this.f32227f3;
        if (q0Var != null) {
            this.f32224e3.setTranslationY(0.0f);
            q0Var.setVisibility(8);
        }
    }

    public final void W0(gi.q4 q4Var) {
        String M0 = org.telegram.messenger.bd.M0(2131752122, null);
        TextView textView = this.f32224e3;
        textView.setText(M0);
        this.N2 = false;
        this.f32272s3.setVisibility(8);
        this.L2 = 1;
        this.f32290x1 = true;
        this.f32294y1 = true;
        this.f32212a2 = false;
        this.B1 = q4Var;
        org.telegram.ui.ActionBar.q0 q0Var = this.f32227f3;
        if (q0Var != null) {
            textView.setTranslationY(-org.telegram.messenger.g0.L(8.0f));
            q0Var.setVisibility(0);
            q0Var.setClickable(true);
            q0Var.setAlpha(1.0f);
            q0Var.setScaleX(1.0f);
            q0Var.setScaleY(1.0f);
        }
    }

    public final int X0() {
        org.telegram.messenger.dj djVar;
        org.telegram.messenger.bj bjVar;
        org.telegram.ui.ActionBar.d2 d2Var = this.X1;
        if (!(d2Var instanceof org.telegram.ui.wm) || (djVar = ((org.telegram.ui.wm) d2Var).f51526w5) == null || (bjVar = djVar.f22198b) == null) {
            return 0;
        }
        return bjVar.f21843g.size();
    }

    @Override
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
        th thVar;
        int i10;
        if (i3 == 0) {
            U0();
            R0();
            return;
        }
        int i11 = 1;
        if (i3 == 2) {
            R0();
            an anVar = this.f32223e2;
            if (anVar != null && ((thVar = this.f32279u2) == anVar || this.f32275t2 == anVar)) {
                if (thVar == anVar) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                P1(i10);
            }
            an anVar2 = this.f32226f2;
            if (anVar2 != null) {
                th thVar2 = this.f32279u2;
                if (thVar2 == anVar2 || this.f32275t2 == anVar2) {
                    if (thVar2 != anVar2) {
                        i11 = 0;
                    }
                    P1(i11);
                }
            }
        } else if (i3 == 1) {
            R0();
        } else if (i3 == 3) {
            T0();
        } else if (i3 == 4) {
            T0();
        } else if (i3 == 5) {
            T0();
            ih ihVar = this.D2;
            if (ihVar != null) {
                ihVar.setEphemeralFactor(f10);
                ihVar.setSameWidthFactor(f10);
            }
        }
    }

    public final TLRPC.Chat Y0() {
        org.telegram.ui.ActionBar.d2 d2Var = this.X1;
        if (d2Var instanceof org.telegram.ui.wm) {
            return ((org.telegram.ui.wm) d2Var).f51292e;
        }
        return org.telegram.messenger.hp.s1(this.E3).M0(Long.valueOf(-this.R1));
    }

    public final float Z0() {
        ah ahVar = this.f32295y2;
        float alpha = 1.0f - ahVar.getAlpha();
        return ahVar.getMeasuredHeight() - (alpha * (ahVar.getMeasuredHeight() - org.telegram.messenger.g0.L(84.0f)));
    }

    @Override
    public final void a(boolean z10) {
        if (z10) {
            this.f32297y4 = z10;
        }
        dismiss();
    }

    public final jt a1() {
        th thVar;
        if (this.U1 && ((thVar = this.f32275t2) == this.f32215b2 || thVar == this.f32235i2)) {
            return this.K2;
        }
        return this.f32299z2;
    }

    public final long b1() {
        org.telegram.ui.ActionBar.d2 d2Var = this.X1;
        if (d2Var instanceof org.telegram.ui.wm) {
            return ((org.telegram.ui.wm) d2Var).a();
        }
        return this.R1;
    }

    public final int c1(int i3) {
        th thVar = this.f32279u2;
        int[] iArr = this.W3;
        if (thVar != null && ((this.f32275t2 instanceof am) || (thVar instanceof am))) {
            return org.telegram.messenger.g0.W1(this.V1, iArr[0], iArr[1]);
        }
        return iArr[i3];
    }

    public final int d1(boolean z10) {
        boolean q10;
        int i3;
        p7 p7Var;
        if (this.f32219c4) {
            return org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27964hh, this.J0);
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.J0;
        if (e6Var != null) {
            q10 = e6Var.a();
        } else {
            q10 = org.telegram.ui.ActionBar.k6.I.q();
        }
        Iterator it = this.f32258p1.iterator();
        float f10 = 0.0f;
        while (it.hasNext()) {
            qe.e eVar = (qe.e) it.next();
            long longValue = ((Long) eVar.f53849a).longValue();
            if (longValue == 1 || longValue == 3 || longValue == 4 || longValue == 5 || longValue == 6 || longValue == 9 || longValue == 11 || longValue == 12) {
                f10 += eVar.c();
            }
        }
        float a10 = b8.be.a(f10, 0.0f, 1.0f);
        if (z10 && (p7Var = this.S2) != null && p7Var.getVisibility() == 0) {
            a10 *= 1.0f - p7Var.getAlpha();
        }
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27954h5, this.J0);
        if (q10) {
            i3 = org.telegram.ui.ActionBar.k6.f27824a7;
        } else {
            i3 = org.telegram.ui.ActionBar.k6.f27971i5;
        }
        return i0.a.f(a10, w02, org.telegram.ui.ActionBar.k6.w0(i3, this.J0));
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 != org.telegram.messenger.hs.T0 && i3 != org.telegram.messenger.hs.W4 && i3 != org.telegram.messenger.hs.F1) {
            if (i3 == org.telegram.messenger.hs.f23230f5) {
                this.C1 = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0).H0();
                return;
            }
            return;
        }
        yh yhVar = this.f32284v3;
        if (yhVar != null) {
            yhVar.f();
        }
    }

    @Override
    public final void dismiss() {
        boolean z10;
        fh fhVar;
        dh dhVar;
        if (!this.f32275t2.q() && !this.J) {
            th thVar = this.f32275t2;
            hk hkVar = this.f32255o2;
            if (thVar == hkVar && hkVar != null && !hkVar.L && hkVar.Q0 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f32259p2 = z10;
            if (!z10 && (dhVar = this.f32299z2) != null) {
                org.telegram.messenger.g0.v1(dhVar.getEditText());
            }
            if (!this.f32259p2 && (fhVar = this.K2) != null) {
                org.telegram.messenger.g0.v1(fhVar.getEditText());
            }
            this.f32271s2.clear();
            org.telegram.ui.ActionBar.d2 d2Var = this.X1;
            if (d2Var == null) {
                d2Var = LaunchActivity.Q();
            }
            if (!this.f32297y4 && d2Var != null && this.f32275t2.getSelectedItemsCount() > 0 && !this.f32290x1) {
                if (!this.f32293x4) {
                    this.f32293x4 = true;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, d2Var.getParentActivity(), this.J0);
                    String M0 = org.telegram.messenger.bd.M0(2131751400, null);
                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                    s1Var.S = M0;
                    s1Var.U = org.telegram.messenger.bd.M0(2131751401, null);
                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751407, null), new kg(this, 1));
                    alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                    s1Var.setOnCancelListener(new qg(this, 0));
                    s1Var.O = new p0(this, 4);
                    s1Var.show();
                    TextView textView = (TextView) s1Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28122q7, this.J0);
                        return;
                    }
                    return;
                }
                return;
            }
            int i3 = 0;
            while (true) {
                th[] thVarArr = this.f32267r2;
                if (i3 >= thVarArr.length) {
                    break;
                }
                th thVar2 = thVarArr[i3];
                if (thVar2 != null && this.f32275t2 != thVar2) {
                    thVar2.q();
                }
                i3++;
            }
            org.telegram.messenger.g0.u3(this, i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27824a7, this.J0), 0), true, new kg(this, 11));
            if (d2Var != null) {
                org.telegram.messenger.g0.q3(this, d2Var.isLightStatusBar());
            }
            this.f32222d4 = false;
            super.dismiss();
            this.f32297y4 = false;
        }
    }

    public final void e1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bi.e1():void");
    }

    @Override
    public final boolean f0(MotionEvent motionEvent) {
        return this.f32275t2.o(motionEvent);
    }

    public final boolean f1() {
        if (this.U1) {
            th thVar = this.f32275t2;
            if (thVar == this.f32215b2 || thVar == this.f32235i2) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void h1(EditTextBoldCursor editTextBoldCursor, boolean z10) {
        long j10;
        zh zhVar = this.U3;
        if (zhVar != null && !this.f32260p3) {
            boolean g02 = zhVar.g0();
            this.f32260p3 = true;
            ci.v6 v6Var = new ci.v6(this, editTextBoldCursor, z10, 19);
            if (g02) {
                j10 = 200;
            } else {
                j10 = 0;
            }
            org.telegram.messenger.g0.i3(v6Var, j10);
        }
    }

    public final void i1() {
        if (this.f28616s0 != null && this.f28586b != null) {
            int d12 = d1(false);
            org.telegram.ui.ActionBar.k6.C1(d12, this.f28616s0);
            si.c cVar = this.B4;
            if (cVar.f54747b != d12) {
                cVar.a(d12);
                mh.f fVar = this.f32264q3;
                if (fVar != null) {
                    fVar.invalidate();
                }
                ch chVar = this.f32268r3;
                if (chVar != null) {
                    chVar.invalidate();
                }
            }
            L1();
            this.f28586b.invalidate();
        }
    }

    @Override
    public final boolean j0() {
        TL_wallet.walletTransaction wallettransaction;
        final hk hkVar = this.f32255o2;
        if (hkVar != null && this.f32275t2 == hkVar) {
            final ng ngVar = new ng(this, 1);
            int i3 = hkVar.f34416n;
            org.telegram.ui.Wallet.l9 l9Var = hkVar.S;
            bi biVar = hkVar.f38416b;
            AnimatorSet animatorSet = null;
            if (!hkVar.L && (wallettransaction = hkVar.Q0) != null && hkVar.R0 == null && hkVar.S0 == null) {
                if (hkVar.T0) {
                    org.telegram.ui.Wallet.w5 w5Var = new org.telegram.ui.Wallet.w5();
                    w5Var.setCurrentAccount(i3);
                    org.telegram.ui.ActionBar.d2 d2Var = biVar.X1;
                    if (d2Var != null && d2Var.presentFragment(w5Var, false, true)) {
                        org.telegram.ui.Wallet.aa aaVar = new org.telegram.ui.Wallet.aa(biVar.f28589c, biVar.f28586b, l9Var.getDiamondView(), w5Var, hkVar.Q0, new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        if (!hkVar.L) {
                                            ngVar.run();
                                            return;
                                        }
                                        return;
                                    default:
                                        if (!hkVar.L) {
                                            ngVar.run();
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, biVar);
                        hkVar.S0 = aaVar;
                        animatorSet = aaVar.f42201m;
                    }
                } else if (wallettransaction.localMessageId != 0) {
                    org.telegram.ui.Wallet.u6 diamondView = l9Var.getDiamondView();
                    if (diamondView.f43254f != null && diamondView.isShown() && diamondView.getAlpha() > 0.01f) {
                        org.telegram.ui.ActionBar.d2 d2Var2 = biVar.X1;
                        if (d2Var2 instanceof org.telegram.ui.wm) {
                            org.telegram.ui.wm wmVar = (org.telegram.ui.wm) d2Var2;
                            if (wmVar.getCurrentAccount() == i3 && wmVar.a() == hkVar.f34421r.f27150id && wmVar.f51325g4 == 0 && wmVar.getFragmentView() != null && wmVar.getFragmentView().isAttachedToWindow()) {
                                org.telegram.ui.Wallet.m6 m6Var = new org.telegram.ui.Wallet.m6(biVar.f28589c, biVar.f28586b, l9Var.getDiamondView(), wmVar, hkVar.Q0, new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                if (!hkVar.L) {
                                                    ngVar.run();
                                                    return;
                                                }
                                                return;
                                            default:
                                                if (!hkVar.L) {
                                                    ngVar.run();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                }, biVar);
                                hkVar.R0 = m6Var;
                                animatorSet = m6Var.f42854m;
                            }
                        }
                    }
                }
            }
            if (animatorSet != null) {
                this.A0 = animatorSet;
                this.B0 = 2;
                return true;
            }
        }
        return false;
    }

    public final void j1() {
        int i3 = 0;
        while (true) {
            th[] thVarArr = this.f32267r2;
            if (i3 >= thVarArr.length) {
                break;
            }
            th thVar = thVarArr[i3];
            if (thVar != null) {
                thVar.p();
            }
            i3++;
        }
        int i10 = this.E3;
        org.telegram.messenger.hs.f(i10).n(this, org.telegram.messenger.hs.T0);
        org.telegram.messenger.hs.f(i10).n(this, org.telegram.messenger.hs.W4);
        org.telegram.messenger.hs.f(i10).n(this, org.telegram.messenger.hs.f23230f5);
        org.telegram.messenger.hs.f(i10).n(this, org.telegram.messenger.hs.F1);
        this.N1 = true;
        dh dhVar = this.f32299z2;
        if (dhVar != null) {
            dhVar.o();
        }
        fh fhVar = this.K2;
        if (fhVar != null) {
            fhVar.o();
        }
    }

    @Override
    public final boolean k0(View view, int i3, int i10, int i11, int i12) {
        boolean z10;
        int L;
        int measuredWidth;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f32215b2;
        j71 j71Var = chatAttachAlertPhotoLayout.m0;
        ai.o2 o2Var = chatAttachAlertPhotoLayout.f31283k0;
        TextView textView = chatAttachAlertPhotoLayout.f31293q0;
        il ilVar = chatAttachAlertPhotoLayout.f31295r;
        int i13 = i11 - i3;
        int i14 = i12 - i10;
        if (i13 < i14) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i15 = org.telegram.messenger.g0.f22603n;
        if (view == o2Var) {
            if (z10) {
                if (ilVar.getVisibility() == 0) {
                    o2Var.layout(0, org.telegram.messenger.k5.z(222.0f, i12, i15), i13, org.telegram.messenger.k5.z(96.0f, i12, i15));
                    return true;
                }
                o2Var.layout(0, org.telegram.messenger.k5.z(126.0f, i12, i15), i13, i12 - i15);
                return true;
            } else if (ilVar.getVisibility() == 0) {
                o2Var.layout(org.telegram.messenger.k5.z(222.0f, i11, i15), 0, i11 - org.telegram.messenger.g0.L(96.0f), i14 - i15);
                return true;
            } else {
                o2Var.layout(org.telegram.messenger.k5.z(126.0f, i11, i15), 0, i11, i14 - i15);
                return true;
            }
        } else if (view == j71Var) {
            if (z10) {
                if (ilVar.getVisibility() == 0) {
                    j71Var.layout(0, org.telegram.messenger.k5.z(310.0f, i12, i15), i13, org.telegram.messenger.k5.z(260.0f, i12, i15));
                    return true;
                }
                j71Var.layout(0, org.telegram.messenger.k5.z(176.0f, i12, i15), i13, org.telegram.messenger.k5.z(126.0f, i12, i15));
                return true;
            } else if (ilVar.getVisibility() == 0) {
                j71Var.layout(org.telegram.messenger.k5.z(310.0f, i11, i15), 0, i11 - org.telegram.messenger.g0.L(260.0f), i14 - i15);
                return true;
            } else {
                j71Var.layout(org.telegram.messenger.k5.z(176.0f, i11, i15), 0, i11 - org.telegram.messenger.g0.L(126.0f), i14 - i15);
                return true;
            }
        } else if (view == textView) {
            if (z10) {
                L = (i13 - textView.getMeasuredWidth()) / 2;
                int L2 = i12 - org.telegram.messenger.g0.L(167.0f);
                textView.setRotation(0.0f);
                if (ilVar.getVisibility() == 0) {
                    L2 -= org.telegram.messenger.g0.L(96.0f);
                }
                measuredWidth = L2 - i15;
            } else {
                L = i11 - org.telegram.messenger.g0.L(167.0f);
                measuredWidth = (textView.getMeasuredWidth() / 2) + (i14 / 2);
                textView.setRotation(-90.0f);
                if (ilVar.getVisibility() == 0) {
                    L -= org.telegram.messenger.g0.L(96.0f);
                }
            }
            textView.layout(L, measuredWidth, textView.getMeasuredWidth() + L, textView.getMeasuredHeight() + measuredWidth);
            return true;
        } else if (view != ilVar) {
            return false;
        } else {
            if (z10) {
                int z11 = org.telegram.messenger.k5.z(88.0f, i14, i15);
                view.layout(0, z11, view.getMeasuredWidth(), view.getMeasuredHeight() + z11);
                return true;
            }
            int L3 = (i3 + i13) - org.telegram.messenger.g0.L(88.0f);
            view.layout(L3, 0, view.getMeasuredWidth() + L3, view.getMeasuredHeight());
            return true;
        }
    }

    public final void k1(TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        String p10;
        if (tL_attachMenuBot != null) {
            p10 = tL_attachMenuBot.short_name;
        } else {
            p10 = org.telegram.messenger.l10.p(user);
        }
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = org.telegram.messenger.li.b0(this.E3).f24011b.bots;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i3);
            i3++;
            if (tL_attachMenuBot2.bot_id == user.f27150id) {
                break;
            }
        }
        String a02 = org.telegram.messenger.bd.a0("BotRemoveFromMenu", null, 2131753002, p10);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        String M0 = org.telegram.messenger.bd.M0(2131753001, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.S = M0;
        if (tL_attachMenuBot == null) {
            a02 = org.telegram.messenger.bd.a0("BotRemoveInlineFromMenu", null, 2131753000, p10);
        }
        s1Var.U = org.telegram.messenger.g0.X2(a02);
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, "OK"), new aa.a(this, tL_attachMenuBot, user, 24));
        k2.p1.v("Cancel", 2131752589, alertDialog$Builder, null);
    }

    @Override
    public final boolean l0(View view, int i3, int i10) {
        boolean z10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f32215b2;
        sl slVar = chatAttachAlertPhotoLayout.f31302w;
        bi biVar = chatAttachAlertPhotoLayout.f38416b;
        il ilVar = chatAttachAlertPhotoLayout.f31295r;
        kg.y yVar = chatAttachAlertPhotoLayout.f31297s;
        if (i3 < i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (view == chatAttachAlertPhotoLayout.Q) {
            if (chatAttachAlertPhotoLayout.f31267c0 && !chatAttachAlertPhotoLayout.f31271e0) {
                chatAttachAlertPhotoLayout.Q.measure(View.MeasureSpec.makeMeasureSpec(biVar.T() + biVar.S() + i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
                return true;
            }
        } else {
            ai.o2 o2Var = chatAttachAlertPhotoLayout.f31283k0;
            if (view == o2Var) {
                if (z10) {
                    o2Var.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(126.0f), 1073741824));
                    return true;
                }
                o2Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(126.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
                return true;
            }
            j71 j71Var = chatAttachAlertPhotoLayout.m0;
            if (view == j71Var) {
                if (z10) {
                    j71Var.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824));
                    return true;
                }
                j71Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
                return true;
            } else if (view == ilVar) {
                chatAttachAlertPhotoLayout.K0 = true;
                if (z10) {
                    ilVar.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(80.0f), 1073741824));
                    if (yVar.f55509o != 0) {
                        ilVar.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                        yVar.j1(0);
                        slVar.f();
                    }
                } else {
                    ilVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(80.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
                    if (yVar.f55509o != 1) {
                        ilVar.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
                        yVar.j1(1);
                        slVar.f();
                    }
                }
                chatAttachAlertPhotoLayout.K0 = false;
                return true;
            }
        }
        return false;
    }

    public final void l1() {
        int i3 = 0;
        while (true) {
            th[] thVarArr = this.f32267r2;
            if (i3 < thVarArr.length) {
                th thVar = thVarArr[i3];
                if (thVar != null) {
                    thVar.A();
                }
                i3++;
            } else {
                this.f32214a4 = true;
                return;
            }
        }
    }

    @Override
    public final boolean m0() {
        int i3;
        this.f32215b2.setTranslationX(0.0f);
        this.i3.setAlpha(0.0f);
        this.f32230g3.setAlpha(1.0f);
        this.f28586b.setTranslationY(this.f28586b.getMeasuredHeight());
        AnimatorSet animatorSet = new AnimatorSet();
        this.f32247l4 = animatorSet;
        lh lhVar = this.f32240j4;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, lhVar, 0.0f, 400.0f));
        this.f32247l4.setDuration(400L);
        this.f32247l4.setStartDelay(20L);
        Float valueOf = Float.valueOf(0.0f);
        lhVar.getClass();
        lhVar.a(this, valueOf);
        this.f32247l4.start();
        ValueAnimator valueAnimator = this.C0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.D0, 1.0f);
        this.C0 = ofFloat;
        ofFloat.addUpdateListener(new lg(this, 2));
        q1.g gVar = this.f32243k4;
        if (gVar != null) {
            gVar.d();
        }
        q1.g gVar2 = new q1.g((Object) this.f28586b, (q1.e) q1.g.f53637p, 0.0f);
        this.f32243k4 = gVar2;
        if (this.C3 != null) {
            gVar2.f53653m.a(0.75f);
            this.f32243k4.f53653m.b(350.0f);
        } else {
            gVar2.f53653m.a(0.75f);
            this.f32243k4.f53653m.b(350.0f);
        }
        this.f32243k4.h();
        if (this.K) {
            this.f28589c.setLayerType(2, null);
        }
        this.B0 = 1;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.A0 = animatorSet2;
        i6 i6Var = k6.d;
        if (this.f28611p0) {
            i3 = this.f28612q0;
        } else {
            i3 = 0;
        }
        animatorSet2.playTogether(ObjectAnimator.ofInt(this.Z, i6Var, i3));
        this.A0.setDuration(400L);
        this.A0.setStartDelay(20L);
        this.A0.setInterpolator(this.f28607l0);
        g2.g gVar3 = new g2.g((int[]) null);
        e7 e7Var = new e7(this, gVar3, this.f28626z0, 5);
        this.f32243k4.a(new ii.z3(2, this, e7Var));
        this.A0.addListener(new bh.j(24, this, e7Var));
        gVar3.d();
        org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.f23249j1, 512);
        this.A0.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        z1(0.0f);
        ofFloat2.addUpdateListener(new lg(this, 3));
        ofFloat2.setStartDelay(25L);
        ofFloat2.setDuration(200L);
        ofFloat2.setInterpolator(xq.f40452f);
        ofFloat2.start();
        return true;
    }

    public final void m1() {
        int i3 = 0;
        this.f32214a4 = false;
        while (true) {
            th[] thVarArr = this.f32267r2;
            if (i3 >= thVarArr.length) {
                break;
            }
            th thVar = thVarArr[i3];
            if (thVar != null) {
                thVar.C();
            }
            i3++;
        }
        if (isShowing()) {
            this.U3.g0();
        }
        yh yhVar = this.f32284v3;
        if (yhVar != null) {
            yhVar.f();
        }
    }

    public final void n1() {
        org.telegram.messenger.zi ziVar = this.C3;
        org.telegram.ui.ActionBar.d2 d2Var = this.X1;
        int i3 = this.E3;
        if (ziVar != null && ziVar.q5() && !org.telegram.messenger.t3.z(i3, 24, org.telegram.messenger.zi.B0(this.C3.f26868k)) && (d2Var instanceof org.telegram.ui.wm)) {
            org.telegram.ui.wm wmVar = (org.telegram.ui.wm) d2Var;
            org.telegram.messenger.ej ejVar = wmVar.f51540x5;
            if (ejVar == null) {
                ejVar = org.telegram.messenger.ej.b(this.C3.f26868k.suggested_post);
            }
            if (!ci.e9.T(i3, ejVar.f22361a)) {
                wmVar.wc(ejVar);
                return;
            }
        }
        if (this.C1 - this.D1 < 0) {
            org.telegram.messenger.g0.F3(this.f32266r1);
            org.telegram.messenger.g0.F3(this.f32270s1);
            try {
                this.D2.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            if (!org.telegram.messenger.hp.s1(i3).D3() && org.telegram.messenger.hp.s1(i3).U4 > this.D1) {
                D1(d2Var);
                return;
            }
            return;
        }
        if (this.C3 == null && (d2Var instanceof org.telegram.ui.wm)) {
            org.telegram.ui.wm wmVar2 = (org.telegram.ui.wm) d2Var;
            if (wmVar2.c()) {
                t4.L(getContext(), wmVar2.a(), new kg(this, 14), this.J0);
                return;
            }
        }
        th thVar = this.f32275t2;
        if (thVar != this.f32215b2 && thVar != this.f32235i2) {
            if (!thVar.L(true, 0, 0, this.I2, f1())) {
                this.f32297y4 = true;
                dismiss();
                return;
            }
            return;
        }
        u1(true, 0, 0, this.I2, f1());
    }

    @Override
    public final void o0() {
        if (this.f32275t2.s()) {
            dismiss();
        }
    }

    public final void o1(int i3) {
        Activity activity;
        boolean z10 = true;
        org.telegram.ui.ActionBar.d2 d2Var = this.X1;
        if (i3 == 3) {
            if (this.I3 || !N0()) {
                if (d2Var != null) {
                    activity = d2Var.getParentActivity();
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
        } else if (i3 == 6 && org.telegram.messenger.g0.J1(d2Var)) {
            if (this.f32229g2 == null) {
                uk ukVar = new uk(this, getContext(), this.J0, (this.f32298z1 || this.M3) ? false : false);
                this.f32229g2 = ukVar;
                this.f32267r2[5] = ukVar;
                tk tkVar = this.f32269r4;
                if (tkVar != null) {
                    ukVar.setDelegate(tkVar);
                } else if (d2Var instanceof org.telegram.ui.wm) {
                    ukVar.setDelegate(new kg(this, 18));
                }
            }
            F1(this.f32229g2);
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.K1.getVisibility() == 0) {
            if (getOwnerActivity() != null) {
                getOwnerActivity().finish();
                return;
            }
            return;
        }
        p7 p7Var = this.S2;
        if (p7Var.f27728o0) {
            p7Var.l(true);
        } else if (this.f32275t2.k()) {
        } else {
            if (a1() != null && a1().f35191e) {
                a1().k(true);
            } else {
                super.onBackPressed();
            }
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        org.telegram.ui.ActionBar.d2 d2Var = this.X1;
        if (d2Var != null) {
            org.telegram.messenger.g0.q3(this, d2Var.isLightStatusBar());
        }
    }

    @Override
    public final boolean onKeyDown(int i3, KeyEvent keyEvent) {
        if (this.f32275t2.G(i3)) {
            return true;
        }
        return super.onKeyDown(i3, keyEvent);
    }

    @Override
    public final void onStart() {
        super.onStart();
        Context context = getContext();
        if ((context instanceof ContextWrapper) && !(context instanceof LaunchActivity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof LaunchActivity) {
            ((LaunchActivity) context).C0.add(this.K1);
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
            ((LaunchActivity) context).C0.remove(this.K1);
        }
    }

    public final void p1(boolean z10) {
        if (!this.I3 && z10) {
            bn bnVar = new bn(3, getContext(), this.J0, this);
            this.L1 = bnVar;
            F1(bnVar);
        }
        int i3 = 1;
        if (this.f32220d2 == null) {
            ni niVar = new ni(getContext(), this.J0, this);
            this.f32220d2 = niVar;
            this.f32267r2[3] = niVar;
            niVar.setupBlurredSearchField(this.C4);
            this.f32220d2.setDelegate(new kg(this, 15));
            if (this.f32298z1) {
                this.f32220d2.setMaxSelectedFiles(1);
            }
        }
        org.telegram.ui.ActionBar.d2 d2Var = this.X1;
        if (d2Var instanceof org.telegram.ui.wm) {
            TLRPC.Chat chat = ((org.telegram.ui.wm) d2Var).f51292e;
            ni niVar2 = this.f32220d2;
            if ((chat == null || org.telegram.messenger.t3.N(chat) || !chat.slowmode_enabled) && this.C3 == null) {
                i3 = -1;
            }
            niVar2.setMaxSelectedFiles(i3);
        }
        if (z10) {
            F1(this.f32220d2);
        }
    }

    public final void q1() {
        boolean z10;
        if (!this.L3) {
            bn bnVar = new bn(5, getContext(), this.J0, this);
            this.L1 = bnVar;
            F1(bnVar);
        }
        if (this.c2 == null) {
            ej ejVar = new ej(getContext(), this.J0, this);
            this.c2 = ejVar;
            this.f32267r2[2] = ejVar;
            ejVar.setupBlurredSearchField(this.C4);
            this.c2.setDelegate(new jh(this));
        }
        org.telegram.ui.ActionBar.d2 d2Var = this.X1;
        if (d2Var instanceof org.telegram.ui.wm) {
            TLRPC.Chat chat = ((org.telegram.ui.wm) d2Var).f51292e;
            ej ejVar2 = this.c2;
            if (chat != null && !org.telegram.messenger.t3.N(chat) && chat.slowmode_enabled) {
                z10 = false;
            } else {
                z10 = true;
            }
            ejVar2.setMultipleSelectionAllowed(z10);
        }
        F1(this.c2);
    }

    public final void r1(boolean z10) {
        int i3;
        if (!this.F3 && z10) {
            bn bnVar = new bn(4, getContext(), this.J0, this);
            this.L1 = bnVar;
            F1(bnVar);
        }
        boolean z11 = false;
        if (this.f32232h2 == null) {
            if (this.F1) {
                i3 = 2;
            } else {
                i3 = 0;
            }
            uj ujVar = new uj(i3, getContext(), this.J0, this);
            this.f32232h2 = ujVar;
            this.f32267r2[4] = ujVar;
            ujVar.setDelegate(new kh(this));
        }
        int i10 = 1;
        if (this.f32298z1) {
            this.f32232h2.setMaxSelectedFiles(1);
        } else {
            org.telegram.ui.ActionBar.d2 d2Var = this.X1;
            if (d2Var instanceof org.telegram.ui.wm) {
                TLRPC.Chat chat = ((org.telegram.ui.wm) d2Var).f51292e;
                uj ujVar2 = this.f32232h2;
                if ((chat == null || org.telegram.messenger.t3.N(chat) || !chat.slowmode_enabled) && this.C3 == null) {
                    i10 = -1;
                }
                ujVar2.setMaxSelectedFiles(i10);
            } else {
                this.f32232h2.setMaxSelectedFiles(this.N3);
                uj ujVar3 = this.f32232h2;
                if (!this.F1 && !this.O1) {
                    z11 = true;
                }
                ujVar3.setCanSelectOnlyImageFiles(z11);
            }
        }
        uj ujVar4 = this.f32232h2;
        ujVar4.f38766e0 = this.F1;
        if (z10) {
            F1(ujVar4);
        }
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            P0();
            eh.d dVar = this.T1;
            if (dVar != null) {
                dVar.updateColors();
            }
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27988j5, this.J0);
            org.telegram.ui.ActionBar.q0 q0Var = this.f32227f3;
            if (q0Var != null && w02 != this.f32250m4) {
                this.f32250m4 = w02;
                q0Var.setIconColor(w02);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void show() {
        boolean z10;
        super.show();
        this.D3 = false;
        org.telegram.ui.ActionBar.d2 d2Var = this.X1;
        if (d2Var instanceof org.telegram.ui.wm) {
            this.f28604i0 = ((org.telegram.ui.wm) d2Var).T9();
        }
        L1();
        this.f32253n3 = false;
        if (Build.VERSION.SDK_INT >= 30) {
            this.G0 = -1;
            int o10 = i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27824a7, this.J0), 0);
            this.H0 = o10;
            org.telegram.messenger.g0.u3(this, o10, false, null);
            if (org.telegram.messenger.g0.B(this.H0) > 0.721d) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.messenger.g0.n3(this, z10);
        }
        if (this.f32234h4) {
            this.f32234h4 = false;
            p7 p7Var = this.S2;
            p7Var.updateColors();
            p7Var.invalidate();
            i1();
        }
    }

    public final void t1() {
        ViewGroup viewGroup = this.f28586b;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
        p7 p7Var = this.S2;
        int i3 = 1;
        if (p7Var.f27728o0) {
            p7Var.l(true);
        }
        this.c2 = null;
        this.f32241k2 = null;
        this.f32220d2 = null;
        this.f32223e2 = null;
        this.f32226f2 = null;
        this.f32229g2 = null;
        this.f32232h2 = null;
        this.f32255o2 = null;
        while (true) {
            th[] thVarArr = this.f32267r2;
            if (i3 >= thVarArr.length) {
                break;
            }
            th thVar = thVarArr[i3];
            if (thVar != null) {
                thVar.p();
                this.f28586b.removeView(thVarArr[i3]);
                thVarArr[i3] = null;
            }
            i3++;
        }
        I1(false, false);
        super.K();
        if (this.f32259p2) {
            this.f32259p2 = false;
            this.f32263q2 = 0.0f;
            org.telegram.ui.ActionBar.d2 d2Var = this.X1;
            if (d2Var != null && d2Var.getFragmentView() != null) {
                View fragmentView = d2Var.getFragmentView();
                WeakHashMap weakHashMap = r0.i0.f54015a;
                r0.y.c(fragmentView);
            }
        }
    }

    @Override
    public final void u0(boolean z10) {
        this.f28614r0 = true;
    }

    public final boolean u1(final boolean z10, final int i3, final int i10, final long j10, final boolean z11) {
        if (this.D3) {
            return false;
        }
        org.telegram.ui.ActionBar.d2 d2Var = this.X1;
        if (d2Var instanceof org.telegram.ui.wm) {
            org.telegram.ui.wm wmVar = (org.telegram.ui.wm) d2Var;
            TLRPC.Chat chat = wmVar.f51292e;
            if (wmVar.j() != null || ((org.telegram.messenger.t3.T(chat) && chat.megagroup) || !org.telegram.messenger.t3.T(chat))) {
                SharedPreferences.Editor edit = org.telegram.messenger.hp.s1(this.E3).f22989d7.edit();
                edit.putBoolean("silent_" + wmVar.a(), !z10).commit();
            }
        }
        int i11 = 1;
        if (O0(a1().getText())) {
            return true;
        }
        M0();
        if (this.f32254o1.f53841f) {
            this.D3 = true;
            this.U3.o1(7, true, z10, i3, i10, j10, z11, false, 0L);
            return true;
        }
        long b12 = b1();
        th thVar = this.f32275t2;
        if (thVar != null) {
            i11 = thVar.getSelectedItemsCount();
        }
        return t4.a0(this.E3, b12, X0() + i11, new org.telegram.messenger.u10() {
            @Override
            public final void a(Object obj) {
                bi biVar = bi.this;
                biVar.D3 = true;
                biVar.U3.o1(7, true, z10, i3, i10, j10, z11, false, ((Long) obj).longValue());
            }
        }, 0L);
    }

    @Override
    public final void v() {
        if (this.X1 instanceof org.telegram.ui.wm) {
            String[] strArr = MediaController.W1;
        } else {
            String[] strArr2 = MediaController.W1;
        }
        this.f32275t2.x();
        org.telegram.messenger.g0.i2(org.telegram.messenger.bd.M0(2131754921, "AccDescrAttachButton"));
        this.f32253n3 = true;
        if (!this.H3 && !this.G3) {
            N0();
        }
    }

    public final void v1(boolean z10, boolean z11) {
        final boolean z12;
        boolean z13;
        final boolean z14;
        int i3;
        float f10;
        float f11;
        float measuredHeight;
        this.f32237j1.a(z10, z11);
        jt a12 = a1();
        this.U1 = z10;
        jt a13 = a1();
        int i10 = 0;
        if (this.f32295y2.getTag() != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        th thVar = this.f32275t2;
        if (thVar != this.f32215b2 && thVar != this.f32235i2) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (this.U1 && z13) {
            z14 = true;
        } else {
            z14 = false;
        }
        int i11 = 8;
        float f12 = 1.0f;
        ai.c0 c0Var = this.J2;
        lg.j jVar = this.f32291x2;
        float f13 = 0.0f;
        if (z11) {
            if (z12) {
                i11 = 0;
            }
            c0Var.setVisibility(i11);
            ViewPropertyAnimator animate = c0Var.animate();
            if (z14 && z12) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f11).setDuration(320L);
            xq xqVar = xq.h;
            duration.setInterpolator(xqVar).setUpdateListener(new lg(this, 0)).withEndAction(new Runnable(this) {
                public final bi f36149b;

                {
                    this.f36149b = this;
                }

                @Override
                public final void run() {
                    switch (r4) {
                        case 0:
                            bi biVar = this.f36149b;
                            if (!z14 || !z12) {
                                biVar.J2.setVisibility(8);
                            }
                            biVar.Q1();
                            return;
                        default:
                            if (z14 || !z12) {
                                this.f36149b.f32291x2.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            jVar.setVisibility(0);
            ViewPropertyAnimator animate2 = jVar.animate();
            if (!z14 && z12) {
                measuredHeight = 0.0f;
            } else {
                measuredHeight = jVar.getMeasuredHeight();
            }
            ViewPropertyAnimator translationY = animate2.translationY(measuredHeight);
            if (z14 || !z12) {
                f12 = 0.0f;
            }
            translationY.alpha(f12).setDuration(320L).setInterpolator(xqVar).setUpdateListener(new lg(this, 1)).withEndAction(new Runnable(this) {
                public final bi f36149b;

                {
                    this.f36149b = this;
                }

                @Override
                public final void run() {
                    switch (r4) {
                        case 0:
                            bi biVar = this.f36149b;
                            if (!z14 || !z12) {
                                biVar.J2.setVisibility(8);
                            }
                            biVar.Q1();
                            return;
                        default:
                            if (z14 || !z12) {
                                this.f36149b.f32291x2.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
        } else {
            if (z14 && z12) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            c0Var.setVisibility(i3);
            if (z14 && z12) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            c0Var.setAlpha(f10);
            Q1();
            if (z14 || !z12) {
                f12 = 0.0f;
            }
            jVar.setAlpha(f12);
            if (z14 || !z12) {
                f13 = jVar.getMeasuredHeight();
            }
            jVar.setTranslationY(f13);
            if (z14 || !z12) {
                i10 = 8;
            }
            jVar.setVisibility(i10);
        }
        if (a12 != a13) {
            a12.k(true);
            a13.setText(p5.cloneSpans(a12.getText()));
            a13.getEditText().setAllowTextEntitiesIntersection(a12.getEditText().getAllowTextEntitiesIntersection());
            if (a12.getEditText().isFocused()) {
                a13.getEditText().requestFocus();
                a13.getEditText().setSelection(a12.getEditText().getSelectionStart(), a12.getEditText().getSelectionEnd());
            }
        }
        org.telegram.messenger.g0.h3(new ng(this, 0));
    }

    public final void w1(int i3, org.telegram.messenger.zi ziVar) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        if (ziVar != null && (chatAttachAlertPhotoLayout = this.f32215b2) != null) {
            chatAttachAlertPhotoLayout.c0();
        }
        if (this.C3 == ziVar && this.B3 == i3) {
            return;
        }
        this.C3 = ziVar;
        if (ziVar != null && ziVar.A2()) {
            if (this.C3.J3()) {
                i3 = 2;
            } else if (this.C3.V2()) {
                i3 = 1;
            } else {
                i3 = 0;
            }
        }
        this.B3 = i3;
        if (this.C3 != null) {
            this.N3 = 1;
            this.O3 = false;
        } else {
            this.N3 = -1;
            this.O3 = true;
        }
        this.f32284v3.f();
        K1(0);
    }

    @Override
    public final boolean x() {
        return true;
    }

    public final void x1(float f10) {
        int i3;
        float translationY = this.f28586b.getTranslationY() - this.f32263q2;
        this.f32263q2 = this.f28586b.getHeight() * f10;
        this.f28586b.setTranslationY(translationY);
        hk hkVar = this.f32255o2;
        if (hkVar != null) {
            hkVar.setSendTransitionProgress(f10);
        }
        if (this.f28611p0) {
            i3 = Math.round((1.0f - f10) * this.f28612q0);
        } else {
            i3 = 0;
        }
        this.Z.setAlpha(i3);
        this.D0 = 1.0f - f10;
        this.f28589c.invalidate();
    }

    public final void y1(int i3, boolean z10) {
        if (this.C3 != null) {
            return;
        }
        this.N3 = i3;
        this.O3 = z10;
    }

    public final void z1(float f10) {
        boolean z10 = false;
        int o10 = i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27824a7, this.J0), Math.min(255, Math.max(0, (int) (f10 * 255.0f))));
        this.H0 = o10;
        org.telegram.messenger.g0.u3(this, o10, false, null);
        if (org.telegram.messenger.g0.B(this.H0) > 0.721d) {
            z10 = true;
        }
        org.telegram.messenger.g0.n3(this, z10);
        this.f28589c.invalidate();
    }

    @Override
    public final void F(float f10, int i3) {
    }

    public bi(Activity activity, org.telegram.ui.ActionBar.d2 d2Var, boolean z10, boolean z11) {
        this(activity, d2Var, z10, z11, true, null);
    }
}
