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
public class qc extends org.telegram.ui.ActionBar.e2 implements org.telegram.messenger.is {
    public TLRPC.EmojiStatus E;
    public TLRPC.WallPaper F;
    public TLRPC.WallPaper G;
    public TLRPC.WallPaper H;
    public Drawable I;
    public SpannableStringBuilder J;
    public boolean K;
    public org.telegram.ui.Components.ch0 L;
    public org.telegram.ui.ActionBar.q0 M;
    public org.telegram.ui.Components.uj0 N;
    public dc O;
    public FrameLayout P;
    public hi.d Q;
    public ac R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public final long f50543a;
    public int f50544a0;
    public int f50545b;
    public int f50546b0;
    public TL_stories.TL_premium_boostsStatus f50547c;
    public int f50548c0;
    public boolean d;
    public int f50549d0;
    public int f50550e;
    public int f50551e0;
    public int f50552f;
    public int f50553f0;
    public int f50554g0;
    public long h;
    public int f50555h0;
    public int f50556i0;
    public int f50557j0;
    public int f50558k0;
    public int f50559l0;
    public org.telegram.ui.ActionBar.e2 m0;
    public long f50560n;
    public bc f50561n0;
    public float f50562o0;
    public ValueAnimator f50563p0;
    public boolean f50564q0;
    public int f50565r;
    public org.telegram.ui.ActionBar.e6 f50566r0;
    public int f50567s;
    public final SparseIntArray f50568s0;
    public final org.telegram.ui.ActionBar.r4 f50569t0;
    public final org.telegram.ui.ActionBar.r4 f50570u0;
    public final org.telegram.ui.ActionBar.r4 f50571v0;
    public long f50572w;
    public final org.telegram.ui.ActionBar.r4 f50573w0;
    public long f50574x;
    public final Drawable f50575x0;
    public TLRPC.EmojiStatus f50576y;
    public final Drawable f50577y0;
    public final Paint f50578z0;

    public qc(long j3) {
        super(null);
        boolean q10 = org.telegram.ui.ActionBar.j6.I.q();
        this.K = q10;
        this.S = 0;
        this.f50564q0 = q10;
        this.f50568s0 = new SparseIntArray();
        Paint paint = new Paint(1);
        this.f50578z0 = paint;
        paint.setStrokeWidth(1.0f);
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28850d7, this.resourceProvider));
        this.f50575x0 = org.telegram.messenger.t0.f26609b.getDrawable(2131232092).mutate();
        this.f50577y0 = org.telegram.messenger.t0.f26609b.getDrawable(2131232178).mutate();
        this.f50543a = j3;
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-j3));
        if (M0 != null) {
            this.f50545b = M0.level;
        }
        org.telegram.messenger.np.s1(this.currentAccount).G0().a(j3, new li.v(11, this, M0));
        this.resourceProvider = new pc(this);
        this.f50569t0 = new org.telegram.ui.ActionBar.r4(0, false, false, this.resourceProvider);
        this.f50570u0 = new org.telegram.ui.ActionBar.r4(0, false, true, this.resourceProvider);
        this.f50571v0 = new org.telegram.ui.ActionBar.r4(0, true, false, this.resourceProvider);
        this.f50573w0 = new org.telegram.ui.ActionBar.r4(0, true, true, this.resourceProvider);
    }

    public static void Z(qc qcVar) {
        org.telegram.ui.ActionBar.e6 e6Var = qcVar.resourceProvider;
        if (e6Var instanceof pc) {
            qc qcVar2 = ((pc) e6Var).f50217a;
            qcVar2.K = !qcVar2.K;
            qcVar2.k1();
            qcVar2.g1(false);
        } else {
            qcVar.K = !qcVar.K;
            qcVar.k1();
        }
        qcVar.b1(qcVar.K, true);
        qcVar.g1(false);
        org.telegram.ui.ActionBar.j6.Dm++;
    }

    public static void a0(org.telegram.ui.qc r13, org.telegram.messenger.e3 r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qc.a0(org.telegram.ui.qc, org.telegram.messenger.e3):void");
    }

    public static void b0(org.telegram.ui.qc r22, org.telegram.tgnet.TLRPC.ChatFull r23, android.view.View r24, int r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qc.b0(org.telegram.ui.qc, org.telegram.tgnet.TLRPC$ChatFull, android.view.View, int):void");
    }

    public static void f1(View view) {
        if (view instanceof ec) {
            ((ec) view).updateColors();
        } else if (view instanceof org.telegram.ui.Cells.l8) {
            ((org.telegram.ui.Cells.l8) view).updateColors();
        } else if (view instanceof hc) {
            ((hc) view).updateColors();
        } else if (view instanceof oc) {
            ((oc) view).updateColors();
        }
    }

    public final void B0() {
        int themedColor;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar == null) {
            return;
        }
        int i7 = -1;
        if (this.d && this.f50567s != -1) {
            themedColor = -1;
        } else {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.A8);
        }
        kVar.setTitleColor(themedColor);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        if (!this.d || this.f50567s == -1) {
            i7 = getThemedColor(org.telegram.ui.ActionBar.j6.f29186v8);
        }
        kVar2.H(i7, false);
    }

    public void C0() {
        B0();
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.f29129s8));
        }
        org.telegram.ui.Components.uj0 uj0Var = this.N;
        if (uj0Var != null && this.d) {
            uj0Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.f28792a7));
        }
        FrameLayout frameLayout = this.P;
        if (frameLayout != null) {
            frameLayout.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.f28792a7));
        }
    }

    public final void D0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qc.D0():void");
    }

    public void E0() {
        org.telegram.ui.Components.uj0 uj0Var = new org.telegram.ui.Components.uj0(getParentActivity(), this.resourceProvider);
        this.N = uj0Var;
        uj0Var.setSections(false);
    }

    public final View F0(int i7) {
        for (int i10 = 0; i10 < this.N.getChildCount(); i10++) {
            View childAt = this.N.getChildAt(i10);
            this.N.getClass();
            if (RecyclerView.R(childAt) == i7) {
                return childAt;
            }
        }
        return null;
    }

    public int G0() {
        return getMessagesController().f25419v5;
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
        long j3 = stickerSet.thumb_document_id;
        if (j3 == 0) {
            TLRPC.TL_messages_stickerSet Y = getMediaDataController().Y(stickerSet);
            if (!Y.documents.isEmpty()) {
                return Y.documents.get(0).f28057id;
            }
        }
        return j3;
    }

    public int L0() {
        return 2131752412;
    }

    public int M0() {
        return getMessagesController().f25402t5;
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
        return getMessagesController().s5;
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
        return getMessagesController().f25410u5;
    }

    public int W0() {
        return 2131752264;
    }

    public final boolean X0() {
        if (this.f50550e == this.f50552f && this.h == this.f50560n && this.f50565r == this.f50567s && this.f50572w == this.f50574x && org.telegram.messenger.m5.a(this.f50576y, this.E) && org.telegram.messenger.d4.v(this.F, this.G)) {
            return false;
        }
        return true;
    }

    public boolean Y0() {
        return false;
    }

    public final int Z0() {
        org.telegram.messenger.cp d;
        org.telegram.messenger.cp cpVar = null;
        int i7 = 0;
        if (this.f50550e != this.f50552f) {
            org.telegram.messenger.dp dpVar = getMessagesController().f25383r4;
            if (dpVar == null) {
                d = null;
            } else {
                d = dpVar.d(this.f50552f);
            }
            if (d != null) {
                i7 = Math.max(0, d.l(this.d));
            }
        }
        if (this.h != this.f50560n) {
            i7 = Math.max(i7, getMessagesController().f25384r5);
        }
        if (this.f50565r != this.f50567s) {
            org.telegram.messenger.dp dpVar2 = getMessagesController().f25393s4;
            if (dpVar2 != null) {
                cpVar = dpVar2.d(this.f50567s);
            }
            if (cpVar != null) {
                i7 = Math.max(i7, cpVar.l(this.d));
            }
        }
        if (this.f50572w != this.f50574x) {
            i7 = Math.max(i7, Q0());
        }
        if (!org.telegram.messenger.m5.a(this.f50576y, this.E)) {
            i7 = Math.max(i7, M0());
        }
        if (!org.telegram.messenger.d4.v(this.F, this.G)) {
            return Math.max(i7, V0());
        }
        return i7;
    }

    public final void b1(boolean z10, boolean z11) {
        int i7;
        if (this.f50564q0 != z10) {
            this.f50564q0 = z10;
            int i10 = 0;
            if (z11) {
                org.telegram.ui.Components.ch0 ch0Var = this.L;
                if (z10) {
                    i10 = ch0Var.f33579e[0];
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
                i7 = this.L.f33579e[0] - 1;
            } else {
                i7 = 0;
            }
            this.L.N(i7, false, true);
            this.L.P(i7);
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
        String M0 = org.telegram.messenger.hd.M0(2131752426, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
        t1Var.S = M0;
        t1Var.U = org.telegram.messenger.hd.M0(2131752425, null);
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131751369, null), new org.telegram.ui.ActionBar.q1(this) {
            public final qc f53161b;

            {
                this.f53161b = this;
            }

            @Override
            public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i7) {
                switch (r2) {
                    case 0:
                        this.f53161b.finishFragment();
                        return;
                    default:
                        this.f53161b.D0();
                        return;
                }
            }
        });
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131754216, null), new org.telegram.ui.ActionBar.q1(this) {
            public final qc f53161b;

            {
                this.f53161b = this;
            }

            @Override
            public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i7) {
                switch (r2) {
                    case 0:
                        this.f53161b.finishFragment();
                        return;
                    default:
                        this.f53161b.D0();
                        return;
                }
            }
        });
        showDialog(t1Var);
        org.telegram.ui.ActionBar.q6.U((TextView) t1Var.d(-2), org.telegram.ui.ActionBar.j6.f29090q7, getResourceProvider());
    }

    @Override
    public View createView(Context context) {
        org.telegram.ui.ActionBar.q0 d;
        float f10;
        org.telegram.messenger.np messagesController = getMessagesController();
        long j3 = -this.f50543a;
        TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j3));
        if (M0 != null) {
            int F = org.telegram.messenger.t3.F(M0);
            this.f50552f = F;
            this.f50550e = F;
            long G = org.telegram.messenger.t3.G(M0);
            this.f50560n = G;
            this.h = G;
            int I = org.telegram.messenger.t3.I(M0);
            this.f50567s = I;
            this.f50565r = I;
            long J = org.telegram.messenger.t3.J(M0);
            this.f50574x = J;
            this.f50572w = J;
            TLRPC.EmojiStatus emojiStatus = M0.emoji_status;
            this.E = emojiStatus;
            this.f50576y = emojiStatus;
        }
        TLRPC.ChatFull N0 = getMessagesController().N0(j3);
        if (N0 != null) {
            TLRPC.WallPaper wallPaper = N0.wallpaper;
            this.G = wallPaper;
            this.F = wallPaper;
            String j10 = org.telegram.messenger.d4.j(wallPaper);
            if (j10 != null && j10.length() == 0) {
                this.H = this.F;
            }
        }
        p9 p9Var = new p9(this, 4);
        org.telegram.ui.ActionBar.w4 w4Var = this.simpleActionBar;
        if (w4Var != null) {
            w4Var.setBackButtonImage(2131231240);
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131752427, null));
            this.simpleActionBar.setActionBarMenuOnItemClick(p9Var);
        } else {
            this.actionBar.setBackButtonImage(2131231240);
            this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131752427, null));
            this.actionBar.setActionBarMenuOnItemClick(p9Var);
        }
        org.telegram.ui.Components.ch0 ch0Var = new org.telegram.ui.Components.ch0(2131624241, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
        this.L = ch0Var;
        ch0Var.h = true;
        if (!this.K) {
            ch0Var.P(0);
            this.L.M(0);
        } else {
            ch0Var.M(35);
            this.L.P(36);
        }
        this.L.f33573a0 = true;
        int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.J9, this.resourceProvider);
        this.L.Q(w02, "Sunny");
        this.L.Q(w02, "Path 6");
        this.L.Q(w02, "Path");
        this.L.Q(w02, "Path 5");
        org.telegram.ui.ActionBar.w4 w4Var2 = this.simpleActionBar;
        if (w4Var2 != null) {
            org.telegram.ui.ActionBar.c5 r10 = w4Var2.r();
            org.telegram.ui.Components.ch0 ch0Var2 = this.L;
            r10.getClass();
            d = r10.c(1, 0, null, ch0Var2, org.telegram.messenger.g0.L(48.0f), null);
        } else {
            d = this.actionBar.s().d(1, this.L);
        }
        this.M = d;
        FrameLayout frameLayout = new FrameLayout(context);
        j1();
        E0();
        if (!this.d) {
            setHasOwnBackground(true);
            this.N.setSectionsDrawBackground(true);
        } else {
            this.N.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.f28792a7));
        }
        org.telegram.ui.Components.uj0 uj0Var = this.N;
        dc dcVar = new dc(this);
        this.O = dcVar;
        uj0Var.setAdapter(dcVar);
        new v4.s(3);
        this.N.setLayoutManager(new v4.b0());
        org.telegram.ui.Components.uj0 uj0Var2 = this.N;
        if (this.d) {
            f10 = 68.0f;
        } else {
            f10 = 0.0f;
        }
        frameLayout.addView(uj0Var2, c8.ja.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, f10));
        this.N.setOnItemClickListener(new fi.i4(4, this, N0));
        v4.k kVar = new v4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.er.h);
        kVar.C = false;
        kVar.f58564m = false;
        this.N.setItemAnimator(kVar);
        hi.d dVar = new hi.d(context, this.resourceProvider, true);
        dVar.setRoundRadius(24);
        this.Q = dVar;
        dVar.i(org.telegram.messenger.hd.M0(2131754218, null), false, true);
        this.Q.setOnClickListener(new a(this, 11));
        e1(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.P = frameLayout2;
        if (this.d) {
            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28792a7, frameLayout2, getResourceProvider());
        } else {
            frameLayout2.setBackground(getBaseSimpleGlass().b(this.P));
        }
        this.P.addView(this.Q, c8.ja.d(-1, 48.0f, 80, 10.0f, 10.0f, 10.0f, 10.0f));
        frameLayout.addView(this.P, c8.ja.e(-1, 68, 80));
        setBulletinDelegate(new y8(this, 1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d1(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        if (tL_premium_boostsStatus != null) {
            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-this.f50543a));
            this.f50547c = tL_premium_boostsStatus;
            int i7 = tL_premium_boostsStatus.level;
            this.f50545b = i7;
            if (M0 != null) {
                M0.level = i7;
            }
            dc dcVar = this.O;
            if (dcVar != null) {
                dcVar.f();
            }
            e1(true);
        }
    }

    public void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.ns.f25551p3;
        long j3 = this.f50543a;
        if (i7 == i11) {
            if (j3 == ((Long) objArr[2]).longValue()) {
                d1((TL_stories.TL_premium_boostsStatus) objArr[0]);
            }
        } else if (i7 == org.telegram.messenger.ns.V2) {
            if (!((Boolean) objArr[1]).booleanValue()) {
                getMessagesController().G0().a(j3, new vb(this, 2));
            }
        } else if (i7 == org.telegram.messenger.ns.f25609y1 && j3 == ((Long) objArr[0]).longValue()) {
            org.telegram.ui.ActionBar.o4 o4Var = this.parentLayout;
            if (o4Var != null && o4Var.getLastFragment() == this) {
                finishFragment();
            } else {
                removeSelfFromStack();
            }
        }
    }

    public void e1(boolean z10) {
        if (this.Q != null && this.f50547c != null) {
            int Z0 = Z0();
            if (this.f50545b >= Z0) {
                this.Q.g(null, z10);
                return;
            }
            if (this.J == null) {
                this.J = new SpannableStringBuilder("l");
                org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(2131231976, 0);
                eqVar.f34413n = 1;
                this.J.setSpan(eqVar, 0, 1, 33);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.J).append((CharSequence) org.telegram.messenger.hd.G(Z0, "BoostLevelRequired", new Object[0]));
            this.Q.g(spannableStringBuilder, z10);
        }
    }

    public void g1(boolean z10) {
        int themedColor;
        org.telegram.ui.ActionBar.w4 w4Var = this.simpleActionBar;
        if (w4Var != null) {
            w4Var.updateColors();
        } else {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            int i7 = -1;
            if (this.d && this.f50567s != -1) {
                themedColor = -1;
            } else {
                themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.A8);
            }
            kVar.setTitleColor(themedColor);
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            if (!this.d || this.f50567s == -1) {
                i7 = getThemedColor(org.telegram.ui.ActionBar.j6.f29186v8);
            }
            kVar2.H(i7, false);
            this.actionBar.F(getThemedColor(org.telegram.ui.ActionBar.j6.f29147t8), false);
        }
        if (!z10) {
            this.O.f();
            org.telegram.messenger.g0.d0(this.N, new fi.e(this));
            if (this.d) {
                this.P.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.f28792a7));
            }
            this.Q.updateColors();
            setNavigationBarColor(getNavigationBarColor());
        }
    }

    @Override
    public final org.telegram.ui.Components.uj0 getListViewForSimpleGlass() {
        if (!this.d) {
            return this.N;
        }
        return null;
    }

    public final void h1(boolean z10) {
        org.telegram.messenger.gj messageObject;
        View F0 = F0(this.T);
        View F02 = F0(this.U);
        View F03 = F0(this.V);
        View F04 = F0(this.X);
        if (F0 instanceof org.telegram.ui.Cells.z9) {
            org.telegram.ui.Cells.z9 z9Var = (org.telegram.ui.Cells.z9) F0;
            org.telegram.ui.Cells.q1[] cells = z9Var.getCells();
            for (int i7 = 0; i7 < cells.length; i7++) {
                org.telegram.ui.Cells.q1 q1Var = cells[i7];
                if (q1Var != null && (messageObject = q1Var.getMessageObject()) != null) {
                    messageObject.f23793e1 = this.f50552f;
                    messageObject.f23798f1 = this.f50560n;
                    cells[i7].setAvatar(messageObject);
                    cells[i7].invalidate();
                }
            }
            Drawable f10 = hi.x5.f(this.I, this.currentAccount, this.G, this.K);
            this.I = f10;
            z9Var.setOverrideBackground(f10);
        }
        if (F02 instanceof gm0) {
            ((gm0) F02).a(this.f50552f, z10);
        } else if (F02 instanceof hc) {
            ((hc) F02).a(this.f50552f, z10);
        }
        if (F03 instanceof ec) {
            ec ecVar = (ec) F03;
            ecVar.a(this.currentAccount, this.f50552f, true);
            ecVar.c(this.f50560n, false, z10);
        }
        if (F04 instanceof oc) {
            oc ocVar = (oc) F04;
            String j3 = org.telegram.messenger.d4.j(this.G);
            if (j3 == null && this.G == null && this.H != null) {
                j3 = "❌";
            }
            ocVar.a(j3, z10);
            ocVar.setGalleryWallpaper(this.H);
        }
    }

    public final void i1() {
        TLRPC.StickerSet stickerSet;
        TLRPC.StickerSet stickerSet2;
        View F0 = F0(this.f50544a0);
        View F02 = F0(this.f50548c0);
        View F03 = F0(this.f50549d0);
        View F04 = F0(this.f50554g0);
        View F05 = F0(this.f50556i0);
        View F06 = F0(this.f50558k0);
        if (F0 instanceof jc) {
            TLRPC.EmojiStatus emojiStatus = this.E;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                jc jcVar = (jc) F0;
                ic icVar = jcVar.f48285b;
                org.telegram.messenger.cp a10 = org.telegram.messenger.cp.a(emojiStatus);
                icVar.c(a10, true);
                jcVar.f48284a.c(a10, true);
                icVar.d(((TLRPC.TL_emojiStatusCollectible) this.E).pattern_document_id, true, true);
            } else {
                jc jcVar2 = (jc) F0;
                ic icVar2 = jcVar2.f48285b;
                int i7 = this.f50567s;
                icVar2.b(i7, true);
                jcVar2.f48284a.b(jcVar2.h.currentAccount, i7, true);
                icVar2.d(this.f50574x, false, true);
            }
            jc jcVar3 = (jc) F0;
            ic icVar3 = jcVar3.f48285b;
            icVar3.e(org.telegram.messenger.m5.f(this.E), false, true);
            icVar3.a(this.f50552f);
            jcVar3.updateColors();
        }
        if (F02 instanceof gm0) {
            ((gm0) F02).a(this.f50567s, true);
        } else if (F02 instanceof hc) {
            ((hc) F02).a(this.f50552f, true);
        }
        if (F03 instanceof ec) {
            ec ecVar = (ec) F03;
            ecVar.a(this.currentAccount, this.f50567s, false);
            ecVar.c(this.f50574x, false, true);
        }
        if (F04 instanceof ec) {
            TLRPC.EmojiStatus emojiStatus2 = this.E;
            if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                ((ec) F04).b(org.telegram.messenger.cp.a(emojiStatus2));
            } else {
                ((ec) F04).a(this.currentAccount, this.f50567s, false);
            }
            ((ec) F04).c(org.telegram.messenger.m5.f(this.E), org.telegram.messenger.m5.B(this.E), true);
        }
        boolean z10 = F05 instanceof ec;
        long j3 = this.f50543a;
        if (z10) {
            ec ecVar2 = (ec) F05;
            ecVar2.a(this.currentAccount, this.f50567s, false);
            TLRPC.ChatFull N0 = getMessagesController().N0(-j3);
            if (N0 != null && (stickerSet2 = N0.emojiset) != null) {
                ecVar2.c(K0(stickerSet2), false, false);
            } else {
                ecVar2.c(0L, false, false);
            }
        }
        if (F06 instanceof ec) {
            TLRPC.ChatFull N02 = getMessagesController().N0(-j3);
            if (N02 != null && (stickerSet = N02.stickerset) != null) {
                ((ec) F06).d(J0(stickerSet));
            } else {
                ((ec) F06).c(0L, false, false);
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
        if (X0() && this.f50545b >= Z0()) {
            return false;
        }
        return true;
    }

    public void j1() {
        dc dcVar;
        dc dcVar2;
        boolean z10 = false;
        this.T = 0;
        int i7 = 1 + 1;
        this.U = 1;
        this.V = i7;
        this.W = i7 + 1;
        this.X = i7 + 2;
        this.Y = i7 + 3;
        this.Z = i7 + 4;
        this.f50544a0 = i7 + 5;
        this.f50548c0 = i7 + 6;
        int i10 = i7 + 8;
        this.S = i10;
        this.f50549d0 = i7 + 7;
        if (this.f50574x == 0 && this.f50567s < 0 && !(this.E instanceof TLRPC.TL_emojiStatusCollectible)) {
            int i11 = this.f50553f0;
            this.f50553f0 = -1;
            if (i11 >= 0 && (dcVar2 = this.O) != null) {
                dcVar2.s(i11);
                this.O.g(this.f50549d0);
            }
        } else {
            if (this.f50553f0 >= 0) {
                z10 = true;
            }
            this.S = i7 + 9;
            this.f50553f0 = i10;
            if (!z10 && (dcVar = this.O) != null) {
                dcVar.i(i10);
                this.O.g(this.f50549d0);
            }
        }
        int i12 = this.S;
        this.f50551e0 = i12;
        this.f50554g0 = i12 + 1;
        this.S = i12 + 3;
        this.f50555h0 = i12 + 2;
    }

    public final void k1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qc.k1():void");
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.f50545b >= Z0() && X0()) {
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
        getNotificationCenter().c(this, org.telegram.messenger.ns.V2);
        getNotificationCenter().c(this, org.telegram.messenger.ns.f25551p3);
        getNotificationCenter().c(this, org.telegram.messenger.ns.f25609y1);
        return super.onFragmentCreate();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.ns.V2);
        getNotificationCenter().n(this, org.telegram.messenger.ns.f25551p3);
        getNotificationCenter().n(this, org.telegram.messenger.ns.f25609y1);
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        if (!this.d && this.P != null) {
            int L = org.telegram.messenger.g0.L(68.0f) + i12;
            ViewGroup.LayoutParams layoutParams = this.P.getLayoutParams();
            if (layoutParams.height != L) {
                layoutParams.height = L;
                this.P.setLayoutParams(layoutParams);
            }
            if (this.P.getPaddingLeft() != i7 || this.P.getPaddingRight() != i11 || this.P.getPaddingBottom() != i12) {
                this.P.setPadding(i7, 0, i11, i12);
            }
            ri.a.e(this.N, i10, i12, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), org.telegram.messenger.g0.L(68.0f));
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
        i0.c cVar = this.mSystemInsets;
        onInsets(cVar.f15574a, cVar.f15575b, cVar.f15576c, cVar.d);
    }

    @Override
    public final void setResourceProvider(org.telegram.ui.ActionBar.e6 e6Var) {
        this.f50566r0 = e6Var;
    }

    @Override
    public final boolean useSimpleActionBar() {
        return !this.d;
    }

    public void a1(int i7) {
    }
}
