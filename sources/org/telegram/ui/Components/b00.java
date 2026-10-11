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
import org.telegram.ui.cc1;
public class b00 extends FrameLayout implements me.d, NotificationCenter.NotificationCenterDelegate, ph.a {
    public static final int O2 = 0;
    public final yw A0;
    public int A1;
    public final GradientDrawable A2;
    public final nx B0;
    public final ov B1;
    public int B2;
    public final ox C0;
    public final int C1;
    public ArrayList C2;
    public final jx D0;
    public final int[] D1;
    public int D2;
    public final ImageView E;
    public final kx E0;
    public int E1;
    public long E2;
    public AnimatorSet F;
    public zz F0;
    public int F1;
    public final me.b F2;
    public AnimatorSet G;
    public final mx G0;
    public int G1;
    public ArrayList G2;
    public float H;
    public final nh.d H0;
    public int H1;
    public boolean H2;
    public final fy I;
    public boolean I0;
    public int I1;
    public NotificationCenter.ObserversGroup I2;
    public final zx J;
    public boolean J0;
    public TLRPC.ChatFull J1;
    public AnimatorSet J2;
    public final ci.m6 K;
    public boolean K0;
    public boolean K1;
    public org.telegram.messenger.video.l K2;
    public final nh.b L;
    public final uy L0;
    public int L1;
    public final uw L2;
    public final ci.m6 M;
    public AnimatorSet M0;
    public final ai.j6 M1;
    public boolean M2;
    public final nh.b N;
    public final ai.q4 N0;
    public boolean N1;
    public boolean N2;
    public final View O;
    public hy O0;
    public int O1;
    public final ny P;
    public boolean P0;
    public boolean P1;
    public final ay Q;
    public final int[] Q0;
    public boolean Q1;
    public final ky R;
    public final ObjectAnimator[] R0;
    public jz R1;
    public final az S;
    public boolean S0;
    public float S1;
    public zz T;
    public gg.f1 T0;
    public float T1;
    public final nh.d U;
    public boolean U0;
    public float U1;
    public final ax V;
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
    public final me.b f24722a;
    public final ul0 f24723a0;
    public final String[] f24724a1;
    public final org.telegram.ui.ActionBar.s5 a2;
    public final me.b f24725b;
    public final ul0 f24726b0;
    public final int f24727b1;
    public final org.telegram.ui.ActionBar.s5 f24728b2;
    public int f24729c;
    public boolean f24730c0;
    public final int f24731c1;
    public final boolean f24732c2;
    public final ArrayList d;
    public final boolean f24733d0;
    public final ArrayList f24734d1;
    public LongSparseArray f24735d2;
    public final ArrayList f24736e;
    public boolean f24737e0;
    public int f24738e1;
    public PorterDuffColorFilter f24739e2;
    public boolean f24740f;
    public boolean f24741f0;
    public int f24742f1;
    public final org.telegram.ui.Cells.t6 f24743f2;
    public final cx f24744g0;
    public boolean f24745g1;
    public final ux f24746g2;
    public final px h;
    public final dx f24747h0;
    public TLRPC.TL_messages_stickerSet f24748h1;
    public boolean f24749h2;
    public final gz f24750i0;
    public ArrayList f24751i1;
    public final boolean f24752i2;
    public final fz f24753j0;
    public ArrayList f24754j1;
    public final ah.h f24755j2;
    public final iz f24756k0;
    public ArrayList f24757k1;
    public final nh f24758k2;
    public final HashMap f24759l0;
    public ArrayList l1;
    public final ah.c f24760l2;
    public final yw m0;
    public final ArrayList f24761m1;
    public final mi.e f24762m2;
    public final FrameLayout f24763n;
    public final fz f24764n0;
    public final ArrayList f24765n1;
    public boolean f24766n2;
    public final gx f24767o0;
    public final ArrayList f24768o1;
    public boolean f24769o2;
    public final iy f24770p0;
    public final ArrayList f24771p1;
    public int f24772p2;
    public boolean f24773q0;
    public final ArrayList f24774q1;
    public float f24775q2;
    public final FrameLayout f24776r;
    public int f24777r0;
    public final HashMap f24778r1;
    public View f24779r2;
    public final FrameLayout f24780s;
    public int f24781s0;
    public final Paint f24782s1;
    public int f24783s2;
    public int f24784t0;
    public bz f24785t1;
    public int f24786t2;
    public boolean f24787u0;
    public long f24788u1;
    public long f24789u2;
    public final View v;
    public boolean f24790v0;
    public boolean f24791v1;
    public boolean f24792v2;
    public final fe0 f24793w;
    public boolean f24794w0;
    public boolean f24795w1;
    public boolean f24796w2;
    public final qx f24797x;
    public final hx f24798x0;
    public final TLRPC.StickerSetCovered[] f24799x1;
    public final Rect f24800x2;
    public final ImageView f24801y;
    public final rz f24802y0;
    public final LongSparseArray f24803y1;
    public final RectF f24804y2;
    public final wz f24805z0;
    public final LongSparseArray f24806z1;
    public final ArrayList f24807z2;

    public b00(org.telegram.ui.ActionBar.m2 m2Var, boolean z10, boolean z11, boolean z12, Context context, boolean z13, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z14, final org.telegram.ui.ActionBar.d6 d6Var, boolean z15, boolean z16) {
        super(context);
        org.telegram.ui.ActionBar.s5 s5Var;
        int B;
        zx zxVar;
        Context context2;
        uw uwVar;
        boolean z17;
        Field field;
        int i10;
        is isVar = is.h;
        this.f24722a = new me.b(0, this, isVar, 320L, false);
        this.f24725b = new me.b(1, this, isVar, 320L, false);
        this.f24729c = 2;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.f24736e = new ArrayList();
        this.f24730c0 = true;
        this.f24756k0 = new iz(this);
        this.f24759l0 = new HashMap();
        this.f24773q0 = true;
        this.f24777r0 = -2;
        this.f24781s0 = -2;
        this.f24784t0 = -2;
        this.f24787u0 = true;
        this.f24794w0 = true;
        this.I0 = true;
        this.Q0 = new int[3];
        this.R0 = new ObjectAnimator[3];
        int i11 = UserConfig.selectedAccount;
        this.f24731c1 = i11;
        this.f24734d1 = new ArrayList();
        this.f24751i1 = new ArrayList();
        this.f24754j1 = new ArrayList();
        this.f24757k1 = new ArrayList();
        this.l1 = new ArrayList();
        this.f24761m1 = new ArrayList();
        this.f24765n1 = new ArrayList();
        new ArrayList();
        this.f24768o1 = new ArrayList();
        this.f24771p1 = new ArrayList();
        this.f24774q1 = new ArrayList();
        this.f24778r1 = new HashMap();
        this.f24799x1 = new TLRPC.StickerSetCovered[10];
        this.f24803y1 = new LongSparseArray();
        this.f24806z1 = new LongSparseArray();
        this.D1 = new int[2];
        this.F1 = -2;
        this.G1 = -2;
        this.H1 = -2;
        this.I1 = -2;
        this.L1 = -1;
        this.f24743f2 = new org.telegram.ui.Cells.t6(this, 11);
        this.f24746g2 = new ux(this);
        this.f24749h2 = true;
        mi.e eVar = new mi.e();
        this.f24762m2 = eVar;
        this.f24775q2 = -1.0f;
        this.f24783s2 = -1;
        this.f24786t2 = -1;
        this.f24789u2 = -1L;
        this.f24792v2 = false;
        this.f24796w2 = true;
        this.f24800x2 = new Rect();
        RectF rectF = new RectF();
        this.f24804y2 = rectF;
        ArrayList arrayList2 = new ArrayList(1);
        this.f24807z2 = arrayList2;
        arrayList2.add(rectF);
        this.A2 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.F2 = new me.b(0, new vw(this, 3), isVar, 380L, true);
        this.L2 = new uw(this, 1);
        this.M2 = false;
        this.f24787u0 = z14;
        this.Y1 = m2Var;
        this.f24732c2 = z10;
        this.Z1 = d6Var;
        this.f24752i2 = z16;
        fh.c cVar = new fh.c();
        cVar.a(B(org.telegram.ui.ActionBar.h6.f20822d6));
        if (z15) {
            v(true);
        }
        i0.a.k(B(org.telegram.ui.ActionBar.h6.Wk), 30);
        int dp = AndroidUtilities.dp(50.0f);
        this.f24727b1 = dp;
        this.f24733d0 = z13;
        this.X0 = new Drawable[]{org.telegram.ui.ActionBar.h6.V(context, R.drawable.smiles_tab_smiles, z16 ? w(0.4f) : B(org.telegram.ui.ActionBar.h6.Re), z16 ? w(0.8f) : B(org.telegram.ui.ActionBar.h6.Oe)), org.telegram.ui.ActionBar.h6.V(context, R.drawable.smiles_tab_gif, z16 ? w(0.4f) : B(org.telegram.ui.ActionBar.h6.Re), z16 ? w(0.8f) : B(org.telegram.ui.ActionBar.h6.Oe)), org.telegram.ui.ActionBar.h6.V(context, R.drawable.smiles_tab_stickers, z16 ? w(0.4f) : B(org.telegram.ui.ActionBar.h6.Re), z16 ? w(0.8f) : B(org.telegram.ui.ActionBar.h6.Oe))};
        org.telegram.ui.ActionBar.s5 V = org.telegram.ui.ActionBar.h6.V(context, R.drawable.msg_emoji_recent, z16 ? w(0.4f) : B(org.telegram.ui.ActionBar.h6.Me), z16 ? w(0.8f) : B(org.telegram.ui.ActionBar.h6.Oe));
        org.telegram.ui.ActionBar.s5 V2 = org.telegram.ui.ActionBar.h6.V(context, R.drawable.emoji_tabs_faves, z16 ? w(0.4f) : B(org.telegram.ui.ActionBar.h6.Me), z16 ? w(0.8f) : B(org.telegram.ui.ActionBar.h6.Oe));
        org.telegram.ui.ActionBar.s5 V3 = org.telegram.ui.ActionBar.h6.V(context, R.drawable.emoji_tabs_new3, z16 ? w(0.4f) : B(org.telegram.ui.ActionBar.h6.Me), z16 ? w(0.8f) : B(org.telegram.ui.ActionBar.h6.Oe));
        int i12 = R.drawable.emoji_tabs_new1;
        if (z16) {
            s5Var = V3;
            B = w(0.4f);
        } else {
            s5Var = V3;
            B = B(org.telegram.ui.ActionBar.h6.Me);
        }
        org.telegram.ui.ActionBar.s5 V4 = org.telegram.ui.ActionBar.h6.V(context, i12, B, z16 ? w(0.8f) : B(org.telegram.ui.ActionBar.h6.Oe));
        this.a2 = V4;
        int i13 = R.drawable.emoji_tabs_new2;
        int i14 = org.telegram.ui.ActionBar.h6.Qe;
        org.telegram.ui.ActionBar.s5 V5 = org.telegram.ui.ActionBar.h6.V(context, i13, B(i14), B(i14));
        this.f24728b2 = V5;
        this.Y0 = new Drawable[]{V, V2, s5Var, new LayerDrawable(new Drawable[]{V4, V5})};
        this.Z0 = new Drawable[]{org.telegram.ui.ActionBar.h6.V(context, R.drawable.msg_emoji_recent, z16 ? w(0.4f) : B(org.telegram.ui.ActionBar.h6.Me), z16 ? w(0.8f) : B(org.telegram.ui.ActionBar.h6.Oe)), org.telegram.ui.ActionBar.h6.V(context, R.drawable.stickers_gifs_trending, z16 ? w(0.4f) : B(org.telegram.ui.ActionBar.h6.Me), z16 ? w(0.8f) : B(org.telegram.ui.ActionBar.h6.Oe))};
        this.f24724a1 = new String[]{LocaleController.getString(R.string.Emoji1), LocaleController.getString(R.string.Emoji2), LocaleController.getString(R.string.Emoji3), LocaleController.getString(R.string.Emoji4), LocaleController.getString(R.string.Emoji5), LocaleController.getString(R.string.Emoji6), LocaleController.getString(R.string.Emoji7), LocaleController.getString(R.string.Emoji8)};
        this.J1 = chatFull;
        Paint paint = new Paint(1);
        this.f24782s1 = paint;
        paint.setColor(B(org.telegram.ui.ActionBar.h6.f20774af));
        ai.l2 l2Var = yf.i0.f52292a;
        this.M1 = new ai.j6(AndroidUtilities.dp(6.0f));
        zx zxVar2 = new zx(this, context);
        this.J = zxVar2;
        ?? obj = new Object();
        obj.f33091a = 0;
        obj.f33092b = zxVar2;
        arrayList.add(obj);
        if (z10) {
            MediaDataController.getInstance(i11).checkStickers(5);
            MediaDataController.getInstance(i11).checkFeaturedEmoji();
            this.f24739e2 = new PorterDuffColorFilter(B(org.telegram.ui.ActionBar.h6.Oh), PorterDuff.Mode.SRC_IN);
        }
        ny nyVar = new ny(this, context);
        this.P = nyVar;
        eVar.a(nyVar);
        s4.j jVar = new s4.j();
        jVar.f47874c = 220L;
        jVar.f47875e = 220L;
        jVar.f47876f = 160L;
        jVar.f47877g = 160L;
        jVar.f47878i = is.f27501g;
        nyVar.setItemAnimator(jVar);
        nyVar.setOnTouchListener(new View.OnTouchListener(this) {
            public final b00 f32801b;

            {
                this.f32801b = this;
            }

            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                switch (r3) {
                    case 0:
                        org.telegram.ui.qt q6 = org.telegram.ui.qt.q();
                        b00 b00Var = this.f32801b;
                        ny nyVar2 = b00Var.P;
                        b00Var.getMeasuredHeight();
                        return q6.s(motionEvent, nyVar2, null, b00Var.f24746g2, d6Var);
                    case 1:
                        org.telegram.ui.qt q10 = org.telegram.ui.qt.q();
                        b00 b00Var2 = this.f32801b;
                        return q10.s(motionEvent, b00Var2.f24747h0, b00Var2.m0, b00Var2.f24746g2, d6Var);
                    default:
                        org.telegram.ui.qt q11 = org.telegram.ui.qt.q();
                        b00 b00Var3 = this.f32801b;
                        jx jxVar = b00Var3.D0;
                        b00Var3.getMeasuredHeight();
                        return q11.s(motionEvent, jxVar, b00Var3.A0, b00Var3.f24746g2, d6Var);
                }
            }
        });
        nyVar.setOnItemLongClickListener(new vw(this, 1));
        nyVar.setInstantClick(true);
        ay ayVar = new ay(this);
        this.Q = ayVar;
        nyVar.setLayoutManager(ayVar);
        nyVar.setTopGlowOffset(AndroidUtilities.dp(38.0f));
        nyVar.setBottomGlowOffset(AndroidUtilities.dp(36.0f));
        nyVar.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f));
        int i15 = org.telegram.ui.ActionBar.h6.He;
        nyVar.setGlowColor(B(i15));
        nyVar.setItemSelectorColorProvider(new e2(23));
        nyVar.setClipToPadding(false);
        ayVar.O = new cy(this);
        ky kyVar = new ky(this);
        this.R = kyVar;
        nyVar.setAdapter(kyVar);
        nyVar.i(new ci.q1(this, 3));
        this.S = new az(this, context);
        zxVar2.addView(nyVar, w7.x5.d(-1.0f, -1));
        ul0 ul0Var = new ul0(nyVar, ayVar);
        this.f24726b0 = ul0Var;
        ul0Var.f31635i = new dy(this);
        nyVar.setOnScrollListener(new ey(this));
        if (m2Var != null) {
            zxVar = zxVar2;
            context2 = context;
            uwVar = new uw(this, 2);
        } else {
            zxVar = zxVar2;
            context2 = context;
            uwVar = null;
        }
        fy fyVar = new fy(this, context2, d6Var, z10, uwVar, z16);
        this.I = fyVar;
        if (z13) {
            ax axVar = new ax(this, context2);
            this.V = axVar;
            zxVar.addView(axVar, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + dp));
            axVar.d.setOnFocusChangeListener(new bx(this));
            nh.d dVar = new nh.d(context2, d6Var);
            this.U = dVar;
            dVar.setVisibility(8);
            dVar.setOnBackClickListener(new View.OnClickListener(this) {
                public final b00 f33074b;

                {
                    this.f33074b = this;
                }

                @Override
                public final void onClick(View view) {
                    nz nzVar;
                    switch (r2) {
                        case 0:
                            az azVar = this.f33074b.S;
                            vy vyVar = azVar.f24704c;
                            int childCount = vyVar.getChildCount();
                            for (int i16 = 0; i16 < childCount; i16++) {
                                ((nh.c) vyVar.getChildAt(i16)).a(false, true);
                            }
                            azVar.d = 0L;
                            azVar.F.f24725b.a(false, true);
                            azVar.l();
                            return;
                        case 1:
                            wz wzVar = this.f33074b.f24805z0;
                            vz vzVar = wzVar.f32811c;
                            int childCount2 = vzVar.getChildCount();
                            for (int i17 = 0; i17 < childCount2; i17++) {
                                ((nh.c) vzVar.getChildAt(i17)).a(false, true);
                            }
                            wzVar.d = 0L;
                            wzVar.Q.f24722a.a(false, true);
                            wzVar.l();
                            return;
                        case 2:
                            bz bzVar = this.f33074b.f24785t1;
                            if (bzVar != null) {
                                bzVar.w();
                                return;
                            }
                            return;
                        default:
                            b00 b00Var = this.f33074b;
                            int currentItem = b00Var.h.getCurrentItem();
                            if (currentItem == 0) {
                                nzVar = b00Var.V;
                            } else if (currentItem == 1) {
                                nzVar = b00Var.f24767o0;
                            } else {
                                nzVar = b00Var.G0;
                            }
                            if (nzVar != null) {
                                yq yqVar = nzVar.d;
                                yqVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                yqVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                yqVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                return;
                            }
                            return;
                    }
                }
            });
            zxVar.addView(dVar, new FrameLayout.LayoutParams(-1, dp));
        }
        int B2 = B(i15);
        if (Color.alpha(B2) >= 255) {
            fyVar.setBackgroundColor(B2);
        }
        kyVar.G(true);
        fyVar.p(getEmojipacks());
        zxVar.addView(fyVar, w7.x5.d(36.0f, -1));
        View view = new View(context2);
        this.O = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        int i16 = org.telegram.ui.ActionBar.h6.Ke;
        view.setBackgroundColor(B(i16));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(36.0f);
        zxVar.addView(view, layoutParams);
        nh.b bVar = new nh.b(context2, d6Var);
        this.L = bVar;
        ci.m6 m6Var = new ci.m6(context2, 3, d6Var);
        this.K = m6Var;
        m6Var.setVisibility(8);
        m6Var.addView(bVar, w7.x5.a(48.0f, 10.0f, 5.0f, 10.0f, 10.0f, -1, 80));
        zxVar.addView(m6Var, w7.x5.e(-1, -2, 80));
        if (z11) {
            on0 on0Var = on0.f29560b;
            if (z12) {
                cx cxVar = new cx(this, context2);
                this.f24744g0 = cxVar;
                ?? obj2 = new Object();
                obj2.f33091a = 1;
                obj2.f33092b = cxVar;
                this.d.add(obj2);
                dx dxVar = new dx(this, context2);
                this.f24747h0 = dxVar;
                eVar.a(dxVar);
                dxVar.setClipToPadding(false);
                gz gzVar = new gz(this);
                this.f24750i0 = gzVar;
                dxVar.setLayoutManager(gzVar);
                dxVar.i(new ex(this));
                dxVar.setPadding(0, dp, 0, AndroidUtilities.dp(44.0f) + this.f24772p2);
                ((s4.g1) dxVar.getItemAnimator()).f47822m = false;
                fz fzVar = new fz(this, context2, true, Integer.MAX_VALUE);
                this.f24764n0 = fzVar;
                dxVar.setAdapter(fzVar);
                this.f24753j0 = new fz(this, context2, false, 0);
                dxVar.setOnScrollListener(new fx(this));
                dxVar.setOnTouchListener(new View.OnTouchListener(this) {
                    public final b00 f32801b;

                    {
                        this.f32801b = this;
                    }

                    @Override
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        switch (r3) {
                            case 0:
                                org.telegram.ui.qt q6 = org.telegram.ui.qt.q();
                                b00 b00Var = this.f32801b;
                                ny nyVar2 = b00Var.P;
                                b00Var.getMeasuredHeight();
                                return q6.s(motionEvent, nyVar2, null, b00Var.f24746g2, d6Var);
                            case 1:
                                org.telegram.ui.qt q10 = org.telegram.ui.qt.q();
                                b00 b00Var2 = this.f32801b;
                                return q10.s(motionEvent, b00Var2.f24747h0, b00Var2.m0, b00Var2.f24746g2, d6Var);
                            default:
                                org.telegram.ui.qt q11 = org.telegram.ui.qt.q();
                                b00 b00Var3 = this.f32801b;
                                jx jxVar = b00Var3.D0;
                                b00Var3.getMeasuredHeight();
                                return q11.s(motionEvent, jxVar, b00Var3.A0, b00Var3.f24746g2, d6Var);
                        }
                    }
                });
                ?? r12 = new fm0(this) {
                    public final b00 f33469b;

                    {
                        this.f33469b = this;
                    }

                    @Override
                    public final void d(int i17, View view2) {
                        int i18;
                        String str;
                        switch (r2) {
                            case 0:
                                b00 b00Var = this.f33469b;
                                dx dxVar2 = b00Var.f24747h0;
                                fz fzVar2 = b00Var.f24753j0;
                                fz fzVar3 = b00Var.f24764n0;
                                if (b00Var.f24785t1 != null) {
                                    fzVar3.getClass();
                                    ArrayList arrayList3 = fzVar3.f26592x;
                                    if (dxVar2.getAdapter() == fzVar3) {
                                        if (i17 >= 0) {
                                            int i19 = fzVar3.H;
                                            if (i17 < i19) {
                                                b00Var.f24785t1.v(view2, b00Var.f24751i1.get(i17), null, "gif", true, 0, 0);
                                                return;
                                            }
                                            if (i19 > 0) {
                                                i18 = (i17 - i19) - 1;
                                            } else {
                                                i18 = i17;
                                            }
                                            if (i18 >= 0 && i18 < arrayList3.size()) {
                                                b00Var.f24785t1.v(view2, arrayList3.get(i18), null, fzVar3.f26588n, true, 0, 0);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    } else if (dxVar2.getAdapter() == fzVar2 && i17 >= 0 && i17 < fzVar2.f26592x.size()) {
                                        b00Var.f24785t1.v(view2, fzVar2.f26592x.get(i17), fzVar2.f26591w, fzVar2.f26588n, true, 0, 0);
                                        b00Var.W();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            default:
                                b00 b00Var2 = this.f33469b;
                                s4.i0 adapter = b00Var2.D0.getAdapter();
                                wz wzVar = b00Var2.f24805z0;
                                if (adapter == wzVar) {
                                    str = wzVar.N;
                                } else {
                                    str = null;
                                }
                                String str2 = str;
                                if (view2 instanceof org.telegram.ui.Cells.f8) {
                                    org.telegram.ui.Cells.f8 f8Var = (org.telegram.ui.Cells.f8) view2;
                                    if (f8Var.getSticker() != null && MessageObject.isPremiumSticker(f8Var.getSticker()) && !AccountInstance.getInstance(b00Var2.f24731c1).getUserConfig().isPremium()) {
                                        org.telegram.ui.qt.q().y(f8Var);
                                        return;
                                    }
                                    org.telegram.ui.qt.q().u();
                                    if (!f8Var.f22122r) {
                                        f8Var.f22122r = true;
                                        f8Var.f22121n = 0.5f;
                                        f8Var.f22125x = 0L;
                                        org.telegram.ui.Cells.e8 e8Var = f8Var.f22116a;
                                        e8Var.setAlpha(0.5f * f8Var.H);
                                        e8Var.invalidate();
                                        f8Var.f22123s = System.currentTimeMillis();
                                        f8Var.invalidate();
                                        b00Var2.f24785t1.m(f8Var, f8Var.getSticker(), str2, f8Var.getParentObject(), f8Var.getSendAnimationData(), true, 0);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                };
                this.m0 = r12;
                dxVar.setOnItemClickListener((fm0) r12);
                cxVar.addView(dxVar, w7.x5.d(-1.0f, -1));
                gx gxVar = new gx(this, context2);
                this.f24767o0 = gxVar;
                cxVar.addView(gxVar, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + dp));
                iy iyVar = new iy(this, context2, d6Var);
                this.f24770p0 = iyVar;
                iyVar.setType(on0Var);
                iyVar.setUnderlineHeight(AndroidUtilities.getShadowHeight());
                i10 = i14;
                iyVar.setIndicatorColor(B(i10));
                iyVar.setUnderlineColor(B(i16));
                iyVar.setBackgroundColor(B(i15));
                V();
                iyVar.setDelegate(new vw(this, 2));
                fzVar.F("", "", true, true, true);
            } else {
                i10 = i14;
            }
            hx hxVar = new hx(this, context2, z14);
            this.f24798x0 = hxVar;
            MediaDataController.getInstance(this.f24731c1).checkStickers(0);
            MediaDataController.getInstance(this.f24731c1).checkFeaturedStickers();
            jx jxVar = new jx(this, context2);
            this.D0 = jxVar;
            this.f24762m2.a(jxVar);
            kx kxVar = new kx(this);
            this.E0 = kxVar;
            jxVar.setLayoutManager(kxVar);
            kxVar.O = new lx(this);
            jxVar.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f));
            jxVar.setClipToPadding(false);
            ?? obj3 = new Object();
            obj3.f33091a = 2;
            obj3.f33092b = hxVar;
            this.d.add(obj3);
            this.f24805z0 = new wz(this, context2);
            rz rzVar = new rz(this, context2);
            this.f24802y0 = rzVar;
            jxVar.setAdapter(rzVar);
            jxVar.setOnTouchListener(new View.OnTouchListener(this) {
                public final b00 f32801b;

                {
                    this.f32801b = this;
                }

                @Override
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    switch (r3) {
                        case 0:
                            org.telegram.ui.qt q6 = org.telegram.ui.qt.q();
                            b00 b00Var = this.f32801b;
                            ny nyVar2 = b00Var.P;
                            b00Var.getMeasuredHeight();
                            return q6.s(motionEvent, nyVar2, null, b00Var.f24746g2, d6Var);
                        case 1:
                            org.telegram.ui.qt q10 = org.telegram.ui.qt.q();
                            b00 b00Var2 = this.f32801b;
                            return q10.s(motionEvent, b00Var2.f24747h0, b00Var2.m0, b00Var2.f24746g2, d6Var);
                        default:
                            org.telegram.ui.qt q11 = org.telegram.ui.qt.q();
                            b00 b00Var3 = this.f32801b;
                            jx jxVar2 = b00Var3.D0;
                            b00Var3.getMeasuredHeight();
                            return q11.s(motionEvent, jxVar2, b00Var3.A0, b00Var3.f24746g2, d6Var);
                    }
                }
            });
            ?? r42 = new fm0(this) {
                public final b00 f33469b;

                {
                    this.f33469b = this;
                }

                @Override
                public final void d(int i17, View view2) {
                    int i18;
                    String str;
                    switch (r2) {
                        case 0:
                            b00 b00Var = this.f33469b;
                            dx dxVar2 = b00Var.f24747h0;
                            fz fzVar2 = b00Var.f24753j0;
                            fz fzVar3 = b00Var.f24764n0;
                            if (b00Var.f24785t1 != null) {
                                fzVar3.getClass();
                                ArrayList arrayList3 = fzVar3.f26592x;
                                if (dxVar2.getAdapter() == fzVar3) {
                                    if (i17 >= 0) {
                                        int i19 = fzVar3.H;
                                        if (i17 < i19) {
                                            b00Var.f24785t1.v(view2, b00Var.f24751i1.get(i17), null, "gif", true, 0, 0);
                                            return;
                                        }
                                        if (i19 > 0) {
                                            i18 = (i17 - i19) - 1;
                                        } else {
                                            i18 = i17;
                                        }
                                        if (i18 >= 0 && i18 < arrayList3.size()) {
                                            b00Var.f24785t1.v(view2, arrayList3.get(i18), null, fzVar3.f26588n, true, 0, 0);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                } else if (dxVar2.getAdapter() == fzVar2 && i17 >= 0 && i17 < fzVar2.f26592x.size()) {
                                    b00Var.f24785t1.v(view2, fzVar2.f26592x.get(i17), fzVar2.f26591w, fzVar2.f26588n, true, 0, 0);
                                    b00Var.W();
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        default:
                            b00 b00Var2 = this.f33469b;
                            s4.i0 adapter = b00Var2.D0.getAdapter();
                            wz wzVar = b00Var2.f24805z0;
                            if (adapter == wzVar) {
                                str = wzVar.N;
                            } else {
                                str = null;
                            }
                            String str2 = str;
                            if (view2 instanceof org.telegram.ui.Cells.f8) {
                                org.telegram.ui.Cells.f8 f8Var = (org.telegram.ui.Cells.f8) view2;
                                if (f8Var.getSticker() != null && MessageObject.isPremiumSticker(f8Var.getSticker()) && !AccountInstance.getInstance(b00Var2.f24731c1).getUserConfig().isPremium()) {
                                    org.telegram.ui.qt.q().y(f8Var);
                                    return;
                                }
                                org.telegram.ui.qt.q().u();
                                if (!f8Var.f22122r) {
                                    f8Var.f22122r = true;
                                    f8Var.f22121n = 0.5f;
                                    f8Var.f22125x = 0L;
                                    org.telegram.ui.Cells.e8 e8Var = f8Var.f22116a;
                                    e8Var.setAlpha(0.5f * f8Var.H);
                                    e8Var.invalidate();
                                    f8Var.f22123s = System.currentTimeMillis();
                                    f8Var.invalidate();
                                    b00Var2.f24785t1.m(f8Var, f8Var.getSticker(), str2, f8Var.getParentObject(), f8Var.getSendAnimationData(), true, 0);
                                    return;
                                }
                                return;
                            }
                            return;
                    }
                }
            };
            this.A0 = r42;
            jxVar.setOnItemClickListener((fm0) r42);
            jxVar.setGlowColor(B(i15));
            hxVar.addView(jxVar);
            this.f24723a0 = new ul0(jxVar, kxVar);
            mx mxVar = new mx(this, context2);
            this.G0 = mxVar;
            hxVar.addView(mxVar, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + dp));
            nh.d dVar2 = new nh.d(context2, d6Var);
            this.H0 = dVar2;
            dVar2.setVisibility(8);
            dVar2.setOnBackClickListener(new View.OnClickListener(this) {
                public final b00 f33074b;

                {
                    this.f33074b = this;
                }

                @Override
                public final void onClick(View view2) {
                    nz nzVar;
                    switch (r2) {
                        case 0:
                            az azVar = this.f33074b.S;
                            vy vyVar = azVar.f24704c;
                            int childCount = vyVar.getChildCount();
                            for (int i162 = 0; i162 < childCount; i162++) {
                                ((nh.c) vyVar.getChildAt(i162)).a(false, true);
                            }
                            azVar.d = 0L;
                            azVar.F.f24725b.a(false, true);
                            azVar.l();
                            return;
                        case 1:
                            wz wzVar = this.f33074b.f24805z0;
                            vz vzVar = wzVar.f32811c;
                            int childCount2 = vzVar.getChildCount();
                            for (int i17 = 0; i17 < childCount2; i17++) {
                                ((nh.c) vzVar.getChildAt(i17)).a(false, true);
                            }
                            wzVar.d = 0L;
                            wzVar.Q.f24722a.a(false, true);
                            wzVar.l();
                            return;
                        case 2:
                            bz bzVar = this.f33074b.f24785t1;
                            if (bzVar != null) {
                                bzVar.w();
                                return;
                            }
                            return;
                        default:
                            b00 b00Var = this.f33074b;
                            int currentItem = b00Var.h.getCurrentItem();
                            if (currentItem == 0) {
                                nzVar = b00Var.V;
                            } else if (currentItem == 1) {
                                nzVar = b00Var.f24767o0;
                            } else {
                                nzVar = b00Var.G0;
                            }
                            if (nzVar != null) {
                                yq yqVar = nzVar.d;
                                yqVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                yqVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                yqVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                return;
                            }
                            return;
                    }
                }
            });
            hxVar.addView(dVar2, new FrameLayout.LayoutParams(-1, dp));
            z17 = z14;
            nx nxVar = new nx(this, context2, d6Var, m2Var, z17);
            this.B0 = nxVar;
            nxVar.setDragEnabled(true);
            nxVar.setWillNotDraw(false);
            nxVar.setType(on0Var);
            nxVar.setUnderlineHeight(jxVar.canScrollVertically(-1) ? AndroidUtilities.getShadowHeight() : 0);
            nxVar.setIndicatorColor(B(i10));
            nxVar.setUnderlineColor(B(i16));
            if (viewGroup != null && z17) {
                ox oxVar = new ox(this, context2);
                this.C0 = oxVar;
                oxVar.addView(nxVar, w7.x5.e(-1, 36, 51));
                viewGroup.addView(oxVar, w7.x5.d(-2.0f, -1));
            } else {
                hxVar.addView(nxVar, w7.x5.e(-1, 36, 51));
            }
            X(true);
            nxVar.setDelegate(new vw(this, 4));
            jxVar.setOnScrollListener(new a00(this, 0));
            nh.b bVar2 = new nh.b(context2, d6Var);
            this.N = bVar2;
            ci.m6 m6Var2 = new ci.m6(context2, 3, d6Var);
            this.M = m6Var2;
            m6Var2.setVisibility(8);
            m6Var2.addView(bVar2, w7.x5.a(48.0f, 10.0f, 5.0f, 10.0f, 10.0f, -1, 80));
            hxVar.addView(m6Var2, w7.x5.e(-1, -2, 80));
        } else {
            z17 = z14;
        }
        this.f24736e.clear();
        this.f24736e.addAll(this.d);
        px pxVar = new px(this, context2);
        this.h = pxVar;
        mi.e eVar2 = this.f24762m2;
        eVar2.getClass();
        pxVar.b(new ai.o7(eVar2, 1));
        pxVar.setOverScrollMode(2);
        uy uyVar = new uy(this);
        this.L0 = uyVar;
        pxVar.setAdapter(uyVar);
        qx qxVar = new qx(this, context2);
        this.f24797x = qxVar;
        qxVar.setHapticFeedbackEnabled(true);
        qxVar.setImageResource(R.drawable.smiles_tab_clear);
        int w10 = z16 ? w(0.6f) : B(org.telegram.ui.ActionBar.h6.Re);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        qxVar.setColorFilter(new PorterDuffColorFilter(w10, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        qxVar.setScaleType(scaleType);
        qxVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
        qxVar.setFocusable(true);
        qxVar.setOnClickListener(new Object());
        w7.z5.a(qxVar);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f24776r = frameLayout;
        if (z13) {
            addView(frameLayout, w7.x5.a(100.0f, 0.0f, 0.0f, 0.0f, (AndroidUtilities.getShadowHeight() / AndroidUtilities.density) + 40.0f, -1, 87));
        } else {
            addView(frameLayout, w7.x5.a(100.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 87));
        }
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.f24780s = frameLayout2;
        addView(frameLayout2, w7.x5.a(100.0f, 0.0f, 0.0f, 0.0f, 64.0f, -1, 87));
        FrameLayout frameLayout3 = new FrameLayout(context2);
        this.f24763n = frameLayout3;
        View view2 = new View(context2);
        this.v = view2;
        frameLayout3.addView(view2, new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(40.0f), 83));
        if (z13) {
            addView(frameLayout3, w7.x5.e(-1, 48, 80));
            frameLayout3.addView(qxVar, w7.x5.a(48.0f, 2.0f, 0.0f, 2.0f, 0.0f, 48, 85));
            if (z11) {
                ImageView imageView = new ImageView(context2);
                this.f24801y = imageView;
                imageView.setImageResource(R.drawable.smiles_tab_settings);
                imageView.setColorFilter(new PorterDuffColorFilter(z16 ? w(0.6f) : B(org.telegram.ui.ActionBar.h6.Re), mode));
                imageView.setScaleType(scaleType);
                imageView.setFocusable(true);
                imageView.setContentDescription(LocaleController.getString(R.string.Settings));
                w7.z5.a(imageView);
                frameLayout3.addView(imageView, w7.x5.a(48.0f, 2.0f, 0.0f, 2.0f, 0.0f, 48, 85));
                imageView.setOnClickListener(new View.OnClickListener(this) {
                    public final b00 f33074b;

                    {
                        this.f33074b = this;
                    }

                    @Override
                    public final void onClick(View view22) {
                        nz nzVar;
                        switch (r2) {
                            case 0:
                                az azVar = this.f33074b.S;
                                vy vyVar = azVar.f24704c;
                                int childCount = vyVar.getChildCount();
                                for (int i162 = 0; i162 < childCount; i162++) {
                                    ((nh.c) vyVar.getChildAt(i162)).a(false, true);
                                }
                                azVar.d = 0L;
                                azVar.F.f24725b.a(false, true);
                                azVar.l();
                                return;
                            case 1:
                                wz wzVar = this.f33074b.f24805z0;
                                vz vzVar = wzVar.f32811c;
                                int childCount2 = vzVar.getChildCount();
                                for (int i17 = 0; i17 < childCount2; i17++) {
                                    ((nh.c) vzVar.getChildAt(i17)).a(false, true);
                                }
                                wzVar.d = 0L;
                                wzVar.Q.f24722a.a(false, true);
                                wzVar.l();
                                return;
                            case 2:
                                bz bzVar = this.f33074b.f24785t1;
                                if (bzVar != null) {
                                    bzVar.w();
                                    return;
                                }
                                return;
                            default:
                                b00 b00Var = this.f33074b;
                                int currentItem = b00Var.h.getCurrentItem();
                                if (currentItem == 0) {
                                    nzVar = b00Var.V;
                                } else if (currentItem == 1) {
                                    nzVar = b00Var.f24767o0;
                                } else {
                                    nzVar = b00Var.G0;
                                }
                                if (nzVar != null) {
                                    yq yqVar = nzVar.d;
                                    yqVar.requestFocus();
                                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                    yqVar.onTouchEvent(obtain);
                                    obtain.recycle();
                                    MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                    yqVar.onTouchEvent(obtain2);
                                    obtain2.recycle();
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            fe0 fe0Var = new fe0(context2, d6Var);
            this.f24793w = fe0Var;
            fe0Var.setViewPager(pxVar);
            fe0Var.setShouldExpand(false);
            fe0Var.setIndicatorHeight(AndroidUtilities.dp(3.0f));
            fe0Var.setIndicatorColor(i0.a.k(B(org.telegram.ui.ActionBar.h6.Oe), 20));
            fe0Var.setUnderlineHeight(0);
            fe0Var.setTabPaddingLeftRight(AndroidUtilities.dp(11.0f));
            fe0Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f));
            frameLayout3.addView(fe0Var, w7.x5.e(-2, 48, 81));
            fe0Var.setOnPageChangeListener(new sx(this, z17));
            ImageView imageView2 = new ImageView(context2);
            this.E = imageView2;
            imageView2.setImageResource(R.drawable.smiles_tab_search);
            imageView2.setColorFilter(new PorterDuffColorFilter(z16 ? w(0.6f) : B(org.telegram.ui.ActionBar.h6.Re), mode));
            imageView2.setScaleType(scaleType);
            imageView2.setContentDescription(LocaleController.getString(R.string.Search));
            imageView2.setFocusable(true);
            imageView2.setVisibility(8);
            frameLayout3.addView(imageView2, w7.x5.a(48.0f, 2.0f, 0.0f, 2.0f, 0.0f, 48, 83));
            imageView2.setOnClickListener(new View.OnClickListener(this) {
                public final b00 f33074b;

                {
                    this.f33074b = this;
                }

                @Override
                public final void onClick(View view22) {
                    nz nzVar;
                    switch (r2) {
                        case 0:
                            az azVar = this.f33074b.S;
                            vy vyVar = azVar.f24704c;
                            int childCount = vyVar.getChildCount();
                            for (int i162 = 0; i162 < childCount; i162++) {
                                ((nh.c) vyVar.getChildAt(i162)).a(false, true);
                            }
                            azVar.d = 0L;
                            azVar.F.f24725b.a(false, true);
                            azVar.l();
                            return;
                        case 1:
                            wz wzVar = this.f33074b.f24805z0;
                            vz vzVar = wzVar.f32811c;
                            int childCount2 = vzVar.getChildCount();
                            for (int i17 = 0; i17 < childCount2; i17++) {
                                ((nh.c) vzVar.getChildAt(i17)).a(false, true);
                            }
                            wzVar.d = 0L;
                            wzVar.Q.f24722a.a(false, true);
                            wzVar.l();
                            return;
                        case 2:
                            bz bzVar = this.f33074b.f24785t1;
                            if (bzVar != null) {
                                bzVar.w();
                                return;
                            }
                            return;
                        default:
                            b00 b00Var = this.f33074b;
                            int currentItem = b00Var.h.getCurrentItem();
                            if (currentItem == 0) {
                                nzVar = b00Var.V;
                            } else if (currentItem == 1) {
                                nzVar = b00Var.f24767o0;
                            } else {
                                nzVar = b00Var.G0;
                            }
                            if (nzVar != null) {
                                yq yqVar = nzVar.d;
                                yqVar.requestFocus();
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                                yqVar.onTouchEvent(obtain);
                                obtain.recycle();
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                                yqVar.onTouchEvent(obtain2);
                                obtain2.recycle();
                                return;
                            }
                            return;
                    }
                }
            });
        } else {
            addView(frameLayout3, w7.x5.a(48.0f, 0.0f, 0.0f, 2.0f, 0.0f, 56, (LocaleController.isRTL ? 3 : 5) | 80));
            org.telegram.ui.Cells.z i02 = org.telegram.ui.ActionBar.h6.i0(AndroidUtilities.dp(56.0f), B(i15), B(i15));
            w7.z5.a(qxVar);
            qxVar.setPadding(0, 0, AndroidUtilities.dp(2.0f), 0);
            qxVar.setBackground(i02);
            qxVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
            qxVar.setFocusable(true);
            frameLayout3.addView(qxVar, w7.x5.a(48.0f, 2.0f, 0.0f, 2.0f, 0.0f, 48, 51));
            view2.setVisibility(8);
        }
        addView(pxVar, 0, w7.x5.e(-1, -1, 51));
        ai.q4 q4Var = new ai.q4(context2, 22);
        this.N0 = q4Var;
        q4Var.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(6.0f), B(org.telegram.ui.ActionBar.h6.f21070qf)));
        q4Var.setTextColor(B(org.telegram.ui.ActionBar.h6.f21051pf));
        q4Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f));
        q4Var.setGravity(16);
        q4Var.setTextSize(1, 14.0f);
        q4Var.setVisibility(4);
        addView(q4Var, w7.x5.a(-2.0f, 5.0f, 0.0f, 5.0f, 53.0f, -2, 81));
        this.C1 = AndroidUtilities.dp(AndroidUtilities.isTablet() ? 40.0f : 32.0f);
        Field field2 = ov.f29634f;
        ov ovVar = new ov(new nv(context2, d6Var));
        if (ov.f29634f == null) {
            try {
                field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
                try {
                    field.setAccessible(true);
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                field = null;
            }
            ov.f29634f = field;
        }
        Field field3 = ov.f29634f;
        if (field3 != null) {
            try {
                ovVar.f29636a = (ViewTreeObserver.OnScrollChangedListener) field3.get(ovVar);
                ov.f29634f.set(ovVar, ov.f29635g);
            } catch (Exception unused3) {
                ovVar.f29636a = null;
            }
        }
        this.B1 = ovVar;
        ovVar.f29638c.setOnSelectionUpdateListener(new d(this, 10));
        this.A1 = MessagesController.getGlobalEmojiSettings().getInt("selected_page", 0);
        Emoji.loadRecentEmoji();
        kyVar.F(false);
        I(true, z11, z12, false);
        if (Build.VERSION.SDK_INT >= 31) {
            ah.h hVar = new ah.h(false);
            this.f24755j2 = hVar;
            fh.d dVar3 = new fh.d(null);
            dVar3.f9937f = cVar;
            dVar3.d = hVar;
            dVar3.f9936e = -2;
            ah.c cVar2 = new ah.c(dVar3);
            this.f24760l2 = cVar2;
            cVar2.f547i = LiteMode.isEnabled(262144);
            int dp2 = AndroidUtilities.dp(LiteMode.isEnabled(262144) ? 8.0f : 48.0f);
            cVar2.f542b = dp2;
            cVar2.f543c = dp2;
            cVar2.h = this.f24762m2;
        } else {
            ah.c cVar3 = new ah.c(cVar);
            this.f24760l2 = cVar3;
            cVar3.h = this.f24762m2;
            this.f24755j2 = null;
        }
        this.f24758k2 = new nh(this, 1);
        setBlurredBackgroundDrawableFactory(this.f24760l2);
        this.f24762m2.b(this);
        this.f24762m2.f16515a = new vw(this, 0);
    }

    public static void a(b00 b00Var, boolean z10) {
        dx dxVar = b00Var.f24747h0;
        if (dxVar != null) {
            int childCount = dxVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = dxVar.getChildAt(i10);
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

    public static void c(b00 b00Var, jz jzVar, String str) {
        String str2;
        String str3;
        boolean z10;
        String str4;
        bz bzVar;
        ad adVar;
        org.telegram.ui.ActionBar.m2 m2Var = b00Var.Y1;
        int i10 = b00Var.f24731c1;
        ArrayList arrayList = b00Var.f24774q1;
        if (jzVar != null) {
            if (jzVar.getSpan() != null) {
                if (b00Var.f24785t1 != null) {
                    long j3 = jzVar.getSpan().documentId;
                    TLRPC.Document document = jzVar.getSpan().document;
                    oy oyVar = jzVar.f27882e;
                    if (oyVar != null && oyVar.f29656i) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (document == null) {
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            oy oyVar2 = (oy) arrayList.get(i11);
                            int i12 = 0;
                            while (true) {
                                ArrayList arrayList2 = oyVar2.f29652c;
                                if (arrayList2 != null && i12 < arrayList2.size()) {
                                    if (((TLRPC.Document) oyVar2.f29652c.get(i12)).f20074id == j3) {
                                        document = (TLRPC.Document) oyVar2.f29652c.get(i12);
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
                    if (!MessageObject.isFreeEmoji(document2) && !UserConfig.getInstance(i10).isPremium() && (((bzVar = b00Var.f24785t1) == null || !bzVar.g()) && !b00Var.U0 && !z10)) {
                        b00Var.M(false);
                        if (m2Var != null) {
                            adVar = ad.a0(m2Var);
                        } else {
                            adVar = new ad(b00Var.f24776r, b00Var.Z1);
                        }
                        if (!b00Var.f24749h2 && m2Var != null) {
                            adVar.J(R.raw.saved_messages, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint2)), LocaleController.getString(R.string.Open), new uw(b00Var, 4)).j();
                        } else {
                            adVar.q(document2, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint)), LocaleController.getString(R.string.PremiumMore), new uw(b00Var, 3)).j();
                        }
                        b00Var.f24749h2 = !b00Var.f24749h2;
                        return;
                    }
                    b00Var.E2 = SystemClock.elapsedRealtime();
                    b00Var.M(true);
                    b00Var.h("animated_" + j3);
                    b00Var.f24785t1.x(j3, document2, str5, jzVar.f27881c);
                    return;
                }
                return;
            }
            b00Var.E2 = SystemClock.elapsedRealtime();
            b00Var.M(true);
            if (str != null) {
                str2 = str;
            } else {
                str2 = (String) jzVar.getTag();
            }
            new SpannableStringBuilder().append((CharSequence) str2);
            if (str == null) {
                if (!jzVar.f27881c && (str3 = Emoji.emojiColor.get(str2)) != null) {
                    str2 = g(str2, str3);
                }
                b00Var.h(str2);
                bz bzVar2 = b00Var.f24785t1;
                if (bzVar2 != null) {
                    bzVar2.l(Emoji.fixEmoji(str2));
                    return;
                }
                return;
            }
            bz bzVar3 = b00Var.f24785t1;
            if (bzVar3 != null) {
                bzVar3.l(Emoji.fixEmoji(str));
            }
        }
    }

    public static void e(b00 b00Var, int i10, int i11) {
        s4.d1 K;
        int[] iArr = b00Var.Q0;
        if (i10 == 1) {
            b00Var.o(i11, b00Var.P);
            return;
        }
        bz bzVar = b00Var.f24785t1;
        if ((bzVar == null || !bzVar.z()) && !b00Var.J0) {
            rm0 y3 = b00Var.y(i10);
            if (i11 > 0 && y3 != null && y3.getVisibility() == 0 && (K = y3.K(0)) != null && K.f47782a.getTop() + b00Var.f24727b1 >= y3.getPaddingTop()) {
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
                b00Var.Y();
            } else {
                b00Var.z(i10).setTranslationY(Math.max(-AndroidUtilities.dp(48.0f), iArr[i10]));
            }
        }
    }

    public static void f(b00 b00Var, boolean z10) {
        int N0;
        gz gzVar = b00Var.f24750i0;
        gx gxVar = b00Var.f24767o0;
        dx dxVar = b00Var.f24747h0;
        if (dxVar != null && (dxVar.getAdapter() instanceof fz)) {
            fz fzVar = (fz) dxVar.getAdapter();
            if (!fzVar.f26590s && fzVar.h == 0 && !fzVar.f26592x.isEmpty() && (N0 = gzVar.N0()) != -1 && N0 > gzVar.B() - 5) {
                String str = fzVar.f26591w;
                String str2 = fzVar.f26589r;
                boolean z11 = fzVar.v;
                fzVar.F(str, str2, true, z11, z11);
            }
        }
        bz bzVar = b00Var.f24785t1;
        if (bzVar != null && bzVar.z()) {
            boolean z12 = false;
            s4.d1 K = dxVar.K(0);
            if (K == null) {
                nz.a(gxVar, true, !z10);
                return;
            }
            if (K.f47782a.getTop() < dxVar.getPaddingTop()) {
                z12 = true;
            }
            nz.a(gxVar, z12, !z10);
        } else if (gxVar != null && dxVar != null) {
            gxVar.f29311a.a(true, !z10);
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

    public final int B(int i10) {
        org.telegram.ui.ActionBar.d6 d6Var = this.Z1;
        if (d6Var != null) {
            return d6Var.x0(i10);
        }
        return org.telegram.ui.ActionBar.h6.x0(null, i10, false);
    }

    public final void C() {
        mx mxVar = this.G0;
        if (mxVar != null) {
            mxVar.b();
        }
        gx gxVar = this.f24767o0;
        if (gxVar != null) {
            gxVar.b();
        }
        ax axVar = this.V;
        if (axVar != null) {
            axVar.b();
        }
    }

    public final void D(boolean z10, boolean z11) {
        mz mzVar;
        boolean z12;
        if (this.A1 != 0 && this.f24795w1) {
            this.A1 = 0;
        }
        if (this.A1 == 0 && this.f24791v1) {
            this.A1 = 1;
        }
        int i10 = this.A1;
        px pxVar = this.h;
        if (i10 != 0 && !z10 && this.f24736e.size() != 1) {
            int i11 = this.A1;
            if (i11 == 1) {
                L(false, false);
                if (!this.f24787u0 && !this.f24790v0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                Q(z12, false);
                if (pxVar.getCurrentItem() != 2) {
                    pxVar.x(2, false);
                }
                nx nxVar = this.B0;
                if (nxVar != null) {
                    this.S0 = true;
                    int i12 = this.G1;
                    if (i12 >= 0) {
                        nxVar.m(i12);
                    } else {
                        int i13 = this.F1;
                        if (i13 >= 0) {
                            nxVar.m(i13);
                        } else {
                            nxVar.m(this.E1);
                        }
                    }
                    this.S0 = false;
                    this.E0.h1(0, 0);
                }
            } else if (i11 == 2) {
                L(false, false);
                Q(false, false);
                if (pxVar.getCurrentItem() != 1) {
                    pxVar.x(1, false);
                }
                iy iyVar = this.f24770p0;
                if (iyVar != null) {
                    iyVar.m(0);
                }
                gx gxVar = this.f24767o0;
                if (gxVar != null && (mzVar = gxVar.f29317r) != null) {
                    mzVar.G1(null);
                }
            }
        } else {
            L(true, false);
            Q(false, false);
            if (pxVar.getCurrentItem() != 0) {
                pxVar.x(0, !z10);
            }
            if (z11) {
                AndroidUtilities.runOnUIThread(new uw(this, 5), 350L);
            }
        }
        M(true);
    }

    public final void E() {
        rz rzVar = this.f24802y0;
        if (rzVar != null) {
            rzVar.l();
        }
        wz wzVar = this.f24805z0;
        if (wzVar != null) {
            wzVar.l();
        }
        if (org.telegram.ui.qt.q().E) {
            org.telegram.ui.qt.q().n();
        }
        org.telegram.ui.qt.q().u();
    }

    public final void F(int i10) {
        bz bzVar = this.f24785t1;
        if ((bzVar != null && bzVar.z()) || i10 == 0) {
            return;
        }
        HorizontalScrollView z10 = z(i10);
        this.Q0[i10] = 0;
        z10.setTranslationY(0);
    }

    public final void G(int i10, int i11) {
        ay ayVar = this.Q;
        View m10 = ayVar.m(i10);
        int L0 = ayVar.L0();
        int i12 = 1;
        if ((m10 == null && Math.abs(i10 - L0) > ayVar.J * 9.0f) || !SharedConfig.animationsEnabled()) {
            if (ayVar.L0() < i10) {
                i12 = 0;
            }
            ul0 ul0Var = this.f24726b0;
            ul0Var.f31630b = i12;
            ul0Var.c(i10, i11, false, false);
            return;
        }
        this.J0 = true;
        ci.l1 l1Var = new ci.l1(this, this.P.getContext(), 1);
        l1Var.f47951a = i10;
        l1Var.f14272p = i11;
        ayVar.w0(l1Var);
    }

    public final void H(int i10, int i11) {
        kx kxVar = this.E0;
        View m10 = kxVar.m(i10);
        int L0 = kxVar.L0();
        int i12 = 1;
        if (m10 == null && Math.abs(i10 - L0) > 40) {
            if (kxVar.L0() < i10) {
                i12 = 0;
            }
            ul0 ul0Var = this.f24723a0;
            ul0Var.f31630b = i12;
            ul0Var.c(i10, i11, false, false);
            return;
        }
        this.J0 = true;
        this.D0.x0(i10);
    }

    public final void I(boolean z10, boolean z11, boolean z12, boolean z13) {
        ArrayList arrayList = this.f24736e;
        arrayList.clear();
        boolean z14 = false;
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.d;
            if (i10 >= arrayList2.size()) {
                break;
            }
            if (((xz) arrayList2.get(i10)).f33091a == 0 && z10) {
                arrayList.add((xz) arrayList2.get(i10));
            }
            if (((xz) arrayList2.get(i10)).f33091a == 1 && z12) {
                arrayList.add((xz) arrayList2.get(i10));
            }
            if (((xz) arrayList2.get(i10)).f33091a == 2 && z11) {
                arrayList.add((xz) arrayList2.get(i10));
            }
            i10++;
        }
        fe0 fe0Var = this.f24793w;
        if (fe0Var != null) {
            if (arrayList.size() > 1) {
                z14 = true;
            }
            AndroidUtilities.updateViewVisibilityAnimated(fe0Var, z14, 1.0f, z13);
        }
        px pxVar = this.h;
        if (pxVar != null) {
            pxVar.setAdapter(null);
            pxVar.setAdapter(this.L0);
            if (fe0Var != null) {
                fe0Var.setViewPager(pxVar);
            }
        }
    }

    public final void J(final nh.b bVar, final TLObject tLObject, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final boolean z10, boolean z11) {
        String formatPluralString;
        wz wzVar;
        az azVar;
        if (stickerSet != null) {
            if (!z10 || (azVar = this.S) == null || azVar.d == stickerSet.f20095id) {
                if (!z10 && (wzVar = this.f24805z0) != null && wzVar.d != stickerSet.f20095id) {
                    return;
                }
                final boolean isStickerPackInstalled = MediaDataController.getInstance(this.f24731c1).isStickerPackInstalled(stickerSet.f20095id);
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
                bVar.f16943h0.a(!isStickerPackInstalled, z11);
                bVar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        int i10;
                        b00 b00Var = b00.this;
                        MediaDataController mediaDataController = MediaDataController.getInstance(b00Var.f24731c1);
                        Context context = b00Var.getContext();
                        if (isStickerPackInstalled) {
                            i10 = 0;
                        } else {
                            i10 = 2;
                        }
                        int i11 = i10;
                        org.telegram.ui.ActionBar.m2 m2Var = b00Var.Y1;
                        FrameLayout frameLayout = b00Var.f24780s;
                        nh.b bVar2 = bVar;
                        TLObject tLObject2 = tLObject;
                        TLRPC.StickerSet stickerSet2 = stickerSet;
                        TLRPC.Document document2 = document;
                        boolean z12 = z10;
                        mediaDataController.toggleStickerSet(context, tLObject2, document2, i11, m2Var, frameLayout, false, true, new i2.c1(b00Var, bVar2, tLObject2, stickerSet2, document2, z12, 10), false);
                        b00Var.J(bVar2, tLObject2, stickerSet2, document2, z12, true);
                    }
                });
            }
        }
    }

    public final void K(long j3, boolean z10, boolean z11) {
        int i10;
        View childAt;
        float f7;
        fe0 fe0Var = this.f24793w;
        if (fe0Var != null) {
            this.f24791v1 = z10;
            this.f24795w1 = z11;
            if (!z11 && !z10) {
                this.f24788u1 = 0L;
            } else {
                this.f24788u1 = j3;
            }
            if (z11) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            LinearLayout linearLayout = fe0Var.d;
            if (i10 >= linearLayout.getChildCount()) {
                childAt = null;
            } else {
                childAt = linearLayout.getChildAt(i10);
            }
            if (childAt != null) {
                if (this.f24788u1 != 0) {
                    f7 = 0.15f;
                } else {
                    f7 = 1.0f;
                }
                childAt.setAlpha(f7);
                px pxVar = this.h;
                if (z11) {
                    if (this.f24788u1 != 0 && pxVar.getCurrentItem() != 0) {
                        L(true, true);
                        Q(false, true);
                        pxVar.x(0, false);
                    }
                } else if (this.f24788u1 != 0 && pxVar.getCurrentItem() != 1) {
                    L(false, true);
                    Q(false, true);
                    pxVar.x(1, false);
                }
            }
        }
    }

    public final void L(boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        float f12;
        qx qxVar = this.f24797x;
        if (!z10 || qxVar.getTag() != null) {
            if ((!z10 && qxVar.getTag() != null) || this.f24766n2) {
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
            qxVar.setTag(num);
            int i10 = 0;
            float f13 = 0.0f;
            if (z11) {
                if (z10) {
                    qxVar.setVisibility(0);
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.F = animatorSet2;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(qxVar, View.ALPHA, f11);
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(qxVar, View.SCALE_X, f12);
                if (z10) {
                    f13 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(qxVar, View.SCALE_Y, f13));
                this.F.setDuration(200L);
                this.F.setInterpolator(is.f27501g);
                this.F.addListener(new wx(this, z10, 0));
                this.F.start();
                return;
            }
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            qxVar.setAlpha(f7);
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            qxVar.setScaleX(f10);
            if (z10) {
                f13 = 1.0f;
            }
            qxVar.setScaleY(f13);
            if (!z10) {
                i10 = 4;
            }
            qxVar.setVisibility(i10);
        }
    }

    public final void M(boolean z10) {
        Integer num;
        this.H = 0.0f;
        bz bzVar = this.f24785t1;
        if (bzVar != null && bzVar.z()) {
            z10 = false;
        }
        FrameLayout frameLayout = this.f24763n;
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
                this.W.setInterpolator(is.f27501g);
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
        TLRPC.Chat chat = MessagesController.getInstance(this.f24731c1).getChat(Long.valueOf(this.f24788u1));
        if (chat != null) {
            ai.q4 q4Var = this.N0;
            if (z10) {
                if (!ChatObject.hasAdminRights(chat) && (tL_chatBannedRights = chat.default_banned_rights) != null && (tL_chatBannedRights.send_stickers || (z11 && tL_chatBannedRights.send_plain))) {
                    org.telegram.ui.ActionBar.m2 m2Var = this.Y1;
                    if (!(m2Var instanceof org.telegram.ui.zn) || !((org.telegram.ui.zn) m2Var).N6()) {
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
            org.telegram.messenger.video.l lVar = this.K2;
            if (lVar != null) {
                AndroidUtilities.cancelRunOnUIThread(lVar);
            }
            if (z10) {
                org.telegram.messenger.video.l lVar2 = new org.telegram.messenger.video.l(this, z11, z12, 3);
                this.K2 = lVar2;
                AndroidUtilities.runOnUIThread(lVar2, 3500L);
            }
            this.J2.setDuration(320L);
            this.J2.setInterpolator(is.h);
            this.J2.start();
        }
    }

    public final void Q(boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        float f12;
        ImageView imageView = this.f24801y;
        if (imageView != null && !this.f24769o2) {
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
                        this.G.setInterpolator(is.f27501g);
                        this.G.addListener(new wx(this, z10, 1));
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
            int i10 = (this.f24775q2 > 0.0f ? 1 : (this.f24775q2 == 0.0f ? 0 : -1));
            FrameLayout frameLayout = this.f24763n;
            if (i10 >= 0) {
                f10 += getMeasuredHeight() - this.f24775q2;
            } else if (frameLayout.getTop() - f10 < 0.0f || !this.f24796w2) {
                f10 = 0.0f;
            }
            float lerp = (-f10) + AndroidUtilities.lerp(AndroidUtilities.dp(50.0f), -this.f24772p2, this.F2.f16401e);
            frameLayout.setTranslationY(lerp);
            if (this.f24733d0) {
                this.f24776r.setTranslationY(lerp);
            }
        }
    }

    public final void S() {
        nz nzVar;
        boolean z10;
        int B;
        int B2;
        int B3;
        int B4;
        int B5;
        int B6;
        int B7;
        int B8;
        pw pwVar;
        int B9;
        int B10;
        int B11;
        int B12;
        int B13;
        int B14;
        int B15;
        int B16;
        int B17;
        boolean z11 = this.f24787u0;
        View view = this.v;
        if (!z11) {
            setBackground(null);
            view.setBackground(null);
        } else if (!AndroidUtilities.isInMultiwindow && !this.N1) {
            int i10 = org.telegram.ui.ActionBar.h6.He;
            setBackgroundColor(B(i10));
            if (this.f24733d0) {
                view.setBackgroundColor(B(i10));
            }
        } else {
            Drawable background = getBackground();
            if (background != null) {
                background.setColorFilter(new PorterDuffColorFilter(B(org.telegram.ui.ActionBar.h6.He), PorterDuff.Mode.MULTIPLY));
            }
        }
        fy fyVar = this.I;
        if (fyVar != null) {
            if (this.f24787u0) {
                fyVar.setBackgroundColor(B(org.telegram.ui.ActionBar.h6.He));
                this.O.setBackgroundColor(B(org.telegram.ui.ActionBar.h6.Ke));
            } else {
                fyVar.setBackground(null);
            }
        }
        ov ovVar = this.B1;
        if (ovVar != null) {
            ovVar.f29638c.a();
        }
        int i11 = 0;
        while (true) {
            nzVar = this.V;
            z10 = this.f24752i2;
            if (i11 >= 3) {
                break;
            }
            if (i11 == 0) {
                nzVar = this.G0;
            } else if (i11 != 1) {
                nzVar = this.f24767o0;
            }
            if (nzVar != null) {
                yq yqVar = nzVar.d;
                FrameLayout frameLayout = nzVar.f29316n;
                View view2 = nzVar.f29315f;
                if (this.f24787u0) {
                    view2.setBackgroundColor(B(org.telegram.ui.ActionBar.h6.He));
                } else {
                    view2.setBackground(null);
                }
                nzVar.f29314e.setBackgroundColor(B(org.telegram.ui.ActionBar.h6.Ke));
                eo0 eo0Var = nzVar.f29313c;
                if (z10) {
                    B14 = w(0.4f);
                } else {
                    B14 = B(org.telegram.ui.ActionBar.h6.Je);
                }
                eo0Var.a(B14);
                Drawable background2 = frameLayout.getBackground();
                if (z10) {
                    B15 = w(0.06f);
                } else {
                    B15 = B(org.telegram.ui.ActionBar.h6.Ie);
                }
                org.telegram.ui.ActionBar.h6.x1(B15, background2);
                frameLayout.invalidate();
                if (z10) {
                    B16 = w(0.45f);
                } else {
                    B16 = B(org.telegram.ui.ActionBar.h6.Je);
                }
                yqVar.setHintTextColor(B16);
                if (z10) {
                    B17 = w(0.8f);
                } else {
                    B17 = B(org.telegram.ui.ActionBar.h6.G6);
                }
                yqVar.setTextColor(B17);
            }
            i11++;
        }
        Paint paint = this.f24782s1;
        if (paint != null) {
            paint.setColor(B(org.telegram.ui.ActionBar.h6.f20774af));
        }
        ny nyVar = this.P;
        if (nyVar != null) {
            nyVar.setGlowColor(B(org.telegram.ui.ActionBar.h6.He));
        }
        jx jxVar = this.D0;
        if (jxVar != null) {
            jxVar.setGlowColor(B(org.telegram.ui.ActionBar.h6.He));
        }
        nx nxVar = this.B0;
        if (nxVar != null) {
            nxVar.setIndicatorColor(B(org.telegram.ui.ActionBar.h6.Qe));
            nxVar.setUnderlineColor(B(org.telegram.ui.ActionBar.h6.Ke));
            if (this.f24787u0) {
                nxVar.setBackgroundColor(B(org.telegram.ui.ActionBar.h6.He));
            } else {
                nxVar.setBackground(null);
            }
        }
        iy iyVar = this.f24770p0;
        if (iyVar != null) {
            iyVar.setIndicatorColor(B(org.telegram.ui.ActionBar.h6.Qe));
            iyVar.setUnderlineColor(B(org.telegram.ui.ActionBar.h6.Ke));
            if (this.f24787u0) {
                iyVar.setBackgroundColor(B(org.telegram.ui.ActionBar.h6.He));
            } else {
                iyVar.setBackground(null);
            }
        }
        qx qxVar = this.f24797x;
        if (qxVar != null) {
            if (z10) {
                B13 = w(0.6f);
            } else {
                B13 = B(org.telegram.ui.ActionBar.h6.Re);
            }
            qxVar.setColorFilter(new PorterDuffColorFilter(B13, PorterDuff.Mode.MULTIPLY));
            if (nzVar == null) {
                Drawable background3 = qxVar.getBackground();
                int i12 = org.telegram.ui.ActionBar.h6.He;
                org.telegram.ui.ActionBar.h6.C1(background3, B(i12), false);
                org.telegram.ui.ActionBar.h6.C1(qxVar.getBackground(), B(i12), true);
            }
        }
        ImageView imageView = this.f24801y;
        if (imageView != null) {
            if (z10) {
                B12 = w(0.6f);
            } else {
                B12 = B(org.telegram.ui.ActionBar.h6.Re);
            }
            imageView.setColorFilter(new PorterDuffColorFilter(B12, PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.E;
        if (imageView2 != null) {
            if (z10) {
                B11 = w(0.6f);
            } else {
                B11 = B(org.telegram.ui.ActionBar.h6.Re);
            }
            imageView2.setColorFilter(new PorterDuffColorFilter(B11, PorterDuff.Mode.MULTIPLY));
        }
        ai.q4 q4Var = this.N0;
        if (q4Var != null) {
            ((ShapeDrawable) q4Var.getBackground()).getPaint().setColor(B(org.telegram.ui.ActionBar.h6.f21070qf));
            q4Var.setTextColor(B(org.telegram.ui.ActionBar.h6.f21051pf));
        }
        fz fzVar = this.f24753j0;
        if (fzVar != null) {
            hz hzVar = fzVar.f26586e;
            ImageView imageView3 = hzVar.f27255a;
            int i13 = org.telegram.ui.ActionBar.h6.Le;
            imageView3.setColorFilter(new PorterDuffColorFilter(B(i13), PorterDuff.Mode.MULTIPLY));
            hzVar.f27256b.setTextColor(B(i13));
            hzVar.f27257c.setProgressColor(B(org.telegram.ui.ActionBar.h6.f20894h6));
        }
        this.f24739e2 = new PorterDuffColorFilter(B(org.telegram.ui.ActionBar.h6.Oh), PorterDuff.Mode.SRC_IN);
        int i14 = 0;
        while (true) {
            Drawable[] drawableArr = this.X0;
            if (i14 >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i14];
            if (z10) {
                B9 = w(0.4f);
            } else {
                B9 = B(org.telegram.ui.ActionBar.h6.Ne);
            }
            org.telegram.ui.ActionBar.h6.z1(drawable, B9, false);
            Drawable drawable2 = drawableArr[i14];
            if (z10) {
                B10 = w(0.8f);
            } else {
                B10 = B(org.telegram.ui.ActionBar.h6.Oe);
            }
            org.telegram.ui.ActionBar.h6.z1(drawable2, B10, true);
            i14++;
        }
        if (fyVar != null && (pwVar = fyVar.f31358y) != null) {
            pwVar.d();
        }
        int i15 = 0;
        while (true) {
            Drawable[] drawableArr2 = this.Y0;
            if (i15 >= drawableArr2.length) {
                break;
            }
            Drawable drawable3 = drawableArr2[i15];
            if (z10) {
                B7 = w(0.4f);
            } else {
                B7 = B(org.telegram.ui.ActionBar.h6.Me);
            }
            org.telegram.ui.ActionBar.h6.z1(drawable3, B7, false);
            Drawable drawable4 = drawableArr2[i15];
            if (z10) {
                B8 = w(0.8f);
            } else {
                B8 = B(org.telegram.ui.ActionBar.h6.Oe);
            }
            org.telegram.ui.ActionBar.h6.z1(drawable4, B8, true);
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
                B5 = w(0.4f);
            } else {
                B5 = B(org.telegram.ui.ActionBar.h6.Me);
            }
            org.telegram.ui.ActionBar.h6.z1(drawable5, B5, false);
            Drawable drawable6 = drawableArr3[i16];
            if (z10) {
                B6 = w(0.8f);
            } else {
                B6 = B(org.telegram.ui.ActionBar.h6.Oe);
            }
            org.telegram.ui.ActionBar.h6.z1(drawable6, B6, true);
            i16++;
        }
        org.telegram.ui.ActionBar.s5 s5Var = this.a2;
        if (s5Var != null) {
            if (z10) {
                B3 = w(0.4f);
            } else {
                B3 = B(org.telegram.ui.ActionBar.h6.Ne);
            }
            org.telegram.ui.ActionBar.h6.z1(s5Var, B3, false);
            if (z10) {
                B4 = w(0.8f);
            } else {
                B4 = B(org.telegram.ui.ActionBar.h6.Oe);
            }
            org.telegram.ui.ActionBar.h6.z1(s5Var, B4, true);
        }
        org.telegram.ui.ActionBar.s5 s5Var2 = this.f24728b2;
        if (s5Var2 != null) {
            if (z10) {
                B = w(0.4f);
            } else {
                B = B(org.telegram.ui.ActionBar.h6.Qe);
            }
            org.telegram.ui.ActionBar.h6.z1(s5Var2, B, false);
            if (z10) {
                B2 = w(0.8f);
            } else {
                B2 = B(org.telegram.ui.ActionBar.h6.Qe);
            }
            org.telegram.ui.ActionBar.h6.z1(s5Var2, B2, true);
        }
    }

    public final void T() {
        ny nyVar = this.P;
        if (nyVar != null) {
            for (int i10 = 0; i10 < nyVar.getChildCount(); i10++) {
                View childAt = nyVar.getChildAt(i10);
                if (childAt instanceof sy) {
                    ((sy) childAt).a(true);
                }
            }
        }
    }

    public final void U(int i10) {
        int i11;
        if (!this.f24741f0) {
            int i12 = -1;
            if (i10 != -1) {
                int size = getRecentEmoji().size() + (this.f24733d0 ? 1 : 0);
                ky kyVar = this.R;
                int i13 = kyVar.f28149c;
                ArrayList arrayList = kyVar.f28156x;
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
                        ArrayList<oy> emojipacks = getEmojipacks();
                        int size2 = arrayList.size() - 1;
                        while (true) {
                            if (size2 < 0) {
                                break;
                            } else if (((Integer) arrayList.get(size2)).intValue() <= i10) {
                                oy oyVar = (oy) this.f24774q1.get(size2);
                                while (i14 < emojipacks.size()) {
                                    long j3 = emojipacks.get(i14).f29651b.f20095id;
                                    long j10 = oyVar.f29651b.f20095id;
                                    if (j3 == j10 && (!oyVar.f29655g || (!oyVar.f29654f && !this.f24771p1.contains(Long.valueOf(j10))))) {
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
        mz mzVar;
        int i11;
        boolean z12;
        boolean z13;
        iy iyVar = this.f24770p0;
        int currentPosition = iyVar.getCurrentPosition();
        int i12 = this.f24777r0;
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
        boolean isEmpty = this.f24751i1.isEmpty();
        iyVar.d(false);
        this.f24777r0 = -2;
        this.f24781s0 = -2;
        this.f24784t0 = -2;
        Drawable[] drawableArr = this.Z0;
        if (!isEmpty) {
            this.f24777r0 = 0;
            iyVar.b(0, drawableArr[0]).setContentDescription(LocaleController.getString(R.string.RecentStickers));
            i10 = 1;
        } else {
            i10 = 0;
        }
        this.f24781s0 = i10;
        iyVar.b(1, drawableArr[1]).setContentDescription(LocaleController.getString(R.string.FeaturedGifs));
        this.f24784t0 = i10 + 1;
        AndroidUtilities.dp(13.0f);
        AndroidUtilities.dp(11.0f);
        int i13 = this.f24731c1;
        ArrayList<String> arrayList = MessagesController.getInstance(i13).gifSearchEmojies;
        int size = arrayList.size();
        int i14 = 0;
        while (i14 < size) {
            String str = arrayList.get(i14);
            Emoji.EmojiDrawable emojiDrawable = Emoji.getEmojiDrawable(str);
            if (emojiDrawable != null) {
                TLRPC.Document emojiAnimatedSticker = MediaDataController.getInstance(i13).getEmojiAnimatedSticker(str);
                String h = hg.c.h(i14 + 3, "tab");
                int i15 = iyVar.f29926x;
                iyVar.f29926x = i15 + 1;
                gy0 gy0Var = (gy0) iyVar.f29916n.get(h);
                if (gy0Var != null) {
                    iyVar.g(h, gy0Var, i15);
                    i11 = currentPosition;
                    z12 = z11;
                } else {
                    i11 = currentPosition;
                    z12 = z11;
                    gy0Var = new gy0(iyVar.getContext(), 2);
                    gy0Var.setFocusable(true);
                    gy0Var.setOnClickListener(new in0(iyVar, 2));
                    gy0Var.setExpanded(iyVar.f29909f0);
                    gy0Var.a(iyVar.f29912i0);
                    iyVar.f29906e.addView(gy0Var, i15);
                }
                gy0Var.d = false;
                gy0Var.setTag(R.id.index_tag, Integer.valueOf(i15));
                gy0Var.setTag(R.id.parent_tag, emojiDrawable);
                gy0Var.setTag(R.id.object_tag, emojiAnimatedSticker);
                if (i15 == iyVar.f29927y) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                gy0Var.setSelected(z13);
                iyVar.h.put(h, gy0Var);
                gy0Var.setContentDescription(str);
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
        iyVar.h();
        iyVar.q();
        if (z10 && isEmpty) {
            iyVar.m(this.f24781s0);
            gx gxVar = this.f24767o0;
            if (gxVar != null && (mzVar = gxVar.f29317r) != null) {
                mzVar.G1(null);
                return;
            }
            return;
        }
        WeakHashMap weakHashMap = r0.i0.f46890a;
        if (iyVar.isLaidOut()) {
            if (!isEmpty && !z14) {
                iyVar.k(i16 + 1, 0);
            } else if (isEmpty && z14) {
                iyVar.k(i16 - 1, 0);
            }
        }
    }

    public final void W() {
        fz fzVar;
        int size = this.f24751i1.size();
        long calcDocumentsHash = MediaDataController.calcDocumentsHash(this.f24751i1, Integer.MAX_VALUE);
        ArrayList<TLRPC.Document> recentGifs = MediaDataController.getInstance(this.f24731c1).getRecentGifs();
        this.f24751i1 = recentGifs;
        long calcDocumentsHash2 = MediaDataController.calcDocumentsHash(recentGifs, Integer.MAX_VALUE);
        if ((this.f24770p0 != null && size == 0 && !this.f24751i1.isEmpty()) || (size != 0 && this.f24751i1.isEmpty())) {
            V();
        }
        if ((size != this.f24751i1.size() || calcDocumentsHash != calcDocumentsHash2) && (fzVar = this.f24764n0) != null) {
            fzVar.l();
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
        nx nxVar = this.B0;
        if (nxVar != null) {
            cc1 cc1Var = nxVar.f29906e;
            if (nxVar.f29923s != null) {
                return;
            }
            this.F1 = -2;
            this.G1 = -2;
            this.H1 = -2;
            this.I1 = -2;
            this.f24737e0 = false;
            this.E1 = 0;
            int currentPosition = nxVar.getCurrentPosition();
            boolean z17 = true;
            if (getParent() != null && getVisibility() == 0 && (this.f24803y1.size() != 0 || this.f24806z1.size() != 0)) {
                z11 = true;
            } else {
                z11 = false;
            }
            nxVar.d(z11);
            int i11 = this.f24731c1;
            MediaDataController mediaDataController = MediaDataController.getInstance(i11);
            SharedPreferences emojiSettings = MessagesController.getEmojiSettings(i11);
            ArrayList arrayList3 = this.f24761m1;
            arrayList3.clear();
            ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = mediaDataController.getFeaturedStickerSets();
            int size = featuredStickerSets.size();
            for (int i12 = 0; i12 < size; i12++) {
                TLRPC.StickerSetCovered stickerSetCovered = featuredStickerSets.get(i12);
                if (!mediaDataController.isStickerPackInstalled(stickerSetCovered.set.f20095id)) {
                    arrayList3.add(stickerSetCovered);
                }
            }
            zz zzVar = this.F0;
            if (zzVar != null) {
                zzVar.l();
            }
            boolean isEmpty = featuredStickerSets.isEmpty();
            long j3 = 0;
            Drawable[] drawableArr = this.Y0;
            if (!isEmpty && (arrayList3.isEmpty() || emojiSettings.getLong("featured_hidden", 0L) == featuredStickerSets.get(0).set.f20095id)) {
                if (mediaDataController.getUnreadStickerSets().isEmpty()) {
                    i10 = 2;
                } else {
                    i10 = 3;
                }
                gy0 c10 = nxVar.c(i10, drawableArr[i10]);
                c10.h.setText(LocaleController.getString(R.string.FeaturedStickersShort));
                c10.setContentDescription(LocaleController.getString(R.string.FeaturedStickers));
                int i13 = this.E1;
                this.H1 = i13;
                this.E1 = i13 + 1;
            }
            if (!this.f24757k1.isEmpty()) {
                int i14 = this.E1;
                this.G1 = i14;
                this.E1 = i14 + 1;
                gy0 c11 = nxVar.c(1, drawableArr[1]);
                c11.h.setText(LocaleController.getString(R.string.FavoriteStickersShort));
                c11.setContentDescription(LocaleController.getString(R.string.FavoriteStickers));
            }
            if (!this.f24754j1.isEmpty()) {
                int i15 = this.E1;
                this.F1 = i15;
                this.E1 = i15 + 1;
                gy0 c12 = nxVar.c(0, drawableArr[0]);
                c12.h.setText(LocaleController.getString(R.string.RecentStickersShort));
                c12.setContentDescription(LocaleController.getString(R.string.RecentStickers));
            }
            ArrayList arrayList4 = this.f24734d1;
            arrayList4.clear();
            org.telegram.ui.ActionBar.d6 d6Var = null;
            this.f24748h1 = null;
            this.f24742f1 = -1;
            this.f24738e1 = -10;
            if (this.G2 == null || z10) {
                this.G2 = new ArrayList(mediaDataController.getStickerSets(0));
            }
            ArrayList<TLRPC.TL_messages_stickerSet> arrayList5 = this.G2;
            int i16 = 0;
            while (true) {
                TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.f24799x1;
                if (i16 >= stickerSetCoveredArr.length) {
                    break;
                }
                TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCoveredArr[i16];
                long j10 = j3;
                if (stickerSetCovered2 != null) {
                    TLRPC.TL_messages_stickerSet stickerSetById = mediaDataController.getStickerSetById(stickerSetCovered2.set.f20095id);
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
                long j12 = MessagesController.getEmojiSettings(i11).getLong("group_hide_stickers_" + this.J1.f20069id, -1L);
                TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(this.J1.f20069id));
                if (chat != null && this.J1.stickerset != null && ChatObject.hasAdminRights(chat)) {
                    TLRPC.StickerSet stickerSet3 = this.J1.stickerset;
                    if (stickerSet3 != null) {
                        if (j12 == stickerSet3.f20095id) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        this.f24745g1 = z16;
                    }
                } else {
                    if (j12 != -1) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    this.f24745g1 = z15;
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
                        if (this.f24745g1) {
                            this.f24738e1 = arrayList4.size();
                            arrayList4.add(tL_messages_stickerSet3);
                        } else {
                            this.f24738e1 = 0;
                            arrayList4.add(0, tL_messages_stickerSet3);
                        }
                        if (!this.J1.can_set_stickers) {
                            tL_messages_stickerSet3 = null;
                        }
                        this.f24748h1 = tL_messages_stickerSet3;
                    }
                } else if (chatFull.can_set_stickers) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = new TLRPC.TL_messages_stickerSet();
                    if (this.f24745g1) {
                        this.f24738e1 = arrayList4.size();
                        arrayList4.add(tL_messages_stickerSet4);
                    } else {
                        this.f24738e1 = 0;
                        arrayList4.add(0, tL_messages_stickerSet4);
                    }
                }
            }
            int i18 = 0;
            while (i18 < arrayList4.size()) {
                if (i18 == this.f24738e1) {
                    TLRPC.Chat chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(this.J1.f20069id));
                    if (chat2 == null) {
                        arrayList4.remove(0);
                        i18--;
                    } else {
                        this.f24737e0 = z17;
                        String str = "chat" + chat2.f20068id;
                        int i19 = nxVar.f29926x;
                        nxVar.f29926x = i19 + 1;
                        gy0 gy0Var = (gy0) nxVar.f29916n.get(str);
                        if (gy0Var != null) {
                            nxVar.g(str, gy0Var, i19);
                        } else {
                            gy0Var = new gy0(nxVar.getContext(), 0);
                            gy0Var.setFocusable(z17);
                            gy0Var.setOnClickListener(new in0(nxVar, 0));
                            cc1Var.addView(gy0Var, i19);
                            gy0Var.f26903w = z17;
                            j9 j9Var = new j9(d6Var);
                            j9Var.u(AndroidUtilities.dp(14.0f));
                            j9Var.k(UserConfig.selectedAccount, chat2);
                            int i20 = nxVar.f29899a;
                            y9 y9Var = gy0Var.f26898e;
                            y9Var.setLayerNum(i20);
                            y9Var.e(chat2, j9Var);
                            y9Var.setAspectFit(z17);
                            gy0Var.setExpanded(nxVar.f29909f0);
                            gy0Var.a(nxVar.f29912i0);
                            gy0Var.h.setText(chat2.title);
                        }
                        gy0Var.d = z17;
                        gy0Var.setTag(R.id.index_tag, Integer.valueOf(i19));
                        if (i19 == nxVar.f29927y) {
                            z14 = z17;
                        } else {
                            z14 = false;
                        }
                        gy0Var.setSelected(z14);
                        nxVar.h.put(str, gy0Var);
                    }
                    z12 = z17;
                } else {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet5 = (TLRPC.TL_messages_stickerSet) arrayList4.get(i18);
                    TLRPC.StickerSet stickerSet5 = tL_messages_stickerSet5.set;
                    if (stickerSet5 != null && stickerSet5.thumb_document_id != j11) {
                        for (int i21 = 0; i21 < tL_messages_stickerSet5.documents.size(); i21++) {
                            document = tL_messages_stickerSet5.documents.get(i21);
                            if (document != null && tL_messages_stickerSet5.set.thumb_document_id == document.f20074id) {
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
                    String str2 = "set" + tL_messages_stickerSet5.set.f20095id;
                    int i22 = nxVar.f29926x;
                    nxVar.f29926x = i22 + 1;
                    gy0 gy0Var2 = (gy0) nxVar.f29916n.get(str2);
                    if (gy0Var2 != null) {
                        nxVar.g(str2, gy0Var2, i22);
                        z12 = z17;
                    } else {
                        gy0Var2 = new gy0(nxVar.getContext(), 0);
                        gy0Var2.setFocusable(z17);
                        z12 = z17;
                        gy0Var2.setOnClickListener(new in0(nxVar, 1));
                        gy0Var2.setExpanded(nxVar.f29909f0);
                        gy0Var2.a(nxVar.f29912i0);
                        cc1Var.addView(gy0Var2, i22);
                    }
                    gy0Var2.f26898e.setLayerNum(nxVar.f29899a);
                    gy0Var2.d = false;
                    gy0Var2.setTag(closestPhotoSizeWithSize);
                    gy0Var2.setTag(R.id.index_tag, Integer.valueOf(i22));
                    gy0Var2.setTag(R.id.parent_tag, tL_messages_stickerSet5);
                    gy0Var2.setTag(R.id.object_tag, document);
                    if (i22 == nxVar.f29927y) {
                        z13 = z12;
                    } else {
                        z13 = false;
                    }
                    gy0Var2.setSelected(z13);
                    nxVar.h.put(str2, gy0Var2);
                    gy0Var2.setContentDescription(tL_messages_stickerSet5.set.title + ", " + LocaleController.getString(R.string.AccDescrStickerSet));
                }
                i18++;
                z17 = z12;
                d6Var = null;
            }
            nxVar.h();
            nxVar.q();
            if (currentPosition != 0) {
                nxVar.k(currentPosition, currentPosition);
            }
            p();
        }
    }

    public final void Y() {
        boolean z10;
        int i10;
        ox oxVar = this.C0;
        nx nxVar = this.B0;
        if (nxVar != null && oxVar == null && this.f24785t1 != null) {
            nxVar.setTranslationY(this.f24785t1.p() * (-AndroidUtilities.dp(50.0f)));
        }
        if (oxVar == null) {
            return;
        }
        if (getVisibility() == 0 && this.K0 && this.f24785t1.p() != 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        oxVar.setVisibility(i10);
        if (z10) {
            Rect rect = this.f24800x2;
            rect.setEmpty();
            this.h.getChildVisibleRect(this.f24798x0, rect, null);
            float p5 = this.f24785t1.p() * AndroidUtilities.dp(50.0f);
            int i11 = rect.left;
            if (i11 != 0 || p5 != 0.0f) {
                this.X1 = false;
            }
            oxVar.setTranslationX(i11);
            float translationY = (((getTranslationY() + getTop()) - oxVar.getTop()) - nxVar.getExpandedOffset()) - p5;
            if (oxVar.getTranslationY() != translationY) {
                oxVar.setTranslationY(translationY);
                oxVar.invalidate();
            }
        }
        if (this.X1 && z10 && this.P0) {
            nxVar.i(this.W1, true);
            return;
        }
        this.X1 = false;
        nxVar.i(this.W1, false);
    }

    public final void Z() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        org.telegram.ui.Cells.s3 s3Var;
        LongSparseArray longSparseArray = this.f24806z1;
        LongSparseArray longSparseArray2 = this.f24803y1;
        int i10 = this.f24731c1;
        jx jxVar = this.D0;
        if (jxVar != null) {
            try {
                int childCount = jxVar.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = jxVar.getChildAt(i11);
                    if ((childAt instanceof org.telegram.ui.Cells.s3) && ((bm0) jxVar.T(childAt)) != null) {
                        org.telegram.ui.Cells.s3 s3Var2 = (org.telegram.ui.Cells.s3) childAt;
                        ArrayList<Long> unreadStickerSets = MediaDataController.getInstance(i10).getUnreadStickerSets();
                        TLRPC.StickerSetCovered stickerSet = s3Var2.getStickerSet();
                        if (unreadStickerSets != null && unreadStickerSets.contains(Long.valueOf(stickerSet.set.f20095id))) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        int i12 = 0;
                        while (true) {
                            TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.f24799x1;
                            if (i12 < stickerSetCoveredArr.length) {
                                TLRPC.StickerSetCovered stickerSetCovered = stickerSetCoveredArr[i12];
                                if (stickerSetCovered != null) {
                                    s3Var = s3Var2;
                                    if (stickerSetCovered.set.f20095id == stickerSet.set.f20095id) {
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
                            MediaDataController.getInstance(i10).markFeaturedStickersByIdAsRead(false, stickerSet.set.f20095id);
                        }
                        if (longSparseArray2.indexOfKey(stickerSet.set.f20095id) >= 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (longSparseArray.indexOfKey(stickerSet.set.f20095id) >= 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z12 || z13) {
                            if (z12 && s3Var2.f22931r) {
                                longSparseArray2.remove(stickerSet.set.f20095id);
                                z12 = false;
                            } else if (z13 && !s3Var2.f22931r) {
                                longSparseArray.remove(stickerSet.set.f20095id);
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
        this.f24775q2 = f7;
        R();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        Utilities.Callback callback;
        TLRPC.StickerSet stickerSet;
        int i12 = NotificationCenter.stickersDidLoad;
        ky kyVar = this.R;
        uw uwVar = this.L2;
        if (i10 == i12) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (this.f24802y0 != null) {
                    X(((Boolean) objArr[1]).booleanValue());
                    Z();
                    E();
                    p();
                }
            } else if (((Integer) objArr[0]).intValue() == 5) {
                if (((Boolean) objArr[1]).booleanValue()) {
                    AndroidUtilities.cancelRunOnUIThread(uwVar);
                    AndroidUtilities.runOnUIThread(uwVar, 100L);
                    return;
                }
                kyVar.F(false);
            }
        } else if (i10 == NotificationCenter.groupPackUpdated) {
            long longValue = ((Long) objArr[0]).longValue();
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            TLRPC.ChatFull chatFull = this.J1;
            if (chatFull != null && chatFull.f20069id == longValue && booleanValue) {
                kyVar.F(true);
            }
        } else if (i10 == NotificationCenter.recentDocumentsDidLoad) {
            boolean booleanValue2 = ((Boolean) objArr[0]).booleanValue();
            int intValue = ((Integer) objArr[1]).intValue();
            if (booleanValue2 || intValue == 0 || intValue == 2) {
                k(booleanValue2);
            }
        } else if (i10 == NotificationCenter.featuredStickersDidLoad) {
            Z();
            fe0 fe0Var = this.f24793w;
            if (fe0Var != null) {
                int childCount = fe0Var.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    fe0Var.getChildAt(i13).invalidate();
                }
            }
            X(false);
        } else if (i10 == NotificationCenter.featuredEmojiDidLoad) {
            if (kyVar != null) {
                kyVar.F(false);
            }
        } else {
            int i14 = NotificationCenter.groupStickersDidLoad;
            az azVar = this.S;
            if (i10 == i14) {
                Long l4 = (Long) objArr[0];
                long longValue2 = l4.longValue();
                if (objArr.length > 1) {
                    tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) objArr[1];
                } else {
                    tL_messages_stickerSet = null;
                }
                if (tL_messages_stickerSet != null) {
                    wz wzVar = this.f24805z0;
                    if (wzVar != null && wzVar.d == longValue2 && wzVar.f32813f.size() < tL_messages_stickerSet.documents.size()) {
                        wzVar.f32813f = tL_messages_stickerSet.documents;
                        wzVar.l();
                    }
                    if (azVar != null && azVar.d == longValue2 && azVar.f24706f.size() < tL_messages_stickerSet.documents.size()) {
                        azVar.f24706f = tL_messages_stickerSet.documents;
                        azVar.l();
                    }
                }
                TLRPC.ChatFull chatFull2 = this.J1;
                if (chatFull2 != null && (stickerSet = chatFull2.stickerset) != null && stickerSet.f20095id == longValue2) {
                    X(false);
                }
                HashMap hashMap = this.f24778r1;
                if (hashMap.containsKey(l4) && objArr.length >= 2 && ((Utilities.Callback) hashMap.get(l4)) != null && tL_messages_stickerSet != null && (callback = (Utilities.Callback) hashMap.remove(l4)) != null) {
                    callback.run(tL_messages_stickerSet);
                }
                AndroidUtilities.cancelRunOnUIThread(uwVar);
                AndroidUtilities.runOnUIThread(uwVar, 100L);
                return;
            }
            int i15 = NotificationCenter.emojiLoaded;
            ny nyVar = this.P;
            if (i10 == i15) {
                jx jxVar = this.D0;
                if (jxVar != null) {
                    int childCount2 = jxVar.getChildCount();
                    for (int i16 = 0; i16 < childCount2; i16++) {
                        View childAt = jxVar.getChildAt(i16);
                        if ((childAt instanceof org.telegram.ui.Cells.o8) || (childAt instanceof org.telegram.ui.Cells.f8)) {
                            childAt.invalidate();
                        }
                    }
                }
                if (nyVar != null) {
                    nyVar.invalidate();
                    int childCount3 = nyVar.getChildCount();
                    for (int i17 = 0; i17 < childCount3; i17++) {
                        View childAt2 = nyVar.getChildAt(i17);
                        if (childAt2 instanceof jz) {
                            childAt2.invalidate();
                        }
                    }
                }
                ov ovVar = this.B1;
                if (ovVar != null) {
                    ovVar.f29638c.invalidate();
                }
                iy iyVar = this.f24770p0;
                if (iyVar != null) {
                    cc1 cc1Var = iyVar.f29906e;
                    int childCount4 = cc1Var.getChildCount();
                    for (int i18 = 0; i18 < childCount4; i18++) {
                        cc1Var.getChildAt(i18).invalidate();
                    }
                }
            } else if (i10 == NotificationCenter.newEmojiSuggestionsAvailable) {
                if (nyVar != null && this.f24733d0) {
                    if ((this.V.f29313c.f26156k == 2 || nyVar.getAdapter() == azVar) && !TextUtils.isEmpty(azVar.v)) {
                        azVar.F(azVar.v, true);
                    }
                }
            } else if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                if (kyVar != null) {
                    kyVar.F(false);
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
            if (this.f24763n.getVisibility() != 8 && !this.f24787u0 && this.f24794w0) {
                canvas.drawColor(i0.a.k(-1, 25));
            }
            boolean drawChild = super.drawChild(canvas, view, j3);
            float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(this.f24772p2);
            if (navigationBarThirdButtonsFactor > 0.0f) {
                int m12 = org.telegram.ui.ActionBar.h6.m1(navigationBarThirdButtonsFactor, B(org.telegram.ui.ActionBar.h6.He));
                int i10 = this.B2;
                GradientDrawable gradientDrawable = this.A2;
                if (i10 != m12) {
                    gradientDrawable.setColors(new int[]{m12, org.telegram.ui.ActionBar.h6.m1(0.66f, m12), i0.a.k(m12, 0)});
                    this.B2 = m12;
                }
                gradientDrawable.setBounds(0, getMeasuredHeight() - this.f24772p2, getMeasuredWidth(), getMeasuredHeight());
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

    public ArrayList<oy> getEmojipacks() {
        ArrayList<oy> arrayList = new ArrayList<>();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f24774q1;
            if (i10 < arrayList2.size()) {
                oy oyVar = (oy) arrayList2.get(i10);
                boolean z10 = oyVar.f29655g;
                ArrayList arrayList3 = this.f24771p1;
                if ((!z10 && (oyVar.f29654f || arrayList3.contains(Long.valueOf(oyVar.f29651b.f20095id)))) || (oyVar.f29655g && !oyVar.f29654f && !arrayList3.contains(Long.valueOf(oyVar.f29651b.f20095id)))) {
                    arrayList.add(oyVar);
                }
                i10++;
            } else {
                return arrayList;
            }
        }
    }

    public ArrayList<String> getRecentEmoji() {
        if (this.f24732c2) {
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
        nx nxVar = this.B0;
        if (nxVar == null) {
            return 0.0f;
        }
        return nxVar.getExpandedOffset();
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
                if (!this.f24732c2) {
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
        xx xxVar = new xx(getContext(), i11);
        xxVar.f47951a = !z10 ? 1 : 0;
        x(i10).w0(xxVar);
    }

    public final void k(boolean z10) {
        if (z10) {
            W();
            return;
        }
        int size = this.f24754j1.size();
        int size2 = this.f24757k1.size();
        int i10 = this.f24731c1;
        this.f24754j1 = MediaDataController.getInstance(i10).getRecentStickers(0, true);
        this.f24757k1 = MediaDataController.getInstance(i10).getRecentStickers(2);
        if (UserConfig.getInstance(i10).isPremium()) {
            this.l1 = MediaDataController.getInstance(i10).getRecentStickers(7);
        } else {
            this.l1 = new ArrayList();
        }
        for (int i11 = 0; i11 < this.f24757k1.size(); i11++) {
            TLRPC.Document document = (TLRPC.Document) this.f24757k1.get(i11);
            int i12 = 0;
            while (true) {
                if (i12 < this.f24754j1.size()) {
                    TLRPC.Document document2 = (TLRPC.Document) this.f24754j1.get(i12);
                    if (document2.dc_id == document.dc_id && document2.f20074id == document.f20074id) {
                        this.f24754j1.remove(i12);
                        break;
                    }
                    i12++;
                }
            }
        }
        if (MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            int i13 = 0;
            while (i13 < this.f24757k1.size()) {
                if (MessageObject.isPremiumSticker((TLRPC.Document) this.f24757k1.get(i13))) {
                    this.f24757k1.remove(i13);
                    i13--;
                }
                i13++;
            }
            int i14 = 0;
            while (i14 < this.f24754j1.size()) {
                if (MessageObject.isPremiumSticker((TLRPC.Document) this.f24754j1.get(i14))) {
                    this.f24754j1.remove(i14);
                    i14--;
                }
                i14++;
            }
        }
        if (size != this.f24754j1.size() || size2 != this.f24757k1.size()) {
            X(false);
        }
        rz rzVar = this.f24802y0;
        if (rzVar != null) {
            rzVar.l();
        }
        p();
    }

    public final void l(boolean z10) {
        int i10;
        boolean z11;
        bz bzVar = this.f24785t1;
        me.b bVar = this.f24725b;
        ny nyVar = this.P;
        ax axVar = this.V;
        if (bzVar != null && bzVar.z()) {
            s4.d1 K = nyVar.K(0);
            if (K == null) {
                nz.a(axVar, true, !z10);
            } else {
                if (K.f47782a.getTop() < nyVar.getPaddingTop()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                nz.a(axVar, z11, !z10);
            }
            N(false, !z10);
            axVar.setTranslationY(bVar.f16401e * AndroidUtilities.dp(15.0f));
        } else if (axVar != null && nyVar != null) {
            s4.d1 K2 = nyVar.K(0);
            if (K2 != null) {
                i10 = K2.f47782a.getTop();
            } else {
                i10 = -this.f24727b1;
            }
            axVar.setTranslationY((bVar.f16401e * AndroidUtilities.dp(15.0f)) + i10);
            axVar.f29311a.a(false, !z10);
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
        if (dp > 0 && (K == null || K.f47782a.getBottom() < dp)) {
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
            float f11 = 1.0f - this.f24722a.f16401e;
            mx mxVar = this.G0;
            mxVar.setAlpha(f11);
            if (f11 > 0.0f) {
                i13 = 0;
            } else {
                i13 = 4;
            }
            mxVar.setVisibility(i13);
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
            this.f24798x0.invalidate();
        } else if (i10 == 1) {
            l(false);
            float f13 = 1.0f - this.f24725b.f16401e;
            ax axVar = this.V;
            axVar.setAlpha(f13);
            if (f13 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            axVar.setVisibility(i11);
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
        ny nyVar;
        s4.d1 K;
        int i11;
        fy fyVar = this.I;
        int[] iArr = this.Q0;
        if (view == null) {
            iArr[1] = 0;
            fyVar.setTranslationY(0);
        } else if (view.getVisibility() == 0 && !this.f24741f0) {
            bz bzVar = this.f24785t1;
            if (bzVar == null || !bzVar.z()) {
                if (i10 > 0 && (nyVar = this.P) != null && nyVar.getVisibility() == 0 && (K = nyVar.K(0)) != null) {
                    int top = K.f47782a.getTop();
                    if (this.f24733d0) {
                        i11 = this.f24727b1;
                    } else {
                        i11 = 0;
                    }
                    if (top + i11 >= nyVar.getPaddingTop()) {
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
                fyVar.setTranslationY(Math.max(-AndroidUtilities.dp(36.0f), iArr[1]));
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
        NotificationCenter.ObserversGroup add = NotificationCenter.getInstance(this.f24731c1).createWeakObserversGroup(this).addGlobal(NotificationCenter.emojiLoaded).add(NotificationCenter.newEmojiSuggestionsAvailable).add(NotificationCenter.groupPackUpdated);
        this.I2 = add;
        if (this.f24802y0 != null) {
            add.add(NotificationCenter.stickersDidLoad).add(NotificationCenter.recentDocumentsDidLoad).add(NotificationCenter.featuredStickersDidLoad).add(NotificationCenter.groupStickersDidLoad).add(NotificationCenter.currentUserPremiumStatusChanged);
            AndroidUtilities.runOnUIThread(new uw(this, 0));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ov ovVar = this.B1;
        if (ovVar != null && ovVar.isShowing()) {
            ovVar.dismiss();
        }
        org.telegram.ui.qt q6 = org.telegram.ui.qt.q();
        if (q6.f41278l == this.f24746g2) {
            q6.W = null;
            q6.f41265a0 = null;
            q6.Y = null;
            q6.f41278l = null;
            q6.f41269c0 = null;
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
        boolean z11 = this.f24733d0;
        if (!z10 && !this.N1) {
            if (this.L1 != 0) {
                if (!this.H2) {
                    setOutlineProvider(null);
                    setClipToOutline(false);
                    setElevation(0.0f);
                }
                if (this.f24787u0) {
                    int i12 = org.telegram.ui.ActionBar.h6.He;
                    setBackgroundColor(B(i12));
                    if (z11) {
                        view.setBackgroundColor(B(i12));
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
            background.setColorFilter(new PorterDuffColorFilter(B(i13), PorterDuff.Mode.MULTIPLY));
            if (z11 && this.f24787u0) {
                view.setBackgroundColor(B(i13));
            }
            this.L1 = 1;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
        this.K1 = false;
        setTranslationY(getTranslationY());
    }

    public final void p() {
        int L0;
        nx nxVar = this.B0;
        if (nxVar != null && (L0 = this.E0.L0()) != -1) {
            int i10 = this.G1;
            if (i10 <= 0 && (i10 = this.F1) <= 0) {
                i10 = this.E1;
            }
            nxVar.k(this.f24802y0.F(L0), i10);
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
                this.B0.k(this.f24802y0.F(L02), i12);
            }
        } else if (i10 == 2) {
            s4.i0 adapter = this.f24747h0.getAdapter();
            fz fzVar = this.f24764n0;
            if (adapter == fzVar && fzVar.I >= 0 && this.f24781s0 >= 0 && this.f24777r0 >= 0 && (L0 = this.f24750i0.L0()) != -1) {
                if (L0 >= fzVar.I) {
                    i11 = this.f24781s0;
                } else {
                    i11 = this.f24777r0;
                }
                this.f24770p0.k(i11, 0);
            }
        }
    }

    public final void r(boolean z10) {
        int i10;
        bz bzVar = this.f24785t1;
        me.b bVar = this.f24722a;
        jx jxVar = this.D0;
        boolean z11 = false;
        mx mxVar = this.G0;
        if (bzVar != null && bzVar.z()) {
            s4.d1 K = jxVar.K(0);
            if (K == null) {
                nz.a(mxVar, true, !z10);
            } else {
                if (K.f47782a.getTop() < jxVar.getPaddingTop()) {
                    z11 = true;
                }
                nz.a(mxVar, z11, !z10);
            }
            mxVar.setTranslationY(bVar.f16401e * AndroidUtilities.dp(15.0f));
        } else if (mxVar != null && jxVar != null) {
            s4.d1 K2 = jxVar.K(0);
            if (K2 != null) {
                i10 = K2.f47782a.getTop();
            } else {
                i10 = -this.f24727b1;
            }
            mxVar.setTranslationY((bVar.f16401e * AndroidUtilities.dp(15.0f)) + i10);
            mxVar.f29311a.a(false, !z10);
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
        org.telegram.ui.ActionBar.d6 d6Var = this.Z1;
        View view = this.f24797x;
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
        View view3 = this.f24793w;
        if (view3 != null) {
            ch.d c12 = cVar.c(view3, null, false);
            c12.o(eh.b.d(d6Var));
            c12.q(AndroidUtilities.dp(18.0f));
            c12.p(AndroidUtilities.dp(6.0f));
            view3.setBackground(c12);
        }
        View view4 = this.f24801y;
        if (view4 != null) {
            ch.d c13 = cVar.c(view4, null, false);
            c13.o(eh.b.d(d6Var));
            c13.q(AndroidUtilities.dp(18.0f));
            c13.p(AndroidUtilities.dp(6.0f));
            view4.setBackground(c13);
        }
    }

    public void setBottomInset(int i10) {
        if (this.f24772p2 != i10) {
            this.f24772p2 = i10;
            j(i10, this.K);
            j(i10, this.M);
            j(AndroidUtilities.dp(44.0f) + i10, this.P);
            j(AndroidUtilities.dp(44.0f) + i10, this.D0);
            j(AndroidUtilities.dp(44.0f) + i10, this.f24747h0);
            FrameLayout frameLayout = this.f24780s;
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

    public void setDelegate(bz bzVar) {
        this.f24785t1 = bzVar;
    }

    public void setDragListener(hy hyVar) {
        this.O0 = hyVar;
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        mx mxVar = this.G0;
        if (mxVar != null) {
            mxVar.d.setEnabled(z10);
        }
        gx gxVar = this.f24767o0;
        if (gxVar != null) {
            gxVar.d.setEnabled(z10);
        }
        ax axVar = this.V;
        if (axVar != null) {
            axVar.d.setEnabled(z10);
        }
    }

    public void setForseMultiwindowLayout(boolean z10) {
        this.N1 = z10;
    }

    public void setShouldDrawBackground(boolean z10) {
        if (this.f24787u0 != z10) {
            this.f24787u0 = z10;
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
                int i11 = this.f24731c1;
                NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.stickersDidLoad);
                if (this.f24802y0 != null) {
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
        nz nzVar;
        s4.d0 d0Var;
        View view;
        rm0 rm0Var;
        int i10;
        int i11;
        TLRPC.TL_messages_stickerSet stickerSetById;
        rz rzVar;
        int E;
        AnimatorSet animatorSet = this.M0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.M0 = null;
        }
        int currentItem = this.h.getCurrentItem();
        int i12 = 2;
        if (currentItem == 2 && j3 != -1 && (stickerSetById = MediaDataController.getInstance(this.f24731c1).getStickerSetById(j3)) != null && (E = (rzVar = this.f24802y0).E(stickerSetById)) >= 0 && E < rzVar.h()) {
            H(E, AndroidUtilities.dp(48.0f));
        }
        int i13 = 0;
        fz fzVar = this.f24753j0;
        if (fzVar != null) {
            fzVar.K = false;
        }
        int i14 = 0;
        while (i14 < 3) {
            rm0 rm0Var2 = this.D0;
            rm0 rm0Var3 = this.f24747h0;
            gx gxVar = this.f24767o0;
            rm0 rm0Var4 = this.P;
            if (i14 == 0) {
                nzVar = this.V;
                d0Var = this.Q;
                view = this.I;
                rm0Var = rm0Var4;
            } else if (i14 == 1) {
                d0Var = this.f24750i0;
                view = this.f24770p0;
                rm0Var = rm0Var3;
                nzVar = gxVar;
            } else {
                nzVar = this.G0;
                d0Var = this.E0;
                view = this.B0;
                rm0Var = rm0Var2;
            }
            if (nzVar == null) {
                i11 = i13;
                i10 = i12;
            } else {
                int i15 = i13;
                mz mzVar = nzVar.f29317r;
                int i16 = i12;
                nzVar.d.setText("");
                if (mzVar != null) {
                    mzVar.G1(null);
                    mzVar.E1();
                }
                int i17 = this.f24727b1;
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
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(rm0Var, property, fArr2);
                        float[] fArr3 = new float[1];
                        fArr3[i15] = AndroidUtilities.dp(36.0f);
                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(nzVar, property, fArr3);
                        Animator[] animatorArr = new Animator[3];
                        animatorArr[i15] = ofFloat;
                        animatorArr[1] = ofFloat2;
                        animatorArr[i16] = ofFloat3;
                        animatorSet2.playTogether(animatorArr);
                    } else {
                        float[] fArr4 = new float[1];
                        fArr4[i15] = AndroidUtilities.dp(36.0f) - i17;
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(rm0Var, property, fArr4);
                        Animator[] animatorArr2 = new Animator[1];
                        animatorArr2[i15] = ofFloat4;
                        animatorSet2.playTogether(animatorArr2);
                    }
                    this.M0.setDuration(200L);
                    this.M0.setInterpolator(is.h);
                    this.M0.addListener(new ai.z4(this, d0Var, rm0Var, 5));
                    this.M0.start();
                    i11 = i15;
                    i10 = i16;
                } else {
                    if (nzVar != gxVar) {
                        nzVar.setTranslationY(AndroidUtilities.dp(36.0f) - i17);
                    }
                    i10 = i16;
                    if (view != null && i14 != i10) {
                        view.setTranslationY(0.0f);
                    }
                    if (rm0Var == rm0Var2) {
                        i11 = i15;
                        rm0Var.setPadding(i11, AndroidUtilities.dp(36.0f), i11, AndroidUtilities.dp(44.0f) + this.f24772p2);
                    } else {
                        i11 = i15;
                        if (rm0Var == rm0Var3) {
                            rm0Var.setPadding(i11, AndroidUtilities.dp(40.0f), i11, AndroidUtilities.dp(44.0f) + this.f24772p2);
                        } else {
                            if (rm0Var == rm0Var4) {
                                rm0Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f) + this.f24772p2);
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
            this.f24785t1.i(i18);
        }
    }

    public final void u(boolean z10) {
        t(-1L, z10);
    }

    public final void v(boolean z10) {
        rz rzVar;
        boolean z11 = this.N2;
        this.N2 = z10;
        if (z11 && !z10) {
            int i10 = this.A1;
            if (i10 == 0) {
                ky kyVar = this.R;
                if (kyVar != null) {
                    kyVar.F(false);
                }
            } else if (i10 == 1) {
                fz fzVar = this.f24764n0;
                if (fzVar != null) {
                    fzVar.l();
                }
            } else if (i10 == 2 && (rzVar = this.f24802y0) != null) {
                rzVar.l();
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
                    return this.f24750i0;
                }
                throw new IllegalArgumentException(hg.c.h(i10, "Unexpected argument: "));
            }
            return this.Q;
        }
        return this.E0;
    }

    public final rm0 y(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return this.f24747h0;
                }
                throw new IllegalArgumentException(hg.c.h(i10, "Unexpected argument: "));
            }
            return this.P;
        }
        return this.D0;
    }

    public final HorizontalScrollView z(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return this.f24770p0;
                }
                throw new IllegalArgumentException(hg.c.h(i10, "Unexpected argument: "));
            }
            return this.I;
        }
        return this.B0;
    }

    @Override
    public final void A(float f7, int i10) {
    }
}
