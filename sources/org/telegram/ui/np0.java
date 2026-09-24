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
public final class np0 extends FrameLayout {
    public static final int f35912q0 = 0;
    public final sp0 E;
    public View F;
    public boolean G;
    public boolean H;
    public TL_stars.TL_starGiftUnique I;
    public xh.v3 J;
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
    public final rp0 f35913a;
    public int f35914a0;
    public final ep0 f35915b;
    public int f35916b0;
    public final s4.s f35917c;
    public int f35918c0;
    public final gp0 d;
    public int f35919d0;
    public final n7.z0 e;
    public int f35920e0;
    public qp0 f35921f;
    public int f35922f0;
    public int f35923g0;
    public int h;
    public int f35924h0;
    public int f35925i0;
    public int f35926j0;
    public int f35927k0;
    public final ArrayList f35928l0;
    public final int m0;
    public long f35929n;
    public int f35930n0;
    public kp0 f35931o0;
    public final tp0 f35932p0;
    public TLRPC.TL_emojiStatusCollectible f35933r;
    public TLRPC.TL_peerColorCollectible f35934s;
    public final ip0 v;
    public final View f35935w;
    public final View f35936x;
    public mp0 f35937y;

    public np0(tp0 tp0Var, Context context, int i10) {
        super(context);
        int i11;
        this.f35932p0 = tp0Var;
        this.e = new n7.z0(7);
        this.h = -1;
        this.f35929n = 0L;
        this.f35933r = null;
        this.f35934s = null;
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
        this.f35914a0 = -1;
        this.f35916b0 = -1;
        this.f35918c0 = -1;
        this.f35919d0 = -1;
        this.f35920e0 = -1;
        this.f35922f0 = 0;
        this.f35923g0 = -1;
        this.f35924h0 = -1;
        this.f35925i0 = -1;
        this.f35926j0 = -1;
        this.f35928l0 = new ArrayList();
        this.m0 = i10;
        d();
        Context context2 = getContext();
        org.telegram.ui.ActionBar.d6 resourceProvider = tp0Var.getResourceProvider();
        ah.c cVar = tp0Var.G;
        ep0 ep0Var = new ep0(this, context2, resourceProvider, i10);
        this.f35915b = ep0Var;
        ep0Var.setClipToPadding(false);
        ep0Var.setSections(true);
        ((s4.j) ep0Var.getItemAnimator()).f42981m = false;
        getContext();
        s4.s sVar = new s4.s(3);
        this.f35917c = sVar;
        sVar.O = new ci.x1(this, 6);
        ep0Var.i(new ci.r1(this, 7));
        ep0Var.setLayoutManager(sVar);
        gp0 gp0Var = new gp0(this, context, i10);
        this.d = gp0Var;
        ep0Var.setAdapter(gp0Var);
        ep0Var.setOnItemClickListener(new org.telegram.ui.Components.bn0(this, i10, 1));
        ep0Var.j(new hp0(this, i10));
        addView(ep0Var, w7.y5.c(-1.0f, -1));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.pq(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
        if (tp0Var.f38147a) {
            i11 = R.string.ChannelColorApply;
        } else {
            i11 = R.string.UserColorApply;
        }
        String string = LocaleController.getString(i11);
        this.O = string;
        this.N = new SpannableStringBuilder(spannableStringBuilder).append((CharSequence) " ").append((CharSequence) string);
        this.P = LocaleController.getString(R.string.UserColorApplyCollectible);
        f(false);
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(org.telegram.ui.Components.rr.h);
        jVar.C = false;
        jVar.f42981m = false;
        ep0Var.setItemAnimator(jVar);
        View view = new View(getContext());
        this.f35935w = view;
        ah.d dVar = new ah.d(cVar.c(view, null, false));
        dVar.b(-AndroidUtilities.dp(24.0f), true);
        dVar.f441q = 220;
        view.setBackground(dVar);
        addView(view, w7.y5.e(-1, 72, 55));
        if (i10 == 0) {
            this.f35913a = new rp0(tp0.f0(tp0Var), 0L, getContext(), tp0.g0(tp0Var));
            j(false);
        } else {
            View view2 = new View(getContext());
            this.f35936x = view2;
            ah.d dVar2 = new ah.d(cVar.c(view2, null, false));
            dVar2.b(-AndroidUtilities.dp(16.0f), false);
            view2.setBackground(dVar2);
            addView(view2, w7.y5.e(-1, 16, 55));
            ?? iaVar = new org.telegram.ui.Cells.ia(getContext(), tp0.h0(tp0Var), 3, 0L, tp0.i0(tp0Var));
            this.v = iaVar;
            iaVar.setImportantForAccessibility(4);
            iaVar.f20456r = tp0Var;
            iaVar.setClipToOutline(true);
            ai.k2 k2Var = yf.i0.f47100a;
            iaVar.setOutlineProvider(new yf.h0(0, AndroidUtilities.dp(16.0f)));
            addView((View) iaVar, w7.y5.d(-1, -2.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        sp0 sp0Var = new sp0(tp0Var, getContext(), tp0.j0(tp0Var));
        this.E = sp0Var;
        ch.d c10 = tp0Var.E.c(sp0Var, null, false);
        dh.e eVar = new dh.e(tp0.k0(tp0Var));
        eVar.e = new d2.c(8);
        eVar.f(0, 0);
        eVar.e(0, 0);
        eVar.d(0, 0);
        c10.o(eVar);
        c10.q(AndroidUtilities.dp(18.0f));
        c10.f4280j.e = true;
        sp0Var.H = c10;
        sp0Var.G = c10;
        sp0Var.F = new dp0(this, 0);
        sp0Var.setVisibility(4);
        addView(sp0Var, w7.y5.d(-1, 36.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        rp0 rp0Var = this.f35913a;
        if (rp0Var != null) {
            addView(rp0Var, w7.y5.e(-1, -2, 55));
        }
        g();
        k();
        setWillNotDraw(false);
    }

    public static void a(np0 np0Var) {
        int i10;
        ep0 ep0Var = np0Var.f35915b;
        boolean z10 = np0Var.H;
        if (z10) {
            ep0Var.B0();
        }
        np0Var.e();
        if (z10 && (i10 = np0Var.f35924h0) >= 0) {
            np0Var.f35917c.h1(i10, np0Var.f35932p0.f38155f);
            ep0Var.post(new dp0(np0Var, 1));
        }
    }

    public final boolean b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.np0.b():boolean");
    }

    public final boolean c() {
        ep0 ep0Var = this.f35915b;
        if (ep0Var != null) {
            for (int i10 = 0; i10 < ep0Var.getChildCount(); i10++) {
                if (ep0Var.getChildAt(i10) instanceof org.telegram.ui.Components.u00) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void d() {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible;
        int i10 = this.m0;
        tp0 tp0Var = this.f35932p0;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible = null;
        if (i10 == 0) {
            TLRPC.User currentUser = tp0Var.getUserConfig().getCurrentUser();
            this.h = UserObject.getProfileColorId(currentUser);
            this.f35929n = UserObject.getProfileEmojiId(currentUser);
            if (currentUser != null) {
                TLRPC.EmojiStatus emojiStatus = currentUser.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                    this.f35933r = tL_emojiStatusCollectible;
                    this.f35934s = null;
                }
            }
            tL_emojiStatusCollectible = null;
            this.f35933r = tL_emojiStatusCollectible;
            this.f35934s = null;
        } else {
            TLRPC.User currentUser2 = tp0Var.getUserConfig().getCurrentUser();
            this.h = UserObject.getColorId(currentUser2);
            this.f35929n = UserObject.getEmojiId(currentUser2);
            this.f35933r = null;
            if (currentUser2 != null) {
                TLRPC.PeerColor peerColor = currentUser2.color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                }
            }
            this.f35934s = tL_peerColorCollectible;
        }
        if (this.f35933r == null && this.f35934s == null) {
            return;
        }
        this.h = -1;
        this.f35929n = 0L;
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
        this.d.l();
    }

    public final void f(boolean z10) {
        Object obj;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.I;
        tp0 tp0Var = this.f35932p0;
        n7.z0 z0Var = this.e;
        if (tL_starGiftUnique != null) {
            zf.a resellAmount = tL_starGiftUnique.getResellAmount(zf.b.f49216a);
            if (tL_starGiftUnique.resale_ton_only) {
                z0Var.f15395b = yh.w7.S0(LocaleController.formatString(R.string.ResellGiftBuyTON, tL_starGiftUnique.getResellAmount(zf.b.f49217b).d()), true);
                z0Var.f15396c = yh.w7.Q0(LocaleController.formatPluralStringComma("ResellGiftBuyEq", (int) resellAmount.a()));
            } else {
                z0Var.f15395b = yh.w7.Q0(LocaleController.formatPluralStringComma("ResellGiftBuy", (int) resellAmount.a()));
                z0Var.f15396c = null;
            }
        } else {
            if (!tp0Var.getUserConfig().isPremium() && !tp0Var.f38147a) {
                obj = this.N;
            } else if (this.f35933r != null) {
                obj = this.P;
            } else {
                obj = this.O;
            }
            z0Var.f15395b = obj;
            z0Var.f15396c = null;
        }
        if (tp0Var.C0() == this) {
            tp0Var.R = this;
            tp0Var.Q.g((CharSequence) z0Var.f15395b, z10, true);
            tp0Var.Q.f((SpannableStringBuilder) z0Var.f15396c, z10);
        }
    }

    public final void g() {
        ci.d dVar = this.f35932p0.Q;
        if (dVar != null) {
            dVar.j();
        }
        ip0 ip0Var = this.v;
        if (ip0Var != null) {
            ip0Var.invalidate();
        }
        j(true);
        AndroidUtilities.forEachViews((RecyclerView) this.f35915b, (Utilities.Callback<View>) new t3(this, 14));
        sp0 sp0Var = this.E;
        if (sp0Var != null) {
            l(sp0Var);
        }
    }

    public final void h() {
        int i10;
        boolean z10;
        int i11 = this.f35932p0.f38155f;
        float f7 = 0.0f;
        View view = this.f35935w;
        sp0 sp0Var = this.E;
        if (sp0Var != null && (i10 = this.f35924h0) >= 0) {
            s4.s sVar = this.f35917c;
            this.F = sVar.m(i10);
            ep0 ep0Var = this.f35915b;
            int paddingTop = ep0Var.getPaddingTop() + i11;
            int L0 = sVar.L0();
            View view2 = this.F;
            if (view2 != null) {
                if (view2.getTop() <= paddingTop) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.H = z10;
                this.G = !z10;
                sp0Var.setVisibility(0);
                sp0Var.setTranslationY((Math.max(this.F.getTop(), paddingTop) + ep0Var.getTop()) - sp0Var.getTop());
            } else if (L0 != -1 && L0 > this.f35924h0) {
                this.H = true;
                this.G = false;
                sp0Var.setVisibility(0);
                sp0Var.setTranslationY((ep0Var.getTop() + paddingTop) - sp0Var.getTop());
            } else {
                this.H = false;
                this.G = false;
                sp0Var.setVisibility(0);
                sp0Var.setTranslationY((AndroidUtilities.dp(1.0f) + getHeight()) - sp0Var.getTop());
            }
            boolean z11 = this.G;
            if (sp0Var.I != z11) {
                sp0Var.I = z11;
                sp0Var.L.D0(2);
                sp0Var.invalidate();
            }
            if (this.H) {
                f7 = AndroidUtilities.dp(36.0f) + i11;
            }
            view.setTranslationY(f7);
            ep0Var.invalidate();
            invalidate();
            return;
        }
        this.G = false;
        this.H = false;
        if (view != null) {
            view.setTranslationY(0.0f);
        }
        if (sp0Var != null) {
            sp0Var.setVisibility(4);
            boolean z12 = this.G;
            if (sp0Var.I != z12) {
                sp0Var.I = z12;
                sp0Var.L.D0(2);
                sp0Var.invalidate();
            }
        }
    }

    public final void i() {
        MessageObject messageObject;
        ip0 ip0Var = this.v;
        if (ip0Var != null) {
            org.telegram.ui.Cells.u1[] cells = ip0Var.getCells();
            for (int i10 = 0; i10 < cells.length; i10++) {
                org.telegram.ui.Cells.u1 u1Var = cells[i10];
                if (u1Var != null && (messageObject = u1Var.getMessageObject()) != null) {
                    messageObject.notime = true;
                    qp0 qp0Var = this.f35921f;
                    if (qp0Var != null) {
                        messageObject.overrideLinkColor = qp0Var.getColorId();
                    }
                    messageObject.overrideLinkEmoji = this.f35929n;
                    messageObject.overrideLinkPeerColor = this.f35934s;
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
        tp0 tp0Var;
        vo0 vo0Var;
        qp0 qp0Var = this.f35921f;
        if (qp0Var != null) {
            qp0Var.a(this.h, z10);
        }
        rp0 rp0Var = this.f35913a;
        if (rp0Var != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.f35933r;
            if (tL_emojiStatusCollectible != null) {
                rp0Var.e(tL_emojiStatusCollectible.document_id, true, z10);
                rp0Var.c(MessagesController.PeerColor.fromCollectible(this.f35933r), z10);
                rp0Var.d(this.f35933r.pattern_document_id, true, z10);
            } else {
                if (DialogObject.isEmojiStatusCollectible(0L)) {
                    rp0Var.e(0L, false, z10);
                } else {
                    rp0Var.e(DialogObject.getEmojiStatusDocumentId(0L), DialogObject.isEmojiStatusCollectible(0L), z10);
                }
                rp0Var.b(this.h, z10);
                rp0Var.d(this.f35929n, false, z10);
            }
        }
        int i11 = this.m0;
        if (i11 == 0 && (vo0Var = (tp0Var = this.f35932p0).e) != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = this.f35933r;
            if (tL_emojiStatusCollectible2 != null) {
                vo0Var.c(MessagesController.PeerColor.fromCollectible(tL_emojiStatusCollectible2), z10);
            } else {
                vo0Var.b(tp0.v0(tp0Var), this.h, z10);
            }
        }
        if (i11 == 0) {
            int i12 = this.V;
            k();
            gp0 gp0Var = this.d;
            if (i12 >= 0 && this.V < 0) {
                gp0Var.t(i12, 2);
            } else if (i12 < 0 && (i10 = this.V) >= 0) {
                gp0Var.s(i10, 2);
            }
        }
        int i13 = 0;
        while (true) {
            ep0 ep0Var = this.f35915b;
            if (i13 < ep0Var.getChildCount()) {
                View childAt = ep0Var.getChildAt(i13);
                if (childAt instanceof bp0) {
                    bp0 bp0Var = (bp0) childAt;
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible3 = this.f35933r;
                    if ((tL_emojiStatusCollectible3 != null && tL_emojiStatusCollectible3.collectible_id == bp0Var.getGiftId()) || ((tL_peerColorCollectible2 = this.f35934s) != null && tL_peerColorCollectible2.collectible_id == bp0Var.getGiftId())) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    bp0Var.b(z12, true);
                } else if (childAt instanceof xh.j1) {
                    xh.j1 j1Var = (xh.j1) childAt;
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible4 = this.f35933r;
                    if ((tL_emojiStatusCollectible4 != null && tL_emojiStatusCollectible4.collectible_id == j1Var.getGiftId()) || ((tL_peerColorCollectible = this.f35934s) != null && tL_peerColorCollectible.collectible_id == j1Var.getGiftId())) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    j1Var.e(z11, true);
                }
                i13++;
            } else {
                return;
            }
        }
    }

    public final void k() {
        yh.k5 k5Var;
        tp0 tp0Var = this.f35932p0;
        yh.k5 k5Var2 = tp0Var.f38149b;
        this.V = -1;
        this.W = -1;
        this.f35914a0 = -1;
        this.f35916b0 = -1;
        this.f35919d0 = -1;
        this.f35920e0 = -1;
        this.f35918c0 = -1;
        this.f35923g0 = -1;
        this.f35924h0 = -1;
        this.f35925i0 = -1;
        this.f35926j0 = -1;
        this.f35922f0 = 0;
        ArrayList arrayList = this.f35928l0;
        arrayList.clear();
        this.Q = 0;
        this.S = 1;
        int i10 = 3;
        this.f35927k0 = 3;
        this.R = 2;
        int i11 = this.m0;
        if (i11 == 0 && (this.h >= 0 || this.f35933r != null || this.f35934s != null)) {
            this.V = 3;
            this.f35927k0 = 5;
            this.W = 4;
        }
        if (i11 == 1) {
            k5Var = tp0Var.f38151c;
        } else {
            k5Var = k5Var2;
        }
        if ((i11 == 0 || i11 == 1) && k5Var != null) {
            ArrayList arrayList2 = k5Var.f47601l;
            int i12 = this.f35927k0;
            this.f35927k0 = i12 + 1;
            this.f35924h0 = i12;
            if (this.K == null) {
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) arrayList2.get(i13)).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        arrayList.add((TL_stars.TL_starGiftUnique) starGift);
                    }
                }
                int i14 = this.f35927k0;
                this.f35916b0 = i14;
                this.f35927k0 = arrayList.size() + i14;
                int size = arrayList.size() + this.f35922f0;
                this.f35922f0 = size;
                int i15 = this.f35927k0;
                this.f35918c0 = i15;
                if (!k5Var2.f47598i && k5Var2.f47599j) {
                    if (arrayList.isEmpty()) {
                        int i16 = this.f35927k0;
                        this.f35926j0 = i16;
                        this.f35927k0 = i16 + 2;
                        this.f35925i0 = i16 + 1;
                    }
                } else {
                    this.f35919d0 = i15;
                    int i17 = 3 - (size % 3);
                    if (size <= 0) {
                        i10 = 9;
                    } else if (i17 > 0) {
                        i10 = i17;
                    }
                    int i18 = i15 + i10;
                    this.f35927k0 = i18;
                    this.f35922f0 = size + i10;
                    this.f35920e0 = i18;
                }
                if (c()) {
                    k5Var.a();
                }
            } else if (this.J != null) {
                long clientUserId = UserConfig.getInstance(tp0.u0(tp0Var)).getClientUserId();
                for (int i19 = 0; i19 < this.J.d.size(); i19++) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.J.d.get(i19);
                    if (DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id) != clientUserId && DialogObject.getPeerDialogId(tL_starGiftUnique.host_id) != clientUserId) {
                        arrayList.add(tL_starGiftUnique);
                    }
                }
                int i20 = this.f35927k0;
                this.f35916b0 = i20;
                this.f35927k0 = arrayList.size() + i20;
                int size2 = arrayList.size() + this.f35922f0;
                this.f35922f0 = size2;
                int i21 = this.f35927k0;
                this.f35918c0 = i21;
                xh.v3 v3Var = this.J;
                if (v3Var.f46452t || !v3Var.f46453u) {
                    this.f35919d0 = i21;
                    int i22 = 3 - (size2 % 3);
                    if (size2 <= 0) {
                        i10 = 9;
                    } else if (i22 > 0) {
                        i10 = i22;
                    }
                    int i23 = i21 + i10;
                    this.f35927k0 = i23;
                    this.f35922f0 = size2 + i10;
                    this.f35920e0 = i23;
                }
                if (c()) {
                    this.J.g(false);
                }
            }
            int i24 = this.f35927k0;
            this.f35927k0 = i24 + 1;
            this.f35923g0 = i24;
        }
        int i25 = this.f35927k0;
        this.f35927k0 = i25 + 1;
        this.U = i25;
        sp0 sp0Var = this.E;
        if (sp0Var != null) {
            sp0Var.post(new dp0(this, 1));
        }
    }

    public final void l(sp0 sp0Var) {
        int i10;
        int i11 = org.telegram.ui.ActionBar.h6.f19045d6;
        tp0 tp0Var = this.f35932p0;
        int themedColor = tp0Var.getThemedColor(i11);
        tp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f18989a7);
        int themedColor2 = tp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f19447z6);
        int themedColor3 = tp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.G6);
        sp0Var.v.setColor(themedColor);
        sp0Var.f37831x = org.telegram.ui.ActionBar.h6.l1(0.06f, themedColor3);
        sp0Var.f37832y = themedColor2;
        sp0Var.E = themedColor3;
        l60 l60Var = sp0Var.f37823a;
        for (int i12 = 0; i12 < l60Var.getChildCount(); i12++) {
            View childAt = l60Var.getChildAt(i12);
            int R = RecyclerView.R(childAt);
            if (R != -1 && (childAt instanceof TextView)) {
                TextView textView = (TextView) childAt;
                if (R == sp0Var.d) {
                    i10 = sp0Var.E;
                } else {
                    i10 = sp0Var.f37832y;
                }
                textView.setTextColor(i10);
                childAt.invalidate();
            }
        }
        l60Var.invalidate();
        sp0Var.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = this.m0;
        View view = this.f35935w;
        ep0 ep0Var = this.f35915b;
        if (i12 == 1) {
            super.onMeasure(i10, i11);
            ip0 ip0Var = this.v;
            this.f35930n0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + ip0Var.getMeasuredHeight() + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) ip0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) ep0Var.getLayoutParams()).topMargin = this.f35930n0 - AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.f35930n0 - AndroidUtilities.dp(64.0f);
            ((ViewGroup.MarginLayoutParams) this.f35936x.getLayoutParams()).topMargin = this.f35930n0 - AndroidUtilities.dp(16.0f);
            ep0Var.setPadding(ep0Var.getPaddingLeft(), AndroidUtilities.dp(16.0f), ep0Var.getPaddingRight(), ep0Var.getPaddingBottom());
        } else {
            this.f35930n0 = AndroidUtilities.dp(230.0f) + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) ep0Var.getLayoutParams()).topMargin = this.f35930n0;
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.f35930n0 - AndroidUtilities.dp(64.0f);
            ((ViewGroup.MarginLayoutParams) this.f35913a.getLayoutParams()).height = this.f35930n0;
        }
        super.onMeasure(i10, i11);
    }
}
