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
public class ry extends FrameLayout implements org.telegram.ui.ActionBar.c6, te.b, org.telegram.messenger.fs, rh.a {
    public static final int V2 = 0;
    public final my A0;
    public final LongSparseArray A1;
    public final GradientDrawable A2;
    public final qv B0;
    public int B1;
    public int B2;
    public final fw C0;
    public final iu C1;
    public ArrayList C2;
    public final gw D0;
    public final int D1;
    public int D2;
    public final ImageView E;
    public final aw E0;
    public final int[] E1;
    public long E2;
    public final ImageView F;
    public final bw F0;
    public int F1;
    public final te.a F2;
    public AnimatorSet G;
    public py G0;
    public int G1;
    public ArrayList G2;
    public AnimatorSet H;
    public final ew H0;
    public int H1;
    public Drawable H2;
    public float I;
    public final ph.c I0;
    public int I1;
    public int I2;
    public final ww J;
    public boolean J0;
    public int J1;
    public int J2;
    public final rw K;
    public boolean K0;
    public TLRPC.ChatFull K1;
    public int K2;
    public final org.telegram.ui.y61 L;
    public boolean L0;
    public boolean L1;
    public int L2;
    public final ph.a M;
    public final lx M0;
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
    public yw P0;
    public int P1;
    public boolean P2;
    public final ex Q;
    public boolean Q0;
    public boolean Q1;
    public AnimatorSet Q2;
    public final sw R;
    public final int[] R0;
    public boolean R1;
    public h2.m0 R2;
    public final bx S;
    public final ObjectAnimator[] S0;
    public zx S1;
    public final mv S2;
    public final qx T;
    public boolean T0;
    public float T1;
    public boolean T2;
    public py U;
    public jg.d1 U0;
    public float U1;
    public boolean U2;
    public final ph.c V;
    public boolean V0;
    public float V1;
    public final sv W;
    public boolean W0;
    public float W1;
    public String[] X0;
    public float X1;
    public final Drawable[] Y0;
    public boolean Y1;
    public final Drawable[] Z0;
    public final org.telegram.ui.ActionBar.h2 Z1;
    public final te.a f39332a;
    public AnimatorSet f39333a0;
    public final Drawable[] f39334a1;
    public final org.telegram.ui.ActionBar.i6 f39335a2;
    public final te.a f39336b;
    public final org.telegram.ui.ActionBar.l5 f39337b0;
    public final String[] f39338b1;
    public final org.telegram.ui.ActionBar.w5 f39339b2;
    public int f39340c;
    public final org.telegram.ui.ActionBar.l5 f39341c0;
    public final int f39342c1;
    public final org.telegram.ui.ActionBar.w5 f39343c2;
    public final ArrayList d;
    public boolean f39344d0;
    public final int f39345d1;
    public final boolean d2;
    public final ArrayList f39346e;
    public final boolean f39347e0;
    public final ArrayList f39348e1;
    public LongSparseArray f39349e2;
    public boolean f39350f;
    public boolean f39351f0;
    public int f39352f1;
    public PorterDuffColorFilter f39353f2;
    public boolean f39354g0;
    public int f39355g1;
    public final gk f39356g2;
    public final hw h;
    public final uv f39357h0;
    public boolean f39358h1;
    public final nw f39359h2;
    public final vv f39360i0;
    public TLRPC.TL_messages_stickerSet f39361i1;
    public boolean f39362i2;
    public final wx f39363j0;
    public ArrayList f39364j1;
    public final boolean f39365j2;
    public final vx f39366k0;
    public ArrayList f39367k1;
    public final dh.g f39368k2;
    public final yx f39369l0;
    public ArrayList l1;
    public final ih f39370l2;
    public final HashMap m0;
    public ArrayList f39371m1;
    public final ui.c f39372m2;
    public final FrameLayout f39373n;
    public final qv f39374n0;
    public final ArrayList n1;
    public final dh.c f39375n2;
    public final vx f39376o0;
    public final ArrayList f39377o1;
    public final ri.q f39378o2;
    public final xv f39379p0;
    public final ArrayList f39380p1;
    public boolean f39381p2;
    public final zw f39382q0;
    public final ArrayList f39383q1;
    public boolean f39384q2;
    public final FrameLayout f39385r;
    public boolean f39386r0;
    public final ArrayList f39387r1;
    public int f39388r2;
    public final FrameLayout f39389s;
    public int f39390s0;
    public final HashMap f39391s1;
    public float f39392s2;
    public int f39393t0;
    public final Paint f39394t1;
    public View f39395t2;
    public int f39396u0;
    public rx f39397u1;
    public int f39398u2;
    public boolean f39399v0;
    public long f39400v1;
    public int f39401v2;
    public final View f39402w;
    public boolean f39403w0;
    public boolean f39404w1;
    public long f39405w2;
    public final bc0 f39406x;
    public boolean f39407x0;
    public boolean f39408x1;
    public boolean f39409x2;
    public final iw f39410y;
    public final yv f39411y0;
    public final TLRPC.StickerSetCovered[] f39412y1;
    public boolean f39413y2;
    public final jy f39414z0;
    public final LongSparseArray f39415z1;
    public final Rect f39416z2;

    public ry(org.telegram.ui.ActionBar.h2 h2Var, boolean z10, boolean z11, boolean z12, Context context, boolean z13, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z14, final org.telegram.ui.ActionBar.i6 i6Var, boolean z15, boolean z16) {
        super(context);
        mv mvVar;
        boolean z17;
        rw rwVar;
        int i7;
        boolean z18;
        Context context2;
        final org.telegram.ui.ActionBar.i6 i6Var2;
        ri.q qVar;
        bx bxVar;
        int i10;
        int i11;
        int i12;
        boolean z19;
        Field field;
        boolean z20;
        bx bxVar2;
        boolean z21;
        lr lrVar = lr.h;
        this.f39332a = new te.a(0, this, lrVar, 320L, false);
        this.f39336b = new te.a(1, this, lrVar, 320L, false);
        this.f39340c = 2;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.f39346e = new ArrayList();
        this.f39344d0 = true;
        this.f39369l0 = new yx(this);
        this.m0 = new HashMap();
        this.f39386r0 = true;
        this.f39390s0 = -2;
        this.f39393t0 = -2;
        this.f39396u0 = -2;
        this.f39399v0 = true;
        this.f39407x0 = true;
        this.J0 = true;
        this.R0 = new int[3];
        this.S0 = new ObjectAnimator[3];
        int i13 = org.telegram.messenger.j10.f24770t0;
        this.f39345d1 = i13;
        this.f39348e1 = new ArrayList();
        this.f39364j1 = new ArrayList();
        this.f39367k1 = new ArrayList();
        this.l1 = new ArrayList();
        this.f39371m1 = new ArrayList();
        this.n1 = new ArrayList();
        this.f39377o1 = new ArrayList();
        new ArrayList();
        this.f39380p1 = new ArrayList();
        this.f39383q1 = new ArrayList();
        this.f39387r1 = new ArrayList();
        this.f39391s1 = new HashMap();
        this.f39412y1 = new TLRPC.StickerSetCovered[10];
        this.f39415z1 = new LongSparseArray();
        this.A1 = new LongSparseArray();
        this.E1 = new int[2];
        this.G1 = -2;
        this.H1 = -2;
        this.I1 = -2;
        this.J1 = -2;
        this.M1 = -1;
        this.f39356g2 = new gk(this, 5);
        this.f39359h2 = new nw(this);
        this.f39362i2 = true;
        ri.q qVar2 = new ri.q();
        this.f39378o2 = qVar2;
        this.f39392s2 = -1.0f;
        this.f39398u2 = -1;
        this.f39401v2 = -1;
        this.f39405w2 = -1L;
        this.f39409x2 = false;
        this.f39413y2 = true;
        this.f39416z2 = new Rect();
        this.A2 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.F2 = new te.a(0, new nv(this, 3), lrVar, 380L, true);
        this.S2 = new mv(this, 1);
        this.T2 = false;
        this.f39399v0 = z14;
        this.Z1 = h2Var;
        this.d2 = z10;
        this.f39335a2 = i6Var;
        this.f39365j2 = z16;
        ui.c cVar = new ui.c();
        this.f39372m2 = cVar;
        cVar.a(z(org.telegram.ui.ActionBar.n6.f29394d6));
        if (z15) {
            u(true);
        }
        i0.a.o(z(org.telegram.ui.ActionBar.n6.Nl), 30);
        int L = org.telegram.messenger.g0.L(50.0f);
        this.f39342c1 = L;
        this.f39347e0 = z13;
        this.Y0 = new Drawable[]{org.telegram.ui.ActionBar.n6.W(context, 2131232745, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.n6.Jf), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.n6.Gf)), org.telegram.ui.ActionBar.n6.W(context, 2131232742, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.n6.Jf), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.n6.Gf)), org.telegram.ui.ActionBar.n6.W(context, 2131232746, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.n6.Jf), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.n6.Gf))};
        org.telegram.ui.ActionBar.w5 W = org.telegram.ui.ActionBar.n6.W(context, 2131232127, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.n6.Ef), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.n6.Gf));
        org.telegram.ui.ActionBar.w5 W2 = org.telegram.ui.ActionBar.n6.W(context, 2131231064, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.n6.Ef), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.n6.Gf));
        org.telegram.ui.ActionBar.w5 W3 = org.telegram.ui.ActionBar.n6.W(context, 2131231067, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.n6.Ef), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.n6.Gf));
        org.telegram.ui.ActionBar.w5 W4 = org.telegram.ui.ActionBar.n6.W(context, 2131231065, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.n6.Ef), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.n6.Gf));
        this.f39339b2 = W4;
        int i14 = org.telegram.ui.ActionBar.n6.If;
        org.telegram.ui.ActionBar.w5 W5 = org.telegram.ui.ActionBar.n6.W(context, 2131231066, z(i14), z(i14));
        this.f39343c2 = W5;
        this.Z0 = new Drawable[]{W, W2, W3, new LayerDrawable(new Drawable[]{W4, W5})};
        this.f39334a1 = new Drawable[]{org.telegram.ui.ActionBar.n6.W(context, 2131232127, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.n6.Ef), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.n6.Gf)), org.telegram.ui.ActionBar.n6.W(context, 2131232765, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.n6.Ef), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.n6.Gf))};
        this.f39338b1 = new String[]{org.telegram.messenger.gd.M0(2131751184, null), org.telegram.messenger.gd.M0(2131751183, null), org.telegram.messenger.gd.M0(2131751182, null), org.telegram.messenger.gd.M0(2131751181, null), org.telegram.messenger.gd.M0(2131751180, null), org.telegram.messenger.gd.M0(2131751179, null), org.telegram.messenger.gd.M0(2131751178, null), org.telegram.messenger.gd.M0(2131751177, null)};
        this.K1 = chatFull;
        Paint paint = new Paint(1);
        this.f39394t1 = paint;
        paint.setColor(z(org.telegram.ui.ActionBar.n6.Sf));
        bg.q0 q0Var = bg.u0.f3343a;
        this.N1 = new bg.r0(org.telegram.messenger.g0.L(6.0f));
        rw rwVar2 = new rw(this, context);
        this.K = rwVar2;
        ?? obj = new Object();
        obj.f37873a = 0;
        obj.f37874b = rwVar2;
        arrayList.add(obj);
        if (z10) {
            org.telegram.messenger.ri.d0(i13).D(5);
            org.telegram.messenger.ri.d0(i13).y();
            this.f39353f2 = new PorterDuffColorFilter(z(org.telegram.ui.ActionBar.n6.Fi), PorterDuff.Mode.SRC_IN);
        }
        ex exVar = new ex(this, context);
        this.Q = exVar;
        qVar2.b(exVar);
        v4.k kVar = new v4.k();
        kVar.f59196c = 220L;
        kVar.f59197e = 220L;
        kVar.f59198f = 160L;
        kVar.f59199g = 160L;
        kVar.f59200i = lr.f37209g;
        exVar.setItemAnimator(kVar);
        exVar.setOnTouchListener(new View.OnTouchListener(this) {
            public final ry f38174b;

            {
                this.f38174b = this;
            }

            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                switch (r3) {
                    case 0:
                        org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
                        ry ryVar = this.f38174b;
                        ex exVar2 = ryVar.Q;
                        ryVar.getMeasuredHeight();
                        return p10.r(motionEvent, exVar2, null, ryVar.f39359h2, i6Var);
                    case 1:
                        org.telegram.ui.ns p11 = org.telegram.ui.ns.p();
                        ry ryVar2 = this.f38174b;
                        return p11.r(motionEvent, ryVar2.f39360i0, ryVar2.f39374n0, ryVar2.f39359h2, i6Var);
                    default:
                        org.telegram.ui.ns p12 = org.telegram.ui.ns.p();
                        ry ryVar3 = this.f38174b;
                        aw awVar = ryVar3.E0;
                        ryVar3.getMeasuredHeight();
                        return p12.r(motionEvent, awVar, ryVar3.B0, ryVar3.f39359h2, i6Var);
                }
            }
        });
        exVar.setOnItemLongClickListener(new nv(this, 1));
        exVar.setInstantClick(true);
        sw swVar = new sw(this);
        this.R = swVar;
        exVar.setLayoutManager(swVar);
        exVar.setTopGlowOffset(org.telegram.messenger.g0.L(38.0f));
        exVar.setBottomGlowOffset(org.telegram.messenger.g0.L(36.0f));
        exVar.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(44.0f));
        int i15 = org.telegram.ui.ActionBar.n6.f29814zf;
        org.telegram.ui.ActionBar.u6.l(exVar, 21, i15, i6Var);
        exVar.setItemSelectorColorProvider(new k2(23));
        exVar.setClipToPadding(false);
        swVar.O = new tw(this);
        bx bxVar3 = new bx(this);
        this.S = bxVar3;
        exVar.setAdapter(bxVar3);
        exVar.i(new ai.i0(this, 4));
        this.T = new qx(this, context);
        rwVar2.addView(exVar, c8.ma.c(-1.0f, -1));
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(exVar, swVar);
        this.f39341c0 = l5Var;
        l5Var.f29204r = new uw(this);
        exVar.setOnScrollListener(new vw(this));
        if (h2Var != null) {
            mvVar = new mv(this, 2);
            rwVar = rwVar2;
            i7 = -1;
            z18 = z16;
            context2 = context;
            i6Var2 = i6Var;
            qVar = qVar2;
            bxVar = bxVar3;
            i10 = i14;
            i11 = 5;
            z17 = z10;
        } else {
            mvVar = null;
            z17 = z10;
            rwVar = rwVar2;
            i7 = -1;
            z18 = z16;
            context2 = context;
            i6Var2 = i6Var;
            qVar = qVar2;
            bxVar = bxVar3;
            i10 = i14;
            i11 = 5;
        }
        ww wwVar = new ww(this, context2, i6Var2, z17, mvVar, z18);
        this.J = wwVar;
        if (z13) {
            sv svVar = new sv(this, context2);
            this.W = svVar;
            rwVar.addView(svVar, new FrameLayout.LayoutParams(i7, org.telegram.messenger.g0.f1() + L));
            svVar.d.setOnFocusChangeListener(new tv(this));
            ph.c cVar2 = new ph.c(context2, i6Var2);
            this.V = cVar2;
            cVar2.setVisibility(8);
            cVar2.setOnBackClickListener(new View.OnClickListener(this) {
                public final ry f38567b;

                {
                    this.f38567b = this;
                }

                @Override
                public final void onClick(View view) {
                    ey eyVar;
                    switch (r2) {
                        case 0:
                            qx qxVar = this.f38567b.T;
                            mx mxVar = qxVar.f38925c;
                            int childCount = mxVar.getChildCount();
                            for (int i16 = 0; i16 < childCount; i16++) {
                                ((ph.b) mxVar.getChildAt(i16)).a(false, true);
                            }
                            qxVar.d = 0L;
                            qxVar.G.f39336b.a(false, true);
                            qxVar.f();
                            return;
                        case 1:
                            my myVar = this.f38567b.A0;
                            mx mxVar2 = myVar.f37656c;
                            int childCount2 = mxVar2.getChildCount();
                            for (int i17 = 0; i17 < childCount2; i17++) {
                                ((ph.b) mxVar2.getChildAt(i17)).a(false, true);
                            }
                            myVar.d = 0L;
                            myVar.R.f39332a.a(false, true);
                            myVar.f();
                            return;
                        case 2:
                            rx rxVar = this.f38567b.f39397u1;
                            if (rxVar != null) {
                                rxVar.w();
                                return;
                            }
                            return;
                        default:
                            ry ryVar = this.f38567b;
                            int currentItem = ryVar.h.getCurrentItem();
                            if (currentItem == 0) {
                                eyVar = ryVar.W;
                            } else if (currentItem == 1) {
                                eyVar = ryVar.f39379p0;
                            } else {
                                eyVar = ryVar.H0;
                            }
                            if (eyVar != null) {
                                gq gqVar = eyVar.d;
                                gqVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                gqVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                gqVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                return;
                            }
                            return;
                    }
                }
            });
            rwVar.addView(cVar2, new FrameLayout.LayoutParams(i7, L));
        }
        if (Color.alpha(z(i15)) >= 255) {
            org.telegram.ui.ActionBar.u6.h(i15, wwVar, i6Var2);
        }
        bxVar.G(true);
        wwVar.p(getEmojipacks());
        rwVar.addView(wwVar, c8.ma.c(36.0f, i7));
        View view = new View(context2);
        this.P = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        int i16 = org.telegram.ui.ActionBar.n6.Cf;
        org.telegram.ui.ActionBar.u6.h(i16, view, i6Var2);
        bx bxVar4 = bxVar;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i7, org.telegram.messenger.g0.f1(), 51);
        layoutParams.topMargin = org.telegram.messenger.g0.L(36.0f);
        rwVar.addView(view, layoutParams);
        ph.a aVar = new ph.a(context2, i6Var2);
        this.M = aVar;
        org.telegram.ui.y61 y61Var = new org.telegram.ui.y61(context2, i6Var2);
        this.L = y61Var;
        y61Var.setVisibility(8);
        y61Var.addView(aVar, c8.ma.d(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
        rwVar.addView(y61Var, c8.ma.e(i7, -2, 80));
        if (z11) {
            dl0 dl0Var = dl0.f34465b;
            if (z12) {
                uv uvVar = new uv(this, context2);
                this.f39357h0 = uvVar;
                ?? obj2 = new Object();
                obj2.f37873a = 1;
                obj2.f37874b = uvVar;
                this.d.add(obj2);
                vv vvVar = new vv(this, context2);
                this.f39360i0 = vvVar;
                qVar.b(vvVar);
                vvVar.setClipToPadding(false);
                wx wxVar = new wx(this);
                this.f39363j0 = wxVar;
                vvVar.setLayoutManager(wxVar);
                vvVar.i(new wv(this));
                vvVar.setPadding(0, L, 0, org.telegram.messenger.g0.L(44.0f) + this.f39388r2);
                ((v4.h1) vvVar.getItemAnimator()).f59152m = false;
                vx vxVar = new vx(this, context2, true, Integer.MAX_VALUE);
                this.f39376o0 = vxVar;
                vvVar.setAdapter(vxVar);
                this.f39366k0 = new vx(this, context2, false, 0);
                vvVar.setOnScrollListener(new qy(this, 2));
                vvVar.setOnTouchListener(new View.OnTouchListener(this) {
                    public final ry f38174b;

                    {
                        this.f38174b = this;
                    }

                    @Override
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        switch (r3) {
                            case 0:
                                org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
                                ry ryVar = this.f38174b;
                                ex exVar2 = ryVar.Q;
                                ryVar.getMeasuredHeight();
                                return p10.r(motionEvent, exVar2, null, ryVar.f39359h2, i6Var2);
                            case 1:
                                org.telegram.ui.ns p11 = org.telegram.ui.ns.p();
                                ry ryVar2 = this.f38174b;
                                return p11.r(motionEvent, ryVar2.f39360i0, ryVar2.f39374n0, ryVar2.f39359h2, i6Var2);
                            default:
                                org.telegram.ui.ns p12 = org.telegram.ui.ns.p();
                                ry ryVar3 = this.f38174b;
                                aw awVar = ryVar3.E0;
                                ryVar3.getMeasuredHeight();
                                return p12.r(motionEvent, awVar, ryVar3.B0, ryVar3.f39359h2, i6Var2);
                        }
                    }
                });
                ?? r10 = new oj0(this) {
                    public final ry f38920b;

                    {
                        this.f38920b = this;
                    }

                    @Override
                    public final void c(int i17, View view2) {
                        int i18;
                        String str;
                        switch (r2) {
                            case 0:
                                ry ryVar = this.f38920b;
                                vv vvVar2 = ryVar.f39360i0;
                                vx vxVar2 = ryVar.f39366k0;
                                vx vxVar3 = ryVar.f39376o0;
                                if (ryVar.f39397u1 != null) {
                                    vxVar3.getClass();
                                    ArrayList arrayList2 = vxVar3.f41479y;
                                    if (vvVar2.getAdapter() == vxVar3) {
                                        if (i17 >= 0) {
                                            int i19 = vxVar3.I;
                                            if (i17 < i19) {
                                                ryVar.f39397u1.v(view2, ryVar.f39364j1.get(i17), null, "gif", true, 0, 0);
                                                return;
                                            }
                                            if (i19 > 0) {
                                                i18 = (i17 - i19) - 1;
                                            } else {
                                                i18 = i17;
                                            }
                                            if (i18 >= 0 && i18 < arrayList2.size()) {
                                                ryVar.f39397u1.v(view2, arrayList2.get(i18), null, vxVar3.f41474n, true, 0, 0);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    } else if (vvVar2.getAdapter() == vxVar2 && i17 >= 0 && i17 < vxVar2.f41479y.size()) {
                                        ryVar.f39397u1.v(view2, vxVar2.f41479y.get(i17), vxVar2.f41478x, vxVar2.f41474n, true, 0, 0);
                                        ryVar.X();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            default:
                                ry ryVar2 = this.f38920b;
                                v4.i0 adapter = ryVar2.E0.getAdapter();
                                my myVar = ryVar2.A0;
                                if (adapter == myVar) {
                                    str = myVar.O;
                                } else {
                                    str = null;
                                }
                                String str2 = str;
                                if (view2 instanceof org.telegram.ui.Cells.a8) {
                                    org.telegram.ui.Cells.a8 a8Var = (org.telegram.ui.Cells.a8) view2;
                                    if (a8Var.getSticker() != null && org.telegram.messenger.fj.X3(a8Var.getSticker()) && !org.telegram.messenger.j10.i(org.telegram.messenger.c.a(ryVar2.f39345d1).f23218a).q()) {
                                        org.telegram.ui.ns.p().x(a8Var);
                                        return;
                                    }
                                    org.telegram.ui.ns.p().t();
                                    if (!a8Var.f30392r) {
                                        a8Var.f30392r = true;
                                        a8Var.f30391n = 0.5f;
                                        a8Var.f30396y = 0L;
                                        org.telegram.ui.Cells.z7 z7Var = a8Var.f30386a;
                                        z7Var.setAlpha(0.5f * a8Var.I);
                                        z7Var.invalidate();
                                        a8Var.f30393s = System.currentTimeMillis();
                                        a8Var.invalidate();
                                        ryVar2.f39397u1.m(a8Var, a8Var.getSticker(), str2, a8Var.getParentObject(), a8Var.getSendAnimationData(), true, 0);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                };
                this.f39374n0 = r10;
                vvVar.setOnItemClickListener((oj0) r10);
                uvVar.addView(vvVar, c8.ma.c(-1.0f, -1));
                xv xvVar = new xv(this, context2);
                this.f39379p0 = xvVar;
                uvVar.addView(xvVar, new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1() + L));
                zw zwVar = new zw(this, context2, i6Var2);
                this.f39382q0 = zwVar;
                zwVar.setType(dl0Var);
                zwVar.setUnderlineHeight(org.telegram.messenger.g0.f1());
                zwVar.setIndicatorColor(z(i10));
                zwVar.setUnderlineColor(z(i16));
                org.telegram.ui.ActionBar.u6.h(i15, zwVar, i6Var2);
                W();
                zwVar.setDelegate(new nv(this, 2));
                vxVar.F("", "", true, true, true);
            }
            yv yvVar = new yv(this, context2, z14);
            this.f39411y0 = yvVar;
            org.telegram.messenger.ri.d0(this.f39345d1).D(0);
            org.telegram.messenger.ri.d0(this.f39345d1).z();
            aw awVar = new aw(this, context2);
            this.E0 = awVar;
            this.f39378o2.b(awVar);
            bw bwVar = new bw(this);
            this.F0 = bwVar;
            awVar.setLayoutManager(bwVar);
            bwVar.O = new cw(this);
            awVar.setPadding(0, org.telegram.messenger.g0.L(36.0f), 0, org.telegram.messenger.g0.L(44.0f));
            awVar.setClipToPadding(false);
            ?? obj3 = new Object();
            obj3.f37873a = 2;
            obj3.f37874b = yvVar;
            this.d.add(obj3);
            this.A0 = new my(this, context2);
            jy jyVar = new jy(this, context2);
            this.f39414z0 = jyVar;
            awVar.setAdapter(jyVar);
            awVar.setOnTouchListener(new View.OnTouchListener(this) {
                public final ry f38174b;

                {
                    this.f38174b = this;
                }

                @Override
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    switch (r3) {
                        case 0:
                            org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
                            ry ryVar = this.f38174b;
                            ex exVar2 = ryVar.Q;
                            ryVar.getMeasuredHeight();
                            return p10.r(motionEvent, exVar2, null, ryVar.f39359h2, i6Var2);
                        case 1:
                            org.telegram.ui.ns p11 = org.telegram.ui.ns.p();
                            ry ryVar2 = this.f38174b;
                            return p11.r(motionEvent, ryVar2.f39360i0, ryVar2.f39374n0, ryVar2.f39359h2, i6Var2);
                        default:
                            org.telegram.ui.ns p12 = org.telegram.ui.ns.p();
                            ry ryVar3 = this.f38174b;
                            aw awVar2 = ryVar3.E0;
                            ryVar3.getMeasuredHeight();
                            return p12.r(motionEvent, awVar2, ryVar3.B0, ryVar3.f39359h2, i6Var2);
                    }
                }
            });
            ?? r42 = new oj0(this) {
                public final ry f38920b;

                {
                    this.f38920b = this;
                }

                @Override
                public final void c(int i17, View view2) {
                    int i18;
                    String str;
                    switch (r2) {
                        case 0:
                            ry ryVar = this.f38920b;
                            vv vvVar2 = ryVar.f39360i0;
                            vx vxVar2 = ryVar.f39366k0;
                            vx vxVar3 = ryVar.f39376o0;
                            if (ryVar.f39397u1 != null) {
                                vxVar3.getClass();
                                ArrayList arrayList2 = vxVar3.f41479y;
                                if (vvVar2.getAdapter() == vxVar3) {
                                    if (i17 >= 0) {
                                        int i19 = vxVar3.I;
                                        if (i17 < i19) {
                                            ryVar.f39397u1.v(view2, ryVar.f39364j1.get(i17), null, "gif", true, 0, 0);
                                            return;
                                        }
                                        if (i19 > 0) {
                                            i18 = (i17 - i19) - 1;
                                        } else {
                                            i18 = i17;
                                        }
                                        if (i18 >= 0 && i18 < arrayList2.size()) {
                                            ryVar.f39397u1.v(view2, arrayList2.get(i18), null, vxVar3.f41474n, true, 0, 0);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                } else if (vvVar2.getAdapter() == vxVar2 && i17 >= 0 && i17 < vxVar2.f41479y.size()) {
                                    ryVar.f39397u1.v(view2, vxVar2.f41479y.get(i17), vxVar2.f41478x, vxVar2.f41474n, true, 0, 0);
                                    ryVar.X();
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        default:
                            ry ryVar2 = this.f38920b;
                            v4.i0 adapter = ryVar2.E0.getAdapter();
                            my myVar = ryVar2.A0;
                            if (adapter == myVar) {
                                str = myVar.O;
                            } else {
                                str = null;
                            }
                            String str2 = str;
                            if (view2 instanceof org.telegram.ui.Cells.a8) {
                                org.telegram.ui.Cells.a8 a8Var = (org.telegram.ui.Cells.a8) view2;
                                if (a8Var.getSticker() != null && org.telegram.messenger.fj.X3(a8Var.getSticker()) && !org.telegram.messenger.j10.i(org.telegram.messenger.c.a(ryVar2.f39345d1).f23218a).q()) {
                                    org.telegram.ui.ns.p().x(a8Var);
                                    return;
                                }
                                org.telegram.ui.ns.p().t();
                                if (!a8Var.f30392r) {
                                    a8Var.f30392r = true;
                                    a8Var.f30391n = 0.5f;
                                    a8Var.f30396y = 0L;
                                    org.telegram.ui.Cells.z7 z7Var = a8Var.f30386a;
                                    z7Var.setAlpha(0.5f * a8Var.I);
                                    z7Var.invalidate();
                                    a8Var.f30393s = System.currentTimeMillis();
                                    a8Var.invalidate();
                                    ryVar2.f39397u1.m(a8Var, a8Var.getSticker(), str2, a8Var.getParentObject(), a8Var.getSendAnimationData(), true, 0);
                                    return;
                                }
                                return;
                            }
                            return;
                    }
                }
            };
            this.B0 = r42;
            awVar.setOnItemClickListener((oj0) r42);
            org.telegram.ui.ActionBar.u6.l(awVar, 21, i15, i6Var2);
            yvVar.addView(awVar);
            this.f39337b0 = new org.telegram.ui.ActionBar.l5(awVar, bwVar);
            ew ewVar = new ew(this, context2);
            this.H0 = ewVar;
            yvVar.addView(ewVar, new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1() + L));
            ph.c cVar3 = new ph.c(context2, i6Var2);
            this.I0 = cVar3;
            cVar3.setVisibility(8);
            cVar3.setOnBackClickListener(new View.OnClickListener(this) {
                public final ry f38567b;

                {
                    this.f38567b = this;
                }

                @Override
                public final void onClick(View view2) {
                    ey eyVar;
                    switch (r2) {
                        case 0:
                            qx qxVar = this.f38567b.T;
                            mx mxVar = qxVar.f38925c;
                            int childCount = mxVar.getChildCount();
                            for (int i162 = 0; i162 < childCount; i162++) {
                                ((ph.b) mxVar.getChildAt(i162)).a(false, true);
                            }
                            qxVar.d = 0L;
                            qxVar.G.f39336b.a(false, true);
                            qxVar.f();
                            return;
                        case 1:
                            my myVar = this.f38567b.A0;
                            mx mxVar2 = myVar.f37656c;
                            int childCount2 = mxVar2.getChildCount();
                            for (int i17 = 0; i17 < childCount2; i17++) {
                                ((ph.b) mxVar2.getChildAt(i17)).a(false, true);
                            }
                            myVar.d = 0L;
                            myVar.R.f39332a.a(false, true);
                            myVar.f();
                            return;
                        case 2:
                            rx rxVar = this.f38567b.f39397u1;
                            if (rxVar != null) {
                                rxVar.w();
                                return;
                            }
                            return;
                        default:
                            ry ryVar = this.f38567b;
                            int currentItem = ryVar.h.getCurrentItem();
                            if (currentItem == 0) {
                                eyVar = ryVar.W;
                            } else if (currentItem == 1) {
                                eyVar = ryVar.f39379p0;
                            } else {
                                eyVar = ryVar.H0;
                            }
                            if (eyVar != null) {
                                gq gqVar = eyVar.d;
                                gqVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                gqVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                gqVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                return;
                            }
                            return;
                    }
                }
            });
            yvVar.addView(cVar3, new FrameLayout.LayoutParams(-1, L));
            z19 = z14;
            i12 = 80;
            fw fwVar = new fw(this, context2, i6Var2, h2Var, z19);
            this.C0 = fwVar;
            fwVar.setDragEnabled(true);
            fwVar.setWillNotDraw(false);
            fwVar.setType(dl0Var);
            fwVar.setUnderlineHeight(awVar.canScrollVertically(-1) ? org.telegram.messenger.g0.f1() : 0);
            fwVar.setIndicatorColor(z(i10));
            fwVar.setUnderlineColor(z(i16));
            if (viewGroup != null && z19) {
                gw gwVar = new gw(this, context2);
                this.D0 = gwVar;
                gwVar.addView(fwVar, c8.ma.e(-1, 36, 51));
                viewGroup.addView(gwVar, c8.ma.c(-2.0f, -1));
            } else {
                yvVar.addView(fwVar, c8.ma.e(-1, 36, 51));
            }
            Y(true);
            fwVar.setDelegate(new nv(this, 4));
            awVar.setOnScrollListener(new qy(this, 0));
            ph.a aVar2 = new ph.a(context2, i6Var2);
            this.O = aVar2;
            org.telegram.ui.y61 y61Var2 = new org.telegram.ui.y61(context2, i6Var2);
            this.N = y61Var2;
            y61Var2.setVisibility(8);
            y61Var2.addView(aVar2, c8.ma.d(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
            yvVar.addView(y61Var2, c8.ma.e(-1, -2, 80));
        } else {
            i12 = 80;
            z19 = z14;
        }
        this.f39346e.clear();
        this.f39346e.addAll(this.d);
        hw hwVar = new hw(this, context2);
        this.h = hwVar;
        ri.q qVar3 = this.f39378o2;
        qVar3.getClass();
        hwVar.b(new ri.i(qVar3, hwVar));
        hwVar.setOverScrollMode(2);
        lx lxVar = new lx(this);
        this.M0 = lxVar;
        hwVar.setAdapter(lxVar);
        iw iwVar = new iw(this, context2);
        this.f39410y = iwVar;
        iwVar.setHapticFeedbackEnabled(true);
        iwVar.setImageResource(2131232741);
        int v = z16 ? v(0.6f) : z(org.telegram.ui.ActionBar.n6.Jf);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        iwVar.setColorFilter(new PorterDuffColorFilter(v, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        iwVar.setScaleType(scaleType);
        iwVar.setContentDescription(org.telegram.messenger.gd.M0(2131754920, null));
        iwVar.setFocusable(true);
        iwVar.setOnClickListener(new Object());
        c8.ra.a(iwVar);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f39385r = frameLayout;
        if (z13) {
            addView(frameLayout, c8.ma.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, (org.telegram.messenger.g0.f1() / org.telegram.messenger.g0.f24117p) + 40.0f));
        } else {
            addView(frameLayout, c8.ma.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.f39389s = frameLayout2;
        addView(frameLayout2, c8.ma.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 64.0f));
        FrameLayout frameLayout3 = new FrameLayout(context2);
        this.f39373n = frameLayout3;
        View view2 = new View(context2);
        this.f39402w = view2;
        frameLayout3.addView(view2, new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.L(40.0f), 83));
        if (z13) {
            addView(frameLayout3, c8.ma.e(-1, 48, i12));
            frameLayout3.addView(iwVar, c8.ma.d(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
            if (z11) {
                ImageView imageView = new ImageView(context2);
                this.E = imageView;
                imageView.setImageResource(2131232744);
                imageView.setColorFilter(new PorterDuffColorFilter(z16 ? v(0.6f) : z(org.telegram.ui.ActionBar.n6.Jf), mode));
                imageView.setScaleType(scaleType);
                imageView.setFocusable(true);
                imageView.setContentDescription(org.telegram.messenger.gd.M0(2131745300, null));
                c8.ra.a(imageView);
                frameLayout3.addView(imageView, c8.ma.d(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
                imageView.setOnClickListener(new View.OnClickListener(this) {
                    public final ry f38567b;

                    {
                        this.f38567b = this;
                    }

                    @Override
                    public final void onClick(View view22) {
                        ey eyVar;
                        switch (r2) {
                            case 0:
                                qx qxVar = this.f38567b.T;
                                mx mxVar = qxVar.f38925c;
                                int childCount = mxVar.getChildCount();
                                for (int i162 = 0; i162 < childCount; i162++) {
                                    ((ph.b) mxVar.getChildAt(i162)).a(false, true);
                                }
                                qxVar.d = 0L;
                                qxVar.G.f39336b.a(false, true);
                                qxVar.f();
                                return;
                            case 1:
                                my myVar = this.f38567b.A0;
                                mx mxVar2 = myVar.f37656c;
                                int childCount2 = mxVar2.getChildCount();
                                for (int i17 = 0; i17 < childCount2; i17++) {
                                    ((ph.b) mxVar2.getChildAt(i17)).a(false, true);
                                }
                                myVar.d = 0L;
                                myVar.R.f39332a.a(false, true);
                                myVar.f();
                                return;
                            case 2:
                                rx rxVar = this.f38567b.f39397u1;
                                if (rxVar != null) {
                                    rxVar.w();
                                    return;
                                }
                                return;
                            default:
                                ry ryVar = this.f38567b;
                                int currentItem = ryVar.h.getCurrentItem();
                                if (currentItem == 0) {
                                    eyVar = ryVar.W;
                                } else if (currentItem == 1) {
                                    eyVar = ryVar.f39379p0;
                                } else {
                                    eyVar = ryVar.H0;
                                }
                                if (eyVar != null) {
                                    gq gqVar = eyVar.d;
                                    gqVar.requestFocus();
                                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                    gqVar.onTouchEvent(obtain);
                                    obtain.recycle();
                                    MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                    gqVar.onTouchEvent(obtain2);
                                    obtain2.recycle();
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            bc0 bc0Var = new bc0(context2, i6Var2);
            this.f39406x = bc0Var;
            bc0Var.setViewPager(hwVar);
            bc0Var.setShouldExpand(false);
            bc0Var.setIndicatorHeight(org.telegram.messenger.g0.L(3.0f));
            bc0Var.setIndicatorColor(i0.a.o(z(org.telegram.ui.ActionBar.n6.Gf), 20));
            bc0Var.setUnderlineHeight(0);
            bc0Var.setTabPaddingLeftRight(org.telegram.messenger.g0.L(11.0f));
            bc0Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(11.0f));
            frameLayout3.addView(bc0Var, c8.ma.e(-2, 48, 81));
            bc0Var.setOnPageChangeListener(new kw(this, z19));
            ImageView imageView2 = new ImageView(context2);
            this.F = imageView2;
            imageView2.setImageResource(2131232743);
            imageView2.setColorFilter(new PorterDuffColorFilter(z16 ? v(0.6f) : z(org.telegram.ui.ActionBar.n6.Jf), mode));
            imageView2.setScaleType(scaleType);
            imageView2.setContentDescription(org.telegram.messenger.gd.M0(2131745641, null));
            imageView2.setFocusable(true);
            imageView2.setVisibility(8);
            frameLayout3.addView(imageView2, c8.ma.d(48, 48.0f, 83, 2.0f, 0.0f, 2.0f, 0.0f));
            imageView2.setOnClickListener(new View.OnClickListener(this) {
                public final ry f38567b;

                {
                    this.f38567b = this;
                }

                @Override
                public final void onClick(View view22) {
                    ey eyVar;
                    switch (r2) {
                        case 0:
                            qx qxVar = this.f38567b.T;
                            mx mxVar = qxVar.f38925c;
                            int childCount = mxVar.getChildCount();
                            for (int i162 = 0; i162 < childCount; i162++) {
                                ((ph.b) mxVar.getChildAt(i162)).a(false, true);
                            }
                            qxVar.d = 0L;
                            qxVar.G.f39336b.a(false, true);
                            qxVar.f();
                            return;
                        case 1:
                            my myVar = this.f38567b.A0;
                            mx mxVar2 = myVar.f37656c;
                            int childCount2 = mxVar2.getChildCount();
                            for (int i17 = 0; i17 < childCount2; i17++) {
                                ((ph.b) mxVar2.getChildAt(i17)).a(false, true);
                            }
                            myVar.d = 0L;
                            myVar.R.f39332a.a(false, true);
                            myVar.f();
                            return;
                        case 2:
                            rx rxVar = this.f38567b.f39397u1;
                            if (rxVar != null) {
                                rxVar.w();
                                return;
                            }
                            return;
                        default:
                            ry ryVar = this.f38567b;
                            int currentItem = ryVar.h.getCurrentItem();
                            if (currentItem == 0) {
                                eyVar = ryVar.W;
                            } else if (currentItem == 1) {
                                eyVar = ryVar.f39379p0;
                            } else {
                                eyVar = ryVar.H0;
                            }
                            if (eyVar != null) {
                                gq gqVar = eyVar.d;
                                gqVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                gqVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                gqVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                return;
                            }
                            return;
                    }
                }
            });
        } else {
            addView(frameLayout3, c8.ma.d(56, 48.0f, (org.telegram.messenger.gd.f24213a0 ? 3 : i11) | 80, 0.0f, 0.0f, 2.0f, 0.0f));
            org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.n6.j0(org.telegram.messenger.g0.L(56.0f), z(i15), z(i15));
            c8.ra.a(iwVar);
            iwVar.setPadding(0, 0, org.telegram.messenger.g0.L(2.0f), 0);
            iwVar.setBackground(j02);
            iwVar.setContentDescription(org.telegram.messenger.gd.M0(2131754920, null));
            iwVar.setFocusable(true);
            frameLayout3.addView(iwVar, c8.ma.d(48, 48.0f, 51, 2.0f, 0.0f, 2.0f, 0.0f));
            view2.setVisibility(8);
        }
        addView(hwVar, 0, c8.ma.e(-1, -1, 51));
        di.xb xbVar = new di.xb(context2, 24);
        this.O0 = xbVar;
        int L2 = org.telegram.messenger.g0.L(6.0f);
        int i17 = org.telegram.ui.ActionBar.n6.hg;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(L2, z(i17));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i17);
        xbVar.setBackground(d02);
        org.telegram.ui.ActionBar.u6.j(xbVar, d02, M, null, i6Var2);
        org.telegram.ui.ActionBar.u6.U(xbVar, org.telegram.ui.ActionBar.n6.f29459gg, i6Var2);
        xbVar.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(7.0f));
        char c10 = 16;
        xbVar.setGravity(16);
        xbVar.setTextSize(1, 14.0f);
        xbVar.setVisibility(4);
        addView(xbVar, c8.ma.d(-2, -2.0f, 81, 5.0f, 0.0f, 5.0f, 53.0f));
        this.D1 = org.telegram.messenger.g0.L(org.telegram.messenger.g0.Q1() ? 40.0f : 32.0f);
        Field field2 = iu.f36195f;
        iu iuVar = new iu(new hu(context2, i6Var2));
        if (iu.f36195f == null) {
            try {
                field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
                try {
                    field.setAccessible(true);
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                field = null;
            }
            iu.f36195f = field;
        }
        Field field3 = iu.f36195f;
        if (field3 != null) {
            try {
                iuVar.f36197a = (ViewTreeObserver.OnScrollChangedListener) field3.get(iuVar);
                iu.f36195f.set(iuVar, iu.f36196g);
            } catch (Exception unused3) {
                iuVar.f36197a = null;
            }
        }
        this.C1 = iuVar;
        iuVar.f36199c.setOnSelectionUpdateListener(new d(this, 11));
        this.B1 = org.telegram.messenger.mp.f1().getInt("selected_page", 0);
        HashMap hashMap = org.telegram.messenger.j6.h;
        if (!org.telegram.messenger.j6.f24818k) {
            org.telegram.messenger.j6.f24818k = true;
            SharedPreferences f12 = org.telegram.messenger.mp.f1();
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
                        String[] strArr2 = org.telegram.messenger.j6.f24822o;
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
                        org.telegram.messenger.j6.f24817j.put(split4[0], split4[1]);
                    }
                }
            } catch (Exception e11) {
                z20 = true;
                org.telegram.messenger.a8.g(e11, true);
                bxVar2 = bxVar4;
                z21 = false;
            }
        }
        bxVar2 = bxVar4;
        z21 = false;
        z20 = true;
        bxVar2.F(z21);
        J(z20, z11, z12, z21);
        if (Build.VERSION.SDK_INT >= 31) {
            dh.g gVar = new dh.g(z21);
            this.f39368k2 = gVar;
            this.f39378o2.a(gVar);
            ui.f fVar = new ui.f(null);
            fVar.f59008f = cVar;
            fVar.d = gVar;
            fVar.f59007e = -2;
            dh.c cVar4 = new dh.c(fVar, fVar, fVar);
            this.f39375n2 = cVar4;
            cVar4.f8379k = true;
            int L3 = org.telegram.messenger.g0.L(org.telegram.messenger.pc.e(262144) ? 8.0f : 48.0f);
            cVar4.d = L3;
            cVar4.f8374e = L3;
            cVar4.f8378j = this.f39378o2;
        } else {
            dh.c cVar5 = new dh.c(cVar, cVar, cVar);
            this.f39375n2 = cVar5;
            cVar5.f8378j = this.f39378o2;
            this.f39368k2 = null;
        }
        this.f39370l2 = new ih(this, 1);
        setBlurredBackgroundDrawableFactory(this.f39375n2);
        this.f39378o2.i(this);
        this.f39378o2.f56694a = new nv(this, 0);
    }

    public static void a(ry ryVar, boolean z10) {
        vv vvVar = ryVar.f39360i0;
        if (vvVar != null) {
            int childCount = vvVar.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = vvVar.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.i2) {
                    ImageReceiver photoImage = ((org.telegram.ui.Cells.i2) childAt).getPhotoImage();
                    if (z10) {
                        photoImage.f22664u0 = true;
                        photoImage.P0(false);
                    } else {
                        photoImage.f22664u0 = false;
                        photoImage.Q0();
                    }
                }
            }
        }
    }

    public static void d(ry ryVar, zx zxVar, String str) {
        String str2;
        String str3;
        boolean z10;
        String str4;
        rx rxVar;
        lc lcVar;
        org.telegram.ui.ActionBar.h2 h2Var = ryVar.Z1;
        int i7 = ryVar.f39345d1;
        ArrayList arrayList = ryVar.f39387r1;
        if (zxVar != null) {
            if (zxVar.getSpan() != null) {
                if (ryVar.f39397u1 != null) {
                    long j3 = zxVar.getSpan().documentId;
                    TLRPC.Document document = zxVar.getSpan().document;
                    fx fxVar = zxVar.f42963e;
                    if (fxVar != null && fxVar.f35177i) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (document == null) {
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            fx fxVar2 = (fx) arrayList.get(i10);
                            int i11 = 0;
                            while (true) {
                                ArrayList arrayList2 = fxVar2.f35173c;
                                if (arrayList2 != null && i11 < arrayList2.size()) {
                                    if (((TLRPC.Document) fxVar2.f35173c.get(i11)).f28409id == j3) {
                                        document = (TLRPC.Document) fxVar2.f35173c.get(i11);
                                        break;
                                    }
                                    i11++;
                                }
                            }
                        }
                    }
                    if (document == null) {
                        document = o5.e(i7, j3);
                    }
                    TLRPC.Document document2 = document;
                    if (document2 != null) {
                        str4 = org.telegram.messenger.fj.U(document2);
                    } else {
                        str4 = null;
                    }
                    if (!org.telegram.messenger.fj.m3(document2) && !org.telegram.messenger.j10.i(i7).q() && (((rxVar = ryVar.f39397u1) == null || !rxVar.g()) && !ryVar.V0 && !z10)) {
                        ryVar.N(false);
                        if (h2Var != null) {
                            lcVar = lc.b0(h2Var);
                        } else {
                            lcVar = new lc(ryVar.f39385r, ryVar.f39335a2);
                        }
                        if (!ryVar.f39362i2 && h2Var != null) {
                            lcVar.K(2131624191, org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131743626, null)), org.telegram.messenger.gd.M0(2131747624, null), new mv(ryVar, 4)).j();
                        } else {
                            lcVar.r(document2, org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131743627, null)), org.telegram.messenger.gd.M0(2131746840, null), new mv(ryVar, 3)).j();
                        }
                        ryVar.f39362i2 = !ryVar.f39362i2;
                        return;
                    }
                    ryVar.E2 = SystemClock.elapsedRealtime();
                    ryVar.N(true);
                    ryVar.h("animated_" + j3);
                    ryVar.f39397u1.x(j3, document2, str4, zxVar.f42962c);
                    return;
                }
                return;
            }
            ryVar.E2 = SystemClock.elapsedRealtime();
            ryVar.N(true);
            if (str != null) {
                str2 = str;
            } else {
                str2 = (String) zxVar.getTag();
            }
            new SpannableStringBuilder().append((CharSequence) str2);
            if (str == null) {
                if (!zxVar.f42962c && (str3 = (String) org.telegram.messenger.j6.f24817j.get(str2)) != null) {
                    str2 = g(str2, str3);
                }
                ryVar.h(str2);
                rx rxVar2 = ryVar.f39397u1;
                if (rxVar2 != null) {
                    rxVar2.l(org.telegram.messenger.j6.c(str2));
                    return;
                }
                return;
            }
            rx rxVar3 = ryVar.f39397u1;
            if (rxVar3 != null) {
                rxVar3.l(org.telegram.messenger.j6.c(str));
            }
        }
    }

    public static void e(ry ryVar, int i7, int i10) {
        v4.f1 K;
        int[] iArr = ryVar.R0;
        if (i7 == 1) {
            ryVar.n(i10, ryVar.Q);
            return;
        }
        rx rxVar = ryVar.f39397u1;
        if ((rxVar == null || !rxVar.z()) && !ryVar.K0) {
            ck0 x10 = ryVar.x(i7);
            if (i10 > 0 && x10 != null && x10.getVisibility() == 0 && (K = x10.K(0)) != null && K.f59123a.getTop() + ryVar.f39342c1 >= x10.getPaddingTop()) {
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
                ryVar.Z();
            } else {
                ryVar.y(i7).setTranslationY(Math.max(-org.telegram.messenger.g0.L(48.0f), iArr[i7]));
            }
        }
    }

    public static void f(ry ryVar, boolean z10) {
        int N0;
        wx wxVar = ryVar.f39363j0;
        xv xvVar = ryVar.f39379p0;
        vv vvVar = ryVar.f39360i0;
        if (vvVar != null && (vvVar.getAdapter() instanceof vx)) {
            vx vxVar = (vx) vvVar.getAdapter();
            if (!vxVar.f41476s && vxVar.h == 0 && !vxVar.f41479y.isEmpty() && (N0 = wxVar.N0()) != -1 && N0 > wxVar.B() - 5) {
                String str = vxVar.f41478x;
                String str2 = vxVar.f41475r;
                boolean z11 = vxVar.f41477w;
                vxVar.F(str, str2, true, z11, z11);
            }
        }
        rx rxVar = ryVar.f39397u1;
        if (rxVar != null && rxVar.z()) {
            boolean z12 = false;
            v4.f1 K = vvVar.K(0);
            if (K == null) {
                ey.a(xvVar, true, !z10);
                return;
            }
            if (K.f59123a.getTop() < vvVar.getPaddingTop()) {
                z12 = true;
            }
            ey.a(xvVar, z12, !z10);
        } else if (xvVar != null && vvVar != null) {
            xvVar.f34835a.a(true, !z10);
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
        ew ewVar = this.H0;
        if (ewVar != null) {
            ewVar.b();
        }
        xv xvVar = this.f39379p0;
        if (xvVar != null) {
            xvVar.b();
        }
        sv svVar = this.W;
        if (svVar != null) {
            svVar.b();
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
        dy dyVar;
        boolean z12;
        if (this.B1 != 0 && this.f39408x1) {
            this.B1 = 0;
        }
        if (this.B1 == 0 && this.f39404w1) {
            this.B1 = 1;
        }
        int i7 = this.B1;
        hw hwVar = this.h;
        if (i7 != 0 && !z10 && this.f39346e.size() != 1) {
            int i10 = this.B1;
            if (i10 == 1) {
                M(false, false);
                if (!this.f39399v0 && !this.f39403w0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                R(z12, false);
                if (hwVar.getCurrentItem() != 2) {
                    hwVar.x(2, false);
                }
                fw fwVar = this.C0;
                if (fwVar != null) {
                    this.T0 = true;
                    int i11 = this.H1;
                    if (i11 >= 0) {
                        fwVar.m(i11);
                    } else {
                        int i12 = this.G1;
                        if (i12 >= 0) {
                            fwVar.m(i12);
                        } else {
                            fwVar.m(this.F1);
                        }
                    }
                    this.T0 = false;
                    this.F0.h1(0, 0);
                }
            } else if (i10 == 2) {
                M(false, false);
                R(false, false);
                if (hwVar.getCurrentItem() != 1) {
                    hwVar.x(1, false);
                }
                zw zwVar = this.f39382q0;
                if (zwVar != null) {
                    zwVar.m(0);
                }
                xv xvVar = this.f39379p0;
                if (xvVar != null && (dyVar = xvVar.f34841r) != null) {
                    dyVar.I1(null);
                }
            }
        } else {
            M(true, false);
            R(false, false);
            if (hwVar.getCurrentItem() != 0) {
                hwVar.x(0, !z10);
            }
            if (z11) {
                org.telegram.messenger.g0.h3(new mv(this, 5), 350L);
            }
        }
        N(true);
    }

    public final void E() {
        jy jyVar = this.f39414z0;
        if (jyVar != null) {
            jyVar.f();
        }
        my myVar = this.A0;
        if (myVar != null) {
            myVar.f();
        }
        if (org.telegram.ui.ns.p().E) {
            org.telegram.ui.ns.p().m();
        }
        org.telegram.ui.ns.p().t();
    }

    public final void F(int i7) {
        rx rxVar = this.f39397u1;
        if ((rxVar != null && rxVar.z()) || i7 == 0) {
            return;
        }
        HorizontalScrollView y10 = y(i7);
        this.R0[i7] = 0;
        y10.setTranslationY(0);
    }

    public final void G(int i7, int i10) {
        sw swVar = this.R;
        View m10 = swVar.m(i7);
        int L0 = swVar.L0();
        int i11 = 1;
        if ((m10 == null && Math.abs(i7 - L0) > swVar.J * 9.0f) || !org.telegram.messenger.bz.c()) {
            if (swVar.L0() < i7) {
                i11 = 0;
            }
            org.telegram.ui.ActionBar.l5 l5Var = this.f39341c0;
            l5Var.f29199b = i11;
            l5Var.k(i7, i10, false, false);
            return;
        }
        this.K0 = true;
        hi.l1 l1Var = new hi.l1(1, this.Q.getContext(), this);
        l1Var.f59067a = i7;
        l1Var.f55699p = i10;
        swVar.w0(l1Var);
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
            float f12 = 1.0f - this.f39332a.f57657e;
            ew ewVar = this.H0;
            ewVar.setAlpha(f12);
            if (f12 > 0.0f) {
                i12 = 0;
            } else {
                i12 = 4;
            }
            ewVar.setVisibility(i12);
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
            this.f39411y0.invalidate();
        } else if (i7 == 1) {
            l(false);
            float f14 = 1.0f - this.f39336b.f57657e;
            sv svVar = this.W;
            svVar.setAlpha(f14);
            if (f14 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            svVar.setVisibility(i10);
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
        bw bwVar = this.F0;
        View m10 = bwVar.m(i7);
        int L0 = bwVar.L0();
        int i11 = 1;
        if (m10 == null && Math.abs(i7 - L0) > 40) {
            if (bwVar.L0() < i7) {
                i11 = 0;
            }
            org.telegram.ui.ActionBar.l5 l5Var = this.f39337b0;
            l5Var.f29199b = i11;
            l5Var.k(i7, i10, false, false);
            return;
        }
        this.K0 = true;
        this.E0.y0(i7);
    }

    public final void J(boolean z10, boolean z11, boolean z12, boolean z13) {
        ArrayList arrayList = this.f39346e;
        arrayList.clear();
        boolean z14 = false;
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.d;
            if (i7 >= arrayList2.size()) {
                break;
            }
            if (((ny) arrayList2.get(i7)).f37873a == 0 && z10) {
                arrayList.add((ny) arrayList2.get(i7));
            }
            if (((ny) arrayList2.get(i7)).f37873a == 1 && z12) {
                arrayList.add((ny) arrayList2.get(i7));
            }
            if (((ny) arrayList2.get(i7)).f37873a == 2 && z11) {
                arrayList.add((ny) arrayList2.get(i7));
            }
            i7++;
        }
        bc0 bc0Var = this.f39406x;
        if (bc0Var != null) {
            if (arrayList.size() > 1) {
                z14 = true;
            }
            org.telegram.messenger.g0.X3(bc0Var, z14, 1.0f, true, z13);
        }
        hw hwVar = this.h;
        if (hwVar != null) {
            hwVar.setAdapter(null);
            hwVar.setAdapter(this.M0);
            if (bc0Var != null) {
                bc0Var.setViewPager(hwVar);
            }
        }
    }

    public final void K(final ph.a aVar, final TLObject tLObject, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final boolean z10, boolean z11) {
        String G;
        my myVar;
        qx qxVar;
        if (stickerSet != null) {
            if (!z10 || (qxVar = this.T) == null || qxVar.d == stickerSet.f28430id) {
                if (!z10 && (myVar = this.A0) != null && myVar.d != stickerSet.f28430id) {
                    return;
                }
                final boolean E0 = org.telegram.messenger.ri.d0(this.f39345d1).E0(stickerSet.f28430id, true);
                if (E0) {
                    if (stickerSet.masks) {
                        G = org.telegram.messenger.gd.G(stickerSet.count, "RemoveManyMasksCount", new Object[0]);
                    } else if (stickerSet.emojis) {
                        G = org.telegram.messenger.gd.G(stickerSet.count, "RemoveManyEmojiCount", new Object[0]);
                    } else {
                        G = org.telegram.messenger.gd.G(stickerSet.count, "RemoveManyStickersCount", new Object[0]);
                    }
                } else if (stickerSet.masks) {
                    G = org.telegram.messenger.gd.G(stickerSet.count, "AddManyMasksCount", new Object[0]);
                } else if (stickerSet.emojis) {
                    G = org.telegram.messenger.gd.G(stickerSet.count, "AddManyEmojiCount", new Object[0]);
                } else {
                    G = org.telegram.messenger.gd.G(stickerSet.count, "AddManyStickersCount", new Object[0]);
                }
                aVar.i(G, z11, true);
                aVar.m0.a(!E0, z11);
                aVar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        int i7;
                        ry ryVar = ry.this;
                        org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(ryVar.f39345d1);
                        Context context = ryVar.getContext();
                        if (E0) {
                            i7 = 0;
                        } else {
                            i7 = 2;
                        }
                        int i10 = i7;
                        org.telegram.ui.ActionBar.h2 h2Var = ryVar.Z1;
                        FrameLayout frameLayout = ryVar.f39389s;
                        ph.a aVar2 = aVar;
                        TLObject tLObject2 = tLObject;
                        TLRPC.StickerSet stickerSet2 = stickerSet;
                        TLRPC.Document document2 = document;
                        boolean z12 = z10;
                        d02.l2(context, tLObject2, document2, i10, h2Var, frameLayout, false, true, new di.o3(ryVar, aVar2, tLObject2, stickerSet2, document2, z12), false);
                        ryVar.K(aVar2, tLObject2, stickerSet2, document2, z12, true);
                    }
                });
            }
        }
    }

    public final void L(long j3, boolean z10, boolean z11) {
        int i7;
        View childAt;
        float f10;
        bc0 bc0Var = this.f39406x;
        if (bc0Var != null) {
            this.f39404w1 = z10;
            this.f39408x1 = z11;
            if (!z11 && !z10) {
                this.f39400v1 = 0L;
            } else {
                this.f39400v1 = j3;
            }
            if (z11) {
                i7 = 2;
            } else {
                i7 = 0;
            }
            LinearLayout linearLayout = bc0Var.d;
            if (i7 >= linearLayout.getChildCount()) {
                childAt = null;
            } else {
                childAt = linearLayout.getChildAt(i7);
            }
            if (childAt != null) {
                if (this.f39400v1 != 0) {
                    f10 = 0.15f;
                } else {
                    f10 = 1.0f;
                }
                childAt.setAlpha(f10);
                hw hwVar = this.h;
                if (z11) {
                    if (this.f39400v1 != 0 && hwVar.getCurrentItem() != 0) {
                        M(true, true);
                        R(false, true);
                        hwVar.x(0, false);
                    }
                } else if (this.f39400v1 != 0 && hwVar.getCurrentItem() != 1) {
                    M(false, true);
                    R(false, true);
                    hwVar.x(1, false);
                }
            }
        }
    }

    public final void M(boolean z10, boolean z11) {
        float f10;
        float f11;
        float f12;
        float f13;
        iw iwVar = this.f39410y;
        if (!z10 || iwVar.getTag() != null) {
            if ((!z10 && iwVar.getTag() != null) || this.f39381p2) {
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
            iwVar.setTag(num);
            int i7 = 0;
            float f14 = 0.0f;
            if (z11) {
                if (z10) {
                    iwVar.setVisibility(0);
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.G = animatorSet2;
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(iwVar, View.ALPHA, f12);
                if (z10) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(iwVar, View.SCALE_X, f13);
                if (z10) {
                    f14 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(iwVar, View.SCALE_Y, f14));
                this.G.setDuration(200L);
                this.G.setInterpolator(lr.f37209g);
                this.G.addListener(new ow(this, z10, 0));
                this.G.start();
                return;
            }
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            iwVar.setAlpha(f10);
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            iwVar.setScaleX(f11);
            if (z10) {
                f14 = 1.0f;
            }
            iwVar.setScaleY(f14);
            if (!z10) {
                i7 = 4;
            }
            iwVar.setVisibility(i7);
        }
    }

    public final void N(boolean z10) {
        Integer num;
        this.I = 0.0f;
        rx rxVar = this.f39397u1;
        if (rxVar != null && rxVar.z()) {
            z10 = false;
        }
        FrameLayout frameLayout = this.f39373n;
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
            AnimatorSet animatorSet = this.f39333a0;
            Integer num = null;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f39333a0 = null;
            }
            if (!z10) {
                num = 1;
            }
            view.setTag(num);
            float f10 = 0.0f;
            if (z11) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f39333a0 = animatorSet2;
                if (z10) {
                    f10 = 1.0f;
                }
                animatorSet2.playTogether(ObjectAnimator.ofFloat(view, View.ALPHA, f10));
                this.f39333a0.setDuration(200L);
                this.f39333a0.setInterpolator(lr.f37209g);
                this.f39333a0.addListener(new x(this, 25));
                this.f39333a0.start();
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
        TLRPC.Chat O0 = org.telegram.messenger.mp.u1(this.f39345d1).O0(Long.valueOf(this.f39400v1));
        if (O0 != null) {
            di.xb xbVar = this.O0;
            if (z10) {
                if (!org.telegram.messenger.v3.N(O0) && (tL_chatBannedRights = O0.default_banned_rights) != null && (tL_chatBannedRights.send_stickers || (z11 && tL_chatBannedRights.send_plain))) {
                    org.telegram.ui.ActionBar.h2 h2Var = this.Z1;
                    if (!(h2Var instanceof org.telegram.ui.bn) || !((org.telegram.ui.bn) h2Var).Z6()) {
                        if (z11) {
                            xbVar.setText(org.telegram.messenger.gd.M0(2131749371, null));
                        } else if (z12) {
                            xbVar.setText(org.telegram.messenger.gd.M0(2131749370, null));
                        } else {
                            xbVar.setText(org.telegram.messenger.gd.M0(2131749364, null));
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
                            xbVar.setText(org.telegram.messenger.gd.M0(2131753941, null));
                        } else if (z12) {
                            xbVar.setText(org.telegram.messenger.gd.M0(2131753967, null));
                        } else {
                            xbVar.setText(org.telegram.messenger.gd.M0(2131753932, null));
                        }
                    } else {
                        if (z11) {
                            xbVar.setText(org.telegram.messenger.gd.a0("AttachPlainRestricted", null, 2131753942, org.telegram.messenger.gd.v(O0.banned_rights.until_date)));
                        }
                        if (z12) {
                            xbVar.setText(org.telegram.messenger.gd.a0("AttachGifRestricted", null, 2131753968, org.telegram.messenger.gd.v(O0.banned_rights.until_date)));
                        } else {
                            xbVar.setText(org.telegram.messenger.gd.a0("AttachStickersRestricted", null, 2131753933, org.telegram.messenger.gd.v(O0.banned_rights.until_date)));
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
            this.Q2.setInterpolator(lr.h);
            this.Q2.start();
        }
    }

    public final void R(boolean z10, boolean z11) {
        float f10;
        float f11;
        float f12;
        float f13;
        ImageView imageView = this.E;
        if (imageView != null && !this.f39384q2) {
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
                        this.H.setInterpolator(lr.f37209g);
                        this.H.addListener(new ow(this, z10, 1));
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
        org.telegram.ui.ActionBar.h2 h2Var;
        View view = (View) getParent();
        if (view != null) {
            float y10 = getY();
            if (getLayoutParams().height > 0) {
                measuredHeight = getLayoutParams().height;
            } else {
                measuredHeight = getMeasuredHeight();
            }
            float f10 = y10 + measuredHeight;
            if ((!org.telegram.messenger.g0.E && ((h2Var = this.Z1) == null || !h2Var.isInBubbleMode())) || this.W0) {
                L = view.getHeight();
            } else {
                L = org.telegram.messenger.g0.L(1.0f);
            }
            float f11 = f10 - L;
            int i7 = (this.f39392s2 > 0.0f ? 1 : (this.f39392s2 == 0.0f ? 0 : -1));
            FrameLayout frameLayout = this.f39373n;
            if (i7 >= 0) {
                f11 += getMeasuredHeight() - this.f39392s2;
            } else if (frameLayout.getTop() - f11 < 0.0f || !this.f39413y2) {
                f11 = 0.0f;
            }
            float W1 = (-f11) + org.telegram.messenger.g0.W1(this.F2.f57657e, org.telegram.messenger.g0.L(50.0f), -this.f39388r2);
            frameLayout.setTranslationY(W1);
            if (this.f39347e0) {
                this.f39385r.setTranslationY(W1);
            }
        }
    }

    public final void T() {
        ey eyVar;
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
        hv hvVar;
        int z21;
        int z22;
        int z23;
        int z24;
        int z25;
        int z26;
        boolean z27 = this.f39399v0;
        View view = this.f39402w;
        if (!z27) {
            setBackground(null);
            view.setBackground(null);
        } else if (!org.telegram.messenger.g0.E && !this.O1) {
            int i7 = org.telegram.ui.ActionBar.n6.f29814zf;
            setBackgroundColor(z(i7));
            if (this.f39347e0) {
                view.setBackgroundColor(z(i7));
            }
        } else {
            Drawable background = getBackground();
            int z28 = z(org.telegram.ui.ActionBar.n6.f29814zf);
            if (background != null && (background != this.H2 || z28 != this.I2)) {
                this.H2 = background;
                this.I2 = z28;
                background.setColorFilter(new PorterDuffColorFilter(z28, PorterDuff.Mode.MULTIPLY));
            }
        }
        ww wwVar = this.J;
        if (wwVar != null) {
            if (this.f39399v0) {
                wwVar.setBackgroundColor(z(org.telegram.ui.ActionBar.n6.f29814zf));
                this.P.setBackgroundColor(z(org.telegram.ui.ActionBar.n6.Cf));
            } else {
                wwVar.setBackground(null);
            }
        }
        iu iuVar = this.C1;
        if (iuVar != null) {
            iuVar.f36199c.a();
        }
        int i10 = 0;
        while (true) {
            eyVar = this.W;
            z10 = this.f39365j2;
            if (i10 >= 3) {
                break;
            }
            if (i10 == 0) {
                eyVar = this.H0;
            } else if (i10 != 1) {
                eyVar = this.f39379p0;
            }
            if (eyVar != null) {
                gq gqVar = eyVar.d;
                FrameLayout frameLayout = eyVar.f34840n;
                View view2 = eyVar.f34839f;
                if (this.f39399v0) {
                    view2.setBackgroundColor(z(org.telegram.ui.ActionBar.n6.f29814zf));
                } else {
                    view2.setBackground(null);
                }
                eyVar.f34838e.setBackgroundColor(z(org.telegram.ui.ActionBar.n6.Cf));
                sl0 sl0Var = eyVar.f34837c;
                if (z10) {
                    z23 = v(0.4f);
                } else {
                    z23 = z(org.telegram.ui.ActionBar.n6.Bf);
                }
                sl0Var.a(z23);
                Drawable background2 = frameLayout.getBackground();
                if (z10) {
                    z24 = v(0.06f);
                } else {
                    z24 = z(org.telegram.ui.ActionBar.n6.Af);
                }
                org.telegram.ui.ActionBar.n6.C1(z24, background2);
                frameLayout.invalidate();
                if (z10) {
                    z25 = v(0.45f);
                } else {
                    z25 = z(org.telegram.ui.ActionBar.n6.Bf);
                }
                gqVar.setHintTextColor(z25);
                if (z10) {
                    z26 = v(0.8f);
                } else {
                    z26 = z(org.telegram.ui.ActionBar.n6.G6);
                }
                gqVar.setTextColor(z26);
            }
            i10++;
        }
        Paint paint = this.f39394t1;
        if (paint != null) {
            paint.setColor(z(org.telegram.ui.ActionBar.n6.Sf));
        }
        ex exVar = this.Q;
        if (exVar != null) {
            exVar.setGlowColor(z(org.telegram.ui.ActionBar.n6.f29814zf));
        }
        aw awVar = this.E0;
        if (awVar != null) {
            awVar.setGlowColor(z(org.telegram.ui.ActionBar.n6.f29814zf));
        }
        fw fwVar = this.C0;
        if (fwVar != null) {
            fwVar.setIndicatorColor(z(org.telegram.ui.ActionBar.n6.If));
            fwVar.setUnderlineColor(z(org.telegram.ui.ActionBar.n6.Cf));
            if (this.f39399v0) {
                fwVar.setBackgroundColor(z(org.telegram.ui.ActionBar.n6.f29814zf));
            } else {
                fwVar.setBackground(null);
            }
        }
        zw zwVar = this.f39382q0;
        if (zwVar != null) {
            zwVar.setIndicatorColor(z(org.telegram.ui.ActionBar.n6.If));
            zwVar.setUnderlineColor(z(org.telegram.ui.ActionBar.n6.Cf));
            if (this.f39399v0) {
                zwVar.setBackgroundColor(z(org.telegram.ui.ActionBar.n6.f29814zf));
            } else {
                zwVar.setBackground(null);
            }
        }
        if (z10) {
            z11 = v(0.6f);
        } else {
            z11 = z(org.telegram.ui.ActionBar.n6.Jf);
        }
        if (z11 != this.J2) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.J2 = z11;
        iw iwVar = this.f39410y;
        if (iwVar != null) {
            if (z12) {
                iwVar.setColorFilter(new PorterDuffColorFilter(z11, PorterDuff.Mode.MULTIPLY));
            }
            if (eyVar == null) {
                Drawable background3 = iwVar.getBackground();
                int i11 = org.telegram.ui.ActionBar.n6.f29814zf;
                org.telegram.ui.ActionBar.n6.H1(background3, z(i11), false);
                org.telegram.ui.ActionBar.n6.H1(iwVar.getBackground(), z(i11), true);
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
                ((ShapeDrawable) xbVar.getBackground()).getPaint().setColor(z(org.telegram.ui.ActionBar.n6.hg));
                xbVar.invalidate();
            }
            xbVar.setTextColor(z(org.telegram.ui.ActionBar.n6.f29459gg));
        }
        vx vxVar = this.f39366k0;
        if (vxVar != null) {
            xx xxVar = vxVar.f41472e;
            int i12 = org.telegram.ui.ActionBar.n6.Df;
            int z29 = z(i12);
            if (z29 != this.K2) {
                this.K2 = z29;
                xxVar.f42205a.setColorFilter(new PorterDuffColorFilter(z29, PorterDuff.Mode.MULTIPLY));
            }
            xxVar.f42206b.setTextColor(z(i12));
            xxVar.f42207c.setProgressColor(z(org.telegram.ui.ActionBar.n6.f29468h6));
        }
        int z30 = z(org.telegram.ui.ActionBar.n6.Fi);
        if (this.f39353f2 == null || z30 != this.L2) {
            this.L2 = z30;
            this.f39353f2 = new PorterDuffColorFilter(z30, PorterDuff.Mode.SRC_IN);
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
                z21 = z(org.telegram.ui.ActionBar.n6.Ff);
            }
            org.telegram.ui.ActionBar.n6.E1(drawable, z21, false);
            Drawable drawable2 = drawableArr[i13];
            if (z10) {
                z22 = v(0.8f);
            } else {
                z22 = z(org.telegram.ui.ActionBar.n6.Gf);
            }
            org.telegram.ui.ActionBar.n6.E1(drawable2, z22, true);
            i13++;
        }
        if (wwVar != null && (hvVar = wwVar.E) != null) {
            hvVar.d();
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
                z19 = z(org.telegram.ui.ActionBar.n6.Ef);
            }
            org.telegram.ui.ActionBar.n6.E1(drawable3, z19, false);
            Drawable drawable4 = drawableArr2[i14];
            if (z10) {
                z20 = v(0.8f);
            } else {
                z20 = z(org.telegram.ui.ActionBar.n6.Gf);
            }
            org.telegram.ui.ActionBar.n6.E1(drawable4, z20, true);
            i14++;
        }
        int i15 = 0;
        while (true) {
            Drawable[] drawableArr3 = this.f39334a1;
            if (i15 >= drawableArr3.length) {
                break;
            }
            Drawable drawable5 = drawableArr3[i15];
            if (z10) {
                z17 = v(0.4f);
            } else {
                z17 = z(org.telegram.ui.ActionBar.n6.Ef);
            }
            org.telegram.ui.ActionBar.n6.E1(drawable5, z17, false);
            Drawable drawable6 = drawableArr3[i15];
            if (z10) {
                z18 = v(0.8f);
            } else {
                z18 = z(org.telegram.ui.ActionBar.n6.Gf);
            }
            org.telegram.ui.ActionBar.n6.E1(drawable6, z18, true);
            i15++;
        }
        org.telegram.ui.ActionBar.w5 w5Var = this.f39339b2;
        if (w5Var != null) {
            if (z10) {
                z15 = v(0.4f);
            } else {
                z15 = z(org.telegram.ui.ActionBar.n6.Ff);
            }
            org.telegram.ui.ActionBar.n6.E1(w5Var, z15, false);
            if (z10) {
                z16 = v(0.8f);
            } else {
                z16 = z(org.telegram.ui.ActionBar.n6.Gf);
            }
            org.telegram.ui.ActionBar.n6.E1(w5Var, z16, true);
        }
        org.telegram.ui.ActionBar.w5 w5Var2 = this.f39343c2;
        if (w5Var2 != null) {
            if (z10) {
                z13 = v(0.4f);
            } else {
                z13 = z(org.telegram.ui.ActionBar.n6.If);
            }
            org.telegram.ui.ActionBar.n6.E1(w5Var2, z13, false);
            if (z10) {
                z14 = v(0.8f);
            } else {
                z14 = z(org.telegram.ui.ActionBar.n6.If);
            }
            org.telegram.ui.ActionBar.n6.E1(w5Var2, z14, true);
        }
    }

    public final void U() {
        ex exVar = this.Q;
        if (exVar != null) {
            for (int i7 = 0; i7 < exVar.getChildCount(); i7++) {
                View childAt = exVar.getChildAt(i7);
                if (childAt instanceof jx) {
                    ((jx) childAt).a(true);
                }
            }
        }
    }

    public final void V(int i7) {
        int i10;
        if (!this.f39354g0) {
            int i11 = -1;
            if (i7 != -1) {
                int size = getRecentEmoji().size() + (this.f39347e0 ? 1 : 0);
                bx bxVar = this.S;
                int i12 = bxVar.f33801c;
                ArrayList arrayList = bxVar.f33809y;
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
                        String[][] strArr = org.telegram.messenger.k6.f24991f;
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
                        ArrayList<fx> emojipacks = getEmojipacks();
                        int size2 = arrayList.size() - 1;
                        while (true) {
                            if (size2 < 0) {
                                break;
                            } else if (((Integer) arrayList.get(size2)).intValue() <= i7) {
                                fx fxVar = (fx) this.f39387r1.get(size2);
                                while (i13 < emojipacks.size()) {
                                    long j3 = emojipacks.get(i13).f35172b.f28430id;
                                    long j10 = fxVar.f35172b.f28430id;
                                    if (j3 == j10 && (!fxVar.f35176g || (!fxVar.f35175f && !this.f39383q1.contains(Long.valueOf(j10))))) {
                                        char[] cArr = org.telegram.messenger.k6.f24987a;
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
        dy dyVar;
        int i10;
        boolean z12;
        boolean z13;
        zw zwVar = this.f39382q0;
        int currentPosition = zwVar.getCurrentPosition();
        int i11 = this.f39390s0;
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
        boolean isEmpty = this.f39364j1.isEmpty();
        zwVar.d(false);
        this.f39390s0 = -2;
        this.f39393t0 = -2;
        this.f39396u0 = -2;
        Drawable[] drawableArr = this.f39334a1;
        if (!isEmpty) {
            this.f39390s0 = 0;
            zwVar.b(0, drawableArr[0]).setContentDescription(org.telegram.messenger.gd.M0(2131746169, null));
            i7 = 1;
        } else {
            i7 = 0;
        }
        this.f39393t0 = i7;
        zwVar.b(1, drawableArr[1]).setContentDescription(org.telegram.messenger.gd.M0(2131750823, null));
        this.f39396u0 = i7 + 1;
        org.telegram.messenger.g0.L(13.0f);
        org.telegram.messenger.g0.L(11.0f);
        int i12 = this.f39345d1;
        ArrayList arrayList = org.telegram.messenger.mp.u1(i12).f25636e4;
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            String str = (String) arrayList.get(i13);
            org.telegram.messenger.f6 g10 = org.telegram.messenger.j6.g(str);
            if (g10 != null) {
                TLRPC.Document V = org.telegram.messenger.ri.d0(i12).V(str);
                String i14 = i5.c.i(i13 + 3, "tab");
                int i15 = zwVar.f34764y;
                zwVar.f34764y = i15 + 1;
                pv0 pv0Var = (pv0) zwVar.f34752n.get(i14);
                if (pv0Var != null) {
                    zwVar.g(i14, pv0Var, i15);
                    i10 = currentPosition;
                    z12 = z11;
                } else {
                    i10 = currentPosition;
                    z12 = z11;
                    pv0Var = new pv0(zwVar.getContext(), 2);
                    pv0Var.setFocusable(true);
                    pv0Var.setOnClickListener(new xk0(zwVar, 2));
                    pv0Var.setExpanded(zwVar.f34746g0);
                    pv0Var.a(zwVar.f34749j0);
                    zwVar.f34742e.addView(pv0Var, i15);
                }
                pv0Var.d = false;
                pv0Var.setTag(2131296461, Integer.valueOf(i15));
                pv0Var.setTag(2131296591, g10);
                pv0Var.setTag(2131296585, V);
                if (i15 == zwVar.E) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                pv0Var.setSelected(z13);
                zwVar.h.put(i14, pv0Var);
                pv0Var.setContentDescription(str);
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
        zwVar.h();
        zwVar.q();
        if (z10 && isEmpty) {
            zwVar.m(this.f39393t0);
            xv xvVar = this.f39379p0;
            if (xvVar != null && (dyVar = xvVar.f34841r) != null) {
                dyVar.I1(null);
                return;
            }
            return;
        }
        WeakHashMap weakHashMap = r0.i0.f56244a;
        if (zwVar.isLaidOut()) {
            if (!isEmpty && !z14) {
                zwVar.k(i16 + 1, 0);
            } else if (isEmpty && z14) {
                zwVar.k(i16 - 1, 0);
            }
        }
    }

    public final void X() {
        vx vxVar;
        int size = this.f39364j1.size();
        long p10 = org.telegram.messenger.ri.p(Integer.MAX_VALUE, this.f39364j1);
        ArrayList arrayList = new ArrayList(org.telegram.messenger.ri.d0(this.f39345d1).f26619j0);
        this.f39364j1 = arrayList;
        long p11 = org.telegram.messenger.ri.p(Integer.MAX_VALUE, arrayList);
        if ((this.f39382q0 != null && size == 0 && !this.f39364j1.isEmpty()) || (size != 0 && this.f39364j1.isEmpty())) {
            W();
        }
        if ((size != this.f39364j1.size() || p10 != p11) && (vxVar = this.f39376o0) != null) {
            vxVar.f();
        }
    }

    public final void Y(boolean z10) {
        boolean z11;
        TLRPC.Document document;
        boolean z12;
        int i7;
        boolean z13;
        org.telegram.ui.ActionBar.i6 i6Var;
        boolean z14;
        boolean z15;
        ArrayList<TLRPC.Document> arrayList;
        boolean z16;
        ArrayList<TLRPC.Document> arrayList2;
        TLRPC.StickerSet stickerSet;
        int i10;
        fw fwVar = this.C0;
        if (fwVar != null) {
            org.telegram.ui.d61 d61Var = fwVar.f34742e;
            if (fwVar.f34759s != null) {
                return;
            }
            this.G1 = -2;
            this.H1 = -2;
            this.I1 = -2;
            this.J1 = -2;
            int i11 = 0;
            this.f39351f0 = false;
            this.F1 = 0;
            int currentPosition = fwVar.getCurrentPosition();
            if (getParent() != null && getVisibility() == 0 && (this.f39415z1.size() != 0 || this.A1.size() != 0)) {
                z11 = true;
            } else {
                z11 = false;
            }
            fwVar.d(z11);
            int i12 = this.f39345d1;
            org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i12);
            SharedPreferences sharedPreferences = org.telegram.messenger.mp.u1(i12).i7;
            ArrayList arrayList3 = this.n1;
            arrayList3.clear();
            ArrayList arrayList4 = d02.f26639t0[0];
            int size = arrayList4.size();
            for (int i13 = 0; i13 < size; i13++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList4.get(i13);
                if (!d02.E0(stickerSetCovered.set.f28430id, true)) {
                    arrayList3.add(stickerSetCovered);
                }
            }
            py pyVar = this.G0;
            if (pyVar != null) {
                pyVar.f();
            }
            boolean isEmpty = arrayList4.isEmpty();
            long j3 = 0;
            Drawable[] drawableArr = this.Z0;
            org.telegram.ui.ActionBar.i6 i6Var2 = null;
            if (!isEmpty && (arrayList3.isEmpty() || sharedPreferences.getLong("featured_hidden", 0L) == ((TLRPC.StickerSetCovered) arrayList4.get(0)).set.f28430id)) {
                if (d02.f26643v0[0].isEmpty()) {
                    i10 = 2;
                } else {
                    i10 = 3;
                }
                pv0 c10 = fwVar.c(i10, drawableArr[i10]);
                c10.h.setText(org.telegram.messenger.gd.M0(2131750820, null));
                c10.setContentDescription(org.telegram.messenger.gd.M0(2131750822, null));
                int i14 = this.F1;
                this.I1 = i14;
                this.F1 = i14 + 1;
            }
            if (!this.l1.isEmpty()) {
                int i15 = this.F1;
                this.H1 = i15;
                this.F1 = i15 + 1;
                pv0 c11 = fwVar.c(1, drawableArr[1]);
                c11.h.setText(org.telegram.messenger.gd.M0(2131750827, null));
                c11.setContentDescription(org.telegram.messenger.gd.M0(2131750830, null));
            }
            if (!this.f39367k1.isEmpty()) {
                int i16 = this.F1;
                this.G1 = i16;
                this.F1 = i16 + 1;
                pv0 c12 = fwVar.c(0, drawableArr[0]);
                c12.h.setText(org.telegram.messenger.gd.M0(2131746168, null));
                c12.setContentDescription(org.telegram.messenger.gd.M0(2131746169, null));
            }
            ArrayList arrayList5 = this.f39348e1;
            arrayList5.clear();
            this.f39361i1 = null;
            this.f39355g1 = -1;
            this.f39352f1 = -10;
            if (this.G2 == null || z10) {
                this.G2 = new ArrayList(d02.u0(0));
            }
            ArrayList arrayList6 = this.G2;
            int i17 = 0;
            while (true) {
                TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.f39412y1;
                if (i17 >= stickerSetCoveredArr.length) {
                    break;
                }
                TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCoveredArr[i17];
                long j10 = j3;
                if (stickerSetCovered2 != null) {
                    TLRPC.TL_messages_stickerSet q02 = d02.q0(stickerSetCovered2.set.f28430id);
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
            ArrayList y02 = org.telegram.messenger.mp.u1(i12).y0(arrayList6);
            for (int i18 = 0; i18 < y02.size(); i18++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) y02.get(i18);
                TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet2.set;
                if ((stickerSet2 == null || !stickerSet2.archived) && (arrayList2 = tL_messages_stickerSet2.documents) != null && !arrayList2.isEmpty()) {
                    arrayList5.add(tL_messages_stickerSet2);
                }
            }
            if (this.K1 != null) {
                long j12 = org.telegram.messenger.mp.u1(i12).i7.getLong("group_hide_stickers_" + this.K1.f28404id, -1L);
                TLRPC.Chat O0 = org.telegram.messenger.mp.u1(i12).O0(Long.valueOf(this.K1.f28404id));
                if (O0 != null && this.K1.stickerset != null && org.telegram.messenger.v3.N(O0)) {
                    TLRPC.StickerSet stickerSet3 = this.K1.stickerset;
                    if (stickerSet3 != null) {
                        if (j12 == stickerSet3.f28430id) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        this.f39358h1 = z16;
                    }
                } else {
                    if (j12 != -1) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    this.f39358h1 = z15;
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
                        if (this.f39358h1) {
                            this.f39352f1 = arrayList5.size();
                            arrayList5.add(tL_messages_stickerSet3);
                        } else {
                            this.f39352f1 = 0;
                            arrayList5.add(0, tL_messages_stickerSet3);
                        }
                        if (!this.K1.can_set_stickers) {
                            tL_messages_stickerSet3 = null;
                        }
                        this.f39361i1 = tL_messages_stickerSet3;
                    }
                } else if (chatFull.can_set_stickers) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = new TLRPC.TL_messages_stickerSet();
                    if (this.f39358h1) {
                        this.f39352f1 = arrayList5.size();
                        arrayList5.add(tL_messages_stickerSet4);
                    } else {
                        this.f39352f1 = 0;
                        arrayList5.add(0, tL_messages_stickerSet4);
                    }
                }
            }
            int i19 = 0;
            while (i19 < arrayList5.size()) {
                if (i19 == this.f39352f1) {
                    TLRPC.Chat O02 = org.telegram.messenger.mp.u1(i12).O0(Long.valueOf(this.K1.f28404id));
                    if (O02 == null) {
                        arrayList5.remove(i11);
                        i19--;
                    } else {
                        this.f39351f0 = true;
                        String str = "chat" + O02.f28403id;
                        int i20 = fwVar.f34764y;
                        fwVar.f34764y = i20 + 1;
                        pv0 pv0Var = (pv0) fwVar.f34752n.get(str);
                        if (pv0Var != null) {
                            fwVar.g(str, pv0Var, i20);
                        } else {
                            pv0Var = new pv0(fwVar.getContext(), i11);
                            pv0Var.setFocusable(true);
                            pv0Var.setOnClickListener(new xk0(fwVar, i11));
                            d61Var.addView(pv0Var, i20);
                            pv0Var.f38577x = true;
                            b9 b9Var = new b9(i6Var2);
                            b9Var.u(org.telegram.messenger.g0.L(14.0f));
                            b9Var.q(O02);
                            int i21 = fwVar.f34735a;
                            q9 q9Var = pv0Var.f38571e;
                            q9Var.setLayerNum(i21);
                            q9Var.f(O02, b9Var);
                            q9Var.setAspectFit(true);
                            pv0Var.setExpanded(fwVar.f34746g0);
                            pv0Var.a(fwVar.f34749j0);
                            pv0Var.h.setText(O02.title);
                        }
                        pv0Var.d = true;
                        pv0Var.setTag(2131296461, Integer.valueOf(i20));
                        if (i20 == fwVar.E) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        pv0Var.setSelected(z14);
                        fwVar.h.put(str, pv0Var);
                    }
                    i7 = 0;
                    i6Var = null;
                } else {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet5 = (TLRPC.TL_messages_stickerSet) arrayList5.get(i19);
                    TLRPC.StickerSet stickerSet5 = tL_messages_stickerSet5.set;
                    if (stickerSet5 != null && stickerSet5.thumb_document_id != j11) {
                        for (int i22 = 0; i22 < tL_messages_stickerSet5.documents.size(); i22++) {
                            document = tL_messages_stickerSet5.documents.get(i22);
                            if (document != null && tL_messages_stickerSet5.set.thumb_document_id == document.f28409id) {
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
                    String str2 = "set" + tL_messages_stickerSet5.set.f28430id;
                    int i23 = fwVar.f34764y;
                    fwVar.f34764y = i23 + 1;
                    pv0 pv0Var2 = (pv0) fwVar.f34752n.get(str2);
                    if (pv0Var2 != null) {
                        fwVar.g(str2, pv0Var2, i23);
                    } else {
                        pv0Var2 = new pv0(fwVar.getContext(), 0);
                        pv0Var2.setFocusable(true);
                        pv0Var2.setOnClickListener(new xk0(fwVar, 1));
                        pv0Var2.setExpanded(fwVar.f34746g0);
                        pv0Var2.a(fwVar.f34749j0);
                        d61Var.addView(pv0Var2, i23);
                    }
                    pv0Var2.f38571e.setLayerNum(fwVar.f34735a);
                    i7 = 0;
                    pv0Var2.d = false;
                    pv0Var2.setTag(w10);
                    pv0Var2.setTag(2131296461, Integer.valueOf(i23));
                    pv0Var2.setTag(2131296591, tL_messages_stickerSet5);
                    pv0Var2.setTag(2131296585, document);
                    if (i23 == fwVar.E) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    pv0Var2.setSelected(z13);
                    fwVar.h.put(str2, pv0Var2);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(tL_messages_stickerSet5.set.title);
                    sb2.append(", ");
                    i6Var = null;
                    sb2.append(org.telegram.messenger.gd.M0(2131754757, null));
                    pv0Var2.setContentDescription(sb2.toString());
                }
                i19++;
                i11 = i7;
                i6Var2 = i6Var;
            }
            fwVar.h();
            fwVar.q();
            if (currentPosition != 0) {
                fwVar.k(currentPosition, currentPosition);
            }
            o();
        }
    }

    public final void Z() {
        boolean z10;
        int i7;
        gw gwVar = this.D0;
        fw fwVar = this.C0;
        if (fwVar != null && gwVar == null && this.f39397u1 != null) {
            fwVar.setTranslationY(this.f39397u1.p() * (-org.telegram.messenger.g0.L(50.0f)));
        }
        if (gwVar == null) {
            return;
        }
        if (getVisibility() == 0 && this.L0 && this.f39397u1.p() != 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        gwVar.setVisibility(i7);
        if (z10) {
            Rect rect = this.f39416z2;
            rect.setEmpty();
            this.h.getChildVisibleRect(this.f39411y0, rect, null);
            float p10 = this.f39397u1.p() * org.telegram.messenger.g0.L(50.0f);
            int i10 = rect.left;
            if (i10 != 0 || p10 != 0.0f) {
                this.Y1 = false;
            }
            gwVar.setTranslationX(i10);
            float translationY = (((getTranslationY() + getTop()) - gwVar.getTop()) - fwVar.getExpandedOffset()) - p10;
            if (gwVar.getTranslationY() != translationY) {
                gwVar.setTranslationY(translationY);
                gwVar.invalidate();
            }
        }
        if (this.Y1 && z10 && this.Q0) {
            fwVar.i(true, this.X1);
            return;
        }
        this.Y1 = false;
        fwVar.i(false, this.X1);
    }

    public final void a0() {
        int i7;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        LongSparseArray longSparseArray = this.A1;
        LongSparseArray longSparseArray2 = this.f39415z1;
        int i10 = this.f39345d1;
        aw awVar = this.E0;
        if (awVar != null) {
            try {
                int childCount = awVar.getChildCount();
                int i11 = 0;
                int i12 = 0;
                while (i12 < childCount) {
                    View childAt = awVar.getChildAt(i12);
                    if (!(childAt instanceof org.telegram.ui.Cells.v3) || ((kj0) awVar.T(childAt)) == null) {
                        i7 = i12;
                    } else {
                        org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) childAt;
                        ArrayList arrayList = org.telegram.messenger.ri.d0(i10).f26643v0[i11];
                        TLRPC.StickerSetCovered stickerSet = v3Var.getStickerSet();
                        if (arrayList != null && arrayList.contains(Long.valueOf(stickerSet.set.f28430id))) {
                            z10 = true;
                        } else {
                            z10 = i11;
                        }
                        int i13 = i11;
                        while (true) {
                            TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.f39412y1;
                            if (i13 < stickerSetCoveredArr.length) {
                                TLRPC.StickerSetCovered stickerSetCovered = stickerSetCoveredArr[i13];
                                if (stickerSetCovered != null) {
                                    i7 = i12;
                                    if (stickerSetCovered.set.f28430id == stickerSet.set.f28430id) {
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
                            org.telegram.messenger.ri.d0(i10).h1(stickerSet.set.f28430id);
                        }
                        if (longSparseArray2.indexOfKey(stickerSet.set.f28430id) >= 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (longSparseArray.indexOfKey(stickerSet.set.f28430id) >= 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z12 || z13) {
                            if (z12 && v3Var.f32162r) {
                                longSparseArray2.remove(stickerSet.set.f28430id);
                                z12 = false;
                            } else if (z13 && !v3Var.f32162r) {
                                longSparseArray.remove(stickerSet.set.f28430id);
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
        this.f39392s2 = f10;
        S();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        org.telegram.messenger.x10 x10Var;
        TLRPC.StickerSet stickerSet;
        int i11 = org.telegram.messenger.ks.f25218x0;
        bx bxVar = this.S;
        mv mvVar = this.S2;
        if (i7 == i11) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (this.f39414z0 != null) {
                    Y(((Boolean) objArr[1]).booleanValue());
                    a0();
                    E();
                    o();
                }
            } else if (((Integer) objArr[0]).intValue() == 5) {
                if (((Boolean) objArr[1]).booleanValue()) {
                    org.telegram.messenger.g0.r(mvVar);
                    org.telegram.messenger.g0.h3(mvVar, 100L);
                    return;
                }
                bxVar.F(false);
            }
        } else if (i7 == org.telegram.messenger.ks.f25188s3) {
            long longValue = ((Long) objArr[0]).longValue();
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            TLRPC.ChatFull chatFull = this.K1;
            if (chatFull != null && chatFull.f28404id == longValue && booleanValue) {
                bxVar.F(true);
            }
        } else if (i7 == org.telegram.messenger.ks.X0) {
            boolean booleanValue2 = ((Boolean) objArr[0]).booleanValue();
            int intValue = ((Integer) objArr[1]).intValue();
            if (booleanValue2 || intValue == 0 || intValue == 2) {
                k(booleanValue2);
            }
        } else if (i7 == org.telegram.messenger.ks.f25232z0) {
            a0();
            bc0 bc0Var = this.f39406x;
            if (bc0Var != null) {
                int childCount = bc0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    bc0Var.getChildAt(i12).invalidate();
                }
            }
            Y(false);
        } else if (i7 == org.telegram.messenger.ks.A0) {
            if (bxVar != null) {
                bxVar.F(false);
            }
        } else {
            int i13 = org.telegram.messenger.ks.B0;
            qx qxVar = this.T;
            if (i7 == i13) {
                Long l10 = (Long) objArr[0];
                long longValue2 = l10.longValue();
                if (objArr.length > 1) {
                    tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) objArr[1];
                } else {
                    tL_messages_stickerSet = null;
                }
                if (tL_messages_stickerSet != null) {
                    my myVar = this.A0;
                    if (myVar != null && myVar.d == longValue2 && myVar.f37658f.size() < tL_messages_stickerSet.documents.size()) {
                        myVar.f37658f = tL_messages_stickerSet.documents;
                        myVar.f();
                    }
                    if (qxVar != null && qxVar.d == longValue2 && qxVar.f38927f.size() < tL_messages_stickerSet.documents.size()) {
                        qxVar.f38927f = tL_messages_stickerSet.documents;
                        qxVar.f();
                    }
                }
                TLRPC.ChatFull chatFull2 = this.K1;
                if (chatFull2 != null && (stickerSet = chatFull2.stickerset) != null && stickerSet.f28430id == longValue2) {
                    Y(false);
                }
                HashMap hashMap = this.f39391s1;
                if (hashMap.containsKey(l10) && objArr.length >= 2 && ((org.telegram.messenger.x10) hashMap.get(l10)) != null && tL_messages_stickerSet != null && (x10Var = (org.telegram.messenger.x10) hashMap.remove(l10)) != null) {
                    x10Var.a(tL_messages_stickerSet);
                }
                org.telegram.messenger.g0.r(mvVar);
                org.telegram.messenger.g0.h3(mvVar, 100L);
                return;
            }
            int i14 = org.telegram.messenger.ks.f25148l4;
            ex exVar = this.Q;
            if (i7 == i14) {
                aw awVar = this.E0;
                if (awVar != null) {
                    int childCount2 = awVar.getChildCount();
                    for (int i15 = 0; i15 < childCount2; i15++) {
                        View childAt = awVar.getChildAt(i15);
                        if ((childAt instanceof org.telegram.ui.Cells.k8) || (childAt instanceof org.telegram.ui.Cells.a8)) {
                            childAt.invalidate();
                        }
                    }
                }
                if (exVar != null) {
                    exVar.invalidate();
                    int childCount3 = exVar.getChildCount();
                    for (int i16 = 0; i16 < childCount3; i16++) {
                        View childAt2 = exVar.getChildAt(i16);
                        if (childAt2 instanceof zx) {
                            childAt2.invalidate();
                        }
                    }
                }
                iu iuVar = this.C1;
                if (iuVar != null) {
                    iuVar.f36199c.invalidate();
                }
                zw zwVar = this.f39382q0;
                if (zwVar != null) {
                    org.telegram.ui.d61 d61Var = zwVar.f34742e;
                    int childCount4 = d61Var.getChildCount();
                    for (int i17 = 0; i17 < childCount4; i17++) {
                        d61Var.getChildAt(i17).invalidate();
                    }
                }
            } else if (i7 == org.telegram.messenger.ks.L2) {
                if (exVar != null && this.f39347e0) {
                    if ((this.W.f34837c.f39777k == 2 || exVar.getAdapter() == qxVar) && !TextUtils.isEmpty(qxVar.f38931w)) {
                        qxVar.F(qxVar.f38931w, true);
                    }
                }
            } else if (i7 == org.telegram.messenger.ks.f25133i5) {
                if (bxVar != null) {
                    bxVar.F(false);
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
            if (this.f39373n.getVisibility() != 8 && !this.f39399v0 && this.f39407x0) {
                canvas.drawColor(i0.a.o(-1, 25));
            }
            boolean drawChild = super.drawChild(canvas, view, j3);
            float R0 = org.telegram.messenger.g0.R0(this.f39388r2);
            if (R0 > 0.0f) {
                int r12 = org.telegram.ui.ActionBar.n6.r1(R0, z(org.telegram.ui.ActionBar.n6.f29814zf));
                int i7 = this.B2;
                GradientDrawable gradientDrawable = this.A2;
                if (i7 != r12) {
                    gradientDrawable.setColors(new int[]{r12, org.telegram.ui.ActionBar.n6.r1(0.66f, r12), i0.a.o(r12, 0)});
                    this.B2 = r12;
                }
                gradientDrawable.setBounds(0, getMeasuredHeight() - this.f39388r2, getMeasuredWidth(), getMeasuredHeight());
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

    public ArrayList<fx> getEmojipacks() {
        ArrayList<fx> arrayList = new ArrayList<>();
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.f39387r1;
            if (i7 < arrayList2.size()) {
                fx fxVar = (fx) arrayList2.get(i7);
                boolean z10 = fxVar.f35176g;
                ArrayList arrayList3 = this.f39383q1;
                if ((!z10 && (fxVar.f35175f || arrayList3.contains(Long.valueOf(fxVar.f35172b.f28430id)))) || (fxVar.f35176g && !fxVar.f35175f && !arrayList3.contains(Long.valueOf(fxVar.f35172b.f28430id)))) {
                    arrayList.add(fxVar);
                }
                i7++;
            } else {
                return arrayList;
            }
        }
    }

    public ArrayList<String> getRecentEmoji() {
        if (this.d2) {
            return org.telegram.messenger.j6.f24816i;
        }
        if (this.C2 == null) {
            this.C2 = new ArrayList();
        }
        if (org.telegram.messenger.j6.f24816i.size() != this.D2) {
            this.C2.clear();
            int i7 = 0;
            while (true) {
                ArrayList arrayList = org.telegram.messenger.j6.f24816i;
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
        fw fwVar = this.C0;
        if (fwVar == null) {
            return 0.0f;
        }
        return fwVar.getExpandedOffset();
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
                        ArrayList arrayList2 = org.telegram.messenger.j6.f24816i;
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
        pw pwVar = new pw(getContext(), i10);
        pwVar.f59067a = !z10 ? 1 : 0;
        w(i7).w0(pwVar);
    }

    public final void k(boolean z10) {
        if (z10) {
            X();
            return;
        }
        int size = this.f39367k1.size();
        int size2 = this.l1.size();
        int i7 = this.f39345d1;
        this.f39367k1 = org.telegram.messenger.ri.d0(i7).k0(0, true);
        this.l1 = org.telegram.messenger.ri.d0(i7).k0(2, false);
        if (org.telegram.messenger.j10.i(i7).q()) {
            this.f39371m1 = org.telegram.messenger.ri.d0(i7).k0(7, false);
        } else {
            this.f39371m1 = new ArrayList();
        }
        for (int i10 = 0; i10 < this.l1.size(); i10++) {
            TLRPC.Document document = (TLRPC.Document) this.l1.get(i10);
            int i11 = 0;
            while (true) {
                if (i11 < this.f39367k1.size()) {
                    TLRPC.Document document2 = (TLRPC.Document) this.f39367k1.get(i11);
                    if (document2.dc_id == document.dc_id && document2.f28409id == document.f28409id) {
                        this.f39367k1.remove(i11);
                        break;
                    }
                    i11++;
                }
            }
        }
        if (org.telegram.messenger.mp.u1(i7).K3()) {
            int i12 = 0;
            while (i12 < this.l1.size()) {
                if (org.telegram.messenger.fj.X3((TLRPC.Document) this.l1.get(i12))) {
                    this.l1.remove(i12);
                    i12--;
                }
                i12++;
            }
            int i13 = 0;
            while (i13 < this.f39367k1.size()) {
                if (org.telegram.messenger.fj.X3((TLRPC.Document) this.f39367k1.get(i13))) {
                    this.f39367k1.remove(i13);
                    i13--;
                }
                i13++;
            }
        }
        if (size != this.f39367k1.size() || size2 != this.l1.size()) {
            Y(false);
        }
        jy jyVar = this.f39414z0;
        if (jyVar != null) {
            jyVar.f();
        }
        o();
    }

    public final void l(boolean z10) {
        int i7;
        boolean z11;
        rx rxVar = this.f39397u1;
        te.a aVar = this.f39336b;
        ex exVar = this.Q;
        sv svVar = this.W;
        if (rxVar != null && rxVar.z()) {
            v4.f1 K = exVar.K(0);
            if (K == null) {
                ey.a(svVar, true, !z10);
            } else {
                if (K.f59123a.getTop() < exVar.getPaddingTop()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ey.a(svVar, z11, !z10);
            }
            O(false, !z10);
            svVar.setTranslationY(aVar.f57657e * org.telegram.messenger.g0.L(15.0f));
        } else if (svVar != null && exVar != null) {
            v4.f1 K2 = exVar.K(0);
            if (K2 != null) {
                i7 = K2.f59123a.getTop();
            } else {
                i7 = -this.f39342c1;
            }
            svVar.setTranslationY((aVar.f57657e * org.telegram.messenger.g0.L(15.0f)) + i7);
            svVar.f34835a.a(false, !z10);
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
        if (L > 0 && (K == null || K.f59123a.getBottom() < L)) {
            z10 = true;
        }
        O(z10, !this.L1);
    }

    public final void n(int i7, View view) {
        ex exVar;
        v4.f1 K;
        int i10;
        ww wwVar = this.J;
        int[] iArr = this.R0;
        if (view == null) {
            iArr[1] = 0;
            wwVar.setTranslationY(0);
        } else if (view.getVisibility() == 0 && !this.f39354g0) {
            rx rxVar = this.f39397u1;
            if (rxVar == null || !rxVar.z()) {
                if (i7 > 0 && (exVar = this.Q) != null && exVar.getVisibility() == 0 && (K = exVar.K(0)) != null) {
                    int top = K.f59123a.getTop();
                    if (this.f39347e0) {
                        i10 = this.f39342c1;
                    } else {
                        i10 = 0;
                    }
                    if (top + i10 >= exVar.getPaddingTop()) {
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
                wwVar.setTranslationY(Math.max(-org.telegram.messenger.g0.L(36.0f), iArr[1]));
            }
        }
    }

    public final void o() {
        int L0;
        fw fwVar = this.C0;
        if (fwVar != null && (L0 = this.F0.L0()) != -1) {
            int i7 = this.H1;
            if (i7 <= 0 && (i7 = this.G1) <= 0) {
                i7 = this.F1;
            }
            fwVar.k(this.f39414z0.F(L0), i7);
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
        xi.e eVar2 = (xi.e) new org.telegram.messenger.js(org.telegram.messenger.ks.f(this.f39345d1), this).f24919b;
        eVar2.f(org.telegram.messenger.ks.f25148l4);
        eVar2.c(org.telegram.messenger.ks.L2);
        eVar2.c(org.telegram.messenger.ks.f25188s3);
        this.N2 = eVar2;
        if (this.f39414z0 != null) {
            eVar2.c(org.telegram.messenger.ks.f25218x0);
            eVar2.c(org.telegram.messenger.ks.X0);
            eVar2.c(org.telegram.messenger.ks.f25232z0);
            eVar2.c(org.telegram.messenger.ks.B0);
            eVar2.c(org.telegram.messenger.ks.f25133i5);
            org.telegram.messenger.g0.g3(new mv(this, 0));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        iu iuVar = this.C1;
        if (iuVar != null && iuVar.isShowing()) {
            iuVar.dismiss();
        }
        org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
        if (p10.f50287l == this.f39359h2) {
            p10.W = null;
            p10.f50274a0 = null;
            p10.Y = null;
            p10.f50287l = null;
            p10.f50278c0 = null;
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
        View view = this.f39402w;
        boolean z11 = this.f39347e0;
        if (!z10 && !this.O1) {
            if (this.M1 != 0) {
                if (!this.M2) {
                    setOutlineProvider(null);
                    setClipToOutline(false);
                    setElevation(0.0f);
                }
                if (this.f39399v0) {
                    int i11 = org.telegram.ui.ActionBar.n6.f29814zf;
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
            int i12 = org.telegram.ui.ActionBar.n6.f29814zf;
            background.setColorFilter(new PorterDuffColorFilter(z(i12), PorterDuff.Mode.MULTIPLY));
            if (z11 && this.f39399v0) {
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
                this.C0.k(this.f39414z0.F(L02), i11);
            }
        } else if (i7 == 2) {
            v4.i0 adapter = this.f39360i0.getAdapter();
            vx vxVar = this.f39376o0;
            if (adapter == vxVar && vxVar.J >= 0 && this.f39393t0 >= 0 && this.f39390s0 >= 0 && (L0 = this.f39363j0.L0()) != -1) {
                if (L0 >= vxVar.J) {
                    i10 = this.f39393t0;
                } else {
                    i10 = this.f39390s0;
                }
                this.f39382q0.k(i10, 0);
            }
        }
    }

    public final void q(boolean z10) {
        int i7;
        rx rxVar = this.f39397u1;
        te.a aVar = this.f39332a;
        aw awVar = this.E0;
        boolean z11 = false;
        ew ewVar = this.H0;
        if (rxVar != null && rxVar.z()) {
            v4.f1 K = awVar.K(0);
            if (K == null) {
                ey.a(ewVar, true, !z10);
            } else {
                if (K.f59123a.getTop() < awVar.getPaddingTop()) {
                    z11 = true;
                }
                ey.a(ewVar, z11, !z10);
            }
            ewVar.setTranslationY(aVar.f57657e * org.telegram.messenger.g0.L(15.0f));
        } else if (ewVar != null && awVar != null) {
            v4.f1 K2 = awVar.K(0);
            if (K2 != null) {
                i7 = K2.f59123a.getTop();
            } else {
                i7 = -this.f39342c1;
            }
            ewVar.setTranslationY((aVar.f57657e * org.telegram.messenger.g0.L(15.0f)) + i7);
            ewVar.f34835a.a(false, !z10);
        }
    }

    public final void r() {
        HashMap hashMap = org.telegram.messenger.j6.f24810a;
        org.telegram.messenger.mp.f1().edit().putBoolean("filled_default", true).commit();
        org.telegram.messenger.j6.h.clear();
        org.telegram.messenger.j6.f24816i.clear();
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
        ey eyVar;
        v4.c0 c0Var;
        View view;
        ck0 ck0Var;
        int i7;
        int i10;
        TLRPC.TL_messages_stickerSet q02;
        jy jyVar;
        int E;
        AnimatorSet animatorSet = this.N0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.N0 = null;
        }
        int currentItem = this.h.getCurrentItem();
        int i11 = 2;
        if (currentItem == 2 && j3 != -1 && (q02 = org.telegram.messenger.ri.d0(this.f39345d1).q0(j3)) != null && (E = (jyVar = this.f39414z0).E(q02)) >= 0 && E < jyVar.b()) {
            I(E, org.telegram.messenger.g0.L(48.0f));
        }
        int i12 = 0;
        vx vxVar = this.f39366k0;
        if (vxVar != null) {
            vxVar.L = false;
        }
        int i13 = 0;
        while (i13 < 3) {
            ck0 ck0Var2 = this.E0;
            ck0 ck0Var3 = this.f39360i0;
            xv xvVar = this.f39379p0;
            ck0 ck0Var4 = this.Q;
            if (i13 == 0) {
                eyVar = this.W;
                c0Var = this.R;
                view = this.J;
                ck0Var = ck0Var4;
            } else if (i13 == 1) {
                c0Var = this.f39363j0;
                view = this.f39382q0;
                ck0Var = ck0Var3;
                eyVar = xvVar;
            } else {
                eyVar = this.H0;
                c0Var = this.F0;
                view = this.C0;
                ck0Var = ck0Var2;
            }
            if (eyVar == null) {
                i10 = i12;
                i7 = i11;
            } else {
                int i14 = i12;
                dy dyVar = eyVar.f34841r;
                int i15 = i11;
                eyVar.d.setText("");
                if (dyVar != null) {
                    dyVar.I1(null);
                    dyVar.G1();
                }
                int i16 = this.f39342c1;
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
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(ck0Var, property, fArr2);
                        float[] fArr3 = new float[1];
                        fArr3[i14] = org.telegram.messenger.g0.L(36.0f);
                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(eyVar, property, fArr3);
                        Animator[] animatorArr = new Animator[3];
                        animatorArr[i14] = ofFloat;
                        animatorArr[1] = ofFloat2;
                        animatorArr[i15] = ofFloat3;
                        animatorSet2.playTogether(animatorArr);
                    } else {
                        float[] fArr4 = new float[1];
                        fArr4[i14] = org.telegram.messenger.g0.L(36.0f) - i16;
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(ck0Var, property, fArr4);
                        Animator[] animatorArr2 = new Animator[1];
                        animatorArr2[i14] = ofFloat4;
                        animatorSet2.playTogether(animatorArr2);
                    }
                    this.N0.setDuration(200L);
                    this.N0.setInterpolator(lr.h);
                    this.N0.addListener(new fi.a3(this, c0Var, ck0Var, 6));
                    this.N0.start();
                    i10 = i14;
                    i7 = i15;
                } else {
                    if (eyVar != xvVar) {
                        eyVar.setTranslationY(org.telegram.messenger.g0.L(36.0f) - i16);
                    }
                    i7 = i15;
                    if (view != null && i13 != i7) {
                        view.setTranslationY(0.0f);
                    }
                    if (ck0Var == ck0Var2) {
                        i10 = i14;
                        ck0Var.setPadding(i10, org.telegram.messenger.g0.L(36.0f), i10, org.telegram.messenger.g0.L(44.0f) + this.f39388r2);
                    } else {
                        i10 = i14;
                        if (ck0Var == ck0Var3) {
                            ck0Var.setPadding(i10, org.telegram.messenger.g0.L(40.0f), i10, org.telegram.messenger.g0.L(44.0f) + this.f39388r2);
                        } else {
                            if (ck0Var == ck0Var4) {
                                ck0Var.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(44.0f) + this.f39388r2);
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
            this.f39397u1.i(i17);
        }
    }

    public void setBlurredBackgroundDrawableFactory(dh.c cVar) {
        org.telegram.ui.ActionBar.i6 i6Var = this.f39335a2;
        View view = this.f39410y;
        if (view != null) {
            fh.g c10 = cVar.c(view, null, false);
            c10.p(c8.i0.e(i6Var));
            c10.r(org.telegram.messenger.g0.L(18.0f));
            c10.q(org.telegram.messenger.g0.L(6.0f));
            view.setBackground(c10);
        }
        View view2 = this.F;
        if (view2 != null) {
            fh.g c11 = cVar.c(view2, null, false);
            c11.p(c8.i0.e(i6Var));
            c11.r(org.telegram.messenger.g0.L(18.0f));
            c11.q(org.telegram.messenger.g0.L(6.0f));
            view2.setBackground(c11);
        }
        View view3 = this.f39406x;
        if (view3 != null) {
            fh.g c12 = cVar.c(view3, null, false);
            c12.p(c8.i0.e(i6Var));
            c12.r(org.telegram.messenger.g0.L(18.0f));
            c12.q(org.telegram.messenger.g0.L(6.0f));
            view3.setBackground(c12);
        }
        View view4 = this.E;
        if (view4 != null) {
            fh.g c13 = cVar.c(view4, null, false);
            c13.p(c8.i0.e(i6Var));
            c13.r(org.telegram.messenger.g0.L(18.0f));
            c13.q(org.telegram.messenger.g0.L(6.0f));
            view4.setBackground(c13);
        }
    }

    public void setBottomInset(int i7) {
        if (this.f39388r2 != i7) {
            this.f39388r2 = i7;
            j(i7, this.L);
            j(i7, this.N);
            j(org.telegram.messenger.g0.L(44.0f) + i7, this.Q);
            j(org.telegram.messenger.g0.L(44.0f) + i7, this.E0);
            j(org.telegram.messenger.g0.L(44.0f) + i7, this.f39360i0);
            FrameLayout frameLayout = this.f39389s;
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

    public void setDelegate(rx rxVar) {
        this.f39397u1 = rxVar;
    }

    public void setDragListener(yw ywVar) {
        this.P0 = ywVar;
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        ew ewVar = this.H0;
        if (ewVar != null) {
            ewVar.d.setEnabled(z10);
        }
        xv xvVar = this.f39379p0;
        if (xvVar != null) {
            xvVar.d.setEnabled(z10);
        }
        sv svVar = this.W;
        if (svVar != null) {
            svVar.d.setEnabled(z10);
        }
    }

    public void setForseMultiwindowLayout(boolean z10) {
        this.O1 = z10;
    }

    public void setShouldDrawBackground(boolean z10) {
        if (this.f39399v0 != z10) {
            this.f39399v0 = z10;
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
                int i10 = this.f39345d1;
                if (eVar == null) {
                    xi.e eVar2 = (xi.e) new org.telegram.messenger.js(org.telegram.messenger.ks.f(i10), this).f24919b;
                    eVar2.c(org.telegram.messenger.ks.f25218x0);
                    this.O2 = eVar2;
                }
                if (this.f39414z0 != null) {
                    if (!this.P2) {
                        this.P2 = true;
                        this.O2.c(org.telegram.messenger.ks.X0);
                    }
                    Y(false);
                    E();
                }
                k(true);
                k(false);
                org.telegram.messenger.ri.d0(i10).Y0(0, true, true, false);
                org.telegram.messenger.ri.d0(i10).Y0(0, false, true, false);
                org.telegram.messenger.ri.d0(i10).Y0(2, false, true, false);
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
        jy jyVar;
        boolean z11 = this.U2;
        this.U2 = z10;
        if (z11 && !z10) {
            int i7 = this.B1;
            if (i7 == 0) {
                bx bxVar = this.S;
                if (bxVar != null) {
                    bxVar.F(false);
                }
            } else if (i7 == 1) {
                vx vxVar = this.f39376o0;
                if (vxVar != null) {
                    vxVar.f();
                }
            } else if (i7 == 2 && (jyVar = this.f39414z0) != null) {
                jyVar.f();
            }
        }
    }

    @Override
    public final void updateColors() {
        try {
            T();
            ui.c cVar = this.f39372m2;
            if (cVar != null) {
                cVar.a(z(org.telegram.ui.ActionBar.n6.f29394d6));
            }
            bc0 bc0Var = this.f39406x;
            if (bc0Var != null) {
                bc0Var.setIndicatorColor(i0.a.o(z(org.telegram.ui.ActionBar.n6.Gf), 20));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final int v(float f10) {
        return i0.a.o(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Nl, this.f39335a2), (int) (f10 * 255.0f));
    }

    public final v4.t w(int i7) {
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    return this.f39363j0;
                }
                throw new IllegalArgumentException(i5.c.i(i7, "Unexpected argument: "));
            }
            return this.R;
        }
        return this.F0;
    }

    public final ck0 x(int i7) {
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    return this.f39360i0;
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
                    return this.f39382q0;
                }
                throw new IllegalArgumentException(i5.c.i(i7, "Unexpected argument: "));
            }
            return this.J;
        }
        return this.C0;
    }

    public final int z(int i7) {
        org.telegram.ui.ActionBar.i6 i6Var = this.f39335a2;
        if (i6Var != null) {
            return i6Var.k(i7);
        }
        return org.telegram.ui.ActionBar.n6.x0(null, i7, false);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void D(float f10, int i7) {
    }
}
