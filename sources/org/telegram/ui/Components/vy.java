package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public class vy extends FrameLayout implements org.telegram.ui.ActionBar.k6, fe.e, org.telegram.messenger.vs, hh.a {
    public static final int U2 = 0;
    public final rv A0;
    public int A1;
    public int A2;
    public final gw B0;
    public final ju B1;
    public ArrayList B2;
    public final hw C0;
    public final int C1;
    public int C2;
    public final ImageView D;
    public final bw D0;
    public final int[] D1;
    public long D2;
    public final ImageView E;
    public final cw E0;
    public int E1;
    public final fe.b E2;
    public AnimatorSet F;
    public ty F0;
    public int F1;
    public ArrayList F2;
    public AnimatorSet G;
    public final fw G0;
    public int G1;
    public Drawable G2;
    public float H;
    public final fh.c H0;
    public int H1;
    public int H2;
    public final zw I;
    public boolean I0;
    public int I1;
    public int I2;
    public final uw J;
    public boolean J0;
    public TLRPC.ChatFull J1;
    public int J2;
    public final fg.i K;
    public boolean K0;
    public boolean K1;
    public int K2;
    public final fh.a L;
    public final ox L0;
    public int L1;
    public boolean L2;
    public final fg.i M;
    public AnimatorSet M0;
    public final rf.b0 M1;
    public xa.n M2;
    public final fh.a N;
    public final ag.j3 N0;
    public boolean N1;
    public xa.n N2;
    public final View O;
    public bx O0;
    public int O1;
    public boolean O2;
    public final hx P;
    public boolean P0;
    public boolean P1;
    public AnimatorSet P2;
    public final vw Q;
    public final int[] Q0;
    public boolean Q1;
    public e2.m0 Q2;
    public final ex R;
    public final ObjectAnimator[] R0;
    public ey R1;
    public final nv R2;
    public final ux S;
    public boolean S0;
    public float S1;
    public boolean S2;
    public ty T;
    public mw T0;
    public float T1;
    public boolean T2;
    public final fh.c U;
    public boolean U0;
    public float U1;
    public final tv V;
    public boolean V0;
    public float V1;
    public AnimatorSet W;
    public String[] W0;
    public float W1;
    public final Drawable[] X0;
    public boolean X1;
    public final Drawable[] Y0;
    public final org.telegram.ui.ActionBar.k2 Y1;
    public final Drawable[] Z0;
    public final org.telegram.ui.ActionBar.p6 Z1;
    public final fe.b f31934a;
    public final wj0 f31935a0;
    public final String[] f31936a1;
    public final org.telegram.ui.ActionBar.e6 a2;
    public final fe.b f31937b;
    public final wj0 f31938b0;
    public final int f31939b1;
    public final org.telegram.ui.ActionBar.e6 f31940b2;
    public int f31941c;
    public boolean f31942c0;
    public final int f31943c1;
    public final boolean f31944c2;
    public final ArrayList d;
    public final boolean f31945d0;
    public final ArrayList f31946d1;
    public LongSparseArray f31947d2;
    public final ArrayList e;
    public boolean f31948e0;
    public int f31949e1;
    public PorterDuffColorFilter f31950e2;
    public boolean f31951f;
    public boolean f31952f0;
    public int f31953f1;
    public final ew f31954f2;
    public final vv f31955g0;
    public boolean f31956g1;
    public final pw f31957g2;
    public final iw h;
    public final wv f31958h0;
    public TLRPC.TL_messages_stickerSet f31959h1;
    public boolean f31960h2;
    public final ay f31961i0;
    public ArrayList f31962i1;
    public final boolean f31963i2;
    public final zx f31964j0;
    public ArrayList f31965j1;
    public final tg.f f31966j2;
    public final dy f31967k0;
    public ArrayList f31968k1;
    public final qg f31969k2;
    public final HashMap f31970l0;
    public ArrayList l1;
    public final hi.c f31971l2;
    public final rv m0;
    public final ArrayList f31972m1;
    public final tg.b f31973m2;
    public final FrameLayout f31974n;
    public final zx f31975n0;
    public final ArrayList f31976n1;
    public final ei.r f31977n2;
    public final yv f31978o0;
    public final ArrayList f31979o1;
    public boolean f31980o2;
    public final cx f31981p0;
    public final ArrayList f31982p1;
    public boolean f31983p2;
    public boolean f31984q0;
    public final ArrayList f31985q1;
    public int f31986q2;
    public final FrameLayout f31987r;
    public int f31988r0;
    public final HashMap f31989r1;
    public float f31990r2;
    public final FrameLayout f31991s;
    public int f31992s0;
    public final Paint f31993s1;
    public View f31994s2;
    public int f31995t0;
    public vx f31996t1;
    public int f31997t2;
    public boolean f31998u0;
    public long f31999u1;
    public int f32000u2;
    public boolean f32001v0;
    public boolean f32002v1;
    public long f32003v2;
    public final View f32004w;
    public boolean f32005w0;
    public boolean f32006w1;
    public boolean f32007w2;
    public final jc0 f32008x;
    public final zv f32009x0;
    public final TLRPC.StickerSetCovered[] f32010x1;
    public boolean f32011x2;
    public final jw f32012y;
    public final ny f32013y0;
    public final LongSparseArray f32014y1;
    public final Rect f32015y2;
    public final qy f32016z0;
    public final LongSparseArray f32017z1;
    public final GradientDrawable f32018z2;

    public vy(org.telegram.ui.ActionBar.k2 k2Var, boolean z10, boolean z11, boolean z12, Context context, boolean z13, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z14, final org.telegram.ui.ActionBar.p6 p6Var, boolean z15, boolean z16) {
        super(context);
        ex exVar;
        nv nvVar;
        boolean z17;
        int i10;
        boolean z18;
        final org.telegram.ui.ActionBar.p6 p6Var2;
        ei.r rVar;
        int i11;
        boolean z19;
        float f7;
        Field field;
        boolean z20;
        gr grVar = gr.h;
        this.f31934a = new fe.b(0, this, grVar, 320L, false);
        this.f31937b = new fe.b(1, this, grVar, 320L, false);
        this.f31941c = 2;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.e = new ArrayList();
        this.f31942c0 = true;
        this.f31967k0 = new dy(this);
        this.f31970l0 = new HashMap();
        this.f31984q0 = true;
        this.f31988r0 = -2;
        this.f31992s0 = -2;
        this.f31995t0 = -2;
        this.f31998u0 = true;
        this.f32005w0 = true;
        this.I0 = true;
        this.Q0 = new int[3];
        this.R0 = new ObjectAnimator[3];
        int i12 = org.telegram.messenger.e20.f15506s0;
        this.f31943c1 = i12;
        this.f31946d1 = new ArrayList();
        this.f31962i1 = new ArrayList();
        this.f31965j1 = new ArrayList();
        this.f31968k1 = new ArrayList();
        this.l1 = new ArrayList();
        this.f31972m1 = new ArrayList();
        this.f31976n1 = new ArrayList();
        new ArrayList();
        this.f31979o1 = new ArrayList();
        this.f31982p1 = new ArrayList();
        this.f31985q1 = new ArrayList();
        this.f31989r1 = new HashMap();
        this.f32010x1 = new TLRPC.StickerSetCovered[10];
        this.f32014y1 = new LongSparseArray();
        this.f32017z1 = new LongSparseArray();
        this.D1 = new int[2];
        this.F1 = -2;
        this.G1 = -2;
        this.H1 = -2;
        this.I1 = -2;
        this.L1 = -1;
        this.f31954f2 = new ew(this, 0);
        this.f31957g2 = new pw(this);
        this.f31960h2 = true;
        ei.r rVar2 = new ei.r();
        this.f31977n2 = rVar2;
        this.f31990r2 = -1.0f;
        this.f31997t2 = -1;
        this.f32000u2 = -1;
        this.f32003v2 = -1L;
        this.f32007w2 = false;
        this.f32011x2 = true;
        this.f32015y2 = new Rect();
        this.f32018z2 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.E2 = new fe.b(0, new ov(this, 3), grVar, 380L, true);
        this.R2 = new nv(this, 1);
        this.S2 = false;
        this.f31998u0 = z14;
        this.Y1 = k2Var;
        this.f31944c2 = z10;
        this.Z1 = p6Var;
        this.f31963i2 = z16;
        hi.c cVar = new hi.c();
        this.f31971l2 = cVar;
        cVar.a(A(org.telegram.ui.ActionBar.t6.f20930d6));
        if (z15) {
            u(true);
        }
        i0.b.o(A(org.telegram.ui.ActionBar.t6.Kl), 30);
        int L = org.telegram.messenger.i0.L(50.0f);
        this.f31939b1 = L;
        this.f31945d0 = z13;
        this.X0 = new Drawable[]{org.telegram.ui.ActionBar.t6.W(context, 2131232740, z16 ? w(0.4f) : A(org.telegram.ui.ActionBar.t6.Gf), z16 ? w(0.8f) : A(org.telegram.ui.ActionBar.t6.Df)), org.telegram.ui.ActionBar.t6.W(context, 2131232737, z16 ? w(0.4f) : A(org.telegram.ui.ActionBar.t6.Gf), z16 ? w(0.8f) : A(org.telegram.ui.ActionBar.t6.Df)), org.telegram.ui.ActionBar.t6.W(context, 2131232741, z16 ? w(0.4f) : A(org.telegram.ui.ActionBar.t6.Gf), z16 ? w(0.8f) : A(org.telegram.ui.ActionBar.t6.Df))};
        org.telegram.ui.ActionBar.e6 W = org.telegram.ui.ActionBar.t6.W(context, 2131232124, z16 ? w(0.4f) : A(org.telegram.ui.ActionBar.t6.Bf), z16 ? w(0.8f) : A(org.telegram.ui.ActionBar.t6.Df));
        org.telegram.ui.ActionBar.e6 W2 = org.telegram.ui.ActionBar.t6.W(context, 2131231064, z16 ? w(0.4f) : A(org.telegram.ui.ActionBar.t6.Bf), z16 ? w(0.8f) : A(org.telegram.ui.ActionBar.t6.Df));
        org.telegram.ui.ActionBar.e6 W3 = org.telegram.ui.ActionBar.t6.W(context, 2131231067, z16 ? w(0.4f) : A(org.telegram.ui.ActionBar.t6.Bf), z16 ? w(0.8f) : A(org.telegram.ui.ActionBar.t6.Df));
        org.telegram.ui.ActionBar.e6 W4 = org.telegram.ui.ActionBar.t6.W(context, 2131231065, z16 ? w(0.4f) : A(org.telegram.ui.ActionBar.t6.Bf), z16 ? w(0.8f) : A(org.telegram.ui.ActionBar.t6.Df));
        this.a2 = W4;
        int i13 = org.telegram.ui.ActionBar.t6.Ff;
        org.telegram.ui.ActionBar.e6 W5 = org.telegram.ui.ActionBar.t6.W(context, 2131231066, A(i13), A(i13));
        this.f31940b2 = W5;
        this.Y0 = new Drawable[]{W, W2, W3, new LayerDrawable(new Drawable[]{W4, W5})};
        this.Z0 = new Drawable[]{org.telegram.ui.ActionBar.t6.W(context, 2131232124, z16 ? w(0.4f) : A(org.telegram.ui.ActionBar.t6.Bf), z16 ? w(0.8f) : A(org.telegram.ui.ActionBar.t6.Df)), org.telegram.ui.ActionBar.t6.W(context, 2131232760, z16 ? w(0.4f) : A(org.telegram.ui.ActionBar.t6.Bf), z16 ? w(0.8f) : A(org.telegram.ui.ActionBar.t6.Df))};
        this.f31936a1 = new String[]{org.telegram.messenger.dd.L0(2131751196, null), org.telegram.messenger.dd.L0(2131751195, null), org.telegram.messenger.dd.L0(2131751194, null), org.telegram.messenger.dd.L0(2131751193, null), org.telegram.messenger.dd.L0(2131751192, null), org.telegram.messenger.dd.L0(2131751191, null), org.telegram.messenger.dd.L0(2131751190, null), org.telegram.messenger.dd.L0(2131751189, null)};
        this.J1 = chatFull;
        Paint paint = new Paint(1);
        this.f31993s1 = paint;
        paint.setColor(A(org.telegram.ui.ActionBar.t6.Pf));
        bi.d2 d2Var = rf.e0.f46537a;
        this.M1 = new rf.b0(org.telegram.messenger.i0.L(6.0f));
        uw uwVar = new uw(this, context);
        this.J = uwVar;
        ?? obj = new Object();
        obj.f30098a = 0;
        obj.f30099b = uwVar;
        arrayList.add(obj);
        if (z10) {
            org.telegram.messenger.vi.b0(i12).B(5);
            org.telegram.messenger.vi.b0(i12).w();
            this.f31950e2 = new PorterDuffColorFilter(A(org.telegram.ui.ActionBar.t6.Ci), PorterDuff.Mode.SRC_IN);
        }
        hx hxVar = new hx(this, context);
        this.P = hxVar;
        rVar2.b(hxVar);
        s4.j jVar = new s4.j();
        jVar.f47978c = 220L;
        jVar.e = 220L;
        jVar.f47979f = 160L;
        jVar.f47980g = 160L;
        jVar.f47981i = gr.f26524g;
        hxVar.setItemAnimator(jVar);
        hxVar.setOnTouchListener(new View.OnTouchListener(this) {
            public final vy f29556b;

            {
                this.f29556b = this;
            }

            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                switch (r3) {
                    case 0:
                        org.telegram.ui.kt p5 = org.telegram.ui.kt.p();
                        vy vyVar = this.f29556b;
                        hx hxVar2 = vyVar.P;
                        vyVar.getMeasuredHeight();
                        return p5.r(motionEvent, hxVar2, null, vyVar.f31957g2, p6Var);
                    case 1:
                        org.telegram.ui.kt p9 = org.telegram.ui.kt.p();
                        vy vyVar2 = this.f29556b;
                        return p9.r(motionEvent, vyVar2.f31958h0, vyVar2.m0, vyVar2.f31957g2, p6Var);
                    default:
                        org.telegram.ui.kt p10 = org.telegram.ui.kt.p();
                        vy vyVar3 = this.f29556b;
                        bw bwVar = vyVar3.D0;
                        vyVar3.getMeasuredHeight();
                        return p10.r(motionEvent, bwVar, vyVar3.A0, vyVar3.f31957g2, p6Var);
                }
            }
        });
        hxVar.setOnItemLongClickListener(new ov(this, 1));
        hxVar.setInstantClick(true);
        vw vwVar = new vw(this);
        this.Q = vwVar;
        hxVar.setLayoutManager(vwVar);
        hxVar.setTopGlowOffset(org.telegram.messenger.i0.L(38.0f));
        hxVar.setBottomGlowOffset(org.telegram.messenger.i0.L(36.0f));
        hxVar.setPadding(org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(36.0f), org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(44.0f));
        int i14 = org.telegram.ui.ActionBar.t6.f21286wf;
        org.telegram.ui.ActionBar.a7.m(hxVar, 21, i14, p6Var);
        hxVar.setItemSelectorColorProvider(new au(1));
        hxVar.setClipToPadding(false);
        vwVar.O = new ww(this);
        ex exVar2 = new ex(this);
        this.R = exVar2;
        hxVar.setAdapter(exVar2);
        hxVar.i(new mg.u1(this, 4));
        this.S = new ux(this, context);
        uwVar.addView(hxVar, w7.b6.c(-1.0f, -1));
        wj0 wj0Var = new wj0(hxVar, vwVar);
        this.f31938b0 = wj0Var;
        wj0Var.f32271i = new xw(this);
        hxVar.setOnScrollListener(new yw(this));
        if (k2Var != null) {
            exVar = exVar2;
            nvVar = new nv(this, 2);
            z17 = z10;
            i10 = -1;
            z18 = z16;
            rVar = rVar2;
            i11 = 5;
            p6Var2 = p6Var;
        } else {
            exVar = exVar2;
            nvVar = null;
            z17 = z10;
            i10 = -1;
            z18 = z16;
            p6Var2 = p6Var;
            rVar = rVar2;
            i11 = 5;
        }
        zw zwVar = new zw(this, context, p6Var2, z17, nvVar, z18);
        this.I = zwVar;
        if (z13) {
            tv tvVar = new tv(this, context);
            this.V = tvVar;
            uwVar.addView(tvVar, new FrameLayout.LayoutParams(i10, org.telegram.messenger.i0.f1() + L));
            tvVar.d.setOnFocusChangeListener(new uv(this));
            fh.c cVar2 = new fh.c(context, p6Var2);
            this.U = cVar2;
            cVar2.setVisibility(8);
            cVar2.setOnBackClickListener(new View.OnClickListener(this) {
                public final vy f29812b;

                {
                    this.f29812b = this;
                }

                @Override
                public final void onClick(View view) {
                    iy iyVar;
                    switch (r2) {
                        case 0:
                            ux uxVar = this.f29812b.S;
                            qx qxVar = uxVar.f31100c;
                            int childCount = qxVar.getChildCount();
                            for (int i15 = 0; i15 < childCount; i15++) {
                                ((fh.b) qxVar.getChildAt(i15)).a(false, true);
                            }
                            uxVar.d = 0L;
                            uxVar.F.f31937b.a(false, true);
                            uxVar.f();
                            return;
                        case 1:
                            qy qyVar = this.f29812b.f32016z0;
                            qx qxVar2 = qyVar.f29823c;
                            int childCount2 = qxVar2.getChildCount();
                            for (int i16 = 0; i16 < childCount2; i16++) {
                                ((fh.b) qxVar2.getChildAt(i16)).a(false, true);
                            }
                            qyVar.d = 0L;
                            qyVar.Q.f31934a.a(false, true);
                            qyVar.f();
                            return;
                        case 2:
                            vx vxVar = this.f29812b.f31996t1;
                            if (vxVar != null) {
                                vxVar.w();
                                return;
                            }
                            return;
                        default:
                            vy vyVar = this.f29812b;
                            int currentItem = vyVar.h.getCurrentItem();
                            if (currentItem == 0) {
                                iyVar = vyVar.V;
                            } else if (currentItem == 1) {
                                iyVar = vyVar.f31978o0;
                            } else {
                                iyVar = vyVar.G0;
                            }
                            if (iyVar != null) {
                                yp ypVar = iyVar.d;
                                ypVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                ypVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                ypVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                return;
                            }
                            return;
                    }
                }
            });
            uwVar.addView(cVar2, new FrameLayout.LayoutParams(i10, L));
        }
        if (Color.alpha(A(i14)) >= 255) {
            org.telegram.ui.ActionBar.a7.i(i14, zwVar, p6Var2);
        }
        exVar.G(true);
        zwVar.p(getEmojipacks());
        uwVar.addView(zwVar, w7.b6.c(36.0f, i10));
        View view = new View(context);
        this.O = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        int i15 = org.telegram.ui.ActionBar.t6.f21338zf;
        org.telegram.ui.ActionBar.a7.i(i15, view, p6Var2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i10, org.telegram.messenger.i0.f1(), 51);
        layoutParams.topMargin = org.telegram.messenger.i0.L(36.0f);
        uwVar.addView(view, layoutParams);
        fh.a aVar = new fh.a(context, p6Var2);
        this.L = aVar;
        fg.i iVar = new fg.i(context, p6Var2);
        this.K = iVar;
        iVar.setVisibility(8);
        iVar.addView(aVar, w7.b6.d(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
        uwVar.addView(iVar, w7.b6.e(i10, -2, 80));
        if (z11) {
            ul0 ul0Var = ul0.f31037b;
            if (z12) {
                vv vvVar = new vv(this, context);
                this.f31955g0 = vvVar;
                ?? obj2 = new Object();
                obj2.f30098a = 1;
                obj2.f30099b = vvVar;
                this.d.add(obj2);
                wv wvVar = new wv(this, context);
                this.f31958h0 = wvVar;
                rVar.b(wvVar);
                wvVar.setClipToPadding(false);
                ay ayVar = new ay(this);
                this.f31961i0 = ayVar;
                wvVar.setLayoutManager(ayVar);
                wvVar.i(new xv(this));
                wvVar.setPadding(0, L, 0, org.telegram.messenger.i0.L(44.0f) + this.f31986q2);
                ((s4.f1) wvVar.getItemAnimator()).f47938m = false;
                zx zxVar = new zx(this, context, true, Integer.MAX_VALUE);
                this.f31975n0 = zxVar;
                wvVar.setAdapter(zxVar);
                this.f31964j0 = new zx(this, context, false, 0);
                wvVar.setOnScrollListener(new uy(this, 2));
                wvVar.setOnTouchListener(new View.OnTouchListener(this) {
                    public final vy f29556b;

                    {
                        this.f29556b = this;
                    }

                    @Override
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        switch (r3) {
                            case 0:
                                org.telegram.ui.kt p5 = org.telegram.ui.kt.p();
                                vy vyVar = this.f29556b;
                                hx hxVar2 = vyVar.P;
                                vyVar.getMeasuredHeight();
                                return p5.r(motionEvent, hxVar2, null, vyVar.f31957g2, p6Var2);
                            case 1:
                                org.telegram.ui.kt p9 = org.telegram.ui.kt.p();
                                vy vyVar2 = this.f29556b;
                                return p9.r(motionEvent, vyVar2.f31958h0, vyVar2.m0, vyVar2.f31957g2, p6Var2);
                            default:
                                org.telegram.ui.kt p10 = org.telegram.ui.kt.p();
                                vy vyVar3 = this.f29556b;
                                bw bwVar = vyVar3.D0;
                                vyVar3.getMeasuredHeight();
                                return p10.r(motionEvent, bwVar, vyVar3.A0, vyVar3.f31957g2, p6Var2);
                        }
                    }
                });
                ?? r92 = new hk0(this) {
                    public final vy f30088b;

                    {
                        this.f30088b = this;
                    }

                    @Override
                    public final void f(int i16, View view2) {
                        int i17;
                        String str;
                        switch (r2) {
                            case 0:
                                vy vyVar = this.f30088b;
                                wv wvVar2 = vyVar.f31958h0;
                                zx zxVar2 = vyVar.f31964j0;
                                zx zxVar3 = vyVar.f31975n0;
                                if (vyVar.f31996t1 != null) {
                                    zxVar3.getClass();
                                    ArrayList arrayList2 = zxVar3.f33253y;
                                    if (wvVar2.getAdapter() == zxVar3) {
                                        if (i16 >= 0) {
                                            int i18 = zxVar3.H;
                                            if (i16 < i18) {
                                                vyVar.f31996t1.v(view2, vyVar.f31962i1.get(i16), null, "gif", true, 0, 0);
                                                return;
                                            }
                                            if (i18 > 0) {
                                                i17 = (i16 - i18) - 1;
                                            } else {
                                                i17 = i16;
                                            }
                                            if (i17 >= 0 && i17 < arrayList2.size()) {
                                                vyVar.f31996t1.v(view2, arrayList2.get(i17), null, zxVar3.f33248n, true, 0, 0);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    } else if (wvVar2.getAdapter() == zxVar2 && i16 >= 0 && i16 < zxVar2.f33253y.size()) {
                                        vyVar.f31996t1.v(view2, zxVar2.f33253y.get(i16), zxVar2.f33252x, zxVar2.f33248n, true, 0, 0);
                                        vyVar.X();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            default:
                                vy vyVar2 = this.f30088b;
                                s4.g0 adapter = vyVar2.D0.getAdapter();
                                qy qyVar = vyVar2.f32016z0;
                                if (adapter == qyVar) {
                                    str = qyVar.N;
                                } else {
                                    str = null;
                                }
                                String str2 = str;
                                if (view2 instanceof org.telegram.ui.Cells.d8) {
                                    org.telegram.ui.Cells.d8 d8Var = (org.telegram.ui.Cells.d8) view2;
                                    if (d8Var.getSticker() != null && org.telegram.messenger.kj.X3(d8Var.getSticker()) && !org.telegram.messenger.e20.i(org.telegram.messenger.c.a(vyVar2.f31943c1).f15043a).q()) {
                                        org.telegram.ui.kt.p().x(d8Var);
                                        return;
                                    }
                                    org.telegram.ui.kt.p().t();
                                    if (!d8Var.f21824r) {
                                        d8Var.f21824r = true;
                                        d8Var.f21823n = 0.5f;
                                        d8Var.f21828y = 0L;
                                        org.telegram.ui.Cells.c8 c8Var = d8Var.f21819a;
                                        c8Var.setAlpha(0.5f * d8Var.H);
                                        c8Var.invalidate();
                                        d8Var.f21825s = System.currentTimeMillis();
                                        d8Var.invalidate();
                                        vyVar2.f31996t1.m(d8Var, d8Var.getSticker(), str2, d8Var.getParentObject(), d8Var.getSendAnimationData(), true, 0);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                };
                this.m0 = r92;
                wvVar.setOnItemClickListener((hk0) r92);
                vvVar.addView(wvVar, w7.b6.c(-1.0f, -1));
                yv yvVar = new yv(this, context);
                this.f31978o0 = yvVar;
                vvVar.addView(yvVar, new FrameLayout.LayoutParams(-1, org.telegram.messenger.i0.f1() + L));
                cx cxVar = new cx(this, context, p6Var2);
                this.f31981p0 = cxVar;
                cxVar.setType(ul0Var);
                cxVar.setUnderlineHeight(org.telegram.messenger.i0.f1());
                cxVar.setIndicatorColor(A(i13));
                cxVar.setUnderlineColor(A(i15));
                org.telegram.ui.ActionBar.a7.i(i14, cxVar, p6Var2);
                W();
                cxVar.setDelegate(new ov(this, 2));
                zxVar.F("", "", true, true, true);
            }
            zv zvVar = new zv(this, context, z14);
            this.f32009x0 = zvVar;
            org.telegram.messenger.vi.b0(this.f31943c1).B(0);
            org.telegram.messenger.vi.b0(this.f31943c1).x();
            bw bwVar = new bw(this, context);
            this.D0 = bwVar;
            this.f31977n2.b(bwVar);
            cw cwVar = new cw(this);
            this.E0 = cwVar;
            bwVar.setLayoutManager(cwVar);
            cwVar.O = new dw(this);
            bwVar.setPadding(0, org.telegram.messenger.i0.L(36.0f), 0, org.telegram.messenger.i0.L(44.0f));
            bwVar.setClipToPadding(false);
            ?? obj3 = new Object();
            obj3.f30098a = 2;
            obj3.f30099b = zvVar;
            this.d.add(obj3);
            this.f32016z0 = new qy(this, context);
            ny nyVar = new ny(this, context);
            this.f32013y0 = nyVar;
            bwVar.setAdapter(nyVar);
            bwVar.setOnTouchListener(new View.OnTouchListener(this) {
                public final vy f29556b;

                {
                    this.f29556b = this;
                }

                @Override
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    switch (r3) {
                        case 0:
                            org.telegram.ui.kt p5 = org.telegram.ui.kt.p();
                            vy vyVar = this.f29556b;
                            hx hxVar2 = vyVar.P;
                            vyVar.getMeasuredHeight();
                            return p5.r(motionEvent, hxVar2, null, vyVar.f31957g2, p6Var2);
                        case 1:
                            org.telegram.ui.kt p9 = org.telegram.ui.kt.p();
                            vy vyVar2 = this.f29556b;
                            return p9.r(motionEvent, vyVar2.f31958h0, vyVar2.m0, vyVar2.f31957g2, p6Var2);
                        default:
                            org.telegram.ui.kt p10 = org.telegram.ui.kt.p();
                            vy vyVar3 = this.f29556b;
                            bw bwVar2 = vyVar3.D0;
                            vyVar3.getMeasuredHeight();
                            return p10.r(motionEvent, bwVar2, vyVar3.A0, vyVar3.f31957g2, p6Var2);
                    }
                }
            });
            ?? r42 = new hk0(this) {
                public final vy f30088b;

                {
                    this.f30088b = this;
                }

                @Override
                public final void f(int i16, View view2) {
                    int i17;
                    String str;
                    switch (r2) {
                        case 0:
                            vy vyVar = this.f30088b;
                            wv wvVar2 = vyVar.f31958h0;
                            zx zxVar2 = vyVar.f31964j0;
                            zx zxVar3 = vyVar.f31975n0;
                            if (vyVar.f31996t1 != null) {
                                zxVar3.getClass();
                                ArrayList arrayList2 = zxVar3.f33253y;
                                if (wvVar2.getAdapter() == zxVar3) {
                                    if (i16 >= 0) {
                                        int i18 = zxVar3.H;
                                        if (i16 < i18) {
                                            vyVar.f31996t1.v(view2, vyVar.f31962i1.get(i16), null, "gif", true, 0, 0);
                                            return;
                                        }
                                        if (i18 > 0) {
                                            i17 = (i16 - i18) - 1;
                                        } else {
                                            i17 = i16;
                                        }
                                        if (i17 >= 0 && i17 < arrayList2.size()) {
                                            vyVar.f31996t1.v(view2, arrayList2.get(i17), null, zxVar3.f33248n, true, 0, 0);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                } else if (wvVar2.getAdapter() == zxVar2 && i16 >= 0 && i16 < zxVar2.f33253y.size()) {
                                    vyVar.f31996t1.v(view2, zxVar2.f33253y.get(i16), zxVar2.f33252x, zxVar2.f33248n, true, 0, 0);
                                    vyVar.X();
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        default:
                            vy vyVar2 = this.f30088b;
                            s4.g0 adapter = vyVar2.D0.getAdapter();
                            qy qyVar = vyVar2.f32016z0;
                            if (adapter == qyVar) {
                                str = qyVar.N;
                            } else {
                                str = null;
                            }
                            String str2 = str;
                            if (view2 instanceof org.telegram.ui.Cells.d8) {
                                org.telegram.ui.Cells.d8 d8Var = (org.telegram.ui.Cells.d8) view2;
                                if (d8Var.getSticker() != null && org.telegram.messenger.kj.X3(d8Var.getSticker()) && !org.telegram.messenger.e20.i(org.telegram.messenger.c.a(vyVar2.f31943c1).f15043a).q()) {
                                    org.telegram.ui.kt.p().x(d8Var);
                                    return;
                                }
                                org.telegram.ui.kt.p().t();
                                if (!d8Var.f21824r) {
                                    d8Var.f21824r = true;
                                    d8Var.f21823n = 0.5f;
                                    d8Var.f21828y = 0L;
                                    org.telegram.ui.Cells.c8 c8Var = d8Var.f21819a;
                                    c8Var.setAlpha(0.5f * d8Var.H);
                                    c8Var.invalidate();
                                    d8Var.f21825s = System.currentTimeMillis();
                                    d8Var.invalidate();
                                    vyVar2.f31996t1.m(d8Var, d8Var.getSticker(), str2, d8Var.getParentObject(), d8Var.getSendAnimationData(), true, 0);
                                    return;
                                }
                                return;
                            }
                            return;
                    }
                }
            };
            this.A0 = r42;
            bwVar.setOnItemClickListener((hk0) r42);
            org.telegram.ui.ActionBar.a7.m(bwVar, 21, i14, p6Var2);
            zvVar.addView(bwVar);
            this.f31935a0 = new wj0(bwVar, cwVar);
            fw fwVar = new fw(this, context);
            this.G0 = fwVar;
            zvVar.addView(fwVar, new FrameLayout.LayoutParams(-1, org.telegram.messenger.i0.f1() + L));
            fh.c cVar3 = new fh.c(context, p6Var2);
            this.H0 = cVar3;
            cVar3.setVisibility(8);
            cVar3.setOnBackClickListener(new View.OnClickListener(this) {
                public final vy f29812b;

                {
                    this.f29812b = this;
                }

                @Override
                public final void onClick(View view2) {
                    iy iyVar;
                    switch (r2) {
                        case 0:
                            ux uxVar = this.f29812b.S;
                            qx qxVar = uxVar.f31100c;
                            int childCount = qxVar.getChildCount();
                            for (int i152 = 0; i152 < childCount; i152++) {
                                ((fh.b) qxVar.getChildAt(i152)).a(false, true);
                            }
                            uxVar.d = 0L;
                            uxVar.F.f31937b.a(false, true);
                            uxVar.f();
                            return;
                        case 1:
                            qy qyVar = this.f29812b.f32016z0;
                            qx qxVar2 = qyVar.f29823c;
                            int childCount2 = qxVar2.getChildCount();
                            for (int i16 = 0; i16 < childCount2; i16++) {
                                ((fh.b) qxVar2.getChildAt(i16)).a(false, true);
                            }
                            qyVar.d = 0L;
                            qyVar.Q.f31934a.a(false, true);
                            qyVar.f();
                            return;
                        case 2:
                            vx vxVar = this.f29812b.f31996t1;
                            if (vxVar != null) {
                                vxVar.w();
                                return;
                            }
                            return;
                        default:
                            vy vyVar = this.f29812b;
                            int currentItem = vyVar.h.getCurrentItem();
                            if (currentItem == 0) {
                                iyVar = vyVar.V;
                            } else if (currentItem == 1) {
                                iyVar = vyVar.f31978o0;
                            } else {
                                iyVar = vyVar.G0;
                            }
                            if (iyVar != null) {
                                yp ypVar = iyVar.d;
                                ypVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                ypVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                ypVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                return;
                            }
                            return;
                    }
                }
            });
            zvVar.addView(cVar3, new FrameLayout.LayoutParams(-1, L));
            z19 = z14;
            gw gwVar = new gw(this, context, p6Var2, k2Var, z19);
            this.B0 = gwVar;
            gwVar.setDragEnabled(true);
            gwVar.setWillNotDraw(false);
            gwVar.setType(ul0Var);
            gwVar.setUnderlineHeight(bwVar.canScrollVertically(-1) ? org.telegram.messenger.i0.f1() : 0);
            gwVar.setIndicatorColor(A(i13));
            gwVar.setUnderlineColor(A(i15));
            if (viewGroup != null && z19) {
                hw hwVar = new hw(this, context);
                this.C0 = hwVar;
                hwVar.addView(gwVar, w7.b6.e(-1, 36, 51));
                viewGroup.addView(hwVar, w7.b6.c(-2.0f, -1));
            } else {
                zvVar.addView(gwVar, w7.b6.e(-1, 36, 51));
            }
            Y(true);
            gwVar.setDelegate(new ov(this, 4));
            bwVar.setOnScrollListener(new uy(this, 0));
            fh.a aVar2 = new fh.a(context, p6Var2);
            this.N = aVar2;
            fg.i iVar2 = new fg.i(context, p6Var2);
            this.M = iVar2;
            iVar2.setVisibility(8);
            iVar2.addView(aVar2, w7.b6.d(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
            zvVar.addView(iVar2, w7.b6.e(-1, -2, 80));
        } else {
            z19 = z14;
        }
        this.e.clear();
        this.e.addAll(this.d);
        iw iwVar = new iw(this, context);
        this.h = iwVar;
        ei.r rVar3 = this.f31977n2;
        rVar3.getClass();
        iwVar.b(new ei.j(rVar3, iwVar));
        iwVar.setOverScrollMode(2);
        ox oxVar = new ox(this);
        this.L0 = oxVar;
        iwVar.setAdapter(oxVar);
        jw jwVar = new jw(this, context);
        this.f32012y = jwVar;
        jwVar.setHapticFeedbackEnabled(true);
        jwVar.setImageResource(2131232736);
        int w9 = z16 ? w(0.6f) : A(org.telegram.ui.ActionBar.t6.Gf);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        jwVar.setColorFilter(new PorterDuffColorFilter(w9, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        jwVar.setScaleType(scaleType);
        jwVar.setContentDescription(org.telegram.messenger.dd.L0(2131754920, null));
        jwVar.setFocusable(true);
        jwVar.setOnClickListener(new Object());
        w7.e6.a(jwVar);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f31987r = frameLayout;
        if (z13) {
            f7 = 40.0f;
            addView(frameLayout, w7.b6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, (org.telegram.messenger.i0.f1() / org.telegram.messenger.i0.f16171p) + 40.0f));
        } else {
            f7 = 40.0f;
            addView(frameLayout, w7.b6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f31991s = frameLayout2;
        addView(frameLayout2, w7.b6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 64.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f31974n = frameLayout3;
        View view2 = new View(context);
        this.f32004w = view2;
        frameLayout3.addView(view2, new FrameLayout.LayoutParams(-1, org.telegram.messenger.i0.L(f7), 83));
        if (z13) {
            addView(frameLayout3, w7.b6.e(-1, 48, 80));
            frameLayout3.addView(jwVar, w7.b6.d(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
            if (z11) {
                ImageView imageView = new ImageView(context);
                this.D = imageView;
                imageView.setImageResource(2131232739);
                imageView.setColorFilter(new PorterDuffColorFilter(z16 ? w(0.6f) : A(org.telegram.ui.ActionBar.t6.Gf), mode));
                imageView.setScaleType(scaleType);
                imageView.setFocusable(true);
                imageView.setContentDescription(org.telegram.messenger.dd.L0(2131745512, null));
                w7.e6.a(imageView);
                frameLayout3.addView(imageView, w7.b6.d(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
                imageView.setOnClickListener(new View.OnClickListener(this) {
                    public final vy f29812b;

                    {
                        this.f29812b = this;
                    }

                    @Override
                    public final void onClick(View view22) {
                        iy iyVar;
                        switch (r2) {
                            case 0:
                                ux uxVar = this.f29812b.S;
                                qx qxVar = uxVar.f31100c;
                                int childCount = qxVar.getChildCount();
                                for (int i152 = 0; i152 < childCount; i152++) {
                                    ((fh.b) qxVar.getChildAt(i152)).a(false, true);
                                }
                                uxVar.d = 0L;
                                uxVar.F.f31937b.a(false, true);
                                uxVar.f();
                                return;
                            case 1:
                                qy qyVar = this.f29812b.f32016z0;
                                qx qxVar2 = qyVar.f29823c;
                                int childCount2 = qxVar2.getChildCount();
                                for (int i16 = 0; i16 < childCount2; i16++) {
                                    ((fh.b) qxVar2.getChildAt(i16)).a(false, true);
                                }
                                qyVar.d = 0L;
                                qyVar.Q.f31934a.a(false, true);
                                qyVar.f();
                                return;
                            case 2:
                                vx vxVar = this.f29812b.f31996t1;
                                if (vxVar != null) {
                                    vxVar.w();
                                    return;
                                }
                                return;
                            default:
                                vy vyVar = this.f29812b;
                                int currentItem = vyVar.h.getCurrentItem();
                                if (currentItem == 0) {
                                    iyVar = vyVar.V;
                                } else if (currentItem == 1) {
                                    iyVar = vyVar.f31978o0;
                                } else {
                                    iyVar = vyVar.G0;
                                }
                                if (iyVar != null) {
                                    yp ypVar = iyVar.d;
                                    ypVar.requestFocus();
                                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                    ypVar.onTouchEvent(obtain);
                                    obtain.recycle();
                                    MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                    ypVar.onTouchEvent(obtain2);
                                    obtain2.recycle();
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            jc0 jc0Var = new jc0(context, p6Var2);
            this.f32008x = jc0Var;
            jc0Var.setViewPager(iwVar);
            jc0Var.setShouldExpand(false);
            jc0Var.setIndicatorHeight(org.telegram.messenger.i0.L(3.0f));
            jc0Var.setIndicatorColor(i0.b.o(A(org.telegram.ui.ActionBar.t6.Df), 20));
            jc0Var.setUnderlineHeight(0);
            jc0Var.setTabPaddingLeftRight(org.telegram.messenger.i0.L(11.0f));
            jc0Var.setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(11.0f));
            frameLayout3.addView(jc0Var, w7.b6.e(-2, 48, 81));
            jc0Var.setOnPageChangeListener(new lw(this, z19));
            ImageView imageView2 = new ImageView(context);
            this.E = imageView2;
            imageView2.setImageResource(2131232738);
            imageView2.setColorFilter(new PorterDuffColorFilter(z16 ? w(0.6f) : A(org.telegram.ui.ActionBar.t6.Gf), mode));
            imageView2.setScaleType(scaleType);
            imageView2.setContentDescription(org.telegram.messenger.dd.L0(2131745853, null));
            imageView2.setFocusable(true);
            imageView2.setVisibility(8);
            frameLayout3.addView(imageView2, w7.b6.d(48, 48.0f, 83, 2.0f, 0.0f, 2.0f, 0.0f));
            imageView2.setOnClickListener(new View.OnClickListener(this) {
                public final vy f29812b;

                {
                    this.f29812b = this;
                }

                @Override
                public final void onClick(View view22) {
                    iy iyVar;
                    switch (r2) {
                        case 0:
                            ux uxVar = this.f29812b.S;
                            qx qxVar = uxVar.f31100c;
                            int childCount = qxVar.getChildCount();
                            for (int i152 = 0; i152 < childCount; i152++) {
                                ((fh.b) qxVar.getChildAt(i152)).a(false, true);
                            }
                            uxVar.d = 0L;
                            uxVar.F.f31937b.a(false, true);
                            uxVar.f();
                            return;
                        case 1:
                            qy qyVar = this.f29812b.f32016z0;
                            qx qxVar2 = qyVar.f29823c;
                            int childCount2 = qxVar2.getChildCount();
                            for (int i16 = 0; i16 < childCount2; i16++) {
                                ((fh.b) qxVar2.getChildAt(i16)).a(false, true);
                            }
                            qyVar.d = 0L;
                            qyVar.Q.f31934a.a(false, true);
                            qyVar.f();
                            return;
                        case 2:
                            vx vxVar = this.f29812b.f31996t1;
                            if (vxVar != null) {
                                vxVar.w();
                                return;
                            }
                            return;
                        default:
                            vy vyVar = this.f29812b;
                            int currentItem = vyVar.h.getCurrentItem();
                            if (currentItem == 0) {
                                iyVar = vyVar.V;
                            } else if (currentItem == 1) {
                                iyVar = vyVar.f31978o0;
                            } else {
                                iyVar = vyVar.G0;
                            }
                            if (iyVar != null) {
                                yp ypVar = iyVar.d;
                                ypVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                ypVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                ypVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                return;
                            }
                            return;
                    }
                }
            });
        } else {
            addView(frameLayout3, w7.b6.d(56, 48.0f, (org.telegram.messenger.dd.X ? 3 : i11) | 80, 0.0f, 0.0f, 2.0f, 0.0f));
            org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.t6.j0(org.telegram.messenger.i0.L(56.0f), A(i14), A(i14));
            w7.e6.a(jwVar);
            jwVar.setPadding(0, 0, org.telegram.messenger.i0.L(2.0f), 0);
            jwVar.setBackground(j02);
            jwVar.setContentDescription(org.telegram.messenger.dd.L0(2131754920, null));
            jwVar.setFocusable(true);
            frameLayout3.addView(jwVar, w7.b6.d(48, 48.0f, 51, 2.0f, 0.0f, 2.0f, 0.0f));
            view2.setVisibility(8);
        }
        addView(iwVar, 0, w7.b6.e(-1, -1, 51));
        ag.j3 j3Var = new ag.j3(context, 21);
        this.N0 = j3Var;
        int L2 = org.telegram.messenger.i0.L(6.0f);
        int i16 = org.telegram.ui.ActionBar.t6.f20957eg;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(L2, A(i16));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i16);
        j3Var.setBackground(d02);
        org.telegram.ui.ActionBar.a7.k(j3Var, d02, N, null, p6Var2);
        org.telegram.ui.ActionBar.a7.V(j3Var, org.telegram.ui.ActionBar.t6.f20940dg, p6Var2);
        j3Var.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(7.0f));
        char c10 = 16;
        j3Var.setGravity(16);
        j3Var.setTextSize(1, 14.0f);
        j3Var.setVisibility(4);
        addView(j3Var, w7.b6.d(-2, -2.0f, 81, 5.0f, 0.0f, 5.0f, 53.0f));
        this.C1 = org.telegram.messenger.i0.L(org.telegram.messenger.i0.Q1() ? f7 : 32.0f);
        Field field2 = ju.f27573f;
        ju juVar = new ju(new iu(context, p6Var2));
        if (ju.f27573f == null) {
            try {
                field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
                try {
                    field.setAccessible(true);
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                field = null;
            }
            ju.f27573f = field;
        }
        Field field3 = ju.f27573f;
        if (field3 != null) {
            try {
                juVar.f27575a = (ViewTreeObserver.OnScrollChangedListener) field3.get(juVar);
                ju.f27573f.set(juVar, ju.f27574g);
            } catch (Exception unused3) {
                juVar.f27575a = null;
            }
        }
        this.B1 = juVar;
        juVar.f27577c.setOnSelectionUpdateListener(new d(this, 10));
        this.A1 = org.telegram.messenger.wp.c1().getInt("selected_page", 0);
        HashMap hashMap = org.telegram.messenger.k6.h;
        if (!org.telegram.messenger.k6.f16571k) {
            org.telegram.messenger.k6.f16571k = true;
            SharedPreferences c12 = org.telegram.messenger.wp.c1();
            try {
                hashMap.clear();
                if (c12.contains("emojis")) {
                    String string = c12.getString("emojis", "");
                    if (string != null && string.length() > 0) {
                        String[] split = string.split(",");
                        int length = split.length;
                        int i17 = 0;
                        while (i17 < length) {
                            String[] split2 = split[i17].split("=");
                            long longValue = Utilities.A(split2[0]).longValue();
                            char c11 = c10;
                            StringBuilder sb2 = new StringBuilder();
                            String[] strArr = split;
                            int i18 = length;
                            int i19 = 0;
                            while (i19 < 4) {
                                int i20 = i19;
                                sb2.insert(0, (char) longValue);
                                longValue >>= c11;
                                if (longValue == 0) {
                                    break;
                                }
                                i19 = i20 + 1;
                            }
                            if (sb2.length() > 0) {
                                hashMap.put(sb2.toString(), Utilities.z(split2[1]));
                            }
                            i17++;
                            c10 = c11;
                            split = strArr;
                            length = i18;
                        }
                    }
                    c12.edit().remove("emojis").commit();
                    org.telegram.messenger.k6.r();
                } else {
                    String string2 = c12.getString("emojis2", "");
                    if (string2 != null && string2.length() > 0) {
                        for (String str : string2.split(",")) {
                            String[] split3 = str.split("=");
                            hashMap.put(split3[0], Utilities.z(split3[1]));
                        }
                    }
                }
                if (hashMap.isEmpty() && !c12.getBoolean("filled_default", false)) {
                    int i21 = 0;
                    while (true) {
                        String[] strArr2 = org.telegram.messenger.k6.f16575o;
                        if (i21 >= strArr2.length) {
                            break;
                        }
                        hashMap.put(strArr2[i21], Integer.valueOf(strArr2.length - i21));
                        i21++;
                    }
                    c12.edit().putBoolean("filled_default", true).commit();
                    org.telegram.messenger.k6.r();
                }
                org.telegram.messenger.k6.s();
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
            try {
                String string3 = c12.getString("color", "");
                if (string3 != null && string3.length() > 0) {
                    for (String str2 : string3.split(",")) {
                        String[] split4 = str2.split("=");
                        org.telegram.messenger.k6.f16570j.put(split4[0], split4[1]);
                    }
                }
            } catch (Exception e7) {
                z20 = true;
                org.telegram.messenger.f8.g(e7, true);
            }
        }
        z20 = true;
        exVar.F(false);
        J(z20, z11, z12, false);
        if (Build.VERSION.SDK_INT >= 31) {
            tg.f fVar = new tg.f(false);
            this.f31966j2 = fVar;
            this.f31977n2.a(fVar);
            hi.f fVar2 = new hi.f(null);
            fVar2.f7720f = cVar;
            fVar2.d = fVar;
            fVar2.e = -2;
            tg.b bVar = new tg.b(fVar2, fVar2, fVar2);
            this.f31973m2 = bVar;
            bVar.f48715k = true;
            int L3 = org.telegram.messenger.i0.L(org.telegram.messenger.tc.e(262144) ? 8.0f : 48.0f);
            bVar.d = L3;
            bVar.e = L3;
            bVar.f48714j = this.f31977n2;
        } else {
            tg.b bVar2 = new tg.b(cVar, cVar, cVar);
            this.f31973m2 = bVar2;
            bVar2.f48714j = this.f31977n2;
            this.f31966j2 = null;
        }
        this.f31969k2 = new qg(this, 1);
        setBlurredBackgroundDrawableFactory(this.f31973m2);
        this.f31977n2.i(this);
        this.f31977n2.f6671a = new ov(this, 0);
    }

    public static void a(vy vyVar, boolean z10) {
        wv wvVar = vyVar.f31958h0;
        if (wvVar != null) {
            int childCount = wvVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = wvVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.h2) {
                    ImageReceiver photoImage = ((org.telegram.ui.Cells.h2) childAt).getPhotoImage();
                    if (z10) {
                        photoImage.f14409t0 = true;
                        photoImage.P0(false);
                    } else {
                        photoImage.f14409t0 = false;
                        photoImage.Q0();
                    }
                }
            }
        }
    }

    public static void b(vy vyVar, ey eyVar, String str) {
        String str2;
        String str3;
        boolean z10;
        String str4;
        vx vxVar;
        cc ccVar;
        org.telegram.ui.ActionBar.k2 k2Var = vyVar.Y1;
        int i10 = vyVar.f31943c1;
        ArrayList arrayList = vyVar.f31985q1;
        if (eyVar != null) {
            if (eyVar.getSpan() != null) {
                if (vyVar.f31996t1 != null) {
                    long j10 = eyVar.getSpan().documentId;
                    TLRPC.Document document = eyVar.getSpan().document;
                    ix ixVar = eyVar.e;
                    if (ixVar != null && ixVar.f27197i) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (document == null) {
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            ix ixVar2 = (ix) arrayList.get(i11);
                            int i12 = 0;
                            while (true) {
                                ArrayList arrayList2 = ixVar2.f27194c;
                                if (arrayList2 != null && i12 < arrayList2.size()) {
                                    if (((TLRPC.Document) ixVar2.f27194c.get(i12)).f19800id == j10) {
                                        document = (TLRPC.Document) ixVar2.f27194c.get(i12);
                                        break;
                                    }
                                    i12++;
                                }
                            }
                        }
                    }
                    if (document == null) {
                        document = f5.e(i10, j10);
                    }
                    TLRPC.Document document2 = document;
                    if (document2 != null) {
                        str4 = org.telegram.messenger.kj.U(document2);
                    } else {
                        str4 = null;
                    }
                    if (!org.telegram.messenger.kj.m3(document2) && !org.telegram.messenger.e20.i(i10).q() && (((vxVar = vyVar.f31996t1) == null || !vxVar.g()) && !vyVar.U0 && !z10)) {
                        vyVar.N(false);
                        if (k2Var != null) {
                            ccVar = cc.a0(k2Var);
                        } else {
                            ccVar = new cc(vyVar.f31987r, vyVar.Z1);
                        }
                        if (!vyVar.f31960h2 && k2Var != null) {
                            ccVar.K(2131624188, org.telegram.messenger.i0.W2(org.telegram.messenger.dd.L0(2131743888, null)), org.telegram.messenger.dd.L0(2131747833, null), new nv(vyVar, 4)).j();
                        } else {
                            ccVar.r(document2, org.telegram.messenger.i0.W2(org.telegram.messenger.dd.L0(2131743889, null)), org.telegram.messenger.dd.L0(2131747048, null), new nv(vyVar, 3)).j();
                        }
                        vyVar.f31960h2 = !vyVar.f31960h2;
                        return;
                    }
                    vyVar.D2 = SystemClock.elapsedRealtime();
                    vyVar.N(true);
                    vyVar.h("animated_" + j10);
                    vyVar.f31996t1.x(j10, document2, str4, eyVar.f25967c);
                    return;
                }
                return;
            }
            vyVar.D2 = SystemClock.elapsedRealtime();
            vyVar.N(true);
            if (str != null) {
                str2 = str;
            } else {
                str2 = (String) eyVar.getTag();
            }
            new SpannableStringBuilder().append((CharSequence) str2);
            if (str == null) {
                if (!eyVar.f25967c && (str3 = (String) org.telegram.messenger.k6.f16570j.get(str2)) != null) {
                    str2 = g(str2, str3);
                }
                vyVar.h(str2);
                vx vxVar2 = vyVar.f31996t1;
                if (vxVar2 != null) {
                    vxVar2.l(org.telegram.messenger.k6.c(str2));
                    return;
                }
                return;
            }
            vx vxVar3 = vyVar.f31996t1;
            if (vxVar3 != null) {
                vxVar3.l(org.telegram.messenger.k6.c(str));
            }
        }
    }

    public static void e(vy vyVar, int i10, int i11) {
        s4.c1 K;
        int[] iArr = vyVar.Q0;
        if (i10 == 1) {
            vyVar.n(i11, vyVar.P);
            return;
        }
        vx vxVar = vyVar.f31996t1;
        if ((vxVar == null || !vxVar.z()) && !vyVar.J0) {
            uk0 y3 = vyVar.y(i10);
            if (i11 > 0 && y3 != null && y3.getVisibility() == 0 && (K = y3.K(0)) != null && K.f47909a.getTop() + vyVar.f31939b1 >= y3.getPaddingTop()) {
                return;
            }
            int i12 = iArr[i10] - i11;
            iArr[i10] = i12;
            if (i12 > 0) {
                iArr[i10] = 0;
            } else if (i12 < (-org.telegram.messenger.i0.L(288.0f))) {
                iArr[i10] = -org.telegram.messenger.i0.L(288.0f);
            }
            if (i10 == 0) {
                vyVar.Z();
            } else {
                vyVar.z(i10).setTranslationY(Math.max(-org.telegram.messenger.i0.L(48.0f), iArr[i10]));
            }
        }
    }

    public static void f(vy vyVar, boolean z10) {
        int N0;
        ay ayVar = vyVar.f31961i0;
        yv yvVar = vyVar.f31978o0;
        wv wvVar = vyVar.f31958h0;
        if (wvVar != null && (wvVar.getAdapter() instanceof zx)) {
            zx zxVar = (zx) wvVar.getAdapter();
            if (!zxVar.f33250s && zxVar.h == 0 && !zxVar.f33253y.isEmpty() && (N0 = ayVar.N0()) != -1 && N0 > ayVar.B() - 5) {
                String str = zxVar.f33252x;
                String str2 = zxVar.f33249r;
                boolean z11 = zxVar.f33251w;
                zxVar.F(str, str2, true, z11, z11);
            }
        }
        vx vxVar = vyVar.f31996t1;
        if (vxVar != null && vxVar.z()) {
            boolean z12 = false;
            s4.c1 K = wvVar.K(0);
            if (K == null) {
                iy.a(yvVar, true, !z10);
                return;
            }
            if (K.f47909a.getTop() < wvVar.getPaddingTop()) {
                z12 = true;
            }
            iy.a(yvVar, z12, !z10);
        } else if (yvVar != null && wvVar != null) {
            yvVar.f27199a.a(true, !z10);
        }
    }

    public static String g(String str, String str2) {
        String str3;
        String str4;
        boolean z10 = true;
        if (org.telegram.messenger.k4.c(str) != null) {
            if (org.telegram.messenger.k4.c(str) == null) {
                return str;
            }
            if (str2 == null) {
                return "🤝";
            }
            if (str2.contains("\u200d")) {
                String[] split = str2.split("\u200d");
                StringBuilder sb2 = new StringBuilder("🫱");
                String str5 = "";
                if (split.length < 1) {
                    str4 = "";
                } else {
                    str4 = split[0];
                }
                sb2.append(str4);
                sb2.append("\u200d🫲");
                if (split.length >= 2) {
                    str5 = split[1];
                }
                sb2.append(str5);
                return sb2.toString();
            }
            return "🤝".concat(str2);
        }
        if (org.telegram.messenger.k6.b(str)) {
            str = c3.i0.m(2, 0, str);
        } else {
            z10 = false;
        }
        int length = str.length();
        if (length > 2 && str.charAt(str.length() - 2) == 8205) {
            str3 = str.substring(str.length() - 2);
            str = c3.i0.m(2, 0, str);
        } else if (length > 3 && str.charAt(str.length() - 3) == 8205) {
            str3 = str.substring(str.length() - 3);
            str = c3.i0.m(3, 0, str);
        } else {
            str3 = null;
        }
        String A = sc.e.A(str, str2);
        if (str3 != null) {
            A = sc.e.A(A, str3);
        }
        if (z10) {
            return sc.e.A(A, "\u200d➡");
        }
        return A;
    }

    public static void j(int i10, View view) {
        if (view == null) {
            return;
        }
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i10);
    }

    public final int A(int i10) {
        org.telegram.ui.ActionBar.p6 p6Var = this.Z1;
        if (p6Var != null) {
            return p6Var.h(i10);
        }
        return org.telegram.ui.ActionBar.t6.x0(null, i10, false);
    }

    public final void B() {
        fw fwVar = this.G0;
        if (fwVar != null) {
            fwVar.b();
        }
        yv yvVar = this.f31978o0;
        if (yvVar != null) {
            yvVar.b();
        }
        tv tvVar = this.V;
        if (tvVar != null) {
            tvVar.b();
        }
    }

    public final void C() {
        xa.n nVar = this.M2;
        if (nVar != null) {
            nVar.a();
            this.M2 = null;
        }
        xa.n nVar2 = this.N2;
        if (nVar2 != null) {
            nVar2.a();
            this.N2 = null;
            this.O2 = false;
        }
    }

    public final void D(boolean z10, boolean z11) {
        hy hyVar;
        boolean z12;
        if (this.A1 != 0 && this.f32006w1) {
            this.A1 = 0;
        }
        if (this.A1 == 0 && this.f32002v1) {
            this.A1 = 1;
        }
        int i10 = this.A1;
        iw iwVar = this.h;
        if (i10 != 0 && !z10 && this.e.size() != 1) {
            int i11 = this.A1;
            if (i11 == 1) {
                M(false, false);
                if (!this.f31998u0 && !this.f32001v0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                R(z12, false);
                if (iwVar.getCurrentItem() != 2) {
                    iwVar.x(2, false);
                }
                gw gwVar = this.B0;
                if (gwVar != null) {
                    this.S0 = true;
                    int i12 = this.G1;
                    if (i12 >= 0) {
                        gwVar.m(i12);
                    } else {
                        int i13 = this.F1;
                        if (i13 >= 0) {
                            gwVar.m(i13);
                        } else {
                            gwVar.m(this.E1);
                        }
                    }
                    this.S0 = false;
                    this.E0.h1(0, 0);
                }
            } else if (i11 == 2) {
                M(false, false);
                R(false, false);
                if (iwVar.getCurrentItem() != 1) {
                    iwVar.x(1, false);
                }
                cx cxVar = this.f31981p0;
                if (cxVar != null) {
                    cxVar.m(0);
                }
                yv yvVar = this.f31978o0;
                if (yvVar != null && (hyVar = yvVar.f27204r) != null) {
                    hyVar.I1(null);
                }
            }
        } else {
            M(true, false);
            R(false, false);
            if (iwVar.getCurrentItem() != 0) {
                iwVar.x(0, !z10);
            }
            if (z11) {
                org.telegram.messenger.i0.h3(new nv(this, 5), 350L);
            }
        }
        N(true);
    }

    public final void F() {
        ny nyVar = this.f32013y0;
        if (nyVar != null) {
            nyVar.f();
        }
        qy qyVar = this.f32016z0;
        if (qyVar != null) {
            qyVar.f();
        }
        if (org.telegram.ui.kt.p().E) {
            org.telegram.ui.kt.p().m();
        }
        org.telegram.ui.kt.p().t();
    }

    public final void G(int i10) {
        vx vxVar = this.f31996t1;
        if ((vxVar != null && vxVar.z()) || i10 == 0) {
            return;
        }
        HorizontalScrollView z10 = z(i10);
        this.Q0[i10] = 0;
        z10.setTranslationY(0);
    }

    public final void H(int i10, int i11) {
        vw vwVar = this.Q;
        View m10 = vwVar.m(i10);
        int L0 = vwVar.L0();
        int i12 = 1;
        if ((m10 == null && Math.abs(i10 - L0) > vwVar.J * 9.0f) || !org.telegram.messenger.uz.c()) {
            if (vwVar.L0() < i10) {
                i12 = 0;
            }
            wj0 wj0Var = this.f31938b0;
            wj0Var.f32267b = i12;
            wj0Var.d(i10, i11, false, false);
            return;
        }
        this.J0 = true;
        qw qwVar = new qw(this, this.P.getContext(), 0);
        qwVar.f48056a = i10;
        qwVar.f4253p = i11;
        vwVar.w0(qwVar);
    }

    public final void I(int i10, int i11) {
        cw cwVar = this.E0;
        View m10 = cwVar.m(i10);
        int L0 = cwVar.L0();
        int i12 = 1;
        if (m10 == null && Math.abs(i10 - L0) > 40) {
            if (cwVar.L0() < i10) {
                i12 = 0;
            }
            wj0 wj0Var = this.f31935a0;
            wj0Var.f32267b = i12;
            wj0Var.d(i10, i11, false, false);
            return;
        }
        this.J0 = true;
        this.D0.y0(i10);
    }

    public final void J(boolean z10, boolean z11, boolean z12, boolean z13) {
        ArrayList arrayList = this.e;
        arrayList.clear();
        boolean z14 = false;
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.d;
            if (i10 >= arrayList2.size()) {
                break;
            }
            if (((ry) arrayList2.get(i10)).f30098a == 0 && z10) {
                arrayList.add((ry) arrayList2.get(i10));
            }
            if (((ry) arrayList2.get(i10)).f30098a == 1 && z12) {
                arrayList.add((ry) arrayList2.get(i10));
            }
            if (((ry) arrayList2.get(i10)).f30098a == 2 && z11) {
                arrayList.add((ry) arrayList2.get(i10));
            }
            i10++;
        }
        jc0 jc0Var = this.f32008x;
        if (jc0Var != null) {
            if (arrayList.size() > 1) {
                z14 = true;
            }
            org.telegram.messenger.i0.Y3(jc0Var, z14, 1.0f, true, z13);
        }
        iw iwVar = this.h;
        if (iwVar != null) {
            iwVar.setAdapter(null);
            iwVar.setAdapter(this.L0);
            if (jc0Var != null) {
                jc0Var.setViewPager(iwVar);
            }
        }
    }

    public final void K(final fh.a aVar, final TLObject tLObject, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final boolean z10, boolean z11) {
        String G;
        qy qyVar;
        ux uxVar;
        if (stickerSet != null) {
            if (!z10 || (uxVar = this.S) == null || uxVar.d == stickerSet.f19821id) {
                if (!z10 && (qyVar = this.f32016z0) != null && qyVar.d != stickerSet.f19821id) {
                    return;
                }
                final boolean B0 = org.telegram.messenger.vi.b0(this.f31943c1).B0(stickerSet.f19821id, true);
                if (B0) {
                    if (stickerSet.masks) {
                        G = org.telegram.messenger.dd.G(stickerSet.count, "RemoveManyMasksCount", new Object[0]);
                    } else if (stickerSet.emojis) {
                        G = org.telegram.messenger.dd.G(stickerSet.count, "RemoveManyEmojiCount", new Object[0]);
                    } else {
                        G = org.telegram.messenger.dd.G(stickerSet.count, "RemoveManyStickersCount", new Object[0]);
                    }
                } else if (stickerSet.masks) {
                    G = org.telegram.messenger.dd.G(stickerSet.count, "AddManyMasksCount", new Object[0]);
                } else if (stickerSet.emojis) {
                    G = org.telegram.messenger.dd.G(stickerSet.count, "AddManyEmojiCount", new Object[0]);
                } else {
                    G = org.telegram.messenger.dd.G(stickerSet.count, "AddManyStickersCount", new Object[0]);
                }
                aVar.i(G, z11, true);
                aVar.f7096k0.a(!B0, z11);
                aVar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        int i10;
                        vy vyVar = vy.this;
                        org.telegram.messenger.vi b02 = org.telegram.messenger.vi.b0(vyVar.f31943c1);
                        Context context = vyVar.getContext();
                        if (B0) {
                            i10 = 0;
                        } else {
                            i10 = 2;
                        }
                        int i11 = i10;
                        org.telegram.ui.ActionBar.k2 k2Var = vyVar.Y1;
                        FrameLayout frameLayout = vyVar.f31991s;
                        fh.a aVar2 = aVar;
                        TLObject tLObject2 = tLObject;
                        TLRPC.StickerSet stickerSet2 = stickerSet;
                        TLRPC.Document document2 = document;
                        boolean z12 = z10;
                        b02.g2(context, tLObject2, document2, i11, k2Var, frameLayout, false, true, new i2.h1(vyVar, aVar2, tLObject2, stickerSet2, document2, z12, 6), false);
                        vyVar.K(aVar2, tLObject2, stickerSet2, document2, z12, true);
                    }
                });
            }
        }
    }

    public final void L(long j10, boolean z10, boolean z11) {
        int i10;
        View childAt;
        float f7;
        jc0 jc0Var = this.f32008x;
        if (jc0Var != null) {
            this.f32002v1 = z10;
            this.f32006w1 = z11;
            if (!z11 && !z10) {
                this.f31999u1 = 0L;
            } else {
                this.f31999u1 = j10;
            }
            if (z11) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            LinearLayout linearLayout = jc0Var.d;
            if (i10 >= linearLayout.getChildCount()) {
                childAt = null;
            } else {
                childAt = linearLayout.getChildAt(i10);
            }
            if (childAt != null) {
                if (this.f31999u1 != 0) {
                    f7 = 0.15f;
                } else {
                    f7 = 1.0f;
                }
                childAt.setAlpha(f7);
                iw iwVar = this.h;
                if (z11) {
                    if (this.f31999u1 != 0 && iwVar.getCurrentItem() != 0) {
                        M(true, true);
                        R(false, true);
                        iwVar.x(0, false);
                    }
                } else if (this.f31999u1 != 0 && iwVar.getCurrentItem() != 1) {
                    M(false, true);
                    R(false, true);
                    iwVar.x(1, false);
                }
            }
        }
    }

    public final void M(boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        float f12;
        jw jwVar = this.f32012y;
        if (!z10 || jwVar.getTag() != null) {
            if ((!z10 && jwVar.getTag() != null) || this.f31980o2) {
                return;
            }
            AnimatorSet animatorSet = this.F;
            Integer num = null;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.F = null;
            }
            if (!z10) {
                num = 1;
            }
            jwVar.setTag(num);
            int i10 = 0;
            float f13 = 0.0f;
            if (z11) {
                if (z10) {
                    jwVar.setVisibility(0);
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.F = animatorSet2;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(jwVar, View.ALPHA, f11);
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(jwVar, View.SCALE_X, f12);
                if (z10) {
                    f13 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(jwVar, View.SCALE_Y, f13));
                this.F.setDuration(200L);
                this.F.setInterpolator(gr.f26524g);
                this.F.addListener(new rw(this, z10, 0));
                this.F.start();
                return;
            }
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            jwVar.setAlpha(f7);
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            jwVar.setScaleX(f10);
            if (z10) {
                f13 = 1.0f;
            }
            jwVar.setScaleY(f13);
            if (!z10) {
                i10 = 4;
            }
            jwVar.setVisibility(i10);
        }
    }

    public final void N(boolean z10) {
        Integer num;
        this.H = 0.0f;
        vx vxVar = this.f31996t1;
        if (vxVar != null && vxVar.z()) {
            z10 = false;
        }
        FrameLayout frameLayout = this.f31974n;
        if (!z10 || frameLayout.getTag() != null) {
            if (!z10 && frameLayout.getTag() != null) {
                return;
            }
            if (z10) {
                num = null;
            } else {
                num = 1;
            }
            frameLayout.setTag(num);
            this.E2.a(z10, true);
        }
    }

    public final void O(boolean z10, boolean z11) {
        View view = this.O;
        if (!z10 || view.getTag() != null) {
            if (!z10 && view.getTag() != null) {
                return;
            }
            AnimatorSet animatorSet = this.W;
            Integer num = null;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.W = null;
            }
            if (!z10) {
                num = 1;
            }
            view.setTag(num);
            float f7 = 0.0f;
            if (z11) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.W = animatorSet2;
                if (z10) {
                    f7 = 1.0f;
                }
                animatorSet2.playTogether(ObjectAnimator.ofFloat(view, View.ALPHA, f7));
                this.W.setDuration(200L);
                this.W.setInterpolator(gr.f26524g);
                this.W.addListener(new w5(this, 24));
                this.W.start();
                return;
            }
            if (z10) {
                f7 = 1.0f;
            }
            view.setAlpha(f7);
        }
    }

    public final void P(boolean z10) {
        for (int i10 = 0; i10 < 3; i10++) {
            s4.r x10 = x(i10);
            int L0 = x10.L0();
            if (z10) {
                if (L0 == 1 || L0 == 2) {
                    x10.n0(0);
                    G(i10);
                }
            } else if (L0 == 0) {
                x10.h1(0, 0);
            }
        }
    }

    public final void Q(boolean z10, boolean z11, boolean z12) {
        float f7;
        float translationY;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.Chat L0 = org.telegram.messenger.wp.r1(this.f31943c1).L0(Long.valueOf(this.f31999u1));
        if (L0 != null) {
            ag.j3 j3Var = this.N0;
            if (z10) {
                if (!org.telegram.messenger.w3.N(L0) && (tL_chatBannedRights = L0.default_banned_rights) != null && (tL_chatBannedRights.send_stickers || (z11 && tL_chatBannedRights.send_plain))) {
                    org.telegram.ui.ActionBar.k2 k2Var = this.Y1;
                    if (!(k2Var instanceof org.telegram.ui.un) || !((org.telegram.ui.un) k2Var).W6()) {
                        if (z11) {
                            j3Var.setText(org.telegram.messenger.dd.L0(2131749555, null));
                        } else if (z12) {
                            j3Var.setText(org.telegram.messenger.dd.L0(2131749554, null));
                        } else {
                            j3Var.setText(org.telegram.messenger.dd.L0(2131749548, null));
                        }
                    } else {
                        return;
                    }
                } else {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights2 = L0.banned_rights;
                    if (tL_chatBannedRights2 == null) {
                        return;
                    }
                    if (org.telegram.messenger.i0.D1(tL_chatBannedRights2)) {
                        if (z11) {
                            j3Var.setText(org.telegram.messenger.dd.L0(2131753943, null));
                        } else if (z12) {
                            j3Var.setText(org.telegram.messenger.dd.L0(2131753969, null));
                        } else {
                            j3Var.setText(org.telegram.messenger.dd.L0(2131753934, null));
                        }
                    } else {
                        if (z11) {
                            j3Var.setText(org.telegram.messenger.dd.a0("AttachPlainRestricted", null, 2131753944, org.telegram.messenger.dd.v(L0.banned_rights.until_date)));
                        }
                        if (z12) {
                            j3Var.setText(org.telegram.messenger.dd.a0("AttachGifRestricted", null, 2131753970, org.telegram.messenger.dd.v(L0.banned_rights.until_date)));
                        } else {
                            j3Var.setText(org.telegram.messenger.dd.a0("AttachStickersRestricted", null, 2131753935, org.telegram.messenger.dd.v(L0.banned_rights.until_date)));
                        }
                    }
                }
                j3Var.setVisibility(0);
            }
            AnimatorSet animatorSet = this.P2;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.P2 = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.P2 = animatorSet2;
            float f10 = 1.0f;
            if (z10) {
                f7 = j3Var.getAlpha();
            } else {
                f7 = 1.0f;
            }
            float f11 = 0.0f;
            if (!z10) {
                f10 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(j3Var, View.ALPHA, f7, f10);
            if (z10) {
                translationY = org.telegram.messenger.i0.L(12.0f);
            } else {
                translationY = j3Var.getTranslationY();
            }
            if (!z10) {
                f11 = org.telegram.messenger.i0.L(12.0f);
            }
            animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(j3Var, View.TRANSLATION_Y, translationY, f11));
            e2.m0 m0Var = this.Q2;
            if (m0Var != null) {
                org.telegram.messenger.i0.r(m0Var);
            }
            if (z10) {
                e2.m0 m0Var2 = new e2.m0(this, z11, z12, 4);
                this.Q2 = m0Var2;
                org.telegram.messenger.i0.h3(m0Var2, 3500L);
            }
            this.P2.setDuration(320L);
            this.P2.setInterpolator(gr.h);
            this.P2.start();
        }
    }

    public final void R(boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        float f12;
        ImageView imageView = this.D;
        if (imageView != null && !this.f31983p2) {
            if (!z10 || imageView.getTag() != null) {
                if (z10 || imageView.getTag() == null) {
                    AnimatorSet animatorSet = this.G;
                    Integer num = null;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.G = null;
                    }
                    if (!z10) {
                        num = 1;
                    }
                    imageView.setTag(num);
                    int i10 = 0;
                    float f13 = 0.0f;
                    if (z11) {
                        if (z10) {
                            imageView.setVisibility(0);
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.G = animatorSet2;
                        if (z10) {
                            f11 = 1.0f;
                        } else {
                            f11 = 0.0f;
                        }
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, View.ALPHA, f11);
                        if (z10) {
                            f12 = 1.0f;
                        } else {
                            f12 = 0.0f;
                        }
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView, View.SCALE_X, f12);
                        if (z10) {
                            f13 = 1.0f;
                        }
                        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(imageView, View.SCALE_Y, f13));
                        this.G.setDuration(200L);
                        this.G.setInterpolator(gr.f26524g);
                        this.G.addListener(new rw(this, z10, 1));
                        this.G.start();
                        return;
                    }
                    if (z10) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    imageView.setAlpha(f7);
                    if (z10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    imageView.setScaleX(f10);
                    if (z10) {
                        f13 = 1.0f;
                    }
                    imageView.setScaleY(f13);
                    if (!z10) {
                        i10 = 4;
                    }
                    imageView.setVisibility(i10);
                }
            }
        }
    }

    public final void S() {
        int measuredHeight;
        int L;
        org.telegram.ui.ActionBar.k2 k2Var;
        View view = (View) getParent();
        if (view != null) {
            float y3 = getY();
            if (getLayoutParams().height > 0) {
                measuredHeight = getLayoutParams().height;
            } else {
                measuredHeight = getMeasuredHeight();
            }
            float f7 = y3 + measuredHeight;
            if ((!org.telegram.messenger.i0.E && ((k2Var = this.Y1) == null || !k2Var.isInBubbleMode())) || this.V0) {
                L = view.getHeight();
            } else {
                L = org.telegram.messenger.i0.L(1.0f);
            }
            float f10 = f7 - L;
            int i10 = (this.f31990r2 > 0.0f ? 1 : (this.f31990r2 == 0.0f ? 0 : -1));
            FrameLayout frameLayout = this.f31974n;
            if (i10 >= 0) {
                f10 += getMeasuredHeight() - this.f31990r2;
            } else if (frameLayout.getTop() - f10 < 0.0f || !this.f32011x2) {
                f10 = 0.0f;
            }
            float W1 = (-f10) + org.telegram.messenger.i0.W1(this.E2.e, org.telegram.messenger.i0.L(50.0f), -this.f31986q2);
            frameLayout.setTranslationY(W1);
            if (this.f31945d0) {
                this.f31987r.setTranslationY(W1);
            }
        }
    }

    public final void T() {
        iy iyVar;
        boolean z10;
        int A;
        boolean z11;
        int A2;
        int A3;
        int A4;
        int A5;
        int A6;
        int A7;
        int A8;
        int A9;
        iv ivVar;
        int A10;
        int A11;
        int A12;
        int A13;
        int A14;
        int A15;
        boolean z12 = this.f31998u0;
        View view = this.f32004w;
        if (!z12) {
            setBackground(null);
            view.setBackground(null);
        } else if (!org.telegram.messenger.i0.E && !this.N1) {
            int i10 = org.telegram.ui.ActionBar.t6.f21286wf;
            setBackgroundColor(A(i10));
            if (this.f31945d0) {
                view.setBackgroundColor(A(i10));
            }
        } else {
            Drawable background = getBackground();
            int A16 = A(org.telegram.ui.ActionBar.t6.f21286wf);
            if (background != null && (background != this.G2 || A16 != this.H2)) {
                this.G2 = background;
                this.H2 = A16;
                background.setColorFilter(new PorterDuffColorFilter(A16, PorterDuff.Mode.MULTIPLY));
            }
        }
        zw zwVar = this.I;
        if (zwVar != null) {
            if (this.f31998u0) {
                zwVar.setBackgroundColor(A(org.telegram.ui.ActionBar.t6.f21286wf));
                this.O.setBackgroundColor(A(org.telegram.ui.ActionBar.t6.f21338zf));
            } else {
                zwVar.setBackground(null);
            }
        }
        ju juVar = this.B1;
        if (juVar != null) {
            juVar.f27577c.a();
        }
        int i11 = 0;
        while (true) {
            iyVar = this.V;
            z10 = this.f31963i2;
            if (i11 >= 3) {
                break;
            }
            if (i11 == 0) {
                iyVar = this.G0;
            } else if (i11 != 1) {
                iyVar = this.f31978o0;
            }
            if (iyVar != null) {
                yp ypVar = iyVar.d;
                FrameLayout frameLayout = iyVar.f27203n;
                View view2 = iyVar.f27202f;
                if (this.f31998u0) {
                    view2.setBackgroundColor(A(org.telegram.ui.ActionBar.t6.f21286wf));
                } else {
                    view2.setBackground(null);
                }
                iyVar.e.setBackgroundColor(A(org.telegram.ui.ActionBar.t6.f21338zf));
                jm0 jm0Var = iyVar.f27201c;
                if (z10) {
                    A12 = w(0.4f);
                } else {
                    A12 = A(org.telegram.ui.ActionBar.t6.f21321yf);
                }
                jm0Var.a(A12);
                Drawable background2 = frameLayout.getBackground();
                if (z10) {
                    A13 = w(0.06f);
                } else {
                    A13 = A(org.telegram.ui.ActionBar.t6.xf);
                }
                org.telegram.ui.ActionBar.t6.C1(A13, background2);
                frameLayout.invalidate();
                if (z10) {
                    A14 = w(0.45f);
                } else {
                    A14 = A(org.telegram.ui.ActionBar.t6.f21321yf);
                }
                ypVar.setHintTextColor(A14);
                if (z10) {
                    A15 = w(0.8f);
                } else {
                    A15 = A(org.telegram.ui.ActionBar.t6.G6);
                }
                ypVar.setTextColor(A15);
            }
            i11++;
        }
        Paint paint = this.f31993s1;
        if (paint != null) {
            paint.setColor(A(org.telegram.ui.ActionBar.t6.Pf));
        }
        hx hxVar = this.P;
        if (hxVar != null) {
            hxVar.setGlowColor(A(org.telegram.ui.ActionBar.t6.f21286wf));
        }
        bw bwVar = this.D0;
        if (bwVar != null) {
            bwVar.setGlowColor(A(org.telegram.ui.ActionBar.t6.f21286wf));
        }
        gw gwVar = this.B0;
        if (gwVar != null) {
            gwVar.setIndicatorColor(A(org.telegram.ui.ActionBar.t6.Ff));
            gwVar.setUnderlineColor(A(org.telegram.ui.ActionBar.t6.f21338zf));
            if (this.f31998u0) {
                gwVar.setBackgroundColor(A(org.telegram.ui.ActionBar.t6.f21286wf));
            } else {
                gwVar.setBackground(null);
            }
        }
        cx cxVar = this.f31981p0;
        if (cxVar != null) {
            cxVar.setIndicatorColor(A(org.telegram.ui.ActionBar.t6.Ff));
            cxVar.setUnderlineColor(A(org.telegram.ui.ActionBar.t6.f21338zf));
            if (this.f31998u0) {
                cxVar.setBackgroundColor(A(org.telegram.ui.ActionBar.t6.f21286wf));
            } else {
                cxVar.setBackground(null);
            }
        }
        if (z10) {
            A = w(0.6f);
        } else {
            A = A(org.telegram.ui.ActionBar.t6.Gf);
        }
        if (A != this.I2) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.I2 = A;
        jw jwVar = this.f32012y;
        if (jwVar != null) {
            if (z11) {
                jwVar.setColorFilter(new PorterDuffColorFilter(A, PorterDuff.Mode.MULTIPLY));
            }
            if (iyVar == null) {
                Drawable background3 = jwVar.getBackground();
                int i12 = org.telegram.ui.ActionBar.t6.f21286wf;
                org.telegram.ui.ActionBar.t6.H1(background3, A(i12), false);
                org.telegram.ui.ActionBar.t6.H1(jwVar.getBackground(), A(i12), true);
            }
        }
        ImageView imageView = this.D;
        if (imageView != null && z11) {
            imageView.setColorFilter(new PorterDuffColorFilter(A, PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.E;
        if (imageView2 != null && z11) {
            imageView2.setColorFilter(new PorterDuffColorFilter(A, PorterDuff.Mode.MULTIPLY));
        }
        ag.j3 j3Var = this.N0;
        if (j3Var != null) {
            if (j3Var.getBackground() instanceof ShapeDrawable) {
                ((ShapeDrawable) j3Var.getBackground()).getPaint().setColor(A(org.telegram.ui.ActionBar.t6.f20957eg));
                j3Var.invalidate();
            }
            j3Var.setTextColor(A(org.telegram.ui.ActionBar.t6.f20940dg));
        }
        zx zxVar = this.f31964j0;
        if (zxVar != null) {
            cy cyVar = zxVar.e;
            int i13 = org.telegram.ui.ActionBar.t6.Af;
            int A17 = A(i13);
            if (A17 != this.J2) {
                this.J2 = A17;
                cyVar.f25293a.setColorFilter(new PorterDuffColorFilter(A17, PorterDuff.Mode.MULTIPLY));
            }
            cyVar.f25294b.setTextColor(A(i13));
            cyVar.f25295c.setProgressColor(A(org.telegram.ui.ActionBar.t6.f21003h6));
        }
        int A18 = A(org.telegram.ui.ActionBar.t6.Ci);
        if (this.f31950e2 == null || A18 != this.K2) {
            this.K2 = A18;
            this.f31950e2 = new PorterDuffColorFilter(A18, PorterDuff.Mode.SRC_IN);
        }
        int i14 = 0;
        while (true) {
            Drawable[] drawableArr = this.X0;
            if (i14 >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i14];
            if (z10) {
                A10 = w(0.4f);
            } else {
                A10 = A(org.telegram.ui.ActionBar.t6.Cf);
            }
            org.telegram.ui.ActionBar.t6.E1(drawable, A10, false);
            Drawable drawable2 = drawableArr[i14];
            if (z10) {
                A11 = w(0.8f);
            } else {
                A11 = A(org.telegram.ui.ActionBar.t6.Df);
            }
            org.telegram.ui.ActionBar.t6.E1(drawable2, A11, true);
            i14++;
        }
        if (zwVar != null && (ivVar = zwVar.D) != null) {
            ivVar.d();
        }
        int i15 = 0;
        while (true) {
            Drawable[] drawableArr2 = this.Y0;
            if (i15 >= drawableArr2.length) {
                break;
            }
            Drawable drawable3 = drawableArr2[i15];
            if (z10) {
                A8 = w(0.4f);
            } else {
                A8 = A(org.telegram.ui.ActionBar.t6.Bf);
            }
            org.telegram.ui.ActionBar.t6.E1(drawable3, A8, false);
            Drawable drawable4 = drawableArr2[i15];
            if (z10) {
                A9 = w(0.8f);
            } else {
                A9 = A(org.telegram.ui.ActionBar.t6.Df);
            }
            org.telegram.ui.ActionBar.t6.E1(drawable4, A9, true);
            i15++;
        }
        int i16 = 0;
        while (true) {
            Drawable[] drawableArr3 = this.Z0;
            if (i16 >= drawableArr3.length) {
                break;
            }
            Drawable drawable5 = drawableArr3[i16];
            if (z10) {
                A6 = w(0.4f);
            } else {
                A6 = A(org.telegram.ui.ActionBar.t6.Bf);
            }
            org.telegram.ui.ActionBar.t6.E1(drawable5, A6, false);
            Drawable drawable6 = drawableArr3[i16];
            if (z10) {
                A7 = w(0.8f);
            } else {
                A7 = A(org.telegram.ui.ActionBar.t6.Df);
            }
            org.telegram.ui.ActionBar.t6.E1(drawable6, A7, true);
            i16++;
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.a2;
        if (e6Var != null) {
            if (z10) {
                A4 = w(0.4f);
            } else {
                A4 = A(org.telegram.ui.ActionBar.t6.Cf);
            }
            org.telegram.ui.ActionBar.t6.E1(e6Var, A4, false);
            if (z10) {
                A5 = w(0.8f);
            } else {
                A5 = A(org.telegram.ui.ActionBar.t6.Df);
            }
            org.telegram.ui.ActionBar.t6.E1(e6Var, A5, true);
        }
        org.telegram.ui.ActionBar.e6 e6Var2 = this.f31940b2;
        if (e6Var2 != null) {
            if (z10) {
                A2 = w(0.4f);
            } else {
                A2 = A(org.telegram.ui.ActionBar.t6.Ff);
            }
            org.telegram.ui.ActionBar.t6.E1(e6Var2, A2, false);
            if (z10) {
                A3 = w(0.8f);
            } else {
                A3 = A(org.telegram.ui.ActionBar.t6.Ff);
            }
            org.telegram.ui.ActionBar.t6.E1(e6Var2, A3, true);
        }
    }

    public final void U() {
        hx hxVar = this.P;
        if (hxVar != null) {
            for (int i10 = 0; i10 < hxVar.getChildCount(); i10++) {
                View childAt = hxVar.getChildAt(i10);
                if (childAt instanceof mx) {
                    ((mx) childAt).a(true);
                }
            }
        }
    }

    public final void V(int i10) {
        int i11;
        if (!this.f31952f0) {
            int i12 = -1;
            if (i10 != -1) {
                int size = getRecentEmoji().size() + (this.f31945d0 ? 1 : 0);
                ex exVar = this.R;
                int i13 = exVar.f25956c;
                ArrayList arrayList = exVar.f25963y;
                int i14 = 0;
                if (i13 >= 0) {
                    i11 = 3;
                } else {
                    i11 = 0;
                }
                int i15 = size + i11;
                if (i10 >= i15) {
                    int i16 = 0;
                    while (true) {
                        String[][] strArr = org.telegram.messenger.l6.f16894f;
                        if (i16 >= 8) {
                            break;
                        }
                        i15 += strArr[i16].length + 1;
                        if (i10 < i15) {
                            i12 = i16 + 1;
                            break;
                        }
                        i16++;
                    }
                    if (i12 < 0) {
                        ArrayList<ix> emojipacks = getEmojipacks();
                        int size2 = arrayList.size() - 1;
                        while (true) {
                            if (size2 < 0) {
                                break;
                            } else if (((Integer) arrayList.get(size2)).intValue() <= i10) {
                                ix ixVar = (ix) this.f31985q1.get(size2);
                                while (i14 < emojipacks.size()) {
                                    long j10 = emojipacks.get(i14).f27193b.f19821id;
                                    long j11 = ixVar.f27193b.f19821id;
                                    if (j10 == j11 && (!ixVar.f27196g || (!ixVar.f27195f && !this.f31982p1.contains(Long.valueOf(j11))))) {
                                        char[] cArr = org.telegram.messenger.l6.f16891a;
                                        i14 = 9 + i14;
                                        break;
                                    }
                                    i14++;
                                }
                            } else {
                                size2--;
                            }
                        }
                    }
                    i14 = i12;
                }
                if (i14 >= 0) {
                    this.I.j(i14, true);
                }
            }
        }
    }

    public final void W() {
        boolean z10;
        boolean z11;
        int i10;
        hy hyVar;
        int i11;
        boolean z12;
        boolean z13;
        cx cxVar = this.f31981p0;
        int currentPosition = cxVar.getCurrentPosition();
        int i12 = this.f31988r0;
        if (currentPosition == i12) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i12 >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean isEmpty = this.f31962i1.isEmpty();
        cxVar.d(false);
        this.f31988r0 = -2;
        this.f31992s0 = -2;
        this.f31995t0 = -2;
        Drawable[] drawableArr = this.Z0;
        if (!isEmpty) {
            this.f31988r0 = 0;
            cxVar.b(0, drawableArr[0]).setContentDescription(org.telegram.messenger.dd.L0(2131746379, null));
            i10 = 1;
        } else {
            i10 = 0;
        }
        this.f31992s0 = i10;
        cxVar.b(1, drawableArr[1]).setContentDescription(org.telegram.messenger.dd.L0(2131750835, null));
        this.f31995t0 = i10 + 1;
        org.telegram.messenger.i0.L(13.0f);
        org.telegram.messenger.i0.L(11.0f);
        int i13 = this.f31943c1;
        ArrayList arrayList = org.telegram.messenger.wp.r1(i13).f19109d4;
        int size = arrayList.size();
        int i14 = 0;
        while (i14 < size) {
            String str = (String) arrayList.get(i14);
            org.telegram.messenger.g6 g10 = org.telegram.messenger.k6.g(str);
            if (g10 != null) {
                TLRPC.Document T = org.telegram.messenger.vi.b0(i13).T(str);
                String i15 = i0.a.i(i14 + 3, "tab");
                int i16 = cxVar.f31343y;
                cxVar.f31343y = i16 + 1;
                kw0 kw0Var = (kw0) cxVar.f31332n.get(i15);
                if (kw0Var != null) {
                    cxVar.g(i15, kw0Var, i16);
                    i11 = currentPosition;
                    z12 = z11;
                } else {
                    i11 = currentPosition;
                    z12 = z11;
                    kw0Var = new kw0(cxVar.getContext(), 2);
                    kw0Var.setFocusable(true);
                    kw0Var.setOnClickListener(new pl0(cxVar, 2));
                    kw0Var.setExpanded(cxVar.f31325f0);
                    kw0Var.a(cxVar.f31328i0);
                    cxVar.e.addView(kw0Var, i16);
                }
                kw0Var.d = false;
                kw0Var.setTag(2131296461, Integer.valueOf(i16));
                kw0Var.setTag(2131296591, g10);
                kw0Var.setTag(2131296585, T);
                if (i16 == cxVar.D) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                kw0Var.setSelected(z13);
                cxVar.h.put(i15, kw0Var);
                kw0Var.setContentDescription(str);
            } else {
                i11 = currentPosition;
                z12 = z11;
            }
            i14++;
            currentPosition = i11;
            z11 = z12;
        }
        int i17 = currentPosition;
        boolean z14 = z11;
        cxVar.h();
        cxVar.q();
        if (z10 && isEmpty) {
            cxVar.m(this.f31992s0);
            yv yvVar = this.f31978o0;
            if (yvVar != null && (hyVar = yvVar.f27204r) != null) {
                hyVar.I1(null);
                return;
            }
            return;
        }
        WeakHashMap weakHashMap = r0.h0.f46134a;
        if (cxVar.isLaidOut()) {
            if (!isEmpty && !z14) {
                cxVar.k(i17 + 1, 0);
            } else if (isEmpty && z14) {
                cxVar.k(i17 - 1, 0);
            }
        }
    }

    public final void X() {
        zx zxVar;
        int size = this.f31962i1.size();
        long n10 = org.telegram.messenger.vi.n(Integer.MAX_VALUE, this.f31962i1);
        ArrayList arrayList = new ArrayList(org.telegram.messenger.vi.b0(this.f31943c1).f18653i0);
        this.f31962i1 = arrayList;
        long n11 = org.telegram.messenger.vi.n(Integer.MAX_VALUE, arrayList);
        if ((this.f31981p0 != null && size == 0 && !this.f31962i1.isEmpty()) || (size != 0 && this.f31962i1.isEmpty())) {
            W();
        }
        if ((size != this.f31962i1.size() || n10 != n11) && (zxVar = this.f31975n0) != null) {
            zxVar.f();
        }
    }

    public final void Y(boolean z10) {
        boolean z11;
        TLRPC.Document document;
        boolean z12;
        int i10;
        boolean z13;
        org.telegram.ui.ActionBar.p6 p6Var;
        boolean z14;
        boolean z15;
        ArrayList<TLRPC.Document> arrayList;
        boolean z16;
        ArrayList<TLRPC.Document> arrayList2;
        TLRPC.StickerSet stickerSet;
        int i11;
        gw gwVar = this.B0;
        if (gwVar != null) {
            org.telegram.ui.s71 s71Var = gwVar.e;
            if (gwVar.f31339s != null) {
                return;
            }
            this.F1 = -2;
            this.G1 = -2;
            this.H1 = -2;
            this.I1 = -2;
            int i12 = 0;
            this.f31948e0 = false;
            this.E1 = 0;
            int currentPosition = gwVar.getCurrentPosition();
            if (getParent() != null && getVisibility() == 0 && (this.f32014y1.size() != 0 || this.f32017z1.size() != 0)) {
                z11 = true;
            } else {
                z11 = false;
            }
            gwVar.d(z11);
            int i13 = this.f31943c1;
            org.telegram.messenger.vi b02 = org.telegram.messenger.vi.b0(i13);
            SharedPreferences sharedPreferences = org.telegram.messenger.wp.r1(i13).f19138g7;
            ArrayList arrayList3 = this.f31972m1;
            arrayList3.clear();
            ArrayList arrayList4 = b02.f18674s0[0];
            int size = arrayList4.size();
            for (int i14 = 0; i14 < size; i14++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList4.get(i14);
                if (!b02.B0(stickerSetCovered.set.f19821id, true)) {
                    arrayList3.add(stickerSetCovered);
                }
            }
            ty tyVar = this.F0;
            if (tyVar != null) {
                tyVar.f();
            }
            boolean isEmpty = arrayList4.isEmpty();
            long j10 = 0;
            Drawable[] drawableArr = this.Y0;
            org.telegram.ui.ActionBar.p6 p6Var2 = null;
            if (!isEmpty && (arrayList3.isEmpty() || sharedPreferences.getLong("featured_hidden", 0L) == ((TLRPC.StickerSetCovered) arrayList4.get(0)).set.f19821id)) {
                if (b02.f18678u0[0].isEmpty()) {
                    i11 = 2;
                } else {
                    i11 = 3;
                }
                kw0 c10 = gwVar.c(i11, drawableArr[i11]);
                c10.h.setText(org.telegram.messenger.dd.L0(2131750832, null));
                c10.setContentDescription(org.telegram.messenger.dd.L0(2131750834, null));
                int i15 = this.E1;
                this.H1 = i15;
                this.E1 = i15 + 1;
            }
            if (!this.f31968k1.isEmpty()) {
                int i16 = this.E1;
                this.G1 = i16;
                this.E1 = i16 + 1;
                kw0 c11 = gwVar.c(1, drawableArr[1]);
                c11.h.setText(org.telegram.messenger.dd.L0(2131750839, null));
                c11.setContentDescription(org.telegram.messenger.dd.L0(2131750842, null));
            }
            if (!this.f31965j1.isEmpty()) {
                int i17 = this.E1;
                this.F1 = i17;
                this.E1 = i17 + 1;
                kw0 c12 = gwVar.c(0, drawableArr[0]);
                c12.h.setText(org.telegram.messenger.dd.L0(2131746378, null));
                c12.setContentDescription(org.telegram.messenger.dd.L0(2131746379, null));
            }
            ArrayList arrayList5 = this.f31946d1;
            arrayList5.clear();
            this.f31959h1 = null;
            this.f31953f1 = -1;
            this.f31949e1 = -10;
            if (this.F2 == null || z10) {
                this.F2 = new ArrayList(b02.s0(0));
            }
            ArrayList arrayList6 = this.F2;
            int i18 = 0;
            while (true) {
                TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.f32010x1;
                if (i18 >= stickerSetCoveredArr.length) {
                    break;
                }
                TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCoveredArr[i18];
                long j11 = j10;
                if (stickerSetCovered2 != null) {
                    TLRPC.TL_messages_stickerSet o02 = b02.o0(stickerSetCovered2.set.f19821id);
                    if (o02 != null && (stickerSet = o02.set) != null && !stickerSet.archived) {
                        stickerSetCoveredArr[i18] = null;
                    } else {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = new TLRPC.TL_messages_stickerSet();
                        tL_messages_stickerSet.set = stickerSetCovered2.set;
                        TLRPC.Document document2 = stickerSetCovered2.cover;
                        if (document2 != null) {
                            tL_messages_stickerSet.documents.add(document2);
                        } else if (!stickerSetCovered2.covers.isEmpty()) {
                            tL_messages_stickerSet.documents.addAll(stickerSetCovered2.covers);
                        }
                        if (!tL_messages_stickerSet.documents.isEmpty()) {
                            arrayList5.add(tL_messages_stickerSet);
                        }
                    }
                }
                i18++;
                j10 = j11;
            }
            long j12 = j10;
            ArrayList w02 = org.telegram.messenger.wp.r1(i13).w0(arrayList6);
            for (int i19 = 0; i19 < w02.size(); i19++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) w02.get(i19);
                TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet2.set;
                if ((stickerSet2 == null || !stickerSet2.archived) && (arrayList2 = tL_messages_stickerSet2.documents) != null && !arrayList2.isEmpty()) {
                    arrayList5.add(tL_messages_stickerSet2);
                }
            }
            if (this.J1 != null) {
                long j13 = org.telegram.messenger.wp.r1(i13).f19138g7.getLong("group_hide_stickers_" + this.J1.f19795id, -1L);
                TLRPC.Chat L0 = org.telegram.messenger.wp.r1(i13).L0(Long.valueOf(this.J1.f19795id));
                if (L0 != null && this.J1.stickerset != null && org.telegram.messenger.w3.N(L0)) {
                    TLRPC.StickerSet stickerSet3 = this.J1.stickerset;
                    if (stickerSet3 != null) {
                        if (j13 == stickerSet3.f19821id) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        this.f31956g1 = z16;
                    }
                } else {
                    if (j13 != -1) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    this.f31956g1 = z15;
                }
                TLRPC.ChatFull chatFull = this.J1;
                TLRPC.StickerSet stickerSet4 = chatFull.stickerset;
                if (stickerSet4 != null) {
                    TLRPC.TL_messages_stickerSet Y = b02.Y(stickerSet4);
                    if (Y != null && (arrayList = Y.documents) != null && !arrayList.isEmpty() && Y.set != null) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = new TLRPC.TL_messages_stickerSet();
                        tL_messages_stickerSet3.documents = Y.documents;
                        tL_messages_stickerSet3.packs = Y.packs;
                        tL_messages_stickerSet3.set = Y.set;
                        if (this.f31956g1) {
                            this.f31949e1 = arrayList5.size();
                            arrayList5.add(tL_messages_stickerSet3);
                        } else {
                            this.f31949e1 = 0;
                            arrayList5.add(0, tL_messages_stickerSet3);
                        }
                        if (!this.J1.can_set_stickers) {
                            tL_messages_stickerSet3 = null;
                        }
                        this.f31959h1 = tL_messages_stickerSet3;
                    }
                } else if (chatFull.can_set_stickers) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = new TLRPC.TL_messages_stickerSet();
                    if (this.f31956g1) {
                        this.f31949e1 = arrayList5.size();
                        arrayList5.add(tL_messages_stickerSet4);
                    } else {
                        this.f31949e1 = 0;
                        arrayList5.add(0, tL_messages_stickerSet4);
                    }
                }
            }
            int i20 = 0;
            while (i20 < arrayList5.size()) {
                if (i20 == this.f31949e1) {
                    TLRPC.Chat L02 = org.telegram.messenger.wp.r1(i13).L0(Long.valueOf(this.J1.f19795id));
                    if (L02 == null) {
                        arrayList5.remove(i12);
                        i20--;
                    } else {
                        this.f31948e0 = true;
                        String str = "chat" + L02.f19794id;
                        int i21 = gwVar.f31343y;
                        gwVar.f31343y = i21 + 1;
                        kw0 kw0Var = (kw0) gwVar.f31332n.get(str);
                        if (kw0Var != null) {
                            gwVar.g(str, kw0Var, i21);
                        } else {
                            kw0Var = new kw0(gwVar.getContext(), i12);
                            kw0Var.setFocusable(true);
                            kw0Var.setOnClickListener(new pl0(gwVar, i12));
                            s71Var.addView(kw0Var, i21);
                            kw0Var.f27972x = true;
                            r8 r8Var = new r8(p6Var2);
                            r8Var.u(org.telegram.messenger.i0.L(14.0f));
                            r8Var.q(L02);
                            int i22 = gwVar.f31316a;
                            g9 g9Var = kw0Var.e;
                            g9Var.setLayerNum(i22);
                            g9Var.e(L02, r8Var);
                            g9Var.setAspectFit(true);
                            kw0Var.setExpanded(gwVar.f31325f0);
                            kw0Var.a(gwVar.f31328i0);
                            kw0Var.h.setText(L02.title);
                        }
                        kw0Var.d = true;
                        kw0Var.setTag(2131296461, Integer.valueOf(i21));
                        if (i21 == gwVar.D) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        kw0Var.setSelected(z14);
                        gwVar.h.put(str, kw0Var);
                    }
                    i10 = 0;
                    p6Var = null;
                } else {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet5 = (TLRPC.TL_messages_stickerSet) arrayList5.get(i20);
                    TLRPC.StickerSet stickerSet5 = tL_messages_stickerSet5.set;
                    if (stickerSet5 != null && stickerSet5.thumb_document_id != j12) {
                        for (int i23 = 0; i23 < tL_messages_stickerSet5.documents.size(); i23++) {
                            document = tL_messages_stickerSet5.documents.get(i23);
                            if (document != null && tL_messages_stickerSet5.set.thumb_document_id == document.f19800id) {
                                break;
                            }
                        }
                    }
                    document = null;
                    if (document == null) {
                        z12 = false;
                        document = tL_messages_stickerSet5.documents.get(0);
                    } else {
                        z12 = false;
                    }
                    Object w9 = org.telegram.messenger.b8.w(tL_messages_stickerSet5.set.thumbs, 90, z12, null, z12);
                    if (w9 == null || tL_messages_stickerSet5.set.gifs) {
                        w9 = document;
                    }
                    String str2 = "set" + tL_messages_stickerSet5.set.f19821id;
                    int i24 = gwVar.f31343y;
                    gwVar.f31343y = i24 + 1;
                    kw0 kw0Var2 = (kw0) gwVar.f31332n.get(str2);
                    if (kw0Var2 != null) {
                        gwVar.g(str2, kw0Var2, i24);
                    } else {
                        kw0Var2 = new kw0(gwVar.getContext(), 0);
                        kw0Var2.setFocusable(true);
                        kw0Var2.setOnClickListener(new pl0(gwVar, 1));
                        kw0Var2.setExpanded(gwVar.f31325f0);
                        kw0Var2.a(gwVar.f31328i0);
                        s71Var.addView(kw0Var2, i24);
                    }
                    kw0Var2.e.setLayerNum(gwVar.f31316a);
                    i10 = 0;
                    kw0Var2.d = false;
                    kw0Var2.setTag(w9);
                    kw0Var2.setTag(2131296461, Integer.valueOf(i24));
                    kw0Var2.setTag(2131296591, tL_messages_stickerSet5);
                    kw0Var2.setTag(2131296585, document);
                    if (i24 == gwVar.D) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    kw0Var2.setSelected(z13);
                    gwVar.h.put(str2, kw0Var2);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(tL_messages_stickerSet5.set.title);
                    sb2.append(", ");
                    p6Var = null;
                    sb2.append(org.telegram.messenger.dd.L0(2131754757, null));
                    kw0Var2.setContentDescription(sb2.toString());
                }
                i20++;
                i12 = i10;
                p6Var2 = p6Var;
            }
            gwVar.h();
            gwVar.q();
            if (currentPosition != 0) {
                gwVar.k(currentPosition, currentPosition);
            }
            o();
        }
    }

    public final void Z() {
        boolean z10;
        int i10;
        hw hwVar = this.C0;
        gw gwVar = this.B0;
        if (gwVar != null && hwVar == null && this.f31996t1 != null) {
            gwVar.setTranslationY(this.f31996t1.p() * (-org.telegram.messenger.i0.L(50.0f)));
        }
        if (hwVar == null) {
            return;
        }
        if (getVisibility() == 0 && this.K0 && this.f31996t1.p() != 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        hwVar.setVisibility(i10);
        if (z10) {
            Rect rect = this.f32015y2;
            rect.setEmpty();
            this.h.getChildVisibleRect(this.f32009x0, rect, null);
            float p5 = this.f31996t1.p() * org.telegram.messenger.i0.L(50.0f);
            int i11 = rect.left;
            if (i11 != 0 || p5 != 0.0f) {
                this.X1 = false;
            }
            hwVar.setTranslationX(i11);
            float translationY = (((getTranslationY() + getTop()) - hwVar.getTop()) - gwVar.getExpandedOffset()) - p5;
            if (hwVar.getTranslationY() != translationY) {
                hwVar.setTranslationY(translationY);
                hwVar.invalidate();
            }
        }
        if (this.X1 && z10 && this.P0) {
            gwVar.i(true, this.W1);
            return;
        }
        this.X1 = false;
        gwVar.i(false, this.W1);
    }

    public final void a0() {
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        LongSparseArray longSparseArray = this.f32017z1;
        LongSparseArray longSparseArray2 = this.f32014y1;
        int i11 = this.f31943c1;
        bw bwVar = this.D0;
        if (bwVar != null) {
            try {
                int childCount = bwVar.getChildCount();
                int i12 = 0;
                int i13 = 0;
                while (i13 < childCount) {
                    View childAt = bwVar.getChildAt(i13);
                    if (!(childAt instanceof org.telegram.ui.Cells.w3) || ((dk0) bwVar.T(childAt)) == null) {
                        i10 = i13;
                    } else {
                        org.telegram.ui.Cells.w3 w3Var = (org.telegram.ui.Cells.w3) childAt;
                        ArrayList arrayList = org.telegram.messenger.vi.b0(i11).f18678u0[i12];
                        TLRPC.StickerSetCovered stickerSet = w3Var.getStickerSet();
                        if (arrayList != null && arrayList.contains(Long.valueOf(stickerSet.set.f19821id))) {
                            z10 = true;
                        } else {
                            z10 = i12;
                        }
                        int i14 = i12;
                        while (true) {
                            TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.f32010x1;
                            if (i14 < stickerSetCoveredArr.length) {
                                TLRPC.StickerSetCovered stickerSetCovered = stickerSetCoveredArr[i14];
                                if (stickerSetCovered != null) {
                                    i10 = i13;
                                    if (stickerSetCovered.set.f19821id == stickerSet.set.f19821id) {
                                        z11 = true;
                                        break;
                                    }
                                } else {
                                    i10 = i13;
                                }
                                i14++;
                                i13 = i10;
                            } else {
                                i10 = i13;
                                z11 = false;
                                break;
                            }
                        }
                        w3Var.c(stickerSet, z10, true, 0, 0, z11);
                        if (z10) {
                            org.telegram.messenger.vi.b0(i11).e1(stickerSet.set.f19821id);
                        }
                        if (longSparseArray2.indexOfKey(stickerSet.set.f19821id) >= 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (longSparseArray.indexOfKey(stickerSet.set.f19821id) >= 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z12 || z13) {
                            if (z12 && w3Var.f23387r) {
                                longSparseArray2.remove(stickerSet.set.f19821id);
                                z12 = false;
                            } else if (z13 && !w3Var.f23387r) {
                                longSparseArray.remove(stickerSet.set.f19821id);
                            }
                        }
                        if (!z11 && z12) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        w3Var.b(z14, true);
                    }
                    i13 = i10 + 1;
                    i12 = 0;
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
    }

    @Override
    public final void c(int i10) {
        setBottomInset(i10);
    }

    @Override
    public final void d(float f7) {
        this.f31990r2 = f7;
        S();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        org.telegram.messenger.r20 r20Var;
        TLRPC.StickerSet stickerSet;
        int i12 = org.telegram.messenger.at.f14814x0;
        ex exVar = this.R;
        nv nvVar = this.R2;
        if (i10 == i12) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (this.f32013y0 != null) {
                    Y(((Boolean) objArr[1]).booleanValue());
                    a0();
                    F();
                    o();
                }
            } else if (((Integer) objArr[0]).intValue() == 5) {
                if (((Boolean) objArr[1]).booleanValue()) {
                    org.telegram.messenger.i0.r(nvVar);
                    org.telegram.messenger.i0.h3(nvVar, 100L);
                    return;
                }
                exVar.F(false);
            }
        } else if (i10 == org.telegram.messenger.at.f14769q3) {
            long longValue = ((Long) objArr[0]).longValue();
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            TLRPC.ChatFull chatFull = this.J1;
            if (chatFull != null && chatFull.f19795id == longValue && booleanValue) {
                exVar.F(true);
            }
        } else if (i10 == org.telegram.messenger.at.X0) {
            boolean booleanValue2 = ((Boolean) objArr[0]).booleanValue();
            int intValue = ((Integer) objArr[1]).intValue();
            if (booleanValue2 || intValue == 0 || intValue == 2) {
                k(booleanValue2);
            }
        } else if (i10 == org.telegram.messenger.at.f14827z0) {
            a0();
            jc0 jc0Var = this.f32008x;
            if (jc0Var != null) {
                int childCount = jc0Var.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    jc0Var.getChildAt(i13).invalidate();
                }
            }
            Y(false);
        } else if (i10 == org.telegram.messenger.at.A0) {
            if (exVar != null) {
                exVar.F(false);
            }
        } else {
            int i14 = org.telegram.messenger.at.B0;
            ux uxVar = this.S;
            if (i10 == i14) {
                Long l4 = (Long) objArr[0];
                long longValue2 = l4.longValue();
                if (objArr.length > 1) {
                    tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) objArr[1];
                } else {
                    tL_messages_stickerSet = null;
                }
                if (tL_messages_stickerSet != null) {
                    qy qyVar = this.f32016z0;
                    if (qyVar != null && qyVar.d == longValue2 && qyVar.f29824f.size() < tL_messages_stickerSet.documents.size()) {
                        qyVar.f29824f = tL_messages_stickerSet.documents;
                        qyVar.f();
                    }
                    if (uxVar != null && uxVar.d == longValue2 && uxVar.f31101f.size() < tL_messages_stickerSet.documents.size()) {
                        uxVar.f31101f = tL_messages_stickerSet.documents;
                        uxVar.f();
                    }
                }
                TLRPC.ChatFull chatFull2 = this.J1;
                if (chatFull2 != null && (stickerSet = chatFull2.stickerset) != null && stickerSet.f19821id == longValue2) {
                    Y(false);
                }
                HashMap hashMap = this.f31989r1;
                if (hashMap.containsKey(l4) && objArr.length >= 2 && ((org.telegram.messenger.r20) hashMap.get(l4)) != null && tL_messages_stickerSet != null && (r20Var = (org.telegram.messenger.r20) hashMap.remove(l4)) != null) {
                    r20Var.a(tL_messages_stickerSet);
                }
                org.telegram.messenger.i0.r(nvVar);
                org.telegram.messenger.i0.h3(nvVar, 100L);
                return;
            }
            int i15 = org.telegram.messenger.at.f14726i4;
            hx hxVar = this.P;
            if (i10 == i15) {
                bw bwVar = this.D0;
                if (bwVar != null) {
                    int childCount2 = bwVar.getChildCount();
                    for (int i16 = 0; i16 < childCount2; i16++) {
                        View childAt = bwVar.getChildAt(i16);
                        if ((childAt instanceof org.telegram.ui.Cells.n8) || (childAt instanceof org.telegram.ui.Cells.d8)) {
                            childAt.invalidate();
                        }
                    }
                }
                if (hxVar != null) {
                    hxVar.invalidate();
                    int childCount3 = hxVar.getChildCount();
                    for (int i17 = 0; i17 < childCount3; i17++) {
                        View childAt2 = hxVar.getChildAt(i17);
                        if (childAt2 instanceof ey) {
                            childAt2.invalidate();
                        }
                    }
                }
                ju juVar = this.B1;
                if (juVar != null) {
                    juVar.f27577c.invalidate();
                }
                cx cxVar = this.f31981p0;
                if (cxVar != null) {
                    org.telegram.ui.s71 s71Var = cxVar.e;
                    int childCount4 = s71Var.getChildCount();
                    for (int i18 = 0; i18 < childCount4; i18++) {
                        s71Var.getChildAt(i18).invalidate();
                    }
                }
            } else if (i10 == org.telegram.messenger.at.L2) {
                if (hxVar != null && this.f31945d0) {
                    if ((this.V.f27201c.f27467k == 2 || hxVar.getAdapter() == uxVar) && !TextUtils.isEmpty(uxVar.f31105w)) {
                        uxVar.F(uxVar.f31105w, true);
                    }
                }
            } else if (i10 == org.telegram.messenger.at.f14709f5) {
                if (exVar != null) {
                    exVar.F(false);
                }
                U();
                Y(false);
            }
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        S();
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.h) {
            canvas.save();
            if (this.f31974n.getVisibility() != 8 && !this.f31998u0 && this.f32005w0) {
                canvas.drawColor(i0.b.o(-1, 25));
            }
            boolean drawChild = super.drawChild(canvas, view, j10);
            float R0 = org.telegram.messenger.i0.R0(this.f31986q2);
            if (R0 > 0.0f) {
                int r12 = org.telegram.ui.ActionBar.t6.r1(R0, A(org.telegram.ui.ActionBar.t6.f21286wf));
                int i10 = this.A2;
                GradientDrawable gradientDrawable = this.f32018z2;
                if (i10 != r12) {
                    gradientDrawable.setColors(new int[]{r12, org.telegram.ui.ActionBar.t6.r1(0.66f, r12), i0.b.o(r12, 0)});
                    this.A2 = r12;
                }
                gradientDrawable.setBounds(0, getMeasuredHeight() - this.f31986q2, getMeasuredWidth(), getMeasuredHeight());
                gradientDrawable.draw(canvas);
            }
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    public int getCurrentPage() {
        return this.A1;
    }

    public ArrayList<ix> getEmojipacks() {
        ArrayList<ix> arrayList = new ArrayList<>();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f31985q1;
            if (i10 < arrayList2.size()) {
                ix ixVar = (ix) arrayList2.get(i10);
                boolean z10 = ixVar.f27196g;
                ArrayList arrayList3 = this.f31982p1;
                if ((!z10 && (ixVar.f27195f || arrayList3.contains(Long.valueOf(ixVar.f27193b.f19821id)))) || (ixVar.f27196g && !ixVar.f27195f && !arrayList3.contains(Long.valueOf(ixVar.f27193b.f19821id)))) {
                    arrayList.add(ixVar);
                }
                i10++;
            } else {
                return arrayList;
            }
        }
    }

    public ArrayList<String> getRecentEmoji() {
        if (this.f31944c2) {
            return org.telegram.messenger.k6.f16569i;
        }
        if (this.B2 == null) {
            this.B2 = new ArrayList();
        }
        if (org.telegram.messenger.k6.f16569i.size() != this.C2) {
            this.B2.clear();
            int i10 = 0;
            while (true) {
                ArrayList arrayList = org.telegram.messenger.k6.f16569i;
                if (i10 >= arrayList.size()) {
                    break;
                }
                if (!((String) arrayList.get(i10)).startsWith("animated_")) {
                    this.B2.add((String) arrayList.get(i10));
                }
                i10++;
            }
            this.C2 = this.B2.size();
        }
        return this.B2;
    }

    public float getStickersExpandOffset() {
        gw gwVar = this.B0;
        if (gwVar == null) {
            return 0.0f;
        }
        return gwVar.getExpandedOffset();
    }

    public final void h(String str) {
        if (str != null) {
            if (str.startsWith("animated_") || org.telegram.messenger.k6.h(str)) {
                org.telegram.messenger.k6.a(str);
                int i10 = 0;
                if (getVisibility() != 0 || this.h.getCurrentItem() != 0) {
                    org.telegram.messenger.k6.s();
                    this.R.F(false);
                }
                org.telegram.messenger.k6.r();
                if (!this.f31944c2) {
                    ArrayList arrayList = this.B2;
                    if (arrayList == null) {
                        this.B2 = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    while (true) {
                        ArrayList arrayList2 = org.telegram.messenger.k6.f16569i;
                        if (i10 < arrayList2.size()) {
                            if (!((String) arrayList2.get(i10)).startsWith("animated_")) {
                                this.B2.add((String) arrayList2.get(i10));
                            }
                            i10++;
                        } else {
                            this.C2 = this.B2.size();
                            return;
                        }
                    }
                }
            }
        }
    }

    public final void i(int i10, int i11, boolean z10) {
        if (i10 == 2 || y(i10).K(0) == null) {
            return;
        }
        sw swVar = new sw(getContext(), i11);
        swVar.f48056a = !z10 ? 1 : 0;
        x(i10).w0(swVar);
    }

    public final void k(boolean z10) {
        if (z10) {
            X();
            return;
        }
        int size = this.f31965j1.size();
        int size2 = this.f31968k1.size();
        int i10 = this.f31943c1;
        this.f31965j1 = org.telegram.messenger.vi.b0(i10).i0(0, true);
        this.f31968k1 = org.telegram.messenger.vi.b0(i10).i0(2, false);
        if (org.telegram.messenger.e20.i(i10).q()) {
            this.l1 = org.telegram.messenger.vi.b0(i10).i0(7, false);
        } else {
            this.l1 = new ArrayList();
        }
        for (int i11 = 0; i11 < this.f31968k1.size(); i11++) {
            TLRPC.Document document = (TLRPC.Document) this.f31968k1.get(i11);
            int i12 = 0;
            while (true) {
                if (i12 < this.f31965j1.size()) {
                    TLRPC.Document document2 = (TLRPC.Document) this.f31965j1.get(i12);
                    if (document2.dc_id == document.dc_id && document2.f19800id == document.f19800id) {
                        this.f31965j1.remove(i12);
                        break;
                    }
                    i12++;
                }
            }
        }
        if (org.telegram.messenger.wp.r1(i10).A3()) {
            int i13 = 0;
            while (i13 < this.f31968k1.size()) {
                if (org.telegram.messenger.kj.X3((TLRPC.Document) this.f31968k1.get(i13))) {
                    this.f31968k1.remove(i13);
                    i13--;
                }
                i13++;
            }
            int i14 = 0;
            while (i14 < this.f31965j1.size()) {
                if (org.telegram.messenger.kj.X3((TLRPC.Document) this.f31965j1.get(i14))) {
                    this.f31965j1.remove(i14);
                    i14--;
                }
                i14++;
            }
        }
        if (size != this.f31965j1.size() || size2 != this.f31968k1.size()) {
            Y(false);
        }
        ny nyVar = this.f32013y0;
        if (nyVar != null) {
            nyVar.f();
        }
        o();
    }

    public final void l(boolean z10) {
        int i10;
        boolean z11;
        vx vxVar = this.f31996t1;
        fe.b bVar = this.f31937b;
        hx hxVar = this.P;
        tv tvVar = this.V;
        if (vxVar != null && vxVar.z()) {
            s4.c1 K = hxVar.K(0);
            if (K == null) {
                iy.a(tvVar, true, !z10);
            } else {
                if (K.f47909a.getTop() < hxVar.getPaddingTop()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                iy.a(tvVar, z11, !z10);
            }
            O(false, !z10);
            tvVar.setTranslationY(bVar.e * org.telegram.messenger.i0.L(15.0f));
        } else if (tvVar != null && hxVar != null) {
            s4.c1 K2 = hxVar.K(0);
            if (K2 != null) {
                i10 = K2.f47909a.getTop();
            } else {
                i10 = -this.f31939b1;
            }
            tvVar.setTranslationY((bVar.e * org.telegram.messenger.i0.L(15.0f)) + i10);
            tvVar.f27199a.a(false, !z10);
            m(Math.round(this.I.getTranslationY()));
        }
    }

    public final void m(int i10) {
        ObjectAnimator objectAnimator = this.R0[1];
        if (objectAnimator != null && objectAnimator.isRunning()) {
            return;
        }
        boolean z10 = false;
        s4.c1 K = this.P.K(0);
        int L = org.telegram.messenger.i0.L(38.0f) + i10;
        if (L > 0 && (K == null || K.f47909a.getBottom() < L)) {
            z10 = true;
        }
        O(z10, !this.K1);
    }

    public final void n(int i10, View view) {
        hx hxVar;
        s4.c1 K;
        int i11;
        zw zwVar = this.I;
        int[] iArr = this.Q0;
        if (view == null) {
            iArr[1] = 0;
            zwVar.setTranslationY(0);
        } else if (view.getVisibility() == 0 && !this.f31952f0) {
            vx vxVar = this.f31996t1;
            if (vxVar == null || !vxVar.z()) {
                if (i10 > 0 && (hxVar = this.P) != null && hxVar.getVisibility() == 0 && (K = hxVar.K(0)) != null) {
                    int top = K.f47909a.getTop();
                    if (this.f31945d0) {
                        i11 = this.f31939b1;
                    } else {
                        i11 = 0;
                    }
                    if (top + i11 >= hxVar.getPaddingTop()) {
                        return;
                    }
                }
                int i12 = iArr[1] - i10;
                iArr[1] = i12;
                if (i12 > 0) {
                    iArr[1] = 0;
                } else if (i12 < (-org.telegram.messenger.i0.L(108.0f))) {
                    iArr[1] = -org.telegram.messenger.i0.L(108.0f);
                }
                zwVar.setTranslationY(Math.max(-org.telegram.messenger.i0.L(36.0f), iArr[1]));
            }
        }
    }

    public final void o() {
        int L0;
        gw gwVar = this.B0;
        if (gwVar != null && (L0 = this.E0.L0()) != -1) {
            int i10 = this.G1;
            if (i10 <= 0 && (i10 = this.F1) <= 0) {
                i10 = this.E1;
            }
            gwVar.k(this.f32013y0.F(L0), i10);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        xa.n nVar = this.M2;
        if (nVar != null) {
            nVar.a();
            this.M2 = null;
        }
        xa.n nVar2 = (xa.n) new org.telegram.messenger.zs(org.telegram.messenger.at.f(this.f31943c1), this).f19759b;
        nVar2.h(org.telegram.messenger.at.f14726i4);
        nVar2.e(org.telegram.messenger.at.L2);
        nVar2.e(org.telegram.messenger.at.f14769q3);
        this.M2 = nVar2;
        if (this.f32013y0 != null) {
            nVar2.e(org.telegram.messenger.at.f14814x0);
            nVar2.e(org.telegram.messenger.at.X0);
            nVar2.e(org.telegram.messenger.at.f14827z0);
            nVar2.e(org.telegram.messenger.at.B0);
            nVar2.e(org.telegram.messenger.at.f14709f5);
            org.telegram.messenger.i0.g3(new nv(this, 0));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ju juVar = this.B1;
        if (juVar != null && juVar.isShowing()) {
            juVar.dismiss();
        }
        org.telegram.ui.kt p5 = org.telegram.ui.kt.p();
        if (p5.f38986l == this.f31957g2) {
            p5.W = null;
            p5.f38974a0 = null;
            p5.Y = null;
            p5.f38986l = null;
            p5.f38978c0 = null;
            p5.t();
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        if (this.O1 != i14) {
            this.O1 = i14;
            F();
        }
        super.onLayout(z10, i10, i11, i12, i13);
        S();
        Z();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.K1 = true;
        boolean z10 = org.telegram.messenger.i0.E;
        View view = this.f32004w;
        boolean z11 = this.f31945d0;
        if (!z10 && !this.N1) {
            if (this.L1 != 0) {
                if (!this.L2) {
                    setOutlineProvider(null);
                    setClipToOutline(false);
                    setElevation(0.0f);
                }
                if (this.f31998u0) {
                    int i12 = org.telegram.ui.ActionBar.t6.f21286wf;
                    setBackgroundColor(A(i12));
                    if (z11) {
                        view.setBackgroundColor(A(i12));
                    }
                }
                this.L1 = 0;
            }
        } else if (this.L1 != 1) {
            if (!this.L2) {
                setOutlineProvider(this.M1);
                setClipToOutline(true);
                setElevation(org.telegram.messenger.i0.L(2.0f));
            }
            setBackgroundResource(2131232735);
            Drawable background = getBackground();
            int i13 = org.telegram.ui.ActionBar.t6.f21286wf;
            background.setColorFilter(new PorterDuffColorFilter(A(i13), PorterDuff.Mode.MULTIPLY));
            if (z11 && this.f31998u0) {
                view.setBackgroundColor(A(i13));
            }
            this.L1 = 1;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
        this.K1 = false;
        setTranslationY(getTranslationY());
    }

    public final void p(int i10) {
        int L0;
        int i11;
        int L02;
        if (i10 == 0) {
            if (!this.J0 && (L02 = this.E0.L0()) != -1 && this.D0 != null) {
                int i12 = this.G1;
                if (i12 <= 0 && (i12 = this.F1) <= 0) {
                    i12 = this.E1;
                }
                this.B0.k(this.f32013y0.F(L02), i12);
            }
        } else if (i10 == 2) {
            s4.g0 adapter = this.f31958h0.getAdapter();
            zx zxVar = this.f31975n0;
            if (adapter == zxVar && zxVar.I >= 0 && this.f31992s0 >= 0 && this.f31988r0 >= 0 && (L0 = this.f31961i0.L0()) != -1) {
                if (L0 >= zxVar.I) {
                    i11 = this.f31992s0;
                } else {
                    i11 = this.f31988r0;
                }
                this.f31981p0.k(i11, 0);
            }
        }
    }

    public final void q(boolean z10) {
        int i10;
        vx vxVar = this.f31996t1;
        fe.b bVar = this.f31934a;
        bw bwVar = this.D0;
        boolean z11 = false;
        fw fwVar = this.G0;
        if (vxVar != null && vxVar.z()) {
            s4.c1 K = bwVar.K(0);
            if (K == null) {
                iy.a(fwVar, true, !z10);
            } else {
                if (K.f47909a.getTop() < bwVar.getPaddingTop()) {
                    z11 = true;
                }
                iy.a(fwVar, z11, !z10);
            }
            fwVar.setTranslationY(bVar.e * org.telegram.messenger.i0.L(15.0f));
        } else if (fwVar != null && bwVar != null) {
            s4.c1 K2 = bwVar.K(0);
            if (K2 != null) {
                i10 = K2.f47909a.getTop();
            } else {
                i10 = -this.f31939b1;
            }
            fwVar.setTranslationY((bVar.e * org.telegram.messenger.i0.L(15.0f)) + i10);
            fwVar.f27199a.a(false, !z10);
        }
    }

    public final void r() {
        HashMap hashMap = org.telegram.messenger.k6.f16564a;
        org.telegram.messenger.wp.c1().edit().putBoolean("filled_default", true).commit();
        org.telegram.messenger.k6.h.clear();
        org.telegram.messenger.k6.f16569i.clear();
        org.telegram.messenger.k6.r();
        this.R.F(false);
    }

    @Override
    public final void requestLayout() {
        if (this.K1) {
            return;
        }
        super.requestLayout();
    }

    public final void s(long j10, boolean z10) {
        iy iyVar;
        s4.a0 a0Var;
        View view;
        uk0 uk0Var;
        int i10;
        int i11;
        TLRPC.TL_messages_stickerSet o02;
        ny nyVar;
        int E;
        AnimatorSet animatorSet = this.M0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.M0 = null;
        }
        int currentItem = this.h.getCurrentItem();
        int i12 = 2;
        if (currentItem == 2 && j10 != -1 && (o02 = org.telegram.messenger.vi.b0(this.f31943c1).o0(j10)) != null && (E = (nyVar = this.f32013y0).E(o02)) >= 0 && E < nyVar.b()) {
            I(E, org.telegram.messenger.i0.L(48.0f));
        }
        int i13 = 0;
        zx zxVar = this.f31964j0;
        if (zxVar != null) {
            zxVar.K = false;
        }
        int i14 = 0;
        while (i14 < 3) {
            uk0 uk0Var2 = this.D0;
            uk0 uk0Var3 = this.f31958h0;
            yv yvVar = this.f31978o0;
            uk0 uk0Var4 = this.P;
            if (i14 == 0) {
                iyVar = this.V;
                a0Var = this.Q;
                view = this.I;
                uk0Var = uk0Var4;
            } else if (i14 == 1) {
                a0Var = this.f31961i0;
                view = this.f31981p0;
                uk0Var = uk0Var3;
                iyVar = yvVar;
            } else {
                iyVar = this.G0;
                a0Var = this.E0;
                view = this.B0;
                uk0Var = uk0Var2;
            }
            if (iyVar == null) {
                i11 = i13;
                i10 = i12;
            } else {
                int i15 = i13;
                hy hyVar = iyVar.f27204r;
                int i16 = i12;
                iyVar.d.setText("");
                if (hyVar != null) {
                    hyVar.I1(null);
                    hyVar.G1();
                }
                int i17 = this.f31939b1;
                if (i14 == currentItem && z10) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.M0 = animatorSet2;
                    Property property = View.TRANSLATION_Y;
                    if (view != null && i14 != 1) {
                        float[] fArr = new float[1];
                        fArr[i15] = 0.0f;
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
                        float[] fArr2 = new float[1];
                        fArr2[i15] = org.telegram.messenger.i0.L(36.0f);
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(uk0Var, property, fArr2);
                        float[] fArr3 = new float[1];
                        fArr3[i15] = org.telegram.messenger.i0.L(36.0f);
                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(iyVar, property, fArr3);
                        Animator[] animatorArr = new Animator[3];
                        animatorArr[i15] = ofFloat;
                        animatorArr[1] = ofFloat2;
                        animatorArr[i16] = ofFloat3;
                        animatorSet2.playTogether(animatorArr);
                    } else {
                        float[] fArr4 = new float[1];
                        fArr4[i15] = org.telegram.messenger.i0.L(36.0f) - i17;
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(uk0Var, property, fArr4);
                        Animator[] animatorArr2 = new Animator[1];
                        animatorArr2[i15] = ofFloat4;
                        animatorSet2.playTogether(animatorArr2);
                    }
                    this.M0.setDuration(200L);
                    this.M0.setInterpolator(gr.h);
                    this.M0.addListener(new org.telegram.ui.ActionBar.g1(this, a0Var, uk0Var, 5));
                    this.M0.start();
                    i11 = i15;
                    i10 = i16;
                } else {
                    if (iyVar != yvVar) {
                        iyVar.setTranslationY(org.telegram.messenger.i0.L(36.0f) - i17);
                    }
                    i10 = i16;
                    if (view != null && i14 != i10) {
                        view.setTranslationY(0.0f);
                    }
                    if (uk0Var == uk0Var2) {
                        i11 = i15;
                        uk0Var.setPadding(i11, org.telegram.messenger.i0.L(36.0f), i11, org.telegram.messenger.i0.L(44.0f) + this.f31986q2);
                    } else {
                        i11 = i15;
                        if (uk0Var == uk0Var3) {
                            uk0Var.setPadding(i11, org.telegram.messenger.i0.L(40.0f), i11, org.telegram.messenger.i0.L(44.0f) + this.f31986q2);
                        } else {
                            if (uk0Var == uk0Var4) {
                                uk0Var.setPadding(org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(36.0f), org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(44.0f) + this.f31986q2);
                            }
                            i11 = 0;
                        }
                    }
                    a0Var.h1(i11, i11);
                }
            }
            i14++;
            i12 = i10;
            i13 = i11;
        }
        int i18 = i13;
        if (!z10) {
            this.f31996t1.i(i18);
        }
    }

    public void setBlurredBackgroundDrawableFactory(tg.b bVar) {
        org.telegram.ui.ActionBar.p6 p6Var = this.Z1;
        View view = this.f32012y;
        if (view != null) {
            vg.f c10 = bVar.c(view, null, false);
            c10.o(w7.b9.d(p6Var));
            c10.q(org.telegram.messenger.i0.L(18.0f));
            c10.p(org.telegram.messenger.i0.L(6.0f));
            view.setBackground(c10);
        }
        View view2 = this.E;
        if (view2 != null) {
            vg.f c11 = bVar.c(view2, null, false);
            c11.o(w7.b9.d(p6Var));
            c11.q(org.telegram.messenger.i0.L(18.0f));
            c11.p(org.telegram.messenger.i0.L(6.0f));
            view2.setBackground(c11);
        }
        View view3 = this.f32008x;
        if (view3 != null) {
            vg.f c12 = bVar.c(view3, null, false);
            c12.o(w7.b9.d(p6Var));
            c12.q(org.telegram.messenger.i0.L(18.0f));
            c12.p(org.telegram.messenger.i0.L(6.0f));
            view3.setBackground(c12);
        }
        View view4 = this.D;
        if (view4 != null) {
            vg.f c13 = bVar.c(view4, null, false);
            c13.o(w7.b9.d(p6Var));
            c13.q(org.telegram.messenger.i0.L(18.0f));
            c13.p(org.telegram.messenger.i0.L(6.0f));
            view4.setBackground(c13);
        }
    }

    public void setBottomInset(int i10) {
        if (this.f31986q2 != i10) {
            this.f31986q2 = i10;
            j(i10, this.K);
            j(i10, this.M);
            j(org.telegram.messenger.i0.L(44.0f) + i10, this.P);
            j(org.telegram.messenger.i0.L(44.0f) + i10, this.D0);
            j(org.telegram.messenger.i0.L(44.0f) + i10, this.f31958h0);
            FrameLayout frameLayout = this.f31991s;
            if (frameLayout != null) {
                frameLayout.setTranslationY(-i10);
            }
            S();
            invalidate();
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        this.J1 = chatFull;
        Y(false);
    }

    public void setDelegate(vx vxVar) {
        this.f31996t1 = vxVar;
    }

    public void setDragListener(bx bxVar) {
        this.O0 = bxVar;
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        fw fwVar = this.G0;
        if (fwVar != null) {
            fwVar.d.setEnabled(z10);
        }
        yv yvVar = this.f31978o0;
        if (yvVar != null) {
            yvVar.d.setEnabled(z10);
        }
        tv tvVar = this.V;
        if (tvVar != null) {
            tvVar.d.setEnabled(z10);
        }
    }

    public void setForseMultiwindowLayout(boolean z10) {
        this.N1 = z10;
    }

    public void setShouldDrawBackground(boolean z10) {
        if (this.f31998u0 != z10) {
            this.f31998u0 = z10;
            updateColors();
        }
    }

    public void setShowing(boolean z10) {
        this.P0 = z10;
        Z();
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        Z();
        S();
    }

    @Override
    public void setVisibility(int i10) {
        boolean z10;
        if (getVisibility() != i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        super.setVisibility(i10);
        if (z10) {
            if (i10 != 8) {
                org.telegram.messenger.k6.s();
                this.R.F(false);
                xa.n nVar = this.N2;
                int i11 = this.f31943c1;
                if (nVar == null) {
                    xa.n nVar2 = (xa.n) new org.telegram.messenger.zs(org.telegram.messenger.at.f(i11), this).f19759b;
                    nVar2.e(org.telegram.messenger.at.f14814x0);
                    this.N2 = nVar2;
                }
                if (this.f32013y0 != null) {
                    if (!this.O2) {
                        this.O2 = true;
                        this.N2.e(org.telegram.messenger.at.X0);
                    }
                    Y(false);
                    F();
                }
                k(true);
                k(false);
                org.telegram.messenger.vi.b0(i11).V0(0, true, true, false);
                org.telegram.messenger.vi.b0(i11).V0(0, false, true, false);
                org.telegram.messenger.vi.b0(i11).V0(2, false, true, false);
            }
            mw mwVar = this.T0;
            if (mwVar != null) {
                mwVar.a();
            }
        }
    }

    public final void t(boolean z10) {
        s(-1L, z10);
    }

    public final void u(boolean z10) {
        ny nyVar;
        boolean z11 = this.T2;
        this.T2 = z10;
        if (z11 && !z10) {
            int i10 = this.A1;
            if (i10 == 0) {
                ex exVar = this.R;
                if (exVar != null) {
                    exVar.F(false);
                }
            } else if (i10 == 1) {
                zx zxVar = this.f31975n0;
                if (zxVar != null) {
                    zxVar.f();
                }
            } else if (i10 == 2 && (nyVar = this.f32013y0) != null) {
                nyVar.f();
            }
        }
    }

    @Override
    public final void updateColors() {
        try {
            T();
            hi.c cVar = this.f31971l2;
            if (cVar != null) {
                cVar.a(A(org.telegram.ui.ActionBar.t6.f20930d6));
            }
            jc0 jc0Var = this.f32008x;
            if (jc0Var != null) {
                jc0Var.setIndicatorColor(i0.b.o(A(org.telegram.ui.ActionBar.t6.Df), 20));
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = 4;
        if (i10 == 0) {
            q(false);
            float f11 = 1.0f - this.f31934a.e;
            fw fwVar = this.G0;
            fwVar.setAlpha(f11);
            if (f11 > 0.0f) {
                i13 = 0;
            } else {
                i13 = 4;
            }
            fwVar.setVisibility(i13);
            float f12 = 1.0f - f11;
            fh.c cVar = this.H0;
            cVar.setAlpha(f12);
            cVar.setTranslationY((-org.telegram.messenger.i0.L(15.0f)) * f11);
            int i16 = (f12 > 0.0f ? 1 : (f12 == 0.0f ? 0 : -1));
            if (i16 > 0) {
                i14 = 0;
            } else {
                i14 = 4;
            }
            cVar.setVisibility(i14);
            fg.i iVar = this.M;
            iVar.setAlpha(f12);
            iVar.setTranslationY(org.telegram.messenger.i0.L(30.0f) * f11);
            if (i16 > 0) {
                i15 = 0;
            }
            iVar.setVisibility(i15);
            S();
            this.f32009x0.invalidate();
        } else if (i10 == 1) {
            l(false);
            float f13 = 1.0f - this.f31937b.e;
            tv tvVar = this.V;
            tvVar.setAlpha(f13);
            if (f13 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            tvVar.setVisibility(i11);
            float f14 = 1.0f - f13;
            fh.c cVar2 = this.U;
            cVar2.setAlpha(f14);
            cVar2.setTranslationY((-org.telegram.messenger.i0.L(15.0f)) * f13);
            int i17 = (f14 > 0.0f ? 1 : (f14 == 0.0f ? 0 : -1));
            if (i17 > 0) {
                i12 = 0;
            } else {
                i12 = 4;
            }
            cVar2.setVisibility(i12);
            fg.i iVar2 = this.K;
            iVar2.setAlpha(f14);
            iVar2.setTranslationY(org.telegram.messenger.i0.L(30.0f) * f13);
            if (i17 > 0) {
                i15 = 0;
            }
            iVar2.setVisibility(i15);
            S();
            this.J.invalidate();
        }
    }

    public final int w(float f7) {
        return i0.b.o(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Kl, this.Z1), (int) (f7 * 255.0f));
    }

    public final s4.r x(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return this.f31961i0;
                }
                throw new IllegalArgumentException(i0.a.i(i10, "Unexpected argument: "));
            }
            return this.Q;
        }
        return this.E0;
    }

    public final uk0 y(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return this.f31958h0;
                }
                throw new IllegalArgumentException(i0.a.i(i10, "Unexpected argument: "));
            }
            return this.P;
        }
        return this.D0;
    }

    public final HorizontalScrollView z(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return this.f31981p0;
                }
                throw new IllegalArgumentException(i0.a.i(i10, "Unexpected argument: "));
            }
            return this.I;
        }
        return this.B0;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void E(float f7, int i10) {
    }
}
