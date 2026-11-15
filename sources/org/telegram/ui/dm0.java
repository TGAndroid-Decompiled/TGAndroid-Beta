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
    public static final int f46397r0 = 0;
    public cm0 E;
    public final im0 F;
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
    public final hm0 f46398a;
    public int f46399a0;
    public final ul0 f46400b;
    public int f46401b0;
    public final v4.s f46402c;
    public int f46403c0;
    public final wl0 d;
    public int f46404d0;
    public final ji.j f46405e;
    public int f46406e0;
    public gm0 f46407f;
    public int f46408f0;
    public int f46409g0;
    public int h;
    public int f46410h0;
    public int f46411i0;
    public int f46412j0;
    public int f46413k0;
    public int f46414l0;
    public final ArrayList m0;
    public long f46415n;
    public final int f46416n0;
    public int f46417o0;
    public am0 f46418p0;
    public final jm0 f46419q0;
    public TLRPC.TL_emojiStatusCollectible f46420r;
    public TLRPC.TL_peerColorCollectible f46421s;
    public final yl0 f46422w;
    public final View f46423x;
    public final View f46424y;

    public dm0(jm0 jm0Var, Context context, int i7) {
        super(context);
        int i10;
        this.f46419q0 = jm0Var;
        this.f46405e = new ji.j(18, false);
        this.h = -1;
        this.f46415n = 0L;
        this.f46420r = null;
        this.f46421s = null;
        this.L = null;
        this.M = new ArrayList();
        this.N = new HashMap();
        this.R = -1;
        this.S = -1;
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.f46399a0 = -1;
        this.f46401b0 = -1;
        this.f46403c0 = -1;
        this.f46404d0 = -1;
        this.f46406e0 = -1;
        this.f46408f0 = -1;
        this.f46409g0 = 0;
        this.f46410h0 = -1;
        this.f46411i0 = -1;
        this.f46412j0 = -1;
        this.f46413k0 = -1;
        this.m0 = new ArrayList();
        this.f46416n0 = i7;
        d();
        Context context2 = getContext();
        org.telegram.ui.ActionBar.e6 resourceProvider = jm0Var.getResourceProvider();
        dh.c cVar = jm0Var.H;
        ul0 ul0Var = new ul0(this, context2, resourceProvider, i7);
        this.f46400b = ul0Var;
        ul0Var.setClipToPadding(false);
        ul0Var.setSections(true);
        ((v4.k) ul0Var.getItemAnimator()).f58564m = false;
        getContext();
        v4.s sVar = new v4.s(3);
        this.f46402c = sVar;
        sVar.O = new bi.y1(this, 15);
        ul0Var.i(new ai.i0(this, 8));
        ul0Var.setLayoutManager(sVar);
        wl0 wl0Var = new wl0(this, context, i7);
        this.d = wl0Var;
        ul0Var.setAdapter(wl0Var);
        ul0Var.setOnItemClickListener(new org.telegram.ui.Components.dl0(this, i7, 1));
        ul0Var.j(new xl0(this, i7));
        addView(ul0Var, c8.ja.c(-1.0f, -1));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.eq(2131232243, 0), 0, 1, 33);
        if (jm0Var.f48368a) {
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
        ul0Var.setItemAnimator(kVar);
        View view = new View(getContext());
        this.f46423x = view;
        dh.d dVar = new dh.d(cVar.c(view, null, false));
        dVar.b(-org.telegram.messenger.g0.L(24.0f), true);
        dVar.H = 220;
        view.setBackground(dVar);
        addView(view, c8.ja.e(-1, 72, 55));
        if (i7 == 0) {
            this.f46398a = new hm0(jm0.k0(jm0Var), 0L, getContext(), jm0.l0(jm0Var));
            j(false);
        } else {
            View view2 = new View(getContext());
            this.f46424y = view2;
            dh.d dVar2 = new dh.d(cVar.c(view2, null, false));
            dVar2.b(-org.telegram.messenger.g0.L(16.0f), false);
            view2.setBackground(dVar2);
            addView(view2, c8.ja.e(-1, 16, 55));
            yl0 yl0Var = new yl0(getContext(), jm0.m0(jm0Var), 3, 0L, jm0.n0(jm0Var));
            this.f46422w = yl0Var;
            yl0Var.setImportantForAccessibility(4);
            yl0Var.f32140x = jm0Var;
            yl0Var.setClipToOutline(true);
            bg.p0 p0Var = bg.t0.f3335a;
            yl0Var.setOutlineProvider(new bg.r0(0, org.telegram.messenger.g0.L(16.0f)));
            addView(yl0Var, c8.ja.d(-1, -2.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        im0 im0Var = new im0(getContext(), jm0.o0(jm0Var));
        this.F = im0Var;
        fh.g c10 = jm0Var.F.c(im0Var, null, false);
        gh.e eVar = new gh.e(jm0.p0(jm0Var));
        eVar.f13313e = new g0.e(19);
        eVar.f(0, 0);
        eVar.e(0, 0);
        eVar.d(0, 0);
        c10.p(eVar);
        c10.r(org.telegram.messenger.g0.L(18.0f));
        c10.R.f11322e = true;
        im0Var.I = c10;
        im0Var.H = c10;
        im0Var.G = new tl0(this, 0);
        im0Var.setVisibility(4);
        addView(im0Var, c8.ja.d(-1, 36.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        View view3 = this.f46398a;
        if (view3 != null) {
            addView(view3, c8.ja.e(-1, -2, 55));
        }
        g();
        k();
        setWillNotDraw(false);
    }

    public static void a(dm0 dm0Var) {
        int i7;
        ul0 ul0Var = dm0Var.f46400b;
        boolean z10 = dm0Var.I;
        if (z10) {
            ul0Var.C0();
        }
        dm0Var.e();
        if (z10 && (i7 = dm0Var.f46411i0) >= 0) {
            dm0Var.f46402c.h1(i7, dm0Var.f46419q0.f48377f);
            ul0Var.post(new tl0(dm0Var, 1));
        }
    }

    public final boolean b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dm0.b():boolean");
    }

    public final boolean c() {
        ul0 ul0Var = this.f46400b;
        if (ul0Var != null) {
            for (int i7 = 0; i7 < ul0Var.getChildCount(); i7++) {
                if (ul0Var.getChildAt(i7) instanceof org.telegram.ui.Components.pz) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void d() {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible;
        int i7 = this.f46416n0;
        jm0 jm0Var = this.f46419q0;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible = null;
        if (i7 == 0) {
            TLRPC.User f10 = jm0Var.getUserConfig().f();
            this.h = org.telegram.messenger.q10.l(f10);
            this.f46415n = org.telegram.messenger.q10.m(f10);
            if (f10 != null) {
                TLRPC.EmojiStatus emojiStatus = f10.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                    this.f46420r = tL_emojiStatusCollectible;
                    this.f46421s = null;
                }
            }
            tL_emojiStatusCollectible = null;
            this.f46420r = tL_emojiStatusCollectible;
            this.f46421s = null;
        } else {
            TLRPC.User f11 = jm0Var.getUserConfig().f();
            this.h = org.telegram.messenger.q10.e(f11);
            this.f46415n = org.telegram.messenger.q10.f(f11);
            this.f46420r = null;
            if (f11 != null) {
                TLRPC.PeerColor peerColor = f11.color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                }
            }
            this.f46421s = tL_peerColorCollectible;
        }
        if (this.f46420r == null && this.f46421s == null) {
            return;
        }
        this.h = -1;
        this.f46415n = 0L;
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
        jm0 jm0Var = this.f46419q0;
        ji.j jVar = this.f46405e;
        if (tL_starGiftUnique != null) {
            cg.a resellAmount = tL_starGiftUnique.getResellAmount(cg.b.f4990a);
            if (tL_starGiftUnique.resale_ton_only) {
                jVar.f17555b = di.lb.s1(di.lb.V0(org.telegram.messenger.hd.a0(null, null, 2131746146, tL_starGiftUnique.getResellAmount(cg.b.f4991b).d()), true), true);
                jVar.f17556c = di.lb.T0(org.telegram.messenger.hd.H(',', "ResellGiftBuyEq", (int) resellAmount.a()));
            } else {
                jVar.f17555b = di.lb.T0(org.telegram.messenger.hd.H(',', "ResellGiftBuy", (int) resellAmount.a()));
                jVar.f17556c = null;
            }
        } else {
            if (!jm0Var.getUserConfig().q() && !jm0Var.f48368a) {
                obj = this.O;
            } else if (this.f46420r != null) {
                obj = this.Q;
            } else {
                obj = this.P;
            }
            jVar.f17555b = obj;
            jVar.f17556c = null;
        }
        if (jm0Var.H0() == this) {
            jm0Var.S = this;
            jm0Var.R.i((CharSequence) jVar.f17555b, z10, true);
            jm0Var.R.g((SpannableStringBuilder) jVar.f17556c, z10);
        }
    }

    public final void g() {
        hi.d dVar = this.f46419q0.R;
        if (dVar != null) {
            dVar.updateColors();
        }
        yl0 yl0Var = this.f46422w;
        if (yl0Var != null) {
            yl0Var.invalidate();
        }
        j(true);
        org.telegram.messenger.g0.d0(this.f46400b, new r3(this, 16));
        im0 im0Var = this.F;
        if (im0Var != null) {
            l(im0Var);
        }
    }

    public final void h() {
        int i7;
        boolean z10;
        int i10 = this.f46419q0.f48377f;
        float f10 = 0.0f;
        View view = this.f46423x;
        im0 im0Var = this.F;
        if (im0Var != null && (i7 = this.f46411i0) >= 0) {
            v4.s sVar = this.f46402c;
            this.G = sVar.m(i7);
            ul0 ul0Var = this.f46400b;
            int paddingTop = ul0Var.getPaddingTop() + i10;
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
                im0Var.setVisibility(0);
                im0Var.setTranslationY((Math.max(this.G.getTop(), paddingTop) + ul0Var.getTop()) - im0Var.getTop());
            } else if (L0 != -1 && L0 > this.f46411i0) {
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
        org.telegram.messenger.gj messageObject;
        yl0 yl0Var = this.f46422w;
        if (yl0Var != null) {
            org.telegram.ui.Cells.q1[] cells = yl0Var.getCells();
            for (int i7 = 0; i7 < cells.length; i7++) {
                org.telegram.ui.Cells.q1 q1Var = cells[i7];
                if (q1Var != null && (messageObject = q1Var.getMessageObject()) != null) {
                    messageObject.f23867w1 = true;
                    gm0 gm0Var = this.f46407f;
                    if (gm0Var != null) {
                        messageObject.f23793e1 = gm0Var.getColorId();
                    }
                    messageObject.f23798f1 = this.f46415n;
                    messageObject.f23803g1 = this.f46421s;
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
        gm0 gm0Var = this.f46407f;
        if (gm0Var != null) {
            gm0Var.a(this.h, z10);
        }
        hm0 hm0Var = this.f46398a;
        if (hm0Var != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.f46420r;
            if (tL_emojiStatusCollectible != null) {
                hm0Var.e(tL_emojiStatusCollectible.document_id, true, z10);
                hm0Var.c(org.telegram.messenger.cp.a(this.f46420r), z10);
                hm0Var.d(this.f46420r.pattern_document_id, true, z10);
            } else {
                long j3 = 0;
                if (org.telegram.messenger.m5.A()) {
                    hm0Var.e(0L, false, z10);
                } else {
                    TLRPC.User a22 = org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24940t0).a2(0L);
                    if (a22 != null) {
                        j3 = org.telegram.messenger.m5.f(a22.emoji_status);
                    }
                    hm0Var.e(j3, org.telegram.messenger.m5.A(), z10);
                }
                hm0Var.b(this.h, z10);
                hm0Var.d(this.f46415n, false, z10);
            }
        }
        int i10 = this.f46416n0;
        if (i10 == 0 && (ol0Var = (jm0Var = this.f46419q0).f48375e) != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = this.f46420r;
            if (tL_emojiStatusCollectible2 != null) {
                ol0Var.c(org.telegram.messenger.cp.a(tL_emojiStatusCollectible2), z10);
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
            ul0 ul0Var = this.f46400b;
            if (i12 < ul0Var.getChildCount()) {
                View childAt = ul0Var.getChildAt(i12);
                if (childAt instanceof sl0) {
                    sl0 sl0Var = (sl0) childAt;
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible3 = this.f46420r;
                    if ((tL_emojiStatusCollectible3 != null && tL_emojiStatusCollectible3.collectible_id == sl0Var.getGiftId()) || ((tL_peerColorCollectible2 = this.f46421s) != null && tL_peerColorCollectible2.collectible_id == sl0Var.getGiftId())) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    sl0Var.b(z12, true);
                } else if (childAt instanceof bi.i2) {
                    bi.i2 i2Var = (bi.i2) childAt;
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible4 = this.f46420r;
                    if ((tL_emojiStatusCollectible4 != null && tL_emojiStatusCollectible4.collectible_id == i2Var.getGiftId()) || ((tL_peerColorCollectible = this.f46421s) != null && tL_peerColorCollectible.collectible_id == i2Var.getGiftId())) {
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
        di.l8 l8Var;
        jm0 jm0Var = this.f46419q0;
        di.l8 l8Var2 = jm0Var.f48370b;
        this.W = -1;
        this.f46399a0 = -1;
        this.f46401b0 = -1;
        this.f46403c0 = -1;
        this.f46406e0 = -1;
        this.f46408f0 = -1;
        this.f46404d0 = -1;
        this.f46410h0 = -1;
        this.f46411i0 = -1;
        this.f46412j0 = -1;
        this.f46413k0 = -1;
        this.f46409g0 = 0;
        ArrayList arrayList = this.m0;
        arrayList.clear();
        this.R = 0;
        this.T = 1;
        int i7 = 3;
        this.f46414l0 = 3;
        this.S = 2;
        int i10 = this.f46416n0;
        if (i10 == 0 && (this.h >= 0 || this.f46420r != null || this.f46421s != null)) {
            this.W = 3;
            this.f46414l0 = 5;
            this.f46399a0 = 4;
        }
        if (i10 == 1) {
            l8Var = jm0Var.f48372c;
        } else {
            l8Var = l8Var2;
        }
        if ((i10 == 0 || i10 == 1) && l8Var != null) {
            ArrayList arrayList2 = l8Var.f9001l;
            int i11 = this.f46414l0;
            this.f46414l0 = i11 + 1;
            this.f46411i0 = i11;
            if (this.L == null) {
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) arrayList2.get(i12)).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        arrayList.add((TL_stars.TL_starGiftUnique) starGift);
                    }
                }
                int i13 = this.f46414l0;
                this.f46403c0 = i13;
                this.f46414l0 = arrayList.size() + i13;
                int size = arrayList.size() + this.f46409g0;
                this.f46409g0 = size;
                int i14 = this.f46414l0;
                this.f46404d0 = i14;
                if (!l8Var2.f8998i && l8Var2.f8999j) {
                    if (arrayList.isEmpty()) {
                        int i15 = this.f46414l0;
                        this.f46413k0 = i15;
                        this.f46414l0 = i15 + 2;
                        this.f46412j0 = i15 + 1;
                    }
                } else {
                    this.f46406e0 = i14;
                    int i16 = 3 - (size % 3);
                    if (size <= 0) {
                        i7 = 9;
                    } else if (i16 > 0) {
                        i7 = i16;
                    }
                    int i17 = i14 + i7;
                    this.f46414l0 = i17;
                    this.f46409g0 = size + i7;
                    this.f46408f0 = i17;
                }
                if (c()) {
                    l8Var.a();
                }
            } else if (this.K != null) {
                long e10 = org.telegram.messenger.m10.i(jm0.z0(jm0Var)).e();
                for (int i18 = 0; i18 < this.K.d.size(); i18++) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.K.d.get(i18);
                    if (org.telegram.messenger.m5.o(tL_starGiftUnique.owner_id) != e10 && org.telegram.messenger.m5.o(tL_starGiftUnique.host_id) != e10) {
                        arrayList.add(tL_starGiftUnique);
                    }
                }
                int i19 = this.f46414l0;
                this.f46403c0 = i19;
                this.f46414l0 = arrayList.size() + i19;
                int size2 = arrayList.size() + this.f46409g0;
                this.f46409g0 = size2;
                int i20 = this.f46414l0;
                this.f46404d0 = i20;
                bi.o5 o5Var = this.K;
                if (o5Var.f3774t || !o5Var.f3775u) {
                    this.f46406e0 = i20;
                    int i21 = 3 - (size2 % 3);
                    if (size2 <= 0) {
                        i7 = 9;
                    } else if (i21 > 0) {
                        i7 = i21;
                    }
                    int i22 = i20 + i7;
                    this.f46414l0 = i22;
                    this.f46409g0 = size2 + i7;
                    this.f46408f0 = i22;
                }
                if (c()) {
                    this.K.g(false);
                }
            }
            int i23 = this.f46414l0;
            this.f46414l0 = i23 + 1;
            this.f46410h0 = i23;
        }
        int i24 = this.f46414l0;
        this.f46414l0 = i24 + 1;
        this.V = i24;
        im0 im0Var = this.F;
        if (im0Var != null) {
            im0Var.post(new tl0(this, 1));
        }
    }

    public final void l(im0 im0Var) {
        int i7;
        int i10 = org.telegram.ui.ActionBar.j6.f28849d6;
        jm0 jm0Var = this.f46419q0;
        int themedColor = jm0Var.getThemedColor(i10);
        jm0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f28792a7);
        int themedColor2 = jm0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f29260z6);
        int themedColor3 = jm0Var.getThemedColor(org.telegram.ui.ActionBar.j6.G6);
        im0Var.f48082w.setColor(themedColor);
        im0Var.f48084y = org.telegram.ui.ActionBar.j6.r1(0.06f, themedColor3);
        im0Var.E = themedColor2;
        im0Var.F = themedColor3;
        ct ctVar = im0Var.f48074a;
        for (int i11 = 0; i11 < ctVar.getChildCount(); i11++) {
            View childAt = ctVar.getChildAt(i11);
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
        ctVar.invalidate();
        im0Var.invalidate();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11 = this.f46416n0;
        View view = this.f46423x;
        ul0 ul0Var = this.f46400b;
        if (i11 == 1) {
            super.onMeasure(i7, i10);
            yl0 yl0Var = this.f46422w;
            this.f46417o0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + yl0Var.getMeasuredHeight() + org.telegram.messenger.g0.f23605m;
            ((ViewGroup.MarginLayoutParams) yl0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f23605m;
            ((ViewGroup.MarginLayoutParams) ul0Var.getLayoutParams()).topMargin = this.f46417o0 - org.telegram.messenger.g0.L(16.0f);
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.f46417o0 - org.telegram.messenger.g0.L(64.0f);
            ((ViewGroup.MarginLayoutParams) this.f46424y.getLayoutParams()).topMargin = this.f46417o0 - org.telegram.messenger.g0.L(16.0f);
            ul0Var.setPadding(ul0Var.getPaddingLeft(), org.telegram.messenger.g0.L(16.0f), ul0Var.getPaddingRight(), ul0Var.getPaddingBottom());
        } else {
            this.f46417o0 = org.telegram.messenger.g0.L(230.0f) + org.telegram.messenger.g0.f23605m;
            ((ViewGroup.MarginLayoutParams) ul0Var.getLayoutParams()).topMargin = this.f46417o0;
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.f46417o0 - org.telegram.messenger.g0.L(64.0f);
            ((ViewGroup.MarginLayoutParams) this.f46398a.getLayoutParams()).height = this.f46417o0;
        }
        super.onMeasure(i7, i10);
    }
}
