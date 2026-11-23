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
    public static final int f47163r0 = 0;
    public cm0 E;
    public final im0 F;
    public View G;
    public boolean H;
    public boolean I;
    public TL_stars.TL_starGiftUnique J;
    public bi.a8 K;
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
    public final hm0 f47164a;
    public int f47165a0;
    public final ul0 f47166b;
    public int f47167b0;
    public final v4.t f47168c;
    public int f47169c0;
    public final wl0 d;
    public int f47170d0;
    public final j6.k f47171e;
    public int f47172e0;
    public gm0 f47173f;
    public int f47174f0;
    public int f47175g0;
    public int h;
    public int f47176h0;
    public int f47177i0;
    public int f47178j0;
    public int f47179k0;
    public int f47180l0;
    public final ArrayList m0;
    public long f47181n;
    public final int f47182n0;
    public int f47183o0;
    public am0 f47184p0;
    public final jm0 f47185q0;
    public TLRPC.TL_emojiStatusCollectible f47186r;
    public TLRPC.TL_peerColorCollectible f47187s;
    public final yl0 f47188w;
    public final View f47189x;
    public final View f47190y;

    public dm0(jm0 jm0Var, Context context, int i7) {
        super(context);
        int i10;
        this.f47185q0 = jm0Var;
        this.f47171e = new j6.k(19, false);
        this.h = -1;
        this.f47181n = 0L;
        this.f47186r = null;
        this.f47187s = null;
        this.L = null;
        this.M = new ArrayList();
        this.N = new HashMap();
        this.R = -1;
        this.S = -1;
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.f47165a0 = -1;
        this.f47167b0 = -1;
        this.f47169c0 = -1;
        this.f47170d0 = -1;
        this.f47172e0 = -1;
        this.f47174f0 = -1;
        this.f47175g0 = 0;
        this.f47176h0 = -1;
        this.f47177i0 = -1;
        this.f47178j0 = -1;
        this.f47179k0 = -1;
        this.m0 = new ArrayList();
        this.f47182n0 = i7;
        d();
        Context context2 = getContext();
        org.telegram.ui.ActionBar.i6 resourceProvider = jm0Var.getResourceProvider();
        dh.c cVar = jm0Var.H;
        ul0 ul0Var = new ul0(this, context2, resourceProvider, i7);
        this.f47166b = ul0Var;
        ul0Var.setClipToPadding(false);
        ul0Var.setSections(true);
        ((v4.l) ul0Var.getItemAnimator()).f59274m = false;
        getContext();
        v4.t tVar = new v4.t(3);
        this.f47168c = tVar;
        tVar.O = new bi.y2(this, 15);
        ul0Var.i(new ai.f0(this, 8));
        ul0Var.setLayoutManager(tVar);
        wl0 wl0Var = new wl0(this, context, i7);
        this.d = wl0Var;
        ul0Var.setAdapter(wl0Var);
        ul0Var.setOnItemClickListener(new org.telegram.ui.Components.nl0(this, i7, 1));
        ul0Var.j(new xl0(this, i7));
        addView(ul0Var, c8.na.c(-1.0f, -1));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.kq(2131232247, 0), 0, 1, 33);
        if (jm0Var.f49154a) {
            i10 = 2131752423;
        } else {
            i10 = 2131743508;
        }
        String N0 = org.telegram.messenger.gd.N0(i10, null);
        this.P = N0;
        this.O = new SpannableStringBuilder(spannableStringBuilder).append((CharSequence) " ").append((CharSequence) N0);
        this.Q = org.telegram.messenger.gd.N0(2131743507, null);
        f(false);
        v4.l lVar = new v4.l();
        lVar.n(350L);
        lVar.o(org.telegram.ui.Components.kr.h);
        lVar.C = false;
        lVar.f59274m = false;
        ul0Var.setItemAnimator(lVar);
        View view = new View(getContext());
        this.f47189x = view;
        dh.d dVar = new dh.d(cVar.c(view, null, false));
        dVar.b(-org.telegram.messenger.g0.L(24.0f), true);
        dVar.H = 220;
        view.setBackground(dVar);
        addView(view, c8.na.e(-1, 72, 55));
        if (i7 == 0) {
            this.f47164a = new hm0(jm0.k0(jm0Var), 0L, getContext(), jm0.l0(jm0Var));
            j(false);
        } else {
            View view2 = new View(getContext());
            this.f47190y = view2;
            dh.d dVar2 = new dh.d(cVar.c(view2, null, false));
            dVar2.b(-org.telegram.messenger.g0.L(16.0f), false);
            view2.setBackground(dVar2);
            addView(view2, c8.na.e(-1, 16, 55));
            yl0 yl0Var = new yl0(getContext(), jm0.m0(jm0Var), 3, 0L, jm0.n0(jm0Var));
            this.f47188w = yl0Var;
            yl0Var.setImportantForAccessibility(4);
            yl0Var.f30549x = jm0Var;
            yl0Var.setClipToOutline(true);
            bg.q0 q0Var = bg.u0.f3313a;
            yl0Var.setOutlineProvider(new bg.s0(0, org.telegram.messenger.g0.L(16.0f)));
            addView(yl0Var, c8.na.d(-1, -2.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        im0 im0Var = new im0(getContext(), jm0.o0(jm0Var));
        this.F = im0Var;
        fh.g c10 = jm0Var.F.c(im0Var, null, false);
        gh.e eVar = new gh.e(jm0.p0(jm0Var));
        eVar.f13620e = new g0.f(20);
        eVar.f(0, 0);
        eVar.e(0, 0);
        eVar.d(0, 0);
        c10.p(eVar);
        c10.r(org.telegram.messenger.g0.L(18.0f));
        c10.R.f11633e = true;
        im0Var.I = c10;
        im0Var.H = c10;
        im0Var.G = new tl0(this, 0);
        im0Var.setVisibility(4);
        addView(im0Var, c8.na.d(-1, 36.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        View view3 = this.f47164a;
        if (view3 != null) {
            addView(view3, c8.na.e(-1, -2, 55));
        }
        g();
        k();
        setWillNotDraw(false);
    }

    public static void a(dm0 dm0Var) {
        int i7;
        ul0 ul0Var = dm0Var.f47166b;
        boolean z10 = dm0Var.I;
        if (z10) {
            ul0Var.C0();
        }
        dm0Var.e();
        if (z10 && (i7 = dm0Var.f47177i0) >= 0) {
            dm0Var.f47168c.h1(i7, dm0Var.f47185q0.f49163f);
            ul0Var.post(new tl0(dm0Var, 1));
        }
    }

    public final boolean b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dm0.b():boolean");
    }

    public final boolean c() {
        ul0 ul0Var = this.f47166b;
        if (ul0Var != null) {
            for (int i7 = 0; i7 < ul0Var.getChildCount(); i7++) {
                if (ul0Var.getChildAt(i7) instanceof org.telegram.ui.Components.vz) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void d() {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible;
        int i7 = this.f47182n0;
        jm0 jm0Var = this.f47185q0;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible = null;
        if (i7 == 0) {
            TLRPC.User f10 = jm0Var.getUserConfig().f();
            this.h = org.telegram.messenger.n10.m(f10);
            this.f47181n = org.telegram.messenger.n10.n(f10);
            if (f10 != null) {
                TLRPC.EmojiStatus emojiStatus = f10.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                    this.f47186r = tL_emojiStatusCollectible;
                    this.f47187s = null;
                }
            }
            tL_emojiStatusCollectible = null;
            this.f47186r = tL_emojiStatusCollectible;
            this.f47187s = null;
        } else {
            TLRPC.User f11 = jm0Var.getUserConfig().f();
            this.h = org.telegram.messenger.n10.f(f11);
            this.f47181n = org.telegram.messenger.n10.g(f11);
            this.f47186r = null;
            if (f11 != null) {
                TLRPC.PeerColor peerColor = f11.color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                }
            }
            this.f47187s = tL_peerColorCollectible;
        }
        if (this.f47186r == null && this.f47187s == null) {
            return;
        }
        this.h = -1;
        this.f47181n = 0L;
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
        jm0 jm0Var = this.f47185q0;
        j6.k kVar = this.f47171e;
        if (tL_starGiftUnique != null) {
            cg.a resellAmount = tL_starGiftUnique.getResellAmount(cg.b.f5268a);
            if (tL_starGiftUnique.resale_ton_only) {
                kVar.f17343b = di.pb.t1(di.pb.V0(org.telegram.messenger.gd.a0(null, null, 2131745950, tL_starGiftUnique.getResellAmount(cg.b.f5269b).d()), true), true);
                kVar.f17344c = di.pb.T0(org.telegram.messenger.gd.H(',', "ResellGiftBuyEq", (int) resellAmount.a()));
            } else {
                kVar.f17343b = di.pb.T0(org.telegram.messenger.gd.H(',', "ResellGiftBuy", (int) resellAmount.a()));
                kVar.f17344c = null;
            }
        } else {
            if (!jm0Var.getUserConfig().q() && !jm0Var.f49154a) {
                obj = this.O;
            } else if (this.f47186r != null) {
                obj = this.Q;
            } else {
                obj = this.P;
            }
            kVar.f17343b = obj;
            kVar.f17344c = null;
        }
        if (jm0Var.H0() == this) {
            jm0Var.S = this;
            jm0Var.R.i((CharSequence) kVar.f17343b, z10, true);
            jm0Var.R.g((SpannableStringBuilder) kVar.f17344c, z10);
        }
    }

    public final void g() {
        hi.e eVar = this.f47185q0.R;
        if (eVar != null) {
            eVar.updateColors();
        }
        yl0 yl0Var = this.f47188w;
        if (yl0Var != null) {
            yl0Var.invalidate();
        }
        j(true);
        org.telegram.messenger.g0.d0(this.f47166b, new r3(this, 17));
        im0 im0Var = this.F;
        if (im0Var != null) {
            l(im0Var);
        }
    }

    public final void h() {
        int i7;
        boolean z10;
        int i10 = this.f47185q0.f49163f;
        float f10 = 0.0f;
        View view = this.f47189x;
        im0 im0Var = this.F;
        if (im0Var != null && (i7 = this.f47177i0) >= 0) {
            v4.t tVar = this.f47168c;
            this.G = tVar.m(i7);
            ul0 ul0Var = this.f47166b;
            int paddingTop = ul0Var.getPaddingTop() + i10;
            int L0 = tVar.L0();
            View view2 = this.G;
            if (view2 != null) {
                if (view2.getTop() <= paddingTop) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.I = z10;
                this.H = !z10;
                im0Var.setVisibility(0);
                im0Var.setTranslationY((Math.max(this.G.getTop(), paddingTop) + ul0Var.getTop()) - im0Var.getTop());
            } else if (L0 != -1 && L0 > this.f47177i0) {
                this.I = true;
                this.H = false;
                im0Var.setVisibility(0);
                im0Var.setTranslationY((ul0Var.getTop() + paddingTop) - im0Var.getTop());
            } else {
                this.I = false;
                this.H = false;
                im0Var.setVisibility(0);
                im0Var.setTranslationY((org.telegram.messenger.g0.L(1.0f) + getHeight()) - im0Var.getTop());
            }
            boolean z11 = this.H;
            if (im0Var.J != z11) {
                im0Var.J = z11;
                im0Var.invalidate();
            }
            if (this.I) {
                f10 = org.telegram.messenger.g0.L(36.0f) + i10;
            }
            view.setTranslationY(f10);
            ul0Var.invalidate();
            invalidate();
            return;
        }
        this.H = false;
        this.I = false;
        if (view != null) {
            view.setTranslationY(0.0f);
        }
        if (im0Var != null) {
            im0Var.setVisibility(4);
            boolean z12 = this.H;
            if (im0Var.J != z12) {
                im0Var.J = z12;
                im0Var.invalidate();
            }
        }
    }

    public final void i() {
        org.telegram.messenger.fj messageObject;
        yl0 yl0Var = this.f47188w;
        if (yl0Var != null) {
            org.telegram.ui.Cells.r1[] cells = yl0Var.getCells();
            for (int i7 = 0; i7 < cells.length; i7++) {
                org.telegram.ui.Cells.r1 r1Var = cells[i7];
                if (r1Var != null && (messageObject = r1Var.getMessageObject()) != null) {
                    messageObject.f24121w1 = true;
                    gm0 gm0Var = this.f47173f;
                    if (gm0Var != null) {
                        messageObject.f24047e1 = gm0Var.getColorId();
                    }
                    messageObject.f24052f1 = this.f47181n;
                    messageObject.f24057g1 = this.f47187s;
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
        jm0 jm0Var;
        ol0 ol0Var;
        gm0 gm0Var = this.f47173f;
        if (gm0Var != null) {
            gm0Var.a(this.h, z10);
        }
        hm0 hm0Var = this.f47164a;
        if (hm0Var != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.f47186r;
            if (tL_emojiStatusCollectible != null) {
                hm0Var.e(tL_emojiStatusCollectible.document_id, true, z10);
                hm0Var.c(org.telegram.messenger.bp.a(this.f47186r), z10);
                hm0Var.d(this.f47186r.pattern_document_id, true, z10);
            } else {
                long j3 = 0;
                if (org.telegram.messenger.n5.A()) {
                    hm0Var.e(0L, false, z10);
                } else {
                    TLRPC.User c22 = org.telegram.messenger.mp.u1(org.telegram.messenger.i10.f24637t0).c2(0L);
                    if (c22 != null) {
                        j3 = org.telegram.messenger.n5.f(c22.emoji_status);
                    }
                    hm0Var.e(j3, org.telegram.messenger.n5.A(), z10);
                }
                hm0Var.b(this.h, z10);
                hm0Var.d(this.f47181n, false, z10);
            }
        }
        int i10 = this.f47182n0;
        if (i10 == 0 && (ol0Var = (jm0Var = this.f47185q0).f49161e) != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = this.f47186r;
            if (tL_emojiStatusCollectible2 != null) {
                ol0Var.c(org.telegram.messenger.bp.a(tL_emojiStatusCollectible2), z10);
            } else {
                ol0Var.b(jm0.A0(jm0Var), this.h, z10);
            }
        }
        if (i10 == 0) {
            int i11 = this.W;
            k();
            wl0 wl0Var = this.d;
            if (i11 >= 0 && this.W < 0) {
                wl0Var.p(i11, 2);
            } else if (i11 < 0 && (i7 = this.W) >= 0) {
                wl0Var.o(i7, 2);
            }
        }
        int i12 = 0;
        while (true) {
            ul0 ul0Var = this.f47166b;
            if (i12 < ul0Var.getChildCount()) {
                View childAt = ul0Var.getChildAt(i12);
                if (childAt instanceof sl0) {
                    sl0 sl0Var = (sl0) childAt;
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible3 = this.f47186r;
                    if ((tL_emojiStatusCollectible3 != null && tL_emojiStatusCollectible3.collectible_id == sl0Var.getGiftId()) || ((tL_peerColorCollectible2 = this.f47187s) != null && tL_peerColorCollectible2.collectible_id == sl0Var.getGiftId())) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    sl0Var.b(z12, true);
                } else if (childAt instanceof bi.i3) {
                    bi.i3 i3Var = (bi.i3) childAt;
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible4 = this.f47186r;
                    if ((tL_emojiStatusCollectible4 != null && tL_emojiStatusCollectible4.collectible_id == i3Var.getGiftId()) || ((tL_peerColorCollectible = this.f47187s) != null && tL_peerColorCollectible.collectible_id == i3Var.getGiftId())) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    i3Var.f(z11, true);
                }
                i12++;
            } else {
                return;
            }
        }
    }

    public final void k() {
        di.p8 p8Var;
        jm0 jm0Var = this.f47185q0;
        di.p8 p8Var2 = jm0Var.f49156b;
        this.W = -1;
        this.f47165a0 = -1;
        this.f47167b0 = -1;
        this.f47169c0 = -1;
        this.f47172e0 = -1;
        this.f47174f0 = -1;
        this.f47170d0 = -1;
        this.f47176h0 = -1;
        this.f47177i0 = -1;
        this.f47178j0 = -1;
        this.f47179k0 = -1;
        this.f47175g0 = 0;
        ArrayList arrayList = this.m0;
        arrayList.clear();
        this.R = 0;
        this.T = 1;
        int i7 = 3;
        this.f47180l0 = 3;
        this.S = 2;
        int i10 = this.f47182n0;
        if (i10 == 0 && (this.h >= 0 || this.f47186r != null || this.f47187s != null)) {
            this.W = 3;
            this.f47180l0 = 5;
            this.f47165a0 = 4;
        }
        if (i10 == 1) {
            p8Var = jm0Var.f49158c;
        } else {
            p8Var = p8Var2;
        }
        if ((i10 == 0 || i10 == 1) && p8Var != null) {
            ArrayList arrayList2 = p8Var.f9513l;
            int i11 = this.f47180l0;
            this.f47180l0 = i11 + 1;
            this.f47177i0 = i11;
            if (this.L == null) {
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) arrayList2.get(i12)).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        arrayList.add((TL_stars.TL_starGiftUnique) starGift);
                    }
                }
                int i13 = this.f47180l0;
                this.f47169c0 = i13;
                this.f47180l0 = arrayList.size() + i13;
                int size = arrayList.size() + this.f47175g0;
                this.f47175g0 = size;
                int i14 = this.f47180l0;
                this.f47170d0 = i14;
                if (!p8Var2.f9510i && p8Var2.f9511j) {
                    if (arrayList.isEmpty()) {
                        int i15 = this.f47180l0;
                        this.f47179k0 = i15;
                        this.f47180l0 = i15 + 2;
                        this.f47178j0 = i15 + 1;
                    }
                } else {
                    this.f47172e0 = i14;
                    int i16 = 3 - (size % 3);
                    if (size <= 0) {
                        i7 = 9;
                    } else if (i16 > 0) {
                        i7 = i16;
                    }
                    int i17 = i14 + i7;
                    this.f47180l0 = i17;
                    this.f47175g0 = size + i7;
                    this.f47174f0 = i17;
                }
                if (c()) {
                    p8Var.a();
                }
            } else if (this.K != null) {
                long e10 = org.telegram.messenger.i10.i(jm0.z0(jm0Var)).e();
                for (int i18 = 0; i18 < this.K.d.size(); i18++) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.K.d.get(i18);
                    if (org.telegram.messenger.n5.o(tL_starGiftUnique.owner_id) != e10 && org.telegram.messenger.n5.o(tL_starGiftUnique.host_id) != e10) {
                        arrayList.add(tL_starGiftUnique);
                    }
                }
                int i19 = this.f47180l0;
                this.f47169c0 = i19;
                this.f47180l0 = arrayList.size() + i19;
                int size2 = arrayList.size() + this.f47175g0;
                this.f47175g0 = size2;
                int i20 = this.f47180l0;
                this.f47170d0 = i20;
                bi.a8 a8Var = this.K;
                if (a8Var.f3382y || !a8Var.f3383z) {
                    this.f47172e0 = i20;
                    int i21 = 3 - (size2 % 3);
                    if (size2 <= 0) {
                        i7 = 9;
                    } else if (i21 > 0) {
                        i7 = i21;
                    }
                    int i22 = i20 + i7;
                    this.f47180l0 = i22;
                    this.f47175g0 = size2 + i7;
                    this.f47174f0 = i22;
                }
                if (c()) {
                    this.K.l(false);
                }
            }
            int i23 = this.f47180l0;
            this.f47180l0 = i23 + 1;
            this.f47176h0 = i23;
        }
        int i24 = this.f47180l0;
        this.f47180l0 = i24 + 1;
        this.V = i24;
        im0 im0Var = this.F;
        if (im0Var != null) {
            im0Var.post(new tl0(this, 1));
        }
    }

    public final void l(im0 im0Var) {
        int i7;
        int i10 = org.telegram.ui.ActionBar.n6.f29451d6;
        jm0 jm0Var = this.f47185q0;
        int themedColor = jm0Var.getThemedColor(i10);
        jm0Var.getThemedColor(org.telegram.ui.ActionBar.n6.f29394a7);
        int themedColor2 = jm0Var.getThemedColor(org.telegram.ui.ActionBar.n6.f29862z6);
        int themedColor3 = jm0Var.getThemedColor(org.telegram.ui.ActionBar.n6.G6);
        im0Var.f48853w.setColor(themedColor);
        im0Var.f48855y = org.telegram.ui.ActionBar.n6.r1(0.06f, themedColor3);
        im0Var.E = themedColor2;
        im0Var.F = themedColor3;
        dt dtVar = im0Var.f48845a;
        for (int i11 = 0; i11 < dtVar.getChildCount(); i11++) {
            View childAt = dtVar.getChildAt(i11);
            int R = RecyclerView.R(childAt);
            if (R != -1 && (childAt instanceof TextView)) {
                TextView textView = (TextView) childAt;
                if (R == im0Var.d) {
                    i7 = im0Var.F;
                } else {
                    i7 = im0Var.E;
                }
                textView.setTextColor(i7);
                childAt.invalidate();
            }
        }
        dtVar.invalidate();
        im0Var.invalidate();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11 = this.f47182n0;
        View view = this.f47189x;
        ul0 ul0Var = this.f47166b;
        if (i11 == 1) {
            super.onMeasure(i7, i10);
            yl0 yl0Var = this.f47188w;
            this.f47183o0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + yl0Var.getMeasuredHeight() + org.telegram.messenger.g0.f24220m;
            ((ViewGroup.MarginLayoutParams) yl0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f24220m;
            ((ViewGroup.MarginLayoutParams) ul0Var.getLayoutParams()).topMargin = this.f47183o0 - org.telegram.messenger.g0.L(16.0f);
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.f47183o0 - org.telegram.messenger.g0.L(64.0f);
            ((ViewGroup.MarginLayoutParams) this.f47190y.getLayoutParams()).topMargin = this.f47183o0 - org.telegram.messenger.g0.L(16.0f);
            ul0Var.setPadding(ul0Var.getPaddingLeft(), org.telegram.messenger.g0.L(16.0f), ul0Var.getPaddingRight(), ul0Var.getPaddingBottom());
        } else {
            this.f47183o0 = org.telegram.messenger.g0.L(230.0f) + org.telegram.messenger.g0.f24220m;
            ((ViewGroup.MarginLayoutParams) ul0Var.getLayoutParams()).topMargin = this.f47183o0;
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.f47183o0 - org.telegram.messenger.g0.L(64.0f);
            ((ViewGroup.MarginLayoutParams) this.f47164a.getLayoutParams()).height = this.f47183o0;
        }
        super.onMeasure(i7, i10);
    }
}
