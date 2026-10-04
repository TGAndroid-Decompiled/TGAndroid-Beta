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
import org.telegram.ui.xb1;
public class nz extends FrameLayout implements le.d, NotificationCenter.NotificationCenterDelegate, ph.a {
    public static final int M2 = 0;
    public final lw A0;
    public int A1;
    public ArrayList A2;
    public final ax B0;
    public final bv B1;
    public int B2;
    public final bx C0;
    public final int C1;
    public long C2;
    public final vw D0;
    public final int[] D1;
    public final le.b D2;
    public final ImageView E;
    public final ww E0;
    public int E1;
    public ArrayList E2;
    public AnimatorSet F;
    public lz F0;
    public int F1;
    public boolean F2;
    public AnimatorSet G;
    public final zw G0;
    public int G1;
    public NotificationCenter.ObserversGroup G2;
    public float H;
    public final nh.d H0;
    public int H1;
    public AnimatorSet H2;
    public final rx I;
    public boolean I0;
    public int I1;
    public org.telegram.messenger.video.k I2;
    public final mx J;
    public boolean J0;
    public TLRPC.ChatFull J1;
    public final hw J2;
    public final ci.m6 K;
    public boolean K0;
    public boolean K1;
    public boolean K2;
    public final nh.b L;
    public final hy L0;
    public int L1;
    public boolean L2;
    public final ci.m6 M;
    public AnimatorSet M0;
    public final ai.i6 M1;
    public final nh.b N;
    public final ai.p4 N0;
    public boolean N1;
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
    public final nw V;
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
    public final org.telegram.ui.ActionBar.d6 Z1;
    public final le.b f29082a;
    public final bl0 f29083a0;
    public final String[] f29084a1;
    public final org.telegram.ui.ActionBar.t5 a2;
    public final le.b f29085b;
    public final bl0 f29086b0;
    public final int f29087b1;
    public final org.telegram.ui.ActionBar.t5 f29088b2;
    public int f29089c;
    public boolean f29090c0;
    public final int f29091c1;
    public final boolean f29092c2;
    public final ArrayList d;
    public final boolean f29093d0;
    public final ArrayList f29094d1;
    public LongSparseArray f29095d2;
    public final ArrayList f29096e;
    public boolean f29097e0;
    public int f29098e1;
    public PorterDuffColorFilter f29099e2;
    public boolean f29100f;
    public boolean f29101f0;
    public int f29102f1;
    public final org.telegram.ui.Cells.t6 f29103f2;
    public final pw f29104g0;
    public boolean f29105g1;
    public final ix f29106g2;
    public final cx h;
    public final qw f29107h0;
    public TLRPC.TL_messages_stickerSet f29108h1;
    public boolean f29109h2;
    public final ty f29110i0;
    public ArrayList f29111i1;
    public final boolean f29112i2;
    public final sy f29113j0;
    public ArrayList f29114j1;
    public final ah.i f29115j2;
    public final vy f29116k0;
    public ArrayList f29117k1;
    public final mh f29118k2;
    public final HashMap f29119l0;
    public ArrayList l1;
    public final ah.c f29120l2;
    public final lw m0;
    public final ArrayList f29121m1;
    public final li.m f29122m2;
    public final FrameLayout f29123n;
    public final sy f29124n0;
    public final ArrayList f29125n1;
    public boolean f29126n2;
    public final sw f29127o0;
    public final ArrayList f29128o1;
    public boolean f29129o2;
    public final ux f29130p0;
    public final ArrayList f29131p1;
    public int f29132p2;
    public boolean f29133q0;
    public final ArrayList f29134q1;
    public float f29135q2;
    public final FrameLayout f29136r;
    public int f29137r0;
    public final HashMap f29138r1;
    public View f29139r2;
    public final FrameLayout f29140s;
    public int f29141s0;
    public final Paint f29142s1;
    public int f29143s2;
    public int f29144t0;
    public oy f29145t1;
    public int f29146t2;
    public boolean f29147u0;
    public long f29148u1;
    public long f29149u2;
    public final View v;
    public boolean f29150v0;
    public boolean f29151v1;
    public boolean f29152v2;
    public final qd0 f29153w;
    public boolean f29154w0;
    public boolean f29155w1;
    public boolean f29156w2;
    public final dx f29157x;
    public final tw f29158x0;
    public final TLRPC.StickerSetCovered[] f29159x1;
    public final Rect f29160x2;
    public final ImageView f29161y;
    public final ez f29162y0;
    public final LongSparseArray f29163y1;
    public final GradientDrawable f29164y2;
    public final iz f29165z0;
    public final LongSparseArray f29166z1;
    public int f29167z2;

    public nz(org.telegram.ui.ActionBar.n2 n2Var, boolean z10, boolean z11, boolean z12, Context context, boolean z13, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z14, final org.telegram.ui.ActionBar.d6 d6Var, boolean z15, boolean z16) {
        super(context);
        org.telegram.ui.ActionBar.t5 t5Var;
        int z17;
        mx mxVar;
        Context context2;
        hw hwVar;
        boolean z18;
        Field field;
        int i10;
        tr trVar = tr.h;
        this.f29082a = new le.b(0, this, trVar, 320L, false);
        this.f29085b = new le.b(1, this, trVar, 320L, false);
        this.f29089c = 2;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.f29096e = new ArrayList();
        this.f29090c0 = true;
        this.f29116k0 = new vy(this);
        this.f29119l0 = new HashMap();
        this.f29133q0 = true;
        this.f29137r0 = -2;
        this.f29141s0 = -2;
        this.f29144t0 = -2;
        this.f29147u0 = true;
        this.f29154w0 = true;
        this.I0 = true;
        this.Q0 = new int[3];
        this.R0 = new ObjectAnimator[3];
        int i11 = UserConfig.selectedAccount;
        this.f29091c1 = i11;
        this.f29094d1 = new ArrayList();
        this.f29111i1 = new ArrayList();
        this.f29114j1 = new ArrayList();
        this.f29117k1 = new ArrayList();
        this.l1 = new ArrayList();
        this.f29121m1 = new ArrayList();
        this.f29125n1 = new ArrayList();
        new ArrayList();
        this.f29128o1 = new ArrayList();
        this.f29131p1 = new ArrayList();
        this.f29134q1 = new ArrayList();
        this.f29138r1 = new HashMap();
        this.f29159x1 = new TLRPC.StickerSetCovered[10];
        this.f29163y1 = new LongSparseArray();
        this.f29166z1 = new LongSparseArray();
        this.D1 = new int[2];
        this.F1 = -2;
        this.G1 = -2;
        this.H1 = -2;
        this.I1 = -2;
        this.L1 = -1;
        this.f29103f2 = new org.telegram.ui.Cells.t6(this, 12);
        this.f29106g2 = new ix(this);
        this.f29109h2 = true;
        li.m mVar = new li.m();
        this.f29122m2 = mVar;
        this.f29135q2 = -1.0f;
        this.f29143s2 = -1;
        this.f29146t2 = -1;
        this.f29149u2 = -1L;
        this.f29152v2 = false;
        this.f29156w2 = true;
        this.f29160x2 = new Rect();
        this.f29164y2 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.D2 = new le.b(0, new iw(this, 3), trVar, 380L, true);
        this.J2 = new hw(this, 1);
        this.K2 = false;
        this.f29147u0 = z14;
        this.Y1 = n2Var;
        this.f29092c2 = z10;
        this.Z1 = d6Var;
        this.f29112i2 = z16;
        fh.c cVar = new fh.c();
        cVar.a(z(org.telegram.ui.ActionBar.i6.f20817d6));
        if (z15) {
            u(true);
        }
        i0.a.k(z(org.telegram.ui.ActionBar.i6.Wk), 30);
        int dp = AndroidUtilities.dp(50.0f);
        this.f29087b1 = dp;
        this.f29093d0 = z13;
        this.X0 = new Drawable[]{org.telegram.ui.ActionBar.i6.U(context, R.drawable.smiles_tab_smiles, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.i6.Re), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.i6.Oe)), org.telegram.ui.ActionBar.i6.U(context, R.drawable.smiles_tab_gif, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.i6.Re), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.i6.Oe)), org.telegram.ui.ActionBar.i6.U(context, R.drawable.smiles_tab_stickers, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.i6.Re), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.i6.Oe))};
        org.telegram.ui.ActionBar.t5 U = org.telegram.ui.ActionBar.i6.U(context, R.drawable.msg_emoji_recent, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.i6.Me), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.i6.Oe));
        org.telegram.ui.ActionBar.t5 U2 = org.telegram.ui.ActionBar.i6.U(context, R.drawable.emoji_tabs_faves, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.i6.Me), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.i6.Oe));
        org.telegram.ui.ActionBar.t5 U3 = org.telegram.ui.ActionBar.i6.U(context, R.drawable.emoji_tabs_new3, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.i6.Me), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.i6.Oe));
        int i12 = R.drawable.emoji_tabs_new1;
        if (z16) {
            t5Var = U3;
            z17 = v(0.4f);
        } else {
            t5Var = U3;
            z17 = z(org.telegram.ui.ActionBar.i6.Me);
        }
        org.telegram.ui.ActionBar.t5 U4 = org.telegram.ui.ActionBar.i6.U(context, i12, z17, z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.i6.Oe));
        this.a2 = U4;
        int i13 = R.drawable.emoji_tabs_new2;
        int i14 = org.telegram.ui.ActionBar.i6.Qe;
        org.telegram.ui.ActionBar.t5 U5 = org.telegram.ui.ActionBar.i6.U(context, i13, z(i14), z(i14));
        this.f29088b2 = U5;
        this.Y0 = new Drawable[]{U, U2, t5Var, new LayerDrawable(new Drawable[]{U4, U5})};
        this.Z0 = new Drawable[]{org.telegram.ui.ActionBar.i6.U(context, R.drawable.msg_emoji_recent, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.i6.Me), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.i6.Oe)), org.telegram.ui.ActionBar.i6.U(context, R.drawable.stickers_gifs_trending, z16 ? v(0.4f) : z(org.telegram.ui.ActionBar.i6.Me), z16 ? v(0.8f) : z(org.telegram.ui.ActionBar.i6.Oe))};
        this.f29084a1 = new String[]{LocaleController.getString(R.string.Emoji1), LocaleController.getString(R.string.Emoji2), LocaleController.getString(R.string.Emoji3), LocaleController.getString(R.string.Emoji4), LocaleController.getString(R.string.Emoji5), LocaleController.getString(R.string.Emoji6), LocaleController.getString(R.string.Emoji7), LocaleController.getString(R.string.Emoji8)};
        this.J1 = chatFull;
        Paint paint = new Paint(1);
        this.f29142s1 = paint;
        paint.setColor(z(org.telegram.ui.ActionBar.i6.f20769af));
        ai.k2 k2Var = yf.f0.f50979a;
        this.M1 = new ai.i6(AndroidUtilities.dp(6.0f));
        mx mxVar2 = new mx(this, context);
        this.J = mxVar2;
        ?? obj = new Object();
        obj.f27915a = 0;
        obj.f27916b = mxVar2;
        arrayList.add(obj);
        if (z10) {
            MediaDataController.getInstance(i11).checkStickers(5);
            MediaDataController.getInstance(i11).checkFeaturedEmoji();
            this.f29099e2 = new PorterDuffColorFilter(z(org.telegram.ui.ActionBar.i6.Oh), PorterDuff.Mode.SRC_IN);
        }
        zx zxVar = new zx(this, context);
        this.P = zxVar;
        mVar.b(zxVar);
        s4.j jVar = new s4.j();
        jVar.f46613c = 220L;
        jVar.f46614e = 220L;
        jVar.f46615f = 160L;
        jVar.f46616g = 160L;
        jVar.f46617i = tr.f31141g;
        zxVar.setItemAnimator(jVar);
        zxVar.setOnTouchListener(new View.OnTouchListener(this) {
            public final nz f27903b;

            {
                this.f27903b = this;
            }

            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                switch (r3) {
                    case 0:
                        org.telegram.ui.rt q6 = org.telegram.ui.rt.q();
                        nz nzVar = this.f27903b;
                        zx zxVar2 = nzVar.P;
                        nzVar.getMeasuredHeight();
                        return q6.s(motionEvent, zxVar2, null, nzVar.f29106g2, d6Var);
                    case 1:
                        org.telegram.ui.rt q10 = org.telegram.ui.rt.q();
                        nz nzVar2 = this.f27903b;
                        return q10.s(motionEvent, nzVar2.f29107h0, nzVar2.m0, nzVar2.f29106g2, d6Var);
                    default:
                        org.telegram.ui.rt q11 = org.telegram.ui.rt.q();
                        nz nzVar3 = this.f27903b;
                        vw vwVar = nzVar3.D0;
                        nzVar3.getMeasuredHeight();
                        return q11.s(motionEvent, vwVar, nzVar3.A0, nzVar3.f29106g2, d6Var);
                }
            }
        });
        zxVar.setOnItemLongClickListener(new iw(this, 1));
        zxVar.setInstantClick(true);
        nx nxVar = new nx(this);
        this.Q = nxVar;
        zxVar.setLayoutManager(nxVar);
        zxVar.setTopGlowOffset(AndroidUtilities.dp(38.0f));
        zxVar.setBottomGlowOffset(AndroidUtilities.dp(36.0f));
        zxVar.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f));
        int i15 = org.telegram.ui.ActionBar.i6.He;
        zxVar.setGlowColor(z(i15));
        zxVar.setItemSelectorColorProvider(new ru(1));
        zxVar.setClipToPadding(false);
        nxVar.O = new ox(this);
        wx wxVar = new wx(this);
        this.R = wxVar;
        zxVar.setAdapter(wxVar);
        zxVar.i(new ci.r1(this, 3));
        this.S = new ny(this, context);
        mxVar2.addView(zxVar, w7.z5.c(-1.0f, -1));
        bl0 bl0Var = new bl0(zxVar, nxVar);
        this.f29086b0 = bl0Var;
        bl0Var.f24999i = new px(this);
        zxVar.setOnScrollListener(new qx(this));
        if (n2Var != null) {
            mxVar = mxVar2;
            context2 = context;
            hwVar = new hw(this, 2);
        } else {
            mxVar = mxVar2;
            context2 = context;
            hwVar = null;
        }
        rx rxVar = new rx(this, context2, d6Var, z10, hwVar, z16);
        this.I = rxVar;
        if (z13) {
            nw nwVar = new nw(this, context2);
            this.V = nwVar;
            mxVar.addView(nwVar, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + dp));
            nwVar.d.setOnFocusChangeListener(new ow(this));
            nh.d dVar = new nh.d(context2, d6Var);
            this.U = dVar;
            dVar.setVisibility(8);
            dVar.setOnBackClickListener(new View.OnClickListener(this) {
                public final nz f28202b;

                {
                    this.f28202b = this;
                }

                @Override
                public final void onClick(View view) {
                    az azVar;
                    switch (r2) {
                        case 0:
                            ny nyVar = this.f28202b.S;
                            iy iyVar = nyVar.f29073c;
                            int childCount = iyVar.getChildCount();
                            for (int i16 = 0; i16 < childCount; i16++) {
                                ((nh.c) iyVar.getChildAt(i16)).a(false, true);
                            }
                            nyVar.d = 0L;
                            nyVar.F.f29085b.a(false, true);
                            nyVar.l();
                            return;
                        case 1:
                            iz izVar = this.f28202b.f29165z0;
                            hz hzVar = izVar.f27515c;
                            int childCount2 = hzVar.getChildCount();
                            for (int i17 = 0; i17 < childCount2; i17++) {
                                ((nh.c) hzVar.getChildAt(i17)).a(false, true);
                            }
                            izVar.d = 0L;
                            izVar.Q.f29082a.a(false, true);
                            izVar.l();
                            return;
                        case 2:
                            oy oyVar = this.f28202b.f29145t1;
                            if (oyVar != null) {
                                oyVar.w();
                                return;
                            }
                            return;
                        default:
                            nz nzVar = this.f28202b;
                            int currentItem = nzVar.h.getCurrentItem();
                            if (currentItem == 0) {
                                azVar = nzVar.V;
                            } else if (currentItem == 1) {
                                azVar = nzVar.f29127o0;
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
        mxVar.addView(rxVar, w7.z5.c(36.0f, -1));
        View view = new View(context2);
        this.O = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        int i16 = org.telegram.ui.ActionBar.i6.Ke;
        view.setBackgroundColor(z(i16));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(36.0f);
        mxVar.addView(view, layoutParams);
        nh.b bVar = new nh.b(context2, d6Var);
        this.L = bVar;
        ci.m6 m6Var = new ci.m6(context2, 3, d6Var);
        this.K = m6Var;
        m6Var.setVisibility(8);
        m6Var.addView(bVar, w7.z5.d(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
        mxVar.addView(m6Var, w7.z5.e(-1, -2, 80));
        if (z11) {
            zm0 zm0Var = zm0.f33570b;
            if (z12) {
                pw pwVar = new pw(this, context2);
                this.f29104g0 = pwVar;
                ?? obj2 = new Object();
                obj2.f27915a = 1;
                obj2.f27916b = pwVar;
                this.d.add(obj2);
                qw qwVar = new qw(this, context2);
                this.f29107h0 = qwVar;
                mVar.b(qwVar);
                qwVar.setClipToPadding(false);
                ty tyVar = new ty(this);
                this.f29110i0 = tyVar;
                qwVar.setLayoutManager(tyVar);
                qwVar.i(new rw(this));
                qwVar.setPadding(0, dp, 0, AndroidUtilities.dp(44.0f) + this.f29132p2);
                ((s4.f1) qwVar.getItemAnimator()).f46562m = false;
                sy syVar = new sy(this, context2, true, Integer.MAX_VALUE);
                this.f29124n0 = syVar;
                qwVar.setAdapter(syVar);
                this.f29113j0 = new sy(this, context2, false, 0);
                qwVar.setOnScrollListener(new mz(this, 2));
                qwVar.setOnTouchListener(new View.OnTouchListener(this) {
                    public final nz f27903b;

                    {
                        this.f27903b = this;
                    }

                    @Override
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        switch (r3) {
                            case 0:
                                org.telegram.ui.rt q6 = org.telegram.ui.rt.q();
                                nz nzVar = this.f27903b;
                                zx zxVar2 = nzVar.P;
                                nzVar.getMeasuredHeight();
                                return q6.s(motionEvent, zxVar2, null, nzVar.f29106g2, d6Var);
                            case 1:
                                org.telegram.ui.rt q10 = org.telegram.ui.rt.q();
                                nz nzVar2 = this.f27903b;
                                return q10.s(motionEvent, nzVar2.f29107h0, nzVar2.m0, nzVar2.f29106g2, d6Var);
                            default:
                                org.telegram.ui.rt q11 = org.telegram.ui.rt.q();
                                nz nzVar3 = this.f27903b;
                                vw vwVar = nzVar3.D0;
                                nzVar3.getMeasuredHeight();
                                return q11.s(motionEvent, vwVar, nzVar3.A0, nzVar3.f29106g2, d6Var);
                        }
                    }
                });
                ?? r11 = new ml0(this) {
                    public final nz f28438b;

                    {
                        this.f28438b = this;
                    }

                    @Override
                    public final void d(int i17, View view2) {
                        int i18;
                        String str;
                        switch (r2) {
                            case 0:
                                nz nzVar = this.f28438b;
                                qw qwVar2 = nzVar.f29107h0;
                                sy syVar2 = nzVar.f29113j0;
                                sy syVar3 = nzVar.f29124n0;
                                if (nzVar.f29145t1 != null) {
                                    syVar3.getClass();
                                    ArrayList arrayList2 = syVar3.f30896x;
                                    if (qwVar2.getAdapter() == syVar3) {
                                        if (i17 >= 0) {
                                            int i19 = syVar3.H;
                                            if (i17 < i19) {
                                                nzVar.f29145t1.v(view2, nzVar.f29111i1.get(i17), null, "gif", true, 0, 0);
                                                return;
                                            }
                                            if (i19 > 0) {
                                                i18 = (i17 - i19) - 1;
                                            } else {
                                                i18 = i17;
                                            }
                                            if (i18 >= 0 && i18 < arrayList2.size()) {
                                                nzVar.f29145t1.v(view2, arrayList2.get(i18), null, syVar3.f30892n, true, 0, 0);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    } else if (qwVar2.getAdapter() == syVar2 && i17 >= 0 && i17 < syVar2.f30896x.size()) {
                                        nzVar.f29145t1.v(view2, syVar2.f30896x.get(i17), syVar2.f30895w, syVar2.f30892n, true, 0, 0);
                                        nzVar.U();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            default:
                                nz nzVar2 = this.f28438b;
                                s4.h0 adapter = nzVar2.D0.getAdapter();
                                iz izVar = nzVar2.f29165z0;
                                if (adapter == izVar) {
                                    str = izVar.N;
                                } else {
                                    str = null;
                                }
                                String str2 = str;
                                if (view2 instanceof org.telegram.ui.Cells.f8) {
                                    org.telegram.ui.Cells.f8 f8Var = (org.telegram.ui.Cells.f8) view2;
                                    if (f8Var.getSticker() != null && MessageObject.isPremiumSticker(f8Var.getSticker()) && !AccountInstance.getInstance(nzVar2.f29091c1).getUserConfig().isPremium()) {
                                        org.telegram.ui.rt.q().y(f8Var);
                                        return;
                                    }
                                    org.telegram.ui.rt.q().u();
                                    if (!f8Var.f22105r) {
                                        f8Var.f22105r = true;
                                        f8Var.f22104n = 0.5f;
                                        f8Var.f22108x = 0L;
                                        org.telegram.ui.Cells.e8 e8Var = f8Var.f22099a;
                                        e8Var.setAlpha(0.5f * f8Var.H);
                                        e8Var.invalidate();
                                        f8Var.f22106s = System.currentTimeMillis();
                                        f8Var.invalidate();
                                        nzVar2.f29145t1.m(f8Var, f8Var.getSticker(), str2, f8Var.getParentObject(), f8Var.getSendAnimationData(), true, 0);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                };
                this.m0 = r11;
                qwVar.setOnItemClickListener((ml0) r11);
                pwVar.addView(qwVar, w7.z5.c(-1.0f, -1));
                sw swVar = new sw(this, context2);
                this.f29127o0 = swVar;
                pwVar.addView(swVar, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + dp));
                ux uxVar = new ux(this, context2, d6Var);
                this.f29130p0 = uxVar;
                uxVar.setType(zm0Var);
                uxVar.setUnderlineHeight(AndroidUtilities.getShadowHeight());
                i10 = i14;
                uxVar.setIndicatorColor(z(i10));
                uxVar.setUnderlineColor(z(i16));
                uxVar.setBackgroundColor(z(i15));
                T();
                uxVar.setDelegate(new iw(this, 2));
                syVar.F("", "", true, true, true);
            } else {
                i10 = i14;
            }
            tw twVar = new tw(this, context2, z14);
            this.f29158x0 = twVar;
            MediaDataController.getInstance(this.f29091c1).checkStickers(0);
            MediaDataController.getInstance(this.f29091c1).checkFeaturedStickers();
            vw vwVar = new vw(this, context2);
            this.D0 = vwVar;
            this.f29122m2.b(vwVar);
            ww wwVar = new ww(this);
            this.E0 = wwVar;
            vwVar.setLayoutManager(wwVar);
            wwVar.O = new xw(this);
            vwVar.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f));
            vwVar.setClipToPadding(false);
            ?? obj3 = new Object();
            obj3.f27915a = 2;
            obj3.f27916b = twVar;
            this.d.add(obj3);
            this.f29165z0 = new iz(this, context2);
            ez ezVar = new ez(this, context2);
            this.f29162y0 = ezVar;
            vwVar.setAdapter(ezVar);
            vwVar.setOnTouchListener(new View.OnTouchListener(this) {
                public final nz f27903b;

                {
                    this.f27903b = this;
                }

                @Override
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    switch (r3) {
                        case 0:
                            org.telegram.ui.rt q6 = org.telegram.ui.rt.q();
                            nz nzVar = this.f27903b;
                            zx zxVar2 = nzVar.P;
                            nzVar.getMeasuredHeight();
                            return q6.s(motionEvent, zxVar2, null, nzVar.f29106g2, d6Var);
                        case 1:
                            org.telegram.ui.rt q10 = org.telegram.ui.rt.q();
                            nz nzVar2 = this.f27903b;
                            return q10.s(motionEvent, nzVar2.f29107h0, nzVar2.m0, nzVar2.f29106g2, d6Var);
                        default:
                            org.telegram.ui.rt q11 = org.telegram.ui.rt.q();
                            nz nzVar3 = this.f27903b;
                            vw vwVar2 = nzVar3.D0;
                            nzVar3.getMeasuredHeight();
                            return q11.s(motionEvent, vwVar2, nzVar3.A0, nzVar3.f29106g2, d6Var);
                    }
                }
            });
            ?? r42 = new ml0(this) {
                public final nz f28438b;

                {
                    this.f28438b = this;
                }

                @Override
                public final void d(int i17, View view2) {
                    int i18;
                    String str;
                    switch (r2) {
                        case 0:
                            nz nzVar = this.f28438b;
                            qw qwVar2 = nzVar.f29107h0;
                            sy syVar2 = nzVar.f29113j0;
                            sy syVar3 = nzVar.f29124n0;
                            if (nzVar.f29145t1 != null) {
                                syVar3.getClass();
                                ArrayList arrayList2 = syVar3.f30896x;
                                if (qwVar2.getAdapter() == syVar3) {
                                    if (i17 >= 0) {
                                        int i19 = syVar3.H;
                                        if (i17 < i19) {
                                            nzVar.f29145t1.v(view2, nzVar.f29111i1.get(i17), null, "gif", true, 0, 0);
                                            return;
                                        }
                                        if (i19 > 0) {
                                            i18 = (i17 - i19) - 1;
                                        } else {
                                            i18 = i17;
                                        }
                                        if (i18 >= 0 && i18 < arrayList2.size()) {
                                            nzVar.f29145t1.v(view2, arrayList2.get(i18), null, syVar3.f30892n, true, 0, 0);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                } else if (qwVar2.getAdapter() == syVar2 && i17 >= 0 && i17 < syVar2.f30896x.size()) {
                                    nzVar.f29145t1.v(view2, syVar2.f30896x.get(i17), syVar2.f30895w, syVar2.f30892n, true, 0, 0);
                                    nzVar.U();
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        default:
                            nz nzVar2 = this.f28438b;
                            s4.h0 adapter = nzVar2.D0.getAdapter();
                            iz izVar = nzVar2.f29165z0;
                            if (adapter == izVar) {
                                str = izVar.N;
                            } else {
                                str = null;
                            }
                            String str2 = str;
                            if (view2 instanceof org.telegram.ui.Cells.f8) {
                                org.telegram.ui.Cells.f8 f8Var = (org.telegram.ui.Cells.f8) view2;
                                if (f8Var.getSticker() != null && MessageObject.isPremiumSticker(f8Var.getSticker()) && !AccountInstance.getInstance(nzVar2.f29091c1).getUserConfig().isPremium()) {
                                    org.telegram.ui.rt.q().y(f8Var);
                                    return;
                                }
                                org.telegram.ui.rt.q().u();
                                if (!f8Var.f22105r) {
                                    f8Var.f22105r = true;
                                    f8Var.f22104n = 0.5f;
                                    f8Var.f22108x = 0L;
                                    org.telegram.ui.Cells.e8 e8Var = f8Var.f22099a;
                                    e8Var.setAlpha(0.5f * f8Var.H);
                                    e8Var.invalidate();
                                    f8Var.f22106s = System.currentTimeMillis();
                                    f8Var.invalidate();
                                    nzVar2.f29145t1.m(f8Var, f8Var.getSticker(), str2, f8Var.getParentObject(), f8Var.getSendAnimationData(), true, 0);
                                    return;
                                }
                                return;
                            }
                            return;
                    }
                }
            };
            this.A0 = r42;
            vwVar.setOnItemClickListener((ml0) r42);
            vwVar.setGlowColor(z(i15));
            twVar.addView(vwVar);
            this.f29083a0 = new bl0(vwVar, wwVar);
            zw zwVar = new zw(this, context2);
            this.G0 = zwVar;
            twVar.addView(zwVar, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + dp));
            nh.d dVar2 = new nh.d(context2, d6Var);
            this.H0 = dVar2;
            dVar2.setVisibility(8);
            dVar2.setOnBackClickListener(new View.OnClickListener(this) {
                public final nz f28202b;

                {
                    this.f28202b = this;
                }

                @Override
                public final void onClick(View view2) {
                    az azVar;
                    switch (r2) {
                        case 0:
                            ny nyVar = this.f28202b.S;
                            iy iyVar = nyVar.f29073c;
                            int childCount = iyVar.getChildCount();
                            for (int i162 = 0; i162 < childCount; i162++) {
                                ((nh.c) iyVar.getChildAt(i162)).a(false, true);
                            }
                            nyVar.d = 0L;
                            nyVar.F.f29085b.a(false, true);
                            nyVar.l();
                            return;
                        case 1:
                            iz izVar = this.f28202b.f29165z0;
                            hz hzVar = izVar.f27515c;
                            int childCount2 = hzVar.getChildCount();
                            for (int i17 = 0; i17 < childCount2; i17++) {
                                ((nh.c) hzVar.getChildAt(i17)).a(false, true);
                            }
                            izVar.d = 0L;
                            izVar.Q.f29082a.a(false, true);
                            izVar.l();
                            return;
                        case 2:
                            oy oyVar = this.f28202b.f29145t1;
                            if (oyVar != null) {
                                oyVar.w();
                                return;
                            }
                            return;
                        default:
                            nz nzVar = this.f28202b;
                            int currentItem = nzVar.h.getCurrentItem();
                            if (currentItem == 0) {
                                azVar = nzVar.V;
                            } else if (currentItem == 1) {
                                azVar = nzVar.f29127o0;
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
            ax axVar = new ax(this, context2, d6Var, n2Var, z18);
            this.B0 = axVar;
            axVar.setDragEnabled(true);
            axVar.setWillNotDraw(false);
            axVar.setType(zm0Var);
            axVar.setUnderlineHeight(vwVar.canScrollVertically(-1) ? AndroidUtilities.getShadowHeight() : 0);
            axVar.setIndicatorColor(z(i10));
            axVar.setUnderlineColor(z(i16));
            if (viewGroup != null && z18) {
                bx bxVar = new bx(this, context2);
                this.C0 = bxVar;
                bxVar.addView(axVar, w7.z5.e(-1, 36, 51));
                viewGroup.addView(bxVar, w7.z5.c(-2.0f, -1));
            } else {
                twVar.addView(axVar, w7.z5.e(-1, 36, 51));
            }
            W(true);
            axVar.setDelegate(new iw(this, 4));
            vwVar.setOnScrollListener(new mz(this, 0));
            nh.b bVar2 = new nh.b(context2, d6Var);
            this.N = bVar2;
            ci.m6 m6Var2 = new ci.m6(context2, 3, d6Var);
            this.M = m6Var2;
            m6Var2.setVisibility(8);
            m6Var2.addView(bVar2, w7.z5.d(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
            twVar.addView(m6Var2, w7.z5.e(-1, -2, 80));
        } else {
            z18 = z14;
        }
        this.f29096e.clear();
        this.f29096e.addAll(this.d);
        cx cxVar = new cx(this, context2);
        this.h = cxVar;
        li.m mVar2 = this.f29122m2;
        mVar2.getClass();
        cxVar.b(new ai.n7(mVar2, 1));
        cxVar.setOverScrollMode(2);
        hy hyVar = new hy(this);
        this.L0 = hyVar;
        cxVar.setAdapter(hyVar);
        dx dxVar = new dx(this, context2);
        this.f29157x = dxVar;
        dxVar.setHapticFeedbackEnabled(true);
        dxVar.setImageResource(R.drawable.smiles_tab_clear);
        int v = z16 ? v(0.6f) : z(org.telegram.ui.ActionBar.i6.Re);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        dxVar.setColorFilter(new PorterDuffColorFilter(v, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        dxVar.setScaleType(scaleType);
        dxVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
        dxVar.setFocusable(true);
        dxVar.setOnClickListener(new Object());
        w7.b6.a(dxVar);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f29136r = frameLayout;
        if (z13) {
            addView(frameLayout, w7.z5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, (AndroidUtilities.getShadowHeight() / AndroidUtilities.density) + 40.0f));
        } else {
            addView(frameLayout, w7.z5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.f29140s = frameLayout2;
        addView(frameLayout2, w7.z5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 64.0f));
        FrameLayout frameLayout3 = new FrameLayout(context2);
        this.f29123n = frameLayout3;
        View view2 = new View(context2);
        this.v = view2;
        frameLayout3.addView(view2, new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(40.0f), 83));
        if (z13) {
            addView(frameLayout3, w7.z5.e(-1, 48, 80));
            frameLayout3.addView(dxVar, w7.z5.d(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
            if (z11) {
                ImageView imageView = new ImageView(context2);
                this.f29161y = imageView;
                imageView.setImageResource(R.drawable.smiles_tab_settings);
                imageView.setColorFilter(new PorterDuffColorFilter(z16 ? v(0.6f) : z(org.telegram.ui.ActionBar.i6.Re), mode));
                imageView.setScaleType(scaleType);
                imageView.setFocusable(true);
                imageView.setContentDescription(LocaleController.getString(R.string.Settings));
                w7.b6.a(imageView);
                frameLayout3.addView(imageView, w7.z5.d(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
                imageView.setOnClickListener(new View.OnClickListener(this) {
                    public final nz f28202b;

                    {
                        this.f28202b = this;
                    }

                    @Override
                    public final void onClick(View view22) {
                        az azVar;
                        switch (r2) {
                            case 0:
                                ny nyVar = this.f28202b.S;
                                iy iyVar = nyVar.f29073c;
                                int childCount = iyVar.getChildCount();
                                for (int i162 = 0; i162 < childCount; i162++) {
                                    ((nh.c) iyVar.getChildAt(i162)).a(false, true);
                                }
                                nyVar.d = 0L;
                                nyVar.F.f29085b.a(false, true);
                                nyVar.l();
                                return;
                            case 1:
                                iz izVar = this.f28202b.f29165z0;
                                hz hzVar = izVar.f27515c;
                                int childCount2 = hzVar.getChildCount();
                                for (int i17 = 0; i17 < childCount2; i17++) {
                                    ((nh.c) hzVar.getChildAt(i17)).a(false, true);
                                }
                                izVar.d = 0L;
                                izVar.Q.f29082a.a(false, true);
                                izVar.l();
                                return;
                            case 2:
                                oy oyVar = this.f28202b.f29145t1;
                                if (oyVar != null) {
                                    oyVar.w();
                                    return;
                                }
                                return;
                            default:
                                nz nzVar = this.f28202b;
                                int currentItem = nzVar.h.getCurrentItem();
                                if (currentItem == 0) {
                                    azVar = nzVar.V;
                                } else if (currentItem == 1) {
                                    azVar = nzVar.f29127o0;
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
            qd0 qd0Var = new qd0(context2, d6Var);
            this.f29153w = qd0Var;
            qd0Var.setViewPager(cxVar);
            qd0Var.setShouldExpand(false);
            qd0Var.setIndicatorHeight(AndroidUtilities.dp(3.0f));
            qd0Var.setIndicatorColor(i0.a.k(z(org.telegram.ui.ActionBar.i6.Oe), 20));
            qd0Var.setUnderlineHeight(0);
            qd0Var.setTabPaddingLeftRight(AndroidUtilities.dp(11.0f));
            qd0Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f));
            frameLayout3.addView(qd0Var, w7.z5.e(-2, 48, 81));
            qd0Var.setOnPageChangeListener(new fx(this, z18));
            ImageView imageView2 = new ImageView(context2);
            this.E = imageView2;
            imageView2.setImageResource(R.drawable.smiles_tab_search);
            imageView2.setColorFilter(new PorterDuffColorFilter(z16 ? v(0.6f) : z(org.telegram.ui.ActionBar.i6.Re), mode));
            imageView2.setScaleType(scaleType);
            imageView2.setContentDescription(LocaleController.getString(R.string.Search));
            imageView2.setFocusable(true);
            imageView2.setVisibility(8);
            frameLayout3.addView(imageView2, w7.z5.d(48, 48.0f, 83, 2.0f, 0.0f, 2.0f, 0.0f));
            imageView2.setOnClickListener(new View.OnClickListener(this) {
                public final nz f28202b;

                {
                    this.f28202b = this;
                }

                @Override
                public final void onClick(View view22) {
                    az azVar;
                    switch (r2) {
                        case 0:
                            ny nyVar = this.f28202b.S;
                            iy iyVar = nyVar.f29073c;
                            int childCount = iyVar.getChildCount();
                            for (int i162 = 0; i162 < childCount; i162++) {
                                ((nh.c) iyVar.getChildAt(i162)).a(false, true);
                            }
                            nyVar.d = 0L;
                            nyVar.F.f29085b.a(false, true);
                            nyVar.l();
                            return;
                        case 1:
                            iz izVar = this.f28202b.f29165z0;
                            hz hzVar = izVar.f27515c;
                            int childCount2 = hzVar.getChildCount();
                            for (int i17 = 0; i17 < childCount2; i17++) {
                                ((nh.c) hzVar.getChildAt(i17)).a(false, true);
                            }
                            izVar.d = 0L;
                            izVar.Q.f29082a.a(false, true);
                            izVar.l();
                            return;
                        case 2:
                            oy oyVar = this.f28202b.f29145t1;
                            if (oyVar != null) {
                                oyVar.w();
                                return;
                            }
                            return;
                        default:
                            nz nzVar = this.f28202b;
                            int currentItem = nzVar.h.getCurrentItem();
                            if (currentItem == 0) {
                                azVar = nzVar.V;
                            } else if (currentItem == 1) {
                                azVar = nzVar.f29127o0;
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
            addView(frameLayout3, w7.z5.d(56, 48.0f, (LocaleController.isRTL ? 3 : 5) | 80, 0.0f, 0.0f, 2.0f, 0.0f));
            org.telegram.ui.Cells.z h02 = org.telegram.ui.ActionBar.i6.h0(AndroidUtilities.dp(56.0f), z(i15), z(i15));
            w7.b6.a(dxVar);
            dxVar.setPadding(0, 0, AndroidUtilities.dp(2.0f), 0);
            dxVar.setBackground(h02);
            dxVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
            dxVar.setFocusable(true);
            frameLayout3.addView(dxVar, w7.z5.d(48, 48.0f, 51, 2.0f, 0.0f, 2.0f, 0.0f));
            view2.setVisibility(8);
        }
        addView(cxVar, 0, w7.z5.e(-1, -1, 51));
        ai.p4 p4Var = new ai.p4(context2, 22);
        this.N0 = p4Var;
        p4Var.setBackground(org.telegram.ui.ActionBar.i6.b0(AndroidUtilities.dp(6.0f), z(org.telegram.ui.ActionBar.i6.f21066qf)));
        p4Var.setTextColor(z(org.telegram.ui.ActionBar.i6.f21047pf));
        p4Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f));
        p4Var.setGravity(16);
        p4Var.setTextSize(1, 14.0f);
        p4Var.setVisibility(4);
        addView(p4Var, w7.z5.d(-2, -2.0f, 81, 5.0f, 0.0f, 5.0f, 53.0f));
        this.C1 = AndroidUtilities.dp(AndroidUtilities.isTablet() ? 40.0f : 32.0f);
        Field field2 = bv.f25057f;
        bv bvVar = new bv(new av(context2, d6Var));
        if (bv.f25057f == null) {
            try {
                field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
                try {
                    field.setAccessible(true);
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                field = null;
            }
            bv.f25057f = field;
        }
        Field field3 = bv.f25057f;
        if (field3 != null) {
            try {
                bvVar.f25059a = (ViewTreeObserver.OnScrollChangedListener) field3.get(bvVar);
                bv.f25057f.set(bvVar, bv.f25058g);
            } catch (Exception unused3) {
                bvVar.f25059a = null;
            }
        }
        this.B1 = bvVar;
        bvVar.f25061c.setOnSelectionUpdateListener(new d(this, 10));
        this.A1 = MessagesController.getGlobalEmojiSettings().getInt("selected_page", 0);
        Emoji.loadRecentEmoji();
        wxVar.F(false);
        G(true, z11, z12, false);
        if (Build.VERSION.SDK_INT >= 31) {
            ah.i iVar = new ah.i();
            this.f29115j2 = iVar;
            this.f29122m2.a(iVar);
            fh.d dVar3 = new fh.d(null);
            dVar3.f9862f = cVar;
            dVar3.d = iVar;
            dVar3.f9861e = -2;
            ah.c cVar2 = new ah.c(dVar3);
            this.f29120l2 = cVar2;
            cVar2.f461i = LiteMode.isEnabled(262144);
            int dp2 = AndroidUtilities.dp(LiteMode.isEnabled(262144) ? 8.0f : 48.0f);
            cVar2.f456b = dp2;
            cVar2.f457c = dp2;
            cVar2.h = this.f29122m2;
        } else {
            ah.c cVar3 = new ah.c(cVar);
            this.f29120l2 = cVar3;
            cVar3.h = this.f29122m2;
            this.f29115j2 = null;
        }
        this.f29118k2 = new mh(this, 1);
        setBlurredBackgroundDrawableFactory(this.f29120l2);
        this.f29122m2.h(this);
        this.f29122m2.f15661a = new iw(this, 0);
    }

    public static void a(nz nzVar, boolean z10) {
        qw qwVar = nzVar.f29107h0;
        if (qwVar != null) {
            int childCount = qwVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = qwVar.getChildAt(i10);
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
        org.telegram.ui.ActionBar.n2 n2Var = nzVar.Y1;
        int i10 = nzVar.f29091c1;
        ArrayList arrayList = nzVar.f29134q1;
        if (wyVar != null) {
            if (wyVar.getSpan() != null) {
                if (nzVar.f29145t1 != null) {
                    long j3 = wyVar.getSpan().documentId;
                    TLRPC.Document document = wyVar.getSpan().document;
                    ay ayVar = wyVar.f32668e;
                    if (ayVar != null && ayVar.f24708i) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (document == null) {
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            ay ayVar2 = (ay) arrayList.get(i11);
                            int i12 = 0;
                            while (true) {
                                ArrayList arrayList2 = ayVar2.f24704c;
                                if (arrayList2 != null && i12 < arrayList2.size()) {
                                    if (((TLRPC.Document) ayVar2.f24704c.get(i12)).f20043id == j3) {
                                        document = (TLRPC.Document) ayVar2.f24704c.get(i12);
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
                    if (!MessageObject.isFreeEmoji(document) && !UserConfig.getInstance(i10).isPremium() && (((oyVar = nzVar.f29145t1) == null || !oyVar.g()) && !nzVar.U0 && !z10)) {
                        nzVar.K(false);
                        if (n2Var != null) {
                            ycVar = yc.a0(n2Var);
                        } else {
                            ycVar = new yc(nzVar.f29136r, nzVar.Z1);
                        }
                        if (!nzVar.f29109h2 && n2Var != null) {
                            ycVar.J(R.raw.saved_messages, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint2)), LocaleController.getString(R.string.Open), new hw(nzVar, 4)).j();
                        } else {
                            ycVar.q(document, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint)), LocaleController.getString(R.string.PremiumMore), new hw(nzVar, 3)).j();
                        }
                        nzVar.f29109h2 = !nzVar.f29109h2;
                        return;
                    }
                    nzVar.C2 = SystemClock.elapsedRealtime();
                    nzVar.K(true);
                    nzVar.h("animated_" + j3);
                    nzVar.f29145t1.x(j3, document, str5, wyVar.f32667c);
                    return;
                }
                return;
            }
            nzVar.C2 = SystemClock.elapsedRealtime();
            nzVar.K(true);
            if (str != null) {
                str2 = str;
            } else {
                str2 = (String) wyVar.getTag();
            }
            new SpannableStringBuilder().append((CharSequence) str2);
            if (str == null) {
                if (!wyVar.f32667c && (str3 = Emoji.emojiColor.get(str2)) != null) {
                    str2 = g(str2, str3);
                }
                nzVar.h(str2);
                oy oyVar2 = nzVar.f29145t1;
                if (oyVar2 != null) {
                    oyVar2.l(Emoji.fixEmoji(str2));
                    return;
                }
                return;
            }
            oy oyVar3 = nzVar.f29145t1;
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
        oy oyVar = nzVar.f29145t1;
        if ((oyVar == null || !oyVar.z()) && !nzVar.J0) {
            zl0 x10 = nzVar.x(i10);
            if (i11 > 0 && x10 != null && x10.getVisibility() == 0 && (K = x10.K(0)) != null && K.f46523a.getTop() + nzVar.f29087b1 >= x10.getPaddingTop()) {
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
                nzVar.X();
            } else {
                nzVar.y(i10).setTranslationY(Math.max(-AndroidUtilities.dp(48.0f), iArr[i10]));
            }
        }
    }

    public static void f(nz nzVar, boolean z10) {
        int N0;
        ty tyVar = nzVar.f29110i0;
        sw swVar = nzVar.f29127o0;
        qw qwVar = nzVar.f29107h0;
        if (qwVar != null && (qwVar.getAdapter() instanceof sy)) {
            sy syVar = (sy) qwVar.getAdapter();
            if (!syVar.f30894s && syVar.h == 0 && !syVar.f30896x.isEmpty() && (N0 = tyVar.N0()) != -1 && N0 > tyVar.B() - 5) {
                String str = syVar.f30895w;
                String str2 = syVar.f30893r;
                boolean z11 = syVar.v;
                syVar.F(str, str2, true, z11, z11);
            }
        }
        oy oyVar = nzVar.f29145t1;
        if (oyVar != null && oyVar.z()) {
            boolean z12 = false;
            s4.c1 K = qwVar.K(0);
            if (K == null) {
                az.a(swVar, true, !z10);
                return;
            }
            if (K.f46523a.getTop() < qwVar.getPaddingTop()) {
                z12 = true;
            }
            az.a(swVar, z12, !z10);
        } else if (swVar != null && qwVar != null) {
            swVar.f24711a.a(true, !z10);
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
        String v = t8.b.v(str, str2);
        if (str3 != null) {
            v = t8.b.v(v, str3);
        }
        if (z10) {
            return t8.b.v(v, "\u200d➡");
        }
        return v;
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
        sw swVar = this.f29127o0;
        if (swVar != null) {
            swVar.b();
        }
        nw nwVar = this.V;
        if (nwVar != null) {
            nwVar.b();
        }
    }

    public final void B(boolean z10, boolean z11) {
        zy zyVar;
        boolean z12;
        if (this.A1 != 0 && this.f29155w1) {
            this.A1 = 0;
        }
        if (this.A1 == 0 && this.f29151v1) {
            this.A1 = 1;
        }
        int i10 = this.A1;
        cx cxVar = this.h;
        if (i10 != 0 && !z10 && this.f29096e.size() != 1) {
            int i11 = this.A1;
            if (i11 == 1) {
                J(false, false);
                if (!this.f29147u0 && !this.f29150v0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                O(z12, false);
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
                J(false, false);
                O(false, false);
                if (cxVar.getCurrentItem() != 1) {
                    cxVar.x(1, false);
                }
                ux uxVar = this.f29130p0;
                if (uxVar != null) {
                    uxVar.m(0);
                }
                sw swVar = this.f29127o0;
                if (swVar != null && (zyVar = swVar.f24717r) != null) {
                    zyVar.H1(null);
                }
            }
        } else {
            J(true, false);
            O(false, false);
            if (cxVar.getCurrentItem() != 0) {
                cxVar.x(0, !z10);
            }
            if (z11) {
                AndroidUtilities.runOnUIThread(new hw(this, 5), 350L);
            }
        }
        K(true);
    }

    public final void C() {
        ez ezVar = this.f29162y0;
        if (ezVar != null) {
            ezVar.l();
        }
        iz izVar = this.f29165z0;
        if (izVar != null) {
            izVar.l();
        }
        if (org.telegram.ui.rt.q().E) {
            org.telegram.ui.rt.q().n();
        }
        org.telegram.ui.rt.q().u();
    }

    public final void D(int i10) {
        oy oyVar = this.f29145t1;
        if ((oyVar != null && oyVar.z()) || i10 == 0) {
            return;
        }
        HorizontalScrollView y3 = y(i10);
        this.Q0[i10] = 0;
        y3.setTranslationY(0);
    }

    public final void E(int i10, int i11) {
        nx nxVar = this.Q;
        View m10 = nxVar.m(i10);
        int L0 = nxVar.L0();
        int i12 = 1;
        if ((m10 == null && Math.abs(i10 - L0) > nxVar.J * 9.0f) || !SharedConfig.animationsEnabled()) {
            if (nxVar.L0() < i10) {
                i12 = 0;
            }
            bl0 bl0Var = this.f29086b0;
            bl0Var.f24994b = i12;
            bl0Var.d(i10, i11, false, false);
            return;
        }
        this.J0 = true;
        ci.m1 m1Var = new ci.m1(this, this.P.getContext(), 1);
        m1Var.f46691a = i10;
        m1Var.f14236p = i11;
        nxVar.w0(m1Var);
    }

    public final void F(int i10, int i11) {
        ww wwVar = this.E0;
        View m10 = wwVar.m(i10);
        int L0 = wwVar.L0();
        int i12 = 1;
        if (m10 == null && Math.abs(i10 - L0) > 40) {
            if (wwVar.L0() < i10) {
                i12 = 0;
            }
            bl0 bl0Var = this.f29083a0;
            bl0Var.f24994b = i12;
            bl0Var.d(i10, i11, false, false);
            return;
        }
        this.J0 = true;
        this.D0.y0(i10);
    }

    public final void G(boolean z10, boolean z11, boolean z12, boolean z13) {
        ArrayList arrayList = this.f29096e;
        arrayList.clear();
        boolean z14 = false;
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.d;
            if (i10 >= arrayList2.size()) {
                break;
            }
            if (((jz) arrayList2.get(i10)).f27915a == 0 && z10) {
                arrayList.add((jz) arrayList2.get(i10));
            }
            if (((jz) arrayList2.get(i10)).f27915a == 1 && z12) {
                arrayList.add((jz) arrayList2.get(i10));
            }
            if (((jz) arrayList2.get(i10)).f27915a == 2 && z11) {
                arrayList.add((jz) arrayList2.get(i10));
            }
            i10++;
        }
        qd0 qd0Var = this.f29153w;
        if (qd0Var != null) {
            if (arrayList.size() > 1) {
                z14 = true;
            }
            AndroidUtilities.updateViewVisibilityAnimated(qd0Var, z14, 1.0f, z13);
        }
        cx cxVar = this.h;
        if (cxVar != null) {
            cxVar.setAdapter(null);
            cxVar.setAdapter(this.L0);
            if (qd0Var != null) {
                qd0Var.setViewPager(cxVar);
            }
        }
    }

    public final void H(final nh.b bVar, final TLObject tLObject, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final boolean z10, boolean z11) {
        String formatPluralString;
        iz izVar;
        ny nyVar;
        if (stickerSet != null) {
            if (!z10 || (nyVar = this.S) == null || nyVar.d == stickerSet.f20064id) {
                if (!z10 && (izVar = this.f29165z0) != null && izVar.d != stickerSet.f20064id) {
                    return;
                }
                final boolean isStickerPackInstalled = MediaDataController.getInstance(this.f29091c1).isStickerPackInstalled(stickerSet.f20064id);
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
                bVar.f16899h0.a(!isStickerPackInstalled, z11);
                bVar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        int i10;
                        nz nzVar = nz.this;
                        MediaDataController mediaDataController = MediaDataController.getInstance(nzVar.f29091c1);
                        Context context = nzVar.getContext();
                        if (isStickerPackInstalled) {
                            i10 = 0;
                        } else {
                            i10 = 2;
                        }
                        org.telegram.ui.ActionBar.n2 n2Var = nzVar.Y1;
                        FrameLayout frameLayout = nzVar.f29140s;
                        nh.b bVar2 = bVar;
                        TLObject tLObject2 = tLObject;
                        TLRPC.StickerSet stickerSet2 = stickerSet;
                        TLRPC.Document document2 = document;
                        boolean z12 = z10;
                        mediaDataController.toggleStickerSet(context, tLObject2, document2, i10, n2Var, frameLayout, false, true, new i2.c1(nzVar, bVar2, tLObject2, stickerSet2, document2, z12, 9), false);
                        nzVar.H(bVar2, tLObject2, stickerSet2, document2, z12, true);
                    }
                });
            }
        }
    }

    public final void I(long j3, boolean z10, boolean z11) {
        int i10;
        View childAt;
        float f7;
        qd0 qd0Var = this.f29153w;
        if (qd0Var != null) {
            this.f29151v1 = z10;
            this.f29155w1 = z11;
            if (!z11 && !z10) {
                this.f29148u1 = 0L;
            } else {
                this.f29148u1 = j3;
            }
            if (z11) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            LinearLayout linearLayout = qd0Var.d;
            if (i10 >= linearLayout.getChildCount()) {
                childAt = null;
            } else {
                childAt = linearLayout.getChildAt(i10);
            }
            if (childAt != null) {
                if (this.f29148u1 != 0) {
                    f7 = 0.15f;
                } else {
                    f7 = 1.0f;
                }
                childAt.setAlpha(f7);
                cx cxVar = this.h;
                if (z11) {
                    if (this.f29148u1 != 0 && cxVar.getCurrentItem() != 0) {
                        J(true, true);
                        O(false, true);
                        cxVar.x(0, false);
                    }
                } else if (this.f29148u1 != 0 && cxVar.getCurrentItem() != 1) {
                    J(false, true);
                    O(false, true);
                    cxVar.x(1, false);
                }
            }
        }
    }

    public final void J(boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        float f12;
        dx dxVar = this.f29157x;
        if (!z10 || dxVar.getTag() != null) {
            if ((!z10 && dxVar.getTag() != null) || this.f29126n2) {
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
                this.F.setInterpolator(tr.f31141g);
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

    public final void K(boolean z10) {
        Integer num;
        this.H = 0.0f;
        oy oyVar = this.f29145t1;
        if (oyVar != null && oyVar.z()) {
            z10 = false;
        }
        FrameLayout frameLayout = this.f29123n;
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

    public final void L(boolean z10, boolean z11) {
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
                this.W.setInterpolator(tr.f31141g);
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

    public final void M(boolean z10) {
        for (int i10 = 0; i10 < 3; i10++) {
            s4.s w10 = w(i10);
            int L0 = w10.L0();
            if (z10) {
                if (L0 == 1 || L0 == 2) {
                    w10.n0(0);
                    D(i10);
                }
            } else if (L0 == 0) {
                w10.h1(0, 0);
            }
        }
    }

    public final void N(boolean z10, boolean z11, boolean z12) {
        float f7;
        float translationY;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.Chat chat = MessagesController.getInstance(this.f29091c1).getChat(Long.valueOf(this.f29148u1));
        if (chat != null) {
            ai.p4 p4Var = this.N0;
            if (z10) {
                if (!ChatObject.hasAdminRights(chat) && (tL_chatBannedRights = chat.default_banned_rights) != null && (tL_chatBannedRights.send_stickers || (z11 && tL_chatBannedRights.send_plain))) {
                    org.telegram.ui.ActionBar.n2 n2Var = this.Y1;
                    if (!(n2Var instanceof org.telegram.ui.yn) || !((org.telegram.ui.yn) n2Var).K6()) {
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
            this.H2.setInterpolator(tr.h);
            this.H2.start();
        }
    }

    public final void O(boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        float f12;
        ImageView imageView = this.f29161y;
        if (imageView != null && !this.f29129o2) {
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
                        this.G.setInterpolator(tr.f31141g);
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

    public final void P() {
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
            float f11 = this.f29135q2;
            FrameLayout frameLayout = this.f29123n;
            if (f11 >= 0.0f) {
                f10 += getMeasuredHeight() - this.f29135q2;
            } else if (frameLayout.getTop() - f10 < 0.0f || !this.f29156w2) {
                f10 = 0.0f;
            }
            float lerp = (-f10) + AndroidUtilities.lerp(AndroidUtilities.dp(50.0f), -this.f29132p2, this.D2.f15434e);
            frameLayout.setTranslationY(lerp);
            if (this.f29093d0) {
                this.f29136r.setTranslationY(lerp);
            }
        }
    }

    public final void Q() {
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
        boolean z28 = this.f29147u0;
        View view = this.v;
        if (!z28) {
            setBackground(null);
            view.setBackground(null);
        } else if (!AndroidUtilities.isInMultiwindow && !this.N1) {
            int i10 = org.telegram.ui.ActionBar.i6.He;
            setBackgroundColor(z(i10));
            if (this.f29093d0) {
                view.setBackgroundColor(z(i10));
            }
        } else {
            Drawable background = getBackground();
            if (background != null) {
                background.setColorFilter(new PorterDuffColorFilter(z(org.telegram.ui.ActionBar.i6.He), PorterDuff.Mode.MULTIPLY));
            }
        }
        rx rxVar = this.I;
        if (rxVar != null) {
            if (this.f29147u0) {
                rxVar.setBackgroundColor(z(org.telegram.ui.ActionBar.i6.He));
                this.O.setBackgroundColor(z(org.telegram.ui.ActionBar.i6.Ke));
            } else {
                rxVar.setBackground(null);
            }
        }
        bv bvVar = this.B1;
        if (bvVar != null) {
            bvVar.f25061c.a();
        }
        int i11 = 0;
        while (true) {
            azVar = this.V;
            z10 = this.f29112i2;
            if (i11 >= 3) {
                break;
            }
            if (i11 == 0) {
                azVar = this.G0;
            } else if (i11 != 1) {
                azVar = this.f29127o0;
            }
            if (azVar != null) {
                lq lqVar = azVar.d;
                FrameLayout frameLayout = azVar.f24716n;
                View view2 = azVar.f24715f;
                if (this.f29147u0) {
                    view2.setBackgroundColor(z(org.telegram.ui.ActionBar.i6.He));
                } else {
                    view2.setBackground(null);
                }
                azVar.f24714e.setBackgroundColor(z(org.telegram.ui.ActionBar.i6.Ke));
                qn0 qn0Var = azVar.f24713c;
                if (z10) {
                    z24 = v(0.4f);
                } else {
                    z24 = z(org.telegram.ui.ActionBar.i6.Je);
                }
                qn0Var.a(z24);
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
                lqVar.setHintTextColor(z26);
                if (z10) {
                    z27 = v(0.8f);
                } else {
                    z27 = z(org.telegram.ui.ActionBar.i6.G6);
                }
                lqVar.setTextColor(z27);
            }
            i11++;
        }
        Paint paint = this.f29142s1;
        if (paint != null) {
            paint.setColor(z(org.telegram.ui.ActionBar.i6.f20769af));
        }
        zx zxVar = this.P;
        if (zxVar != null) {
            zxVar.setGlowColor(z(org.telegram.ui.ActionBar.i6.He));
        }
        vw vwVar = this.D0;
        if (vwVar != null) {
            vwVar.setGlowColor(z(org.telegram.ui.ActionBar.i6.He));
        }
        ax axVar = this.B0;
        if (axVar != null) {
            axVar.setIndicatorColor(z(org.telegram.ui.ActionBar.i6.Qe));
            axVar.setUnderlineColor(z(org.telegram.ui.ActionBar.i6.Ke));
            if (this.f29147u0) {
                axVar.setBackgroundColor(z(org.telegram.ui.ActionBar.i6.He));
            } else {
                axVar.setBackground(null);
            }
        }
        ux uxVar = this.f29130p0;
        if (uxVar != null) {
            uxVar.setIndicatorColor(z(org.telegram.ui.ActionBar.i6.Qe));
            uxVar.setUnderlineColor(z(org.telegram.ui.ActionBar.i6.Ke));
            if (this.f29147u0) {
                uxVar.setBackgroundColor(z(org.telegram.ui.ActionBar.i6.He));
            } else {
                uxVar.setBackground(null);
            }
        }
        dx dxVar = this.f29157x;
        if (dxVar != null) {
            if (z10) {
                z23 = v(0.6f);
            } else {
                z23 = z(org.telegram.ui.ActionBar.i6.Re);
            }
            dxVar.setColorFilter(new PorterDuffColorFilter(z23, PorterDuff.Mode.MULTIPLY));
            if (azVar == null) {
                Drawable background3 = dxVar.getBackground();
                int i12 = org.telegram.ui.ActionBar.i6.He;
                org.telegram.ui.ActionBar.i6.B1(background3, z(i12), false);
                org.telegram.ui.ActionBar.i6.B1(dxVar.getBackground(), z(i12), true);
            }
        }
        ImageView imageView = this.f29161y;
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
            ((ShapeDrawable) p4Var.getBackground()).getPaint().setColor(z(org.telegram.ui.ActionBar.i6.f21066qf));
            p4Var.setTextColor(z(org.telegram.ui.ActionBar.i6.f21047pf));
        }
        sy syVar = this.f29113j0;
        if (syVar != null) {
            uy uyVar = syVar.f30890e;
            ImageView imageView3 = uyVar.f31459a;
            int i13 = org.telegram.ui.ActionBar.i6.Le;
            imageView3.setColorFilter(new PorterDuffColorFilter(z(i13), PorterDuff.Mode.MULTIPLY));
            uyVar.f31460b.setTextColor(z(i13));
            uyVar.f31461c.setProgressColor(z(org.telegram.ui.ActionBar.i6.f20890h6));
        }
        this.f29099e2 = new PorterDuffColorFilter(z(org.telegram.ui.ActionBar.i6.Oh), PorterDuff.Mode.SRC_IN);
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
        if (rxVar != null && (cwVar = rxVar.f26939y) != null) {
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
        org.telegram.ui.ActionBar.t5 t5Var = this.a2;
        if (t5Var != null) {
            if (z10) {
                z13 = v(0.4f);
            } else {
                z13 = z(org.telegram.ui.ActionBar.i6.Ne);
            }
            org.telegram.ui.ActionBar.i6.y1(t5Var, z13, false);
            if (z10) {
                z14 = v(0.8f);
            } else {
                z14 = z(org.telegram.ui.ActionBar.i6.Oe);
            }
            org.telegram.ui.ActionBar.i6.y1(t5Var, z14, true);
        }
        org.telegram.ui.ActionBar.t5 t5Var2 = this.f29088b2;
        if (t5Var2 != null) {
            if (z10) {
                z11 = v(0.4f);
            } else {
                z11 = z(org.telegram.ui.ActionBar.i6.Qe);
            }
            org.telegram.ui.ActionBar.i6.y1(t5Var2, z11, false);
            if (z10) {
                z12 = v(0.8f);
            } else {
                z12 = z(org.telegram.ui.ActionBar.i6.Qe);
            }
            org.telegram.ui.ActionBar.i6.y1(t5Var2, z12, true);
        }
    }

    public final void R() {
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

    public final void S(int i10) {
        int i11;
        if (!this.f29101f0) {
            int i12 = -1;
            if (i10 != -1) {
                int size = getRecentEmoji().size() + (this.f29093d0 ? 1 : 0);
                wx wxVar = this.R;
                int i13 = wxVar.f32650c;
                ArrayList arrayList = wxVar.f32657x;
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
                                ay ayVar = (ay) this.f29134q1.get(size2);
                                while (i14 < emojipacks.size()) {
                                    long j3 = emojipacks.get(i14).f24703b.f20064id;
                                    long j10 = ayVar.f24703b.f20064id;
                                    if (j3 == j10 && (!ayVar.f24707g || (!ayVar.f24706f && !this.f29131p1.contains(Long.valueOf(j10))))) {
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

    public final void T() {
        boolean z10;
        boolean z11;
        int i10;
        zy zyVar;
        int i11;
        boolean z12;
        boolean z13;
        ux uxVar = this.f29130p0;
        int currentPosition = uxVar.getCurrentPosition();
        int i12 = this.f29137r0;
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
        boolean isEmpty = this.f29111i1.isEmpty();
        uxVar.d(false);
        this.f29137r0 = -2;
        this.f29141s0 = -2;
        this.f29144t0 = -2;
        Drawable[] drawableArr = this.Z0;
        if (!isEmpty) {
            this.f29137r0 = 0;
            uxVar.b(0, drawableArr[0]).setContentDescription(LocaleController.getString(R.string.RecentStickers));
            i10 = 1;
        } else {
            i10 = 0;
        }
        this.f29141s0 = i10;
        uxVar.b(1, drawableArr[1]).setContentDescription(LocaleController.getString(R.string.FeaturedGifs));
        this.f29144t0 = i10 + 1;
        AndroidUtilities.dp(13.0f);
        AndroidUtilities.dp(11.0f);
        int i13 = this.f29091c1;
        ArrayList<String> arrayList = MessagesController.getInstance(i13).gifSearchEmojies;
        int size = arrayList.size();
        int i14 = 0;
        while (i14 < size) {
            String str = arrayList.get(i14);
            Emoji.EmojiDrawable emojiDrawable = Emoji.getEmojiDrawable(str);
            if (emojiDrawable != null) {
                TLRPC.Document emojiAnimatedSticker = MediaDataController.getInstance(i13).getEmojiAnimatedSticker(str);
                String h = hg.k0.h(i14 + 3, "tab");
                int i15 = uxVar.f24605x;
                uxVar.f24605x = i15 + 1;
                yx0 yx0Var = (yx0) uxVar.f24595n.get(h);
                if (yx0Var != null) {
                    uxVar.g(h, yx0Var, i15);
                    i11 = currentPosition;
                    z12 = z11;
                } else {
                    i11 = currentPosition;
                    z12 = z11;
                    yx0Var = new yx0(uxVar.getContext(), 2);
                    yx0Var.setFocusable(true);
                    yx0Var.setOnClickListener(new tm0(uxVar, 2));
                    yx0Var.setExpanded(uxVar.f24588f0);
                    yx0Var.a(uxVar.f24591i0);
                    uxVar.f24585e.addView(yx0Var, i15);
                }
                yx0Var.d = false;
                yx0Var.setTag(R.id.index_tag, Integer.valueOf(i15));
                yx0Var.setTag(R.id.parent_tag, emojiDrawable);
                yx0Var.setTag(R.id.object_tag, emojiAnimatedSticker);
                if (i15 == uxVar.f24606y) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                yx0Var.setSelected(z13);
                uxVar.h.put(h, yx0Var);
                yx0Var.setContentDescription(str);
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
            uxVar.m(this.f29141s0);
            sw swVar = this.f29127o0;
            if (swVar != null && (zyVar = swVar.f24717r) != null) {
                zyVar.H1(null);
                return;
            }
            return;
        }
        WeakHashMap weakHashMap = r0.i0.f45595a;
        if (uxVar.isLaidOut()) {
            if (!isEmpty && !z14) {
                uxVar.k(i16 + 1, 0);
            } else if (isEmpty && z14) {
                uxVar.k(i16 - 1, 0);
            }
        }
    }

    public final void U() {
        sy syVar;
        int size = this.f29111i1.size();
        long calcDocumentsHash = MediaDataController.calcDocumentsHash(this.f29111i1, Integer.MAX_VALUE);
        ArrayList<TLRPC.Document> recentGifs = MediaDataController.getInstance(this.f29091c1).getRecentGifs();
        this.f29111i1 = recentGifs;
        long calcDocumentsHash2 = MediaDataController.calcDocumentsHash(recentGifs, Integer.MAX_VALUE);
        if ((this.f29130p0 != null && size == 0 && !this.f29111i1.isEmpty()) || (size != 0 && this.f29111i1.isEmpty())) {
            T();
        }
        if ((size != this.f29111i1.size() || calcDocumentsHash != calcDocumentsHash2) && (syVar = this.f29124n0) != null) {
            syVar.l();
        }
    }

    public final void W(boolean z10) {
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
            xb1 xb1Var = axVar.f24585e;
            if (axVar.f24602s != null) {
                return;
            }
            this.F1 = -2;
            this.G1 = -2;
            this.H1 = -2;
            this.I1 = -2;
            this.f29097e0 = false;
            this.E1 = 0;
            int currentPosition = axVar.getCurrentPosition();
            boolean z16 = true;
            if (getParent() != null && getVisibility() == 0 && (this.f29163y1.size() != 0 || this.f29166z1.size() != 0)) {
                z11 = true;
            } else {
                z11 = false;
            }
            axVar.d(z11);
            int i11 = this.f29091c1;
            MediaDataController mediaDataController = MediaDataController.getInstance(i11);
            SharedPreferences emojiSettings = MessagesController.getEmojiSettings(i11);
            ArrayList arrayList3 = this.f29121m1;
            arrayList3.clear();
            ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = mediaDataController.getFeaturedStickerSets();
            int size = featuredStickerSets.size();
            for (int i12 = 0; i12 < size; i12++) {
                TLRPC.StickerSetCovered stickerSetCovered = featuredStickerSets.get(i12);
                if (!mediaDataController.isStickerPackInstalled(stickerSetCovered.set.f20064id)) {
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
            if (!isEmpty && (arrayList3.isEmpty() || emojiSettings.getLong("featured_hidden", 0L) == featuredStickerSets.get(0).set.f20064id)) {
                if (mediaDataController.getUnreadStickerSets().isEmpty()) {
                    i10 = 2;
                } else {
                    i10 = 3;
                }
                yx0 c10 = axVar.c(i10, drawableArr[i10]);
                c10.h.setText(LocaleController.getString(R.string.FeaturedStickersShort));
                c10.setContentDescription(LocaleController.getString(R.string.FeaturedStickers));
                int i13 = this.E1;
                this.H1 = i13;
                this.E1 = i13 + 1;
            }
            if (!this.f29117k1.isEmpty()) {
                int i14 = this.E1;
                this.G1 = i14;
                this.E1 = i14 + 1;
                yx0 c11 = axVar.c(1, drawableArr[1]);
                c11.h.setText(LocaleController.getString(R.string.FavoriteStickersShort));
                c11.setContentDescription(LocaleController.getString(R.string.FavoriteStickers));
            }
            if (!this.f29114j1.isEmpty()) {
                int i15 = this.E1;
                this.F1 = i15;
                this.E1 = i15 + 1;
                yx0 c12 = axVar.c(0, drawableArr[0]);
                c12.h.setText(LocaleController.getString(R.string.RecentStickersShort));
                c12.setContentDescription(LocaleController.getString(R.string.RecentStickers));
            }
            ArrayList arrayList4 = this.f29094d1;
            arrayList4.clear();
            org.telegram.ui.ActionBar.d6 d6Var = null;
            this.f29108h1 = null;
            this.f29102f1 = -1;
            this.f29098e1 = -10;
            if (this.E2 == null || z10) {
                this.E2 = new ArrayList(mediaDataController.getStickerSets(0));
            }
            ArrayList<TLRPC.TL_messages_stickerSet> arrayList5 = this.E2;
            int i16 = 0;
            while (true) {
                TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.f29159x1;
                if (i16 >= stickerSetCoveredArr.length) {
                    break;
                }
                TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCoveredArr[i16];
                long j10 = j3;
                if (stickerSetCovered2 != null) {
                    TLRPC.TL_messages_stickerSet stickerSetById = mediaDataController.getStickerSetById(stickerSetCovered2.set.f20064id);
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
                long j12 = MessagesController.getEmojiSettings(i11).getLong("group_hide_stickers_" + this.J1.f20038id, -1L);
                TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(this.J1.f20038id));
                if (chat != null && this.J1.stickerset != null && ChatObject.hasAdminRights(chat)) {
                    TLRPC.StickerSet stickerSet3 = this.J1.stickerset;
                    if (stickerSet3 != null) {
                        if (j12 == stickerSet3.f20064id) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        this.f29105g1 = z15;
                    }
                } else {
                    if (j12 != -1) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    this.f29105g1 = z14;
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
                        if (this.f29105g1) {
                            this.f29098e1 = arrayList4.size();
                            arrayList4.add(tL_messages_stickerSet3);
                        } else {
                            this.f29098e1 = 0;
                            arrayList4.add(0, tL_messages_stickerSet3);
                        }
                        if (!this.J1.can_set_stickers) {
                            tL_messages_stickerSet3 = null;
                        }
                        this.f29108h1 = tL_messages_stickerSet3;
                    }
                } else if (chatFull.can_set_stickers) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = new TLRPC.TL_messages_stickerSet();
                    if (this.f29105g1) {
                        this.f29098e1 = arrayList4.size();
                        arrayList4.add(tL_messages_stickerSet4);
                    } else {
                        this.f29098e1 = 0;
                        arrayList4.add(0, tL_messages_stickerSet4);
                    }
                }
            }
            int i18 = 0;
            while (i18 < arrayList4.size()) {
                if (i18 == this.f29098e1) {
                    TLRPC.Chat chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(this.J1.f20038id));
                    if (chat2 == null) {
                        arrayList4.remove(0);
                        i18--;
                    } else {
                        this.f29097e0 = z16;
                        String str = "chat" + chat2.f20037id;
                        int i19 = axVar.f24605x;
                        axVar.f24605x = i19 + 1;
                        yx0 yx0Var = (yx0) axVar.f24595n.get(str);
                        if (yx0Var != null) {
                            axVar.g(str, yx0Var, i19);
                        } else {
                            yx0Var = new yx0(axVar.getContext(), 0);
                            yx0Var.setFocusable(z16);
                            yx0Var.setOnClickListener(new tm0(axVar, 0));
                            xb1Var.addView(yx0Var, i19);
                            yx0Var.f33274w = z16;
                            h9 h9Var = new h9(d6Var);
                            h9Var.u(AndroidUtilities.dp(14.0f));
                            h9Var.k(UserConfig.selectedAccount, chat2);
                            int i20 = axVar.f24578a;
                            w9 w9Var = yx0Var.f33269e;
                            w9Var.setLayerNum(i20);
                            w9Var.e(chat2, h9Var);
                            w9Var.setAspectFit(z16);
                            yx0Var.setExpanded(axVar.f24588f0);
                            yx0Var.a(axVar.f24591i0);
                            yx0Var.h.setText(chat2.title);
                        }
                        yx0Var.d = z16;
                        yx0Var.setTag(R.id.index_tag, Integer.valueOf(i19));
                        if (i19 == axVar.f24606y) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        yx0Var.setSelected(z13);
                        axVar.h.put(str, yx0Var);
                    }
                } else {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet5 = (TLRPC.TL_messages_stickerSet) arrayList4.get(i18);
                    TLRPC.StickerSet stickerSet5 = tL_messages_stickerSet5.set;
                    if (stickerSet5 != null && stickerSet5.thumb_document_id != j11) {
                        for (int i21 = 0; i21 < tL_messages_stickerSet5.documents.size(); i21++) {
                            document = tL_messages_stickerSet5.documents.get(i21);
                            if (document != null && tL_messages_stickerSet5.set.thumb_document_id == document.f20043id) {
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
                    String str2 = "set" + tL_messages_stickerSet5.set.f20064id;
                    int i22 = axVar.f24605x;
                    axVar.f24605x = i22 + 1;
                    yx0 yx0Var2 = (yx0) axVar.f24595n.get(str2);
                    if (yx0Var2 != null) {
                        axVar.g(str2, yx0Var2, i22);
                    } else {
                        yx0Var2 = new yx0(axVar.getContext(), 0);
                        yx0Var2.setFocusable(z16);
                        yx0Var2.setOnClickListener(new tm0(axVar, 1));
                        yx0Var2.setExpanded(axVar.f24588f0);
                        yx0Var2.a(axVar.f24591i0);
                        xb1Var.addView(yx0Var2, i22);
                    }
                    yx0Var2.f33269e.setLayerNum(axVar.f24578a);
                    yx0Var2.d = false;
                    yx0Var2.setTag(closestPhotoSizeWithSize);
                    yx0Var2.setTag(R.id.index_tag, Integer.valueOf(i22));
                    yx0Var2.setTag(R.id.parent_tag, tL_messages_stickerSet5);
                    yx0Var2.setTag(R.id.object_tag, document);
                    if (i22 == axVar.f24606y) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    yx0Var2.setSelected(z12);
                    axVar.h.put(str2, yx0Var2);
                    yx0Var2.setContentDescription(tL_messages_stickerSet5.set.title + ", " + LocaleController.getString(R.string.AccDescrStickerSet));
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

    public final void X() {
        boolean z10;
        int i10;
        bx bxVar = this.C0;
        ax axVar = this.B0;
        if (axVar != null && bxVar == null && this.f29145t1 != null) {
            axVar.setTranslationY(this.f29145t1.p() * (-AndroidUtilities.dp(50.0f)));
        }
        if (bxVar == null) {
            return;
        }
        if (getVisibility() == 0 && this.K0 && this.f29145t1.p() != 1.0f) {
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
            Rect rect = this.f29160x2;
            rect.setEmpty();
            this.h.getChildVisibleRect(this.f29158x0, rect, null);
            float p5 = this.f29145t1.p() * AndroidUtilities.dp(50.0f);
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

    public final void Y() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        org.telegram.ui.Cells.s3 s3Var;
        LongSparseArray longSparseArray = this.f29166z1;
        LongSparseArray longSparseArray2 = this.f29163y1;
        int i10 = this.f29091c1;
        vw vwVar = this.D0;
        if (vwVar != null) {
            try {
                int childCount = vwVar.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = vwVar.getChildAt(i11);
                    if ((childAt instanceof org.telegram.ui.Cells.s3) && ((il0) vwVar.T(childAt)) != null) {
                        org.telegram.ui.Cells.s3 s3Var2 = (org.telegram.ui.Cells.s3) childAt;
                        ArrayList<Long> unreadStickerSets = MediaDataController.getInstance(i10).getUnreadStickerSets();
                        TLRPC.StickerSetCovered stickerSet = s3Var2.getStickerSet();
                        if (unreadStickerSets != null && unreadStickerSets.contains(Long.valueOf(stickerSet.set.f20064id))) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        int i12 = 0;
                        while (true) {
                            TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.f29159x1;
                            if (i12 < stickerSetCoveredArr.length) {
                                TLRPC.StickerSetCovered stickerSetCovered = stickerSetCoveredArr[i12];
                                if (stickerSetCovered != null) {
                                    s3Var = s3Var2;
                                    if (stickerSetCovered.set.f20064id == stickerSet.set.f20064id) {
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
                            MediaDataController.getInstance(i10).markFeaturedStickersByIdAsRead(false, stickerSet.set.f20064id);
                        }
                        if (longSparseArray2.indexOfKey(stickerSet.set.f20064id) >= 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (longSparseArray.indexOfKey(stickerSet.set.f20064id) >= 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z12 || z13) {
                            if (z12 && s3Var2.f22906r) {
                                longSparseArray2.remove(stickerSet.set.f20064id);
                                z12 = false;
                            } else if (z13 && !s3Var2.f22906r) {
                                longSparseArray.remove(stickerSet.set.f20064id);
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
    public final void a0(int i10, float f7, float f10, le.e eVar) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = 4;
        if (i10 == 0) {
            q(false);
            float f11 = 1.0f - this.f29082a.f15434e;
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
            P();
            this.f29158x0.invalidate();
        } else if (i10 == 1) {
            l(false);
            float f13 = 1.0f - this.f29085b.f15434e;
            nw nwVar = this.V;
            nwVar.setAlpha(f13);
            if (f13 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            nwVar.setVisibility(i11);
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
            P();
            this.J.invalidate();
        }
    }

    @Override
    public final void b(int i10) {
        setBottomInset(i10);
    }

    @Override
    public final void d(float f7) {
        this.f29135q2 = f7;
        P();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        Utilities.Callback callback;
        TLRPC.StickerSet stickerSet;
        int i12 = NotificationCenter.stickersDidLoad;
        wx wxVar = this.R;
        hw hwVar = this.J2;
        if (i10 == i12) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (this.f29162y0 != null) {
                    W(((Boolean) objArr[1]).booleanValue());
                    Y();
                    C();
                    o();
                }
            } else if (((Integer) objArr[0]).intValue() == 5) {
                if (((Boolean) objArr[1]).booleanValue()) {
                    AndroidUtilities.cancelRunOnUIThread(hwVar);
                    AndroidUtilities.runOnUIThread(hwVar, 100L);
                    return;
                }
                wxVar.F(false);
            }
        } else if (i10 == NotificationCenter.groupPackUpdated) {
            long longValue = ((Long) objArr[0]).longValue();
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            TLRPC.ChatFull chatFull = this.J1;
            if (chatFull != null && chatFull.f20038id == longValue && booleanValue) {
                wxVar.F(true);
            }
        } else if (i10 == NotificationCenter.recentDocumentsDidLoad) {
            boolean booleanValue2 = ((Boolean) objArr[0]).booleanValue();
            int intValue = ((Integer) objArr[1]).intValue();
            if (booleanValue2 || intValue == 0 || intValue == 2) {
                k(booleanValue2);
            }
        } else if (i10 == NotificationCenter.featuredStickersDidLoad) {
            Y();
            qd0 qd0Var = this.f29153w;
            if (qd0Var != null) {
                int childCount = qd0Var.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    qd0Var.getChildAt(i13).invalidate();
                }
            }
            W(false);
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
                    iz izVar = this.f29165z0;
                    if (izVar != null && izVar.d == longValue2 && izVar.f27517f.size() < tL_messages_stickerSet.documents.size()) {
                        izVar.f27517f = tL_messages_stickerSet.documents;
                        izVar.l();
                    }
                    if (nyVar != null && nyVar.d == longValue2 && nyVar.f29075f.size() < tL_messages_stickerSet.documents.size()) {
                        nyVar.f29075f = tL_messages_stickerSet.documents;
                        nyVar.l();
                    }
                }
                TLRPC.ChatFull chatFull2 = this.J1;
                if (chatFull2 != null && (stickerSet = chatFull2.stickerset) != null && stickerSet.f20064id == longValue2) {
                    W(false);
                }
                HashMap hashMap = this.f29138r1;
                if (hashMap.containsKey(l4) && objArr.length >= 2 && ((Utilities.Callback) hashMap.get(l4)) != null && tL_messages_stickerSet != null && (callback = (Utilities.Callback) hashMap.remove(l4)) != null) {
                    callback.run(tL_messages_stickerSet);
                }
                AndroidUtilities.cancelRunOnUIThread(hwVar);
                AndroidUtilities.runOnUIThread(hwVar, 100L);
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
                bv bvVar = this.B1;
                if (bvVar != null) {
                    bvVar.f25061c.invalidate();
                }
                ux uxVar = this.f29130p0;
                if (uxVar != null) {
                    xb1 xb1Var = uxVar.f24585e;
                    int childCount4 = xb1Var.getChildCount();
                    for (int i18 = 0; i18 < childCount4; i18++) {
                        xb1Var.getChildAt(i18).invalidate();
                    }
                }
            } else if (i10 == NotificationCenter.newEmojiSuggestionsAvailable) {
                if (zxVar != null && this.f29093d0) {
                    if ((this.V.f24713c.f30107k == 2 || zxVar.getAdapter() == nyVar) && !TextUtils.isEmpty(nyVar.v)) {
                        nyVar.F(nyVar.v, true);
                    }
                }
            } else if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                if (wxVar != null) {
                    wxVar.F(false);
                }
                R();
                W(false);
            }
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        P();
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.h) {
            canvas.save();
            if (this.f29123n.getVisibility() != 8 && !this.f29147u0 && this.f29154w0) {
                canvas.drawColor(i0.a.k(-1, 25));
            }
            boolean drawChild = super.drawChild(canvas, view, j3);
            float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(this.f29132p2);
            if (navigationBarThirdButtonsFactor > 0.0f) {
                int l1 = org.telegram.ui.ActionBar.i6.l1(navigationBarThirdButtonsFactor, z(org.telegram.ui.ActionBar.i6.He));
                int i10 = this.f29167z2;
                GradientDrawable gradientDrawable = this.f29164y2;
                if (i10 != l1) {
                    gradientDrawable.setColors(new int[]{l1, org.telegram.ui.ActionBar.i6.l1(0.66f, l1), i0.a.k(l1, 0)});
                    this.f29167z2 = l1;
                }
                gradientDrawable.setBounds(0, getMeasuredHeight() - this.f29132p2, getMeasuredWidth(), getMeasuredHeight());
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
            ArrayList arrayList2 = this.f29134q1;
            if (i10 < arrayList2.size()) {
                ay ayVar = (ay) arrayList2.get(i10);
                boolean z10 = ayVar.f24707g;
                ArrayList arrayList3 = this.f29131p1;
                if ((!z10 && (ayVar.f24706f || arrayList3.contains(Long.valueOf(ayVar.f24703b.f20064id)))) || (ayVar.f24707g && !ayVar.f24706f && !arrayList3.contains(Long.valueOf(ayVar.f24703b.f20064id)))) {
                    arrayList.add(ayVar);
                }
                i10++;
            } else {
                return arrayList;
            }
        }
    }

    public ArrayList<String> getRecentEmoji() {
        if (this.f29092c2) {
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
                if (!this.f29092c2) {
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
        if (i10 == 2 || x(i10).K(0) == null) {
            return;
        }
        kx kxVar = new kx(getContext(), i11);
        kxVar.f46691a = !z10 ? 1 : 0;
        w(i10).w0(kxVar);
    }

    public final void k(boolean z10) {
        if (z10) {
            U();
            return;
        }
        int size = this.f29114j1.size();
        int size2 = this.f29117k1.size();
        int i10 = this.f29091c1;
        this.f29114j1 = MediaDataController.getInstance(i10).getRecentStickers(0, true);
        this.f29117k1 = MediaDataController.getInstance(i10).getRecentStickers(2);
        if (UserConfig.getInstance(i10).isPremium()) {
            this.l1 = MediaDataController.getInstance(i10).getRecentStickers(7);
        } else {
            this.l1 = new ArrayList();
        }
        for (int i11 = 0; i11 < this.f29117k1.size(); i11++) {
            TLRPC.Document document = (TLRPC.Document) this.f29117k1.get(i11);
            int i12 = 0;
            while (true) {
                if (i12 < this.f29114j1.size()) {
                    TLRPC.Document document2 = (TLRPC.Document) this.f29114j1.get(i12);
                    if (document2.dc_id == document.dc_id && document2.f20043id == document.f20043id) {
                        this.f29114j1.remove(i12);
                        break;
                    }
                    i12++;
                }
            }
        }
        if (MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            int i13 = 0;
            while (i13 < this.f29117k1.size()) {
                if (MessageObject.isPremiumSticker((TLRPC.Document) this.f29117k1.get(i13))) {
                    this.f29117k1.remove(i13);
                    i13--;
                }
                i13++;
            }
            int i14 = 0;
            while (i14 < this.f29114j1.size()) {
                if (MessageObject.isPremiumSticker((TLRPC.Document) this.f29114j1.get(i14))) {
                    this.f29114j1.remove(i14);
                    i14--;
                }
                i14++;
            }
        }
        if (size != this.f29114j1.size() || size2 != this.f29117k1.size()) {
            W(false);
        }
        ez ezVar = this.f29162y0;
        if (ezVar != null) {
            ezVar.l();
        }
        o();
    }

    public final void l(boolean z10) {
        int i10;
        boolean z11;
        oy oyVar = this.f29145t1;
        le.b bVar = this.f29085b;
        zx zxVar = this.P;
        nw nwVar = this.V;
        if (oyVar != null && oyVar.z()) {
            s4.c1 K = zxVar.K(0);
            if (K == null) {
                az.a(nwVar, true, !z10);
            } else {
                if (K.f46523a.getTop() < zxVar.getPaddingTop()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                az.a(nwVar, z11, !z10);
            }
            L(false, !z10);
            nwVar.setTranslationY(bVar.f15434e * AndroidUtilities.dp(15.0f));
        } else if (nwVar != null && zxVar != null) {
            s4.c1 K2 = zxVar.K(0);
            if (K2 != null) {
                i10 = K2.f46523a.getTop();
            } else {
                i10 = -this.f29087b1;
            }
            nwVar.setTranslationY((bVar.f15434e * AndroidUtilities.dp(15.0f)) + i10);
            nwVar.f24711a.a(false, !z10);
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
        if (dp > 0 && (K == null || K.f46523a.getBottom() < dp)) {
            z10 = true;
        }
        L(z10, !this.K1);
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
        } else if (view.getVisibility() == 0 && !this.f29101f0) {
            oy oyVar = this.f29145t1;
            if (oyVar == null || !oyVar.z()) {
                if (i10 > 0 && (zxVar = this.P) != null && zxVar.getVisibility() == 0 && (K = zxVar.K(0)) != null) {
                    int top = K.f46523a.getTop();
                    if (this.f29093d0) {
                        i11 = this.f29087b1;
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
            axVar.k(this.f29162y0.F(L0), i10);
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
        NotificationCenter.ObserversGroup add = NotificationCenter.getInstance(this.f29091c1).createWeakObserversGroup(this).addGlobal(NotificationCenter.emojiLoaded).add(NotificationCenter.newEmojiSuggestionsAvailable).add(NotificationCenter.groupPackUpdated);
        this.G2 = add;
        if (this.f29162y0 != null) {
            add.add(NotificationCenter.stickersDidLoad).add(NotificationCenter.recentDocumentsDidLoad).add(NotificationCenter.featuredStickersDidLoad).add(NotificationCenter.groupStickersDidLoad).add(NotificationCenter.currentUserPremiumStatusChanged);
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
        org.telegram.ui.rt q6 = org.telegram.ui.rt.q();
        if (q6.f40271l == this.f29106g2) {
            q6.W = null;
            q6.f40258a0 = null;
            q6.Y = null;
            q6.f40271l = null;
            q6.f40262c0 = null;
            q6.u();
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        if (this.O1 != i14) {
            this.O1 = i14;
            C();
        }
        super.onLayout(z10, i10, i11, i12, i13);
        P();
        X();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.K1 = true;
        boolean z10 = AndroidUtilities.isInMultiwindow;
        View view = this.v;
        boolean z11 = this.f29093d0;
        if (!z10 && !this.N1) {
            if (this.L1 != 0) {
                if (!this.F2) {
                    setOutlineProvider(null);
                    setClipToOutline(false);
                    setElevation(0.0f);
                }
                if (this.f29147u0) {
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
            if (z11 && this.f29147u0) {
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
                this.B0.k(this.f29162y0.F(L02), i12);
            }
        } else if (i10 == 2) {
            s4.h0 adapter = this.f29107h0.getAdapter();
            sy syVar = this.f29124n0;
            if (adapter == syVar && syVar.I >= 0 && this.f29141s0 >= 0 && this.f29137r0 >= 0 && (L0 = this.f29110i0.L0()) != -1) {
                if (L0 >= syVar.I) {
                    i11 = this.f29141s0;
                } else {
                    i11 = this.f29137r0;
                }
                this.f29130p0.k(i11, 0);
            }
        }
    }

    public final void q(boolean z10) {
        int i10;
        oy oyVar = this.f29145t1;
        le.b bVar = this.f29082a;
        vw vwVar = this.D0;
        boolean z11 = false;
        zw zwVar = this.G0;
        if (oyVar != null && oyVar.z()) {
            s4.c1 K = vwVar.K(0);
            if (K == null) {
                az.a(zwVar, true, !z10);
            } else {
                if (K.f46523a.getTop() < vwVar.getPaddingTop()) {
                    z11 = true;
                }
                az.a(zwVar, z11, !z10);
            }
            zwVar.setTranslationY(bVar.f15434e * AndroidUtilities.dp(15.0f));
        } else if (zwVar != null && vwVar != null) {
            s4.c1 K2 = vwVar.K(0);
            if (K2 != null) {
                i10 = K2.f46523a.getTop();
            } else {
                i10 = -this.f29087b1;
            }
            zwVar.setTranslationY((bVar.f15434e * AndroidUtilities.dp(15.0f)) + i10);
            zwVar.f24711a.a(false, !z10);
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
        if (currentItem == 2 && j3 != -1 && (stickerSetById = MediaDataController.getInstance(this.f29091c1).getStickerSetById(j3)) != null && (E = (ezVar = this.f29162y0).E(stickerSetById)) >= 0 && E < ezVar.h()) {
            F(E, AndroidUtilities.dp(48.0f));
        }
        sy syVar = this.f29113j0;
        if (syVar != null) {
            syVar.K = false;
        }
        for (int i11 = 0; i11 < 3; i11++) {
            View view3 = this.D0;
            View view4 = this.f29107h0;
            sw swVar = this.f29127o0;
            View view5 = this.P;
            if (i11 == 0) {
                azVar = this.V;
                c0Var = this.Q;
                view = this.I;
                view2 = view5;
            } else if (i11 == 1) {
                c0Var = this.f29110i0;
                view = this.f29130p0;
                view2 = view4;
                azVar = swVar;
            } else {
                azVar = this.G0;
                c0Var = this.E0;
                view = this.B0;
                view2 = view3;
            }
            if (azVar != null) {
                zy zyVar = azVar.f24717r;
                azVar.d.setText("");
                if (zyVar != null) {
                    zyVar.H1(null);
                    zyVar.F1();
                }
                int i12 = this.f29087b1;
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
                        view2.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f) + this.f29132p2);
                    } else {
                        i10 = 0;
                        if (view2 == view4) {
                            view2.setPadding(0, AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(44.0f) + this.f29132p2);
                        } else {
                            if (view2 == view5) {
                                view2.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f) + this.f29132p2);
                            }
                            i10 = 0;
                        }
                    }
                    c0Var.h1(i10, i10);
                }
            }
        }
        if (!z10) {
            this.f29145t1.i(0);
        }
    }

    public void setBlurredBackgroundDrawableFactory(ah.c cVar) {
        org.telegram.ui.ActionBar.d6 d6Var = this.Z1;
        View view = this.f29157x;
        if (view != null) {
            ch.d c10 = cVar.c(view, null, false);
            c10.x(eh.b.d(d6Var));
            c10.z(AndroidUtilities.dp(18.0f));
            c10.y(AndroidUtilities.dp(6.0f));
            view.setBackground(c10);
        }
        View view2 = this.E;
        if (view2 != null) {
            ch.d c11 = cVar.c(view2, null, false);
            c11.x(eh.b.d(d6Var));
            c11.z(AndroidUtilities.dp(18.0f));
            c11.y(AndroidUtilities.dp(6.0f));
            view2.setBackground(c11);
        }
        View view3 = this.f29153w;
        if (view3 != null) {
            ch.d c12 = cVar.c(view3, null, false);
            c12.x(eh.b.d(d6Var));
            c12.z(AndroidUtilities.dp(18.0f));
            c12.y(AndroidUtilities.dp(6.0f));
            view3.setBackground(c12);
        }
        View view4 = this.f29161y;
        if (view4 != null) {
            ch.d c13 = cVar.c(view4, null, false);
            c13.x(eh.b.d(d6Var));
            c13.z(AndroidUtilities.dp(18.0f));
            c13.y(AndroidUtilities.dp(6.0f));
            view4.setBackground(c13);
        }
    }

    public void setBottomInset(int i10) {
        if (this.f29132p2 != i10) {
            this.f29132p2 = i10;
            j(i10, this.K);
            j(i10, this.M);
            j(AndroidUtilities.dp(44.0f) + i10, this.P);
            j(AndroidUtilities.dp(44.0f) + i10, this.D0);
            j(AndroidUtilities.dp(44.0f) + i10, this.f29107h0);
            FrameLayout frameLayout = this.f29140s;
            if (frameLayout != null) {
                frameLayout.setTranslationY(-i10);
            }
            P();
            invalidate();
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        this.J1 = chatFull;
        W(false);
    }

    public void setDelegate(oy oyVar) {
        this.f29145t1 = oyVar;
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
        sw swVar = this.f29127o0;
        if (swVar != null) {
            swVar.d.setEnabled(z10);
        }
        nw nwVar = this.V;
        if (nwVar != null) {
            nwVar.d.setEnabled(z10);
        }
    }

    public void setForseMultiwindowLayout(boolean z10) {
        this.N1 = z10;
    }

    public void setShouldDrawBackground(boolean z10) {
        if (this.f29147u0 != z10) {
            this.f29147u0 = z10;
            Q();
        }
    }

    public void setShowing(boolean z10) {
        this.P0 = z10;
        X();
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        X();
        P();
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
                int i11 = this.f29091c1;
                NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.stickersDidLoad);
                if (this.f29162y0 != null) {
                    NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.recentDocumentsDidLoad);
                    W(false);
                    C();
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
        boolean z11 = this.L2;
        this.L2 = z10;
        if (z11 && !z10) {
            int i10 = this.A1;
            if (i10 == 0) {
                wx wxVar = this.R;
                if (wxVar != null) {
                    wxVar.F(false);
                }
            } else if (i10 == 1) {
                sy syVar = this.f29124n0;
                if (syVar != null) {
                    syVar.l();
                }
            } else if (i10 == 2 && (ezVar = this.f29162y0) != null) {
                ezVar.l();
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
                    return this.f29110i0;
                }
                throw new IllegalArgumentException(hg.k0.h(i10, "Unexpected argument: "));
            }
            return this.Q;
        }
        return this.E0;
    }

    public final zl0 x(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return this.f29107h0;
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
                    return this.f29130p0;
                }
                throw new IllegalArgumentException(hg.k0.h(i10, "Unexpected argument: "));
            }
            return this.I;
        }
        return this.B0;
    }

    public final int z(int i10) {
        org.telegram.ui.ActionBar.d6 d6Var = this.Z1;
        if (d6Var != null) {
            return d6Var.H0(i10);
        }
        return org.telegram.ui.ActionBar.i6.w0(null, i10, false);
    }

    @Override
    public final void V(float f7, int i10) {
    }
}
