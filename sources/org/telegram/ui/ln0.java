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
public final class ln0 extends FrameLayout {
    public static final int f39314q0 = 0;
    public kn0 D;
    public final qn0 E;
    public View F;
    public boolean G;
    public boolean H;
    public TL_stars.TL_starGiftUnique I;
    public ph.h3 J;
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
    public final pn0 f39315a;
    public int f39316a0;
    public final cn0 f39317b;
    public int f39318b0;
    public final s4.r f39319c;
    public int f39320c0;
    public final en0 d;
    public int f39321d0;
    public final m5.e e;
    public int f39322e0;
    public on0 f39323f;
    public int f39324f0;
    public int f39325g0;
    public int h;
    public int f39326h0;
    public int f39327i0;
    public int f39328j0;
    public int f39329k0;
    public final ArrayList f39330l0;
    public final int m0;
    public long f39331n;
    public int f39332n0;
    public in0 f39333o0;
    public final rn0 f39334p0;
    public TLRPC.TL_emojiStatusCollectible f39335r;
    public TLRPC.TL_peerColorCollectible f39336s;
    public final gn0 f39337w;
    public final View f39338x;
    public final View f39339y;

    public ln0(rn0 rn0Var, Context context, int i10) {
        super(context);
        int i11;
        this.f39334p0 = rn0Var;
        this.e = new m5.e(15, false);
        this.h = -1;
        this.f39331n = 0L;
        this.f39335r = null;
        this.f39336s = null;
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
        this.f39316a0 = -1;
        this.f39318b0 = -1;
        this.f39320c0 = -1;
        this.f39321d0 = -1;
        this.f39322e0 = -1;
        this.f39324f0 = 0;
        this.f39325g0 = -1;
        this.f39326h0 = -1;
        this.f39327i0 = -1;
        this.f39328j0 = -1;
        this.f39330l0 = new ArrayList();
        this.m0 = i10;
        d();
        Context context2 = getContext();
        org.telegram.ui.ActionBar.p6 resourceProvider = rn0Var.getResourceProvider();
        tg.b bVar = rn0Var.G;
        cn0 cn0Var = new cn0(this, context2, resourceProvider, i10);
        this.f39317b = cn0Var;
        cn0Var.setClipToPadding(false);
        cn0Var.setSections(true);
        ((s4.j) cn0Var.getItemAnimator()).f47938m = false;
        getContext();
        s4.r rVar = new s4.r(3);
        this.f39319c = rVar;
        rVar.O = new jg.h1(this, 8);
        cn0Var.i(new mg.u1(this, 8));
        cn0Var.setLayoutManager(rVar);
        en0 en0Var = new en0(this, context, i10);
        this.d = en0Var;
        cn0Var.setAdapter(en0Var);
        cn0Var.setOnItemClickListener(new org.telegram.ui.Components.cm0(this, i10, 1));
        cn0Var.j(new fn0(this, i10));
        addView(cn0Var, w7.b6.c(-1.0f, -1));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.dq(2131232241, 0), 0, 1, 33);
        if (rn0Var.f41110a) {
            i11 = 2131752435;
        } else {
            i11 = 2131743781;
        }
        String L0 = org.telegram.messenger.dd.L0(i11, null);
        this.O = L0;
        this.N = new SpannableStringBuilder(spannableStringBuilder).append((CharSequence) " ").append((CharSequence) L0);
        this.P = org.telegram.messenger.dd.L0(2131743780, null);
        f(false);
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(org.telegram.ui.Components.gr.h);
        jVar.C = false;
        jVar.f47938m = false;
        cn0Var.setItemAnimator(jVar);
        View view = new View(getContext());
        this.f39338x = view;
        tg.c cVar = new tg.c(bVar.c(view, null, false));
        cVar.b(-org.telegram.messenger.i0.L(24.0f), true);
        cVar.G = 220;
        view.setBackground(cVar);
        addView(view, w7.b6.e(-1, 72, 55));
        if (i10 == 0) {
            this.f39315a = new pn0(rn0.k0(rn0Var), 0L, getContext(), rn0.l0(rn0Var));
            j(false);
        } else {
            View view2 = new View(getContext());
            this.f39339y = view2;
            tg.c cVar2 = new tg.c(bVar.c(view2, null, false));
            cVar2.b(-org.telegram.messenger.i0.L(16.0f), false);
            view2.setBackground(cVar2);
            addView(view2, w7.b6.e(-1, 16, 55));
            gn0 gn0Var = new gn0(getContext(), rn0.m0(rn0Var), 3, 0L, rn0.n0(rn0Var));
            this.f39337w = gn0Var;
            gn0Var.setImportantForAccessibility(4);
            gn0Var.f23662x = rn0Var;
            gn0Var.setClipToOutline(true);
            bi.d2 d2Var = rf.e0.f46537a;
            gn0Var.setOutlineProvider(new rf.c0(0, org.telegram.messenger.i0.L(16.0f)));
            addView(gn0Var, w7.b6.d(-1, -2.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        qn0 qn0Var = new qn0(getContext(), rn0.o0(rn0Var));
        this.E = qn0Var;
        vg.f c10 = rn0Var.E.c(qn0Var, null, false);
        wg.d dVar = new wg.d(rn0.p0(rn0Var));
        dVar.e = new xg.a(7);
        dVar.f(0, 0);
        dVar.e(0, 0);
        dVar.d(0, 0);
        c10.o(dVar);
        c10.q(org.telegram.messenger.i0.L(18.0f));
        c10.P.e = true;
        qn0Var.H = c10;
        qn0Var.G = c10;
        qn0Var.F = new bn0(this, 0);
        qn0Var.setVisibility(4);
        addView(qn0Var, w7.b6.d(-1, 36.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        View view3 = this.f39315a;
        if (view3 != null) {
            addView(view3, w7.b6.e(-1, -2, 55));
        }
        g();
        k();
        setWillNotDraw(false);
    }

    public static void a(ln0 ln0Var) {
        int i10;
        cn0 cn0Var = ln0Var.f39317b;
        boolean z10 = ln0Var.H;
        if (z10) {
            cn0Var.C0();
        }
        ln0Var.e();
        if (z10 && (i10 = ln0Var.f39326h0) >= 0) {
            ln0Var.f39319c.h1(i10, ln0Var.f39334p0.f41117f);
            cn0Var.post(new bn0(ln0Var, 1));
        }
    }

    public final boolean b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ln0.b():boolean");
    }

    public final boolean c() {
        cn0 cn0Var = this.f39317b;
        if (cn0Var != null) {
            for (int i10 = 0; i10 < cn0Var.getChildCount(); i10++) {
                if (cn0Var.getChildAt(i10) instanceof org.telegram.ui.Components.zz) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void d() {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible;
        int i10 = this.m0;
        rn0 rn0Var = this.f39334p0;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible = null;
        if (i10 == 0) {
            TLRPC.User f7 = rn0Var.getUserConfig().f();
            this.h = org.telegram.messenger.i20.l(f7);
            this.f39331n = org.telegram.messenger.i20.m(f7);
            if (f7 != null) {
                TLRPC.EmojiStatus emojiStatus = f7.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                    this.f39335r = tL_emojiStatusCollectible;
                    this.f39336s = null;
                }
            }
            tL_emojiStatusCollectible = null;
            this.f39335r = tL_emojiStatusCollectible;
            this.f39336s = null;
        } else {
            TLRPC.User f10 = rn0Var.getUserConfig().f();
            this.h = org.telegram.messenger.i20.e(f10);
            this.f39331n = org.telegram.messenger.i20.f(f10);
            this.f39335r = null;
            if (f10 != null) {
                TLRPC.PeerColor peerColor = f10.color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                }
            }
            this.f39336s = tL_peerColorCollectible;
        }
        if (this.f39335r == null && this.f39336s == null) {
            return;
        }
        this.h = -1;
        this.f39331n = 0L;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.E && !this.H) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e() {
        k();
        this.d.f();
    }

    public final void f(boolean z10) {
        Object obj;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.I;
        rn0 rn0Var = this.f39334p0;
        m5.e eVar = this.e;
        if (tL_starGiftUnique != null) {
            sf.a resellAmount = tL_starGiftUnique.getResellAmount(sf.b.f48267a);
            if (tL_starGiftUnique.resale_ton_only) {
                eVar.f13014b = rh.h8.s1(rh.h8.V0(org.telegram.messenger.dd.a0(null, null, 2131746163, tL_starGiftUnique.getResellAmount(sf.b.f48268b).d()), true), true);
                eVar.f13015c = rh.h8.T0(org.telegram.messenger.dd.H(',', "ResellGiftBuyEq", (int) resellAmount.a()));
            } else {
                eVar.f13014b = rh.h8.T0(org.telegram.messenger.dd.H(',', "ResellGiftBuy", (int) resellAmount.a()));
                eVar.f13015c = null;
            }
        } else {
            if (!rn0Var.getUserConfig().q() && !rn0Var.f41110a) {
                obj = this.N;
            } else if (this.f39335r != null) {
                obj = this.P;
            } else {
                obj = this.O;
            }
            eVar.f13014b = obj;
            eVar.f13015c = null;
        }
        if (rn0Var.H0() == this) {
            rn0Var.R = this;
            rn0Var.Q.i((CharSequence) eVar.f13014b, z10, true);
            rn0Var.Q.g((SpannableStringBuilder) eVar.f13015c, z10);
        }
    }

    public final void g() {
        vh.d dVar = this.f39334p0.Q;
        if (dVar != null) {
            dVar.updateColors();
        }
        gn0 gn0Var = this.f39337w;
        if (gn0Var != null) {
            gn0Var.invalidate();
        }
        j(true);
        org.telegram.messenger.i0.d0(this.f39317b, new s3(this, 15));
        qn0 qn0Var = this.E;
        if (qn0Var != null) {
            l(qn0Var);
        }
    }

    public final void h() {
        int i10;
        boolean z10;
        int i11 = this.f39334p0.f41117f;
        float f7 = 0.0f;
        View view = this.f39338x;
        qn0 qn0Var = this.E;
        if (qn0Var != null && (i10 = this.f39326h0) >= 0) {
            s4.r rVar = this.f39319c;
            this.F = rVar.m(i10);
            cn0 cn0Var = this.f39317b;
            int paddingTop = cn0Var.getPaddingTop() + i11;
            int L0 = rVar.L0();
            View view2 = this.F;
            if (view2 != null) {
                if (view2.getTop() <= paddingTop) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.H = z10;
                this.G = !z10;
                qn0Var.setVisibility(0);
                qn0Var.setTranslationY((Math.max(this.F.getTop(), paddingTop) + cn0Var.getTop()) - qn0Var.getTop());
            } else if (L0 != -1 && L0 > this.f39326h0) {
                this.H = true;
                this.G = false;
                qn0Var.setVisibility(0);
                qn0Var.setTranslationY((cn0Var.getTop() + paddingTop) - qn0Var.getTop());
            } else {
                this.H = false;
                this.G = false;
                qn0Var.setVisibility(0);
                qn0Var.setTranslationY((org.telegram.messenger.i0.L(1.0f) + getHeight()) - qn0Var.getTop());
            }
            boolean z11 = this.G;
            if (qn0Var.I != z11) {
                qn0Var.I = z11;
                qn0Var.invalidate();
            }
            if (this.H) {
                f7 = org.telegram.messenger.i0.L(36.0f) + i11;
            }
            view.setTranslationY(f7);
            cn0Var.invalidate();
            invalidate();
            return;
        }
        this.G = false;
        this.H = false;
        if (view != null) {
            view.setTranslationY(0.0f);
        }
        if (qn0Var != null) {
            qn0Var.setVisibility(4);
            boolean z12 = this.G;
            if (qn0Var.I != z12) {
                qn0Var.I = z12;
                qn0Var.invalidate();
            }
        }
    }

    public final void i() {
        org.telegram.messenger.kj messageObject;
        gn0 gn0Var = this.f39337w;
        if (gn0Var != null) {
            org.telegram.ui.Cells.q1[] cells = gn0Var.getCells();
            for (int i10 = 0; i10 < cells.length; i10++) {
                org.telegram.ui.Cells.q1 q1Var = cells[i10];
                if (q1Var != null && (messageObject = q1Var.getMessageObject()) != null) {
                    messageObject.f16730u1 = true;
                    on0 on0Var = this.f39323f;
                    if (on0Var != null) {
                        messageObject.f16658c1 = on0Var.getColorId();
                    }
                    messageObject.f16662d1 = this.f39331n;
                    messageObject.f16666e1 = this.f39336s;
                    cells[i10].setAvatar(messageObject);
                    cells[i10].invalidate();
                }
            }
        }
    }

    public final void j(boolean z10) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        boolean z11;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        boolean z12;
        int i10;
        rn0 rn0Var;
        wm0 wm0Var;
        on0 on0Var = this.f39323f;
        if (on0Var != null) {
            on0Var.a(this.h, z10);
        }
        pn0 pn0Var = this.f39315a;
        if (pn0Var != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.f39335r;
            if (tL_emojiStatusCollectible != null) {
                pn0Var.e(tL_emojiStatusCollectible.document_id, true, z10);
                pn0Var.c(org.telegram.messenger.lp.a(this.f39335r), z10);
                pn0Var.d(this.f39335r.pattern_document_id, true, z10);
            } else {
                long j10 = 0;
                if (org.telegram.messenger.o5.A()) {
                    pn0Var.e(0L, false, z10);
                } else {
                    TLRPC.User Z1 = org.telegram.messenger.wp.r1(org.telegram.messenger.e20.f15506s0).Z1(0L);
                    if (Z1 != null) {
                        j10 = org.telegram.messenger.o5.f(Z1.emoji_status);
                    }
                    pn0Var.e(j10, org.telegram.messenger.o5.A(), z10);
                }
                pn0Var.b(this.h, z10);
                pn0Var.d(this.f39331n, false, z10);
            }
        }
        int i11 = this.m0;
        if (i11 == 0 && (wm0Var = (rn0Var = this.f39334p0).e) != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = this.f39335r;
            if (tL_emojiStatusCollectible2 != null) {
                wm0Var.c(org.telegram.messenger.lp.a(tL_emojiStatusCollectible2), z10);
            } else {
                wm0Var.b(rn0.A0(rn0Var), this.h, z10);
            }
        }
        if (i11 == 0) {
            int i12 = this.V;
            k();
            en0 en0Var = this.d;
            if (i12 >= 0 && this.V < 0) {
                en0Var.p(i12, 2);
            } else if (i12 < 0 && (i10 = this.V) >= 0) {
                en0Var.o(i10, 2);
            }
        }
        int i13 = 0;
        while (true) {
            cn0 cn0Var = this.f39317b;
            if (i13 < cn0Var.getChildCount()) {
                View childAt = cn0Var.getChildAt(i13);
                if (childAt instanceof an0) {
                    an0 an0Var = (an0) childAt;
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible3 = this.f39335r;
                    if ((tL_emojiStatusCollectible3 != null && tL_emojiStatusCollectible3.collectible_id == an0Var.getGiftId()) || ((tL_peerColorCollectible2 = this.f39336s) != null && tL_peerColorCollectible2.collectible_id == an0Var.getGiftId())) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    an0Var.b(z12, true);
                } else if (childAt instanceof ph.c1) {
                    ph.c1 c1Var = (ph.c1) childAt;
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible4 = this.f39335r;
                    if ((tL_emojiStatusCollectible4 != null && tL_emojiStatusCollectible4.collectible_id == c1Var.getGiftId()) || ((tL_peerColorCollectible = this.f39336s) != null && tL_peerColorCollectible.collectible_id == c1Var.getGiftId())) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    c1Var.f(z11, true);
                }
                i13++;
            } else {
                return;
            }
        }
    }

    public final void k() {
        rh.v5 v5Var;
        rn0 rn0Var = this.f39334p0;
        rh.v5 v5Var2 = rn0Var.f41112b;
        this.V = -1;
        this.W = -1;
        this.f39316a0 = -1;
        this.f39318b0 = -1;
        this.f39321d0 = -1;
        this.f39322e0 = -1;
        this.f39320c0 = -1;
        this.f39325g0 = -1;
        this.f39326h0 = -1;
        this.f39327i0 = -1;
        this.f39328j0 = -1;
        this.f39324f0 = 0;
        ArrayList arrayList = this.f39330l0;
        arrayList.clear();
        this.Q = 0;
        this.S = 1;
        int i10 = 3;
        this.f39329k0 = 3;
        this.R = 2;
        int i11 = this.m0;
        if (i11 == 0 && (this.h >= 0 || this.f39335r != null || this.f39336s != null)) {
            this.V = 3;
            this.f39329k0 = 5;
            this.W = 4;
        }
        if (i11 == 1) {
            v5Var = rn0Var.f41114c;
        } else {
            v5Var = v5Var2;
        }
        if ((i11 == 0 || i11 == 1) && v5Var != null) {
            ArrayList arrayList2 = v5Var.f47596l;
            int i12 = this.f39329k0;
            this.f39329k0 = i12 + 1;
            this.f39326h0 = i12;
            if (this.K == null) {
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) arrayList2.get(i13)).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        arrayList.add((TL_stars.TL_starGiftUnique) starGift);
                    }
                }
                int i14 = this.f39329k0;
                this.f39318b0 = i14;
                this.f39329k0 = arrayList.size() + i14;
                int size = arrayList.size() + this.f39324f0;
                this.f39324f0 = size;
                int i15 = this.f39329k0;
                this.f39320c0 = i15;
                if (!v5Var2.f47593i && v5Var2.f47594j) {
                    if (arrayList.isEmpty()) {
                        int i16 = this.f39329k0;
                        this.f39328j0 = i16;
                        this.f39329k0 = i16 + 2;
                        this.f39327i0 = i16 + 1;
                    }
                } else {
                    this.f39321d0 = i15;
                    int i17 = 3 - (size % 3);
                    if (size <= 0) {
                        i10 = 9;
                    } else if (i17 > 0) {
                        i10 = i17;
                    }
                    int i18 = i15 + i10;
                    this.f39329k0 = i18;
                    this.f39324f0 = size + i10;
                    this.f39322e0 = i18;
                }
                if (c()) {
                    v5Var.b();
                }
            } else if (this.J != null) {
                long e = org.telegram.messenger.e20.i(rn0.z0(rn0Var)).e();
                for (int i19 = 0; i19 < this.J.d.size(); i19++) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.J.d.get(i19);
                    if (org.telegram.messenger.o5.o(tL_starGiftUnique.owner_id) != e && org.telegram.messenger.o5.o(tL_starGiftUnique.host_id) != e) {
                        arrayList.add(tL_starGiftUnique);
                    }
                }
                int i20 = this.f39329k0;
                this.f39318b0 = i20;
                this.f39329k0 = arrayList.size() + i20;
                int size2 = arrayList.size() + this.f39324f0;
                this.f39324f0 = size2;
                int i21 = this.f39329k0;
                this.f39320c0 = i21;
                ph.h3 h3Var = this.J;
                if (h3Var.f45116t || !h3Var.f45117u) {
                    this.f39321d0 = i21;
                    int i22 = 3 - (size2 % 3);
                    if (size2 <= 0) {
                        i10 = 9;
                    } else if (i22 > 0) {
                        i10 = i22;
                    }
                    int i23 = i21 + i10;
                    this.f39329k0 = i23;
                    this.f39324f0 = size2 + i10;
                    this.f39322e0 = i23;
                }
                if (c()) {
                    this.J.g(false);
                }
            }
            int i24 = this.f39329k0;
            this.f39329k0 = i24 + 1;
            this.f39325g0 = i24;
        }
        int i25 = this.f39329k0;
        this.f39329k0 = i25 + 1;
        this.U = i25;
        qn0 qn0Var = this.E;
        if (qn0Var != null) {
            qn0Var.post(new bn0(this, 1));
        }
    }

    public final void l(qn0 qn0Var) {
        int i10;
        int i11 = org.telegram.ui.ActionBar.t6.f20930d6;
        rn0 rn0Var = this.f39334p0;
        int themedColor = rn0Var.getThemedColor(i11);
        rn0Var.getThemedColor(org.telegram.ui.ActionBar.t6.f20873a7);
        int themedColor2 = rn0Var.getThemedColor(org.telegram.ui.ActionBar.t6.f21331z6);
        int themedColor3 = rn0Var.getThemedColor(org.telegram.ui.ActionBar.t6.G6);
        qn0Var.f40861w.setColor(themedColor);
        qn0Var.f40863y = org.telegram.ui.ActionBar.t6.r1(0.06f, themedColor3);
        qn0Var.D = themedColor2;
        qn0Var.E = themedColor3;
        mb0 mb0Var = qn0Var.f40854a;
        for (int i12 = 0; i12 < mb0Var.getChildCount(); i12++) {
            View childAt = mb0Var.getChildAt(i12);
            int R = RecyclerView.R(childAt);
            if (R != -1 && (childAt instanceof TextView)) {
                TextView textView = (TextView) childAt;
                if (R == qn0Var.d) {
                    i10 = qn0Var.E;
                } else {
                    i10 = qn0Var.D;
                }
                textView.setTextColor(i10);
                childAt.invalidate();
            }
        }
        mb0Var.invalidate();
        qn0Var.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = this.m0;
        View view = this.f39338x;
        cn0 cn0Var = this.f39317b;
        if (i12 == 1) {
            super.onMeasure(i10, i11);
            gn0 gn0Var = this.f39337w;
            this.f39332n0 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + gn0Var.getMeasuredHeight() + org.telegram.messenger.i0.f16166m;
            ((ViewGroup.MarginLayoutParams) gn0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.f16166m;
            ((ViewGroup.MarginLayoutParams) cn0Var.getLayoutParams()).topMargin = this.f39332n0 - org.telegram.messenger.i0.L(16.0f);
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.f39332n0 - org.telegram.messenger.i0.L(64.0f);
            ((ViewGroup.MarginLayoutParams) this.f39339y.getLayoutParams()).topMargin = this.f39332n0 - org.telegram.messenger.i0.L(16.0f);
            cn0Var.setPadding(cn0Var.getPaddingLeft(), org.telegram.messenger.i0.L(16.0f), cn0Var.getPaddingRight(), cn0Var.getPaddingBottom());
        } else {
            this.f39332n0 = org.telegram.messenger.i0.L(230.0f) + org.telegram.messenger.i0.f16166m;
            ((ViewGroup.MarginLayoutParams) cn0Var.getLayoutParams()).topMargin = this.f39332n0;
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.f39332n0 - org.telegram.messenger.i0.L(64.0f);
            ((ViewGroup.MarginLayoutParams) this.f39315a.getLayoutParams()).height = this.f39332n0;
        }
        super.onMeasure(i10, i11);
    }
}
