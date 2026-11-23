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
public class qc extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.gs {
    public TLRPC.EmojiStatus E;
    public TLRPC.WallPaper F;
    public TLRPC.WallPaper G;
    public TLRPC.WallPaper H;
    public Drawable I;
    public SpannableStringBuilder J;
    public boolean K;
    public org.telegram.ui.Components.oh0 L;
    public org.telegram.ui.ActionBar.q0 M;
    public org.telegram.ui.Components.ek0 N;
    public dc O;
    public FrameLayout P;
    public hi.e Q;
    public ac R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public final long f51209a;
    public int f51210a0;
    public int f51211b;
    public int f51212b0;
    public TL_stories.TL_premium_boostsStatus f51213c;
    public int f51214c0;
    public boolean d;
    public int f51215d0;
    public int f51216e;
    public int f51217e0;
    public int f51218f;
    public int f51219f0;
    public int f51220g0;
    public long h;
    public int f51221h0;
    public int f51222i0;
    public int f51223j0;
    public int f51224k0;
    public int f51225l0;
    public org.telegram.ui.ActionBar.g2 m0;
    public long f51226n;
    public bc f51227n0;
    public float f51228o0;
    public ValueAnimator f51229p0;
    public boolean f51230q0;
    public int f51231r;
    public org.telegram.ui.ActionBar.h6 f51232r0;
    public int f51233s;
    public final SparseIntArray f51234s0;
    public final org.telegram.ui.ActionBar.u4 f51235t0;
    public final org.telegram.ui.ActionBar.u4 f51236u0;
    public final org.telegram.ui.ActionBar.u4 f51237v0;
    public long f51238w;
    public final org.telegram.ui.ActionBar.u4 f51239w0;
    public long f51240x;
    public final Drawable f51241x0;
    public TLRPC.EmojiStatus f51242y;
    public final Drawable f51243y0;
    public final Paint f51244z0;

    public qc(long j3) {
        super(null);
        boolean q10 = org.telegram.ui.ActionBar.m6.I.q();
        this.K = q10;
        this.S = 0;
        this.f51230q0 = q10;
        this.f51234s0 = new SparseIntArray();
        Paint paint = new Paint(1);
        this.f51244z0 = paint;
        paint.setStrokeWidth(1.0f);
        paint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29382d7, this.resourceProvider));
        this.f51241x0 = org.telegram.messenger.t0.f26931b.getDrawable(2131232093).mutate();
        this.f51243y0 = org.telegram.messenger.t0.f26931b.getDrawable(2131232179).mutate();
        this.f51209a = j3;
        TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(-j3));
        if (O0 != null) {
            this.f51211b = O0.level;
        }
        org.telegram.messenger.np.u1(this.currentAccount).I0().a(j3, new li.d(10, this, O0));
        this.resourceProvider = new pc(this);
        this.f51235t0 = new org.telegram.ui.ActionBar.u4(0, false, false, this.resourceProvider);
        this.f51236u0 = new org.telegram.ui.ActionBar.u4(0, false, true, this.resourceProvider);
        this.f51237v0 = new org.telegram.ui.ActionBar.u4(0, true, false, this.resourceProvider);
        this.f51239w0 = new org.telegram.ui.ActionBar.u4(0, true, true, this.resourceProvider);
    }

    public static void Z(qc qcVar) {
        org.telegram.ui.ActionBar.h6 h6Var = qcVar.resourceProvider;
        if (h6Var instanceof pc) {
            qc qcVar2 = ((pc) h6Var).f50847a;
            qcVar2.K = !qcVar2.K;
            qcVar2.k1();
            qcVar2.g1(false);
        } else {
            qcVar.K = !qcVar.K;
            qcVar.k1();
        }
        qcVar.b1(qcVar.K, true);
        qcVar.g1(false);
        org.telegram.ui.ActionBar.m6.Dm++;
    }

    public static void a0(org.telegram.ui.qc r13, org.telegram.messenger.g3 r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qc.a0(org.telegram.ui.qc, org.telegram.messenger.g3):void");
    }

    public static void b0(org.telegram.ui.qc r22, org.telegram.tgnet.TLRPC.ChatFull r23, android.view.View r24, int r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qc.b0(org.telegram.ui.qc, org.telegram.tgnet.TLRPC$ChatFull, android.view.View, int):void");
    }

    public static void f1(View view) {
        if (view instanceof ec) {
            ((ec) view).updateColors();
        } else if (view instanceof org.telegram.ui.Cells.n8) {
            ((org.telegram.ui.Cells.n8) view).updateColors();
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
        if (this.d && this.f51233s != -1) {
            themedColor = -1;
        } else {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.m6.A8);
        }
        kVar.setTitleColor(themedColor);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        if (!this.d || this.f51233s == -1) {
            i7 = getThemedColor(org.telegram.ui.ActionBar.m6.f29718v8);
        }
        kVar2.G(i7, false);
    }

    public void C0() {
        B0();
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.m6.f29661s8));
        }
        org.telegram.ui.Components.ek0 ek0Var = this.N;
        if (ek0Var != null && this.d) {
            ek0Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.m6.f29324a7));
        }
        FrameLayout frameLayout = this.P;
        if (frameLayout != null) {
            frameLayout.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.m6.f29324a7));
        }
    }

    public final void D0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qc.D0():void");
    }

    public void E0() {
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(getParentActivity(), this.resourceProvider);
        this.N = ek0Var;
        ek0Var.setSections(false);
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
        return getMessagesController().f26004x5;
    }

    public int H0() {
        return 0;
    }

    public int I0() {
        return 0;
    }

    public final TLRPC.Document J0(TLRPC.StickerSet stickerSet) {
        if (stickerSet != null && stickerSet.thumb_document_id == 0) {
            TLRPC.TL_messages_stickerSet a02 = getMediaDataController().a0(stickerSet);
            if (!a02.documents.isEmpty()) {
                return a02.documents.get(0);
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
            TLRPC.TL_messages_stickerSet a02 = getMediaDataController().a0(stickerSet);
            if (!a02.documents.isEmpty()) {
                return a02.documents.get(0).f28440id;
            }
        }
        return j3;
    }

    public int L0() {
        return 2131752400;
    }

    public int M0() {
        return getMessagesController().f25984v5;
    }

    public int N0() {
        return 2131752401;
    }

    public int O0() {
        return 0;
    }

    public int P0() {
        return 3;
    }

    public int Q0() {
        return getMessagesController().f25975u5;
    }

    public int R0() {
        return 2131752308;
    }

    public int S0() {
        return 0;
    }

    public int T0() {
        return 0;
    }

    public int U0() {
        return 2131752251;
    }

    public int V0() {
        return getMessagesController().f25994w5;
    }

    public int W0() {
        return 2131752252;
    }

    public final boolean X0() {
        if (this.f51216e == this.f51218f && this.h == this.f51226n && this.f51231r == this.f51233s && this.f51238w == this.f51240x && org.telegram.messenger.n5.a(this.f51242y, this.E) && org.telegram.messenger.f4.v(this.F, this.G)) {
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
        if (this.f51216e != this.f51218f) {
            org.telegram.messenger.dp dpVar = getMessagesController().f25966t4;
            if (dpVar == null) {
                d = null;
            } else {
                d = dpVar.d(this.f51218f);
            }
            if (d != null) {
                i7 = Math.max(0, d.l(this.d));
            }
        }
        if (this.h != this.f51226n) {
            i7 = Math.max(i7, getMessagesController().f25967t5);
        }
        if (this.f51231r != this.f51233s) {
            org.telegram.messenger.dp dpVar2 = getMessagesController().f25974u4;
            if (dpVar2 != null) {
                cpVar = dpVar2.d(this.f51233s);
            }
            if (cpVar != null) {
                i7 = Math.max(i7, cpVar.l(this.d));
            }
        }
        if (this.f51238w != this.f51240x) {
            i7 = Math.max(i7, Q0());
        }
        if (!org.telegram.messenger.n5.a(this.f51242y, this.E)) {
            i7 = Math.max(i7, M0());
        }
        if (!org.telegram.messenger.f4.v(this.F, this.G)) {
            return Math.max(i7, V0());
        }
        return i7;
    }

    public final void b1(boolean z10, boolean z11) {
        int i7;
        if (this.f51230q0 != z10) {
            this.f51230q0 = z10;
            int i10 = 0;
            if (z11) {
                org.telegram.ui.Components.oh0 oh0Var = this.L;
                if (z10) {
                    i10 = oh0Var.f38211e[0];
                }
                oh0Var.P(i10);
                org.telegram.ui.Components.oh0 oh0Var2 = this.L;
                if (oh0Var2 != null) {
                    oh0Var2.start();
                    return;
                }
                return;
            }
            if (z10) {
                i7 = this.L.f38211e[0] - 1;
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
        String N0 = org.telegram.messenger.hd.N0(2131752414, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
        t1Var.S = N0;
        t1Var.U = org.telegram.messenger.hd.N0(2131752413, null);
        alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131751357, null), new org.telegram.ui.ActionBar.q1(this) {
            public final qc f53812b;

            {
                this.f53812b = this;
            }

            @Override
            public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i7) {
                switch (r2) {
                    case 0:
                        this.f53812b.finishFragment();
                        return;
                    default:
                        this.f53812b.D0();
                        return;
                }
            }
        });
        alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131754213, null), new org.telegram.ui.ActionBar.q1(this) {
            public final qc f53812b;

            {
                this.f53812b = this;
            }

            @Override
            public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i7) {
                switch (r2) {
                    case 0:
                        this.f53812b.finishFragment();
                        return;
                    default:
                        this.f53812b.D0();
                        return;
                }
            }
        });
        showDialog(t1Var);
        org.telegram.ui.ActionBar.t6.U((TextView) t1Var.d(-2), org.telegram.ui.ActionBar.m6.f29622q7, getResourceProvider());
    }

    @Override
    public View createView(Context context) {
        org.telegram.ui.ActionBar.q0 d;
        float f10;
        org.telegram.messenger.np messagesController = getMessagesController();
        long j3 = -this.f51209a;
        TLRPC.Chat O0 = messagesController.O0(Long.valueOf(j3));
        if (O0 != null) {
            int F = org.telegram.messenger.v3.F(O0);
            this.f51218f = F;
            this.f51216e = F;
            long G = org.telegram.messenger.v3.G(O0);
            this.f51226n = G;
            this.h = G;
            int I = org.telegram.messenger.v3.I(O0);
            this.f51233s = I;
            this.f51231r = I;
            long J = org.telegram.messenger.v3.J(O0);
            this.f51240x = J;
            this.f51238w = J;
            TLRPC.EmojiStatus emojiStatus = O0.emoji_status;
            this.E = emojiStatus;
            this.f51242y = emojiStatus;
        }
        TLRPC.ChatFull P0 = getMessagesController().P0(j3);
        if (P0 != null) {
            TLRPC.WallPaper wallPaper = P0.wallpaper;
            this.G = wallPaper;
            this.F = wallPaper;
            String j10 = org.telegram.messenger.f4.j(wallPaper);
            if (j10 != null && j10.length() == 0) {
                this.H = this.F;
            }
        }
        x7 x7Var = new x7(this, 6);
        org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
        if (z4Var != null) {
            z4Var.setBackButtonImage(2131231240);
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.N0(2131752415, null));
            this.simpleActionBar.setActionBarMenuOnItemClick(x7Var);
        } else {
            this.actionBar.setBackButtonImage(2131231240);
            this.actionBar.setTitle(org.telegram.messenger.hd.N0(2131752415, null));
            this.actionBar.setActionBarMenuOnItemClick(x7Var);
        }
        org.telegram.ui.Components.oh0 oh0Var = new org.telegram.ui.Components.oh0(2131624241, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
        this.L = oh0Var;
        oh0Var.h = true;
        if (!this.K) {
            oh0Var.P(0);
            this.L.M(0);
        } else {
            oh0Var.M(35);
            this.L.P(36);
        }
        this.L.f38205a0 = true;
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.J9, this.resourceProvider);
        this.L.Q(w02, "Sunny");
        this.L.Q(w02, "Path 6");
        this.L.Q(w02, "Path");
        this.L.Q(w02, "Path 5");
        org.telegram.ui.ActionBar.z4 z4Var2 = this.simpleActionBar;
        if (z4Var2 != null) {
            org.telegram.ui.ActionBar.f5 t6 = z4Var2.t();
            org.telegram.ui.Components.oh0 oh0Var2 = this.L;
            t6.getClass();
            d = t6.c(1, 0, null, oh0Var2, org.telegram.messenger.g0.L(48.0f), null);
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
            this.N.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.m6.f29324a7));
        }
        org.telegram.ui.Components.ek0 ek0Var = this.N;
        dc dcVar = new dc(this);
        this.O = dcVar;
        ek0Var.setAdapter(dcVar);
        new v4.t(3);
        this.N.setLayoutManager(new v4.c0());
        org.telegram.ui.Components.ek0 ek0Var2 = this.N;
        if (this.d) {
            f10 = 68.0f;
        } else {
            f10 = 0.0f;
        }
        frameLayout.addView(ek0Var2, c8.ma.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, f10));
        this.N.setOnItemClickListener(new fi.g4(4, this, P0));
        v4.k kVar = new v4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.nr.h);
        kVar.C = false;
        kVar.f59194m = false;
        this.N.setItemAnimator(kVar);
        hi.e eVar = new hi.e(context, this.resourceProvider, true);
        eVar.setRoundRadius(24);
        this.Q = eVar;
        eVar.i(org.telegram.messenger.hd.N0(2131754215, null), false, true);
        this.Q.setOnClickListener(new a(this, 11));
        e1(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.P = frameLayout2;
        if (this.d) {
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29324a7, frameLayout2, getResourceProvider());
        } else {
            frameLayout2.setBackground(getBaseSimpleGlass().b(this.P));
        }
        this.P.addView(this.Q, c8.ma.d(-1, 48.0f, 80, 10.0f, 10.0f, 10.0f, 10.0f));
        frameLayout.addView(this.P, c8.ma.e(-1, 68, 80));
        setBulletinDelegate(new z8(this, 1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d1(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        if (tL_premium_boostsStatus != null) {
            TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(-this.f51209a));
            this.f51213c = tL_premium_boostsStatus;
            int i7 = tL_premium_boostsStatus.level;
            this.f51211b = i7;
            if (O0 != null) {
                O0.level = i7;
            }
            dc dcVar = this.O;
            if (dcVar != null) {
                dcVar.f();
            }
            e1(true);
        }
    }

    public void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.ls.f25375r3;
        long j3 = this.f51209a;
        if (i7 == i11) {
            if (j3 == ((Long) objArr[2]).longValue()) {
                d1((TL_stories.TL_premium_boostsStatus) objArr[0]);
            }
        } else if (i7 == org.telegram.messenger.ls.X2) {
            if (!((Boolean) objArr[1]).booleanValue()) {
                getMessagesController().I0().a(j3, new vb(this, 2));
            }
        } else if (i7 == org.telegram.messenger.ls.f25420y1 && j3 == ((Long) objArr[0]).longValue()) {
            org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
            if (r4Var != null && r4Var.getLastFragment() == this) {
                finishFragment();
            } else {
                removeSelfFromStack();
            }
        }
    }

    public void e1(boolean z10) {
        if (this.Q != null && this.f51213c != null) {
            int Z0 = Z0();
            if (this.f51211b >= Z0) {
                this.Q.g(null, z10);
                return;
            }
            if (this.J == null) {
                this.J = new SpannableStringBuilder("l");
                org.telegram.ui.Components.nq nqVar = new org.telegram.ui.Components.nq(2131231977, 0);
                nqVar.f37950n = 1;
                this.J.setSpan(nqVar, 0, 1, 33);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.J).append((CharSequence) org.telegram.messenger.hd.G(Z0, "BoostLevelRequired", new Object[0]));
            this.Q.g(spannableStringBuilder, z10);
        }
    }

    public void g1(boolean z10) {
        int themedColor;
        org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
        if (z4Var != null) {
            z4Var.updateColors();
        } else {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            int i7 = -1;
            if (this.d && this.f51233s != -1) {
                themedColor = -1;
            } else {
                themedColor = getThemedColor(org.telegram.ui.ActionBar.m6.A8);
            }
            kVar.setTitleColor(themedColor);
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            if (!this.d || this.f51233s == -1) {
                i7 = getThemedColor(org.telegram.ui.ActionBar.m6.f29718v8);
            }
            kVar2.G(i7, false);
            this.actionBar.F(getThemedColor(org.telegram.ui.ActionBar.m6.f29679t8), false);
        }
        if (!z10) {
            this.O.f();
            org.telegram.messenger.g0.d0(this.N, new fi.e(this));
            if (this.d) {
                this.P.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.m6.f29324a7));
            }
            this.Q.updateColors();
            setNavigationBarColor(getNavigationBarColor());
        }
    }

    @Override
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
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
        if (F0 instanceof org.telegram.ui.Cells.ba) {
            org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) F0;
            org.telegram.ui.Cells.r1[] cells = baVar.getCells();
            for (int i7 = 0; i7 < cells.length; i7++) {
                org.telegram.ui.Cells.r1 r1Var = cells[i7];
                if (r1Var != null && (messageObject = r1Var.getMessageObject()) != null) {
                    messageObject.f24187e1 = this.f51218f;
                    messageObject.f24192f1 = this.f51226n;
                    cells[i7].setAvatar(messageObject);
                    cells[i7].invalidate();
                }
            }
            Drawable f10 = hi.v5.f(this.I, this.currentAccount, this.G, this.K);
            this.I = f10;
            baVar.setOverrideBackground(f10);
        }
        if (F02 instanceof im0) {
            ((im0) F02).a(this.f51218f, z10);
        } else if (F02 instanceof hc) {
            ((hc) F02).a(this.f51218f, z10);
        }
        if (F03 instanceof ec) {
            ec ecVar = (ec) F03;
            ecVar.a(this.currentAccount, this.f51218f, true);
            ecVar.c(this.f51226n, false, z10);
        }
        if (F04 instanceof oc) {
            oc ocVar = (oc) F04;
            String j3 = org.telegram.messenger.f4.j(this.G);
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
        View F0 = F0(this.f51210a0);
        View F02 = F0(this.f51214c0);
        View F03 = F0(this.f51215d0);
        View F04 = F0(this.f51220g0);
        View F05 = F0(this.f51222i0);
        View F06 = F0(this.f51224k0);
        if (F0 instanceof jc) {
            TLRPC.EmojiStatus emojiStatus = this.E;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                jc jcVar = (jc) F0;
                ic icVar = jcVar.f48963b;
                org.telegram.messenger.cp a10 = org.telegram.messenger.cp.a(emojiStatus);
                icVar.c(a10, true);
                jcVar.f48962a.c(a10, true);
                icVar.d(((TLRPC.TL_emojiStatusCollectible) this.E).pattern_document_id, true, true);
            } else {
                jc jcVar2 = (jc) F0;
                ic icVar2 = jcVar2.f48963b;
                int i7 = this.f51233s;
                icVar2.b(i7, true);
                jcVar2.f48962a.b(jcVar2.h.currentAccount, i7, true);
                icVar2.d(this.f51240x, false, true);
            }
            jc jcVar3 = (jc) F0;
            ic icVar3 = jcVar3.f48963b;
            icVar3.e(org.telegram.messenger.n5.f(this.E), false, true);
            icVar3.a(this.f51218f);
            jcVar3.updateColors();
        }
        if (F02 instanceof im0) {
            ((im0) F02).a(this.f51233s, true);
        } else if (F02 instanceof hc) {
            ((hc) F02).a(this.f51218f, true);
        }
        if (F03 instanceof ec) {
            ec ecVar = (ec) F03;
            ecVar.a(this.currentAccount, this.f51233s, false);
            ecVar.c(this.f51240x, false, true);
        }
        if (F04 instanceof ec) {
            TLRPC.EmojiStatus emojiStatus2 = this.E;
            if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                ((ec) F04).b(org.telegram.messenger.cp.a(emojiStatus2));
            } else {
                ((ec) F04).a(this.currentAccount, this.f51233s, false);
            }
            ((ec) F04).c(org.telegram.messenger.n5.f(this.E), org.telegram.messenger.n5.B(this.E), true);
        }
        boolean z10 = F05 instanceof ec;
        long j3 = this.f51209a;
        if (z10) {
            ec ecVar2 = (ec) F05;
            ecVar2.a(this.currentAccount, this.f51233s, false);
            TLRPC.ChatFull P0 = getMessagesController().P0(-j3);
            if (P0 != null && (stickerSet2 = P0.emojiset) != null) {
                ecVar2.c(K0(stickerSet2), false, false);
            } else {
                ecVar2.c(0L, false, false);
            }
        }
        if (F06 instanceof ec) {
            TLRPC.ChatFull P02 = getMessagesController().P0(-j3);
            if (P02 != null && (stickerSet = P02.stickerset) != null) {
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
        if (X0() && this.f51211b >= Z0()) {
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
        this.f51210a0 = i7 + 5;
        this.f51214c0 = i7 + 6;
        int i10 = i7 + 8;
        this.S = i10;
        this.f51215d0 = i7 + 7;
        if (this.f51240x == 0 && this.f51233s < 0 && !(this.E instanceof TLRPC.TL_emojiStatusCollectible)) {
            int i11 = this.f51219f0;
            this.f51219f0 = -1;
            if (i11 >= 0 && (dcVar2 = this.O) != null) {
                dcVar2.s(i11);
                this.O.g(this.f51215d0);
            }
        } else {
            if (this.f51219f0 >= 0) {
                z10 = true;
            }
            this.S = i7 + 9;
            this.f51219f0 = i10;
            if (!z10 && (dcVar = this.O) != null) {
                dcVar.i(i10);
                this.O.g(this.f51215d0);
            }
        }
        int i12 = this.S;
        this.f51217e0 = i12;
        this.f51220g0 = i12 + 1;
        this.S = i12 + 3;
        this.f51221h0 = i12 + 2;
    }

    public final void k1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qc.k1():void");
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.f51211b >= Z0() && X0()) {
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
        getMediaDataController().b1();
        getNotificationCenter().c(this, org.telegram.messenger.ls.X2);
        getNotificationCenter().c(this, org.telegram.messenger.ls.f25375r3);
        getNotificationCenter().c(this, org.telegram.messenger.ls.f25420y1);
        return super.onFragmentCreate();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.ls.X2);
        getNotificationCenter().n(this, org.telegram.messenger.ls.f25375r3);
        getNotificationCenter().n(this, org.telegram.messenger.ls.f25420y1);
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
        i0.b bVar = this.mSystemInsets;
        onInsets(bVar.f15917a, bVar.f15918b, bVar.f15919c, bVar.d);
    }

    @Override
    public final void setResourceProvider(org.telegram.ui.ActionBar.h6 h6Var) {
        this.f51232r0 = h6Var;
    }

    @Override
    public final boolean useSimpleActionBar() {
        return !this.d;
    }

    public void a1(int i7) {
    }
}
