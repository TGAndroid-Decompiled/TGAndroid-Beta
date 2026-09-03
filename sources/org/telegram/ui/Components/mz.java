package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RecordingCanvas;
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
import j$.util.Objects;
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
import org.telegram.ui.ob1;
public class mz extends FrameLayout implements xd.b, NotificationCenter.NotificationCenterDelegate, dh.a {
    public static final int L2 = 0;
    public final rw A0;
    public final int[] A1;
    public ArrayList A2;
    public final ImageView B;
    public final sw B0;
    public int B1;
    public int B2;
    public AnimatorSet C;
    public kz C0;
    public int C1;
    public long C2;
    public AnimatorSet D;
    public final uw D0;
    public int D1;
    public final xd.a D2;
    public float E;
    public final bh.e E0;
    public int E1;
    public ArrayList E2;
    public final hw F;
    public boolean F0;
    public int F1;
    public boolean F2;
    public final jx G;
    public boolean G0;
    public TLRPC.ChatFull G1;
    public AnimatorSet G2;
    public final ag.l H;
    public boolean H0;
    public boolean H1;
    public org.telegram.messenger.video.l H2;
    public final bh.c I;
    public final ey I0;
    public int I1;
    public final aw I2;
    public final ag.l J;
    public AnimatorSet J0;
    public final lf.o0 J1;
    public boolean J2;
    public final bh.c K;
    public final hg.q K0;
    public boolean K1;
    public boolean K2;
    public final View L;
    public qx L0;
    public int L1;
    public final kx M;
    public boolean M0;
    public boolean M1;
    public final lx N;
    public final int[] N0;
    public boolean N1;
    public final tx O;
    public final ObjectAnimator[] O0;
    public uy O1;
    public final ly P;
    public boolean P0;
    public float P1;
    public kz Q;
    public bx Q0;
    public float Q1;
    public final bh.e R;
    public boolean R0;
    public float R1;
    public final iw S;
    public boolean S0;
    public float S1;
    public AnimatorSet T;
    public String[] T0;
    public float T1;
    public final c2.y U;
    public final Drawable[] U0;
    public boolean U1;
    public final c2.y V;
    public final Drawable[] V0;
    public final org.telegram.ui.ActionBar.p2 V1;
    public boolean W;
    public final Drawable[] W0;
    public final org.telegram.ui.ActionBar.g6 W1;
    public final String[] X0;
    public final org.telegram.ui.ActionBar.v5 X1;
    public final int Y0;
    public final org.telegram.ui.ActionBar.v5 Y1;
    public final int Z0;
    public final boolean Z1;
    public final xd.a f29265a;
    public final boolean f29266a0;
    public final ArrayList f29267a1;
    public LongSparseArray a2;
    public final xd.a f29268b;
    public boolean f29269b0;
    public int f29270b1;
    public PorterDuffColorFilter f29271b2;
    public int f29272c;
    public boolean f29273c0;
    public int f29274c1;
    public final m2.b f29275c2;
    public final ArrayList d;
    public final kw f29276d0;
    public boolean f29277d1;
    public final cx f29278d2;
    public final ArrayList f29279e;
    public final lw f29280e0;
    public TLRPC.TL_messages_stickerSet f29281e1;
    public boolean f29282e2;
    public boolean f29283f;
    public final ry f29284f0;
    public ArrayList f29285f1;
    public final boolean f29286f2;
    public final qy f29287g0;
    public ArrayList f29288g1;
    public final og.e f29289g2;
    public final xw h;
    public final ty f29290h0;
    public ArrayList f29291h1;
    public final ah f29292h2;
    public final HashMap f29293i0;
    public ArrayList f29294i1;
    public final tg.d f29295i2;
    public final fw f29296j0;
    public final ArrayList f29297j1;
    public final tg.c f29298j2;
    public final qy f29299k0;
    public final ArrayList f29300k1;
    public final og.a f29301k2;
    public final ow f29302l0;
    public final ArrayList l1;
    public boolean f29303l2;
    public final rx m0;
    public final ArrayList f29304m1;
    public boolean f29305m2;
    public final FrameLayout f29306n;
    public boolean f29307n0;
    public final ArrayList f29308n1;
    public int f29309n2;
    public int f29310o0;
    public final HashMap f29311o1;
    public float f29312o2;
    public int f29313p0;
    public final Paint f29314p1;
    public View f29315p2;
    public int f29316q0;
    public my f29317q1;
    public int f29318q2;
    public final FrameLayout f29319r;
    public boolean f29320r0;
    public long f29321r1;
    public int f29322r2;
    public final FrameLayout f29323s;
    public boolean f29324s0;
    public boolean f29325s1;
    public long f29326s2;
    public boolean f29327t0;
    public boolean f29328t1;
    public boolean f29329t2;
    public final pw f29330u0;
    public final TLRPC.StickerSetCovered[] f29331u1;
    public boolean f29332u2;
    public final View v;
    public final dz f29333v0;
    public final LongSparseArray f29334v1;
    public final Rect f29335v2;
    public final hd0 f29336w;
    public final hz f29337w0;
    public final LongSparseArray f29338w1;
    public final RectF f29339w2;
    public final yw f29340x;
    public final fw f29341x0;
    public int f29342x1;
    public final ArrayList f29343x2;
    public final ImageView f29344y;
    public final vw f29345y0;
    public final tu f29346y1;
    public final GradientDrawable f29347y2;
    public final ww f29348z0;
    public final int f29349z1;
    public int f29350z2;

    public mz(org.telegram.ui.ActionBar.p2 p2Var, boolean z4, boolean z10, boolean z11, Context context, boolean z12, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z13, final org.telegram.ui.ActionBar.g6 g6Var, boolean z14, boolean z15) {
        super(context);
        org.telegram.ui.ActionBar.v5 v5Var;
        int A;
        kx kxVar;
        aw awVar;
        boolean z16;
        boolean z17;
        Context context2;
        int i10;
        tx txVar;
        int i11;
        jx jxVar;
        final org.telegram.ui.ActionBar.g6 g6Var2;
        int i12;
        boolean z18;
        boolean z19;
        Field field;
        pr prVar = pr.h;
        this.f29265a = new xd.a(0, this, prVar, 320L, false);
        this.f29268b = new xd.a(1, this, prVar, 320L, false);
        this.f29272c = 2;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.f29279e = new ArrayList();
        this.W = true;
        this.f29290h0 = new ty(this);
        this.f29293i0 = new HashMap();
        this.f29307n0 = true;
        this.f29310o0 = -2;
        this.f29313p0 = -2;
        this.f29316q0 = -2;
        this.f29320r0 = true;
        this.f29327t0 = true;
        this.F0 = true;
        this.N0 = new int[3];
        this.O0 = new ObjectAnimator[3];
        int i13 = UserConfig.selectedAccount;
        this.Z0 = i13;
        this.f29267a1 = new ArrayList();
        this.f29285f1 = new ArrayList();
        this.f29288g1 = new ArrayList();
        this.f29291h1 = new ArrayList();
        this.f29294i1 = new ArrayList();
        this.f29297j1 = new ArrayList();
        this.f29300k1 = new ArrayList();
        new ArrayList();
        this.l1 = new ArrayList();
        this.f29304m1 = new ArrayList();
        this.f29308n1 = new ArrayList();
        this.f29311o1 = new HashMap();
        this.f29331u1 = new TLRPC.StickerSetCovered[10];
        this.f29334v1 = new LongSparseArray();
        this.f29338w1 = new LongSparseArray();
        this.A1 = new int[2];
        this.C1 = -2;
        this.D1 = -2;
        this.E1 = -2;
        this.F1 = -2;
        this.I1 = -1;
        this.f29275c2 = new m2.b(this, 20);
        this.f29278d2 = new cx(this);
        this.f29282e2 = true;
        this.f29312o2 = -1.0f;
        this.f29318q2 = -1;
        this.f29322r2 = -1;
        this.f29326s2 = -1L;
        this.f29329t2 = false;
        this.f29332u2 = true;
        this.f29335v2 = new Rect();
        RectF rectF = new RectF();
        this.f29339w2 = rectF;
        ArrayList arrayList2 = new ArrayList(1);
        this.f29343x2 = arrayList2;
        arrayList2.add(rectF);
        new Paint(1);
        this.f29347y2 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.D2 = new xd.a(0, new dw(this, 1), prVar, 380L, true);
        this.I2 = new aw(this, 2);
        this.J2 = false;
        this.f29320r0 = z13;
        this.V1 = p2Var;
        this.Z1 = z4;
        this.W1 = g6Var;
        this.f29286f2 = z15;
        tg.c cVar = new tg.c();
        this.f29298j2 = cVar;
        cVar.a(A(org.telegram.ui.ActionBar.k6.f21661d6));
        if (z14) {
            u(true);
        }
        i0.a.k(A(org.telegram.ui.ActionBar.k6.Wk), 30);
        int dp = AndroidUtilities.dp(50.0f);
        this.Y0 = dp;
        this.f29266a0 = z12;
        this.U0 = new Drawable[]{org.telegram.ui.ActionBar.k6.U(context, R.drawable.smiles_tab_smiles, z15 ? v(0.4f) : A(org.telegram.ui.ActionBar.k6.Re), z15 ? v(0.8f) : A(org.telegram.ui.ActionBar.k6.Oe)), org.telegram.ui.ActionBar.k6.U(context, R.drawable.smiles_tab_gif, z15 ? v(0.4f) : A(org.telegram.ui.ActionBar.k6.Re), z15 ? v(0.8f) : A(org.telegram.ui.ActionBar.k6.Oe)), org.telegram.ui.ActionBar.k6.U(context, R.drawable.smiles_tab_stickers, z15 ? v(0.4f) : A(org.telegram.ui.ActionBar.k6.Re), z15 ? v(0.8f) : A(org.telegram.ui.ActionBar.k6.Oe))};
        org.telegram.ui.ActionBar.v5 U = org.telegram.ui.ActionBar.k6.U(context, R.drawable.msg_emoji_recent, z15 ? v(0.4f) : A(org.telegram.ui.ActionBar.k6.Me), z15 ? v(0.8f) : A(org.telegram.ui.ActionBar.k6.Oe));
        org.telegram.ui.ActionBar.v5 U2 = org.telegram.ui.ActionBar.k6.U(context, R.drawable.emoji_tabs_faves, z15 ? v(0.4f) : A(org.telegram.ui.ActionBar.k6.Me), z15 ? v(0.8f) : A(org.telegram.ui.ActionBar.k6.Oe));
        org.telegram.ui.ActionBar.v5 U3 = org.telegram.ui.ActionBar.k6.U(context, R.drawable.emoji_tabs_new3, z15 ? v(0.4f) : A(org.telegram.ui.ActionBar.k6.Me), z15 ? v(0.8f) : A(org.telegram.ui.ActionBar.k6.Oe));
        int i14 = R.drawable.emoji_tabs_new1;
        if (z15) {
            v5Var = U3;
            A = v(0.4f);
        } else {
            v5Var = U3;
            A = A(org.telegram.ui.ActionBar.k6.Me);
        }
        org.telegram.ui.ActionBar.v5 U4 = org.telegram.ui.ActionBar.k6.U(context, i14, A, z15 ? v(0.8f) : A(org.telegram.ui.ActionBar.k6.Oe));
        this.X1 = U4;
        int i15 = R.drawable.emoji_tabs_new2;
        int i16 = org.telegram.ui.ActionBar.k6.Qe;
        org.telegram.ui.ActionBar.v5 U5 = org.telegram.ui.ActionBar.k6.U(context, i15, A(i16), A(i16));
        this.Y1 = U5;
        this.V0 = new Drawable[]{U, U2, v5Var, new LayerDrawable(new Drawable[]{U4, U5})};
        this.W0 = new Drawable[]{org.telegram.ui.ActionBar.k6.U(context, R.drawable.msg_emoji_recent, z15 ? v(0.4f) : A(org.telegram.ui.ActionBar.k6.Me), z15 ? v(0.8f) : A(org.telegram.ui.ActionBar.k6.Oe)), org.telegram.ui.ActionBar.k6.U(context, R.drawable.stickers_gifs_trending, z15 ? v(0.4f) : A(org.telegram.ui.ActionBar.k6.Me), z15 ? v(0.8f) : A(org.telegram.ui.ActionBar.k6.Oe))};
        this.X0 = new String[]{LocaleController.getString(R.string.Emoji1), LocaleController.getString(R.string.Emoji2), LocaleController.getString(R.string.Emoji3), LocaleController.getString(R.string.Emoji4), LocaleController.getString(R.string.Emoji5), LocaleController.getString(R.string.Emoji6), LocaleController.getString(R.string.Emoji7), LocaleController.getString(R.string.Emoji8)};
        this.G1 = chatFull;
        Paint paint = new Paint(1);
        this.f29314p1 = paint;
        paint.setColor(A(org.telegram.ui.ActionBar.k6.f21615af));
        hg.j1 j1Var = lf.q0.f12504a;
        this.J1 = new lf.o0(AndroidUtilities.dp(6.0f));
        jx jxVar2 = new jx(this, context);
        this.G = jxVar2;
        ?? obj = new Object();
        obj.f27918a = 0;
        obj.f27919b = jxVar2;
        arrayList.add(obj);
        if (z4) {
            MediaDataController.getInstance(i13).checkStickers(5);
            MediaDataController.getInstance(i13).checkFeaturedEmoji();
            this.f29271b2 = new PorterDuffColorFilter(A(org.telegram.ui.ActionBar.k6.Oh), PorterDuff.Mode.SRC_IN);
        }
        kx kxVar2 = new kx(this, context);
        this.M = kxVar2;
        f2.l lVar = new f2.l();
        lVar.f5930c = 220L;
        lVar.f5931e = 220L;
        lVar.f5932f = 160L;
        lVar.f5933g = 160L;
        lVar.f5934i = pr.f30169g;
        kxVar2.setItemAnimator(lVar);
        kxVar2.setOnTouchListener(new View.OnTouchListener(this) {
            public final mz f26051b;

            {
                this.f26051b = this;
            }

            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                switch (r3) {
                    case 0:
                        org.telegram.ui.qt q10 = org.telegram.ui.qt.q();
                        mz mzVar = this.f26051b;
                        kx kxVar3 = mzVar.M;
                        mzVar.getMeasuredHeight();
                        return q10.s(motionEvent, kxVar3, null, mzVar.f29278d2, g6Var);
                    case 1:
                        org.telegram.ui.qt q11 = org.telegram.ui.qt.q();
                        mz mzVar2 = this.f26051b;
                        return q11.s(motionEvent, mzVar2.f29280e0, mzVar2.f29296j0, mzVar2.f29278d2, g6Var);
                    default:
                        org.telegram.ui.qt q12 = org.telegram.ui.qt.q();
                        mz mzVar3 = this.f26051b;
                        rw rwVar = mzVar3.A0;
                        mzVar3.getMeasuredHeight();
                        return q12.s(motionEvent, rwVar, mzVar3.f29341x0, mzVar3.f29278d2, g6Var);
                }
            }
        });
        kxVar2.setOnItemLongClickListener(new dw(this, 0));
        kxVar2.setInstantClick(true);
        lx lxVar = new lx(this);
        this.N = lxVar;
        kxVar2.setLayoutManager(lxVar);
        kxVar2.setTopGlowOffset(AndroidUtilities.dp(38.0f));
        kxVar2.setBottomGlowOffset(AndroidUtilities.dp(36.0f));
        kxVar2.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f));
        int i17 = org.telegram.ui.ActionBar.k6.He;
        kxVar2.setGlowColor(A(i17));
        kxVar2.setItemSelectorColorProvider(new k2(15));
        kxVar2.setClipToPadding(false);
        lxVar.O = new mx(this);
        tx txVar2 = new tx(this);
        this.O = txVar2;
        kxVar2.setAdapter(txVar2);
        kxVar2.i(new hg.e2(this, 3));
        this.P = new ly(this, context);
        jxVar2.addView(kxVar2, k7.c6.c(-1.0f, -1));
        c2.y yVar = new c2.y(kxVar2, lxVar);
        this.V = yVar;
        yVar.f2211i = new nx(this);
        kxVar2.setOnScrollListener(new ox(this));
        if (p2Var != null) {
            kxVar = kxVar2;
            awVar = new aw(this, 5);
            z17 = z15;
            context2 = context;
            i10 = i16;
            txVar = txVar2;
            jxVar = jxVar2;
            z16 = z4;
            g6Var2 = g6Var;
            i12 = dp;
            i11 = -1;
        } else {
            kxVar = kxVar2;
            awVar = null;
            z16 = z4;
            z17 = z15;
            context2 = context;
            i10 = i16;
            txVar = txVar2;
            i11 = -1;
            jxVar = jxVar2;
            g6Var2 = g6Var;
            i12 = dp;
        }
        hw hwVar = new hw(this, context2, g6Var2, z16, awVar, z17);
        this.F = hwVar;
        if (z12) {
            iw iwVar = new iw(this, context2);
            this.S = iwVar;
            jxVar.addView(iwVar, new FrameLayout.LayoutParams(i11, AndroidUtilities.getShadowHeight() + i12));
            iwVar.d.setOnFocusChangeListener(new jw(this));
            bh.e eVar = new bh.e(context2, g6Var2);
            this.R = eVar;
            eVar.setVisibility(8);
            eVar.setOnBackClickListener(new View.OnClickListener(this) {
                public final mz f26684b;

                {
                    this.f26684b = this;
                }

                @Override
                public final void onClick(View view) {
                    yy yyVar;
                    switch (r2) {
                        case 0:
                            ly lyVar = this.f26684b.P;
                            fy fyVar = lyVar.f28894c;
                            int childCount = fyVar.getChildCount();
                            for (int i18 = 0; i18 < childCount; i18++) {
                                ((bh.d) fyVar.getChildAt(i18)).a(false, true);
                            }
                            lyVar.d = 0L;
                            lyVar.C.f29268b.a(false, true);
                            lyVar.l();
                            return;
                        case 1:
                            hz hzVar = this.f26684b.f29337w0;
                            gz gzVar = hzVar.f27660c;
                            int childCount2 = gzVar.getChildCount();
                            for (int i19 = 0; i19 < childCount2; i19++) {
                                ((bh.d) gzVar.getChildAt(i19)).a(false, true);
                            }
                            hzVar.d = 0L;
                            hzVar.N.f29265a.a(false, true);
                            hzVar.l();
                            return;
                        case 2:
                            my myVar = this.f26684b.f29317q1;
                            if (myVar != null) {
                                myVar.w();
                                return;
                            }
                            return;
                        default:
                            mz mzVar = this.f26684b;
                            int currentItem = mzVar.h.getCurrentItem();
                            if (currentItem == 0) {
                                yyVar = mzVar.S;
                            } else if (currentItem == 1) {
                                yyVar = mzVar.f29302l0;
                            } else {
                                yyVar = mzVar.D0;
                            }
                            if (yyVar != null) {
                                iq iqVar = yyVar.d;
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
            jxVar.addView(eVar, new FrameLayout.LayoutParams(i11, i12));
        }
        int A2 = A(i17);
        if (Color.alpha(A2) >= 255) {
            hwVar.setBackgroundColor(A2);
        }
        tx txVar3 = txVar;
        txVar3.G(true);
        hwVar.p(getEmojipacks());
        jxVar.addView(hwVar, k7.c6.c(36.0f, i11));
        View view = new View(context2);
        this.L = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        int i18 = org.telegram.ui.ActionBar.k6.Ke;
        view.setBackgroundColor(A(i18));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i11, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(36.0f);
        jxVar.addView(view, layoutParams);
        bh.c cVar2 = new bh.c(context2, g6Var2);
        this.I = cVar2;
        ag.l lVar2 = new ag.l(context2, 1, g6Var2);
        this.H = lVar2;
        lVar2.setVisibility(8);
        lVar2.addView(cVar2, k7.c6.d(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
        jxVar.addView(lVar2, k7.c6.e(i11, -2, 80));
        if (z10) {
            om0 om0Var = om0.f29822b;
            if (z11) {
                kw kwVar = new kw(this, context2);
                this.f29276d0 = kwVar;
                ?? obj2 = new Object();
                obj2.f27918a = 1;
                obj2.f27919b = kwVar;
                this.d.add(obj2);
                lw lwVar = new lw(this, context2);
                this.f29280e0 = lwVar;
                lwVar.setClipToPadding(false);
                ry ryVar = new ry(this);
                this.f29284f0 = ryVar;
                lwVar.setLayoutManager(ryVar);
                lwVar.i(new mw(this));
                lwVar.setPadding(0, i12, 0, AndroidUtilities.dp(44.0f) + this.f29309n2);
                lwVar.setOverScrollMode(2);
                ((f2.p1) lwVar.getItemAnimator()).f5910m = false;
                qy qyVar = new qy(this, context2, true, Integer.MAX_VALUE);
                this.f29299k0 = qyVar;
                lwVar.setAdapter(qyVar);
                this.f29287g0 = new qy(this, context2, false, 0);
                lwVar.setOnScrollListener(new nw(this));
                lwVar.setOnTouchListener(new View.OnTouchListener(this) {
                    public final mz f26051b;

                    {
                        this.f26051b = this;
                    }

                    @Override
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        switch (r3) {
                            case 0:
                                org.telegram.ui.qt q10 = org.telegram.ui.qt.q();
                                mz mzVar = this.f26051b;
                                kx kxVar3 = mzVar.M;
                                mzVar.getMeasuredHeight();
                                return q10.s(motionEvent, kxVar3, null, mzVar.f29278d2, g6Var2);
                            case 1:
                                org.telegram.ui.qt q11 = org.telegram.ui.qt.q();
                                mz mzVar2 = this.f26051b;
                                return q11.s(motionEvent, mzVar2.f29280e0, mzVar2.f29296j0, mzVar2.f29278d2, g6Var2);
                            default:
                                org.telegram.ui.qt q12 = org.telegram.ui.qt.q();
                                mz mzVar3 = this.f26051b;
                                rw rwVar = mzVar3.A0;
                                mzVar3.getMeasuredHeight();
                                return q12.s(motionEvent, rwVar, mzVar3.f29341x0, mzVar3.f29278d2, g6Var2);
                        }
                    }
                });
                ?? r82 = new il0(this) {
                    public final mz f27018b;

                    {
                        this.f27018b = this;
                    }

                    @Override
                    public final void f(int i19, View view2) {
                        int i20;
                        String str;
                        switch (r2) {
                            case 0:
                                mz mzVar = this.f27018b;
                                lw lwVar2 = mzVar.f29280e0;
                                qy qyVar2 = mzVar.f29287g0;
                                qy qyVar3 = mzVar.f29299k0;
                                if (mzVar.f29317q1 != null) {
                                    qyVar3.getClass();
                                    ArrayList arrayList3 = qyVar3.f30556x;
                                    if (lwVar2.getAdapter() == qyVar3) {
                                        if (i19 >= 0) {
                                            int i21 = qyVar3.E;
                                            if (i19 < i21) {
                                                mzVar.f29317q1.v(view2, mzVar.f29285f1.get(i19), null, "gif", true, 0, 0);
                                                return;
                                            }
                                            if (i21 > 0) {
                                                i20 = (i19 - i21) - 1;
                                            } else {
                                                i20 = i19;
                                            }
                                            if (i20 >= 0 && i20 < arrayList3.size()) {
                                                mzVar.f29317q1.v(view2, arrayList3.get(i20), null, qyVar3.f30552n, true, 0, 0);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    } else if (lwVar2.getAdapter() == qyVar2 && i19 >= 0 && i19 < qyVar2.f30556x.size()) {
                                        mzVar.f29317q1.v(view2, qyVar2.f30556x.get(i19), qyVar2.f30555w, qyVar2.f30552n, true, 0, 0);
                                        mzVar.Y();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            default:
                                mz mzVar2 = this.f27018b;
                                f2.p0 adapter = mzVar2.A0.getAdapter();
                                hz hzVar = mzVar2.f29337w0;
                                if (adapter == hzVar) {
                                    str = hzVar.K;
                                } else {
                                    str = null;
                                }
                                String str2 = str;
                                if (view2 instanceof org.telegram.ui.Cells.d8) {
                                    org.telegram.ui.Cells.d8 d8Var = (org.telegram.ui.Cells.d8) view2;
                                    if (d8Var.getSticker() != null && MessageObject.isPremiumSticker(d8Var.getSticker()) && !AccountInstance.getInstance(mzVar2.Z0).getUserConfig().isPremium()) {
                                        org.telegram.ui.qt.q().y(d8Var);
                                        return;
                                    }
                                    org.telegram.ui.qt.q().u();
                                    if (!d8Var.f22691r) {
                                        d8Var.f22691r = true;
                                        d8Var.f22690n = 0.5f;
                                        d8Var.f22694x = 0L;
                                        org.telegram.ui.Cells.c8 c8Var = d8Var.f22685a;
                                        c8Var.setAlpha(0.5f * d8Var.E);
                                        c8Var.invalidate();
                                        d8Var.f22692s = System.currentTimeMillis();
                                        d8Var.invalidate();
                                        mzVar2.f29317q1.m(d8Var, d8Var.getSticker(), str2, d8Var.getParentObject(), d8Var.getSendAnimationData(), true, 0);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                };
                this.f29296j0 = r82;
                lwVar.setOnItemClickListener((il0) r82);
                kwVar.addView(lwVar, k7.c6.c(-1.0f, -1));
                ow owVar = new ow(this, context2);
                this.f29302l0 = owVar;
                kwVar.addView(owVar, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + i12));
                rx rxVar = new rx(this, context2, g6Var2);
                this.m0 = rxVar;
                rxVar.setType(om0Var);
                rxVar.setUnderlineHeight(AndroidUtilities.getShadowHeight());
                rxVar.setIndicatorColor(A(i10));
                rxVar.setUnderlineColor(A(i18));
                rxVar.setBackgroundColor(A(i17));
                X();
                rxVar.setDelegate(new dw(this, 2));
                qyVar.F("", "", true, true, true);
            }
            pw pwVar = new pw(this, context2, z13);
            this.f29330u0 = pwVar;
            MediaDataController.getInstance(this.Z0).checkStickers(0);
            MediaDataController.getInstance(this.Z0).checkFeaturedStickers();
            rw rwVar = new rw(this, context2);
            this.A0 = rwVar;
            sw swVar = new sw(this);
            this.B0 = swVar;
            rwVar.setLayoutManager(swVar);
            swVar.O = new tw(this);
            rwVar.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f));
            rwVar.setClipToPadding(false);
            ?? obj3 = new Object();
            obj3.f27918a = 2;
            obj3.f27919b = pwVar;
            this.d.add(obj3);
            this.f29337w0 = new hz(this, context2);
            dz dzVar = new dz(this, context2);
            this.f29333v0 = dzVar;
            rwVar.setAdapter(dzVar);
            rwVar.setOnTouchListener(new View.OnTouchListener(this) {
                public final mz f26051b;

                {
                    this.f26051b = this;
                }

                @Override
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    switch (r3) {
                        case 0:
                            org.telegram.ui.qt q10 = org.telegram.ui.qt.q();
                            mz mzVar = this.f26051b;
                            kx kxVar3 = mzVar.M;
                            mzVar.getMeasuredHeight();
                            return q10.s(motionEvent, kxVar3, null, mzVar.f29278d2, g6Var2);
                        case 1:
                            org.telegram.ui.qt q11 = org.telegram.ui.qt.q();
                            mz mzVar2 = this.f26051b;
                            return q11.s(motionEvent, mzVar2.f29280e0, mzVar2.f29296j0, mzVar2.f29278d2, g6Var2);
                        default:
                            org.telegram.ui.qt q12 = org.telegram.ui.qt.q();
                            mz mzVar3 = this.f26051b;
                            rw rwVar2 = mzVar3.A0;
                            mzVar3.getMeasuredHeight();
                            return q12.s(motionEvent, rwVar2, mzVar3.f29341x0, mzVar3.f29278d2, g6Var2);
                    }
                }
            });
            ?? r42 = new il0(this) {
                public final mz f27018b;

                {
                    this.f27018b = this;
                }

                @Override
                public final void f(int i19, View view2) {
                    int i20;
                    String str;
                    switch (r2) {
                        case 0:
                            mz mzVar = this.f27018b;
                            lw lwVar2 = mzVar.f29280e0;
                            qy qyVar2 = mzVar.f29287g0;
                            qy qyVar3 = mzVar.f29299k0;
                            if (mzVar.f29317q1 != null) {
                                qyVar3.getClass();
                                ArrayList arrayList3 = qyVar3.f30556x;
                                if (lwVar2.getAdapter() == qyVar3) {
                                    if (i19 >= 0) {
                                        int i21 = qyVar3.E;
                                        if (i19 < i21) {
                                            mzVar.f29317q1.v(view2, mzVar.f29285f1.get(i19), null, "gif", true, 0, 0);
                                            return;
                                        }
                                        if (i21 > 0) {
                                            i20 = (i19 - i21) - 1;
                                        } else {
                                            i20 = i19;
                                        }
                                        if (i20 >= 0 && i20 < arrayList3.size()) {
                                            mzVar.f29317q1.v(view2, arrayList3.get(i20), null, qyVar3.f30552n, true, 0, 0);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                } else if (lwVar2.getAdapter() == qyVar2 && i19 >= 0 && i19 < qyVar2.f30556x.size()) {
                                    mzVar.f29317q1.v(view2, qyVar2.f30556x.get(i19), qyVar2.f30555w, qyVar2.f30552n, true, 0, 0);
                                    mzVar.Y();
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        default:
                            mz mzVar2 = this.f27018b;
                            f2.p0 adapter = mzVar2.A0.getAdapter();
                            hz hzVar = mzVar2.f29337w0;
                            if (adapter == hzVar) {
                                str = hzVar.K;
                            } else {
                                str = null;
                            }
                            String str2 = str;
                            if (view2 instanceof org.telegram.ui.Cells.d8) {
                                org.telegram.ui.Cells.d8 d8Var = (org.telegram.ui.Cells.d8) view2;
                                if (d8Var.getSticker() != null && MessageObject.isPremiumSticker(d8Var.getSticker()) && !AccountInstance.getInstance(mzVar2.Z0).getUserConfig().isPremium()) {
                                    org.telegram.ui.qt.q().y(d8Var);
                                    return;
                                }
                                org.telegram.ui.qt.q().u();
                                if (!d8Var.f22691r) {
                                    d8Var.f22691r = true;
                                    d8Var.f22690n = 0.5f;
                                    d8Var.f22694x = 0L;
                                    org.telegram.ui.Cells.c8 c8Var = d8Var.f22685a;
                                    c8Var.setAlpha(0.5f * d8Var.E);
                                    c8Var.invalidate();
                                    d8Var.f22692s = System.currentTimeMillis();
                                    d8Var.invalidate();
                                    mzVar2.f29317q1.m(d8Var, d8Var.getSticker(), str2, d8Var.getParentObject(), d8Var.getSendAnimationData(), true, 0);
                                    return;
                                }
                                return;
                            }
                            return;
                    }
                }
            };
            this.f29341x0 = r42;
            rwVar.setOnItemClickListener((il0) r42);
            rwVar.setGlowColor(A(i17));
            pwVar.addView(rwVar);
            this.U = new c2.y(rwVar, swVar);
            uw uwVar = new uw(this, context2);
            this.D0 = uwVar;
            pwVar.addView(uwVar, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + i12));
            bh.e eVar2 = new bh.e(context2, g6Var2);
            this.E0 = eVar2;
            eVar2.setVisibility(8);
            eVar2.setOnBackClickListener(new View.OnClickListener(this) {
                public final mz f26684b;

                {
                    this.f26684b = this;
                }

                @Override
                public final void onClick(View view2) {
                    yy yyVar;
                    switch (r2) {
                        case 0:
                            ly lyVar = this.f26684b.P;
                            fy fyVar = lyVar.f28894c;
                            int childCount = fyVar.getChildCount();
                            for (int i182 = 0; i182 < childCount; i182++) {
                                ((bh.d) fyVar.getChildAt(i182)).a(false, true);
                            }
                            lyVar.d = 0L;
                            lyVar.C.f29268b.a(false, true);
                            lyVar.l();
                            return;
                        case 1:
                            hz hzVar = this.f26684b.f29337w0;
                            gz gzVar = hzVar.f27660c;
                            int childCount2 = gzVar.getChildCount();
                            for (int i19 = 0; i19 < childCount2; i19++) {
                                ((bh.d) gzVar.getChildAt(i19)).a(false, true);
                            }
                            hzVar.d = 0L;
                            hzVar.N.f29265a.a(false, true);
                            hzVar.l();
                            return;
                        case 2:
                            my myVar = this.f26684b.f29317q1;
                            if (myVar != null) {
                                myVar.w();
                                return;
                            }
                            return;
                        default:
                            mz mzVar = this.f26684b;
                            int currentItem = mzVar.h.getCurrentItem();
                            if (currentItem == 0) {
                                yyVar = mzVar.S;
                            } else if (currentItem == 1) {
                                yyVar = mzVar.f29302l0;
                            } else {
                                yyVar = mzVar.D0;
                            }
                            if (yyVar != null) {
                                iq iqVar = yyVar.d;
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
            pwVar.addView(eVar2, new FrameLayout.LayoutParams(-1, i12));
            z18 = z13;
            z19 = true;
            vw vwVar = new vw(this, context2, g6Var2, p2Var, z18);
            this.f29345y0 = vwVar;
            vwVar.setDragEnabled(true);
            vwVar.setWillNotDraw(false);
            vwVar.setType(om0Var);
            vwVar.setUnderlineHeight(rwVar.canScrollVertically(-1) ? AndroidUtilities.getShadowHeight() : 0);
            vwVar.setIndicatorColor(A(i10));
            vwVar.setUnderlineColor(A(i18));
            if (viewGroup != null && z18) {
                ww wwVar = new ww(this, context2);
                this.f29348z0 = wwVar;
                wwVar.addView(vwVar, k7.c6.e(-1, 36, 51));
                viewGroup.addView(wwVar, k7.c6.c(-2.0f, -1));
            } else {
                pwVar.addView(vwVar, k7.c6.e(-1, 36, 51));
            }
            Z(true);
            vwVar.setDelegate(new dw(this, 3));
            rwVar.setOnScrollListener(new lz(this, 0));
            bh.c cVar3 = new bh.c(context2, g6Var2);
            this.K = cVar3;
            ag.l lVar3 = new ag.l(context2, 1, g6Var2);
            this.J = lVar3;
            lVar3.setVisibility(8);
            lVar3.addView(cVar3, k7.c6.d(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
            pwVar.addView(lVar3, k7.c6.e(-1, -2, 80));
        } else {
            z18 = z13;
            z19 = true;
        }
        this.f29279e.clear();
        this.f29279e.addAll(this.d);
        xw xwVar = new xw(this, context2);
        this.h = xwVar;
        ey eyVar = new ey(this);
        this.I0 = eyVar;
        xwVar.setAdapter(eyVar);
        yw ywVar = new yw(this, context2);
        this.f29340x = ywVar;
        ywVar.setHapticFeedbackEnabled(z19);
        ywVar.setImageResource(R.drawable.smiles_tab_clear);
        int v = z15 ? v(0.6f) : A(org.telegram.ui.ActionBar.k6.Re);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        ywVar.setColorFilter(new PorterDuffColorFilter(v, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        ywVar.setScaleType(scaleType);
        ywVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
        ywVar.setFocusable(z19);
        ywVar.setOnClickListener(new Object());
        k7.e6.a(ywVar);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f29319r = frameLayout;
        if (z12) {
            addView(frameLayout, k7.c6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, (AndroidUtilities.getShadowHeight() / AndroidUtilities.density) + 40.0f));
        } else {
            addView(frameLayout, k7.c6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.f29323s = frameLayout2;
        addView(frameLayout2, k7.c6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 64.0f));
        FrameLayout frameLayout3 = new FrameLayout(context2);
        this.f29306n = frameLayout3;
        View view2 = new View(context2);
        this.v = view2;
        frameLayout3.addView(view2, new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(40.0f), 83));
        if (z12) {
            addView(frameLayout3, k7.c6.e(-1, 48, 80));
            frameLayout3.addView(ywVar, k7.c6.d(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
            if (z10) {
                ImageView imageView = new ImageView(context2);
                this.f29344y = imageView;
                imageView.setImageResource(R.drawable.smiles_tab_settings);
                imageView.setColorFilter(new PorterDuffColorFilter(z15 ? v(0.6f) : A(org.telegram.ui.ActionBar.k6.Re), mode));
                imageView.setScaleType(scaleType);
                imageView.setFocusable(true);
                imageView.setContentDescription(LocaleController.getString(R.string.Settings));
                k7.e6.a(imageView);
                frameLayout3.addView(imageView, k7.c6.d(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
                imageView.setOnClickListener(new View.OnClickListener(this) {
                    public final mz f26684b;

                    {
                        this.f26684b = this;
                    }

                    @Override
                    public final void onClick(View view22) {
                        yy yyVar;
                        switch (r2) {
                            case 0:
                                ly lyVar = this.f26684b.P;
                                fy fyVar = lyVar.f28894c;
                                int childCount = fyVar.getChildCount();
                                for (int i182 = 0; i182 < childCount; i182++) {
                                    ((bh.d) fyVar.getChildAt(i182)).a(false, true);
                                }
                                lyVar.d = 0L;
                                lyVar.C.f29268b.a(false, true);
                                lyVar.l();
                                return;
                            case 1:
                                hz hzVar = this.f26684b.f29337w0;
                                gz gzVar = hzVar.f27660c;
                                int childCount2 = gzVar.getChildCount();
                                for (int i19 = 0; i19 < childCount2; i19++) {
                                    ((bh.d) gzVar.getChildAt(i19)).a(false, true);
                                }
                                hzVar.d = 0L;
                                hzVar.N.f29265a.a(false, true);
                                hzVar.l();
                                return;
                            case 2:
                                my myVar = this.f26684b.f29317q1;
                                if (myVar != null) {
                                    myVar.w();
                                    return;
                                }
                                return;
                            default:
                                mz mzVar = this.f26684b;
                                int currentItem = mzVar.h.getCurrentItem();
                                if (currentItem == 0) {
                                    yyVar = mzVar.S;
                                } else if (currentItem == 1) {
                                    yyVar = mzVar.f29302l0;
                                } else {
                                    yyVar = mzVar.D0;
                                }
                                if (yyVar != null) {
                                    iq iqVar = yyVar.d;
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
            hd0 hd0Var = new hd0(context2, g6Var2);
            this.f29336w = hd0Var;
            hd0Var.setViewPager(xwVar);
            hd0Var.setShouldExpand(false);
            hd0Var.setIndicatorHeight(AndroidUtilities.dp(3.0f));
            hd0Var.setIndicatorColor(i0.a.k(A(org.telegram.ui.ActionBar.k6.Oe), 20));
            hd0Var.setUnderlineHeight(0);
            hd0Var.setTabPaddingLeftRight(AndroidUtilities.dp(11.0f));
            hd0Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f));
            frameLayout3.addView(hd0Var, k7.c6.e(-2, 48, 81));
            hd0Var.setOnPageChangeListener(new ax(this, z18));
            ImageView imageView2 = new ImageView(context2);
            this.B = imageView2;
            imageView2.setImageResource(R.drawable.smiles_tab_search);
            imageView2.setColorFilter(new PorterDuffColorFilter(z15 ? v(0.6f) : A(org.telegram.ui.ActionBar.k6.Re), mode));
            imageView2.setScaleType(scaleType);
            imageView2.setContentDescription(LocaleController.getString(R.string.Search));
            imageView2.setFocusable(true);
            imageView2.setVisibility(8);
            frameLayout3.addView(imageView2, k7.c6.d(48, 48.0f, 83, 2.0f, 0.0f, 2.0f, 0.0f));
            imageView2.setOnClickListener(new View.OnClickListener(this) {
                public final mz f26684b;

                {
                    this.f26684b = this;
                }

                @Override
                public final void onClick(View view22) {
                    yy yyVar;
                    switch (r2) {
                        case 0:
                            ly lyVar = this.f26684b.P;
                            fy fyVar = lyVar.f28894c;
                            int childCount = fyVar.getChildCount();
                            for (int i182 = 0; i182 < childCount; i182++) {
                                ((bh.d) fyVar.getChildAt(i182)).a(false, true);
                            }
                            lyVar.d = 0L;
                            lyVar.C.f29268b.a(false, true);
                            lyVar.l();
                            return;
                        case 1:
                            hz hzVar = this.f26684b.f29337w0;
                            gz gzVar = hzVar.f27660c;
                            int childCount2 = gzVar.getChildCount();
                            for (int i19 = 0; i19 < childCount2; i19++) {
                                ((bh.d) gzVar.getChildAt(i19)).a(false, true);
                            }
                            hzVar.d = 0L;
                            hzVar.N.f29265a.a(false, true);
                            hzVar.l();
                            return;
                        case 2:
                            my myVar = this.f26684b.f29317q1;
                            if (myVar != null) {
                                myVar.w();
                                return;
                            }
                            return;
                        default:
                            mz mzVar = this.f26684b;
                            int currentItem = mzVar.h.getCurrentItem();
                            if (currentItem == 0) {
                                yyVar = mzVar.S;
                            } else if (currentItem == 1) {
                                yyVar = mzVar.f29302l0;
                            } else {
                                yyVar = mzVar.D0;
                            }
                            if (yyVar != null) {
                                iq iqVar = yyVar.d;
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
            addView(frameLayout3, k7.c6.d(56, 48.0f, (LocaleController.isRTL ? 3 : 5) | 80, 0.0f, 0.0f, 2.0f, 0.0f));
            org.telegram.ui.Cells.z h02 = org.telegram.ui.ActionBar.k6.h0(AndroidUtilities.dp(56.0f), A(i17), A(i17));
            k7.e6.a(ywVar);
            ywVar.setPadding(0, 0, AndroidUtilities.dp(2.0f), 0);
            ywVar.setBackground(h02);
            ywVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
            ywVar.setFocusable(true);
            frameLayout3.addView(ywVar, k7.c6.d(48, 48.0f, 51, 2.0f, 0.0f, 2.0f, 0.0f));
            view2.setVisibility(8);
        }
        addView(xwVar, 0, k7.c6.e(-1, -1, 51));
        hg.q qVar = new hg.q(context2, 21);
        this.K0 = qVar;
        qVar.setBackground(org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(6.0f), A(org.telegram.ui.ActionBar.k6.f21904qf)));
        qVar.setTextColor(A(org.telegram.ui.ActionBar.k6.f21886pf));
        qVar.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f));
        qVar.setGravity(16);
        qVar.setTextSize(1, 14.0f);
        qVar.setVisibility(4);
        addView(qVar, k7.c6.d(-2, -2.0f, 81, 5.0f, 0.0f, 5.0f, 53.0f));
        this.f29349z1 = AndroidUtilities.dp(AndroidUtilities.isTablet() ? 40.0f : 32.0f);
        Field field2 = tu.f31415f;
        tu tuVar = new tu(new su(context2, g6Var2));
        if (tu.f31415f == null) {
            try {
                field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
                try {
                    field.setAccessible(true);
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                field = null;
            }
            tu.f31415f = field;
        }
        Field field3 = tu.f31415f;
        if (field3 != null) {
            try {
                tuVar.f31417a = (ViewTreeObserver.OnScrollChangedListener) field3.get(tuVar);
                tu.f31415f.set(tuVar, tu.f31416g);
            } catch (Exception unused3) {
                tuVar.f31417a = null;
            }
        }
        this.f29346y1 = tuVar;
        tuVar.f31419c.setOnSelectionUpdateListener(new d(this, 10));
        this.f29342x1 = MessagesController.getGlobalEmojiSettings().getInt("selected_page", 0);
        Emoji.loadRecentEmoji();
        txVar3.F(false);
        J(true, z10, z11, false);
        if (Build.VERSION.SDK_INT >= 31) {
            tg.d dVar = new tg.d(null);
            this.f29295i2 = dVar;
            og.a aVar = new og.a(dVar);
            this.f29301k2 = aVar;
            aVar.f16757f = LiteMode.isEnabled(262144);
            this.f29289g2 = new og.e(false);
        } else {
            this.f29295i2 = null;
            this.f29301k2 = new og.a(this.f29298j2);
            this.f29289g2 = null;
        }
        vg.i iVar = new vg.i(this);
        hd0 hd0Var2 = this.f29336w;
        if (hd0Var2 != null) {
            iVar.d(hd0Var2, this, new dw(this, 4), false);
        }
        og.a aVar2 = this.f29301k2;
        aVar2.d = iVar;
        aVar2.f16756e = this;
        pg.a[] aVarArr = new pg.a[3];
        kx kxVar3 = kxVar;
        kxVar3.C0(new aw(this, 1));
        aVarArr[0] = new og.k(kxVar3, this, new bw(kxVar3, 0));
        lw lwVar2 = this.f29280e0;
        if (lwVar2 != null) {
            lwVar2.C0(new aw(this, 3));
            lw lwVar3 = this.f29280e0;
            Objects.requireNonNull(lwVar3);
            aVarArr[1] = new og.k(lwVar3, this, new bw(lwVar3, 1));
        }
        rw rwVar2 = this.A0;
        if (rwVar2 != null) {
            rwVar2.C0(new aw(this, 4));
            aVarArr[2] = new og.k(this.A0, this, new bw(this, 2));
        }
        this.f29292h2 = new ah(aVarArr, 1);
        setBlurredBackgroundDrawableFactory(this.f29301k2);
    }

    public static void a(mz mzVar, boolean z4) {
        lw lwVar = mzVar.f29280e0;
        if (lwVar != null) {
            int childCount = lwVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = lwVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.e2) {
                    ImageReceiver photoImage = ((org.telegram.ui.Cells.e2) childAt).getPhotoImage();
                    if (z4) {
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

    public static void d(mz mzVar, uy uyVar, String str) {
        String str2;
        String str3;
        boolean z4;
        String str4;
        my myVar;
        qc qcVar;
        org.telegram.ui.ActionBar.p2 p2Var = mzVar.V1;
        int i10 = mzVar.Z0;
        ArrayList arrayList = mzVar.f29308n1;
        if (uyVar != null) {
            if (uyVar.getSpan() != null) {
                if (mzVar.f29317q1 != null) {
                    long j10 = uyVar.getSpan().documentId;
                    TLRPC.Document document = uyVar.getSpan().document;
                    xx xxVar = uyVar.f31708e;
                    if (xxVar != null && xxVar.f33217i) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (document == null) {
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            xx xxVar2 = (xx) arrayList.get(i11);
                            int i12 = 0;
                            while (true) {
                                ArrayList arrayList2 = xxVar2.f33213c;
                                if (arrayList2 != null && i12 < arrayList2.size()) {
                                    if (((TLRPC.Document) xxVar2.f33213c.get(i12)).f20851id == j10) {
                                        document = (TLRPC.Document) xxVar2.f33213c.get(i12);
                                        break;
                                    }
                                    i12++;
                                }
                            }
                        }
                    }
                    if (document == null) {
                        document = l5.f(i10, j10);
                    }
                    if (document != null) {
                        str4 = MessageObject.findAnimatedEmojiEmoticon(document);
                    } else {
                        str4 = null;
                    }
                    String str5 = str4;
                    if (!MessageObject.isFreeEmoji(document) && !UserConfig.getInstance(i10).isPremium() && (((myVar = mzVar.f29317q1) == null || !myVar.g()) && !mzVar.R0 && !z4)) {
                        mzVar.O(false);
                        if (p2Var != null) {
                            qcVar = qc.a0(p2Var);
                        } else {
                            qcVar = new qc(mzVar.f29319r, mzVar.W1);
                        }
                        if (!mzVar.f29282e2 && p2Var != null) {
                            qcVar.J(R.raw.saved_messages, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint2)), LocaleController.getString(R.string.Open), new aw(mzVar, 8)).j();
                        } else {
                            qcVar.q(document, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint)), LocaleController.getString(R.string.PremiumMore), new aw(mzVar, 7)).j();
                        }
                        mzVar.f29282e2 = !mzVar.f29282e2;
                        return;
                    }
                    mzVar.C2 = SystemClock.elapsedRealtime();
                    mzVar.O(true);
                    mzVar.h("animated_" + j10);
                    mzVar.f29317q1.x(j10, document, str5, uyVar.f31707c);
                    return;
                }
                return;
            }
            mzVar.C2 = SystemClock.elapsedRealtime();
            mzVar.O(true);
            if (str != null) {
                str2 = str;
            } else {
                str2 = (String) uyVar.getTag();
            }
            new SpannableStringBuilder().append((CharSequence) str2);
            if (str == null) {
                if (!uyVar.f31707c && (str3 = Emoji.emojiColor.get(str2)) != null) {
                    str2 = g(str2, str3);
                }
                mzVar.h(str2);
                my myVar2 = mzVar.f29317q1;
                if (myVar2 != null) {
                    myVar2.l(Emoji.fixEmoji(str2));
                    return;
                }
                return;
            }
            my myVar3 = mzVar.f29317q1;
            if (myVar3 != null) {
                myVar3.l(Emoji.fixEmoji(str));
            }
        }
    }

    public static void e(mz mzVar, int i10, int i11) {
        f2.m1 K;
        int[] iArr = mzVar.N0;
        if (i10 == 1) {
            mzVar.n(mzVar.M, i11);
            return;
        }
        my myVar = mzVar.f29317q1;
        if ((myVar == null || !myVar.z()) && !mzVar.G0) {
            sl0 x10 = mzVar.x(i10);
            if (i11 > 0 && x10 != null && x10.getVisibility() == 0 && (K = x10.K(0)) != null && K.f5875a.getTop() + mzVar.Y0 >= x10.getPaddingTop()) {
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
                mzVar.a0();
            } else {
                mzVar.y(i10).setTranslationY(Math.max(-AndroidUtilities.dp(48.0f), iArr[i10]));
            }
        }
    }

    public static void f(mz mzVar, boolean z4) {
        int N0;
        ry ryVar = mzVar.f29284f0;
        ow owVar = mzVar.f29302l0;
        lw lwVar = mzVar.f29280e0;
        if (lwVar != null && (lwVar.getAdapter() instanceof qy)) {
            qy qyVar = (qy) lwVar.getAdapter();
            if (!qyVar.f30554s && qyVar.h == 0 && !qyVar.f30556x.isEmpty() && (N0 = ryVar.N0()) != -1 && N0 > ryVar.B() - 5) {
                String str = qyVar.f30555w;
                String str2 = qyVar.f30553r;
                boolean z10 = qyVar.v;
                qyVar.F(str, str2, true, z10, z10);
            }
        }
        my myVar = mzVar.f29317q1;
        if (myVar != null && myVar.z()) {
            boolean z11 = false;
            f2.m1 K = lwVar.K(0);
            if (K == null) {
                yy.a(owVar, true, !z4);
                return;
            }
            if (K.f5875a.getTop() < lwVar.getPaddingTop()) {
                z11 = true;
            }
            yy.a(owVar, z11, !z4);
        } else if (owVar != null && lwVar != null) {
            owVar.f33683a.a(true, !z4);
        }
    }

    public static String g(String str, String str2) {
        boolean z4;
        String str3;
        if (CompoundEmoji.isHandshake(str) != null) {
            return CompoundEmoji.applyColor(str, str2);
        }
        if (Emoji.endsWithRightArrow(str)) {
            str = e2.c.j(str, 2, 0);
            z4 = true;
        } else {
            z4 = false;
        }
        int length = str.length();
        if (length > 2 && str.charAt(str.length() - 2) == 8205) {
            str3 = str.substring(str.length() - 2);
            str = e2.c.j(str, 2, 0);
        } else if (length > 3 && str.charAt(str.length() - 3) == 8205) {
            str3 = str.substring(str.length() - 3);
            str = e2.c.j(str, 3, 0);
        } else {
            str3 = null;
        }
        String e6 = w.c.e(str, str2);
        if (str3 != null) {
            e6 = w.c.e(e6, str3);
        }
        if (z4) {
            return w.c.e(e6, "\u200d➡");
        }
        return e6;
    }

    public static void j(int i10, View view) {
        if (view == null) {
            return;
        }
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i10);
    }

    public final int A(int i10) {
        org.telegram.ui.ActionBar.g6 g6Var = this.W1;
        if (g6Var != null) {
            return g6Var.B0(i10);
        }
        return org.telegram.ui.ActionBar.k6.w0(null, i10, false);
    }

    public final void B() {
        uw uwVar = this.D0;
        if (uwVar != null) {
            uwVar.b();
        }
        ow owVar = this.f29302l0;
        if (owVar != null) {
            owVar.b();
        }
        iw iwVar = this.S;
        if (iwVar != null) {
            iwVar.b();
        }
    }

    public final void C() {
        og.e eVar;
        float f10;
        if (Build.VERSION.SDK_INT >= 31 && (eVar = this.f29289g2) != null) {
            hd0 hd0Var = this.f29336w;
            RectF rectF = this.f29339w2;
            vg.i.c(hd0Var, this, rectF);
            float f11 = 0.0f;
            if (LiteMode.isEnabled(262144)) {
                f10 = 0.0f;
            } else {
                f10 = -AndroidUtilities.dp(48.0f);
            }
            if (!LiteMode.isEnabled(262144)) {
                f11 = -AndroidUtilities.dp(48.0f);
            }
            rectF.inset(f10, f11);
            rectF.right = getMeasuredWidth();
            rectF.bottom = Math.min(rectF.bottom, getMeasuredHeight());
            eVar.g(1, this.f29343x2);
            eVar.e(this.f29292h2, getWidth(), getHeight());
        }
    }

    public final void D() {
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        int i10 = this.Z0;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.groupPackUpdated);
        if (this.f29333v0 != null) {
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.recentDocumentsDidLoad);
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.featuredStickersDidLoad);
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.groupStickersDidLoad);
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        }
    }

    public final void E(boolean z4, boolean z10) {
        xy xyVar;
        boolean z11;
        if (this.f29342x1 != 0 && this.f29328t1) {
            this.f29342x1 = 0;
        }
        if (this.f29342x1 == 0 && this.f29325s1) {
            this.f29342x1 = 1;
        }
        int i10 = this.f29342x1;
        xw xwVar = this.h;
        if (i10 != 0 && !z4 && this.f29279e.size() != 1) {
            int i11 = this.f29342x1;
            if (i11 == 1) {
                N(false, false);
                if (!this.f29320r0 && !this.f29324s0) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                S(z11, false);
                if (xwVar.getCurrentItem() != 2) {
                    xwVar.x(2, false);
                }
                vw vwVar = this.f29345y0;
                if (vwVar != null) {
                    this.P0 = true;
                    int i12 = this.D1;
                    if (i12 >= 0) {
                        vwVar.m(i12);
                    } else {
                        int i13 = this.C1;
                        if (i13 >= 0) {
                            vwVar.m(i13);
                        } else {
                            vwVar.m(this.B1);
                        }
                    }
                    this.P0 = false;
                    this.B0.h1(0, 0);
                }
            } else if (i11 == 2) {
                N(false, false);
                S(false, false);
                if (xwVar.getCurrentItem() != 1) {
                    xwVar.x(1, false);
                }
                rx rxVar = this.m0;
                if (rxVar != null) {
                    rxVar.m(0);
                }
                ow owVar = this.f29302l0;
                if (owVar != null && (xyVar = owVar.f33689r) != null) {
                    xyVar.E1(null);
                }
            }
        } else {
            N(true, false);
            S(false, false);
            if (xwVar.getCurrentItem() != 0) {
                xwVar.x(0, !z4);
            }
            if (z10) {
                AndroidUtilities.runOnUIThread(new aw(this, 9), 350L);
            }
        }
        O(true);
    }

    public final void F() {
        dz dzVar = this.f29333v0;
        if (dzVar != null) {
            dzVar.l();
        }
        hz hzVar = this.f29337w0;
        if (hzVar != null) {
            hzVar.l();
        }
        if (org.telegram.ui.qt.q().E) {
            org.telegram.ui.qt.q().n();
        }
        org.telegram.ui.qt.q().u();
    }

    public final void G(int i10) {
        my myVar = this.f29317q1;
        if ((myVar != null && myVar.z()) || i10 == 0) {
            return;
        }
        HorizontalScrollView y10 = y(i10);
        this.N0[i10] = 0;
        y10.setTranslationY(0);
    }

    public final void H(int i10, int i11) {
        lx lxVar = this.N;
        View m9 = lxVar.m(i10);
        int L0 = lxVar.L0();
        int i12 = 1;
        if ((m9 == null && Math.abs(i10 - L0) > lxVar.J * 9.0f) || !SharedConfig.animationsEnabled()) {
            if (lxVar.L0() < i10) {
                i12 = 0;
            }
            c2.y yVar = this.V;
            yVar.f2206b = i12;
            yVar.c(i10, i11, false, false);
            return;
        }
        this.G0 = true;
        fx fxVar = new fx(this, this.M.getContext(), 0);
        fxVar.f5805a = i10;
        fxVar.f50695p = i11;
        lxVar.w0(fxVar);
    }

    public final void I(int i10, int i11) {
        sw swVar = this.B0;
        View m9 = swVar.m(i10);
        int L0 = swVar.L0();
        int i12 = 1;
        if (m9 == null && Math.abs(i10 - L0) > 40) {
            if (swVar.L0() < i10) {
                i12 = 0;
            }
            c2.y yVar = this.U;
            yVar.f2206b = i12;
            yVar.c(i10, i11, false, false);
            return;
        }
        this.G0 = true;
        this.A0.x0(i10);
    }

    public final void J(boolean z4, boolean z10, boolean z11, boolean z12) {
        ArrayList arrayList = this.f29279e;
        arrayList.clear();
        boolean z13 = false;
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.d;
            if (i10 >= arrayList2.size()) {
                break;
            }
            if (((iz) arrayList2.get(i10)).f27918a == 0 && z4) {
                arrayList.add((iz) arrayList2.get(i10));
            }
            if (((iz) arrayList2.get(i10)).f27918a == 1 && z11) {
                arrayList.add((iz) arrayList2.get(i10));
            }
            if (((iz) arrayList2.get(i10)).f27918a == 2 && z10) {
                arrayList.add((iz) arrayList2.get(i10));
            }
            i10++;
        }
        hd0 hd0Var = this.f29336w;
        if (hd0Var != null) {
            if (arrayList.size() > 1) {
                z13 = true;
            }
            AndroidUtilities.updateViewVisibilityAnimated(hd0Var, z13, 1.0f, z12);
        }
        xw xwVar = this.h;
        if (xwVar != null) {
            xwVar.setAdapter(null);
            xwVar.setAdapter(this.I0);
            if (hd0Var != null) {
                hd0Var.setViewPager(xwVar);
            }
        }
    }

    public final void K(final bh.c cVar, final TLObject tLObject, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final boolean z4, boolean z10) {
        String formatPluralString;
        hz hzVar;
        ly lyVar;
        if (stickerSet != null) {
            if (!z4 || (lyVar = this.P) == null || lyVar.d == stickerSet.f20872id) {
                if (!z4 && (hzVar = this.f29337w0) != null && hzVar.d != stickerSet.f20872id) {
                    return;
                }
                final boolean isStickerPackInstalled = MediaDataController.getInstance(this.Z0).isStickerPackInstalled(stickerSet.f20872id);
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
                cVar.g(formatPluralString, z10, true);
                cVar.f1984e0.a(!isStickerPackInstalled, z10);
                cVar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        int i10;
                        mz mzVar = mz.this;
                        MediaDataController mediaDataController = MediaDataController.getInstance(mzVar.Z0);
                        Context context = mzVar.getContext();
                        if (isStickerPackInstalled) {
                            i10 = 0;
                        } else {
                            i10 = 2;
                        }
                        org.telegram.ui.ActionBar.p2 p2Var = mzVar.V1;
                        FrameLayout frameLayout = mzVar.f29323s;
                        bh.c cVar2 = cVar;
                        TLObject tLObject2 = tLObject;
                        TLRPC.StickerSet stickerSet2 = stickerSet;
                        TLRPC.Document document2 = document;
                        boolean z11 = z4;
                        mediaDataController.toggleStickerSet(context, tLObject2, document2, i10, p2Var, frameLayout, false, true, new j3.n1(mzVar, cVar2, tLObject2, stickerSet2, document2, z11, 10), false);
                        mzVar.K(cVar2, tLObject2, stickerSet2, document2, z11, true);
                    }
                });
            }
        }
    }

    @Override
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = 4;
        if (i10 == 0) {
            q(false);
            float f12 = 1.0f - this.f29265a.f50541e;
            uw uwVar = this.D0;
            uwVar.setAlpha(f12);
            if (f12 > 0.0f) {
                i13 = 0;
            } else {
                i13 = 4;
            }
            uwVar.setVisibility(i13);
            float f13 = 1.0f - f12;
            bh.e eVar = this.E0;
            eVar.setAlpha(f13);
            eVar.setTranslationY((-AndroidUtilities.dp(15.0f)) * f12);
            int i16 = (f13 > 0.0f ? 1 : (f13 == 0.0f ? 0 : -1));
            if (i16 > 0) {
                i14 = 0;
            } else {
                i14 = 4;
            }
            eVar.setVisibility(i14);
            ag.l lVar = this.J;
            lVar.setAlpha(f13);
            lVar.setTranslationY(AndroidUtilities.dp(30.0f) * f12);
            if (i16 > 0) {
                i15 = 0;
            }
            lVar.setVisibility(i15);
            T();
            this.f29330u0.invalidate();
        } else if (i10 == 1) {
            l(false);
            float f14 = 1.0f - this.f29268b.f50541e;
            iw iwVar = this.S;
            iwVar.setAlpha(f14);
            if (f14 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            iwVar.setVisibility(i11);
            float f15 = 1.0f - f14;
            bh.e eVar2 = this.R;
            eVar2.setAlpha(f15);
            eVar2.setTranslationY((-AndroidUtilities.dp(15.0f)) * f14);
            int i17 = (f15 > 0.0f ? 1 : (f15 == 0.0f ? 0 : -1));
            if (i17 > 0) {
                i12 = 0;
            } else {
                i12 = 4;
            }
            eVar2.setVisibility(i12);
            ag.l lVar2 = this.H;
            lVar2.setAlpha(f15);
            lVar2.setTranslationY(AndroidUtilities.dp(30.0f) * f14);
            if (i17 > 0) {
                i15 = 0;
            }
            lVar2.setVisibility(i15);
            T();
            this.G.invalidate();
        }
    }

    public final void M(long j10, boolean z4, boolean z10) {
        int i10;
        View childAt;
        float f10;
        hd0 hd0Var = this.f29336w;
        if (hd0Var != null) {
            this.f29325s1 = z4;
            this.f29328t1 = z10;
            if (!z10 && !z4) {
                this.f29321r1 = 0L;
            } else {
                this.f29321r1 = j10;
            }
            if (z10) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            LinearLayout linearLayout = hd0Var.d;
            if (i10 >= linearLayout.getChildCount()) {
                childAt = null;
            } else {
                childAt = linearLayout.getChildAt(i10);
            }
            if (childAt != null) {
                if (this.f29321r1 != 0) {
                    f10 = 0.15f;
                } else {
                    f10 = 1.0f;
                }
                childAt.setAlpha(f10);
                xw xwVar = this.h;
                if (z10) {
                    if (this.f29321r1 != 0 && xwVar.getCurrentItem() != 0) {
                        N(true, true);
                        S(false, true);
                        xwVar.x(0, false);
                    }
                } else if (this.f29321r1 != 0 && xwVar.getCurrentItem() != 1) {
                    N(false, true);
                    S(false, true);
                    xwVar.x(1, false);
                }
            }
        }
    }

    public final void N(boolean z4, boolean z10) {
        float f10;
        float f11;
        float f12;
        float f13;
        yw ywVar = this.f29340x;
        if (!z4 || ywVar.getTag() != null) {
            if ((!z4 && ywVar.getTag() != null) || this.f29303l2) {
                return;
            }
            AnimatorSet animatorSet = this.C;
            Integer num = null;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.C = null;
            }
            if (!z4) {
                num = 1;
            }
            ywVar.setTag(num);
            int i10 = 0;
            float f14 = 0.0f;
            if (z10) {
                if (z4) {
                    ywVar.setVisibility(0);
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.C = animatorSet2;
                if (z4) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ywVar, View.ALPHA, f12);
                if (z4) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(ywVar, View.SCALE_X, f13);
                if (z4) {
                    f14 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(ywVar, View.SCALE_Y, f14));
                this.C.setDuration(200L);
                this.C.setInterpolator(pr.f30169g);
                this.C.addListener(new gx(this, z4, 0));
                this.C.start();
                return;
            }
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ywVar.setAlpha(f10);
            if (z4) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ywVar.setScaleX(f11);
            if (z4) {
                f14 = 1.0f;
            }
            ywVar.setScaleY(f14);
            if (!z4) {
                i10 = 4;
            }
            ywVar.setVisibility(i10);
        }
    }

    public final void O(boolean z4) {
        Integer num;
        this.E = 0.0f;
        my myVar = this.f29317q1;
        if (myVar != null && myVar.z()) {
            z4 = false;
        }
        FrameLayout frameLayout = this.f29306n;
        if (!z4 || frameLayout.getTag() != null) {
            if (!z4 && frameLayout.getTag() != null) {
                return;
            }
            if (z4) {
                num = null;
            } else {
                num = 1;
            }
            frameLayout.setTag(num);
            this.D2.a(z4, true);
        }
    }

    public final void P(boolean z4, boolean z10) {
        View view = this.L;
        if (!z4 || view.getTag() != null) {
            if (!z4 && view.getTag() != null) {
                return;
            }
            AnimatorSet animatorSet = this.T;
            Integer num = null;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.T = null;
            }
            if (!z4) {
                num = 1;
            }
            view.setTag(num);
            float f10 = 0.0f;
            if (z10) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.T = animatorSet2;
                if (z4) {
                    f10 = 1.0f;
                }
                animatorSet2.playTogether(ObjectAnimator.ofFloat(view, View.ALPHA, f10));
                this.T.setDuration(200L);
                this.T.setInterpolator(pr.f30169g);
                this.T.addListener(new a9(this, 18));
                this.T.start();
                return;
            }
            if (z4) {
                f10 = 1.0f;
            }
            view.setAlpha(f10);
        }
    }

    public final void Q(boolean z4) {
        for (int i10 = 0; i10 < 3; i10++) {
            f2.w w10 = w(i10);
            int L0 = w10.L0();
            if (z4) {
                if (L0 == 1 || L0 == 2) {
                    w10.n0(0);
                    G(i10);
                }
            } else if (L0 == 0) {
                w10.h1(0, 0);
            }
        }
    }

    public final void R(boolean z4, boolean z10, boolean z11) {
        float f10;
        float translationY;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.Chat chat = MessagesController.getInstance(this.Z0).getChat(Long.valueOf(this.f29321r1));
        if (chat != null) {
            hg.q qVar = this.K0;
            if (z4) {
                if (!ChatObject.hasAdminRights(chat) && (tL_chatBannedRights = chat.default_banned_rights) != null && (tL_chatBannedRights.send_stickers || (z10 && tL_chatBannedRights.send_plain))) {
                    org.telegram.ui.ActionBar.p2 p2Var = this.V1;
                    if (!(p2Var instanceof org.telegram.ui.xn) || !((org.telegram.ui.xn) p2Var).K6()) {
                        if (z10) {
                            qVar.setText(LocaleController.getString(R.string.GlobalAttachEmojiRestricted));
                        } else if (z11) {
                            qVar.setText(LocaleController.getString(R.string.GlobalAttachGifRestricted));
                        } else {
                            qVar.setText(LocaleController.getString(R.string.GlobalAttachStickersRestricted));
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
                        if (z10) {
                            qVar.setText(LocaleController.getString(R.string.AttachPlainRestrictedForever));
                        } else if (z11) {
                            qVar.setText(LocaleController.getString(R.string.AttachGifRestrictedForever));
                        } else {
                            qVar.setText(LocaleController.getString(R.string.AttachStickersRestrictedForever));
                        }
                    } else {
                        if (z10) {
                            qVar.setText(LocaleController.formatString("AttachPlainRestricted", R.string.AttachPlainRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                        }
                        if (z11) {
                            qVar.setText(LocaleController.formatString("AttachGifRestricted", R.string.AttachGifRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                        } else {
                            qVar.setText(LocaleController.formatString("AttachStickersRestricted", R.string.AttachStickersRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                        }
                    }
                }
                qVar.setVisibility(0);
            }
            AnimatorSet animatorSet = this.G2;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.G2 = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.G2 = animatorSet2;
            float f11 = 1.0f;
            if (z4) {
                f10 = qVar.getAlpha();
            } else {
                f10 = 1.0f;
            }
            float f12 = 0.0f;
            if (!z4) {
                f11 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(qVar, View.ALPHA, f10, f11);
            if (z4) {
                translationY = AndroidUtilities.dp(12.0f);
            } else {
                translationY = qVar.getTranslationY();
            }
            if (!z4) {
                f12 = AndroidUtilities.dp(12.0f);
            }
            animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(qVar, View.TRANSLATION_Y, translationY, f12));
            org.telegram.messenger.video.l lVar = this.H2;
            if (lVar != null) {
                AndroidUtilities.cancelRunOnUIThread(lVar);
            }
            if (z4) {
                org.telegram.messenger.video.l lVar2 = new org.telegram.messenger.video.l(this, z10, z11, 3);
                this.H2 = lVar2;
                AndroidUtilities.runOnUIThread(lVar2, 3500L);
            }
            this.G2.setDuration(320L);
            this.G2.setInterpolator(pr.h);
            this.G2.start();
        }
    }

    public final void S(boolean z4, boolean z10) {
        float f10;
        float f11;
        float f12;
        float f13;
        ImageView imageView = this.f29344y;
        if (imageView != null && !this.f29305m2) {
            if (!z4 || imageView.getTag() != null) {
                if (z4 || imageView.getTag() == null) {
                    AnimatorSet animatorSet = this.D;
                    Integer num = null;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.D = null;
                    }
                    if (!z4) {
                        num = 1;
                    }
                    imageView.setTag(num);
                    int i10 = 0;
                    float f14 = 0.0f;
                    if (z10) {
                        if (z4) {
                            imageView.setVisibility(0);
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.D = animatorSet2;
                        if (z4) {
                            f12 = 1.0f;
                        } else {
                            f12 = 0.0f;
                        }
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, View.ALPHA, f12);
                        if (z4) {
                            f13 = 1.0f;
                        } else {
                            f13 = 0.0f;
                        }
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView, View.SCALE_X, f13);
                        if (z4) {
                            f14 = 1.0f;
                        }
                        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(imageView, View.SCALE_Y, f14));
                        this.D.setDuration(200L);
                        this.D.setInterpolator(pr.f30169g);
                        this.D.addListener(new gx(this, z4, 1));
                        this.D.start();
                        return;
                    }
                    if (z4) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    imageView.setAlpha(f10);
                    if (z4) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    imageView.setScaleX(f11);
                    if (z4) {
                        f14 = 1.0f;
                    }
                    imageView.setScaleY(f14);
                    if (!z4) {
                        i10 = 4;
                    }
                    imageView.setVisibility(i10);
                }
            }
        }
    }

    public final void T() {
        int measuredHeight;
        int dp;
        float f10;
        org.telegram.ui.ActionBar.p2 p2Var;
        View view = (View) getParent();
        if (view != null) {
            float y10 = getY();
            if (getLayoutParams().height > 0) {
                measuredHeight = getLayoutParams().height;
            } else {
                measuredHeight = getMeasuredHeight();
            }
            float f11 = y10 + measuredHeight;
            if ((!AndroidUtilities.isInMultiwindow && ((p2Var = this.V1) == null || !p2Var.isInBubbleMode())) || this.S0) {
                dp = view.getHeight();
            } else {
                dp = AndroidUtilities.dp(1.0f);
            }
            float f12 = f11 - dp;
            float f13 = this.f29312o2;
            FrameLayout frameLayout = this.f29306n;
            if (f13 >= 0.0f) {
                f12 += getMeasuredHeight() - this.f29312o2;
            } else if (frameLayout.getTop() - f12 < 0.0f || !this.f29332u2) {
                f12 = 0.0f;
            }
            float f14 = -f12;
            boolean z4 = this.f29266a0;
            if (z4) {
                f10 = 45.0f;
            } else {
                f10 = 50.0f;
            }
            float lerp = f14 + AndroidUtilities.lerp(AndroidUtilities.dp(f10), -this.f29309n2, this.D2.f50541e);
            frameLayout.setTranslationY(lerp);
            if (z4) {
                this.f29319r.setTranslationY(lerp);
            }
        }
    }

    public final void U() {
        yy yyVar;
        boolean z4;
        int A;
        int A2;
        int A3;
        int A4;
        int A5;
        int A6;
        int A7;
        int A8;
        vv vvVar;
        int A9;
        int A10;
        int A11;
        int A12;
        int A13;
        int A14;
        int A15;
        int A16;
        int A17;
        boolean z10 = this.f29320r0;
        View view = this.v;
        if (!z10) {
            setBackground(null);
            view.setBackground(null);
        } else if (!AndroidUtilities.isInMultiwindow && !this.K1) {
            int i10 = org.telegram.ui.ActionBar.k6.He;
            setBackgroundColor(A(i10));
            if (this.f29266a0) {
                view.setBackgroundColor(A(i10));
            }
        } else {
            Drawable background = getBackground();
            if (background != null) {
                background.setColorFilter(new PorterDuffColorFilter(A(org.telegram.ui.ActionBar.k6.He), PorterDuff.Mode.MULTIPLY));
            }
        }
        hw hwVar = this.F;
        if (hwVar != null) {
            if (this.f29320r0) {
                hwVar.setBackgroundColor(A(org.telegram.ui.ActionBar.k6.He));
                this.L.setBackgroundColor(A(org.telegram.ui.ActionBar.k6.Ke));
            } else {
                hwVar.setBackground(null);
            }
        }
        tu tuVar = this.f29346y1;
        if (tuVar != null) {
            tuVar.f31419c.a();
        }
        int i11 = 0;
        while (true) {
            yyVar = this.S;
            z4 = this.f29286f2;
            if (i11 >= 3) {
                break;
            }
            if (i11 == 0) {
                yyVar = this.D0;
            } else if (i11 != 1) {
                yyVar = this.f29302l0;
            }
            if (yyVar != null) {
                iq iqVar = yyVar.d;
                FrameLayout frameLayout = yyVar.f33688n;
                View view2 = yyVar.f33687f;
                if (this.f29320r0) {
                    view2.setBackgroundColor(A(org.telegram.ui.ActionBar.k6.He));
                } else {
                    view2.setBackground(null);
                }
                yyVar.f33686e.setBackgroundColor(A(org.telegram.ui.ActionBar.k6.Ke));
                fn0 fn0Var = yyVar.f33685c;
                if (z4) {
                    A14 = v(0.4f);
                } else {
                    A14 = A(org.telegram.ui.ActionBar.k6.Je);
                }
                fn0Var.a(A14);
                Drawable background2 = frameLayout.getBackground();
                if (z4) {
                    A15 = v(0.06f);
                } else {
                    A15 = A(org.telegram.ui.ActionBar.k6.Ie);
                }
                org.telegram.ui.ActionBar.k6.w1(A15, background2);
                frameLayout.invalidate();
                if (z4) {
                    A16 = v(0.45f);
                } else {
                    A16 = A(org.telegram.ui.ActionBar.k6.Je);
                }
                iqVar.setHintTextColor(A16);
                if (z4) {
                    A17 = v(0.8f);
                } else {
                    A17 = A(org.telegram.ui.ActionBar.k6.G6);
                }
                iqVar.setTextColor(A17);
            }
            i11++;
        }
        Paint paint = this.f29314p1;
        if (paint != null) {
            paint.setColor(A(org.telegram.ui.ActionBar.k6.f21615af));
        }
        kx kxVar = this.M;
        if (kxVar != null) {
            kxVar.setGlowColor(A(org.telegram.ui.ActionBar.k6.He));
        }
        rw rwVar = this.A0;
        if (rwVar != null) {
            rwVar.setGlowColor(A(org.telegram.ui.ActionBar.k6.He));
        }
        vw vwVar = this.f29345y0;
        if (vwVar != null) {
            vwVar.setIndicatorColor(A(org.telegram.ui.ActionBar.k6.Qe));
            vwVar.setUnderlineColor(A(org.telegram.ui.ActionBar.k6.Ke));
            if (this.f29320r0) {
                vwVar.setBackgroundColor(A(org.telegram.ui.ActionBar.k6.He));
            } else {
                vwVar.setBackground(null);
            }
        }
        rx rxVar = this.m0;
        if (rxVar != null) {
            rxVar.setIndicatorColor(A(org.telegram.ui.ActionBar.k6.Qe));
            rxVar.setUnderlineColor(A(org.telegram.ui.ActionBar.k6.Ke));
            if (this.f29320r0) {
                rxVar.setBackgroundColor(A(org.telegram.ui.ActionBar.k6.He));
            } else {
                rxVar.setBackground(null);
            }
        }
        yw ywVar = this.f29340x;
        if (ywVar != null) {
            if (z4) {
                A13 = v(0.6f);
            } else {
                A13 = A(org.telegram.ui.ActionBar.k6.Re);
            }
            ywVar.setColorFilter(new PorterDuffColorFilter(A13, PorterDuff.Mode.MULTIPLY));
            if (yyVar == null) {
                Drawable background3 = ywVar.getBackground();
                int i12 = org.telegram.ui.ActionBar.k6.He;
                org.telegram.ui.ActionBar.k6.B1(background3, A(i12), false);
                org.telegram.ui.ActionBar.k6.B1(ywVar.getBackground(), A(i12), true);
            }
        }
        ImageView imageView = this.f29344y;
        if (imageView != null) {
            if (z4) {
                A12 = v(0.6f);
            } else {
                A12 = A(org.telegram.ui.ActionBar.k6.Re);
            }
            imageView.setColorFilter(new PorterDuffColorFilter(A12, PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.B;
        if (imageView2 != null) {
            if (z4) {
                A11 = v(0.6f);
            } else {
                A11 = A(org.telegram.ui.ActionBar.k6.Re);
            }
            imageView2.setColorFilter(new PorterDuffColorFilter(A11, PorterDuff.Mode.MULTIPLY));
        }
        hg.q qVar = this.K0;
        if (qVar != null) {
            ((ShapeDrawable) qVar.getBackground()).getPaint().setColor(A(org.telegram.ui.ActionBar.k6.f21904qf));
            qVar.setTextColor(A(org.telegram.ui.ActionBar.k6.f21886pf));
        }
        qy qyVar = this.f29287g0;
        if (qyVar != null) {
            sy syVar = qyVar.f30550e;
            ImageView imageView3 = syVar.f31199a;
            int i13 = org.telegram.ui.ActionBar.k6.Le;
            imageView3.setColorFilter(new PorterDuffColorFilter(A(i13), PorterDuff.Mode.MULTIPLY));
            syVar.f31200b.setTextColor(A(i13));
            syVar.f31201c.setProgressColor(A(org.telegram.ui.ActionBar.k6.f21734h6));
        }
        this.f29271b2 = new PorterDuffColorFilter(A(org.telegram.ui.ActionBar.k6.Oh), PorterDuff.Mode.SRC_IN);
        int i14 = 0;
        while (true) {
            Drawable[] drawableArr = this.U0;
            if (i14 >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i14];
            if (z4) {
                A9 = v(0.4f);
            } else {
                A9 = A(org.telegram.ui.ActionBar.k6.Ne);
            }
            org.telegram.ui.ActionBar.k6.y1(drawable, A9, false);
            Drawable drawable2 = drawableArr[i14];
            if (z4) {
                A10 = v(0.8f);
            } else {
                A10 = A(org.telegram.ui.ActionBar.k6.Oe);
            }
            org.telegram.ui.ActionBar.k6.y1(drawable2, A10, true);
            i14++;
        }
        if (hwVar != null && (vvVar = hwVar.f34026y) != null) {
            vvVar.d();
        }
        int i15 = 0;
        while (true) {
            Drawable[] drawableArr2 = this.V0;
            if (i15 >= drawableArr2.length) {
                break;
            }
            Drawable drawable3 = drawableArr2[i15];
            if (z4) {
                A7 = v(0.4f);
            } else {
                A7 = A(org.telegram.ui.ActionBar.k6.Me);
            }
            org.telegram.ui.ActionBar.k6.y1(drawable3, A7, false);
            Drawable drawable4 = drawableArr2[i15];
            if (z4) {
                A8 = v(0.8f);
            } else {
                A8 = A(org.telegram.ui.ActionBar.k6.Oe);
            }
            org.telegram.ui.ActionBar.k6.y1(drawable4, A8, true);
            i15++;
        }
        int i16 = 0;
        while (true) {
            Drawable[] drawableArr3 = this.W0;
            if (i16 >= drawableArr3.length) {
                break;
            }
            Drawable drawable5 = drawableArr3[i16];
            if (z4) {
                A5 = v(0.4f);
            } else {
                A5 = A(org.telegram.ui.ActionBar.k6.Me);
            }
            org.telegram.ui.ActionBar.k6.y1(drawable5, A5, false);
            Drawable drawable6 = drawableArr3[i16];
            if (z4) {
                A6 = v(0.8f);
            } else {
                A6 = A(org.telegram.ui.ActionBar.k6.Oe);
            }
            org.telegram.ui.ActionBar.k6.y1(drawable6, A6, true);
            i16++;
        }
        org.telegram.ui.ActionBar.v5 v5Var = this.X1;
        if (v5Var != null) {
            if (z4) {
                A3 = v(0.4f);
            } else {
                A3 = A(org.telegram.ui.ActionBar.k6.Ne);
            }
            org.telegram.ui.ActionBar.k6.y1(v5Var, A3, false);
            if (z4) {
                A4 = v(0.8f);
            } else {
                A4 = A(org.telegram.ui.ActionBar.k6.Oe);
            }
            org.telegram.ui.ActionBar.k6.y1(v5Var, A4, true);
        }
        org.telegram.ui.ActionBar.v5 v5Var2 = this.Y1;
        if (v5Var2 != null) {
            if (z4) {
                A = v(0.4f);
            } else {
                A = A(org.telegram.ui.ActionBar.k6.Qe);
            }
            org.telegram.ui.ActionBar.k6.y1(v5Var2, A, false);
            if (z4) {
                A2 = v(0.8f);
            } else {
                A2 = A(org.telegram.ui.ActionBar.k6.Qe);
            }
            org.telegram.ui.ActionBar.k6.y1(v5Var2, A2, true);
        }
    }

    public final void V() {
        kx kxVar = this.M;
        if (kxVar != null) {
            for (int i10 = 0; i10 < kxVar.getChildCount(); i10++) {
                View childAt = kxVar.getChildAt(i10);
                if (childAt instanceof cy) {
                    ((cy) childAt).a(true);
                }
            }
        }
    }

    public final void W(int i10) {
        int i11;
        if (!this.f29273c0) {
            int i12 = -1;
            if (i10 != -1) {
                int size = getRecentEmoji().size() + (this.f29266a0 ? 1 : 0);
                tx txVar = this.O;
                int i13 = txVar.f31425c;
                ArrayList arrayList = txVar.f31432x;
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
                        ArrayList<xx> emojipacks = getEmojipacks();
                        int size2 = arrayList.size() - 1;
                        while (true) {
                            if (size2 < 0) {
                                break;
                            } else if (((Integer) arrayList.get(size2)).intValue() <= i10) {
                                xx xxVar = (xx) this.f29308n1.get(size2);
                                while (i14 < emojipacks.size()) {
                                    long j10 = emojipacks.get(i14).f33212b.f20872id;
                                    long j11 = xxVar.f33212b.f20872id;
                                    if (j10 == j11 && (!xxVar.f33216g || (!xxVar.f33215f && !this.f29304m1.contains(Long.valueOf(j11))))) {
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
                    this.F.j(i14, true);
                }
            }
        }
    }

    public final void X() {
        boolean z4;
        boolean z10;
        int i10;
        xy xyVar;
        int i11;
        boolean z11;
        boolean z12;
        rx rxVar = this.m0;
        int currentPosition = rxVar.getCurrentPosition();
        int i12 = this.f29310o0;
        if (currentPosition == i12) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (i12 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean isEmpty = this.f29285f1.isEmpty();
        rxVar.d(false);
        this.f29310o0 = -2;
        this.f29313p0 = -2;
        this.f29316q0 = -2;
        Drawable[] drawableArr = this.W0;
        if (!isEmpty) {
            this.f29310o0 = 0;
            rxVar.b(0, drawableArr[0]).setContentDescription(LocaleController.getString(R.string.RecentStickers));
            i10 = 1;
        } else {
            i10 = 0;
        }
        this.f29313p0 = i10;
        rxVar.b(1, drawableArr[1]).setContentDescription(LocaleController.getString(R.string.FeaturedGifs));
        this.f29316q0 = i10 + 1;
        AndroidUtilities.dp(13.0f);
        AndroidUtilities.dp(11.0f);
        int i13 = this.Z0;
        ArrayList<String> arrayList = MessagesController.getInstance(i13).gifSearchEmojies;
        int size = arrayList.size();
        int i14 = 0;
        while (i14 < size) {
            String str = arrayList.get(i14);
            Emoji.EmojiDrawable emojiDrawable = Emoji.getEmojiDrawable(str);
            if (emojiDrawable != null) {
                TLRPC.Document emojiAnimatedSticker = MediaDataController.getInstance(i13).getEmojiAnimatedSticker(str);
                String j10 = l.d.j(i14 + 3, "tab");
                int i15 = rxVar.f30152x;
                rxVar.f30152x = i15 + 1;
                fx0 fx0Var = (fx0) rxVar.f30145n.get(j10);
                if (fx0Var != null) {
                    rxVar.g(j10, fx0Var, i15);
                    i11 = currentPosition;
                    z11 = z10;
                } else {
                    i11 = currentPosition;
                    z11 = z10;
                    fx0Var = new fx0(rxVar.getContext(), 2);
                    fx0Var.setFocusable(true);
                    fx0Var.setOnClickListener(new jm0(rxVar, 2));
                    fx0Var.setExpanded(rxVar.f30133c0);
                    fx0Var.a(rxVar.f30138f0);
                    rxVar.f30135e.addView(fx0Var, i15);
                }
                fx0Var.d = false;
                fx0Var.setTag(R.id.index_tag, Integer.valueOf(i15));
                fx0Var.setTag(R.id.parent_tag, emojiDrawable);
                fx0Var.setTag(R.id.object_tag, emojiAnimatedSticker);
                if (i15 == rxVar.f30153y) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                fx0Var.setSelected(z12);
                rxVar.h.put(j10, fx0Var);
                fx0Var.setContentDescription(str);
            } else {
                i11 = currentPosition;
                z11 = z10;
            }
            i14++;
            currentPosition = i11;
            z10 = z11;
        }
        int i16 = currentPosition;
        boolean z13 = z10;
        rxVar.h();
        rxVar.q();
        if (z4 && isEmpty) {
            rxVar.m(this.f29313p0);
            ow owVar = this.f29302l0;
            if (owVar != null && (xyVar = owVar.f33689r) != null) {
                xyVar.E1(null);
                return;
            }
            return;
        }
        WeakHashMap weakHashMap = r0.j0.f46469a;
        if (rxVar.isLaidOut()) {
            if (!isEmpty && !z13) {
                rxVar.k(i16 + 1, 0);
            } else if (isEmpty && z13) {
                rxVar.k(i16 - 1, 0);
            }
        }
    }

    public final void Y() {
        qy qyVar;
        int size = this.f29285f1.size();
        long calcDocumentsHash = MediaDataController.calcDocumentsHash(this.f29285f1, Integer.MAX_VALUE);
        ArrayList<TLRPC.Document> recentGifs = MediaDataController.getInstance(this.Z0).getRecentGifs();
        this.f29285f1 = recentGifs;
        long calcDocumentsHash2 = MediaDataController.calcDocumentsHash(recentGifs, Integer.MAX_VALUE);
        if ((this.m0 != null && size == 0 && !this.f29285f1.isEmpty()) || (size != 0 && this.f29285f1.isEmpty())) {
            X();
        }
        if ((size != this.f29285f1.size() || calcDocumentsHash != calcDocumentsHash2) && (qyVar = this.f29299k0) != null) {
            qyVar.l();
        }
    }

    public final void Z(boolean z4) {
        boolean z10;
        TLRPC.Document document;
        boolean z11;
        boolean z12;
        boolean z13;
        ArrayList<TLRPC.Document> arrayList;
        boolean z14;
        ArrayList<TLRPC.Document> arrayList2;
        TLRPC.StickerSet stickerSet;
        int i10;
        vw vwVar = this.f29345y0;
        if (vwVar != null) {
            ob1 ob1Var = vwVar.f30135e;
            if (vwVar.f30150s != null) {
                return;
            }
            this.C1 = -2;
            this.D1 = -2;
            this.E1 = -2;
            this.F1 = -2;
            this.f29269b0 = false;
            this.B1 = 0;
            int currentPosition = vwVar.getCurrentPosition();
            boolean z15 = true;
            if (getParent() != null && getVisibility() == 0 && (this.f29334v1.size() != 0 || this.f29338w1.size() != 0)) {
                z10 = true;
            } else {
                z10 = false;
            }
            vwVar.d(z10);
            int i11 = this.Z0;
            MediaDataController mediaDataController = MediaDataController.getInstance(i11);
            SharedPreferences emojiSettings = MessagesController.getEmojiSettings(i11);
            ArrayList arrayList3 = this.f29297j1;
            arrayList3.clear();
            ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = mediaDataController.getFeaturedStickerSets();
            int size = featuredStickerSets.size();
            for (int i12 = 0; i12 < size; i12++) {
                TLRPC.StickerSetCovered stickerSetCovered = featuredStickerSets.get(i12);
                if (!mediaDataController.isStickerPackInstalled(stickerSetCovered.set.f20872id)) {
                    arrayList3.add(stickerSetCovered);
                }
            }
            kz kzVar = this.C0;
            if (kzVar != null) {
                kzVar.l();
            }
            boolean isEmpty = featuredStickerSets.isEmpty();
            long j10 = 0;
            Drawable[] drawableArr = this.V0;
            if (!isEmpty && (arrayList3.isEmpty() || emojiSettings.getLong("featured_hidden", 0L) == featuredStickerSets.get(0).set.f20872id)) {
                if (mediaDataController.getUnreadStickerSets().isEmpty()) {
                    i10 = 2;
                } else {
                    i10 = 3;
                }
                fx0 c3 = vwVar.c(i10, drawableArr[i10]);
                c3.h.setText(LocaleController.getString(R.string.FeaturedStickersShort));
                c3.setContentDescription(LocaleController.getString(R.string.FeaturedStickers));
                int i13 = this.B1;
                this.E1 = i13;
                this.B1 = i13 + 1;
            }
            if (!this.f29291h1.isEmpty()) {
                int i14 = this.B1;
                this.D1 = i14;
                this.B1 = i14 + 1;
                fx0 c10 = vwVar.c(1, drawableArr[1]);
                c10.h.setText(LocaleController.getString(R.string.FavoriteStickersShort));
                c10.setContentDescription(LocaleController.getString(R.string.FavoriteStickers));
            }
            if (!this.f29288g1.isEmpty()) {
                int i15 = this.B1;
                this.C1 = i15;
                this.B1 = i15 + 1;
                fx0 c11 = vwVar.c(0, drawableArr[0]);
                c11.h.setText(LocaleController.getString(R.string.RecentStickersShort));
                c11.setContentDescription(LocaleController.getString(R.string.RecentStickers));
            }
            ArrayList arrayList4 = this.f29267a1;
            arrayList4.clear();
            org.telegram.ui.ActionBar.g6 g6Var = null;
            this.f29281e1 = null;
            this.f29274c1 = -1;
            this.f29270b1 = -10;
            if (this.E2 == null || z4) {
                this.E2 = new ArrayList(mediaDataController.getStickerSets(0));
            }
            ArrayList<TLRPC.TL_messages_stickerSet> arrayList5 = this.E2;
            int i16 = 0;
            while (true) {
                TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.f29331u1;
                if (i16 >= stickerSetCoveredArr.length) {
                    break;
                }
                TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCoveredArr[i16];
                long j11 = j10;
                if (stickerSetCovered2 != null) {
                    TLRPC.TL_messages_stickerSet stickerSetById = mediaDataController.getStickerSetById(stickerSetCovered2.set.f20872id);
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
            if (this.G1 != null) {
                long j13 = MessagesController.getEmojiSettings(i11).getLong("group_hide_stickers_" + this.G1.f20846id, -1L);
                TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(this.G1.f20846id));
                if (chat != null && this.G1.stickerset != null && ChatObject.hasAdminRights(chat)) {
                    TLRPC.StickerSet stickerSet3 = this.G1.stickerset;
                    if (stickerSet3 != null) {
                        if (j13 == stickerSet3.f20872id) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        this.f29277d1 = z14;
                    }
                } else {
                    if (j13 != -1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    this.f29277d1 = z13;
                }
                TLRPC.ChatFull chatFull = this.G1;
                TLRPC.StickerSet stickerSet4 = chatFull.stickerset;
                if (stickerSet4 != null) {
                    TLRPC.TL_messages_stickerSet groupStickerSetById = mediaDataController.getGroupStickerSetById(stickerSet4);
                    if (groupStickerSetById != null && (arrayList = groupStickerSetById.documents) != null && !arrayList.isEmpty() && groupStickerSetById.set != null) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = new TLRPC.TL_messages_stickerSet();
                        tL_messages_stickerSet3.documents = groupStickerSetById.documents;
                        tL_messages_stickerSet3.packs = groupStickerSetById.packs;
                        tL_messages_stickerSet3.set = groupStickerSetById.set;
                        if (this.f29277d1) {
                            this.f29270b1 = arrayList4.size();
                            arrayList4.add(tL_messages_stickerSet3);
                        } else {
                            this.f29270b1 = 0;
                            arrayList4.add(0, tL_messages_stickerSet3);
                        }
                        if (!this.G1.can_set_stickers) {
                            tL_messages_stickerSet3 = null;
                        }
                        this.f29281e1 = tL_messages_stickerSet3;
                    }
                } else if (chatFull.can_set_stickers) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = new TLRPC.TL_messages_stickerSet();
                    if (this.f29277d1) {
                        this.f29270b1 = arrayList4.size();
                        arrayList4.add(tL_messages_stickerSet4);
                    } else {
                        this.f29270b1 = 0;
                        arrayList4.add(0, tL_messages_stickerSet4);
                    }
                }
            }
            int i18 = 0;
            while (i18 < arrayList4.size()) {
                if (i18 == this.f29270b1) {
                    TLRPC.Chat chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(this.G1.f20846id));
                    if (chat2 == null) {
                        arrayList4.remove(0);
                        i18--;
                    } else {
                        this.f29269b0 = z15;
                        String str = "chat" + chat2.f20845id;
                        int i19 = vwVar.f30152x;
                        vwVar.f30152x = i19 + 1;
                        fx0 fx0Var = (fx0) vwVar.f30145n.get(str);
                        if (fx0Var != null) {
                            vwVar.g(str, fx0Var, i19);
                        } else {
                            fx0Var = new fx0(vwVar.getContext(), 0);
                            fx0Var.setFocusable(z15);
                            fx0Var.setOnClickListener(new jm0(vwVar, 0));
                            ob1Var.addView(fx0Var, i19);
                            fx0Var.f27029w = z15;
                            z8 z8Var = new z8(g6Var);
                            z8Var.u(AndroidUtilities.dp(14.0f));
                            z8Var.k(UserConfig.selectedAccount, chat2);
                            int i20 = vwVar.f30128a;
                            p9 p9Var = fx0Var.f27024e;
                            p9Var.setLayerNum(i20);
                            p9Var.e(chat2, z8Var);
                            p9Var.setAspectFit(z15);
                            fx0Var.setExpanded(vwVar.f30133c0);
                            fx0Var.a(vwVar.f30138f0);
                            fx0Var.h.setText(chat2.title);
                        }
                        fx0Var.d = z15;
                        fx0Var.setTag(R.id.index_tag, Integer.valueOf(i19));
                        if (i19 == vwVar.f30153y) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        fx0Var.setSelected(z12);
                        vwVar.h.put(str, fx0Var);
                    }
                } else {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet5 = (TLRPC.TL_messages_stickerSet) arrayList4.get(i18);
                    TLRPC.StickerSet stickerSet5 = tL_messages_stickerSet5.set;
                    if (stickerSet5 != null && stickerSet5.thumb_document_id != j12) {
                        for (int i21 = 0; i21 < tL_messages_stickerSet5.documents.size(); i21++) {
                            document = tL_messages_stickerSet5.documents.get(i21);
                            if (document != null && tL_messages_stickerSet5.set.thumb_document_id == document.f20851id) {
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
                    String str2 = "set" + tL_messages_stickerSet5.set.f20872id;
                    int i22 = vwVar.f30152x;
                    vwVar.f30152x = i22 + 1;
                    fx0 fx0Var2 = (fx0) vwVar.f30145n.get(str2);
                    if (fx0Var2 != null) {
                        vwVar.g(str2, fx0Var2, i22);
                    } else {
                        fx0Var2 = new fx0(vwVar.getContext(), 0);
                        fx0Var2.setFocusable(z15);
                        fx0Var2.setOnClickListener(new jm0(vwVar, 1));
                        fx0Var2.setExpanded(vwVar.f30133c0);
                        fx0Var2.a(vwVar.f30138f0);
                        ob1Var.addView(fx0Var2, i22);
                    }
                    fx0Var2.f27024e.setLayerNum(vwVar.f30128a);
                    fx0Var2.d = false;
                    fx0Var2.setTag(closestPhotoSizeWithSize);
                    fx0Var2.setTag(R.id.index_tag, Integer.valueOf(i22));
                    fx0Var2.setTag(R.id.parent_tag, tL_messages_stickerSet5);
                    fx0Var2.setTag(R.id.object_tag, document);
                    if (i22 == vwVar.f30153y) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    fx0Var2.setSelected(z11);
                    vwVar.h.put(str2, fx0Var2);
                    fx0Var2.setContentDescription(tL_messages_stickerSet5.set.title + ", " + LocaleController.getString(R.string.AccDescrStickerSet));
                }
                i18++;
                z15 = true;
                g6Var = null;
            }
            vwVar.h();
            vwVar.q();
            if (currentPosition != 0) {
                vwVar.k(currentPosition, currentPosition);
            }
            o();
        }
    }

    public final void a0() {
        boolean z4;
        int i10;
        ww wwVar = this.f29348z0;
        vw vwVar = this.f29345y0;
        if (vwVar != null && wwVar == null && this.f29317q1 != null) {
            vwVar.setTranslationY(this.f29317q1.p() * (-AndroidUtilities.dp(50.0f)));
        }
        if (wwVar == null) {
            return;
        }
        if (getVisibility() == 0 && this.H0 && this.f29317q1.p() != 1.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        wwVar.setVisibility(i10);
        if (z4) {
            Rect rect = this.f29335v2;
            rect.setEmpty();
            this.h.getChildVisibleRect(this.f29330u0, rect, null);
            float p10 = this.f29317q1.p() * AndroidUtilities.dp(50.0f);
            int i11 = rect.left;
            if (i11 != 0 || p10 != 0.0f) {
                this.U1 = false;
            }
            wwVar.setTranslationX(i11);
            float translationY = (((getTranslationY() + getTop()) - wwVar.getTop()) - vwVar.getExpandedOffset()) - p10;
            if (wwVar.getTranslationY() != translationY) {
                wwVar.setTranslationY(translationY);
                wwVar.invalidate();
            }
        }
        if (this.U1 && z4 && this.M0) {
            vwVar.i(this.T1, true);
            return;
        }
        this.U1 = false;
        vwVar.i(this.T1, false);
    }

    @Override
    public final void b(int i10) {
        setBottomInset(i10);
    }

    public final void b0() {
        boolean z4;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        org.telegram.ui.Cells.r3 r3Var;
        LongSparseArray longSparseArray = this.f29338w1;
        LongSparseArray longSparseArray2 = this.f29334v1;
        int i10 = this.Z0;
        rw rwVar = this.A0;
        if (rwVar != null) {
            try {
                int childCount = rwVar.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = rwVar.getChildAt(i11);
                    if ((childAt instanceof org.telegram.ui.Cells.r3) && ((el0) rwVar.T(childAt)) != null) {
                        org.telegram.ui.Cells.r3 r3Var2 = (org.telegram.ui.Cells.r3) childAt;
                        ArrayList<Long> unreadStickerSets = MediaDataController.getInstance(i10).getUnreadStickerSets();
                        TLRPC.StickerSetCovered stickerSet = r3Var2.getStickerSet();
                        if (unreadStickerSets != null && unreadStickerSets.contains(Long.valueOf(stickerSet.set.f20872id))) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        int i12 = 0;
                        while (true) {
                            TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.f29331u1;
                            if (i12 < stickerSetCoveredArr.length) {
                                TLRPC.StickerSetCovered stickerSetCovered = stickerSetCoveredArr[i12];
                                if (stickerSetCovered != null) {
                                    r3Var = r3Var2;
                                    if (stickerSetCovered.set.f20872id == stickerSet.set.f20872id) {
                                        r3Var2 = r3Var;
                                        z10 = true;
                                        break;
                                    }
                                } else {
                                    r3Var = r3Var2;
                                }
                                i12++;
                                r3Var2 = r3Var;
                            } else {
                                z10 = false;
                                break;
                            }
                        }
                        r3Var2.c(stickerSet, z4, true, 0, 0, z10);
                        if (z4) {
                            MediaDataController.getInstance(i10).markFeaturedStickersByIdAsRead(false, stickerSet.set.f20872id);
                        }
                        if (longSparseArray2.indexOfKey(stickerSet.set.f20872id) >= 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (longSparseArray.indexOfKey(stickerSet.set.f20872id) >= 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z11 || z12) {
                            if (z11 && r3Var2.f23551r) {
                                longSparseArray2.remove(stickerSet.set.f20872id);
                                z11 = false;
                            } else if (z12 && !r3Var2.f23551r) {
                                longSparseArray.remove(stickerSet.set.f20872id);
                            }
                        }
                        if (!z10 && z11) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        r3Var2.b(z13, true);
                    }
                }
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }
    }

    @Override
    public final void c(float f10) {
        this.f29312o2 = f10;
        T();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        Utilities.Callback callback;
        TLRPC.StickerSet stickerSet;
        int i12 = NotificationCenter.stickersDidLoad;
        tx txVar = this.O;
        aw awVar = this.I2;
        if (i10 == i12) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (this.f29333v0 != null) {
                    Z(((Boolean) objArr[1]).booleanValue());
                    b0();
                    F();
                    o();
                }
            } else if (((Integer) objArr[0]).intValue() == 5) {
                if (((Boolean) objArr[1]).booleanValue()) {
                    AndroidUtilities.cancelRunOnUIThread(awVar);
                    AndroidUtilities.runOnUIThread(awVar, 100L);
                    return;
                }
                txVar.F(false);
            }
        } else if (i10 == NotificationCenter.groupPackUpdated) {
            long longValue = ((Long) objArr[0]).longValue();
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            TLRPC.ChatFull chatFull = this.G1;
            if (chatFull != null && chatFull.f20846id == longValue && booleanValue) {
                txVar.F(true);
            }
        } else if (i10 == NotificationCenter.recentDocumentsDidLoad) {
            boolean booleanValue2 = ((Boolean) objArr[0]).booleanValue();
            int intValue = ((Integer) objArr[1]).intValue();
            if (booleanValue2 || intValue == 0 || intValue == 2) {
                k(booleanValue2);
            }
        } else if (i10 == NotificationCenter.featuredStickersDidLoad) {
            b0();
            hd0 hd0Var = this.f29336w;
            if (hd0Var != null) {
                int childCount = hd0Var.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    hd0Var.getChildAt(i13).invalidate();
                }
            }
            Z(false);
        } else if (i10 == NotificationCenter.featuredEmojiDidLoad) {
            if (txVar != null) {
                txVar.F(false);
            }
        } else {
            int i14 = NotificationCenter.groupStickersDidLoad;
            ly lyVar = this.P;
            if (i10 == i14) {
                Long l10 = (Long) objArr[0];
                long longValue2 = l10.longValue();
                if (objArr.length > 1) {
                    tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) objArr[1];
                } else {
                    tL_messages_stickerSet = null;
                }
                if (tL_messages_stickerSet != null) {
                    hz hzVar = this.f29337w0;
                    if (hzVar != null && hzVar.d == longValue2 && hzVar.f27662f.size() < tL_messages_stickerSet.documents.size()) {
                        hzVar.f27662f = tL_messages_stickerSet.documents;
                        hzVar.l();
                    }
                    if (lyVar != null && lyVar.d == longValue2 && lyVar.f28896f.size() < tL_messages_stickerSet.documents.size()) {
                        lyVar.f28896f = tL_messages_stickerSet.documents;
                        lyVar.l();
                    }
                }
                TLRPC.ChatFull chatFull2 = this.G1;
                if (chatFull2 != null && (stickerSet = chatFull2.stickerset) != null && stickerSet.f20872id == longValue2) {
                    Z(false);
                }
                HashMap hashMap = this.f29311o1;
                if (hashMap.containsKey(l10) && objArr.length >= 2 && ((Utilities.Callback) hashMap.get(l10)) != null && tL_messages_stickerSet != null && (callback = (Utilities.Callback) hashMap.remove(l10)) != null) {
                    callback.run(tL_messages_stickerSet);
                }
                AndroidUtilities.cancelRunOnUIThread(awVar);
                AndroidUtilities.runOnUIThread(awVar, 100L);
                return;
            }
            int i15 = NotificationCenter.emojiLoaded;
            kx kxVar = this.M;
            if (i10 == i15) {
                rw rwVar = this.A0;
                if (rwVar != null) {
                    int childCount2 = rwVar.getChildCount();
                    for (int i16 = 0; i16 < childCount2; i16++) {
                        View childAt = rwVar.getChildAt(i16);
                        if ((childAt instanceof org.telegram.ui.Cells.m8) || (childAt instanceof org.telegram.ui.Cells.d8)) {
                            childAt.invalidate();
                        }
                    }
                }
                if (kxVar != null) {
                    kxVar.invalidate();
                    int childCount3 = kxVar.getChildCount();
                    for (int i17 = 0; i17 < childCount3; i17++) {
                        View childAt2 = kxVar.getChildAt(i17);
                        if (childAt2 instanceof uy) {
                            childAt2.invalidate();
                        }
                    }
                }
                tu tuVar = this.f29346y1;
                if (tuVar != null) {
                    tuVar.f31419c.invalidate();
                }
                rx rxVar = this.m0;
                if (rxVar != null) {
                    ob1 ob1Var = rxVar.f30135e;
                    int childCount4 = ob1Var.getChildCount();
                    for (int i18 = 0; i18 < childCount4; i18++) {
                        ob1Var.getChildAt(i18).invalidate();
                    }
                }
            } else if (i10 == NotificationCenter.newEmojiSuggestionsAvailable) {
                if (kxVar != null && this.f29266a0) {
                    if ((this.S.f33685c.f26961k == 2 || kxVar.getAdapter() == lyVar) && !TextUtils.isEmpty(lyVar.v)) {
                        lyVar.F(lyVar.v, true);
                    }
                }
            } else if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                if (txVar != null) {
                    txVar.F(false);
                }
                V();
                Z(false);
            }
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        tg.d dVar;
        og.e eVar;
        if (Build.VERSION.SDK_INT >= 31 && (dVar = this.f29295i2) != null && (eVar = this.f29289g2) != null) {
            C();
            RecordingCanvas a2 = dVar.a(getMeasuredWidth(), getMeasuredHeight());
            a2.drawColor(A(org.telegram.ui.ActionBar.k6.f21661d6));
            if (SharedConfig.chatBlurEnabled()) {
                eVar.b(a2, -2);
            }
            dVar.c();
        }
        T();
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.h) {
            canvas.save();
            if (this.f29306n.getVisibility() != 8 && !this.f29320r0 && this.f29327t0) {
                canvas.drawColor(i0.a.k(-1, 25));
            }
            boolean drawChild = super.drawChild(canvas, view, j10);
            float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(this.f29309n2);
            if (navigationBarThirdButtonsFactor > 0.0f) {
                int l1 = org.telegram.ui.ActionBar.k6.l1(navigationBarThirdButtonsFactor, A(org.telegram.ui.ActionBar.k6.He));
                int i10 = this.f29350z2;
                GradientDrawable gradientDrawable = this.f29347y2;
                if (i10 != l1) {
                    gradientDrawable.setColors(new int[]{l1, org.telegram.ui.ActionBar.k6.l1(0.66f, l1), i0.a.k(l1, 0)});
                    this.f29350z2 = l1;
                }
                gradientDrawable.setBounds(0, getMeasuredHeight() - this.f29309n2, getMeasuredWidth(), getMeasuredHeight());
                gradientDrawable.draw(canvas);
            }
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    public int getCurrentPage() {
        return this.f29342x1;
    }

    public ArrayList<xx> getEmojipacks() {
        ArrayList<xx> arrayList = new ArrayList<>();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f29308n1;
            if (i10 < arrayList2.size()) {
                xx xxVar = (xx) arrayList2.get(i10);
                boolean z4 = xxVar.f33216g;
                ArrayList arrayList3 = this.f29304m1;
                if ((!z4 && (xxVar.f33215f || arrayList3.contains(Long.valueOf(xxVar.f33212b.f20872id)))) || (xxVar.f33216g && !xxVar.f33215f && !arrayList3.contains(Long.valueOf(xxVar.f33212b.f20872id)))) {
                    arrayList.add(xxVar);
                }
                i10++;
            } else {
                return arrayList;
            }
        }
    }

    public ArrayList<String> getRecentEmoji() {
        if (this.Z1) {
            return Emoji.recentEmoji;
        }
        if (this.A2 == null) {
            this.A2 = new ArrayList();
        }
        if (Emoji.recentEmoji.size() != this.B2) {
            this.A2.clear();
            int i10 = 0;
            while (true) {
                ArrayList<String> arrayList = Emoji.recentEmoji;
                if (i10 >= arrayList.size()) {
                    break;
                }
                if (!arrayList.get(i10).startsWith("animated_")) {
                    this.A2.add(arrayList.get(i10));
                }
                i10++;
            }
            this.B2 = this.A2.size();
        }
        return this.A2;
    }

    public float getStickersExpandOffset() {
        vw vwVar = this.f29345y0;
        if (vwVar == null) {
            return 0.0f;
        }
        return vwVar.getExpandedOffset();
    }

    public final void h(String str) {
        if (str != null) {
            if (str.startsWith("animated_") || Emoji.isValidEmoji(str)) {
                Emoji.addRecentEmoji(str);
                int i10 = 0;
                if (getVisibility() != 0 || this.h.getCurrentItem() != 0) {
                    Emoji.sortEmoji();
                    this.O.F(false);
                }
                Emoji.saveRecentEmoji();
                if (!this.Z1) {
                    ArrayList arrayList = this.A2;
                    if (arrayList == null) {
                        this.A2 = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    while (true) {
                        ArrayList<String> arrayList2 = Emoji.recentEmoji;
                        if (i10 < arrayList2.size()) {
                            if (!arrayList2.get(i10).startsWith("animated_")) {
                                this.A2.add(arrayList2.get(i10));
                            }
                            i10++;
                        } else {
                            this.B2 = this.A2.size();
                            return;
                        }
                    }
                }
            }
        }
    }

    public final void i(int i10, int i11, boolean z4) {
        if (i10 == 2 || x(i10).K(0) == null) {
            return;
        }
        hx hxVar = new hx(getContext(), i11);
        hxVar.f5805a = !z4 ? 1 : 0;
        w(i10).w0(hxVar);
    }

    public final void k(boolean z4) {
        if (z4) {
            Y();
            return;
        }
        int size = this.f29288g1.size();
        int size2 = this.f29291h1.size();
        int i10 = this.Z0;
        this.f29288g1 = MediaDataController.getInstance(i10).getRecentStickers(0, true);
        this.f29291h1 = MediaDataController.getInstance(i10).getRecentStickers(2);
        if (UserConfig.getInstance(i10).isPremium()) {
            this.f29294i1 = MediaDataController.getInstance(i10).getRecentStickers(7);
        } else {
            this.f29294i1 = new ArrayList();
        }
        for (int i11 = 0; i11 < this.f29291h1.size(); i11++) {
            TLRPC.Document document = (TLRPC.Document) this.f29291h1.get(i11);
            int i12 = 0;
            while (true) {
                if (i12 < this.f29288g1.size()) {
                    TLRPC.Document document2 = (TLRPC.Document) this.f29288g1.get(i12);
                    if (document2.dc_id == document.dc_id && document2.f20851id == document.f20851id) {
                        this.f29288g1.remove(i12);
                        break;
                    }
                    i12++;
                }
            }
        }
        if (MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            int i13 = 0;
            while (i13 < this.f29291h1.size()) {
                if (MessageObject.isPremiumSticker((TLRPC.Document) this.f29291h1.get(i13))) {
                    this.f29291h1.remove(i13);
                    i13--;
                }
                i13++;
            }
            int i14 = 0;
            while (i14 < this.f29288g1.size()) {
                if (MessageObject.isPremiumSticker((TLRPC.Document) this.f29288g1.get(i14))) {
                    this.f29288g1.remove(i14);
                    i14--;
                }
                i14++;
            }
        }
        if (size != this.f29288g1.size() || size2 != this.f29291h1.size()) {
            Z(false);
        }
        dz dzVar = this.f29333v0;
        if (dzVar != null) {
            dzVar.l();
        }
        o();
    }

    public final void l(boolean z4) {
        int i10;
        boolean z10;
        my myVar = this.f29317q1;
        xd.a aVar = this.f29268b;
        kx kxVar = this.M;
        iw iwVar = this.S;
        if (myVar != null && myVar.z()) {
            f2.m1 K = kxVar.K(0);
            if (K == null) {
                yy.a(iwVar, true, !z4);
            } else {
                if (K.f5875a.getTop() < kxVar.getPaddingTop()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                yy.a(iwVar, z10, !z4);
            }
            P(false, !z4);
            iwVar.setTranslationY(aVar.f50541e * AndroidUtilities.dp(15.0f));
        } else if (iwVar != null && kxVar != null) {
            f2.m1 K2 = kxVar.K(0);
            if (K2 != null) {
                i10 = K2.f5875a.getTop();
            } else {
                i10 = -this.Y0;
            }
            iwVar.setTranslationY((aVar.f50541e * AndroidUtilities.dp(15.0f)) + i10);
            iwVar.f33683a.a(false, !z4);
            m(Math.round(this.F.getTranslationY()));
        }
    }

    public final void m(int i10) {
        ObjectAnimator objectAnimator = this.O0[1];
        if (objectAnimator != null && objectAnimator.isRunning()) {
            return;
        }
        boolean z4 = false;
        f2.m1 K = this.M.K(0);
        int dp = AndroidUtilities.dp(38.0f) + i10;
        if (dp > 0 && (K == null || K.f5875a.getBottom() < dp)) {
            z4 = true;
        }
        P(z4, !this.H1);
    }

    public final void n(kx kxVar, int i10) {
        kx kxVar2;
        f2.m1 K;
        int i11;
        hw hwVar = this.F;
        int[] iArr = this.N0;
        if (kxVar == null) {
            iArr[1] = 0;
            hwVar.setTranslationY(0);
        } else if (kxVar.getVisibility() == 0 && !this.f29273c0) {
            my myVar = this.f29317q1;
            if (myVar == null || !myVar.z()) {
                if (i10 > 0 && (kxVar2 = this.M) != null && kxVar2.getVisibility() == 0 && (K = kxVar2.K(0)) != null) {
                    int top = K.f5875a.getTop();
                    if (this.f29266a0) {
                        i11 = this.Y0;
                    } else {
                        i11 = 0;
                    }
                    if (top + i11 >= kxVar2.getPaddingTop()) {
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
                hwVar.setTranslationY(Math.max(-AndroidUtilities.dp(36.0f), iArr[1]));
            }
        }
    }

    public final void o() {
        int L0;
        vw vwVar = this.f29345y0;
        if (vwVar != null && (L0 = this.B0.L0()) != -1) {
            int i10 = this.D1;
            if (i10 <= 0 && (i10 = this.C1) <= 0) {
                i10 = this.B1;
            }
            vwVar.k(this.f29333v0.F(L0), i10);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        int i10 = this.Z0;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.groupPackUpdated);
        if (this.f29333v0 != null) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.stickersDidLoad);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.recentDocumentsDidLoad);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.featuredStickersDidLoad);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.groupStickersDidLoad);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
            AndroidUtilities.runOnUIThread(new aw(this, 0));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        tu tuVar = this.f29346y1;
        if (tuVar != null && tuVar.isShowing()) {
            tuVar.dismiss();
        }
        org.telegram.ui.qt q10 = org.telegram.ui.qt.q();
        if (q10.f40657l == this.f29278d2) {
            q10.W = null;
            q10.f40644a0 = null;
            q10.Y = null;
            q10.f40657l = null;
            q10.f40648c0 = null;
            q10.u();
        }
    }

    @Override
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        if (this.L1 != i14) {
            this.L1 = i14;
            F();
        }
        super.onLayout(z4, i10, i11, i12, i13);
        T();
        a0();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.H1 = true;
        boolean z4 = AndroidUtilities.isInMultiwindow;
        View view = this.v;
        boolean z10 = this.f29266a0;
        if (!z4 && !this.K1) {
            if (this.I1 != 0) {
                if (!this.F2) {
                    setOutlineProvider(null);
                    setClipToOutline(false);
                    setElevation(0.0f);
                }
                if (this.f29320r0) {
                    int i12 = org.telegram.ui.ActionBar.k6.He;
                    setBackgroundColor(A(i12));
                    if (z10) {
                        view.setBackgroundColor(A(i12));
                    }
                }
                this.I1 = 0;
            }
        } else if (this.I1 != 1) {
            if (!this.F2) {
                setOutlineProvider(this.J1);
                setClipToOutline(true);
                setElevation(AndroidUtilities.dp(2.0f));
            }
            setBackgroundResource(R.drawable.smiles_popup);
            Drawable background = getBackground();
            int i13 = org.telegram.ui.ActionBar.k6.He;
            background.setColorFilter(new PorterDuffColorFilter(A(i13), PorterDuff.Mode.MULTIPLY));
            if (z10 && this.f29320r0) {
                view.setBackgroundColor(A(i13));
            }
            this.I1 = 1;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
        this.H1 = false;
        setTranslationY(getTranslationY());
    }

    public final void p(int i10) {
        int L0;
        int i11;
        int L02;
        if (i10 == 0) {
            if (!this.G0 && (L02 = this.B0.L0()) != -1 && this.A0 != null) {
                int i12 = this.D1;
                if (i12 <= 0 && (i12 = this.C1) <= 0) {
                    i12 = this.B1;
                }
                this.f29345y0.k(this.f29333v0.F(L02), i12);
            }
        } else if (i10 == 2) {
            f2.p0 adapter = this.f29280e0.getAdapter();
            qy qyVar = this.f29299k0;
            if (adapter == qyVar && qyVar.F >= 0 && this.f29313p0 >= 0 && this.f29310o0 >= 0 && (L0 = this.f29284f0.L0()) != -1) {
                if (L0 >= qyVar.F) {
                    i11 = this.f29313p0;
                } else {
                    i11 = this.f29310o0;
                }
                this.m0.k(i11, 0);
            }
        }
    }

    public final void q(boolean z4) {
        int i10;
        my myVar = this.f29317q1;
        xd.a aVar = this.f29265a;
        rw rwVar = this.A0;
        boolean z10 = false;
        uw uwVar = this.D0;
        if (myVar != null && myVar.z()) {
            f2.m1 K = rwVar.K(0);
            if (K == null) {
                yy.a(uwVar, true, !z4);
            } else {
                if (K.f5875a.getTop() < rwVar.getPaddingTop()) {
                    z10 = true;
                }
                yy.a(uwVar, z10, !z4);
            }
            uwVar.setTranslationY(aVar.f50541e * AndroidUtilities.dp(15.0f));
        } else if (uwVar != null && rwVar != null) {
            f2.m1 K2 = rwVar.K(0);
            if (K2 != null) {
                i10 = K2.f5875a.getTop();
            } else {
                i10 = -this.Y0;
            }
            uwVar.setTranslationY((aVar.f50541e * AndroidUtilities.dp(15.0f)) + i10);
            uwVar.f33683a.a(false, !z4);
        }
    }

    public final void r() {
        Emoji.clearRecentEmoji();
        this.O.F(false);
    }

    @Override
    public final void requestLayout() {
        if (this.H1) {
            return;
        }
        super.requestLayout();
    }

    public final void s(long j10, boolean z4) {
        yy yyVar;
        f2.j0 j0Var;
        View view;
        sl0 sl0Var;
        int i10;
        TLRPC.TL_messages_stickerSet stickerSetById;
        dz dzVar;
        int E;
        AnimatorSet animatorSet = this.J0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.J0 = null;
        }
        int currentItem = this.h.getCurrentItem();
        if (currentItem == 2 && j10 != -1 && (stickerSetById = MediaDataController.getInstance(this.Z0).getStickerSetById(j10)) != null && (E = (dzVar = this.f29333v0).E(stickerSetById)) >= 0 && E < dzVar.h()) {
            I(E, AndroidUtilities.dp(48.0f));
        }
        qy qyVar = this.f29287g0;
        if (qyVar != null) {
            qyVar.H = false;
        }
        for (int i11 = 0; i11 < 3; i11++) {
            sl0 sl0Var2 = this.A0;
            sl0 sl0Var3 = this.f29280e0;
            ow owVar = this.f29302l0;
            sl0 sl0Var4 = this.M;
            if (i11 == 0) {
                yyVar = this.S;
                j0Var = this.N;
                view = this.F;
                sl0Var = sl0Var4;
            } else if (i11 == 1) {
                j0Var = this.f29284f0;
                view = this.m0;
                sl0Var = sl0Var3;
                yyVar = owVar;
            } else {
                yyVar = this.D0;
                j0Var = this.B0;
                view = this.f29345y0;
                sl0Var = sl0Var2;
            }
            if (yyVar != null) {
                xy xyVar = yyVar.f33689r;
                yyVar.d.setText("");
                if (xyVar != null) {
                    xyVar.E1(null);
                    xyVar.C1();
                }
                int i12 = this.Y0;
                if (i11 == currentItem && z4) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.J0 = animatorSet2;
                    Property property = View.TRANSLATION_Y;
                    if (view != null && i11 != 1) {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, 0.0f), ObjectAnimator.ofFloat(sl0Var, property, AndroidUtilities.dp(36.0f)), ObjectAnimator.ofFloat(yyVar, property, AndroidUtilities.dp(36.0f)));
                    } else {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(sl0Var, property, AndroidUtilities.dp(36.0f) - i12));
                    }
                    this.J0.setDuration(200L);
                    this.J0.setInterpolator(pr.h);
                    this.J0.addListener(new oh.h3(this, j0Var, sl0Var, 5));
                    this.J0.start();
                } else {
                    if (yyVar != owVar) {
                        yyVar.setTranslationY(AndroidUtilities.dp(36.0f) - i12);
                    }
                    if (view != null && i11 != 2) {
                        view.setTranslationY(0.0f);
                    }
                    if (sl0Var == sl0Var2) {
                        i10 = 0;
                        sl0Var.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f) + this.f29309n2);
                    } else {
                        i10 = 0;
                        if (sl0Var == sl0Var3) {
                            sl0Var.setPadding(0, AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(44.0f) + this.f29309n2);
                        } else {
                            if (sl0Var == sl0Var4) {
                                sl0Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f) + this.f29309n2);
                            }
                            i10 = 0;
                        }
                    }
                    j0Var.h1(i10, i10);
                }
            }
        }
        if (!z4) {
            this.f29317q1.i(0);
        }
    }

    public void setBlurredBackgroundDrawableFactory(og.a aVar) {
        org.telegram.ui.ActionBar.g6 g6Var = this.W1;
        View view = this.f29340x;
        if (view != null) {
            qg.b c3 = aVar.c(view, null, false);
            c3.n(sg.b.d(g6Var));
            c3.p(AndroidUtilities.dp(18.0f));
            c3.o(AndroidUtilities.dp(6.0f));
            view.setBackground(c3);
        }
        View view2 = this.B;
        if (view2 != null) {
            qg.b c10 = aVar.c(view2, null, false);
            c10.n(sg.b.d(g6Var));
            c10.p(AndroidUtilities.dp(18.0f));
            c10.o(AndroidUtilities.dp(6.0f));
            view2.setBackground(c10);
        }
        View view3 = this.f29336w;
        if (view3 != null) {
            qg.b c11 = aVar.c(view3, null, false);
            c11.n(sg.b.d(g6Var));
            c11.p(AndroidUtilities.dp(18.0f));
            c11.o(AndroidUtilities.dp(6.0f));
            view3.setBackground(c11);
        }
        View view4 = this.f29344y;
        if (view4 != null) {
            qg.b c12 = aVar.c(view4, null, false);
            c12.n(sg.b.d(g6Var));
            c12.p(AndroidUtilities.dp(18.0f));
            c12.o(AndroidUtilities.dp(6.0f));
            view4.setBackground(c12);
        }
    }

    public void setBottomInset(int i10) {
        if (this.f29309n2 != i10) {
            this.f29309n2 = i10;
            j(i10, this.H);
            j(i10, this.J);
            j(AndroidUtilities.dp(44.0f) + i10, this.M);
            j(AndroidUtilities.dp(44.0f) + i10, this.A0);
            j(AndroidUtilities.dp(44.0f) + i10, this.f29280e0);
            FrameLayout frameLayout = this.f29323s;
            if (frameLayout != null) {
                frameLayout.setTranslationY(-i10);
            }
            T();
            invalidate();
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        this.G1 = chatFull;
        Z(false);
    }

    public void setDelegate(my myVar) {
        this.f29317q1 = myVar;
    }

    public void setDragListener(qx qxVar) {
        this.L0 = qxVar;
    }

    @Override
    public void setEnabled(boolean z4) {
        super.setEnabled(z4);
        uw uwVar = this.D0;
        if (uwVar != null) {
            uwVar.d.setEnabled(z4);
        }
        ow owVar = this.f29302l0;
        if (owVar != null) {
            owVar.d.setEnabled(z4);
        }
        iw iwVar = this.S;
        if (iwVar != null) {
            iwVar.d.setEnabled(z4);
        }
    }

    public void setForseMultiwindowLayout(boolean z4) {
        this.K1 = z4;
    }

    public void setShouldDrawBackground(boolean z4) {
        if (this.f29320r0 != z4) {
            this.f29320r0 = z4;
            U();
        }
    }

    public void setShowing(boolean z4) {
        this.M0 = z4;
        a0();
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        a0();
        T();
    }

    @Override
    public void setVisibility(int i10) {
        boolean z4;
        if (getVisibility() != i10) {
            z4 = true;
        } else {
            z4 = false;
        }
        super.setVisibility(i10);
        if (z4) {
            if (i10 != 8) {
                Emoji.sortEmoji();
                this.O.F(false);
                int i11 = this.Z0;
                NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.stickersDidLoad);
                if (this.f29333v0 != null) {
                    NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.recentDocumentsDidLoad);
                    Z(false);
                    F();
                }
                k(true);
                k(false);
                MediaDataController.getInstance(i11).loadRecents(0, true, true, false);
                MediaDataController.getInstance(i11).loadRecents(0, false, true, false);
                MediaDataController.getInstance(i11).loadRecents(2, false, true, false);
            }
            bx bxVar = this.Q0;
            if (bxVar != null) {
                bxVar.a();
            }
        }
    }

    public final void t(boolean z4) {
        s(-1L, z4);
    }

    public final void u(boolean z4) {
        dz dzVar;
        boolean z10 = this.K2;
        this.K2 = z4;
        if (z10 && !z4) {
            int i10 = this.f29342x1;
            if (i10 == 0) {
                tx txVar = this.O;
                if (txVar != null) {
                    txVar.F(false);
                }
            } else if (i10 == 1) {
                qy qyVar = this.f29299k0;
                if (qyVar != null) {
                    qyVar.l();
                }
            } else if (i10 == 2 && (dzVar = this.f29333v0) != null) {
                dzVar.l();
            }
        }
    }

    public final int v(float f10) {
        return i0.a.k(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Wk, this.W1), (int) (f10 * 255.0f));
    }

    public final f2.w w(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return this.f29284f0;
                }
                throw new IllegalArgumentException(l.d.j(i10, "Unexpected argument: "));
            }
            return this.N;
        }
        return this.B0;
    }

    public final sl0 x(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return this.f29280e0;
                }
                throw new IllegalArgumentException(l.d.j(i10, "Unexpected argument: "));
            }
            return this.M;
        }
        return this.A0;
    }

    public final HorizontalScrollView y(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return this.m0;
                }
                throw new IllegalArgumentException(l.d.j(i10, "Unexpected argument: "));
            }
            return this.F;
        }
        return this.f29345y0;
    }

    @Override
    public final void z(float f10, int i10) {
    }
}
