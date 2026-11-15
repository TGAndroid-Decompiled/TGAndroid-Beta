package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class cm0 extends FrameLayout {
    public static final int f46188r0 = 0;
    public bm0 E;
    public final hm0 F;
    public View G;
    public boolean H;
    public boolean I;
    public TL_stars.TL_starGiftUnique J;
    public bi.o5 K;
    public TL_stars.StarGift L;
    public final ArrayList M;
    public final HashMap N;
    public final SpannableStringBuilder O;
    public final String P;
    public final String Q;
    public int R;
    public int S;
    public int T;
    public final int U;
    public int V;
    public int W;
    public final gm0 f46189a;
    public int f46190a0;
    public final tl0 f46191b;
    public int f46192b0;
    public final v4.s f46193c;
    public int f46194c0;
    public final vl0 d;
    public int f46195d0;
    public final ji.j f46196e;
    public int f46197e0;
    public fm0 f46198f;
    public int f46199f0;
    public int f46200g0;
    public int h;
    public int f46201h0;
    public int f46202i0;
    public int f46203j0;
    public int f46204k0;
    public int f46205l0;
    public final ArrayList m0;
    public long f46206n;
    public final int f46207n0;
    public int f46208o0;
    public zl0 f46209p0;
    public final im0 f46210q0;
    public TLRPC.TL_emojiStatusCollectible f46211r;
    public TLRPC.TL_peerColorCollectible f46212s;
    public final xl0 f46213w;
    public final View f46214x;
    public final View f46215y;

    public cm0(im0 im0Var, Context context, int i7) {
        super(context);
        int i10;
        this.f46210q0 = im0Var;
        this.f46196e = new ji.j(18, false);
        this.h = -1;
        this.f46206n = 0L;
        this.f46211r = null;
        this.f46212s = null;
        this.L = null;
        this.M = new ArrayList();
        this.N = new HashMap();
        this.R = -1;
        this.S = -1;
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.f46190a0 = -1;
        this.f46192b0 = -1;
        this.f46194c0 = -1;
        this.f46195d0 = -1;
        this.f46197e0 = -1;
        this.f46199f0 = -1;
        this.f46200g0 = 0;
        this.f46201h0 = -1;
        this.f46202i0 = -1;
        this.f46203j0 = -1;
        this.f46204k0 = -1;
        this.m0 = new ArrayList();
        this.f46207n0 = i7;
        d();
        Context context2 = getContext();
        org.telegram.ui.ActionBar.e6 resourceProvider = im0Var.getResourceProvider();
        dh.c cVar = im0Var.H;
        tl0 tl0Var = new tl0(this, context2, resourceProvider, i7);
        this.f46191b = tl0Var;
        tl0Var.setClipToPadding(false);
        tl0Var.setSections(true);
        ((v4.k) tl0Var.getItemAnimator()).f58564m = false;
        getContext();
        v4.s sVar = new v4.s(3);
        this.f46193c = sVar;
        sVar.O = new bi.y1(this, 15);
        tl0Var.i(new ai.h0(this, 8));
        tl0Var.setLayoutManager(sVar);
        vl0 vl0Var = new vl0(this, context, i7);
        this.d = vl0Var;
        tl0Var.setAdapter(vl0Var);
        tl0Var.setOnItemClickListener(new org.telegram.ui.Components.dl0(this, i7, 1));
        tl0Var.j(new wl0(this, i7));
        addView(tl0Var, c8.ja.c(-1.0f, -1));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.eq(2131232243, 0), 0, 1, 33);
        if (im0Var.f48084a) {
            i10 = 2131752435;
        } else {
            i10 = 2131743755;
        }
        String M0 = org.telegram.messenger.hd.M0(i10, null);
        this.P = M0;
        this.O = new SpannableStringBuilder(spannableStringBuilder).append((CharSequence) " ").append((CharSequence) M0);
        this.Q = org.telegram.messenger.hd.M0(2131743754, null);
        f(false);
        v4.k kVar = new v4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.er.h);
        kVar.C = false;
        kVar.f58564m = false;
        tl0Var.setItemAnimator(kVar);
        View view = new View(getContext());
        this.f46214x = view;
        dh.d dVar = new dh.d(cVar.c(view, null, false));
        dVar.b(-org.telegram.messenger.g0.L(24.0f), true);
        dVar.H = 220;
        view.setBackground(dVar);
        addView(view, c8.ja.e(-1, 72, 55));
        if (i7 == 0) {
            this.f46189a = new gm0(im0.k0(im0Var), 0L, getContext(), im0.l0(im0Var));
            j(false);
        } else {
            View view2 = new View(getContext());
            this.f46215y = view2;
            dh.d dVar2 = new dh.d(cVar.c(view2, null, false));
            dVar2.b(-org.telegram.messenger.g0.L(16.0f), false);
            view2.setBackground(dVar2);
            addView(view2, c8.ja.e(-1, 16, 55));
            xl0 xl0Var = new xl0(getContext(), im0.m0(im0Var), 3, 0L, im0.n0(im0Var));
            this.f46213w = xl0Var;
            xl0Var.setImportantForAccessibility(4);
            xl0Var.f32140x = im0Var;
            xl0Var.setClipToOutline(true);
            bg.p0 p0Var = bg.t0.f3332a;
            xl0Var.setOutlineProvider(new bg.r0(0, org.telegram.messenger.g0.L(16.0f)));
            addView(xl0Var, c8.ja.d(-1, -2.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        hm0 hm0Var = new hm0(getContext(), im0.o0(im0Var));
        this.F = hm0Var;
        fh.g c10 = im0Var.F.c(hm0Var, null, false);
        gh.e eVar = new gh.e(im0.p0(im0Var));
        eVar.f13313e = new g0.e(19);
        eVar.f(0, 0);
        eVar.e(0, 0);
        eVar.d(0, 0);
        c10.p(eVar);
        c10.r(org.telegram.messenger.g0.L(18.0f));
        c10.R.f11322e = true;
        hm0Var.I = c10;
        hm0Var.H = c10;
        hm0Var.G = new sl0(this, 0);
        hm0Var.setVisibility(4);
        addView(hm0Var, c8.ja.d(-1, 36.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        View view3 = this.f46189a;
        if (view3 != null) {
            addView(view3, c8.ja.e(-1, -2, 55));
        }
        g();
        k();
        setWillNotDraw(false);
    }

    public static void a(cm0 cm0Var) {
        int i7;
        tl0 tl0Var = cm0Var.f46191b;
        boolean z10 = cm0Var.I;
        if (z10) {
            tl0Var.C0();
        }
        cm0Var.e();
        if (z10 && (i7 = cm0Var.f46202i0) >= 0) {
            cm0Var.f46193c.h1(i7, cm0Var.f46210q0.f48093f);
            tl0Var.post(new sl0(cm0Var, 1));
        }
    }

    public final boolean b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cm0.b():boolean");
    }

    public final boolean c() {
        tl0 tl0Var = this.f46191b;
        if (tl0Var != null) {
            for (int i7 = 0; i7 < tl0Var.getChildCount(); i7++) {
                if (tl0Var.getChildAt(i7) instanceof org.telegram.ui.Components.pz) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void d() {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible;
        int i7 = this.f46207n0;
        im0 im0Var = this.f46210q0;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible = null;
        if (i7 == 0) {
            TLRPC.User f10 = im0Var.getUserConfig().f();
            this.h = org.telegram.messenger.q10.l(f10);
            this.f46206n = org.telegram.messenger.q10.m(f10);
            if (f10 != null) {
                TLRPC.EmojiStatus emojiStatus = f10.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                    this.f46211r = tL_emojiStatusCollectible;
                    this.f46212s = null;
                }
            }
            tL_emojiStatusCollectible = null;
            this.f46211r = tL_emojiStatusCollectible;
            this.f46212s = null;
        } else {
            TLRPC.User f11 = im0Var.getUserConfig().f();
            this.h = org.telegram.messenger.q10.e(f11);
            this.f46206n = org.telegram.messenger.q10.f(f11);
            this.f46211r = null;
            if (f11 != null) {
                TLRPC.PeerColor peerColor = f11.color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                }
            }
            this.f46212s = tL_peerColorCollectible;
        }
        if (this.f46211r == null && this.f46212s == null) {
            return;
        }
        this.h = -1;
        this.f46206n = 0L;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.F && !this.I) {
            return false;
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e() {
        k();
        this.d.f();
    }

    public final void f(boolean z10) {
        Object obj;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.J;
        im0 im0Var = this.f46210q0;
        ji.j jVar = this.f46196e;
        if (tL_starGiftUnique != null) {
            cg.a resellAmount = tL_starGiftUnique.getResellAmount(cg.b.f4987a);
            if (tL_starGiftUnique.resale_ton_only) {
                jVar.f17555b = di.mb.s1(di.mb.V0(org.telegram.messenger.hd.a0(null, null, 2131746146, tL_starGiftUnique.getResellAmount(cg.b.f4988b).d()), true), true);
                jVar.f17556c = di.mb.T0(org.telegram.messenger.hd.H(',', "ResellGiftBuyEq", (int) resellAmount.a()));
            } else {
                jVar.f17555b = di.mb.T0(org.telegram.messenger.hd.H(',', "ResellGiftBuy", (int) resellAmount.a()));
                jVar.f17556c = null;
            }
        } else {
            if (!im0Var.getUserConfig().q() && !im0Var.f48084a) {
                obj = this.O;
            } else if (this.f46211r != null) {
                obj = this.Q;
            } else {
                obj = this.P;
            }
            jVar.f17555b = obj;
            jVar.f17556c = null;
        }
        if (im0Var.H0() == this) {
            im0Var.S = this;
            im0Var.R.i((CharSequence) jVar.f17555b, z10, true);
            im0Var.R.g((SpannableStringBuilder) jVar.f17556c, z10);
        }
    }

    public final void g() {
        hi.d dVar = this.f46210q0.R;
        if (dVar != null) {
            dVar.updateColors();
        }
        xl0 xl0Var = this.f46213w;
        if (xl0Var != null) {
            xl0Var.invalidate();
        }
        j(true);
        org.telegram.messenger.g0.d0(this.f46191b, new r3(this, 16));
        hm0 hm0Var = this.F;
        if (hm0Var != null) {
            l(hm0Var);
        }
    }

    public final void h() {
        int i7;
        boolean z10;
        int i10 = this.f46210q0.f48093f;
        float f10 = 0.0f;
        View view = this.f46214x;
        hm0 hm0Var = this.F;
        if (hm0Var != null && (i7 = this.f46202i0) >= 0) {
            v4.s sVar = this.f46193c;
            this.G = sVar.m(i7);
            tl0 tl0Var = this.f46191b;
            int paddingTop = tl0Var.getPaddingTop() + i10;
            int L0 = sVar.L0();
            View view2 = this.G;
            if (view2 != null) {
                if (view2.getTop() <= paddingTop) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.I = z10;
                this.H = !z10;
                hm0Var.setVisibility(0);
                hm0Var.setTranslationY((Math.max(this.G.getTop(), paddingTop) + tl0Var.getTop()) - hm0Var.getTop());
            } else if (L0 != -1 && L0 > this.f46202i0) {
                this.I = true;
                this.H = false;
                hm0Var.setVisibility(0);
                hm0Var.setTranslationY((tl0Var.getTop() + paddingTop) - hm0Var.getTop());
            } else {
                this.I = false;
                this.H = false;
                hm0Var.setVisibility(0);
                hm0Var.setTranslationY((org.telegram.messenger.g0.L(1.0f) + getHeight()) - hm0Var.getTop());
            }
            boolean z11 = this.H;
            if (hm0Var.J != z11) {
                hm0Var.J = z11;
                hm0Var.invalidate();
            }
            if (this.I) {
                f10 = org.telegram.messenger.g0.L(36.0f) + i10;
            }
            view.setTranslationY(f10);
            tl0Var.invalidate();
            invalidate();
            return;
        }
        this.H = false;
        this.I = false;
        if (view != null) {
            view.setTranslationY(0.0f);
        }
        if (hm0Var != null) {
            hm0Var.setVisibility(4);
            boolean z12 = this.H;
            if (hm0Var.J != z12) {
                hm0Var.J = z12;
                hm0Var.invalidate();
            }
        }
    }

    public final void i() {
        org.telegram.messenger.gj messageObject;
        xl0 xl0Var = this.f46213w;
        if (xl0Var != null) {
            org.telegram.ui.Cells.q1[] cells = xl0Var.getCells();
            for (int i7 = 0; i7 < cells.length; i7++) {
                org.telegram.ui.Cells.q1 q1Var = cells[i7];
                if (q1Var != null && (messageObject = q1Var.getMessageObject()) != null) {
                    messageObject.f23865w1 = true;
                    fm0 fm0Var = this.f46198f;
                    if (fm0Var != null) {
                        messageObject.f23791e1 = fm0Var.getColorId();
                    }
                    messageObject.f23796f1 = this.f46206n;
                    messageObject.f23801g1 = this.f46212s;
                    cells[i7].setAvatar(messageObject);
                    cells[i7].invalidate();
                }
            }
        }
    }

    public final void j(boolean z10) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        boolean z11;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        boolean z12;
        int i7;
        im0 im0Var;
        nl0 nl0Var;
        fm0 fm0Var = this.f46198f;
        if (fm0Var != null) {
            fm0Var.a(this.h, z10);
        }
        gm0 gm0Var = this.f46189a;
        if (gm0Var != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.f46211r;
            if (tL_emojiStatusCollectible != null) {
                gm0Var.e(tL_emojiStatusCollectible.document_id, true, z10);
                gm0Var.c(org.telegram.messenger.cp.a(this.f46211r), z10);
                gm0Var.d(this.f46211r.pattern_document_id, true, z10);
            } else {
                long j3 = 0;
                if (org.telegram.messenger.m5.A()) {
                    gm0Var.e(0L, false, z10);
                } else {
                    TLRPC.User a22 = org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24934t0).a2(0L);
                    if (a22 != null) {
                        j3 = org.telegram.messenger.m5.f(a22.emoji_status);
                    }
                    gm0Var.e(j3, org.telegram.messenger.m5.A(), z10);
                }
                gm0Var.b(this.h, z10);
                gm0Var.d(this.f46206n, false, z10);
            }
        }
        int i10 = this.f46207n0;
        if (i10 == 0 && (nl0Var = (im0Var = this.f46210q0).f48091e) != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = this.f46211r;
            if (tL_emojiStatusCollectible2 != null) {
                nl0Var.c(org.telegram.messenger.cp.a(tL_emojiStatusCollectible2), z10);
            } else {
                nl0Var.b(im0.A0(im0Var), this.h, z10);
            }
        }
        if (i10 == 0) {
            int i11 = this.W;
            k();
            vl0 vl0Var = this.d;
            if (i11 >= 0 && this.W < 0) {
                vl0Var.p(i11, 2);
            } else if (i11 < 0 && (i7 = this.W) >= 0) {
                vl0Var.o(i7, 2);
            }
        }
        int i12 = 0;
        while (true) {
            tl0 tl0Var = this.f46191b;
            if (i12 < tl0Var.getChildCount()) {
                View childAt = tl0Var.getChildAt(i12);
                if (childAt instanceof rl0) {
                    rl0 rl0Var = (rl0) childAt;
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible3 = this.f46211r;
                    if ((tL_emojiStatusCollectible3 != null && tL_emojiStatusCollectible3.collectible_id == rl0Var.getGiftId()) || ((tL_peerColorCollectible2 = this.f46212s) != null && tL_peerColorCollectible2.collectible_id == rl0Var.getGiftId())) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    rl0Var.b(z12, true);
                } else if (childAt instanceof bi.i2) {
                    bi.i2 i2Var = (bi.i2) childAt;
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible4 = this.f46211r;
                    if ((tL_emojiStatusCollectible4 != null && tL_emojiStatusCollectible4.collectible_id == i2Var.getGiftId()) || ((tL_peerColorCollectible = this.f46212s) != null && tL_peerColorCollectible.collectible_id == i2Var.getGiftId())) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    i2Var.f(z11, true);
                }
                i12++;
            } else {
                return;
            }
        }
    }

    public final void k() {
        di.m8 m8Var;
        im0 im0Var = this.f46210q0;
        di.m8 m8Var2 = im0Var.f48086b;
        this.W = -1;
        this.f46190a0 = -1;
        this.f46192b0 = -1;
        this.f46194c0 = -1;
        this.f46197e0 = -1;
        this.f46199f0 = -1;
        this.f46195d0 = -1;
        this.f46201h0 = -1;
        this.f46202i0 = -1;
        this.f46203j0 = -1;
        this.f46204k0 = -1;
        this.f46200g0 = 0;
        ArrayList arrayList = this.m0;
        arrayList.clear();
        this.R = 0;
        this.T = 1;
        int i7 = 3;
        this.f46205l0 = 3;
        this.S = 2;
        int i10 = this.f46207n0;
        if (i10 == 0 && (this.h >= 0 || this.f46211r != null || this.f46212s != null)) {
            this.W = 3;
            this.f46205l0 = 5;
            this.f46190a0 = 4;
        }
        if (i10 == 1) {
            m8Var = im0Var.f48088c;
        } else {
            m8Var = m8Var2;
        }
        if ((i10 == 0 || i10 == 1) && m8Var != null) {
            ArrayList arrayList2 = m8Var.f9051l;
            int i11 = this.f46205l0;
            this.f46205l0 = i11 + 1;
            this.f46202i0 = i11;
            if (this.L == null) {
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) arrayList2.get(i12)).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        arrayList.add((TL_stars.TL_starGiftUnique) starGift);
                    }
                }
                int i13 = this.f46205l0;
                this.f46194c0 = i13;
                this.f46205l0 = arrayList.size() + i13;
                int size = arrayList.size() + this.f46200g0;
                this.f46200g0 = size;
                int i14 = this.f46205l0;
                this.f46195d0 = i14;
                if (!m8Var2.f9048i && m8Var2.f9049j) {
                    if (arrayList.isEmpty()) {
                        int i15 = this.f46205l0;
                        this.f46204k0 = i15;
                        this.f46205l0 = i15 + 2;
                        this.f46203j0 = i15 + 1;
                    }
                } else {
                    this.f46197e0 = i14;
                    int i16 = 3 - (size % 3);
                    if (size <= 0) {
                        i7 = 9;
                    } else if (i16 > 0) {
                        i7 = i16;
                    }
                    int i17 = i14 + i7;
                    this.f46205l0 = i17;
                    this.f46200g0 = size + i7;
                    this.f46199f0 = i17;
                }
                if (c()) {
                    m8Var.a();
                }
            } else if (this.K != null) {
                long e10 = org.telegram.messenger.m10.i(im0.z0(im0Var)).e();
                for (int i18 = 0; i18 < this.K.d.size(); i18++) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.K.d.get(i18);
                    if (org.telegram.messenger.m5.o(tL_starGiftUnique.owner_id) != e10 && org.telegram.messenger.m5.o(tL_starGiftUnique.host_id) != e10) {
                        arrayList.add(tL_starGiftUnique);
                    }
                }
                int i19 = this.f46205l0;
                this.f46194c0 = i19;
                this.f46205l0 = arrayList.size() + i19;
                int size2 = arrayList.size() + this.f46200g0;
                this.f46200g0 = size2;
                int i20 = this.f46205l0;
                this.f46195d0 = i20;
                bi.o5 o5Var = this.K;
                if (o5Var.f3771t || !o5Var.f3772u) {
                    this.f46197e0 = i20;
                    int i21 = 3 - (size2 % 3);
                    if (size2 <= 0) {
                        i7 = 9;
                    } else if (i21 > 0) {
                        i7 = i21;
                    }
                    int i22 = i20 + i7;
                    this.f46205l0 = i22;
                    this.f46200g0 = size2 + i7;
                    this.f46199f0 = i22;
                }
                if (c()) {
                    this.K.g(false);
                }
            }
            int i23 = this.f46205l0;
            this.f46205l0 = i23 + 1;
            this.f46201h0 = i23;
        }
        int i24 = this.f46205l0;
        this.f46205l0 = i24 + 1;
        this.V = i24;
        hm0 hm0Var = this.F;
        if (hm0Var != null) {
            hm0Var.post(new sl0(this, 1));
        }
    }

    public final void l(hm0 hm0Var) {
        int i7;
        int i10 = org.telegram.ui.ActionBar.j6.f28849d6;
        im0 im0Var = this.f46210q0;
        int themedColor = im0Var.getThemedColor(i10);
        im0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f28792a7);
        int themedColor2 = im0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f29260z6);
        int themedColor3 = im0Var.getThemedColor(org.telegram.ui.ActionBar.j6.G6);
        hm0Var.f47748w.setColor(themedColor);
        hm0Var.f47750y = org.telegram.ui.ActionBar.j6.r1(0.06f, themedColor3);
        hm0Var.E = themedColor2;
        hm0Var.F = themedColor3;
        ct ctVar = hm0Var.f47740a;
        for (int i11 = 0; i11 < ctVar.getChildCount(); i11++) {
            View childAt = ctVar.getChildAt(i11);
            int R = RecyclerView.R(childAt);
            if (R != -1 && (childAt instanceof TextView)) {
                TextView textView = (TextView) childAt;
                if (R == hm0Var.d) {
                    i7 = hm0Var.F;
                } else {
                    i7 = hm0Var.E;
                }
                textView.setTextColor(i7);
                childAt.invalidate();
            }
        }
        ctVar.invalidate();
        hm0Var.invalidate();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11 = this.f46207n0;
        View view = this.f46214x;
        tl0 tl0Var = this.f46191b;
        if (i11 == 1) {
            super.onMeasure(i7, i10);
            xl0 xl0Var = this.f46213w;
            this.f46208o0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + xl0Var.getMeasuredHeight() + org.telegram.messenger.g0.f23603m;
            ((ViewGroup.MarginLayoutParams) xl0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f23603m;
            ((ViewGroup.MarginLayoutParams) tl0Var.getLayoutParams()).topMargin = this.f46208o0 - org.telegram.messenger.g0.L(16.0f);
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.f46208o0 - org.telegram.messenger.g0.L(64.0f);
            ((ViewGroup.MarginLayoutParams) this.f46215y.getLayoutParams()).topMargin = this.f46208o0 - org.telegram.messenger.g0.L(16.0f);
            tl0Var.setPadding(tl0Var.getPaddingLeft(), org.telegram.messenger.g0.L(16.0f), tl0Var.getPaddingRight(), tl0Var.getPaddingBottom());
        } else {
            this.f46208o0 = org.telegram.messenger.g0.L(230.0f) + org.telegram.messenger.g0.f23603m;
            ((ViewGroup.MarginLayoutParams) tl0Var.getLayoutParams()).topMargin = this.f46208o0;
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.f46208o0 - org.telegram.messenger.g0.L(64.0f);
            ((ViewGroup.MarginLayoutParams) this.f46189a.getLayoutParams()).height = this.f46208o0;
        }
        super.onMeasure(i7, i10);
    }
}
