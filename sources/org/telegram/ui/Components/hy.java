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
public class hy extends FrameLayout implements org.telegram.ui.ActionBar.a6, te.b, org.telegram.messenger.ls, rh.a {
    public static final int U2 = 0;
    public final gv A0;
    public int A1;
    public int A2;
    public final uv B0;
    public final yt B1;
    public ArrayList B2;
    public final vv C0;
    public final int C1;
    public int C2;
    public final ImageView D;
    public final qv D0;
    public final int[] D1;
    public long D2;
    public final ImageView E;
    public final rv E0;
    public int E1;
    public final te.a E2;
    public AnimatorSet F;
    public fy F0;
    public int F1;
    public ArrayList F2;
    public AnimatorSet G;
    public final tv G0;
    public int G1;
    public Drawable G2;
    public float H;
    public final ph.c H0;
    public int H1;
    public int H2;
    public final lw I;
    public boolean I0;
    public int I1;
    public int I2;
    public final gw J;
    public boolean J0;
    public TLRPC.ChatFull J1;
    public int J2;
    public final pg.h K;
    public boolean K0;
    public boolean K1;
    public int K2;
    public final ph.a L;
    public final ax L0;
    public int L1;
    public boolean L2;
    public final pg.h M;
    public AnimatorSet M0;
    public final bg.r0 M1;
    public ab.b0 M2;
    public final ph.a N;
    public final bi.md N0;
    public boolean N1;
    public ab.b0 N2;
    public final View O;
    public nw O0;
    public int O1;
    public boolean O2;
    public final tw P;
    public boolean P0;
    public boolean P1;
    public AnimatorSet P2;
    public final hw Q;
    public final int[] Q0;
    public boolean Q1;
    public h2.n0 Q2;
    public final qw R;
    public final ObjectAnimator[] R0;
    public qx R1;
    public final cv R2;
    public final hx S;
    public boolean S0;
    public float S1;
    public boolean S2;
    public fy T;
    public jg.e1 T0;
    public float T1;
    public boolean T2;
    public final ph.c U;
    public boolean U0;
    public float U1;
    public final iv V;
    public boolean V0;
    public float V1;
    public AnimatorSet W;
    public String[] W0;
    public float W1;
    public final Drawable[] X0;
    public boolean X1;
    public final Drawable[] Y0;
    public final org.telegram.ui.ActionBar.f2 Y1;
    public final Drawable[] Z0;
    public final org.telegram.ui.ActionBar.f6 Z1;
    public final te.a f34390a;
    public final ri0 f34391a0;
    public final String[] f34392a1;
    public final org.telegram.ui.ActionBar.u5 f34393a2;
    public final te.a f34394b;
    public final ri0 f34395b0;
    public final int f34396b1;
    public final org.telegram.ui.ActionBar.u5 f34397b2;
    public int f34398c;
    public boolean f34399c0;
    public final int f34400c1;
    public final boolean f34401c2;
    public final ArrayList d;
    public final boolean f34402d0;
    public final ArrayList f34403d1;
    public LongSparseArray d2;
    public final ArrayList f34404e;
    public boolean f34405e0;
    public int f34406e1;
    public PorterDuffColorFilter f34407e2;
    public boolean f34408f;
    public boolean f34409f0;
    public int f34410f1;
    public final et f34411f2;
    public final kv f34412g0;
    public boolean f34413g1;
    public final cw f34414g2;
    public final wv h;
    public final lv f34415h0;
    public TLRPC.TL_messages_stickerSet f34416h1;
    public boolean f34417h2;
    public final nx f34418i0;
    public ArrayList f34419i1;
    public final boolean f34420i2;
    public final mx f34421j0;
    public ArrayList f34422j1;
    public final dh.g f34423j2;
    public final px f34424k0;
    public ArrayList f34425k1;
    public final ug f34426k2;
    public final HashMap f34427l0;
    public ArrayList l1;
    public final ri.c f34428l2;
    public final gv m0;
    public final ArrayList f34429m1;
    public final dh.c f34430m2;
    public final FrameLayout f34431n;
    public final mx f34432n0;
    public final ArrayList n1;
    public final oi.q f34433n2;
    public final nv f34434o0;
    public final ArrayList f34435o1;
    public boolean f34436o2;
    public final ow f34437p0;
    public final ArrayList f34438p1;
    public boolean f34439p2;
    public boolean f34440q0;
    public final ArrayList f34441q1;
    public int f34442q2;
    public final FrameLayout f34443r;
    public int f34444r0;
    public final HashMap f34445r1;
    public float f34446r2;
    public final FrameLayout f34447s;
    public int f34448s0;
    public final Paint f34449s1;
    public View f34450s2;
    public int f34451t0;
    public ix f34452t1;
    public int f34453t2;
    public boolean f34454u0;
    public long f34455u1;
    public int f34456u2;
    public boolean f34457v0;
    public boolean f34458v1;
    public long f34459v2;
    public final View f34460w;
    public boolean f34461w0;
    public boolean f34462w1;
    public boolean f34463w2;
    public final qb0 f34464x;
    public final ov f34465x0;
    public final TLRPC.StickerSetCovered[] f34466x1;
    public boolean f34467x2;
    public final xv f34468y;
    public final yx f34469y0;
    public final LongSparseArray f34470y1;
    public final Rect f34471y2;
    public final cy f34472z0;
    public final LongSparseArray f34473z1;
    public final GradientDrawable f34474z2;

    public hy(org.telegram.ui.ActionBar.f2 f2Var, boolean z9, boolean z10, boolean z11, Context context, boolean z12, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z13, final org.telegram.ui.ActionBar.f6 f6Var, boolean z14, boolean z15) {
        super(context);
        int i7;
        cv cvVar;
        boolean z16;
        gw gwVar;
        boolean z17;
        Context context2;
        final org.telegram.ui.ActionBar.f6 f6Var2;
        oi.q qVar;
        qw qwVar;
        int i10;
        int i11;
        int i12;
        boolean z18;
        Field field;
        boolean z19;
        qw qwVar2;
        boolean z20;
        xq xqVar = xq.h;
        this.f34390a = new te.a(0, this, xqVar, 320L, false);
        this.f34394b = new te.a(1, this, xqVar, 320L, false);
        this.f34398c = 2;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.f34404e = new ArrayList();
        this.f34399c0 = true;
        this.f34424k0 = new px(this);
        this.f34427l0 = new HashMap();
        this.f34440q0 = true;
        this.f34444r0 = -2;
        this.f34448s0 = -2;
        this.f34451t0 = -2;
        this.f34454u0 = true;
        this.f34461w0 = true;
        this.I0 = true;
        this.Q0 = new int[3];
        this.R0 = new ObjectAnimator[3];
        int i13 = org.telegram.messenger.p10.f24470s0;
        this.f34400c1 = i13;
        this.f34403d1 = new ArrayList();
        this.f34419i1 = new ArrayList();
        this.f34422j1 = new ArrayList();
        this.f34425k1 = new ArrayList();
        this.l1 = new ArrayList();
        this.f34429m1 = new ArrayList();
        this.n1 = new ArrayList();
        new ArrayList();
        this.f34435o1 = new ArrayList();
        this.f34438p1 = new ArrayList();
        this.f34441q1 = new ArrayList();
        this.f34445r1 = new HashMap();
        this.f34466x1 = new TLRPC.StickerSetCovered[10];
        this.f34470y1 = new LongSparseArray();
        this.f34473z1 = new LongSparseArray();
        this.D1 = new int[2];
        this.F1 = -2;
        this.G1 = -2;
        this.H1 = -2;
        this.I1 = -2;
        this.L1 = -1;
        this.f34411f2 = new et(this, 2);
        this.f34414g2 = new cw(this);
        this.f34417h2 = true;
        oi.q qVar2 = new oi.q();
        this.f34433n2 = qVar2;
        this.f34446r2 = -1.0f;
        this.f34453t2 = -1;
        this.f34456u2 = -1;
        this.f34459v2 = -1L;
        this.f34463w2 = false;
        this.f34467x2 = true;
        this.f34471y2 = new Rect();
        this.f34474z2 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.E2 = new te.a(0, new dv(this, 3), xqVar, 380L, true);
        this.R2 = new cv(this, 1);
        this.S2 = false;
        this.f34454u0 = z13;
        this.Y1 = f2Var;
        this.f34401c2 = z9;
        this.Z1 = f6Var;
        this.f34420i2 = z15;
        ri.c cVar = new ri.c();
        this.f34428l2 = cVar;
        cVar.a(z(org.telegram.ui.ActionBar.k6.f27852d6));
        if (z14) {
            u(true);
        }
        i0.a.o(z(org.telegram.ui.ActionBar.k6.Kl), 30);
        int L = org.telegram.messenger.g0.L(50.0f);
        this.f34396b1 = L;
        this.f34402d0 = z12;
        this.X0 = new Drawable[]{org.telegram.ui.ActionBar.k6.W(context, 2131232743, z15 ? v(0.4f) : z(org.telegram.ui.ActionBar.k6.Gf), z15 ? v(0.8f) : z(org.telegram.ui.ActionBar.k6.Df)), org.telegram.ui.ActionBar.k6.W(context, 2131232740, z15 ? v(0.4f) : z(org.telegram.ui.ActionBar.k6.Gf), z15 ? v(0.8f) : z(org.telegram.ui.ActionBar.k6.Df)), org.telegram.ui.ActionBar.k6.W(context, 2131232744, z15 ? v(0.4f) : z(org.telegram.ui.ActionBar.k6.Gf), z15 ? v(0.8f) : z(org.telegram.ui.ActionBar.k6.Df))};
        org.telegram.ui.ActionBar.u5 W = org.telegram.ui.ActionBar.k6.W(context, 2131232125, z15 ? v(0.4f) : z(org.telegram.ui.ActionBar.k6.Bf), z15 ? v(0.8f) : z(org.telegram.ui.ActionBar.k6.Df));
        org.telegram.ui.ActionBar.u5 W2 = org.telegram.ui.ActionBar.k6.W(context, 2131231064, z15 ? v(0.4f) : z(org.telegram.ui.ActionBar.k6.Bf), z15 ? v(0.8f) : z(org.telegram.ui.ActionBar.k6.Df));
        org.telegram.ui.ActionBar.u5 W3 = org.telegram.ui.ActionBar.k6.W(context, 2131231067, z15 ? v(0.4f) : z(org.telegram.ui.ActionBar.k6.Bf), z15 ? v(0.8f) : z(org.telegram.ui.ActionBar.k6.Df));
        org.telegram.ui.ActionBar.u5 W4 = org.telegram.ui.ActionBar.k6.W(context, 2131231065, z15 ? v(0.4f) : z(org.telegram.ui.ActionBar.k6.Bf), z15 ? v(0.8f) : z(org.telegram.ui.ActionBar.k6.Df));
        this.f34393a2 = W4;
        int i14 = org.telegram.ui.ActionBar.k6.Ff;
        org.telegram.ui.ActionBar.u5 W5 = org.telegram.ui.ActionBar.k6.W(context, 2131231066, z(i14), z(i14));
        this.f34397b2 = W5;
        this.Y0 = new Drawable[]{W, W2, W3, new LayerDrawable(new Drawable[]{W4, W5})};
        this.Z0 = new Drawable[]{org.telegram.ui.ActionBar.k6.W(context, 2131232125, z15 ? v(0.4f) : z(org.telegram.ui.ActionBar.k6.Bf), z15 ? v(0.8f) : z(org.telegram.ui.ActionBar.k6.Df)), org.telegram.ui.ActionBar.k6.W(context, 2131232763, z15 ? v(0.4f) : z(org.telegram.ui.ActionBar.k6.Bf), z15 ? v(0.8f) : z(org.telegram.ui.ActionBar.k6.Df))};
        this.f34392a1 = new String[]{org.telegram.messenger.id.M0(2131751196, null), org.telegram.messenger.id.M0(2131751195, null), org.telegram.messenger.id.M0(2131751194, null), org.telegram.messenger.id.M0(2131751193, null), org.telegram.messenger.id.M0(2131751192, null), org.telegram.messenger.id.M0(2131751191, null), org.telegram.messenger.id.M0(2131751190, null), org.telegram.messenger.id.M0(2131751189, null)};
        this.J1 = chatFull;
        Paint paint = new Paint(1);
        this.f34449s1 = paint;
        paint.setColor(z(org.telegram.ui.ActionBar.k6.Pf));
        bg.q0 q0Var = bg.u0.f3380a;
        this.M1 = new bg.r0(org.telegram.messenger.g0.L(6.0f));
        gw gwVar2 = new gw(this, context);
        this.J = gwVar2;
        ?? obj = new Object();
        obj.f33110a = 0;
        obj.f33111b = gwVar2;
        arrayList.add(obj);
        if (z9) {
            org.telegram.messenger.ui.b0(i13).B(5);
            org.telegram.messenger.ui.b0(i13).w();
            this.f34407e2 = new PorterDuffColorFilter(z(org.telegram.ui.ActionBar.k6.Ci), PorterDuff.Mode.SRC_IN);
        }
        tw twVar = new tw(this, context);
        this.P = twVar;
        qVar2.b(twVar);
        v4.k kVar = new v4.k();
        kVar.f57116c = 220L;
        kVar.f57117e = 220L;
        kVar.f57118f = 160L;
        kVar.f57119g = 160L;
        kVar.f57120i = xq.f40367g;
        twVar.setItemAnimator(kVar);
        twVar.setOnTouchListener(new View.OnTouchListener(this) {
            public final hy f33385b;

            {
                this.f33385b = this;
            }

            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                switch (r3) {
                    case 0:
                        org.telegram.ui.ks p10 = org.telegram.ui.ks.p();
                        hy hyVar = this.f33385b;
                        tw twVar2 = hyVar.P;
                        hyVar.getMeasuredHeight();
                        return p10.r(motionEvent, twVar2, null, hyVar.f34414g2, f6Var);
                    case 1:
                        org.telegram.ui.ks p11 = org.telegram.ui.ks.p();
                        hy hyVar2 = this.f33385b;
                        return p11.r(motionEvent, hyVar2.f34415h0, hyVar2.m0, hyVar2.f34414g2, f6Var);
                    default:
                        org.telegram.ui.ks p12 = org.telegram.ui.ks.p();
                        hy hyVar3 = this.f33385b;
                        qv qvVar = hyVar3.D0;
                        hyVar3.getMeasuredHeight();
                        return p12.r(motionEvent, qvVar, hyVar3.A0, hyVar3.f34414g2, f6Var);
                }
            }
        });
        twVar.setOnItemLongClickListener(new dv(this, 1));
        twVar.setInstantClick(true);
        hw hwVar = new hw(this);
        this.Q = hwVar;
        twVar.setLayoutManager(hwVar);
        twVar.setTopGlowOffset(org.telegram.messenger.g0.L(38.0f));
        twVar.setBottomGlowOffset(org.telegram.messenger.g0.L(36.0f));
        twVar.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(44.0f));
        int i15 = org.telegram.ui.ActionBar.k6.f28214wf;
        org.telegram.ui.ActionBar.r6.m(twVar, 21, i15, f6Var);
        twVar.setItemSelectorColorProvider(new k2(18));
        twVar.setClipToPadding(false);
        hwVar.O = new iw(this);
        qw qwVar3 = new qw(this);
        this.R = qwVar3;
        twVar.setAdapter(qwVar3);
        twVar.i(new fi.o1(this, 3));
        this.S = new hx(this, context);
        gwVar2.addView(twVar, c8.ha.c(-1.0f, -1));
        ri0 ri0Var = new ri0(twVar, hwVar);
        this.f34395b0 = ri0Var;
        ri0Var.f37678i = new jw(this);
        twVar.setOnScrollListener(new kw(this));
        if (f2Var != null) {
            i7 = -1;
            cvVar = new cv(this, 2);
            gwVar = gwVar2;
            z17 = z15;
            context2 = context;
            f6Var2 = f6Var;
            qVar = qVar2;
            qwVar = qwVar3;
            i10 = i14;
            i11 = 5;
            z16 = z9;
        } else {
            i7 = -1;
            cvVar = null;
            z16 = z9;
            gwVar = gwVar2;
            z17 = z15;
            context2 = context;
            f6Var2 = f6Var;
            qVar = qVar2;
            qwVar = qwVar3;
            i10 = i14;
            i11 = 5;
        }
        lw lwVar = new lw(this, context2, f6Var2, z16, cvVar, z17);
        this.I = lwVar;
        if (z12) {
            iv ivVar = new iv(this, context2);
            this.V = ivVar;
            gwVar.addView(ivVar, new FrameLayout.LayoutParams(i7, org.telegram.messenger.g0.f1() + L));
            ivVar.d.setOnFocusChangeListener(new jv(this));
            ph.c cVar2 = new ph.c(context2, f6Var2);
            this.U = cVar2;
            cVar2.setVisibility(8);
            cVar2.setOnBackClickListener(new View.OnClickListener(this) {
                public final hy f33647b;

                {
                    this.f33647b = this;
                }

                @Override
                public final void onClick(View view) {
                    ux uxVar;
                    switch (r2) {
                        case 0:
                            hx hxVar = this.f33647b.S;
                            cx cxVar = hxVar.f34379c;
                            int childCount = cxVar.getChildCount();
                            for (int i16 = 0; i16 < childCount; i16++) {
                                ((ph.b) cxVar.getChildAt(i16)).a(false, true);
                            }
                            hxVar.d = 0L;
                            hxVar.F.f34394b.a(false, true);
                            hxVar.f();
                            return;
                        case 1:
                            cy cyVar = this.f33647b.f34472z0;
                            cx cxVar2 = cyVar.f32719c;
                            int childCount2 = cxVar2.getChildCount();
                            for (int i17 = 0; i17 < childCount2; i17++) {
                                ((ph.b) cxVar2.getChildAt(i17)).a(false, true);
                            }
                            cyVar.d = 0L;
                            cyVar.Q.f34390a.a(false, true);
                            cyVar.f();
                            return;
                        case 2:
                            ix ixVar = this.f33647b.f34452t1;
                            if (ixVar != null) {
                                ixVar.w();
                                return;
                            }
                            return;
                        default:
                            hy hyVar = this.f33647b;
                            int currentItem = hyVar.h.getCurrentItem();
                            if (currentItem == 0) {
                                uxVar = hyVar.V;
                            } else if (currentItem == 1) {
                                uxVar = hyVar.f34434o0;
                            } else {
                                uxVar = hyVar.G0;
                            }
                            if (uxVar != null) {
                                rp rpVar = uxVar.d;
                                rpVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                rpVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                rpVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                return;
                            }
                            return;
                    }
                }
            });
            gwVar.addView(cVar2, new FrameLayout.LayoutParams(i7, L));
        }
        if (Color.alpha(z(i15)) >= 255) {
            org.telegram.ui.ActionBar.r6.i(i15, lwVar, f6Var2);
        }
        qwVar.G(true);
        lwVar.p(getEmojipacks());
        gwVar.addView(lwVar, c8.ha.c(36.0f, i7));
        View view = new View(context2);
        this.O = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        int i16 = org.telegram.ui.ActionBar.k6.f28270zf;
        org.telegram.ui.ActionBar.r6.i(i16, view, f6Var2);
        qw qwVar4 = qwVar;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i7, org.telegram.messenger.g0.f1(), 51);
        layoutParams.topMargin = org.telegram.messenger.g0.L(36.0f);
        gwVar.addView(view, layoutParams);
        ph.a aVar = new ph.a(context2, f6Var2);
        this.L = aVar;
        pg.h hVar = new pg.h(1, context2, f6Var2);
        this.K = hVar;
        hVar.setVisibility(8);
        hVar.addView(aVar, c8.ha.d(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
        gwVar.addView(hVar, c8.ha.e(i7, -2, 80));
        if (z10) {
            qk0 qk0Var = qk0.f37352b;
            if (z11) {
                kv kvVar = new kv(this, context2);
                this.f34412g0 = kvVar;
                ?? obj2 = new Object();
                obj2.f33110a = 1;
                obj2.f33111b = kvVar;
                this.d.add(obj2);
                lv lvVar = new lv(this, context2);
                this.f34415h0 = lvVar;
                qVar.b(lvVar);
                lvVar.setClipToPadding(false);
                nx nxVar = new nx(this);
                this.f34418i0 = nxVar;
                lvVar.setLayoutManager(nxVar);
                lvVar.i(new mv(this));
                lvVar.setPadding(0, L, 0, org.telegram.messenger.g0.L(44.0f) + this.f34442q2);
                ((v4.f1) lvVar.getItemAnimator()).f57071m = false;
                mx mxVar = new mx(this, context2, true, Integer.MAX_VALUE);
                this.f34432n0 = mxVar;
                lvVar.setAdapter(mxVar);
                this.f34421j0 = new mx(this, context2, false, 0);
                lvVar.setOnScrollListener(new gy(this, 2));
                lvVar.setOnTouchListener(new View.OnTouchListener(this) {
                    public final hy f33385b;

                    {
                        this.f33385b = this;
                    }

                    @Override
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        switch (r3) {
                            case 0:
                                org.telegram.ui.ks p10 = org.telegram.ui.ks.p();
                                hy hyVar = this.f33385b;
                                tw twVar2 = hyVar.P;
                                hyVar.getMeasuredHeight();
                                return p10.r(motionEvent, twVar2, null, hyVar.f34414g2, f6Var2);
                            case 1:
                                org.telegram.ui.ks p11 = org.telegram.ui.ks.p();
                                hy hyVar2 = this.f33385b;
                                return p11.r(motionEvent, hyVar2.f34415h0, hyVar2.m0, hyVar2.f34414g2, f6Var2);
                            default:
                                org.telegram.ui.ks p12 = org.telegram.ui.ks.p();
                                hy hyVar3 = this.f33385b;
                                qv qvVar = hyVar3.D0;
                                hyVar3.getMeasuredHeight();
                                return p12.r(motionEvent, qvVar, hyVar3.A0, hyVar3.f34414g2, f6Var2);
                        }
                    }
                });
                ?? r10 = new bj0(this) {
                    public final hy f34027b;

                    {
                        this.f34027b = this;
                    }

                    @Override
                    public final void c(int i17, View view2) {
                        int i18;
                        String str;
                        switch (r2) {
                            case 0:
                                hy hyVar = this.f34027b;
                                lv lvVar2 = hyVar.f34415h0;
                                mx mxVar2 = hyVar.f34421j0;
                                mx mxVar3 = hyVar.f34432n0;
                                if (hyVar.f34452t1 != null) {
                                    mxVar3.getClass();
                                    ArrayList arrayList2 = mxVar3.f36133y;
                                    if (lvVar2.getAdapter() == mxVar3) {
                                        if (i17 >= 0) {
                                            int i19 = mxVar3.H;
                                            if (i17 < i19) {
                                                hyVar.f34452t1.v(view2, hyVar.f34419i1.get(i17), null, "gif", true, 0, 0);
                                                return;
                                            }
                                            if (i19 > 0) {
                                                i18 = (i17 - i19) - 1;
                                            } else {
                                                i18 = i17;
                                            }
                                            if (i18 >= 0 && i18 < arrayList2.size()) {
                                                hyVar.f34452t1.v(view2, arrayList2.get(i18), null, mxVar3.f36128n, true, 0, 0);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    } else if (lvVar2.getAdapter() == mxVar2 && i17 >= 0 && i17 < mxVar2.f36133y.size()) {
                                        hyVar.f34452t1.v(view2, mxVar2.f36133y.get(i17), mxVar2.f36132x, mxVar2.f36128n, true, 0, 0);
                                        hyVar.W();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            default:
                                hy hyVar2 = this.f34027b;
                                v4.g0 adapter = hyVar2.D0.getAdapter();
                                cy cyVar = hyVar2.f34472z0;
                                if (adapter == cyVar) {
                                    str = cyVar.N;
                                } else {
                                    str = null;
                                }
                                String str2 = str;
                                if (view2 instanceof org.telegram.ui.Cells.z7) {
                                    org.telegram.ui.Cells.z7 z7Var = (org.telegram.ui.Cells.z7) view2;
                                    if (z7Var.getSticker() != null && org.telegram.messenger.ij.Y3(z7Var.getSticker()) && !org.telegram.messenger.p10.i(org.telegram.messenger.c.a(hyVar2.f34400c1).f21765a).q()) {
                                        org.telegram.ui.ks.p().x(z7Var);
                                        return;
                                    }
                                    org.telegram.ui.ks.p().t();
                                    if (!z7Var.f30978r) {
                                        z7Var.f30978r = true;
                                        z7Var.f30977n = 0.5f;
                                        z7Var.f30982y = 0L;
                                        org.telegram.ui.Cells.y7 y7Var = z7Var.f30972a;
                                        y7Var.setAlpha(0.5f * z7Var.H);
                                        y7Var.invalidate();
                                        z7Var.f30979s = System.currentTimeMillis();
                                        z7Var.invalidate();
                                        hyVar2.f34452t1.m(z7Var, z7Var.getSticker(), str2, z7Var.getParentObject(), z7Var.getSendAnimationData(), true, 0);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                };
                this.m0 = r10;
                lvVar.setOnItemClickListener((bj0) r10);
                kvVar.addView(lvVar, c8.ha.c(-1.0f, -1));
                nv nvVar = new nv(this, context2);
                this.f34434o0 = nvVar;
                kvVar.addView(nvVar, new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1() + L));
                ow owVar = new ow(this, context2, f6Var2);
                this.f34437p0 = owVar;
                owVar.setType(qk0Var);
                owVar.setUnderlineHeight(org.telegram.messenger.g0.f1());
                owVar.setIndicatorColor(z(i10));
                owVar.setUnderlineColor(z(i16));
                org.telegram.ui.ActionBar.r6.i(i15, owVar, f6Var2);
                V();
                owVar.setDelegate(new dv(this, 2));
                mxVar.F("", "", true, true, true);
            }
            ov ovVar = new ov(this, context2, z13);
            this.f34465x0 = ovVar;
            org.telegram.messenger.ui.b0(this.f34400c1).B(0);
            org.telegram.messenger.ui.b0(this.f34400c1).x();
            qv qvVar = new qv(this, context2);
            this.D0 = qvVar;
            this.f34433n2.b(qvVar);
            rv rvVar = new rv(this);
            this.E0 = rvVar;
            qvVar.setLayoutManager(rvVar);
            rvVar.O = new sv(this);
            qvVar.setPadding(0, org.telegram.messenger.g0.L(36.0f), 0, org.telegram.messenger.g0.L(44.0f));
            qvVar.setClipToPadding(false);
            ?? obj3 = new Object();
            obj3.f33110a = 2;
            obj3.f33111b = ovVar;
            this.d.add(obj3);
            this.f34472z0 = new cy(this, context2);
            yx yxVar = new yx(this, context2);
            this.f34469y0 = yxVar;
            qvVar.setAdapter(yxVar);
            qvVar.setOnTouchListener(new View.OnTouchListener(this) {
                public final hy f33385b;

                {
                    this.f33385b = this;
                }

                @Override
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    switch (r3) {
                        case 0:
                            org.telegram.ui.ks p10 = org.telegram.ui.ks.p();
                            hy hyVar = this.f33385b;
                            tw twVar2 = hyVar.P;
                            hyVar.getMeasuredHeight();
                            return p10.r(motionEvent, twVar2, null, hyVar.f34414g2, f6Var2);
                        case 1:
                            org.telegram.ui.ks p11 = org.telegram.ui.ks.p();
                            hy hyVar2 = this.f33385b;
                            return p11.r(motionEvent, hyVar2.f34415h0, hyVar2.m0, hyVar2.f34414g2, f6Var2);
                        default:
                            org.telegram.ui.ks p12 = org.telegram.ui.ks.p();
                            hy hyVar3 = this.f33385b;
                            qv qvVar2 = hyVar3.D0;
                            hyVar3.getMeasuredHeight();
                            return p12.r(motionEvent, qvVar2, hyVar3.A0, hyVar3.f34414g2, f6Var2);
                    }
                }
            });
            ?? r42 = new bj0(this) {
                public final hy f34027b;

                {
                    this.f34027b = this;
                }

                @Override
                public final void c(int i17, View view2) {
                    int i18;
                    String str;
                    switch (r2) {
                        case 0:
                            hy hyVar = this.f34027b;
                            lv lvVar2 = hyVar.f34415h0;
                            mx mxVar2 = hyVar.f34421j0;
                            mx mxVar3 = hyVar.f34432n0;
                            if (hyVar.f34452t1 != null) {
                                mxVar3.getClass();
                                ArrayList arrayList2 = mxVar3.f36133y;
                                if (lvVar2.getAdapter() == mxVar3) {
                                    if (i17 >= 0) {
                                        int i19 = mxVar3.H;
                                        if (i17 < i19) {
                                            hyVar.f34452t1.v(view2, hyVar.f34419i1.get(i17), null, "gif", true, 0, 0);
                                            return;
                                        }
                                        if (i19 > 0) {
                                            i18 = (i17 - i19) - 1;
                                        } else {
                                            i18 = i17;
                                        }
                                        if (i18 >= 0 && i18 < arrayList2.size()) {
                                            hyVar.f34452t1.v(view2, arrayList2.get(i18), null, mxVar3.f36128n, true, 0, 0);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                } else if (lvVar2.getAdapter() == mxVar2 && i17 >= 0 && i17 < mxVar2.f36133y.size()) {
                                    hyVar.f34452t1.v(view2, mxVar2.f36133y.get(i17), mxVar2.f36132x, mxVar2.f36128n, true, 0, 0);
                                    hyVar.W();
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        default:
                            hy hyVar2 = this.f34027b;
                            v4.g0 adapter = hyVar2.D0.getAdapter();
                            cy cyVar = hyVar2.f34472z0;
                            if (adapter == cyVar) {
                                str = cyVar.N;
                            } else {
                                str = null;
                            }
                            String str2 = str;
                            if (view2 instanceof org.telegram.ui.Cells.z7) {
                                org.telegram.ui.Cells.z7 z7Var = (org.telegram.ui.Cells.z7) view2;
                                if (z7Var.getSticker() != null && org.telegram.messenger.ij.Y3(z7Var.getSticker()) && !org.telegram.messenger.p10.i(org.telegram.messenger.c.a(hyVar2.f34400c1).f21765a).q()) {
                                    org.telegram.ui.ks.p().x(z7Var);
                                    return;
                                }
                                org.telegram.ui.ks.p().t();
                                if (!z7Var.f30978r) {
                                    z7Var.f30978r = true;
                                    z7Var.f30977n = 0.5f;
                                    z7Var.f30982y = 0L;
                                    org.telegram.ui.Cells.y7 y7Var = z7Var.f30972a;
                                    y7Var.setAlpha(0.5f * z7Var.H);
                                    y7Var.invalidate();
                                    z7Var.f30979s = System.currentTimeMillis();
                                    z7Var.invalidate();
                                    hyVar2.f34452t1.m(z7Var, z7Var.getSticker(), str2, z7Var.getParentObject(), z7Var.getSendAnimationData(), true, 0);
                                    return;
                                }
                                return;
                            }
                            return;
                    }
                }
            };
            this.A0 = r42;
            qvVar.setOnItemClickListener((bj0) r42);
            org.telegram.ui.ActionBar.r6.m(qvVar, 21, i15, f6Var2);
            ovVar.addView(qvVar);
            this.f34391a0 = new ri0(qvVar, rvVar);
            tv tvVar = new tv(this, context2);
            this.G0 = tvVar;
            ovVar.addView(tvVar, new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1() + L));
            ph.c cVar3 = new ph.c(context2, f6Var2);
            this.H0 = cVar3;
            cVar3.setVisibility(8);
            cVar3.setOnBackClickListener(new View.OnClickListener(this) {
                public final hy f33647b;

                {
                    this.f33647b = this;
                }

                @Override
                public final void onClick(View view2) {
                    ux uxVar;
                    switch (r2) {
                        case 0:
                            hx hxVar = this.f33647b.S;
                            cx cxVar = hxVar.f34379c;
                            int childCount = cxVar.getChildCount();
                            for (int i162 = 0; i162 < childCount; i162++) {
                                ((ph.b) cxVar.getChildAt(i162)).a(false, true);
                            }
                            hxVar.d = 0L;
                            hxVar.F.f34394b.a(false, true);
                            hxVar.f();
                            return;
                        case 1:
                            cy cyVar = this.f33647b.f34472z0;
                            cx cxVar2 = cyVar.f32719c;
                            int childCount2 = cxVar2.getChildCount();
                            for (int i17 = 0; i17 < childCount2; i17++) {
                                ((ph.b) cxVar2.getChildAt(i17)).a(false, true);
                            }
                            cyVar.d = 0L;
                            cyVar.Q.f34390a.a(false, true);
                            cyVar.f();
                            return;
                        case 2:
                            ix ixVar = this.f33647b.f34452t1;
                            if (ixVar != null) {
                                ixVar.w();
                                return;
                            }
                            return;
                        default:
                            hy hyVar = this.f33647b;
                            int currentItem = hyVar.h.getCurrentItem();
                            if (currentItem == 0) {
                                uxVar = hyVar.V;
                            } else if (currentItem == 1) {
                                uxVar = hyVar.f34434o0;
                            } else {
                                uxVar = hyVar.G0;
                            }
                            if (uxVar != null) {
                                rp rpVar = uxVar.d;
                                rpVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                rpVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                rpVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                return;
                            }
                            return;
                    }
                }
            });
            ovVar.addView(cVar3, new FrameLayout.LayoutParams(-1, L));
            z18 = z13;
            i12 = 80;
            uv uvVar = new uv(this, context2, f6Var2, f2Var, z18);
            this.B0 = uvVar;
            uvVar.setDragEnabled(true);
            uvVar.setWillNotDraw(false);
            uvVar.setType(qk0Var);
            uvVar.setUnderlineHeight(qvVar.canScrollVertically(-1) ? org.telegram.messenger.g0.f1() : 0);
            uvVar.setIndicatorColor(z(i10));
            uvVar.setUnderlineColor(z(i16));
            if (viewGroup != null && z18) {
                vv vvVar = new vv(this, context2);
                this.C0 = vvVar;
                vvVar.addView(uvVar, c8.ha.e(-1, 36, 51));
                viewGroup.addView(vvVar, c8.ha.c(-2.0f, -1));
            } else {
                ovVar.addView(uvVar, c8.ha.e(-1, 36, 51));
            }
            X(true);
            uvVar.setDelegate(new dv(this, 4));
            qvVar.setOnScrollListener(new gy(this, 0));
            ph.a aVar2 = new ph.a(context2, f6Var2);
            this.N = aVar2;
            pg.h hVar2 = new pg.h(1, context2, f6Var2);
            this.M = hVar2;
            hVar2.setVisibility(8);
            hVar2.addView(aVar2, c8.ha.d(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
            ovVar.addView(hVar2, c8.ha.e(-1, -2, 80));
        } else {
            i12 = 80;
            z18 = z13;
        }
        this.f34404e.clear();
        this.f34404e.addAll(this.d);
        wv wvVar = new wv(this, context2);
        this.h = wvVar;
        oi.q qVar3 = this.f34433n2;
        qVar3.getClass();
        wvVar.b(new oi.i(qVar3, wvVar));
        wvVar.setOverScrollMode(2);
        ax axVar = new ax(this);
        this.L0 = axVar;
        wvVar.setAdapter(axVar);
        xv xvVar = new xv(this, context2);
        this.f34468y = xvVar;
        xvVar.setHapticFeedbackEnabled(true);
        xvVar.setImageResource(2131232739);
        int v = z15 ? v(0.6f) : z(org.telegram.ui.ActionBar.k6.Gf);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        xvVar.setColorFilter(new PorterDuffColorFilter(v, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        xvVar.setScaleType(scaleType);
        xvVar.setContentDescription(org.telegram.messenger.id.M0(2131754920, null));
        xvVar.setFocusable(true);
        xvVar.setOnClickListener(new Object());
        c8.ka.a(xvVar);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f34443r = frameLayout;
        if (z12) {
            addView(frameLayout, c8.ha.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, (org.telegram.messenger.g0.f1() / org.telegram.messenger.g0.f22562p) + 40.0f));
        } else {
            addView(frameLayout, c8.ha.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.f34447s = frameLayout2;
        addView(frameLayout2, c8.ha.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 64.0f));
        FrameLayout frameLayout3 = new FrameLayout(context2);
        this.f34431n = frameLayout3;
        View view2 = new View(context2);
        this.f34460w = view2;
        frameLayout3.addView(view2, new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.L(40.0f), 83));
        if (z12) {
            addView(frameLayout3, c8.ha.e(-1, 48, i12));
            frameLayout3.addView(xvVar, c8.ha.d(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
            if (z10) {
                ImageView imageView = new ImageView(context2);
                this.D = imageView;
                imageView.setImageResource(2131232742);
                imageView.setColorFilter(new PorterDuffColorFilter(z15 ? v(0.6f) : z(org.telegram.ui.ActionBar.k6.Gf), mode));
                imageView.setScaleType(scaleType);
                imageView.setFocusable(true);
                imageView.setContentDescription(org.telegram.messenger.id.M0(2131745498, null));
                c8.ka.a(imageView);
                frameLayout3.addView(imageView, c8.ha.d(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
                imageView.setOnClickListener(new View.OnClickListener(this) {
                    public final hy f33647b;

                    {
                        this.f33647b = this;
                    }

                    @Override
                    public final void onClick(View view22) {
                        ux uxVar;
                        switch (r2) {
                            case 0:
                                hx hxVar = this.f33647b.S;
                                cx cxVar = hxVar.f34379c;
                                int childCount = cxVar.getChildCount();
                                for (int i162 = 0; i162 < childCount; i162++) {
                                    ((ph.b) cxVar.getChildAt(i162)).a(false, true);
                                }
                                hxVar.d = 0L;
                                hxVar.F.f34394b.a(false, true);
                                hxVar.f();
                                return;
                            case 1:
                                cy cyVar = this.f33647b.f34472z0;
                                cx cxVar2 = cyVar.f32719c;
                                int childCount2 = cxVar2.getChildCount();
                                for (int i17 = 0; i17 < childCount2; i17++) {
                                    ((ph.b) cxVar2.getChildAt(i17)).a(false, true);
                                }
                                cyVar.d = 0L;
                                cyVar.Q.f34390a.a(false, true);
                                cyVar.f();
                                return;
                            case 2:
                                ix ixVar = this.f33647b.f34452t1;
                                if (ixVar != null) {
                                    ixVar.w();
                                    return;
                                }
                                return;
                            default:
                                hy hyVar = this.f33647b;
                                int currentItem = hyVar.h.getCurrentItem();
                                if (currentItem == 0) {
                                    uxVar = hyVar.V;
                                } else if (currentItem == 1) {
                                    uxVar = hyVar.f34434o0;
                                } else {
                                    uxVar = hyVar.G0;
                                }
                                if (uxVar != null) {
                                    rp rpVar = uxVar.d;
                                    rpVar.requestFocus();
                                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                    rpVar.onTouchEvent(obtain);
                                    obtain.recycle();
                                    MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                    rpVar.onTouchEvent(obtain2);
                                    obtain2.recycle();
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            qb0 qb0Var = new qb0(context2, f6Var2);
            this.f34464x = qb0Var;
            qb0Var.setViewPager(wvVar);
            qb0Var.setShouldExpand(false);
            qb0Var.setIndicatorHeight(org.telegram.messenger.g0.L(3.0f));
            qb0Var.setIndicatorColor(i0.a.o(z(org.telegram.ui.ActionBar.k6.Df), 20));
            qb0Var.setUnderlineHeight(0);
            qb0Var.setTabPaddingLeftRight(org.telegram.messenger.g0.L(11.0f));
            qb0Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(11.0f));
            frameLayout3.addView(qb0Var, c8.ha.e(-2, 48, 81));
            qb0Var.setOnPageChangeListener(new zv(this, z18));
            ImageView imageView2 = new ImageView(context2);
            this.E = imageView2;
            imageView2.setImageResource(2131232741);
            imageView2.setColorFilter(new PorterDuffColorFilter(z15 ? v(0.6f) : z(org.telegram.ui.ActionBar.k6.Gf), mode));
            imageView2.setScaleType(scaleType);
            imageView2.setContentDescription(org.telegram.messenger.id.M0(2131745839, null));
            imageView2.setFocusable(true);
            imageView2.setVisibility(8);
            frameLayout3.addView(imageView2, c8.ha.d(48, 48.0f, 83, 2.0f, 0.0f, 2.0f, 0.0f));
            imageView2.setOnClickListener(new View.OnClickListener(this) {
                public final hy f33647b;

                {
                    this.f33647b = this;
                }

                @Override
                public final void onClick(View view22) {
                    ux uxVar;
                    switch (r2) {
                        case 0:
                            hx hxVar = this.f33647b.S;
                            cx cxVar = hxVar.f34379c;
                            int childCount = cxVar.getChildCount();
                            for (int i162 = 0; i162 < childCount; i162++) {
                                ((ph.b) cxVar.getChildAt(i162)).a(false, true);
                            }
                            hxVar.d = 0L;
                            hxVar.F.f34394b.a(false, true);
                            hxVar.f();
                            return;
                        case 1:
                            cy cyVar = this.f33647b.f34472z0;
                            cx cxVar2 = cyVar.f32719c;
                            int childCount2 = cxVar2.getChildCount();
                            for (int i17 = 0; i17 < childCount2; i17++) {
                                ((ph.b) cxVar2.getChildAt(i17)).a(false, true);
                            }
                            cyVar.d = 0L;
                            cyVar.Q.f34390a.a(false, true);
                            cyVar.f();
                            return;
                        case 2:
                            ix ixVar = this.f33647b.f34452t1;
                            if (ixVar != null) {
                                ixVar.w();
                                return;
                            }
                            return;
                        default:
                            hy hyVar = this.f33647b;
                            int currentItem = hyVar.h.getCurrentItem();
                            if (currentItem == 0) {
                                uxVar = hyVar.V;
                            } else if (currentItem == 1) {
                                uxVar = hyVar.f34434o0;
                            } else {
                                uxVar = hyVar.G0;
                            }
                            if (uxVar != null) {
                                rp rpVar = uxVar.d;
                                rpVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                rpVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                rpVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                return;
                            }
                            return;
                    }
                }
            });
        } else {
            addView(frameLayout3, c8.ha.d(56, 48.0f, (org.telegram.messenger.id.f23157a0 ? 3 : i11) | 80, 0.0f, 0.0f, 2.0f, 0.0f));
            org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.k6.j0(org.telegram.messenger.g0.L(56.0f), z(i15), z(i15));
            c8.ka.a(xvVar);
            xvVar.setPadding(0, 0, org.telegram.messenger.g0.L(2.0f), 0);
            xvVar.setBackground(j02);
            xvVar.setContentDescription(org.telegram.messenger.id.M0(2131754920, null));
            xvVar.setFocusable(true);
            frameLayout3.addView(xvVar, c8.ha.d(48, 48.0f, 51, 2.0f, 0.0f, 2.0f, 0.0f));
            view2.setVisibility(8);
        }
        addView(wvVar, 0, c8.ha.e(-1, -1, 51));
        bi.md mdVar = new bi.md(context2, 24);
        this.N0 = mdVar;
        int L2 = org.telegram.messenger.g0.L(6.0f);
        int i17 = org.telegram.ui.ActionBar.k6.f27880eg;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L2, z(i17));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i17);
        mdVar.setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(mdVar, d02, N, null, f6Var2);
        org.telegram.ui.ActionBar.r6.V(mdVar, org.telegram.ui.ActionBar.k6.f27861dg, f6Var2);
        mdVar.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(7.0f));
        char c10 = 16;
        mdVar.setGravity(16);
        mdVar.setTextSize(1, 14.0f);
        mdVar.setVisibility(4);
        addView(mdVar, c8.ha.d(-2, -2.0f, 81, 5.0f, 0.0f, 5.0f, 53.0f));
        this.C1 = org.telegram.messenger.g0.L(org.telegram.messenger.g0.Q1() ? 40.0f : 32.0f);
        Field field2 = yt.f40743f;
        yt ytVar = new yt(new xt(context2, f6Var2));
        if (yt.f40743f == null) {
            try {
                field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
                try {
                    field.setAccessible(true);
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                field = null;
            }
            yt.f40743f = field;
        }
        Field field3 = yt.f40743f;
        if (field3 != null) {
            try {
                ytVar.f40745a = (ViewTreeObserver.OnScrollChangedListener) field3.get(ytVar);
                yt.f40743f.set(ytVar, yt.f40744g);
            } catch (Exception unused3) {
                ytVar.f40745a = null;
            }
        }
        this.B1 = ytVar;
        ytVar.f40747c.setOnSelectionUpdateListener(new d(this, 10));
        this.A1 = org.telegram.messenger.qp.d1().getInt("selected_page", 0);
        HashMap hashMap = org.telegram.messenger.i6.h;
        if (!org.telegram.messenger.i6.f23060k) {
            org.telegram.messenger.i6.f23060k = true;
            SharedPreferences d12 = org.telegram.messenger.qp.d1();
            try {
                hashMap.clear();
                if (d12.contains("emojis")) {
                    String string = d12.getString("emojis", "");
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
                    d12.edit().remove("emojis").commit();
                    org.telegram.messenger.i6.r();
                } else {
                    String string2 = d12.getString("emojis2", "");
                    if (string2 != null && string2.length() > 0) {
                        for (String str : string2.split(",")) {
                            String[] split3 = str.split("=");
                            hashMap.put(split3[0], Utilities.z(split3[1]));
                        }
                    }
                }
                if (hashMap.isEmpty() && !d12.getBoolean("filled_default", false)) {
                    int i21 = 0;
                    while (true) {
                        String[] strArr2 = org.telegram.messenger.i6.f23064o;
                        if (i21 >= strArr2.length) {
                            break;
                        }
                        hashMap.put(strArr2[i21], Integer.valueOf(strArr2.length - i21));
                        i21++;
                    }
                    d12.edit().putBoolean("filled_default", true).commit();
                    org.telegram.messenger.i6.r();
                }
                org.telegram.messenger.i6.s();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            try {
                String string3 = d12.getString("color", "");
                if (string3 != null && string3.length() > 0) {
                    for (String str2 : string3.split(",")) {
                        String[] split4 = str2.split("=");
                        org.telegram.messenger.i6.f23059j.put(split4[0], split4[1]);
                    }
                }
            } catch (Exception e11) {
                z19 = true;
                org.telegram.messenger.a8.g(e11, true);
                qwVar2 = qwVar4;
                z20 = false;
            }
        }
        qwVar2 = qwVar4;
        z20 = false;
        z19 = true;
        qwVar2.F(z20);
        I(z19, z10, z11, z20);
        if (Build.VERSION.SDK_INT >= 31) {
            dh.g gVar = new dh.g(z20);
            this.f34423j2 = gVar;
            this.f34433n2.a(gVar);
            ri.f fVar = new ri.f(null);
            fVar.f54573f = cVar;
            fVar.d = gVar;
            fVar.f54572e = -2;
            dh.c cVar4 = new dh.c(fVar, fVar, fVar);
            this.f34430m2 = cVar4;
            cVar4.f8710k = true;
            int L3 = org.telegram.messenger.g0.L(org.telegram.messenger.sc.e(262144) ? 8.0f : 48.0f);
            cVar4.d = L3;
            cVar4.f8705e = L3;
            cVar4.f8709j = this.f34433n2;
        } else {
            dh.c cVar5 = new dh.c(cVar, cVar, cVar);
            this.f34430m2 = cVar5;
            cVar5.f8709j = this.f34433n2;
            this.f34423j2 = null;
        }
        this.f34426k2 = new ug(this, 1);
        setBlurredBackgroundDrawableFactory(this.f34430m2);
        this.f34433n2.i(this);
        this.f34433n2.f21099a = new dv(this, 0);
    }

    public static void a(hy hyVar, boolean z9) {
        lv lvVar = hyVar.f34415h0;
        if (lvVar != null) {
            int childCount = lvVar.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = lvVar.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.h2) {
                    ImageReceiver photoImage = ((org.telegram.ui.Cells.h2) childAt).getPhotoImage();
                    if (z9) {
                        photoImage.f21220t0 = true;
                        photoImage.P0(false);
                    } else {
                        photoImage.f21220t0 = false;
                        photoImage.Q0();
                    }
                }
            }
        }
    }

    public static void d(hy hyVar, qx qxVar, String str) {
        String str2;
        String str3;
        boolean z9;
        String str4;
        ix ixVar;
        hc hcVar;
        org.telegram.ui.ActionBar.f2 f2Var = hyVar.Y1;
        int i7 = hyVar.f34400c1;
        ArrayList arrayList = hyVar.f34441q1;
        if (qxVar != null) {
            if (qxVar.getSpan() != null) {
                if (hyVar.f34452t1 != null) {
                    long j3 = qxVar.getSpan().documentId;
                    TLRPC.Document document = qxVar.getSpan().document;
                    uw uwVar = qxVar.f37445e;
                    if (uwVar != null && uwVar.f38752i) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (document == null) {
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            uw uwVar2 = (uw) arrayList.get(i10);
                            int i11 = 0;
                            while (true) {
                                ArrayList arrayList2 = uwVar2.f38748c;
                                if (arrayList2 != null && i11 < arrayList2.size()) {
                                    if (((TLRPC.Document) uwVar2.f38748c.get(i11)).f26962id == j3) {
                                        document = (TLRPC.Document) uwVar2.f38748c.get(i11);
                                        break;
                                    }
                                    i11++;
                                }
                            }
                        }
                    }
                    if (document == null) {
                        document = i5.e(i7, j3);
                    }
                    TLRPC.Document document2 = document;
                    if (document2 != null) {
                        str4 = org.telegram.messenger.ij.U(document2);
                    } else {
                        str4 = null;
                    }
                    if (!org.telegram.messenger.ij.n3(document2) && !org.telegram.messenger.p10.i(i7).q() && (((ixVar = hyVar.f34452t1) == null || !ixVar.g()) && !hyVar.U0 && !z9)) {
                        hyVar.M(false);
                        if (f2Var != null) {
                            hcVar = hc.a0(f2Var);
                        } else {
                            hcVar = new hc(hyVar.f34443r, hyVar.Z1);
                        }
                        if (!hyVar.f34417h2 && f2Var != null) {
                            hcVar.K(2131624190, org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131743866, null)), org.telegram.messenger.id.M0(2131747818, null), new cv(hyVar, 4)).j();
                        } else {
                            hcVar.r(document2, org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131743867, null)), org.telegram.messenger.id.M0(2131747034, null), new cv(hyVar, 3)).j();
                        }
                        hyVar.f34417h2 = !hyVar.f34417h2;
                        return;
                    }
                    hyVar.D2 = SystemClock.elapsedRealtime();
                    hyVar.M(true);
                    hyVar.h("animated_" + j3);
                    hyVar.f34452t1.x(j3, document2, str4, qxVar.f37444c);
                    return;
                }
                return;
            }
            hyVar.D2 = SystemClock.elapsedRealtime();
            hyVar.M(true);
            if (str != null) {
                str2 = str;
            } else {
                str2 = (String) qxVar.getTag();
            }
            new SpannableStringBuilder().append((CharSequence) str2);
            if (str == null) {
                if (!qxVar.f37444c && (str3 = (String) org.telegram.messenger.i6.f23059j.get(str2)) != null) {
                    str2 = g(str2, str3);
                }
                hyVar.h(str2);
                ix ixVar2 = hyVar.f34452t1;
                if (ixVar2 != null) {
                    ixVar2.l(org.telegram.messenger.i6.c(str2));
                    return;
                }
                return;
            }
            ix ixVar3 = hyVar.f34452t1;
            if (ixVar3 != null) {
                ixVar3.l(org.telegram.messenger.i6.c(str));
            }
        }
    }

    public static void e(hy hyVar, int i7, int i10) {
        v4.d1 K;
        int[] iArr = hyVar.Q0;
        if (i7 == 1) {
            hyVar.n(i10, hyVar.P);
            return;
        }
        ix ixVar = hyVar.f34452t1;
        if ((ixVar == null || !ixVar.z()) && !hyVar.J0) {
            pj0 x10 = hyVar.x(i7);
            if (i10 > 0 && x10 != null && x10.getVisibility() == 0 && (K = x10.K(0)) != null && K.f57044a.getTop() + hyVar.f34396b1 >= x10.getPaddingTop()) {
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
                hyVar.Z();
            } else {
                hyVar.y(i7).setTranslationY(Math.max(-org.telegram.messenger.g0.L(48.0f), iArr[i7]));
            }
        }
    }

    public static void f(hy hyVar, boolean z9) {
        int N0;
        nx nxVar = hyVar.f34418i0;
        nv nvVar = hyVar.f34434o0;
        lv lvVar = hyVar.f34415h0;
        if (lvVar != null && (lvVar.getAdapter() instanceof mx)) {
            mx mxVar = (mx) lvVar.getAdapter();
            if (!mxVar.f36130s && mxVar.h == 0 && !mxVar.f36133y.isEmpty() && (N0 = nxVar.N0()) != -1 && N0 > nxVar.B() - 5) {
                String str = mxVar.f36132x;
                String str2 = mxVar.f36129r;
                boolean z10 = mxVar.f36131w;
                mxVar.F(str, str2, true, z10, z10);
            }
        }
        ix ixVar = hyVar.f34452t1;
        if (ixVar != null && ixVar.z()) {
            boolean z11 = false;
            v4.d1 K = lvVar.K(0);
            if (K == null) {
                ux.a(nvVar, true, !z9);
                return;
            }
            if (K.f57044a.getTop() < lvVar.getPaddingTop()) {
                z11 = true;
            }
            ux.a(nvVar, z11, !z9);
        } else if (nvVar != null && lvVar != null) {
            nvVar.f38765a.a(true, !z9);
        }
    }

    public static String g(String str, String str2) {
        String str3;
        String str4;
        boolean z9 = true;
        if (org.telegram.messenger.h4.c(str) != null) {
            if (org.telegram.messenger.h4.c(str) == null) {
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
        if (org.telegram.messenger.i6.b(str)) {
            str = com.google.android.recaptcha.internal.a.k(str, 2, 0);
        } else {
            z9 = false;
        }
        int length = str.length();
        if (length > 2 && str.charAt(str.length() - 2) == 8205) {
            str3 = str.substring(str.length() - 2);
            str = com.google.android.recaptcha.internal.a.k(str, 2, 0);
        } else if (length > 3 && str.charAt(str.length() - 3) == 8205) {
            str3 = str.substring(str.length() - 3);
            str = com.google.android.recaptcha.internal.a.k(str, 3, 0);
        } else {
            str3 = null;
        }
        String r10 = rf.b.r(str, str2);
        if (str3 != null) {
            r10 = rf.b.r(r10, str3);
        }
        if (z9) {
            return rf.b.r(r10, "\u200d➡");
        }
        return r10;
    }

    public static void j(int i7, View view) {
        if (view == null) {
            return;
        }
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i7);
    }

    public final void A() {
        tv tvVar = this.G0;
        if (tvVar != null) {
            tvVar.b();
        }
        nv nvVar = this.f34434o0;
        if (nvVar != null) {
            nvVar.b();
        }
        iv ivVar = this.V;
        if (ivVar != null) {
            ivVar.b();
        }
    }

    public final void B() {
        ab.b0 b0Var = this.M2;
        if (b0Var != null) {
            b0Var.b();
            this.M2 = null;
        }
        ab.b0 b0Var2 = this.N2;
        if (b0Var2 != null) {
            b0Var2.b();
            this.N2 = null;
            this.O2 = false;
        }
    }

    public final void C(boolean z9, boolean z10) {
        tx txVar;
        boolean z11;
        if (this.A1 != 0 && this.f34462w1) {
            this.A1 = 0;
        }
        if (this.A1 == 0 && this.f34458v1) {
            this.A1 = 1;
        }
        int i7 = this.A1;
        wv wvVar = this.h;
        if (i7 != 0 && !z9 && this.f34404e.size() != 1) {
            int i10 = this.A1;
            if (i10 == 1) {
                L(false, false);
                if (!this.f34454u0 && !this.f34457v0) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                Q(z11, false);
                if (wvVar.getCurrentItem() != 2) {
                    wvVar.x(2, false);
                }
                uv uvVar = this.B0;
                if (uvVar != null) {
                    this.S0 = true;
                    int i11 = this.G1;
                    if (i11 >= 0) {
                        uvVar.m(i11);
                    } else {
                        int i12 = this.F1;
                        if (i12 >= 0) {
                            uvVar.m(i12);
                        } else {
                            uvVar.m(this.E1);
                        }
                    }
                    this.S0 = false;
                    this.E0.h1(0, 0);
                }
            } else if (i10 == 2) {
                L(false, false);
                Q(false, false);
                if (wvVar.getCurrentItem() != 1) {
                    wvVar.x(1, false);
                }
                ow owVar = this.f34437p0;
                if (owVar != null) {
                    owVar.m(0);
                }
                nv nvVar = this.f34434o0;
                if (nvVar != null && (txVar = nvVar.f38771r) != null) {
                    txVar.I1(null);
                }
            }
        } else {
            L(true, false);
            Q(false, false);
            if (wvVar.getCurrentItem() != 0) {
                wvVar.x(0, !z9);
            }
            if (z10) {
                org.telegram.messenger.g0.i3(new cv(this, 5), 350L);
            }
        }
        M(true);
    }

    public final void D() {
        yx yxVar = this.f34469y0;
        if (yxVar != null) {
            yxVar.f();
        }
        cy cyVar = this.f34472z0;
        if (cyVar != null) {
            cyVar.f();
        }
        if (org.telegram.ui.ks.p().E) {
            org.telegram.ui.ks.p().m();
        }
        org.telegram.ui.ks.p().t();
    }

    public final void E(int i7) {
        ix ixVar = this.f34452t1;
        if ((ixVar != null && ixVar.z()) || i7 == 0) {
            return;
        }
        HorizontalScrollView y10 = y(i7);
        this.Q0[i7] = 0;
        y10.setTranslationY(0);
    }

    public final void G(int i7, int i10) {
        hw hwVar = this.Q;
        View m10 = hwVar.m(i7);
        int L0 = hwVar.L0();
        int i11 = 1;
        if ((m10 == null && Math.abs(i7 - L0) > hwVar.J * 9.0f) || !org.telegram.messenger.iz.c()) {
            if (hwVar.L0() < i7) {
                i11 = 0;
            }
            ri0 ri0Var = this.f34395b0;
            ri0Var.f37673b = i11;
            ri0Var.d(i7, i10, false, false);
            return;
        }
        this.J0 = true;
        fi.j1 j1Var = new fi.j1(1, this.P.getContext(), this);
        j1Var.f57213a = i7;
        j1Var.f20111p = i10;
        hwVar.w0(j1Var);
    }

    public final void H(int i7, int i10) {
        rv rvVar = this.E0;
        View m10 = rvVar.m(i7);
        int L0 = rvVar.L0();
        int i11 = 1;
        if (m10 == null && Math.abs(i7 - L0) > 40) {
            if (rvVar.L0() < i7) {
                i11 = 0;
            }
            ri0 ri0Var = this.f34391a0;
            ri0Var.f37673b = i11;
            ri0Var.d(i7, i10, false, false);
            return;
        }
        this.J0 = true;
        this.D0.y0(i7);
    }

    public final void I(boolean z9, boolean z10, boolean z11, boolean z12) {
        ArrayList arrayList = this.f34404e;
        arrayList.clear();
        boolean z13 = false;
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.d;
            if (i7 >= arrayList2.size()) {
                break;
            }
            if (((dy) arrayList2.get(i7)).f33110a == 0 && z9) {
                arrayList.add((dy) arrayList2.get(i7));
            }
            if (((dy) arrayList2.get(i7)).f33110a == 1 && z11) {
                arrayList.add((dy) arrayList2.get(i7));
            }
            if (((dy) arrayList2.get(i7)).f33110a == 2 && z10) {
                arrayList.add((dy) arrayList2.get(i7));
            }
            i7++;
        }
        qb0 qb0Var = this.f34464x;
        if (qb0Var != null) {
            if (arrayList.size() > 1) {
                z13 = true;
            }
            org.telegram.messenger.g0.Z3(qb0Var, z13, 1.0f, true, z12);
        }
        wv wvVar = this.h;
        if (wvVar != null) {
            wvVar.setAdapter(null);
            wvVar.setAdapter(this.L0);
            if (qb0Var != null) {
                qb0Var.setViewPager(wvVar);
            }
        }
    }

    public final void J(final ph.a aVar, final TLObject tLObject, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final boolean z9, boolean z10) {
        String G;
        cy cyVar;
        hx hxVar;
        if (stickerSet != null) {
            if (!z9 || (hxVar = this.S) == null || hxVar.d == stickerSet.f26983id) {
                if (!z9 && (cyVar = this.f34472z0) != null && cyVar.d != stickerSet.f26983id) {
                    return;
                }
                final boolean B0 = org.telegram.messenger.ui.b0(this.f34400c1).B0(stickerSet.f26983id, true);
                if (B0) {
                    if (stickerSet.masks) {
                        G = org.telegram.messenger.id.G(stickerSet.count, "RemoveManyMasksCount", new Object[0]);
                    } else if (stickerSet.emojis) {
                        G = org.telegram.messenger.id.G(stickerSet.count, "RemoveManyEmojiCount", new Object[0]);
                    } else {
                        G = org.telegram.messenger.id.G(stickerSet.count, "RemoveManyStickersCount", new Object[0]);
                    }
                } else if (stickerSet.masks) {
                    G = org.telegram.messenger.id.G(stickerSet.count, "AddManyMasksCount", new Object[0]);
                } else if (stickerSet.emojis) {
                    G = org.telegram.messenger.id.G(stickerSet.count, "AddManyEmojiCount", new Object[0]);
                } else {
                    G = org.telegram.messenger.id.G(stickerSet.count, "AddManyStickersCount", new Object[0]);
                }
                aVar.i(G, z10, true);
                aVar.f53635k0.a(!B0, z10);
                aVar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        int i7;
                        hy hyVar = hy.this;
                        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(hyVar.f34400c1);
                        Context context = hyVar.getContext();
                        if (B0) {
                            i7 = 0;
                        } else {
                            i7 = 2;
                        }
                        int i10 = i7;
                        org.telegram.ui.ActionBar.f2 f2Var = hyVar.Y1;
                        FrameLayout frameLayout = hyVar.f34447s;
                        ph.a aVar2 = aVar;
                        TLObject tLObject2 = tLObject;
                        TLRPC.StickerSet stickerSet2 = stickerSet;
                        TLRPC.Document document2 = document;
                        boolean z11 = z9;
                        b02.g2(context, tLObject2, document2, i10, f2Var, frameLayout, false, true, new bi.l4(hyVar, aVar2, tLObject2, stickerSet2, document2, z11), false);
                        hyVar.J(aVar2, tLObject2, stickerSet2, document2, z11, true);
                    }
                });
            }
        }
    }

    public final void K(long j3, boolean z9, boolean z10) {
        int i7;
        View childAt;
        float f10;
        qb0 qb0Var = this.f34464x;
        if (qb0Var != null) {
            this.f34458v1 = z9;
            this.f34462w1 = z10;
            if (!z10 && !z9) {
                this.f34455u1 = 0L;
            } else {
                this.f34455u1 = j3;
            }
            if (z10) {
                i7 = 2;
            } else {
                i7 = 0;
            }
            LinearLayout linearLayout = qb0Var.d;
            if (i7 >= linearLayout.getChildCount()) {
                childAt = null;
            } else {
                childAt = linearLayout.getChildAt(i7);
            }
            if (childAt != null) {
                if (this.f34455u1 != 0) {
                    f10 = 0.15f;
                } else {
                    f10 = 1.0f;
                }
                childAt.setAlpha(f10);
                wv wvVar = this.h;
                if (z10) {
                    if (this.f34455u1 != 0 && wvVar.getCurrentItem() != 0) {
                        L(true, true);
                        Q(false, true);
                        wvVar.x(0, false);
                    }
                } else if (this.f34455u1 != 0 && wvVar.getCurrentItem() != 1) {
                    L(false, true);
                    Q(false, true);
                    wvVar.x(1, false);
                }
            }
        }
    }

    public final void L(boolean z9, boolean z10) {
        float f10;
        float f11;
        float f12;
        float f13;
        xv xvVar = this.f34468y;
        if (!z9 || xvVar.getTag() != null) {
            if ((!z9 && xvVar.getTag() != null) || this.f34436o2) {
                return;
            }
            AnimatorSet animatorSet = this.F;
            Integer num = null;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.F = null;
            }
            if (!z9) {
                num = 1;
            }
            xvVar.setTag(num);
            int i7 = 0;
            float f14 = 0.0f;
            if (z10) {
                if (z9) {
                    xvVar.setVisibility(0);
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.F = animatorSet2;
                if (z9) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(xvVar, View.ALPHA, f12);
                if (z9) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(xvVar, View.SCALE_X, f13);
                if (z9) {
                    f14 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(xvVar, View.SCALE_Y, f14));
                this.F.setDuration(200L);
                this.F.setInterpolator(xq.f40367g);
                this.F.addListener(new dw(this, z9, 0));
                this.F.start();
                return;
            }
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            xvVar.setAlpha(f10);
            if (z9) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            xvVar.setScaleX(f11);
            if (z9) {
                f14 = 1.0f;
            }
            xvVar.setScaleY(f14);
            if (!z9) {
                i7 = 4;
            }
            xvVar.setVisibility(i7);
        }
    }

    public final void M(boolean z9) {
        Integer num;
        this.H = 0.0f;
        ix ixVar = this.f34452t1;
        if (ixVar != null && ixVar.z()) {
            z9 = false;
        }
        FrameLayout frameLayout = this.f34431n;
        if (!z9 || frameLayout.getTag() != null) {
            if (!z9 && frameLayout.getTag() != null) {
                return;
            }
            if (z9) {
                num = null;
            } else {
                num = 1;
            }
            frameLayout.setTag(num);
            this.E2.a(z9, true);
        }
    }

    public final void N(boolean z9, boolean z10) {
        View view = this.O;
        if (!z9 || view.getTag() != null) {
            if (!z9 && view.getTag() != null) {
                return;
            }
            AnimatorSet animatorSet = this.W;
            Integer num = null;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.W = null;
            }
            if (!z9) {
                num = 1;
            }
            view.setTag(num);
            float f10 = 0.0f;
            if (z10) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.W = animatorSet2;
                if (z9) {
                    f10 = 1.0f;
                }
                animatorSet2.playTogether(ObjectAnimator.ofFloat(view, View.ALPHA, f10));
                this.W.setDuration(200L);
                this.W.setInterpolator(xq.f40367g);
                this.W.addListener(new z5(this, 24));
                this.W.start();
                return;
            }
            if (z9) {
                f10 = 1.0f;
            }
            view.setAlpha(f10);
        }
    }

    public final void O(boolean z9) {
        for (int i7 = 0; i7 < 3; i7++) {
            v4.s w10 = w(i7);
            int L0 = w10.L0();
            if (z9) {
                if (L0 == 1 || L0 == 2) {
                    w10.n0(0);
                    E(i7);
                }
            } else if (L0 == 0) {
                w10.h1(0, 0);
            }
        }
    }

    public final void P(boolean z9, boolean z10, boolean z11) {
        float f10;
        float translationY;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.Chat M0 = org.telegram.messenger.qp.s1(this.f34400c1).M0(Long.valueOf(this.f34455u1));
        if (M0 != null) {
            bi.md mdVar = this.N0;
            if (z9) {
                if (!org.telegram.messenger.t3.N(M0) && (tL_chatBannedRights = M0.default_banned_rights) != null && (tL_chatBannedRights.send_stickers || (z10 && tL_chatBannedRights.send_plain))) {
                    org.telegram.ui.ActionBar.f2 f2Var = this.Y1;
                    if (!(f2Var instanceof org.telegram.ui.an) || !((org.telegram.ui.an) f2Var).Y6()) {
                        if (z10) {
                            mdVar.setText(org.telegram.messenger.id.M0(2131749547, null));
                        } else if (z11) {
                            mdVar.setText(org.telegram.messenger.id.M0(2131749546, null));
                        } else {
                            mdVar.setText(org.telegram.messenger.id.M0(2131749540, null));
                        }
                    } else {
                        return;
                    }
                } else {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights2 = M0.banned_rights;
                    if (tL_chatBannedRights2 == null) {
                        return;
                    }
                    if (org.telegram.messenger.g0.D1(tL_chatBannedRights2)) {
                        if (z10) {
                            mdVar.setText(org.telegram.messenger.id.M0(2131753943, null));
                        } else if (z11) {
                            mdVar.setText(org.telegram.messenger.id.M0(2131753969, null));
                        } else {
                            mdVar.setText(org.telegram.messenger.id.M0(2131753934, null));
                        }
                    } else {
                        if (z10) {
                            mdVar.setText(org.telegram.messenger.id.a0("AttachPlainRestricted", null, 2131753944, org.telegram.messenger.id.v(M0.banned_rights.until_date)));
                        }
                        if (z11) {
                            mdVar.setText(org.telegram.messenger.id.a0("AttachGifRestricted", null, 2131753970, org.telegram.messenger.id.v(M0.banned_rights.until_date)));
                        } else {
                            mdVar.setText(org.telegram.messenger.id.a0("AttachStickersRestricted", null, 2131753935, org.telegram.messenger.id.v(M0.banned_rights.until_date)));
                        }
                    }
                }
                mdVar.setVisibility(0);
            }
            AnimatorSet animatorSet = this.P2;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.P2 = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.P2 = animatorSet2;
            float f11 = 1.0f;
            if (z9) {
                f10 = mdVar.getAlpha();
            } else {
                f10 = 1.0f;
            }
            float f12 = 0.0f;
            if (!z9) {
                f11 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(mdVar, View.ALPHA, f10, f11);
            if (z9) {
                translationY = org.telegram.messenger.g0.L(12.0f);
            } else {
                translationY = mdVar.getTranslationY();
            }
            if (!z9) {
                f12 = org.telegram.messenger.g0.L(12.0f);
            }
            animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(mdVar, View.TRANSLATION_Y, translationY, f12));
            h2.n0 n0Var = this.Q2;
            if (n0Var != null) {
                org.telegram.messenger.g0.r(n0Var);
            }
            if (z9) {
                h2.n0 n0Var2 = new h2.n0(this, z10, z11, 4);
                this.Q2 = n0Var2;
                org.telegram.messenger.g0.i3(n0Var2, 3500L);
            }
            this.P2.setDuration(320L);
            this.P2.setInterpolator(xq.h);
            this.P2.start();
        }
    }

    public final void Q(boolean z9, boolean z10) {
        float f10;
        float f11;
        float f12;
        float f13;
        ImageView imageView = this.D;
        if (imageView != null && !this.f34439p2) {
            if (!z9 || imageView.getTag() != null) {
                if (z9 || imageView.getTag() == null) {
                    AnimatorSet animatorSet = this.G;
                    Integer num = null;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.G = null;
                    }
                    if (!z9) {
                        num = 1;
                    }
                    imageView.setTag(num);
                    int i7 = 0;
                    float f14 = 0.0f;
                    if (z10) {
                        if (z9) {
                            imageView.setVisibility(0);
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.G = animatorSet2;
                        if (z9) {
                            f12 = 1.0f;
                        } else {
                            f12 = 0.0f;
                        }
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, View.ALPHA, f12);
                        if (z9) {
                            f13 = 1.0f;
                        } else {
                            f13 = 0.0f;
                        }
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView, View.SCALE_X, f13);
                        if (z9) {
                            f14 = 1.0f;
                        }
                        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(imageView, View.SCALE_Y, f14));
                        this.G.setDuration(200L);
                        this.G.setInterpolator(xq.f40367g);
                        this.G.addListener(new dw(this, z9, 1));
                        this.G.start();
                        return;
                    }
                    if (z9) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    imageView.setAlpha(f10);
                    if (z9) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    imageView.setScaleX(f11);
                    if (z9) {
                        f14 = 1.0f;
                    }
                    imageView.setScaleY(f14);
                    if (!z9) {
                        i7 = 4;
                    }
                    imageView.setVisibility(i7);
                }
            }
        }
    }

    public final void R() {
        int measuredHeight;
        int L;
        org.telegram.ui.ActionBar.f2 f2Var;
        View view = (View) getParent();
        if (view != null) {
            float y10 = getY();
            if (getLayoutParams().height > 0) {
                measuredHeight = getLayoutParams().height;
            } else {
                measuredHeight = getMeasuredHeight();
            }
            float f10 = y10 + measuredHeight;
            if ((!org.telegram.messenger.g0.E && ((f2Var = this.Y1) == null || !f2Var.isInBubbleMode())) || this.V0) {
                L = view.getHeight();
            } else {
                L = org.telegram.messenger.g0.L(1.0f);
            }
            float f11 = f10 - L;
            int i7 = (this.f34446r2 > 0.0f ? 1 : (this.f34446r2 == 0.0f ? 0 : -1));
            FrameLayout frameLayout = this.f34431n;
            if (i7 >= 0) {
                f11 += getMeasuredHeight() - this.f34446r2;
            } else if (frameLayout.getTop() - f11 < 0.0f || !this.f34467x2) {
                f11 = 0.0f;
            }
            float W1 = (-f11) + org.telegram.messenger.g0.W1(this.E2.f55487e, org.telegram.messenger.g0.L(50.0f), -this.f34442q2);
            frameLayout.setTranslationY(W1);
            if (this.f34402d0) {
                this.f34443r.setTranslationY(W1);
            }
        }
    }

    public final void S() {
        ux uxVar;
        boolean z9;
        int z10;
        boolean z11;
        int z12;
        int z13;
        int z14;
        int z15;
        int z16;
        int z17;
        int z18;
        int z19;
        xu xuVar;
        int z20;
        int z21;
        int z22;
        int z23;
        int z24;
        int z25;
        boolean z26 = this.f34454u0;
        View view = this.f34460w;
        if (!z26) {
            setBackground(null);
            view.setBackground(null);
        } else if (!org.telegram.messenger.g0.E && !this.N1) {
            int i7 = org.telegram.ui.ActionBar.k6.f28214wf;
            setBackgroundColor(z(i7));
            if (this.f34402d0) {
                view.setBackgroundColor(z(i7));
            }
        } else {
            Drawable background = getBackground();
            int z27 = z(org.telegram.ui.ActionBar.k6.f28214wf);
            if (background != null && (background != this.G2 || z27 != this.H2)) {
                this.G2 = background;
                this.H2 = z27;
                background.setColorFilter(new PorterDuffColorFilter(z27, PorterDuff.Mode.MULTIPLY));
            }
        }
        lw lwVar = this.I;
        if (lwVar != null) {
            if (this.f34454u0) {
                lwVar.setBackgroundColor(z(org.telegram.ui.ActionBar.k6.f28214wf));
                this.O.setBackgroundColor(z(org.telegram.ui.ActionBar.k6.f28270zf));
            } else {
                lwVar.setBackground(null);
            }
        }
        yt ytVar = this.B1;
        if (ytVar != null) {
            ytVar.f40747c.a();
        }
        int i10 = 0;
        while (true) {
            uxVar = this.V;
            z9 = this.f34420i2;
            if (i10 >= 3) {
                break;
            }
            if (i10 == 0) {
                uxVar = this.G0;
            } else if (i10 != 1) {
                uxVar = this.f34434o0;
            }
            if (uxVar != null) {
                rp rpVar = uxVar.d;
                FrameLayout frameLayout = uxVar.f38770n;
                View view2 = uxVar.f38769f;
                if (this.f34454u0) {
                    view2.setBackgroundColor(z(org.telegram.ui.ActionBar.k6.f28214wf));
                } else {
                    view2.setBackground(null);
                }
                uxVar.f38768e.setBackgroundColor(z(org.telegram.ui.ActionBar.k6.f28270zf));
                fl0 fl0Var = uxVar.f38767c;
                if (z9) {
                    z22 = v(0.4f);
                } else {
                    z22 = z(org.telegram.ui.ActionBar.k6.f28252yf);
                }
                fl0Var.a(z22);
                Drawable background2 = frameLayout.getBackground();
                if (z9) {
                    z23 = v(0.06f);
                } else {
                    z23 = z(org.telegram.ui.ActionBar.k6.f28233xf);
                }
                org.telegram.ui.ActionBar.k6.C1(z23, background2);
                frameLayout.invalidate();
                if (z9) {
                    z24 = v(0.45f);
                } else {
                    z24 = z(org.telegram.ui.ActionBar.k6.f28252yf);
                }
                rpVar.setHintTextColor(z24);
                if (z9) {
                    z25 = v(0.8f);
                } else {
                    z25 = z(org.telegram.ui.ActionBar.k6.G6);
                }
                rpVar.setTextColor(z25);
            }
            i10++;
        }
        Paint paint = this.f34449s1;
        if (paint != null) {
            paint.setColor(z(org.telegram.ui.ActionBar.k6.Pf));
        }
        tw twVar = this.P;
        if (twVar != null) {
            twVar.setGlowColor(z(org.telegram.ui.ActionBar.k6.f28214wf));
        }
        qv qvVar = this.D0;
        if (qvVar != null) {
            qvVar.setGlowColor(z(org.telegram.ui.ActionBar.k6.f28214wf));
        }
        uv uvVar = this.B0;
        if (uvVar != null) {
            uvVar.setIndicatorColor(z(org.telegram.ui.ActionBar.k6.Ff));
            uvVar.setUnderlineColor(z(org.telegram.ui.ActionBar.k6.f28270zf));
            if (this.f34454u0) {
                uvVar.setBackgroundColor(z(org.telegram.ui.ActionBar.k6.f28214wf));
            } else {
                uvVar.setBackground(null);
            }
        }
        ow owVar = this.f34437p0;
        if (owVar != null) {
            owVar.setIndicatorColor(z(org.telegram.ui.ActionBar.k6.Ff));
            owVar.setUnderlineColor(z(org.telegram.ui.ActionBar.k6.f28270zf));
            if (this.f34454u0) {
                owVar.setBackgroundColor(z(org.telegram.ui.ActionBar.k6.f28214wf));
            } else {
                owVar.setBackground(null);
            }
        }
        if (z9) {
            z10 = v(0.6f);
        } else {
            z10 = z(org.telegram.ui.ActionBar.k6.Gf);
        }
        if (z10 != this.I2) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.I2 = z10;
        xv xvVar = this.f34468y;
        if (xvVar != null) {
            if (z11) {
                xvVar.setColorFilter(new PorterDuffColorFilter(z10, PorterDuff.Mode.MULTIPLY));
            }
            if (uxVar == null) {
                Drawable background3 = xvVar.getBackground();
                int i11 = org.telegram.ui.ActionBar.k6.f28214wf;
                org.telegram.ui.ActionBar.k6.H1(background3, z(i11), false);
                org.telegram.ui.ActionBar.k6.H1(xvVar.getBackground(), z(i11), true);
            }
        }
        ImageView imageView = this.D;
        if (imageView != null && z11) {
            imageView.setColorFilter(new PorterDuffColorFilter(z10, PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.E;
        if (imageView2 != null && z11) {
            imageView2.setColorFilter(new PorterDuffColorFilter(z10, PorterDuff.Mode.MULTIPLY));
        }
        bi.md mdVar = this.N0;
        if (mdVar != null) {
            if (mdVar.getBackground() instanceof ShapeDrawable) {
                ((ShapeDrawable) mdVar.getBackground()).getPaint().setColor(z(org.telegram.ui.ActionBar.k6.f27880eg));
                mdVar.invalidate();
            }
            mdVar.setTextColor(z(org.telegram.ui.ActionBar.k6.f27861dg));
        }
        mx mxVar = this.f34421j0;
        if (mxVar != null) {
            ox oxVar = mxVar.f36126e;
            int i12 = org.telegram.ui.ActionBar.k6.Af;
            int z28 = z(i12);
            if (z28 != this.J2) {
                this.J2 = z28;
                oxVar.f36722a.setColorFilter(new PorterDuffColorFilter(z28, PorterDuff.Mode.MULTIPLY));
            }
            oxVar.f36723b.setTextColor(z(i12));
            oxVar.f36724c.setProgressColor(z(org.telegram.ui.ActionBar.k6.f27926h6));
        }
        int z29 = z(org.telegram.ui.ActionBar.k6.Ci);
        if (this.f34407e2 == null || z29 != this.K2) {
            this.K2 = z29;
            this.f34407e2 = new PorterDuffColorFilter(z29, PorterDuff.Mode.SRC_IN);
        }
        int i13 = 0;
        while (true) {
            Drawable[] drawableArr = this.X0;
            if (i13 >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i13];
            if (z9) {
                z20 = v(0.4f);
            } else {
                z20 = z(org.telegram.ui.ActionBar.k6.Cf);
            }
            org.telegram.ui.ActionBar.k6.E1(drawable, z20, false);
            Drawable drawable2 = drawableArr[i13];
            if (z9) {
                z21 = v(0.8f);
            } else {
                z21 = z(org.telegram.ui.ActionBar.k6.Df);
            }
            org.telegram.ui.ActionBar.k6.E1(drawable2, z21, true);
            i13++;
        }
        if (lwVar != null && (xuVar = lwVar.D) != null) {
            xuVar.d();
        }
        int i14 = 0;
        while (true) {
            Drawable[] drawableArr2 = this.Y0;
            if (i14 >= drawableArr2.length) {
                break;
            }
            Drawable drawable3 = drawableArr2[i14];
            if (z9) {
                z18 = v(0.4f);
            } else {
                z18 = z(org.telegram.ui.ActionBar.k6.Bf);
            }
            org.telegram.ui.ActionBar.k6.E1(drawable3, z18, false);
            Drawable drawable4 = drawableArr2[i14];
            if (z9) {
                z19 = v(0.8f);
            } else {
                z19 = z(org.telegram.ui.ActionBar.k6.Df);
            }
            org.telegram.ui.ActionBar.k6.E1(drawable4, z19, true);
            i14++;
        }
        int i15 = 0;
        while (true) {
            Drawable[] drawableArr3 = this.Z0;
            if (i15 >= drawableArr3.length) {
                break;
            }
            Drawable drawable5 = drawableArr3[i15];
            if (z9) {
                z16 = v(0.4f);
            } else {
                z16 = z(org.telegram.ui.ActionBar.k6.Bf);
            }
            org.telegram.ui.ActionBar.k6.E1(drawable5, z16, false);
            Drawable drawable6 = drawableArr3[i15];
            if (z9) {
                z17 = v(0.8f);
            } else {
                z17 = z(org.telegram.ui.ActionBar.k6.Df);
            }
            org.telegram.ui.ActionBar.k6.E1(drawable6, z17, true);
            i15++;
        }
        org.telegram.ui.ActionBar.u5 u5Var = this.f34393a2;
        if (u5Var != null) {
            if (z9) {
                z14 = v(0.4f);
            } else {
                z14 = z(org.telegram.ui.ActionBar.k6.Cf);
            }
            org.telegram.ui.ActionBar.k6.E1(u5Var, z14, false);
            if (z9) {
                z15 = v(0.8f);
            } else {
                z15 = z(org.telegram.ui.ActionBar.k6.Df);
            }
            org.telegram.ui.ActionBar.k6.E1(u5Var, z15, true);
        }
        org.telegram.ui.ActionBar.u5 u5Var2 = this.f34397b2;
        if (u5Var2 != null) {
            if (z9) {
                z12 = v(0.4f);
            } else {
                z12 = z(org.telegram.ui.ActionBar.k6.Ff);
            }
            org.telegram.ui.ActionBar.k6.E1(u5Var2, z12, false);
            if (z9) {
                z13 = v(0.8f);
            } else {
                z13 = z(org.telegram.ui.ActionBar.k6.Ff);
            }
            org.telegram.ui.ActionBar.k6.E1(u5Var2, z13, true);
        }
    }

    public final void T() {
        tw twVar = this.P;
        if (twVar != null) {
            for (int i7 = 0; i7 < twVar.getChildCount(); i7++) {
                View childAt = twVar.getChildAt(i7);
                if (childAt instanceof yw) {
                    ((yw) childAt).a(true);
                }
            }
        }
    }

    public final void U(int i7) {
        int i10;
        if (!this.f34409f0) {
            int i11 = -1;
            if (i7 != -1) {
                int size = getRecentEmoji().size() + (this.f34402d0 ? 1 : 0);
                qw qwVar = this.R;
                int i12 = qwVar.f37427c;
                ArrayList arrayList = qwVar.f37435y;
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
                        String[][] strArr = org.telegram.messenger.j6.f23505f;
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
                        ArrayList<uw> emojipacks = getEmojipacks();
                        int size2 = arrayList.size() - 1;
                        while (true) {
                            if (size2 < 0) {
                                break;
                            } else if (((Integer) arrayList.get(size2)).intValue() <= i7) {
                                uw uwVar = (uw) this.f34441q1.get(size2);
                                while (i13 < emojipacks.size()) {
                                    long j3 = emojipacks.get(i13).f38747b.f26983id;
                                    long j10 = uwVar.f38747b.f26983id;
                                    if (j3 == j10 && (!uwVar.f38751g || (!uwVar.f38750f && !this.f34438p1.contains(Long.valueOf(j10))))) {
                                        char[] cArr = org.telegram.messenger.j6.f23501a;
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
                    this.I.j(i13, true);
                }
            }
        }
    }

    public final void V() {
        boolean z9;
        boolean z10;
        int i7;
        tx txVar;
        int i10;
        boolean z11;
        boolean z12;
        ow owVar = this.f34437p0;
        int currentPosition = owVar.getCurrentPosition();
        int i11 = this.f34444r0;
        if (currentPosition == i11) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (i11 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean isEmpty = this.f34419i1.isEmpty();
        owVar.d(false);
        this.f34444r0 = -2;
        this.f34448s0 = -2;
        this.f34451t0 = -2;
        Drawable[] drawableArr = this.Z0;
        if (!isEmpty) {
            this.f34444r0 = 0;
            owVar.b(0, drawableArr[0]).setContentDescription(org.telegram.messenger.id.M0(2131746365, null));
            i7 = 1;
        } else {
            i7 = 0;
        }
        this.f34448s0 = i7;
        owVar.b(1, drawableArr[1]).setContentDescription(org.telegram.messenger.id.M0(2131750835, null));
        this.f34451t0 = i7 + 1;
        org.telegram.messenger.g0.L(13.0f);
        org.telegram.messenger.g0.L(11.0f);
        int i12 = this.f34400c1;
        ArrayList arrayList = org.telegram.messenger.qp.s1(i12).f24743b4;
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            String str = (String) arrayList.get(i13);
            org.telegram.messenger.e6 g10 = org.telegram.messenger.i6.g(str);
            if (g10 != null) {
                TLRPC.Document T = org.telegram.messenger.ui.b0(i12).T(str);
                String j3 = jg.g.j(i13 + 3, "tab");
                int i14 = owVar.f37721y;
                owVar.f37721y = i14 + 1;
                fv0 fv0Var = (fv0) owVar.f37710n.get(j3);
                if (fv0Var != null) {
                    owVar.g(j3, fv0Var, i14);
                    i10 = currentPosition;
                    z11 = z10;
                } else {
                    i10 = currentPosition;
                    z11 = z10;
                    fv0Var = new fv0(owVar.getContext(), 2);
                    fv0Var.setFocusable(true);
                    fv0Var.setOnClickListener(new kk0(owVar, 2));
                    fv0Var.setExpanded(owVar.f37703f0);
                    fv0Var.a(owVar.f37706i0);
                    owVar.f37700e.addView(fv0Var, i14);
                }
                fv0Var.d = false;
                fv0Var.setTag(2131296461, Integer.valueOf(i14));
                fv0Var.setTag(2131296591, g10);
                fv0Var.setTag(2131296585, T);
                if (i14 == owVar.D) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                fv0Var.setSelected(z12);
                owVar.h.put(j3, fv0Var);
                fv0Var.setContentDescription(str);
            } else {
                i10 = currentPosition;
                z11 = z10;
            }
            i13++;
            currentPosition = i10;
            z10 = z11;
        }
        int i15 = currentPosition;
        boolean z13 = z10;
        owVar.h();
        owVar.q();
        if (z9 && isEmpty) {
            owVar.m(this.f34448s0);
            nv nvVar = this.f34434o0;
            if (nvVar != null && (txVar = nvVar.f38771r) != null) {
                txVar.I1(null);
                return;
            }
            return;
        }
        WeakHashMap weakHashMap = r0.i0.f54191a;
        if (owVar.isLaidOut()) {
            if (!isEmpty && !z13) {
                owVar.k(i15 + 1, 0);
            } else if (isEmpty && z13) {
                owVar.k(i15 - 1, 0);
            }
        }
    }

    public final void W() {
        mx mxVar;
        int size = this.f34419i1.size();
        long n10 = org.telegram.messenger.ui.n(Integer.MAX_VALUE, this.f34419i1);
        ArrayList arrayList = new ArrayList(org.telegram.messenger.ui.b0(this.f34400c1).f25820i0);
        this.f34419i1 = arrayList;
        long n11 = org.telegram.messenger.ui.n(Integer.MAX_VALUE, arrayList);
        if ((this.f34437p0 != null && size == 0 && !this.f34419i1.isEmpty()) || (size != 0 && this.f34419i1.isEmpty())) {
            V();
        }
        if ((size != this.f34419i1.size() || n10 != n11) && (mxVar = this.f34432n0) != null) {
            mxVar.f();
        }
    }

    public final void X(boolean z9) {
        boolean z10;
        TLRPC.Document document;
        boolean z11;
        int i7;
        boolean z12;
        org.telegram.ui.ActionBar.f6 f6Var;
        boolean z13;
        boolean z14;
        ArrayList<TLRPC.Document> arrayList;
        boolean z15;
        ArrayList<TLRPC.Document> arrayList2;
        TLRPC.StickerSet stickerSet;
        int i10;
        uv uvVar = this.B0;
        if (uvVar != null) {
            org.telegram.ui.c61 c61Var = uvVar.f37700e;
            if (uvVar.f37717s != null) {
                return;
            }
            this.F1 = -2;
            this.G1 = -2;
            this.H1 = -2;
            this.I1 = -2;
            int i11 = 0;
            this.f34405e0 = false;
            this.E1 = 0;
            int currentPosition = uvVar.getCurrentPosition();
            if (getParent() != null && getVisibility() == 0 && (this.f34470y1.size() != 0 || this.f34473z1.size() != 0)) {
                z10 = true;
            } else {
                z10 = false;
            }
            uvVar.d(z10);
            int i12 = this.f34400c1;
            org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i12);
            SharedPreferences sharedPreferences = org.telegram.messenger.qp.s1(i12).f24784f7;
            ArrayList arrayList3 = this.f34429m1;
            arrayList3.clear();
            ArrayList arrayList4 = b02.f25840s0[0];
            int size = arrayList4.size();
            for (int i13 = 0; i13 < size; i13++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList4.get(i13);
                if (!b02.B0(stickerSetCovered.set.f26983id, true)) {
                    arrayList3.add(stickerSetCovered);
                }
            }
            fy fyVar = this.F0;
            if (fyVar != null) {
                fyVar.f();
            }
            boolean isEmpty = arrayList4.isEmpty();
            long j3 = 0;
            Drawable[] drawableArr = this.Y0;
            org.telegram.ui.ActionBar.f6 f6Var2 = null;
            if (!isEmpty && (arrayList3.isEmpty() || sharedPreferences.getLong("featured_hidden", 0L) == ((TLRPC.StickerSetCovered) arrayList4.get(0)).set.f26983id)) {
                if (b02.f25844u0[0].isEmpty()) {
                    i10 = 2;
                } else {
                    i10 = 3;
                }
                fv0 c10 = uvVar.c(i10, drawableArr[i10]);
                c10.h.setText(org.telegram.messenger.id.M0(2131750832, null));
                c10.setContentDescription(org.telegram.messenger.id.M0(2131750834, null));
                int i14 = this.E1;
                this.H1 = i14;
                this.E1 = i14 + 1;
            }
            if (!this.f34425k1.isEmpty()) {
                int i15 = this.E1;
                this.G1 = i15;
                this.E1 = i15 + 1;
                fv0 c11 = uvVar.c(1, drawableArr[1]);
                c11.h.setText(org.telegram.messenger.id.M0(2131750839, null));
                c11.setContentDescription(org.telegram.messenger.id.M0(2131750842, null));
            }
            if (!this.f34422j1.isEmpty()) {
                int i16 = this.E1;
                this.F1 = i16;
                this.E1 = i16 + 1;
                fv0 c12 = uvVar.c(0, drawableArr[0]);
                c12.h.setText(org.telegram.messenger.id.M0(2131746364, null));
                c12.setContentDescription(org.telegram.messenger.id.M0(2131746365, null));
            }
            ArrayList arrayList5 = this.f34403d1;
            arrayList5.clear();
            this.f34416h1 = null;
            this.f34410f1 = -1;
            this.f34406e1 = -10;
            if (this.F2 == null || z9) {
                this.F2 = new ArrayList(b02.s0(0));
            }
            ArrayList arrayList6 = this.F2;
            int i17 = 0;
            while (true) {
                TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.f34466x1;
                if (i17 >= stickerSetCoveredArr.length) {
                    break;
                }
                TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCoveredArr[i17];
                long j10 = j3;
                if (stickerSetCovered2 != null) {
                    TLRPC.TL_messages_stickerSet o02 = b02.o0(stickerSetCovered2.set.f26983id);
                    if (o02 != null && (stickerSet = o02.set) != null && !stickerSet.archived) {
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
            ArrayList w02 = org.telegram.messenger.qp.s1(i12).w0(arrayList6);
            for (int i18 = 0; i18 < w02.size(); i18++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) w02.get(i18);
                TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet2.set;
                if ((stickerSet2 == null || !stickerSet2.archived) && (arrayList2 = tL_messages_stickerSet2.documents) != null && !arrayList2.isEmpty()) {
                    arrayList5.add(tL_messages_stickerSet2);
                }
            }
            if (this.J1 != null) {
                long j12 = org.telegram.messenger.qp.s1(i12).f24784f7.getLong("group_hide_stickers_" + this.J1.f26957id, -1L);
                TLRPC.Chat M0 = org.telegram.messenger.qp.s1(i12).M0(Long.valueOf(this.J1.f26957id));
                if (M0 != null && this.J1.stickerset != null && org.telegram.messenger.t3.N(M0)) {
                    TLRPC.StickerSet stickerSet3 = this.J1.stickerset;
                    if (stickerSet3 != null) {
                        if (j12 == stickerSet3.f26983id) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        this.f34413g1 = z15;
                    }
                } else {
                    if (j12 != -1) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    this.f34413g1 = z14;
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
                        if (this.f34413g1) {
                            this.f34406e1 = arrayList5.size();
                            arrayList5.add(tL_messages_stickerSet3);
                        } else {
                            this.f34406e1 = 0;
                            arrayList5.add(0, tL_messages_stickerSet3);
                        }
                        if (!this.J1.can_set_stickers) {
                            tL_messages_stickerSet3 = null;
                        }
                        this.f34416h1 = tL_messages_stickerSet3;
                    }
                } else if (chatFull.can_set_stickers) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = new TLRPC.TL_messages_stickerSet();
                    if (this.f34413g1) {
                        this.f34406e1 = arrayList5.size();
                        arrayList5.add(tL_messages_stickerSet4);
                    } else {
                        this.f34406e1 = 0;
                        arrayList5.add(0, tL_messages_stickerSet4);
                    }
                }
            }
            int i19 = 0;
            while (i19 < arrayList5.size()) {
                if (i19 == this.f34406e1) {
                    TLRPC.Chat M02 = org.telegram.messenger.qp.s1(i12).M0(Long.valueOf(this.J1.f26957id));
                    if (M02 == null) {
                        arrayList5.remove(i11);
                        i19--;
                    } else {
                        this.f34405e0 = true;
                        String str = "chat" + M02.f26956id;
                        int i20 = uvVar.f37721y;
                        uvVar.f37721y = i20 + 1;
                        fv0 fv0Var = (fv0) uvVar.f37710n.get(str);
                        if (fv0Var != null) {
                            uvVar.g(str, fv0Var, i20);
                        } else {
                            fv0Var = new fv0(uvVar.getContext(), i11);
                            fv0Var.setFocusable(true);
                            fv0Var.setOnClickListener(new kk0(uvVar, i11));
                            c61Var.addView(fv0Var, i20);
                            fv0Var.f33657x = true;
                            w8 w8Var = new w8(f6Var2);
                            w8Var.u(org.telegram.messenger.g0.L(14.0f));
                            w8Var.q(M02);
                            int i21 = uvVar.f37693a;
                            l9 l9Var = fv0Var.f33651e;
                            l9Var.setLayerNum(i21);
                            l9Var.e(M02, w8Var);
                            l9Var.setAspectFit(true);
                            fv0Var.setExpanded(uvVar.f37703f0);
                            fv0Var.a(uvVar.f37706i0);
                            fv0Var.h.setText(M02.title);
                        }
                        fv0Var.d = true;
                        fv0Var.setTag(2131296461, Integer.valueOf(i20));
                        if (i20 == uvVar.D) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        fv0Var.setSelected(z13);
                        uvVar.h.put(str, fv0Var);
                    }
                    i7 = 0;
                    f6Var = null;
                } else {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet5 = (TLRPC.TL_messages_stickerSet) arrayList5.get(i19);
                    TLRPC.StickerSet stickerSet5 = tL_messages_stickerSet5.set;
                    if (stickerSet5 != null && stickerSet5.thumb_document_id != j11) {
                        for (int i22 = 0; i22 < tL_messages_stickerSet5.documents.size(); i22++) {
                            document = tL_messages_stickerSet5.documents.get(i22);
                            if (document != null && tL_messages_stickerSet5.set.thumb_document_id == document.f26962id) {
                                break;
                            }
                        }
                    }
                    document = null;
                    if (document == null) {
                        z11 = false;
                        document = tL_messages_stickerSet5.documents.get(0);
                    } else {
                        z11 = false;
                    }
                    Object w10 = org.telegram.messenger.w7.w(tL_messages_stickerSet5.set.thumbs, 90, z11, null, z11);
                    if (w10 == null || tL_messages_stickerSet5.set.gifs) {
                        w10 = document;
                    }
                    String str2 = "set" + tL_messages_stickerSet5.set.f26983id;
                    int i23 = uvVar.f37721y;
                    uvVar.f37721y = i23 + 1;
                    fv0 fv0Var2 = (fv0) uvVar.f37710n.get(str2);
                    if (fv0Var2 != null) {
                        uvVar.g(str2, fv0Var2, i23);
                    } else {
                        fv0Var2 = new fv0(uvVar.getContext(), 0);
                        fv0Var2.setFocusable(true);
                        fv0Var2.setOnClickListener(new kk0(uvVar, 1));
                        fv0Var2.setExpanded(uvVar.f37703f0);
                        fv0Var2.a(uvVar.f37706i0);
                        c61Var.addView(fv0Var2, i23);
                    }
                    fv0Var2.f33651e.setLayerNum(uvVar.f37693a);
                    i7 = 0;
                    fv0Var2.d = false;
                    fv0Var2.setTag(w10);
                    fv0Var2.setTag(2131296461, Integer.valueOf(i23));
                    fv0Var2.setTag(2131296591, tL_messages_stickerSet5);
                    fv0Var2.setTag(2131296585, document);
                    if (i23 == uvVar.D) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    fv0Var2.setSelected(z12);
                    uvVar.h.put(str2, fv0Var2);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(tL_messages_stickerSet5.set.title);
                    sb2.append(", ");
                    f6Var = null;
                    sb2.append(org.telegram.messenger.id.M0(2131754757, null));
                    fv0Var2.setContentDescription(sb2.toString());
                }
                i19++;
                i11 = i7;
                f6Var2 = f6Var;
            }
            uvVar.h();
            uvVar.q();
            if (currentPosition != 0) {
                uvVar.k(currentPosition, currentPosition);
            }
            o();
        }
    }

    @Override
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = 4;
        if (i7 == 0) {
            q(false);
            float f12 = 1.0f - this.f34390a.f55487e;
            tv tvVar = this.G0;
            tvVar.setAlpha(f12);
            if (f12 > 0.0f) {
                i12 = 0;
            } else {
                i12 = 4;
            }
            tvVar.setVisibility(i12);
            float f13 = 1.0f - f12;
            ph.c cVar2 = this.H0;
            cVar2.setAlpha(f13);
            cVar2.setTranslationY((-org.telegram.messenger.g0.L(15.0f)) * f12);
            int i15 = (f13 > 0.0f ? 1 : (f13 == 0.0f ? 0 : -1));
            if (i15 > 0) {
                i13 = 0;
            } else {
                i13 = 4;
            }
            cVar2.setVisibility(i13);
            pg.h hVar = this.M;
            hVar.setAlpha(f13);
            hVar.setTranslationY(org.telegram.messenger.g0.L(30.0f) * f12);
            if (i15 > 0) {
                i14 = 0;
            }
            hVar.setVisibility(i14);
            R();
            this.f34465x0.invalidate();
        } else if (i7 == 1) {
            l(false);
            float f14 = 1.0f - this.f34394b.f55487e;
            iv ivVar = this.V;
            ivVar.setAlpha(f14);
            if (f14 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            ivVar.setVisibility(i10);
            float f15 = 1.0f - f14;
            ph.c cVar3 = this.U;
            cVar3.setAlpha(f15);
            cVar3.setTranslationY((-org.telegram.messenger.g0.L(15.0f)) * f14);
            int i16 = (f15 > 0.0f ? 1 : (f15 == 0.0f ? 0 : -1));
            if (i16 > 0) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            cVar3.setVisibility(i11);
            pg.h hVar2 = this.K;
            hVar2.setAlpha(f15);
            hVar2.setTranslationY(org.telegram.messenger.g0.L(30.0f) * f14);
            if (i16 > 0) {
                i14 = 0;
            }
            hVar2.setVisibility(i14);
            R();
            this.J.invalidate();
        }
    }

    public final void Z() {
        boolean z9;
        int i7;
        vv vvVar = this.C0;
        uv uvVar = this.B0;
        if (uvVar != null && vvVar == null && this.f34452t1 != null) {
            uvVar.setTranslationY(this.f34452t1.p() * (-org.telegram.messenger.g0.L(50.0f)));
        }
        if (vvVar == null) {
            return;
        }
        if (getVisibility() == 0 && this.K0 && this.f34452t1.p() != 1.0f) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        vvVar.setVisibility(i7);
        if (z9) {
            Rect rect = this.f34471y2;
            rect.setEmpty();
            this.h.getChildVisibleRect(this.f34465x0, rect, null);
            float p10 = this.f34452t1.p() * org.telegram.messenger.g0.L(50.0f);
            int i10 = rect.left;
            if (i10 != 0 || p10 != 0.0f) {
                this.X1 = false;
            }
            vvVar.setTranslationX(i10);
            float translationY = (((getTranslationY() + getTop()) - vvVar.getTop()) - uvVar.getExpandedOffset()) - p10;
            if (vvVar.getTranslationY() != translationY) {
                vvVar.setTranslationY(translationY);
                vvVar.invalidate();
            }
        }
        if (this.X1 && z9 && this.P0) {
            uvVar.i(true, this.W1);
            return;
        }
        this.X1 = false;
        uvVar.i(false, this.W1);
    }

    public final void a0() {
        int i7;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        LongSparseArray longSparseArray = this.f34473z1;
        LongSparseArray longSparseArray2 = this.f34470y1;
        int i10 = this.f34400c1;
        qv qvVar = this.D0;
        if (qvVar != null) {
            try {
                int childCount = qvVar.getChildCount();
                int i11 = 0;
                int i12 = 0;
                while (i12 < childCount) {
                    View childAt = qvVar.getChildAt(i12);
                    if (!(childAt instanceof org.telegram.ui.Cells.u3) || ((xi0) qvVar.T(childAt)) == null) {
                        i7 = i12;
                    } else {
                        org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) childAt;
                        ArrayList arrayList = org.telegram.messenger.ui.b0(i10).f25844u0[i11];
                        TLRPC.StickerSetCovered stickerSet = u3Var.getStickerSet();
                        if (arrayList != null && arrayList.contains(Long.valueOf(stickerSet.set.f26983id))) {
                            z9 = true;
                        } else {
                            z9 = i11;
                        }
                        int i13 = i11;
                        while (true) {
                            TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.f34466x1;
                            if (i13 < stickerSetCoveredArr.length) {
                                TLRPC.StickerSetCovered stickerSetCovered = stickerSetCoveredArr[i13];
                                if (stickerSetCovered != null) {
                                    i7 = i12;
                                    if (stickerSetCovered.set.f26983id == stickerSet.set.f26983id) {
                                        z10 = true;
                                        break;
                                    }
                                } else {
                                    i7 = i12;
                                }
                                i13++;
                                i12 = i7;
                            } else {
                                i7 = i12;
                                z10 = false;
                                break;
                            }
                        }
                        u3Var.c(stickerSet, z9, true, 0, 0, z10);
                        if (z9) {
                            org.telegram.messenger.ui.b0(i10).e1(stickerSet.set.f26983id);
                        }
                        if (longSparseArray2.indexOfKey(stickerSet.set.f26983id) >= 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (longSparseArray.indexOfKey(stickerSet.set.f26983id) >= 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z11 || z12) {
                            if (z11 && u3Var.f30572r) {
                                longSparseArray2.remove(stickerSet.set.f26983id);
                                z11 = false;
                            } else if (z12 && !u3Var.f30572r) {
                                longSparseArray.remove(stickerSet.set.f26983id);
                            }
                        }
                        if (!z10 && z11) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        u3Var.b(z13, true);
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
        this.f34446r2 = f10;
        R();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        org.telegram.messenger.c20 c20Var;
        TLRPC.StickerSet stickerSet;
        int i11 = org.telegram.messenger.qs.f25104x0;
        qw qwVar = this.R;
        cv cvVar = this.R2;
        if (i7 == i11) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (this.f34469y0 != null) {
                    X(((Boolean) objArr[1]).booleanValue());
                    a0();
                    D();
                    o();
                }
            } else if (((Integer) objArr[0]).intValue() == 5) {
                if (((Boolean) objArr[1]).booleanValue()) {
                    org.telegram.messenger.g0.r(cvVar);
                    org.telegram.messenger.g0.i3(cvVar, 100L);
                    return;
                }
                qwVar.F(false);
            }
        } else if (i7 == org.telegram.messenger.qs.f25060q3) {
            long longValue = ((Long) objArr[0]).longValue();
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            TLRPC.ChatFull chatFull = this.J1;
            if (chatFull != null && chatFull.f26957id == longValue && booleanValue) {
                qwVar.F(true);
            }
        } else if (i7 == org.telegram.messenger.qs.X0) {
            boolean booleanValue2 = ((Boolean) objArr[0]).booleanValue();
            int intValue = ((Integer) objArr[1]).intValue();
            if (booleanValue2 || intValue == 0 || intValue == 2) {
                k(booleanValue2);
            }
        } else if (i7 == org.telegram.messenger.qs.f25118z0) {
            a0();
            qb0 qb0Var = this.f34464x;
            if (qb0Var != null) {
                int childCount = qb0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    qb0Var.getChildAt(i12).invalidate();
                }
            }
            X(false);
        } else if (i7 == org.telegram.messenger.qs.A0) {
            if (qwVar != null) {
                qwVar.F(false);
            }
        } else {
            int i13 = org.telegram.messenger.qs.B0;
            hx hxVar = this.S;
            if (i7 == i13) {
                Long l10 = (Long) objArr[0];
                long longValue2 = l10.longValue();
                if (objArr.length > 1) {
                    tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) objArr[1];
                } else {
                    tL_messages_stickerSet = null;
                }
                if (tL_messages_stickerSet != null) {
                    cy cyVar = this.f34472z0;
                    if (cyVar != null && cyVar.d == longValue2 && cyVar.f32721f.size() < tL_messages_stickerSet.documents.size()) {
                        cyVar.f32721f = tL_messages_stickerSet.documents;
                        cyVar.f();
                    }
                    if (hxVar != null && hxVar.d == longValue2 && hxVar.f34381f.size() < tL_messages_stickerSet.documents.size()) {
                        hxVar.f34381f = tL_messages_stickerSet.documents;
                        hxVar.f();
                    }
                }
                TLRPC.ChatFull chatFull2 = this.J1;
                if (chatFull2 != null && (stickerSet = chatFull2.stickerset) != null && stickerSet.f26983id == longValue2) {
                    X(false);
                }
                HashMap hashMap = this.f34445r1;
                if (hashMap.containsKey(l10) && objArr.length >= 2 && ((org.telegram.messenger.c20) hashMap.get(l10)) != null && tL_messages_stickerSet != null && (c20Var = (org.telegram.messenger.c20) hashMap.remove(l10)) != null) {
                    c20Var.a(tL_messages_stickerSet);
                }
                org.telegram.messenger.g0.r(cvVar);
                org.telegram.messenger.g0.i3(cvVar, 100L);
                return;
            }
            int i14 = org.telegram.messenger.qs.f25018i4;
            tw twVar = this.P;
            if (i7 == i14) {
                qv qvVar = this.D0;
                if (qvVar != null) {
                    int childCount2 = qvVar.getChildCount();
                    for (int i15 = 0; i15 < childCount2; i15++) {
                        View childAt = qvVar.getChildAt(i15);
                        if ((childAt instanceof org.telegram.ui.Cells.j8) || (childAt instanceof org.telegram.ui.Cells.z7)) {
                            childAt.invalidate();
                        }
                    }
                }
                if (twVar != null) {
                    twVar.invalidate();
                    int childCount3 = twVar.getChildCount();
                    for (int i16 = 0; i16 < childCount3; i16++) {
                        View childAt2 = twVar.getChildAt(i16);
                        if (childAt2 instanceof qx) {
                            childAt2.invalidate();
                        }
                    }
                }
                yt ytVar = this.B1;
                if (ytVar != null) {
                    ytVar.f40747c.invalidate();
                }
                ow owVar = this.f34437p0;
                if (owVar != null) {
                    org.telegram.ui.c61 c61Var = owVar.f37700e;
                    int childCount4 = c61Var.getChildCount();
                    for (int i17 = 0; i17 < childCount4; i17++) {
                        c61Var.getChildAt(i17).invalidate();
                    }
                }
            } else if (i7 == org.telegram.messenger.qs.L2) {
                if (twVar != null && this.f34402d0) {
                    if ((this.V.f38767c.f33584k == 2 || twVar.getAdapter() == hxVar) && !TextUtils.isEmpty(hxVar.f34385w)) {
                        hxVar.F(hxVar.f34385w, true);
                    }
                }
            } else if (i7 == org.telegram.messenger.qs.f25001f5) {
                if (qwVar != null) {
                    qwVar.F(false);
                }
                T();
                X(false);
            }
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        R();
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.h) {
            canvas.save();
            if (this.f34431n.getVisibility() != 8 && !this.f34454u0 && this.f34461w0) {
                canvas.drawColor(i0.a.o(-1, 25));
            }
            boolean drawChild = super.drawChild(canvas, view, j3);
            float R0 = org.telegram.messenger.g0.R0(this.f34442q2);
            if (R0 > 0.0f) {
                int r12 = org.telegram.ui.ActionBar.k6.r1(R0, z(org.telegram.ui.ActionBar.k6.f28214wf));
                int i7 = this.A2;
                GradientDrawable gradientDrawable = this.f34474z2;
                if (i7 != r12) {
                    gradientDrawable.setColors(new int[]{r12, org.telegram.ui.ActionBar.k6.r1(0.66f, r12), i0.a.o(r12, 0)});
                    this.A2 = r12;
                }
                gradientDrawable.setBounds(0, getMeasuredHeight() - this.f34442q2, getMeasuredWidth(), getMeasuredHeight());
                gradientDrawable.draw(canvas);
            }
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    public int getCurrentPage() {
        return this.A1;
    }

    public ArrayList<uw> getEmojipacks() {
        ArrayList<uw> arrayList = new ArrayList<>();
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.f34441q1;
            if (i7 < arrayList2.size()) {
                uw uwVar = (uw) arrayList2.get(i7);
                boolean z9 = uwVar.f38751g;
                ArrayList arrayList3 = this.f34438p1;
                if ((!z9 && (uwVar.f38750f || arrayList3.contains(Long.valueOf(uwVar.f38747b.f26983id)))) || (uwVar.f38751g && !uwVar.f38750f && !arrayList3.contains(Long.valueOf(uwVar.f38747b.f26983id)))) {
                    arrayList.add(uwVar);
                }
                i7++;
            } else {
                return arrayList;
            }
        }
    }

    public ArrayList<String> getRecentEmoji() {
        if (this.f34401c2) {
            return org.telegram.messenger.i6.f23058i;
        }
        if (this.B2 == null) {
            this.B2 = new ArrayList();
        }
        if (org.telegram.messenger.i6.f23058i.size() != this.C2) {
            this.B2.clear();
            int i7 = 0;
            while (true) {
                ArrayList arrayList = org.telegram.messenger.i6.f23058i;
                if (i7 >= arrayList.size()) {
                    break;
                }
                if (!((String) arrayList.get(i7)).startsWith("animated_")) {
                    this.B2.add((String) arrayList.get(i7));
                }
                i7++;
            }
            this.C2 = this.B2.size();
        }
        return this.B2;
    }

    public float getStickersExpandOffset() {
        uv uvVar = this.B0;
        if (uvVar == null) {
            return 0.0f;
        }
        return uvVar.getExpandedOffset();
    }

    public final void h(String str) {
        if (str != null) {
            if (str.startsWith("animated_") || org.telegram.messenger.i6.h(str)) {
                org.telegram.messenger.i6.a(str);
                int i7 = 0;
                if (getVisibility() != 0 || this.h.getCurrentItem() != 0) {
                    org.telegram.messenger.i6.s();
                    this.R.F(false);
                }
                org.telegram.messenger.i6.r();
                if (!this.f34401c2) {
                    ArrayList arrayList = this.B2;
                    if (arrayList == null) {
                        this.B2 = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    while (true) {
                        ArrayList arrayList2 = org.telegram.messenger.i6.f23058i;
                        if (i7 < arrayList2.size()) {
                            if (!((String) arrayList2.get(i7)).startsWith("animated_")) {
                                this.B2.add((String) arrayList2.get(i7));
                            }
                            i7++;
                        } else {
                            this.C2 = this.B2.size();
                            return;
                        }
                    }
                }
            }
        }
    }

    public final void i(int i7, int i10, boolean z9) {
        if (i7 == 2 || x(i7).K(0) == null) {
            return;
        }
        ew ewVar = new ew(getContext(), i10);
        ewVar.f57213a = !z9 ? 1 : 0;
        w(i7).w0(ewVar);
    }

    public final void k(boolean z9) {
        if (z9) {
            W();
            return;
        }
        int size = this.f34422j1.size();
        int size2 = this.f34425k1.size();
        int i7 = this.f34400c1;
        this.f34422j1 = org.telegram.messenger.ui.b0(i7).i0(0, true);
        this.f34425k1 = org.telegram.messenger.ui.b0(i7).i0(2, false);
        if (org.telegram.messenger.p10.i(i7).q()) {
            this.l1 = org.telegram.messenger.ui.b0(i7).i0(7, false);
        } else {
            this.l1 = new ArrayList();
        }
        for (int i10 = 0; i10 < this.f34425k1.size(); i10++) {
            TLRPC.Document document = (TLRPC.Document) this.f34425k1.get(i10);
            int i11 = 0;
            while (true) {
                if (i11 < this.f34422j1.size()) {
                    TLRPC.Document document2 = (TLRPC.Document) this.f34422j1.get(i11);
                    if (document2.dc_id == document.dc_id && document2.f26962id == document.f26962id) {
                        this.f34422j1.remove(i11);
                        break;
                    }
                    i11++;
                }
            }
        }
        if (org.telegram.messenger.qp.s1(i7).D3()) {
            int i12 = 0;
            while (i12 < this.f34425k1.size()) {
                if (org.telegram.messenger.ij.Y3((TLRPC.Document) this.f34425k1.get(i12))) {
                    this.f34425k1.remove(i12);
                    i12--;
                }
                i12++;
            }
            int i13 = 0;
            while (i13 < this.f34422j1.size()) {
                if (org.telegram.messenger.ij.Y3((TLRPC.Document) this.f34422j1.get(i13))) {
                    this.f34422j1.remove(i13);
                    i13--;
                }
                i13++;
            }
        }
        if (size != this.f34422j1.size() || size2 != this.f34425k1.size()) {
            X(false);
        }
        yx yxVar = this.f34469y0;
        if (yxVar != null) {
            yxVar.f();
        }
        o();
    }

    public final void l(boolean z9) {
        int i7;
        boolean z10;
        ix ixVar = this.f34452t1;
        te.a aVar = this.f34394b;
        tw twVar = this.P;
        iv ivVar = this.V;
        if (ixVar != null && ixVar.z()) {
            v4.d1 K = twVar.K(0);
            if (K == null) {
                ux.a(ivVar, true, !z9);
            } else {
                if (K.f57044a.getTop() < twVar.getPaddingTop()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ux.a(ivVar, z10, !z9);
            }
            N(false, !z9);
            ivVar.setTranslationY(aVar.f55487e * org.telegram.messenger.g0.L(15.0f));
        } else if (ivVar != null && twVar != null) {
            v4.d1 K2 = twVar.K(0);
            if (K2 != null) {
                i7 = K2.f57044a.getTop();
            } else {
                i7 = -this.f34396b1;
            }
            ivVar.setTranslationY((aVar.f55487e * org.telegram.messenger.g0.L(15.0f)) + i7);
            ivVar.f38765a.a(false, !z9);
            m(Math.round(this.I.getTranslationY()));
        }
    }

    public final void m(int i7) {
        ObjectAnimator objectAnimator = this.R0[1];
        if (objectAnimator != null && objectAnimator.isRunning()) {
            return;
        }
        boolean z9 = false;
        v4.d1 K = this.P.K(0);
        int L = org.telegram.messenger.g0.L(38.0f) + i7;
        if (L > 0 && (K == null || K.f57044a.getBottom() < L)) {
            z9 = true;
        }
        N(z9, !this.K1);
    }

    public final void n(int i7, View view) {
        tw twVar;
        v4.d1 K;
        int i10;
        lw lwVar = this.I;
        int[] iArr = this.Q0;
        if (view == null) {
            iArr[1] = 0;
            lwVar.setTranslationY(0);
        } else if (view.getVisibility() == 0 && !this.f34409f0) {
            ix ixVar = this.f34452t1;
            if (ixVar == null || !ixVar.z()) {
                if (i7 > 0 && (twVar = this.P) != null && twVar.getVisibility() == 0 && (K = twVar.K(0)) != null) {
                    int top = K.f57044a.getTop();
                    if (this.f34402d0) {
                        i10 = this.f34396b1;
                    } else {
                        i10 = 0;
                    }
                    if (top + i10 >= twVar.getPaddingTop()) {
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
                lwVar.setTranslationY(Math.max(-org.telegram.messenger.g0.L(36.0f), iArr[1]));
            }
        }
    }

    public final void o() {
        int L0;
        uv uvVar = this.B0;
        if (uvVar != null && (L0 = this.E0.L0()) != -1) {
            int i7 = this.G1;
            if (i7 <= 0 && (i7 = this.F1) <= 0) {
                i7 = this.E1;
            }
            uvVar.k(this.f34469y0.F(L0), i7);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ab.b0 b0Var = this.M2;
        if (b0Var != null) {
            b0Var.b();
            this.M2 = null;
        }
        ab.b0 b0Var2 = (ab.b0) new org.telegram.messenger.ps(org.telegram.messenger.qs.f(this.f34400c1), this).f24620b;
        b0Var2.e(org.telegram.messenger.qs.f25018i4);
        b0Var2.c(org.telegram.messenger.qs.L2);
        b0Var2.c(org.telegram.messenger.qs.f25060q3);
        this.M2 = b0Var2;
        if (this.f34469y0 != null) {
            b0Var2.c(org.telegram.messenger.qs.f25104x0);
            b0Var2.c(org.telegram.messenger.qs.X0);
            b0Var2.c(org.telegram.messenger.qs.f25118z0);
            b0Var2.c(org.telegram.messenger.qs.B0);
            b0Var2.c(org.telegram.messenger.qs.f25001f5);
            org.telegram.messenger.g0.h3(new cv(this, 0));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        yt ytVar = this.B1;
        if (ytVar != null && ytVar.isShowing()) {
            ytVar.dismiss();
        }
        org.telegram.ui.ks p10 = org.telegram.ui.ks.p();
        if (p10.f47286l == this.f34414g2) {
            p10.W = null;
            p10.f47273a0 = null;
            p10.Y = null;
            p10.f47286l = null;
            p10.f47277c0 = null;
            p10.t();
        }
    }

    @Override
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13 = i11 - i7;
        if (this.O1 != i13) {
            this.O1 = i13;
            D();
        }
        super.onLayout(z9, i7, i10, i11, i12);
        R();
        Z();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        this.K1 = true;
        boolean z9 = org.telegram.messenger.g0.E;
        View view = this.f34460w;
        boolean z10 = this.f34402d0;
        if (!z9 && !this.N1) {
            if (this.L1 != 0) {
                if (!this.L2) {
                    setOutlineProvider(null);
                    setClipToOutline(false);
                    setElevation(0.0f);
                }
                if (this.f34454u0) {
                    int i11 = org.telegram.ui.ActionBar.k6.f28214wf;
                    setBackgroundColor(z(i11));
                    if (z10) {
                        view.setBackgroundColor(z(i11));
                    }
                }
                this.L1 = 0;
            }
        } else if (this.L1 != 1) {
            if (!this.L2) {
                setOutlineProvider(this.M1);
                setClipToOutline(true);
                setElevation(org.telegram.messenger.g0.L(2.0f));
            }
            setBackgroundResource(2131232738);
            Drawable background = getBackground();
            int i12 = org.telegram.ui.ActionBar.k6.f28214wf;
            background.setColorFilter(new PorterDuffColorFilter(z(i12), PorterDuff.Mode.MULTIPLY));
            if (z10 && this.f34454u0) {
                view.setBackgroundColor(z(i12));
            }
            this.L1 = 1;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824));
        this.K1 = false;
        setTranslationY(getTranslationY());
    }

    public final void p(int i7) {
        int L0;
        int i10;
        int L02;
        if (i7 == 0) {
            if (!this.J0 && (L02 = this.E0.L0()) != -1 && this.D0 != null) {
                int i11 = this.G1;
                if (i11 <= 0 && (i11 = this.F1) <= 0) {
                    i11 = this.E1;
                }
                this.B0.k(this.f34469y0.F(L02), i11);
            }
        } else if (i7 == 2) {
            v4.g0 adapter = this.f34415h0.getAdapter();
            mx mxVar = this.f34432n0;
            if (adapter == mxVar && mxVar.I >= 0 && this.f34448s0 >= 0 && this.f34444r0 >= 0 && (L0 = this.f34418i0.L0()) != -1) {
                if (L0 >= mxVar.I) {
                    i10 = this.f34448s0;
                } else {
                    i10 = this.f34444r0;
                }
                this.f34437p0.k(i10, 0);
            }
        }
    }

    public final void q(boolean z9) {
        int i7;
        ix ixVar = this.f34452t1;
        te.a aVar = this.f34390a;
        qv qvVar = this.D0;
        boolean z10 = false;
        tv tvVar = this.G0;
        if (ixVar != null && ixVar.z()) {
            v4.d1 K = qvVar.K(0);
            if (K == null) {
                ux.a(tvVar, true, !z9);
            } else {
                if (K.f57044a.getTop() < qvVar.getPaddingTop()) {
                    z10 = true;
                }
                ux.a(tvVar, z10, !z9);
            }
            tvVar.setTranslationY(aVar.f55487e * org.telegram.messenger.g0.L(15.0f));
        } else if (tvVar != null && qvVar != null) {
            v4.d1 K2 = qvVar.K(0);
            if (K2 != null) {
                i7 = K2.f57044a.getTop();
            } else {
                i7 = -this.f34396b1;
            }
            tvVar.setTranslationY((aVar.f55487e * org.telegram.messenger.g0.L(15.0f)) + i7);
            tvVar.f38765a.a(false, !z9);
        }
    }

    public final void r() {
        HashMap hashMap = org.telegram.messenger.i6.f23052a;
        org.telegram.messenger.qp.d1().edit().putBoolean("filled_default", true).commit();
        org.telegram.messenger.i6.h.clear();
        org.telegram.messenger.i6.f23058i.clear();
        org.telegram.messenger.i6.r();
        this.R.F(false);
    }

    @Override
    public final void requestLayout() {
        if (this.K1) {
            return;
        }
        super.requestLayout();
    }

    public final void s(long j3, boolean z9) {
        ux uxVar;
        v4.b0 b0Var;
        View view;
        pj0 pj0Var;
        int i7;
        int i10;
        TLRPC.TL_messages_stickerSet o02;
        yx yxVar;
        int E;
        AnimatorSet animatorSet = this.M0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.M0 = null;
        }
        int currentItem = this.h.getCurrentItem();
        int i11 = 2;
        if (currentItem == 2 && j3 != -1 && (o02 = org.telegram.messenger.ui.b0(this.f34400c1).o0(j3)) != null && (E = (yxVar = this.f34469y0).E(o02)) >= 0 && E < yxVar.b()) {
            H(E, org.telegram.messenger.g0.L(48.0f));
        }
        int i12 = 0;
        mx mxVar = this.f34421j0;
        if (mxVar != null) {
            mxVar.K = false;
        }
        int i13 = 0;
        while (i13 < 3) {
            pj0 pj0Var2 = this.D0;
            pj0 pj0Var3 = this.f34415h0;
            nv nvVar = this.f34434o0;
            pj0 pj0Var4 = this.P;
            if (i13 == 0) {
                uxVar = this.V;
                b0Var = this.Q;
                view = this.I;
                pj0Var = pj0Var4;
            } else if (i13 == 1) {
                b0Var = this.f34418i0;
                view = this.f34437p0;
                pj0Var = pj0Var3;
                uxVar = nvVar;
            } else {
                uxVar = this.G0;
                b0Var = this.E0;
                view = this.B0;
                pj0Var = pj0Var2;
            }
            if (uxVar == null) {
                i10 = i12;
                i7 = i11;
            } else {
                int i14 = i12;
                tx txVar = uxVar.f38771r;
                int i15 = i11;
                uxVar.d.setText("");
                if (txVar != null) {
                    txVar.I1(null);
                    txVar.G1();
                }
                int i16 = this.f34396b1;
                if (i13 == currentItem && z9) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.M0 = animatorSet2;
                    Property property = View.TRANSLATION_Y;
                    if (view != null && i13 != 1) {
                        float[] fArr = new float[1];
                        fArr[i14] = 0.0f;
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
                        float[] fArr2 = new float[1];
                        fArr2[i14] = org.telegram.messenger.g0.L(36.0f);
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(pj0Var, property, fArr2);
                        float[] fArr3 = new float[1];
                        fArr3[i14] = org.telegram.messenger.g0.L(36.0f);
                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(uxVar, property, fArr3);
                        Animator[] animatorArr = new Animator[3];
                        animatorArr[i14] = ofFloat;
                        animatorArr[1] = ofFloat2;
                        animatorArr[i15] = ofFloat3;
                        animatorSet2.playTogether(animatorArr);
                    } else {
                        float[] fArr4 = new float[1];
                        fArr4[i14] = org.telegram.messenger.g0.L(36.0f) - i16;
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(pj0Var, property, fArr4);
                        Animator[] animatorArr2 = new Animator[1];
                        animatorArr2[i14] = ofFloat4;
                        animatorSet2.playTogether(animatorArr2);
                    }
                    this.M0.setDuration(200L);
                    this.M0.setInterpolator(xq.h);
                    this.M0.addListener(new di.h3(this, b0Var, pj0Var, 6));
                    this.M0.start();
                    i10 = i14;
                    i7 = i15;
                } else {
                    if (uxVar != nvVar) {
                        uxVar.setTranslationY(org.telegram.messenger.g0.L(36.0f) - i16);
                    }
                    i7 = i15;
                    if (view != null && i13 != i7) {
                        view.setTranslationY(0.0f);
                    }
                    if (pj0Var == pj0Var2) {
                        i10 = i14;
                        pj0Var.setPadding(i10, org.telegram.messenger.g0.L(36.0f), i10, org.telegram.messenger.g0.L(44.0f) + this.f34442q2);
                    } else {
                        i10 = i14;
                        if (pj0Var == pj0Var3) {
                            pj0Var.setPadding(i10, org.telegram.messenger.g0.L(40.0f), i10, org.telegram.messenger.g0.L(44.0f) + this.f34442q2);
                        } else {
                            if (pj0Var == pj0Var4) {
                                pj0Var.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(44.0f) + this.f34442q2);
                            }
                            i10 = 0;
                        }
                    }
                    b0Var.h1(i10, i10);
                }
            }
            i13++;
            i11 = i7;
            i12 = i10;
        }
        int i17 = i12;
        if (!z9) {
            this.f34452t1.i(i17);
        }
    }

    public void setBlurredBackgroundDrawableFactory(dh.c cVar) {
        org.telegram.ui.ActionBar.f6 f6Var = this.Z1;
        View view = this.f34468y;
        if (view != null) {
            fh.g c10 = cVar.c(view, null, false);
            c10.p(c8.g0.d(f6Var));
            c10.r(org.telegram.messenger.g0.L(18.0f));
            c10.q(org.telegram.messenger.g0.L(6.0f));
            view.setBackground(c10);
        }
        View view2 = this.E;
        if (view2 != null) {
            fh.g c11 = cVar.c(view2, null, false);
            c11.p(c8.g0.d(f6Var));
            c11.r(org.telegram.messenger.g0.L(18.0f));
            c11.q(org.telegram.messenger.g0.L(6.0f));
            view2.setBackground(c11);
        }
        View view3 = this.f34464x;
        if (view3 != null) {
            fh.g c12 = cVar.c(view3, null, false);
            c12.p(c8.g0.d(f6Var));
            c12.r(org.telegram.messenger.g0.L(18.0f));
            c12.q(org.telegram.messenger.g0.L(6.0f));
            view3.setBackground(c12);
        }
        View view4 = this.D;
        if (view4 != null) {
            fh.g c13 = cVar.c(view4, null, false);
            c13.p(c8.g0.d(f6Var));
            c13.r(org.telegram.messenger.g0.L(18.0f));
            c13.q(org.telegram.messenger.g0.L(6.0f));
            view4.setBackground(c13);
        }
    }

    public void setBottomInset(int i7) {
        if (this.f34442q2 != i7) {
            this.f34442q2 = i7;
            j(i7, this.K);
            j(i7, this.M);
            j(org.telegram.messenger.g0.L(44.0f) + i7, this.P);
            j(org.telegram.messenger.g0.L(44.0f) + i7, this.D0);
            j(org.telegram.messenger.g0.L(44.0f) + i7, this.f34415h0);
            FrameLayout frameLayout = this.f34447s;
            if (frameLayout != null) {
                frameLayout.setTranslationY(-i7);
            }
            R();
            invalidate();
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        this.J1 = chatFull;
        X(false);
    }

    public void setDelegate(ix ixVar) {
        this.f34452t1 = ixVar;
    }

    public void setDragListener(nw nwVar) {
        this.O0 = nwVar;
    }

    @Override
    public void setEnabled(boolean z9) {
        super.setEnabled(z9);
        tv tvVar = this.G0;
        if (tvVar != null) {
            tvVar.d.setEnabled(z9);
        }
        nv nvVar = this.f34434o0;
        if (nvVar != null) {
            nvVar.d.setEnabled(z9);
        }
        iv ivVar = this.V;
        if (ivVar != null) {
            ivVar.d.setEnabled(z9);
        }
    }

    public void setForseMultiwindowLayout(boolean z9) {
        this.N1 = z9;
    }

    public void setShouldDrawBackground(boolean z9) {
        if (this.f34454u0 != z9) {
            this.f34454u0 = z9;
            updateColors();
        }
    }

    public void setShowing(boolean z9) {
        this.P0 = z9;
        Z();
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        Z();
        R();
    }

    @Override
    public void setVisibility(int i7) {
        boolean z9;
        if (getVisibility() != i7) {
            z9 = true;
        } else {
            z9 = false;
        }
        super.setVisibility(i7);
        if (z9) {
            if (i7 != 8) {
                org.telegram.messenger.i6.s();
                this.R.F(false);
                ab.b0 b0Var = this.N2;
                int i10 = this.f34400c1;
                if (b0Var == null) {
                    ab.b0 b0Var2 = (ab.b0) new org.telegram.messenger.ps(org.telegram.messenger.qs.f(i10), this).f24620b;
                    b0Var2.c(org.telegram.messenger.qs.f25104x0);
                    this.N2 = b0Var2;
                }
                if (this.f34469y0 != null) {
                    if (!this.O2) {
                        this.O2 = true;
                        this.N2.c(org.telegram.messenger.qs.X0);
                    }
                    X(false);
                    D();
                }
                k(true);
                k(false);
                org.telegram.messenger.ui.b0(i10).V0(0, true, true, false);
                org.telegram.messenger.ui.b0(i10).V0(0, false, true, false);
                org.telegram.messenger.ui.b0(i10).V0(2, false, true, false);
            }
            jg.e1 e1Var = this.T0;
            if (e1Var != null) {
                e1Var.a();
            }
        }
    }

    public final void t(boolean z9) {
        s(-1L, z9);
    }

    public final void u(boolean z9) {
        yx yxVar;
        boolean z10 = this.T2;
        this.T2 = z9;
        if (z10 && !z9) {
            int i7 = this.A1;
            if (i7 == 0) {
                qw qwVar = this.R;
                if (qwVar != null) {
                    qwVar.F(false);
                }
            } else if (i7 == 1) {
                mx mxVar = this.f34432n0;
                if (mxVar != null) {
                    mxVar.f();
                }
            } else if (i7 == 2 && (yxVar = this.f34469y0) != null) {
                yxVar.f();
            }
        }
    }

    @Override
    public final void updateColors() {
        try {
            S();
            ri.c cVar = this.f34428l2;
            if (cVar != null) {
                cVar.a(z(org.telegram.ui.ActionBar.k6.f27852d6));
            }
            qb0 qb0Var = this.f34464x;
            if (qb0Var != null) {
                qb0Var.setIndicatorColor(i0.a.o(z(org.telegram.ui.ActionBar.k6.Df), 20));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final int v(float f10) {
        return i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Kl, this.Z1), (int) (f10 * 255.0f));
    }

    public final v4.s w(int i7) {
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    return this.f34418i0;
                }
                throw new IllegalArgumentException(jg.g.j(i7, "Unexpected argument: "));
            }
            return this.Q;
        }
        return this.E0;
    }

    public final pj0 x(int i7) {
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    return this.f34415h0;
                }
                throw new IllegalArgumentException(jg.g.j(i7, "Unexpected argument: "));
            }
            return this.P;
        }
        return this.D0;
    }

    public final HorizontalScrollView y(int i7) {
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    return this.f34437p0;
                }
                throw new IllegalArgumentException(jg.g.j(i7, "Unexpected argument: "));
            }
            return this.I;
        }
        return this.B0;
    }

    public final int z(int i7) {
        org.telegram.ui.ActionBar.f6 f6Var = this.Z1;
        if (f6Var != null) {
            return f6Var.h(i7);
        }
        return org.telegram.ui.ActionBar.k6.x0(null, i7, false);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void F(float f10, int i7) {
    }
}
