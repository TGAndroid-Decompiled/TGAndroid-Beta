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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class lp0 extends FrameLayout {
    public static final int f41310q0 = 0;
    public final qp0 E;
    public View F;
    public boolean G;
    public boolean H;
    public TL_stars.TL_starGiftUnique I;
    public zh.u3 J;
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
    public final pp0 f41311a;
    public int f41312a0;
    public final cp0 f41313b;
    public int f41314b0;
    public final s4.t f41315c;
    public int f41316c0;
    public final ep0 d;
    public int f41317d0;
    public final m4.c e;
    public int f41318e0;
    public op0 f41319f;
    public int f41320f0;
    public int f41321g0;
    public int h;
    public int f41322h0;
    public int f41323i0;
    public int f41324j0;
    public int f41325k0;
    public final ArrayList f41326l0;
    public final int m0;
    public long f41327n;
    public int f41328n0;
    public ip0 f41329o0;
    public final rp0 f41330p0;
    public TLRPC.TL_emojiStatusCollectible f41331r;
    public TLRPC.TL_peerColorCollectible f41332s;
    public final gp0 v;
    public final View f41333w;
    public final View f41334x;
    public kp0 f41335y;

    public lp0(rp0 rp0Var, Context context, int i10) {
        super(context);
        int i11;
        this.f41330p0 = rp0Var;
        this.e = new m4.c(12, false);
        this.h = -1;
        this.f41327n = 0L;
        this.f41331r = null;
        this.f41332s = null;
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
        this.f41312a0 = -1;
        this.f41314b0 = -1;
        this.f41316c0 = -1;
        this.f41317d0 = -1;
        this.f41318e0 = -1;
        this.f41320f0 = 0;
        this.f41321g0 = -1;
        this.f41322h0 = -1;
        this.f41323i0 = -1;
        this.f41324j0 = -1;
        this.f41326l0 = new ArrayList();
        this.m0 = i10;
        d();
        Context context2 = getContext();
        org.telegram.ui.ActionBar.u6 resourceProvider = rp0Var.getResourceProvider();
        ch.b bVar = rp0Var.G;
        cp0 cp0Var = new cp0(this, context2, resourceProvider, i10);
        this.f41313b = cp0Var;
        cp0Var.setClipToPadding(false);
        cp0Var.setSections(true);
        ((s4.l) cp0Var.getItemAnimator()).f47760m = false;
        getContext();
        s4.t tVar = new s4.t(3);
        this.f41315c = tVar;
        tVar.O = new ai.l(this, 8);
        cp0Var.i(new fi.p1(this, 7));
        cp0Var.setLayoutManager(tVar);
        ep0 ep0Var = new ep0(this, context, i10);
        this.d = ep0Var;
        cp0Var.setAdapter(ep0Var);
        cp0Var.setOnItemClickListener(new org.telegram.ui.Components.wn0(this, i10, 1));
        cp0Var.j(new fp0(this, i10));
        addView(cp0Var, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.zq(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
        if (rp0Var.f43222a) {
            i11 = R.string.ChannelColorApply;
        } else {
            i11 = R.string.UserColorApply;
        }
        String string = LocaleController.getString(i11);
        this.O = string;
        this.N = new SpannableStringBuilder(spannableStringBuilder).append((CharSequence) " ").append((CharSequence) string);
        this.P = LocaleController.getString(R.string.UserColorApplyCollectible);
        f(false);
        s4.l lVar = new s4.l();
        lVar.n(350L);
        lVar.o(org.telegram.ui.Components.ds.h);
        lVar.C = false;
        lVar.f47760m = false;
        cp0Var.setItemAnimator(lVar);
        View view = new View(getContext());
        this.f41333w = view;
        ch.c cVar = new ch.c(bVar.c(view, null, false));
        cVar.b(-AndroidUtilities.dp(24.0f), true);
        cVar.G = 220;
        view.setBackground(cVar);
        addView(view, org.telegram.ui.Components.gb1.i(-1, 72, 55));
        if (i10 == 0) {
            this.f41311a = new pp0(rp0.g0(rp0Var), 0L, getContext(), rp0.h0(rp0Var));
            j(false);
        } else {
            View view2 = new View(getContext());
            this.f41334x = view2;
            ch.c cVar2 = new ch.c(bVar.c(view2, null, false));
            cVar2.b(-AndroidUtilities.dp(16.0f), false);
            view2.setBackground(cVar2);
            addView(view2, org.telegram.ui.Components.gb1.i(-1, 16, 55));
            ?? kaVar = new org.telegram.ui.Cells.ka(getContext(), rp0.i0(rp0Var), 3, 0L, rp0.j0(rp0Var));
            this.v = kaVar;
            kaVar.setImportantForAccessibility(4);
            kaVar.f24362r = rp0Var;
            kaVar.setClipToOutline(true);
            ag.v0 v0Var = ag.z0.f1400a;
            kaVar.setOutlineProvider(new ag.x0(0, AndroidUtilities.dp(16.0f)));
            addView((View) kaVar, org.telegram.ui.Components.gb1.h(-1, -2.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        qp0 qp0Var = new qp0(getContext(), rp0.k0(rp0Var));
        this.E = qp0Var;
        eh.d c10 = rp0Var.E.c(qp0Var, null, false);
        fh.e eVar = new fh.e(rp0.l0(rp0Var));
        eVar.e = new gh.a(4);
        eVar.d(0, 0);
        eVar.c(0, 0);
        eVar.b(0, 0);
        c10.v(eVar);
        c10.x(AndroidUtilities.dp(18.0f));
        c10.f9966x.e = true;
        qp0Var.H = c10;
        qp0Var.G = c10;
        qp0Var.F = new bp0(this, 0);
        qp0Var.setVisibility(4);
        addView(qp0Var, org.telegram.ui.Components.gb1.h(-1, 36.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        pp0 pp0Var = this.f41311a;
        if (pp0Var != null) {
            addView(pp0Var, org.telegram.ui.Components.gb1.i(-1, -2, 55));
        }
        g();
        k();
        setWillNotDraw(false);
    }

    public static void a(lp0 lp0Var) {
        int i10;
        cp0 cp0Var = lp0Var.f41313b;
        boolean z10 = lp0Var.H;
        if (z10) {
            cp0Var.C0();
        }
        lp0Var.e();
        if (z10 && (i10 = lp0Var.f41322h0) >= 0) {
            lp0Var.f41315c.h1(i10, lp0Var.f41330p0.f43229f);
            cp0Var.post(new bp0(lp0Var, 1));
        }
    }

    public final boolean b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lp0.b():boolean");
    }

    public final boolean c() {
        cp0 cp0Var = this.f41313b;
        if (cp0Var != null) {
            for (int i10 = 0; i10 < cp0Var.getChildCount(); i10++) {
                if (cp0Var.getChildAt(i10) instanceof org.telegram.ui.Components.c10) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void d() {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible;
        int i10 = this.m0;
        rp0 rp0Var = this.f41330p0;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible = null;
        if (i10 == 0) {
            TLRPC.User currentUser = rp0Var.getUserConfig().getCurrentUser();
            this.h = UserObject.getProfileColorId(currentUser);
            this.f41327n = UserObject.getProfileEmojiId(currentUser);
            if (currentUser != null) {
                TLRPC.EmojiStatus emojiStatus = currentUser.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                    this.f41331r = tL_emojiStatusCollectible;
                    this.f41332s = null;
                }
            }
            tL_emojiStatusCollectible = null;
            this.f41331r = tL_emojiStatusCollectible;
            this.f41332s = null;
        } else {
            TLRPC.User currentUser2 = rp0Var.getUserConfig().getCurrentUser();
            this.h = UserObject.getColorId(currentUser2);
            this.f41327n = UserObject.getEmojiId(currentUser2);
            this.f41331r = null;
            if (currentUser2 != null) {
                TLRPC.PeerColor peerColor = currentUser2.color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                }
            }
            this.f41332s = tL_peerColorCollectible;
        }
        if (this.f41331r == null && this.f41332s == null) {
            return;
        }
        this.h = -1;
        this.f41327n = 0L;
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
        this.d.l();
    }

    public final void f(boolean z10) {
        Object obj;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.I;
        rp0 rp0Var = this.f41330p0;
        m4.c cVar = this.e;
        if (tL_starGiftUnique != null) {
            bg.a resellAmount = tL_starGiftUnique.getResellAmount(bg.b.f3980a);
            if (tL_starGiftUnique.resale_ton_only) {
                cVar.f18009b = bi.dd.o1(bi.dd.R0(LocaleController.formatString(R.string.ResellGiftBuyTON, tL_starGiftUnique.getResellAmount(bg.b.f3981b).d()), true), true);
                cVar.f18010c = bi.dd.P0(LocaleController.formatPluralStringComma("ResellGiftBuyEq", (int) resellAmount.a()));
            } else {
                cVar.f18009b = bi.dd.P0(LocaleController.formatPluralStringComma("ResellGiftBuy", (int) resellAmount.a()));
                cVar.f18010c = null;
            }
        } else {
            if (!rp0Var.getUserConfig().isPremium() && !rp0Var.f43222a) {
                obj = this.N;
            } else if (this.f41331r != null) {
                obj = this.P;
            } else {
                obj = this.O;
            }
            cVar.f18009b = obj;
            cVar.f18010c = null;
        }
        if (rp0Var.D0() == this) {
            rp0Var.R = this;
            rp0Var.Q.i((CharSequence) cVar.f18009b, z10, true);
            rp0Var.Q.g((SpannableStringBuilder) cVar.f18010c, z10);
        }
    }

    public final void g() {
        fi.d dVar = this.f41330p0.Q;
        if (dVar != null) {
            dVar.updateColors();
        }
        gp0 gp0Var = this.v;
        if (gp0Var != null) {
            gp0Var.invalidate();
        }
        j(true);
        AndroidUtilities.forEachViews((RecyclerView) this.f41313b, (Utilities.Callback<View>) new t3(this, 15));
        qp0 qp0Var = this.E;
        if (qp0Var != null) {
            l(qp0Var);
        }
    }

    public final void h() {
        int i10;
        boolean z10;
        int i11 = this.f41330p0.f43229f;
        float f7 = 0.0f;
        View view = this.f41333w;
        qp0 qp0Var = this.E;
        if (qp0Var != null && (i10 = this.f41322h0) >= 0) {
            s4.t tVar = this.f41315c;
            this.F = tVar.m(i10);
            cp0 cp0Var = this.f41313b;
            int paddingTop = cp0Var.getPaddingTop() + i11;
            int L0 = tVar.L0();
            View view2 = this.F;
            if (view2 != null) {
                if (view2.getTop() <= paddingTop) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.H = z10;
                this.G = !z10;
                qp0Var.setVisibility(0);
                qp0Var.setTranslationY((Math.max(this.F.getTop(), paddingTop) + cp0Var.getTop()) - qp0Var.getTop());
            } else if (L0 != -1 && L0 > this.f41322h0) {
                this.H = true;
                this.G = false;
                qp0Var.setVisibility(0);
                qp0Var.setTranslationY((cp0Var.getTop() + paddingTop) - qp0Var.getTop());
            } else {
                this.H = false;
                this.G = false;
                qp0Var.setVisibility(0);
                qp0Var.setTranslationY((AndroidUtilities.dp(1.0f) + getHeight()) - qp0Var.getTop());
            }
            boolean z11 = this.G;
            if (qp0Var.I != z11) {
                qp0Var.I = z11;
                qp0Var.invalidate();
            }
            if (this.H) {
                f7 = AndroidUtilities.dp(36.0f) + i11;
            }
            view.setTranslationY(f7);
            cp0Var.invalidate();
            invalidate();
            return;
        }
        this.G = false;
        this.H = false;
        if (view != null) {
            view.setTranslationY(0.0f);
        }
        if (qp0Var != null) {
            qp0Var.setVisibility(4);
            boolean z12 = this.G;
            if (qp0Var.I != z12) {
                qp0Var.I = z12;
                qp0Var.invalidate();
            }
        }
    }

    public final void i() {
        MessageObject messageObject;
        gp0 gp0Var = this.v;
        if (gp0Var != null) {
            org.telegram.ui.Cells.s1[] cells = gp0Var.getCells();
            for (int i10 = 0; i10 < cells.length; i10++) {
                org.telegram.ui.Cells.s1 s1Var = cells[i10];
                if (s1Var != null && (messageObject = s1Var.getMessageObject()) != null) {
                    messageObject.notime = true;
                    op0 op0Var = this.f41319f;
                    if (op0Var != null) {
                        messageObject.overrideLinkColor = op0Var.getColorId();
                    }
                    messageObject.overrideLinkEmoji = this.f41327n;
                    messageObject.overrideLinkPeerColor = this.f41332s;
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
        rp0 rp0Var;
        uo0 uo0Var;
        op0 op0Var = this.f41319f;
        if (op0Var != null) {
            op0Var.a(this.h, z10);
        }
        pp0 pp0Var = this.f41311a;
        if (pp0Var != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.f41331r;
            if (tL_emojiStatusCollectible != null) {
                pp0Var.e(tL_emojiStatusCollectible.document_id, true, z10);
                pp0Var.c(MessagesController.PeerColor.fromCollectible(this.f41331r), z10);
                pp0Var.d(this.f41331r.pattern_document_id, true, z10);
            } else {
                if (DialogObject.isEmojiStatusCollectible(0L)) {
                    pp0Var.e(0L, false, z10);
                } else {
                    pp0Var.e(DialogObject.getEmojiStatusDocumentId(0L), DialogObject.isEmojiStatusCollectible(0L), z10);
                }
                pp0Var.b(this.h, z10);
                pp0Var.d(this.f41327n, false, z10);
            }
        }
        int i11 = this.m0;
        if (i11 == 0 && (uo0Var = (rp0Var = this.f41330p0).e) != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = this.f41331r;
            if (tL_emojiStatusCollectible2 != null) {
                uo0Var.c(MessagesController.PeerColor.fromCollectible(tL_emojiStatusCollectible2), z10);
            } else {
                uo0Var.b(rp0.w0(rp0Var), this.h, z10);
            }
        }
        if (i11 == 0) {
            int i12 = this.V;
            k();
            ep0 ep0Var = this.d;
            if (i12 >= 0 && this.V < 0) {
                ep0Var.t(i12, 2);
            } else if (i12 < 0 && (i10 = this.V) >= 0) {
                ep0Var.s(i10, 2);
            }
        }
        int i13 = 0;
        while (true) {
            cp0 cp0Var = this.f41313b;
            if (i13 < cp0Var.getChildCount()) {
                View childAt = cp0Var.getChildAt(i13);
                if (childAt instanceof zo0) {
                    zo0 zo0Var = (zo0) childAt;
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible3 = this.f41331r;
                    if ((tL_emojiStatusCollectible3 != null && tL_emojiStatusCollectible3.collectible_id == zo0Var.getGiftId()) || ((tL_peerColorCollectible2 = this.f41332s) != null && tL_peerColorCollectible2.collectible_id == zo0Var.getGiftId())) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    zo0Var.b(z12, true);
                } else if (childAt instanceof zh.g1) {
                    zh.g1 g1Var = (zh.g1) childAt;
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible4 = this.f41331r;
                    if ((tL_emojiStatusCollectible4 != null && tL_emojiStatusCollectible4.collectible_id == g1Var.getGiftId()) || ((tL_peerColorCollectible = this.f41332s) != null && tL_peerColorCollectible.collectible_id == g1Var.getGiftId())) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    g1Var.f(z11, true);
                }
                i13++;
            } else {
                return;
            }
        }
    }

    public final void k() {
        bi.t9 t9Var;
        rp0 rp0Var = this.f41330p0;
        bi.t9 t9Var2 = rp0Var.f43224b;
        this.V = -1;
        this.W = -1;
        this.f41312a0 = -1;
        this.f41314b0 = -1;
        this.f41317d0 = -1;
        this.f41318e0 = -1;
        this.f41316c0 = -1;
        this.f41321g0 = -1;
        this.f41322h0 = -1;
        this.f41323i0 = -1;
        this.f41324j0 = -1;
        this.f41320f0 = 0;
        ArrayList arrayList = this.f41326l0;
        arrayList.clear();
        this.Q = 0;
        this.S = 1;
        int i10 = 3;
        this.f41325k0 = 3;
        this.R = 2;
        int i11 = this.m0;
        if (i11 == 0 && (this.h >= 0 || this.f41331r != null || this.f41332s != null)) {
            this.V = 3;
            this.f41325k0 = 5;
            this.W = 4;
        }
        if (i11 == 1) {
            t9Var = rp0Var.f43226c;
        } else {
            t9Var = t9Var2;
        }
        if ((i11 == 0 || i11 == 1) && t9Var != null) {
            ArrayList arrayList2 = t9Var.f5471l;
            int i12 = this.f41325k0;
            this.f41325k0 = i12 + 1;
            this.f41322h0 = i12;
            if (this.K == null) {
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) arrayList2.get(i13)).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        arrayList.add((TL_stars.TL_starGiftUnique) starGift);
                    }
                }
                int i14 = this.f41325k0;
                this.f41314b0 = i14;
                this.f41325k0 = arrayList.size() + i14;
                int size = arrayList.size() + this.f41320f0;
                this.f41320f0 = size;
                int i15 = this.f41325k0;
                this.f41316c0 = i15;
                if (!t9Var2.f5468i && t9Var2.f5469j) {
                    if (arrayList.isEmpty()) {
                        int i16 = this.f41325k0;
                        this.f41324j0 = i16;
                        this.f41325k0 = i16 + 2;
                        this.f41323i0 = i16 + 1;
                    }
                } else {
                    this.f41317d0 = i15;
                    int i17 = 3 - (size % 3);
                    if (size <= 0) {
                        i10 = 9;
                    } else if (i17 > 0) {
                        i10 = i17;
                    }
                    int i18 = i15 + i10;
                    this.f41325k0 = i18;
                    this.f41320f0 = size + i10;
                    this.f41318e0 = i18;
                }
                if (c()) {
                    t9Var.b();
                }
            } else if (this.J != null) {
                long clientUserId = UserConfig.getInstance(rp0.v0(rp0Var)).getClientUserId();
                for (int i19 = 0; i19 < this.J.d.size(); i19++) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.J.d.get(i19);
                    if (DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id) != clientUserId && DialogObject.getPeerDialogId(tL_starGiftUnique.host_id) != clientUserId) {
                        arrayList.add(tL_starGiftUnique);
                    }
                }
                int i20 = this.f41325k0;
                this.f41314b0 = i20;
                this.f41325k0 = arrayList.size() + i20;
                int size2 = arrayList.size() + this.f41320f0;
                this.f41320f0 = size2;
                int i21 = this.f41325k0;
                this.f41316c0 = i21;
                zh.u3 u3Var = this.J;
                if (u3Var.f53278t || !u3Var.f53279u) {
                    this.f41317d0 = i21;
                    int i22 = 3 - (size2 % 3);
                    if (size2 <= 0) {
                        i10 = 9;
                    } else if (i22 > 0) {
                        i10 = i22;
                    }
                    int i23 = i21 + i10;
                    this.f41325k0 = i23;
                    this.f41320f0 = size2 + i10;
                    this.f41318e0 = i23;
                }
                if (c()) {
                    this.J.g(false);
                }
            }
            int i24 = this.f41325k0;
            this.f41325k0 = i24 + 1;
            this.f41321g0 = i24;
        }
        int i25 = this.f41325k0;
        this.f41325k0 = i25 + 1;
        this.U = i25;
        qp0 qp0Var = this.E;
        if (qp0Var != null) {
            qp0Var.post(new bp0(this, 1));
        }
    }

    public final void l(qp0 qp0Var) {
        int i10;
        int i11 = org.telegram.ui.ActionBar.y6.f23354d6;
        rp0 rp0Var = this.f41330p0;
        int themedColor = rp0Var.getThemedColor(i11);
        rp0Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23297a7);
        int themedColor2 = rp0Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23765z6);
        int themedColor3 = rp0Var.getThemedColor(org.telegram.ui.ActionBar.y6.G6);
        qp0Var.v.setColor(themedColor);
        qp0Var.f42891x = org.telegram.ui.ActionBar.y6.o1(0.06f, themedColor3);
        qp0Var.f42892y = themedColor2;
        qp0Var.E = themedColor3;
        k10 k10Var = qp0Var.f42883a;
        for (int i12 = 0; i12 < k10Var.getChildCount(); i12++) {
            View childAt = k10Var.getChildAt(i12);
            int R = RecyclerView.R(childAt);
            if (R != -1 && (childAt instanceof TextView)) {
                TextView textView = (TextView) childAt;
                if (R == qp0Var.d) {
                    i10 = qp0Var.E;
                } else {
                    i10 = qp0Var.f42892y;
                }
                textView.setTextColor(i10);
                childAt.invalidate();
            }
        }
        k10Var.invalidate();
        qp0Var.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = this.m0;
        View view = this.f41333w;
        cp0 cp0Var = this.f41313b;
        if (i12 == 1) {
            super.onMeasure(i10, i11);
            gp0 gp0Var = this.v;
            this.f41328n0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + gp0Var.getMeasuredHeight() + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) gp0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) cp0Var.getLayoutParams()).topMargin = this.f41328n0 - AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.f41328n0 - AndroidUtilities.dp(64.0f);
            ((ViewGroup.MarginLayoutParams) this.f41334x.getLayoutParams()).topMargin = this.f41328n0 - AndroidUtilities.dp(16.0f);
            cp0Var.setPadding(cp0Var.getPaddingLeft(), AndroidUtilities.dp(16.0f), cp0Var.getPaddingRight(), cp0Var.getPaddingBottom());
        } else {
            this.f41328n0 = AndroidUtilities.dp(230.0f) + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) cp0Var.getLayoutParams()).topMargin = this.f41328n0;
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.f41328n0 - AndroidUtilities.dp(64.0f);
            ((ViewGroup.MarginLayoutParams) this.f41311a.getLayoutParams()).height = this.f41328n0;
        }
        super.onMeasure(i10, i11);
    }
}
