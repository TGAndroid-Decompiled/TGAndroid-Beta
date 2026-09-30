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
public class nz extends FrameLayout implements le.e, NotificationCenter.NotificationCenterDelegate, ph.a {
    public static final int O2 = 0;
    public final kw A0;
    public int A1;
    public final GradientDrawable A2;
    public final ax B0;
    public final av B1;
    public int B2;
    public final bx C0;
    public final int C1;
    public ArrayList C2;
    public final vw D0;
    public final int[] D1;
    public int D2;
    public final ImageView E;
    public final ww E0;
    public int E1;
    public long E2;
    public AnimatorSet F;
    public lz F0;
    public int F1;
    public final le.c F2;
    public AnimatorSet G;
    public final zw G0;
    public int G1;
    public ArrayList G2;
    public float H;
    public final nh.d H0;
    public int H1;
    public boolean H2;
    public final rx I;
    public boolean I0;
    public int I1;
    public NotificationCenter.ObserversGroup I2;
    public final mx J;
    public boolean J0;
    public TLRPC.ChatFull J1;
    public AnimatorSet J2;
    public final ci.m6 K;
    public boolean K0;
    public boolean K1;
    public org.telegram.messenger.video.k K2;
    public final nh.b L;
    public final hy L0;
    public int L1;
    public final gw L2;
    public final ci.m6 M;
    public AnimatorSet M0;
    public final ai.i6 M1;
    public boolean M2;
    public final nh.b N;
    public final ai.p4 N0;
    public boolean N1;
    public boolean N2;
    public final View O;
    public tx O0;
    public int O1;
    public final zx P;
    public boolean P0;
    public boolean P1;
    public final nx Q;
    public final int[] Q0;
    public boolean Q1;
    public final wx R;
    public final ObjectAnimator[] R0;
    public wy R1;
    public final ny S;
    public boolean S0;
    public float S1;
    public lz T;
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
    public final org.telegram.ui.ActionBar.m2 Y1;
    public final Drawable[] Z0;
    public final org.telegram.ui.ActionBar.d6 Z1;
    public final le.c f26809a;
    public final cl0 f26810a0;
    public final String[] f26811a1;
    public final org.telegram.ui.ActionBar.s5 a2;
    public final le.c f26812b;
    public final cl0 f26813b0;
    public final int f26814b1;
    public final org.telegram.ui.ActionBar.s5 f26815b2;
    public int f26816c;
    public boolean f26817c0;
    public final int f26818c1;
    public final boolean f26819c2;
    public final ArrayList d;
    public final boolean f26820d0;
    public final ArrayList f26821d1;
    public LongSparseArray f26822d2;
    public final ArrayList e;
    public boolean f26823e0;
    public int f26824e1;
    public PorterDuffColorFilter f26825e2;
    public boolean f26826f;
    public boolean f26827f0;
    public int f26828f1;
    public final org.telegram.ui.Cells.t6 f26829f2;
    public final ow f26830g0;
    public boolean f26831g1;
    public final hx f26832g2;
    public final cx h;
    public final pw f26833h0;
    public TLRPC.TL_messages_stickerSet f26834h1;
    public boolean f26835h2;
    public final ty f26836i0;
    public ArrayList f26837i1;
    public final boolean f26838i2;
    public final sy f26839j0;
    public ArrayList f26840j1;
    public final ah.h f26841j2;
    public final vy f26842k0;
    public ArrayList f26843k1;
    public final mh f26844k2;
    public final HashMap f26845l0;
    public ArrayList l1;
    public final ah.c f26846l2;
    public final kw m0;
    public final ArrayList f26847m1;
    public final li.e f26848m2;
    public final FrameLayout f26849n;
    public final sy f26850n0;
    public final ArrayList f26851n1;
    public boolean f26852n2;
    public final sw f26853o0;
    public final ArrayList f26854o1;
    public boolean f26855o2;
    public final ux f26856p0;
    public final ArrayList f26857p1;
    public int f26858p2;
    public boolean f26859q0;
    public final ArrayList f26860q1;
    public float f26861q2;
    public final FrameLayout f26862r;
    public int f26863r0;
    public final HashMap f26864r1;
    public View f26865r2;
    public final FrameLayout f26866s;
    public int f26867s0;
    public final Paint f26868s1;
    public int f26869s2;
    public int f26870t0;
    public oy f26871t1;
    public int f26872t2;
    public boolean f26873u0;
    public long f26874u1;
    public long f26875u2;
    public final View v;
    public boolean f26876v0;
    public boolean f26877v1;
    public boolean f26878v2;
    public final rd0 f26879w;
    public boolean f26880w0;
    public boolean f26881w1;
    public boolean f26882w2;
    public final dx f26883x;
    public final tw f26884x0;
    public final TLRPC.StickerSetCovered[] f26885x1;
    public final Rect f26886x2;
    public final ImageView f26887y;
    public final ez f26888y0;
    public final LongSparseArray f26889y1;
    public final RectF f26890y2;
    public final iz f26891z0;
    public final LongSparseArray f26892z1;
    public final ArrayList f26893z2;

    public nz(org.telegram.ui.ActionBar.m2 m2Var, boolean z10, boolean z11, boolean z12, Context context, boolean z13, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z14, final org.telegram.ui.ActionBar.d6 d6Var, boolean z15, boolean z16) {
        super(context);
        org.telegram.ui.ActionBar.s5 s5Var;
        int z17;
        mx mxVar;
        Context context2;
        gw gwVar;
        boolean z18;
        Field field;
        int i10;
        tr trVar = tr.h;
        this.f26809a = new le.c(0, this, trVar, 320L, false);
        this.f26812b = new le.c(1, this, trVar, 320L, false);
        this.f26816c = 2;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.e = new ArrayList();
        this.f26817c0 = true;
        this.f26842k0 = new vy(this);
        this.f26845l0 = new HashMap();
        this.f26859q0 = true;
        this.f26863r0 = -2;
        this.f26867s0 = -2;
        this.f26870t0 = -2;
        this.f26873u0 = true;
        this.f26880w0 = true;
        this.I0 = true;
        this.Q0 = new int[3];
        this.R0 = new ObjectAnimator[3];
        int i11 = UserConfig.selectedAccount;
        this.f26818c1 = i11;
        this.f26821d1 = new ArrayList();
        this.f26837i1 = new ArrayList();
        this.f26840j1 = new ArrayList();
        this.f26843k1 = new ArrayList();
        this.l1 = new ArrayList();
        this.f26847m1 = new ArrayList();
        this.f26851n1 = new ArrayList();
        new ArrayList();
        this.f26854o1 = new ArrayList();
        this.f26857p1 = new ArrayList();
        this.f26860q1 = new ArrayList();
        this.f26864r1 = new HashMap();
        this.f26885x1 = new TLRPC.StickerSetCovered[10];
        this.f26889y1 = new LongSparseArray();
        this.f26892z1 = new LongSparseArray();
        this.D1 = new int[2];
        this.F1 = -2;
        this.G1 = -2;
        this.H1 = -2;
        this.I1 = -2;
        this.L1 = -1;
        this.f26829f2 = new org.telegram.ui.Cells.t6(this, 12);
        this.f26832g2 = new hx(this);
        this.f26835h2 = true;
        li.e eVar = new li.e();
        this.f26848m2 = eVar;
        this.f26861q2 = -1.0f;
        this.f26869s2 = -1;
        this.f26872t2 = -1;
        this.f26875u2 = -1L;
        this.f26878v2 = false;
        this.f26882w2 = true;
        this.f26886x2 = new Rect();
        RectF rectF = new RectF();
        this.f26890y2 = rectF;
        ArrayList arrayList2 = new ArrayList(1);
        this.f26893z2 = arrayList2;
        arrayList2.add(rectF);
        this.A2 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.F2 = new le.c(0, new hw(this, 3), trVar, 380L, true);
        this.L2 = new gw(this, 1);
        this.M2 = false;
        this.f26873u0 = z14;
        this.Y1 = m2Var;
        this.f26819c2 = z10;
        this.Z1 = d6Var;
        this.f26838i2 = z16;
        fh.c cVar = new fh.c();
        cVar.a(z(org.telegram.ui.ActionBar.h6.f19076d6));
        if (z15) {
            u(true);
        }
        i0.a.k(z(org.telegram.ui.ActionBar.h6.Wk), 30);
        int dp = AndroidUtilities.dp(50.0f);
        this.f26814b1 = dp;
        this.f26820d0 = z13;
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
        this.f26815b2 = U5;
        this.Y0 = new Drawable[]{U, U2, s5Var, new LayerDrawable(new Drawable[]{U4, U5})};
        this.Z0 = new Drawable[]{org.telegram.ui.ActionBar.h6.U(context, R.drawable.msg_emoji_recent, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.h6.Me), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.h6.Oe)), org.telegram.ui.ActionBar.h6.U(context, R.drawable.stickers_gifs_trending, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.h6.Me), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.h6.Oe))};
        this.f26811a1 = new String[]{LocaleController.getString(R.string.Emoji1), LocaleController.getString(R.string.Emoji2), LocaleController.getString(R.string.Emoji3), LocaleController.getString(R.string.Emoji4), LocaleController.getString(R.string.Emoji5), LocaleController.getString(R.string.Emoji6), LocaleController.getString(R.string.Emoji7), LocaleController.getString(R.string.Emoji8)};
        this.J1 = chatFull;
        Paint paint = new Paint(1);
        this.f26868s1 = paint;
        paint.setColor(z(org.telegram.ui.ActionBar.h6.f19028af));
        ai.k2 k2Var = yf.i0.f47219a;
        this.M1 = new ai.i6(AndroidUtilities.dp(6.0f));
        mx mxVar2 = new mx(this, context);
        this.J = mxVar2;
        ?? obj = new Object();
        obj.f25588a = 0;
        obj.f25589b = mxVar2;
        arrayList.add(obj);
        if (z10) {
            MediaDataController.getInstance(i11).checkStickers(5);
            MediaDataController.getInstance(i11).checkFeaturedEmoji();
            this.f26825e2 = new PorterDuffColorFilter(z(org.telegram.ui.ActionBar.h6.Oh), PorterDuff.Mode.SRC_IN);
        }
        zx zxVar = new zx(this, context);
        this.P = zxVar;
        eVar.a(zxVar);
        s4.j jVar = new s4.j();
        jVar.f43149c = 220L;
        jVar.e = 220L;
        jVar.f43150f = 160L;
        jVar.f43151g = 160L;
        jVar.f43152i = tr.f28637g;
        zxVar.setItemAnimator(jVar);
        zxVar.setOnTouchListener(new View.OnTouchListener(this) {
            public final nz f25207b;

            {
                this.f25207b = this;
            }

            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                switch (r3) {
                    case 0:
                        org.telegram.ui.nt q6 = org.telegram.ui.nt.q();
                        nz nzVar = this.f25207b;
                        zx zxVar2 = nzVar.P;
                        nzVar.getMeasuredHeight();
                        return q6.s(motionEvent, zxVar2, null, nzVar.f26832g2, d6Var);
                    case 1:
                        org.telegram.ui.nt q10 = org.telegram.ui.nt.q();
                        nz nzVar2 = this.f25207b;
                        return q10.s(motionEvent, nzVar2.f26833h0, nzVar2.m0, nzVar2.f26832g2, d6Var);
                    default:
                        org.telegram.ui.nt q11 = org.telegram.ui.nt.q();
                        nz nzVar3 = this.f25207b;
                        vw vwVar = nzVar3.D0;
                        nzVar3.getMeasuredHeight();
                        return q11.s(motionEvent, vwVar, nzVar3.A0, nzVar3.f26832g2, d6Var);
                }
            }
        });
        zxVar.setOnItemLongClickListener(new hw(this, 1));
        zxVar.setInstantClick(true);
        nx nxVar = new nx(this);
        this.Q = nxVar;
        zxVar.setLayoutManager(nxVar);
        zxVar.setTopGlowOffset(AndroidUtilities.dp(38.0f));
        zxVar.setBottomGlowOffset(AndroidUtilities.dp(36.0f));
        zxVar.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f));
        int i15 = org.telegram.ui.ActionBar.h6.He;
        zxVar.setGlowColor(z(i15));
        zxVar.setItemSelectorColorProvider(new x1(29));
        zxVar.setClipToPadding(false);
        nxVar.O = new ox(this);
        wx wxVar = new wx(this);
        this.R = wxVar;
        zxVar.setAdapter(wxVar);
        zxVar.i(new ci.r1(this, 3));
        this.S = new ny(this, context);
        mxVar2.addView(zxVar, w7.y5.c(-1.0f, -1));
        cl0 cl0Var = new cl0(zxVar, nxVar);
        this.f26813b0 = cl0Var;
        cl0Var.f23360i = new px(this);
        zxVar.setOnScrollListener(new qx(this));
        if (m2Var != null) {
            mxVar = mxVar2;
            context2 = context;
            gwVar = new gw(this, 2);
        } else {
            mxVar = mxVar2;
            context2 = context;
            gwVar = null;
        }
        rx rxVar = new rx(this, context2, d6Var, z10, gwVar, z16);
        this.I = rxVar;
        if (z13) {
            mw mwVar = new mw(this, context2);
            this.V = mwVar;
            mxVar.addView(mwVar, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + dp));
            mwVar.d.setOnFocusChangeListener(new nw(this));
            nh.d dVar = new nh.d(context2, d6Var);
            this.U = dVar;
            dVar.setVisibility(8);
            dVar.setOnBackClickListener(new View.OnClickListener(this) {
                public final nz f25558b;

                {
                    this.f25558b = this;
                }

                @Override
                public final void onClick(View view) {
                    az azVar;
                    switch (r2) {
                        case 0:
                            ny nyVar = this.f25558b.S;
                            iy iyVar = nyVar.f26799c;
                            int childCount = iyVar.getChildCount();
                            for (int i16 = 0; i16 < childCount; i16++) {
                                ((nh.c) iyVar.getChildAt(i16)).a(false, true);
                            }
                            nyVar.d = 0L;
                            nyVar.F.f26812b.a(false, true);
                            nyVar.l();
                            return;
                        case 1:
                            iz izVar = this.f25558b.f26891z0;
                            hz hzVar = izVar.f25239c;
                            int childCount2 = hzVar.getChildCount();
                            for (int i17 = 0; i17 < childCount2; i17++) {
                                ((nh.c) hzVar.getChildAt(i17)).a(false, true);
                            }
                            izVar.d = 0L;
                            izVar.Q.f26809a.a(false, true);
                            izVar.l();
                            return;
                        case 2:
                            oy oyVar = this.f25558b.f26871t1;
                            if (oyVar != null) {
                                oyVar.w();
                                return;
                            }
                            return;
                        default:
                            nz nzVar = this.f25558b;
                            int currentItem = nzVar.h.getCurrentItem();
                            if (currentItem == 0) {
                                azVar = nzVar.V;
                            } else if (currentItem == 1) {
                                azVar = nzVar.f26853o0;
                            } else {
                                azVar = nzVar.G0;
                            }
                            if (azVar != null) {
                                lq lqVar = azVar.d;
                                lqVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                lqVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                lqVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                return;
                            }
                            return;
                    }
                }
            });
            mxVar.addView(dVar, new FrameLayout.LayoutParams(-1, dp));
        }
        int z19 = z(i15);
        if (Color.alpha(z19) >= 255) {
            rxVar.setBackgroundColor(z19);
        }
        wxVar.G(true);
        rxVar.p(getEmojipacks());
        mxVar.addView(rxVar, w7.y5.c(36.0f, -1));
        View view = new View(context2);
        this.O = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        int i16 = org.telegram.ui.ActionBar.h6.Ke;
        view.setBackgroundColor(z(i16));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(36.0f);
        mxVar.addView(view, layoutParams);
        nh.b bVar = new nh.b(context2, d6Var);
        this.L = bVar;
        ci.m6 m6Var = new ci.m6(context2, 3, d6Var);
        this.K = m6Var;
        m6Var.setVisibility(8);
        m6Var.addView(bVar, w7.y5.d(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
        mxVar.addView(m6Var, w7.y5.e(-1, -2, 80));
        if (z11) {
            wm0 wm0Var = wm0.f30009b;
            if (z12) {
                ow owVar = new ow(this, context2);
                this.f26830g0 = owVar;
                ?? obj2 = new Object();
                obj2.f25588a = 1;
                obj2.f25589b = owVar;
                this.d.add(obj2);
                pw pwVar = new pw(this, context2);
                this.f26833h0 = pwVar;
                eVar.a(pwVar);
                pwVar.setClipToPadding(false);
                ty tyVar = new ty(this);
                this.f26836i0 = tyVar;
                pwVar.setLayoutManager(tyVar);
                pwVar.i(new qw(this));
                pwVar.setPadding(0, dp, 0, AndroidUtilities.dp(44.0f) + this.f26858p2);
                ((s4.f1) pwVar.getItemAnimator()).f43103m = false;
                sy syVar = new sy(this, context2, true, Integer.MAX_VALUE);
                this.f26850n0 = syVar;
                pwVar.setAdapter(syVar);
                this.f26839j0 = new sy(this, context2, false, 0);
                pwVar.setOnScrollListener(new rw(this));
                pwVar.setOnTouchListener(new View.OnTouchListener(this) {
                    public final nz f25207b;

                    {
                        this.f25207b = this;
                    }

                    @Override
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        switch (r3) {
                            case 0:
                                org.telegram.ui.nt q6 = org.telegram.ui.nt.q();
                                nz nzVar = this.f25207b;
                                zx zxVar2 = nzVar.P;
                                nzVar.getMeasuredHeight();
                                return q6.s(motionEvent, zxVar2, null, nzVar.f26832g2, d6Var);
                            case 1:
                                org.telegram.ui.nt q10 = org.telegram.ui.nt.q();
                                nz nzVar2 = this.f25207b;
                                return q10.s(motionEvent, nzVar2.f26833h0, nzVar2.m0, nzVar2.f26832g2, d6Var);
                            default:
                                org.telegram.ui.nt q11 = org.telegram.ui.nt.q();
                                nz nzVar3 = this.f25207b;
                                vw vwVar = nzVar3.D0;
                                nzVar3.getMeasuredHeight();
                                return q11.s(motionEvent, vwVar, nzVar3.A0, nzVar3.f26832g2, d6Var);
                        }
                    }
                });
                ?? r12 = new nl0(this) {
                    public final nz f25830b;

                    {
                        this.f25830b = this;
                    }

                    @Override
                    public final void d(int i17, View view2) {
                        int i18;
                        String str;
                        switch (r2) {
                            case 0:
                                nz nzVar = this.f25830b;
                                pw pwVar2 = nzVar.f26833h0;
                                sy syVar2 = nzVar.f26839j0;
                                sy syVar3 = nzVar.f26850n0;
                                if (nzVar.f26871t1 != null) {
                                    syVar3.getClass();
                                    ArrayList arrayList3 = syVar3.f28368x;
                                    if (pwVar2.getAdapter() == syVar3) {
                                        if (i17 >= 0) {
                                            int i19 = syVar3.H;
                                            if (i17 < i19) {
                                                nzVar.f26871t1.v(view2, nzVar.f26837i1.get(i17), null, "gif", true, 0, 0);
                                                return;
                                            }
                                            if (i19 > 0) {
                                                i18 = (i17 - i19) - 1;
                                            } else {
                                                i18 = i17;
                                            }
                                            if (i18 >= 0 && i18 < arrayList3.size()) {
                                                nzVar.f26871t1.v(view2, arrayList3.get(i18), null, syVar3.f28364n, true, 0, 0);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    } else if (pwVar2.getAdapter() == syVar2 && i17 >= 0 && i17 < syVar2.f28368x.size()) {
                                        nzVar.f26871t1.v(view2, syVar2.f28368x.get(i17), syVar2.f28367w, syVar2.f28364n, true, 0, 0);
                                        nzVar.W();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            default:
                                nz nzVar2 = this.f25830b;
                                s4.h0 adapter = nzVar2.D0.getAdapter();
                                iz izVar = nzVar2.f26891z0;
                                if (adapter == izVar) {
                                    str = izVar.N;
                                } else {
                                    str = null;
                                }
                                String str2 = str;
                                if (view2 instanceof org.telegram.ui.Cells.f8) {
                                    org.telegram.ui.Cells.f8 f8Var = (org.telegram.ui.Cells.f8) view2;
                                    if (f8Var.getSticker() != null && MessageObject.isPremiumSticker(f8Var.getSticker()) && !AccountInstance.getInstance(nzVar2.f26818c1).getUserConfig().isPremium()) {
                                        org.telegram.ui.nt.q().y(f8Var);
                                        return;
                                    }
                                    org.telegram.ui.nt.q().u();
                                    if (!f8Var.f20325r) {
                                        f8Var.f20325r = true;
                                        f8Var.f20324n = 0.5f;
                                        f8Var.f20328x = 0L;
                                        org.telegram.ui.Cells.e8 e8Var = f8Var.f20320a;
                                        e8Var.setAlpha(0.5f * f8Var.H);
                                        e8Var.invalidate();
                                        f8Var.f20326s = System.currentTimeMillis();
                                        f8Var.invalidate();
                                        nzVar2.f26871t1.m(f8Var, f8Var.getSticker(), str2, f8Var.getParentObject(), f8Var.getSendAnimationData(), true, 0);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                };
                this.m0 = r12;
                pwVar.setOnItemClickListener((nl0) r12);
                owVar.addView(pwVar, w7.y5.c(-1.0f, -1));
                sw swVar = new sw(this, context2);
                this.f26853o0 = swVar;
                owVar.addView(swVar, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + dp));
                ux uxVar = new ux(this, context2, d6Var);
                this.f26856p0 = uxVar;
                uxVar.setType(wm0Var);
                uxVar.setUnderlineHeight(AndroidUtilities.getShadowHeight());
                i10 = i14;
                uxVar.setIndicatorColor(z(i10));
                uxVar.setUnderlineColor(z(i16));
                uxVar.setBackgroundColor(z(i15));
                V();
                uxVar.setDelegate(new hw(this, 2));
                syVar.F("", "", true, true, true);
            } else {
                i10 = i14;
            }
            tw twVar = new tw(this, context2, z14);
            this.f26884x0 = twVar;
            MediaDataController.getInstance(this.f26818c1).checkStickers(0);
            MediaDataController.getInstance(this.f26818c1).checkFeaturedStickers();
            vw vwVar = new vw(this, context2);
            this.D0 = vwVar;
            this.f26848m2.a(vwVar);
            ww wwVar = new ww(this);
            this.E0 = wwVar;
            vwVar.setLayoutManager(wwVar);
            wwVar.O = new yw(this);
            vwVar.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f));
            vwVar.setClipToPadding(false);
            ?? obj3 = new Object();
            obj3.f25588a = 2;
            obj3.f25589b = twVar;
            this.d.add(obj3);
            this.f26891z0 = new iz(this, context2);
            ez ezVar = new ez(this, context2);
            this.f26888y0 = ezVar;
            vwVar.setAdapter(ezVar);
            vwVar.setOnTouchListener(new View.OnTouchListener(this) {
                public final nz f25207b;

                {
                    this.f25207b = this;
                }

                @Override
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    switch (r3) {
                        case 0:
                            org.telegram.ui.nt q6 = org.telegram.ui.nt.q();
                            nz nzVar = this.f25207b;
                            zx zxVar2 = nzVar.P;
                            nzVar.getMeasuredHeight();
                            return q6.s(motionEvent, zxVar2, null, nzVar.f26832g2, d6Var);
                        case 1:
                            org.telegram.ui.nt q10 = org.telegram.ui.nt.q();
                            nz nzVar2 = this.f25207b;
                            return q10.s(motionEvent, nzVar2.f26833h0, nzVar2.m0, nzVar2.f26832g2, d6Var);
                        default:
                            org.telegram.ui.nt q11 = org.telegram.ui.nt.q();
                            nz nzVar3 = this.f25207b;
                            vw vwVar2 = nzVar3.D0;
                            nzVar3.getMeasuredHeight();
                            return q11.s(motionEvent, vwVar2, nzVar3.A0, nzVar3.f26832g2, d6Var);
                    }
                }
            });
            ?? r42 = new nl0(this) {
                public final nz f25830b;

                {
                    this.f25830b = this;
                }

                @Override
                public final void d(int i17, View view2) {
                    int i18;
                    String str;
                    switch (r2) {
                        case 0:
                            nz nzVar = this.f25830b;
                            pw pwVar2 = nzVar.f26833h0;
                            sy syVar2 = nzVar.f26839j0;
                            sy syVar3 = nzVar.f26850n0;
                            if (nzVar.f26871t1 != null) {
                                syVar3.getClass();
                                ArrayList arrayList3 = syVar3.f28368x;
                                if (pwVar2.getAdapter() == syVar3) {
                                    if (i17 >= 0) {
                                        int i19 = syVar3.H;
                                        if (i17 < i19) {
                                            nzVar.f26871t1.v(view2, nzVar.f26837i1.get(i17), null, "gif", true, 0, 0);
                                            return;
                                        }
                                        if (i19 > 0) {
                                            i18 = (i17 - i19) - 1;
                                        } else {
                                            i18 = i17;
                                        }
                                        if (i18 >= 0 && i18 < arrayList3.size()) {
                                            nzVar.f26871t1.v(view2, arrayList3.get(i18), null, syVar3.f28364n, true, 0, 0);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                } else if (pwVar2.getAdapter() == syVar2 && i17 >= 0 && i17 < syVar2.f28368x.size()) {
                                    nzVar.f26871t1.v(view2, syVar2.f28368x.get(i17), syVar2.f28367w, syVar2.f28364n, true, 0, 0);
                                    nzVar.W();
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        default:
                            nz nzVar2 = this.f25830b;
                            s4.h0 adapter = nzVar2.D0.getAdapter();
                            iz izVar = nzVar2.f26891z0;
                            if (adapter == izVar) {
                                str = izVar.N;
                            } else {
                                str = null;
                            }
                            String str2 = str;
                            if (view2 instanceof org.telegram.ui.Cells.f8) {
                                org.telegram.ui.Cells.f8 f8Var = (org.telegram.ui.Cells.f8) view2;
                                if (f8Var.getSticker() != null && MessageObject.isPremiumSticker(f8Var.getSticker()) && !AccountInstance.getInstance(nzVar2.f26818c1).getUserConfig().isPremium()) {
                                    org.telegram.ui.nt.q().y(f8Var);
                                    return;
                                }
                                org.telegram.ui.nt.q().u();
                                if (!f8Var.f20325r) {
                                    f8Var.f20325r = true;
                                    f8Var.f20324n = 0.5f;
                                    f8Var.f20328x = 0L;
                                    org.telegram.ui.Cells.e8 e8Var = f8Var.f20320a;
                                    e8Var.setAlpha(0.5f * f8Var.H);
                                    e8Var.invalidate();
                                    f8Var.f20326s = System.currentTimeMillis();
                                    f8Var.invalidate();
                                    nzVar2.f26871t1.m(f8Var, f8Var.getSticker(), str2, f8Var.getParentObject(), f8Var.getSendAnimationData(), true, 0);
                                    return;
                                }
                                return;
                            }
                            return;
                    }
                }
            };
            this.A0 = r42;
            vwVar.setOnItemClickListener((nl0) r42);
            vwVar.setGlowColor(z(i15));
            twVar.addView(vwVar);
            this.f26810a0 = new cl0(vwVar, wwVar);
            zw zwVar = new zw(this, context2);
            this.G0 = zwVar;
            twVar.addView(zwVar, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + dp));
            nh.d dVar2 = new nh.d(context2, d6Var);
            this.H0 = dVar2;
            dVar2.setVisibility(8);
            dVar2.setOnBackClickListener(new View.OnClickListener(this) {
                public final nz f25558b;

                {
                    this.f25558b = this;
                }

                @Override
                public final void onClick(View view2) {
                    az azVar;
                    switch (r2) {
                        case 0:
                            ny nyVar = this.f25558b.S;
                            iy iyVar = nyVar.f26799c;
                            int childCount = iyVar.getChildCount();
                            for (int i162 = 0; i162 < childCount; i162++) {
                                ((nh.c) iyVar.getChildAt(i162)).a(false, true);
                            }
                            nyVar.d = 0L;
                            nyVar.F.f26812b.a(false, true);
                            nyVar.l();
                            return;
                        case 1:
                            iz izVar = this.f25558b.f26891z0;
                            hz hzVar = izVar.f25239c;
                            int childCount2 = hzVar.getChildCount();
                            for (int i17 = 0; i17 < childCount2; i17++) {
                                ((nh.c) hzVar.getChildAt(i17)).a(false, true);
                            }
                            izVar.d = 0L;
                            izVar.Q.f26809a.a(false, true);
                            izVar.l();
                            return;
                        case 2:
                            oy oyVar = this.f25558b.f26871t1;
                            if (oyVar != null) {
                                oyVar.w();
                                return;
                            }
                            return;
                        default:
                            nz nzVar = this.f25558b;
                            int currentItem = nzVar.h.getCurrentItem();
                            if (currentItem == 0) {
                                azVar = nzVar.V;
                            } else if (currentItem == 1) {
                                azVar = nzVar.f26853o0;
                            } else {
                                azVar = nzVar.G0;
                            }
                            if (azVar != null) {
                                lq lqVar = azVar.d;
                                lqVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                lqVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                lqVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                return;
                            }
                            return;
                    }
                }
            });
            twVar.addView(dVar2, new FrameLayout.LayoutParams(-1, dp));
            z18 = z14;
            ax axVar = new ax(this, context2, d6Var, m2Var, z18);
            this.B0 = axVar;
            axVar.setDragEnabled(true);
            axVar.setWillNotDraw(false);
            axVar.setType(wm0Var);
            axVar.setUnderlineHeight(vwVar.canScrollVertically(-1) ? AndroidUtilities.getShadowHeight() : 0);
            axVar.setIndicatorColor(z(i10));
            axVar.setUnderlineColor(z(i16));
            if (viewGroup != null && z18) {
                bx bxVar = new bx(this, context2);
                this.C0 = bxVar;
                bxVar.addView(axVar, w7.y5.e(-1, 36, 51));
                viewGroup.addView(bxVar, w7.y5.c(-2.0f, -1));
            } else {
                twVar.addView(axVar, w7.y5.e(-1, 36, 51));
            }
            X(true);
            axVar.setDelegate(new hw(this, 4));
            vwVar.setOnScrollListener(new mz(this, 0));
            nh.b bVar2 = new nh.b(context2, d6Var);
            this.N = bVar2;
            ci.m6 m6Var2 = new ci.m6(context2, 3, d6Var);
            this.M = m6Var2;
            m6Var2.setVisibility(8);
            m6Var2.addView(bVar2, w7.y5.d(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
            twVar.addView(m6Var2, w7.y5.e(-1, -2, 80));
        } else {
            z18 = z14;
        }
        this.e.clear();
        this.e.addAll(this.d);
        cx cxVar = new cx(this, context2);
        this.h = cxVar;
        li.e eVar2 = this.f26848m2;
        eVar2.getClass();
        cxVar.b(new ai.n7(eVar2, 1));
        cxVar.setOverScrollMode(2);
        hy hyVar = new hy(this);
        this.L0 = hyVar;
        cxVar.setAdapter(hyVar);
        dx dxVar = new dx(this, context2);
        this.f26883x = dxVar;
        dxVar.setHapticFeedbackEnabled(true);
        dxVar.setImageResource(R.drawable.smiles_tab_clear);
        int v = z16 ? v(0.6f) : z(org.telegram.ui.ActionBar.h6.Re);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        dxVar.setColorFilter(new PorterDuffColorFilter(v, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        dxVar.setScaleType(scaleType);
        dxVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
        dxVar.setFocusable(true);
        dxVar.setOnClickListener(new Object());
        w7.a6.a(dxVar);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f26862r = frameLayout;
        if (z13) {
            addView(frameLayout, w7.y5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, (AndroidUtilities.getShadowHeight() / AndroidUtilities.density) + 40.0f));
        } else {
            addView(frameLayout, w7.y5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.f26866s = frameLayout2;
        addView(frameLayout2, w7.y5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 64.0f));
        FrameLayout frameLayout3 = new FrameLayout(context2);
        this.f26849n = frameLayout3;
        View view2 = new View(context2);
        this.v = view2;
        frameLayout3.addView(view2, new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(40.0f), 83));
        if (z13) {
            addView(frameLayout3, w7.y5.e(-1, 48, 80));
            frameLayout3.addView(dxVar, w7.y5.d(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
            if (z11) {
                ImageView imageView = new ImageView(context2);
                this.f26887y = imageView;
                imageView.setImageResource(R.drawable.smiles_tab_settings);
                imageView.setColorFilter(new PorterDuffColorFilter(z16 ? v(0.6f) : z(org.telegram.ui.ActionBar.h6.Re), mode));
                imageView.setScaleType(scaleType);
                imageView.setFocusable(true);
                imageView.setContentDescription(LocaleController.getString(R.string.Settings));
                w7.a6.a(imageView);
                frameLayout3.addView(imageView, w7.y5.d(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
                imageView.setOnClickListener(new View.OnClickListener(this) {
                    public final nz f25558b;

                    {
                        this.f25558b = this;
                    }

                    @Override
                    public final void onClick(View view22) {
                        az azVar;
                        switch (r2) {
                            case 0:
                                ny nyVar = this.f25558b.S;
                                iy iyVar = nyVar.f26799c;
                                int childCount = iyVar.getChildCount();
                                for (int i162 = 0; i162 < childCount; i162++) {
                                    ((nh.c) iyVar.getChildAt(i162)).a(false, true);
                                }
                                nyVar.d = 0L;
                                nyVar.F.f26812b.a(false, true);
                                nyVar.l();
                                return;
                            case 1:
                                iz izVar = this.f25558b.f26891z0;
                                hz hzVar = izVar.f25239c;
                                int childCount2 = hzVar.getChildCount();
                                for (int i17 = 0; i17 < childCount2; i17++) {
                                    ((nh.c) hzVar.getChildAt(i17)).a(false, true);
                                }
                                izVar.d = 0L;
                                izVar.Q.f26809a.a(false, true);
                                izVar.l();
                                return;
                            case 2:
                                oy oyVar = this.f25558b.f26871t1;
                                if (oyVar != null) {
                                    oyVar.w();
                                    return;
                                }
                                return;
                            default:
                                nz nzVar = this.f25558b;
                                int currentItem = nzVar.h.getCurrentItem();
                                if (currentItem == 0) {
                                    azVar = nzVar.V;
                                } else if (currentItem == 1) {
                                    azVar = nzVar.f26853o0;
                                } else {
                                    azVar = nzVar.G0;
                                }
                                if (azVar != null) {
                                    lq lqVar = azVar.d;
                                    lqVar.requestFocus();
                                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                    lqVar.onTouchEvent(obtain);
                                    obtain.recycle();
                                    MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                    lqVar.onTouchEvent(obtain2);
                                    obtain2.recycle();
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            rd0 rd0Var = new rd0(context2, d6Var);
            this.f26879w = rd0Var;
            rd0Var.setViewPager(cxVar);
            rd0Var.setShouldExpand(false);
            rd0Var.setIndicatorHeight(AndroidUtilities.dp(3.0f));
            rd0Var.setIndicatorColor(i0.a.k(z(org.telegram.ui.ActionBar.h6.Oe), 20));
            rd0Var.setUnderlineHeight(0);
            rd0Var.setTabPaddingLeftRight(AndroidUtilities.dp(11.0f));
            rd0Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f));
            frameLayout3.addView(rd0Var, w7.y5.e(-2, 48, 81));
            rd0Var.setOnPageChangeListener(new fx(this, z18));
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
                public final nz f25558b;

                {
                    this.f25558b = this;
                }

                @Override
                public final void onClick(View view22) {
                    az azVar;
                    switch (r2) {
                        case 0:
                            ny nyVar = this.f25558b.S;
                            iy iyVar = nyVar.f26799c;
                            int childCount = iyVar.getChildCount();
                            for (int i162 = 0; i162 < childCount; i162++) {
                                ((nh.c) iyVar.getChildAt(i162)).a(false, true);
                            }
                            nyVar.d = 0L;
                            nyVar.F.f26812b.a(false, true);
                            nyVar.l();
                            return;
                        case 1:
                            iz izVar = this.f25558b.f26891z0;
                            hz hzVar = izVar.f25239c;
                            int childCount2 = hzVar.getChildCount();
                            for (int i17 = 0; i17 < childCount2; i17++) {
                                ((nh.c) hzVar.getChildAt(i17)).a(false, true);
                            }
                            izVar.d = 0L;
                            izVar.Q.f26809a.a(false, true);
                            izVar.l();
                            return;
                        case 2:
                            oy oyVar = this.f25558b.f26871t1;
                            if (oyVar != null) {
                                oyVar.w();
                                return;
                            }
                            return;
                        default:
                            nz nzVar = this.f25558b;
                            int currentItem = nzVar.h.getCurrentItem();
                            if (currentItem == 0) {
                                azVar = nzVar.V;
                            } else if (currentItem == 1) {
                                azVar = nzVar.f26853o0;
                            } else {
                                azVar = nzVar.G0;
                            }
                            if (azVar != null) {
                                lq lqVar = azVar.d;
                                lqVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                lqVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                lqVar.onTouchEvent(obtain2);
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
            w7.a6.a(dxVar);
            dxVar.setPadding(0, 0, AndroidUtilities.dp(2.0f), 0);
            dxVar.setBackground(h02);
            dxVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
            dxVar.setFocusable(true);
            frameLayout3.addView(dxVar, w7.y5.d(48, 48.0f, 51, 2.0f, 0.0f, 2.0f, 0.0f));
            view2.setVisibility(8);
        }
        addView(cxVar, 0, w7.y5.e(-1, -1, 51));
        ai.p4 p4Var = new ai.p4(context2, 22);
        this.N0 = p4Var;
        p4Var.setBackground(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(6.0f), z(org.telegram.ui.ActionBar.h6.f19323qf)));
        p4Var.setTextColor(z(org.telegram.ui.ActionBar.h6.f19304pf));
        p4Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f));
        p4Var.setGravity(16);
        p4Var.setTextSize(1, 14.0f);
        p4Var.setVisibility(4);
        addView(p4Var, w7.y5.d(-2, -2.0f, 81, 5.0f, 0.0f, 5.0f, 53.0f));
        this.C1 = AndroidUtilities.dp(AndroidUtilities.isTablet() ? 40.0f : 32.0f);
        Field field2 = av.f22716f;
        av avVar = new av(new zu(context2, d6Var));
        if (av.f22716f == null) {
            try {
                field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
                try {
                    field.setAccessible(true);
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                field = null;
            }
            av.f22716f = field;
        }
        Field field3 = av.f22716f;
        if (field3 != null) {
            try {
                avVar.f22718a = (ViewTreeObserver.OnScrollChangedListener) field3.get(avVar);
                av.f22716f.set(avVar, av.f22717g);
            } catch (Exception unused3) {
                avVar.f22718a = null;
            }
        }
        this.B1 = avVar;
        avVar.f22720c.setOnSelectionUpdateListener(new d(this, 10));
        this.A1 = MessagesController.getGlobalEmojiSettings().getInt("selected_page", 0);
        Emoji.loadRecentEmoji();
        wxVar.F(false);
        I(true, z11, z12, false);
        if (Build.VERSION.SDK_INT >= 31) {
            ah.h hVar = new ah.h(false);
            this.f26841j2 = hVar;
            fh.d dVar3 = new fh.d(null);
            dVar3.f9071f = cVar;
            dVar3.d = hVar;
            dVar3.e = -2;
            ah.c cVar2 = new ah.c(dVar3);
            this.f26846l2 = cVar2;
            cVar2.f427i = LiteMode.isEnabled(262144);
            int dp2 = AndroidUtilities.dp(LiteMode.isEnabled(262144) ? 8.0f : 48.0f);
            cVar2.f423b = dp2;
            cVar2.f424c = dp2;
            cVar2.h = this.f26848m2;
        } else {
            ah.c cVar3 = new ah.c(cVar);
            this.f26846l2 = cVar3;
            cVar3.h = this.f26848m2;
            this.f26841j2 = null;
        }
        this.f26844k2 = new mh(this, 1);
        setBlurredBackgroundDrawableFactory(this.f26846l2);
        this.f26848m2.b(this);
        this.f26848m2.f14372a = new hw(this, 0);
    }

    public static void a(nz nzVar, boolean z10) {
        pw pwVar = nzVar.f26833h0;
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

    public static void c(nz nzVar, wy wyVar, String str) {
        String str2;
        String str3;
        boolean z10;
        String str4;
        oy oyVar;
        yc ycVar;
        org.telegram.ui.ActionBar.m2 m2Var = nzVar.Y1;
        int i10 = nzVar.f26818c1;
        ArrayList arrayList = nzVar.f26860q1;
        if (wyVar != null) {
            if (wyVar.getSpan() != null) {
                if (nzVar.f26871t1 != null) {
                    long j3 = wyVar.getSpan().documentId;
                    TLRPC.Document document = wyVar.getSpan().document;
                    ay ayVar = wyVar.e;
                    if (ayVar != null && ayVar.f22729i) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (document == null) {
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            ay ayVar2 = (ay) arrayList.get(i11);
                            int i12 = 0;
                            while (true) {
                                ArrayList arrayList2 = ayVar2.f22726c;
                                if (arrayList2 != null && i12 < arrayList2.size()) {
                                    if (((TLRPC.Document) ayVar2.f22726c.get(i12)).f18358id == j3) {
                                        document = (TLRPC.Document) ayVar2.f22726c.get(i12);
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
                    if (!MessageObject.isFreeEmoji(document) && !UserConfig.getInstance(i10).isPremium() && (((oyVar = nzVar.f26871t1) == null || !oyVar.g()) && !nzVar.U0 && !z10)) {
                        nzVar.M(false);
                        if (m2Var != null) {
                            ycVar = yc.a0(m2Var);
                        } else {
                            ycVar = new yc(nzVar.f26862r, nzVar.Z1);
                        }
                        if (!nzVar.f26835h2 && m2Var != null) {
                            ycVar.J(R.raw.saved_messages, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint2)), LocaleController.getString(R.string.Open), new gw(nzVar, 4)).j();
                        } else {
                            ycVar.q(document, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint)), LocaleController.getString(R.string.PremiumMore), new gw(nzVar, 3)).j();
                        }
                        nzVar.f26835h2 = !nzVar.f26835h2;
                        return;
                    }
                    nzVar.E2 = SystemClock.elapsedRealtime();
                    nzVar.M(true);
                    nzVar.h("animated_" + j3);
                    nzVar.f26871t1.x(j3, document, str5, wyVar.f30088c);
                    return;
                }
                return;
            }
            nzVar.E2 = SystemClock.elapsedRealtime();
            nzVar.M(true);
            if (str != null) {
                str2 = str;
            } else {
                str2 = (String) wyVar.getTag();
            }
            new SpannableStringBuilder().append((CharSequence) str2);
            if (str == null) {
                if (!wyVar.f30088c && (str3 = Emoji.emojiColor.get(str2)) != null) {
                    str2 = g(str2, str3);
                }
                nzVar.h(str2);
                oy oyVar2 = nzVar.f26871t1;
                if (oyVar2 != null) {
                    oyVar2.l(Emoji.fixEmoji(str2));
                    return;
                }
                return;
            }
            oy oyVar3 = nzVar.f26871t1;
            if (oyVar3 != null) {
                oyVar3.l(Emoji.fixEmoji(str));
            }
        }
    }

    public static void e(nz nzVar, int i10, int i11) {
        s4.c1 K;
        int[] iArr = nzVar.Q0;
        if (i10 == 1) {
            nzVar.n(i11, nzVar.P);
            return;
        }
        oy oyVar = nzVar.f26871t1;
        if ((oyVar == null || !oyVar.z()) && !nzVar.J0) {
            zl0 x10 = nzVar.x(i10);
            if (i11 > 0 && x10 != null && x10.getVisibility() == 0 && (K = x10.K(0)) != null && K.f43068a.getTop() + nzVar.f26814b1 >= x10.getPaddingTop()) {
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
                nzVar.Y();
            } else {
                nzVar.y(i10).setTranslationY(Math.max(-AndroidUtilities.dp(48.0f), iArr[i10]));
            }
        }
    }

    public static void f(nz nzVar, boolean z10) {
        int N0;
        ty tyVar = nzVar.f26836i0;
        sw swVar = nzVar.f26853o0;
        pw pwVar = nzVar.f26833h0;
        if (pwVar != null && (pwVar.getAdapter() instanceof sy)) {
            sy syVar = (sy) pwVar.getAdapter();
            if (!syVar.f28366s && syVar.h == 0 && !syVar.f28368x.isEmpty() && (N0 = tyVar.N0()) != -1 && N0 > tyVar.B() - 5) {
                String str = syVar.f28367w;
                String str2 = syVar.f28365r;
                boolean z11 = syVar.v;
                syVar.F(str, str2, true, z11, z11);
            }
        }
        oy oyVar = nzVar.f26871t1;
        if (oyVar != null && oyVar.z()) {
            boolean z12 = false;
            s4.c1 K = pwVar.K(0);
            if (K == null) {
                az.a(swVar, true, !z10);
                return;
            }
            if (K.f43068a.getTop() < pwVar.getPaddingTop()) {
                z12 = true;
            }
            az.a(swVar, z12, !z10);
        } else if (swVar != null && pwVar != null) {
            swVar.f22734a.a(true, !z10);
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
        zw zwVar = this.G0;
        if (zwVar != null) {
            zwVar.b();
        }
        sw swVar = this.f26853o0;
        if (swVar != null) {
            swVar.b();
        }
        mw mwVar = this.V;
        if (mwVar != null) {
            mwVar.b();
        }
    }

    public final void B(boolean z10, boolean z11) {
        zy zyVar;
        boolean z12;
        if (this.A1 != 0 && this.f26881w1) {
            this.A1 = 0;
        }
        if (this.A1 == 0 && this.f26877v1) {
            this.A1 = 1;
        }
        int i10 = this.A1;
        cx cxVar = this.h;
        if (i10 != 0 && !z10 && this.e.size() != 1) {
            int i11 = this.A1;
            if (i11 == 1) {
                L(false, false);
                if (!this.f26873u0 && !this.f26876v0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                Q(z12, false);
                if (cxVar.getCurrentItem() != 2) {
                    cxVar.x(2, false);
                }
                ax axVar = this.B0;
                if (axVar != null) {
                    this.S0 = true;
                    int i12 = this.G1;
                    if (i12 >= 0) {
                        axVar.m(i12);
                    } else {
                        int i13 = this.F1;
                        if (i13 >= 0) {
                            axVar.m(i13);
                        } else {
                            axVar.m(this.E1);
                        }
                    }
                    this.S0 = false;
                    this.E0.h1(0, 0);
                }
            } else if (i11 == 2) {
                L(false, false);
                Q(false, false);
                if (cxVar.getCurrentItem() != 1) {
                    cxVar.x(1, false);
                }
                ux uxVar = this.f26856p0;
                if (uxVar != null) {
                    uxVar.m(0);
                }
                sw swVar = this.f26853o0;
                if (swVar != null && (zyVar = swVar.f22739r) != null) {
                    zyVar.H1(null);
                }
            }
        } else {
            L(true, false);
            Q(false, false);
            if (cxVar.getCurrentItem() != 0) {
                cxVar.x(0, !z10);
            }
            if (z11) {
                AndroidUtilities.runOnUIThread(new gw(this, 5), 350L);
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
            float f11 = 1.0f - this.f26809a.e;
            zw zwVar = this.G0;
            zwVar.setAlpha(f11);
            if (f11 > 0.0f) {
                i13 = 0;
            } else {
                i13 = 4;
            }
            zwVar.setVisibility(i13);
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
            this.f26884x0.invalidate();
        } else if (i10 == 1) {
            l(false);
            float f13 = 1.0f - this.f26812b.e;
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
        ez ezVar = this.f26888y0;
        if (ezVar != null) {
            ezVar.l();
        }
        iz izVar = this.f26891z0;
        if (izVar != null) {
            izVar.l();
        }
        if (org.telegram.ui.nt.q().E) {
            org.telegram.ui.nt.q().n();
        }
        org.telegram.ui.nt.q().u();
    }

    public final void F(int i10) {
        oy oyVar = this.f26871t1;
        if ((oyVar != null && oyVar.z()) || i10 == 0) {
            return;
        }
        HorizontalScrollView y3 = y(i10);
        this.Q0[i10] = 0;
        y3.setTranslationY(0);
    }

    public final void G(int i10, int i11) {
        nx nxVar = this.Q;
        View m10 = nxVar.m(i10);
        int L0 = nxVar.L0();
        int i12 = 1;
        if ((m10 == null && Math.abs(i10 - L0) > nxVar.J * 9.0f) || !SharedConfig.animationsEnabled()) {
            if (nxVar.L0() < i10) {
                i12 = 0;
            }
            cl0 cl0Var = this.f26813b0;
            cl0Var.f23356b = i12;
            cl0Var.d(i10, i11, false, false);
            return;
        }
        this.J0 = true;
        ci.m1 m1Var = new ci.m1(this, this.P.getContext(), 1);
        m1Var.f43218a = i10;
        m1Var.f13109p = i11;
        nxVar.w0(m1Var);
    }

    public final void H(int i10, int i11) {
        ww wwVar = this.E0;
        View m10 = wwVar.m(i10);
        int L0 = wwVar.L0();
        int i12 = 1;
        if (m10 == null && Math.abs(i10 - L0) > 40) {
            if (wwVar.L0() < i10) {
                i12 = 0;
            }
            cl0 cl0Var = this.f26810a0;
            cl0Var.f23356b = i12;
            cl0Var.d(i10, i11, false, false);
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
            if (((jz) arrayList2.get(i10)).f25588a == 0 && z10) {
                arrayList.add((jz) arrayList2.get(i10));
            }
            if (((jz) arrayList2.get(i10)).f25588a == 1 && z12) {
                arrayList.add((jz) arrayList2.get(i10));
            }
            if (((jz) arrayList2.get(i10)).f25588a == 2 && z11) {
                arrayList.add((jz) arrayList2.get(i10));
            }
            i10++;
        }
        rd0 rd0Var = this.f26879w;
        if (rd0Var != null) {
            if (arrayList.size() > 1) {
                z14 = true;
            }
            AndroidUtilities.updateViewVisibilityAnimated(rd0Var, z14, 1.0f, z13);
        }
        cx cxVar = this.h;
        if (cxVar != null) {
            cxVar.setAdapter(null);
            cxVar.setAdapter(this.L0);
            if (rd0Var != null) {
                rd0Var.setViewPager(cxVar);
            }
        }
    }

    public final void J(final nh.b bVar, final TLObject tLObject, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final boolean z10, boolean z11) {
        String formatPluralString;
        iz izVar;
        ny nyVar;
        if (stickerSet != null) {
            if (!z10 || (nyVar = this.S) == null || nyVar.d == stickerSet.f18379id) {
                if (!z10 && (izVar = this.f26891z0) != null && izVar.d != stickerSet.f18379id) {
                    return;
                }
                final boolean isStickerPackInstalled = MediaDataController.getInstance(this.f26818c1).isStickerPackInstalled(stickerSet.f18379id);
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
                bVar.f15474h0.a(!isStickerPackInstalled, z11);
                bVar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        int i10;
                        nz nzVar = nz.this;
                        MediaDataController mediaDataController = MediaDataController.getInstance(nzVar.f26818c1);
                        Context context = nzVar.getContext();
                        if (isStickerPackInstalled) {
                            i10 = 0;
                        } else {
                            i10 = 2;
                        }
                        org.telegram.ui.ActionBar.m2 m2Var = nzVar.Y1;
                        FrameLayout frameLayout = nzVar.f26866s;
                        nh.b bVar2 = bVar;
                        TLObject tLObject2 = tLObject;
                        TLRPC.StickerSet stickerSet2 = stickerSet;
                        TLRPC.Document document2 = document;
                        boolean z12 = z10;
                        mediaDataController.toggleStickerSet(context, tLObject2, document2, i10, m2Var, frameLayout, false, true, new i2.c1(nzVar, bVar2, tLObject2, stickerSet2, document2, z12, 9), false);
                        nzVar.J(bVar2, tLObject2, stickerSet2, document2, z12, true);
                    }
                });
            }
        }
    }

    public final void K(long j3, boolean z10, boolean z11) {
        int i10;
        View childAt;
        float f7;
        rd0 rd0Var = this.f26879w;
        if (rd0Var != null) {
            this.f26877v1 = z10;
            this.f26881w1 = z11;
            if (!z11 && !z10) {
                this.f26874u1 = 0L;
            } else {
                this.f26874u1 = j3;
            }
            if (z11) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            LinearLayout linearLayout = rd0Var.d;
            if (i10 >= linearLayout.getChildCount()) {
                childAt = null;
            } else {
                childAt = linearLayout.getChildAt(i10);
            }
            if (childAt != null) {
                if (this.f26874u1 != 0) {
                    f7 = 0.15f;
                } else {
                    f7 = 1.0f;
                }
                childAt.setAlpha(f7);
                cx cxVar = this.h;
                if (z11) {
                    if (this.f26874u1 != 0 && cxVar.getCurrentItem() != 0) {
                        L(true, true);
                        Q(false, true);
                        cxVar.x(0, false);
                    }
                } else if (this.f26874u1 != 0 && cxVar.getCurrentItem() != 1) {
                    L(false, true);
                    Q(false, true);
                    cxVar.x(1, false);
                }
            }
        }
    }

    public final void L(boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        float f12;
        dx dxVar = this.f26883x;
        if (!z10 || dxVar.getTag() != null) {
            if ((!z10 && dxVar.getTag() != null) || this.f26852n2) {
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
            dxVar.setTag(num);
            int i10 = 0;
            float f13 = 0.0f;
            if (z11) {
                if (z10) {
                    dxVar.setVisibility(0);
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.F = animatorSet2;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(dxVar, View.ALPHA, f11);
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(dxVar, View.SCALE_X, f12);
                if (z10) {
                    f13 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(dxVar, View.SCALE_Y, f13));
                this.F.setDuration(200L);
                this.F.setInterpolator(tr.f28637g);
                this.F.addListener(new jx(this, z10, 0));
                this.F.start();
                return;
            }
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            dxVar.setAlpha(f7);
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            dxVar.setScaleX(f10);
            if (z10) {
                f13 = 1.0f;
            }
            dxVar.setScaleY(f13);
            if (!z10) {
                i10 = 4;
            }
            dxVar.setVisibility(i10);
        }
    }

    public final void M(boolean z10) {
        Integer num;
        this.H = 0.0f;
        oy oyVar = this.f26871t1;
        if (oyVar != null && oyVar.z()) {
            z10 = false;
        }
        FrameLayout frameLayout = this.f26849n;
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
                this.W.setInterpolator(tr.f28637g);
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
        TLRPC.Chat chat = MessagesController.getInstance(this.f26818c1).getChat(Long.valueOf(this.f26874u1));
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
            this.J2.setInterpolator(tr.h);
            this.J2.start();
        }
    }

    public final void Q(boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        float f12;
        ImageView imageView = this.f26887y;
        if (imageView != null && !this.f26855o2) {
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
                        this.G.setInterpolator(tr.f28637g);
                        this.G.addListener(new jx(this, z10, 1));
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
            float f11 = this.f26861q2;
            FrameLayout frameLayout = this.f26849n;
            if (f11 >= 0.0f) {
                f10 += getMeasuredHeight() - this.f26861q2;
            } else if (frameLayout.getTop() - f10 < 0.0f || !this.f26882w2) {
                f10 = 0.0f;
            }
            float lerp = (-f10) + AndroidUtilities.lerp(AndroidUtilities.dp(50.0f), -this.f26858p2, this.F2.e);
            frameLayout.setTranslationY(lerp);
            if (this.f26820d0) {
                this.f26862r.setTranslationY(lerp);
            }
        }
    }

    public final void S() {
        az azVar;
        boolean z10;
        int z11;
        int z12;
        int z13;
        int z14;
        int z15;
        int z16;
        int z17;
        int z18;
        bw bwVar;
        int z19;
        int z20;
        int z21;
        int z22;
        int z23;
        int z24;
        int z25;
        int z26;
        int z27;
        boolean z28 = this.f26873u0;
        View view = this.v;
        if (!z28) {
            setBackground(null);
            view.setBackground(null);
        } else if (!AndroidUtilities.isInMultiwindow && !this.N1) {
            int i10 = org.telegram.ui.ActionBar.h6.He;
            setBackgroundColor(z(i10));
            if (this.f26820d0) {
                view.setBackgroundColor(z(i10));
            }
        } else {
            Drawable background = getBackground();
            if (background != null) {
                background.setColorFilter(new PorterDuffColorFilter(z(org.telegram.ui.ActionBar.h6.He), PorterDuff.Mode.MULTIPLY));
            }
        }
        rx rxVar = this.I;
        if (rxVar != null) {
            if (this.f26873u0) {
                rxVar.setBackgroundColor(z(org.telegram.ui.ActionBar.h6.He));
                this.O.setBackgroundColor(z(org.telegram.ui.ActionBar.h6.Ke));
            } else {
                rxVar.setBackground(null);
            }
        }
        av avVar = this.B1;
        if (avVar != null) {
            avVar.f22720c.a();
        }
        int i11 = 0;
        while (true) {
            azVar = this.V;
            z10 = this.f26838i2;
            if (i11 >= 3) {
                break;
            }
            if (i11 == 0) {
                azVar = this.G0;
            } else if (i11 != 1) {
                azVar = this.f26853o0;
            }
            if (azVar != null) {
                lq lqVar = azVar.d;
                FrameLayout frameLayout = azVar.f22738n;
                View view2 = azVar.f22737f;
                if (this.f26873u0) {
                    view2.setBackgroundColor(z(org.telegram.ui.ActionBar.h6.He));
                } else {
                    view2.setBackground(null);
                }
                azVar.e.setBackgroundColor(z(org.telegram.ui.ActionBar.h6.Ke));
                nn0 nn0Var = azVar.f22736c;
                if (z10) {
                    z24 = v(0.4f);
                } else {
                    z24 = z(org.telegram.ui.ActionBar.h6.Je);
                }
                nn0Var.a(z24);
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
                lqVar.setHintTextColor(z26);
                if (z10) {
                    z27 = v(0.8f);
                } else {
                    z27 = z(org.telegram.ui.ActionBar.h6.G6);
                }
                lqVar.setTextColor(z27);
            }
            i11++;
        }
        Paint paint = this.f26868s1;
        if (paint != null) {
            paint.setColor(z(org.telegram.ui.ActionBar.h6.f19028af));
        }
        zx zxVar = this.P;
        if (zxVar != null) {
            zxVar.setGlowColor(z(org.telegram.ui.ActionBar.h6.He));
        }
        vw vwVar = this.D0;
        if (vwVar != null) {
            vwVar.setGlowColor(z(org.telegram.ui.ActionBar.h6.He));
        }
        ax axVar = this.B0;
        if (axVar != null) {
            axVar.setIndicatorColor(z(org.telegram.ui.ActionBar.h6.Qe));
            axVar.setUnderlineColor(z(org.telegram.ui.ActionBar.h6.Ke));
            if (this.f26873u0) {
                axVar.setBackgroundColor(z(org.telegram.ui.ActionBar.h6.He));
            } else {
                axVar.setBackground(null);
            }
        }
        ux uxVar = this.f26856p0;
        if (uxVar != null) {
            uxVar.setIndicatorColor(z(org.telegram.ui.ActionBar.h6.Qe));
            uxVar.setUnderlineColor(z(org.telegram.ui.ActionBar.h6.Ke));
            if (this.f26873u0) {
                uxVar.setBackgroundColor(z(org.telegram.ui.ActionBar.h6.He));
            } else {
                uxVar.setBackground(null);
            }
        }
        dx dxVar = this.f26883x;
        if (dxVar != null) {
            if (z10) {
                z23 = v(0.6f);
            } else {
                z23 = z(org.telegram.ui.ActionBar.h6.Re);
            }
            dxVar.setColorFilter(new PorterDuffColorFilter(z23, PorterDuff.Mode.MULTIPLY));
            if (azVar == null) {
                Drawable background3 = dxVar.getBackground();
                int i12 = org.telegram.ui.ActionBar.h6.He;
                org.telegram.ui.ActionBar.h6.B1(background3, z(i12), false);
                org.telegram.ui.ActionBar.h6.B1(dxVar.getBackground(), z(i12), true);
            }
        }
        ImageView imageView = this.f26887y;
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
            ((ShapeDrawable) p4Var.getBackground()).getPaint().setColor(z(org.telegram.ui.ActionBar.h6.f19323qf));
            p4Var.setTextColor(z(org.telegram.ui.ActionBar.h6.f19304pf));
        }
        sy syVar = this.f26839j0;
        if (syVar != null) {
            uy uyVar = syVar.e;
            ImageView imageView3 = uyVar.f28942a;
            int i13 = org.telegram.ui.ActionBar.h6.Le;
            imageView3.setColorFilter(new PorterDuffColorFilter(z(i13), PorterDuff.Mode.MULTIPLY));
            uyVar.f28943b.setTextColor(z(i13));
            uyVar.f28944c.setProgressColor(z(org.telegram.ui.ActionBar.h6.f19147h6));
        }
        this.f26825e2 = new PorterDuffColorFilter(z(org.telegram.ui.ActionBar.h6.Oh), PorterDuff.Mode.SRC_IN);
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
        if (rxVar != null && (bwVar = rxVar.f24372y) != null) {
            bwVar.d();
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
        org.telegram.ui.ActionBar.s5 s5Var2 = this.f26815b2;
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
        zx zxVar = this.P;
        if (zxVar != null) {
            for (int i10 = 0; i10 < zxVar.getChildCount(); i10++) {
                View childAt = zxVar.getChildAt(i10);
                if (childAt instanceof fy) {
                    ((fy) childAt).a(true);
                }
            }
        }
    }

    public final void U(int i10) {
        int i11;
        if (!this.f26827f0) {
            int i12 = -1;
            if (i10 != -1) {
                int size = getRecentEmoji().size() + (this.f26820d0 ? 1 : 0);
                wx wxVar = this.R;
                int i13 = wxVar.f30075c;
                ArrayList arrayList = wxVar.f30081x;
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
                        ArrayList<ay> emojipacks = getEmojipacks();
                        int size2 = arrayList.size() - 1;
                        while (true) {
                            if (size2 < 0) {
                                break;
                            } else if (((Integer) arrayList.get(size2)).intValue() <= i10) {
                                ay ayVar = (ay) this.f26860q1.get(size2);
                                while (i14 < emojipacks.size()) {
                                    long j3 = emojipacks.get(i14).f22725b.f18379id;
                                    long j10 = ayVar.f22725b.f18379id;
                                    if (j3 == j10 && (!ayVar.f22728g || (!ayVar.f22727f && !this.f26857p1.contains(Long.valueOf(j10))))) {
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
        zy zyVar;
        int i11;
        boolean z12;
        boolean z13;
        ux uxVar = this.f26856p0;
        int currentPosition = uxVar.getCurrentPosition();
        int i12 = this.f26863r0;
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
        boolean isEmpty = this.f26837i1.isEmpty();
        uxVar.d(false);
        this.f26863r0 = -2;
        this.f26867s0 = -2;
        this.f26870t0 = -2;
        Drawable[] drawableArr = this.Z0;
        if (!isEmpty) {
            this.f26863r0 = 0;
            uxVar.b(0, drawableArr[0]).setContentDescription(LocaleController.getString(R.string.RecentStickers));
            i10 = 1;
        } else {
            i10 = 0;
        }
        this.f26867s0 = i10;
        uxVar.b(1, drawableArr[1]).setContentDescription(LocaleController.getString(R.string.FeaturedGifs));
        this.f26870t0 = i10 + 1;
        AndroidUtilities.dp(13.0f);
        AndroidUtilities.dp(11.0f);
        int i13 = this.f26818c1;
        ArrayList<String> arrayList = MessagesController.getInstance(i13).gifSearchEmojies;
        int size = arrayList.size();
        int i14 = 0;
        while (i14 < size) {
            String str = arrayList.get(i14);
            Emoji.EmojiDrawable emojiDrawable = Emoji.getEmojiDrawable(str);
            if (emojiDrawable != null) {
                TLRPC.Document emojiAnimatedSticker = MediaDataController.getInstance(i13).getEmojiAnimatedSticker(str);
                String h = hg.c.h(i14 + 3, "tab");
                int i15 = uxVar.f30381x;
                uxVar.f30381x = i15 + 1;
                qx0 qx0Var = (qx0) uxVar.f30371n.get(h);
                if (qx0Var != null) {
                    uxVar.g(h, qx0Var, i15);
                    i11 = currentPosition;
                    z12 = z11;
                } else {
                    i11 = currentPosition;
                    z12 = z11;
                    qx0Var = new qx0(uxVar.getContext(), 2);
                    qx0Var.setFocusable(true);
                    qx0Var.setOnClickListener(new qm0(uxVar, 2));
                    qx0Var.setExpanded(uxVar.f30364f0);
                    qx0Var.a(uxVar.f30367i0);
                    uxVar.e.addView(qx0Var, i15);
                }
                qx0Var.d = false;
                qx0Var.setTag(R.id.index_tag, Integer.valueOf(i15));
                qx0Var.setTag(R.id.parent_tag, emojiDrawable);
                qx0Var.setTag(R.id.object_tag, emojiAnimatedSticker);
                if (i15 == uxVar.f30382y) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                qx0Var.setSelected(z13);
                uxVar.h.put(h, qx0Var);
                qx0Var.setContentDescription(str);
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
        uxVar.h();
        uxVar.q();
        if (z10 && isEmpty) {
            uxVar.m(this.f26867s0);
            sw swVar = this.f26853o0;
            if (swVar != null && (zyVar = swVar.f22739r) != null) {
                zyVar.H1(null);
                return;
            }
            return;
        }
        WeakHashMap weakHashMap = r0.i0.f42233a;
        if (uxVar.isLaidOut()) {
            if (!isEmpty && !z14) {
                uxVar.k(i16 + 1, 0);
            } else if (isEmpty && z14) {
                uxVar.k(i16 - 1, 0);
            }
        }
    }

    public final void W() {
        sy syVar;
        int size = this.f26837i1.size();
        long calcDocumentsHash = MediaDataController.calcDocumentsHash(this.f26837i1, Integer.MAX_VALUE);
        ArrayList<TLRPC.Document> recentGifs = MediaDataController.getInstance(this.f26818c1).getRecentGifs();
        this.f26837i1 = recentGifs;
        long calcDocumentsHash2 = MediaDataController.calcDocumentsHash(recentGifs, Integer.MAX_VALUE);
        if ((this.f26856p0 != null && size == 0 && !this.f26837i1.isEmpty()) || (size != 0 && this.f26837i1.isEmpty())) {
            V();
        }
        if ((size != this.f26837i1.size() || calcDocumentsHash != calcDocumentsHash2) && (syVar = this.f26850n0) != null) {
            syVar.l();
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
        ax axVar = this.B0;
        if (axVar != null) {
            ub1 ub1Var = axVar.e;
            if (axVar.f30378s != null) {
                return;
            }
            this.F1 = -2;
            this.G1 = -2;
            this.H1 = -2;
            this.I1 = -2;
            this.f26823e0 = false;
            this.E1 = 0;
            int currentPosition = axVar.getCurrentPosition();
            boolean z16 = true;
            if (getParent() != null && getVisibility() == 0 && (this.f26889y1.size() != 0 || this.f26892z1.size() != 0)) {
                z11 = true;
            } else {
                z11 = false;
            }
            axVar.d(z11);
            int i11 = this.f26818c1;
            MediaDataController mediaDataController = MediaDataController.getInstance(i11);
            SharedPreferences emojiSettings = MessagesController.getEmojiSettings(i11);
            ArrayList arrayList3 = this.f26847m1;
            arrayList3.clear();
            ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = mediaDataController.getFeaturedStickerSets();
            int size = featuredStickerSets.size();
            for (int i12 = 0; i12 < size; i12++) {
                TLRPC.StickerSetCovered stickerSetCovered = featuredStickerSets.get(i12);
                if (!mediaDataController.isStickerPackInstalled(stickerSetCovered.set.f18379id)) {
                    arrayList3.add(stickerSetCovered);
                }
            }
            lz lzVar = this.F0;
            if (lzVar != null) {
                lzVar.l();
            }
            boolean isEmpty = featuredStickerSets.isEmpty();
            long j3 = 0;
            Drawable[] drawableArr = this.Y0;
            if (!isEmpty && (arrayList3.isEmpty() || emojiSettings.getLong("featured_hidden", 0L) == featuredStickerSets.get(0).set.f18379id)) {
                if (mediaDataController.getUnreadStickerSets().isEmpty()) {
                    i10 = 2;
                } else {
                    i10 = 3;
                }
                qx0 c10 = axVar.c(i10, drawableArr[i10]);
                c10.h.setText(LocaleController.getString(R.string.FeaturedStickersShort));
                c10.setContentDescription(LocaleController.getString(R.string.FeaturedStickers));
                int i13 = this.E1;
                this.H1 = i13;
                this.E1 = i13 + 1;
            }
            if (!this.f26843k1.isEmpty()) {
                int i14 = this.E1;
                this.G1 = i14;
                this.E1 = i14 + 1;
                qx0 c11 = axVar.c(1, drawableArr[1]);
                c11.h.setText(LocaleController.getString(R.string.FavoriteStickersShort));
                c11.setContentDescription(LocaleController.getString(R.string.FavoriteStickers));
            }
            if (!this.f26840j1.isEmpty()) {
                int i15 = this.E1;
                this.F1 = i15;
                this.E1 = i15 + 1;
                qx0 c12 = axVar.c(0, drawableArr[0]);
                c12.h.setText(LocaleController.getString(R.string.RecentStickersShort));
                c12.setContentDescription(LocaleController.getString(R.string.RecentStickers));
            }
            ArrayList arrayList4 = this.f26821d1;
            arrayList4.clear();
            org.telegram.ui.ActionBar.d6 d6Var = null;
            this.f26834h1 = null;
            this.f26828f1 = -1;
            this.f26824e1 = -10;
            if (this.G2 == null || z10) {
                this.G2 = new ArrayList(mediaDataController.getStickerSets(0));
            }
            ArrayList<TLRPC.TL_messages_stickerSet> arrayList5 = this.G2;
            int i16 = 0;
            while (true) {
                TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.f26885x1;
                if (i16 >= stickerSetCoveredArr.length) {
                    break;
                }
                TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCoveredArr[i16];
                long j10 = j3;
                if (stickerSetCovered2 != null) {
                    TLRPC.TL_messages_stickerSet stickerSetById = mediaDataController.getStickerSetById(stickerSetCovered2.set.f18379id);
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
                long j12 = MessagesController.getEmojiSettings(i11).getLong("group_hide_stickers_" + this.J1.f18353id, -1L);
                TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(this.J1.f18353id));
                if (chat != null && this.J1.stickerset != null && ChatObject.hasAdminRights(chat)) {
                    TLRPC.StickerSet stickerSet3 = this.J1.stickerset;
                    if (stickerSet3 != null) {
                        if (j12 == stickerSet3.f18379id) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        this.f26831g1 = z15;
                    }
                } else {
                    if (j12 != -1) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    this.f26831g1 = z14;
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
                        if (this.f26831g1) {
                            this.f26824e1 = arrayList4.size();
                            arrayList4.add(tL_messages_stickerSet3);
                        } else {
                            this.f26824e1 = 0;
                            arrayList4.add(0, tL_messages_stickerSet3);
                        }
                        if (!this.J1.can_set_stickers) {
                            tL_messages_stickerSet3 = null;
                        }
                        this.f26834h1 = tL_messages_stickerSet3;
                    }
                } else if (chatFull.can_set_stickers) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = new TLRPC.TL_messages_stickerSet();
                    if (this.f26831g1) {
                        this.f26824e1 = arrayList4.size();
                        arrayList4.add(tL_messages_stickerSet4);
                    } else {
                        this.f26824e1 = 0;
                        arrayList4.add(0, tL_messages_stickerSet4);
                    }
                }
            }
            int i18 = 0;
            while (i18 < arrayList4.size()) {
                if (i18 == this.f26824e1) {
                    TLRPC.Chat chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(this.J1.f18353id));
                    if (chat2 == null) {
                        arrayList4.remove(0);
                        i18--;
                    } else {
                        this.f26823e0 = z16;
                        String str = "chat" + chat2.f18352id;
                        int i19 = axVar.f30381x;
                        axVar.f30381x = i19 + 1;
                        qx0 qx0Var = (qx0) axVar.f30371n.get(str);
                        if (qx0Var != null) {
                            axVar.g(str, qx0Var, i19);
                        } else {
                            qx0Var = new qx0(axVar.getContext(), 0);
                            qx0Var.setFocusable(z16);
                            qx0Var.setOnClickListener(new qm0(axVar, 0));
                            ub1Var.addView(qx0Var, i19);
                            qx0Var.f27750w = z16;
                            h9 h9Var = new h9(d6Var);
                            h9Var.u(AndroidUtilities.dp(14.0f));
                            h9Var.k(UserConfig.selectedAccount, chat2);
                            int i20 = axVar.f30355a;
                            w9 w9Var = qx0Var.e;
                            w9Var.setLayerNum(i20);
                            w9Var.e(chat2, h9Var);
                            w9Var.setAspectFit(z16);
                            qx0Var.setExpanded(axVar.f30364f0);
                            qx0Var.a(axVar.f30367i0);
                            qx0Var.h.setText(chat2.title);
                        }
                        qx0Var.d = z16;
                        qx0Var.setTag(R.id.index_tag, Integer.valueOf(i19));
                        if (i19 == axVar.f30382y) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        qx0Var.setSelected(z13);
                        axVar.h.put(str, qx0Var);
                    }
                } else {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet5 = (TLRPC.TL_messages_stickerSet) arrayList4.get(i18);
                    TLRPC.StickerSet stickerSet5 = tL_messages_stickerSet5.set;
                    if (stickerSet5 != null && stickerSet5.thumb_document_id != j11) {
                        for (int i21 = 0; i21 < tL_messages_stickerSet5.documents.size(); i21++) {
                            document = tL_messages_stickerSet5.documents.get(i21);
                            if (document != null && tL_messages_stickerSet5.set.thumb_document_id == document.f18358id) {
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
                    String str2 = "set" + tL_messages_stickerSet5.set.f18379id;
                    int i22 = axVar.f30381x;
                    axVar.f30381x = i22 + 1;
                    qx0 qx0Var2 = (qx0) axVar.f30371n.get(str2);
                    if (qx0Var2 != null) {
                        axVar.g(str2, qx0Var2, i22);
                    } else {
                        qx0Var2 = new qx0(axVar.getContext(), 0);
                        qx0Var2.setFocusable(z16);
                        qx0Var2.setOnClickListener(new qm0(axVar, 1));
                        qx0Var2.setExpanded(axVar.f30364f0);
                        qx0Var2.a(axVar.f30367i0);
                        ub1Var.addView(qx0Var2, i22);
                    }
                    qx0Var2.e.setLayerNum(axVar.f30355a);
                    qx0Var2.d = false;
                    qx0Var2.setTag(closestPhotoSizeWithSize);
                    qx0Var2.setTag(R.id.index_tag, Integer.valueOf(i22));
                    qx0Var2.setTag(R.id.parent_tag, tL_messages_stickerSet5);
                    qx0Var2.setTag(R.id.object_tag, document);
                    if (i22 == axVar.f30382y) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    qx0Var2.setSelected(z12);
                    axVar.h.put(str2, qx0Var2);
                    qx0Var2.setContentDescription(tL_messages_stickerSet5.set.title + ", " + LocaleController.getString(R.string.AccDescrStickerSet));
                }
                i18++;
                z16 = true;
                d6Var = null;
            }
            axVar.h();
            axVar.q();
            if (currentPosition != 0) {
                axVar.k(currentPosition, currentPosition);
            }
            o();
        }
    }

    public final void Y() {
        boolean z10;
        int i10;
        bx bxVar = this.C0;
        ax axVar = this.B0;
        if (axVar != null && bxVar == null && this.f26871t1 != null) {
            axVar.setTranslationY(this.f26871t1.p() * (-AndroidUtilities.dp(50.0f)));
        }
        if (bxVar == null) {
            return;
        }
        if (getVisibility() == 0 && this.K0 && this.f26871t1.p() != 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        bxVar.setVisibility(i10);
        if (z10) {
            Rect rect = this.f26886x2;
            rect.setEmpty();
            this.h.getChildVisibleRect(this.f26884x0, rect, null);
            float p5 = this.f26871t1.p() * AndroidUtilities.dp(50.0f);
            int i11 = rect.left;
            if (i11 != 0 || p5 != 0.0f) {
                this.X1 = false;
            }
            bxVar.setTranslationX(i11);
            float translationY = (((getTranslationY() + getTop()) - bxVar.getTop()) - axVar.getExpandedOffset()) - p5;
            if (bxVar.getTranslationY() != translationY) {
                bxVar.setTranslationY(translationY);
                bxVar.invalidate();
            }
        }
        if (this.X1 && z10 && this.P0) {
            axVar.i(this.W1, true);
            return;
        }
        this.X1 = false;
        axVar.i(this.W1, false);
    }

    public final void Z() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        org.telegram.ui.Cells.s3 s3Var;
        LongSparseArray longSparseArray = this.f26892z1;
        LongSparseArray longSparseArray2 = this.f26889y1;
        int i10 = this.f26818c1;
        vw vwVar = this.D0;
        if (vwVar != null) {
            try {
                int childCount = vwVar.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = vwVar.getChildAt(i11);
                    if ((childAt instanceof org.telegram.ui.Cells.s3) && ((jl0) vwVar.T(childAt)) != null) {
                        org.telegram.ui.Cells.s3 s3Var2 = (org.telegram.ui.Cells.s3) childAt;
                        ArrayList<Long> unreadStickerSets = MediaDataController.getInstance(i10).getUnreadStickerSets();
                        TLRPC.StickerSetCovered stickerSet = s3Var2.getStickerSet();
                        if (unreadStickerSets != null && unreadStickerSets.contains(Long.valueOf(stickerSet.set.f18379id))) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        int i12 = 0;
                        while (true) {
                            TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.f26885x1;
                            if (i12 < stickerSetCoveredArr.length) {
                                TLRPC.StickerSetCovered stickerSetCovered = stickerSetCoveredArr[i12];
                                if (stickerSetCovered != null) {
                                    s3Var = s3Var2;
                                    if (stickerSetCovered.set.f18379id == stickerSet.set.f18379id) {
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
                            MediaDataController.getInstance(i10).markFeaturedStickersByIdAsRead(false, stickerSet.set.f18379id);
                        }
                        if (longSparseArray2.indexOfKey(stickerSet.set.f18379id) >= 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (longSparseArray.indexOfKey(stickerSet.set.f18379id) >= 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z12 || z13) {
                            if (z12 && s3Var2.f21076r) {
                                longSparseArray2.remove(stickerSet.set.f18379id);
                                z12 = false;
                            } else if (z13 && !s3Var2.f21076r) {
                                longSparseArray.remove(stickerSet.set.f18379id);
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
        this.f26861q2 = f7;
        R();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        Utilities.Callback callback;
        TLRPC.StickerSet stickerSet;
        int i12 = NotificationCenter.stickersDidLoad;
        wx wxVar = this.R;
        gw gwVar = this.L2;
        if (i10 == i12) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (this.f26888y0 != null) {
                    X(((Boolean) objArr[1]).booleanValue());
                    Z();
                    E();
                    o();
                }
            } else if (((Integer) objArr[0]).intValue() == 5) {
                if (((Boolean) objArr[1]).booleanValue()) {
                    AndroidUtilities.cancelRunOnUIThread(gwVar);
                    AndroidUtilities.runOnUIThread(gwVar, 100L);
                    return;
                }
                wxVar.F(false);
            }
        } else if (i10 == NotificationCenter.groupPackUpdated) {
            long longValue = ((Long) objArr[0]).longValue();
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            TLRPC.ChatFull chatFull = this.J1;
            if (chatFull != null && chatFull.f18353id == longValue && booleanValue) {
                wxVar.F(true);
            }
        } else if (i10 == NotificationCenter.recentDocumentsDidLoad) {
            boolean booleanValue2 = ((Boolean) objArr[0]).booleanValue();
            int intValue = ((Integer) objArr[1]).intValue();
            if (booleanValue2 || intValue == 0 || intValue == 2) {
                k(booleanValue2);
            }
        } else if (i10 == NotificationCenter.featuredStickersDidLoad) {
            Z();
            rd0 rd0Var = this.f26879w;
            if (rd0Var != null) {
                int childCount = rd0Var.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    rd0Var.getChildAt(i13).invalidate();
                }
            }
            X(false);
        } else if (i10 == NotificationCenter.featuredEmojiDidLoad) {
            if (wxVar != null) {
                wxVar.F(false);
            }
        } else {
            int i14 = NotificationCenter.groupStickersDidLoad;
            ny nyVar = this.S;
            if (i10 == i14) {
                Long l4 = (Long) objArr[0];
                long longValue2 = l4.longValue();
                if (objArr.length > 1) {
                    tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) objArr[1];
                } else {
                    tL_messages_stickerSet = null;
                }
                if (tL_messages_stickerSet != null) {
                    iz izVar = this.f26891z0;
                    if (izVar != null && izVar.d == longValue2 && izVar.f25240f.size() < tL_messages_stickerSet.documents.size()) {
                        izVar.f25240f = tL_messages_stickerSet.documents;
                        izVar.l();
                    }
                    if (nyVar != null && nyVar.d == longValue2 && nyVar.f26800f.size() < tL_messages_stickerSet.documents.size()) {
                        nyVar.f26800f = tL_messages_stickerSet.documents;
                        nyVar.l();
                    }
                }
                TLRPC.ChatFull chatFull2 = this.J1;
                if (chatFull2 != null && (stickerSet = chatFull2.stickerset) != null && stickerSet.f18379id == longValue2) {
                    X(false);
                }
                HashMap hashMap = this.f26864r1;
                if (hashMap.containsKey(l4) && objArr.length >= 2 && ((Utilities.Callback) hashMap.get(l4)) != null && tL_messages_stickerSet != null && (callback = (Utilities.Callback) hashMap.remove(l4)) != null) {
                    callback.run(tL_messages_stickerSet);
                }
                AndroidUtilities.cancelRunOnUIThread(gwVar);
                AndroidUtilities.runOnUIThread(gwVar, 100L);
                return;
            }
            int i15 = NotificationCenter.emojiLoaded;
            zx zxVar = this.P;
            if (i10 == i15) {
                vw vwVar = this.D0;
                if (vwVar != null) {
                    int childCount2 = vwVar.getChildCount();
                    for (int i16 = 0; i16 < childCount2; i16++) {
                        View childAt = vwVar.getChildAt(i16);
                        if ((childAt instanceof org.telegram.ui.Cells.o8) || (childAt instanceof org.telegram.ui.Cells.f8)) {
                            childAt.invalidate();
                        }
                    }
                }
                if (zxVar != null) {
                    zxVar.invalidate();
                    int childCount3 = zxVar.getChildCount();
                    for (int i17 = 0; i17 < childCount3; i17++) {
                        View childAt2 = zxVar.getChildAt(i17);
                        if (childAt2 instanceof wy) {
                            childAt2.invalidate();
                        }
                    }
                }
                av avVar = this.B1;
                if (avVar != null) {
                    avVar.f22720c.invalidate();
                }
                ux uxVar = this.f26856p0;
                if (uxVar != null) {
                    ub1 ub1Var = uxVar.e;
                    int childCount4 = ub1Var.getChildCount();
                    for (int i18 = 0; i18 < childCount4; i18++) {
                        ub1Var.getChildAt(i18).invalidate();
                    }
                }
            } else if (i10 == NotificationCenter.newEmojiSuggestionsAvailable) {
                if (zxVar != null && this.f26820d0) {
                    if ((this.V.f22736c.f26748k == 2 || zxVar.getAdapter() == nyVar) && !TextUtils.isEmpty(nyVar.v)) {
                        nyVar.F(nyVar.v, true);
                    }
                }
            } else if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                if (wxVar != null) {
                    wxVar.F(false);
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
            if (this.f26849n.getVisibility() != 8 && !this.f26873u0 && this.f26880w0) {
                canvas.drawColor(i0.a.k(-1, 25));
            }
            boolean drawChild = super.drawChild(canvas, view, j3);
            float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(this.f26858p2);
            if (navigationBarThirdButtonsFactor > 0.0f) {
                int l1 = org.telegram.ui.ActionBar.h6.l1(navigationBarThirdButtonsFactor, z(org.telegram.ui.ActionBar.h6.He));
                int i10 = this.B2;
                GradientDrawable gradientDrawable = this.A2;
                if (i10 != l1) {
                    gradientDrawable.setColors(new int[]{l1, org.telegram.ui.ActionBar.h6.l1(0.66f, l1), i0.a.k(l1, 0)});
                    this.B2 = l1;
                }
                gradientDrawable.setBounds(0, getMeasuredHeight() - this.f26858p2, getMeasuredWidth(), getMeasuredHeight());
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

    public ArrayList<ay> getEmojipacks() {
        ArrayList<ay> arrayList = new ArrayList<>();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f26860q1;
            if (i10 < arrayList2.size()) {
                ay ayVar = (ay) arrayList2.get(i10);
                boolean z10 = ayVar.f22728g;
                ArrayList arrayList3 = this.f26857p1;
                if ((!z10 && (ayVar.f22727f || arrayList3.contains(Long.valueOf(ayVar.f22725b.f18379id)))) || (ayVar.f22728g && !ayVar.f22727f && !arrayList3.contains(Long.valueOf(ayVar.f22725b.f18379id)))) {
                    arrayList.add(ayVar);
                }
                i10++;
            } else {
                return arrayList;
            }
        }
    }

    public ArrayList<String> getRecentEmoji() {
        if (this.f26819c2) {
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
        ax axVar = this.B0;
        if (axVar == null) {
            return 0.0f;
        }
        return axVar.getExpandedOffset();
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
                if (!this.f26819c2) {
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
        kx kxVar = new kx(getContext(), i11);
        kxVar.f43218a = !z10 ? 1 : 0;
        w(i10).w0(kxVar);
    }

    public final void k(boolean z10) {
        if (z10) {
            W();
            return;
        }
        int size = this.f26840j1.size();
        int size2 = this.f26843k1.size();
        int i10 = this.f26818c1;
        this.f26840j1 = MediaDataController.getInstance(i10).getRecentStickers(0, true);
        this.f26843k1 = MediaDataController.getInstance(i10).getRecentStickers(2);
        if (UserConfig.getInstance(i10).isPremium()) {
            this.l1 = MediaDataController.getInstance(i10).getRecentStickers(7);
        } else {
            this.l1 = new ArrayList();
        }
        for (int i11 = 0; i11 < this.f26843k1.size(); i11++) {
            TLRPC.Document document = (TLRPC.Document) this.f26843k1.get(i11);
            int i12 = 0;
            while (true) {
                if (i12 < this.f26840j1.size()) {
                    TLRPC.Document document2 = (TLRPC.Document) this.f26840j1.get(i12);
                    if (document2.dc_id == document.dc_id && document2.f18358id == document.f18358id) {
                        this.f26840j1.remove(i12);
                        break;
                    }
                    i12++;
                }
            }
        }
        if (MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            int i13 = 0;
            while (i13 < this.f26843k1.size()) {
                if (MessageObject.isPremiumSticker((TLRPC.Document) this.f26843k1.get(i13))) {
                    this.f26843k1.remove(i13);
                    i13--;
                }
                i13++;
            }
            int i14 = 0;
            while (i14 < this.f26840j1.size()) {
                if (MessageObject.isPremiumSticker((TLRPC.Document) this.f26840j1.get(i14))) {
                    this.f26840j1.remove(i14);
                    i14--;
                }
                i14++;
            }
        }
        if (size != this.f26840j1.size() || size2 != this.f26843k1.size()) {
            X(false);
        }
        ez ezVar = this.f26888y0;
        if (ezVar != null) {
            ezVar.l();
        }
        o();
    }

    public final void l(boolean z10) {
        int i10;
        boolean z11;
        oy oyVar = this.f26871t1;
        le.c cVar = this.f26812b;
        zx zxVar = this.P;
        mw mwVar = this.V;
        if (oyVar != null && oyVar.z()) {
            s4.c1 K = zxVar.K(0);
            if (K == null) {
                az.a(mwVar, true, !z10);
            } else {
                if (K.f43068a.getTop() < zxVar.getPaddingTop()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                az.a(mwVar, z11, !z10);
            }
            N(false, !z10);
            mwVar.setTranslationY(cVar.e * AndroidUtilities.dp(15.0f));
        } else if (mwVar != null && zxVar != null) {
            s4.c1 K2 = zxVar.K(0);
            if (K2 != null) {
                i10 = K2.f43068a.getTop();
            } else {
                i10 = -this.f26814b1;
            }
            mwVar.setTranslationY((cVar.e * AndroidUtilities.dp(15.0f)) + i10);
            mwVar.f22734a.a(false, !z10);
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
        if (dp > 0 && (K == null || K.f43068a.getBottom() < dp)) {
            z10 = true;
        }
        N(z10, !this.K1);
    }

    public final void n(int i10, View view) {
        zx zxVar;
        s4.c1 K;
        int i11;
        rx rxVar = this.I;
        int[] iArr = this.Q0;
        if (view == null) {
            iArr[1] = 0;
            rxVar.setTranslationY(0);
        } else if (view.getVisibility() == 0 && !this.f26827f0) {
            oy oyVar = this.f26871t1;
            if (oyVar == null || !oyVar.z()) {
                if (i10 > 0 && (zxVar = this.P) != null && zxVar.getVisibility() == 0 && (K = zxVar.K(0)) != null) {
                    int top = K.f43068a.getTop();
                    if (this.f26820d0) {
                        i11 = this.f26814b1;
                    } else {
                        i11 = 0;
                    }
                    if (top + i11 >= zxVar.getPaddingTop()) {
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
                rxVar.setTranslationY(Math.max(-AndroidUtilities.dp(36.0f), iArr[1]));
            }
        }
    }

    public final void o() {
        int L0;
        ax axVar = this.B0;
        if (axVar != null && (L0 = this.E0.L0()) != -1) {
            int i10 = this.G1;
            if (i10 <= 0 && (i10 = this.F1) <= 0) {
                i10 = this.E1;
            }
            axVar.k(this.f26888y0.F(L0), i10);
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
        NotificationCenter.ObserversGroup add = NotificationCenter.getInstance(this.f26818c1).createWeakObserversGroup(this).addGlobal(NotificationCenter.emojiLoaded).add(NotificationCenter.newEmojiSuggestionsAvailable).add(NotificationCenter.groupPackUpdated);
        this.I2 = add;
        if (this.f26888y0 != null) {
            add.add(NotificationCenter.stickersDidLoad).add(NotificationCenter.recentDocumentsDidLoad).add(NotificationCenter.featuredStickersDidLoad).add(NotificationCenter.groupStickersDidLoad).add(NotificationCenter.currentUserPremiumStatusChanged);
            AndroidUtilities.runOnUIThread(new gw(this, 0));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        av avVar = this.B1;
        if (avVar != null && avVar.isShowing()) {
            avVar.dismiss();
        }
        org.telegram.ui.nt q6 = org.telegram.ui.nt.q();
        if (q6.f36123l == this.f26832g2) {
            q6.W = null;
            q6.f36111a0 = null;
            q6.Y = null;
            q6.f36123l = null;
            q6.f36115c0 = null;
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
        boolean z11 = this.f26820d0;
        if (!z10 && !this.N1) {
            if (this.L1 != 0) {
                if (!this.H2) {
                    setOutlineProvider(null);
                    setClipToOutline(false);
                    setElevation(0.0f);
                }
                if (this.f26873u0) {
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
            if (z11 && this.f26873u0) {
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
                this.B0.k(this.f26888y0.F(L02), i12);
            }
        } else if (i10 == 2) {
            s4.h0 adapter = this.f26833h0.getAdapter();
            sy syVar = this.f26850n0;
            if (adapter == syVar && syVar.I >= 0 && this.f26867s0 >= 0 && this.f26863r0 >= 0 && (L0 = this.f26836i0.L0()) != -1) {
                if (L0 >= syVar.I) {
                    i11 = this.f26867s0;
                } else {
                    i11 = this.f26863r0;
                }
                this.f26856p0.k(i11, 0);
            }
        }
    }

    public final void q(boolean z10) {
        int i10;
        oy oyVar = this.f26871t1;
        le.c cVar = this.f26809a;
        vw vwVar = this.D0;
        boolean z11 = false;
        zw zwVar = this.G0;
        if (oyVar != null && oyVar.z()) {
            s4.c1 K = vwVar.K(0);
            if (K == null) {
                az.a(zwVar, true, !z10);
            } else {
                if (K.f43068a.getTop() < vwVar.getPaddingTop()) {
                    z11 = true;
                }
                az.a(zwVar, z11, !z10);
            }
            zwVar.setTranslationY(cVar.e * AndroidUtilities.dp(15.0f));
        } else if (zwVar != null && vwVar != null) {
            s4.c1 K2 = vwVar.K(0);
            if (K2 != null) {
                i10 = K2.f43068a.getTop();
            } else {
                i10 = -this.f26814b1;
            }
            zwVar.setTranslationY((cVar.e * AndroidUtilities.dp(15.0f)) + i10);
            zwVar.f22734a.a(false, !z10);
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
        az azVar;
        s4.c0 c0Var;
        View view;
        View view2;
        int i10;
        TLRPC.TL_messages_stickerSet stickerSetById;
        ez ezVar;
        int E;
        AnimatorSet animatorSet = this.M0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.M0 = null;
        }
        int currentItem = this.h.getCurrentItem();
        if (currentItem == 2 && j3 != -1 && (stickerSetById = MediaDataController.getInstance(this.f26818c1).getStickerSetById(j3)) != null && (E = (ezVar = this.f26888y0).E(stickerSetById)) >= 0 && E < ezVar.h()) {
            H(E, AndroidUtilities.dp(48.0f));
        }
        sy syVar = this.f26839j0;
        if (syVar != null) {
            syVar.K = false;
        }
        for (int i11 = 0; i11 < 3; i11++) {
            View view3 = this.D0;
            View view4 = this.f26833h0;
            sw swVar = this.f26853o0;
            View view5 = this.P;
            if (i11 == 0) {
                azVar = this.V;
                c0Var = this.Q;
                view = this.I;
                view2 = view5;
            } else if (i11 == 1) {
                c0Var = this.f26836i0;
                view = this.f26856p0;
                view2 = view4;
                azVar = swVar;
            } else {
                azVar = this.G0;
                c0Var = this.E0;
                view = this.B0;
                view2 = view3;
            }
            if (azVar != null) {
                zy zyVar = azVar.f22739r;
                azVar.d.setText("");
                if (zyVar != null) {
                    zyVar.H1(null);
                    zyVar.F1();
                }
                int i12 = this.f26814b1;
                if (i11 == currentItem && z10) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.M0 = animatorSet2;
                    Property property = View.TRANSLATION_Y;
                    if (view != null && i11 != 1) {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, 0.0f), ObjectAnimator.ofFloat(view2, property, AndroidUtilities.dp(36.0f)), ObjectAnimator.ofFloat(azVar, property, AndroidUtilities.dp(36.0f)));
                    } else {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(view2, property, AndroidUtilities.dp(36.0f) - i12));
                    }
                    this.M0.setDuration(200L);
                    this.M0.setInterpolator(tr.h);
                    this.M0.addListener(new ai.y4(this, c0Var, view2, 5));
                    this.M0.start();
                } else {
                    if (azVar != swVar) {
                        azVar.setTranslationY(AndroidUtilities.dp(36.0f) - i12);
                    }
                    if (view != null && i11 != 2) {
                        view.setTranslationY(0.0f);
                    }
                    if (view2 == view3) {
                        i10 = 0;
                        view2.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f) + this.f26858p2);
                    } else {
                        i10 = 0;
                        if (view2 == view4) {
                            view2.setPadding(0, AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(44.0f) + this.f26858p2);
                        } else {
                            if (view2 == view5) {
                                view2.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f) + this.f26858p2);
                            }
                            i10 = 0;
                        }
                    }
                    c0Var.h1(i10, i10);
                }
            }
        }
        if (!z10) {
            this.f26871t1.i(0);
        }
    }

    public void setBlurredBackgroundDrawableFactory(ah.c cVar) {
        org.telegram.ui.ActionBar.d6 d6Var = this.Z1;
        View view = this.f26883x;
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
        View view3 = this.f26879w;
        if (view3 != null) {
            ch.d c12 = cVar.c(view3, null, false);
            c12.o(eh.b.d(d6Var));
            c12.q(AndroidUtilities.dp(18.0f));
            c12.p(AndroidUtilities.dp(6.0f));
            view3.setBackground(c12);
        }
        View view4 = this.f26887y;
        if (view4 != null) {
            ch.d c13 = cVar.c(view4, null, false);
            c13.o(eh.b.d(d6Var));
            c13.q(AndroidUtilities.dp(18.0f));
            c13.p(AndroidUtilities.dp(6.0f));
            view4.setBackground(c13);
        }
    }

    public void setBottomInset(int i10) {
        if (this.f26858p2 != i10) {
            this.f26858p2 = i10;
            j(i10, this.K);
            j(i10, this.M);
            j(AndroidUtilities.dp(44.0f) + i10, this.P);
            j(AndroidUtilities.dp(44.0f) + i10, this.D0);
            j(AndroidUtilities.dp(44.0f) + i10, this.f26833h0);
            FrameLayout frameLayout = this.f26866s;
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

    public void setDelegate(oy oyVar) {
        this.f26871t1 = oyVar;
    }

    public void setDragListener(tx txVar) {
        this.O0 = txVar;
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        zw zwVar = this.G0;
        if (zwVar != null) {
            zwVar.d.setEnabled(z10);
        }
        sw swVar = this.f26853o0;
        if (swVar != null) {
            swVar.d.setEnabled(z10);
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
        if (this.f26873u0 != z10) {
            this.f26873u0 = z10;
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
                int i11 = this.f26818c1;
                NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.stickersDidLoad);
                if (this.f26888y0 != null) {
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
        ez ezVar;
        boolean z11 = this.N2;
        this.N2 = z10;
        if (z11 && !z10) {
            int i10 = this.A1;
            if (i10 == 0) {
                wx wxVar = this.R;
                if (wxVar != null) {
                    wxVar.F(false);
                }
            } else if (i10 == 1) {
                sy syVar = this.f26850n0;
                if (syVar != null) {
                    syVar.l();
                }
            } else if (i10 == 2 && (ezVar = this.f26888y0) != null) {
                ezVar.l();
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
                    return this.f26836i0;
                }
                throw new IllegalArgumentException(hg.c.h(i10, "Unexpected argument: "));
            }
            return this.Q;
        }
        return this.E0;
    }

    public final zl0 x(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return this.f26833h0;
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
                    return this.f26856p0;
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
