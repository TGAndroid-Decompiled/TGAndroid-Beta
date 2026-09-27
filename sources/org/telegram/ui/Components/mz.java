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
public class mz extends FrameLayout implements le.e, NotificationCenter.NotificationCenterDelegate, ph.a {
    public static final int M2 = 0;
    public final kw A0;
    public int A1;
    public ArrayList A2;
    public final yw B0;
    public final zu B1;
    public int B2;
    public final zw C0;
    public final int C1;
    public long C2;
    public final uw D0;
    public final int[] D1;
    public final le.c D2;
    public final ImageView E;
    public final vw E0;
    public int E1;
    public ArrayList E2;
    public AnimatorSet F;
    public kz F0;
    public int F1;
    public boolean F2;
    public AnimatorSet G;
    public final xw G0;
    public int G1;
    public NotificationCenter.ObserversGroup G2;
    public float H;
    public final nh.d H0;
    public int H1;
    public AnimatorSet H2;
    public final px I;
    public boolean I0;
    public int I1;
    public org.telegram.messenger.video.k I2;
    public final kx J;
    public boolean J0;
    public TLRPC.ChatFull J1;
    public final fw J2;
    public final ci.m6 K;
    public boolean K0;
    public boolean K1;
    public boolean K2;
    public final nh.b L;
    public final fy L0;
    public int L1;
    public boolean L2;
    public final ci.m6 M;
    public AnimatorSet M0;
    public final ai.i6 M1;
    public final nh.b N;
    public final ai.p4 N0;
    public boolean N1;
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
    public vy R1;
    public final my S;
    public boolean S0;
    public float S1;
    public kz T;
    public gg.g1 T0;
    public float T1;
    public final nh.d U;
    public boolean U0;
    public float U1;
    public final mw V;
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
    public final org.telegram.ui.ActionBar.e6 Z1;
    public final le.c f26565a;
    public final bl0 f26566a0;
    public final String[] f26567a1;
    public final org.telegram.ui.ActionBar.u5 a2;
    public final le.c f26568b;
    public final bl0 f26569b0;
    public final int f26570b1;
    public final org.telegram.ui.ActionBar.u5 f26571b2;
    public int f26572c;
    public boolean f26573c0;
    public final int f26574c1;
    public final boolean f26575c2;
    public final ArrayList d;
    public final boolean f26576d0;
    public final ArrayList f26577d1;
    public LongSparseArray f26578d2;
    public final ArrayList e;
    public boolean f26579e0;
    public int f26580e1;
    public PorterDuffColorFilter f26581e2;
    public boolean f26582f;
    public boolean f26583f0;
    public int f26584f1;
    public final org.telegram.ui.Cells.t6 f26585f2;
    public final ow f26586g0;
    public boolean f26587g1;
    public final gx f26588g2;
    public final ax h;
    public final pw f26589h0;
    public TLRPC.TL_messages_stickerSet f26590h1;
    public boolean f26591h2;
    public final sy f26592i0;
    public ArrayList f26593i1;
    public final boolean f26594i2;
    public final ry f26595j0;
    public ArrayList f26596j1;
    public final ah.i f26597j2;
    public final uy f26598k0;
    public ArrayList f26599k1;
    public final lh f26600k2;
    public final HashMap f26601l0;
    public ArrayList l1;
    public final ah.c f26602l2;
    public final kw m0;
    public final ArrayList f26603m1;
    public final li.l f26604m2;
    public final FrameLayout f26605n;
    public final ry f26606n0;
    public final ArrayList f26607n1;
    public boolean f26608n2;
    public final rw f26609o0;
    public final ArrayList f26610o1;
    public boolean f26611o2;
    public final sx f26612p0;
    public final ArrayList f26613p1;
    public int f26614p2;
    public boolean f26615q0;
    public final ArrayList f26616q1;
    public float f26617q2;
    public final FrameLayout f26618r;
    public int f26619r0;
    public final HashMap f26620r1;
    public View f26621r2;
    public final FrameLayout f26622s;
    public int f26623s0;
    public final Paint f26624s1;
    public int f26625s2;
    public int f26626t0;
    public ny f26627t1;
    public int f26628t2;
    public boolean f26629u0;
    public long f26630u1;
    public long f26631u2;
    public final View v;
    public boolean f26632v0;
    public boolean f26633v1;
    public boolean f26634v2;
    public final od0 f26635w;
    public boolean f26636w0;
    public boolean f26637w1;
    public boolean f26638w2;
    public final bx f26639x;
    public final sw f26640x0;
    public final TLRPC.StickerSetCovered[] f26641x1;
    public final Rect f26642x2;
    public final ImageView f26643y;
    public final dz f26644y0;
    public final LongSparseArray f26645y1;
    public final GradientDrawable f26646y2;
    public final hz f26647z0;
    public final LongSparseArray f26648z1;
    public int f26649z2;

    public mz(org.telegram.ui.ActionBar.o2 o2Var, boolean z10, boolean z11, boolean z12, Context context, boolean z13, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z14, final org.telegram.ui.ActionBar.e6 e6Var, boolean z15, boolean z16) {
        super(context);
        org.telegram.ui.ActionBar.u5 u5Var;
        int z17;
        kx kxVar;
        Context context2;
        fw fwVar;
        boolean z18;
        Field field;
        int i10;
        sr srVar = sr.h;
        this.f26565a = new le.c(0, this, srVar, 320L, false);
        this.f26568b = new le.c(1, this, srVar, 320L, false);
        this.f26572c = 2;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.e = new ArrayList();
        this.f26573c0 = true;
        this.f26598k0 = new uy(this);
        this.f26601l0 = new HashMap();
        this.f26615q0 = true;
        this.f26619r0 = -2;
        this.f26623s0 = -2;
        this.f26626t0 = -2;
        this.f26629u0 = true;
        this.f26636w0 = true;
        this.I0 = true;
        this.Q0 = new int[3];
        this.R0 = new ObjectAnimator[3];
        int i11 = UserConfig.selectedAccount;
        this.f26574c1 = i11;
        this.f26577d1 = new ArrayList();
        this.f26593i1 = new ArrayList();
        this.f26596j1 = new ArrayList();
        this.f26599k1 = new ArrayList();
        this.l1 = new ArrayList();
        this.f26603m1 = new ArrayList();
        this.f26607n1 = new ArrayList();
        new ArrayList();
        this.f26610o1 = new ArrayList();
        this.f26613p1 = new ArrayList();
        this.f26616q1 = new ArrayList();
        this.f26620r1 = new HashMap();
        this.f26641x1 = new TLRPC.StickerSetCovered[10];
        this.f26645y1 = new LongSparseArray();
        this.f26648z1 = new LongSparseArray();
        this.D1 = new int[2];
        this.F1 = -2;
        this.G1 = -2;
        this.H1 = -2;
        this.I1 = -2;
        this.L1 = -1;
        this.f26585f2 = new org.telegram.ui.Cells.t6(this, 12);
        this.f26588g2 = new gx(this);
        this.f26591h2 = true;
        li.l lVar = new li.l();
        this.f26604m2 = lVar;
        this.f26617q2 = -1.0f;
        this.f26625s2 = -1;
        this.f26628t2 = -1;
        this.f26631u2 = -1L;
        this.f26634v2 = false;
        this.f26638w2 = true;
        this.f26642x2 = new Rect();
        this.f26646y2 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.D2 = new le.c(0, new gw(this, 3), srVar, 380L, true);
        this.J2 = new fw(this, 1);
        this.K2 = false;
        this.f26629u0 = z14;
        this.Y1 = o2Var;
        this.f26575c2 = z10;
        this.Z1 = e6Var;
        this.f26594i2 = z16;
        fh.c cVar = new fh.c();
        cVar.a(z(org.telegram.ui.ActionBar.i6.f19057d6));
        if (z15) {
            u(true);
        }
        i0.a.k(z(org.telegram.ui.ActionBar.i6.Wk), 30);
        int dp = AndroidUtilities.dp(50.0f);
        this.f26570b1 = dp;
        this.f26576d0 = z13;
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
        this.f26571b2 = U5;
        this.Y0 = new Drawable[]{U, U2, u5Var, new LayerDrawable(new Drawable[]{U4, U5})};
        this.Z0 = new Drawable[]{org.telegram.ui.ActionBar.i6.U(context, R.drawable.msg_emoji_recent, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.i6.Me), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.i6.Oe)), org.telegram.ui.ActionBar.i6.U(context, R.drawable.stickers_gifs_trending, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.i6.Me), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.i6.Oe))};
        this.f26567a1 = new String[]{LocaleController.getString(R.string.Emoji1), LocaleController.getString(R.string.Emoji2), LocaleController.getString(R.string.Emoji3), LocaleController.getString(R.string.Emoji4), LocaleController.getString(R.string.Emoji5), LocaleController.getString(R.string.Emoji6), LocaleController.getString(R.string.Emoji7), LocaleController.getString(R.string.Emoji8)};
        this.J1 = chatFull;
        Paint paint = new Paint(1);
        this.f26624s1 = paint;
        paint.setColor(z(org.telegram.ui.ActionBar.i6.f19009af));
        ai.k2 k2Var = yf.j0.f47162a;
        this.M1 = new ai.i6(AndroidUtilities.dp(6.0f));
        kx kxVar2 = new kx(this, context);
        this.J = kxVar2;
        ?? obj = new Object();
        obj.f25266a = 0;
        obj.f25267b = kxVar2;
        arrayList.add(obj);
        if (z10) {
            MediaDataController.getInstance(i11).checkStickers(5);
            MediaDataController.getInstance(i11).checkFeaturedEmoji();
            this.f26581e2 = new PorterDuffColorFilter(z(org.telegram.ui.ActionBar.i6.Oh), PorterDuff.Mode.SRC_IN);
        }
        xx xxVar = new xx(this, context);
        this.P = xxVar;
        lVar.b(xxVar);
        s4.j jVar = new s4.j();
        jVar.f43086c = 220L;
        jVar.e = 220L;
        jVar.f43087f = 160L;
        jVar.f43088g = 160L;
        jVar.f43089i = sr.f28360g;
        xxVar.setItemAnimator(jVar);
        xxVar.setOnTouchListener(new View.OnTouchListener(this) {
            public final mz f24922b;

            {
                this.f24922b = this;
            }

            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                switch (r3) {
                    case 0:
                        org.telegram.ui.qt q6 = org.telegram.ui.qt.q();
                        mz mzVar = this.f24922b;
                        xx xxVar2 = mzVar.P;
                        mzVar.getMeasuredHeight();
                        return q6.s(motionEvent, xxVar2, null, mzVar.f26588g2, e6Var);
                    case 1:
                        org.telegram.ui.qt q10 = org.telegram.ui.qt.q();
                        mz mzVar2 = this.f24922b;
                        return q10.s(motionEvent, mzVar2.f26589h0, mzVar2.m0, mzVar2.f26588g2, e6Var);
                    default:
                        org.telegram.ui.qt q11 = org.telegram.ui.qt.q();
                        mz mzVar3 = this.f24922b;
                        uw uwVar = mzVar3.D0;
                        mzVar3.getMeasuredHeight();
                        return q11.s(motionEvent, uwVar, mzVar3.A0, mzVar3.f26588g2, e6Var);
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
        int i15 = org.telegram.ui.ActionBar.i6.He;
        xxVar.setGlowColor(z(i15));
        xxVar.setItemSelectorColorProvider(new iw(0));
        xxVar.setClipToPadding(false);
        lxVar.O = new mx(this);
        ux uxVar = new ux(this);
        this.R = uxVar;
        xxVar.setAdapter(uxVar);
        xxVar.i(new ci.r1(this, 3));
        this.S = new my(this, context);
        kxVar2.addView(xxVar, w7.y5.c(-1.0f, -1));
        bl0 bl0Var = new bl0(xxVar, lxVar);
        this.f26569b0 = bl0Var;
        bl0Var.f23068i = new nx(this);
        xxVar.setOnScrollListener(new ox(this));
        if (o2Var != null) {
            kxVar = kxVar2;
            context2 = context;
            fwVar = new fw(this, 2);
        } else {
            kxVar = kxVar2;
            context2 = context;
            fwVar = null;
        }
        px pxVar = new px(this, context2, e6Var, z10, fwVar, z16);
        this.I = pxVar;
        if (z13) {
            mw mwVar = new mw(this, context2);
            this.V = mwVar;
            kxVar.addView(mwVar, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + dp));
            mwVar.d.setOnFocusChangeListener(new nw(this));
            nh.d dVar = new nh.d(context2, e6Var);
            this.U = dVar;
            dVar.setVisibility(8);
            dVar.setOnBackClickListener(new View.OnClickListener(this) {
                public final mz f25549b;

                {
                    this.f25549b = this;
                }

                @Override
                public final void onClick(View view) {
                    zy zyVar;
                    switch (r2) {
                        case 0:
                            my myVar = this.f25549b.S;
                            gy gyVar = myVar.f26555c;
                            int childCount = gyVar.getChildCount();
                            for (int i16 = 0; i16 < childCount; i16++) {
                                ((nh.c) gyVar.getChildAt(i16)).a(false, true);
                            }
                            myVar.d = 0L;
                            myVar.F.f26568b.a(false, true);
                            myVar.l();
                            return;
                        case 1:
                            hz hzVar = this.f25549b.f26647z0;
                            gz gzVar = hzVar.f24959c;
                            int childCount2 = gzVar.getChildCount();
                            for (int i17 = 0; i17 < childCount2; i17++) {
                                ((nh.c) gzVar.getChildAt(i17)).a(false, true);
                            }
                            hzVar.d = 0L;
                            hzVar.Q.f26565a.a(false, true);
                            hzVar.l();
                            return;
                        case 2:
                            ny nyVar = this.f25549b.f26627t1;
                            if (nyVar != null) {
                                nyVar.w();
                                return;
                            }
                            return;
                        default:
                            mz mzVar = this.f25549b;
                            int currentItem = mzVar.h.getCurrentItem();
                            if (currentItem == 0) {
                                zyVar = mzVar.V;
                            } else if (currentItem == 1) {
                                zyVar = mzVar.f26609o0;
                            } else {
                                zyVar = mzVar.G0;
                            }
                            if (zyVar != null) {
                                kq kqVar = zyVar.d;
                                kqVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                kqVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                kqVar.onTouchEvent(obtain2);
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
        int i16 = org.telegram.ui.ActionBar.i6.Ke;
        view.setBackgroundColor(z(i16));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(36.0f);
        kxVar.addView(view, layoutParams);
        nh.b bVar = new nh.b(context2, e6Var);
        this.L = bVar;
        ci.m6 m6Var = new ci.m6(context2, 3, e6Var);
        this.K = m6Var;
        m6Var.setVisibility(8);
        m6Var.addView(bVar, w7.y5.d(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
        kxVar.addView(m6Var, w7.y5.e(-1, -2, 80));
        if (z11) {
            vm0 vm0Var = vm0.f29179b;
            if (z12) {
                ow owVar = new ow(this, context2);
                this.f26586g0 = owVar;
                ?? obj2 = new Object();
                obj2.f25266a = 1;
                obj2.f25267b = owVar;
                this.d.add(obj2);
                pw pwVar = new pw(this, context2);
                this.f26589h0 = pwVar;
                lVar.b(pwVar);
                pwVar.setClipToPadding(false);
                sy syVar = new sy(this);
                this.f26592i0 = syVar;
                pwVar.setLayoutManager(syVar);
                pwVar.i(new qw(this));
                pwVar.setPadding(0, dp, 0, AndroidUtilities.dp(44.0f) + this.f26614p2);
                ((s4.f1) pwVar.getItemAnimator()).f43040m = false;
                ry ryVar = new ry(this, context2, true, Integer.MAX_VALUE);
                this.f26606n0 = ryVar;
                pwVar.setAdapter(ryVar);
                this.f26595j0 = new ry(this, context2, false, 0);
                pwVar.setOnScrollListener(new lz(this, 2));
                pwVar.setOnTouchListener(new View.OnTouchListener(this) {
                    public final mz f24922b;

                    {
                        this.f24922b = this;
                    }

                    @Override
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        switch (r3) {
                            case 0:
                                org.telegram.ui.qt q6 = org.telegram.ui.qt.q();
                                mz mzVar = this.f24922b;
                                xx xxVar2 = mzVar.P;
                                mzVar.getMeasuredHeight();
                                return q6.s(motionEvent, xxVar2, null, mzVar.f26588g2, e6Var);
                            case 1:
                                org.telegram.ui.qt q10 = org.telegram.ui.qt.q();
                                mz mzVar2 = this.f24922b;
                                return q10.s(motionEvent, mzVar2.f26589h0, mzVar2.m0, mzVar2.f26588g2, e6Var);
                            default:
                                org.telegram.ui.qt q11 = org.telegram.ui.qt.q();
                                mz mzVar3 = this.f24922b;
                                uw uwVar = mzVar3.D0;
                                mzVar3.getMeasuredHeight();
                                return q11.s(motionEvent, uwVar, mzVar3.A0, mzVar3.f26588g2, e6Var);
                        }
                    }
                });
                ?? r11 = new ml0(this) {
                    public final mz f25866b;

                    {
                        this.f25866b = this;
                    }

                    @Override
                    public final void d(int i17, View view2) {
                        int i18;
                        String str;
                        switch (r2) {
                            case 0:
                                mz mzVar = this.f25866b;
                                pw pwVar2 = mzVar.f26589h0;
                                ry ryVar2 = mzVar.f26595j0;
                                ry ryVar3 = mzVar.f26606n0;
                                if (mzVar.f26627t1 != null) {
                                    ryVar3.getClass();
                                    ArrayList arrayList2 = ryVar3.f28109x;
                                    if (pwVar2.getAdapter() == ryVar3) {
                                        if (i17 >= 0) {
                                            int i19 = ryVar3.H;
                                            if (i17 < i19) {
                                                mzVar.f26627t1.v(view2, mzVar.f26593i1.get(i17), null, "gif", true, 0, 0);
                                                return;
                                            }
                                            if (i19 > 0) {
                                                i18 = (i17 - i19) - 1;
                                            } else {
                                                i18 = i17;
                                            }
                                            if (i18 >= 0 && i18 < arrayList2.size()) {
                                                mzVar.f26627t1.v(view2, arrayList2.get(i18), null, ryVar3.f28105n, true, 0, 0);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    } else if (pwVar2.getAdapter() == ryVar2 && i17 >= 0 && i17 < ryVar2.f28109x.size()) {
                                        mzVar.f26627t1.v(view2, ryVar2.f28109x.get(i17), ryVar2.f28108w, ryVar2.f28105n, true, 0, 0);
                                        mzVar.W();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            default:
                                mz mzVar2 = this.f25866b;
                                s4.h0 adapter = mzVar2.D0.getAdapter();
                                hz hzVar = mzVar2.f26647z0;
                                if (adapter == hzVar) {
                                    str = hzVar.N;
                                } else {
                                    str = null;
                                }
                                String str2 = str;
                                if (view2 instanceof org.telegram.ui.Cells.f8) {
                                    org.telegram.ui.Cells.f8 f8Var = (org.telegram.ui.Cells.f8) view2;
                                    if (f8Var.getSticker() != null && MessageObject.isPremiumSticker(f8Var.getSticker()) && !AccountInstance.getInstance(mzVar2.f26574c1).getUserConfig().isPremium()) {
                                        org.telegram.ui.qt.q().y(f8Var);
                                        return;
                                    }
                                    org.telegram.ui.qt.q().u();
                                    if (!f8Var.f20310r) {
                                        f8Var.f20310r = true;
                                        f8Var.f20309n = 0.5f;
                                        f8Var.f20313x = 0L;
                                        org.telegram.ui.Cells.e8 e8Var = f8Var.f20305a;
                                        e8Var.setAlpha(0.5f * f8Var.H);
                                        e8Var.invalidate();
                                        f8Var.f20311s = System.currentTimeMillis();
                                        f8Var.invalidate();
                                        mzVar2.f26627t1.m(f8Var, f8Var.getSticker(), str2, f8Var.getParentObject(), f8Var.getSendAnimationData(), true, 0);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                };
                this.m0 = r11;
                pwVar.setOnItemClickListener((ml0) r11);
                owVar.addView(pwVar, w7.y5.c(-1.0f, -1));
                rw rwVar = new rw(this, context2);
                this.f26609o0 = rwVar;
                owVar.addView(rwVar, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + dp));
                sx sxVar = new sx(this, context2, e6Var);
                this.f26612p0 = sxVar;
                sxVar.setType(vm0Var);
                sxVar.setUnderlineHeight(AndroidUtilities.getShadowHeight());
                i10 = i14;
                sxVar.setIndicatorColor(z(i10));
                sxVar.setUnderlineColor(z(i16));
                sxVar.setBackgroundColor(z(i15));
                V();
                sxVar.setDelegate(new gw(this, 2));
                ryVar.F("", "", true, true, true);
            } else {
                i10 = i14;
            }
            sw swVar = new sw(this, context2, z14);
            this.f26640x0 = swVar;
            MediaDataController.getInstance(this.f26574c1).checkStickers(0);
            MediaDataController.getInstance(this.f26574c1).checkFeaturedStickers();
            uw uwVar = new uw(this, context2);
            this.D0 = uwVar;
            this.f26604m2.b(uwVar);
            vw vwVar = new vw(this);
            this.E0 = vwVar;
            uwVar.setLayoutManager(vwVar);
            vwVar.O = new ww(this);
            uwVar.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f));
            uwVar.setClipToPadding(false);
            ?? obj3 = new Object();
            obj3.f25266a = 2;
            obj3.f25267b = swVar;
            this.d.add(obj3);
            this.f26647z0 = new hz(this, context2);
            dz dzVar = new dz(this, context2);
            this.f26644y0 = dzVar;
            uwVar.setAdapter(dzVar);
            uwVar.setOnTouchListener(new View.OnTouchListener(this) {
                public final mz f24922b;

                {
                    this.f24922b = this;
                }

                @Override
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    switch (r3) {
                        case 0:
                            org.telegram.ui.qt q6 = org.telegram.ui.qt.q();
                            mz mzVar = this.f24922b;
                            xx xxVar2 = mzVar.P;
                            mzVar.getMeasuredHeight();
                            return q6.s(motionEvent, xxVar2, null, mzVar.f26588g2, e6Var);
                        case 1:
                            org.telegram.ui.qt q10 = org.telegram.ui.qt.q();
                            mz mzVar2 = this.f24922b;
                            return q10.s(motionEvent, mzVar2.f26589h0, mzVar2.m0, mzVar2.f26588g2, e6Var);
                        default:
                            org.telegram.ui.qt q11 = org.telegram.ui.qt.q();
                            mz mzVar3 = this.f24922b;
                            uw uwVar2 = mzVar3.D0;
                            mzVar3.getMeasuredHeight();
                            return q11.s(motionEvent, uwVar2, mzVar3.A0, mzVar3.f26588g2, e6Var);
                    }
                }
            });
            ?? r42 = new ml0(this) {
                public final mz f25866b;

                {
                    this.f25866b = this;
                }

                @Override
                public final void d(int i17, View view2) {
                    int i18;
                    String str;
                    switch (r2) {
                        case 0:
                            mz mzVar = this.f25866b;
                            pw pwVar2 = mzVar.f26589h0;
                            ry ryVar2 = mzVar.f26595j0;
                            ry ryVar3 = mzVar.f26606n0;
                            if (mzVar.f26627t1 != null) {
                                ryVar3.getClass();
                                ArrayList arrayList2 = ryVar3.f28109x;
                                if (pwVar2.getAdapter() == ryVar3) {
                                    if (i17 >= 0) {
                                        int i19 = ryVar3.H;
                                        if (i17 < i19) {
                                            mzVar.f26627t1.v(view2, mzVar.f26593i1.get(i17), null, "gif", true, 0, 0);
                                            return;
                                        }
                                        if (i19 > 0) {
                                            i18 = (i17 - i19) - 1;
                                        } else {
                                            i18 = i17;
                                        }
                                        if (i18 >= 0 && i18 < arrayList2.size()) {
                                            mzVar.f26627t1.v(view2, arrayList2.get(i18), null, ryVar3.f28105n, true, 0, 0);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                } else if (pwVar2.getAdapter() == ryVar2 && i17 >= 0 && i17 < ryVar2.f28109x.size()) {
                                    mzVar.f26627t1.v(view2, ryVar2.f28109x.get(i17), ryVar2.f28108w, ryVar2.f28105n, true, 0, 0);
                                    mzVar.W();
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        default:
                            mz mzVar2 = this.f25866b;
                            s4.h0 adapter = mzVar2.D0.getAdapter();
                            hz hzVar = mzVar2.f26647z0;
                            if (adapter == hzVar) {
                                str = hzVar.N;
                            } else {
                                str = null;
                            }
                            String str2 = str;
                            if (view2 instanceof org.telegram.ui.Cells.f8) {
                                org.telegram.ui.Cells.f8 f8Var = (org.telegram.ui.Cells.f8) view2;
                                if (f8Var.getSticker() != null && MessageObject.isPremiumSticker(f8Var.getSticker()) && !AccountInstance.getInstance(mzVar2.f26574c1).getUserConfig().isPremium()) {
                                    org.telegram.ui.qt.q().y(f8Var);
                                    return;
                                }
                                org.telegram.ui.qt.q().u();
                                if (!f8Var.f20310r) {
                                    f8Var.f20310r = true;
                                    f8Var.f20309n = 0.5f;
                                    f8Var.f20313x = 0L;
                                    org.telegram.ui.Cells.e8 e8Var = f8Var.f20305a;
                                    e8Var.setAlpha(0.5f * f8Var.H);
                                    e8Var.invalidate();
                                    f8Var.f20311s = System.currentTimeMillis();
                                    f8Var.invalidate();
                                    mzVar2.f26627t1.m(f8Var, f8Var.getSticker(), str2, f8Var.getParentObject(), f8Var.getSendAnimationData(), true, 0);
                                    return;
                                }
                                return;
                            }
                            return;
                    }
                }
            };
            this.A0 = r42;
            uwVar.setOnItemClickListener((ml0) r42);
            uwVar.setGlowColor(z(i15));
            swVar.addView(uwVar);
            this.f26566a0 = new bl0(uwVar, vwVar);
            xw xwVar = new xw(this, context2);
            this.G0 = xwVar;
            swVar.addView(xwVar, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + dp));
            nh.d dVar2 = new nh.d(context2, e6Var);
            this.H0 = dVar2;
            dVar2.setVisibility(8);
            dVar2.setOnBackClickListener(new View.OnClickListener(this) {
                public final mz f25549b;

                {
                    this.f25549b = this;
                }

                @Override
                public final void onClick(View view2) {
                    zy zyVar;
                    switch (r2) {
                        case 0:
                            my myVar = this.f25549b.S;
                            gy gyVar = myVar.f26555c;
                            int childCount = gyVar.getChildCount();
                            for (int i162 = 0; i162 < childCount; i162++) {
                                ((nh.c) gyVar.getChildAt(i162)).a(false, true);
                            }
                            myVar.d = 0L;
                            myVar.F.f26568b.a(false, true);
                            myVar.l();
                            return;
                        case 1:
                            hz hzVar = this.f25549b.f26647z0;
                            gz gzVar = hzVar.f24959c;
                            int childCount2 = gzVar.getChildCount();
                            for (int i17 = 0; i17 < childCount2; i17++) {
                                ((nh.c) gzVar.getChildAt(i17)).a(false, true);
                            }
                            hzVar.d = 0L;
                            hzVar.Q.f26565a.a(false, true);
                            hzVar.l();
                            return;
                        case 2:
                            ny nyVar = this.f25549b.f26627t1;
                            if (nyVar != null) {
                                nyVar.w();
                                return;
                            }
                            return;
                        default:
                            mz mzVar = this.f25549b;
                            int currentItem = mzVar.h.getCurrentItem();
                            if (currentItem == 0) {
                                zyVar = mzVar.V;
                            } else if (currentItem == 1) {
                                zyVar = mzVar.f26609o0;
                            } else {
                                zyVar = mzVar.G0;
                            }
                            if (zyVar != null) {
                                kq kqVar = zyVar.d;
                                kqVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                kqVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                kqVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                return;
                            }
                            return;
                    }
                }
            });
            swVar.addView(dVar2, new FrameLayout.LayoutParams(-1, dp));
            z18 = z14;
            yw ywVar = new yw(this, context2, e6Var, o2Var, z18);
            this.B0 = ywVar;
            ywVar.setDragEnabled(true);
            ywVar.setWillNotDraw(false);
            ywVar.setType(vm0Var);
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
            uwVar.setOnScrollListener(new lz(this, 0));
            nh.b bVar2 = new nh.b(context2, e6Var);
            this.N = bVar2;
            ci.m6 m6Var2 = new ci.m6(context2, 3, e6Var);
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
        li.l lVar2 = this.f26604m2;
        lVar2.getClass();
        axVar.b(new ai.n7(lVar2, 1));
        axVar.setOverScrollMode(2);
        fy fyVar = new fy(this);
        this.L0 = fyVar;
        axVar.setAdapter(fyVar);
        bx bxVar = new bx(this, context2);
        this.f26639x = bxVar;
        bxVar.setHapticFeedbackEnabled(true);
        bxVar.setImageResource(R.drawable.smiles_tab_clear);
        int v = z16 ? v(0.6f) : z(org.telegram.ui.ActionBar.i6.Re);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        bxVar.setColorFilter(new PorterDuffColorFilter(v, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        bxVar.setScaleType(scaleType);
        bxVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
        bxVar.setFocusable(true);
        bxVar.setOnClickListener(new Object());
        w7.a6.a(bxVar);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f26618r = frameLayout;
        if (z13) {
            addView(frameLayout, w7.y5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, (AndroidUtilities.getShadowHeight() / AndroidUtilities.density) + 40.0f));
        } else {
            addView(frameLayout, w7.y5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.f26622s = frameLayout2;
        addView(frameLayout2, w7.y5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 64.0f));
        FrameLayout frameLayout3 = new FrameLayout(context2);
        this.f26605n = frameLayout3;
        View view2 = new View(context2);
        this.v = view2;
        frameLayout3.addView(view2, new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(40.0f), 83));
        if (z13) {
            addView(frameLayout3, w7.y5.e(-1, 48, 80));
            frameLayout3.addView(bxVar, w7.y5.d(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
            if (z11) {
                ImageView imageView = new ImageView(context2);
                this.f26643y = imageView;
                imageView.setImageResource(R.drawable.smiles_tab_settings);
                imageView.setColorFilter(new PorterDuffColorFilter(z16 ? v(0.6f) : z(org.telegram.ui.ActionBar.i6.Re), mode));
                imageView.setScaleType(scaleType);
                imageView.setFocusable(true);
                imageView.setContentDescription(LocaleController.getString(R.string.Settings));
                w7.a6.a(imageView);
                frameLayout3.addView(imageView, w7.y5.d(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
                imageView.setOnClickListener(new View.OnClickListener(this) {
                    public final mz f25549b;

                    {
                        this.f25549b = this;
                    }

                    @Override
                    public final void onClick(View view22) {
                        zy zyVar;
                        switch (r2) {
                            case 0:
                                my myVar = this.f25549b.S;
                                gy gyVar = myVar.f26555c;
                                int childCount = gyVar.getChildCount();
                                for (int i162 = 0; i162 < childCount; i162++) {
                                    ((nh.c) gyVar.getChildAt(i162)).a(false, true);
                                }
                                myVar.d = 0L;
                                myVar.F.f26568b.a(false, true);
                                myVar.l();
                                return;
                            case 1:
                                hz hzVar = this.f25549b.f26647z0;
                                gz gzVar = hzVar.f24959c;
                                int childCount2 = gzVar.getChildCount();
                                for (int i17 = 0; i17 < childCount2; i17++) {
                                    ((nh.c) gzVar.getChildAt(i17)).a(false, true);
                                }
                                hzVar.d = 0L;
                                hzVar.Q.f26565a.a(false, true);
                                hzVar.l();
                                return;
                            case 2:
                                ny nyVar = this.f25549b.f26627t1;
                                if (nyVar != null) {
                                    nyVar.w();
                                    return;
                                }
                                return;
                            default:
                                mz mzVar = this.f25549b;
                                int currentItem = mzVar.h.getCurrentItem();
                                if (currentItem == 0) {
                                    zyVar = mzVar.V;
                                } else if (currentItem == 1) {
                                    zyVar = mzVar.f26609o0;
                                } else {
                                    zyVar = mzVar.G0;
                                }
                                if (zyVar != null) {
                                    kq kqVar = zyVar.d;
                                    kqVar.requestFocus();
                                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                    kqVar.onTouchEvent(obtain);
                                    obtain.recycle();
                                    MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                    kqVar.onTouchEvent(obtain2);
                                    obtain2.recycle();
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            od0 od0Var = new od0(context2, e6Var);
            this.f26635w = od0Var;
            od0Var.setViewPager(axVar);
            od0Var.setShouldExpand(false);
            od0Var.setIndicatorHeight(AndroidUtilities.dp(3.0f));
            od0Var.setIndicatorColor(i0.a.k(z(org.telegram.ui.ActionBar.i6.Oe), 20));
            od0Var.setUnderlineHeight(0);
            od0Var.setTabPaddingLeftRight(AndroidUtilities.dp(11.0f));
            od0Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f));
            frameLayout3.addView(od0Var, w7.y5.e(-2, 48, 81));
            od0Var.setOnPageChangeListener(new dx(this, z18));
            ImageView imageView2 = new ImageView(context2);
            this.E = imageView2;
            imageView2.setImageResource(R.drawable.smiles_tab_search);
            imageView2.setColorFilter(new PorterDuffColorFilter(z16 ? v(0.6f) : z(org.telegram.ui.ActionBar.i6.Re), mode));
            imageView2.setScaleType(scaleType);
            imageView2.setContentDescription(LocaleController.getString(R.string.Search));
            imageView2.setFocusable(true);
            imageView2.setVisibility(8);
            frameLayout3.addView(imageView2, w7.y5.d(48, 48.0f, 83, 2.0f, 0.0f, 2.0f, 0.0f));
            imageView2.setOnClickListener(new View.OnClickListener(this) {
                public final mz f25549b;

                {
                    this.f25549b = this;
                }

                @Override
                public final void onClick(View view22) {
                    zy zyVar;
                    switch (r2) {
                        case 0:
                            my myVar = this.f25549b.S;
                            gy gyVar = myVar.f26555c;
                            int childCount = gyVar.getChildCount();
                            for (int i162 = 0; i162 < childCount; i162++) {
                                ((nh.c) gyVar.getChildAt(i162)).a(false, true);
                            }
                            myVar.d = 0L;
                            myVar.F.f26568b.a(false, true);
                            myVar.l();
                            return;
                        case 1:
                            hz hzVar = this.f25549b.f26647z0;
                            gz gzVar = hzVar.f24959c;
                            int childCount2 = gzVar.getChildCount();
                            for (int i17 = 0; i17 < childCount2; i17++) {
                                ((nh.c) gzVar.getChildAt(i17)).a(false, true);
                            }
                            hzVar.d = 0L;
                            hzVar.Q.f26565a.a(false, true);
                            hzVar.l();
                            return;
                        case 2:
                            ny nyVar = this.f25549b.f26627t1;
                            if (nyVar != null) {
                                nyVar.w();
                                return;
                            }
                            return;
                        default:
                            mz mzVar = this.f25549b;
                            int currentItem = mzVar.h.getCurrentItem();
                            if (currentItem == 0) {
                                zyVar = mzVar.V;
                            } else if (currentItem == 1) {
                                zyVar = mzVar.f26609o0;
                            } else {
                                zyVar = mzVar.G0;
                            }
                            if (zyVar != null) {
                                kq kqVar = zyVar.d;
                                kqVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                kqVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                kqVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                return;
                            }
                            return;
                    }
                }
            });
        } else {
            addView(frameLayout3, w7.y5.d(56, 48.0f, (LocaleController.isRTL ? 3 : 5) | 80, 0.0f, 0.0f, 2.0f, 0.0f));
            org.telegram.ui.Cells.z h02 = org.telegram.ui.ActionBar.i6.h0(AndroidUtilities.dp(56.0f), z(i15), z(i15));
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
        p4Var.setBackground(org.telegram.ui.ActionBar.i6.b0(AndroidUtilities.dp(6.0f), z(org.telegram.ui.ActionBar.i6.f19305qf)));
        p4Var.setTextColor(z(org.telegram.ui.ActionBar.i6.f19286pf));
        p4Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f));
        p4Var.setGravity(16);
        p4Var.setTextSize(1, 14.0f);
        p4Var.setVisibility(4);
        addView(p4Var, w7.y5.d(-2, -2.0f, 81, 5.0f, 0.0f, 5.0f, 53.0f));
        this.C1 = AndroidUtilities.dp(AndroidUtilities.isTablet() ? 40.0f : 32.0f);
        Field field2 = zu.f30977f;
        zu zuVar = new zu(new yu(context2, e6Var));
        if (zu.f30977f == null) {
            try {
                field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
                try {
                    field.setAccessible(true);
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                field = null;
            }
            zu.f30977f = field;
        }
        Field field3 = zu.f30977f;
        if (field3 != null) {
            try {
                zuVar.f30979a = (ViewTreeObserver.OnScrollChangedListener) field3.get(zuVar);
                zu.f30977f.set(zuVar, zu.f30978g);
            } catch (Exception unused3) {
                zuVar.f30979a = null;
            }
        }
        this.B1 = zuVar;
        zuVar.f30981c.setOnSelectionUpdateListener(new d(this, 10));
        this.A1 = MessagesController.getGlobalEmojiSettings().getInt("selected_page", 0);
        Emoji.loadRecentEmoji();
        uxVar.F(false);
        I(true, z11, z12, false);
        if (Build.VERSION.SDK_INT >= 31) {
            ah.i iVar = new ah.i();
            this.f26597j2 = iVar;
            this.f26604m2.a(iVar);
            fh.d dVar3 = new fh.d(null);
            dVar3.f9062f = cVar;
            dVar3.d = iVar;
            dVar3.e = -2;
            ah.c cVar2 = new ah.c(dVar3);
            this.f26602l2 = cVar2;
            cVar2.f427i = LiteMode.isEnabled(262144);
            int dp2 = AndroidUtilities.dp(LiteMode.isEnabled(262144) ? 8.0f : 48.0f);
            cVar2.f423b = dp2;
            cVar2.f424c = dp2;
            cVar2.h = this.f26604m2;
        } else {
            ah.c cVar3 = new ah.c(cVar);
            this.f26602l2 = cVar3;
            cVar3.h = this.f26604m2;
            this.f26597j2 = null;
        }
        this.f26600k2 = new lh(this, 1);
        setBlurredBackgroundDrawableFactory(this.f26602l2);
        this.f26604m2.g(this);
        this.f26604m2.f14381a = new gw(this, 0);
    }

    public static void a(mz mzVar, boolean z10) {
        pw pwVar = mzVar.f26589h0;
        if (pwVar != null) {
            int childCount = pwVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = pwVar.getChildAt(i10);
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

    public static void c(mz mzVar, vy vyVar, String str) {
        String str2;
        String str3;
        boolean z10;
        String str4;
        ny nyVar;
        xc xcVar;
        org.telegram.ui.ActionBar.o2 o2Var = mzVar.Y1;
        int i10 = mzVar.f26574c1;
        ArrayList arrayList = mzVar.f26616q1;
        if (vyVar != null) {
            if (vyVar.getSpan() != null) {
                if (mzVar.f26627t1 != null) {
                    long j3 = vyVar.getSpan().documentId;
                    TLRPC.Document document = vyVar.getSpan().document;
                    yx yxVar = vyVar.e;
                    if (yxVar != null && yxVar.f30799i) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (document == null) {
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            yx yxVar2 = (yx) arrayList.get(i11);
                            int i12 = 0;
                            while (true) {
                                ArrayList arrayList2 = yxVar2.f30796c;
                                if (arrayList2 != null && i12 < arrayList2.size()) {
                                    if (((TLRPC.Document) yxVar2.f30796c.get(i12)).f18335id == j3) {
                                        document = (TLRPC.Document) yxVar2.f30796c.get(i12);
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
                    if (!MessageObject.isFreeEmoji(document) && !UserConfig.getInstance(i10).isPremium() && (((nyVar = mzVar.f26627t1) == null || !nyVar.g()) && !mzVar.U0 && !z10)) {
                        mzVar.M(false);
                        if (o2Var != null) {
                            xcVar = xc.a0(o2Var);
                        } else {
                            xcVar = new xc(mzVar.f26618r, mzVar.Z1);
                        }
                        if (!mzVar.f26591h2 && o2Var != null) {
                            xcVar.J(R.raw.saved_messages, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint2)), LocaleController.getString(R.string.Open), new fw(mzVar, 4)).j();
                        } else {
                            xcVar.q(document, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint)), LocaleController.getString(R.string.PremiumMore), new fw(mzVar, 3)).j();
                        }
                        mzVar.f26591h2 = !mzVar.f26591h2;
                        return;
                    }
                    mzVar.C2 = SystemClock.elapsedRealtime();
                    mzVar.M(true);
                    mzVar.h("animated_" + j3);
                    mzVar.f26627t1.x(j3, document, str5, vyVar.f29810c);
                    return;
                }
                return;
            }
            mzVar.C2 = SystemClock.elapsedRealtime();
            mzVar.M(true);
            if (str != null) {
                str2 = str;
            } else {
                str2 = (String) vyVar.getTag();
            }
            new SpannableStringBuilder().append((CharSequence) str2);
            if (str == null) {
                if (!vyVar.f29810c && (str3 = Emoji.emojiColor.get(str2)) != null) {
                    str2 = g(str2, str3);
                }
                mzVar.h(str2);
                ny nyVar2 = mzVar.f26627t1;
                if (nyVar2 != null) {
                    nyVar2.l(Emoji.fixEmoji(str2));
                    return;
                }
                return;
            }
            ny nyVar3 = mzVar.f26627t1;
            if (nyVar3 != null) {
                nyVar3.l(Emoji.fixEmoji(str));
            }
        }
    }

    public static void e(mz mzVar, int i10, int i11) {
        s4.c1 L;
        int[] iArr = mzVar.Q0;
        if (i10 == 1) {
            mzVar.n(i11, mzVar.P);
            return;
        }
        ny nyVar = mzVar.f26627t1;
        if ((nyVar == null || !nyVar.z()) && !mzVar.J0) {
            yl0 x10 = mzVar.x(i10);
            if (i11 > 0 && x10 != null && x10.getVisibility() == 0 && (L = x10.L(0)) != null && L.f43005a.getTop() + mzVar.f26570b1 >= x10.getPaddingTop()) {
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
                mzVar.Y();
            } else {
                mzVar.y(i10).setTranslationY(Math.max(-AndroidUtilities.dp(48.0f), iArr[i10]));
            }
        }
    }

    public static void f(mz mzVar, boolean z10) {
        int N0;
        sy syVar = mzVar.f26592i0;
        rw rwVar = mzVar.f26609o0;
        pw pwVar = mzVar.f26589h0;
        if (pwVar != null && (pwVar.getAdapter() instanceof ry)) {
            ry ryVar = (ry) pwVar.getAdapter();
            if (!ryVar.f28107s && ryVar.h == 0 && !ryVar.f28109x.isEmpty() && (N0 = syVar.N0()) != -1 && N0 > syVar.B() - 5) {
                String str = ryVar.f28108w;
                String str2 = ryVar.f28106r;
                boolean z11 = ryVar.v;
                ryVar.F(str, str2, true, z11, z11);
            }
        }
        ny nyVar = mzVar.f26627t1;
        if (nyVar != null && nyVar.z()) {
            boolean z12 = false;
            s4.c1 L = pwVar.L(0);
            if (L == null) {
                zy.a(rwVar, true, !z10);
                return;
            }
            if (L.f43005a.getTop() < pwVar.getPaddingTop()) {
                z12 = true;
            }
            zy.a(rwVar, z12, !z10);
        } else if (rwVar != null && pwVar != null) {
            rwVar.f30990a.a(true, !z10);
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
        String s10 = v7.k0.s(str, str2);
        if (str3 != null) {
            s10 = v7.k0.s(s10, str3);
        }
        if (z10) {
            return v7.k0.s(s10, "\u200d➡");
        }
        return s10;
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
        rw rwVar = this.f26609o0;
        if (rwVar != null) {
            rwVar.b();
        }
        mw mwVar = this.V;
        if (mwVar != null) {
            mwVar.b();
        }
    }

    public final void B(boolean z10, boolean z11) {
        yy yyVar;
        boolean z12;
        if (this.A1 != 0 && this.f26637w1) {
            this.A1 = 0;
        }
        if (this.A1 == 0 && this.f26633v1) {
            this.A1 = 1;
        }
        int i10 = this.A1;
        ax axVar = this.h;
        if (i10 != 0 && !z10 && this.e.size() != 1) {
            int i11 = this.A1;
            if (i11 == 1) {
                L(false, false);
                if (!this.f26629u0 && !this.f26632v0) {
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
                sx sxVar = this.f26612p0;
                if (sxVar != null) {
                    sxVar.m(0);
                }
                rw rwVar = this.f26609o0;
                if (rwVar != null && (yyVar = rwVar.f30995r) != null) {
                    yyVar.G1(null);
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
            float f11 = 1.0f - this.f26565a.e;
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
            this.f26640x0.invalidate();
        } else if (i10 == 1) {
            l(false);
            float f13 = 1.0f - this.f26568b.e;
            mw mwVar = this.V;
            mwVar.setAlpha(f13);
            if (f13 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            mwVar.setVisibility(i11);
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
        dz dzVar = this.f26644y0;
        if (dzVar != null) {
            dzVar.l();
        }
        hz hzVar = this.f26647z0;
        if (hzVar != null) {
            hzVar.l();
        }
        if (org.telegram.ui.qt.q().E) {
            org.telegram.ui.qt.q().n();
        }
        org.telegram.ui.qt.q().u();
    }

    public final void F(int i10) {
        ny nyVar = this.f26627t1;
        if ((nyVar != null && nyVar.z()) || i10 == 0) {
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
            bl0 bl0Var = this.f26569b0;
            bl0Var.f23064b = i12;
            bl0Var.d(i10, i11, false, false);
            return;
        }
        this.J0 = true;
        ci.m1 m1Var = new ci.m1(this, this.P.getContext(), 1);
        m1Var.f43155a = i10;
        m1Var.f13097p = i11;
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
            bl0 bl0Var = this.f26566a0;
            bl0Var.f23064b = i12;
            bl0Var.d(i10, i11, false, false);
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
            if (((iz) arrayList2.get(i10)).f25266a == 0 && z10) {
                arrayList.add((iz) arrayList2.get(i10));
            }
            if (((iz) arrayList2.get(i10)).f25266a == 1 && z12) {
                arrayList.add((iz) arrayList2.get(i10));
            }
            if (((iz) arrayList2.get(i10)).f25266a == 2 && z11) {
                arrayList.add((iz) arrayList2.get(i10));
            }
            i10++;
        }
        od0 od0Var = this.f26635w;
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
        hz hzVar;
        my myVar;
        if (stickerSet != null) {
            if (!z10 || (myVar = this.S) == null || myVar.d == stickerSet.f18356id) {
                if (!z10 && (hzVar = this.f26647z0) != null && hzVar.d != stickerSet.f18356id) {
                    return;
                }
                final boolean isStickerPackInstalled = MediaDataController.getInstance(this.f26574c1).isStickerPackInstalled(stickerSet.f18356id);
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
                bVar.f15493h0.a(!isStickerPackInstalled, z11);
                bVar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        int i10;
                        mz mzVar = mz.this;
                        MediaDataController mediaDataController = MediaDataController.getInstance(mzVar.f26574c1);
                        Context context = mzVar.getContext();
                        if (isStickerPackInstalled) {
                            i10 = 0;
                        } else {
                            i10 = 2;
                        }
                        org.telegram.ui.ActionBar.o2 o2Var = mzVar.Y1;
                        FrameLayout frameLayout = mzVar.f26622s;
                        nh.b bVar2 = bVar;
                        TLObject tLObject2 = tLObject;
                        TLRPC.StickerSet stickerSet2 = stickerSet;
                        TLRPC.Document document2 = document;
                        boolean z12 = z10;
                        mediaDataController.toggleStickerSet(context, tLObject2, document2, i10, o2Var, frameLayout, false, true, new i2.c1(mzVar, bVar2, tLObject2, stickerSet2, document2, z12, 9), false);
                        mzVar.J(bVar2, tLObject2, stickerSet2, document2, z12, true);
                    }
                });
            }
        }
    }

    public final void K(long j3, boolean z10, boolean z11) {
        int i10;
        View childAt;
        float f7;
        od0 od0Var = this.f26635w;
        if (od0Var != null) {
            this.f26633v1 = z10;
            this.f26637w1 = z11;
            if (!z11 && !z10) {
                this.f26630u1 = 0L;
            } else {
                this.f26630u1 = j3;
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
                if (this.f26630u1 != 0) {
                    f7 = 0.15f;
                } else {
                    f7 = 1.0f;
                }
                childAt.setAlpha(f7);
                ax axVar = this.h;
                if (z11) {
                    if (this.f26630u1 != 0 && axVar.getCurrentItem() != 0) {
                        L(true, true);
                        Q(false, true);
                        axVar.x(0, false);
                    }
                } else if (this.f26630u1 != 0 && axVar.getCurrentItem() != 1) {
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
        bx bxVar = this.f26639x;
        if (!z10 || bxVar.getTag() != null) {
            if ((!z10 && bxVar.getTag() != null) || this.f26608n2) {
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
                this.F.setInterpolator(sr.f28360g);
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
        ny nyVar = this.f26627t1;
        if (nyVar != null && nyVar.z()) {
            z10 = false;
        }
        FrameLayout frameLayout = this.f26605n;
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
            this.D2.a(z10, true);
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
                this.W.setInterpolator(sr.f28360g);
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
        TLRPC.Chat chat = MessagesController.getInstance(this.f26574c1).getChat(Long.valueOf(this.f26630u1));
        if (chat != null) {
            ai.p4 p4Var = this.N0;
            if (z10) {
                if (!ChatObject.hasAdminRights(chat) && (tL_chatBannedRights = chat.default_banned_rights) != null && (tL_chatBannedRights.send_stickers || (z11 && tL_chatBannedRights.send_plain))) {
                    org.telegram.ui.ActionBar.o2 o2Var = this.Y1;
                    if (!(o2Var instanceof org.telegram.ui.xn) || !((org.telegram.ui.xn) o2Var).K6()) {
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
            AnimatorSet animatorSet = this.H2;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.H2 = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.H2 = animatorSet2;
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
            org.telegram.messenger.video.k kVar = this.I2;
            if (kVar != null) {
                AndroidUtilities.cancelRunOnUIThread(kVar);
            }
            if (z10) {
                org.telegram.messenger.video.k kVar2 = new org.telegram.messenger.video.k(this, z11, z12, 3);
                this.I2 = kVar2;
                AndroidUtilities.runOnUIThread(kVar2, 3500L);
            }
            this.H2.setDuration(320L);
            this.H2.setInterpolator(sr.h);
            this.H2.start();
        }
    }

    public final void Q(boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        float f12;
        ImageView imageView = this.f26643y;
        if (imageView != null && !this.f26611o2) {
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
                        this.G.setInterpolator(sr.f28360g);
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
            float f11 = this.f26617q2;
            FrameLayout frameLayout = this.f26605n;
            if (f11 >= 0.0f) {
                f10 += getMeasuredHeight() - this.f26617q2;
            } else if (frameLayout.getTop() - f10 < 0.0f || !this.f26638w2) {
                f10 = 0.0f;
            }
            float lerp = (-f10) + AndroidUtilities.lerp(AndroidUtilities.dp(50.0f), -this.f26614p2, this.D2.e);
            frameLayout.setTranslationY(lerp);
            if (this.f26576d0) {
                this.f26618r.setTranslationY(lerp);
            }
        }
    }

    public final void S() {
        zy zyVar;
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
        boolean z28 = this.f26629u0;
        View view = this.v;
        if (!z28) {
            setBackground(null);
            view.setBackground(null);
        } else if (!AndroidUtilities.isInMultiwindow && !this.N1) {
            int i10 = org.telegram.ui.ActionBar.i6.He;
            setBackgroundColor(z(i10));
            if (this.f26576d0) {
                view.setBackgroundColor(z(i10));
            }
        } else {
            Drawable background = getBackground();
            if (background != null) {
                background.setColorFilter(new PorterDuffColorFilter(z(org.telegram.ui.ActionBar.i6.He), PorterDuff.Mode.MULTIPLY));
            }
        }
        px pxVar = this.I;
        if (pxVar != null) {
            if (this.f26629u0) {
                pxVar.setBackgroundColor(z(org.telegram.ui.ActionBar.i6.He));
                this.O.setBackgroundColor(z(org.telegram.ui.ActionBar.i6.Ke));
            } else {
                pxVar.setBackground(null);
            }
        }
        zu zuVar = this.B1;
        if (zuVar != null) {
            zuVar.f30981c.a();
        }
        int i11 = 0;
        while (true) {
            zyVar = this.V;
            z10 = this.f26594i2;
            if (i11 >= 3) {
                break;
            }
            if (i11 == 0) {
                zyVar = this.G0;
            } else if (i11 != 1) {
                zyVar = this.f26609o0;
            }
            if (zyVar != null) {
                kq kqVar = zyVar.d;
                FrameLayout frameLayout = zyVar.f30994n;
                View view2 = zyVar.f30993f;
                if (this.f26629u0) {
                    view2.setBackgroundColor(z(org.telegram.ui.ActionBar.i6.He));
                } else {
                    view2.setBackground(null);
                }
                zyVar.e.setBackgroundColor(z(org.telegram.ui.ActionBar.i6.Ke));
                mn0 mn0Var = zyVar.f30992c;
                if (z10) {
                    z24 = v(0.4f);
                } else {
                    z24 = z(org.telegram.ui.ActionBar.i6.Je);
                }
                mn0Var.a(z24);
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
                kqVar.setHintTextColor(z26);
                if (z10) {
                    z27 = v(0.8f);
                } else {
                    z27 = z(org.telegram.ui.ActionBar.i6.G6);
                }
                kqVar.setTextColor(z27);
            }
            i11++;
        }
        Paint paint = this.f26624s1;
        if (paint != null) {
            paint.setColor(z(org.telegram.ui.ActionBar.i6.f19009af));
        }
        xx xxVar = this.P;
        if (xxVar != null) {
            xxVar.setGlowColor(z(org.telegram.ui.ActionBar.i6.He));
        }
        uw uwVar = this.D0;
        if (uwVar != null) {
            uwVar.setGlowColor(z(org.telegram.ui.ActionBar.i6.He));
        }
        yw ywVar = this.B0;
        if (ywVar != null) {
            ywVar.setIndicatorColor(z(org.telegram.ui.ActionBar.i6.Qe));
            ywVar.setUnderlineColor(z(org.telegram.ui.ActionBar.i6.Ke));
            if (this.f26629u0) {
                ywVar.setBackgroundColor(z(org.telegram.ui.ActionBar.i6.He));
            } else {
                ywVar.setBackground(null);
            }
        }
        sx sxVar = this.f26612p0;
        if (sxVar != null) {
            sxVar.setIndicatorColor(z(org.telegram.ui.ActionBar.i6.Qe));
            sxVar.setUnderlineColor(z(org.telegram.ui.ActionBar.i6.Ke));
            if (this.f26629u0) {
                sxVar.setBackgroundColor(z(org.telegram.ui.ActionBar.i6.He));
            } else {
                sxVar.setBackground(null);
            }
        }
        bx bxVar = this.f26639x;
        if (bxVar != null) {
            if (z10) {
                z23 = v(0.6f);
            } else {
                z23 = z(org.telegram.ui.ActionBar.i6.Re);
            }
            bxVar.setColorFilter(new PorterDuffColorFilter(z23, PorterDuff.Mode.MULTIPLY));
            if (zyVar == null) {
                Drawable background3 = bxVar.getBackground();
                int i12 = org.telegram.ui.ActionBar.i6.He;
                org.telegram.ui.ActionBar.i6.B1(background3, z(i12), false);
                org.telegram.ui.ActionBar.i6.B1(bxVar.getBackground(), z(i12), true);
            }
        }
        ImageView imageView = this.f26643y;
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
            ((ShapeDrawable) p4Var.getBackground()).getPaint().setColor(z(org.telegram.ui.ActionBar.i6.f19305qf));
            p4Var.setTextColor(z(org.telegram.ui.ActionBar.i6.f19286pf));
        }
        ry ryVar = this.f26595j0;
        if (ryVar != null) {
            ty tyVar = ryVar.e;
            ImageView imageView3 = tyVar.f28702a;
            int i13 = org.telegram.ui.ActionBar.i6.Le;
            imageView3.setColorFilter(new PorterDuffColorFilter(z(i13), PorterDuff.Mode.MULTIPLY));
            tyVar.f28703b.setTextColor(z(i13));
            tyVar.f28704c.setProgressColor(z(org.telegram.ui.ActionBar.i6.f19129h6));
        }
        this.f26581e2 = new PorterDuffColorFilter(z(org.telegram.ui.ActionBar.i6.Oh), PorterDuff.Mode.SRC_IN);
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
        if (pxVar != null && (awVar = pxVar.f24145y) != null) {
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
        org.telegram.ui.ActionBar.u5 u5Var2 = this.f26571b2;
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
        if (!this.f26583f0) {
            int i12 = -1;
            if (i10 != -1) {
                int size = getRecentEmoji().size() + (this.f26576d0 ? 1 : 0);
                ux uxVar = this.R;
                int i13 = uxVar.f28952c;
                ArrayList arrayList = uxVar.f28958x;
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
                                yx yxVar = (yx) this.f26616q1.get(size2);
                                while (i14 < emojipacks.size()) {
                                    long j3 = emojipacks.get(i14).f30795b.f18356id;
                                    long j10 = yxVar.f30795b.f18356id;
                                    if (j3 == j10 && (!yxVar.f30798g || (!yxVar.f30797f && !this.f26613p1.contains(Long.valueOf(j10))))) {
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
        yy yyVar;
        int i11;
        boolean z12;
        boolean z13;
        sx sxVar = this.f26612p0;
        int currentPosition = sxVar.getCurrentPosition();
        int i12 = this.f26619r0;
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
        boolean isEmpty = this.f26593i1.isEmpty();
        sxVar.d(false);
        this.f26619r0 = -2;
        this.f26623s0 = -2;
        this.f26626t0 = -2;
        Drawable[] drawableArr = this.Z0;
        if (!isEmpty) {
            this.f26619r0 = 0;
            sxVar.b(0, drawableArr[0]).setContentDescription(LocaleController.getString(R.string.RecentStickers));
            i10 = 1;
        } else {
            i10 = 0;
        }
        this.f26623s0 = i10;
        sxVar.b(1, drawableArr[1]).setContentDescription(LocaleController.getString(R.string.FeaturedGifs));
        this.f26626t0 = i10 + 1;
        AndroidUtilities.dp(13.0f);
        AndroidUtilities.dp(11.0f);
        int i13 = this.f26574c1;
        ArrayList<String> arrayList = MessagesController.getInstance(i13).gifSearchEmojies;
        int size = arrayList.size();
        int i14 = 0;
        while (i14 < size) {
            String str = arrayList.get(i14);
            Emoji.EmojiDrawable emojiDrawable = Emoji.getEmojiDrawable(str);
            if (emojiDrawable != null) {
                TLRPC.Document emojiAnimatedSticker = MediaDataController.getInstance(i13).getEmojiAnimatedSticker(str);
                String h = hg.k0.h(i14 + 3, "tab");
                int i15 = sxVar.f30073x;
                sxVar.f30073x = i15 + 1;
                px0 px0Var = (px0) sxVar.f30063n.get(h);
                if (px0Var != null) {
                    sxVar.g(h, px0Var, i15);
                    i11 = currentPosition;
                    z12 = z11;
                } else {
                    i11 = currentPosition;
                    z12 = z11;
                    px0Var = new px0(sxVar.getContext(), 2);
                    px0Var.setFocusable(true);
                    px0Var.setOnClickListener(new pm0(sxVar, 2));
                    px0Var.setExpanded(sxVar.f30056f0);
                    px0Var.a(sxVar.f30059i0);
                    sxVar.e.addView(px0Var, i15);
                }
                px0Var.d = false;
                px0Var.setTag(R.id.index_tag, Integer.valueOf(i15));
                px0Var.setTag(R.id.parent_tag, emojiDrawable);
                px0Var.setTag(R.id.object_tag, emojiAnimatedSticker);
                if (i15 == sxVar.f30074y) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                px0Var.setSelected(z13);
                sxVar.h.put(h, px0Var);
                px0Var.setContentDescription(str);
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
            sxVar.m(this.f26623s0);
            rw rwVar = this.f26609o0;
            if (rwVar != null && (yyVar = rwVar.f30995r) != null) {
                yyVar.G1(null);
                return;
            }
            return;
        }
        WeakHashMap weakHashMap = r0.i0.f42173a;
        if (sxVar.isLaidOut()) {
            if (!isEmpty && !z14) {
                sxVar.k(i16 + 1, 0);
            } else if (isEmpty && z14) {
                sxVar.k(i16 - 1, 0);
            }
        }
    }

    public final void W() {
        ry ryVar;
        int size = this.f26593i1.size();
        long calcDocumentsHash = MediaDataController.calcDocumentsHash(this.f26593i1, Integer.MAX_VALUE);
        ArrayList<TLRPC.Document> recentGifs = MediaDataController.getInstance(this.f26574c1).getRecentGifs();
        this.f26593i1 = recentGifs;
        long calcDocumentsHash2 = MediaDataController.calcDocumentsHash(recentGifs, Integer.MAX_VALUE);
        if ((this.f26612p0 != null && size == 0 && !this.f26593i1.isEmpty()) || (size != 0 && this.f26593i1.isEmpty())) {
            V();
        }
        if ((size != this.f26593i1.size() || calcDocumentsHash != calcDocumentsHash2) && (ryVar = this.f26606n0) != null) {
            ryVar.l();
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
            if (ywVar.f30070s != null) {
                return;
            }
            this.F1 = -2;
            this.G1 = -2;
            this.H1 = -2;
            this.I1 = -2;
            this.f26579e0 = false;
            this.E1 = 0;
            int currentPosition = ywVar.getCurrentPosition();
            boolean z16 = true;
            if (getParent() != null && getVisibility() == 0 && (this.f26645y1.size() != 0 || this.f26648z1.size() != 0)) {
                z11 = true;
            } else {
                z11 = false;
            }
            ywVar.d(z11);
            int i11 = this.f26574c1;
            MediaDataController mediaDataController = MediaDataController.getInstance(i11);
            SharedPreferences emojiSettings = MessagesController.getEmojiSettings(i11);
            ArrayList arrayList3 = this.f26603m1;
            arrayList3.clear();
            ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = mediaDataController.getFeaturedStickerSets();
            int size = featuredStickerSets.size();
            for (int i12 = 0; i12 < size; i12++) {
                TLRPC.StickerSetCovered stickerSetCovered = featuredStickerSets.get(i12);
                if (!mediaDataController.isStickerPackInstalled(stickerSetCovered.set.f18356id)) {
                    arrayList3.add(stickerSetCovered);
                }
            }
            kz kzVar = this.F0;
            if (kzVar != null) {
                kzVar.l();
            }
            boolean isEmpty = featuredStickerSets.isEmpty();
            long j3 = 0;
            Drawable[] drawableArr = this.Y0;
            if (!isEmpty && (arrayList3.isEmpty() || emojiSettings.getLong("featured_hidden", 0L) == featuredStickerSets.get(0).set.f18356id)) {
                if (mediaDataController.getUnreadStickerSets().isEmpty()) {
                    i10 = 2;
                } else {
                    i10 = 3;
                }
                px0 c10 = ywVar.c(i10, drawableArr[i10]);
                c10.h.setText(LocaleController.getString(R.string.FeaturedStickersShort));
                c10.setContentDescription(LocaleController.getString(R.string.FeaturedStickers));
                int i13 = this.E1;
                this.H1 = i13;
                this.E1 = i13 + 1;
            }
            if (!this.f26599k1.isEmpty()) {
                int i14 = this.E1;
                this.G1 = i14;
                this.E1 = i14 + 1;
                px0 c11 = ywVar.c(1, drawableArr[1]);
                c11.h.setText(LocaleController.getString(R.string.FavoriteStickersShort));
                c11.setContentDescription(LocaleController.getString(R.string.FavoriteStickers));
            }
            if (!this.f26596j1.isEmpty()) {
                int i15 = this.E1;
                this.F1 = i15;
                this.E1 = i15 + 1;
                px0 c12 = ywVar.c(0, drawableArr[0]);
                c12.h.setText(LocaleController.getString(R.string.RecentStickersShort));
                c12.setContentDescription(LocaleController.getString(R.string.RecentStickers));
            }
            ArrayList arrayList4 = this.f26577d1;
            arrayList4.clear();
            org.telegram.ui.ActionBar.e6 e6Var = null;
            this.f26590h1 = null;
            this.f26584f1 = -1;
            this.f26580e1 = -10;
            if (this.E2 == null || z10) {
                this.E2 = new ArrayList(mediaDataController.getStickerSets(0));
            }
            ArrayList<TLRPC.TL_messages_stickerSet> arrayList5 = this.E2;
            int i16 = 0;
            while (true) {
                TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.f26641x1;
                if (i16 >= stickerSetCoveredArr.length) {
                    break;
                }
                TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCoveredArr[i16];
                long j10 = j3;
                if (stickerSetCovered2 != null) {
                    TLRPC.TL_messages_stickerSet stickerSetById = mediaDataController.getStickerSetById(stickerSetCovered2.set.f18356id);
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
                long j12 = MessagesController.getEmojiSettings(i11).getLong("group_hide_stickers_" + this.J1.f18330id, -1L);
                TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(this.J1.f18330id));
                if (chat != null && this.J1.stickerset != null && ChatObject.hasAdminRights(chat)) {
                    TLRPC.StickerSet stickerSet3 = this.J1.stickerset;
                    if (stickerSet3 != null) {
                        if (j12 == stickerSet3.f18356id) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        this.f26587g1 = z15;
                    }
                } else {
                    if (j12 != -1) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    this.f26587g1 = z14;
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
                        if (this.f26587g1) {
                            this.f26580e1 = arrayList4.size();
                            arrayList4.add(tL_messages_stickerSet3);
                        } else {
                            this.f26580e1 = 0;
                            arrayList4.add(0, tL_messages_stickerSet3);
                        }
                        if (!this.J1.can_set_stickers) {
                            tL_messages_stickerSet3 = null;
                        }
                        this.f26590h1 = tL_messages_stickerSet3;
                    }
                } else if (chatFull.can_set_stickers) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = new TLRPC.TL_messages_stickerSet();
                    if (this.f26587g1) {
                        this.f26580e1 = arrayList4.size();
                        arrayList4.add(tL_messages_stickerSet4);
                    } else {
                        this.f26580e1 = 0;
                        arrayList4.add(0, tL_messages_stickerSet4);
                    }
                }
            }
            int i18 = 0;
            while (i18 < arrayList4.size()) {
                if (i18 == this.f26580e1) {
                    TLRPC.Chat chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(this.J1.f18330id));
                    if (chat2 == null) {
                        arrayList4.remove(0);
                        i18--;
                    } else {
                        this.f26579e0 = z16;
                        String str = "chat" + chat2.f18329id;
                        int i19 = ywVar.f30073x;
                        ywVar.f30073x = i19 + 1;
                        px0 px0Var = (px0) ywVar.f30063n.get(str);
                        if (px0Var != null) {
                            ywVar.g(str, px0Var, i19);
                        } else {
                            px0Var = new px0(ywVar.getContext(), 0);
                            px0Var.setFocusable(z16);
                            px0Var.setOnClickListener(new pm0(ywVar, 0));
                            ub1Var.addView(px0Var, i19);
                            px0Var.f27487w = z16;
                            h9 h9Var = new h9(e6Var);
                            h9Var.u(AndroidUtilities.dp(14.0f));
                            h9Var.k(UserConfig.selectedAccount, chat2);
                            int i20 = ywVar.f30047a;
                            w9 w9Var = px0Var.e;
                            w9Var.setLayerNum(i20);
                            w9Var.e(chat2, h9Var);
                            w9Var.setAspectFit(z16);
                            px0Var.setExpanded(ywVar.f30056f0);
                            px0Var.a(ywVar.f30059i0);
                            px0Var.h.setText(chat2.title);
                        }
                        px0Var.d = z16;
                        px0Var.setTag(R.id.index_tag, Integer.valueOf(i19));
                        if (i19 == ywVar.f30074y) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        px0Var.setSelected(z13);
                        ywVar.h.put(str, px0Var);
                    }
                } else {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet5 = (TLRPC.TL_messages_stickerSet) arrayList4.get(i18);
                    TLRPC.StickerSet stickerSet5 = tL_messages_stickerSet5.set;
                    if (stickerSet5 != null && stickerSet5.thumb_document_id != j11) {
                        for (int i21 = 0; i21 < tL_messages_stickerSet5.documents.size(); i21++) {
                            document = tL_messages_stickerSet5.documents.get(i21);
                            if (document != null && tL_messages_stickerSet5.set.thumb_document_id == document.f18335id) {
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
                    String str2 = "set" + tL_messages_stickerSet5.set.f18356id;
                    int i22 = ywVar.f30073x;
                    ywVar.f30073x = i22 + 1;
                    px0 px0Var2 = (px0) ywVar.f30063n.get(str2);
                    if (px0Var2 != null) {
                        ywVar.g(str2, px0Var2, i22);
                    } else {
                        px0Var2 = new px0(ywVar.getContext(), 0);
                        px0Var2.setFocusable(z16);
                        px0Var2.setOnClickListener(new pm0(ywVar, 1));
                        px0Var2.setExpanded(ywVar.f30056f0);
                        px0Var2.a(ywVar.f30059i0);
                        ub1Var.addView(px0Var2, i22);
                    }
                    px0Var2.e.setLayerNum(ywVar.f30047a);
                    px0Var2.d = false;
                    px0Var2.setTag(closestPhotoSizeWithSize);
                    px0Var2.setTag(R.id.index_tag, Integer.valueOf(i22));
                    px0Var2.setTag(R.id.parent_tag, tL_messages_stickerSet5);
                    px0Var2.setTag(R.id.object_tag, document);
                    if (i22 == ywVar.f30074y) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    px0Var2.setSelected(z12);
                    ywVar.h.put(str2, px0Var2);
                    px0Var2.setContentDescription(tL_messages_stickerSet5.set.title + ", " + LocaleController.getString(R.string.AccDescrStickerSet));
                }
                i18++;
                z16 = true;
                e6Var = null;
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
        if (ywVar != null && zwVar == null && this.f26627t1 != null) {
            ywVar.setTranslationY(this.f26627t1.p() * (-AndroidUtilities.dp(50.0f)));
        }
        if (zwVar == null) {
            return;
        }
        if (getVisibility() == 0 && this.K0 && this.f26627t1.p() != 1.0f) {
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
            Rect rect = this.f26642x2;
            rect.setEmpty();
            this.h.getChildVisibleRect(this.f26640x0, rect, null);
            float p5 = this.f26627t1.p() * AndroidUtilities.dp(50.0f);
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
        LongSparseArray longSparseArray = this.f26648z1;
        LongSparseArray longSparseArray2 = this.f26645y1;
        int i10 = this.f26574c1;
        uw uwVar = this.D0;
        if (uwVar != null) {
            try {
                int childCount = uwVar.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = uwVar.getChildAt(i11);
                    if ((childAt instanceof org.telegram.ui.Cells.s3) && ((il0) uwVar.U(childAt)) != null) {
                        org.telegram.ui.Cells.s3 s3Var2 = (org.telegram.ui.Cells.s3) childAt;
                        ArrayList<Long> unreadStickerSets = MediaDataController.getInstance(i10).getUnreadStickerSets();
                        TLRPC.StickerSetCovered stickerSet = s3Var2.getStickerSet();
                        if (unreadStickerSets != null && unreadStickerSets.contains(Long.valueOf(stickerSet.set.f18356id))) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        int i12 = 0;
                        while (true) {
                            TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.f26641x1;
                            if (i12 < stickerSetCoveredArr.length) {
                                TLRPC.StickerSetCovered stickerSetCovered = stickerSetCoveredArr[i12];
                                if (stickerSetCovered != null) {
                                    s3Var = s3Var2;
                                    if (stickerSetCovered.set.f18356id == stickerSet.set.f18356id) {
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
                            MediaDataController.getInstance(i10).markFeaturedStickersByIdAsRead(false, stickerSet.set.f18356id);
                        }
                        if (longSparseArray2.indexOfKey(stickerSet.set.f18356id) >= 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (longSparseArray.indexOfKey(stickerSet.set.f18356id) >= 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z12 || z13) {
                            if (z12 && s3Var2.f21059r) {
                                longSparseArray2.remove(stickerSet.set.f18356id);
                                z12 = false;
                            } else if (z13 && !s3Var2.f21059r) {
                                longSparseArray.remove(stickerSet.set.f18356id);
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
        this.f26617q2 = f7;
        R();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        Utilities.Callback callback;
        TLRPC.StickerSet stickerSet;
        int i12 = NotificationCenter.stickersDidLoad;
        ux uxVar = this.R;
        fw fwVar = this.J2;
        if (i10 == i12) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (this.f26644y0 != null) {
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
            if (chatFull != null && chatFull.f18330id == longValue && booleanValue) {
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
            od0 od0Var = this.f26635w;
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
            my myVar = this.S;
            if (i10 == i14) {
                Long l4 = (Long) objArr[0];
                long longValue2 = l4.longValue();
                if (objArr.length > 1) {
                    tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) objArr[1];
                } else {
                    tL_messages_stickerSet = null;
                }
                if (tL_messages_stickerSet != null) {
                    hz hzVar = this.f26647z0;
                    if (hzVar != null && hzVar.d == longValue2 && hzVar.f24960f.size() < tL_messages_stickerSet.documents.size()) {
                        hzVar.f24960f = tL_messages_stickerSet.documents;
                        hzVar.l();
                    }
                    if (myVar != null && myVar.d == longValue2 && myVar.f26556f.size() < tL_messages_stickerSet.documents.size()) {
                        myVar.f26556f = tL_messages_stickerSet.documents;
                        myVar.l();
                    }
                }
                TLRPC.ChatFull chatFull2 = this.J1;
                if (chatFull2 != null && (stickerSet = chatFull2.stickerset) != null && stickerSet.f18356id == longValue2) {
                    X(false);
                }
                HashMap hashMap = this.f26620r1;
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
                        if (childAt2 instanceof vy) {
                            childAt2.invalidate();
                        }
                    }
                }
                zu zuVar = this.B1;
                if (zuVar != null) {
                    zuVar.f30981c.invalidate();
                }
                sx sxVar = this.f26612p0;
                if (sxVar != null) {
                    ub1 ub1Var = sxVar.e;
                    int childCount4 = ub1Var.getChildCount();
                    for (int i18 = 0; i18 < childCount4; i18++) {
                        ub1Var.getChildAt(i18).invalidate();
                    }
                }
            } else if (i10 == NotificationCenter.newEmojiSuggestionsAvailable) {
                if (xxVar != null && this.f26576d0) {
                    if ((this.V.f30992c.f26482k == 2 || xxVar.getAdapter() == myVar) && !TextUtils.isEmpty(myVar.v)) {
                        myVar.F(myVar.v, true);
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
            if (this.f26605n.getVisibility() != 8 && !this.f26629u0 && this.f26636w0) {
                canvas.drawColor(i0.a.k(-1, 25));
            }
            boolean drawChild = super.drawChild(canvas, view, j3);
            float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(this.f26614p2);
            if (navigationBarThirdButtonsFactor > 0.0f) {
                int l1 = org.telegram.ui.ActionBar.i6.l1(navigationBarThirdButtonsFactor, z(org.telegram.ui.ActionBar.i6.He));
                int i10 = this.f26649z2;
                GradientDrawable gradientDrawable = this.f26646y2;
                if (i10 != l1) {
                    gradientDrawable.setColors(new int[]{l1, org.telegram.ui.ActionBar.i6.l1(0.66f, l1), i0.a.k(l1, 0)});
                    this.f26649z2 = l1;
                }
                gradientDrawable.setBounds(0, getMeasuredHeight() - this.f26614p2, getMeasuredWidth(), getMeasuredHeight());
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
            ArrayList arrayList2 = this.f26616q1;
            if (i10 < arrayList2.size()) {
                yx yxVar = (yx) arrayList2.get(i10);
                boolean z10 = yxVar.f30798g;
                ArrayList arrayList3 = this.f26613p1;
                if ((!z10 && (yxVar.f30797f || arrayList3.contains(Long.valueOf(yxVar.f30795b.f18356id)))) || (yxVar.f30798g && !yxVar.f30797f && !arrayList3.contains(Long.valueOf(yxVar.f30795b.f18356id)))) {
                    arrayList.add(yxVar);
                }
                i10++;
            } else {
                return arrayList;
            }
        }
    }

    public ArrayList<String> getRecentEmoji() {
        if (this.f26575c2) {
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
                if (!this.f26575c2) {
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

    public final void i(int i10, int i11, boolean z10) {
        if (i10 == 2 || x(i10).L(0) == null) {
            return;
        }
        ix ixVar = new ix(getContext(), i11);
        ixVar.f43155a = !z10 ? 1 : 0;
        w(i10).w0(ixVar);
    }

    public final void k(boolean z10) {
        if (z10) {
            W();
            return;
        }
        int size = this.f26596j1.size();
        int size2 = this.f26599k1.size();
        int i10 = this.f26574c1;
        this.f26596j1 = MediaDataController.getInstance(i10).getRecentStickers(0, true);
        this.f26599k1 = MediaDataController.getInstance(i10).getRecentStickers(2);
        if (UserConfig.getInstance(i10).isPremium()) {
            this.l1 = MediaDataController.getInstance(i10).getRecentStickers(7);
        } else {
            this.l1 = new ArrayList();
        }
        for (int i11 = 0; i11 < this.f26599k1.size(); i11++) {
            TLRPC.Document document = (TLRPC.Document) this.f26599k1.get(i11);
            int i12 = 0;
            while (true) {
                if (i12 < this.f26596j1.size()) {
                    TLRPC.Document document2 = (TLRPC.Document) this.f26596j1.get(i12);
                    if (document2.dc_id == document.dc_id && document2.f18335id == document.f18335id) {
                        this.f26596j1.remove(i12);
                        break;
                    }
                    i12++;
                }
            }
        }
        if (MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            int i13 = 0;
            while (i13 < this.f26599k1.size()) {
                if (MessageObject.isPremiumSticker((TLRPC.Document) this.f26599k1.get(i13))) {
                    this.f26599k1.remove(i13);
                    i13--;
                }
                i13++;
            }
            int i14 = 0;
            while (i14 < this.f26596j1.size()) {
                if (MessageObject.isPremiumSticker((TLRPC.Document) this.f26596j1.get(i14))) {
                    this.f26596j1.remove(i14);
                    i14--;
                }
                i14++;
            }
        }
        if (size != this.f26596j1.size() || size2 != this.f26599k1.size()) {
            X(false);
        }
        dz dzVar = this.f26644y0;
        if (dzVar != null) {
            dzVar.l();
        }
        o();
    }

    public final void l(boolean z10) {
        int i10;
        boolean z11;
        ny nyVar = this.f26627t1;
        le.c cVar = this.f26568b;
        xx xxVar = this.P;
        mw mwVar = this.V;
        if (nyVar != null && nyVar.z()) {
            s4.c1 L = xxVar.L(0);
            if (L == null) {
                zy.a(mwVar, true, !z10);
            } else {
                if (L.f43005a.getTop() < xxVar.getPaddingTop()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                zy.a(mwVar, z11, !z10);
            }
            N(false, !z10);
            mwVar.setTranslationY(cVar.e * AndroidUtilities.dp(15.0f));
        } else if (mwVar != null && xxVar != null) {
            s4.c1 L2 = xxVar.L(0);
            if (L2 != null) {
                i10 = L2.f43005a.getTop();
            } else {
                i10 = -this.f26570b1;
            }
            mwVar.setTranslationY((cVar.e * AndroidUtilities.dp(15.0f)) + i10);
            mwVar.f30990a.a(false, !z10);
            m(Math.round(this.I.getTranslationY()));
        }
    }

    public final void m(int i10) {
        ObjectAnimator objectAnimator = this.R0[1];
        if (objectAnimator != null && objectAnimator.isRunning()) {
            return;
        }
        boolean z10 = false;
        s4.c1 L = this.P.L(0);
        int dp = AndroidUtilities.dp(38.0f) + i10;
        if (dp > 0 && (L == null || L.f43005a.getBottom() < dp)) {
            z10 = true;
        }
        N(z10, !this.K1);
    }

    public final void n(int i10, View view) {
        xx xxVar;
        s4.c1 L;
        int i11;
        px pxVar = this.I;
        int[] iArr = this.Q0;
        if (view == null) {
            iArr[1] = 0;
            pxVar.setTranslationY(0);
        } else if (view.getVisibility() == 0 && !this.f26583f0) {
            ny nyVar = this.f26627t1;
            if (nyVar == null || !nyVar.z()) {
                if (i10 > 0 && (xxVar = this.P) != null && xxVar.getVisibility() == 0 && (L = xxVar.L(0)) != null) {
                    int top = L.f43005a.getTop();
                    if (this.f26576d0) {
                        i11 = this.f26570b1;
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
            ywVar.k(this.f26644y0.F(L0), i10);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.ObserversGroup observersGroup = this.G2;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.G2 = null;
        }
        NotificationCenter.ObserversGroup add = NotificationCenter.getInstance(this.f26574c1).createWeakObserversGroup(this).addGlobal(NotificationCenter.emojiLoaded).add(NotificationCenter.newEmojiSuggestionsAvailable).add(NotificationCenter.groupPackUpdated);
        this.G2 = add;
        if (this.f26644y0 != null) {
            add.add(NotificationCenter.stickersDidLoad).add(NotificationCenter.recentDocumentsDidLoad).add(NotificationCenter.featuredStickersDidLoad).add(NotificationCenter.groupStickersDidLoad).add(NotificationCenter.currentUserPremiumStatusChanged);
            AndroidUtilities.runOnUIThread(new fw(this, 0));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zu zuVar = this.B1;
        if (zuVar != null && zuVar.isShowing()) {
            zuVar.dismiss();
        }
        org.telegram.ui.qt q6 = org.telegram.ui.qt.q();
        if (q6.f36896l == this.f26588g2) {
            q6.W = null;
            q6.f36884a0 = null;
            q6.Y = null;
            q6.f36896l = null;
            q6.f36888c0 = null;
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
        boolean z11 = this.f26576d0;
        if (!z10 && !this.N1) {
            if (this.L1 != 0) {
                if (!this.F2) {
                    setOutlineProvider(null);
                    setClipToOutline(false);
                    setElevation(0.0f);
                }
                if (this.f26629u0) {
                    int i12 = org.telegram.ui.ActionBar.i6.He;
                    setBackgroundColor(z(i12));
                    if (z11) {
                        view.setBackgroundColor(z(i12));
                    }
                }
                this.L1 = 0;
            }
        } else if (this.L1 != 1) {
            if (!this.F2) {
                setOutlineProvider(this.M1);
                setClipToOutline(true);
                setElevation(AndroidUtilities.dp(2.0f));
            }
            setBackgroundResource(R.drawable.smiles_popup);
            Drawable background = getBackground();
            int i13 = org.telegram.ui.ActionBar.i6.He;
            background.setColorFilter(new PorterDuffColorFilter(z(i13), PorterDuff.Mode.MULTIPLY));
            if (z11 && this.f26629u0) {
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
                this.B0.k(this.f26644y0.F(L02), i12);
            }
        } else if (i10 == 2) {
            s4.h0 adapter = this.f26589h0.getAdapter();
            ry ryVar = this.f26606n0;
            if (adapter == ryVar && ryVar.I >= 0 && this.f26623s0 >= 0 && this.f26619r0 >= 0 && (L0 = this.f26592i0.L0()) != -1) {
                if (L0 >= ryVar.I) {
                    i11 = this.f26623s0;
                } else {
                    i11 = this.f26619r0;
                }
                this.f26612p0.k(i11, 0);
            }
        }
    }

    public final void q(boolean z10) {
        int i10;
        ny nyVar = this.f26627t1;
        le.c cVar = this.f26565a;
        uw uwVar = this.D0;
        boolean z11 = false;
        xw xwVar = this.G0;
        if (nyVar != null && nyVar.z()) {
            s4.c1 L = uwVar.L(0);
            if (L == null) {
                zy.a(xwVar, true, !z10);
            } else {
                if (L.f43005a.getTop() < uwVar.getPaddingTop()) {
                    z11 = true;
                }
                zy.a(xwVar, z11, !z10);
            }
            xwVar.setTranslationY(cVar.e * AndroidUtilities.dp(15.0f));
        } else if (xwVar != null && uwVar != null) {
            s4.c1 L2 = uwVar.L(0);
            if (L2 != null) {
                i10 = L2.f43005a.getTop();
            } else {
                i10 = -this.f26570b1;
            }
            xwVar.setTranslationY((cVar.e * AndroidUtilities.dp(15.0f)) + i10);
            xwVar.f30990a.a(false, !z10);
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
        zy zyVar;
        s4.c0 c0Var;
        View view;
        View view2;
        int i10;
        TLRPC.TL_messages_stickerSet stickerSetById;
        dz dzVar;
        int E;
        AnimatorSet animatorSet = this.M0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.M0 = null;
        }
        int currentItem = this.h.getCurrentItem();
        if (currentItem == 2 && j3 != -1 && (stickerSetById = MediaDataController.getInstance(this.f26574c1).getStickerSetById(j3)) != null && (E = (dzVar = this.f26644y0).E(stickerSetById)) >= 0 && E < dzVar.h()) {
            H(E, AndroidUtilities.dp(48.0f));
        }
        ry ryVar = this.f26595j0;
        if (ryVar != null) {
            ryVar.K = false;
        }
        for (int i11 = 0; i11 < 3; i11++) {
            View view3 = this.D0;
            View view4 = this.f26589h0;
            rw rwVar = this.f26609o0;
            View view5 = this.P;
            if (i11 == 0) {
                zyVar = this.V;
                c0Var = this.Q;
                view = this.I;
                view2 = view5;
            } else if (i11 == 1) {
                c0Var = this.f26592i0;
                view = this.f26612p0;
                view2 = view4;
                zyVar = rwVar;
            } else {
                zyVar = this.G0;
                c0Var = this.E0;
                view = this.B0;
                view2 = view3;
            }
            if (zyVar != null) {
                yy yyVar = zyVar.f30995r;
                zyVar.d.setText("");
                if (yyVar != null) {
                    yyVar.G1(null);
                    yyVar.E1();
                }
                int i12 = this.f26570b1;
                if (i11 == currentItem && z10) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.M0 = animatorSet2;
                    Property property = View.TRANSLATION_Y;
                    if (view != null && i11 != 1) {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, 0.0f), ObjectAnimator.ofFloat(view2, property, AndroidUtilities.dp(36.0f)), ObjectAnimator.ofFloat(zyVar, property, AndroidUtilities.dp(36.0f)));
                    } else {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(view2, property, AndroidUtilities.dp(36.0f) - i12));
                    }
                    this.M0.setDuration(200L);
                    this.M0.setInterpolator(sr.h);
                    this.M0.addListener(new ai.y4(this, c0Var, view2, 5));
                    this.M0.start();
                } else {
                    if (zyVar != rwVar) {
                        zyVar.setTranslationY(AndroidUtilities.dp(36.0f) - i12);
                    }
                    if (view != null && i11 != 2) {
                        view.setTranslationY(0.0f);
                    }
                    if (view2 == view3) {
                        i10 = 0;
                        view2.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f) + this.f26614p2);
                    } else {
                        i10 = 0;
                        if (view2 == view4) {
                            view2.setPadding(0, AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(44.0f) + this.f26614p2);
                        } else {
                            if (view2 == view5) {
                                view2.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f) + this.f26614p2);
                            }
                            i10 = 0;
                        }
                    }
                    c0Var.h1(i10, i10);
                }
            }
        }
        if (!z10) {
            this.f26627t1.i(0);
        }
    }

    public void setBlurredBackgroundDrawableFactory(ah.c cVar) {
        org.telegram.ui.ActionBar.e6 e6Var = this.Z1;
        View view = this.f26639x;
        if (view != null) {
            ch.d c10 = cVar.c(view, null, false);
            c10.u(eh.b.d(e6Var));
            c10.w(AndroidUtilities.dp(18.0f));
            c10.v(AndroidUtilities.dp(6.0f));
            view.setBackground(c10);
        }
        View view2 = this.E;
        if (view2 != null) {
            ch.d c11 = cVar.c(view2, null, false);
            c11.u(eh.b.d(e6Var));
            c11.w(AndroidUtilities.dp(18.0f));
            c11.v(AndroidUtilities.dp(6.0f));
            view2.setBackground(c11);
        }
        View view3 = this.f26635w;
        if (view3 != null) {
            ch.d c12 = cVar.c(view3, null, false);
            c12.u(eh.b.d(e6Var));
            c12.w(AndroidUtilities.dp(18.0f));
            c12.v(AndroidUtilities.dp(6.0f));
            view3.setBackground(c12);
        }
        View view4 = this.f26643y;
        if (view4 != null) {
            ch.d c13 = cVar.c(view4, null, false);
            c13.u(eh.b.d(e6Var));
            c13.w(AndroidUtilities.dp(18.0f));
            c13.v(AndroidUtilities.dp(6.0f));
            view4.setBackground(c13);
        }
    }

    public void setBottomInset(int i10) {
        if (this.f26614p2 != i10) {
            this.f26614p2 = i10;
            j(i10, this.K);
            j(i10, this.M);
            j(AndroidUtilities.dp(44.0f) + i10, this.P);
            j(AndroidUtilities.dp(44.0f) + i10, this.D0);
            j(AndroidUtilities.dp(44.0f) + i10, this.f26589h0);
            FrameLayout frameLayout = this.f26622s;
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

    public void setDelegate(ny nyVar) {
        this.f26627t1 = nyVar;
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
        rw rwVar = this.f26609o0;
        if (rwVar != null) {
            rwVar.d.setEnabled(z10);
        }
        mw mwVar = this.V;
        if (mwVar != null) {
            mwVar.d.setEnabled(z10);
        }
    }

    public void setForseMultiwindowLayout(boolean z10) {
        this.N1 = z10;
    }

    public void setShouldDrawBackground(boolean z10) {
        if (this.f26629u0 != z10) {
            this.f26629u0 = z10;
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
                int i11 = this.f26574c1;
                NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.stickersDidLoad);
                if (this.f26644y0 != null) {
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
        dz dzVar;
        boolean z11 = this.L2;
        this.L2 = z10;
        if (z11 && !z10) {
            int i10 = this.A1;
            if (i10 == 0) {
                ux uxVar = this.R;
                if (uxVar != null) {
                    uxVar.F(false);
                }
            } else if (i10 == 1) {
                ry ryVar = this.f26606n0;
                if (ryVar != null) {
                    ryVar.l();
                }
            } else if (i10 == 2 && (dzVar = this.f26644y0) != null) {
                dzVar.l();
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
                    return this.f26592i0;
                }
                throw new IllegalArgumentException(hg.k0.h(i10, "Unexpected argument: "));
            }
            return this.Q;
        }
        return this.E0;
    }

    public final yl0 x(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return this.f26589h0;
                }
                throw new IllegalArgumentException(hg.k0.h(i10, "Unexpected argument: "));
            }
            return this.P;
        }
        return this.D0;
    }

    public final HorizontalScrollView y(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return this.f26612p0;
                }
                throw new IllegalArgumentException(hg.k0.h(i10, "Unexpected argument: "));
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
