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
import org.telegram.ui.ta1;
public class wy extends FrameLayout implements td.b, NotificationCenter.NotificationCenterDelegate, xg.a {
    public static final int K2 = 0;
    public final ImageView A;
    public final gw A0;
    public int A1;
    public int A2;
    public AnimatorSet B;
    public uy B0;
    public int B1;
    public long B2;
    public AnimatorSet C;
    public final iw C0;
    public int C1;
    public final td.a C2;
    public float D;
    public final vg.e D0;
    public int D1;
    public ArrayList D2;
    public final vv E;
    public boolean E0;
    public int E1;
    public boolean E2;
    public final vw F;
    public boolean F0;
    public TLRPC.ChatFull F1;
    public AnimatorSet F2;
    public final vg.c G;
    public boolean G0;
    public boolean G1;
    public org.telegram.messenger.video.l G2;
    public final vg.b H;
    public final px H0;
    public int H1;
    public final ov H2;
    public final vg.c I;
    public AnimatorSet I0;
    public final ff.p0 I1;
    public boolean I2;
    public final vg.b J;
    public final bg.t J0;
    public boolean J1;
    public boolean J2;
    public final View K;
    public cx K0;
    public int K1;
    public final ww L;
    public boolean L0;
    public boolean L1;
    public final xw M;
    public final int[] M0;
    public boolean M1;
    public final fx N;
    public final ObjectAnimator[] N0;
    public fy N1;
    public final vx O;
    public boolean O0;
    public float O1;
    public uy P;
    public of.b1 P0;
    public float P1;
    public final vg.e Q;
    public boolean Q0;
    public float Q1;
    public final wv R;
    public boolean R0;
    public float R1;
    public AnimatorSet S;
    public String[] S0;
    public float S1;
    public final c2.y T;
    public final Drawable[] T0;
    public boolean T1;
    public final c2.y U;
    public final Drawable[] U0;
    public final org.telegram.ui.ActionBar.o2 U1;
    public boolean V;
    public final Drawable[] V0;
    public final org.telegram.ui.ActionBar.b6 V1;
    public final boolean W;
    public final String[] W0;
    public final org.telegram.ui.ActionBar.r5 W1;
    public final int X0;
    public final org.telegram.ui.ActionBar.r5 X1;
    public final int Y0;
    public final boolean Y1;
    public final ArrayList Z0;
    public LongSparseArray Z1;
    public final td.a f34383a;
    public boolean f34384a0;
    public int f34385a1;
    public PorterDuffColorFilter a2;
    public final td.a f34386b;
    public boolean f34387b0;
    public int f34388b1;
    public final m.i3 f34389b2;
    public int f34390c;
    public final yv f34391c0;
    public boolean f34392c1;
    public final pw f34393c2;
    public final ArrayList d;
    public final zv f34394d0;
    public TLRPC.TL_messages_stickerSet f34395d1;
    public boolean f34396d2;
    public final ArrayList f34397e;
    public final cy f34398e0;
    public ArrayList f34399e1;
    public final boolean f34400e2;
    public boolean f34401f;
    public final ay f34402f0;
    public ArrayList f34403f1;
    public final ig.e f34404f2;
    public final ey f34405g0;
    public ArrayList f34406g1;
    public final ah f34407g2;
    public final lw h;
    public final HashMap f34408h0;
    public ArrayList f34409h1;
    public final ng.d f34410h2;
    public final tv f34411i0;
    public final ArrayList f34412i1;
    public final ng.c f34413i2;
    public final ay f34414j0;
    public final ArrayList f34415j1;
    public final ig.a f34416j2;
    public final cw f34417k0;
    public final ArrayList f34418k1;
    public boolean f34419k2;
    public final dx f34420l0;
    public final ArrayList l1;
    public boolean f34421l2;
    public boolean m0;
    public final ArrayList f34422m1;
    public int f34423m2;
    public final FrameLayout f34424n;
    public int f34425n0;
    public final HashMap f34426n1;
    public float f34427n2;
    public int f34428o0;
    public final Paint f34429o1;
    public View f34430o2;
    public int f34431p0;
    public wx f34432p1;
    public int f34433p2;
    public boolean f34434q0;
    public long f34435q1;
    public int f34436q2;
    public final FrameLayout f34437r;
    public boolean f34438r0;
    public boolean f34439r1;
    public long f34440r2;
    public final FrameLayout f34441s;
    public boolean f34442s0;
    public boolean f34443s1;
    public boolean f34444s2;
    public final dw f34445t0;
    public final TLRPC.StickerSetCovered[] f34446t1;
    public boolean f34447t2;
    public final ny f34448u0;
    public final LongSparseArray f34449u1;
    public final Rect f34450u2;
    public final View v;
    public final ry f34451v0;
    public final LongSparseArray f34452v1;
    public final RectF f34453v2;
    public final kc0 f34454w;
    public final tv f34455w0;
    public int f34456w1;
    public final ArrayList f34457w2;
    public final mw f34458x;
    public final jw f34459x0;
    public final iu f34460x1;
    public final GradientDrawable f34461x2;
    public final ImageView f34462y;
    public final kw f34463y0;
    public final int f34464y1;
    public int f34465y2;
    public final fw f34466z0;
    public final int[] f34467z1;
    public ArrayList f34468z2;

    public wy(org.telegram.ui.ActionBar.o2 o2Var, boolean z10, boolean z11, boolean z12, Context context, boolean z13, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z14, final org.telegram.ui.ActionBar.b6 b6Var, boolean z15, boolean z16) {
        super(context);
        org.telegram.ui.ActionBar.r5 r5Var;
        int z17;
        Context context2;
        vw vwVar;
        ov ovVar;
        boolean z18;
        Field field;
        gr grVar = gr.h;
        this.f34383a = new td.a(0, this, grVar, 320L, false);
        this.f34386b = new td.a(1, this, grVar, 320L, false);
        this.f34390c = 2;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.f34397e = new ArrayList();
        this.V = true;
        this.f34405g0 = new ey(this);
        this.f34408h0 = new HashMap();
        this.m0 = true;
        this.f34425n0 = -2;
        this.f34428o0 = -2;
        this.f34431p0 = -2;
        this.f34434q0 = true;
        this.f34442s0 = true;
        this.E0 = true;
        this.M0 = new int[3];
        this.N0 = new ObjectAnimator[3];
        int i9 = UserConfig.selectedAccount;
        this.Y0 = i9;
        this.Z0 = new ArrayList();
        this.f34399e1 = new ArrayList();
        this.f34403f1 = new ArrayList();
        this.f34406g1 = new ArrayList();
        this.f34409h1 = new ArrayList();
        this.f34412i1 = new ArrayList();
        this.f34415j1 = new ArrayList();
        new ArrayList();
        this.f34418k1 = new ArrayList();
        this.l1 = new ArrayList();
        this.f34422m1 = new ArrayList();
        this.f34426n1 = new HashMap();
        this.f34446t1 = new TLRPC.StickerSetCovered[10];
        this.f34449u1 = new LongSparseArray();
        this.f34452v1 = new LongSparseArray();
        this.f34467z1 = new int[2];
        this.B1 = -2;
        this.C1 = -2;
        this.D1 = -2;
        this.E1 = -2;
        this.H1 = -1;
        this.f34389b2 = new m.i3(this, 18);
        this.f34393c2 = new pw(this);
        this.f34396d2 = true;
        this.f34427n2 = -1.0f;
        this.f34433p2 = -1;
        this.f34436q2 = -1;
        this.f34440r2 = -1L;
        this.f34444s2 = false;
        this.f34447t2 = true;
        this.f34450u2 = new Rect();
        RectF rectF = new RectF();
        this.f34453v2 = rectF;
        ArrayList arrayList2 = new ArrayList(1);
        this.f34457w2 = arrayList2;
        arrayList2.add(rectF);
        new Paint(1);
        this.f34461x2 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.C2 = new td.a(0, new rv(this, 1), grVar, 380L, true);
        this.H2 = new ov(this, 2);
        this.I2 = false;
        this.f34434q0 = z14;
        this.U1 = o2Var;
        this.Y1 = z10;
        this.V1 = b6Var;
        this.f34400e2 = z16;
        ng.c cVar = new ng.c();
        this.f34413i2 = cVar;
        cVar.a(z(org.telegram.ui.ActionBar.f6.f23001d6));
        if (z15) {
            u(true);
        }
        i0.a.k(z(org.telegram.ui.ActionBar.f6.Wk), 30);
        int dp = AndroidUtilities.dp(50.0f);
        this.X0 = dp;
        this.W = z13;
        this.T0 = new Drawable[]{org.telegram.ui.ActionBar.f6.U(context, R.drawable.smiles_tab_smiles, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.f6.Re), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.f6.Oe)), org.telegram.ui.ActionBar.f6.U(context, R.drawable.smiles_tab_gif, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.f6.Re), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.f6.Oe)), org.telegram.ui.ActionBar.f6.U(context, R.drawable.smiles_tab_stickers, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.f6.Re), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.f6.Oe))};
        org.telegram.ui.ActionBar.r5 U = org.telegram.ui.ActionBar.f6.U(context, R.drawable.msg_emoji_recent, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.f6.Me), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.f6.Oe));
        org.telegram.ui.ActionBar.r5 U2 = org.telegram.ui.ActionBar.f6.U(context, R.drawable.emoji_tabs_faves, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.f6.Me), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.f6.Oe));
        org.telegram.ui.ActionBar.r5 U3 = org.telegram.ui.ActionBar.f6.U(context, R.drawable.emoji_tabs_new3, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.f6.Me), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.f6.Oe));
        int i10 = R.drawable.emoji_tabs_new1;
        if (z16) {
            r5Var = U3;
            z17 = v(0.4f);
        } else {
            r5Var = U3;
            z17 = z(org.telegram.ui.ActionBar.f6.Me);
        }
        org.telegram.ui.ActionBar.r5 U4 = org.telegram.ui.ActionBar.f6.U(context, i10, z17, z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.f6.Oe));
        this.W1 = U4;
        int i11 = R.drawable.emoji_tabs_new2;
        int i12 = org.telegram.ui.ActionBar.f6.Qe;
        org.telegram.ui.ActionBar.r5 U5 = org.telegram.ui.ActionBar.f6.U(context, i11, z(i12), z(i12));
        this.X1 = U5;
        this.U0 = new Drawable[]{U, U2, r5Var, new LayerDrawable(new Drawable[]{U4, U5})};
        this.V0 = new Drawable[]{org.telegram.ui.ActionBar.f6.U(context, R.drawable.msg_emoji_recent, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.f6.Me), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.f6.Oe)), org.telegram.ui.ActionBar.f6.U(context, R.drawable.stickers_gifs_trending, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.f6.Me), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.f6.Oe))};
        this.W0 = new String[]{LocaleController.getString(R.string.Emoji1), LocaleController.getString(R.string.Emoji2), LocaleController.getString(R.string.Emoji3), LocaleController.getString(R.string.Emoji4), LocaleController.getString(R.string.Emoji5), LocaleController.getString(R.string.Emoji6), LocaleController.getString(R.string.Emoji7), LocaleController.getString(R.string.Emoji8)};
        this.F1 = chatFull;
        Paint paint = new Paint(1);
        this.f34429o1 = paint;
        paint.setColor(z(org.telegram.ui.ActionBar.f6.f22955af));
        bg.q1 q1Var = ff.r0.f6254a;
        this.I1 = new ff.p0(AndroidUtilities.dp(6.0f));
        vw vwVar2 = new vw(this, context);
        this.F = vwVar2;
        ?? obj = new Object();
        obj.f32565a = 0;
        obj.f32566b = vwVar2;
        arrayList.add(obj);
        if (z10) {
            MediaDataController.getInstance(i9).checkStickers(5);
            MediaDataController.getInstance(i9).checkFeaturedEmoji();
            this.a2 = new PorterDuffColorFilter(z(org.telegram.ui.ActionBar.f6.Oh), PorterDuff.Mode.SRC_IN);
        }
        ww wwVar = new ww(this, context);
        this.L = wwVar;
        f2.n nVar = new f2.n();
        nVar.f5548c = 220L;
        nVar.f5549e = 220L;
        nVar.f5550f = 160L;
        nVar.f5551g = 160L;
        nVar.f5552i = gr.f28845g;
        wwVar.setItemAnimator(nVar);
        wwVar.setOnTouchListener(new View.OnTouchListener(this) {
            public final wy f32030b;

            {
                this.f32030b = this;
            }

            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                switch (r3) {
                    case 0:
                        org.telegram.ui.ht q10 = org.telegram.ui.ht.q();
                        wy wyVar = this.f32030b;
                        ww wwVar2 = wyVar.L;
                        wyVar.getMeasuredHeight();
                        return q10.s(motionEvent, wwVar2, null, wyVar.f34393c2, b6Var);
                    case 1:
                        org.telegram.ui.ht q11 = org.telegram.ui.ht.q();
                        wy wyVar2 = this.f32030b;
                        return q11.s(motionEvent, wyVar2.f34394d0, wyVar2.f34411i0, wyVar2.f34393c2, b6Var);
                    default:
                        org.telegram.ui.ht q12 = org.telegram.ui.ht.q();
                        wy wyVar3 = this.f32030b;
                        fw fwVar = wyVar3.f34466z0;
                        wyVar3.getMeasuredHeight();
                        return q12.s(motionEvent, fwVar, wyVar3.f34455w0, wyVar3.f34393c2, b6Var);
                }
            }
        });
        wwVar.setOnItemLongClickListener(new rv(this, 0));
        wwVar.setInstantClick(true);
        xw xwVar = new xw(this);
        this.M = xwVar;
        wwVar.setLayoutManager(xwVar);
        wwVar.setTopGlowOffset(AndroidUtilities.dp(38.0f));
        wwVar.setBottomGlowOffset(AndroidUtilities.dp(36.0f));
        wwVar.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f));
        int i13 = org.telegram.ui.ActionBar.f6.He;
        wwVar.setGlowColor(z(i13));
        wwVar.setItemSelectorColorProvider(new g2(16));
        wwVar.setClipToPadding(false);
        xwVar.O = new yw(this);
        fx fxVar = new fx(this);
        this.N = fxVar;
        wwVar.setAdapter(fxVar);
        wwVar.i(new bg.p2(this, 4));
        this.O = new vx(this, context);
        vwVar2.addView(wwVar, g7.e6.c(-1.0f, -1));
        c2.y yVar = new c2.y(wwVar, xwVar);
        this.U = yVar;
        yVar.f2260i = new zw(this);
        wwVar.setOnScrollListener(new ax(this));
        if (o2Var != null) {
            ovVar = new ov(this, 5);
            context2 = context;
            vwVar = vwVar2;
        } else {
            context2 = context;
            vwVar = vwVar2;
            ovVar = null;
        }
        vv vvVar = new vv(this, context2, b6Var, z10, ovVar, z16);
        this.E = vvVar;
        if (z13) {
            wv wvVar = new wv(this, context2);
            this.R = wvVar;
            vwVar.addView(wvVar, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + dp));
            wvVar.d.setOnFocusChangeListener(new xv(this));
            vg.e eVar = new vg.e(context2, b6Var);
            this.Q = eVar;
            eVar.setVisibility(8);
            eVar.setOnBackClickListener(new View.OnClickListener(this) {
                public final wy f32558b;

                {
                    this.f32558b = this;
                }

                @Override
                public final void onClick(View view) {
                    jy jyVar;
                    switch (r2) {
                        case 0:
                            vx vxVar = this.f32558b.O;
                            qx qxVar = vxVar.f34012c;
                            int childCount = qxVar.getChildCount();
                            for (int i14 = 0; i14 < childCount; i14++) {
                                ((vg.d) qxVar.getChildAt(i14)).a(false, true);
                            }
                            vxVar.d = 0L;
                            vxVar.B.f34386b.a(false, true);
                            vxVar.l();
                            return;
                        case 1:
                            ry ryVar = this.f32558b.f34451v0;
                            qy qyVar = ryVar.f32301c;
                            int childCount2 = qyVar.getChildCount();
                            for (int i15 = 0; i15 < childCount2; i15++) {
                                ((vg.d) qyVar.getChildAt(i15)).a(false, true);
                            }
                            ryVar.d = 0L;
                            ryVar.M.f34383a.a(false, true);
                            ryVar.l();
                            return;
                        case 2:
                            wx wxVar = this.f32558b.f34432p1;
                            if (wxVar != null) {
                                wxVar.w();
                                return;
                            }
                            return;
                        default:
                            wy wyVar = this.f32558b;
                            int currentItem = wyVar.h.getCurrentItem();
                            if (currentItem == 0) {
                                jyVar = wyVar.R;
                            } else if (currentItem == 1) {
                                jyVar = wyVar.f34417k0;
                            } else {
                                jyVar = wyVar.C0;
                            }
                            if (jyVar != null) {
                                yp ypVar = jyVar.d;
                                ypVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                ypVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                ypVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                return;
                            }
                            return;
                    }
                }
            });
            vwVar.addView(eVar, new FrameLayout.LayoutParams(-1, dp));
        }
        int z19 = z(i13);
        if (Color.alpha(z19) >= 255) {
            vvVar.setBackgroundColor(z19);
        }
        fxVar.G(true);
        vvVar.p(getEmojipacks());
        vwVar.addView(vvVar, g7.e6.c(36.0f, -1));
        View view = new View(context2);
        this.K = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        int i14 = org.telegram.ui.ActionBar.f6.Ke;
        view.setBackgroundColor(z(i14));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(36.0f);
        vwVar.addView(view, layoutParams);
        vg.b bVar = new vg.b(context2, b6Var);
        this.H = bVar;
        vg.c cVar2 = new vg.c(context2, b6Var);
        this.G = cVar2;
        cVar2.setVisibility(8);
        cVar2.addView(bVar, g7.e6.d(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
        vwVar.addView(cVar2, g7.e6.e(-1, -2, 80));
        if (z11) {
            rl0 rl0Var = rl0.f32196b;
            if (z12) {
                yv yvVar = new yv(this, context2);
                this.f34391c0 = yvVar;
                ?? obj2 = new Object();
                obj2.f32565a = 1;
                obj2.f32566b = yvVar;
                this.d.add(obj2);
                zv zvVar = new zv(this, context2);
                this.f34394d0 = zvVar;
                zvVar.setClipToPadding(false);
                cy cyVar = new cy(this);
                this.f34398e0 = cyVar;
                zvVar.setLayoutManager(cyVar);
                zvVar.i(new aw(this));
                zvVar.setPadding(0, dp, 0, AndroidUtilities.dp(44.0f) + this.f34423m2);
                zvVar.setOverScrollMode(2);
                ((f2.t1) zvVar.getItemAnimator()).f5532m = false;
                ay ayVar = new ay(this, context2, true, Integer.MAX_VALUE);
                this.f34414j0 = ayVar;
                zvVar.setAdapter(ayVar);
                this.f34402f0 = new ay(this, context2, false, 0);
                zvVar.setOnScrollListener(new bw(this));
                zvVar.setOnTouchListener(new View.OnTouchListener(this) {
                    public final wy f32030b;

                    {
                        this.f32030b = this;
                    }

                    @Override
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        switch (r3) {
                            case 0:
                                org.telegram.ui.ht q10 = org.telegram.ui.ht.q();
                                wy wyVar = this.f32030b;
                                ww wwVar2 = wyVar.L;
                                wyVar.getMeasuredHeight();
                                return q10.s(motionEvent, wwVar2, null, wyVar.f34393c2, b6Var);
                            case 1:
                                org.telegram.ui.ht q11 = org.telegram.ui.ht.q();
                                wy wyVar2 = this.f32030b;
                                return q11.s(motionEvent, wyVar2.f34394d0, wyVar2.f34411i0, wyVar2.f34393c2, b6Var);
                            default:
                                org.telegram.ui.ht q12 = org.telegram.ui.ht.q();
                                wy wyVar3 = this.f32030b;
                                fw fwVar = wyVar3.f34466z0;
                                wyVar3.getMeasuredHeight();
                                return q12.s(motionEvent, fwVar, wyVar3.f34455w0, wyVar3.f34393c2, b6Var);
                        }
                    }
                });
                ?? r11 = new mk0(this) {
                    public final wy f32825b;

                    {
                        this.f32825b = this;
                    }

                    @Override
                    public final void a(int i15, View view2) {
                        int i16;
                        String str;
                        switch (r2) {
                            case 0:
                                wy wyVar = this.f32825b;
                                zv zvVar2 = wyVar.f34394d0;
                                ay ayVar2 = wyVar.f34402f0;
                                ay ayVar3 = wyVar.f34414j0;
                                if (wyVar.f34432p1 != null) {
                                    ayVar3.getClass();
                                    ArrayList arrayList3 = ayVar3.f26924x;
                                    if (zvVar2.getAdapter() == ayVar3) {
                                        if (i15 >= 0) {
                                            int i17 = ayVar3.D;
                                            if (i15 < i17) {
                                                wyVar.f34432p1.v(view2, wyVar.f34399e1.get(i15), null, "gif", true, 0, 0);
                                                return;
                                            }
                                            if (i17 > 0) {
                                                i16 = (i15 - i17) - 1;
                                            } else {
                                                i16 = i15;
                                            }
                                            if (i16 >= 0 && i16 < arrayList3.size()) {
                                                wyVar.f34432p1.v(view2, arrayList3.get(i16), null, ayVar3.f26920n, true, 0, 0);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    } else if (zvVar2.getAdapter() == ayVar2 && i15 >= 0 && i15 < ayVar2.f26924x.size()) {
                                        wyVar.f34432p1.v(view2, ayVar2.f26924x.get(i15), ayVar2.f26923w, ayVar2.f26920n, true, 0, 0);
                                        wyVar.X();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            default:
                                wy wyVar2 = this.f32825b;
                                f2.r0 adapter = wyVar2.f34466z0.getAdapter();
                                ry ryVar = wyVar2.f34451v0;
                                if (adapter == ryVar) {
                                    str = ryVar.J;
                                } else {
                                    str = null;
                                }
                                String str2 = str;
                                if (view2 instanceof org.telegram.ui.Cells.d8) {
                                    org.telegram.ui.Cells.d8 d8Var = (org.telegram.ui.Cells.d8) view2;
                                    if (d8Var.getSticker() != null && MessageObject.isPremiumSticker(d8Var.getSticker()) && !AccountInstance.getInstance(wyVar2.Y0).getUserConfig().isPremium()) {
                                        org.telegram.ui.ht.q().y(d8Var);
                                        return;
                                    }
                                    org.telegram.ui.ht.q().u();
                                    if (!d8Var.f24235r) {
                                        d8Var.f24235r = true;
                                        d8Var.f24234n = 0.5f;
                                        d8Var.f24238x = 0L;
                                        org.telegram.ui.Cells.c8 c8Var = d8Var.f24229a;
                                        c8Var.setAlpha(0.5f * d8Var.D);
                                        c8Var.invalidate();
                                        d8Var.f24236s = System.currentTimeMillis();
                                        d8Var.invalidate();
                                        wyVar2.f34432p1.m(d8Var, d8Var.getSticker(), str2, d8Var.getParentObject(), d8Var.getSendAnimationData(), true, 0);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                };
                this.f34411i0 = r11;
                zvVar.setOnItemClickListener((mk0) r11);
                yvVar.addView(zvVar, g7.e6.c(-1.0f, -1));
                cw cwVar = new cw(this, context2);
                this.f34417k0 = cwVar;
                yvVar.addView(cwVar, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + dp));
                dx dxVar = new dx(this, context2, b6Var);
                this.f34420l0 = dxVar;
                dxVar.setType(rl0Var);
                dxVar.setUnderlineHeight(AndroidUtilities.getShadowHeight());
                dxVar.setIndicatorColor(z(i12));
                dxVar.setUnderlineColor(z(i14));
                dxVar.setBackgroundColor(z(i13));
                W();
                dxVar.setDelegate(new rv(this, 2));
                ayVar.F("", "", true, true, true);
            }
            dw dwVar = new dw(this, context2, z14);
            this.f34445t0 = dwVar;
            MediaDataController.getInstance(this.Y0).checkStickers(0);
            MediaDataController.getInstance(this.Y0).checkFeaturedStickers();
            fw fwVar = new fw(this, context2);
            this.f34466z0 = fwVar;
            gw gwVar = new gw(this);
            this.A0 = gwVar;
            fwVar.setLayoutManager(gwVar);
            gwVar.O = new hw(this);
            fwVar.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f));
            fwVar.setClipToPadding(false);
            ?? obj3 = new Object();
            obj3.f32565a = 2;
            obj3.f32566b = dwVar;
            this.d.add(obj3);
            this.f34451v0 = new ry(this, context2);
            ny nyVar = new ny(this, context2);
            this.f34448u0 = nyVar;
            fwVar.setAdapter(nyVar);
            fwVar.setOnTouchListener(new View.OnTouchListener(this) {
                public final wy f32030b;

                {
                    this.f32030b = this;
                }

                @Override
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    switch (r3) {
                        case 0:
                            org.telegram.ui.ht q10 = org.telegram.ui.ht.q();
                            wy wyVar = this.f32030b;
                            ww wwVar2 = wyVar.L;
                            wyVar.getMeasuredHeight();
                            return q10.s(motionEvent, wwVar2, null, wyVar.f34393c2, b6Var);
                        case 1:
                            org.telegram.ui.ht q11 = org.telegram.ui.ht.q();
                            wy wyVar2 = this.f32030b;
                            return q11.s(motionEvent, wyVar2.f34394d0, wyVar2.f34411i0, wyVar2.f34393c2, b6Var);
                        default:
                            org.telegram.ui.ht q12 = org.telegram.ui.ht.q();
                            wy wyVar3 = this.f32030b;
                            fw fwVar2 = wyVar3.f34466z0;
                            wyVar3.getMeasuredHeight();
                            return q12.s(motionEvent, fwVar2, wyVar3.f34455w0, wyVar3.f34393c2, b6Var);
                    }
                }
            });
            ?? r42 = new mk0(this) {
                public final wy f32825b;

                {
                    this.f32825b = this;
                }

                @Override
                public final void a(int i15, View view2) {
                    int i16;
                    String str;
                    switch (r2) {
                        case 0:
                            wy wyVar = this.f32825b;
                            zv zvVar2 = wyVar.f34394d0;
                            ay ayVar2 = wyVar.f34402f0;
                            ay ayVar3 = wyVar.f34414j0;
                            if (wyVar.f34432p1 != null) {
                                ayVar3.getClass();
                                ArrayList arrayList3 = ayVar3.f26924x;
                                if (zvVar2.getAdapter() == ayVar3) {
                                    if (i15 >= 0) {
                                        int i17 = ayVar3.D;
                                        if (i15 < i17) {
                                            wyVar.f34432p1.v(view2, wyVar.f34399e1.get(i15), null, "gif", true, 0, 0);
                                            return;
                                        }
                                        if (i17 > 0) {
                                            i16 = (i15 - i17) - 1;
                                        } else {
                                            i16 = i15;
                                        }
                                        if (i16 >= 0 && i16 < arrayList3.size()) {
                                            wyVar.f34432p1.v(view2, arrayList3.get(i16), null, ayVar3.f26920n, true, 0, 0);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                } else if (zvVar2.getAdapter() == ayVar2 && i15 >= 0 && i15 < ayVar2.f26924x.size()) {
                                    wyVar.f34432p1.v(view2, ayVar2.f26924x.get(i15), ayVar2.f26923w, ayVar2.f26920n, true, 0, 0);
                                    wyVar.X();
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        default:
                            wy wyVar2 = this.f32825b;
                            f2.r0 adapter = wyVar2.f34466z0.getAdapter();
                            ry ryVar = wyVar2.f34451v0;
                            if (adapter == ryVar) {
                                str = ryVar.J;
                            } else {
                                str = null;
                            }
                            String str2 = str;
                            if (view2 instanceof org.telegram.ui.Cells.d8) {
                                org.telegram.ui.Cells.d8 d8Var = (org.telegram.ui.Cells.d8) view2;
                                if (d8Var.getSticker() != null && MessageObject.isPremiumSticker(d8Var.getSticker()) && !AccountInstance.getInstance(wyVar2.Y0).getUserConfig().isPremium()) {
                                    org.telegram.ui.ht.q().y(d8Var);
                                    return;
                                }
                                org.telegram.ui.ht.q().u();
                                if (!d8Var.f24235r) {
                                    d8Var.f24235r = true;
                                    d8Var.f24234n = 0.5f;
                                    d8Var.f24238x = 0L;
                                    org.telegram.ui.Cells.c8 c8Var = d8Var.f24229a;
                                    c8Var.setAlpha(0.5f * d8Var.D);
                                    c8Var.invalidate();
                                    d8Var.f24236s = System.currentTimeMillis();
                                    d8Var.invalidate();
                                    wyVar2.f34432p1.m(d8Var, d8Var.getSticker(), str2, d8Var.getParentObject(), d8Var.getSendAnimationData(), true, 0);
                                    return;
                                }
                                return;
                            }
                            return;
                    }
                }
            };
            this.f34455w0 = r42;
            fwVar.setOnItemClickListener((mk0) r42);
            fwVar.setGlowColor(z(i13));
            dwVar.addView(fwVar);
            this.T = new c2.y(fwVar, gwVar);
            iw iwVar = new iw(this, context2);
            this.C0 = iwVar;
            dwVar.addView(iwVar, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + dp));
            vg.e eVar2 = new vg.e(context2, b6Var);
            this.D0 = eVar2;
            eVar2.setVisibility(8);
            eVar2.setOnBackClickListener(new View.OnClickListener(this) {
                public final wy f32558b;

                {
                    this.f32558b = this;
                }

                @Override
                public final void onClick(View view2) {
                    jy jyVar;
                    switch (r2) {
                        case 0:
                            vx vxVar = this.f32558b.O;
                            qx qxVar = vxVar.f34012c;
                            int childCount = qxVar.getChildCount();
                            for (int i142 = 0; i142 < childCount; i142++) {
                                ((vg.d) qxVar.getChildAt(i142)).a(false, true);
                            }
                            vxVar.d = 0L;
                            vxVar.B.f34386b.a(false, true);
                            vxVar.l();
                            return;
                        case 1:
                            ry ryVar = this.f32558b.f34451v0;
                            qy qyVar = ryVar.f32301c;
                            int childCount2 = qyVar.getChildCount();
                            for (int i15 = 0; i15 < childCount2; i15++) {
                                ((vg.d) qyVar.getChildAt(i15)).a(false, true);
                            }
                            ryVar.d = 0L;
                            ryVar.M.f34383a.a(false, true);
                            ryVar.l();
                            return;
                        case 2:
                            wx wxVar = this.f32558b.f34432p1;
                            if (wxVar != null) {
                                wxVar.w();
                                return;
                            }
                            return;
                        default:
                            wy wyVar = this.f32558b;
                            int currentItem = wyVar.h.getCurrentItem();
                            if (currentItem == 0) {
                                jyVar = wyVar.R;
                            } else if (currentItem == 1) {
                                jyVar = wyVar.f34417k0;
                            } else {
                                jyVar = wyVar.C0;
                            }
                            if (jyVar != null) {
                                yp ypVar = jyVar.d;
                                ypVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                ypVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                ypVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                return;
                            }
                            return;
                    }
                }
            });
            dwVar.addView(eVar2, new FrameLayout.LayoutParams(-1, dp));
            z18 = z14;
            jw jwVar = new jw(this, context2, b6Var, o2Var, z18);
            this.f34459x0 = jwVar;
            jwVar.setDragEnabled(true);
            jwVar.setWillNotDraw(false);
            jwVar.setType(rl0Var);
            jwVar.setUnderlineHeight(fwVar.canScrollVertically(-1) ? AndroidUtilities.getShadowHeight() : 0);
            jwVar.setIndicatorColor(z(i12));
            jwVar.setUnderlineColor(z(i14));
            if (viewGroup != null && z18) {
                kw kwVar = new kw(this, context2);
                this.f34463y0 = kwVar;
                kwVar.addView(jwVar, g7.e6.e(-1, 36, 51));
                viewGroup.addView(kwVar, g7.e6.c(-2.0f, -1));
            } else {
                dwVar.addView(jwVar, g7.e6.e(-1, 36, 51));
            }
            Y(true);
            jwVar.setDelegate(new rv(this, 3));
            fwVar.setOnScrollListener(new vy(this, 0));
            vg.b bVar2 = new vg.b(context2, b6Var);
            this.J = bVar2;
            vg.c cVar3 = new vg.c(context2, b6Var);
            this.I = cVar3;
            cVar3.setVisibility(8);
            cVar3.addView(bVar2, g7.e6.d(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
            dwVar.addView(cVar3, g7.e6.e(-1, -2, 80));
        } else {
            z18 = z14;
        }
        this.f34397e.clear();
        this.f34397e.addAll(this.d);
        lw lwVar = new lw(this, context2);
        this.h = lwVar;
        px pxVar = new px(this);
        this.H0 = pxVar;
        lwVar.setAdapter(pxVar);
        mw mwVar = new mw(this, context2);
        this.f34458x = mwVar;
        mwVar.setHapticFeedbackEnabled(true);
        mwVar.setImageResource(R.drawable.smiles_tab_clear);
        int v = z16 ? v(0.6f) : z(org.telegram.ui.ActionBar.f6.Re);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mwVar.setColorFilter(new PorterDuffColorFilter(v, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        mwVar.setScaleType(scaleType);
        mwVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
        mwVar.setFocusable(true);
        mwVar.setOnClickListener(new Object());
        g7.g6.a(mwVar);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f34437r = frameLayout;
        if (z13) {
            addView(frameLayout, g7.e6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, (AndroidUtilities.getShadowHeight() / AndroidUtilities.density) + 40.0f));
        } else {
            addView(frameLayout, g7.e6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.f34441s = frameLayout2;
        addView(frameLayout2, g7.e6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 64.0f));
        FrameLayout frameLayout3 = new FrameLayout(context2);
        this.f34424n = frameLayout3;
        View view2 = new View(context2);
        this.v = view2;
        frameLayout3.addView(view2, new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(40.0f), 83));
        if (z13) {
            addView(frameLayout3, g7.e6.e(-1, 48, 80));
            frameLayout3.addView(mwVar, g7.e6.d(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
            if (z11) {
                ImageView imageView = new ImageView(context2);
                this.f34462y = imageView;
                imageView.setImageResource(R.drawable.smiles_tab_settings);
                imageView.setColorFilter(new PorterDuffColorFilter(z16 ? v(0.6f) : z(org.telegram.ui.ActionBar.f6.Re), mode));
                imageView.setScaleType(scaleType);
                imageView.setFocusable(true);
                imageView.setContentDescription(LocaleController.getString(R.string.Settings));
                g7.g6.a(imageView);
                frameLayout3.addView(imageView, g7.e6.d(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
                imageView.setOnClickListener(new View.OnClickListener(this) {
                    public final wy f32558b;

                    {
                        this.f32558b = this;
                    }

                    @Override
                    public final void onClick(View view22) {
                        jy jyVar;
                        switch (r2) {
                            case 0:
                                vx vxVar = this.f32558b.O;
                                qx qxVar = vxVar.f34012c;
                                int childCount = qxVar.getChildCount();
                                for (int i142 = 0; i142 < childCount; i142++) {
                                    ((vg.d) qxVar.getChildAt(i142)).a(false, true);
                                }
                                vxVar.d = 0L;
                                vxVar.B.f34386b.a(false, true);
                                vxVar.l();
                                return;
                            case 1:
                                ry ryVar = this.f32558b.f34451v0;
                                qy qyVar = ryVar.f32301c;
                                int childCount2 = qyVar.getChildCount();
                                for (int i15 = 0; i15 < childCount2; i15++) {
                                    ((vg.d) qyVar.getChildAt(i15)).a(false, true);
                                }
                                ryVar.d = 0L;
                                ryVar.M.f34383a.a(false, true);
                                ryVar.l();
                                return;
                            case 2:
                                wx wxVar = this.f32558b.f34432p1;
                                if (wxVar != null) {
                                    wxVar.w();
                                    return;
                                }
                                return;
                            default:
                                wy wyVar = this.f32558b;
                                int currentItem = wyVar.h.getCurrentItem();
                                if (currentItem == 0) {
                                    jyVar = wyVar.R;
                                } else if (currentItem == 1) {
                                    jyVar = wyVar.f34417k0;
                                } else {
                                    jyVar = wyVar.C0;
                                }
                                if (jyVar != null) {
                                    yp ypVar = jyVar.d;
                                    ypVar.requestFocus();
                                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                    ypVar.onTouchEvent(obtain);
                                    obtain.recycle();
                                    MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                    ypVar.onTouchEvent(obtain2);
                                    obtain2.recycle();
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            kc0 kc0Var = new kc0(context2, b6Var);
            this.f34454w = kc0Var;
            kc0Var.setViewPager(lwVar);
            kc0Var.setShouldExpand(false);
            kc0Var.setIndicatorHeight(AndroidUtilities.dp(3.0f));
            kc0Var.setIndicatorColor(i0.a.k(z(org.telegram.ui.ActionBar.f6.Oe), 20));
            kc0Var.setUnderlineHeight(0);
            kc0Var.setTabPaddingLeftRight(AndroidUtilities.dp(11.0f));
            kc0Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f));
            frameLayout3.addView(kc0Var, g7.e6.e(-2, 48, 81));
            kc0Var.setOnPageChangeListener(new ow(this, z18));
            ImageView imageView2 = new ImageView(context2);
            this.A = imageView2;
            imageView2.setImageResource(R.drawable.smiles_tab_search);
            imageView2.setColorFilter(new PorterDuffColorFilter(z16 ? v(0.6f) : z(org.telegram.ui.ActionBar.f6.Re), mode));
            imageView2.setScaleType(scaleType);
            imageView2.setContentDescription(LocaleController.getString(R.string.Search));
            imageView2.setFocusable(true);
            imageView2.setVisibility(8);
            frameLayout3.addView(imageView2, g7.e6.d(48, 48.0f, 83, 2.0f, 0.0f, 2.0f, 0.0f));
            imageView2.setOnClickListener(new View.OnClickListener(this) {
                public final wy f32558b;

                {
                    this.f32558b = this;
                }

                @Override
                public final void onClick(View view22) {
                    jy jyVar;
                    switch (r2) {
                        case 0:
                            vx vxVar = this.f32558b.O;
                            qx qxVar = vxVar.f34012c;
                            int childCount = qxVar.getChildCount();
                            for (int i142 = 0; i142 < childCount; i142++) {
                                ((vg.d) qxVar.getChildAt(i142)).a(false, true);
                            }
                            vxVar.d = 0L;
                            vxVar.B.f34386b.a(false, true);
                            vxVar.l();
                            return;
                        case 1:
                            ry ryVar = this.f32558b.f34451v0;
                            qy qyVar = ryVar.f32301c;
                            int childCount2 = qyVar.getChildCount();
                            for (int i15 = 0; i15 < childCount2; i15++) {
                                ((vg.d) qyVar.getChildAt(i15)).a(false, true);
                            }
                            ryVar.d = 0L;
                            ryVar.M.f34383a.a(false, true);
                            ryVar.l();
                            return;
                        case 2:
                            wx wxVar = this.f32558b.f34432p1;
                            if (wxVar != null) {
                                wxVar.w();
                                return;
                            }
                            return;
                        default:
                            wy wyVar = this.f32558b;
                            int currentItem = wyVar.h.getCurrentItem();
                            if (currentItem == 0) {
                                jyVar = wyVar.R;
                            } else if (currentItem == 1) {
                                jyVar = wyVar.f34417k0;
                            } else {
                                jyVar = wyVar.C0;
                            }
                            if (jyVar != null) {
                                yp ypVar = jyVar.d;
                                ypVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                ypVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                ypVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                return;
                            }
                            return;
                    }
                }
            });
        } else {
            addView(frameLayout3, g7.e6.d(56, 48.0f, (LocaleController.isRTL ? 3 : 5) | 80, 0.0f, 0.0f, 2.0f, 0.0f));
            org.telegram.ui.Cells.z h02 = org.telegram.ui.ActionBar.f6.h0(AndroidUtilities.dp(56.0f), z(i13), z(i13));
            g7.g6.a(mwVar);
            mwVar.setPadding(0, 0, AndroidUtilities.dp(2.0f), 0);
            mwVar.setBackground(h02);
            mwVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
            mwVar.setFocusable(true);
            frameLayout3.addView(mwVar, g7.e6.d(48, 48.0f, 51, 2.0f, 0.0f, 2.0f, 0.0f));
            view2.setVisibility(8);
        }
        addView(lwVar, 0, g7.e6.e(-1, -1, 51));
        bg.t tVar = new bg.t(context2, 23);
        this.J0 = tVar;
        tVar.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(6.0f), z(org.telegram.ui.ActionBar.f6.f23238qf)));
        tVar.setTextColor(z(org.telegram.ui.ActionBar.f6.f23219pf));
        tVar.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f));
        tVar.setGravity(16);
        tVar.setTextSize(1, 14.0f);
        tVar.setVisibility(4);
        addView(tVar, g7.e6.d(-2, -2.0f, 81, 5.0f, 0.0f, 5.0f, 53.0f));
        this.f34464y1 = AndroidUtilities.dp(AndroidUtilities.isTablet() ? 40.0f : 32.0f);
        Field field2 = iu.f29518f;
        iu iuVar = new iu(new hu(context2, b6Var));
        if (iu.f29518f == null) {
            try {
                field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
                try {
                    field.setAccessible(true);
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                field = null;
            }
            iu.f29518f = field;
        }
        Field field3 = iu.f29518f;
        if (field3 != null) {
            try {
                iuVar.f29520a = (ViewTreeObserver.OnScrollChangedListener) field3.get(iuVar);
                iu.f29518f.set(iuVar, iu.f29519g);
            } catch (Exception unused3) {
                iuVar.f29520a = null;
            }
        }
        this.f34460x1 = iuVar;
        iuVar.f29522c.setOnSelectionUpdateListener(new d(this, 10));
        this.f34456w1 = MessagesController.getGlobalEmojiSettings().getInt("selected_page", 0);
        Emoji.loadRecentEmoji();
        fxVar.F(false);
        J(true, z11, z12, false);
        if (Build.VERSION.SDK_INT >= 31) {
            ng.d dVar = new ng.d(null);
            this.f34410h2 = dVar;
            ig.a aVar = new ig.a(dVar);
            this.f34416j2 = aVar;
            aVar.f11132f = LiteMode.isEnabled(262144);
            this.f34404f2 = new ig.e(false);
        } else {
            this.f34410h2 = null;
            this.f34416j2 = new ig.a(this.f34413i2);
            this.f34404f2 = null;
        }
        pg.i iVar = new pg.i(this);
        kc0 kc0Var2 = this.f34454w;
        if (kc0Var2 != null) {
            iVar.d(kc0Var2, this, new rv(this, 4), false);
        }
        ig.a aVar2 = this.f34416j2;
        aVar2.d = iVar;
        aVar2.f11131e = this;
        jg.a[] aVarArr = new jg.a[3];
        wwVar.C0(new ov(this, 1));
        aVarArr[0] = new ig.k(wwVar, this, new pv(wwVar, 0));
        zv zvVar2 = this.f34394d0;
        if (zvVar2 != null) {
            zvVar2.C0(new ov(this, 3));
            zv zvVar3 = this.f34394d0;
            Objects.requireNonNull(zvVar3);
            aVarArr[1] = new ig.k(zvVar3, this, new pv(zvVar3, 1));
        }
        fw fwVar2 = this.f34466z0;
        if (fwVar2 != null) {
            fwVar2.C0(new ov(this, 4));
            aVarArr[2] = new ig.k(this.f34466z0, this, new pv(this, 2));
        }
        this.f34407g2 = new ah(aVarArr, 1);
        setBlurredBackgroundDrawableFactory(this.f34416j2);
    }

    public static void b(wy wyVar, boolean z10) {
        zv zvVar = wyVar.f34394d0;
        if (zvVar != null) {
            int childCount = zvVar.getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = zvVar.getChildAt(i9);
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

    public static void c(wy wyVar, fy fyVar, String str) {
        String str2;
        String str3;
        boolean z10;
        String str4;
        wx wxVar;
        oc ocVar;
        org.telegram.ui.ActionBar.o2 o2Var = wyVar.U1;
        int i9 = wyVar.Y0;
        ArrayList arrayList = wyVar.f34422m1;
        if (fyVar != null) {
            if (fyVar.getSpan() != null) {
                if (wyVar.f34432p1 != null) {
                    long j10 = fyVar.getSpan().documentId;
                    TLRPC.Document document = fyVar.getSpan().document;
                    jx jxVar = fyVar.f28601e;
                    if (jxVar != null && jxVar.f29870i) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (document == null) {
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            jx jxVar2 = (jx) arrayList.get(i10);
                            int i11 = 0;
                            while (true) {
                                ArrayList arrayList2 = jxVar2.f29866c;
                                if (arrayList2 != null && i11 < arrayList2.size()) {
                                    if (((TLRPC.Document) jxVar2.f29866c.get(i11)).f22386id == j10) {
                                        document = (TLRPC.Document) jxVar2.f29866c.get(i11);
                                        break;
                                    }
                                    i11++;
                                }
                            }
                        }
                    }
                    if (document == null) {
                        document = k5.f(i9, j10);
                    }
                    if (document != null) {
                        str4 = MessageObject.findAnimatedEmojiEmoticon(document);
                    } else {
                        str4 = null;
                    }
                    String str5 = str4;
                    if (!MessageObject.isFreeEmoji(document) && !UserConfig.getInstance(i9).isPremium() && (((wxVar = wyVar.f34432p1) == null || !wxVar.g()) && !wyVar.Q0 && !z10)) {
                        wyVar.N(false);
                        if (o2Var != null) {
                            ocVar = oc.a0(o2Var);
                        } else {
                            ocVar = new oc(wyVar.f34437r, wyVar.V1);
                        }
                        if (!wyVar.f34396d2 && o2Var != null) {
                            ocVar.J(R.raw.saved_messages, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint2)), LocaleController.getString(R.string.Open), new ov(wyVar, 8)).j();
                        } else {
                            ocVar.q(document, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint)), LocaleController.getString(R.string.PremiumMore), new ov(wyVar, 7)).j();
                        }
                        wyVar.f34396d2 = !wyVar.f34396d2;
                        return;
                    }
                    wyVar.B2 = SystemClock.elapsedRealtime();
                    wyVar.N(true);
                    wyVar.h("animated_" + j10);
                    wyVar.f34432p1.x(j10, document, str5, fyVar.f28600c);
                    return;
                }
                return;
            }
            wyVar.B2 = SystemClock.elapsedRealtime();
            wyVar.N(true);
            if (str != null) {
                str2 = str;
            } else {
                str2 = (String) fyVar.getTag();
            }
            new SpannableStringBuilder().append((CharSequence) str2);
            if (str == null) {
                if (!fyVar.f28600c && (str3 = Emoji.emojiColor.get(str2)) != null) {
                    str2 = g(str2, str3);
                }
                wyVar.h(str2);
                wx wxVar2 = wyVar.f34432p1;
                if (wxVar2 != null) {
                    wxVar2.l(Emoji.fixEmoji(str2));
                    return;
                }
                return;
            }
            wx wxVar3 = wyVar.f34432p1;
            if (wxVar3 != null) {
                wxVar3.l(Emoji.fixEmoji(str));
            }
        }
    }

    public static void e(wy wyVar, int i9, int i10) {
        f2.q1 K;
        int[] iArr = wyVar.M0;
        if (i9 == 1) {
            wyVar.n(wyVar.L, i10);
            return;
        }
        wx wxVar = wyVar.f34432p1;
        if ((wxVar == null || !wxVar.z()) && !wyVar.F0) {
            wk0 x10 = wyVar.x(i9);
            if (i10 > 0 && x10 != null && x10.getVisibility() == 0 && (K = x10.K(0)) != null && K.f5501a.getTop() + wyVar.X0 >= x10.getPaddingTop()) {
                return;
            }
            int i11 = iArr[i9] - i10;
            iArr[i9] = i11;
            if (i11 > 0) {
                iArr[i9] = 0;
            } else if (i11 < (-AndroidUtilities.dp(288.0f))) {
                iArr[i9] = -AndroidUtilities.dp(288.0f);
            }
            if (i9 == 0) {
                wyVar.Z();
            } else {
                wyVar.y(i9).setTranslationY(Math.max(-AndroidUtilities.dp(48.0f), iArr[i9]));
            }
        }
    }

    public static void f(wy wyVar, boolean z10) {
        int N0;
        cy cyVar = wyVar.f34398e0;
        cw cwVar = wyVar.f34417k0;
        zv zvVar = wyVar.f34394d0;
        if (zvVar != null && (zvVar.getAdapter() instanceof ay)) {
            ay ayVar = (ay) zvVar.getAdapter();
            if (!ayVar.f26922s && ayVar.h == 0 && !ayVar.f26924x.isEmpty() && (N0 = cyVar.N0()) != -1 && N0 > cyVar.B() - 5) {
                String str = ayVar.f26923w;
                String str2 = ayVar.f26921r;
                boolean z11 = ayVar.v;
                ayVar.F(str, str2, true, z11, z11);
            }
        }
        wx wxVar = wyVar.f34432p1;
        if (wxVar != null && wxVar.z()) {
            boolean z12 = false;
            f2.q1 K = zvVar.K(0);
            if (K == null) {
                jy.a(cwVar, true, !z10);
                return;
            }
            if (K.f5501a.getTop() < zvVar.getPaddingTop()) {
                z12 = true;
            }
            jy.a(cwVar, z12, !z10);
        } else if (cwVar != null && zvVar != null) {
            cwVar.f29876a.a(true, !z10);
        }
    }

    public static String g(String str, String str2) {
        boolean z10;
        String str3;
        if (CompoundEmoji.isHandshake(str) != null) {
            return CompoundEmoji.applyColor(str, str2);
        }
        if (Emoji.endsWithRightArrow(str)) {
            str = e2.c.m(str, 2, 0);
            z10 = true;
        } else {
            z10 = false;
        }
        int length = str.length();
        if (length > 2 && str.charAt(str.length() - 2) == 8205) {
            str3 = str.substring(str.length() - 2);
            str = e2.c.m(str, 2, 0);
        } else if (length > 3 && str.charAt(str.length() - 3) == 8205) {
            str3 = str.substring(str.length() - 3);
            str = e2.c.m(str, 3, 0);
        } else {
            str3 = null;
        }
        String j10 = ta.b.j(str, str2);
        if (str3 != null) {
            j10 = ta.b.j(j10, str3);
        }
        if (z10) {
            return ta.b.j(j10, "\u200d➡");
        }
        return j10;
    }

    public static void j(int i9, View view) {
        if (view == null) {
            return;
        }
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i9);
    }

    public final void A() {
        iw iwVar = this.C0;
        if (iwVar != null) {
            iwVar.b();
        }
        cw cwVar = this.f34417k0;
        if (cwVar != null) {
            cwVar.b();
        }
        wv wvVar = this.R;
        if (wvVar != null) {
            wvVar.b();
        }
    }

    public final void C() {
        ig.e eVar;
        float f10;
        if (Build.VERSION.SDK_INT >= 31 && (eVar = this.f34404f2) != null) {
            kc0 kc0Var = this.f34454w;
            RectF rectF = this.f34453v2;
            pg.i.c(kc0Var, this, rectF);
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
            eVar.g(1, this.f34457w2);
            eVar.e(this.f34407g2, getWidth(), getHeight());
        }
    }

    public final void D() {
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        int i9 = this.Y0;
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.groupPackUpdated);
        if (this.f34448u0 != null) {
            NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.recentDocumentsDidLoad);
            NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.featuredStickersDidLoad);
            NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.groupStickersDidLoad);
            NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        }
    }

    public final void E(boolean z10, boolean z11) {
        iy iyVar;
        boolean z12;
        if (this.f34456w1 != 0 && this.f34443s1) {
            this.f34456w1 = 0;
        }
        if (this.f34456w1 == 0 && this.f34439r1) {
            this.f34456w1 = 1;
        }
        int i9 = this.f34456w1;
        lw lwVar = this.h;
        if (i9 != 0 && !z10 && this.f34397e.size() != 1) {
            int i10 = this.f34456w1;
            if (i10 == 1) {
                M(false, false);
                if (!this.f34434q0 && !this.f34438r0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                R(z12, false);
                if (lwVar.getCurrentItem() != 2) {
                    lwVar.x(2, false);
                }
                jw jwVar = this.f34459x0;
                if (jwVar != null) {
                    this.O0 = true;
                    int i11 = this.C1;
                    if (i11 >= 0) {
                        jwVar.m(i11);
                    } else {
                        int i12 = this.B1;
                        if (i12 >= 0) {
                            jwVar.m(i12);
                        } else {
                            jwVar.m(this.A1);
                        }
                    }
                    this.O0 = false;
                    this.A0.h1(0, 0);
                }
            } else if (i10 == 2) {
                M(false, false);
                R(false, false);
                if (lwVar.getCurrentItem() != 1) {
                    lwVar.x(1, false);
                }
                dx dxVar = this.f34420l0;
                if (dxVar != null) {
                    dxVar.m(0);
                }
                cw cwVar = this.f34417k0;
                if (cwVar != null && (iyVar = cwVar.f29882r) != null) {
                    iyVar.F1(null);
                }
            }
        } else {
            M(true, false);
            R(false, false);
            if (lwVar.getCurrentItem() != 0) {
                lwVar.x(0, !z10);
            }
            if (z11) {
                AndroidUtilities.runOnUIThread(new ov(this, 9), 350L);
            }
        }
        N(true);
    }

    public final void F() {
        ny nyVar = this.f34448u0;
        if (nyVar != null) {
            nyVar.l();
        }
        ry ryVar = this.f34451v0;
        if (ryVar != null) {
            ryVar.l();
        }
        if (org.telegram.ui.ht.q().E) {
            org.telegram.ui.ht.q().n();
        }
        org.telegram.ui.ht.q().u();
    }

    public final void G(int i9) {
        wx wxVar = this.f34432p1;
        if ((wxVar != null && wxVar.z()) || i9 == 0) {
            return;
        }
        HorizontalScrollView y10 = y(i9);
        this.M0[i9] = 0;
        y10.setTranslationY(0);
    }

    public final void H(int i9, int i10) {
        xw xwVar = this.M;
        View m10 = xwVar.m(i9);
        int L0 = xwVar.L0();
        int i11 = 1;
        if ((m10 == null && Math.abs(i9 - L0) > xwVar.J * 9.0f) || !SharedConfig.animationsEnabled()) {
            if (xwVar.L0() < i9) {
                i11 = 0;
            }
            c2.y yVar = this.U;
            yVar.f2255b = i11;
            yVar.c(i9, i10, false, false);
            return;
        }
        this.F0 = true;
        kh.n1 n1Var = new kh.n1(this, this.L.getContext(), 1);
        n1Var.f5443a = i9;
        n1Var.f47269p = i10;
        xwVar.w0(n1Var);
    }

    public final void I(int i9, int i10) {
        gw gwVar = this.A0;
        View m10 = gwVar.m(i9);
        int L0 = gwVar.L0();
        int i11 = 1;
        if (m10 == null && Math.abs(i9 - L0) > 40) {
            if (gwVar.L0() < i9) {
                i11 = 0;
            }
            c2.y yVar = this.T;
            yVar.f2255b = i11;
            yVar.c(i9, i10, false, false);
            return;
        }
        this.F0 = true;
        this.f34466z0.x0(i9);
    }

    public final void J(boolean z10, boolean z11, boolean z12, boolean z13) {
        ArrayList arrayList = this.f34397e;
        arrayList.clear();
        boolean z14 = false;
        int i9 = 0;
        while (true) {
            ArrayList arrayList2 = this.d;
            if (i9 >= arrayList2.size()) {
                break;
            }
            if (((sy) arrayList2.get(i9)).f32565a == 0 && z10) {
                arrayList.add((sy) arrayList2.get(i9));
            }
            if (((sy) arrayList2.get(i9)).f32565a == 1 && z12) {
                arrayList.add((sy) arrayList2.get(i9));
            }
            if (((sy) arrayList2.get(i9)).f32565a == 2 && z11) {
                arrayList.add((sy) arrayList2.get(i9));
            }
            i9++;
        }
        kc0 kc0Var = this.f34454w;
        if (kc0Var != null) {
            if (arrayList.size() > 1) {
                z14 = true;
            }
            AndroidUtilities.updateViewVisibilityAnimated(kc0Var, z14, 1.0f, z13);
        }
        lw lwVar = this.h;
        if (lwVar != null) {
            lwVar.setAdapter(null);
            lwVar.setAdapter(this.H0);
            if (kc0Var != null) {
                kc0Var.setViewPager(lwVar);
            }
        }
    }

    @Override
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = 4;
        if (i9 == 0) {
            q(false);
            float f12 = 1.0f - this.f34383a.f47775e;
            iw iwVar = this.C0;
            iwVar.setAlpha(f12);
            if (f12 > 0.0f) {
                i12 = 0;
            } else {
                i12 = 4;
            }
            iwVar.setVisibility(i12);
            float f13 = 1.0f - f12;
            vg.e eVar = this.D0;
            eVar.setAlpha(f13);
            eVar.setTranslationY((-AndroidUtilities.dp(15.0f)) * f12);
            int i15 = (f13 > 0.0f ? 1 : (f13 == 0.0f ? 0 : -1));
            if (i15 > 0) {
                i13 = 0;
            } else {
                i13 = 4;
            }
            eVar.setVisibility(i13);
            vg.c cVar2 = this.I;
            cVar2.setAlpha(f13);
            cVar2.setTranslationY(AndroidUtilities.dp(30.0f) * f12);
            if (i15 > 0) {
                i14 = 0;
            }
            cVar2.setVisibility(i14);
            S();
            this.f34445t0.invalidate();
        } else if (i9 == 1) {
            l(false);
            float f14 = 1.0f - this.f34386b.f47775e;
            wv wvVar = this.R;
            wvVar.setAlpha(f14);
            if (f14 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            wvVar.setVisibility(i10);
            float f15 = 1.0f - f14;
            vg.e eVar2 = this.Q;
            eVar2.setAlpha(f15);
            eVar2.setTranslationY((-AndroidUtilities.dp(15.0f)) * f14);
            int i16 = (f15 > 0.0f ? 1 : (f15 == 0.0f ? 0 : -1));
            if (i16 > 0) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            eVar2.setVisibility(i11);
            vg.c cVar3 = this.G;
            cVar3.setAlpha(f15);
            cVar3.setTranslationY(AndroidUtilities.dp(30.0f) * f14);
            if (i16 > 0) {
                i14 = 0;
            }
            cVar3.setVisibility(i14);
            S();
            this.F.invalidate();
        }
    }

    public final void K(final vg.b bVar, final TLObject tLObject, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final boolean z10, boolean z11) {
        String formatPluralString;
        ry ryVar;
        vx vxVar;
        if (stickerSet != null) {
            if (!z10 || (vxVar = this.O) == null || vxVar.d == stickerSet.f22407id) {
                if (!z10 && (ryVar = this.f34451v0) != null && ryVar.d != stickerSet.f22407id) {
                    return;
                }
                final boolean isStickerPackInstalled = MediaDataController.getInstance(this.Y0).isStickerPackInstalled(stickerSet.f22407id);
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
                bVar.f48403d0.a(!isStickerPackInstalled, z11);
                bVar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        int i9;
                        wy wyVar = wy.this;
                        MediaDataController mediaDataController = MediaDataController.getInstance(wyVar.Y0);
                        Context context = wyVar.getContext();
                        if (isStickerPackInstalled) {
                            i9 = 0;
                        } else {
                            i9 = 2;
                        }
                        org.telegram.ui.ActionBar.o2 o2Var = wyVar.U1;
                        FrameLayout frameLayout = wyVar.f34441s;
                        vg.b bVar2 = bVar;
                        TLObject tLObject2 = tLObject;
                        TLRPC.StickerSet stickerSet2 = stickerSet;
                        TLRPC.Document document2 = document;
                        boolean z12 = z10;
                        mediaDataController.toggleStickerSet(context, tLObject2, document2, i9, o2Var, frameLayout, false, true, new h3.p1(wyVar, bVar2, tLObject2, stickerSet2, document2, z12, 10), false);
                        wyVar.K(bVar2, tLObject2, stickerSet2, document2, z12, true);
                    }
                });
            }
        }
    }

    public final void L(long j10, boolean z10, boolean z11) {
        int i9;
        View childAt;
        float f10;
        kc0 kc0Var = this.f34454w;
        if (kc0Var != null) {
            this.f34439r1 = z10;
            this.f34443s1 = z11;
            if (!z11 && !z10) {
                this.f34435q1 = 0L;
            } else {
                this.f34435q1 = j10;
            }
            if (z11) {
                i9 = 2;
            } else {
                i9 = 0;
            }
            LinearLayout linearLayout = kc0Var.d;
            if (i9 >= linearLayout.getChildCount()) {
                childAt = null;
            } else {
                childAt = linearLayout.getChildAt(i9);
            }
            if (childAt != null) {
                if (this.f34435q1 != 0) {
                    f10 = 0.15f;
                } else {
                    f10 = 1.0f;
                }
                childAt.setAlpha(f10);
                lw lwVar = this.h;
                if (z11) {
                    if (this.f34435q1 != 0 && lwVar.getCurrentItem() != 0) {
                        M(true, true);
                        R(false, true);
                        lwVar.x(0, false);
                    }
                } else if (this.f34435q1 != 0 && lwVar.getCurrentItem() != 1) {
                    M(false, true);
                    R(false, true);
                    lwVar.x(1, false);
                }
            }
        }
    }

    public final void M(boolean z10, boolean z11) {
        float f10;
        float f11;
        float f12;
        float f13;
        mw mwVar = this.f34458x;
        if (!z10 || mwVar.getTag() != null) {
            if ((!z10 && mwVar.getTag() != null) || this.f34419k2) {
                return;
            }
            AnimatorSet animatorSet = this.B;
            Integer num = null;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.B = null;
            }
            if (!z10) {
                num = 1;
            }
            mwVar.setTag(num);
            int i9 = 0;
            float f14 = 0.0f;
            if (z11) {
                if (z10) {
                    mwVar.setVisibility(0);
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.B = animatorSet2;
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(mwVar, View.ALPHA, f12);
                if (z10) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(mwVar, View.SCALE_X, f13);
                if (z10) {
                    f14 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(mwVar, View.SCALE_Y, f14));
                this.B.setDuration(200L);
                this.B.setInterpolator(gr.f28845g);
                this.B.addListener(new sw(this, z10, 0));
                this.B.start();
                return;
            }
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            mwVar.setAlpha(f10);
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            mwVar.setScaleX(f11);
            if (z10) {
                f14 = 1.0f;
            }
            mwVar.setScaleY(f14);
            if (!z10) {
                i9 = 4;
            }
            mwVar.setVisibility(i9);
        }
    }

    public final void N(boolean z10) {
        Integer num;
        this.D = 0.0f;
        wx wxVar = this.f34432p1;
        if (wxVar != null && wxVar.z()) {
            z10 = false;
        }
        FrameLayout frameLayout = this.f34424n;
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
            this.C2.a(z10, true);
        }
    }

    public final void O(boolean z10, boolean z11) {
        View view = this.K;
        if (!z10 || view.getTag() != null) {
            if (!z10 && view.getTag() != null) {
                return;
            }
            AnimatorSet animatorSet = this.S;
            Integer num = null;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.S = null;
            }
            if (!z10) {
                num = 1;
            }
            view.setTag(num);
            float f10 = 0.0f;
            if (z11) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.S = animatorSet2;
                if (z10) {
                    f10 = 1.0f;
                }
                animatorSet2.playTogether(ObjectAnimator.ofFloat(view, View.ALPHA, f10));
                this.S.setDuration(200L);
                this.S.setInterpolator(gr.f28845g);
                this.S.addListener(new org.telegram.ui.xp(this, 25));
                this.S.start();
                return;
            }
            if (z10) {
                f10 = 1.0f;
            }
            view.setAlpha(f10);
        }
    }

    public final void P(boolean z10) {
        for (int i9 = 0; i9 < 3; i9++) {
            f2.y w8 = w(i9);
            int L0 = w8.L0();
            if (z10) {
                if (L0 == 1 || L0 == 2) {
                    w8.n0(0);
                    G(i9);
                }
            } else if (L0 == 0) {
                w8.h1(0, 0);
            }
        }
    }

    public final void Q(boolean z10, boolean z11, boolean z12) {
        float f10;
        float translationY;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.Chat chat = MessagesController.getInstance(this.Y0).getChat(Long.valueOf(this.f34435q1));
        if (chat != null) {
            bg.t tVar = this.J0;
            if (z10) {
                if (!ChatObject.hasAdminRights(chat) && (tL_chatBannedRights = chat.default_banned_rights) != null && (tL_chatBannedRights.send_stickers || (z11 && tL_chatBannedRights.send_plain))) {
                    org.telegram.ui.ActionBar.o2 o2Var = this.U1;
                    if (!(o2Var instanceof org.telegram.ui.qn) || !((org.telegram.ui.qn) o2Var).K6()) {
                        if (z11) {
                            tVar.setText(LocaleController.getString(R.string.GlobalAttachEmojiRestricted));
                        } else if (z12) {
                            tVar.setText(LocaleController.getString(R.string.GlobalAttachGifRestricted));
                        } else {
                            tVar.setText(LocaleController.getString(R.string.GlobalAttachStickersRestricted));
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
                            tVar.setText(LocaleController.getString(R.string.AttachPlainRestrictedForever));
                        } else if (z12) {
                            tVar.setText(LocaleController.getString(R.string.AttachGifRestrictedForever));
                        } else {
                            tVar.setText(LocaleController.getString(R.string.AttachStickersRestrictedForever));
                        }
                    } else {
                        if (z11) {
                            tVar.setText(LocaleController.formatString("AttachPlainRestricted", R.string.AttachPlainRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                        }
                        if (z12) {
                            tVar.setText(LocaleController.formatString("AttachGifRestricted", R.string.AttachGifRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                        } else {
                            tVar.setText(LocaleController.formatString("AttachStickersRestricted", R.string.AttachStickersRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                        }
                    }
                }
                tVar.setVisibility(0);
            }
            AnimatorSet animatorSet = this.F2;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.F2 = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.F2 = animatorSet2;
            float f11 = 1.0f;
            if (z10) {
                f10 = tVar.getAlpha();
            } else {
                f10 = 1.0f;
            }
            float f12 = 0.0f;
            if (!z10) {
                f11 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(tVar, View.ALPHA, f10, f11);
            if (z10) {
                translationY = AndroidUtilities.dp(12.0f);
            } else {
                translationY = tVar.getTranslationY();
            }
            if (!z10) {
                f12 = AndroidUtilities.dp(12.0f);
            }
            animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(tVar, View.TRANSLATION_Y, translationY, f12));
            org.telegram.messenger.video.l lVar = this.G2;
            if (lVar != null) {
                AndroidUtilities.cancelRunOnUIThread(lVar);
            }
            if (z10) {
                org.telegram.messenger.video.l lVar2 = new org.telegram.messenger.video.l(this, z11, z12, 3);
                this.G2 = lVar2;
                AndroidUtilities.runOnUIThread(lVar2, 3500L);
            }
            this.F2.setDuration(320L);
            this.F2.setInterpolator(gr.h);
            this.F2.start();
        }
    }

    public final void R(boolean z10, boolean z11) {
        float f10;
        float f11;
        float f12;
        float f13;
        ImageView imageView = this.f34462y;
        if (imageView != null && !this.f34421l2) {
            if (!z10 || imageView.getTag() != null) {
                if (z10 || imageView.getTag() == null) {
                    AnimatorSet animatorSet = this.C;
                    Integer num = null;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.C = null;
                    }
                    if (!z10) {
                        num = 1;
                    }
                    imageView.setTag(num);
                    int i9 = 0;
                    float f14 = 0.0f;
                    if (z11) {
                        if (z10) {
                            imageView.setVisibility(0);
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.C = animatorSet2;
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
                        this.C.setDuration(200L);
                        this.C.setInterpolator(gr.f28845g);
                        this.C.addListener(new sw(this, z10, 1));
                        this.C.start();
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
                        i9 = 4;
                    }
                    imageView.setVisibility(i9);
                }
            }
        }
    }

    public final void S() {
        int measuredHeight;
        int dp;
        float f10;
        org.telegram.ui.ActionBar.o2 o2Var;
        View view = (View) getParent();
        if (view != null) {
            float y10 = getY();
            if (getLayoutParams().height > 0) {
                measuredHeight = getLayoutParams().height;
            } else {
                measuredHeight = getMeasuredHeight();
            }
            float f11 = y10 + measuredHeight;
            if ((!AndroidUtilities.isInMultiwindow && ((o2Var = this.U1) == null || !o2Var.isInBubbleMode())) || this.R0) {
                dp = view.getHeight();
            } else {
                dp = AndroidUtilities.dp(1.0f);
            }
            float f12 = f11 - dp;
            float f13 = this.f34427n2;
            FrameLayout frameLayout = this.f34424n;
            if (f13 >= 0.0f) {
                f12 += getMeasuredHeight() - this.f34427n2;
            } else if (frameLayout.getTop() - f12 < 0.0f || !this.f34447t2) {
                f12 = 0.0f;
            }
            float f14 = -f12;
            boolean z10 = this.W;
            if (z10) {
                f10 = 45.0f;
            } else {
                f10 = 50.0f;
            }
            float lerp = f14 + AndroidUtilities.lerp(AndroidUtilities.dp(f10), -this.f34423m2, this.C2.f47775e);
            frameLayout.setTranslationY(lerp);
            if (z10) {
                this.f34437r.setTranslationY(lerp);
            }
        }
    }

    public final void T() {
        jy jyVar;
        boolean z10;
        int z11;
        int z12;
        int z13;
        int z14;
        int z15;
        int z16;
        int z17;
        int z18;
        jv jvVar;
        int z19;
        int z20;
        int z21;
        int z22;
        int z23;
        int z24;
        int z25;
        int z26;
        int z27;
        boolean z28 = this.f34434q0;
        View view = this.v;
        if (!z28) {
            setBackground(null);
            view.setBackground(null);
        } else if (!AndroidUtilities.isInMultiwindow && !this.J1) {
            int i9 = org.telegram.ui.ActionBar.f6.He;
            setBackgroundColor(z(i9));
            if (this.W) {
                view.setBackgroundColor(z(i9));
            }
        } else {
            Drawable background = getBackground();
            if (background != null) {
                background.setColorFilter(new PorterDuffColorFilter(z(org.telegram.ui.ActionBar.f6.He), PorterDuff.Mode.MULTIPLY));
            }
        }
        vv vvVar = this.E;
        if (vvVar != null) {
            if (this.f34434q0) {
                vvVar.setBackgroundColor(z(org.telegram.ui.ActionBar.f6.He));
                this.K.setBackgroundColor(z(org.telegram.ui.ActionBar.f6.Ke));
            } else {
                vvVar.setBackground(null);
            }
        }
        iu iuVar = this.f34460x1;
        if (iuVar != null) {
            iuVar.f29522c.a();
        }
        int i10 = 0;
        while (true) {
            jyVar = this.R;
            z10 = this.f34400e2;
            if (i10 >= 3) {
                break;
            }
            if (i10 == 0) {
                jyVar = this.C0;
            } else if (i10 != 1) {
                jyVar = this.f34417k0;
            }
            if (jyVar != null) {
                yp ypVar = jyVar.d;
                FrameLayout frameLayout = jyVar.f29881n;
                View view2 = jyVar.f29880f;
                if (this.f34434q0) {
                    view2.setBackgroundColor(z(org.telegram.ui.ActionBar.f6.He));
                } else {
                    view2.setBackground(null);
                }
                jyVar.f29879e.setBackgroundColor(z(org.telegram.ui.ActionBar.f6.Ke));
                im0 im0Var = jyVar.f29878c;
                if (z10) {
                    z24 = v(0.4f);
                } else {
                    z24 = z(org.telegram.ui.ActionBar.f6.Je);
                }
                im0Var.a(z24);
                Drawable background2 = frameLayout.getBackground();
                if (z10) {
                    z25 = v(0.06f);
                } else {
                    z25 = z(org.telegram.ui.ActionBar.f6.Ie);
                }
                org.telegram.ui.ActionBar.f6.w1(z25, background2);
                frameLayout.invalidate();
                if (z10) {
                    z26 = v(0.45f);
                } else {
                    z26 = z(org.telegram.ui.ActionBar.f6.Je);
                }
                ypVar.setHintTextColor(z26);
                if (z10) {
                    z27 = v(0.8f);
                } else {
                    z27 = z(org.telegram.ui.ActionBar.f6.G6);
                }
                ypVar.setTextColor(z27);
            }
            i10++;
        }
        Paint paint = this.f34429o1;
        if (paint != null) {
            paint.setColor(z(org.telegram.ui.ActionBar.f6.f22955af));
        }
        ww wwVar = this.L;
        if (wwVar != null) {
            wwVar.setGlowColor(z(org.telegram.ui.ActionBar.f6.He));
        }
        fw fwVar = this.f34466z0;
        if (fwVar != null) {
            fwVar.setGlowColor(z(org.telegram.ui.ActionBar.f6.He));
        }
        jw jwVar = this.f34459x0;
        if (jwVar != null) {
            jwVar.setIndicatorColor(z(org.telegram.ui.ActionBar.f6.Qe));
            jwVar.setUnderlineColor(z(org.telegram.ui.ActionBar.f6.Ke));
            if (this.f34434q0) {
                jwVar.setBackgroundColor(z(org.telegram.ui.ActionBar.f6.He));
            } else {
                jwVar.setBackground(null);
            }
        }
        dx dxVar = this.f34420l0;
        if (dxVar != null) {
            dxVar.setIndicatorColor(z(org.telegram.ui.ActionBar.f6.Qe));
            dxVar.setUnderlineColor(z(org.telegram.ui.ActionBar.f6.Ke));
            if (this.f34434q0) {
                dxVar.setBackgroundColor(z(org.telegram.ui.ActionBar.f6.He));
            } else {
                dxVar.setBackground(null);
            }
        }
        mw mwVar = this.f34458x;
        if (mwVar != null) {
            if (z10) {
                z23 = v(0.6f);
            } else {
                z23 = z(org.telegram.ui.ActionBar.f6.Re);
            }
            mwVar.setColorFilter(new PorterDuffColorFilter(z23, PorterDuff.Mode.MULTIPLY));
            if (jyVar == null) {
                Drawable background3 = mwVar.getBackground();
                int i11 = org.telegram.ui.ActionBar.f6.He;
                org.telegram.ui.ActionBar.f6.B1(background3, z(i11), false);
                org.telegram.ui.ActionBar.f6.B1(mwVar.getBackground(), z(i11), true);
            }
        }
        ImageView imageView = this.f34462y;
        if (imageView != null) {
            if (z10) {
                z22 = v(0.6f);
            } else {
                z22 = z(org.telegram.ui.ActionBar.f6.Re);
            }
            imageView.setColorFilter(new PorterDuffColorFilter(z22, PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.A;
        if (imageView2 != null) {
            if (z10) {
                z21 = v(0.6f);
            } else {
                z21 = z(org.telegram.ui.ActionBar.f6.Re);
            }
            imageView2.setColorFilter(new PorterDuffColorFilter(z21, PorterDuff.Mode.MULTIPLY));
        }
        bg.t tVar = this.J0;
        if (tVar != null) {
            ((ShapeDrawable) tVar.getBackground()).getPaint().setColor(z(org.telegram.ui.ActionBar.f6.f23238qf));
            tVar.setTextColor(z(org.telegram.ui.ActionBar.f6.f23219pf));
        }
        ay ayVar = this.f34402f0;
        if (ayVar != null) {
            dy dyVar = ayVar.f26918e;
            ImageView imageView3 = dyVar.f27839a;
            int i12 = org.telegram.ui.ActionBar.f6.Le;
            imageView3.setColorFilter(new PorterDuffColorFilter(z(i12), PorterDuff.Mode.MULTIPLY));
            dyVar.f27840b.setTextColor(z(i12));
            dyVar.f27841c.setProgressColor(z(org.telegram.ui.ActionBar.f6.f23073h6));
        }
        this.a2 = new PorterDuffColorFilter(z(org.telegram.ui.ActionBar.f6.Oh), PorterDuff.Mode.SRC_IN);
        int i13 = 0;
        while (true) {
            Drawable[] drawableArr = this.T0;
            if (i13 >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i13];
            if (z10) {
                z19 = v(0.4f);
            } else {
                z19 = z(org.telegram.ui.ActionBar.f6.Ne);
            }
            org.telegram.ui.ActionBar.f6.y1(drawable, z19, false);
            Drawable drawable2 = drawableArr[i13];
            if (z10) {
                z20 = v(0.8f);
            } else {
                z20 = z(org.telegram.ui.ActionBar.f6.Oe);
            }
            org.telegram.ui.ActionBar.f6.y1(drawable2, z20, true);
            i13++;
        }
        if (vvVar != null && (jvVar = vvVar.f31189y) != null) {
            jvVar.d();
        }
        int i14 = 0;
        while (true) {
            Drawable[] drawableArr2 = this.U0;
            if (i14 >= drawableArr2.length) {
                break;
            }
            Drawable drawable3 = drawableArr2[i14];
            if (z10) {
                z17 = v(0.4f);
            } else {
                z17 = z(org.telegram.ui.ActionBar.f6.Me);
            }
            org.telegram.ui.ActionBar.f6.y1(drawable3, z17, false);
            Drawable drawable4 = drawableArr2[i14];
            if (z10) {
                z18 = v(0.8f);
            } else {
                z18 = z(org.telegram.ui.ActionBar.f6.Oe);
            }
            org.telegram.ui.ActionBar.f6.y1(drawable4, z18, true);
            i14++;
        }
        int i15 = 0;
        while (true) {
            Drawable[] drawableArr3 = this.V0;
            if (i15 >= drawableArr3.length) {
                break;
            }
            Drawable drawable5 = drawableArr3[i15];
            if (z10) {
                z15 = v(0.4f);
            } else {
                z15 = z(org.telegram.ui.ActionBar.f6.Me);
            }
            org.telegram.ui.ActionBar.f6.y1(drawable5, z15, false);
            Drawable drawable6 = drawableArr3[i15];
            if (z10) {
                z16 = v(0.8f);
            } else {
                z16 = z(org.telegram.ui.ActionBar.f6.Oe);
            }
            org.telegram.ui.ActionBar.f6.y1(drawable6, z16, true);
            i15++;
        }
        org.telegram.ui.ActionBar.r5 r5Var = this.W1;
        if (r5Var != null) {
            if (z10) {
                z13 = v(0.4f);
            } else {
                z13 = z(org.telegram.ui.ActionBar.f6.Ne);
            }
            org.telegram.ui.ActionBar.f6.y1(r5Var, z13, false);
            if (z10) {
                z14 = v(0.8f);
            } else {
                z14 = z(org.telegram.ui.ActionBar.f6.Oe);
            }
            org.telegram.ui.ActionBar.f6.y1(r5Var, z14, true);
        }
        org.telegram.ui.ActionBar.r5 r5Var2 = this.X1;
        if (r5Var2 != null) {
            if (z10) {
                z11 = v(0.4f);
            } else {
                z11 = z(org.telegram.ui.ActionBar.f6.Qe);
            }
            org.telegram.ui.ActionBar.f6.y1(r5Var2, z11, false);
            if (z10) {
                z12 = v(0.8f);
            } else {
                z12 = z(org.telegram.ui.ActionBar.f6.Qe);
            }
            org.telegram.ui.ActionBar.f6.y1(r5Var2, z12, true);
        }
    }

    public final void U() {
        ww wwVar = this.L;
        if (wwVar != null) {
            for (int i9 = 0; i9 < wwVar.getChildCount(); i9++) {
                View childAt = wwVar.getChildAt(i9);
                if (childAt instanceof nx) {
                    ((nx) childAt).a(true);
                }
            }
        }
    }

    public final void V(int i9) {
        int i10;
        if (!this.f34387b0) {
            int i11 = -1;
            if (i9 != -1) {
                int size = getRecentEmoji().size() + (this.W ? 1 : 0);
                fx fxVar = this.N;
                int i12 = fxVar.f28588c;
                ArrayList arrayList = fxVar.f28595x;
                int i13 = 0;
                if (i12 >= 0) {
                    i10 = 3;
                } else {
                    i10 = 0;
                }
                int i14 = size + i10;
                if (i9 >= i14) {
                    int i15 = 0;
                    while (true) {
                        String[][] strArr = EmojiData.dataColored;
                        if (i15 >= strArr.length) {
                            break;
                        }
                        i14 += strArr[i15].length + 1;
                        if (i9 < i14) {
                            i11 = i15 + 1;
                            break;
                        }
                        i15++;
                    }
                    if (i11 < 0) {
                        ArrayList<jx> emojipacks = getEmojipacks();
                        int size2 = arrayList.size() - 1;
                        while (true) {
                            if (size2 < 0) {
                                break;
                            } else if (((Integer) arrayList.get(size2)).intValue() <= i9) {
                                jx jxVar = (jx) this.f34422m1.get(size2);
                                while (i13 < emojipacks.size()) {
                                    long j10 = emojipacks.get(i13).f29865b.f22407id;
                                    long j11 = jxVar.f29865b.f22407id;
                                    if (j10 == j11 && (!jxVar.f29869g || (!jxVar.f29868f && !this.l1.contains(Long.valueOf(j11))))) {
                                        i13 = EmojiData.dataColored.length + 1 + i13;
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
                    this.E.j(i13, true);
                }
            }
        }
    }

    public final void W() {
        boolean z10;
        boolean z11;
        int i9;
        iy iyVar;
        int i10;
        boolean z12;
        boolean z13;
        dx dxVar = this.f34420l0;
        int currentPosition = dxVar.getCurrentPosition();
        int i11 = this.f34425n0;
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
        boolean isEmpty = this.f34399e1.isEmpty();
        dxVar.d(false);
        this.f34425n0 = -2;
        this.f34428o0 = -2;
        this.f34431p0 = -2;
        Drawable[] drawableArr = this.V0;
        if (!isEmpty) {
            this.f34425n0 = 0;
            dxVar.b(0, drawableArr[0]).setContentDescription(LocaleController.getString(R.string.RecentStickers));
            i9 = 1;
        } else {
            i9 = 0;
        }
        this.f34428o0 = i9;
        dxVar.b(1, drawableArr[1]).setContentDescription(LocaleController.getString(R.string.FeaturedGifs));
        this.f34431p0 = i9 + 1;
        AndroidUtilities.dp(13.0f);
        AndroidUtilities.dp(11.0f);
        int i12 = this.Y0;
        ArrayList<String> arrayList = MessagesController.getInstance(i12).gifSearchEmojies;
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            String str = arrayList.get(i13);
            Emoji.EmojiDrawable emojiDrawable = Emoji.getEmojiDrawable(str);
            if (emojiDrawable != null) {
                TLRPC.Document emojiAnimatedSticker = MediaDataController.getInstance(i12).getEmojiAnimatedSticker(str);
                String l10 = j3.r0.l(i13 + 3, "tab");
                int i14 = dxVar.f32516x;
                dxVar.f32516x = i14 + 1;
                lw0 lw0Var = (lw0) dxVar.f32510n.get(l10);
                if (lw0Var != null) {
                    dxVar.g(l10, lw0Var, i14);
                    i10 = currentPosition;
                    z12 = z11;
                } else {
                    i10 = currentPosition;
                    z12 = z11;
                    lw0Var = new lw0(dxVar.getContext(), 2);
                    lw0Var.setFocusable(true);
                    lw0Var.setOnClickListener(new ml0(dxVar, 2));
                    lw0Var.setExpanded(dxVar.f32496b0);
                    lw0Var.a(dxVar.f32501e0);
                    dxVar.f32500e.addView(lw0Var, i14);
                }
                lw0Var.d = false;
                lw0Var.setTag(R.id.index_tag, Integer.valueOf(i14));
                lw0Var.setTag(R.id.parent_tag, emojiDrawable);
                lw0Var.setTag(R.id.object_tag, emojiAnimatedSticker);
                if (i14 == dxVar.f32517y) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                lw0Var.setSelected(z13);
                dxVar.h.put(l10, lw0Var);
                lw0Var.setContentDescription(str);
            } else {
                i10 = currentPosition;
                z12 = z11;
            }
            i13++;
            currentPosition = i10;
            z11 = z12;
        }
        int i15 = currentPosition;
        boolean z14 = z11;
        dxVar.h();
        dxVar.q();
        if (z10 && isEmpty) {
            dxVar.m(this.f34428o0);
            cw cwVar = this.f34417k0;
            if (cwVar != null && (iyVar = cwVar.f29882r) != null) {
                iyVar.F1(null);
                return;
            }
            return;
        }
        WeakHashMap weakHashMap = r0.j0.f46915a;
        if (dxVar.isLaidOut()) {
            if (!isEmpty && !z14) {
                dxVar.k(i15 + 1, 0);
            } else if (isEmpty && z14) {
                dxVar.k(i15 - 1, 0);
            }
        }
    }

    public final void X() {
        ay ayVar;
        int size = this.f34399e1.size();
        long calcDocumentsHash = MediaDataController.calcDocumentsHash(this.f34399e1, Integer.MAX_VALUE);
        ArrayList<TLRPC.Document> recentGifs = MediaDataController.getInstance(this.Y0).getRecentGifs();
        this.f34399e1 = recentGifs;
        long calcDocumentsHash2 = MediaDataController.calcDocumentsHash(recentGifs, Integer.MAX_VALUE);
        if ((this.f34420l0 != null && size == 0 && !this.f34399e1.isEmpty()) || (size != 0 && this.f34399e1.isEmpty())) {
            W();
        }
        if ((size != this.f34399e1.size() || calcDocumentsHash != calcDocumentsHash2) && (ayVar = this.f34414j0) != null) {
            ayVar.l();
        }
    }

    public final void Y(boolean z10) {
        boolean z11;
        TLRPC.Document document;
        boolean z12;
        boolean z13;
        boolean z14;
        ArrayList<TLRPC.Document> arrayList;
        boolean z15;
        ArrayList<TLRPC.Document> arrayList2;
        TLRPC.StickerSet stickerSet;
        int i9;
        jw jwVar = this.f34459x0;
        if (jwVar != null) {
            ta1 ta1Var = jwVar.f32500e;
            if (jwVar.f32514s != null) {
                return;
            }
            this.B1 = -2;
            this.C1 = -2;
            this.D1 = -2;
            this.E1 = -2;
            this.f34384a0 = false;
            this.A1 = 0;
            int currentPosition = jwVar.getCurrentPosition();
            boolean z16 = true;
            if (getParent() != null && getVisibility() == 0 && (this.f34449u1.size() != 0 || this.f34452v1.size() != 0)) {
                z11 = true;
            } else {
                z11 = false;
            }
            jwVar.d(z11);
            int i10 = this.Y0;
            MediaDataController mediaDataController = MediaDataController.getInstance(i10);
            SharedPreferences emojiSettings = MessagesController.getEmojiSettings(i10);
            ArrayList arrayList3 = this.f34412i1;
            arrayList3.clear();
            ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = mediaDataController.getFeaturedStickerSets();
            int size = featuredStickerSets.size();
            for (int i11 = 0; i11 < size; i11++) {
                TLRPC.StickerSetCovered stickerSetCovered = featuredStickerSets.get(i11);
                if (!mediaDataController.isStickerPackInstalled(stickerSetCovered.set.f22407id)) {
                    arrayList3.add(stickerSetCovered);
                }
            }
            uy uyVar = this.B0;
            if (uyVar != null) {
                uyVar.l();
            }
            boolean isEmpty = featuredStickerSets.isEmpty();
            long j10 = 0;
            Drawable[] drawableArr = this.U0;
            if (!isEmpty && (arrayList3.isEmpty() || emojiSettings.getLong("featured_hidden", 0L) == featuredStickerSets.get(0).set.f22407id)) {
                if (mediaDataController.getUnreadStickerSets().isEmpty()) {
                    i9 = 2;
                } else {
                    i9 = 3;
                }
                lw0 c10 = jwVar.c(i9, drawableArr[i9]);
                c10.h.setText(LocaleController.getString(R.string.FeaturedStickersShort));
                c10.setContentDescription(LocaleController.getString(R.string.FeaturedStickers));
                int i12 = this.A1;
                this.D1 = i12;
                this.A1 = i12 + 1;
            }
            if (!this.f34406g1.isEmpty()) {
                int i13 = this.A1;
                this.C1 = i13;
                this.A1 = i13 + 1;
                lw0 c11 = jwVar.c(1, drawableArr[1]);
                c11.h.setText(LocaleController.getString(R.string.FavoriteStickersShort));
                c11.setContentDescription(LocaleController.getString(R.string.FavoriteStickers));
            }
            if (!this.f34403f1.isEmpty()) {
                int i14 = this.A1;
                this.B1 = i14;
                this.A1 = i14 + 1;
                lw0 c12 = jwVar.c(0, drawableArr[0]);
                c12.h.setText(LocaleController.getString(R.string.RecentStickersShort));
                c12.setContentDescription(LocaleController.getString(R.string.RecentStickers));
            }
            ArrayList arrayList4 = this.Z0;
            arrayList4.clear();
            org.telegram.ui.ActionBar.b6 b6Var = null;
            this.f34395d1 = null;
            this.f34388b1 = -1;
            this.f34385a1 = -10;
            if (this.D2 == null || z10) {
                this.D2 = new ArrayList(mediaDataController.getStickerSets(0));
            }
            ArrayList<TLRPC.TL_messages_stickerSet> arrayList5 = this.D2;
            int i15 = 0;
            while (true) {
                TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.f34446t1;
                if (i15 >= stickerSetCoveredArr.length) {
                    break;
                }
                TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCoveredArr[i15];
                long j11 = j10;
                if (stickerSetCovered2 != null) {
                    TLRPC.TL_messages_stickerSet stickerSetById = mediaDataController.getStickerSetById(stickerSetCovered2.set.f22407id);
                    if (stickerSetById != null && (stickerSet = stickerSetById.set) != null && !stickerSet.archived) {
                        stickerSetCoveredArr[i15] = null;
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
                i15++;
                j10 = j11;
            }
            long j12 = j10;
            ArrayList<TLRPC.TL_messages_stickerSet> filterPremiumStickers = MessagesController.getInstance(i10).filterPremiumStickers(arrayList5);
            for (int i16 = 0; i16 < filterPremiumStickers.size(); i16++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = filterPremiumStickers.get(i16);
                TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet2.set;
                if ((stickerSet2 == null || !stickerSet2.archived) && (arrayList2 = tL_messages_stickerSet2.documents) != null && !arrayList2.isEmpty()) {
                    arrayList4.add(tL_messages_stickerSet2);
                }
            }
            if (this.F1 != null) {
                long j13 = MessagesController.getEmojiSettings(i10).getLong("group_hide_stickers_" + this.F1.f22381id, -1L);
                TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(this.F1.f22381id));
                if (chat != null && this.F1.stickerset != null && ChatObject.hasAdminRights(chat)) {
                    TLRPC.StickerSet stickerSet3 = this.F1.stickerset;
                    if (stickerSet3 != null) {
                        if (j13 == stickerSet3.f22407id) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        this.f34392c1 = z15;
                    }
                } else {
                    if (j13 != -1) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    this.f34392c1 = z14;
                }
                TLRPC.ChatFull chatFull = this.F1;
                TLRPC.StickerSet stickerSet4 = chatFull.stickerset;
                if (stickerSet4 != null) {
                    TLRPC.TL_messages_stickerSet groupStickerSetById = mediaDataController.getGroupStickerSetById(stickerSet4);
                    if (groupStickerSetById != null && (arrayList = groupStickerSetById.documents) != null && !arrayList.isEmpty() && groupStickerSetById.set != null) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = new TLRPC.TL_messages_stickerSet();
                        tL_messages_stickerSet3.documents = groupStickerSetById.documents;
                        tL_messages_stickerSet3.packs = groupStickerSetById.packs;
                        tL_messages_stickerSet3.set = groupStickerSetById.set;
                        if (this.f34392c1) {
                            this.f34385a1 = arrayList4.size();
                            arrayList4.add(tL_messages_stickerSet3);
                        } else {
                            this.f34385a1 = 0;
                            arrayList4.add(0, tL_messages_stickerSet3);
                        }
                        if (!this.F1.can_set_stickers) {
                            tL_messages_stickerSet3 = null;
                        }
                        this.f34395d1 = tL_messages_stickerSet3;
                    }
                } else if (chatFull.can_set_stickers) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = new TLRPC.TL_messages_stickerSet();
                    if (this.f34392c1) {
                        this.f34385a1 = arrayList4.size();
                        arrayList4.add(tL_messages_stickerSet4);
                    } else {
                        this.f34385a1 = 0;
                        arrayList4.add(0, tL_messages_stickerSet4);
                    }
                }
            }
            int i17 = 0;
            while (i17 < arrayList4.size()) {
                if (i17 == this.f34385a1) {
                    TLRPC.Chat chat2 = MessagesController.getInstance(i10).getChat(Long.valueOf(this.F1.f22381id));
                    if (chat2 == null) {
                        arrayList4.remove(0);
                        i17--;
                    } else {
                        this.f34384a0 = z16;
                        String str = "chat" + chat2.f22380id;
                        int i18 = jwVar.f32516x;
                        jwVar.f32516x = i18 + 1;
                        lw0 lw0Var = (lw0) jwVar.f32510n.get(str);
                        if (lw0Var != null) {
                            jwVar.g(str, lw0Var, i18);
                        } else {
                            lw0Var = new lw0(jwVar.getContext(), 0);
                            lw0Var.setFocusable(z16);
                            lw0Var.setOnClickListener(new ml0(jwVar, 0));
                            ta1Var.addView(lw0Var, i18);
                            lw0Var.f30576w = z16;
                            z8 z8Var = new z8(b6Var);
                            z8Var.u(AndroidUtilities.dp(14.0f));
                            z8Var.k(UserConfig.selectedAccount, chat2);
                            int i19 = jwVar.f32493a;
                            o9 o9Var = lw0Var.f30571e;
                            o9Var.setLayerNum(i19);
                            o9Var.e(chat2, z8Var);
                            o9Var.setAspectFit(z16);
                            lw0Var.setExpanded(jwVar.f32496b0);
                            lw0Var.a(jwVar.f32501e0);
                            lw0Var.h.setText(chat2.title);
                        }
                        lw0Var.d = z16;
                        lw0Var.setTag(R.id.index_tag, Integer.valueOf(i18));
                        if (i18 == jwVar.f32517y) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        lw0Var.setSelected(z13);
                        jwVar.h.put(str, lw0Var);
                    }
                } else {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet5 = (TLRPC.TL_messages_stickerSet) arrayList4.get(i17);
                    TLRPC.StickerSet stickerSet5 = tL_messages_stickerSet5.set;
                    if (stickerSet5 != null && stickerSet5.thumb_document_id != j12) {
                        for (int i20 = 0; i20 < tL_messages_stickerSet5.documents.size(); i20++) {
                            document = tL_messages_stickerSet5.documents.get(i20);
                            if (document != null && tL_messages_stickerSet5.set.thumb_document_id == document.f22386id) {
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
                    String str2 = "set" + tL_messages_stickerSet5.set.f22407id;
                    int i21 = jwVar.f32516x;
                    jwVar.f32516x = i21 + 1;
                    lw0 lw0Var2 = (lw0) jwVar.f32510n.get(str2);
                    if (lw0Var2 != null) {
                        jwVar.g(str2, lw0Var2, i21);
                    } else {
                        lw0Var2 = new lw0(jwVar.getContext(), 0);
                        lw0Var2.setFocusable(z16);
                        lw0Var2.setOnClickListener(new ml0(jwVar, 1));
                        lw0Var2.setExpanded(jwVar.f32496b0);
                        lw0Var2.a(jwVar.f32501e0);
                        ta1Var.addView(lw0Var2, i21);
                    }
                    lw0Var2.f30571e.setLayerNum(jwVar.f32493a);
                    lw0Var2.d = false;
                    lw0Var2.setTag(closestPhotoSizeWithSize);
                    lw0Var2.setTag(R.id.index_tag, Integer.valueOf(i21));
                    lw0Var2.setTag(R.id.parent_tag, tL_messages_stickerSet5);
                    lw0Var2.setTag(R.id.object_tag, document);
                    if (i21 == jwVar.f32517y) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    lw0Var2.setSelected(z12);
                    jwVar.h.put(str2, lw0Var2);
                    lw0Var2.setContentDescription(tL_messages_stickerSet5.set.title + ", " + LocaleController.getString(R.string.AccDescrStickerSet));
                }
                i17++;
                z16 = true;
                b6Var = null;
            }
            jwVar.h();
            jwVar.q();
            if (currentPosition != 0) {
                jwVar.k(currentPosition, currentPosition);
            }
            o();
        }
    }

    public final void Z() {
        boolean z10;
        int i9;
        kw kwVar = this.f34463y0;
        jw jwVar = this.f34459x0;
        if (jwVar != null && kwVar == null && this.f34432p1 != null) {
            jwVar.setTranslationY(this.f34432p1.p() * (-AndroidUtilities.dp(50.0f)));
        }
        if (kwVar == null) {
            return;
        }
        if (getVisibility() == 0 && this.G0 && this.f34432p1.p() != 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        kwVar.setVisibility(i9);
        if (z10) {
            Rect rect = this.f34450u2;
            rect.setEmpty();
            this.h.getChildVisibleRect(this.f34445t0, rect, null);
            float p6 = this.f34432p1.p() * AndroidUtilities.dp(50.0f);
            int i10 = rect.left;
            if (i10 != 0 || p6 != 0.0f) {
                this.T1 = false;
            }
            kwVar.setTranslationX(i10);
            float translationY = (((getTranslationY() + getTop()) - kwVar.getTop()) - jwVar.getExpandedOffset()) - p6;
            if (kwVar.getTranslationY() != translationY) {
                kwVar.setTranslationY(translationY);
                kwVar.invalidate();
            }
        }
        if (this.T1 && z10 && this.L0) {
            jwVar.i(this.S1, true);
            return;
        }
        this.T1 = false;
        jwVar.i(this.S1, false);
    }

    @Override
    public final void a(int i9) {
        setBottomInset(i9);
    }

    public final void a0() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        org.telegram.ui.Cells.s3 s3Var;
        LongSparseArray longSparseArray = this.f34452v1;
        LongSparseArray longSparseArray2 = this.f34449u1;
        int i9 = this.Y0;
        fw fwVar = this.f34466z0;
        if (fwVar != null) {
            try {
                int childCount = fwVar.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = fwVar.getChildAt(i10);
                    if ((childAt instanceof org.telegram.ui.Cells.s3) && ((ik0) fwVar.T(childAt)) != null) {
                        org.telegram.ui.Cells.s3 s3Var2 = (org.telegram.ui.Cells.s3) childAt;
                        ArrayList<Long> unreadStickerSets = MediaDataController.getInstance(i9).getUnreadStickerSets();
                        TLRPC.StickerSetCovered stickerSet = s3Var2.getStickerSet();
                        if (unreadStickerSets != null && unreadStickerSets.contains(Long.valueOf(stickerSet.set.f22407id))) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        int i11 = 0;
                        while (true) {
                            TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.f34446t1;
                            if (i11 < stickerSetCoveredArr.length) {
                                TLRPC.StickerSetCovered stickerSetCovered = stickerSetCoveredArr[i11];
                                if (stickerSetCovered != null) {
                                    s3Var = s3Var2;
                                    if (stickerSetCovered.set.f22407id == stickerSet.set.f22407id) {
                                        s3Var2 = s3Var;
                                        z11 = true;
                                        break;
                                    }
                                } else {
                                    s3Var = s3Var2;
                                }
                                i11++;
                                s3Var2 = s3Var;
                            } else {
                                z11 = false;
                                break;
                            }
                        }
                        s3Var2.c(stickerSet, z10, true, 0, 0, z11);
                        if (z10) {
                            MediaDataController.getInstance(i9).markFeaturedStickersByIdAsRead(false, stickerSet.set.f22407id);
                        }
                        if (longSparseArray2.indexOfKey(stickerSet.set.f22407id) >= 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (longSparseArray.indexOfKey(stickerSet.set.f22407id) >= 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z12 || z13) {
                            if (z12 && s3Var2.f25263r) {
                                longSparseArray2.remove(stickerSet.set.f22407id);
                                z12 = false;
                            } else if (z13 && !s3Var2.f25263r) {
                                longSparseArray.remove(stickerSet.set.f22407id);
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
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
    }

    @Override
    public final void d(float f10) {
        this.f34427n2 = f10;
        S();
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        Utilities.Callback callback;
        TLRPC.StickerSet stickerSet;
        int i11 = NotificationCenter.stickersDidLoad;
        fx fxVar = this.N;
        ov ovVar = this.H2;
        if (i9 == i11) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (this.f34448u0 != null) {
                    Y(((Boolean) objArr[1]).booleanValue());
                    a0();
                    F();
                    o();
                }
            } else if (((Integer) objArr[0]).intValue() == 5) {
                if (((Boolean) objArr[1]).booleanValue()) {
                    AndroidUtilities.cancelRunOnUIThread(ovVar);
                    AndroidUtilities.runOnUIThread(ovVar, 100L);
                    return;
                }
                fxVar.F(false);
            }
        } else if (i9 == NotificationCenter.groupPackUpdated) {
            long longValue = ((Long) objArr[0]).longValue();
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            TLRPC.ChatFull chatFull = this.F1;
            if (chatFull != null && chatFull.f22381id == longValue && booleanValue) {
                fxVar.F(true);
            }
        } else if (i9 == NotificationCenter.recentDocumentsDidLoad) {
            boolean booleanValue2 = ((Boolean) objArr[0]).booleanValue();
            int intValue = ((Integer) objArr[1]).intValue();
            if (booleanValue2 || intValue == 0 || intValue == 2) {
                k(booleanValue2);
            }
        } else if (i9 == NotificationCenter.featuredStickersDidLoad) {
            a0();
            kc0 kc0Var = this.f34454w;
            if (kc0Var != null) {
                int childCount = kc0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    kc0Var.getChildAt(i12).invalidate();
                }
            }
            Y(false);
        } else if (i9 == NotificationCenter.featuredEmojiDidLoad) {
            if (fxVar != null) {
                fxVar.F(false);
            }
        } else {
            int i13 = NotificationCenter.groupStickersDidLoad;
            vx vxVar = this.O;
            if (i9 == i13) {
                Long l10 = (Long) objArr[0];
                long longValue2 = l10.longValue();
                if (objArr.length > 1) {
                    tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) objArr[1];
                } else {
                    tL_messages_stickerSet = null;
                }
                if (tL_messages_stickerSet != null) {
                    ry ryVar = this.f34451v0;
                    if (ryVar != null && ryVar.d == longValue2 && ryVar.f32303f.size() < tL_messages_stickerSet.documents.size()) {
                        ryVar.f32303f = tL_messages_stickerSet.documents;
                        ryVar.l();
                    }
                    if (vxVar != null && vxVar.d == longValue2 && vxVar.f34014f.size() < tL_messages_stickerSet.documents.size()) {
                        vxVar.f34014f = tL_messages_stickerSet.documents;
                        vxVar.l();
                    }
                }
                TLRPC.ChatFull chatFull2 = this.F1;
                if (chatFull2 != null && (stickerSet = chatFull2.stickerset) != null && stickerSet.f22407id == longValue2) {
                    Y(false);
                }
                HashMap hashMap = this.f34426n1;
                if (hashMap.containsKey(l10) && objArr.length >= 2 && ((Utilities.Callback) hashMap.get(l10)) != null && tL_messages_stickerSet != null && (callback = (Utilities.Callback) hashMap.remove(l10)) != null) {
                    callback.run(tL_messages_stickerSet);
                }
                AndroidUtilities.cancelRunOnUIThread(ovVar);
                AndroidUtilities.runOnUIThread(ovVar, 100L);
                return;
            }
            int i14 = NotificationCenter.emojiLoaded;
            ww wwVar = this.L;
            if (i9 == i14) {
                fw fwVar = this.f34466z0;
                if (fwVar != null) {
                    int childCount2 = fwVar.getChildCount();
                    for (int i15 = 0; i15 < childCount2; i15++) {
                        View childAt = fwVar.getChildAt(i15);
                        if ((childAt instanceof org.telegram.ui.Cells.m8) || (childAt instanceof org.telegram.ui.Cells.d8)) {
                            childAt.invalidate();
                        }
                    }
                }
                if (wwVar != null) {
                    wwVar.invalidate();
                    int childCount3 = wwVar.getChildCount();
                    for (int i16 = 0; i16 < childCount3; i16++) {
                        View childAt2 = wwVar.getChildAt(i16);
                        if (childAt2 instanceof fy) {
                            childAt2.invalidate();
                        }
                    }
                }
                iu iuVar = this.f34460x1;
                if (iuVar != null) {
                    iuVar.f29522c.invalidate();
                }
                dx dxVar = this.f34420l0;
                if (dxVar != null) {
                    ta1 ta1Var = dxVar.f32500e;
                    int childCount4 = ta1Var.getChildCount();
                    for (int i17 = 0; i17 < childCount4; i17++) {
                        ta1Var.getChildAt(i17).invalidate();
                    }
                }
            } else if (i9 == NotificationCenter.newEmojiSuggestionsAvailable) {
                if (wwVar != null && this.W) {
                    if ((this.R.f29878c.f29472k == 2 || wwVar.getAdapter() == vxVar) && !TextUtils.isEmpty(vxVar.v)) {
                        vxVar.F(vxVar.v, true);
                    }
                }
            } else if (i9 == NotificationCenter.currentUserPremiumStatusChanged) {
                if (fxVar != null) {
                    fxVar.F(false);
                }
                U();
                Y(false);
            }
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        ng.d dVar;
        ig.e eVar;
        if (Build.VERSION.SDK_INT >= 31 && (dVar = this.f34410h2) != null && (eVar = this.f34404f2) != null) {
            C();
            RecordingCanvas a2 = dVar.a(getMeasuredWidth(), getMeasuredHeight());
            a2.drawColor(z(org.telegram.ui.ActionBar.f6.f23001d6));
            if (SharedConfig.chatBlurEnabled()) {
                eVar.b(a2, -2);
            }
            dVar.b();
        }
        S();
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.h) {
            canvas.save();
            if (this.f34424n.getVisibility() != 8 && !this.f34434q0 && this.f34442s0) {
                canvas.drawColor(i0.a.k(-1, 25));
            }
            boolean drawChild = super.drawChild(canvas, view, j10);
            float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(this.f34423m2);
            if (navigationBarThirdButtonsFactor > 0.0f) {
                int l1 = org.telegram.ui.ActionBar.f6.l1(navigationBarThirdButtonsFactor, z(org.telegram.ui.ActionBar.f6.He));
                int i9 = this.f34465y2;
                GradientDrawable gradientDrawable = this.f34461x2;
                if (i9 != l1) {
                    gradientDrawable.setColors(new int[]{l1, org.telegram.ui.ActionBar.f6.l1(0.66f, l1), i0.a.k(l1, 0)});
                    this.f34465y2 = l1;
                }
                gradientDrawable.setBounds(0, getMeasuredHeight() - this.f34423m2, getMeasuredWidth(), getMeasuredHeight());
                gradientDrawable.draw(canvas);
            }
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    public int getCurrentPage() {
        return this.f34456w1;
    }

    public ArrayList<jx> getEmojipacks() {
        ArrayList<jx> arrayList = new ArrayList<>();
        int i9 = 0;
        while (true) {
            ArrayList arrayList2 = this.f34422m1;
            if (i9 < arrayList2.size()) {
                jx jxVar = (jx) arrayList2.get(i9);
                boolean z10 = jxVar.f29869g;
                ArrayList arrayList3 = this.l1;
                if ((!z10 && (jxVar.f29868f || arrayList3.contains(Long.valueOf(jxVar.f29865b.f22407id)))) || (jxVar.f29869g && !jxVar.f29868f && !arrayList3.contains(Long.valueOf(jxVar.f29865b.f22407id)))) {
                    arrayList.add(jxVar);
                }
                i9++;
            } else {
                return arrayList;
            }
        }
    }

    public ArrayList<String> getRecentEmoji() {
        if (this.Y1) {
            return Emoji.recentEmoji;
        }
        if (this.f34468z2 == null) {
            this.f34468z2 = new ArrayList();
        }
        if (Emoji.recentEmoji.size() != this.A2) {
            this.f34468z2.clear();
            int i9 = 0;
            while (true) {
                ArrayList<String> arrayList = Emoji.recentEmoji;
                if (i9 >= arrayList.size()) {
                    break;
                }
                if (!arrayList.get(i9).startsWith("animated_")) {
                    this.f34468z2.add(arrayList.get(i9));
                }
                i9++;
            }
            this.A2 = this.f34468z2.size();
        }
        return this.f34468z2;
    }

    public float getStickersExpandOffset() {
        jw jwVar = this.f34459x0;
        if (jwVar == null) {
            return 0.0f;
        }
        return jwVar.getExpandedOffset();
    }

    public final void h(String str) {
        if (str != null) {
            if (str.startsWith("animated_") || Emoji.isValidEmoji(str)) {
                Emoji.addRecentEmoji(str);
                int i9 = 0;
                if (getVisibility() != 0 || this.h.getCurrentItem() != 0) {
                    Emoji.sortEmoji();
                    this.N.F(false);
                }
                Emoji.saveRecentEmoji();
                if (!this.Y1) {
                    ArrayList arrayList = this.f34468z2;
                    if (arrayList == null) {
                        this.f34468z2 = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    while (true) {
                        ArrayList<String> arrayList2 = Emoji.recentEmoji;
                        if (i9 < arrayList2.size()) {
                            if (!arrayList2.get(i9).startsWith("animated_")) {
                                this.f34468z2.add(arrayList2.get(i9));
                            }
                            i9++;
                        } else {
                            this.A2 = this.f34468z2.size();
                            return;
                        }
                    }
                }
            }
        }
    }

    public final void i(int i9, int i10, boolean z10) {
        if (i9 == 2 || x(i9).K(0) == null) {
            return;
        }
        tw twVar = new tw(getContext(), i10);
        twVar.f5443a = !z10 ? 1 : 0;
        w(i9).w0(twVar);
    }

    public final void k(boolean z10) {
        if (z10) {
            X();
            return;
        }
        int size = this.f34403f1.size();
        int size2 = this.f34406g1.size();
        int i9 = this.Y0;
        this.f34403f1 = MediaDataController.getInstance(i9).getRecentStickers(0, true);
        this.f34406g1 = MediaDataController.getInstance(i9).getRecentStickers(2);
        if (UserConfig.getInstance(i9).isPremium()) {
            this.f34409h1 = MediaDataController.getInstance(i9).getRecentStickers(7);
        } else {
            this.f34409h1 = new ArrayList();
        }
        for (int i10 = 0; i10 < this.f34406g1.size(); i10++) {
            TLRPC.Document document = (TLRPC.Document) this.f34406g1.get(i10);
            int i11 = 0;
            while (true) {
                if (i11 < this.f34403f1.size()) {
                    TLRPC.Document document2 = (TLRPC.Document) this.f34403f1.get(i11);
                    if (document2.dc_id == document.dc_id && document2.f22386id == document.f22386id) {
                        this.f34403f1.remove(i11);
                        break;
                    }
                    i11++;
                }
            }
        }
        if (MessagesController.getInstance(i9).premiumFeaturesBlocked()) {
            int i12 = 0;
            while (i12 < this.f34406g1.size()) {
                if (MessageObject.isPremiumSticker((TLRPC.Document) this.f34406g1.get(i12))) {
                    this.f34406g1.remove(i12);
                    i12--;
                }
                i12++;
            }
            int i13 = 0;
            while (i13 < this.f34403f1.size()) {
                if (MessageObject.isPremiumSticker((TLRPC.Document) this.f34403f1.get(i13))) {
                    this.f34403f1.remove(i13);
                    i13--;
                }
                i13++;
            }
        }
        if (size != this.f34403f1.size() || size2 != this.f34406g1.size()) {
            Y(false);
        }
        ny nyVar = this.f34448u0;
        if (nyVar != null) {
            nyVar.l();
        }
        o();
    }

    public final void l(boolean z10) {
        int i9;
        boolean z11;
        wx wxVar = this.f34432p1;
        td.a aVar = this.f34386b;
        ww wwVar = this.L;
        wv wvVar = this.R;
        if (wxVar != null && wxVar.z()) {
            f2.q1 K = wwVar.K(0);
            if (K == null) {
                jy.a(wvVar, true, !z10);
            } else {
                if (K.f5501a.getTop() < wwVar.getPaddingTop()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                jy.a(wvVar, z11, !z10);
            }
            O(false, !z10);
            wvVar.setTranslationY(aVar.f47775e * AndroidUtilities.dp(15.0f));
        } else if (wvVar != null && wwVar != null) {
            f2.q1 K3 = wwVar.K(0);
            if (K3 != null) {
                i9 = K3.f5501a.getTop();
            } else {
                i9 = -this.X0;
            }
            wvVar.setTranslationY((aVar.f47775e * AndroidUtilities.dp(15.0f)) + i9);
            wvVar.f29876a.a(false, !z10);
            m(Math.round(this.E.getTranslationY()));
        }
    }

    public final void m(int i9) {
        ObjectAnimator objectAnimator = this.N0[1];
        if (objectAnimator != null && objectAnimator.isRunning()) {
            return;
        }
        boolean z10 = false;
        f2.q1 K = this.L.K(0);
        int dp = AndroidUtilities.dp(38.0f) + i9;
        if (dp > 0 && (K == null || K.f5501a.getBottom() < dp)) {
            z10 = true;
        }
        O(z10, !this.G1);
    }

    public final void n(ww wwVar, int i9) {
        ww wwVar2;
        f2.q1 K;
        int i10;
        vv vvVar = this.E;
        int[] iArr = this.M0;
        if (wwVar == null) {
            iArr[1] = 0;
            vvVar.setTranslationY(0);
        } else if (wwVar.getVisibility() == 0 && !this.f34387b0) {
            wx wxVar = this.f34432p1;
            if (wxVar == null || !wxVar.z()) {
                if (i9 > 0 && (wwVar2 = this.L) != null && wwVar2.getVisibility() == 0 && (K = wwVar2.K(0)) != null) {
                    int top = K.f5501a.getTop();
                    if (this.W) {
                        i10 = this.X0;
                    } else {
                        i10 = 0;
                    }
                    if (top + i10 >= wwVar2.getPaddingTop()) {
                        return;
                    }
                }
                int i11 = iArr[1] - i9;
                iArr[1] = i11;
                if (i11 > 0) {
                    iArr[1] = 0;
                } else if (i11 < (-AndroidUtilities.dp(108.0f))) {
                    iArr[1] = -AndroidUtilities.dp(108.0f);
                }
                vvVar.setTranslationY(Math.max(-AndroidUtilities.dp(36.0f), iArr[1]));
            }
        }
    }

    public final void o() {
        int L0;
        jw jwVar = this.f34459x0;
        if (jwVar != null && (L0 = this.A0.L0()) != -1) {
            int i9 = this.C1;
            if (i9 <= 0 && (i9 = this.B1) <= 0) {
                i9 = this.A1;
            }
            jwVar.k(this.f34448u0.F(L0), i9);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        int i9 = this.Y0;
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.groupPackUpdated);
        if (this.f34448u0 != null) {
            NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.stickersDidLoad);
            NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.recentDocumentsDidLoad);
            NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.featuredStickersDidLoad);
            NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.groupStickersDidLoad);
            NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
            AndroidUtilities.runOnUIThread(new ov(this, 0));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        iu iuVar = this.f34460x1;
        if (iuVar != null && iuVar.isShowing()) {
            iuVar.dismiss();
        }
        org.telegram.ui.ht q10 = org.telegram.ui.ht.q();
        if (q10.f38923l == this.f34393c2) {
            q10.W = null;
            q10.f38910a0 = null;
            q10.Y = null;
            q10.f38923l = null;
            q10.f38914c0 = null;
            q10.u();
        }
    }

    @Override
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int i13 = i11 - i9;
        if (this.K1 != i13) {
            this.K1 = i13;
            F();
        }
        super.onLayout(z10, i9, i10, i11, i12);
        S();
        Z();
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        this.G1 = true;
        boolean z10 = AndroidUtilities.isInMultiwindow;
        View view = this.v;
        boolean z11 = this.W;
        if (!z10 && !this.J1) {
            if (this.H1 != 0) {
                if (!this.E2) {
                    setOutlineProvider(null);
                    setClipToOutline(false);
                    setElevation(0.0f);
                }
                if (this.f34434q0) {
                    int i11 = org.telegram.ui.ActionBar.f6.He;
                    setBackgroundColor(z(i11));
                    if (z11) {
                        view.setBackgroundColor(z(i11));
                    }
                }
                this.H1 = 0;
            }
        } else if (this.H1 != 1) {
            if (!this.E2) {
                setOutlineProvider(this.I1);
                setClipToOutline(true);
                setElevation(AndroidUtilities.dp(2.0f));
            }
            setBackgroundResource(R.drawable.smiles_popup);
            Drawable background = getBackground();
            int i12 = org.telegram.ui.ActionBar.f6.He;
            background.setColorFilter(new PorterDuffColorFilter(z(i12), PorterDuff.Mode.MULTIPLY));
            if (z11 && this.f34434q0) {
                view.setBackgroundColor(z(i12));
            }
            this.H1 = 1;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824));
        this.G1 = false;
        setTranslationY(getTranslationY());
    }

    public final void p(int i9) {
        int L0;
        int i10;
        int L02;
        if (i9 == 0) {
            if (!this.F0 && (L02 = this.A0.L0()) != -1 && this.f34466z0 != null) {
                int i11 = this.C1;
                if (i11 <= 0 && (i11 = this.B1) <= 0) {
                    i11 = this.A1;
                }
                this.f34459x0.k(this.f34448u0.F(L02), i11);
            }
        } else if (i9 == 2) {
            f2.r0 adapter = this.f34394d0.getAdapter();
            ay ayVar = this.f34414j0;
            if (adapter == ayVar && ayVar.E >= 0 && this.f34428o0 >= 0 && this.f34425n0 >= 0 && (L0 = this.f34398e0.L0()) != -1) {
                if (L0 >= ayVar.E) {
                    i10 = this.f34428o0;
                } else {
                    i10 = this.f34425n0;
                }
                this.f34420l0.k(i10, 0);
            }
        }
    }

    public final void q(boolean z10) {
        int i9;
        wx wxVar = this.f34432p1;
        td.a aVar = this.f34383a;
        fw fwVar = this.f34466z0;
        boolean z11 = false;
        iw iwVar = this.C0;
        if (wxVar != null && wxVar.z()) {
            f2.q1 K = fwVar.K(0);
            if (K == null) {
                jy.a(iwVar, true, !z10);
            } else {
                if (K.f5501a.getTop() < fwVar.getPaddingTop()) {
                    z11 = true;
                }
                jy.a(iwVar, z11, !z10);
            }
            iwVar.setTranslationY(aVar.f47775e * AndroidUtilities.dp(15.0f));
        } else if (iwVar != null && fwVar != null) {
            f2.q1 K3 = fwVar.K(0);
            if (K3 != null) {
                i9 = K3.f5501a.getTop();
            } else {
                i9 = -this.X0;
            }
            iwVar.setTranslationY((aVar.f47775e * AndroidUtilities.dp(15.0f)) + i9);
            iwVar.f29876a.a(false, !z10);
        }
    }

    public final void r() {
        Emoji.clearRecentEmoji();
        this.N.F(false);
    }

    @Override
    public final void requestLayout() {
        if (this.G1) {
            return;
        }
        super.requestLayout();
    }

    public final void s(long j10, boolean z10) {
        jy jyVar;
        f2.m0 m0Var;
        View view;
        View view2;
        int i9;
        TLRPC.TL_messages_stickerSet stickerSetById;
        ny nyVar;
        int E;
        AnimatorSet animatorSet = this.I0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.I0 = null;
        }
        int currentItem = this.h.getCurrentItem();
        if (currentItem == 2 && j10 != -1 && (stickerSetById = MediaDataController.getInstance(this.Y0).getStickerSetById(j10)) != null && (E = (nyVar = this.f34448u0).E(stickerSetById)) >= 0 && E < nyVar.h()) {
            I(E, AndroidUtilities.dp(48.0f));
        }
        ay ayVar = this.f34402f0;
        if (ayVar != null) {
            ayVar.G = false;
        }
        for (int i10 = 0; i10 < 3; i10++) {
            View view3 = this.f34466z0;
            View view4 = this.f34394d0;
            cw cwVar = this.f34417k0;
            View view5 = this.L;
            if (i10 == 0) {
                jyVar = this.R;
                m0Var = this.M;
                view = this.E;
                view2 = view5;
            } else if (i10 == 1) {
                m0Var = this.f34398e0;
                view = this.f34420l0;
                view2 = view4;
                jyVar = cwVar;
            } else {
                jyVar = this.C0;
                m0Var = this.A0;
                view = this.f34459x0;
                view2 = view3;
            }
            if (jyVar != null) {
                iy iyVar = jyVar.f29882r;
                jyVar.d.setText("");
                if (iyVar != null) {
                    iyVar.F1(null);
                    iyVar.D1();
                }
                int i11 = this.X0;
                if (i10 == currentItem && z10) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.I0 = animatorSet2;
                    Property property = View.TRANSLATION_Y;
                    if (view != null && i10 != 1) {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, 0.0f), ObjectAnimator.ofFloat(view2, property, AndroidUtilities.dp(36.0f)), ObjectAnimator.ofFloat(jyVar, property, AndroidUtilities.dp(36.0f)));
                    } else {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(view2, property, AndroidUtilities.dp(36.0f) - i11));
                    }
                    this.I0.setDuration(200L);
                    this.I0.setInterpolator(gr.h);
                    this.I0.addListener(new ih.j3(this, m0Var, view2, 5));
                    this.I0.start();
                } else {
                    if (jyVar != cwVar) {
                        jyVar.setTranslationY(AndroidUtilities.dp(36.0f) - i11);
                    }
                    if (view != null && i10 != 2) {
                        view.setTranslationY(0.0f);
                    }
                    if (view2 == view3) {
                        i9 = 0;
                        view2.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f) + this.f34423m2);
                    } else {
                        i9 = 0;
                        if (view2 == view4) {
                            view2.setPadding(0, AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(44.0f) + this.f34423m2);
                        } else {
                            if (view2 == view5) {
                                view2.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f) + this.f34423m2);
                            }
                            i9 = 0;
                        }
                    }
                    m0Var.h1(i9, i9);
                }
            }
        }
        if (!z10) {
            this.f34432p1.i(0);
        }
    }

    public void setBlurredBackgroundDrawableFactory(ig.a aVar) {
        org.telegram.ui.ActionBar.b6 b6Var = this.V1;
        View view = this.f34458x;
        if (view != null) {
            kg.d c10 = aVar.c(view, null, false);
            c10.n(mg.c.d(b6Var));
            c10.p(AndroidUtilities.dp(18.0f));
            c10.o(AndroidUtilities.dp(6.0f));
            view.setBackground(c10);
        }
        View view2 = this.A;
        if (view2 != null) {
            kg.d c11 = aVar.c(view2, null, false);
            c11.n(mg.c.d(b6Var));
            c11.p(AndroidUtilities.dp(18.0f));
            c11.o(AndroidUtilities.dp(6.0f));
            view2.setBackground(c11);
        }
        View view3 = this.f34454w;
        if (view3 != null) {
            kg.d c12 = aVar.c(view3, null, false);
            c12.n(mg.c.d(b6Var));
            c12.p(AndroidUtilities.dp(18.0f));
            c12.o(AndroidUtilities.dp(6.0f));
            view3.setBackground(c12);
        }
        View view4 = this.f34462y;
        if (view4 != null) {
            kg.d c13 = aVar.c(view4, null, false);
            c13.n(mg.c.d(b6Var));
            c13.p(AndroidUtilities.dp(18.0f));
            c13.o(AndroidUtilities.dp(6.0f));
            view4.setBackground(c13);
        }
    }

    public void setBottomInset(int i9) {
        if (this.f34423m2 != i9) {
            this.f34423m2 = i9;
            j(i9, this.G);
            j(i9, this.I);
            j(AndroidUtilities.dp(44.0f) + i9, this.L);
            j(AndroidUtilities.dp(44.0f) + i9, this.f34466z0);
            j(AndroidUtilities.dp(44.0f) + i9, this.f34394d0);
            FrameLayout frameLayout = this.f34441s;
            if (frameLayout != null) {
                frameLayout.setTranslationY(-i9);
            }
            S();
            invalidate();
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        this.F1 = chatFull;
        Y(false);
    }

    public void setDelegate(wx wxVar) {
        this.f34432p1 = wxVar;
    }

    public void setDragListener(cx cxVar) {
        this.K0 = cxVar;
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        iw iwVar = this.C0;
        if (iwVar != null) {
            iwVar.d.setEnabled(z10);
        }
        cw cwVar = this.f34417k0;
        if (cwVar != null) {
            cwVar.d.setEnabled(z10);
        }
        wv wvVar = this.R;
        if (wvVar != null) {
            wvVar.d.setEnabled(z10);
        }
    }

    public void setForseMultiwindowLayout(boolean z10) {
        this.J1 = z10;
    }

    public void setShouldDrawBackground(boolean z10) {
        if (this.f34434q0 != z10) {
            this.f34434q0 = z10;
            T();
        }
    }

    public void setShowing(boolean z10) {
        this.L0 = z10;
        Z();
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        Z();
        S();
    }

    @Override
    public void setVisibility(int i9) {
        boolean z10;
        if (getVisibility() != i9) {
            z10 = true;
        } else {
            z10 = false;
        }
        super.setVisibility(i9);
        if (z10) {
            if (i9 != 8) {
                Emoji.sortEmoji();
                this.N.F(false);
                int i10 = this.Y0;
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.stickersDidLoad);
                if (this.f34448u0 != null) {
                    NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.recentDocumentsDidLoad);
                    Y(false);
                    F();
                }
                k(true);
                k(false);
                MediaDataController.getInstance(i10).loadRecents(0, true, true, false);
                MediaDataController.getInstance(i10).loadRecents(0, false, true, false);
                MediaDataController.getInstance(i10).loadRecents(2, false, true, false);
            }
            of.b1 b1Var = this.P0;
            if (b1Var != null) {
                b1Var.a();
            }
        }
    }

    public final void t(boolean z10) {
        s(-1L, z10);
    }

    public final void u(boolean z10) {
        ny nyVar;
        boolean z11 = this.J2;
        this.J2 = z10;
        if (z11 && !z10) {
            int i9 = this.f34456w1;
            if (i9 == 0) {
                fx fxVar = this.N;
                if (fxVar != null) {
                    fxVar.F(false);
                }
            } else if (i9 == 1) {
                ay ayVar = this.f34414j0;
                if (ayVar != null) {
                    ayVar.l();
                }
            } else if (i9 == 2 && (nyVar = this.f34448u0) != null) {
                nyVar.l();
            }
        }
    }

    public final int v(float f10) {
        return i0.a.k(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Wk, this.V1), (int) (f10 * 255.0f));
    }

    public final f2.y w(int i9) {
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 == 2) {
                    return this.f34398e0;
                }
                throw new IllegalArgumentException(j3.r0.l(i9, "Unexpected argument: "));
            }
            return this.M;
        }
        return this.A0;
    }

    public final wk0 x(int i9) {
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 == 2) {
                    return this.f34394d0;
                }
                throw new IllegalArgumentException(j3.r0.l(i9, "Unexpected argument: "));
            }
            return this.L;
        }
        return this.f34466z0;
    }

    public final HorizontalScrollView y(int i9) {
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 == 2) {
                    return this.f34420l0;
                }
                throw new IllegalArgumentException(j3.r0.l(i9, "Unexpected argument: "));
            }
            return this.E;
        }
        return this.f34459x0;
    }

    public final int z(int i9) {
        org.telegram.ui.ActionBar.b6 b6Var = this.V1;
        if (b6Var != null) {
            return b6Var.N0(i9);
        }
        return org.telegram.ui.ActionBar.f6.w0(null, i9, false);
    }

    @Override
    public final void B(float f10, int i9) {
    }
}
