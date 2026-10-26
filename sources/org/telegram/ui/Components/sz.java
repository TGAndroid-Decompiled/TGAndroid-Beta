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
public class sz extends FrameLayout implements org.telegram.ui.ActionBar.p6, oe.d, NotificationCenter.NotificationCenterDelegate, rh.a {
    public static final int S2 = 0;
    public final pw A0;
    public int A1;
    public int A2;
    public final dx B0;
    public final fv B1;
    public ArrayList B2;
    public final ex C0;
    public final int C1;
    public int C2;
    public final zw D0;
    public final int[] D1;
    public long D2;
    public final ImageView E;
    public final ax E0;
    public int E1;
    public final oe.b E2;
    public AnimatorSet F;
    public qz F0;
    public int F1;
    public ArrayList F2;
    public AnimatorSet G;
    public final cx G0;
    public int G1;
    public Drawable G2;
    public float H;
    public final ph.d H0;
    public int H1;
    public int H2;
    public final ux I;
    public boolean I0;
    public int I1;
    public int I2;
    public final px J;
    public boolean J0;
    public TLRPC.ChatFull J1;
    public int J2;
    public final bh.p K;
    public boolean K0;
    public boolean K1;
    public int K2;
    public final ph.b L;
    public final ky L0;
    public int L1;
    public boolean L2;
    public final bh.p M;
    public AnimatorSet M0;
    public final ag.w0 M1;
    public NotificationCenter.ObserversGroup M2;
    public final ph.b N;
    public final bi.md N0;
    public boolean N1;
    public AnimatorSet N2;
    public final View O;
    public wx O0;
    public int O1;
    public e2.o0 O2;
    public final dy P;
    public boolean P0;
    public boolean P1;
    public final lw P2;
    public final qx Q;
    public final int[] Q0;
    public boolean Q1;
    public boolean Q2;
    public final zx R;
    public final ObjectAnimator[] R0;
    public bz R1;
    public boolean R2;
    public final sy S;
    public boolean S0;
    public float S1;
    public qz T;
    public ig.f1 T0;
    public float T1;
    public final ph.d U;
    public boolean U0;
    public float U1;
    public final rw V;
    public boolean V0;
    public float V1;
    public AnimatorSet W;
    public String[] W0;
    public float W1;
    public final Drawable[] X0;
    public boolean X1;
    public final Drawable[] Y0;
    public final org.telegram.ui.ActionBar.r2 Y1;
    public final Drawable[] Z0;
    public final org.telegram.ui.ActionBar.u6 Z1;
    public final oe.b f32710a;
    public final pl0 f32711a0;
    public final String[] f32712a1;
    public final org.telegram.ui.ActionBar.k6 a2;
    public final oe.b f32713b;
    public final pl0 f32714b0;
    public final int f32715b1;
    public final org.telegram.ui.ActionBar.k6 f32716b2;
    public int f32717c;
    public boolean f32718c0;
    public final int f32719c1;
    public final boolean f32720c2;
    public final ArrayList d;
    public final boolean f32721d0;
    public final ArrayList f32722d1;
    public LongSparseArray f32723d2;
    public final ArrayList e;
    public boolean f32724e0;
    public int f32725e1;
    public PorterDuffColorFilter f32726e2;
    public boolean f32727f;
    public boolean f32728f0;
    public int f32729f1;
    public final m.g3 f32730f2;
    public final tw f32731g0;
    public boolean f32732g1;
    public final lx f32733g2;
    public final fx h;
    public final uw f32734h0;
    public TLRPC.TL_messages_stickerSet f32735h1;
    public boolean f32736h2;
    public final yy f32737i0;
    public ArrayList f32738i1;
    public final boolean f32739i2;
    public final xy f32740j0;
    public ArrayList f32741j1;
    public final ch.f f32742j2;
    public final az f32743k0;
    public ArrayList f32744k1;
    public final kh f32745k2;
    public final HashMap f32746l0;
    public ArrayList l1;
    public final hh.c f32747l2;
    public final pw m0;
    public final ArrayList f32748m1;
    public final ch.b f32749m2;
    public final FrameLayout f32750n;
    public final xy f32751n0;
    public final ArrayList f32752n1;
    public final oi.q f32753n2;
    public final ww f32754o0;
    public final ArrayList f32755o1;
    public boolean f32756o2;
    public final xx f32757p0;
    public final ArrayList f32758p1;
    public boolean f32759p2;
    public boolean f32760q0;
    public final ArrayList f32761q1;
    public int f32762q2;
    public final FrameLayout f32763r;
    public int f32764r0;
    public final HashMap f32765r1;
    public float f32766r2;
    public final FrameLayout f32767s;
    public int f32768s0;
    public final Paint f32769s1;
    public View f32770s2;
    public int f32771t0;
    public ty f32772t1;
    public int f32773t2;
    public boolean f32774u0;
    public long f32775u1;
    public int f32776u2;
    public final View v;
    public boolean f32777v0;
    public boolean f32778v1;
    public long f32779v2;
    public final wd0 f32780w;
    public boolean f32781w0;
    public boolean f32782w1;
    public boolean f32783w2;
    public final gx f32784x;
    public final xw f32785x0;
    public final TLRPC.StickerSetCovered[] f32786x1;
    public boolean f32787x2;
    public final ImageView f32788y;
    public final jz f32789y0;
    public final LongSparseArray f32790y1;
    public final Rect f32791y2;
    public final nz f32792z0;
    public final LongSparseArray f32793z1;
    public final GradientDrawable f32794z2;

    public sz(org.telegram.ui.ActionBar.r2 r2Var, boolean z10, boolean z11, boolean z12, Context context, boolean z13, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z14, final org.telegram.ui.ActionBar.u6 u6Var, boolean z15, boolean z16) {
        super(context);
        org.telegram.ui.ActionBar.k6 k6Var;
        int A;
        zx zxVar;
        lw lwVar;
        boolean z17;
        int i10;
        boolean z18;
        final org.telegram.ui.ActionBar.u6 u6Var2;
        oi.q qVar;
        int i11;
        int i12;
        boolean z19;
        Field field;
        ds dsVar = ds.h;
        this.f32710a = new oe.b(0, this, dsVar, 320L, false);
        this.f32713b = new oe.b(1, this, dsVar, 320L, false);
        this.f32717c = 2;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.e = new ArrayList();
        this.f32718c0 = true;
        this.f32743k0 = new az(this);
        this.f32746l0 = new HashMap();
        this.f32760q0 = true;
        this.f32764r0 = -2;
        this.f32768s0 = -2;
        this.f32771t0 = -2;
        this.f32774u0 = true;
        this.f32781w0 = true;
        this.I0 = true;
        this.Q0 = new int[3];
        this.R0 = new ObjectAnimator[3];
        int i13 = UserConfig.selectedAccount;
        this.f32719c1 = i13;
        this.f32722d1 = new ArrayList();
        this.f32738i1 = new ArrayList();
        this.f32741j1 = new ArrayList();
        this.f32744k1 = new ArrayList();
        this.l1 = new ArrayList();
        this.f32748m1 = new ArrayList();
        this.f32752n1 = new ArrayList();
        new ArrayList();
        this.f32755o1 = new ArrayList();
        this.f32758p1 = new ArrayList();
        this.f32761q1 = new ArrayList();
        this.f32765r1 = new HashMap();
        this.f32786x1 = new TLRPC.StickerSetCovered[10];
        this.f32790y1 = new LongSparseArray();
        this.f32793z1 = new LongSparseArray();
        this.D1 = new int[2];
        this.F1 = -2;
        this.G1 = -2;
        this.H1 = -2;
        this.I1 = -2;
        this.L1 = -1;
        this.f32730f2 = new m.g3(this, 16);
        this.f32733g2 = new lx(this);
        this.f32736h2 = true;
        oi.q qVar2 = new oi.q();
        this.f32753n2 = qVar2;
        this.f32766r2 = -1.0f;
        this.f32773t2 = -1;
        this.f32776u2 = -1;
        this.f32779v2 = -1L;
        this.f32783w2 = false;
        this.f32787x2 = true;
        this.f32791y2 = new Rect();
        this.f32794z2 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.E2 = new oe.b(0, new mw(this, 3), dsVar, 380L, true);
        this.P2 = new lw(this, 1);
        this.Q2 = false;
        this.f32774u0 = z14;
        this.Y1 = r2Var;
        this.f32720c2 = z10;
        this.Z1 = u6Var;
        this.f32739i2 = z16;
        hh.c cVar = new hh.c();
        this.f32747l2 = cVar;
        cVar.a(A(org.telegram.ui.ActionBar.y6.f23356d6));
        if (z15) {
            u(true);
        }
        i0.a.o(A(org.telegram.ui.ActionBar.y6.Wk), 30);
        int dp = AndroidUtilities.dp(50.0f);
        this.f32715b1 = dp;
        this.f32721d0 = z13;
        this.X0 = new Drawable[]{org.telegram.ui.ActionBar.y6.V(context, R.drawable.smiles_tab_smiles, z16 ? v(0.4f) : A(org.telegram.ui.ActionBar.y6.Re), z16 ? v(0.8f) : A(org.telegram.ui.ActionBar.y6.Oe)), org.telegram.ui.ActionBar.y6.V(context, R.drawable.smiles_tab_gif, z16 ? v(0.4f) : A(org.telegram.ui.ActionBar.y6.Re), z16 ? v(0.8f) : A(org.telegram.ui.ActionBar.y6.Oe)), org.telegram.ui.ActionBar.y6.V(context, R.drawable.smiles_tab_stickers, z16 ? v(0.4f) : A(org.telegram.ui.ActionBar.y6.Re), z16 ? v(0.8f) : A(org.telegram.ui.ActionBar.y6.Oe))};
        org.telegram.ui.ActionBar.k6 V = org.telegram.ui.ActionBar.y6.V(context, R.drawable.msg_emoji_recent, z16 ? v(0.4f) : A(org.telegram.ui.ActionBar.y6.Me), z16 ? v(0.8f) : A(org.telegram.ui.ActionBar.y6.Oe));
        org.telegram.ui.ActionBar.k6 V2 = org.telegram.ui.ActionBar.y6.V(context, R.drawable.emoji_tabs_faves, z16 ? v(0.4f) : A(org.telegram.ui.ActionBar.y6.Me), z16 ? v(0.8f) : A(org.telegram.ui.ActionBar.y6.Oe));
        org.telegram.ui.ActionBar.k6 V3 = org.telegram.ui.ActionBar.y6.V(context, R.drawable.emoji_tabs_new3, z16 ? v(0.4f) : A(org.telegram.ui.ActionBar.y6.Me), z16 ? v(0.8f) : A(org.telegram.ui.ActionBar.y6.Oe));
        int i14 = R.drawable.emoji_tabs_new1;
        if (z16) {
            k6Var = V3;
            A = v(0.4f);
        } else {
            k6Var = V3;
            A = A(org.telegram.ui.ActionBar.y6.Me);
        }
        org.telegram.ui.ActionBar.k6 V4 = org.telegram.ui.ActionBar.y6.V(context, i14, A, z16 ? v(0.8f) : A(org.telegram.ui.ActionBar.y6.Oe));
        this.a2 = V4;
        int i15 = R.drawable.emoji_tabs_new2;
        int i16 = org.telegram.ui.ActionBar.y6.Qe;
        org.telegram.ui.ActionBar.k6 V5 = org.telegram.ui.ActionBar.y6.V(context, i15, A(i16), A(i16));
        this.f32716b2 = V5;
        this.Y0 = new Drawable[]{V, V2, k6Var, new LayerDrawable(new Drawable[]{V4, V5})};
        this.Z0 = new Drawable[]{org.telegram.ui.ActionBar.y6.V(context, R.drawable.msg_emoji_recent, z16 ? v(0.4f) : A(org.telegram.ui.ActionBar.y6.Me), z16 ? v(0.8f) : A(org.telegram.ui.ActionBar.y6.Oe)), org.telegram.ui.ActionBar.y6.V(context, R.drawable.stickers_gifs_trending, z16 ? v(0.4f) : A(org.telegram.ui.ActionBar.y6.Me), z16 ? v(0.8f) : A(org.telegram.ui.ActionBar.y6.Oe))};
        this.f32712a1 = new String[]{LocaleController.getString(R.string.Emoji1), LocaleController.getString(R.string.Emoji2), LocaleController.getString(R.string.Emoji3), LocaleController.getString(R.string.Emoji4), LocaleController.getString(R.string.Emoji5), LocaleController.getString(R.string.Emoji6), LocaleController.getString(R.string.Emoji7), LocaleController.getString(R.string.Emoji8)};
        this.J1 = chatFull;
        Paint paint = new Paint(1);
        this.f32769s1 = paint;
        paint.setColor(A(org.telegram.ui.ActionBar.y6.f23306af));
        ag.v0 v0Var = ag.z0.f1400a;
        this.M1 = new ag.w0(AndroidUtilities.dp(6.0f));
        px pxVar = new px(this, context);
        this.J = pxVar;
        ?? obj = new Object();
        obj.f31394a = 0;
        obj.f31395b = pxVar;
        arrayList.add(obj);
        if (z10) {
            MediaDataController.getInstance(i13).checkStickers(5);
            MediaDataController.getInstance(i13).checkFeaturedEmoji();
            this.f32726e2 = new PorterDuffColorFilter(A(org.telegram.ui.ActionBar.y6.Oh), PorterDuff.Mode.SRC_IN);
        }
        dy dyVar = new dy(this, context);
        this.P = dyVar;
        qVar2.b(dyVar);
        s4.l lVar = new s4.l();
        lVar.f47803c = 220L;
        lVar.e = 220L;
        lVar.f47804f = 160L;
        lVar.f47805g = 160L;
        lVar.f47806i = ds.f27587g;
        dyVar.setItemAnimator(lVar);
        dyVar.setOnTouchListener(new View.OnTouchListener(this) {
            public final sz f31087b;

            {
                this.f31087b = this;
            }

            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                switch (r3) {
                    case 0:
                        org.telegram.ui.ft o10 = org.telegram.ui.ft.o();
                        sz szVar = this.f31087b;
                        dy dyVar2 = szVar.P;
                        szVar.getMeasuredHeight();
                        return o10.q(motionEvent, dyVar2, null, szVar.f32733g2, u6Var);
                    case 1:
                        org.telegram.ui.ft o11 = org.telegram.ui.ft.o();
                        sz szVar2 = this.f31087b;
                        return o11.q(motionEvent, szVar2.f32734h0, szVar2.m0, szVar2.f32733g2, u6Var);
                    default:
                        org.telegram.ui.ft o12 = org.telegram.ui.ft.o();
                        sz szVar3 = this.f31087b;
                        zw zwVar = szVar3.D0;
                        szVar3.getMeasuredHeight();
                        return o12.q(motionEvent, zwVar, szVar3.A0, szVar3.f32733g2, u6Var);
                }
            }
        });
        dyVar.setOnItemLongClickListener(new mw(this, 1));
        dyVar.setInstantClick(true);
        qx qxVar = new qx(this);
        this.Q = qxVar;
        dyVar.setLayoutManager(qxVar);
        dyVar.setTopGlowOffset(AndroidUtilities.dp(38.0f));
        dyVar.setBottomGlowOffset(AndroidUtilities.dp(36.0f));
        dyVar.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f));
        int i17 = org.telegram.ui.ActionBar.y6.He;
        org.telegram.ui.ActionBar.f7.m(dyVar, 21, i17, u6Var);
        dyVar.setItemSelectorColorProvider(new f2(26));
        dyVar.setClipToPadding(false);
        qxVar.O = new rx(this);
        zx zxVar2 = new zx(this);
        this.R = zxVar2;
        dyVar.setAdapter(zxVar2);
        dyVar.i(new fi.p1(this, 3));
        this.S = new sy(this, context);
        pxVar.addView(dyVar, gb1.g(-1.0f, -1));
        pl0 pl0Var = new pl0(dyVar, qxVar);
        this.f32714b0 = pl0Var;
        pl0Var.f31601i = new sx(this);
        dyVar.setOnScrollListener(new tx(this));
        if (r2Var != null) {
            zxVar = zxVar2;
            lwVar = new lw(this, 2);
            z17 = z10;
            i10 = -1;
            z18 = z16;
            qVar = qVar2;
            i11 = 5;
            u6Var2 = u6Var;
        } else {
            zxVar = zxVar2;
            lwVar = null;
            z17 = z10;
            i10 = -1;
            z18 = z16;
            u6Var2 = u6Var;
            qVar = qVar2;
            i11 = 5;
        }
        ux uxVar = new ux(this, context, u6Var2, z17, lwVar, z18);
        this.I = uxVar;
        if (z13) {
            rw rwVar = new rw(this, context);
            this.V = rwVar;
            pxVar.addView(rwVar, new FrameLayout.LayoutParams(i10, AndroidUtilities.getShadowHeight() + dp));
            rwVar.d.setOnFocusChangeListener(new sw(this));
            ph.d dVar = new ph.d(context, u6Var2);
            this.U = dVar;
            dVar.setVisibility(8);
            dVar.setOnBackClickListener(new View.OnClickListener(this) {
                public final sz f31385b;

                {
                    this.f31385b = this;
                }

                @Override
                public final void onClick(View view) {
                    fz fzVar;
                    switch (r2) {
                        case 0:
                            sy syVar = this.f31385b.S;
                            ly lyVar = syVar.f32702c;
                            int childCount = lyVar.getChildCount();
                            for (int i18 = 0; i18 < childCount; i18++) {
                                ((ph.c) lyVar.getChildAt(i18)).a(false, true);
                            }
                            syVar.d = 0L;
                            syVar.F.f32713b.a(false, true);
                            syVar.l();
                            return;
                        case 1:
                            nz nzVar = this.f31385b.f32792z0;
                            mz mzVar = nzVar.f31094c;
                            int childCount2 = mzVar.getChildCount();
                            for (int i19 = 0; i19 < childCount2; i19++) {
                                ((ph.c) mzVar.getChildAt(i19)).a(false, true);
                            }
                            nzVar.d = 0L;
                            nzVar.Q.f32710a.a(false, true);
                            nzVar.l();
                            return;
                        case 2:
                            ty tyVar = this.f31385b.f32772t1;
                            if (tyVar != null) {
                                tyVar.w();
                                return;
                            }
                            return;
                        default:
                            sz szVar = this.f31385b;
                            int currentItem = szVar.h.getCurrentItem();
                            if (currentItem == 0) {
                                fzVar = szVar.V;
                            } else if (currentItem == 1) {
                                fzVar = szVar.f32754o0;
                            } else {
                                fzVar = szVar.G0;
                            }
                            if (fzVar != null) {
                                uq uqVar = fzVar.d;
                                uqVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                uqVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                uqVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                return;
                            }
                            return;
                    }
                }
            });
            pxVar.addView(dVar, new FrameLayout.LayoutParams(i10, dp));
        }
        if (Color.alpha(A(i17)) >= 255) {
            org.telegram.ui.ActionBar.f7.i(i17, uxVar, u6Var2);
        }
        zxVar.G(true);
        uxVar.p(getEmojipacks());
        pxVar.addView(uxVar, gb1.g(36.0f, i10));
        View view = new View(context);
        this.O = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        int i18 = org.telegram.ui.ActionBar.y6.Ke;
        org.telegram.ui.ActionBar.f7.i(i18, view, u6Var2);
        zx zxVar3 = zxVar;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i10, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(36.0f);
        pxVar.addView(view, layoutParams);
        ph.b bVar = new ph.b(context, u6Var2);
        this.L = bVar;
        bh.p pVar = new bh.p(context, u6Var2);
        this.K = pVar;
        pVar.setVisibility(8);
        pVar.addView(bVar, gb1.h(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
        pxVar.addView(pVar, gb1.i(i10, -2, 80));
        if (z11) {
            on0 on0Var = on0.f31332b;
            if (z12) {
                tw twVar = new tw(this, context);
                this.f32731g0 = twVar;
                ?? obj2 = new Object();
                obj2.f31394a = 1;
                obj2.f31395b = twVar;
                this.d.add(obj2);
                uw uwVar = new uw(this, context);
                this.f32734h0 = uwVar;
                qVar.b(uwVar);
                uwVar.setClipToPadding(false);
                yy yyVar = new yy(this);
                this.f32737i0 = yyVar;
                uwVar.setLayoutManager(yyVar);
                uwVar.i(new vw(this));
                uwVar.setPadding(0, dp, 0, AndroidUtilities.dp(44.0f) + this.f32762q2);
                ((s4.g1) uwVar.getItemAnimator()).f47763m = false;
                xy xyVar = new xy(this, context, true, Integer.MAX_VALUE);
                this.f32751n0 = xyVar;
                uwVar.setAdapter(xyVar);
                this.f32740j0 = new xy(this, context, false, 0);
                uwVar.setOnScrollListener(new rz(this, 2));
                uwVar.setOnTouchListener(new View.OnTouchListener(this) {
                    public final sz f31087b;

                    {
                        this.f31087b = this;
                    }

                    @Override
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        switch (r3) {
                            case 0:
                                org.telegram.ui.ft o10 = org.telegram.ui.ft.o();
                                sz szVar = this.f31087b;
                                dy dyVar2 = szVar.P;
                                szVar.getMeasuredHeight();
                                return o10.q(motionEvent, dyVar2, null, szVar.f32733g2, u6Var2);
                            case 1:
                                org.telegram.ui.ft o11 = org.telegram.ui.ft.o();
                                sz szVar2 = this.f31087b;
                                return o11.q(motionEvent, szVar2.f32734h0, szVar2.m0, szVar2.f32733g2, u6Var2);
                            default:
                                org.telegram.ui.ft o12 = org.telegram.ui.ft.o();
                                sz szVar3 = this.f31087b;
                                zw zwVar = szVar3.D0;
                                szVar3.getMeasuredHeight();
                                return o12.q(motionEvent, zwVar, szVar3.A0, szVar3.f32733g2, u6Var2);
                        }
                    }
                });
                ?? r92 = new zl0(this) {
                    public final sz f31727b;

                    {
                        this.f31727b = this;
                    }

                    @Override
                    public final void c(int i19, View view2) {
                        int i20;
                        String str;
                        switch (r2) {
                            case 0:
                                sz szVar = this.f31727b;
                                uw uwVar2 = szVar.f32734h0;
                                xy xyVar2 = szVar.f32740j0;
                                xy xyVar3 = szVar.f32751n0;
                                if (szVar.f32772t1 != null) {
                                    xyVar3.getClass();
                                    ArrayList arrayList2 = xyVar3.f34854x;
                                    if (uwVar2.getAdapter() == xyVar3) {
                                        if (i19 >= 0) {
                                            int i21 = xyVar3.H;
                                            if (i19 < i21) {
                                                szVar.f32772t1.v(view2, szVar.f32738i1.get(i19), null, "gif", true, 0, 0);
                                                return;
                                            }
                                            if (i21 > 0) {
                                                i20 = (i19 - i21) - 1;
                                            } else {
                                                i20 = i19;
                                            }
                                            if (i20 >= 0 && i20 < arrayList2.size()) {
                                                szVar.f32772t1.v(view2, arrayList2.get(i20), null, xyVar3.f34850n, true, 0, 0);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    } else if (uwVar2.getAdapter() == xyVar2 && i19 >= 0 && i19 < xyVar2.f34854x.size()) {
                                        szVar.f32772t1.v(view2, xyVar2.f34854x.get(i19), xyVar2.f34853w, xyVar2.f34850n, true, 0, 0);
                                        szVar.W();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            default:
                                sz szVar2 = this.f31727b;
                                s4.h0 adapter = szVar2.D0.getAdapter();
                                nz nzVar = szVar2.f32792z0;
                                if (adapter == nzVar) {
                                    str = nzVar.N;
                                } else {
                                    str = null;
                                }
                                String str2 = str;
                                if (view2 instanceof org.telegram.ui.Cells.i8) {
                                    org.telegram.ui.Cells.i8 i8Var = (org.telegram.ui.Cells.i8) view2;
                                    if (i8Var.getSticker() != null && MessageObject.isPremiumSticker(i8Var.getSticker()) && !AccountInstance.getInstance(szVar2.f32719c1).getUserConfig().isPremium()) {
                                        org.telegram.ui.ft.o().w(i8Var);
                                        return;
                                    }
                                    org.telegram.ui.ft.o().s();
                                    if (!i8Var.f24248r) {
                                        i8Var.f24248r = true;
                                        i8Var.f24247n = 0.5f;
                                        i8Var.f24251x = 0L;
                                        org.telegram.ui.Cells.h8 h8Var = i8Var.f24243a;
                                        h8Var.setAlpha(0.5f * i8Var.H);
                                        h8Var.invalidate();
                                        i8Var.f24249s = System.currentTimeMillis();
                                        i8Var.invalidate();
                                        szVar2.f32772t1.m(i8Var, i8Var.getSticker(), str2, i8Var.getParentObject(), i8Var.getSendAnimationData(), true, 0);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                };
                this.m0 = r92;
                uwVar.setOnItemClickListener((zl0) r92);
                twVar.addView(uwVar, gb1.g(-1.0f, -1));
                ww wwVar = new ww(this, context);
                this.f32754o0 = wwVar;
                twVar.addView(wwVar, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + dp));
                xx xxVar = new xx(this, context, u6Var2);
                this.f32757p0 = xxVar;
                xxVar.setType(on0Var);
                xxVar.setUnderlineHeight(AndroidUtilities.getShadowHeight());
                xxVar.setIndicatorColor(A(i16));
                xxVar.setUnderlineColor(A(i18));
                org.telegram.ui.ActionBar.f7.i(i17, xxVar, u6Var2);
                V();
                xxVar.setDelegate(new mw(this, 2));
                xyVar.F("", "", true, true, true);
            }
            xw xwVar = new xw(this, context, z14);
            this.f32785x0 = xwVar;
            MediaDataController.getInstance(this.f32719c1).checkStickers(0);
            MediaDataController.getInstance(this.f32719c1).checkFeaturedStickers();
            zw zwVar = new zw(this, context);
            this.D0 = zwVar;
            this.f32753n2.b(zwVar);
            ax axVar = new ax(this);
            this.E0 = axVar;
            zwVar.setLayoutManager(axVar);
            axVar.O = new bx(this);
            zwVar.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f));
            zwVar.setClipToPadding(false);
            ?? obj3 = new Object();
            obj3.f31394a = 2;
            obj3.f31395b = xwVar;
            this.d.add(obj3);
            this.f32792z0 = new nz(this, context);
            jz jzVar = new jz(this, context);
            this.f32789y0 = jzVar;
            zwVar.setAdapter(jzVar);
            zwVar.setOnTouchListener(new View.OnTouchListener(this) {
                public final sz f31087b;

                {
                    this.f31087b = this;
                }

                @Override
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    switch (r3) {
                        case 0:
                            org.telegram.ui.ft o10 = org.telegram.ui.ft.o();
                            sz szVar = this.f31087b;
                            dy dyVar2 = szVar.P;
                            szVar.getMeasuredHeight();
                            return o10.q(motionEvent, dyVar2, null, szVar.f32733g2, u6Var2);
                        case 1:
                            org.telegram.ui.ft o11 = org.telegram.ui.ft.o();
                            sz szVar2 = this.f31087b;
                            return o11.q(motionEvent, szVar2.f32734h0, szVar2.m0, szVar2.f32733g2, u6Var2);
                        default:
                            org.telegram.ui.ft o12 = org.telegram.ui.ft.o();
                            sz szVar3 = this.f31087b;
                            zw zwVar2 = szVar3.D0;
                            szVar3.getMeasuredHeight();
                            return o12.q(motionEvent, zwVar2, szVar3.A0, szVar3.f32733g2, u6Var2);
                    }
                }
            });
            ?? r42 = new zl0(this) {
                public final sz f31727b;

                {
                    this.f31727b = this;
                }

                @Override
                public final void c(int i19, View view2) {
                    int i20;
                    String str;
                    switch (r2) {
                        case 0:
                            sz szVar = this.f31727b;
                            uw uwVar2 = szVar.f32734h0;
                            xy xyVar2 = szVar.f32740j0;
                            xy xyVar3 = szVar.f32751n0;
                            if (szVar.f32772t1 != null) {
                                xyVar3.getClass();
                                ArrayList arrayList2 = xyVar3.f34854x;
                                if (uwVar2.getAdapter() == xyVar3) {
                                    if (i19 >= 0) {
                                        int i21 = xyVar3.H;
                                        if (i19 < i21) {
                                            szVar.f32772t1.v(view2, szVar.f32738i1.get(i19), null, "gif", true, 0, 0);
                                            return;
                                        }
                                        if (i21 > 0) {
                                            i20 = (i19 - i21) - 1;
                                        } else {
                                            i20 = i19;
                                        }
                                        if (i20 >= 0 && i20 < arrayList2.size()) {
                                            szVar.f32772t1.v(view2, arrayList2.get(i20), null, xyVar3.f34850n, true, 0, 0);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                } else if (uwVar2.getAdapter() == xyVar2 && i19 >= 0 && i19 < xyVar2.f34854x.size()) {
                                    szVar.f32772t1.v(view2, xyVar2.f34854x.get(i19), xyVar2.f34853w, xyVar2.f34850n, true, 0, 0);
                                    szVar.W();
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        default:
                            sz szVar2 = this.f31727b;
                            s4.h0 adapter = szVar2.D0.getAdapter();
                            nz nzVar = szVar2.f32792z0;
                            if (adapter == nzVar) {
                                str = nzVar.N;
                            } else {
                                str = null;
                            }
                            String str2 = str;
                            if (view2 instanceof org.telegram.ui.Cells.i8) {
                                org.telegram.ui.Cells.i8 i8Var = (org.telegram.ui.Cells.i8) view2;
                                if (i8Var.getSticker() != null && MessageObject.isPremiumSticker(i8Var.getSticker()) && !AccountInstance.getInstance(szVar2.f32719c1).getUserConfig().isPremium()) {
                                    org.telegram.ui.ft.o().w(i8Var);
                                    return;
                                }
                                org.telegram.ui.ft.o().s();
                                if (!i8Var.f24248r) {
                                    i8Var.f24248r = true;
                                    i8Var.f24247n = 0.5f;
                                    i8Var.f24251x = 0L;
                                    org.telegram.ui.Cells.h8 h8Var = i8Var.f24243a;
                                    h8Var.setAlpha(0.5f * i8Var.H);
                                    h8Var.invalidate();
                                    i8Var.f24249s = System.currentTimeMillis();
                                    i8Var.invalidate();
                                    szVar2.f32772t1.m(i8Var, i8Var.getSticker(), str2, i8Var.getParentObject(), i8Var.getSendAnimationData(), true, 0);
                                    return;
                                }
                                return;
                            }
                            return;
                    }
                }
            };
            this.A0 = r42;
            zwVar.setOnItemClickListener((zl0) r42);
            org.telegram.ui.ActionBar.f7.m(zwVar, 21, i17, u6Var2);
            xwVar.addView(zwVar);
            this.f32711a0 = new pl0(zwVar, axVar);
            cx cxVar = new cx(this, context);
            this.G0 = cxVar;
            xwVar.addView(cxVar, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + dp));
            ph.d dVar2 = new ph.d(context, u6Var2);
            this.H0 = dVar2;
            dVar2.setVisibility(8);
            dVar2.setOnBackClickListener(new View.OnClickListener(this) {
                public final sz f31385b;

                {
                    this.f31385b = this;
                }

                @Override
                public final void onClick(View view2) {
                    fz fzVar;
                    switch (r2) {
                        case 0:
                            sy syVar = this.f31385b.S;
                            ly lyVar = syVar.f32702c;
                            int childCount = lyVar.getChildCount();
                            for (int i182 = 0; i182 < childCount; i182++) {
                                ((ph.c) lyVar.getChildAt(i182)).a(false, true);
                            }
                            syVar.d = 0L;
                            syVar.F.f32713b.a(false, true);
                            syVar.l();
                            return;
                        case 1:
                            nz nzVar = this.f31385b.f32792z0;
                            mz mzVar = nzVar.f31094c;
                            int childCount2 = mzVar.getChildCount();
                            for (int i19 = 0; i19 < childCount2; i19++) {
                                ((ph.c) mzVar.getChildAt(i19)).a(false, true);
                            }
                            nzVar.d = 0L;
                            nzVar.Q.f32710a.a(false, true);
                            nzVar.l();
                            return;
                        case 2:
                            ty tyVar = this.f31385b.f32772t1;
                            if (tyVar != null) {
                                tyVar.w();
                                return;
                            }
                            return;
                        default:
                            sz szVar = this.f31385b;
                            int currentItem = szVar.h.getCurrentItem();
                            if (currentItem == 0) {
                                fzVar = szVar.V;
                            } else if (currentItem == 1) {
                                fzVar = szVar.f32754o0;
                            } else {
                                fzVar = szVar.G0;
                            }
                            if (fzVar != null) {
                                uq uqVar = fzVar.d;
                                uqVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                uqVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                uqVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                return;
                            }
                            return;
                    }
                }
            });
            xwVar.addView(dVar2, new FrameLayout.LayoutParams(-1, dp));
            z19 = z14;
            i12 = 80;
            dx dxVar = new dx(this, context, u6Var2, r2Var, z19);
            this.B0 = dxVar;
            dxVar.setDragEnabled(true);
            dxVar.setWillNotDraw(false);
            dxVar.setType(on0Var);
            dxVar.setUnderlineHeight(zwVar.canScrollVertically(-1) ? AndroidUtilities.getShadowHeight() : 0);
            dxVar.setIndicatorColor(A(i16));
            dxVar.setUnderlineColor(A(i18));
            if (viewGroup != null && z19) {
                ex exVar = new ex(this, context);
                this.C0 = exVar;
                exVar.addView(dxVar, gb1.i(-1, 36, 51));
                viewGroup.addView(exVar, gb1.g(-2.0f, -1));
            } else {
                xwVar.addView(dxVar, gb1.i(-1, 36, 51));
            }
            X(true);
            dxVar.setDelegate(new mw(this, 4));
            zwVar.setOnScrollListener(new rz(this, 0));
            ph.b bVar2 = new ph.b(context, u6Var2);
            this.N = bVar2;
            bh.p pVar2 = new bh.p(context, u6Var2);
            this.M = pVar2;
            pVar2.setVisibility(8);
            pVar2.addView(bVar2, gb1.h(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
            xwVar.addView(pVar2, gb1.i(-1, -2, 80));
        } else {
            i12 = 80;
            z19 = z14;
        }
        this.e.clear();
        this.e.addAll(this.d);
        fx fxVar = new fx(this, context);
        this.h = fxVar;
        oi.q qVar3 = this.f32753n2;
        qVar3.getClass();
        fxVar.b(new oi.i(qVar3, fxVar));
        fxVar.setOverScrollMode(2);
        ky kyVar = new ky(this);
        this.L0 = kyVar;
        fxVar.setAdapter(kyVar);
        gx gxVar = new gx(this, context);
        this.f32784x = gxVar;
        gxVar.setHapticFeedbackEnabled(true);
        gxVar.setImageResource(R.drawable.smiles_tab_clear);
        int v = z16 ? v(0.6f) : A(org.telegram.ui.ActionBar.y6.Re);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        gxVar.setColorFilter(new PorterDuffColorFilter(v, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        gxVar.setScaleType(scaleType);
        gxVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
        gxVar.setFocusable(true);
        gxVar.setOnClickListener(new Object());
        gb1.b(gxVar);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f32763r = frameLayout;
        if (z13) {
            addView(frameLayout, gb1.h(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, (AndroidUtilities.getShadowHeight() / AndroidUtilities.density) + 40.0f));
        } else {
            addView(frameLayout, gb1.h(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f32767s = frameLayout2;
        addView(frameLayout2, gb1.h(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 64.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f32750n = frameLayout3;
        View view2 = new View(context);
        this.v = view2;
        frameLayout3.addView(view2, new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(40.0f), 83));
        if (z13) {
            addView(frameLayout3, gb1.i(-1, 48, i12));
            frameLayout3.addView(gxVar, gb1.h(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
            if (z11) {
                ImageView imageView = new ImageView(context);
                this.f32788y = imageView;
                imageView.setImageResource(R.drawable.smiles_tab_settings);
                imageView.setColorFilter(new PorterDuffColorFilter(z16 ? v(0.6f) : A(org.telegram.ui.ActionBar.y6.Re), mode));
                imageView.setScaleType(scaleType);
                imageView.setFocusable(true);
                imageView.setContentDescription(LocaleController.getString(R.string.Settings));
                gb1.b(imageView);
                frameLayout3.addView(imageView, gb1.h(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
                imageView.setOnClickListener(new View.OnClickListener(this) {
                    public final sz f31385b;

                    {
                        this.f31385b = this;
                    }

                    @Override
                    public final void onClick(View view22) {
                        fz fzVar;
                        switch (r2) {
                            case 0:
                                sy syVar = this.f31385b.S;
                                ly lyVar = syVar.f32702c;
                                int childCount = lyVar.getChildCount();
                                for (int i182 = 0; i182 < childCount; i182++) {
                                    ((ph.c) lyVar.getChildAt(i182)).a(false, true);
                                }
                                syVar.d = 0L;
                                syVar.F.f32713b.a(false, true);
                                syVar.l();
                                return;
                            case 1:
                                nz nzVar = this.f31385b.f32792z0;
                                mz mzVar = nzVar.f31094c;
                                int childCount2 = mzVar.getChildCount();
                                for (int i19 = 0; i19 < childCount2; i19++) {
                                    ((ph.c) mzVar.getChildAt(i19)).a(false, true);
                                }
                                nzVar.d = 0L;
                                nzVar.Q.f32710a.a(false, true);
                                nzVar.l();
                                return;
                            case 2:
                                ty tyVar = this.f31385b.f32772t1;
                                if (tyVar != null) {
                                    tyVar.w();
                                    return;
                                }
                                return;
                            default:
                                sz szVar = this.f31385b;
                                int currentItem = szVar.h.getCurrentItem();
                                if (currentItem == 0) {
                                    fzVar = szVar.V;
                                } else if (currentItem == 1) {
                                    fzVar = szVar.f32754o0;
                                } else {
                                    fzVar = szVar.G0;
                                }
                                if (fzVar != null) {
                                    uq uqVar = fzVar.d;
                                    uqVar.requestFocus();
                                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                    uqVar.onTouchEvent(obtain);
                                    obtain.recycle();
                                    MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                    uqVar.onTouchEvent(obtain2);
                                    obtain2.recycle();
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            wd0 wd0Var = new wd0(context, u6Var2);
            this.f32780w = wd0Var;
            wd0Var.setViewPager(fxVar);
            wd0Var.setShouldExpand(false);
            wd0Var.setIndicatorHeight(AndroidUtilities.dp(3.0f));
            wd0Var.setIndicatorColor(i0.a.o(A(org.telegram.ui.ActionBar.y6.Oe), 20));
            wd0Var.setUnderlineHeight(0);
            wd0Var.setTabPaddingLeftRight(AndroidUtilities.dp(11.0f));
            wd0Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f));
            frameLayout3.addView(wd0Var, gb1.i(-2, 48, 81));
            wd0Var.setOnPageChangeListener(new ix(this, z19));
            ImageView imageView2 = new ImageView(context);
            this.E = imageView2;
            imageView2.setImageResource(R.drawable.smiles_tab_search);
            imageView2.setColorFilter(new PorterDuffColorFilter(z16 ? v(0.6f) : A(org.telegram.ui.ActionBar.y6.Re), mode));
            imageView2.setScaleType(scaleType);
            imageView2.setContentDescription(LocaleController.getString(R.string.Search));
            imageView2.setFocusable(true);
            imageView2.setVisibility(8);
            frameLayout3.addView(imageView2, gb1.h(48, 48.0f, 83, 2.0f, 0.0f, 2.0f, 0.0f));
            imageView2.setOnClickListener(new View.OnClickListener(this) {
                public final sz f31385b;

                {
                    this.f31385b = this;
                }

                @Override
                public final void onClick(View view22) {
                    fz fzVar;
                    switch (r2) {
                        case 0:
                            sy syVar = this.f31385b.S;
                            ly lyVar = syVar.f32702c;
                            int childCount = lyVar.getChildCount();
                            for (int i182 = 0; i182 < childCount; i182++) {
                                ((ph.c) lyVar.getChildAt(i182)).a(false, true);
                            }
                            syVar.d = 0L;
                            syVar.F.f32713b.a(false, true);
                            syVar.l();
                            return;
                        case 1:
                            nz nzVar = this.f31385b.f32792z0;
                            mz mzVar = nzVar.f31094c;
                            int childCount2 = mzVar.getChildCount();
                            for (int i19 = 0; i19 < childCount2; i19++) {
                                ((ph.c) mzVar.getChildAt(i19)).a(false, true);
                            }
                            nzVar.d = 0L;
                            nzVar.Q.f32710a.a(false, true);
                            nzVar.l();
                            return;
                        case 2:
                            ty tyVar = this.f31385b.f32772t1;
                            if (tyVar != null) {
                                tyVar.w();
                                return;
                            }
                            return;
                        default:
                            sz szVar = this.f31385b;
                            int currentItem = szVar.h.getCurrentItem();
                            if (currentItem == 0) {
                                fzVar = szVar.V;
                            } else if (currentItem == 1) {
                                fzVar = szVar.f32754o0;
                            } else {
                                fzVar = szVar.G0;
                            }
                            if (fzVar != null) {
                                uq uqVar = fzVar.d;
                                uqVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                uqVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                uqVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                return;
                            }
                            return;
                    }
                }
            });
        } else {
            addView(frameLayout3, gb1.h(56, 48.0f, (LocaleController.isRTL ? 3 : i11) | 80, 0.0f, 0.0f, 2.0f, 0.0f));
            org.telegram.ui.Cells.y i02 = org.telegram.ui.ActionBar.y6.i0(AndroidUtilities.dp(56.0f), A(i17), A(i17));
            gb1.b(gxVar);
            gxVar.setPadding(0, 0, AndroidUtilities.dp(2.0f), 0);
            gxVar.setBackground(i02);
            gxVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
            gxVar.setFocusable(true);
            frameLayout3.addView(gxVar, gb1.h(48, 48.0f, 51, 2.0f, 0.0f, 2.0f, 0.0f));
            view2.setVisibility(8);
        }
        addView(fxVar, 0, gb1.i(-1, -1, 51));
        bi.md mdVar = new bi.md(context, 22);
        this.N0 = mdVar;
        int dp2 = AndroidUtilities.dp(6.0f);
        int i19 = org.telegram.ui.ActionBar.y6.f23604qf;
        ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(dp2, A(i19));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i19);
        mdVar.setBackground(c02);
        org.telegram.ui.ActionBar.f7.k(mdVar, c02, N, null, u6Var2);
        org.telegram.ui.ActionBar.f7.V(mdVar, org.telegram.ui.ActionBar.y6.f23587pf, u6Var2);
        mdVar.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f));
        mdVar.setGravity(16);
        mdVar.setTextSize(1, 14.0f);
        mdVar.setVisibility(4);
        addView(mdVar, gb1.h(-2, -2.0f, 81, 5.0f, 0.0f, 5.0f, 53.0f));
        this.C1 = AndroidUtilities.dp(AndroidUtilities.isTablet() ? 40.0f : 32.0f);
        Field field2 = fv.f28318f;
        fv fvVar = new fv(new ev(context, u6Var2));
        if (fv.f28318f == null) {
            try {
                field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
                try {
                    field.setAccessible(true);
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                field = null;
            }
            fv.f28318f = field;
        }
        Field field3 = fv.f28318f;
        if (field3 != null) {
            try {
                fvVar.f28320a = (ViewTreeObserver.OnScrollChangedListener) field3.get(fvVar);
                fv.f28318f.set(fvVar, fv.f28319g);
            } catch (Exception unused3) {
                fvVar.f28320a = null;
            }
        }
        this.B1 = fvVar;
        fvVar.f28322c.setOnSelectionUpdateListener(new d(this, 10));
        this.A1 = MessagesController.getGlobalEmojiSettings().getInt("selected_page", 0);
        Emoji.loadRecentEmoji();
        zxVar3.F(false);
        I(true, z11, z12, false);
        if (Build.VERSION.SDK_INT >= 31) {
            ch.f fVar = new ch.f();
            this.f32742j2 = fVar;
            this.f32753n2.a(fVar);
            hh.d dVar3 = new hh.d(null);
            dVar3.f12841f = this.f32747l2;
            dVar3.d = fVar;
            dVar3.e = -2;
            ch.b bVar3 = new ch.b(dVar3);
            this.f32749m2 = bVar3;
            bVar3.f6303i = LiteMode.isEnabled(262144);
            int dp3 = AndroidUtilities.dp(LiteMode.isEnabled(262144) ? 8.0f : 48.0f);
            bVar3.f6299b = dp3;
            bVar3.f6300c = dp3;
            bVar3.h = this.f32753n2;
        } else {
            ch.b bVar4 = new ch.b(this.f32747l2);
            this.f32749m2 = bVar4;
            bVar4.h = this.f32753n2;
            this.f32742j2 = null;
        }
        this.f32745k2 = new kh(this, 1);
        setBlurredBackgroundDrawableFactory(this.f32749m2);
        this.f32753n2.i(this);
        this.f32753n2.f19482a = new mw(this, 0);
    }

    public static void a(sz szVar, boolean z10) {
        uw uwVar = szVar.f32734h0;
        if (uwVar != null) {
            int childCount = uwVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = uwVar.getChildAt(i10);
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
    }

    public static void b(sz szVar, bz bzVar, String str) {
        String str2;
        String str3;
        boolean z10;
        String str4;
        ty tyVar;
        wc wcVar;
        org.telegram.ui.ActionBar.r2 r2Var = szVar.Y1;
        int i10 = szVar.f32719c1;
        ArrayList arrayList = szVar.f32761q1;
        if (bzVar != null) {
            if (bzVar.getSpan() != null) {
                if (szVar.f32772t1 != null) {
                    long j10 = bzVar.getSpan().documentId;
                    TLRPC.Document document = bzVar.getSpan().document;
                    ey eyVar = bzVar.e;
                    if (eyVar != null && eyVar.f28012i) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (document == null) {
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            ey eyVar2 = (ey) arrayList.get(i11);
                            int i12 = 0;
                            while (true) {
                                ArrayList arrayList2 = eyVar2.f28009c;
                                if (arrayList2 != null && i12 < arrayList2.size()) {
                                    if (((TLRPC.Document) eyVar2.f28009c.get(i12)).f22033id == j10) {
                                        document = (TLRPC.Document) eyVar2.f28009c.get(i12);
                                        break;
                                    }
                                    i12++;
                                }
                            }
                        }
                    }
                    if (document == null) {
                        document = t5.f(i10, j10);
                    }
                    TLRPC.Document document2 = document;
                    if (document2 != null) {
                        str4 = MessageObject.findAnimatedEmojiEmoticon(document2);
                    } else {
                        str4 = null;
                    }
                    String str5 = str4;
                    if (!MessageObject.isFreeEmoji(document2) && !UserConfig.getInstance(i10).isPremium() && (((tyVar = szVar.f32772t1) == null || !tyVar.g()) && !szVar.U0 && !z10)) {
                        szVar.M(false);
                        if (r2Var != null) {
                            wcVar = wc.b0(r2Var);
                        } else {
                            wcVar = new wc(szVar.f32763r, szVar.Z1);
                        }
                        if (!szVar.f32736h2 && r2Var != null) {
                            wcVar.J(R.raw.saved_messages, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint2)), LocaleController.getString(R.string.Open), new lw(szVar, 4)).j();
                        } else {
                            wcVar.r(document2, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint)), LocaleController.getString(R.string.PremiumMore), new lw(szVar, 3)).j();
                        }
                        szVar.f32736h2 = !szVar.f32736h2;
                        return;
                    }
                    szVar.D2 = SystemClock.elapsedRealtime();
                    szVar.M(true);
                    szVar.h("animated_" + j10);
                    szVar.f32772t1.x(j10, document2, str5, bzVar.f27002c);
                    return;
                }
                return;
            }
            szVar.D2 = SystemClock.elapsedRealtime();
            szVar.M(true);
            if (str != null) {
                str2 = str;
            } else {
                str2 = (String) bzVar.getTag();
            }
            new SpannableStringBuilder().append((CharSequence) str2);
            if (str == null) {
                if (!bzVar.f27002c && (str3 = Emoji.emojiColor.get(str2)) != null) {
                    str2 = g(str2, str3);
                }
                szVar.h(str2);
                ty tyVar2 = szVar.f32772t1;
                if (tyVar2 != null) {
                    tyVar2.l(Emoji.fixEmoji(str2));
                    return;
                }
                return;
            }
            ty tyVar3 = szVar.f32772t1;
            if (tyVar3 != null) {
                tyVar3.l(Emoji.fixEmoji(str));
            }
        }
    }

    public static void e(sz szVar, int i10, int i11) {
        s4.e1 K;
        int[] iArr = szVar.Q0;
        if (i10 == 1) {
            szVar.n(i11, szVar.P);
            return;
        }
        ty tyVar = szVar.f32772t1;
        if ((tyVar == null || !tyVar.z()) && !szVar.J0) {
            mm0 x9 = szVar.x(i10);
            if (i11 > 0 && x9 != null && x9.getVisibility() == 0 && (K = x9.K(0)) != null && K.f47738a.getTop() + szVar.f32715b1 >= x9.getPaddingTop()) {
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
                szVar.Y();
            } else {
                szVar.y(i10).setTranslationY(Math.max(-AndroidUtilities.dp(48.0f), iArr[i10]));
            }
        }
    }

    public static void f(sz szVar, boolean z10) {
        int N0;
        yy yyVar = szVar.f32737i0;
        ww wwVar = szVar.f32754o0;
        uw uwVar = szVar.f32734h0;
        if (uwVar != null && (uwVar.getAdapter() instanceof xy)) {
            xy xyVar = (xy) uwVar.getAdapter();
            if (!xyVar.f34852s && xyVar.h == 0 && !xyVar.f34854x.isEmpty() && (N0 = yyVar.N0()) != -1 && N0 > yyVar.B() - 5) {
                String str = xyVar.f34853w;
                String str2 = xyVar.f34851r;
                boolean z11 = xyVar.v;
                xyVar.F(str, str2, true, z11, z11);
            }
        }
        ty tyVar = szVar.f32772t1;
        if (tyVar != null && tyVar.z()) {
            boolean z12 = false;
            s4.e1 K = uwVar.K(0);
            if (K == null) {
                fz.a(wwVar, true, !z10);
                return;
            }
            if (K.f47738a.getTop() < uwVar.getPaddingTop()) {
                z12 = true;
            }
            fz.a(wwVar, z12, !z10);
        } else if (wwVar != null && uwVar != null) {
            wwVar.f28336a.a(true, !z10);
        }
    }

    public static String g(String str, String str2) {
        boolean z10;
        String str3;
        if (CompoundEmoji.isHandshake(str) != null) {
            return CompoundEmoji.applyColor(str, str2);
        }
        if (Emoji.endsWithRightArrow(str)) {
            str = c3.h0.l(2, 0, str);
            z10 = true;
        } else {
            z10 = false;
        }
        int length = str.length();
        if (length > 2 && str.charAt(str.length() - 2) == 8205) {
            str3 = str.substring(str.length() - 2);
            str = c3.h0.l(2, 0, str);
        } else if (length > 3 && str.charAt(str.length() - 3) == 8205) {
            str3 = str.substring(str.length() - 3);
            str = c3.h0.l(3, 0, str);
        } else {
            str3 = null;
        }
        String u10 = b10.u(str, str2);
        if (str3 != null) {
            u10 = b10.u(u10, str3);
        }
        if (z10) {
            return b10.u(u10, "\u200d➡");
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
        org.telegram.ui.ActionBar.u6 u6Var = this.Z1;
        if (u6Var != null) {
            return u6Var.g(i10);
        }
        return org.telegram.ui.ActionBar.y6.x0(null, i10, false);
    }

    public final void B() {
        cx cxVar = this.G0;
        if (cxVar != null) {
            cxVar.b();
        }
        ww wwVar = this.f32754o0;
        if (wwVar != null) {
            wwVar.b();
        }
        rw rwVar = this.V;
        if (rwVar != null) {
            rwVar.b();
        }
    }

    public final void C(boolean z10, boolean z11) {
        ez ezVar;
        boolean z12;
        if (this.A1 != 0 && this.f32782w1) {
            this.A1 = 0;
        }
        if (this.A1 == 0 && this.f32778v1) {
            this.A1 = 1;
        }
        int i10 = this.A1;
        fx fxVar = this.h;
        if (i10 != 0 && !z10 && this.e.size() != 1) {
            int i11 = this.A1;
            if (i11 == 1) {
                L(false, false);
                if (!this.f32774u0 && !this.f32777v0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                Q(z12, false);
                if (fxVar.getCurrentItem() != 2) {
                    fxVar.x(2, false);
                }
                dx dxVar = this.B0;
                if (dxVar != null) {
                    this.S0 = true;
                    int i12 = this.G1;
                    if (i12 >= 0) {
                        dxVar.m(i12);
                    } else {
                        int i13 = this.F1;
                        if (i13 >= 0) {
                            dxVar.m(i13);
                        } else {
                            dxVar.m(this.E1);
                        }
                    }
                    this.S0 = false;
                    this.E0.h1(0, 0);
                }
            } else if (i11 == 2) {
                L(false, false);
                Q(false, false);
                if (fxVar.getCurrentItem() != 1) {
                    fxVar.x(1, false);
                }
                xx xxVar = this.f32757p0;
                if (xxVar != null) {
                    xxVar.m(0);
                }
                ww wwVar = this.f32754o0;
                if (wwVar != null && (ezVar = wwVar.f28341r) != null) {
                    ezVar.L1(null);
                }
            }
        } else {
            L(true, false);
            Q(false, false);
            if (fxVar.getCurrentItem() != 0) {
                fxVar.x(0, !z10);
            }
            if (z11) {
                AndroidUtilities.runOnUIThread(new lw(this, 5), 350L);
            }
        }
        M(true);
    }

    public final void D() {
        jz jzVar = this.f32789y0;
        if (jzVar != null) {
            jzVar.l();
        }
        nz nzVar = this.f32792z0;
        if (nzVar != null) {
            nzVar.l();
        }
        if (org.telegram.ui.ft.o().E) {
            org.telegram.ui.ft.o().l();
        }
        org.telegram.ui.ft.o().s();
    }

    @Override
    public final void E(int i10, float f7, float f10, oe.e eVar) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = 4;
        if (i10 == 0) {
            q(false);
            float f11 = 1.0f - this.f32710a.e;
            cx cxVar = this.G0;
            cxVar.setAlpha(f11);
            if (f11 > 0.0f) {
                i13 = 0;
            } else {
                i13 = 4;
            }
            cxVar.setVisibility(i13);
            float f12 = 1.0f - f11;
            ph.d dVar = this.H0;
            dVar.setAlpha(f12);
            dVar.setTranslationY((-AndroidUtilities.dp(15.0f)) * f11);
            int i16 = (f12 > 0.0f ? 1 : (f12 == 0.0f ? 0 : -1));
            if (i16 > 0) {
                i14 = 0;
            } else {
                i14 = 4;
            }
            dVar.setVisibility(i14);
            bh.p pVar = this.M;
            pVar.setAlpha(f12);
            pVar.setTranslationY(AndroidUtilities.dp(30.0f) * f11);
            if (i16 > 0) {
                i15 = 0;
            }
            pVar.setVisibility(i15);
            R();
            this.f32785x0.invalidate();
        } else if (i10 == 1) {
            l(false);
            float f13 = 1.0f - this.f32713b.e;
            rw rwVar = this.V;
            rwVar.setAlpha(f13);
            if (f13 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            rwVar.setVisibility(i11);
            float f14 = 1.0f - f13;
            ph.d dVar2 = this.U;
            dVar2.setAlpha(f14);
            dVar2.setTranslationY((-AndroidUtilities.dp(15.0f)) * f13);
            int i17 = (f14 > 0.0f ? 1 : (f14 == 0.0f ? 0 : -1));
            if (i17 > 0) {
                i12 = 0;
            } else {
                i12 = 4;
            }
            dVar2.setVisibility(i12);
            bh.p pVar2 = this.K;
            pVar2.setAlpha(f14);
            pVar2.setTranslationY(AndroidUtilities.dp(30.0f) * f13);
            if (i17 > 0) {
                i15 = 0;
            }
            pVar2.setVisibility(i15);
            R();
            this.J.invalidate();
        }
    }

    public final void F(int i10) {
        ty tyVar = this.f32772t1;
        if ((tyVar != null && tyVar.z()) || i10 == 0) {
            return;
        }
        HorizontalScrollView y3 = y(i10);
        this.Q0[i10] = 0;
        y3.setTranslationY(0);
    }

    public final void G(int i10, int i11) {
        qx qxVar = this.Q;
        View m10 = qxVar.m(i10);
        int L0 = qxVar.L0();
        int i12 = 1;
        if ((m10 == null && Math.abs(i10 - L0) > qxVar.J * 9.0f) || !SharedConfig.animationsEnabled()) {
            if (qxVar.L0() < i10) {
                i12 = 0;
            }
            pl0 pl0Var = this.f32714b0;
            pl0Var.f31597b = i12;
            pl0Var.c(i10, i11, false, false);
            return;
        }
        this.J0 = true;
        fi.k1 k1Var = new fi.k1(this, this.P.getContext(), 1);
        k1Var.f47680a = i10;
        k1Var.f18556p = i11;
        qxVar.w0(k1Var);
    }

    public final void H(int i10, int i11) {
        ax axVar = this.E0;
        View m10 = axVar.m(i10);
        int L0 = axVar.L0();
        int i12 = 1;
        if (m10 == null && Math.abs(i10 - L0) > 40) {
            if (axVar.L0() < i10) {
                i12 = 0;
            }
            pl0 pl0Var = this.f32711a0;
            pl0Var.f31597b = i12;
            pl0Var.c(i10, i11, false, false);
            return;
        }
        this.J0 = true;
        this.D0.y0(i10);
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
            if (((oz) arrayList2.get(i10)).f31394a == 0 && z10) {
                arrayList.add((oz) arrayList2.get(i10));
            }
            if (((oz) arrayList2.get(i10)).f31394a == 1 && z12) {
                arrayList.add((oz) arrayList2.get(i10));
            }
            if (((oz) arrayList2.get(i10)).f31394a == 2 && z11) {
                arrayList.add((oz) arrayList2.get(i10));
            }
            i10++;
        }
        wd0 wd0Var = this.f32780w;
        if (wd0Var != null) {
            if (arrayList.size() > 1) {
                z14 = true;
            }
            AndroidUtilities.updateViewVisibilityAnimated(wd0Var, z14, 1.0f, z13);
        }
        fx fxVar = this.h;
        if (fxVar != null) {
            fxVar.setAdapter(null);
            fxVar.setAdapter(this.L0);
            if (wd0Var != null) {
                wd0Var.setViewPager(fxVar);
            }
        }
    }

    public final void J(final ph.b bVar, final TLObject tLObject, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final boolean z10, boolean z11) {
        String formatPluralString;
        nz nzVar;
        sy syVar;
        if (stickerSet != null) {
            if (!z10 || (syVar = this.S) == null || syVar.d == stickerSet.f22054id) {
                if (!z10 && (nzVar = this.f32792z0) != null && nzVar.d != stickerSet.f22054id) {
                    return;
                }
                final boolean isStickerPackInstalled = MediaDataController.getInstance(this.f32719c1).isStickerPackInstalled(stickerSet.f22054id);
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
                bVar.f46856k0.a(!isStickerPackInstalled, z11);
                bVar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        int i10;
                        sz szVar = sz.this;
                        MediaDataController mediaDataController = MediaDataController.getInstance(szVar.f32719c1);
                        Context context = szVar.getContext();
                        if (isStickerPackInstalled) {
                            i10 = 0;
                        } else {
                            i10 = 2;
                        }
                        int i11 = i10;
                        org.telegram.ui.ActionBar.r2 r2Var = szVar.Y1;
                        FrameLayout frameLayout = szVar.f32767s;
                        ph.b bVar2 = bVar;
                        TLObject tLObject2 = tLObject;
                        TLRPC.StickerSet stickerSet2 = stickerSet;
                        TLRPC.Document document2 = document;
                        boolean z12 = z10;
                        mediaDataController.toggleStickerSet(context, tLObject2, document2, i11, r2Var, frameLayout, false, true, new bi.k4(szVar, bVar2, tLObject2, stickerSet2, document2, z12), false);
                        szVar.J(bVar2, tLObject2, stickerSet2, document2, z12, true);
                    }
                });
            }
        }
    }

    public final void K(long j10, boolean z10, boolean z11) {
        int i10;
        View childAt;
        float f7;
        wd0 wd0Var = this.f32780w;
        if (wd0Var != null) {
            this.f32778v1 = z10;
            this.f32782w1 = z11;
            if (!z11 && !z10) {
                this.f32775u1 = 0L;
            } else {
                this.f32775u1 = j10;
            }
            if (z11) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            LinearLayout linearLayout = wd0Var.d;
            if (i10 >= linearLayout.getChildCount()) {
                childAt = null;
            } else {
                childAt = linearLayout.getChildAt(i10);
            }
            if (childAt != null) {
                if (this.f32775u1 != 0) {
                    f7 = 0.15f;
                } else {
                    f7 = 1.0f;
                }
                childAt.setAlpha(f7);
                fx fxVar = this.h;
                if (z11) {
                    if (this.f32775u1 != 0 && fxVar.getCurrentItem() != 0) {
                        L(true, true);
                        Q(false, true);
                        fxVar.x(0, false);
                    }
                } else if (this.f32775u1 != 0 && fxVar.getCurrentItem() != 1) {
                    L(false, true);
                    Q(false, true);
                    fxVar.x(1, false);
                }
            }
        }
    }

    public final void L(boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        float f12;
        gx gxVar = this.f32784x;
        if (!z10 || gxVar.getTag() != null) {
            if ((!z10 && gxVar.getTag() != null) || this.f32756o2) {
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
            gxVar.setTag(num);
            int i10 = 0;
            float f13 = 0.0f;
            if (z11) {
                if (z10) {
                    gxVar.setVisibility(0);
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.F = animatorSet2;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(gxVar, View.ALPHA, f11);
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(gxVar, View.SCALE_X, f12);
                if (z10) {
                    f13 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(gxVar, View.SCALE_Y, f13));
                this.F.setDuration(200L);
                this.F.setInterpolator(ds.f27587g);
                this.F.addListener(new mx(this, z10, 0));
                this.F.start();
                return;
            }
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            gxVar.setAlpha(f7);
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            gxVar.setScaleX(f10);
            if (z10) {
                f13 = 1.0f;
            }
            gxVar.setScaleY(f13);
            if (!z10) {
                i10 = 4;
            }
            gxVar.setVisibility(i10);
        }
    }

    public final void M(boolean z10) {
        Integer num;
        this.H = 0.0f;
        ty tyVar = this.f32772t1;
        if (tyVar != null && tyVar.z()) {
            z10 = false;
        }
        FrameLayout frameLayout = this.f32750n;
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
            this.E2.a(z10, true);
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
                this.W.setInterpolator(ds.f27587g);
                this.W.addListener(new org.telegram.ui.qp(this, 26));
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
            s4.t w10 = w(i10);
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
        TLRPC.Chat chat = MessagesController.getInstance(this.f32719c1).getChat(Long.valueOf(this.f32775u1));
        if (chat != null) {
            bi.md mdVar = this.N0;
            if (z10) {
                if (!ChatObject.hasAdminRights(chat) && (tL_chatBannedRights = chat.default_banned_rights) != null && (tL_chatBannedRights.send_stickers || (z11 && tL_chatBannedRights.send_plain))) {
                    org.telegram.ui.ActionBar.r2 r2Var = this.Y1;
                    if (!(r2Var instanceof org.telegram.ui.un) || !((org.telegram.ui.un) r2Var).R6()) {
                        if (z11) {
                            mdVar.setText(LocaleController.getString(R.string.GlobalAttachEmojiRestricted));
                        } else if (z12) {
                            mdVar.setText(LocaleController.getString(R.string.GlobalAttachGifRestricted));
                        } else {
                            mdVar.setText(LocaleController.getString(R.string.GlobalAttachStickersRestricted));
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
                            mdVar.setText(LocaleController.getString(R.string.AttachPlainRestrictedForever));
                        } else if (z12) {
                            mdVar.setText(LocaleController.getString(R.string.AttachGifRestrictedForever));
                        } else {
                            mdVar.setText(LocaleController.getString(R.string.AttachStickersRestrictedForever));
                        }
                    } else {
                        if (z11) {
                            mdVar.setText(LocaleController.formatString("AttachPlainRestricted", R.string.AttachPlainRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                        }
                        if (z12) {
                            mdVar.setText(LocaleController.formatString("AttachGifRestricted", R.string.AttachGifRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                        } else {
                            mdVar.setText(LocaleController.formatString("AttachStickersRestricted", R.string.AttachStickersRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                        }
                    }
                }
                mdVar.setVisibility(0);
            }
            AnimatorSet animatorSet = this.N2;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.N2 = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.N2 = animatorSet2;
            float f10 = 1.0f;
            if (z10) {
                f7 = mdVar.getAlpha();
            } else {
                f7 = 1.0f;
            }
            float f11 = 0.0f;
            if (!z10) {
                f10 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(mdVar, View.ALPHA, f7, f10);
            if (z10) {
                translationY = AndroidUtilities.dp(12.0f);
            } else {
                translationY = mdVar.getTranslationY();
            }
            if (!z10) {
                f11 = AndroidUtilities.dp(12.0f);
            }
            animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(mdVar, View.TRANSLATION_Y, translationY, f11));
            e2.o0 o0Var = this.O2;
            if (o0Var != null) {
                AndroidUtilities.cancelRunOnUIThread(o0Var);
            }
            if (z10) {
                e2.o0 o0Var2 = new e2.o0(this, z11, z12, 4);
                this.O2 = o0Var2;
                AndroidUtilities.runOnUIThread(o0Var2, 3500L);
            }
            this.N2.setDuration(320L);
            this.N2.setInterpolator(ds.h);
            this.N2.start();
        }
    }

    public final void Q(boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        float f12;
        ImageView imageView = this.f32788y;
        if (imageView != null && !this.f32759p2) {
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
                        this.G.setInterpolator(ds.f27587g);
                        this.G.addListener(new mx(this, z10, 1));
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
        org.telegram.ui.ActionBar.r2 r2Var;
        View view = (View) getParent();
        if (view != null) {
            float y3 = getY();
            if (getLayoutParams().height > 0) {
                measuredHeight = getLayoutParams().height;
            } else {
                measuredHeight = getMeasuredHeight();
            }
            float f7 = y3 + measuredHeight;
            if ((!AndroidUtilities.isInMultiwindow && ((r2Var = this.Y1) == null || !r2Var.isInBubbleMode())) || this.V0) {
                dp = view.getHeight();
            } else {
                dp = AndroidUtilities.dp(1.0f);
            }
            float f10 = f7 - dp;
            int i10 = (this.f32766r2 > 0.0f ? 1 : (this.f32766r2 == 0.0f ? 0 : -1));
            FrameLayout frameLayout = this.f32750n;
            if (i10 >= 0) {
                f10 += getMeasuredHeight() - this.f32766r2;
            } else if (frameLayout.getTop() - f10 < 0.0f || !this.f32787x2) {
                f10 = 0.0f;
            }
            float lerp = (-f10) + AndroidUtilities.lerp(AndroidUtilities.dp(50.0f), -this.f32762q2, this.E2.e);
            frameLayout.setTranslationY(lerp);
            if (this.f32721d0) {
                this.f32763r.setTranslationY(lerp);
            }
        }
    }

    public final void S() {
        fz fzVar;
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
        gw gwVar;
        int A10;
        int A11;
        int A12;
        int A13;
        int A14;
        int A15;
        boolean z12 = this.f32774u0;
        View view = this.v;
        if (!z12) {
            setBackground(null);
            view.setBackground(null);
        } else if (!AndroidUtilities.isInMultiwindow && !this.N1) {
            int i10 = org.telegram.ui.ActionBar.y6.He;
            setBackgroundColor(A(i10));
            if (this.f32721d0) {
                view.setBackgroundColor(A(i10));
            }
        } else {
            Drawable background = getBackground();
            int A16 = A(org.telegram.ui.ActionBar.y6.He);
            if (background != null && (background != this.G2 || A16 != this.H2)) {
                this.G2 = background;
                this.H2 = A16;
                background.setColorFilter(new PorterDuffColorFilter(A16, PorterDuff.Mode.MULTIPLY));
            }
        }
        ux uxVar = this.I;
        if (uxVar != null) {
            if (this.f32774u0) {
                uxVar.setBackgroundColor(A(org.telegram.ui.ActionBar.y6.He));
                this.O.setBackgroundColor(A(org.telegram.ui.ActionBar.y6.Ke));
            } else {
                uxVar.setBackground(null);
            }
        }
        fv fvVar = this.B1;
        if (fvVar != null) {
            fvVar.f28322c.a();
        }
        int i11 = 0;
        while (true) {
            fzVar = this.V;
            z10 = this.f32739i2;
            if (i11 >= 3) {
                break;
            }
            if (i11 == 0) {
                fzVar = this.G0;
            } else if (i11 != 1) {
                fzVar = this.f32754o0;
            }
            if (fzVar != null) {
                uq uqVar = fzVar.d;
                FrameLayout frameLayout = fzVar.f28340n;
                View view2 = fzVar.f28339f;
                if (this.f32774u0) {
                    view2.setBackgroundColor(A(org.telegram.ui.ActionBar.y6.He));
                } else {
                    view2.setBackground(null);
                }
                fzVar.e.setBackgroundColor(A(org.telegram.ui.ActionBar.y6.Ke));
                eo0 eo0Var = fzVar.f28338c;
                if (z10) {
                    A12 = v(0.4f);
                } else {
                    A12 = A(org.telegram.ui.ActionBar.y6.Je);
                }
                eo0Var.a(A12);
                Drawable background2 = frameLayout.getBackground();
                if (z10) {
                    A13 = v(0.06f);
                } else {
                    A13 = A(org.telegram.ui.ActionBar.y6.Ie);
                }
                org.telegram.ui.ActionBar.y6.z1(A13, background2);
                frameLayout.invalidate();
                if (z10) {
                    A14 = v(0.45f);
                } else {
                    A14 = A(org.telegram.ui.ActionBar.y6.Je);
                }
                uqVar.setHintTextColor(A14);
                if (z10) {
                    A15 = v(0.8f);
                } else {
                    A15 = A(org.telegram.ui.ActionBar.y6.G6);
                }
                uqVar.setTextColor(A15);
            }
            i11++;
        }
        Paint paint = this.f32769s1;
        if (paint != null) {
            paint.setColor(A(org.telegram.ui.ActionBar.y6.f23306af));
        }
        dy dyVar = this.P;
        if (dyVar != null) {
            dyVar.setGlowColor(A(org.telegram.ui.ActionBar.y6.He));
        }
        zw zwVar = this.D0;
        if (zwVar != null) {
            zwVar.setGlowColor(A(org.telegram.ui.ActionBar.y6.He));
        }
        dx dxVar = this.B0;
        if (dxVar != null) {
            dxVar.setIndicatorColor(A(org.telegram.ui.ActionBar.y6.Qe));
            dxVar.setUnderlineColor(A(org.telegram.ui.ActionBar.y6.Ke));
            if (this.f32774u0) {
                dxVar.setBackgroundColor(A(org.telegram.ui.ActionBar.y6.He));
            } else {
                dxVar.setBackground(null);
            }
        }
        xx xxVar = this.f32757p0;
        if (xxVar != null) {
            xxVar.setIndicatorColor(A(org.telegram.ui.ActionBar.y6.Qe));
            xxVar.setUnderlineColor(A(org.telegram.ui.ActionBar.y6.Ke));
            if (this.f32774u0) {
                xxVar.setBackgroundColor(A(org.telegram.ui.ActionBar.y6.He));
            } else {
                xxVar.setBackground(null);
            }
        }
        if (z10) {
            A = v(0.6f);
        } else {
            A = A(org.telegram.ui.ActionBar.y6.Re);
        }
        if (A != this.I2) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.I2 = A;
        gx gxVar = this.f32784x;
        if (gxVar != null) {
            if (z11) {
                gxVar.setColorFilter(new PorterDuffColorFilter(A, PorterDuff.Mode.MULTIPLY));
            }
            if (fzVar == null) {
                Drawable background3 = gxVar.getBackground();
                int i12 = org.telegram.ui.ActionBar.y6.He;
                org.telegram.ui.ActionBar.y6.E1(background3, A(i12), false);
                org.telegram.ui.ActionBar.y6.E1(gxVar.getBackground(), A(i12), true);
            }
        }
        ImageView imageView = this.f32788y;
        if (imageView != null && z11) {
            imageView.setColorFilter(new PorterDuffColorFilter(A, PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.E;
        if (imageView2 != null && z11) {
            imageView2.setColorFilter(new PorterDuffColorFilter(A, PorterDuff.Mode.MULTIPLY));
        }
        bi.md mdVar = this.N0;
        if (mdVar != null) {
            if (mdVar.getBackground() instanceof ShapeDrawable) {
                ((ShapeDrawable) mdVar.getBackground()).getPaint().setColor(A(org.telegram.ui.ActionBar.y6.f23604qf));
                mdVar.invalidate();
            }
            mdVar.setTextColor(A(org.telegram.ui.ActionBar.y6.f23587pf));
        }
        xy xyVar = this.f32740j0;
        if (xyVar != null) {
            zy zyVar = xyVar.e;
            int i13 = org.telegram.ui.ActionBar.y6.Le;
            int A17 = A(i13);
            if (A17 != this.J2) {
                this.J2 = A17;
                zyVar.f35435a.setColorFilter(new PorterDuffColorFilter(A17, PorterDuff.Mode.MULTIPLY));
            }
            zyVar.f35436b.setTextColor(A(i13));
            zyVar.f35437c.setProgressColor(A(org.telegram.ui.ActionBar.y6.f23428h6));
        }
        int A18 = A(org.telegram.ui.ActionBar.y6.Oh);
        if (this.f32726e2 == null || A18 != this.K2) {
            this.K2 = A18;
            this.f32726e2 = new PorterDuffColorFilter(A18, PorterDuff.Mode.SRC_IN);
        }
        int i14 = 0;
        while (true) {
            Drawable[] drawableArr = this.X0;
            if (i14 >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i14];
            if (z10) {
                A10 = v(0.4f);
            } else {
                A10 = A(org.telegram.ui.ActionBar.y6.Ne);
            }
            org.telegram.ui.ActionBar.y6.B1(drawable, A10, false);
            Drawable drawable2 = drawableArr[i14];
            if (z10) {
                A11 = v(0.8f);
            } else {
                A11 = A(org.telegram.ui.ActionBar.y6.Oe);
            }
            org.telegram.ui.ActionBar.y6.B1(drawable2, A11, true);
            i14++;
        }
        if (uxVar != null && (gwVar = uxVar.f29999y) != null) {
            gwVar.d();
        }
        int i15 = 0;
        while (true) {
            Drawable[] drawableArr2 = this.Y0;
            if (i15 >= drawableArr2.length) {
                break;
            }
            Drawable drawable3 = drawableArr2[i15];
            if (z10) {
                A8 = v(0.4f);
            } else {
                A8 = A(org.telegram.ui.ActionBar.y6.Me);
            }
            org.telegram.ui.ActionBar.y6.B1(drawable3, A8, false);
            Drawable drawable4 = drawableArr2[i15];
            if (z10) {
                A9 = v(0.8f);
            } else {
                A9 = A(org.telegram.ui.ActionBar.y6.Oe);
            }
            org.telegram.ui.ActionBar.y6.B1(drawable4, A9, true);
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
                A6 = v(0.4f);
            } else {
                A6 = A(org.telegram.ui.ActionBar.y6.Me);
            }
            org.telegram.ui.ActionBar.y6.B1(drawable5, A6, false);
            Drawable drawable6 = drawableArr3[i16];
            if (z10) {
                A7 = v(0.8f);
            } else {
                A7 = A(org.telegram.ui.ActionBar.y6.Oe);
            }
            org.telegram.ui.ActionBar.y6.B1(drawable6, A7, true);
            i16++;
        }
        org.telegram.ui.ActionBar.k6 k6Var = this.a2;
        if (k6Var != null) {
            if (z10) {
                A4 = v(0.4f);
            } else {
                A4 = A(org.telegram.ui.ActionBar.y6.Ne);
            }
            org.telegram.ui.ActionBar.y6.B1(k6Var, A4, false);
            if (z10) {
                A5 = v(0.8f);
            } else {
                A5 = A(org.telegram.ui.ActionBar.y6.Oe);
            }
            org.telegram.ui.ActionBar.y6.B1(k6Var, A5, true);
        }
        org.telegram.ui.ActionBar.k6 k6Var2 = this.f32716b2;
        if (k6Var2 != null) {
            if (z10) {
                A2 = v(0.4f);
            } else {
                A2 = A(org.telegram.ui.ActionBar.y6.Qe);
            }
            org.telegram.ui.ActionBar.y6.B1(k6Var2, A2, false);
            if (z10) {
                A3 = v(0.8f);
            } else {
                A3 = A(org.telegram.ui.ActionBar.y6.Qe);
            }
            org.telegram.ui.ActionBar.y6.B1(k6Var2, A3, true);
        }
    }

    public final void T() {
        dy dyVar = this.P;
        if (dyVar != null) {
            for (int i10 = 0; i10 < dyVar.getChildCount(); i10++) {
                View childAt = dyVar.getChildAt(i10);
                if (childAt instanceof iy) {
                    ((iy) childAt).a(true);
                }
            }
        }
    }

    public final void U(int i10) {
        int i11;
        if (!this.f32728f0) {
            int i12 = -1;
            if (i10 != -1) {
                int size = getRecentEmoji().size() + (this.f32721d0 ? 1 : 0);
                zx zxVar = this.R;
                int i13 = zxVar.f35427c;
                ArrayList arrayList = zxVar.f35433x;
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
                        ArrayList<ey> emojipacks = getEmojipacks();
                        int size2 = arrayList.size() - 1;
                        while (true) {
                            if (size2 < 0) {
                                break;
                            } else if (((Integer) arrayList.get(size2)).intValue() <= i10) {
                                ey eyVar = (ey) this.f32761q1.get(size2);
                                while (i14 < emojipacks.size()) {
                                    long j10 = emojipacks.get(i14).f28008b.f22054id;
                                    long j11 = eyVar.f28008b.f22054id;
                                    if (j10 == j11 && (!eyVar.f28011g || (!eyVar.f28010f && !this.f32758p1.contains(Long.valueOf(j11))))) {
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
        ez ezVar;
        int i11;
        boolean z12;
        boolean z13;
        xx xxVar = this.f32757p0;
        int currentPosition = xxVar.getCurrentPosition();
        int i12 = this.f32764r0;
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
        boolean isEmpty = this.f32738i1.isEmpty();
        xxVar.d(false);
        this.f32764r0 = -2;
        this.f32768s0 = -2;
        this.f32771t0 = -2;
        Drawable[] drawableArr = this.Z0;
        if (!isEmpty) {
            this.f32764r0 = 0;
            xxVar.b(0, drawableArr[0]).setContentDescription(LocaleController.getString(R.string.RecentStickers));
            i10 = 1;
        } else {
            i10 = 0;
        }
        this.f32768s0 = i10;
        xxVar.b(1, drawableArr[1]).setContentDescription(LocaleController.getString(R.string.FeaturedGifs));
        this.f32771t0 = i10 + 1;
        AndroidUtilities.dp(13.0f);
        AndroidUtilities.dp(11.0f);
        int i13 = this.f32719c1;
        ArrayList<String> arrayList = MessagesController.getInstance(i13).gifSearchEmojies;
        int size = arrayList.size();
        int i14 = 0;
        while (i14 < size) {
            String str = arrayList.get(i14);
            Emoji.EmojiDrawable emojiDrawable = Emoji.getEmojiDrawable(str);
            if (emojiDrawable != null) {
                TLRPC.Document emojiAnimatedSticker = MediaDataController.getInstance(i13).getEmojiAnimatedSticker(str);
                String i15 = ic.a.i(i14 + 3, "tab");
                int i16 = xxVar.f31637x;
                xxVar.f31637x = i16 + 1;
                jy0 jy0Var = (jy0) xxVar.f31627n.get(i15);
                if (jy0Var != null) {
                    xxVar.g(i15, jy0Var, i16);
                    i11 = currentPosition;
                    z12 = z11;
                } else {
                    i11 = currentPosition;
                    z12 = z11;
                    jy0Var = new jy0(xxVar.getContext(), 2);
                    jy0Var.setFocusable(true);
                    jy0Var.setOnClickListener(new in0(xxVar, 2));
                    jy0Var.setExpanded(xxVar.f31620f0);
                    jy0Var.a(xxVar.f31623i0);
                    xxVar.e.addView(jy0Var, i16);
                }
                jy0Var.d = false;
                jy0Var.setTag(R.id.index_tag, Integer.valueOf(i16));
                jy0Var.setTag(R.id.parent_tag, emojiDrawable);
                jy0Var.setTag(R.id.object_tag, emojiAnimatedSticker);
                if (i16 == xxVar.f31638y) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                jy0Var.setSelected(z13);
                xxVar.h.put(i15, jy0Var);
                jy0Var.setContentDescription(str);
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
        xxVar.h();
        xxVar.q();
        if (z10 && isEmpty) {
            xxVar.m(this.f32768s0);
            ww wwVar = this.f32754o0;
            if (wwVar != null && (ezVar = wwVar.f28341r) != null) {
                ezVar.L1(null);
                return;
            }
            return;
        }
        WeakHashMap weakHashMap = r0.i0.f47108a;
        if (xxVar.isLaidOut()) {
            if (!isEmpty && !z14) {
                xxVar.k(i17 + 1, 0);
            } else if (isEmpty && z14) {
                xxVar.k(i17 - 1, 0);
            }
        }
    }

    public final void W() {
        xy xyVar;
        int size = this.f32738i1.size();
        long calcDocumentsHash = MediaDataController.calcDocumentsHash(this.f32738i1, Integer.MAX_VALUE);
        ArrayList<TLRPC.Document> recentGifs = MediaDataController.getInstance(this.f32719c1).getRecentGifs();
        this.f32738i1 = recentGifs;
        long calcDocumentsHash2 = MediaDataController.calcDocumentsHash(recentGifs, Integer.MAX_VALUE);
        if ((this.f32757p0 != null && size == 0 && !this.f32738i1.isEmpty()) || (size != 0 && this.f32738i1.isEmpty())) {
            V();
        }
        if ((size != this.f32738i1.size() || calcDocumentsHash != calcDocumentsHash2) && (xyVar = this.f32751n0) != null) {
            xyVar.l();
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
        dx dxVar = this.B0;
        if (dxVar != null) {
            org.telegram.ui.xa1 xa1Var = dxVar.e;
            if (dxVar.f31634s != null) {
                return;
            }
            this.F1 = -2;
            this.G1 = -2;
            this.H1 = -2;
            this.I1 = -2;
            this.f32724e0 = false;
            this.E1 = 0;
            int currentPosition = dxVar.getCurrentPosition();
            boolean z17 = true;
            if (getParent() != null && getVisibility() == 0 && (this.f32790y1.size() != 0 || this.f32793z1.size() != 0)) {
                z11 = true;
            } else {
                z11 = false;
            }
            dxVar.d(z11);
            int i11 = this.f32719c1;
            MediaDataController mediaDataController = MediaDataController.getInstance(i11);
            SharedPreferences emojiSettings = MessagesController.getEmojiSettings(i11);
            ArrayList arrayList3 = this.f32748m1;
            arrayList3.clear();
            ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = mediaDataController.getFeaturedStickerSets();
            int size = featuredStickerSets.size();
            for (int i12 = 0; i12 < size; i12++) {
                TLRPC.StickerSetCovered stickerSetCovered = featuredStickerSets.get(i12);
                if (!mediaDataController.isStickerPackInstalled(stickerSetCovered.set.f22054id)) {
                    arrayList3.add(stickerSetCovered);
                }
            }
            qz qzVar = this.F0;
            if (qzVar != null) {
                qzVar.l();
            }
            boolean isEmpty = featuredStickerSets.isEmpty();
            long j10 = 0;
            Drawable[] drawableArr = this.Y0;
            if (!isEmpty && (arrayList3.isEmpty() || emojiSettings.getLong("featured_hidden", 0L) == featuredStickerSets.get(0).set.f22054id)) {
                if (mediaDataController.getUnreadStickerSets().isEmpty()) {
                    i10 = 2;
                } else {
                    i10 = 3;
                }
                jy0 c10 = dxVar.c(i10, drawableArr[i10]);
                c10.h.setText(LocaleController.getString(R.string.FeaturedStickersShort));
                c10.setContentDescription(LocaleController.getString(R.string.FeaturedStickers));
                int i13 = this.E1;
                this.H1 = i13;
                this.E1 = i13 + 1;
            }
            if (!this.f32744k1.isEmpty()) {
                int i14 = this.E1;
                this.G1 = i14;
                this.E1 = i14 + 1;
                jy0 c11 = dxVar.c(1, drawableArr[1]);
                c11.h.setText(LocaleController.getString(R.string.FavoriteStickersShort));
                c11.setContentDescription(LocaleController.getString(R.string.FavoriteStickers));
            }
            if (!this.f32741j1.isEmpty()) {
                int i15 = this.E1;
                this.F1 = i15;
                this.E1 = i15 + 1;
                jy0 c12 = dxVar.c(0, drawableArr[0]);
                c12.h.setText(LocaleController.getString(R.string.RecentStickersShort));
                c12.setContentDescription(LocaleController.getString(R.string.RecentStickers));
            }
            ArrayList arrayList4 = this.f32722d1;
            arrayList4.clear();
            org.telegram.ui.ActionBar.u6 u6Var = null;
            this.f32735h1 = null;
            this.f32729f1 = -1;
            this.f32725e1 = -10;
            if (this.F2 == null || z10) {
                this.F2 = new ArrayList(mediaDataController.getStickerSets(0));
            }
            ArrayList<TLRPC.TL_messages_stickerSet> arrayList5 = this.F2;
            int i16 = 0;
            while (true) {
                TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.f32786x1;
                if (i16 >= stickerSetCoveredArr.length) {
                    break;
                }
                TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCoveredArr[i16];
                long j11 = j10;
                if (stickerSetCovered2 != null) {
                    TLRPC.TL_messages_stickerSet stickerSetById = mediaDataController.getStickerSetById(stickerSetCovered2.set.f22054id);
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
                long j13 = MessagesController.getEmojiSettings(i11).getLong("group_hide_stickers_" + this.J1.f22028id, -1L);
                TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(this.J1.f22028id));
                if (chat != null && this.J1.stickerset != null && ChatObject.hasAdminRights(chat)) {
                    TLRPC.StickerSet stickerSet3 = this.J1.stickerset;
                    if (stickerSet3 != null) {
                        if (j13 == stickerSet3.f22054id) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        this.f32732g1 = z16;
                    }
                } else {
                    if (j13 != -1) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    this.f32732g1 = z15;
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
                        if (this.f32732g1) {
                            this.f32725e1 = arrayList4.size();
                            arrayList4.add(tL_messages_stickerSet3);
                        } else {
                            this.f32725e1 = 0;
                            arrayList4.add(0, tL_messages_stickerSet3);
                        }
                        if (!this.J1.can_set_stickers) {
                            tL_messages_stickerSet3 = null;
                        }
                        this.f32735h1 = tL_messages_stickerSet3;
                    }
                } else if (chatFull.can_set_stickers) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = new TLRPC.TL_messages_stickerSet();
                    if (this.f32732g1) {
                        this.f32725e1 = arrayList4.size();
                        arrayList4.add(tL_messages_stickerSet4);
                    } else {
                        this.f32725e1 = 0;
                        arrayList4.add(0, tL_messages_stickerSet4);
                    }
                }
            }
            int i18 = 0;
            while (i18 < arrayList4.size()) {
                if (i18 == this.f32725e1) {
                    TLRPC.Chat chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(this.J1.f22028id));
                    if (chat2 == null) {
                        arrayList4.remove(0);
                        i18--;
                    } else {
                        this.f32724e0 = z17;
                        String str = "chat" + chat2.f22027id;
                        int i19 = dxVar.f31637x;
                        dxVar.f31637x = i19 + 1;
                        jy0 jy0Var = (jy0) dxVar.f31627n.get(str);
                        if (jy0Var != null) {
                            dxVar.g(str, jy0Var, i19);
                        } else {
                            jy0Var = new jy0(dxVar.getContext(), 0);
                            jy0Var.setFocusable(z17);
                            jy0Var.setOnClickListener(new in0(dxVar, 0));
                            xa1Var.addView(jy0Var, i19);
                            jy0Var.f29743w = z17;
                            j9 j9Var = new j9(u6Var);
                            j9Var.u(AndroidUtilities.dp(14.0f));
                            j9Var.k(UserConfig.selectedAccount, chat2);
                            int i20 = dxVar.f31611a;
                            y9 y9Var = jy0Var.e;
                            y9Var.setLayerNum(i20);
                            y9Var.f(chat2, j9Var);
                            y9Var.setAspectFit(z17);
                            jy0Var.setExpanded(dxVar.f31620f0);
                            jy0Var.a(dxVar.f31623i0);
                            jy0Var.h.setText(chat2.title);
                        }
                        jy0Var.d = z17;
                        jy0Var.setTag(R.id.index_tag, Integer.valueOf(i19));
                        if (i19 == dxVar.f31638y) {
                            z14 = z17;
                        } else {
                            z14 = false;
                        }
                        jy0Var.setSelected(z14);
                        dxVar.h.put(str, jy0Var);
                    }
                    z12 = z17;
                } else {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet5 = (TLRPC.TL_messages_stickerSet) arrayList4.get(i18);
                    TLRPC.StickerSet stickerSet5 = tL_messages_stickerSet5.set;
                    if (stickerSet5 != null && stickerSet5.thumb_document_id != j12) {
                        for (int i21 = 0; i21 < tL_messages_stickerSet5.documents.size(); i21++) {
                            document = tL_messages_stickerSet5.documents.get(i21);
                            if (document != null && tL_messages_stickerSet5.set.thumb_document_id == document.f22033id) {
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
                    String str2 = "set" + tL_messages_stickerSet5.set.f22054id;
                    int i22 = dxVar.f31637x;
                    dxVar.f31637x = i22 + 1;
                    jy0 jy0Var2 = (jy0) dxVar.f31627n.get(str2);
                    if (jy0Var2 != null) {
                        dxVar.g(str2, jy0Var2, i22);
                        z12 = z17;
                    } else {
                        jy0Var2 = new jy0(dxVar.getContext(), 0);
                        jy0Var2.setFocusable(z17);
                        z12 = z17;
                        jy0Var2.setOnClickListener(new in0(dxVar, 1));
                        jy0Var2.setExpanded(dxVar.f31620f0);
                        jy0Var2.a(dxVar.f31623i0);
                        xa1Var.addView(jy0Var2, i22);
                    }
                    jy0Var2.e.setLayerNum(dxVar.f31611a);
                    jy0Var2.d = false;
                    jy0Var2.setTag(closestPhotoSizeWithSize);
                    jy0Var2.setTag(R.id.index_tag, Integer.valueOf(i22));
                    jy0Var2.setTag(R.id.parent_tag, tL_messages_stickerSet5);
                    jy0Var2.setTag(R.id.object_tag, document);
                    if (i22 == dxVar.f31638y) {
                        z13 = z12;
                    } else {
                        z13 = false;
                    }
                    jy0Var2.setSelected(z13);
                    dxVar.h.put(str2, jy0Var2);
                    jy0Var2.setContentDescription(tL_messages_stickerSet5.set.title + ", " + LocaleController.getString(R.string.AccDescrStickerSet));
                }
                i18++;
                z17 = z12;
                u6Var = null;
            }
            dxVar.h();
            dxVar.q();
            if (currentPosition != 0) {
                dxVar.k(currentPosition, currentPosition);
            }
            o();
        }
    }

    public final void Y() {
        boolean z10;
        int i10;
        ex exVar = this.C0;
        dx dxVar = this.B0;
        if (dxVar != null && exVar == null && this.f32772t1 != null) {
            dxVar.setTranslationY(this.f32772t1.p() * (-AndroidUtilities.dp(50.0f)));
        }
        if (exVar == null) {
            return;
        }
        if (getVisibility() == 0 && this.K0 && this.f32772t1.p() != 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        exVar.setVisibility(i10);
        if (z10) {
            Rect rect = this.f32791y2;
            rect.setEmpty();
            this.h.getChildVisibleRect(this.f32785x0, rect, null);
            float p10 = this.f32772t1.p() * AndroidUtilities.dp(50.0f);
            int i11 = rect.left;
            if (i11 != 0 || p10 != 0.0f) {
                this.X1 = false;
            }
            exVar.setTranslationX(i11);
            float translationY = (((getTranslationY() + getTop()) - exVar.getTop()) - dxVar.getExpandedOffset()) - p10;
            if (exVar.getTranslationY() != translationY) {
                exVar.setTranslationY(translationY);
                exVar.invalidate();
            }
        }
        if (this.X1 && z10 && this.P0) {
            dxVar.i(this.W1, true);
            return;
        }
        this.X1 = false;
        dxVar.i(this.W1, false);
    }

    public final void Z() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        org.telegram.ui.Cells.q3 q3Var;
        LongSparseArray longSparseArray = this.f32793z1;
        LongSparseArray longSparseArray2 = this.f32790y1;
        int i10 = this.f32719c1;
        zw zwVar = this.D0;
        if (zwVar != null) {
            try {
                int childCount = zwVar.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = zwVar.getChildAt(i11);
                    if ((childAt instanceof org.telegram.ui.Cells.q3) && ((vl0) zwVar.T(childAt)) != null) {
                        org.telegram.ui.Cells.q3 q3Var2 = (org.telegram.ui.Cells.q3) childAt;
                        ArrayList<Long> unreadStickerSets = MediaDataController.getInstance(i10).getUnreadStickerSets();
                        TLRPC.StickerSetCovered stickerSet = q3Var2.getStickerSet();
                        if (unreadStickerSets != null && unreadStickerSets.contains(Long.valueOf(stickerSet.set.f22054id))) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        int i12 = 0;
                        while (true) {
                            TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.f32786x1;
                            if (i12 < stickerSetCoveredArr.length) {
                                TLRPC.StickerSetCovered stickerSetCovered = stickerSetCoveredArr[i12];
                                if (stickerSetCovered != null) {
                                    q3Var = q3Var2;
                                    if (stickerSetCovered.set.f22054id == stickerSet.set.f22054id) {
                                        q3Var2 = q3Var;
                                        z11 = true;
                                        break;
                                    }
                                } else {
                                    q3Var = q3Var2;
                                }
                                i12++;
                                q3Var2 = q3Var;
                            } else {
                                z11 = false;
                                break;
                            }
                        }
                        q3Var2.c(stickerSet, z10, true, 0, 0, z11);
                        if (z10) {
                            MediaDataController.getInstance(i10).markFeaturedStickersByIdAsRead(false, stickerSet.set.f22054id);
                        }
                        if (longSparseArray2.indexOfKey(stickerSet.set.f22054id) >= 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (longSparseArray.indexOfKey(stickerSet.set.f22054id) >= 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z12 || z13) {
                            if (z12 && q3Var2.f24824r) {
                                longSparseArray2.remove(stickerSet.set.f22054id);
                                z12 = false;
                            } else if (z13 && !q3Var2.f24824r) {
                                longSparseArray.remove(stickerSet.set.f22054id);
                            }
                        }
                        if (!z11 && z12) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        q3Var2.b(z14, true);
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    @Override
    public final void c(int i10) {
        setBottomInset(i10);
    }

    @Override
    public final void d(float f7) {
        this.f32766r2 = f7;
        R();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        Utilities.Callback callback;
        TLRPC.StickerSet stickerSet;
        int i12 = NotificationCenter.stickersDidLoad;
        zx zxVar = this.R;
        lw lwVar = this.P2;
        if (i10 == i12) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (this.f32789y0 != null) {
                    X(((Boolean) objArr[1]).booleanValue());
                    Z();
                    D();
                    o();
                }
            } else if (((Integer) objArr[0]).intValue() == 5) {
                if (((Boolean) objArr[1]).booleanValue()) {
                    AndroidUtilities.cancelRunOnUIThread(lwVar);
                    AndroidUtilities.runOnUIThread(lwVar, 100L);
                    return;
                }
                zxVar.F(false);
            }
        } else if (i10 == NotificationCenter.groupPackUpdated) {
            long longValue = ((Long) objArr[0]).longValue();
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            TLRPC.ChatFull chatFull = this.J1;
            if (chatFull != null && chatFull.f22028id == longValue && booleanValue) {
                zxVar.F(true);
            }
        } else if (i10 == NotificationCenter.recentDocumentsDidLoad) {
            boolean booleanValue2 = ((Boolean) objArr[0]).booleanValue();
            int intValue = ((Integer) objArr[1]).intValue();
            if (booleanValue2 || intValue == 0 || intValue == 2) {
                k(booleanValue2);
            }
        } else if (i10 == NotificationCenter.featuredStickersDidLoad) {
            Z();
            wd0 wd0Var = this.f32780w;
            if (wd0Var != null) {
                int childCount = wd0Var.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    wd0Var.getChildAt(i13).invalidate();
                }
            }
            X(false);
        } else if (i10 == NotificationCenter.featuredEmojiDidLoad) {
            if (zxVar != null) {
                zxVar.F(false);
            }
        } else {
            int i14 = NotificationCenter.groupStickersDidLoad;
            sy syVar = this.S;
            if (i10 == i14) {
                Long l4 = (Long) objArr[0];
                long longValue2 = l4.longValue();
                if (objArr.length > 1) {
                    tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) objArr[1];
                } else {
                    tL_messages_stickerSet = null;
                }
                if (tL_messages_stickerSet != null) {
                    nz nzVar = this.f32792z0;
                    if (nzVar != null && nzVar.d == longValue2 && nzVar.f31095f.size() < tL_messages_stickerSet.documents.size()) {
                        nzVar.f31095f = tL_messages_stickerSet.documents;
                        nzVar.l();
                    }
                    if (syVar != null && syVar.d == longValue2 && syVar.f32703f.size() < tL_messages_stickerSet.documents.size()) {
                        syVar.f32703f = tL_messages_stickerSet.documents;
                        syVar.l();
                    }
                }
                TLRPC.ChatFull chatFull2 = this.J1;
                if (chatFull2 != null && (stickerSet = chatFull2.stickerset) != null && stickerSet.f22054id == longValue2) {
                    X(false);
                }
                HashMap hashMap = this.f32765r1;
                if (hashMap.containsKey(l4) && objArr.length >= 2 && ((Utilities.Callback) hashMap.get(l4)) != null && tL_messages_stickerSet != null && (callback = (Utilities.Callback) hashMap.remove(l4)) != null) {
                    callback.run(tL_messages_stickerSet);
                }
                AndroidUtilities.cancelRunOnUIThread(lwVar);
                AndroidUtilities.runOnUIThread(lwVar, 100L);
                return;
            }
            int i15 = NotificationCenter.emojiLoaded;
            dy dyVar = this.P;
            if (i10 == i15) {
                zw zwVar = this.D0;
                if (zwVar != null) {
                    int childCount2 = zwVar.getChildCount();
                    for (int i16 = 0; i16 < childCount2; i16++) {
                        View childAt = zwVar.getChildAt(i16);
                        if ((childAt instanceof org.telegram.ui.Cells.s8) || (childAt instanceof org.telegram.ui.Cells.i8)) {
                            childAt.invalidate();
                        }
                    }
                }
                if (dyVar != null) {
                    dyVar.invalidate();
                    int childCount3 = dyVar.getChildCount();
                    for (int i17 = 0; i17 < childCount3; i17++) {
                        View childAt2 = dyVar.getChildAt(i17);
                        if (childAt2 instanceof bz) {
                            childAt2.invalidate();
                        }
                    }
                }
                fv fvVar = this.B1;
                if (fvVar != null) {
                    fvVar.f28322c.invalidate();
                }
                xx xxVar = this.f32757p0;
                if (xxVar != null) {
                    org.telegram.ui.xa1 xa1Var = xxVar.e;
                    int childCount4 = xa1Var.getChildCount();
                    for (int i18 = 0; i18 < childCount4; i18++) {
                        xa1Var.getChildAt(i18).invalidate();
                    }
                }
            } else if (i10 == NotificationCenter.newEmojiSuggestionsAvailable) {
                if (dyVar != null && this.f32721d0) {
                    if ((this.V.f28338c.f27918k == 2 || dyVar.getAdapter() == syVar) && !TextUtils.isEmpty(syVar.v)) {
                        syVar.F(syVar.v, true);
                    }
                }
            } else if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                if (zxVar != null) {
                    zxVar.F(false);
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
            if (this.f32750n.getVisibility() != 8 && !this.f32774u0 && this.f32781w0) {
                canvas.drawColor(i0.a.o(-1, 25));
            }
            boolean drawChild = super.drawChild(canvas, view, j10);
            float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(this.f32762q2);
            if (navigationBarThirdButtonsFactor > 0.0f) {
                int o12 = org.telegram.ui.ActionBar.y6.o1(navigationBarThirdButtonsFactor, A(org.telegram.ui.ActionBar.y6.He));
                int i10 = this.A2;
                GradientDrawable gradientDrawable = this.f32794z2;
                if (i10 != o12) {
                    gradientDrawable.setColors(new int[]{o12, org.telegram.ui.ActionBar.y6.o1(0.66f, o12), i0.a.o(o12, 0)});
                    this.A2 = o12;
                }
                gradientDrawable.setBounds(0, getMeasuredHeight() - this.f32762q2, getMeasuredWidth(), getMeasuredHeight());
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

    public ArrayList<ey> getEmojipacks() {
        ArrayList<ey> arrayList = new ArrayList<>();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f32761q1;
            if (i10 < arrayList2.size()) {
                ey eyVar = (ey) arrayList2.get(i10);
                boolean z10 = eyVar.f28011g;
                ArrayList arrayList3 = this.f32758p1;
                if ((!z10 && (eyVar.f28010f || arrayList3.contains(Long.valueOf(eyVar.f28008b.f22054id)))) || (eyVar.f28011g && !eyVar.f28010f && !arrayList3.contains(Long.valueOf(eyVar.f28008b.f22054id)))) {
                    arrayList.add(eyVar);
                }
                i10++;
            } else {
                return arrayList;
            }
        }
    }

    public ArrayList<String> getRecentEmoji() {
        if (this.f32720c2) {
            return Emoji.recentEmoji;
        }
        if (this.B2 == null) {
            this.B2 = new ArrayList();
        }
        if (Emoji.recentEmoji.size() != this.C2) {
            this.B2.clear();
            int i10 = 0;
            while (true) {
                ArrayList<String> arrayList = Emoji.recentEmoji;
                if (i10 >= arrayList.size()) {
                    break;
                }
                if (!arrayList.get(i10).startsWith("animated_")) {
                    this.B2.add(arrayList.get(i10));
                }
                i10++;
            }
            this.C2 = this.B2.size();
        }
        return this.B2;
    }

    public float getStickersExpandOffset() {
        dx dxVar = this.B0;
        if (dxVar == null) {
            return 0.0f;
        }
        return dxVar.getExpandedOffset();
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
                if (!this.f32720c2) {
                    ArrayList arrayList = this.B2;
                    if (arrayList == null) {
                        this.B2 = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    while (true) {
                        ArrayList<String> arrayList2 = Emoji.recentEmoji;
                        if (i10 < arrayList2.size()) {
                            if (!arrayList2.get(i10).startsWith("animated_")) {
                                this.B2.add(arrayList2.get(i10));
                            }
                            i10++;
                        } else {
                            this.C2 = this.B2.size();
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
        nx nxVar = new nx(getContext(), i11);
        nxVar.f47680a = !z10 ? 1 : 0;
        w(i10).w0(nxVar);
    }

    public final void k(boolean z10) {
        if (z10) {
            W();
            return;
        }
        int size = this.f32741j1.size();
        int size2 = this.f32744k1.size();
        int i10 = this.f32719c1;
        this.f32741j1 = MediaDataController.getInstance(i10).getRecentStickers(0, true);
        this.f32744k1 = MediaDataController.getInstance(i10).getRecentStickers(2);
        if (UserConfig.getInstance(i10).isPremium()) {
            this.l1 = MediaDataController.getInstance(i10).getRecentStickers(7);
        } else {
            this.l1 = new ArrayList();
        }
        for (int i11 = 0; i11 < this.f32744k1.size(); i11++) {
            TLRPC.Document document = (TLRPC.Document) this.f32744k1.get(i11);
            int i12 = 0;
            while (true) {
                if (i12 < this.f32741j1.size()) {
                    TLRPC.Document document2 = (TLRPC.Document) this.f32741j1.get(i12);
                    if (document2.dc_id == document.dc_id && document2.f22033id == document.f22033id) {
                        this.f32741j1.remove(i12);
                        break;
                    }
                    i12++;
                }
            }
        }
        if (MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            int i13 = 0;
            while (i13 < this.f32744k1.size()) {
                if (MessageObject.isPremiumSticker((TLRPC.Document) this.f32744k1.get(i13))) {
                    this.f32744k1.remove(i13);
                    i13--;
                }
                i13++;
            }
            int i14 = 0;
            while (i14 < this.f32741j1.size()) {
                if (MessageObject.isPremiumSticker((TLRPC.Document) this.f32741j1.get(i14))) {
                    this.f32741j1.remove(i14);
                    i14--;
                }
                i14++;
            }
        }
        if (size != this.f32741j1.size() || size2 != this.f32744k1.size()) {
            X(false);
        }
        jz jzVar = this.f32789y0;
        if (jzVar != null) {
            jzVar.l();
        }
        o();
    }

    public final void l(boolean z10) {
        int i10;
        boolean z11;
        ty tyVar = this.f32772t1;
        oe.b bVar = this.f32713b;
        dy dyVar = this.P;
        rw rwVar = this.V;
        if (tyVar != null && tyVar.z()) {
            s4.e1 K = dyVar.K(0);
            if (K == null) {
                fz.a(rwVar, true, !z10);
            } else {
                if (K.f47738a.getTop() < dyVar.getPaddingTop()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                fz.a(rwVar, z11, !z10);
            }
            N(false, !z10);
            rwVar.setTranslationY(bVar.e * AndroidUtilities.dp(15.0f));
        } else if (rwVar != null && dyVar != null) {
            s4.e1 K2 = dyVar.K(0);
            if (K2 != null) {
                i10 = K2.f47738a.getTop();
            } else {
                i10 = -this.f32715b1;
            }
            rwVar.setTranslationY((bVar.e * AndroidUtilities.dp(15.0f)) + i10);
            rwVar.f28336a.a(false, !z10);
            m(Math.round(this.I.getTranslationY()));
        }
    }

    public final void m(int i10) {
        ObjectAnimator objectAnimator = this.R0[1];
        if (objectAnimator != null && objectAnimator.isRunning()) {
            return;
        }
        boolean z10 = false;
        s4.e1 K = this.P.K(0);
        int dp = AndroidUtilities.dp(38.0f) + i10;
        if (dp > 0 && (K == null || K.f47738a.getBottom() < dp)) {
            z10 = true;
        }
        N(z10, !this.K1);
    }

    public final void n(int i10, View view) {
        dy dyVar;
        s4.e1 K;
        int i11;
        ux uxVar = this.I;
        int[] iArr = this.Q0;
        if (view == null) {
            iArr[1] = 0;
            uxVar.setTranslationY(0);
        } else if (view.getVisibility() == 0 && !this.f32728f0) {
            ty tyVar = this.f32772t1;
            if (tyVar == null || !tyVar.z()) {
                if (i10 > 0 && (dyVar = this.P) != null && dyVar.getVisibility() == 0 && (K = dyVar.K(0)) != null) {
                    int top = K.f47738a.getTop();
                    if (this.f32721d0) {
                        i11 = this.f32715b1;
                    } else {
                        i11 = 0;
                    }
                    if (top + i11 >= dyVar.getPaddingTop()) {
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
                uxVar.setTranslationY(Math.max(-AndroidUtilities.dp(36.0f), iArr[1]));
            }
        }
    }

    public final void o() {
        int L0;
        dx dxVar = this.B0;
        if (dxVar != null && (L0 = this.E0.L0()) != -1) {
            int i10 = this.G1;
            if (i10 <= 0 && (i10 = this.F1) <= 0) {
                i10 = this.E1;
            }
            dxVar.k(this.f32789y0.F(L0), i10);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.ObserversGroup observersGroup = this.M2;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.M2 = null;
        }
        NotificationCenter.ObserversGroup add = NotificationCenter.getInstance(this.f32719c1).createWeakObserversGroup(this).addGlobal(NotificationCenter.emojiLoaded).add(NotificationCenter.newEmojiSuggestionsAvailable).add(NotificationCenter.groupPackUpdated);
        this.M2 = add;
        if (this.f32789y0 != null) {
            add.add(NotificationCenter.stickersDidLoad).add(NotificationCenter.recentDocumentsDidLoad).add(NotificationCenter.featuredStickersDidLoad).add(NotificationCenter.groupStickersDidLoad).add(NotificationCenter.currentUserPremiumStatusChanged);
            AndroidUtilities.runOnUIThread(new lw(this, 0));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        fv fvVar = this.B1;
        if (fvVar != null && fvVar.isShowing()) {
            fvVar.dismiss();
        }
        org.telegram.ui.ft o10 = org.telegram.ui.ft.o();
        if (o10.f39459l == this.f32733g2) {
            o10.W = null;
            o10.f39447a0 = null;
            o10.Y = null;
            o10.f39459l = null;
            o10.f39451c0 = null;
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
        boolean z11 = this.f32721d0;
        if (!z10 && !this.N1) {
            if (this.L1 != 0) {
                if (!this.L2) {
                    setOutlineProvider(null);
                    setClipToOutline(false);
                    setElevation(0.0f);
                }
                if (this.f32774u0) {
                    int i12 = org.telegram.ui.ActionBar.y6.He;
                    setBackgroundColor(A(i12));
                    if (z11) {
                        view.setBackgroundColor(A(i12));
                    }
                }
                this.L1 = 0;
            }
        } else if (this.L1 != 1) {
            if (!this.L2) {
                setOutlineProvider(this.M1);
                setClipToOutline(true);
                setElevation(AndroidUtilities.dp(2.0f));
            }
            setBackgroundResource(R.drawable.smiles_popup);
            Drawable background = getBackground();
            int i13 = org.telegram.ui.ActionBar.y6.He;
            background.setColorFilter(new PorterDuffColorFilter(A(i13), PorterDuff.Mode.MULTIPLY));
            if (z11 && this.f32774u0) {
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
                this.B0.k(this.f32789y0.F(L02), i12);
            }
        } else if (i10 == 2) {
            s4.h0 adapter = this.f32734h0.getAdapter();
            xy xyVar = this.f32751n0;
            if (adapter == xyVar && xyVar.I >= 0 && this.f32768s0 >= 0 && this.f32764r0 >= 0 && (L0 = this.f32737i0.L0()) != -1) {
                if (L0 >= xyVar.I) {
                    i11 = this.f32768s0;
                } else {
                    i11 = this.f32764r0;
                }
                this.f32757p0.k(i11, 0);
            }
        }
    }

    public final void q(boolean z10) {
        int i10;
        ty tyVar = this.f32772t1;
        oe.b bVar = this.f32710a;
        zw zwVar = this.D0;
        boolean z11 = false;
        cx cxVar = this.G0;
        if (tyVar != null && tyVar.z()) {
            s4.e1 K = zwVar.K(0);
            if (K == null) {
                fz.a(cxVar, true, !z10);
            } else {
                if (K.f47738a.getTop() < zwVar.getPaddingTop()) {
                    z11 = true;
                }
                fz.a(cxVar, z11, !z10);
            }
            cxVar.setTranslationY(bVar.e * AndroidUtilities.dp(15.0f));
        } else if (cxVar != null && zwVar != null) {
            s4.e1 K2 = zwVar.K(0);
            if (K2 != null) {
                i10 = K2.f47738a.getTop();
            } else {
                i10 = -this.f32715b1;
            }
            cxVar.setTranslationY((bVar.e * AndroidUtilities.dp(15.0f)) + i10);
            cxVar.f28336a.a(false, !z10);
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

    public final void s(long j10, boolean z10) {
        fz fzVar;
        s4.c0 c0Var;
        View view;
        View view2;
        int i10;
        int i11;
        TLRPC.TL_messages_stickerSet stickerSetById;
        jz jzVar;
        int E;
        AnimatorSet animatorSet = this.M0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.M0 = null;
        }
        int currentItem = this.h.getCurrentItem();
        int i12 = 2;
        if (currentItem == 2 && j10 != -1 && (stickerSetById = MediaDataController.getInstance(this.f32719c1).getStickerSetById(j10)) != null && (E = (jzVar = this.f32789y0).E(stickerSetById)) >= 0 && E < jzVar.h()) {
            H(E, AndroidUtilities.dp(48.0f));
        }
        int i13 = 0;
        xy xyVar = this.f32740j0;
        if (xyVar != null) {
            xyVar.K = false;
        }
        int i14 = 0;
        while (i14 < 3) {
            View view3 = this.D0;
            View view4 = this.f32734h0;
            ww wwVar = this.f32754o0;
            View view5 = this.P;
            if (i14 == 0) {
                fzVar = this.V;
                c0Var = this.Q;
                view = this.I;
                view2 = view5;
            } else if (i14 == 1) {
                c0Var = this.f32737i0;
                view = this.f32757p0;
                view2 = view4;
                fzVar = wwVar;
            } else {
                fzVar = this.G0;
                c0Var = this.E0;
                view = this.B0;
                view2 = view3;
            }
            if (fzVar == null) {
                i11 = i13;
                i10 = i12;
            } else {
                int i15 = i13;
                ez ezVar = fzVar.f28341r;
                int i16 = i12;
                fzVar.d.setText("");
                if (ezVar != null) {
                    ezVar.L1(null);
                    ezVar.J1();
                }
                int i17 = this.f32715b1;
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
                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(fzVar, property, fArr3);
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
                    this.M0.setInterpolator(ds.h);
                    this.M0.addListener(new di.o3(this, c0Var, view2, 5));
                    this.M0.start();
                    i11 = i15;
                    i10 = i16;
                } else {
                    if (fzVar != wwVar) {
                        fzVar.setTranslationY(AndroidUtilities.dp(36.0f) - i17);
                    }
                    i10 = i16;
                    if (view != null && i14 != i10) {
                        view.setTranslationY(0.0f);
                    }
                    if (view2 == view3) {
                        i11 = i15;
                        view2.setPadding(i11, AndroidUtilities.dp(36.0f), i11, AndroidUtilities.dp(44.0f) + this.f32762q2);
                    } else {
                        i11 = i15;
                        if (view2 == view4) {
                            view2.setPadding(i11, AndroidUtilities.dp(40.0f), i11, AndroidUtilities.dp(44.0f) + this.f32762q2);
                        } else {
                            if (view2 == view5) {
                                view2.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f) + this.f32762q2);
                            }
                            i11 = 0;
                        }
                    }
                    c0Var.h1(i11, i11);
                }
            }
            i14++;
            i12 = i10;
            i13 = i11;
        }
        int i18 = i13;
        if (!z10) {
            this.f32772t1.i(i18);
        }
    }

    public void setBlurredBackgroundDrawableFactory(ch.b bVar) {
        org.telegram.ui.ActionBar.u6 u6Var = this.Z1;
        View view = this.f32784x;
        if (view != null) {
            eh.d c10 = bVar.c(view, null, false);
            c10.v(gh.c.d(u6Var));
            c10.x(AndroidUtilities.dp(18.0f));
            c10.w(AndroidUtilities.dp(6.0f));
            view.setBackground(c10);
        }
        View view2 = this.E;
        if (view2 != null) {
            eh.d c11 = bVar.c(view2, null, false);
            c11.v(gh.c.d(u6Var));
            c11.x(AndroidUtilities.dp(18.0f));
            c11.w(AndroidUtilities.dp(6.0f));
            view2.setBackground(c11);
        }
        View view3 = this.f32780w;
        if (view3 != null) {
            eh.d c12 = bVar.c(view3, null, false);
            c12.v(gh.c.d(u6Var));
            c12.x(AndroidUtilities.dp(18.0f));
            c12.w(AndroidUtilities.dp(6.0f));
            view3.setBackground(c12);
        }
        View view4 = this.f32788y;
        if (view4 != null) {
            eh.d c13 = bVar.c(view4, null, false);
            c13.v(gh.c.d(u6Var));
            c13.x(AndroidUtilities.dp(18.0f));
            c13.w(AndroidUtilities.dp(6.0f));
            view4.setBackground(c13);
        }
    }

    public void setBottomInset(int i10) {
        if (this.f32762q2 != i10) {
            this.f32762q2 = i10;
            j(i10, this.K);
            j(i10, this.M);
            j(AndroidUtilities.dp(44.0f) + i10, this.P);
            j(AndroidUtilities.dp(44.0f) + i10, this.D0);
            j(AndroidUtilities.dp(44.0f) + i10, this.f32734h0);
            FrameLayout frameLayout = this.f32767s;
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

    public void setDelegate(ty tyVar) {
        this.f32772t1 = tyVar;
    }

    public void setDragListener(wx wxVar) {
        this.O0 = wxVar;
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        cx cxVar = this.G0;
        if (cxVar != null) {
            cxVar.d.setEnabled(z10);
        }
        ww wwVar = this.f32754o0;
        if (wwVar != null) {
            wwVar.d.setEnabled(z10);
        }
        rw rwVar = this.V;
        if (rwVar != null) {
            rwVar.d.setEnabled(z10);
        }
    }

    public void setForseMultiwindowLayout(boolean z10) {
        this.N1 = z10;
    }

    public void setShouldDrawBackground(boolean z10) {
        if (this.f32774u0 != z10) {
            this.f32774u0 = z10;
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
                int i11 = this.f32719c1;
                NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.stickersDidLoad);
                if (this.f32789y0 != null) {
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
            ig.f1 f1Var = this.T0;
            if (f1Var != null) {
                f1Var.a();
            }
        }
    }

    public final void t(boolean z10) {
        s(-1L, z10);
    }

    public final void u(boolean z10) {
        jz jzVar;
        boolean z11 = this.R2;
        this.R2 = z10;
        if (z11 && !z10) {
            int i10 = this.A1;
            if (i10 == 0) {
                zx zxVar = this.R;
                if (zxVar != null) {
                    zxVar.F(false);
                }
            } else if (i10 == 1) {
                xy xyVar = this.f32751n0;
                if (xyVar != null) {
                    xyVar.l();
                }
            } else if (i10 == 2 && (jzVar = this.f32789y0) != null) {
                jzVar.l();
            }
        }
    }

    @Override
    public final void updateColors() {
        try {
            S();
            hh.c cVar = this.f32747l2;
            if (cVar != null) {
                cVar.a(A(org.telegram.ui.ActionBar.y6.f23356d6));
            }
            wd0 wd0Var = this.f32780w;
            if (wd0Var != null) {
                wd0Var.setIndicatorColor(i0.a.o(A(org.telegram.ui.ActionBar.y6.Oe), 20));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final int v(float f7) {
        return i0.a.o(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Wk, this.Z1), (int) (f7 * 255.0f));
    }

    public final s4.t w(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return this.f32737i0;
                }
                throw new IllegalArgumentException(ic.a.i(i10, "Unexpected argument: "));
            }
            return this.Q;
        }
        return this.E0;
    }

    public final mm0 x(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return this.f32734h0;
                }
                throw new IllegalArgumentException(ic.a.i(i10, "Unexpected argument: "));
            }
            return this.P;
        }
        return this.D0;
    }

    public final HorizontalScrollView y(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return this.f32757p0;
                }
                throw new IllegalArgumentException(ic.a.i(i10, "Unexpected argument: "));
            }
            return this.I;
        }
        return this.B0;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void z(float f7, int i10) {
    }
}
