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
import org.telegram.ui.ra1;

public class yy extends FrameLayout implements ud.b, NotificationCenter.NotificationCenterDelegate, yg.a {
    public static final int K2 = 0;
    public final ImageView A;
    public final fw A0;
    public int A1;
    public int A2;
    public AnimatorSet B;
    public wy B0;
    public int B1;
    public long B2;
    public AnimatorSet C;
    public final hw C0;
    public int C1;
    public final ud.a C2;
    public float D;
    public final wg.d D0;
    public int D1;
    public ArrayList D2;
    public final uv E;
    public boolean E0;
    public int E1;
    public boolean E2;
    public final vw F;
    public boolean F0;
    public TLRPC.ChatFull F1;
    public AnimatorSet F2;
    public final vf.g G;
    public boolean G0;
    public boolean G1;
    public org.telegram.messenger.video.k G2;
    public final wg.b H;
    public final qx H0;
    public int H1;
    public final nv H2;
    public final vf.g I;
    public AnimatorSet I0;
    public final gf.p0 I1;
    public boolean I2;
    public final wg.b J;
    public final cg.q J0;
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
    public final gx N;
    public final ObjectAnimator[] N0;
    public gy N1;
    public final wx O;
    public boolean O0;
    public float O1;
    public wy P;
    public ow P0;
    public float P1;
    public final wg.d Q;
    public boolean Q0;
    public float Q1;
    public final vv R;
    public boolean R0;
    public float R1;
    public AnimatorSet S;
    public String[] S0;
    public float S1;
    public final c2.x T;
    public final Drawable[] T0;
    public boolean T1;
    public final c2.x U;
    public final Drawable[] U0;
    public final org.telegram.ui.ActionBar.n2 U1;
    public boolean V;
    public final Drawable[] V0;
    public final org.telegram.ui.ActionBar.c6 V1;
    public final boolean W;
    public final String[] W0;
    public final org.telegram.ui.ActionBar.r5 W1;
    public final int X0;
    public final org.telegram.ui.ActionBar.r5 X1;
    public final int Y0;
    public final boolean Y1;
    public final ArrayList Z0;
    public LongSparseArray Z1;

    public final ud.a f34976a;

    public boolean f34977a0;

    public int f34978a1;
    public PorterDuffColorFilter a2;

    public final ud.a f34979b;

    public boolean f34980b0;

    public int f34981b1;

    public final m.i3 f34982b2;

    public int f34983c;

    public final xv f34984c0;

    public boolean f34985c1;

    public final pw f34986c2;
    public final ArrayList d;

    public final yv f34987d0;

    public TLRPC.TL_messages_stickerSet f34988d1;

    public boolean f34989d2;

    public final ArrayList f34990e;

    public final dy f34991e0;

    public ArrayList f34992e1;

    public final boolean f34993e2;

    public boolean f34994f;

    public final cy f34995f0;

    public ArrayList f34996f1;

    public final jg.e f34997f2;

    public final fy f34998g0;

    public ArrayList f34999g1;

    public final wg f35000g2;
    public final kw h;

    public final HashMap f35001h0;

    public ArrayList f35002h1;

    public final og.d f35003h2;

    public final sv f35004i0;

    public final ArrayList f35005i1;

    public final og.c f35006i2;

    public final cy f35007j0;

    public final ArrayList f35008j1;

    public final jg.a f35009j2;

    public final bw f35010k0;

    public final ArrayList f35011k1;

    public boolean f35012k2;

    public final dx f35013l0;
    public final ArrayList l1;

    public boolean f35014l2;
    public boolean m0;

    public final ArrayList f35015m1;

    public int f35016m2;

    public final FrameLayout f35017n;

    public int f35018n0;

    public final HashMap f35019n1;

    public float f35020n2;

    public int f35021o0;

    public final Paint f35022o1;

    public View f35023o2;

    public int f35024p0;

    public xx f35025p1;

    public int f35026p2;

    public boolean f35027q0;

    public long f35028q1;

    public int f35029q2;

    public final FrameLayout f35030r;

    public boolean f35031r0;

    public boolean f35032r1;

    public long f35033r2;

    public final FrameLayout f35034s;

    public boolean f35035s0;

    public boolean f35036s1;

    public boolean f35037s2;

    public final cw f35038t0;

    public final TLRPC.StickerSetCovered[] f35039t1;

    public boolean f35040t2;

    public final py f35041u0;

    public final LongSparseArray f35042u1;

    public final Rect f35043u2;
    public final View v;

    public final ty f35044v0;

    public final LongSparseArray f35045v1;

    public final RectF f35046v2;

    public final oc0 f35047w;

    public final sv f35048w0;

    public int f35049w1;

    public final ArrayList f35050w2;

    public final lw f35051x;

    public final iw f35052x0;

    public final hu f35053x1;

    public final GradientDrawable f35054x2;

    public final ImageView f35055y;

    public final jw f35056y0;

    public final int f35057y1;

    public int f35058y2;

    public final ew f35059z0;

    public final int[] f35060z1;

    public ArrayList f35061z2;

    public yy(org.telegram.ui.ActionBar.n2 n2Var, boolean z10, boolean z11, boolean z12, Context context, boolean z13, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z14, final org.telegram.ui.ActionBar.c6 c6Var, boolean z15, boolean z16) {
        ViewGroup viewGroup2;
        nv nvVar;
        boolean z17;
        Field declaredField;
        super(context);
        er erVar = er.h;
        this.f34976a = new ud.a(0, this, erVar, 320L, false);
        this.f34979b = new ud.a(1, this, erVar, 320L, false);
        this.f34983c = 2;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.f34990e = new ArrayList();
        this.V = true;
        this.f34998g0 = new fy(this);
        this.f35001h0 = new HashMap();
        this.m0 = true;
        this.f35018n0 = -2;
        this.f35021o0 = -2;
        this.f35024p0 = -2;
        this.f35027q0 = true;
        this.f35035s0 = true;
        this.E0 = true;
        this.M0 = new int[3];
        this.N0 = new ObjectAnimator[3];
        int i10 = UserConfig.selectedAccount;
        this.Y0 = i10;
        this.Z0 = new ArrayList();
        this.f34992e1 = new ArrayList();
        this.f34996f1 = new ArrayList();
        this.f34999g1 = new ArrayList();
        this.f35002h1 = new ArrayList();
        this.f35005i1 = new ArrayList();
        this.f35008j1 = new ArrayList();
        new ArrayList();
        this.f35011k1 = new ArrayList();
        this.l1 = new ArrayList();
        this.f35015m1 = new ArrayList();
        this.f35019n1 = new HashMap();
        this.f35039t1 = new TLRPC.StickerSetCovered[10];
        this.f35042u1 = new LongSparseArray();
        this.f35045v1 = new LongSparseArray();
        this.f35060z1 = new int[2];
        this.B1 = -2;
        this.C1 = -2;
        this.D1 = -2;
        this.E1 = -2;
        this.H1 = -1;
        this.f34982b2 = new m.i3(this, 18);
        this.f34986c2 = new pw(this);
        this.f34989d2 = true;
        this.f35020n2 = -1.0f;
        this.f35026p2 = -1;
        this.f35029q2 = -1;
        this.f35033r2 = -1L;
        this.f35037s2 = false;
        this.f35040t2 = true;
        this.f35043u2 = new Rect();
        RectF rectF = new RectF();
        this.f35046v2 = rectF;
        ArrayList arrayList2 = new ArrayList(1);
        this.f35050w2 = arrayList2;
        arrayList2.add(rectF);
        new Paint(1);
        this.f35054x2 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.C2 = new ud.a(0, new qv(this, 1), erVar, 380L, true);
        this.H2 = new nv(this, 2);
        this.I2 = false;
        this.f35027q0 = z14;
        this.U1 = n2Var;
        this.Y1 = z10;
        this.V1 = c6Var;
        this.f34993e2 = z16;
        og.c cVar = new og.c();
        this.f35006i2 = cVar;
        cVar.a(B(org.telegram.ui.ActionBar.g6.f23053d6));
        if (z15) {
            v(true);
        }
        i0.b.k(B(org.telegram.ui.ActionBar.g6.Wk), 30);
        int iDp = AndroidUtilities.dp(50.0f);
        this.X0 = iDp;
        this.W = z13;
        this.T0 = new Drawable[]{org.telegram.ui.ActionBar.g6.U(context, R.drawable.smiles_tab_smiles, z16 ? w(0.4f) : B(org.telegram.ui.ActionBar.g6.Re), z16 ? w(0.8f) : B(org.telegram.ui.ActionBar.g6.Oe)), org.telegram.ui.ActionBar.g6.U(context, R.drawable.smiles_tab_gif, z16 ? w(0.4f) : B(org.telegram.ui.ActionBar.g6.Re), z16 ? w(0.8f) : B(org.telegram.ui.ActionBar.g6.Oe)), org.telegram.ui.ActionBar.g6.U(context, R.drawable.smiles_tab_stickers, z16 ? w(0.4f) : B(org.telegram.ui.ActionBar.g6.Re), z16 ? w(0.8f) : B(org.telegram.ui.ActionBar.g6.Oe))};
        org.telegram.ui.ActionBar.r5 r5VarU = org.telegram.ui.ActionBar.g6.U(context, R.drawable.msg_emoji_recent, z16 ? w(0.4f) : B(org.telegram.ui.ActionBar.g6.Me), z16 ? w(0.8f) : B(org.telegram.ui.ActionBar.g6.Oe));
        org.telegram.ui.ActionBar.r5 r5VarU2 = org.telegram.ui.ActionBar.g6.U(context, R.drawable.emoji_tabs_faves, z16 ? w(0.4f) : B(org.telegram.ui.ActionBar.g6.Me), z16 ? w(0.8f) : B(org.telegram.ui.ActionBar.g6.Oe));
        org.telegram.ui.ActionBar.r5 r5VarU3 = org.telegram.ui.ActionBar.g6.U(context, R.drawable.emoji_tabs_new3, z16 ? w(0.4f) : B(org.telegram.ui.ActionBar.g6.Me), z16 ? w(0.8f) : B(org.telegram.ui.ActionBar.g6.Oe));
        org.telegram.ui.ActionBar.r5 r5VarU4 = org.telegram.ui.ActionBar.g6.U(context, R.drawable.emoji_tabs_new1, z16 ? w(0.4f) : B(org.telegram.ui.ActionBar.g6.Me), z16 ? w(0.8f) : B(org.telegram.ui.ActionBar.g6.Oe));
        this.W1 = r5VarU4;
        int i11 = R.drawable.emoji_tabs_new2;
        int i12 = org.telegram.ui.ActionBar.g6.Qe;
        org.telegram.ui.ActionBar.r5 r5VarU5 = org.telegram.ui.ActionBar.g6.U(context, i11, B(i12), B(i12));
        this.X1 = r5VarU5;
        this.U0 = new Drawable[]{r5VarU, r5VarU2, r5VarU3, new LayerDrawable(new Drawable[]{r5VarU4, r5VarU5})};
        this.V0 = new Drawable[]{org.telegram.ui.ActionBar.g6.U(context, R.drawable.msg_emoji_recent, z16 ? w(0.4f) : B(org.telegram.ui.ActionBar.g6.Me), z16 ? w(0.8f) : B(org.telegram.ui.ActionBar.g6.Oe)), org.telegram.ui.ActionBar.g6.U(context, R.drawable.stickers_gifs_trending, z16 ? w(0.4f) : B(org.telegram.ui.ActionBar.g6.Me), z16 ? w(0.8f) : B(org.telegram.ui.ActionBar.g6.Oe))};
        this.W0 = new String[]{LocaleController.getString(R.string.Emoji1), LocaleController.getString(R.string.Emoji2), LocaleController.getString(R.string.Emoji3), LocaleController.getString(R.string.Emoji4), LocaleController.getString(R.string.Emoji5), LocaleController.getString(R.string.Emoji6), LocaleController.getString(R.string.Emoji7), LocaleController.getString(R.string.Emoji8)};
        this.F1 = chatFull;
        Paint paint = new Paint(1);
        this.f35022o1 = paint;
        paint.setColor(B(org.telegram.ui.ActionBar.g6.f23007af));
        float fDp = AndroidUtilities.dp(6.0f);
        cg.l1 l1Var = gf.r0.f7054a;
        this.I1 = new gf.p0(fDp);
        vw vwVar = new vw(this, context);
        this.F = vwVar;
        uy uyVar = new uy();
        uyVar.f33222a = 0;
        uyVar.f33223b = vwVar;
        arrayList.add(uyVar);
        if (z10) {
            MediaDataController.getInstance(i10).checkStickers(5);
            MediaDataController.getInstance(i10).checkFeaturedEmoji();
            this.a2 = new PorterDuffColorFilter(B(org.telegram.ui.ActionBar.g6.Oh), PorterDuff.Mode.SRC_IN);
        }
        ww wwVar = new ww(this, context);
        this.L = wwVar;
        f2.l lVar = new f2.l();
        lVar.f5842c = 220L;
        lVar.f5843e = 220L;
        lVar.f5844f = 160L;
        lVar.f5845g = 160L;
        lVar.f5846i = er.f28123g;
        wwVar.setItemAnimator(lVar);
        final int i13 = 0;
        wwVar.setOnTouchListener(new View.OnTouchListener(this) {

            public final yy f31668b;

            {
                this.f31668b = this;
            }

            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                switch (i13) {
                    case 0:
                        org.telegram.ui.kt ktVarQ = org.telegram.ui.kt.q();
                        yy yyVar = this.f31668b;
                        ww wwVar2 = yyVar.L;
                        yyVar.getMeasuredHeight();
                        return ktVarQ.s(motionEvent, wwVar2, null, yyVar.f34986c2, c6Var);
                    case 1:
                        org.telegram.ui.kt ktVarQ2 = org.telegram.ui.kt.q();
                        yy yyVar2 = this.f31668b;
                        return ktVarQ2.s(motionEvent, yyVar2.f34987d0, yyVar2.f35004i0, yyVar2.f34986c2, c6Var);
                    default:
                        org.telegram.ui.kt ktVarQ3 = org.telegram.ui.kt.q();
                        yy yyVar3 = this.f31668b;
                        ew ewVar = yyVar3.f35059z0;
                        yyVar3.getMeasuredHeight();
                        return ktVarQ3.s(motionEvent, ewVar, yyVar3.f35048w0, yyVar3.f34986c2, c6Var);
                }
            }
        });
        wwVar.setOnItemLongClickListener(new qv(this, i13));
        wwVar.setInstantClick(true);
        xw xwVar = new xw(this);
        this.M = xwVar;
        wwVar.setLayoutManager(xwVar);
        wwVar.setTopGlowOffset(AndroidUtilities.dp(38.0f));
        wwVar.setBottomGlowOffset(AndroidUtilities.dp(36.0f));
        wwVar.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f));
        int i14 = org.telegram.ui.ActionBar.g6.He;
        wwVar.setGlowColor(B(i14));
        wwVar.setItemSelectorColorProvider(new c2(21));
        wwVar.setClipToPadding(false);
        xwVar.O = new yw(this);
        gx gxVar = new gx(this);
        this.N = gxVar;
        wwVar.setAdapter(gxVar);
        wwVar.i(new cg.h2(this, 4));
        this.O = new wx(this, context);
        vwVar.addView(wwVar, h7.z5.c(-1.0f, -1));
        c2.x xVar = new c2.x(wwVar, xwVar);
        this.U = xVar;
        xVar.f2372i = new zw(this);
        wwVar.setOnScrollListener(new ax(this));
        if (n2Var != null) {
            nvVar = new nv(this, 5);
            viewGroup2 = vwVar;
        } else {
            viewGroup2 = vwVar;
            nvVar = null;
        }
        uv uvVar = new uv(this, r11, c6Var, z10, nvVar, z16);
        this.E = uvVar;
        if (z13) {
            vv vvVar = new vv(this, r11);
            this.R = vvVar;
            viewGroup2.addView(vvVar, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + iDp));
            vvVar.d.setOnFocusChangeListener(new wv(this));
            wg.d dVar = new wg.d(context, c6Var);
            this.Q = dVar;
            dVar.setVisibility(8);
            final int i15 = 0;
            dVar.setOnBackClickListener(new View.OnClickListener(this) {

                public final yy f32266b;

                {
                    this.f32266b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i15) {
                        case 0:
                            wx wxVar = this.f32266b.O;
                            rx rxVar = wxVar.f34354c;
                            int childCount = rxVar.getChildCount();
                            for (int i16 = 0; i16 < childCount; i16++) {
                                ((wg.c) rxVar.getChildAt(i16)).a(false, true);
                            }
                            wxVar.d = 0L;
                            wxVar.B.f34979b.a(false, true);
                            wxVar.l();
                            break;
                        case 1:
                            ty tyVar = this.f32266b.f35044v0;
                            sy syVar = tyVar.f32906c;
                            int childCount2 = syVar.getChildCount();
                            for (int i17 = 0; i17 < childCount2; i17++) {
                                ((wg.c) syVar.getChildAt(i17)).a(false, true);
                            }
                            tyVar.d = 0L;
                            tyVar.M.f34976a.a(false, true);
                            tyVar.l();
                            break;
                        case 2:
                            xx xxVar = this.f32266b.f35025p1;
                            if (xxVar != null) {
                                xxVar.w();
                            }
                            break;
                        default:
                            yy yyVar = this.f32266b;
                            int currentItem = yyVar.h.getCurrentItem();
                            ky kyVar = currentItem == 0 ? yyVar.R : currentItem == 1 ? yyVar.f35010k0 : yyVar.C0;
                            if (kyVar != null) {
                                wp wpVar = kyVar.d;
                                wpVar.requestFocus();
                                MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                wpVar.onTouchEvent(motionEventObtain);
                                motionEventObtain.recycle();
                                MotionEvent motionEventObtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                wpVar.onTouchEvent(motionEventObtain2);
                                motionEventObtain2.recycle();
                                break;
                            }
                            break;
                    }
                }
            });
            viewGroup2.addView(dVar, new FrameLayout.LayoutParams(-1, iDp));
        }
        int iB = B(i14);
        if (Color.alpha(iB) >= 255) {
            uvVar.setBackgroundColor(iB);
        }
        gxVar.G(true);
        uvVar.p(getEmojipacks());
        viewGroup2.addView(uvVar, h7.z5.c(36.0f, -1));
        View view = new View(r11);
        this.K = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        int i16 = org.telegram.ui.ActionBar.g6.Ke;
        view.setBackgroundColor(B(i16));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(36.0f);
        viewGroup2.addView(view, layoutParams);
        wg.b bVar = new wg.b(r11, c6Var);
        this.H = bVar;
        vf.g gVar = new vf.g((Context) r11, c6Var);
        this.G = gVar;
        gVar.setVisibility(8);
        gVar.addView(bVar, h7.z5.d(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
        viewGroup2.addView(gVar, h7.z5.e(-1, -2, 80));
        if (z11) {
            ul0 ul0Var = ul0.f33121b;
            if (z12) {
                xv xvVar = new xv(this, r11);
                this.f34984c0 = xvVar;
                uy uyVar2 = new uy();
                uyVar2.f33222a = 1;
                uyVar2.f33223b = xvVar;
                this.d.add(uyVar2);
                yv yvVar = new yv(this, r11);
                this.f34987d0 = yvVar;
                yvVar.setClipToPadding(false);
                dy dyVar = new dy(this);
                this.f34991e0 = dyVar;
                yvVar.setLayoutManager(dyVar);
                yvVar.i(new zv(this));
                yvVar.setPadding(0, iDp, 0, AndroidUtilities.dp(44.0f) + this.f35016m2);
                yvVar.setOverScrollMode(2);
                ((f2.r1) yvVar.getItemAnimator()).f5819m = false;
                cy cyVar = new cy(this, r11, true, Integer.MAX_VALUE);
                this.f35007j0 = cyVar;
                yvVar.setAdapter(cyVar);
                this.f34995f0 = new cy(this, r11, false, 0);
                yvVar.setOnScrollListener(new aw(this));
                final int i17 = 1;
                yvVar.setOnTouchListener(new View.OnTouchListener(this) {

                    public final yy f31668b;

                    {
                        this.f31668b = this;
                    }

                    @Override
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        switch (i17) {
                            case 0:
                                org.telegram.ui.kt ktVarQ = org.telegram.ui.kt.q();
                                yy yyVar = this.f31668b;
                                ww wwVar2 = yyVar.L;
                                yyVar.getMeasuredHeight();
                                return ktVarQ.s(motionEvent, wwVar2, null, yyVar.f34986c2, c6Var);
                            case 1:
                                org.telegram.ui.kt ktVarQ2 = org.telegram.ui.kt.q();
                                yy yyVar2 = this.f31668b;
                                return ktVarQ2.s(motionEvent, yyVar2.f34987d0, yyVar2.f35004i0, yyVar2.f34986c2, c6Var);
                            default:
                                org.telegram.ui.kt ktVarQ3 = org.telegram.ui.kt.q();
                                yy yyVar3 = this.f31668b;
                                ew ewVar = yyVar3.f35059z0;
                                yyVar3.getMeasuredHeight();
                                return ktVarQ3.s(motionEvent, ewVar, yyVar3.f35048w0, yyVar3.f34986c2, c6Var);
                        }
                    }
                });
                final int i18 = 0;
                ?? r11 = new pk0(this) {

                    public final yy f32582b;

                    {
                        this.f32582b = this;
                    }

                    @Override
                    public final void a(int i19, View view2) {
                        switch (i18) {
                            case 0:
                                yy yyVar = this.f32582b;
                                yv yvVar2 = yyVar.f34987d0;
                                cy cyVar2 = yyVar.f34995f0;
                                cy cyVar3 = yyVar.f35007j0;
                                if (yyVar.f35025p1 != null) {
                                    cyVar3.getClass();
                                    ArrayList arrayList3 = cyVar3.f27569x;
                                    if (yvVar2.getAdapter() != cyVar3) {
                                        if (yvVar2.getAdapter() == cyVar2 && i19 >= 0 && i19 < cyVar2.f27569x.size()) {
                                            yyVar.f35025p1.v(view2, cyVar2.f27569x.get(i19), cyVar2.f27568w, cyVar2.f27565n, true, 0, 0);
                                            yyVar.Y();
                                            break;
                                        }
                                    } else if (i19 >= 0) {
                                        int i20 = cyVar3.D;
                                        if (i19 >= i20) {
                                            int i21 = i20 > 0 ? (i19 - i20) - 1 : i19;
                                            if (i21 >= 0 && i21 < arrayList3.size()) {
                                                yyVar.f35025p1.v(view2, arrayList3.get(i21), null, cyVar3.f27565n, true, 0, 0);
                                                break;
                                            }
                                        } else {
                                            yyVar.f35025p1.v(view2, yyVar.f34992e1.get(i19), null, "gif", true, 0, 0);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                yy yyVar2 = this.f32582b;
                                f2.q0 adapter = yyVar2.f35059z0.getAdapter();
                                ty tyVar = yyVar2.f35044v0;
                                String str = adapter == tyVar ? tyVar.J : null;
                                if (view2 instanceof org.telegram.ui.Cells.a8) {
                                    org.telegram.ui.Cells.a8 a8Var = (org.telegram.ui.Cells.a8) view2;
                                    if (a8Var.getSticker() != null && MessageObject.isPremiumSticker(a8Var.getSticker()) && !AccountInstance.getInstance(yyVar2.Y0).getUserConfig().isPremium()) {
                                        org.telegram.ui.kt.q().y(a8Var);
                                        break;
                                    } else {
                                        org.telegram.ui.kt.q().u();
                                        if (!a8Var.f24075r) {
                                            a8Var.f24075r = true;
                                            a8Var.f24074n = 0.5f;
                                            a8Var.f24078x = 0L;
                                            org.telegram.ui.Cells.z7 z7Var = a8Var.f24069a;
                                            z7Var.setAlpha(0.5f * a8Var.D);
                                            z7Var.invalidate();
                                            a8Var.f24076s = System.currentTimeMillis();
                                            a8Var.invalidate();
                                            yyVar2.f35025p1.m(a8Var, a8Var.getSticker(), str, a8Var.getParentObject(), a8Var.getSendAnimationData(), true, 0);
                                            break;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                };
                this.f35004i0 = r11;
                yvVar.setOnItemClickListener((pk0) r11);
                xvVar.addView(yvVar, h7.z5.c(-1.0f, -1));
                bw bwVar = new bw(this, r11);
                this.f35010k0 = bwVar;
                xvVar.addView(bwVar, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + iDp));
                dx dxVar = new dx(this, r11, c6Var);
                this.f35013l0 = dxVar;
                dxVar.setType(ul0Var);
                dxVar.setUnderlineHeight(AndroidUtilities.getShadowHeight());
                dxVar.setIndicatorColor(B(i12));
                dxVar.setUnderlineColor(B(i16));
                dxVar.setBackgroundColor(B(i14));
                X();
                dxVar.setDelegate(new qv(this, 2));
                cyVar.F("", "", true, true, true);
            }
            cw cwVar = new cw(this, r11, z14);
            this.f35038t0 = cwVar;
            MediaDataController.getInstance(this.Y0).checkStickers(0);
            MediaDataController.getInstance(this.Y0).checkFeaturedStickers();
            ew ewVar = new ew(this, r11);
            this.f35059z0 = ewVar;
            fw fwVar = new fw(this);
            this.A0 = fwVar;
            ewVar.setLayoutManager(fwVar);
            fwVar.O = new gw(this);
            ewVar.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f));
            ewVar.setClipToPadding(false);
            uy uyVar3 = new uy();
            uyVar3.f33222a = 2;
            uyVar3.f33223b = cwVar;
            this.d.add(uyVar3);
            this.f35044v0 = new ty(this, r11);
            py pyVar = new py(this, r11);
            this.f35041u0 = pyVar;
            ewVar.setAdapter(pyVar);
            final int i19 = 2;
            ewVar.setOnTouchListener(new View.OnTouchListener(this) {

                public final yy f31668b;

                {
                    this.f31668b = this;
                }

                @Override
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    switch (i19) {
                        case 0:
                            org.telegram.ui.kt ktVarQ = org.telegram.ui.kt.q();
                            yy yyVar = this.f31668b;
                            ww wwVar2 = yyVar.L;
                            yyVar.getMeasuredHeight();
                            return ktVarQ.s(motionEvent, wwVar2, null, yyVar.f34986c2, c6Var);
                        case 1:
                            org.telegram.ui.kt ktVarQ2 = org.telegram.ui.kt.q();
                            yy yyVar2 = this.f31668b;
                            return ktVarQ2.s(motionEvent, yyVar2.f34987d0, yyVar2.f35004i0, yyVar2.f34986c2, c6Var);
                        default:
                            org.telegram.ui.kt ktVarQ3 = org.telegram.ui.kt.q();
                            yy yyVar3 = this.f31668b;
                            ew ewVar2 = yyVar3.f35059z0;
                            yyVar3.getMeasuredHeight();
                            return ktVarQ3.s(motionEvent, ewVar2, yyVar3.f35048w0, yyVar3.f34986c2, c6Var);
                    }
                }
            });
            final int i20 = 1;
            ?? r10 = new pk0(this) {

                public final yy f32582b;

                {
                    this.f32582b = this;
                }

                @Override
                public final void a(int i110, View view2) {
                    switch (i20) {
                        case 0:
                            yy yyVar = this.f32582b;
                            yv yvVar2 = yyVar.f34987d0;
                            cy cyVar2 = yyVar.f34995f0;
                            cy cyVar3 = yyVar.f35007j0;
                            if (yyVar.f35025p1 != null) {
                                cyVar3.getClass();
                                ArrayList arrayList3 = cyVar3.f27569x;
                                if (yvVar2.getAdapter() != cyVar3) {
                                    if (yvVar2.getAdapter() == cyVar2 && i110 >= 0 && i110 < cyVar2.f27569x.size()) {
                                        yyVar.f35025p1.v(view2, cyVar2.f27569x.get(i110), cyVar2.f27568w, cyVar2.f27565n, true, 0, 0);
                                        yyVar.Y();
                                        break;
                                    }
                                } else if (i110 >= 0) {
                                    int i21 = cyVar3.D;
                                    if (i110 >= i21) {
                                        int i22 = i21 > 0 ? (i110 - i21) - 1 : i110;
                                        if (i22 >= 0 && i22 < arrayList3.size()) {
                                            yyVar.f35025p1.v(view2, arrayList3.get(i22), null, cyVar3.f27565n, true, 0, 0);
                                            break;
                                        }
                                    } else {
                                        yyVar.f35025p1.v(view2, yyVar.f34992e1.get(i110), null, "gif", true, 0, 0);
                                        break;
                                    }
                                }
                            }
                            break;
                        default:
                            yy yyVar2 = this.f32582b;
                            f2.q0 adapter = yyVar2.f35059z0.getAdapter();
                            ty tyVar = yyVar2.f35044v0;
                            String str = adapter == tyVar ? tyVar.J : null;
                            if (view2 instanceof org.telegram.ui.Cells.a8) {
                                org.telegram.ui.Cells.a8 a8Var = (org.telegram.ui.Cells.a8) view2;
                                if (a8Var.getSticker() != null && MessageObject.isPremiumSticker(a8Var.getSticker()) && !AccountInstance.getInstance(yyVar2.Y0).getUserConfig().isPremium()) {
                                    org.telegram.ui.kt.q().y(a8Var);
                                    break;
                                } else {
                                    org.telegram.ui.kt.q().u();
                                    if (!a8Var.f24075r) {
                                        a8Var.f24075r = true;
                                        a8Var.f24074n = 0.5f;
                                        a8Var.f24078x = 0L;
                                        org.telegram.ui.Cells.z7 z7Var = a8Var.f24069a;
                                        z7Var.setAlpha(0.5f * a8Var.D);
                                        z7Var.invalidate();
                                        a8Var.f24076s = System.currentTimeMillis();
                                        a8Var.invalidate();
                                        yyVar2.f35025p1.m(a8Var, a8Var.getSticker(), str, a8Var.getParentObject(), a8Var.getSendAnimationData(), true, 0);
                                        break;
                                    }
                                }
                            }
                            break;
                    }
                }
            };
            this.f35048w0 = r10;
            ewVar.setOnItemClickListener((pk0) r10);
            ewVar.setGlowColor(B(i14));
            cwVar.addView(ewVar);
            this.T = new c2.x(ewVar, fwVar);
            hw hwVar = new hw(this, r11);
            this.C0 = hwVar;
            cwVar.addView(hwVar, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + iDp));
            wg.d dVar2 = new wg.d(r11, c6Var);
            this.D0 = dVar2;
            dVar2.setVisibility(8);
            final int i21 = 1;
            dVar2.setOnBackClickListener(new View.OnClickListener(this) {

                public final yy f32266b;

                {
                    this.f32266b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (i21) {
                        case 0:
                            wx wxVar = this.f32266b.O;
                            rx rxVar = wxVar.f34354c;
                            int childCount = rxVar.getChildCount();
                            for (int i110 = 0; i110 < childCount; i110++) {
                                ((wg.c) rxVar.getChildAt(i110)).a(false, true);
                            }
                            wxVar.d = 0L;
                            wxVar.B.f34979b.a(false, true);
                            wxVar.l();
                            break;
                        case 1:
                            ty tyVar = this.f32266b.f35044v0;
                            sy syVar = tyVar.f32906c;
                            int childCount2 = syVar.getChildCount();
                            for (int i111 = 0; i111 < childCount2; i111++) {
                                ((wg.c) syVar.getChildAt(i111)).a(false, true);
                            }
                            tyVar.d = 0L;
                            tyVar.M.f34976a.a(false, true);
                            tyVar.l();
                            break;
                        case 2:
                            xx xxVar = this.f32266b.f35025p1;
                            if (xxVar != null) {
                                xxVar.w();
                            }
                            break;
                        default:
                            yy yyVar = this.f32266b;
                            int currentItem = yyVar.h.getCurrentItem();
                            ky kyVar = currentItem == 0 ? yyVar.R : currentItem == 1 ? yyVar.f35010k0 : yyVar.C0;
                            if (kyVar != null) {
                                wp wpVar = kyVar.d;
                                wpVar.requestFocus();
                                MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                wpVar.onTouchEvent(motionEventObtain);
                                motionEventObtain.recycle();
                                MotionEvent motionEventObtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                wpVar.onTouchEvent(motionEventObtain2);
                                motionEventObtain2.recycle();
                                break;
                            }
                            break;
                    }
                }
            });
            cwVar.addView(dVar2, new FrameLayout.LayoutParams(-1, iDp));
            z17 = z14;
            iw iwVar = new iw(this, r11, c6Var, n2Var, z17);
            this.f35052x0 = iwVar;
            iwVar.setDragEnabled(true);
            iwVar.setWillNotDraw(false);
            iwVar.setType(ul0Var);
            iwVar.setUnderlineHeight(ewVar.canScrollVertically(-1) ? AndroidUtilities.getShadowHeight() : 0);
            iwVar.setIndicatorColor(B(i12));
            iwVar.setUnderlineColor(B(i16));
            if (viewGroup == null || !z17) {
                cwVar.addView(iwVar, h7.z5.e(-1, 36, 51));
            } else {
                jw jwVar = new jw(this, r11);
                this.f35056y0 = jwVar;
                jwVar.addView(iwVar, h7.z5.e(-1, 36, 51));
                viewGroup.addView(jwVar, h7.z5.c(-2.0f, -1));
            }
            Z(true);
            iwVar.setDelegate(new qv(this, 3));
            ewVar.setOnScrollListener(new xy(this, 0));
            wg.b bVar2 = new wg.b(r11, c6Var);
            this.J = bVar2;
            vf.g gVar2 = new vf.g((Context) r11, c6Var);
            this.I = gVar2;
            gVar2.setVisibility(8);
            gVar2.addView(bVar2, h7.z5.d(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
            cwVar.addView(gVar2, h7.z5.e(-1, -2, 80));
        } else {
            z17 = z14;
        }
        this.f34990e.clear();
        this.f34990e.addAll(this.d);
        kw kwVar = new kw(this, r11);
        this.h = kwVar;
        qx qxVar = new qx(this);
        this.H0 = qxVar;
        kwVar.setAdapter(qxVar);
        lw lwVar = new lw(this, r11);
        this.f35051x = lwVar;
        lwVar.setHapticFeedbackEnabled(true);
        lwVar.setImageResource(R.drawable.smiles_tab_clear);
        int iW = z16 ? w(0.6f) : B(org.telegram.ui.ActionBar.g6.Re);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        lwVar.setColorFilter(new PorterDuffColorFilter(iW, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        lwVar.setScaleType(scaleType);
        lwVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
        lwVar.setFocusable(true);
        lwVar.setOnClickListener(new mw());
        h7.b6.a(lwVar);
        FrameLayout frameLayout = new FrameLayout(r11);
        this.f35030r = frameLayout;
        if (z13) {
            addView(frameLayout, h7.z5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, (AndroidUtilities.getShadowHeight() / AndroidUtilities.density) + 40.0f));
        } else {
            addView(frameLayout, h7.z5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        FrameLayout frameLayout2 = new FrameLayout(r11);
        this.f35034s = frameLayout2;
        addView(frameLayout2, h7.z5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 64.0f));
        FrameLayout frameLayout3 = new FrameLayout(r11);
        this.f35017n = frameLayout3;
        View view2 = new View(r11);
        this.v = view2;
        frameLayout3.addView(view2, new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(40.0f), 83));
        if (z13) {
            addView(frameLayout3, h7.z5.e(-1, 48, 80));
            frameLayout3.addView(lwVar, h7.z5.d(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
            if (z11) {
                ImageView imageView = new ImageView(r11);
                this.f35055y = imageView;
                imageView.setImageResource(R.drawable.smiles_tab_settings);
                imageView.setColorFilter(new PorterDuffColorFilter(z16 ? w(0.6f) : B(org.telegram.ui.ActionBar.g6.Re), mode));
                imageView.setScaleType(scaleType);
                imageView.setFocusable(true);
                imageView.setContentDescription(LocaleController.getString(R.string.Settings));
                h7.b6.a(imageView);
                frameLayout3.addView(imageView, h7.z5.d(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
                final int i22 = 2;
                imageView.setOnClickListener(new View.OnClickListener(this) {

                    public final yy f32266b;

                    {
                        this.f32266b = this;
                    }

                    @Override
                    public final void onClick(View view3) {
                        switch (i22) {
                            case 0:
                                wx wxVar = this.f32266b.O;
                                rx rxVar = wxVar.f34354c;
                                int childCount = rxVar.getChildCount();
                                for (int i110 = 0; i110 < childCount; i110++) {
                                    ((wg.c) rxVar.getChildAt(i110)).a(false, true);
                                }
                                wxVar.d = 0L;
                                wxVar.B.f34979b.a(false, true);
                                wxVar.l();
                                break;
                            case 1:
                                ty tyVar = this.f32266b.f35044v0;
                                sy syVar = tyVar.f32906c;
                                int childCount2 = syVar.getChildCount();
                                for (int i111 = 0; i111 < childCount2; i111++) {
                                    ((wg.c) syVar.getChildAt(i111)).a(false, true);
                                }
                                tyVar.d = 0L;
                                tyVar.M.f34976a.a(false, true);
                                tyVar.l();
                                break;
                            case 2:
                                xx xxVar = this.f32266b.f35025p1;
                                if (xxVar != null) {
                                    xxVar.w();
                                }
                                break;
                            default:
                                yy yyVar = this.f32266b;
                                int currentItem = yyVar.h.getCurrentItem();
                                ky kyVar = currentItem == 0 ? yyVar.R : currentItem == 1 ? yyVar.f35010k0 : yyVar.C0;
                                if (kyVar != null) {
                                    wp wpVar = kyVar.d;
                                    wpVar.requestFocus();
                                    MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                    wpVar.onTouchEvent(motionEventObtain);
                                    motionEventObtain.recycle();
                                    MotionEvent motionEventObtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                    wpVar.onTouchEvent(motionEventObtain2);
                                    motionEventObtain2.recycle();
                                    break;
                                }
                                break;
                        }
                    }
                });
            }
            oc0 oc0Var = new oc0(r11, c6Var);
            this.f35047w = oc0Var;
            oc0Var.setViewPager(kwVar);
            oc0Var.setShouldExpand(false);
            oc0Var.setIndicatorHeight(AndroidUtilities.dp(3.0f));
            oc0Var.setIndicatorColor(i0.b.k(B(org.telegram.ui.ActionBar.g6.Oe), 20));
            oc0Var.setUnderlineHeight(0);
            oc0Var.setTabPaddingLeftRight(AndroidUtilities.dp(11.0f));
            oc0Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f));
            frameLayout3.addView(oc0Var, h7.z5.e(-2, 48, 81));
            oc0Var.setOnPageChangeListener(new nw(this, z17));
            ImageView imageView2 = new ImageView(r11);
            this.A = imageView2;
            imageView2.setImageResource(R.drawable.smiles_tab_search);
            imageView2.setColorFilter(new PorterDuffColorFilter(z16 ? w(0.6f) : B(org.telegram.ui.ActionBar.g6.Re), mode));
            imageView2.setScaleType(scaleType);
            imageView2.setContentDescription(LocaleController.getString(R.string.Search));
            imageView2.setFocusable(true);
            imageView2.setVisibility(8);
            frameLayout3.addView(imageView2, h7.z5.d(48, 48.0f, 83, 2.0f, 0.0f, 2.0f, 0.0f));
            final int i23 = 3;
            imageView2.setOnClickListener(new View.OnClickListener(this) {

                public final yy f32266b;

                {
                    this.f32266b = this;
                }

                @Override
                public final void onClick(View view3) {
                    switch (i23) {
                        case 0:
                            wx wxVar = this.f32266b.O;
                            rx rxVar = wxVar.f34354c;
                            int childCount = rxVar.getChildCount();
                            for (int i110 = 0; i110 < childCount; i110++) {
                                ((wg.c) rxVar.getChildAt(i110)).a(false, true);
                            }
                            wxVar.d = 0L;
                            wxVar.B.f34979b.a(false, true);
                            wxVar.l();
                            break;
                        case 1:
                            ty tyVar = this.f32266b.f35044v0;
                            sy syVar = tyVar.f32906c;
                            int childCount2 = syVar.getChildCount();
                            for (int i111 = 0; i111 < childCount2; i111++) {
                                ((wg.c) syVar.getChildAt(i111)).a(false, true);
                            }
                            tyVar.d = 0L;
                            tyVar.M.f34976a.a(false, true);
                            tyVar.l();
                            break;
                        case 2:
                            xx xxVar = this.f32266b.f35025p1;
                            if (xxVar != null) {
                                xxVar.w();
                            }
                            break;
                        default:
                            yy yyVar = this.f32266b;
                            int currentItem = yyVar.h.getCurrentItem();
                            ky kyVar = currentItem == 0 ? yyVar.R : currentItem == 1 ? yyVar.f35010k0 : yyVar.C0;
                            if (kyVar != null) {
                                wp wpVar = kyVar.d;
                                wpVar.requestFocus();
                                MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                wpVar.onTouchEvent(motionEventObtain);
                                motionEventObtain.recycle();
                                MotionEvent motionEventObtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                wpVar.onTouchEvent(motionEventObtain2);
                                motionEventObtain2.recycle();
                                break;
                            }
                            break;
                    }
                }
            });
        } else {
            addView(frameLayout3, h7.z5.d(56, 48.0f, (LocaleController.isRTL ? 3 : 5) | 80, 0.0f, 0.0f, 2.0f, 0.0f));
            org.telegram.ui.Cells.z zVarH0 = org.telegram.ui.ActionBar.g6.h0(AndroidUtilities.dp(56.0f), B(i14), B(i14));
            h7.b6.a(lwVar);
            lwVar.setPadding(0, 0, AndroidUtilities.dp(2.0f), 0);
            lwVar.setBackground(zVarH0);
            lwVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
            lwVar.setFocusable(true);
            frameLayout3.addView(lwVar, h7.z5.d(48, 48.0f, 51, 2.0f, 0.0f, 2.0f, 0.0f));
            view2.setVisibility(8);
        }
        addView(kwVar, 0, h7.z5.e(-1, -1, 51));
        cg.q qVar = new cg.q(r11, 23);
        this.J0 = qVar;
        qVar.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(6.0f), B(org.telegram.ui.ActionBar.g6.f23291qf)));
        qVar.setTextColor(B(org.telegram.ui.ActionBar.g6.f23274pf));
        qVar.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f));
        qVar.setGravity(16);
        qVar.setTextSize(1, 14.0f);
        qVar.setVisibility(4);
        addView(qVar, h7.z5.d(-2, -2.0f, 81, 5.0f, 0.0f, 5.0f, 53.0f));
        this.f35057y1 = AndroidUtilities.dp(AndroidUtilities.isTablet() ? 40.0f : 32.0f);
        Field field = hu.f29099f;
        hu huVar = new hu(new gu(r11, c6Var));
        if (hu.f29099f == null) {
            try {
                declaredField = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
                try {
                    declaredField.setAccessible(true);
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                declaredField = null;
            }
            hu.f29099f = declaredField;
        }
        Field field2 = hu.f29099f;
        if (field2 != null) {
            try {
                huVar.f29101a = (ViewTreeObserver.OnScrollChangedListener) field2.get(huVar);
                hu.f29099f.set(huVar, hu.f29100g);
            } catch (Exception unused3) {
                huVar.f29101a = null;
            }
        }
        this.f35053x1 = huVar;
        huVar.f29103c.setOnSelectionUpdateListener(new d(this, 10));
        this.f35049w1 = MessagesController.getGlobalEmojiSettings().getInt("selected_page", 0);
        Emoji.loadRecentEmoji();
        gxVar.F(false);
        K(true, z11, z12, false);
        if (Build.VERSION.SDK_INT >= 31) {
            og.d dVar3 = new og.d(null);
            this.f35003h2 = dVar3;
            jg.a aVar = new jg.a(dVar3);
            this.f35009j2 = aVar;
            aVar.f12944f = LiteMode.isEnabled(262144);
            this.f34997f2 = new jg.e(false);
        } else {
            this.f35003h2 = null;
            this.f35009j2 = new jg.a(this.f35006i2);
            this.f34997f2 = null;
        }
        qg.j jVar = new qg.j(this);
        oc0 oc0Var2 = this.f35047w;
        if (oc0Var2 != null) {
            jVar.d(oc0Var2, this, new qv(this, 4), false);
        }
        jg.a aVar2 = this.f35009j2;
        aVar2.d = jVar;
        aVar2.f12943e = this;
        kg.a[] aVarArr = new kg.a[3];
        wwVar.C0(new nv(this, 1));
        aVarArr[0] = new jg.k(wwVar, this, new ov(wwVar, 0));
        yv yvVar2 = this.f34987d0;
        if (yvVar2 != null) {
            yvVar2.C0(new nv(this, 3));
            yv yvVar3 = this.f34987d0;
            Objects.requireNonNull(yvVar3);
            aVarArr[1] = new jg.k(yvVar3, this, new ov(yvVar3, 1));
        }
        ew ewVar2 = this.f35059z0;
        if (ewVar2 != null) {
            ewVar2.C0(new nv(this, 4));
            aVarArr[2] = new jg.k(this.f35059z0, this, new ov(this, 2));
        }
        this.f35000g2 = new wg(aVarArr, 1);
        setBlurredBackgroundDrawableFactory(this.f35009j2);
    }

    public static void b(yy yyVar, boolean z10) {
        yv yvVar = yyVar.f34987d0;
        if (yvVar == null) {
            return;
        }
        int childCount = yvVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = yvVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.d2) {
                ImageReceiver photoImage = ((org.telegram.ui.Cells.d2) childAt).getPhotoImage();
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

    public static void c(yy yyVar, gy gyVar, String str) {
        String str2;
        xx xxVar;
        org.telegram.ui.ActionBar.n2 n2Var = yyVar.U1;
        int i10 = yyVar.Y0;
        ArrayList arrayList = yyVar.f35015m1;
        if (gyVar == null) {
            return;
        }
        if (gyVar.getSpan() == null) {
            yyVar.B2 = SystemClock.elapsedRealtime();
            yyVar.O(true);
            String strG = str != null ? str : (String) gyVar.getTag();
            new SpannableStringBuilder().append((CharSequence) strG);
            if (str != null) {
                xx xxVar2 = yyVar.f35025p1;
                if (xxVar2 != null) {
                    xxVar2.l(Emoji.fixEmoji(str));
                    return;
                }
                return;
            }
            if (!gyVar.f28868c && (str2 = Emoji.emojiColor.get(strG)) != null) {
                strG = g(strG, str2);
            }
            yyVar.h(strG);
            xx xxVar3 = yyVar.f35025p1;
            if (xxVar3 != null) {
                xxVar3.l(Emoji.fixEmoji(strG));
                return;
            }
            return;
        }
        if (yyVar.f35025p1 != null) {
            long j10 = gyVar.getSpan().documentId;
            TLRPC.Document documentF = gyVar.getSpan().document;
            kx kxVar = gyVar.f28869e;
            boolean z10 = kxVar != null && kxVar.f30210i;
            if (documentF == null) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    kx kxVar2 = (kx) arrayList.get(i11);
                    int i12 = 0;
                    while (true) {
                        ArrayList arrayList2 = kxVar2.f30206c;
                        if (arrayList2 == null || i12 >= arrayList2.size()) {
                            break;
                        }
                        if (((TLRPC.Document) kxVar2.f30206c.get(i12)).f22386id == j10) {
                            documentF = (TLRPC.Document) kxVar2.f30206c.get(i12);
                            break;
                        }
                        i12++;
                    }
                }
            }
            if (documentF == null) {
                documentF = k5.f(i10, j10);
            }
            String strFindAnimatedEmojiEmoticon = documentF != null ? MessageObject.findAnimatedEmojiEmoticon(documentF) : null;
            if (MessageObject.isFreeEmoji(documentF) || UserConfig.getInstance(i10).isPremium() || (((xxVar = yyVar.f35025p1) != null && xxVar.g()) || yyVar.Q0 || z10)) {
                yyVar.B2 = SystemClock.elapsedRealtime();
                yyVar.O(true);
                yyVar.h("animated_" + j10);
                yyVar.f35025p1.x(j10, documentF, strFindAnimatedEmojiEmoticon, gyVar.f28868c);
                return;
            }
            yyVar.O(false);
            mc mcVarA0 = n2Var != null ? mc.a0(n2Var) : new mc(yyVar.f35030r, yyVar.V1);
            if (yyVar.f34989d2 || n2Var == null) {
                mcVarA0.q(documentF, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint)), LocaleController.getString(R.string.PremiumMore), new nv(yyVar, 7)).j();
            } else {
                mcVarA0.J(R.raw.saved_messages, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint2)), LocaleController.getString(R.string.Open), new nv(yyVar, 8)).j();
            }
            yyVar.f34989d2 = !yyVar.f34989d2;
        }
    }

    public static void e(yy yyVar, int i10, int i11) {
        f2.o1 o1VarK;
        int[] iArr = yyVar.M0;
        if (i10 == 1) {
            yyVar.n(yyVar.L, i11);
            return;
        }
        xx xxVar = yyVar.f35025p1;
        if ((xxVar == null || !xxVar.z()) && !yyVar.F0) {
            zk0 zk0VarY = yyVar.y(i10);
            if (i11 <= 0 || zk0VarY == null || zk0VarY.getVisibility() != 0 || (o1VarK = zk0VarY.K(0)) == null || o1VarK.f5789a.getTop() + yyVar.X0 < zk0VarY.getPaddingTop()) {
                int i12 = iArr[i10] - i11;
                iArr[i10] = i12;
                if (i12 > 0) {
                    iArr[i10] = 0;
                } else if (i12 < (-AndroidUtilities.dp(288.0f))) {
                    iArr[i10] = -AndroidUtilities.dp(288.0f);
                }
                if (i10 == 0) {
                    yyVar.a0();
                } else {
                    yyVar.z(i10).setTranslationY(Math.max(-AndroidUtilities.dp(48.0f), iArr[i10]));
                }
            }
        }
    }

    public static void f(yy yyVar, boolean z10) {
        int iN0;
        dy dyVar = yyVar.f34991e0;
        bw bwVar = yyVar.f35010k0;
        yv yvVar = yyVar.f34987d0;
        if (yvVar != null && (yvVar.getAdapter() instanceof cy)) {
            cy cyVar = (cy) yvVar.getAdapter();
            if (!cyVar.f27567s && cyVar.h == 0 && !cyVar.f27569x.isEmpty() && (iN0 = dyVar.N0()) != -1 && iN0 > dyVar.B() - 5) {
                String str = cyVar.f27568w;
                String str2 = cyVar.f27566r;
                boolean z11 = cyVar.v;
                cyVar.F(str, str2, true, z11, z11);
            }
        }
        xx xxVar = yyVar.f35025p1;
        if (xxVar == null || !xxVar.z()) {
            if (bwVar == null || yvVar == null) {
                return;
            }
            bwVar.f30212a.a(true, !z10);
            return;
        }
        f2.o1 o1VarK = yvVar.K(0);
        if (o1VarK == null) {
            ky.a(bwVar, true, !z10);
        } else {
            ky.a(bwVar, o1VarK.f5789a.getTop() < yvVar.getPaddingTop(), !z10);
        }
    }

    public static String g(String str, String str2) {
        boolean z10;
        String strSubstring;
        if (CompoundEmoji.isHandshake(str) != null) {
            return CompoundEmoji.applyColor(str, str2);
        }
        if (Emoji.endsWithRightArrow(str)) {
            str = com.google.android.recaptcha.internal.a.n(str, 2, 0);
            z10 = true;
        } else {
            z10 = false;
        }
        int length = str.length();
        if (length > 2 && str.charAt(str.length() - 2) == 8205) {
            strSubstring = str.substring(str.length() - 2);
            str = com.google.android.recaptcha.internal.a.n(str, 2, 0);
        } else if (length <= 3 || str.charAt(str.length() - 3) != 8205) {
            strSubstring = null;
        } else {
            strSubstring = str.substring(str.length() - 3);
            str = com.google.android.recaptcha.internal.a.n(str, 3, 0);
        }
        String strL = s3.c.l(str, str2);
        if (strSubstring != null) {
            strL = s3.c.l(strL, strSubstring);
        }
        return z10 ? s3.c.l(strL, "\u200d➡") : strL;
    }

    public static void j(int i10, View view) {
        if (view == null) {
            return;
        }
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i10);
    }

    public final int B(int i10) {
        org.telegram.ui.ActionBar.c6 c6Var = this.V1;
        return c6Var != null ? c6Var.N0(i10) : org.telegram.ui.ActionBar.g6.w0(null, i10, false);
    }

    public final void C() {
        hw hwVar = this.C0;
        if (hwVar != null) {
            hwVar.b();
        }
        bw bwVar = this.f35010k0;
        if (bwVar != null) {
            bwVar.b();
        }
        vv vvVar = this.R;
        if (vvVar != null) {
            vvVar.b();
        }
    }

    public final void D() {
        jg.e eVar;
        if (Build.VERSION.SDK_INT < 31 || (eVar = this.f34997f2) == null) {
            return;
        }
        oc0 oc0Var = this.f35047w;
        RectF rectF = this.f35046v2;
        qg.j.c(oc0Var, this, rectF);
        rectF.inset(LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f), LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        rectF.right = getMeasuredWidth();
        rectF.bottom = Math.min(rectF.bottom, getMeasuredHeight());
        eVar.g(1, this.f35050w2);
        eVar.e(this.f35000g2, getWidth(), getHeight());
    }

    public final void E() {
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        int i10 = this.Y0;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.groupPackUpdated);
        if (this.f35041u0 != null) {
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.recentDocumentsDidLoad);
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.featuredStickersDidLoad);
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.groupStickersDidLoad);
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        }
    }

    public final void F(boolean z10, boolean z11) {
        jy jyVar;
        if (this.f35049w1 != 0 && this.f35036s1) {
            this.f35049w1 = 0;
        }
        if (this.f35049w1 == 0 && this.f35032r1) {
            this.f35049w1 = 1;
        }
        int i10 = this.f35049w1;
        kw kwVar = this.h;
        if (i10 == 0 || z10 || this.f34990e.size() == 1) {
            N(true, false);
            S(false, false);
            if (kwVar.getCurrentItem() != 0) {
                kwVar.x(0, !z10);
            }
            if (z11) {
                AndroidUtilities.runOnUIThread(new nv(this, 9), 350L);
            }
        } else {
            int i11 = this.f35049w1;
            if (i11 == 1) {
                N(false, false);
                S(this.f35027q0 || this.f35031r0, false);
                if (kwVar.getCurrentItem() != 2) {
                    kwVar.x(2, false);
                }
                iw iwVar = this.f35052x0;
                if (iwVar != null) {
                    this.O0 = true;
                    int i12 = this.C1;
                    if (i12 >= 0) {
                        iwVar.m(i12);
                    } else {
                        int i13 = this.B1;
                        if (i13 >= 0) {
                            iwVar.m(i13);
                        } else {
                            iwVar.m(this.A1);
                        }
                    }
                    this.O0 = false;
                    this.A0.h1(0, 0);
                }
            } else if (i11 == 2) {
                N(false, false);
                S(false, false);
                if (kwVar.getCurrentItem() != 1) {
                    kwVar.x(1, false);
                }
                dx dxVar = this.f35013l0;
                if (dxVar != null) {
                    dxVar.m(0);
                }
                bw bwVar = this.f35010k0;
                if (bwVar != null && (jyVar = bwVar.f30218r) != null) {
                    jyVar.F1(null);
                }
            }
        }
        O(true);
    }

    public final void G() {
        py pyVar = this.f35041u0;
        if (pyVar != null) {
            pyVar.l();
        }
        ty tyVar = this.f35044v0;
        if (tyVar != null) {
            tyVar.l();
        }
        if (org.telegram.ui.kt.q().E) {
            org.telegram.ui.kt.q().n();
        }
        org.telegram.ui.kt.q().u();
    }

    public final void H(int i10) {
        xx xxVar = this.f35025p1;
        if ((xxVar == null || !xxVar.z()) && i10 != 0) {
            HorizontalScrollView horizontalScrollViewZ = z(i10);
            this.M0[i10] = 0;
            horizontalScrollViewZ.setTranslationY(0);
        }
    }

    public final void I(int i10, int i11) {
        xw xwVar = this.M;
        View viewM = xwVar.m(i10);
        int iL0 = xwVar.L0();
        if ((viewM == null && Math.abs(i10 - iL0) > xwVar.J * 9.0f) || !SharedConfig.animationsEnabled()) {
            int i12 = xwVar.L0() < i10 ? 0 : 1;
            c2.x xVar = this.U;
            xVar.f2367b = i12;
            xVar.d(i10, i11, false, false);
            return;
        }
        this.F0 = true;
        lh.l1 l1Var = new lh.l1(this, this.L.getContext(), 1);
        l1Var.f5731a = i10;
        l1Var.f47990p = i11;
        xwVar.w0(l1Var);
    }

    public final void J(int i10, int i11) {
        fw fwVar = this.A0;
        View viewM = fwVar.m(i10);
        int iL0 = fwVar.L0();
        if (viewM != null || Math.abs(i10 - iL0) <= 40) {
            this.F0 = true;
            this.f35059z0.x0(i10);
        } else {
            int i12 = fwVar.L0() < i10 ? 0 : 1;
            c2.x xVar = this.T;
            xVar.f2367b = i12;
            xVar.d(i10, i11, false, false);
        }
    }

    public final void K(boolean z10, boolean z11, boolean z12, boolean z13) {
        ArrayList arrayList = this.f34990e;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.d;
            if (i10 >= arrayList2.size()) {
                break;
            }
            if (((uy) arrayList2.get(i10)).f33222a == 0 && z10) {
                arrayList.add((uy) arrayList2.get(i10));
            }
            if (((uy) arrayList2.get(i10)).f33222a == 1 && z12) {
                arrayList.add((uy) arrayList2.get(i10));
            }
            if (((uy) arrayList2.get(i10)).f33222a == 2 && z11) {
                arrayList.add((uy) arrayList2.get(i10));
            }
            i10++;
        }
        oc0 oc0Var = this.f35047w;
        if (oc0Var != null) {
            AndroidUtilities.updateViewVisibilityAnimated(oc0Var, arrayList.size() > 1, 1.0f, z13);
        }
        kw kwVar = this.h;
        if (kwVar != null) {
            kwVar.setAdapter(null);
            kwVar.setAdapter(this.H0);
            if (oc0Var != null) {
                oc0Var.setViewPager(kwVar);
            }
        }
    }

    public final void L(final wg.b bVar, final TLObject tLObject, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final boolean z10, boolean z11) {
        String pluralString;
        ty tyVar;
        wx wxVar;
        if (stickerSet == null) {
            return;
        }
        if (!z10 || (wxVar = this.O) == null || wxVar.d == stickerSet.f22407id) {
            if (z10 || (tyVar = this.f35044v0) == null || tyVar.d == stickerSet.f22407id) {
                final boolean zIsStickerPackInstalled = MediaDataController.getInstance(this.Y0).isStickerPackInstalled(stickerSet.f22407id);
                if (zIsStickerPackInstalled) {
                    if (stickerSet.masks) {
                        pluralString = LocaleController.formatPluralString("RemoveManyMasksCount", stickerSet.count, new Object[0]);
                    } else {
                        pluralString = stickerSet.emojis ? LocaleController.formatPluralString("RemoveManyEmojiCount", stickerSet.count, new Object[0]) : LocaleController.formatPluralString("RemoveManyStickersCount", stickerSet.count, new Object[0]);
                    }
                } else if (stickerSet.masks) {
                    pluralString = LocaleController.formatPluralString("AddManyMasksCount", stickerSet.count, new Object[0]);
                } else {
                    pluralString = stickerSet.emojis ? LocaleController.formatPluralString("AddManyEmojiCount", stickerSet.count, new Object[0]) : LocaleController.formatPluralString("AddManyStickersCount", stickerSet.count, new Object[0]);
                }
                bVar.g(pluralString, z11, true);
                bVar.f49314d0.a(!zIsStickerPackInstalled, z11);
                bVar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        yy yyVar = this.f32896a;
                        MediaDataController mediaDataController = MediaDataController.getInstance(yyVar.Y0);
                        Context context = yyVar.getContext();
                        int i10 = zIsStickerPackInstalled ? 0 : 2;
                        org.telegram.ui.ActionBar.n2 n2Var = yyVar.U1;
                        FrameLayout frameLayout = yyVar.f35034s;
                        wg.b bVar2 = bVar;
                        TLObject tLObject2 = tLObject;
                        TLRPC.StickerSet stickerSet2 = stickerSet;
                        TLRPC.Document document2 = document;
                        boolean z12 = z10;
                        mediaDataController.toggleStickerSet(context, tLObject2, document2, i10, n2Var, frameLayout, false, true, new h3.p1(yyVar, bVar2, tLObject2, stickerSet2, document2, z12, 10), false);
                        yyVar.L(bVar2, tLObject2, stickerSet2, document2, z12, true);
                    }
                });
            }
        }
    }

    public final void M(long j10, boolean z10, boolean z11) {
        oc0 oc0Var = this.f35047w;
        if (oc0Var == null) {
            return;
        }
        this.f35032r1 = z10;
        this.f35036s1 = z11;
        if (z11 || z10) {
            this.f35028q1 = j10;
        } else {
            this.f35028q1 = 0L;
        }
        int i10 = z11 ? 2 : 0;
        LinearLayout linearLayout = oc0Var.d;
        View childAt = i10 >= linearLayout.getChildCount() ? null : linearLayout.getChildAt(i10);
        if (childAt != null) {
            childAt.setAlpha(this.f35028q1 != 0 ? 0.15f : 1.0f);
            kw kwVar = this.h;
            if (z11) {
                if (this.f35028q1 == 0 || kwVar.getCurrentItem() == 0) {
                    return;
                }
                N(true, true);
                S(false, true);
                kwVar.x(0, false);
                return;
            }
            if (this.f35028q1 == 0 || kwVar.getCurrentItem() == 1) {
                return;
            }
            N(false, true);
            S(false, true);
            kwVar.x(1, false);
        }
    }

    public final void N(boolean z10, boolean z11) {
        lw lwVar = this.f35051x;
        if (z10 && lwVar.getTag() == null) {
            return;
        }
        if ((z10 || lwVar.getTag() == null) && !this.f35012k2) {
            AnimatorSet animatorSet = this.B;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.B = null;
            }
            lwVar.setTag(z10 ? null : 1);
            int i10 = 0;
            if (!z11) {
                lwVar.setAlpha(z10 ? 1.0f : 0.0f);
                lwVar.setScaleX(z10 ? 1.0f : 0.0f);
                lwVar.setScaleY(z10 ? 1.0f : 0.0f);
                lwVar.setVisibility(z10 ? 0 : 4);
                return;
            }
            if (z10) {
                lwVar.setVisibility(0);
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.B = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(lwVar, (Property<lw, Float>) View.ALPHA, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(lwVar, (Property<lw, Float>) View.SCALE_X, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(lwVar, (Property<lw, Float>) View.SCALE_Y, z10 ? 1.0f : 0.0f));
            this.B.setDuration(200L);
            this.B.setInterpolator(er.f28123g);
            this.B.addListener(new sw(this, z10, i10));
            this.B.start();
        }
    }

    public final void O(boolean z10) {
        this.D = 0.0f;
        xx xxVar = this.f35025p1;
        if (xxVar != null && xxVar.z()) {
            z10 = false;
        }
        FrameLayout frameLayout = this.f35017n;
        if (z10 && frameLayout.getTag() == null) {
            return;
        }
        if (z10 || frameLayout.getTag() == null) {
            frameLayout.setTag(z10 ? null : 1);
            this.C2.a(z10, true);
        }
    }

    public final void P(boolean z10, boolean z11) {
        View view = this.K;
        if (z10 && view.getTag() == null) {
            return;
        }
        if (z10 || view.getTag() == null) {
            AnimatorSet animatorSet = this.S;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.S = null;
            }
            view.setTag(z10 ? null : 1);
            if (!z11) {
                view.setAlpha(z10 ? 1.0f : 0.0f);
                return;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.S = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
            this.S.setDuration(200L);
            this.S.setInterpolator(er.f28123g);
            this.S.addListener(new org.telegram.ui.am(this, 27));
            this.S.start();
        }
    }

    public final void Q(boolean z10) {
        for (int i10 = 0; i10 < 3; i10++) {
            f2.x xVarX = x(i10);
            int iL0 = xVarX.L0();
            if (z10) {
                if (iL0 == 1 || iL0 == 2) {
                    xVarX.n0(0);
                    H(i10);
                }
            } else if (iL0 == 0) {
                xVarX.h1(0, 0);
            }
        }
    }

    public final void R(boolean z10, boolean z11, boolean z12) {
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.Chat chat = MessagesController.getInstance(this.Y0).getChat(Long.valueOf(this.f35028q1));
        if (chat == null) {
            return;
        }
        cg.q qVar = this.J0;
        if (z10) {
            if (ChatObject.hasAdminRights(chat) || (tL_chatBannedRights = chat.default_banned_rights) == null || !(tL_chatBannedRights.send_stickers || (z11 && tL_chatBannedRights.send_plain))) {
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = chat.banned_rights;
                if (tL_chatBannedRights2 == null) {
                    return;
                }
                if (!AndroidUtilities.isBannedForever(tL_chatBannedRights2)) {
                    if (z11) {
                        qVar.setText(LocaleController.formatString("AttachPlainRestricted", R.string.AttachPlainRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                    }
                    if (z12) {
                        qVar.setText(LocaleController.formatString("AttachGifRestricted", R.string.AttachGifRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                    } else {
                        qVar.setText(LocaleController.formatString("AttachStickersRestricted", R.string.AttachStickersRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                    }
                } else if (z11) {
                    qVar.setText(LocaleController.getString(R.string.AttachPlainRestrictedForever));
                } else if (z12) {
                    qVar.setText(LocaleController.getString(R.string.AttachGifRestrictedForever));
                } else {
                    qVar.setText(LocaleController.getString(R.string.AttachStickersRestrictedForever));
                }
            } else {
                org.telegram.ui.ActionBar.n2 n2Var = this.U1;
                if ((n2Var instanceof org.telegram.ui.rn) && ((org.telegram.ui.rn) n2Var).K6()) {
                    return;
                }
                if (z11) {
                    qVar.setText(LocaleController.getString(R.string.GlobalAttachEmojiRestricted));
                } else if (z12) {
                    qVar.setText(LocaleController.getString(R.string.GlobalAttachGifRestricted));
                } else {
                    qVar.setText(LocaleController.getString(R.string.GlobalAttachStickersRestricted));
                }
            }
            qVar.setVisibility(0);
        }
        AnimatorSet animatorSet = this.F2;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.F2 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.F2 = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(qVar, (Property<cg.q, Float>) View.ALPHA, z10 ? qVar.getAlpha() : 1.0f, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(qVar, (Property<cg.q, Float>) View.TRANSLATION_Y, z10 ? AndroidUtilities.dp(12.0f) : qVar.getTranslationY(), z10 ? 0.0f : AndroidUtilities.dp(12.0f)));
        org.telegram.messenger.video.k kVar = this.G2;
        if (kVar != null) {
            AndroidUtilities.cancelRunOnUIThread(kVar);
        }
        if (z10) {
            org.telegram.messenger.video.k kVar2 = new org.telegram.messenger.video.k(this, z11, z12, 3);
            this.G2 = kVar2;
            AndroidUtilities.runOnUIThread(kVar2, 3500L);
        }
        this.F2.setDuration(320L);
        this.F2.setInterpolator(er.h);
        this.F2.start();
    }

    public final void S(boolean z10, boolean z11) {
        ImageView imageView = this.f35055y;
        if (imageView == null || this.f35014l2) {
            return;
        }
        if (z10 && imageView.getTag() == null) {
            return;
        }
        if (z10 || imageView.getTag() == null) {
            AnimatorSet animatorSet = this.C;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.C = null;
            }
            int i10 = 1;
            imageView.setTag(z10 ? null : 1);
            if (!z11) {
                imageView.setAlpha(z10 ? 1.0f : 0.0f);
                imageView.setScaleX(z10 ? 1.0f : 0.0f);
                imageView.setScaleY(z10 ? 1.0f : 0.0f);
                imageView.setVisibility(z10 ? 0 : 4);
                return;
            }
            if (z10) {
                imageView.setVisibility(0);
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.C = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.ALPHA, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.SCALE_X, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.SCALE_Y, z10 ? 1.0f : 0.0f));
            this.C.setDuration(200L);
            this.C.setInterpolator(er.f28123g);
            this.C.addListener(new sw(this, z10, i10));
            this.C.start();
        }
    }

    public final void T() {
        org.telegram.ui.ActionBar.n2 n2Var;
        View view = (View) getParent();
        if (view != null) {
            float y10 = (getY() + (getLayoutParams().height > 0 ? getLayoutParams().height : getMeasuredHeight())) - (((AndroidUtilities.isInMultiwindow || ((n2Var = this.U1) != null && n2Var.isInBubbleMode())) && !this.R0) ? AndroidUtilities.dp(1.0f) : view.getHeight());
            float f10 = this.f35020n2;
            FrameLayout frameLayout = this.f35017n;
            if (f10 >= 0.0f) {
                y10 += getMeasuredHeight() - this.f35020n2;
            } else if (frameLayout.getTop() - y10 < 0.0f || !this.f35040t2) {
                y10 = 0.0f;
            }
            float f11 = -y10;
            boolean z10 = this.W;
            float fLerp = f11 + AndroidUtilities.lerp(AndroidUtilities.dp(z10 ? 45.0f : 50.0f), -this.f35016m2, this.C2.f48497e);
            frameLayout.setTranslationY(fLerp);
            if (z10) {
                this.f35030r.setTranslationY(fLerp);
            }
        }
    }

    public final void U() {
        ky kyVar;
        boolean z10;
        iv ivVar;
        boolean z11 = this.f35027q0;
        View view = this.v;
        if (!z11) {
            setBackground(null);
            view.setBackground(null);
        } else if (AndroidUtilities.isInMultiwindow || this.J1) {
            Drawable background = getBackground();
            if (background != null) {
                background.setColorFilter(new PorterDuffColorFilter(B(org.telegram.ui.ActionBar.g6.He), PorterDuff.Mode.MULTIPLY));
            }
        } else {
            int i10 = org.telegram.ui.ActionBar.g6.He;
            setBackgroundColor(B(i10));
            if (this.W) {
                view.setBackgroundColor(B(i10));
            }
        }
        uv uvVar = this.E;
        if (uvVar != null) {
            if (this.f35027q0) {
                uvVar.setBackgroundColor(B(org.telegram.ui.ActionBar.g6.He));
                this.K.setBackgroundColor(B(org.telegram.ui.ActionBar.g6.Ke));
            } else {
                uvVar.setBackground(null);
            }
        }
        hu huVar = this.f35053x1;
        if (huVar != null) {
            huVar.f29103c.a();
        }
        int i11 = 0;
        while (true) {
            kyVar = this.R;
            z10 = this.f34993e2;
            if (i11 >= 3) {
                break;
            }
            if (i11 == 0) {
                kyVar = this.C0;
            } else if (i11 != 1) {
                kyVar = this.f35010k0;
            }
            if (kyVar != null) {
                wp wpVar = kyVar.d;
                FrameLayout frameLayout = kyVar.f30217n;
                View view2 = kyVar.f30216f;
                if (this.f35027q0) {
                    view2.setBackgroundColor(B(org.telegram.ui.ActionBar.g6.He));
                } else {
                    view2.setBackground(null);
                }
                kyVar.f30215e.setBackgroundColor(B(org.telegram.ui.ActionBar.g6.Ke));
                kyVar.f30214c.a(z10 ? w(0.4f) : B(org.telegram.ui.ActionBar.g6.Je));
                org.telegram.ui.ActionBar.g6.w1(z10 ? w(0.06f) : B(org.telegram.ui.ActionBar.g6.Ie), frameLayout.getBackground());
                frameLayout.invalidate();
                wpVar.setHintTextColor(z10 ? w(0.45f) : B(org.telegram.ui.ActionBar.g6.Je));
                wpVar.setTextColor(z10 ? w(0.8f) : B(org.telegram.ui.ActionBar.g6.G6));
            }
            i11++;
        }
        Paint paint = this.f35022o1;
        if (paint != null) {
            paint.setColor(B(org.telegram.ui.ActionBar.g6.f23007af));
        }
        ww wwVar = this.L;
        if (wwVar != null) {
            wwVar.setGlowColor(B(org.telegram.ui.ActionBar.g6.He));
        }
        ew ewVar = this.f35059z0;
        if (ewVar != null) {
            ewVar.setGlowColor(B(org.telegram.ui.ActionBar.g6.He));
        }
        iw iwVar = this.f35052x0;
        if (iwVar != null) {
            iwVar.setIndicatorColor(B(org.telegram.ui.ActionBar.g6.Qe));
            iwVar.setUnderlineColor(B(org.telegram.ui.ActionBar.g6.Ke));
            if (this.f35027q0) {
                iwVar.setBackgroundColor(B(org.telegram.ui.ActionBar.g6.He));
            } else {
                iwVar.setBackground(null);
            }
        }
        dx dxVar = this.f35013l0;
        if (dxVar != null) {
            dxVar.setIndicatorColor(B(org.telegram.ui.ActionBar.g6.Qe));
            dxVar.setUnderlineColor(B(org.telegram.ui.ActionBar.g6.Ke));
            if (this.f35027q0) {
                dxVar.setBackgroundColor(B(org.telegram.ui.ActionBar.g6.He));
            } else {
                dxVar.setBackground(null);
            }
        }
        lw lwVar = this.f35051x;
        if (lwVar != null) {
            lwVar.setColorFilter(new PorterDuffColorFilter(z10 ? w(0.6f) : B(org.telegram.ui.ActionBar.g6.Re), PorterDuff.Mode.MULTIPLY));
            if (kyVar == null) {
                Drawable background2 = lwVar.getBackground();
                int i12 = org.telegram.ui.ActionBar.g6.He;
                org.telegram.ui.ActionBar.g6.B1(background2, B(i12), false);
                org.telegram.ui.ActionBar.g6.B1(lwVar.getBackground(), B(i12), true);
            }
        }
        ImageView imageView = this.f35055y;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(z10 ? w(0.6f) : B(org.telegram.ui.ActionBar.g6.Re), PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.A;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(z10 ? w(0.6f) : B(org.telegram.ui.ActionBar.g6.Re), PorterDuff.Mode.MULTIPLY));
        }
        cg.q qVar = this.J0;
        if (qVar != null) {
            ((ShapeDrawable) qVar.getBackground()).getPaint().setColor(B(org.telegram.ui.ActionBar.g6.f23291qf));
            qVar.setTextColor(B(org.telegram.ui.ActionBar.g6.f23274pf));
        }
        cy cyVar = this.f34995f0;
        if (cyVar != null) {
            ey eyVar = cyVar.f27563e;
            ImageView imageView3 = eyVar.f28195a;
            int i13 = org.telegram.ui.ActionBar.g6.Le;
            imageView3.setColorFilter(new PorterDuffColorFilter(B(i13), PorterDuff.Mode.MULTIPLY));
            eyVar.f28196b.setTextColor(B(i13));
            eyVar.f28197c.setProgressColor(B(org.telegram.ui.ActionBar.g6.f23125h6));
        }
        this.a2 = new PorterDuffColorFilter(B(org.telegram.ui.ActionBar.g6.Oh), PorterDuff.Mode.SRC_IN);
        int i14 = 0;
        while (true) {
            Drawable[] drawableArr = this.T0;
            if (i14 >= drawableArr.length) {
                break;
            }
            org.telegram.ui.ActionBar.g6.y1(drawableArr[i14], z10 ? w(0.4f) : B(org.telegram.ui.ActionBar.g6.Ne), false);
            org.telegram.ui.ActionBar.g6.y1(drawableArr[i14], z10 ? w(0.8f) : B(org.telegram.ui.ActionBar.g6.Oe), true);
            i14++;
        }
        if (uvVar != null && (ivVar = uvVar.f30759y) != null) {
            ivVar.d();
        }
        int i15 = 0;
        while (true) {
            Drawable[] drawableArr2 = this.U0;
            if (i15 >= drawableArr2.length) {
                break;
            }
            org.telegram.ui.ActionBar.g6.y1(drawableArr2[i15], z10 ? w(0.4f) : B(org.telegram.ui.ActionBar.g6.Me), false);
            org.telegram.ui.ActionBar.g6.y1(drawableArr2[i15], z10 ? w(0.8f) : B(org.telegram.ui.ActionBar.g6.Oe), true);
            i15++;
        }
        int i16 = 0;
        while (true) {
            Drawable[] drawableArr3 = this.V0;
            if (i16 >= drawableArr3.length) {
                break;
            }
            org.telegram.ui.ActionBar.g6.y1(drawableArr3[i16], z10 ? w(0.4f) : B(org.telegram.ui.ActionBar.g6.Me), false);
            org.telegram.ui.ActionBar.g6.y1(drawableArr3[i16], z10 ? w(0.8f) : B(org.telegram.ui.ActionBar.g6.Oe), true);
            i16++;
        }
        org.telegram.ui.ActionBar.r5 r5Var = this.W1;
        if (r5Var != null) {
            org.telegram.ui.ActionBar.g6.y1(r5Var, z10 ? w(0.4f) : B(org.telegram.ui.ActionBar.g6.Ne), false);
            org.telegram.ui.ActionBar.g6.y1(r5Var, z10 ? w(0.8f) : B(org.telegram.ui.ActionBar.g6.Oe), true);
        }
        org.telegram.ui.ActionBar.r5 r5Var2 = this.X1;
        if (r5Var2 != null) {
            org.telegram.ui.ActionBar.g6.y1(r5Var2, z10 ? w(0.4f) : B(org.telegram.ui.ActionBar.g6.Qe), false);
            org.telegram.ui.ActionBar.g6.y1(r5Var2, z10 ? w(0.8f) : B(org.telegram.ui.ActionBar.g6.Qe), true);
        }
    }

    public final void V() {
        ww wwVar = this.L;
        if (wwVar == null) {
            return;
        }
        for (int i10 = 0; i10 < wwVar.getChildCount(); i10++) {
            View childAt = wwVar.getChildAt(i10);
            if (childAt instanceof ox) {
                ((ox) childAt).a(true);
            }
        }
    }

    public final void W(int i10) {
        if (this.f34980b0) {
            return;
        }
        int i11 = -1;
        if (i10 != -1) {
            int size = getRecentEmoji().size() + (this.W ? 1 : 0);
            gx gxVar = this.N;
            int i12 = gxVar.f28855c;
            ArrayList arrayList = gxVar.f28862x;
            int length = 0;
            int length2 = size + (i12 >= 0 ? 3 : 0);
            if (i10 >= length2) {
                int i13 = 0;
                while (true) {
                    String[][] strArr = EmojiData.dataColored;
                    if (i13 >= strArr.length) {
                        break;
                    }
                    length2 += strArr[i13].length + 1;
                    if (i10 < length2) {
                        i11 = i13 + 1;
                        break;
                    }
                    i13++;
                }
                if (i11 >= 0) {
                    length = i11;
                    break;
                }
                ArrayList<kx> emojipacks = getEmojipacks();
                int size2 = arrayList.size() - 1;
                while (true) {
                    if (size2 >= 0) {
                        if (((Integer) arrayList.get(size2)).intValue() <= i10) {
                            kx kxVar = (kx) this.f35015m1.get(size2);
                            while (true) {
                                if (length < emojipacks.size()) {
                                    long j10 = emojipacks.get(length).f30205b.f22407id;
                                    long j11 = kxVar.f30205b.f22407id;
                                    if (j10 == j11 && (!kxVar.f30209g || (!kxVar.f30208f && !this.l1.contains(Long.valueOf(j11))))) {
                                        length = EmojiData.dataColored.length + 1 + length;
                                        break;
                                    }
                                    length++;
                                }
                            }
                        } else {
                            size2--;
                        }
                    }
                    length = i11;
                    break;
                }
            }
            if (length >= 0) {
                this.E.j(length, true);
            }
        }
    }

    public final void X() {
        int i10;
        jy jyVar;
        dx dxVar = this.f35013l0;
        int currentPosition = dxVar.getCurrentPosition();
        int i11 = this.f35018n0;
        boolean z10 = currentPosition == i11;
        boolean z11 = i11 >= 0;
        boolean zIsEmpty = this.f34992e1.isEmpty();
        dxVar.d(false);
        this.f35018n0 = -2;
        this.f35021o0 = -2;
        this.f35024p0 = -2;
        Drawable[] drawableArr = this.V0;
        if (zIsEmpty) {
            i10 = 0;
        } else {
            this.f35018n0 = 0;
            dxVar.b(0, drawableArr[0]).setContentDescription(LocaleController.getString(R.string.RecentStickers));
            i10 = 1;
        }
        this.f35021o0 = i10;
        dxVar.b(1, drawableArr[1]).setContentDescription(LocaleController.getString(R.string.FeaturedGifs));
        this.f35024p0 = i10 + 1;
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
                String strK = i0.a.k(i13 + 3, "tab");
                int i14 = dxVar.f33464x;
                dxVar.f33464x = i14 + 1;
                nw0 nw0Var = (nw0) dxVar.f33458n.get(strK);
                if (nw0Var != null) {
                    dxVar.g(strK, nw0Var, i14);
                } else {
                    nw0Var = new nw0(dxVar.getContext(), 2);
                    nw0Var.setFocusable(true);
                    nw0Var.setOnClickListener(new pl0(dxVar, 2));
                    nw0Var.setExpanded(dxVar.f33444b0);
                    nw0Var.a(dxVar.f33449e0);
                    dxVar.f33448e.addView(nw0Var, i14);
                }
                nw0Var.d = false;
                nw0Var.setTag(R.id.index_tag, Integer.valueOf(i14));
                nw0Var.setTag(R.id.parent_tag, emojiDrawable);
                nw0Var.setTag(R.id.object_tag, emojiAnimatedSticker);
                nw0Var.setSelected(i14 == dxVar.f33465y);
                dxVar.h.put(strK, nw0Var);
                nw0Var.setContentDescription(str);
            } else {
                currentPosition = currentPosition;
                z11 = z11;
            }
            i13++;
            currentPosition = currentPosition;
            z11 = z11;
        }
        int i15 = currentPosition;
        boolean z12 = z11;
        dxVar.h();
        dxVar.q();
        if (z10 && zIsEmpty) {
            dxVar.m(this.f35021o0);
            bw bwVar = this.f35010k0;
            if (bwVar == null || (jyVar = bwVar.f30218r) == null) {
                return;
            }
            jyVar.F1(null);
            return;
        }
        WeakHashMap weakHashMap = r0.j0.f46605a;
        if (dxVar.isLaidOut()) {
            if (!zIsEmpty && !z12) {
                dxVar.k(i15 + 1, 0);
            } else if (zIsEmpty && z12) {
                dxVar.k(i15 - 1, 0);
            }
        }
    }

    public final void Y() {
        cy cyVar;
        int size = this.f34992e1.size();
        long jCalcDocumentsHash = MediaDataController.calcDocumentsHash(this.f34992e1, Integer.MAX_VALUE);
        ArrayList<TLRPC.Document> recentGifs = MediaDataController.getInstance(this.Y0).getRecentGifs();
        this.f34992e1 = recentGifs;
        long jCalcDocumentsHash2 = MediaDataController.calcDocumentsHash(recentGifs, Integer.MAX_VALUE);
        if ((this.f35013l0 != null && size == 0 && !this.f34992e1.isEmpty()) || (size != 0 && this.f34992e1.isEmpty())) {
            X();
        }
        if ((size == this.f34992e1.size() && jCalcDocumentsHash == jCalcDocumentsHash2) || (cyVar = this.f35007j0) == null) {
            return;
        }
        cyVar.l();
    }

    public final void Z(boolean z10) {
        TLRPC.Document document;
        ArrayList<TLRPC.Document> arrayList;
        ArrayList<TLRPC.Document> arrayList2;
        TLRPC.StickerSet stickerSet;
        iw iwVar = this.f35052x0;
        if (iwVar != null) {
            ra1 ra1Var = iwVar.f33448e;
            if (iwVar.f33462s != null) {
                return;
            }
            this.B1 = -2;
            this.C1 = -2;
            this.D1 = -2;
            this.E1 = -2;
            this.f34977a0 = false;
            this.A1 = 0;
            int currentPosition = iwVar.getCurrentPosition();
            boolean z11 = true;
            iwVar.d((getParent() == null || getVisibility() != 0 || (this.f35042u1.size() == 0 && this.f35045v1.size() == 0)) ? false : true);
            int i10 = this.Y0;
            MediaDataController mediaDataController = MediaDataController.getInstance(i10);
            SharedPreferences emojiSettings = MessagesController.getEmojiSettings(i10);
            ArrayList arrayList3 = this.f35005i1;
            arrayList3.clear();
            ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = mediaDataController.getFeaturedStickerSets();
            int size = featuredStickerSets.size();
            for (int i11 = 0; i11 < size; i11++) {
                TLRPC.StickerSetCovered stickerSetCovered = featuredStickerSets.get(i11);
                if (!mediaDataController.isStickerPackInstalled(stickerSetCovered.set.f22407id)) {
                    arrayList3.add(stickerSetCovered);
                }
            }
            wy wyVar = this.B0;
            if (wyVar != null) {
                wyVar.l();
            }
            boolean zIsEmpty = featuredStickerSets.isEmpty();
            long j10 = 0;
            Drawable[] drawableArr = this.U0;
            if (!zIsEmpty && (arrayList3.isEmpty() || emojiSettings.getLong("featured_hidden", 0L) == featuredStickerSets.get(0).set.f22407id)) {
                int i12 = mediaDataController.getUnreadStickerSets().isEmpty() ? 2 : 3;
                nw0 nw0VarC = iwVar.c(i12, drawableArr[i12]);
                nw0VarC.h.setText(LocaleController.getString(R.string.FeaturedStickersShort));
                nw0VarC.setContentDescription(LocaleController.getString(R.string.FeaturedStickers));
                int i13 = this.A1;
                this.D1 = i13;
                this.A1 = i13 + 1;
            }
            if (!this.f34999g1.isEmpty()) {
                int i14 = this.A1;
                this.C1 = i14;
                this.A1 = i14 + 1;
                nw0 nw0VarC2 = iwVar.c(1, drawableArr[1]);
                nw0VarC2.h.setText(LocaleController.getString(R.string.FavoriteStickersShort));
                nw0VarC2.setContentDescription(LocaleController.getString(R.string.FavoriteStickers));
            }
            if (!this.f34996f1.isEmpty()) {
                int i15 = this.A1;
                this.B1 = i15;
                this.A1 = i15 + 1;
                nw0 nw0VarC3 = iwVar.c(0, drawableArr[0]);
                nw0VarC3.h.setText(LocaleController.getString(R.string.RecentStickersShort));
                nw0VarC3.setContentDescription(LocaleController.getString(R.string.RecentStickers));
            }
            ArrayList arrayList4 = this.Z0;
            arrayList4.clear();
            org.telegram.ui.ActionBar.c6 c6Var = null;
            this.f34988d1 = null;
            this.f34981b1 = -1;
            this.f34978a1 = -10;
            if (this.D2 == null || z10) {
                this.D2 = new ArrayList(mediaDataController.getStickerSets(0));
            }
            ArrayList<TLRPC.TL_messages_stickerSet> arrayList5 = this.D2;
            int i16 = 0;
            while (true) {
                TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.f35039t1;
                if (i16 >= stickerSetCoveredArr.length) {
                    break;
                }
                TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCoveredArr[i16];
                long j11 = j10;
                if (stickerSetCovered2 != null) {
                    TLRPC.TL_messages_stickerSet stickerSetById = mediaDataController.getStickerSetById(stickerSetCovered2.set.f22407id);
                    if (stickerSetById == null || (stickerSet = stickerSetById.set) == null || stickerSet.archived) {
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
                    } else {
                        stickerSetCoveredArr[i16] = null;
                    }
                }
                i16++;
                j10 = j11;
            }
            long j12 = j10;
            ArrayList<TLRPC.TL_messages_stickerSet> arrayListFilterPremiumStickers = MessagesController.getInstance(i10).filterPremiumStickers(arrayList5);
            for (int i17 = 0; i17 < arrayListFilterPremiumStickers.size(); i17++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = arrayListFilterPremiumStickers.get(i17);
                TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet2.set;
                if ((stickerSet2 == null || !stickerSet2.archived) && (arrayList2 = tL_messages_stickerSet2.documents) != null && !arrayList2.isEmpty()) {
                    arrayList4.add(tL_messages_stickerSet2);
                }
            }
            if (this.F1 != null) {
                long j13 = MessagesController.getEmojiSettings(i10).getLong("group_hide_stickers_" + this.F1.f22381id, -1L);
                TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(this.F1.f22381id));
                if (chat == null || this.F1.stickerset == null || !ChatObject.hasAdminRights(chat)) {
                    this.f34985c1 = j13 != -1;
                } else {
                    TLRPC.StickerSet stickerSet3 = this.F1.stickerset;
                    if (stickerSet3 != null) {
                        this.f34985c1 = j13 == stickerSet3.f22407id;
                    }
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
                        if (this.f34985c1) {
                            this.f34978a1 = arrayList4.size();
                            arrayList4.add(tL_messages_stickerSet3);
                        } else {
                            this.f34978a1 = 0;
                            arrayList4.add(0, tL_messages_stickerSet3);
                        }
                        if (!this.F1.can_set_stickers) {
                            tL_messages_stickerSet3 = null;
                        }
                        this.f34988d1 = tL_messages_stickerSet3;
                    }
                } else if (chatFull.can_set_stickers) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = new TLRPC.TL_messages_stickerSet();
                    if (this.f34985c1) {
                        this.f34978a1 = arrayList4.size();
                        arrayList4.add(tL_messages_stickerSet4);
                    } else {
                        this.f34978a1 = 0;
                        arrayList4.add(0, tL_messages_stickerSet4);
                    }
                }
            }
            int i18 = 0;
            while (i18 < arrayList4.size()) {
                if (i18 == this.f34978a1) {
                    TLRPC.Chat chat2 = MessagesController.getInstance(i10).getChat(Long.valueOf(this.F1.f22381id));
                    if (chat2 == null) {
                        arrayList4.remove(0);
                        i18--;
                    } else {
                        this.f34977a0 = z11;
                        String str = "chat" + chat2.f22380id;
                        int i19 = iwVar.f33464x;
                        iwVar.f33464x = i19 + 1;
                        nw0 nw0Var = (nw0) iwVar.f33458n.get(str);
                        if (nw0Var != null) {
                            iwVar.g(str, nw0Var, i19);
                        } else {
                            nw0Var = new nw0(iwVar.getContext(), 0);
                            nw0Var.setFocusable(z11);
                            nw0Var.setOnClickListener(new pl0(iwVar, 0));
                            ra1Var.addView(nw0Var, i19);
                            nw0Var.f31051w = z11;
                            y8 y8Var = new y8(c6Var);
                            y8Var.u(AndroidUtilities.dp(14.0f));
                            y8Var.k(UserConfig.selectedAccount, chat2);
                            int i20 = iwVar.f33441a;
                            n9 n9Var = nw0Var.f31046e;
                            n9Var.setLayerNum(i20);
                            n9Var.e(chat2, y8Var);
                            n9Var.setAspectFit(z11);
                            nw0Var.setExpanded(iwVar.f33444b0);
                            nw0Var.a(iwVar.f33449e0);
                            nw0Var.h.setText(chat2.title);
                        }
                        nw0Var.d = z11;
                        nw0Var.setTag(R.id.index_tag, Integer.valueOf(i19));
                        nw0Var.setSelected(i19 == iwVar.f33465y);
                        iwVar.h.put(str, nw0Var);
                    }
                } else {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet5 = (TLRPC.TL_messages_stickerSet) arrayList4.get(i18);
                    TLRPC.StickerSet stickerSet5 = tL_messages_stickerSet5.set;
                    if (stickerSet5 == null || stickerSet5.thumb_document_id == j12) {
                        document = null;
                        break;
                    }
                    int i21 = 0;
                    while (true) {
                        if (i21 >= tL_messages_stickerSet5.documents.size()) {
                            document = null;
                            break;
                        }
                        document = tL_messages_stickerSet5.documents.get(i21);
                        if (document != null && tL_messages_stickerSet5.set.thumb_document_id == document.f22386id) {
                            break;
                        } else {
                            i21++;
                        }
                    }
                    if (document == null) {
                        document = tL_messages_stickerSet5.documents.get(0);
                    }
                    Object closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tL_messages_stickerSet5.set.thumbs, 90);
                    if (closestPhotoSizeWithSize == null || tL_messages_stickerSet5.set.gifs) {
                        closestPhotoSizeWithSize = document;
                    }
                    String str2 = "set" + tL_messages_stickerSet5.set.f22407id;
                    int i22 = iwVar.f33464x;
                    iwVar.f33464x = i22 + 1;
                    nw0 nw0Var2 = (nw0) iwVar.f33458n.get(str2);
                    if (nw0Var2 != null) {
                        iwVar.g(str2, nw0Var2, i22);
                    } else {
                        nw0Var2 = new nw0(iwVar.getContext(), 0);
                        nw0Var2.setFocusable(z11);
                        nw0Var2.setOnClickListener(new pl0(iwVar, 1));
                        nw0Var2.setExpanded(iwVar.f33444b0);
                        nw0Var2.a(iwVar.f33449e0);
                        ra1Var.addView(nw0Var2, i22);
                    }
                    nw0Var2.f31046e.setLayerNum(iwVar.f33441a);
                    nw0Var2.d = false;
                    nw0Var2.setTag(closestPhotoSizeWithSize);
                    nw0Var2.setTag(R.id.index_tag, Integer.valueOf(i22));
                    nw0Var2.setTag(R.id.parent_tag, tL_messages_stickerSet5);
                    nw0Var2.setTag(R.id.object_tag, document);
                    nw0Var2.setSelected(i22 == iwVar.f33465y);
                    iwVar.h.put(str2, nw0Var2);
                    nw0Var2.setContentDescription(tL_messages_stickerSet5.set.title + ", " + LocaleController.getString(R.string.AccDescrStickerSet));
                }
                i18++;
                z11 = true;
                c6Var = null;
            }
            iwVar.h();
            iwVar.q();
            if (currentPosition != 0) {
                iwVar.k(currentPosition, currentPosition);
            }
            p();
        }
    }

    @Override
    public final void a(int i10) {
        setBottomInset(i10);
    }

    public final void a0() {
        jw jwVar = this.f35056y0;
        iw iwVar = this.f35052x0;
        if (iwVar != null && jwVar == null && this.f35025p1 != null) {
            iwVar.setTranslationY(this.f35025p1.p() * (-AndroidUtilities.dp(50.0f)));
        }
        if (jwVar == null) {
            return;
        }
        boolean z10 = getVisibility() == 0 && this.G0 && this.f35025p1.p() != 1.0f;
        jwVar.setVisibility(z10 ? 0 : 8);
        if (z10) {
            Rect rect = this.f35043u2;
            rect.setEmpty();
            this.h.getChildVisibleRect(this.f35038t0, rect, null);
            float fP = this.f35025p1.p() * AndroidUtilities.dp(50.0f);
            int i10 = rect.left;
            if (i10 != 0 || fP != 0.0f) {
                this.T1 = false;
            }
            jwVar.setTranslationX(i10);
            float translationY = (((getTranslationY() + getTop()) - jwVar.getTop()) - iwVar.getExpandedOffset()) - fP;
            if (jwVar.getTranslationY() != translationY) {
                jwVar.setTranslationY(translationY);
                jwVar.invalidate();
            }
        }
        if (this.T1 && z10 && this.L0) {
            iwVar.i(this.S1, true);
        } else {
            this.T1 = false;
            iwVar.i(this.S1, false);
        }
    }

    public final void b0() {
        boolean z10;
        org.telegram.ui.Cells.p3 p3Var;
        LongSparseArray longSparseArray = this.f35045v1;
        LongSparseArray longSparseArray2 = this.f35042u1;
        int i10 = this.Y0;
        ew ewVar = this.f35059z0;
        if (ewVar == null) {
            return;
        }
        try {
            int childCount = ewVar.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = ewVar.getChildAt(i11);
                if ((childAt instanceof org.telegram.ui.Cells.p3) && ((lk0) ewVar.T(childAt)) != null) {
                    org.telegram.ui.Cells.p3 p3Var2 = (org.telegram.ui.Cells.p3) childAt;
                    ArrayList<Long> unreadStickerSets = MediaDataController.getInstance(i10).getUnreadStickerSets();
                    TLRPC.StickerSetCovered stickerSet = p3Var2.getStickerSet();
                    boolean z11 = unreadStickerSets != null && unreadStickerSets.contains(Long.valueOf(stickerSet.set.f22407id));
                    int i12 = 0;
                    while (true) {
                        TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.f35039t1;
                        if (i12 >= stickerSetCoveredArr.length) {
                            z10 = false;
                            break;
                        }
                        TLRPC.StickerSetCovered stickerSetCovered = stickerSetCoveredArr[i12];
                        if (stickerSetCovered != null) {
                            p3Var = p3Var2;
                            if (stickerSetCovered.set.f22407id == stickerSet.set.f22407id) {
                                p3Var2 = p3Var;
                                z10 = true;
                                break;
                            }
                        } else {
                            p3Var = p3Var2;
                        }
                        i12++;
                        p3Var2 = p3Var;
                    }
                    p3Var2.c(stickerSet, z11, true, 0, 0, z10);
                    if (z11) {
                        MediaDataController.getInstance(i10).markFeaturedStickersByIdAsRead(false, stickerSet.set.f22407id);
                    }
                    boolean z12 = longSparseArray2.indexOfKey(stickerSet.set.f22407id) >= 0;
                    boolean z13 = longSparseArray.indexOfKey(stickerSet.set.f22407id) >= 0;
                    if (z12 || z13) {
                        if (z12 && p3Var2.f24975r) {
                            longSparseArray2.remove(stickerSet.set.f22407id);
                            z12 = false;
                        } else if (z13 && !p3Var2.f24975r) {
                            longSparseArray.remove(stickerSet.set.f22407id);
                        }
                    }
                    p3Var2.b(!z10 && z12, true);
                }
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    @Override
    public final void d(float f10) {
        this.f35020n2 = f10;
        T();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Utilities.Callback callback;
        TLRPC.StickerSet stickerSet;
        int i12 = NotificationCenter.stickersDidLoad;
        gx gxVar = this.N;
        nv nvVar = this.H2;
        if (i10 == i12) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (this.f35041u0 != null) {
                    Z(((Boolean) objArr[1]).booleanValue());
                    b0();
                    G();
                    p();
                    return;
                }
                return;
            }
            if (((Integer) objArr[0]).intValue() == 5) {
                if (!((Boolean) objArr[1]).booleanValue()) {
                    gxVar.F(false);
                    return;
                } else {
                    AndroidUtilities.cancelRunOnUIThread(nvVar);
                    AndroidUtilities.runOnUIThread(nvVar, 100L);
                    return;
                }
            }
            return;
        }
        if (i10 == NotificationCenter.groupPackUpdated) {
            long jLongValue = ((Long) objArr[0]).longValue();
            boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
            TLRPC.ChatFull chatFull = this.F1;
            if (chatFull != null && chatFull.f22381id == jLongValue && zBooleanValue) {
                gxVar.F(true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.recentDocumentsDidLoad) {
            boolean zBooleanValue2 = ((Boolean) objArr[0]).booleanValue();
            int iIntValue = ((Integer) objArr[1]).intValue();
            if (zBooleanValue2 || iIntValue == 0 || iIntValue == 2) {
                k(zBooleanValue2);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.featuredStickersDidLoad) {
            b0();
            oc0 oc0Var = this.f35047w;
            if (oc0Var != null) {
                int childCount = oc0Var.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    oc0Var.getChildAt(i13).invalidate();
                }
            }
            Z(false);
            return;
        }
        if (i10 == NotificationCenter.featuredEmojiDidLoad) {
            if (gxVar != null) {
                gxVar.F(false);
                return;
            }
            return;
        }
        int i14 = NotificationCenter.groupStickersDidLoad;
        wx wxVar = this.O;
        if (i10 == i14) {
            Long l10 = (Long) objArr[0];
            long jLongValue2 = l10.longValue();
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = objArr.length > 1 ? (TLRPC.TL_messages_stickerSet) objArr[1] : null;
            if (tL_messages_stickerSet != null) {
                ty tyVar = this.f35044v0;
                if (tyVar != null && tyVar.d == jLongValue2 && tyVar.f32908f.size() < tL_messages_stickerSet.documents.size()) {
                    tyVar.f32908f = tL_messages_stickerSet.documents;
                    tyVar.l();
                }
                if (wxVar != null && wxVar.d == jLongValue2 && wxVar.f34356f.size() < tL_messages_stickerSet.documents.size()) {
                    wxVar.f34356f = tL_messages_stickerSet.documents;
                    wxVar.l();
                }
            }
            TLRPC.ChatFull chatFull2 = this.F1;
            if (chatFull2 != null && (stickerSet = chatFull2.stickerset) != null && stickerSet.f22407id == jLongValue2) {
                Z(false);
            }
            HashMap map = this.f35019n1;
            if (map.containsKey(l10) && objArr.length >= 2 && ((Utilities.Callback) map.get(l10)) != null && tL_messages_stickerSet != null && (callback = (Utilities.Callback) map.remove(l10)) != null) {
                callback.run(tL_messages_stickerSet);
            }
            AndroidUtilities.cancelRunOnUIThread(nvVar);
            AndroidUtilities.runOnUIThread(nvVar, 100L);
            return;
        }
        int i15 = NotificationCenter.emojiLoaded;
        ww wwVar = this.L;
        if (i10 != i15) {
            if (i10 != NotificationCenter.newEmojiSuggestionsAvailable) {
                if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                    if (gxVar != null) {
                        gxVar.F(false);
                    }
                    V();
                    Z(false);
                    return;
                }
                return;
            }
            if (wwVar == null || !this.W) {
                return;
            }
            if ((this.R.f30214c.f30421k == 2 || wwVar.getAdapter() == wxVar) && !TextUtils.isEmpty(wxVar.v)) {
                wxVar.F(wxVar.v, true);
                return;
            }
            return;
        }
        ew ewVar = this.f35059z0;
        if (ewVar != null) {
            int childCount2 = ewVar.getChildCount();
            for (int i16 = 0; i16 < childCount2; i16++) {
                View childAt = ewVar.getChildAt(i16);
                if ((childAt instanceof org.telegram.ui.Cells.j8) || (childAt instanceof org.telegram.ui.Cells.a8)) {
                    childAt.invalidate();
                }
            }
        }
        if (wwVar != null) {
            wwVar.invalidate();
            int childCount3 = wwVar.getChildCount();
            for (int i17 = 0; i17 < childCount3; i17++) {
                View childAt2 = wwVar.getChildAt(i17);
                if (childAt2 instanceof gy) {
                    childAt2.invalidate();
                }
            }
        }
        hu huVar = this.f35053x1;
        if (huVar != null) {
            huVar.f29103c.invalidate();
        }
        dx dxVar = this.f35013l0;
        if (dxVar != null) {
            ra1 ra1Var = dxVar.f33448e;
            int childCount4 = ra1Var.getChildCount();
            for (int i18 = 0; i18 < childCount4; i18++) {
                ra1Var.getChildAt(i18).invalidate();
            }
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        og.d dVar;
        jg.e eVar;
        if (Build.VERSION.SDK_INT >= 31 && (dVar = this.f35003h2) != null && (eVar = this.f34997f2) != null) {
            D();
            RecordingCanvas recordingCanvasA = dVar.a(getMeasuredWidth(), getMeasuredHeight());
            recordingCanvasA.drawColor(B(org.telegram.ui.ActionBar.g6.f23053d6));
            if (SharedConfig.chatBlurEnabled()) {
                eVar.b(recordingCanvasA, -2);
            }
            dVar.b();
        }
        T();
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != this.h) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        if (this.f35017n.getVisibility() != 8 && !this.f35027q0 && this.f35035s0) {
            canvas.drawColor(i0.b.k(-1, 25));
        }
        boolean zDrawChild = super.drawChild(canvas, view, j10);
        float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(this.f35016m2);
        if (navigationBarThirdButtonsFactor > 0.0f) {
            int iL1 = org.telegram.ui.ActionBar.g6.l1(navigationBarThirdButtonsFactor, B(org.telegram.ui.ActionBar.g6.He));
            int i10 = this.f35058y2;
            GradientDrawable gradientDrawable = this.f35054x2;
            if (i10 != iL1) {
                gradientDrawable.setColors(new int[]{iL1, org.telegram.ui.ActionBar.g6.l1(0.66f, iL1), i0.b.k(iL1, 0)});
                this.f35058y2 = iL1;
            }
            gradientDrawable.setBounds(0, getMeasuredHeight() - this.f35016m2, getMeasuredWidth(), getMeasuredHeight());
            gradientDrawable.draw(canvas);
        }
        canvas.restore();
        return zDrawChild;
    }

    public int getCurrentPage() {
        return this.f35049w1;
    }

    public ArrayList<kx> getEmojipacks() {
        ArrayList<kx> arrayList = new ArrayList<>();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f35015m1;
            if (i10 >= arrayList2.size()) {
                return arrayList;
            }
            kx kxVar = (kx) arrayList2.get(i10);
            boolean z10 = kxVar.f30209g;
            ArrayList arrayList3 = this.l1;
            if ((!z10 && (kxVar.f30208f || arrayList3.contains(Long.valueOf(kxVar.f30205b.f22407id)))) || (kxVar.f30209g && !kxVar.f30208f && !arrayList3.contains(Long.valueOf(kxVar.f30205b.f22407id)))) {
                arrayList.add(kxVar);
            }
            i10++;
        }
    }

    public ArrayList<String> getRecentEmoji() {
        if (this.Y1) {
            return Emoji.recentEmoji;
        }
        if (this.f35061z2 == null) {
            this.f35061z2 = new ArrayList();
        }
        if (Emoji.recentEmoji.size() != this.A2) {
            this.f35061z2.clear();
            int i10 = 0;
            while (true) {
                ArrayList<String> arrayList = Emoji.recentEmoji;
                if (i10 >= arrayList.size()) {
                    break;
                }
                if (!arrayList.get(i10).startsWith("animated_")) {
                    this.f35061z2.add(arrayList.get(i10));
                }
                i10++;
            }
            this.A2 = this.f35061z2.size();
        }
        return this.f35061z2;
    }

    public float getStickersExpandOffset() {
        iw iwVar = this.f35052x0;
        if (iwVar == null) {
            return 0.0f;
        }
        return iwVar.getExpandedOffset();
    }

    public final void h(String str) {
        if (str == null) {
            return;
        }
        if (!str.startsWith("animated_") && !Emoji.isValidEmoji(str)) {
            return;
        }
        Emoji.addRecentEmoji(str);
        int i10 = 0;
        if (getVisibility() != 0 || this.h.getCurrentItem() != 0) {
            Emoji.sortEmoji();
            this.N.F(false);
        }
        Emoji.saveRecentEmoji();
        if (this.Y1) {
            return;
        }
        ArrayList arrayList = this.f35061z2;
        if (arrayList == null) {
            this.f35061z2 = new ArrayList();
        } else {
            arrayList.clear();
        }
        while (true) {
            ArrayList<String> arrayList2 = Emoji.recentEmoji;
            if (i10 >= arrayList2.size()) {
                this.A2 = this.f35061z2.size();
                return;
            } else {
                if (!arrayList2.get(i10).startsWith("animated_")) {
                    this.f35061z2.add(arrayList2.get(i10));
                }
                i10++;
            }
        }
    }

    public final void i(int i10, int i11, boolean z10) {
        if (i10 == 2 || y(i10).K(0) == null) {
            return;
        }
        tw twVar = new tw(getContext(), i11);
        twVar.f5731a = !z10 ? 1 : 0;
        x(i10).w0(twVar);
    }

    public final void k(boolean z10) {
        if (z10) {
            Y();
            return;
        }
        int size = this.f34996f1.size();
        int size2 = this.f34999g1.size();
        int i10 = this.Y0;
        this.f34996f1 = MediaDataController.getInstance(i10).getRecentStickers(0, true);
        this.f34999g1 = MediaDataController.getInstance(i10).getRecentStickers(2);
        if (UserConfig.getInstance(i10).isPremium()) {
            this.f35002h1 = MediaDataController.getInstance(i10).getRecentStickers(7);
        } else {
            this.f35002h1 = new ArrayList();
        }
        for (int i11 = 0; i11 < this.f34999g1.size(); i11++) {
            TLRPC.Document document = (TLRPC.Document) this.f34999g1.get(i11);
            for (int i12 = 0; i12 < this.f34996f1.size(); i12++) {
                TLRPC.Document document2 = (TLRPC.Document) this.f34996f1.get(i12);
                if (document2.dc_id == document.dc_id && document2.f22386id == document.f22386id) {
                    this.f34996f1.remove(i12);
                    break;
                }
            }
        }
        if (MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            int i13 = 0;
            while (i13 < this.f34999g1.size()) {
                if (MessageObject.isPremiumSticker((TLRPC.Document) this.f34999g1.get(i13))) {
                    this.f34999g1.remove(i13);
                    i13--;
                }
                i13++;
            }
            int i14 = 0;
            while (i14 < this.f34996f1.size()) {
                if (MessageObject.isPremiumSticker((TLRPC.Document) this.f34996f1.get(i14))) {
                    this.f34996f1.remove(i14);
                    i14--;
                }
                i14++;
            }
        }
        if (size != this.f34996f1.size() || size2 != this.f34999g1.size()) {
            Z(false);
        }
        py pyVar = this.f35041u0;
        if (pyVar != null) {
            pyVar.l();
        }
        p();
    }

    public final void l(boolean z10) {
        xx xxVar = this.f35025p1;
        ud.a aVar = this.f34979b;
        ww wwVar = this.L;
        vv vvVar = this.R;
        if (xxVar != null && xxVar.z()) {
            f2.o1 o1VarK = wwVar.K(0);
            if (o1VarK == null) {
                ky.a(vvVar, true, !z10);
            } else {
                ky.a(vvVar, o1VarK.f5789a.getTop() < wwVar.getPaddingTop(), !z10);
            }
            P(false, !z10);
            vvVar.setTranslationY(aVar.f48497e * AndroidUtilities.dp(15.0f));
            return;
        }
        if (vvVar == null || wwVar == null) {
            return;
        }
        f2.o1 o1VarK2 = wwVar.K(0);
        vvVar.setTranslationY((aVar.f48497e * AndroidUtilities.dp(15.0f)) + (o1VarK2 != null ? o1VarK2.f5789a.getTop() : -this.X0));
        vvVar.f30212a.a(false, !z10);
        m(Math.round(this.E.getTranslationY()));
    }

    public final void m(int i10) {
        ObjectAnimator objectAnimator = this.N0[1];
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            boolean z10 = false;
            f2.o1 o1VarK = this.L.K(0);
            int iDp = AndroidUtilities.dp(38.0f) + i10;
            if (iDp > 0 && (o1VarK == null || o1VarK.f5789a.getBottom() < iDp)) {
                z10 = true;
            }
            P(z10, !this.G1);
        }
    }

    public final void n(ww wwVar, int i10) {
        ww wwVar2;
        f2.o1 o1VarK;
        uv uvVar = this.E;
        int[] iArr = this.M0;
        if (wwVar == null) {
            iArr[1] = 0;
            uvVar.setTranslationY(0);
            return;
        }
        if (wwVar.getVisibility() != 0 || this.f34980b0) {
            return;
        }
        xx xxVar = this.f35025p1;
        if (xxVar == null || !xxVar.z()) {
            if (i10 > 0 && (wwVar2 = this.L) != null && wwVar2.getVisibility() == 0 && (o1VarK = wwVar2.K(0)) != null) {
                if (o1VarK.f5789a.getTop() + (this.W ? this.X0 : 0) >= wwVar2.getPaddingTop()) {
                    return;
                }
            }
            int i11 = iArr[1] - i10;
            iArr[1] = i11;
            if (i11 > 0) {
                iArr[1] = 0;
            } else if (i11 < (-AndroidUtilities.dp(108.0f))) {
                iArr[1] = -AndroidUtilities.dp(108.0f);
            }
            uvVar.setTranslationY(Math.max(-AndroidUtilities.dp(36.0f), iArr[1]));
        }
    }

    @Override
    public final void o(int i10, float f10, float f11, ud.c cVar) {
        if (i10 == 0) {
            r(false);
            float f12 = 1.0f - this.f34976a.f48497e;
            hw hwVar = this.C0;
            hwVar.setAlpha(f12);
            hwVar.setVisibility(f12 > 0.0f ? 0 : 4);
            float f13 = 1.0f - f12;
            wg.d dVar = this.D0;
            dVar.setAlpha(f13);
            dVar.setTranslationY((-AndroidUtilities.dp(15.0f)) * f12);
            dVar.setVisibility(f13 > 0.0f ? 0 : 4);
            vf.g gVar = this.I;
            gVar.setAlpha(f13);
            gVar.setTranslationY(AndroidUtilities.dp(30.0f) * f12);
            gVar.setVisibility(f13 > 0.0f ? 0 : 4);
            T();
            this.f35038t0.invalidate();
            return;
        }
        if (i10 == 1) {
            l(false);
            float f14 = 1.0f - this.f34979b.f48497e;
            vv vvVar = this.R;
            vvVar.setAlpha(f14);
            vvVar.setVisibility(f14 > 0.0f ? 0 : 4);
            float f15 = 1.0f - f14;
            wg.d dVar2 = this.Q;
            dVar2.setAlpha(f15);
            dVar2.setTranslationY((-AndroidUtilities.dp(15.0f)) * f14);
            dVar2.setVisibility(f15 > 0.0f ? 0 : 4);
            vf.g gVar2 = this.G;
            gVar2.setAlpha(f15);
            gVar2.setTranslationY(AndroidUtilities.dp(30.0f) * f14);
            gVar2.setVisibility(f15 > 0.0f ? 0 : 4);
            T();
            this.F.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        int i10 = this.Y0;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.groupPackUpdated);
        if (this.f35041u0 != null) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.stickersDidLoad);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.recentDocumentsDidLoad);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.featuredStickersDidLoad);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.groupStickersDidLoad);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
            AndroidUtilities.runOnUIThread(new nv(this, 0));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hu huVar = this.f35053x1;
        if (huVar != null && huVar.isShowing()) {
            huVar.dismiss();
        }
        org.telegram.ui.kt ktVarQ = org.telegram.ui.kt.q();
        if (ktVarQ.f39868l == this.f34986c2) {
            ktVarQ.W = null;
            ktVarQ.f39855a0 = null;
            ktVarQ.Y = null;
            ktVarQ.f39868l = null;
            ktVarQ.f39859c0 = null;
            ktVarQ.u();
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        if (this.K1 != i14) {
            this.K1 = i14;
            G();
        }
        super.onLayout(z10, i10, i11, i12, i13);
        T();
        a0();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.G1 = true;
        boolean z10 = AndroidUtilities.isInMultiwindow;
        View view = this.v;
        boolean z11 = this.W;
        if (z10 || this.J1) {
            if (this.H1 != 1) {
                if (!this.E2) {
                    setOutlineProvider(this.I1);
                    setClipToOutline(true);
                    setElevation(AndroidUtilities.dp(2.0f));
                }
                setBackgroundResource(R.drawable.smiles_popup);
                Drawable background = getBackground();
                int i12 = org.telegram.ui.ActionBar.g6.He;
                background.setColorFilter(new PorterDuffColorFilter(B(i12), PorterDuff.Mode.MULTIPLY));
                if (z11 && this.f35027q0) {
                    view.setBackgroundColor(B(i12));
                }
                this.H1 = 1;
            }
        } else if (this.H1 != 0) {
            if (!this.E2) {
                setOutlineProvider(null);
                setClipToOutline(false);
                setElevation(0.0f);
            }
            if (this.f35027q0) {
                int i13 = org.telegram.ui.ActionBar.g6.He;
                setBackgroundColor(B(i13));
                if (z11) {
                    view.setBackgroundColor(B(i13));
                }
            }
            this.H1 = 0;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
        this.G1 = false;
        setTranslationY(getTranslationY());
    }

    public final void p() {
        int iL0;
        iw iwVar = this.f35052x0;
        if (iwVar == null || (iL0 = this.A0.L0()) == -1) {
            return;
        }
        int i10 = this.C1;
        if (i10 <= 0 && (i10 = this.B1) <= 0) {
            i10 = this.A1;
        }
        iwVar.k(this.f35041u0.F(iL0), i10);
    }

    public final void q(int i10) {
        int iL0;
        int iL1;
        if (i10 == 0) {
            if (this.F0 || (iL1 = this.A0.L0()) == -1 || this.f35059z0 == null) {
                return;
            }
            int i11 = this.C1;
            if (i11 <= 0 && (i11 = this.B1) <= 0) {
                i11 = this.A1;
            }
            this.f35052x0.k(this.f35041u0.F(iL1), i11);
            return;
        }
        if (i10 == 2) {
            f2.q0 adapter = this.f34987d0.getAdapter();
            cy cyVar = this.f35007j0;
            if (adapter != cyVar || cyVar.E < 0 || this.f35021o0 < 0 || this.f35018n0 < 0 || (iL0 = this.f34991e0.L0()) == -1) {
                return;
            }
            this.f35013l0.k(iL0 >= cyVar.E ? this.f35021o0 : this.f35018n0, 0);
        }
    }

    public final void r(boolean z10) {
        xx xxVar = this.f35025p1;
        ud.a aVar = this.f34976a;
        ew ewVar = this.f35059z0;
        hw hwVar = this.C0;
        if (xxVar != null && xxVar.z()) {
            f2.o1 o1VarK = ewVar.K(0);
            if (o1VarK == null) {
                ky.a(hwVar, true, !z10);
            } else {
                ky.a(hwVar, o1VarK.f5789a.getTop() < ewVar.getPaddingTop(), !z10);
            }
            hwVar.setTranslationY(aVar.f48497e * AndroidUtilities.dp(15.0f));
            return;
        }
        if (hwVar == null || ewVar == null) {
            return;
        }
        f2.o1 o1VarK2 = ewVar.K(0);
        hwVar.setTranslationY((aVar.f48497e * AndroidUtilities.dp(15.0f)) + (o1VarK2 != null ? o1VarK2.f5789a.getTop() : -this.X0));
        hwVar.f30212a.a(false, !z10);
    }

    @Override
    public final void requestLayout() {
        if (this.G1) {
            return;
        }
        super.requestLayout();
    }

    public final void s() {
        Emoji.clearRecentEmoji();
        this.N.F(false);
    }

    public void setBlurredBackgroundDrawableFactory(jg.a aVar) {
        org.telegram.ui.ActionBar.c6 c6Var = this.V1;
        lw lwVar = this.f35051x;
        if (lwVar != null) {
            lg.d dVarC = aVar.c(lwVar, null, false);
            dVarC.n(ng.c.d(c6Var));
            dVarC.p(AndroidUtilities.dp(18.0f));
            dVarC.o(AndroidUtilities.dp(6.0f));
            lwVar.setBackground(dVarC);
        }
        ImageView imageView = this.A;
        if (imageView != null) {
            lg.d dVarC2 = aVar.c(imageView, null, false);
            dVarC2.n(ng.c.d(c6Var));
            dVarC2.p(AndroidUtilities.dp(18.0f));
            dVarC2.o(AndroidUtilities.dp(6.0f));
            imageView.setBackground(dVarC2);
        }
        oc0 oc0Var = this.f35047w;
        if (oc0Var != null) {
            lg.d dVarC3 = aVar.c(oc0Var, null, false);
            dVarC3.n(ng.c.d(c6Var));
            dVarC3.p(AndroidUtilities.dp(18.0f));
            dVarC3.o(AndroidUtilities.dp(6.0f));
            oc0Var.setBackground(dVarC3);
        }
        ImageView imageView2 = this.f35055y;
        if (imageView2 != null) {
            lg.d dVarC4 = aVar.c(imageView2, null, false);
            dVarC4.n(ng.c.d(c6Var));
            dVarC4.p(AndroidUtilities.dp(18.0f));
            dVarC4.o(AndroidUtilities.dp(6.0f));
            imageView2.setBackground(dVarC4);
        }
    }

    public void setBottomInset(int i10) {
        if (this.f35016m2 != i10) {
            this.f35016m2 = i10;
            j(i10, this.G);
            j(i10, this.I);
            j(AndroidUtilities.dp(44.0f) + i10, this.L);
            j(AndroidUtilities.dp(44.0f) + i10, this.f35059z0);
            j(AndroidUtilities.dp(44.0f) + i10, this.f34987d0);
            FrameLayout frameLayout = this.f35034s;
            if (frameLayout != null) {
                frameLayout.setTranslationY(-i10);
            }
            T();
            invalidate();
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        this.F1 = chatFull;
        Z(false);
    }

    public void setDelegate(xx xxVar) {
        this.f35025p1 = xxVar;
    }

    public void setDragListener(cx cxVar) {
        this.K0 = cxVar;
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        hw hwVar = this.C0;
        if (hwVar != null) {
            hwVar.d.setEnabled(z10);
        }
        bw bwVar = this.f35010k0;
        if (bwVar != null) {
            bwVar.d.setEnabled(z10);
        }
        vv vvVar = this.R;
        if (vvVar != null) {
            vvVar.d.setEnabled(z10);
        }
    }

    public void setForseMultiwindowLayout(boolean z10) {
        this.J1 = z10;
    }

    public void setShouldDrawBackground(boolean z10) {
        if (this.f35027q0 != z10) {
            this.f35027q0 = z10;
            U();
        }
    }

    public void setShowing(boolean z10) {
        this.L0 = z10;
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
        boolean z10 = getVisibility() != i10;
        super.setVisibility(i10);
        if (z10) {
            if (i10 != 8) {
                Emoji.sortEmoji();
                this.N.F(false);
                int i11 = this.Y0;
                NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.stickersDidLoad);
                if (this.f35041u0 != null) {
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
            ow owVar = this.P0;
            if (owVar != null) {
                owVar.a();
            }
        }
    }

    public final void t(long j10, boolean z10) {
        ky kyVar;
        f2.k0 k0Var;
        View view;
        View view2;
        int i10;
        TLRPC.TL_messages_stickerSet stickerSetById;
        py pyVar;
        int iE;
        AnimatorSet animatorSet = this.I0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.I0 = null;
        }
        int currentItem = this.h.getCurrentItem();
        if (currentItem == 2 && j10 != -1 && (stickerSetById = MediaDataController.getInstance(this.Y0).getStickerSetById(j10)) != null && (iE = (pyVar = this.f35041u0).E(stickerSetById)) >= 0 && iE < pyVar.h()) {
            J(iE, AndroidUtilities.dp(48.0f));
        }
        cy cyVar = this.f34995f0;
        if (cyVar != null) {
            cyVar.G = false;
        }
        for (int i11 = 0; i11 < 3; i11++) {
            ew ewVar = this.f35059z0;
            yv yvVar = this.f34987d0;
            bw bwVar = this.f35010k0;
            ww wwVar = this.L;
            if (i11 == 0) {
                kyVar = this.R;
                k0Var = this.M;
                view = this.E;
                view2 = wwVar;
            } else if (i11 == 1) {
                k0Var = this.f34991e0;
                view = this.f35013l0;
                view2 = yvVar;
                kyVar = bwVar;
            } else {
                kyVar = this.C0;
                k0Var = this.A0;
                view = this.f35052x0;
                view2 = ewVar;
            }
            if (kyVar != null) {
                jy jyVar = kyVar.f30218r;
                kyVar.d.setText("");
                if (jyVar != null) {
                    jyVar.F1(null);
                    jyVar.D1();
                }
                int i12 = this.X0;
                if (i11 == currentItem && z10) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.I0 = animatorSet2;
                    Property property = View.TRANSLATION_Y;
                    if (view == null || i11 == 1) {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, AndroidUtilities.dp(36.0f) - i12));
                    } else {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 0.0f), ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, AndroidUtilities.dp(36.0f)), ObjectAnimator.ofFloat(kyVar, (Property<ky, Float>) property, AndroidUtilities.dp(36.0f)));
                    }
                    this.I0.setDuration(200L);
                    this.I0.setInterpolator(er.h);
                    this.I0.addListener(new jh.h3(this, k0Var, view2, 5));
                    this.I0.start();
                } else {
                    if (kyVar != bwVar) {
                        kyVar.setTranslationY(AndroidUtilities.dp(36.0f) - i12);
                    }
                    if (view != null && i11 != 2) {
                        view.setTranslationY(0.0f);
                    }
                    if (view2 == ewVar) {
                        i10 = 0;
                        view2.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f) + this.f35016m2);
                    } else {
                        i10 = 0;
                        if (view2 == yvVar) {
                            view2.setPadding(0, AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(44.0f) + this.f35016m2);
                        } else {
                            if (view2 == wwVar) {
                                view2.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f) + this.f35016m2);
                            }
                            i10 = 0;
                        }
                    }
                    k0Var.h1(i10, i10);
                }
            }
        }
        if (z10) {
            return;
        }
        this.f35025p1.i(0);
    }

    public final void u(boolean z10) {
        t(-1L, z10);
    }

    public final void v(boolean z10) {
        py pyVar;
        boolean z11 = this.J2;
        this.J2 = z10;
        if (!z11 || z10) {
            return;
        }
        int i10 = this.f35049w1;
        if (i10 == 0) {
            gx gxVar = this.N;
            if (gxVar != null) {
                gxVar.F(false);
                return;
            }
            return;
        }
        if (i10 == 1) {
            cy cyVar = this.f35007j0;
            if (cyVar != null) {
                cyVar.l();
                return;
            }
            return;
        }
        if (i10 != 2 || (pyVar = this.f35041u0) == null) {
            return;
        }
        pyVar.l();
    }

    public final int w(float f10) {
        return i0.b.k(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Wk, this.V1), (int) (f10 * 255.0f));
    }

    public final f2.x x(int i10) {
        if (i10 == 0) {
            return this.A0;
        }
        if (i10 == 1) {
            return this.M;
        }
        if (i10 == 2) {
            return this.f34991e0;
        }
        throw new IllegalArgumentException(i0.a.k(i10, "Unexpected argument: "));
    }

    public final zk0 y(int i10) {
        if (i10 == 0) {
            return this.f35059z0;
        }
        if (i10 == 1) {
            return this.L;
        }
        if (i10 == 2) {
            return this.f34987d0;
        }
        throw new IllegalArgumentException(i0.a.k(i10, "Unexpected argument: "));
    }

    public final HorizontalScrollView z(int i10) {
        if (i10 == 0) {
            return this.f35052x0;
        }
        if (i10 == 1) {
            return this.E;
        }
        if (i10 == 2) {
            return this.f35013l0;
        }
        throw new IllegalArgumentException(i0.a.k(i10, "Unexpected argument: "));
    }

    @Override
    public final void A(float f10, int i10) {
    }
}
