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
public final class bm0 extends FrameLayout {
    public static final int f44428q0 = 0;
    public am0 D;
    public final gm0 E;
    public View F;
    public boolean G;
    public boolean H;
    public TL_stars.TL_starGiftUnique I;
    public zh.b3 J;
    public TL_stars.StarGift K;
    public final ArrayList L;
    public final HashMap M;
    public final SpannableStringBuilder N;
    public final String O;
    public final String P;
    public int Q;
    public int R;
    public int S;
    public final int T;
    public int U;
    public int V;
    public int W;
    public final fm0 f44429a;
    public int f44430a0;
    public final sl0 f44431b;
    public int f44432b0;
    public final v4.s f44433c;
    public int f44434c0;
    public final ul0 d;
    public int f44435d0;
    public final j2.n f44436e;
    public int f44437e0;
    public em0 f44438f;
    public int f44439f0;
    public int f44440g0;
    public int h;
    public int f44441h0;
    public int f44442i0;
    public int f44443j0;
    public int f44444k0;
    public final ArrayList f44445l0;
    public final int m0;
    public long f44446n;
    public int f44447n0;
    public yl0 f44448o0;
    public final hm0 f44449p0;
    public TLRPC.TL_emojiStatusCollectible f44450r;
    public TLRPC.TL_peerColorCollectible f44451s;
    public final wl0 f44452w;
    public final View f44453x;
    public final View f44454y;

    public bm0(hm0 hm0Var, Context context, int i7) {
        super(context);
        int i10;
        this.f44449p0 = hm0Var;
        this.f44436e = new j2.n(20, false);
        this.h = -1;
        this.f44446n = 0L;
        this.f44450r = null;
        this.f44451s = null;
        this.K = null;
        this.L = new ArrayList();
        this.M = new HashMap();
        this.Q = -1;
        this.R = -1;
        this.S = -1;
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.f44430a0 = -1;
        this.f44432b0 = -1;
        this.f44434c0 = -1;
        this.f44435d0 = -1;
        this.f44437e0 = -1;
        this.f44439f0 = 0;
        this.f44440g0 = -1;
        this.f44441h0 = -1;
        this.f44442i0 = -1;
        this.f44443j0 = -1;
        this.f44445l0 = new ArrayList();
        this.m0 = i7;
        d();
        Context context2 = getContext();
        org.telegram.ui.ActionBar.f6 resourceProvider = hm0Var.getResourceProvider();
        dh.c cVar = hm0Var.G;
        sl0 sl0Var = new sl0(this, context2, resourceProvider, i7);
        this.f44431b = sl0Var;
        sl0Var.setClipToPadding(false);
        sl0Var.setSections(true);
        ((v4.k) sl0Var.getItemAnimator()).f57070m = false;
        getContext();
        v4.s sVar = new v4.s(3);
        this.f44433c = sVar;
        sVar.O = new ai.l(this, 12);
        sl0Var.i(new fi.o1(this, 7));
        sl0Var.setLayoutManager(sVar);
        ul0 ul0Var = new ul0(this, context, i7);
        this.d = ul0Var;
        sl0Var.setAdapter(ul0Var);
        sl0Var.setOnItemClickListener(new org.telegram.ui.Components.yk0(this, i7, 1));
        sl0Var.j(new vl0(this, i7));
        addView(sl0Var, c8.ha.c(-1.0f, -1));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.wp(2131232242, 0), 0, 1, 33);
        if (hm0Var.f46448a) {
            i10 = 2131752435;
        } else {
            i10 = 2131743758;
        }
        String M0 = org.telegram.messenger.id.M0(i10, null);
        this.O = M0;
        this.N = new SpannableStringBuilder(spannableStringBuilder).append((CharSequence) " ").append((CharSequence) M0);
        this.P = org.telegram.messenger.id.M0(2131743757, null);
        f(false);
        v4.k kVar = new v4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.xq.h);
        kVar.C = false;
        kVar.f57070m = false;
        sl0Var.setItemAnimator(kVar);
        View view = new View(getContext());
        this.f44453x = view;
        dh.d dVar = new dh.d(cVar.c(view, null, false));
        dVar.b(-org.telegram.messenger.g0.L(24.0f), true);
        dVar.G = 220;
        view.setBackground(dVar);
        addView(view, c8.ha.e(-1, 72, 55));
        if (i7 == 0) {
            this.f44429a = new fm0(hm0.k0(hm0Var), 0L, getContext(), hm0.l0(hm0Var));
            j(false);
        } else {
            View view2 = new View(getContext());
            this.f44454y = view2;
            dh.d dVar2 = new dh.d(cVar.c(view2, null, false));
            dVar2.b(-org.telegram.messenger.g0.L(16.0f), false);
            view2.setBackground(dVar2);
            addView(view2, c8.ha.e(-1, 16, 55));
            wl0 wl0Var = new wl0(getContext(), hm0.m0(hm0Var), 3, 0L, hm0.n0(hm0Var));
            this.f44452w = wl0Var;
            wl0Var.setImportantForAccessibility(4);
            wl0Var.f31001x = hm0Var;
            wl0Var.setClipToOutline(true);
            bg.q0 q0Var = bg.u0.f3380a;
            wl0Var.setOutlineProvider(new bg.s0(0, org.telegram.messenger.g0.L(16.0f)));
            addView(wl0Var, c8.ha.d(-1, -2.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        gm0 gm0Var = new gm0(getContext(), hm0.o0(hm0Var));
        this.E = gm0Var;
        fh.g c10 = hm0Var.E.c(gm0Var, null, false);
        gh.e eVar = new gh.e(hm0.p0(hm0Var));
        eVar.f13971e = new g2.c(17);
        eVar.f(0, 0);
        eVar.e(0, 0);
        eVar.d(0, 0);
        c10.p(eVar);
        c10.r(org.telegram.messenger.g0.L(18.0f));
        c10.Q.f11508e = true;
        gm0Var.H = c10;
        gm0Var.G = c10;
        gm0Var.F = new rl0(this, 0);
        gm0Var.setVisibility(4);
        addView(gm0Var, c8.ha.d(-1, 36.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        View view3 = this.f44429a;
        if (view3 != null) {
            addView(view3, c8.ha.e(-1, -2, 55));
        }
        g();
        k();
        setWillNotDraw(false);
    }

    public static void a(bm0 bm0Var) {
        int i7;
        sl0 sl0Var = bm0Var.f44431b;
        boolean z9 = bm0Var.H;
        if (z9) {
            sl0Var.C0();
        }
        bm0Var.e();
        if (z9 && (i7 = bm0Var.f44441h0) >= 0) {
            bm0Var.f44433c.h1(i7, bm0Var.f44449p0.f46456f);
            sl0Var.post(new rl0(bm0Var, 1));
        }
    }

    public final boolean b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bm0.b():boolean");
    }

    public final boolean c() {
        sl0 sl0Var = this.f44431b;
        if (sl0Var != null) {
            for (int i7 = 0; i7 < sl0Var.getChildCount(); i7++) {
                if (sl0Var.getChildAt(i7) instanceof org.telegram.ui.Components.mz) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void d() {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible;
        int i7 = this.m0;
        hm0 hm0Var = this.f44449p0;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible = null;
        if (i7 == 0) {
            TLRPC.User f10 = hm0Var.getUserConfig().f();
            this.h = org.telegram.messenger.t10.l(f10);
            this.f44446n = org.telegram.messenger.t10.m(f10);
            if (f10 != null) {
                TLRPC.EmojiStatus emojiStatus = f10.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                    this.f44450r = tL_emojiStatusCollectible;
                    this.f44451s = null;
                }
            }
            tL_emojiStatusCollectible = null;
            this.f44450r = tL_emojiStatusCollectible;
            this.f44451s = null;
        } else {
            TLRPC.User f11 = hm0Var.getUserConfig().f();
            this.h = org.telegram.messenger.t10.e(f11);
            this.f44446n = org.telegram.messenger.t10.f(f11);
            this.f44450r = null;
            if (f11 != null) {
                TLRPC.PeerColor peerColor = f11.color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                }
            }
            this.f44451s = tL_peerColorCollectible;
        }
        if (this.f44450r == null && this.f44451s == null) {
            return;
        }
        this.h = -1;
        this.f44446n = 0L;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.E && !this.H) {
            return false;
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e() {
        k();
        this.d.f();
    }

    public final void f(boolean z9) {
        Object obj;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.I;
        hm0 hm0Var = this.f44449p0;
        j2.n nVar = this.f44436e;
        if (tL_starGiftUnique != null) {
            cg.a resellAmount = tL_starGiftUnique.getResellAmount(cg.b.f6162a);
            if (tL_starGiftUnique.resale_ton_only) {
                nVar.f16456b = bi.dd.s1(bi.dd.V0(org.telegram.messenger.id.a0(null, null, 2131746149, tL_starGiftUnique.getResellAmount(cg.b.f6163b).d()), true), true);
                nVar.f16457c = bi.dd.T0(org.telegram.messenger.id.H(',', "ResellGiftBuyEq", (int) resellAmount.a()));
            } else {
                nVar.f16456b = bi.dd.T0(org.telegram.messenger.id.H(',', "ResellGiftBuy", (int) resellAmount.a()));
                nVar.f16457c = null;
            }
        } else {
            if (!hm0Var.getUserConfig().q() && !hm0Var.f46448a) {
                obj = this.N;
            } else if (this.f44450r != null) {
                obj = this.P;
            } else {
                obj = this.O;
            }
            nVar.f16456b = obj;
            nVar.f16457c = null;
        }
        if (hm0Var.H0() == this) {
            hm0Var.R = this;
            hm0Var.Q.i((CharSequence) nVar.f16456b, z9, true);
            hm0Var.Q.g((SpannableStringBuilder) nVar.f16457c, z9);
        }
    }

    public final void g() {
        fi.d dVar = this.f44449p0.Q;
        if (dVar != null) {
            dVar.updateColors();
        }
        wl0 wl0Var = this.f44452w;
        if (wl0Var != null) {
            wl0Var.invalidate();
        }
        j(true);
        org.telegram.messenger.g0.d0(this.f44431b, new r3(this, 16));
        gm0 gm0Var = this.E;
        if (gm0Var != null) {
            l(gm0Var);
        }
    }

    public final void h() {
        int i7;
        boolean z9;
        int i10 = this.f44449p0.f46456f;
        float f10 = 0.0f;
        View view = this.f44453x;
        gm0 gm0Var = this.E;
        if (gm0Var != null && (i7 = this.f44441h0) >= 0) {
            v4.s sVar = this.f44433c;
            this.F = sVar.m(i7);
            sl0 sl0Var = this.f44431b;
            int paddingTop = sl0Var.getPaddingTop() + i10;
            int L0 = sVar.L0();
            View view2 = this.F;
            if (view2 != null) {
                if (view2.getTop() <= paddingTop) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                this.H = z9;
                this.G = !z9;
                gm0Var.setVisibility(0);
                gm0Var.setTranslationY((Math.max(this.F.getTop(), paddingTop) + sl0Var.getTop()) - gm0Var.getTop());
            } else if (L0 != -1 && L0 > this.f44441h0) {
                this.H = true;
                this.G = false;
                gm0Var.setVisibility(0);
                gm0Var.setTranslationY((sl0Var.getTop() + paddingTop) - gm0Var.getTop());
            } else {
                this.H = false;
                this.G = false;
                gm0Var.setVisibility(0);
                gm0Var.setTranslationY((org.telegram.messenger.g0.L(1.0f) + getHeight()) - gm0Var.getTop());
            }
            boolean z10 = this.G;
            if (gm0Var.I != z10) {
                gm0Var.I = z10;
                gm0Var.invalidate();
            }
            if (this.H) {
                f10 = org.telegram.messenger.g0.L(36.0f) + i10;
            }
            view.setTranslationY(f10);
            sl0Var.invalidate();
            invalidate();
            return;
        }
        this.G = false;
        this.H = false;
        if (view != null) {
            view.setTranslationY(0.0f);
        }
        if (gm0Var != null) {
            gm0Var.setVisibility(4);
            boolean z11 = this.G;
            if (gm0Var.I != z11) {
                gm0Var.I = z11;
                gm0Var.invalidate();
            }
        }
    }

    public final void i() {
        org.telegram.messenger.ij messageObject;
        wl0 wl0Var = this.f44452w;
        if (wl0Var != null) {
            org.telegram.ui.Cells.q1[] cells = wl0Var.getCells();
            for (int i7 = 0; i7 < cells.length; i7++) {
                org.telegram.ui.Cells.q1 q1Var = cells[i7];
                if (q1Var != null && (messageObject = q1Var.getMessageObject()) != null) {
                    messageObject.f23301u1 = true;
                    em0 em0Var = this.f44438f;
                    if (em0Var != null) {
                        messageObject.f23228c1 = em0Var.getColorId();
                    }
                    messageObject.f23232d1 = this.f44446n;
                    messageObject.f23236e1 = this.f44451s;
                    cells[i7].setAvatar(messageObject);
                    cells[i7].invalidate();
                }
            }
        }
    }

    public final void j(boolean z9) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        boolean z10;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        boolean z11;
        int i7;
        hm0 hm0Var;
        ml0 ml0Var;
        em0 em0Var = this.f44438f;
        if (em0Var != null) {
            em0Var.a(this.h, z9);
        }
        fm0 fm0Var = this.f44429a;
        if (fm0Var != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.f44450r;
            if (tL_emojiStatusCollectible != null) {
                fm0Var.e(tL_emojiStatusCollectible.document_id, true, z9);
                fm0Var.c(org.telegram.messenger.fp.a(this.f44450r), z9);
                fm0Var.d(this.f44450r.pattern_document_id, true, z9);
            } else {
                long j3 = 0;
                if (org.telegram.messenger.m5.A()) {
                    fm0Var.e(0L, false, z9);
                } else {
                    TLRPC.User a22 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24470s0).a2(0L);
                    if (a22 != null) {
                        j3 = org.telegram.messenger.m5.f(a22.emoji_status);
                    }
                    fm0Var.e(j3, org.telegram.messenger.m5.A(), z9);
                }
                fm0Var.b(this.h, z9);
                fm0Var.d(this.f44446n, false, z9);
            }
        }
        int i10 = this.m0;
        if (i10 == 0 && (ml0Var = (hm0Var = this.f44449p0).f46455e) != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = this.f44450r;
            if (tL_emojiStatusCollectible2 != null) {
                ml0Var.c(org.telegram.messenger.fp.a(tL_emojiStatusCollectible2), z9);
            } else {
                ml0Var.b(hm0.A0(hm0Var), this.h, z9);
            }
        }
        if (i10 == 0) {
            int i11 = this.V;
            k();
            ul0 ul0Var = this.d;
            if (i11 >= 0 && this.V < 0) {
                ul0Var.p(i11, 2);
            } else if (i11 < 0 && (i7 = this.V) >= 0) {
                ul0Var.o(i7, 2);
            }
        }
        int i12 = 0;
        while (true) {
            sl0 sl0Var = this.f44431b;
            if (i12 < sl0Var.getChildCount()) {
                View childAt = sl0Var.getChildAt(i12);
                if (childAt instanceof ql0) {
                    ql0 ql0Var = (ql0) childAt;
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible3 = this.f44450r;
                    if ((tL_emojiStatusCollectible3 != null && tL_emojiStatusCollectible3.collectible_id == ql0Var.getGiftId()) || ((tL_peerColorCollectible2 = this.f44451s) != null && tL_peerColorCollectible2.collectible_id == ql0Var.getGiftId())) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    ql0Var.b(z11, true);
                } else if (childAt instanceof zh.y0) {
                    zh.y0 y0Var = (zh.y0) childAt;
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible4 = this.f44450r;
                    if ((tL_emojiStatusCollectible4 != null && tL_emojiStatusCollectible4.collectible_id == y0Var.getGiftId()) || ((tL_peerColorCollectible = this.f44451s) != null && tL_peerColorCollectible.collectible_id == y0Var.getGiftId())) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    y0Var.f(z10, true);
                }
                i12++;
            } else {
                return;
            }
        }
    }

    public final void k() {
        bi.v9 v9Var;
        hm0 hm0Var = this.f44449p0;
        bi.v9 v9Var2 = hm0Var.f46450b;
        this.V = -1;
        this.W = -1;
        this.f44430a0 = -1;
        this.f44432b0 = -1;
        this.f44435d0 = -1;
        this.f44437e0 = -1;
        this.f44434c0 = -1;
        this.f44440g0 = -1;
        this.f44441h0 = -1;
        this.f44442i0 = -1;
        this.f44443j0 = -1;
        this.f44439f0 = 0;
        ArrayList arrayList = this.f44445l0;
        arrayList.clear();
        this.Q = 0;
        this.S = 1;
        int i7 = 3;
        this.f44444k0 = 3;
        this.R = 2;
        int i10 = this.m0;
        if (i10 == 0 && (this.h >= 0 || this.f44450r != null || this.f44451s != null)) {
            this.V = 3;
            this.f44444k0 = 5;
            this.W = 4;
        }
        if (i10 == 1) {
            v9Var = hm0Var.f46452c;
        } else {
            v9Var = v9Var2;
        }
        if ((i10 == 0 || i10 == 1) && v9Var != null) {
            ArrayList arrayList2 = v9Var.f4915l;
            int i11 = this.f44444k0;
            this.f44444k0 = i11 + 1;
            this.f44441h0 = i11;
            if (this.K == null) {
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) arrayList2.get(i12)).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        arrayList.add((TL_stars.TL_starGiftUnique) starGift);
                    }
                }
                int i13 = this.f44444k0;
                this.f44432b0 = i13;
                this.f44444k0 = arrayList.size() + i13;
                int size = arrayList.size() + this.f44439f0;
                this.f44439f0 = size;
                int i14 = this.f44444k0;
                this.f44434c0 = i14;
                if (!v9Var2.f4912i && v9Var2.f4913j) {
                    if (arrayList.isEmpty()) {
                        int i15 = this.f44444k0;
                        this.f44443j0 = i15;
                        this.f44444k0 = i15 + 2;
                        this.f44442i0 = i15 + 1;
                    }
                } else {
                    this.f44435d0 = i14;
                    int i16 = 3 - (size % 3);
                    if (size <= 0) {
                        i7 = 9;
                    } else if (i16 > 0) {
                        i7 = i16;
                    }
                    int i17 = i14 + i7;
                    this.f44444k0 = i17;
                    this.f44439f0 = size + i7;
                    this.f44437e0 = i17;
                }
                if (c()) {
                    v9Var.a();
                }
            } else if (this.J != null) {
                long e10 = org.telegram.messenger.p10.i(hm0.z0(hm0Var)).e();
                for (int i18 = 0; i18 < this.J.d.size(); i18++) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.J.d.get(i18);
                    if (org.telegram.messenger.m5.o(tL_starGiftUnique.owner_id) != e10 && org.telegram.messenger.m5.o(tL_starGiftUnique.host_id) != e10) {
                        arrayList.add(tL_starGiftUnique);
                    }
                }
                int i19 = this.f44444k0;
                this.f44432b0 = i19;
                this.f44444k0 = arrayList.size() + i19;
                int size2 = arrayList.size() + this.f44439f0;
                this.f44439f0 = size2;
                int i20 = this.f44444k0;
                this.f44434c0 = i20;
                zh.b3 b3Var = this.J;
                if (b3Var.f60250t || !b3Var.f60251u) {
                    this.f44435d0 = i20;
                    int i21 = 3 - (size2 % 3);
                    if (size2 <= 0) {
                        i7 = 9;
                    } else if (i21 > 0) {
                        i7 = i21;
                    }
                    int i22 = i20 + i7;
                    this.f44444k0 = i22;
                    this.f44439f0 = size2 + i7;
                    this.f44437e0 = i22;
                }
                if (c()) {
                    this.J.g(false);
                }
            }
            int i23 = this.f44444k0;
            this.f44444k0 = i23 + 1;
            this.f44440g0 = i23;
        }
        int i24 = this.f44444k0;
        this.f44444k0 = i24 + 1;
        this.U = i24;
        gm0 gm0Var = this.E;
        if (gm0Var != null) {
            gm0Var.post(new rl0(this, 1));
        }
    }

    public final void l(gm0 gm0Var) {
        int i7;
        int i10 = org.telegram.ui.ActionBar.k6.f27852d6;
        hm0 hm0Var = this.f44449p0;
        int themedColor = hm0Var.getThemedColor(i10);
        hm0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f27796a7);
        int themedColor2 = hm0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f28262z6);
        int themedColor3 = hm0Var.getThemedColor(org.telegram.ui.ActionBar.k6.G6);
        gm0Var.f46038w.setColor(themedColor);
        gm0Var.f46040y = org.telegram.ui.ActionBar.k6.r1(0.06f, themedColor3);
        gm0Var.D = themedColor2;
        gm0Var.E = themedColor3;
        zs zsVar = gm0Var.f46030a;
        for (int i11 = 0; i11 < zsVar.getChildCount(); i11++) {
            View childAt = zsVar.getChildAt(i11);
            int R = RecyclerView.R(childAt);
            if (R != -1 && (childAt instanceof TextView)) {
                TextView textView = (TextView) childAt;
                if (R == gm0Var.d) {
                    i7 = gm0Var.E;
                } else {
                    i7 = gm0Var.D;
                }
                textView.setTextColor(i7);
                childAt.invalidate();
            }
        }
        zsVar.invalidate();
        gm0Var.invalidate();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11 = this.m0;
        View view = this.f44453x;
        sl0 sl0Var = this.f44431b;
        if (i11 == 1) {
            super.onMeasure(i7, i10);
            wl0 wl0Var = this.f44452w;
            this.f44447n0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + wl0Var.getMeasuredHeight() + org.telegram.messenger.g0.f22557m;
            ((ViewGroup.MarginLayoutParams) wl0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22557m;
            ((ViewGroup.MarginLayoutParams) sl0Var.getLayoutParams()).topMargin = this.f44447n0 - org.telegram.messenger.g0.L(16.0f);
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.f44447n0 - org.telegram.messenger.g0.L(64.0f);
            ((ViewGroup.MarginLayoutParams) this.f44454y.getLayoutParams()).topMargin = this.f44447n0 - org.telegram.messenger.g0.L(16.0f);
            sl0Var.setPadding(sl0Var.getPaddingLeft(), org.telegram.messenger.g0.L(16.0f), sl0Var.getPaddingRight(), sl0Var.getPaddingBottom());
        } else {
            this.f44447n0 = org.telegram.messenger.g0.L(230.0f) + org.telegram.messenger.g0.f22557m;
            ((ViewGroup.MarginLayoutParams) sl0Var.getLayoutParams()).topMargin = this.f44447n0;
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.f44447n0 - org.telegram.messenger.g0.L(64.0f);
            ((ViewGroup.MarginLayoutParams) this.f44429a.getLayoutParams()).height = this.f44447n0;
        }
        super.onMeasure(i7, i10);
    }
}
