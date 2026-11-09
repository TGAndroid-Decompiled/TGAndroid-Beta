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
public final class dm0 extends FrameLayout {
    public static final int f45057q0 = 0;
    public cm0 D;
    public final im0 E;
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
    public final hm0 f45058a;
    public int f45059a0;
    public final ul0 f45060b;
    public int f45061b0;
    public final v4.s f45062c;
    public int f45063c0;
    public final wl0 d;
    public int f45064d0;
    public final j2.n f45065e;
    public int f45066e0;
    public gm0 f45067f;
    public int f45068f0;
    public int f45069g0;
    public int h;
    public int f45070h0;
    public int f45071i0;
    public int f45072j0;
    public int f45073k0;
    public final ArrayList f45074l0;
    public final int m0;
    public long f45075n;
    public int f45076n0;
    public am0 f45077o0;
    public final jm0 f45078p0;
    public TLRPC.TL_emojiStatusCollectible f45079r;
    public TLRPC.TL_peerColorCollectible f45080s;
    public final yl0 f45081w;
    public final View f45082x;
    public final View f45083y;

    public dm0(jm0 jm0Var, Context context, int i7) {
        super(context);
        int i10;
        this.f45078p0 = jm0Var;
        this.f45065e = new j2.n(20, false);
        this.h = -1;
        this.f45075n = 0L;
        this.f45079r = null;
        this.f45080s = null;
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
        this.f45059a0 = -1;
        this.f45061b0 = -1;
        this.f45063c0 = -1;
        this.f45064d0 = -1;
        this.f45066e0 = -1;
        this.f45068f0 = 0;
        this.f45069g0 = -1;
        this.f45070h0 = -1;
        this.f45071i0 = -1;
        this.f45072j0 = -1;
        this.f45074l0 = new ArrayList();
        this.m0 = i7;
        d();
        Context context2 = getContext();
        org.telegram.ui.ActionBar.g6 resourceProvider = jm0Var.getResourceProvider();
        dh.c cVar = jm0Var.G;
        ul0 ul0Var = new ul0(this, context2, resourceProvider, i7);
        this.f45060b = ul0Var;
        ul0Var.setClipToPadding(false);
        ul0Var.setSections(true);
        ((v4.k) ul0Var.getItemAnimator()).f57083m = false;
        getContext();
        v4.s sVar = new v4.s(3);
        this.f45062c = sVar;
        sVar.O = new ai.l(this, 12);
        ul0Var.i(new fi.o1(this, 7));
        ul0Var.setLayoutManager(sVar);
        wl0 wl0Var = new wl0(this, context, i7);
        this.d = wl0Var;
        ul0Var.setAdapter(wl0Var);
        ul0Var.setOnItemClickListener(new org.telegram.ui.Components.zk0(this, i7, 1));
        ul0Var.j(new xl0(this, i7));
        addView(ul0Var, c8.ha.c(-1.0f, -1));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.wp(2131232242, 0), 0, 1, 33);
        if (jm0Var.f47036a) {
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
        kVar.o(org.telegram.ui.Components.xq.h);
        kVar.C = false;
        kVar.f57083m = false;
        ul0Var.setItemAnimator(kVar);
        View view = new View(getContext());
        this.f45082x = view;
        dh.d dVar = new dh.d(cVar.c(view, null, false));
        dVar.b(-org.telegram.messenger.g0.L(24.0f), true);
        dVar.G = 220;
        view.setBackground(dVar);
        addView(view, c8.ha.e(-1, 72, 55));
        if (i7 == 0) {
            this.f45058a = new hm0(jm0.k0(jm0Var), 0L, getContext(), jm0.l0(jm0Var));
            j(false);
        } else {
            View view2 = new View(getContext());
            this.f45083y = view2;
            dh.d dVar2 = new dh.d(cVar.c(view2, null, false));
            dVar2.b(-org.telegram.messenger.g0.L(16.0f), false);
            view2.setBackground(dVar2);
            addView(view2, c8.ha.e(-1, 16, 55));
            yl0 yl0Var = new yl0(getContext(), jm0.m0(jm0Var), 3, 0L, jm0.n0(jm0Var));
            this.f45081w = yl0Var;
            yl0Var.setImportantForAccessibility(4);
            yl0Var.f31006x = jm0Var;
            yl0Var.setClipToOutline(true);
            bg.q0 q0Var = bg.u0.f3380a;
            yl0Var.setOutlineProvider(new bg.s0(0, org.telegram.messenger.g0.L(16.0f)));
            addView(yl0Var, c8.ha.d(-1, -2.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        im0 im0Var = new im0(getContext(), jm0.o0(jm0Var));
        this.E = im0Var;
        fh.g c10 = jm0Var.E.c(im0Var, null, false);
        gh.e eVar = new gh.e(jm0.p0(jm0Var));
        eVar.f13971e = new g2.c(17);
        eVar.f(0, 0);
        eVar.e(0, 0);
        eVar.d(0, 0);
        c10.p(eVar);
        c10.r(org.telegram.messenger.g0.L(18.0f));
        c10.Q.f11508e = true;
        im0Var.H = c10;
        im0Var.G = c10;
        im0Var.F = new tl0(this, 0);
        im0Var.setVisibility(4);
        addView(im0Var, c8.ha.d(-1, 36.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        View view3 = this.f45058a;
        if (view3 != null) {
            addView(view3, c8.ha.e(-1, -2, 55));
        }
        g();
        k();
        setWillNotDraw(false);
    }

    public static void a(dm0 dm0Var) {
        int i7;
        ul0 ul0Var = dm0Var.f45060b;
        boolean z9 = dm0Var.H;
        if (z9) {
            ul0Var.C0();
        }
        dm0Var.e();
        if (z9 && (i7 = dm0Var.f45070h0) >= 0) {
            dm0Var.f45062c.h1(i7, dm0Var.f45078p0.f47044f);
            ul0Var.post(new tl0(dm0Var, 1));
        }
    }

    public final boolean b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dm0.b():boolean");
    }

    public final boolean c() {
        ul0 ul0Var = this.f45060b;
        if (ul0Var != null) {
            for (int i7 = 0; i7 < ul0Var.getChildCount(); i7++) {
                if (ul0Var.getChildAt(i7) instanceof org.telegram.ui.Components.mz) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void d() {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible;
        int i7 = this.m0;
        jm0 jm0Var = this.f45078p0;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible = null;
        if (i7 == 0) {
            TLRPC.User f10 = jm0Var.getUserConfig().f();
            this.h = org.telegram.messenger.t10.l(f10);
            this.f45075n = org.telegram.messenger.t10.m(f10);
            if (f10 != null) {
                TLRPC.EmojiStatus emojiStatus = f10.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                    this.f45079r = tL_emojiStatusCollectible;
                    this.f45080s = null;
                }
            }
            tL_emojiStatusCollectible = null;
            this.f45079r = tL_emojiStatusCollectible;
            this.f45080s = null;
        } else {
            TLRPC.User f11 = jm0Var.getUserConfig().f();
            this.h = org.telegram.messenger.t10.e(f11);
            this.f45075n = org.telegram.messenger.t10.f(f11);
            this.f45079r = null;
            if (f11 != null) {
                TLRPC.PeerColor peerColor = f11.color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                }
            }
            this.f45080s = tL_peerColorCollectible;
        }
        if (this.f45079r == null && this.f45080s == null) {
            return;
        }
        this.h = -1;
        this.f45075n = 0L;
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
        jm0 jm0Var = this.f45078p0;
        j2.n nVar = this.f45065e;
        if (tL_starGiftUnique != null) {
            cg.a resellAmount = tL_starGiftUnique.getResellAmount(cg.b.f6160a);
            if (tL_starGiftUnique.resale_ton_only) {
                nVar.f16456b = bi.dd.s1(bi.dd.V0(org.telegram.messenger.id.a0(null, null, 2131746146, tL_starGiftUnique.getResellAmount(cg.b.f6161b).d()), true), true);
                nVar.f16457c = bi.dd.T0(org.telegram.messenger.id.H(',', "ResellGiftBuyEq", (int) resellAmount.a()));
            } else {
                nVar.f16456b = bi.dd.T0(org.telegram.messenger.id.H(',', "ResellGiftBuy", (int) resellAmount.a()));
                nVar.f16457c = null;
            }
        } else {
            if (!jm0Var.getUserConfig().q() && !jm0Var.f47036a) {
                obj = this.N;
            } else if (this.f45079r != null) {
                obj = this.P;
            } else {
                obj = this.O;
            }
            nVar.f16456b = obj;
            nVar.f16457c = null;
        }
        if (jm0Var.H0() == this) {
            jm0Var.R = this;
            jm0Var.Q.i((CharSequence) nVar.f16456b, z9, true);
            jm0Var.Q.g((SpannableStringBuilder) nVar.f16457c, z9);
        }
    }

    public final void g() {
        fi.d dVar = this.f45078p0.Q;
        if (dVar != null) {
            dVar.updateColors();
        }
        yl0 yl0Var = this.f45081w;
        if (yl0Var != null) {
            yl0Var.invalidate();
        }
        j(true);
        org.telegram.messenger.g0.d0(this.f45060b, new r3(this, 16));
        im0 im0Var = this.E;
        if (im0Var != null) {
            l(im0Var);
        }
    }

    public final void h() {
        int i7;
        boolean z9;
        int i10 = this.f45078p0.f47044f;
        float f10 = 0.0f;
        View view = this.f45082x;
        im0 im0Var = this.E;
        if (im0Var != null && (i7 = this.f45070h0) >= 0) {
            v4.s sVar = this.f45062c;
            this.F = sVar.m(i7);
            ul0 ul0Var = this.f45060b;
            int paddingTop = ul0Var.getPaddingTop() + i10;
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
                im0Var.setVisibility(0);
                im0Var.setTranslationY((Math.max(this.F.getTop(), paddingTop) + ul0Var.getTop()) - im0Var.getTop());
            } else if (L0 != -1 && L0 > this.f45070h0) {
                this.H = true;
                this.G = false;
                im0Var.setVisibility(0);
                im0Var.setTranslationY((ul0Var.getTop() + paddingTop) - im0Var.getTop());
            } else {
                this.H = false;
                this.G = false;
                im0Var.setVisibility(0);
                im0Var.setTranslationY((org.telegram.messenger.g0.L(1.0f) + getHeight()) - im0Var.getTop());
            }
            boolean z10 = this.G;
            if (im0Var.I != z10) {
                im0Var.I = z10;
                im0Var.invalidate();
            }
            if (this.H) {
                f10 = org.telegram.messenger.g0.L(36.0f) + i10;
            }
            view.setTranslationY(f10);
            ul0Var.invalidate();
            invalidate();
            return;
        }
        this.G = false;
        this.H = false;
        if (view != null) {
            view.setTranslationY(0.0f);
        }
        if (im0Var != null) {
            im0Var.setVisibility(4);
            boolean z11 = this.G;
            if (im0Var.I != z11) {
                im0Var.I = z11;
                im0Var.invalidate();
            }
        }
    }

    public final void i() {
        org.telegram.messenger.ij messageObject;
        yl0 yl0Var = this.f45081w;
        if (yl0Var != null) {
            org.telegram.ui.Cells.q1[] cells = yl0Var.getCells();
            for (int i7 = 0; i7 < cells.length; i7++) {
                org.telegram.ui.Cells.q1 q1Var = cells[i7];
                if (q1Var != null && (messageObject = q1Var.getMessageObject()) != null) {
                    messageObject.f23301u1 = true;
                    gm0 gm0Var = this.f45067f;
                    if (gm0Var != null) {
                        messageObject.f23228c1 = gm0Var.getColorId();
                    }
                    messageObject.f23232d1 = this.f45075n;
                    messageObject.f23236e1 = this.f45080s;
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
        jm0 jm0Var;
        ol0 ol0Var;
        gm0 gm0Var = this.f45067f;
        if (gm0Var != null) {
            gm0Var.a(this.h, z9);
        }
        hm0 hm0Var = this.f45058a;
        if (hm0Var != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.f45079r;
            if (tL_emojiStatusCollectible != null) {
                hm0Var.e(tL_emojiStatusCollectible.document_id, true, z9);
                hm0Var.c(org.telegram.messenger.fp.a(this.f45079r), z9);
                hm0Var.d(this.f45079r.pattern_document_id, true, z9);
            } else {
                long j3 = 0;
                if (org.telegram.messenger.m5.A()) {
                    hm0Var.e(0L, false, z9);
                } else {
                    TLRPC.User a22 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24470s0).a2(0L);
                    if (a22 != null) {
                        j3 = org.telegram.messenger.m5.f(a22.emoji_status);
                    }
                    hm0Var.e(j3, org.telegram.messenger.m5.A(), z9);
                }
                hm0Var.b(this.h, z9);
                hm0Var.d(this.f45075n, false, z9);
            }
        }
        int i10 = this.m0;
        if (i10 == 0 && (ol0Var = (jm0Var = this.f45078p0).f47043e) != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = this.f45079r;
            if (tL_emojiStatusCollectible2 != null) {
                ol0Var.c(org.telegram.messenger.fp.a(tL_emojiStatusCollectible2), z9);
            } else {
                ol0Var.b(jm0.A0(jm0Var), this.h, z9);
            }
        }
        if (i10 == 0) {
            int i11 = this.V;
            k();
            wl0 wl0Var = this.d;
            if (i11 >= 0 && this.V < 0) {
                wl0Var.p(i11, 2);
            } else if (i11 < 0 && (i7 = this.V) >= 0) {
                wl0Var.o(i7, 2);
            }
        }
        int i12 = 0;
        while (true) {
            ul0 ul0Var = this.f45060b;
            if (i12 < ul0Var.getChildCount()) {
                View childAt = ul0Var.getChildAt(i12);
                if (childAt instanceof sl0) {
                    sl0 sl0Var = (sl0) childAt;
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible3 = this.f45079r;
                    if ((tL_emojiStatusCollectible3 != null && tL_emojiStatusCollectible3.collectible_id == sl0Var.getGiftId()) || ((tL_peerColorCollectible2 = this.f45080s) != null && tL_peerColorCollectible2.collectible_id == sl0Var.getGiftId())) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    sl0Var.b(z11, true);
                } else if (childAt instanceof zh.y0) {
                    zh.y0 y0Var = (zh.y0) childAt;
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible4 = this.f45079r;
                    if ((tL_emojiStatusCollectible4 != null && tL_emojiStatusCollectible4.collectible_id == y0Var.getGiftId()) || ((tL_peerColorCollectible = this.f45080s) != null && tL_peerColorCollectible.collectible_id == y0Var.getGiftId())) {
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
        jm0 jm0Var = this.f45078p0;
        bi.v9 v9Var2 = jm0Var.f47038b;
        this.V = -1;
        this.W = -1;
        this.f45059a0 = -1;
        this.f45061b0 = -1;
        this.f45064d0 = -1;
        this.f45066e0 = -1;
        this.f45063c0 = -1;
        this.f45069g0 = -1;
        this.f45070h0 = -1;
        this.f45071i0 = -1;
        this.f45072j0 = -1;
        this.f45068f0 = 0;
        ArrayList arrayList = this.f45074l0;
        arrayList.clear();
        this.Q = 0;
        this.S = 1;
        int i7 = 3;
        this.f45073k0 = 3;
        this.R = 2;
        int i10 = this.m0;
        if (i10 == 0 && (this.h >= 0 || this.f45079r != null || this.f45080s != null)) {
            this.V = 3;
            this.f45073k0 = 5;
            this.W = 4;
        }
        if (i10 == 1) {
            v9Var = jm0Var.f47040c;
        } else {
            v9Var = v9Var2;
        }
        if ((i10 == 0 || i10 == 1) && v9Var != null) {
            ArrayList arrayList2 = v9Var.f4913l;
            int i11 = this.f45073k0;
            this.f45073k0 = i11 + 1;
            this.f45070h0 = i11;
            if (this.K == null) {
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) arrayList2.get(i12)).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        arrayList.add((TL_stars.TL_starGiftUnique) starGift);
                    }
                }
                int i13 = this.f45073k0;
                this.f45061b0 = i13;
                this.f45073k0 = arrayList.size() + i13;
                int size = arrayList.size() + this.f45068f0;
                this.f45068f0 = size;
                int i14 = this.f45073k0;
                this.f45063c0 = i14;
                if (!v9Var2.f4910i && v9Var2.f4911j) {
                    if (arrayList.isEmpty()) {
                        int i15 = this.f45073k0;
                        this.f45072j0 = i15;
                        this.f45073k0 = i15 + 2;
                        this.f45071i0 = i15 + 1;
                    }
                } else {
                    this.f45064d0 = i14;
                    int i16 = 3 - (size % 3);
                    if (size <= 0) {
                        i7 = 9;
                    } else if (i16 > 0) {
                        i7 = i16;
                    }
                    int i17 = i14 + i7;
                    this.f45073k0 = i17;
                    this.f45068f0 = size + i7;
                    this.f45066e0 = i17;
                }
                if (c()) {
                    v9Var.a();
                }
            } else if (this.J != null) {
                long e10 = org.telegram.messenger.p10.i(jm0.z0(jm0Var)).e();
                for (int i18 = 0; i18 < this.J.d.size(); i18++) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.J.d.get(i18);
                    if (org.telegram.messenger.m5.o(tL_starGiftUnique.owner_id) != e10 && org.telegram.messenger.m5.o(tL_starGiftUnique.host_id) != e10) {
                        arrayList.add(tL_starGiftUnique);
                    }
                }
                int i19 = this.f45073k0;
                this.f45061b0 = i19;
                this.f45073k0 = arrayList.size() + i19;
                int size2 = arrayList.size() + this.f45068f0;
                this.f45068f0 = size2;
                int i20 = this.f45073k0;
                this.f45063c0 = i20;
                zh.c3 c3Var = this.J;
                if (c3Var.f60278t || !c3Var.f60279u) {
                    this.f45064d0 = i20;
                    int i21 = 3 - (size2 % 3);
                    if (size2 <= 0) {
                        i7 = 9;
                    } else if (i21 > 0) {
                        i7 = i21;
                    }
                    int i22 = i20 + i7;
                    this.f45073k0 = i22;
                    this.f45068f0 = size2 + i7;
                    this.f45066e0 = i22;
                }
                if (c()) {
                    this.J.g(false);
                }
            }
            int i23 = this.f45073k0;
            this.f45073k0 = i23 + 1;
            this.f45069g0 = i23;
        }
        int i24 = this.f45073k0;
        this.f45073k0 = i24 + 1;
        this.U = i24;
        im0 im0Var = this.E;
        if (im0Var != null) {
            im0Var.post(new tl0(this, 1));
        }
    }

    public final void l(im0 im0Var) {
        int i7;
        int i10 = org.telegram.ui.ActionBar.l6.f27865d6;
        jm0 jm0Var = this.f45078p0;
        int themedColor = jm0Var.getThemedColor(i10);
        jm0Var.getThemedColor(org.telegram.ui.ActionBar.l6.f27809a7);
        int themedColor2 = jm0Var.getThemedColor(org.telegram.ui.ActionBar.l6.f28275z6);
        int themedColor3 = jm0Var.getThemedColor(org.telegram.ui.ActionBar.l6.G6);
        im0Var.f46699w.setColor(themedColor);
        im0Var.f46701y = org.telegram.ui.ActionBar.l6.r1(0.06f, themedColor3);
        im0Var.D = themedColor2;
        im0Var.E = themedColor3;
        bt btVar = im0Var.f46691a;
        for (int i11 = 0; i11 < btVar.getChildCount(); i11++) {
            View childAt = btVar.getChildAt(i11);
            int R = RecyclerView.R(childAt);
            if (R != -1 && (childAt instanceof TextView)) {
                TextView textView = (TextView) childAt;
                if (R == im0Var.d) {
                    i7 = im0Var.E;
                } else {
                    i7 = im0Var.D;
                }
                textView.setTextColor(i7);
                childAt.invalidate();
            }
        }
        btVar.invalidate();
        im0Var.invalidate();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11 = this.m0;
        View view = this.f45082x;
        ul0 ul0Var = this.f45060b;
        if (i11 == 1) {
            super.onMeasure(i7, i10);
            yl0 yl0Var = this.f45081w;
            this.f45076n0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + yl0Var.getMeasuredHeight() + org.telegram.messenger.g0.f22557m;
            ((ViewGroup.MarginLayoutParams) yl0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22557m;
            ((ViewGroup.MarginLayoutParams) ul0Var.getLayoutParams()).topMargin = this.f45076n0 - org.telegram.messenger.g0.L(16.0f);
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.f45076n0 - org.telegram.messenger.g0.L(64.0f);
            ((ViewGroup.MarginLayoutParams) this.f45083y.getLayoutParams()).topMargin = this.f45076n0 - org.telegram.messenger.g0.L(16.0f);
            ul0Var.setPadding(ul0Var.getPaddingLeft(), org.telegram.messenger.g0.L(16.0f), ul0Var.getPaddingRight(), ul0Var.getPaddingBottom());
        } else {
            this.f45076n0 = org.telegram.messenger.g0.L(230.0f) + org.telegram.messenger.g0.f22557m;
            ((ViewGroup.MarginLayoutParams) ul0Var.getLayoutParams()).topMargin = this.f45076n0;
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.f45076n0 - org.telegram.messenger.g0.L(64.0f);
            ((ViewGroup.MarginLayoutParams) this.f45058a.getLayoutParams()).height = this.f45076n0;
        }
        super.onMeasure(i7, i10);
    }
}
