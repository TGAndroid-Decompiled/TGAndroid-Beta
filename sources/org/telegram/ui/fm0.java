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
public final class fm0 extends FrameLayout {
    public static final int f47764r0 = 0;
    public em0 E;
    public final km0 F;
    public View G;
    public boolean H;
    public boolean I;
    public TL_stars.TL_starGiftUnique J;
    public bi.x7 K;
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
    public final jm0 f47765a;
    public int f47766a0;
    public final wl0 f47767b;
    public int f47768b0;
    public final v4.t f47769c;
    public int f47770c0;
    public final yl0 d;
    public int f47771d0;
    public final ji.l f47772e;
    public int f47773e0;
    public im0 f47774f;
    public int f47775f0;
    public int f47776g0;
    public int h;
    public int f47777h0;
    public int f47778i0;
    public int f47779j0;
    public int f47780k0;
    public int f47781l0;
    public final ArrayList m0;
    public long f47782n;
    public final int f47783n0;
    public int f47784o0;
    public cm0 f47785p0;
    public final lm0 f47786q0;
    public TLRPC.TL_emojiStatusCollectible f47787r;
    public TLRPC.TL_peerColorCollectible f47788s;
    public final am0 f47789w;
    public final View f47790x;
    public final View f47791y;

    public fm0(lm0 lm0Var, Context context, int i7) {
        super(context);
        int i10;
        this.f47786q0 = lm0Var;
        this.f47772e = new ji.l(18, false);
        this.h = -1;
        this.f47782n = 0L;
        this.f47787r = null;
        this.f47788s = null;
        this.L = null;
        this.M = new ArrayList();
        this.N = new HashMap();
        this.R = -1;
        this.S = -1;
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.f47766a0 = -1;
        this.f47768b0 = -1;
        this.f47770c0 = -1;
        this.f47771d0 = -1;
        this.f47773e0 = -1;
        this.f47775f0 = -1;
        this.f47776g0 = 0;
        this.f47777h0 = -1;
        this.f47778i0 = -1;
        this.f47779j0 = -1;
        this.f47780k0 = -1;
        this.m0 = new ArrayList();
        this.f47783n0 = i7;
        d();
        Context context2 = getContext();
        org.telegram.ui.ActionBar.h6 resourceProvider = lm0Var.getResourceProvider();
        dh.c cVar = lm0Var.H;
        wl0 wl0Var = new wl0(this, context2, resourceProvider, i7);
        this.f47767b = wl0Var;
        wl0Var.setClipToPadding(false);
        wl0Var.setSections(true);
        ((v4.k) wl0Var.getItemAnimator()).f59194m = false;
        getContext();
        v4.t tVar = new v4.t(3);
        this.f47769c = tVar;
        tVar.O = new bi.w2(this, 15);
        wl0Var.i(new ai.j0(this, 8));
        wl0Var.setLayoutManager(tVar);
        yl0 yl0Var = new yl0(this, context, i7);
        this.d = yl0Var;
        wl0Var.setAdapter(yl0Var);
        wl0Var.setOnItemClickListener(new org.telegram.ui.Components.nl0(this, i7, 1));
        wl0Var.j(new zl0(this, i7));
        addView(wl0Var, c8.ma.c(-1.0f, -1));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.nq(2131232244, 0), 0, 1, 33);
        if (lm0Var.f49646a) {
            i10 = 2131752423;
        } else {
            i10 = 2131743510;
        }
        String N0 = org.telegram.messenger.hd.N0(i10, null);
        this.P = N0;
        this.O = new SpannableStringBuilder(spannableStringBuilder).append((CharSequence) " ").append((CharSequence) N0);
        this.Q = org.telegram.messenger.hd.N0(2131743509, null);
        f(false);
        v4.k kVar = new v4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.nr.h);
        kVar.C = false;
        kVar.f59194m = false;
        wl0Var.setItemAnimator(kVar);
        View view = new View(getContext());
        this.f47790x = view;
        dh.d dVar = new dh.d(cVar.c(view, null, false));
        dVar.b(-org.telegram.messenger.g0.L(24.0f), true);
        dVar.H = 220;
        view.setBackground(dVar);
        addView(view, c8.ma.e(-1, 72, 55));
        if (i7 == 0) {
            this.f47765a = new jm0(lm0.k0(lm0Var), 0L, getContext(), lm0.l0(lm0Var));
            j(false);
        } else {
            View view2 = new View(getContext());
            this.f47791y = view2;
            dh.d dVar2 = new dh.d(cVar.c(view2, null, false));
            dVar2.b(-org.telegram.messenger.g0.L(16.0f), false);
            view2.setBackground(dVar2);
            addView(view2, c8.ma.e(-1, 16, 55));
            am0 am0Var = new am0(getContext(), lm0.m0(lm0Var), 3, 0L, lm0.n0(lm0Var));
            this.f47789w = am0Var;
            am0Var.setImportantForAccessibility(4);
            am0Var.f30498x = lm0Var;
            am0Var.setClipToOutline(true);
            bg.q0 q0Var = bg.u0.f3362a;
            am0Var.setOutlineProvider(new bg.s0(0, org.telegram.messenger.g0.L(16.0f)));
            addView(am0Var, c8.ma.d(-1, -2.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        km0 km0Var = new km0(getContext(), lm0.o0(lm0Var));
        this.F = km0Var;
        fh.g c10 = lm0Var.F.c(km0Var, null, false);
        gh.e eVar = new gh.e(lm0.p0(lm0Var));
        eVar.f13657e = new g0.e(20);
        eVar.f(0, 0);
        eVar.e(0, 0);
        eVar.d(0, 0);
        c10.p(eVar);
        c10.r(org.telegram.messenger.g0.L(18.0f));
        c10.R.f11671e = true;
        km0Var.I = c10;
        km0Var.H = c10;
        km0Var.G = new vl0(this, 0);
        km0Var.setVisibility(4);
        addView(km0Var, c8.ma.d(-1, 36.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        View view3 = this.f47765a;
        if (view3 != null) {
            addView(view3, c8.ma.e(-1, -2, 55));
        }
        g();
        k();
        setWillNotDraw(false);
    }

    public static void a(fm0 fm0Var) {
        int i7;
        wl0 wl0Var = fm0Var.f47767b;
        boolean z10 = fm0Var.I;
        if (z10) {
            wl0Var.C0();
        }
        fm0Var.e();
        if (z10 && (i7 = fm0Var.f47778i0) >= 0) {
            fm0Var.f47769c.h1(i7, fm0Var.f47786q0.f49655f);
            wl0Var.post(new vl0(fm0Var, 1));
        }
    }

    public final boolean b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fm0.b():boolean");
    }

    public final boolean c() {
        wl0 wl0Var = this.f47767b;
        if (wl0Var != null) {
            for (int i7 = 0; i7 < wl0Var.getChildCount(); i7++) {
                if (wl0Var.getChildAt(i7) instanceof org.telegram.ui.Components.yz) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void d() {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible;
        int i7 = this.f47783n0;
        lm0 lm0Var = this.f47786q0;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible = null;
        if (i7 == 0) {
            TLRPC.User f10 = lm0Var.getUserConfig().f();
            this.h = org.telegram.messenger.p10.m(f10);
            this.f47782n = org.telegram.messenger.p10.n(f10);
            if (f10 != null) {
                TLRPC.EmojiStatus emojiStatus = f10.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                    this.f47787r = tL_emojiStatusCollectible;
                    this.f47788s = null;
                }
            }
            tL_emojiStatusCollectible = null;
            this.f47787r = tL_emojiStatusCollectible;
            this.f47788s = null;
        } else {
            TLRPC.User f11 = lm0Var.getUserConfig().f();
            this.h = org.telegram.messenger.p10.f(f11);
            this.f47782n = org.telegram.messenger.p10.g(f11);
            this.f47787r = null;
            if (f11 != null) {
                TLRPC.PeerColor peerColor = f11.color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                }
            }
            this.f47788s = tL_peerColorCollectible;
        }
        if (this.f47787r == null && this.f47788s == null) {
            return;
        }
        this.h = -1;
        this.f47782n = 0L;
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
        lm0 lm0Var = this.f47786q0;
        ji.l lVar = this.f47772e;
        if (tL_starGiftUnique != null) {
            cg.a resellAmount = tL_starGiftUnique.getResellAmount(cg.b.f5305a);
            if (tL_starGiftUnique.resale_ton_only) {
                lVar.f17979b = di.pb.t1(di.pb.V0(org.telegram.messenger.hd.a0(null, null, 2131745950, tL_starGiftUnique.getResellAmount(cg.b.f5306b).d()), true), true);
                lVar.f17980c = di.pb.T0(org.telegram.messenger.hd.H(',', "ResellGiftBuyEq", (int) resellAmount.a()));
            } else {
                lVar.f17979b = di.pb.T0(org.telegram.messenger.hd.H(',', "ResellGiftBuy", (int) resellAmount.a()));
                lVar.f17980c = null;
            }
        } else {
            if (!lm0Var.getUserConfig().q() && !lm0Var.f49646a) {
                obj = this.O;
            } else if (this.f47787r != null) {
                obj = this.Q;
            } else {
                obj = this.P;
            }
            lVar.f17979b = obj;
            lVar.f17980c = null;
        }
        if (lm0Var.H0() == this) {
            lm0Var.S = this;
            lm0Var.R.i((CharSequence) lVar.f17979b, z10, true);
            lm0Var.R.g((SpannableStringBuilder) lVar.f17980c, z10);
        }
    }

    public final void g() {
        hi.e eVar = this.f47786q0.R;
        if (eVar != null) {
            eVar.updateColors();
        }
        am0 am0Var = this.f47789w;
        if (am0Var != null) {
            am0Var.invalidate();
        }
        j(true);
        org.telegram.messenger.g0.d0(this.f47767b, new r3(this, 17));
        km0 km0Var = this.F;
        if (km0Var != null) {
            l(km0Var);
        }
    }

    public final void h() {
        int i7;
        boolean z10;
        int i10 = this.f47786q0.f49655f;
        float f10 = 0.0f;
        View view = this.f47790x;
        km0 km0Var = this.F;
        if (km0Var != null && (i7 = this.f47778i0) >= 0) {
            v4.t tVar = this.f47769c;
            this.G = tVar.m(i7);
            wl0 wl0Var = this.f47767b;
            int paddingTop = wl0Var.getPaddingTop() + i10;
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
                km0Var.setVisibility(0);
                km0Var.setTranslationY((Math.max(this.G.getTop(), paddingTop) + wl0Var.getTop()) - km0Var.getTop());
            } else if (L0 != -1 && L0 > this.f47778i0) {
                this.I = true;
                this.H = false;
                km0Var.setVisibility(0);
                km0Var.setTranslationY((wl0Var.getTop() + paddingTop) - km0Var.getTop());
            } else {
                this.I = false;
                this.H = false;
                km0Var.setVisibility(0);
                km0Var.setTranslationY((org.telegram.messenger.g0.L(1.0f) + getHeight()) - km0Var.getTop());
            }
            boolean z11 = this.H;
            if (km0Var.J != z11) {
                km0Var.J = z11;
                km0Var.invalidate();
            }
            if (this.I) {
                f10 = org.telegram.messenger.g0.L(36.0f) + i10;
            }
            view.setTranslationY(f10);
            wl0Var.invalidate();
            invalidate();
            return;
        }
        this.H = false;
        this.I = false;
        if (view != null) {
            view.setTranslationY(0.0f);
        }
        if (km0Var != null) {
            km0Var.setVisibility(4);
            boolean z12 = this.H;
            if (km0Var.J != z12) {
                km0Var.J = z12;
                km0Var.invalidate();
            }
        }
    }

    public final void i() {
        org.telegram.messenger.gj messageObject;
        am0 am0Var = this.f47789w;
        if (am0Var != null) {
            org.telegram.ui.Cells.r1[] cells = am0Var.getCells();
            for (int i7 = 0; i7 < cells.length; i7++) {
                org.telegram.ui.Cells.r1 r1Var = cells[i7];
                if (r1Var != null && (messageObject = r1Var.getMessageObject()) != null) {
                    messageObject.f24261w1 = true;
                    im0 im0Var = this.f47774f;
                    if (im0Var != null) {
                        messageObject.f24187e1 = im0Var.getColorId();
                    }
                    messageObject.f24192f1 = this.f47782n;
                    messageObject.f24197g1 = this.f47788s;
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
        lm0 lm0Var;
        ql0 ql0Var;
        im0 im0Var = this.f47774f;
        if (im0Var != null) {
            im0Var.a(this.h, z10);
        }
        jm0 jm0Var = this.f47765a;
        if (jm0Var != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.f47787r;
            if (tL_emojiStatusCollectible != null) {
                jm0Var.e(tL_emojiStatusCollectible.document_id, true, z10);
                jm0Var.c(org.telegram.messenger.cp.a(this.f47787r), z10);
                jm0Var.d(this.f47787r.pattern_document_id, true, z10);
            } else {
                long j3 = 0;
                if (org.telegram.messenger.n5.A()) {
                    jm0Var.e(0L, false, z10);
                } else {
                    TLRPC.User c22 = org.telegram.messenger.np.u1(org.telegram.messenger.k10.f24968t0).c2(0L);
                    if (c22 != null) {
                        j3 = org.telegram.messenger.n5.f(c22.emoji_status);
                    }
                    jm0Var.e(j3, org.telegram.messenger.n5.A(), z10);
                }
                jm0Var.b(this.h, z10);
                jm0Var.d(this.f47782n, false, z10);
            }
        }
        int i10 = this.f47783n0;
        if (i10 == 0 && (ql0Var = (lm0Var = this.f47786q0).f49653e) != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = this.f47787r;
            if (tL_emojiStatusCollectible2 != null) {
                ql0Var.c(org.telegram.messenger.cp.a(tL_emojiStatusCollectible2), z10);
            } else {
                ql0Var.b(lm0.A0(lm0Var), this.h, z10);
            }
        }
        if (i10 == 0) {
            int i11 = this.W;
            k();
            yl0 yl0Var = this.d;
            if (i11 >= 0 && this.W < 0) {
                yl0Var.p(i11, 2);
            } else if (i11 < 0 && (i7 = this.W) >= 0) {
                yl0Var.o(i7, 2);
            }
        }
        int i12 = 0;
        while (true) {
            wl0 wl0Var = this.f47767b;
            if (i12 < wl0Var.getChildCount()) {
                View childAt = wl0Var.getChildAt(i12);
                if (childAt instanceof ul0) {
                    ul0 ul0Var = (ul0) childAt;
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible3 = this.f47787r;
                    if ((tL_emojiStatusCollectible3 != null && tL_emojiStatusCollectible3.collectible_id == ul0Var.getGiftId()) || ((tL_peerColorCollectible2 = this.f47788s) != null && tL_peerColorCollectible2.collectible_id == ul0Var.getGiftId())) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    ul0Var.b(z12, true);
                } else if (childAt instanceof bi.g3) {
                    bi.g3 g3Var = (bi.g3) childAt;
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible4 = this.f47787r;
                    if ((tL_emojiStatusCollectible4 != null && tL_emojiStatusCollectible4.collectible_id == g3Var.getGiftId()) || ((tL_peerColorCollectible = this.f47788s) != null && tL_peerColorCollectible.collectible_id == g3Var.getGiftId())) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    g3Var.f(z11, true);
                }
                i12++;
            } else {
                return;
            }
        }
    }

    public final void k() {
        di.p8 p8Var;
        lm0 lm0Var = this.f47786q0;
        di.p8 p8Var2 = lm0Var.f49648b;
        this.W = -1;
        this.f47766a0 = -1;
        this.f47768b0 = -1;
        this.f47770c0 = -1;
        this.f47773e0 = -1;
        this.f47775f0 = -1;
        this.f47771d0 = -1;
        this.f47777h0 = -1;
        this.f47778i0 = -1;
        this.f47779j0 = -1;
        this.f47780k0 = -1;
        this.f47776g0 = 0;
        ArrayList arrayList = this.m0;
        arrayList.clear();
        this.R = 0;
        this.T = 1;
        int i7 = 3;
        this.f47781l0 = 3;
        this.S = 2;
        int i10 = this.f47783n0;
        if (i10 == 0 && (this.h >= 0 || this.f47787r != null || this.f47788s != null)) {
            this.W = 3;
            this.f47781l0 = 5;
            this.f47766a0 = 4;
        }
        if (i10 == 1) {
            p8Var = lm0Var.f49650c;
        } else {
            p8Var = p8Var2;
        }
        if ((i10 == 0 || i10 == 1) && p8Var != null) {
            ArrayList arrayList2 = p8Var.f9552l;
            int i11 = this.f47781l0;
            this.f47781l0 = i11 + 1;
            this.f47778i0 = i11;
            if (this.L == null) {
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) arrayList2.get(i12)).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        arrayList.add((TL_stars.TL_starGiftUnique) starGift);
                    }
                }
                int i13 = this.f47781l0;
                this.f47770c0 = i13;
                this.f47781l0 = arrayList.size() + i13;
                int size = arrayList.size() + this.f47776g0;
                this.f47776g0 = size;
                int i14 = this.f47781l0;
                this.f47771d0 = i14;
                if (!p8Var2.f9549i && p8Var2.f9550j) {
                    if (arrayList.isEmpty()) {
                        int i15 = this.f47781l0;
                        this.f47780k0 = i15;
                        this.f47781l0 = i15 + 2;
                        this.f47779j0 = i15 + 1;
                    }
                } else {
                    this.f47773e0 = i14;
                    int i16 = 3 - (size % 3);
                    if (size <= 0) {
                        i7 = 9;
                    } else if (i16 > 0) {
                        i7 = i16;
                    }
                    int i17 = i14 + i7;
                    this.f47781l0 = i17;
                    this.f47776g0 = size + i7;
                    this.f47775f0 = i17;
                }
                if (c()) {
                    p8Var.a();
                }
            } else if (this.K != null) {
                long e10 = org.telegram.messenger.k10.i(lm0.z0(lm0Var)).e();
                for (int i18 = 0; i18 < this.K.d.size(); i18++) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.K.d.get(i18);
                    if (org.telegram.messenger.n5.o(tL_starGiftUnique.owner_id) != e10 && org.telegram.messenger.n5.o(tL_starGiftUnique.host_id) != e10) {
                        arrayList.add(tL_starGiftUnique);
                    }
                }
                int i19 = this.f47781l0;
                this.f47770c0 = i19;
                this.f47781l0 = arrayList.size() + i19;
                int size2 = arrayList.size() + this.f47776g0;
                this.f47776g0 = size2;
                int i20 = this.f47781l0;
                this.f47771d0 = i20;
                bi.x7 x7Var = this.K;
                if (x7Var.f4275y || !x7Var.f4276z) {
                    this.f47773e0 = i20;
                    int i21 = 3 - (size2 % 3);
                    if (size2 <= 0) {
                        i7 = 9;
                    } else if (i21 > 0) {
                        i7 = i21;
                    }
                    int i22 = i20 + i7;
                    this.f47781l0 = i22;
                    this.f47776g0 = size2 + i7;
                    this.f47775f0 = i22;
                }
                if (c()) {
                    this.K.l(false);
                }
            }
            int i23 = this.f47781l0;
            this.f47781l0 = i23 + 1;
            this.f47777h0 = i23;
        }
        int i24 = this.f47781l0;
        this.f47781l0 = i24 + 1;
        this.V = i24;
        km0 km0Var = this.F;
        if (km0Var != null) {
            km0Var.post(new vl0(this, 1));
        }
    }

    public final void l(km0 km0Var) {
        int i7;
        int i10 = org.telegram.ui.ActionBar.m6.f29381d6;
        lm0 lm0Var = this.f47786q0;
        int themedColor = lm0Var.getThemedColor(i10);
        lm0Var.getThemedColor(org.telegram.ui.ActionBar.m6.f29324a7);
        int themedColor2 = lm0Var.getThemedColor(org.telegram.ui.ActionBar.m6.f29792z6);
        int themedColor3 = lm0Var.getThemedColor(org.telegram.ui.ActionBar.m6.G6);
        km0Var.f49363w.setColor(themedColor);
        km0Var.f49365y = org.telegram.ui.ActionBar.m6.r1(0.06f, themedColor3);
        km0Var.E = themedColor2;
        km0Var.F = themedColor3;
        et etVar = km0Var.f49355a;
        for (int i11 = 0; i11 < etVar.getChildCount(); i11++) {
            View childAt = etVar.getChildAt(i11);
            int R = RecyclerView.R(childAt);
            if (R != -1 && (childAt instanceof TextView)) {
                TextView textView = (TextView) childAt;
                if (R == km0Var.d) {
                    i7 = km0Var.F;
                } else {
                    i7 = km0Var.E;
                }
                textView.setTextColor(i7);
                childAt.invalidate();
            }
        }
        etVar.invalidate();
        km0Var.invalidate();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11 = this.f47783n0;
        View view = this.f47790x;
        wl0 wl0Var = this.f47767b;
        if (i11 == 1) {
            super.onMeasure(i7, i10);
            am0 am0Var = this.f47789w;
            this.f47784o0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + am0Var.getMeasuredHeight() + org.telegram.messenger.g0.f24040m;
            ((ViewGroup.MarginLayoutParams) am0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f24040m;
            ((ViewGroup.MarginLayoutParams) wl0Var.getLayoutParams()).topMargin = this.f47784o0 - org.telegram.messenger.g0.L(16.0f);
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.f47784o0 - org.telegram.messenger.g0.L(64.0f);
            ((ViewGroup.MarginLayoutParams) this.f47791y.getLayoutParams()).topMargin = this.f47784o0 - org.telegram.messenger.g0.L(16.0f);
            wl0Var.setPadding(wl0Var.getPaddingLeft(), org.telegram.messenger.g0.L(16.0f), wl0Var.getPaddingRight(), wl0Var.getPaddingBottom());
        } else {
            this.f47784o0 = org.telegram.messenger.g0.L(230.0f) + org.telegram.messenger.g0.f24040m;
            ((ViewGroup.MarginLayoutParams) wl0Var.getLayoutParams()).topMargin = this.f47784o0;
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.f47784o0 - org.telegram.messenger.g0.L(64.0f);
            ((ViewGroup.MarginLayoutParams) this.f47765a.getLayoutParams()).height = this.f47784o0;
        }
        super.onMeasure(i7, i10);
    }
}
