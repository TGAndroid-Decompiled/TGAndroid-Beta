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
public class ey extends FrameLayout implements org.telegram.ui.ActionBar.z5, qe.b, org.telegram.messenger.cs, sh.a {
    public static final int V2 = 0;
    public final yx A0;
    public final LongSparseArray A1;
    public final GradientDrawable A2;
    public final ev B0;
    public int B1;
    public int B2;
    public final sv C0;
    public final wt C1;
    public ArrayList C2;
    public final tv D0;
    public final int D1;
    public int D2;
    public final ImageView E;
    public final ov E0;
    public final int[] E1;
    public long E2;
    public final ImageView F;
    public final pv F0;
    public int F1;
    public final qe.a F2;
    public AnimatorSet G;
    public cy G0;
    public int G1;
    public ArrayList G2;
    public AnimatorSet H;
    public final rv H0;
    public int H1;
    public Drawable H2;
    public float I;
    public final qh.c I0;
    public int I1;
    public int I2;
    public final jw J;
    public boolean J0;
    public int J1;
    public int J2;
    public final ew K;
    public boolean K0;
    public TLRPC.ChatFull K1;
    public int K2;
    public final org.telegram.ui.n61 L;
    public boolean L0;
    public boolean L1;
    public int L2;
    public final qh.a M;
    public final yw M0;
    public int M1;
    public boolean M2;
    public final org.telegram.ui.n61 N;
    public AnimatorSet N0;
    public final cg.q0 N1;
    public za.p N2;
    public final qh.a O;
    public final ci.ec O0;
    public boolean O1;
    public za.p O2;
    public final View P;
    public lw P0;
    public int P1;
    public boolean P2;
    public final rw Q;
    public boolean Q0;
    public boolean Q1;
    public AnimatorSet Q2;
    public final fw R;
    public final int[] R0;
    public boolean R1;
    public g2.o0 R2;
    public final ow S;
    public final ObjectAnimator[] S0;
    public nx S1;
    public final av S2;
    public final ex T;
    public boolean T0;
    public float T1;
    public boolean T2;
    public cy U;
    public kg.a1 U0;
    public float U1;
    public boolean U2;
    public final qh.c V;
    public boolean V0;
    public float V1;
    public final gv W;
    public boolean W0;
    public float W1;
    public String[] X0;
    public float X1;
    public final Drawable[] Y0;
    public boolean Y1;
    public final Drawable[] Z0;
    public final org.telegram.ui.ActionBar.d2 Z1;
    public final qe.a f33517a;
    public AnimatorSet f33518a0;
    public final Drawable[] f33519a1;
    public final org.telegram.ui.ActionBar.e6 f33520a2;
    public final qe.a f33521b;
    public final vi0 f33522b0;
    public final String[] f33523b1;
    public final org.telegram.ui.ActionBar.t5 f33524b2;
    public int f33525c;
    public final vi0 f33526c0;
    public final int f33527c1;
    public final org.telegram.ui.ActionBar.t5 c2;
    public final ArrayList d;
    public boolean f33528d0;
    public final int f33529d1;
    public final boolean f33530d2;
    public final ArrayList f33531e;
    public final boolean f33532e0;
    public final ArrayList f33533e1;
    public LongSparseArray f33534e2;
    public boolean f33535f;
    public boolean f33536f0;
    public int f33537f1;
    public PorterDuffColorFilter f33538f2;
    public boolean f33539g0;
    public int f33540g1;
    public final lt f33541g2;
    public final uv h;
    public final iv f33542h0;
    public boolean f33543h1;
    public final aw f33544h2;
    public final jv f33545i0;
    public TLRPC.TL_messages_stickerSet f33546i1;
    public boolean f33547i2;
    public final kx f33548j0;
    public ArrayList f33549j1;
    public final boolean f33550j2;
    public final jx f33551k0;
    public ArrayList k1;
    public final eh.g f33552k2;
    public final mx f33553l0;
    public ArrayList f33554l1;
    public final rg f33555l2;
    public final HashMap m0;
    public ArrayList m1;
    public final si.c f33556m2;
    public final FrameLayout f33557n;
    public final ev f33558n0;
    public final ArrayList f33559n1;
    public final eh.c f33560n2;
    public final jx f33561o0;
    public final ArrayList f33562o1;
    public final pi.q f33563o2;
    public final lv f33564p0;
    public final ArrayList f33565p1;
    public boolean f33566p2;
    public final mw f33567q0;
    public final ArrayList f33568q1;
    public boolean f33569q2;
    public final FrameLayout f33570r;
    public boolean f33571r0;
    public final ArrayList f33572r1;
    public int f33573r2;
    public final FrameLayout f33574s;
    public int f33575s0;
    public final HashMap f33576s1;
    public float f33577s2;
    public int f33578t0;
    public final Paint f33579t1;
    public View f33580t2;
    public int f33581u0;
    public fx f33582u1;
    public int f33583u2;
    public boolean f33584v0;
    public long f33585v1;
    public int f33586v2;
    public final View f33587w;
    public boolean f33588w0;
    public boolean f33589w1;
    public long f33590w2;
    public final lb0 f33591x;
    public boolean f33592x0;
    public boolean f33593x1;
    public boolean f33594x2;
    public final vv f33595y;
    public final mv f33596y0;
    public final TLRPC.StickerSetCovered[] f33597y1;
    public boolean f33598y2;
    public final vx f33599z0;
    public final LongSparseArray f33600z1;
    public final Rect f33601z2;

    public ey(org.telegram.ui.ActionBar.d2 d2Var, boolean z10, boolean z11, boolean z12, Context context, boolean z13, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z14, final org.telegram.ui.ActionBar.e6 e6Var, boolean z15, boolean z16) {
        super(context);
        int i3;
        av avVar;
        boolean z17;
        ew ewVar;
        boolean z18;
        Context context2;
        final org.telegram.ui.ActionBar.e6 e6Var2;
        pi.q qVar;
        ow owVar;
        int i10;
        int i11;
        int i12;
        boolean z19;
        Field field;
        boolean z20;
        ow owVar2;
        boolean z21;
        xq xqVar = xq.h;
        this.f33517a = new qe.a(0, this, xqVar, 320L, false);
        this.f33521b = new qe.a(1, this, xqVar, 320L, false);
        this.f33525c = 2;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.f33531e = new ArrayList();
        this.f33528d0 = true;
        this.f33553l0 = new mx(this);
        this.m0 = new HashMap();
        this.f33571r0 = true;
        this.f33575s0 = -2;
        this.f33578t0 = -2;
        this.f33581u0 = -2;
        this.f33584v0 = true;
        this.f33592x0 = true;
        this.J0 = true;
        this.R0 = new int[3];
        this.S0 = new ObjectAnimator[3];
        int i13 = org.telegram.messenger.h10.f22829t0;
        this.f33529d1 = i13;
        this.f33533e1 = new ArrayList();
        this.f33549j1 = new ArrayList();
        this.k1 = new ArrayList();
        this.f33554l1 = new ArrayList();
        this.m1 = new ArrayList();
        this.f33559n1 = new ArrayList();
        this.f33562o1 = new ArrayList();
        new ArrayList();
        this.f33565p1 = new ArrayList();
        this.f33568q1 = new ArrayList();
        this.f33572r1 = new ArrayList();
        this.f33576s1 = new HashMap();
        this.f33597y1 = new TLRPC.StickerSetCovered[10];
        this.f33600z1 = new LongSparseArray();
        this.A1 = new LongSparseArray();
        this.E1 = new int[2];
        this.G1 = -2;
        this.H1 = -2;
        this.I1 = -2;
        this.J1 = -2;
        this.M1 = -1;
        this.f33541g2 = new lt(this, 1);
        this.f33544h2 = new aw(this);
        this.f33547i2 = true;
        pi.q qVar2 = new pi.q();
        this.f33563o2 = qVar2;
        this.f33577s2 = -1.0f;
        this.f33583u2 = -1;
        this.f33586v2 = -1;
        this.f33590w2 = -1L;
        this.f33594x2 = false;
        this.f33598y2 = true;
        this.f33601z2 = new Rect();
        this.A2 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.F2 = new qe.a(0, new bv(this, 3), xqVar, 380L, true);
        this.S2 = new av(this, 1);
        this.T2 = false;
        this.f33584v0 = z14;
        this.Z1 = d2Var;
        this.f33530d2 = z10;
        this.f33520a2 = e6Var;
        this.f33550j2 = z16;
        si.c cVar = new si.c();
        this.f33556m2 = cVar;
        cVar.a(z(org.telegram.ui.ActionBar.k6.f27878d6));
        if (z15) {
            u(true);
        }
        i0.a.o(z(org.telegram.ui.ActionBar.k6.Kl), 30);
        int L = org.telegram.messenger.g0.L(50.0f);
        this.f33527c1 = L;
        this.f33532e0 = z13;
        this.Y0 = new Drawable[]{org.telegram.ui.ActionBar.k6.W(context, 2131232741, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.k6.Gf), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.k6.Df)), org.telegram.ui.ActionBar.k6.W(context, 2131232738, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.k6.Gf), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.k6.Df)), org.telegram.ui.ActionBar.k6.W(context, 2131232742, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.k6.Gf), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.k6.Df))};
        org.telegram.ui.ActionBar.t5 W = org.telegram.ui.ActionBar.k6.W(context, 2131232125, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.k6.Bf), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.k6.Df));
        org.telegram.ui.ActionBar.t5 W2 = org.telegram.ui.ActionBar.k6.W(context, 2131231064, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.k6.Bf), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.k6.Df));
        org.telegram.ui.ActionBar.t5 W3 = org.telegram.ui.ActionBar.k6.W(context, 2131231067, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.k6.Bf), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.k6.Df));
        org.telegram.ui.ActionBar.t5 W4 = org.telegram.ui.ActionBar.k6.W(context, 2131231065, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.k6.Bf), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.k6.Df));
        this.f33524b2 = W4;
        int i14 = org.telegram.ui.ActionBar.k6.Ff;
        org.telegram.ui.ActionBar.t5 W5 = org.telegram.ui.ActionBar.k6.W(context, 2131231066, z(i14), z(i14));
        this.c2 = W5;
        this.Z0 = new Drawable[]{W, W2, W3, new LayerDrawable(new Drawable[]{W4, W5})};
        this.f33519a1 = new Drawable[]{org.telegram.ui.ActionBar.k6.W(context, 2131232125, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.k6.Bf), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.k6.Df)), org.telegram.ui.ActionBar.k6.W(context, 2131232761, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.k6.Bf), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.k6.Df))};
        this.f33523b1 = new String[]{org.telegram.messenger.bd.M0(2131751196, null), org.telegram.messenger.bd.M0(2131751195, null), org.telegram.messenger.bd.M0(2131751194, null), org.telegram.messenger.bd.M0(2131751193, null), org.telegram.messenger.bd.M0(2131751192, null), org.telegram.messenger.bd.M0(2131751191, null), org.telegram.messenger.bd.M0(2131751190, null), org.telegram.messenger.bd.M0(2131751189, null)};
        this.K1 = chatFull;
        Paint paint = new Paint(1);
        this.f33579t1 = paint;
        paint.setColor(z(org.telegram.ui.ActionBar.k6.Pf));
        cg.p0 p0Var = cg.t0.f4745a;
        this.N1 = new cg.q0(org.telegram.messenger.g0.L(6.0f));
        ew ewVar2 = new ew(this, context);
        this.K = ewVar2;
        ?? obj = new Object();
        obj.f41144a = 0;
        obj.f41145b = ewVar2;
        arrayList.add(obj);
        if (z10) {
            org.telegram.messenger.li.b0(i13).B(5);
            org.telegram.messenger.li.b0(i13).w();
            this.f33538f2 = new PorterDuffColorFilter(z(org.telegram.ui.ActionBar.k6.Ci), PorterDuff.Mode.SRC_IN);
        }
        rw rwVar = new rw(this, context);
        this.Q = rwVar;
        qVar2.b(rwVar);
        u4.k kVar = new u4.k();
        kVar.f55616c = 220L;
        kVar.f55617e = 220L;
        kVar.f55618f = 160L;
        kVar.f55619g = 160L;
        kVar.f55620i = xq.f40453g;
        rwVar.setItemAnimator(kVar);
        rwVar.setOnTouchListener(new View.OnTouchListener(this) {
            public final ey f32838b;

            {
                this.f32838b = this;
            }

            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                switch (r3) {
                    case 0:
                        org.telegram.ui.is p10 = org.telegram.ui.is.p();
                        ey eyVar = this.f32838b;
                        rw rwVar2 = eyVar.Q;
                        eyVar.getMeasuredHeight();
                        return p10.r(motionEvent, rwVar2, null, eyVar.f33544h2, e6Var);
                    case 1:
                        org.telegram.ui.is p11 = org.telegram.ui.is.p();
                        ey eyVar2 = this.f32838b;
                        return p11.r(motionEvent, eyVar2.f33545i0, eyVar2.f33558n0, eyVar2.f33544h2, e6Var);
                    default:
                        org.telegram.ui.is p12 = org.telegram.ui.is.p();
                        ey eyVar3 = this.f32838b;
                        ov ovVar = eyVar3.E0;
                        eyVar3.getMeasuredHeight();
                        return p12.r(motionEvent, ovVar, eyVar3.B0, eyVar3.f33544h2, e6Var);
                }
            }
        });
        rwVar.setOnItemLongClickListener(new bv(this, 1));
        rwVar.setInstantClick(true);
        fw fwVar = new fw(this);
        this.R = fwVar;
        rwVar.setLayoutManager(fwVar);
        rwVar.setTopGlowOffset(org.telegram.messenger.g0.L(38.0f));
        rwVar.setBottomGlowOffset(org.telegram.messenger.g0.L(36.0f));
        rwVar.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(44.0f));
        int i15 = org.telegram.ui.ActionBar.k6.f28243wf;
        org.telegram.ui.ActionBar.r6.m(rwVar, 21, i15, e6Var);
        rwVar.setItemSelectorColorProvider(new a3(15));
        rwVar.setClipToPadding(false);
        fwVar.O = new gw(this);
        ow owVar3 = new ow(this);
        this.S = owVar3;
        rwVar.setAdapter(owVar3);
        rwVar.i(new gi.o1(this, 3));
        this.T = new ex(this, context);
        ewVar2.addView(rwVar, b8.mf.c(-1.0f, -1));
        vi0 vi0Var = new vi0(rwVar, fwVar);
        this.f33526c0 = vi0Var;
        vi0Var.f39131i = new hw(this);
        rwVar.setOnScrollListener(new iw(this));
        if (d2Var != null) {
            i3 = -1;
            avVar = new av(this, 2);
            ewVar = ewVar2;
            z18 = z16;
            context2 = context;
            e6Var2 = e6Var;
            qVar = qVar2;
            owVar = owVar3;
            i10 = i14;
            i11 = 5;
            z17 = z10;
        } else {
            i3 = -1;
            avVar = null;
            z17 = z10;
            ewVar = ewVar2;
            z18 = z16;
            context2 = context;
            e6Var2 = e6Var;
            qVar = qVar2;
            owVar = owVar3;
            i10 = i14;
            i11 = 5;
        }
        jw jwVar = new jw(this, context2, e6Var2, z17, avVar, z18);
        this.J = jwVar;
        if (z13) {
            gv gvVar = new gv(this, context2);
            this.W = gvVar;
            ewVar.addView(gvVar, new FrameLayout.LayoutParams(i3, org.telegram.messenger.g0.f1() + L));
            gvVar.d.setOnFocusChangeListener(new hv(this));
            qh.c cVar2 = new qh.c(context2, e6Var2);
            this.V = cVar2;
            cVar2.setVisibility(8);
            cVar2.setOnBackClickListener(new View.OnClickListener(this) {
                public final ey f33196b;

                {
                    this.f33196b = this;
                }

                @Override
                public final void onClick(View view) {
                    rx rxVar;
                    switch (r2) {
                        case 0:
                            ex exVar = this.f33196b.T;
                            ax axVar = exVar.f33491c;
                            int childCount = axVar.getChildCount();
                            for (int i16 = 0; i16 < childCount; i16++) {
                                ((qh.b) axVar.getChildAt(i16)).a(false, true);
                            }
                            exVar.d = 0L;
                            exVar.G.f33521b.a(false, true);
                            exVar.f();
                            return;
                        case 1:
                            yx yxVar = this.f33196b.A0;
                            ax axVar2 = yxVar.f40841c;
                            int childCount2 = axVar2.getChildCount();
                            for (int i17 = 0; i17 < childCount2; i17++) {
                                ((qh.b) axVar2.getChildAt(i17)).a(false, true);
                            }
                            yxVar.d = 0L;
                            yxVar.R.f33517a.a(false, true);
                            yxVar.f();
                            return;
                        case 2:
                            fx fxVar = this.f33196b.f33582u1;
                            if (fxVar != null) {
                                fxVar.w();
                                return;
                            }
                            return;
                        default:
                            ey eyVar = this.f33196b;
                            int currentItem = eyVar.h.getCurrentItem();
                            if (currentItem == 0) {
                                rxVar = eyVar.W;
                            } else if (currentItem == 1) {
                                rxVar = eyVar.f33564p0;
                            } else {
                                rxVar = eyVar.H0;
                            }
                            if (rxVar != null) {
                                rp rpVar = rxVar.d;
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
            ewVar.addView(cVar2, new FrameLayout.LayoutParams(i3, L));
        }
        if (Color.alpha(z(i15)) >= 255) {
            org.telegram.ui.ActionBar.r6.i(i15, jwVar, e6Var2);
        }
        owVar.G(true);
        jwVar.p(getEmojipacks());
        ewVar.addView(jwVar, b8.mf.c(36.0f, i3));
        View view = new View(context2);
        this.P = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        int i16 = org.telegram.ui.ActionBar.k6.f28299zf;
        org.telegram.ui.ActionBar.r6.i(i16, view, e6Var2);
        ow owVar4 = owVar;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, org.telegram.messenger.g0.f1(), 51);
        layoutParams.topMargin = org.telegram.messenger.g0.L(36.0f);
        ewVar.addView(view, layoutParams);
        qh.a aVar = new qh.a(context2, e6Var2);
        this.M = aVar;
        org.telegram.ui.n61 n61Var = new org.telegram.ui.n61(context2, e6Var2);
        this.L = n61Var;
        n61Var.setVisibility(8);
        n61Var.addView(aVar, b8.mf.d(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
        ewVar.addView(n61Var, b8.mf.e(i3, -2, 80));
        if (z11) {
            uk0 uk0Var = uk0.f38812b;
            if (z12) {
                iv ivVar = new iv(this, context2);
                this.f33542h0 = ivVar;
                ?? obj2 = new Object();
                obj2.f41144a = 1;
                obj2.f41145b = ivVar;
                this.d.add(obj2);
                jv jvVar = new jv(this, context2);
                this.f33545i0 = jvVar;
                qVar.b(jvVar);
                jvVar.setClipToPadding(false);
                kx kxVar = new kx(this);
                this.f33548j0 = kxVar;
                jvVar.setLayoutManager(kxVar);
                jvVar.i(new kv(this));
                jvVar.setPadding(0, L, 0, org.telegram.messenger.g0.L(44.0f) + this.f33573r2);
                ((u4.f1) jvVar.getItemAnimator()).f55567m = false;
                jx jxVar = new jx(this, context2, true, Integer.MAX_VALUE);
                this.f33561o0 = jxVar;
                jvVar.setAdapter(jxVar);
                this.f33551k0 = new jx(this, context2, false, 0);
                jvVar.setOnScrollListener(new dy(this, 2));
                jvVar.setOnTouchListener(new View.OnTouchListener(this) {
                    public final ey f32838b;

                    {
                        this.f32838b = this;
                    }

                    @Override
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        switch (r3) {
                            case 0:
                                org.telegram.ui.is p10 = org.telegram.ui.is.p();
                                ey eyVar = this.f32838b;
                                rw rwVar2 = eyVar.Q;
                                eyVar.getMeasuredHeight();
                                return p10.r(motionEvent, rwVar2, null, eyVar.f33544h2, e6Var2);
                            case 1:
                                org.telegram.ui.is p11 = org.telegram.ui.is.p();
                                ey eyVar2 = this.f32838b;
                                return p11.r(motionEvent, eyVar2.f33545i0, eyVar2.f33558n0, eyVar2.f33544h2, e6Var2);
                            default:
                                org.telegram.ui.is p12 = org.telegram.ui.is.p();
                                ey eyVar3 = this.f32838b;
                                ov ovVar = eyVar3.E0;
                                eyVar3.getMeasuredHeight();
                                return p12.r(motionEvent, ovVar, eyVar3.B0, eyVar3.f33544h2, e6Var2);
                        }
                    }
                });
                ?? r10 = new fj0(this) {
                    public final ey f33467b;

                    {
                        this.f33467b = this;
                    }

                    @Override
                    public final void f(int i17, View view2) {
                        int i18;
                        String str;
                        switch (r2) {
                            case 0:
                                ey eyVar = this.f33467b;
                                jv jvVar2 = eyVar.f33545i0;
                                jx jxVar2 = eyVar.f33551k0;
                                jx jxVar3 = eyVar.f33561o0;
                                if (eyVar.f33582u1 != null) {
                                    jxVar3.getClass();
                                    ArrayList arrayList2 = jxVar3.f35214y;
                                    if (jvVar2.getAdapter() == jxVar3) {
                                        if (i17 >= 0) {
                                            int i19 = jxVar3.I;
                                            if (i17 < i19) {
                                                eyVar.f33582u1.v(view2, eyVar.f33549j1.get(i17), null, "gif", true, 0, 0);
                                                return;
                                            }
                                            if (i19 > 0) {
                                                i18 = (i17 - i19) - 1;
                                            } else {
                                                i18 = i17;
                                            }
                                            if (i18 >= 0 && i18 < arrayList2.size()) {
                                                eyVar.f33582u1.v(view2, arrayList2.get(i18), null, jxVar3.f35209n, true, 0, 0);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    } else if (jvVar2.getAdapter() == jxVar2 && i17 >= 0 && i17 < jxVar2.f35214y.size()) {
                                        eyVar.f33582u1.v(view2, jxVar2.f35214y.get(i17), jxVar2.f35213x, jxVar2.f35209n, true, 0, 0);
                                        eyVar.W();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            default:
                                ey eyVar2 = this.f33467b;
                                u4.h0 adapter = eyVar2.E0.getAdapter();
                                yx yxVar = eyVar2.A0;
                                if (adapter == yxVar) {
                                    str = yxVar.O;
                                } else {
                                    str = null;
                                }
                                String str2 = str;
                                if (view2 instanceof org.telegram.ui.Cells.y7) {
                                    org.telegram.ui.Cells.y7 y7Var = (org.telegram.ui.Cells.y7) view2;
                                    if (y7Var.getSticker() != null && org.telegram.messenger.zi.Y3(y7Var.getSticker()) && !org.telegram.messenger.h10.i(org.telegram.messenger.c.a(eyVar2.f33529d1).f21919a).q()) {
                                        org.telegram.ui.is.p().x(y7Var);
                                        return;
                                    }
                                    org.telegram.ui.is.p().t();
                                    if (!y7Var.f30998r) {
                                        y7Var.f30998r = true;
                                        y7Var.f30997n = 0.5f;
                                        y7Var.f31002y = 0L;
                                        org.telegram.ui.Cells.x7 x7Var = y7Var.f30992a;
                                        x7Var.setAlpha(0.5f * y7Var.I);
                                        x7Var.invalidate();
                                        y7Var.f30999s = System.currentTimeMillis();
                                        y7Var.invalidate();
                                        eyVar2.f33582u1.m(y7Var, y7Var.getSticker(), str2, y7Var.getParentObject(), y7Var.getSendAnimationData(), true, 0);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                };
                this.f33558n0 = r10;
                jvVar.setOnItemClickListener((fj0) r10);
                ivVar.addView(jvVar, b8.mf.c(-1.0f, -1));
                lv lvVar = new lv(this, context2);
                this.f33564p0 = lvVar;
                ivVar.addView(lvVar, new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1() + L));
                mw mwVar = new mw(this, context2, e6Var2);
                this.f33567q0 = mwVar;
                mwVar.setType(uk0Var);
                mwVar.setUnderlineHeight(org.telegram.messenger.g0.f1());
                mwVar.setIndicatorColor(z(i10));
                mwVar.setUnderlineColor(z(i16));
                org.telegram.ui.ActionBar.r6.i(i15, mwVar, e6Var2);
                V();
                mwVar.setDelegate(new bv(this, 2));
                jxVar.F("", "", true, true, true);
            }
            mv mvVar = new mv(this, context2, z14);
            this.f33596y0 = mvVar;
            org.telegram.messenger.li.b0(this.f33529d1).B(0);
            org.telegram.messenger.li.b0(this.f33529d1).x();
            ov ovVar = new ov(this, context2);
            this.E0 = ovVar;
            this.f33563o2.b(ovVar);
            pv pvVar = new pv(this);
            this.F0 = pvVar;
            ovVar.setLayoutManager(pvVar);
            pvVar.O = new qv(this);
            ovVar.setPadding(0, org.telegram.messenger.g0.L(36.0f), 0, org.telegram.messenger.g0.L(44.0f));
            ovVar.setClipToPadding(false);
            ?? obj3 = new Object();
            obj3.f41144a = 2;
            obj3.f41145b = mvVar;
            this.d.add(obj3);
            this.A0 = new yx(this, context2);
            vx vxVar = new vx(this, context2);
            this.f33599z0 = vxVar;
            ovVar.setAdapter(vxVar);
            ovVar.setOnTouchListener(new View.OnTouchListener(this) {
                public final ey f32838b;

                {
                    this.f32838b = this;
                }

                @Override
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    switch (r3) {
                        case 0:
                            org.telegram.ui.is p10 = org.telegram.ui.is.p();
                            ey eyVar = this.f32838b;
                            rw rwVar2 = eyVar.Q;
                            eyVar.getMeasuredHeight();
                            return p10.r(motionEvent, rwVar2, null, eyVar.f33544h2, e6Var2);
                        case 1:
                            org.telegram.ui.is p11 = org.telegram.ui.is.p();
                            ey eyVar2 = this.f32838b;
                            return p11.r(motionEvent, eyVar2.f33545i0, eyVar2.f33558n0, eyVar2.f33544h2, e6Var2);
                        default:
                            org.telegram.ui.is p12 = org.telegram.ui.is.p();
                            ey eyVar3 = this.f32838b;
                            ov ovVar2 = eyVar3.E0;
                            eyVar3.getMeasuredHeight();
                            return p12.r(motionEvent, ovVar2, eyVar3.B0, eyVar3.f33544h2, e6Var2);
                    }
                }
            });
            ?? r42 = new fj0(this) {
                public final ey f33467b;

                {
                    this.f33467b = this;
                }

                @Override
                public final void f(int i17, View view2) {
                    int i18;
                    String str;
                    switch (r2) {
                        case 0:
                            ey eyVar = this.f33467b;
                            jv jvVar2 = eyVar.f33545i0;
                            jx jxVar2 = eyVar.f33551k0;
                            jx jxVar3 = eyVar.f33561o0;
                            if (eyVar.f33582u1 != null) {
                                jxVar3.getClass();
                                ArrayList arrayList2 = jxVar3.f35214y;
                                if (jvVar2.getAdapter() == jxVar3) {
                                    if (i17 >= 0) {
                                        int i19 = jxVar3.I;
                                        if (i17 < i19) {
                                            eyVar.f33582u1.v(view2, eyVar.f33549j1.get(i17), null, "gif", true, 0, 0);
                                            return;
                                        }
                                        if (i19 > 0) {
                                            i18 = (i17 - i19) - 1;
                                        } else {
                                            i18 = i17;
                                        }
                                        if (i18 >= 0 && i18 < arrayList2.size()) {
                                            eyVar.f33582u1.v(view2, arrayList2.get(i18), null, jxVar3.f35209n, true, 0, 0);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                } else if (jvVar2.getAdapter() == jxVar2 && i17 >= 0 && i17 < jxVar2.f35214y.size()) {
                                    eyVar.f33582u1.v(view2, jxVar2.f35214y.get(i17), jxVar2.f35213x, jxVar2.f35209n, true, 0, 0);
                                    eyVar.W();
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        default:
                            ey eyVar2 = this.f33467b;
                            u4.h0 adapter = eyVar2.E0.getAdapter();
                            yx yxVar = eyVar2.A0;
                            if (adapter == yxVar) {
                                str = yxVar.O;
                            } else {
                                str = null;
                            }
                            String str2 = str;
                            if (view2 instanceof org.telegram.ui.Cells.y7) {
                                org.telegram.ui.Cells.y7 y7Var = (org.telegram.ui.Cells.y7) view2;
                                if (y7Var.getSticker() != null && org.telegram.messenger.zi.Y3(y7Var.getSticker()) && !org.telegram.messenger.h10.i(org.telegram.messenger.c.a(eyVar2.f33529d1).f21919a).q()) {
                                    org.telegram.ui.is.p().x(y7Var);
                                    return;
                                }
                                org.telegram.ui.is.p().t();
                                if (!y7Var.f30998r) {
                                    y7Var.f30998r = true;
                                    y7Var.f30997n = 0.5f;
                                    y7Var.f31002y = 0L;
                                    org.telegram.ui.Cells.x7 x7Var = y7Var.f30992a;
                                    x7Var.setAlpha(0.5f * y7Var.I);
                                    x7Var.invalidate();
                                    y7Var.f30999s = System.currentTimeMillis();
                                    y7Var.invalidate();
                                    eyVar2.f33582u1.m(y7Var, y7Var.getSticker(), str2, y7Var.getParentObject(), y7Var.getSendAnimationData(), true, 0);
                                    return;
                                }
                                return;
                            }
                            return;
                    }
                }
            };
            this.B0 = r42;
            ovVar.setOnItemClickListener((fj0) r42);
            org.telegram.ui.ActionBar.r6.m(ovVar, 21, i15, e6Var2);
            mvVar.addView(ovVar);
            this.f33522b0 = new vi0(ovVar, pvVar);
            rv rvVar = new rv(this, context2);
            this.H0 = rvVar;
            mvVar.addView(rvVar, new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1() + L));
            qh.c cVar3 = new qh.c(context2, e6Var2);
            this.I0 = cVar3;
            cVar3.setVisibility(8);
            cVar3.setOnBackClickListener(new View.OnClickListener(this) {
                public final ey f33196b;

                {
                    this.f33196b = this;
                }

                @Override
                public final void onClick(View view2) {
                    rx rxVar;
                    switch (r2) {
                        case 0:
                            ex exVar = this.f33196b.T;
                            ax axVar = exVar.f33491c;
                            int childCount = axVar.getChildCount();
                            for (int i162 = 0; i162 < childCount; i162++) {
                                ((qh.b) axVar.getChildAt(i162)).a(false, true);
                            }
                            exVar.d = 0L;
                            exVar.G.f33521b.a(false, true);
                            exVar.f();
                            return;
                        case 1:
                            yx yxVar = this.f33196b.A0;
                            ax axVar2 = yxVar.f40841c;
                            int childCount2 = axVar2.getChildCount();
                            for (int i17 = 0; i17 < childCount2; i17++) {
                                ((qh.b) axVar2.getChildAt(i17)).a(false, true);
                            }
                            yxVar.d = 0L;
                            yxVar.R.f33517a.a(false, true);
                            yxVar.f();
                            return;
                        case 2:
                            fx fxVar = this.f33196b.f33582u1;
                            if (fxVar != null) {
                                fxVar.w();
                                return;
                            }
                            return;
                        default:
                            ey eyVar = this.f33196b;
                            int currentItem = eyVar.h.getCurrentItem();
                            if (currentItem == 0) {
                                rxVar = eyVar.W;
                            } else if (currentItem == 1) {
                                rxVar = eyVar.f33564p0;
                            } else {
                                rxVar = eyVar.H0;
                            }
                            if (rxVar != null) {
                                rp rpVar = rxVar.d;
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
            mvVar.addView(cVar3, new FrameLayout.LayoutParams(-1, L));
            z19 = z14;
            i12 = 80;
            sv svVar = new sv(this, context2, e6Var2, d2Var, z19);
            this.C0 = svVar;
            svVar.setDragEnabled(true);
            svVar.setWillNotDraw(false);
            svVar.setType(uk0Var);
            svVar.setUnderlineHeight(ovVar.canScrollVertically(-1) ? org.telegram.messenger.g0.f1() : 0);
            svVar.setIndicatorColor(z(i10));
            svVar.setUnderlineColor(z(i16));
            if (viewGroup != null && z19) {
                tv tvVar = new tv(this, context2);
                this.D0 = tvVar;
                tvVar.addView(svVar, b8.mf.e(-1, 36, 51));
                viewGroup.addView(tvVar, b8.mf.c(-2.0f, -1));
            } else {
                mvVar.addView(svVar, b8.mf.e(-1, 36, 51));
            }
            X(true);
            svVar.setDelegate(new bv(this, 4));
            ovVar.setOnScrollListener(new dy(this, 0));
            qh.a aVar2 = new qh.a(context2, e6Var2);
            this.O = aVar2;
            org.telegram.ui.n61 n61Var2 = new org.telegram.ui.n61(context2, e6Var2);
            this.N = n61Var2;
            n61Var2.setVisibility(8);
            n61Var2.addView(aVar2, b8.mf.d(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
            mvVar.addView(n61Var2, b8.mf.e(-1, -2, 80));
        } else {
            i12 = 80;
            z19 = z14;
        }
        this.f33531e.clear();
        this.f33531e.addAll(this.d);
        uv uvVar = new uv(this, context2);
        this.h = uvVar;
        pi.q qVar3 = this.f33563o2;
        qVar3.getClass();
        uvVar.b(new pi.i(qVar3, uvVar));
        uvVar.setOverScrollMode(2);
        yw ywVar = new yw(this);
        this.M0 = ywVar;
        uvVar.setAdapter(ywVar);
        vv vvVar = new vv(this, context2);
        this.f33595y = vvVar;
        vvVar.setHapticFeedbackEnabled(true);
        vvVar.setImageResource(2131232737);
        int v = z16 ? v(0.6f) : z(org.telegram.ui.ActionBar.k6.Gf);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        vvVar.setColorFilter(new PorterDuffColorFilter(v, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        vvVar.setScaleType(scaleType);
        vvVar.setContentDescription(org.telegram.messenger.bd.M0(2131754920, null));
        vvVar.setFocusable(true);
        vvVar.setOnClickListener(new Object());
        b8.pf.a(vvVar);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f33570r = frameLayout;
        if (z13) {
            addView(frameLayout, b8.mf.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, (org.telegram.messenger.g0.f1() / org.telegram.messenger.g0.f22607p) + 40.0f));
        } else {
            addView(frameLayout, b8.mf.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.f33574s = frameLayout2;
        addView(frameLayout2, b8.mf.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 64.0f));
        FrameLayout frameLayout3 = new FrameLayout(context2);
        this.f33557n = frameLayout3;
        View view2 = new View(context2);
        this.f33587w = view2;
        frameLayout3.addView(view2, new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.L(40.0f), 83));
        if (z13) {
            addView(frameLayout3, b8.mf.e(-1, 48, i12));
            frameLayout3.addView(vvVar, b8.mf.d(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
            if (z11) {
                ImageView imageView = new ImageView(context2);
                this.E = imageView;
                imageView.setImageResource(2131232740);
                imageView.setColorFilter(new PorterDuffColorFilter(z16 ? v(0.6f) : z(org.telegram.ui.ActionBar.k6.Gf), mode));
                imageView.setScaleType(scaleType);
                imageView.setFocusable(true);
                imageView.setContentDescription(org.telegram.messenger.bd.M0(2131745505, null));
                b8.pf.a(imageView);
                frameLayout3.addView(imageView, b8.mf.d(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
                imageView.setOnClickListener(new View.OnClickListener(this) {
                    public final ey f33196b;

                    {
                        this.f33196b = this;
                    }

                    @Override
                    public final void onClick(View view22) {
                        rx rxVar;
                        switch (r2) {
                            case 0:
                                ex exVar = this.f33196b.T;
                                ax axVar = exVar.f33491c;
                                int childCount = axVar.getChildCount();
                                for (int i162 = 0; i162 < childCount; i162++) {
                                    ((qh.b) axVar.getChildAt(i162)).a(false, true);
                                }
                                exVar.d = 0L;
                                exVar.G.f33521b.a(false, true);
                                exVar.f();
                                return;
                            case 1:
                                yx yxVar = this.f33196b.A0;
                                ax axVar2 = yxVar.f40841c;
                                int childCount2 = axVar2.getChildCount();
                                for (int i17 = 0; i17 < childCount2; i17++) {
                                    ((qh.b) axVar2.getChildAt(i17)).a(false, true);
                                }
                                yxVar.d = 0L;
                                yxVar.R.f33517a.a(false, true);
                                yxVar.f();
                                return;
                            case 2:
                                fx fxVar = this.f33196b.f33582u1;
                                if (fxVar != null) {
                                    fxVar.w();
                                    return;
                                }
                                return;
                            default:
                                ey eyVar = this.f33196b;
                                int currentItem = eyVar.h.getCurrentItem();
                                if (currentItem == 0) {
                                    rxVar = eyVar.W;
                                } else if (currentItem == 1) {
                                    rxVar = eyVar.f33564p0;
                                } else {
                                    rxVar = eyVar.H0;
                                }
                                if (rxVar != null) {
                                    rp rpVar = rxVar.d;
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
            lb0 lb0Var = new lb0(context2, e6Var2);
            this.f33591x = lb0Var;
            lb0Var.setViewPager(uvVar);
            lb0Var.setShouldExpand(false);
            lb0Var.setIndicatorHeight(org.telegram.messenger.g0.L(3.0f));
            lb0Var.setIndicatorColor(i0.a.o(z(org.telegram.ui.ActionBar.k6.Df), 20));
            lb0Var.setUnderlineHeight(0);
            lb0Var.setTabPaddingLeftRight(org.telegram.messenger.g0.L(11.0f));
            lb0Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(11.0f));
            frameLayout3.addView(lb0Var, b8.mf.e(-2, 48, 81));
            lb0Var.setOnPageChangeListener(new xv(this, z19));
            ImageView imageView2 = new ImageView(context2);
            this.F = imageView2;
            imageView2.setImageResource(2131232739);
            imageView2.setColorFilter(new PorterDuffColorFilter(z16 ? v(0.6f) : z(org.telegram.ui.ActionBar.k6.Gf), mode));
            imageView2.setScaleType(scaleType);
            imageView2.setContentDescription(org.telegram.messenger.bd.M0(2131745846, null));
            imageView2.setFocusable(true);
            imageView2.setVisibility(8);
            frameLayout3.addView(imageView2, b8.mf.d(48, 48.0f, 83, 2.0f, 0.0f, 2.0f, 0.0f));
            imageView2.setOnClickListener(new View.OnClickListener(this) {
                public final ey f33196b;

                {
                    this.f33196b = this;
                }

                @Override
                public final void onClick(View view22) {
                    rx rxVar;
                    switch (r2) {
                        case 0:
                            ex exVar = this.f33196b.T;
                            ax axVar = exVar.f33491c;
                            int childCount = axVar.getChildCount();
                            for (int i162 = 0; i162 < childCount; i162++) {
                                ((qh.b) axVar.getChildAt(i162)).a(false, true);
                            }
                            exVar.d = 0L;
                            exVar.G.f33521b.a(false, true);
                            exVar.f();
                            return;
                        case 1:
                            yx yxVar = this.f33196b.A0;
                            ax axVar2 = yxVar.f40841c;
                            int childCount2 = axVar2.getChildCount();
                            for (int i17 = 0; i17 < childCount2; i17++) {
                                ((qh.b) axVar2.getChildAt(i17)).a(false, true);
                            }
                            yxVar.d = 0L;
                            yxVar.R.f33517a.a(false, true);
                            yxVar.f();
                            return;
                        case 2:
                            fx fxVar = this.f33196b.f33582u1;
                            if (fxVar != null) {
                                fxVar.w();
                                return;
                            }
                            return;
                        default:
                            ey eyVar = this.f33196b;
                            int currentItem = eyVar.h.getCurrentItem();
                            if (currentItem == 0) {
                                rxVar = eyVar.W;
                            } else if (currentItem == 1) {
                                rxVar = eyVar.f33564p0;
                            } else {
                                rxVar = eyVar.H0;
                            }
                            if (rxVar != null) {
                                rp rpVar = rxVar.d;
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
            addView(frameLayout3, b8.mf.d(56, 48.0f, (org.telegram.messenger.bd.f21784a0 ? 3 : i11) | 80, 0.0f, 0.0f, 2.0f, 0.0f));
            org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.k6.j0(org.telegram.messenger.g0.L(56.0f), z(i15), z(i15));
            b8.pf.a(vvVar);
            vvVar.setPadding(0, 0, org.telegram.messenger.g0.L(2.0f), 0);
            vvVar.setBackground(j02);
            vvVar.setContentDescription(org.telegram.messenger.bd.M0(2131754920, null));
            vvVar.setFocusable(true);
            frameLayout3.addView(vvVar, b8.mf.d(48, 48.0f, 51, 2.0f, 0.0f, 2.0f, 0.0f));
            view2.setVisibility(8);
        }
        addView(uvVar, 0, b8.mf.e(-1, -1, 51));
        ci.ec ecVar = new ci.ec(context2, 24);
        this.O0 = ecVar;
        int L2 = org.telegram.messenger.g0.L(6.0f);
        int i17 = org.telegram.ui.ActionBar.k6.f27907eg;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L2, z(i17));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i17);
        ecVar.setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(ecVar, d02, N, null, e6Var2);
        org.telegram.ui.ActionBar.r6.V(ecVar, org.telegram.ui.ActionBar.k6.f27888dg, e6Var2);
        ecVar.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(7.0f));
        char c2 = 16;
        ecVar.setGravity(16);
        ecVar.setTextSize(1, 14.0f);
        ecVar.setVisibility(4);
        addView(ecVar, b8.mf.d(-2, -2.0f, 81, 5.0f, 0.0f, 5.0f, 53.0f));
        this.D1 = org.telegram.messenger.g0.L(org.telegram.messenger.g0.Q1() ? 40.0f : 32.0f);
        Field field2 = wt.f40145f;
        wt wtVar = new wt(new vt(context2, e6Var2));
        if (wt.f40145f == null) {
            try {
                field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
                try {
                    field.setAccessible(true);
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                field = null;
            }
            wt.f40145f = field;
        }
        Field field3 = wt.f40145f;
        if (field3 != null) {
            try {
                wtVar.f40147a = (ViewTreeObserver.OnScrollChangedListener) field3.get(wtVar);
                wt.f40145f.set(wtVar, wt.f40146g);
            } catch (Exception unused3) {
                wtVar.f40147a = null;
            }
        }
        this.C1 = wtVar;
        wtVar.f40149c.setOnSelectionUpdateListener(new e(this, 10));
        this.B1 = org.telegram.messenger.hp.d1().getInt("selected_page", 0);
        HashMap hashMap = org.telegram.messenger.i6.h;
        if (!org.telegram.messenger.i6.f23454k) {
            org.telegram.messenger.i6.f23454k = true;
            SharedPreferences d12 = org.telegram.messenger.hp.d1();
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
                            char c10 = c2;
                            String[] strArr = split;
                            int i19 = 0;
                            while (i19 < 4) {
                                int i20 = i19;
                                sb2.insert(0, (char) longValue);
                                longValue >>= c10;
                                if (longValue == 0) {
                                    break;
                                }
                                i19 = i20 + 1;
                            }
                            if (sb2.length() > 0) {
                                hashMap.put(sb2.toString(), Utilities.z(split2[1]));
                            }
                            i18++;
                            c2 = c10;
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
                        String[] strArr2 = org.telegram.messenger.i6.f23458o;
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
                        org.telegram.messenger.i6.f23453j.put(split4[0], split4[1]);
                    }
                }
            } catch (Exception e11) {
                z20 = true;
                org.telegram.messenger.a8.g(e11, true);
                owVar2 = owVar4;
                z21 = false;
            }
        }
        owVar2 = owVar4;
        z21 = false;
        z20 = true;
        owVar2.F(z21);
        I(z20, z11, z12, z21);
        if (Build.VERSION.SDK_INT >= 31) {
            eh.g gVar = new eh.g(z21);
            this.f33552k2 = gVar;
            this.f33563o2.a(gVar);
            si.f fVar = new si.f(null);
            fVar.f54756f = cVar;
            fVar.d = gVar;
            fVar.f54755e = -2;
            eh.c cVar4 = new eh.c(fVar, fVar, fVar);
            this.f33560n2 = cVar4;
            cVar4.f9988k = true;
            int L3 = org.telegram.messenger.g0.L(org.telegram.messenger.lc.e(262144) ? 8.0f : 48.0f);
            cVar4.d = L3;
            cVar4.f9983e = L3;
            cVar4.f9987j = this.f33563o2;
        } else {
            eh.c cVar5 = new eh.c(cVar, cVar, cVar);
            this.f33560n2 = cVar5;
            cVar5.f9987j = this.f33563o2;
            this.f33552k2 = null;
        }
        this.f33555l2 = new rg(this, 1);
        setBlurredBackgroundDrawableFactory(this.f33560n2);
        this.f33563o2.i(this);
        this.f33563o2.f53602a = new bv(this, 0);
    }

    public static void a(ey eyVar, boolean z10) {
        jv jvVar = eyVar.f33545i0;
        if (jvVar != null) {
            int childCount = jvVar.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = jvVar.getChildAt(i3);
                if (childAt instanceof org.telegram.ui.Cells.h2) {
                    ImageReceiver photoImage = ((org.telegram.ui.Cells.h2) childAt).getPhotoImage();
                    if (z10) {
                        photoImage.f21272u0 = true;
                        photoImage.P0(false);
                    } else {
                        photoImage.f21272u0 = false;
                        photoImage.Q0();
                    }
                }
            }
        }
    }

    public static void b(ey eyVar, nx nxVar, String str) {
        String str2;
        String str3;
        boolean z10;
        String str4;
        fx fxVar;
        fc fcVar;
        org.telegram.ui.ActionBar.d2 d2Var = eyVar.Z1;
        int i3 = eyVar.f33529d1;
        ArrayList arrayList = eyVar.f33572r1;
        if (nxVar != null) {
            if (nxVar.getSpan() != null) {
                if (eyVar.f33582u1 != null) {
                    long j10 = nxVar.getSpan().documentId;
                    TLRPC.Document document = nxVar.getSpan().document;
                    sw swVar = nxVar.f36639e;
                    if (swVar != null && swVar.f38130i) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (document == null) {
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            sw swVar2 = (sw) arrayList.get(i10);
                            int i11 = 0;
                            while (true) {
                                ArrayList arrayList2 = swVar2.f38126c;
                                if (arrayList2 != null && i11 < arrayList2.size()) {
                                    if (((TLRPC.Document) swVar2.f38126c.get(i11)).f27007id == j10) {
                                        document = (TLRPC.Document) swVar2.f38126c.get(i11);
                                        break;
                                    }
                                    i11++;
                                }
                            }
                        }
                    }
                    if (document == null) {
                        document = g5.e(i3, j10);
                    }
                    TLRPC.Document document2 = document;
                    if (document2 != null) {
                        str4 = org.telegram.messenger.zi.U(document2);
                    } else {
                        str4 = null;
                    }
                    if (!org.telegram.messenger.zi.n3(document2) && !org.telegram.messenger.h10.i(i3).q() && (((fxVar = eyVar.f33582u1) == null || !fxVar.g()) && !eyVar.V0 && !z10)) {
                        eyVar.M(false);
                        if (d2Var != null) {
                            fcVar = fc.a0(d2Var);
                        } else {
                            fcVar = new fc(eyVar.f33570r, eyVar.f33520a2);
                        }
                        if (!eyVar.f33547i2 && d2Var != null) {
                            fcVar.K(2131624190, org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131743873, null)), org.telegram.messenger.bd.M0(2131747825, null), new av(eyVar, 4)).j();
                        } else {
                            fcVar.r(document2, org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131743874, null)), org.telegram.messenger.bd.M0(2131747041, null), new av(eyVar, 3)).j();
                        }
                        eyVar.f33547i2 = !eyVar.f33547i2;
                        return;
                    }
                    eyVar.E2 = SystemClock.elapsedRealtime();
                    eyVar.M(true);
                    eyVar.h("animated_" + j10);
                    eyVar.f33582u1.x(j10, document2, str4, nxVar.f36638c);
                    return;
                }
                return;
            }
            eyVar.E2 = SystemClock.elapsedRealtime();
            eyVar.M(true);
            if (str != null) {
                str2 = str;
            } else {
                str2 = (String) nxVar.getTag();
            }
            new SpannableStringBuilder().append((CharSequence) str2);
            if (str == null) {
                if (!nxVar.f36638c && (str3 = (String) org.telegram.messenger.i6.f23453j.get(str2)) != null) {
                    str2 = g(str2, str3);
                }
                eyVar.h(str2);
                fx fxVar2 = eyVar.f33582u1;
                if (fxVar2 != null) {
                    fxVar2.l(org.telegram.messenger.i6.c(str2));
                    return;
                }
                return;
            }
            fx fxVar3 = eyVar.f33582u1;
            if (fxVar3 != null) {
                fxVar3.l(org.telegram.messenger.i6.c(str));
            }
        }
    }

    public static void e(ey eyVar, int i3, int i10) {
        u4.d1 K;
        int[] iArr = eyVar.R0;
        if (i3 == 1) {
            eyVar.n(i10, eyVar.Q);
            return;
        }
        fx fxVar = eyVar.f33582u1;
        if ((fxVar == null || !fxVar.z()) && !eyVar.K0) {
            tj0 x10 = eyVar.x(i3);
            if (i10 > 0 && x10 != null && x10.getVisibility() == 0 && (K = x10.K(0)) != null && K.f55540a.getTop() + eyVar.f33527c1 >= x10.getPaddingTop()) {
                return;
            }
            int i11 = iArr[i3] - i10;
            iArr[i3] = i11;
            if (i11 > 0) {
                iArr[i3] = 0;
            } else if (i11 < (-org.telegram.messenger.g0.L(288.0f))) {
                iArr[i3] = -org.telegram.messenger.g0.L(288.0f);
            }
            if (i3 == 0) {
                eyVar.Z();
            } else {
                eyVar.y(i3).setTranslationY(Math.max(-org.telegram.messenger.g0.L(48.0f), iArr[i3]));
            }
        }
    }

    public static void f(ey eyVar, boolean z10) {
        int N0;
        kx kxVar = eyVar.f33548j0;
        lv lvVar = eyVar.f33564p0;
        jv jvVar = eyVar.f33545i0;
        if (jvVar != null && (jvVar.getAdapter() instanceof jx)) {
            jx jxVar = (jx) jvVar.getAdapter();
            if (!jxVar.f35211s && jxVar.h == 0 && !jxVar.f35214y.isEmpty() && (N0 = kxVar.N0()) != -1 && N0 > kxVar.B() - 5) {
                String str = jxVar.f35213x;
                String str2 = jxVar.f35210r;
                boolean z11 = jxVar.f35212w;
                jxVar.F(str, str2, true, z11, z11);
            }
        }
        fx fxVar = eyVar.f33582u1;
        if (fxVar != null && fxVar.z()) {
            boolean z12 = false;
            u4.d1 K = jvVar.K(0);
            if (K == null) {
                rx.a(lvVar, true, !z10);
                return;
            }
            if (K.f55540a.getTop() < jvVar.getPaddingTop()) {
                z12 = true;
            }
            rx.a(lvVar, z12, !z10);
        } else if (lvVar != null && jvVar != null) {
            lvVar.f37825a.a(true, !z10);
        }
    }

    public static String g(String str, String str2) {
        String str3;
        String str4;
        boolean z10 = true;
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
            str = com.google.android.recaptcha.internal.a.j(str, 2, 0);
        } else {
            z10 = false;
        }
        int length = str.length();
        if (length > 2 && str.charAt(str.length() - 2) == 8205) {
            str3 = str.substring(str.length() - 2);
            str = com.google.android.recaptcha.internal.a.j(str, 2, 0);
        } else if (length > 3 && str.charAt(str.length() - 3) == 8205) {
            str3 = str.substring(str.length() - 3);
            str = com.google.android.recaptcha.internal.a.j(str, 3, 0);
        } else {
            str3 = null;
        }
        String q10 = t4.c.q(str, str2);
        if (str3 != null) {
            q10 = t4.c.q(q10, str3);
        }
        if (z10) {
            return t4.c.q(q10, "\u200d➡");
        }
        return q10;
    }

    public static void j(int i3, View view) {
        if (view == null) {
            return;
        }
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i3);
    }

    public final void A() {
        rv rvVar = this.H0;
        if (rvVar != null) {
            rvVar.b();
        }
        lv lvVar = this.f33564p0;
        if (lvVar != null) {
            lvVar.b();
        }
        gv gvVar = this.W;
        if (gvVar != null) {
            gvVar.b();
        }
    }

    public final void B() {
        za.p pVar = this.N2;
        if (pVar != null) {
            pVar.a();
            this.N2 = null;
        }
        za.p pVar2 = this.O2;
        if (pVar2 != null) {
            pVar2.a();
            this.O2 = null;
            this.P2 = false;
        }
    }

    public final void C(boolean z10, boolean z11) {
        qx qxVar;
        boolean z12;
        if (this.B1 != 0 && this.f33593x1) {
            this.B1 = 0;
        }
        if (this.B1 == 0 && this.f33589w1) {
            this.B1 = 1;
        }
        int i3 = this.B1;
        uv uvVar = this.h;
        if (i3 != 0 && !z10 && this.f33531e.size() != 1) {
            int i10 = this.B1;
            if (i10 == 1) {
                L(false, false);
                if (!this.f33584v0 && !this.f33588w0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                Q(z12, false);
                if (uvVar.getCurrentItem() != 2) {
                    uvVar.x(2, false);
                }
                sv svVar = this.C0;
                if (svVar != null) {
                    this.T0 = true;
                    int i11 = this.H1;
                    if (i11 >= 0) {
                        svVar.m(i11);
                    } else {
                        int i12 = this.G1;
                        if (i12 >= 0) {
                            svVar.m(i12);
                        } else {
                            svVar.m(this.F1);
                        }
                    }
                    this.T0 = false;
                    this.F0.h1(0, 0);
                }
            } else if (i10 == 2) {
                L(false, false);
                Q(false, false);
                if (uvVar.getCurrentItem() != 1) {
                    uvVar.x(1, false);
                }
                mw mwVar = this.f33567q0;
                if (mwVar != null) {
                    mwVar.m(0);
                }
                lv lvVar = this.f33564p0;
                if (lvVar != null && (qxVar = lvVar.f37831r) != null) {
                    qxVar.I1(null);
                }
            }
        } else {
            L(true, false);
            Q(false, false);
            if (uvVar.getCurrentItem() != 0) {
                uvVar.x(0, !z10);
            }
            if (z11) {
                org.telegram.messenger.g0.i3(new av(this, 5), 350L);
            }
        }
        M(true);
    }

    public final void D() {
        vx vxVar = this.f33599z0;
        if (vxVar != null) {
            vxVar.f();
        }
        yx yxVar = this.A0;
        if (yxVar != null) {
            yxVar.f();
        }
        if (org.telegram.ui.is.p().E) {
            org.telegram.ui.is.p().m();
        }
        org.telegram.ui.is.p().t();
    }

    public final void E(int i3) {
        fx fxVar = this.f33582u1;
        if ((fxVar != null && fxVar.z()) || i3 == 0) {
            return;
        }
        HorizontalScrollView y9 = y(i3);
        this.R0[i3] = 0;
        y9.setTranslationY(0);
    }

    public final void G(int i3, int i10) {
        fw fwVar = this.R;
        View m10 = fwVar.m(i3);
        int L0 = fwVar.L0();
        int i11 = 1;
        if ((m10 == null && Math.abs(i3 - L0) > fwVar.J * 9.0f) || !org.telegram.messenger.az.c()) {
            if (fwVar.L0() < i3) {
                i11 = 0;
            }
            vi0 vi0Var = this.f33526c0;
            vi0Var.f39126b = i11;
            vi0Var.d(i3, i10, false, false);
            return;
        }
        this.K0 = true;
        gi.j1 j1Var = new gi.j1(1, this.Q.getContext(), this);
        j1Var.f55704a = i3;
        j1Var.f20461p = i10;
        fwVar.w0(j1Var);
    }

    public final void H(int i3, int i10) {
        pv pvVar = this.F0;
        View m10 = pvVar.m(i3);
        int L0 = pvVar.L0();
        int i11 = 1;
        if (m10 == null && Math.abs(i3 - L0) > 40) {
            if (pvVar.L0() < i3) {
                i11 = 0;
            }
            vi0 vi0Var = this.f33522b0;
            vi0Var.f39126b = i11;
            vi0Var.d(i3, i10, false, false);
            return;
        }
        this.K0 = true;
        this.E0.y0(i3);
    }

    public final void I(boolean z10, boolean z11, boolean z12, boolean z13) {
        ArrayList arrayList = this.f33531e;
        arrayList.clear();
        boolean z14 = false;
        int i3 = 0;
        while (true) {
            ArrayList arrayList2 = this.d;
            if (i3 >= arrayList2.size()) {
                break;
            }
            if (((zx) arrayList2.get(i3)).f41144a == 0 && z10) {
                arrayList.add((zx) arrayList2.get(i3));
            }
            if (((zx) arrayList2.get(i3)).f41144a == 1 && z12) {
                arrayList.add((zx) arrayList2.get(i3));
            }
            if (((zx) arrayList2.get(i3)).f41144a == 2 && z11) {
                arrayList.add((zx) arrayList2.get(i3));
            }
            i3++;
        }
        lb0 lb0Var = this.f33591x;
        if (lb0Var != null) {
            if (arrayList.size() > 1) {
                z14 = true;
            }
            org.telegram.messenger.g0.Z3(lb0Var, z14, 1.0f, true, z13);
        }
        uv uvVar = this.h;
        if (uvVar != null) {
            uvVar.setAdapter(null);
            uvVar.setAdapter(this.M0);
            if (lb0Var != null) {
                lb0Var.setViewPager(uvVar);
            }
        }
    }

    public final void J(final qh.a aVar, final TLObject tLObject, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final boolean z10, boolean z11) {
        String G;
        yx yxVar;
        ex exVar;
        if (stickerSet != null) {
            if (!z10 || (exVar = this.T) == null || exVar.d == stickerSet.f27028id) {
                if (!z10 && (yxVar = this.A0) != null && yxVar.d != stickerSet.f27028id) {
                    return;
                }
                final boolean B0 = org.telegram.messenger.li.b0(this.f33529d1).B0(stickerSet.f27028id, true);
                if (B0) {
                    if (stickerSet.masks) {
                        G = org.telegram.messenger.bd.G(stickerSet.count, "RemoveManyMasksCount", new Object[0]);
                    } else if (stickerSet.emojis) {
                        G = org.telegram.messenger.bd.G(stickerSet.count, "RemoveManyEmojiCount", new Object[0]);
                    } else {
                        G = org.telegram.messenger.bd.G(stickerSet.count, "RemoveManyStickersCount", new Object[0]);
                    }
                } else if (stickerSet.masks) {
                    G = org.telegram.messenger.bd.G(stickerSet.count, "AddManyMasksCount", new Object[0]);
                } else if (stickerSet.emojis) {
                    G = org.telegram.messenger.bd.G(stickerSet.count, "AddManyEmojiCount", new Object[0]);
                } else {
                    G = org.telegram.messenger.bd.G(stickerSet.count, "AddManyStickersCount", new Object[0]);
                }
                aVar.i(G, z11, true);
                aVar.f53941l0.a(!B0, z11);
                aVar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        int i3;
                        ey eyVar = ey.this;
                        org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(eyVar.f33529d1);
                        Context context = eyVar.getContext();
                        if (B0) {
                            i3 = 0;
                        } else {
                            i3 = 2;
                        }
                        int i10 = i3;
                        org.telegram.ui.ActionBar.d2 d2Var = eyVar.Z1;
                        FrameLayout frameLayout = eyVar.f33574s;
                        qh.a aVar2 = aVar;
                        TLObject tLObject2 = tLObject;
                        TLRPC.StickerSet stickerSet2 = stickerSet;
                        TLRPC.Document document2 = document;
                        boolean z12 = z10;
                        b02.g2(context, tLObject2, document2, i10, d2Var, frameLayout, false, true, new ci.v3(eyVar, aVar2, tLObject2, stickerSet2, document2, z12), false);
                        eyVar.J(aVar2, tLObject2, stickerSet2, document2, z12, true);
                    }
                });
            }
        }
    }

    public final void K(long j10, boolean z10, boolean z11) {
        int i3;
        View childAt;
        float f10;
        lb0 lb0Var = this.f33591x;
        if (lb0Var != null) {
            this.f33589w1 = z10;
            this.f33593x1 = z11;
            if (!z11 && !z10) {
                this.f33585v1 = 0L;
            } else {
                this.f33585v1 = j10;
            }
            if (z11) {
                i3 = 2;
            } else {
                i3 = 0;
            }
            LinearLayout linearLayout = lb0Var.d;
            if (i3 >= linearLayout.getChildCount()) {
                childAt = null;
            } else {
                childAt = linearLayout.getChildAt(i3);
            }
            if (childAt != null) {
                if (this.f33585v1 != 0) {
                    f10 = 0.15f;
                } else {
                    f10 = 1.0f;
                }
                childAt.setAlpha(f10);
                uv uvVar = this.h;
                if (z11) {
                    if (this.f33585v1 != 0 && uvVar.getCurrentItem() != 0) {
                        L(true, true);
                        Q(false, true);
                        uvVar.x(0, false);
                    }
                } else if (this.f33585v1 != 0 && uvVar.getCurrentItem() != 1) {
                    L(false, true);
                    Q(false, true);
                    uvVar.x(1, false);
                }
            }
        }
    }

    public final void L(boolean z10, boolean z11) {
        float f10;
        float f11;
        float f12;
        float f13;
        vv vvVar = this.f33595y;
        if (!z10 || vvVar.getTag() != null) {
            if ((!z10 && vvVar.getTag() != null) || this.f33566p2) {
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
            vvVar.setTag(num);
            int i3 = 0;
            float f14 = 0.0f;
            if (z11) {
                if (z10) {
                    vvVar.setVisibility(0);
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.G = animatorSet2;
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(vvVar, View.ALPHA, f12);
                if (z10) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(vvVar, View.SCALE_X, f13);
                if (z10) {
                    f14 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(vvVar, View.SCALE_Y, f14));
                this.G.setDuration(200L);
                this.G.setInterpolator(xq.f40453g);
                this.G.addListener(new bw(this, z10, 0));
                this.G.start();
                return;
            }
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            vvVar.setAlpha(f10);
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            vvVar.setScaleX(f11);
            if (z10) {
                f14 = 1.0f;
            }
            vvVar.setScaleY(f14);
            if (!z10) {
                i3 = 4;
            }
            vvVar.setVisibility(i3);
        }
    }

    public final void M(boolean z10) {
        Integer num;
        this.I = 0.0f;
        fx fxVar = this.f33582u1;
        if (fxVar != null && fxVar.z()) {
            z10 = false;
        }
        FrameLayout frameLayout = this.f33557n;
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

    public final void N(boolean z10, boolean z11) {
        View view = this.P;
        if (!z10 || view.getTag() != null) {
            if (!z10 && view.getTag() != null) {
                return;
            }
            AnimatorSet animatorSet = this.f33518a0;
            Integer num = null;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f33518a0 = null;
            }
            if (!z10) {
                num = 1;
            }
            view.setTag(num);
            float f10 = 0.0f;
            if (z11) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f33518a0 = animatorSet2;
                if (z10) {
                    f10 = 1.0f;
                }
                animatorSet2.playTogether(ObjectAnimator.ofFloat(view, View.ALPHA, f10));
                this.f33518a0.setDuration(200L);
                this.f33518a0.setInterpolator(xq.f40453g);
                this.f33518a0.addListener(new x5(this, 24));
                this.f33518a0.start();
                return;
            }
            if (z10) {
                f10 = 1.0f;
            }
            view.setAlpha(f10);
        }
    }

    public final void O(boolean z10) {
        for (int i3 = 0; i3 < 3; i3++) {
            u4.s w10 = w(i3);
            int L0 = w10.L0();
            if (z10) {
                if (L0 == 1 || L0 == 2) {
                    w10.n0(0);
                    E(i3);
                }
            } else if (L0 == 0) {
                w10.h1(0, 0);
            }
        }
    }

    public final void P(boolean z10, boolean z11, boolean z12) {
        float f10;
        float translationY;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.Chat M0 = org.telegram.messenger.hp.s1(this.f33529d1).M0(Long.valueOf(this.f33585v1));
        if (M0 != null) {
            ci.ec ecVar = this.O0;
            if (z10) {
                if (!org.telegram.messenger.t3.N(M0) && (tL_chatBannedRights = M0.default_banned_rights) != null && (tL_chatBannedRights.send_stickers || (z11 && tL_chatBannedRights.send_plain))) {
                    org.telegram.ui.ActionBar.d2 d2Var = this.Z1;
                    if (!(d2Var instanceof org.telegram.ui.wm) || !((org.telegram.ui.wm) d2Var).Y6()) {
                        if (z11) {
                            ecVar.setText(org.telegram.messenger.bd.M0(2131749554, null));
                        } else if (z12) {
                            ecVar.setText(org.telegram.messenger.bd.M0(2131749553, null));
                        } else {
                            ecVar.setText(org.telegram.messenger.bd.M0(2131749547, null));
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
                        if (z11) {
                            ecVar.setText(org.telegram.messenger.bd.M0(2131753943, null));
                        } else if (z12) {
                            ecVar.setText(org.telegram.messenger.bd.M0(2131753969, null));
                        } else {
                            ecVar.setText(org.telegram.messenger.bd.M0(2131753934, null));
                        }
                    } else {
                        if (z11) {
                            ecVar.setText(org.telegram.messenger.bd.a0("AttachPlainRestricted", null, 2131753944, org.telegram.messenger.bd.v(M0.banned_rights.until_date)));
                        }
                        if (z12) {
                            ecVar.setText(org.telegram.messenger.bd.a0("AttachGifRestricted", null, 2131753970, org.telegram.messenger.bd.v(M0.banned_rights.until_date)));
                        } else {
                            ecVar.setText(org.telegram.messenger.bd.a0("AttachStickersRestricted", null, 2131753935, org.telegram.messenger.bd.v(M0.banned_rights.until_date)));
                        }
                    }
                }
                ecVar.setVisibility(0);
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
                f10 = ecVar.getAlpha();
            } else {
                f10 = 1.0f;
            }
            float f12 = 0.0f;
            if (!z10) {
                f11 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ecVar, View.ALPHA, f10, f11);
            if (z10) {
                translationY = org.telegram.messenger.g0.L(12.0f);
            } else {
                translationY = ecVar.getTranslationY();
            }
            if (!z10) {
                f12 = org.telegram.messenger.g0.L(12.0f);
            }
            animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(ecVar, View.TRANSLATION_Y, translationY, f12));
            g2.o0 o0Var = this.R2;
            if (o0Var != null) {
                org.telegram.messenger.g0.r(o0Var);
            }
            if (z10) {
                g2.o0 o0Var2 = new g2.o0(this, z11, z12, 4);
                this.R2 = o0Var2;
                org.telegram.messenger.g0.i3(o0Var2, 3500L);
            }
            this.Q2.setDuration(320L);
            this.Q2.setInterpolator(xq.h);
            this.Q2.start();
        }
    }

    public final void Q(boolean z10, boolean z11) {
        float f10;
        float f11;
        float f12;
        float f13;
        ImageView imageView = this.E;
        if (imageView != null && !this.f33569q2) {
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
                    int i3 = 0;
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
                        this.H.setInterpolator(xq.f40453g);
                        this.H.addListener(new bw(this, z10, 1));
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
                        i3 = 4;
                    }
                    imageView.setVisibility(i3);
                }
            }
        }
    }

    public final void R() {
        int measuredHeight;
        int L;
        org.telegram.ui.ActionBar.d2 d2Var;
        View view = (View) getParent();
        if (view != null) {
            float y9 = getY();
            if (getLayoutParams().height > 0) {
                measuredHeight = getLayoutParams().height;
            } else {
                measuredHeight = getMeasuredHeight();
            }
            float f10 = y9 + measuredHeight;
            if ((!org.telegram.messenger.g0.E && ((d2Var = this.Z1) == null || !d2Var.isInBubbleMode())) || this.W0) {
                L = view.getHeight();
            } else {
                L = org.telegram.messenger.g0.L(1.0f);
            }
            float f11 = f10 - L;
            int i3 = (this.f33577s2 > 0.0f ? 1 : (this.f33577s2 == 0.0f ? 0 : -1));
            FrameLayout frameLayout = this.f33557n;
            if (i3 >= 0) {
                f11 += getMeasuredHeight() - this.f33577s2;
            } else if (frameLayout.getTop() - f11 < 0.0f || !this.f33598y2) {
                f11 = 0.0f;
            }
            float W1 = (-f11) + org.telegram.messenger.g0.W1(this.F2.f53840e, org.telegram.messenger.g0.L(50.0f), -this.f33573r2);
            frameLayout.setTranslationY(W1);
            if (this.f33532e0) {
                this.f33570r.setTranslationY(W1);
            }
        }
    }

    public final void S() {
        rx rxVar;
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
        vu vuVar;
        int z21;
        int z22;
        int z23;
        int z24;
        int z25;
        int z26;
        boolean z27 = this.f33584v0;
        View view = this.f33587w;
        if (!z27) {
            setBackground(null);
            view.setBackground(null);
        } else if (!org.telegram.messenger.g0.E && !this.O1) {
            int i3 = org.telegram.ui.ActionBar.k6.f28243wf;
            setBackgroundColor(z(i3));
            if (this.f33532e0) {
                view.setBackgroundColor(z(i3));
            }
        } else {
            Drawable background = getBackground();
            int z28 = z(org.telegram.ui.ActionBar.k6.f28243wf);
            if (background != null && (background != this.H2 || z28 != this.I2)) {
                this.H2 = background;
                this.I2 = z28;
                background.setColorFilter(new PorterDuffColorFilter(z28, PorterDuff.Mode.MULTIPLY));
            }
        }
        jw jwVar = this.J;
        if (jwVar != null) {
            if (this.f33584v0) {
                jwVar.setBackgroundColor(z(org.telegram.ui.ActionBar.k6.f28243wf));
                this.P.setBackgroundColor(z(org.telegram.ui.ActionBar.k6.f28299zf));
            } else {
                jwVar.setBackground(null);
            }
        }
        wt wtVar = this.C1;
        if (wtVar != null) {
            wtVar.f40149c.a();
        }
        int i10 = 0;
        while (true) {
            rxVar = this.W;
            z10 = this.f33550j2;
            if (i10 >= 3) {
                break;
            }
            if (i10 == 0) {
                rxVar = this.H0;
            } else if (i10 != 1) {
                rxVar = this.f33564p0;
            }
            if (rxVar != null) {
                rp rpVar = rxVar.d;
                FrameLayout frameLayout = rxVar.f37830n;
                View view2 = rxVar.f37829f;
                if (this.f33584v0) {
                    view2.setBackgroundColor(z(org.telegram.ui.ActionBar.k6.f28243wf));
                } else {
                    view2.setBackground(null);
                }
                rxVar.f37828e.setBackgroundColor(z(org.telegram.ui.ActionBar.k6.f28299zf));
                jl0 jl0Var = rxVar.f37827c;
                if (z10) {
                    z23 = v(0.4f);
                } else {
                    z23 = z(org.telegram.ui.ActionBar.k6.f28280yf);
                }
                jl0Var.a(z23);
                Drawable background2 = frameLayout.getBackground();
                if (z10) {
                    z24 = v(0.06f);
                } else {
                    z24 = z(org.telegram.ui.ActionBar.k6.f28262xf);
                }
                org.telegram.ui.ActionBar.k6.C1(z24, background2);
                frameLayout.invalidate();
                if (z10) {
                    z25 = v(0.45f);
                } else {
                    z25 = z(org.telegram.ui.ActionBar.k6.f28280yf);
                }
                rpVar.setHintTextColor(z25);
                if (z10) {
                    z26 = v(0.8f);
                } else {
                    z26 = z(org.telegram.ui.ActionBar.k6.G6);
                }
                rpVar.setTextColor(z26);
            }
            i10++;
        }
        Paint paint = this.f33579t1;
        if (paint != null) {
            paint.setColor(z(org.telegram.ui.ActionBar.k6.Pf));
        }
        rw rwVar = this.Q;
        if (rwVar != null) {
            rwVar.setGlowColor(z(org.telegram.ui.ActionBar.k6.f28243wf));
        }
        ov ovVar = this.E0;
        if (ovVar != null) {
            ovVar.setGlowColor(z(org.telegram.ui.ActionBar.k6.f28243wf));
        }
        sv svVar = this.C0;
        if (svVar != null) {
            svVar.setIndicatorColor(z(org.telegram.ui.ActionBar.k6.Ff));
            svVar.setUnderlineColor(z(org.telegram.ui.ActionBar.k6.f28299zf));
            if (this.f33584v0) {
                svVar.setBackgroundColor(z(org.telegram.ui.ActionBar.k6.f28243wf));
            } else {
                svVar.setBackground(null);
            }
        }
        mw mwVar = this.f33567q0;
        if (mwVar != null) {
            mwVar.setIndicatorColor(z(org.telegram.ui.ActionBar.k6.Ff));
            mwVar.setUnderlineColor(z(org.telegram.ui.ActionBar.k6.f28299zf));
            if (this.f33584v0) {
                mwVar.setBackgroundColor(z(org.telegram.ui.ActionBar.k6.f28243wf));
            } else {
                mwVar.setBackground(null);
            }
        }
        if (z10) {
            z11 = v(0.6f);
        } else {
            z11 = z(org.telegram.ui.ActionBar.k6.Gf);
        }
        if (z11 != this.J2) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.J2 = z11;
        vv vvVar = this.f33595y;
        if (vvVar != null) {
            if (z12) {
                vvVar.setColorFilter(new PorterDuffColorFilter(z11, PorterDuff.Mode.MULTIPLY));
            }
            if (rxVar == null) {
                Drawable background3 = vvVar.getBackground();
                int i11 = org.telegram.ui.ActionBar.k6.f28243wf;
                org.telegram.ui.ActionBar.k6.H1(background3, z(i11), false);
                org.telegram.ui.ActionBar.k6.H1(vvVar.getBackground(), z(i11), true);
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
        ci.ec ecVar = this.O0;
        if (ecVar != null) {
            if (ecVar.getBackground() instanceof ShapeDrawable) {
                ((ShapeDrawable) ecVar.getBackground()).getPaint().setColor(z(org.telegram.ui.ActionBar.k6.f27907eg));
                ecVar.invalidate();
            }
            ecVar.setTextColor(z(org.telegram.ui.ActionBar.k6.f27888dg));
        }
        jx jxVar = this.f33551k0;
        if (jxVar != null) {
            lx lxVar = jxVar.f35207e;
            int i12 = org.telegram.ui.ActionBar.k6.Af;
            int z29 = z(i12);
            if (z29 != this.K2) {
                this.K2 = z29;
                lxVar.f35898a.setColorFilter(new PorterDuffColorFilter(z29, PorterDuff.Mode.MULTIPLY));
            }
            lxVar.f35899b.setTextColor(z(i12));
            lxVar.f35900c.setProgressColor(z(org.telegram.ui.ActionBar.k6.f27955h6));
        }
        int z30 = z(org.telegram.ui.ActionBar.k6.Ci);
        if (this.f33538f2 == null || z30 != this.L2) {
            this.L2 = z30;
            this.f33538f2 = new PorterDuffColorFilter(z30, PorterDuff.Mode.SRC_IN);
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
                z21 = z(org.telegram.ui.ActionBar.k6.Cf);
            }
            org.telegram.ui.ActionBar.k6.E1(drawable, z21, false);
            Drawable drawable2 = drawableArr[i13];
            if (z10) {
                z22 = v(0.8f);
            } else {
                z22 = z(org.telegram.ui.ActionBar.k6.Df);
            }
            org.telegram.ui.ActionBar.k6.E1(drawable2, z22, true);
            i13++;
        }
        if (jwVar != null && (vuVar = jwVar.E) != null) {
            vuVar.d();
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
                z19 = z(org.telegram.ui.ActionBar.k6.Bf);
            }
            org.telegram.ui.ActionBar.k6.E1(drawable3, z19, false);
            Drawable drawable4 = drawableArr2[i14];
            if (z10) {
                z20 = v(0.8f);
            } else {
                z20 = z(org.telegram.ui.ActionBar.k6.Df);
            }
            org.telegram.ui.ActionBar.k6.E1(drawable4, z20, true);
            i14++;
        }
        int i15 = 0;
        while (true) {
            Drawable[] drawableArr3 = this.f33519a1;
            if (i15 >= drawableArr3.length) {
                break;
            }
            Drawable drawable5 = drawableArr3[i15];
            if (z10) {
                z17 = v(0.4f);
            } else {
                z17 = z(org.telegram.ui.ActionBar.k6.Bf);
            }
            org.telegram.ui.ActionBar.k6.E1(drawable5, z17, false);
            Drawable drawable6 = drawableArr3[i15];
            if (z10) {
                z18 = v(0.8f);
            } else {
                z18 = z(org.telegram.ui.ActionBar.k6.Df);
            }
            org.telegram.ui.ActionBar.k6.E1(drawable6, z18, true);
            i15++;
        }
        org.telegram.ui.ActionBar.t5 t5Var = this.f33524b2;
        if (t5Var != null) {
            if (z10) {
                z15 = v(0.4f);
            } else {
                z15 = z(org.telegram.ui.ActionBar.k6.Cf);
            }
            org.telegram.ui.ActionBar.k6.E1(t5Var, z15, false);
            if (z10) {
                z16 = v(0.8f);
            } else {
                z16 = z(org.telegram.ui.ActionBar.k6.Df);
            }
            org.telegram.ui.ActionBar.k6.E1(t5Var, z16, true);
        }
        org.telegram.ui.ActionBar.t5 t5Var2 = this.c2;
        if (t5Var2 != null) {
            if (z10) {
                z13 = v(0.4f);
            } else {
                z13 = z(org.telegram.ui.ActionBar.k6.Ff);
            }
            org.telegram.ui.ActionBar.k6.E1(t5Var2, z13, false);
            if (z10) {
                z14 = v(0.8f);
            } else {
                z14 = z(org.telegram.ui.ActionBar.k6.Ff);
            }
            org.telegram.ui.ActionBar.k6.E1(t5Var2, z14, true);
        }
    }

    public final void T() {
        rw rwVar = this.Q;
        if (rwVar != null) {
            for (int i3 = 0; i3 < rwVar.getChildCount(); i3++) {
                View childAt = rwVar.getChildAt(i3);
                if (childAt instanceof ww) {
                    ((ww) childAt).a(true);
                }
            }
        }
    }

    public final void U(int i3) {
        int i10;
        if (!this.f33539g0) {
            int i11 = -1;
            if (i3 != -1) {
                int size = getRecentEmoji().size() + (this.f33532e0 ? 1 : 0);
                ow owVar = this.S;
                int i12 = owVar.f36949c;
                ArrayList arrayList = owVar.f36957y;
                int i13 = 0;
                if (i12 >= 0) {
                    i10 = 3;
                } else {
                    i10 = 0;
                }
                int i14 = size + i10;
                if (i3 >= i14) {
                    int i15 = 0;
                    while (true) {
                        String[][] strArr = org.telegram.messenger.j6.f23644f;
                        if (i15 >= 8) {
                            break;
                        }
                        i14 += strArr[i15].length + 1;
                        if (i3 < i14) {
                            i11 = i15 + 1;
                            break;
                        }
                        i15++;
                    }
                    if (i11 < 0) {
                        ArrayList<sw> emojipacks = getEmojipacks();
                        int size2 = arrayList.size() - 1;
                        while (true) {
                            if (size2 < 0) {
                                break;
                            } else if (((Integer) arrayList.get(size2)).intValue() <= i3) {
                                sw swVar = (sw) this.f33572r1.get(size2);
                                while (i13 < emojipacks.size()) {
                                    long j10 = emojipacks.get(i13).f38125b.f27028id;
                                    long j11 = swVar.f38125b.f27028id;
                                    if (j10 == j11 && (!swVar.f38129g || (!swVar.f38128f && !this.f33568q1.contains(Long.valueOf(j11))))) {
                                        char[] cArr = org.telegram.messenger.j6.f23640a;
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

    public final void V() {
        boolean z10;
        boolean z11;
        int i3;
        qx qxVar;
        int i10;
        boolean z12;
        boolean z13;
        mw mwVar = this.f33567q0;
        int currentPosition = mwVar.getCurrentPosition();
        int i11 = this.f33575s0;
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
        boolean isEmpty = this.f33549j1.isEmpty();
        mwVar.d(false);
        this.f33575s0 = -2;
        this.f33578t0 = -2;
        this.f33581u0 = -2;
        Drawable[] drawableArr = this.f33519a1;
        if (!isEmpty) {
            this.f33575s0 = 0;
            mwVar.b(0, drawableArr[0]).setContentDescription(org.telegram.messenger.bd.M0(2131746372, null));
            i3 = 1;
        } else {
            i3 = 0;
        }
        this.f33578t0 = i3;
        mwVar.b(1, drawableArr[1]).setContentDescription(org.telegram.messenger.bd.M0(2131750835, null));
        this.f33581u0 = i3 + 1;
        org.telegram.messenger.g0.L(13.0f);
        org.telegram.messenger.g0.L(11.0f);
        int i12 = this.f33529d1;
        ArrayList arrayList = org.telegram.messenger.hp.s1(i12).f22977c4;
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            String str = (String) arrayList.get(i13);
            org.telegram.messenger.e6 g7 = org.telegram.messenger.i6.g(str);
            if (g7 != null) {
                TLRPC.Document T = org.telegram.messenger.li.b0(i12).T(str);
                String i14 = k2.p1.i(i13 + 3, "tab");
                int i15 = mwVar.f39174y;
                mwVar.f39174y = i15 + 1;
                ev0 ev0Var = (ev0) mwVar.f39162n.get(i14);
                if (ev0Var != null) {
                    mwVar.g(i14, ev0Var, i15);
                    i10 = currentPosition;
                    z12 = z11;
                } else {
                    i10 = currentPosition;
                    z12 = z11;
                    ev0Var = new ev0(mwVar.getContext(), 2);
                    ev0Var.setFocusable(true);
                    ev0Var.setOnClickListener(new ok0(mwVar, 2));
                    ev0Var.setExpanded(mwVar.f39156g0);
                    ev0Var.a(mwVar.f39159j0);
                    mwVar.f39152e.addView(ev0Var, i15);
                }
                ev0Var.d = false;
                ev0Var.setTag(2131296461, Integer.valueOf(i15));
                ev0Var.setTag(2131296591, g7);
                ev0Var.setTag(2131296585, T);
                if (i15 == mwVar.E) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                ev0Var.setSelected(z13);
                mwVar.h.put(i14, ev0Var);
                ev0Var.setContentDescription(str);
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
        mwVar.h();
        mwVar.q();
        if (z10 && isEmpty) {
            mwVar.m(this.f33578t0);
            lv lvVar = this.f33564p0;
            if (lvVar != null && (qxVar = lvVar.f37831r) != null) {
                qxVar.I1(null);
                return;
            }
            return;
        }
        WeakHashMap weakHashMap = r0.i0.f54015a;
        if (mwVar.isLaidOut()) {
            if (!isEmpty && !z14) {
                mwVar.k(i16 + 1, 0);
            } else if (isEmpty && z14) {
                mwVar.k(i16 - 1, 0);
            }
        }
    }

    public final void W() {
        jx jxVar;
        int size = this.f33549j1.size();
        long n4 = org.telegram.messenger.li.n(Integer.MAX_VALUE, this.f33549j1);
        ArrayList arrayList = new ArrayList(org.telegram.messenger.li.b0(this.f33529d1).f24031j0);
        this.f33549j1 = arrayList;
        long n10 = org.telegram.messenger.li.n(Integer.MAX_VALUE, arrayList);
        if ((this.f33567q0 != null && size == 0 && !this.f33549j1.isEmpty()) || (size != 0 && this.f33549j1.isEmpty())) {
            V();
        }
        if ((size != this.f33549j1.size() || n4 != n10) && (jxVar = this.f33561o0) != null) {
            jxVar.f();
        }
    }

    public final void X(boolean z10) {
        boolean z11;
        TLRPC.Document document;
        boolean z12;
        int i3;
        boolean z13;
        org.telegram.ui.ActionBar.e6 e6Var;
        boolean z14;
        boolean z15;
        ArrayList<TLRPC.Document> arrayList;
        boolean z16;
        ArrayList<TLRPC.Document> arrayList2;
        TLRPC.StickerSet stickerSet;
        int i10;
        sv svVar = this.C0;
        if (svVar != null) {
            org.telegram.ui.s51 s51Var = svVar.f39152e;
            if (svVar.f39169s != null) {
                return;
            }
            this.G1 = -2;
            this.H1 = -2;
            this.I1 = -2;
            this.J1 = -2;
            int i11 = 0;
            this.f33536f0 = false;
            this.F1 = 0;
            int currentPosition = svVar.getCurrentPosition();
            if (getParent() != null && getVisibility() == 0 && (this.f33600z1.size() != 0 || this.A1.size() != 0)) {
                z11 = true;
            } else {
                z11 = false;
            }
            svVar.d(z11);
            int i12 = this.f33529d1;
            org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(i12);
            SharedPreferences sharedPreferences = org.telegram.messenger.hp.s1(i12).f23009f7;
            ArrayList arrayList3 = this.f33559n1;
            arrayList3.clear();
            ArrayList arrayList4 = b02.f24051t0[0];
            int size = arrayList4.size();
            for (int i13 = 0; i13 < size; i13++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList4.get(i13);
                if (!b02.B0(stickerSetCovered.set.f27028id, true)) {
                    arrayList3.add(stickerSetCovered);
                }
            }
            cy cyVar = this.G0;
            if (cyVar != null) {
                cyVar.f();
            }
            boolean isEmpty = arrayList4.isEmpty();
            long j10 = 0;
            Drawable[] drawableArr = this.Z0;
            org.telegram.ui.ActionBar.e6 e6Var2 = null;
            if (!isEmpty && (arrayList3.isEmpty() || sharedPreferences.getLong("featured_hidden", 0L) == ((TLRPC.StickerSetCovered) arrayList4.get(0)).set.f27028id)) {
                if (b02.f24055v0[0].isEmpty()) {
                    i10 = 2;
                } else {
                    i10 = 3;
                }
                ev0 c2 = svVar.c(i10, drawableArr[i10]);
                c2.h.setText(org.telegram.messenger.bd.M0(2131750832, null));
                c2.setContentDescription(org.telegram.messenger.bd.M0(2131750834, null));
                int i14 = this.F1;
                this.I1 = i14;
                this.F1 = i14 + 1;
            }
            if (!this.f33554l1.isEmpty()) {
                int i15 = this.F1;
                this.H1 = i15;
                this.F1 = i15 + 1;
                ev0 c10 = svVar.c(1, drawableArr[1]);
                c10.h.setText(org.telegram.messenger.bd.M0(2131750839, null));
                c10.setContentDescription(org.telegram.messenger.bd.M0(2131750842, null));
            }
            if (!this.k1.isEmpty()) {
                int i16 = this.F1;
                this.G1 = i16;
                this.F1 = i16 + 1;
                ev0 c11 = svVar.c(0, drawableArr[0]);
                c11.h.setText(org.telegram.messenger.bd.M0(2131746371, null));
                c11.setContentDescription(org.telegram.messenger.bd.M0(2131746372, null));
            }
            ArrayList arrayList5 = this.f33533e1;
            arrayList5.clear();
            this.f33546i1 = null;
            this.f33540g1 = -1;
            this.f33537f1 = -10;
            if (this.G2 == null || z10) {
                this.G2 = new ArrayList(b02.s0(0));
            }
            ArrayList arrayList6 = this.G2;
            int i17 = 0;
            while (true) {
                TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.f33597y1;
                if (i17 >= stickerSetCoveredArr.length) {
                    break;
                }
                TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCoveredArr[i17];
                long j11 = j10;
                if (stickerSetCovered2 != null) {
                    TLRPC.TL_messages_stickerSet o02 = b02.o0(stickerSetCovered2.set.f27028id);
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
                j10 = j11;
            }
            long j12 = j10;
            ArrayList w02 = org.telegram.messenger.hp.s1(i12).w0(arrayList6);
            for (int i18 = 0; i18 < w02.size(); i18++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) w02.get(i18);
                TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet2.set;
                if ((stickerSet2 == null || !stickerSet2.archived) && (arrayList2 = tL_messages_stickerSet2.documents) != null && !arrayList2.isEmpty()) {
                    arrayList5.add(tL_messages_stickerSet2);
                }
            }
            if (this.K1 != null) {
                long j13 = org.telegram.messenger.hp.s1(i12).f23009f7.getLong("group_hide_stickers_" + this.K1.f27002id, -1L);
                TLRPC.Chat M0 = org.telegram.messenger.hp.s1(i12).M0(Long.valueOf(this.K1.f27002id));
                if (M0 != null && this.K1.stickerset != null && org.telegram.messenger.t3.N(M0)) {
                    TLRPC.StickerSet stickerSet3 = this.K1.stickerset;
                    if (stickerSet3 != null) {
                        if (j13 == stickerSet3.f27028id) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        this.f33543h1 = z16;
                    }
                } else {
                    if (j13 != -1) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    this.f33543h1 = z15;
                }
                TLRPC.ChatFull chatFull = this.K1;
                TLRPC.StickerSet stickerSet4 = chatFull.stickerset;
                if (stickerSet4 != null) {
                    TLRPC.TL_messages_stickerSet Y = b02.Y(stickerSet4);
                    if (Y != null && (arrayList = Y.documents) != null && !arrayList.isEmpty() && Y.set != null) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = new TLRPC.TL_messages_stickerSet();
                        tL_messages_stickerSet3.documents = Y.documents;
                        tL_messages_stickerSet3.packs = Y.packs;
                        tL_messages_stickerSet3.set = Y.set;
                        if (this.f33543h1) {
                            this.f33537f1 = arrayList5.size();
                            arrayList5.add(tL_messages_stickerSet3);
                        } else {
                            this.f33537f1 = 0;
                            arrayList5.add(0, tL_messages_stickerSet3);
                        }
                        if (!this.K1.can_set_stickers) {
                            tL_messages_stickerSet3 = null;
                        }
                        this.f33546i1 = tL_messages_stickerSet3;
                    }
                } else if (chatFull.can_set_stickers) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = new TLRPC.TL_messages_stickerSet();
                    if (this.f33543h1) {
                        this.f33537f1 = arrayList5.size();
                        arrayList5.add(tL_messages_stickerSet4);
                    } else {
                        this.f33537f1 = 0;
                        arrayList5.add(0, tL_messages_stickerSet4);
                    }
                }
            }
            int i19 = 0;
            while (i19 < arrayList5.size()) {
                if (i19 == this.f33537f1) {
                    TLRPC.Chat M02 = org.telegram.messenger.hp.s1(i12).M0(Long.valueOf(this.K1.f27002id));
                    if (M02 == null) {
                        arrayList5.remove(i11);
                        i19--;
                    } else {
                        this.f33536f0 = true;
                        String str = "chat" + M02.f27001id;
                        int i20 = svVar.f39174y;
                        svVar.f39174y = i20 + 1;
                        ev0 ev0Var = (ev0) svVar.f39162n.get(str);
                        if (ev0Var != null) {
                            svVar.g(str, ev0Var, i20);
                        } else {
                            ev0Var = new ev0(svVar.getContext(), i11);
                            ev0Var.setFocusable(true);
                            ev0Var.setOnClickListener(new ok0(svVar, i11));
                            s51Var.addView(ev0Var, i20);
                            ev0Var.f33477x = true;
                            u8 u8Var = new u8(e6Var2);
                            u8Var.u(org.telegram.messenger.g0.L(14.0f));
                            u8Var.q(M02);
                            int i21 = svVar.f39145a;
                            k9 k9Var = ev0Var.f33471e;
                            k9Var.setLayerNum(i21);
                            k9Var.e(M02, u8Var);
                            k9Var.setAspectFit(true);
                            ev0Var.setExpanded(svVar.f39156g0);
                            ev0Var.a(svVar.f39159j0);
                            ev0Var.h.setText(M02.title);
                        }
                        ev0Var.d = true;
                        ev0Var.setTag(2131296461, Integer.valueOf(i20));
                        if (i20 == svVar.E) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        ev0Var.setSelected(z14);
                        svVar.h.put(str, ev0Var);
                    }
                    i3 = 0;
                    e6Var = null;
                } else {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet5 = (TLRPC.TL_messages_stickerSet) arrayList5.get(i19);
                    TLRPC.StickerSet stickerSet5 = tL_messages_stickerSet5.set;
                    if (stickerSet5 != null && stickerSet5.thumb_document_id != j12) {
                        for (int i22 = 0; i22 < tL_messages_stickerSet5.documents.size(); i22++) {
                            document = tL_messages_stickerSet5.documents.get(i22);
                            if (document != null && tL_messages_stickerSet5.set.thumb_document_id == document.f27007id) {
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
                    String str2 = "set" + tL_messages_stickerSet5.set.f27028id;
                    int i23 = svVar.f39174y;
                    svVar.f39174y = i23 + 1;
                    ev0 ev0Var2 = (ev0) svVar.f39162n.get(str2);
                    if (ev0Var2 != null) {
                        svVar.g(str2, ev0Var2, i23);
                    } else {
                        ev0Var2 = new ev0(svVar.getContext(), 0);
                        ev0Var2.setFocusable(true);
                        ev0Var2.setOnClickListener(new ok0(svVar, 1));
                        ev0Var2.setExpanded(svVar.f39156g0);
                        ev0Var2.a(svVar.f39159j0);
                        s51Var.addView(ev0Var2, i23);
                    }
                    ev0Var2.f33471e.setLayerNum(svVar.f39145a);
                    i3 = 0;
                    ev0Var2.d = false;
                    ev0Var2.setTag(w10);
                    ev0Var2.setTag(2131296461, Integer.valueOf(i23));
                    ev0Var2.setTag(2131296591, tL_messages_stickerSet5);
                    ev0Var2.setTag(2131296585, document);
                    if (i23 == svVar.E) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    ev0Var2.setSelected(z13);
                    svVar.h.put(str2, ev0Var2);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(tL_messages_stickerSet5.set.title);
                    sb2.append(", ");
                    e6Var = null;
                    sb2.append(org.telegram.messenger.bd.M0(2131754757, null));
                    ev0Var2.setContentDescription(sb2.toString());
                }
                i19++;
                i11 = i3;
                e6Var2 = e6Var;
            }
            svVar.h();
            svVar.q();
            if (currentPosition != 0) {
                svVar.k(currentPosition, currentPosition);
            }
            o();
        }
    }

    @Override
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = 4;
        if (i3 == 0) {
            q(false);
            float f12 = 1.0f - this.f33517a.f53840e;
            rv rvVar = this.H0;
            rvVar.setAlpha(f12);
            if (f12 > 0.0f) {
                i12 = 0;
            } else {
                i12 = 4;
            }
            rvVar.setVisibility(i12);
            float f13 = 1.0f - f12;
            qh.c cVar2 = this.I0;
            cVar2.setAlpha(f13);
            cVar2.setTranslationY((-org.telegram.messenger.g0.L(15.0f)) * f12);
            int i15 = (f13 > 0.0f ? 1 : (f13 == 0.0f ? 0 : -1));
            if (i15 > 0) {
                i13 = 0;
            } else {
                i13 = 4;
            }
            cVar2.setVisibility(i13);
            org.telegram.ui.n61 n61Var = this.N;
            n61Var.setAlpha(f13);
            n61Var.setTranslationY(org.telegram.messenger.g0.L(30.0f) * f12);
            if (i15 > 0) {
                i14 = 0;
            }
            n61Var.setVisibility(i14);
            R();
            this.f33596y0.invalidate();
        } else if (i3 == 1) {
            l(false);
            float f14 = 1.0f - this.f33521b.f53840e;
            gv gvVar = this.W;
            gvVar.setAlpha(f14);
            if (f14 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            gvVar.setVisibility(i10);
            float f15 = 1.0f - f14;
            qh.c cVar3 = this.V;
            cVar3.setAlpha(f15);
            cVar3.setTranslationY((-org.telegram.messenger.g0.L(15.0f)) * f14);
            int i16 = (f15 > 0.0f ? 1 : (f15 == 0.0f ? 0 : -1));
            if (i16 > 0) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            cVar3.setVisibility(i11);
            org.telegram.ui.n61 n61Var2 = this.L;
            n61Var2.setAlpha(f15);
            n61Var2.setTranslationY(org.telegram.messenger.g0.L(30.0f) * f14);
            if (i16 > 0) {
                i14 = 0;
            }
            n61Var2.setVisibility(i14);
            R();
            this.K.invalidate();
        }
    }

    public final void Z() {
        boolean z10;
        int i3;
        tv tvVar = this.D0;
        sv svVar = this.C0;
        if (svVar != null && tvVar == null && this.f33582u1 != null) {
            svVar.setTranslationY(this.f33582u1.p() * (-org.telegram.messenger.g0.L(50.0f)));
        }
        if (tvVar == null) {
            return;
        }
        if (getVisibility() == 0 && this.L0 && this.f33582u1.p() != 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        tvVar.setVisibility(i3);
        if (z10) {
            Rect rect = this.f33601z2;
            rect.setEmpty();
            this.h.getChildVisibleRect(this.f33596y0, rect, null);
            float p10 = this.f33582u1.p() * org.telegram.messenger.g0.L(50.0f);
            int i10 = rect.left;
            if (i10 != 0 || p10 != 0.0f) {
                this.Y1 = false;
            }
            tvVar.setTranslationX(i10);
            float translationY = (((getTranslationY() + getTop()) - tvVar.getTop()) - svVar.getExpandedOffset()) - p10;
            if (tvVar.getTranslationY() != translationY) {
                tvVar.setTranslationY(translationY);
                tvVar.invalidate();
            }
        }
        if (this.Y1 && z10 && this.Q0) {
            svVar.i(true, this.X1);
            return;
        }
        this.Y1 = false;
        svVar.i(false, this.X1);
    }

    public final void a0() {
        int i3;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        LongSparseArray longSparseArray = this.A1;
        LongSparseArray longSparseArray2 = this.f33600z1;
        int i10 = this.f33529d1;
        ov ovVar = this.E0;
        if (ovVar != null) {
            try {
                int childCount = ovVar.getChildCount();
                int i11 = 0;
                int i12 = 0;
                while (i12 < childCount) {
                    View childAt = ovVar.getChildAt(i12);
                    if (!(childAt instanceof org.telegram.ui.Cells.u3) || ((bj0) ovVar.T(childAt)) == null) {
                        i3 = i12;
                    } else {
                        org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) childAt;
                        ArrayList arrayList = org.telegram.messenger.li.b0(i10).f24055v0[i11];
                        TLRPC.StickerSetCovered stickerSet = u3Var.getStickerSet();
                        if (arrayList != null && arrayList.contains(Long.valueOf(stickerSet.set.f27028id))) {
                            z10 = true;
                        } else {
                            z10 = i11;
                        }
                        int i13 = i11;
                        while (true) {
                            TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.f33597y1;
                            if (i13 < stickerSetCoveredArr.length) {
                                TLRPC.StickerSetCovered stickerSetCovered = stickerSetCoveredArr[i13];
                                if (stickerSetCovered != null) {
                                    i3 = i12;
                                    if (stickerSetCovered.set.f27028id == stickerSet.set.f27028id) {
                                        z11 = true;
                                        break;
                                    }
                                } else {
                                    i3 = i12;
                                }
                                i13++;
                                i12 = i3;
                            } else {
                                i3 = i12;
                                z11 = false;
                                break;
                            }
                        }
                        u3Var.c(stickerSet, z10, true, 0, 0, z11);
                        if (z10) {
                            org.telegram.messenger.li.b0(i10).e1(stickerSet.set.f27028id);
                        }
                        if (longSparseArray2.indexOfKey(stickerSet.set.f27028id) >= 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (longSparseArray.indexOfKey(stickerSet.set.f27028id) >= 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z12 || z13) {
                            if (z12 && u3Var.f30644r) {
                                longSparseArray2.remove(stickerSet.set.f27028id);
                                z12 = false;
                            } else if (z13 && !u3Var.f30644r) {
                                longSparseArray.remove(stickerSet.set.f27028id);
                            }
                        }
                        if (!z11 && z12) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        u3Var.b(z14, true);
                    }
                    i12 = i3 + 1;
                    i11 = 0;
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    @Override
    public final void c(int i3) {
        setBottomInset(i3);
    }

    @Override
    public final void d(float f10) {
        this.f33577s2 = f10;
        R();
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        org.telegram.messenger.u10 u10Var;
        TLRPC.StickerSet stickerSet;
        int i11 = org.telegram.messenger.hs.f23333x0;
        ow owVar = this.S;
        av avVar = this.S2;
        if (i3 == i11) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (this.f33599z0 != null) {
                    X(((Boolean) objArr[1]).booleanValue());
                    a0();
                    D();
                    o();
                }
            } else if (((Integer) objArr[0]).intValue() == 5) {
                if (((Boolean) objArr[1]).booleanValue()) {
                    org.telegram.messenger.g0.r(avVar);
                    org.telegram.messenger.g0.i3(avVar, 100L);
                    return;
                }
                owVar.F(false);
            }
        } else if (i3 == org.telegram.messenger.hs.f23289q3) {
            long longValue = ((Long) objArr[0]).longValue();
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            TLRPC.ChatFull chatFull = this.K1;
            if (chatFull != null && chatFull.f27002id == longValue && booleanValue) {
                owVar.F(true);
            }
        } else if (i3 == org.telegram.messenger.hs.X0) {
            boolean booleanValue2 = ((Boolean) objArr[0]).booleanValue();
            int intValue = ((Integer) objArr[1]).intValue();
            if (booleanValue2 || intValue == 0 || intValue == 2) {
                k(booleanValue2);
            }
        } else if (i3 == org.telegram.messenger.hs.f23347z0) {
            a0();
            lb0 lb0Var = this.f33591x;
            if (lb0Var != null) {
                int childCount = lb0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    lb0Var.getChildAt(i12).invalidate();
                }
            }
            X(false);
        } else if (i3 == org.telegram.messenger.hs.A0) {
            if (owVar != null) {
                owVar.F(false);
            }
        } else {
            int i13 = org.telegram.messenger.hs.B0;
            ex exVar = this.T;
            if (i3 == i13) {
                Long l10 = (Long) objArr[0];
                long longValue2 = l10.longValue();
                if (objArr.length > 1) {
                    tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) objArr[1];
                } else {
                    tL_messages_stickerSet = null;
                }
                if (tL_messages_stickerSet != null) {
                    yx yxVar = this.A0;
                    if (yxVar != null && yxVar.d == longValue2 && yxVar.f40843f.size() < tL_messages_stickerSet.documents.size()) {
                        yxVar.f40843f = tL_messages_stickerSet.documents;
                        yxVar.f();
                    }
                    if (exVar != null && exVar.d == longValue2 && exVar.f33493f.size() < tL_messages_stickerSet.documents.size()) {
                        exVar.f33493f = tL_messages_stickerSet.documents;
                        exVar.f();
                    }
                }
                TLRPC.ChatFull chatFull2 = this.K1;
                if (chatFull2 != null && (stickerSet = chatFull2.stickerset) != null && stickerSet.f27028id == longValue2) {
                    X(false);
                }
                HashMap hashMap = this.f33576s1;
                if (hashMap.containsKey(l10) && objArr.length >= 2 && ((org.telegram.messenger.u10) hashMap.get(l10)) != null && tL_messages_stickerSet != null && (u10Var = (org.telegram.messenger.u10) hashMap.remove(l10)) != null) {
                    u10Var.a(tL_messages_stickerSet);
                }
                org.telegram.messenger.g0.r(avVar);
                org.telegram.messenger.g0.i3(avVar, 100L);
                return;
            }
            int i14 = org.telegram.messenger.hs.f23246i4;
            rw rwVar = this.Q;
            if (i3 == i14) {
                ov ovVar = this.E0;
                if (ovVar != null) {
                    int childCount2 = ovVar.getChildCount();
                    for (int i15 = 0; i15 < childCount2; i15++) {
                        View childAt = ovVar.getChildAt(i15);
                        if ((childAt instanceof org.telegram.ui.Cells.i8) || (childAt instanceof org.telegram.ui.Cells.y7)) {
                            childAt.invalidate();
                        }
                    }
                }
                if (rwVar != null) {
                    rwVar.invalidate();
                    int childCount3 = rwVar.getChildCount();
                    for (int i16 = 0; i16 < childCount3; i16++) {
                        View childAt2 = rwVar.getChildAt(i16);
                        if (childAt2 instanceof nx) {
                            childAt2.invalidate();
                        }
                    }
                }
                wt wtVar = this.C1;
                if (wtVar != null) {
                    wtVar.f40149c.invalidate();
                }
                mw mwVar = this.f33567q0;
                if (mwVar != null) {
                    org.telegram.ui.s51 s51Var = mwVar.f39152e;
                    int childCount4 = s51Var.getChildCount();
                    for (int i17 = 0; i17 < childCount4; i17++) {
                        s51Var.getChildAt(i17).invalidate();
                    }
                }
            } else if (i3 == org.telegram.messenger.hs.L2) {
                if (rwVar != null && this.f33532e0) {
                    if ((this.W.f37827c.f35109k == 2 || rwVar.getAdapter() == exVar) && !TextUtils.isEmpty(exVar.f33497w)) {
                        exVar.F(exVar.f33497w, true);
                    }
                }
            } else if (i3 == org.telegram.messenger.hs.f23230f5) {
                if (owVar != null) {
                    owVar.F(false);
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
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.h) {
            canvas.save();
            if (this.f33557n.getVisibility() != 8 && !this.f33584v0 && this.f33592x0) {
                canvas.drawColor(i0.a.o(-1, 25));
            }
            boolean drawChild = super.drawChild(canvas, view, j10);
            float R0 = org.telegram.messenger.g0.R0(this.f33573r2);
            if (R0 > 0.0f) {
                int r12 = org.telegram.ui.ActionBar.k6.r1(R0, z(org.telegram.ui.ActionBar.k6.f28243wf));
                int i3 = this.B2;
                GradientDrawable gradientDrawable = this.A2;
                if (i3 != r12) {
                    gradientDrawable.setColors(new int[]{r12, org.telegram.ui.ActionBar.k6.r1(0.66f, r12), i0.a.o(r12, 0)});
                    this.B2 = r12;
                }
                gradientDrawable.setBounds(0, getMeasuredHeight() - this.f33573r2, getMeasuredWidth(), getMeasuredHeight());
                gradientDrawable.draw(canvas);
            }
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    public int getCurrentPage() {
        return this.B1;
    }

    public ArrayList<sw> getEmojipacks() {
        ArrayList<sw> arrayList = new ArrayList<>();
        int i3 = 0;
        while (true) {
            ArrayList arrayList2 = this.f33572r1;
            if (i3 < arrayList2.size()) {
                sw swVar = (sw) arrayList2.get(i3);
                boolean z10 = swVar.f38129g;
                ArrayList arrayList3 = this.f33568q1;
                if ((!z10 && (swVar.f38128f || arrayList3.contains(Long.valueOf(swVar.f38125b.f27028id)))) || (swVar.f38129g && !swVar.f38128f && !arrayList3.contains(Long.valueOf(swVar.f38125b.f27028id)))) {
                    arrayList.add(swVar);
                }
                i3++;
            } else {
                return arrayList;
            }
        }
    }

    public ArrayList<String> getRecentEmoji() {
        if (this.f33530d2) {
            return org.telegram.messenger.i6.f23452i;
        }
        if (this.C2 == null) {
            this.C2 = new ArrayList();
        }
        if (org.telegram.messenger.i6.f23452i.size() != this.D2) {
            this.C2.clear();
            int i3 = 0;
            while (true) {
                ArrayList arrayList = org.telegram.messenger.i6.f23452i;
                if (i3 >= arrayList.size()) {
                    break;
                }
                if (!((String) arrayList.get(i3)).startsWith("animated_")) {
                    this.C2.add((String) arrayList.get(i3));
                }
                i3++;
            }
            this.D2 = this.C2.size();
        }
        return this.C2;
    }

    public float getStickersExpandOffset() {
        sv svVar = this.C0;
        if (svVar == null) {
            return 0.0f;
        }
        return svVar.getExpandedOffset();
    }

    public final void h(String str) {
        if (str != null) {
            if (str.startsWith("animated_") || org.telegram.messenger.i6.h(str)) {
                org.telegram.messenger.i6.a(str);
                int i3 = 0;
                if (getVisibility() != 0 || this.h.getCurrentItem() != 0) {
                    org.telegram.messenger.i6.s();
                    this.S.F(false);
                }
                org.telegram.messenger.i6.r();
                if (!this.f33530d2) {
                    ArrayList arrayList = this.C2;
                    if (arrayList == null) {
                        this.C2 = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    while (true) {
                        ArrayList arrayList2 = org.telegram.messenger.i6.f23452i;
                        if (i3 < arrayList2.size()) {
                            if (!((String) arrayList2.get(i3)).startsWith("animated_")) {
                                this.C2.add((String) arrayList2.get(i3));
                            }
                            i3++;
                        } else {
                            this.D2 = this.C2.size();
                            return;
                        }
                    }
                }
            }
        }
    }

    public final void i(int i3, int i10, boolean z10) {
        if (i3 == 2 || x(i3).K(0) == null) {
            return;
        }
        cw cwVar = new cw(getContext(), i10);
        cwVar.f55704a = !z10 ? 1 : 0;
        w(i3).w0(cwVar);
    }

    public final void k(boolean z10) {
        if (z10) {
            W();
            return;
        }
        int size = this.k1.size();
        int size2 = this.f33554l1.size();
        int i3 = this.f33529d1;
        this.k1 = org.telegram.messenger.li.b0(i3).i0(0, true);
        this.f33554l1 = org.telegram.messenger.li.b0(i3).i0(2, false);
        if (org.telegram.messenger.h10.i(i3).q()) {
            this.m1 = org.telegram.messenger.li.b0(i3).i0(7, false);
        } else {
            this.m1 = new ArrayList();
        }
        for (int i10 = 0; i10 < this.f33554l1.size(); i10++) {
            TLRPC.Document document = (TLRPC.Document) this.f33554l1.get(i10);
            int i11 = 0;
            while (true) {
                if (i11 < this.k1.size()) {
                    TLRPC.Document document2 = (TLRPC.Document) this.k1.get(i11);
                    if (document2.dc_id == document.dc_id && document2.f27007id == document.f27007id) {
                        this.k1.remove(i11);
                        break;
                    }
                    i11++;
                }
            }
        }
        if (org.telegram.messenger.hp.s1(i3).D3()) {
            int i12 = 0;
            while (i12 < this.f33554l1.size()) {
                if (org.telegram.messenger.zi.Y3((TLRPC.Document) this.f33554l1.get(i12))) {
                    this.f33554l1.remove(i12);
                    i12--;
                }
                i12++;
            }
            int i13 = 0;
            while (i13 < this.k1.size()) {
                if (org.telegram.messenger.zi.Y3((TLRPC.Document) this.k1.get(i13))) {
                    this.k1.remove(i13);
                    i13--;
                }
                i13++;
            }
        }
        if (size != this.k1.size() || size2 != this.f33554l1.size()) {
            X(false);
        }
        vx vxVar = this.f33599z0;
        if (vxVar != null) {
            vxVar.f();
        }
        o();
    }

    public final void l(boolean z10) {
        int i3;
        boolean z11;
        fx fxVar = this.f33582u1;
        qe.a aVar = this.f33521b;
        rw rwVar = this.Q;
        gv gvVar = this.W;
        if (fxVar != null && fxVar.z()) {
            u4.d1 K = rwVar.K(0);
            if (K == null) {
                rx.a(gvVar, true, !z10);
            } else {
                if (K.f55540a.getTop() < rwVar.getPaddingTop()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                rx.a(gvVar, z11, !z10);
            }
            N(false, !z10);
            gvVar.setTranslationY(aVar.f53840e * org.telegram.messenger.g0.L(15.0f));
        } else if (gvVar != null && rwVar != null) {
            u4.d1 K2 = rwVar.K(0);
            if (K2 != null) {
                i3 = K2.f55540a.getTop();
            } else {
                i3 = -this.f33527c1;
            }
            gvVar.setTranslationY((aVar.f53840e * org.telegram.messenger.g0.L(15.0f)) + i3);
            gvVar.f37825a.a(false, !z10);
            m(Math.round(this.J.getTranslationY()));
        }
    }

    public final void m(int i3) {
        ObjectAnimator objectAnimator = this.S0[1];
        if (objectAnimator != null && objectAnimator.isRunning()) {
            return;
        }
        boolean z10 = false;
        u4.d1 K = this.Q.K(0);
        int L = org.telegram.messenger.g0.L(38.0f) + i3;
        if (L > 0 && (K == null || K.f55540a.getBottom() < L)) {
            z10 = true;
        }
        N(z10, !this.L1);
    }

    public final void n(int i3, View view) {
        rw rwVar;
        u4.d1 K;
        int i10;
        jw jwVar = this.J;
        int[] iArr = this.R0;
        if (view == null) {
            iArr[1] = 0;
            jwVar.setTranslationY(0);
        } else if (view.getVisibility() == 0 && !this.f33539g0) {
            fx fxVar = this.f33582u1;
            if (fxVar == null || !fxVar.z()) {
                if (i3 > 0 && (rwVar = this.Q) != null && rwVar.getVisibility() == 0 && (K = rwVar.K(0)) != null) {
                    int top = K.f55540a.getTop();
                    if (this.f33532e0) {
                        i10 = this.f33527c1;
                    } else {
                        i10 = 0;
                    }
                    if (top + i10 >= rwVar.getPaddingTop()) {
                        return;
                    }
                }
                int i11 = iArr[1] - i3;
                iArr[1] = i11;
                if (i11 > 0) {
                    iArr[1] = 0;
                } else if (i11 < (-org.telegram.messenger.g0.L(108.0f))) {
                    iArr[1] = -org.telegram.messenger.g0.L(108.0f);
                }
                jwVar.setTranslationY(Math.max(-org.telegram.messenger.g0.L(36.0f), iArr[1]));
            }
        }
    }

    public final void o() {
        int L0;
        sv svVar = this.C0;
        if (svVar != null && (L0 = this.F0.L0()) != -1) {
            int i3 = this.H1;
            if (i3 <= 0 && (i3 = this.G1) <= 0) {
                i3 = this.F1;
            }
            svVar.k(this.f33599z0.F(L0), i3);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        za.p pVar = this.N2;
        if (pVar != null) {
            pVar.a();
            this.N2 = null;
        }
        za.p pVar2 = (za.p) new org.telegram.messenger.gs(org.telegram.messenger.hs.f(this.f33529d1), this).f22762b;
        pVar2.d(org.telegram.messenger.hs.f23246i4);
        pVar2.b(org.telegram.messenger.hs.L2);
        pVar2.b(org.telegram.messenger.hs.f23289q3);
        this.N2 = pVar2;
        if (this.f33599z0 != null) {
            pVar2.b(org.telegram.messenger.hs.f23333x0);
            pVar2.b(org.telegram.messenger.hs.X0);
            pVar2.b(org.telegram.messenger.hs.f23347z0);
            pVar2.b(org.telegram.messenger.hs.B0);
            pVar2.b(org.telegram.messenger.hs.f23230f5);
            org.telegram.messenger.g0.h3(new av(this, 0));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        wt wtVar = this.C1;
        if (wtVar != null && wtVar.isShowing()) {
            wtVar.dismiss();
        }
        org.telegram.ui.is p10 = org.telegram.ui.is.p();
        if (p10.f46396l == this.f33544h2) {
            p10.W = null;
            p10.f46383a0 = null;
            p10.Y = null;
            p10.f46396l = null;
            p10.f46387c0 = null;
            p10.t();
        }
    }

    @Override
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int i13 = i11 - i3;
        if (this.P1 != i13) {
            this.P1 = i13;
            D();
        }
        super.onLayout(z10, i3, i10, i11, i12);
        R();
        Z();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        this.L1 = true;
        boolean z10 = org.telegram.messenger.g0.E;
        View view = this.f33587w;
        boolean z11 = this.f33532e0;
        if (!z10 && !this.O1) {
            if (this.M1 != 0) {
                if (!this.M2) {
                    setOutlineProvider(null);
                    setClipToOutline(false);
                    setElevation(0.0f);
                }
                if (this.f33584v0) {
                    int i11 = org.telegram.ui.ActionBar.k6.f28243wf;
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
            setBackgroundResource(2131232736);
            Drawable background = getBackground();
            int i12 = org.telegram.ui.ActionBar.k6.f28243wf;
            background.setColorFilter(new PorterDuffColorFilter(z(i12), PorterDuff.Mode.MULTIPLY));
            if (z11 && this.f33584v0) {
                view.setBackgroundColor(z(i12));
            }
            this.M1 = 1;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824));
        this.L1 = false;
        setTranslationY(getTranslationY());
    }

    public final void p(int i3) {
        int L0;
        int i10;
        int L02;
        if (i3 == 0) {
            if (!this.K0 && (L02 = this.F0.L0()) != -1 && this.E0 != null) {
                int i11 = this.H1;
                if (i11 <= 0 && (i11 = this.G1) <= 0) {
                    i11 = this.F1;
                }
                this.C0.k(this.f33599z0.F(L02), i11);
            }
        } else if (i3 == 2) {
            u4.h0 adapter = this.f33545i0.getAdapter();
            jx jxVar = this.f33561o0;
            if (adapter == jxVar && jxVar.J >= 0 && this.f33578t0 >= 0 && this.f33575s0 >= 0 && (L0 = this.f33548j0.L0()) != -1) {
                if (L0 >= jxVar.J) {
                    i10 = this.f33578t0;
                } else {
                    i10 = this.f33575s0;
                }
                this.f33567q0.k(i10, 0);
            }
        }
    }

    public final void q(boolean z10) {
        int i3;
        fx fxVar = this.f33582u1;
        qe.a aVar = this.f33517a;
        ov ovVar = this.E0;
        boolean z11 = false;
        rv rvVar = this.H0;
        if (fxVar != null && fxVar.z()) {
            u4.d1 K = ovVar.K(0);
            if (K == null) {
                rx.a(rvVar, true, !z10);
            } else {
                if (K.f55540a.getTop() < ovVar.getPaddingTop()) {
                    z11 = true;
                }
                rx.a(rvVar, z11, !z10);
            }
            rvVar.setTranslationY(aVar.f53840e * org.telegram.messenger.g0.L(15.0f));
        } else if (rvVar != null && ovVar != null) {
            u4.d1 K2 = ovVar.K(0);
            if (K2 != null) {
                i3 = K2.f55540a.getTop();
            } else {
                i3 = -this.f33527c1;
            }
            rvVar.setTranslationY((aVar.f53840e * org.telegram.messenger.g0.L(15.0f)) + i3);
            rvVar.f37825a.a(false, !z10);
        }
    }

    public final void r() {
        HashMap hashMap = org.telegram.messenger.i6.f23446a;
        org.telegram.messenger.hp.d1().edit().putBoolean("filled_default", true).commit();
        org.telegram.messenger.i6.h.clear();
        org.telegram.messenger.i6.f23452i.clear();
        org.telegram.messenger.i6.r();
        this.S.F(false);
    }

    @Override
    public final void requestLayout() {
        if (this.L1) {
            return;
        }
        super.requestLayout();
    }

    public final void s(long j10, boolean z10) {
        rx rxVar;
        u4.b0 b0Var;
        View view;
        tj0 tj0Var;
        int i3;
        int i10;
        TLRPC.TL_messages_stickerSet o02;
        vx vxVar;
        int E;
        AnimatorSet animatorSet = this.N0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.N0 = null;
        }
        int currentItem = this.h.getCurrentItem();
        int i11 = 2;
        if (currentItem == 2 && j10 != -1 && (o02 = org.telegram.messenger.li.b0(this.f33529d1).o0(j10)) != null && (E = (vxVar = this.f33599z0).E(o02)) >= 0 && E < vxVar.b()) {
            H(E, org.telegram.messenger.g0.L(48.0f));
        }
        int i12 = 0;
        jx jxVar = this.f33551k0;
        if (jxVar != null) {
            jxVar.L = false;
        }
        int i13 = 0;
        while (i13 < 3) {
            tj0 tj0Var2 = this.E0;
            tj0 tj0Var3 = this.f33545i0;
            lv lvVar = this.f33564p0;
            tj0 tj0Var4 = this.Q;
            if (i13 == 0) {
                rxVar = this.W;
                b0Var = this.R;
                view = this.J;
                tj0Var = tj0Var4;
            } else if (i13 == 1) {
                b0Var = this.f33548j0;
                view = this.f33567q0;
                tj0Var = tj0Var3;
                rxVar = lvVar;
            } else {
                rxVar = this.H0;
                b0Var = this.F0;
                view = this.C0;
                tj0Var = tj0Var2;
            }
            if (rxVar == null) {
                i10 = i12;
                i3 = i11;
            } else {
                int i14 = i12;
                qx qxVar = rxVar.f37831r;
                int i15 = i11;
                rxVar.d.setText("");
                if (qxVar != null) {
                    qxVar.I1(null);
                    qxVar.G1();
                }
                int i16 = this.f33527c1;
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
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(tj0Var, property, fArr2);
                        float[] fArr3 = new float[1];
                        fArr3[i14] = org.telegram.messenger.g0.L(36.0f);
                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(rxVar, property, fArr3);
                        Animator[] animatorArr = new Animator[3];
                        animatorArr[i14] = ofFloat;
                        animatorArr[1] = ofFloat2;
                        animatorArr[i15] = ofFloat3;
                        animatorSet2.playTogether(animatorArr);
                    } else {
                        float[] fArr4 = new float[1];
                        fArr4[i14] = org.telegram.messenger.g0.L(36.0f) - i16;
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(tj0Var, property, fArr4);
                        Animator[] animatorArr2 = new Animator[1];
                        animatorArr2[i14] = ofFloat4;
                        animatorSet2.playTogether(animatorArr2);
                    }
                    this.N0.setDuration(200L);
                    this.N0.setInterpolator(xq.h);
                    this.N0.addListener(new ei.k3(this, b0Var, tj0Var, 6));
                    this.N0.start();
                    i10 = i14;
                    i3 = i15;
                } else {
                    if (rxVar != lvVar) {
                        rxVar.setTranslationY(org.telegram.messenger.g0.L(36.0f) - i16);
                    }
                    i3 = i15;
                    if (view != null && i13 != i3) {
                        view.setTranslationY(0.0f);
                    }
                    if (tj0Var == tj0Var2) {
                        i10 = i14;
                        tj0Var.setPadding(i10, org.telegram.messenger.g0.L(36.0f), i10, org.telegram.messenger.g0.L(44.0f) + this.f33573r2);
                    } else {
                        i10 = i14;
                        if (tj0Var == tj0Var3) {
                            tj0Var.setPadding(i10, org.telegram.messenger.g0.L(40.0f), i10, org.telegram.messenger.g0.L(44.0f) + this.f33573r2);
                        } else {
                            if (tj0Var == tj0Var4) {
                                tj0Var.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(44.0f) + this.f33573r2);
                            }
                            i10 = 0;
                        }
                    }
                    b0Var.h1(i10, i10);
                }
            }
            i13++;
            i11 = i3;
            i12 = i10;
        }
        int i17 = i12;
        if (!z10) {
            this.f33582u1.i(i17);
        }
    }

    public void setBlurredBackgroundDrawableFactory(eh.c cVar) {
        org.telegram.ui.ActionBar.e6 e6Var = this.f33520a2;
        View view = this.f33595y;
        if (view != null) {
            gh.g c2 = cVar.c(view, null, false);
            c2.p(b8.cd.d(e6Var));
            c2.r(org.telegram.messenger.g0.L(18.0f));
            c2.q(org.telegram.messenger.g0.L(6.0f));
            view.setBackground(c2);
        }
        View view2 = this.F;
        if (view2 != null) {
            gh.g c10 = cVar.c(view2, null, false);
            c10.p(b8.cd.d(e6Var));
            c10.r(org.telegram.messenger.g0.L(18.0f));
            c10.q(org.telegram.messenger.g0.L(6.0f));
            view2.setBackground(c10);
        }
        View view3 = this.f33591x;
        if (view3 != null) {
            gh.g c11 = cVar.c(view3, null, false);
            c11.p(b8.cd.d(e6Var));
            c11.r(org.telegram.messenger.g0.L(18.0f));
            c11.q(org.telegram.messenger.g0.L(6.0f));
            view3.setBackground(c11);
        }
        View view4 = this.E;
        if (view4 != null) {
            gh.g c12 = cVar.c(view4, null, false);
            c12.p(b8.cd.d(e6Var));
            c12.r(org.telegram.messenger.g0.L(18.0f));
            c12.q(org.telegram.messenger.g0.L(6.0f));
            view4.setBackground(c12);
        }
    }

    public void setBottomInset(int i3) {
        if (this.f33573r2 != i3) {
            this.f33573r2 = i3;
            j(i3, this.L);
            j(i3, this.N);
            j(org.telegram.messenger.g0.L(44.0f) + i3, this.Q);
            j(org.telegram.messenger.g0.L(44.0f) + i3, this.E0);
            j(org.telegram.messenger.g0.L(44.0f) + i3, this.f33545i0);
            FrameLayout frameLayout = this.f33574s;
            if (frameLayout != null) {
                frameLayout.setTranslationY(-i3);
            }
            R();
            invalidate();
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        this.K1 = chatFull;
        X(false);
    }

    public void setDelegate(fx fxVar) {
        this.f33582u1 = fxVar;
    }

    public void setDragListener(lw lwVar) {
        this.P0 = lwVar;
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        rv rvVar = this.H0;
        if (rvVar != null) {
            rvVar.d.setEnabled(z10);
        }
        lv lvVar = this.f33564p0;
        if (lvVar != null) {
            lvVar.d.setEnabled(z10);
        }
        gv gvVar = this.W;
        if (gvVar != null) {
            gvVar.d.setEnabled(z10);
        }
    }

    public void setForseMultiwindowLayout(boolean z10) {
        this.O1 = z10;
    }

    public void setShouldDrawBackground(boolean z10) {
        if (this.f33584v0 != z10) {
            this.f33584v0 = z10;
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
        R();
    }

    @Override
    public void setVisibility(int i3) {
        boolean z10;
        if (getVisibility() != i3) {
            z10 = true;
        } else {
            z10 = false;
        }
        super.setVisibility(i3);
        if (z10) {
            if (i3 != 8) {
                org.telegram.messenger.i6.s();
                this.S.F(false);
                za.p pVar = this.O2;
                int i10 = this.f33529d1;
                if (pVar == null) {
                    za.p pVar2 = (za.p) new org.telegram.messenger.gs(org.telegram.messenger.hs.f(i10), this).f22762b;
                    pVar2.b(org.telegram.messenger.hs.f23333x0);
                    this.O2 = pVar2;
                }
                if (this.f33599z0 != null) {
                    if (!this.P2) {
                        this.P2 = true;
                        this.O2.b(org.telegram.messenger.hs.X0);
                    }
                    X(false);
                    D();
                }
                k(true);
                k(false);
                org.telegram.messenger.li.b0(i10).V0(0, true, true, false);
                org.telegram.messenger.li.b0(i10).V0(0, false, true, false);
                org.telegram.messenger.li.b0(i10).V0(2, false, true, false);
            }
            kg.a1 a1Var = this.U0;
            if (a1Var != null) {
                a1Var.a();
            }
        }
    }

    public final void t(boolean z10) {
        s(-1L, z10);
    }

    public final void u(boolean z10) {
        vx vxVar;
        boolean z11 = this.U2;
        this.U2 = z10;
        if (z11 && !z10) {
            int i3 = this.B1;
            if (i3 == 0) {
                ow owVar = this.S;
                if (owVar != null) {
                    owVar.F(false);
                }
            } else if (i3 == 1) {
                jx jxVar = this.f33561o0;
                if (jxVar != null) {
                    jxVar.f();
                }
            } else if (i3 == 2 && (vxVar = this.f33599z0) != null) {
                vxVar.f();
            }
        }
    }

    @Override
    public final void updateColors() {
        try {
            S();
            si.c cVar = this.f33556m2;
            if (cVar != null) {
                cVar.a(z(org.telegram.ui.ActionBar.k6.f27878d6));
            }
            lb0 lb0Var = this.f33591x;
            if (lb0Var != null) {
                lb0Var.setIndicatorColor(i0.a.o(z(org.telegram.ui.ActionBar.k6.Df), 20));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final int v(float f10) {
        return i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Kl, this.f33520a2), (int) (f10 * 255.0f));
    }

    public final u4.s w(int i3) {
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    return this.f33548j0;
                }
                throw new IllegalArgumentException(k2.p1.i(i3, "Unexpected argument: "));
            }
            return this.R;
        }
        return this.F0;
    }

    public final tj0 x(int i3) {
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    return this.f33545i0;
                }
                throw new IllegalArgumentException(k2.p1.i(i3, "Unexpected argument: "));
            }
            return this.Q;
        }
        return this.E0;
    }

    public final HorizontalScrollView y(int i3) {
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    return this.f33567q0;
                }
                throw new IllegalArgumentException(k2.p1.i(i3, "Unexpected argument: "));
            }
            return this.J;
        }
        return this.C0;
    }

    public final int z(int i3) {
        org.telegram.ui.ActionBar.e6 e6Var = this.f33520a2;
        if (e6Var != null) {
            return e6Var.h(i3);
        }
        return org.telegram.ui.ActionBar.k6.x0(null, i3, false);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void F(float f10, int i3) {
    }
}
