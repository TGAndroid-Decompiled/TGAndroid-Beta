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
import org.telegram.ui.cc1;
public class kz extends FrameLayout implements le.d, NotificationCenter.NotificationCenterDelegate, ph.a {
    public static final int O2 = 0;
    public final hw A0;
    public int A1;
    public final GradientDrawable A2;
    public final ww B0;
    public final xu B1;
    public int B2;
    public final xw C0;
    public final int C1;
    public ArrayList C2;
    public final sw D0;
    public final int[] D1;
    public int D2;
    public final ImageView E;
    public final tw E0;
    public int E1;
    public long E2;
    public AnimatorSet F;
    public iz F0;
    public int F1;
    public final le.b F2;
    public AnimatorSet G;
    public final vw G0;
    public int G1;
    public ArrayList G2;
    public float H;
    public final nh.d H0;
    public int H1;
    public boolean H2;
    public final nx I;
    public boolean I0;
    public int I1;
    public NotificationCenter.ObserversGroup I2;
    public final ix J;
    public boolean J0;
    public TLRPC.ChatFull J1;
    public AnimatorSet J2;
    public final ci.n6 K;
    public boolean K0;
    public boolean K1;
    public org.telegram.messenger.video.k K2;
    public final nh.b L;
    public final dy L0;
    public int L1;
    public final dw L2;
    public final ci.n6 M;
    public AnimatorSet M0;
    public final ai.j6 M1;
    public boolean M2;
    public final nh.b N;
    public final ai.p4 N0;
    public boolean N1;
    public boolean N2;
    public final View O;
    public px O0;
    public int O1;
    public final vx P;
    public boolean P0;
    public boolean P1;
    public final jx Q;
    public final int[] Q0;
    public boolean Q1;
    public final sx R;
    public final ObjectAnimator[] R0;
    public ty R1;
    public final jy S;
    public boolean S0;
    public float S1;
    public iz T;
    public gg.g1 T0;
    public float T1;
    public final nh.d U;
    public boolean U0;
    public float U1;
    public final jw V;
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
    public final org.telegram.ui.ActionBar.e6 Z1;
    public final le.b f25691a;
    public final ok0 f25692a0;
    public final String[] f25693a1;
    public final org.telegram.ui.ActionBar.u5 a2;
    public final le.b f25694b;
    public final ok0 f25695b0;
    public final int f25696b1;
    public final org.telegram.ui.ActionBar.u5 f25697b2;
    public int f25698c;
    public boolean f25699c0;
    public final int f25700c1;
    public final boolean f25701c2;
    public final ArrayList d;
    public final boolean f25702d0;
    public final ArrayList f25703d1;
    public LongSparseArray f25704d2;
    public final ArrayList e;
    public boolean f25705e0;
    public int f25706e1;
    public PorterDuffColorFilter f25707e2;
    public boolean f25708f;
    public boolean f25709f0;
    public int f25710f1;
    public final org.telegram.ui.Cells.l7 f25711f2;
    public final lw f25712g0;
    public boolean f25713g1;
    public final dx f25714g2;
    public final yw h;
    public final mw f25715h0;
    public TLRPC.TL_messages_stickerSet f25716h1;
    public boolean f25717h2;
    public final qy f25718i0;
    public ArrayList f25719i1;
    public final boolean f25720i2;
    public final py f25721j0;
    public ArrayList f25722j1;
    public final ah.h f25723j2;
    public final sy f25724k0;
    public ArrayList f25725k1;
    public final jh f25726k2;
    public final HashMap f25727l0;
    public ArrayList l1;
    public final ah.c f25728l2;
    public final hw m0;
    public final ArrayList f25729m1;
    public final ki.e f25730m2;
    public final FrameLayout f25731n;
    public final py f25732n0;
    public final ArrayList f25733n1;
    public boolean f25734n2;
    public final pw f25735o0;
    public final ArrayList f25736o1;
    public boolean f25737o2;
    public final qx f25738p0;
    public final ArrayList f25739p1;
    public int f25740p2;
    public boolean f25741q0;
    public final ArrayList f25742q1;
    public float f25743q2;
    public final FrameLayout f25744r;
    public int f25745r0;
    public final HashMap f25746r1;
    public View f25747r2;
    public final FrameLayout f25748s;
    public int f25749s0;
    public final Paint f25750s1;
    public int f25751s2;
    public int f25752t0;
    public ky f25753t1;
    public int f25754t2;
    public boolean f25755u0;
    public long f25756u1;
    public long f25757u2;
    public final View v;
    public boolean f25758v0;
    public boolean f25759v1;
    public boolean f25760v2;
    public final dd0 f25761w;
    public boolean f25762w0;
    public boolean f25763w1;
    public boolean f25764w2;
    public final zw f25765x;
    public final qw f25766x0;
    public final TLRPC.StickerSetCovered[] f25767x1;
    public final Rect f25768x2;
    public final ImageView f25769y;
    public final bz f25770y0;
    public final LongSparseArray f25771y1;
    public final RectF f25772y2;
    public final fz f25773z0;
    public final LongSparseArray f25774z1;
    public final ArrayList f25775z2;

    public kz(org.telegram.ui.ActionBar.n2 n2Var, boolean z10, boolean z11, boolean z12, Context context, boolean z13, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z14, final org.telegram.ui.ActionBar.e6 e6Var, boolean z15, boolean z16) {
        super(context);
        org.telegram.ui.ActionBar.u5 u5Var;
        int z17;
        ix ixVar;
        Context context2;
        dw dwVar;
        boolean z18;
        Field field;
        int i10;
        qr qrVar = qr.h;
        this.f25691a = new le.b(0, this, qrVar, 320L, false);
        this.f25694b = new le.b(1, this, qrVar, 320L, false);
        this.f25698c = 2;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.e = new ArrayList();
        this.f25699c0 = true;
        this.f25724k0 = new sy(this);
        this.f25727l0 = new HashMap();
        this.f25741q0 = true;
        this.f25745r0 = -2;
        this.f25749s0 = -2;
        this.f25752t0 = -2;
        this.f25755u0 = true;
        this.f25762w0 = true;
        this.I0 = true;
        this.Q0 = new int[3];
        this.R0 = new ObjectAnimator[3];
        int i11 = UserConfig.selectedAccount;
        this.f25700c1 = i11;
        this.f25703d1 = new ArrayList();
        this.f25719i1 = new ArrayList();
        this.f25722j1 = new ArrayList();
        this.f25725k1 = new ArrayList();
        this.l1 = new ArrayList();
        this.f25729m1 = new ArrayList();
        this.f25733n1 = new ArrayList();
        new ArrayList();
        this.f25736o1 = new ArrayList();
        this.f25739p1 = new ArrayList();
        this.f25742q1 = new ArrayList();
        this.f25746r1 = new HashMap();
        this.f25767x1 = new TLRPC.StickerSetCovered[10];
        this.f25771y1 = new LongSparseArray();
        this.f25774z1 = new LongSparseArray();
        this.D1 = new int[2];
        this.F1 = -2;
        this.G1 = -2;
        this.H1 = -2;
        this.I1 = -2;
        this.L1 = -1;
        this.f25711f2 = new org.telegram.ui.Cells.l7(this, 11);
        this.f25714g2 = new dx(this);
        this.f25717h2 = true;
        ki.e eVar = new ki.e();
        this.f25730m2 = eVar;
        this.f25743q2 = -1.0f;
        this.f25751s2 = -1;
        this.f25754t2 = -1;
        this.f25757u2 = -1L;
        this.f25760v2 = false;
        this.f25764w2 = true;
        this.f25768x2 = new Rect();
        RectF rectF = new RectF();
        this.f25772y2 = rectF;
        ArrayList arrayList2 = new ArrayList(1);
        this.f25775z2 = arrayList2;
        arrayList2.add(rectF);
        this.A2 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.F2 = new le.b(0, new ew(this, 3), qrVar, 380L, true);
        this.L2 = new dw(this, 1);
        this.M2 = false;
        this.f25755u0 = z14;
        this.Y1 = n2Var;
        this.f25701c2 = z10;
        this.Z1 = e6Var;
        this.f25720i2 = z16;
        fh.c cVar = new fh.c();
        cVar.a(z(org.telegram.ui.ActionBar.i6.f18834d6));
        if (z15) {
            u(true);
        }
        i0.a.k(z(org.telegram.ui.ActionBar.i6.Wk), 30);
        int dp = AndroidUtilities.dp(50.0f);
        this.f25696b1 = dp;
        this.f25702d0 = z13;
        this.X0 = new Drawable[]{org.telegram.ui.ActionBar.i6.U(context, R.drawable.smiles_tab_smiles, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.i6.Re), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.i6.Oe)), org.telegram.ui.ActionBar.i6.U(context, R.drawable.smiles_tab_gif, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.i6.Re), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.i6.Oe)), org.telegram.ui.ActionBar.i6.U(context, R.drawable.smiles_tab_stickers, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.i6.Re), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.i6.Oe))};
        org.telegram.ui.ActionBar.u5 U = org.telegram.ui.ActionBar.i6.U(context, R.drawable.msg_emoji_recent, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.i6.Me), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.i6.Oe));
        org.telegram.ui.ActionBar.u5 U2 = org.telegram.ui.ActionBar.i6.U(context, R.drawable.emoji_tabs_faves, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.i6.Me), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.i6.Oe));
        org.telegram.ui.ActionBar.u5 U3 = org.telegram.ui.ActionBar.i6.U(context, R.drawable.emoji_tabs_new3, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.i6.Me), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.i6.Oe));
        int i12 = R.drawable.emoji_tabs_new1;
        if (z16) {
            u5Var = U3;
            z17 = v(0.4f);
        } else {
            u5Var = U3;
            z17 = z(org.telegram.ui.ActionBar.i6.Me);
        }
        org.telegram.ui.ActionBar.u5 U4 = org.telegram.ui.ActionBar.i6.U(context, i12, z17, z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.i6.Oe));
        this.a2 = U4;
        int i13 = R.drawable.emoji_tabs_new2;
        int i14 = org.telegram.ui.ActionBar.i6.Qe;
        org.telegram.ui.ActionBar.u5 U5 = org.telegram.ui.ActionBar.i6.U(context, i13, z(i14), z(i14));
        this.f25697b2 = U5;
        this.Y0 = new Drawable[]{U, U2, u5Var, new LayerDrawable(new Drawable[]{U4, U5})};
        this.Z0 = new Drawable[]{org.telegram.ui.ActionBar.i6.U(context, R.drawable.msg_emoji_recent, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.i6.Me), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.i6.Oe)), org.telegram.ui.ActionBar.i6.U(context, R.drawable.stickers_gifs_trending, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.i6.Me), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.i6.Oe))};
        this.f25693a1 = new String[]{LocaleController.getString(R.string.Emoji1), LocaleController.getString(R.string.Emoji2), LocaleController.getString(R.string.Emoji3), LocaleController.getString(R.string.Emoji4), LocaleController.getString(R.string.Emoji5), LocaleController.getString(R.string.Emoji6), LocaleController.getString(R.string.Emoji7), LocaleController.getString(R.string.Emoji8)};
        this.J1 = chatFull;
        Paint paint = new Paint(1);
        this.f25750s1 = paint;
        paint.setColor(z(org.telegram.ui.ActionBar.i6.f18786af));
        ai.k2 k2Var = yf.i0.f46828a;
        this.M1 = new ai.j6(AndroidUtilities.dp(6.0f));
        ix ixVar2 = new ix(this, context);
        this.J = ixVar2;
        ?? obj = new Object();
        obj.f24477a = 0;
        obj.f24478b = ixVar2;
        arrayList.add(obj);
        if (z10) {
            MediaDataController.getInstance(i11).checkStickers(5);
            MediaDataController.getInstance(i11).checkFeaturedEmoji();
            this.f25707e2 = new PorterDuffColorFilter(z(org.telegram.ui.ActionBar.i6.Oh), PorterDuff.Mode.SRC_IN);
        }
        vx vxVar = new vx(this, context);
        this.P = vxVar;
        eVar.a(vxVar);
        s4.j jVar = new s4.j();
        jVar.f42752c = 220L;
        jVar.e = 220L;
        jVar.f42753f = 160L;
        jVar.f42754g = 160L;
        jVar.f42755i = qr.f27421g;
        vxVar.setItemAnimator(jVar);
        vxVar.setOnTouchListener(new View.OnTouchListener(this) {
            public final kz f24098b;

            {
                this.f24098b = this;
            }

            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                switch (r3) {
                    case 0:
                        org.telegram.ui.st q6 = org.telegram.ui.st.q();
                        kz kzVar = this.f24098b;
                        vx vxVar2 = kzVar.P;
                        kzVar.getMeasuredHeight();
                        return q6.s(motionEvent, vxVar2, null, kzVar.f25714g2, e6Var);
                    case 1:
                        org.telegram.ui.st q10 = org.telegram.ui.st.q();
                        kz kzVar2 = this.f24098b;
                        return q10.s(motionEvent, kzVar2.f25715h0, kzVar2.m0, kzVar2.f25714g2, e6Var);
                    default:
                        org.telegram.ui.st q11 = org.telegram.ui.st.q();
                        kz kzVar3 = this.f24098b;
                        sw swVar = kzVar3.D0;
                        kzVar3.getMeasuredHeight();
                        return q11.s(motionEvent, swVar, kzVar3.A0, kzVar3.f25714g2, e6Var);
                }
            }
        });
        vxVar.setOnItemLongClickListener(new ew(this, 1));
        vxVar.setInstantClick(true);
        jx jxVar = new jx(this);
        this.Q = jxVar;
        vxVar.setLayoutManager(jxVar);
        vxVar.setTopGlowOffset(AndroidUtilities.dp(38.0f));
        vxVar.setBottomGlowOffset(AndroidUtilities.dp(36.0f));
        vxVar.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f));
        int i15 = org.telegram.ui.ActionBar.i6.He;
        vxVar.setGlowColor(z(i15));
        vxVar.setItemSelectorColorProvider(new o2(13));
        vxVar.setClipToPadding(false);
        jxVar.O = new kx(this);
        sx sxVar = new sx(this);
        this.R = sxVar;
        vxVar.setAdapter(sxVar);
        vxVar.i(new ci.r1(this, 3));
        this.S = new jy(this, context);
        ixVar2.addView(vxVar, w7.x5.c(-1.0f, -1));
        ok0 ok0Var = new ok0(vxVar, jxVar);
        this.f25695b0 = ok0Var;
        ok0Var.f26831i = new lx(this);
        vxVar.setOnScrollListener(new mx(this));
        if (n2Var != null) {
            ixVar = ixVar2;
            context2 = context;
            dwVar = new dw(this, 2);
        } else {
            ixVar = ixVar2;
            context2 = context;
            dwVar = null;
        }
        nx nxVar = new nx(this, context2, e6Var, z10, dwVar, z16);
        this.I = nxVar;
        if (z13) {
            jw jwVar = new jw(this, context2);
            this.V = jwVar;
            ixVar.addView(jwVar, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + dp));
            jwVar.d.setOnFocusChangeListener(new kw(this));
            nh.d dVar = new nh.d(context2, e6Var);
            this.U = dVar;
            dVar.setVisibility(8);
            dVar.setOnBackClickListener(new View.OnClickListener(this) {
                public final kz f24462b;

                {
                    this.f24462b = this;
                }

                @Override
                public final void onClick(View view) {
                    xy xyVar;
                    switch (r2) {
                        case 0:
                            jy jyVar = this.f24462b.S;
                            ey eyVar = jyVar.f25447c;
                            int childCount = eyVar.getChildCount();
                            for (int i16 = 0; i16 < childCount; i16++) {
                                ((nh.c) eyVar.getChildAt(i16)).a(false, true);
                            }
                            jyVar.d = 0L;
                            jyVar.F.f25694b.a(false, true);
                            jyVar.l();
                            return;
                        case 1:
                            fz fzVar = this.f24462b.f25773z0;
                            ez ezVar = fzVar.f24119c;
                            int childCount2 = ezVar.getChildCount();
                            for (int i17 = 0; i17 < childCount2; i17++) {
                                ((nh.c) ezVar.getChildAt(i17)).a(false, true);
                            }
                            fzVar.d = 0L;
                            fzVar.Q.f25691a.a(false, true);
                            fzVar.l();
                            return;
                        case 2:
                            ky kyVar = this.f24462b.f25753t1;
                            if (kyVar != null) {
                                kyVar.w();
                                return;
                            }
                            return;
                        default:
                            kz kzVar = this.f24462b;
                            int currentItem = kzVar.h.getCurrentItem();
                            if (currentItem == 0) {
                                xyVar = kzVar.V;
                            } else if (currentItem == 1) {
                                xyVar = kzVar.f25735o0;
                            } else {
                                xyVar = kzVar.G0;
                            }
                            if (xyVar != null) {
                                iq iqVar = xyVar.d;
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
            ixVar.addView(dVar, new FrameLayout.LayoutParams(-1, dp));
        }
        int z19 = z(i15);
        if (Color.alpha(z19) >= 255) {
            nxVar.setBackgroundColor(z19);
        }
        sxVar.G(true);
        nxVar.p(getEmojipacks());
        ixVar.addView(nxVar, w7.x5.c(36.0f, -1));
        View view = new View(context2);
        this.O = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        int i16 = org.telegram.ui.ActionBar.i6.Ke;
        view.setBackgroundColor(z(i16));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(36.0f);
        ixVar.addView(view, layoutParams);
        nh.b bVar = new nh.b(context2, e6Var);
        this.L = bVar;
        ci.n6 n6Var = new ci.n6(context2, 3, e6Var);
        this.K = n6Var;
        n6Var.setVisibility(8);
        n6Var.addView(bVar, w7.x5.d(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
        ixVar.addView(n6Var, w7.x5.e(-1, -2, 80));
        if (z11) {
            hm0 hm0Var = hm0.f24726b;
            if (z12) {
                lw lwVar = new lw(this, context2);
                this.f25712g0 = lwVar;
                ?? obj2 = new Object();
                obj2.f24477a = 1;
                obj2.f24478b = lwVar;
                this.d.add(obj2);
                mw mwVar = new mw(this, context2);
                this.f25715h0 = mwVar;
                eVar.a(mwVar);
                mwVar.setClipToPadding(false);
                qy qyVar = new qy(this);
                this.f25718i0 = qyVar;
                mwVar.setLayoutManager(qyVar);
                mwVar.i(new nw(this));
                mwVar.setPadding(0, dp, 0, AndroidUtilities.dp(44.0f) + this.f25740p2);
                ((s4.f1) mwVar.getItemAnimator()).f42706m = false;
                py pyVar = new py(this, context2, true, Integer.MAX_VALUE);
                this.f25732n0 = pyVar;
                mwVar.setAdapter(pyVar);
                this.f25721j0 = new py(this, context2, false, 0);
                mwVar.setOnScrollListener(new ow(this));
                mwVar.setOnTouchListener(new View.OnTouchListener(this) {
                    public final kz f24098b;

                    {
                        this.f24098b = this;
                    }

                    @Override
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        switch (r3) {
                            case 0:
                                org.telegram.ui.st q6 = org.telegram.ui.st.q();
                                kz kzVar = this.f24098b;
                                vx vxVar2 = kzVar.P;
                                kzVar.getMeasuredHeight();
                                return q6.s(motionEvent, vxVar2, null, kzVar.f25714g2, e6Var);
                            case 1:
                                org.telegram.ui.st q10 = org.telegram.ui.st.q();
                                kz kzVar2 = this.f24098b;
                                return q10.s(motionEvent, kzVar2.f25715h0, kzVar2.m0, kzVar2.f25714g2, e6Var);
                            default:
                                org.telegram.ui.st q11 = org.telegram.ui.st.q();
                                kz kzVar3 = this.f24098b;
                                sw swVar = kzVar3.D0;
                                kzVar3.getMeasuredHeight();
                                return q11.s(motionEvent, swVar, kzVar3.A0, kzVar3.f25714g2, e6Var);
                        }
                    }
                });
                ?? r12 = new zk0(this) {
                    public final kz f24810b;

                    {
                        this.f24810b = this;
                    }

                    @Override
                    public final void d(int i17, View view2) {
                        int i18;
                        String str;
                        switch (r2) {
                            case 0:
                                kz kzVar = this.f24810b;
                                mw mwVar2 = kzVar.f25715h0;
                                py pyVar2 = kzVar.f25721j0;
                                py pyVar3 = kzVar.f25732n0;
                                if (kzVar.f25753t1 != null) {
                                    pyVar3.getClass();
                                    ArrayList arrayList3 = pyVar3.f27192x;
                                    if (mwVar2.getAdapter() == pyVar3) {
                                        if (i17 >= 0) {
                                            int i19 = pyVar3.H;
                                            if (i17 < i19) {
                                                kzVar.f25753t1.v(view2, kzVar.f25719i1.get(i17), null, "gif", true, 0, 0);
                                                return;
                                            }
                                            if (i19 > 0) {
                                                i18 = (i17 - i19) - 1;
                                            } else {
                                                i18 = i17;
                                            }
                                            if (i18 >= 0 && i18 < arrayList3.size()) {
                                                kzVar.f25753t1.v(view2, arrayList3.get(i18), null, pyVar3.f27188n, true, 0, 0);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    } else if (mwVar2.getAdapter() == pyVar2 && i17 >= 0 && i17 < pyVar2.f27192x.size()) {
                                        kzVar.f25753t1.v(view2, pyVar2.f27192x.get(i17), pyVar2.f27191w, pyVar2.f27188n, true, 0, 0);
                                        kzVar.W();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            default:
                                kz kzVar2 = this.f24810b;
                                s4.h0 adapter = kzVar2.D0.getAdapter();
                                fz fzVar = kzVar2.f25773z0;
                                if (adapter == fzVar) {
                                    str = fzVar.N;
                                } else {
                                    str = null;
                                }
                                String str2 = str;
                                if (view2 instanceof org.telegram.ui.Cells.f8) {
                                    org.telegram.ui.Cells.f8 f8Var = (org.telegram.ui.Cells.f8) view2;
                                    if (f8Var.getSticker() != null && MessageObject.isPremiumSticker(f8Var.getSticker()) && !AccountInstance.getInstance(kzVar2.f25700c1).getUserConfig().isPremium()) {
                                        org.telegram.ui.st.q().y(f8Var);
                                        return;
                                    }
                                    org.telegram.ui.st.q().u();
                                    if (!f8Var.f20086r) {
                                        f8Var.f20086r = true;
                                        f8Var.f20085n = 0.5f;
                                        f8Var.f20089x = 0L;
                                        org.telegram.ui.Cells.e8 e8Var = f8Var.f20081a;
                                        e8Var.setAlpha(0.5f * f8Var.H);
                                        e8Var.invalidate();
                                        f8Var.f20087s = System.currentTimeMillis();
                                        f8Var.invalidate();
                                        kzVar2.f25753t1.m(f8Var, f8Var.getSticker(), str2, f8Var.getParentObject(), f8Var.getSendAnimationData(), true, 0);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                };
                this.m0 = r12;
                mwVar.setOnItemClickListener((zk0) r12);
                lwVar.addView(mwVar, w7.x5.c(-1.0f, -1));
                pw pwVar = new pw(this, context2);
                this.f25735o0 = pwVar;
                lwVar.addView(pwVar, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + dp));
                qx qxVar = new qx(this, context2, e6Var);
                this.f25738p0 = qxVar;
                qxVar.setType(hm0Var);
                qxVar.setUnderlineHeight(AndroidUtilities.getShadowHeight());
                i10 = i14;
                qxVar.setIndicatorColor(z(i10));
                qxVar.setUnderlineColor(z(i16));
                qxVar.setBackgroundColor(z(i15));
                V();
                qxVar.setDelegate(new ew(this, 2));
                pyVar.F("", "", true, true, true);
            } else {
                i10 = i14;
            }
            qw qwVar = new qw(this, context2, z14);
            this.f25766x0 = qwVar;
            MediaDataController.getInstance(this.f25700c1).checkStickers(0);
            MediaDataController.getInstance(this.f25700c1).checkFeaturedStickers();
            sw swVar = new sw(this, context2);
            this.D0 = swVar;
            this.f25730m2.a(swVar);
            tw twVar = new tw(this);
            this.E0 = twVar;
            swVar.setLayoutManager(twVar);
            twVar.O = new uw(this);
            swVar.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f));
            swVar.setClipToPadding(false);
            ?? obj3 = new Object();
            obj3.f24477a = 2;
            obj3.f24478b = qwVar;
            this.d.add(obj3);
            this.f25773z0 = new fz(this, context2);
            bz bzVar = new bz(this, context2);
            this.f25770y0 = bzVar;
            swVar.setAdapter(bzVar);
            swVar.setOnTouchListener(new View.OnTouchListener(this) {
                public final kz f24098b;

                {
                    this.f24098b = this;
                }

                @Override
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    switch (r3) {
                        case 0:
                            org.telegram.ui.st q6 = org.telegram.ui.st.q();
                            kz kzVar = this.f24098b;
                            vx vxVar2 = kzVar.P;
                            kzVar.getMeasuredHeight();
                            return q6.s(motionEvent, vxVar2, null, kzVar.f25714g2, e6Var);
                        case 1:
                            org.telegram.ui.st q10 = org.telegram.ui.st.q();
                            kz kzVar2 = this.f24098b;
                            return q10.s(motionEvent, kzVar2.f25715h0, kzVar2.m0, kzVar2.f25714g2, e6Var);
                        default:
                            org.telegram.ui.st q11 = org.telegram.ui.st.q();
                            kz kzVar3 = this.f24098b;
                            sw swVar2 = kzVar3.D0;
                            kzVar3.getMeasuredHeight();
                            return q11.s(motionEvent, swVar2, kzVar3.A0, kzVar3.f25714g2, e6Var);
                    }
                }
            });
            ?? r42 = new zk0(this) {
                public final kz f24810b;

                {
                    this.f24810b = this;
                }

                @Override
                public final void d(int i17, View view2) {
                    int i18;
                    String str;
                    switch (r2) {
                        case 0:
                            kz kzVar = this.f24810b;
                            mw mwVar2 = kzVar.f25715h0;
                            py pyVar2 = kzVar.f25721j0;
                            py pyVar3 = kzVar.f25732n0;
                            if (kzVar.f25753t1 != null) {
                                pyVar3.getClass();
                                ArrayList arrayList3 = pyVar3.f27192x;
                                if (mwVar2.getAdapter() == pyVar3) {
                                    if (i17 >= 0) {
                                        int i19 = pyVar3.H;
                                        if (i17 < i19) {
                                            kzVar.f25753t1.v(view2, kzVar.f25719i1.get(i17), null, "gif", true, 0, 0);
                                            return;
                                        }
                                        if (i19 > 0) {
                                            i18 = (i17 - i19) - 1;
                                        } else {
                                            i18 = i17;
                                        }
                                        if (i18 >= 0 && i18 < arrayList3.size()) {
                                            kzVar.f25753t1.v(view2, arrayList3.get(i18), null, pyVar3.f27188n, true, 0, 0);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                } else if (mwVar2.getAdapter() == pyVar2 && i17 >= 0 && i17 < pyVar2.f27192x.size()) {
                                    kzVar.f25753t1.v(view2, pyVar2.f27192x.get(i17), pyVar2.f27191w, pyVar2.f27188n, true, 0, 0);
                                    kzVar.W();
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        default:
                            kz kzVar2 = this.f24810b;
                            s4.h0 adapter = kzVar2.D0.getAdapter();
                            fz fzVar = kzVar2.f25773z0;
                            if (adapter == fzVar) {
                                str = fzVar.N;
                            } else {
                                str = null;
                            }
                            String str2 = str;
                            if (view2 instanceof org.telegram.ui.Cells.f8) {
                                org.telegram.ui.Cells.f8 f8Var = (org.telegram.ui.Cells.f8) view2;
                                if (f8Var.getSticker() != null && MessageObject.isPremiumSticker(f8Var.getSticker()) && !AccountInstance.getInstance(kzVar2.f25700c1).getUserConfig().isPremium()) {
                                    org.telegram.ui.st.q().y(f8Var);
                                    return;
                                }
                                org.telegram.ui.st.q().u();
                                if (!f8Var.f20086r) {
                                    f8Var.f20086r = true;
                                    f8Var.f20085n = 0.5f;
                                    f8Var.f20089x = 0L;
                                    org.telegram.ui.Cells.e8 e8Var = f8Var.f20081a;
                                    e8Var.setAlpha(0.5f * f8Var.H);
                                    e8Var.invalidate();
                                    f8Var.f20087s = System.currentTimeMillis();
                                    f8Var.invalidate();
                                    kzVar2.f25753t1.m(f8Var, f8Var.getSticker(), str2, f8Var.getParentObject(), f8Var.getSendAnimationData(), true, 0);
                                    return;
                                }
                                return;
                            }
                            return;
                    }
                }
            };
            this.A0 = r42;
            swVar.setOnItemClickListener((zk0) r42);
            swVar.setGlowColor(z(i15));
            qwVar.addView(swVar);
            this.f25692a0 = new ok0(swVar, twVar);
            vw vwVar = new vw(this, context2);
            this.G0 = vwVar;
            qwVar.addView(vwVar, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + dp));
            nh.d dVar2 = new nh.d(context2, e6Var);
            this.H0 = dVar2;
            dVar2.setVisibility(8);
            dVar2.setOnBackClickListener(new View.OnClickListener(this) {
                public final kz f24462b;

                {
                    this.f24462b = this;
                }

                @Override
                public final void onClick(View view2) {
                    xy xyVar;
                    switch (r2) {
                        case 0:
                            jy jyVar = this.f24462b.S;
                            ey eyVar = jyVar.f25447c;
                            int childCount = eyVar.getChildCount();
                            for (int i162 = 0; i162 < childCount; i162++) {
                                ((nh.c) eyVar.getChildAt(i162)).a(false, true);
                            }
                            jyVar.d = 0L;
                            jyVar.F.f25694b.a(false, true);
                            jyVar.l();
                            return;
                        case 1:
                            fz fzVar = this.f24462b.f25773z0;
                            ez ezVar = fzVar.f24119c;
                            int childCount2 = ezVar.getChildCount();
                            for (int i17 = 0; i17 < childCount2; i17++) {
                                ((nh.c) ezVar.getChildAt(i17)).a(false, true);
                            }
                            fzVar.d = 0L;
                            fzVar.Q.f25691a.a(false, true);
                            fzVar.l();
                            return;
                        case 2:
                            ky kyVar = this.f24462b.f25753t1;
                            if (kyVar != null) {
                                kyVar.w();
                                return;
                            }
                            return;
                        default:
                            kz kzVar = this.f24462b;
                            int currentItem = kzVar.h.getCurrentItem();
                            if (currentItem == 0) {
                                xyVar = kzVar.V;
                            } else if (currentItem == 1) {
                                xyVar = kzVar.f25735o0;
                            } else {
                                xyVar = kzVar.G0;
                            }
                            if (xyVar != null) {
                                iq iqVar = xyVar.d;
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
            qwVar.addView(dVar2, new FrameLayout.LayoutParams(-1, dp));
            z18 = z14;
            ww wwVar = new ww(this, context2, e6Var, n2Var, z18);
            this.B0 = wwVar;
            wwVar.setDragEnabled(true);
            wwVar.setWillNotDraw(false);
            wwVar.setType(hm0Var);
            wwVar.setUnderlineHeight(swVar.canScrollVertically(-1) ? AndroidUtilities.getShadowHeight() : 0);
            wwVar.setIndicatorColor(z(i10));
            wwVar.setUnderlineColor(z(i16));
            if (viewGroup != null && z18) {
                xw xwVar = new xw(this, context2);
                this.C0 = xwVar;
                xwVar.addView(wwVar, w7.x5.e(-1, 36, 51));
                viewGroup.addView(xwVar, w7.x5.c(-2.0f, -1));
            } else {
                qwVar.addView(wwVar, w7.x5.e(-1, 36, 51));
            }
            X(true);
            wwVar.setDelegate(new ew(this, 4));
            swVar.setOnScrollListener(new jz(this, 0));
            nh.b bVar2 = new nh.b(context2, e6Var);
            this.N = bVar2;
            ci.n6 n6Var2 = new ci.n6(context2, 3, e6Var);
            this.M = n6Var2;
            n6Var2.setVisibility(8);
            n6Var2.addView(bVar2, w7.x5.d(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
            qwVar.addView(n6Var2, w7.x5.e(-1, -2, 80));
        } else {
            z18 = z14;
        }
        this.e.clear();
        this.e.addAll(this.d);
        yw ywVar = new yw(this, context2);
        this.h = ywVar;
        ki.e eVar2 = this.f25730m2;
        eVar2.getClass();
        ywVar.b(new ai.m7(eVar2, 1));
        ywVar.setOverScrollMode(2);
        dy dyVar = new dy(this);
        this.L0 = dyVar;
        ywVar.setAdapter(dyVar);
        zw zwVar = new zw(this, context2);
        this.f25765x = zwVar;
        zwVar.setHapticFeedbackEnabled(true);
        zwVar.setImageResource(R.drawable.smiles_tab_clear);
        int v = z16 ? v(0.6f) : z(org.telegram.ui.ActionBar.i6.Re);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        zwVar.setColorFilter(new PorterDuffColorFilter(v, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        zwVar.setScaleType(scaleType);
        zwVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
        zwVar.setFocusable(true);
        zwVar.setOnClickListener(new Object());
        w7.z5.a(zwVar);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f25744r = frameLayout;
        if (z13) {
            addView(frameLayout, w7.x5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, (AndroidUtilities.getShadowHeight() / AndroidUtilities.density) + 40.0f));
        } else {
            addView(frameLayout, w7.x5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.f25748s = frameLayout2;
        addView(frameLayout2, w7.x5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 64.0f));
        FrameLayout frameLayout3 = new FrameLayout(context2);
        this.f25731n = frameLayout3;
        View view2 = new View(context2);
        this.v = view2;
        frameLayout3.addView(view2, new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(40.0f), 83));
        if (z13) {
            addView(frameLayout3, w7.x5.e(-1, 48, 80));
            frameLayout3.addView(zwVar, w7.x5.d(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
            if (z11) {
                ImageView imageView = new ImageView(context2);
                this.f25769y = imageView;
                imageView.setImageResource(R.drawable.smiles_tab_settings);
                imageView.setColorFilter(new PorterDuffColorFilter(z16 ? v(0.6f) : z(org.telegram.ui.ActionBar.i6.Re), mode));
                imageView.setScaleType(scaleType);
                imageView.setFocusable(true);
                imageView.setContentDescription(LocaleController.getString(R.string.Settings));
                w7.z5.a(imageView);
                frameLayout3.addView(imageView, w7.x5.d(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
                imageView.setOnClickListener(new View.OnClickListener(this) {
                    public final kz f24462b;

                    {
                        this.f24462b = this;
                    }

                    @Override
                    public final void onClick(View view22) {
                        xy xyVar;
                        switch (r2) {
                            case 0:
                                jy jyVar = this.f24462b.S;
                                ey eyVar = jyVar.f25447c;
                                int childCount = eyVar.getChildCount();
                                for (int i162 = 0; i162 < childCount; i162++) {
                                    ((nh.c) eyVar.getChildAt(i162)).a(false, true);
                                }
                                jyVar.d = 0L;
                                jyVar.F.f25694b.a(false, true);
                                jyVar.l();
                                return;
                            case 1:
                                fz fzVar = this.f24462b.f25773z0;
                                ez ezVar = fzVar.f24119c;
                                int childCount2 = ezVar.getChildCount();
                                for (int i17 = 0; i17 < childCount2; i17++) {
                                    ((nh.c) ezVar.getChildAt(i17)).a(false, true);
                                }
                                fzVar.d = 0L;
                                fzVar.Q.f25691a.a(false, true);
                                fzVar.l();
                                return;
                            case 2:
                                ky kyVar = this.f24462b.f25753t1;
                                if (kyVar != null) {
                                    kyVar.w();
                                    return;
                                }
                                return;
                            default:
                                kz kzVar = this.f24462b;
                                int currentItem = kzVar.h.getCurrentItem();
                                if (currentItem == 0) {
                                    xyVar = kzVar.V;
                                } else if (currentItem == 1) {
                                    xyVar = kzVar.f25735o0;
                                } else {
                                    xyVar = kzVar.G0;
                                }
                                if (xyVar != null) {
                                    iq iqVar = xyVar.d;
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
            dd0 dd0Var = new dd0(context2, e6Var);
            this.f25761w = dd0Var;
            dd0Var.setViewPager(ywVar);
            dd0Var.setShouldExpand(false);
            dd0Var.setIndicatorHeight(AndroidUtilities.dp(3.0f));
            dd0Var.setIndicatorColor(i0.a.k(z(org.telegram.ui.ActionBar.i6.Oe), 20));
            dd0Var.setUnderlineHeight(0);
            dd0Var.setTabPaddingLeftRight(AndroidUtilities.dp(11.0f));
            dd0Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f));
            frameLayout3.addView(dd0Var, w7.x5.e(-2, 48, 81));
            dd0Var.setOnPageChangeListener(new bx(this, z18));
            ImageView imageView2 = new ImageView(context2);
            this.E = imageView2;
            imageView2.setImageResource(R.drawable.smiles_tab_search);
            imageView2.setColorFilter(new PorterDuffColorFilter(z16 ? v(0.6f) : z(org.telegram.ui.ActionBar.i6.Re), mode));
            imageView2.setScaleType(scaleType);
            imageView2.setContentDescription(LocaleController.getString(R.string.Search));
            imageView2.setFocusable(true);
            imageView2.setVisibility(8);
            frameLayout3.addView(imageView2, w7.x5.d(48, 48.0f, 83, 2.0f, 0.0f, 2.0f, 0.0f));
            imageView2.setOnClickListener(new View.OnClickListener(this) {
                public final kz f24462b;

                {
                    this.f24462b = this;
                }

                @Override
                public final void onClick(View view22) {
                    xy xyVar;
                    switch (r2) {
                        case 0:
                            jy jyVar = this.f24462b.S;
                            ey eyVar = jyVar.f25447c;
                            int childCount = eyVar.getChildCount();
                            for (int i162 = 0; i162 < childCount; i162++) {
                                ((nh.c) eyVar.getChildAt(i162)).a(false, true);
                            }
                            jyVar.d = 0L;
                            jyVar.F.f25694b.a(false, true);
                            jyVar.l();
                            return;
                        case 1:
                            fz fzVar = this.f24462b.f25773z0;
                            ez ezVar = fzVar.f24119c;
                            int childCount2 = ezVar.getChildCount();
                            for (int i17 = 0; i17 < childCount2; i17++) {
                                ((nh.c) ezVar.getChildAt(i17)).a(false, true);
                            }
                            fzVar.d = 0L;
                            fzVar.Q.f25691a.a(false, true);
                            fzVar.l();
                            return;
                        case 2:
                            ky kyVar = this.f24462b.f25753t1;
                            if (kyVar != null) {
                                kyVar.w();
                                return;
                            }
                            return;
                        default:
                            kz kzVar = this.f24462b;
                            int currentItem = kzVar.h.getCurrentItem();
                            if (currentItem == 0) {
                                xyVar = kzVar.V;
                            } else if (currentItem == 1) {
                                xyVar = kzVar.f25735o0;
                            } else {
                                xyVar = kzVar.G0;
                            }
                            if (xyVar != null) {
                                iq iqVar = xyVar.d;
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
            addView(frameLayout3, w7.x5.d(56, 48.0f, (LocaleController.isRTL ? 3 : 5) | 80, 0.0f, 0.0f, 2.0f, 0.0f));
            org.telegram.ui.Cells.z h02 = org.telegram.ui.ActionBar.i6.h0(AndroidUtilities.dp(56.0f), z(i15), z(i15));
            w7.z5.a(zwVar);
            zwVar.setPadding(0, 0, AndroidUtilities.dp(2.0f), 0);
            zwVar.setBackground(h02);
            zwVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
            zwVar.setFocusable(true);
            frameLayout3.addView(zwVar, w7.x5.d(48, 48.0f, 51, 2.0f, 0.0f, 2.0f, 0.0f));
            view2.setVisibility(8);
        }
        addView(ywVar, 0, w7.x5.e(-1, -1, 51));
        ai.p4 p4Var = new ai.p4(context2, 22);
        this.N0 = p4Var;
        p4Var.setBackground(org.telegram.ui.ActionBar.i6.b0(AndroidUtilities.dp(6.0f), z(org.telegram.ui.ActionBar.i6.f19079qf)));
        p4Var.setTextColor(z(org.telegram.ui.ActionBar.i6.f19061pf));
        p4Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f));
        p4Var.setGravity(16);
        p4Var.setTextSize(1, 14.0f);
        p4Var.setVisibility(4);
        addView(p4Var, w7.x5.d(-2, -2.0f, 81, 5.0f, 0.0f, 5.0f, 53.0f));
        this.C1 = AndroidUtilities.dp(AndroidUtilities.isTablet() ? 40.0f : 32.0f);
        Field field2 = xu.f30058f;
        xu xuVar = new xu(new wu(context2, e6Var));
        if (xu.f30058f == null) {
            try {
                field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
                try {
                    field.setAccessible(true);
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                field = null;
            }
            xu.f30058f = field;
        }
        Field field3 = xu.f30058f;
        if (field3 != null) {
            try {
                xuVar.f30060a = (ViewTreeObserver.OnScrollChangedListener) field3.get(xuVar);
                xu.f30058f.set(xuVar, xu.f30059g);
            } catch (Exception unused3) {
                xuVar.f30060a = null;
            }
        }
        this.B1 = xuVar;
        xuVar.f30062c.setOnSelectionUpdateListener(new d(this, 10));
        this.A1 = MessagesController.getGlobalEmojiSettings().getInt("selected_page", 0);
        Emoji.loadRecentEmoji();
        sxVar.F(false);
        I(true, z11, z12, false);
        if (Build.VERSION.SDK_INT >= 31) {
            ah.h hVar = new ah.h(false);
            this.f25723j2 = hVar;
            fh.d dVar3 = new fh.d(null);
            dVar3.f9074f = cVar;
            dVar3.d = hVar;
            dVar3.e = -2;
            ah.c cVar2 = new ah.c(dVar3);
            this.f25728l2 = cVar2;
            cVar2.f427i = LiteMode.isEnabled(262144);
            int dp2 = AndroidUtilities.dp(LiteMode.isEnabled(262144) ? 8.0f : 48.0f);
            cVar2.f423b = dp2;
            cVar2.f424c = dp2;
            cVar2.h = this.f25730m2;
        } else {
            ah.c cVar3 = new ah.c(cVar);
            this.f25728l2 = cVar3;
            cVar3.h = this.f25730m2;
            this.f25723j2 = null;
        }
        this.f25726k2 = new jh(this, 1);
        setBlurredBackgroundDrawableFactory(this.f25728l2);
        this.f25730m2.b(this);
        this.f25730m2.f13658a = new ew(this, 0);
    }

    public static void a(kz kzVar, boolean z10) {
        mw mwVar = kzVar.f25715h0;
        if (mwVar != null) {
            int childCount = mwVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = mwVar.getChildAt(i10);
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

    public static void c(kz kzVar, ty tyVar, String str) {
        String str2;
        String str3;
        boolean z10;
        String str4;
        ky kyVar;
        vc vcVar;
        org.telegram.ui.ActionBar.n2 n2Var = kzVar.Y1;
        int i10 = kzVar.f25700c1;
        ArrayList arrayList = kzVar.f25742q1;
        if (tyVar != null) {
            if (tyVar.getSpan() != null) {
                if (kzVar.f25753t1 != null) {
                    long j3 = tyVar.getSpan().documentId;
                    TLRPC.Document document = tyVar.getSpan().document;
                    wx wxVar = tyVar.e;
                    if (wxVar != null && wxVar.f29824i) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (document == null) {
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            wx wxVar2 = (wx) arrayList.get(i11);
                            int i12 = 0;
                            while (true) {
                                ArrayList arrayList2 = wxVar2.f29821c;
                                if (arrayList2 != null && i12 < arrayList2.size()) {
                                    if (((TLRPC.Document) wxVar2.f29821c.get(i12)).f18115id == j3) {
                                        document = (TLRPC.Document) wxVar2.f29821c.get(i12);
                                        break;
                                    }
                                    i12++;
                                }
                            }
                        }
                    }
                    if (document == null) {
                        document = o5.f(i10, j3);
                    }
                    if (document != null) {
                        str4 = MessageObject.findAnimatedEmojiEmoticon(document);
                    } else {
                        str4 = null;
                    }
                    String str5 = str4;
                    if (!MessageObject.isFreeEmoji(document) && !UserConfig.getInstance(i10).isPremium() && (((kyVar = kzVar.f25753t1) == null || !kyVar.g()) && !kzVar.U0 && !z10)) {
                        kzVar.M(false);
                        if (n2Var != null) {
                            vcVar = vc.a0(n2Var);
                        } else {
                            vcVar = new vc(kzVar.f25744r, kzVar.Z1);
                        }
                        if (!kzVar.f25717h2 && n2Var != null) {
                            vcVar.J(R.raw.saved_messages, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint2)), LocaleController.getString(R.string.Open), new dw(kzVar, 4)).j();
                        } else {
                            vcVar.q(document, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint)), LocaleController.getString(R.string.PremiumMore), new dw(kzVar, 3)).j();
                        }
                        kzVar.f25717h2 = !kzVar.f25717h2;
                        return;
                    }
                    kzVar.E2 = SystemClock.elapsedRealtime();
                    kzVar.M(true);
                    kzVar.h("animated_" + j3);
                    kzVar.f25753t1.x(j3, document, str5, tyVar.f28202c);
                    return;
                }
                return;
            }
            kzVar.E2 = SystemClock.elapsedRealtime();
            kzVar.M(true);
            if (str != null) {
                str2 = str;
            } else {
                str2 = (String) tyVar.getTag();
            }
            new SpannableStringBuilder().append((CharSequence) str2);
            if (str == null) {
                if (!tyVar.f28202c && (str3 = Emoji.emojiColor.get(str2)) != null) {
                    str2 = g(str2, str3);
                }
                kzVar.h(str2);
                ky kyVar2 = kzVar.f25753t1;
                if (kyVar2 != null) {
                    kyVar2.l(Emoji.fixEmoji(str2));
                    return;
                }
                return;
            }
            ky kyVar3 = kzVar.f25753t1;
            if (kyVar3 != null) {
                kyVar3.l(Emoji.fixEmoji(str));
            }
        }
    }

    public static void e(kz kzVar, int i10, int i11) {
        s4.c1 K;
        int[] iArr = kzVar.Q0;
        if (i10 == 1) {
            kzVar.n(i11, kzVar.P);
            return;
        }
        ky kyVar = kzVar.f25753t1;
        if ((kyVar == null || !kyVar.z()) && !kzVar.J0) {
            ll0 x10 = kzVar.x(i10);
            if (i11 > 0 && x10 != null && x10.getVisibility() == 0 && (K = x10.K(0)) != null && K.f42671a.getTop() + kzVar.f25696b1 >= x10.getPaddingTop()) {
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
                kzVar.Y();
            } else {
                kzVar.y(i10).setTranslationY(Math.max(-AndroidUtilities.dp(48.0f), iArr[i10]));
            }
        }
    }

    public static void f(kz kzVar, boolean z10) {
        int N0;
        qy qyVar = kzVar.f25718i0;
        pw pwVar = kzVar.f25735o0;
        mw mwVar = kzVar.f25715h0;
        if (mwVar != null && (mwVar.getAdapter() instanceof py)) {
            py pyVar = (py) mwVar.getAdapter();
            if (!pyVar.f27190s && pyVar.h == 0 && !pyVar.f27192x.isEmpty() && (N0 = qyVar.N0()) != -1 && N0 > qyVar.B() - 5) {
                String str = pyVar.f27191w;
                String str2 = pyVar.f27189r;
                boolean z11 = pyVar.v;
                pyVar.F(str, str2, true, z11, z11);
            }
        }
        ky kyVar = kzVar.f25753t1;
        if (kyVar != null && kyVar.z()) {
            boolean z12 = false;
            s4.c1 K = mwVar.K(0);
            if (K == null) {
                xy.a(pwVar, true, !z10);
                return;
            }
            if (K.f42671a.getTop() < mwVar.getPaddingTop()) {
                z12 = true;
            }
            xy.a(pwVar, z12, !z10);
        } else if (pwVar != null && mwVar != null) {
            pwVar.f30081a.a(true, !z10);
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
        String g10 = w.c.g(str, str2);
        if (str3 != null) {
            g10 = w.c.g(g10, str3);
        }
        if (z10) {
            return w.c.g(g10, "\u200d➡");
        }
        return g10;
    }

    public static void j(int i10, View view) {
        if (view == null) {
            return;
        }
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i10);
    }

    public final void A() {
        vw vwVar = this.G0;
        if (vwVar != null) {
            vwVar.b();
        }
        pw pwVar = this.f25735o0;
        if (pwVar != null) {
            pwVar.b();
        }
        jw jwVar = this.V;
        if (jwVar != null) {
            jwVar.b();
        }
    }

    public final void B(boolean z10, boolean z11) {
        wy wyVar;
        boolean z12;
        if (this.A1 != 0 && this.f25763w1) {
            this.A1 = 0;
        }
        if (this.A1 == 0 && this.f25759v1) {
            this.A1 = 1;
        }
        int i10 = this.A1;
        yw ywVar = this.h;
        if (i10 != 0 && !z10 && this.e.size() != 1) {
            int i11 = this.A1;
            if (i11 == 1) {
                L(false, false);
                if (!this.f25755u0 && !this.f25758v0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                Q(z12, false);
                if (ywVar.getCurrentItem() != 2) {
                    ywVar.x(2, false);
                }
                ww wwVar = this.B0;
                if (wwVar != null) {
                    this.S0 = true;
                    int i12 = this.G1;
                    if (i12 >= 0) {
                        wwVar.m(i12);
                    } else {
                        int i13 = this.F1;
                        if (i13 >= 0) {
                            wwVar.m(i13);
                        } else {
                            wwVar.m(this.E1);
                        }
                    }
                    this.S0 = false;
                    this.E0.h1(0, 0);
                }
            } else if (i11 == 2) {
                L(false, false);
                Q(false, false);
                if (ywVar.getCurrentItem() != 1) {
                    ywVar.x(1, false);
                }
                qx qxVar = this.f25738p0;
                if (qxVar != null) {
                    qxVar.m(0);
                }
                pw pwVar = this.f25735o0;
                if (pwVar != null && (wyVar = pwVar.f30086r) != null) {
                    wyVar.F1(null);
                }
            }
        } else {
            L(true, false);
            Q(false, false);
            if (ywVar.getCurrentItem() != 0) {
                ywVar.x(0, !z10);
            }
            if (z11) {
                AndroidUtilities.runOnUIThread(new dw(this, 5), 350L);
            }
        }
        M(true);
    }

    @Override
    public final void D(int i10, float f7, float f10, le.e eVar) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = 4;
        if (i10 == 0) {
            q(false);
            float f11 = 1.0f - this.f25691a.e;
            vw vwVar = this.G0;
            vwVar.setAlpha(f11);
            if (f11 > 0.0f) {
                i13 = 0;
            } else {
                i13 = 4;
            }
            vwVar.setVisibility(i13);
            float f12 = 1.0f - f11;
            nh.d dVar = this.H0;
            dVar.setAlpha(f12);
            dVar.setTranslationY((-AndroidUtilities.dp(15.0f)) * f11);
            int i16 = (f12 > 0.0f ? 1 : (f12 == 0.0f ? 0 : -1));
            if (i16 > 0) {
                i14 = 0;
            } else {
                i14 = 4;
            }
            dVar.setVisibility(i14);
            ci.n6 n6Var = this.M;
            n6Var.setAlpha(f12);
            n6Var.setTranslationY(AndroidUtilities.dp(30.0f) * f11);
            if (i16 > 0) {
                i15 = 0;
            }
            n6Var.setVisibility(i15);
            R();
            this.f25766x0.invalidate();
        } else if (i10 == 1) {
            l(false);
            float f13 = 1.0f - this.f25694b.e;
            jw jwVar = this.V;
            jwVar.setAlpha(f13);
            if (f13 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            jwVar.setVisibility(i11);
            float f14 = 1.0f - f13;
            nh.d dVar2 = this.U;
            dVar2.setAlpha(f14);
            dVar2.setTranslationY((-AndroidUtilities.dp(15.0f)) * f13);
            int i17 = (f14 > 0.0f ? 1 : (f14 == 0.0f ? 0 : -1));
            if (i17 > 0) {
                i12 = 0;
            } else {
                i12 = 4;
            }
            dVar2.setVisibility(i12);
            ci.n6 n6Var2 = this.K;
            n6Var2.setAlpha(f14);
            n6Var2.setTranslationY(AndroidUtilities.dp(30.0f) * f13);
            if (i17 > 0) {
                i15 = 0;
            }
            n6Var2.setVisibility(i15);
            R();
            this.J.invalidate();
        }
    }

    public final void E() {
        bz bzVar = this.f25770y0;
        if (bzVar != null) {
            bzVar.l();
        }
        fz fzVar = this.f25773z0;
        if (fzVar != null) {
            fzVar.l();
        }
        if (org.telegram.ui.st.q().E) {
            org.telegram.ui.st.q().n();
        }
        org.telegram.ui.st.q().u();
    }

    public final void F(int i10) {
        ky kyVar = this.f25753t1;
        if ((kyVar != null && kyVar.z()) || i10 == 0) {
            return;
        }
        HorizontalScrollView y3 = y(i10);
        this.Q0[i10] = 0;
        y3.setTranslationY(0);
    }

    public final void G(int i10, int i11) {
        jx jxVar = this.Q;
        View m10 = jxVar.m(i10);
        int L0 = jxVar.L0();
        int i12 = 1;
        if ((m10 == null && Math.abs(i10 - L0) > jxVar.J * 9.0f) || !SharedConfig.animationsEnabled()) {
            if (jxVar.L0() < i10) {
                i12 = 0;
            }
            ok0 ok0Var = this.f25695b0;
            ok0Var.f26827b = i12;
            ok0Var.c(i10, i11, false, false);
            return;
        }
        this.J0 = true;
        ci.m1 m1Var = new ci.m1(this, this.P.getContext(), 1);
        m1Var.f42821a = i10;
        m1Var.f13104p = i11;
        jxVar.w0(m1Var);
    }

    public final void H(int i10, int i11) {
        tw twVar = this.E0;
        View m10 = twVar.m(i10);
        int L0 = twVar.L0();
        int i12 = 1;
        if (m10 == null && Math.abs(i10 - L0) > 40) {
            if (twVar.L0() < i10) {
                i12 = 0;
            }
            ok0 ok0Var = this.f25692a0;
            ok0Var.f26827b = i12;
            ok0Var.c(i10, i11, false, false);
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
            if (((gz) arrayList2.get(i10)).f24477a == 0 && z10) {
                arrayList.add((gz) arrayList2.get(i10));
            }
            if (((gz) arrayList2.get(i10)).f24477a == 1 && z12) {
                arrayList.add((gz) arrayList2.get(i10));
            }
            if (((gz) arrayList2.get(i10)).f24477a == 2 && z11) {
                arrayList.add((gz) arrayList2.get(i10));
            }
            i10++;
        }
        dd0 dd0Var = this.f25761w;
        if (dd0Var != null) {
            if (arrayList.size() > 1) {
                z14 = true;
            }
            AndroidUtilities.updateViewVisibilityAnimated(dd0Var, z14, 1.0f, z13);
        }
        yw ywVar = this.h;
        if (ywVar != null) {
            ywVar.setAdapter(null);
            ywVar.setAdapter(this.L0);
            if (dd0Var != null) {
                dd0Var.setViewPager(ywVar);
            }
        }
    }

    public final void J(final nh.b bVar, final TLObject tLObject, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final boolean z10, boolean z11) {
        String formatPluralString;
        fz fzVar;
        jy jyVar;
        if (stickerSet != null) {
            if (!z10 || (jyVar = this.S) == null || jyVar.d == stickerSet.f18136id) {
                if (!z10 && (fzVar = this.f25773z0) != null && fzVar.d != stickerSet.f18136id) {
                    return;
                }
                final boolean isStickerPackInstalled = MediaDataController.getInstance(this.f25700c1).isStickerPackInstalled(stickerSet.f18136id);
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
                bVar.f15229h0.a(!isStickerPackInstalled, z11);
                bVar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        int i10;
                        kz kzVar = kz.this;
                        MediaDataController mediaDataController = MediaDataController.getInstance(kzVar.f25700c1);
                        Context context = kzVar.getContext();
                        if (isStickerPackInstalled) {
                            i10 = 0;
                        } else {
                            i10 = 2;
                        }
                        org.telegram.ui.ActionBar.n2 n2Var = kzVar.Y1;
                        FrameLayout frameLayout = kzVar.f25748s;
                        nh.b bVar2 = bVar;
                        TLObject tLObject2 = tLObject;
                        TLRPC.StickerSet stickerSet2 = stickerSet;
                        TLRPC.Document document2 = document;
                        boolean z12 = z10;
                        mediaDataController.toggleStickerSet(context, tLObject2, document2, i10, n2Var, frameLayout, false, true, new i2.b1(kzVar, bVar2, tLObject2, stickerSet2, document2, z12, 9), false);
                        kzVar.J(bVar2, tLObject2, stickerSet2, document2, z12, true);
                    }
                });
            }
        }
    }

    public final void K(long j3, boolean z10, boolean z11) {
        int i10;
        View childAt;
        float f7;
        dd0 dd0Var = this.f25761w;
        if (dd0Var != null) {
            this.f25759v1 = z10;
            this.f25763w1 = z11;
            if (!z11 && !z10) {
                this.f25756u1 = 0L;
            } else {
                this.f25756u1 = j3;
            }
            if (z11) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            LinearLayout linearLayout = dd0Var.d;
            if (i10 >= linearLayout.getChildCount()) {
                childAt = null;
            } else {
                childAt = linearLayout.getChildAt(i10);
            }
            if (childAt != null) {
                if (this.f25756u1 != 0) {
                    f7 = 0.15f;
                } else {
                    f7 = 1.0f;
                }
                childAt.setAlpha(f7);
                yw ywVar = this.h;
                if (z11) {
                    if (this.f25756u1 != 0 && ywVar.getCurrentItem() != 0) {
                        L(true, true);
                        Q(false, true);
                        ywVar.x(0, false);
                    }
                } else if (this.f25756u1 != 0 && ywVar.getCurrentItem() != 1) {
                    L(false, true);
                    Q(false, true);
                    ywVar.x(1, false);
                }
            }
        }
    }

    public final void L(boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        float f12;
        zw zwVar = this.f25765x;
        if (!z10 || zwVar.getTag() != null) {
            if ((!z10 && zwVar.getTag() != null) || this.f25734n2) {
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
            zwVar.setTag(num);
            int i10 = 0;
            float f13 = 0.0f;
            if (z11) {
                if (z10) {
                    zwVar.setVisibility(0);
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.F = animatorSet2;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(zwVar, View.ALPHA, f11);
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(zwVar, View.SCALE_X, f12);
                if (z10) {
                    f13 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(zwVar, View.SCALE_Y, f13));
                this.F.setDuration(200L);
                this.F.setInterpolator(qr.f27421g);
                this.F.addListener(new fx(this, z10, 0));
                this.F.start();
                return;
            }
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            zwVar.setAlpha(f7);
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            zwVar.setScaleX(f10);
            if (z10) {
                f13 = 1.0f;
            }
            zwVar.setScaleY(f13);
            if (!z10) {
                i10 = 4;
            }
            zwVar.setVisibility(i10);
        }
    }

    public final void M(boolean z10) {
        Integer num;
        this.H = 0.0f;
        ky kyVar = this.f25753t1;
        if (kyVar != null && kyVar.z()) {
            z10 = false;
        }
        FrameLayout frameLayout = this.f25731n;
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
                this.W.setInterpolator(qr.f27421g);
                this.W.addListener(new p8(this, 19));
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
            s4.s w10 = w(i10);
            int L0 = w10.L0();
            if (z10) {
                if (L0 == 1 || L0 == 2) {
                    w10.n0(0);
                    F(i10);
                }
            } else if (L0 == 0) {
                w10.h1(0, 0);
            }
        }
    }

    public final void P(boolean z10, boolean z11, boolean z12) {
        float f7;
        float translationY;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.Chat chat = MessagesController.getInstance(this.f25700c1).getChat(Long.valueOf(this.f25756u1));
        if (chat != null) {
            ai.p4 p4Var = this.N0;
            if (z10) {
                if (!ChatObject.hasAdminRights(chat) && (tL_chatBannedRights = chat.default_banned_rights) != null && (tL_chatBannedRights.send_stickers || (z11 && tL_chatBannedRights.send_plain))) {
                    org.telegram.ui.ActionBar.n2 n2Var = this.Y1;
                    if (!(n2Var instanceof org.telegram.ui.bo) || !((org.telegram.ui.bo) n2Var).K6()) {
                        if (z11) {
                            p4Var.setText(LocaleController.getString(R.string.GlobalAttachEmojiRestricted));
                        } else if (z12) {
                            p4Var.setText(LocaleController.getString(R.string.GlobalAttachGifRestricted));
                        } else {
                            p4Var.setText(LocaleController.getString(R.string.GlobalAttachStickersRestricted));
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
                            p4Var.setText(LocaleController.getString(R.string.AttachPlainRestrictedForever));
                        } else if (z12) {
                            p4Var.setText(LocaleController.getString(R.string.AttachGifRestrictedForever));
                        } else {
                            p4Var.setText(LocaleController.getString(R.string.AttachStickersRestrictedForever));
                        }
                    } else {
                        if (z11) {
                            p4Var.setText(LocaleController.formatString("AttachPlainRestricted", R.string.AttachPlainRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                        }
                        if (z12) {
                            p4Var.setText(LocaleController.formatString("AttachGifRestricted", R.string.AttachGifRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                        } else {
                            p4Var.setText(LocaleController.formatString("AttachStickersRestricted", R.string.AttachStickersRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                        }
                    }
                }
                p4Var.setVisibility(0);
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
                f7 = p4Var.getAlpha();
            } else {
                f7 = 1.0f;
            }
            float f11 = 0.0f;
            if (!z10) {
                f10 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(p4Var, View.ALPHA, f7, f10);
            if (z10) {
                translationY = AndroidUtilities.dp(12.0f);
            } else {
                translationY = p4Var.getTranslationY();
            }
            if (!z10) {
                f11 = AndroidUtilities.dp(12.0f);
            }
            animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(p4Var, View.TRANSLATION_Y, translationY, f11));
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
            this.J2.setInterpolator(qr.h);
            this.J2.start();
        }
    }

    public final void Q(boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        float f12;
        ImageView imageView = this.f25769y;
        if (imageView != null && !this.f25737o2) {
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
                        this.G.setInterpolator(qr.f27421g);
                        this.G.addListener(new fx(this, z10, 1));
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
            float f11 = this.f25743q2;
            FrameLayout frameLayout = this.f25731n;
            if (f11 >= 0.0f) {
                f10 += getMeasuredHeight() - this.f25743q2;
            } else if (frameLayout.getTop() - f10 < 0.0f || !this.f25764w2) {
                f10 = 0.0f;
            }
            float lerp = (-f10) + AndroidUtilities.lerp(AndroidUtilities.dp(50.0f), -this.f25740p2, this.F2.e);
            frameLayout.setTranslationY(lerp);
            if (this.f25702d0) {
                this.f25744r.setTranslationY(lerp);
            }
        }
    }

    public final void S() {
        xy xyVar;
        boolean z10;
        int z11;
        int z12;
        int z13;
        int z14;
        int z15;
        int z16;
        int z17;
        int z18;
        yv yvVar;
        int z19;
        int z20;
        int z21;
        int z22;
        int z23;
        int z24;
        int z25;
        int z26;
        int z27;
        boolean z28 = this.f25755u0;
        View view = this.v;
        if (!z28) {
            setBackground(null);
            view.setBackground(null);
        } else if (!AndroidUtilities.isInMultiwindow && !this.N1) {
            int i10 = org.telegram.ui.ActionBar.i6.He;
            setBackgroundColor(z(i10));
            if (this.f25702d0) {
                view.setBackgroundColor(z(i10));
            }
        } else {
            Drawable background = getBackground();
            if (background != null) {
                background.setColorFilter(new PorterDuffColorFilter(z(org.telegram.ui.ActionBar.i6.He), PorterDuff.Mode.MULTIPLY));
            }
        }
        nx nxVar = this.I;
        if (nxVar != null) {
            if (this.f25755u0) {
                nxVar.setBackgroundColor(z(org.telegram.ui.ActionBar.i6.He));
                this.O.setBackgroundColor(z(org.telegram.ui.ActionBar.i6.Ke));
            } else {
                nxVar.setBackground(null);
            }
        }
        xu xuVar = this.B1;
        if (xuVar != null) {
            xuVar.f30062c.a();
        }
        int i11 = 0;
        while (true) {
            xyVar = this.V;
            z10 = this.f25720i2;
            if (i11 >= 3) {
                break;
            }
            if (i11 == 0) {
                xyVar = this.G0;
            } else if (i11 != 1) {
                xyVar = this.f25735o0;
            }
            if (xyVar != null) {
                iq iqVar = xyVar.d;
                FrameLayout frameLayout = xyVar.f30085n;
                View view2 = xyVar.f30084f;
                if (this.f25755u0) {
                    view2.setBackgroundColor(z(org.telegram.ui.ActionBar.i6.He));
                } else {
                    view2.setBackground(null);
                }
                xyVar.e.setBackgroundColor(z(org.telegram.ui.ActionBar.i6.Ke));
                xm0 xm0Var = xyVar.f30083c;
                if (z10) {
                    z24 = v(0.4f);
                } else {
                    z24 = z(org.telegram.ui.ActionBar.i6.Je);
                }
                xm0Var.a(z24);
                Drawable background2 = frameLayout.getBackground();
                if (z10) {
                    z25 = v(0.06f);
                } else {
                    z25 = z(org.telegram.ui.ActionBar.i6.Ie);
                }
                org.telegram.ui.ActionBar.i6.w1(z25, background2);
                frameLayout.invalidate();
                if (z10) {
                    z26 = v(0.45f);
                } else {
                    z26 = z(org.telegram.ui.ActionBar.i6.Je);
                }
                iqVar.setHintTextColor(z26);
                if (z10) {
                    z27 = v(0.8f);
                } else {
                    z27 = z(org.telegram.ui.ActionBar.i6.G6);
                }
                iqVar.setTextColor(z27);
            }
            i11++;
        }
        Paint paint = this.f25750s1;
        if (paint != null) {
            paint.setColor(z(org.telegram.ui.ActionBar.i6.f18786af));
        }
        vx vxVar = this.P;
        if (vxVar != null) {
            vxVar.setGlowColor(z(org.telegram.ui.ActionBar.i6.He));
        }
        sw swVar = this.D0;
        if (swVar != null) {
            swVar.setGlowColor(z(org.telegram.ui.ActionBar.i6.He));
        }
        ww wwVar = this.B0;
        if (wwVar != null) {
            wwVar.setIndicatorColor(z(org.telegram.ui.ActionBar.i6.Qe));
            wwVar.setUnderlineColor(z(org.telegram.ui.ActionBar.i6.Ke));
            if (this.f25755u0) {
                wwVar.setBackgroundColor(z(org.telegram.ui.ActionBar.i6.He));
            } else {
                wwVar.setBackground(null);
            }
        }
        qx qxVar = this.f25738p0;
        if (qxVar != null) {
            qxVar.setIndicatorColor(z(org.telegram.ui.ActionBar.i6.Qe));
            qxVar.setUnderlineColor(z(org.telegram.ui.ActionBar.i6.Ke));
            if (this.f25755u0) {
                qxVar.setBackgroundColor(z(org.telegram.ui.ActionBar.i6.He));
            } else {
                qxVar.setBackground(null);
            }
        }
        zw zwVar = this.f25765x;
        if (zwVar != null) {
            if (z10) {
                z23 = v(0.6f);
            } else {
                z23 = z(org.telegram.ui.ActionBar.i6.Re);
            }
            zwVar.setColorFilter(new PorterDuffColorFilter(z23, PorterDuff.Mode.MULTIPLY));
            if (xyVar == null) {
                Drawable background3 = zwVar.getBackground();
                int i12 = org.telegram.ui.ActionBar.i6.He;
                org.telegram.ui.ActionBar.i6.B1(background3, z(i12), false);
                org.telegram.ui.ActionBar.i6.B1(zwVar.getBackground(), z(i12), true);
            }
        }
        ImageView imageView = this.f25769y;
        if (imageView != null) {
            if (z10) {
                z22 = v(0.6f);
            } else {
                z22 = z(org.telegram.ui.ActionBar.i6.Re);
            }
            imageView.setColorFilter(new PorterDuffColorFilter(z22, PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.E;
        if (imageView2 != null) {
            if (z10) {
                z21 = v(0.6f);
            } else {
                z21 = z(org.telegram.ui.ActionBar.i6.Re);
            }
            imageView2.setColorFilter(new PorterDuffColorFilter(z21, PorterDuff.Mode.MULTIPLY));
        }
        ai.p4 p4Var = this.N0;
        if (p4Var != null) {
            ((ShapeDrawable) p4Var.getBackground()).getPaint().setColor(z(org.telegram.ui.ActionBar.i6.f19079qf));
            p4Var.setTextColor(z(org.telegram.ui.ActionBar.i6.f19061pf));
        }
        py pyVar = this.f25721j0;
        if (pyVar != null) {
            ry ryVar = pyVar.e;
            ImageView imageView3 = ryVar.f27705a;
            int i13 = org.telegram.ui.ActionBar.i6.Le;
            imageView3.setColorFilter(new PorterDuffColorFilter(z(i13), PorterDuff.Mode.MULTIPLY));
            ryVar.f27706b.setTextColor(z(i13));
            ryVar.f27707c.setProgressColor(z(org.telegram.ui.ActionBar.i6.f18905h6));
        }
        this.f25707e2 = new PorterDuffColorFilter(z(org.telegram.ui.ActionBar.i6.Oh), PorterDuff.Mode.SRC_IN);
        int i14 = 0;
        while (true) {
            Drawable[] drawableArr = this.X0;
            if (i14 >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i14];
            if (z10) {
                z19 = v(0.4f);
            } else {
                z19 = z(org.telegram.ui.ActionBar.i6.Ne);
            }
            org.telegram.ui.ActionBar.i6.y1(drawable, z19, false);
            Drawable drawable2 = drawableArr[i14];
            if (z10) {
                z20 = v(0.8f);
            } else {
                z20 = z(org.telegram.ui.ActionBar.i6.Oe);
            }
            org.telegram.ui.ActionBar.i6.y1(drawable2, z20, true);
            i14++;
        }
        if (nxVar != null && (yvVar = nxVar.f23154y) != null) {
            yvVar.d();
        }
        int i15 = 0;
        while (true) {
            Drawable[] drawableArr2 = this.Y0;
            if (i15 >= drawableArr2.length) {
                break;
            }
            Drawable drawable3 = drawableArr2[i15];
            if (z10) {
                z17 = v(0.4f);
            } else {
                z17 = z(org.telegram.ui.ActionBar.i6.Me);
            }
            org.telegram.ui.ActionBar.i6.y1(drawable3, z17, false);
            Drawable drawable4 = drawableArr2[i15];
            if (z10) {
                z18 = v(0.8f);
            } else {
                z18 = z(org.telegram.ui.ActionBar.i6.Oe);
            }
            org.telegram.ui.ActionBar.i6.y1(drawable4, z18, true);
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
                z15 = v(0.4f);
            } else {
                z15 = z(org.telegram.ui.ActionBar.i6.Me);
            }
            org.telegram.ui.ActionBar.i6.y1(drawable5, z15, false);
            Drawable drawable6 = drawableArr3[i16];
            if (z10) {
                z16 = v(0.8f);
            } else {
                z16 = z(org.telegram.ui.ActionBar.i6.Oe);
            }
            org.telegram.ui.ActionBar.i6.y1(drawable6, z16, true);
            i16++;
        }
        org.telegram.ui.ActionBar.u5 u5Var = this.a2;
        if (u5Var != null) {
            if (z10) {
                z13 = v(0.4f);
            } else {
                z13 = z(org.telegram.ui.ActionBar.i6.Ne);
            }
            org.telegram.ui.ActionBar.i6.y1(u5Var, z13, false);
            if (z10) {
                z14 = v(0.8f);
            } else {
                z14 = z(org.telegram.ui.ActionBar.i6.Oe);
            }
            org.telegram.ui.ActionBar.i6.y1(u5Var, z14, true);
        }
        org.telegram.ui.ActionBar.u5 u5Var2 = this.f25697b2;
        if (u5Var2 != null) {
            if (z10) {
                z11 = v(0.4f);
            } else {
                z11 = z(org.telegram.ui.ActionBar.i6.Qe);
            }
            org.telegram.ui.ActionBar.i6.y1(u5Var2, z11, false);
            if (z10) {
                z12 = v(0.8f);
            } else {
                z12 = z(org.telegram.ui.ActionBar.i6.Qe);
            }
            org.telegram.ui.ActionBar.i6.y1(u5Var2, z12, true);
        }
    }

    public final void T() {
        vx vxVar = this.P;
        if (vxVar != null) {
            for (int i10 = 0; i10 < vxVar.getChildCount(); i10++) {
                View childAt = vxVar.getChildAt(i10);
                if (childAt instanceof ay) {
                    ((ay) childAt).a(true);
                }
            }
        }
    }

    public final void U(int i10) {
        int i11;
        if (!this.f25709f0) {
            int i12 = -1;
            if (i10 != -1) {
                int size = getRecentEmoji().size() + (this.f25702d0 ? 1 : 0);
                sx sxVar = this.R;
                int i13 = sxVar.f27983c;
                ArrayList arrayList = sxVar.f27989x;
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
                        ArrayList<wx> emojipacks = getEmojipacks();
                        int size2 = arrayList.size() - 1;
                        while (true) {
                            if (size2 < 0) {
                                break;
                            } else if (((Integer) arrayList.get(size2)).intValue() <= i10) {
                                wx wxVar = (wx) this.f25742q1.get(size2);
                                while (i14 < emojipacks.size()) {
                                    long j3 = emojipacks.get(i14).f29820b.f18136id;
                                    long j10 = wxVar.f29820b.f18136id;
                                    if (j3 == j10 && (!wxVar.f29823g || (!wxVar.f29822f && !this.f25739p1.contains(Long.valueOf(j10))))) {
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
        wy wyVar;
        int i11;
        boolean z12;
        boolean z13;
        qx qxVar = this.f25738p0;
        int currentPosition = qxVar.getCurrentPosition();
        int i12 = this.f25745r0;
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
        boolean isEmpty = this.f25719i1.isEmpty();
        qxVar.d(false);
        this.f25745r0 = -2;
        this.f25749s0 = -2;
        this.f25752t0 = -2;
        Drawable[] drawableArr = this.Z0;
        if (!isEmpty) {
            this.f25745r0 = 0;
            qxVar.b(0, drawableArr[0]).setContentDescription(LocaleController.getString(R.string.RecentStickers));
            i10 = 1;
        } else {
            i10 = 0;
        }
        this.f25749s0 = i10;
        qxVar.b(1, drawableArr[1]).setContentDescription(LocaleController.getString(R.string.FeaturedGifs));
        this.f25752t0 = i10 + 1;
        AndroidUtilities.dp(13.0f);
        AndroidUtilities.dp(11.0f);
        int i13 = this.f25700c1;
        ArrayList<String> arrayList = MessagesController.getInstance(i13).gifSearchEmojies;
        int size = arrayList.size();
        int i14 = 0;
        while (i14 < size) {
            String str = arrayList.get(i14);
            Emoji.EmojiDrawable emojiDrawable = Emoji.getEmojiDrawable(str);
            if (emojiDrawable != null) {
                TLRPC.Document emojiAnimatedSticker = MediaDataController.getInstance(i13).getEmojiAnimatedSticker(str);
                String i15 = hg.c.i(i14 + 3, "tab");
                int i16 = qxVar.f25086x;
                qxVar.f25086x = i16 + 1;
                dx0 dx0Var = (dx0) qxVar.f25076n.get(i15);
                if (dx0Var != null) {
                    qxVar.g(i15, dx0Var, i16);
                    i11 = currentPosition;
                    z12 = z11;
                } else {
                    i11 = currentPosition;
                    z12 = z11;
                    dx0Var = new dx0(qxVar.getContext(), 2);
                    dx0Var.setFocusable(true);
                    dx0Var.setOnClickListener(new bm0(qxVar, 2));
                    dx0Var.setExpanded(qxVar.f25069f0);
                    dx0Var.a(qxVar.f25072i0);
                    qxVar.e.addView(dx0Var, i16);
                }
                dx0Var.d = false;
                dx0Var.setTag(R.id.index_tag, Integer.valueOf(i16));
                dx0Var.setTag(R.id.parent_tag, emojiDrawable);
                dx0Var.setTag(R.id.object_tag, emojiAnimatedSticker);
                if (i16 == qxVar.f25087y) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                dx0Var.setSelected(z13);
                qxVar.h.put(i15, dx0Var);
                dx0Var.setContentDescription(str);
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
        qxVar.h();
        qxVar.q();
        if (z10 && isEmpty) {
            qxVar.m(this.f25749s0);
            pw pwVar = this.f25735o0;
            if (pwVar != null && (wyVar = pwVar.f30086r) != null) {
                wyVar.F1(null);
                return;
            }
            return;
        }
        WeakHashMap weakHashMap = r0.i0.f41839a;
        if (qxVar.isLaidOut()) {
            if (!isEmpty && !z14) {
                qxVar.k(i17 + 1, 0);
            } else if (isEmpty && z14) {
                qxVar.k(i17 - 1, 0);
            }
        }
    }

    public final void W() {
        py pyVar;
        int size = this.f25719i1.size();
        long calcDocumentsHash = MediaDataController.calcDocumentsHash(this.f25719i1, Integer.MAX_VALUE);
        ArrayList<TLRPC.Document> recentGifs = MediaDataController.getInstance(this.f25700c1).getRecentGifs();
        this.f25719i1 = recentGifs;
        long calcDocumentsHash2 = MediaDataController.calcDocumentsHash(recentGifs, Integer.MAX_VALUE);
        if ((this.f25738p0 != null && size == 0 && !this.f25719i1.isEmpty()) || (size != 0 && this.f25719i1.isEmpty())) {
            V();
        }
        if ((size != this.f25719i1.size() || calcDocumentsHash != calcDocumentsHash2) && (pyVar = this.f25732n0) != null) {
            pyVar.l();
        }
    }

    public final void X(boolean z10) {
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
        ww wwVar = this.B0;
        if (wwVar != null) {
            cc1 cc1Var = wwVar.e;
            if (wwVar.f25083s != null) {
                return;
            }
            this.F1 = -2;
            this.G1 = -2;
            this.H1 = -2;
            this.I1 = -2;
            this.f25705e0 = false;
            this.E1 = 0;
            int currentPosition = wwVar.getCurrentPosition();
            boolean z16 = true;
            if (getParent() != null && getVisibility() == 0 && (this.f25771y1.size() != 0 || this.f25774z1.size() != 0)) {
                z11 = true;
            } else {
                z11 = false;
            }
            wwVar.d(z11);
            int i11 = this.f25700c1;
            MediaDataController mediaDataController = MediaDataController.getInstance(i11);
            SharedPreferences emojiSettings = MessagesController.getEmojiSettings(i11);
            ArrayList arrayList3 = this.f25729m1;
            arrayList3.clear();
            ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = mediaDataController.getFeaturedStickerSets();
            int size = featuredStickerSets.size();
            for (int i12 = 0; i12 < size; i12++) {
                TLRPC.StickerSetCovered stickerSetCovered = featuredStickerSets.get(i12);
                if (!mediaDataController.isStickerPackInstalled(stickerSetCovered.set.f18136id)) {
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
            if (!isEmpty && (arrayList3.isEmpty() || emojiSettings.getLong("featured_hidden", 0L) == featuredStickerSets.get(0).set.f18136id)) {
                if (mediaDataController.getUnreadStickerSets().isEmpty()) {
                    i10 = 2;
                } else {
                    i10 = 3;
                }
                dx0 c10 = wwVar.c(i10, drawableArr[i10]);
                c10.h.setText(LocaleController.getString(R.string.FeaturedStickersShort));
                c10.setContentDescription(LocaleController.getString(R.string.FeaturedStickers));
                int i13 = this.E1;
                this.H1 = i13;
                this.E1 = i13 + 1;
            }
            if (!this.f25725k1.isEmpty()) {
                int i14 = this.E1;
                this.G1 = i14;
                this.E1 = i14 + 1;
                dx0 c11 = wwVar.c(1, drawableArr[1]);
                c11.h.setText(LocaleController.getString(R.string.FavoriteStickersShort));
                c11.setContentDescription(LocaleController.getString(R.string.FavoriteStickers));
            }
            if (!this.f25722j1.isEmpty()) {
                int i15 = this.E1;
                this.F1 = i15;
                this.E1 = i15 + 1;
                dx0 c12 = wwVar.c(0, drawableArr[0]);
                c12.h.setText(LocaleController.getString(R.string.RecentStickersShort));
                c12.setContentDescription(LocaleController.getString(R.string.RecentStickers));
            }
            ArrayList arrayList4 = this.f25703d1;
            arrayList4.clear();
            org.telegram.ui.ActionBar.e6 e6Var = null;
            this.f25716h1 = null;
            this.f25710f1 = -1;
            this.f25706e1 = -10;
            if (this.G2 == null || z10) {
                this.G2 = new ArrayList(mediaDataController.getStickerSets(0));
            }
            ArrayList<TLRPC.TL_messages_stickerSet> arrayList5 = this.G2;
            int i16 = 0;
            while (true) {
                TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.f25767x1;
                if (i16 >= stickerSetCoveredArr.length) {
                    break;
                }
                TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCoveredArr[i16];
                long j10 = j3;
                if (stickerSetCovered2 != null) {
                    TLRPC.TL_messages_stickerSet stickerSetById = mediaDataController.getStickerSetById(stickerSetCovered2.set.f18136id);
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
                long j12 = MessagesController.getEmojiSettings(i11).getLong("group_hide_stickers_" + this.J1.f18110id, -1L);
                TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(this.J1.f18110id));
                if (chat != null && this.J1.stickerset != null && ChatObject.hasAdminRights(chat)) {
                    TLRPC.StickerSet stickerSet3 = this.J1.stickerset;
                    if (stickerSet3 != null) {
                        if (j12 == stickerSet3.f18136id) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        this.f25713g1 = z15;
                    }
                } else {
                    if (j12 != -1) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    this.f25713g1 = z14;
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
                        if (this.f25713g1) {
                            this.f25706e1 = arrayList4.size();
                            arrayList4.add(tL_messages_stickerSet3);
                        } else {
                            this.f25706e1 = 0;
                            arrayList4.add(0, tL_messages_stickerSet3);
                        }
                        if (!this.J1.can_set_stickers) {
                            tL_messages_stickerSet3 = null;
                        }
                        this.f25716h1 = tL_messages_stickerSet3;
                    }
                } else if (chatFull.can_set_stickers) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = new TLRPC.TL_messages_stickerSet();
                    if (this.f25713g1) {
                        this.f25706e1 = arrayList4.size();
                        arrayList4.add(tL_messages_stickerSet4);
                    } else {
                        this.f25706e1 = 0;
                        arrayList4.add(0, tL_messages_stickerSet4);
                    }
                }
            }
            int i18 = 0;
            while (i18 < arrayList4.size()) {
                if (i18 == this.f25706e1) {
                    TLRPC.Chat chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(this.J1.f18110id));
                    if (chat2 == null) {
                        arrayList4.remove(0);
                        i18--;
                    } else {
                        this.f25705e0 = z16;
                        String str = "chat" + chat2.f18109id;
                        int i19 = wwVar.f25086x;
                        wwVar.f25086x = i19 + 1;
                        dx0 dx0Var = (dx0) wwVar.f25076n.get(str);
                        if (dx0Var != null) {
                            wwVar.g(str, dx0Var, i19);
                        } else {
                            dx0Var = new dx0(wwVar.getContext(), 0);
                            dx0Var.setFocusable(z16);
                            dx0Var.setOnClickListener(new bm0(wwVar, 0));
                            cc1Var.addView(dx0Var, i19);
                            dx0Var.f23411w = z16;
                            f9 f9Var = new f9(e6Var);
                            f9Var.u(AndroidUtilities.dp(14.0f));
                            f9Var.k(UserConfig.selectedAccount, chat2);
                            int i20 = wwVar.f25060a;
                            u9 u9Var = dx0Var.e;
                            u9Var.setLayerNum(i20);
                            u9Var.e(chat2, f9Var);
                            u9Var.setAspectFit(z16);
                            dx0Var.setExpanded(wwVar.f25069f0);
                            dx0Var.a(wwVar.f25072i0);
                            dx0Var.h.setText(chat2.title);
                        }
                        dx0Var.d = z16;
                        dx0Var.setTag(R.id.index_tag, Integer.valueOf(i19));
                        if (i19 == wwVar.f25087y) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        dx0Var.setSelected(z13);
                        wwVar.h.put(str, dx0Var);
                    }
                } else {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet5 = (TLRPC.TL_messages_stickerSet) arrayList4.get(i18);
                    TLRPC.StickerSet stickerSet5 = tL_messages_stickerSet5.set;
                    if (stickerSet5 != null && stickerSet5.thumb_document_id != j11) {
                        for (int i21 = 0; i21 < tL_messages_stickerSet5.documents.size(); i21++) {
                            document = tL_messages_stickerSet5.documents.get(i21);
                            if (document != null && tL_messages_stickerSet5.set.thumb_document_id == document.f18115id) {
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
                    String str2 = "set" + tL_messages_stickerSet5.set.f18136id;
                    int i22 = wwVar.f25086x;
                    wwVar.f25086x = i22 + 1;
                    dx0 dx0Var2 = (dx0) wwVar.f25076n.get(str2);
                    if (dx0Var2 != null) {
                        wwVar.g(str2, dx0Var2, i22);
                    } else {
                        dx0Var2 = new dx0(wwVar.getContext(), 0);
                        dx0Var2.setFocusable(z16);
                        dx0Var2.setOnClickListener(new bm0(wwVar, 1));
                        dx0Var2.setExpanded(wwVar.f25069f0);
                        dx0Var2.a(wwVar.f25072i0);
                        cc1Var.addView(dx0Var2, i22);
                    }
                    dx0Var2.e.setLayerNum(wwVar.f25060a);
                    dx0Var2.d = false;
                    dx0Var2.setTag(closestPhotoSizeWithSize);
                    dx0Var2.setTag(R.id.index_tag, Integer.valueOf(i22));
                    dx0Var2.setTag(R.id.parent_tag, tL_messages_stickerSet5);
                    dx0Var2.setTag(R.id.object_tag, document);
                    if (i22 == wwVar.f25087y) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    dx0Var2.setSelected(z12);
                    wwVar.h.put(str2, dx0Var2);
                    dx0Var2.setContentDescription(tL_messages_stickerSet5.set.title + ", " + LocaleController.getString(R.string.AccDescrStickerSet));
                }
                i18++;
                z16 = true;
                e6Var = null;
            }
            wwVar.h();
            wwVar.q();
            if (currentPosition != 0) {
                wwVar.k(currentPosition, currentPosition);
            }
            o();
        }
    }

    public final void Y() {
        boolean z10;
        int i10;
        xw xwVar = this.C0;
        ww wwVar = this.B0;
        if (wwVar != null && xwVar == null && this.f25753t1 != null) {
            wwVar.setTranslationY(this.f25753t1.p() * (-AndroidUtilities.dp(50.0f)));
        }
        if (xwVar == null) {
            return;
        }
        if (getVisibility() == 0 && this.K0 && this.f25753t1.p() != 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        xwVar.setVisibility(i10);
        if (z10) {
            Rect rect = this.f25768x2;
            rect.setEmpty();
            this.h.getChildVisibleRect(this.f25766x0, rect, null);
            float p5 = this.f25753t1.p() * AndroidUtilities.dp(50.0f);
            int i11 = rect.left;
            if (i11 != 0 || p5 != 0.0f) {
                this.X1 = false;
            }
            xwVar.setTranslationX(i11);
            float translationY = (((getTranslationY() + getTop()) - xwVar.getTop()) - wwVar.getExpandedOffset()) - p5;
            if (xwVar.getTranslationY() != translationY) {
                xwVar.setTranslationY(translationY);
                xwVar.invalidate();
            }
        }
        if (this.X1 && z10 && this.P0) {
            wwVar.i(this.W1, true);
            return;
        }
        this.X1 = false;
        wwVar.i(this.W1, false);
    }

    public final void Z() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        org.telegram.ui.Cells.s3 s3Var;
        LongSparseArray longSparseArray = this.f25774z1;
        LongSparseArray longSparseArray2 = this.f25771y1;
        int i10 = this.f25700c1;
        sw swVar = this.D0;
        if (swVar != null) {
            try {
                int childCount = swVar.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = swVar.getChildAt(i11);
                    if ((childAt instanceof org.telegram.ui.Cells.s3) && ((vk0) swVar.T(childAt)) != null) {
                        org.telegram.ui.Cells.s3 s3Var2 = (org.telegram.ui.Cells.s3) childAt;
                        ArrayList<Long> unreadStickerSets = MediaDataController.getInstance(i10).getUnreadStickerSets();
                        TLRPC.StickerSetCovered stickerSet = s3Var2.getStickerSet();
                        if (unreadStickerSets != null && unreadStickerSets.contains(Long.valueOf(stickerSet.set.f18136id))) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        int i12 = 0;
                        while (true) {
                            TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.f25767x1;
                            if (i12 < stickerSetCoveredArr.length) {
                                TLRPC.StickerSetCovered stickerSetCovered = stickerSetCoveredArr[i12];
                                if (stickerSetCovered != null) {
                                    s3Var = s3Var2;
                                    if (stickerSetCovered.set.f18136id == stickerSet.set.f18136id) {
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
                            MediaDataController.getInstance(i10).markFeaturedStickersByIdAsRead(false, stickerSet.set.f18136id);
                        }
                        if (longSparseArray2.indexOfKey(stickerSet.set.f18136id) >= 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (longSparseArray.indexOfKey(stickerSet.set.f18136id) >= 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z12 || z13) {
                            if (z12 && s3Var2.f20937r) {
                                longSparseArray2.remove(stickerSet.set.f18136id);
                                z12 = false;
                            } else if (z13 && !s3Var2.f20937r) {
                                longSparseArray.remove(stickerSet.set.f18136id);
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
    public final void b(int i10) {
        setBottomInset(i10);
    }

    @Override
    public final void d(float f7) {
        this.f25743q2 = f7;
        R();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        Utilities.Callback callback;
        TLRPC.StickerSet stickerSet;
        int i12 = NotificationCenter.stickersDidLoad;
        sx sxVar = this.R;
        dw dwVar = this.L2;
        if (i10 == i12) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (this.f25770y0 != null) {
                    X(((Boolean) objArr[1]).booleanValue());
                    Z();
                    E();
                    o();
                }
            } else if (((Integer) objArr[0]).intValue() == 5) {
                if (((Boolean) objArr[1]).booleanValue()) {
                    AndroidUtilities.cancelRunOnUIThread(dwVar);
                    AndroidUtilities.runOnUIThread(dwVar, 100L);
                    return;
                }
                sxVar.F(false);
            }
        } else if (i10 == NotificationCenter.groupPackUpdated) {
            long longValue = ((Long) objArr[0]).longValue();
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            TLRPC.ChatFull chatFull = this.J1;
            if (chatFull != null && chatFull.f18110id == longValue && booleanValue) {
                sxVar.F(true);
            }
        } else if (i10 == NotificationCenter.recentDocumentsDidLoad) {
            boolean booleanValue2 = ((Boolean) objArr[0]).booleanValue();
            int intValue = ((Integer) objArr[1]).intValue();
            if (booleanValue2 || intValue == 0 || intValue == 2) {
                k(booleanValue2);
            }
        } else if (i10 == NotificationCenter.featuredStickersDidLoad) {
            Z();
            dd0 dd0Var = this.f25761w;
            if (dd0Var != null) {
                int childCount = dd0Var.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    dd0Var.getChildAt(i13).invalidate();
                }
            }
            X(false);
        } else if (i10 == NotificationCenter.featuredEmojiDidLoad) {
            if (sxVar != null) {
                sxVar.F(false);
            }
        } else {
            int i14 = NotificationCenter.groupStickersDidLoad;
            jy jyVar = this.S;
            if (i10 == i14) {
                Long l4 = (Long) objArr[0];
                long longValue2 = l4.longValue();
                if (objArr.length > 1) {
                    tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) objArr[1];
                } else {
                    tL_messages_stickerSet = null;
                }
                if (tL_messages_stickerSet != null) {
                    fz fzVar = this.f25773z0;
                    if (fzVar != null && fzVar.d == longValue2 && fzVar.f24120f.size() < tL_messages_stickerSet.documents.size()) {
                        fzVar.f24120f = tL_messages_stickerSet.documents;
                        fzVar.l();
                    }
                    if (jyVar != null && jyVar.d == longValue2 && jyVar.f25448f.size() < tL_messages_stickerSet.documents.size()) {
                        jyVar.f25448f = tL_messages_stickerSet.documents;
                        jyVar.l();
                    }
                }
                TLRPC.ChatFull chatFull2 = this.J1;
                if (chatFull2 != null && (stickerSet = chatFull2.stickerset) != null && stickerSet.f18136id == longValue2) {
                    X(false);
                }
                HashMap hashMap = this.f25746r1;
                if (hashMap.containsKey(l4) && objArr.length >= 2 && ((Utilities.Callback) hashMap.get(l4)) != null && tL_messages_stickerSet != null && (callback = (Utilities.Callback) hashMap.remove(l4)) != null) {
                    callback.run(tL_messages_stickerSet);
                }
                AndroidUtilities.cancelRunOnUIThread(dwVar);
                AndroidUtilities.runOnUIThread(dwVar, 100L);
                return;
            }
            int i15 = NotificationCenter.emojiLoaded;
            vx vxVar = this.P;
            if (i10 == i15) {
                sw swVar = this.D0;
                if (swVar != null) {
                    int childCount2 = swVar.getChildCount();
                    for (int i16 = 0; i16 < childCount2; i16++) {
                        View childAt = swVar.getChildAt(i16);
                        if ((childAt instanceof org.telegram.ui.Cells.o8) || (childAt instanceof org.telegram.ui.Cells.f8)) {
                            childAt.invalidate();
                        }
                    }
                }
                if (vxVar != null) {
                    vxVar.invalidate();
                    int childCount3 = vxVar.getChildCount();
                    for (int i17 = 0; i17 < childCount3; i17++) {
                        View childAt2 = vxVar.getChildAt(i17);
                        if (childAt2 instanceof ty) {
                            childAt2.invalidate();
                        }
                    }
                }
                xu xuVar = this.B1;
                if (xuVar != null) {
                    xuVar.f30062c.invalidate();
                }
                qx qxVar = this.f25738p0;
                if (qxVar != null) {
                    cc1 cc1Var = qxVar.e;
                    int childCount4 = cc1Var.getChildCount();
                    for (int i18 = 0; i18 < childCount4; i18++) {
                        cc1Var.getChildAt(i18).invalidate();
                    }
                }
            } else if (i10 == NotificationCenter.newEmojiSuggestionsAvailable) {
                if (vxVar != null && this.f25702d0) {
                    if ((this.V.f30083c.f30008k == 2 || vxVar.getAdapter() == jyVar) && !TextUtils.isEmpty(jyVar.v)) {
                        jyVar.F(jyVar.v, true);
                    }
                }
            } else if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                if (sxVar != null) {
                    sxVar.F(false);
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
            if (this.f25731n.getVisibility() != 8 && !this.f25755u0 && this.f25762w0) {
                canvas.drawColor(i0.a.k(-1, 25));
            }
            boolean drawChild = super.drawChild(canvas, view, j3);
            float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(this.f25740p2);
            if (navigationBarThirdButtonsFactor > 0.0f) {
                int l1 = org.telegram.ui.ActionBar.i6.l1(navigationBarThirdButtonsFactor, z(org.telegram.ui.ActionBar.i6.He));
                int i10 = this.B2;
                GradientDrawable gradientDrawable = this.A2;
                if (i10 != l1) {
                    gradientDrawable.setColors(new int[]{l1, org.telegram.ui.ActionBar.i6.l1(0.66f, l1), i0.a.k(l1, 0)});
                    this.B2 = l1;
                }
                gradientDrawable.setBounds(0, getMeasuredHeight() - this.f25740p2, getMeasuredWidth(), getMeasuredHeight());
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

    public ArrayList<wx> getEmojipacks() {
        ArrayList<wx> arrayList = new ArrayList<>();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f25742q1;
            if (i10 < arrayList2.size()) {
                wx wxVar = (wx) arrayList2.get(i10);
                boolean z10 = wxVar.f29823g;
                ArrayList arrayList3 = this.f25739p1;
                if ((!z10 && (wxVar.f29822f || arrayList3.contains(Long.valueOf(wxVar.f29820b.f18136id)))) || (wxVar.f29823g && !wxVar.f29822f && !arrayList3.contains(Long.valueOf(wxVar.f29820b.f18136id)))) {
                    arrayList.add(wxVar);
                }
                i10++;
            } else {
                return arrayList;
            }
        }
    }

    public ArrayList<String> getRecentEmoji() {
        if (this.f25701c2) {
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
        ww wwVar = this.B0;
        if (wwVar == null) {
            return 0.0f;
        }
        return wwVar.getExpandedOffset();
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
                if (!this.f25701c2) {
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
        if (i10 == 2 || x(i10).K(0) == null) {
            return;
        }
        gx gxVar = new gx(getContext(), i11);
        gxVar.f42821a = !z10 ? 1 : 0;
        w(i10).w0(gxVar);
    }

    public final void k(boolean z10) {
        if (z10) {
            W();
            return;
        }
        int size = this.f25722j1.size();
        int size2 = this.f25725k1.size();
        int i10 = this.f25700c1;
        this.f25722j1 = MediaDataController.getInstance(i10).getRecentStickers(0, true);
        this.f25725k1 = MediaDataController.getInstance(i10).getRecentStickers(2);
        if (UserConfig.getInstance(i10).isPremium()) {
            this.l1 = MediaDataController.getInstance(i10).getRecentStickers(7);
        } else {
            this.l1 = new ArrayList();
        }
        for (int i11 = 0; i11 < this.f25725k1.size(); i11++) {
            TLRPC.Document document = (TLRPC.Document) this.f25725k1.get(i11);
            int i12 = 0;
            while (true) {
                if (i12 < this.f25722j1.size()) {
                    TLRPC.Document document2 = (TLRPC.Document) this.f25722j1.get(i12);
                    if (document2.dc_id == document.dc_id && document2.f18115id == document.f18115id) {
                        this.f25722j1.remove(i12);
                        break;
                    }
                    i12++;
                }
            }
        }
        if (MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            int i13 = 0;
            while (i13 < this.f25725k1.size()) {
                if (MessageObject.isPremiumSticker((TLRPC.Document) this.f25725k1.get(i13))) {
                    this.f25725k1.remove(i13);
                    i13--;
                }
                i13++;
            }
            int i14 = 0;
            while (i14 < this.f25722j1.size()) {
                if (MessageObject.isPremiumSticker((TLRPC.Document) this.f25722j1.get(i14))) {
                    this.f25722j1.remove(i14);
                    i14--;
                }
                i14++;
            }
        }
        if (size != this.f25722j1.size() || size2 != this.f25725k1.size()) {
            X(false);
        }
        bz bzVar = this.f25770y0;
        if (bzVar != null) {
            bzVar.l();
        }
        o();
    }

    public final void l(boolean z10) {
        int i10;
        boolean z11;
        ky kyVar = this.f25753t1;
        le.b bVar = this.f25694b;
        vx vxVar = this.P;
        jw jwVar = this.V;
        if (kyVar != null && kyVar.z()) {
            s4.c1 K = vxVar.K(0);
            if (K == null) {
                xy.a(jwVar, true, !z10);
            } else {
                if (K.f42671a.getTop() < vxVar.getPaddingTop()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                xy.a(jwVar, z11, !z10);
            }
            N(false, !z10);
            jwVar.setTranslationY(bVar.e * AndroidUtilities.dp(15.0f));
        } else if (jwVar != null && vxVar != null) {
            s4.c1 K2 = vxVar.K(0);
            if (K2 != null) {
                i10 = K2.f42671a.getTop();
            } else {
                i10 = -this.f25696b1;
            }
            jwVar.setTranslationY((bVar.e * AndroidUtilities.dp(15.0f)) + i10);
            jwVar.f30081a.a(false, !z10);
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
        if (dp > 0 && (K == null || K.f42671a.getBottom() < dp)) {
            z10 = true;
        }
        N(z10, !this.K1);
    }

    public final void n(int i10, View view) {
        vx vxVar;
        s4.c1 K;
        int i11;
        nx nxVar = this.I;
        int[] iArr = this.Q0;
        if (view == null) {
            iArr[1] = 0;
            nxVar.setTranslationY(0);
        } else if (view.getVisibility() == 0 && !this.f25709f0) {
            ky kyVar = this.f25753t1;
            if (kyVar == null || !kyVar.z()) {
                if (i10 > 0 && (vxVar = this.P) != null && vxVar.getVisibility() == 0 && (K = vxVar.K(0)) != null) {
                    int top = K.f42671a.getTop();
                    if (this.f25702d0) {
                        i11 = this.f25696b1;
                    } else {
                        i11 = 0;
                    }
                    if (top + i11 >= vxVar.getPaddingTop()) {
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
                nxVar.setTranslationY(Math.max(-AndroidUtilities.dp(36.0f), iArr[1]));
            }
        }
    }

    public final void o() {
        int L0;
        ww wwVar = this.B0;
        if (wwVar != null && (L0 = this.E0.L0()) != -1) {
            int i10 = this.G1;
            if (i10 <= 0 && (i10 = this.F1) <= 0) {
                i10 = this.E1;
            }
            wwVar.k(this.f25770y0.F(L0), i10);
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
        NotificationCenter.ObserversGroup add = NotificationCenter.getInstance(this.f25700c1).createWeakObserversGroup(this).addGlobal(NotificationCenter.emojiLoaded).add(NotificationCenter.newEmojiSuggestionsAvailable).add(NotificationCenter.groupPackUpdated);
        this.I2 = add;
        if (this.f25770y0 != null) {
            add.add(NotificationCenter.stickersDidLoad).add(NotificationCenter.recentDocumentsDidLoad).add(NotificationCenter.featuredStickersDidLoad).add(NotificationCenter.groupStickersDidLoad).add(NotificationCenter.currentUserPremiumStatusChanged);
            AndroidUtilities.runOnUIThread(new dw(this, 0));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        xu xuVar = this.B1;
        if (xuVar != null && xuVar.isShowing()) {
            xuVar.dismiss();
        }
        org.telegram.ui.st q6 = org.telegram.ui.st.q();
        if (q6.f37473l == this.f25714g2) {
            q6.W = null;
            q6.f37461a0 = null;
            q6.Y = null;
            q6.f37473l = null;
            q6.f37465c0 = null;
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
        boolean z11 = this.f25702d0;
        if (!z10 && !this.N1) {
            if (this.L1 != 0) {
                if (!this.H2) {
                    setOutlineProvider(null);
                    setClipToOutline(false);
                    setElevation(0.0f);
                }
                if (this.f25755u0) {
                    int i12 = org.telegram.ui.ActionBar.i6.He;
                    setBackgroundColor(z(i12));
                    if (z11) {
                        view.setBackgroundColor(z(i12));
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
            int i13 = org.telegram.ui.ActionBar.i6.He;
            background.setColorFilter(new PorterDuffColorFilter(z(i13), PorterDuff.Mode.MULTIPLY));
            if (z11 && this.f25755u0) {
                view.setBackgroundColor(z(i13));
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
                this.B0.k(this.f25770y0.F(L02), i12);
            }
        } else if (i10 == 2) {
            s4.h0 adapter = this.f25715h0.getAdapter();
            py pyVar = this.f25732n0;
            if (adapter == pyVar && pyVar.I >= 0 && this.f25749s0 >= 0 && this.f25745r0 >= 0 && (L0 = this.f25718i0.L0()) != -1) {
                if (L0 >= pyVar.I) {
                    i11 = this.f25749s0;
                } else {
                    i11 = this.f25745r0;
                }
                this.f25738p0.k(i11, 0);
            }
        }
    }

    public final void q(boolean z10) {
        int i10;
        ky kyVar = this.f25753t1;
        le.b bVar = this.f25691a;
        sw swVar = this.D0;
        boolean z11 = false;
        vw vwVar = this.G0;
        if (kyVar != null && kyVar.z()) {
            s4.c1 K = swVar.K(0);
            if (K == null) {
                xy.a(vwVar, true, !z10);
            } else {
                if (K.f42671a.getTop() < swVar.getPaddingTop()) {
                    z11 = true;
                }
                xy.a(vwVar, z11, !z10);
            }
            vwVar.setTranslationY(bVar.e * AndroidUtilities.dp(15.0f));
        } else if (vwVar != null && swVar != null) {
            s4.c1 K2 = swVar.K(0);
            if (K2 != null) {
                i10 = K2.f42671a.getTop();
            } else {
                i10 = -this.f25696b1;
            }
            vwVar.setTranslationY((bVar.e * AndroidUtilities.dp(15.0f)) + i10);
            vwVar.f30081a.a(false, !z10);
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
        if (currentItem == 2 && j3 != -1 && (stickerSetById = MediaDataController.getInstance(this.f25700c1).getStickerSetById(j3)) != null && (E = (bzVar = this.f25770y0).E(stickerSetById)) >= 0 && E < bzVar.h()) {
            H(E, AndroidUtilities.dp(48.0f));
        }
        py pyVar = this.f25721j0;
        if (pyVar != null) {
            pyVar.K = false;
        }
        for (int i11 = 0; i11 < 3; i11++) {
            View view3 = this.D0;
            View view4 = this.f25715h0;
            pw pwVar = this.f25735o0;
            View view5 = this.P;
            if (i11 == 0) {
                xyVar = this.V;
                c0Var = this.Q;
                view = this.I;
                view2 = view5;
            } else if (i11 == 1) {
                c0Var = this.f25718i0;
                view = this.f25738p0;
                view2 = view4;
                xyVar = pwVar;
            } else {
                xyVar = this.G0;
                c0Var = this.E0;
                view = this.B0;
                view2 = view3;
            }
            if (xyVar != null) {
                wy wyVar = xyVar.f30086r;
                xyVar.d.setText("");
                if (wyVar != null) {
                    wyVar.F1(null);
                    wyVar.D1();
                }
                int i12 = this.f25696b1;
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
                    this.M0.setInterpolator(qr.h);
                    this.M0.addListener(new ai.y4(this, c0Var, view2, 5));
                    this.M0.start();
                } else {
                    if (xyVar != pwVar) {
                        xyVar.setTranslationY(AndroidUtilities.dp(36.0f) - i12);
                    }
                    if (view != null && i11 != 2) {
                        view.setTranslationY(0.0f);
                    }
                    if (view2 == view3) {
                        i10 = 0;
                        view2.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f) + this.f25740p2);
                    } else {
                        i10 = 0;
                        if (view2 == view4) {
                            view2.setPadding(0, AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(44.0f) + this.f25740p2);
                        } else {
                            if (view2 == view5) {
                                view2.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f) + this.f25740p2);
                            }
                            i10 = 0;
                        }
                    }
                    c0Var.h1(i10, i10);
                }
            }
        }
        if (!z10) {
            this.f25753t1.i(0);
        }
    }

    public void setBlurredBackgroundDrawableFactory(ah.c cVar) {
        org.telegram.ui.ActionBar.e6 e6Var = this.Z1;
        View view = this.f25765x;
        if (view != null) {
            ch.d c10 = cVar.c(view, null, false);
            c10.o(eh.b.d(e6Var));
            c10.q(AndroidUtilities.dp(18.0f));
            c10.p(AndroidUtilities.dp(6.0f));
            view.setBackground(c10);
        }
        View view2 = this.E;
        if (view2 != null) {
            ch.d c11 = cVar.c(view2, null, false);
            c11.o(eh.b.d(e6Var));
            c11.q(AndroidUtilities.dp(18.0f));
            c11.p(AndroidUtilities.dp(6.0f));
            view2.setBackground(c11);
        }
        View view3 = this.f25761w;
        if (view3 != null) {
            ch.d c12 = cVar.c(view3, null, false);
            c12.o(eh.b.d(e6Var));
            c12.q(AndroidUtilities.dp(18.0f));
            c12.p(AndroidUtilities.dp(6.0f));
            view3.setBackground(c12);
        }
        View view4 = this.f25769y;
        if (view4 != null) {
            ch.d c13 = cVar.c(view4, null, false);
            c13.o(eh.b.d(e6Var));
            c13.q(AndroidUtilities.dp(18.0f));
            c13.p(AndroidUtilities.dp(6.0f));
            view4.setBackground(c13);
        }
    }

    public void setBottomInset(int i10) {
        if (this.f25740p2 != i10) {
            this.f25740p2 = i10;
            j(i10, this.K);
            j(i10, this.M);
            j(AndroidUtilities.dp(44.0f) + i10, this.P);
            j(AndroidUtilities.dp(44.0f) + i10, this.D0);
            j(AndroidUtilities.dp(44.0f) + i10, this.f25715h0);
            FrameLayout frameLayout = this.f25748s;
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

    public void setDelegate(ky kyVar) {
        this.f25753t1 = kyVar;
    }

    public void setDragListener(px pxVar) {
        this.O0 = pxVar;
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        vw vwVar = this.G0;
        if (vwVar != null) {
            vwVar.d.setEnabled(z10);
        }
        pw pwVar = this.f25735o0;
        if (pwVar != null) {
            pwVar.d.setEnabled(z10);
        }
        jw jwVar = this.V;
        if (jwVar != null) {
            jwVar.d.setEnabled(z10);
        }
    }

    public void setForseMultiwindowLayout(boolean z10) {
        this.N1 = z10;
    }

    public void setShouldDrawBackground(boolean z10) {
        if (this.f25755u0 != z10) {
            this.f25755u0 = z10;
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
                int i11 = this.f25700c1;
                NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.stickersDidLoad);
                if (this.f25770y0 != null) {
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
            gg.g1 g1Var = this.T0;
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
                sx sxVar = this.R;
                if (sxVar != null) {
                    sxVar.F(false);
                }
            } else if (i10 == 1) {
                py pyVar = this.f25732n0;
                if (pyVar != null) {
                    pyVar.l();
                }
            } else if (i10 == 2 && (bzVar = this.f25770y0) != null) {
                bzVar.l();
            }
        }
    }

    public final int v(float f7) {
        return i0.a.k(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Wk, this.Z1), (int) (f7 * 255.0f));
    }

    public final s4.s w(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return this.f25718i0;
                }
                throw new IllegalArgumentException(hg.c.i(i10, "Unexpected argument: "));
            }
            return this.Q;
        }
        return this.E0;
    }

    public final ll0 x(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return this.f25715h0;
                }
                throw new IllegalArgumentException(hg.c.i(i10, "Unexpected argument: "));
            }
            return this.P;
        }
        return this.D0;
    }

    public final HorizontalScrollView y(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return this.f25738p0;
                }
                throw new IllegalArgumentException(hg.c.i(i10, "Unexpected argument: "));
            }
            return this.I;
        }
        return this.B0;
    }

    public final int z(int i10) {
        org.telegram.ui.ActionBar.e6 e6Var = this.Z1;
        if (e6Var != null) {
            return e6Var.G0(i10);
        }
        return org.telegram.ui.ActionBar.i6.w0(null, i10, false);
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
