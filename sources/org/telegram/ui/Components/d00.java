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
import org.telegram.ui.fc1;
public class d00 extends FrameLayout implements me.d, NotificationCenter.NotificationCenterDelegate, ph.a {
    public static final int O2 = 0;
    public final ax A0;
    public int A1;
    public final GradientDrawable A2;
    public final px B0;
    public final qv B1;
    public int B2;
    public final qx C0;
    public final int C1;
    public ArrayList C2;
    public final lx D0;
    public final int[] D1;
    public int D2;
    public final ImageView E;
    public final mx E0;
    public int E1;
    public long E2;
    public AnimatorSet F;
    public b00 F0;
    public int F1;
    public final me.b F2;
    public AnimatorSet G;
    public final ox G0;
    public int G1;
    public ArrayList G2;
    public float H;
    public final nh.d H0;
    public int H1;
    public boolean H2;
    public final hy I;
    public boolean I0;
    public int I1;
    public NotificationCenter.ObserversGroup I2;
    public final cy J;
    public boolean J0;
    public TLRPC.ChatFull J1;
    public AnimatorSet J2;
    public final ci.m6 K;
    public boolean K0;
    public boolean K1;
    public org.telegram.messenger.video.k K2;
    public final nh.b L;
    public final wy L0;
    public int L1;
    public final ww L2;
    public final ci.m6 M;
    public AnimatorSet M0;
    public final ai.j6 M1;
    public boolean M2;
    public final nh.b N;
    public final ai.q4 N0;
    public boolean N1;
    public boolean N2;
    public final View O;
    public jy O0;
    public int O1;
    public final py P;
    public boolean P0;
    public boolean P1;
    public final dy Q;
    public final int[] Q0;
    public boolean Q1;
    public final my R;
    public final ObjectAnimator[] R0;
    public lz R1;
    public final cz S;
    public boolean S0;
    public float S1;
    public b00 T;
    public gg.f1 T0;
    public float T1;
    public final nh.d U;
    public boolean U0;
    public float U1;
    public final cx V;
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
    public final me.b f25071a;
    public final zl0 f25072a0;
    public final String[] f25073a1;
    public final org.telegram.ui.ActionBar.s5 a2;
    public final me.b f25074b;
    public final zl0 f25075b0;
    public final int f25076b1;
    public final org.telegram.ui.ActionBar.s5 f25077b2;
    public int f25078c;
    public boolean f25079c0;
    public final int f25080c1;
    public final boolean f25081c2;
    public final ArrayList d;
    public final boolean f25082d0;
    public final ArrayList f25083d1;
    public LongSparseArray f25084d2;
    public final ArrayList f25085e;
    public boolean f25086e0;
    public int f25087e1;
    public PorterDuffColorFilter f25088e2;
    public boolean f25089f;
    public boolean f25090f0;
    public int f25091f1;
    public final org.telegram.ui.Cells.l7 f25092f2;
    public final ex f25093g0;
    public boolean f25094g1;
    public final wx f25095g2;
    public final rx h;
    public final fx f25096h0;
    public TLRPC.TL_messages_stickerSet f25097h1;
    public boolean f25098h2;
    public final iz f25099i0;
    public ArrayList f25100i1;
    public final boolean f25101i2;
    public final hz f25102j0;
    public ArrayList f25103j1;
    public final ah.h f25104j2;
    public final kz f25105k0;
    public ArrayList f25106k1;
    public final ph f25107k2;
    public final HashMap f25108l0;
    public ArrayList l1;
    public final ah.c f25109l2;
    public final ax m0;
    public final ArrayList f25110m1;
    public final li.e f25111m2;
    public final FrameLayout f25112n;
    public final hz f25113n0;
    public final ArrayList f25114n1;
    public boolean f25115n2;
    public final ix f25116o0;
    public final ArrayList f25117o1;
    public boolean f25118o2;
    public final ky f25119p0;
    public final ArrayList f25120p1;
    public int f25121p2;
    public boolean f25122q0;
    public final ArrayList f25123q1;
    public float f25124q2;
    public final FrameLayout f25125r;
    public int f25126r0;
    public final HashMap f25127r1;
    public View f25128r2;
    public final FrameLayout f25129s;
    public int f25130s0;
    public final Paint f25131s1;
    public int f25132s2;
    public int f25133t0;
    public dz f25134t1;
    public int f25135t2;
    public boolean f25136u0;
    public long f25137u1;
    public long f25138u2;
    public final View v;
    public boolean f25139v0;
    public boolean f25140v1;
    public boolean f25141v2;
    public final ie0 f25142w;
    public boolean f25143w0;
    public boolean f25144w1;
    public boolean f25145w2;
    public final sx f25146x;
    public final jx f25147x0;
    public final TLRPC.StickerSetCovered[] f25148x1;
    public final Rect f25149x2;
    public final ImageView f25150y;
    public final tz f25151y0;
    public final LongSparseArray f25152y1;
    public final RectF f25153y2;
    public final yz f25154z0;
    public final LongSparseArray f25155z1;
    public final ArrayList f25156z2;

    public d00(org.telegram.ui.ActionBar.m2 m2Var, boolean z10, boolean z11, boolean z12, Context context, boolean z13, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z14, final org.telegram.ui.ActionBar.c6 c6Var, boolean z15, boolean z16) {
        super(context);
        int i10;
        int A;
        org.telegram.ui.ActionBar.s5 s5Var;
        int A2;
        int i11;
        ww wwVar;
        Context context2;
        cy cyVar;
        boolean z17;
        boolean z18;
        final org.telegram.ui.ActionBar.c6 c6Var2;
        fh.c cVar;
        int i12;
        li.e eVar;
        int i13;
        boolean z19;
        Field field;
        int i14;
        js jsVar = js.h;
        this.f25071a = new me.b(0, this, jsVar, 320L, false);
        this.f25074b = new me.b(1, this, jsVar, 320L, false);
        this.f25078c = 2;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.f25085e = new ArrayList();
        this.f25079c0 = true;
        this.f25105k0 = new kz(this);
        this.f25108l0 = new HashMap();
        this.f25122q0 = true;
        this.f25126r0 = -2;
        this.f25130s0 = -2;
        this.f25133t0 = -2;
        this.f25136u0 = true;
        this.f25143w0 = true;
        this.I0 = true;
        this.Q0 = new int[3];
        this.R0 = new ObjectAnimator[3];
        int i15 = UserConfig.selectedAccount;
        this.f25080c1 = i15;
        this.f25083d1 = new ArrayList();
        this.f25100i1 = new ArrayList();
        this.f25103j1 = new ArrayList();
        this.f25106k1 = new ArrayList();
        this.l1 = new ArrayList();
        this.f25110m1 = new ArrayList();
        this.f25114n1 = new ArrayList();
        new ArrayList();
        this.f25117o1 = new ArrayList();
        this.f25120p1 = new ArrayList();
        this.f25123q1 = new ArrayList();
        this.f25127r1 = new HashMap();
        this.f25148x1 = new TLRPC.StickerSetCovered[10];
        this.f25152y1 = new LongSparseArray();
        this.f25155z1 = new LongSparseArray();
        this.D1 = new int[2];
        this.F1 = -2;
        this.G1 = -2;
        this.H1 = -2;
        this.I1 = -2;
        this.L1 = -1;
        this.f25092f2 = new org.telegram.ui.Cells.l7(this, 10);
        this.f25095g2 = new wx(this);
        this.f25098h2 = true;
        li.e eVar2 = new li.e();
        this.f25111m2 = eVar2;
        this.f25124q2 = -1.0f;
        this.f25132s2 = -1;
        this.f25135t2 = -1;
        this.f25138u2 = -1L;
        this.f25141v2 = false;
        this.f25145w2 = true;
        this.f25149x2 = new Rect();
        RectF rectF = new RectF();
        this.f25153y2 = rectF;
        ArrayList arrayList2 = new ArrayList(1);
        this.f25156z2 = arrayList2;
        arrayList2.add(rectF);
        this.A2 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.F2 = new me.b(0, new xw(this, 3), jsVar, 380L, true);
        this.L2 = new ww(this, 1);
        this.M2 = false;
        this.f25136u0 = z14;
        this.Y1 = m2Var;
        this.f25081c2 = z10;
        this.Z1 = c6Var;
        this.f25101i2 = z16;
        fh.c cVar2 = new fh.c();
        cVar2.a(A(org.telegram.ui.ActionBar.h6.f20559d6));
        if (z15) {
            v(true);
        }
        i0.a.k(A(org.telegram.ui.ActionBar.h6.Wk), 30);
        int dp = AndroidUtilities.dp(50.0f);
        this.f25076b1 = dp;
        this.f25082d0 = z13;
        int i16 = R.drawable.smiles_tab_smiles;
        if (z16) {
            i10 = 0;
            A = w(0.4f);
        } else {
            i10 = 0;
            A = A(org.telegram.ui.ActionBar.h6.Re);
        }
        org.telegram.ui.ActionBar.s5 V = org.telegram.ui.ActionBar.h6.V(context, i16, A, z16 ? w(0.8f) : A(org.telegram.ui.ActionBar.h6.Oe));
        org.telegram.ui.ActionBar.s5 V2 = org.telegram.ui.ActionBar.h6.V(context, R.drawable.smiles_tab_gif, z16 ? w(0.4f) : A(org.telegram.ui.ActionBar.h6.Re), z16 ? w(0.8f) : A(org.telegram.ui.ActionBar.h6.Oe));
        org.telegram.ui.ActionBar.s5 V3 = org.telegram.ui.ActionBar.h6.V(context, R.drawable.smiles_tab_stickers, z16 ? w(0.4f) : A(org.telegram.ui.ActionBar.h6.Re), z16 ? w(0.8f) : A(org.telegram.ui.ActionBar.h6.Oe));
        Drawable[] drawableArr = new Drawable[3];
        drawableArr[i10] = V;
        drawableArr[1] = V2;
        drawableArr[2] = V3;
        this.X0 = drawableArr;
        org.telegram.ui.ActionBar.s5 V4 = org.telegram.ui.ActionBar.h6.V(context, R.drawable.msg_emoji_recent, z16 ? w(0.4f) : A(org.telegram.ui.ActionBar.h6.Me), z16 ? w(0.8f) : A(org.telegram.ui.ActionBar.h6.Oe));
        org.telegram.ui.ActionBar.s5 V5 = org.telegram.ui.ActionBar.h6.V(context, R.drawable.emoji_tabs_faves, z16 ? w(0.4f) : A(org.telegram.ui.ActionBar.h6.Me), z16 ? w(0.8f) : A(org.telegram.ui.ActionBar.h6.Oe));
        org.telegram.ui.ActionBar.s5 V6 = org.telegram.ui.ActionBar.h6.V(context, R.drawable.emoji_tabs_new3, z16 ? w(0.4f) : A(org.telegram.ui.ActionBar.h6.Me), z16 ? w(0.8f) : A(org.telegram.ui.ActionBar.h6.Oe));
        int i17 = R.drawable.emoji_tabs_new1;
        if (z16) {
            s5Var = V6;
            A2 = w(0.4f);
        } else {
            s5Var = V6;
            A2 = A(org.telegram.ui.ActionBar.h6.Me);
        }
        org.telegram.ui.ActionBar.s5 V7 = org.telegram.ui.ActionBar.h6.V(context, i17, A2, z16 ? w(0.8f) : A(org.telegram.ui.ActionBar.h6.Oe));
        this.a2 = V7;
        int i18 = R.drawable.emoji_tabs_new2;
        int i19 = org.telegram.ui.ActionBar.h6.Qe;
        org.telegram.ui.ActionBar.s5 V8 = org.telegram.ui.ActionBar.h6.V(context, i18, A(i19), A(i19));
        this.f25077b2 = V8;
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
        org.telegram.ui.ActionBar.s5 V9 = org.telegram.ui.ActionBar.h6.V(context, R.drawable.msg_emoji_recent, z16 ? w(0.4f) : A(org.telegram.ui.ActionBar.h6.Me), z16 ? w(0.8f) : A(org.telegram.ui.ActionBar.h6.Oe));
        org.telegram.ui.ActionBar.s5 V10 = org.telegram.ui.ActionBar.h6.V(context, R.drawable.stickers_gifs_trending, z16 ? w(0.4f) : A(org.telegram.ui.ActionBar.h6.Me), z16 ? w(0.8f) : A(org.telegram.ui.ActionBar.h6.Oe));
        Drawable[] drawableArr4 = new Drawable[2];
        drawableArr4[i10] = V9;
        drawableArr4[1] = V10;
        this.Z0 = drawableArr4;
        this.f25073a1 = new String[]{LocaleController.getString(R.string.Emoji1), LocaleController.getString(R.string.Emoji2), LocaleController.getString(R.string.Emoji3), LocaleController.getString(R.string.Emoji4), LocaleController.getString(R.string.Emoji5), LocaleController.getString(R.string.Emoji6), LocaleController.getString(R.string.Emoji7), LocaleController.getString(R.string.Emoji8)};
        this.J1 = chatFull;
        Paint paint = new Paint(1);
        this.f25131s1 = paint;
        paint.setColor(A(org.telegram.ui.ActionBar.h6.f20511af));
        ai.l2 l2Var = yf.i0.f52395a;
        this.M1 = new ai.j6(AndroidUtilities.dp(6.0f));
        cy cyVar2 = new cy(this, context);
        this.J = cyVar2;
        ?? obj = new Object();
        obj.f33525a = i10;
        obj.f33526b = cyVar2;
        arrayList.add(obj);
        if (z10) {
            MediaDataController.getInstance(i15).checkStickers(5);
            MediaDataController.getInstance(i15).checkFeaturedEmoji();
            this.f25088e2 = new PorterDuffColorFilter(A(org.telegram.ui.ActionBar.h6.Oh), PorterDuff.Mode.SRC_IN);
        }
        py pyVar = new py(this, context);
        this.P = pyVar;
        eVar2.a(pyVar);
        s4.j jVar = new s4.j();
        jVar.f47981c = 220L;
        jVar.f47982e = 220L;
        jVar.f47983f = 160L;
        jVar.f47984g = 160L;
        jVar.f47985i = js.f27628g;
        pyVar.setItemAnimator(jVar);
        pyVar.setOnTouchListener(new View.OnTouchListener(this) {
            public final d00 f33180b;

            {
                this.f33180b = this;
            }

            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                switch (r3) {
                    case 0:
                        org.telegram.ui.ut q6 = org.telegram.ui.ut.q();
                        d00 d00Var = this.f33180b;
                        py pyVar2 = d00Var.P;
                        d00Var.getMeasuredHeight();
                        return q6.s(motionEvent, pyVar2, null, d00Var.f25095g2, c6Var);
                    case 1:
                        org.telegram.ui.ut q10 = org.telegram.ui.ut.q();
                        d00 d00Var2 = this.f33180b;
                        return q10.s(motionEvent, d00Var2.f25096h0, d00Var2.m0, d00Var2.f25095g2, c6Var);
                    default:
                        org.telegram.ui.ut q11 = org.telegram.ui.ut.q();
                        d00 d00Var3 = this.f33180b;
                        lx lxVar = d00Var3.D0;
                        d00Var3.getMeasuredHeight();
                        return q11.s(motionEvent, lxVar, d00Var3.A0, d00Var3.f25095g2, c6Var);
                }
            }
        });
        pyVar.setOnItemLongClickListener(new xw(this, 1));
        pyVar.setInstantClick(true);
        dy dyVar = new dy(this);
        this.Q = dyVar;
        pyVar.setLayoutManager(dyVar);
        pyVar.setTopGlowOffset(AndroidUtilities.dp(38.0f));
        pyVar.setBottomGlowOffset(AndroidUtilities.dp(36.0f));
        pyVar.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f));
        int i20 = org.telegram.ui.ActionBar.h6.He;
        pyVar.setGlowColor(A(i20));
        pyVar.setItemSelectorColorProvider(new f2(21));
        pyVar.setClipToPadding(false);
        dyVar.O = new ey(this);
        my myVar = new my(this);
        this.R = myVar;
        pyVar.setAdapter(myVar);
        pyVar.i(new ci.q1(this, 3));
        this.S = new cz(this, context);
        cyVar2.addView(pyVar, w7.w5.d(-1.0f, -1));
        zl0 zl0Var = new zl0(pyVar, dyVar);
        this.f25075b0 = zl0Var;
        zl0Var.f33435i = new fy(this);
        pyVar.setOnScrollListener(new gy(this));
        if (m2Var != null) {
            i11 = -1;
            wwVar = new ww(this, 2);
            cyVar = cyVar2;
            z17 = z10;
            z18 = z16;
            c6Var2 = c6Var;
            cVar = cVar2;
            i12 = dp;
            eVar = eVar2;
            i13 = 5;
            context2 = context;
        } else {
            i11 = -1;
            wwVar = null;
            context2 = context;
            cyVar = cyVar2;
            z17 = z10;
            z18 = z16;
            c6Var2 = c6Var;
            cVar = cVar2;
            i12 = dp;
            eVar = eVar2;
            i13 = 5;
        }
        hy hyVar = new hy(this, context2, c6Var2, z17, wwVar, z18);
        this.I = hyVar;
        if (z13) {
            cx cxVar = new cx(this, context2);
            this.V = cxVar;
            cyVar.addView(cxVar, new FrameLayout.LayoutParams(i11, AndroidUtilities.getShadowHeight() + i12));
            cxVar.d.setOnFocusChangeListener(new dx(this));
            nh.d dVar = new nh.d(context2, c6Var2);
            this.U = dVar;
            dVar.setVisibility(8);
            dVar.setOnBackClickListener(new View.OnClickListener(this) {
                public final d00 f33508b;

                {
                    this.f33508b = this;
                }

                @Override
                public final void onClick(View view) {
                    pz pzVar;
                    switch (r2) {
                        case 0:
                            cz czVar = this.f33508b.S;
                            xy xyVar = czVar.f25051c;
                            int childCount = xyVar.getChildCount();
                            for (int i21 = 0; i21 < childCount; i21++) {
                                ((nh.c) xyVar.getChildAt(i21)).a(false, true);
                            }
                            czVar.d = 0L;
                            czVar.F.f25074b.a(false, true);
                            czVar.l();
                            return;
                        case 1:
                            yz yzVar = this.f33508b.f25154z0;
                            xz xzVar = yzVar.f33222c;
                            int childCount2 = xzVar.getChildCount();
                            for (int i22 = 0; i22 < childCount2; i22++) {
                                ((nh.c) xzVar.getChildAt(i22)).a(false, true);
                            }
                            yzVar.d = 0L;
                            yzVar.Q.f25071a.a(false, true);
                            yzVar.l();
                            return;
                        case 2:
                            dz dzVar = this.f33508b.f25134t1;
                            if (dzVar != null) {
                                dzVar.w();
                                return;
                            }
                            return;
                        default:
                            d00 d00Var = this.f33508b;
                            int currentItem = d00Var.h.getCurrentItem();
                            if (currentItem == 0) {
                                pzVar = d00Var.V;
                            } else if (currentItem == 1) {
                                pzVar = d00Var.f25116o0;
                            } else {
                                pzVar = d00Var.G0;
                            }
                            if (pzVar != null) {
                                ar arVar = pzVar.d;
                                arVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                arVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                arVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                return;
                            }
                            return;
                    }
                }
            });
            cyVar.addView(dVar, new FrameLayout.LayoutParams(i11, i12));
        }
        int A3 = A(i20);
        if (Color.alpha(A3) >= 255) {
            hyVar.setBackgroundColor(A3);
        }
        myVar.G(true);
        hyVar.p(getEmojipacks());
        cyVar.addView(hyVar, w7.w5.d(36.0f, i11));
        View view = new View(context2);
        this.O = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        int i21 = org.telegram.ui.ActionBar.h6.Ke;
        view.setBackgroundColor(A(i21));
        fh.c cVar3 = cVar;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i11, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(36.0f);
        cyVar.addView(view, layoutParams);
        nh.b bVar = new nh.b(context2, c6Var2);
        this.L = bVar;
        ci.m6 m6Var = new ci.m6(context2, 3, c6Var2);
        this.K = m6Var;
        m6Var.setVisibility(8);
        m6Var.addView(bVar, w7.w5.a(48.0f, 10.0f, 5.0f, 10.0f, 10.0f, -1, 80));
        cyVar.addView(m6Var, w7.w5.e(i11, -2, 80));
        if (z11) {
            tn0 tn0Var = tn0.f30901b;
            if (z12) {
                ex exVar = new ex(this, context2);
                this.f25093g0 = exVar;
                ?? obj2 = new Object();
                obj2.f33525a = 1;
                obj2.f33526b = exVar;
                this.d.add(obj2);
                fx fxVar = new fx(this, context2);
                this.f25096h0 = fxVar;
                eVar.a(fxVar);
                fxVar.setClipToPadding(false);
                iz izVar = new iz(this);
                this.f25099i0 = izVar;
                fxVar.setLayoutManager(izVar);
                fxVar.i(new gx(this));
                fxVar.setPadding(0, i12, 0, AndroidUtilities.dp(44.0f) + this.f25121p2);
                ((s4.g1) fxVar.getItemAnimator()).f47929m = false;
                hz hzVar = new hz(this, context2, true, Integer.MAX_VALUE);
                this.f25113n0 = hzVar;
                fxVar.setAdapter(hzVar);
                this.f25102j0 = new hz(this, context2, false, 0);
                fxVar.setOnScrollListener(new hx(this));
                fxVar.setOnTouchListener(new View.OnTouchListener(this) {
                    public final d00 f33180b;

                    {
                        this.f33180b = this;
                    }

                    @Override
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        switch (r3) {
                            case 0:
                                org.telegram.ui.ut q6 = org.telegram.ui.ut.q();
                                d00 d00Var = this.f33180b;
                                py pyVar2 = d00Var.P;
                                d00Var.getMeasuredHeight();
                                return q6.s(motionEvent, pyVar2, null, d00Var.f25095g2, c6Var2);
                            case 1:
                                org.telegram.ui.ut q10 = org.telegram.ui.ut.q();
                                d00 d00Var2 = this.f33180b;
                                return q10.s(motionEvent, d00Var2.f25096h0, d00Var2.m0, d00Var2.f25095g2, c6Var2);
                            default:
                                org.telegram.ui.ut q11 = org.telegram.ui.ut.q();
                                d00 d00Var3 = this.f33180b;
                                lx lxVar = d00Var3.D0;
                                d00Var3.getMeasuredHeight();
                                return q11.s(motionEvent, lxVar, d00Var3.A0, d00Var3.f25095g2, c6Var2);
                        }
                    }
                });
                ?? r12 = new km0(this) {
                    public final d00 f24506b;

                    {
                        this.f24506b = this;
                    }

                    @Override
                    public final void d(int i22, View view2) {
                        int i23;
                        String str;
                        switch (r2) {
                            case 0:
                                d00 d00Var = this.f24506b;
                                fx fxVar2 = d00Var.f25096h0;
                                hz hzVar2 = d00Var.f25102j0;
                                hz hzVar3 = d00Var.f25113n0;
                                if (d00Var.f25134t1 != null) {
                                    hzVar3.getClass();
                                    ArrayList arrayList3 = hzVar3.f26995x;
                                    if (fxVar2.getAdapter() == hzVar3) {
                                        if (i22 >= 0) {
                                            int i24 = hzVar3.H;
                                            if (i22 < i24) {
                                                d00Var.f25134t1.v(view2, d00Var.f25100i1.get(i22), null, "gif", true, 0, 0);
                                                return;
                                            }
                                            if (i24 > 0) {
                                                i23 = (i22 - i24) - 1;
                                            } else {
                                                i23 = i22;
                                            }
                                            if (i23 >= 0 && i23 < arrayList3.size()) {
                                                d00Var.f25134t1.v(view2, arrayList3.get(i23), null, hzVar3.f26991n, true, 0, 0);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    } else if (fxVar2.getAdapter() == hzVar2 && i22 >= 0 && i22 < hzVar2.f26995x.size()) {
                                        d00Var.f25134t1.v(view2, hzVar2.f26995x.get(i22), hzVar2.f26994w, hzVar2.f26991n, true, 0, 0);
                                        d00Var.W();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            default:
                                d00 d00Var2 = this.f24506b;
                                s4.i0 adapter = d00Var2.D0.getAdapter();
                                yz yzVar = d00Var2.f25154z0;
                                if (adapter == yzVar) {
                                    str = yzVar.N;
                                } else {
                                    str = null;
                                }
                                String str2 = str;
                                if (view2 instanceof org.telegram.ui.Cells.f8) {
                                    org.telegram.ui.Cells.f8 f8Var = (org.telegram.ui.Cells.f8) view2;
                                    if (f8Var.getSticker() != null && MessageObject.isPremiumSticker(f8Var.getSticker()) && !AccountInstance.getInstance(d00Var2.f25080c1).getUserConfig().isPremium()) {
                                        org.telegram.ui.ut.q().y(f8Var);
                                        return;
                                    }
                                    org.telegram.ui.ut.q().u();
                                    if (!f8Var.f21866r) {
                                        f8Var.f21866r = true;
                                        f8Var.f21865n = 0.5f;
                                        f8Var.f21869x = 0L;
                                        org.telegram.ui.Cells.e8 e8Var = f8Var.f21860a;
                                        e8Var.setAlpha(0.5f * f8Var.H);
                                        e8Var.invalidate();
                                        f8Var.f21867s = System.currentTimeMillis();
                                        f8Var.invalidate();
                                        d00Var2.f25134t1.m(f8Var, f8Var.getSticker(), str2, f8Var.getParentObject(), f8Var.getSendAnimationData(), true, 0);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                };
                this.m0 = r12;
                fxVar.setOnItemClickListener((km0) r12);
                exVar.addView(fxVar, w7.w5.d(-1.0f, -1));
                ix ixVar = new ix(this, context2);
                this.f25116o0 = ixVar;
                exVar.addView(ixVar, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + i12));
                ky kyVar = new ky(this, context2, c6Var2);
                this.f25119p0 = kyVar;
                kyVar.setType(tn0Var);
                kyVar.setUnderlineHeight(AndroidUtilities.getShadowHeight());
                i14 = i19;
                kyVar.setIndicatorColor(A(i14));
                kyVar.setUnderlineColor(A(i21));
                kyVar.setBackgroundColor(A(i20));
                V();
                kyVar.setDelegate(new xw(this, 2));
                hzVar.F("", "", true, true, true);
            } else {
                i14 = i19;
            }
            jx jxVar = new jx(this, context2, z14);
            this.f25147x0 = jxVar;
            MediaDataController.getInstance(this.f25080c1).checkStickers(0);
            MediaDataController.getInstance(this.f25080c1).checkFeaturedStickers();
            lx lxVar = new lx(this, context2);
            this.D0 = lxVar;
            this.f25111m2.a(lxVar);
            mx mxVar = new mx(this);
            this.E0 = mxVar;
            lxVar.setLayoutManager(mxVar);
            mxVar.O = new nx(this);
            lxVar.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f));
            lxVar.setClipToPadding(false);
            ?? obj3 = new Object();
            obj3.f33525a = 2;
            obj3.f33526b = jxVar;
            this.d.add(obj3);
            this.f25154z0 = new yz(this, context2);
            tz tzVar = new tz(this, context2);
            this.f25151y0 = tzVar;
            lxVar.setAdapter(tzVar);
            lxVar.setOnTouchListener(new View.OnTouchListener(this) {
                public final d00 f33180b;

                {
                    this.f33180b = this;
                }

                @Override
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    switch (r3) {
                        case 0:
                            org.telegram.ui.ut q6 = org.telegram.ui.ut.q();
                            d00 d00Var = this.f33180b;
                            py pyVar2 = d00Var.P;
                            d00Var.getMeasuredHeight();
                            return q6.s(motionEvent, pyVar2, null, d00Var.f25095g2, c6Var2);
                        case 1:
                            org.telegram.ui.ut q10 = org.telegram.ui.ut.q();
                            d00 d00Var2 = this.f33180b;
                            return q10.s(motionEvent, d00Var2.f25096h0, d00Var2.m0, d00Var2.f25095g2, c6Var2);
                        default:
                            org.telegram.ui.ut q11 = org.telegram.ui.ut.q();
                            d00 d00Var3 = this.f33180b;
                            lx lxVar2 = d00Var3.D0;
                            d00Var3.getMeasuredHeight();
                            return q11.s(motionEvent, lxVar2, d00Var3.A0, d00Var3.f25095g2, c6Var2);
                    }
                }
            });
            ?? r42 = new km0(this) {
                public final d00 f24506b;

                {
                    this.f24506b = this;
                }

                @Override
                public final void d(int i22, View view2) {
                    int i23;
                    String str;
                    switch (r2) {
                        case 0:
                            d00 d00Var = this.f24506b;
                            fx fxVar2 = d00Var.f25096h0;
                            hz hzVar2 = d00Var.f25102j0;
                            hz hzVar3 = d00Var.f25113n0;
                            if (d00Var.f25134t1 != null) {
                                hzVar3.getClass();
                                ArrayList arrayList3 = hzVar3.f26995x;
                                if (fxVar2.getAdapter() == hzVar3) {
                                    if (i22 >= 0) {
                                        int i24 = hzVar3.H;
                                        if (i22 < i24) {
                                            d00Var.f25134t1.v(view2, d00Var.f25100i1.get(i22), null, "gif", true, 0, 0);
                                            return;
                                        }
                                        if (i24 > 0) {
                                            i23 = (i22 - i24) - 1;
                                        } else {
                                            i23 = i22;
                                        }
                                        if (i23 >= 0 && i23 < arrayList3.size()) {
                                            d00Var.f25134t1.v(view2, arrayList3.get(i23), null, hzVar3.f26991n, true, 0, 0);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                } else if (fxVar2.getAdapter() == hzVar2 && i22 >= 0 && i22 < hzVar2.f26995x.size()) {
                                    d00Var.f25134t1.v(view2, hzVar2.f26995x.get(i22), hzVar2.f26994w, hzVar2.f26991n, true, 0, 0);
                                    d00Var.W();
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        default:
                            d00 d00Var2 = this.f24506b;
                            s4.i0 adapter = d00Var2.D0.getAdapter();
                            yz yzVar = d00Var2.f25154z0;
                            if (adapter == yzVar) {
                                str = yzVar.N;
                            } else {
                                str = null;
                            }
                            String str2 = str;
                            if (view2 instanceof org.telegram.ui.Cells.f8) {
                                org.telegram.ui.Cells.f8 f8Var = (org.telegram.ui.Cells.f8) view2;
                                if (f8Var.getSticker() != null && MessageObject.isPremiumSticker(f8Var.getSticker()) && !AccountInstance.getInstance(d00Var2.f25080c1).getUserConfig().isPremium()) {
                                    org.telegram.ui.ut.q().y(f8Var);
                                    return;
                                }
                                org.telegram.ui.ut.q().u();
                                if (!f8Var.f21866r) {
                                    f8Var.f21866r = true;
                                    f8Var.f21865n = 0.5f;
                                    f8Var.f21869x = 0L;
                                    org.telegram.ui.Cells.e8 e8Var = f8Var.f21860a;
                                    e8Var.setAlpha(0.5f * f8Var.H);
                                    e8Var.invalidate();
                                    f8Var.f21867s = System.currentTimeMillis();
                                    f8Var.invalidate();
                                    d00Var2.f25134t1.m(f8Var, f8Var.getSticker(), str2, f8Var.getParentObject(), f8Var.getSendAnimationData(), true, 0);
                                    return;
                                }
                                return;
                            }
                            return;
                    }
                }
            };
            this.A0 = r42;
            lxVar.setOnItemClickListener((km0) r42);
            lxVar.setGlowColor(A(i20));
            jxVar.addView(lxVar);
            this.f25072a0 = new zl0(lxVar, mxVar);
            ox oxVar = new ox(this, context2);
            this.G0 = oxVar;
            jxVar.addView(oxVar, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + i12));
            nh.d dVar2 = new nh.d(context2, c6Var2);
            this.H0 = dVar2;
            dVar2.setVisibility(8);
            dVar2.setOnBackClickListener(new View.OnClickListener(this) {
                public final d00 f33508b;

                {
                    this.f33508b = this;
                }

                @Override
                public final void onClick(View view2) {
                    pz pzVar;
                    switch (r2) {
                        case 0:
                            cz czVar = this.f33508b.S;
                            xy xyVar = czVar.f25051c;
                            int childCount = xyVar.getChildCount();
                            for (int i212 = 0; i212 < childCount; i212++) {
                                ((nh.c) xyVar.getChildAt(i212)).a(false, true);
                            }
                            czVar.d = 0L;
                            czVar.F.f25074b.a(false, true);
                            czVar.l();
                            return;
                        case 1:
                            yz yzVar = this.f33508b.f25154z0;
                            xz xzVar = yzVar.f33222c;
                            int childCount2 = xzVar.getChildCount();
                            for (int i22 = 0; i22 < childCount2; i22++) {
                                ((nh.c) xzVar.getChildAt(i22)).a(false, true);
                            }
                            yzVar.d = 0L;
                            yzVar.Q.f25071a.a(false, true);
                            yzVar.l();
                            return;
                        case 2:
                            dz dzVar = this.f33508b.f25134t1;
                            if (dzVar != null) {
                                dzVar.w();
                                return;
                            }
                            return;
                        default:
                            d00 d00Var = this.f33508b;
                            int currentItem = d00Var.h.getCurrentItem();
                            if (currentItem == 0) {
                                pzVar = d00Var.V;
                            } else if (currentItem == 1) {
                                pzVar = d00Var.f25116o0;
                            } else {
                                pzVar = d00Var.G0;
                            }
                            if (pzVar != null) {
                                ar arVar = pzVar.d;
                                arVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                arVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                arVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                return;
                            }
                            return;
                    }
                }
            });
            jxVar.addView(dVar2, new FrameLayout.LayoutParams(-1, i12));
            z19 = z14;
            px pxVar = new px(this, context2, c6Var2, m2Var, z19);
            this.B0 = pxVar;
            pxVar.setDragEnabled(true);
            pxVar.setWillNotDraw(false);
            pxVar.setType(tn0Var);
            pxVar.setUnderlineHeight(lxVar.canScrollVertically(-1) ? AndroidUtilities.getShadowHeight() : 0);
            pxVar.setIndicatorColor(A(i14));
            pxVar.setUnderlineColor(A(i21));
            if (viewGroup != null && z19) {
                qx qxVar = new qx(this, context2);
                this.C0 = qxVar;
                qxVar.addView(pxVar, w7.w5.e(-1, 36, 51));
                viewGroup.addView(qxVar, w7.w5.d(-2.0f, -1));
            } else {
                jxVar.addView(pxVar, w7.w5.e(-1, 36, 51));
            }
            X(true);
            pxVar.setDelegate(new xw(this, 4));
            lxVar.setOnScrollListener(new c00(this, 0));
            nh.b bVar2 = new nh.b(context2, c6Var2);
            this.N = bVar2;
            ci.m6 m6Var2 = new ci.m6(context2, 3, c6Var2);
            this.M = m6Var2;
            m6Var2.setVisibility(8);
            m6Var2.addView(bVar2, w7.w5.a(48.0f, 10.0f, 5.0f, 10.0f, 10.0f, -1, 80));
            jxVar.addView(m6Var2, w7.w5.e(-1, -2, 80));
        } else {
            z19 = z14;
        }
        this.f25085e.clear();
        this.f25085e.addAll(this.d);
        rx rxVar = new rx(this, context2);
        this.h = rxVar;
        li.e eVar3 = this.f25111m2;
        eVar3.getClass();
        rxVar.b(new ai.o7(eVar3, 1));
        rxVar.setOverScrollMode(2);
        wy wyVar = new wy(this);
        this.L0 = wyVar;
        rxVar.setAdapter(wyVar);
        sx sxVar = new sx(this, context2);
        this.f25146x = sxVar;
        sxVar.setHapticFeedbackEnabled(true);
        sxVar.setImageResource(R.drawable.smiles_tab_clear);
        int w10 = z16 ? w(0.6f) : A(org.telegram.ui.ActionBar.h6.Re);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        sxVar.setColorFilter(new PorterDuffColorFilter(w10, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        sxVar.setScaleType(scaleType);
        sxVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
        sxVar.setFocusable(true);
        sxVar.setOnClickListener(new Object());
        w7.y5.a(sxVar);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f25125r = frameLayout;
        if (z13) {
            addView(frameLayout, w7.w5.a(100.0f, 0.0f, 0.0f, 0.0f, (AndroidUtilities.getShadowHeight() / AndroidUtilities.density) + 40.0f, -1, 87));
        } else {
            addView(frameLayout, w7.w5.a(100.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 87));
        }
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.f25129s = frameLayout2;
        addView(frameLayout2, w7.w5.a(100.0f, 0.0f, 0.0f, 0.0f, 64.0f, -1, 87));
        FrameLayout frameLayout3 = new FrameLayout(context2);
        this.f25112n = frameLayout3;
        View view2 = new View(context2);
        this.v = view2;
        frameLayout3.addView(view2, new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(40.0f), 83));
        if (z13) {
            addView(frameLayout3, w7.w5.e(-1, 48, 80));
            frameLayout3.addView(sxVar, w7.w5.a(48.0f, 2.0f, 0.0f, 2.0f, 0.0f, 48, 85));
            if (z11) {
                ImageView imageView = new ImageView(context2);
                this.f25150y = imageView;
                imageView.setImageResource(R.drawable.smiles_tab_settings);
                imageView.setColorFilter(new PorterDuffColorFilter(z16 ? w(0.6f) : A(org.telegram.ui.ActionBar.h6.Re), mode));
                imageView.setScaleType(scaleType);
                imageView.setFocusable(true);
                imageView.setContentDescription(LocaleController.getString(R.string.Settings));
                w7.y5.a(imageView);
                frameLayout3.addView(imageView, w7.w5.a(48.0f, 2.0f, 0.0f, 2.0f, 0.0f, 48, 85));
                imageView.setOnClickListener(new View.OnClickListener(this) {
                    public final d00 f33508b;

                    {
                        this.f33508b = this;
                    }

                    @Override
                    public final void onClick(View view22) {
                        pz pzVar;
                        switch (r2) {
                            case 0:
                                cz czVar = this.f33508b.S;
                                xy xyVar = czVar.f25051c;
                                int childCount = xyVar.getChildCount();
                                for (int i212 = 0; i212 < childCount; i212++) {
                                    ((nh.c) xyVar.getChildAt(i212)).a(false, true);
                                }
                                czVar.d = 0L;
                                czVar.F.f25074b.a(false, true);
                                czVar.l();
                                return;
                            case 1:
                                yz yzVar = this.f33508b.f25154z0;
                                xz xzVar = yzVar.f33222c;
                                int childCount2 = xzVar.getChildCount();
                                for (int i22 = 0; i22 < childCount2; i22++) {
                                    ((nh.c) xzVar.getChildAt(i22)).a(false, true);
                                }
                                yzVar.d = 0L;
                                yzVar.Q.f25071a.a(false, true);
                                yzVar.l();
                                return;
                            case 2:
                                dz dzVar = this.f33508b.f25134t1;
                                if (dzVar != null) {
                                    dzVar.w();
                                    return;
                                }
                                return;
                            default:
                                d00 d00Var = this.f33508b;
                                int currentItem = d00Var.h.getCurrentItem();
                                if (currentItem == 0) {
                                    pzVar = d00Var.V;
                                } else if (currentItem == 1) {
                                    pzVar = d00Var.f25116o0;
                                } else {
                                    pzVar = d00Var.G0;
                                }
                                if (pzVar != null) {
                                    ar arVar = pzVar.d;
                                    arVar.requestFocus();
                                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                    arVar.onTouchEvent(obtain);
                                    obtain.recycle();
                                    MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                    arVar.onTouchEvent(obtain2);
                                    obtain2.recycle();
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            ie0 ie0Var = new ie0(context2, c6Var2);
            this.f25142w = ie0Var;
            ie0Var.setViewPager(rxVar);
            ie0Var.setShouldExpand(false);
            ie0Var.setIndicatorHeight(AndroidUtilities.dp(3.0f));
            ie0Var.setIndicatorColor(i0.a.k(A(org.telegram.ui.ActionBar.h6.Oe), 20));
            ie0Var.setUnderlineHeight(0);
            ie0Var.setTabPaddingLeftRight(AndroidUtilities.dp(11.0f));
            ie0Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f));
            frameLayout3.addView(ie0Var, w7.w5.e(-2, 48, 81));
            ie0Var.setOnPageChangeListener(new ux(this, z19));
            ImageView imageView2 = new ImageView(context2);
            this.E = imageView2;
            imageView2.setImageResource(R.drawable.smiles_tab_search);
            imageView2.setColorFilter(new PorterDuffColorFilter(z16 ? w(0.6f) : A(org.telegram.ui.ActionBar.h6.Re), mode));
            imageView2.setScaleType(scaleType);
            imageView2.setContentDescription(LocaleController.getString(R.string.Search));
            imageView2.setFocusable(true);
            imageView2.setVisibility(8);
            frameLayout3.addView(imageView2, w7.w5.a(48.0f, 2.0f, 0.0f, 2.0f, 0.0f, 48, 83));
            imageView2.setOnClickListener(new View.OnClickListener(this) {
                public final d00 f33508b;

                {
                    this.f33508b = this;
                }

                @Override
                public final void onClick(View view22) {
                    pz pzVar;
                    switch (r2) {
                        case 0:
                            cz czVar = this.f33508b.S;
                            xy xyVar = czVar.f25051c;
                            int childCount = xyVar.getChildCount();
                            for (int i212 = 0; i212 < childCount; i212++) {
                                ((nh.c) xyVar.getChildAt(i212)).a(false, true);
                            }
                            czVar.d = 0L;
                            czVar.F.f25074b.a(false, true);
                            czVar.l();
                            return;
                        case 1:
                            yz yzVar = this.f33508b.f25154z0;
                            xz xzVar = yzVar.f33222c;
                            int childCount2 = xzVar.getChildCount();
                            for (int i22 = 0; i22 < childCount2; i22++) {
                                ((nh.c) xzVar.getChildAt(i22)).a(false, true);
                            }
                            yzVar.d = 0L;
                            yzVar.Q.f25071a.a(false, true);
                            yzVar.l();
                            return;
                        case 2:
                            dz dzVar = this.f33508b.f25134t1;
                            if (dzVar != null) {
                                dzVar.w();
                                return;
                            }
                            return;
                        default:
                            d00 d00Var = this.f33508b;
                            int currentItem = d00Var.h.getCurrentItem();
                            if (currentItem == 0) {
                                pzVar = d00Var.V;
                            } else if (currentItem == 1) {
                                pzVar = d00Var.f25116o0;
                            } else {
                                pzVar = d00Var.G0;
                            }
                            if (pzVar != null) {
                                ar arVar = pzVar.d;
                                arVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                arVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                arVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                return;
                            }
                            return;
                    }
                }
            });
        } else {
            addView(frameLayout3, w7.w5.a(48.0f, 0.0f, 0.0f, 2.0f, 0.0f, 56, (LocaleController.isRTL ? 3 : i13) | 80));
            org.telegram.ui.Cells.z i02 = org.telegram.ui.ActionBar.h6.i0(AndroidUtilities.dp(56.0f), A(i20), A(i20));
            w7.y5.a(sxVar);
            sxVar.setPadding(0, 0, AndroidUtilities.dp(2.0f), 0);
            sxVar.setBackground(i02);
            sxVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
            sxVar.setFocusable(true);
            frameLayout3.addView(sxVar, w7.w5.a(48.0f, 2.0f, 0.0f, 2.0f, 0.0f, 48, 51));
            view2.setVisibility(8);
        }
        addView(rxVar, 0, w7.w5.e(-1, -1, 51));
        ai.q4 q4Var = new ai.q4(context2, 22);
        this.N0 = q4Var;
        q4Var.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(6.0f), A(org.telegram.ui.ActionBar.h6.f20807qf)));
        q4Var.setTextColor(A(org.telegram.ui.ActionBar.h6.f20788pf));
        q4Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f));
        q4Var.setGravity(16);
        q4Var.setTextSize(1, 14.0f);
        q4Var.setVisibility(4);
        addView(q4Var, w7.w5.a(-2.0f, 5.0f, 0.0f, 5.0f, 53.0f, -2, 81));
        this.C1 = AndroidUtilities.dp(AndroidUtilities.isTablet() ? 40.0f : 32.0f);
        Field field2 = qv.f29937f;
        qv qvVar = new qv(new pv(context2, c6Var2));
        if (qv.f29937f == null) {
            try {
                field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
                try {
                    field.setAccessible(true);
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                field = null;
            }
            qv.f29937f = field;
        }
        Field field3 = qv.f29937f;
        if (field3 != null) {
            try {
                qvVar.f29939a = (ViewTreeObserver.OnScrollChangedListener) field3.get(qvVar);
                qv.f29937f.set(qvVar, qv.f29938g);
            } catch (Exception unused3) {
                qvVar.f29939a = null;
            }
        }
        this.B1 = qvVar;
        qvVar.f29941c.setOnSelectionUpdateListener(new d(this, 10));
        this.A1 = MessagesController.getGlobalEmojiSettings().getInt("selected_page", 0);
        Emoji.loadRecentEmoji();
        myVar.F(false);
        I(true, z11, z12, false);
        if (Build.VERSION.SDK_INT >= 31) {
            ah.h hVar = new ah.h(false);
            this.f25104j2 = hVar;
            fh.d dVar3 = new fh.d(null);
            dVar3.f9936f = cVar3;
            dVar3.d = hVar;
            dVar3.f9935e = -2;
            ah.c cVar4 = new ah.c(dVar3);
            this.f25109l2 = cVar4;
            cVar4.f549i = LiteMode.isEnabled(262144);
            int dp2 = AndroidUtilities.dp(LiteMode.isEnabled(262144) ? 8.0f : 48.0f);
            cVar4.f544b = dp2;
            cVar4.f545c = dp2;
            cVar4.h = this.f25111m2;
        } else {
            ah.c cVar5 = new ah.c(cVar3);
            this.f25109l2 = cVar5;
            cVar5.h = this.f25111m2;
            this.f25104j2 = null;
        }
        this.f25107k2 = new ph(this, 1);
        setBlurredBackgroundDrawableFactory(this.f25109l2);
        this.f25111m2.b(this);
        this.f25111m2.f15353a = new xw(this, 0);
    }

    public static void a(d00 d00Var, boolean z10) {
        fx fxVar = d00Var.f25096h0;
        if (fxVar != null) {
            int childCount = fxVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = fxVar.getChildAt(i10);
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

    public static void c(d00 d00Var, lz lzVar, String str) {
        String str2;
        String str3;
        boolean z10;
        String str4;
        dz dzVar;
        zc zcVar;
        org.telegram.ui.ActionBar.m2 m2Var = d00Var.Y1;
        int i10 = d00Var.f25080c1;
        ArrayList arrayList = d00Var.f25123q1;
        if (lzVar != null) {
            if (lzVar.getSpan() != null) {
                if (d00Var.f25134t1 != null) {
                    long j3 = lzVar.getSpan().documentId;
                    TLRPC.Document document = lzVar.getSpan().document;
                    qy qyVar = lzVar.f28325e;
                    if (qyVar != null && qyVar.f29952i) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (document == null) {
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            qy qyVar2 = (qy) arrayList.get(i11);
                            int i12 = 0;
                            while (true) {
                                ArrayList arrayList2 = qyVar2.f29948c;
                                if (arrayList2 != null && i12 < arrayList2.size()) {
                                    if (((TLRPC.Document) qyVar2.f29948c.get(i12)).f19808id == j3) {
                                        document = (TLRPC.Document) qyVar2.f29948c.get(i12);
                                        break;
                                    }
                                    i12++;
                                }
                            }
                        }
                    }
                    if (document == null) {
                        document = s5.f(i10, j3);
                    }
                    TLRPC.Document document2 = document;
                    if (document2 != null) {
                        str4 = MessageObject.findAnimatedEmojiEmoticon(document2);
                    } else {
                        str4 = null;
                    }
                    String str5 = str4;
                    if (!MessageObject.isFreeEmoji(document2) && !UserConfig.getInstance(i10).isPremium() && (((dzVar = d00Var.f25134t1) == null || !dzVar.g()) && !d00Var.U0 && !z10)) {
                        d00Var.M(false);
                        if (m2Var != null) {
                            zcVar = zc.a0(m2Var);
                        } else {
                            zcVar = new zc(d00Var.f25125r, d00Var.Z1);
                        }
                        if (!d00Var.f25098h2 && m2Var != null) {
                            zcVar.J(R.raw.saved_messages, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint2)), LocaleController.getString(R.string.Open), new ww(d00Var, 4)).j();
                        } else {
                            zcVar.q(document2, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint)), LocaleController.getString(R.string.PremiumMore), new ww(d00Var, 3)).j();
                        }
                        d00Var.f25098h2 = !d00Var.f25098h2;
                        return;
                    }
                    d00Var.E2 = SystemClock.elapsedRealtime();
                    d00Var.M(true);
                    d00Var.h("animated_" + j3);
                    d00Var.f25134t1.x(j3, document2, str5, lzVar.f28324c);
                    return;
                }
                return;
            }
            d00Var.E2 = SystemClock.elapsedRealtime();
            d00Var.M(true);
            if (str != null) {
                str2 = str;
            } else {
                str2 = (String) lzVar.getTag();
            }
            new SpannableStringBuilder().append((CharSequence) str2);
            if (str == null) {
                if (!lzVar.f28324c && (str3 = Emoji.emojiColor.get(str2)) != null) {
                    str2 = g(str2, str3);
                }
                d00Var.h(str2);
                dz dzVar2 = d00Var.f25134t1;
                if (dzVar2 != null) {
                    dzVar2.l(Emoji.fixEmoji(str2));
                    return;
                }
                return;
            }
            dz dzVar3 = d00Var.f25134t1;
            if (dzVar3 != null) {
                dzVar3.l(Emoji.fixEmoji(str));
            }
        }
    }

    public static void e(d00 d00Var, int i10, int i11) {
        s4.d1 K;
        int[] iArr = d00Var.Q0;
        if (i10 == 1) {
            d00Var.o(i11, d00Var.P);
            return;
        }
        dz dzVar = d00Var.f25134t1;
        if ((dzVar == null || !dzVar.z()) && !d00Var.J0) {
            wm0 y3 = d00Var.y(i10);
            if (i11 > 0 && y3 != null && y3.getVisibility() == 0 && (K = y3.K(0)) != null && K.f47889a.getTop() + d00Var.f25076b1 >= y3.getPaddingTop()) {
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
                d00Var.Y();
            } else {
                d00Var.z(i10).setTranslationY(Math.max(-AndroidUtilities.dp(48.0f), iArr[i10]));
            }
        }
    }

    public static void f(d00 d00Var, boolean z10) {
        int N0;
        iz izVar = d00Var.f25099i0;
        ix ixVar = d00Var.f25116o0;
        fx fxVar = d00Var.f25096h0;
        if (fxVar != null && (fxVar.getAdapter() instanceof hz)) {
            hz hzVar = (hz) fxVar.getAdapter();
            if (!hzVar.f26993s && hzVar.h == 0 && !hzVar.f26995x.isEmpty() && (N0 = izVar.N0()) != -1 && N0 > izVar.B() - 5) {
                String str = hzVar.f26994w;
                String str2 = hzVar.f26992r;
                boolean z11 = hzVar.v;
                hzVar.F(str, str2, true, z11, z11);
            }
        }
        dz dzVar = d00Var.f25134t1;
        if (dzVar != null && dzVar.z()) {
            boolean z12 = false;
            s4.d1 K = fxVar.K(0);
            if (K == null) {
                pz.a(ixVar, true, !z10);
                return;
            }
            if (K.f47889a.getTop() < fxVar.getPaddingTop()) {
                z12 = true;
            }
            pz.a(ixVar, z12, !z10);
        } else if (ixVar != null && fxVar != null) {
            ixVar.f29616a.a(true, !z10);
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
        String v = sc.v.v(str, str2);
        if (str3 != null) {
            v = sc.v.v(v, str3);
        }
        if (z10) {
            return sc.v.v(v, "\u200d➡");
        }
        return v;
    }

    public static void j(int i10, View view) {
        if (view == null) {
            return;
        }
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i10);
    }

    public final int A(int i10) {
        org.telegram.ui.ActionBar.c6 c6Var = this.Z1;
        if (c6Var != null) {
            return c6Var.x0(i10);
        }
        return org.telegram.ui.ActionBar.h6.x0(null, i10, false);
    }

    public final void B() {
        ox oxVar = this.G0;
        if (oxVar != null) {
            oxVar.b();
        }
        ix ixVar = this.f25116o0;
        if (ixVar != null) {
            ixVar.b();
        }
        cx cxVar = this.V;
        if (cxVar != null) {
            cxVar.b();
        }
    }

    public final void D(boolean z10, boolean z11) {
        oz ozVar;
        boolean z12;
        if (this.A1 != 0 && this.f25144w1) {
            this.A1 = 0;
        }
        if (this.A1 == 0 && this.f25140v1) {
            this.A1 = 1;
        }
        int i10 = this.A1;
        rx rxVar = this.h;
        if (i10 != 0 && !z10 && this.f25085e.size() != 1) {
            int i11 = this.A1;
            if (i11 == 1) {
                L(false, false);
                if (!this.f25136u0 && !this.f25139v0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                Q(z12, false);
                if (rxVar.getCurrentItem() != 2) {
                    rxVar.x(2, false);
                }
                px pxVar = this.B0;
                if (pxVar != null) {
                    this.S0 = true;
                    int i12 = this.G1;
                    if (i12 >= 0) {
                        pxVar.m(i12);
                    } else {
                        int i13 = this.F1;
                        if (i13 >= 0) {
                            pxVar.m(i13);
                        } else {
                            pxVar.m(this.E1);
                        }
                    }
                    this.S0 = false;
                    this.E0.h1(0, 0);
                }
            } else if (i11 == 2) {
                L(false, false);
                Q(false, false);
                if (rxVar.getCurrentItem() != 1) {
                    rxVar.x(1, false);
                }
                ky kyVar = this.f25119p0;
                if (kyVar != null) {
                    kyVar.m(0);
                }
                ix ixVar = this.f25116o0;
                if (ixVar != null && (ozVar = ixVar.f29622r) != null) {
                    ozVar.G1(null);
                }
            }
        } else {
            L(true, false);
            Q(false, false);
            if (rxVar.getCurrentItem() != 0) {
                rxVar.x(0, !z10);
            }
            if (z11) {
                AndroidUtilities.runOnUIThread(new ww(this, 5), 350L);
            }
        }
        M(true);
    }

    public final void E() {
        tz tzVar = this.f25151y0;
        if (tzVar != null) {
            tzVar.l();
        }
        yz yzVar = this.f25154z0;
        if (yzVar != null) {
            yzVar.l();
        }
        if (org.telegram.ui.ut.q().E) {
            org.telegram.ui.ut.q().n();
        }
        org.telegram.ui.ut.q().u();
    }

    public final void F(int i10) {
        dz dzVar = this.f25134t1;
        if ((dzVar != null && dzVar.z()) || i10 == 0) {
            return;
        }
        HorizontalScrollView z10 = z(i10);
        this.Q0[i10] = 0;
        z10.setTranslationY(0);
    }

    public final void G(int i10, int i11) {
        dy dyVar = this.Q;
        View m10 = dyVar.m(i10);
        int L0 = dyVar.L0();
        int i12 = 1;
        if ((m10 == null && Math.abs(i10 - L0) > dyVar.J * 9.0f) || !SharedConfig.animationsEnabled()) {
            if (dyVar.L0() < i10) {
                i12 = 0;
            }
            zl0 zl0Var = this.f25075b0;
            zl0Var.f33430b = i12;
            zl0Var.d(i10, i11, false, false);
            return;
        }
        this.J0 = true;
        ci.l1 l1Var = new ci.l1(this, this.P.getContext(), 1);
        l1Var.f48058a = i10;
        l1Var.f14270p = i11;
        dyVar.w0(l1Var);
    }

    public final void H(int i10, int i11) {
        mx mxVar = this.E0;
        View m10 = mxVar.m(i10);
        int L0 = mxVar.L0();
        int i12 = 1;
        if (m10 == null && Math.abs(i10 - L0) > 40) {
            if (mxVar.L0() < i10) {
                i12 = 0;
            }
            zl0 zl0Var = this.f25072a0;
            zl0Var.f33430b = i12;
            zl0Var.d(i10, i11, false, false);
            return;
        }
        this.J0 = true;
        this.D0.x0(i10);
    }

    public final void I(boolean z10, boolean z11, boolean z12, boolean z13) {
        ArrayList arrayList = this.f25085e;
        arrayList.clear();
        boolean z14 = false;
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.d;
            if (i10 >= arrayList2.size()) {
                break;
            }
            if (((zz) arrayList2.get(i10)).f33525a == 0 && z10) {
                arrayList.add((zz) arrayList2.get(i10));
            }
            if (((zz) arrayList2.get(i10)).f33525a == 1 && z12) {
                arrayList.add((zz) arrayList2.get(i10));
            }
            if (((zz) arrayList2.get(i10)).f33525a == 2 && z11) {
                arrayList.add((zz) arrayList2.get(i10));
            }
            i10++;
        }
        ie0 ie0Var = this.f25142w;
        if (ie0Var != null) {
            if (arrayList.size() > 1) {
                z14 = true;
            }
            AndroidUtilities.updateViewVisibilityAnimated(ie0Var, z14, 1.0f, z13);
        }
        rx rxVar = this.h;
        if (rxVar != null) {
            rxVar.setAdapter(null);
            rxVar.setAdapter(this.L0);
            if (ie0Var != null) {
                ie0Var.setViewPager(rxVar);
            }
        }
    }

    public final void J(final nh.b bVar, final TLObject tLObject, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final boolean z10, boolean z11) {
        String formatPluralString;
        yz yzVar;
        cz czVar;
        if (stickerSet != null) {
            if (!z10 || (czVar = this.S) == null || czVar.d == stickerSet.f19829id) {
                if (!z10 && (yzVar = this.f25154z0) != null && yzVar.d != stickerSet.f19829id) {
                    return;
                }
                final boolean isStickerPackInstalled = MediaDataController.getInstance(this.f25080c1).isStickerPackInstalled(stickerSet.f19829id);
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
                bVar.f16610h0.a(!isStickerPackInstalled, z11);
                bVar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        int i10;
                        d00 d00Var = d00.this;
                        MediaDataController mediaDataController = MediaDataController.getInstance(d00Var.f25080c1);
                        Context context = d00Var.getContext();
                        if (isStickerPackInstalled) {
                            i10 = 0;
                        } else {
                            i10 = 2;
                        }
                        int i11 = i10;
                        org.telegram.ui.ActionBar.m2 m2Var = d00Var.Y1;
                        FrameLayout frameLayout = d00Var.f25129s;
                        nh.b bVar2 = bVar;
                        TLObject tLObject2 = tLObject;
                        TLRPC.StickerSet stickerSet2 = stickerSet;
                        TLRPC.Document document2 = document;
                        boolean z12 = z10;
                        mediaDataController.toggleStickerSet(context, tLObject2, document2, i11, m2Var, frameLayout, false, true, new i2.c1(d00Var, bVar2, tLObject2, stickerSet2, document2, z12, 10), false);
                        d00Var.J(bVar2, tLObject2, stickerSet2, document2, z12, true);
                    }
                });
            }
        }
    }

    public final void K(long j3, boolean z10, boolean z11) {
        int i10;
        View childAt;
        float f7;
        ie0 ie0Var = this.f25142w;
        if (ie0Var != null) {
            this.f25140v1 = z10;
            this.f25144w1 = z11;
            if (!z11 && !z10) {
                this.f25137u1 = 0L;
            } else {
                this.f25137u1 = j3;
            }
            if (z11) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            LinearLayout linearLayout = ie0Var.d;
            if (i10 >= linearLayout.getChildCount()) {
                childAt = null;
            } else {
                childAt = linearLayout.getChildAt(i10);
            }
            if (childAt != null) {
                if (this.f25137u1 != 0) {
                    f7 = 0.15f;
                } else {
                    f7 = 1.0f;
                }
                childAt.setAlpha(f7);
                rx rxVar = this.h;
                if (z11) {
                    if (this.f25137u1 != 0 && rxVar.getCurrentItem() != 0) {
                        L(true, true);
                        Q(false, true);
                        rxVar.x(0, false);
                    }
                } else if (this.f25137u1 != 0 && rxVar.getCurrentItem() != 1) {
                    L(false, true);
                    Q(false, true);
                    rxVar.x(1, false);
                }
            }
        }
    }

    public final void L(boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        float f12;
        sx sxVar = this.f25146x;
        if (!z10 || sxVar.getTag() != null) {
            if ((!z10 && sxVar.getTag() != null) || this.f25115n2) {
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
            sxVar.setTag(num);
            int i10 = 0;
            float f13 = 0.0f;
            if (z11) {
                if (z10) {
                    sxVar.setVisibility(0);
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.F = animatorSet2;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(sxVar, View.ALPHA, f11);
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(sxVar, View.SCALE_X, f12);
                if (z10) {
                    f13 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(sxVar, View.SCALE_Y, f13));
                this.F.setDuration(200L);
                this.F.setInterpolator(js.f27628g);
                this.F.addListener(new yx(this, z10, 0));
                this.F.start();
                return;
            }
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            sxVar.setAlpha(f7);
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            sxVar.setScaleX(f10);
            if (z10) {
                f13 = 1.0f;
            }
            sxVar.setScaleY(f13);
            if (!z10) {
                i10 = 4;
            }
            sxVar.setVisibility(i10);
        }
    }

    public final void M(boolean z10) {
        Integer num;
        this.H = 0.0f;
        dz dzVar = this.f25134t1;
        if (dzVar != null && dzVar.z()) {
            z10 = false;
        }
        FrameLayout frameLayout = this.f25112n;
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
                this.W.setInterpolator(js.f27628g);
                this.W.addListener(new t8(this, 19));
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
        TLRPC.Chat chat = MessagesController.getInstance(this.f25080c1).getChat(Long.valueOf(this.f25137u1));
        if (chat != null) {
            ai.q4 q4Var = this.N0;
            if (z10) {
                if (!ChatObject.hasAdminRights(chat) && (tL_chatBannedRights = chat.default_banned_rights) != null && (tL_chatBannedRights.send_stickers || (z11 && tL_chatBannedRights.send_plain))) {
                    org.telegram.ui.ActionBar.m2 m2Var = this.Y1;
                    if (!(m2Var instanceof org.telegram.ui.eo) || !((org.telegram.ui.eo) m2Var).N6()) {
                        if (z11) {
                            q4Var.setText(LocaleController.getString(R.string.GlobalAttachEmojiRestricted));
                        } else if (z12) {
                            q4Var.setText(LocaleController.getString(R.string.GlobalAttachGifRestricted));
                        } else {
                            q4Var.setText(LocaleController.getString(R.string.GlobalAttachStickersRestricted));
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
                            q4Var.setText(LocaleController.getString(R.string.AttachPlainRestrictedForever));
                        } else if (z12) {
                            q4Var.setText(LocaleController.getString(R.string.AttachGifRestrictedForever));
                        } else {
                            q4Var.setText(LocaleController.getString(R.string.AttachStickersRestrictedForever));
                        }
                    } else {
                        if (z11) {
                            q4Var.setText(LocaleController.formatString("AttachPlainRestricted", R.string.AttachPlainRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                        }
                        if (z12) {
                            q4Var.setText(LocaleController.formatString("AttachGifRestricted", R.string.AttachGifRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                        } else {
                            q4Var.setText(LocaleController.formatString("AttachStickersRestricted", R.string.AttachStickersRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                        }
                    }
                }
                q4Var.setVisibility(0);
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
                f7 = q4Var.getAlpha();
            } else {
                f7 = 1.0f;
            }
            float f11 = 0.0f;
            if (!z10) {
                f10 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(q4Var, View.ALPHA, f7, f10);
            if (z10) {
                translationY = AndroidUtilities.dp(12.0f);
            } else {
                translationY = q4Var.getTranslationY();
            }
            if (!z10) {
                f11 = AndroidUtilities.dp(12.0f);
            }
            animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(q4Var, View.TRANSLATION_Y, translationY, f11));
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
            this.J2.setInterpolator(js.h);
            this.J2.start();
        }
    }

    public final void Q(boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        float f12;
        ImageView imageView = this.f25150y;
        if (imageView != null && !this.f25118o2) {
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
                        this.G.setInterpolator(js.f27628g);
                        this.G.addListener(new yx(this, z10, 1));
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
            int i10 = (this.f25124q2 > 0.0f ? 1 : (this.f25124q2 == 0.0f ? 0 : -1));
            FrameLayout frameLayout = this.f25112n;
            if (i10 >= 0) {
                f10 += getMeasuredHeight() - this.f25124q2;
            } else if (frameLayout.getTop() - f10 < 0.0f || !this.f25145w2) {
                f10 = 0.0f;
            }
            float lerp = (-f10) + AndroidUtilities.lerp(AndroidUtilities.dp(50.0f), -this.f25121p2, this.F2.f16087e);
            frameLayout.setTranslationY(lerp);
            if (this.f25082d0) {
                this.f25125r.setTranslationY(lerp);
            }
        }
    }

    public final void S() {
        pz pzVar;
        boolean z10;
        int A;
        int A2;
        int A3;
        int A4;
        int A5;
        int A6;
        int A7;
        int A8;
        rw rwVar;
        int A9;
        int A10;
        int A11;
        int A12;
        int A13;
        int A14;
        int A15;
        int A16;
        int A17;
        boolean z11 = this.f25136u0;
        View view = this.v;
        if (!z11) {
            setBackground(null);
            view.setBackground(null);
        } else if (!AndroidUtilities.isInMultiwindow && !this.N1) {
            int i10 = org.telegram.ui.ActionBar.h6.He;
            setBackgroundColor(A(i10));
            if (this.f25082d0) {
                view.setBackgroundColor(A(i10));
            }
        } else {
            Drawable background = getBackground();
            if (background != null) {
                background.setColorFilter(new PorterDuffColorFilter(A(org.telegram.ui.ActionBar.h6.He), PorterDuff.Mode.MULTIPLY));
            }
        }
        hy hyVar = this.I;
        if (hyVar != null) {
            if (this.f25136u0) {
                hyVar.setBackgroundColor(A(org.telegram.ui.ActionBar.h6.He));
                this.O.setBackgroundColor(A(org.telegram.ui.ActionBar.h6.Ke));
            } else {
                hyVar.setBackground(null);
            }
        }
        qv qvVar = this.B1;
        if (qvVar != null) {
            qvVar.f29941c.a();
        }
        int i11 = 0;
        while (true) {
            pzVar = this.V;
            z10 = this.f25101i2;
            if (i11 >= 3) {
                break;
            }
            if (i11 == 0) {
                pzVar = this.G0;
            } else if (i11 != 1) {
                pzVar = this.f25116o0;
            }
            if (pzVar != null) {
                ar arVar = pzVar.d;
                FrameLayout frameLayout = pzVar.f29621n;
                View view2 = pzVar.f29620f;
                if (this.f25136u0) {
                    view2.setBackgroundColor(A(org.telegram.ui.ActionBar.h6.He));
                } else {
                    view2.setBackground(null);
                }
                pzVar.f29619e.setBackgroundColor(A(org.telegram.ui.ActionBar.h6.Ke));
                jo0 jo0Var = pzVar.f29618c;
                if (z10) {
                    A14 = w(0.4f);
                } else {
                    A14 = A(org.telegram.ui.ActionBar.h6.Je);
                }
                jo0Var.a(A14);
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
                arVar.setHintTextColor(A16);
                if (z10) {
                    A17 = w(0.8f);
                } else {
                    A17 = A(org.telegram.ui.ActionBar.h6.G6);
                }
                arVar.setTextColor(A17);
            }
            i11++;
        }
        Paint paint = this.f25131s1;
        if (paint != null) {
            paint.setColor(A(org.telegram.ui.ActionBar.h6.f20511af));
        }
        py pyVar = this.P;
        if (pyVar != null) {
            pyVar.setGlowColor(A(org.telegram.ui.ActionBar.h6.He));
        }
        lx lxVar = this.D0;
        if (lxVar != null) {
            lxVar.setGlowColor(A(org.telegram.ui.ActionBar.h6.He));
        }
        px pxVar = this.B0;
        if (pxVar != null) {
            pxVar.setIndicatorColor(A(org.telegram.ui.ActionBar.h6.Qe));
            pxVar.setUnderlineColor(A(org.telegram.ui.ActionBar.h6.Ke));
            if (this.f25136u0) {
                pxVar.setBackgroundColor(A(org.telegram.ui.ActionBar.h6.He));
            } else {
                pxVar.setBackground(null);
            }
        }
        ky kyVar = this.f25119p0;
        if (kyVar != null) {
            kyVar.setIndicatorColor(A(org.telegram.ui.ActionBar.h6.Qe));
            kyVar.setUnderlineColor(A(org.telegram.ui.ActionBar.h6.Ke));
            if (this.f25136u0) {
                kyVar.setBackgroundColor(A(org.telegram.ui.ActionBar.h6.He));
            } else {
                kyVar.setBackground(null);
            }
        }
        sx sxVar = this.f25146x;
        if (sxVar != null) {
            if (z10) {
                A13 = w(0.6f);
            } else {
                A13 = A(org.telegram.ui.ActionBar.h6.Re);
            }
            sxVar.setColorFilter(new PorterDuffColorFilter(A13, PorterDuff.Mode.MULTIPLY));
            if (pzVar == null) {
                Drawable background3 = sxVar.getBackground();
                int i12 = org.telegram.ui.ActionBar.h6.He;
                org.telegram.ui.ActionBar.h6.C1(background3, A(i12), false);
                org.telegram.ui.ActionBar.h6.C1(sxVar.getBackground(), A(i12), true);
            }
        }
        ImageView imageView = this.f25150y;
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
        ai.q4 q4Var = this.N0;
        if (q4Var != null) {
            ((ShapeDrawable) q4Var.getBackground()).getPaint().setColor(A(org.telegram.ui.ActionBar.h6.f20807qf));
            q4Var.setTextColor(A(org.telegram.ui.ActionBar.h6.f20788pf));
        }
        hz hzVar = this.f25102j0;
        if (hzVar != null) {
            jz jzVar = hzVar.f26989e;
            ImageView imageView3 = jzVar.f27676a;
            int i13 = org.telegram.ui.ActionBar.h6.Le;
            imageView3.setColorFilter(new PorterDuffColorFilter(A(i13), PorterDuff.Mode.MULTIPLY));
            jzVar.f27677b.setTextColor(A(i13));
            jzVar.f27678c.setProgressColor(A(org.telegram.ui.ActionBar.h6.f20631h6));
        }
        this.f25088e2 = new PorterDuffColorFilter(A(org.telegram.ui.ActionBar.h6.Oh), PorterDuff.Mode.SRC_IN);
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
        if (hyVar != null && (rwVar = hyVar.f32206y) != null) {
            rwVar.d();
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
        org.telegram.ui.ActionBar.s5 s5Var = this.a2;
        if (s5Var != null) {
            if (z10) {
                A3 = w(0.4f);
            } else {
                A3 = A(org.telegram.ui.ActionBar.h6.Ne);
            }
            org.telegram.ui.ActionBar.h6.z1(s5Var, A3, false);
            if (z10) {
                A4 = w(0.8f);
            } else {
                A4 = A(org.telegram.ui.ActionBar.h6.Oe);
            }
            org.telegram.ui.ActionBar.h6.z1(s5Var, A4, true);
        }
        org.telegram.ui.ActionBar.s5 s5Var2 = this.f25077b2;
        if (s5Var2 != null) {
            if (z10) {
                A = w(0.4f);
            } else {
                A = A(org.telegram.ui.ActionBar.h6.Qe);
            }
            org.telegram.ui.ActionBar.h6.z1(s5Var2, A, false);
            if (z10) {
                A2 = w(0.8f);
            } else {
                A2 = A(org.telegram.ui.ActionBar.h6.Qe);
            }
            org.telegram.ui.ActionBar.h6.z1(s5Var2, A2, true);
        }
    }

    public final void T() {
        py pyVar = this.P;
        if (pyVar != null) {
            for (int i10 = 0; i10 < pyVar.getChildCount(); i10++) {
                View childAt = pyVar.getChildAt(i10);
                if (childAt instanceof uy) {
                    ((uy) childAt).a(true);
                }
            }
        }
    }

    public final void U(int i10) {
        int i11;
        if (!this.f25090f0) {
            int i12 = -1;
            if (i10 != -1) {
                int size = getRecentEmoji().size() + (this.f25082d0 ? 1 : 0);
                my myVar = this.R;
                int i13 = myVar.f28676c;
                ArrayList arrayList = myVar.f28683x;
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
                        ArrayList<qy> emojipacks = getEmojipacks();
                        int size2 = arrayList.size() - 1;
                        while (true) {
                            if (size2 < 0) {
                                break;
                            } else if (((Integer) arrayList.get(size2)).intValue() <= i10) {
                                qy qyVar = (qy) this.f25123q1.get(size2);
                                while (i14 < emojipacks.size()) {
                                    long j3 = emojipacks.get(i14).f29947b.f19829id;
                                    long j10 = qyVar.f29947b.f19829id;
                                    if (j3 == j10 && (!qyVar.f29951g || (!qyVar.f29950f && !this.f25120p1.contains(Long.valueOf(j10))))) {
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
        oz ozVar;
        int i11;
        boolean z12;
        boolean z13;
        ky kyVar = this.f25119p0;
        int currentPosition = kyVar.getCurrentPosition();
        int i12 = this.f25126r0;
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
        boolean isEmpty = this.f25100i1.isEmpty();
        kyVar.d(false);
        this.f25126r0 = -2;
        this.f25130s0 = -2;
        this.f25133t0 = -2;
        Drawable[] drawableArr = this.Z0;
        if (!isEmpty) {
            this.f25126r0 = 0;
            kyVar.b(0, drawableArr[0]).setContentDescription(LocaleController.getString(R.string.RecentStickers));
            i10 = 1;
        } else {
            i10 = 0;
        }
        this.f25130s0 = i10;
        kyVar.b(1, drawableArr[1]).setContentDescription(LocaleController.getString(R.string.FeaturedGifs));
        this.f25133t0 = i10 + 1;
        AndroidUtilities.dp(13.0f);
        AndroidUtilities.dp(11.0f);
        int i13 = this.f25080c1;
        ArrayList<String> arrayList = MessagesController.getInstance(i13).gifSearchEmojies;
        int size = arrayList.size();
        int i14 = 0;
        while (i14 < size) {
            String str = arrayList.get(i14);
            Emoji.EmojiDrawable emojiDrawable = Emoji.getEmojiDrawable(str);
            if (emojiDrawable != null) {
                TLRPC.Document emojiAnimatedSticker = MediaDataController.getInstance(i13).getEmojiAnimatedSticker(str);
                String i15 = hg.c.i(i14 + 3, "tab");
                int i16 = kyVar.f31234x;
                kyVar.f31234x = i16 + 1;
                ly0 ly0Var = (ly0) kyVar.f31224n.get(i15);
                if (ly0Var != null) {
                    kyVar.g(i15, ly0Var, i16);
                    i11 = currentPosition;
                    z12 = z11;
                } else {
                    i11 = currentPosition;
                    z12 = z11;
                    ly0Var = new ly0(kyVar.getContext(), 2);
                    ly0Var.setFocusable(true);
                    ly0Var.setOnClickListener(new nn0(kyVar, 2));
                    ly0Var.setExpanded(kyVar.f31217f0);
                    ly0Var.a(kyVar.f31220i0);
                    kyVar.f31214e.addView(ly0Var, i16);
                }
                ly0Var.d = false;
                ly0Var.setTag(R.id.index_tag, Integer.valueOf(i16));
                ly0Var.setTag(R.id.parent_tag, emojiDrawable);
                ly0Var.setTag(R.id.object_tag, emojiAnimatedSticker);
                if (i16 == kyVar.f31235y) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                ly0Var.setSelected(z13);
                kyVar.h.put(i15, ly0Var);
                ly0Var.setContentDescription(str);
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
        kyVar.h();
        kyVar.q();
        if (z10 && isEmpty) {
            kyVar.m(this.f25130s0);
            ix ixVar = this.f25116o0;
            if (ixVar != null && (ozVar = ixVar.f29622r) != null) {
                ozVar.G1(null);
                return;
            }
            return;
        }
        WeakHashMap weakHashMap = r0.i0.f46981a;
        if (kyVar.isLaidOut()) {
            if (!isEmpty && !z14) {
                kyVar.k(i17 + 1, 0);
            } else if (isEmpty && z14) {
                kyVar.k(i17 - 1, 0);
            }
        }
    }

    public final void W() {
        hz hzVar;
        int size = this.f25100i1.size();
        long calcDocumentsHash = MediaDataController.calcDocumentsHash(this.f25100i1, Integer.MAX_VALUE);
        ArrayList<TLRPC.Document> recentGifs = MediaDataController.getInstance(this.f25080c1).getRecentGifs();
        this.f25100i1 = recentGifs;
        long calcDocumentsHash2 = MediaDataController.calcDocumentsHash(recentGifs, Integer.MAX_VALUE);
        if ((this.f25119p0 != null && size == 0 && !this.f25100i1.isEmpty()) || (size != 0 && this.f25100i1.isEmpty())) {
            V();
        }
        if ((size != this.f25100i1.size() || calcDocumentsHash != calcDocumentsHash2) && (hzVar = this.f25113n0) != null) {
            hzVar.l();
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
        px pxVar = this.B0;
        if (pxVar != null) {
            fc1 fc1Var = pxVar.f31214e;
            if (pxVar.f31231s != null) {
                return;
            }
            this.F1 = -2;
            this.G1 = -2;
            this.H1 = -2;
            this.I1 = -2;
            this.f25086e0 = false;
            this.E1 = 0;
            int currentPosition = pxVar.getCurrentPosition();
            boolean z17 = true;
            if (getParent() != null && getVisibility() == 0 && (this.f25152y1.size() != 0 || this.f25155z1.size() != 0)) {
                z11 = true;
            } else {
                z11 = false;
            }
            pxVar.d(z11);
            int i11 = this.f25080c1;
            MediaDataController mediaDataController = MediaDataController.getInstance(i11);
            SharedPreferences emojiSettings = MessagesController.getEmojiSettings(i11);
            ArrayList arrayList3 = this.f25110m1;
            arrayList3.clear();
            ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = mediaDataController.getFeaturedStickerSets();
            int size = featuredStickerSets.size();
            for (int i12 = 0; i12 < size; i12++) {
                TLRPC.StickerSetCovered stickerSetCovered = featuredStickerSets.get(i12);
                if (!mediaDataController.isStickerPackInstalled(stickerSetCovered.set.f19829id)) {
                    arrayList3.add(stickerSetCovered);
                }
            }
            b00 b00Var = this.F0;
            if (b00Var != null) {
                b00Var.l();
            }
            boolean isEmpty = featuredStickerSets.isEmpty();
            long j3 = 0;
            Drawable[] drawableArr = this.Y0;
            if (!isEmpty && (arrayList3.isEmpty() || emojiSettings.getLong("featured_hidden", 0L) == featuredStickerSets.get(0).set.f19829id)) {
                if (mediaDataController.getUnreadStickerSets().isEmpty()) {
                    i10 = 2;
                } else {
                    i10 = 3;
                }
                ly0 c10 = pxVar.c(i10, drawableArr[i10]);
                c10.h.setText(LocaleController.getString(R.string.FeaturedStickersShort));
                c10.setContentDescription(LocaleController.getString(R.string.FeaturedStickers));
                int i13 = this.E1;
                this.H1 = i13;
                this.E1 = i13 + 1;
            }
            if (!this.f25106k1.isEmpty()) {
                int i14 = this.E1;
                this.G1 = i14;
                this.E1 = i14 + 1;
                ly0 c11 = pxVar.c(1, drawableArr[1]);
                c11.h.setText(LocaleController.getString(R.string.FavoriteStickersShort));
                c11.setContentDescription(LocaleController.getString(R.string.FavoriteStickers));
            }
            if (!this.f25103j1.isEmpty()) {
                int i15 = this.E1;
                this.F1 = i15;
                this.E1 = i15 + 1;
                ly0 c12 = pxVar.c(0, drawableArr[0]);
                c12.h.setText(LocaleController.getString(R.string.RecentStickersShort));
                c12.setContentDescription(LocaleController.getString(R.string.RecentStickers));
            }
            ArrayList arrayList4 = this.f25083d1;
            arrayList4.clear();
            org.telegram.ui.ActionBar.c6 c6Var = null;
            this.f25097h1 = null;
            this.f25091f1 = -1;
            this.f25087e1 = -10;
            if (this.G2 == null || z10) {
                this.G2 = new ArrayList(mediaDataController.getStickerSets(0));
            }
            ArrayList<TLRPC.TL_messages_stickerSet> arrayList5 = this.G2;
            int i16 = 0;
            while (true) {
                TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.f25148x1;
                if (i16 >= stickerSetCoveredArr.length) {
                    break;
                }
                TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCoveredArr[i16];
                long j10 = j3;
                if (stickerSetCovered2 != null) {
                    TLRPC.TL_messages_stickerSet stickerSetById = mediaDataController.getStickerSetById(stickerSetCovered2.set.f19829id);
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
                long j12 = MessagesController.getEmojiSettings(i11).getLong("group_hide_stickers_" + this.J1.f19803id, -1L);
                TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(this.J1.f19803id));
                if (chat != null && this.J1.stickerset != null && ChatObject.hasAdminRights(chat)) {
                    TLRPC.StickerSet stickerSet3 = this.J1.stickerset;
                    if (stickerSet3 != null) {
                        if (j12 == stickerSet3.f19829id) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        this.f25094g1 = z16;
                    }
                } else {
                    if (j12 != -1) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    this.f25094g1 = z15;
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
                        if (this.f25094g1) {
                            this.f25087e1 = arrayList4.size();
                            arrayList4.add(tL_messages_stickerSet3);
                        } else {
                            this.f25087e1 = 0;
                            arrayList4.add(0, tL_messages_stickerSet3);
                        }
                        if (!this.J1.can_set_stickers) {
                            tL_messages_stickerSet3 = null;
                        }
                        this.f25097h1 = tL_messages_stickerSet3;
                    }
                } else if (chatFull.can_set_stickers) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = new TLRPC.TL_messages_stickerSet();
                    if (this.f25094g1) {
                        this.f25087e1 = arrayList4.size();
                        arrayList4.add(tL_messages_stickerSet4);
                    } else {
                        this.f25087e1 = 0;
                        arrayList4.add(0, tL_messages_stickerSet4);
                    }
                }
            }
            int i18 = 0;
            while (i18 < arrayList4.size()) {
                if (i18 == this.f25087e1) {
                    TLRPC.Chat chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(this.J1.f19803id));
                    if (chat2 == null) {
                        arrayList4.remove(0);
                        i18--;
                    } else {
                        this.f25086e0 = z17;
                        String str = "chat" + chat2.f19802id;
                        int i19 = pxVar.f31234x;
                        pxVar.f31234x = i19 + 1;
                        ly0 ly0Var = (ly0) pxVar.f31224n.get(str);
                        if (ly0Var != null) {
                            pxVar.g(str, ly0Var, i19);
                        } else {
                            ly0Var = new ly0(pxVar.getContext(), 0);
                            ly0Var.setFocusable(z17);
                            ly0Var.setOnClickListener(new nn0(pxVar, 0));
                            fc1Var.addView(ly0Var, i19);
                            ly0Var.f28319w = z17;
                            j9 j9Var = new j9(c6Var);
                            j9Var.u(AndroidUtilities.dp(14.0f));
                            j9Var.k(UserConfig.selectedAccount, chat2);
                            int i20 = pxVar.f31207a;
                            y9 y9Var = ly0Var.f28314e;
                            y9Var.setLayerNum(i20);
                            y9Var.e(chat2, j9Var);
                            y9Var.setAspectFit(z17);
                            ly0Var.setExpanded(pxVar.f31217f0);
                            ly0Var.a(pxVar.f31220i0);
                            ly0Var.h.setText(chat2.title);
                        }
                        ly0Var.d = z17;
                        ly0Var.setTag(R.id.index_tag, Integer.valueOf(i19));
                        if (i19 == pxVar.f31235y) {
                            z14 = z17;
                        } else {
                            z14 = false;
                        }
                        ly0Var.setSelected(z14);
                        pxVar.h.put(str, ly0Var);
                    }
                    z12 = z17;
                } else {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet5 = (TLRPC.TL_messages_stickerSet) arrayList4.get(i18);
                    TLRPC.StickerSet stickerSet5 = tL_messages_stickerSet5.set;
                    if (stickerSet5 != null && stickerSet5.thumb_document_id != j11) {
                        for (int i21 = 0; i21 < tL_messages_stickerSet5.documents.size(); i21++) {
                            document = tL_messages_stickerSet5.documents.get(i21);
                            if (document != null && tL_messages_stickerSet5.set.thumb_document_id == document.f19808id) {
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
                    String str2 = "set" + tL_messages_stickerSet5.set.f19829id;
                    int i22 = pxVar.f31234x;
                    pxVar.f31234x = i22 + 1;
                    ly0 ly0Var2 = (ly0) pxVar.f31224n.get(str2);
                    if (ly0Var2 != null) {
                        pxVar.g(str2, ly0Var2, i22);
                        z12 = z17;
                    } else {
                        ly0Var2 = new ly0(pxVar.getContext(), 0);
                        ly0Var2.setFocusable(z17);
                        z12 = z17;
                        ly0Var2.setOnClickListener(new nn0(pxVar, 1));
                        ly0Var2.setExpanded(pxVar.f31217f0);
                        ly0Var2.a(pxVar.f31220i0);
                        fc1Var.addView(ly0Var2, i22);
                    }
                    ly0Var2.f28314e.setLayerNum(pxVar.f31207a);
                    ly0Var2.d = false;
                    ly0Var2.setTag(closestPhotoSizeWithSize);
                    ly0Var2.setTag(R.id.index_tag, Integer.valueOf(i22));
                    ly0Var2.setTag(R.id.parent_tag, tL_messages_stickerSet5);
                    ly0Var2.setTag(R.id.object_tag, document);
                    if (i22 == pxVar.f31235y) {
                        z13 = z12;
                    } else {
                        z13 = false;
                    }
                    ly0Var2.setSelected(z13);
                    pxVar.h.put(str2, ly0Var2);
                    ly0Var2.setContentDescription(tL_messages_stickerSet5.set.title + ", " + LocaleController.getString(R.string.AccDescrStickerSet));
                }
                i18++;
                z17 = z12;
                c6Var = null;
            }
            pxVar.h();
            pxVar.q();
            if (currentPosition != 0) {
                pxVar.k(currentPosition, currentPosition);
            }
            p();
        }
    }

    public final void Y() {
        boolean z10;
        int i10;
        qx qxVar = this.C0;
        px pxVar = this.B0;
        if (pxVar != null && qxVar == null && this.f25134t1 != null) {
            pxVar.setTranslationY(this.f25134t1.p() * (-AndroidUtilities.dp(50.0f)));
        }
        if (qxVar == null) {
            return;
        }
        if (getVisibility() == 0 && this.K0 && this.f25134t1.p() != 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        qxVar.setVisibility(i10);
        if (z10) {
            Rect rect = this.f25149x2;
            rect.setEmpty();
            this.h.getChildVisibleRect(this.f25147x0, rect, null);
            float p5 = this.f25134t1.p() * AndroidUtilities.dp(50.0f);
            int i11 = rect.left;
            if (i11 != 0 || p5 != 0.0f) {
                this.X1 = false;
            }
            qxVar.setTranslationX(i11);
            float translationY = (((getTranslationY() + getTop()) - qxVar.getTop()) - pxVar.getExpandedOffset()) - p5;
            if (qxVar.getTranslationY() != translationY) {
                qxVar.setTranslationY(translationY);
                qxVar.invalidate();
            }
        }
        if (this.X1 && z10 && this.P0) {
            pxVar.i(this.W1, true);
            return;
        }
        this.X1 = false;
        pxVar.i(this.W1, false);
    }

    public final void Z() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        org.telegram.ui.Cells.s3 s3Var;
        LongSparseArray longSparseArray = this.f25155z1;
        LongSparseArray longSparseArray2 = this.f25152y1;
        int i10 = this.f25080c1;
        lx lxVar = this.D0;
        if (lxVar != null) {
            try {
                int childCount = lxVar.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = lxVar.getChildAt(i11);
                    if ((childAt instanceof org.telegram.ui.Cells.s3) && ((gm0) lxVar.T(childAt)) != null) {
                        org.telegram.ui.Cells.s3 s3Var2 = (org.telegram.ui.Cells.s3) childAt;
                        ArrayList<Long> unreadStickerSets = MediaDataController.getInstance(i10).getUnreadStickerSets();
                        TLRPC.StickerSetCovered stickerSet = s3Var2.getStickerSet();
                        if (unreadStickerSets != null && unreadStickerSets.contains(Long.valueOf(stickerSet.set.f19829id))) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        int i12 = 0;
                        while (true) {
                            TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.f25148x1;
                            if (i12 < stickerSetCoveredArr.length) {
                                TLRPC.StickerSetCovered stickerSetCovered = stickerSetCoveredArr[i12];
                                if (stickerSetCovered != null) {
                                    s3Var = s3Var2;
                                    if (stickerSetCovered.set.f19829id == stickerSet.set.f19829id) {
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
                            MediaDataController.getInstance(i10).markFeaturedStickersByIdAsRead(false, stickerSet.set.f19829id);
                        }
                        if (longSparseArray2.indexOfKey(stickerSet.set.f19829id) >= 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (longSparseArray.indexOfKey(stickerSet.set.f19829id) >= 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z12 || z13) {
                            if (z12 && s3Var2.f22666r) {
                                longSparseArray2.remove(stickerSet.set.f19829id);
                                z12 = false;
                            } else if (z13 && !s3Var2.f22666r) {
                                longSparseArray.remove(stickerSet.set.f19829id);
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
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
    }

    @Override
    public final void b(int i10) {
        setBottomInset(i10);
    }

    @Override
    public final void d(float f7) {
        this.f25124q2 = f7;
        R();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        Utilities.Callback callback;
        TLRPC.StickerSet stickerSet;
        int i12 = NotificationCenter.stickersDidLoad;
        my myVar = this.R;
        ww wwVar = this.L2;
        if (i10 == i12) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (this.f25151y0 != null) {
                    X(((Boolean) objArr[1]).booleanValue());
                    Z();
                    E();
                    p();
                }
            } else if (((Integer) objArr[0]).intValue() == 5) {
                if (((Boolean) objArr[1]).booleanValue()) {
                    AndroidUtilities.cancelRunOnUIThread(wwVar);
                    AndroidUtilities.runOnUIThread(wwVar, 100L);
                    return;
                }
                myVar.F(false);
            }
        } else if (i10 == NotificationCenter.groupPackUpdated) {
            long longValue = ((Long) objArr[0]).longValue();
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            TLRPC.ChatFull chatFull = this.J1;
            if (chatFull != null && chatFull.f19803id == longValue && booleanValue) {
                myVar.F(true);
            }
        } else if (i10 == NotificationCenter.recentDocumentsDidLoad) {
            boolean booleanValue2 = ((Boolean) objArr[0]).booleanValue();
            int intValue = ((Integer) objArr[1]).intValue();
            if (booleanValue2 || intValue == 0 || intValue == 2) {
                k(booleanValue2);
            }
        } else if (i10 == NotificationCenter.featuredStickersDidLoad) {
            Z();
            ie0 ie0Var = this.f25142w;
            if (ie0Var != null) {
                int childCount = ie0Var.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    ie0Var.getChildAt(i13).invalidate();
                }
            }
            X(false);
        } else if (i10 == NotificationCenter.featuredEmojiDidLoad) {
            if (myVar != null) {
                myVar.F(false);
            }
        } else {
            int i14 = NotificationCenter.groupStickersDidLoad;
            cz czVar = this.S;
            if (i10 == i14) {
                Long l4 = (Long) objArr[0];
                long longValue2 = l4.longValue();
                if (objArr.length > 1) {
                    tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) objArr[1];
                } else {
                    tL_messages_stickerSet = null;
                }
                if (tL_messages_stickerSet != null) {
                    yz yzVar = this.f25154z0;
                    if (yzVar != null && yzVar.d == longValue2 && yzVar.f33224f.size() < tL_messages_stickerSet.documents.size()) {
                        yzVar.f33224f = tL_messages_stickerSet.documents;
                        yzVar.l();
                    }
                    if (czVar != null && czVar.d == longValue2 && czVar.f25053f.size() < tL_messages_stickerSet.documents.size()) {
                        czVar.f25053f = tL_messages_stickerSet.documents;
                        czVar.l();
                    }
                }
                TLRPC.ChatFull chatFull2 = this.J1;
                if (chatFull2 != null && (stickerSet = chatFull2.stickerset) != null && stickerSet.f19829id == longValue2) {
                    X(false);
                }
                HashMap hashMap = this.f25127r1;
                if (hashMap.containsKey(l4) && objArr.length >= 2 && ((Utilities.Callback) hashMap.get(l4)) != null && tL_messages_stickerSet != null && (callback = (Utilities.Callback) hashMap.remove(l4)) != null) {
                    callback.run(tL_messages_stickerSet);
                }
                AndroidUtilities.cancelRunOnUIThread(wwVar);
                AndroidUtilities.runOnUIThread(wwVar, 100L);
                return;
            }
            int i15 = NotificationCenter.emojiLoaded;
            py pyVar = this.P;
            if (i10 == i15) {
                lx lxVar = this.D0;
                if (lxVar != null) {
                    int childCount2 = lxVar.getChildCount();
                    for (int i16 = 0; i16 < childCount2; i16++) {
                        View childAt = lxVar.getChildAt(i16);
                        if ((childAt instanceof org.telegram.ui.Cells.o8) || (childAt instanceof org.telegram.ui.Cells.f8)) {
                            childAt.invalidate();
                        }
                    }
                }
                if (pyVar != null) {
                    pyVar.invalidate();
                    int childCount3 = pyVar.getChildCount();
                    for (int i17 = 0; i17 < childCount3; i17++) {
                        View childAt2 = pyVar.getChildAt(i17);
                        if (childAt2 instanceof lz) {
                            childAt2.invalidate();
                        }
                    }
                }
                qv qvVar = this.B1;
                if (qvVar != null) {
                    qvVar.f29941c.invalidate();
                }
                ky kyVar = this.f25119p0;
                if (kyVar != null) {
                    fc1 fc1Var = kyVar.f31214e;
                    int childCount4 = fc1Var.getChildCount();
                    for (int i18 = 0; i18 < childCount4; i18++) {
                        fc1Var.getChildAt(i18).invalidate();
                    }
                }
            } else if (i10 == NotificationCenter.newEmojiSuggestionsAvailable) {
                if (pyVar != null && this.f25082d0) {
                    if ((this.V.f29618c.f27581k == 2 || pyVar.getAdapter() == czVar) && !TextUtils.isEmpty(czVar.v)) {
                        czVar.F(czVar.v, true);
                    }
                }
            } else if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                if (myVar != null) {
                    myVar.F(false);
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
            if (this.f25112n.getVisibility() != 8 && !this.f25136u0 && this.f25143w0) {
                canvas.drawColor(i0.a.k(-1, 25));
            }
            boolean drawChild = super.drawChild(canvas, view, j3);
            float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(this.f25121p2);
            if (navigationBarThirdButtonsFactor > 0.0f) {
                int m12 = org.telegram.ui.ActionBar.h6.m1(navigationBarThirdButtonsFactor, A(org.telegram.ui.ActionBar.h6.He));
                int i10 = this.B2;
                GradientDrawable gradientDrawable = this.A2;
                if (i10 != m12) {
                    gradientDrawable.setColors(new int[]{m12, org.telegram.ui.ActionBar.h6.m1(0.66f, m12), i0.a.k(m12, 0)});
                    this.B2 = m12;
                }
                gradientDrawable.setBounds(0, getMeasuredHeight() - this.f25121p2, getMeasuredWidth(), getMeasuredHeight());
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

    public ArrayList<qy> getEmojipacks() {
        ArrayList<qy> arrayList = new ArrayList<>();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f25123q1;
            if (i10 < arrayList2.size()) {
                qy qyVar = (qy) arrayList2.get(i10);
                boolean z10 = qyVar.f29951g;
                ArrayList arrayList3 = this.f25120p1;
                if ((!z10 && (qyVar.f29950f || arrayList3.contains(Long.valueOf(qyVar.f29947b.f19829id)))) || (qyVar.f29951g && !qyVar.f29950f && !arrayList3.contains(Long.valueOf(qyVar.f29947b.f19829id)))) {
                    arrayList.add(qyVar);
                }
                i10++;
            } else {
                return arrayList;
            }
        }
    }

    public ArrayList<String> getRecentEmoji() {
        if (this.f25081c2) {
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
        px pxVar = this.B0;
        if (pxVar == null) {
            return 0.0f;
        }
        return pxVar.getExpandedOffset();
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
                if (!this.f25081c2) {
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
        zx zxVar = new zx(getContext(), i11);
        zxVar.f48058a = !z10 ? 1 : 0;
        x(i10).w0(zxVar);
    }

    public final void k(boolean z10) {
        if (z10) {
            W();
            return;
        }
        int size = this.f25103j1.size();
        int size2 = this.f25106k1.size();
        int i10 = this.f25080c1;
        this.f25103j1 = MediaDataController.getInstance(i10).getRecentStickers(0, true);
        this.f25106k1 = MediaDataController.getInstance(i10).getRecentStickers(2);
        if (UserConfig.getInstance(i10).isPremium()) {
            this.l1 = MediaDataController.getInstance(i10).getRecentStickers(7);
        } else {
            this.l1 = new ArrayList();
        }
        for (int i11 = 0; i11 < this.f25106k1.size(); i11++) {
            TLRPC.Document document = (TLRPC.Document) this.f25106k1.get(i11);
            int i12 = 0;
            while (true) {
                if (i12 < this.f25103j1.size()) {
                    TLRPC.Document document2 = (TLRPC.Document) this.f25103j1.get(i12);
                    if (document2.dc_id == document.dc_id && document2.f19808id == document.f19808id) {
                        this.f25103j1.remove(i12);
                        break;
                    }
                    i12++;
                }
            }
        }
        if (MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            int i13 = 0;
            while (i13 < this.f25106k1.size()) {
                if (MessageObject.isPremiumSticker((TLRPC.Document) this.f25106k1.get(i13))) {
                    this.f25106k1.remove(i13);
                    i13--;
                }
                i13++;
            }
            int i14 = 0;
            while (i14 < this.f25103j1.size()) {
                if (MessageObject.isPremiumSticker((TLRPC.Document) this.f25103j1.get(i14))) {
                    this.f25103j1.remove(i14);
                    i14--;
                }
                i14++;
            }
        }
        if (size != this.f25103j1.size() || size2 != this.f25106k1.size()) {
            X(false);
        }
        tz tzVar = this.f25151y0;
        if (tzVar != null) {
            tzVar.l();
        }
        p();
    }

    public final void l(boolean z10) {
        int i10;
        boolean z11;
        dz dzVar = this.f25134t1;
        me.b bVar = this.f25074b;
        py pyVar = this.P;
        cx cxVar = this.V;
        if (dzVar != null && dzVar.z()) {
            s4.d1 K = pyVar.K(0);
            if (K == null) {
                pz.a(cxVar, true, !z10);
            } else {
                if (K.f47889a.getTop() < pyVar.getPaddingTop()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                pz.a(cxVar, z11, !z10);
            }
            N(false, !z10);
            cxVar.setTranslationY(bVar.f16087e * AndroidUtilities.dp(15.0f));
        } else if (cxVar != null && pyVar != null) {
            s4.d1 K2 = pyVar.K(0);
            if (K2 != null) {
                i10 = K2.f47889a.getTop();
            } else {
                i10 = -this.f25076b1;
            }
            cxVar.setTranslationY((bVar.f16087e * AndroidUtilities.dp(15.0f)) + i10);
            cxVar.f29616a.a(false, !z10);
            m(Math.round(this.I.getTranslationY()));
        }
    }

    public final void m(int i10) {
        ObjectAnimator objectAnimator = this.R0[1];
        if (objectAnimator != null && objectAnimator.isRunning()) {
            return;
        }
        boolean z10 = false;
        s4.d1 K = this.P.K(0);
        int dp = AndroidUtilities.dp(38.0f) + i10;
        if (dp > 0 && (K == null || K.f47889a.getBottom() < dp)) {
            z10 = true;
        }
        N(z10, !this.K1);
    }

    @Override
    public final void n(int i10, float f7, float f10, me.e eVar) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = 4;
        if (i10 == 0) {
            r(false);
            float f11 = 1.0f - this.f25071a.f16087e;
            ox oxVar = this.G0;
            oxVar.setAlpha(f11);
            if (f11 > 0.0f) {
                i13 = 0;
            } else {
                i13 = 4;
            }
            oxVar.setVisibility(i13);
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
            this.f25147x0.invalidate();
        } else if (i10 == 1) {
            l(false);
            float f13 = 1.0f - this.f25074b.f16087e;
            cx cxVar = this.V;
            cxVar.setAlpha(f13);
            if (f13 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            cxVar.setVisibility(i11);
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

    public final void o(int i10, View view) {
        py pyVar;
        s4.d1 K;
        int i11;
        hy hyVar = this.I;
        int[] iArr = this.Q0;
        if (view == null) {
            iArr[1] = 0;
            hyVar.setTranslationY(0);
        } else if (view.getVisibility() == 0 && !this.f25090f0) {
            dz dzVar = this.f25134t1;
            if (dzVar == null || !dzVar.z()) {
                if (i10 > 0 && (pyVar = this.P) != null && pyVar.getVisibility() == 0 && (K = pyVar.K(0)) != null) {
                    int top = K.f47889a.getTop();
                    if (this.f25082d0) {
                        i11 = this.f25076b1;
                    } else {
                        i11 = 0;
                    }
                    if (top + i11 >= pyVar.getPaddingTop()) {
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
                hyVar.setTranslationY(Math.max(-AndroidUtilities.dp(36.0f), iArr[1]));
            }
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
        NotificationCenter.ObserversGroup add = NotificationCenter.getInstance(this.f25080c1).createWeakObserversGroup(this).addGlobal(NotificationCenter.emojiLoaded).add(NotificationCenter.newEmojiSuggestionsAvailable).add(NotificationCenter.groupPackUpdated);
        this.I2 = add;
        if (this.f25151y0 != null) {
            add.add(NotificationCenter.stickersDidLoad).add(NotificationCenter.recentDocumentsDidLoad).add(NotificationCenter.featuredStickersDidLoad).add(NotificationCenter.groupStickersDidLoad).add(NotificationCenter.currentUserPremiumStatusChanged);
            AndroidUtilities.runOnUIThread(new ww(this, 0));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qv qvVar = this.B1;
        if (qvVar != null && qvVar.isShowing()) {
            qvVar.dismiss();
        }
        org.telegram.ui.ut q6 = org.telegram.ui.ut.q();
        if (q6.f42578l == this.f25095g2) {
            q6.W = null;
            q6.f42565a0 = null;
            q6.Y = null;
            q6.f42578l = null;
            q6.f42569c0 = null;
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
        boolean z11 = this.f25082d0;
        if (!z10 && !this.N1) {
            if (this.L1 != 0) {
                if (!this.H2) {
                    setOutlineProvider(null);
                    setClipToOutline(false);
                    setElevation(0.0f);
                }
                if (this.f25136u0) {
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
            if (z11 && this.f25136u0) {
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
        px pxVar = this.B0;
        if (pxVar != null && (L0 = this.E0.L0()) != -1) {
            int i10 = this.G1;
            if (i10 <= 0 && (i10 = this.F1) <= 0) {
                i10 = this.E1;
            }
            pxVar.k(this.f25151y0.F(L0), i10);
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
                this.B0.k(this.f25151y0.F(L02), i12);
            }
        } else if (i10 == 2) {
            s4.i0 adapter = this.f25096h0.getAdapter();
            hz hzVar = this.f25113n0;
            if (adapter == hzVar && hzVar.I >= 0 && this.f25130s0 >= 0 && this.f25126r0 >= 0 && (L0 = this.f25099i0.L0()) != -1) {
                if (L0 >= hzVar.I) {
                    i11 = this.f25130s0;
                } else {
                    i11 = this.f25126r0;
                }
                this.f25119p0.k(i11, 0);
            }
        }
    }

    public final void r(boolean z10) {
        int i10;
        dz dzVar = this.f25134t1;
        me.b bVar = this.f25071a;
        lx lxVar = this.D0;
        boolean z11 = false;
        ox oxVar = this.G0;
        if (dzVar != null && dzVar.z()) {
            s4.d1 K = lxVar.K(0);
            if (K == null) {
                pz.a(oxVar, true, !z10);
            } else {
                if (K.f47889a.getTop() < lxVar.getPaddingTop()) {
                    z11 = true;
                }
                pz.a(oxVar, z11, !z10);
            }
            oxVar.setTranslationY(bVar.f16087e * AndroidUtilities.dp(15.0f));
        } else if (oxVar != null && lxVar != null) {
            s4.d1 K2 = lxVar.K(0);
            if (K2 != null) {
                i10 = K2.f47889a.getTop();
            } else {
                i10 = -this.f25076b1;
            }
            oxVar.setTranslationY((bVar.f16087e * AndroidUtilities.dp(15.0f)) + i10);
            oxVar.f29616a.a(false, !z10);
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

    public void setBlurredBackgroundDrawableFactory(ah.c cVar) {
        org.telegram.ui.ActionBar.c6 c6Var = this.Z1;
        View view = this.f25146x;
        if (view != null) {
            ch.d c10 = cVar.c(view, null, false);
            c10.o(eh.b.d(c6Var));
            c10.q(AndroidUtilities.dp(18.0f));
            c10.p(AndroidUtilities.dp(6.0f));
            view.setBackground(c10);
        }
        View view2 = this.E;
        if (view2 != null) {
            ch.d c11 = cVar.c(view2, null, false);
            c11.o(eh.b.d(c6Var));
            c11.q(AndroidUtilities.dp(18.0f));
            c11.p(AndroidUtilities.dp(6.0f));
            view2.setBackground(c11);
        }
        View view3 = this.f25142w;
        if (view3 != null) {
            ch.d c12 = cVar.c(view3, null, false);
            c12.o(eh.b.d(c6Var));
            c12.q(AndroidUtilities.dp(18.0f));
            c12.p(AndroidUtilities.dp(6.0f));
            view3.setBackground(c12);
        }
        View view4 = this.f25150y;
        if (view4 != null) {
            ch.d c13 = cVar.c(view4, null, false);
            c13.o(eh.b.d(c6Var));
            c13.q(AndroidUtilities.dp(18.0f));
            c13.p(AndroidUtilities.dp(6.0f));
            view4.setBackground(c13);
        }
    }

    public void setBottomInset(int i10) {
        if (this.f25121p2 != i10) {
            this.f25121p2 = i10;
            j(i10, this.K);
            j(i10, this.M);
            j(AndroidUtilities.dp(44.0f) + i10, this.P);
            j(AndroidUtilities.dp(44.0f) + i10, this.D0);
            j(AndroidUtilities.dp(44.0f) + i10, this.f25096h0);
            FrameLayout frameLayout = this.f25129s;
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

    public void setDelegate(dz dzVar) {
        this.f25134t1 = dzVar;
    }

    public void setDragListener(jy jyVar) {
        this.O0 = jyVar;
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        ox oxVar = this.G0;
        if (oxVar != null) {
            oxVar.d.setEnabled(z10);
        }
        ix ixVar = this.f25116o0;
        if (ixVar != null) {
            ixVar.d.setEnabled(z10);
        }
        cx cxVar = this.V;
        if (cxVar != null) {
            cxVar.d.setEnabled(z10);
        }
    }

    public void setForseMultiwindowLayout(boolean z10) {
        this.N1 = z10;
    }

    public void setShouldDrawBackground(boolean z10) {
        if (this.f25136u0 != z10) {
            this.f25136u0 = z10;
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
                int i11 = this.f25080c1;
                NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.stickersDidLoad);
                if (this.f25151y0 != null) {
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
            gg.f1 f1Var = this.T0;
            if (f1Var != null) {
                f1Var.a();
            }
        }
    }

    public final void t(long j3, boolean z10) {
        pz pzVar;
        s4.d0 d0Var;
        View view;
        wm0 wm0Var;
        int i10;
        int i11;
        TLRPC.TL_messages_stickerSet stickerSetById;
        tz tzVar;
        int E;
        AnimatorSet animatorSet = this.M0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.M0 = null;
        }
        int currentItem = this.h.getCurrentItem();
        int i12 = 2;
        if (currentItem == 2 && j3 != -1 && (stickerSetById = MediaDataController.getInstance(this.f25080c1).getStickerSetById(j3)) != null && (E = (tzVar = this.f25151y0).E(stickerSetById)) >= 0 && E < tzVar.h()) {
            H(E, AndroidUtilities.dp(48.0f));
        }
        int i13 = 0;
        hz hzVar = this.f25102j0;
        if (hzVar != null) {
            hzVar.K = false;
        }
        int i14 = 0;
        while (i14 < 3) {
            wm0 wm0Var2 = this.D0;
            wm0 wm0Var3 = this.f25096h0;
            ix ixVar = this.f25116o0;
            wm0 wm0Var4 = this.P;
            if (i14 == 0) {
                pzVar = this.V;
                d0Var = this.Q;
                view = this.I;
                wm0Var = wm0Var4;
            } else if (i14 == 1) {
                d0Var = this.f25099i0;
                view = this.f25119p0;
                wm0Var = wm0Var3;
                pzVar = ixVar;
            } else {
                pzVar = this.G0;
                d0Var = this.E0;
                view = this.B0;
                wm0Var = wm0Var2;
            }
            if (pzVar == null) {
                i11 = i13;
                i10 = i12;
            } else {
                int i15 = i13;
                oz ozVar = pzVar.f29622r;
                int i16 = i12;
                pzVar.d.setText("");
                if (ozVar != null) {
                    ozVar.G1(null);
                    ozVar.E1();
                }
                int i17 = this.f25076b1;
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
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(wm0Var, property, fArr2);
                        float[] fArr3 = new float[1];
                        fArr3[i15] = AndroidUtilities.dp(36.0f);
                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(pzVar, property, fArr3);
                        Animator[] animatorArr = new Animator[3];
                        animatorArr[i15] = ofFloat;
                        animatorArr[1] = ofFloat2;
                        animatorArr[i16] = ofFloat3;
                        animatorSet2.playTogether(animatorArr);
                    } else {
                        float[] fArr4 = new float[1];
                        fArr4[i15] = AndroidUtilities.dp(36.0f) - i17;
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(wm0Var, property, fArr4);
                        Animator[] animatorArr2 = new Animator[1];
                        animatorArr2[i15] = ofFloat4;
                        animatorSet2.playTogether(animatorArr2);
                    }
                    this.M0.setDuration(200L);
                    this.M0.setInterpolator(js.h);
                    this.M0.addListener(new ai.z4(this, d0Var, wm0Var, 5));
                    this.M0.start();
                    i11 = i15;
                    i10 = i16;
                } else {
                    if (pzVar != ixVar) {
                        pzVar.setTranslationY(AndroidUtilities.dp(36.0f) - i17);
                    }
                    i10 = i16;
                    if (view != null && i14 != i10) {
                        view.setTranslationY(0.0f);
                    }
                    if (wm0Var == wm0Var2) {
                        i11 = i15;
                        wm0Var.setPadding(i11, AndroidUtilities.dp(36.0f), i11, AndroidUtilities.dp(44.0f) + this.f25121p2);
                    } else {
                        i11 = i15;
                        if (wm0Var == wm0Var3) {
                            wm0Var.setPadding(i11, AndroidUtilities.dp(40.0f), i11, AndroidUtilities.dp(44.0f) + this.f25121p2);
                        } else {
                            if (wm0Var == wm0Var4) {
                                wm0Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f) + this.f25121p2);
                            }
                            i11 = 0;
                        }
                    }
                    d0Var.h1(i11, i11);
                }
            }
            i14++;
            i12 = i10;
            i13 = i11;
        }
        int i18 = i13;
        if (!z10) {
            this.f25134t1.i(i18);
        }
    }

    public final void u(boolean z10) {
        t(-1L, z10);
    }

    public final void v(boolean z10) {
        tz tzVar;
        boolean z11 = this.N2;
        this.N2 = z10;
        if (z11 && !z10) {
            int i10 = this.A1;
            if (i10 == 0) {
                my myVar = this.R;
                if (myVar != null) {
                    myVar.F(false);
                }
            } else if (i10 == 1) {
                hz hzVar = this.f25113n0;
                if (hzVar != null) {
                    hzVar.l();
                }
            } else if (i10 == 2 && (tzVar = this.f25151y0) != null) {
                tzVar.l();
            }
        }
    }

    public final int w(float f7) {
        return i0.a.k(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Wk, this.Z1), (int) (f7 * 255.0f));
    }

    public final s4.s x(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return this.f25099i0;
                }
                throw new IllegalArgumentException(hg.c.i(i10, "Unexpected argument: "));
            }
            return this.Q;
        }
        return this.E0;
    }

    public final wm0 y(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return this.f25096h0;
                }
                throw new IllegalArgumentException(hg.c.i(i10, "Unexpected argument: "));
            }
            return this.P;
        }
        return this.D0;
    }

    public final HorizontalScrollView z(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return this.f25119p0;
                }
                throw new IllegalArgumentException(hg.c.i(i10, "Unexpected argument: "));
            }
            return this.I;
        }
        return this.B0;
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
