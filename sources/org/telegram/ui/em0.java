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
public final class em0 extends FrameLayout {
    public static final int f45380q0 = 0;
    public dm0 D;
    public final jm0 E;
    public View F;
    public boolean G;
    public boolean H;
    public TL_stars.TL_starGiftUnique I;
    public zh.c3 J;
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
    public final im0 f45381a;
    public int f45382a0;
    public final vl0 f45383b;
    public int f45384b0;
    public final v4.s f45385c;
    public int f45386c0;
    public final xl0 d;
    public int f45387d0;
    public final j2.n f45388e;
    public int f45389e0;
    public hm0 f45390f;
    public int f45391f0;
    public int f45392g0;
    public int h;
    public int f45393h0;
    public int f45394i0;
    public int f45395j0;
    public int f45396k0;
    public final ArrayList f45397l0;
    public final int m0;
    public long f45398n;
    public int f45399n0;
    public bm0 f45400o0;
    public final km0 f45401p0;
    public TLRPC.TL_emojiStatusCollectible f45402r;
    public TLRPC.TL_peerColorCollectible f45403s;
    public final zl0 f45404w;
    public final View f45405x;
    public final View f45406y;

    public em0(km0 km0Var, Context context, int i7) {
        super(context);
        int i10;
        this.f45401p0 = km0Var;
        this.f45388e = new j2.n(20, false);
        this.h = -1;
        this.f45398n = 0L;
        this.f45402r = null;
        this.f45403s = null;
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
        this.f45382a0 = -1;
        this.f45384b0 = -1;
        this.f45386c0 = -1;
        this.f45387d0 = -1;
        this.f45389e0 = -1;
        this.f45391f0 = 0;
        this.f45392g0 = -1;
        this.f45393h0 = -1;
        this.f45394i0 = -1;
        this.f45395j0 = -1;
        this.f45397l0 = new ArrayList();
        this.m0 = i7;
        d();
        Context context2 = getContext();
        org.telegram.ui.ActionBar.h6 resourceProvider = km0Var.getResourceProvider();
        dh.c cVar = km0Var.G;
        vl0 vl0Var = new vl0(this, context2, resourceProvider, i7);
        this.f45383b = vl0Var;
        vl0Var.setClipToPadding(false);
        vl0Var.setSections(true);
        ((v4.k) vl0Var.getItemAnimator()).f57079m = false;
        getContext();
        v4.s sVar = new v4.s(3);
        this.f45385c = sVar;
        sVar.O = new ai.l(this, 12);
        vl0Var.i(new fi.o1(this, 7));
        vl0Var.setLayoutManager(sVar);
        xl0 xl0Var = new xl0(this, context, i7);
        this.d = xl0Var;
        vl0Var.setAdapter(xl0Var);
        vl0Var.setOnItemClickListener(new org.telegram.ui.Components.yk0(this, i7, 1));
        vl0Var.j(new yl0(this, i7));
        addView(vl0Var, c8.ha.c(-1.0f, -1));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.wp(2131232242, 0), 0, 1, 33);
        if (km0Var.f47367a) {
            i10 = 2131752435;
        } else {
            i10 = 2131743755;
        }
        String M0 = org.telegram.messenger.id.M0(i10, null);
        this.O = M0;
        this.N = new SpannableStringBuilder(spannableStringBuilder).append((CharSequence) " ").append((CharSequence) M0);
        this.P = org.telegram.messenger.id.M0(2131743754, null);
        f(false);
        v4.k kVar = new v4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.wq.h);
        kVar.C = false;
        kVar.f57079m = false;
        vl0Var.setItemAnimator(kVar);
        View view = new View(getContext());
        this.f45405x = view;
        dh.d dVar = new dh.d(cVar.c(view, null, false));
        dVar.b(-org.telegram.messenger.g0.L(24.0f), true);
        dVar.G = 220;
        view.setBackground(dVar);
        addView(view, c8.ha.e(-1, 72, 55));
        if (i7 == 0) {
            this.f45381a = new im0(km0.k0(km0Var), 0L, getContext(), km0.l0(km0Var));
            j(false);
        } else {
            View view2 = new View(getContext());
            this.f45406y = view2;
            dh.d dVar2 = new dh.d(cVar.c(view2, null, false));
            dVar2.b(-org.telegram.messenger.g0.L(16.0f), false);
            view2.setBackground(dVar2);
            addView(view2, c8.ha.e(-1, 16, 55));
            zl0 zl0Var = new zl0(getContext(), km0.m0(km0Var), 3, 0L, km0.n0(km0Var));
            this.f45404w = zl0Var;
            zl0Var.setImportantForAccessibility(4);
            zl0Var.f31017x = km0Var;
            zl0Var.setClipToOutline(true);
            bg.q0 q0Var = bg.u0.f3380a;
            zl0Var.setOutlineProvider(new bg.s0(0, org.telegram.messenger.g0.L(16.0f)));
            addView(zl0Var, c8.ha.d(-1, -2.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        jm0 jm0Var = new jm0(getContext(), km0.o0(km0Var));
        this.E = jm0Var;
        fh.g c10 = km0Var.E.c(jm0Var, null, false);
        gh.e eVar = new gh.e(km0.p0(km0Var));
        eVar.f13973e = new g2.c(17);
        eVar.f(0, 0);
        eVar.e(0, 0);
        eVar.d(0, 0);
        c10.p(eVar);
        c10.r(org.telegram.messenger.g0.L(18.0f));
        c10.Q.f11513e = true;
        jm0Var.H = c10;
        jm0Var.G = c10;
        jm0Var.F = new ul0(this, 0);
        jm0Var.setVisibility(4);
        addView(jm0Var, c8.ha.d(-1, 36.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        View view3 = this.f45381a;
        if (view3 != null) {
            addView(view3, c8.ha.e(-1, -2, 55));
        }
        g();
        k();
        setWillNotDraw(false);
    }

    public static void a(em0 em0Var) {
        int i7;
        vl0 vl0Var = em0Var.f45383b;
        boolean z9 = em0Var.H;
        if (z9) {
            vl0Var.C0();
        }
        em0Var.e();
        if (z9 && (i7 = em0Var.f45393h0) >= 0) {
            em0Var.f45385c.h1(i7, em0Var.f45401p0.f47375f);
            vl0Var.post(new ul0(em0Var, 1));
        }
    }

    public final boolean b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.em0.b():boolean");
    }

    public final boolean c() {
        vl0 vl0Var = this.f45383b;
        if (vl0Var != null) {
            for (int i7 = 0; i7 < vl0Var.getChildCount(); i7++) {
                if (vl0Var.getChildAt(i7) instanceof org.telegram.ui.Components.lz) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void d() {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible;
        int i7 = this.m0;
        km0 km0Var = this.f45401p0;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible = null;
        if (i7 == 0) {
            TLRPC.User f10 = km0Var.getUserConfig().f();
            this.h = org.telegram.messenger.t10.l(f10);
            this.f45398n = org.telegram.messenger.t10.m(f10);
            if (f10 != null) {
                TLRPC.EmojiStatus emojiStatus = f10.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                    this.f45402r = tL_emojiStatusCollectible;
                    this.f45403s = null;
                }
            }
            tL_emojiStatusCollectible = null;
            this.f45402r = tL_emojiStatusCollectible;
            this.f45403s = null;
        } else {
            TLRPC.User f11 = km0Var.getUserConfig().f();
            this.h = org.telegram.messenger.t10.e(f11);
            this.f45398n = org.telegram.messenger.t10.f(f11);
            this.f45402r = null;
            if (f11 != null) {
                TLRPC.PeerColor peerColor = f11.color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                }
            }
            this.f45403s = tL_peerColorCollectible;
        }
        if (this.f45402r == null && this.f45403s == null) {
            return;
        }
        this.h = -1;
        this.f45398n = 0L;
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
        km0 km0Var = this.f45401p0;
        j2.n nVar = this.f45388e;
        if (tL_starGiftUnique != null) {
            cg.a resellAmount = tL_starGiftUnique.getResellAmount(cg.b.f6165a);
            if (tL_starGiftUnique.resale_ton_only) {
                nVar.f16456b = bi.dd.s1(bi.dd.V0(org.telegram.messenger.id.a0(null, null, 2131746146, tL_starGiftUnique.getResellAmount(cg.b.f6166b).d()), true), true);
                nVar.f16457c = bi.dd.T0(org.telegram.messenger.id.H(',', "ResellGiftBuyEq", (int) resellAmount.a()));
            } else {
                nVar.f16456b = bi.dd.T0(org.telegram.messenger.id.H(',', "ResellGiftBuy", (int) resellAmount.a()));
                nVar.f16457c = null;
            }
        } else {
            if (!km0Var.getUserConfig().q() && !km0Var.f47367a) {
                obj = this.N;
            } else if (this.f45402r != null) {
                obj = this.P;
            } else {
                obj = this.O;
            }
            nVar.f16456b = obj;
            nVar.f16457c = null;
        }
        if (km0Var.H0() == this) {
            km0Var.R = this;
            km0Var.Q.i((CharSequence) nVar.f16456b, z9, true);
            km0Var.Q.g((SpannableStringBuilder) nVar.f16457c, z9);
        }
    }

    public final void g() {
        fi.d dVar = this.f45401p0.Q;
        if (dVar != null) {
            dVar.updateColors();
        }
        zl0 zl0Var = this.f45404w;
        if (zl0Var != null) {
            zl0Var.invalidate();
        }
        j(true);
        org.telegram.messenger.g0.d0(this.f45383b, new r3(this, 16));
        jm0 jm0Var = this.E;
        if (jm0Var != null) {
            l(jm0Var);
        }
    }

    public final void h() {
        int i7;
        boolean z9;
        int i10 = this.f45401p0.f47375f;
        float f10 = 0.0f;
        View view = this.f45405x;
        jm0 jm0Var = this.E;
        if (jm0Var != null && (i7 = this.f45393h0) >= 0) {
            v4.s sVar = this.f45385c;
            this.F = sVar.m(i7);
            vl0 vl0Var = this.f45383b;
            int paddingTop = vl0Var.getPaddingTop() + i10;
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
                jm0Var.setVisibility(0);
                jm0Var.setTranslationY((Math.max(this.F.getTop(), paddingTop) + vl0Var.getTop()) - jm0Var.getTop());
            } else if (L0 != -1 && L0 > this.f45393h0) {
                this.H = true;
                this.G = false;
                jm0Var.setVisibility(0);
                jm0Var.setTranslationY((vl0Var.getTop() + paddingTop) - jm0Var.getTop());
            } else {
                this.H = false;
                this.G = false;
                jm0Var.setVisibility(0);
                jm0Var.setTranslationY((org.telegram.messenger.g0.L(1.0f) + getHeight()) - jm0Var.getTop());
            }
            boolean z10 = this.G;
            if (jm0Var.I != z10) {
                jm0Var.I = z10;
                jm0Var.invalidate();
            }
            if (this.H) {
                f10 = org.telegram.messenger.g0.L(36.0f) + i10;
            }
            view.setTranslationY(f10);
            vl0Var.invalidate();
            invalidate();
            return;
        }
        this.G = false;
        this.H = false;
        if (view != null) {
            view.setTranslationY(0.0f);
        }
        if (jm0Var != null) {
            jm0Var.setVisibility(4);
            boolean z11 = this.G;
            if (jm0Var.I != z11) {
                jm0Var.I = z11;
                jm0Var.invalidate();
            }
        }
    }

    public final void i() {
        org.telegram.messenger.ij messageObject;
        zl0 zl0Var = this.f45404w;
        if (zl0Var != null) {
            org.telegram.ui.Cells.q1[] cells = zl0Var.getCells();
            for (int i7 = 0; i7 < cells.length; i7++) {
                org.telegram.ui.Cells.q1 q1Var = cells[i7];
                if (q1Var != null && (messageObject = q1Var.getMessageObject()) != null) {
                    messageObject.f23305u1 = true;
                    hm0 hm0Var = this.f45390f;
                    if (hm0Var != null) {
                        messageObject.f23232c1 = hm0Var.getColorId();
                    }
                    messageObject.f23236d1 = this.f45398n;
                    messageObject.f23240e1 = this.f45403s;
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
        km0 km0Var;
        pl0 pl0Var;
        hm0 hm0Var = this.f45390f;
        if (hm0Var != null) {
            hm0Var.a(this.h, z9);
        }
        im0 im0Var = this.f45381a;
        if (im0Var != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.f45402r;
            if (tL_emojiStatusCollectible != null) {
                im0Var.e(tL_emojiStatusCollectible.document_id, true, z9);
                im0Var.c(org.telegram.messenger.fp.a(this.f45402r), z9);
                im0Var.d(this.f45402r.pattern_document_id, true, z9);
            } else {
                long j3 = 0;
                if (org.telegram.messenger.m5.A()) {
                    im0Var.e(0L, false, z9);
                } else {
                    TLRPC.User a22 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24474s0).a2(0L);
                    if (a22 != null) {
                        j3 = org.telegram.messenger.m5.f(a22.emoji_status);
                    }
                    im0Var.e(j3, org.telegram.messenger.m5.A(), z9);
                }
                im0Var.b(this.h, z9);
                im0Var.d(this.f45398n, false, z9);
            }
        }
        int i10 = this.m0;
        if (i10 == 0 && (pl0Var = (km0Var = this.f45401p0).f47374e) != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = this.f45402r;
            if (tL_emojiStatusCollectible2 != null) {
                pl0Var.c(org.telegram.messenger.fp.a(tL_emojiStatusCollectible2), z9);
            } else {
                pl0Var.b(km0.A0(km0Var), this.h, z9);
            }
        }
        if (i10 == 0) {
            int i11 = this.V;
            k();
            xl0 xl0Var = this.d;
            if (i11 >= 0 && this.V < 0) {
                xl0Var.p(i11, 2);
            } else if (i11 < 0 && (i7 = this.V) >= 0) {
                xl0Var.o(i7, 2);
            }
        }
        int i12 = 0;
        while (true) {
            vl0 vl0Var = this.f45383b;
            if (i12 < vl0Var.getChildCount()) {
                View childAt = vl0Var.getChildAt(i12);
                if (childAt instanceof tl0) {
                    tl0 tl0Var = (tl0) childAt;
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible3 = this.f45402r;
                    if ((tL_emojiStatusCollectible3 != null && tL_emojiStatusCollectible3.collectible_id == tl0Var.getGiftId()) || ((tL_peerColorCollectible2 = this.f45403s) != null && tL_peerColorCollectible2.collectible_id == tl0Var.getGiftId())) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    tl0Var.b(z11, true);
                } else if (childAt instanceof zh.y0) {
                    zh.y0 y0Var = (zh.y0) childAt;
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible4 = this.f45402r;
                    if ((tL_emojiStatusCollectible4 != null && tL_emojiStatusCollectible4.collectible_id == y0Var.getGiftId()) || ((tL_peerColorCollectible = this.f45403s) != null && tL_peerColorCollectible.collectible_id == y0Var.getGiftId())) {
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
        km0 km0Var = this.f45401p0;
        bi.v9 v9Var2 = km0Var.f47369b;
        this.V = -1;
        this.W = -1;
        this.f45382a0 = -1;
        this.f45384b0 = -1;
        this.f45387d0 = -1;
        this.f45389e0 = -1;
        this.f45386c0 = -1;
        this.f45392g0 = -1;
        this.f45393h0 = -1;
        this.f45394i0 = -1;
        this.f45395j0 = -1;
        this.f45391f0 = 0;
        ArrayList arrayList = this.f45397l0;
        arrayList.clear();
        this.Q = 0;
        this.S = 1;
        int i7 = 3;
        this.f45396k0 = 3;
        this.R = 2;
        int i10 = this.m0;
        if (i10 == 0 && (this.h >= 0 || this.f45402r != null || this.f45403s != null)) {
            this.V = 3;
            this.f45396k0 = 5;
            this.W = 4;
        }
        if (i10 == 1) {
            v9Var = km0Var.f47371c;
        } else {
            v9Var = v9Var2;
        }
        if ((i10 == 0 || i10 == 1) && v9Var != null) {
            ArrayList arrayList2 = v9Var.f4914l;
            int i11 = this.f45396k0;
            this.f45396k0 = i11 + 1;
            this.f45393h0 = i11;
            if (this.K == null) {
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) arrayList2.get(i12)).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        arrayList.add((TL_stars.TL_starGiftUnique) starGift);
                    }
                }
                int i13 = this.f45396k0;
                this.f45384b0 = i13;
                this.f45396k0 = arrayList.size() + i13;
                int size = arrayList.size() + this.f45391f0;
                this.f45391f0 = size;
                int i14 = this.f45396k0;
                this.f45386c0 = i14;
                if (!v9Var2.f4911i && v9Var2.f4912j) {
                    if (arrayList.isEmpty()) {
                        int i15 = this.f45396k0;
                        this.f45395j0 = i15;
                        this.f45396k0 = i15 + 2;
                        this.f45394i0 = i15 + 1;
                    }
                } else {
                    this.f45387d0 = i14;
                    int i16 = 3 - (size % 3);
                    if (size <= 0) {
                        i7 = 9;
                    } else if (i16 > 0) {
                        i7 = i16;
                    }
                    int i17 = i14 + i7;
                    this.f45396k0 = i17;
                    this.f45391f0 = size + i7;
                    this.f45389e0 = i17;
                }
                if (c()) {
                    v9Var.a();
                }
            } else if (this.J != null) {
                long e10 = org.telegram.messenger.p10.i(km0.z0(km0Var)).e();
                for (int i18 = 0; i18 < this.J.d.size(); i18++) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.J.d.get(i18);
                    if (org.telegram.messenger.m5.o(tL_starGiftUnique.owner_id) != e10 && org.telegram.messenger.m5.o(tL_starGiftUnique.host_id) != e10) {
                        arrayList.add(tL_starGiftUnique);
                    }
                }
                int i19 = this.f45396k0;
                this.f45384b0 = i19;
                this.f45396k0 = arrayList.size() + i19;
                int size2 = arrayList.size() + this.f45391f0;
                this.f45391f0 = size2;
                int i20 = this.f45396k0;
                this.f45386c0 = i20;
                zh.c3 c3Var = this.J;
                if (c3Var.f60280t || !c3Var.f60281u) {
                    this.f45387d0 = i20;
                    int i21 = 3 - (size2 % 3);
                    if (size2 <= 0) {
                        i7 = 9;
                    } else if (i21 > 0) {
                        i7 = i21;
                    }
                    int i22 = i20 + i7;
                    this.f45396k0 = i22;
                    this.f45391f0 = size2 + i7;
                    this.f45389e0 = i22;
                }
                if (c()) {
                    this.J.g(false);
                }
            }
            int i23 = this.f45396k0;
            this.f45396k0 = i23 + 1;
            this.f45392g0 = i23;
        }
        int i24 = this.f45396k0;
        this.f45396k0 = i24 + 1;
        this.U = i24;
        jm0 jm0Var = this.E;
        if (jm0Var != null) {
            jm0Var.post(new ul0(this, 1));
        }
    }

    public final void l(jm0 jm0Var) {
        int i7;
        int i10 = org.telegram.ui.ActionBar.m6.f27890d6;
        km0 km0Var = this.f45401p0;
        int themedColor = km0Var.getThemedColor(i10);
        km0Var.getThemedColor(org.telegram.ui.ActionBar.m6.f27834a7);
        int themedColor2 = km0Var.getThemedColor(org.telegram.ui.ActionBar.m6.f28300z6);
        int themedColor3 = km0Var.getThemedColor(org.telegram.ui.ActionBar.m6.G6);
        jm0Var.f47044w.setColor(themedColor);
        jm0Var.f47046y = org.telegram.ui.ActionBar.m6.r1(0.06f, themedColor3);
        jm0Var.D = themedColor2;
        jm0Var.E = themedColor3;
        ct ctVar = jm0Var.f47036a;
        for (int i11 = 0; i11 < ctVar.getChildCount(); i11++) {
            View childAt = ctVar.getChildAt(i11);
            int R = RecyclerView.R(childAt);
            if (R != -1 && (childAt instanceof TextView)) {
                TextView textView = (TextView) childAt;
                if (R == jm0Var.d) {
                    i7 = jm0Var.E;
                } else {
                    i7 = jm0Var.D;
                }
                textView.setTextColor(i7);
                childAt.invalidate();
            }
        }
        ctVar.invalidate();
        jm0Var.invalidate();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11 = this.m0;
        View view = this.f45405x;
        vl0 vl0Var = this.f45383b;
        if (i11 == 1) {
            super.onMeasure(i7, i10);
            zl0 zl0Var = this.f45404w;
            this.f45399n0 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + zl0Var.getMeasuredHeight() + org.telegram.messenger.g0.f22561m;
            ((ViewGroup.MarginLayoutParams) zl0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22561m;
            ((ViewGroup.MarginLayoutParams) vl0Var.getLayoutParams()).topMargin = this.f45399n0 - org.telegram.messenger.g0.L(16.0f);
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.f45399n0 - org.telegram.messenger.g0.L(64.0f);
            ((ViewGroup.MarginLayoutParams) this.f45406y.getLayoutParams()).topMargin = this.f45399n0 - org.telegram.messenger.g0.L(16.0f);
            vl0Var.setPadding(vl0Var.getPaddingLeft(), org.telegram.messenger.g0.L(16.0f), vl0Var.getPaddingRight(), vl0Var.getPaddingBottom());
        } else {
            this.f45399n0 = org.telegram.messenger.g0.L(230.0f) + org.telegram.messenger.g0.f22561m;
            ((ViewGroup.MarginLayoutParams) vl0Var.getLayoutParams()).topMargin = this.f45399n0;
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.f45399n0 - org.telegram.messenger.g0.L(64.0f);
            ((ViewGroup.MarginLayoutParams) this.f45381a.getLayoutParams()).height = this.f45399n0;
        }
        super.onMeasure(i7, i10);
    }
}
