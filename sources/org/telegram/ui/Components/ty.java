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
public class ty extends FrameLayout implements org.telegram.ui.ActionBar.b6, te.b, org.telegram.messenger.gs, rh.a {
    public static final int V2 = 0;
    public final oy A0;
    public final LongSparseArray A1;
    public final GradientDrawable A2;
    public final tv B0;
    public int B1;
    public int B2;
    public final hw C0;
    public final ku C1;
    public ArrayList C2;
    public final iw D0;
    public final int D1;
    public int D2;
    public final ImageView E;
    public final dw E0;
    public final int[] E1;
    public long E2;
    public final ImageView F;
    public final ew F0;
    public int F1;
    public final te.a F2;
    public AnimatorSet G;
    public ry G0;
    public int G1;
    public ArrayList G2;
    public AnimatorSet H;
    public final gw H0;
    public int H1;
    public Drawable H2;
    public float I;
    public final ph.c I0;
    public int I1;
    public int I2;
    public final yw J;
    public boolean J0;
    public int J1;
    public int J2;
    public final tw K;
    public boolean K0;
    public TLRPC.ChatFull K1;
    public int K2;
    public final org.telegram.ui.y61 L;
    public boolean L0;
    public boolean L1;
    public int L2;
    public final ph.a M;
    public final nx M0;
    public int M1;
    public boolean M2;
    public final org.telegram.ui.y61 N;
    public AnimatorSet N0;
    public final bg.r0 N1;
    public xi.e N2;
    public final ph.a O;
    public final di.xb O0;
    public boolean O1;
    public xi.e O2;
    public final View P;
    public ax P0;
    public int P1;
    public boolean P2;
    public final gx Q;
    public boolean Q0;
    public boolean Q1;
    public AnimatorSet Q2;
    public final uw R;
    public final int[] R0;
    public boolean R1;
    public h2.m0 R2;
    public final dx S;
    public final ObjectAnimator[] S0;
    public cy S1;
    public final pv S2;
    public final sx T;
    public boolean T0;
    public float T1;
    public boolean T2;
    public ry U;
    public jg.d1 U0;
    public float U1;
    public boolean U2;
    public final ph.c V;
    public boolean V0;
    public float V1;
    public final vv W;
    public boolean W0;
    public float W1;
    public String[] X0;
    public float X1;
    public final Drawable[] Y0;
    public boolean Y1;
    public final Drawable[] Z0;
    public final org.telegram.ui.ActionBar.g2 Z1;
    public final te.a f40078a;
    public AnimatorSet f40079a0;
    public final Drawable[] f40080a1;
    public final org.telegram.ui.ActionBar.h6 f40081a2;
    public final te.a f40082b;
    public final org.telegram.ui.ActionBar.k5 f40083b0;
    public final String[] f40084b1;
    public final org.telegram.ui.ActionBar.v5 f40085b2;
    public int f40086c;
    public final org.telegram.ui.ActionBar.k5 f40087c0;
    public final int f40088c1;
    public final org.telegram.ui.ActionBar.v5 f40089c2;
    public final ArrayList d;
    public boolean f40090d0;
    public final int f40091d1;
    public final boolean d2;
    public final ArrayList f40092e;
    public final boolean f40093e0;
    public final ArrayList f40094e1;
    public LongSparseArray f40095e2;
    public boolean f40096f;
    public boolean f40097f0;
    public int f40098f1;
    public PorterDuffColorFilter f40099f2;
    public boolean f40100g0;
    public int f40101g1;
    public final ik f40102g2;
    public final jw h;
    public final xv f40103h0;
    public boolean f40104h1;
    public final pw f40105h2;
    public final yv f40106i0;
    public TLRPC.TL_messages_stickerSet f40107i1;
    public boolean f40108i2;
    public final yx f40109j0;
    public ArrayList f40110j1;
    public final boolean f40111j2;
    public final xx f40112k0;
    public ArrayList f40113k1;
    public final dh.g f40114k2;
    public final ay f40115l0;
    public ArrayList l1;
    public final kh f40116l2;
    public final HashMap m0;
    public ArrayList f40117m1;
    public final ui.c f40118m2;
    public final FrameLayout f40119n;
    public final tv f40120n0;
    public final ArrayList n1;
    public final dh.c f40121n2;
    public final xx f40122o0;
    public final ArrayList f40123o1;
    public final ri.q f40124o2;
    public final aw f40125p0;
    public final ArrayList f40126p1;
    public boolean f40127p2;
    public final bx f40128q0;
    public final ArrayList f40129q1;
    public boolean f40130q2;
    public final FrameLayout f40131r;
    public boolean f40132r0;
    public final ArrayList f40133r1;
    public int f40134r2;
    public final FrameLayout f40135s;
    public int f40136s0;
    public final HashMap f40137s1;
    public float f40138s2;
    public int f40139t0;
    public final Paint f40140t1;
    public View f40141t2;
    public int f40142u0;
    public tx f40143u1;
    public int f40144u2;
    public boolean f40145v0;
    public long f40146v1;
    public int f40147v2;
    public final View f40148w;
    public boolean f40149w0;
    public boolean f40150w1;
    public long f40151w2;
    public final cc0 f40152x;
    public boolean f40153x0;
    public boolean f40154x1;
    public boolean f40155x2;
    public final kw f40156y;
    public final bw f40157y0;
    public final TLRPC.StickerSetCovered[] f40158y1;
    public boolean f40159y2;
    public final ly f40160z0;
    public final LongSparseArray f40161z1;
    public final Rect f40162z2;

    public ty(org.telegram.ui.ActionBar.g2 g2Var, boolean z10, boolean z11, boolean z12, Context context, boolean z13, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z14, final org.telegram.ui.ActionBar.h6 h6Var, boolean z15, boolean z16) {
        super(context);
        pv pvVar;
        boolean z17;
        tw twVar;
        int i7;
        boolean z18;
        Context context2;
        final org.telegram.ui.ActionBar.h6 h6Var2;
        ri.q qVar;
        dx dxVar;
        int i10;
        int i11;
        int i12;
        boolean z19;
        Field field;
        boolean z20;
        dx dxVar2;
        boolean z21;
        nr nrVar = nr.h;
        this.f40078a = new te.a(0, this, nrVar, 320L, false);
        this.f40082b = new te.a(1, this, nrVar, 320L, false);
        this.f40086c = 2;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.f40092e = new ArrayList();
        this.f40090d0 = true;
        this.f40115l0 = new ay(this);
        this.m0 = new HashMap();
        this.f40132r0 = true;
        this.f40136s0 = -2;
        this.f40139t0 = -2;
        this.f40142u0 = -2;
        this.f40145v0 = true;
        this.f40153x0 = true;
        this.J0 = true;
        this.R0 = new int[3];
        this.S0 = new ObjectAnimator[3];
        int i13 = org.telegram.messenger.k10.f24968t0;
        this.f40091d1 = i13;
        this.f40094e1 = new ArrayList();
        this.f40110j1 = new ArrayList();
        this.f40113k1 = new ArrayList();
        this.l1 = new ArrayList();
        this.f40117m1 = new ArrayList();
        this.n1 = new ArrayList();
        this.f40123o1 = new ArrayList();
        new ArrayList();
        this.f40126p1 = new ArrayList();
        this.f40129q1 = new ArrayList();
        this.f40133r1 = new ArrayList();
        this.f40137s1 = new HashMap();
        this.f40158y1 = new TLRPC.StickerSetCovered[10];
        this.f40161z1 = new LongSparseArray();
        this.A1 = new LongSparseArray();
        this.E1 = new int[2];
        this.G1 = -2;
        this.H1 = -2;
        this.I1 = -2;
        this.J1 = -2;
        this.M1 = -1;
        this.f40102g2 = new ik(this, 5);
        this.f40105h2 = new pw(this);
        this.f40108i2 = true;
        ri.q qVar2 = new ri.q();
        this.f40124o2 = qVar2;
        this.f40138s2 = -1.0f;
        this.f40144u2 = -1;
        this.f40147v2 = -1;
        this.f40151w2 = -1L;
        this.f40155x2 = false;
        this.f40159y2 = true;
        this.f40162z2 = new Rect();
        this.A2 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.F2 = new te.a(0, new qv(this, 3), nrVar, 380L, true);
        this.S2 = new pv(this, 1);
        this.T2 = false;
        this.f40145v0 = z14;
        this.Z1 = g2Var;
        this.d2 = z10;
        this.f40081a2 = h6Var;
        this.f40111j2 = z16;
        ui.c cVar = new ui.c();
        this.f40118m2 = cVar;
        cVar.a(z(org.telegram.ui.ActionBar.m6.f29381d6));
        if (z15) {
            u(true);
        }
        i0.a.o(z(org.telegram.ui.ActionBar.m6.Nl), 30);
        int L = org.telegram.messenger.g0.L(50.0f);
        this.f40088c1 = L;
        this.f40093e0 = z13;
        this.Y0 = new Drawable[]{org.telegram.ui.ActionBar.m6.W(context, 2131232745, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.m6.Jf), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.m6.Gf)), org.telegram.ui.ActionBar.m6.W(context, 2131232742, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.m6.Jf), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.m6.Gf)), org.telegram.ui.ActionBar.m6.W(context, 2131232746, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.m6.Jf), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.m6.Gf))};
        org.telegram.ui.ActionBar.v5 W = org.telegram.ui.ActionBar.m6.W(context, 2131232127, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.m6.Ef), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.m6.Gf));
        org.telegram.ui.ActionBar.v5 W2 = org.telegram.ui.ActionBar.m6.W(context, 2131231064, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.m6.Ef), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.m6.Gf));
        org.telegram.ui.ActionBar.v5 W3 = org.telegram.ui.ActionBar.m6.W(context, 2131231067, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.m6.Ef), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.m6.Gf));
        org.telegram.ui.ActionBar.v5 W4 = org.telegram.ui.ActionBar.m6.W(context, 2131231065, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.m6.Ef), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.m6.Gf));
        this.f40085b2 = W4;
        int i14 = org.telegram.ui.ActionBar.m6.If;
        org.telegram.ui.ActionBar.v5 W5 = org.telegram.ui.ActionBar.m6.W(context, 2131231066, z(i14), z(i14));
        this.f40089c2 = W5;
        this.Z0 = new Drawable[]{W, W2, W3, new LayerDrawable(new Drawable[]{W4, W5})};
        this.f40080a1 = new Drawable[]{org.telegram.ui.ActionBar.m6.W(context, 2131232127, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.m6.Ef), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.m6.Gf)), org.telegram.ui.ActionBar.m6.W(context, 2131232765, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.m6.Ef), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.m6.Gf))};
        this.f40084b1 = new String[]{org.telegram.messenger.hd.N0(2131751183, null), org.telegram.messenger.hd.N0(2131751182, null), org.telegram.messenger.hd.N0(2131751181, null), org.telegram.messenger.hd.N0(2131751180, null), org.telegram.messenger.hd.N0(2131751179, null), org.telegram.messenger.hd.N0(2131751178, null), org.telegram.messenger.hd.N0(2131751177, null), org.telegram.messenger.hd.N0(2131751176, null)};
        this.K1 = chatFull;
        Paint paint = new Paint(1);
        this.f40140t1 = paint;
        paint.setColor(z(org.telegram.ui.ActionBar.m6.Sf));
        bg.q0 q0Var = bg.u0.f3362a;
        this.N1 = new bg.r0(org.telegram.messenger.g0.L(6.0f));
        tw twVar2 = new tw(this, context);
        this.K = twVar2;
        ?? obj = new Object();
        obj.f38676a = 0;
        obj.f38677b = twVar2;
        arrayList.add(obj);
        if (z10) {
            org.telegram.messenger.si.d0(i13).D(5);
            org.telegram.messenger.si.d0(i13).y();
            this.f40099f2 = new PorterDuffColorFilter(z(org.telegram.ui.ActionBar.m6.Fi), PorterDuff.Mode.SRC_IN);
        }
        gx gxVar = new gx(this, context);
        this.Q = gxVar;
        qVar2.b(gxVar);
        v4.k kVar = new v4.k();
        kVar.f59238c = 220L;
        kVar.f59239e = 220L;
        kVar.f59240f = 160L;
        kVar.f59241g = 160L;
        kVar.f59242i = nr.f37961g;
        gxVar.setItemAnimator(kVar);
        gxVar.setOnTouchListener(new View.OnTouchListener(this) {
            public final ty f39350b;

            {
                this.f39350b = this;
            }

            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                switch (r3) {
                    case 0:
                        org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
                        ty tyVar = this.f39350b;
                        gx gxVar2 = tyVar.Q;
                        tyVar.getMeasuredHeight();
                        return p10.r(motionEvent, gxVar2, null, tyVar.f40105h2, h6Var);
                    case 1:
                        org.telegram.ui.ns p11 = org.telegram.ui.ns.p();
                        ty tyVar2 = this.f39350b;
                        return p11.r(motionEvent, tyVar2.f40106i0, tyVar2.f40120n0, tyVar2.f40105h2, h6Var);
                    default:
                        org.telegram.ui.ns p12 = org.telegram.ui.ns.p();
                        ty tyVar3 = this.f39350b;
                        dw dwVar = tyVar3.E0;
                        tyVar3.getMeasuredHeight();
                        return p12.r(motionEvent, dwVar, tyVar3.B0, tyVar3.f40105h2, h6Var);
                }
            }
        });
        gxVar.setOnItemLongClickListener(new qv(this, 1));
        gxVar.setInstantClick(true);
        uw uwVar = new uw(this);
        this.R = uwVar;
        gxVar.setLayoutManager(uwVar);
        gxVar.setTopGlowOffset(org.telegram.messenger.g0.L(38.0f));
        gxVar.setBottomGlowOffset(org.telegram.messenger.g0.L(36.0f));
        gxVar.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(44.0f));
        int i15 = org.telegram.ui.ActionBar.m6.f29801zf;
        org.telegram.ui.ActionBar.t6.l(gxVar, 21, i15, h6Var);
        gxVar.setItemSelectorColorProvider(new l2(23));
        gxVar.setClipToPadding(false);
        uwVar.O = new vw(this);
        dx dxVar3 = new dx(this);
        this.S = dxVar3;
        gxVar.setAdapter(dxVar3);
        gxVar.i(new ai.j0(this, 4));
        this.T = new sx(this, context);
        twVar2.addView(gxVar, c8.ma.c(-1.0f, -1));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(gxVar, uwVar);
        this.f40087c0 = k5Var;
        k5Var.f29191r = new ww(this);
        gxVar.setOnScrollListener(new xw(this));
        if (g2Var != null) {
            pvVar = new pv(this, 2);
            twVar = twVar2;
            i7 = -1;
            z18 = z16;
            context2 = context;
            h6Var2 = h6Var;
            qVar = qVar2;
            dxVar = dxVar3;
            i10 = i14;
            i11 = 5;
            z17 = z10;
        } else {
            pvVar = null;
            z17 = z10;
            twVar = twVar2;
            i7 = -1;
            z18 = z16;
            context2 = context;
            h6Var2 = h6Var;
            qVar = qVar2;
            dxVar = dxVar3;
            i10 = i14;
            i11 = 5;
        }
        yw ywVar = new yw(this, context2, h6Var2, z17, pvVar, z18);
        this.J = ywVar;
        if (z13) {
            vv vvVar = new vv(this, context2);
            this.W = vvVar;
            twVar.addView(vvVar, new FrameLayout.LayoutParams(i7, org.telegram.messenger.g0.f1() + L));
            vvVar.d.setOnFocusChangeListener(new wv(this));
            ph.c cVar2 = new ph.c(context2, h6Var2);
            this.V = cVar2;
            cVar2.setVisibility(8);
            cVar2.setOnBackClickListener(new View.OnClickListener(this) {
                public final ty f39695b;

                {
                    this.f39695b = this;
                }

                @Override
                public final void onClick(View view) {
                    gy gyVar;
                    switch (r2) {
                        case 0:
                            sx sxVar = this.f39695b.T;
                            ox oxVar = sxVar.f39709c;
                            int childCount = oxVar.getChildCount();
                            for (int i16 = 0; i16 < childCount; i16++) {
                                ((ph.b) oxVar.getChildAt(i16)).a(false, true);
                            }
                            sxVar.d = 0L;
                            sxVar.G.f40082b.a(false, true);
                            sxVar.f();
                            return;
                        case 1:
                            oy oyVar = this.f39695b.A0;
                            ox oxVar2 = oyVar.f38403c;
                            int childCount2 = oxVar2.getChildCount();
                            for (int i17 = 0; i17 < childCount2; i17++) {
                                ((ph.b) oxVar2.getChildAt(i17)).a(false, true);
                            }
                            oyVar.d = 0L;
                            oyVar.R.f40078a.a(false, true);
                            oyVar.f();
                            return;
                        case 2:
                            tx txVar = this.f39695b.f40143u1;
                            if (txVar != null) {
                                txVar.w();
                                return;
                            }
                            return;
                        default:
                            ty tyVar = this.f39695b;
                            int currentItem = tyVar.h.getCurrentItem();
                            if (currentItem == 0) {
                                gyVar = tyVar.W;
                            } else if (currentItem == 1) {
                                gyVar = tyVar.f40125p0;
                            } else {
                                gyVar = tyVar.H0;
                            }
                            if (gyVar != null) {
                                iq iqVar = gyVar.d;
                                iqVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                iqVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                iqVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                return;
                            }
                            return;
                    }
                }
            });
            twVar.addView(cVar2, new FrameLayout.LayoutParams(i7, L));
        }
        if (Color.alpha(z(i15)) >= 255) {
            org.telegram.ui.ActionBar.t6.h(i15, ywVar, h6Var2);
        }
        dxVar.G(true);
        ywVar.p(getEmojipacks());
        twVar.addView(ywVar, c8.ma.c(36.0f, i7));
        View view = new View(context2);
        this.P = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        int i16 = org.telegram.ui.ActionBar.m6.Cf;
        org.telegram.ui.ActionBar.t6.h(i16, view, h6Var2);
        dx dxVar4 = dxVar;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i7, org.telegram.messenger.g0.f1(), 51);
        layoutParams.topMargin = org.telegram.messenger.g0.L(36.0f);
        twVar.addView(view, layoutParams);
        ph.a aVar = new ph.a(context2, h6Var2);
        this.M = aVar;
        org.telegram.ui.y61 y61Var = new org.telegram.ui.y61(context2, h6Var2);
        this.L = y61Var;
        y61Var.setVisibility(8);
        y61Var.addView(aVar, c8.ma.d(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
        twVar.addView(y61Var, c8.ma.e(i7, -2, 80));
        if (z11) {
            fl0 fl0Var = fl0.f35259b;
            if (z12) {
                xv xvVar = new xv(this, context2);
                this.f40103h0 = xvVar;
                ?? obj2 = new Object();
                obj2.f38676a = 1;
                obj2.f38677b = xvVar;
                this.d.add(obj2);
                yv yvVar = new yv(this, context2);
                this.f40106i0 = yvVar;
                qVar.b(yvVar);
                yvVar.setClipToPadding(false);
                yx yxVar = new yx(this);
                this.f40109j0 = yxVar;
                yvVar.setLayoutManager(yxVar);
                yvVar.i(new zv(this));
                yvVar.setPadding(0, L, 0, org.telegram.messenger.g0.L(44.0f) + this.f40134r2);
                ((v4.h1) yvVar.getItemAnimator()).f59194m = false;
                xx xxVar = new xx(this, context2, true, Integer.MAX_VALUE);
                this.f40122o0 = xxVar;
                yvVar.setAdapter(xxVar);
                this.f40112k0 = new xx(this, context2, false, 0);
                yvVar.setOnScrollListener(new sy(this, 2));
                yvVar.setOnTouchListener(new View.OnTouchListener(this) {
                    public final ty f39350b;

                    {
                        this.f39350b = this;
                    }

                    @Override
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        switch (r3) {
                            case 0:
                                org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
                                ty tyVar = this.f39350b;
                                gx gxVar2 = tyVar.Q;
                                tyVar.getMeasuredHeight();
                                return p10.r(motionEvent, gxVar2, null, tyVar.f40105h2, h6Var2);
                            case 1:
                                org.telegram.ui.ns p11 = org.telegram.ui.ns.p();
                                ty tyVar2 = this.f39350b;
                                return p11.r(motionEvent, tyVar2.f40106i0, tyVar2.f40120n0, tyVar2.f40105h2, h6Var2);
                            default:
                                org.telegram.ui.ns p12 = org.telegram.ui.ns.p();
                                ty tyVar3 = this.f39350b;
                                dw dwVar = tyVar3.E0;
                                tyVar3.getMeasuredHeight();
                                return p12.r(motionEvent, dwVar, tyVar3.B0, tyVar3.f40105h2, h6Var2);
                        }
                    }
                });
                ?? r10 = new qj0(this) {
                    public final ty f40061b;

                    {
                        this.f40061b = this;
                    }

                    @Override
                    public final void c(int i17, View view2) {
                        int i18;
                        String str;
                        switch (r2) {
                            case 0:
                                ty tyVar = this.f40061b;
                                yv yvVar2 = tyVar.f40106i0;
                                xx xxVar2 = tyVar.f40112k0;
                                xx xxVar3 = tyVar.f40122o0;
                                if (tyVar.f40143u1 != null) {
                                    xxVar3.getClass();
                                    ArrayList arrayList2 = xxVar3.f42243y;
                                    if (yvVar2.getAdapter() == xxVar3) {
                                        if (i17 >= 0) {
                                            int i19 = xxVar3.I;
                                            if (i17 < i19) {
                                                tyVar.f40143u1.v(view2, tyVar.f40110j1.get(i17), null, "gif", true, 0, 0);
                                                return;
                                            }
                                            if (i19 > 0) {
                                                i18 = (i17 - i19) - 1;
                                            } else {
                                                i18 = i17;
                                            }
                                            if (i18 >= 0 && i18 < arrayList2.size()) {
                                                tyVar.f40143u1.v(view2, arrayList2.get(i18), null, xxVar3.f42238n, true, 0, 0);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    } else if (yvVar2.getAdapter() == xxVar2 && i17 >= 0 && i17 < xxVar2.f42243y.size()) {
                                        tyVar.f40143u1.v(view2, xxVar2.f42243y.get(i17), xxVar2.f42242x, xxVar2.f42238n, true, 0, 0);
                                        tyVar.X();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            default:
                                ty tyVar2 = this.f40061b;
                                v4.i0 adapter = tyVar2.E0.getAdapter();
                                oy oyVar = tyVar2.A0;
                                if (adapter == oyVar) {
                                    str = oyVar.O;
                                } else {
                                    str = null;
                                }
                                String str2 = str;
                                if (view2 instanceof org.telegram.ui.Cells.a8) {
                                    org.telegram.ui.Cells.a8 a8Var = (org.telegram.ui.Cells.a8) view2;
                                    if (a8Var.getSticker() != null && org.telegram.messenger.gj.X3(a8Var.getSticker()) && !org.telegram.messenger.k10.i(org.telegram.messenger.c.a(tyVar2.f40091d1).f23202a).q()) {
                                        org.telegram.ui.ns.p().x(a8Var);
                                        return;
                                    }
                                    org.telegram.ui.ns.p().t();
                                    if (!a8Var.f30423r) {
                                        a8Var.f30423r = true;
                                        a8Var.f30422n = 0.5f;
                                        a8Var.f30427y = 0L;
                                        org.telegram.ui.Cells.z7 z7Var = a8Var.f30417a;
                                        z7Var.setAlpha(0.5f * a8Var.I);
                                        z7Var.invalidate();
                                        a8Var.f30424s = System.currentTimeMillis();
                                        a8Var.invalidate();
                                        tyVar2.f40143u1.m(a8Var, a8Var.getSticker(), str2, a8Var.getParentObject(), a8Var.getSendAnimationData(), true, 0);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                };
                this.f40120n0 = r10;
                yvVar.setOnItemClickListener((qj0) r10);
                xvVar.addView(yvVar, c8.ma.c(-1.0f, -1));
                aw awVar = new aw(this, context2);
                this.f40125p0 = awVar;
                xvVar.addView(awVar, new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1() + L));
                bx bxVar = new bx(this, context2, h6Var2);
                this.f40128q0 = bxVar;
                bxVar.setType(fl0Var);
                bxVar.setUnderlineHeight(org.telegram.messenger.g0.f1());
                bxVar.setIndicatorColor(z(i10));
                bxVar.setUnderlineColor(z(i16));
                org.telegram.ui.ActionBar.t6.h(i15, bxVar, h6Var2);
                W();
                bxVar.setDelegate(new qv(this, 2));
                xxVar.F("", "", true, true, true);
            }
            bw bwVar = new bw(this, context2, z14);
            this.f40157y0 = bwVar;
            org.telegram.messenger.si.d0(this.f40091d1).D(0);
            org.telegram.messenger.si.d0(this.f40091d1).z();
            dw dwVar = new dw(this, context2);
            this.E0 = dwVar;
            this.f40124o2.b(dwVar);
            ew ewVar = new ew(this);
            this.F0 = ewVar;
            dwVar.setLayoutManager(ewVar);
            ewVar.O = new fw(this);
            dwVar.setPadding(0, org.telegram.messenger.g0.L(36.0f), 0, org.telegram.messenger.g0.L(44.0f));
            dwVar.setClipToPadding(false);
            ?? obj3 = new Object();
            obj3.f38676a = 2;
            obj3.f38677b = bwVar;
            this.d.add(obj3);
            this.A0 = new oy(this, context2);
            ly lyVar = new ly(this, context2);
            this.f40160z0 = lyVar;
            dwVar.setAdapter(lyVar);
            dwVar.setOnTouchListener(new View.OnTouchListener(this) {
                public final ty f39350b;

                {
                    this.f39350b = this;
                }

                @Override
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    switch (r3) {
                        case 0:
                            org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
                            ty tyVar = this.f39350b;
                            gx gxVar2 = tyVar.Q;
                            tyVar.getMeasuredHeight();
                            return p10.r(motionEvent, gxVar2, null, tyVar.f40105h2, h6Var2);
                        case 1:
                            org.telegram.ui.ns p11 = org.telegram.ui.ns.p();
                            ty tyVar2 = this.f39350b;
                            return p11.r(motionEvent, tyVar2.f40106i0, tyVar2.f40120n0, tyVar2.f40105h2, h6Var2);
                        default:
                            org.telegram.ui.ns p12 = org.telegram.ui.ns.p();
                            ty tyVar3 = this.f39350b;
                            dw dwVar2 = tyVar3.E0;
                            tyVar3.getMeasuredHeight();
                            return p12.r(motionEvent, dwVar2, tyVar3.B0, tyVar3.f40105h2, h6Var2);
                    }
                }
            });
            ?? r42 = new qj0(this) {
                public final ty f40061b;

                {
                    this.f40061b = this;
                }

                @Override
                public final void c(int i17, View view2) {
                    int i18;
                    String str;
                    switch (r2) {
                        case 0:
                            ty tyVar = this.f40061b;
                            yv yvVar2 = tyVar.f40106i0;
                            xx xxVar2 = tyVar.f40112k0;
                            xx xxVar3 = tyVar.f40122o0;
                            if (tyVar.f40143u1 != null) {
                                xxVar3.getClass();
                                ArrayList arrayList2 = xxVar3.f42243y;
                                if (yvVar2.getAdapter() == xxVar3) {
                                    if (i17 >= 0) {
                                        int i19 = xxVar3.I;
                                        if (i17 < i19) {
                                            tyVar.f40143u1.v(view2, tyVar.f40110j1.get(i17), null, "gif", true, 0, 0);
                                            return;
                                        }
                                        if (i19 > 0) {
                                            i18 = (i17 - i19) - 1;
                                        } else {
                                            i18 = i17;
                                        }
                                        if (i18 >= 0 && i18 < arrayList2.size()) {
                                            tyVar.f40143u1.v(view2, arrayList2.get(i18), null, xxVar3.f42238n, true, 0, 0);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                } else if (yvVar2.getAdapter() == xxVar2 && i17 >= 0 && i17 < xxVar2.f42243y.size()) {
                                    tyVar.f40143u1.v(view2, xxVar2.f42243y.get(i17), xxVar2.f42242x, xxVar2.f42238n, true, 0, 0);
                                    tyVar.X();
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        default:
                            ty tyVar2 = this.f40061b;
                            v4.i0 adapter = tyVar2.E0.getAdapter();
                            oy oyVar = tyVar2.A0;
                            if (adapter == oyVar) {
                                str = oyVar.O;
                            } else {
                                str = null;
                            }
                            String str2 = str;
                            if (view2 instanceof org.telegram.ui.Cells.a8) {
                                org.telegram.ui.Cells.a8 a8Var = (org.telegram.ui.Cells.a8) view2;
                                if (a8Var.getSticker() != null && org.telegram.messenger.gj.X3(a8Var.getSticker()) && !org.telegram.messenger.k10.i(org.telegram.messenger.c.a(tyVar2.f40091d1).f23202a).q()) {
                                    org.telegram.ui.ns.p().x(a8Var);
                                    return;
                                }
                                org.telegram.ui.ns.p().t();
                                if (!a8Var.f30423r) {
                                    a8Var.f30423r = true;
                                    a8Var.f30422n = 0.5f;
                                    a8Var.f30427y = 0L;
                                    org.telegram.ui.Cells.z7 z7Var = a8Var.f30417a;
                                    z7Var.setAlpha(0.5f * a8Var.I);
                                    z7Var.invalidate();
                                    a8Var.f30424s = System.currentTimeMillis();
                                    a8Var.invalidate();
                                    tyVar2.f40143u1.m(a8Var, a8Var.getSticker(), str2, a8Var.getParentObject(), a8Var.getSendAnimationData(), true, 0);
                                    return;
                                }
                                return;
                            }
                            return;
                    }
                }
            };
            this.B0 = r42;
            dwVar.setOnItemClickListener((qj0) r42);
            org.telegram.ui.ActionBar.t6.l(dwVar, 21, i15, h6Var2);
            bwVar.addView(dwVar);
            this.f40083b0 = new org.telegram.ui.ActionBar.k5(dwVar, ewVar);
            gw gwVar = new gw(this, context2);
            this.H0 = gwVar;
            bwVar.addView(gwVar, new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1() + L));
            ph.c cVar3 = new ph.c(context2, h6Var2);
            this.I0 = cVar3;
            cVar3.setVisibility(8);
            cVar3.setOnBackClickListener(new View.OnClickListener(this) {
                public final ty f39695b;

                {
                    this.f39695b = this;
                }

                @Override
                public final void onClick(View view2) {
                    gy gyVar;
                    switch (r2) {
                        case 0:
                            sx sxVar = this.f39695b.T;
                            ox oxVar = sxVar.f39709c;
                            int childCount = oxVar.getChildCount();
                            for (int i162 = 0; i162 < childCount; i162++) {
                                ((ph.b) oxVar.getChildAt(i162)).a(false, true);
                            }
                            sxVar.d = 0L;
                            sxVar.G.f40082b.a(false, true);
                            sxVar.f();
                            return;
                        case 1:
                            oy oyVar = this.f39695b.A0;
                            ox oxVar2 = oyVar.f38403c;
                            int childCount2 = oxVar2.getChildCount();
                            for (int i17 = 0; i17 < childCount2; i17++) {
                                ((ph.b) oxVar2.getChildAt(i17)).a(false, true);
                            }
                            oyVar.d = 0L;
                            oyVar.R.f40078a.a(false, true);
                            oyVar.f();
                            return;
                        case 2:
                            tx txVar = this.f39695b.f40143u1;
                            if (txVar != null) {
                                txVar.w();
                                return;
                            }
                            return;
                        default:
                            ty tyVar = this.f39695b;
                            int currentItem = tyVar.h.getCurrentItem();
                            if (currentItem == 0) {
                                gyVar = tyVar.W;
                            } else if (currentItem == 1) {
                                gyVar = tyVar.f40125p0;
                            } else {
                                gyVar = tyVar.H0;
                            }
                            if (gyVar != null) {
                                iq iqVar = gyVar.d;
                                iqVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                iqVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                iqVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                return;
                            }
                            return;
                    }
                }
            });
            bwVar.addView(cVar3, new FrameLayout.LayoutParams(-1, L));
            z19 = z14;
            i12 = 80;
            hw hwVar = new hw(this, context2, h6Var2, g2Var, z19);
            this.C0 = hwVar;
            hwVar.setDragEnabled(true);
            hwVar.setWillNotDraw(false);
            hwVar.setType(fl0Var);
            hwVar.setUnderlineHeight(dwVar.canScrollVertically(-1) ? org.telegram.messenger.g0.f1() : 0);
            hwVar.setIndicatorColor(z(i10));
            hwVar.setUnderlineColor(z(i16));
            if (viewGroup != null && z19) {
                iw iwVar = new iw(this, context2);
                this.D0 = iwVar;
                iwVar.addView(hwVar, c8.ma.e(-1, 36, 51));
                viewGroup.addView(iwVar, c8.ma.c(-2.0f, -1));
            } else {
                bwVar.addView(hwVar, c8.ma.e(-1, 36, 51));
            }
            Y(true);
            hwVar.setDelegate(new qv(this, 4));
            dwVar.setOnScrollListener(new sy(this, 0));
            ph.a aVar2 = new ph.a(context2, h6Var2);
            this.O = aVar2;
            org.telegram.ui.y61 y61Var2 = new org.telegram.ui.y61(context2, h6Var2);
            this.N = y61Var2;
            y61Var2.setVisibility(8);
            y61Var2.addView(aVar2, c8.ma.d(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
            bwVar.addView(y61Var2, c8.ma.e(-1, -2, 80));
        } else {
            i12 = 80;
            z19 = z14;
        }
        this.f40092e.clear();
        this.f40092e.addAll(this.d);
        jw jwVar = new jw(this, context2);
        this.h = jwVar;
        ri.q qVar3 = this.f40124o2;
        qVar3.getClass();
        jwVar.b(new ri.i(qVar3, jwVar));
        jwVar.setOverScrollMode(2);
        nx nxVar = new nx(this);
        this.M0 = nxVar;
        jwVar.setAdapter(nxVar);
        kw kwVar = new kw(this, context2);
        this.f40156y = kwVar;
        kwVar.setHapticFeedbackEnabled(true);
        kwVar.setImageResource(2131232741);
        int v = z16 ? v(0.6f) : z(org.telegram.ui.ActionBar.m6.Jf);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        kwVar.setColorFilter(new PorterDuffColorFilter(v, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        kwVar.setScaleType(scaleType);
        kwVar.setContentDescription(org.telegram.messenger.hd.N0(2131754920, null));
        kwVar.setFocusable(true);
        kwVar.setOnClickListener(new Object());
        c8.ra.a(kwVar);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f40131r = frameLayout;
        if (z13) {
            addView(frameLayout, c8.ma.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, (org.telegram.messenger.g0.f1() / org.telegram.messenger.g0.f24045p) + 40.0f));
        } else {
            addView(frameLayout, c8.ma.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.f40135s = frameLayout2;
        addView(frameLayout2, c8.ma.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 64.0f));
        FrameLayout frameLayout3 = new FrameLayout(context2);
        this.f40119n = frameLayout3;
        View view2 = new View(context2);
        this.f40148w = view2;
        frameLayout3.addView(view2, new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.L(40.0f), 83));
        if (z13) {
            addView(frameLayout3, c8.ma.e(-1, 48, i12));
            frameLayout3.addView(kwVar, c8.ma.d(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
            if (z11) {
                ImageView imageView = new ImageView(context2);
                this.E = imageView;
                imageView.setImageResource(2131232744);
                imageView.setColorFilter(new PorterDuffColorFilter(z16 ? v(0.6f) : z(org.telegram.ui.ActionBar.m6.Jf), mode));
                imageView.setScaleType(scaleType);
                imageView.setFocusable(true);
                imageView.setContentDescription(org.telegram.messenger.hd.N0(2131745299, null));
                c8.ra.a(imageView);
                frameLayout3.addView(imageView, c8.ma.d(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
                imageView.setOnClickListener(new View.OnClickListener(this) {
                    public final ty f39695b;

                    {
                        this.f39695b = this;
                    }

                    @Override
                    public final void onClick(View view22) {
                        gy gyVar;
                        switch (r2) {
                            case 0:
                                sx sxVar = this.f39695b.T;
                                ox oxVar = sxVar.f39709c;
                                int childCount = oxVar.getChildCount();
                                for (int i162 = 0; i162 < childCount; i162++) {
                                    ((ph.b) oxVar.getChildAt(i162)).a(false, true);
                                }
                                sxVar.d = 0L;
                                sxVar.G.f40082b.a(false, true);
                                sxVar.f();
                                return;
                            case 1:
                                oy oyVar = this.f39695b.A0;
                                ox oxVar2 = oyVar.f38403c;
                                int childCount2 = oxVar2.getChildCount();
                                for (int i17 = 0; i17 < childCount2; i17++) {
                                    ((ph.b) oxVar2.getChildAt(i17)).a(false, true);
                                }
                                oyVar.d = 0L;
                                oyVar.R.f40078a.a(false, true);
                                oyVar.f();
                                return;
                            case 2:
                                tx txVar = this.f39695b.f40143u1;
                                if (txVar != null) {
                                    txVar.w();
                                    return;
                                }
                                return;
                            default:
                                ty tyVar = this.f39695b;
                                int currentItem = tyVar.h.getCurrentItem();
                                if (currentItem == 0) {
                                    gyVar = tyVar.W;
                                } else if (currentItem == 1) {
                                    gyVar = tyVar.f40125p0;
                                } else {
                                    gyVar = tyVar.H0;
                                }
                                if (gyVar != null) {
                                    iq iqVar = gyVar.d;
                                    iqVar.requestFocus();
                                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                    iqVar.onTouchEvent(obtain);
                                    obtain.recycle();
                                    MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                    iqVar.onTouchEvent(obtain2);
                                    obtain2.recycle();
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            cc0 cc0Var = new cc0(context2, h6Var2);
            this.f40152x = cc0Var;
            cc0Var.setViewPager(jwVar);
            cc0Var.setShouldExpand(false);
            cc0Var.setIndicatorHeight(org.telegram.messenger.g0.L(3.0f));
            cc0Var.setIndicatorColor(i0.a.o(z(org.telegram.ui.ActionBar.m6.Gf), 20));
            cc0Var.setUnderlineHeight(0);
            cc0Var.setTabPaddingLeftRight(org.telegram.messenger.g0.L(11.0f));
            cc0Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(11.0f));
            frameLayout3.addView(cc0Var, c8.ma.e(-2, 48, 81));
            cc0Var.setOnPageChangeListener(new mw(this, z19));
            ImageView imageView2 = new ImageView(context2);
            this.F = imageView2;
            imageView2.setImageResource(2131232743);
            imageView2.setColorFilter(new PorterDuffColorFilter(z16 ? v(0.6f) : z(org.telegram.ui.ActionBar.m6.Jf), mode));
            imageView2.setScaleType(scaleType);
            imageView2.setContentDescription(org.telegram.messenger.hd.N0(2131745640, null));
            imageView2.setFocusable(true);
            imageView2.setVisibility(8);
            frameLayout3.addView(imageView2, c8.ma.d(48, 48.0f, 83, 2.0f, 0.0f, 2.0f, 0.0f));
            imageView2.setOnClickListener(new View.OnClickListener(this) {
                public final ty f39695b;

                {
                    this.f39695b = this;
                }

                @Override
                public final void onClick(View view22) {
                    gy gyVar;
                    switch (r2) {
                        case 0:
                            sx sxVar = this.f39695b.T;
                            ox oxVar = sxVar.f39709c;
                            int childCount = oxVar.getChildCount();
                            for (int i162 = 0; i162 < childCount; i162++) {
                                ((ph.b) oxVar.getChildAt(i162)).a(false, true);
                            }
                            sxVar.d = 0L;
                            sxVar.G.f40082b.a(false, true);
                            sxVar.f();
                            return;
                        case 1:
                            oy oyVar = this.f39695b.A0;
                            ox oxVar2 = oyVar.f38403c;
                            int childCount2 = oxVar2.getChildCount();
                            for (int i17 = 0; i17 < childCount2; i17++) {
                                ((ph.b) oxVar2.getChildAt(i17)).a(false, true);
                            }
                            oyVar.d = 0L;
                            oyVar.R.f40078a.a(false, true);
                            oyVar.f();
                            return;
                        case 2:
                            tx txVar = this.f39695b.f40143u1;
                            if (txVar != null) {
                                txVar.w();
                                return;
                            }
                            return;
                        default:
                            ty tyVar = this.f39695b;
                            int currentItem = tyVar.h.getCurrentItem();
                            if (currentItem == 0) {
                                gyVar = tyVar.W;
                            } else if (currentItem == 1) {
                                gyVar = tyVar.f40125p0;
                            } else {
                                gyVar = tyVar.H0;
                            }
                            if (gyVar != null) {
                                iq iqVar = gyVar.d;
                                iqVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                iqVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                iqVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                return;
                            }
                            return;
                    }
                }
            });
        } else {
            addView(frameLayout3, c8.ma.d(56, 48.0f, (org.telegram.messenger.hd.f24444a0 ? 3 : i11) | 80, 0.0f, 0.0f, 2.0f, 0.0f));
            org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.m6.j0(org.telegram.messenger.g0.L(56.0f), z(i15), z(i15));
            c8.ra.a(kwVar);
            kwVar.setPadding(0, 0, org.telegram.messenger.g0.L(2.0f), 0);
            kwVar.setBackground(j02);
            kwVar.setContentDescription(org.telegram.messenger.hd.N0(2131754920, null));
            kwVar.setFocusable(true);
            frameLayout3.addView(kwVar, c8.ma.d(48, 48.0f, 51, 2.0f, 0.0f, 2.0f, 0.0f));
            view2.setVisibility(8);
        }
        addView(jwVar, 0, c8.ma.e(-1, -1, 51));
        di.xb xbVar = new di.xb(context2, 24);
        this.O0 = xbVar;
        int L2 = org.telegram.messenger.g0.L(6.0f);
        int i17 = org.telegram.ui.ActionBar.m6.hg;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(L2, z(i17));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i17);
        xbVar.setBackground(d02);
        org.telegram.ui.ActionBar.t6.j(xbVar, d02, M, null, h6Var2);
        org.telegram.ui.ActionBar.t6.U(xbVar, org.telegram.ui.ActionBar.m6.f29446gg, h6Var2);
        xbVar.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(7.0f));
        char c10 = 16;
        xbVar.setGravity(16);
        xbVar.setTextSize(1, 14.0f);
        xbVar.setVisibility(4);
        addView(xbVar, c8.ma.d(-2, -2.0f, 81, 5.0f, 0.0f, 5.0f, 53.0f));
        this.D1 = org.telegram.messenger.g0.L(org.telegram.messenger.g0.Q1() ? 40.0f : 32.0f);
        Field field2 = ku.f36980f;
        ku kuVar = new ku(new ju(context2, h6Var2));
        if (ku.f36980f == null) {
            try {
                field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
                try {
                    field.setAccessible(true);
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                field = null;
            }
            ku.f36980f = field;
        }
        Field field3 = ku.f36980f;
        if (field3 != null) {
            try {
                kuVar.f36982a = (ViewTreeObserver.OnScrollChangedListener) field3.get(kuVar);
                ku.f36980f.set(kuVar, ku.f36981g);
            } catch (Exception unused3) {
                kuVar.f36982a = null;
            }
        }
        this.C1 = kuVar;
        kuVar.f36984c.setOnSelectionUpdateListener(new d(this, 11));
        this.B1 = org.telegram.messenger.np.f1().getInt("selected_page", 0);
        HashMap hashMap = org.telegram.messenger.j6.h;
        if (!org.telegram.messenger.j6.f24838k) {
            org.telegram.messenger.j6.f24838k = true;
            SharedPreferences f12 = org.telegram.messenger.np.f1();
            try {
                hashMap.clear();
                if (f12.contains("emojis")) {
                    String string = f12.getString("emojis", "");
                    if (string != null && string.length() > 0) {
                        String[] split = string.split(",");
                        int length = split.length;
                        int i18 = 0;
                        while (i18 < length) {
                            String[] split2 = split[i18].split("=");
                            long longValue = Utilities.A(split2[0]).longValue();
                            StringBuilder sb2 = new StringBuilder();
                            char c11 = c10;
                            String[] strArr = split;
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
                            i18++;
                            c10 = c11;
                            split = strArr;
                        }
                    }
                    f12.edit().remove("emojis").commit();
                    org.telegram.messenger.j6.r();
                } else {
                    String string2 = f12.getString("emojis2", "");
                    if (string2 != null && string2.length() > 0) {
                        for (String str : string2.split(",")) {
                            String[] split3 = str.split("=");
                            hashMap.put(split3[0], Utilities.z(split3[1]));
                        }
                    }
                }
                if (hashMap.isEmpty() && !f12.getBoolean("filled_default", false)) {
                    int i21 = 0;
                    while (true) {
                        String[] strArr2 = org.telegram.messenger.j6.f24842o;
                        if (i21 >= strArr2.length) {
                            break;
                        }
                        hashMap.put(strArr2[i21], Integer.valueOf(strArr2.length - i21));
                        i21++;
                    }
                    f12.edit().putBoolean("filled_default", true).commit();
                    org.telegram.messenger.j6.r();
                }
                org.telegram.messenger.j6.s();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            try {
                String string3 = f12.getString("color", "");
                if (string3 != null && string3.length() > 0) {
                    for (String str2 : string3.split(",")) {
                        String[] split4 = str2.split("=");
                        org.telegram.messenger.j6.f24837j.put(split4[0], split4[1]);
                    }
                }
            } catch (Exception e11) {
                z20 = true;
                org.telegram.messenger.a8.g(e11, true);
                dxVar2 = dxVar4;
                z21 = false;
            }
        }
        dxVar2 = dxVar4;
        z21 = false;
        z20 = true;
        dxVar2.F(z21);
        J(z20, z11, z12, z21);
        if (Build.VERSION.SDK_INT >= 31) {
            dh.g gVar = new dh.g(z21);
            this.f40114k2 = gVar;
            this.f40124o2.a(gVar);
            ui.f fVar = new ui.f(null);
            fVar.f59050f = cVar;
            fVar.d = gVar;
            fVar.f59049e = -2;
            dh.c cVar4 = new dh.c(fVar, fVar, fVar);
            this.f40121n2 = cVar4;
            cVar4.f8411k = true;
            int L3 = org.telegram.messenger.g0.L(org.telegram.messenger.qc.e(262144) ? 8.0f : 48.0f);
            cVar4.d = L3;
            cVar4.f8406e = L3;
            cVar4.f8410j = this.f40124o2;
        } else {
            dh.c cVar5 = new dh.c(cVar, cVar, cVar);
            this.f40121n2 = cVar5;
            cVar5.f8410j = this.f40124o2;
            this.f40114k2 = null;
        }
        this.f40116l2 = new kh(this, 1);
        setBlurredBackgroundDrawableFactory(this.f40121n2);
        this.f40124o2.i(this);
        this.f40124o2.f56739a = new qv(this, 0);
    }

    public static void a(ty tyVar, boolean z10) {
        yv yvVar = tyVar.f40106i0;
        if (yvVar != null) {
            int childCount = yvVar.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = yvVar.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.i2) {
                    ImageReceiver photoImage = ((org.telegram.ui.Cells.i2) childAt).getPhotoImage();
                    if (z10) {
                        photoImage.f22695u0 = true;
                        photoImage.P0(false);
                    } else {
                        photoImage.f22695u0 = false;
                        photoImage.Q0();
                    }
                }
            }
        }
    }

    public static void d(ty tyVar, cy cyVar, String str) {
        String str2;
        String str3;
        boolean z10;
        String str4;
        tx txVar;
        lc lcVar;
        org.telegram.ui.ActionBar.g2 g2Var = tyVar.Z1;
        int i7 = tyVar.f40091d1;
        ArrayList arrayList = tyVar.f40133r1;
        if (cyVar != null) {
            if (cyVar.getSpan() != null) {
                if (tyVar.f40143u1 != null) {
                    long j3 = cyVar.getSpan().documentId;
                    TLRPC.Document document = cyVar.getSpan().document;
                    hx hxVar = cyVar.f34327e;
                    if (hxVar != null && hxVar.f35986i) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (document == null) {
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            hx hxVar2 = (hx) arrayList.get(i10);
                            int i11 = 0;
                            while (true) {
                                ArrayList arrayList2 = hxVar2.f35982c;
                                if (arrayList2 != null && i11 < arrayList2.size()) {
                                    if (((TLRPC.Document) hxVar2.f35982c.get(i11)).f28440id == j3) {
                                        document = (TLRPC.Document) hxVar2.f35982c.get(i11);
                                        break;
                                    }
                                    i11++;
                                }
                            }
                        }
                    }
                    if (document == null) {
                        document = p5.e(i7, j3);
                    }
                    TLRPC.Document document2 = document;
                    if (document2 != null) {
                        str4 = org.telegram.messenger.gj.U(document2);
                    } else {
                        str4 = null;
                    }
                    if (!org.telegram.messenger.gj.m3(document2) && !org.telegram.messenger.k10.i(i7).q() && (((txVar = tyVar.f40143u1) == null || !txVar.g()) && !tyVar.V0 && !z10)) {
                        tyVar.N(false);
                        if (g2Var != null) {
                            lcVar = lc.b0(g2Var);
                        } else {
                            lcVar = new lc(tyVar.f40131r, tyVar.f40081a2);
                        }
                        if (!tyVar.f40108i2 && g2Var != null) {
                            lcVar.K(2131624191, org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(2131743618, null)), org.telegram.messenger.hd.N0(2131747623, null), new pv(tyVar, 4)).j();
                        } else {
                            lcVar.r(document2, org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(2131743619, null)), org.telegram.messenger.hd.N0(2131746839, null), new pv(tyVar, 3)).j();
                        }
                        tyVar.f40108i2 = !tyVar.f40108i2;
                        return;
                    }
                    tyVar.E2 = SystemClock.elapsedRealtime();
                    tyVar.N(true);
                    tyVar.h("animated_" + j3);
                    tyVar.f40143u1.x(j3, document2, str4, cyVar.f34326c);
                    return;
                }
                return;
            }
            tyVar.E2 = SystemClock.elapsedRealtime();
            tyVar.N(true);
            if (str != null) {
                str2 = str;
            } else {
                str2 = (String) cyVar.getTag();
            }
            new SpannableStringBuilder().append((CharSequence) str2);
            if (str == null) {
                if (!cyVar.f34326c && (str3 = (String) org.telegram.messenger.j6.f24837j.get(str2)) != null) {
                    str2 = g(str2, str3);
                }
                tyVar.h(str2);
                tx txVar2 = tyVar.f40143u1;
                if (txVar2 != null) {
                    txVar2.l(org.telegram.messenger.j6.c(str2));
                    return;
                }
                return;
            }
            tx txVar3 = tyVar.f40143u1;
            if (txVar3 != null) {
                txVar3.l(org.telegram.messenger.j6.c(str));
            }
        }
    }

    public static void e(ty tyVar, int i7, int i10) {
        v4.f1 K;
        int[] iArr = tyVar.R0;
        if (i7 == 1) {
            tyVar.n(i10, tyVar.Q);
            return;
        }
        tx txVar = tyVar.f40143u1;
        if ((txVar == null || !txVar.z()) && !tyVar.K0) {
            ek0 x10 = tyVar.x(i7);
            if (i10 > 0 && x10 != null && x10.getVisibility() == 0 && (K = x10.K(0)) != null && K.f59165a.getTop() + tyVar.f40088c1 >= x10.getPaddingTop()) {
                return;
            }
            int i11 = iArr[i7] - i10;
            iArr[i7] = i11;
            if (i11 > 0) {
                iArr[i7] = 0;
            } else if (i11 < (-org.telegram.messenger.g0.L(288.0f))) {
                iArr[i7] = -org.telegram.messenger.g0.L(288.0f);
            }
            if (i7 == 0) {
                tyVar.Z();
            } else {
                tyVar.y(i7).setTranslationY(Math.max(-org.telegram.messenger.g0.L(48.0f), iArr[i7]));
            }
        }
    }

    public static void f(ty tyVar, boolean z10) {
        int N0;
        yx yxVar = tyVar.f40109j0;
        aw awVar = tyVar.f40125p0;
        yv yvVar = tyVar.f40106i0;
        if (yvVar != null && (yvVar.getAdapter() instanceof xx)) {
            xx xxVar = (xx) yvVar.getAdapter();
            if (!xxVar.f42240s && xxVar.h == 0 && !xxVar.f42243y.isEmpty() && (N0 = yxVar.N0()) != -1 && N0 > yxVar.B() - 5) {
                String str = xxVar.f42242x;
                String str2 = xxVar.f42239r;
                boolean z11 = xxVar.f42241w;
                xxVar.F(str, str2, true, z11, z11);
            }
        }
        tx txVar = tyVar.f40143u1;
        if (txVar != null && txVar.z()) {
            boolean z12 = false;
            v4.f1 K = yvVar.K(0);
            if (K == null) {
                gy.a(awVar, true, !z10);
                return;
            }
            if (K.f59165a.getTop() < yvVar.getPaddingTop()) {
                z12 = true;
            }
            gy.a(awVar, z12, !z10);
        } else if (awVar != null && yvVar != null) {
            awVar.f35712a.a(true, !z10);
        }
    }

    public static String g(String str, String str2) {
        String str3;
        String str4;
        boolean z10 = true;
        if (org.telegram.messenger.j4.c(str) != null) {
            if (org.telegram.messenger.j4.c(str) == null) {
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
        if (org.telegram.messenger.j6.b(str)) {
            str = com.google.android.gms.internal.vision.e2.k(str, 2, 0);
        } else {
            z10 = false;
        }
        int length = str.length();
        if (length > 2 && str.charAt(str.length() - 2) == 8205) {
            str3 = str.substring(str.length() - 2);
            str = com.google.android.gms.internal.vision.e2.k(str, 2, 0);
        } else if (length > 3 && str.charAt(str.length() - 3) == 8205) {
            str3 = str.substring(str.length() - 3);
            str = com.google.android.gms.internal.vision.e2.k(str, 3, 0);
        } else {
            str3 = null;
        }
        String v = p5.c.v(str, str2);
        if (str3 != null) {
            v = p5.c.v(v, str3);
        }
        if (z10) {
            return p5.c.v(v, "\u200d➡");
        }
        return v;
    }

    public static void j(int i7, View view) {
        if (view == null) {
            return;
        }
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i7);
    }

    public final void A() {
        gw gwVar = this.H0;
        if (gwVar != null) {
            gwVar.b();
        }
        aw awVar = this.f40125p0;
        if (awVar != null) {
            awVar.b();
        }
        vv vvVar = this.W;
        if (vvVar != null) {
            vvVar.b();
        }
    }

    public final void B() {
        xi.e eVar = this.N2;
        if (eVar != null) {
            eVar.b();
            this.N2 = null;
        }
        xi.e eVar2 = this.O2;
        if (eVar2 != null) {
            eVar2.b();
            this.O2 = null;
            this.P2 = false;
        }
    }

    public final void C(boolean z10, boolean z11) {
        fy fyVar;
        boolean z12;
        if (this.B1 != 0 && this.f40154x1) {
            this.B1 = 0;
        }
        if (this.B1 == 0 && this.f40150w1) {
            this.B1 = 1;
        }
        int i7 = this.B1;
        jw jwVar = this.h;
        if (i7 != 0 && !z10 && this.f40092e.size() != 1) {
            int i10 = this.B1;
            if (i10 == 1) {
                M(false, false);
                if (!this.f40145v0 && !this.f40149w0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                R(z12, false);
                if (jwVar.getCurrentItem() != 2) {
                    jwVar.x(2, false);
                }
                hw hwVar = this.C0;
                if (hwVar != null) {
                    this.T0 = true;
                    int i11 = this.H1;
                    if (i11 >= 0) {
                        hwVar.m(i11);
                    } else {
                        int i12 = this.G1;
                        if (i12 >= 0) {
                            hwVar.m(i12);
                        } else {
                            hwVar.m(this.F1);
                        }
                    }
                    this.T0 = false;
                    this.F0.h1(0, 0);
                }
            } else if (i10 == 2) {
                M(false, false);
                R(false, false);
                if (jwVar.getCurrentItem() != 1) {
                    jwVar.x(1, false);
                }
                bx bxVar = this.f40128q0;
                if (bxVar != null) {
                    bxVar.m(0);
                }
                aw awVar = this.f40125p0;
                if (awVar != null && (fyVar = awVar.f35718r) != null) {
                    fyVar.I1(null);
                }
            }
        } else {
            M(true, false);
            R(false, false);
            if (jwVar.getCurrentItem() != 0) {
                jwVar.x(0, !z10);
            }
            if (z11) {
                org.telegram.messenger.g0.h3(new pv(this, 5), 350L);
            }
        }
        N(true);
    }

    public final void E() {
        ly lyVar = this.f40160z0;
        if (lyVar != null) {
            lyVar.f();
        }
        oy oyVar = this.A0;
        if (oyVar != null) {
            oyVar.f();
        }
        if (org.telegram.ui.ns.p().E) {
            org.telegram.ui.ns.p().m();
        }
        org.telegram.ui.ns.p().t();
    }

    public final void F(int i7) {
        tx txVar = this.f40143u1;
        if ((txVar != null && txVar.z()) || i7 == 0) {
            return;
        }
        HorizontalScrollView y10 = y(i7);
        this.R0[i7] = 0;
        y10.setTranslationY(0);
    }

    public final void G(int i7, int i10) {
        uw uwVar = this.R;
        View m10 = uwVar.m(i7);
        int L0 = uwVar.L0();
        int i11 = 1;
        if ((m10 == null && Math.abs(i7 - L0) > uwVar.J * 9.0f) || !org.telegram.messenger.cz.c()) {
            if (uwVar.L0() < i7) {
                i11 = 0;
            }
            org.telegram.ui.ActionBar.k5 k5Var = this.f40087c0;
            k5Var.f29186b = i11;
            k5Var.k(i7, i10, false, false);
            return;
        }
        this.K0 = true;
        hi.l1 l1Var = new hi.l1(1, this.Q.getContext(), this);
        l1Var.f59109a = i7;
        l1Var.f55744p = i10;
        uwVar.w0(l1Var);
    }

    @Override
    public final void H(int i7, float f10, float f11, te.c cVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = 4;
        if (i7 == 0) {
            q(false);
            float f12 = 1.0f - this.f40078a.f57700e;
            gw gwVar = this.H0;
            gwVar.setAlpha(f12);
            if (f12 > 0.0f) {
                i12 = 0;
            } else {
                i12 = 4;
            }
            gwVar.setVisibility(i12);
            float f13 = 1.0f - f12;
            ph.c cVar2 = this.I0;
            cVar2.setAlpha(f13);
            cVar2.setTranslationY((-org.telegram.messenger.g0.L(15.0f)) * f12);
            int i15 = (f13 > 0.0f ? 1 : (f13 == 0.0f ? 0 : -1));
            if (i15 > 0) {
                i13 = 0;
            } else {
                i13 = 4;
            }
            cVar2.setVisibility(i13);
            org.telegram.ui.y61 y61Var = this.N;
            y61Var.setAlpha(f13);
            y61Var.setTranslationY(org.telegram.messenger.g0.L(30.0f) * f12);
            if (i15 > 0) {
                i14 = 0;
            }
            y61Var.setVisibility(i14);
            S();
            this.f40157y0.invalidate();
        } else if (i7 == 1) {
            l(false);
            float f14 = 1.0f - this.f40082b.f57700e;
            vv vvVar = this.W;
            vvVar.setAlpha(f14);
            if (f14 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            vvVar.setVisibility(i10);
            float f15 = 1.0f - f14;
            ph.c cVar3 = this.V;
            cVar3.setAlpha(f15);
            cVar3.setTranslationY((-org.telegram.messenger.g0.L(15.0f)) * f14);
            int i16 = (f15 > 0.0f ? 1 : (f15 == 0.0f ? 0 : -1));
            if (i16 > 0) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            cVar3.setVisibility(i11);
            org.telegram.ui.y61 y61Var2 = this.L;
            y61Var2.setAlpha(f15);
            y61Var2.setTranslationY(org.telegram.messenger.g0.L(30.0f) * f14);
            if (i16 > 0) {
                i14 = 0;
            }
            y61Var2.setVisibility(i14);
            S();
            this.K.invalidate();
        }
    }

    public final void I(int i7, int i10) {
        ew ewVar = this.F0;
        View m10 = ewVar.m(i7);
        int L0 = ewVar.L0();
        int i11 = 1;
        if (m10 == null && Math.abs(i7 - L0) > 40) {
            if (ewVar.L0() < i7) {
                i11 = 0;
            }
            org.telegram.ui.ActionBar.k5 k5Var = this.f40083b0;
            k5Var.f29186b = i11;
            k5Var.k(i7, i10, false, false);
            return;
        }
        this.K0 = true;
        this.E0.y0(i7);
    }

    public final void J(boolean z10, boolean z11, boolean z12, boolean z13) {
        ArrayList arrayList = this.f40092e;
        arrayList.clear();
        boolean z14 = false;
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.d;
            if (i7 >= arrayList2.size()) {
                break;
            }
            if (((py) arrayList2.get(i7)).f38676a == 0 && z10) {
                arrayList.add((py) arrayList2.get(i7));
            }
            if (((py) arrayList2.get(i7)).f38676a == 1 && z12) {
                arrayList.add((py) arrayList2.get(i7));
            }
            if (((py) arrayList2.get(i7)).f38676a == 2 && z11) {
                arrayList.add((py) arrayList2.get(i7));
            }
            i7++;
        }
        cc0 cc0Var = this.f40152x;
        if (cc0Var != null) {
            if (arrayList.size() > 1) {
                z14 = true;
            }
            org.telegram.messenger.g0.X3(cc0Var, z14, 1.0f, true, z13);
        }
        jw jwVar = this.h;
        if (jwVar != null) {
            jwVar.setAdapter(null);
            jwVar.setAdapter(this.M0);
            if (cc0Var != null) {
                cc0Var.setViewPager(jwVar);
            }
        }
    }

    public final void K(final ph.a aVar, final TLObject tLObject, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final boolean z10, boolean z11) {
        String G;
        oy oyVar;
        sx sxVar;
        if (stickerSet != null) {
            if (!z10 || (sxVar = this.T) == null || sxVar.d == stickerSet.f28461id) {
                if (!z10 && (oyVar = this.A0) != null && oyVar.d != stickerSet.f28461id) {
                    return;
                }
                final boolean E0 = org.telegram.messenger.si.d0(this.f40091d1).E0(stickerSet.f28461id, true);
                if (E0) {
                    if (stickerSet.masks) {
                        G = org.telegram.messenger.hd.G(stickerSet.count, "RemoveManyMasksCount", new Object[0]);
                    } else if (stickerSet.emojis) {
                        G = org.telegram.messenger.hd.G(stickerSet.count, "RemoveManyEmojiCount", new Object[0]);
                    } else {
                        G = org.telegram.messenger.hd.G(stickerSet.count, "RemoveManyStickersCount", new Object[0]);
                    }
                } else if (stickerSet.masks) {
                    G = org.telegram.messenger.hd.G(stickerSet.count, "AddManyMasksCount", new Object[0]);
                } else if (stickerSet.emojis) {
                    G = org.telegram.messenger.hd.G(stickerSet.count, "AddManyEmojiCount", new Object[0]);
                } else {
                    G = org.telegram.messenger.hd.G(stickerSet.count, "AddManyStickersCount", new Object[0]);
                }
                aVar.i(G, z11, true);
                aVar.m0.a(!E0, z11);
                aVar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        int i7;
                        ty tyVar = ty.this;
                        org.telegram.messenger.si d02 = org.telegram.messenger.si.d0(tyVar.f40091d1);
                        Context context = tyVar.getContext();
                        if (E0) {
                            i7 = 0;
                        } else {
                            i7 = 2;
                        }
                        int i10 = i7;
                        org.telegram.ui.ActionBar.g2 g2Var = tyVar.Z1;
                        FrameLayout frameLayout = tyVar.f40135s;
                        ph.a aVar2 = aVar;
                        TLObject tLObject2 = tLObject;
                        TLRPC.StickerSet stickerSet2 = stickerSet;
                        TLRPC.Document document2 = document;
                        boolean z12 = z10;
                        d02.l2(context, tLObject2, document2, i10, g2Var, frameLayout, false, true, new di.o3(tyVar, aVar2, tLObject2, stickerSet2, document2, z12), false);
                        tyVar.K(aVar2, tLObject2, stickerSet2, document2, z12, true);
                    }
                });
            }
        }
    }

    public final void L(long j3, boolean z10, boolean z11) {
        int i7;
        View childAt;
        float f10;
        cc0 cc0Var = this.f40152x;
        if (cc0Var != null) {
            this.f40150w1 = z10;
            this.f40154x1 = z11;
            if (!z11 && !z10) {
                this.f40146v1 = 0L;
            } else {
                this.f40146v1 = j3;
            }
            if (z11) {
                i7 = 2;
            } else {
                i7 = 0;
            }
            LinearLayout linearLayout = cc0Var.d;
            if (i7 >= linearLayout.getChildCount()) {
                childAt = null;
            } else {
                childAt = linearLayout.getChildAt(i7);
            }
            if (childAt != null) {
                if (this.f40146v1 != 0) {
                    f10 = 0.15f;
                } else {
                    f10 = 1.0f;
                }
                childAt.setAlpha(f10);
                jw jwVar = this.h;
                if (z11) {
                    if (this.f40146v1 != 0 && jwVar.getCurrentItem() != 0) {
                        M(true, true);
                        R(false, true);
                        jwVar.x(0, false);
                    }
                } else if (this.f40146v1 != 0 && jwVar.getCurrentItem() != 1) {
                    M(false, true);
                    R(false, true);
                    jwVar.x(1, false);
                }
            }
        }
    }

    public final void M(boolean z10, boolean z11) {
        float f10;
        float f11;
        float f12;
        float f13;
        kw kwVar = this.f40156y;
        if (!z10 || kwVar.getTag() != null) {
            if ((!z10 && kwVar.getTag() != null) || this.f40127p2) {
                return;
            }
            AnimatorSet animatorSet = this.G;
            Integer num = null;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.G = null;
            }
            if (!z10) {
                num = 1;
            }
            kwVar.setTag(num);
            int i7 = 0;
            float f14 = 0.0f;
            if (z11) {
                if (z10) {
                    kwVar.setVisibility(0);
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.G = animatorSet2;
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(kwVar, View.ALPHA, f12);
                if (z10) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(kwVar, View.SCALE_X, f13);
                if (z10) {
                    f14 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(kwVar, View.SCALE_Y, f14));
                this.G.setDuration(200L);
                this.G.setInterpolator(nr.f37961g);
                this.G.addListener(new qw(this, z10, 0));
                this.G.start();
                return;
            }
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            kwVar.setAlpha(f10);
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            kwVar.setScaleX(f11);
            if (z10) {
                f14 = 1.0f;
            }
            kwVar.setScaleY(f14);
            if (!z10) {
                i7 = 4;
            }
            kwVar.setVisibility(i7);
        }
    }

    public final void N(boolean z10) {
        Integer num;
        this.I = 0.0f;
        tx txVar = this.f40143u1;
        if (txVar != null && txVar.z()) {
            z10 = false;
        }
        FrameLayout frameLayout = this.f40119n;
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
            this.F2.a(z10, true);
        }
    }

    public final void O(boolean z10, boolean z11) {
        View view = this.P;
        if (!z10 || view.getTag() != null) {
            if (!z10 && view.getTag() != null) {
                return;
            }
            AnimatorSet animatorSet = this.f40079a0;
            Integer num = null;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f40079a0 = null;
            }
            if (!z10) {
                num = 1;
            }
            view.setTag(num);
            float f10 = 0.0f;
            if (z11) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f40079a0 = animatorSet2;
                if (z10) {
                    f10 = 1.0f;
                }
                animatorSet2.playTogether(ObjectAnimator.ofFloat(view, View.ALPHA, f10));
                this.f40079a0.setDuration(200L);
                this.f40079a0.setInterpolator(nr.f37961g);
                this.f40079a0.addListener(new y(this, 25));
                this.f40079a0.start();
                return;
            }
            if (z10) {
                f10 = 1.0f;
            }
            view.setAlpha(f10);
        }
    }

    public final void P(boolean z10) {
        for (int i7 = 0; i7 < 3; i7++) {
            v4.t w10 = w(i7);
            int L0 = w10.L0();
            if (z10) {
                if (L0 == 1 || L0 == 2) {
                    w10.n0(0);
                    F(i7);
                }
            } else if (L0 == 0) {
                w10.h1(0, 0);
            }
        }
    }

    public final void Q(boolean z10, boolean z11, boolean z12) {
        float f10;
        float translationY;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.Chat O0 = org.telegram.messenger.np.u1(this.f40091d1).O0(Long.valueOf(this.f40146v1));
        if (O0 != null) {
            di.xb xbVar = this.O0;
            if (z10) {
                if (!org.telegram.messenger.v3.N(O0) && (tL_chatBannedRights = O0.default_banned_rights) != null && (tL_chatBannedRights.send_stickers || (z11 && tL_chatBannedRights.send_plain))) {
                    org.telegram.ui.ActionBar.g2 g2Var = this.Z1;
                    if (!(g2Var instanceof org.telegram.ui.bn) || !((org.telegram.ui.bn) g2Var).Z6()) {
                        if (z11) {
                            xbVar.setText(org.telegram.messenger.hd.N0(2131749370, null));
                        } else if (z12) {
                            xbVar.setText(org.telegram.messenger.hd.N0(2131749369, null));
                        } else {
                            xbVar.setText(org.telegram.messenger.hd.N0(2131749363, null));
                        }
                    } else {
                        return;
                    }
                } else {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights2 = O0.banned_rights;
                    if (tL_chatBannedRights2 == null) {
                        return;
                    }
                    if (org.telegram.messenger.g0.D1(tL_chatBannedRights2)) {
                        if (z11) {
                            xbVar.setText(org.telegram.messenger.hd.N0(2131753940, null));
                        } else if (z12) {
                            xbVar.setText(org.telegram.messenger.hd.N0(2131753966, null));
                        } else {
                            xbVar.setText(org.telegram.messenger.hd.N0(2131753931, null));
                        }
                    } else {
                        if (z11) {
                            xbVar.setText(org.telegram.messenger.hd.a0("AttachPlainRestricted", null, 2131753941, org.telegram.messenger.hd.v(O0.banned_rights.until_date)));
                        }
                        if (z12) {
                            xbVar.setText(org.telegram.messenger.hd.a0("AttachGifRestricted", null, 2131753967, org.telegram.messenger.hd.v(O0.banned_rights.until_date)));
                        } else {
                            xbVar.setText(org.telegram.messenger.hd.a0("AttachStickersRestricted", null, 2131753932, org.telegram.messenger.hd.v(O0.banned_rights.until_date)));
                        }
                    }
                }
                xbVar.setVisibility(0);
            }
            AnimatorSet animatorSet = this.Q2;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.Q2 = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.Q2 = animatorSet2;
            float f11 = 1.0f;
            if (z10) {
                f10 = xbVar.getAlpha();
            } else {
                f10 = 1.0f;
            }
            float f12 = 0.0f;
            if (!z10) {
                f11 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(xbVar, View.ALPHA, f10, f11);
            if (z10) {
                translationY = org.telegram.messenger.g0.L(12.0f);
            } else {
                translationY = xbVar.getTranslationY();
            }
            if (!z10) {
                f12 = org.telegram.messenger.g0.L(12.0f);
            }
            animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(xbVar, View.TRANSLATION_Y, translationY, f12));
            h2.m0 m0Var = this.R2;
            if (m0Var != null) {
                org.telegram.messenger.g0.r(m0Var);
            }
            if (z10) {
                h2.m0 m0Var2 = new h2.m0(this, z11, z12, 4);
                this.R2 = m0Var2;
                org.telegram.messenger.g0.h3(m0Var2, 3500L);
            }
            this.Q2.setDuration(320L);
            this.Q2.setInterpolator(nr.h);
            this.Q2.start();
        }
    }

    public final void R(boolean z10, boolean z11) {
        float f10;
        float f11;
        float f12;
        float f13;
        ImageView imageView = this.E;
        if (imageView != null && !this.f40130q2) {
            if (!z10 || imageView.getTag() != null) {
                if (z10 || imageView.getTag() == null) {
                    AnimatorSet animatorSet = this.H;
                    Integer num = null;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.H = null;
                    }
                    if (!z10) {
                        num = 1;
                    }
                    imageView.setTag(num);
                    int i7 = 0;
                    float f14 = 0.0f;
                    if (z11) {
                        if (z10) {
                            imageView.setVisibility(0);
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.H = animatorSet2;
                        if (z10) {
                            f12 = 1.0f;
                        } else {
                            f12 = 0.0f;
                        }
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, View.ALPHA, f12);
                        if (z10) {
                            f13 = 1.0f;
                        } else {
                            f13 = 0.0f;
                        }
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView, View.SCALE_X, f13);
                        if (z10) {
                            f14 = 1.0f;
                        }
                        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(imageView, View.SCALE_Y, f14));
                        this.H.setDuration(200L);
                        this.H.setInterpolator(nr.f37961g);
                        this.H.addListener(new qw(this, z10, 1));
                        this.H.start();
                        return;
                    }
                    if (z10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    imageView.setAlpha(f10);
                    if (z10) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    imageView.setScaleX(f11);
                    if (z10) {
                        f14 = 1.0f;
                    }
                    imageView.setScaleY(f14);
                    if (!z10) {
                        i7 = 4;
                    }
                    imageView.setVisibility(i7);
                }
            }
        }
    }

    public final void S() {
        int measuredHeight;
        int L;
        org.telegram.ui.ActionBar.g2 g2Var;
        View view = (View) getParent();
        if (view != null) {
            float y10 = getY();
            if (getLayoutParams().height > 0) {
                measuredHeight = getLayoutParams().height;
            } else {
                measuredHeight = getMeasuredHeight();
            }
            float f10 = y10 + measuredHeight;
            if ((!org.telegram.messenger.g0.E && ((g2Var = this.Z1) == null || !g2Var.isInBubbleMode())) || this.W0) {
                L = view.getHeight();
            } else {
                L = org.telegram.messenger.g0.L(1.0f);
            }
            float f11 = f10 - L;
            int i7 = (this.f40138s2 > 0.0f ? 1 : (this.f40138s2 == 0.0f ? 0 : -1));
            FrameLayout frameLayout = this.f40119n;
            if (i7 >= 0) {
                f11 += getMeasuredHeight() - this.f40138s2;
            } else if (frameLayout.getTop() - f11 < 0.0f || !this.f40159y2) {
                f11 = 0.0f;
            }
            float W1 = (-f11) + org.telegram.messenger.g0.W1(this.F2.f57700e, org.telegram.messenger.g0.L(50.0f), -this.f40134r2);
            frameLayout.setTranslationY(W1);
            if (this.f40093e0) {
                this.f40131r.setTranslationY(W1);
            }
        }
    }

    public final void T() {
        gy gyVar;
        boolean z10;
        int z11;
        boolean z12;
        int z13;
        int z14;
        int z15;
        int z16;
        int z17;
        int z18;
        int z19;
        int z20;
        kv kvVar;
        int z21;
        int z22;
        int z23;
        int z24;
        int z25;
        int z26;
        boolean z27 = this.f40145v0;
        View view = this.f40148w;
        if (!z27) {
            setBackground(null);
            view.setBackground(null);
        } else if (!org.telegram.messenger.g0.E && !this.O1) {
            int i7 = org.telegram.ui.ActionBar.m6.f29801zf;
            setBackgroundColor(z(i7));
            if (this.f40093e0) {
                view.setBackgroundColor(z(i7));
            }
        } else {
            Drawable background = getBackground();
            int z28 = z(org.telegram.ui.ActionBar.m6.f29801zf);
            if (background != null && (background != this.H2 || z28 != this.I2)) {
                this.H2 = background;
                this.I2 = z28;
                background.setColorFilter(new PorterDuffColorFilter(z28, PorterDuff.Mode.MULTIPLY));
            }
        }
        yw ywVar = this.J;
        if (ywVar != null) {
            if (this.f40145v0) {
                ywVar.setBackgroundColor(z(org.telegram.ui.ActionBar.m6.f29801zf));
                this.P.setBackgroundColor(z(org.telegram.ui.ActionBar.m6.Cf));
            } else {
                ywVar.setBackground(null);
            }
        }
        ku kuVar = this.C1;
        if (kuVar != null) {
            kuVar.f36984c.a();
        }
        int i10 = 0;
        while (true) {
            gyVar = this.W;
            z10 = this.f40111j2;
            if (i10 >= 3) {
                break;
            }
            if (i10 == 0) {
                gyVar = this.H0;
            } else if (i10 != 1) {
                gyVar = this.f40125p0;
            }
            if (gyVar != null) {
                iq iqVar = gyVar.d;
                FrameLayout frameLayout = gyVar.f35717n;
                View view2 = gyVar.f35716f;
                if (this.f40145v0) {
                    view2.setBackgroundColor(z(org.telegram.ui.ActionBar.m6.f29801zf));
                } else {
                    view2.setBackground(null);
                }
                gyVar.f35715e.setBackgroundColor(z(org.telegram.ui.ActionBar.m6.Cf));
                ul0 ul0Var = gyVar.f35714c;
                if (z10) {
                    z23 = v(0.4f);
                } else {
                    z23 = z(org.telegram.ui.ActionBar.m6.Bf);
                }
                ul0Var.a(z23);
                Drawable background2 = frameLayout.getBackground();
                if (z10) {
                    z24 = v(0.06f);
                } else {
                    z24 = z(org.telegram.ui.ActionBar.m6.Af);
                }
                org.telegram.ui.ActionBar.m6.C1(z24, background2);
                frameLayout.invalidate();
                if (z10) {
                    z25 = v(0.45f);
                } else {
                    z25 = z(org.telegram.ui.ActionBar.m6.Bf);
                }
                iqVar.setHintTextColor(z25);
                if (z10) {
                    z26 = v(0.8f);
                } else {
                    z26 = z(org.telegram.ui.ActionBar.m6.G6);
                }
                iqVar.setTextColor(z26);
            }
            i10++;
        }
        Paint paint = this.f40140t1;
        if (paint != null) {
            paint.setColor(z(org.telegram.ui.ActionBar.m6.Sf));
        }
        gx gxVar = this.Q;
        if (gxVar != null) {
            gxVar.setGlowColor(z(org.telegram.ui.ActionBar.m6.f29801zf));
        }
        dw dwVar = this.E0;
        if (dwVar != null) {
            dwVar.setGlowColor(z(org.telegram.ui.ActionBar.m6.f29801zf));
        }
        hw hwVar = this.C0;
        if (hwVar != null) {
            hwVar.setIndicatorColor(z(org.telegram.ui.ActionBar.m6.If));
            hwVar.setUnderlineColor(z(org.telegram.ui.ActionBar.m6.Cf));
            if (this.f40145v0) {
                hwVar.setBackgroundColor(z(org.telegram.ui.ActionBar.m6.f29801zf));
            } else {
                hwVar.setBackground(null);
            }
        }
        bx bxVar = this.f40128q0;
        if (bxVar != null) {
            bxVar.setIndicatorColor(z(org.telegram.ui.ActionBar.m6.If));
            bxVar.setUnderlineColor(z(org.telegram.ui.ActionBar.m6.Cf));
            if (this.f40145v0) {
                bxVar.setBackgroundColor(z(org.telegram.ui.ActionBar.m6.f29801zf));
            } else {
                bxVar.setBackground(null);
            }
        }
        if (z10) {
            z11 = v(0.6f);
        } else {
            z11 = z(org.telegram.ui.ActionBar.m6.Jf);
        }
        if (z11 != this.J2) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.J2 = z11;
        kw kwVar = this.f40156y;
        if (kwVar != null) {
            if (z12) {
                kwVar.setColorFilter(new PorterDuffColorFilter(z11, PorterDuff.Mode.MULTIPLY));
            }
            if (gyVar == null) {
                Drawable background3 = kwVar.getBackground();
                int i11 = org.telegram.ui.ActionBar.m6.f29801zf;
                org.telegram.ui.ActionBar.m6.H1(background3, z(i11), false);
                org.telegram.ui.ActionBar.m6.H1(kwVar.getBackground(), z(i11), true);
            }
        }
        ImageView imageView = this.E;
        if (imageView != null && z12) {
            imageView.setColorFilter(new PorterDuffColorFilter(z11, PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.F;
        if (imageView2 != null && z12) {
            imageView2.setColorFilter(new PorterDuffColorFilter(z11, PorterDuff.Mode.MULTIPLY));
        }
        di.xb xbVar = this.O0;
        if (xbVar != null) {
            if (xbVar.getBackground() instanceof ShapeDrawable) {
                ((ShapeDrawable) xbVar.getBackground()).getPaint().setColor(z(org.telegram.ui.ActionBar.m6.hg));
                xbVar.invalidate();
            }
            xbVar.setTextColor(z(org.telegram.ui.ActionBar.m6.f29446gg));
        }
        xx xxVar = this.f40112k0;
        if (xxVar != null) {
            zx zxVar = xxVar.f42236e;
            int i12 = org.telegram.ui.ActionBar.m6.Df;
            int z29 = z(i12);
            if (z29 != this.K2) {
                this.K2 = z29;
                zxVar.f43003a.setColorFilter(new PorterDuffColorFilter(z29, PorterDuff.Mode.MULTIPLY));
            }
            zxVar.f43004b.setTextColor(z(i12));
            zxVar.f43005c.setProgressColor(z(org.telegram.ui.ActionBar.m6.f29455h6));
        }
        int z30 = z(org.telegram.ui.ActionBar.m6.Fi);
        if (this.f40099f2 == null || z30 != this.L2) {
            this.L2 = z30;
            this.f40099f2 = new PorterDuffColorFilter(z30, PorterDuff.Mode.SRC_IN);
        }
        int i13 = 0;
        while (true) {
            Drawable[] drawableArr = this.Y0;
            if (i13 >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i13];
            if (z10) {
                z21 = v(0.4f);
            } else {
                z21 = z(org.telegram.ui.ActionBar.m6.Ff);
            }
            org.telegram.ui.ActionBar.m6.E1(drawable, z21, false);
            Drawable drawable2 = drawableArr[i13];
            if (z10) {
                z22 = v(0.8f);
            } else {
                z22 = z(org.telegram.ui.ActionBar.m6.Gf);
            }
            org.telegram.ui.ActionBar.m6.E1(drawable2, z22, true);
            i13++;
        }
        if (ywVar != null && (kvVar = ywVar.E) != null) {
            kvVar.d();
        }
        int i14 = 0;
        while (true) {
            Drawable[] drawableArr2 = this.Z0;
            if (i14 >= drawableArr2.length) {
                break;
            }
            Drawable drawable3 = drawableArr2[i14];
            if (z10) {
                z19 = v(0.4f);
            } else {
                z19 = z(org.telegram.ui.ActionBar.m6.Ef);
            }
            org.telegram.ui.ActionBar.m6.E1(drawable3, z19, false);
            Drawable drawable4 = drawableArr2[i14];
            if (z10) {
                z20 = v(0.8f);
            } else {
                z20 = z(org.telegram.ui.ActionBar.m6.Gf);
            }
            org.telegram.ui.ActionBar.m6.E1(drawable4, z20, true);
            i14++;
        }
        int i15 = 0;
        while (true) {
            Drawable[] drawableArr3 = this.f40080a1;
            if (i15 >= drawableArr3.length) {
                break;
            }
            Drawable drawable5 = drawableArr3[i15];
            if (z10) {
                z17 = v(0.4f);
            } else {
                z17 = z(org.telegram.ui.ActionBar.m6.Ef);
            }
            org.telegram.ui.ActionBar.m6.E1(drawable5, z17, false);
            Drawable drawable6 = drawableArr3[i15];
            if (z10) {
                z18 = v(0.8f);
            } else {
                z18 = z(org.telegram.ui.ActionBar.m6.Gf);
            }
            org.telegram.ui.ActionBar.m6.E1(drawable6, z18, true);
            i15++;
        }
        org.telegram.ui.ActionBar.v5 v5Var = this.f40085b2;
        if (v5Var != null) {
            if (z10) {
                z15 = v(0.4f);
            } else {
                z15 = z(org.telegram.ui.ActionBar.m6.Ff);
            }
            org.telegram.ui.ActionBar.m6.E1(v5Var, z15, false);
            if (z10) {
                z16 = v(0.8f);
            } else {
                z16 = z(org.telegram.ui.ActionBar.m6.Gf);
            }
            org.telegram.ui.ActionBar.m6.E1(v5Var, z16, true);
        }
        org.telegram.ui.ActionBar.v5 v5Var2 = this.f40089c2;
        if (v5Var2 != null) {
            if (z10) {
                z13 = v(0.4f);
            } else {
                z13 = z(org.telegram.ui.ActionBar.m6.If);
            }
            org.telegram.ui.ActionBar.m6.E1(v5Var2, z13, false);
            if (z10) {
                z14 = v(0.8f);
            } else {
                z14 = z(org.telegram.ui.ActionBar.m6.If);
            }
            org.telegram.ui.ActionBar.m6.E1(v5Var2, z14, true);
        }
    }

    public final void U() {
        gx gxVar = this.Q;
        if (gxVar != null) {
            for (int i7 = 0; i7 < gxVar.getChildCount(); i7++) {
                View childAt = gxVar.getChildAt(i7);
                if (childAt instanceof lx) {
                    ((lx) childAt).a(true);
                }
            }
        }
    }

    public final void V(int i7) {
        int i10;
        if (!this.f40100g0) {
            int i11 = -1;
            if (i7 != -1) {
                int size = getRecentEmoji().size() + (this.f40093e0 ? 1 : 0);
                dx dxVar = this.S;
                int i12 = dxVar.f34596c;
                ArrayList arrayList = dxVar.f34604y;
                int i13 = 0;
                if (i12 >= 0) {
                    i10 = 3;
                } else {
                    i10 = 0;
                }
                int i14 = size + i10;
                if (i7 >= i14) {
                    int i15 = 0;
                    while (true) {
                        String[][] strArr = org.telegram.messenger.k6.f25021f;
                        if (i15 >= 8) {
                            break;
                        }
                        i14 += strArr[i15].length + 1;
                        if (i7 < i14) {
                            i11 = i15 + 1;
                            break;
                        }
                        i15++;
                    }
                    if (i11 < 0) {
                        ArrayList<hx> emojipacks = getEmojipacks();
                        int size2 = arrayList.size() - 1;
                        while (true) {
                            if (size2 < 0) {
                                break;
                            } else if (((Integer) arrayList.get(size2)).intValue() <= i7) {
                                hx hxVar = (hx) this.f40133r1.get(size2);
                                while (i13 < emojipacks.size()) {
                                    long j3 = emojipacks.get(i13).f35981b.f28461id;
                                    long j10 = hxVar.f35981b.f28461id;
                                    if (j3 == j10 && (!hxVar.f35985g || (!hxVar.f35984f && !this.f40129q1.contains(Long.valueOf(j10))))) {
                                        char[] cArr = org.telegram.messenger.k6.f25017a;
                                        i13 = 9 + i13;
                                        break;
                                    }
                                    i13++;
                                }
                            } else {
                                size2--;
                            }
                        }
                    }
                    i13 = i11;
                }
                if (i13 >= 0) {
                    this.J.j(i13, true);
                }
            }
        }
    }

    public final void W() {
        boolean z10;
        boolean z11;
        int i7;
        fy fyVar;
        int i10;
        boolean z12;
        boolean z13;
        bx bxVar = this.f40128q0;
        int currentPosition = bxVar.getCurrentPosition();
        int i11 = this.f40136s0;
        if (currentPosition == i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i11 >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean isEmpty = this.f40110j1.isEmpty();
        bxVar.d(false);
        this.f40136s0 = -2;
        this.f40139t0 = -2;
        this.f40142u0 = -2;
        Drawable[] drawableArr = this.f40080a1;
        if (!isEmpty) {
            this.f40136s0 = 0;
            bxVar.b(0, drawableArr[0]).setContentDescription(org.telegram.messenger.hd.N0(2131746168, null));
            i7 = 1;
        } else {
            i7 = 0;
        }
        this.f40139t0 = i7;
        bxVar.b(1, drawableArr[1]).setContentDescription(org.telegram.messenger.hd.N0(2131750822, null));
        this.f40142u0 = i7 + 1;
        org.telegram.messenger.g0.L(13.0f);
        org.telegram.messenger.g0.L(11.0f);
        int i12 = this.f40091d1;
        ArrayList arrayList = org.telegram.messenger.np.u1(i12).f25835e4;
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            String str = (String) arrayList.get(i13);
            org.telegram.messenger.f6 g10 = org.telegram.messenger.j6.g(str);
            if (g10 != null) {
                TLRPC.Document V = org.telegram.messenger.si.d0(i12).V(str);
                String i14 = i5.c.i(i13 + 3, "tab");
                int i15 = bxVar.f35634y;
                bxVar.f35634y = i15 + 1;
                sv0 sv0Var = (sv0) bxVar.f35622n.get(i14);
                if (sv0Var != null) {
                    bxVar.g(i14, sv0Var, i15);
                    i10 = currentPosition;
                    z12 = z11;
                } else {
                    i10 = currentPosition;
                    z12 = z11;
                    sv0Var = new sv0(bxVar.getContext(), 2);
                    sv0Var.setFocusable(true);
                    sv0Var.setOnClickListener(new zk0(bxVar, 2));
                    sv0Var.setExpanded(bxVar.f35616g0);
                    sv0Var.a(bxVar.f35619j0);
                    bxVar.f35612e.addView(sv0Var, i15);
                }
                sv0Var.d = false;
                sv0Var.setTag(2131296463, Integer.valueOf(i15));
                sv0Var.setTag(2131296593, g10);
                sv0Var.setTag(2131296587, V);
                if (i15 == bxVar.E) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                sv0Var.setSelected(z13);
                bxVar.h.put(i14, sv0Var);
                sv0Var.setContentDescription(str);
            } else {
                i10 = currentPosition;
                z12 = z11;
            }
            i13++;
            currentPosition = i10;
            z11 = z12;
        }
        int i16 = currentPosition;
        boolean z14 = z11;
        bxVar.h();
        bxVar.q();
        if (z10 && isEmpty) {
            bxVar.m(this.f40139t0);
            aw awVar = this.f40125p0;
            if (awVar != null && (fyVar = awVar.f35718r) != null) {
                fyVar.I1(null);
                return;
            }
            return;
        }
        WeakHashMap weakHashMap = r0.i0.f56289a;
        if (bxVar.isLaidOut()) {
            if (!isEmpty && !z14) {
                bxVar.k(i16 + 1, 0);
            } else if (isEmpty && z14) {
                bxVar.k(i16 - 1, 0);
            }
        }
    }

    public final void X() {
        xx xxVar;
        int size = this.f40110j1.size();
        long p10 = org.telegram.messenger.si.p(Integer.MAX_VALUE, this.f40110j1);
        ArrayList arrayList = new ArrayList(org.telegram.messenger.si.d0(this.f40091d1).f26833j0);
        this.f40110j1 = arrayList;
        long p11 = org.telegram.messenger.si.p(Integer.MAX_VALUE, arrayList);
        if ((this.f40128q0 != null && size == 0 && !this.f40110j1.isEmpty()) || (size != 0 && this.f40110j1.isEmpty())) {
            W();
        }
        if ((size != this.f40110j1.size() || p10 != p11) && (xxVar = this.f40122o0) != null) {
            xxVar.f();
        }
    }

    public final void Y(boolean z10) {
        boolean z11;
        TLRPC.Document document;
        boolean z12;
        int i7;
        boolean z13;
        org.telegram.ui.ActionBar.h6 h6Var;
        boolean z14;
        boolean z15;
        ArrayList<TLRPC.Document> arrayList;
        boolean z16;
        ArrayList<TLRPC.Document> arrayList2;
        TLRPC.StickerSet stickerSet;
        int i10;
        hw hwVar = this.C0;
        if (hwVar != null) {
            org.telegram.ui.d61 d61Var = hwVar.f35612e;
            if (hwVar.f35629s != null) {
                return;
            }
            this.G1 = -2;
            this.H1 = -2;
            this.I1 = -2;
            this.J1 = -2;
            int i11 = 0;
            this.f40097f0 = false;
            this.F1 = 0;
            int currentPosition = hwVar.getCurrentPosition();
            if (getParent() != null && getVisibility() == 0 && (this.f40161z1.size() != 0 || this.A1.size() != 0)) {
                z11 = true;
            } else {
                z11 = false;
            }
            hwVar.d(z11);
            int i12 = this.f40091d1;
            org.telegram.messenger.si d02 = org.telegram.messenger.si.d0(i12);
            SharedPreferences sharedPreferences = org.telegram.messenger.np.u1(i12).i7;
            ArrayList arrayList3 = this.n1;
            arrayList3.clear();
            ArrayList arrayList4 = d02.f26853t0[0];
            int size = arrayList4.size();
            for (int i13 = 0; i13 < size; i13++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList4.get(i13);
                if (!d02.E0(stickerSetCovered.set.f28461id, true)) {
                    arrayList3.add(stickerSetCovered);
                }
            }
            ry ryVar = this.G0;
            if (ryVar != null) {
                ryVar.f();
            }
            boolean isEmpty = arrayList4.isEmpty();
            long j3 = 0;
            Drawable[] drawableArr = this.Z0;
            org.telegram.ui.ActionBar.h6 h6Var2 = null;
            if (!isEmpty && (arrayList3.isEmpty() || sharedPreferences.getLong("featured_hidden", 0L) == ((TLRPC.StickerSetCovered) arrayList4.get(0)).set.f28461id)) {
                if (d02.f26857v0[0].isEmpty()) {
                    i10 = 2;
                } else {
                    i10 = 3;
                }
                sv0 c10 = hwVar.c(i10, drawableArr[i10]);
                c10.h.setText(org.telegram.messenger.hd.N0(2131750819, null));
                c10.setContentDescription(org.telegram.messenger.hd.N0(2131750821, null));
                int i14 = this.F1;
                this.I1 = i14;
                this.F1 = i14 + 1;
            }
            if (!this.l1.isEmpty()) {
                int i15 = this.F1;
                this.H1 = i15;
                this.F1 = i15 + 1;
                sv0 c11 = hwVar.c(1, drawableArr[1]);
                c11.h.setText(org.telegram.messenger.hd.N0(2131750826, null));
                c11.setContentDescription(org.telegram.messenger.hd.N0(2131750829, null));
            }
            if (!this.f40113k1.isEmpty()) {
                int i16 = this.F1;
                this.G1 = i16;
                this.F1 = i16 + 1;
                sv0 c12 = hwVar.c(0, drawableArr[0]);
                c12.h.setText(org.telegram.messenger.hd.N0(2131746167, null));
                c12.setContentDescription(org.telegram.messenger.hd.N0(2131746168, null));
            }
            ArrayList arrayList5 = this.f40094e1;
            arrayList5.clear();
            this.f40107i1 = null;
            this.f40101g1 = -1;
            this.f40098f1 = -10;
            if (this.G2 == null || z10) {
                this.G2 = new ArrayList(d02.u0(0));
            }
            ArrayList arrayList6 = this.G2;
            int i17 = 0;
            while (true) {
                TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.f40158y1;
                if (i17 >= stickerSetCoveredArr.length) {
                    break;
                }
                TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCoveredArr[i17];
                long j10 = j3;
                if (stickerSetCovered2 != null) {
                    TLRPC.TL_messages_stickerSet q02 = d02.q0(stickerSetCovered2.set.f28461id);
                    if (q02 != null && (stickerSet = q02.set) != null && !stickerSet.archived) {
                        stickerSetCoveredArr[i17] = null;
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
                i17++;
                j3 = j10;
            }
            long j11 = j3;
            ArrayList y02 = org.telegram.messenger.np.u1(i12).y0(arrayList6);
            for (int i18 = 0; i18 < y02.size(); i18++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) y02.get(i18);
                TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet2.set;
                if ((stickerSet2 == null || !stickerSet2.archived) && (arrayList2 = tL_messages_stickerSet2.documents) != null && !arrayList2.isEmpty()) {
                    arrayList5.add(tL_messages_stickerSet2);
                }
            }
            if (this.K1 != null) {
                long j12 = org.telegram.messenger.np.u1(i12).i7.getLong("group_hide_stickers_" + this.K1.f28435id, -1L);
                TLRPC.Chat O0 = org.telegram.messenger.np.u1(i12).O0(Long.valueOf(this.K1.f28435id));
                if (O0 != null && this.K1.stickerset != null && org.telegram.messenger.v3.N(O0)) {
                    TLRPC.StickerSet stickerSet3 = this.K1.stickerset;
                    if (stickerSet3 != null) {
                        if (j12 == stickerSet3.f28461id) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        this.f40104h1 = z16;
                    }
                } else {
                    if (j12 != -1) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    this.f40104h1 = z15;
                }
                TLRPC.ChatFull chatFull = this.K1;
                TLRPC.StickerSet stickerSet4 = chatFull.stickerset;
                if (stickerSet4 != null) {
                    TLRPC.TL_messages_stickerSet a02 = d02.a0(stickerSet4);
                    if (a02 != null && (arrayList = a02.documents) != null && !arrayList.isEmpty() && a02.set != null) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = new TLRPC.TL_messages_stickerSet();
                        tL_messages_stickerSet3.documents = a02.documents;
                        tL_messages_stickerSet3.packs = a02.packs;
                        tL_messages_stickerSet3.set = a02.set;
                        if (this.f40104h1) {
                            this.f40098f1 = arrayList5.size();
                            arrayList5.add(tL_messages_stickerSet3);
                        } else {
                            this.f40098f1 = 0;
                            arrayList5.add(0, tL_messages_stickerSet3);
                        }
                        if (!this.K1.can_set_stickers) {
                            tL_messages_stickerSet3 = null;
                        }
                        this.f40107i1 = tL_messages_stickerSet3;
                    }
                } else if (chatFull.can_set_stickers) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = new TLRPC.TL_messages_stickerSet();
                    if (this.f40104h1) {
                        this.f40098f1 = arrayList5.size();
                        arrayList5.add(tL_messages_stickerSet4);
                    } else {
                        this.f40098f1 = 0;
                        arrayList5.add(0, tL_messages_stickerSet4);
                    }
                }
            }
            int i19 = 0;
            while (i19 < arrayList5.size()) {
                if (i19 == this.f40098f1) {
                    TLRPC.Chat O02 = org.telegram.messenger.np.u1(i12).O0(Long.valueOf(this.K1.f28435id));
                    if (O02 == null) {
                        arrayList5.remove(i11);
                        i19--;
                    } else {
                        this.f40097f0 = true;
                        String str = "chat" + O02.f28434id;
                        int i20 = hwVar.f35634y;
                        hwVar.f35634y = i20 + 1;
                        sv0 sv0Var = (sv0) hwVar.f35622n.get(str);
                        if (sv0Var != null) {
                            hwVar.g(str, sv0Var, i20);
                        } else {
                            sv0Var = new sv0(hwVar.getContext(), i11);
                            sv0Var.setFocusable(true);
                            sv0Var.setOnClickListener(new zk0(hwVar, i11));
                            d61Var.addView(sv0Var, i20);
                            sv0Var.f39705x = true;
                            b9 b9Var = new b9(h6Var2);
                            b9Var.u(org.telegram.messenger.g0.L(14.0f));
                            b9Var.q(O02);
                            int i21 = hwVar.f35605a;
                            q9 q9Var = sv0Var.f39699e;
                            q9Var.setLayerNum(i21);
                            q9Var.f(O02, b9Var);
                            q9Var.setAspectFit(true);
                            sv0Var.setExpanded(hwVar.f35616g0);
                            sv0Var.a(hwVar.f35619j0);
                            sv0Var.h.setText(O02.title);
                        }
                        sv0Var.d = true;
                        sv0Var.setTag(2131296463, Integer.valueOf(i20));
                        if (i20 == hwVar.E) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        sv0Var.setSelected(z14);
                        hwVar.h.put(str, sv0Var);
                    }
                    i7 = 0;
                    h6Var = null;
                } else {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet5 = (TLRPC.TL_messages_stickerSet) arrayList5.get(i19);
                    TLRPC.StickerSet stickerSet5 = tL_messages_stickerSet5.set;
                    if (stickerSet5 != null && stickerSet5.thumb_document_id != j11) {
                        for (int i22 = 0; i22 < tL_messages_stickerSet5.documents.size(); i22++) {
                            document = tL_messages_stickerSet5.documents.get(i22);
                            if (document != null && tL_messages_stickerSet5.set.thumb_document_id == document.f28440id) {
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
                    Object w10 = org.telegram.messenger.w7.w(tL_messages_stickerSet5.set.thumbs, 90, z12, null, z12);
                    if (w10 == null || tL_messages_stickerSet5.set.gifs) {
                        w10 = document;
                    }
                    String str2 = "set" + tL_messages_stickerSet5.set.f28461id;
                    int i23 = hwVar.f35634y;
                    hwVar.f35634y = i23 + 1;
                    sv0 sv0Var2 = (sv0) hwVar.f35622n.get(str2);
                    if (sv0Var2 != null) {
                        hwVar.g(str2, sv0Var2, i23);
                    } else {
                        sv0Var2 = new sv0(hwVar.getContext(), 0);
                        sv0Var2.setFocusable(true);
                        sv0Var2.setOnClickListener(new zk0(hwVar, 1));
                        sv0Var2.setExpanded(hwVar.f35616g0);
                        sv0Var2.a(hwVar.f35619j0);
                        d61Var.addView(sv0Var2, i23);
                    }
                    sv0Var2.f39699e.setLayerNum(hwVar.f35605a);
                    i7 = 0;
                    sv0Var2.d = false;
                    sv0Var2.setTag(w10);
                    sv0Var2.setTag(2131296463, Integer.valueOf(i23));
                    sv0Var2.setTag(2131296593, tL_messages_stickerSet5);
                    sv0Var2.setTag(2131296587, document);
                    if (i23 == hwVar.E) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    sv0Var2.setSelected(z13);
                    hwVar.h.put(str2, sv0Var2);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(tL_messages_stickerSet5.set.title);
                    sb2.append(", ");
                    h6Var = null;
                    sb2.append(org.telegram.messenger.hd.N0(2131754756, null));
                    sv0Var2.setContentDescription(sb2.toString());
                }
                i19++;
                i11 = i7;
                h6Var2 = h6Var;
            }
            hwVar.h();
            hwVar.q();
            if (currentPosition != 0) {
                hwVar.k(currentPosition, currentPosition);
            }
            o();
        }
    }

    public final void Z() {
        boolean z10;
        int i7;
        iw iwVar = this.D0;
        hw hwVar = this.C0;
        if (hwVar != null && iwVar == null && this.f40143u1 != null) {
            hwVar.setTranslationY(this.f40143u1.p() * (-org.telegram.messenger.g0.L(50.0f)));
        }
        if (iwVar == null) {
            return;
        }
        if (getVisibility() == 0 && this.L0 && this.f40143u1.p() != 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        iwVar.setVisibility(i7);
        if (z10) {
            Rect rect = this.f40162z2;
            rect.setEmpty();
            this.h.getChildVisibleRect(this.f40157y0, rect, null);
            float p10 = this.f40143u1.p() * org.telegram.messenger.g0.L(50.0f);
            int i10 = rect.left;
            if (i10 != 0 || p10 != 0.0f) {
                this.Y1 = false;
            }
            iwVar.setTranslationX(i10);
            float translationY = (((getTranslationY() + getTop()) - iwVar.getTop()) - hwVar.getExpandedOffset()) - p10;
            if (iwVar.getTranslationY() != translationY) {
                iwVar.setTranslationY(translationY);
                iwVar.invalidate();
            }
        }
        if (this.Y1 && z10 && this.Q0) {
            hwVar.i(true, this.X1);
            return;
        }
        this.Y1 = false;
        hwVar.i(false, this.X1);
    }

    public final void a0() {
        int i7;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        LongSparseArray longSparseArray = this.A1;
        LongSparseArray longSparseArray2 = this.f40161z1;
        int i10 = this.f40091d1;
        dw dwVar = this.E0;
        if (dwVar != null) {
            try {
                int childCount = dwVar.getChildCount();
                int i11 = 0;
                int i12 = 0;
                while (i12 < childCount) {
                    View childAt = dwVar.getChildAt(i12);
                    if (!(childAt instanceof org.telegram.ui.Cells.v3) || ((mj0) dwVar.T(childAt)) == null) {
                        i7 = i12;
                    } else {
                        org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) childAt;
                        ArrayList arrayList = org.telegram.messenger.si.d0(i10).f26857v0[i11];
                        TLRPC.StickerSetCovered stickerSet = v3Var.getStickerSet();
                        if (arrayList != null && arrayList.contains(Long.valueOf(stickerSet.set.f28461id))) {
                            z10 = true;
                        } else {
                            z10 = i11;
                        }
                        int i13 = i11;
                        while (true) {
                            TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.f40158y1;
                            if (i13 < stickerSetCoveredArr.length) {
                                TLRPC.StickerSetCovered stickerSetCovered = stickerSetCoveredArr[i13];
                                if (stickerSetCovered != null) {
                                    i7 = i12;
                                    if (stickerSetCovered.set.f28461id == stickerSet.set.f28461id) {
                                        z11 = true;
                                        break;
                                    }
                                } else {
                                    i7 = i12;
                                }
                                i13++;
                                i12 = i7;
                            } else {
                                i7 = i12;
                                z11 = false;
                                break;
                            }
                        }
                        v3Var.c(stickerSet, z10, true, 0, 0, z11);
                        if (z10) {
                            org.telegram.messenger.si.d0(i10).h1(stickerSet.set.f28461id);
                        }
                        if (longSparseArray2.indexOfKey(stickerSet.set.f28461id) >= 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (longSparseArray.indexOfKey(stickerSet.set.f28461id) >= 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z12 || z13) {
                            if (z12 && v3Var.f32193r) {
                                longSparseArray2.remove(stickerSet.set.f28461id);
                                z12 = false;
                            } else if (z13 && !v3Var.f32193r) {
                                longSparseArray.remove(stickerSet.set.f28461id);
                            }
                        }
                        if (!z11 && z12) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        v3Var.b(z14, true);
                    }
                    i12 = i7 + 1;
                    i11 = 0;
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    @Override
    public final void b(int i7) {
        setBottomInset(i7);
    }

    @Override
    public final void c(float f10) {
        this.f40138s2 = f10;
        S();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        org.telegram.messenger.y10 y10Var;
        TLRPC.StickerSet stickerSet;
        int i11 = org.telegram.messenger.ls.f25412x0;
        dx dxVar = this.S;
        pv pvVar = this.S2;
        if (i7 == i11) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (this.f40160z0 != null) {
                    Y(((Boolean) objArr[1]).booleanValue());
                    a0();
                    E();
                    o();
                }
            } else if (((Integer) objArr[0]).intValue() == 5) {
                if (((Boolean) objArr[1]).booleanValue()) {
                    org.telegram.messenger.g0.r(pvVar);
                    org.telegram.messenger.g0.h3(pvVar, 100L);
                    return;
                }
                dxVar.F(false);
            }
        } else if (i7 == org.telegram.messenger.ls.f25382s3) {
            long longValue = ((Long) objArr[0]).longValue();
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            TLRPC.ChatFull chatFull = this.K1;
            if (chatFull != null && chatFull.f28435id == longValue && booleanValue) {
                dxVar.F(true);
            }
        } else if (i7 == org.telegram.messenger.ls.X0) {
            boolean booleanValue2 = ((Boolean) objArr[0]).booleanValue();
            int intValue = ((Integer) objArr[1]).intValue();
            if (booleanValue2 || intValue == 0 || intValue == 2) {
                k(booleanValue2);
            }
        } else if (i7 == org.telegram.messenger.ls.f25426z0) {
            a0();
            cc0 cc0Var = this.f40152x;
            if (cc0Var != null) {
                int childCount = cc0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    cc0Var.getChildAt(i12).invalidate();
                }
            }
            Y(false);
        } else if (i7 == org.telegram.messenger.ls.A0) {
            if (dxVar != null) {
                dxVar.F(false);
            }
        } else {
            int i13 = org.telegram.messenger.ls.B0;
            sx sxVar = this.T;
            if (i7 == i13) {
                Long l10 = (Long) objArr[0];
                long longValue2 = l10.longValue();
                if (objArr.length > 1) {
                    tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) objArr[1];
                } else {
                    tL_messages_stickerSet = null;
                }
                if (tL_messages_stickerSet != null) {
                    oy oyVar = this.A0;
                    if (oyVar != null && oyVar.d == longValue2 && oyVar.f38405f.size() < tL_messages_stickerSet.documents.size()) {
                        oyVar.f38405f = tL_messages_stickerSet.documents;
                        oyVar.f();
                    }
                    if (sxVar != null && sxVar.d == longValue2 && sxVar.f39711f.size() < tL_messages_stickerSet.documents.size()) {
                        sxVar.f39711f = tL_messages_stickerSet.documents;
                        sxVar.f();
                    }
                }
                TLRPC.ChatFull chatFull2 = this.K1;
                if (chatFull2 != null && (stickerSet = chatFull2.stickerset) != null && stickerSet.f28461id == longValue2) {
                    Y(false);
                }
                HashMap hashMap = this.f40137s1;
                if (hashMap.containsKey(l10) && objArr.length >= 2 && ((org.telegram.messenger.y10) hashMap.get(l10)) != null && tL_messages_stickerSet != null && (y10Var = (org.telegram.messenger.y10) hashMap.remove(l10)) != null) {
                    y10Var.a(tL_messages_stickerSet);
                }
                org.telegram.messenger.g0.r(pvVar);
                org.telegram.messenger.g0.h3(pvVar, 100L);
                return;
            }
            int i14 = org.telegram.messenger.ls.f25342l4;
            gx gxVar = this.Q;
            if (i7 == i14) {
                dw dwVar = this.E0;
                if (dwVar != null) {
                    int childCount2 = dwVar.getChildCount();
                    for (int i15 = 0; i15 < childCount2; i15++) {
                        View childAt = dwVar.getChildAt(i15);
                        if ((childAt instanceof org.telegram.ui.Cells.k8) || (childAt instanceof org.telegram.ui.Cells.a8)) {
                            childAt.invalidate();
                        }
                    }
                }
                if (gxVar != null) {
                    gxVar.invalidate();
                    int childCount3 = gxVar.getChildCount();
                    for (int i16 = 0; i16 < childCount3; i16++) {
                        View childAt2 = gxVar.getChildAt(i16);
                        if (childAt2 instanceof cy) {
                            childAt2.invalidate();
                        }
                    }
                }
                ku kuVar = this.C1;
                if (kuVar != null) {
                    kuVar.f36984c.invalidate();
                }
                bx bxVar = this.f40128q0;
                if (bxVar != null) {
                    org.telegram.ui.d61 d61Var = bxVar.f35612e;
                    int childCount4 = d61Var.getChildCount();
                    for (int i17 = 0; i17 < childCount4; i17++) {
                        d61Var.getChildAt(i17).invalidate();
                    }
                }
            } else if (i7 == org.telegram.messenger.ls.L2) {
                if (gxVar != null && this.f40093e0) {
                    if ((this.W.f35714c.f40485k == 2 || gxVar.getAdapter() == sxVar) && !TextUtils.isEmpty(sxVar.f39715w)) {
                        sxVar.F(sxVar.f39715w, true);
                    }
                }
            } else if (i7 == org.telegram.messenger.ls.f25327i5) {
                if (dxVar != null) {
                    dxVar.F(false);
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
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.h) {
            canvas.save();
            if (this.f40119n.getVisibility() != 8 && !this.f40145v0 && this.f40153x0) {
                canvas.drawColor(i0.a.o(-1, 25));
            }
            boolean drawChild = super.drawChild(canvas, view, j3);
            float R0 = org.telegram.messenger.g0.R0(this.f40134r2);
            if (R0 > 0.0f) {
                int r12 = org.telegram.ui.ActionBar.m6.r1(R0, z(org.telegram.ui.ActionBar.m6.f29801zf));
                int i7 = this.B2;
                GradientDrawable gradientDrawable = this.A2;
                if (i7 != r12) {
                    gradientDrawable.setColors(new int[]{r12, org.telegram.ui.ActionBar.m6.r1(0.66f, r12), i0.a.o(r12, 0)});
                    this.B2 = r12;
                }
                gradientDrawable.setBounds(0, getMeasuredHeight() - this.f40134r2, getMeasuredWidth(), getMeasuredHeight());
                gradientDrawable.draw(canvas);
            }
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    public int getCurrentPage() {
        return this.B1;
    }

    public ArrayList<hx> getEmojipacks() {
        ArrayList<hx> arrayList = new ArrayList<>();
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.f40133r1;
            if (i7 < arrayList2.size()) {
                hx hxVar = (hx) arrayList2.get(i7);
                boolean z10 = hxVar.f35985g;
                ArrayList arrayList3 = this.f40129q1;
                if ((!z10 && (hxVar.f35984f || arrayList3.contains(Long.valueOf(hxVar.f35981b.f28461id)))) || (hxVar.f35985g && !hxVar.f35984f && !arrayList3.contains(Long.valueOf(hxVar.f35981b.f28461id)))) {
                    arrayList.add(hxVar);
                }
                i7++;
            } else {
                return arrayList;
            }
        }
    }

    public ArrayList<String> getRecentEmoji() {
        if (this.d2) {
            return org.telegram.messenger.j6.f24836i;
        }
        if (this.C2 == null) {
            this.C2 = new ArrayList();
        }
        if (org.telegram.messenger.j6.f24836i.size() != this.D2) {
            this.C2.clear();
            int i7 = 0;
            while (true) {
                ArrayList arrayList = org.telegram.messenger.j6.f24836i;
                if (i7 >= arrayList.size()) {
                    break;
                }
                if (!((String) arrayList.get(i7)).startsWith("animated_")) {
                    this.C2.add((String) arrayList.get(i7));
                }
                i7++;
            }
            this.D2 = this.C2.size();
        }
        return this.C2;
    }

    public float getStickersExpandOffset() {
        hw hwVar = this.C0;
        if (hwVar == null) {
            return 0.0f;
        }
        return hwVar.getExpandedOffset();
    }

    public final void h(String str) {
        if (str != null) {
            if (str.startsWith("animated_") || org.telegram.messenger.j6.h(str)) {
                org.telegram.messenger.j6.a(str);
                int i7 = 0;
                if (getVisibility() != 0 || this.h.getCurrentItem() != 0) {
                    org.telegram.messenger.j6.s();
                    this.S.F(false);
                }
                org.telegram.messenger.j6.r();
                if (!this.d2) {
                    ArrayList arrayList = this.C2;
                    if (arrayList == null) {
                        this.C2 = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    while (true) {
                        ArrayList arrayList2 = org.telegram.messenger.j6.f24836i;
                        if (i7 < arrayList2.size()) {
                            if (!((String) arrayList2.get(i7)).startsWith("animated_")) {
                                this.C2.add((String) arrayList2.get(i7));
                            }
                            i7++;
                        } else {
                            this.D2 = this.C2.size();
                            return;
                        }
                    }
                }
            }
        }
    }

    public final void i(int i7, int i10, boolean z10) {
        if (i7 == 2 || x(i7).K(0) == null) {
            return;
        }
        rw rwVar = new rw(getContext(), i10);
        rwVar.f59109a = !z10 ? 1 : 0;
        w(i7).w0(rwVar);
    }

    public final void k(boolean z10) {
        if (z10) {
            X();
            return;
        }
        int size = this.f40113k1.size();
        int size2 = this.l1.size();
        int i7 = this.f40091d1;
        this.f40113k1 = org.telegram.messenger.si.d0(i7).k0(0, true);
        this.l1 = org.telegram.messenger.si.d0(i7).k0(2, false);
        if (org.telegram.messenger.k10.i(i7).q()) {
            this.f40117m1 = org.telegram.messenger.si.d0(i7).k0(7, false);
        } else {
            this.f40117m1 = new ArrayList();
        }
        for (int i10 = 0; i10 < this.l1.size(); i10++) {
            TLRPC.Document document = (TLRPC.Document) this.l1.get(i10);
            int i11 = 0;
            while (true) {
                if (i11 < this.f40113k1.size()) {
                    TLRPC.Document document2 = (TLRPC.Document) this.f40113k1.get(i11);
                    if (document2.dc_id == document.dc_id && document2.f28440id == document.f28440id) {
                        this.f40113k1.remove(i11);
                        break;
                    }
                    i11++;
                }
            }
        }
        if (org.telegram.messenger.np.u1(i7).K3()) {
            int i12 = 0;
            while (i12 < this.l1.size()) {
                if (org.telegram.messenger.gj.X3((TLRPC.Document) this.l1.get(i12))) {
                    this.l1.remove(i12);
                    i12--;
                }
                i12++;
            }
            int i13 = 0;
            while (i13 < this.f40113k1.size()) {
                if (org.telegram.messenger.gj.X3((TLRPC.Document) this.f40113k1.get(i13))) {
                    this.f40113k1.remove(i13);
                    i13--;
                }
                i13++;
            }
        }
        if (size != this.f40113k1.size() || size2 != this.l1.size()) {
            Y(false);
        }
        ly lyVar = this.f40160z0;
        if (lyVar != null) {
            lyVar.f();
        }
        o();
    }

    public final void l(boolean z10) {
        int i7;
        boolean z11;
        tx txVar = this.f40143u1;
        te.a aVar = this.f40082b;
        gx gxVar = this.Q;
        vv vvVar = this.W;
        if (txVar != null && txVar.z()) {
            v4.f1 K = gxVar.K(0);
            if (K == null) {
                gy.a(vvVar, true, !z10);
            } else {
                if (K.f59165a.getTop() < gxVar.getPaddingTop()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                gy.a(vvVar, z11, !z10);
            }
            O(false, !z10);
            vvVar.setTranslationY(aVar.f57700e * org.telegram.messenger.g0.L(15.0f));
        } else if (vvVar != null && gxVar != null) {
            v4.f1 K2 = gxVar.K(0);
            if (K2 != null) {
                i7 = K2.f59165a.getTop();
            } else {
                i7 = -this.f40088c1;
            }
            vvVar.setTranslationY((aVar.f57700e * org.telegram.messenger.g0.L(15.0f)) + i7);
            vvVar.f35712a.a(false, !z10);
            m(Math.round(this.J.getTranslationY()));
        }
    }

    public final void m(int i7) {
        ObjectAnimator objectAnimator = this.S0[1];
        if (objectAnimator != null && objectAnimator.isRunning()) {
            return;
        }
        boolean z10 = false;
        v4.f1 K = this.Q.K(0);
        int L = org.telegram.messenger.g0.L(38.0f) + i7;
        if (L > 0 && (K == null || K.f59165a.getBottom() < L)) {
            z10 = true;
        }
        O(z10, !this.L1);
    }

    public final void n(int i7, View view) {
        gx gxVar;
        v4.f1 K;
        int i10;
        yw ywVar = this.J;
        int[] iArr = this.R0;
        if (view == null) {
            iArr[1] = 0;
            ywVar.setTranslationY(0);
        } else if (view.getVisibility() == 0 && !this.f40100g0) {
            tx txVar = this.f40143u1;
            if (txVar == null || !txVar.z()) {
                if (i7 > 0 && (gxVar = this.Q) != null && gxVar.getVisibility() == 0 && (K = gxVar.K(0)) != null) {
                    int top = K.f59165a.getTop();
                    if (this.f40093e0) {
                        i10 = this.f40088c1;
                    } else {
                        i10 = 0;
                    }
                    if (top + i10 >= gxVar.getPaddingTop()) {
                        return;
                    }
                }
                int i11 = iArr[1] - i7;
                iArr[1] = i11;
                if (i11 > 0) {
                    iArr[1] = 0;
                } else if (i11 < (-org.telegram.messenger.g0.L(108.0f))) {
                    iArr[1] = -org.telegram.messenger.g0.L(108.0f);
                }
                ywVar.setTranslationY(Math.max(-org.telegram.messenger.g0.L(36.0f), iArr[1]));
            }
        }
    }

    public final void o() {
        int L0;
        hw hwVar = this.C0;
        if (hwVar != null && (L0 = this.F0.L0()) != -1) {
            int i7 = this.H1;
            if (i7 <= 0 && (i7 = this.G1) <= 0) {
                i7 = this.F1;
            }
            hwVar.k(this.f40160z0.F(L0), i7);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        xi.e eVar = this.N2;
        if (eVar != null) {
            eVar.b();
            this.N2 = null;
        }
        xi.e eVar2 = (xi.e) new org.telegram.messenger.ks(org.telegram.messenger.ls.f(this.f40091d1), this).f25134b;
        eVar2.f(org.telegram.messenger.ls.f25342l4);
        eVar2.c(org.telegram.messenger.ls.L2);
        eVar2.c(org.telegram.messenger.ls.f25382s3);
        this.N2 = eVar2;
        if (this.f40160z0 != null) {
            eVar2.c(org.telegram.messenger.ls.f25412x0);
            eVar2.c(org.telegram.messenger.ls.X0);
            eVar2.c(org.telegram.messenger.ls.f25426z0);
            eVar2.c(org.telegram.messenger.ls.B0);
            eVar2.c(org.telegram.messenger.ls.f25327i5);
            org.telegram.messenger.g0.g3(new pv(this, 0));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ku kuVar = this.C1;
        if (kuVar != null && kuVar.isShowing()) {
            kuVar.dismiss();
        }
        org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
        if (p10.f50298l == this.f40105h2) {
            p10.W = null;
            p10.f50285a0 = null;
            p10.Y = null;
            p10.f50298l = null;
            p10.f50289c0 = null;
            p10.t();
        }
    }

    @Override
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13 = i11 - i7;
        if (this.P1 != i13) {
            this.P1 = i13;
            E();
        }
        super.onLayout(z10, i7, i10, i11, i12);
        S();
        Z();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        this.L1 = true;
        boolean z10 = org.telegram.messenger.g0.E;
        View view = this.f40148w;
        boolean z11 = this.f40093e0;
        if (!z10 && !this.O1) {
            if (this.M1 != 0) {
                if (!this.M2) {
                    setOutlineProvider(null);
                    setClipToOutline(false);
                    setElevation(0.0f);
                }
                if (this.f40145v0) {
                    int i11 = org.telegram.ui.ActionBar.m6.f29801zf;
                    setBackgroundColor(z(i11));
                    if (z11) {
                        view.setBackgroundColor(z(i11));
                    }
                }
                this.M1 = 0;
            }
        } else if (this.M1 != 1) {
            if (!this.M2) {
                setOutlineProvider(this.N1);
                setClipToOutline(true);
                setElevation(org.telegram.messenger.g0.L(2.0f));
            }
            setBackgroundResource(2131232740);
            Drawable background = getBackground();
            int i12 = org.telegram.ui.ActionBar.m6.f29801zf;
            background.setColorFilter(new PorterDuffColorFilter(z(i12), PorterDuff.Mode.MULTIPLY));
            if (z11 && this.f40145v0) {
                view.setBackgroundColor(z(i12));
            }
            this.M1 = 1;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824));
        this.L1 = false;
        setTranslationY(getTranslationY());
    }

    public final void p(int i7) {
        int L0;
        int i10;
        int L02;
        if (i7 == 0) {
            if (!this.K0 && (L02 = this.F0.L0()) != -1 && this.E0 != null) {
                int i11 = this.H1;
                if (i11 <= 0 && (i11 = this.G1) <= 0) {
                    i11 = this.F1;
                }
                this.C0.k(this.f40160z0.F(L02), i11);
            }
        } else if (i7 == 2) {
            v4.i0 adapter = this.f40106i0.getAdapter();
            xx xxVar = this.f40122o0;
            if (adapter == xxVar && xxVar.J >= 0 && this.f40139t0 >= 0 && this.f40136s0 >= 0 && (L0 = this.f40109j0.L0()) != -1) {
                if (L0 >= xxVar.J) {
                    i10 = this.f40139t0;
                } else {
                    i10 = this.f40136s0;
                }
                this.f40128q0.k(i10, 0);
            }
        }
    }

    public final void q(boolean z10) {
        int i7;
        tx txVar = this.f40143u1;
        te.a aVar = this.f40078a;
        dw dwVar = this.E0;
        boolean z11 = false;
        gw gwVar = this.H0;
        if (txVar != null && txVar.z()) {
            v4.f1 K = dwVar.K(0);
            if (K == null) {
                gy.a(gwVar, true, !z10);
            } else {
                if (K.f59165a.getTop() < dwVar.getPaddingTop()) {
                    z11 = true;
                }
                gy.a(gwVar, z11, !z10);
            }
            gwVar.setTranslationY(aVar.f57700e * org.telegram.messenger.g0.L(15.0f));
        } else if (gwVar != null && dwVar != null) {
            v4.f1 K2 = dwVar.K(0);
            if (K2 != null) {
                i7 = K2.f59165a.getTop();
            } else {
                i7 = -this.f40088c1;
            }
            gwVar.setTranslationY((aVar.f57700e * org.telegram.messenger.g0.L(15.0f)) + i7);
            gwVar.f35712a.a(false, !z10);
        }
    }

    public final void r() {
        HashMap hashMap = org.telegram.messenger.j6.f24830a;
        org.telegram.messenger.np.f1().edit().putBoolean("filled_default", true).commit();
        org.telegram.messenger.j6.h.clear();
        org.telegram.messenger.j6.f24836i.clear();
        org.telegram.messenger.j6.r();
        this.S.F(false);
    }

    @Override
    public final void requestLayout() {
        if (this.L1) {
            return;
        }
        super.requestLayout();
    }

    public final void s(long j3, boolean z10) {
        gy gyVar;
        v4.c0 c0Var;
        View view;
        ek0 ek0Var;
        int i7;
        int i10;
        TLRPC.TL_messages_stickerSet q02;
        ly lyVar;
        int E;
        AnimatorSet animatorSet = this.N0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.N0 = null;
        }
        int currentItem = this.h.getCurrentItem();
        int i11 = 2;
        if (currentItem == 2 && j3 != -1 && (q02 = org.telegram.messenger.si.d0(this.f40091d1).q0(j3)) != null && (E = (lyVar = this.f40160z0).E(q02)) >= 0 && E < lyVar.b()) {
            I(E, org.telegram.messenger.g0.L(48.0f));
        }
        int i12 = 0;
        xx xxVar = this.f40112k0;
        if (xxVar != null) {
            xxVar.L = false;
        }
        int i13 = 0;
        while (i13 < 3) {
            ek0 ek0Var2 = this.E0;
            ek0 ek0Var3 = this.f40106i0;
            aw awVar = this.f40125p0;
            ek0 ek0Var4 = this.Q;
            if (i13 == 0) {
                gyVar = this.W;
                c0Var = this.R;
                view = this.J;
                ek0Var = ek0Var4;
            } else if (i13 == 1) {
                c0Var = this.f40109j0;
                view = this.f40128q0;
                ek0Var = ek0Var3;
                gyVar = awVar;
            } else {
                gyVar = this.H0;
                c0Var = this.F0;
                view = this.C0;
                ek0Var = ek0Var2;
            }
            if (gyVar == null) {
                i10 = i12;
                i7 = i11;
            } else {
                int i14 = i12;
                fy fyVar = gyVar.f35718r;
                int i15 = i11;
                gyVar.d.setText("");
                if (fyVar != null) {
                    fyVar.I1(null);
                    fyVar.G1();
                }
                int i16 = this.f40088c1;
                if (i13 == currentItem && z10) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.N0 = animatorSet2;
                    Property property = View.TRANSLATION_Y;
                    if (view != null && i13 != 1) {
                        float[] fArr = new float[1];
                        fArr[i14] = 0.0f;
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
                        float[] fArr2 = new float[1];
                        fArr2[i14] = org.telegram.messenger.g0.L(36.0f);
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(ek0Var, property, fArr2);
                        float[] fArr3 = new float[1];
                        fArr3[i14] = org.telegram.messenger.g0.L(36.0f);
                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(gyVar, property, fArr3);
                        Animator[] animatorArr = new Animator[3];
                        animatorArr[i14] = ofFloat;
                        animatorArr[1] = ofFloat2;
                        animatorArr[i15] = ofFloat3;
                        animatorSet2.playTogether(animatorArr);
                    } else {
                        float[] fArr4 = new float[1];
                        fArr4[i14] = org.telegram.messenger.g0.L(36.0f) - i16;
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(ek0Var, property, fArr4);
                        Animator[] animatorArr2 = new Animator[1];
                        animatorArr2[i14] = ofFloat4;
                        animatorSet2.playTogether(animatorArr2);
                    }
                    this.N0.setDuration(200L);
                    this.N0.setInterpolator(nr.h);
                    this.N0.addListener(new fi.a3(this, c0Var, ek0Var, 6));
                    this.N0.start();
                    i10 = i14;
                    i7 = i15;
                } else {
                    if (gyVar != awVar) {
                        gyVar.setTranslationY(org.telegram.messenger.g0.L(36.0f) - i16);
                    }
                    i7 = i15;
                    if (view != null && i13 != i7) {
                        view.setTranslationY(0.0f);
                    }
                    if (ek0Var == ek0Var2) {
                        i10 = i14;
                        ek0Var.setPadding(i10, org.telegram.messenger.g0.L(36.0f), i10, org.telegram.messenger.g0.L(44.0f) + this.f40134r2);
                    } else {
                        i10 = i14;
                        if (ek0Var == ek0Var3) {
                            ek0Var.setPadding(i10, org.telegram.messenger.g0.L(40.0f), i10, org.telegram.messenger.g0.L(44.0f) + this.f40134r2);
                        } else {
                            if (ek0Var == ek0Var4) {
                                ek0Var.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(44.0f) + this.f40134r2);
                            }
                            i10 = 0;
                        }
                    }
                    c0Var.h1(i10, i10);
                }
            }
            i13++;
            i11 = i7;
            i12 = i10;
        }
        int i17 = i12;
        if (!z10) {
            this.f40143u1.i(i17);
        }
    }

    public void setBlurredBackgroundDrawableFactory(dh.c cVar) {
        org.telegram.ui.ActionBar.h6 h6Var = this.f40081a2;
        View view = this.f40156y;
        if (view != null) {
            fh.g c10 = cVar.c(view, null, false);
            c10.p(c8.i0.e(h6Var));
            c10.r(org.telegram.messenger.g0.L(18.0f));
            c10.q(org.telegram.messenger.g0.L(6.0f));
            view.setBackground(c10);
        }
        View view2 = this.F;
        if (view2 != null) {
            fh.g c11 = cVar.c(view2, null, false);
            c11.p(c8.i0.e(h6Var));
            c11.r(org.telegram.messenger.g0.L(18.0f));
            c11.q(org.telegram.messenger.g0.L(6.0f));
            view2.setBackground(c11);
        }
        View view3 = this.f40152x;
        if (view3 != null) {
            fh.g c12 = cVar.c(view3, null, false);
            c12.p(c8.i0.e(h6Var));
            c12.r(org.telegram.messenger.g0.L(18.0f));
            c12.q(org.telegram.messenger.g0.L(6.0f));
            view3.setBackground(c12);
        }
        View view4 = this.E;
        if (view4 != null) {
            fh.g c13 = cVar.c(view4, null, false);
            c13.p(c8.i0.e(h6Var));
            c13.r(org.telegram.messenger.g0.L(18.0f));
            c13.q(org.telegram.messenger.g0.L(6.0f));
            view4.setBackground(c13);
        }
    }

    public void setBottomInset(int i7) {
        if (this.f40134r2 != i7) {
            this.f40134r2 = i7;
            j(i7, this.L);
            j(i7, this.N);
            j(org.telegram.messenger.g0.L(44.0f) + i7, this.Q);
            j(org.telegram.messenger.g0.L(44.0f) + i7, this.E0);
            j(org.telegram.messenger.g0.L(44.0f) + i7, this.f40106i0);
            FrameLayout frameLayout = this.f40135s;
            if (frameLayout != null) {
                frameLayout.setTranslationY(-i7);
            }
            S();
            invalidate();
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        this.K1 = chatFull;
        Y(false);
    }

    public void setDelegate(tx txVar) {
        this.f40143u1 = txVar;
    }

    public void setDragListener(ax axVar) {
        this.P0 = axVar;
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        gw gwVar = this.H0;
        if (gwVar != null) {
            gwVar.d.setEnabled(z10);
        }
        aw awVar = this.f40125p0;
        if (awVar != null) {
            awVar.d.setEnabled(z10);
        }
        vv vvVar = this.W;
        if (vvVar != null) {
            vvVar.d.setEnabled(z10);
        }
    }

    public void setForseMultiwindowLayout(boolean z10) {
        this.O1 = z10;
    }

    public void setShouldDrawBackground(boolean z10) {
        if (this.f40145v0 != z10) {
            this.f40145v0 = z10;
            updateColors();
        }
    }

    public void setShowing(boolean z10) {
        this.Q0 = z10;
        Z();
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        Z();
        S();
    }

    @Override
    public void setVisibility(int i7) {
        boolean z10;
        if (getVisibility() != i7) {
            z10 = true;
        } else {
            z10 = false;
        }
        super.setVisibility(i7);
        if (z10) {
            if (i7 != 8) {
                org.telegram.messenger.j6.s();
                this.S.F(false);
                xi.e eVar = this.O2;
                int i10 = this.f40091d1;
                if (eVar == null) {
                    xi.e eVar2 = (xi.e) new org.telegram.messenger.ks(org.telegram.messenger.ls.f(i10), this).f25134b;
                    eVar2.c(org.telegram.messenger.ls.f25412x0);
                    this.O2 = eVar2;
                }
                if (this.f40160z0 != null) {
                    if (!this.P2) {
                        this.P2 = true;
                        this.O2.c(org.telegram.messenger.ls.X0);
                    }
                    Y(false);
                    E();
                }
                k(true);
                k(false);
                org.telegram.messenger.si.d0(i10).Y0(0, true, true, false);
                org.telegram.messenger.si.d0(i10).Y0(0, false, true, false);
                org.telegram.messenger.si.d0(i10).Y0(2, false, true, false);
            }
            jg.d1 d1Var = this.U0;
            if (d1Var != null) {
                d1Var.a();
            }
        }
    }

    public final void t(boolean z10) {
        s(-1L, z10);
    }

    public final void u(boolean z10) {
        ly lyVar;
        boolean z11 = this.U2;
        this.U2 = z10;
        if (z11 && !z10) {
            int i7 = this.B1;
            if (i7 == 0) {
                dx dxVar = this.S;
                if (dxVar != null) {
                    dxVar.F(false);
                }
            } else if (i7 == 1) {
                xx xxVar = this.f40122o0;
                if (xxVar != null) {
                    xxVar.f();
                }
            } else if (i7 == 2 && (lyVar = this.f40160z0) != null) {
                lyVar.f();
            }
        }
    }

    @Override
    public final void updateColors() {
        try {
            T();
            ui.c cVar = this.f40118m2;
            if (cVar != null) {
                cVar.a(z(org.telegram.ui.ActionBar.m6.f29381d6));
            }
            cc0 cc0Var = this.f40152x;
            if (cc0Var != null) {
                cc0Var.setIndicatorColor(i0.a.o(z(org.telegram.ui.ActionBar.m6.Gf), 20));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final int v(float f10) {
        return i0.a.o(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Nl, this.f40081a2), (int) (f10 * 255.0f));
    }

    public final v4.t w(int i7) {
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    return this.f40109j0;
                }
                throw new IllegalArgumentException(i5.c.i(i7, "Unexpected argument: "));
            }
            return this.R;
        }
        return this.F0;
    }

    public final ek0 x(int i7) {
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    return this.f40106i0;
                }
                throw new IllegalArgumentException(i5.c.i(i7, "Unexpected argument: "));
            }
            return this.Q;
        }
        return this.E0;
    }

    public final HorizontalScrollView y(int i7) {
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    return this.f40128q0;
                }
                throw new IllegalArgumentException(i5.c.i(i7, "Unexpected argument: "));
            }
            return this.J;
        }
        return this.C0;
    }

    public final int z(int i7) {
        org.telegram.ui.ActionBar.h6 h6Var = this.f40081a2;
        if (h6Var != null) {
            return h6Var.k(i7);
        }
        return org.telegram.ui.ActionBar.m6.x0(null, i7, false);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void D(float f10, int i7) {
    }
}
