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
public class qc extends org.telegram.ui.ActionBar.h2 implements org.telegram.messenger.fs {
    public TLRPC.EmojiStatus E;
    public TLRPC.WallPaper F;
    public TLRPC.WallPaper G;
    public TLRPC.WallPaper H;
    public Drawable I;
    public SpannableStringBuilder J;
    public boolean K;
    public org.telegram.ui.Components.mh0 L;
    public org.telegram.ui.ActionBar.r0 M;
    public org.telegram.ui.Components.ck0 N;
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
    public final long f51159a;
    public int f51160a0;
    public int f51161b;
    public int f51162b0;
    public TL_stories.TL_premium_boostsStatus f51163c;
    public int f51164c0;
    public boolean d;
    public int f51165d0;
    public int f51166e;
    public int f51167e0;
    public int f51168f;
    public int f51169f0;
    public int f51170g0;
    public long h;
    public int f51171h0;
    public int f51172i0;
    public int f51173j0;
    public int f51174k0;
    public int f51175l0;
    public org.telegram.ui.ActionBar.h2 m0;
    public long f51176n;
    public bc f51177n0;
    public float f51178o0;
    public ValueAnimator f51179p0;
    public boolean f51180q0;
    public int f51181r;
    public org.telegram.ui.ActionBar.i6 f51182r0;
    public int f51183s;
    public final SparseIntArray f51184s0;
    public final org.telegram.ui.ActionBar.v4 f51185t0;
    public final org.telegram.ui.ActionBar.v4 f51186u0;
    public final org.telegram.ui.ActionBar.v4 f51187v0;
    public long f51188w;
    public final org.telegram.ui.ActionBar.v4 f51189w0;
    public long f51190x;
    public final Drawable f51191x0;
    public TLRPC.EmojiStatus f51192y;
    public final Drawable f51193y0;
    public final Paint f51194z0;

    public qc(long j3) {
        super(null);
        boolean q10 = org.telegram.ui.ActionBar.n6.I.q();
        this.K = q10;
        this.S = 0;
        this.f51180q0 = q10;
        this.f51184s0 = new SparseIntArray();
        Paint paint = new Paint(1);
        this.f51194z0 = paint;
        paint.setStrokeWidth(1.0f);
        paint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29395d7, this.resourceProvider));
        this.f51191x0 = org.telegram.messenger.t0.f26913b.getDrawable(2131232093).mutate();
        this.f51193y0 = org.telegram.messenger.t0.f26913b.getDrawable(2131232179).mutate();
        this.f51159a = j3;
        TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(-j3));
        if (O0 != null) {
            this.f51161b = O0.level;
        }
        org.telegram.messenger.mp.u1(this.currentAccount).I0().a(j3, new li.d(10, this, O0));
        this.resourceProvider = new pc(this);
        this.f51185t0 = new org.telegram.ui.ActionBar.v4(0, false, false, this.resourceProvider);
        this.f51186u0 = new org.telegram.ui.ActionBar.v4(0, false, true, this.resourceProvider);
        this.f51187v0 = new org.telegram.ui.ActionBar.v4(0, true, false, this.resourceProvider);
        this.f51189w0 = new org.telegram.ui.ActionBar.v4(0, true, true, this.resourceProvider);
    }

    public static void Z(qc qcVar) {
        org.telegram.ui.ActionBar.i6 i6Var = qcVar.resourceProvider;
        if (i6Var instanceof pc) {
            qc qcVar2 = ((pc) i6Var).f50802a;
            qcVar2.K = !qcVar2.K;
            qcVar2.k1();
            qcVar2.g1(false);
        } else {
            qcVar.K = !qcVar.K;
            qcVar.k1();
        }
        qcVar.b1(qcVar.K, true);
        qcVar.g1(false);
        org.telegram.ui.ActionBar.n6.Dm++;
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
        if (this.d && this.f51183s != -1) {
            themedColor = -1;
        } else {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.n6.A8);
        }
        kVar.setTitleColor(themedColor);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        if (!this.d || this.f51183s == -1) {
            i7 = getThemedColor(org.telegram.ui.ActionBar.n6.f29731v8);
        }
        kVar2.I(i7, false);
    }

    public void C0() {
        B0();
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.n6.f29674s8));
        }
        org.telegram.ui.Components.ck0 ck0Var = this.N;
        if (ck0Var != null && this.d) {
            ck0Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.n6.f29337a7));
        }
        FrameLayout frameLayout = this.P;
        if (frameLayout != null) {
            frameLayout.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.n6.f29337a7));
        }
    }

    public final void D0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qc.D0():void");
    }

    public void E0() {
        org.telegram.ui.Components.ck0 ck0Var = new org.telegram.ui.Components.ck0(getParentActivity(), this.resourceProvider);
        this.N = ck0Var;
        ck0Var.setSections(false);
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
        return getMessagesController().f25805x5;
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
                return a02.documents.get(0).f28409id;
            }
        }
        return j3;
    }

    public int L0() {
        return 2131752401;
    }

    public int M0() {
        return getMessagesController().f25785v5;
    }

    public int N0() {
        return 2131752402;
    }

    public int O0() {
        return 0;
    }

    public int P0() {
        return 3;
    }

    public int Q0() {
        return getMessagesController().f25776u5;
    }

    public int R0() {
        return 2131752309;
    }

    public int S0() {
        return 0;
    }

    public int T0() {
        return 0;
    }

    public int U0() {
        return 2131752252;
    }

    public int V0() {
        return getMessagesController().f25795w5;
    }

    public int W0() {
        return 2131752253;
    }

    public final boolean X0() {
        if (this.f51166e == this.f51168f && this.h == this.f51176n && this.f51181r == this.f51183s && this.f51188w == this.f51190x && org.telegram.messenger.n5.a(this.f51192y, this.E) && org.telegram.messenger.f4.v(this.F, this.G)) {
            return false;
        }
        return true;
    }

    public boolean Y0() {
        return false;
    }

    public final int Z0() {
        org.telegram.messenger.bp d;
        org.telegram.messenger.bp bpVar = null;
        int i7 = 0;
        if (this.f51166e != this.f51168f) {
            org.telegram.messenger.cp cpVar = getMessagesController().f25767t4;
            if (cpVar == null) {
                d = null;
            } else {
                d = cpVar.d(this.f51168f);
            }
            if (d != null) {
                i7 = Math.max(0, d.l(this.d));
            }
        }
        if (this.h != this.f51176n) {
            i7 = Math.max(i7, getMessagesController().f25768t5);
        }
        if (this.f51181r != this.f51183s) {
            org.telegram.messenger.cp cpVar2 = getMessagesController().f25775u4;
            if (cpVar2 != null) {
                bpVar = cpVar2.d(this.f51183s);
            }
            if (bpVar != null) {
                i7 = Math.max(i7, bpVar.l(this.d));
            }
        }
        if (this.f51188w != this.f51190x) {
            i7 = Math.max(i7, Q0());
        }
        if (!org.telegram.messenger.n5.a(this.f51192y, this.E)) {
            i7 = Math.max(i7, M0());
        }
        if (!org.telegram.messenger.f4.v(this.F, this.G)) {
            return Math.max(i7, V0());
        }
        return i7;
    }

    public final void b1(boolean z10, boolean z11) {
        int i7;
        if (this.f51180q0 != z10) {
            this.f51180q0 = z10;
            int i10 = 0;
            if (z11) {
                org.telegram.ui.Components.mh0 mh0Var = this.L;
                if (z10) {
                    i10 = mh0Var.f37486e[0];
                }
                mh0Var.P(i10);
                org.telegram.ui.Components.mh0 mh0Var2 = this.L;
                if (mh0Var2 != null) {
                    mh0Var2.start();
                    return;
                }
                return;
            }
            if (z10) {
                i7 = this.L.f37486e[0] - 1;
            } else {
                i7 = 0;
            }
            this.L.N(i7, false, true);
            this.L.P(i7);
            org.telegram.ui.ActionBar.r0 r0Var = this.M;
            if (r0Var != null) {
                r0Var.invalidate();
            }
        }
    }

    public final void c1() {
        if (getVisibleDialog() != null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
        String M0 = org.telegram.messenger.gd.M0(2131752415, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
        u1Var.S = M0;
        u1Var.U = org.telegram.messenger.gd.M0(2131752414, null);
        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131751358, null), new org.telegram.ui.ActionBar.r1(this) {
            public final qc f53765b;

            {
                this.f53765b = this;
            }

            @Override
            public final void h(org.telegram.ui.ActionBar.u1 u1Var2, int i7) {
                switch (r2) {
                    case 0:
                        this.f53765b.finishFragment();
                        return;
                    default:
                        this.f53765b.D0();
                        return;
                }
            }
        });
        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131754214, null), new org.telegram.ui.ActionBar.r1(this) {
            public final qc f53765b;

            {
                this.f53765b = this;
            }

            @Override
            public final void h(org.telegram.ui.ActionBar.u1 u1Var2, int i7) {
                switch (r2) {
                    case 0:
                        this.f53765b.finishFragment();
                        return;
                    default:
                        this.f53765b.D0();
                        return;
                }
            }
        });
        showDialog(u1Var);
        org.telegram.ui.ActionBar.u6.U((TextView) u1Var.d(-2), org.telegram.ui.ActionBar.n6.f29635q7, getResourceProvider());
    }

    @Override
    public View createView(Context context) {
        org.telegram.ui.ActionBar.r0 d;
        float f10;
        org.telegram.messenger.mp messagesController = getMessagesController();
        long j3 = -this.f51159a;
        TLRPC.Chat O0 = messagesController.O0(Long.valueOf(j3));
        if (O0 != null) {
            int F = org.telegram.messenger.v3.F(O0);
            this.f51168f = F;
            this.f51166e = F;
            long G = org.telegram.messenger.v3.G(O0);
            this.f51176n = G;
            this.h = G;
            int I = org.telegram.messenger.v3.I(O0);
            this.f51183s = I;
            this.f51181r = I;
            long J = org.telegram.messenger.v3.J(O0);
            this.f51190x = J;
            this.f51188w = J;
            TLRPC.EmojiStatus emojiStatus = O0.emoji_status;
            this.E = emojiStatus;
            this.f51192y = emojiStatus;
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
        org.telegram.ui.ActionBar.a5 a5Var = this.simpleActionBar;
        if (a5Var != null) {
            a5Var.setBackButtonImage(2131231240);
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131752416, null));
            this.simpleActionBar.setActionBarMenuOnItemClick(x7Var);
        } else {
            this.actionBar.setBackButtonImage(2131231240);
            this.actionBar.setTitle(org.telegram.messenger.gd.M0(2131752416, null));
            this.actionBar.setActionBarMenuOnItemClick(x7Var);
        }
        org.telegram.ui.Components.mh0 mh0Var = new org.telegram.ui.Components.mh0(2131624241, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
        this.L = mh0Var;
        mh0Var.h = true;
        if (!this.K) {
            mh0Var.P(0);
            this.L.M(0);
        } else {
            mh0Var.M(35);
            this.L.P(36);
        }
        this.L.f37480a0 = true;
        int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.J9, this.resourceProvider);
        this.L.Q(w02, "Sunny");
        this.L.Q(w02, "Path 6");
        this.L.Q(w02, "Path");
        this.L.Q(w02, "Path 5");
        org.telegram.ui.ActionBar.a5 a5Var2 = this.simpleActionBar;
        if (a5Var2 != null) {
            org.telegram.ui.ActionBar.g5 t6 = a5Var2.t();
            org.telegram.ui.Components.mh0 mh0Var2 = this.L;
            t6.getClass();
            d = t6.c(1, 0, null, mh0Var2, org.telegram.messenger.g0.L(48.0f), null);
        } else {
            d = this.actionBar.t().d(1, this.L);
        }
        this.M = d;
        FrameLayout frameLayout = new FrameLayout(context);
        j1();
        E0();
        if (!this.d) {
            setHasOwnBackground(true);
            this.N.setSectionsDrawBackground(true);
        } else {
            this.N.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.n6.f29337a7));
        }
        org.telegram.ui.Components.ck0 ck0Var = this.N;
        dc dcVar = new dc(this);
        this.O = dcVar;
        ck0Var.setAdapter(dcVar);
        new v4.t(3);
        this.N.setLayoutManager(new v4.c0());
        org.telegram.ui.Components.ck0 ck0Var2 = this.N;
        if (this.d) {
            f10 = 68.0f;
        } else {
            f10 = 0.0f;
        }
        frameLayout.addView(ck0Var2, c8.ma.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, f10));
        this.N.setOnItemClickListener(new fi.g4(4, this, P0));
        v4.k kVar = new v4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.lr.h);
        kVar.C = false;
        kVar.f59152m = false;
        this.N.setItemAnimator(kVar);
        hi.d dVar = new hi.d(context, this.resourceProvider, true);
        dVar.setRoundRadius(24);
        this.Q = dVar;
        dVar.i(org.telegram.messenger.gd.M0(2131754216, null), false, true);
        this.Q.setOnClickListener(new a(this, 11));
        e1(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.P = frameLayout2;
        if (this.d) {
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29337a7, frameLayout2, getResourceProvider());
        } else {
            frameLayout2.setBackground(getBaseSimpleGlass().b(this.P));
        }
        this.P.addView(this.Q, c8.ma.d(-1, 48.0f, 80, 10.0f, 10.0f, 10.0f, 10.0f));
        frameLayout.addView(this.P, c8.ma.e(-1, 68, 80));
        setBulletinDelegate(new y8(this, 1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d1(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        if (tL_premium_boostsStatus != null) {
            TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(-this.f51159a));
            this.f51163c = tL_premium_boostsStatus;
            int i7 = tL_premium_boostsStatus.level;
            this.f51161b = i7;
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
        int i11 = org.telegram.messenger.ks.f25181r3;
        long j3 = this.f51159a;
        if (i7 == i11) {
            if (j3 == ((Long) objArr[2]).longValue()) {
                d1((TL_stories.TL_premium_boostsStatus) objArr[0]);
            }
        } else if (i7 == org.telegram.messenger.ks.X2) {
            if (!((Boolean) objArr[1]).booleanValue()) {
                getMessagesController().I0().a(j3, new vb(this, 2));
            }
        } else if (i7 == org.telegram.messenger.ks.f25226y1 && j3 == ((Long) objArr[0]).longValue()) {
            org.telegram.ui.ActionBar.s4 s4Var = this.parentLayout;
            if (s4Var != null && s4Var.getLastFragment() == this) {
                finishFragment();
            } else {
                removeSelfFromStack();
            }
        }
    }

    public void e1(boolean z10) {
        if (this.Q != null && this.f51163c != null) {
            int Z0 = Z0();
            if (this.f51161b >= Z0) {
                this.Q.g(null, z10);
                return;
            }
            if (this.J == null) {
                this.J = new SpannableStringBuilder("l");
                org.telegram.ui.Components.lq lqVar = new org.telegram.ui.Components.lq(2131231977, 0);
                lqVar.f37197n = 1;
                this.J.setSpan(lqVar, 0, 1, 33);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.J).append((CharSequence) org.telegram.messenger.gd.G(Z0, "BoostLevelRequired", new Object[0]));
            this.Q.g(spannableStringBuilder, z10);
        }
    }

    public void g1(boolean z10) {
        int themedColor;
        org.telegram.ui.ActionBar.a5 a5Var = this.simpleActionBar;
        if (a5Var != null) {
            a5Var.updateColors();
        } else {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            int i7 = -1;
            if (this.d && this.f51183s != -1) {
                themedColor = -1;
            } else {
                themedColor = getThemedColor(org.telegram.ui.ActionBar.n6.A8);
            }
            kVar.setTitleColor(themedColor);
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            if (!this.d || this.f51183s == -1) {
                i7 = getThemedColor(org.telegram.ui.ActionBar.n6.f29731v8);
            }
            kVar2.I(i7, false);
            this.actionBar.G(getThemedColor(org.telegram.ui.ActionBar.n6.f29692t8), false);
        }
        if (!z10) {
            this.O.f();
            org.telegram.messenger.g0.d0(this.N, new fi.e(this));
            if (this.d) {
                this.P.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.n6.f29337a7));
            }
            this.Q.updateColors();
            setNavigationBarColor(getNavigationBarColor());
        }
    }

    @Override
    public final org.telegram.ui.Components.ck0 getListViewForSimpleGlass() {
        if (!this.d) {
            return this.N;
        }
        return null;
    }

    public final void h1(boolean z10) {
        org.telegram.messenger.fj messageObject;
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
                    messageObject.f23939e1 = this.f51168f;
                    messageObject.f23944f1 = this.f51176n;
                    cells[i7].setAvatar(messageObject);
                    cells[i7].invalidate();
                }
            }
            Drawable f10 = hi.w5.f(this.I, this.currentAccount, this.G, this.K);
            this.I = f10;
            baVar.setOverrideBackground(f10);
        }
        if (F02 instanceof im0) {
            ((im0) F02).a(this.f51168f, z10);
        } else if (F02 instanceof hc) {
            ((hc) F02).a(this.f51168f, z10);
        }
        if (F03 instanceof ec) {
            ec ecVar = (ec) F03;
            ecVar.a(this.currentAccount, this.f51168f, true);
            ecVar.c(this.f51176n, false, z10);
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
        View F0 = F0(this.f51160a0);
        View F02 = F0(this.f51164c0);
        View F03 = F0(this.f51165d0);
        View F04 = F0(this.f51170g0);
        View F05 = F0(this.f51172i0);
        View F06 = F0(this.f51174k0);
        if (F0 instanceof jc) {
            TLRPC.EmojiStatus emojiStatus = this.E;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                jc jcVar = (jc) F0;
                ic icVar = jcVar.f48934b;
                org.telegram.messenger.bp a10 = org.telegram.messenger.bp.a(emojiStatus);
                icVar.c(a10, true);
                jcVar.f48933a.c(a10, true);
                icVar.d(((TLRPC.TL_emojiStatusCollectible) this.E).pattern_document_id, true, true);
            } else {
                jc jcVar2 = (jc) F0;
                ic icVar2 = jcVar2.f48934b;
                int i7 = this.f51183s;
                icVar2.b(i7, true);
                jcVar2.f48933a.b(jcVar2.h.currentAccount, i7, true);
                icVar2.d(this.f51190x, false, true);
            }
            jc jcVar3 = (jc) F0;
            ic icVar3 = jcVar3.f48934b;
            icVar3.e(org.telegram.messenger.n5.f(this.E), false, true);
            icVar3.a(this.f51168f);
            jcVar3.updateColors();
        }
        if (F02 instanceof im0) {
            ((im0) F02).a(this.f51183s, true);
        } else if (F02 instanceof hc) {
            ((hc) F02).a(this.f51168f, true);
        }
        if (F03 instanceof ec) {
            ec ecVar = (ec) F03;
            ecVar.a(this.currentAccount, this.f51183s, false);
            ecVar.c(this.f51190x, false, true);
        }
        if (F04 instanceof ec) {
            TLRPC.EmojiStatus emojiStatus2 = this.E;
            if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                ((ec) F04).b(org.telegram.messenger.bp.a(emojiStatus2));
            } else {
                ((ec) F04).a(this.currentAccount, this.f51183s, false);
            }
            ((ec) F04).c(org.telegram.messenger.n5.f(this.E), org.telegram.messenger.n5.B(this.E), true);
        }
        boolean z10 = F05 instanceof ec;
        long j3 = this.f51159a;
        if (z10) {
            ec ecVar2 = (ec) F05;
            ecVar2.a(this.currentAccount, this.f51183s, false);
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
        if (X0() && this.f51161b >= Z0()) {
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
        this.f51160a0 = i7 + 5;
        this.f51164c0 = i7 + 6;
        int i10 = i7 + 8;
        this.S = i10;
        this.f51165d0 = i7 + 7;
        if (this.f51190x == 0 && this.f51183s < 0 && !(this.E instanceof TLRPC.TL_emojiStatusCollectible)) {
            int i11 = this.f51169f0;
            this.f51169f0 = -1;
            if (i11 >= 0 && (dcVar2 = this.O) != null) {
                dcVar2.s(i11);
                this.O.g(this.f51165d0);
            }
        } else {
            if (this.f51169f0 >= 0) {
                z10 = true;
            }
            this.S = i7 + 9;
            this.f51169f0 = i10;
            if (!z10 && (dcVar = this.O) != null) {
                dcVar.i(i10);
                this.O.g(this.f51165d0);
            }
        }
        int i12 = this.S;
        this.f51167e0 = i12;
        this.f51170g0 = i12 + 1;
        this.S = i12 + 3;
        this.f51171h0 = i12 + 2;
    }

    public final void k1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qc.k1():void");
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.f51161b >= Z0() && X0()) {
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
        getNotificationCenter().c(this, org.telegram.messenger.ks.X2);
        getNotificationCenter().c(this, org.telegram.messenger.ks.f25181r3);
        getNotificationCenter().c(this, org.telegram.messenger.ks.f25226y1);
        return super.onFragmentCreate();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.ks.X2);
        getNotificationCenter().n(this, org.telegram.messenger.ks.f25181r3);
        getNotificationCenter().n(this, org.telegram.messenger.ks.f25226y1);
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
        onInsets(bVar.f15889a, bVar.f15890b, bVar.f15891c, bVar.d);
    }

    @Override
    public final void setResourceProvider(org.telegram.ui.ActionBar.i6 i6Var) {
        this.f51182r0 = i6Var;
    }

    @Override
    public final boolean useSimpleActionBar() {
        return !this.d;
    }

    public void a1(int i7) {
    }
}
