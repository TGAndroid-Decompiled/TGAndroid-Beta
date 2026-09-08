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
import org.telegram.ui.cc1;
public class kz extends FrameLayout implements le.d, NotificationCenter.NotificationCenterDelegate, qh.a {
    public static final int O2 = 0;
    public final hw A0;
    public int A1;
    public final ArrayList A2;
    public final xw B0;
    public final vu B1;
    public final GradientDrawable B2;
    public final yw C0;
    public final int C1;
    public int C2;
    public final tw D0;
    public final int[] D1;
    public ArrayList D2;
    public final ImageView E;
    public final uw E0;
    public int E1;
    public int E2;
    public AnimatorSet F;
    public iz F0;
    public int F1;
    public long F2;
    public AnimatorSet G;
    public final ww G0;
    public int G1;
    public final le.b G2;
    public float H;
    public final oh.d H0;
    public int H1;
    public ArrayList H2;
    public final jw I;
    public boolean I0;
    public int I1;
    public boolean I2;
    public final jx J;
    public boolean J0;
    public TLRPC.ChatFull J1;
    public AnimatorSet J2;
    public final ah.w K;
    public boolean K0;
    public boolean K1;
    public org.telegram.messenger.video.k K2;
    public final oh.b L;
    public final ey L0;
    public int L1;
    public final cw L2;
    public final ah.w M;
    public AnimatorSet M0;
    public final bi.s5 M1;
    public boolean M2;
    public final oh.b N;
    public final bi.c4 N0;
    public boolean N1;
    public boolean N2;
    public final View O;
    public qx O0;
    public int O1;
    public final kx P;
    public boolean P0;
    public boolean P1;
    public final lx Q;
    public final int[] Q0;
    public boolean Q1;
    public final tx R;
    public final ObjectAnimator[] R0;
    public ty R1;
    public final ky S;
    public boolean S0;
    public float S1;
    public iz T;
    public hg.g1 T0;
    public float T1;
    public final oh.d U;
    public boolean U0;
    public float U1;
    public final kw V;
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
    public final org.telegram.ui.ActionBar.f6 Z1;
    public final le.b f27950a;
    public final ok0 f27951a0;
    public final String[] f27952a1;
    public final org.telegram.ui.ActionBar.u5 a2;
    public final le.b f27953b;
    public final ok0 f27954b0;
    public final int f27955b1;
    public final org.telegram.ui.ActionBar.u5 f27956b2;
    public int f27957c;
    public boolean f27958c0;
    public final int f27959c1;
    public final boolean f27960c2;
    public final ArrayList d;
    public final boolean f27961d0;
    public final ArrayList f27962d1;
    public LongSparseArray f27963d2;
    public final ArrayList f27964e;
    public boolean f27965e0;
    public int f27966e1;
    public PorterDuffColorFilter f27967e2;
    public boolean f27968f;
    public boolean f27969f0;
    public int f27970f1;
    public final org.telegram.ui.Cells.l7 f27971f2;
    public final mw f27972g0;
    public boolean f27973g1;
    public final dx f27974g2;
    public final zw h;
    public final nw f27975h0;
    public TLRPC.TL_messages_stickerSet f27976h1;
    public boolean f27977h2;
    public final qy f27978i0;
    public ArrayList f27979i1;
    public final boolean f27980i2;
    public final py f27981j0;
    public ArrayList f27982j1;
    public final bh.f f27983j2;
    public final sy f27984k0;
    public ArrayList f27985k1;
    public final lh f27986k2;
    public final HashMap f27987l0;
    public ArrayList l1;
    public final gh.d f27988l2;
    public final hw m0;
    public final ArrayList f27989m1;
    public final gh.c f27990m2;
    public final FrameLayout f27991n;
    public final py f27992n0;
    public final ArrayList f27993n1;
    public final bh.b f27994n2;
    public final qw f27995o0;
    public final ArrayList f27996o1;
    public boolean f27997o2;
    public final rx f27998p0;
    public final ArrayList f27999p1;
    public boolean f28000p2;
    public boolean f28001q0;
    public final ArrayList f28002q1;
    public int f28003q2;
    public final FrameLayout f28004r;
    public int f28005r0;
    public final HashMap f28006r1;
    public float f28007r2;
    public final FrameLayout f28008s;
    public int f28009s0;
    public final Paint f28010s1;
    public View f28011s2;
    public int f28012t0;
    public ly f28013t1;
    public int f28014t2;
    public boolean f28015u0;
    public long f28016u1;
    public int f28017u2;
    public final View v;
    public boolean f28018v0;
    public boolean f28019v1;
    public long f28020v2;
    public final ed0 f28021w;
    public boolean f28022w0;
    public boolean f28023w1;
    public boolean f28024w2;
    public final ax f28025x;
    public final rw f28026x0;
    public final TLRPC.StickerSetCovered[] f28027x1;
    public boolean f28028x2;
    public final ImageView f28029y;
    public final bz f28030y0;
    public final LongSparseArray f28031y1;
    public final Rect f28032y2;
    public final fz f28033z0;
    public final LongSparseArray f28034z1;
    public final RectF f28035z2;

    public kz(org.telegram.ui.ActionBar.n2 n2Var, boolean z10, boolean z11, boolean z12, Context context, boolean z13, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z14, final org.telegram.ui.ActionBar.f6 f6Var, boolean z15, boolean z16) {
        super(context);
        org.telegram.ui.ActionBar.u5 u5Var;
        int A;
        jx jxVar;
        final org.telegram.ui.ActionBar.f6 f6Var2;
        cw cwVar;
        boolean z17;
        kx kxVar;
        boolean z18;
        Context context2;
        int i10;
        int i11;
        boolean z19;
        Field field;
        pr prVar = pr.h;
        this.f27950a = new le.b(0, this, prVar, 320L, false);
        this.f27953b = new le.b(1, this, prVar, 320L, false);
        this.f27957c = 2;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.f27964e = new ArrayList();
        this.f27958c0 = true;
        this.f27984k0 = new sy(this);
        this.f27987l0 = new HashMap();
        this.f28001q0 = true;
        this.f28005r0 = -2;
        this.f28009s0 = -2;
        this.f28012t0 = -2;
        this.f28015u0 = true;
        this.f28022w0 = true;
        this.I0 = true;
        this.Q0 = new int[3];
        this.R0 = new ObjectAnimator[3];
        int i12 = UserConfig.selectedAccount;
        this.f27959c1 = i12;
        this.f27962d1 = new ArrayList();
        this.f27979i1 = new ArrayList();
        this.f27982j1 = new ArrayList();
        this.f27985k1 = new ArrayList();
        this.l1 = new ArrayList();
        this.f27989m1 = new ArrayList();
        this.f27993n1 = new ArrayList();
        new ArrayList();
        this.f27996o1 = new ArrayList();
        this.f27999p1 = new ArrayList();
        this.f28002q1 = new ArrayList();
        this.f28006r1 = new HashMap();
        this.f28027x1 = new TLRPC.StickerSetCovered[10];
        this.f28031y1 = new LongSparseArray();
        this.f28034z1 = new LongSparseArray();
        this.D1 = new int[2];
        this.F1 = -2;
        this.G1 = -2;
        this.H1 = -2;
        this.I1 = -2;
        this.L1 = -1;
        this.f27971f2 = new org.telegram.ui.Cells.l7(this, 11);
        this.f27974g2 = new dx(this);
        this.f27977h2 = true;
        this.f28007r2 = -1.0f;
        this.f28014t2 = -1;
        this.f28017u2 = -1;
        this.f28020v2 = -1L;
        this.f28024w2 = false;
        this.f28028x2 = true;
        this.f28032y2 = new Rect();
        RectF rectF = new RectF();
        this.f28035z2 = rectF;
        ArrayList arrayList2 = new ArrayList(1);
        this.A2 = arrayList2;
        arrayList2.add(rectF);
        new Paint(1);
        this.B2 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.G2 = new le.b(0, new fw(this, 1), prVar, 380L, true);
        this.L2 = new cw(this, 2);
        this.M2 = false;
        this.f28015u0 = z14;
        this.Y1 = n2Var;
        this.f27960c2 = z10;
        this.Z1 = f6Var;
        this.f27980i2 = z16;
        gh.c cVar = new gh.c();
        this.f27990m2 = cVar;
        cVar.a(A(org.telegram.ui.ActionBar.j6.f20690d6));
        if (z15) {
            u(true);
        }
        i0.a.k(A(org.telegram.ui.ActionBar.j6.Wk), 30);
        int dp = AndroidUtilities.dp(50.0f);
        this.f27955b1 = dp;
        this.f27961d0 = z13;
        this.X0 = new Drawable[]{org.telegram.ui.ActionBar.j6.U(context, R.drawable.smiles_tab_smiles, z16 ? v(0.4f) : A(org.telegram.ui.ActionBar.j6.Re), z16 ? v(0.8f) : A(org.telegram.ui.ActionBar.j6.Oe)), org.telegram.ui.ActionBar.j6.U(context, R.drawable.smiles_tab_gif, z16 ? v(0.4f) : A(org.telegram.ui.ActionBar.j6.Re), z16 ? v(0.8f) : A(org.telegram.ui.ActionBar.j6.Oe)), org.telegram.ui.ActionBar.j6.U(context, R.drawable.smiles_tab_stickers, z16 ? v(0.4f) : A(org.telegram.ui.ActionBar.j6.Re), z16 ? v(0.8f) : A(org.telegram.ui.ActionBar.j6.Oe))};
        org.telegram.ui.ActionBar.u5 U = org.telegram.ui.ActionBar.j6.U(context, R.drawable.msg_emoji_recent, z16 ? v(0.4f) : A(org.telegram.ui.ActionBar.j6.Me), z16 ? v(0.8f) : A(org.telegram.ui.ActionBar.j6.Oe));
        org.telegram.ui.ActionBar.u5 U2 = org.telegram.ui.ActionBar.j6.U(context, R.drawable.emoji_tabs_faves, z16 ? v(0.4f) : A(org.telegram.ui.ActionBar.j6.Me), z16 ? v(0.8f) : A(org.telegram.ui.ActionBar.j6.Oe));
        org.telegram.ui.ActionBar.u5 U3 = org.telegram.ui.ActionBar.j6.U(context, R.drawable.emoji_tabs_new3, z16 ? v(0.4f) : A(org.telegram.ui.ActionBar.j6.Me), z16 ? v(0.8f) : A(org.telegram.ui.ActionBar.j6.Oe));
        int i13 = R.drawable.emoji_tabs_new1;
        if (z16) {
            u5Var = U3;
            A = v(0.4f);
        } else {
            u5Var = U3;
            A = A(org.telegram.ui.ActionBar.j6.Me);
        }
        org.telegram.ui.ActionBar.u5 U4 = org.telegram.ui.ActionBar.j6.U(context, i13, A, z16 ? v(0.8f) : A(org.telegram.ui.ActionBar.j6.Oe));
        this.a2 = U4;
        int i14 = R.drawable.emoji_tabs_new2;
        int i15 = org.telegram.ui.ActionBar.j6.Qe;
        org.telegram.ui.ActionBar.u5 U5 = org.telegram.ui.ActionBar.j6.U(context, i14, A(i15), A(i15));
        this.f27956b2 = U5;
        this.Y0 = new Drawable[]{U, U2, u5Var, new LayerDrawable(new Drawable[]{U4, U5})};
        this.Z0 = new Drawable[]{org.telegram.ui.ActionBar.j6.U(context, R.drawable.msg_emoji_recent, z16 ? v(0.4f) : A(org.telegram.ui.ActionBar.j6.Me), z16 ? v(0.8f) : A(org.telegram.ui.ActionBar.j6.Oe)), org.telegram.ui.ActionBar.j6.U(context, R.drawable.stickers_gifs_trending, z16 ? v(0.4f) : A(org.telegram.ui.ActionBar.j6.Me), z16 ? v(0.8f) : A(org.telegram.ui.ActionBar.j6.Oe))};
        this.f27952a1 = new String[]{LocaleController.getString(R.string.Emoji1), LocaleController.getString(R.string.Emoji2), LocaleController.getString(R.string.Emoji3), LocaleController.getString(R.string.Emoji4), LocaleController.getString(R.string.Emoji5), LocaleController.getString(R.string.Emoji6), LocaleController.getString(R.string.Emoji7), LocaleController.getString(R.string.Emoji8)};
        this.J1 = chatFull;
        Paint paint = new Paint(1);
        this.f28010s1 = paint;
        paint.setColor(A(org.telegram.ui.ActionBar.j6.f20642af));
        bi.z1 z1Var = yf.j0.f50141a;
        this.M1 = new bi.s5(AndroidUtilities.dp(6.0f));
        jx jxVar2 = new jx(this, context);
        this.J = jxVar2;
        ?? obj = new Object();
        obj.f26562a = 0;
        obj.f26563b = jxVar2;
        arrayList.add(obj);
        if (z10) {
            MediaDataController.getInstance(i12).checkStickers(5);
            MediaDataController.getInstance(i12).checkFeaturedEmoji();
            this.f27967e2 = new PorterDuffColorFilter(A(org.telegram.ui.ActionBar.j6.Oh), PorterDuff.Mode.SRC_IN);
        }
        kx kxVar2 = new kx(this, context);
        this.P = kxVar2;
        s4.j jVar = new s4.j();
        jVar.f45856c = 220L;
        jVar.f45857e = 220L;
        jVar.f45858f = 160L;
        jVar.f45859g = 160L;
        jVar.f45860i = pr.f29494g;
        kxVar2.setItemAnimator(jVar);
        kxVar2.setOnTouchListener(new View.OnTouchListener(this) {
            public final kz f25826b;

            {
                this.f25826b = this;
            }

            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                switch (r3) {
                    case 0:
                        org.telegram.ui.st q6 = org.telegram.ui.st.q();
                        kz kzVar = this.f25826b;
                        kx kxVar3 = kzVar.P;
                        kzVar.getMeasuredHeight();
                        return q6.s(motionEvent, kxVar3, null, kzVar.f27974g2, f6Var);
                    case 1:
                        org.telegram.ui.st q10 = org.telegram.ui.st.q();
                        kz kzVar2 = this.f25826b;
                        return q10.s(motionEvent, kzVar2.f27975h0, kzVar2.m0, kzVar2.f27974g2, f6Var);
                    default:
                        org.telegram.ui.st q11 = org.telegram.ui.st.q();
                        kz kzVar3 = this.f25826b;
                        tw twVar = kzVar3.D0;
                        kzVar3.getMeasuredHeight();
                        return q11.s(motionEvent, twVar, kzVar3.A0, kzVar3.f27974g2, f6Var);
                }
            }
        });
        kxVar2.setOnItemLongClickListener(new fw(this, 0));
        kxVar2.setInstantClick(true);
        lx lxVar = new lx(this);
        this.Q = lxVar;
        kxVar2.setLayoutManager(lxVar);
        kxVar2.setTopGlowOffset(AndroidUtilities.dp(38.0f));
        kxVar2.setBottomGlowOffset(AndroidUtilities.dp(36.0f));
        kxVar2.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f));
        int i16 = org.telegram.ui.ActionBar.j6.He;
        kxVar2.setGlowColor(A(i16));
        kxVar2.setItemSelectorColorProvider(new p2(11));
        kxVar2.setClipToPadding(false);
        lxVar.O = new mx(this);
        tx txVar = new tx(this);
        this.R = txVar;
        kxVar2.setAdapter(txVar);
        kxVar2.i(new di.r1(this, 3));
        this.S = new ky(this, context);
        jxVar2.addView(kxVar2, w7.x5.c(-1.0f, -1));
        ok0 ok0Var = new ok0(kxVar2, lxVar);
        this.f27954b0 = ok0Var;
        ok0Var.f29130i = new nx(this);
        kxVar2.setOnScrollListener(new ox(this));
        if (n2Var != null) {
            jxVar = jxVar2;
            f6Var2 = f6Var;
            cwVar = new cw(this, 5);
            kxVar = kxVar2;
            z18 = z16;
            context2 = context;
            i10 = dp;
            i11 = -1;
            z17 = z10;
        } else {
            jxVar = jxVar2;
            f6Var2 = f6Var;
            cwVar = null;
            z17 = z10;
            kxVar = kxVar2;
            z18 = z16;
            context2 = context;
            i10 = dp;
            i11 = -1;
        }
        jw jwVar = new jw(this, context2, f6Var2, z17, cwVar, z18);
        this.I = jwVar;
        if (z13) {
            kw kwVar = new kw(this, context2);
            this.V = kwVar;
            jxVar.addView(kwVar, new FrameLayout.LayoutParams(i11, AndroidUtilities.getShadowHeight() + i10));
            kwVar.d.setOnFocusChangeListener(new lw(this));
            oh.d dVar = new oh.d(context2, f6Var2);
            this.U = dVar;
            dVar.setVisibility(8);
            dVar.setOnBackClickListener(new View.OnClickListener(this) {
                public final kz f26541b;

                {
                    this.f26541b = this;
                }

                @Override
                public final void onClick(View view) {
                    xy xyVar;
                    switch (r2) {
                        case 0:
                            ky kyVar = this.f26541b.S;
                            fy fyVar = kyVar.f27941c;
                            int childCount = fyVar.getChildCount();
                            for (int i17 = 0; i17 < childCount; i17++) {
                                ((oh.c) fyVar.getChildAt(i17)).a(false, true);
                            }
                            kyVar.d = 0L;
                            kyVar.F.f27953b.a(false, true);
                            kyVar.l();
                            return;
                        case 1:
                            fz fzVar = this.f26541b.f28033z0;
                            ez ezVar = fzVar.f26229c;
                            int childCount2 = ezVar.getChildCount();
                            for (int i18 = 0; i18 < childCount2; i18++) {
                                ((oh.c) ezVar.getChildAt(i18)).a(false, true);
                            }
                            fzVar.d = 0L;
                            fzVar.Q.f27950a.a(false, true);
                            fzVar.l();
                            return;
                        case 2:
                            ly lyVar = this.f26541b.f28013t1;
                            if (lyVar != null) {
                                lyVar.w();
                                return;
                            }
                            return;
                        default:
                            kz kzVar = this.f26541b;
                            int currentItem = kzVar.h.getCurrentItem();
                            if (currentItem == 0) {
                                xyVar = kzVar.V;
                            } else if (currentItem == 1) {
                                xyVar = kzVar.f27995o0;
                            } else {
                                xyVar = kzVar.G0;
                            }
                            if (xyVar != null) {
                                hq hqVar = xyVar.d;
                                hqVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                hqVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                hqVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                return;
                            }
                            return;
                    }
                }
            });
            jxVar.addView(dVar, new FrameLayout.LayoutParams(i11, i10));
        }
        int A2 = A(i16);
        if (Color.alpha(A2) >= 255) {
            jwVar.setBackgroundColor(A2);
        }
        txVar.G(true);
        jwVar.p(getEmojipacks());
        jxVar.addView(jwVar, w7.x5.c(36.0f, i11));
        View view = new View(context2);
        this.O = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        int i17 = org.telegram.ui.ActionBar.j6.Ke;
        view.setBackgroundColor(A(i17));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i11, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(36.0f);
        jxVar.addView(view, layoutParams);
        oh.b bVar = new oh.b(context2, f6Var2);
        this.L = bVar;
        ah.w wVar = new ah.w(context2, 5, f6Var2);
        this.K = wVar;
        wVar.setVisibility(8);
        wVar.addView(bVar, w7.x5.d(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
        jxVar.addView(wVar, w7.x5.e(i11, -2, 80));
        if (z11) {
            hm0 hm0Var = hm0.f26786b;
            if (z12) {
                mw mwVar = new mw(this, context2);
                this.f27972g0 = mwVar;
                ?? obj2 = new Object();
                obj2.f26562a = 1;
                obj2.f26563b = mwVar;
                this.d.add(obj2);
                nw nwVar = new nw(this, context2);
                this.f27975h0 = nwVar;
                nwVar.setClipToPadding(false);
                qy qyVar = new qy(this);
                this.f27978i0 = qyVar;
                nwVar.setLayoutManager(qyVar);
                nwVar.i(new ow(this));
                nwVar.setPadding(0, i10, 0, AndroidUtilities.dp(44.0f) + this.f28003q2);
                nwVar.setOverScrollMode(2);
                ((s4.f1) nwVar.getItemAnimator()).f45805m = false;
                py pyVar = new py(this, context2, true, Integer.MAX_VALUE);
                this.f27992n0 = pyVar;
                nwVar.setAdapter(pyVar);
                this.f27981j0 = new py(this, context2, false, 0);
                nwVar.setOnScrollListener(new pw(this));
                nwVar.setOnTouchListener(new View.OnTouchListener(this) {
                    public final kz f25826b;

                    {
                        this.f25826b = this;
                    }

                    @Override
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        switch (r3) {
                            case 0:
                                org.telegram.ui.st q6 = org.telegram.ui.st.q();
                                kz kzVar = this.f25826b;
                                kx kxVar3 = kzVar.P;
                                kzVar.getMeasuredHeight();
                                return q6.s(motionEvent, kxVar3, null, kzVar.f27974g2, f6Var2);
                            case 1:
                                org.telegram.ui.st q10 = org.telegram.ui.st.q();
                                kz kzVar2 = this.f25826b;
                                return q10.s(motionEvent, kzVar2.f27975h0, kzVar2.m0, kzVar2.f27974g2, f6Var2);
                            default:
                                org.telegram.ui.st q11 = org.telegram.ui.st.q();
                                kz kzVar3 = this.f25826b;
                                tw twVar = kzVar3.D0;
                                kzVar3.getMeasuredHeight();
                                return q11.s(motionEvent, twVar, kzVar3.A0, kzVar3.f27974g2, f6Var2);
                        }
                    }
                });
                ?? r12 = new zk0(this) {
                    public final kz f26908b;

                    {
                        this.f26908b = this;
                    }

                    @Override
                    public final void a(int i18, View view2) {
                        int i19;
                        String str;
                        switch (r2) {
                            case 0:
                                kz kzVar = this.f26908b;
                                nw nwVar2 = kzVar.f27975h0;
                                py pyVar2 = kzVar.f27981j0;
                                py pyVar3 = kzVar.f27992n0;
                                if (kzVar.f28013t1 != null) {
                                    pyVar3.getClass();
                                    ArrayList arrayList3 = pyVar3.f29545x;
                                    if (nwVar2.getAdapter() == pyVar3) {
                                        if (i18 >= 0) {
                                            int i20 = pyVar3.H;
                                            if (i18 < i20) {
                                                kzVar.f28013t1.v(view2, kzVar.f27979i1.get(i18), null, "gif", true, 0, 0);
                                                return;
                                            }
                                            if (i20 > 0) {
                                                i19 = (i18 - i20) - 1;
                                            } else {
                                                i19 = i18;
                                            }
                                            if (i19 >= 0 && i19 < arrayList3.size()) {
                                                kzVar.f28013t1.v(view2, arrayList3.get(i19), null, pyVar3.f29541n, true, 0, 0);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    } else if (nwVar2.getAdapter() == pyVar2 && i18 >= 0 && i18 < pyVar2.f29545x.size()) {
                                        kzVar.f28013t1.v(view2, pyVar2.f29545x.get(i18), pyVar2.f29544w, pyVar2.f29541n, true, 0, 0);
                                        kzVar.Y();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            default:
                                kz kzVar2 = this.f26908b;
                                s4.h0 adapter = kzVar2.D0.getAdapter();
                                fz fzVar = kzVar2.f28033z0;
                                if (adapter == fzVar) {
                                    str = fzVar.N;
                                } else {
                                    str = null;
                                }
                                String str2 = str;
                                if (view2 instanceof org.telegram.ui.Cells.f8) {
                                    org.telegram.ui.Cells.f8 f8Var = (org.telegram.ui.Cells.f8) view2;
                                    if (f8Var.getSticker() != null && MessageObject.isPremiumSticker(f8Var.getSticker()) && !AccountInstance.getInstance(kzVar2.f27959c1).getUserConfig().isPremium()) {
                                        org.telegram.ui.st.q().y(f8Var);
                                        return;
                                    }
                                    org.telegram.ui.st.q().u();
                                    if (!f8Var.f21974r) {
                                        f8Var.f21974r = true;
                                        f8Var.f21973n = 0.5f;
                                        f8Var.f21977x = 0L;
                                        org.telegram.ui.Cells.e8 e8Var = f8Var.f21968a;
                                        e8Var.setAlpha(0.5f * f8Var.H);
                                        e8Var.invalidate();
                                        f8Var.f21975s = System.currentTimeMillis();
                                        f8Var.invalidate();
                                        kzVar2.f28013t1.m(f8Var, f8Var.getSticker(), str2, f8Var.getParentObject(), f8Var.getSendAnimationData(), true, 0);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                };
                this.m0 = r12;
                nwVar.setOnItemClickListener((zk0) r12);
                mwVar.addView(nwVar, w7.x5.c(-1.0f, -1));
                qw qwVar = new qw(this, context2);
                this.f27995o0 = qwVar;
                mwVar.addView(qwVar, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + i10));
                rx rxVar = new rx(this, context2, f6Var2);
                this.f27998p0 = rxVar;
                rxVar.setType(hm0Var);
                rxVar.setUnderlineHeight(AndroidUtilities.getShadowHeight());
                rxVar.setIndicatorColor(A(i15));
                rxVar.setUnderlineColor(A(i17));
                rxVar.setBackgroundColor(A(i16));
                X();
                rxVar.setDelegate(new fw(this, 2));
                pyVar.F("", "", true, true, true);
            }
            rw rwVar = new rw(this, context2, z14);
            this.f28026x0 = rwVar;
            MediaDataController.getInstance(this.f27959c1).checkStickers(0);
            MediaDataController.getInstance(this.f27959c1).checkFeaturedStickers();
            tw twVar = new tw(this, context2);
            this.D0 = twVar;
            uw uwVar = new uw(this);
            this.E0 = uwVar;
            twVar.setLayoutManager(uwVar);
            uwVar.O = new vw(this);
            twVar.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f));
            twVar.setClipToPadding(false);
            ?? obj3 = new Object();
            obj3.f26562a = 2;
            obj3.f26563b = rwVar;
            this.d.add(obj3);
            this.f28033z0 = new fz(this, context2);
            bz bzVar = new bz(this, context2);
            this.f28030y0 = bzVar;
            twVar.setAdapter(bzVar);
            twVar.setOnTouchListener(new View.OnTouchListener(this) {
                public final kz f25826b;

                {
                    this.f25826b = this;
                }

                @Override
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    switch (r3) {
                        case 0:
                            org.telegram.ui.st q6 = org.telegram.ui.st.q();
                            kz kzVar = this.f25826b;
                            kx kxVar3 = kzVar.P;
                            kzVar.getMeasuredHeight();
                            return q6.s(motionEvent, kxVar3, null, kzVar.f27974g2, f6Var2);
                        case 1:
                            org.telegram.ui.st q10 = org.telegram.ui.st.q();
                            kz kzVar2 = this.f25826b;
                            return q10.s(motionEvent, kzVar2.f27975h0, kzVar2.m0, kzVar2.f27974g2, f6Var2);
                        default:
                            org.telegram.ui.st q11 = org.telegram.ui.st.q();
                            kz kzVar3 = this.f25826b;
                            tw twVar2 = kzVar3.D0;
                            kzVar3.getMeasuredHeight();
                            return q11.s(motionEvent, twVar2, kzVar3.A0, kzVar3.f27974g2, f6Var2);
                    }
                }
            });
            ?? r42 = new zk0(this) {
                public final kz f26908b;

                {
                    this.f26908b = this;
                }

                @Override
                public final void a(int i18, View view2) {
                    int i19;
                    String str;
                    switch (r2) {
                        case 0:
                            kz kzVar = this.f26908b;
                            nw nwVar2 = kzVar.f27975h0;
                            py pyVar2 = kzVar.f27981j0;
                            py pyVar3 = kzVar.f27992n0;
                            if (kzVar.f28013t1 != null) {
                                pyVar3.getClass();
                                ArrayList arrayList3 = pyVar3.f29545x;
                                if (nwVar2.getAdapter() == pyVar3) {
                                    if (i18 >= 0) {
                                        int i20 = pyVar3.H;
                                        if (i18 < i20) {
                                            kzVar.f28013t1.v(view2, kzVar.f27979i1.get(i18), null, "gif", true, 0, 0);
                                            return;
                                        }
                                        if (i20 > 0) {
                                            i19 = (i18 - i20) - 1;
                                        } else {
                                            i19 = i18;
                                        }
                                        if (i19 >= 0 && i19 < arrayList3.size()) {
                                            kzVar.f28013t1.v(view2, arrayList3.get(i19), null, pyVar3.f29541n, true, 0, 0);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                } else if (nwVar2.getAdapter() == pyVar2 && i18 >= 0 && i18 < pyVar2.f29545x.size()) {
                                    kzVar.f28013t1.v(view2, pyVar2.f29545x.get(i18), pyVar2.f29544w, pyVar2.f29541n, true, 0, 0);
                                    kzVar.Y();
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        default:
                            kz kzVar2 = this.f26908b;
                            s4.h0 adapter = kzVar2.D0.getAdapter();
                            fz fzVar = kzVar2.f28033z0;
                            if (adapter == fzVar) {
                                str = fzVar.N;
                            } else {
                                str = null;
                            }
                            String str2 = str;
                            if (view2 instanceof org.telegram.ui.Cells.f8) {
                                org.telegram.ui.Cells.f8 f8Var = (org.telegram.ui.Cells.f8) view2;
                                if (f8Var.getSticker() != null && MessageObject.isPremiumSticker(f8Var.getSticker()) && !AccountInstance.getInstance(kzVar2.f27959c1).getUserConfig().isPremium()) {
                                    org.telegram.ui.st.q().y(f8Var);
                                    return;
                                }
                                org.telegram.ui.st.q().u();
                                if (!f8Var.f21974r) {
                                    f8Var.f21974r = true;
                                    f8Var.f21973n = 0.5f;
                                    f8Var.f21977x = 0L;
                                    org.telegram.ui.Cells.e8 e8Var = f8Var.f21968a;
                                    e8Var.setAlpha(0.5f * f8Var.H);
                                    e8Var.invalidate();
                                    f8Var.f21975s = System.currentTimeMillis();
                                    f8Var.invalidate();
                                    kzVar2.f28013t1.m(f8Var, f8Var.getSticker(), str2, f8Var.getParentObject(), f8Var.getSendAnimationData(), true, 0);
                                    return;
                                }
                                return;
                            }
                            return;
                    }
                }
            };
            this.A0 = r42;
            twVar.setOnItemClickListener((zk0) r42);
            twVar.setGlowColor(A(i16));
            rwVar.addView(twVar);
            this.f27951a0 = new ok0(twVar, uwVar);
            ww wwVar = new ww(this, context2);
            this.G0 = wwVar;
            rwVar.addView(wwVar, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + i10));
            oh.d dVar2 = new oh.d(context2, f6Var2);
            this.H0 = dVar2;
            dVar2.setVisibility(8);
            dVar2.setOnBackClickListener(new View.OnClickListener(this) {
                public final kz f26541b;

                {
                    this.f26541b = this;
                }

                @Override
                public final void onClick(View view2) {
                    xy xyVar;
                    switch (r2) {
                        case 0:
                            ky kyVar = this.f26541b.S;
                            fy fyVar = kyVar.f27941c;
                            int childCount = fyVar.getChildCount();
                            for (int i172 = 0; i172 < childCount; i172++) {
                                ((oh.c) fyVar.getChildAt(i172)).a(false, true);
                            }
                            kyVar.d = 0L;
                            kyVar.F.f27953b.a(false, true);
                            kyVar.l();
                            return;
                        case 1:
                            fz fzVar = this.f26541b.f28033z0;
                            ez ezVar = fzVar.f26229c;
                            int childCount2 = ezVar.getChildCount();
                            for (int i18 = 0; i18 < childCount2; i18++) {
                                ((oh.c) ezVar.getChildAt(i18)).a(false, true);
                            }
                            fzVar.d = 0L;
                            fzVar.Q.f27950a.a(false, true);
                            fzVar.l();
                            return;
                        case 2:
                            ly lyVar = this.f26541b.f28013t1;
                            if (lyVar != null) {
                                lyVar.w();
                                return;
                            }
                            return;
                        default:
                            kz kzVar = this.f26541b;
                            int currentItem = kzVar.h.getCurrentItem();
                            if (currentItem == 0) {
                                xyVar = kzVar.V;
                            } else if (currentItem == 1) {
                                xyVar = kzVar.f27995o0;
                            } else {
                                xyVar = kzVar.G0;
                            }
                            if (xyVar != null) {
                                hq hqVar = xyVar.d;
                                hqVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                hqVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                hqVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                return;
                            }
                            return;
                    }
                }
            });
            rwVar.addView(dVar2, new FrameLayout.LayoutParams(-1, i10));
            z19 = z14;
            xw xwVar = new xw(this, context2, f6Var2, n2Var, z19);
            this.B0 = xwVar;
            xwVar.setDragEnabled(true);
            xwVar.setWillNotDraw(false);
            xwVar.setType(hm0Var);
            xwVar.setUnderlineHeight(twVar.canScrollVertically(-1) ? AndroidUtilities.getShadowHeight() : 0);
            xwVar.setIndicatorColor(A(i15));
            xwVar.setUnderlineColor(A(i17));
            if (viewGroup != null && z19) {
                yw ywVar = new yw(this, context2);
                this.C0 = ywVar;
                ywVar.addView(xwVar, w7.x5.e(-1, 36, 51));
                viewGroup.addView(ywVar, w7.x5.c(-2.0f, -1));
            } else {
                rwVar.addView(xwVar, w7.x5.e(-1, 36, 51));
            }
            Z(true);
            xwVar.setDelegate(new fw(this, 3));
            twVar.setOnScrollListener(new jz(this, 0));
            oh.b bVar2 = new oh.b(context2, f6Var2);
            this.N = bVar2;
            ah.w wVar2 = new ah.w(context2, 5, f6Var2);
            this.M = wVar2;
            wVar2.setVisibility(8);
            wVar2.addView(bVar2, w7.x5.d(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
            rwVar.addView(wVar2, w7.x5.e(-1, -2, 80));
        } else {
            z19 = z14;
        }
        this.f27964e.clear();
        this.f27964e.addAll(this.d);
        zw zwVar = new zw(this, context2);
        this.h = zwVar;
        ey eyVar = new ey(this);
        this.L0 = eyVar;
        zwVar.setAdapter(eyVar);
        ax axVar = new ax(this, context2);
        this.f28025x = axVar;
        axVar.setHapticFeedbackEnabled(true);
        axVar.setImageResource(R.drawable.smiles_tab_clear);
        int v = z16 ? v(0.6f) : A(org.telegram.ui.ActionBar.j6.Re);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        axVar.setColorFilter(new PorterDuffColorFilter(v, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        axVar.setScaleType(scaleType);
        axVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
        axVar.setFocusable(true);
        axVar.setOnClickListener(new Object());
        w7.z5.a(axVar);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f28004r = frameLayout;
        if (z13) {
            addView(frameLayout, w7.x5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, (AndroidUtilities.getShadowHeight() / AndroidUtilities.density) + 40.0f));
        } else {
            addView(frameLayout, w7.x5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.f28008s = frameLayout2;
        addView(frameLayout2, w7.x5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 64.0f));
        FrameLayout frameLayout3 = new FrameLayout(context2);
        this.f27991n = frameLayout3;
        View view2 = new View(context2);
        this.v = view2;
        frameLayout3.addView(view2, new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(40.0f), 83));
        if (z13) {
            addView(frameLayout3, w7.x5.e(-1, 48, 80));
            frameLayout3.addView(axVar, w7.x5.d(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
            if (z11) {
                ImageView imageView = new ImageView(context2);
                this.f28029y = imageView;
                imageView.setImageResource(R.drawable.smiles_tab_settings);
                imageView.setColorFilter(new PorterDuffColorFilter(z16 ? v(0.6f) : A(org.telegram.ui.ActionBar.j6.Re), mode));
                imageView.setScaleType(scaleType);
                imageView.setFocusable(true);
                imageView.setContentDescription(LocaleController.getString(R.string.Settings));
                w7.z5.a(imageView);
                frameLayout3.addView(imageView, w7.x5.d(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
                imageView.setOnClickListener(new View.OnClickListener(this) {
                    public final kz f26541b;

                    {
                        this.f26541b = this;
                    }

                    @Override
                    public final void onClick(View view22) {
                        xy xyVar;
                        switch (r2) {
                            case 0:
                                ky kyVar = this.f26541b.S;
                                fy fyVar = kyVar.f27941c;
                                int childCount = fyVar.getChildCount();
                                for (int i172 = 0; i172 < childCount; i172++) {
                                    ((oh.c) fyVar.getChildAt(i172)).a(false, true);
                                }
                                kyVar.d = 0L;
                                kyVar.F.f27953b.a(false, true);
                                kyVar.l();
                                return;
                            case 1:
                                fz fzVar = this.f26541b.f28033z0;
                                ez ezVar = fzVar.f26229c;
                                int childCount2 = ezVar.getChildCount();
                                for (int i18 = 0; i18 < childCount2; i18++) {
                                    ((oh.c) ezVar.getChildAt(i18)).a(false, true);
                                }
                                fzVar.d = 0L;
                                fzVar.Q.f27950a.a(false, true);
                                fzVar.l();
                                return;
                            case 2:
                                ly lyVar = this.f26541b.f28013t1;
                                if (lyVar != null) {
                                    lyVar.w();
                                    return;
                                }
                                return;
                            default:
                                kz kzVar = this.f26541b;
                                int currentItem = kzVar.h.getCurrentItem();
                                if (currentItem == 0) {
                                    xyVar = kzVar.V;
                                } else if (currentItem == 1) {
                                    xyVar = kzVar.f27995o0;
                                } else {
                                    xyVar = kzVar.G0;
                                }
                                if (xyVar != null) {
                                    hq hqVar = xyVar.d;
                                    hqVar.requestFocus();
                                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                    hqVar.onTouchEvent(obtain);
                                    obtain.recycle();
                                    MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                    hqVar.onTouchEvent(obtain2);
                                    obtain2.recycle();
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            ed0 ed0Var = new ed0(context2, f6Var2);
            this.f28021w = ed0Var;
            ed0Var.setViewPager(zwVar);
            ed0Var.setShouldExpand(false);
            ed0Var.setIndicatorHeight(AndroidUtilities.dp(3.0f));
            ed0Var.setIndicatorColor(i0.a.k(A(org.telegram.ui.ActionBar.j6.Oe), 20));
            ed0Var.setUnderlineHeight(0);
            ed0Var.setTabPaddingLeftRight(AndroidUtilities.dp(11.0f));
            ed0Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f));
            frameLayout3.addView(ed0Var, w7.x5.e(-2, 48, 81));
            ed0Var.setOnPageChangeListener(new cx(this, z19));
            ImageView imageView2 = new ImageView(context2);
            this.E = imageView2;
            imageView2.setImageResource(R.drawable.smiles_tab_search);
            imageView2.setColorFilter(new PorterDuffColorFilter(z16 ? v(0.6f) : A(org.telegram.ui.ActionBar.j6.Re), mode));
            imageView2.setScaleType(scaleType);
            imageView2.setContentDescription(LocaleController.getString(R.string.Search));
            imageView2.setFocusable(true);
            imageView2.setVisibility(8);
            frameLayout3.addView(imageView2, w7.x5.d(48, 48.0f, 83, 2.0f, 0.0f, 2.0f, 0.0f));
            imageView2.setOnClickListener(new View.OnClickListener(this) {
                public final kz f26541b;

                {
                    this.f26541b = this;
                }

                @Override
                public final void onClick(View view22) {
                    xy xyVar;
                    switch (r2) {
                        case 0:
                            ky kyVar = this.f26541b.S;
                            fy fyVar = kyVar.f27941c;
                            int childCount = fyVar.getChildCount();
                            for (int i172 = 0; i172 < childCount; i172++) {
                                ((oh.c) fyVar.getChildAt(i172)).a(false, true);
                            }
                            kyVar.d = 0L;
                            kyVar.F.f27953b.a(false, true);
                            kyVar.l();
                            return;
                        case 1:
                            fz fzVar = this.f26541b.f28033z0;
                            ez ezVar = fzVar.f26229c;
                            int childCount2 = ezVar.getChildCount();
                            for (int i18 = 0; i18 < childCount2; i18++) {
                                ((oh.c) ezVar.getChildAt(i18)).a(false, true);
                            }
                            fzVar.d = 0L;
                            fzVar.Q.f27950a.a(false, true);
                            fzVar.l();
                            return;
                        case 2:
                            ly lyVar = this.f26541b.f28013t1;
                            if (lyVar != null) {
                                lyVar.w();
                                return;
                            }
                            return;
                        default:
                            kz kzVar = this.f26541b;
                            int currentItem = kzVar.h.getCurrentItem();
                            if (currentItem == 0) {
                                xyVar = kzVar.V;
                            } else if (currentItem == 1) {
                                xyVar = kzVar.f27995o0;
                            } else {
                                xyVar = kzVar.G0;
                            }
                            if (xyVar != null) {
                                hq hqVar = xyVar.d;
                                hqVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                hqVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                hqVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                return;
                            }
                            return;
                    }
                }
            });
        } else {
            addView(frameLayout3, w7.x5.d(56, 48.0f, (LocaleController.isRTL ? 3 : 5) | 80, 0.0f, 0.0f, 2.0f, 0.0f));
            org.telegram.ui.Cells.z h02 = org.telegram.ui.ActionBar.j6.h0(AndroidUtilities.dp(56.0f), A(i16), A(i16));
            w7.z5.a(axVar);
            axVar.setPadding(0, 0, AndroidUtilities.dp(2.0f), 0);
            axVar.setBackground(h02);
            axVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
            axVar.setFocusable(true);
            frameLayout3.addView(axVar, w7.x5.d(48, 48.0f, 51, 2.0f, 0.0f, 2.0f, 0.0f));
            view2.setVisibility(8);
        }
        addView(zwVar, 0, w7.x5.e(-1, -1, 51));
        bi.c4 c4Var = new bi.c4(context2, 22);
        this.N0 = c4Var;
        c4Var.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(6.0f), A(org.telegram.ui.ActionBar.j6.f20933qf)));
        c4Var.setTextColor(A(org.telegram.ui.ActionBar.j6.f20915pf));
        c4Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f));
        c4Var.setGravity(16);
        c4Var.setTextSize(1, 14.0f);
        c4Var.setVisibility(4);
        addView(c4Var, w7.x5.d(-2, -2.0f, 81, 5.0f, 0.0f, 5.0f, 53.0f));
        this.C1 = AndroidUtilities.dp(AndroidUtilities.isTablet() ? 40.0f : 32.0f);
        Field field2 = vu.f32008f;
        vu vuVar = new vu(new uu(context2, f6Var2));
        if (vu.f32008f == null) {
            try {
                field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
                try {
                    field.setAccessible(true);
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                field = null;
            }
            vu.f32008f = field;
        }
        Field field3 = vu.f32008f;
        if (field3 != null) {
            try {
                vuVar.f32010a = (ViewTreeObserver.OnScrollChangedListener) field3.get(vuVar);
                vu.f32008f.set(vuVar, vu.f32009g);
            } catch (Exception unused3) {
                vuVar.f32010a = null;
            }
        }
        this.B1 = vuVar;
        vuVar.f32012c.setOnSelectionUpdateListener(new d(this, 10));
        this.A1 = MessagesController.getGlobalEmojiSettings().getInt("selected_page", 0);
        Emoji.loadRecentEmoji();
        txVar.F(false);
        K(true, z11, z12, false);
        if (Build.VERSION.SDK_INT >= 31) {
            gh.d dVar3 = new gh.d(null);
            this.f27988l2 = dVar3;
            bh.b bVar3 = new bh.b(dVar3);
            this.f27994n2 = bVar3;
            bVar3.f2681f = LiteMode.isEnabled(262144);
            this.f27983j2 = new bh.f(false);
        } else {
            this.f27988l2 = null;
            this.f27994n2 = new bh.b(this.f27990m2);
            this.f27983j2 = null;
        }
        ih.k kVar = new ih.k(this);
        ed0 ed0Var2 = this.f28021w;
        if (ed0Var2 != null) {
            kVar.d(ed0Var2, this, new fw(this, 4), false);
        }
        bh.b bVar4 = this.f27994n2;
        bVar4.d = kVar;
        bVar4.f2680e = this;
        ch.a[] aVarArr = new ch.a[3];
        kx kxVar3 = kxVar;
        kxVar3.C0(new cw(this, 1));
        aVarArr[0] = new bh.l(kxVar3, this, new dw(kxVar3, 0));
        nw nwVar2 = this.f27975h0;
        if (nwVar2 != null) {
            nwVar2.C0(new cw(this, 3));
            nw nwVar3 = this.f27975h0;
            Objects.requireNonNull(nwVar3);
            aVarArr[1] = new bh.l(nwVar3, this, new dw(nwVar3, 1));
        }
        tw twVar2 = this.D0;
        if (twVar2 != null) {
            twVar2.C0(new cw(this, 4));
            aVarArr[2] = new bh.l(this.D0, this, new dw(this, 2));
        }
        this.f27986k2 = new lh(aVarArr, 1);
        setBlurredBackgroundDrawableFactory(this.f27994n2);
    }

    public static void c(kz kzVar, boolean z10) {
        nw nwVar = kzVar.f27975h0;
        if (nwVar != null) {
            int childCount = nwVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = nwVar.getChildAt(i10);
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

    public static void d(kz kzVar, ty tyVar, String str) {
        String str2;
        String str3;
        boolean z10;
        String str4;
        ly lyVar;
        yc ycVar;
        org.telegram.ui.ActionBar.n2 n2Var = kzVar.Y1;
        int i10 = kzVar.f27959c1;
        ArrayList arrayList = kzVar.f28002q1;
        if (tyVar != null) {
            if (tyVar.getSpan() != null) {
                if (kzVar.f28013t1 != null) {
                    long j3 = tyVar.getSpan().documentId;
                    TLRPC.Document document = tyVar.getSpan().document;
                    xx xxVar = tyVar.f30766e;
                    if (xxVar != null && xxVar.f32796i) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (document == null) {
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            xx xxVar2 = (xx) arrayList.get(i11);
                            int i12 = 0;
                            while (true) {
                                ArrayList arrayList2 = xxVar2.f32792c;
                                if (arrayList2 != null && i12 < arrayList2.size()) {
                                    if (((TLRPC.Document) xxVar2.f32792c.get(i12)).f19902id == j3) {
                                        document = (TLRPC.Document) xxVar2.f32792c.get(i12);
                                        break;
                                    }
                                    i12++;
                                }
                            }
                        }
                    }
                    if (document == null) {
                        document = q5.f(i10, j3);
                    }
                    if (document != null) {
                        str4 = MessageObject.findAnimatedEmojiEmoticon(document);
                    } else {
                        str4 = null;
                    }
                    String str5 = str4;
                    if (!MessageObject.isFreeEmoji(document) && !UserConfig.getInstance(i10).isPremium() && (((lyVar = kzVar.f28013t1) == null || !lyVar.g()) && !kzVar.U0 && !z10)) {
                        kzVar.O(false);
                        if (n2Var != null) {
                            ycVar = yc.a0(n2Var);
                        } else {
                            ycVar = new yc(kzVar.f28004r, kzVar.Z1);
                        }
                        if (!kzVar.f27977h2 && n2Var != null) {
                            ycVar.J(R.raw.saved_messages, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint2)), LocaleController.getString(R.string.Open), new cw(kzVar, 8)).j();
                        } else {
                            ycVar.q(document, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint)), LocaleController.getString(R.string.PremiumMore), new cw(kzVar, 7)).j();
                        }
                        kzVar.f27977h2 = !kzVar.f27977h2;
                        return;
                    }
                    kzVar.F2 = SystemClock.elapsedRealtime();
                    kzVar.O(true);
                    kzVar.h("animated_" + j3);
                    kzVar.f28013t1.x(j3, document, str5, tyVar.f30765c);
                    return;
                }
                return;
            }
            kzVar.F2 = SystemClock.elapsedRealtime();
            kzVar.O(true);
            if (str != null) {
                str2 = str;
            } else {
                str2 = (String) tyVar.getTag();
            }
            new SpannableStringBuilder().append((CharSequence) str2);
            if (str == null) {
                if (!tyVar.f30765c && (str3 = Emoji.emojiColor.get(str2)) != null) {
                    str2 = g(str2, str3);
                }
                kzVar.h(str2);
                ly lyVar2 = kzVar.f28013t1;
                if (lyVar2 != null) {
                    lyVar2.l(Emoji.fixEmoji(str2));
                    return;
                }
                return;
            }
            ly lyVar3 = kzVar.f28013t1;
            if (lyVar3 != null) {
                lyVar3.l(Emoji.fixEmoji(str));
            }
        }
    }

    public static void e(kz kzVar, int i10, int i11) {
        s4.c1 K;
        int[] iArr = kzVar.Q0;
        if (i10 == 1) {
            kzVar.n(kzVar.P, i11);
            return;
        }
        ly lyVar = kzVar.f28013t1;
        if ((lyVar == null || !lyVar.z()) && !kzVar.J0) {
            ll0 x10 = kzVar.x(i10);
            if (i11 > 0 && x10 != null && x10.getVisibility() == 0 && (K = x10.K(0)) != null && K.f45766a.getTop() + kzVar.f27955b1 >= x10.getPaddingTop()) {
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
                kzVar.a0();
            } else {
                kzVar.y(i10).setTranslationY(Math.max(-AndroidUtilities.dp(48.0f), iArr[i10]));
            }
        }
    }

    public static void f(kz kzVar, boolean z10) {
        int N0;
        qy qyVar = kzVar.f27978i0;
        qw qwVar = kzVar.f27995o0;
        nw nwVar = kzVar.f27975h0;
        if (nwVar != null && (nwVar.getAdapter() instanceof py)) {
            py pyVar = (py) nwVar.getAdapter();
            if (!pyVar.f29543s && pyVar.h == 0 && !pyVar.f29545x.isEmpty() && (N0 = qyVar.N0()) != -1 && N0 > qyVar.B() - 5) {
                String str = pyVar.f29544w;
                String str2 = pyVar.f29542r;
                boolean z11 = pyVar.v;
                pyVar.F(str, str2, true, z11, z11);
            }
        }
        ly lyVar = kzVar.f28013t1;
        if (lyVar != null && lyVar.z()) {
            boolean z12 = false;
            s4.c1 K = nwVar.K(0);
            if (K == null) {
                xy.a(qwVar, true, !z10);
                return;
            }
            if (K.f45766a.getTop() < nwVar.getPaddingTop()) {
                z12 = true;
            }
            xy.a(qwVar, z12, !z10);
        } else if (qwVar != null && nwVar != null) {
            qwVar.f32799a.a(true, !z10);
        }
    }

    public static String g(String str, String str2) {
        boolean z10;
        String str3;
        if (CompoundEmoji.isHandshake(str) != null) {
            return CompoundEmoji.applyColor(str, str2);
        }
        if (Emoji.endsWithRightArrow(str)) {
            str = com.google.android.gms.internal.vision.e2.i(2, 0, str);
            z10 = true;
        } else {
            z10 = false;
        }
        int length = str.length();
        if (length > 2 && str.charAt(str.length() - 2) == 8205) {
            str3 = str.substring(str.length() - 2);
            str = com.google.android.gms.internal.vision.e2.i(2, 0, str);
        } else if (length > 3 && str.charAt(str.length() - 3) == 8205) {
            str3 = str.substring(str.length() - 3);
            str = com.google.android.gms.internal.vision.e2.i(3, 0, str);
        } else {
            str3 = null;
        }
        String t10 = org.telegram.ui.Cells.p6.t(str, str2);
        if (str3 != null) {
            t10 = org.telegram.ui.Cells.p6.t(t10, str3);
        }
        if (z10) {
            return org.telegram.ui.Cells.p6.t(t10, "\u200d➡");
        }
        return t10;
    }

    public static void j(int i10, View view) {
        if (view == null) {
            return;
        }
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i10);
    }

    public final int A(int i10) {
        org.telegram.ui.ActionBar.f6 f6Var = this.Z1;
        if (f6Var != null) {
            return f6Var.G0(i10);
        }
        return org.telegram.ui.ActionBar.j6.w0(null, i10, false);
    }

    public final void B() {
        ww wwVar = this.G0;
        if (wwVar != null) {
            wwVar.b();
        }
        qw qwVar = this.f27995o0;
        if (qwVar != null) {
            qwVar.b();
        }
        kw kwVar = this.V;
        if (kwVar != null) {
            kwVar.b();
        }
    }

    public final void C() {
        bh.f fVar;
        float f7;
        if (Build.VERSION.SDK_INT >= 31 && (fVar = this.f27983j2) != null) {
            ed0 ed0Var = this.f28021w;
            RectF rectF = this.f28035z2;
            ih.k.c(ed0Var, this, rectF);
            float f10 = 0.0f;
            if (LiteMode.isEnabled(262144)) {
                f7 = 0.0f;
            } else {
                f7 = -AndroidUtilities.dp(48.0f);
            }
            if (!LiteMode.isEnabled(262144)) {
                f10 = -AndroidUtilities.dp(48.0f);
            }
            rectF.inset(f7, f10);
            rectF.right = getMeasuredWidth();
            rectF.bottom = Math.min(rectF.bottom, getMeasuredHeight());
            fVar.g(1, this.A2);
            fVar.e(this.f27986k2, getWidth(), getHeight());
        }
    }

    public final void D() {
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        int i10 = this.f27959c1;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.groupPackUpdated);
        if (this.f28030y0 != null) {
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.recentDocumentsDidLoad);
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.featuredStickersDidLoad);
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.groupStickersDidLoad);
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        }
    }

    @Override
    public final void E(int i10, float f7, float f10, le.e eVar) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = 4;
        if (i10 == 0) {
            q(false);
            float f11 = 1.0f - this.f27950a.f15395e;
            ww wwVar = this.G0;
            wwVar.setAlpha(f11);
            if (f11 > 0.0f) {
                i13 = 0;
            } else {
                i13 = 4;
            }
            wwVar.setVisibility(i13);
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
            ah.w wVar = this.M;
            wVar.setAlpha(f12);
            wVar.setTranslationY(AndroidUtilities.dp(30.0f) * f11);
            if (i16 > 0) {
                i15 = 0;
            }
            wVar.setVisibility(i15);
            T();
            this.f28026x0.invalidate();
        } else if (i10 == 1) {
            l(false);
            float f13 = 1.0f - this.f27953b.f15395e;
            kw kwVar = this.V;
            kwVar.setAlpha(f13);
            if (f13 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            kwVar.setVisibility(i11);
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
            ah.w wVar2 = this.K;
            wVar2.setAlpha(f14);
            wVar2.setTranslationY(AndroidUtilities.dp(30.0f) * f13);
            if (i17 > 0) {
                i15 = 0;
            }
            wVar2.setVisibility(i15);
            T();
            this.J.invalidate();
        }
    }

    public final void F(boolean z10, boolean z11) {
        wy wyVar;
        boolean z12;
        if (this.A1 != 0 && this.f28023w1) {
            this.A1 = 0;
        }
        if (this.A1 == 0 && this.f28019v1) {
            this.A1 = 1;
        }
        int i10 = this.A1;
        zw zwVar = this.h;
        if (i10 != 0 && !z10 && this.f27964e.size() != 1) {
            int i11 = this.A1;
            if (i11 == 1) {
                N(false, false);
                if (!this.f28015u0 && !this.f28018v0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                S(z12, false);
                if (zwVar.getCurrentItem() != 2) {
                    zwVar.x(2, false);
                }
                xw xwVar = this.B0;
                if (xwVar != null) {
                    this.S0 = true;
                    int i12 = this.G1;
                    if (i12 >= 0) {
                        xwVar.m(i12);
                    } else {
                        int i13 = this.F1;
                        if (i13 >= 0) {
                            xwVar.m(i13);
                        } else {
                            xwVar.m(this.E1);
                        }
                    }
                    this.S0 = false;
                    this.E0.h1(0, 0);
                }
            } else if (i11 == 2) {
                N(false, false);
                S(false, false);
                if (zwVar.getCurrentItem() != 1) {
                    zwVar.x(1, false);
                }
                rx rxVar = this.f27998p0;
                if (rxVar != null) {
                    rxVar.m(0);
                }
                qw qwVar = this.f27995o0;
                if (qwVar != null && (wyVar = qwVar.f32805r) != null) {
                    wyVar.E1(null);
                }
            }
        } else {
            N(true, false);
            S(false, false);
            if (zwVar.getCurrentItem() != 0) {
                zwVar.x(0, !z10);
            }
            if (z11) {
                AndroidUtilities.runOnUIThread(new cw(this, 9), 350L);
            }
        }
        O(true);
    }

    public final void G() {
        bz bzVar = this.f28030y0;
        if (bzVar != null) {
            bzVar.l();
        }
        fz fzVar = this.f28033z0;
        if (fzVar != null) {
            fzVar.l();
        }
        if (org.telegram.ui.st.q().E) {
            org.telegram.ui.st.q().n();
        }
        org.telegram.ui.st.q().u();
    }

    public final void H(int i10) {
        ly lyVar = this.f28013t1;
        if ((lyVar != null && lyVar.z()) || i10 == 0) {
            return;
        }
        HorizontalScrollView y3 = y(i10);
        this.Q0[i10] = 0;
        y3.setTranslationY(0);
    }

    public final void I(int i10, int i11) {
        lx lxVar = this.Q;
        View m10 = lxVar.m(i10);
        int L0 = lxVar.L0();
        int i12 = 1;
        if ((m10 == null && Math.abs(i10 - L0) > lxVar.J * 9.0f) || !SharedConfig.animationsEnabled()) {
            if (lxVar.L0() < i10) {
                i12 = 0;
            }
            ok0 ok0Var = this.f27954b0;
            ok0Var.f29125b = i12;
            ok0Var.c(i10, i11, false, false);
            return;
        }
        this.J0 = true;
        di.m1 m1Var = new di.m1(this, this.P.getContext(), 1);
        m1Var.f45934a = i10;
        m1Var.f15068p = i11;
        lxVar.w0(m1Var);
    }

    public final void J(int i10, int i11) {
        uw uwVar = this.E0;
        View m10 = uwVar.m(i10);
        int L0 = uwVar.L0();
        int i12 = 1;
        if (m10 == null && Math.abs(i10 - L0) > 40) {
            if (uwVar.L0() < i10) {
                i12 = 0;
            }
            ok0 ok0Var = this.f27951a0;
            ok0Var.f29125b = i12;
            ok0Var.c(i10, i11, false, false);
            return;
        }
        this.J0 = true;
        this.D0.x0(i10);
    }

    public final void K(boolean z10, boolean z11, boolean z12, boolean z13) {
        ArrayList arrayList = this.f27964e;
        arrayList.clear();
        boolean z14 = false;
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.d;
            if (i10 >= arrayList2.size()) {
                break;
            }
            if (((gz) arrayList2.get(i10)).f26562a == 0 && z10) {
                arrayList.add((gz) arrayList2.get(i10));
            }
            if (((gz) arrayList2.get(i10)).f26562a == 1 && z12) {
                arrayList.add((gz) arrayList2.get(i10));
            }
            if (((gz) arrayList2.get(i10)).f26562a == 2 && z11) {
                arrayList.add((gz) arrayList2.get(i10));
            }
            i10++;
        }
        ed0 ed0Var = this.f28021w;
        if (ed0Var != null) {
            if (arrayList.size() > 1) {
                z14 = true;
            }
            AndroidUtilities.updateViewVisibilityAnimated(ed0Var, z14, 1.0f, z13);
        }
        zw zwVar = this.h;
        if (zwVar != null) {
            zwVar.setAdapter(null);
            zwVar.setAdapter(this.L0);
            if (ed0Var != null) {
                ed0Var.setViewPager(zwVar);
            }
        }
    }

    public final void L(final oh.b bVar, final TLObject tLObject, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final boolean z10, boolean z11) {
        String formatPluralString;
        fz fzVar;
        ky kyVar;
        if (stickerSet != null) {
            if (!z10 || (kyVar = this.S) == null || kyVar.d == stickerSet.f19923id) {
                if (!z10 && (fzVar = this.f28033z0) != null && fzVar.d != stickerSet.f19923id) {
                    return;
                }
                final boolean isStickerPackInstalled = MediaDataController.getInstance(this.f27959c1).isStickerPackInstalled(stickerSet.f19923id);
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
                bVar.f17054h0.a(!isStickerPackInstalled, z11);
                bVar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        int i10;
                        kz kzVar = kz.this;
                        MediaDataController mediaDataController = MediaDataController.getInstance(kzVar.f27959c1);
                        Context context = kzVar.getContext();
                        if (isStickerPackInstalled) {
                            i10 = 0;
                        } else {
                            i10 = 2;
                        }
                        org.telegram.ui.ActionBar.n2 n2Var = kzVar.Y1;
                        FrameLayout frameLayout = kzVar.f28008s;
                        oh.b bVar2 = bVar;
                        TLObject tLObject2 = tLObject;
                        TLRPC.StickerSet stickerSet2 = stickerSet;
                        TLRPC.Document document2 = document;
                        boolean z12 = z10;
                        mediaDataController.toggleStickerSet(context, tLObject2, document2, i10, n2Var, frameLayout, false, true, new i2.b1(kzVar, bVar2, tLObject2, stickerSet2, document2, z12, 9), false);
                        kzVar.L(bVar2, tLObject2, stickerSet2, document2, z12, true);
                    }
                });
            }
        }
    }

    public final void M(long j3, boolean z10, boolean z11) {
        int i10;
        View childAt;
        float f7;
        ed0 ed0Var = this.f28021w;
        if (ed0Var != null) {
            this.f28019v1 = z10;
            this.f28023w1 = z11;
            if (!z11 && !z10) {
                this.f28016u1 = 0L;
            } else {
                this.f28016u1 = j3;
            }
            if (z11) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            LinearLayout linearLayout = ed0Var.d;
            if (i10 >= linearLayout.getChildCount()) {
                childAt = null;
            } else {
                childAt = linearLayout.getChildAt(i10);
            }
            if (childAt != null) {
                if (this.f28016u1 != 0) {
                    f7 = 0.15f;
                } else {
                    f7 = 1.0f;
                }
                childAt.setAlpha(f7);
                zw zwVar = this.h;
                if (z11) {
                    if (this.f28016u1 != 0 && zwVar.getCurrentItem() != 0) {
                        N(true, true);
                        S(false, true);
                        zwVar.x(0, false);
                    }
                } else if (this.f28016u1 != 0 && zwVar.getCurrentItem() != 1) {
                    N(false, true);
                    S(false, true);
                    zwVar.x(1, false);
                }
            }
        }
    }

    public final void N(boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        float f12;
        ax axVar = this.f28025x;
        if (!z10 || axVar.getTag() != null) {
            if ((!z10 && axVar.getTag() != null) || this.f27997o2) {
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
            axVar.setTag(num);
            int i10 = 0;
            float f13 = 0.0f;
            if (z11) {
                if (z10) {
                    axVar.setVisibility(0);
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.F = animatorSet2;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(axVar, View.ALPHA, f11);
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(axVar, View.SCALE_X, f12);
                if (z10) {
                    f13 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(axVar, View.SCALE_Y, f13));
                this.F.setDuration(200L);
                this.F.setInterpolator(pr.f29494g);
                this.F.addListener(new gx(this, z10, 0));
                this.F.start();
                return;
            }
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            axVar.setAlpha(f7);
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            axVar.setScaleX(f10);
            if (z10) {
                f13 = 1.0f;
            }
            axVar.setScaleY(f13);
            if (!z10) {
                i10 = 4;
            }
            axVar.setVisibility(i10);
        }
    }

    public final void O(boolean z10) {
        Integer num;
        this.H = 0.0f;
        ly lyVar = this.f28013t1;
        if (lyVar != null && lyVar.z()) {
            z10 = false;
        }
        FrameLayout frameLayout = this.f27991n;
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

    public final void P(boolean z10, boolean z11) {
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
                this.W.setInterpolator(pr.f29494g);
                this.W.addListener(new j6(this, 22));
                this.W.start();
                return;
            }
            if (z10) {
                f7 = 1.0f;
            }
            view.setAlpha(f7);
        }
    }

    public final void Q(boolean z10) {
        for (int i10 = 0; i10 < 3; i10++) {
            s4.s w10 = w(i10);
            int L0 = w10.L0();
            if (z10) {
                if (L0 == 1 || L0 == 2) {
                    w10.n0(0);
                    H(i10);
                }
            } else if (L0 == 0) {
                w10.h1(0, 0);
            }
        }
    }

    public final void R(boolean z10, boolean z11, boolean z12) {
        float f7;
        float translationY;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.Chat chat = MessagesController.getInstance(this.f27959c1).getChat(Long.valueOf(this.f28016u1));
        if (chat != null) {
            bi.c4 c4Var = this.N0;
            if (z10) {
                if (!ChatObject.hasAdminRights(chat) && (tL_chatBannedRights = chat.default_banned_rights) != null && (tL_chatBannedRights.send_stickers || (z11 && tL_chatBannedRights.send_plain))) {
                    org.telegram.ui.ActionBar.n2 n2Var = this.Y1;
                    if (!(n2Var instanceof org.telegram.ui.co) || !((org.telegram.ui.co) n2Var).K6()) {
                        if (z11) {
                            c4Var.setText(LocaleController.getString(R.string.GlobalAttachEmojiRestricted));
                        } else if (z12) {
                            c4Var.setText(LocaleController.getString(R.string.GlobalAttachGifRestricted));
                        } else {
                            c4Var.setText(LocaleController.getString(R.string.GlobalAttachStickersRestricted));
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
                            c4Var.setText(LocaleController.getString(R.string.AttachPlainRestrictedForever));
                        } else if (z12) {
                            c4Var.setText(LocaleController.getString(R.string.AttachGifRestrictedForever));
                        } else {
                            c4Var.setText(LocaleController.getString(R.string.AttachStickersRestrictedForever));
                        }
                    } else {
                        if (z11) {
                            c4Var.setText(LocaleController.formatString("AttachPlainRestricted", R.string.AttachPlainRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                        }
                        if (z12) {
                            c4Var.setText(LocaleController.formatString("AttachGifRestricted", R.string.AttachGifRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                        } else {
                            c4Var.setText(LocaleController.formatString("AttachStickersRestricted", R.string.AttachStickersRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                        }
                    }
                }
                c4Var.setVisibility(0);
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
                f7 = c4Var.getAlpha();
            } else {
                f7 = 1.0f;
            }
            float f11 = 0.0f;
            if (!z10) {
                f10 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c4Var, View.ALPHA, f7, f10);
            if (z10) {
                translationY = AndroidUtilities.dp(12.0f);
            } else {
                translationY = c4Var.getTranslationY();
            }
            if (!z10) {
                f11 = AndroidUtilities.dp(12.0f);
            }
            animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(c4Var, View.TRANSLATION_Y, translationY, f11));
            org.telegram.messenger.video.k kVar = this.K2;
            if (kVar != null) {
                AndroidUtilities.cancelRunOnUIThread(kVar);
            }
            if (z10) {
                org.telegram.messenger.video.k kVar2 = new org.telegram.messenger.video.k(this, z11, z12, 3);
                this.K2 = kVar2;
                AndroidUtilities.runOnUIThread(kVar2, 3500L);
            }
            this.J2.setDuration(320L);
            this.J2.setInterpolator(pr.h);
            this.J2.start();
        }
    }

    public final void S(boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        float f12;
        ImageView imageView = this.f28029y;
        if (imageView != null && !this.f28000p2) {
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
                        this.G.setInterpolator(pr.f29494g);
                        this.G.addListener(new gx(this, z10, 1));
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

    public final void T() {
        int measuredHeight;
        int dp;
        float f7;
        org.telegram.ui.ActionBar.n2 n2Var;
        View view = (View) getParent();
        if (view != null) {
            float y3 = getY();
            if (getLayoutParams().height > 0) {
                measuredHeight = getLayoutParams().height;
            } else {
                measuredHeight = getMeasuredHeight();
            }
            float f10 = y3 + measuredHeight;
            if ((!AndroidUtilities.isInMultiwindow && ((n2Var = this.Y1) == null || !n2Var.isInBubbleMode())) || this.V0) {
                dp = view.getHeight();
            } else {
                dp = AndroidUtilities.dp(1.0f);
            }
            float f11 = f10 - dp;
            float f12 = this.f28007r2;
            FrameLayout frameLayout = this.f27991n;
            if (f12 >= 0.0f) {
                f11 += getMeasuredHeight() - this.f28007r2;
            } else if (frameLayout.getTop() - f11 < 0.0f || !this.f28028x2) {
                f11 = 0.0f;
            }
            float f13 = -f11;
            boolean z10 = this.f27961d0;
            if (z10) {
                f7 = 45.0f;
            } else {
                f7 = 50.0f;
            }
            float lerp = f13 + AndroidUtilities.lerp(AndroidUtilities.dp(f7), -this.f28003q2, this.G2.f15395e);
            frameLayout.setTranslationY(lerp);
            if (z10) {
                this.f28004r.setTranslationY(lerp);
            }
        }
    }

    public final void U() {
        xy xyVar;
        boolean z10;
        int A;
        int A2;
        int A3;
        int A4;
        int A5;
        int A6;
        int A7;
        int A8;
        xv xvVar;
        int A9;
        int A10;
        int A11;
        int A12;
        int A13;
        int A14;
        int A15;
        int A16;
        int A17;
        boolean z11 = this.f28015u0;
        View view = this.v;
        if (!z11) {
            setBackground(null);
            view.setBackground(null);
        } else if (!AndroidUtilities.isInMultiwindow && !this.N1) {
            int i10 = org.telegram.ui.ActionBar.j6.He;
            setBackgroundColor(A(i10));
            if (this.f27961d0) {
                view.setBackgroundColor(A(i10));
            }
        } else {
            Drawable background = getBackground();
            if (background != null) {
                background.setColorFilter(new PorterDuffColorFilter(A(org.telegram.ui.ActionBar.j6.He), PorterDuff.Mode.MULTIPLY));
            }
        }
        jw jwVar = this.I;
        if (jwVar != null) {
            if (this.f28015u0) {
                jwVar.setBackgroundColor(A(org.telegram.ui.ActionBar.j6.He));
                this.O.setBackgroundColor(A(org.telegram.ui.ActionBar.j6.Ke));
            } else {
                jwVar.setBackground(null);
            }
        }
        vu vuVar = this.B1;
        if (vuVar != null) {
            vuVar.f32012c.a();
        }
        int i11 = 0;
        while (true) {
            xyVar = this.V;
            z10 = this.f27980i2;
            if (i11 >= 3) {
                break;
            }
            if (i11 == 0) {
                xyVar = this.G0;
            } else if (i11 != 1) {
                xyVar = this.f27995o0;
            }
            if (xyVar != null) {
                hq hqVar = xyVar.d;
                FrameLayout frameLayout = xyVar.f32804n;
                View view2 = xyVar.f32803f;
                if (this.f28015u0) {
                    view2.setBackgroundColor(A(org.telegram.ui.ActionBar.j6.He));
                } else {
                    view2.setBackground(null);
                }
                xyVar.f32802e.setBackgroundColor(A(org.telegram.ui.ActionBar.j6.Ke));
                xm0 xm0Var = xyVar.f32801c;
                if (z10) {
                    A14 = v(0.4f);
                } else {
                    A14 = A(org.telegram.ui.ActionBar.j6.Je);
                }
                xm0Var.a(A14);
                Drawable background2 = frameLayout.getBackground();
                if (z10) {
                    A15 = v(0.06f);
                } else {
                    A15 = A(org.telegram.ui.ActionBar.j6.Ie);
                }
                org.telegram.ui.ActionBar.j6.w1(A15, background2);
                frameLayout.invalidate();
                if (z10) {
                    A16 = v(0.45f);
                } else {
                    A16 = A(org.telegram.ui.ActionBar.j6.Je);
                }
                hqVar.setHintTextColor(A16);
                if (z10) {
                    A17 = v(0.8f);
                } else {
                    A17 = A(org.telegram.ui.ActionBar.j6.G6);
                }
                hqVar.setTextColor(A17);
            }
            i11++;
        }
        Paint paint = this.f28010s1;
        if (paint != null) {
            paint.setColor(A(org.telegram.ui.ActionBar.j6.f20642af));
        }
        kx kxVar = this.P;
        if (kxVar != null) {
            kxVar.setGlowColor(A(org.telegram.ui.ActionBar.j6.He));
        }
        tw twVar = this.D0;
        if (twVar != null) {
            twVar.setGlowColor(A(org.telegram.ui.ActionBar.j6.He));
        }
        xw xwVar = this.B0;
        if (xwVar != null) {
            xwVar.setIndicatorColor(A(org.telegram.ui.ActionBar.j6.Qe));
            xwVar.setUnderlineColor(A(org.telegram.ui.ActionBar.j6.Ke));
            if (this.f28015u0) {
                xwVar.setBackgroundColor(A(org.telegram.ui.ActionBar.j6.He));
            } else {
                xwVar.setBackground(null);
            }
        }
        rx rxVar = this.f27998p0;
        if (rxVar != null) {
            rxVar.setIndicatorColor(A(org.telegram.ui.ActionBar.j6.Qe));
            rxVar.setUnderlineColor(A(org.telegram.ui.ActionBar.j6.Ke));
            if (this.f28015u0) {
                rxVar.setBackgroundColor(A(org.telegram.ui.ActionBar.j6.He));
            } else {
                rxVar.setBackground(null);
            }
        }
        ax axVar = this.f28025x;
        if (axVar != null) {
            if (z10) {
                A13 = v(0.6f);
            } else {
                A13 = A(org.telegram.ui.ActionBar.j6.Re);
            }
            axVar.setColorFilter(new PorterDuffColorFilter(A13, PorterDuff.Mode.MULTIPLY));
            if (xyVar == null) {
                Drawable background3 = axVar.getBackground();
                int i12 = org.telegram.ui.ActionBar.j6.He;
                org.telegram.ui.ActionBar.j6.B1(background3, A(i12), false);
                org.telegram.ui.ActionBar.j6.B1(axVar.getBackground(), A(i12), true);
            }
        }
        ImageView imageView = this.f28029y;
        if (imageView != null) {
            if (z10) {
                A12 = v(0.6f);
            } else {
                A12 = A(org.telegram.ui.ActionBar.j6.Re);
            }
            imageView.setColorFilter(new PorterDuffColorFilter(A12, PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.E;
        if (imageView2 != null) {
            if (z10) {
                A11 = v(0.6f);
            } else {
                A11 = A(org.telegram.ui.ActionBar.j6.Re);
            }
            imageView2.setColorFilter(new PorterDuffColorFilter(A11, PorterDuff.Mode.MULTIPLY));
        }
        bi.c4 c4Var = this.N0;
        if (c4Var != null) {
            ((ShapeDrawable) c4Var.getBackground()).getPaint().setColor(A(org.telegram.ui.ActionBar.j6.f20933qf));
            c4Var.setTextColor(A(org.telegram.ui.ActionBar.j6.f20915pf));
        }
        py pyVar = this.f27981j0;
        if (pyVar != null) {
            ry ryVar = pyVar.f29539e;
            ImageView imageView3 = ryVar.f30141a;
            int i13 = org.telegram.ui.ActionBar.j6.Le;
            imageView3.setColorFilter(new PorterDuffColorFilter(A(i13), PorterDuff.Mode.MULTIPLY));
            ryVar.f30142b.setTextColor(A(i13));
            ryVar.f30143c.setProgressColor(A(org.telegram.ui.ActionBar.j6.f20762h6));
        }
        this.f27967e2 = new PorterDuffColorFilter(A(org.telegram.ui.ActionBar.j6.Oh), PorterDuff.Mode.SRC_IN);
        int i14 = 0;
        while (true) {
            Drawable[] drawableArr = this.X0;
            if (i14 >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i14];
            if (z10) {
                A9 = v(0.4f);
            } else {
                A9 = A(org.telegram.ui.ActionBar.j6.Ne);
            }
            org.telegram.ui.ActionBar.j6.y1(drawable, A9, false);
            Drawable drawable2 = drawableArr[i14];
            if (z10) {
                A10 = v(0.8f);
            } else {
                A10 = A(org.telegram.ui.ActionBar.j6.Oe);
            }
            org.telegram.ui.ActionBar.j6.y1(drawable2, A10, true);
            i14++;
        }
        if (jwVar != null && (xvVar = jwVar.f24842y) != null) {
            xvVar.d();
        }
        int i15 = 0;
        while (true) {
            Drawable[] drawableArr2 = this.Y0;
            if (i15 >= drawableArr2.length) {
                break;
            }
            Drawable drawable3 = drawableArr2[i15];
            if (z10) {
                A7 = v(0.4f);
            } else {
                A7 = A(org.telegram.ui.ActionBar.j6.Me);
            }
            org.telegram.ui.ActionBar.j6.y1(drawable3, A7, false);
            Drawable drawable4 = drawableArr2[i15];
            if (z10) {
                A8 = v(0.8f);
            } else {
                A8 = A(org.telegram.ui.ActionBar.j6.Oe);
            }
            org.telegram.ui.ActionBar.j6.y1(drawable4, A8, true);
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
                A5 = v(0.4f);
            } else {
                A5 = A(org.telegram.ui.ActionBar.j6.Me);
            }
            org.telegram.ui.ActionBar.j6.y1(drawable5, A5, false);
            Drawable drawable6 = drawableArr3[i16];
            if (z10) {
                A6 = v(0.8f);
            } else {
                A6 = A(org.telegram.ui.ActionBar.j6.Oe);
            }
            org.telegram.ui.ActionBar.j6.y1(drawable6, A6, true);
            i16++;
        }
        org.telegram.ui.ActionBar.u5 u5Var = this.a2;
        if (u5Var != null) {
            if (z10) {
                A3 = v(0.4f);
            } else {
                A3 = A(org.telegram.ui.ActionBar.j6.Ne);
            }
            org.telegram.ui.ActionBar.j6.y1(u5Var, A3, false);
            if (z10) {
                A4 = v(0.8f);
            } else {
                A4 = A(org.telegram.ui.ActionBar.j6.Oe);
            }
            org.telegram.ui.ActionBar.j6.y1(u5Var, A4, true);
        }
        org.telegram.ui.ActionBar.u5 u5Var2 = this.f27956b2;
        if (u5Var2 != null) {
            if (z10) {
                A = v(0.4f);
            } else {
                A = A(org.telegram.ui.ActionBar.j6.Qe);
            }
            org.telegram.ui.ActionBar.j6.y1(u5Var2, A, false);
            if (z10) {
                A2 = v(0.8f);
            } else {
                A2 = A(org.telegram.ui.ActionBar.j6.Qe);
            }
            org.telegram.ui.ActionBar.j6.y1(u5Var2, A2, true);
        }
    }

    public final void V() {
        kx kxVar = this.P;
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
        if (!this.f27969f0) {
            int i12 = -1;
            if (i10 != -1) {
                int size = getRecentEmoji().size() + (this.f27961d0 ? 1 : 0);
                tx txVar = this.R;
                int i13 = txVar.f30751c;
                ArrayList arrayList = txVar.f30758x;
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
                                xx xxVar = (xx) this.f28002q1.get(size2);
                                while (i14 < emojipacks.size()) {
                                    long j3 = emojipacks.get(i14).f32791b.f19923id;
                                    long j10 = xxVar.f32791b.f19923id;
                                    if (j3 == j10 && (!xxVar.f32795g || (!xxVar.f32794f && !this.f27999p1.contains(Long.valueOf(j10))))) {
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

    public final void X() {
        boolean z10;
        boolean z11;
        int i10;
        wy wyVar;
        int i11;
        boolean z12;
        boolean z13;
        rx rxVar = this.f27998p0;
        int currentPosition = rxVar.getCurrentPosition();
        int i12 = this.f28005r0;
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
        boolean isEmpty = this.f27979i1.isEmpty();
        rxVar.d(false);
        this.f28005r0 = -2;
        this.f28009s0 = -2;
        this.f28012t0 = -2;
        Drawable[] drawableArr = this.Z0;
        if (!isEmpty) {
            this.f28005r0 = 0;
            rxVar.b(0, drawableArr[0]).setContentDescription(LocaleController.getString(R.string.RecentStickers));
            i10 = 1;
        } else {
            i10 = 0;
        }
        this.f28009s0 = i10;
        rxVar.b(1, drawableArr[1]).setContentDescription(LocaleController.getString(R.string.FeaturedGifs));
        this.f28012t0 = i10 + 1;
        AndroidUtilities.dp(13.0f);
        AndroidUtilities.dp(11.0f);
        int i13 = this.f27959c1;
        ArrayList<String> arrayList = MessagesController.getInstance(i13).gifSearchEmojies;
        int size = arrayList.size();
        int i14 = 0;
        while (i14 < size) {
            String str = arrayList.get(i14);
            Emoji.EmojiDrawable emojiDrawable = Emoji.getEmojiDrawable(str);
            if (emojiDrawable != null) {
                TLRPC.Document emojiAnimatedSticker = MediaDataController.getInstance(i13).getEmojiAnimatedSticker(str);
                String i15 = i2.g.i(i14 + 3, "tab");
                int i16 = rxVar.f27218x;
                rxVar.f27218x = i16 + 1;
                cx0 cx0Var = (cx0) rxVar.f27208n.get(i15);
                if (cx0Var != null) {
                    rxVar.g(i15, cx0Var, i16);
                    i11 = currentPosition;
                    z12 = z11;
                } else {
                    i11 = currentPosition;
                    z12 = z11;
                    cx0Var = new cx0(rxVar.getContext(), 2);
                    cx0Var.setFocusable(true);
                    cx0Var.setOnClickListener(new bm0(rxVar, 2));
                    cx0Var.setExpanded(rxVar.f27201f0);
                    cx0Var.a(rxVar.f27204i0);
                    rxVar.f27198e.addView(cx0Var, i16);
                }
                cx0Var.d = false;
                cx0Var.setTag(R.id.index_tag, Integer.valueOf(i16));
                cx0Var.setTag(R.id.parent_tag, emojiDrawable);
                cx0Var.setTag(R.id.object_tag, emojiAnimatedSticker);
                if (i16 == rxVar.f27219y) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                cx0Var.setSelected(z13);
                rxVar.h.put(i15, cx0Var);
                cx0Var.setContentDescription(str);
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
        rxVar.h();
        rxVar.q();
        if (z10 && isEmpty) {
            rxVar.m(this.f28009s0);
            qw qwVar = this.f27995o0;
            if (qwVar != null && (wyVar = qwVar.f32805r) != null) {
                wyVar.E1(null);
                return;
            }
            return;
        }
        WeakHashMap weakHashMap = r0.i0.f44725a;
        if (rxVar.isLaidOut()) {
            if (!isEmpty && !z14) {
                rxVar.k(i17 + 1, 0);
            } else if (isEmpty && z14) {
                rxVar.k(i17 - 1, 0);
            }
        }
    }

    public final void Y() {
        py pyVar;
        int size = this.f27979i1.size();
        long calcDocumentsHash = MediaDataController.calcDocumentsHash(this.f27979i1, Integer.MAX_VALUE);
        ArrayList<TLRPC.Document> recentGifs = MediaDataController.getInstance(this.f27959c1).getRecentGifs();
        this.f27979i1 = recentGifs;
        long calcDocumentsHash2 = MediaDataController.calcDocumentsHash(recentGifs, Integer.MAX_VALUE);
        if ((this.f27998p0 != null && size == 0 && !this.f27979i1.isEmpty()) || (size != 0 && this.f27979i1.isEmpty())) {
            X();
        }
        if ((size != this.f27979i1.size() || calcDocumentsHash != calcDocumentsHash2) && (pyVar = this.f27992n0) != null) {
            pyVar.l();
        }
    }

    public final void Z(boolean z10) {
        boolean z11;
        TLRPC.Document document;
        boolean z12;
        boolean z13;
        boolean z14;
        ArrayList<TLRPC.Document> arrayList;
        boolean z15;
        ArrayList<TLRPC.Document> arrayList2;
        TLRPC.StickerSet stickerSet;
        int i10;
        xw xwVar = this.B0;
        if (xwVar != null) {
            cc1 cc1Var = xwVar.f27198e;
            if (xwVar.f27215s != null) {
                return;
            }
            this.F1 = -2;
            this.G1 = -2;
            this.H1 = -2;
            this.I1 = -2;
            this.f27965e0 = false;
            this.E1 = 0;
            int currentPosition = xwVar.getCurrentPosition();
            boolean z16 = true;
            if (getParent() != null && getVisibility() == 0 && (this.f28031y1.size() != 0 || this.f28034z1.size() != 0)) {
                z11 = true;
            } else {
                z11 = false;
            }
            xwVar.d(z11);
            int i11 = this.f27959c1;
            MediaDataController mediaDataController = MediaDataController.getInstance(i11);
            SharedPreferences emojiSettings = MessagesController.getEmojiSettings(i11);
            ArrayList arrayList3 = this.f27989m1;
            arrayList3.clear();
            ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = mediaDataController.getFeaturedStickerSets();
            int size = featuredStickerSets.size();
            for (int i12 = 0; i12 < size; i12++) {
                TLRPC.StickerSetCovered stickerSetCovered = featuredStickerSets.get(i12);
                if (!mediaDataController.isStickerPackInstalled(stickerSetCovered.set.f19923id)) {
                    arrayList3.add(stickerSetCovered);
                }
            }
            iz izVar = this.F0;
            if (izVar != null) {
                izVar.l();
            }
            boolean isEmpty = featuredStickerSets.isEmpty();
            long j3 = 0;
            Drawable[] drawableArr = this.Y0;
            if (!isEmpty && (arrayList3.isEmpty() || emojiSettings.getLong("featured_hidden", 0L) == featuredStickerSets.get(0).set.f19923id)) {
                if (mediaDataController.getUnreadStickerSets().isEmpty()) {
                    i10 = 2;
                } else {
                    i10 = 3;
                }
                cx0 c10 = xwVar.c(i10, drawableArr[i10]);
                c10.h.setText(LocaleController.getString(R.string.FeaturedStickersShort));
                c10.setContentDescription(LocaleController.getString(R.string.FeaturedStickers));
                int i13 = this.E1;
                this.H1 = i13;
                this.E1 = i13 + 1;
            }
            if (!this.f27985k1.isEmpty()) {
                int i14 = this.E1;
                this.G1 = i14;
                this.E1 = i14 + 1;
                cx0 c11 = xwVar.c(1, drawableArr[1]);
                c11.h.setText(LocaleController.getString(R.string.FavoriteStickersShort));
                c11.setContentDescription(LocaleController.getString(R.string.FavoriteStickers));
            }
            if (!this.f27982j1.isEmpty()) {
                int i15 = this.E1;
                this.F1 = i15;
                this.E1 = i15 + 1;
                cx0 c12 = xwVar.c(0, drawableArr[0]);
                c12.h.setText(LocaleController.getString(R.string.RecentStickersShort));
                c12.setContentDescription(LocaleController.getString(R.string.RecentStickers));
            }
            ArrayList arrayList4 = this.f27962d1;
            arrayList4.clear();
            org.telegram.ui.ActionBar.f6 f6Var = null;
            this.f27976h1 = null;
            this.f27970f1 = -1;
            this.f27966e1 = -10;
            if (this.H2 == null || z10) {
                this.H2 = new ArrayList(mediaDataController.getStickerSets(0));
            }
            ArrayList<TLRPC.TL_messages_stickerSet> arrayList5 = this.H2;
            int i16 = 0;
            while (true) {
                TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.f28027x1;
                if (i16 >= stickerSetCoveredArr.length) {
                    break;
                }
                TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCoveredArr[i16];
                long j10 = j3;
                if (stickerSetCovered2 != null) {
                    TLRPC.TL_messages_stickerSet stickerSetById = mediaDataController.getStickerSetById(stickerSetCovered2.set.f19923id);
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
                j3 = j10;
            }
            long j11 = j3;
            ArrayList<TLRPC.TL_messages_stickerSet> filterPremiumStickers = MessagesController.getInstance(i11).filterPremiumStickers(arrayList5);
            for (int i17 = 0; i17 < filterPremiumStickers.size(); i17++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = filterPremiumStickers.get(i17);
                TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet2.set;
                if ((stickerSet2 == null || !stickerSet2.archived) && (arrayList2 = tL_messages_stickerSet2.documents) != null && !arrayList2.isEmpty()) {
                    arrayList4.add(tL_messages_stickerSet2);
                }
            }
            if (this.J1 != null) {
                long j12 = MessagesController.getEmojiSettings(i11).getLong("group_hide_stickers_" + this.J1.f19897id, -1L);
                TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(this.J1.f19897id));
                if (chat != null && this.J1.stickerset != null && ChatObject.hasAdminRights(chat)) {
                    TLRPC.StickerSet stickerSet3 = this.J1.stickerset;
                    if (stickerSet3 != null) {
                        if (j12 == stickerSet3.f19923id) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        this.f27973g1 = z15;
                    }
                } else {
                    if (j12 != -1) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    this.f27973g1 = z14;
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
                        if (this.f27973g1) {
                            this.f27966e1 = arrayList4.size();
                            arrayList4.add(tL_messages_stickerSet3);
                        } else {
                            this.f27966e1 = 0;
                            arrayList4.add(0, tL_messages_stickerSet3);
                        }
                        if (!this.J1.can_set_stickers) {
                            tL_messages_stickerSet3 = null;
                        }
                        this.f27976h1 = tL_messages_stickerSet3;
                    }
                } else if (chatFull.can_set_stickers) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = new TLRPC.TL_messages_stickerSet();
                    if (this.f27973g1) {
                        this.f27966e1 = arrayList4.size();
                        arrayList4.add(tL_messages_stickerSet4);
                    } else {
                        this.f27966e1 = 0;
                        arrayList4.add(0, tL_messages_stickerSet4);
                    }
                }
            }
            int i18 = 0;
            while (i18 < arrayList4.size()) {
                if (i18 == this.f27966e1) {
                    TLRPC.Chat chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(this.J1.f19897id));
                    if (chat2 == null) {
                        arrayList4.remove(0);
                        i18--;
                    } else {
                        this.f27965e0 = z16;
                        String str = "chat" + chat2.f19896id;
                        int i19 = xwVar.f27218x;
                        xwVar.f27218x = i19 + 1;
                        cx0 cx0Var = (cx0) xwVar.f27208n.get(str);
                        if (cx0Var != null) {
                            xwVar.g(str, cx0Var, i19);
                        } else {
                            cx0Var = new cx0(xwVar.getContext(), 0);
                            cx0Var.setFocusable(z16);
                            cx0Var.setOnClickListener(new bm0(xwVar, 0));
                            cc1Var.addView(cx0Var, i19);
                            cx0Var.f25141w = z16;
                            i9 i9Var = new i9(f6Var);
                            i9Var.u(AndroidUtilities.dp(14.0f));
                            i9Var.k(UserConfig.selectedAccount, chat2);
                            int i20 = xwVar.f27191a;
                            x9 x9Var = cx0Var.f25136e;
                            x9Var.setLayerNum(i20);
                            x9Var.e(chat2, i9Var);
                            x9Var.setAspectFit(z16);
                            cx0Var.setExpanded(xwVar.f27201f0);
                            cx0Var.a(xwVar.f27204i0);
                            cx0Var.h.setText(chat2.title);
                        }
                        cx0Var.d = z16;
                        cx0Var.setTag(R.id.index_tag, Integer.valueOf(i19));
                        if (i19 == xwVar.f27219y) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        cx0Var.setSelected(z13);
                        xwVar.h.put(str, cx0Var);
                    }
                } else {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet5 = (TLRPC.TL_messages_stickerSet) arrayList4.get(i18);
                    TLRPC.StickerSet stickerSet5 = tL_messages_stickerSet5.set;
                    if (stickerSet5 != null && stickerSet5.thumb_document_id != j11) {
                        for (int i21 = 0; i21 < tL_messages_stickerSet5.documents.size(); i21++) {
                            document = tL_messages_stickerSet5.documents.get(i21);
                            if (document != null && tL_messages_stickerSet5.set.thumb_document_id == document.f19902id) {
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
                    String str2 = "set" + tL_messages_stickerSet5.set.f19923id;
                    int i22 = xwVar.f27218x;
                    xwVar.f27218x = i22 + 1;
                    cx0 cx0Var2 = (cx0) xwVar.f27208n.get(str2);
                    if (cx0Var2 != null) {
                        xwVar.g(str2, cx0Var2, i22);
                    } else {
                        cx0Var2 = new cx0(xwVar.getContext(), 0);
                        cx0Var2.setFocusable(z16);
                        cx0Var2.setOnClickListener(new bm0(xwVar, 1));
                        cx0Var2.setExpanded(xwVar.f27201f0);
                        cx0Var2.a(xwVar.f27204i0);
                        cc1Var.addView(cx0Var2, i22);
                    }
                    cx0Var2.f25136e.setLayerNum(xwVar.f27191a);
                    cx0Var2.d = false;
                    cx0Var2.setTag(closestPhotoSizeWithSize);
                    cx0Var2.setTag(R.id.index_tag, Integer.valueOf(i22));
                    cx0Var2.setTag(R.id.parent_tag, tL_messages_stickerSet5);
                    cx0Var2.setTag(R.id.object_tag, document);
                    if (i22 == xwVar.f27219y) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    cx0Var2.setSelected(z12);
                    xwVar.h.put(str2, cx0Var2);
                    cx0Var2.setContentDescription(tL_messages_stickerSet5.set.title + ", " + LocaleController.getString(R.string.AccDescrStickerSet));
                }
                i18++;
                z16 = true;
                f6Var = null;
            }
            xwVar.h();
            xwVar.q();
            if (currentPosition != 0) {
                xwVar.k(currentPosition, currentPosition);
            }
            o();
        }
    }

    @Override
    public final void a(int i10) {
        setBottomInset(i10);
    }

    public final void a0() {
        boolean z10;
        int i10;
        yw ywVar = this.C0;
        xw xwVar = this.B0;
        if (xwVar != null && ywVar == null && this.f28013t1 != null) {
            xwVar.setTranslationY(this.f28013t1.p() * (-AndroidUtilities.dp(50.0f)));
        }
        if (ywVar == null) {
            return;
        }
        if (getVisibility() == 0 && this.K0 && this.f28013t1.p() != 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        ywVar.setVisibility(i10);
        if (z10) {
            Rect rect = this.f28032y2;
            rect.setEmpty();
            this.h.getChildVisibleRect(this.f28026x0, rect, null);
            float p5 = this.f28013t1.p() * AndroidUtilities.dp(50.0f);
            int i11 = rect.left;
            if (i11 != 0 || p5 != 0.0f) {
                this.X1 = false;
            }
            ywVar.setTranslationX(i11);
            float translationY = (((getTranslationY() + getTop()) - ywVar.getTop()) - xwVar.getExpandedOffset()) - p5;
            if (ywVar.getTranslationY() != translationY) {
                ywVar.setTranslationY(translationY);
                ywVar.invalidate();
            }
        }
        if (this.X1 && z10 && this.P0) {
            xwVar.i(this.W1, true);
            return;
        }
        this.X1 = false;
        xwVar.i(this.W1, false);
    }

    @Override
    public final void b(float f7) {
        this.f28007r2 = f7;
        T();
    }

    public final void b0() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        org.telegram.ui.Cells.r3 r3Var;
        LongSparseArray longSparseArray = this.f28034z1;
        LongSparseArray longSparseArray2 = this.f28031y1;
        int i10 = this.f27959c1;
        tw twVar = this.D0;
        if (twVar != null) {
            try {
                int childCount = twVar.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = twVar.getChildAt(i11);
                    if ((childAt instanceof org.telegram.ui.Cells.r3) && ((vk0) twVar.T(childAt)) != null) {
                        org.telegram.ui.Cells.r3 r3Var2 = (org.telegram.ui.Cells.r3) childAt;
                        ArrayList<Long> unreadStickerSets = MediaDataController.getInstance(i10).getUnreadStickerSets();
                        TLRPC.StickerSetCovered stickerSet = r3Var2.getStickerSet();
                        if (unreadStickerSets != null && unreadStickerSets.contains(Long.valueOf(stickerSet.set.f19923id))) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        int i12 = 0;
                        while (true) {
                            TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.f28027x1;
                            if (i12 < stickerSetCoveredArr.length) {
                                TLRPC.StickerSetCovered stickerSetCovered = stickerSetCoveredArr[i12];
                                if (stickerSetCovered != null) {
                                    r3Var = r3Var2;
                                    if (stickerSetCovered.set.f19923id == stickerSet.set.f19923id) {
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
                            MediaDataController.getInstance(i10).markFeaturedStickersByIdAsRead(false, stickerSet.set.f19923id);
                        }
                        if (longSparseArray2.indexOfKey(stickerSet.set.f19923id) >= 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (longSparseArray.indexOfKey(stickerSet.set.f19923id) >= 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z12 || z13) {
                            if (z12 && r3Var2.f22698r) {
                                longSparseArray2.remove(stickerSet.set.f19923id);
                                z12 = false;
                            } else if (z13 && !r3Var2.f22698r) {
                                longSparseArray.remove(stickerSet.set.f19923id);
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
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        Utilities.Callback callback;
        TLRPC.StickerSet stickerSet;
        int i12 = NotificationCenter.stickersDidLoad;
        tx txVar = this.R;
        cw cwVar = this.L2;
        if (i10 == i12) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (this.f28030y0 != null) {
                    Z(((Boolean) objArr[1]).booleanValue());
                    b0();
                    G();
                    o();
                }
            } else if (((Integer) objArr[0]).intValue() == 5) {
                if (((Boolean) objArr[1]).booleanValue()) {
                    AndroidUtilities.cancelRunOnUIThread(cwVar);
                    AndroidUtilities.runOnUIThread(cwVar, 100L);
                    return;
                }
                txVar.F(false);
            }
        } else if (i10 == NotificationCenter.groupPackUpdated) {
            long longValue = ((Long) objArr[0]).longValue();
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            TLRPC.ChatFull chatFull = this.J1;
            if (chatFull != null && chatFull.f19897id == longValue && booleanValue) {
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
            ed0 ed0Var = this.f28021w;
            if (ed0Var != null) {
                int childCount = ed0Var.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    ed0Var.getChildAt(i13).invalidate();
                }
            }
            Z(false);
        } else if (i10 == NotificationCenter.featuredEmojiDidLoad) {
            if (txVar != null) {
                txVar.F(false);
            }
        } else {
            int i14 = NotificationCenter.groupStickersDidLoad;
            ky kyVar = this.S;
            if (i10 == i14) {
                Long l4 = (Long) objArr[0];
                long longValue2 = l4.longValue();
                if (objArr.length > 1) {
                    tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) objArr[1];
                } else {
                    tL_messages_stickerSet = null;
                }
                if (tL_messages_stickerSet != null) {
                    fz fzVar = this.f28033z0;
                    if (fzVar != null && fzVar.d == longValue2 && fzVar.f26231f.size() < tL_messages_stickerSet.documents.size()) {
                        fzVar.f26231f = tL_messages_stickerSet.documents;
                        fzVar.l();
                    }
                    if (kyVar != null && kyVar.d == longValue2 && kyVar.f27943f.size() < tL_messages_stickerSet.documents.size()) {
                        kyVar.f27943f = tL_messages_stickerSet.documents;
                        kyVar.l();
                    }
                }
                TLRPC.ChatFull chatFull2 = this.J1;
                if (chatFull2 != null && (stickerSet = chatFull2.stickerset) != null && stickerSet.f19923id == longValue2) {
                    Z(false);
                }
                HashMap hashMap = this.f28006r1;
                if (hashMap.containsKey(l4) && objArr.length >= 2 && ((Utilities.Callback) hashMap.get(l4)) != null && tL_messages_stickerSet != null && (callback = (Utilities.Callback) hashMap.remove(l4)) != null) {
                    callback.run(tL_messages_stickerSet);
                }
                AndroidUtilities.cancelRunOnUIThread(cwVar);
                AndroidUtilities.runOnUIThread(cwVar, 100L);
                return;
            }
            int i15 = NotificationCenter.emojiLoaded;
            kx kxVar = this.P;
            if (i10 == i15) {
                tw twVar = this.D0;
                if (twVar != null) {
                    int childCount2 = twVar.getChildCount();
                    for (int i16 = 0; i16 < childCount2; i16++) {
                        View childAt = twVar.getChildAt(i16);
                        if ((childAt instanceof org.telegram.ui.Cells.o8) || (childAt instanceof org.telegram.ui.Cells.f8)) {
                            childAt.invalidate();
                        }
                    }
                }
                if (kxVar != null) {
                    kxVar.invalidate();
                    int childCount3 = kxVar.getChildCount();
                    for (int i17 = 0; i17 < childCount3; i17++) {
                        View childAt2 = kxVar.getChildAt(i17);
                        if (childAt2 instanceof ty) {
                            childAt2.invalidate();
                        }
                    }
                }
                vu vuVar = this.B1;
                if (vuVar != null) {
                    vuVar.f32012c.invalidate();
                }
                rx rxVar = this.f27998p0;
                if (rxVar != null) {
                    cc1 cc1Var = rxVar.f27198e;
                    int childCount4 = cc1Var.getChildCount();
                    for (int i18 = 0; i18 < childCount4; i18++) {
                        cc1Var.getChildAt(i18).invalidate();
                    }
                }
            } else if (i10 == NotificationCenter.newEmojiSuggestionsAvailable) {
                if (kxVar != null && this.f27961d0) {
                    if ((this.V.f32801c.f32648k == 2 || kxVar.getAdapter() == kyVar) && !TextUtils.isEmpty(kyVar.v)) {
                        kyVar.F(kyVar.v, true);
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
        gh.d dVar;
        bh.f fVar;
        if (Build.VERSION.SDK_INT >= 31 && (dVar = this.f27988l2) != null && (fVar = this.f27983j2) != null) {
            C();
            RecordingCanvas a2 = dVar.a(getMeasuredWidth(), getMeasuredHeight());
            a2.drawColor(A(org.telegram.ui.ActionBar.j6.f20690d6));
            if (SharedConfig.chatBlurEnabled()) {
                fVar.b(a2, -2);
            }
            dVar.b();
        }
        T();
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.h) {
            canvas.save();
            if (this.f27991n.getVisibility() != 8 && !this.f28015u0 && this.f28022w0) {
                canvas.drawColor(i0.a.k(-1, 25));
            }
            boolean drawChild = super.drawChild(canvas, view, j3);
            float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(this.f28003q2);
            if (navigationBarThirdButtonsFactor > 0.0f) {
                int l1 = org.telegram.ui.ActionBar.j6.l1(navigationBarThirdButtonsFactor, A(org.telegram.ui.ActionBar.j6.He));
                int i10 = this.C2;
                GradientDrawable gradientDrawable = this.B2;
                if (i10 != l1) {
                    gradientDrawable.setColors(new int[]{l1, org.telegram.ui.ActionBar.j6.l1(0.66f, l1), i0.a.k(l1, 0)});
                    this.C2 = l1;
                }
                gradientDrawable.setBounds(0, getMeasuredHeight() - this.f28003q2, getMeasuredWidth(), getMeasuredHeight());
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

    public ArrayList<xx> getEmojipacks() {
        ArrayList<xx> arrayList = new ArrayList<>();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f28002q1;
            if (i10 < arrayList2.size()) {
                xx xxVar = (xx) arrayList2.get(i10);
                boolean z10 = xxVar.f32795g;
                ArrayList arrayList3 = this.f27999p1;
                if ((!z10 && (xxVar.f32794f || arrayList3.contains(Long.valueOf(xxVar.f32791b.f19923id)))) || (xxVar.f32795g && !xxVar.f32794f && !arrayList3.contains(Long.valueOf(xxVar.f32791b.f19923id)))) {
                    arrayList.add(xxVar);
                }
                i10++;
            } else {
                return arrayList;
            }
        }
    }

    public ArrayList<String> getRecentEmoji() {
        if (this.f27960c2) {
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
        xw xwVar = this.B0;
        if (xwVar == null) {
            return 0.0f;
        }
        return xwVar.getExpandedOffset();
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
                if (!this.f27960c2) {
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
        if (i10 == 2 || x(i10).K(0) == null) {
            return;
        }
        hx hxVar = new hx(getContext(), i11);
        hxVar.f45934a = !z10 ? 1 : 0;
        w(i10).w0(hxVar);
    }

    public final void k(boolean z10) {
        if (z10) {
            Y();
            return;
        }
        int size = this.f27982j1.size();
        int size2 = this.f27985k1.size();
        int i10 = this.f27959c1;
        this.f27982j1 = MediaDataController.getInstance(i10).getRecentStickers(0, true);
        this.f27985k1 = MediaDataController.getInstance(i10).getRecentStickers(2);
        if (UserConfig.getInstance(i10).isPremium()) {
            this.l1 = MediaDataController.getInstance(i10).getRecentStickers(7);
        } else {
            this.l1 = new ArrayList();
        }
        for (int i11 = 0; i11 < this.f27985k1.size(); i11++) {
            TLRPC.Document document = (TLRPC.Document) this.f27985k1.get(i11);
            int i12 = 0;
            while (true) {
                if (i12 < this.f27982j1.size()) {
                    TLRPC.Document document2 = (TLRPC.Document) this.f27982j1.get(i12);
                    if (document2.dc_id == document.dc_id && document2.f19902id == document.f19902id) {
                        this.f27982j1.remove(i12);
                        break;
                    }
                    i12++;
                }
            }
        }
        if (MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            int i13 = 0;
            while (i13 < this.f27985k1.size()) {
                if (MessageObject.isPremiumSticker((TLRPC.Document) this.f27985k1.get(i13))) {
                    this.f27985k1.remove(i13);
                    i13--;
                }
                i13++;
            }
            int i14 = 0;
            while (i14 < this.f27982j1.size()) {
                if (MessageObject.isPremiumSticker((TLRPC.Document) this.f27982j1.get(i14))) {
                    this.f27982j1.remove(i14);
                    i14--;
                }
                i14++;
            }
        }
        if (size != this.f27982j1.size() || size2 != this.f27985k1.size()) {
            Z(false);
        }
        bz bzVar = this.f28030y0;
        if (bzVar != null) {
            bzVar.l();
        }
        o();
    }

    public final void l(boolean z10) {
        int i10;
        boolean z11;
        ly lyVar = this.f28013t1;
        le.b bVar = this.f27953b;
        kx kxVar = this.P;
        kw kwVar = this.V;
        if (lyVar != null && lyVar.z()) {
            s4.c1 K = kxVar.K(0);
            if (K == null) {
                xy.a(kwVar, true, !z10);
            } else {
                if (K.f45766a.getTop() < kxVar.getPaddingTop()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                xy.a(kwVar, z11, !z10);
            }
            P(false, !z10);
            kwVar.setTranslationY(bVar.f15395e * AndroidUtilities.dp(15.0f));
        } else if (kwVar != null && kxVar != null) {
            s4.c1 K2 = kxVar.K(0);
            if (K2 != null) {
                i10 = K2.f45766a.getTop();
            } else {
                i10 = -this.f27955b1;
            }
            kwVar.setTranslationY((bVar.f15395e * AndroidUtilities.dp(15.0f)) + i10);
            kwVar.f32799a.a(false, !z10);
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
        int dp = AndroidUtilities.dp(38.0f) + i10;
        if (dp > 0 && (K == null || K.f45766a.getBottom() < dp)) {
            z10 = true;
        }
        P(z10, !this.K1);
    }

    public final void n(kx kxVar, int i10) {
        kx kxVar2;
        s4.c1 K;
        int i11;
        jw jwVar = this.I;
        int[] iArr = this.Q0;
        if (kxVar == null) {
            iArr[1] = 0;
            jwVar.setTranslationY(0);
        } else if (kxVar.getVisibility() == 0 && !this.f27969f0) {
            ly lyVar = this.f28013t1;
            if (lyVar == null || !lyVar.z()) {
                if (i10 > 0 && (kxVar2 = this.P) != null && kxVar2.getVisibility() == 0 && (K = kxVar2.K(0)) != null) {
                    int top = K.f45766a.getTop();
                    if (this.f27961d0) {
                        i11 = this.f27955b1;
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
                jwVar.setTranslationY(Math.max(-AndroidUtilities.dp(36.0f), iArr[1]));
            }
        }
    }

    public final void o() {
        int L0;
        xw xwVar = this.B0;
        if (xwVar != null && (L0 = this.E0.L0()) != -1) {
            int i10 = this.G1;
            if (i10 <= 0 && (i10 = this.F1) <= 0) {
                i10 = this.E1;
            }
            xwVar.k(this.f28030y0.F(L0), i10);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        int i10 = this.f27959c1;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.groupPackUpdated);
        if (this.f28030y0 != null) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.stickersDidLoad);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.recentDocumentsDidLoad);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.featuredStickersDidLoad);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.groupStickersDidLoad);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
            AndroidUtilities.runOnUIThread(new cw(this, 0));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        vu vuVar = this.B1;
        if (vuVar != null && vuVar.isShowing()) {
            vuVar.dismiss();
        }
        org.telegram.ui.st q6 = org.telegram.ui.st.q();
        if (q6.f40565l == this.f27974g2) {
            q6.W = null;
            q6.f40552a0 = null;
            q6.Y = null;
            q6.f40565l = null;
            q6.f40556c0 = null;
            q6.u();
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        if (this.O1 != i14) {
            this.O1 = i14;
            G();
        }
        super.onLayout(z10, i10, i11, i12, i13);
        T();
        a0();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.K1 = true;
        boolean z10 = AndroidUtilities.isInMultiwindow;
        View view = this.v;
        boolean z11 = this.f27961d0;
        if (!z10 && !this.N1) {
            if (this.L1 != 0) {
                if (!this.I2) {
                    setOutlineProvider(null);
                    setClipToOutline(false);
                    setElevation(0.0f);
                }
                if (this.f28015u0) {
                    int i12 = org.telegram.ui.ActionBar.j6.He;
                    setBackgroundColor(A(i12));
                    if (z11) {
                        view.setBackgroundColor(A(i12));
                    }
                }
                this.L1 = 0;
            }
        } else if (this.L1 != 1) {
            if (!this.I2) {
                setOutlineProvider(this.M1);
                setClipToOutline(true);
                setElevation(AndroidUtilities.dp(2.0f));
            }
            setBackgroundResource(R.drawable.smiles_popup);
            Drawable background = getBackground();
            int i13 = org.telegram.ui.ActionBar.j6.He;
            background.setColorFilter(new PorterDuffColorFilter(A(i13), PorterDuff.Mode.MULTIPLY));
            if (z11 && this.f28015u0) {
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
                this.B0.k(this.f28030y0.F(L02), i12);
            }
        } else if (i10 == 2) {
            s4.h0 adapter = this.f27975h0.getAdapter();
            py pyVar = this.f27992n0;
            if (adapter == pyVar && pyVar.I >= 0 && this.f28009s0 >= 0 && this.f28005r0 >= 0 && (L0 = this.f27978i0.L0()) != -1) {
                if (L0 >= pyVar.I) {
                    i11 = this.f28009s0;
                } else {
                    i11 = this.f28005r0;
                }
                this.f27998p0.k(i11, 0);
            }
        }
    }

    public final void q(boolean z10) {
        int i10;
        ly lyVar = this.f28013t1;
        le.b bVar = this.f27950a;
        tw twVar = this.D0;
        boolean z11 = false;
        ww wwVar = this.G0;
        if (lyVar != null && lyVar.z()) {
            s4.c1 K = twVar.K(0);
            if (K == null) {
                xy.a(wwVar, true, !z10);
            } else {
                if (K.f45766a.getTop() < twVar.getPaddingTop()) {
                    z11 = true;
                }
                xy.a(wwVar, z11, !z10);
            }
            wwVar.setTranslationY(bVar.f15395e * AndroidUtilities.dp(15.0f));
        } else if (wwVar != null && twVar != null) {
            s4.c1 K2 = twVar.K(0);
            if (K2 != null) {
                i10 = K2.f45766a.getTop();
            } else {
                i10 = -this.f27955b1;
            }
            wwVar.setTranslationY((bVar.f15395e * AndroidUtilities.dp(15.0f)) + i10);
            wwVar.f32799a.a(false, !z10);
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

    public final void s(long j3, boolean z10) {
        xy xyVar;
        s4.c0 c0Var;
        View view;
        View view2;
        int i10;
        TLRPC.TL_messages_stickerSet stickerSetById;
        bz bzVar;
        int E;
        AnimatorSet animatorSet = this.M0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.M0 = null;
        }
        int currentItem = this.h.getCurrentItem();
        if (currentItem == 2 && j3 != -1 && (stickerSetById = MediaDataController.getInstance(this.f27959c1).getStickerSetById(j3)) != null && (E = (bzVar = this.f28030y0).E(stickerSetById)) >= 0 && E < bzVar.h()) {
            J(E, AndroidUtilities.dp(48.0f));
        }
        py pyVar = this.f27981j0;
        if (pyVar != null) {
            pyVar.K = false;
        }
        for (int i11 = 0; i11 < 3; i11++) {
            View view3 = this.D0;
            View view4 = this.f27975h0;
            qw qwVar = this.f27995o0;
            View view5 = this.P;
            if (i11 == 0) {
                xyVar = this.V;
                c0Var = this.Q;
                view = this.I;
                view2 = view5;
            } else if (i11 == 1) {
                c0Var = this.f27978i0;
                view = this.f27998p0;
                view2 = view4;
                xyVar = qwVar;
            } else {
                xyVar = this.G0;
                c0Var = this.E0;
                view = this.B0;
                view2 = view3;
            }
            if (xyVar != null) {
                wy wyVar = xyVar.f32805r;
                xyVar.d.setText("");
                if (wyVar != null) {
                    wyVar.E1(null);
                    wyVar.C1();
                }
                int i12 = this.f27955b1;
                if (i11 == currentItem && z10) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.M0 = animatorSet2;
                    Property property = View.TRANSLATION_Y;
                    if (view != null && i11 != 1) {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, 0.0f), ObjectAnimator.ofFloat(view2, property, AndroidUtilities.dp(36.0f)), ObjectAnimator.ofFloat(xyVar, property, AndroidUtilities.dp(36.0f)));
                    } else {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(view2, property, AndroidUtilities.dp(36.0f) - i12));
                    }
                    this.M0.setDuration(200L);
                    this.M0.setInterpolator(pr.h);
                    this.M0.addListener(new bi.j4(this, c0Var, view2, 5));
                    this.M0.start();
                } else {
                    if (xyVar != qwVar) {
                        xyVar.setTranslationY(AndroidUtilities.dp(36.0f) - i12);
                    }
                    if (view != null && i11 != 2) {
                        view.setTranslationY(0.0f);
                    }
                    if (view2 == view3) {
                        i10 = 0;
                        view2.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f) + this.f28003q2);
                    } else {
                        i10 = 0;
                        if (view2 == view4) {
                            view2.setPadding(0, AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(44.0f) + this.f28003q2);
                        } else {
                            if (view2 == view5) {
                                view2.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f) + this.f28003q2);
                            }
                            i10 = 0;
                        }
                    }
                    c0Var.h1(i10, i10);
                }
            }
        }
        if (!z10) {
            this.f28013t1.i(0);
        }
    }

    public void setBlurredBackgroundDrawableFactory(bh.b bVar) {
        org.telegram.ui.ActionBar.f6 f6Var = this.Z1;
        View view = this.f28025x;
        if (view != null) {
            dh.d c10 = bVar.c(view, null, false);
            c10.n(fh.b.d(f6Var));
            c10.p(AndroidUtilities.dp(18.0f));
            c10.o(AndroidUtilities.dp(6.0f));
            view.setBackground(c10);
        }
        View view2 = this.E;
        if (view2 != null) {
            dh.d c11 = bVar.c(view2, null, false);
            c11.n(fh.b.d(f6Var));
            c11.p(AndroidUtilities.dp(18.0f));
            c11.o(AndroidUtilities.dp(6.0f));
            view2.setBackground(c11);
        }
        View view3 = this.f28021w;
        if (view3 != null) {
            dh.d c12 = bVar.c(view3, null, false);
            c12.n(fh.b.d(f6Var));
            c12.p(AndroidUtilities.dp(18.0f));
            c12.o(AndroidUtilities.dp(6.0f));
            view3.setBackground(c12);
        }
        View view4 = this.f28029y;
        if (view4 != null) {
            dh.d c13 = bVar.c(view4, null, false);
            c13.n(fh.b.d(f6Var));
            c13.p(AndroidUtilities.dp(18.0f));
            c13.o(AndroidUtilities.dp(6.0f));
            view4.setBackground(c13);
        }
    }

    public void setBottomInset(int i10) {
        if (this.f28003q2 != i10) {
            this.f28003q2 = i10;
            j(i10, this.K);
            j(i10, this.M);
            j(AndroidUtilities.dp(44.0f) + i10, this.P);
            j(AndroidUtilities.dp(44.0f) + i10, this.D0);
            j(AndroidUtilities.dp(44.0f) + i10, this.f27975h0);
            FrameLayout frameLayout = this.f28008s;
            if (frameLayout != null) {
                frameLayout.setTranslationY(-i10);
            }
            T();
            invalidate();
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        this.J1 = chatFull;
        Z(false);
    }

    public void setDelegate(ly lyVar) {
        this.f28013t1 = lyVar;
    }

    public void setDragListener(qx qxVar) {
        this.O0 = qxVar;
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        ww wwVar = this.G0;
        if (wwVar != null) {
            wwVar.d.setEnabled(z10);
        }
        qw qwVar = this.f27995o0;
        if (qwVar != null) {
            qwVar.d.setEnabled(z10);
        }
        kw kwVar = this.V;
        if (kwVar != null) {
            kwVar.d.setEnabled(z10);
        }
    }

    public void setForseMultiwindowLayout(boolean z10) {
        this.N1 = z10;
    }

    public void setShouldDrawBackground(boolean z10) {
        if (this.f28015u0 != z10) {
            this.f28015u0 = z10;
            U();
        }
    }

    public void setShowing(boolean z10) {
        this.P0 = z10;
        a0();
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        a0();
        T();
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
                int i11 = this.f27959c1;
                NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.stickersDidLoad);
                if (this.f28030y0 != null) {
                    NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.recentDocumentsDidLoad);
                    Z(false);
                    G();
                }
                k(true);
                k(false);
                MediaDataController.getInstance(i11).loadRecents(0, true, true, false);
                MediaDataController.getInstance(i11).loadRecents(0, false, true, false);
                MediaDataController.getInstance(i11).loadRecents(2, false, true, false);
            }
            hg.g1 g1Var = this.T0;
            if (g1Var != null) {
                g1Var.a();
            }
        }
    }

    public final void t(boolean z10) {
        s(-1L, z10);
    }

    public final void u(boolean z10) {
        bz bzVar;
        boolean z11 = this.N2;
        this.N2 = z10;
        if (z11 && !z10) {
            int i10 = this.A1;
            if (i10 == 0) {
                tx txVar = this.R;
                if (txVar != null) {
                    txVar.F(false);
                }
            } else if (i10 == 1) {
                py pyVar = this.f27992n0;
                if (pyVar != null) {
                    pyVar.l();
                }
            } else if (i10 == 2 && (bzVar = this.f28030y0) != null) {
                bzVar.l();
            }
        }
    }

    public final int v(float f7) {
        return i0.a.k(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Wk, this.Z1), (int) (f7 * 255.0f));
    }

    public final s4.s w(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return this.f27978i0;
                }
                throw new IllegalArgumentException(i2.g.i(i10, "Unexpected argument: "));
            }
            return this.Q;
        }
        return this.E0;
    }

    public final ll0 x(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return this.f27975h0;
                }
                throw new IllegalArgumentException(i2.g.i(i10, "Unexpected argument: "));
            }
            return this.P;
        }
        return this.D0;
    }

    public final HorizontalScrollView y(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return this.f27998p0;
                }
                throw new IllegalArgumentException(i2.g.i(i10, "Unexpected argument: "));
            }
            return this.I;
        }
        return this.B0;
    }

    @Override
    public final void z(float f7, int i10) {
    }
}
