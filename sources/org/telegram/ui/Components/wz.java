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
import org.telegram.ui.ic1;
public class wz extends FrameLayout implements ne.d, NotificationCenter.NotificationCenterDelegate, qh.a {
    public static final int O2 = 0;
    public final tw A0;
    public int A1;
    public final GradientDrawable A2;
    public final ix B0;
    public final jv B1;
    public int B2;
    public final jx C0;
    public final int C1;
    public ArrayList C2;
    public final ex D0;
    public final int[] D1;
    public int D2;
    public final ImageView E;
    public final fx E0;
    public int E1;
    public long E2;
    public AnimatorSet F;
    public uz F0;
    public int F1;
    public final ne.b F2;
    public AnimatorSet G;
    public final hx G0;
    public int G1;
    public ArrayList G2;
    public float H;
    public final oh.d H0;
    public int H1;
    public boolean H2;
    public final zx I;
    public boolean I0;
    public int I1;
    public NotificationCenter.ObserversGroup I2;
    public final ux J;
    public boolean J0;
    public TLRPC.ChatFull J1;
    public AnimatorSet J2;
    public final ah.v K;
    public boolean K0;
    public boolean K1;
    public e2.n0 K2;
    public final oh.b L;
    public final py L0;
    public int L1;
    public final pw L2;
    public final ah.v M;
    public AnimatorSet M0;
    public final bi.u5 M1;
    public boolean M2;
    public final oh.b N;
    public final bi.f4 N0;
    public boolean N1;
    public boolean N2;
    public final View O;
    public cy O0;
    public int O1;
    public final iy P;
    public boolean P0;
    public boolean P1;
    public final vx Q;
    public final int[] Q0;
    public boolean Q1;
    public final fy R;
    public final ObjectAnimator[] R0;
    public ez R1;
    public final vy S;
    public boolean S0;
    public float S1;
    public uz T;
    public hg.f1 T0;
    public float T1;
    public final oh.d U;
    public boolean U0;
    public float U1;
    public final vw V;
    public boolean V0;
    public float V1;
    public AnimatorSet W;
    public String[] W0;
    public float W1;
    public final Drawable[] X0;
    public boolean X1;
    public final Drawable[] Y0;
    public final org.telegram.ui.ActionBar.m2 Y1;
    public final Drawable[] Z0;
    public final org.telegram.ui.ActionBar.c6 Z1;
    public final ne.b f30698a;
    public final pl0 f30699a0;
    public final String[] f30700a1;
    public final org.telegram.ui.ActionBar.s5 a2;
    public final ne.b f30701b;
    public final pl0 f30702b0;
    public final int f30703b1;
    public final org.telegram.ui.ActionBar.s5 f30704b2;
    public int f30705c;
    public boolean f30706c0;
    public final int f30707c1;
    public final boolean f30708c2;
    public final ArrayList d;
    public final boolean f30709d0;
    public final ArrayList f30710d1;
    public LongSparseArray f30711d2;
    public final ArrayList e;
    public boolean f30712e0;
    public int f30713e1;
    public PorterDuffColorFilter f30714e2;
    public boolean f30715f;
    public boolean f30716f0;
    public int f30717f1;
    public final org.telegram.ui.Cells.l7 f30718f2;
    public final xw f30719g0;
    public boolean f30720g1;
    public final px f30721g2;
    public final kx h;
    public final yw f30722h0;
    public TLRPC.TL_messages_stickerSet f30723h1;
    public boolean f30724h2;
    public final bz f30725i0;
    public ArrayList f30726i1;
    public final boolean f30727i2;
    public final az f30728j0;
    public ArrayList f30729j1;
    public final bh.f f30730j2;
    public final dz f30731k0;
    public ArrayList f30732k1;
    public final lh f30733k2;
    public final HashMap f30734l0;
    public ArrayList l1;
    public final bh.b f30735l2;
    public final tw m0;
    public final ArrayList f30736m1;
    public final mi.e f30737m2;
    public final FrameLayout f30738n;
    public final az f30739n0;
    public final ArrayList f30740n1;
    public boolean f30741n2;
    public final bx f30742o0;
    public final ArrayList f30743o1;
    public boolean f30744o2;
    public final dy f30745p0;
    public final ArrayList f30746p1;
    public int f30747p2;
    public boolean f30748q0;
    public final ArrayList f30749q1;
    public float f30750q2;
    public final FrameLayout f30751r;
    public int f30752r0;
    public final HashMap f30753r1;
    public View f30754r2;
    public final FrameLayout f30755s;
    public int f30756s0;
    public final Paint f30757s1;
    public int f30758s2;
    public int f30759t0;
    public wy f30760t1;
    public int f30761t2;
    public boolean f30762u0;
    public long f30763u1;
    public long f30764u2;
    public final View v;
    public boolean f30765v0;
    public boolean f30766v1;
    public boolean f30767v2;
    public final de0 f30768w;
    public boolean f30769w0;
    public boolean f30770w1;
    public boolean f30771w2;
    public final lx f30772x;
    public final cx f30773x0;
    public final TLRPC.StickerSetCovered[] f30774x1;
    public final Rect f30775x2;
    public final ImageView f30776y;
    public final mz f30777y0;
    public final LongSparseArray f30778y1;
    public final RectF f30779y2;
    public final rz f30780z0;
    public final LongSparseArray f30781z1;
    public final ArrayList f30782z2;

    public wz(org.telegram.ui.ActionBar.m2 m2Var, boolean z10, boolean z11, boolean z12, Context context, boolean z13, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z14, final org.telegram.ui.ActionBar.c6 c6Var, boolean z15, boolean z16) {
        super(context);
        int i10;
        int B;
        org.telegram.ui.ActionBar.s5 s5Var;
        int B2;
        int i11;
        pw pwVar;
        Context context2;
        ux uxVar;
        boolean z17;
        boolean z18;
        final org.telegram.ui.ActionBar.c6 c6Var2;
        gh.c cVar;
        int i12;
        mi.e eVar;
        boolean z19;
        Field field;
        int i13;
        es esVar = es.h;
        this.f30698a = new ne.b(0, this, esVar, 320L, false);
        this.f30701b = new ne.b(1, this, esVar, 320L, false);
        this.f30705c = 2;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.e = new ArrayList();
        this.f30706c0 = true;
        this.f30731k0 = new dz(this);
        this.f30734l0 = new HashMap();
        this.f30748q0 = true;
        this.f30752r0 = -2;
        this.f30756s0 = -2;
        this.f30759t0 = -2;
        this.f30762u0 = true;
        this.f30769w0 = true;
        this.I0 = true;
        this.Q0 = new int[3];
        this.R0 = new ObjectAnimator[3];
        int i14 = UserConfig.selectedAccount;
        this.f30707c1 = i14;
        this.f30710d1 = new ArrayList();
        this.f30726i1 = new ArrayList();
        this.f30729j1 = new ArrayList();
        this.f30732k1 = new ArrayList();
        this.l1 = new ArrayList();
        this.f30736m1 = new ArrayList();
        this.f30740n1 = new ArrayList();
        new ArrayList();
        this.f30743o1 = new ArrayList();
        this.f30746p1 = new ArrayList();
        this.f30749q1 = new ArrayList();
        this.f30753r1 = new HashMap();
        this.f30774x1 = new TLRPC.StickerSetCovered[10];
        this.f30778y1 = new LongSparseArray();
        this.f30781z1 = new LongSparseArray();
        this.D1 = new int[2];
        this.F1 = -2;
        this.G1 = -2;
        this.H1 = -2;
        this.I1 = -2;
        this.L1 = -1;
        this.f30718f2 = new org.telegram.ui.Cells.l7(this, 10);
        this.f30721g2 = new px(this);
        this.f30724h2 = true;
        mi.e eVar2 = new mi.e();
        this.f30737m2 = eVar2;
        this.f30750q2 = -1.0f;
        this.f30758s2 = -1;
        this.f30761t2 = -1;
        this.f30764u2 = -1L;
        this.f30767v2 = false;
        this.f30771w2 = true;
        this.f30775x2 = new Rect();
        RectF rectF = new RectF();
        this.f30779y2 = rectF;
        ArrayList arrayList2 = new ArrayList(1);
        this.f30782z2 = arrayList2;
        arrayList2.add(rectF);
        this.A2 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.F2 = new ne.b(0, new qw(this, 3), esVar, 380L, true);
        this.L2 = new pw(this, 1);
        this.M2 = false;
        this.f30762u0 = z14;
        this.Y1 = m2Var;
        this.f30708c2 = z10;
        this.Z1 = c6Var;
        this.f30727i2 = z16;
        gh.c cVar2 = new gh.c();
        cVar2.a(B(org.telegram.ui.ActionBar.g6.f19601d6));
        if (z15) {
            v(true);
        }
        i0.a.k(B(org.telegram.ui.ActionBar.g6.Wk), 30);
        int dp = AndroidUtilities.dp(50.0f);
        this.f30703b1 = dp;
        this.f30709d0 = z13;
        int i15 = R.drawable.smiles_tab_smiles;
        if (z16) {
            i10 = 0;
            B = w(0.4f);
        } else {
            i10 = 0;
            B = B(org.telegram.ui.ActionBar.g6.Re);
        }
        org.telegram.ui.ActionBar.s5 V = org.telegram.ui.ActionBar.g6.V(context, i15, B, z16 ? w(0.8f) : B(org.telegram.ui.ActionBar.g6.Oe));
        org.telegram.ui.ActionBar.s5 V2 = org.telegram.ui.ActionBar.g6.V(context, R.drawable.smiles_tab_gif, z16 ? w(0.4f) : B(org.telegram.ui.ActionBar.g6.Re), z16 ? w(0.8f) : B(org.telegram.ui.ActionBar.g6.Oe));
        org.telegram.ui.ActionBar.s5 V3 = org.telegram.ui.ActionBar.g6.V(context, R.drawable.smiles_tab_stickers, z16 ? w(0.4f) : B(org.telegram.ui.ActionBar.g6.Re), z16 ? w(0.8f) : B(org.telegram.ui.ActionBar.g6.Oe));
        Drawable[] drawableArr = new Drawable[3];
        drawableArr[i10] = V;
        drawableArr[1] = V2;
        drawableArr[2] = V3;
        this.X0 = drawableArr;
        org.telegram.ui.ActionBar.s5 V4 = org.telegram.ui.ActionBar.g6.V(context, R.drawable.msg_emoji_recent, z16 ? w(0.4f) : B(org.telegram.ui.ActionBar.g6.Me), z16 ? w(0.8f) : B(org.telegram.ui.ActionBar.g6.Oe));
        org.telegram.ui.ActionBar.s5 V5 = org.telegram.ui.ActionBar.g6.V(context, R.drawable.emoji_tabs_faves, z16 ? w(0.4f) : B(org.telegram.ui.ActionBar.g6.Me), z16 ? w(0.8f) : B(org.telegram.ui.ActionBar.g6.Oe));
        org.telegram.ui.ActionBar.s5 V6 = org.telegram.ui.ActionBar.g6.V(context, R.drawable.emoji_tabs_new3, z16 ? w(0.4f) : B(org.telegram.ui.ActionBar.g6.Me), z16 ? w(0.8f) : B(org.telegram.ui.ActionBar.g6.Oe));
        int i16 = R.drawable.emoji_tabs_new1;
        if (z16) {
            s5Var = V6;
            B2 = w(0.4f);
        } else {
            s5Var = V6;
            B2 = B(org.telegram.ui.ActionBar.g6.Me);
        }
        org.telegram.ui.ActionBar.s5 V7 = org.telegram.ui.ActionBar.g6.V(context, i16, B2, z16 ? w(0.8f) : B(org.telegram.ui.ActionBar.g6.Oe));
        this.a2 = V7;
        int i17 = R.drawable.emoji_tabs_new2;
        int i18 = org.telegram.ui.ActionBar.g6.Qe;
        org.telegram.ui.ActionBar.s5 V8 = org.telegram.ui.ActionBar.g6.V(context, i17, B(i18), B(i18));
        this.f30704b2 = V8;
        Drawable[] drawableArr2 = new Drawable[2];
        drawableArr2[i10] = V7;
        drawableArr2[1] = V8;
        LayerDrawable layerDrawable = new LayerDrawable(drawableArr2);
        Drawable[] drawableArr3 = new Drawable[4];
        drawableArr3[i10] = V4;
        drawableArr3[1] = V5;
        drawableArr3[2] = s5Var;
        drawableArr3[3] = layerDrawable;
        this.Y0 = drawableArr3;
        org.telegram.ui.ActionBar.s5 V9 = org.telegram.ui.ActionBar.g6.V(context, R.drawable.msg_emoji_recent, z16 ? w(0.4f) : B(org.telegram.ui.ActionBar.g6.Me), z16 ? w(0.8f) : B(org.telegram.ui.ActionBar.g6.Oe));
        org.telegram.ui.ActionBar.s5 V10 = org.telegram.ui.ActionBar.g6.V(context, R.drawable.stickers_gifs_trending, z16 ? w(0.4f) : B(org.telegram.ui.ActionBar.g6.Me), z16 ? w(0.8f) : B(org.telegram.ui.ActionBar.g6.Oe));
        Drawable[] drawableArr4 = new Drawable[2];
        drawableArr4[i10] = V9;
        drawableArr4[1] = V10;
        this.Z0 = drawableArr4;
        this.f30700a1 = new String[]{LocaleController.getString(R.string.Emoji1), LocaleController.getString(R.string.Emoji2), LocaleController.getString(R.string.Emoji3), LocaleController.getString(R.string.Emoji4), LocaleController.getString(R.string.Emoji5), LocaleController.getString(R.string.Emoji6), LocaleController.getString(R.string.Emoji7), LocaleController.getString(R.string.Emoji8)};
        this.J1 = chatFull;
        Paint paint = new Paint(1);
        this.f30757s1 = paint;
        paint.setColor(B(org.telegram.ui.ActionBar.g6.f19551af));
        bi.a2 a2Var = zf.j0.f50192a;
        this.M1 = new bi.u5(AndroidUtilities.dp(6.0f));
        ux uxVar2 = new ux(this, context);
        this.J = uxVar2;
        ?? obj = new Object();
        obj.f28930a = i10;
        obj.f28931b = uxVar2;
        arrayList.add(obj);
        if (z10) {
            MediaDataController.getInstance(i14).checkStickers(5);
            MediaDataController.getInstance(i14).checkFeaturedEmoji();
            this.f30714e2 = new PorterDuffColorFilter(B(org.telegram.ui.ActionBar.g6.Oh), PorterDuff.Mode.SRC_IN);
        }
        iy iyVar = new iy(this, context);
        this.P = iyVar;
        eVar2.a(iyVar);
        s4.k kVar = new s4.k();
        kVar.f44917c = 220L;
        kVar.e = 220L;
        kVar.f44918f = 160L;
        kVar.f44919g = 160L;
        kVar.f44920i = es.f24466g;
        iyVar.setItemAnimator(kVar);
        iyVar.setOnTouchListener(new View.OnTouchListener(this) {
            public final wz f28654b;

            {
                this.f28654b = this;
            }

            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                switch (r3) {
                    case 0:
                        org.telegram.ui.xt q6 = org.telegram.ui.xt.q();
                        wz wzVar = this.f28654b;
                        iy iyVar2 = wzVar.P;
                        wzVar.getMeasuredHeight();
                        return q6.s(motionEvent, iyVar2, null, wzVar.f30721g2, c6Var);
                    case 1:
                        org.telegram.ui.xt q10 = org.telegram.ui.xt.q();
                        wz wzVar2 = this.f28654b;
                        return q10.s(motionEvent, wzVar2.f30722h0, wzVar2.m0, wzVar2.f30721g2, c6Var);
                    default:
                        org.telegram.ui.xt q11 = org.telegram.ui.xt.q();
                        wz wzVar3 = this.f28654b;
                        ex exVar = wzVar3.D0;
                        wzVar3.getMeasuredHeight();
                        return q11.s(motionEvent, exVar, wzVar3.A0, wzVar3.f30721g2, c6Var);
                }
            }
        });
        iyVar.setOnItemLongClickListener(new qw(this, 1));
        iyVar.setInstantClick(true);
        vx vxVar = new vx(this);
        this.Q = vxVar;
        iyVar.setLayoutManager(vxVar);
        iyVar.setTopGlowOffset(AndroidUtilities.dp(38.0f));
        iyVar.setBottomGlowOffset(AndroidUtilities.dp(36.0f));
        iyVar.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f));
        int i19 = org.telegram.ui.ActionBar.g6.He;
        iyVar.setGlowColor(B(i19));
        iyVar.setItemSelectorColorProvider(new n2(14));
        iyVar.setClipToPadding(false);
        vxVar.O = new wx(this);
        fy fyVar = new fy(this);
        this.R = fyVar;
        iyVar.setAdapter(fyVar);
        iyVar.i(new di.q1(this, 3));
        this.S = new vy(this, context);
        uxVar2.addView(iyVar, w7.z5.d(-1.0f, -1));
        pl0 pl0Var = new pl0(iyVar, vxVar);
        this.f30702b0 = pl0Var;
        pl0Var.f28055i = new xx(this);
        iyVar.setOnScrollListener(new yx(this));
        if (m2Var != null) {
            i11 = -1;
            pwVar = new pw(this, 2);
            uxVar = uxVar2;
            z17 = z10;
            z18 = z16;
            c6Var2 = c6Var;
            cVar = cVar2;
            i12 = dp;
            eVar = eVar2;
            context2 = context;
        } else {
            i11 = -1;
            pwVar = null;
            context2 = context;
            uxVar = uxVar2;
            z17 = z10;
            z18 = z16;
            c6Var2 = c6Var;
            cVar = cVar2;
            i12 = dp;
            eVar = eVar2;
        }
        zx zxVar = new zx(this, context2, c6Var2, z17, pwVar, z18);
        this.I = zxVar;
        if (z13) {
            vw vwVar = new vw(this, context2);
            this.V = vwVar;
            uxVar.addView(vwVar, new FrameLayout.LayoutParams(i11, AndroidUtilities.getShadowHeight() + i12));
            vwVar.d.setOnFocusChangeListener(new ww(this));
            oh.d dVar = new oh.d(context2, c6Var2);
            this.U = dVar;
            dVar.setVisibility(8);
            dVar.setOnBackClickListener(new View.OnClickListener(this) {
                public final wz f28917b;

                {
                    this.f28917b = this;
                }

                @Override
                public final void onClick(View view) {
                    iz izVar;
                    switch (r2) {
                        case 0:
                            vy vyVar = this.f28917b.S;
                            qy qyVar = vyVar.f30340c;
                            int childCount = qyVar.getChildCount();
                            for (int i20 = 0; i20 < childCount; i20++) {
                                ((oh.c) qyVar.getChildAt(i20)).a(false, true);
                            }
                            vyVar.d = 0L;
                            vyVar.F.f30701b.a(false, true);
                            vyVar.l();
                            return;
                        case 1:
                            rz rzVar = this.f28917b.f30780z0;
                            qz qzVar = rzVar.f28664c;
                            int childCount2 = qzVar.getChildCount();
                            for (int i21 = 0; i21 < childCount2; i21++) {
                                ((oh.c) qzVar.getChildAt(i21)).a(false, true);
                            }
                            rzVar.d = 0L;
                            rzVar.Q.f30698a.a(false, true);
                            rzVar.l();
                            return;
                        case 2:
                            wy wyVar = this.f28917b.f30760t1;
                            if (wyVar != null) {
                                wyVar.w();
                                return;
                            }
                            return;
                        default:
                            wz wzVar = this.f28917b;
                            int currentItem = wzVar.h.getCurrentItem();
                            if (currentItem == 0) {
                                izVar = wzVar.V;
                            } else if (currentItem == 1) {
                                izVar = wzVar.f30742o0;
                            } else {
                                izVar = wzVar.G0;
                            }
                            if (izVar != null) {
                                vq vqVar = izVar.d;
                                vqVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                vqVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                vqVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                return;
                            }
                            return;
                    }
                }
            });
            uxVar.addView(dVar, new FrameLayout.LayoutParams(i11, i12));
        }
        int B3 = B(i19);
        if (Color.alpha(B3) >= 255) {
            zxVar.setBackgroundColor(B3);
        }
        fyVar.G(true);
        zxVar.p(getEmojipacks());
        uxVar.addView(zxVar, w7.z5.d(36.0f, i11));
        View view = new View(context2);
        this.O = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        int i20 = org.telegram.ui.ActionBar.g6.Ke;
        view.setBackgroundColor(B(i20));
        gh.c cVar3 = cVar;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i11, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(36.0f);
        uxVar.addView(view, layoutParams);
        oh.b bVar = new oh.b(context2, c6Var2);
        this.L = bVar;
        ah.v vVar = new ah.v(context2, 5, c6Var2);
        this.K = vVar;
        vVar.setVisibility(8);
        vVar.addView(bVar, w7.z5.a(48.0f, 10.0f, 5.0f, 10.0f, 10.0f, -1, 80));
        uxVar.addView(vVar, w7.z5.e(i11, -2, 80));
        if (z11) {
            jn0 jn0Var = jn0.f26083b;
            if (z12) {
                xw xwVar = new xw(this, context2);
                this.f30719g0 = xwVar;
                ?? obj2 = new Object();
                obj2.f28930a = 1;
                obj2.f28931b = xwVar;
                this.d.add(obj2);
                yw ywVar = new yw(this, context2);
                this.f30722h0 = ywVar;
                eVar.a(ywVar);
                ywVar.setClipToPadding(false);
                bz bzVar = new bz(this);
                this.f30725i0 = bzVar;
                ywVar.setLayoutManager(bzVar);
                ywVar.i(new zw(this));
                ywVar.setPadding(0, i12, 0, AndroidUtilities.dp(44.0f) + this.f30747p2);
                ((s4.e1) ywVar.getItemAnimator()).f44872m = false;
                az azVar = new az(this, context2, true, Integer.MAX_VALUE);
                this.f30739n0 = azVar;
                ywVar.setAdapter(azVar);
                this.f30728j0 = new az(this, context2, false, 0);
                ywVar.setOnScrollListener(new ax(this));
                ywVar.setOnTouchListener(new View.OnTouchListener(this) {
                    public final wz f28654b;

                    {
                        this.f28654b = this;
                    }

                    @Override
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        switch (r3) {
                            case 0:
                                org.telegram.ui.xt q6 = org.telegram.ui.xt.q();
                                wz wzVar = this.f28654b;
                                iy iyVar2 = wzVar.P;
                                wzVar.getMeasuredHeight();
                                return q6.s(motionEvent, iyVar2, null, wzVar.f30721g2, c6Var2);
                            case 1:
                                org.telegram.ui.xt q10 = org.telegram.ui.xt.q();
                                wz wzVar2 = this.f28654b;
                                return q10.s(motionEvent, wzVar2.f30722h0, wzVar2.m0, wzVar2.f30721g2, c6Var2);
                            default:
                                org.telegram.ui.xt q11 = org.telegram.ui.xt.q();
                                wz wzVar3 = this.f28654b;
                                ex exVar = wzVar3.D0;
                                wzVar3.getMeasuredHeight();
                                return q11.s(motionEvent, exVar, wzVar3.A0, wzVar3.f30721g2, c6Var2);
                        }
                    }
                });
                ?? r12 = new am0(this) {
                    public final wz f29199b;

                    {
                        this.f29199b = this;
                    }

                    @Override
                    public final void a(int i21, View view2) {
                        int i22;
                        String str;
                        switch (r2) {
                            case 0:
                                wz wzVar = this.f29199b;
                                yw ywVar2 = wzVar.f30722h0;
                                az azVar2 = wzVar.f30728j0;
                                az azVar3 = wzVar.f30739n0;
                                if (wzVar.f30760t1 != null) {
                                    azVar3.getClass();
                                    ArrayList arrayList3 = azVar3.f23324x;
                                    if (ywVar2.getAdapter() == azVar3) {
                                        if (i21 >= 0) {
                                            int i23 = azVar3.H;
                                            if (i21 < i23) {
                                                wzVar.f30760t1.v(view2, wzVar.f30726i1.get(i21), null, "gif", true, 0, 0);
                                                return;
                                            }
                                            if (i23 > 0) {
                                                i22 = (i21 - i23) - 1;
                                            } else {
                                                i22 = i21;
                                            }
                                            if (i22 >= 0 && i22 < arrayList3.size()) {
                                                wzVar.f30760t1.v(view2, arrayList3.get(i22), null, azVar3.f23320n, true, 0, 0);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    } else if (ywVar2.getAdapter() == azVar2 && i21 >= 0 && i21 < azVar2.f23324x.size()) {
                                        wzVar.f30760t1.v(view2, azVar2.f23324x.get(i21), azVar2.f23323w, azVar2.f23320n, true, 0, 0);
                                        wzVar.W();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            default:
                                wz wzVar2 = this.f29199b;
                                s4.g0 adapter = wzVar2.D0.getAdapter();
                                rz rzVar = wzVar2.f30780z0;
                                if (adapter == rzVar) {
                                    str = rzVar.N;
                                } else {
                                    str = null;
                                }
                                String str2 = str;
                                if (view2 instanceof org.telegram.ui.Cells.f8) {
                                    org.telegram.ui.Cells.f8 f8Var = (org.telegram.ui.Cells.f8) view2;
                                    if (f8Var.getSticker() != null && MessageObject.isPremiumSticker(f8Var.getSticker()) && !AccountInstance.getInstance(wzVar2.f30707c1).getUserConfig().isPremium()) {
                                        org.telegram.ui.xt.q().y(f8Var);
                                        return;
                                    }
                                    org.telegram.ui.xt.q().u();
                                    if (!f8Var.f20887r) {
                                        f8Var.f20887r = true;
                                        f8Var.f20886n = 0.5f;
                                        f8Var.f20890x = 0L;
                                        org.telegram.ui.Cells.e8 e8Var = f8Var.f20882a;
                                        e8Var.setAlpha(0.5f * f8Var.H);
                                        e8Var.invalidate();
                                        f8Var.f20888s = System.currentTimeMillis();
                                        f8Var.invalidate();
                                        wzVar2.f30760t1.m(f8Var, f8Var.getSticker(), str2, f8Var.getParentObject(), f8Var.getSendAnimationData(), true, 0);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                };
                this.m0 = r12;
                ywVar.setOnItemClickListener((am0) r12);
                xwVar.addView(ywVar, w7.z5.d(-1.0f, -1));
                bx bxVar = new bx(this, context2);
                this.f30742o0 = bxVar;
                xwVar.addView(bxVar, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + i12));
                dy dyVar = new dy(this, context2, c6Var2);
                this.f30745p0 = dyVar;
                dyVar.setType(jn0Var);
                dyVar.setUnderlineHeight(AndroidUtilities.getShadowHeight());
                i13 = i18;
                dyVar.setIndicatorColor(B(i13));
                dyVar.setUnderlineColor(B(i20));
                dyVar.setBackgroundColor(B(i19));
                V();
                dyVar.setDelegate(new qw(this, 2));
                azVar.F("", "", true, true, true);
            } else {
                i13 = i18;
            }
            cx cxVar = new cx(this, context2, z14);
            this.f30773x0 = cxVar;
            MediaDataController.getInstance(this.f30707c1).checkStickers(0);
            MediaDataController.getInstance(this.f30707c1).checkFeaturedStickers();
            ex exVar = new ex(this, context2);
            this.D0 = exVar;
            this.f30737m2.a(exVar);
            fx fxVar = new fx(this);
            this.E0 = fxVar;
            exVar.setLayoutManager(fxVar);
            fxVar.O = new gx(this);
            exVar.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f));
            exVar.setClipToPadding(false);
            ?? obj3 = new Object();
            obj3.f28930a = 2;
            obj3.f28931b = cxVar;
            this.d.add(obj3);
            this.f30780z0 = new rz(this, context2);
            mz mzVar = new mz(this, context2);
            this.f30777y0 = mzVar;
            exVar.setAdapter(mzVar);
            exVar.setOnTouchListener(new View.OnTouchListener(this) {
                public final wz f28654b;

                {
                    this.f28654b = this;
                }

                @Override
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    switch (r3) {
                        case 0:
                            org.telegram.ui.xt q6 = org.telegram.ui.xt.q();
                            wz wzVar = this.f28654b;
                            iy iyVar2 = wzVar.P;
                            wzVar.getMeasuredHeight();
                            return q6.s(motionEvent, iyVar2, null, wzVar.f30721g2, c6Var2);
                        case 1:
                            org.telegram.ui.xt q10 = org.telegram.ui.xt.q();
                            wz wzVar2 = this.f28654b;
                            return q10.s(motionEvent, wzVar2.f30722h0, wzVar2.m0, wzVar2.f30721g2, c6Var2);
                        default:
                            org.telegram.ui.xt q11 = org.telegram.ui.xt.q();
                            wz wzVar3 = this.f28654b;
                            ex exVar2 = wzVar3.D0;
                            wzVar3.getMeasuredHeight();
                            return q11.s(motionEvent, exVar2, wzVar3.A0, wzVar3.f30721g2, c6Var2);
                    }
                }
            });
            ?? r52 = new am0(this) {
                public final wz f29199b;

                {
                    this.f29199b = this;
                }

                @Override
                public final void a(int i21, View view2) {
                    int i22;
                    String str;
                    switch (r2) {
                        case 0:
                            wz wzVar = this.f29199b;
                            yw ywVar2 = wzVar.f30722h0;
                            az azVar2 = wzVar.f30728j0;
                            az azVar3 = wzVar.f30739n0;
                            if (wzVar.f30760t1 != null) {
                                azVar3.getClass();
                                ArrayList arrayList3 = azVar3.f23324x;
                                if (ywVar2.getAdapter() == azVar3) {
                                    if (i21 >= 0) {
                                        int i23 = azVar3.H;
                                        if (i21 < i23) {
                                            wzVar.f30760t1.v(view2, wzVar.f30726i1.get(i21), null, "gif", true, 0, 0);
                                            return;
                                        }
                                        if (i23 > 0) {
                                            i22 = (i21 - i23) - 1;
                                        } else {
                                            i22 = i21;
                                        }
                                        if (i22 >= 0 && i22 < arrayList3.size()) {
                                            wzVar.f30760t1.v(view2, arrayList3.get(i22), null, azVar3.f23320n, true, 0, 0);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                } else if (ywVar2.getAdapter() == azVar2 && i21 >= 0 && i21 < azVar2.f23324x.size()) {
                                    wzVar.f30760t1.v(view2, azVar2.f23324x.get(i21), azVar2.f23323w, azVar2.f23320n, true, 0, 0);
                                    wzVar.W();
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        default:
                            wz wzVar2 = this.f29199b;
                            s4.g0 adapter = wzVar2.D0.getAdapter();
                            rz rzVar = wzVar2.f30780z0;
                            if (adapter == rzVar) {
                                str = rzVar.N;
                            } else {
                                str = null;
                            }
                            String str2 = str;
                            if (view2 instanceof org.telegram.ui.Cells.f8) {
                                org.telegram.ui.Cells.f8 f8Var = (org.telegram.ui.Cells.f8) view2;
                                if (f8Var.getSticker() != null && MessageObject.isPremiumSticker(f8Var.getSticker()) && !AccountInstance.getInstance(wzVar2.f30707c1).getUserConfig().isPremium()) {
                                    org.telegram.ui.xt.q().y(f8Var);
                                    return;
                                }
                                org.telegram.ui.xt.q().u();
                                if (!f8Var.f20887r) {
                                    f8Var.f20887r = true;
                                    f8Var.f20886n = 0.5f;
                                    f8Var.f20890x = 0L;
                                    org.telegram.ui.Cells.e8 e8Var = f8Var.f20882a;
                                    e8Var.setAlpha(0.5f * f8Var.H);
                                    e8Var.invalidate();
                                    f8Var.f20888s = System.currentTimeMillis();
                                    f8Var.invalidate();
                                    wzVar2.f30760t1.m(f8Var, f8Var.getSticker(), str2, f8Var.getParentObject(), f8Var.getSendAnimationData(), true, 0);
                                    return;
                                }
                                return;
                            }
                            return;
                    }
                }
            };
            this.A0 = r52;
            exVar.setOnItemClickListener((am0) r52);
            exVar.setGlowColor(B(i19));
            cxVar.addView(exVar);
            this.f30699a0 = new pl0(exVar, fxVar);
            hx hxVar = new hx(this, context2);
            this.G0 = hxVar;
            cxVar.addView(hxVar, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + i12));
            oh.d dVar2 = new oh.d(context2, c6Var2);
            this.H0 = dVar2;
            dVar2.setVisibility(8);
            dVar2.setOnBackClickListener(new View.OnClickListener(this) {
                public final wz f28917b;

                {
                    this.f28917b = this;
                }

                @Override
                public final void onClick(View view2) {
                    iz izVar;
                    switch (r2) {
                        case 0:
                            vy vyVar = this.f28917b.S;
                            qy qyVar = vyVar.f30340c;
                            int childCount = qyVar.getChildCount();
                            for (int i202 = 0; i202 < childCount; i202++) {
                                ((oh.c) qyVar.getChildAt(i202)).a(false, true);
                            }
                            vyVar.d = 0L;
                            vyVar.F.f30701b.a(false, true);
                            vyVar.l();
                            return;
                        case 1:
                            rz rzVar = this.f28917b.f30780z0;
                            qz qzVar = rzVar.f28664c;
                            int childCount2 = qzVar.getChildCount();
                            for (int i21 = 0; i21 < childCount2; i21++) {
                                ((oh.c) qzVar.getChildAt(i21)).a(false, true);
                            }
                            rzVar.d = 0L;
                            rzVar.Q.f30698a.a(false, true);
                            rzVar.l();
                            return;
                        case 2:
                            wy wyVar = this.f28917b.f30760t1;
                            if (wyVar != null) {
                                wyVar.w();
                                return;
                            }
                            return;
                        default:
                            wz wzVar = this.f28917b;
                            int currentItem = wzVar.h.getCurrentItem();
                            if (currentItem == 0) {
                                izVar = wzVar.V;
                            } else if (currentItem == 1) {
                                izVar = wzVar.f30742o0;
                            } else {
                                izVar = wzVar.G0;
                            }
                            if (izVar != null) {
                                vq vqVar = izVar.d;
                                vqVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                vqVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                vqVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                return;
                            }
                            return;
                    }
                }
            });
            cxVar.addView(dVar2, new FrameLayout.LayoutParams(-1, i12));
            z19 = z14;
            ix ixVar = new ix(this, context2, c6Var2, m2Var, z19);
            this.B0 = ixVar;
            ixVar.setDragEnabled(true);
            ixVar.setWillNotDraw(false);
            ixVar.setType(jn0Var);
            ixVar.setUnderlineHeight(exVar.canScrollVertically(-1) ? AndroidUtilities.getShadowHeight() : 0);
            ixVar.setIndicatorColor(B(i13));
            ixVar.setUnderlineColor(B(i20));
            if (viewGroup != null && z19) {
                jx jxVar = new jx(this, context2);
                this.C0 = jxVar;
                jxVar.addView(ixVar, w7.z5.e(-1, 36, 51));
                viewGroup.addView(jxVar, w7.z5.d(-2.0f, -1));
            } else {
                cxVar.addView(ixVar, w7.z5.e(-1, 36, 51));
            }
            X(true);
            ixVar.setDelegate(new qw(this, 4));
            exVar.setOnScrollListener(new vz(this, 0));
            oh.b bVar2 = new oh.b(context2, c6Var2);
            this.N = bVar2;
            ah.v vVar2 = new ah.v(context2, 5, c6Var2);
            this.M = vVar2;
            vVar2.setVisibility(8);
            vVar2.addView(bVar2, w7.z5.a(48.0f, 10.0f, 5.0f, 10.0f, 10.0f, -1, 80));
            cxVar.addView(vVar2, w7.z5.e(-1, -2, 80));
        } else {
            z19 = z14;
        }
        this.e.clear();
        this.e.addAll(this.d);
        kx kxVar = new kx(this, context2);
        this.h = kxVar;
        mi.e eVar3 = this.f30737m2;
        eVar3.getClass();
        kxVar.b(new bi.z6(eVar3, 1));
        kxVar.setOverScrollMode(2);
        py pyVar = new py(this);
        this.L0 = pyVar;
        kxVar.setAdapter(pyVar);
        lx lxVar = new lx(this, context2);
        this.f30772x = lxVar;
        lxVar.setHapticFeedbackEnabled(true);
        lxVar.setImageResource(R.drawable.smiles_tab_clear);
        int w9 = z16 ? w(0.6f) : B(org.telegram.ui.ActionBar.g6.Re);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        lxVar.setColorFilter(new PorterDuffColorFilter(w9, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        lxVar.setScaleType(scaleType);
        lxVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
        lxVar.setFocusable(true);
        lxVar.setOnClickListener(new Object());
        w7.b6.a(lxVar);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f30751r = frameLayout;
        if (z13) {
            addView(frameLayout, w7.z5.a(100.0f, 0.0f, 0.0f, 0.0f, (AndroidUtilities.getShadowHeight() / AndroidUtilities.density) + 40.0f, -1, 87));
        } else {
            addView(frameLayout, w7.z5.a(100.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 87));
        }
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.f30755s = frameLayout2;
        addView(frameLayout2, w7.z5.a(100.0f, 0.0f, 0.0f, 0.0f, 64.0f, -1, 87));
        FrameLayout frameLayout3 = new FrameLayout(context2);
        this.f30738n = frameLayout3;
        View view2 = new View(context2);
        this.v = view2;
        frameLayout3.addView(view2, new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(40.0f), 83));
        if (z13) {
            addView(frameLayout3, w7.z5.e(-1, 48, 80));
            frameLayout3.addView(lxVar, w7.z5.a(48.0f, 2.0f, 0.0f, 2.0f, 0.0f, 48, 85));
            if (z11) {
                ImageView imageView = new ImageView(context2);
                this.f30776y = imageView;
                imageView.setImageResource(R.drawable.smiles_tab_settings);
                imageView.setColorFilter(new PorterDuffColorFilter(z16 ? w(0.6f) : B(org.telegram.ui.ActionBar.g6.Re), mode));
                imageView.setScaleType(scaleType);
                imageView.setFocusable(true);
                imageView.setContentDescription(LocaleController.getString(R.string.Settings));
                w7.b6.a(imageView);
                frameLayout3.addView(imageView, w7.z5.a(48.0f, 2.0f, 0.0f, 2.0f, 0.0f, 48, 85));
                imageView.setOnClickListener(new View.OnClickListener(this) {
                    public final wz f28917b;

                    {
                        this.f28917b = this;
                    }

                    @Override
                    public final void onClick(View view22) {
                        iz izVar;
                        switch (r2) {
                            case 0:
                                vy vyVar = this.f28917b.S;
                                qy qyVar = vyVar.f30340c;
                                int childCount = qyVar.getChildCount();
                                for (int i202 = 0; i202 < childCount; i202++) {
                                    ((oh.c) qyVar.getChildAt(i202)).a(false, true);
                                }
                                vyVar.d = 0L;
                                vyVar.F.f30701b.a(false, true);
                                vyVar.l();
                                return;
                            case 1:
                                rz rzVar = this.f28917b.f30780z0;
                                qz qzVar = rzVar.f28664c;
                                int childCount2 = qzVar.getChildCount();
                                for (int i21 = 0; i21 < childCount2; i21++) {
                                    ((oh.c) qzVar.getChildAt(i21)).a(false, true);
                                }
                                rzVar.d = 0L;
                                rzVar.Q.f30698a.a(false, true);
                                rzVar.l();
                                return;
                            case 2:
                                wy wyVar = this.f28917b.f30760t1;
                                if (wyVar != null) {
                                    wyVar.w();
                                    return;
                                }
                                return;
                            default:
                                wz wzVar = this.f28917b;
                                int currentItem = wzVar.h.getCurrentItem();
                                if (currentItem == 0) {
                                    izVar = wzVar.V;
                                } else if (currentItem == 1) {
                                    izVar = wzVar.f30742o0;
                                } else {
                                    izVar = wzVar.G0;
                                }
                                if (izVar != null) {
                                    vq vqVar = izVar.d;
                                    vqVar.requestFocus();
                                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                    vqVar.onTouchEvent(obtain);
                                    obtain.recycle();
                                    MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                    vqVar.onTouchEvent(obtain2);
                                    obtain2.recycle();
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            de0 de0Var = new de0(context2, c6Var2);
            this.f30768w = de0Var;
            de0Var.setViewPager(kxVar);
            de0Var.setShouldExpand(false);
            de0Var.setIndicatorHeight(AndroidUtilities.dp(3.0f));
            de0Var.setIndicatorColor(i0.a.k(B(org.telegram.ui.ActionBar.g6.Oe), 20));
            de0Var.setUnderlineHeight(0);
            de0Var.setTabPaddingLeftRight(AndroidUtilities.dp(11.0f));
            de0Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f));
            frameLayout3.addView(de0Var, w7.z5.e(-2, 48, 81));
            de0Var.setOnPageChangeListener(new nx(this, z19));
            ImageView imageView2 = new ImageView(context2);
            this.E = imageView2;
            imageView2.setImageResource(R.drawable.smiles_tab_search);
            imageView2.setColorFilter(new PorterDuffColorFilter(z16 ? w(0.6f) : B(org.telegram.ui.ActionBar.g6.Re), mode));
            imageView2.setScaleType(scaleType);
            imageView2.setContentDescription(LocaleController.getString(R.string.Search));
            imageView2.setFocusable(true);
            imageView2.setVisibility(8);
            frameLayout3.addView(imageView2, w7.z5.a(48.0f, 2.0f, 0.0f, 2.0f, 0.0f, 48, 83));
            imageView2.setOnClickListener(new View.OnClickListener(this) {
                public final wz f28917b;

                {
                    this.f28917b = this;
                }

                @Override
                public final void onClick(View view22) {
                    iz izVar;
                    switch (r2) {
                        case 0:
                            vy vyVar = this.f28917b.S;
                            qy qyVar = vyVar.f30340c;
                            int childCount = qyVar.getChildCount();
                            for (int i202 = 0; i202 < childCount; i202++) {
                                ((oh.c) qyVar.getChildAt(i202)).a(false, true);
                            }
                            vyVar.d = 0L;
                            vyVar.F.f30701b.a(false, true);
                            vyVar.l();
                            return;
                        case 1:
                            rz rzVar = this.f28917b.f30780z0;
                            qz qzVar = rzVar.f28664c;
                            int childCount2 = qzVar.getChildCount();
                            for (int i21 = 0; i21 < childCount2; i21++) {
                                ((oh.c) qzVar.getChildAt(i21)).a(false, true);
                            }
                            rzVar.d = 0L;
                            rzVar.Q.f30698a.a(false, true);
                            rzVar.l();
                            return;
                        case 2:
                            wy wyVar = this.f28917b.f30760t1;
                            if (wyVar != null) {
                                wyVar.w();
                                return;
                            }
                            return;
                        default:
                            wz wzVar = this.f28917b;
                            int currentItem = wzVar.h.getCurrentItem();
                            if (currentItem == 0) {
                                izVar = wzVar.V;
                            } else if (currentItem == 1) {
                                izVar = wzVar.f30742o0;
                            } else {
                                izVar = wzVar.G0;
                            }
                            if (izVar != null) {
                                vq vqVar = izVar.d;
                                vqVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                vqVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                vqVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                return;
                            }
                            return;
                    }
                }
            });
        } else {
            addView(frameLayout3, w7.z5.a(48.0f, 0.0f, 0.0f, 2.0f, 0.0f, 56, (LocaleController.isRTL ? 3 : 5) | 80));
            org.telegram.ui.Cells.z i02 = org.telegram.ui.ActionBar.g6.i0(AndroidUtilities.dp(56.0f), B(i19), B(i19));
            w7.b6.a(lxVar);
            lxVar.setPadding(0, 0, AndroidUtilities.dp(2.0f), 0);
            lxVar.setBackground(i02);
            lxVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
            lxVar.setFocusable(true);
            frameLayout3.addView(lxVar, w7.z5.a(48.0f, 2.0f, 0.0f, 2.0f, 0.0f, 48, 51));
            view2.setVisibility(8);
        }
        addView(kxVar, 0, w7.z5.e(-1, -1, 51));
        bi.f4 f4Var = new bi.f4(context2, 22);
        this.N0 = f4Var;
        f4Var.setBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(6.0f), B(org.telegram.ui.ActionBar.g6.f19847qf)));
        f4Var.setTextColor(B(org.telegram.ui.ActionBar.g6.f19828pf));
        f4Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f));
        f4Var.setGravity(16);
        f4Var.setTextSize(1, 14.0f);
        f4Var.setVisibility(4);
        addView(f4Var, w7.z5.a(-2.0f, 5.0f, 0.0f, 5.0f, 53.0f, -2, 81));
        this.C1 = AndroidUtilities.dp(AndroidUtilities.isTablet() ? 40.0f : 32.0f);
        Field field2 = jv.f26135f;
        jv jvVar = new jv(new iv(context2, c6Var2));
        if (jv.f26135f == null) {
            try {
                field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
                try {
                    field.setAccessible(true);
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                field = null;
            }
            jv.f26135f = field;
        }
        Field field3 = jv.f26135f;
        if (field3 != null) {
            try {
                jvVar.f26137a = (ViewTreeObserver.OnScrollChangedListener) field3.get(jvVar);
                jv.f26135f.set(jvVar, jv.f26136g);
            } catch (Exception unused3) {
                jvVar.f26137a = null;
            }
        }
        this.B1 = jvVar;
        jvVar.f26139c.setOnSelectionUpdateListener(new d(this, 10));
        this.A1 = MessagesController.getGlobalEmojiSettings().getInt("selected_page", 0);
        Emoji.loadRecentEmoji();
        fyVar.F(false);
        I(true, z11, z12, false);
        if (Build.VERSION.SDK_INT >= 31) {
            bh.f fVar = new bh.f(false);
            this.f30730j2 = fVar;
            gh.d dVar3 = new gh.d(null);
            dVar3.f10156f = cVar3;
            dVar3.d = fVar;
            dVar3.e = -2;
            bh.b bVar3 = new bh.b(dVar3);
            this.f30735l2 = bVar3;
            bVar3.f2751i = LiteMode.isEnabled(262144);
            int dp2 = AndroidUtilities.dp(LiteMode.isEnabled(262144) ? 8.0f : 48.0f);
            bVar3.f2747b = dp2;
            bVar3.f2748c = dp2;
            bVar3.h = this.f30737m2;
        } else {
            bh.b bVar4 = new bh.b(cVar3);
            this.f30735l2 = bVar4;
            bVar4.h = this.f30737m2;
            this.f30730j2 = null;
        }
        this.f30733k2 = new lh(this, 1);
        setBlurredBackgroundDrawableFactory(this.f30735l2);
        this.f30737m2.b(this);
        this.f30737m2.f15590a = new qw(this, 0);
    }

    public static void c(wz wzVar, boolean z10) {
        yw ywVar = wzVar.f30722h0;
        if (ywVar != null) {
            int childCount = ywVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = ywVar.getChildAt(i10);
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

    public static void d(wz wzVar, ez ezVar, String str) {
        String str2;
        String str3;
        boolean z10;
        String str4;
        wy wyVar;
        zc zcVar;
        org.telegram.ui.ActionBar.m2 m2Var = wzVar.Y1;
        int i10 = wzVar.f30707c1;
        ArrayList arrayList = wzVar.f30749q1;
        if (ezVar != null) {
            if (ezVar.getSpan() != null) {
                if (wzVar.f30760t1 != null) {
                    long j10 = ezVar.getSpan().documentId;
                    TLRPC.Document document = ezVar.getSpan().document;
                    jy jyVar = ezVar.e;
                    if (jyVar != null && jyVar.f26155i) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (document == null) {
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            jy jyVar2 = (jy) arrayList.get(i11);
                            int i12 = 0;
                            while (true) {
                                ArrayList arrayList2 = jyVar2.f26152c;
                                if (arrayList2 != null && i12 < arrayList2.size()) {
                                    if (((TLRPC.Document) jyVar2.f26152c.get(i12)).f18922id == j10) {
                                        document = (TLRPC.Document) jyVar2.f26152c.get(i12);
                                        break;
                                    }
                                    i12++;
                                }
                            }
                        }
                    }
                    if (document == null) {
                        document = s5.f(i10, j10);
                    }
                    TLRPC.Document document2 = document;
                    if (document2 != null) {
                        str4 = MessageObject.findAnimatedEmojiEmoticon(document2);
                    } else {
                        str4 = null;
                    }
                    String str5 = str4;
                    if (!MessageObject.isFreeEmoji(document2) && !UserConfig.getInstance(i10).isPremium() && (((wyVar = wzVar.f30760t1) == null || !wyVar.g()) && !wzVar.U0 && !z10)) {
                        wzVar.M(false);
                        if (m2Var != null) {
                            zcVar = zc.a0(m2Var);
                        } else {
                            zcVar = new zc(wzVar.f30751r, wzVar.Z1);
                        }
                        if (!wzVar.f30724h2 && m2Var != null) {
                            zcVar.J(R.raw.saved_messages, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint2)), LocaleController.getString(R.string.Open), new pw(wzVar, 4)).j();
                        } else {
                            zcVar.q(document2, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint)), LocaleController.getString(R.string.PremiumMore), new pw(wzVar, 3)).j();
                        }
                        wzVar.f30724h2 = !wzVar.f30724h2;
                        return;
                    }
                    wzVar.E2 = SystemClock.elapsedRealtime();
                    wzVar.M(true);
                    wzVar.h("animated_" + j10);
                    wzVar.f30760t1.x(j10, document2, str5, ezVar.f24519c);
                    return;
                }
                return;
            }
            wzVar.E2 = SystemClock.elapsedRealtime();
            wzVar.M(true);
            if (str != null) {
                str2 = str;
            } else {
                str2 = (String) ezVar.getTag();
            }
            new SpannableStringBuilder().append((CharSequence) str2);
            if (str == null) {
                if (!ezVar.f24519c && (str3 = Emoji.emojiColor.get(str2)) != null) {
                    str2 = g(str2, str3);
                }
                wzVar.h(str2);
                wy wyVar2 = wzVar.f30760t1;
                if (wyVar2 != null) {
                    wyVar2.l(Emoji.fixEmoji(str2));
                    return;
                }
                return;
            }
            wy wyVar3 = wzVar.f30760t1;
            if (wyVar3 != null) {
                wyVar3.l(Emoji.fixEmoji(str));
            }
        }
    }

    public static void e(wz wzVar, int i10, int i11) {
        s4.b1 K;
        int[] iArr = wzVar.Q0;
        if (i10 == 1) {
            wzVar.n(i11, wzVar.P);
            return;
        }
        wy wyVar = wzVar.f30760t1;
        if ((wyVar == null || !wyVar.z()) && !wzVar.J0) {
            mm0 y3 = wzVar.y(i10);
            if (i11 > 0 && y3 != null && y3.getVisibility() == 0 && (K = y3.K(0)) != null && K.f44838a.getTop() + wzVar.f30703b1 >= y3.getPaddingTop()) {
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
                wzVar.Y();
            } else {
                wzVar.z(i10).setTranslationY(Math.max(-AndroidUtilities.dp(48.0f), iArr[i10]));
            }
        }
    }

    public static void f(wz wzVar, boolean z10) {
        int N0;
        bz bzVar = wzVar.f30725i0;
        bx bxVar = wzVar.f30742o0;
        yw ywVar = wzVar.f30722h0;
        if (ywVar != null && (ywVar.getAdapter() instanceof az)) {
            az azVar = (az) ywVar.getAdapter();
            if (!azVar.f23322s && azVar.h == 0 && !azVar.f23324x.isEmpty() && (N0 = bzVar.N0()) != -1 && N0 > bzVar.B() - 5) {
                String str = azVar.f23323w;
                String str2 = azVar.f23321r;
                boolean z11 = azVar.v;
                azVar.F(str, str2, true, z11, z11);
            }
        }
        wy wyVar = wzVar.f30760t1;
        if (wyVar != null && wyVar.z()) {
            boolean z12 = false;
            s4.b1 K = ywVar.K(0);
            if (K == null) {
                iz.a(bxVar, true, !z10);
                return;
            }
            if (K.f44838a.getTop() < ywVar.getPaddingTop()) {
                z12 = true;
            }
            iz.a(bxVar, z12, !z10);
        } else if (bxVar != null && ywVar != null) {
            bxVar.f25820a.a(true, !z10);
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
        String u10 = t8.b.u(str, str2);
        if (str3 != null) {
            u10 = t8.b.u(u10, str3);
        }
        if (z10) {
            return t8.b.u(u10, "\u200d➡");
        }
        return u10;
    }

    public static void j(int i10, View view) {
        if (view == null) {
            return;
        }
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i10);
    }

    public final int B(int i10) {
        org.telegram.ui.ActionBar.c6 c6Var = this.Z1;
        if (c6Var != null) {
            return c6Var.E0(i10);
        }
        return org.telegram.ui.ActionBar.g6.x0(null, i10, false);
    }

    public final void C() {
        hx hxVar = this.G0;
        if (hxVar != null) {
            hxVar.b();
        }
        bx bxVar = this.f30742o0;
        if (bxVar != null) {
            bxVar.b();
        }
        vw vwVar = this.V;
        if (vwVar != null) {
            vwVar.b();
        }
    }

    public final void D(boolean z10, boolean z11) {
        hz hzVar;
        boolean z12;
        if (this.A1 != 0 && this.f30770w1) {
            this.A1 = 0;
        }
        if (this.A1 == 0 && this.f30766v1) {
            this.A1 = 1;
        }
        int i10 = this.A1;
        kx kxVar = this.h;
        if (i10 != 0 && !z10 && this.e.size() != 1) {
            int i11 = this.A1;
            if (i11 == 1) {
                L(false, false);
                if (!this.f30762u0 && !this.f30765v0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                Q(z12, false);
                if (kxVar.getCurrentItem() != 2) {
                    kxVar.x(2, false);
                }
                ix ixVar = this.B0;
                if (ixVar != null) {
                    this.S0 = true;
                    int i12 = this.G1;
                    if (i12 >= 0) {
                        ixVar.m(i12);
                    } else {
                        int i13 = this.F1;
                        if (i13 >= 0) {
                            ixVar.m(i13);
                        } else {
                            ixVar.m(this.E1);
                        }
                    }
                    this.S0 = false;
                    this.E0.h1(0, 0);
                }
            } else if (i11 == 2) {
                L(false, false);
                Q(false, false);
                if (kxVar.getCurrentItem() != 1) {
                    kxVar.x(1, false);
                }
                dy dyVar = this.f30745p0;
                if (dyVar != null) {
                    dyVar.m(0);
                }
                bx bxVar = this.f30742o0;
                if (bxVar != null && (hzVar = bxVar.f25825r) != null) {
                    hzVar.G1(null);
                }
            }
        } else {
            L(true, false);
            Q(false, false);
            if (kxVar.getCurrentItem() != 0) {
                kxVar.x(0, !z10);
            }
            if (z11) {
                AndroidUtilities.runOnUIThread(new pw(this, 5), 350L);
            }
        }
        M(true);
    }

    public final void E() {
        mz mzVar = this.f30777y0;
        if (mzVar != null) {
            mzVar.l();
        }
        rz rzVar = this.f30780z0;
        if (rzVar != null) {
            rzVar.l();
        }
        if (org.telegram.ui.xt.q().E) {
            org.telegram.ui.xt.q().n();
        }
        org.telegram.ui.xt.q().u();
    }

    public final void F(int i10) {
        wy wyVar = this.f30760t1;
        if ((wyVar != null && wyVar.z()) || i10 == 0) {
            return;
        }
        HorizontalScrollView z10 = z(i10);
        this.Q0[i10] = 0;
        z10.setTranslationY(0);
    }

    public final void G(int i10, int i11) {
        vx vxVar = this.Q;
        View m10 = vxVar.m(i10);
        int L0 = vxVar.L0();
        int i12 = 1;
        if ((m10 == null && Math.abs(i10 - L0) > vxVar.J * 9.0f) || !SharedConfig.animationsEnabled()) {
            if (vxVar.L0() < i10) {
                i12 = 0;
            }
            pl0 pl0Var = this.f30702b0;
            pl0Var.f28051b = i12;
            pl0Var.d(i10, i11, false, false);
            return;
        }
        this.J0 = true;
        di.l1 l1Var = new di.l1(this, this.P.getContext(), 1);
        l1Var.f44979a = i10;
        l1Var.f14354p = i11;
        vxVar.w0(l1Var);
    }

    public final void H(int i10, int i11) {
        fx fxVar = this.E0;
        View m10 = fxVar.m(i10);
        int L0 = fxVar.L0();
        int i12 = 1;
        if (m10 == null && Math.abs(i10 - L0) > 40) {
            if (fxVar.L0() < i10) {
                i12 = 0;
            }
            pl0 pl0Var = this.f30699a0;
            pl0Var.f28051b = i12;
            pl0Var.d(i10, i11, false, false);
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
            if (((sz) arrayList2.get(i10)).f28930a == 0 && z10) {
                arrayList.add((sz) arrayList2.get(i10));
            }
            if (((sz) arrayList2.get(i10)).f28930a == 1 && z12) {
                arrayList.add((sz) arrayList2.get(i10));
            }
            if (((sz) arrayList2.get(i10)).f28930a == 2 && z11) {
                arrayList.add((sz) arrayList2.get(i10));
            }
            i10++;
        }
        de0 de0Var = this.f30768w;
        if (de0Var != null) {
            if (arrayList.size() > 1) {
                z14 = true;
            }
            AndroidUtilities.updateViewVisibilityAnimated(de0Var, z14, 1.0f, z13);
        }
        kx kxVar = this.h;
        if (kxVar != null) {
            kxVar.setAdapter(null);
            kxVar.setAdapter(this.L0);
            if (de0Var != null) {
                de0Var.setViewPager(kxVar);
            }
        }
    }

    public final void J(final oh.b bVar, final TLObject tLObject, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final boolean z10, boolean z11) {
        String formatPluralString;
        rz rzVar;
        vy vyVar;
        if (stickerSet != null) {
            if (!z10 || (vyVar = this.S) == null || vyVar.d == stickerSet.f18943id) {
                if (!z10 && (rzVar = this.f30780z0) != null && rzVar.d != stickerSet.f18943id) {
                    return;
                }
                final boolean isStickerPackInstalled = MediaDataController.getInstance(this.f30707c1).isStickerPackInstalled(stickerSet.f18943id);
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
                bVar.f16346h0.a(!isStickerPackInstalled, z11);
                bVar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        int i10;
                        wz wzVar = wz.this;
                        MediaDataController mediaDataController = MediaDataController.getInstance(wzVar.f30707c1);
                        Context context = wzVar.getContext();
                        if (isStickerPackInstalled) {
                            i10 = 0;
                        } else {
                            i10 = 2;
                        }
                        int i11 = i10;
                        org.telegram.ui.ActionBar.m2 m2Var = wzVar.Y1;
                        FrameLayout frameLayout = wzVar.f30755s;
                        oh.b bVar2 = bVar;
                        TLObject tLObject2 = tLObject;
                        TLRPC.StickerSet stickerSet2 = stickerSet;
                        TLRPC.Document document2 = document;
                        boolean z12 = z10;
                        mediaDataController.toggleStickerSet(context, tLObject2, document2, i11, m2Var, frameLayout, false, true, new i2.f1(wzVar, bVar2, tLObject2, stickerSet2, document2, z12, 10), false);
                        wzVar.J(bVar2, tLObject2, stickerSet2, document2, z12, true);
                    }
                });
            }
        }
    }

    public final void K(long j10, boolean z10, boolean z11) {
        int i10;
        View childAt;
        float f7;
        de0 de0Var = this.f30768w;
        if (de0Var != null) {
            this.f30766v1 = z10;
            this.f30770w1 = z11;
            if (!z11 && !z10) {
                this.f30763u1 = 0L;
            } else {
                this.f30763u1 = j10;
            }
            if (z11) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            LinearLayout linearLayout = de0Var.d;
            if (i10 >= linearLayout.getChildCount()) {
                childAt = null;
            } else {
                childAt = linearLayout.getChildAt(i10);
            }
            if (childAt != null) {
                if (this.f30763u1 != 0) {
                    f7 = 0.15f;
                } else {
                    f7 = 1.0f;
                }
                childAt.setAlpha(f7);
                kx kxVar = this.h;
                if (z11) {
                    if (this.f30763u1 != 0 && kxVar.getCurrentItem() != 0) {
                        L(true, true);
                        Q(false, true);
                        kxVar.x(0, false);
                    }
                } else if (this.f30763u1 != 0 && kxVar.getCurrentItem() != 1) {
                    L(false, true);
                    Q(false, true);
                    kxVar.x(1, false);
                }
            }
        }
    }

    public final void L(boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        float f12;
        lx lxVar = this.f30772x;
        if (!z10 || lxVar.getTag() != null) {
            if ((!z10 && lxVar.getTag() != null) || this.f30741n2) {
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
            lxVar.setTag(num);
            int i10 = 0;
            float f13 = 0.0f;
            if (z11) {
                if (z10) {
                    lxVar.setVisibility(0);
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.F = animatorSet2;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(lxVar, View.ALPHA, f11);
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(lxVar, View.SCALE_X, f12);
                if (z10) {
                    f13 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(lxVar, View.SCALE_Y, f13));
                this.F.setDuration(200L);
                this.F.setInterpolator(es.f24466g);
                this.F.addListener(new rx(this, z10, 0));
                this.F.start();
                return;
            }
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            lxVar.setAlpha(f7);
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            lxVar.setScaleX(f10);
            if (z10) {
                f13 = 1.0f;
            }
            lxVar.setScaleY(f13);
            if (!z10) {
                i10 = 4;
            }
            lxVar.setVisibility(i10);
        }
    }

    public final void M(boolean z10) {
        Integer num;
        this.H = 0.0f;
        wy wyVar = this.f30760t1;
        if (wyVar != null && wyVar.z()) {
            z10 = false;
        }
        FrameLayout frameLayout = this.f30738n;
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
                this.W.setInterpolator(es.f24466g);
                this.W.addListener(new l6(this, 22));
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
        TLRPC.Chat chat = MessagesController.getInstance(this.f30707c1).getChat(Long.valueOf(this.f30763u1));
        if (chat != null) {
            bi.f4 f4Var = this.N0;
            if (z10) {
                if (!ChatObject.hasAdminRights(chat) && (tL_chatBannedRights = chat.default_banned_rights) != null && (tL_chatBannedRights.send_stickers || (z11 && tL_chatBannedRights.send_plain))) {
                    org.telegram.ui.ActionBar.m2 m2Var = this.Y1;
                    if (!(m2Var instanceof org.telegram.ui.fo) || !((org.telegram.ui.fo) m2Var).N6()) {
                        if (z11) {
                            f4Var.setText(LocaleController.getString(R.string.GlobalAttachEmojiRestricted));
                        } else if (z12) {
                            f4Var.setText(LocaleController.getString(R.string.GlobalAttachGifRestricted));
                        } else {
                            f4Var.setText(LocaleController.getString(R.string.GlobalAttachStickersRestricted));
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
                            f4Var.setText(LocaleController.getString(R.string.AttachPlainRestrictedForever));
                        } else if (z12) {
                            f4Var.setText(LocaleController.getString(R.string.AttachGifRestrictedForever));
                        } else {
                            f4Var.setText(LocaleController.getString(R.string.AttachStickersRestrictedForever));
                        }
                    } else {
                        if (z11) {
                            f4Var.setText(LocaleController.formatString("AttachPlainRestricted", R.string.AttachPlainRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                        }
                        if (z12) {
                            f4Var.setText(LocaleController.formatString("AttachGifRestricted", R.string.AttachGifRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                        } else {
                            f4Var.setText(LocaleController.formatString("AttachStickersRestricted", R.string.AttachStickersRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                        }
                    }
                }
                f4Var.setVisibility(0);
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
                f7 = f4Var.getAlpha();
            } else {
                f7 = 1.0f;
            }
            float f11 = 0.0f;
            if (!z10) {
                f10 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(f4Var, View.ALPHA, f7, f10);
            if (z10) {
                translationY = AndroidUtilities.dp(12.0f);
            } else {
                translationY = f4Var.getTranslationY();
            }
            if (!z10) {
                f11 = AndroidUtilities.dp(12.0f);
            }
            animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(f4Var, View.TRANSLATION_Y, translationY, f11));
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
            this.J2.setInterpolator(es.h);
            this.J2.start();
        }
    }

    public final void Q(boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        float f12;
        ImageView imageView = this.f30776y;
        if (imageView != null && !this.f30744o2) {
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
                        this.G.setInterpolator(es.f24466g);
                        this.G.addListener(new rx(this, z10, 1));
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
        org.telegram.ui.ActionBar.m2 m2Var;
        View view = (View) getParent();
        if (view != null) {
            float y3 = getY();
            if (getLayoutParams().height > 0) {
                measuredHeight = getLayoutParams().height;
            } else {
                measuredHeight = getMeasuredHeight();
            }
            float f7 = y3 + measuredHeight;
            if ((!AndroidUtilities.isInMultiwindow && ((m2Var = this.Y1) == null || !m2Var.isInBubbleMode())) || this.V0) {
                dp = view.getHeight();
            } else {
                dp = AndroidUtilities.dp(1.0f);
            }
            float f10 = f7 - dp;
            int i10 = (this.f30750q2 > 0.0f ? 1 : (this.f30750q2 == 0.0f ? 0 : -1));
            FrameLayout frameLayout = this.f30738n;
            if (i10 >= 0) {
                f10 += getMeasuredHeight() - this.f30750q2;
            } else if (frameLayout.getTop() - f10 < 0.0f || !this.f30771w2) {
                f10 = 0.0f;
            }
            float lerp = (-f10) + AndroidUtilities.lerp(AndroidUtilities.dp(50.0f), -this.f30747p2, this.F2.e);
            frameLayout.setTranslationY(lerp);
            if (this.f30709d0) {
                this.f30751r.setTranslationY(lerp);
            }
        }
    }

    public final void S() {
        iz izVar;
        boolean z10;
        int B;
        int B2;
        int B3;
        int B4;
        int B5;
        int B6;
        int B7;
        int B8;
        kw kwVar;
        int B9;
        int B10;
        int B11;
        int B12;
        int B13;
        int B14;
        int B15;
        int B16;
        int B17;
        boolean z11 = this.f30762u0;
        View view = this.v;
        if (!z11) {
            setBackground(null);
            view.setBackground(null);
        } else if (!AndroidUtilities.isInMultiwindow && !this.N1) {
            int i10 = org.telegram.ui.ActionBar.g6.He;
            setBackgroundColor(B(i10));
            if (this.f30709d0) {
                view.setBackgroundColor(B(i10));
            }
        } else {
            Drawable background = getBackground();
            if (background != null) {
                background.setColorFilter(new PorterDuffColorFilter(B(org.telegram.ui.ActionBar.g6.He), PorterDuff.Mode.MULTIPLY));
            }
        }
        zx zxVar = this.I;
        if (zxVar != null) {
            if (this.f30762u0) {
                zxVar.setBackgroundColor(B(org.telegram.ui.ActionBar.g6.He));
                this.O.setBackgroundColor(B(org.telegram.ui.ActionBar.g6.Ke));
            } else {
                zxVar.setBackground(null);
            }
        }
        jv jvVar = this.B1;
        if (jvVar != null) {
            jvVar.f26139c.a();
        }
        int i11 = 0;
        while (true) {
            izVar = this.V;
            z10 = this.f30727i2;
            if (i11 >= 3) {
                break;
            }
            if (i11 == 0) {
                izVar = this.G0;
            } else if (i11 != 1) {
                izVar = this.f30742o0;
            }
            if (izVar != null) {
                vq vqVar = izVar.d;
                FrameLayout frameLayout = izVar.f25824n;
                View view2 = izVar.f25823f;
                if (this.f30762u0) {
                    view2.setBackgroundColor(B(org.telegram.ui.ActionBar.g6.He));
                } else {
                    view2.setBackground(null);
                }
                izVar.e.setBackgroundColor(B(org.telegram.ui.ActionBar.g6.Ke));
                zn0 zn0Var = izVar.f25822c;
                if (z10) {
                    B14 = w(0.4f);
                } else {
                    B14 = B(org.telegram.ui.ActionBar.g6.Je);
                }
                zn0Var.a(B14);
                Drawable background2 = frameLayout.getBackground();
                if (z10) {
                    B15 = w(0.06f);
                } else {
                    B15 = B(org.telegram.ui.ActionBar.g6.Ie);
                }
                org.telegram.ui.ActionBar.g6.x1(B15, background2);
                frameLayout.invalidate();
                if (z10) {
                    B16 = w(0.45f);
                } else {
                    B16 = B(org.telegram.ui.ActionBar.g6.Je);
                }
                vqVar.setHintTextColor(B16);
                if (z10) {
                    B17 = w(0.8f);
                } else {
                    B17 = B(org.telegram.ui.ActionBar.g6.G6);
                }
                vqVar.setTextColor(B17);
            }
            i11++;
        }
        Paint paint = this.f30757s1;
        if (paint != null) {
            paint.setColor(B(org.telegram.ui.ActionBar.g6.f19551af));
        }
        iy iyVar = this.P;
        if (iyVar != null) {
            iyVar.setGlowColor(B(org.telegram.ui.ActionBar.g6.He));
        }
        ex exVar = this.D0;
        if (exVar != null) {
            exVar.setGlowColor(B(org.telegram.ui.ActionBar.g6.He));
        }
        ix ixVar = this.B0;
        if (ixVar != null) {
            ixVar.setIndicatorColor(B(org.telegram.ui.ActionBar.g6.Qe));
            ixVar.setUnderlineColor(B(org.telegram.ui.ActionBar.g6.Ke));
            if (this.f30762u0) {
                ixVar.setBackgroundColor(B(org.telegram.ui.ActionBar.g6.He));
            } else {
                ixVar.setBackground(null);
            }
        }
        dy dyVar = this.f30745p0;
        if (dyVar != null) {
            dyVar.setIndicatorColor(B(org.telegram.ui.ActionBar.g6.Qe));
            dyVar.setUnderlineColor(B(org.telegram.ui.ActionBar.g6.Ke));
            if (this.f30762u0) {
                dyVar.setBackgroundColor(B(org.telegram.ui.ActionBar.g6.He));
            } else {
                dyVar.setBackground(null);
            }
        }
        lx lxVar = this.f30772x;
        if (lxVar != null) {
            if (z10) {
                B13 = w(0.6f);
            } else {
                B13 = B(org.telegram.ui.ActionBar.g6.Re);
            }
            lxVar.setColorFilter(new PorterDuffColorFilter(B13, PorterDuff.Mode.MULTIPLY));
            if (izVar == null) {
                Drawable background3 = lxVar.getBackground();
                int i12 = org.telegram.ui.ActionBar.g6.He;
                org.telegram.ui.ActionBar.g6.C1(background3, B(i12), false);
                org.telegram.ui.ActionBar.g6.C1(lxVar.getBackground(), B(i12), true);
            }
        }
        ImageView imageView = this.f30776y;
        if (imageView != null) {
            if (z10) {
                B12 = w(0.6f);
            } else {
                B12 = B(org.telegram.ui.ActionBar.g6.Re);
            }
            imageView.setColorFilter(new PorterDuffColorFilter(B12, PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.E;
        if (imageView2 != null) {
            if (z10) {
                B11 = w(0.6f);
            } else {
                B11 = B(org.telegram.ui.ActionBar.g6.Re);
            }
            imageView2.setColorFilter(new PorterDuffColorFilter(B11, PorterDuff.Mode.MULTIPLY));
        }
        bi.f4 f4Var = this.N0;
        if (f4Var != null) {
            ((ShapeDrawable) f4Var.getBackground()).getPaint().setColor(B(org.telegram.ui.ActionBar.g6.f19847qf));
            f4Var.setTextColor(B(org.telegram.ui.ActionBar.g6.f19828pf));
        }
        az azVar = this.f30728j0;
        if (azVar != null) {
            cz czVar = azVar.e;
            ImageView imageView3 = czVar.f23911a;
            int i13 = org.telegram.ui.ActionBar.g6.Le;
            imageView3.setColorFilter(new PorterDuffColorFilter(B(i13), PorterDuff.Mode.MULTIPLY));
            czVar.f23912b.setTextColor(B(i13));
            czVar.f23913c.setProgressColor(B(org.telegram.ui.ActionBar.g6.f19673h6));
        }
        this.f30714e2 = new PorterDuffColorFilter(B(org.telegram.ui.ActionBar.g6.Oh), PorterDuff.Mode.SRC_IN);
        int i14 = 0;
        while (true) {
            Drawable[] drawableArr = this.X0;
            if (i14 >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i14];
            if (z10) {
                B9 = w(0.4f);
            } else {
                B9 = B(org.telegram.ui.ActionBar.g6.Ne);
            }
            org.telegram.ui.ActionBar.g6.z1(drawable, B9, false);
            Drawable drawable2 = drawableArr[i14];
            if (z10) {
                B10 = w(0.8f);
            } else {
                B10 = B(org.telegram.ui.ActionBar.g6.Oe);
            }
            org.telegram.ui.ActionBar.g6.z1(drawable2, B10, true);
            i14++;
        }
        if (zxVar != null && (kwVar = zxVar.f27761y) != null) {
            kwVar.d();
        }
        int i15 = 0;
        while (true) {
            Drawable[] drawableArr2 = this.Y0;
            if (i15 >= drawableArr2.length) {
                break;
            }
            Drawable drawable3 = drawableArr2[i15];
            if (z10) {
                B7 = w(0.4f);
            } else {
                B7 = B(org.telegram.ui.ActionBar.g6.Me);
            }
            org.telegram.ui.ActionBar.g6.z1(drawable3, B7, false);
            Drawable drawable4 = drawableArr2[i15];
            if (z10) {
                B8 = w(0.8f);
            } else {
                B8 = B(org.telegram.ui.ActionBar.g6.Oe);
            }
            org.telegram.ui.ActionBar.g6.z1(drawable4, B8, true);
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
                B5 = w(0.4f);
            } else {
                B5 = B(org.telegram.ui.ActionBar.g6.Me);
            }
            org.telegram.ui.ActionBar.g6.z1(drawable5, B5, false);
            Drawable drawable6 = drawableArr3[i16];
            if (z10) {
                B6 = w(0.8f);
            } else {
                B6 = B(org.telegram.ui.ActionBar.g6.Oe);
            }
            org.telegram.ui.ActionBar.g6.z1(drawable6, B6, true);
            i16++;
        }
        org.telegram.ui.ActionBar.s5 s5Var = this.a2;
        if (s5Var != null) {
            if (z10) {
                B3 = w(0.4f);
            } else {
                B3 = B(org.telegram.ui.ActionBar.g6.Ne);
            }
            org.telegram.ui.ActionBar.g6.z1(s5Var, B3, false);
            if (z10) {
                B4 = w(0.8f);
            } else {
                B4 = B(org.telegram.ui.ActionBar.g6.Oe);
            }
            org.telegram.ui.ActionBar.g6.z1(s5Var, B4, true);
        }
        org.telegram.ui.ActionBar.s5 s5Var2 = this.f30704b2;
        if (s5Var2 != null) {
            if (z10) {
                B = w(0.4f);
            } else {
                B = B(org.telegram.ui.ActionBar.g6.Qe);
            }
            org.telegram.ui.ActionBar.g6.z1(s5Var2, B, false);
            if (z10) {
                B2 = w(0.8f);
            } else {
                B2 = B(org.telegram.ui.ActionBar.g6.Qe);
            }
            org.telegram.ui.ActionBar.g6.z1(s5Var2, B2, true);
        }
    }

    public final void T() {
        iy iyVar = this.P;
        if (iyVar != null) {
            for (int i10 = 0; i10 < iyVar.getChildCount(); i10++) {
                View childAt = iyVar.getChildAt(i10);
                if (childAt instanceof ny) {
                    ((ny) childAt).a(true);
                }
            }
        }
    }

    public final void U(int i10) {
        int i11;
        if (!this.f30716f0) {
            int i12 = -1;
            if (i10 != -1) {
                int size = getRecentEmoji().size() + (this.f30709d0 ? 1 : 0);
                fy fyVar = this.R;
                int i13 = fyVar.f24824c;
                ArrayList arrayList = fyVar.f24830x;
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
                        ArrayList<jy> emojipacks = getEmojipacks();
                        int size2 = arrayList.size() - 1;
                        while (true) {
                            if (size2 < 0) {
                                break;
                            } else if (((Integer) arrayList.get(size2)).intValue() <= i10) {
                                jy jyVar = (jy) this.f30749q1.get(size2);
                                while (i14 < emojipacks.size()) {
                                    long j10 = emojipacks.get(i14).f26151b.f18943id;
                                    long j11 = jyVar.f26151b.f18943id;
                                    if (j10 == j11 && (!jyVar.f26154g || (!jyVar.f26153f && !this.f30746p1.contains(Long.valueOf(j11))))) {
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
        hz hzVar;
        int i11;
        boolean z12;
        boolean z13;
        dy dyVar = this.f30745p0;
        int currentPosition = dyVar.getCurrentPosition();
        int i12 = this.f30752r0;
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
        boolean isEmpty = this.f30726i1.isEmpty();
        dyVar.d(false);
        this.f30752r0 = -2;
        this.f30756s0 = -2;
        this.f30759t0 = -2;
        Drawable[] drawableArr = this.Z0;
        if (!isEmpty) {
            this.f30752r0 = 0;
            dyVar.b(0, drawableArr[0]).setContentDescription(LocaleController.getString(R.string.RecentStickers));
            i10 = 1;
        } else {
            i10 = 0;
        }
        this.f30756s0 = i10;
        dyVar.b(1, drawableArr[1]).setContentDescription(LocaleController.getString(R.string.FeaturedGifs));
        this.f30759t0 = i10 + 1;
        AndroidUtilities.dp(13.0f);
        AndroidUtilities.dp(11.0f);
        int i13 = this.f30707c1;
        ArrayList<String> arrayList = MessagesController.getInstance(i13).gifSearchEmojies;
        int size = arrayList.size();
        int i14 = 0;
        while (i14 < size) {
            String str = arrayList.get(i14);
            Emoji.EmojiDrawable emojiDrawable = Emoji.getEmojiDrawable(str);
            if (emojiDrawable != null) {
                TLRPC.Document emojiAnimatedSticker = MediaDataController.getInstance(i13).getEmojiAnimatedSticker(str);
                String j10 = i2.d.j(i14 + 3, "tab");
                int i15 = dyVar.f26445x;
                dyVar.f26445x = i15 + 1;
                by0 by0Var = (by0) dyVar.f26435n.get(j10);
                if (by0Var != null) {
                    dyVar.g(j10, by0Var, i15);
                    i11 = currentPosition;
                    z12 = z11;
                } else {
                    i11 = currentPosition;
                    z12 = z11;
                    by0Var = new by0(dyVar.getContext(), 2);
                    by0Var.setFocusable(true);
                    by0Var.setOnClickListener(new dn0(dyVar, 2));
                    by0Var.setExpanded(dyVar.f26428f0);
                    by0Var.a(dyVar.f26431i0);
                    dyVar.e.addView(by0Var, i15);
                }
                by0Var.d = false;
                by0Var.setTag(R.id.index_tag, Integer.valueOf(i15));
                by0Var.setTag(R.id.parent_tag, emojiDrawable);
                by0Var.setTag(R.id.object_tag, emojiAnimatedSticker);
                if (i15 == dyVar.f26446y) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                by0Var.setSelected(z13);
                dyVar.h.put(j10, by0Var);
                by0Var.setContentDescription(str);
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
        dyVar.h();
        dyVar.q();
        if (z10 && isEmpty) {
            dyVar.m(this.f30756s0);
            bx bxVar = this.f30742o0;
            if (bxVar != null && (hzVar = bxVar.f25825r) != null) {
                hzVar.G1(null);
                return;
            }
            return;
        }
        WeakHashMap weakHashMap = r0.i0.f43485a;
        if (dyVar.isLaidOut()) {
            if (!isEmpty && !z14) {
                dyVar.k(i16 + 1, 0);
            } else if (isEmpty && z14) {
                dyVar.k(i16 - 1, 0);
            }
        }
    }

    public final void W() {
        az azVar;
        int size = this.f30726i1.size();
        long calcDocumentsHash = MediaDataController.calcDocumentsHash(this.f30726i1, Integer.MAX_VALUE);
        ArrayList<TLRPC.Document> recentGifs = MediaDataController.getInstance(this.f30707c1).getRecentGifs();
        this.f30726i1 = recentGifs;
        long calcDocumentsHash2 = MediaDataController.calcDocumentsHash(recentGifs, Integer.MAX_VALUE);
        if ((this.f30745p0 != null && size == 0 && !this.f30726i1.isEmpty()) || (size != 0 && this.f30726i1.isEmpty())) {
            V();
        }
        if ((size != this.f30726i1.size() || calcDocumentsHash != calcDocumentsHash2) && (azVar = this.f30739n0) != null) {
            azVar.l();
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
        ix ixVar = this.B0;
        if (ixVar != null) {
            ic1 ic1Var = ixVar.e;
            if (ixVar.f26442s != null) {
                return;
            }
            this.F1 = -2;
            this.G1 = -2;
            this.H1 = -2;
            this.I1 = -2;
            this.f30712e0 = false;
            this.E1 = 0;
            int currentPosition = ixVar.getCurrentPosition();
            boolean z17 = true;
            if (getParent() != null && getVisibility() == 0 && (this.f30778y1.size() != 0 || this.f30781z1.size() != 0)) {
                z11 = true;
            } else {
                z11 = false;
            }
            ixVar.d(z11);
            int i11 = this.f30707c1;
            MediaDataController mediaDataController = MediaDataController.getInstance(i11);
            SharedPreferences emojiSettings = MessagesController.getEmojiSettings(i11);
            ArrayList arrayList3 = this.f30736m1;
            arrayList3.clear();
            ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = mediaDataController.getFeaturedStickerSets();
            int size = featuredStickerSets.size();
            for (int i12 = 0; i12 < size; i12++) {
                TLRPC.StickerSetCovered stickerSetCovered = featuredStickerSets.get(i12);
                if (!mediaDataController.isStickerPackInstalled(stickerSetCovered.set.f18943id)) {
                    arrayList3.add(stickerSetCovered);
                }
            }
            uz uzVar = this.F0;
            if (uzVar != null) {
                uzVar.l();
            }
            boolean isEmpty = featuredStickerSets.isEmpty();
            long j10 = 0;
            Drawable[] drawableArr = this.Y0;
            if (!isEmpty && (arrayList3.isEmpty() || emojiSettings.getLong("featured_hidden", 0L) == featuredStickerSets.get(0).set.f18943id)) {
                if (mediaDataController.getUnreadStickerSets().isEmpty()) {
                    i10 = 2;
                } else {
                    i10 = 3;
                }
                by0 c10 = ixVar.c(i10, drawableArr[i10]);
                c10.h.setText(LocaleController.getString(R.string.FeaturedStickersShort));
                c10.setContentDescription(LocaleController.getString(R.string.FeaturedStickers));
                int i13 = this.E1;
                this.H1 = i13;
                this.E1 = i13 + 1;
            }
            if (!this.f30732k1.isEmpty()) {
                int i14 = this.E1;
                this.G1 = i14;
                this.E1 = i14 + 1;
                by0 c11 = ixVar.c(1, drawableArr[1]);
                c11.h.setText(LocaleController.getString(R.string.FavoriteStickersShort));
                c11.setContentDescription(LocaleController.getString(R.string.FavoriteStickers));
            }
            if (!this.f30729j1.isEmpty()) {
                int i15 = this.E1;
                this.F1 = i15;
                this.E1 = i15 + 1;
                by0 c12 = ixVar.c(0, drawableArr[0]);
                c12.h.setText(LocaleController.getString(R.string.RecentStickersShort));
                c12.setContentDescription(LocaleController.getString(R.string.RecentStickers));
            }
            ArrayList arrayList4 = this.f30710d1;
            arrayList4.clear();
            org.telegram.ui.ActionBar.c6 c6Var = null;
            this.f30723h1 = null;
            this.f30717f1 = -1;
            this.f30713e1 = -10;
            if (this.G2 == null || z10) {
                this.G2 = new ArrayList(mediaDataController.getStickerSets(0));
            }
            ArrayList<TLRPC.TL_messages_stickerSet> arrayList5 = this.G2;
            int i16 = 0;
            while (true) {
                TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.f30774x1;
                if (i16 >= stickerSetCoveredArr.length) {
                    break;
                }
                TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCoveredArr[i16];
                long j11 = j10;
                if (stickerSetCovered2 != null) {
                    TLRPC.TL_messages_stickerSet stickerSetById = mediaDataController.getStickerSetById(stickerSetCovered2.set.f18943id);
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
                long j13 = MessagesController.getEmojiSettings(i11).getLong("group_hide_stickers_" + this.J1.f18917id, -1L);
                TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(this.J1.f18917id));
                if (chat != null && this.J1.stickerset != null && ChatObject.hasAdminRights(chat)) {
                    TLRPC.StickerSet stickerSet3 = this.J1.stickerset;
                    if (stickerSet3 != null) {
                        if (j13 == stickerSet3.f18943id) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        this.f30720g1 = z16;
                    }
                } else {
                    if (j13 != -1) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    this.f30720g1 = z15;
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
                        if (this.f30720g1) {
                            this.f30713e1 = arrayList4.size();
                            arrayList4.add(tL_messages_stickerSet3);
                        } else {
                            this.f30713e1 = 0;
                            arrayList4.add(0, tL_messages_stickerSet3);
                        }
                        if (!this.J1.can_set_stickers) {
                            tL_messages_stickerSet3 = null;
                        }
                        this.f30723h1 = tL_messages_stickerSet3;
                    }
                } else if (chatFull.can_set_stickers) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = new TLRPC.TL_messages_stickerSet();
                    if (this.f30720g1) {
                        this.f30713e1 = arrayList4.size();
                        arrayList4.add(tL_messages_stickerSet4);
                    } else {
                        this.f30713e1 = 0;
                        arrayList4.add(0, tL_messages_stickerSet4);
                    }
                }
            }
            int i18 = 0;
            while (i18 < arrayList4.size()) {
                if (i18 == this.f30713e1) {
                    TLRPC.Chat chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(this.J1.f18917id));
                    if (chat2 == null) {
                        arrayList4.remove(0);
                        i18--;
                    } else {
                        this.f30712e0 = z17;
                        String str = "chat" + chat2.f18916id;
                        int i19 = ixVar.f26445x;
                        ixVar.f26445x = i19 + 1;
                        by0 by0Var = (by0) ixVar.f26435n.get(str);
                        if (by0Var != null) {
                            ixVar.g(str, by0Var, i19);
                        } else {
                            by0Var = new by0(ixVar.getContext(), 0);
                            by0Var.setFocusable(z17);
                            by0Var.setOnClickListener(new dn0(ixVar, 0));
                            ic1Var.addView(by0Var, i19);
                            by0Var.f23573w = z17;
                            k9 k9Var = new k9(c6Var);
                            k9Var.u(AndroidUtilities.dp(14.0f));
                            k9Var.k(UserConfig.selectedAccount, chat2);
                            int i20 = ixVar.f26419a;
                            z9 z9Var = by0Var.e;
                            z9Var.setLayerNum(i20);
                            z9Var.e(chat2, k9Var);
                            z9Var.setAspectFit(z17);
                            by0Var.setExpanded(ixVar.f26428f0);
                            by0Var.a(ixVar.f26431i0);
                            by0Var.h.setText(chat2.title);
                        }
                        by0Var.d = z17;
                        by0Var.setTag(R.id.index_tag, Integer.valueOf(i19));
                        if (i19 == ixVar.f26446y) {
                            z14 = z17;
                        } else {
                            z14 = false;
                        }
                        by0Var.setSelected(z14);
                        ixVar.h.put(str, by0Var);
                    }
                    z12 = z17;
                } else {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet5 = (TLRPC.TL_messages_stickerSet) arrayList4.get(i18);
                    TLRPC.StickerSet stickerSet5 = tL_messages_stickerSet5.set;
                    if (stickerSet5 != null && stickerSet5.thumb_document_id != j12) {
                        for (int i21 = 0; i21 < tL_messages_stickerSet5.documents.size(); i21++) {
                            document = tL_messages_stickerSet5.documents.get(i21);
                            if (document != null && tL_messages_stickerSet5.set.thumb_document_id == document.f18922id) {
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
                    String str2 = "set" + tL_messages_stickerSet5.set.f18943id;
                    int i22 = ixVar.f26445x;
                    ixVar.f26445x = i22 + 1;
                    by0 by0Var2 = (by0) ixVar.f26435n.get(str2);
                    if (by0Var2 != null) {
                        ixVar.g(str2, by0Var2, i22);
                        z12 = z17;
                    } else {
                        by0Var2 = new by0(ixVar.getContext(), 0);
                        by0Var2.setFocusable(z17);
                        z12 = z17;
                        by0Var2.setOnClickListener(new dn0(ixVar, 1));
                        by0Var2.setExpanded(ixVar.f26428f0);
                        by0Var2.a(ixVar.f26431i0);
                        ic1Var.addView(by0Var2, i22);
                    }
                    by0Var2.e.setLayerNum(ixVar.f26419a);
                    by0Var2.d = false;
                    by0Var2.setTag(closestPhotoSizeWithSize);
                    by0Var2.setTag(R.id.index_tag, Integer.valueOf(i22));
                    by0Var2.setTag(R.id.parent_tag, tL_messages_stickerSet5);
                    by0Var2.setTag(R.id.object_tag, document);
                    if (i22 == ixVar.f26446y) {
                        z13 = z12;
                    } else {
                        z13 = false;
                    }
                    by0Var2.setSelected(z13);
                    ixVar.h.put(str2, by0Var2);
                    by0Var2.setContentDescription(tL_messages_stickerSet5.set.title + ", " + LocaleController.getString(R.string.AccDescrStickerSet));
                }
                i18++;
                z17 = z12;
                c6Var = null;
            }
            ixVar.h();
            ixVar.q();
            if (currentPosition != 0) {
                ixVar.k(currentPosition, currentPosition);
            }
            o();
        }
    }

    public final void Y() {
        boolean z10;
        int i10;
        jx jxVar = this.C0;
        ix ixVar = this.B0;
        if (ixVar != null && jxVar == null && this.f30760t1 != null) {
            ixVar.setTranslationY(this.f30760t1.p() * (-AndroidUtilities.dp(50.0f)));
        }
        if (jxVar == null) {
            return;
        }
        if (getVisibility() == 0 && this.K0 && this.f30760t1.p() != 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        jxVar.setVisibility(i10);
        if (z10) {
            Rect rect = this.f30775x2;
            rect.setEmpty();
            this.h.getChildVisibleRect(this.f30773x0, rect, null);
            float p5 = this.f30760t1.p() * AndroidUtilities.dp(50.0f);
            int i11 = rect.left;
            if (i11 != 0 || p5 != 0.0f) {
                this.X1 = false;
            }
            jxVar.setTranslationX(i11);
            float translationY = (((getTranslationY() + getTop()) - jxVar.getTop()) - ixVar.getExpandedOffset()) - p5;
            if (jxVar.getTranslationY() != translationY) {
                jxVar.setTranslationY(translationY);
                jxVar.invalidate();
            }
        }
        if (this.X1 && z10 && this.P0) {
            ixVar.i(this.W1, true);
            return;
        }
        this.X1 = false;
        ixVar.i(this.W1, false);
    }

    public final void Z() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        org.telegram.ui.Cells.s3 s3Var;
        LongSparseArray longSparseArray = this.f30781z1;
        LongSparseArray longSparseArray2 = this.f30778y1;
        int i10 = this.f30707c1;
        ex exVar = this.D0;
        if (exVar != null) {
            try {
                int childCount = exVar.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = exVar.getChildAt(i11);
                    if ((childAt instanceof org.telegram.ui.Cells.s3) && ((wl0) exVar.T(childAt)) != null) {
                        org.telegram.ui.Cells.s3 s3Var2 = (org.telegram.ui.Cells.s3) childAt;
                        ArrayList<Long> unreadStickerSets = MediaDataController.getInstance(i10).getUnreadStickerSets();
                        TLRPC.StickerSetCovered stickerSet = s3Var2.getStickerSet();
                        if (unreadStickerSets != null && unreadStickerSets.contains(Long.valueOf(stickerSet.set.f18943id))) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        int i12 = 0;
                        while (true) {
                            TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.f30774x1;
                            if (i12 < stickerSetCoveredArr.length) {
                                TLRPC.StickerSetCovered stickerSetCovered = stickerSetCoveredArr[i12];
                                if (stickerSetCovered != null) {
                                    s3Var = s3Var2;
                                    if (stickerSetCovered.set.f18943id == stickerSet.set.f18943id) {
                                        s3Var2 = s3Var;
                                        z11 = true;
                                        break;
                                    }
                                } else {
                                    s3Var = s3Var2;
                                }
                                i12++;
                                s3Var2 = s3Var;
                            } else {
                                z11 = false;
                                break;
                            }
                        }
                        s3Var2.c(stickerSet, z10, true, 0, 0, z11);
                        if (z10) {
                            MediaDataController.getInstance(i10).markFeaturedStickersByIdAsRead(false, stickerSet.set.f18943id);
                        }
                        if (longSparseArray2.indexOfKey(stickerSet.set.f18943id) >= 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (longSparseArray.indexOfKey(stickerSet.set.f18943id) >= 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z12 || z13) {
                            if (z12 && s3Var2.f21637r) {
                                longSparseArray2.remove(stickerSet.set.f18943id);
                                z12 = false;
                            } else if (z13 && !s3Var2.f21637r) {
                                longSparseArray.remove(stickerSet.set.f18943id);
                            }
                        }
                        if (!z11 && z12) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        s3Var2.b(z14, true);
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
        this.f30750q2 = f7;
        R();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        Utilities.Callback callback;
        TLRPC.StickerSet stickerSet;
        int i12 = NotificationCenter.stickersDidLoad;
        fy fyVar = this.R;
        pw pwVar = this.L2;
        if (i10 == i12) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (this.f30777y0 != null) {
                    X(((Boolean) objArr[1]).booleanValue());
                    Z();
                    E();
                    o();
                }
            } else if (((Integer) objArr[0]).intValue() == 5) {
                if (((Boolean) objArr[1]).booleanValue()) {
                    AndroidUtilities.cancelRunOnUIThread(pwVar);
                    AndroidUtilities.runOnUIThread(pwVar, 100L);
                    return;
                }
                fyVar.F(false);
            }
        } else if (i10 == NotificationCenter.groupPackUpdated) {
            long longValue = ((Long) objArr[0]).longValue();
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            TLRPC.ChatFull chatFull = this.J1;
            if (chatFull != null && chatFull.f18917id == longValue && booleanValue) {
                fyVar.F(true);
            }
        } else if (i10 == NotificationCenter.recentDocumentsDidLoad) {
            boolean booleanValue2 = ((Boolean) objArr[0]).booleanValue();
            int intValue = ((Integer) objArr[1]).intValue();
            if (booleanValue2 || intValue == 0 || intValue == 2) {
                k(booleanValue2);
            }
        } else if (i10 == NotificationCenter.featuredStickersDidLoad) {
            Z();
            de0 de0Var = this.f30768w;
            if (de0Var != null) {
                int childCount = de0Var.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    de0Var.getChildAt(i13).invalidate();
                }
            }
            X(false);
        } else if (i10 == NotificationCenter.featuredEmojiDidLoad) {
            if (fyVar != null) {
                fyVar.F(false);
            }
        } else {
            int i14 = NotificationCenter.groupStickersDidLoad;
            vy vyVar = this.S;
            if (i10 == i14) {
                Long l4 = (Long) objArr[0];
                long longValue2 = l4.longValue();
                if (objArr.length > 1) {
                    tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) objArr[1];
                } else {
                    tL_messages_stickerSet = null;
                }
                if (tL_messages_stickerSet != null) {
                    rz rzVar = this.f30780z0;
                    if (rzVar != null && rzVar.d == longValue2 && rzVar.f28665f.size() < tL_messages_stickerSet.documents.size()) {
                        rzVar.f28665f = tL_messages_stickerSet.documents;
                        rzVar.l();
                    }
                    if (vyVar != null && vyVar.d == longValue2 && vyVar.f30341f.size() < tL_messages_stickerSet.documents.size()) {
                        vyVar.f30341f = tL_messages_stickerSet.documents;
                        vyVar.l();
                    }
                }
                TLRPC.ChatFull chatFull2 = this.J1;
                if (chatFull2 != null && (stickerSet = chatFull2.stickerset) != null && stickerSet.f18943id == longValue2) {
                    X(false);
                }
                HashMap hashMap = this.f30753r1;
                if (hashMap.containsKey(l4) && objArr.length >= 2 && ((Utilities.Callback) hashMap.get(l4)) != null && tL_messages_stickerSet != null && (callback = (Utilities.Callback) hashMap.remove(l4)) != null) {
                    callback.run(tL_messages_stickerSet);
                }
                AndroidUtilities.cancelRunOnUIThread(pwVar);
                AndroidUtilities.runOnUIThread(pwVar, 100L);
                return;
            }
            int i15 = NotificationCenter.emojiLoaded;
            iy iyVar = this.P;
            if (i10 == i15) {
                ex exVar = this.D0;
                if (exVar != null) {
                    int childCount2 = exVar.getChildCount();
                    for (int i16 = 0; i16 < childCount2; i16++) {
                        View childAt = exVar.getChildAt(i16);
                        if ((childAt instanceof org.telegram.ui.Cells.o8) || (childAt instanceof org.telegram.ui.Cells.f8)) {
                            childAt.invalidate();
                        }
                    }
                }
                if (iyVar != null) {
                    iyVar.invalidate();
                    int childCount3 = iyVar.getChildCount();
                    for (int i17 = 0; i17 < childCount3; i17++) {
                        View childAt2 = iyVar.getChildAt(i17);
                        if (childAt2 instanceof ez) {
                            childAt2.invalidate();
                        }
                    }
                }
                jv jvVar = this.B1;
                if (jvVar != null) {
                    jvVar.f26139c.invalidate();
                }
                dy dyVar = this.f30745p0;
                if (dyVar != null) {
                    ic1 ic1Var = dyVar.e;
                    int childCount4 = ic1Var.getChildCount();
                    for (int i18 = 0; i18 < childCount4; i18++) {
                        ic1Var.getChildAt(i18).invalidate();
                    }
                }
            } else if (i10 == NotificationCenter.newEmojiSuggestionsAvailable) {
                if (iyVar != null && this.f30709d0) {
                    if ((this.V.f25822c.f31605k == 2 || iyVar.getAdapter() == vyVar) && !TextUtils.isEmpty(vyVar.v)) {
                        vyVar.F(vyVar.v, true);
                    }
                }
            } else if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                if (fyVar != null) {
                    fyVar.F(false);
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
            if (this.f30738n.getVisibility() != 8 && !this.f30762u0 && this.f30769w0) {
                canvas.drawColor(i0.a.k(-1, 25));
            }
            boolean drawChild = super.drawChild(canvas, view, j10);
            float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(this.f30747p2);
            if (navigationBarThirdButtonsFactor > 0.0f) {
                int m12 = org.telegram.ui.ActionBar.g6.m1(navigationBarThirdButtonsFactor, B(org.telegram.ui.ActionBar.g6.He));
                int i10 = this.B2;
                GradientDrawable gradientDrawable = this.A2;
                if (i10 != m12) {
                    gradientDrawable.setColors(new int[]{m12, org.telegram.ui.ActionBar.g6.m1(0.66f, m12), i0.a.k(m12, 0)});
                    this.B2 = m12;
                }
                gradientDrawable.setBounds(0, getMeasuredHeight() - this.f30747p2, getMeasuredWidth(), getMeasuredHeight());
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

    public ArrayList<jy> getEmojipacks() {
        ArrayList<jy> arrayList = new ArrayList<>();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f30749q1;
            if (i10 < arrayList2.size()) {
                jy jyVar = (jy) arrayList2.get(i10);
                boolean z10 = jyVar.f26154g;
                ArrayList arrayList3 = this.f30746p1;
                if ((!z10 && (jyVar.f26153f || arrayList3.contains(Long.valueOf(jyVar.f26151b.f18943id)))) || (jyVar.f26154g && !jyVar.f26153f && !arrayList3.contains(Long.valueOf(jyVar.f26151b.f18943id)))) {
                    arrayList.add(jyVar);
                }
                i10++;
            } else {
                return arrayList;
            }
        }
    }

    public ArrayList<String> getRecentEmoji() {
        if (this.f30708c2) {
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
        ix ixVar = this.B0;
        if (ixVar == null) {
            return 0.0f;
        }
        return ixVar.getExpandedOffset();
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
                if (!this.f30708c2) {
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
        sx sxVar = new sx(getContext(), i11);
        sxVar.f44979a = !z10 ? 1 : 0;
        x(i10).w0(sxVar);
    }

    public final void k(boolean z10) {
        if (z10) {
            W();
            return;
        }
        int size = this.f30729j1.size();
        int size2 = this.f30732k1.size();
        int i10 = this.f30707c1;
        this.f30729j1 = MediaDataController.getInstance(i10).getRecentStickers(0, true);
        this.f30732k1 = MediaDataController.getInstance(i10).getRecentStickers(2);
        if (UserConfig.getInstance(i10).isPremium()) {
            this.l1 = MediaDataController.getInstance(i10).getRecentStickers(7);
        } else {
            this.l1 = new ArrayList();
        }
        for (int i11 = 0; i11 < this.f30732k1.size(); i11++) {
            TLRPC.Document document = (TLRPC.Document) this.f30732k1.get(i11);
            int i12 = 0;
            while (true) {
                if (i12 < this.f30729j1.size()) {
                    TLRPC.Document document2 = (TLRPC.Document) this.f30729j1.get(i12);
                    if (document2.dc_id == document.dc_id && document2.f18922id == document.f18922id) {
                        this.f30729j1.remove(i12);
                        break;
                    }
                    i12++;
                }
            }
        }
        if (MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            int i13 = 0;
            while (i13 < this.f30732k1.size()) {
                if (MessageObject.isPremiumSticker((TLRPC.Document) this.f30732k1.get(i13))) {
                    this.f30732k1.remove(i13);
                    i13--;
                }
                i13++;
            }
            int i14 = 0;
            while (i14 < this.f30729j1.size()) {
                if (MessageObject.isPremiumSticker((TLRPC.Document) this.f30729j1.get(i14))) {
                    this.f30729j1.remove(i14);
                    i14--;
                }
                i14++;
            }
        }
        if (size != this.f30729j1.size() || size2 != this.f30732k1.size()) {
            X(false);
        }
        mz mzVar = this.f30777y0;
        if (mzVar != null) {
            mzVar.l();
        }
        o();
    }

    public final void l(boolean z10) {
        int i10;
        boolean z11;
        wy wyVar = this.f30760t1;
        ne.b bVar = this.f30701b;
        iy iyVar = this.P;
        vw vwVar = this.V;
        if (wyVar != null && wyVar.z()) {
            s4.b1 K = iyVar.K(0);
            if (K == null) {
                iz.a(vwVar, true, !z10);
            } else {
                if (K.f44838a.getTop() < iyVar.getPaddingTop()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                iz.a(vwVar, z11, !z10);
            }
            N(false, !z10);
            vwVar.setTranslationY(bVar.e * AndroidUtilities.dp(15.0f));
        } else if (vwVar != null && iyVar != null) {
            s4.b1 K2 = iyVar.K(0);
            if (K2 != null) {
                i10 = K2.f44838a.getTop();
            } else {
                i10 = -this.f30703b1;
            }
            vwVar.setTranslationY((bVar.e * AndroidUtilities.dp(15.0f)) + i10);
            vwVar.f25820a.a(false, !z10);
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
        if (dp > 0 && (K == null || K.f44838a.getBottom() < dp)) {
            z10 = true;
        }
        N(z10, !this.K1);
    }

    public final void n(int i10, View view) {
        iy iyVar;
        s4.b1 K;
        int i11;
        zx zxVar = this.I;
        int[] iArr = this.Q0;
        if (view == null) {
            iArr[1] = 0;
            zxVar.setTranslationY(0);
        } else if (view.getVisibility() == 0 && !this.f30716f0) {
            wy wyVar = this.f30760t1;
            if (wyVar == null || !wyVar.z()) {
                if (i10 > 0 && (iyVar = this.P) != null && iyVar.getVisibility() == 0 && (K = iyVar.K(0)) != null) {
                    int top = K.f44838a.getTop();
                    if (this.f30709d0) {
                        i11 = this.f30703b1;
                    } else {
                        i11 = 0;
                    }
                    if (top + i11 >= iyVar.getPaddingTop()) {
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
                zxVar.setTranslationY(Math.max(-AndroidUtilities.dp(36.0f), iArr[1]));
            }
        }
    }

    public final void o() {
        int L0;
        ix ixVar = this.B0;
        if (ixVar != null && (L0 = this.E0.L0()) != -1) {
            int i10 = this.G1;
            if (i10 <= 0 && (i10 = this.F1) <= 0) {
                i10 = this.E1;
            }
            ixVar.k(this.f30777y0.F(L0), i10);
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
        NotificationCenter.ObserversGroup add = NotificationCenter.getInstance(this.f30707c1).createWeakObserversGroup(this).addGlobal(NotificationCenter.emojiLoaded).add(NotificationCenter.newEmojiSuggestionsAvailable).add(NotificationCenter.groupPackUpdated);
        this.I2 = add;
        if (this.f30777y0 != null) {
            add.add(NotificationCenter.stickersDidLoad).add(NotificationCenter.recentDocumentsDidLoad).add(NotificationCenter.featuredStickersDidLoad).add(NotificationCenter.groupStickersDidLoad).add(NotificationCenter.currentUserPremiumStatusChanged);
            AndroidUtilities.runOnUIThread(new pw(this, 0));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jv jvVar = this.B1;
        if (jvVar != null && jvVar.isShowing()) {
            jvVar.dismiss();
        }
        org.telegram.ui.xt q6 = org.telegram.ui.xt.q();
        if (q6.f41647l == this.f30721g2) {
            q6.W = null;
            q6.f41635a0 = null;
            q6.Y = null;
            q6.f41647l = null;
            q6.f41639c0 = null;
            q6.u();
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        if (this.O1 != i14) {
            this.O1 = i14;
            E();
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
        boolean z11 = this.f30709d0;
        if (!z10 && !this.N1) {
            if (this.L1 != 0) {
                if (!this.H2) {
                    setOutlineProvider(null);
                    setClipToOutline(false);
                    setElevation(0.0f);
                }
                if (this.f30762u0) {
                    int i12 = org.telegram.ui.ActionBar.g6.He;
                    setBackgroundColor(B(i12));
                    if (z11) {
                        view.setBackgroundColor(B(i12));
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
            int i13 = org.telegram.ui.ActionBar.g6.He;
            background.setColorFilter(new PorterDuffColorFilter(B(i13), PorterDuff.Mode.MULTIPLY));
            if (z11 && this.f30762u0) {
                view.setBackgroundColor(B(i13));
            }
            this.L1 = 1;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
        this.K1 = false;
        setTranslationY(getTranslationY());
    }

    @Override
    public final void p(int i10, float f7, float f10, ne.e eVar) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = 4;
        if (i10 == 0) {
            r(false);
            float f11 = 1.0f - this.f30698a.e;
            hx hxVar = this.G0;
            hxVar.setAlpha(f11);
            if (f11 > 0.0f) {
                i13 = 0;
            } else {
                i13 = 4;
            }
            hxVar.setVisibility(i13);
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
            this.f30773x0.invalidate();
        } else if (i10 == 1) {
            l(false);
            float f13 = 1.0f - this.f30701b.e;
            vw vwVar = this.V;
            vwVar.setAlpha(f13);
            if (f13 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            vwVar.setVisibility(i11);
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

    public final void q(int i10) {
        int L0;
        int i11;
        int L02;
        if (i10 == 0) {
            if (!this.J0 && (L02 = this.E0.L0()) != -1 && this.D0 != null) {
                int i12 = this.G1;
                if (i12 <= 0 && (i12 = this.F1) <= 0) {
                    i12 = this.E1;
                }
                this.B0.k(this.f30777y0.F(L02), i12);
            }
        } else if (i10 == 2) {
            s4.g0 adapter = this.f30722h0.getAdapter();
            az azVar = this.f30739n0;
            if (adapter == azVar && azVar.I >= 0 && this.f30756s0 >= 0 && this.f30752r0 >= 0 && (L0 = this.f30725i0.L0()) != -1) {
                if (L0 >= azVar.I) {
                    i11 = this.f30756s0;
                } else {
                    i11 = this.f30752r0;
                }
                this.f30745p0.k(i11, 0);
            }
        }
    }

    public final void r(boolean z10) {
        int i10;
        wy wyVar = this.f30760t1;
        ne.b bVar = this.f30698a;
        ex exVar = this.D0;
        boolean z11 = false;
        hx hxVar = this.G0;
        if (wyVar != null && wyVar.z()) {
            s4.b1 K = exVar.K(0);
            if (K == null) {
                iz.a(hxVar, true, !z10);
            } else {
                if (K.f44838a.getTop() < exVar.getPaddingTop()) {
                    z11 = true;
                }
                iz.a(hxVar, z11, !z10);
            }
            hxVar.setTranslationY(bVar.e * AndroidUtilities.dp(15.0f));
        } else if (hxVar != null && exVar != null) {
            s4.b1 K2 = exVar.K(0);
            if (K2 != null) {
                i10 = K2.f44838a.getTop();
            } else {
                i10 = -this.f30703b1;
            }
            hxVar.setTranslationY((bVar.e * AndroidUtilities.dp(15.0f)) + i10);
            hxVar.f25820a.a(false, !z10);
        }
    }

    @Override
    public final void requestLayout() {
        if (this.K1) {
            return;
        }
        super.requestLayout();
    }

    public final void s() {
        Emoji.clearRecentEmoji();
        this.R.F(false);
    }

    public void setBlurredBackgroundDrawableFactory(bh.b bVar) {
        org.telegram.ui.ActionBar.c6 c6Var = this.Z1;
        View view = this.f30772x;
        if (view != null) {
            dh.d c10 = bVar.c(view, null, false);
            c10.o(fh.b.d(c6Var));
            c10.q(AndroidUtilities.dp(18.0f));
            c10.p(AndroidUtilities.dp(6.0f));
            view.setBackground(c10);
        }
        View view2 = this.E;
        if (view2 != null) {
            dh.d c11 = bVar.c(view2, null, false);
            c11.o(fh.b.d(c6Var));
            c11.q(AndroidUtilities.dp(18.0f));
            c11.p(AndroidUtilities.dp(6.0f));
            view2.setBackground(c11);
        }
        View view3 = this.f30768w;
        if (view3 != null) {
            dh.d c12 = bVar.c(view3, null, false);
            c12.o(fh.b.d(c6Var));
            c12.q(AndroidUtilities.dp(18.0f));
            c12.p(AndroidUtilities.dp(6.0f));
            view3.setBackground(c12);
        }
        View view4 = this.f30776y;
        if (view4 != null) {
            dh.d c13 = bVar.c(view4, null, false);
            c13.o(fh.b.d(c6Var));
            c13.q(AndroidUtilities.dp(18.0f));
            c13.p(AndroidUtilities.dp(6.0f));
            view4.setBackground(c13);
        }
    }

    public void setBottomInset(int i10) {
        if (this.f30747p2 != i10) {
            this.f30747p2 = i10;
            j(i10, this.K);
            j(i10, this.M);
            j(AndroidUtilities.dp(44.0f) + i10, this.P);
            j(AndroidUtilities.dp(44.0f) + i10, this.D0);
            j(AndroidUtilities.dp(44.0f) + i10, this.f30722h0);
            FrameLayout frameLayout = this.f30755s;
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

    public void setDelegate(wy wyVar) {
        this.f30760t1 = wyVar;
    }

    public void setDragListener(cy cyVar) {
        this.O0 = cyVar;
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        hx hxVar = this.G0;
        if (hxVar != null) {
            hxVar.d.setEnabled(z10);
        }
        bx bxVar = this.f30742o0;
        if (bxVar != null) {
            bxVar.d.setEnabled(z10);
        }
        vw vwVar = this.V;
        if (vwVar != null) {
            vwVar.d.setEnabled(z10);
        }
    }

    public void setForseMultiwindowLayout(boolean z10) {
        this.N1 = z10;
    }

    public void setShouldDrawBackground(boolean z10) {
        if (this.f30762u0 != z10) {
            this.f30762u0 = z10;
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
                int i11 = this.f30707c1;
                NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.stickersDidLoad);
                if (this.f30777y0 != null) {
                    NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.recentDocumentsDidLoad);
                    X(false);
                    E();
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

    public final void t(long j10, boolean z10) {
        iz izVar;
        s4.b0 b0Var;
        View view;
        View view2;
        int i10;
        int i11;
        TLRPC.TL_messages_stickerSet stickerSetById;
        mz mzVar;
        int E;
        AnimatorSet animatorSet = this.M0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.M0 = null;
        }
        int currentItem = this.h.getCurrentItem();
        int i12 = 2;
        if (currentItem == 2 && j10 != -1 && (stickerSetById = MediaDataController.getInstance(this.f30707c1).getStickerSetById(j10)) != null && (E = (mzVar = this.f30777y0).E(stickerSetById)) >= 0 && E < mzVar.h()) {
            H(E, AndroidUtilities.dp(48.0f));
        }
        int i13 = 0;
        az azVar = this.f30728j0;
        if (azVar != null) {
            azVar.K = false;
        }
        int i14 = 0;
        while (i14 < 3) {
            View view3 = this.D0;
            View view4 = this.f30722h0;
            bx bxVar = this.f30742o0;
            View view5 = this.P;
            if (i14 == 0) {
                izVar = this.V;
                b0Var = this.Q;
                view = this.I;
                view2 = view5;
            } else if (i14 == 1) {
                b0Var = this.f30725i0;
                view = this.f30745p0;
                view2 = view4;
                izVar = bxVar;
            } else {
                izVar = this.G0;
                b0Var = this.E0;
                view = this.B0;
                view2 = view3;
            }
            if (izVar == null) {
                i11 = i13;
                i10 = i12;
            } else {
                int i15 = i13;
                hz hzVar = izVar.f25825r;
                int i16 = i12;
                izVar.d.setText("");
                if (hzVar != null) {
                    hzVar.G1(null);
                    hzVar.E1();
                }
                int i17 = this.f30703b1;
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
                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(izVar, property, fArr3);
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
                    this.M0.setInterpolator(es.h);
                    this.M0.addListener(new bi.m4(this, b0Var, view2, 5));
                    this.M0.start();
                    i11 = i15;
                    i10 = i16;
                } else {
                    if (izVar != bxVar) {
                        izVar.setTranslationY(AndroidUtilities.dp(36.0f) - i17);
                    }
                    i10 = i16;
                    if (view != null && i14 != i10) {
                        view.setTranslationY(0.0f);
                    }
                    if (view2 == view3) {
                        i11 = i15;
                        view2.setPadding(i11, AndroidUtilities.dp(36.0f), i11, AndroidUtilities.dp(44.0f) + this.f30747p2);
                    } else {
                        i11 = i15;
                        if (view2 == view4) {
                            view2.setPadding(i11, AndroidUtilities.dp(40.0f), i11, AndroidUtilities.dp(44.0f) + this.f30747p2);
                        } else {
                            if (view2 == view5) {
                                view2.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f) + this.f30747p2);
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
            this.f30760t1.i(i18);
        }
    }

    public final void u(boolean z10) {
        t(-1L, z10);
    }

    public final void v(boolean z10) {
        mz mzVar;
        boolean z11 = this.N2;
        this.N2 = z10;
        if (z11 && !z10) {
            int i10 = this.A1;
            if (i10 == 0) {
                fy fyVar = this.R;
                if (fyVar != null) {
                    fyVar.F(false);
                }
            } else if (i10 == 1) {
                az azVar = this.f30739n0;
                if (azVar != null) {
                    azVar.l();
                }
            } else if (i10 == 2 && (mzVar = this.f30777y0) != null) {
                mzVar.l();
            }
        }
    }

    public final int w(float f7) {
        return i0.a.k(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Wk, this.Z1), (int) (f7 * 255.0f));
    }

    public final s4.s x(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return this.f30725i0;
                }
                throw new IllegalArgumentException(i2.d.j(i10, "Unexpected argument: "));
            }
            return this.Q;
        }
        return this.E0;
    }

    public final mm0 y(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return this.f30722h0;
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
                    return this.f30745p0;
                }
                throw new IllegalArgumentException(i2.d.j(i10, "Unexpected argument: "));
            }
            return this.I;
        }
        return this.B0;
    }

    @Override
    public final void A(float f7, int i10) {
    }
}
