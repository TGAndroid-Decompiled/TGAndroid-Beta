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
public final class nn0 extends FrameLayout {
    public static final int f39981q0 = 0;
    public mn0 D;
    public final sn0 E;
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
    public final rn0 f39982a;
    public int f39983a0;
    public final en0 f39984b;
    public int f39985b0;
    public final s4.r f39986c;
    public int f39987c0;
    public final gn0 d;
    public int f39988d0;
    public final m5.e e;
    public int f39989e0;
    public qn0 f39990f;
    public int f39991f0;
    public int f39992g0;
    public int h;
    public int f39993h0;
    public int f39994i0;
    public int f39995j0;
    public int f39996k0;
    public final ArrayList f39997l0;
    public final int m0;
    public long f39998n;
    public int f39999n0;
    public kn0 f40000o0;
    public final tn0 f40001p0;
    public TLRPC.TL_emojiStatusCollectible f40002r;
    public TLRPC.TL_peerColorCollectible f40003s;
    public final in0 f40004w;
    public final View f40005x;
    public final View f40006y;

    public nn0(tn0 tn0Var, Context context, int i10) {
        super(context);
        int i11;
        this.f40001p0 = tn0Var;
        this.e = new m5.e(15, false);
        this.h = -1;
        this.f39998n = 0L;
        this.f40002r = null;
        this.f40003s = null;
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
        this.f39983a0 = -1;
        this.f39985b0 = -1;
        this.f39987c0 = -1;
        this.f39988d0 = -1;
        this.f39989e0 = -1;
        this.f39991f0 = 0;
        this.f39992g0 = -1;
        this.f39993h0 = -1;
        this.f39994i0 = -1;
        this.f39995j0 = -1;
        this.f39997l0 = new ArrayList();
        this.m0 = i10;
        d();
        Context context2 = getContext();
        org.telegram.ui.ActionBar.p6 resourceProvider = tn0Var.getResourceProvider();
        tg.b bVar = tn0Var.G;
        en0 en0Var = new en0(this, context2, resourceProvider, i10);
        this.f39984b = en0Var;
        en0Var.setClipToPadding(false);
        en0Var.setSections(true);
        ((s4.j) en0Var.getItemAnimator()).f47927m = false;
        getContext();
        s4.r rVar = new s4.r(3);
        this.f39986c = rVar;
        rVar.O = new jg.h1(this, 8);
        en0Var.i(new mg.u1(this, 8));
        en0Var.setLayoutManager(rVar);
        gn0 gn0Var = new gn0(this, context, i10);
        this.d = gn0Var;
        en0Var.setAdapter(gn0Var);
        en0Var.setOnItemClickListener(new org.telegram.ui.Components.bm0(this, i10, 1));
        en0Var.j(new hn0(this, i10));
        addView(en0Var, w7.b6.c(-1.0f, -1));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.dq(2131232241, 0), 0, 1, 33);
        if (tn0Var.f41868a) {
            i11 = 2131752435;
        } else {
            i11 = 2131743781;
        }
        String L0 = org.telegram.messenger.cd.L0(i11, null);
        this.O = L0;
        this.N = new SpannableStringBuilder(spannableStringBuilder).append((CharSequence) " ").append((CharSequence) L0);
        this.P = org.telegram.messenger.cd.L0(2131743780, null);
        f(false);
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(org.telegram.ui.Components.gr.h);
        jVar.C = false;
        jVar.f47927m = false;
        en0Var.setItemAnimator(jVar);
        View view = new View(getContext());
        this.f40005x = view;
        tg.c cVar = new tg.c(bVar.c(view, null, false));
        cVar.b(-org.telegram.messenger.i0.L(24.0f), true);
        cVar.G = 220;
        view.setBackground(cVar);
        addView(view, w7.b6.e(-1, 72, 55));
        if (i10 == 0) {
            this.f39982a = new rn0(tn0.j0(tn0Var), 0L, getContext(), tn0.k0(tn0Var));
            j(false);
        } else {
            View view2 = new View(getContext());
            this.f40006y = view2;
            tg.c cVar2 = new tg.c(bVar.c(view2, null, false));
            cVar2.b(-org.telegram.messenger.i0.L(16.0f), false);
            view2.setBackground(cVar2);
            addView(view2, w7.b6.e(-1, 16, 55));
            in0 in0Var = new in0(getContext(), tn0.l0(tn0Var), 3, 0L, tn0.m0(tn0Var));
            this.f40004w = in0Var;
            in0Var.setImportantForAccessibility(4);
            in0Var.f23661x = tn0Var;
            in0Var.setClipToOutline(true);
            bi.d2 d2Var = rf.e0.f46526a;
            in0Var.setOutlineProvider(new rf.c0(0, org.telegram.messenger.i0.L(16.0f)));
            addView(in0Var, w7.b6.d(-1, -2.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        sn0 sn0Var = new sn0(getContext(), tn0.n0(tn0Var));
        this.E = sn0Var;
        vg.f c10 = tn0Var.E.c(sn0Var, null, false);
        wg.d dVar = new wg.d(tn0.o0(tn0Var));
        dVar.e = new xg.a(7);
        dVar.f(0, 0);
        dVar.e(0, 0);
        dVar.d(0, 0);
        c10.o(dVar);
        c10.q(org.telegram.messenger.i0.L(18.0f));
        c10.M.e = true;
        sn0Var.H = c10;
        sn0Var.G = c10;
        sn0Var.F = new dn0(this, 0);
        sn0Var.setVisibility(4);
        addView(sn0Var, w7.b6.d(-1, 36.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        View view3 = this.f39982a;
        if (view3 != null) {
            addView(view3, w7.b6.e(-1, -2, 55));
        }
        g();
        k();
        setWillNotDraw(false);
    }

    public static void a(nn0 nn0Var) {
        int i10;
        en0 en0Var = nn0Var.f39984b;
        boolean z10 = nn0Var.H;
        if (z10) {
            en0Var.C0();
        }
        nn0Var.e();
        if (z10 && (i10 = nn0Var.f39993h0) >= 0) {
            nn0Var.f39986c.h1(i10, nn0Var.f40001p0.f41875f);
            en0Var.post(new dn0(nn0Var, 1));
        }
    }

    public final boolean b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nn0.b():boolean");
    }

    public final boolean c() {
        en0 en0Var = this.f39984b;
        if (en0Var != null) {
            for (int i10 = 0; i10 < en0Var.getChildCount(); i10++) {
                if (en0Var.getChildAt(i10) instanceof org.telegram.ui.Components.zz) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void d() {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible;
        int i10 = this.m0;
        tn0 tn0Var = this.f40001p0;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible = null;
        if (i10 == 0) {
            TLRPC.User f7 = tn0Var.getUserConfig().f();
            this.h = org.telegram.messenger.h20.l(f7);
            this.f39998n = org.telegram.messenger.h20.m(f7);
            if (f7 != null) {
                TLRPC.EmojiStatus emojiStatus = f7.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                    this.f40002r = tL_emojiStatusCollectible;
                    this.f40003s = null;
                }
            }
            tL_emojiStatusCollectible = null;
            this.f40002r = tL_emojiStatusCollectible;
            this.f40003s = null;
        } else {
            TLRPC.User f10 = tn0Var.getUserConfig().f();
            this.h = org.telegram.messenger.h20.e(f10);
            this.f39998n = org.telegram.messenger.h20.f(f10);
            this.f40002r = null;
            if (f10 != null) {
                TLRPC.PeerColor peerColor = f10.color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                }
            }
            this.f40003s = tL_peerColorCollectible;
        }
        if (this.f40002r == null && this.f40003s == null) {
            return;
        }
        this.h = -1;
        this.f39998n = 0L;
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
        tn0 tn0Var = this.f40001p0;
        m5.e eVar = this.e;
        if (tL_starGiftUnique != null) {
            sf.a resellAmount = tL_starGiftUnique.getResellAmount(sf.b.f48256a);
            if (tL_starGiftUnique.resale_ton_only) {
                eVar.f13013b = rh.h8.r1(rh.h8.U0(org.telegram.messenger.cd.a0(null, null, 2131746163, tL_starGiftUnique.getResellAmount(sf.b.f48257b).d()), true), true);
                eVar.f13014c = rh.h8.S0(org.telegram.messenger.cd.H(',', "ResellGiftBuyEq", (int) resellAmount.a()));
            } else {
                eVar.f13013b = rh.h8.S0(org.telegram.messenger.cd.H(',', "ResellGiftBuy", (int) resellAmount.a()));
                eVar.f13014c = null;
            }
        } else {
            if (!tn0Var.getUserConfig().q() && !tn0Var.f41868a) {
                obj = this.N;
            } else if (this.f40002r != null) {
                obj = this.P;
            } else {
                obj = this.O;
            }
            eVar.f13013b = obj;
            eVar.f13014c = null;
        }
        if (tn0Var.G0() == this) {
            tn0Var.R = this;
            tn0Var.Q.i((CharSequence) eVar.f13013b, z10, true);
            tn0Var.Q.g((SpannableStringBuilder) eVar.f13014c, z10);
        }
    }

    public final void g() {
        vh.d dVar = this.f40001p0.Q;
        if (dVar != null) {
            dVar.updateColors();
        }
        in0 in0Var = this.f40004w;
        if (in0Var != null) {
            in0Var.invalidate();
        }
        j(true);
        org.telegram.messenger.i0.d0(this.f39984b, new s3(this, 15));
        sn0 sn0Var = this.E;
        if (sn0Var != null) {
            l(sn0Var);
        }
    }

    public final void h() {
        int i10;
        boolean z10;
        int i11 = this.f40001p0.f41875f;
        float f7 = 0.0f;
        View view = this.f40005x;
        sn0 sn0Var = this.E;
        if (sn0Var != null && (i10 = this.f39993h0) >= 0) {
            s4.r rVar = this.f39986c;
            this.F = rVar.m(i10);
            en0 en0Var = this.f39984b;
            int paddingTop = en0Var.getPaddingTop() + i11;
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
                sn0Var.setVisibility(0);
                sn0Var.setTranslationY((Math.max(this.F.getTop(), paddingTop) + en0Var.getTop()) - sn0Var.getTop());
            } else if (L0 != -1 && L0 > this.f39993h0) {
                this.H = true;
                this.G = false;
                sn0Var.setVisibility(0);
                sn0Var.setTranslationY((en0Var.getTop() + paddingTop) - sn0Var.getTop());
            } else {
                this.H = false;
                this.G = false;
                sn0Var.setVisibility(0);
                sn0Var.setTranslationY((org.telegram.messenger.i0.L(1.0f) + getHeight()) - sn0Var.getTop());
            }
            boolean z11 = this.G;
            if (sn0Var.I != z11) {
                sn0Var.I = z11;
                sn0Var.invalidate();
            }
            if (this.H) {
                f7 = org.telegram.messenger.i0.L(36.0f) + i11;
            }
            view.setTranslationY(f7);
            en0Var.invalidate();
            invalidate();
            return;
        }
        this.G = false;
        this.H = false;
        if (view != null) {
            view.setTranslationY(0.0f);
        }
        if (sn0Var != null) {
            sn0Var.setVisibility(4);
            boolean z12 = this.G;
            if (sn0Var.I != z12) {
                sn0Var.I = z12;
                sn0Var.invalidate();
            }
        }
    }

    public final void i() {
        org.telegram.messenger.jj messageObject;
        in0 in0Var = this.f40004w;
        if (in0Var != null) {
            org.telegram.ui.Cells.q1[] cells = in0Var.getCells();
            for (int i10 = 0; i10 < cells.length; i10++) {
                org.telegram.ui.Cells.q1 q1Var = cells[i10];
                if (q1Var != null && (messageObject = q1Var.getMessageObject()) != null) {
                    messageObject.f16377u1 = true;
                    qn0 qn0Var = this.f39990f;
                    if (qn0Var != null) {
                        messageObject.f16305c1 = qn0Var.getColorId();
                    }
                    messageObject.f16309d1 = this.f39998n;
                    messageObject.f16313e1 = this.f40003s;
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
        tn0 tn0Var;
        ym0 ym0Var;
        qn0 qn0Var = this.f39990f;
        if (qn0Var != null) {
            qn0Var.a(this.h, z10);
        }
        rn0 rn0Var = this.f39982a;
        if (rn0Var != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.f40002r;
            if (tL_emojiStatusCollectible != null) {
                rn0Var.e(tL_emojiStatusCollectible.document_id, true, z10);
                rn0Var.c(org.telegram.messenger.kp.a(this.f40002r), z10);
                rn0Var.d(this.f40002r.pattern_document_id, true, z10);
            } else {
                long j10 = 0;
                if (org.telegram.messenger.o5.A()) {
                    rn0Var.e(0L, false, z10);
                } else {
                    TLRPC.User Z1 = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.f15147s0).Z1(0L);
                    if (Z1 != null) {
                        j10 = org.telegram.messenger.o5.f(Z1.emoji_status);
                    }
                    rn0Var.e(j10, org.telegram.messenger.o5.A(), z10);
                }
                rn0Var.b(this.h, z10);
                rn0Var.d(this.f39998n, false, z10);
            }
        }
        int i11 = this.m0;
        if (i11 == 0 && (ym0Var = (tn0Var = this.f40001p0).e) != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = this.f40002r;
            if (tL_emojiStatusCollectible2 != null) {
                ym0Var.c(org.telegram.messenger.kp.a(tL_emojiStatusCollectible2), z10);
            } else {
                ym0Var.b(tn0.z0(tn0Var), this.h, z10);
            }
        }
        if (i11 == 0) {
            int i12 = this.V;
            k();
            gn0 gn0Var = this.d;
            if (i12 >= 0 && this.V < 0) {
                gn0Var.p(i12, 2);
            } else if (i12 < 0 && (i10 = this.V) >= 0) {
                gn0Var.o(i10, 2);
            }
        }
        int i13 = 0;
        while (true) {
            en0 en0Var = this.f39984b;
            if (i13 < en0Var.getChildCount()) {
                View childAt = en0Var.getChildAt(i13);
                if (childAt instanceof cn0) {
                    cn0 cn0Var = (cn0) childAt;
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible3 = this.f40002r;
                    if ((tL_emojiStatusCollectible3 != null && tL_emojiStatusCollectible3.collectible_id == cn0Var.getGiftId()) || ((tL_peerColorCollectible2 = this.f40003s) != null && tL_peerColorCollectible2.collectible_id == cn0Var.getGiftId())) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    cn0Var.b(z12, true);
                } else if (childAt instanceof ph.c1) {
                    ph.c1 c1Var = (ph.c1) childAt;
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible4 = this.f40002r;
                    if ((tL_emojiStatusCollectible4 != null && tL_emojiStatusCollectible4.collectible_id == c1Var.getGiftId()) || ((tL_peerColorCollectible = this.f40003s) != null && tL_peerColorCollectible.collectible_id == c1Var.getGiftId())) {
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
        tn0 tn0Var = this.f40001p0;
        rh.v5 v5Var2 = tn0Var.f41870b;
        this.V = -1;
        this.W = -1;
        this.f39983a0 = -1;
        this.f39985b0 = -1;
        this.f39988d0 = -1;
        this.f39989e0 = -1;
        this.f39987c0 = -1;
        this.f39992g0 = -1;
        this.f39993h0 = -1;
        this.f39994i0 = -1;
        this.f39995j0 = -1;
        this.f39991f0 = 0;
        ArrayList arrayList = this.f39997l0;
        arrayList.clear();
        this.Q = 0;
        this.S = 1;
        int i10 = 3;
        this.f39996k0 = 3;
        this.R = 2;
        int i11 = this.m0;
        if (i11 == 0 && (this.h >= 0 || this.f40002r != null || this.f40003s != null)) {
            this.V = 3;
            this.f39996k0 = 5;
            this.W = 4;
        }
        if (i11 == 1) {
            v5Var = tn0Var.f41872c;
        } else {
            v5Var = v5Var2;
        }
        if ((i11 == 0 || i11 == 1) && v5Var != null) {
            ArrayList arrayList2 = v5Var.f47582l;
            int i12 = this.f39996k0;
            this.f39996k0 = i12 + 1;
            this.f39993h0 = i12;
            if (this.K == null) {
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) arrayList2.get(i13)).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        arrayList.add((TL_stars.TL_starGiftUnique) starGift);
                    }
                }
                int i14 = this.f39996k0;
                this.f39985b0 = i14;
                this.f39996k0 = arrayList.size() + i14;
                int size = arrayList.size() + this.f39991f0;
                this.f39991f0 = size;
                int i15 = this.f39996k0;
                this.f39987c0 = i15;
                if (!v5Var2.f47579i && v5Var2.f47580j) {
                    if (arrayList.isEmpty()) {
                        int i16 = this.f39996k0;
                        this.f39995j0 = i16;
                        this.f39996k0 = i16 + 2;
                        this.f39994i0 = i16 + 1;
                    }
                } else {
                    this.f39988d0 = i15;
                    int i17 = 3 - (size % 3);
                    if (size <= 0) {
                        i10 = 9;
                    } else if (i17 > 0) {
                        i10 = i17;
                    }
                    int i18 = i15 + i10;
                    this.f39996k0 = i18;
                    this.f39991f0 = size + i10;
                    this.f39989e0 = i18;
                }
                if (c()) {
                    v5Var.b();
                }
            } else if (this.J != null) {
                long e = org.telegram.messenger.d20.i(tn0.y0(tn0Var)).e();
                for (int i19 = 0; i19 < this.J.d.size(); i19++) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.J.d.get(i19);
                    if (org.telegram.messenger.o5.o(tL_starGiftUnique.owner_id) != e && org.telegram.messenger.o5.o(tL_starGiftUnique.host_id) != e) {
                        arrayList.add(tL_starGiftUnique);
                    }
                }
                int i20 = this.f39996k0;
                this.f39985b0 = i20;
                this.f39996k0 = arrayList.size() + i20;
                int size2 = arrayList.size() + this.f39991f0;
                this.f39991f0 = size2;
                int i21 = this.f39996k0;
                this.f39987c0 = i21;
                ph.h3 h3Var = this.J;
                if (h3Var.f45105t || !h3Var.f45106u) {
                    this.f39988d0 = i21;
                    int i22 = 3 - (size2 % 3);
                    if (size2 <= 0) {
                        i10 = 9;
                    } else if (i22 > 0) {
                        i10 = i22;
                    }
                    int i23 = i21 + i10;
                    this.f39996k0 = i23;
                    this.f39991f0 = size2 + i10;
                    this.f39989e0 = i23;
                }
                if (c()) {
                    this.J.g(false);
                }
            }
            int i24 = this.f39996k0;
            this.f39996k0 = i24 + 1;
            this.f39992g0 = i24;
        }
        int i25 = this.f39996k0;
        this.f39996k0 = i25 + 1;
        this.U = i25;
        sn0 sn0Var = this.E;
        if (sn0Var != null) {
            sn0Var.post(new dn0(this, 1));
        }
    }

    public final void l(sn0 sn0Var) {
        int i10;
        int i11 = org.telegram.ui.ActionBar.t6.f20929d6;
        tn0 tn0Var = this.f40001p0;
        int themedColor = tn0Var.getThemedColor(i11);
        tn0Var.getThemedColor(org.telegram.ui.ActionBar.t6.f20872a7);
        int themedColor2 = tn0Var.getThemedColor(org.telegram.ui.ActionBar.t6.f21330z6);
        int themedColor3 = tn0Var.getThemedColor(org.telegram.ui.ActionBar.t6.G6);
        sn0Var.f41616w.setColor(themedColor);
        sn0Var.f41618y = org.telegram.ui.ActionBar.t6.r1(0.06f, themedColor3);
        sn0Var.D = themedColor2;
        sn0Var.E = themedColor3;
        nb0 nb0Var = sn0Var.f41609a;
        for (int i12 = 0; i12 < nb0Var.getChildCount(); i12++) {
            View childAt = nb0Var.getChildAt(i12);
            int R = RecyclerView.R(childAt);
            if (R != -1 && (childAt instanceof TextView)) {
                TextView textView = (TextView) childAt;
                if (R == sn0Var.d) {
                    i10 = sn0Var.E;
                } else {
                    i10 = sn0Var.D;
                }
                textView.setTextColor(i10);
                childAt.invalidate();
            }
        }
        nb0Var.invalidate();
        sn0Var.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = this.m0;
        View view = this.f40005x;
        en0 en0Var = this.f39984b;
        if (i12 == 1) {
            super.onMeasure(i10, i11);
            in0 in0Var = this.f40004w;
            this.f39999n0 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + in0Var.getMeasuredHeight() + org.telegram.messenger.i0.f16020m;
            ((ViewGroup.MarginLayoutParams) in0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.f16020m;
            ((ViewGroup.MarginLayoutParams) en0Var.getLayoutParams()).topMargin = this.f39999n0 - org.telegram.messenger.i0.L(16.0f);
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.f39999n0 - org.telegram.messenger.i0.L(64.0f);
            ((ViewGroup.MarginLayoutParams) this.f40006y.getLayoutParams()).topMargin = this.f39999n0 - org.telegram.messenger.i0.L(16.0f);
            en0Var.setPadding(en0Var.getPaddingLeft(), org.telegram.messenger.i0.L(16.0f), en0Var.getPaddingRight(), en0Var.getPaddingBottom());
        } else {
            this.f39999n0 = org.telegram.messenger.i0.L(230.0f) + org.telegram.messenger.i0.f16020m;
            ((ViewGroup.MarginLayoutParams) en0Var.getLayoutParams()).topMargin = this.f39999n0;
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.f39999n0 - org.telegram.messenger.i0.L(64.0f);
            ((ViewGroup.MarginLayoutParams) this.f39982a.getLayoutParams()).height = this.f39999n0;
        }
        super.onMeasure(i10, i11);
    }
}
