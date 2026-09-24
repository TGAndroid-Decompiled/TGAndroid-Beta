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
import org.telegram.ui.ub1;
public class lz extends FrameLayout implements le.e, NotificationCenter.NotificationCenterDelegate, ph.a {
    public static final int O2 = 0;
    public final jw A0;
    public int A1;
    public final GradientDrawable A2;
    public final yw B0;
    public final yu B1;
    public int B2;
    public final zw C0;
    public final int C1;
    public ArrayList C2;
    public final uw D0;
    public final int[] D1;
    public int D2;
    public final ImageView E;
    public final vw E0;
    public int E1;
    public long E2;
    public AnimatorSet F;
    public jz F0;
    public int F1;
    public final le.c F2;
    public AnimatorSet G;
    public final xw G0;
    public int G1;
    public ArrayList G2;
    public float H;
    public final nh.d H0;
    public int H1;
    public boolean H2;
    public final px I;
    public boolean I0;
    public int I1;
    public NotificationCenter.ObserversGroup I2;
    public final kx J;
    public boolean J0;
    public TLRPC.ChatFull J1;
    public AnimatorSet J2;
    public final ci.m6 K;
    public boolean K0;
    public boolean K1;
    public org.telegram.messenger.video.k K2;
    public final nh.b L;
    public final fy L0;
    public int L1;
    public final fw L2;
    public final ci.m6 M;
    public AnimatorSet M0;
    public final ai.i6 M1;
    public boolean M2;
    public final nh.b N;
    public final ai.p4 N0;
    public boolean N1;
    public boolean N2;
    public final View O;
    public rx O0;
    public int O1;
    public final xx P;
    public boolean P0;
    public boolean P1;
    public final lx Q;
    public final int[] Q0;
    public boolean Q1;
    public final ux R;
    public final ObjectAnimator[] R0;
    public uy R1;
    public final ly S;
    public boolean S0;
    public float S1;
    public jz T;
    public gg.g1 T0;
    public float T1;
    public final nh.d U;
    public boolean U0;
    public float U1;
    public final lw V;
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
    public final org.telegram.ui.ActionBar.d6 Z1;
    public final le.c f26220a;
    public final zk0 f26221a0;
    public final String[] f26222a1;
    public final org.telegram.ui.ActionBar.s5 a2;
    public final le.c f26223b;
    public final zk0 f26224b0;
    public final int f26225b1;
    public final org.telegram.ui.ActionBar.s5 f26226b2;
    public int f26227c;
    public boolean f26228c0;
    public final int f26229c1;
    public final boolean f26230c2;
    public final ArrayList d;
    public final boolean f26231d0;
    public final ArrayList f26232d1;
    public LongSparseArray f26233d2;
    public final ArrayList e;
    public boolean f26234e0;
    public int f26235e1;
    public PorterDuffColorFilter f26236e2;
    public boolean f26237f;
    public boolean f26238f0;
    public int f26239f1;
    public final org.telegram.ui.Cells.t6 f26240f2;
    public final nw f26241g0;
    public boolean f26242g1;
    public final fx f26243g2;
    public final ax h;
    public final ow f26244h0;
    public TLRPC.TL_messages_stickerSet f26245h1;
    public boolean f26246h2;
    public final ry f26247i0;
    public ArrayList f26248i1;
    public final boolean f26249i2;
    public final qy f26250j0;
    public ArrayList f26251j1;
    public final ah.h f26252j2;
    public final ty f26253k0;
    public ArrayList f26254k1;
    public final lh f26255k2;
    public final HashMap f26256l0;
    public ArrayList l1;
    public final ah.c f26257l2;
    public final jw m0;
    public final ArrayList f26258m1;
    public final li.e f26259m2;
    public final FrameLayout f26260n;
    public final qy f26261n0;
    public final ArrayList f26262n1;
    public boolean f26263n2;
    public final rw f26264o0;
    public final ArrayList f26265o1;
    public boolean f26266o2;
    public final sx f26267p0;
    public final ArrayList f26268p1;
    public int f26269p2;
    public boolean f26270q0;
    public final ArrayList f26271q1;
    public float f26272q2;
    public final FrameLayout f26273r;
    public int f26274r0;
    public final HashMap f26275r1;
    public View f26276r2;
    public final FrameLayout f26277s;
    public int f26278s0;
    public final Paint f26279s1;
    public int f26280s2;
    public int f26281t0;
    public my f26282t1;
    public int f26283t2;
    public boolean f26284u0;
    public long f26285u1;
    public long f26286u2;
    public final View v;
    public boolean f26287v0;
    public boolean f26288v1;
    public boolean f26289v2;
    public final od0 f26290w;
    public boolean f26291w0;
    public boolean f26292w1;
    public boolean f26293w2;
    public final bx f26294x;
    public final sw f26295x0;
    public final TLRPC.StickerSetCovered[] f26296x1;
    public final Rect f26297x2;
    public final ImageView f26298y;
    public final cz f26299y0;
    public final LongSparseArray f26300y1;
    public final RectF f26301y2;
    public final gz f26302z0;
    public final LongSparseArray f26303z1;
    public final ArrayList f26304z2;

    public lz(org.telegram.ui.ActionBar.m2 m2Var, boolean z10, boolean z11, boolean z12, Context context, boolean z13, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z14, final org.telegram.ui.ActionBar.d6 d6Var, boolean z15, boolean z16) {
        super(context);
        org.telegram.ui.ActionBar.s5 s5Var;
        int z17;
        kx kxVar;
        Context context2;
        fw fwVar;
        boolean z18;
        Field field;
        int i10;
        rr rrVar = rr.h;
        this.f26220a = new le.c(0, this, rrVar, 320L, false);
        this.f26223b = new le.c(1, this, rrVar, 320L, false);
        this.f26227c = 2;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.e = new ArrayList();
        this.f26228c0 = true;
        this.f26253k0 = new ty(this);
        this.f26256l0 = new HashMap();
        this.f26270q0 = true;
        this.f26274r0 = -2;
        this.f26278s0 = -2;
        this.f26281t0 = -2;
        this.f26284u0 = true;
        this.f26291w0 = true;
        this.I0 = true;
        this.Q0 = new int[3];
        this.R0 = new ObjectAnimator[3];
        int i11 = UserConfig.selectedAccount;
        this.f26229c1 = i11;
        this.f26232d1 = new ArrayList();
        this.f26248i1 = new ArrayList();
        this.f26251j1 = new ArrayList();
        this.f26254k1 = new ArrayList();
        this.l1 = new ArrayList();
        this.f26258m1 = new ArrayList();
        this.f26262n1 = new ArrayList();
        new ArrayList();
        this.f26265o1 = new ArrayList();
        this.f26268p1 = new ArrayList();
        this.f26271q1 = new ArrayList();
        this.f26275r1 = new HashMap();
        this.f26296x1 = new TLRPC.StickerSetCovered[10];
        this.f26300y1 = new LongSparseArray();
        this.f26303z1 = new LongSparseArray();
        this.D1 = new int[2];
        this.F1 = -2;
        this.G1 = -2;
        this.H1 = -2;
        this.I1 = -2;
        this.L1 = -1;
        this.f26240f2 = new org.telegram.ui.Cells.t6(this, 12);
        this.f26243g2 = new fx(this);
        this.f26246h2 = true;
        li.e eVar = new li.e();
        this.f26259m2 = eVar;
        this.f26272q2 = -1.0f;
        this.f26280s2 = -1;
        this.f26283t2 = -1;
        this.f26286u2 = -1L;
        this.f26289v2 = false;
        this.f26293w2 = true;
        this.f26297x2 = new Rect();
        RectF rectF = new RectF();
        this.f26301y2 = rectF;
        ArrayList arrayList2 = new ArrayList(1);
        this.f26304z2 = arrayList2;
        arrayList2.add(rectF);
        this.A2 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.F2 = new le.c(0, new gw(this, 3), rrVar, 380L, true);
        this.L2 = new fw(this, 1);
        this.M2 = false;
        this.f26284u0 = z14;
        this.Y1 = m2Var;
        this.f26230c2 = z10;
        this.Z1 = d6Var;
        this.f26249i2 = z16;
        fh.c cVar = new fh.c();
        cVar.a(z(org.telegram.ui.ActionBar.h6.f19045d6));
        if (z15) {
            u(true);
        }
        i0.a.k(z(org.telegram.ui.ActionBar.h6.Wk), 30);
        int dp = AndroidUtilities.dp(50.0f);
        this.f26225b1 = dp;
        this.f26231d0 = z13;
        this.X0 = new Drawable[]{org.telegram.ui.ActionBar.h6.U(context, R.drawable.smiles_tab_smiles, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.h6.Re), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.h6.Oe)), org.telegram.ui.ActionBar.h6.U(context, R.drawable.smiles_tab_gif, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.h6.Re), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.h6.Oe)), org.telegram.ui.ActionBar.h6.U(context, R.drawable.smiles_tab_stickers, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.h6.Re), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.h6.Oe))};
        org.telegram.ui.ActionBar.s5 U = org.telegram.ui.ActionBar.h6.U(context, R.drawable.msg_emoji_recent, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.h6.Me), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.h6.Oe));
        org.telegram.ui.ActionBar.s5 U2 = org.telegram.ui.ActionBar.h6.U(context, R.drawable.emoji_tabs_faves, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.h6.Me), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.h6.Oe));
        org.telegram.ui.ActionBar.s5 U3 = org.telegram.ui.ActionBar.h6.U(context, R.drawable.emoji_tabs_new3, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.h6.Me), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.h6.Oe));
        int i12 = R.drawable.emoji_tabs_new1;
        if (z16) {
            s5Var = U3;
            z17 = v(0.4f);
        } else {
            s5Var = U3;
            z17 = z(org.telegram.ui.ActionBar.h6.Me);
        }
        org.telegram.ui.ActionBar.s5 U4 = org.telegram.ui.ActionBar.h6.U(context, i12, z17, z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.h6.Oe));
        this.a2 = U4;
        int i13 = R.drawable.emoji_tabs_new2;
        int i14 = org.telegram.ui.ActionBar.h6.Qe;
        org.telegram.ui.ActionBar.s5 U5 = org.telegram.ui.ActionBar.h6.U(context, i13, z(i14), z(i14));
        this.f26226b2 = U5;
        this.Y0 = new Drawable[]{U, U2, s5Var, new LayerDrawable(new Drawable[]{U4, U5})};
        this.Z0 = new Drawable[]{org.telegram.ui.ActionBar.h6.U(context, R.drawable.msg_emoji_recent, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.h6.Me), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.h6.Oe)), org.telegram.ui.ActionBar.h6.U(context, R.drawable.stickers_gifs_trending, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.h6.Me), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.h6.Oe))};
        this.f26222a1 = new String[]{LocaleController.getString(R.string.Emoji1), LocaleController.getString(R.string.Emoji2), LocaleController.getString(R.string.Emoji3), LocaleController.getString(R.string.Emoji4), LocaleController.getString(R.string.Emoji5), LocaleController.getString(R.string.Emoji6), LocaleController.getString(R.string.Emoji7), LocaleController.getString(R.string.Emoji8)};
        this.J1 = chatFull;
        Paint paint = new Paint(1);
        this.f26279s1 = paint;
        paint.setColor(z(org.telegram.ui.ActionBar.h6.f18997af));
        ai.k2 k2Var = yf.i0.f47100a;
        this.M1 = new ai.i6(AndroidUtilities.dp(6.0f));
        kx kxVar2 = new kx(this, context);
        this.J = kxVar2;
        ?? obj = new Object();
        obj.f24863a = 0;
        obj.f24864b = kxVar2;
        arrayList.add(obj);
        if (z10) {
            MediaDataController.getInstance(i11).checkStickers(5);
            MediaDataController.getInstance(i11).checkFeaturedEmoji();
            this.f26236e2 = new PorterDuffColorFilter(z(org.telegram.ui.ActionBar.h6.Oh), PorterDuff.Mode.SRC_IN);
        }
        xx xxVar = new xx(this, context);
        this.P = xxVar;
        eVar.a(xxVar);
        s4.j jVar = new s4.j();
        jVar.f43027c = 220L;
        jVar.e = 220L;
        jVar.f43028f = 160L;
        jVar.f43029g = 160L;
        jVar.f43030i = rr.f28023g;
        xxVar.setItemAnimator(jVar);
        xxVar.setOnTouchListener(new View.OnTouchListener(this) {
            public final lz f24848b;

            {
                this.f24848b = this;
            }

            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                switch (r3) {
                    case 0:
                        org.telegram.ui.nt q6 = org.telegram.ui.nt.q();
                        lz lzVar = this.f24848b;
                        xx xxVar2 = lzVar.P;
                        lzVar.getMeasuredHeight();
                        return q6.s(motionEvent, xxVar2, null, lzVar.f26243g2, d6Var);
                    case 1:
                        org.telegram.ui.nt q10 = org.telegram.ui.nt.q();
                        lz lzVar2 = this.f24848b;
                        return q10.s(motionEvent, lzVar2.f26244h0, lzVar2.m0, lzVar2.f26243g2, d6Var);
                    default:
                        org.telegram.ui.nt q11 = org.telegram.ui.nt.q();
                        lz lzVar3 = this.f24848b;
                        uw uwVar = lzVar3.D0;
                        lzVar3.getMeasuredHeight();
                        return q11.s(motionEvent, uwVar, lzVar3.A0, lzVar3.f26243g2, d6Var);
                }
            }
        });
        xxVar.setOnItemLongClickListener(new gw(this, 1));
        xxVar.setInstantClick(true);
        lx lxVar = new lx(this);
        this.Q = lxVar;
        xxVar.setLayoutManager(lxVar);
        xxVar.setTopGlowOffset(AndroidUtilities.dp(38.0f));
        xxVar.setBottomGlowOffset(AndroidUtilities.dp(36.0f));
        xxVar.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f));
        int i15 = org.telegram.ui.ActionBar.h6.He;
        xxVar.setGlowColor(z(i15));
        xxVar.setItemSelectorColorProvider(new x1(29));
        xxVar.setClipToPadding(false);
        lxVar.O = new mx(this);
        ux uxVar = new ux(this);
        this.R = uxVar;
        xxVar.setAdapter(uxVar);
        xxVar.i(new ci.r1(this, 3));
        this.S = new ly(this, context);
        kxVar2.addView(xxVar, w7.y5.c(-1.0f, -1));
        zk0 zk0Var = new zk0(xxVar, lxVar);
        this.f26224b0 = zk0Var;
        zk0Var.f30914i = new nx(this);
        xxVar.setOnScrollListener(new ox(this));
        if (m2Var != null) {
            kxVar = kxVar2;
            context2 = context;
            fwVar = new fw(this, 2);
        } else {
            kxVar = kxVar2;
            context2 = context;
            fwVar = null;
        }
        px pxVar = new px(this, context2, d6Var, z10, fwVar, z16);
        this.I = pxVar;
        if (z13) {
            lw lwVar = new lw(this, context2);
            this.V = lwVar;
            kxVar.addView(lwVar, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + dp));
            lwVar.d.setOnFocusChangeListener(new mw(this));
            nh.d dVar = new nh.d(context2, d6Var);
            this.U = dVar;
            dVar.setVisibility(8);
            dVar.setOnBackClickListener(new View.OnClickListener(this) {
                public final lz f25151b;

                {
                    this.f25151b = this;
                }

                @Override
                public final void onClick(View view) {
                    yy yyVar;
                    switch (r2) {
                        case 0:
                            ly lyVar = this.f25151b.S;
                            gy gyVar = lyVar.f26212c;
                            int childCount = gyVar.getChildCount();
                            for (int i16 = 0; i16 < childCount; i16++) {
                                ((nh.c) gyVar.getChildAt(i16)).a(false, true);
                            }
                            lyVar.d = 0L;
                            lyVar.F.f26223b.a(false, true);
                            lyVar.l();
                            return;
                        case 1:
                            gz gzVar = this.f25151b.f26302z0;
                            fz fzVar = gzVar.f24563c;
                            int childCount2 = fzVar.getChildCount();
                            for (int i17 = 0; i17 < childCount2; i17++) {
                                ((nh.c) fzVar.getChildAt(i17)).a(false, true);
                            }
                            gzVar.d = 0L;
                            gzVar.Q.f26220a.a(false, true);
                            gzVar.l();
                            return;
                        case 2:
                            my myVar = this.f25151b.f26282t1;
                            if (myVar != null) {
                                myVar.w();
                                return;
                            }
                            return;
                        default:
                            lz lzVar = this.f25151b;
                            int currentItem = lzVar.h.getCurrentItem();
                            if (currentItem == 0) {
                                yyVar = lzVar.V;
                            } else if (currentItem == 1) {
                                yyVar = lzVar.f26264o0;
                            } else {
                                yyVar = lzVar.G0;
                            }
                            if (yyVar != null) {
                                jq jqVar = yyVar.d;
                                jqVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                jqVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                jqVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                return;
                            }
                            return;
                    }
                }
            });
            kxVar.addView(dVar, new FrameLayout.LayoutParams(-1, dp));
        }
        int z19 = z(i15);
        if (Color.alpha(z19) >= 255) {
            pxVar.setBackgroundColor(z19);
        }
        uxVar.G(true);
        pxVar.p(getEmojipacks());
        kxVar.addView(pxVar, w7.y5.c(36.0f, -1));
        View view = new View(context2);
        this.O = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        int i16 = org.telegram.ui.ActionBar.h6.Ke;
        view.setBackgroundColor(z(i16));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(36.0f);
        kxVar.addView(view, layoutParams);
        nh.b bVar = new nh.b(context2, d6Var);
        this.L = bVar;
        ci.m6 m6Var = new ci.m6(context2, 3, d6Var);
        this.K = m6Var;
        m6Var.setVisibility(8);
        m6Var.addView(bVar, w7.y5.d(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
        kxVar.addView(m6Var, w7.y5.e(-1, -2, 80));
        if (z11) {
            tm0 tm0Var = tm0.f28562b;
            if (z12) {
                nw nwVar = new nw(this, context2);
                this.f26241g0 = nwVar;
                ?? obj2 = new Object();
                obj2.f24863a = 1;
                obj2.f24864b = nwVar;
                this.d.add(obj2);
                ow owVar = new ow(this, context2);
                this.f26244h0 = owVar;
                eVar.a(owVar);
                owVar.setClipToPadding(false);
                ry ryVar = new ry(this);
                this.f26247i0 = ryVar;
                owVar.setLayoutManager(ryVar);
                owVar.i(new pw(this));
                owVar.setPadding(0, dp, 0, AndroidUtilities.dp(44.0f) + this.f26269p2);
                ((s4.f1) owVar.getItemAnimator()).f42981m = false;
                qy qyVar = new qy(this, context2, true, Integer.MAX_VALUE);
                this.f26261n0 = qyVar;
                owVar.setAdapter(qyVar);
                this.f26250j0 = new qy(this, context2, false, 0);
                owVar.setOnScrollListener(new qw(this));
                owVar.setOnTouchListener(new View.OnTouchListener(this) {
                    public final lz f24848b;

                    {
                        this.f24848b = this;
                    }

                    @Override
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        switch (r3) {
                            case 0:
                                org.telegram.ui.nt q6 = org.telegram.ui.nt.q();
                                lz lzVar = this.f24848b;
                                xx xxVar2 = lzVar.P;
                                lzVar.getMeasuredHeight();
                                return q6.s(motionEvent, xxVar2, null, lzVar.f26243g2, d6Var);
                            case 1:
                                org.telegram.ui.nt q10 = org.telegram.ui.nt.q();
                                lz lzVar2 = this.f24848b;
                                return q10.s(motionEvent, lzVar2.f26244h0, lzVar2.m0, lzVar2.f26243g2, d6Var);
                            default:
                                org.telegram.ui.nt q11 = org.telegram.ui.nt.q();
                                lz lzVar3 = this.f24848b;
                                uw uwVar = lzVar3.D0;
                                lzVar3.getMeasuredHeight();
                                return q11.s(motionEvent, uwVar, lzVar3.A0, lzVar3.f26243g2, d6Var);
                        }
                    }
                });
                ?? r12 = new kl0(this) {
                    public final lz f25556b;

                    {
                        this.f25556b = this;
                    }

                    @Override
                    public final void d(int i17, View view2) {
                        int i18;
                        String str;
                        switch (r2) {
                            case 0:
                                lz lzVar = this.f25556b;
                                ow owVar2 = lzVar.f26244h0;
                                qy qyVar2 = lzVar.f26250j0;
                                qy qyVar3 = lzVar.f26261n0;
                                if (lzVar.f26282t1 != null) {
                                    qyVar3.getClass();
                                    ArrayList arrayList3 = qyVar3.f27782x;
                                    if (owVar2.getAdapter() == qyVar3) {
                                        if (i17 >= 0) {
                                            int i19 = qyVar3.H;
                                            if (i17 < i19) {
                                                lzVar.f26282t1.v(view2, lzVar.f26248i1.get(i17), null, "gif", true, 0, 0);
                                                return;
                                            }
                                            if (i19 > 0) {
                                                i18 = (i17 - i19) - 1;
                                            } else {
                                                i18 = i17;
                                            }
                                            if (i18 >= 0 && i18 < arrayList3.size()) {
                                                lzVar.f26282t1.v(view2, arrayList3.get(i18), null, qyVar3.f27778n, true, 0, 0);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    } else if (owVar2.getAdapter() == qyVar2 && i17 >= 0 && i17 < qyVar2.f27782x.size()) {
                                        lzVar.f26282t1.v(view2, qyVar2.f27782x.get(i17), qyVar2.f27781w, qyVar2.f27778n, true, 0, 0);
                                        lzVar.W();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            default:
                                lz lzVar2 = this.f25556b;
                                s4.h0 adapter = lzVar2.D0.getAdapter();
                                gz gzVar = lzVar2.f26302z0;
                                if (adapter == gzVar) {
                                    str = gzVar.N;
                                } else {
                                    str = null;
                                }
                                String str2 = str;
                                if (view2 instanceof org.telegram.ui.Cells.f8) {
                                    org.telegram.ui.Cells.f8 f8Var = (org.telegram.ui.Cells.f8) view2;
                                    if (f8Var.getSticker() != null && MessageObject.isPremiumSticker(f8Var.getSticker()) && !AccountInstance.getInstance(lzVar2.f26229c1).getUserConfig().isPremium()) {
                                        org.telegram.ui.nt.q().y(f8Var);
                                        return;
                                    }
                                    org.telegram.ui.nt.q().u();
                                    if (!f8Var.f20294r) {
                                        f8Var.f20294r = true;
                                        f8Var.f20293n = 0.5f;
                                        f8Var.f20297x = 0L;
                                        org.telegram.ui.Cells.e8 e8Var = f8Var.f20289a;
                                        e8Var.setAlpha(0.5f * f8Var.H);
                                        e8Var.invalidate();
                                        f8Var.f20295s = System.currentTimeMillis();
                                        f8Var.invalidate();
                                        lzVar2.f26282t1.m(f8Var, f8Var.getSticker(), str2, f8Var.getParentObject(), f8Var.getSendAnimationData(), true, 0);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                };
                this.m0 = r12;
                owVar.setOnItemClickListener((kl0) r12);
                nwVar.addView(owVar, w7.y5.c(-1.0f, -1));
                rw rwVar = new rw(this, context2);
                this.f26264o0 = rwVar;
                nwVar.addView(rwVar, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + dp));
                sx sxVar = new sx(this, context2, d6Var);
                this.f26267p0 = sxVar;
                sxVar.setType(tm0Var);
                sxVar.setUnderlineHeight(AndroidUtilities.getShadowHeight());
                i10 = i14;
                sxVar.setIndicatorColor(z(i10));
                sxVar.setUnderlineColor(z(i16));
                sxVar.setBackgroundColor(z(i15));
                V();
                sxVar.setDelegate(new gw(this, 2));
                qyVar.F("", "", true, true, true);
            } else {
                i10 = i14;
            }
            sw swVar = new sw(this, context2, z14);
            this.f26295x0 = swVar;
            MediaDataController.getInstance(this.f26229c1).checkStickers(0);
            MediaDataController.getInstance(this.f26229c1).checkFeaturedStickers();
            uw uwVar = new uw(this, context2);
            this.D0 = uwVar;
            this.f26259m2.a(uwVar);
            vw vwVar = new vw(this);
            this.E0 = vwVar;
            uwVar.setLayoutManager(vwVar);
            vwVar.O = new ww(this);
            uwVar.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f));
            uwVar.setClipToPadding(false);
            ?? obj3 = new Object();
            obj3.f24863a = 2;
            obj3.f24864b = swVar;
            this.d.add(obj3);
            this.f26302z0 = new gz(this, context2);
            cz czVar = new cz(this, context2);
            this.f26299y0 = czVar;
            uwVar.setAdapter(czVar);
            uwVar.setOnTouchListener(new View.OnTouchListener(this) {
                public final lz f24848b;

                {
                    this.f24848b = this;
                }

                @Override
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    switch (r3) {
                        case 0:
                            org.telegram.ui.nt q6 = org.telegram.ui.nt.q();
                            lz lzVar = this.f24848b;
                            xx xxVar2 = lzVar.P;
                            lzVar.getMeasuredHeight();
                            return q6.s(motionEvent, xxVar2, null, lzVar.f26243g2, d6Var);
                        case 1:
                            org.telegram.ui.nt q10 = org.telegram.ui.nt.q();
                            lz lzVar2 = this.f24848b;
                            return q10.s(motionEvent, lzVar2.f26244h0, lzVar2.m0, lzVar2.f26243g2, d6Var);
                        default:
                            org.telegram.ui.nt q11 = org.telegram.ui.nt.q();
                            lz lzVar3 = this.f24848b;
                            uw uwVar2 = lzVar3.D0;
                            lzVar3.getMeasuredHeight();
                            return q11.s(motionEvent, uwVar2, lzVar3.A0, lzVar3.f26243g2, d6Var);
                    }
                }
            });
            ?? r42 = new kl0(this) {
                public final lz f25556b;

                {
                    this.f25556b = this;
                }

                @Override
                public final void d(int i17, View view2) {
                    int i18;
                    String str;
                    switch (r2) {
                        case 0:
                            lz lzVar = this.f25556b;
                            ow owVar2 = lzVar.f26244h0;
                            qy qyVar2 = lzVar.f26250j0;
                            qy qyVar3 = lzVar.f26261n0;
                            if (lzVar.f26282t1 != null) {
                                qyVar3.getClass();
                                ArrayList arrayList3 = qyVar3.f27782x;
                                if (owVar2.getAdapter() == qyVar3) {
                                    if (i17 >= 0) {
                                        int i19 = qyVar3.H;
                                        if (i17 < i19) {
                                            lzVar.f26282t1.v(view2, lzVar.f26248i1.get(i17), null, "gif", true, 0, 0);
                                            return;
                                        }
                                        if (i19 > 0) {
                                            i18 = (i17 - i19) - 1;
                                        } else {
                                            i18 = i17;
                                        }
                                        if (i18 >= 0 && i18 < arrayList3.size()) {
                                            lzVar.f26282t1.v(view2, arrayList3.get(i18), null, qyVar3.f27778n, true, 0, 0);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                } else if (owVar2.getAdapter() == qyVar2 && i17 >= 0 && i17 < qyVar2.f27782x.size()) {
                                    lzVar.f26282t1.v(view2, qyVar2.f27782x.get(i17), qyVar2.f27781w, qyVar2.f27778n, true, 0, 0);
                                    lzVar.W();
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        default:
                            lz lzVar2 = this.f25556b;
                            s4.h0 adapter = lzVar2.D0.getAdapter();
                            gz gzVar = lzVar2.f26302z0;
                            if (adapter == gzVar) {
                                str = gzVar.N;
                            } else {
                                str = null;
                            }
                            String str2 = str;
                            if (view2 instanceof org.telegram.ui.Cells.f8) {
                                org.telegram.ui.Cells.f8 f8Var = (org.telegram.ui.Cells.f8) view2;
                                if (f8Var.getSticker() != null && MessageObject.isPremiumSticker(f8Var.getSticker()) && !AccountInstance.getInstance(lzVar2.f26229c1).getUserConfig().isPremium()) {
                                    org.telegram.ui.nt.q().y(f8Var);
                                    return;
                                }
                                org.telegram.ui.nt.q().u();
                                if (!f8Var.f20294r) {
                                    f8Var.f20294r = true;
                                    f8Var.f20293n = 0.5f;
                                    f8Var.f20297x = 0L;
                                    org.telegram.ui.Cells.e8 e8Var = f8Var.f20289a;
                                    e8Var.setAlpha(0.5f * f8Var.H);
                                    e8Var.invalidate();
                                    f8Var.f20295s = System.currentTimeMillis();
                                    f8Var.invalidate();
                                    lzVar2.f26282t1.m(f8Var, f8Var.getSticker(), str2, f8Var.getParentObject(), f8Var.getSendAnimationData(), true, 0);
                                    return;
                                }
                                return;
                            }
                            return;
                    }
                }
            };
            this.A0 = r42;
            uwVar.setOnItemClickListener((kl0) r42);
            uwVar.setGlowColor(z(i15));
            swVar.addView(uwVar);
            this.f26221a0 = new zk0(uwVar, vwVar);
            xw xwVar = new xw(this, context2);
            this.G0 = xwVar;
            swVar.addView(xwVar, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + dp));
            nh.d dVar2 = new nh.d(context2, d6Var);
            this.H0 = dVar2;
            dVar2.setVisibility(8);
            dVar2.setOnBackClickListener(new View.OnClickListener(this) {
                public final lz f25151b;

                {
                    this.f25151b = this;
                }

                @Override
                public final void onClick(View view2) {
                    yy yyVar;
                    switch (r2) {
                        case 0:
                            ly lyVar = this.f25151b.S;
                            gy gyVar = lyVar.f26212c;
                            int childCount = gyVar.getChildCount();
                            for (int i162 = 0; i162 < childCount; i162++) {
                                ((nh.c) gyVar.getChildAt(i162)).a(false, true);
                            }
                            lyVar.d = 0L;
                            lyVar.F.f26223b.a(false, true);
                            lyVar.l();
                            return;
                        case 1:
                            gz gzVar = this.f25151b.f26302z0;
                            fz fzVar = gzVar.f24563c;
                            int childCount2 = fzVar.getChildCount();
                            for (int i17 = 0; i17 < childCount2; i17++) {
                                ((nh.c) fzVar.getChildAt(i17)).a(false, true);
                            }
                            gzVar.d = 0L;
                            gzVar.Q.f26220a.a(false, true);
                            gzVar.l();
                            return;
                        case 2:
                            my myVar = this.f25151b.f26282t1;
                            if (myVar != null) {
                                myVar.w();
                                return;
                            }
                            return;
                        default:
                            lz lzVar = this.f25151b;
                            int currentItem = lzVar.h.getCurrentItem();
                            if (currentItem == 0) {
                                yyVar = lzVar.V;
                            } else if (currentItem == 1) {
                                yyVar = lzVar.f26264o0;
                            } else {
                                yyVar = lzVar.G0;
                            }
                            if (yyVar != null) {
                                jq jqVar = yyVar.d;
                                jqVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                jqVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                jqVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                return;
                            }
                            return;
                    }
                }
            });
            swVar.addView(dVar2, new FrameLayout.LayoutParams(-1, dp));
            z18 = z14;
            yw ywVar = new yw(this, context2, d6Var, m2Var, z18);
            this.B0 = ywVar;
            ywVar.setDragEnabled(true);
            ywVar.setWillNotDraw(false);
            ywVar.setType(tm0Var);
            ywVar.setUnderlineHeight(uwVar.canScrollVertically(-1) ? AndroidUtilities.getShadowHeight() : 0);
            ywVar.setIndicatorColor(z(i10));
            ywVar.setUnderlineColor(z(i16));
            if (viewGroup != null && z18) {
                zw zwVar = new zw(this, context2);
                this.C0 = zwVar;
                zwVar.addView(ywVar, w7.y5.e(-1, 36, 51));
                viewGroup.addView(zwVar, w7.y5.c(-2.0f, -1));
            } else {
                swVar.addView(ywVar, w7.y5.e(-1, 36, 51));
            }
            X(true);
            ywVar.setDelegate(new gw(this, 4));
            uwVar.setOnScrollListener(new kz(this, 0));
            nh.b bVar2 = new nh.b(context2, d6Var);
            this.N = bVar2;
            ci.m6 m6Var2 = new ci.m6(context2, 3, d6Var);
            this.M = m6Var2;
            m6Var2.setVisibility(8);
            m6Var2.addView(bVar2, w7.y5.d(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
            swVar.addView(m6Var2, w7.y5.e(-1, -2, 80));
        } else {
            z18 = z14;
        }
        this.e.clear();
        this.e.addAll(this.d);
        ax axVar = new ax(this, context2);
        this.h = axVar;
        li.e eVar2 = this.f26259m2;
        eVar2.getClass();
        axVar.b(new ai.n7(eVar2, 1));
        axVar.setOverScrollMode(2);
        fy fyVar = new fy(this);
        this.L0 = fyVar;
        axVar.setAdapter(fyVar);
        bx bxVar = new bx(this, context2);
        this.f26294x = bxVar;
        bxVar.setHapticFeedbackEnabled(true);
        bxVar.setImageResource(R.drawable.smiles_tab_clear);
        int v = z16 ? v(0.6f) : z(org.telegram.ui.ActionBar.h6.Re);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        bxVar.setColorFilter(new PorterDuffColorFilter(v, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        bxVar.setScaleType(scaleType);
        bxVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
        bxVar.setFocusable(true);
        bxVar.setOnClickListener(new Object());
        w7.a6.a(bxVar);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f26273r = frameLayout;
        if (z13) {
            addView(frameLayout, w7.y5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, (AndroidUtilities.getShadowHeight() / AndroidUtilities.density) + 40.0f));
        } else {
            addView(frameLayout, w7.y5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.f26277s = frameLayout2;
        addView(frameLayout2, w7.y5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 64.0f));
        FrameLayout frameLayout3 = new FrameLayout(context2);
        this.f26260n = frameLayout3;
        View view2 = new View(context2);
        this.v = view2;
        frameLayout3.addView(view2, new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(40.0f), 83));
        if (z13) {
            addView(frameLayout3, w7.y5.e(-1, 48, 80));
            frameLayout3.addView(bxVar, w7.y5.d(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
            if (z11) {
                ImageView imageView = new ImageView(context2);
                this.f26298y = imageView;
                imageView.setImageResource(R.drawable.smiles_tab_settings);
                imageView.setColorFilter(new PorterDuffColorFilter(z16 ? v(0.6f) : z(org.telegram.ui.ActionBar.h6.Re), mode));
                imageView.setScaleType(scaleType);
                imageView.setFocusable(true);
                imageView.setContentDescription(LocaleController.getString(R.string.Settings));
                w7.a6.a(imageView);
                frameLayout3.addView(imageView, w7.y5.d(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
                imageView.setOnClickListener(new View.OnClickListener(this) {
                    public final lz f25151b;

                    {
                        this.f25151b = this;
                    }

                    @Override
                    public final void onClick(View view22) {
                        yy yyVar;
                        switch (r2) {
                            case 0:
                                ly lyVar = this.f25151b.S;
                                gy gyVar = lyVar.f26212c;
                                int childCount = gyVar.getChildCount();
                                for (int i162 = 0; i162 < childCount; i162++) {
                                    ((nh.c) gyVar.getChildAt(i162)).a(false, true);
                                }
                                lyVar.d = 0L;
                                lyVar.F.f26223b.a(false, true);
                                lyVar.l();
                                return;
                            case 1:
                                gz gzVar = this.f25151b.f26302z0;
                                fz fzVar = gzVar.f24563c;
                                int childCount2 = fzVar.getChildCount();
                                for (int i17 = 0; i17 < childCount2; i17++) {
                                    ((nh.c) fzVar.getChildAt(i17)).a(false, true);
                                }
                                gzVar.d = 0L;
                                gzVar.Q.f26220a.a(false, true);
                                gzVar.l();
                                return;
                            case 2:
                                my myVar = this.f25151b.f26282t1;
                                if (myVar != null) {
                                    myVar.w();
                                    return;
                                }
                                return;
                            default:
                                lz lzVar = this.f25151b;
                                int currentItem = lzVar.h.getCurrentItem();
                                if (currentItem == 0) {
                                    yyVar = lzVar.V;
                                } else if (currentItem == 1) {
                                    yyVar = lzVar.f26264o0;
                                } else {
                                    yyVar = lzVar.G0;
                                }
                                if (yyVar != null) {
                                    jq jqVar = yyVar.d;
                                    jqVar.requestFocus();
                                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                    jqVar.onTouchEvent(obtain);
                                    obtain.recycle();
                                    MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                    jqVar.onTouchEvent(obtain2);
                                    obtain2.recycle();
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            od0 od0Var = new od0(context2, d6Var);
            this.f26290w = od0Var;
            od0Var.setViewPager(axVar);
            od0Var.setShouldExpand(false);
            od0Var.setIndicatorHeight(AndroidUtilities.dp(3.0f));
            od0Var.setIndicatorColor(i0.a.k(z(org.telegram.ui.ActionBar.h6.Oe), 20));
            od0Var.setUnderlineHeight(0);
            od0Var.setTabPaddingLeftRight(AndroidUtilities.dp(11.0f));
            od0Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f));
            frameLayout3.addView(od0Var, w7.y5.e(-2, 48, 81));
            od0Var.setOnPageChangeListener(new dx(this, z18));
            ImageView imageView2 = new ImageView(context2);
            this.E = imageView2;
            imageView2.setImageResource(R.drawable.smiles_tab_search);
            imageView2.setColorFilter(new PorterDuffColorFilter(z16 ? v(0.6f) : z(org.telegram.ui.ActionBar.h6.Re), mode));
            imageView2.setScaleType(scaleType);
            imageView2.setContentDescription(LocaleController.getString(R.string.Search));
            imageView2.setFocusable(true);
            imageView2.setVisibility(8);
            frameLayout3.addView(imageView2, w7.y5.d(48, 48.0f, 83, 2.0f, 0.0f, 2.0f, 0.0f));
            imageView2.setOnClickListener(new View.OnClickListener(this) {
                public final lz f25151b;

                {
                    this.f25151b = this;
                }

                @Override
                public final void onClick(View view22) {
                    yy yyVar;
                    switch (r2) {
                        case 0:
                            ly lyVar = this.f25151b.S;
                            gy gyVar = lyVar.f26212c;
                            int childCount = gyVar.getChildCount();
                            for (int i162 = 0; i162 < childCount; i162++) {
                                ((nh.c) gyVar.getChildAt(i162)).a(false, true);
                            }
                            lyVar.d = 0L;
                            lyVar.F.f26223b.a(false, true);
                            lyVar.l();
                            return;
                        case 1:
                            gz gzVar = this.f25151b.f26302z0;
                            fz fzVar = gzVar.f24563c;
                            int childCount2 = fzVar.getChildCount();
                            for (int i17 = 0; i17 < childCount2; i17++) {
                                ((nh.c) fzVar.getChildAt(i17)).a(false, true);
                            }
                            gzVar.d = 0L;
                            gzVar.Q.f26220a.a(false, true);
                            gzVar.l();
                            return;
                        case 2:
                            my myVar = this.f25151b.f26282t1;
                            if (myVar != null) {
                                myVar.w();
                                return;
                            }
                            return;
                        default:
                            lz lzVar = this.f25151b;
                            int currentItem = lzVar.h.getCurrentItem();
                            if (currentItem == 0) {
                                yyVar = lzVar.V;
                            } else if (currentItem == 1) {
                                yyVar = lzVar.f26264o0;
                            } else {
                                yyVar = lzVar.G0;
                            }
                            if (yyVar != null) {
                                jq jqVar = yyVar.d;
                                jqVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                jqVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                jqVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                return;
                            }
                            return;
                    }
                }
            });
        } else {
            addView(frameLayout3, w7.y5.d(56, 48.0f, (LocaleController.isRTL ? 3 : 5) | 80, 0.0f, 0.0f, 2.0f, 0.0f));
            org.telegram.ui.Cells.z h02 = org.telegram.ui.ActionBar.h6.h0(AndroidUtilities.dp(56.0f), z(i15), z(i15));
            w7.a6.a(bxVar);
            bxVar.setPadding(0, 0, AndroidUtilities.dp(2.0f), 0);
            bxVar.setBackground(h02);
            bxVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
            bxVar.setFocusable(true);
            frameLayout3.addView(bxVar, w7.y5.d(48, 48.0f, 51, 2.0f, 0.0f, 2.0f, 0.0f));
            view2.setVisibility(8);
        }
        addView(axVar, 0, w7.y5.e(-1, -1, 51));
        ai.p4 p4Var = new ai.p4(context2, 22);
        this.N0 = p4Var;
        p4Var.setBackground(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(6.0f), z(org.telegram.ui.ActionBar.h6.f19292qf)));
        p4Var.setTextColor(z(org.telegram.ui.ActionBar.h6.f19273pf));
        p4Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f));
        p4Var.setGravity(16);
        p4Var.setTextSize(1, 14.0f);
        p4Var.setVisibility(4);
        addView(p4Var, w7.y5.d(-2, -2.0f, 81, 5.0f, 0.0f, 5.0f, 53.0f));
        this.C1 = AndroidUtilities.dp(AndroidUtilities.isTablet() ? 40.0f : 32.0f);
        Field field2 = yu.f30677f;
        yu yuVar = new yu(new xu(context2, d6Var));
        if (yu.f30677f == null) {
            try {
                field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
                try {
                    field.setAccessible(true);
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                field = null;
            }
            yu.f30677f = field;
        }
        Field field3 = yu.f30677f;
        if (field3 != null) {
            try {
                yuVar.f30679a = (ViewTreeObserver.OnScrollChangedListener) field3.get(yuVar);
                yu.f30677f.set(yuVar, yu.f30678g);
            } catch (Exception unused3) {
                yuVar.f30679a = null;
            }
        }
        this.B1 = yuVar;
        yuVar.f30681c.setOnSelectionUpdateListener(new d(this, 10));
        this.A1 = MessagesController.getGlobalEmojiSettings().getInt("selected_page", 0);
        Emoji.loadRecentEmoji();
        uxVar.F(false);
        I(true, z11, z12, false);
        if (Build.VERSION.SDK_INT >= 31) {
            ah.h hVar = new ah.h(false);
            this.f26252j2 = hVar;
            fh.d dVar3 = new fh.d(null);
            dVar3.f9059f = cVar;
            dVar3.d = hVar;
            dVar3.e = -2;
            ah.c cVar2 = new ah.c(dVar3);
            this.f26257l2 = cVar2;
            cVar2.f427i = LiteMode.isEnabled(262144);
            int dp2 = AndroidUtilities.dp(LiteMode.isEnabled(262144) ? 8.0f : 48.0f);
            cVar2.f423b = dp2;
            cVar2.f424c = dp2;
            cVar2.h = this.f26259m2;
        } else {
            ah.c cVar3 = new ah.c(cVar);
            this.f26257l2 = cVar3;
            cVar3.h = this.f26259m2;
            this.f26252j2 = null;
        }
        this.f26255k2 = new lh(this, 1);
        setBlurredBackgroundDrawableFactory(this.f26257l2);
        this.f26259m2.b(this);
        this.f26259m2.f14341a = new gw(this, 0);
    }

    public static void a(lz lzVar, boolean z10) {
        ow owVar = lzVar.f26244h0;
        if (owVar != null) {
            int childCount = owVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = owVar.getChildAt(i10);
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

    public static void c(lz lzVar, uy uyVar, String str) {
        String str2;
        String str3;
        boolean z10;
        String str4;
        my myVar;
        yc ycVar;
        org.telegram.ui.ActionBar.m2 m2Var = lzVar.Y1;
        int i10 = lzVar.f26229c1;
        ArrayList arrayList = lzVar.f26271q1;
        if (uyVar != null) {
            if (uyVar.getSpan() != null) {
                if (lzVar.f26282t1 != null) {
                    long j3 = uyVar.getSpan().documentId;
                    TLRPC.Document document = uyVar.getSpan().document;
                    yx yxVar = uyVar.e;
                    if (yxVar != null && yxVar.f30709i) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (document == null) {
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            yx yxVar2 = (yx) arrayList.get(i11);
                            int i12 = 0;
                            while (true) {
                                ArrayList arrayList2 = yxVar2.f30706c;
                                if (arrayList2 != null && i12 < arrayList2.size()) {
                                    if (((TLRPC.Document) yxVar2.f30706c.get(i12)).f18327id == j3) {
                                        document = (TLRPC.Document) yxVar2.f30706c.get(i12);
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
                    if (!MessageObject.isFreeEmoji(document) && !UserConfig.getInstance(i10).isPremium() && (((myVar = lzVar.f26282t1) == null || !myVar.g()) && !lzVar.U0 && !z10)) {
                        lzVar.M(false);
                        if (m2Var != null) {
                            ycVar = yc.a0(m2Var);
                        } else {
                            ycVar = new yc(lzVar.f26273r, lzVar.Z1);
                        }
                        if (!lzVar.f26246h2 && m2Var != null) {
                            ycVar.J(R.raw.saved_messages, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint2)), LocaleController.getString(R.string.Open), new fw(lzVar, 4)).j();
                        } else {
                            ycVar.q(document, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint)), LocaleController.getString(R.string.PremiumMore), new fw(lzVar, 3)).j();
                        }
                        lzVar.f26246h2 = !lzVar.f26246h2;
                        return;
                    }
                    lzVar.E2 = SystemClock.elapsedRealtime();
                    lzVar.M(true);
                    lzVar.h("animated_" + j3);
                    lzVar.f26282t1.x(j3, document, str5, uyVar.f28941c);
                    return;
                }
                return;
            }
            lzVar.E2 = SystemClock.elapsedRealtime();
            lzVar.M(true);
            if (str != null) {
                str2 = str;
            } else {
                str2 = (String) uyVar.getTag();
            }
            new SpannableStringBuilder().append((CharSequence) str2);
            if (str == null) {
                if (!uyVar.f28941c && (str3 = Emoji.emojiColor.get(str2)) != null) {
                    str2 = g(str2, str3);
                }
                lzVar.h(str2);
                my myVar2 = lzVar.f26282t1;
                if (myVar2 != null) {
                    myVar2.l(Emoji.fixEmoji(str2));
                    return;
                }
                return;
            }
            my myVar3 = lzVar.f26282t1;
            if (myVar3 != null) {
                myVar3.l(Emoji.fixEmoji(str));
            }
        }
    }

    public static void e(lz lzVar, int i10, int i11) {
        s4.c1 K;
        int[] iArr = lzVar.Q0;
        if (i10 == 1) {
            lzVar.n(i11, lzVar.P);
            return;
        }
        my myVar = lzVar.f26282t1;
        if ((myVar == null || !myVar.z()) && !lzVar.J0) {
            wl0 x10 = lzVar.x(i10);
            if (i11 > 0 && x10 != null && x10.getVisibility() == 0 && (K = x10.K(0)) != null && K.f42946a.getTop() + lzVar.f26225b1 >= x10.getPaddingTop()) {
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
                lzVar.Y();
            } else {
                lzVar.y(i10).setTranslationY(Math.max(-AndroidUtilities.dp(48.0f), iArr[i10]));
            }
        }
    }

    public static void f(lz lzVar, boolean z10) {
        int N0;
        ry ryVar = lzVar.f26247i0;
        rw rwVar = lzVar.f26264o0;
        ow owVar = lzVar.f26244h0;
        if (owVar != null && (owVar.getAdapter() instanceof qy)) {
            qy qyVar = (qy) owVar.getAdapter();
            if (!qyVar.f27780s && qyVar.h == 0 && !qyVar.f27782x.isEmpty() && (N0 = ryVar.N0()) != -1 && N0 > ryVar.B() - 5) {
                String str = qyVar.f27781w;
                String str2 = qyVar.f27779r;
                boolean z11 = qyVar.v;
                qyVar.F(str, str2, true, z11, z11);
            }
        }
        my myVar = lzVar.f26282t1;
        if (myVar != null && myVar.z()) {
            boolean z12 = false;
            s4.c1 K = owVar.K(0);
            if (K == null) {
                yy.a(rwVar, true, !z10);
                return;
            }
            if (K.f42946a.getTop() < owVar.getPaddingTop()) {
                z12 = true;
            }
            yy.a(rwVar, z12, !z10);
        } else if (rwVar != null && owVar != null) {
            rwVar.f30712a.a(true, !z10);
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
        String t10 = v7.j.t(str, str2);
        if (str3 != null) {
            t10 = v7.j.t(t10, str3);
        }
        if (z10) {
            return v7.j.t(t10, "\u200d➡");
        }
        return t10;
    }

    public static void j(int i10, View view) {
        if (view == null) {
            return;
        }
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i10);
    }

    public final void A() {
        xw xwVar = this.G0;
        if (xwVar != null) {
            xwVar.b();
        }
        rw rwVar = this.f26264o0;
        if (rwVar != null) {
            rwVar.b();
        }
        lw lwVar = this.V;
        if (lwVar != null) {
            lwVar.b();
        }
    }

    public final void B(boolean z10, boolean z11) {
        xy xyVar;
        boolean z12;
        if (this.A1 != 0 && this.f26292w1) {
            this.A1 = 0;
        }
        if (this.A1 == 0 && this.f26288v1) {
            this.A1 = 1;
        }
        int i10 = this.A1;
        ax axVar = this.h;
        if (i10 != 0 && !z10 && this.e.size() != 1) {
            int i11 = this.A1;
            if (i11 == 1) {
                L(false, false);
                if (!this.f26284u0 && !this.f26287v0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                Q(z12, false);
                if (axVar.getCurrentItem() != 2) {
                    axVar.x(2, false);
                }
                yw ywVar = this.B0;
                if (ywVar != null) {
                    this.S0 = true;
                    int i12 = this.G1;
                    if (i12 >= 0) {
                        ywVar.m(i12);
                    } else {
                        int i13 = this.F1;
                        if (i13 >= 0) {
                            ywVar.m(i13);
                        } else {
                            ywVar.m(this.E1);
                        }
                    }
                    this.S0 = false;
                    this.E0.h1(0, 0);
                }
            } else if (i11 == 2) {
                L(false, false);
                Q(false, false);
                if (axVar.getCurrentItem() != 1) {
                    axVar.x(1, false);
                }
                sx sxVar = this.f26267p0;
                if (sxVar != null) {
                    sxVar.m(0);
                }
                rw rwVar = this.f26264o0;
                if (rwVar != null && (xyVar = rwVar.f30717r) != null) {
                    xyVar.F1(null);
                }
            }
        } else {
            L(true, false);
            Q(false, false);
            if (axVar.getCurrentItem() != 0) {
                axVar.x(0, !z10);
            }
            if (z11) {
                AndroidUtilities.runOnUIThread(new fw(this, 5), 350L);
            }
        }
        M(true);
    }

    @Override
    public final void D(int i10, float f7, float f10, le.f fVar) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = 4;
        if (i10 == 0) {
            q(false);
            float f11 = 1.0f - this.f26220a.e;
            xw xwVar = this.G0;
            xwVar.setAlpha(f11);
            if (f11 > 0.0f) {
                i13 = 0;
            } else {
                i13 = 4;
            }
            xwVar.setVisibility(i13);
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
            ci.m6 m6Var = this.M;
            m6Var.setAlpha(f12);
            m6Var.setTranslationY(AndroidUtilities.dp(30.0f) * f11);
            if (i16 > 0) {
                i15 = 0;
            }
            m6Var.setVisibility(i15);
            R();
            this.f26295x0.invalidate();
        } else if (i10 == 1) {
            l(false);
            float f13 = 1.0f - this.f26223b.e;
            lw lwVar = this.V;
            lwVar.setAlpha(f13);
            if (f13 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            lwVar.setVisibility(i11);
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
            ci.m6 m6Var2 = this.K;
            m6Var2.setAlpha(f14);
            m6Var2.setTranslationY(AndroidUtilities.dp(30.0f) * f13);
            if (i17 > 0) {
                i15 = 0;
            }
            m6Var2.setVisibility(i15);
            R();
            this.J.invalidate();
        }
    }

    public final void E() {
        cz czVar = this.f26299y0;
        if (czVar != null) {
            czVar.l();
        }
        gz gzVar = this.f26302z0;
        if (gzVar != null) {
            gzVar.l();
        }
        if (org.telegram.ui.nt.q().E) {
            org.telegram.ui.nt.q().n();
        }
        org.telegram.ui.nt.q().u();
    }

    public final void F(int i10) {
        my myVar = this.f26282t1;
        if ((myVar != null && myVar.z()) || i10 == 0) {
            return;
        }
        HorizontalScrollView y3 = y(i10);
        this.Q0[i10] = 0;
        y3.setTranslationY(0);
    }

    public final void G(int i10, int i11) {
        lx lxVar = this.Q;
        View m10 = lxVar.m(i10);
        int L0 = lxVar.L0();
        int i12 = 1;
        if ((m10 == null && Math.abs(i10 - L0) > lxVar.J * 9.0f) || !SharedConfig.animationsEnabled()) {
            if (lxVar.L0() < i10) {
                i12 = 0;
            }
            zk0 zk0Var = this.f26224b0;
            zk0Var.f30910b = i12;
            zk0Var.c(i10, i11, false, false);
            return;
        }
        this.J0 = true;
        ci.m1 m1Var = new ci.m1(this, this.P.getContext(), 1);
        m1Var.f43096a = i10;
        m1Var.f13094p = i11;
        lxVar.w0(m1Var);
    }

    public final void H(int i10, int i11) {
        vw vwVar = this.E0;
        View m10 = vwVar.m(i10);
        int L0 = vwVar.L0();
        int i12 = 1;
        if (m10 == null && Math.abs(i10 - L0) > 40) {
            if (vwVar.L0() < i10) {
                i12 = 0;
            }
            zk0 zk0Var = this.f26221a0;
            zk0Var.f30910b = i12;
            zk0Var.c(i10, i11, false, false);
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
            if (((hz) arrayList2.get(i10)).f24863a == 0 && z10) {
                arrayList.add((hz) arrayList2.get(i10));
            }
            if (((hz) arrayList2.get(i10)).f24863a == 1 && z12) {
                arrayList.add((hz) arrayList2.get(i10));
            }
            if (((hz) arrayList2.get(i10)).f24863a == 2 && z11) {
                arrayList.add((hz) arrayList2.get(i10));
            }
            i10++;
        }
        od0 od0Var = this.f26290w;
        if (od0Var != null) {
            if (arrayList.size() > 1) {
                z14 = true;
            }
            AndroidUtilities.updateViewVisibilityAnimated(od0Var, z14, 1.0f, z13);
        }
        ax axVar = this.h;
        if (axVar != null) {
            axVar.setAdapter(null);
            axVar.setAdapter(this.L0);
            if (od0Var != null) {
                od0Var.setViewPager(axVar);
            }
        }
    }

    public final void J(final nh.b bVar, final TLObject tLObject, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final boolean z10, boolean z11) {
        String formatPluralString;
        gz gzVar;
        ly lyVar;
        if (stickerSet != null) {
            if (!z10 || (lyVar = this.S) == null || lyVar.d == stickerSet.f18348id) {
                if (!z10 && (gzVar = this.f26302z0) != null && gzVar.d != stickerSet.f18348id) {
                    return;
                }
                final boolean isStickerPackInstalled = MediaDataController.getInstance(this.f26229c1).isStickerPackInstalled(stickerSet.f18348id);
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
                bVar.f15443h0.a(!isStickerPackInstalled, z11);
                bVar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        int i10;
                        lz lzVar = lz.this;
                        MediaDataController mediaDataController = MediaDataController.getInstance(lzVar.f26229c1);
                        Context context = lzVar.getContext();
                        if (isStickerPackInstalled) {
                            i10 = 0;
                        } else {
                            i10 = 2;
                        }
                        org.telegram.ui.ActionBar.m2 m2Var = lzVar.Y1;
                        FrameLayout frameLayout = lzVar.f26277s;
                        nh.b bVar2 = bVar;
                        TLObject tLObject2 = tLObject;
                        TLRPC.StickerSet stickerSet2 = stickerSet;
                        TLRPC.Document document2 = document;
                        boolean z12 = z10;
                        mediaDataController.toggleStickerSet(context, tLObject2, document2, i10, m2Var, frameLayout, false, true, new i2.c1(lzVar, bVar2, tLObject2, stickerSet2, document2, z12, 9), false);
                        lzVar.J(bVar2, tLObject2, stickerSet2, document2, z12, true);
                    }
                });
            }
        }
    }

    public final void K(long j3, boolean z10, boolean z11) {
        int i10;
        View childAt;
        float f7;
        od0 od0Var = this.f26290w;
        if (od0Var != null) {
            this.f26288v1 = z10;
            this.f26292w1 = z11;
            if (!z11 && !z10) {
                this.f26285u1 = 0L;
            } else {
                this.f26285u1 = j3;
            }
            if (z11) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            LinearLayout linearLayout = od0Var.d;
            if (i10 >= linearLayout.getChildCount()) {
                childAt = null;
            } else {
                childAt = linearLayout.getChildAt(i10);
            }
            if (childAt != null) {
                if (this.f26285u1 != 0) {
                    f7 = 0.15f;
                } else {
                    f7 = 1.0f;
                }
                childAt.setAlpha(f7);
                ax axVar = this.h;
                if (z11) {
                    if (this.f26285u1 != 0 && axVar.getCurrentItem() != 0) {
                        L(true, true);
                        Q(false, true);
                        axVar.x(0, false);
                    }
                } else if (this.f26285u1 != 0 && axVar.getCurrentItem() != 1) {
                    L(false, true);
                    Q(false, true);
                    axVar.x(1, false);
                }
            }
        }
    }

    public final void L(boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        float f12;
        bx bxVar = this.f26294x;
        if (!z10 || bxVar.getTag() != null) {
            if ((!z10 && bxVar.getTag() != null) || this.f26263n2) {
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
            bxVar.setTag(num);
            int i10 = 0;
            float f13 = 0.0f;
            if (z11) {
                if (z10) {
                    bxVar.setVisibility(0);
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.F = animatorSet2;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(bxVar, View.ALPHA, f11);
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(bxVar, View.SCALE_X, f12);
                if (z10) {
                    f13 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(bxVar, View.SCALE_Y, f13));
                this.F.setDuration(200L);
                this.F.setInterpolator(rr.f28023g);
                this.F.addListener(new hx(this, z10, 0));
                this.F.start();
                return;
            }
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            bxVar.setAlpha(f7);
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            bxVar.setScaleX(f10);
            if (z10) {
                f13 = 1.0f;
            }
            bxVar.setScaleY(f13);
            if (!z10) {
                i10 = 4;
            }
            bxVar.setVisibility(i10);
        }
    }

    public final void M(boolean z10) {
        Integer num;
        this.H = 0.0f;
        my myVar = this.f26282t1;
        if (myVar != null && myVar.z()) {
            z10 = false;
        }
        FrameLayout frameLayout = this.f26260n;
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
                this.W.setInterpolator(rr.f28023g);
                this.W.addListener(new r8(this, 19));
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
        TLRPC.Chat chat = MessagesController.getInstance(this.f26229c1).getChat(Long.valueOf(this.f26285u1));
        if (chat != null) {
            ai.p4 p4Var = this.N0;
            if (z10) {
                if (!ChatObject.hasAdminRights(chat) && (tL_chatBannedRights = chat.default_banned_rights) != null && (tL_chatBannedRights.send_stickers || (z11 && tL_chatBannedRights.send_plain))) {
                    org.telegram.ui.ActionBar.m2 m2Var = this.Y1;
                    if (!(m2Var instanceof org.telegram.ui.wn) || !((org.telegram.ui.wn) m2Var).K6()) {
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
            this.J2.setInterpolator(rr.h);
            this.J2.start();
        }
    }

    public final void Q(boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        float f12;
        ImageView imageView = this.f26298y;
        if (imageView != null && !this.f26266o2) {
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
                        this.G.setInterpolator(rr.f28023g);
                        this.G.addListener(new hx(this, z10, 1));
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
            float f11 = this.f26272q2;
            FrameLayout frameLayout = this.f26260n;
            if (f11 >= 0.0f) {
                f10 += getMeasuredHeight() - this.f26272q2;
            } else if (frameLayout.getTop() - f10 < 0.0f || !this.f26293w2) {
                f10 = 0.0f;
            }
            float lerp = (-f10) + AndroidUtilities.lerp(AndroidUtilities.dp(50.0f), -this.f26269p2, this.F2.e);
            frameLayout.setTranslationY(lerp);
            if (this.f26231d0) {
                this.f26273r.setTranslationY(lerp);
            }
        }
    }

    public final void S() {
        yy yyVar;
        boolean z10;
        int z11;
        int z12;
        int z13;
        int z14;
        int z15;
        int z16;
        int z17;
        int z18;
        aw awVar;
        int z19;
        int z20;
        int z21;
        int z22;
        int z23;
        int z24;
        int z25;
        int z26;
        int z27;
        boolean z28 = this.f26284u0;
        View view = this.v;
        if (!z28) {
            setBackground(null);
            view.setBackground(null);
        } else if (!AndroidUtilities.isInMultiwindow && !this.N1) {
            int i10 = org.telegram.ui.ActionBar.h6.He;
            setBackgroundColor(z(i10));
            if (this.f26231d0) {
                view.setBackgroundColor(z(i10));
            }
        } else {
            Drawable background = getBackground();
            if (background != null) {
                background.setColorFilter(new PorterDuffColorFilter(z(org.telegram.ui.ActionBar.h6.He), PorterDuff.Mode.MULTIPLY));
            }
        }
        px pxVar = this.I;
        if (pxVar != null) {
            if (this.f26284u0) {
                pxVar.setBackgroundColor(z(org.telegram.ui.ActionBar.h6.He));
                this.O.setBackgroundColor(z(org.telegram.ui.ActionBar.h6.Ke));
            } else {
                pxVar.setBackground(null);
            }
        }
        yu yuVar = this.B1;
        if (yuVar != null) {
            yuVar.f30681c.a();
        }
        int i11 = 0;
        while (true) {
            yyVar = this.V;
            z10 = this.f26249i2;
            if (i11 >= 3) {
                break;
            }
            if (i11 == 0) {
                yyVar = this.G0;
            } else if (i11 != 1) {
                yyVar = this.f26264o0;
            }
            if (yyVar != null) {
                jq jqVar = yyVar.d;
                FrameLayout frameLayout = yyVar.f30716n;
                View view2 = yyVar.f30715f;
                if (this.f26284u0) {
                    view2.setBackgroundColor(z(org.telegram.ui.ActionBar.h6.He));
                } else {
                    view2.setBackground(null);
                }
                yyVar.e.setBackgroundColor(z(org.telegram.ui.ActionBar.h6.Ke));
                kn0 kn0Var = yyVar.f30714c;
                if (z10) {
                    z24 = v(0.4f);
                } else {
                    z24 = z(org.telegram.ui.ActionBar.h6.Je);
                }
                kn0Var.a(z24);
                Drawable background2 = frameLayout.getBackground();
                if (z10) {
                    z25 = v(0.06f);
                } else {
                    z25 = z(org.telegram.ui.ActionBar.h6.Ie);
                }
                org.telegram.ui.ActionBar.h6.w1(z25, background2);
                frameLayout.invalidate();
                if (z10) {
                    z26 = v(0.45f);
                } else {
                    z26 = z(org.telegram.ui.ActionBar.h6.Je);
                }
                jqVar.setHintTextColor(z26);
                if (z10) {
                    z27 = v(0.8f);
                } else {
                    z27 = z(org.telegram.ui.ActionBar.h6.G6);
                }
                jqVar.setTextColor(z27);
            }
            i11++;
        }
        Paint paint = this.f26279s1;
        if (paint != null) {
            paint.setColor(z(org.telegram.ui.ActionBar.h6.f18997af));
        }
        xx xxVar = this.P;
        if (xxVar != null) {
            xxVar.setGlowColor(z(org.telegram.ui.ActionBar.h6.He));
        }
        uw uwVar = this.D0;
        if (uwVar != null) {
            uwVar.setGlowColor(z(org.telegram.ui.ActionBar.h6.He));
        }
        yw ywVar = this.B0;
        if (ywVar != null) {
            ywVar.setIndicatorColor(z(org.telegram.ui.ActionBar.h6.Qe));
            ywVar.setUnderlineColor(z(org.telegram.ui.ActionBar.h6.Ke));
            if (this.f26284u0) {
                ywVar.setBackgroundColor(z(org.telegram.ui.ActionBar.h6.He));
            } else {
                ywVar.setBackground(null);
            }
        }
        sx sxVar = this.f26267p0;
        if (sxVar != null) {
            sxVar.setIndicatorColor(z(org.telegram.ui.ActionBar.h6.Qe));
            sxVar.setUnderlineColor(z(org.telegram.ui.ActionBar.h6.Ke));
            if (this.f26284u0) {
                sxVar.setBackgroundColor(z(org.telegram.ui.ActionBar.h6.He));
            } else {
                sxVar.setBackground(null);
            }
        }
        bx bxVar = this.f26294x;
        if (bxVar != null) {
            if (z10) {
                z23 = v(0.6f);
            } else {
                z23 = z(org.telegram.ui.ActionBar.h6.Re);
            }
            bxVar.setColorFilter(new PorterDuffColorFilter(z23, PorterDuff.Mode.MULTIPLY));
            if (yyVar == null) {
                Drawable background3 = bxVar.getBackground();
                int i12 = org.telegram.ui.ActionBar.h6.He;
                org.telegram.ui.ActionBar.h6.B1(background3, z(i12), false);
                org.telegram.ui.ActionBar.h6.B1(bxVar.getBackground(), z(i12), true);
            }
        }
        ImageView imageView = this.f26298y;
        if (imageView != null) {
            if (z10) {
                z22 = v(0.6f);
            } else {
                z22 = z(org.telegram.ui.ActionBar.h6.Re);
            }
            imageView.setColorFilter(new PorterDuffColorFilter(z22, PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.E;
        if (imageView2 != null) {
            if (z10) {
                z21 = v(0.6f);
            } else {
                z21 = z(org.telegram.ui.ActionBar.h6.Re);
            }
            imageView2.setColorFilter(new PorterDuffColorFilter(z21, PorterDuff.Mode.MULTIPLY));
        }
        ai.p4 p4Var = this.N0;
        if (p4Var != null) {
            ((ShapeDrawable) p4Var.getBackground()).getPaint().setColor(z(org.telegram.ui.ActionBar.h6.f19292qf));
            p4Var.setTextColor(z(org.telegram.ui.ActionBar.h6.f19273pf));
        }
        qy qyVar = this.f26250j0;
        if (qyVar != null) {
            sy syVar = qyVar.e;
            ImageView imageView3 = syVar.f28331a;
            int i13 = org.telegram.ui.ActionBar.h6.Le;
            imageView3.setColorFilter(new PorterDuffColorFilter(z(i13), PorterDuff.Mode.MULTIPLY));
            syVar.f28332b.setTextColor(z(i13));
            syVar.f28333c.setProgressColor(z(org.telegram.ui.ActionBar.h6.f19116h6));
        }
        this.f26236e2 = new PorterDuffColorFilter(z(org.telegram.ui.ActionBar.h6.Oh), PorterDuff.Mode.SRC_IN);
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
                z19 = z(org.telegram.ui.ActionBar.h6.Ne);
            }
            org.telegram.ui.ActionBar.h6.y1(drawable, z19, false);
            Drawable drawable2 = drawableArr[i14];
            if (z10) {
                z20 = v(0.8f);
            } else {
                z20 = z(org.telegram.ui.ActionBar.h6.Oe);
            }
            org.telegram.ui.ActionBar.h6.y1(drawable2, z20, true);
            i14++;
        }
        if (pxVar != null && (awVar = pxVar.f23991y) != null) {
            awVar.d();
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
                z17 = z(org.telegram.ui.ActionBar.h6.Me);
            }
            org.telegram.ui.ActionBar.h6.y1(drawable3, z17, false);
            Drawable drawable4 = drawableArr2[i15];
            if (z10) {
                z18 = v(0.8f);
            } else {
                z18 = z(org.telegram.ui.ActionBar.h6.Oe);
            }
            org.telegram.ui.ActionBar.h6.y1(drawable4, z18, true);
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
                z15 = z(org.telegram.ui.ActionBar.h6.Me);
            }
            org.telegram.ui.ActionBar.h6.y1(drawable5, z15, false);
            Drawable drawable6 = drawableArr3[i16];
            if (z10) {
                z16 = v(0.8f);
            } else {
                z16 = z(org.telegram.ui.ActionBar.h6.Oe);
            }
            org.telegram.ui.ActionBar.h6.y1(drawable6, z16, true);
            i16++;
        }
        org.telegram.ui.ActionBar.s5 s5Var = this.a2;
        if (s5Var != null) {
            if (z10) {
                z13 = v(0.4f);
            } else {
                z13 = z(org.telegram.ui.ActionBar.h6.Ne);
            }
            org.telegram.ui.ActionBar.h6.y1(s5Var, z13, false);
            if (z10) {
                z14 = v(0.8f);
            } else {
                z14 = z(org.telegram.ui.ActionBar.h6.Oe);
            }
            org.telegram.ui.ActionBar.h6.y1(s5Var, z14, true);
        }
        org.telegram.ui.ActionBar.s5 s5Var2 = this.f26226b2;
        if (s5Var2 != null) {
            if (z10) {
                z11 = v(0.4f);
            } else {
                z11 = z(org.telegram.ui.ActionBar.h6.Qe);
            }
            org.telegram.ui.ActionBar.h6.y1(s5Var2, z11, false);
            if (z10) {
                z12 = v(0.8f);
            } else {
                z12 = z(org.telegram.ui.ActionBar.h6.Qe);
            }
            org.telegram.ui.ActionBar.h6.y1(s5Var2, z12, true);
        }
    }

    public final void T() {
        xx xxVar = this.P;
        if (xxVar != null) {
            for (int i10 = 0; i10 < xxVar.getChildCount(); i10++) {
                View childAt = xxVar.getChildAt(i10);
                if (childAt instanceof dy) {
                    ((dy) childAt).a(true);
                }
            }
        }
    }

    public final void U(int i10) {
        int i11;
        if (!this.f26238f0) {
            int i12 = -1;
            if (i10 != -1) {
                int size = getRecentEmoji().size() + (this.f26231d0 ? 1 : 0);
                ux uxVar = this.R;
                int i13 = uxVar.f28930c;
                ArrayList arrayList = uxVar.f28936x;
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
                        ArrayList<yx> emojipacks = getEmojipacks();
                        int size2 = arrayList.size() - 1;
                        while (true) {
                            if (size2 < 0) {
                                break;
                            } else if (((Integer) arrayList.get(size2)).intValue() <= i10) {
                                yx yxVar = (yx) this.f26271q1.get(size2);
                                while (i14 < emojipacks.size()) {
                                    long j3 = emojipacks.get(i14).f30705b.f18348id;
                                    long j10 = yxVar.f30705b.f18348id;
                                    if (j3 == j10 && (!yxVar.f30708g || (!yxVar.f30707f && !this.f26268p1.contains(Long.valueOf(j10))))) {
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
        xy xyVar;
        int i11;
        boolean z12;
        boolean z13;
        sx sxVar = this.f26267p0;
        int currentPosition = sxVar.getCurrentPosition();
        int i12 = this.f26274r0;
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
        boolean isEmpty = this.f26248i1.isEmpty();
        sxVar.d(false);
        this.f26274r0 = -2;
        this.f26278s0 = -2;
        this.f26281t0 = -2;
        Drawable[] drawableArr = this.Z0;
        if (!isEmpty) {
            this.f26274r0 = 0;
            sxVar.b(0, drawableArr[0]).setContentDescription(LocaleController.getString(R.string.RecentStickers));
            i10 = 1;
        } else {
            i10 = 0;
        }
        this.f26278s0 = i10;
        sxVar.b(1, drawableArr[1]).setContentDescription(LocaleController.getString(R.string.FeaturedGifs));
        this.f26281t0 = i10 + 1;
        AndroidUtilities.dp(13.0f);
        AndroidUtilities.dp(11.0f);
        int i13 = this.f26229c1;
        ArrayList<String> arrayList = MessagesController.getInstance(i13).gifSearchEmojies;
        int size = arrayList.size();
        int i14 = 0;
        while (i14 < size) {
            String str = arrayList.get(i14);
            Emoji.EmojiDrawable emojiDrawable = Emoji.getEmojiDrawable(str);
            if (emojiDrawable != null) {
                TLRPC.Document emojiAnimatedSticker = MediaDataController.getInstance(i13).getEmojiAnimatedSticker(str);
                String h = hg.c.h(i14 + 3, "tab");
                int i15 = sxVar.f28826x;
                sxVar.f28826x = i15 + 1;
                nx0 nx0Var = (nx0) sxVar.f28816n.get(h);
                if (nx0Var != null) {
                    sxVar.g(h, nx0Var, i15);
                    i11 = currentPosition;
                    z12 = z11;
                } else {
                    i11 = currentPosition;
                    z12 = z11;
                    nx0Var = new nx0(sxVar.getContext(), 2);
                    nx0Var.setFocusable(true);
                    nx0Var.setOnClickListener(new nm0(sxVar, 2));
                    nx0Var.setExpanded(sxVar.f28809f0);
                    nx0Var.a(sxVar.f28812i0);
                    sxVar.e.addView(nx0Var, i15);
                }
                nx0Var.d = false;
                nx0Var.setTag(R.id.index_tag, Integer.valueOf(i15));
                nx0Var.setTag(R.id.parent_tag, emojiDrawable);
                nx0Var.setTag(R.id.object_tag, emojiAnimatedSticker);
                if (i15 == sxVar.f28827y) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                nx0Var.setSelected(z13);
                sxVar.h.put(h, nx0Var);
                nx0Var.setContentDescription(str);
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
        sxVar.h();
        sxVar.q();
        if (z10 && isEmpty) {
            sxVar.m(this.f26278s0);
            rw rwVar = this.f26264o0;
            if (rwVar != null && (xyVar = rwVar.f30717r) != null) {
                xyVar.F1(null);
                return;
            }
            return;
        }
        WeakHashMap weakHashMap = r0.i0.f42114a;
        if (sxVar.isLaidOut()) {
            if (!isEmpty && !z14) {
                sxVar.k(i16 + 1, 0);
            } else if (isEmpty && z14) {
                sxVar.k(i16 - 1, 0);
            }
        }
    }

    public final void W() {
        qy qyVar;
        int size = this.f26248i1.size();
        long calcDocumentsHash = MediaDataController.calcDocumentsHash(this.f26248i1, Integer.MAX_VALUE);
        ArrayList<TLRPC.Document> recentGifs = MediaDataController.getInstance(this.f26229c1).getRecentGifs();
        this.f26248i1 = recentGifs;
        long calcDocumentsHash2 = MediaDataController.calcDocumentsHash(recentGifs, Integer.MAX_VALUE);
        if ((this.f26267p0 != null && size == 0 && !this.f26248i1.isEmpty()) || (size != 0 && this.f26248i1.isEmpty())) {
            V();
        }
        if ((size != this.f26248i1.size() || calcDocumentsHash != calcDocumentsHash2) && (qyVar = this.f26261n0) != null) {
            qyVar.l();
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
        yw ywVar = this.B0;
        if (ywVar != null) {
            ub1 ub1Var = ywVar.e;
            if (ywVar.f28823s != null) {
                return;
            }
            this.F1 = -2;
            this.G1 = -2;
            this.H1 = -2;
            this.I1 = -2;
            this.f26234e0 = false;
            this.E1 = 0;
            int currentPosition = ywVar.getCurrentPosition();
            boolean z16 = true;
            if (getParent() != null && getVisibility() == 0 && (this.f26300y1.size() != 0 || this.f26303z1.size() != 0)) {
                z11 = true;
            } else {
                z11 = false;
            }
            ywVar.d(z11);
            int i11 = this.f26229c1;
            MediaDataController mediaDataController = MediaDataController.getInstance(i11);
            SharedPreferences emojiSettings = MessagesController.getEmojiSettings(i11);
            ArrayList arrayList3 = this.f26258m1;
            arrayList3.clear();
            ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = mediaDataController.getFeaturedStickerSets();
            int size = featuredStickerSets.size();
            for (int i12 = 0; i12 < size; i12++) {
                TLRPC.StickerSetCovered stickerSetCovered = featuredStickerSets.get(i12);
                if (!mediaDataController.isStickerPackInstalled(stickerSetCovered.set.f18348id)) {
                    arrayList3.add(stickerSetCovered);
                }
            }
            jz jzVar = this.F0;
            if (jzVar != null) {
                jzVar.l();
            }
            boolean isEmpty = featuredStickerSets.isEmpty();
            long j3 = 0;
            Drawable[] drawableArr = this.Y0;
            if (!isEmpty && (arrayList3.isEmpty() || emojiSettings.getLong("featured_hidden", 0L) == featuredStickerSets.get(0).set.f18348id)) {
                if (mediaDataController.getUnreadStickerSets().isEmpty()) {
                    i10 = 2;
                } else {
                    i10 = 3;
                }
                nx0 c10 = ywVar.c(i10, drawableArr[i10]);
                c10.h.setText(LocaleController.getString(R.string.FeaturedStickersShort));
                c10.setContentDescription(LocaleController.getString(R.string.FeaturedStickers));
                int i13 = this.E1;
                this.H1 = i13;
                this.E1 = i13 + 1;
            }
            if (!this.f26254k1.isEmpty()) {
                int i14 = this.E1;
                this.G1 = i14;
                this.E1 = i14 + 1;
                nx0 c11 = ywVar.c(1, drawableArr[1]);
                c11.h.setText(LocaleController.getString(R.string.FavoriteStickersShort));
                c11.setContentDescription(LocaleController.getString(R.string.FavoriteStickers));
            }
            if (!this.f26251j1.isEmpty()) {
                int i15 = this.E1;
                this.F1 = i15;
                this.E1 = i15 + 1;
                nx0 c12 = ywVar.c(0, drawableArr[0]);
                c12.h.setText(LocaleController.getString(R.string.RecentStickersShort));
                c12.setContentDescription(LocaleController.getString(R.string.RecentStickers));
            }
            ArrayList arrayList4 = this.f26232d1;
            arrayList4.clear();
            org.telegram.ui.ActionBar.d6 d6Var = null;
            this.f26245h1 = null;
            this.f26239f1 = -1;
            this.f26235e1 = -10;
            if (this.G2 == null || z10) {
                this.G2 = new ArrayList(mediaDataController.getStickerSets(0));
            }
            ArrayList<TLRPC.TL_messages_stickerSet> arrayList5 = this.G2;
            int i16 = 0;
            while (true) {
                TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.f26296x1;
                if (i16 >= stickerSetCoveredArr.length) {
                    break;
                }
                TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCoveredArr[i16];
                long j10 = j3;
                if (stickerSetCovered2 != null) {
                    TLRPC.TL_messages_stickerSet stickerSetById = mediaDataController.getStickerSetById(stickerSetCovered2.set.f18348id);
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
                long j12 = MessagesController.getEmojiSettings(i11).getLong("group_hide_stickers_" + this.J1.f18322id, -1L);
                TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(this.J1.f18322id));
                if (chat != null && this.J1.stickerset != null && ChatObject.hasAdminRights(chat)) {
                    TLRPC.StickerSet stickerSet3 = this.J1.stickerset;
                    if (stickerSet3 != null) {
                        if (j12 == stickerSet3.f18348id) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        this.f26242g1 = z15;
                    }
                } else {
                    if (j12 != -1) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    this.f26242g1 = z14;
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
                        if (this.f26242g1) {
                            this.f26235e1 = arrayList4.size();
                            arrayList4.add(tL_messages_stickerSet3);
                        } else {
                            this.f26235e1 = 0;
                            arrayList4.add(0, tL_messages_stickerSet3);
                        }
                        if (!this.J1.can_set_stickers) {
                            tL_messages_stickerSet3 = null;
                        }
                        this.f26245h1 = tL_messages_stickerSet3;
                    }
                } else if (chatFull.can_set_stickers) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = new TLRPC.TL_messages_stickerSet();
                    if (this.f26242g1) {
                        this.f26235e1 = arrayList4.size();
                        arrayList4.add(tL_messages_stickerSet4);
                    } else {
                        this.f26235e1 = 0;
                        arrayList4.add(0, tL_messages_stickerSet4);
                    }
                }
            }
            int i18 = 0;
            while (i18 < arrayList4.size()) {
                if (i18 == this.f26235e1) {
                    TLRPC.Chat chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(this.J1.f18322id));
                    if (chat2 == null) {
                        arrayList4.remove(0);
                        i18--;
                    } else {
                        this.f26234e0 = z16;
                        String str = "chat" + chat2.f18321id;
                        int i19 = ywVar.f28826x;
                        ywVar.f28826x = i19 + 1;
                        nx0 nx0Var = (nx0) ywVar.f28816n.get(str);
                        if (nx0Var != null) {
                            ywVar.g(str, nx0Var, i19);
                        } else {
                            nx0Var = new nx0(ywVar.getContext(), 0);
                            nx0Var.setFocusable(z16);
                            nx0Var.setOnClickListener(new nm0(ywVar, 0));
                            ub1Var.addView(nx0Var, i19);
                            nx0Var.f26816w = z16;
                            h9 h9Var = new h9(d6Var);
                            h9Var.u(AndroidUtilities.dp(14.0f));
                            h9Var.k(UserConfig.selectedAccount, chat2);
                            int i20 = ywVar.f28800a;
                            w9 w9Var = nx0Var.e;
                            w9Var.setLayerNum(i20);
                            w9Var.e(chat2, h9Var);
                            w9Var.setAspectFit(z16);
                            nx0Var.setExpanded(ywVar.f28809f0);
                            nx0Var.a(ywVar.f28812i0);
                            nx0Var.h.setText(chat2.title);
                        }
                        nx0Var.d = z16;
                        nx0Var.setTag(R.id.index_tag, Integer.valueOf(i19));
                        if (i19 == ywVar.f28827y) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        nx0Var.setSelected(z13);
                        ywVar.h.put(str, nx0Var);
                    }
                } else {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet5 = (TLRPC.TL_messages_stickerSet) arrayList4.get(i18);
                    TLRPC.StickerSet stickerSet5 = tL_messages_stickerSet5.set;
                    if (stickerSet5 != null && stickerSet5.thumb_document_id != j11) {
                        for (int i21 = 0; i21 < tL_messages_stickerSet5.documents.size(); i21++) {
                            document = tL_messages_stickerSet5.documents.get(i21);
                            if (document != null && tL_messages_stickerSet5.set.thumb_document_id == document.f18327id) {
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
                    String str2 = "set" + tL_messages_stickerSet5.set.f18348id;
                    int i22 = ywVar.f28826x;
                    ywVar.f28826x = i22 + 1;
                    nx0 nx0Var2 = (nx0) ywVar.f28816n.get(str2);
                    if (nx0Var2 != null) {
                        ywVar.g(str2, nx0Var2, i22);
                    } else {
                        nx0Var2 = new nx0(ywVar.getContext(), 0);
                        nx0Var2.setFocusable(z16);
                        nx0Var2.setOnClickListener(new nm0(ywVar, 1));
                        nx0Var2.setExpanded(ywVar.f28809f0);
                        nx0Var2.a(ywVar.f28812i0);
                        ub1Var.addView(nx0Var2, i22);
                    }
                    nx0Var2.e.setLayerNum(ywVar.f28800a);
                    nx0Var2.d = false;
                    nx0Var2.setTag(closestPhotoSizeWithSize);
                    nx0Var2.setTag(R.id.index_tag, Integer.valueOf(i22));
                    nx0Var2.setTag(R.id.parent_tag, tL_messages_stickerSet5);
                    nx0Var2.setTag(R.id.object_tag, document);
                    if (i22 == ywVar.f28827y) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    nx0Var2.setSelected(z12);
                    ywVar.h.put(str2, nx0Var2);
                    nx0Var2.setContentDescription(tL_messages_stickerSet5.set.title + ", " + LocaleController.getString(R.string.AccDescrStickerSet));
                }
                i18++;
                z16 = true;
                d6Var = null;
            }
            ywVar.h();
            ywVar.q();
            if (currentPosition != 0) {
                ywVar.k(currentPosition, currentPosition);
            }
            o();
        }
    }

    public final void Y() {
        boolean z10;
        int i10;
        zw zwVar = this.C0;
        yw ywVar = this.B0;
        if (ywVar != null && zwVar == null && this.f26282t1 != null) {
            ywVar.setTranslationY(this.f26282t1.p() * (-AndroidUtilities.dp(50.0f)));
        }
        if (zwVar == null) {
            return;
        }
        if (getVisibility() == 0 && this.K0 && this.f26282t1.p() != 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        zwVar.setVisibility(i10);
        if (z10) {
            Rect rect = this.f26297x2;
            rect.setEmpty();
            this.h.getChildVisibleRect(this.f26295x0, rect, null);
            float p5 = this.f26282t1.p() * AndroidUtilities.dp(50.0f);
            int i11 = rect.left;
            if (i11 != 0 || p5 != 0.0f) {
                this.X1 = false;
            }
            zwVar.setTranslationX(i11);
            float translationY = (((getTranslationY() + getTop()) - zwVar.getTop()) - ywVar.getExpandedOffset()) - p5;
            if (zwVar.getTranslationY() != translationY) {
                zwVar.setTranslationY(translationY);
                zwVar.invalidate();
            }
        }
        if (this.X1 && z10 && this.P0) {
            ywVar.i(this.W1, true);
            return;
        }
        this.X1 = false;
        ywVar.i(this.W1, false);
    }

    public final void Z() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        org.telegram.ui.Cells.s3 s3Var;
        LongSparseArray longSparseArray = this.f26303z1;
        LongSparseArray longSparseArray2 = this.f26300y1;
        int i10 = this.f26229c1;
        uw uwVar = this.D0;
        if (uwVar != null) {
            try {
                int childCount = uwVar.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = uwVar.getChildAt(i11);
                    if ((childAt instanceof org.telegram.ui.Cells.s3) && ((gl0) uwVar.T(childAt)) != null) {
                        org.telegram.ui.Cells.s3 s3Var2 = (org.telegram.ui.Cells.s3) childAt;
                        ArrayList<Long> unreadStickerSets = MediaDataController.getInstance(i10).getUnreadStickerSets();
                        TLRPC.StickerSetCovered stickerSet = s3Var2.getStickerSet();
                        if (unreadStickerSets != null && unreadStickerSets.contains(Long.valueOf(stickerSet.set.f18348id))) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        int i12 = 0;
                        while (true) {
                            TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.f26296x1;
                            if (i12 < stickerSetCoveredArr.length) {
                                TLRPC.StickerSetCovered stickerSetCovered = stickerSetCoveredArr[i12];
                                if (stickerSetCovered != null) {
                                    s3Var = s3Var2;
                                    if (stickerSetCovered.set.f18348id == stickerSet.set.f18348id) {
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
                            MediaDataController.getInstance(i10).markFeaturedStickersByIdAsRead(false, stickerSet.set.f18348id);
                        }
                        if (longSparseArray2.indexOfKey(stickerSet.set.f18348id) >= 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (longSparseArray.indexOfKey(stickerSet.set.f18348id) >= 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z12 || z13) {
                            if (z12 && s3Var2.f21043r) {
                                longSparseArray2.remove(stickerSet.set.f18348id);
                                z12 = false;
                            } else if (z13 && !s3Var2.f21043r) {
                                longSparseArray.remove(stickerSet.set.f18348id);
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
        this.f26272q2 = f7;
        R();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        Utilities.Callback callback;
        TLRPC.StickerSet stickerSet;
        int i12 = NotificationCenter.stickersDidLoad;
        ux uxVar = this.R;
        fw fwVar = this.L2;
        if (i10 == i12) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (this.f26299y0 != null) {
                    X(((Boolean) objArr[1]).booleanValue());
                    Z();
                    E();
                    o();
                }
            } else if (((Integer) objArr[0]).intValue() == 5) {
                if (((Boolean) objArr[1]).booleanValue()) {
                    AndroidUtilities.cancelRunOnUIThread(fwVar);
                    AndroidUtilities.runOnUIThread(fwVar, 100L);
                    return;
                }
                uxVar.F(false);
            }
        } else if (i10 == NotificationCenter.groupPackUpdated) {
            long longValue = ((Long) objArr[0]).longValue();
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            TLRPC.ChatFull chatFull = this.J1;
            if (chatFull != null && chatFull.f18322id == longValue && booleanValue) {
                uxVar.F(true);
            }
        } else if (i10 == NotificationCenter.recentDocumentsDidLoad) {
            boolean booleanValue2 = ((Boolean) objArr[0]).booleanValue();
            int intValue = ((Integer) objArr[1]).intValue();
            if (booleanValue2 || intValue == 0 || intValue == 2) {
                k(booleanValue2);
            }
        } else if (i10 == NotificationCenter.featuredStickersDidLoad) {
            Z();
            od0 od0Var = this.f26290w;
            if (od0Var != null) {
                int childCount = od0Var.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    od0Var.getChildAt(i13).invalidate();
                }
            }
            X(false);
        } else if (i10 == NotificationCenter.featuredEmojiDidLoad) {
            if (uxVar != null) {
                uxVar.F(false);
            }
        } else {
            int i14 = NotificationCenter.groupStickersDidLoad;
            ly lyVar = this.S;
            if (i10 == i14) {
                Long l4 = (Long) objArr[0];
                long longValue2 = l4.longValue();
                if (objArr.length > 1) {
                    tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) objArr[1];
                } else {
                    tL_messages_stickerSet = null;
                }
                if (tL_messages_stickerSet != null) {
                    gz gzVar = this.f26302z0;
                    if (gzVar != null && gzVar.d == longValue2 && gzVar.f24564f.size() < tL_messages_stickerSet.documents.size()) {
                        gzVar.f24564f = tL_messages_stickerSet.documents;
                        gzVar.l();
                    }
                    if (lyVar != null && lyVar.d == longValue2 && lyVar.f26213f.size() < tL_messages_stickerSet.documents.size()) {
                        lyVar.f26213f = tL_messages_stickerSet.documents;
                        lyVar.l();
                    }
                }
                TLRPC.ChatFull chatFull2 = this.J1;
                if (chatFull2 != null && (stickerSet = chatFull2.stickerset) != null && stickerSet.f18348id == longValue2) {
                    X(false);
                }
                HashMap hashMap = this.f26275r1;
                if (hashMap.containsKey(l4) && objArr.length >= 2 && ((Utilities.Callback) hashMap.get(l4)) != null && tL_messages_stickerSet != null && (callback = (Utilities.Callback) hashMap.remove(l4)) != null) {
                    callback.run(tL_messages_stickerSet);
                }
                AndroidUtilities.cancelRunOnUIThread(fwVar);
                AndroidUtilities.runOnUIThread(fwVar, 100L);
                return;
            }
            int i15 = NotificationCenter.emojiLoaded;
            xx xxVar = this.P;
            if (i10 == i15) {
                uw uwVar = this.D0;
                if (uwVar != null) {
                    int childCount2 = uwVar.getChildCount();
                    for (int i16 = 0; i16 < childCount2; i16++) {
                        View childAt = uwVar.getChildAt(i16);
                        if ((childAt instanceof org.telegram.ui.Cells.o8) || (childAt instanceof org.telegram.ui.Cells.f8)) {
                            childAt.invalidate();
                        }
                    }
                }
                if (xxVar != null) {
                    xxVar.invalidate();
                    int childCount3 = xxVar.getChildCount();
                    for (int i17 = 0; i17 < childCount3; i17++) {
                        View childAt2 = xxVar.getChildAt(i17);
                        if (childAt2 instanceof uy) {
                            childAt2.invalidate();
                        }
                    }
                }
                yu yuVar = this.B1;
                if (yuVar != null) {
                    yuVar.f30681c.invalidate();
                }
                sx sxVar = this.f26267p0;
                if (sxVar != null) {
                    ub1 ub1Var = sxVar.e;
                    int childCount4 = ub1Var.getChildCount();
                    for (int i18 = 0; i18 < childCount4; i18++) {
                        ub1Var.getChildAt(i18).invalidate();
                    }
                }
            } else if (i10 == NotificationCenter.newEmojiSuggestionsAvailable) {
                if (xxVar != null && this.f26231d0) {
                    if ((this.V.f30714c.f25810k == 2 || xxVar.getAdapter() == lyVar) && !TextUtils.isEmpty(lyVar.v)) {
                        lyVar.F(lyVar.v, true);
                    }
                }
            } else if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                if (uxVar != null) {
                    uxVar.F(false);
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
            if (this.f26260n.getVisibility() != 8 && !this.f26284u0 && this.f26291w0) {
                canvas.drawColor(i0.a.k(-1, 25));
            }
            boolean drawChild = super.drawChild(canvas, view, j3);
            float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(this.f26269p2);
            if (navigationBarThirdButtonsFactor > 0.0f) {
                int l1 = org.telegram.ui.ActionBar.h6.l1(navigationBarThirdButtonsFactor, z(org.telegram.ui.ActionBar.h6.He));
                int i10 = this.B2;
                GradientDrawable gradientDrawable = this.A2;
                if (i10 != l1) {
                    gradientDrawable.setColors(new int[]{l1, org.telegram.ui.ActionBar.h6.l1(0.66f, l1), i0.a.k(l1, 0)});
                    this.B2 = l1;
                }
                gradientDrawable.setBounds(0, getMeasuredHeight() - this.f26269p2, getMeasuredWidth(), getMeasuredHeight());
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

    public ArrayList<yx> getEmojipacks() {
        ArrayList<yx> arrayList = new ArrayList<>();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f26271q1;
            if (i10 < arrayList2.size()) {
                yx yxVar = (yx) arrayList2.get(i10);
                boolean z10 = yxVar.f30708g;
                ArrayList arrayList3 = this.f26268p1;
                if ((!z10 && (yxVar.f30707f || arrayList3.contains(Long.valueOf(yxVar.f30705b.f18348id)))) || (yxVar.f30708g && !yxVar.f30707f && !arrayList3.contains(Long.valueOf(yxVar.f30705b.f18348id)))) {
                    arrayList.add(yxVar);
                }
                i10++;
            } else {
                return arrayList;
            }
        }
    }

    public ArrayList<String> getRecentEmoji() {
        if (this.f26230c2) {
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
        yw ywVar = this.B0;
        if (ywVar == null) {
            return 0.0f;
        }
        return ywVar.getExpandedOffset();
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
                if (!this.f26230c2) {
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
        ix ixVar = new ix(getContext(), i11);
        ixVar.f43096a = !z10 ? 1 : 0;
        w(i10).w0(ixVar);
    }

    public final void k(boolean z10) {
        if (z10) {
            W();
            return;
        }
        int size = this.f26251j1.size();
        int size2 = this.f26254k1.size();
        int i10 = this.f26229c1;
        this.f26251j1 = MediaDataController.getInstance(i10).getRecentStickers(0, true);
        this.f26254k1 = MediaDataController.getInstance(i10).getRecentStickers(2);
        if (UserConfig.getInstance(i10).isPremium()) {
            this.l1 = MediaDataController.getInstance(i10).getRecentStickers(7);
        } else {
            this.l1 = new ArrayList();
        }
        for (int i11 = 0; i11 < this.f26254k1.size(); i11++) {
            TLRPC.Document document = (TLRPC.Document) this.f26254k1.get(i11);
            int i12 = 0;
            while (true) {
                if (i12 < this.f26251j1.size()) {
                    TLRPC.Document document2 = (TLRPC.Document) this.f26251j1.get(i12);
                    if (document2.dc_id == document.dc_id && document2.f18327id == document.f18327id) {
                        this.f26251j1.remove(i12);
                        break;
                    }
                    i12++;
                }
            }
        }
        if (MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            int i13 = 0;
            while (i13 < this.f26254k1.size()) {
                if (MessageObject.isPremiumSticker((TLRPC.Document) this.f26254k1.get(i13))) {
                    this.f26254k1.remove(i13);
                    i13--;
                }
                i13++;
            }
            int i14 = 0;
            while (i14 < this.f26251j1.size()) {
                if (MessageObject.isPremiumSticker((TLRPC.Document) this.f26251j1.get(i14))) {
                    this.f26251j1.remove(i14);
                    i14--;
                }
                i14++;
            }
        }
        if (size != this.f26251j1.size() || size2 != this.f26254k1.size()) {
            X(false);
        }
        cz czVar = this.f26299y0;
        if (czVar != null) {
            czVar.l();
        }
        o();
    }

    public final void l(boolean z10) {
        int i10;
        boolean z11;
        my myVar = this.f26282t1;
        le.c cVar = this.f26223b;
        xx xxVar = this.P;
        lw lwVar = this.V;
        if (myVar != null && myVar.z()) {
            s4.c1 K = xxVar.K(0);
            if (K == null) {
                yy.a(lwVar, true, !z10);
            } else {
                if (K.f42946a.getTop() < xxVar.getPaddingTop()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                yy.a(lwVar, z11, !z10);
            }
            N(false, !z10);
            lwVar.setTranslationY(cVar.e * AndroidUtilities.dp(15.0f));
        } else if (lwVar != null && xxVar != null) {
            s4.c1 K2 = xxVar.K(0);
            if (K2 != null) {
                i10 = K2.f42946a.getTop();
            } else {
                i10 = -this.f26225b1;
            }
            lwVar.setTranslationY((cVar.e * AndroidUtilities.dp(15.0f)) + i10);
            lwVar.f30712a.a(false, !z10);
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
        if (dp > 0 && (K == null || K.f42946a.getBottom() < dp)) {
            z10 = true;
        }
        N(z10, !this.K1);
    }

    public final void n(int i10, View view) {
        xx xxVar;
        s4.c1 K;
        int i11;
        px pxVar = this.I;
        int[] iArr = this.Q0;
        if (view == null) {
            iArr[1] = 0;
            pxVar.setTranslationY(0);
        } else if (view.getVisibility() == 0 && !this.f26238f0) {
            my myVar = this.f26282t1;
            if (myVar == null || !myVar.z()) {
                if (i10 > 0 && (xxVar = this.P) != null && xxVar.getVisibility() == 0 && (K = xxVar.K(0)) != null) {
                    int top = K.f42946a.getTop();
                    if (this.f26231d0) {
                        i11 = this.f26225b1;
                    } else {
                        i11 = 0;
                    }
                    if (top + i11 >= xxVar.getPaddingTop()) {
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
                pxVar.setTranslationY(Math.max(-AndroidUtilities.dp(36.0f), iArr[1]));
            }
        }
    }

    public final void o() {
        int L0;
        yw ywVar = this.B0;
        if (ywVar != null && (L0 = this.E0.L0()) != -1) {
            int i10 = this.G1;
            if (i10 <= 0 && (i10 = this.F1) <= 0) {
                i10 = this.E1;
            }
            ywVar.k(this.f26299y0.F(L0), i10);
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
        NotificationCenter.ObserversGroup add = NotificationCenter.getInstance(this.f26229c1).createWeakObserversGroup(this).addGlobal(NotificationCenter.emojiLoaded).add(NotificationCenter.newEmojiSuggestionsAvailable).add(NotificationCenter.groupPackUpdated);
        this.I2 = add;
        if (this.f26299y0 != null) {
            add.add(NotificationCenter.stickersDidLoad).add(NotificationCenter.recentDocumentsDidLoad).add(NotificationCenter.featuredStickersDidLoad).add(NotificationCenter.groupStickersDidLoad).add(NotificationCenter.currentUserPremiumStatusChanged);
            AndroidUtilities.runOnUIThread(new fw(this, 0));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        yu yuVar = this.B1;
        if (yuVar != null && yuVar.isShowing()) {
            yuVar.dismiss();
        }
        org.telegram.ui.nt q6 = org.telegram.ui.nt.q();
        if (q6.f35961l == this.f26243g2) {
            q6.W = null;
            q6.f35949a0 = null;
            q6.Y = null;
            q6.f35961l = null;
            q6.f35953c0 = null;
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
        boolean z11 = this.f26231d0;
        if (!z10 && !this.N1) {
            if (this.L1 != 0) {
                if (!this.H2) {
                    setOutlineProvider(null);
                    setClipToOutline(false);
                    setElevation(0.0f);
                }
                if (this.f26284u0) {
                    int i12 = org.telegram.ui.ActionBar.h6.He;
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
            int i13 = org.telegram.ui.ActionBar.h6.He;
            background.setColorFilter(new PorterDuffColorFilter(z(i13), PorterDuff.Mode.MULTIPLY));
            if (z11 && this.f26284u0) {
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
                this.B0.k(this.f26299y0.F(L02), i12);
            }
        } else if (i10 == 2) {
            s4.h0 adapter = this.f26244h0.getAdapter();
            qy qyVar = this.f26261n0;
            if (adapter == qyVar && qyVar.I >= 0 && this.f26278s0 >= 0 && this.f26274r0 >= 0 && (L0 = this.f26247i0.L0()) != -1) {
                if (L0 >= qyVar.I) {
                    i11 = this.f26278s0;
                } else {
                    i11 = this.f26274r0;
                }
                this.f26267p0.k(i11, 0);
            }
        }
    }

    public final void q(boolean z10) {
        int i10;
        my myVar = this.f26282t1;
        le.c cVar = this.f26220a;
        uw uwVar = this.D0;
        boolean z11 = false;
        xw xwVar = this.G0;
        if (myVar != null && myVar.z()) {
            s4.c1 K = uwVar.K(0);
            if (K == null) {
                yy.a(xwVar, true, !z10);
            } else {
                if (K.f42946a.getTop() < uwVar.getPaddingTop()) {
                    z11 = true;
                }
                yy.a(xwVar, z11, !z10);
            }
            xwVar.setTranslationY(cVar.e * AndroidUtilities.dp(15.0f));
        } else if (xwVar != null && uwVar != null) {
            s4.c1 K2 = uwVar.K(0);
            if (K2 != null) {
                i10 = K2.f42946a.getTop();
            } else {
                i10 = -this.f26225b1;
            }
            xwVar.setTranslationY((cVar.e * AndroidUtilities.dp(15.0f)) + i10);
            xwVar.f30712a.a(false, !z10);
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
        yy yyVar;
        s4.c0 c0Var;
        View view;
        View view2;
        int i10;
        TLRPC.TL_messages_stickerSet stickerSetById;
        cz czVar;
        int E;
        AnimatorSet animatorSet = this.M0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.M0 = null;
        }
        int currentItem = this.h.getCurrentItem();
        if (currentItem == 2 && j3 != -1 && (stickerSetById = MediaDataController.getInstance(this.f26229c1).getStickerSetById(j3)) != null && (E = (czVar = this.f26299y0).E(stickerSetById)) >= 0 && E < czVar.h()) {
            H(E, AndroidUtilities.dp(48.0f));
        }
        qy qyVar = this.f26250j0;
        if (qyVar != null) {
            qyVar.K = false;
        }
        for (int i11 = 0; i11 < 3; i11++) {
            View view3 = this.D0;
            View view4 = this.f26244h0;
            rw rwVar = this.f26264o0;
            View view5 = this.P;
            if (i11 == 0) {
                yyVar = this.V;
                c0Var = this.Q;
                view = this.I;
                view2 = view5;
            } else if (i11 == 1) {
                c0Var = this.f26247i0;
                view = this.f26267p0;
                view2 = view4;
                yyVar = rwVar;
            } else {
                yyVar = this.G0;
                c0Var = this.E0;
                view = this.B0;
                view2 = view3;
            }
            if (yyVar != null) {
                xy xyVar = yyVar.f30717r;
                yyVar.d.setText("");
                if (xyVar != null) {
                    xyVar.F1(null);
                    xyVar.D1();
                }
                int i12 = this.f26225b1;
                if (i11 == currentItem && z10) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.M0 = animatorSet2;
                    Property property = View.TRANSLATION_Y;
                    if (view != null && i11 != 1) {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, 0.0f), ObjectAnimator.ofFloat(view2, property, AndroidUtilities.dp(36.0f)), ObjectAnimator.ofFloat(yyVar, property, AndroidUtilities.dp(36.0f)));
                    } else {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(view2, property, AndroidUtilities.dp(36.0f) - i12));
                    }
                    this.M0.setDuration(200L);
                    this.M0.setInterpolator(rr.h);
                    this.M0.addListener(new ai.y4(this, c0Var, view2, 5));
                    this.M0.start();
                } else {
                    if (yyVar != rwVar) {
                        yyVar.setTranslationY(AndroidUtilities.dp(36.0f) - i12);
                    }
                    if (view != null && i11 != 2) {
                        view.setTranslationY(0.0f);
                    }
                    if (view2 == view3) {
                        i10 = 0;
                        view2.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f) + this.f26269p2);
                    } else {
                        i10 = 0;
                        if (view2 == view4) {
                            view2.setPadding(0, AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(44.0f) + this.f26269p2);
                        } else {
                            if (view2 == view5) {
                                view2.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f) + this.f26269p2);
                            }
                            i10 = 0;
                        }
                    }
                    c0Var.h1(i10, i10);
                }
            }
        }
        if (!z10) {
            this.f26282t1.i(0);
        }
    }

    public void setBlurredBackgroundDrawableFactory(ah.c cVar) {
        org.telegram.ui.ActionBar.d6 d6Var = this.Z1;
        View view = this.f26294x;
        if (view != null) {
            ch.d c10 = cVar.c(view, null, false);
            c10.o(eh.b.d(d6Var));
            c10.q(AndroidUtilities.dp(18.0f));
            c10.p(AndroidUtilities.dp(6.0f));
            view.setBackground(c10);
        }
        View view2 = this.E;
        if (view2 != null) {
            ch.d c11 = cVar.c(view2, null, false);
            c11.o(eh.b.d(d6Var));
            c11.q(AndroidUtilities.dp(18.0f));
            c11.p(AndroidUtilities.dp(6.0f));
            view2.setBackground(c11);
        }
        View view3 = this.f26290w;
        if (view3 != null) {
            ch.d c12 = cVar.c(view3, null, false);
            c12.o(eh.b.d(d6Var));
            c12.q(AndroidUtilities.dp(18.0f));
            c12.p(AndroidUtilities.dp(6.0f));
            view3.setBackground(c12);
        }
        View view4 = this.f26298y;
        if (view4 != null) {
            ch.d c13 = cVar.c(view4, null, false);
            c13.o(eh.b.d(d6Var));
            c13.q(AndroidUtilities.dp(18.0f));
            c13.p(AndroidUtilities.dp(6.0f));
            view4.setBackground(c13);
        }
    }

    public void setBottomInset(int i10) {
        if (this.f26269p2 != i10) {
            this.f26269p2 = i10;
            j(i10, this.K);
            j(i10, this.M);
            j(AndroidUtilities.dp(44.0f) + i10, this.P);
            j(AndroidUtilities.dp(44.0f) + i10, this.D0);
            j(AndroidUtilities.dp(44.0f) + i10, this.f26244h0);
            FrameLayout frameLayout = this.f26277s;
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

    public void setDelegate(my myVar) {
        this.f26282t1 = myVar;
    }

    public void setDragListener(rx rxVar) {
        this.O0 = rxVar;
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        xw xwVar = this.G0;
        if (xwVar != null) {
            xwVar.d.setEnabled(z10);
        }
        rw rwVar = this.f26264o0;
        if (rwVar != null) {
            rwVar.d.setEnabled(z10);
        }
        lw lwVar = this.V;
        if (lwVar != null) {
            lwVar.d.setEnabled(z10);
        }
    }

    public void setForseMultiwindowLayout(boolean z10) {
        this.N1 = z10;
    }

    public void setShouldDrawBackground(boolean z10) {
        if (this.f26284u0 != z10) {
            this.f26284u0 = z10;
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
                int i11 = this.f26229c1;
                NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.stickersDidLoad);
                if (this.f26299y0 != null) {
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
        cz czVar;
        boolean z11 = this.N2;
        this.N2 = z10;
        if (z11 && !z10) {
            int i10 = this.A1;
            if (i10 == 0) {
                ux uxVar = this.R;
                if (uxVar != null) {
                    uxVar.F(false);
                }
            } else if (i10 == 1) {
                qy qyVar = this.f26261n0;
                if (qyVar != null) {
                    qyVar.l();
                }
            } else if (i10 == 2 && (czVar = this.f26299y0) != null) {
                czVar.l();
            }
        }
    }

    public final int v(float f7) {
        return i0.a.k(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Wk, this.Z1), (int) (f7 * 255.0f));
    }

    public final s4.s w(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return this.f26247i0;
                }
                throw new IllegalArgumentException(hg.c.h(i10, "Unexpected argument: "));
            }
            return this.Q;
        }
        return this.E0;
    }

    public final wl0 x(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return this.f26244h0;
                }
                throw new IllegalArgumentException(hg.c.h(i10, "Unexpected argument: "));
            }
            return this.P;
        }
        return this.D0;
    }

    public final HorizontalScrollView y(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return this.f26267p0;
                }
                throw new IllegalArgumentException(hg.c.h(i10, "Unexpected argument: "));
            }
            return this.I;
        }
        return this.B0;
    }

    public final int z(int i10) {
        org.telegram.ui.ActionBar.d6 d6Var = this.Z1;
        if (d6Var != null) {
            return d6Var.G0(i10);
        }
        return org.telegram.ui.ActionBar.h6.w0(null, i10, false);
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
