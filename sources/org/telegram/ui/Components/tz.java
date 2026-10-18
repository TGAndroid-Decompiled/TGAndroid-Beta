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
import android.graphics.RectF;
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
import java.util.WeakHashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.CompoundEmoji;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.sa1;
public class tz extends FrameLayout implements ne.d, NotificationCenter.NotificationCenterDelegate, qh.a {
    public static final int O2 = 0;
    public final pw A0;
    public int A1;
    public final GradientDrawable A2;
    public final ex B0;
    public final ev B1;
    public int B2;
    public final fx C0;
    public final int C1;
    public ArrayList C2;
    public final ax D0;
    public final int[] D1;
    public int D2;
    public final ImageView E;
    public final bx E0;
    public int E1;
    public long E2;
    public AnimatorSet F;
    public rz F0;
    public int F1;
    public final ne.b F2;
    public AnimatorSet G;
    public final dx G0;
    public int G1;
    public ArrayList G2;
    public float H;
    public final oh.d H0;
    public int H1;
    public boolean H2;
    public final vx I;
    public boolean I0;
    public int I1;
    public NotificationCenter.ObserversGroup I2;
    public final qx J;
    public boolean J0;
    public TLRPC.ChatFull J1;
    public AnimatorSet J2;
    public final ah.v K;
    public boolean K0;
    public boolean K1;
    public e2.n0 K2;
    public final oh.b L;
    public final ly L0;
    public int L1;
    public final lw L2;
    public final ah.v M;
    public AnimatorSet M0;
    public final ci.s4 M1;
    public boolean M2;
    public final oh.b N;
    public final ai.vd N0;
    public boolean N1;
    public boolean N2;
    public final View O;
    public xx O0;
    public int O1;
    public final ey P;
    public boolean P0;
    public boolean P1;
    public final rx Q;
    public final int[] Q0;
    public boolean Q1;
    public final ay R;
    public final ObjectAnimator[] R0;
    public cz R1;
    public final ty S;
    public boolean S0;
    public float S1;
    public rz T;
    public hg.f1 T0;
    public float T1;
    public final oh.d U;
    public boolean U0;
    public float U1;
    public final rw V;
    public boolean V0;
    public float V1;
    public AnimatorSet W;
    public String[] W0;
    public float W1;
    public final Drawable[] X0;
    public boolean X1;
    public final Drawable[] Y0;
    public final org.telegram.ui.ActionBar.n2 Y1;
    public final Drawable[] Z0;
    public final org.telegram.ui.ActionBar.d6 Z1;
    public final ne.b f30738a;
    public final ll0 f30739a0;
    public final String[] f30740a1;
    public final org.telegram.ui.ActionBar.t5 a2;
    public final ne.b f30741b;
    public final ll0 f30742b0;
    public final int f30743b1;
    public final org.telegram.ui.ActionBar.t5 f30744b2;
    public int f30745c;
    public boolean f30746c0;
    public final int f30747c1;
    public final boolean f30748c2;
    public final ArrayList d;
    public final boolean f30749d0;
    public final ArrayList f30750d1;
    public LongSparseArray f30751d2;
    public final ArrayList e;
    public boolean f30752e0;
    public int f30753e1;
    public PorterDuffColorFilter f30754e2;
    public boolean f30755f;
    public boolean f30756f0;
    public int f30757f1;
    public final org.telegram.ui.Cells.k7 f30758f2;
    public final tw f30759g0;
    public boolean f30760g1;
    public final lx f30761g2;
    public final gx h;
    public final uw f30762h0;
    public TLRPC.TL_messages_stickerSet f30763h1;
    public boolean f30764h2;
    public final zy f30765i0;
    public ArrayList f30766i1;
    public final boolean f30767i2;
    public final yy f30768j0;
    public ArrayList f30769j1;
    public final bh.f f30770j2;
    public final bz f30771k0;
    public ArrayList f30772k1;
    public final kh f30773k2;
    public final HashMap f30774l0;
    public ArrayList l1;
    public final bh.b f30775l2;
    public final pw m0;
    public final ArrayList f30776m1;
    public final ni.e f30777m2;
    public final FrameLayout f30778n;
    public final yy f30779n0;
    public final ArrayList f30780n1;
    public boolean f30781n2;
    public final xw f30782o0;
    public final ArrayList f30783o1;
    public boolean f30784o2;
    public final yx f30785p0;
    public final ArrayList f30786p1;
    public int f30787p2;
    public boolean f30788q0;
    public final ArrayList f30789q1;
    public float f30790q2;
    public final FrameLayout f30791r;
    public int f30792r0;
    public final HashMap f30793r1;
    public View f30794r2;
    public final FrameLayout f30795s;
    public int f30796s0;
    public final Paint f30797s1;
    public int f30798s2;
    public int f30799t0;
    public uy f30800t1;
    public int f30801t2;
    public boolean f30802u0;
    public long f30803u1;
    public long f30804u2;
    public final View v;
    public boolean f30805v0;
    public boolean f30806v1;
    public boolean f30807v2;
    public final xd0 f30808w;
    public boolean f30809w0;
    public boolean f30810w1;
    public boolean f30811w2;
    public final hx f30812x;
    public final yw f30813x0;
    public final TLRPC.StickerSetCovered[] f30814x1;
    public final Rect f30815x2;
    public final ImageView f30816y;
    public final kz f30817y0;
    public final LongSparseArray f30818y1;
    public final RectF f30819y2;
    public final oz f30820z0;
    public final LongSparseArray f30821z1;
    public final ArrayList f30822z2;

    public tz(org.telegram.ui.ActionBar.n2 n2Var, boolean z10, boolean z11, boolean z12, Context context, boolean z13, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z14, final org.telegram.ui.ActionBar.d6 d6Var, boolean z15, boolean z16) {
        super(context);
        int i10;
        int A;
        org.telegram.ui.ActionBar.t5 t5Var;
        int A2;
        ay ayVar;
        lw lwVar;
        Context context2;
        qx qxVar;
        int i11;
        boolean z17;
        boolean z18;
        final org.telegram.ui.ActionBar.d6 d6Var2;
        gh.c cVar;
        int i12;
        ni.e eVar;
        int i13;
        boolean z19;
        Field field;
        int i14;
        bs bsVar = bs.h;
        this.f30738a = new ne.b(0, this, bsVar, 320L, false);
        this.f30741b = new ne.b(1, this, bsVar, 320L, false);
        this.f30745c = 2;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.e = new ArrayList();
        this.f30746c0 = true;
        this.f30771k0 = new bz(this);
        this.f30774l0 = new HashMap();
        this.f30788q0 = true;
        this.f30792r0 = -2;
        this.f30796s0 = -2;
        this.f30799t0 = -2;
        this.f30802u0 = true;
        this.f30809w0 = true;
        this.I0 = true;
        this.Q0 = new int[3];
        this.R0 = new ObjectAnimator[3];
        int i15 = UserConfig.selectedAccount;
        this.f30747c1 = i15;
        this.f30750d1 = new ArrayList();
        this.f30766i1 = new ArrayList();
        this.f30769j1 = new ArrayList();
        this.f30772k1 = new ArrayList();
        this.l1 = new ArrayList();
        this.f30776m1 = new ArrayList();
        this.f30780n1 = new ArrayList();
        new ArrayList();
        this.f30783o1 = new ArrayList();
        this.f30786p1 = new ArrayList();
        this.f30789q1 = new ArrayList();
        this.f30793r1 = new HashMap();
        this.f30814x1 = new TLRPC.StickerSetCovered[10];
        this.f30818y1 = new LongSparseArray();
        this.f30821z1 = new LongSparseArray();
        this.D1 = new int[2];
        this.F1 = -2;
        this.G1 = -2;
        this.H1 = -2;
        this.I1 = -2;
        this.L1 = -1;
        this.f30758f2 = new org.telegram.ui.Cells.k7(this, 10);
        this.f30761g2 = new lx(this);
        this.f30764h2 = true;
        ni.e eVar2 = new ni.e();
        this.f30777m2 = eVar2;
        this.f30790q2 = -1.0f;
        this.f30798s2 = -1;
        this.f30801t2 = -1;
        this.f30804u2 = -1L;
        this.f30807v2 = false;
        this.f30811w2 = true;
        this.f30815x2 = new Rect();
        RectF rectF = new RectF();
        this.f30819y2 = rectF;
        ArrayList arrayList2 = new ArrayList(1);
        this.f30822z2 = arrayList2;
        arrayList2.add(rectF);
        this.A2 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.F2 = new ne.b(0, new mw(this, 3), bsVar, 380L, true);
        this.L2 = new lw(this, 1);
        this.M2 = false;
        this.f30802u0 = z14;
        this.Y1 = n2Var;
        this.f30748c2 = z10;
        this.Z1 = d6Var;
        this.f30767i2 = z16;
        gh.c cVar2 = new gh.c();
        cVar2.a(A(org.telegram.ui.ActionBar.h6.f20986d6));
        if (z15) {
            v(true);
        }
        i0.a.o(A(org.telegram.ui.ActionBar.h6.Wk), 30);
        int dp = AndroidUtilities.dp(50.0f);
        this.f30743b1 = dp;
        this.f30749d0 = z13;
        int i16 = R.drawable.smiles_tab_smiles;
        if (z16) {
            i10 = 0;
            A = w(0.4f);
        } else {
            i10 = 0;
            A = A(org.telegram.ui.ActionBar.h6.Re);
        }
        org.telegram.ui.ActionBar.t5 V = org.telegram.ui.ActionBar.h6.V(context, i16, A, z16 ? w(0.8f) : A(org.telegram.ui.ActionBar.h6.Oe));
        org.telegram.ui.ActionBar.t5 V2 = org.telegram.ui.ActionBar.h6.V(context, R.drawable.smiles_tab_gif, z16 ? w(0.4f) : A(org.telegram.ui.ActionBar.h6.Re), z16 ? w(0.8f) : A(org.telegram.ui.ActionBar.h6.Oe));
        org.telegram.ui.ActionBar.t5 V3 = org.telegram.ui.ActionBar.h6.V(context, R.drawable.smiles_tab_stickers, z16 ? w(0.4f) : A(org.telegram.ui.ActionBar.h6.Re), z16 ? w(0.8f) : A(org.telegram.ui.ActionBar.h6.Oe));
        Drawable[] drawableArr = new Drawable[3];
        drawableArr[i10] = V;
        drawableArr[1] = V2;
        drawableArr[2] = V3;
        this.X0 = drawableArr;
        org.telegram.ui.ActionBar.t5 V4 = org.telegram.ui.ActionBar.h6.V(context, R.drawable.msg_emoji_recent, z16 ? w(0.4f) : A(org.telegram.ui.ActionBar.h6.Me), z16 ? w(0.8f) : A(org.telegram.ui.ActionBar.h6.Oe));
        org.telegram.ui.ActionBar.t5 V5 = org.telegram.ui.ActionBar.h6.V(context, R.drawable.emoji_tabs_faves, z16 ? w(0.4f) : A(org.telegram.ui.ActionBar.h6.Me), z16 ? w(0.8f) : A(org.telegram.ui.ActionBar.h6.Oe));
        org.telegram.ui.ActionBar.t5 V6 = org.telegram.ui.ActionBar.h6.V(context, R.drawable.emoji_tabs_new3, z16 ? w(0.4f) : A(org.telegram.ui.ActionBar.h6.Me), z16 ? w(0.8f) : A(org.telegram.ui.ActionBar.h6.Oe));
        int i17 = R.drawable.emoji_tabs_new1;
        if (z16) {
            t5Var = V6;
            A2 = w(0.4f);
        } else {
            t5Var = V6;
            A2 = A(org.telegram.ui.ActionBar.h6.Me);
        }
        org.telegram.ui.ActionBar.t5 V7 = org.telegram.ui.ActionBar.h6.V(context, i17, A2, z16 ? w(0.8f) : A(org.telegram.ui.ActionBar.h6.Oe));
        this.a2 = V7;
        int i18 = R.drawable.emoji_tabs_new2;
        int i19 = org.telegram.ui.ActionBar.h6.Qe;
        org.telegram.ui.ActionBar.t5 V8 = org.telegram.ui.ActionBar.h6.V(context, i18, A(i19), A(i19));
        this.f30744b2 = V8;
        Drawable[] drawableArr2 = new Drawable[2];
        drawableArr2[i10] = V7;
        drawableArr2[1] = V8;
        LayerDrawable layerDrawable = new LayerDrawable(drawableArr2);
        Drawable[] drawableArr3 = new Drawable[4];
        drawableArr3[i10] = V4;
        drawableArr3[1] = V5;
        drawableArr3[2] = t5Var;
        drawableArr3[3] = layerDrawable;
        this.Y0 = drawableArr3;
        org.telegram.ui.ActionBar.t5 V9 = org.telegram.ui.ActionBar.h6.V(context, R.drawable.msg_emoji_recent, z16 ? w(0.4f) : A(org.telegram.ui.ActionBar.h6.Me), z16 ? w(0.8f) : A(org.telegram.ui.ActionBar.h6.Oe));
        org.telegram.ui.ActionBar.t5 V10 = org.telegram.ui.ActionBar.h6.V(context, R.drawable.stickers_gifs_trending, z16 ? w(0.4f) : A(org.telegram.ui.ActionBar.h6.Me), z16 ? w(0.8f) : A(org.telegram.ui.ActionBar.h6.Oe));
        Drawable[] drawableArr4 = new Drawable[2];
        drawableArr4[i10] = V9;
        drawableArr4[1] = V10;
        this.Z0 = drawableArr4;
        this.f30740a1 = new String[]{LocaleController.getString(R.string.Emoji1), LocaleController.getString(R.string.Emoji2), LocaleController.getString(R.string.Emoji3), LocaleController.getString(R.string.Emoji4), LocaleController.getString(R.string.Emoji5), LocaleController.getString(R.string.Emoji6), LocaleController.getString(R.string.Emoji7), LocaleController.getString(R.string.Emoji8)};
        this.J1 = chatFull;
        Paint paint = new Paint(1);
        this.f30797s1 = paint;
        paint.setColor(A(org.telegram.ui.ActionBar.h6.f20936af));
        ci.n1 n1Var = zf.j0.f51574a;
        this.M1 = new ci.s4(AndroidUtilities.dp(6.0f));
        qx qxVar2 = new qx(this, context);
        this.J = qxVar2;
        ?? obj = new Object();
        obj.f29470a = i10;
        obj.f29471b = qxVar2;
        arrayList.add(obj);
        if (z10) {
            MediaDataController.getInstance(i15).checkStickers(5);
            MediaDataController.getInstance(i15).checkFeaturedEmoji();
            this.f30754e2 = new PorterDuffColorFilter(A(org.telegram.ui.ActionBar.h6.Oh), PorterDuff.Mode.SRC_IN);
        }
        ey eyVar = new ey(this, context);
        this.P = eyVar;
        eVar2.a(eyVar);
        s4.k kVar = new s4.k();
        kVar.f45989c = 220L;
        kVar.e = 220L;
        kVar.f45990f = 160L;
        kVar.f45991g = 160L;
        kVar.f45992i = bs.f25031g;
        eyVar.setItemAnimator(kVar);
        eyVar.setOnTouchListener(new View.OnTouchListener(this) {
            public final tz f28823b;

            {
                this.f28823b = this;
            }

            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                switch (r3) {
                    case 0:
                        org.telegram.ui.gt q6 = org.telegram.ui.gt.q();
                        tz tzVar = this.f28823b;
                        ey eyVar2 = tzVar.P;
                        tzVar.getMeasuredHeight();
                        return q6.s(motionEvent, eyVar2, null, tzVar.f30761g2, d6Var);
                    case 1:
                        org.telegram.ui.gt q10 = org.telegram.ui.gt.q();
                        tz tzVar2 = this.f28823b;
                        return q10.s(motionEvent, tzVar2.f30762h0, tzVar2.m0, tzVar2.f30761g2, d6Var);
                    default:
                        org.telegram.ui.gt q11 = org.telegram.ui.gt.q();
                        tz tzVar3 = this.f28823b;
                        ax axVar = tzVar3.D0;
                        tzVar3.getMeasuredHeight();
                        return q11.s(motionEvent, axVar, tzVar3.A0, tzVar3.f30761g2, d6Var);
                }
            }
        });
        eyVar.setOnItemLongClickListener(new mw(this, 1));
        eyVar.setInstantClick(true);
        rx rxVar = new rx(this);
        this.Q = rxVar;
        eyVar.setLayoutManager(rxVar);
        eyVar.setTopGlowOffset(AndroidUtilities.dp(38.0f));
        eyVar.setBottomGlowOffset(AndroidUtilities.dp(36.0f));
        eyVar.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f));
        int i20 = org.telegram.ui.ActionBar.h6.He;
        eyVar.setGlowColor(A(i20));
        eyVar.setItemSelectorColorProvider(new k2(16));
        eyVar.setClipToPadding(false);
        rxVar.O = new sx(this);
        ay ayVar2 = new ay(this);
        this.R = ayVar2;
        eyVar.setAdapter(ayVar2);
        eyVar.i(new ei.q1(this, 3));
        this.S = new ty(this, context);
        qxVar2.addView(eyVar, w7.z5.c(-1.0f, -1));
        ll0 ll0Var = new ll0(eyVar, rxVar);
        this.f30742b0 = ll0Var;
        ll0Var.f28261i = new tx(this);
        eyVar.setOnScrollListener(new ux(this));
        if (n2Var != null) {
            ayVar = ayVar2;
            lwVar = new lw(this, 2);
            qxVar = qxVar2;
            i11 = -1;
            z17 = z10;
            z18 = z16;
            d6Var2 = d6Var;
            cVar = cVar2;
            i12 = dp;
            eVar = eVar2;
            i13 = 5;
            context2 = context;
        } else {
            ayVar = ayVar2;
            lwVar = null;
            context2 = context;
            qxVar = qxVar2;
            i11 = -1;
            z17 = z10;
            z18 = z16;
            d6Var2 = d6Var;
            cVar = cVar2;
            i12 = dp;
            eVar = eVar2;
            i13 = 5;
        }
        vx vxVar = new vx(this, context2, d6Var2, z17, lwVar, z18);
        this.I = vxVar;
        if (z13) {
            rw rwVar = new rw(this, context2);
            this.V = rwVar;
            qxVar.addView(rwVar, new FrameLayout.LayoutParams(i11, AndroidUtilities.getShadowHeight() + i12));
            rwVar.d.setOnFocusChangeListener(new sw(this));
            oh.d dVar = new oh.d(context2, d6Var2);
            this.U = dVar;
            dVar.setVisibility(8);
            dVar.setOnBackClickListener(new View.OnClickListener(this) {
                public final tz f29076b;

                {
                    this.f29076b = this;
                }

                @Override
                public final void onClick(View view) {
                    gz gzVar;
                    switch (r2) {
                        case 0:
                            ty tyVar = this.f29076b.S;
                            my myVar = tyVar.f30730c;
                            int childCount = myVar.getChildCount();
                            for (int i21 = 0; i21 < childCount; i21++) {
                                ((oh.c) myVar.getChildAt(i21)).a(false, true);
                            }
                            tyVar.d = 0L;
                            tyVar.F.f30741b.a(false, true);
                            tyVar.l();
                            return;
                        case 1:
                            oz ozVar = this.f29076b.f30820z0;
                            nz nzVar = ozVar.f29108c;
                            int childCount2 = nzVar.getChildCount();
                            for (int i22 = 0; i22 < childCount2; i22++) {
                                ((oh.c) nzVar.getChildAt(i22)).a(false, true);
                            }
                            ozVar.d = 0L;
                            ozVar.Q.f30738a.a(false, true);
                            ozVar.l();
                            return;
                        case 2:
                            uy uyVar = this.f29076b.f30800t1;
                            if (uyVar != null) {
                                uyVar.w();
                                return;
                            }
                            return;
                        default:
                            tz tzVar = this.f29076b;
                            int currentItem = tzVar.h.getCurrentItem();
                            if (currentItem == 0) {
                                gzVar = tzVar.V;
                            } else if (currentItem == 1) {
                                gzVar = tzVar.f30782o0;
                            } else {
                                gzVar = tzVar.G0;
                            }
                            if (gzVar != null) {
                                sq sqVar = gzVar.d;
                                sqVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                sqVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                sqVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                return;
                            }
                            return;
                    }
                }
            });
            qxVar.addView(dVar, new FrameLayout.LayoutParams(i11, i12));
        }
        int A3 = A(i20);
        if (Color.alpha(A3) >= 255) {
            vxVar.setBackgroundColor(A3);
        }
        ayVar.G(true);
        vxVar.p(getEmojipacks());
        qxVar.addView(vxVar, w7.z5.c(36.0f, i11));
        View view = new View(context2);
        this.O = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        int i21 = org.telegram.ui.ActionBar.h6.Ke;
        view.setBackgroundColor(A(i21));
        gh.c cVar3 = cVar;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i11, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(36.0f);
        qxVar.addView(view, layoutParams);
        oh.b bVar = new oh.b(context2, d6Var2);
        this.L = bVar;
        ah.v vVar = new ah.v(context2, 6, d6Var2);
        this.K = vVar;
        vVar.setVisibility(8);
        vVar.addView(bVar, w7.z5.d(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
        qxVar.addView(vVar, w7.z5.e(i11, -2, 80));
        if (z11) {
            fn0 fn0Var = fn0.f26275b;
            if (z12) {
                tw twVar = new tw(this, context2);
                this.f30759g0 = twVar;
                ?? obj2 = new Object();
                obj2.f29470a = 1;
                obj2.f29471b = twVar;
                this.d.add(obj2);
                uw uwVar = new uw(this, context2);
                this.f30762h0 = uwVar;
                eVar.a(uwVar);
                uwVar.setClipToPadding(false);
                zy zyVar = new zy(this);
                this.f30765i0 = zyVar;
                uwVar.setLayoutManager(zyVar);
                uwVar.i(new vw(this));
                uwVar.setPadding(0, i12, 0, AndroidUtilities.dp(44.0f) + this.f30787p2);
                ((s4.e1) uwVar.getItemAnimator()).f45944m = false;
                yy yyVar = new yy(this, context2, true, Integer.MAX_VALUE);
                this.f30779n0 = yyVar;
                uwVar.setAdapter(yyVar);
                this.f30768j0 = new yy(this, context2, false, 0);
                uwVar.setOnScrollListener(new ww(this));
                uwVar.setOnTouchListener(new View.OnTouchListener(this) {
                    public final tz f28823b;

                    {
                        this.f28823b = this;
                    }

                    @Override
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        switch (r3) {
                            case 0:
                                org.telegram.ui.gt q6 = org.telegram.ui.gt.q();
                                tz tzVar = this.f28823b;
                                ey eyVar2 = tzVar.P;
                                tzVar.getMeasuredHeight();
                                return q6.s(motionEvent, eyVar2, null, tzVar.f30761g2, d6Var2);
                            case 1:
                                org.telegram.ui.gt q10 = org.telegram.ui.gt.q();
                                tz tzVar2 = this.f28823b;
                                return q10.s(motionEvent, tzVar2.f30762h0, tzVar2.m0, tzVar2.f30761g2, d6Var2);
                            default:
                                org.telegram.ui.gt q11 = org.telegram.ui.gt.q();
                                tz tzVar3 = this.f28823b;
                                ax axVar = tzVar3.D0;
                                tzVar3.getMeasuredHeight();
                                return q11.s(motionEvent, axVar, tzVar3.A0, tzVar3.f30761g2, d6Var2);
                        }
                    }
                });
                ?? r11 = new wl0(this) {
                    public final tz f29440b;

                    {
                        this.f29440b = this;
                    }

                    @Override
                    public final void a(int i22, View view2) {
                        int i23;
                        String str;
                        switch (r2) {
                            case 0:
                                tz tzVar = this.f29440b;
                                uw uwVar2 = tzVar.f30762h0;
                                yy yyVar2 = tzVar.f30768j0;
                                yy yyVar3 = tzVar.f30779n0;
                                if (tzVar.f30800t1 != null) {
                                    yyVar3.getClass();
                                    ArrayList arrayList3 = yyVar3.f32778x;
                                    if (uwVar2.getAdapter() == yyVar3) {
                                        if (i22 >= 0) {
                                            int i24 = yyVar3.H;
                                            if (i22 < i24) {
                                                tzVar.f30800t1.v(view2, tzVar.f30766i1.get(i22), null, "gif", true, 0, 0);
                                                return;
                                            }
                                            if (i24 > 0) {
                                                i23 = (i22 - i24) - 1;
                                            } else {
                                                i23 = i22;
                                            }
                                            if (i23 >= 0 && i23 < arrayList3.size()) {
                                                tzVar.f30800t1.v(view2, arrayList3.get(i23), null, yyVar3.f32774n, true, 0, 0);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    } else if (uwVar2.getAdapter() == yyVar2 && i22 >= 0 && i22 < yyVar2.f32778x.size()) {
                                        tzVar.f30800t1.v(view2, yyVar2.f32778x.get(i22), yyVar2.f32777w, yyVar2.f32774n, true, 0, 0);
                                        tzVar.W();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            default:
                                tz tzVar2 = this.f29440b;
                                s4.g0 adapter = tzVar2.D0.getAdapter();
                                oz ozVar = tzVar2.f30820z0;
                                if (adapter == ozVar) {
                                    str = ozVar.N;
                                } else {
                                    str = null;
                                }
                                String str2 = str;
                                if (view2 instanceof org.telegram.ui.Cells.e8) {
                                    org.telegram.ui.Cells.e8 e8Var = (org.telegram.ui.Cells.e8) view2;
                                    if (e8Var.getSticker() != null && MessageObject.isPremiumSticker(e8Var.getSticker()) && !AccountInstance.getInstance(tzVar2.f30747c1).getUserConfig().isPremium()) {
                                        org.telegram.ui.gt.q().y(e8Var);
                                        return;
                                    }
                                    org.telegram.ui.gt.q().u();
                                    if (!e8Var.f22198r) {
                                        e8Var.f22198r = true;
                                        e8Var.f22197n = 0.5f;
                                        e8Var.f22201x = 0L;
                                        org.telegram.ui.Cells.d8 d8Var = e8Var.f22193a;
                                        d8Var.setAlpha(0.5f * e8Var.H);
                                        d8Var.invalidate();
                                        e8Var.f22199s = System.currentTimeMillis();
                                        e8Var.invalidate();
                                        tzVar2.f30800t1.m(e8Var, e8Var.getSticker(), str2, e8Var.getParentObject(), e8Var.getSendAnimationData(), true, 0);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                };
                this.m0 = r11;
                uwVar.setOnItemClickListener((wl0) r11);
                twVar.addView(uwVar, w7.z5.c(-1.0f, -1));
                xw xwVar = new xw(this, context2);
                this.f30782o0 = xwVar;
                twVar.addView(xwVar, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + i12));
                yx yxVar = new yx(this, context2, d6Var2);
                this.f30785p0 = yxVar;
                yxVar.setType(fn0Var);
                yxVar.setUnderlineHeight(AndroidUtilities.getShadowHeight());
                i14 = i19;
                yxVar.setIndicatorColor(A(i14));
                yxVar.setUnderlineColor(A(i21));
                yxVar.setBackgroundColor(A(i20));
                V();
                yxVar.setDelegate(new mw(this, 2));
                yyVar.F("", "", true, true, true);
            } else {
                i14 = i19;
            }
            yw ywVar = new yw(this, context2, z14);
            this.f30813x0 = ywVar;
            MediaDataController.getInstance(this.f30747c1).checkStickers(0);
            MediaDataController.getInstance(this.f30747c1).checkFeaturedStickers();
            ax axVar = new ax(this, context2);
            this.D0 = axVar;
            this.f30777m2.a(axVar);
            bx bxVar = new bx(this);
            this.E0 = bxVar;
            axVar.setLayoutManager(bxVar);
            bxVar.O = new cx(this);
            axVar.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f));
            axVar.setClipToPadding(false);
            ?? obj3 = new Object();
            obj3.f29470a = 2;
            obj3.f29471b = ywVar;
            this.d.add(obj3);
            this.f30820z0 = new oz(this, context2);
            kz kzVar = new kz(this, context2);
            this.f30817y0 = kzVar;
            axVar.setAdapter(kzVar);
            axVar.setOnTouchListener(new View.OnTouchListener(this) {
                public final tz f28823b;

                {
                    this.f28823b = this;
                }

                @Override
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    switch (r3) {
                        case 0:
                            org.telegram.ui.gt q6 = org.telegram.ui.gt.q();
                            tz tzVar = this.f28823b;
                            ey eyVar2 = tzVar.P;
                            tzVar.getMeasuredHeight();
                            return q6.s(motionEvent, eyVar2, null, tzVar.f30761g2, d6Var2);
                        case 1:
                            org.telegram.ui.gt q10 = org.telegram.ui.gt.q();
                            tz tzVar2 = this.f28823b;
                            return q10.s(motionEvent, tzVar2.f30762h0, tzVar2.m0, tzVar2.f30761g2, d6Var2);
                        default:
                            org.telegram.ui.gt q11 = org.telegram.ui.gt.q();
                            tz tzVar3 = this.f28823b;
                            ax axVar2 = tzVar3.D0;
                            tzVar3.getMeasuredHeight();
                            return q11.s(motionEvent, axVar2, tzVar3.A0, tzVar3.f30761g2, d6Var2);
                    }
                }
            });
            ?? r42 = new wl0(this) {
                public final tz f29440b;

                {
                    this.f29440b = this;
                }

                @Override
                public final void a(int i22, View view2) {
                    int i23;
                    String str;
                    switch (r2) {
                        case 0:
                            tz tzVar = this.f29440b;
                            uw uwVar2 = tzVar.f30762h0;
                            yy yyVar2 = tzVar.f30768j0;
                            yy yyVar3 = tzVar.f30779n0;
                            if (tzVar.f30800t1 != null) {
                                yyVar3.getClass();
                                ArrayList arrayList3 = yyVar3.f32778x;
                                if (uwVar2.getAdapter() == yyVar3) {
                                    if (i22 >= 0) {
                                        int i24 = yyVar3.H;
                                        if (i22 < i24) {
                                            tzVar.f30800t1.v(view2, tzVar.f30766i1.get(i22), null, "gif", true, 0, 0);
                                            return;
                                        }
                                        if (i24 > 0) {
                                            i23 = (i22 - i24) - 1;
                                        } else {
                                            i23 = i22;
                                        }
                                        if (i23 >= 0 && i23 < arrayList3.size()) {
                                            tzVar.f30800t1.v(view2, arrayList3.get(i23), null, yyVar3.f32774n, true, 0, 0);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                } else if (uwVar2.getAdapter() == yyVar2 && i22 >= 0 && i22 < yyVar2.f32778x.size()) {
                                    tzVar.f30800t1.v(view2, yyVar2.f32778x.get(i22), yyVar2.f32777w, yyVar2.f32774n, true, 0, 0);
                                    tzVar.W();
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        default:
                            tz tzVar2 = this.f29440b;
                            s4.g0 adapter = tzVar2.D0.getAdapter();
                            oz ozVar = tzVar2.f30820z0;
                            if (adapter == ozVar) {
                                str = ozVar.N;
                            } else {
                                str = null;
                            }
                            String str2 = str;
                            if (view2 instanceof org.telegram.ui.Cells.e8) {
                                org.telegram.ui.Cells.e8 e8Var = (org.telegram.ui.Cells.e8) view2;
                                if (e8Var.getSticker() != null && MessageObject.isPremiumSticker(e8Var.getSticker()) && !AccountInstance.getInstance(tzVar2.f30747c1).getUserConfig().isPremium()) {
                                    org.telegram.ui.gt.q().y(e8Var);
                                    return;
                                }
                                org.telegram.ui.gt.q().u();
                                if (!e8Var.f22198r) {
                                    e8Var.f22198r = true;
                                    e8Var.f22197n = 0.5f;
                                    e8Var.f22201x = 0L;
                                    org.telegram.ui.Cells.d8 d8Var = e8Var.f22193a;
                                    d8Var.setAlpha(0.5f * e8Var.H);
                                    d8Var.invalidate();
                                    e8Var.f22199s = System.currentTimeMillis();
                                    e8Var.invalidate();
                                    tzVar2.f30800t1.m(e8Var, e8Var.getSticker(), str2, e8Var.getParentObject(), e8Var.getSendAnimationData(), true, 0);
                                    return;
                                }
                                return;
                            }
                            return;
                    }
                }
            };
            this.A0 = r42;
            axVar.setOnItemClickListener((wl0) r42);
            axVar.setGlowColor(A(i20));
            ywVar.addView(axVar);
            this.f30739a0 = new ll0(axVar, bxVar);
            dx dxVar = new dx(this, context2);
            this.G0 = dxVar;
            ywVar.addView(dxVar, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + i12));
            oh.d dVar2 = new oh.d(context2, d6Var2);
            this.H0 = dVar2;
            dVar2.setVisibility(8);
            dVar2.setOnBackClickListener(new View.OnClickListener(this) {
                public final tz f29076b;

                {
                    this.f29076b = this;
                }

                @Override
                public final void onClick(View view2) {
                    gz gzVar;
                    switch (r2) {
                        case 0:
                            ty tyVar = this.f29076b.S;
                            my myVar = tyVar.f30730c;
                            int childCount = myVar.getChildCount();
                            for (int i212 = 0; i212 < childCount; i212++) {
                                ((oh.c) myVar.getChildAt(i212)).a(false, true);
                            }
                            tyVar.d = 0L;
                            tyVar.F.f30741b.a(false, true);
                            tyVar.l();
                            return;
                        case 1:
                            oz ozVar = this.f29076b.f30820z0;
                            nz nzVar = ozVar.f29108c;
                            int childCount2 = nzVar.getChildCount();
                            for (int i22 = 0; i22 < childCount2; i22++) {
                                ((oh.c) nzVar.getChildAt(i22)).a(false, true);
                            }
                            ozVar.d = 0L;
                            ozVar.Q.f30738a.a(false, true);
                            ozVar.l();
                            return;
                        case 2:
                            uy uyVar = this.f29076b.f30800t1;
                            if (uyVar != null) {
                                uyVar.w();
                                return;
                            }
                            return;
                        default:
                            tz tzVar = this.f29076b;
                            int currentItem = tzVar.h.getCurrentItem();
                            if (currentItem == 0) {
                                gzVar = tzVar.V;
                            } else if (currentItem == 1) {
                                gzVar = tzVar.f30782o0;
                            } else {
                                gzVar = tzVar.G0;
                            }
                            if (gzVar != null) {
                                sq sqVar = gzVar.d;
                                sqVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                sqVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                sqVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                return;
                            }
                            return;
                    }
                }
            });
            ywVar.addView(dVar2, new FrameLayout.LayoutParams(-1, i12));
            z19 = z14;
            ex exVar = new ex(this, context2, d6Var2, n2Var, z19);
            this.B0 = exVar;
            exVar.setDragEnabled(true);
            exVar.setWillNotDraw(false);
            exVar.setType(fn0Var);
            exVar.setUnderlineHeight(axVar.canScrollVertically(-1) ? AndroidUtilities.getShadowHeight() : 0);
            exVar.setIndicatorColor(A(i14));
            exVar.setUnderlineColor(A(i21));
            if (viewGroup != null && z19) {
                fx fxVar = new fx(this, context2);
                this.C0 = fxVar;
                fxVar.addView(exVar, w7.z5.e(-1, 36, 51));
                viewGroup.addView(fxVar, w7.z5.c(-2.0f, -1));
            } else {
                ywVar.addView(exVar, w7.z5.e(-1, 36, 51));
            }
            X(true);
            exVar.setDelegate(new mw(this, 4));
            axVar.setOnScrollListener(new sz(this, 0));
            oh.b bVar2 = new oh.b(context2, d6Var2);
            this.N = bVar2;
            ah.v vVar2 = new ah.v(context2, 6, d6Var2);
            this.M = vVar2;
            vVar2.setVisibility(8);
            vVar2.addView(bVar2, w7.z5.d(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
            ywVar.addView(vVar2, w7.z5.e(-1, -2, 80));
        } else {
            z19 = z14;
        }
        this.e.clear();
        this.e.addAll(this.d);
        gx gxVar = new gx(this, context2);
        this.h = gxVar;
        ni.e eVar3 = this.f30777m2;
        eVar3.getClass();
        gxVar.b(new ci.w5(eVar3, 1));
        gxVar.setOverScrollMode(2);
        ly lyVar = new ly(this);
        this.L0 = lyVar;
        gxVar.setAdapter(lyVar);
        hx hxVar = new hx(this, context2);
        this.f30812x = hxVar;
        hxVar.setHapticFeedbackEnabled(true);
        hxVar.setImageResource(R.drawable.smiles_tab_clear);
        int w9 = z16 ? w(0.6f) : A(org.telegram.ui.ActionBar.h6.Re);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        hxVar.setColorFilter(new PorterDuffColorFilter(w9, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        hxVar.setScaleType(scaleType);
        hxVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
        hxVar.setFocusable(true);
        hxVar.setOnClickListener(new Object());
        w7.b6.a(hxVar);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f30791r = frameLayout;
        if (z13) {
            addView(frameLayout, w7.z5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, (AndroidUtilities.getShadowHeight() / AndroidUtilities.density) + 40.0f));
        } else {
            addView(frameLayout, w7.z5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.f30795s = frameLayout2;
        addView(frameLayout2, w7.z5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 64.0f));
        FrameLayout frameLayout3 = new FrameLayout(context2);
        this.f30778n = frameLayout3;
        View view2 = new View(context2);
        this.v = view2;
        frameLayout3.addView(view2, new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(40.0f), 83));
        if (z13) {
            addView(frameLayout3, w7.z5.e(-1, 48, 80));
            frameLayout3.addView(hxVar, w7.z5.d(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
            if (z11) {
                ImageView imageView = new ImageView(context2);
                this.f30816y = imageView;
                imageView.setImageResource(R.drawable.smiles_tab_settings);
                imageView.setColorFilter(new PorterDuffColorFilter(z16 ? w(0.6f) : A(org.telegram.ui.ActionBar.h6.Re), mode));
                imageView.setScaleType(scaleType);
                imageView.setFocusable(true);
                imageView.setContentDescription(LocaleController.getString(R.string.Settings));
                w7.b6.a(imageView);
                frameLayout3.addView(imageView, w7.z5.d(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
                imageView.setOnClickListener(new View.OnClickListener(this) {
                    public final tz f29076b;

                    {
                        this.f29076b = this;
                    }

                    @Override
                    public final void onClick(View view22) {
                        gz gzVar;
                        switch (r2) {
                            case 0:
                                ty tyVar = this.f29076b.S;
                                my myVar = tyVar.f30730c;
                                int childCount = myVar.getChildCount();
                                for (int i212 = 0; i212 < childCount; i212++) {
                                    ((oh.c) myVar.getChildAt(i212)).a(false, true);
                                }
                                tyVar.d = 0L;
                                tyVar.F.f30741b.a(false, true);
                                tyVar.l();
                                return;
                            case 1:
                                oz ozVar = this.f29076b.f30820z0;
                                nz nzVar = ozVar.f29108c;
                                int childCount2 = nzVar.getChildCount();
                                for (int i22 = 0; i22 < childCount2; i22++) {
                                    ((oh.c) nzVar.getChildAt(i22)).a(false, true);
                                }
                                ozVar.d = 0L;
                                ozVar.Q.f30738a.a(false, true);
                                ozVar.l();
                                return;
                            case 2:
                                uy uyVar = this.f29076b.f30800t1;
                                if (uyVar != null) {
                                    uyVar.w();
                                    return;
                                }
                                return;
                            default:
                                tz tzVar = this.f29076b;
                                int currentItem = tzVar.h.getCurrentItem();
                                if (currentItem == 0) {
                                    gzVar = tzVar.V;
                                } else if (currentItem == 1) {
                                    gzVar = tzVar.f30782o0;
                                } else {
                                    gzVar = tzVar.G0;
                                }
                                if (gzVar != null) {
                                    sq sqVar = gzVar.d;
                                    sqVar.requestFocus();
                                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                    sqVar.onTouchEvent(obtain);
                                    obtain.recycle();
                                    MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                    sqVar.onTouchEvent(obtain2);
                                    obtain2.recycle();
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            xd0 xd0Var = new xd0(context2, d6Var2);
            this.f30808w = xd0Var;
            xd0Var.setViewPager(gxVar);
            xd0Var.setShouldExpand(false);
            xd0Var.setIndicatorHeight(AndroidUtilities.dp(3.0f));
            xd0Var.setIndicatorColor(i0.a.o(A(org.telegram.ui.ActionBar.h6.Oe), 20));
            xd0Var.setUnderlineHeight(0);
            xd0Var.setTabPaddingLeftRight(AndroidUtilities.dp(11.0f));
            xd0Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f));
            frameLayout3.addView(xd0Var, w7.z5.e(-2, 48, 81));
            xd0Var.setOnPageChangeListener(new jx(this, z19));
            ImageView imageView2 = new ImageView(context2);
            this.E = imageView2;
            imageView2.setImageResource(R.drawable.smiles_tab_search);
            imageView2.setColorFilter(new PorterDuffColorFilter(z16 ? w(0.6f) : A(org.telegram.ui.ActionBar.h6.Re), mode));
            imageView2.setScaleType(scaleType);
            imageView2.setContentDescription(LocaleController.getString(R.string.Search));
            imageView2.setFocusable(true);
            imageView2.setVisibility(8);
            frameLayout3.addView(imageView2, w7.z5.d(48, 48.0f, 83, 2.0f, 0.0f, 2.0f, 0.0f));
            imageView2.setOnClickListener(new View.OnClickListener(this) {
                public final tz f29076b;

                {
                    this.f29076b = this;
                }

                @Override
                public final void onClick(View view22) {
                    gz gzVar;
                    switch (r2) {
                        case 0:
                            ty tyVar = this.f29076b.S;
                            my myVar = tyVar.f30730c;
                            int childCount = myVar.getChildCount();
                            for (int i212 = 0; i212 < childCount; i212++) {
                                ((oh.c) myVar.getChildAt(i212)).a(false, true);
                            }
                            tyVar.d = 0L;
                            tyVar.F.f30741b.a(false, true);
                            tyVar.l();
                            return;
                        case 1:
                            oz ozVar = this.f29076b.f30820z0;
                            nz nzVar = ozVar.f29108c;
                            int childCount2 = nzVar.getChildCount();
                            for (int i22 = 0; i22 < childCount2; i22++) {
                                ((oh.c) nzVar.getChildAt(i22)).a(false, true);
                            }
                            ozVar.d = 0L;
                            ozVar.Q.f30738a.a(false, true);
                            ozVar.l();
                            return;
                        case 2:
                            uy uyVar = this.f29076b.f30800t1;
                            if (uyVar != null) {
                                uyVar.w();
                                return;
                            }
                            return;
                        default:
                            tz tzVar = this.f29076b;
                            int currentItem = tzVar.h.getCurrentItem();
                            if (currentItem == 0) {
                                gzVar = tzVar.V;
                            } else if (currentItem == 1) {
                                gzVar = tzVar.f30782o0;
                            } else {
                                gzVar = tzVar.G0;
                            }
                            if (gzVar != null) {
                                sq sqVar = gzVar.d;
                                sqVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                sqVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                sqVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                return;
                            }
                            return;
                    }
                }
            });
        } else {
            addView(frameLayout3, w7.z5.d(56, 48.0f, (LocaleController.isRTL ? 3 : i13) | 80, 0.0f, 0.0f, 2.0f, 0.0f));
            org.telegram.ui.Cells.z i02 = org.telegram.ui.ActionBar.h6.i0(AndroidUtilities.dp(56.0f), A(i20), A(i20));
            w7.b6.a(hxVar);
            hxVar.setPadding(0, 0, AndroidUtilities.dp(2.0f), 0);
            hxVar.setBackground(i02);
            hxVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
            hxVar.setFocusable(true);
            frameLayout3.addView(hxVar, w7.z5.d(48, 48.0f, 51, 2.0f, 0.0f, 2.0f, 0.0f));
            view2.setVisibility(8);
        }
        addView(gxVar, 0, w7.z5.e(-1, -1, 51));
        ai.vd vdVar = new ai.vd(context2, 23);
        this.N0 = vdVar;
        vdVar.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(6.0f), A(org.telegram.ui.ActionBar.h6.f21232qf)));
        vdVar.setTextColor(A(org.telegram.ui.ActionBar.h6.f21213pf));
        vdVar.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f));
        vdVar.setGravity(16);
        vdVar.setTextSize(1, 14.0f);
        vdVar.setVisibility(4);
        addView(vdVar, w7.z5.d(-2, -2.0f, 81, 5.0f, 0.0f, 5.0f, 53.0f));
        this.C1 = AndroidUtilities.dp(AndroidUtilities.isTablet() ? 40.0f : 32.0f);
        Field field2 = ev.f25999f;
        ev evVar = new ev(new dv(context2, d6Var2));
        if (ev.f25999f == null) {
            try {
                field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
                try {
                    field.setAccessible(true);
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                field = null;
            }
            ev.f25999f = field;
        }
        Field field3 = ev.f25999f;
        if (field3 != null) {
            try {
                evVar.f26001a = (ViewTreeObserver.OnScrollChangedListener) field3.get(evVar);
                ev.f25999f.set(evVar, ev.f26000g);
            } catch (Exception unused3) {
                evVar.f26001a = null;
            }
        }
        this.B1 = evVar;
        evVar.f26003c.setOnSelectionUpdateListener(new d(this, 10));
        this.A1 = MessagesController.getGlobalEmojiSettings().getInt("selected_page", 0);
        Emoji.loadRecentEmoji();
        ayVar.F(false);
        I(true, z11, z12, false);
        if (Build.VERSION.SDK_INT >= 31) {
            bh.f fVar = new bh.f(false);
            this.f30770j2 = fVar;
            gh.d dVar3 = new gh.d(null);
            dVar3.f11060f = cVar3;
            dVar3.d = fVar;
            dVar3.e = -2;
            bh.b bVar3 = new bh.b(dVar3);
            this.f30775l2 = bVar3;
            bVar3.f4364i = LiteMode.isEnabled(262144);
            int dp2 = AndroidUtilities.dp(LiteMode.isEnabled(262144) ? 8.0f : 48.0f);
            bVar3.f4360b = dp2;
            bVar3.f4361c = dp2;
            bVar3.h = this.f30777m2;
        } else {
            bh.b bVar4 = new bh.b(cVar3);
            this.f30775l2 = bVar4;
            bVar4.h = this.f30777m2;
            this.f30770j2 = null;
        }
        this.f30773k2 = new kh(this, 1);
        setBlurredBackgroundDrawableFactory(this.f30775l2);
        this.f30777m2.b(this);
        this.f30777m2.f17481a = new mw(this, 0);
    }

    public static void c(tz tzVar, boolean z10) {
        uw uwVar = tzVar.f30762h0;
        if (uwVar != null) {
            int childCount = uwVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = uwVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.f2) {
                    ImageReceiver photoImage = ((org.telegram.ui.Cells.f2) childAt).getPhotoImage();
                    if (z10) {
                        photoImage.setAllowStartAnimation(true);
                        photoImage.startAnimation();
                    } else {
                        photoImage.setAllowStartAnimation(false);
                        photoImage.stopAnimation();
                    }
                }
            }
        }
    }

    public static void d(tz tzVar, cz czVar, String str) {
        String str2;
        String str3;
        boolean z10;
        String str4;
        uy uyVar;
        xc xcVar;
        org.telegram.ui.ActionBar.n2 n2Var = tzVar.Y1;
        int i10 = tzVar.f30747c1;
        ArrayList arrayList = tzVar.f30789q1;
        if (czVar != null) {
            if (czVar.getSpan() != null) {
                if (tzVar.f30800t1 != null) {
                    long j10 = czVar.getSpan().documentId;
                    TLRPC.Document document = czVar.getSpan().document;
                    fy fyVar = czVar.e;
                    if (fyVar != null && fyVar.f26408i) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (document == null) {
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            fy fyVar2 = (fy) arrayList.get(i11);
                            int i12 = 0;
                            while (true) {
                                ArrayList arrayList2 = fyVar2.f26405c;
                                if (arrayList2 != null && i12 < arrayList2.size()) {
                                    if (((TLRPC.Document) fyVar2.f26405c.get(i12)).f20278id == j10) {
                                        document = (TLRPC.Document) fyVar2.f26405c.get(i12);
                                        break;
                                    }
                                    i12++;
                                }
                            }
                        }
                    }
                    if (document == null) {
                        document = r5.f(i10, j10);
                    }
                    TLRPC.Document document2 = document;
                    if (document2 != null) {
                        str4 = MessageObject.findAnimatedEmojiEmoticon(document2);
                    } else {
                        str4 = null;
                    }
                    String str5 = str4;
                    if (!MessageObject.isFreeEmoji(document2) && !UserConfig.getInstance(i10).isPremium() && (((uyVar = tzVar.f30800t1) == null || !uyVar.g()) && !tzVar.U0 && !z10)) {
                        tzVar.M(false);
                        if (n2Var != null) {
                            xcVar = xc.a0(n2Var);
                        } else {
                            xcVar = new xc(tzVar.f30791r, tzVar.Z1);
                        }
                        if (!tzVar.f30764h2 && n2Var != null) {
                            xcVar.J(R.raw.saved_messages, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint2)), LocaleController.getString(R.string.Open), new lw(tzVar, 4)).j();
                        } else {
                            xcVar.r(document2, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint)), LocaleController.getString(R.string.PremiumMore), new lw(tzVar, 3)).j();
                        }
                        tzVar.f30764h2 = !tzVar.f30764h2;
                        return;
                    }
                    tzVar.E2 = SystemClock.elapsedRealtime();
                    tzVar.M(true);
                    tzVar.h("animated_" + j10);
                    tzVar.f30800t1.x(j10, document2, str5, czVar.f25406c);
                    return;
                }
                return;
            }
            tzVar.E2 = SystemClock.elapsedRealtime();
            tzVar.M(true);
            if (str != null) {
                str2 = str;
            } else {
                str2 = (String) czVar.getTag();
            }
            new SpannableStringBuilder().append((CharSequence) str2);
            if (str == null) {
                if (!czVar.f25406c && (str3 = Emoji.emojiColor.get(str2)) != null) {
                    str2 = g(str2, str3);
                }
                tzVar.h(str2);
                uy uyVar2 = tzVar.f30800t1;
                if (uyVar2 != null) {
                    uyVar2.l(Emoji.fixEmoji(str2));
                    return;
                }
                return;
            }
            uy uyVar3 = tzVar.f30800t1;
            if (uyVar3 != null) {
                uyVar3.l(Emoji.fixEmoji(str));
            }
        }
    }

    public static void e(tz tzVar, int i10, int i11) {
        s4.b1 K;
        int[] iArr = tzVar.Q0;
        if (i10 == 1) {
            tzVar.n(i11, tzVar.P);
            return;
        }
        uy uyVar = tzVar.f30800t1;
        if ((uyVar == null || !uyVar.z()) && !tzVar.J0) {
            im0 y3 = tzVar.y(i10);
            if (i11 > 0 && y3 != null && y3.getVisibility() == 0 && (K = y3.K(0)) != null && K.f45910a.getTop() + tzVar.f30743b1 >= y3.getPaddingTop()) {
                return;
            }
            int i12 = iArr[i10] - i11;
            iArr[i10] = i12;
            if (i12 > 0) {
                iArr[i10] = 0;
            } else if (i12 < (-AndroidUtilities.dp(288.0f))) {
                iArr[i10] = -AndroidUtilities.dp(288.0f);
            }
            if (i10 == 0) {
                tzVar.Y();
            } else {
                tzVar.z(i10).setTranslationY(Math.max(-AndroidUtilities.dp(48.0f), iArr[i10]));
            }
        }
    }

    public static void f(tz tzVar, boolean z10) {
        int N0;
        zy zyVar = tzVar.f30765i0;
        xw xwVar = tzVar.f30782o0;
        uw uwVar = tzVar.f30762h0;
        if (uwVar != null && (uwVar.getAdapter() instanceof yy)) {
            yy yyVar = (yy) uwVar.getAdapter();
            if (!yyVar.f32776s && yyVar.h == 0 && !yyVar.f32778x.isEmpty() && (N0 = zyVar.N0()) != -1 && N0 > zyVar.B() - 5) {
                String str = yyVar.f32777w;
                String str2 = yyVar.f32775r;
                boolean z11 = yyVar.v;
                yyVar.F(str, str2, true, z11, z11);
            }
        }
        uy uyVar = tzVar.f30800t1;
        if (uyVar != null && uyVar.z()) {
            boolean z12 = false;
            s4.b1 K = uwVar.K(0);
            if (K == null) {
                gz.a(xwVar, true, !z10);
                return;
            }
            if (K.f45910a.getTop() < uwVar.getPaddingTop()) {
                z12 = true;
            }
            gz.a(xwVar, z12, !z10);
        } else if (xwVar != null && uwVar != null) {
            xwVar.f26693a.a(true, !z10);
        }
    }

    public static String g(String str, String str2) {
        boolean z10;
        String str3;
        if (CompoundEmoji.isHandshake(str) != null) {
            return CompoundEmoji.applyColor(str, str2);
        }
        if (Emoji.endsWithRightArrow(str)) {
            str = com.google.android.gms.internal.play_billing.k3.j(2, 0, str);
            z10 = true;
        } else {
            z10 = false;
        }
        int length = str.length();
        if (length > 2 && str.charAt(str.length() - 2) == 8205) {
            str3 = str.substring(str.length() - 2);
            str = com.google.android.gms.internal.play_billing.k3.j(2, 0, str);
        } else if (length > 3 && str.charAt(str.length() - 3) == 8205) {
            str3 = str.substring(str.length() - 3);
            str = com.google.android.gms.internal.play_billing.k3.j(3, 0, str);
        } else {
            str3 = null;
        }
        String u10 = r4.c.u(str, str2);
        if (str3 != null) {
            u10 = r4.c.u(u10, str3);
        }
        if (z10) {
            return r4.c.u(u10, "\u200d➡");
        }
        return u10;
    }

    public static void j(int i10, View view) {
        if (view == null) {
            return;
        }
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i10);
    }

    public final int A(int i10) {
        org.telegram.ui.ActionBar.d6 d6Var = this.Z1;
        if (d6Var != null) {
            return d6Var.u(i10);
        }
        return org.telegram.ui.ActionBar.h6.x0(null, i10, false);
    }

    public final void B() {
        dx dxVar = this.G0;
        if (dxVar != null) {
            dxVar.b();
        }
        xw xwVar = this.f30782o0;
        if (xwVar != null) {
            xwVar.b();
        }
        rw rwVar = this.V;
        if (rwVar != null) {
            rwVar.b();
        }
    }

    public final void C(boolean z10, boolean z11) {
        fz fzVar;
        boolean z12;
        if (this.A1 != 0 && this.f30810w1) {
            this.A1 = 0;
        }
        if (this.A1 == 0 && this.f30806v1) {
            this.A1 = 1;
        }
        int i10 = this.A1;
        gx gxVar = this.h;
        if (i10 != 0 && !z10 && this.e.size() != 1) {
            int i11 = this.A1;
            if (i11 == 1) {
                L(false, false);
                if (!this.f30802u0 && !this.f30805v0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                Q(z12, false);
                if (gxVar.getCurrentItem() != 2) {
                    gxVar.x(2, false);
                }
                ex exVar = this.B0;
                if (exVar != null) {
                    this.S0 = true;
                    int i12 = this.G1;
                    if (i12 >= 0) {
                        exVar.m(i12);
                    } else {
                        int i13 = this.F1;
                        if (i13 >= 0) {
                            exVar.m(i13);
                        } else {
                            exVar.m(this.E1);
                        }
                    }
                    this.S0 = false;
                    this.E0.h1(0, 0);
                }
            } else if (i11 == 2) {
                L(false, false);
                Q(false, false);
                if (gxVar.getCurrentItem() != 1) {
                    gxVar.x(1, false);
                }
                yx yxVar = this.f30785p0;
                if (yxVar != null) {
                    yxVar.m(0);
                }
                xw xwVar = this.f30782o0;
                if (xwVar != null && (fzVar = xwVar.f26698r) != null) {
                    fzVar.G1(null);
                }
            }
        } else {
            L(true, false);
            Q(false, false);
            if (gxVar.getCurrentItem() != 0) {
                gxVar.x(0, !z10);
            }
            if (z11) {
                AndroidUtilities.runOnUIThread(new lw(this, 5), 350L);
            }
        }
        M(true);
    }

    public final void D() {
        kz kzVar = this.f30817y0;
        if (kzVar != null) {
            kzVar.l();
        }
        oz ozVar = this.f30820z0;
        if (ozVar != null) {
            ozVar.l();
        }
        if (org.telegram.ui.gt.q().E) {
            org.telegram.ui.gt.q().n();
        }
        org.telegram.ui.gt.q().u();
    }

    public final void F(int i10) {
        uy uyVar = this.f30800t1;
        if ((uyVar != null && uyVar.z()) || i10 == 0) {
            return;
        }
        HorizontalScrollView z10 = z(i10);
        this.Q0[i10] = 0;
        z10.setTranslationY(0);
    }

    public final void G(int i10, int i11) {
        rx rxVar = this.Q;
        View m10 = rxVar.m(i10);
        int L0 = rxVar.L0();
        int i12 = 1;
        if ((m10 == null && Math.abs(i10 - L0) > rxVar.J * 9.0f) || !SharedConfig.animationsEnabled()) {
            if (rxVar.L0() < i10) {
                i12 = 0;
            }
            ll0 ll0Var = this.f30742b0;
            ll0Var.f28257b = i12;
            ll0Var.c(i10, i11, false, false);
            return;
        }
        this.J0 = true;
        ei.l1 l1Var = new ei.l1(this, this.P.getContext(), 1);
        l1Var.f46051a = i10;
        l1Var.f16143p = i11;
        rxVar.w0(l1Var);
    }

    public final void H(int i10, int i11) {
        bx bxVar = this.E0;
        View m10 = bxVar.m(i10);
        int L0 = bxVar.L0();
        int i12 = 1;
        if (m10 == null && Math.abs(i10 - L0) > 40) {
            if (bxVar.L0() < i10) {
                i12 = 0;
            }
            ll0 ll0Var = this.f30739a0;
            ll0Var.f28257b = i12;
            ll0Var.c(i10, i11, false, false);
            return;
        }
        this.J0 = true;
        this.D0.x0(i10);
    }

    public final void I(boolean z10, boolean z11, boolean z12, boolean z13) {
        ArrayList arrayList = this.e;
        arrayList.clear();
        boolean z14 = false;
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.d;
            if (i10 >= arrayList2.size()) {
                break;
            }
            if (((pz) arrayList2.get(i10)).f29470a == 0 && z10) {
                arrayList.add((pz) arrayList2.get(i10));
            }
            if (((pz) arrayList2.get(i10)).f29470a == 1 && z12) {
                arrayList.add((pz) arrayList2.get(i10));
            }
            if (((pz) arrayList2.get(i10)).f29470a == 2 && z11) {
                arrayList.add((pz) arrayList2.get(i10));
            }
            i10++;
        }
        xd0 xd0Var = this.f30808w;
        if (xd0Var != null) {
            if (arrayList.size() > 1) {
                z14 = true;
            }
            AndroidUtilities.updateViewVisibilityAnimated(xd0Var, z14, 1.0f, z13);
        }
        gx gxVar = this.h;
        if (gxVar != null) {
            gxVar.setAdapter(null);
            gxVar.setAdapter(this.L0);
            if (xd0Var != null) {
                xd0Var.setViewPager(gxVar);
            }
        }
    }

    public final void J(final oh.b bVar, final TLObject tLObject, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final boolean z10, boolean z11) {
        String formatPluralString;
        oz ozVar;
        ty tyVar;
        if (stickerSet != null) {
            if (!z10 || (tyVar = this.S) == null || tyVar.d == stickerSet.f20299id) {
                if (!z10 && (ozVar = this.f30820z0) != null && ozVar.d != stickerSet.f20299id) {
                    return;
                }
                final boolean isStickerPackInstalled = MediaDataController.getInstance(this.f30747c1).isStickerPackInstalled(stickerSet.f20299id);
                if (isStickerPackInstalled) {
                    if (stickerSet.masks) {
                        formatPluralString = LocaleController.formatPluralString("RemoveManyMasksCount", stickerSet.count, new Object[0]);
                    } else if (stickerSet.emojis) {
                        formatPluralString = LocaleController.formatPluralString("RemoveManyEmojiCount", stickerSet.count, new Object[0]);
                    } else {
                        formatPluralString = LocaleController.formatPluralString("RemoveManyStickersCount", stickerSet.count, new Object[0]);
                    }
                } else if (stickerSet.masks) {
                    formatPluralString = LocaleController.formatPluralString("AddManyMasksCount", stickerSet.count, new Object[0]);
                } else if (stickerSet.emojis) {
                    formatPluralString = LocaleController.formatPluralString("AddManyEmojiCount", stickerSet.count, new Object[0]);
                } else {
                    formatPluralString = LocaleController.formatPluralString("AddManyStickersCount", stickerSet.count, new Object[0]);
                }
                bVar.g(formatPluralString, z11, true);
                bVar.f17743h0.a(!isStickerPackInstalled, z11);
                bVar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        int i10;
                        tz tzVar = tz.this;
                        MediaDataController mediaDataController = MediaDataController.getInstance(tzVar.f30747c1);
                        Context context = tzVar.getContext();
                        if (isStickerPackInstalled) {
                            i10 = 0;
                        } else {
                            i10 = 2;
                        }
                        int i11 = i10;
                        org.telegram.ui.ActionBar.n2 n2Var = tzVar.Y1;
                        FrameLayout frameLayout = tzVar.f30795s;
                        oh.b bVar2 = bVar;
                        TLObject tLObject2 = tLObject;
                        TLRPC.StickerSet stickerSet2 = stickerSet;
                        TLRPC.Document document2 = document;
                        boolean z12 = z10;
                        mediaDataController.toggleStickerSet(context, tLObject2, document2, i11, n2Var, frameLayout, false, true, new ai.m4(tzVar, bVar2, tLObject2, stickerSet2, document2, z12), false);
                        tzVar.J(bVar2, tLObject2, stickerSet2, document2, z12, true);
                    }
                });
            }
        }
    }

    public final void K(long j10, boolean z10, boolean z11) {
        int i10;
        View childAt;
        float f7;
        xd0 xd0Var = this.f30808w;
        if (xd0Var != null) {
            this.f30806v1 = z10;
            this.f30810w1 = z11;
            if (!z11 && !z10) {
                this.f30803u1 = 0L;
            } else {
                this.f30803u1 = j10;
            }
            if (z11) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            LinearLayout linearLayout = xd0Var.d;
            if (i10 >= linearLayout.getChildCount()) {
                childAt = null;
            } else {
                childAt = linearLayout.getChildAt(i10);
            }
            if (childAt != null) {
                if (this.f30803u1 != 0) {
                    f7 = 0.15f;
                } else {
                    f7 = 1.0f;
                }
                childAt.setAlpha(f7);
                gx gxVar = this.h;
                if (z11) {
                    if (this.f30803u1 != 0 && gxVar.getCurrentItem() != 0) {
                        L(true, true);
                        Q(false, true);
                        gxVar.x(0, false);
                    }
                } else if (this.f30803u1 != 0 && gxVar.getCurrentItem() != 1) {
                    L(false, true);
                    Q(false, true);
                    gxVar.x(1, false);
                }
            }
        }
    }

    public final void L(boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        float f12;
        hx hxVar = this.f30812x;
        if (!z10 || hxVar.getTag() != null) {
            if ((!z10 && hxVar.getTag() != null) || this.f30781n2) {
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
            hxVar.setTag(num);
            int i10 = 0;
            float f13 = 0.0f;
            if (z11) {
                if (z10) {
                    hxVar.setVisibility(0);
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.F = animatorSet2;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(hxVar, View.ALPHA, f11);
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(hxVar, View.SCALE_X, f12);
                if (z10) {
                    f13 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(hxVar, View.SCALE_Y, f13));
                this.F.setDuration(200L);
                this.F.setInterpolator(bs.f25031g);
                this.F.addListener(new nx(this, z10, 0));
                this.F.start();
                return;
            }
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            hxVar.setAlpha(f7);
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            hxVar.setScaleX(f10);
            if (z10) {
                f13 = 1.0f;
            }
            hxVar.setScaleY(f13);
            if (!z10) {
                i10 = 4;
            }
            hxVar.setVisibility(i10);
        }
    }

    public final void M(boolean z10) {
        Integer num;
        this.H = 0.0f;
        uy uyVar = this.f30800t1;
        if (uyVar != null && uyVar.z()) {
            z10 = false;
        }
        FrameLayout frameLayout = this.f30778n;
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
                this.W.setInterpolator(bs.f25031g);
                this.W.addListener(new org.telegram.ui.pq(this, 24));
                this.W.start();
                return;
            }
            if (z10) {
                f7 = 1.0f;
            }
            view.setAlpha(f7);
        }
    }

    public final void O(boolean z10) {
        for (int i10 = 0; i10 < 3; i10++) {
            s4.s x10 = x(i10);
            int L0 = x10.L0();
            if (z10) {
                if (L0 == 1 || L0 == 2) {
                    x10.n0(0);
                    F(i10);
                }
            } else if (L0 == 0) {
                x10.h1(0, 0);
            }
        }
    }

    public final void P(boolean z10, boolean z11, boolean z12) {
        float f7;
        float translationY;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.Chat chat = MessagesController.getInstance(this.f30747c1).getChat(Long.valueOf(this.f30803u1));
        if (chat != null) {
            ai.vd vdVar = this.N0;
            if (z10) {
                if (!ChatObject.hasAdminRights(chat) && (tL_chatBannedRights = chat.default_banned_rights) != null && (tL_chatBannedRights.send_stickers || (z11 && tL_chatBannedRights.send_plain))) {
                    org.telegram.ui.ActionBar.n2 n2Var = this.Y1;
                    if (!(n2Var instanceof org.telegram.ui.sn) || !((org.telegram.ui.sn) n2Var).N6()) {
                        if (z11) {
                            vdVar.setText(LocaleController.getString(R.string.GlobalAttachEmojiRestricted));
                        } else if (z12) {
                            vdVar.setText(LocaleController.getString(R.string.GlobalAttachGifRestricted));
                        } else {
                            vdVar.setText(LocaleController.getString(R.string.GlobalAttachStickersRestricted));
                        }
                    } else {
                        return;
                    }
                } else {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights2 = chat.banned_rights;
                    if (tL_chatBannedRights2 == null) {
                        return;
                    }
                    if (AndroidUtilities.isBannedForever(tL_chatBannedRights2)) {
                        if (z11) {
                            vdVar.setText(LocaleController.getString(R.string.AttachPlainRestrictedForever));
                        } else if (z12) {
                            vdVar.setText(LocaleController.getString(R.string.AttachGifRestrictedForever));
                        } else {
                            vdVar.setText(LocaleController.getString(R.string.AttachStickersRestrictedForever));
                        }
                    } else {
                        if (z11) {
                            vdVar.setText(LocaleController.formatString("AttachPlainRestricted", R.string.AttachPlainRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                        }
                        if (z12) {
                            vdVar.setText(LocaleController.formatString("AttachGifRestricted", R.string.AttachGifRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                        } else {
                            vdVar.setText(LocaleController.formatString("AttachStickersRestricted", R.string.AttachStickersRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                        }
                    }
                }
                vdVar.setVisibility(0);
            }
            AnimatorSet animatorSet = this.J2;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.J2 = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.J2 = animatorSet2;
            float f10 = 1.0f;
            if (z10) {
                f7 = vdVar.getAlpha();
            } else {
                f7 = 1.0f;
            }
            float f11 = 0.0f;
            if (!z10) {
                f10 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(vdVar, View.ALPHA, f7, f10);
            if (z10) {
                translationY = AndroidUtilities.dp(12.0f);
            } else {
                translationY = vdVar.getTranslationY();
            }
            if (!z10) {
                f11 = AndroidUtilities.dp(12.0f);
            }
            animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(vdVar, View.TRANSLATION_Y, translationY, f11));
            e2.n0 n0Var = this.K2;
            if (n0Var != null) {
                AndroidUtilities.cancelRunOnUIThread(n0Var);
            }
            if (z10) {
                e2.n0 n0Var2 = new e2.n0(this, z11, z12, 4);
                this.K2 = n0Var2;
                AndroidUtilities.runOnUIThread(n0Var2, 3500L);
            }
            this.J2.setDuration(320L);
            this.J2.setInterpolator(bs.h);
            this.J2.start();
        }
    }

    public final void Q(boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        float f12;
        ImageView imageView = this.f30816y;
        if (imageView != null && !this.f30784o2) {
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
                        this.G.setInterpolator(bs.f25031g);
                        this.G.addListener(new nx(this, z10, 1));
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

    public final void R() {
        int measuredHeight;
        int dp;
        org.telegram.ui.ActionBar.n2 n2Var;
        View view = (View) getParent();
        if (view != null) {
            float y3 = getY();
            if (getLayoutParams().height > 0) {
                measuredHeight = getLayoutParams().height;
            } else {
                measuredHeight = getMeasuredHeight();
            }
            float f7 = y3 + measuredHeight;
            if ((!AndroidUtilities.isInMultiwindow && ((n2Var = this.Y1) == null || !n2Var.isInBubbleMode())) || this.V0) {
                dp = view.getHeight();
            } else {
                dp = AndroidUtilities.dp(1.0f);
            }
            float f10 = f7 - dp;
            int i10 = (this.f30790q2 > 0.0f ? 1 : (this.f30790q2 == 0.0f ? 0 : -1));
            FrameLayout frameLayout = this.f30778n;
            if (i10 >= 0) {
                f10 += getMeasuredHeight() - this.f30790q2;
            } else if (frameLayout.getTop() - f10 < 0.0f || !this.f30811w2) {
                f10 = 0.0f;
            }
            float lerp = (-f10) + AndroidUtilities.lerp(AndroidUtilities.dp(50.0f), -this.f30787p2, this.F2.e);
            frameLayout.setTranslationY(lerp);
            if (this.f30749d0) {
                this.f30791r.setTranslationY(lerp);
            }
        }
    }

    public final void S() {
        gz gzVar;
        boolean z10;
        int A;
        int A2;
        int A3;
        int A4;
        int A5;
        int A6;
        int A7;
        int A8;
        gw gwVar;
        int A9;
        int A10;
        int A11;
        int A12;
        int A13;
        int A14;
        int A15;
        int A16;
        int A17;
        boolean z11 = this.f30802u0;
        View view = this.v;
        if (!z11) {
            setBackground(null);
            view.setBackground(null);
        } else if (!AndroidUtilities.isInMultiwindow && !this.N1) {
            int i10 = org.telegram.ui.ActionBar.h6.He;
            setBackgroundColor(A(i10));
            if (this.f30749d0) {
                view.setBackgroundColor(A(i10));
            }
        } else {
            Drawable background = getBackground();
            if (background != null) {
                background.setColorFilter(new PorterDuffColorFilter(A(org.telegram.ui.ActionBar.h6.He), PorterDuff.Mode.MULTIPLY));
            }
        }
        vx vxVar = this.I;
        if (vxVar != null) {
            if (this.f30802u0) {
                vxVar.setBackgroundColor(A(org.telegram.ui.ActionBar.h6.He));
                this.O.setBackgroundColor(A(org.telegram.ui.ActionBar.h6.Ke));
            } else {
                vxVar.setBackground(null);
            }
        }
        ev evVar = this.B1;
        if (evVar != null) {
            evVar.f26003c.a();
        }
        int i11 = 0;
        while (true) {
            gzVar = this.V;
            z10 = this.f30767i2;
            if (i11 >= 3) {
                break;
            }
            if (i11 == 0) {
                gzVar = this.G0;
            } else if (i11 != 1) {
                gzVar = this.f30782o0;
            }
            if (gzVar != null) {
                sq sqVar = gzVar.d;
                FrameLayout frameLayout = gzVar.f26697n;
                View view2 = gzVar.f26696f;
                if (this.f30802u0) {
                    view2.setBackgroundColor(A(org.telegram.ui.ActionBar.h6.He));
                } else {
                    view2.setBackground(null);
                }
                gzVar.e.setBackgroundColor(A(org.telegram.ui.ActionBar.h6.Ke));
                vn0 vn0Var = gzVar.f26695c;
                if (z10) {
                    A14 = w(0.4f);
                } else {
                    A14 = A(org.telegram.ui.ActionBar.h6.Je);
                }
                vn0Var.a(A14);
                Drawable background2 = frameLayout.getBackground();
                if (z10) {
                    A15 = w(0.06f);
                } else {
                    A15 = A(org.telegram.ui.ActionBar.h6.Ie);
                }
                org.telegram.ui.ActionBar.h6.x1(A15, background2);
                frameLayout.invalidate();
                if (z10) {
                    A16 = w(0.45f);
                } else {
                    A16 = A(org.telegram.ui.ActionBar.h6.Je);
                }
                sqVar.setHintTextColor(A16);
                if (z10) {
                    A17 = w(0.8f);
                } else {
                    A17 = A(org.telegram.ui.ActionBar.h6.G6);
                }
                sqVar.setTextColor(A17);
            }
            i11++;
        }
        Paint paint = this.f30797s1;
        if (paint != null) {
            paint.setColor(A(org.telegram.ui.ActionBar.h6.f20936af));
        }
        ey eyVar = this.P;
        if (eyVar != null) {
            eyVar.setGlowColor(A(org.telegram.ui.ActionBar.h6.He));
        }
        ax axVar = this.D0;
        if (axVar != null) {
            axVar.setGlowColor(A(org.telegram.ui.ActionBar.h6.He));
        }
        ex exVar = this.B0;
        if (exVar != null) {
            exVar.setIndicatorColor(A(org.telegram.ui.ActionBar.h6.Qe));
            exVar.setUnderlineColor(A(org.telegram.ui.ActionBar.h6.Ke));
            if (this.f30802u0) {
                exVar.setBackgroundColor(A(org.telegram.ui.ActionBar.h6.He));
            } else {
                exVar.setBackground(null);
            }
        }
        yx yxVar = this.f30785p0;
        if (yxVar != null) {
            yxVar.setIndicatorColor(A(org.telegram.ui.ActionBar.h6.Qe));
            yxVar.setUnderlineColor(A(org.telegram.ui.ActionBar.h6.Ke));
            if (this.f30802u0) {
                yxVar.setBackgroundColor(A(org.telegram.ui.ActionBar.h6.He));
            } else {
                yxVar.setBackground(null);
            }
        }
        hx hxVar = this.f30812x;
        if (hxVar != null) {
            if (z10) {
                A13 = w(0.6f);
            } else {
                A13 = A(org.telegram.ui.ActionBar.h6.Re);
            }
            hxVar.setColorFilter(new PorterDuffColorFilter(A13, PorterDuff.Mode.MULTIPLY));
            if (gzVar == null) {
                Drawable background3 = hxVar.getBackground();
                int i12 = org.telegram.ui.ActionBar.h6.He;
                org.telegram.ui.ActionBar.h6.C1(background3, A(i12), false);
                org.telegram.ui.ActionBar.h6.C1(hxVar.getBackground(), A(i12), true);
            }
        }
        ImageView imageView = this.f30816y;
        if (imageView != null) {
            if (z10) {
                A12 = w(0.6f);
            } else {
                A12 = A(org.telegram.ui.ActionBar.h6.Re);
            }
            imageView.setColorFilter(new PorterDuffColorFilter(A12, PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.E;
        if (imageView2 != null) {
            if (z10) {
                A11 = w(0.6f);
            } else {
                A11 = A(org.telegram.ui.ActionBar.h6.Re);
            }
            imageView2.setColorFilter(new PorterDuffColorFilter(A11, PorterDuff.Mode.MULTIPLY));
        }
        ai.vd vdVar = this.N0;
        if (vdVar != null) {
            ((ShapeDrawable) vdVar.getBackground()).getPaint().setColor(A(org.telegram.ui.ActionBar.h6.f21232qf));
            vdVar.setTextColor(A(org.telegram.ui.ActionBar.h6.f21213pf));
        }
        yy yyVar = this.f30768j0;
        if (yyVar != null) {
            az azVar = yyVar.e;
            ImageView imageView3 = azVar.f24742a;
            int i13 = org.telegram.ui.ActionBar.h6.Le;
            imageView3.setColorFilter(new PorterDuffColorFilter(A(i13), PorterDuff.Mode.MULTIPLY));
            azVar.f24743b.setTextColor(A(i13));
            azVar.f24744c.setProgressColor(A(org.telegram.ui.ActionBar.h6.f21058h6));
        }
        this.f30754e2 = new PorterDuffColorFilter(A(org.telegram.ui.ActionBar.h6.Oh), PorterDuff.Mode.SRC_IN);
        int i14 = 0;
        while (true) {
            Drawable[] drawableArr = this.X0;
            if (i14 >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i14];
            if (z10) {
                A9 = w(0.4f);
            } else {
                A9 = A(org.telegram.ui.ActionBar.h6.Ne);
            }
            org.telegram.ui.ActionBar.h6.z1(drawable, A9, false);
            Drawable drawable2 = drawableArr[i14];
            if (z10) {
                A10 = w(0.8f);
            } else {
                A10 = A(org.telegram.ui.ActionBar.h6.Oe);
            }
            org.telegram.ui.ActionBar.h6.z1(drawable2, A10, true);
            i14++;
        }
        if (vxVar != null && (gwVar = vxVar.f28011y) != null) {
            gwVar.d();
        }
        int i15 = 0;
        while (true) {
            Drawable[] drawableArr2 = this.Y0;
            if (i15 >= drawableArr2.length) {
                break;
            }
            Drawable drawable3 = drawableArr2[i15];
            if (z10) {
                A7 = w(0.4f);
            } else {
                A7 = A(org.telegram.ui.ActionBar.h6.Me);
            }
            org.telegram.ui.ActionBar.h6.z1(drawable3, A7, false);
            Drawable drawable4 = drawableArr2[i15];
            if (z10) {
                A8 = w(0.8f);
            } else {
                A8 = A(org.telegram.ui.ActionBar.h6.Oe);
            }
            org.telegram.ui.ActionBar.h6.z1(drawable4, A8, true);
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
                A5 = w(0.4f);
            } else {
                A5 = A(org.telegram.ui.ActionBar.h6.Me);
            }
            org.telegram.ui.ActionBar.h6.z1(drawable5, A5, false);
            Drawable drawable6 = drawableArr3[i16];
            if (z10) {
                A6 = w(0.8f);
            } else {
                A6 = A(org.telegram.ui.ActionBar.h6.Oe);
            }
            org.telegram.ui.ActionBar.h6.z1(drawable6, A6, true);
            i16++;
        }
        org.telegram.ui.ActionBar.t5 t5Var = this.a2;
        if (t5Var != null) {
            if (z10) {
                A3 = w(0.4f);
            } else {
                A3 = A(org.telegram.ui.ActionBar.h6.Ne);
            }
            org.telegram.ui.ActionBar.h6.z1(t5Var, A3, false);
            if (z10) {
                A4 = w(0.8f);
            } else {
                A4 = A(org.telegram.ui.ActionBar.h6.Oe);
            }
            org.telegram.ui.ActionBar.h6.z1(t5Var, A4, true);
        }
        org.telegram.ui.ActionBar.t5 t5Var2 = this.f30744b2;
        if (t5Var2 != null) {
            if (z10) {
                A = w(0.4f);
            } else {
                A = A(org.telegram.ui.ActionBar.h6.Qe);
            }
            org.telegram.ui.ActionBar.h6.z1(t5Var2, A, false);
            if (z10) {
                A2 = w(0.8f);
            } else {
                A2 = A(org.telegram.ui.ActionBar.h6.Qe);
            }
            org.telegram.ui.ActionBar.h6.z1(t5Var2, A2, true);
        }
    }

    public final void T() {
        ey eyVar = this.P;
        if (eyVar != null) {
            for (int i10 = 0; i10 < eyVar.getChildCount(); i10++) {
                View childAt = eyVar.getChildAt(i10);
                if (childAt instanceof jy) {
                    ((jy) childAt).a(true);
                }
            }
        }
    }

    public final void U(int i10) {
        int i11;
        if (!this.f30756f0) {
            int i12 = -1;
            if (i10 != -1) {
                int size = getRecentEmoji().size() + (this.f30749d0 ? 1 : 0);
                ay ayVar = this.R;
                int i13 = ayVar.f24731c;
                ArrayList arrayList = ayVar.f24737x;
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
                        String[][] strArr = EmojiData.dataColored;
                        if (i16 >= strArr.length) {
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
                        ArrayList<fy> emojipacks = getEmojipacks();
                        int size2 = arrayList.size() - 1;
                        while (true) {
                            if (size2 < 0) {
                                break;
                            } else if (((Integer) arrayList.get(size2)).intValue() <= i10) {
                                fy fyVar = (fy) this.f30789q1.get(size2);
                                while (i14 < emojipacks.size()) {
                                    long j10 = emojipacks.get(i14).f26404b.f20299id;
                                    long j11 = fyVar.f26404b.f20299id;
                                    if (j10 == j11 && (!fyVar.f26407g || (!fyVar.f26406f && !this.f30786p1.contains(Long.valueOf(j11))))) {
                                        i14 = EmojiData.dataColored.length + 1 + i14;
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

    public final void V() {
        boolean z10;
        boolean z11;
        int i10;
        fz fzVar;
        int i11;
        boolean z12;
        boolean z13;
        yx yxVar = this.f30785p0;
        int currentPosition = yxVar.getCurrentPosition();
        int i12 = this.f30792r0;
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
        boolean isEmpty = this.f30766i1.isEmpty();
        yxVar.d(false);
        this.f30792r0 = -2;
        this.f30796s0 = -2;
        this.f30799t0 = -2;
        Drawable[] drawableArr = this.Z0;
        if (!isEmpty) {
            this.f30792r0 = 0;
            yxVar.b(0, drawableArr[0]).setContentDescription(LocaleController.getString(R.string.RecentStickers));
            i10 = 1;
        } else {
            i10 = 0;
        }
        this.f30796s0 = i10;
        yxVar.b(1, drawableArr[1]).setContentDescription(LocaleController.getString(R.string.FeaturedGifs));
        this.f30799t0 = i10 + 1;
        AndroidUtilities.dp(13.0f);
        AndroidUtilities.dp(11.0f);
        int i13 = this.f30747c1;
        ArrayList<String> arrayList = MessagesController.getInstance(i13).gifSearchEmojies;
        int size = arrayList.size();
        int i14 = 0;
        while (i14 < size) {
            String str = arrayList.get(i14);
            Emoji.EmojiDrawable emojiDrawable = Emoji.getEmojiDrawable(str);
            if (emojiDrawable != null) {
                TLRPC.Document emojiAnimatedSticker = MediaDataController.getInstance(i13).getEmojiAnimatedSticker(str);
                String j10 = i2.d.j(i14 + 3, "tab");
                int i15 = yxVar.f26621x;
                yxVar.f26621x = i15 + 1;
                wx0 wx0Var = (wx0) yxVar.f26611n.get(j10);
                if (wx0Var != null) {
                    yxVar.g(j10, wx0Var, i15);
                    i11 = currentPosition;
                    z12 = z11;
                } else {
                    i11 = currentPosition;
                    z12 = z11;
                    wx0Var = new wx0(yxVar.getContext(), 2);
                    wx0Var.setFocusable(true);
                    wx0Var.setOnClickListener(new zm0(yxVar, 2));
                    wx0Var.setExpanded(yxVar.f26604f0);
                    wx0Var.a(yxVar.f26607i0);
                    yxVar.e.addView(wx0Var, i15);
                }
                wx0Var.d = false;
                wx0Var.setTag(R.id.index_tag, Integer.valueOf(i15));
                wx0Var.setTag(R.id.parent_tag, emojiDrawable);
                wx0Var.setTag(R.id.object_tag, emojiAnimatedSticker);
                if (i15 == yxVar.f26622y) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                wx0Var.setSelected(z13);
                yxVar.h.put(j10, wx0Var);
                wx0Var.setContentDescription(str);
            } else {
                i11 = currentPosition;
                z12 = z11;
            }
            i14++;
            currentPosition = i11;
            z11 = z12;
        }
        int i16 = currentPosition;
        boolean z14 = z11;
        yxVar.h();
        yxVar.q();
        if (z10 && isEmpty) {
            yxVar.m(this.f30796s0);
            xw xwVar = this.f30782o0;
            if (xwVar != null && (fzVar = xwVar.f26698r) != null) {
                fzVar.G1(null);
                return;
            }
            return;
        }
        WeakHashMap weakHashMap = r0.i0.f44818a;
        if (yxVar.isLaidOut()) {
            if (!isEmpty && !z14) {
                yxVar.k(i16 + 1, 0);
            } else if (isEmpty && z14) {
                yxVar.k(i16 - 1, 0);
            }
        }
    }

    public final void W() {
        yy yyVar;
        int size = this.f30766i1.size();
        long calcDocumentsHash = MediaDataController.calcDocumentsHash(this.f30766i1, Integer.MAX_VALUE);
        ArrayList<TLRPC.Document> recentGifs = MediaDataController.getInstance(this.f30747c1).getRecentGifs();
        this.f30766i1 = recentGifs;
        long calcDocumentsHash2 = MediaDataController.calcDocumentsHash(recentGifs, Integer.MAX_VALUE);
        if ((this.f30785p0 != null && size == 0 && !this.f30766i1.isEmpty()) || (size != 0 && this.f30766i1.isEmpty())) {
            V();
        }
        if ((size != this.f30766i1.size() || calcDocumentsHash != calcDocumentsHash2) && (yyVar = this.f30779n0) != null) {
            yyVar.l();
        }
    }

    public final void X(boolean z10) {
        boolean z11;
        TLRPC.Document document;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        ArrayList<TLRPC.Document> arrayList;
        boolean z16;
        ArrayList<TLRPC.Document> arrayList2;
        TLRPC.StickerSet stickerSet;
        int i10;
        ex exVar = this.B0;
        if (exVar != null) {
            sa1 sa1Var = exVar.e;
            if (exVar.f26618s != null) {
                return;
            }
            this.F1 = -2;
            this.G1 = -2;
            this.H1 = -2;
            this.I1 = -2;
            this.f30752e0 = false;
            this.E1 = 0;
            int currentPosition = exVar.getCurrentPosition();
            boolean z17 = true;
            if (getParent() != null && getVisibility() == 0 && (this.f30818y1.size() != 0 || this.f30821z1.size() != 0)) {
                z11 = true;
            } else {
                z11 = false;
            }
            exVar.d(z11);
            int i11 = this.f30747c1;
            MediaDataController mediaDataController = MediaDataController.getInstance(i11);
            SharedPreferences emojiSettings = MessagesController.getEmojiSettings(i11);
            ArrayList arrayList3 = this.f30776m1;
            arrayList3.clear();
            ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = mediaDataController.getFeaturedStickerSets();
            int size = featuredStickerSets.size();
            for (int i12 = 0; i12 < size; i12++) {
                TLRPC.StickerSetCovered stickerSetCovered = featuredStickerSets.get(i12);
                if (!mediaDataController.isStickerPackInstalled(stickerSetCovered.set.f20299id)) {
                    arrayList3.add(stickerSetCovered);
                }
            }
            rz rzVar = this.F0;
            if (rzVar != null) {
                rzVar.l();
            }
            boolean isEmpty = featuredStickerSets.isEmpty();
            long j10 = 0;
            Drawable[] drawableArr = this.Y0;
            if (!isEmpty && (arrayList3.isEmpty() || emojiSettings.getLong("featured_hidden", 0L) == featuredStickerSets.get(0).set.f20299id)) {
                if (mediaDataController.getUnreadStickerSets().isEmpty()) {
                    i10 = 2;
                } else {
                    i10 = 3;
                }
                wx0 c10 = exVar.c(i10, drawableArr[i10]);
                c10.h.setText(LocaleController.getString(R.string.FeaturedStickersShort));
                c10.setContentDescription(LocaleController.getString(R.string.FeaturedStickers));
                int i13 = this.E1;
                this.H1 = i13;
                this.E1 = i13 + 1;
            }
            if (!this.f30772k1.isEmpty()) {
                int i14 = this.E1;
                this.G1 = i14;
                this.E1 = i14 + 1;
                wx0 c11 = exVar.c(1, drawableArr[1]);
                c11.h.setText(LocaleController.getString(R.string.FavoriteStickersShort));
                c11.setContentDescription(LocaleController.getString(R.string.FavoriteStickers));
            }
            if (!this.f30769j1.isEmpty()) {
                int i15 = this.E1;
                this.F1 = i15;
                this.E1 = i15 + 1;
                wx0 c12 = exVar.c(0, drawableArr[0]);
                c12.h.setText(LocaleController.getString(R.string.RecentStickersShort));
                c12.setContentDescription(LocaleController.getString(R.string.RecentStickers));
            }
            ArrayList arrayList4 = this.f30750d1;
            arrayList4.clear();
            org.telegram.ui.ActionBar.d6 d6Var = null;
            this.f30763h1 = null;
            this.f30757f1 = -1;
            this.f30753e1 = -10;
            if (this.G2 == null || z10) {
                this.G2 = new ArrayList(mediaDataController.getStickerSets(0));
            }
            ArrayList<TLRPC.TL_messages_stickerSet> arrayList5 = this.G2;
            int i16 = 0;
            while (true) {
                TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.f30814x1;
                if (i16 >= stickerSetCoveredArr.length) {
                    break;
                }
                TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCoveredArr[i16];
                long j11 = j10;
                if (stickerSetCovered2 != null) {
                    TLRPC.TL_messages_stickerSet stickerSetById = mediaDataController.getStickerSetById(stickerSetCovered2.set.f20299id);
                    if (stickerSetById != null && (stickerSet = stickerSetById.set) != null && !stickerSet.archived) {
                        stickerSetCoveredArr[i16] = null;
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
                            arrayList4.add(tL_messages_stickerSet);
                        }
                    }
                }
                i16++;
                j10 = j11;
            }
            long j12 = j10;
            ArrayList<TLRPC.TL_messages_stickerSet> filterPremiumStickers = MessagesController.getInstance(i11).filterPremiumStickers(arrayList5);
            for (int i17 = 0; i17 < filterPremiumStickers.size(); i17++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = filterPremiumStickers.get(i17);
                TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet2.set;
                if ((stickerSet2 == null || !stickerSet2.archived) && (arrayList2 = tL_messages_stickerSet2.documents) != null && !arrayList2.isEmpty()) {
                    arrayList4.add(tL_messages_stickerSet2);
                }
            }
            if (this.J1 != null) {
                long j13 = MessagesController.getEmojiSettings(i11).getLong("group_hide_stickers_" + this.J1.f20273id, -1L);
                TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(this.J1.f20273id));
                if (chat != null && this.J1.stickerset != null && ChatObject.hasAdminRights(chat)) {
                    TLRPC.StickerSet stickerSet3 = this.J1.stickerset;
                    if (stickerSet3 != null) {
                        if (j13 == stickerSet3.f20299id) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        this.f30760g1 = z16;
                    }
                } else {
                    if (j13 != -1) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    this.f30760g1 = z15;
                }
                TLRPC.ChatFull chatFull = this.J1;
                TLRPC.StickerSet stickerSet4 = chatFull.stickerset;
                if (stickerSet4 != null) {
                    TLRPC.TL_messages_stickerSet groupStickerSetById = mediaDataController.getGroupStickerSetById(stickerSet4);
                    if (groupStickerSetById != null && (arrayList = groupStickerSetById.documents) != null && !arrayList.isEmpty() && groupStickerSetById.set != null) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = new TLRPC.TL_messages_stickerSet();
                        tL_messages_stickerSet3.documents = groupStickerSetById.documents;
                        tL_messages_stickerSet3.packs = groupStickerSetById.packs;
                        tL_messages_stickerSet3.set = groupStickerSetById.set;
                        if (this.f30760g1) {
                            this.f30753e1 = arrayList4.size();
                            arrayList4.add(tL_messages_stickerSet3);
                        } else {
                            this.f30753e1 = 0;
                            arrayList4.add(0, tL_messages_stickerSet3);
                        }
                        if (!this.J1.can_set_stickers) {
                            tL_messages_stickerSet3 = null;
                        }
                        this.f30763h1 = tL_messages_stickerSet3;
                    }
                } else if (chatFull.can_set_stickers) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = new TLRPC.TL_messages_stickerSet();
                    if (this.f30760g1) {
                        this.f30753e1 = arrayList4.size();
                        arrayList4.add(tL_messages_stickerSet4);
                    } else {
                        this.f30753e1 = 0;
                        arrayList4.add(0, tL_messages_stickerSet4);
                    }
                }
            }
            int i18 = 0;
            while (i18 < arrayList4.size()) {
                if (i18 == this.f30753e1) {
                    TLRPC.Chat chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(this.J1.f20273id));
                    if (chat2 == null) {
                        arrayList4.remove(0);
                        i18--;
                    } else {
                        this.f30752e0 = z17;
                        String str = "chat" + chat2.f20272id;
                        int i19 = exVar.f26621x;
                        exVar.f26621x = i19 + 1;
                        wx0 wx0Var = (wx0) exVar.f26611n.get(str);
                        if (wx0Var != null) {
                            exVar.g(str, wx0Var, i19);
                        } else {
                            wx0Var = new wx0(exVar.getContext(), 0);
                            wx0Var.setFocusable(z17);
                            wx0Var.setOnClickListener(new zm0(exVar, 0));
                            sa1Var.addView(wx0Var, i19);
                            wx0Var.f32236w = z17;
                            h9 h9Var = new h9(d6Var);
                            h9Var.u(AndroidUtilities.dp(14.0f));
                            h9Var.k(UserConfig.selectedAccount, chat2);
                            int i20 = exVar.f26595a;
                            w9 w9Var = wx0Var.e;
                            w9Var.setLayerNum(i20);
                            w9Var.e(chat2, h9Var);
                            w9Var.setAspectFit(z17);
                            wx0Var.setExpanded(exVar.f26604f0);
                            wx0Var.a(exVar.f26607i0);
                            wx0Var.h.setText(chat2.title);
                        }
                        wx0Var.d = z17;
                        wx0Var.setTag(R.id.index_tag, Integer.valueOf(i19));
                        if (i19 == exVar.f26622y) {
                            z14 = z17;
                        } else {
                            z14 = false;
                        }
                        wx0Var.setSelected(z14);
                        exVar.h.put(str, wx0Var);
                    }
                    z12 = z17;
                } else {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet5 = (TLRPC.TL_messages_stickerSet) arrayList4.get(i18);
                    TLRPC.StickerSet stickerSet5 = tL_messages_stickerSet5.set;
                    if (stickerSet5 != null && stickerSet5.thumb_document_id != j12) {
                        for (int i21 = 0; i21 < tL_messages_stickerSet5.documents.size(); i21++) {
                            document = tL_messages_stickerSet5.documents.get(i21);
                            if (document != null && tL_messages_stickerSet5.set.thumb_document_id == document.f20278id) {
                                break;
                            }
                        }
                    }
                    document = null;
                    if (document == null) {
                        document = tL_messages_stickerSet5.documents.get(0);
                    }
                    Object closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tL_messages_stickerSet5.set.thumbs, 90);
                    if (closestPhotoSizeWithSize == null || tL_messages_stickerSet5.set.gifs) {
                        closestPhotoSizeWithSize = document;
                    }
                    String str2 = "set" + tL_messages_stickerSet5.set.f20299id;
                    int i22 = exVar.f26621x;
                    exVar.f26621x = i22 + 1;
                    wx0 wx0Var2 = (wx0) exVar.f26611n.get(str2);
                    if (wx0Var2 != null) {
                        exVar.g(str2, wx0Var2, i22);
                        z12 = z17;
                    } else {
                        wx0Var2 = new wx0(exVar.getContext(), 0);
                        wx0Var2.setFocusable(z17);
                        z12 = z17;
                        wx0Var2.setOnClickListener(new zm0(exVar, 1));
                        wx0Var2.setExpanded(exVar.f26604f0);
                        wx0Var2.a(exVar.f26607i0);
                        sa1Var.addView(wx0Var2, i22);
                    }
                    wx0Var2.e.setLayerNum(exVar.f26595a);
                    wx0Var2.d = false;
                    wx0Var2.setTag(closestPhotoSizeWithSize);
                    wx0Var2.setTag(R.id.index_tag, Integer.valueOf(i22));
                    wx0Var2.setTag(R.id.parent_tag, tL_messages_stickerSet5);
                    wx0Var2.setTag(R.id.object_tag, document);
                    if (i22 == exVar.f26622y) {
                        z13 = z12;
                    } else {
                        z13 = false;
                    }
                    wx0Var2.setSelected(z13);
                    exVar.h.put(str2, wx0Var2);
                    wx0Var2.setContentDescription(tL_messages_stickerSet5.set.title + ", " + LocaleController.getString(R.string.AccDescrStickerSet));
                }
                i18++;
                z17 = z12;
                d6Var = null;
            }
            exVar.h();
            exVar.q();
            if (currentPosition != 0) {
                exVar.k(currentPosition, currentPosition);
            }
            o();
        }
    }

    public final void Y() {
        boolean z10;
        int i10;
        fx fxVar = this.C0;
        ex exVar = this.B0;
        if (exVar != null && fxVar == null && this.f30800t1 != null) {
            exVar.setTranslationY(this.f30800t1.p() * (-AndroidUtilities.dp(50.0f)));
        }
        if (fxVar == null) {
            return;
        }
        if (getVisibility() == 0 && this.K0 && this.f30800t1.p() != 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        fxVar.setVisibility(i10);
        if (z10) {
            Rect rect = this.f30815x2;
            rect.setEmpty();
            this.h.getChildVisibleRect(this.f30813x0, rect, null);
            float p5 = this.f30800t1.p() * AndroidUtilities.dp(50.0f);
            int i11 = rect.left;
            if (i11 != 0 || p5 != 0.0f) {
                this.X1 = false;
            }
            fxVar.setTranslationX(i11);
            float translationY = (((getTranslationY() + getTop()) - fxVar.getTop()) - exVar.getExpandedOffset()) - p5;
            if (fxVar.getTranslationY() != translationY) {
                fxVar.setTranslationY(translationY);
                fxVar.invalidate();
            }
        }
        if (this.X1 && z10 && this.P0) {
            exVar.i(this.W1, true);
            return;
        }
        this.X1 = false;
        exVar.i(this.W1, false);
    }

    public final void Z() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        org.telegram.ui.Cells.r3 r3Var;
        LongSparseArray longSparseArray = this.f30821z1;
        LongSparseArray longSparseArray2 = this.f30818y1;
        int i10 = this.f30747c1;
        ax axVar = this.D0;
        if (axVar != null) {
            try {
                int childCount = axVar.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = axVar.getChildAt(i11);
                    if ((childAt instanceof org.telegram.ui.Cells.r3) && ((sl0) axVar.T(childAt)) != null) {
                        org.telegram.ui.Cells.r3 r3Var2 = (org.telegram.ui.Cells.r3) childAt;
                        ArrayList<Long> unreadStickerSets = MediaDataController.getInstance(i10).getUnreadStickerSets();
                        TLRPC.StickerSetCovered stickerSet = r3Var2.getStickerSet();
                        if (unreadStickerSets != null && unreadStickerSets.contains(Long.valueOf(stickerSet.set.f20299id))) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        int i12 = 0;
                        while (true) {
                            TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.f30814x1;
                            if (i12 < stickerSetCoveredArr.length) {
                                TLRPC.StickerSetCovered stickerSetCovered = stickerSetCoveredArr[i12];
                                if (stickerSetCovered != null) {
                                    r3Var = r3Var2;
                                    if (stickerSetCovered.set.f20299id == stickerSet.set.f20299id) {
                                        r3Var2 = r3Var;
                                        z11 = true;
                                        break;
                                    }
                                } else {
                                    r3Var = r3Var2;
                                }
                                i12++;
                                r3Var2 = r3Var;
                            } else {
                                z11 = false;
                                break;
                            }
                        }
                        r3Var2.c(stickerSet, z10, true, 0, 0, z11);
                        if (z10) {
                            MediaDataController.getInstance(i10).markFeaturedStickersByIdAsRead(false, stickerSet.set.f20299id);
                        }
                        if (longSparseArray2.indexOfKey(stickerSet.set.f20299id) >= 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (longSparseArray.indexOfKey(stickerSet.set.f20299id) >= 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z12 || z13) {
                            if (z12 && r3Var2.f22938r) {
                                longSparseArray2.remove(stickerSet.set.f20299id);
                                z12 = false;
                            } else if (z13 && !r3Var2.f22938r) {
                                longSparseArray.remove(stickerSet.set.f20299id);
                            }
                        }
                        if (!z11 && z12) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        r3Var2.b(z14, true);
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    @Override
    public final void a(int i10) {
        setBottomInset(i10);
    }

    @Override
    public final void b(float f7) {
        this.f30790q2 = f7;
        R();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        Utilities.Callback callback;
        TLRPC.StickerSet stickerSet;
        int i12 = NotificationCenter.stickersDidLoad;
        ay ayVar = this.R;
        lw lwVar = this.L2;
        if (i10 == i12) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (this.f30817y0 != null) {
                    X(((Boolean) objArr[1]).booleanValue());
                    Z();
                    D();
                    o();
                }
            } else if (((Integer) objArr[0]).intValue() == 5) {
                if (((Boolean) objArr[1]).booleanValue()) {
                    AndroidUtilities.cancelRunOnUIThread(lwVar);
                    AndroidUtilities.runOnUIThread(lwVar, 100L);
                    return;
                }
                ayVar.F(false);
            }
        } else if (i10 == NotificationCenter.groupPackUpdated) {
            long longValue = ((Long) objArr[0]).longValue();
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            TLRPC.ChatFull chatFull = this.J1;
            if (chatFull != null && chatFull.f20273id == longValue && booleanValue) {
                ayVar.F(true);
            }
        } else if (i10 == NotificationCenter.recentDocumentsDidLoad) {
            boolean booleanValue2 = ((Boolean) objArr[0]).booleanValue();
            int intValue = ((Integer) objArr[1]).intValue();
            if (booleanValue2 || intValue == 0 || intValue == 2) {
                k(booleanValue2);
            }
        } else if (i10 == NotificationCenter.featuredStickersDidLoad) {
            Z();
            xd0 xd0Var = this.f30808w;
            if (xd0Var != null) {
                int childCount = xd0Var.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    xd0Var.getChildAt(i13).invalidate();
                }
            }
            X(false);
        } else if (i10 == NotificationCenter.featuredEmojiDidLoad) {
            if (ayVar != null) {
                ayVar.F(false);
            }
        } else {
            int i14 = NotificationCenter.groupStickersDidLoad;
            ty tyVar = this.S;
            if (i10 == i14) {
                Long l4 = (Long) objArr[0];
                long longValue2 = l4.longValue();
                if (objArr.length > 1) {
                    tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) objArr[1];
                } else {
                    tL_messages_stickerSet = null;
                }
                if (tL_messages_stickerSet != null) {
                    oz ozVar = this.f30820z0;
                    if (ozVar != null && ozVar.d == longValue2 && ozVar.f29109f.size() < tL_messages_stickerSet.documents.size()) {
                        ozVar.f29109f = tL_messages_stickerSet.documents;
                        ozVar.l();
                    }
                    if (tyVar != null && tyVar.d == longValue2 && tyVar.f30731f.size() < tL_messages_stickerSet.documents.size()) {
                        tyVar.f30731f = tL_messages_stickerSet.documents;
                        tyVar.l();
                    }
                }
                TLRPC.ChatFull chatFull2 = this.J1;
                if (chatFull2 != null && (stickerSet = chatFull2.stickerset) != null && stickerSet.f20299id == longValue2) {
                    X(false);
                }
                HashMap hashMap = this.f30793r1;
                if (hashMap.containsKey(l4) && objArr.length >= 2 && ((Utilities.Callback) hashMap.get(l4)) != null && tL_messages_stickerSet != null && (callback = (Utilities.Callback) hashMap.remove(l4)) != null) {
                    callback.run(tL_messages_stickerSet);
                }
                AndroidUtilities.cancelRunOnUIThread(lwVar);
                AndroidUtilities.runOnUIThread(lwVar, 100L);
                return;
            }
            int i15 = NotificationCenter.emojiLoaded;
            ey eyVar = this.P;
            if (i10 == i15) {
                ax axVar = this.D0;
                if (axVar != null) {
                    int childCount2 = axVar.getChildCount();
                    for (int i16 = 0; i16 < childCount2; i16++) {
                        View childAt = axVar.getChildAt(i16);
                        if ((childAt instanceof org.telegram.ui.Cells.n8) || (childAt instanceof org.telegram.ui.Cells.e8)) {
                            childAt.invalidate();
                        }
                    }
                }
                if (eyVar != null) {
                    eyVar.invalidate();
                    int childCount3 = eyVar.getChildCount();
                    for (int i17 = 0; i17 < childCount3; i17++) {
                        View childAt2 = eyVar.getChildAt(i17);
                        if (childAt2 instanceof cz) {
                            childAt2.invalidate();
                        }
                    }
                }
                ev evVar = this.B1;
                if (evVar != null) {
                    evVar.f26003c.invalidate();
                }
                yx yxVar = this.f30785p0;
                if (yxVar != null) {
                    sa1 sa1Var = yxVar.e;
                    int childCount4 = sa1Var.getChildCount();
                    for (int i18 = 0; i18 < childCount4; i18++) {
                        sa1Var.getChildAt(i18).invalidate();
                    }
                }
            } else if (i10 == NotificationCenter.newEmojiSuggestionsAvailable) {
                if (eyVar != null && this.f30749d0) {
                    if ((this.V.f26695c.f31328k == 2 || eyVar.getAdapter() == tyVar) && !TextUtils.isEmpty(tyVar.v)) {
                        tyVar.F(tyVar.v, true);
                    }
                }
            } else if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                if (ayVar != null) {
                    ayVar.F(false);
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
            if (this.f30778n.getVisibility() != 8 && !this.f30802u0 && this.f30809w0) {
                canvas.drawColor(i0.a.o(-1, 25));
            }
            boolean drawChild = super.drawChild(canvas, view, j10);
            float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(this.f30787p2);
            if (navigationBarThirdButtonsFactor > 0.0f) {
                int m12 = org.telegram.ui.ActionBar.h6.m1(navigationBarThirdButtonsFactor, A(org.telegram.ui.ActionBar.h6.He));
                int i10 = this.B2;
                GradientDrawable gradientDrawable = this.A2;
                if (i10 != m12) {
                    gradientDrawable.setColors(new int[]{m12, org.telegram.ui.ActionBar.h6.m1(0.66f, m12), i0.a.o(m12, 0)});
                    this.B2 = m12;
                }
                gradientDrawable.setBounds(0, getMeasuredHeight() - this.f30787p2, getMeasuredWidth(), getMeasuredHeight());
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

    public ArrayList<fy> getEmojipacks() {
        ArrayList<fy> arrayList = new ArrayList<>();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f30789q1;
            if (i10 < arrayList2.size()) {
                fy fyVar = (fy) arrayList2.get(i10);
                boolean z10 = fyVar.f26407g;
                ArrayList arrayList3 = this.f30786p1;
                if ((!z10 && (fyVar.f26406f || arrayList3.contains(Long.valueOf(fyVar.f26404b.f20299id)))) || (fyVar.f26407g && !fyVar.f26406f && !arrayList3.contains(Long.valueOf(fyVar.f26404b.f20299id)))) {
                    arrayList.add(fyVar);
                }
                i10++;
            } else {
                return arrayList;
            }
        }
    }

    public ArrayList<String> getRecentEmoji() {
        if (this.f30748c2) {
            return Emoji.recentEmoji;
        }
        if (this.C2 == null) {
            this.C2 = new ArrayList();
        }
        if (Emoji.recentEmoji.size() != this.D2) {
            this.C2.clear();
            int i10 = 0;
            while (true) {
                ArrayList<String> arrayList = Emoji.recentEmoji;
                if (i10 >= arrayList.size()) {
                    break;
                }
                if (!arrayList.get(i10).startsWith("animated_")) {
                    this.C2.add(arrayList.get(i10));
                }
                i10++;
            }
            this.D2 = this.C2.size();
        }
        return this.C2;
    }

    public float getStickersExpandOffset() {
        ex exVar = this.B0;
        if (exVar == null) {
            return 0.0f;
        }
        return exVar.getExpandedOffset();
    }

    public final void h(String str) {
        if (str != null) {
            if (str.startsWith("animated_") || Emoji.isValidEmoji(str)) {
                Emoji.addRecentEmoji(str);
                int i10 = 0;
                if (getVisibility() != 0 || this.h.getCurrentItem() != 0) {
                    Emoji.sortEmoji();
                    this.R.F(false);
                }
                Emoji.saveRecentEmoji();
                if (!this.f30748c2) {
                    ArrayList arrayList = this.C2;
                    if (arrayList == null) {
                        this.C2 = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    while (true) {
                        ArrayList<String> arrayList2 = Emoji.recentEmoji;
                        if (i10 < arrayList2.size()) {
                            if (!arrayList2.get(i10).startsWith("animated_")) {
                                this.C2.add(arrayList2.get(i10));
                            }
                            i10++;
                        } else {
                            this.D2 = this.C2.size();
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
        ox oxVar = new ox(getContext(), i11);
        oxVar.f46051a = !z10 ? 1 : 0;
        x(i10).w0(oxVar);
    }

    public final void k(boolean z10) {
        if (z10) {
            W();
            return;
        }
        int size = this.f30769j1.size();
        int size2 = this.f30772k1.size();
        int i10 = this.f30747c1;
        this.f30769j1 = MediaDataController.getInstance(i10).getRecentStickers(0, true);
        this.f30772k1 = MediaDataController.getInstance(i10).getRecentStickers(2);
        if (UserConfig.getInstance(i10).isPremium()) {
            this.l1 = MediaDataController.getInstance(i10).getRecentStickers(7);
        } else {
            this.l1 = new ArrayList();
        }
        for (int i11 = 0; i11 < this.f30772k1.size(); i11++) {
            TLRPC.Document document = (TLRPC.Document) this.f30772k1.get(i11);
            int i12 = 0;
            while (true) {
                if (i12 < this.f30769j1.size()) {
                    TLRPC.Document document2 = (TLRPC.Document) this.f30769j1.get(i12);
                    if (document2.dc_id == document.dc_id && document2.f20278id == document.f20278id) {
                        this.f30769j1.remove(i12);
                        break;
                    }
                    i12++;
                }
            }
        }
        if (MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            int i13 = 0;
            while (i13 < this.f30772k1.size()) {
                if (MessageObject.isPremiumSticker((TLRPC.Document) this.f30772k1.get(i13))) {
                    this.f30772k1.remove(i13);
                    i13--;
                }
                i13++;
            }
            int i14 = 0;
            while (i14 < this.f30769j1.size()) {
                if (MessageObject.isPremiumSticker((TLRPC.Document) this.f30769j1.get(i14))) {
                    this.f30769j1.remove(i14);
                    i14--;
                }
                i14++;
            }
        }
        if (size != this.f30769j1.size() || size2 != this.f30772k1.size()) {
            X(false);
        }
        kz kzVar = this.f30817y0;
        if (kzVar != null) {
            kzVar.l();
        }
        o();
    }

    public final void l(boolean z10) {
        int i10;
        boolean z11;
        uy uyVar = this.f30800t1;
        ne.b bVar = this.f30741b;
        ey eyVar = this.P;
        rw rwVar = this.V;
        if (uyVar != null && uyVar.z()) {
            s4.b1 K = eyVar.K(0);
            if (K == null) {
                gz.a(rwVar, true, !z10);
            } else {
                if (K.f45910a.getTop() < eyVar.getPaddingTop()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                gz.a(rwVar, z11, !z10);
            }
            N(false, !z10);
            rwVar.setTranslationY(bVar.e * AndroidUtilities.dp(15.0f));
        } else if (rwVar != null && eyVar != null) {
            s4.b1 K2 = eyVar.K(0);
            if (K2 != null) {
                i10 = K2.f45910a.getTop();
            } else {
                i10 = -this.f30743b1;
            }
            rwVar.setTranslationY((bVar.e * AndroidUtilities.dp(15.0f)) + i10);
            rwVar.f26693a.a(false, !z10);
            m(Math.round(this.I.getTranslationY()));
        }
    }

    public final void m(int i10) {
        ObjectAnimator objectAnimator = this.R0[1];
        if (objectAnimator != null && objectAnimator.isRunning()) {
            return;
        }
        boolean z10 = false;
        s4.b1 K = this.P.K(0);
        int dp = AndroidUtilities.dp(38.0f) + i10;
        if (dp > 0 && (K == null || K.f45910a.getBottom() < dp)) {
            z10 = true;
        }
        N(z10, !this.K1);
    }

    public final void n(int i10, View view) {
        ey eyVar;
        s4.b1 K;
        int i11;
        vx vxVar = this.I;
        int[] iArr = this.Q0;
        if (view == null) {
            iArr[1] = 0;
            vxVar.setTranslationY(0);
        } else if (view.getVisibility() == 0 && !this.f30756f0) {
            uy uyVar = this.f30800t1;
            if (uyVar == null || !uyVar.z()) {
                if (i10 > 0 && (eyVar = this.P) != null && eyVar.getVisibility() == 0 && (K = eyVar.K(0)) != null) {
                    int top = K.f45910a.getTop();
                    if (this.f30749d0) {
                        i11 = this.f30743b1;
                    } else {
                        i11 = 0;
                    }
                    if (top + i11 >= eyVar.getPaddingTop()) {
                        return;
                    }
                }
                int i12 = iArr[1] - i10;
                iArr[1] = i12;
                if (i12 > 0) {
                    iArr[1] = 0;
                } else if (i12 < (-AndroidUtilities.dp(108.0f))) {
                    iArr[1] = -AndroidUtilities.dp(108.0f);
                }
                vxVar.setTranslationY(Math.max(-AndroidUtilities.dp(36.0f), iArr[1]));
            }
        }
    }

    public final void o() {
        int L0;
        ex exVar = this.B0;
        if (exVar != null && (L0 = this.E0.L0()) != -1) {
            int i10 = this.G1;
            if (i10 <= 0 && (i10 = this.F1) <= 0) {
                i10 = this.E1;
            }
            exVar.k(this.f30817y0.F(L0), i10);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.ObserversGroup observersGroup = this.I2;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.I2 = null;
        }
        NotificationCenter.ObserversGroup add = NotificationCenter.getInstance(this.f30747c1).createWeakObserversGroup(this).addGlobal(NotificationCenter.emojiLoaded).add(NotificationCenter.newEmojiSuggestionsAvailable).add(NotificationCenter.groupPackUpdated);
        this.I2 = add;
        if (this.f30817y0 != null) {
            add.add(NotificationCenter.stickersDidLoad).add(NotificationCenter.recentDocumentsDidLoad).add(NotificationCenter.featuredStickersDidLoad).add(NotificationCenter.groupStickersDidLoad).add(NotificationCenter.currentUserPremiumStatusChanged);
            AndroidUtilities.runOnUIThread(new lw(this, 0));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ev evVar = this.B1;
        if (evVar != null && evVar.isShowing()) {
            evVar.dismiss();
        }
        org.telegram.ui.gt q6 = org.telegram.ui.gt.q();
        if (q6.f37303l == this.f30761g2) {
            q6.W = null;
            q6.f37291a0 = null;
            q6.Y = null;
            q6.f37303l = null;
            q6.f37295c0 = null;
            q6.u();
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        if (this.O1 != i14) {
            this.O1 = i14;
            D();
        }
        super.onLayout(z10, i10, i11, i12, i13);
        R();
        Y();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.K1 = true;
        boolean z10 = AndroidUtilities.isInMultiwindow;
        View view = this.v;
        boolean z11 = this.f30749d0;
        if (!z10 && !this.N1) {
            if (this.L1 != 0) {
                if (!this.H2) {
                    setOutlineProvider(null);
                    setClipToOutline(false);
                    setElevation(0.0f);
                }
                if (this.f30802u0) {
                    int i12 = org.telegram.ui.ActionBar.h6.He;
                    setBackgroundColor(A(i12));
                    if (z11) {
                        view.setBackgroundColor(A(i12));
                    }
                }
                this.L1 = 0;
            }
        } else if (this.L1 != 1) {
            if (!this.H2) {
                setOutlineProvider(this.M1);
                setClipToOutline(true);
                setElevation(AndroidUtilities.dp(2.0f));
            }
            setBackgroundResource(R.drawable.smiles_popup);
            Drawable background = getBackground();
            int i13 = org.telegram.ui.ActionBar.h6.He;
            background.setColorFilter(new PorterDuffColorFilter(A(i13), PorterDuff.Mode.MULTIPLY));
            if (z11 && this.f30802u0) {
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
                this.B0.k(this.f30817y0.F(L02), i12);
            }
        } else if (i10 == 2) {
            s4.g0 adapter = this.f30762h0.getAdapter();
            yy yyVar = this.f30779n0;
            if (adapter == yyVar && yyVar.I >= 0 && this.f30796s0 >= 0 && this.f30792r0 >= 0 && (L0 = this.f30765i0.L0()) != -1) {
                if (L0 >= yyVar.I) {
                    i11 = this.f30796s0;
                } else {
                    i11 = this.f30792r0;
                }
                this.f30785p0.k(i11, 0);
            }
        }
    }

    public final void q(boolean z10) {
        int i10;
        uy uyVar = this.f30800t1;
        ne.b bVar = this.f30738a;
        ax axVar = this.D0;
        boolean z11 = false;
        dx dxVar = this.G0;
        if (uyVar != null && uyVar.z()) {
            s4.b1 K = axVar.K(0);
            if (K == null) {
                gz.a(dxVar, true, !z10);
            } else {
                if (K.f45910a.getTop() < axVar.getPaddingTop()) {
                    z11 = true;
                }
                gz.a(dxVar, z11, !z10);
            }
            dxVar.setTranslationY(bVar.e * AndroidUtilities.dp(15.0f));
        } else if (dxVar != null && axVar != null) {
            s4.b1 K2 = axVar.K(0);
            if (K2 != null) {
                i10 = K2.f45910a.getTop();
            } else {
                i10 = -this.f30743b1;
            }
            dxVar.setTranslationY((bVar.e * AndroidUtilities.dp(15.0f)) + i10);
            dxVar.f26693a.a(false, !z10);
        }
    }

    public final void r() {
        Emoji.clearRecentEmoji();
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
        gz gzVar;
        s4.b0 b0Var;
        View view;
        View view2;
        int i10;
        int i11;
        TLRPC.TL_messages_stickerSet stickerSetById;
        kz kzVar;
        int E;
        AnimatorSet animatorSet = this.M0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.M0 = null;
        }
        int currentItem = this.h.getCurrentItem();
        int i12 = 2;
        if (currentItem == 2 && j10 != -1 && (stickerSetById = MediaDataController.getInstance(this.f30747c1).getStickerSetById(j10)) != null && (E = (kzVar = this.f30817y0).E(stickerSetById)) >= 0 && E < kzVar.h()) {
            H(E, AndroidUtilities.dp(48.0f));
        }
        int i13 = 0;
        yy yyVar = this.f30768j0;
        if (yyVar != null) {
            yyVar.K = false;
        }
        int i14 = 0;
        while (i14 < 3) {
            View view3 = this.D0;
            View view4 = this.f30762h0;
            xw xwVar = this.f30782o0;
            View view5 = this.P;
            if (i14 == 0) {
                gzVar = this.V;
                b0Var = this.Q;
                view = this.I;
                view2 = view5;
            } else if (i14 == 1) {
                b0Var = this.f30765i0;
                view = this.f30785p0;
                view2 = view4;
                gzVar = xwVar;
            } else {
                gzVar = this.G0;
                b0Var = this.E0;
                view = this.B0;
                view2 = view3;
            }
            if (gzVar == null) {
                i11 = i13;
                i10 = i12;
            } else {
                int i15 = i13;
                fz fzVar = gzVar.f26698r;
                int i16 = i12;
                gzVar.d.setText("");
                if (fzVar != null) {
                    fzVar.G1(null);
                    fzVar.E1();
                }
                int i17 = this.f30743b1;
                if (i14 == currentItem && z10) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.M0 = animatorSet2;
                    Property property = View.TRANSLATION_Y;
                    if (view != null && i14 != 1) {
                        float[] fArr = new float[1];
                        fArr[i15] = 0.0f;
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
                        float[] fArr2 = new float[1];
                        fArr2[i15] = AndroidUtilities.dp(36.0f);
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, property, fArr2);
                        float[] fArr3 = new float[1];
                        fArr3[i15] = AndroidUtilities.dp(36.0f);
                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(gzVar, property, fArr3);
                        Animator[] animatorArr = new Animator[3];
                        animatorArr[i15] = ofFloat;
                        animatorArr[1] = ofFloat2;
                        animatorArr[i16] = ofFloat3;
                        animatorSet2.playTogether(animatorArr);
                    } else {
                        float[] fArr4 = new float[1];
                        fArr4[i15] = AndroidUtilities.dp(36.0f) - i17;
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view2, property, fArr4);
                        Animator[] animatorArr2 = new Animator[1];
                        animatorArr2[i15] = ofFloat4;
                        animatorSet2.playTogether(animatorArr2);
                    }
                    this.M0.setDuration(200L);
                    this.M0.setInterpolator(bs.h);
                    this.M0.addListener(new ci.o3(this, b0Var, view2, 5));
                    this.M0.start();
                    i11 = i15;
                    i10 = i16;
                } else {
                    if (gzVar != xwVar) {
                        gzVar.setTranslationY(AndroidUtilities.dp(36.0f) - i17);
                    }
                    i10 = i16;
                    if (view != null && i14 != i10) {
                        view.setTranslationY(0.0f);
                    }
                    if (view2 == view3) {
                        i11 = i15;
                        view2.setPadding(i11, AndroidUtilities.dp(36.0f), i11, AndroidUtilities.dp(44.0f) + this.f30787p2);
                    } else {
                        i11 = i15;
                        if (view2 == view4) {
                            view2.setPadding(i11, AndroidUtilities.dp(40.0f), i11, AndroidUtilities.dp(44.0f) + this.f30787p2);
                        } else {
                            if (view2 == view5) {
                                view2.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f) + this.f30787p2);
                            }
                            i11 = 0;
                        }
                    }
                    b0Var.h1(i11, i11);
                }
            }
            i14++;
            i12 = i10;
            i13 = i11;
        }
        int i18 = i13;
        if (!z10) {
            this.f30800t1.i(i18);
        }
    }

    public void setBlurredBackgroundDrawableFactory(bh.b bVar) {
        org.telegram.ui.ActionBar.d6 d6Var = this.Z1;
        View view = this.f30812x;
        if (view != null) {
            dh.d c10 = bVar.c(view, null, false);
            c10.o(fh.c.d(d6Var));
            c10.q(AndroidUtilities.dp(18.0f));
            c10.p(AndroidUtilities.dp(6.0f));
            view.setBackground(c10);
        }
        View view2 = this.E;
        if (view2 != null) {
            dh.d c11 = bVar.c(view2, null, false);
            c11.o(fh.c.d(d6Var));
            c11.q(AndroidUtilities.dp(18.0f));
            c11.p(AndroidUtilities.dp(6.0f));
            view2.setBackground(c11);
        }
        View view3 = this.f30808w;
        if (view3 != null) {
            dh.d c12 = bVar.c(view3, null, false);
            c12.o(fh.c.d(d6Var));
            c12.q(AndroidUtilities.dp(18.0f));
            c12.p(AndroidUtilities.dp(6.0f));
            view3.setBackground(c12);
        }
        View view4 = this.f30816y;
        if (view4 != null) {
            dh.d c13 = bVar.c(view4, null, false);
            c13.o(fh.c.d(d6Var));
            c13.q(AndroidUtilities.dp(18.0f));
            c13.p(AndroidUtilities.dp(6.0f));
            view4.setBackground(c13);
        }
    }

    public void setBottomInset(int i10) {
        if (this.f30787p2 != i10) {
            this.f30787p2 = i10;
            j(i10, this.K);
            j(i10, this.M);
            j(AndroidUtilities.dp(44.0f) + i10, this.P);
            j(AndroidUtilities.dp(44.0f) + i10, this.D0);
            j(AndroidUtilities.dp(44.0f) + i10, this.f30762h0);
            FrameLayout frameLayout = this.f30795s;
            if (frameLayout != null) {
                frameLayout.setTranslationY(-i10);
            }
            R();
            invalidate();
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        this.J1 = chatFull;
        X(false);
    }

    public void setDelegate(uy uyVar) {
        this.f30800t1 = uyVar;
    }

    public void setDragListener(xx xxVar) {
        this.O0 = xxVar;
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        dx dxVar = this.G0;
        if (dxVar != null) {
            dxVar.d.setEnabled(z10);
        }
        xw xwVar = this.f30782o0;
        if (xwVar != null) {
            xwVar.d.setEnabled(z10);
        }
        rw rwVar = this.V;
        if (rwVar != null) {
            rwVar.d.setEnabled(z10);
        }
    }

    public void setForseMultiwindowLayout(boolean z10) {
        this.N1 = z10;
    }

    public void setShouldDrawBackground(boolean z10) {
        if (this.f30802u0 != z10) {
            this.f30802u0 = z10;
            S();
        }
    }

    public void setShowing(boolean z10) {
        this.P0 = z10;
        Y();
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        Y();
        R();
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
                Emoji.sortEmoji();
                this.R.F(false);
                int i11 = this.f30747c1;
                NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.stickersDidLoad);
                if (this.f30817y0 != null) {
                    NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.recentDocumentsDidLoad);
                    X(false);
                    D();
                }
                k(true);
                k(false);
                MediaDataController.getInstance(i11).loadRecents(0, true, true, false);
                MediaDataController.getInstance(i11).loadRecents(0, false, true, false);
                MediaDataController.getInstance(i11).loadRecents(2, false, true, false);
            }
            hg.f1 f1Var = this.T0;
            if (f1Var != null) {
                f1Var.a();
            }
        }
    }

    public final void t(boolean z10) {
        s(-1L, z10);
    }

    @Override
    public final void u(int i10, float f7, float f10, ne.e eVar) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = 4;
        if (i10 == 0) {
            q(false);
            float f11 = 1.0f - this.f30738a.e;
            dx dxVar = this.G0;
            dxVar.setAlpha(f11);
            if (f11 > 0.0f) {
                i13 = 0;
            } else {
                i13 = 4;
            }
            dxVar.setVisibility(i13);
            float f12 = 1.0f - f11;
            oh.d dVar = this.H0;
            dVar.setAlpha(f12);
            dVar.setTranslationY((-AndroidUtilities.dp(15.0f)) * f11);
            int i16 = (f12 > 0.0f ? 1 : (f12 == 0.0f ? 0 : -1));
            if (i16 > 0) {
                i14 = 0;
            } else {
                i14 = 4;
            }
            dVar.setVisibility(i14);
            ah.v vVar = this.M;
            vVar.setAlpha(f12);
            vVar.setTranslationY(AndroidUtilities.dp(30.0f) * f11);
            if (i16 > 0) {
                i15 = 0;
            }
            vVar.setVisibility(i15);
            R();
            this.f30813x0.invalidate();
        } else if (i10 == 1) {
            l(false);
            float f13 = 1.0f - this.f30741b.e;
            rw rwVar = this.V;
            rwVar.setAlpha(f13);
            if (f13 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            rwVar.setVisibility(i11);
            float f14 = 1.0f - f13;
            oh.d dVar2 = this.U;
            dVar2.setAlpha(f14);
            dVar2.setTranslationY((-AndroidUtilities.dp(15.0f)) * f13);
            int i17 = (f14 > 0.0f ? 1 : (f14 == 0.0f ? 0 : -1));
            if (i17 > 0) {
                i12 = 0;
            } else {
                i12 = 4;
            }
            dVar2.setVisibility(i12);
            ah.v vVar2 = this.K;
            vVar2.setAlpha(f14);
            vVar2.setTranslationY(AndroidUtilities.dp(30.0f) * f13);
            if (i17 > 0) {
                i15 = 0;
            }
            vVar2.setVisibility(i15);
            R();
            this.J.invalidate();
        }
    }

    public final void v(boolean z10) {
        kz kzVar;
        boolean z11 = this.N2;
        this.N2 = z10;
        if (z11 && !z10) {
            int i10 = this.A1;
            if (i10 == 0) {
                ay ayVar = this.R;
                if (ayVar != null) {
                    ayVar.F(false);
                }
            } else if (i10 == 1) {
                yy yyVar = this.f30779n0;
                if (yyVar != null) {
                    yyVar.l();
                }
            } else if (i10 == 2 && (kzVar = this.f30817y0) != null) {
                kzVar.l();
            }
        }
    }

    public final int w(float f7) {
        return i0.a.o(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Wk, this.Z1), (int) (f7 * 255.0f));
    }

    public final s4.s x(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return this.f30765i0;
                }
                throw new IllegalArgumentException(i2.d.j(i10, "Unexpected argument: "));
            }
            return this.Q;
        }
        return this.E0;
    }

    public final im0 y(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return this.f30762h0;
                }
                throw new IllegalArgumentException(i2.d.j(i10, "Unexpected argument: "));
            }
            return this.P;
        }
        return this.D0;
    }

    public final HorizontalScrollView z(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return this.f30785p0;
                }
                throw new IllegalArgumentException(i2.d.j(i10, "Unexpected argument: "));
            }
            return this.I;
        }
        return this.B0;
    }

    @Override
    public final void E(float f7, int i10) {
    }
}
