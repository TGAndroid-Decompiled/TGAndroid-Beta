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
import java.util.HashSet;
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
import org.telegram.ui.ua1;
public class rz extends FrameLayout implements org.telegram.ui.ActionBar.b6, ne.d, NotificationCenter.NotificationCenterDelegate, qh.a {
    public static final int U2 = 0;
    public final nw A0;
    public int A1;
    public final ArrayList A2;
    public final cx B0;
    public final cv B1;
    public final GradientDrawable B2;
    public final dx C0;
    public final int C1;
    public int C2;
    public final yw D0;
    public final int[] D1;
    public ArrayList D2;
    public final ImageView E;
    public final zw E0;
    public int E1;
    public int E2;
    public AnimatorSet F;
    public pz F0;
    public int F1;
    public long F2;
    public AnimatorSet G;
    public final bx G0;
    public int G1;
    public final ne.b G2;
    public float H;
    public final oh.d H0;
    public int H1;
    public ArrayList H2;
    public final tx I;
    public boolean I0;
    public int I1;
    public Drawable I2;
    public final ox J;
    public boolean J0;
    public TLRPC.ChatFull J1;
    public int J2;
    public final ah.v K;
    public boolean K0;
    public boolean K1;
    public int K2;
    public final oh.b L;
    public final jy L0;
    public int L1;
    public int L2;
    public final ah.v M;
    public AnimatorSet M0;
    public final ci.s4 M1;
    public int M2;
    public final oh.b N;
    public final ai.wd N0;
    public boolean N1;
    public boolean N2;
    public final View O;
    public vx O0;
    public int O1;
    public NotificationCenter.ObserversGroup O2;
    public final cy P;
    public boolean P0;
    public boolean P1;
    public AnimatorSet P2;
    public final px Q;
    public final int[] Q0;
    public boolean Q1;
    public e2.n0 Q2;
    public final yx R;
    public final ObjectAnimator[] R0;
    public az R1;
    public final jw R2;
    public final ry S;
    public boolean S0;
    public float S1;
    public boolean S2;
    public pz T;
    public hg.f1 T0;
    public float T1;
    public boolean T2;
    public final oh.d U;
    public boolean U0;
    public float U1;
    public final pw V;
    public boolean V0;
    public float V1;
    public AnimatorSet W;
    public String[] W0;
    public float W1;
    public final Drawable[] X0;
    public boolean X1;
    public final Drawable[] Y0;
    public final org.telegram.ui.ActionBar.o2 Y1;
    public final Drawable[] Z0;
    public final org.telegram.ui.ActionBar.g6 Z1;
    public final ne.b f30301a;
    public final ol0 f30302a0;
    public final String[] f30303a1;
    public final org.telegram.ui.ActionBar.w5 a2;
    public final ne.b f30304b;
    public final ol0 f30305b0;
    public final int f30306b1;
    public final org.telegram.ui.ActionBar.w5 f30307b2;
    public int f30308c;
    public boolean f30309c0;
    public final int f30310c1;
    public final boolean f30311c2;
    public final ArrayList d;
    public final boolean f30312d0;
    public final ArrayList f30313d1;
    public LongSparseArray f30314d2;
    public final ArrayList e;
    public boolean f30315e0;
    public int f30316e1;
    public PorterDuffColorFilter f30317e2;
    public boolean f30318f;
    public boolean f30319f0;
    public int f30320f1;
    public final org.telegram.ui.Cells.u5 f30321f2;
    public final rw f30322g0;
    public boolean f30323g1;
    public final jx f30324g2;
    public final ex h;
    public final sw f30325h0;
    public TLRPC.TL_messages_stickerSet f30326h1;
    public boolean f30327h2;
    public final xy f30328i0;
    public ArrayList f30329i1;
    public final boolean f30330i2;
    public final wy f30331j0;
    public ArrayList f30332j1;
    public final bh.f f30333j2;
    public final zy f30334k0;
    public ArrayList f30335k1;
    public final ih f30336k2;
    public final HashMap f30337l0;
    public ArrayList l1;
    public final gh.c f30338l2;
    public final nw m0;
    public final ArrayList f30339m1;
    public final bh.b f30340m2;
    public final FrameLayout f30341n;
    public final wy f30342n0;
    public final ArrayList f30343n1;
    public final ni.e f30344n2;
    public final vw f30345o0;
    public final ArrayList f30346o1;
    public boolean f30347o2;
    public final wx f30348p0;
    public final ArrayList f30349p1;
    public boolean f30350p2;
    public boolean f30351q0;
    public final ArrayList f30352q1;
    public int f30353q2;
    public final FrameLayout f30354r;
    public int f30355r0;
    public final HashMap f30356r1;
    public float f30357r2;
    public final FrameLayout f30358s;
    public int f30359s0;
    public final Paint f30360s1;
    public View f30361s2;
    public int f30362t0;
    public sy f30363t1;
    public int f30364t2;
    public boolean f30365u0;
    public long f30366u1;
    public int f30367u2;
    public final View v;
    public boolean f30368v0;
    public boolean f30369v1;
    public long f30370v2;
    public final yd0 f30371w;
    public boolean f30372w0;
    public boolean f30373w1;
    public boolean f30374w2;
    public final fx f30375x;
    public final ww f30376x0;
    public final TLRPC.StickerSetCovered[] f30377x1;
    public boolean f30378x2;
    public final ImageView f30379y;
    public final iz f30380y0;
    public final LongSparseArray f30381y1;
    public final Rect f30382y2;
    public final mz f30383z0;
    public final LongSparseArray f30384z1;
    public final RectF f30385z2;

    public rz(org.telegram.ui.ActionBar.o2 o2Var, boolean z10, boolean z11, boolean z12, Context context, boolean z13, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z14, final org.telegram.ui.ActionBar.g6 g6Var, boolean z15, boolean z16) {
        super(context);
        org.telegram.ui.ActionBar.w5 w5Var;
        int A;
        int i10;
        jw jwVar;
        boolean z17;
        ox oxVar;
        int i11;
        Context context2;
        final org.telegram.ui.ActionBar.g6 g6Var2;
        ni.e eVar;
        yx yxVar;
        int i12;
        boolean z18;
        int i13;
        boolean z19;
        Field field;
        zr zrVar = zr.h;
        this.f30301a = new ne.b(0, this, zrVar, 320L, false);
        this.f30304b = new ne.b(1, this, zrVar, 320L, false);
        this.f30308c = 2;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.e = new ArrayList();
        this.f30309c0 = true;
        this.f30334k0 = new zy(this);
        this.f30337l0 = new HashMap();
        this.f30351q0 = true;
        this.f30355r0 = -2;
        this.f30359s0 = -2;
        this.f30362t0 = -2;
        this.f30365u0 = true;
        this.f30372w0 = true;
        this.I0 = true;
        this.Q0 = new int[3];
        this.R0 = new ObjectAnimator[3];
        int i14 = UserConfig.selectedAccount;
        this.f30310c1 = i14;
        this.f30313d1 = new ArrayList();
        this.f30329i1 = new ArrayList();
        this.f30332j1 = new ArrayList();
        this.f30335k1 = new ArrayList();
        this.l1 = new ArrayList();
        this.f30339m1 = new ArrayList();
        this.f30343n1 = new ArrayList();
        new ArrayList();
        this.f30346o1 = new ArrayList();
        this.f30349p1 = new ArrayList();
        this.f30352q1 = new ArrayList();
        this.f30356r1 = new HashMap();
        this.f30377x1 = new TLRPC.StickerSetCovered[10];
        this.f30381y1 = new LongSparseArray();
        this.f30384z1 = new LongSparseArray();
        this.D1 = new int[2];
        this.F1 = -2;
        this.G1 = -2;
        this.H1 = -2;
        this.I1 = -2;
        this.L1 = -1;
        this.f30321f2 = new org.telegram.ui.Cells.u5(this, 12);
        this.f30324g2 = new jx(this);
        this.f30327h2 = true;
        ni.e eVar2 = new ni.e();
        this.f30344n2 = eVar2;
        this.f30357r2 = -1.0f;
        this.f30364t2 = -1;
        this.f30367u2 = -1;
        this.f30370v2 = -1L;
        this.f30374w2 = false;
        this.f30378x2 = true;
        this.f30382y2 = new Rect();
        RectF rectF = new RectF();
        this.f30385z2 = rectF;
        ArrayList arrayList2 = new ArrayList(1);
        this.A2 = arrayList2;
        arrayList2.add(rectF);
        this.B2 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.G2 = new ne.b(0, new kw(this, 3), zrVar, 380L, true);
        this.R2 = new jw(this, 1);
        this.S2 = false;
        this.f30365u0 = z14;
        this.Y1 = o2Var;
        this.f30311c2 = z10;
        this.Z1 = g6Var;
        this.f30330i2 = z16;
        gh.c cVar = new gh.c();
        this.f30338l2 = cVar;
        cVar.a(A(org.telegram.ui.ActionBar.k6.f21184d6));
        if (z15) {
            v(true);
        }
        i0.a.o(A(org.telegram.ui.ActionBar.k6.Wk), 30);
        int dp = AndroidUtilities.dp(50.0f);
        this.f30306b1 = dp;
        this.f30312d0 = z13;
        this.X0 = new Drawable[]{org.telegram.ui.ActionBar.k6.V(context, R.drawable.smiles_tab_smiles, z16 ? w(0.4f) : A(org.telegram.ui.ActionBar.k6.Re), z16 ? w(0.8f) : A(org.telegram.ui.ActionBar.k6.Oe)), org.telegram.ui.ActionBar.k6.V(context, R.drawable.smiles_tab_gif, z16 ? w(0.4f) : A(org.telegram.ui.ActionBar.k6.Re), z16 ? w(0.8f) : A(org.telegram.ui.ActionBar.k6.Oe)), org.telegram.ui.ActionBar.k6.V(context, R.drawable.smiles_tab_stickers, z16 ? w(0.4f) : A(org.telegram.ui.ActionBar.k6.Re), z16 ? w(0.8f) : A(org.telegram.ui.ActionBar.k6.Oe))};
        org.telegram.ui.ActionBar.w5 V = org.telegram.ui.ActionBar.k6.V(context, R.drawable.msg_emoji_recent, z16 ? w(0.4f) : A(org.telegram.ui.ActionBar.k6.Me), z16 ? w(0.8f) : A(org.telegram.ui.ActionBar.k6.Oe));
        org.telegram.ui.ActionBar.w5 V2 = org.telegram.ui.ActionBar.k6.V(context, R.drawable.emoji_tabs_faves, z16 ? w(0.4f) : A(org.telegram.ui.ActionBar.k6.Me), z16 ? w(0.8f) : A(org.telegram.ui.ActionBar.k6.Oe));
        org.telegram.ui.ActionBar.w5 V3 = org.telegram.ui.ActionBar.k6.V(context, R.drawable.emoji_tabs_new3, z16 ? w(0.4f) : A(org.telegram.ui.ActionBar.k6.Me), z16 ? w(0.8f) : A(org.telegram.ui.ActionBar.k6.Oe));
        int i15 = R.drawable.emoji_tabs_new1;
        if (z16) {
            w5Var = V3;
            A = w(0.4f);
        } else {
            w5Var = V3;
            A = A(org.telegram.ui.ActionBar.k6.Me);
        }
        org.telegram.ui.ActionBar.w5 V4 = org.telegram.ui.ActionBar.k6.V(context, i15, A, z16 ? w(0.8f) : A(org.telegram.ui.ActionBar.k6.Oe));
        this.a2 = V4;
        int i16 = R.drawable.emoji_tabs_new2;
        int i17 = org.telegram.ui.ActionBar.k6.Qe;
        org.telegram.ui.ActionBar.w5 V5 = org.telegram.ui.ActionBar.k6.V(context, i16, A(i17), A(i17));
        this.f30307b2 = V5;
        this.Y0 = new Drawable[]{V, V2, w5Var, new LayerDrawable(new Drawable[]{V4, V5})};
        this.Z0 = new Drawable[]{org.telegram.ui.ActionBar.k6.V(context, R.drawable.msg_emoji_recent, z16 ? w(0.4f) : A(org.telegram.ui.ActionBar.k6.Me), z16 ? w(0.8f) : A(org.telegram.ui.ActionBar.k6.Oe)), org.telegram.ui.ActionBar.k6.V(context, R.drawable.stickers_gifs_trending, z16 ? w(0.4f) : A(org.telegram.ui.ActionBar.k6.Me), z16 ? w(0.8f) : A(org.telegram.ui.ActionBar.k6.Oe))};
        this.f30303a1 = new String[]{LocaleController.getString(R.string.Emoji1), LocaleController.getString(R.string.Emoji2), LocaleController.getString(R.string.Emoji3), LocaleController.getString(R.string.Emoji4), LocaleController.getString(R.string.Emoji5), LocaleController.getString(R.string.Emoji6), LocaleController.getString(R.string.Emoji7), LocaleController.getString(R.string.Emoji8)};
        this.J1 = chatFull;
        Paint paint = new Paint(1);
        this.f30360s1 = paint;
        paint.setColor(A(org.telegram.ui.ActionBar.k6.f21134af));
        ci.n1 n1Var = zf.j0.f52046a;
        this.M1 = new ci.s4(AndroidUtilities.dp(6.0f));
        ox oxVar2 = new ox(this, context);
        this.J = oxVar2;
        ?? obj = new Object();
        obj.f29080a = 0;
        obj.f29081b = oxVar2;
        arrayList.add(obj);
        if (z10) {
            MediaDataController.getInstance(i14).checkStickers(5);
            MediaDataController.getInstance(i14).checkFeaturedEmoji();
            this.f30317e2 = new PorterDuffColorFilter(A(org.telegram.ui.ActionBar.k6.Oh), PorterDuff.Mode.SRC_IN);
        }
        cy cyVar = new cy(this, context);
        this.P = cyVar;
        eVar2.a(cyVar);
        s4.k kVar = new s4.k();
        kVar.f46421c = 220L;
        kVar.e = 220L;
        kVar.f46422f = 160L;
        kVar.f46423g = 160L;
        kVar.f46424i = zr.f33338g;
        cyVar.setItemAnimator(kVar);
        cyVar.setOnTouchListener(new View.OnTouchListener(this) {
            public final rz f28460b;

            {
                this.f28460b = this;
            }

            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                switch (r3) {
                    case 0:
                        org.telegram.ui.ht o10 = org.telegram.ui.ht.o();
                        rz rzVar = this.f28460b;
                        cy cyVar2 = rzVar.P;
                        rzVar.getMeasuredHeight();
                        return o10.q(motionEvent, cyVar2, null, rzVar.f30324g2, g6Var);
                    case 1:
                        org.telegram.ui.ht o11 = org.telegram.ui.ht.o();
                        rz rzVar2 = this.f28460b;
                        return o11.q(motionEvent, rzVar2.f30325h0, rzVar2.m0, rzVar2.f30324g2, g6Var);
                    default:
                        org.telegram.ui.ht o12 = org.telegram.ui.ht.o();
                        rz rzVar3 = this.f28460b;
                        yw ywVar = rzVar3.D0;
                        rzVar3.getMeasuredHeight();
                        return o12.q(motionEvent, ywVar, rzVar3.A0, rzVar3.f30324g2, g6Var);
                }
            }
        });
        cyVar.setOnItemLongClickListener(new kw(this, 1));
        cyVar.setInstantClick(true);
        px pxVar = new px(this);
        this.Q = pxVar;
        cyVar.setLayoutManager(pxVar);
        cyVar.setTopGlowOffset(AndroidUtilities.dp(38.0f));
        cyVar.setBottomGlowOffset(AndroidUtilities.dp(36.0f));
        cyVar.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f));
        int i18 = org.telegram.ui.ActionBar.k6.He;
        org.telegram.ui.ActionBar.r6.m(cyVar, 21, i18, g6Var);
        cyVar.setItemSelectorColorProvider(new d2(22));
        cyVar.setClipToPadding(false);
        pxVar.O = new qx(this);
        yx yxVar2 = new yx(this);
        this.R = yxVar2;
        cyVar.setAdapter(yxVar2);
        cyVar.i(new ei.q1(this, 3));
        this.S = new ry(this, context);
        oxVar2.addView(cyVar, w7.z5.c(-1.0f, -1));
        ol0 ol0Var = new ol0(cyVar, pxVar);
        this.f30305b0 = ol0Var;
        ol0Var.f29321i = new rx(this);
        cyVar.setOnScrollListener(new sx(this));
        if (o2Var != null) {
            i10 = -1;
            jwVar = new jw(this, 2);
            z17 = z10;
            oxVar = oxVar2;
            i11 = i17;
            context2 = context;
            eVar = eVar2;
            i12 = 5;
            z18 = z16;
            g6Var2 = g6Var;
            yxVar = yxVar2;
        } else {
            i10 = -1;
            jwVar = null;
            z17 = z10;
            oxVar = oxVar2;
            i11 = i17;
            context2 = context;
            g6Var2 = g6Var;
            eVar = eVar2;
            yxVar = yxVar2;
            i12 = 5;
            z18 = z16;
        }
        tx txVar = new tx(this, context2, g6Var2, z17, jwVar, z18);
        this.I = txVar;
        if (z13) {
            pw pwVar = new pw(this, context2);
            this.V = pwVar;
            oxVar.addView(pwVar, new FrameLayout.LayoutParams(i10, AndroidUtilities.getShadowHeight() + dp));
            pwVar.d.setOnFocusChangeListener(new qw(this));
            oh.d dVar = new oh.d(context2, g6Var2);
            this.U = dVar;
            dVar.setVisibility(8);
            dVar.setOnBackClickListener(new View.OnClickListener(this) {
                public final rz f28714b;

                {
                    this.f28714b = this;
                }

                @Override
                public final void onClick(View view) {
                    ez ezVar;
                    switch (r2) {
                        case 0:
                            ry ryVar = this.f28714b.S;
                            ky kyVar = ryVar.f30290c;
                            int childCount = kyVar.getChildCount();
                            for (int i19 = 0; i19 < childCount; i19++) {
                                ((oh.c) kyVar.getChildAt(i19)).a(false, true);
                            }
                            ryVar.d = 0L;
                            ryVar.F.f30304b.a(false, true);
                            ryVar.l();
                            return;
                        case 1:
                            mz mzVar = this.f28714b.f30383z0;
                            lz lzVar = mzVar.f28722c;
                            int childCount2 = lzVar.getChildCount();
                            for (int i20 = 0; i20 < childCount2; i20++) {
                                ((oh.c) lzVar.getChildAt(i20)).a(false, true);
                            }
                            mzVar.d = 0L;
                            mzVar.Q.f30301a.a(false, true);
                            mzVar.l();
                            return;
                        case 2:
                            sy syVar = this.f28714b.f30363t1;
                            if (syVar != null) {
                                syVar.w();
                                return;
                            }
                            return;
                        default:
                            rz rzVar = this.f28714b;
                            int currentItem = rzVar.h.getCurrentItem();
                            if (currentItem == 0) {
                                ezVar = rzVar.V;
                            } else if (currentItem == 1) {
                                ezVar = rzVar.f30345o0;
                            } else {
                                ezVar = rzVar.G0;
                            }
                            if (ezVar != null) {
                                qq qqVar = ezVar.d;
                                qqVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                qqVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                qqVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                return;
                            }
                            return;
                    }
                }
            });
            oxVar.addView(dVar, new FrameLayout.LayoutParams(i10, dp));
        }
        if (Color.alpha(A(i18)) >= 255) {
            org.telegram.ui.ActionBar.r6.i(i18, txVar, g6Var2);
        }
        yxVar.G(true);
        txVar.p(getEmojipacks());
        oxVar.addView(txVar, w7.z5.c(36.0f, i10));
        View view = new View(context2);
        this.O = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        int i19 = org.telegram.ui.ActionBar.k6.Ke;
        org.telegram.ui.ActionBar.r6.i(i19, view, g6Var2);
        yx yxVar3 = yxVar;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i10, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(36.0f);
        oxVar.addView(view, layoutParams);
        oh.b bVar = new oh.b(context2, g6Var2);
        this.L = bVar;
        ah.v vVar = new ah.v(context2, g6Var2);
        this.K = vVar;
        vVar.setVisibility(8);
        vVar.addView(bVar, w7.z5.d(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
        oxVar.addView(vVar, w7.z5.e(i10, -2, 80));
        if (z11) {
            in0 in0Var = in0.f27450b;
            if (z12) {
                rw rwVar = new rw(this, context2);
                this.f30322g0 = rwVar;
                ?? obj2 = new Object();
                obj2.f29080a = 1;
                obj2.f29081b = rwVar;
                this.d.add(obj2);
                sw swVar = new sw(this, context2);
                this.f30325h0 = swVar;
                eVar.a(swVar);
                swVar.setClipToPadding(false);
                xy xyVar = new xy(this);
                this.f30328i0 = xyVar;
                swVar.setLayoutManager(xyVar);
                swVar.i(new tw(this));
                swVar.setPadding(0, dp, 0, AndroidUtilities.dp(44.0f) + this.f30353q2);
                ((s4.e1) swVar.getItemAnimator()).f46376m = false;
                wy wyVar = new wy(this, context2, true, Integer.MAX_VALUE);
                this.f30342n0 = wyVar;
                swVar.setAdapter(wyVar);
                this.f30331j0 = new wy(this, context2, false, 0);
                swVar.setOnScrollListener(new uw(this));
                swVar.setOnTouchListener(new View.OnTouchListener(this) {
                    public final rz f28460b;

                    {
                        this.f28460b = this;
                    }

                    @Override
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        switch (r3) {
                            case 0:
                                org.telegram.ui.ht o10 = org.telegram.ui.ht.o();
                                rz rzVar = this.f28460b;
                                cy cyVar2 = rzVar.P;
                                rzVar.getMeasuredHeight();
                                return o10.q(motionEvent, cyVar2, null, rzVar.f30324g2, g6Var2);
                            case 1:
                                org.telegram.ui.ht o11 = org.telegram.ui.ht.o();
                                rz rzVar2 = this.f28460b;
                                return o11.q(motionEvent, rzVar2.f30325h0, rzVar2.m0, rzVar2.f30324g2, g6Var2);
                            default:
                                org.telegram.ui.ht o12 = org.telegram.ui.ht.o();
                                rz rzVar3 = this.f28460b;
                                yw ywVar = rzVar3.D0;
                                rzVar3.getMeasuredHeight();
                                return o12.q(motionEvent, ywVar, rzVar3.A0, rzVar3.f30324g2, g6Var2);
                        }
                    }
                });
                ?? r10 = new zl0(this) {
                    public final rz f29043b;

                    {
                        this.f29043b = this;
                    }

                    @Override
                    public final void d(int i20, View view2) {
                        int i21;
                        String str;
                        switch (r2) {
                            case 0:
                                rz rzVar = this.f29043b;
                                sw swVar2 = rzVar.f30325h0;
                                wy wyVar2 = rzVar.f30331j0;
                                wy wyVar3 = rzVar.f30342n0;
                                if (rzVar.f30363t1 != null) {
                                    wyVar3.getClass();
                                    ArrayList arrayList3 = wyVar3.f32439x;
                                    if (swVar2.getAdapter() == wyVar3) {
                                        if (i20 >= 0) {
                                            int i22 = wyVar3.H;
                                            if (i20 < i22) {
                                                rzVar.f30363t1.v(view2, rzVar.f30329i1.get(i20), null, "gif", true, 0, 0);
                                                return;
                                            }
                                            if (i22 > 0) {
                                                i21 = (i20 - i22) - 1;
                                            } else {
                                                i21 = i20;
                                            }
                                            if (i21 >= 0 && i21 < arrayList3.size()) {
                                                rzVar.f30363t1.v(view2, arrayList3.get(i21), null, wyVar3.f32435n, true, 0, 0);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    } else if (swVar2.getAdapter() == wyVar2 && i20 >= 0 && i20 < wyVar2.f32439x.size()) {
                                        rzVar.f30363t1.v(view2, wyVar2.f32439x.get(i20), wyVar2.f32438w, wyVar2.f32435n, true, 0, 0);
                                        rzVar.W();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            default:
                                rz rzVar2 = this.f29043b;
                                s4.g0 adapter = rzVar2.D0.getAdapter();
                                mz mzVar = rzVar2.f30383z0;
                                if (adapter == mzVar) {
                                    str = mzVar.N;
                                } else {
                                    str = null;
                                }
                                String str2 = str;
                                if (view2 instanceof org.telegram.ui.Cells.e8) {
                                    org.telegram.ui.Cells.e8 e8Var = (org.telegram.ui.Cells.e8) view2;
                                    if (e8Var.getSticker() != null && MessageObject.isPremiumSticker(e8Var.getSticker()) && !AccountInstance.getInstance(rzVar2.f30310c1).getUserConfig().isPremium()) {
                                        org.telegram.ui.ht.o().w(e8Var);
                                        return;
                                    }
                                    org.telegram.ui.ht.o().s();
                                    if (!e8Var.f22334r) {
                                        e8Var.f22334r = true;
                                        e8Var.f22333n = 0.5f;
                                        e8Var.f22337x = 0L;
                                        org.telegram.ui.Cells.d8 d8Var = e8Var.f22329a;
                                        d8Var.setAlpha(0.5f * e8Var.H);
                                        d8Var.invalidate();
                                        e8Var.f22335s = System.currentTimeMillis();
                                        e8Var.invalidate();
                                        rzVar2.f30363t1.m(e8Var, e8Var.getSticker(), str2, e8Var.getParentObject(), e8Var.getSendAnimationData(), true, 0);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                };
                this.m0 = r10;
                swVar.setOnItemClickListener((zl0) r10);
                rwVar.addView(swVar, w7.z5.c(-1.0f, -1));
                vw vwVar = new vw(this, context2);
                this.f30345o0 = vwVar;
                rwVar.addView(vwVar, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + dp));
                wx wxVar = new wx(this, context2, g6Var2);
                this.f30348p0 = wxVar;
                wxVar.setType(in0Var);
                wxVar.setUnderlineHeight(AndroidUtilities.getShadowHeight());
                wxVar.setIndicatorColor(A(i11));
                wxVar.setUnderlineColor(A(i19));
                org.telegram.ui.ActionBar.r6.i(i18, wxVar, g6Var2);
                V();
                wxVar.setDelegate(new kw(this, 2));
                wyVar.F("", "", true, true, true);
            }
            ww wwVar = new ww(this, context2, z14);
            this.f30376x0 = wwVar;
            MediaDataController.getInstance(this.f30310c1).checkStickers(0);
            MediaDataController.getInstance(this.f30310c1).checkFeaturedStickers();
            yw ywVar = new yw(this, context2);
            this.D0 = ywVar;
            this.f30344n2.a(ywVar);
            zw zwVar = new zw(this);
            this.E0 = zwVar;
            ywVar.setLayoutManager(zwVar);
            zwVar.O = new ax(this);
            ywVar.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f));
            ywVar.setClipToPadding(false);
            ?? obj3 = new Object();
            obj3.f29080a = 2;
            obj3.f29081b = wwVar;
            this.d.add(obj3);
            this.f30383z0 = new mz(this, context2);
            iz izVar = new iz(this, context2);
            this.f30380y0 = izVar;
            ywVar.setAdapter(izVar);
            ywVar.setOnTouchListener(new View.OnTouchListener(this) {
                public final rz f28460b;

                {
                    this.f28460b = this;
                }

                @Override
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    switch (r3) {
                        case 0:
                            org.telegram.ui.ht o10 = org.telegram.ui.ht.o();
                            rz rzVar = this.f28460b;
                            cy cyVar2 = rzVar.P;
                            rzVar.getMeasuredHeight();
                            return o10.q(motionEvent, cyVar2, null, rzVar.f30324g2, g6Var2);
                        case 1:
                            org.telegram.ui.ht o11 = org.telegram.ui.ht.o();
                            rz rzVar2 = this.f28460b;
                            return o11.q(motionEvent, rzVar2.f30325h0, rzVar2.m0, rzVar2.f30324g2, g6Var2);
                        default:
                            org.telegram.ui.ht o12 = org.telegram.ui.ht.o();
                            rz rzVar3 = this.f28460b;
                            yw ywVar2 = rzVar3.D0;
                            rzVar3.getMeasuredHeight();
                            return o12.q(motionEvent, ywVar2, rzVar3.A0, rzVar3.f30324g2, g6Var2);
                    }
                }
            });
            ?? r42 = new zl0(this) {
                public final rz f29043b;

                {
                    this.f29043b = this;
                }

                @Override
                public final void d(int i20, View view2) {
                    int i21;
                    String str;
                    switch (r2) {
                        case 0:
                            rz rzVar = this.f29043b;
                            sw swVar2 = rzVar.f30325h0;
                            wy wyVar2 = rzVar.f30331j0;
                            wy wyVar3 = rzVar.f30342n0;
                            if (rzVar.f30363t1 != null) {
                                wyVar3.getClass();
                                ArrayList arrayList3 = wyVar3.f32439x;
                                if (swVar2.getAdapter() == wyVar3) {
                                    if (i20 >= 0) {
                                        int i22 = wyVar3.H;
                                        if (i20 < i22) {
                                            rzVar.f30363t1.v(view2, rzVar.f30329i1.get(i20), null, "gif", true, 0, 0);
                                            return;
                                        }
                                        if (i22 > 0) {
                                            i21 = (i20 - i22) - 1;
                                        } else {
                                            i21 = i20;
                                        }
                                        if (i21 >= 0 && i21 < arrayList3.size()) {
                                            rzVar.f30363t1.v(view2, arrayList3.get(i21), null, wyVar3.f32435n, true, 0, 0);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                } else if (swVar2.getAdapter() == wyVar2 && i20 >= 0 && i20 < wyVar2.f32439x.size()) {
                                    rzVar.f30363t1.v(view2, wyVar2.f32439x.get(i20), wyVar2.f32438w, wyVar2.f32435n, true, 0, 0);
                                    rzVar.W();
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        default:
                            rz rzVar2 = this.f29043b;
                            s4.g0 adapter = rzVar2.D0.getAdapter();
                            mz mzVar = rzVar2.f30383z0;
                            if (adapter == mzVar) {
                                str = mzVar.N;
                            } else {
                                str = null;
                            }
                            String str2 = str;
                            if (view2 instanceof org.telegram.ui.Cells.e8) {
                                org.telegram.ui.Cells.e8 e8Var = (org.telegram.ui.Cells.e8) view2;
                                if (e8Var.getSticker() != null && MessageObject.isPremiumSticker(e8Var.getSticker()) && !AccountInstance.getInstance(rzVar2.f30310c1).getUserConfig().isPremium()) {
                                    org.telegram.ui.ht.o().w(e8Var);
                                    return;
                                }
                                org.telegram.ui.ht.o().s();
                                if (!e8Var.f22334r) {
                                    e8Var.f22334r = true;
                                    e8Var.f22333n = 0.5f;
                                    e8Var.f22337x = 0L;
                                    org.telegram.ui.Cells.d8 d8Var = e8Var.f22329a;
                                    d8Var.setAlpha(0.5f * e8Var.H);
                                    d8Var.invalidate();
                                    e8Var.f22335s = System.currentTimeMillis();
                                    e8Var.invalidate();
                                    rzVar2.f30363t1.m(e8Var, e8Var.getSticker(), str2, e8Var.getParentObject(), e8Var.getSendAnimationData(), true, 0);
                                    return;
                                }
                                return;
                            }
                            return;
                    }
                }
            };
            this.A0 = r42;
            ywVar.setOnItemClickListener((zl0) r42);
            org.telegram.ui.ActionBar.r6.m(ywVar, 21, i18, g6Var2);
            wwVar.addView(ywVar);
            this.f30302a0 = new ol0(ywVar, zwVar);
            bx bxVar = new bx(this, context2);
            this.G0 = bxVar;
            wwVar.addView(bxVar, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + dp));
            oh.d dVar2 = new oh.d(context2, g6Var2);
            this.H0 = dVar2;
            dVar2.setVisibility(8);
            dVar2.setOnBackClickListener(new View.OnClickListener(this) {
                public final rz f28714b;

                {
                    this.f28714b = this;
                }

                @Override
                public final void onClick(View view2) {
                    ez ezVar;
                    switch (r2) {
                        case 0:
                            ry ryVar = this.f28714b.S;
                            ky kyVar = ryVar.f30290c;
                            int childCount = kyVar.getChildCount();
                            for (int i192 = 0; i192 < childCount; i192++) {
                                ((oh.c) kyVar.getChildAt(i192)).a(false, true);
                            }
                            ryVar.d = 0L;
                            ryVar.F.f30304b.a(false, true);
                            ryVar.l();
                            return;
                        case 1:
                            mz mzVar = this.f28714b.f30383z0;
                            lz lzVar = mzVar.f28722c;
                            int childCount2 = lzVar.getChildCount();
                            for (int i20 = 0; i20 < childCount2; i20++) {
                                ((oh.c) lzVar.getChildAt(i20)).a(false, true);
                            }
                            mzVar.d = 0L;
                            mzVar.Q.f30301a.a(false, true);
                            mzVar.l();
                            return;
                        case 2:
                            sy syVar = this.f28714b.f30363t1;
                            if (syVar != null) {
                                syVar.w();
                                return;
                            }
                            return;
                        default:
                            rz rzVar = this.f28714b;
                            int currentItem = rzVar.h.getCurrentItem();
                            if (currentItem == 0) {
                                ezVar = rzVar.V;
                            } else if (currentItem == 1) {
                                ezVar = rzVar.f30345o0;
                            } else {
                                ezVar = rzVar.G0;
                            }
                            if (ezVar != null) {
                                qq qqVar = ezVar.d;
                                qqVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                qqVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                qqVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                return;
                            }
                            return;
                    }
                }
            });
            wwVar.addView(dVar2, new FrameLayout.LayoutParams(-1, dp));
            z19 = z14;
            i13 = 80;
            cx cxVar = new cx(this, context2, g6Var2, o2Var, z19);
            this.B0 = cxVar;
            cxVar.setDragEnabled(true);
            cxVar.setWillNotDraw(false);
            cxVar.setType(in0Var);
            cxVar.setUnderlineHeight(ywVar.canScrollVertically(-1) ? AndroidUtilities.getShadowHeight() : 0);
            cxVar.setIndicatorColor(A(i11));
            cxVar.setUnderlineColor(A(i19));
            if (viewGroup != null && z19) {
                dx dxVar = new dx(this, context2);
                this.C0 = dxVar;
                dxVar.addView(cxVar, w7.z5.e(-1, 36, 51));
                viewGroup.addView(dxVar, w7.z5.c(-2.0f, -1));
            } else {
                wwVar.addView(cxVar, w7.z5.e(-1, 36, 51));
            }
            X(true);
            cxVar.setDelegate(new kw(this, 4));
            ywVar.setOnScrollListener(new qz(this, 0));
            oh.b bVar2 = new oh.b(context2, g6Var2);
            this.N = bVar2;
            ah.v vVar2 = new ah.v(context2, g6Var2);
            this.M = vVar2;
            vVar2.setVisibility(8);
            vVar2.addView(bVar2, w7.z5.d(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
            wwVar.addView(vVar2, w7.z5.e(-1, -2, 80));
        } else {
            i13 = 80;
            z19 = z14;
        }
        this.e.clear();
        this.e.addAll(this.d);
        ex exVar = new ex(this, context2);
        this.h = exVar;
        ni.e eVar3 = this.f30344n2;
        eVar3.getClass();
        exVar.b(new ci.w5(eVar3, 1));
        exVar.setOverScrollMode(2);
        jy jyVar = new jy(this);
        this.L0 = jyVar;
        exVar.setAdapter(jyVar);
        fx fxVar = new fx(this, context2);
        this.f30375x = fxVar;
        fxVar.setHapticFeedbackEnabled(true);
        fxVar.setImageResource(R.drawable.smiles_tab_clear);
        int w9 = z16 ? w(0.6f) : A(org.telegram.ui.ActionBar.k6.Re);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        fxVar.setColorFilter(new PorterDuffColorFilter(w9, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        fxVar.setScaleType(scaleType);
        fxVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
        fxVar.setFocusable(true);
        fxVar.setOnClickListener(new Object());
        w7.b6.a(fxVar);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f30354r = frameLayout;
        if (z13) {
            addView(frameLayout, w7.z5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, (AndroidUtilities.getShadowHeight() / AndroidUtilities.density) + 40.0f));
        } else {
            addView(frameLayout, w7.z5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.f30358s = frameLayout2;
        addView(frameLayout2, w7.z5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 64.0f));
        FrameLayout frameLayout3 = new FrameLayout(context2);
        this.f30341n = frameLayout3;
        View view2 = new View(context2);
        this.v = view2;
        frameLayout3.addView(view2, new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(40.0f), 83));
        if (z13) {
            addView(frameLayout3, w7.z5.e(-1, 48, i13));
            frameLayout3.addView(fxVar, w7.z5.d(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
            if (z11) {
                ImageView imageView = new ImageView(context2);
                this.f30379y = imageView;
                imageView.setImageResource(R.drawable.smiles_tab_settings);
                imageView.setColorFilter(new PorterDuffColorFilter(z16 ? w(0.6f) : A(org.telegram.ui.ActionBar.k6.Re), mode));
                imageView.setScaleType(scaleType);
                imageView.setFocusable(true);
                imageView.setContentDescription(LocaleController.getString(R.string.Settings));
                w7.b6.a(imageView);
                frameLayout3.addView(imageView, w7.z5.d(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
                imageView.setOnClickListener(new View.OnClickListener(this) {
                    public final rz f28714b;

                    {
                        this.f28714b = this;
                    }

                    @Override
                    public final void onClick(View view22) {
                        ez ezVar;
                        switch (r2) {
                            case 0:
                                ry ryVar = this.f28714b.S;
                                ky kyVar = ryVar.f30290c;
                                int childCount = kyVar.getChildCount();
                                for (int i192 = 0; i192 < childCount; i192++) {
                                    ((oh.c) kyVar.getChildAt(i192)).a(false, true);
                                }
                                ryVar.d = 0L;
                                ryVar.F.f30304b.a(false, true);
                                ryVar.l();
                                return;
                            case 1:
                                mz mzVar = this.f28714b.f30383z0;
                                lz lzVar = mzVar.f28722c;
                                int childCount2 = lzVar.getChildCount();
                                for (int i20 = 0; i20 < childCount2; i20++) {
                                    ((oh.c) lzVar.getChildAt(i20)).a(false, true);
                                }
                                mzVar.d = 0L;
                                mzVar.Q.f30301a.a(false, true);
                                mzVar.l();
                                return;
                            case 2:
                                sy syVar = this.f28714b.f30363t1;
                                if (syVar != null) {
                                    syVar.w();
                                    return;
                                }
                                return;
                            default:
                                rz rzVar = this.f28714b;
                                int currentItem = rzVar.h.getCurrentItem();
                                if (currentItem == 0) {
                                    ezVar = rzVar.V;
                                } else if (currentItem == 1) {
                                    ezVar = rzVar.f30345o0;
                                } else {
                                    ezVar = rzVar.G0;
                                }
                                if (ezVar != null) {
                                    qq qqVar = ezVar.d;
                                    qqVar.requestFocus();
                                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                    qqVar.onTouchEvent(obtain);
                                    obtain.recycle();
                                    MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                    qqVar.onTouchEvent(obtain2);
                                    obtain2.recycle();
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            yd0 yd0Var = new yd0(context2, g6Var2);
            this.f30371w = yd0Var;
            yd0Var.setViewPager(exVar);
            yd0Var.setShouldExpand(false);
            yd0Var.setIndicatorHeight(AndroidUtilities.dp(3.0f));
            yd0Var.setIndicatorColor(i0.a.o(A(org.telegram.ui.ActionBar.k6.Oe), 20));
            yd0Var.setUnderlineHeight(0);
            yd0Var.setTabPaddingLeftRight(AndroidUtilities.dp(11.0f));
            yd0Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f));
            frameLayout3.addView(yd0Var, w7.z5.e(-2, 48, 81));
            yd0Var.setOnPageChangeListener(new hx(this, z19));
            ImageView imageView2 = new ImageView(context2);
            this.E = imageView2;
            imageView2.setImageResource(R.drawable.smiles_tab_search);
            imageView2.setColorFilter(new PorterDuffColorFilter(z16 ? w(0.6f) : A(org.telegram.ui.ActionBar.k6.Re), mode));
            imageView2.setScaleType(scaleType);
            imageView2.setContentDescription(LocaleController.getString(R.string.Search));
            imageView2.setFocusable(true);
            imageView2.setVisibility(8);
            frameLayout3.addView(imageView2, w7.z5.d(48, 48.0f, 83, 2.0f, 0.0f, 2.0f, 0.0f));
            imageView2.setOnClickListener(new View.OnClickListener(this) {
                public final rz f28714b;

                {
                    this.f28714b = this;
                }

                @Override
                public final void onClick(View view22) {
                    ez ezVar;
                    switch (r2) {
                        case 0:
                            ry ryVar = this.f28714b.S;
                            ky kyVar = ryVar.f30290c;
                            int childCount = kyVar.getChildCount();
                            for (int i192 = 0; i192 < childCount; i192++) {
                                ((oh.c) kyVar.getChildAt(i192)).a(false, true);
                            }
                            ryVar.d = 0L;
                            ryVar.F.f30304b.a(false, true);
                            ryVar.l();
                            return;
                        case 1:
                            mz mzVar = this.f28714b.f30383z0;
                            lz lzVar = mzVar.f28722c;
                            int childCount2 = lzVar.getChildCount();
                            for (int i20 = 0; i20 < childCount2; i20++) {
                                ((oh.c) lzVar.getChildAt(i20)).a(false, true);
                            }
                            mzVar.d = 0L;
                            mzVar.Q.f30301a.a(false, true);
                            mzVar.l();
                            return;
                        case 2:
                            sy syVar = this.f28714b.f30363t1;
                            if (syVar != null) {
                                syVar.w();
                                return;
                            }
                            return;
                        default:
                            rz rzVar = this.f28714b;
                            int currentItem = rzVar.h.getCurrentItem();
                            if (currentItem == 0) {
                                ezVar = rzVar.V;
                            } else if (currentItem == 1) {
                                ezVar = rzVar.f30345o0;
                            } else {
                                ezVar = rzVar.G0;
                            }
                            if (ezVar != null) {
                                qq qqVar = ezVar.d;
                                qqVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                qqVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                qqVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                return;
                            }
                            return;
                    }
                }
            });
        } else {
            addView(frameLayout3, w7.z5.d(56, 48.0f, (LocaleController.isRTL ? 3 : i12) | 80, 0.0f, 0.0f, 2.0f, 0.0f));
            org.telegram.ui.Cells.y i02 = org.telegram.ui.ActionBar.k6.i0(AndroidUtilities.dp(56.0f), A(i18), A(i18));
            w7.b6.a(fxVar);
            fxVar.setPadding(0, 0, AndroidUtilities.dp(2.0f), 0);
            fxVar.setBackground(i02);
            fxVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
            fxVar.setFocusable(true);
            frameLayout3.addView(fxVar, w7.z5.d(48, 48.0f, 51, 2.0f, 0.0f, 2.0f, 0.0f));
            view2.setVisibility(8);
        }
        addView(exVar, 0, w7.z5.e(-1, -1, 51));
        ai.wd wdVar = new ai.wd(context2, 22);
        this.N0 = wdVar;
        int dp2 = AndroidUtilities.dp(6.0f);
        int i20 = org.telegram.ui.ActionBar.k6.f21430qf;
        ShapeDrawable c02 = org.telegram.ui.ActionBar.k6.c0(dp2, A(i20));
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i20);
        wdVar.setBackground(c02);
        org.telegram.ui.ActionBar.r6.k(wdVar, c02, O, null, g6Var2);
        org.telegram.ui.ActionBar.r6.W(wdVar, org.telegram.ui.ActionBar.k6.f21411pf, g6Var2);
        wdVar.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f));
        wdVar.setGravity(16);
        wdVar.setTextSize(1, 14.0f);
        wdVar.setVisibility(4);
        addView(wdVar, w7.z5.d(-2, -2.0f, 81, 5.0f, 0.0f, 5.0f, 53.0f));
        this.C1 = AndroidUtilities.dp(AndroidUtilities.isTablet() ? 40.0f : 32.0f);
        Field field2 = cv.f25474f;
        cv cvVar = new cv(new bv(context2, g6Var2));
        if (cv.f25474f == null) {
            try {
                field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
                try {
                    field.setAccessible(true);
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                field = null;
            }
            cv.f25474f = field;
        }
        Field field3 = cv.f25474f;
        if (field3 != null) {
            try {
                cvVar.f25476a = (ViewTreeObserver.OnScrollChangedListener) field3.get(cvVar);
                cv.f25474f.set(cvVar, cv.f25475g);
            } catch (Exception unused3) {
                cvVar.f25476a = null;
            }
        }
        this.B1 = cvVar;
        cvVar.f25478c.setOnSelectionUpdateListener(new d(this, 10));
        this.A1 = MessagesController.getGlobalEmojiSettings().getInt("selected_page", 0);
        Emoji.loadRecentEmoji();
        yxVar3.F(false);
        I(true, z11, z12, false);
        if (Build.VERSION.SDK_INT >= 31) {
            bh.f fVar = new bh.f(false);
            this.f30333j2 = fVar;
            gh.d dVar3 = new gh.d(null);
            dVar3.f11078f = cVar;
            dVar3.d = fVar;
            dVar3.e = -2;
            bh.b bVar3 = new bh.b(dVar3);
            this.f30340m2 = bVar3;
            bVar3.f4367i = LiteMode.isEnabled(262144);
            int dp3 = AndroidUtilities.dp(LiteMode.isEnabled(262144) ? 8.0f : 48.0f);
            bVar3.f4363b = dp3;
            bVar3.f4364c = dp3;
            bVar3.h = this.f30344n2;
        } else {
            bh.b bVar4 = new bh.b(cVar);
            this.f30340m2 = bVar4;
            bVar4.h = this.f30344n2;
            this.f30333j2 = null;
        }
        this.f30336k2 = new ih(this, 1);
        setBlurredBackgroundDrawableFactory(this.f30340m2);
        this.f30344n2.b(this);
        this.f30344n2.f17545a = new kw(this, 0);
    }

    public static void a(rz rzVar, boolean z10) {
        sw swVar = rzVar.f30325h0;
        if (swVar != null) {
            int childCount = swVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = swVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.e2) {
                    ImageReceiver photoImage = ((org.telegram.ui.Cells.e2) childAt).getPhotoImage();
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

    public static void d(rz rzVar, az azVar, String str) {
        String str2;
        String str3;
        boolean z10;
        String str4;
        sy syVar;
        vc vcVar;
        org.telegram.ui.ActionBar.o2 o2Var = rzVar.Y1;
        int i10 = rzVar.f30310c1;
        ArrayList arrayList = rzVar.f30352q1;
        if (azVar != null) {
            if (azVar.getSpan() != null) {
                if (rzVar.f30363t1 != null) {
                    long j10 = azVar.getSpan().documentId;
                    TLRPC.Document document = azVar.getSpan().document;
                    dy dyVar = azVar.e;
                    if (dyVar != null && dyVar.f25860i) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (document == null) {
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            dy dyVar2 = (dy) arrayList.get(i11);
                            int i12 = 0;
                            while (true) {
                                ArrayList arrayList2 = dyVar2.f25857c;
                                if (arrayList2 != null && i12 < arrayList2.size()) {
                                    if (((TLRPC.Document) dyVar2.f25857c.get(i12)).f20350id == j10) {
                                        document = (TLRPC.Document) dyVar2.f25857c.get(i12);
                                        break;
                                    }
                                    i12++;
                                }
                            }
                        }
                    }
                    if (document == null) {
                        document = p5.f(i10, j10);
                    }
                    TLRPC.Document document2 = document;
                    if (document2 != null) {
                        str4 = MessageObject.findAnimatedEmojiEmoticon(document2);
                    } else {
                        str4 = null;
                    }
                    String str5 = str4;
                    if (!MessageObject.isFreeEmoji(document2) && !UserConfig.getInstance(i10).isPremium() && (((syVar = rzVar.f30363t1) == null || !syVar.g()) && !rzVar.U0 && !z10)) {
                        rzVar.M(false);
                        if (o2Var != null) {
                            vcVar = vc.a0(o2Var);
                        } else {
                            vcVar = new vc(rzVar.f30354r, rzVar.Z1);
                        }
                        if (!rzVar.f30327h2 && o2Var != null) {
                            vcVar.J(R.raw.saved_messages, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint2)), LocaleController.getString(R.string.Open), new jw(rzVar, 4)).j();
                        } else {
                            vcVar.r(document2, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint)), LocaleController.getString(R.string.PremiumMore), new jw(rzVar, 3)).j();
                        }
                        rzVar.f30327h2 = !rzVar.f30327h2;
                        return;
                    }
                    rzVar.F2 = SystemClock.elapsedRealtime();
                    rzVar.M(true);
                    rzVar.h("animated_" + j10);
                    rzVar.f30363t1.x(j10, document2, str5, azVar.f24848c);
                    return;
                }
                return;
            }
            rzVar.F2 = SystemClock.elapsedRealtime();
            rzVar.M(true);
            if (str != null) {
                str2 = str;
            } else {
                str2 = (String) azVar.getTag();
            }
            new SpannableStringBuilder().append((CharSequence) str2);
            if (str == null) {
                if (!azVar.f24848c && (str3 = Emoji.emojiColor.get(str2)) != null) {
                    str2 = g(str2, str3);
                }
                rzVar.h(str2);
                sy syVar2 = rzVar.f30363t1;
                if (syVar2 != null) {
                    syVar2.l(Emoji.fixEmoji(str2));
                    return;
                }
                return;
            }
            sy syVar3 = rzVar.f30363t1;
            if (syVar3 != null) {
                syVar3.l(Emoji.fixEmoji(str));
            }
        }
    }

    public static void e(rz rzVar, int i10, int i11) {
        s4.b1 K;
        int[] iArr = rzVar.Q0;
        if (i10 == 1) {
            rzVar.n(i11, rzVar.P);
            return;
        }
        sy syVar = rzVar.f30363t1;
        if ((syVar == null || !syVar.z()) && !rzVar.J0) {
            lm0 y3 = rzVar.y(i10);
            if (i11 > 0 && y3 != null && y3.getVisibility() == 0 && (K = y3.K(0)) != null && K.f46342a.getTop() + rzVar.f30306b1 >= y3.getPaddingTop()) {
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
                rzVar.Y();
            } else {
                rzVar.z(i10).setTranslationY(Math.max(-AndroidUtilities.dp(48.0f), iArr[i10]));
            }
        }
    }

    public static void f(rz rzVar, boolean z10) {
        int N0;
        xy xyVar = rzVar.f30328i0;
        vw vwVar = rzVar.f30345o0;
        sw swVar = rzVar.f30325h0;
        if (swVar != null && (swVar.getAdapter() instanceof wy)) {
            wy wyVar = (wy) swVar.getAdapter();
            if (!wyVar.f32437s && wyVar.h == 0 && !wyVar.f32439x.isEmpty() && (N0 = xyVar.N0()) != -1 && N0 > xyVar.B() - 5) {
                String str = wyVar.f32438w;
                String str2 = wyVar.f32436r;
                boolean z11 = wyVar.v;
                wyVar.F(str, str2, true, z11, z11);
            }
        }
        sy syVar = rzVar.f30363t1;
        if (syVar != null && syVar.z()) {
            boolean z12 = false;
            s4.b1 K = swVar.K(0);
            if (K == null) {
                ez.a(vwVar, true, !z10);
                return;
            }
            if (K.f46342a.getTop() < swVar.getPaddingTop()) {
                z12 = true;
            }
            ez.a(vwVar, z12, !z10);
        } else if (vwVar != null && swVar != null) {
            vwVar.f26142a.a(true, !z10);
        }
    }

    public static String g(String str, String str2) {
        boolean z10;
        String str3;
        if (CompoundEmoji.isHandshake(str) != null) {
            return CompoundEmoji.applyColor(str, str2);
        }
        if (Emoji.endsWithRightArrow(str)) {
            str = com.google.android.gms.internal.play_billing.k3.i(2, 0, str);
            z10 = true;
        } else {
            z10 = false;
        }
        int length = str.length();
        if (length > 2 && str.charAt(str.length() - 2) == 8205) {
            str3 = str.substring(str.length() - 2);
            str = com.google.android.gms.internal.play_billing.k3.i(2, 0, str);
        } else if (length > 3 && str.charAt(str.length() - 3) == 8205) {
            str3 = str.substring(str.length() - 3);
            str = com.google.android.gms.internal.play_billing.k3.i(3, 0, str);
        } else {
            str3 = null;
        }
        String u10 = si.o0.u(str, str2);
        if (str3 != null) {
            u10 = si.o0.u(u10, str3);
        }
        if (z10) {
            return si.o0.u(u10, "\u200d➡");
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
        org.telegram.ui.ActionBar.g6 g6Var = this.Z1;
        if (g6Var != null) {
            return g6Var.g(i10);
        }
        return org.telegram.ui.ActionBar.k6.x0(null, i10, false);
    }

    public final void B() {
        bx bxVar = this.G0;
        if (bxVar != null) {
            bxVar.b();
        }
        vw vwVar = this.f30345o0;
        if (vwVar != null) {
            vwVar.b();
        }
        pw pwVar = this.V;
        if (pwVar != null) {
            pwVar.b();
        }
    }

    public final void C(boolean z10, boolean z11) {
        dz dzVar;
        boolean z12;
        if (this.A1 != 0 && this.f30373w1) {
            this.A1 = 0;
        }
        if (this.A1 == 0 && this.f30369v1) {
            this.A1 = 1;
        }
        int i10 = this.A1;
        ex exVar = this.h;
        if (i10 != 0 && !z10 && this.e.size() != 1) {
            int i11 = this.A1;
            if (i11 == 1) {
                L(false, false);
                if (!this.f30365u0 && !this.f30368v0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                Q(z12, false);
                if (exVar.getCurrentItem() != 2) {
                    exVar.x(2, false);
                }
                cx cxVar = this.B0;
                if (cxVar != null) {
                    this.S0 = true;
                    int i12 = this.G1;
                    if (i12 >= 0) {
                        cxVar.m(i12);
                    } else {
                        int i13 = this.F1;
                        if (i13 >= 0) {
                            cxVar.m(i13);
                        } else {
                            cxVar.m(this.E1);
                        }
                    }
                    this.S0 = false;
                    this.E0.h1(0, 0);
                }
            } else if (i11 == 2) {
                L(false, false);
                Q(false, false);
                if (exVar.getCurrentItem() != 1) {
                    exVar.x(1, false);
                }
                wx wxVar = this.f30348p0;
                if (wxVar != null) {
                    wxVar.m(0);
                }
                vw vwVar = this.f30345o0;
                if (vwVar != null && (dzVar = vwVar.f26147r) != null) {
                    dzVar.L1(null);
                }
            }
        } else {
            L(true, false);
            Q(false, false);
            if (exVar.getCurrentItem() != 0) {
                exVar.x(0, !z10);
            }
            if (z11) {
                AndroidUtilities.runOnUIThread(new jw(this, 5), 350L);
            }
        }
        M(true);
    }

    public final void D() {
        iz izVar = this.f30380y0;
        if (izVar != null) {
            izVar.l();
        }
        mz mzVar = this.f30383z0;
        if (mzVar != null) {
            mzVar.l();
        }
        if (org.telegram.ui.ht.o().E) {
            org.telegram.ui.ht.o().l();
        }
        org.telegram.ui.ht.o().s();
    }

    public final void E(int i10) {
        sy syVar = this.f30363t1;
        if ((syVar != null && syVar.z()) || i10 == 0) {
            return;
        }
        HorizontalScrollView z10 = z(i10);
        this.Q0[i10] = 0;
        z10.setTranslationY(0);
    }

    public final void F(int i10, int i11) {
        px pxVar = this.Q;
        View m10 = pxVar.m(i10);
        int L0 = pxVar.L0();
        int i12 = 1;
        if ((m10 == null && Math.abs(i10 - L0) > pxVar.J * 9.0f) || !SharedConfig.animationsEnabled()) {
            if (pxVar.L0() < i10) {
                i12 = 0;
            }
            ol0 ol0Var = this.f30305b0;
            ol0Var.f29317b = i12;
            ol0Var.c(i10, i11, false, false);
            return;
        }
        this.J0 = true;
        ei.l1 l1Var = new ei.l1(this, this.P.getContext(), 1);
        l1Var.f46483a = i10;
        l1Var.f16207p = i11;
        pxVar.w0(l1Var);
    }

    public final void G(int i10, int i11) {
        zw zwVar = this.E0;
        View m10 = zwVar.m(i10);
        int L0 = zwVar.L0();
        int i12 = 1;
        if (m10 == null && Math.abs(i10 - L0) > 40) {
            if (zwVar.L0() < i10) {
                i12 = 0;
            }
            ol0 ol0Var = this.f30302a0;
            ol0Var.f29317b = i12;
            ol0Var.c(i10, i11, false, false);
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
            if (((nz) arrayList2.get(i10)).f29080a == 0 && z10) {
                arrayList.add((nz) arrayList2.get(i10));
            }
            if (((nz) arrayList2.get(i10)).f29080a == 1 && z12) {
                arrayList.add((nz) arrayList2.get(i10));
            }
            if (((nz) arrayList2.get(i10)).f29080a == 2 && z11) {
                arrayList.add((nz) arrayList2.get(i10));
            }
            i10++;
        }
        yd0 yd0Var = this.f30371w;
        if (yd0Var != null) {
            if (arrayList.size() > 1) {
                z14 = true;
            }
            AndroidUtilities.updateViewVisibilityAnimated(yd0Var, z14, 1.0f, z13);
        }
        ex exVar = this.h;
        if (exVar != null) {
            exVar.setAdapter(null);
            exVar.setAdapter(this.L0);
            if (yd0Var != null) {
                yd0Var.setViewPager(exVar);
            }
        }
    }

    public final void J(final oh.b bVar, final TLObject tLObject, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final boolean z10, boolean z11) {
        String formatPluralString;
        mz mzVar;
        ry ryVar;
        if (stickerSet != null) {
            if (!z10 || (ryVar = this.S) == null || ryVar.d == stickerSet.f20371id) {
                if (!z10 && (mzVar = this.f30383z0) != null && mzVar.d != stickerSet.f20371id) {
                    return;
                }
                final boolean isStickerPackInstalled = MediaDataController.getInstance(this.f30310c1).isStickerPackInstalled(stickerSet.f20371id);
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
                bVar.i(formatPluralString, z11, true);
                bVar.f17807k0.a(!isStickerPackInstalled, z11);
                bVar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        int i10;
                        rz rzVar = rz.this;
                        MediaDataController mediaDataController = MediaDataController.getInstance(rzVar.f30310c1);
                        Context context = rzVar.getContext();
                        if (isStickerPackInstalled) {
                            i10 = 0;
                        } else {
                            i10 = 2;
                        }
                        int i11 = i10;
                        org.telegram.ui.ActionBar.o2 o2Var = rzVar.Y1;
                        FrameLayout frameLayout = rzVar.f30358s;
                        oh.b bVar2 = bVar;
                        TLObject tLObject2 = tLObject;
                        TLRPC.StickerSet stickerSet2 = stickerSet;
                        TLRPC.Document document2 = document;
                        boolean z12 = z10;
                        mediaDataController.toggleStickerSet(context, tLObject2, document2, i11, o2Var, frameLayout, false, true, new ai.p4(rzVar, bVar2, tLObject2, stickerSet2, document2, z12), false);
                        rzVar.J(bVar2, tLObject2, stickerSet2, document2, z12, true);
                    }
                });
            }
        }
    }

    public final void K(long j10, boolean z10, boolean z11) {
        int i10;
        View childAt;
        float f7;
        yd0 yd0Var = this.f30371w;
        if (yd0Var != null) {
            this.f30369v1 = z10;
            this.f30373w1 = z11;
            if (!z11 && !z10) {
                this.f30366u1 = 0L;
            } else {
                this.f30366u1 = j10;
            }
            if (z11) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            LinearLayout linearLayout = yd0Var.d;
            if (i10 >= linearLayout.getChildCount()) {
                childAt = null;
            } else {
                childAt = linearLayout.getChildAt(i10);
            }
            if (childAt != null) {
                if (this.f30366u1 != 0) {
                    f7 = 0.15f;
                } else {
                    f7 = 1.0f;
                }
                childAt.setAlpha(f7);
                ex exVar = this.h;
                if (z11) {
                    if (this.f30366u1 != 0 && exVar.getCurrentItem() != 0) {
                        L(true, true);
                        Q(false, true);
                        exVar.x(0, false);
                    }
                } else if (this.f30366u1 != 0 && exVar.getCurrentItem() != 1) {
                    L(false, true);
                    Q(false, true);
                    exVar.x(1, false);
                }
            }
        }
    }

    public final void L(boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        float f12;
        fx fxVar = this.f30375x;
        if (!z10 || fxVar.getTag() != null) {
            if ((!z10 && fxVar.getTag() != null) || this.f30347o2) {
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
            fxVar.setTag(num);
            int i10 = 0;
            float f13 = 0.0f;
            if (z11) {
                if (z10) {
                    fxVar.setVisibility(0);
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.F = animatorSet2;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fxVar, View.ALPHA, f11);
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(fxVar, View.SCALE_X, f12);
                if (z10) {
                    f13 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(fxVar, View.SCALE_Y, f13));
                this.F.setDuration(200L);
                this.F.setInterpolator(zr.f33338g);
                this.F.addListener(new lx(this, z10, 0));
                this.F.start();
                return;
            }
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            fxVar.setAlpha(f7);
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            fxVar.setScaleX(f10);
            if (z10) {
                f13 = 1.0f;
            }
            fxVar.setScaleY(f13);
            if (!z10) {
                i10 = 4;
            }
            fxVar.setVisibility(i10);
        }
    }

    public final void M(boolean z10) {
        Integer num;
        this.H = 0.0f;
        sy syVar = this.f30363t1;
        if (syVar != null && syVar.z()) {
            z10 = false;
        }
        FrameLayout frameLayout = this.f30341n;
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
            this.G2.a(z10, true);
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
                this.W.setInterpolator(zr.f33338g);
                this.W.addListener(new org.telegram.ui.pq(this, 25));
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
                    E(i10);
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
        TLRPC.Chat chat = MessagesController.getInstance(this.f30310c1).getChat(Long.valueOf(this.f30366u1));
        if (chat != null) {
            ai.wd wdVar = this.N0;
            if (z10) {
                if (!ChatObject.hasAdminRights(chat) && (tL_chatBannedRights = chat.default_banned_rights) != null && (tL_chatBannedRights.send_stickers || (z11 && tL_chatBannedRights.send_plain))) {
                    org.telegram.ui.ActionBar.o2 o2Var = this.Y1;
                    if (!(o2Var instanceof org.telegram.ui.sn) || !((org.telegram.ui.sn) o2Var).N6()) {
                        if (z11) {
                            wdVar.setText(LocaleController.getString(R.string.GlobalAttachEmojiRestricted));
                        } else if (z12) {
                            wdVar.setText(LocaleController.getString(R.string.GlobalAttachGifRestricted));
                        } else {
                            wdVar.setText(LocaleController.getString(R.string.GlobalAttachStickersRestricted));
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
                            wdVar.setText(LocaleController.getString(R.string.AttachPlainRestrictedForever));
                        } else if (z12) {
                            wdVar.setText(LocaleController.getString(R.string.AttachGifRestrictedForever));
                        } else {
                            wdVar.setText(LocaleController.getString(R.string.AttachStickersRestrictedForever));
                        }
                    } else {
                        if (z11) {
                            wdVar.setText(LocaleController.formatString("AttachPlainRestricted", R.string.AttachPlainRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                        }
                        if (z12) {
                            wdVar.setText(LocaleController.formatString("AttachGifRestricted", R.string.AttachGifRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                        } else {
                            wdVar.setText(LocaleController.formatString("AttachStickersRestricted", R.string.AttachStickersRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                        }
                    }
                }
                wdVar.setVisibility(0);
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
                f7 = wdVar.getAlpha();
            } else {
                f7 = 1.0f;
            }
            float f11 = 0.0f;
            if (!z10) {
                f10 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(wdVar, View.ALPHA, f7, f10);
            if (z10) {
                translationY = AndroidUtilities.dp(12.0f);
            } else {
                translationY = wdVar.getTranslationY();
            }
            if (!z10) {
                f11 = AndroidUtilities.dp(12.0f);
            }
            animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(wdVar, View.TRANSLATION_Y, translationY, f11));
            e2.n0 n0Var = this.Q2;
            if (n0Var != null) {
                AndroidUtilities.cancelRunOnUIThread(n0Var);
            }
            if (z10) {
                e2.n0 n0Var2 = new e2.n0(this, z11, z12, 4);
                this.Q2 = n0Var2;
                AndroidUtilities.runOnUIThread(n0Var2, 3500L);
            }
            this.P2.setDuration(320L);
            this.P2.setInterpolator(zr.h);
            this.P2.start();
        }
    }

    public final void Q(boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        float f12;
        ImageView imageView = this.f30379y;
        if (imageView != null && !this.f30350p2) {
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
                        this.G.setInterpolator(zr.f33338g);
                        this.G.addListener(new lx(this, z10, 1));
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
        org.telegram.ui.ActionBar.o2 o2Var;
        View view = (View) getParent();
        if (view != null) {
            float y3 = getY();
            if (getLayoutParams().height > 0) {
                measuredHeight = getLayoutParams().height;
            } else {
                measuredHeight = getMeasuredHeight();
            }
            float f7 = y3 + measuredHeight;
            if ((!AndroidUtilities.isInMultiwindow && ((o2Var = this.Y1) == null || !o2Var.isInBubbleMode())) || this.V0) {
                dp = view.getHeight();
            } else {
                dp = AndroidUtilities.dp(1.0f);
            }
            float f10 = f7 - dp;
            int i10 = (this.f30357r2 > 0.0f ? 1 : (this.f30357r2 == 0.0f ? 0 : -1));
            FrameLayout frameLayout = this.f30341n;
            if (i10 >= 0) {
                f10 += getMeasuredHeight() - this.f30357r2;
            } else if (frameLayout.getTop() - f10 < 0.0f || !this.f30378x2) {
                f10 = 0.0f;
            }
            float lerp = (-f10) + AndroidUtilities.lerp(AndroidUtilities.dp(50.0f), -this.f30353q2, this.G2.e);
            frameLayout.setTranslationY(lerp);
            if (this.f30312d0) {
                this.f30354r.setTranslationY(lerp);
            }
        }
    }

    public final void S() {
        ez ezVar;
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
        ew ewVar;
        int A10;
        int A11;
        int A12;
        int A13;
        int A14;
        int A15;
        boolean z12 = this.f30365u0;
        View view = this.v;
        if (!z12) {
            setBackground(null);
            view.setBackground(null);
        } else if (!AndroidUtilities.isInMultiwindow && !this.N1) {
            int i10 = org.telegram.ui.ActionBar.k6.He;
            setBackgroundColor(A(i10));
            if (this.f30312d0) {
                view.setBackgroundColor(A(i10));
            }
        } else {
            Drawable background = getBackground();
            int A16 = A(org.telegram.ui.ActionBar.k6.He);
            if (background != null && (background != this.I2 || A16 != this.J2)) {
                this.I2 = background;
                this.J2 = A16;
                background.setColorFilter(new PorterDuffColorFilter(A16, PorterDuff.Mode.MULTIPLY));
            }
        }
        tx txVar = this.I;
        if (txVar != null) {
            if (this.f30365u0) {
                txVar.setBackgroundColor(A(org.telegram.ui.ActionBar.k6.He));
                this.O.setBackgroundColor(A(org.telegram.ui.ActionBar.k6.Ke));
            } else {
                txVar.setBackground(null);
            }
        }
        cv cvVar = this.B1;
        if (cvVar != null) {
            cvVar.f25478c.a();
        }
        int i11 = 0;
        while (true) {
            ezVar = this.V;
            z10 = this.f30330i2;
            if (i11 >= 3) {
                break;
            }
            if (i11 == 0) {
                ezVar = this.G0;
            } else if (i11 != 1) {
                ezVar = this.f30345o0;
            }
            if (ezVar != null) {
                qq qqVar = ezVar.d;
                FrameLayout frameLayout = ezVar.f26146n;
                View view2 = ezVar.f26145f;
                if (this.f30365u0) {
                    view2.setBackgroundColor(A(org.telegram.ui.ActionBar.k6.He));
                } else {
                    view2.setBackground(null);
                }
                ezVar.e.setBackgroundColor(A(org.telegram.ui.ActionBar.k6.Ke));
                yn0 yn0Var = ezVar.f26144c;
                if (z10) {
                    A12 = w(0.4f);
                } else {
                    A12 = A(org.telegram.ui.ActionBar.k6.Je);
                }
                yn0Var.a(A12);
                Drawable background2 = frameLayout.getBackground();
                if (z10) {
                    A13 = w(0.06f);
                } else {
                    A13 = A(org.telegram.ui.ActionBar.k6.Ie);
                }
                org.telegram.ui.ActionBar.k6.z1(A13, background2);
                frameLayout.invalidate();
                if (z10) {
                    A14 = w(0.45f);
                } else {
                    A14 = A(org.telegram.ui.ActionBar.k6.Je);
                }
                qqVar.setHintTextColor(A14);
                if (z10) {
                    A15 = w(0.8f);
                } else {
                    A15 = A(org.telegram.ui.ActionBar.k6.G6);
                }
                qqVar.setTextColor(A15);
            }
            i11++;
        }
        Paint paint = this.f30360s1;
        if (paint != null) {
            paint.setColor(A(org.telegram.ui.ActionBar.k6.f21134af));
        }
        cy cyVar = this.P;
        if (cyVar != null) {
            cyVar.setGlowColor(A(org.telegram.ui.ActionBar.k6.He));
        }
        yw ywVar = this.D0;
        if (ywVar != null) {
            ywVar.setGlowColor(A(org.telegram.ui.ActionBar.k6.He));
        }
        cx cxVar = this.B0;
        if (cxVar != null) {
            cxVar.setIndicatorColor(A(org.telegram.ui.ActionBar.k6.Qe));
            cxVar.setUnderlineColor(A(org.telegram.ui.ActionBar.k6.Ke));
            if (this.f30365u0) {
                cxVar.setBackgroundColor(A(org.telegram.ui.ActionBar.k6.He));
            } else {
                cxVar.setBackground(null);
            }
        }
        wx wxVar = this.f30348p0;
        if (wxVar != null) {
            wxVar.setIndicatorColor(A(org.telegram.ui.ActionBar.k6.Qe));
            wxVar.setUnderlineColor(A(org.telegram.ui.ActionBar.k6.Ke));
            if (this.f30365u0) {
                wxVar.setBackgroundColor(A(org.telegram.ui.ActionBar.k6.He));
            } else {
                wxVar.setBackground(null);
            }
        }
        if (z10) {
            A = w(0.6f);
        } else {
            A = A(org.telegram.ui.ActionBar.k6.Re);
        }
        if (A != this.K2) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.K2 = A;
        fx fxVar = this.f30375x;
        if (fxVar != null) {
            if (z11) {
                fxVar.setColorFilter(new PorterDuffColorFilter(A, PorterDuff.Mode.MULTIPLY));
            }
            if (ezVar == null) {
                Drawable background3 = fxVar.getBackground();
                int i12 = org.telegram.ui.ActionBar.k6.He;
                org.telegram.ui.ActionBar.k6.E1(background3, A(i12), false);
                org.telegram.ui.ActionBar.k6.E1(fxVar.getBackground(), A(i12), true);
            }
        }
        ImageView imageView = this.f30379y;
        if (imageView != null && z11) {
            imageView.setColorFilter(new PorterDuffColorFilter(A, PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.E;
        if (imageView2 != null && z11) {
            imageView2.setColorFilter(new PorterDuffColorFilter(A, PorterDuff.Mode.MULTIPLY));
        }
        ai.wd wdVar = this.N0;
        if (wdVar != null) {
            if (wdVar.getBackground() instanceof ShapeDrawable) {
                ((ShapeDrawable) wdVar.getBackground()).getPaint().setColor(A(org.telegram.ui.ActionBar.k6.f21430qf));
                wdVar.invalidate();
            }
            wdVar.setTextColor(A(org.telegram.ui.ActionBar.k6.f21411pf));
        }
        wy wyVar = this.f30331j0;
        if (wyVar != null) {
            yy yyVar = wyVar.e;
            int i13 = org.telegram.ui.ActionBar.k6.Le;
            int A17 = A(i13);
            if (A17 != this.L2) {
                this.L2 = A17;
                yyVar.f33083a.setColorFilter(new PorterDuffColorFilter(A17, PorterDuff.Mode.MULTIPLY));
            }
            yyVar.f33084b.setTextColor(A(i13));
            yyVar.f33085c.setProgressColor(A(org.telegram.ui.ActionBar.k6.f21256h6));
        }
        int A18 = A(org.telegram.ui.ActionBar.k6.Oh);
        if (this.f30317e2 == null || A18 != this.M2) {
            this.M2 = A18;
            this.f30317e2 = new PorterDuffColorFilter(A18, PorterDuff.Mode.SRC_IN);
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
                A10 = A(org.telegram.ui.ActionBar.k6.Ne);
            }
            org.telegram.ui.ActionBar.k6.B1(drawable, A10, false);
            Drawable drawable2 = drawableArr[i14];
            if (z10) {
                A11 = w(0.8f);
            } else {
                A11 = A(org.telegram.ui.ActionBar.k6.Oe);
            }
            org.telegram.ui.ActionBar.k6.B1(drawable2, A11, true);
            i14++;
        }
        if (txVar != null && (ewVar = txVar.f27507y) != null) {
            ewVar.d();
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
                A8 = A(org.telegram.ui.ActionBar.k6.Me);
            }
            org.telegram.ui.ActionBar.k6.B1(drawable3, A8, false);
            Drawable drawable4 = drawableArr2[i15];
            if (z10) {
                A9 = w(0.8f);
            } else {
                A9 = A(org.telegram.ui.ActionBar.k6.Oe);
            }
            org.telegram.ui.ActionBar.k6.B1(drawable4, A9, true);
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
                A6 = A(org.telegram.ui.ActionBar.k6.Me);
            }
            org.telegram.ui.ActionBar.k6.B1(drawable5, A6, false);
            Drawable drawable6 = drawableArr3[i16];
            if (z10) {
                A7 = w(0.8f);
            } else {
                A7 = A(org.telegram.ui.ActionBar.k6.Oe);
            }
            org.telegram.ui.ActionBar.k6.B1(drawable6, A7, true);
            i16++;
        }
        org.telegram.ui.ActionBar.w5 w5Var = this.a2;
        if (w5Var != null) {
            if (z10) {
                A4 = w(0.4f);
            } else {
                A4 = A(org.telegram.ui.ActionBar.k6.Ne);
            }
            org.telegram.ui.ActionBar.k6.B1(w5Var, A4, false);
            if (z10) {
                A5 = w(0.8f);
            } else {
                A5 = A(org.telegram.ui.ActionBar.k6.Oe);
            }
            org.telegram.ui.ActionBar.k6.B1(w5Var, A5, true);
        }
        org.telegram.ui.ActionBar.w5 w5Var2 = this.f30307b2;
        if (w5Var2 != null) {
            if (z10) {
                A2 = w(0.4f);
            } else {
                A2 = A(org.telegram.ui.ActionBar.k6.Qe);
            }
            org.telegram.ui.ActionBar.k6.B1(w5Var2, A2, false);
            if (z10) {
                A3 = w(0.8f);
            } else {
                A3 = A(org.telegram.ui.ActionBar.k6.Qe);
            }
            org.telegram.ui.ActionBar.k6.B1(w5Var2, A3, true);
        }
    }

    public final void T() {
        cy cyVar = this.P;
        if (cyVar != null) {
            for (int i10 = 0; i10 < cyVar.getChildCount(); i10++) {
                View childAt = cyVar.getChildAt(i10);
                if (childAt instanceof hy) {
                    ((hy) childAt).a(true);
                }
            }
        }
    }

    public final void U(int i10) {
        int i11;
        if (!this.f30319f0) {
            int i12 = -1;
            if (i10 != -1) {
                int size = getRecentEmoji().size() + (this.f30312d0 ? 1 : 0);
                yx yxVar = this.R;
                int i13 = yxVar.f33070c;
                ArrayList arrayList = yxVar.f33076x;
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
                        ArrayList<dy> emojipacks = getEmojipacks();
                        int size2 = arrayList.size() - 1;
                        while (true) {
                            if (size2 < 0) {
                                break;
                            } else if (((Integer) arrayList.get(size2)).intValue() <= i10) {
                                dy dyVar = (dy) this.f30352q1.get(size2);
                                while (i14 < emojipacks.size()) {
                                    long j10 = emojipacks.get(i14).f25856b.f20371id;
                                    long j11 = dyVar.f25856b.f20371id;
                                    if (j10 == j11 && (!dyVar.f25859g || (!dyVar.f25858f && !this.f30349p1.contains(Long.valueOf(j11))))) {
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
        dz dzVar;
        int i11;
        boolean z12;
        boolean z13;
        wx wxVar = this.f30348p0;
        int currentPosition = wxVar.getCurrentPosition();
        int i12 = this.f30355r0;
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
        boolean isEmpty = this.f30329i1.isEmpty();
        wxVar.d(false);
        this.f30355r0 = -2;
        this.f30359s0 = -2;
        this.f30362t0 = -2;
        Drawable[] drawableArr = this.Z0;
        if (!isEmpty) {
            this.f30355r0 = 0;
            wxVar.b(0, drawableArr[0]).setContentDescription(LocaleController.getString(R.string.RecentStickers));
            i10 = 1;
        } else {
            i10 = 0;
        }
        this.f30359s0 = i10;
        wxVar.b(1, drawableArr[1]).setContentDescription(LocaleController.getString(R.string.FeaturedGifs));
        this.f30362t0 = i10 + 1;
        AndroidUtilities.dp(13.0f);
        AndroidUtilities.dp(11.0f);
        int i13 = this.f30310c1;
        ArrayList<String> arrayList = MessagesController.getInstance(i13).gifSearchEmojies;
        int size = arrayList.size();
        int i14 = 0;
        while (i14 < size) {
            String str = arrayList.get(i14);
            Emoji.EmojiDrawable emojiDrawable = Emoji.getEmojiDrawable(str);
            if (emojiDrawable != null) {
                TLRPC.Document emojiAnimatedSticker = MediaDataController.getInstance(i13).getEmojiAnimatedSticker(str);
                String k10 = i2.o1.k(i14 + 3, "tab");
                int i15 = wxVar.f27755x;
                wxVar.f27755x = i15 + 1;
                ay0 ay0Var = (ay0) wxVar.f27745n.get(k10);
                if (ay0Var != null) {
                    wxVar.g(k10, ay0Var, i15);
                    i11 = currentPosition;
                    z12 = z11;
                } else {
                    i11 = currentPosition;
                    z12 = z11;
                    ay0Var = new ay0(wxVar.getContext(), 2);
                    ay0Var.setFocusable(true);
                    ay0Var.setOnClickListener(new cn0(wxVar, 2));
                    ay0Var.setExpanded(wxVar.f27738f0);
                    ay0Var.a(wxVar.f27741i0);
                    wxVar.e.addView(ay0Var, i15);
                }
                ay0Var.d = false;
                ay0Var.setTag(R.id.index_tag, Integer.valueOf(i15));
                ay0Var.setTag(R.id.parent_tag, emojiDrawable);
                ay0Var.setTag(R.id.object_tag, emojiAnimatedSticker);
                if (i15 == wxVar.f27756y) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                ay0Var.setSelected(z13);
                wxVar.h.put(k10, ay0Var);
                ay0Var.setContentDescription(str);
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
        wxVar.h();
        wxVar.q();
        if (z10 && isEmpty) {
            wxVar.m(this.f30359s0);
            vw vwVar = this.f30345o0;
            if (vwVar != null && (dzVar = vwVar.f26147r) != null) {
                dzVar.L1(null);
                return;
            }
            return;
        }
        WeakHashMap weakHashMap = r0.i0.f45241a;
        if (wxVar.isLaidOut()) {
            if (!isEmpty && !z14) {
                wxVar.k(i16 + 1, 0);
            } else if (isEmpty && z14) {
                wxVar.k(i16 - 1, 0);
            }
        }
    }

    public final void W() {
        wy wyVar;
        int size = this.f30329i1.size();
        long calcDocumentsHash = MediaDataController.calcDocumentsHash(this.f30329i1, Integer.MAX_VALUE);
        ArrayList<TLRPC.Document> recentGifs = MediaDataController.getInstance(this.f30310c1).getRecentGifs();
        this.f30329i1 = recentGifs;
        long calcDocumentsHash2 = MediaDataController.calcDocumentsHash(recentGifs, Integer.MAX_VALUE);
        if ((this.f30348p0 != null && size == 0 && !this.f30329i1.isEmpty()) || (size != 0 && this.f30329i1.isEmpty())) {
            V();
        }
        if ((size != this.f30329i1.size() || calcDocumentsHash != calcDocumentsHash2) && (wyVar = this.f30342n0) != null) {
            wyVar.l();
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
        cx cxVar = this.B0;
        if (cxVar != null) {
            ua1 ua1Var = cxVar.e;
            if (cxVar.f27752s != null) {
                return;
            }
            this.F1 = -2;
            this.G1 = -2;
            this.H1 = -2;
            this.I1 = -2;
            this.f30315e0 = false;
            this.E1 = 0;
            int currentPosition = cxVar.getCurrentPosition();
            boolean z17 = true;
            if (getParent() != null && getVisibility() == 0 && (this.f30381y1.size() != 0 || this.f30384z1.size() != 0)) {
                z11 = true;
            } else {
                z11 = false;
            }
            cxVar.d(z11);
            int i11 = this.f30310c1;
            MediaDataController mediaDataController = MediaDataController.getInstance(i11);
            SharedPreferences emojiSettings = MessagesController.getEmojiSettings(i11);
            ArrayList arrayList3 = this.f30339m1;
            arrayList3.clear();
            ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = mediaDataController.getFeaturedStickerSets();
            int size = featuredStickerSets.size();
            for (int i12 = 0; i12 < size; i12++) {
                TLRPC.StickerSetCovered stickerSetCovered = featuredStickerSets.get(i12);
                if (!mediaDataController.isStickerPackInstalled(stickerSetCovered.set.f20371id)) {
                    arrayList3.add(stickerSetCovered);
                }
            }
            pz pzVar = this.F0;
            if (pzVar != null) {
                pzVar.l();
            }
            boolean isEmpty = featuredStickerSets.isEmpty();
            long j10 = 0;
            Drawable[] drawableArr = this.Y0;
            if (!isEmpty && (arrayList3.isEmpty() || emojiSettings.getLong("featured_hidden", 0L) == featuredStickerSets.get(0).set.f20371id)) {
                if (mediaDataController.getUnreadStickerSets().isEmpty()) {
                    i10 = 2;
                } else {
                    i10 = 3;
                }
                ay0 c10 = cxVar.c(i10, drawableArr[i10]);
                c10.h.setText(LocaleController.getString(R.string.FeaturedStickersShort));
                c10.setContentDescription(LocaleController.getString(R.string.FeaturedStickers));
                int i13 = this.E1;
                this.H1 = i13;
                this.E1 = i13 + 1;
            }
            if (!this.f30335k1.isEmpty()) {
                int i14 = this.E1;
                this.G1 = i14;
                this.E1 = i14 + 1;
                ay0 c11 = cxVar.c(1, drawableArr[1]);
                c11.h.setText(LocaleController.getString(R.string.FavoriteStickersShort));
                c11.setContentDescription(LocaleController.getString(R.string.FavoriteStickers));
            }
            if (!this.f30332j1.isEmpty()) {
                int i15 = this.E1;
                this.F1 = i15;
                this.E1 = i15 + 1;
                ay0 c12 = cxVar.c(0, drawableArr[0]);
                c12.h.setText(LocaleController.getString(R.string.RecentStickersShort));
                c12.setContentDescription(LocaleController.getString(R.string.RecentStickers));
            }
            ArrayList arrayList4 = this.f30313d1;
            arrayList4.clear();
            org.telegram.ui.ActionBar.g6 g6Var = null;
            this.f30326h1 = null;
            this.f30320f1 = -1;
            this.f30316e1 = -10;
            if (this.H2 == null || z10) {
                this.H2 = new ArrayList(mediaDataController.getStickerSets(0));
            }
            ArrayList<TLRPC.TL_messages_stickerSet> arrayList5 = this.H2;
            int i16 = 0;
            while (true) {
                TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.f30377x1;
                if (i16 >= stickerSetCoveredArr.length) {
                    break;
                }
                TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCoveredArr[i16];
                long j11 = j10;
                if (stickerSetCovered2 != null) {
                    TLRPC.TL_messages_stickerSet stickerSetById = mediaDataController.getStickerSetById(stickerSetCovered2.set.f20371id);
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
                long j13 = MessagesController.getEmojiSettings(i11).getLong("group_hide_stickers_" + this.J1.f20345id, -1L);
                TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(this.J1.f20345id));
                if (chat != null && this.J1.stickerset != null && ChatObject.hasAdminRights(chat)) {
                    TLRPC.StickerSet stickerSet3 = this.J1.stickerset;
                    if (stickerSet3 != null) {
                        if (j13 == stickerSet3.f20371id) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        this.f30323g1 = z16;
                    }
                } else {
                    if (j13 != -1) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    this.f30323g1 = z15;
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
                        if (this.f30323g1) {
                            this.f30316e1 = arrayList4.size();
                            arrayList4.add(tL_messages_stickerSet3);
                        } else {
                            this.f30316e1 = 0;
                            arrayList4.add(0, tL_messages_stickerSet3);
                        }
                        if (!this.J1.can_set_stickers) {
                            tL_messages_stickerSet3 = null;
                        }
                        this.f30326h1 = tL_messages_stickerSet3;
                    }
                } else if (chatFull.can_set_stickers) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = new TLRPC.TL_messages_stickerSet();
                    if (this.f30323g1) {
                        this.f30316e1 = arrayList4.size();
                        arrayList4.add(tL_messages_stickerSet4);
                    } else {
                        this.f30316e1 = 0;
                        arrayList4.add(0, tL_messages_stickerSet4);
                    }
                }
            }
            int i18 = 0;
            while (i18 < arrayList4.size()) {
                if (i18 == this.f30316e1) {
                    TLRPC.Chat chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(this.J1.f20345id));
                    if (chat2 == null) {
                        arrayList4.remove(0);
                        i18--;
                    } else {
                        this.f30315e0 = z17;
                        String str = "chat" + chat2.f20344id;
                        int i19 = cxVar.f27755x;
                        cxVar.f27755x = i19 + 1;
                        ay0 ay0Var = (ay0) cxVar.f27745n.get(str);
                        if (ay0Var != null) {
                            cxVar.g(str, ay0Var, i19);
                        } else {
                            ay0Var = new ay0(cxVar.getContext(), 0);
                            ay0Var.setFocusable(z17);
                            ay0Var.setOnClickListener(new cn0(cxVar, 0));
                            ua1Var.addView(ay0Var, i19);
                            ay0Var.f24843w = z17;
                            f9 f9Var = new f9(g6Var);
                            f9Var.u(AndroidUtilities.dp(14.0f));
                            f9Var.k(UserConfig.selectedAccount, chat2);
                            int i20 = cxVar.f27729a;
                            u9 u9Var = ay0Var.e;
                            u9Var.setLayerNum(i20);
                            u9Var.e(chat2, f9Var);
                            u9Var.setAspectFit(z17);
                            ay0Var.setExpanded(cxVar.f27738f0);
                            ay0Var.a(cxVar.f27741i0);
                            ay0Var.h.setText(chat2.title);
                        }
                        ay0Var.d = z17;
                        ay0Var.setTag(R.id.index_tag, Integer.valueOf(i19));
                        if (i19 == cxVar.f27756y) {
                            z14 = z17;
                        } else {
                            z14 = false;
                        }
                        ay0Var.setSelected(z14);
                        cxVar.h.put(str, ay0Var);
                    }
                    z12 = z17;
                } else {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet5 = (TLRPC.TL_messages_stickerSet) arrayList4.get(i18);
                    TLRPC.StickerSet stickerSet5 = tL_messages_stickerSet5.set;
                    if (stickerSet5 != null && stickerSet5.thumb_document_id != j12) {
                        for (int i21 = 0; i21 < tL_messages_stickerSet5.documents.size(); i21++) {
                            document = tL_messages_stickerSet5.documents.get(i21);
                            if (document != null && tL_messages_stickerSet5.set.thumb_document_id == document.f20350id) {
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
                    String str2 = "set" + tL_messages_stickerSet5.set.f20371id;
                    int i22 = cxVar.f27755x;
                    cxVar.f27755x = i22 + 1;
                    ay0 ay0Var2 = (ay0) cxVar.f27745n.get(str2);
                    if (ay0Var2 != null) {
                        cxVar.g(str2, ay0Var2, i22);
                        z12 = z17;
                    } else {
                        ay0Var2 = new ay0(cxVar.getContext(), 0);
                        ay0Var2.setFocusable(z17);
                        z12 = z17;
                        ay0Var2.setOnClickListener(new cn0(cxVar, 1));
                        ay0Var2.setExpanded(cxVar.f27738f0);
                        ay0Var2.a(cxVar.f27741i0);
                        ua1Var.addView(ay0Var2, i22);
                    }
                    ay0Var2.e.setLayerNum(cxVar.f27729a);
                    ay0Var2.d = false;
                    ay0Var2.setTag(closestPhotoSizeWithSize);
                    ay0Var2.setTag(R.id.index_tag, Integer.valueOf(i22));
                    ay0Var2.setTag(R.id.parent_tag, tL_messages_stickerSet5);
                    ay0Var2.setTag(R.id.object_tag, document);
                    if (i22 == cxVar.f27756y) {
                        z13 = z12;
                    } else {
                        z13 = false;
                    }
                    ay0Var2.setSelected(z13);
                    cxVar.h.put(str2, ay0Var2);
                    ay0Var2.setContentDescription(tL_messages_stickerSet5.set.title + ", " + LocaleController.getString(R.string.AccDescrStickerSet));
                }
                i18++;
                z17 = z12;
                g6Var = null;
            }
            cxVar.h();
            cxVar.q();
            if (currentPosition != 0) {
                cxVar.k(currentPosition, currentPosition);
            }
            p();
        }
    }

    public final void Y() {
        boolean z10;
        int i10;
        dx dxVar = this.C0;
        cx cxVar = this.B0;
        if (cxVar != null && dxVar == null && this.f30363t1 != null) {
            cxVar.setTranslationY(this.f30363t1.p() * (-AndroidUtilities.dp(50.0f)));
        }
        if (dxVar == null) {
            return;
        }
        if (getVisibility() == 0 && this.K0 && this.f30363t1.p() != 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        dxVar.setVisibility(i10);
        if (z10) {
            Rect rect = this.f30382y2;
            rect.setEmpty();
            this.h.getChildVisibleRect(this.f30376x0, rect, null);
            float p5 = this.f30363t1.p() * AndroidUtilities.dp(50.0f);
            int i11 = rect.left;
            if (i11 != 0 || p5 != 0.0f) {
                this.X1 = false;
            }
            dxVar.setTranslationX(i11);
            float translationY = (((getTranslationY() + getTop()) - dxVar.getTop()) - cxVar.getExpandedOffset()) - p5;
            if (dxVar.getTranslationY() != translationY) {
                dxVar.setTranslationY(translationY);
                dxVar.invalidate();
            }
        }
        if (this.X1 && z10 && this.P0) {
            cxVar.i(this.W1, true);
            return;
        }
        this.X1 = false;
        cxVar.i(this.W1, false);
    }

    public final void Z() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        org.telegram.ui.Cells.r3 r3Var;
        LongSparseArray longSparseArray = this.f30384z1;
        LongSparseArray longSparseArray2 = this.f30381y1;
        int i10 = this.f30310c1;
        yw ywVar = this.D0;
        if (ywVar != null) {
            try {
                int childCount = ywVar.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = ywVar.getChildAt(i11);
                    if ((childAt instanceof org.telegram.ui.Cells.r3) && ((vl0) ywVar.T(childAt)) != null) {
                        org.telegram.ui.Cells.r3 r3Var2 = (org.telegram.ui.Cells.r3) childAt;
                        ArrayList<Long> unreadStickerSets = MediaDataController.getInstance(i10).getUnreadStickerSets();
                        TLRPC.StickerSetCovered stickerSet = r3Var2.getStickerSet();
                        if (unreadStickerSets != null && unreadStickerSets.contains(Long.valueOf(stickerSet.set.f20371id))) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        int i12 = 0;
                        while (true) {
                            TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.f30377x1;
                            if (i12 < stickerSetCoveredArr.length) {
                                TLRPC.StickerSetCovered stickerSetCovered = stickerSetCoveredArr[i12];
                                if (stickerSetCovered != null) {
                                    r3Var = r3Var2;
                                    if (stickerSetCovered.set.f20371id == stickerSet.set.f20371id) {
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
                            MediaDataController.getInstance(i10).markFeaturedStickersByIdAsRead(false, stickerSet.set.f20371id);
                        }
                        if (longSparseArray2.indexOfKey(stickerSet.set.f20371id) >= 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (longSparseArray.indexOfKey(stickerSet.set.f20371id) >= 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z12 || z13) {
                            if (z12 && r3Var2.f23095r) {
                                longSparseArray2.remove(stickerSet.set.f20371id);
                                z12 = false;
                            } else if (z13 && !r3Var2.f23095r) {
                                longSparseArray.remove(stickerSet.set.f20371id);
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
    public final void b(int i10) {
        setBottomInset(i10);
    }

    @Override
    public final void c(float f7) {
        this.f30357r2 = f7;
        R();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        Utilities.Callback callback;
        TLRPC.StickerSet stickerSet;
        int i12 = NotificationCenter.stickersDidLoad;
        yx yxVar = this.R;
        jw jwVar = this.R2;
        if (i10 == i12) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (this.f30380y0 != null) {
                    X(((Boolean) objArr[1]).booleanValue());
                    Z();
                    D();
                    p();
                }
            } else if (((Integer) objArr[0]).intValue() == 5) {
                if (((Boolean) objArr[1]).booleanValue()) {
                    AndroidUtilities.cancelRunOnUIThread(jwVar);
                    AndroidUtilities.runOnUIThread(jwVar, 100L);
                    return;
                }
                yxVar.F(false);
            }
        } else if (i10 == NotificationCenter.groupPackUpdated) {
            long longValue = ((Long) objArr[0]).longValue();
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            TLRPC.ChatFull chatFull = this.J1;
            if (chatFull != null && chatFull.f20345id == longValue && booleanValue) {
                yxVar.F(true);
            }
        } else if (i10 == NotificationCenter.recentDocumentsDidLoad) {
            boolean booleanValue2 = ((Boolean) objArr[0]).booleanValue();
            int intValue = ((Integer) objArr[1]).intValue();
            if (booleanValue2 || intValue == 0 || intValue == 2) {
                k(booleanValue2);
            }
        } else if (i10 == NotificationCenter.featuredStickersDidLoad) {
            Z();
            yd0 yd0Var = this.f30371w;
            if (yd0Var != null) {
                int childCount = yd0Var.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    yd0Var.getChildAt(i13).invalidate();
                }
            }
            X(false);
        } else if (i10 == NotificationCenter.featuredEmojiDidLoad) {
            if (yxVar != null) {
                yxVar.F(false);
            }
        } else {
            int i14 = NotificationCenter.groupStickersDidLoad;
            ry ryVar = this.S;
            if (i10 == i14) {
                Long l4 = (Long) objArr[0];
                long longValue2 = l4.longValue();
                if (objArr.length > 1) {
                    tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) objArr[1];
                } else {
                    tL_messages_stickerSet = null;
                }
                if (tL_messages_stickerSet != null) {
                    mz mzVar = this.f30383z0;
                    if (mzVar != null && mzVar.d == longValue2 && mzVar.f28723f.size() < tL_messages_stickerSet.documents.size()) {
                        mzVar.f28723f = tL_messages_stickerSet.documents;
                        mzVar.l();
                    }
                    if (ryVar != null && ryVar.d == longValue2 && ryVar.f30291f.size() < tL_messages_stickerSet.documents.size()) {
                        ryVar.f30291f = tL_messages_stickerSet.documents;
                        ryVar.l();
                    }
                }
                TLRPC.ChatFull chatFull2 = this.J1;
                if (chatFull2 != null && (stickerSet = chatFull2.stickerset) != null && stickerSet.f20371id == longValue2) {
                    X(false);
                }
                HashMap hashMap = this.f30356r1;
                if (hashMap.containsKey(l4) && objArr.length >= 2 && ((Utilities.Callback) hashMap.get(l4)) != null && tL_messages_stickerSet != null && (callback = (Utilities.Callback) hashMap.remove(l4)) != null) {
                    callback.run(tL_messages_stickerSet);
                }
                AndroidUtilities.cancelRunOnUIThread(jwVar);
                AndroidUtilities.runOnUIThread(jwVar, 100L);
                return;
            }
            int i15 = NotificationCenter.emojiLoaded;
            cy cyVar = this.P;
            if (i10 == i15) {
                yw ywVar = this.D0;
                if (ywVar != null) {
                    int childCount2 = ywVar.getChildCount();
                    for (int i16 = 0; i16 < childCount2; i16++) {
                        View childAt = ywVar.getChildAt(i16);
                        if ((childAt instanceof org.telegram.ui.Cells.o8) || (childAt instanceof org.telegram.ui.Cells.e8)) {
                            childAt.invalidate();
                        }
                    }
                }
                if (cyVar != null) {
                    cyVar.invalidate();
                    int childCount3 = cyVar.getChildCount();
                    for (int i17 = 0; i17 < childCount3; i17++) {
                        View childAt2 = cyVar.getChildAt(i17);
                        if (childAt2 instanceof az) {
                            childAt2.invalidate();
                        }
                    }
                }
                cv cvVar = this.B1;
                if (cvVar != null) {
                    cvVar.f25478c.invalidate();
                }
                wx wxVar = this.f30348p0;
                if (wxVar != null) {
                    ua1 ua1Var = wxVar.e;
                    int childCount4 = ua1Var.getChildCount();
                    for (int i18 = 0; i18 < childCount4; i18++) {
                        ua1Var.getChildAt(i18).invalidate();
                    }
                }
            } else if (i10 == NotificationCenter.newEmojiSuggestionsAvailable) {
                if (cyVar != null && this.f30312d0) {
                    if ((this.V.f26144c.f33003k == 2 || cyVar.getAdapter() == ryVar) && !TextUtils.isEmpty(ryVar.v)) {
                        ryVar.F(ryVar.v, true);
                    }
                }
            } else if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                if (yxVar != null) {
                    yxVar.F(false);
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
            if (this.f30341n.getVisibility() != 8 && !this.f30365u0 && this.f30372w0) {
                canvas.drawColor(i0.a.o(-1, 25));
            }
            boolean drawChild = super.drawChild(canvas, view, j10);
            float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(this.f30353q2);
            if (navigationBarThirdButtonsFactor > 0.0f) {
                int o12 = org.telegram.ui.ActionBar.k6.o1(navigationBarThirdButtonsFactor, A(org.telegram.ui.ActionBar.k6.He));
                int i10 = this.C2;
                GradientDrawable gradientDrawable = this.B2;
                if (i10 != o12) {
                    gradientDrawable.setColors(new int[]{o12, org.telegram.ui.ActionBar.k6.o1(0.66f, o12), i0.a.o(o12, 0)});
                    this.C2 = o12;
                }
                gradientDrawable.setBounds(0, getMeasuredHeight() - this.f30353q2, getMeasuredWidth(), getMeasuredHeight());
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

    public ArrayList<dy> getEmojipacks() {
        ArrayList<dy> arrayList = new ArrayList<>();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f30352q1;
            if (i10 < arrayList2.size()) {
                dy dyVar = (dy) arrayList2.get(i10);
                boolean z10 = dyVar.f25859g;
                ArrayList arrayList3 = this.f30349p1;
                if ((!z10 && (dyVar.f25858f || arrayList3.contains(Long.valueOf(dyVar.f25856b.f20371id)))) || (dyVar.f25859g && !dyVar.f25858f && !arrayList3.contains(Long.valueOf(dyVar.f25856b.f20371id)))) {
                    arrayList.add(dyVar);
                }
                i10++;
            } else {
                return arrayList;
            }
        }
    }

    public ArrayList<String> getRecentEmoji() {
        if (this.f30311c2) {
            return Emoji.recentEmoji;
        }
        if (this.D2 == null) {
            this.D2 = new ArrayList();
        }
        if (Emoji.recentEmoji.size() != this.E2) {
            this.D2.clear();
            int i10 = 0;
            while (true) {
                ArrayList<String> arrayList = Emoji.recentEmoji;
                if (i10 >= arrayList.size()) {
                    break;
                }
                if (!arrayList.get(i10).startsWith("animated_")) {
                    this.D2.add(arrayList.get(i10));
                }
                i10++;
            }
            this.E2 = this.D2.size();
        }
        return this.D2;
    }

    public float getStickersExpandOffset() {
        cx cxVar = this.B0;
        if (cxVar == null) {
            return 0.0f;
        }
        return cxVar.getExpandedOffset();
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
                if (!this.f30311c2) {
                    ArrayList arrayList = this.D2;
                    if (arrayList == null) {
                        this.D2 = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    while (true) {
                        ArrayList<String> arrayList2 = Emoji.recentEmoji;
                        if (i10 < arrayList2.size()) {
                            if (!arrayList2.get(i10).startsWith("animated_")) {
                                this.D2.add(arrayList2.get(i10));
                            }
                            i10++;
                        } else {
                            this.E2 = this.D2.size();
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
        mx mxVar = new mx(getContext(), i11);
        mxVar.f46483a = !z10 ? 1 : 0;
        x(i10).w0(mxVar);
    }

    public final void k(boolean z10) {
        if (z10) {
            W();
            return;
        }
        int size = this.f30332j1.size();
        int size2 = this.f30335k1.size();
        int i10 = this.f30310c1;
        this.f30332j1 = MediaDataController.getInstance(i10).getRecentStickers(0, true);
        this.f30335k1 = MediaDataController.getInstance(i10).getRecentStickers(2);
        if (UserConfig.getInstance(i10).isPremium()) {
            this.l1 = MediaDataController.getInstance(i10).getRecentStickers(7);
        } else {
            this.l1 = new ArrayList();
        }
        for (int i11 = 0; i11 < this.f30335k1.size(); i11++) {
            TLRPC.Document document = (TLRPC.Document) this.f30335k1.get(i11);
            int i12 = 0;
            while (true) {
                if (i12 < this.f30332j1.size()) {
                    TLRPC.Document document2 = (TLRPC.Document) this.f30332j1.get(i12);
                    if (document2.dc_id == document.dc_id && document2.f20350id == document.f20350id) {
                        this.f30332j1.remove(i12);
                        break;
                    }
                    i12++;
                }
            }
        }
        if (MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            int i13 = 0;
            while (i13 < this.f30335k1.size()) {
                if (MessageObject.isPremiumSticker((TLRPC.Document) this.f30335k1.get(i13))) {
                    this.f30335k1.remove(i13);
                    i13--;
                }
                i13++;
            }
            int i14 = 0;
            while (i14 < this.f30332j1.size()) {
                if (MessageObject.isPremiumSticker((TLRPC.Document) this.f30332j1.get(i14))) {
                    this.f30332j1.remove(i14);
                    i14--;
                }
                i14++;
            }
        }
        if (size != this.f30332j1.size() || size2 != this.f30335k1.size()) {
            X(false);
        }
        iz izVar = this.f30380y0;
        if (izVar != null) {
            izVar.l();
        }
        p();
    }

    public final void l(boolean z10) {
        int i10;
        boolean z11;
        sy syVar = this.f30363t1;
        ne.b bVar = this.f30304b;
        cy cyVar = this.P;
        pw pwVar = this.V;
        if (syVar != null && syVar.z()) {
            s4.b1 K = cyVar.K(0);
            if (K == null) {
                ez.a(pwVar, true, !z10);
            } else {
                if (K.f46342a.getTop() < cyVar.getPaddingTop()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ez.a(pwVar, z11, !z10);
            }
            N(false, !z10);
            pwVar.setTranslationY(bVar.e * AndroidUtilities.dp(15.0f));
        } else if (pwVar != null && cyVar != null) {
            s4.b1 K2 = cyVar.K(0);
            if (K2 != null) {
                i10 = K2.f46342a.getTop();
            } else {
                i10 = -this.f30306b1;
            }
            pwVar.setTranslationY((bVar.e * AndroidUtilities.dp(15.0f)) + i10);
            pwVar.f26142a.a(false, !z10);
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
        if (dp > 0 && (K == null || K.f46342a.getBottom() < dp)) {
            z10 = true;
        }
        N(z10, !this.K1);
    }

    public final void n(int i10, View view) {
        cy cyVar;
        s4.b1 K;
        int i11;
        tx txVar = this.I;
        int[] iArr = this.Q0;
        if (view == null) {
            iArr[1] = 0;
            txVar.setTranslationY(0);
        } else if (view.getVisibility() == 0 && !this.f30319f0) {
            sy syVar = this.f30363t1;
            if (syVar == null || !syVar.z()) {
                if (i10 > 0 && (cyVar = this.P) != null && cyVar.getVisibility() == 0 && (K = cyVar.K(0)) != null) {
                    int top = K.f46342a.getTop();
                    if (this.f30312d0) {
                        i11 = this.f30306b1;
                    } else {
                        i11 = 0;
                    }
                    if (top + i11 >= cyVar.getPaddingTop()) {
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
                txVar.setTranslationY(Math.max(-AndroidUtilities.dp(36.0f), iArr[1]));
            }
        }
    }

    @Override
    public final void o(int i10, float f7, float f10, ne.e eVar) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = 4;
        if (i10 == 0) {
            r(false);
            float f11 = 1.0f - this.f30301a.e;
            bx bxVar = this.G0;
            bxVar.setAlpha(f11);
            if (f11 > 0.0f) {
                i13 = 0;
            } else {
                i13 = 4;
            }
            bxVar.setVisibility(i13);
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
            this.f30376x0.invalidate();
        } else if (i10 == 1) {
            l(false);
            float f13 = 1.0f - this.f30304b.e;
            pw pwVar = this.V;
            pwVar.setAlpha(f13);
            if (f13 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            pwVar.setVisibility(i11);
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

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.ObserversGroup observersGroup = this.O2;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.O2 = null;
        }
        NotificationCenter.ObserversGroup add = NotificationCenter.getInstance(this.f30310c1).createWeakObserversGroup(this).addGlobal(NotificationCenter.emojiLoaded).add(NotificationCenter.newEmojiSuggestionsAvailable).add(NotificationCenter.groupPackUpdated);
        this.O2 = add;
        if (this.f30380y0 != null) {
            add.add(NotificationCenter.stickersDidLoad).add(NotificationCenter.recentDocumentsDidLoad).add(NotificationCenter.featuredStickersDidLoad).add(NotificationCenter.groupStickersDidLoad).add(NotificationCenter.currentUserPremiumStatusChanged);
            AndroidUtilities.runOnUIThread(new jw(this, 0));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cv cvVar = this.B1;
        if (cvVar != null && cvVar.isShowing()) {
            cvVar.dismiss();
        }
        org.telegram.ui.ht o10 = org.telegram.ui.ht.o();
        if (o10.f37996l == this.f30324g2) {
            o10.W = null;
            o10.f37984a0 = null;
            o10.Y = null;
            o10.f37996l = null;
            o10.f37988c0 = null;
            o10.s();
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
        boolean z11 = this.f30312d0;
        if (!z10 && !this.N1) {
            if (this.L1 != 0) {
                if (!this.N2) {
                    setOutlineProvider(null);
                    setClipToOutline(false);
                    setElevation(0.0f);
                }
                if (this.f30365u0) {
                    int i12 = org.telegram.ui.ActionBar.k6.He;
                    setBackgroundColor(A(i12));
                    if (z11) {
                        view.setBackgroundColor(A(i12));
                    }
                }
                this.L1 = 0;
            }
        } else if (this.L1 != 1) {
            if (!this.N2) {
                setOutlineProvider(this.M1);
                setClipToOutline(true);
                setElevation(AndroidUtilities.dp(2.0f));
            }
            setBackgroundResource(R.drawable.smiles_popup);
            Drawable background = getBackground();
            int i13 = org.telegram.ui.ActionBar.k6.He;
            background.setColorFilter(new PorterDuffColorFilter(A(i13), PorterDuff.Mode.MULTIPLY));
            if (z11 && this.f30365u0) {
                view.setBackgroundColor(A(i13));
            }
            this.L1 = 1;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
        this.K1 = false;
        setTranslationY(getTranslationY());
    }

    public final void p() {
        int L0;
        cx cxVar = this.B0;
        if (cxVar != null && (L0 = this.E0.L0()) != -1) {
            int i10 = this.G1;
            if (i10 <= 0 && (i10 = this.F1) <= 0) {
                i10 = this.E1;
            }
            cxVar.k(this.f30380y0.F(L0), i10);
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
                this.B0.k(this.f30380y0.F(L02), i12);
            }
        } else if (i10 == 2) {
            s4.g0 adapter = this.f30325h0.getAdapter();
            wy wyVar = this.f30342n0;
            if (adapter == wyVar && wyVar.I >= 0 && this.f30359s0 >= 0 && this.f30355r0 >= 0 && (L0 = this.f30328i0.L0()) != -1) {
                if (L0 >= wyVar.I) {
                    i11 = this.f30359s0;
                } else {
                    i11 = this.f30355r0;
                }
                this.f30348p0.k(i11, 0);
            }
        }
    }

    public final void r(boolean z10) {
        int i10;
        sy syVar = this.f30363t1;
        ne.b bVar = this.f30301a;
        yw ywVar = this.D0;
        boolean z11 = false;
        bx bxVar = this.G0;
        if (syVar != null && syVar.z()) {
            s4.b1 K = ywVar.K(0);
            if (K == null) {
                ez.a(bxVar, true, !z10);
            } else {
                if (K.f46342a.getTop() < ywVar.getPaddingTop()) {
                    z11 = true;
                }
                ez.a(bxVar, z11, !z10);
            }
            bxVar.setTranslationY(bVar.e * AndroidUtilities.dp(15.0f));
        } else if (bxVar != null && ywVar != null) {
            s4.b1 K2 = ywVar.K(0);
            if (K2 != null) {
                i10 = K2.f46342a.getTop();
            } else {
                i10 = -this.f30306b1;
            }
            bxVar.setTranslationY((bVar.e * AndroidUtilities.dp(15.0f)) + i10);
            bxVar.f26142a.a(false, !z10);
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
        org.telegram.ui.ActionBar.g6 g6Var = this.Z1;
        View view = this.f30375x;
        if (view != null) {
            dh.d c10 = bVar.c(view, null, false);
            c10.o(fh.c.d(g6Var));
            c10.q(AndroidUtilities.dp(18.0f));
            c10.p(AndroidUtilities.dp(6.0f));
            view.setBackground(c10);
        }
        View view2 = this.E;
        if (view2 != null) {
            dh.d c11 = bVar.c(view2, null, false);
            c11.o(fh.c.d(g6Var));
            c11.q(AndroidUtilities.dp(18.0f));
            c11.p(AndroidUtilities.dp(6.0f));
            view2.setBackground(c11);
        }
        View view3 = this.f30371w;
        if (view3 != null) {
            dh.d c12 = bVar.c(view3, null, false);
            c12.o(fh.c.d(g6Var));
            c12.q(AndroidUtilities.dp(18.0f));
            c12.p(AndroidUtilities.dp(6.0f));
            view3.setBackground(c12);
        }
        View view4 = this.f30379y;
        if (view4 != null) {
            dh.d c13 = bVar.c(view4, null, false);
            c13.o(fh.c.d(g6Var));
            c13.q(AndroidUtilities.dp(18.0f));
            c13.p(AndroidUtilities.dp(6.0f));
            view4.setBackground(c13);
        }
    }

    public void setBottomInset(int i10) {
        if (this.f30353q2 != i10) {
            this.f30353q2 = i10;
            j(i10, this.K);
            j(i10, this.M);
            j(AndroidUtilities.dp(44.0f) + i10, this.P);
            j(AndroidUtilities.dp(44.0f) + i10, this.D0);
            j(AndroidUtilities.dp(44.0f) + i10, this.f30325h0);
            FrameLayout frameLayout = this.f30358s;
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

    public void setDelegate(sy syVar) {
        this.f30363t1 = syVar;
    }

    public void setDragListener(vx vxVar) {
        this.O0 = vxVar;
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        bx bxVar = this.G0;
        if (bxVar != null) {
            bxVar.d.setEnabled(z10);
        }
        vw vwVar = this.f30345o0;
        if (vwVar != null) {
            vwVar.d.setEnabled(z10);
        }
        pw pwVar = this.V;
        if (pwVar != null) {
            pwVar.d.setEnabled(z10);
        }
    }

    public void setForseMultiwindowLayout(boolean z10) {
        this.N1 = z10;
    }

    public void setShouldDrawBackground(boolean z10) {
        if (this.f30365u0 != z10) {
            this.f30365u0 = z10;
            updateColors();
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
                int i11 = this.f30310c1;
                NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.stickersDidLoad);
                if (this.f30380y0 != null) {
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

    public final void t(long j10, boolean z10) {
        ez ezVar;
        s4.b0 b0Var;
        View view;
        View view2;
        int i10;
        int i11;
        TLRPC.TL_messages_stickerSet stickerSetById;
        iz izVar;
        int E;
        AnimatorSet animatorSet = this.M0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.M0 = null;
        }
        int currentItem = this.h.getCurrentItem();
        int i12 = 2;
        if (currentItem == 2 && j10 != -1 && (stickerSetById = MediaDataController.getInstance(this.f30310c1).getStickerSetById(j10)) != null && (E = (izVar = this.f30380y0).E(stickerSetById)) >= 0 && E < izVar.h()) {
            G(E, AndroidUtilities.dp(48.0f));
        }
        int i13 = 0;
        wy wyVar = this.f30331j0;
        if (wyVar != null) {
            wyVar.K = false;
        }
        int i14 = 0;
        while (i14 < 3) {
            View view3 = this.D0;
            View view4 = this.f30325h0;
            vw vwVar = this.f30345o0;
            View view5 = this.P;
            if (i14 == 0) {
                ezVar = this.V;
                b0Var = this.Q;
                view = this.I;
                view2 = view5;
            } else if (i14 == 1) {
                b0Var = this.f30328i0;
                view = this.f30348p0;
                view2 = view4;
                ezVar = vwVar;
            } else {
                ezVar = this.G0;
                b0Var = this.E0;
                view = this.B0;
                view2 = view3;
            }
            if (ezVar == null) {
                i11 = i13;
                i10 = i12;
            } else {
                int i15 = i13;
                dz dzVar = ezVar.f26147r;
                int i16 = i12;
                ezVar.d.setText("");
                if (dzVar != null) {
                    dzVar.L1(null);
                    dzVar.J1();
                }
                int i17 = this.f30306b1;
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
                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(ezVar, property, fArr3);
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
                    this.M0.setInterpolator(zr.h);
                    this.M0.addListener(new ci.o3(this, b0Var, view2, 5));
                    this.M0.start();
                    i11 = i15;
                    i10 = i16;
                } else {
                    if (ezVar != vwVar) {
                        ezVar.setTranslationY(AndroidUtilities.dp(36.0f) - i17);
                    }
                    i10 = i16;
                    if (view != null && i14 != i10) {
                        view.setTranslationY(0.0f);
                    }
                    if (view2 == view3) {
                        i11 = i15;
                        view2.setPadding(i11, AndroidUtilities.dp(36.0f), i11, AndroidUtilities.dp(44.0f) + this.f30353q2);
                    } else {
                        i11 = i15;
                        if (view2 == view4) {
                            view2.setPadding(i11, AndroidUtilities.dp(40.0f), i11, AndroidUtilities.dp(44.0f) + this.f30353q2);
                        } else {
                            if (view2 == view5) {
                                view2.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f) + this.f30353q2);
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
            this.f30363t1.i(i18);
        }
    }

    public final void u(boolean z10) {
        t(-1L, z10);
    }

    @Override
    public final void updateColors() {
        try {
            S();
            gh.c cVar = this.f30338l2;
            if (cVar != null) {
                cVar.a(A(org.telegram.ui.ActionBar.k6.f21184d6));
            }
            yd0 yd0Var = this.f30371w;
            if (yd0Var != null) {
                yd0Var.setIndicatorColor(i0.a.o(A(org.telegram.ui.ActionBar.k6.Oe), 20));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void v(boolean z10) {
        iz izVar;
        boolean z11 = this.T2;
        this.T2 = z10;
        if (z11 && !z10) {
            int i10 = this.A1;
            if (i10 == 0) {
                yx yxVar = this.R;
                if (yxVar != null) {
                    yxVar.F(false);
                }
            } else if (i10 == 1) {
                wy wyVar = this.f30342n0;
                if (wyVar != null) {
                    wyVar.l();
                }
            } else if (i10 == 2 && (izVar = this.f30380y0) != null) {
                izVar.l();
            }
        }
    }

    public final int w(float f7) {
        return i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Wk, this.Z1), (int) (f7 * 255.0f));
    }

    public final s4.s x(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return this.f30328i0;
                }
                throw new IllegalArgumentException(i2.o1.k(i10, "Unexpected argument: "));
            }
            return this.Q;
        }
        return this.E0;
    }

    public final lm0 y(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return this.f30325h0;
                }
                throw new IllegalArgumentException(i2.o1.k(i10, "Unexpected argument: "));
            }
            return this.P;
        }
        return this.D0;
    }

    public final HorizontalScrollView z(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return this.f30348p0;
                }
                throw new IllegalArgumentException(i2.o1.k(i10, "Unexpected argument: "));
            }
            return this.I;
        }
        return this.B0;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void H(float f7, int i10) {
    }
}
