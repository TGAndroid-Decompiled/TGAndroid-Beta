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
import org.telegram.ui.gc1;
public class rz extends FrameLayout implements le.d, NotificationCenter.NotificationCenterDelegate, oh.a {
    public static final int O2 = 0;
    public final mw A0;
    public int A1;
    public final ArrayList A2;
    public final cx B0;
    public final bv B1;
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
    public final le.b G2;
    public float H;
    public final mh.d H0;
    public int H1;
    public ArrayList H2;
    public final ow I;
    public boolean I0;
    public int I1;
    public boolean I2;
    public final ox J;
    public boolean J0;
    public TLRPC.ChatFull J1;
    public AnimatorSet J2;
    public final bi.n7 K;
    public boolean K0;
    public boolean K1;
    public org.telegram.messenger.video.k K2;
    public final mh.b L;
    public final ky L0;
    public int L1;
    public final hw L2;
    public final bi.n7 M;
    public AnimatorSet M0;
    public final xf.i0 M1;
    public boolean M2;
    public final mh.b N;
    public final di.h N0;
    public boolean N1;
    public boolean N2;
    public final View O;
    public vx O0;
    public int O1;
    public final px P;
    public boolean P0;
    public boolean P1;
    public final qx Q;
    public final int[] Q0;
    public boolean Q1;
    public final yx R;
    public final ObjectAnimator[] R0;
    public az R1;
    public final ry S;
    public boolean S0;
    public float S1;
    public pz T;
    public fg.h1 T0;
    public float T1;
    public final mh.d U;
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
    public final org.telegram.ui.ActionBar.p2 Y1;
    public final Drawable[] Z0;
    public final org.telegram.ui.ActionBar.f6 Z1;
    public final le.b f26796a;
    public final yk0 f26797a0;
    public final String[] f26798a1;
    public final org.telegram.ui.ActionBar.v5 a2;
    public final le.b f26799b;
    public final yk0 f26800b0;
    public final int f26801b1;
    public final org.telegram.ui.ActionBar.v5 f26802b2;
    public int f26803c;
    public boolean f26804c0;
    public final int f26805c1;
    public final boolean f26806c2;
    public final ArrayList d;
    public final boolean f26807d0;
    public final ArrayList f26808d1;
    public LongSparseArray f26809d2;
    public final ArrayList e;
    public boolean f26810e0;
    public int f26811e1;
    public PorterDuffColorFilter f26812e2;
    public boolean f26813f;
    public boolean f26814f0;
    public int f26815f1;
    public final org.telegram.ui.Cells.l9 f26816f2;
    public final rw f26817g0;
    public boolean f26818g1;
    public final ix f26819g2;
    public final ex h;
    public final sw f26820h0;
    public TLRPC.TL_messages_stickerSet f26821h1;
    public boolean f26822h2;
    public final xy f26823i0;
    public ArrayList f26824i1;
    public final boolean f26825i2;
    public final wy f26826j0;
    public ArrayList f26827j1;
    public final zg.e f26828j2;
    public final zy f26829k0;
    public ArrayList f26830k1;
    public final nh f26831k2;
    public final HashMap f26832l0;
    public ArrayList l1;
    public final eh.d f26833l2;
    public final mw m0;
    public final ArrayList f26834m1;
    public final eh.c f26835m2;
    public final FrameLayout f26836n;
    public final wy f26837n0;
    public final ArrayList f26838n1;
    public final zg.a f26839n2;
    public final vw f26840o0;
    public final ArrayList f26841o1;
    public boolean f26842o2;
    public final wx f26843p0;
    public final ArrayList f26844p1;
    public boolean f26845p2;
    public boolean f26846q0;
    public final ArrayList f26847q1;
    public int f26848q2;
    public final FrameLayout f26849r;
    public int f26850r0;
    public final HashMap f26851r1;
    public float f26852r2;
    public final FrameLayout f26853s;
    public int f26854s0;
    public final Paint f26855s1;
    public View f26856s2;
    public int f26857t0;
    public sy f26858t1;
    public int f26859t2;
    public boolean f26860u0;
    public long f26861u1;
    public int f26862u2;
    public final View v;
    public boolean f26863v0;
    public boolean f26864v1;
    public long f26865v2;
    public final nd0 f26866w;
    public boolean f26867w0;
    public boolean f26868w1;
    public boolean f26869w2;
    public final fx f26870x;
    public final ww f26871x0;
    public final TLRPC.StickerSetCovered[] f26872x1;
    public boolean f26873x2;
    public final ImageView f26874y;
    public final iz f26875y0;
    public final LongSparseArray f26876y1;
    public final Rect f26877y2;
    public final mz f26878z0;
    public final LongSparseArray f26879z1;
    public final RectF f26880z2;

    public rz(org.telegram.ui.ActionBar.p2 p2Var, boolean z10, boolean z11, boolean z12, Context context, boolean z13, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z14, final org.telegram.ui.ActionBar.f6 f6Var, boolean z15, boolean z16) {
        super(context);
        org.telegram.ui.ActionBar.v5 v5Var;
        int z17;
        ox oxVar;
        final org.telegram.ui.ActionBar.f6 f6Var2;
        hw hwVar;
        boolean z18;
        px pxVar;
        boolean z19;
        Context context2;
        int i10;
        int i11;
        boolean z20;
        Field field;
        wr wrVar = wr.h;
        this.f26796a = new le.b(0, this, wrVar, 320L, false);
        this.f26799b = new le.b(1, this, wrVar, 320L, false);
        this.f26803c = 2;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.e = new ArrayList();
        this.f26804c0 = true;
        this.f26829k0 = new zy(this);
        this.f26832l0 = new HashMap();
        this.f26846q0 = true;
        this.f26850r0 = -2;
        this.f26854s0 = -2;
        this.f26857t0 = -2;
        this.f26860u0 = true;
        this.f26867w0 = true;
        this.I0 = true;
        this.Q0 = new int[3];
        this.R0 = new ObjectAnimator[3];
        int i12 = UserConfig.selectedAccount;
        this.f26805c1 = i12;
        this.f26808d1 = new ArrayList();
        this.f26824i1 = new ArrayList();
        this.f26827j1 = new ArrayList();
        this.f26830k1 = new ArrayList();
        this.l1 = new ArrayList();
        this.f26834m1 = new ArrayList();
        this.f26838n1 = new ArrayList();
        new ArrayList();
        this.f26841o1 = new ArrayList();
        this.f26844p1 = new ArrayList();
        this.f26847q1 = new ArrayList();
        this.f26851r1 = new HashMap();
        this.f26872x1 = new TLRPC.StickerSetCovered[10];
        this.f26876y1 = new LongSparseArray();
        this.f26879z1 = new LongSparseArray();
        this.D1 = new int[2];
        this.F1 = -2;
        this.G1 = -2;
        this.H1 = -2;
        this.I1 = -2;
        this.L1 = -1;
        this.f26816f2 = new org.telegram.ui.Cells.l9(this, 9);
        this.f26819g2 = new ix(this);
        this.f26822h2 = true;
        this.f26852r2 = -1.0f;
        this.f26859t2 = -1;
        this.f26862u2 = -1;
        this.f26865v2 = -1L;
        this.f26869w2 = false;
        this.f26873x2 = true;
        this.f26877y2 = new Rect();
        RectF rectF = new RectF();
        this.f26880z2 = rectF;
        ArrayList arrayList2 = new ArrayList(1);
        this.A2 = arrayList2;
        arrayList2.add(rectF);
        new Paint(1);
        this.B2 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.G2 = new le.b(0, new kw(this, 1), wrVar, 380L, true);
        this.L2 = new hw(this, 2);
        this.M2 = false;
        this.f26860u0 = z14;
        this.Y1 = p2Var;
        this.f26806c2 = z10;
        this.Z1 = f6Var;
        this.f26825i2 = z16;
        eh.c cVar = new eh.c();
        this.f26835m2 = cVar;
        cVar.a(z(org.telegram.ui.ActionBar.j6.f17928d6));
        if (z15) {
            u(true);
        }
        i0.a.k(z(org.telegram.ui.ActionBar.j6.Wk), 30);
        int dp = AndroidUtilities.dp(50.0f);
        this.f26801b1 = dp;
        this.f26807d0 = z13;
        this.X0 = new Drawable[]{org.telegram.ui.ActionBar.j6.U(context, R.drawable.smiles_tab_smiles, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.j6.Re), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.j6.Oe)), org.telegram.ui.ActionBar.j6.U(context, R.drawable.smiles_tab_gif, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.j6.Re), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.j6.Oe)), org.telegram.ui.ActionBar.j6.U(context, R.drawable.smiles_tab_stickers, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.j6.Re), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.j6.Oe))};
        org.telegram.ui.ActionBar.v5 U = org.telegram.ui.ActionBar.j6.U(context, R.drawable.msg_emoji_recent, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.j6.Me), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.j6.Oe));
        org.telegram.ui.ActionBar.v5 U2 = org.telegram.ui.ActionBar.j6.U(context, R.drawable.emoji_tabs_faves, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.j6.Me), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.j6.Oe));
        org.telegram.ui.ActionBar.v5 U3 = org.telegram.ui.ActionBar.j6.U(context, R.drawable.emoji_tabs_new3, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.j6.Me), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.j6.Oe));
        int i13 = R.drawable.emoji_tabs_new1;
        if (z16) {
            v5Var = U3;
            z17 = v(0.4f);
        } else {
            v5Var = U3;
            z17 = z(org.telegram.ui.ActionBar.j6.Me);
        }
        org.telegram.ui.ActionBar.v5 U4 = org.telegram.ui.ActionBar.j6.U(context, i13, z17, z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.j6.Oe));
        this.a2 = U4;
        int i14 = R.drawable.emoji_tabs_new2;
        int i15 = org.telegram.ui.ActionBar.j6.Qe;
        org.telegram.ui.ActionBar.v5 U5 = org.telegram.ui.ActionBar.j6.U(context, i14, z(i15), z(i15));
        this.f26802b2 = U5;
        this.Y0 = new Drawable[]{U, U2, v5Var, new LayerDrawable(new Drawable[]{U4, U5})};
        this.Z0 = new Drawable[]{org.telegram.ui.ActionBar.j6.U(context, R.drawable.msg_emoji_recent, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.j6.Me), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.j6.Oe)), org.telegram.ui.ActionBar.j6.U(context, R.drawable.stickers_gifs_trending, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.j6.Me), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.j6.Oe))};
        this.f26798a1 = new String[]{LocaleController.getString(R.string.Emoji1), LocaleController.getString(R.string.Emoji2), LocaleController.getString(R.string.Emoji3), LocaleController.getString(R.string.Emoji4), LocaleController.getString(R.string.Emoji5), LocaleController.getString(R.string.Emoji6), LocaleController.getString(R.string.Emoji7), LocaleController.getString(R.string.Emoji8)};
        this.J1 = chatFull;
        Paint paint = new Paint(1);
        this.f26855s1 = paint;
        paint.setColor(z(org.telegram.ui.ActionBar.j6.f17880af));
        bi.g gVar = xf.k0.f45156a;
        this.M1 = new xf.i0(AndroidUtilities.dp(6.0f));
        ox oxVar2 = new ox(this, context);
        this.J = oxVar2;
        ?? obj = new Object();
        obj.f25619a = 0;
        obj.f25620b = oxVar2;
        arrayList.add(obj);
        if (z10) {
            MediaDataController.getInstance(i12).checkStickers(5);
            MediaDataController.getInstance(i12).checkFeaturedEmoji();
            this.f26812e2 = new PorterDuffColorFilter(z(org.telegram.ui.ActionBar.j6.Oh), PorterDuff.Mode.SRC_IN);
        }
        px pxVar2 = new px(this, context);
        this.P = pxVar2;
        s4.j jVar = new s4.j();
        jVar.f41691c = 220L;
        jVar.e = 220L;
        jVar.f41692f = 160L;
        jVar.f41693g = 160L;
        jVar.f41694i = wr.f28820g;
        pxVar2.setItemAnimator(jVar);
        pxVar2.setOnTouchListener(new View.OnTouchListener(this) {
            public final rz f24504b;

            {
                this.f24504b = this;
            }

            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                switch (r3) {
                    case 0:
                        org.telegram.ui.tt q6 = org.telegram.ui.tt.q();
                        rz rzVar = this.f24504b;
                        px pxVar3 = rzVar.P;
                        rzVar.getMeasuredHeight();
                        return q6.s(motionEvent, pxVar3, null, rzVar.f26819g2, f6Var);
                    case 1:
                        org.telegram.ui.tt q10 = org.telegram.ui.tt.q();
                        rz rzVar2 = this.f24504b;
                        return q10.s(motionEvent, rzVar2.f26820h0, rzVar2.m0, rzVar2.f26819g2, f6Var);
                    default:
                        org.telegram.ui.tt q11 = org.telegram.ui.tt.q();
                        rz rzVar3 = this.f24504b;
                        yw ywVar = rzVar3.D0;
                        rzVar3.getMeasuredHeight();
                        return q11.s(motionEvent, ywVar, rzVar3.A0, rzVar3.f26819g2, f6Var);
                }
            }
        });
        pxVar2.setOnItemLongClickListener(new kw(this, 0));
        pxVar2.setInstantClick(true);
        qx qxVar = new qx(this);
        this.Q = qxVar;
        pxVar2.setLayoutManager(qxVar);
        pxVar2.setTopGlowOffset(AndroidUtilities.dp(38.0f));
        pxVar2.setBottomGlowOffset(AndroidUtilities.dp(36.0f));
        pxVar2.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f));
        int i16 = org.telegram.ui.ActionBar.j6.He;
        pxVar2.setGlowColor(z(i16));
        pxVar2.setItemSelectorColorProvider(new q2(12));
        pxVar2.setClipToPadding(false);
        qxVar.O = new rx(this);
        yx yxVar = new yx(this);
        this.R = yxVar;
        pxVar2.setAdapter(yxVar);
        pxVar2.i(new bi.z1(this, 3));
        this.S = new ry(this, context);
        oxVar2.addView(pxVar2, w7.a6.c(-1.0f, -1));
        yk0 yk0Var = new yk0(pxVar2, qxVar);
        this.f26800b0 = yk0Var;
        yk0Var.f29448i = new sx(this);
        pxVar2.setOnScrollListener(new tx(this));
        if (p2Var != null) {
            oxVar = oxVar2;
            f6Var2 = f6Var;
            hwVar = new hw(this, 5);
            pxVar = pxVar2;
            z19 = z16;
            context2 = context;
            i10 = dp;
            i11 = -1;
            z18 = z10;
        } else {
            oxVar = oxVar2;
            f6Var2 = f6Var;
            hwVar = null;
            z18 = z10;
            pxVar = pxVar2;
            z19 = z16;
            context2 = context;
            i10 = dp;
            i11 = -1;
        }
        ow owVar = new ow(this, context2, f6Var2, z18, hwVar, z19);
        this.I = owVar;
        if (z13) {
            pw pwVar = new pw(this, context2);
            this.V = pwVar;
            oxVar.addView(pwVar, new FrameLayout.LayoutParams(i11, AndroidUtilities.getShadowHeight() + i10));
            pwVar.d.setOnFocusChangeListener(new qw(this));
            mh.d dVar = new mh.d(context2, f6Var2);
            this.U = dVar;
            dVar.setVisibility(8);
            dVar.setOnBackClickListener(new View.OnClickListener(this) {
                public final rz f25115b;

                {
                    this.f25115b = this;
                }

                @Override
                public final void onClick(View view) {
                    ez ezVar;
                    switch (r2) {
                        case 0:
                            ry ryVar = this.f25115b.S;
                            ly lyVar = ryVar.f26778c;
                            int childCount = lyVar.getChildCount();
                            for (int i17 = 0; i17 < childCount; i17++) {
                                ((mh.c) lyVar.getChildAt(i17)).a(false, true);
                            }
                            ryVar.d = 0L;
                            ryVar.F.f26799b.a(false, true);
                            ryVar.l();
                            return;
                        case 1:
                            mz mzVar = this.f25115b.f26878z0;
                            lz lzVar = mzVar.f25318c;
                            int childCount2 = lzVar.getChildCount();
                            for (int i18 = 0; i18 < childCount2; i18++) {
                                ((mh.c) lzVar.getChildAt(i18)).a(false, true);
                            }
                            mzVar.d = 0L;
                            mzVar.Q.f26796a.a(false, true);
                            mzVar.l();
                            return;
                        case 2:
                            sy syVar = this.f25115b.f26858t1;
                            if (syVar != null) {
                                syVar.w();
                                return;
                            }
                            return;
                        default:
                            rz rzVar = this.f25115b;
                            int currentItem = rzVar.h.getCurrentItem();
                            if (currentItem == 0) {
                                ezVar = rzVar.V;
                            } else if (currentItem == 1) {
                                ezVar = rzVar.f26840o0;
                            } else {
                                ezVar = rzVar.G0;
                            }
                            if (ezVar != null) {
                                oq oqVar = ezVar.d;
                                oqVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                oqVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                oqVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                return;
                            }
                            return;
                    }
                }
            });
            oxVar.addView(dVar, new FrameLayout.LayoutParams(i11, i10));
        }
        int z21 = z(i16);
        if (Color.alpha(z21) >= 255) {
            owVar.setBackgroundColor(z21);
        }
        yxVar.G(true);
        owVar.p(getEmojipacks());
        oxVar.addView(owVar, w7.a6.c(36.0f, i11));
        View view = new View(context2);
        this.O = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        int i17 = org.telegram.ui.ActionBar.j6.Ke;
        view.setBackgroundColor(z(i17));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i11, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(36.0f);
        oxVar.addView(view, layoutParams);
        mh.b bVar = new mh.b(context2, f6Var2);
        this.L = bVar;
        bi.n7 n7Var = new bi.n7(context2, 3, f6Var2);
        this.K = n7Var;
        n7Var.setVisibility(8);
        n7Var.addView(bVar, w7.a6.d(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
        oxVar.addView(n7Var, w7.a6.e(i11, -2, 80));
        if (z11) {
            rm0 rm0Var = rm0.f26693b;
            if (z12) {
                rw rwVar = new rw(this, context2);
                this.f26817g0 = rwVar;
                ?? obj2 = new Object();
                obj2.f25619a = 1;
                obj2.f25620b = rwVar;
                this.d.add(obj2);
                sw swVar = new sw(this, context2);
                this.f26820h0 = swVar;
                swVar.setClipToPadding(false);
                xy xyVar = new xy(this);
                this.f26823i0 = xyVar;
                swVar.setLayoutManager(xyVar);
                swVar.i(new tw(this));
                swVar.setPadding(0, i10, 0, AndroidUtilities.dp(44.0f) + this.f26848q2);
                swVar.setOverScrollMode(2);
                ((s4.f1) swVar.getItemAnimator()).f41645m = false;
                wy wyVar = new wy(this, context2, true, Integer.MAX_VALUE);
                this.f26837n0 = wyVar;
                swVar.setAdapter(wyVar);
                this.f26826j0 = new wy(this, context2, false, 0);
                swVar.setOnScrollListener(new uw(this));
                swVar.setOnTouchListener(new View.OnTouchListener(this) {
                    public final rz f24504b;

                    {
                        this.f24504b = this;
                    }

                    @Override
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        switch (r3) {
                            case 0:
                                org.telegram.ui.tt q6 = org.telegram.ui.tt.q();
                                rz rzVar = this.f24504b;
                                px pxVar3 = rzVar.P;
                                rzVar.getMeasuredHeight();
                                return q6.s(motionEvent, pxVar3, null, rzVar.f26819g2, f6Var2);
                            case 1:
                                org.telegram.ui.tt q10 = org.telegram.ui.tt.q();
                                rz rzVar2 = this.f24504b;
                                return q10.s(motionEvent, rzVar2.f26820h0, rzVar2.m0, rzVar2.f26819g2, f6Var2);
                            default:
                                org.telegram.ui.tt q11 = org.telegram.ui.tt.q();
                                rz rzVar3 = this.f24504b;
                                yw ywVar = rzVar3.D0;
                                rzVar3.getMeasuredHeight();
                                return q11.s(motionEvent, ywVar, rzVar3.A0, rzVar3.f26819g2, f6Var2);
                        }
                    }
                });
                ?? r12 = new jl0(this) {
                    public final rz f25304b;

                    {
                        this.f25304b = this;
                    }

                    @Override
                    public final void d(int i18, View view2) {
                        int i19;
                        String str;
                        switch (r2) {
                            case 0:
                                rz rzVar = this.f25304b;
                                sw swVar2 = rzVar.f26820h0;
                                wy wyVar2 = rzVar.f26826j0;
                                wy wyVar3 = rzVar.f26837n0;
                                if (rzVar.f26858t1 != null) {
                                    wyVar3.getClass();
                                    ArrayList arrayList3 = wyVar3.f28868x;
                                    if (swVar2.getAdapter() == wyVar3) {
                                        if (i18 >= 0) {
                                            int i20 = wyVar3.H;
                                            if (i18 < i20) {
                                                rzVar.f26858t1.v(view2, rzVar.f26824i1.get(i18), null, "gif", true, 0, 0);
                                                return;
                                            }
                                            if (i20 > 0) {
                                                i19 = (i18 - i20) - 1;
                                            } else {
                                                i19 = i18;
                                            }
                                            if (i19 >= 0 && i19 < arrayList3.size()) {
                                                rzVar.f26858t1.v(view2, arrayList3.get(i19), null, wyVar3.f28864n, true, 0, 0);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    } else if (swVar2.getAdapter() == wyVar2 && i18 >= 0 && i18 < wyVar2.f28868x.size()) {
                                        rzVar.f26858t1.v(view2, wyVar2.f28868x.get(i18), wyVar2.f28867w, wyVar2.f28864n, true, 0, 0);
                                        rzVar.Y();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            default:
                                rz rzVar2 = this.f25304b;
                                s4.h0 adapter = rzVar2.D0.getAdapter();
                                mz mzVar = rzVar2.f26878z0;
                                if (adapter == mzVar) {
                                    str = mzVar.N;
                                } else {
                                    str = null;
                                }
                                String str2 = str;
                                if (view2 instanceof org.telegram.ui.Cells.g8) {
                                    org.telegram.ui.Cells.g8 g8Var = (org.telegram.ui.Cells.g8) view2;
                                    if (g8Var.getSticker() != null && MessageObject.isPremiumSticker(g8Var.getSticker()) && !AccountInstance.getInstance(rzVar2.f26805c1).getUserConfig().isPremium()) {
                                        org.telegram.ui.tt.q().y(g8Var);
                                        return;
                                    }
                                    org.telegram.ui.tt.q().u();
                                    if (!g8Var.f19212r) {
                                        g8Var.f19212r = true;
                                        g8Var.f19211n = 0.5f;
                                        g8Var.f19215x = 0L;
                                        org.telegram.ui.Cells.f8 f8Var = g8Var.f19207a;
                                        f8Var.setAlpha(0.5f * g8Var.H);
                                        f8Var.invalidate();
                                        g8Var.f19213s = System.currentTimeMillis();
                                        g8Var.invalidate();
                                        rzVar2.f26858t1.m(g8Var, g8Var.getSticker(), str2, g8Var.getParentObject(), g8Var.getSendAnimationData(), true, 0);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                };
                this.m0 = r12;
                swVar.setOnItemClickListener((jl0) r12);
                rwVar.addView(swVar, w7.a6.c(-1.0f, -1));
                vw vwVar = new vw(this, context2);
                this.f26840o0 = vwVar;
                rwVar.addView(vwVar, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + i10));
                wx wxVar = new wx(this, context2, f6Var2);
                this.f26843p0 = wxVar;
                wxVar.setType(rm0Var);
                wxVar.setUnderlineHeight(AndroidUtilities.getShadowHeight());
                wxVar.setIndicatorColor(z(i15));
                wxVar.setUnderlineColor(z(i17));
                wxVar.setBackgroundColor(z(i16));
                X();
                wxVar.setDelegate(new kw(this, 2));
                wyVar.F("", "", true, true, true);
            }
            ww wwVar = new ww(this, context2, z14);
            this.f26871x0 = wwVar;
            MediaDataController.getInstance(this.f26805c1).checkStickers(0);
            MediaDataController.getInstance(this.f26805c1).checkFeaturedStickers();
            yw ywVar = new yw(this, context2);
            this.D0 = ywVar;
            zw zwVar = new zw(this);
            this.E0 = zwVar;
            ywVar.setLayoutManager(zwVar);
            zwVar.O = new ax(this);
            ywVar.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f));
            ywVar.setClipToPadding(false);
            ?? obj3 = new Object();
            obj3.f25619a = 2;
            obj3.f25620b = wwVar;
            this.d.add(obj3);
            this.f26878z0 = new mz(this, context2);
            iz izVar = new iz(this, context2);
            this.f26875y0 = izVar;
            ywVar.setAdapter(izVar);
            ywVar.setOnTouchListener(new View.OnTouchListener(this) {
                public final rz f24504b;

                {
                    this.f24504b = this;
                }

                @Override
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    switch (r3) {
                        case 0:
                            org.telegram.ui.tt q6 = org.telegram.ui.tt.q();
                            rz rzVar = this.f24504b;
                            px pxVar3 = rzVar.P;
                            rzVar.getMeasuredHeight();
                            return q6.s(motionEvent, pxVar3, null, rzVar.f26819g2, f6Var2);
                        case 1:
                            org.telegram.ui.tt q10 = org.telegram.ui.tt.q();
                            rz rzVar2 = this.f24504b;
                            return q10.s(motionEvent, rzVar2.f26820h0, rzVar2.m0, rzVar2.f26819g2, f6Var2);
                        default:
                            org.telegram.ui.tt q11 = org.telegram.ui.tt.q();
                            rz rzVar3 = this.f24504b;
                            yw ywVar2 = rzVar3.D0;
                            rzVar3.getMeasuredHeight();
                            return q11.s(motionEvent, ywVar2, rzVar3.A0, rzVar3.f26819g2, f6Var2);
                    }
                }
            });
            ?? r42 = new jl0(this) {
                public final rz f25304b;

                {
                    this.f25304b = this;
                }

                @Override
                public final void d(int i18, View view2) {
                    int i19;
                    String str;
                    switch (r2) {
                        case 0:
                            rz rzVar = this.f25304b;
                            sw swVar2 = rzVar.f26820h0;
                            wy wyVar2 = rzVar.f26826j0;
                            wy wyVar3 = rzVar.f26837n0;
                            if (rzVar.f26858t1 != null) {
                                wyVar3.getClass();
                                ArrayList arrayList3 = wyVar3.f28868x;
                                if (swVar2.getAdapter() == wyVar3) {
                                    if (i18 >= 0) {
                                        int i20 = wyVar3.H;
                                        if (i18 < i20) {
                                            rzVar.f26858t1.v(view2, rzVar.f26824i1.get(i18), null, "gif", true, 0, 0);
                                            return;
                                        }
                                        if (i20 > 0) {
                                            i19 = (i18 - i20) - 1;
                                        } else {
                                            i19 = i18;
                                        }
                                        if (i19 >= 0 && i19 < arrayList3.size()) {
                                            rzVar.f26858t1.v(view2, arrayList3.get(i19), null, wyVar3.f28864n, true, 0, 0);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                } else if (swVar2.getAdapter() == wyVar2 && i18 >= 0 && i18 < wyVar2.f28868x.size()) {
                                    rzVar.f26858t1.v(view2, wyVar2.f28868x.get(i18), wyVar2.f28867w, wyVar2.f28864n, true, 0, 0);
                                    rzVar.Y();
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        default:
                            rz rzVar2 = this.f25304b;
                            s4.h0 adapter = rzVar2.D0.getAdapter();
                            mz mzVar = rzVar2.f26878z0;
                            if (adapter == mzVar) {
                                str = mzVar.N;
                            } else {
                                str = null;
                            }
                            String str2 = str;
                            if (view2 instanceof org.telegram.ui.Cells.g8) {
                                org.telegram.ui.Cells.g8 g8Var = (org.telegram.ui.Cells.g8) view2;
                                if (g8Var.getSticker() != null && MessageObject.isPremiumSticker(g8Var.getSticker()) && !AccountInstance.getInstance(rzVar2.f26805c1).getUserConfig().isPremium()) {
                                    org.telegram.ui.tt.q().y(g8Var);
                                    return;
                                }
                                org.telegram.ui.tt.q().u();
                                if (!g8Var.f19212r) {
                                    g8Var.f19212r = true;
                                    g8Var.f19211n = 0.5f;
                                    g8Var.f19215x = 0L;
                                    org.telegram.ui.Cells.f8 f8Var = g8Var.f19207a;
                                    f8Var.setAlpha(0.5f * g8Var.H);
                                    f8Var.invalidate();
                                    g8Var.f19213s = System.currentTimeMillis();
                                    g8Var.invalidate();
                                    rzVar2.f26858t1.m(g8Var, g8Var.getSticker(), str2, g8Var.getParentObject(), g8Var.getSendAnimationData(), true, 0);
                                    return;
                                }
                                return;
                            }
                            return;
                    }
                }
            };
            this.A0 = r42;
            ywVar.setOnItemClickListener((jl0) r42);
            ywVar.setGlowColor(z(i16));
            wwVar.addView(ywVar);
            this.f26797a0 = new yk0(ywVar, zwVar);
            bx bxVar = new bx(this, context2);
            this.G0 = bxVar;
            wwVar.addView(bxVar, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + i10));
            mh.d dVar2 = new mh.d(context2, f6Var2);
            this.H0 = dVar2;
            dVar2.setVisibility(8);
            dVar2.setOnBackClickListener(new View.OnClickListener(this) {
                public final rz f25115b;

                {
                    this.f25115b = this;
                }

                @Override
                public final void onClick(View view2) {
                    ez ezVar;
                    switch (r2) {
                        case 0:
                            ry ryVar = this.f25115b.S;
                            ly lyVar = ryVar.f26778c;
                            int childCount = lyVar.getChildCount();
                            for (int i172 = 0; i172 < childCount; i172++) {
                                ((mh.c) lyVar.getChildAt(i172)).a(false, true);
                            }
                            ryVar.d = 0L;
                            ryVar.F.f26799b.a(false, true);
                            ryVar.l();
                            return;
                        case 1:
                            mz mzVar = this.f25115b.f26878z0;
                            lz lzVar = mzVar.f25318c;
                            int childCount2 = lzVar.getChildCount();
                            for (int i18 = 0; i18 < childCount2; i18++) {
                                ((mh.c) lzVar.getChildAt(i18)).a(false, true);
                            }
                            mzVar.d = 0L;
                            mzVar.Q.f26796a.a(false, true);
                            mzVar.l();
                            return;
                        case 2:
                            sy syVar = this.f25115b.f26858t1;
                            if (syVar != null) {
                                syVar.w();
                                return;
                            }
                            return;
                        default:
                            rz rzVar = this.f25115b;
                            int currentItem = rzVar.h.getCurrentItem();
                            if (currentItem == 0) {
                                ezVar = rzVar.V;
                            } else if (currentItem == 1) {
                                ezVar = rzVar.f26840o0;
                            } else {
                                ezVar = rzVar.G0;
                            }
                            if (ezVar != null) {
                                oq oqVar = ezVar.d;
                                oqVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                oqVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                oqVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                return;
                            }
                            return;
                    }
                }
            });
            wwVar.addView(dVar2, new FrameLayout.LayoutParams(-1, i10));
            z20 = z14;
            cx cxVar = new cx(this, context2, f6Var2, p2Var, z20);
            this.B0 = cxVar;
            cxVar.setDragEnabled(true);
            cxVar.setWillNotDraw(false);
            cxVar.setType(rm0Var);
            cxVar.setUnderlineHeight(ywVar.canScrollVertically(-1) ? AndroidUtilities.getShadowHeight() : 0);
            cxVar.setIndicatorColor(z(i15));
            cxVar.setUnderlineColor(z(i17));
            if (viewGroup != null && z20) {
                dx dxVar = new dx(this, context2);
                this.C0 = dxVar;
                dxVar.addView(cxVar, w7.a6.e(-1, 36, 51));
                viewGroup.addView(dxVar, w7.a6.c(-2.0f, -1));
            } else {
                wwVar.addView(cxVar, w7.a6.e(-1, 36, 51));
            }
            Z(true);
            cxVar.setDelegate(new kw(this, 3));
            ywVar.setOnScrollListener(new qz(this, 0));
            mh.b bVar2 = new mh.b(context2, f6Var2);
            this.N = bVar2;
            bi.n7 n7Var2 = new bi.n7(context2, 3, f6Var2);
            this.M = n7Var2;
            n7Var2.setVisibility(8);
            n7Var2.addView(bVar2, w7.a6.d(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
            wwVar.addView(n7Var2, w7.a6.e(-1, -2, 80));
        } else {
            z20 = z14;
        }
        this.e.clear();
        this.e.addAll(this.d);
        ex exVar = new ex(this, context2);
        this.h = exVar;
        ky kyVar = new ky(this);
        this.L0 = kyVar;
        exVar.setAdapter(kyVar);
        fx fxVar = new fx(this, context2);
        this.f26870x = fxVar;
        fxVar.setHapticFeedbackEnabled(true);
        fxVar.setImageResource(R.drawable.smiles_tab_clear);
        int v = z16 ? v(0.6f) : z(org.telegram.ui.ActionBar.j6.Re);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        fxVar.setColorFilter(new PorterDuffColorFilter(v, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        fxVar.setScaleType(scaleType);
        fxVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
        fxVar.setFocusable(true);
        fxVar.setOnClickListener(new Object());
        w7.c6.a(fxVar);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f26849r = frameLayout;
        if (z13) {
            addView(frameLayout, w7.a6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, (AndroidUtilities.getShadowHeight() / AndroidUtilities.density) + 40.0f));
        } else {
            addView(frameLayout, w7.a6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.f26853s = frameLayout2;
        addView(frameLayout2, w7.a6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 64.0f));
        FrameLayout frameLayout3 = new FrameLayout(context2);
        this.f26836n = frameLayout3;
        View view2 = new View(context2);
        this.v = view2;
        frameLayout3.addView(view2, new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(40.0f), 83));
        if (z13) {
            addView(frameLayout3, w7.a6.e(-1, 48, 80));
            frameLayout3.addView(fxVar, w7.a6.d(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
            if (z11) {
                ImageView imageView = new ImageView(context2);
                this.f26874y = imageView;
                imageView.setImageResource(R.drawable.smiles_tab_settings);
                imageView.setColorFilter(new PorterDuffColorFilter(z16 ? v(0.6f) : z(org.telegram.ui.ActionBar.j6.Re), mode));
                imageView.setScaleType(scaleType);
                imageView.setFocusable(true);
                imageView.setContentDescription(LocaleController.getString(R.string.Settings));
                w7.c6.a(imageView);
                frameLayout3.addView(imageView, w7.a6.d(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
                imageView.setOnClickListener(new View.OnClickListener(this) {
                    public final rz f25115b;

                    {
                        this.f25115b = this;
                    }

                    @Override
                    public final void onClick(View view22) {
                        ez ezVar;
                        switch (r2) {
                            case 0:
                                ry ryVar = this.f25115b.S;
                                ly lyVar = ryVar.f26778c;
                                int childCount = lyVar.getChildCount();
                                for (int i172 = 0; i172 < childCount; i172++) {
                                    ((mh.c) lyVar.getChildAt(i172)).a(false, true);
                                }
                                ryVar.d = 0L;
                                ryVar.F.f26799b.a(false, true);
                                ryVar.l();
                                return;
                            case 1:
                                mz mzVar = this.f25115b.f26878z0;
                                lz lzVar = mzVar.f25318c;
                                int childCount2 = lzVar.getChildCount();
                                for (int i18 = 0; i18 < childCount2; i18++) {
                                    ((mh.c) lzVar.getChildAt(i18)).a(false, true);
                                }
                                mzVar.d = 0L;
                                mzVar.Q.f26796a.a(false, true);
                                mzVar.l();
                                return;
                            case 2:
                                sy syVar = this.f25115b.f26858t1;
                                if (syVar != null) {
                                    syVar.w();
                                    return;
                                }
                                return;
                            default:
                                rz rzVar = this.f25115b;
                                int currentItem = rzVar.h.getCurrentItem();
                                if (currentItem == 0) {
                                    ezVar = rzVar.V;
                                } else if (currentItem == 1) {
                                    ezVar = rzVar.f26840o0;
                                } else {
                                    ezVar = rzVar.G0;
                                }
                                if (ezVar != null) {
                                    oq oqVar = ezVar.d;
                                    oqVar.requestFocus();
                                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                    oqVar.onTouchEvent(obtain);
                                    obtain.recycle();
                                    MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                    oqVar.onTouchEvent(obtain2);
                                    obtain2.recycle();
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            nd0 nd0Var = new nd0(context2, f6Var2);
            this.f26866w = nd0Var;
            nd0Var.setViewPager(exVar);
            nd0Var.setShouldExpand(false);
            nd0Var.setIndicatorHeight(AndroidUtilities.dp(3.0f));
            nd0Var.setIndicatorColor(i0.a.k(z(org.telegram.ui.ActionBar.j6.Oe), 20));
            nd0Var.setUnderlineHeight(0);
            nd0Var.setTabPaddingLeftRight(AndroidUtilities.dp(11.0f));
            nd0Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f));
            frameLayout3.addView(nd0Var, w7.a6.e(-2, 48, 81));
            nd0Var.setOnPageChangeListener(new hx(this, z20));
            ImageView imageView2 = new ImageView(context2);
            this.E = imageView2;
            imageView2.setImageResource(R.drawable.smiles_tab_search);
            imageView2.setColorFilter(new PorterDuffColorFilter(z16 ? v(0.6f) : z(org.telegram.ui.ActionBar.j6.Re), mode));
            imageView2.setScaleType(scaleType);
            imageView2.setContentDescription(LocaleController.getString(R.string.Search));
            imageView2.setFocusable(true);
            imageView2.setVisibility(8);
            frameLayout3.addView(imageView2, w7.a6.d(48, 48.0f, 83, 2.0f, 0.0f, 2.0f, 0.0f));
            imageView2.setOnClickListener(new View.OnClickListener(this) {
                public final rz f25115b;

                {
                    this.f25115b = this;
                }

                @Override
                public final void onClick(View view22) {
                    ez ezVar;
                    switch (r2) {
                        case 0:
                            ry ryVar = this.f25115b.S;
                            ly lyVar = ryVar.f26778c;
                            int childCount = lyVar.getChildCount();
                            for (int i172 = 0; i172 < childCount; i172++) {
                                ((mh.c) lyVar.getChildAt(i172)).a(false, true);
                            }
                            ryVar.d = 0L;
                            ryVar.F.f26799b.a(false, true);
                            ryVar.l();
                            return;
                        case 1:
                            mz mzVar = this.f25115b.f26878z0;
                            lz lzVar = mzVar.f25318c;
                            int childCount2 = lzVar.getChildCount();
                            for (int i18 = 0; i18 < childCount2; i18++) {
                                ((mh.c) lzVar.getChildAt(i18)).a(false, true);
                            }
                            mzVar.d = 0L;
                            mzVar.Q.f26796a.a(false, true);
                            mzVar.l();
                            return;
                        case 2:
                            sy syVar = this.f25115b.f26858t1;
                            if (syVar != null) {
                                syVar.w();
                                return;
                            }
                            return;
                        default:
                            rz rzVar = this.f25115b;
                            int currentItem = rzVar.h.getCurrentItem();
                            if (currentItem == 0) {
                                ezVar = rzVar.V;
                            } else if (currentItem == 1) {
                                ezVar = rzVar.f26840o0;
                            } else {
                                ezVar = rzVar.G0;
                            }
                            if (ezVar != null) {
                                oq oqVar = ezVar.d;
                                oqVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                oqVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                oqVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                return;
                            }
                            return;
                    }
                }
            });
        } else {
            addView(frameLayout3, w7.a6.d(56, 48.0f, (LocaleController.isRTL ? 3 : 5) | 80, 0.0f, 0.0f, 2.0f, 0.0f));
            org.telegram.ui.Cells.z h02 = org.telegram.ui.ActionBar.j6.h0(AndroidUtilities.dp(56.0f), z(i16), z(i16));
            w7.c6.a(fxVar);
            fxVar.setPadding(0, 0, AndroidUtilities.dp(2.0f), 0);
            fxVar.setBackground(h02);
            fxVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
            fxVar.setFocusable(true);
            frameLayout3.addView(fxVar, w7.a6.d(48, 48.0f, 51, 2.0f, 0.0f, 2.0f, 0.0f));
            view2.setVisibility(8);
        }
        addView(exVar, 0, w7.a6.e(-1, -1, 51));
        di.h hVar = new di.h(context2, 21);
        this.N0 = hVar;
        hVar.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(6.0f), z(org.telegram.ui.ActionBar.j6.f18170qf)));
        hVar.setTextColor(z(org.telegram.ui.ActionBar.j6.f18152pf));
        hVar.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f));
        hVar.setGravity(16);
        hVar.setTextSize(1, 14.0f);
        hVar.setVisibility(4);
        addView(hVar, w7.a6.d(-2, -2.0f, 81, 5.0f, 0.0f, 5.0f, 53.0f));
        this.C1 = AndroidUtilities.dp(AndroidUtilities.isTablet() ? 40.0f : 32.0f);
        Field field2 = bv.f21908f;
        bv bvVar = new bv(new av(context2, f6Var2));
        if (bv.f21908f == null) {
            try {
                field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
                try {
                    field.setAccessible(true);
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                field = null;
            }
            bv.f21908f = field;
        }
        Field field3 = bv.f21908f;
        if (field3 != null) {
            try {
                bvVar.f21910a = (ViewTreeObserver.OnScrollChangedListener) field3.get(bvVar);
                bv.f21908f.set(bvVar, bv.f21909g);
            } catch (Exception unused3) {
                bvVar.f21910a = null;
            }
        }
        this.B1 = bvVar;
        bvVar.f21912c.setOnSelectionUpdateListener(new e(this, 10));
        this.A1 = MessagesController.getGlobalEmojiSettings().getInt("selected_page", 0);
        Emoji.loadRecentEmoji();
        yxVar.F(false);
        K(true, z11, z12, false);
        if (Build.VERSION.SDK_INT >= 31) {
            eh.d dVar3 = new eh.d(null);
            this.f26833l2 = dVar3;
            zg.a aVar = new zg.a(dVar3);
            this.f26839n2 = aVar;
            aVar.f48083f = LiteMode.isEnabled(262144);
            this.f26828j2 = new zg.e(false);
        } else {
            this.f26833l2 = null;
            this.f26839n2 = new zg.a(this.f26835m2);
            this.f26828j2 = null;
        }
        gh.k kVar = new gh.k(this);
        nd0 nd0Var2 = this.f26866w;
        if (nd0Var2 != null) {
            kVar.d(nd0Var2, this, new kw(this, 4), false);
        }
        zg.a aVar2 = this.f26839n2;
        aVar2.d = kVar;
        aVar2.e = this;
        ah.a[] aVarArr = new ah.a[3];
        px pxVar3 = pxVar;
        pxVar3.C0(new hw(this, 1));
        aVarArr[0] = new zg.k(pxVar3, this, new iw(pxVar3, 0));
        sw swVar2 = this.f26820h0;
        if (swVar2 != null) {
            swVar2.C0(new hw(this, 3));
            sw swVar3 = this.f26820h0;
            Objects.requireNonNull(swVar3);
            aVarArr[1] = new zg.k(swVar3, this, new iw(swVar3, 1));
        }
        yw ywVar2 = this.D0;
        if (ywVar2 != null) {
            ywVar2.C0(new hw(this, 4));
            aVarArr[2] = new zg.k(this.D0, this, new iw(this, 2));
        }
        this.f26831k2 = new nh(aVarArr, 1);
        setBlurredBackgroundDrawableFactory(this.f26839n2);
    }

    public static void a(rz rzVar, boolean z10) {
        sw swVar = rzVar.f26820h0;
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
        wc wcVar;
        org.telegram.ui.ActionBar.p2 p2Var = rzVar.Y1;
        int i10 = rzVar.f26805c1;
        ArrayList arrayList = rzVar.f26847q1;
        if (azVar != null) {
            if (azVar.getSpan() != null) {
                if (rzVar.f26858t1 != null) {
                    long j3 = azVar.getSpan().documentId;
                    TLRPC.Document document = azVar.getSpan().document;
                    dy dyVar = azVar.e;
                    if (dyVar != null && dyVar.f22503i) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (document == null) {
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            dy dyVar2 = (dy) arrayList.get(i11);
                            int i12 = 0;
                            while (true) {
                                ArrayList arrayList2 = dyVar2.f22500c;
                                if (arrayList2 != null && i12 < arrayList2.size()) {
                                    if (((TLRPC.Document) dyVar2.f22500c.get(i12)).f17201id == j3) {
                                        document = (TLRPC.Document) dyVar2.f22500c.get(i12);
                                        break;
                                    }
                                    i12++;
                                }
                            }
                        }
                    }
                    if (document == null) {
                        document = p5.f(i10, j3);
                    }
                    if (document != null) {
                        str4 = MessageObject.findAnimatedEmojiEmoticon(document);
                    } else {
                        str4 = null;
                    }
                    String str5 = str4;
                    if (!MessageObject.isFreeEmoji(document) && !UserConfig.getInstance(i10).isPremium() && (((syVar = rzVar.f26858t1) == null || !syVar.g()) && !rzVar.U0 && !z10)) {
                        rzVar.O(false);
                        if (p2Var != null) {
                            wcVar = wc.a0(p2Var);
                        } else {
                            wcVar = new wc(rzVar.f26849r, rzVar.Z1);
                        }
                        if (!rzVar.f26822h2 && p2Var != null) {
                            wcVar.J(R.raw.saved_messages, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint2)), LocaleController.getString(R.string.Open), new hw(rzVar, 8)).j();
                        } else {
                            wcVar.q(document, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint)), LocaleController.getString(R.string.PremiumMore), new hw(rzVar, 7)).j();
                        }
                        rzVar.f26822h2 = !rzVar.f26822h2;
                        return;
                    }
                    rzVar.F2 = SystemClock.elapsedRealtime();
                    rzVar.O(true);
                    rzVar.h("animated_" + j3);
                    rzVar.f26858t1.x(j3, document, str5, azVar.f21660c);
                    return;
                }
                return;
            }
            rzVar.F2 = SystemClock.elapsedRealtime();
            rzVar.O(true);
            if (str != null) {
                str2 = str;
            } else {
                str2 = (String) azVar.getTag();
            }
            new SpannableStringBuilder().append((CharSequence) str2);
            if (str == null) {
                if (!azVar.f21660c && (str3 = Emoji.emojiColor.get(str2)) != null) {
                    str2 = g(str2, str3);
                }
                rzVar.h(str2);
                sy syVar2 = rzVar.f26858t1;
                if (syVar2 != null) {
                    syVar2.l(Emoji.fixEmoji(str2));
                    return;
                }
                return;
            }
            sy syVar3 = rzVar.f26858t1;
            if (syVar3 != null) {
                syVar3.l(Emoji.fixEmoji(str));
            }
        }
    }

    public static void e(rz rzVar, int i10, int i11) {
        s4.c1 K;
        int[] iArr = rzVar.Q0;
        if (i10 == 1) {
            rzVar.n(rzVar.P, i11);
            return;
        }
        sy syVar = rzVar.f26858t1;
        if ((syVar == null || !syVar.z()) && !rzVar.J0) {
            vl0 x10 = rzVar.x(i10);
            if (i11 > 0 && x10 != null && x10.getVisibility() == 0 && (K = x10.K(0)) != null && K.f41610a.getTop() + rzVar.f26801b1 >= x10.getPaddingTop()) {
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
                rzVar.a0();
            } else {
                rzVar.y(i10).setTranslationY(Math.max(-AndroidUtilities.dp(48.0f), iArr[i10]));
            }
        }
    }

    public static void f(rz rzVar, boolean z10) {
        int N0;
        xy xyVar = rzVar.f26823i0;
        vw vwVar = rzVar.f26840o0;
        sw swVar = rzVar.f26820h0;
        if (swVar != null && (swVar.getAdapter() instanceof wy)) {
            wy wyVar = (wy) swVar.getAdapter();
            if (!wyVar.f28866s && wyVar.h == 0 && !wyVar.f28868x.isEmpty() && (N0 = xyVar.N0()) != -1 && N0 > xyVar.B() - 5) {
                String str = wyVar.f28867w;
                String str2 = wyVar.f28865r;
                boolean z11 = wyVar.v;
                wyVar.F(str, str2, true, z11, z11);
            }
        }
        sy syVar = rzVar.f26858t1;
        if (syVar != null && syVar.z()) {
            boolean z12 = false;
            s4.c1 K = swVar.K(0);
            if (K == null) {
                ez.a(vwVar, true, !z10);
                return;
            }
            if (K.f41610a.getTop() < swVar.getPaddingTop()) {
                z12 = true;
            }
            ez.a(vwVar, z12, !z10);
        } else if (vwVar != null && swVar != null) {
            vwVar.f22779a.a(true, !z10);
        }
    }

    public static String g(String str, String str2) {
        boolean z10;
        String str3;
        if (CompoundEmoji.isHandshake(str) != null) {
            return CompoundEmoji.applyColor(str, str2);
        }
        if (Emoji.endsWithRightArrow(str)) {
            str = com.google.android.gms.internal.vision.e2.h(2, 0, str);
            z10 = true;
        } else {
            z10 = false;
        }
        int length = str.length();
        if (length > 2 && str.charAt(str.length() - 2) == 8205) {
            str3 = str.substring(str.length() - 2);
            str = com.google.android.gms.internal.vision.e2.h(2, 0, str);
        } else if (length > 3 && str.charAt(str.length() - 3) == 8205) {
            str3 = str.substring(str.length() - 3);
            str = com.google.android.gms.internal.vision.e2.h(3, 0, str);
        } else {
            str3 = null;
        }
        String t10 = org.telegram.ui.Cells.r6.t(str, str2);
        if (str3 != null) {
            t10 = org.telegram.ui.Cells.r6.t(t10, str3);
        }
        if (z10) {
            return org.telegram.ui.Cells.r6.t(t10, "\u200d➡");
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
        bx bxVar = this.G0;
        if (bxVar != null) {
            bxVar.b();
        }
        vw vwVar = this.f26840o0;
        if (vwVar != null) {
            vwVar.b();
        }
        pw pwVar = this.V;
        if (pwVar != null) {
            pwVar.b();
        }
    }

    public final void C() {
        zg.e eVar;
        float f7;
        if (Build.VERSION.SDK_INT >= 31 && (eVar = this.f26828j2) != null) {
            nd0 nd0Var = this.f26866w;
            RectF rectF = this.f26880z2;
            gh.k.c(nd0Var, this, rectF);
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
            eVar.g(1, this.A2);
            eVar.e(this.f26831k2, getWidth(), getHeight());
        }
    }

    public final void D() {
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        int i10 = this.f26805c1;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.groupPackUpdated);
        if (this.f26875y0 != null) {
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.recentDocumentsDidLoad);
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.featuredStickersDidLoad);
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.groupStickersDidLoad);
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        }
    }

    public final void E(boolean z10, boolean z11) {
        dz dzVar;
        boolean z12;
        if (this.A1 != 0 && this.f26868w1) {
            this.A1 = 0;
        }
        if (this.A1 == 0 && this.f26864v1) {
            this.A1 = 1;
        }
        int i10 = this.A1;
        ex exVar = this.h;
        if (i10 != 0 && !z10 && this.e.size() != 1) {
            int i11 = this.A1;
            if (i11 == 1) {
                N(false, false);
                if (!this.f26860u0 && !this.f26863v0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                S(z12, false);
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
                N(false, false);
                S(false, false);
                if (exVar.getCurrentItem() != 1) {
                    exVar.x(1, false);
                }
                wx wxVar = this.f26843p0;
                if (wxVar != null) {
                    wxVar.m(0);
                }
                vw vwVar = this.f26840o0;
                if (vwVar != null && (dzVar = vwVar.f22784r) != null) {
                    dzVar.E1(null);
                }
            }
        } else {
            N(true, false);
            S(false, false);
            if (exVar.getCurrentItem() != 0) {
                exVar.x(0, !z10);
            }
            if (z11) {
                AndroidUtilities.runOnUIThread(new hw(this, 9), 350L);
            }
        }
        O(true);
    }

    public final void F() {
        iz izVar = this.f26875y0;
        if (izVar != null) {
            izVar.l();
        }
        mz mzVar = this.f26878z0;
        if (mzVar != null) {
            mzVar.l();
        }
        if (org.telegram.ui.tt.q().E) {
            org.telegram.ui.tt.q().n();
        }
        org.telegram.ui.tt.q().u();
    }

    @Override
    public final void G(int i10, float f7, float f10, le.e eVar) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = 4;
        if (i10 == 0) {
            q(false);
            float f11 = 1.0f - this.f26796a.e;
            bx bxVar = this.G0;
            bxVar.setAlpha(f11);
            if (f11 > 0.0f) {
                i13 = 0;
            } else {
                i13 = 4;
            }
            bxVar.setVisibility(i13);
            float f12 = 1.0f - f11;
            mh.d dVar = this.H0;
            dVar.setAlpha(f12);
            dVar.setTranslationY((-AndroidUtilities.dp(15.0f)) * f11);
            int i16 = (f12 > 0.0f ? 1 : (f12 == 0.0f ? 0 : -1));
            if (i16 > 0) {
                i14 = 0;
            } else {
                i14 = 4;
            }
            dVar.setVisibility(i14);
            bi.n7 n7Var = this.M;
            n7Var.setAlpha(f12);
            n7Var.setTranslationY(AndroidUtilities.dp(30.0f) * f11);
            if (i16 > 0) {
                i15 = 0;
            }
            n7Var.setVisibility(i15);
            T();
            this.f26871x0.invalidate();
        } else if (i10 == 1) {
            l(false);
            float f13 = 1.0f - this.f26799b.e;
            pw pwVar = this.V;
            pwVar.setAlpha(f13);
            if (f13 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            pwVar.setVisibility(i11);
            float f14 = 1.0f - f13;
            mh.d dVar2 = this.U;
            dVar2.setAlpha(f14);
            dVar2.setTranslationY((-AndroidUtilities.dp(15.0f)) * f13);
            int i17 = (f14 > 0.0f ? 1 : (f14 == 0.0f ? 0 : -1));
            if (i17 > 0) {
                i12 = 0;
            } else {
                i12 = 4;
            }
            dVar2.setVisibility(i12);
            bi.n7 n7Var2 = this.K;
            n7Var2.setAlpha(f14);
            n7Var2.setTranslationY(AndroidUtilities.dp(30.0f) * f13);
            if (i17 > 0) {
                i15 = 0;
            }
            n7Var2.setVisibility(i15);
            T();
            this.J.invalidate();
        }
    }

    public final void H(int i10) {
        sy syVar = this.f26858t1;
        if ((syVar != null && syVar.z()) || i10 == 0) {
            return;
        }
        HorizontalScrollView y3 = y(i10);
        this.Q0[i10] = 0;
        y3.setTranslationY(0);
    }

    public final void I(int i10, int i11) {
        qx qxVar = this.Q;
        View m10 = qxVar.m(i10);
        int L0 = qxVar.L0();
        int i12 = 1;
        if ((m10 == null && Math.abs(i10 - L0) > qxVar.J * 9.0f) || !SharedConfig.animationsEnabled()) {
            if (qxVar.L0() < i10) {
                i12 = 0;
            }
            yk0 yk0Var = this.f26800b0;
            yk0Var.f29444b = i12;
            yk0Var.c(i10, i11, false, false);
            return;
        }
        this.J0 = true;
        bi.t1 t1Var = new bi.t1(this, this.P.getContext(), 1);
        t1Var.f41760a = i10;
        t1Var.f10694p = i11;
        qxVar.w0(t1Var);
    }

    public final void J(int i10, int i11) {
        zw zwVar = this.E0;
        View m10 = zwVar.m(i10);
        int L0 = zwVar.L0();
        int i12 = 1;
        if (m10 == null && Math.abs(i10 - L0) > 40) {
            if (zwVar.L0() < i10) {
                i12 = 0;
            }
            yk0 yk0Var = this.f26797a0;
            yk0Var.f29444b = i12;
            yk0Var.c(i10, i11, false, false);
            return;
        }
        this.J0 = true;
        this.D0.x0(i10);
    }

    public final void K(boolean z10, boolean z11, boolean z12, boolean z13) {
        ArrayList arrayList = this.e;
        arrayList.clear();
        boolean z14 = false;
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.d;
            if (i10 >= arrayList2.size()) {
                break;
            }
            if (((nz) arrayList2.get(i10)).f25619a == 0 && z10) {
                arrayList.add((nz) arrayList2.get(i10));
            }
            if (((nz) arrayList2.get(i10)).f25619a == 1 && z12) {
                arrayList.add((nz) arrayList2.get(i10));
            }
            if (((nz) arrayList2.get(i10)).f25619a == 2 && z11) {
                arrayList.add((nz) arrayList2.get(i10));
            }
            i10++;
        }
        nd0 nd0Var = this.f26866w;
        if (nd0Var != null) {
            if (arrayList.size() > 1) {
                z14 = true;
            }
            AndroidUtilities.updateViewVisibilityAnimated(nd0Var, z14, 1.0f, z13);
        }
        ex exVar = this.h;
        if (exVar != null) {
            exVar.setAdapter(null);
            exVar.setAdapter(this.L0);
            if (nd0Var != null) {
                nd0Var.setViewPager(exVar);
            }
        }
    }

    public final void L(final mh.b bVar, final TLObject tLObject, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final boolean z10, boolean z11) {
        String formatPluralString;
        mz mzVar;
        ry ryVar;
        if (stickerSet != null) {
            if (!z10 || (ryVar = this.S) == null || ryVar.d == stickerSet.f17222id) {
                if (!z10 && (mzVar = this.f26878z0) != null && mzVar.d != stickerSet.f17222id) {
                    return;
                }
                final boolean isStickerPackInstalled = MediaDataController.getInstance(this.f26805c1).isStickerPackInstalled(stickerSet.f17222id);
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
                bVar.f13660h0.a(!isStickerPackInstalled, z11);
                bVar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        int i10;
                        rz rzVar = rz.this;
                        MediaDataController mediaDataController = MediaDataController.getInstance(rzVar.f26805c1);
                        Context context = rzVar.getContext();
                        if (isStickerPackInstalled) {
                            i10 = 0;
                        } else {
                            i10 = 2;
                        }
                        org.telegram.ui.ActionBar.p2 p2Var = rzVar.Y1;
                        FrameLayout frameLayout = rzVar.f26853s;
                        mh.b bVar2 = bVar;
                        TLObject tLObject2 = tLObject;
                        TLRPC.StickerSet stickerSet2 = stickerSet;
                        TLRPC.Document document2 = document;
                        boolean z12 = z10;
                        mediaDataController.toggleStickerSet(context, tLObject2, document2, i10, p2Var, frameLayout, false, true, new i2.a1(rzVar, bVar2, tLObject2, stickerSet2, document2, z12, 9), false);
                        rzVar.L(bVar2, tLObject2, stickerSet2, document2, z12, true);
                    }
                });
            }
        }
    }

    public final void M(long j3, boolean z10, boolean z11) {
        int i10;
        View childAt;
        float f7;
        nd0 nd0Var = this.f26866w;
        if (nd0Var != null) {
            this.f26864v1 = z10;
            this.f26868w1 = z11;
            if (!z11 && !z10) {
                this.f26861u1 = 0L;
            } else {
                this.f26861u1 = j3;
            }
            if (z11) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            LinearLayout linearLayout = nd0Var.d;
            if (i10 >= linearLayout.getChildCount()) {
                childAt = null;
            } else {
                childAt = linearLayout.getChildAt(i10);
            }
            if (childAt != null) {
                if (this.f26861u1 != 0) {
                    f7 = 0.15f;
                } else {
                    f7 = 1.0f;
                }
                childAt.setAlpha(f7);
                ex exVar = this.h;
                if (z11) {
                    if (this.f26861u1 != 0 && exVar.getCurrentItem() != 0) {
                        N(true, true);
                        S(false, true);
                        exVar.x(0, false);
                    }
                } else if (this.f26861u1 != 0 && exVar.getCurrentItem() != 1) {
                    N(false, true);
                    S(false, true);
                    exVar.x(1, false);
                }
            }
        }
    }

    public final void N(boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        float f12;
        fx fxVar = this.f26870x;
        if (!z10 || fxVar.getTag() != null) {
            if ((!z10 && fxVar.getTag() != null) || this.f26842o2) {
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
                this.F.setInterpolator(wr.f28820g);
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

    public final void O(boolean z10) {
        Integer num;
        this.H = 0.0f;
        sy syVar = this.f26858t1;
        if (syVar != null && syVar.z()) {
            z10 = false;
        }
        FrameLayout frameLayout = this.f26836n;
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
                this.W.setInterpolator(wr.f28820g);
                this.W.addListener(new rm(this, 9));
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
        TLRPC.Chat chat = MessagesController.getInstance(this.f26805c1).getChat(Long.valueOf(this.f26861u1));
        if (chat != null) {
            di.h hVar = this.N0;
            if (z10) {
                if (!ChatObject.hasAdminRights(chat) && (tL_chatBannedRights = chat.default_banned_rights) != null && (tL_chatBannedRights.send_stickers || (z11 && tL_chatBannedRights.send_plain))) {
                    org.telegram.ui.ActionBar.p2 p2Var = this.Y1;
                    if (!(p2Var instanceof org.telegram.ui.eo) || !((org.telegram.ui.eo) p2Var).K6()) {
                        if (z11) {
                            hVar.setText(LocaleController.getString(R.string.GlobalAttachEmojiRestricted));
                        } else if (z12) {
                            hVar.setText(LocaleController.getString(R.string.GlobalAttachGifRestricted));
                        } else {
                            hVar.setText(LocaleController.getString(R.string.GlobalAttachStickersRestricted));
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
                            hVar.setText(LocaleController.getString(R.string.AttachPlainRestrictedForever));
                        } else if (z12) {
                            hVar.setText(LocaleController.getString(R.string.AttachGifRestrictedForever));
                        } else {
                            hVar.setText(LocaleController.getString(R.string.AttachStickersRestrictedForever));
                        }
                    } else {
                        if (z11) {
                            hVar.setText(LocaleController.formatString("AttachPlainRestricted", R.string.AttachPlainRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                        }
                        if (z12) {
                            hVar.setText(LocaleController.formatString("AttachGifRestricted", R.string.AttachGifRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                        } else {
                            hVar.setText(LocaleController.formatString("AttachStickersRestricted", R.string.AttachStickersRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                        }
                    }
                }
                hVar.setVisibility(0);
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
                f7 = hVar.getAlpha();
            } else {
                f7 = 1.0f;
            }
            float f11 = 0.0f;
            if (!z10) {
                f10 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(hVar, View.ALPHA, f7, f10);
            if (z10) {
                translationY = AndroidUtilities.dp(12.0f);
            } else {
                translationY = hVar.getTranslationY();
            }
            if (!z10) {
                f11 = AndroidUtilities.dp(12.0f);
            }
            animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(hVar, View.TRANSLATION_Y, translationY, f11));
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
            this.J2.setInterpolator(wr.h);
            this.J2.start();
        }
    }

    public final void S(boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        float f12;
        ImageView imageView = this.f26874y;
        if (imageView != null && !this.f26845p2) {
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
                        this.G.setInterpolator(wr.f28820g);
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

    public final void T() {
        int measuredHeight;
        int dp;
        float f7;
        org.telegram.ui.ActionBar.p2 p2Var;
        View view = (View) getParent();
        if (view != null) {
            float y3 = getY();
            if (getLayoutParams().height > 0) {
                measuredHeight = getLayoutParams().height;
            } else {
                measuredHeight = getMeasuredHeight();
            }
            float f10 = y3 + measuredHeight;
            if ((!AndroidUtilities.isInMultiwindow && ((p2Var = this.Y1) == null || !p2Var.isInBubbleMode())) || this.V0) {
                dp = view.getHeight();
            } else {
                dp = AndroidUtilities.dp(1.0f);
            }
            float f11 = f10 - dp;
            float f12 = this.f26852r2;
            FrameLayout frameLayout = this.f26836n;
            if (f12 >= 0.0f) {
                f11 += getMeasuredHeight() - this.f26852r2;
            } else if (frameLayout.getTop() - f11 < 0.0f || !this.f26873x2) {
                f11 = 0.0f;
            }
            float f13 = -f11;
            boolean z10 = this.f26807d0;
            if (z10) {
                f7 = 45.0f;
            } else {
                f7 = 50.0f;
            }
            float lerp = f13 + AndroidUtilities.lerp(AndroidUtilities.dp(f7), -this.f26848q2, this.G2.e);
            frameLayout.setTranslationY(lerp);
            if (z10) {
                this.f26849r.setTranslationY(lerp);
            }
        }
    }

    public final void U() {
        ez ezVar;
        boolean z10;
        int z11;
        int z12;
        int z13;
        int z14;
        int z15;
        int z16;
        int z17;
        int z18;
        cw cwVar;
        int z19;
        int z20;
        int z21;
        int z22;
        int z23;
        int z24;
        int z25;
        int z26;
        int z27;
        boolean z28 = this.f26860u0;
        View view = this.v;
        if (!z28) {
            setBackground(null);
            view.setBackground(null);
        } else if (!AndroidUtilities.isInMultiwindow && !this.N1) {
            int i10 = org.telegram.ui.ActionBar.j6.He;
            setBackgroundColor(z(i10));
            if (this.f26807d0) {
                view.setBackgroundColor(z(i10));
            }
        } else {
            Drawable background = getBackground();
            if (background != null) {
                background.setColorFilter(new PorterDuffColorFilter(z(org.telegram.ui.ActionBar.j6.He), PorterDuff.Mode.MULTIPLY));
            }
        }
        ow owVar = this.I;
        if (owVar != null) {
            if (this.f26860u0) {
                owVar.setBackgroundColor(z(org.telegram.ui.ActionBar.j6.He));
                this.O.setBackgroundColor(z(org.telegram.ui.ActionBar.j6.Ke));
            } else {
                owVar.setBackground(null);
            }
        }
        bv bvVar = this.B1;
        if (bvVar != null) {
            bvVar.f21912c.a();
        }
        int i11 = 0;
        while (true) {
            ezVar = this.V;
            z10 = this.f26825i2;
            if (i11 >= 3) {
                break;
            }
            if (i11 == 0) {
                ezVar = this.G0;
            } else if (i11 != 1) {
                ezVar = this.f26840o0;
            }
            if (ezVar != null) {
                oq oqVar = ezVar.d;
                FrameLayout frameLayout = ezVar.f22783n;
                View view2 = ezVar.f22782f;
                if (this.f26860u0) {
                    view2.setBackgroundColor(z(org.telegram.ui.ActionBar.j6.He));
                } else {
                    view2.setBackground(null);
                }
                ezVar.e.setBackgroundColor(z(org.telegram.ui.ActionBar.j6.Ke));
                hn0 hn0Var = ezVar.f22781c;
                if (z10) {
                    z24 = v(0.4f);
                } else {
                    z24 = z(org.telegram.ui.ActionBar.j6.Je);
                }
                hn0Var.a(z24);
                Drawable background2 = frameLayout.getBackground();
                if (z10) {
                    z25 = v(0.06f);
                } else {
                    z25 = z(org.telegram.ui.ActionBar.j6.Ie);
                }
                org.telegram.ui.ActionBar.j6.w1(z25, background2);
                frameLayout.invalidate();
                if (z10) {
                    z26 = v(0.45f);
                } else {
                    z26 = z(org.telegram.ui.ActionBar.j6.Je);
                }
                oqVar.setHintTextColor(z26);
                if (z10) {
                    z27 = v(0.8f);
                } else {
                    z27 = z(org.telegram.ui.ActionBar.j6.G6);
                }
                oqVar.setTextColor(z27);
            }
            i11++;
        }
        Paint paint = this.f26855s1;
        if (paint != null) {
            paint.setColor(z(org.telegram.ui.ActionBar.j6.f17880af));
        }
        px pxVar = this.P;
        if (pxVar != null) {
            pxVar.setGlowColor(z(org.telegram.ui.ActionBar.j6.He));
        }
        yw ywVar = this.D0;
        if (ywVar != null) {
            ywVar.setGlowColor(z(org.telegram.ui.ActionBar.j6.He));
        }
        cx cxVar = this.B0;
        if (cxVar != null) {
            cxVar.setIndicatorColor(z(org.telegram.ui.ActionBar.j6.Qe));
            cxVar.setUnderlineColor(z(org.telegram.ui.ActionBar.j6.Ke));
            if (this.f26860u0) {
                cxVar.setBackgroundColor(z(org.telegram.ui.ActionBar.j6.He));
            } else {
                cxVar.setBackground(null);
            }
        }
        wx wxVar = this.f26843p0;
        if (wxVar != null) {
            wxVar.setIndicatorColor(z(org.telegram.ui.ActionBar.j6.Qe));
            wxVar.setUnderlineColor(z(org.telegram.ui.ActionBar.j6.Ke));
            if (this.f26860u0) {
                wxVar.setBackgroundColor(z(org.telegram.ui.ActionBar.j6.He));
            } else {
                wxVar.setBackground(null);
            }
        }
        fx fxVar = this.f26870x;
        if (fxVar != null) {
            if (z10) {
                z23 = v(0.6f);
            } else {
                z23 = z(org.telegram.ui.ActionBar.j6.Re);
            }
            fxVar.setColorFilter(new PorterDuffColorFilter(z23, PorterDuff.Mode.MULTIPLY));
            if (ezVar == null) {
                Drawable background3 = fxVar.getBackground();
                int i12 = org.telegram.ui.ActionBar.j6.He;
                org.telegram.ui.ActionBar.j6.B1(background3, z(i12), false);
                org.telegram.ui.ActionBar.j6.B1(fxVar.getBackground(), z(i12), true);
            }
        }
        ImageView imageView = this.f26874y;
        if (imageView != null) {
            if (z10) {
                z22 = v(0.6f);
            } else {
                z22 = z(org.telegram.ui.ActionBar.j6.Re);
            }
            imageView.setColorFilter(new PorterDuffColorFilter(z22, PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.E;
        if (imageView2 != null) {
            if (z10) {
                z21 = v(0.6f);
            } else {
                z21 = z(org.telegram.ui.ActionBar.j6.Re);
            }
            imageView2.setColorFilter(new PorterDuffColorFilter(z21, PorterDuff.Mode.MULTIPLY));
        }
        di.h hVar = this.N0;
        if (hVar != null) {
            ((ShapeDrawable) hVar.getBackground()).getPaint().setColor(z(org.telegram.ui.ActionBar.j6.f18170qf));
            hVar.setTextColor(z(org.telegram.ui.ActionBar.j6.f18152pf));
        }
        wy wyVar = this.f26826j0;
        if (wyVar != null) {
            yy yyVar = wyVar.e;
            ImageView imageView3 = yyVar.f29525a;
            int i13 = org.telegram.ui.ActionBar.j6.Le;
            imageView3.setColorFilter(new PorterDuffColorFilter(z(i13), PorterDuff.Mode.MULTIPLY));
            yyVar.f29526b.setTextColor(z(i13));
            yyVar.f29527c.setProgressColor(z(org.telegram.ui.ActionBar.j6.f17999h6));
        }
        this.f26812e2 = new PorterDuffColorFilter(z(org.telegram.ui.ActionBar.j6.Oh), PorterDuff.Mode.SRC_IN);
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
                z19 = z(org.telegram.ui.ActionBar.j6.Ne);
            }
            org.telegram.ui.ActionBar.j6.y1(drawable, z19, false);
            Drawable drawable2 = drawableArr[i14];
            if (z10) {
                z20 = v(0.8f);
            } else {
                z20 = z(org.telegram.ui.ActionBar.j6.Oe);
            }
            org.telegram.ui.ActionBar.j6.y1(drawable2, z20, true);
            i14++;
        }
        if (owVar != null && (cwVar = owVar.f23448y) != null) {
            cwVar.d();
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
                z17 = z(org.telegram.ui.ActionBar.j6.Me);
            }
            org.telegram.ui.ActionBar.j6.y1(drawable3, z17, false);
            Drawable drawable4 = drawableArr2[i15];
            if (z10) {
                z18 = v(0.8f);
            } else {
                z18 = z(org.telegram.ui.ActionBar.j6.Oe);
            }
            org.telegram.ui.ActionBar.j6.y1(drawable4, z18, true);
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
                z15 = z(org.telegram.ui.ActionBar.j6.Me);
            }
            org.telegram.ui.ActionBar.j6.y1(drawable5, z15, false);
            Drawable drawable6 = drawableArr3[i16];
            if (z10) {
                z16 = v(0.8f);
            } else {
                z16 = z(org.telegram.ui.ActionBar.j6.Oe);
            }
            org.telegram.ui.ActionBar.j6.y1(drawable6, z16, true);
            i16++;
        }
        org.telegram.ui.ActionBar.v5 v5Var = this.a2;
        if (v5Var != null) {
            if (z10) {
                z13 = v(0.4f);
            } else {
                z13 = z(org.telegram.ui.ActionBar.j6.Ne);
            }
            org.telegram.ui.ActionBar.j6.y1(v5Var, z13, false);
            if (z10) {
                z14 = v(0.8f);
            } else {
                z14 = z(org.telegram.ui.ActionBar.j6.Oe);
            }
            org.telegram.ui.ActionBar.j6.y1(v5Var, z14, true);
        }
        org.telegram.ui.ActionBar.v5 v5Var2 = this.f26802b2;
        if (v5Var2 != null) {
            if (z10) {
                z11 = v(0.4f);
            } else {
                z11 = z(org.telegram.ui.ActionBar.j6.Qe);
            }
            org.telegram.ui.ActionBar.j6.y1(v5Var2, z11, false);
            if (z10) {
                z12 = v(0.8f);
            } else {
                z12 = z(org.telegram.ui.ActionBar.j6.Qe);
            }
            org.telegram.ui.ActionBar.j6.y1(v5Var2, z12, true);
        }
    }

    public final void V() {
        px pxVar = this.P;
        if (pxVar != null) {
            for (int i10 = 0; i10 < pxVar.getChildCount(); i10++) {
                View childAt = pxVar.getChildAt(i10);
                if (childAt instanceof iy) {
                    ((iy) childAt).a(true);
                }
            }
        }
    }

    public final void W(int i10) {
        int i11;
        if (!this.f26814f0) {
            int i12 = -1;
            if (i10 != -1) {
                int size = getRecentEmoji().size() + (this.f26807d0 ? 1 : 0);
                yx yxVar = this.R;
                int i13 = yxVar.f29517c;
                ArrayList arrayList = yxVar.f29523x;
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
                                dy dyVar = (dy) this.f26847q1.get(size2);
                                while (i14 < emojipacks.size()) {
                                    long j3 = emojipacks.get(i14).f22499b.f17222id;
                                    long j10 = dyVar.f22499b.f17222id;
                                    if (j3 == j10 && (!dyVar.f22502g || (!dyVar.f22501f && !this.f26844p1.contains(Long.valueOf(j10))))) {
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
        dz dzVar;
        int i11;
        boolean z12;
        boolean z13;
        wx wxVar = this.f26843p0;
        int currentPosition = wxVar.getCurrentPosition();
        int i12 = this.f26850r0;
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
        boolean isEmpty = this.f26824i1.isEmpty();
        wxVar.d(false);
        this.f26850r0 = -2;
        this.f26854s0 = -2;
        this.f26857t0 = -2;
        Drawable[] drawableArr = this.Z0;
        if (!isEmpty) {
            this.f26850r0 = 0;
            wxVar.b(0, drawableArr[0]).setContentDescription(LocaleController.getString(R.string.RecentStickers));
            i10 = 1;
        } else {
            i10 = 0;
        }
        this.f26854s0 = i10;
        wxVar.b(1, drawableArr[1]).setContentDescription(LocaleController.getString(R.string.FeaturedGifs));
        this.f26857t0 = i10 + 1;
        AndroidUtilities.dp(13.0f);
        AndroidUtilities.dp(11.0f);
        int i13 = this.f26805c1;
        ArrayList<String> arrayList = MessagesController.getInstance(i13).gifSearchEmojies;
        int size = arrayList.size();
        int i14 = 0;
        while (i14 < size) {
            String str = arrayList.get(i14);
            Emoji.EmojiDrawable emojiDrawable = Emoji.getEmojiDrawable(str);
            if (emojiDrawable != null) {
                TLRPC.Document emojiAnimatedSticker = MediaDataController.getInstance(i13).getEmojiAnimatedSticker(str);
                String j3 = hc.b.j(i14 + 3, "tab");
                int i15 = wxVar.f27126x;
                wxVar.f27126x = i15 + 1;
                ox0 ox0Var = (ox0) wxVar.f27116n.get(j3);
                if (ox0Var != null) {
                    wxVar.g(j3, ox0Var, i15);
                    i11 = currentPosition;
                    z12 = z11;
                } else {
                    i11 = currentPosition;
                    z12 = z11;
                    ox0Var = new ox0(wxVar.getContext(), 2);
                    ox0Var.setFocusable(true);
                    ox0Var.setOnClickListener(new lm0(wxVar, 2));
                    ox0Var.setExpanded(wxVar.f27109f0);
                    ox0Var.a(wxVar.f27112i0);
                    wxVar.e.addView(ox0Var, i15);
                }
                ox0Var.d = false;
                ox0Var.setTag(R.id.index_tag, Integer.valueOf(i15));
                ox0Var.setTag(R.id.parent_tag, emojiDrawable);
                ox0Var.setTag(R.id.object_tag, emojiAnimatedSticker);
                if (i15 == wxVar.f27127y) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                ox0Var.setSelected(z13);
                wxVar.h.put(j3, ox0Var);
                ox0Var.setContentDescription(str);
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
            wxVar.m(this.f26854s0);
            vw vwVar = this.f26840o0;
            if (vwVar != null && (dzVar = vwVar.f22784r) != null) {
                dzVar.E1(null);
                return;
            }
            return;
        }
        WeakHashMap weakHashMap = r0.i0.f41062a;
        if (wxVar.isLaidOut()) {
            if (!isEmpty && !z14) {
                wxVar.k(i16 + 1, 0);
            } else if (isEmpty && z14) {
                wxVar.k(i16 - 1, 0);
            }
        }
    }

    public final void Y() {
        wy wyVar;
        int size = this.f26824i1.size();
        long calcDocumentsHash = MediaDataController.calcDocumentsHash(this.f26824i1, Integer.MAX_VALUE);
        ArrayList<TLRPC.Document> recentGifs = MediaDataController.getInstance(this.f26805c1).getRecentGifs();
        this.f26824i1 = recentGifs;
        long calcDocumentsHash2 = MediaDataController.calcDocumentsHash(recentGifs, Integer.MAX_VALUE);
        if ((this.f26843p0 != null && size == 0 && !this.f26824i1.isEmpty()) || (size != 0 && this.f26824i1.isEmpty())) {
            X();
        }
        if ((size != this.f26824i1.size() || calcDocumentsHash != calcDocumentsHash2) && (wyVar = this.f26837n0) != null) {
            wyVar.l();
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
        cx cxVar = this.B0;
        if (cxVar != null) {
            gc1 gc1Var = cxVar.e;
            if (cxVar.f27123s != null) {
                return;
            }
            this.F1 = -2;
            this.G1 = -2;
            this.H1 = -2;
            this.I1 = -2;
            this.f26810e0 = false;
            this.E1 = 0;
            int currentPosition = cxVar.getCurrentPosition();
            boolean z16 = true;
            if (getParent() != null && getVisibility() == 0 && (this.f26876y1.size() != 0 || this.f26879z1.size() != 0)) {
                z11 = true;
            } else {
                z11 = false;
            }
            cxVar.d(z11);
            int i11 = this.f26805c1;
            MediaDataController mediaDataController = MediaDataController.getInstance(i11);
            SharedPreferences emojiSettings = MessagesController.getEmojiSettings(i11);
            ArrayList arrayList3 = this.f26834m1;
            arrayList3.clear();
            ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = mediaDataController.getFeaturedStickerSets();
            int size = featuredStickerSets.size();
            for (int i12 = 0; i12 < size; i12++) {
                TLRPC.StickerSetCovered stickerSetCovered = featuredStickerSets.get(i12);
                if (!mediaDataController.isStickerPackInstalled(stickerSetCovered.set.f17222id)) {
                    arrayList3.add(stickerSetCovered);
                }
            }
            pz pzVar = this.F0;
            if (pzVar != null) {
                pzVar.l();
            }
            boolean isEmpty = featuredStickerSets.isEmpty();
            long j3 = 0;
            Drawable[] drawableArr = this.Y0;
            if (!isEmpty && (arrayList3.isEmpty() || emojiSettings.getLong("featured_hidden", 0L) == featuredStickerSets.get(0).set.f17222id)) {
                if (mediaDataController.getUnreadStickerSets().isEmpty()) {
                    i10 = 2;
                } else {
                    i10 = 3;
                }
                ox0 c10 = cxVar.c(i10, drawableArr[i10]);
                c10.h.setText(LocaleController.getString(R.string.FeaturedStickersShort));
                c10.setContentDescription(LocaleController.getString(R.string.FeaturedStickers));
                int i13 = this.E1;
                this.H1 = i13;
                this.E1 = i13 + 1;
            }
            if (!this.f26830k1.isEmpty()) {
                int i14 = this.E1;
                this.G1 = i14;
                this.E1 = i14 + 1;
                ox0 c11 = cxVar.c(1, drawableArr[1]);
                c11.h.setText(LocaleController.getString(R.string.FavoriteStickersShort));
                c11.setContentDescription(LocaleController.getString(R.string.FavoriteStickers));
            }
            if (!this.f26827j1.isEmpty()) {
                int i15 = this.E1;
                this.F1 = i15;
                this.E1 = i15 + 1;
                ox0 c12 = cxVar.c(0, drawableArr[0]);
                c12.h.setText(LocaleController.getString(R.string.RecentStickersShort));
                c12.setContentDescription(LocaleController.getString(R.string.RecentStickers));
            }
            ArrayList arrayList4 = this.f26808d1;
            arrayList4.clear();
            org.telegram.ui.ActionBar.f6 f6Var = null;
            this.f26821h1 = null;
            this.f26815f1 = -1;
            this.f26811e1 = -10;
            if (this.H2 == null || z10) {
                this.H2 = new ArrayList(mediaDataController.getStickerSets(0));
            }
            ArrayList<TLRPC.TL_messages_stickerSet> arrayList5 = this.H2;
            int i16 = 0;
            while (true) {
                TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.f26872x1;
                if (i16 >= stickerSetCoveredArr.length) {
                    break;
                }
                TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCoveredArr[i16];
                long j10 = j3;
                if (stickerSetCovered2 != null) {
                    TLRPC.TL_messages_stickerSet stickerSetById = mediaDataController.getStickerSetById(stickerSetCovered2.set.f17222id);
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
                long j12 = MessagesController.getEmojiSettings(i11).getLong("group_hide_stickers_" + this.J1.f17196id, -1L);
                TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(this.J1.f17196id));
                if (chat != null && this.J1.stickerset != null && ChatObject.hasAdminRights(chat)) {
                    TLRPC.StickerSet stickerSet3 = this.J1.stickerset;
                    if (stickerSet3 != null) {
                        if (j12 == stickerSet3.f17222id) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        this.f26818g1 = z15;
                    }
                } else {
                    if (j12 != -1) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    this.f26818g1 = z14;
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
                        if (this.f26818g1) {
                            this.f26811e1 = arrayList4.size();
                            arrayList4.add(tL_messages_stickerSet3);
                        } else {
                            this.f26811e1 = 0;
                            arrayList4.add(0, tL_messages_stickerSet3);
                        }
                        if (!this.J1.can_set_stickers) {
                            tL_messages_stickerSet3 = null;
                        }
                        this.f26821h1 = tL_messages_stickerSet3;
                    }
                } else if (chatFull.can_set_stickers) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = new TLRPC.TL_messages_stickerSet();
                    if (this.f26818g1) {
                        this.f26811e1 = arrayList4.size();
                        arrayList4.add(tL_messages_stickerSet4);
                    } else {
                        this.f26811e1 = 0;
                        arrayList4.add(0, tL_messages_stickerSet4);
                    }
                }
            }
            int i18 = 0;
            while (i18 < arrayList4.size()) {
                if (i18 == this.f26811e1) {
                    TLRPC.Chat chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(this.J1.f17196id));
                    if (chat2 == null) {
                        arrayList4.remove(0);
                        i18--;
                    } else {
                        this.f26810e0 = z16;
                        String str = "chat" + chat2.f17195id;
                        int i19 = cxVar.f27126x;
                        cxVar.f27126x = i19 + 1;
                        ox0 ox0Var = (ox0) cxVar.f27116n.get(str);
                        if (ox0Var != null) {
                            cxVar.g(str, ox0Var, i19);
                        } else {
                            ox0Var = new ox0(cxVar.getContext(), 0);
                            ox0Var.setFocusable(z16);
                            ox0Var.setOnClickListener(new lm0(cxVar, 0));
                            gc1Var.addView(ox0Var, i19);
                            ox0Var.f25936w = z16;
                            g9 g9Var = new g9(f6Var);
                            g9Var.u(AndroidUtilities.dp(14.0f));
                            g9Var.k(UserConfig.selectedAccount, chat2);
                            int i20 = cxVar.f27100a;
                            w9 w9Var = ox0Var.e;
                            w9Var.setLayerNum(i20);
                            w9Var.e(chat2, g9Var);
                            w9Var.setAspectFit(z16);
                            ox0Var.setExpanded(cxVar.f27109f0);
                            ox0Var.a(cxVar.f27112i0);
                            ox0Var.h.setText(chat2.title);
                        }
                        ox0Var.d = z16;
                        ox0Var.setTag(R.id.index_tag, Integer.valueOf(i19));
                        if (i19 == cxVar.f27127y) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        ox0Var.setSelected(z13);
                        cxVar.h.put(str, ox0Var);
                    }
                } else {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet5 = (TLRPC.TL_messages_stickerSet) arrayList4.get(i18);
                    TLRPC.StickerSet stickerSet5 = tL_messages_stickerSet5.set;
                    if (stickerSet5 != null && stickerSet5.thumb_document_id != j11) {
                        for (int i21 = 0; i21 < tL_messages_stickerSet5.documents.size(); i21++) {
                            document = tL_messages_stickerSet5.documents.get(i21);
                            if (document != null && tL_messages_stickerSet5.set.thumb_document_id == document.f17201id) {
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
                    String str2 = "set" + tL_messages_stickerSet5.set.f17222id;
                    int i22 = cxVar.f27126x;
                    cxVar.f27126x = i22 + 1;
                    ox0 ox0Var2 = (ox0) cxVar.f27116n.get(str2);
                    if (ox0Var2 != null) {
                        cxVar.g(str2, ox0Var2, i22);
                    } else {
                        ox0Var2 = new ox0(cxVar.getContext(), 0);
                        ox0Var2.setFocusable(z16);
                        ox0Var2.setOnClickListener(new lm0(cxVar, 1));
                        ox0Var2.setExpanded(cxVar.f27109f0);
                        ox0Var2.a(cxVar.f27112i0);
                        gc1Var.addView(ox0Var2, i22);
                    }
                    ox0Var2.e.setLayerNum(cxVar.f27100a);
                    ox0Var2.d = false;
                    ox0Var2.setTag(closestPhotoSizeWithSize);
                    ox0Var2.setTag(R.id.index_tag, Integer.valueOf(i22));
                    ox0Var2.setTag(R.id.parent_tag, tL_messages_stickerSet5);
                    ox0Var2.setTag(R.id.object_tag, document);
                    if (i22 == cxVar.f27127y) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    ox0Var2.setSelected(z12);
                    cxVar.h.put(str2, ox0Var2);
                    ox0Var2.setContentDescription(tL_messages_stickerSet5.set.title + ", " + LocaleController.getString(R.string.AccDescrStickerSet));
                }
                i18++;
                z16 = true;
                f6Var = null;
            }
            cxVar.h();
            cxVar.q();
            if (currentPosition != 0) {
                cxVar.k(currentPosition, currentPosition);
            }
            o();
        }
    }

    public final void a0() {
        boolean z10;
        int i10;
        dx dxVar = this.C0;
        cx cxVar = this.B0;
        if (cxVar != null && dxVar == null && this.f26858t1 != null) {
            cxVar.setTranslationY(this.f26858t1.p() * (-AndroidUtilities.dp(50.0f)));
        }
        if (dxVar == null) {
            return;
        }
        if (getVisibility() == 0 && this.K0 && this.f26858t1.p() != 1.0f) {
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
            Rect rect = this.f26877y2;
            rect.setEmpty();
            this.h.getChildVisibleRect(this.f26871x0, rect, null);
            float p5 = this.f26858t1.p() * AndroidUtilities.dp(50.0f);
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

    @Override
    public final void b(int i10) {
        setBottomInset(i10);
    }

    public final void b0() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        org.telegram.ui.Cells.r3 r3Var;
        LongSparseArray longSparseArray = this.f26879z1;
        LongSparseArray longSparseArray2 = this.f26876y1;
        int i10 = this.f26805c1;
        yw ywVar = this.D0;
        if (ywVar != null) {
            try {
                int childCount = ywVar.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = ywVar.getChildAt(i11);
                    if ((childAt instanceof org.telegram.ui.Cells.r3) && ((fl0) ywVar.T(childAt)) != null) {
                        org.telegram.ui.Cells.r3 r3Var2 = (org.telegram.ui.Cells.r3) childAt;
                        ArrayList<Long> unreadStickerSets = MediaDataController.getInstance(i10).getUnreadStickerSets();
                        TLRPC.StickerSetCovered stickerSet = r3Var2.getStickerSet();
                        if (unreadStickerSets != null && unreadStickerSets.contains(Long.valueOf(stickerSet.set.f17222id))) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        int i12 = 0;
                        while (true) {
                            TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.f26872x1;
                            if (i12 < stickerSetCoveredArr.length) {
                                TLRPC.StickerSetCovered stickerSetCovered = stickerSetCoveredArr[i12];
                                if (stickerSetCovered != null) {
                                    r3Var = r3Var2;
                                    if (stickerSetCovered.set.f17222id == stickerSet.set.f17222id) {
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
                            MediaDataController.getInstance(i10).markFeaturedStickersByIdAsRead(false, stickerSet.set.f17222id);
                        }
                        if (longSparseArray2.indexOfKey(stickerSet.set.f17222id) >= 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (longSparseArray.indexOfKey(stickerSet.set.f17222id) >= 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z12 || z13) {
                            if (z12 && r3Var2.f19889r) {
                                longSparseArray2.remove(stickerSet.set.f17222id);
                                z12 = false;
                            } else if (z13 && !r3Var2.f19889r) {
                                longSparseArray.remove(stickerSet.set.f17222id);
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
    public final void c(float f7) {
        this.f26852r2 = f7;
        T();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        Utilities.Callback callback;
        TLRPC.StickerSet stickerSet;
        int i12 = NotificationCenter.stickersDidLoad;
        yx yxVar = this.R;
        hw hwVar = this.L2;
        if (i10 == i12) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (this.f26875y0 != null) {
                    Z(((Boolean) objArr[1]).booleanValue());
                    b0();
                    F();
                    o();
                }
            } else if (((Integer) objArr[0]).intValue() == 5) {
                if (((Boolean) objArr[1]).booleanValue()) {
                    AndroidUtilities.cancelRunOnUIThread(hwVar);
                    AndroidUtilities.runOnUIThread(hwVar, 100L);
                    return;
                }
                yxVar.F(false);
            }
        } else if (i10 == NotificationCenter.groupPackUpdated) {
            long longValue = ((Long) objArr[0]).longValue();
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            TLRPC.ChatFull chatFull = this.J1;
            if (chatFull != null && chatFull.f17196id == longValue && booleanValue) {
                yxVar.F(true);
            }
        } else if (i10 == NotificationCenter.recentDocumentsDidLoad) {
            boolean booleanValue2 = ((Boolean) objArr[0]).booleanValue();
            int intValue = ((Integer) objArr[1]).intValue();
            if (booleanValue2 || intValue == 0 || intValue == 2) {
                k(booleanValue2);
            }
        } else if (i10 == NotificationCenter.featuredStickersDidLoad) {
            b0();
            nd0 nd0Var = this.f26866w;
            if (nd0Var != null) {
                int childCount = nd0Var.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    nd0Var.getChildAt(i13).invalidate();
                }
            }
            Z(false);
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
                    mz mzVar = this.f26878z0;
                    if (mzVar != null && mzVar.d == longValue2 && mzVar.f25319f.size() < tL_messages_stickerSet.documents.size()) {
                        mzVar.f25319f = tL_messages_stickerSet.documents;
                        mzVar.l();
                    }
                    if (ryVar != null && ryVar.d == longValue2 && ryVar.f26779f.size() < tL_messages_stickerSet.documents.size()) {
                        ryVar.f26779f = tL_messages_stickerSet.documents;
                        ryVar.l();
                    }
                }
                TLRPC.ChatFull chatFull2 = this.J1;
                if (chatFull2 != null && (stickerSet = chatFull2.stickerset) != null && stickerSet.f17222id == longValue2) {
                    Z(false);
                }
                HashMap hashMap = this.f26851r1;
                if (hashMap.containsKey(l4) && objArr.length >= 2 && ((Utilities.Callback) hashMap.get(l4)) != null && tL_messages_stickerSet != null && (callback = (Utilities.Callback) hashMap.remove(l4)) != null) {
                    callback.run(tL_messages_stickerSet);
                }
                AndroidUtilities.cancelRunOnUIThread(hwVar);
                AndroidUtilities.runOnUIThread(hwVar, 100L);
                return;
            }
            int i15 = NotificationCenter.emojiLoaded;
            px pxVar = this.P;
            if (i10 == i15) {
                yw ywVar = this.D0;
                if (ywVar != null) {
                    int childCount2 = ywVar.getChildCount();
                    for (int i16 = 0; i16 < childCount2; i16++) {
                        View childAt = ywVar.getChildAt(i16);
                        if ((childAt instanceof org.telegram.ui.Cells.p8) || (childAt instanceof org.telegram.ui.Cells.g8)) {
                            childAt.invalidate();
                        }
                    }
                }
                if (pxVar != null) {
                    pxVar.invalidate();
                    int childCount3 = pxVar.getChildCount();
                    for (int i17 = 0; i17 < childCount3; i17++) {
                        View childAt2 = pxVar.getChildAt(i17);
                        if (childAt2 instanceof az) {
                            childAt2.invalidate();
                        }
                    }
                }
                bv bvVar = this.B1;
                if (bvVar != null) {
                    bvVar.f21912c.invalidate();
                }
                wx wxVar = this.f26843p0;
                if (wxVar != null) {
                    gc1 gc1Var = wxVar.e;
                    int childCount4 = gc1Var.getChildCount();
                    for (int i18 = 0; i18 < childCount4; i18++) {
                        gc1Var.getChildAt(i18).invalidate();
                    }
                }
            } else if (i10 == NotificationCenter.newEmojiSuggestionsAvailable) {
                if (pxVar != null && this.f26807d0) {
                    if ((this.V.f22781c.f23703k == 2 || pxVar.getAdapter() == ryVar) && !TextUtils.isEmpty(ryVar.v)) {
                        ryVar.F(ryVar.v, true);
                    }
                }
            } else if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                if (yxVar != null) {
                    yxVar.F(false);
                }
                V();
                Z(false);
            }
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        eh.d dVar;
        zg.e eVar;
        if (Build.VERSION.SDK_INT >= 31 && (dVar = this.f26833l2) != null && (eVar = this.f26828j2) != null) {
            C();
            RecordingCanvas a2 = dVar.a(getMeasuredWidth(), getMeasuredHeight());
            a2.drawColor(z(org.telegram.ui.ActionBar.j6.f17928d6));
            if (SharedConfig.chatBlurEnabled()) {
                eVar.b(a2, -2);
            }
            dVar.c();
        }
        T();
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.h) {
            canvas.save();
            if (this.f26836n.getVisibility() != 8 && !this.f26860u0 && this.f26867w0) {
                canvas.drawColor(i0.a.k(-1, 25));
            }
            boolean drawChild = super.drawChild(canvas, view, j3);
            float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(this.f26848q2);
            if (navigationBarThirdButtonsFactor > 0.0f) {
                int l1 = org.telegram.ui.ActionBar.j6.l1(navigationBarThirdButtonsFactor, z(org.telegram.ui.ActionBar.j6.He));
                int i10 = this.C2;
                GradientDrawable gradientDrawable = this.B2;
                if (i10 != l1) {
                    gradientDrawable.setColors(new int[]{l1, org.telegram.ui.ActionBar.j6.l1(0.66f, l1), i0.a.k(l1, 0)});
                    this.C2 = l1;
                }
                gradientDrawable.setBounds(0, getMeasuredHeight() - this.f26848q2, getMeasuredWidth(), getMeasuredHeight());
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

    public ArrayList<dy> getEmojipacks() {
        ArrayList<dy> arrayList = new ArrayList<>();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f26847q1;
            if (i10 < arrayList2.size()) {
                dy dyVar = (dy) arrayList2.get(i10);
                boolean z10 = dyVar.f22502g;
                ArrayList arrayList3 = this.f26844p1;
                if ((!z10 && (dyVar.f22501f || arrayList3.contains(Long.valueOf(dyVar.f22499b.f17222id)))) || (dyVar.f22502g && !dyVar.f22501f && !arrayList3.contains(Long.valueOf(dyVar.f22499b.f17222id)))) {
                    arrayList.add(dyVar);
                }
                i10++;
            } else {
                return arrayList;
            }
        }
    }

    public ArrayList<String> getRecentEmoji() {
        if (this.f26806c2) {
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
                if (!this.f26806c2) {
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
        mx mxVar = new mx(getContext(), i11);
        mxVar.f41760a = !z10 ? 1 : 0;
        w(i10).w0(mxVar);
    }

    public final void k(boolean z10) {
        if (z10) {
            Y();
            return;
        }
        int size = this.f26827j1.size();
        int size2 = this.f26830k1.size();
        int i10 = this.f26805c1;
        this.f26827j1 = MediaDataController.getInstance(i10).getRecentStickers(0, true);
        this.f26830k1 = MediaDataController.getInstance(i10).getRecentStickers(2);
        if (UserConfig.getInstance(i10).isPremium()) {
            this.l1 = MediaDataController.getInstance(i10).getRecentStickers(7);
        } else {
            this.l1 = new ArrayList();
        }
        for (int i11 = 0; i11 < this.f26830k1.size(); i11++) {
            TLRPC.Document document = (TLRPC.Document) this.f26830k1.get(i11);
            int i12 = 0;
            while (true) {
                if (i12 < this.f26827j1.size()) {
                    TLRPC.Document document2 = (TLRPC.Document) this.f26827j1.get(i12);
                    if (document2.dc_id == document.dc_id && document2.f17201id == document.f17201id) {
                        this.f26827j1.remove(i12);
                        break;
                    }
                    i12++;
                }
            }
        }
        if (MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            int i13 = 0;
            while (i13 < this.f26830k1.size()) {
                if (MessageObject.isPremiumSticker((TLRPC.Document) this.f26830k1.get(i13))) {
                    this.f26830k1.remove(i13);
                    i13--;
                }
                i13++;
            }
            int i14 = 0;
            while (i14 < this.f26827j1.size()) {
                if (MessageObject.isPremiumSticker((TLRPC.Document) this.f26827j1.get(i14))) {
                    this.f26827j1.remove(i14);
                    i14--;
                }
                i14++;
            }
        }
        if (size != this.f26827j1.size() || size2 != this.f26830k1.size()) {
            Z(false);
        }
        iz izVar = this.f26875y0;
        if (izVar != null) {
            izVar.l();
        }
        o();
    }

    public final void l(boolean z10) {
        int i10;
        boolean z11;
        sy syVar = this.f26858t1;
        le.b bVar = this.f26799b;
        px pxVar = this.P;
        pw pwVar = this.V;
        if (syVar != null && syVar.z()) {
            s4.c1 K = pxVar.K(0);
            if (K == null) {
                ez.a(pwVar, true, !z10);
            } else {
                if (K.f41610a.getTop() < pxVar.getPaddingTop()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ez.a(pwVar, z11, !z10);
            }
            P(false, !z10);
            pwVar.setTranslationY(bVar.e * AndroidUtilities.dp(15.0f));
        } else if (pwVar != null && pxVar != null) {
            s4.c1 K2 = pxVar.K(0);
            if (K2 != null) {
                i10 = K2.f41610a.getTop();
            } else {
                i10 = -this.f26801b1;
            }
            pwVar.setTranslationY((bVar.e * AndroidUtilities.dp(15.0f)) + i10);
            pwVar.f22779a.a(false, !z10);
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
        if (dp > 0 && (K == null || K.f41610a.getBottom() < dp)) {
            z10 = true;
        }
        P(z10, !this.K1);
    }

    public final void n(px pxVar, int i10) {
        px pxVar2;
        s4.c1 K;
        int i11;
        ow owVar = this.I;
        int[] iArr = this.Q0;
        if (pxVar == null) {
            iArr[1] = 0;
            owVar.setTranslationY(0);
        } else if (pxVar.getVisibility() == 0 && !this.f26814f0) {
            sy syVar = this.f26858t1;
            if (syVar == null || !syVar.z()) {
                if (i10 > 0 && (pxVar2 = this.P) != null && pxVar2.getVisibility() == 0 && (K = pxVar2.K(0)) != null) {
                    int top = K.f41610a.getTop();
                    if (this.f26807d0) {
                        i11 = this.f26801b1;
                    } else {
                        i11 = 0;
                    }
                    if (top + i11 >= pxVar2.getPaddingTop()) {
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
                owVar.setTranslationY(Math.max(-AndroidUtilities.dp(36.0f), iArr[1]));
            }
        }
    }

    public final void o() {
        int L0;
        cx cxVar = this.B0;
        if (cxVar != null && (L0 = this.E0.L0()) != -1) {
            int i10 = this.G1;
            if (i10 <= 0 && (i10 = this.F1) <= 0) {
                i10 = this.E1;
            }
            cxVar.k(this.f26875y0.F(L0), i10);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        int i10 = this.f26805c1;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.groupPackUpdated);
        if (this.f26875y0 != null) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.stickersDidLoad);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.recentDocumentsDidLoad);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.featuredStickersDidLoad);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.groupStickersDidLoad);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
            AndroidUtilities.runOnUIThread(new hw(this, 0));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bv bvVar = this.B1;
        if (bvVar != null && bvVar.isShowing()) {
            bvVar.dismiss();
        }
        org.telegram.ui.tt q6 = org.telegram.ui.tt.q();
        if (q6.f37026l == this.f26819g2) {
            q6.W = null;
            q6.f37014a0 = null;
            q6.Y = null;
            q6.f37026l = null;
            q6.f37018c0 = null;
            q6.u();
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        if (this.O1 != i14) {
            this.O1 = i14;
            F();
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
        boolean z11 = this.f26807d0;
        if (!z10 && !this.N1) {
            if (this.L1 != 0) {
                if (!this.I2) {
                    setOutlineProvider(null);
                    setClipToOutline(false);
                    setElevation(0.0f);
                }
                if (this.f26860u0) {
                    int i12 = org.telegram.ui.ActionBar.j6.He;
                    setBackgroundColor(z(i12));
                    if (z11) {
                        view.setBackgroundColor(z(i12));
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
            background.setColorFilter(new PorterDuffColorFilter(z(i13), PorterDuff.Mode.MULTIPLY));
            if (z11 && this.f26860u0) {
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
                this.B0.k(this.f26875y0.F(L02), i12);
            }
        } else if (i10 == 2) {
            s4.h0 adapter = this.f26820h0.getAdapter();
            wy wyVar = this.f26837n0;
            if (adapter == wyVar && wyVar.I >= 0 && this.f26854s0 >= 0 && this.f26850r0 >= 0 && (L0 = this.f26823i0.L0()) != -1) {
                if (L0 >= wyVar.I) {
                    i11 = this.f26854s0;
                } else {
                    i11 = this.f26850r0;
                }
                this.f26843p0.k(i11, 0);
            }
        }
    }

    public final void q(boolean z10) {
        int i10;
        sy syVar = this.f26858t1;
        le.b bVar = this.f26796a;
        yw ywVar = this.D0;
        boolean z11 = false;
        bx bxVar = this.G0;
        if (syVar != null && syVar.z()) {
            s4.c1 K = ywVar.K(0);
            if (K == null) {
                ez.a(bxVar, true, !z10);
            } else {
                if (K.f41610a.getTop() < ywVar.getPaddingTop()) {
                    z11 = true;
                }
                ez.a(bxVar, z11, !z10);
            }
            bxVar.setTranslationY(bVar.e * AndroidUtilities.dp(15.0f));
        } else if (bxVar != null && ywVar != null) {
            s4.c1 K2 = ywVar.K(0);
            if (K2 != null) {
                i10 = K2.f41610a.getTop();
            } else {
                i10 = -this.f26801b1;
            }
            bxVar.setTranslationY((bVar.e * AndroidUtilities.dp(15.0f)) + i10);
            bxVar.f22779a.a(false, !z10);
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
        ez ezVar;
        s4.c0 c0Var;
        View view;
        vl0 vl0Var;
        int i10;
        TLRPC.TL_messages_stickerSet stickerSetById;
        iz izVar;
        int E;
        AnimatorSet animatorSet = this.M0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.M0 = null;
        }
        int currentItem = this.h.getCurrentItem();
        if (currentItem == 2 && j3 != -1 && (stickerSetById = MediaDataController.getInstance(this.f26805c1).getStickerSetById(j3)) != null && (E = (izVar = this.f26875y0).E(stickerSetById)) >= 0 && E < izVar.h()) {
            J(E, AndroidUtilities.dp(48.0f));
        }
        wy wyVar = this.f26826j0;
        if (wyVar != null) {
            wyVar.K = false;
        }
        for (int i11 = 0; i11 < 3; i11++) {
            vl0 vl0Var2 = this.D0;
            vl0 vl0Var3 = this.f26820h0;
            vw vwVar = this.f26840o0;
            vl0 vl0Var4 = this.P;
            if (i11 == 0) {
                ezVar = this.V;
                c0Var = this.Q;
                view = this.I;
                vl0Var = vl0Var4;
            } else if (i11 == 1) {
                c0Var = this.f26823i0;
                view = this.f26843p0;
                vl0Var = vl0Var3;
                ezVar = vwVar;
            } else {
                ezVar = this.G0;
                c0Var = this.E0;
                view = this.B0;
                vl0Var = vl0Var2;
            }
            if (ezVar != null) {
                dz dzVar = ezVar.f22784r;
                ezVar.d.setText("");
                if (dzVar != null) {
                    dzVar.E1(null);
                    dzVar.C1();
                }
                int i12 = this.f26801b1;
                if (i11 == currentItem && z10) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.M0 = animatorSet2;
                    Property property = View.TRANSLATION_Y;
                    if (view != null && i11 != 1) {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, 0.0f), ObjectAnimator.ofFloat(vl0Var, property, AndroidUtilities.dp(36.0f)), ObjectAnimator.ofFloat(ezVar, property, AndroidUtilities.dp(36.0f)));
                    } else {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(vl0Var, property, AndroidUtilities.dp(36.0f) - i12));
                    }
                    this.M0.setDuration(200L);
                    this.M0.setInterpolator(wr.h);
                    this.M0.addListener(new org.telegram.ui.ActionBar.l1(this, c0Var, vl0Var, 4));
                    this.M0.start();
                } else {
                    if (ezVar != vwVar) {
                        ezVar.setTranslationY(AndroidUtilities.dp(36.0f) - i12);
                    }
                    if (view != null && i11 != 2) {
                        view.setTranslationY(0.0f);
                    }
                    if (vl0Var == vl0Var2) {
                        i10 = 0;
                        vl0Var.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f) + this.f26848q2);
                    } else {
                        i10 = 0;
                        if (vl0Var == vl0Var3) {
                            vl0Var.setPadding(0, AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(44.0f) + this.f26848q2);
                        } else {
                            if (vl0Var == vl0Var4) {
                                vl0Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f) + this.f26848q2);
                            }
                            i10 = 0;
                        }
                    }
                    c0Var.h1(i10, i10);
                }
            }
        }
        if (!z10) {
            this.f26858t1.i(0);
        }
    }

    public void setBlurredBackgroundDrawableFactory(zg.a aVar) {
        org.telegram.ui.ActionBar.f6 f6Var = this.Z1;
        View view = this.f26870x;
        if (view != null) {
            bh.d c10 = aVar.c(view, null, false);
            c10.n(dh.c.d(f6Var));
            c10.p(AndroidUtilities.dp(18.0f));
            c10.o(AndroidUtilities.dp(6.0f));
            view.setBackground(c10);
        }
        View view2 = this.E;
        if (view2 != null) {
            bh.d c11 = aVar.c(view2, null, false);
            c11.n(dh.c.d(f6Var));
            c11.p(AndroidUtilities.dp(18.0f));
            c11.o(AndroidUtilities.dp(6.0f));
            view2.setBackground(c11);
        }
        View view3 = this.f26866w;
        if (view3 != null) {
            bh.d c12 = aVar.c(view3, null, false);
            c12.n(dh.c.d(f6Var));
            c12.p(AndroidUtilities.dp(18.0f));
            c12.o(AndroidUtilities.dp(6.0f));
            view3.setBackground(c12);
        }
        View view4 = this.f26874y;
        if (view4 != null) {
            bh.d c13 = aVar.c(view4, null, false);
            c13.n(dh.c.d(f6Var));
            c13.p(AndroidUtilities.dp(18.0f));
            c13.o(AndroidUtilities.dp(6.0f));
            view4.setBackground(c13);
        }
    }

    public void setBottomInset(int i10) {
        if (this.f26848q2 != i10) {
            this.f26848q2 = i10;
            j(i10, this.K);
            j(i10, this.M);
            j(AndroidUtilities.dp(44.0f) + i10, this.P);
            j(AndroidUtilities.dp(44.0f) + i10, this.D0);
            j(AndroidUtilities.dp(44.0f) + i10, this.f26820h0);
            FrameLayout frameLayout = this.f26853s;
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

    public void setDelegate(sy syVar) {
        this.f26858t1 = syVar;
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
        vw vwVar = this.f26840o0;
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
        if (this.f26860u0 != z10) {
            this.f26860u0 = z10;
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
                int i11 = this.f26805c1;
                NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.stickersDidLoad);
                if (this.f26875y0 != null) {
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
            fg.h1 h1Var = this.T0;
            if (h1Var != null) {
                h1Var.a();
            }
        }
    }

    public final void t(boolean z10) {
        s(-1L, z10);
    }

    public final void u(boolean z10) {
        iz izVar;
        boolean z11 = this.N2;
        this.N2 = z10;
        if (z11 && !z10) {
            int i10 = this.A1;
            if (i10 == 0) {
                yx yxVar = this.R;
                if (yxVar != null) {
                    yxVar.F(false);
                }
            } else if (i10 == 1) {
                wy wyVar = this.f26837n0;
                if (wyVar != null) {
                    wyVar.l();
                }
            } else if (i10 == 2 && (izVar = this.f26875y0) != null) {
                izVar.l();
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
                    return this.f26823i0;
                }
                throw new IllegalArgumentException(hc.b.j(i10, "Unexpected argument: "));
            }
            return this.Q;
        }
        return this.E0;
    }

    public final vl0 x(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return this.f26820h0;
                }
                throw new IllegalArgumentException(hc.b.j(i10, "Unexpected argument: "));
            }
            return this.P;
        }
        return this.D0;
    }

    public final HorizontalScrollView y(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return this.f26843p0;
                }
                throw new IllegalArgumentException(hc.b.j(i10, "Unexpected argument: "));
            }
            return this.I;
        }
        return this.B0;
    }

    public final int z(int i10) {
        org.telegram.ui.ActionBar.f6 f6Var = this.Z1;
        if (f6Var != null) {
            return f6Var.F0(i10);
        }
        return org.telegram.ui.ActionBar.j6.w0(null, i10, false);
    }

    @Override
    public final void B(float f7, int i10) {
    }
}
