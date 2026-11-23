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
public class qc extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.fs {
    public TLRPC.EmojiStatus E;
    public TLRPC.WallPaper F;
    public TLRPC.WallPaper G;
    public TLRPC.WallPaper H;
    public Drawable I;
    public SpannableStringBuilder J;
    public boolean K;
    public org.telegram.ui.Components.nh0 L;
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
    public final long f51401a;
    public int f51402a0;
    public int f51403b;
    public int f51404b0;
    public TL_stories.TL_premium_boostsStatus f51405c;
    public int f51406c0;
    public boolean d;
    public int f51407d0;
    public int f51408e;
    public int f51409e0;
    public int f51410f;
    public int f51411f0;
    public int f51412g0;
    public long h;
    public int f51413h0;
    public int f51414i0;
    public int f51415j0;
    public int f51416k0;
    public int f51417l0;
    public org.telegram.ui.ActionBar.g2 m0;
    public long f51418n;
    public bc f51419n0;
    public float f51420o0;
    public ValueAnimator f51421p0;
    public boolean f51422q0;
    public int f51423r;
    public org.telegram.ui.ActionBar.i6 f51424r0;
    public int f51425s;
    public final SparseIntArray f51426s0;
    public final org.telegram.ui.ActionBar.u4 f51427t0;
    public final org.telegram.ui.ActionBar.u4 f51428u0;
    public final org.telegram.ui.ActionBar.u4 f51429v0;
    public long f51430w;
    public final org.telegram.ui.ActionBar.u4 f51431w0;
    public long f51432x;
    public final Drawable f51433x0;
    public TLRPC.EmojiStatus f51434y;
    public final Drawable f51435y0;
    public final Paint f51436z0;

    public qc(long j3) {
        super(null);
        boolean q10 = org.telegram.ui.ActionBar.n6.I.q();
        this.K = q10;
        this.S = 0;
        this.f51422q0 = q10;
        this.f51426s0 = new SparseIntArray();
        Paint paint = new Paint(1);
        this.f51436z0 = paint;
        paint.setStrokeWidth(1.0f);
        paint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29452d7, this.resourceProvider));
        this.f51433x0 = org.telegram.messenger.t0.f27013b.getDrawable(2131232096).mutate();
        this.f51435y0 = org.telegram.messenger.t0.f27013b.getDrawable(2131232182).mutate();
        this.f51401a = j3;
        TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(-j3));
        if (O0 != null) {
            this.f51403b = O0.level;
        }
        org.telegram.messenger.mp.u1(this.currentAccount).I0().a(j3, new ki.n2(11, this, O0));
        this.resourceProvider = new pc(this);
        this.f51427t0 = new org.telegram.ui.ActionBar.u4(0, false, false, this.resourceProvider);
        this.f51428u0 = new org.telegram.ui.ActionBar.u4(0, false, true, this.resourceProvider);
        this.f51429v0 = new org.telegram.ui.ActionBar.u4(0, true, false, this.resourceProvider);
        this.f51431w0 = new org.telegram.ui.ActionBar.u4(0, true, true, this.resourceProvider);
    }

    public static void Z(qc qcVar) {
        org.telegram.ui.ActionBar.i6 i6Var = qcVar.resourceProvider;
        if (i6Var instanceof pc) {
            qc qcVar2 = ((pc) i6Var).f50967a;
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
        } else if (view instanceof org.telegram.ui.Cells.m8) {
            ((org.telegram.ui.Cells.m8) view).updateColors();
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
        if (this.d && this.f51425s != -1) {
            themedColor = -1;
        } else {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.n6.A8);
        }
        kVar.setTitleColor(themedColor);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        if (!this.d || this.f51425s == -1) {
            i7 = getThemedColor(org.telegram.ui.ActionBar.n6.f29788v8);
        }
        kVar2.F(i7, false);
    }

    public void C0() {
        B0();
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.n6.f29731s8));
        }
        org.telegram.ui.Components.ek0 ek0Var = this.N;
        if (ek0Var != null && this.d) {
            ek0Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.n6.f29394a7));
        }
        FrameLayout frameLayout = this.P;
        if (frameLayout != null) {
            frameLayout.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.n6.f29394a7));
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
        return getMessagesController().f25900x5;
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
                return a02.documents.get(0).f28498id;
            }
        }
        return j3;
    }

    public int L0() {
        return 2131752400;
    }

    public int M0() {
        return getMessagesController().f25880v5;
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
        return getMessagesController().f25871u5;
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
        return getMessagesController().f25890w5;
    }

    public int W0() {
        return 2131752252;
    }

    public final boolean X0() {
        if (this.f51408e == this.f51410f && this.h == this.f51418n && this.f51423r == this.f51425s && this.f51430w == this.f51432x && org.telegram.messenger.n5.a(this.f51434y, this.E) && org.telegram.messenger.f4.v(this.F, this.G)) {
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
        if (this.f51408e != this.f51410f) {
            org.telegram.messenger.cp cpVar = getMessagesController().f25862t4;
            if (cpVar == null) {
                d = null;
            } else {
                d = cpVar.d(this.f51410f);
            }
            if (d != null) {
                i7 = Math.max(0, d.l(this.d));
            }
        }
        if (this.h != this.f51418n) {
            i7 = Math.max(i7, getMessagesController().f25863t5);
        }
        if (this.f51423r != this.f51425s) {
            org.telegram.messenger.cp cpVar2 = getMessagesController().f25870u4;
            if (cpVar2 != null) {
                bpVar = cpVar2.d(this.f51425s);
            }
            if (bpVar != null) {
                i7 = Math.max(i7, bpVar.l(this.d));
            }
        }
        if (this.f51430w != this.f51432x) {
            i7 = Math.max(i7, Q0());
        }
        if (!org.telegram.messenger.n5.a(this.f51434y, this.E)) {
            i7 = Math.max(i7, M0());
        }
        if (!org.telegram.messenger.f4.v(this.F, this.G)) {
            return Math.max(i7, V0());
        }
        return i7;
    }

    public final void b1(boolean z10, boolean z11) {
        int i7;
        if (this.f51422q0 != z10) {
            this.f51422q0 = z10;
            int i10 = 0;
            if (z11) {
                org.telegram.ui.Components.nh0 nh0Var = this.L;
                if (z10) {
                    i10 = nh0Var.f37805e[0];
                }
                nh0Var.P(i10);
                org.telegram.ui.Components.nh0 nh0Var2 = this.L;
                if (nh0Var2 != null) {
                    nh0Var2.start();
                    return;
                }
                return;
            }
            if (z10) {
                i7 = this.L.f37805e[0] - 1;
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
        String N0 = org.telegram.messenger.gd.N0(2131752414, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
        t1Var.S = N0;
        t1Var.U = org.telegram.messenger.gd.N0(2131752413, null);
        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131751357, null), new org.telegram.ui.ActionBar.q1(this) {
            public final qc f53905b;

            {
                this.f53905b = this;
            }

            @Override
            public final void i(org.telegram.ui.ActionBar.t1 t1Var2, int i7) {
                switch (r2) {
                    case 0:
                        this.f53905b.finishFragment();
                        return;
                    default:
                        this.f53905b.D0();
                        return;
                }
            }
        });
        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131754213, null), new org.telegram.ui.ActionBar.q1(this) {
            public final qc f53905b;

            {
                this.f53905b = this;
            }

            @Override
            public final void i(org.telegram.ui.ActionBar.t1 t1Var2, int i7) {
                switch (r2) {
                    case 0:
                        this.f53905b.finishFragment();
                        return;
                    default:
                        this.f53905b.D0();
                        return;
                }
            }
        });
        showDialog(t1Var);
        org.telegram.ui.ActionBar.u6.U((TextView) t1Var.d(-2), org.telegram.ui.ActionBar.n6.f29692q7, getResourceProvider());
    }

    @Override
    public View createView(Context context) {
        org.telegram.ui.ActionBar.q0 d;
        float f10;
        org.telegram.messenger.mp messagesController = getMessagesController();
        long j3 = -this.f51401a;
        TLRPC.Chat O0 = messagesController.O0(Long.valueOf(j3));
        if (O0 != null) {
            int F = org.telegram.messenger.v3.F(O0);
            this.f51410f = F;
            this.f51408e = F;
            long G = org.telegram.messenger.v3.G(O0);
            this.f51418n = G;
            this.h = G;
            int I = org.telegram.messenger.v3.I(O0);
            this.f51425s = I;
            this.f51423r = I;
            long J = org.telegram.messenger.v3.J(O0);
            this.f51432x = J;
            this.f51430w = J;
            TLRPC.EmojiStatus emojiStatus = O0.emoji_status;
            this.E = emojiStatus;
            this.f51434y = emojiStatus;
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
        y7 y7Var = new y7(this, 6);
        org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
        if (z4Var != null) {
            z4Var.setBackButtonImage(2131231243);
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131752415, null));
            this.simpleActionBar.setActionBarMenuOnItemClick(y7Var);
        } else {
            this.actionBar.setBackButtonImage(2131231243);
            this.actionBar.setTitle(org.telegram.messenger.gd.N0(2131752415, null));
            this.actionBar.setActionBarMenuOnItemClick(y7Var);
        }
        org.telegram.ui.Components.nh0 nh0Var = new org.telegram.ui.Components.nh0(2131624241, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
        this.L = nh0Var;
        nh0Var.h = true;
        if (!this.K) {
            nh0Var.P(0);
            this.L.M(0);
        } else {
            nh0Var.M(35);
            this.L.P(36);
        }
        this.L.f37799a0 = true;
        int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.J9, this.resourceProvider);
        this.L.Q(w02, "Sunny");
        this.L.Q(w02, "Path 6");
        this.L.Q(w02, "Path");
        this.L.Q(w02, "Path 5");
        org.telegram.ui.ActionBar.z4 z4Var2 = this.simpleActionBar;
        if (z4Var2 != null) {
            org.telegram.ui.ActionBar.f5 t6 = z4Var2.t();
            org.telegram.ui.Components.nh0 nh0Var2 = this.L;
            t6.getClass();
            d = t6.c(1, 0, null, nh0Var2, org.telegram.messenger.g0.L(48.0f), null);
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
            this.N.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.n6.f29394a7));
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
        frameLayout.addView(ek0Var2, c8.na.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, f10));
        this.N.setOnItemClickListener(new fi.g4(4, this, P0));
        v4.l lVar = new v4.l();
        lVar.n(350L);
        lVar.o(org.telegram.ui.Components.kr.h);
        lVar.C = false;
        lVar.f59274m = false;
        this.N.setItemAnimator(lVar);
        hi.e eVar = new hi.e(context, this.resourceProvider, true);
        eVar.setRoundRadius(24);
        this.Q = eVar;
        eVar.i(org.telegram.messenger.gd.N0(2131754215, null), false, true);
        this.Q.setOnClickListener(new a(this, 11));
        e1(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.P = frameLayout2;
        if (this.d) {
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29394a7, frameLayout2, getResourceProvider());
        } else {
            frameLayout2.setBackground(getBaseSimpleGlass().b(this.P));
        }
        this.P.addView(this.Q, c8.na.d(-1, 48.0f, 80, 10.0f, 10.0f, 10.0f, 10.0f));
        frameLayout.addView(this.P, c8.na.e(-1, 68, 80));
        setBulletinDelegate(new z8(this, 1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d1(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        if (tL_premium_boostsStatus != null) {
            TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(-this.f51401a));
            this.f51405c = tL_premium_boostsStatus;
            int i7 = tL_premium_boostsStatus.level;
            this.f51403b = i7;
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
        int i11 = org.telegram.messenger.ks.f25280r3;
        long j3 = this.f51401a;
        if (i7 == i11) {
            if (j3 == ((Long) objArr[2]).longValue()) {
                d1((TL_stories.TL_premium_boostsStatus) objArr[0]);
            }
        } else if (i7 == org.telegram.messenger.ks.X2) {
            if (!((Boolean) objArr[1]).booleanValue()) {
                getMessagesController().I0().a(j3, new vb(this, 2));
            }
        } else if (i7 == org.telegram.messenger.ks.f25325y1 && j3 == ((Long) objArr[0]).longValue()) {
            org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
            if (r4Var != null && r4Var.getLastFragment() == this) {
                finishFragment();
            } else {
                removeSelfFromStack();
            }
        }
    }

    public void e1(boolean z10) {
        if (this.Q != null && this.f51405c != null) {
            int Z0 = Z0();
            if (this.f51403b >= Z0) {
                this.Q.g(null, z10);
                return;
            }
            if (this.J == null) {
                this.J = new SpannableStringBuilder("l");
                org.telegram.ui.Components.kq kqVar = new org.telegram.ui.Components.kq(2131231980, 0);
                kqVar.f36852n = 1;
                this.J.setSpan(kqVar, 0, 1, 33);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.J).append((CharSequence) org.telegram.messenger.gd.G(Z0, "BoostLevelRequired", new Object[0]));
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
            if (this.d && this.f51425s != -1) {
                themedColor = -1;
            } else {
                themedColor = getThemedColor(org.telegram.ui.ActionBar.n6.A8);
            }
            kVar.setTitleColor(themedColor);
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            if (!this.d || this.f51425s == -1) {
                i7 = getThemedColor(org.telegram.ui.ActionBar.n6.f29788v8);
            }
            kVar2.F(i7, false);
            this.actionBar.E(getThemedColor(org.telegram.ui.ActionBar.n6.f29749t8), false);
        }
        if (!z10) {
            this.O.f();
            org.telegram.messenger.g0.d0(this.N, new fi.e(this));
            if (this.d) {
                this.P.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.n6.f29394a7));
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
                    messageObject.f24047e1 = this.f51410f;
                    messageObject.f24052f1 = this.f51418n;
                    cells[i7].setAvatar(messageObject);
                    cells[i7].invalidate();
                }
            }
            Drawable f10 = hi.f6.f(this.I, this.currentAccount, this.G, this.K);
            this.I = f10;
            baVar.setOverrideBackground(f10);
        }
        if (F02 instanceof gm0) {
            ((gm0) F02).a(this.f51410f, z10);
        } else if (F02 instanceof hc) {
            ((hc) F02).a(this.f51410f, z10);
        }
        if (F03 instanceof ec) {
            ec ecVar = (ec) F03;
            ecVar.a(this.currentAccount, this.f51410f, true);
            ecVar.c(this.f51418n, false, z10);
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
        View F0 = F0(this.f51402a0);
        View F02 = F0(this.f51406c0);
        View F03 = F0(this.f51407d0);
        View F04 = F0(this.f51412g0);
        View F05 = F0(this.f51414i0);
        View F06 = F0(this.f51416k0);
        if (F0 instanceof jc) {
            TLRPC.EmojiStatus emojiStatus = this.E;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                jc jcVar = (jc) F0;
                ic icVar = jcVar.f49086b;
                org.telegram.messenger.bp a10 = org.telegram.messenger.bp.a(emojiStatus);
                icVar.c(a10, true);
                jcVar.f49085a.c(a10, true);
                icVar.d(((TLRPC.TL_emojiStatusCollectible) this.E).pattern_document_id, true, true);
            } else {
                jc jcVar2 = (jc) F0;
                ic icVar2 = jcVar2.f49086b;
                int i7 = this.f51425s;
                icVar2.b(i7, true);
                jcVar2.f49085a.b(jcVar2.h.currentAccount, i7, true);
                icVar2.d(this.f51432x, false, true);
            }
            jc jcVar3 = (jc) F0;
            ic icVar3 = jcVar3.f49086b;
            icVar3.e(org.telegram.messenger.n5.f(this.E), false, true);
            icVar3.a(this.f51410f);
            jcVar3.updateColors();
        }
        if (F02 instanceof gm0) {
            ((gm0) F02).a(this.f51425s, true);
        } else if (F02 instanceof hc) {
            ((hc) F02).a(this.f51410f, true);
        }
        if (F03 instanceof ec) {
            ec ecVar = (ec) F03;
            ecVar.a(this.currentAccount, this.f51425s, false);
            ecVar.c(this.f51432x, false, true);
        }
        if (F04 instanceof ec) {
            TLRPC.EmojiStatus emojiStatus2 = this.E;
            if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                ((ec) F04).b(org.telegram.messenger.bp.a(emojiStatus2));
            } else {
                ((ec) F04).a(this.currentAccount, this.f51425s, false);
            }
            ((ec) F04).c(org.telegram.messenger.n5.f(this.E), org.telegram.messenger.n5.B(this.E), true);
        }
        boolean z10 = F05 instanceof ec;
        long j3 = this.f51401a;
        if (z10) {
            ec ecVar2 = (ec) F05;
            ecVar2.a(this.currentAccount, this.f51425s, false);
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
        if (X0() && this.f51403b >= Z0()) {
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
        this.f51402a0 = i7 + 5;
        this.f51406c0 = i7 + 6;
        int i10 = i7 + 8;
        this.S = i10;
        this.f51407d0 = i7 + 7;
        if (this.f51432x == 0 && this.f51425s < 0 && !(this.E instanceof TLRPC.TL_emojiStatusCollectible)) {
            int i11 = this.f51411f0;
            this.f51411f0 = -1;
            if (i11 >= 0 && (dcVar2 = this.O) != null) {
                dcVar2.s(i11);
                this.O.g(this.f51407d0);
            }
        } else {
            if (this.f51411f0 >= 0) {
                z10 = true;
            }
            this.S = i7 + 9;
            this.f51411f0 = i10;
            if (!z10 && (dcVar = this.O) != null) {
                dcVar.i(i10);
                this.O.g(this.f51407d0);
            }
        }
        int i12 = this.S;
        this.f51409e0 = i12;
        this.f51412g0 = i12 + 1;
        this.S = i12 + 3;
        this.f51413h0 = i12 + 2;
    }

    public final void k1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qc.k1():void");
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.f51403b >= Z0() && X0()) {
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
        getNotificationCenter().c(this, org.telegram.messenger.ks.f25280r3);
        getNotificationCenter().c(this, org.telegram.messenger.ks.f25325y1);
        return super.onFragmentCreate();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.ks.X2);
        getNotificationCenter().n(this, org.telegram.messenger.ks.f25280r3);
        getNotificationCenter().n(this, org.telegram.messenger.ks.f25325y1);
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
        onInsets(bVar.f15978a, bVar.f15979b, bVar.f15980c, bVar.d);
    }

    @Override
    public final void setResourceProvider(org.telegram.ui.ActionBar.i6 i6Var) {
        this.f51424r0 = i6Var;
    }

    @Override
    public final boolean useSimpleActionBar() {
        return !this.d;
    }

    public void a1(int i7) {
    }
}
