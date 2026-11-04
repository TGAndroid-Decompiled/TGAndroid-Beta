package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public class pc extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
    public TLRPC.EmojiStatus E;
    public TLRPC.WallPaper F;
    public TLRPC.WallPaper G;
    public TLRPC.WallPaper H;
    public Drawable I;
    public SpannableStringBuilder J;
    public boolean K;
    public org.telegram.ui.Components.ch0 L;
    public org.telegram.ui.ActionBar.q0 M;
    public org.telegram.ui.Components.tj0 N;
    public cc O;
    public FrameLayout P;
    public gi.d Q;
    public zb R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public final long f48510a;
    public int f48511a0;
    public int f48512b;
    public int f48513b0;
    public TL_stories.TL_premium_boostsStatus f48514c;
    public int f48515c0;
    public boolean d;
    public int f48516d0;
    public int f48517e;
    public int f48518e0;
    public int f48519f;
    public int f48520f0;
    public int f48521g0;
    public long h;
    public int f48522h0;
    public int f48523i0;
    public int f48524j0;
    public int f48525k0;
    public int f48526l0;
    public org.telegram.ui.ActionBar.d2 m0;
    public long f48527n;
    public ac f48528n0;
    public float f48529o0;
    public ValueAnimator f48530p0;
    public boolean f48531q0;
    public int f48532r;
    public org.telegram.ui.ActionBar.e6 f48533r0;
    public int f48534s;
    public final SparseIntArray f48535s0;
    public final org.telegram.ui.ActionBar.t4 f48536t0;
    public final org.telegram.ui.ActionBar.t4 f48537u0;
    public final org.telegram.ui.ActionBar.t4 f48538v0;
    public long f48539w;
    public final org.telegram.ui.ActionBar.t4 f48540w0;
    public long f48541x;
    public final Drawable f48542x0;
    public TLRPC.EmojiStatus f48543y;
    public final Drawable f48544y0;
    public final Paint f48545z0;

    public pc(long j10) {
        super(null);
        boolean q10 = org.telegram.ui.ActionBar.k6.I.q();
        this.K = q10;
        this.S = 0;
        this.f48531q0 = q10;
        this.f48535s0 = new SparseIntArray();
        Paint paint = new Paint(1);
        this.f48545z0 = paint;
        paint.setStrokeWidth(1.0f);
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27879d7, this.resourceProvider));
        this.f48542x0 = org.telegram.messenger.t0.f25457b.getDrawable(2131232091).mutate();
        this.f48544y0 = org.telegram.messenger.t0.f25457b.getDrawable(2131232177).mutate();
        this.f48510a = j10;
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-j10));
        if (M0 != null) {
            this.f48512b = M0.level;
        }
        org.telegram.messenger.hp.s1(this.currentAccount).G0().a(j10, new mi.f(10, this, M0));
        this.resourceProvider = new oc(this);
        this.f48536t0 = new org.telegram.ui.ActionBar.t4(0, false, false, this.resourceProvider);
        this.f48537u0 = new org.telegram.ui.ActionBar.t4(0, false, true, this.resourceProvider);
        this.f48538v0 = new org.telegram.ui.ActionBar.t4(0, true, false, this.resourceProvider);
        this.f48540w0 = new org.telegram.ui.ActionBar.t4(0, true, true, this.resourceProvider);
    }

    public static void Z(pc pcVar) {
        org.telegram.ui.ActionBar.e6 e6Var = pcVar.resourceProvider;
        if (e6Var instanceof oc) {
            pc pcVar2 = ((oc) e6Var).f48256a;
            pcVar2.K = !pcVar2.K;
            pcVar2.k1();
            pcVar2.g1(false);
        } else {
            pcVar.K = !pcVar.K;
            pcVar.k1();
        }
        pcVar.b1(pcVar.K, true);
        pcVar.g1(false);
        org.telegram.ui.ActionBar.k6.Am++;
    }

    public static void a0(org.telegram.ui.pc r13, org.telegram.messenger.e3 r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pc.a0(org.telegram.ui.pc, org.telegram.messenger.e3):void");
    }

    public static void b0(org.telegram.ui.pc r22, org.telegram.tgnet.TLRPC.ChatFull r23, android.view.View r24, int r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pc.b0(org.telegram.ui.pc, org.telegram.tgnet.TLRPC$ChatFull, android.view.View, int):void");
    }

    public static void f1(View view) {
        if (view instanceof dc) {
            ((dc) view).updateColors();
        } else if (view instanceof org.telegram.ui.Cells.l8) {
            ((org.telegram.ui.Cells.l8) view).updateColors();
        } else if (view instanceof gc) {
            ((gc) view).updateColors();
        } else if (view instanceof nc) {
            ((nc) view).updateColors();
        }
    }

    public final void B0() {
        int themedColor;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar == null) {
            return;
        }
        int i3 = -1;
        if (this.d && this.f48534s != -1) {
            themedColor = -1;
        } else {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.A8);
        }
        kVar.setTitleColor(themedColor);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        if (!this.d || this.f48534s == -1) {
            i3 = getThemedColor(org.telegram.ui.ActionBar.k6.f28216v8);
        }
        kVar2.D(i3, false);
    }

    public void C0() {
        B0();
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.f28160s8));
        }
        org.telegram.ui.Components.tj0 tj0Var = this.N;
        if (tj0Var != null && this.d) {
            tj0Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.f27824a7));
        }
        FrameLayout frameLayout = this.P;
        if (frameLayout != null) {
            frameLayout.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.f27824a7));
        }
    }

    public final void D0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pc.D0():void");
    }

    public void E0() {
        org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(getParentActivity(), this.resourceProvider);
        this.N = tj0Var;
        tj0Var.setSections(false);
    }

    public final View F0(int i3) {
        for (int i10 = 0; i10 < this.N.getChildCount(); i10++) {
            View childAt = this.N.getChildAt(i10);
            this.N.getClass();
            if (RecyclerView.R(childAt) == i3) {
                return childAt;
            }
        }
        return null;
    }

    public int G0() {
        return getMessagesController().f23136u5;
    }

    public int H0() {
        return 0;
    }

    public int I0() {
        return 0;
    }

    public final TLRPC.Document J0(TLRPC.StickerSet stickerSet) {
        if (stickerSet != null && stickerSet.thumb_document_id == 0) {
            TLRPC.TL_messages_stickerSet Y = getMediaDataController().Y(stickerSet);
            if (!Y.documents.isEmpty()) {
                return Y.documents.get(0);
            }
        }
        return null;
    }

    public final long K0(TLRPC.StickerSet stickerSet) {
        if (stickerSet == null) {
            return 0L;
        }
        long j10 = stickerSet.thumb_document_id;
        if (j10 == 0) {
            TLRPC.TL_messages_stickerSet Y = getMediaDataController().Y(stickerSet);
            if (!Y.documents.isEmpty()) {
                return Y.documents.get(0).f27007id;
            }
        }
        return j10;
    }

    public int L0() {
        return 2131752412;
    }

    public int M0() {
        return getMessagesController().f23119s5;
    }

    public int N0() {
        return 2131752413;
    }

    public int O0() {
        return 0;
    }

    public int P0() {
        return 3;
    }

    public int Q0() {
        return getMessagesController().r5;
    }

    public int R0() {
        return 2131752320;
    }

    public int S0() {
        return 0;
    }

    public int T0() {
        return 0;
    }

    public int U0() {
        return 2131752263;
    }

    public int V0() {
        return getMessagesController().f23127t5;
    }

    public int W0() {
        return 2131752264;
    }

    public final boolean X0() {
        if (this.f48517e == this.f48519f && this.h == this.f48527n && this.f48532r == this.f48534s && this.f48539w == this.f48541x && org.telegram.messenger.m5.a(this.f48543y, this.E) && org.telegram.messenger.d4.v(this.F, this.G)) {
            return false;
        }
        return true;
    }

    public boolean Y0() {
        return false;
    }

    public final int Z0() {
        org.telegram.messenger.wo d;
        org.telegram.messenger.wo woVar = null;
        int i3 = 0;
        if (this.f48517e != this.f48519f) {
            org.telegram.messenger.xo xoVar = getMessagesController().f23099q4;
            if (xoVar == null) {
                d = null;
            } else {
                d = xoVar.d(this.f48519f);
            }
            if (d != null) {
                i3 = Math.max(0, d.l(this.d));
            }
        }
        if (this.h != this.f48527n) {
            i3 = Math.max(i3, getMessagesController().f23100q5);
        }
        if (this.f48532r != this.f48534s) {
            org.telegram.messenger.xo xoVar2 = getMessagesController().f23109r4;
            if (xoVar2 != null) {
                woVar = xoVar2.d(this.f48534s);
            }
            if (woVar != null) {
                i3 = Math.max(i3, woVar.l(this.d));
            }
        }
        if (this.f48539w != this.f48541x) {
            i3 = Math.max(i3, Q0());
        }
        if (!org.telegram.messenger.m5.a(this.f48543y, this.E)) {
            i3 = Math.max(i3, M0());
        }
        if (!org.telegram.messenger.d4.v(this.F, this.G)) {
            return Math.max(i3, V0());
        }
        return i3;
    }

    public final void b1(boolean z10, boolean z11) {
        int i3;
        if (this.f48531q0 != z10) {
            this.f48531q0 = z10;
            int i10 = 0;
            if (z11) {
                org.telegram.ui.Components.ch0 ch0Var = this.L;
                if (z10) {
                    i10 = ch0Var.f32725e[0];
                }
                ch0Var.P(i10);
                org.telegram.ui.Components.ch0 ch0Var2 = this.L;
                if (ch0Var2 != null) {
                    ch0Var2.start();
                    return;
                }
                return;
            }
            if (z10) {
                i3 = this.L.f32725e[0] - 1;
            } else {
                i3 = 0;
            }
            this.L.N(i3, false, true);
            this.L.P(i3);
            org.telegram.ui.ActionBar.q0 q0Var = this.M;
            if (q0Var != null) {
                q0Var.invalidate();
            }
        }
    }

    public final void c1() {
        if (getVisibleDialog() != null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
        String M0 = org.telegram.messenger.bd.M0(2131752426, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.S = M0;
        s1Var.U = org.telegram.messenger.bd.M0(2131752425, null);
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131751370, null), new org.telegram.ui.ActionBar.p1(this) {
            public final pc f50767b;

            {
                this.f50767b = this;
            }

            @Override
            public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i3) {
                switch (r2) {
                    case 0:
                        this.f50767b.finishFragment();
                        return;
                    default:
                        this.f50767b.D0();
                        return;
                }
            }
        });
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131754216, null), new org.telegram.ui.ActionBar.p1(this) {
            public final pc f50767b;

            {
                this.f50767b = this;
            }

            @Override
            public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i3) {
                switch (r2) {
                    case 0:
                        this.f50767b.finishFragment();
                        return;
                    default:
                        this.f50767b.D0();
                        return;
                }
            }
        });
        showDialog(s1Var);
        org.telegram.ui.ActionBar.r6.V((TextView) s1Var.d(-2), org.telegram.ui.ActionBar.k6.f28122q7, getResourceProvider());
    }

    @Override
    public View createView(Context context) {
        org.telegram.ui.ActionBar.q0 d;
        float f10;
        org.telegram.messenger.hp messagesController = getMessagesController();
        long j10 = -this.f48510a;
        TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j10));
        if (M0 != null) {
            int F = org.telegram.messenger.t3.F(M0);
            this.f48519f = F;
            this.f48517e = F;
            long G = org.telegram.messenger.t3.G(M0);
            this.f48527n = G;
            this.h = G;
            int I = org.telegram.messenger.t3.I(M0);
            this.f48534s = I;
            this.f48532r = I;
            long J = org.telegram.messenger.t3.J(M0);
            this.f48541x = J;
            this.f48539w = J;
            TLRPC.EmojiStatus emojiStatus = M0.emoji_status;
            this.E = emojiStatus;
            this.f48543y = emojiStatus;
        }
        TLRPC.ChatFull N0 = getMessagesController().N0(j10);
        if (N0 != null) {
            TLRPC.WallPaper wallPaper = N0.wallpaper;
            this.G = wallPaper;
            this.F = wallPaper;
            String j11 = org.telegram.messenger.d4.j(wallPaper);
            if (j11 != null && j11.length() == 0) {
                this.H = this.F;
            }
        }
        o9 o9Var = new o9(this, 4);
        org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
        if (y4Var != null) {
            y4Var.setBackButtonImage(2131231240);
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131752427, null));
            this.simpleActionBar.setActionBarMenuOnItemClick(o9Var);
        } else {
            this.actionBar.setBackButtonImage(2131231240);
            this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131752427, null));
            this.actionBar.setActionBarMenuOnItemClick(o9Var);
        }
        org.telegram.ui.Components.ch0 ch0Var = new org.telegram.ui.Components.ch0(2131624240, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
        this.L = ch0Var;
        ch0Var.h = true;
        if (!this.K) {
            ch0Var.P(0);
            this.L.M(0);
        } else {
            ch0Var.M(35);
            this.L.P(36);
        }
        this.L.f32719a0 = true;
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.J9, this.resourceProvider);
        this.L.Q(w02, "Sunny");
        this.L.Q(w02, "Path 6");
        this.L.Q(w02, "Path");
        this.L.Q(w02, "Path 5");
        org.telegram.ui.ActionBar.y4 y4Var2 = this.simpleActionBar;
        if (y4Var2 != null) {
            org.telegram.ui.ActionBar.e5 o10 = y4Var2.o();
            org.telegram.ui.Components.ch0 ch0Var2 = this.L;
            o10.getClass();
            d = o10.c(1, 0, null, ch0Var2, org.telegram.messenger.g0.L(48.0f), null);
        } else {
            d = this.actionBar.q().d(1, this.L);
        }
        this.M = d;
        FrameLayout frameLayout = new FrameLayout(context);
        j1();
        E0();
        if (!this.d) {
            setHasOwnBackground(true);
            this.N.setSectionsDrawBackground(true);
        } else {
            this.N.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.f27824a7));
        }
        org.telegram.ui.Components.tj0 tj0Var = this.N;
        cc ccVar = new cc(this);
        this.O = ccVar;
        tj0Var.setAdapter(ccVar);
        new u4.s(3);
        this.N.setLayoutManager(new u4.b0());
        org.telegram.ui.Components.tj0 tj0Var2 = this.N;
        if (this.d) {
            f10 = 68.0f;
        } else {
            f10 = 0.0f;
        }
        frameLayout.addView(tj0Var2, b8.mf.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, f10));
        this.N.setOnItemClickListener(new ei.q4(4, this, N0));
        u4.k kVar = new u4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.xq.h);
        kVar.C = false;
        kVar.f55567m = false;
        this.N.setItemAnimator(kVar);
        gi.d dVar = new gi.d(context, this.resourceProvider, true);
        dVar.setRoundRadius(24);
        this.Q = dVar;
        dVar.i(org.telegram.messenger.bd.M0(2131754218, null), false, true);
        this.Q.setOnClickListener(new a(this, 11));
        e1(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.P = frameLayout2;
        if (this.d) {
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27824a7, frameLayout2, getResourceProvider());
        } else {
            frameLayout2.setBackground(getBaseSimpleGlass().b(this.P));
        }
        this.P.addView(this.Q, b8.mf.d(-1, 48.0f, 80, 10.0f, 10.0f, 10.0f, 10.0f));
        frameLayout.addView(this.P, b8.mf.e(-1, 68, 80));
        setBulletinDelegate(new x8(this, 1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d1(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        if (tL_premium_boostsStatus != null) {
            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-this.f48510a));
            this.f48514c = tL_premium_boostsStatus;
            int i3 = tL_premium_boostsStatus.level;
            this.f48512b = i3;
            if (M0 != null) {
                M0.level = i3;
            }
            cc ccVar = this.O;
            if (ccVar != null) {
                ccVar.f();
            }
            e1(true);
        }
    }

    public void didReceivedNotification(int i3, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.hs.f23283p3;
        long j10 = this.f48510a;
        if (i3 == i11) {
            if (j10 == ((Long) objArr[2]).longValue()) {
                d1((TL_stories.TL_premium_boostsStatus) objArr[0]);
            }
        } else if (i3 == org.telegram.messenger.hs.V2) {
            if (!((Boolean) objArr[1]).booleanValue()) {
                getMessagesController().G0().a(j10, new ub(this, 2));
            }
        } else if (i3 == org.telegram.messenger.hs.f23341y1 && j10 == ((Long) objArr[0]).longValue()) {
            org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
            if (q4Var != null && q4Var.getLastFragment() == this) {
                finishFragment();
            } else {
                removeSelfFromStack();
            }
        }
    }

    public void e1(boolean z10) {
        if (this.Q != null && this.f48514c != null) {
            int Z0 = Z0();
            if (this.f48512b >= Z0) {
                this.Q.g(null, z10);
                return;
            }
            if (this.J == null) {
                this.J = new SpannableStringBuilder("l");
                org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(2131231976, 0);
                wpVar.f40044n = 1;
                this.J.setSpan(wpVar, 0, 1, 33);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.J).append((CharSequence) org.telegram.messenger.bd.G(Z0, "BoostLevelRequired", new Object[0]));
            this.Q.g(spannableStringBuilder, z10);
        }
    }

    public void g1(boolean z10) {
        int themedColor;
        org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
        if (y4Var != null) {
            y4Var.updateColors();
        } else {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            int i3 = -1;
            if (this.d && this.f48534s != -1) {
                themedColor = -1;
            } else {
                themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.A8);
            }
            kVar.setTitleColor(themedColor);
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            if (!this.d || this.f48534s == -1) {
                i3 = getThemedColor(org.telegram.ui.ActionBar.k6.f28216v8);
            }
            kVar2.D(i3, false);
            this.actionBar.C(getThemedColor(org.telegram.ui.ActionBar.k6.f28179t8), false);
        }
        if (!z10) {
            this.O.f();
            org.telegram.messenger.g0.d0(this.N, new ei.e(this));
            if (this.d) {
                this.P.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.f27824a7));
            }
            this.Q.updateColors();
            setNavigationBarColor(getNavigationBarColor());
        }
    }

    @Override
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        if (!this.d) {
            return this.N;
        }
        return null;
    }

    public final void h1(boolean z10) {
        org.telegram.messenger.zi messageObject;
        View F0 = F0(this.T);
        View F02 = F0(this.U);
        View F03 = F0(this.V);
        View F04 = F0(this.X);
        if (F0 instanceof org.telegram.ui.Cells.z9) {
            org.telegram.ui.Cells.z9 z9Var = (org.telegram.ui.Cells.z9) F0;
            org.telegram.ui.Cells.q1[] cells = z9Var.getCells();
            for (int i3 = 0; i3 < cells.length; i3++) {
                org.telegram.ui.Cells.q1 q1Var = cells[i3];
                if (q1Var != null && (messageObject = q1Var.getMessageObject()) != null) {
                    messageObject.f26834c1 = this.f48519f;
                    messageObject.f26837d1 = this.f48527n;
                    cells[i3].setAvatar(messageObject);
                    cells[i3].invalidate();
                }
            }
            Drawable f10 = gi.y5.f(this.I, this.currentAccount, this.G, this.K);
            this.I = f10;
            z9Var.setOverrideBackground(f10);
        }
        if (F02 instanceof zl0) {
            ((zl0) F02).a(this.f48519f, z10);
        } else if (F02 instanceof gc) {
            ((gc) F02).a(this.f48519f, z10);
        }
        if (F03 instanceof dc) {
            dc dcVar = (dc) F03;
            dcVar.a(this.currentAccount, this.f48519f, true);
            dcVar.c(this.f48527n, false, z10);
        }
        if (F04 instanceof nc) {
            nc ncVar = (nc) F04;
            String j10 = org.telegram.messenger.d4.j(this.G);
            if (j10 == null && this.G == null && this.H != null) {
                j10 = "❌";
            }
            ncVar.a(j10, z10);
            ncVar.setGalleryWallpaper(this.H);
        }
    }

    public final void i1() {
        TLRPC.StickerSet stickerSet;
        TLRPC.StickerSet stickerSet2;
        View F0 = F0(this.f48511a0);
        View F02 = F0(this.f48515c0);
        View F03 = F0(this.f48516d0);
        View F04 = F0(this.f48521g0);
        View F05 = F0(this.f48523i0);
        View F06 = F0(this.f48525k0);
        if (F0 instanceof ic) {
            TLRPC.EmojiStatus emojiStatus = this.E;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                ic icVar = (ic) F0;
                hc hcVar = icVar.f46234b;
                org.telegram.messenger.wo a10 = org.telegram.messenger.wo.a(emojiStatus);
                hcVar.c(a10, true);
                icVar.f46233a.c(a10, true);
                hcVar.d(((TLRPC.TL_emojiStatusCollectible) this.E).pattern_document_id, true, true);
            } else {
                ic icVar2 = (ic) F0;
                hc hcVar2 = icVar2.f46234b;
                int i3 = this.f48534s;
                hcVar2.b(i3, true);
                icVar2.f46233a.b(icVar2.h.currentAccount, i3, true);
                hcVar2.d(this.f48541x, false, true);
            }
            ic icVar3 = (ic) F0;
            hc hcVar3 = icVar3.f46234b;
            hcVar3.e(org.telegram.messenger.m5.f(this.E), false, true);
            hcVar3.a(this.f48519f);
            icVar3.updateColors();
        }
        if (F02 instanceof zl0) {
            ((zl0) F02).a(this.f48534s, true);
        } else if (F02 instanceof gc) {
            ((gc) F02).a(this.f48519f, true);
        }
        if (F03 instanceof dc) {
            dc dcVar = (dc) F03;
            dcVar.a(this.currentAccount, this.f48534s, false);
            dcVar.c(this.f48541x, false, true);
        }
        if (F04 instanceof dc) {
            TLRPC.EmojiStatus emojiStatus2 = this.E;
            if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                ((dc) F04).b(org.telegram.messenger.wo.a(emojiStatus2));
            } else {
                ((dc) F04).a(this.currentAccount, this.f48534s, false);
            }
            ((dc) F04).c(org.telegram.messenger.m5.f(this.E), org.telegram.messenger.m5.B(this.E), true);
        }
        boolean z10 = F05 instanceof dc;
        long j10 = this.f48510a;
        if (z10) {
            dc dcVar2 = (dc) F05;
            dcVar2.a(this.currentAccount, this.f48534s, false);
            TLRPC.ChatFull N0 = getMessagesController().N0(-j10);
            if (N0 != null && (stickerSet2 = N0.emojiset) != null) {
                dcVar2.c(K0(stickerSet2), false, false);
            } else {
                dcVar2.c(0L, false, false);
            }
        }
        if (F06 instanceof dc) {
            TLRPC.ChatFull N02 = getMessagesController().N0(-j10);
            if (N02 != null && (stickerSet = N02.stickerset) != null) {
                ((dc) F06).d(J0(stickerSet));
            } else {
                ((dc) F06).c(0L, false, false);
            }
        }
        j1();
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return !this.d;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (X0() && this.f48512b >= Z0()) {
            return false;
        }
        return true;
    }

    public void j1() {
        cc ccVar;
        cc ccVar2;
        boolean z10 = false;
        this.T = 0;
        int i3 = 1 + 1;
        this.U = 1;
        this.V = i3;
        this.W = i3 + 1;
        this.X = i3 + 2;
        this.Y = i3 + 3;
        this.Z = i3 + 4;
        this.f48511a0 = i3 + 5;
        this.f48515c0 = i3 + 6;
        int i10 = i3 + 8;
        this.S = i10;
        this.f48516d0 = i3 + 7;
        if (this.f48541x == 0 && this.f48534s < 0 && !(this.E instanceof TLRPC.TL_emojiStatusCollectible)) {
            int i11 = this.f48520f0;
            this.f48520f0 = -1;
            if (i11 >= 0 && (ccVar2 = this.O) != null) {
                ccVar2.s(i11);
                this.O.g(this.f48516d0);
            }
        } else {
            if (this.f48520f0 >= 0) {
                z10 = true;
            }
            this.S = i3 + 9;
            this.f48520f0 = i10;
            if (!z10 && (ccVar = this.O) != null) {
                ccVar.i(i10);
                this.O.g(this.f48516d0);
            }
        }
        int i12 = this.S;
        this.f48518e0 = i12;
        this.f48521g0 = i12 + 1;
        this.S = i12 + 3;
        this.f48522h0 = i12 + 2;
    }

    public final void k1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pc.k1():void");
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.f48512b >= Z0() && X0()) {
            if (z10) {
                c1();
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public boolean onFragmentCreate() {
        getMediaDataController().Y0();
        getNotificationCenter().c(this, org.telegram.messenger.hs.V2);
        getNotificationCenter().c(this, org.telegram.messenger.hs.f23283p3);
        getNotificationCenter().c(this, org.telegram.messenger.hs.f23341y1);
        return super.onFragmentCreate();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.hs.V2);
        getNotificationCenter().n(this, org.telegram.messenger.hs.f23283p3);
        getNotificationCenter().n(this, org.telegram.messenger.hs.f23341y1);
    }

    @Override
    public final void onInsets(int i3, int i10, int i11, int i12) {
        if (!this.d && this.P != null) {
            int L = org.telegram.messenger.g0.L(68.0f) + i12;
            ViewGroup.LayoutParams layoutParams = this.P.getLayoutParams();
            if (layoutParams.height != L) {
                layoutParams.height = L;
                this.P.setLayoutParams(layoutParams);
            }
            if (this.P.getPaddingLeft() != i3 || this.P.getPaddingRight() != i11 || this.P.getPaddingBottom() != i12) {
                this.P.setPadding(i3, 0, i11, i12);
            }
            pi.a.e(this.N, i10, i12, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), org.telegram.messenger.g0.L(68.0f));
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            C0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        i0.b bVar = this.mSystemInsets;
        onInsets(bVar.f14495a, bVar.f14496b, bVar.f14497c, bVar.d);
    }

    @Override
    public final void setResourceProvider(org.telegram.ui.ActionBar.e6 e6Var) {
        this.f48533r0 = e6Var;
    }

    @Override
    public final boolean useSimpleActionBar() {
        return !this.d;
    }

    public void a1(int i3) {
    }
}
