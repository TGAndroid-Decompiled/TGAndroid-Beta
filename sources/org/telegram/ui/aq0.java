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
public final class aq0 extends FrameLayout {
    public static final int f34302q0 = 0;
    public final fq0 E;
    public View F;
    public boolean G;
    public boolean H;
    public TL_stars.TL_starGiftUnique I;
    public yh.t3 J;
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
    public final eq0 f34303a;
    public int f34304a0;
    public final rp0 f34305b;
    public int f34306b0;
    public final s4.s f34307c;
    public int f34308c0;
    public final tp0 d;
    public int f34309d0;
    public final n6.o e;
    public int f34310e0;
    public dq0 f34311f;
    public int f34312f0;
    public int f34313g0;
    public int h;
    public int f34314h0;
    public int f34315i0;
    public int f34316j0;
    public int f34317k0;
    public final ArrayList f34318l0;
    public final int m0;
    public long f34319n;
    public int f34320n0;
    public xp0 f34321o0;
    public final gq0 f34322p0;
    public TLRPC.TL_emojiStatusCollectible f34323r;
    public TLRPC.TL_peerColorCollectible f34324s;
    public final vp0 v;
    public final View f34325w;
    public final View f34326x;
    public zp0 f34327y;

    public aq0(gq0 gq0Var, Context context, int i10) {
        super(context);
        int i11;
        this.f34322p0 = gq0Var;
        this.e = new n6.o(8, false);
        this.h = -1;
        this.f34319n = 0L;
        this.f34323r = null;
        this.f34324s = null;
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
        this.f34304a0 = -1;
        this.f34306b0 = -1;
        this.f34308c0 = -1;
        this.f34309d0 = -1;
        this.f34310e0 = -1;
        this.f34312f0 = 0;
        this.f34313g0 = -1;
        this.f34314h0 = -1;
        this.f34315i0 = -1;
        this.f34316j0 = -1;
        this.f34318l0 = new ArrayList();
        this.m0 = i10;
        d();
        Context context2 = getContext();
        org.telegram.ui.ActionBar.c6 resourceProvider = gq0Var.getResourceProvider();
        bh.b bVar = gq0Var.G;
        rp0 rp0Var = new rp0(this, context2, resourceProvider, i10);
        this.f34305b = rp0Var;
        rp0Var.setClipToPadding(false);
        rp0Var.setSections(true);
        ((s4.k) rp0Var.getItemAnimator()).f44872m = false;
        getContext();
        s4.s sVar = new s4.s(3);
        this.f34307c = sVar;
        sVar.O = new di.w1(this, 6);
        rp0Var.i(new di.q1(this, 7));
        rp0Var.setLayoutManager(sVar);
        tp0 tp0Var = new tp0(this, context, i10);
        this.d = tp0Var;
        rp0Var.setAdapter(tp0Var);
        rp0Var.setOnItemClickListener(new org.telegram.ui.Components.rn0(this, i10, 1));
        rp0Var.j(new up0(this, i10));
        addView(rp0Var, w7.a6.d(-1.0f, -1));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.br(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
        if (gq0Var.f36448a) {
            i11 = R.string.ChannelColorApply;
        } else {
            i11 = R.string.UserColorApply;
        }
        String string = LocaleController.getString(i11);
        this.O = string;
        this.N = new SpannableStringBuilder(spannableStringBuilder).append((CharSequence) " ").append((CharSequence) string);
        this.P = LocaleController.getString(R.string.UserColorApplyCollectible);
        f(false);
        s4.k kVar = new s4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.es.h);
        kVar.C = false;
        kVar.f44872m = false;
        rp0Var.setItemAnimator(kVar);
        View view = new View(getContext());
        this.f34325w = view;
        bh.c cVar = new bh.c(bVar.c(view, null, false));
        cVar.b(-AndroidUtilities.dp(24.0f), true);
        cVar.f2761q = 220;
        view.setBackground(cVar);
        addView(view, w7.a6.e(-1, 72, 55));
        if (i10 == 0) {
            this.f34303a = new eq0(gq0.f0(gq0Var), 0L, getContext(), gq0.g0(gq0Var));
            j(false);
        } else {
            View view2 = new View(getContext());
            this.f34326x = view2;
            bh.c cVar2 = new bh.c(bVar.c(view2, null, false));
            cVar2.b(-AndroidUtilities.dp(16.0f), false);
            view2.setBackground(cVar2);
            addView(view2, w7.a6.e(-1, 16, 55));
            ?? gaVar = new org.telegram.ui.Cells.ga(getContext(), gq0.h0(gq0Var), 3, 0L, gq0.i0(gq0Var));
            this.v = gaVar;
            gaVar.setImportantForAccessibility(4);
            gaVar.f21247r = gq0Var;
            gaVar.setClipToOutline(true);
            bi.a2 a2Var = zf.j0.f50191a;
            gaVar.setOutlineProvider(new zf.i0(0, AndroidUtilities.dp(16.0f)));
            addView((View) gaVar, w7.a6.a(-2.0f, 12.0f, 0.0f, 12.0f, 0.0f, -1, 55));
        }
        fq0 fq0Var = new fq0(gq0Var, getContext(), gq0.j0(gq0Var));
        this.E = fq0Var;
        dh.d c10 = gq0Var.E.c(fq0Var, null, false);
        eh.e eVar = new eh.e(gq0.k0(gq0Var));
        eVar.e = new bi.w2(22);
        eVar.d(0, 0);
        eVar.c(0, 0);
        eVar.b(0, 0);
        c10.o(eVar);
        c10.q(AndroidUtilities.dp(18.0f));
        c10.f6558j.e = true;
        fq0Var.H = c10;
        fq0Var.G = c10;
        fq0Var.F = new qp0(this, 0);
        fq0Var.setVisibility(4);
        addView(fq0Var, w7.a6.a(36.0f, 12.0f, 0.0f, 12.0f, 0.0f, -1, 55));
        eq0 eq0Var = this.f34303a;
        if (eq0Var != null) {
            addView(eq0Var, w7.a6.e(-1, -2, 55));
        }
        g();
        k();
        setWillNotDraw(false);
    }

    public static void a(aq0 aq0Var) {
        int i10;
        rp0 rp0Var = aq0Var.f34305b;
        boolean z10 = aq0Var.H;
        if (z10) {
            rp0Var.B0();
        }
        aq0Var.e();
        if (z10 && (i10 = aq0Var.f34314h0) >= 0) {
            aq0Var.f34307c.h1(i10, aq0Var.f34322p0.f36456f);
            rp0Var.post(new qp0(aq0Var, 1));
        }
    }

    public final boolean b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.aq0.b():boolean");
    }

    public final boolean c() {
        rp0 rp0Var = this.f34305b;
        if (rp0Var != null) {
            for (int i10 = 0; i10 < rp0Var.getChildCount(); i10++) {
                if (rp0Var.getChildAt(i10) instanceof org.telegram.ui.Components.f10) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void d() {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible;
        int i10 = this.m0;
        gq0 gq0Var = this.f34322p0;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible = null;
        if (i10 == 0) {
            TLRPC.User currentUser = gq0Var.getUserConfig().getCurrentUser();
            this.h = UserObject.getProfileColorId(currentUser);
            this.f34319n = UserObject.getProfileEmojiId(currentUser);
            if (currentUser != null) {
                TLRPC.EmojiStatus emojiStatus = currentUser.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                    this.f34323r = tL_emojiStatusCollectible;
                    this.f34324s = null;
                }
            }
            tL_emojiStatusCollectible = null;
            this.f34323r = tL_emojiStatusCollectible;
            this.f34324s = null;
        } else {
            TLRPC.User currentUser2 = gq0Var.getUserConfig().getCurrentUser();
            this.h = UserObject.getColorId(currentUser2);
            this.f34319n = UserObject.getEmojiId(currentUser2);
            this.f34323r = null;
            if (currentUser2 != null) {
                TLRPC.PeerColor peerColor = currentUser2.color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                }
            }
            this.f34324s = tL_peerColorCollectible;
        }
        if (this.f34323r == null && this.f34324s == null) {
            return;
        }
        this.h = -1;
        this.f34319n = 0L;
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
        gq0 gq0Var = this.f34322p0;
        n6.o oVar = this.e;
        if (tL_starGiftUnique != null) {
            ag.a resellAmount = tL_starGiftUnique.getResellAmount(ag.b.f629a);
            if (tL_starGiftUnique.resale_ton_only) {
                oVar.f16131b = zh.p7.T0(LocaleController.formatString(R.string.ResellGiftBuyTON, tL_starGiftUnique.getResellAmount(ag.b.f630b).d()), true);
                oVar.f16132c = zh.p7.R0(LocaleController.formatPluralStringComma("ResellGiftBuyEq", (int) resellAmount.a()));
            } else {
                oVar.f16131b = zh.p7.R0(LocaleController.formatPluralStringComma("ResellGiftBuy", (int) resellAmount.a()));
                oVar.f16132c = null;
            }
        } else {
            if (!gq0Var.getUserConfig().isPremium() && !gq0Var.f36448a) {
                obj = this.N;
            } else if (this.f34323r != null) {
                obj = this.P;
            } else {
                obj = this.O;
            }
            oVar.f16131b = obj;
            oVar.f16132c = null;
        }
        if (gq0Var.C0() == this) {
            gq0Var.R = this;
            gq0Var.Q.g((CharSequence) oVar.f16131b, z10, true);
            gq0Var.Q.f((SpannableStringBuilder) oVar.f16132c, z10);
        }
    }

    public final void g() {
        di.d dVar = this.f34322p0.Q;
        if (dVar != null) {
            dVar.j();
        }
        vp0 vp0Var = this.v;
        if (vp0Var != null) {
            vp0Var.invalidate();
        }
        j(true);
        AndroidUtilities.forEachViews((RecyclerView) this.f34305b, (Utilities.Callback<View>) new v3(this, 14));
        fq0 fq0Var = this.E;
        if (fq0Var != null) {
            l(fq0Var);
        }
    }

    public final void h() {
        int i10;
        boolean z10;
        int i11 = this.f34322p0.f36456f;
        float f7 = 0.0f;
        View view = this.f34325w;
        fq0 fq0Var = this.E;
        if (fq0Var != null && (i10 = this.f34314h0) >= 0) {
            s4.s sVar = this.f34307c;
            this.F = sVar.m(i10);
            rp0 rp0Var = this.f34305b;
            int paddingTop = rp0Var.getPaddingTop() + i11;
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
                fq0Var.setVisibility(0);
                fq0Var.setTranslationY((Math.max(this.F.getTop(), paddingTop) + rp0Var.getTop()) - fq0Var.getTop());
            } else if (L0 != -1 && L0 > this.f34314h0) {
                this.H = true;
                this.G = false;
                fq0Var.setVisibility(0);
                fq0Var.setTranslationY((rp0Var.getTop() + paddingTop) - fq0Var.getTop());
            } else {
                this.H = false;
                this.G = false;
                fq0Var.setVisibility(0);
                fq0Var.setTranslationY((AndroidUtilities.dp(1.0f) + getHeight()) - fq0Var.getTop());
            }
            boolean z11 = this.G;
            if (fq0Var.I != z11) {
                fq0Var.I = z11;
                fq0Var.L.D0(2);
                fq0Var.invalidate();
            }
            if (this.H) {
                f7 = AndroidUtilities.dp(36.0f) + i11;
            }
            view.setTranslationY(f7);
            rp0Var.invalidate();
            invalidate();
            return;
        }
        this.G = false;
        this.H = false;
        if (view != null) {
            view.setTranslationY(0.0f);
        }
        if (fq0Var != null) {
            fq0Var.setVisibility(4);
            boolean z12 = this.G;
            if (fq0Var.I != z12) {
                fq0Var.I = z12;
                fq0Var.L.D0(2);
                fq0Var.invalidate();
            }
        }
    }

    public final void i() {
        MessageObject messageObject;
        vp0 vp0Var = this.v;
        if (vp0Var != null) {
            org.telegram.ui.Cells.u1[] cells = vp0Var.getCells();
            for (int i10 = 0; i10 < cells.length; i10++) {
                org.telegram.ui.Cells.u1 u1Var = cells[i10];
                if (u1Var != null && (messageObject = u1Var.getMessageObject()) != null) {
                    messageObject.notime = true;
                    dq0 dq0Var = this.f34311f;
                    if (dq0Var != null) {
                        messageObject.overrideLinkColor = dq0Var.getColorId();
                    }
                    messageObject.overrideLinkEmoji = this.f34319n;
                    messageObject.overrideLinkPeerColor = this.f34324s;
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
        gq0 gq0Var;
        jp0 jp0Var;
        dq0 dq0Var = this.f34311f;
        if (dq0Var != null) {
            dq0Var.a(this.h, z10);
        }
        eq0 eq0Var = this.f34303a;
        if (eq0Var != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.f34323r;
            if (tL_emojiStatusCollectible != null) {
                eq0Var.e(tL_emojiStatusCollectible.document_id, true, z10);
                eq0Var.c(MessagesController.PeerColor.fromCollectible(this.f34323r), z10);
                eq0Var.d(this.f34323r.pattern_document_id, true, z10);
            } else {
                if (DialogObject.isEmojiStatusCollectible(0L)) {
                    eq0Var.e(0L, false, z10);
                } else {
                    eq0Var.e(DialogObject.getEmojiStatusDocumentId(0L), DialogObject.isEmojiStatusCollectible(0L), z10);
                }
                eq0Var.b(this.h, z10);
                eq0Var.d(this.f34319n, false, z10);
            }
        }
        int i11 = this.m0;
        if (i11 == 0 && (jp0Var = (gq0Var = this.f34322p0).e) != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = this.f34323r;
            if (tL_emojiStatusCollectible2 != null) {
                jp0Var.c(MessagesController.PeerColor.fromCollectible(tL_emojiStatusCollectible2), z10);
            } else {
                jp0Var.b(gq0.v0(gq0Var), this.h, z10);
            }
        }
        if (i11 == 0) {
            int i12 = this.V;
            k();
            tp0 tp0Var = this.d;
            if (i12 >= 0 && this.V < 0) {
                tp0Var.t(i12, 2);
            } else if (i12 < 0 && (i10 = this.V) >= 0) {
                tp0Var.s(i10, 2);
            }
        }
        int i13 = 0;
        while (true) {
            rp0 rp0Var = this.f34305b;
            if (i13 < rp0Var.getChildCount()) {
                View childAt = rp0Var.getChildAt(i13);
                if (childAt instanceof op0) {
                    op0 op0Var = (op0) childAt;
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible3 = this.f34323r;
                    if ((tL_emojiStatusCollectible3 != null && tL_emojiStatusCollectible3.collectible_id == op0Var.getGiftId()) || ((tL_peerColorCollectible2 = this.f34324s) != null && tL_peerColorCollectible2.collectible_id == op0Var.getGiftId())) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    op0Var.b(z12, true);
                } else if (childAt instanceof yh.h1) {
                    yh.h1 h1Var = (yh.h1) childAt;
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible4 = this.f34323r;
                    if ((tL_emojiStatusCollectible4 != null && tL_emojiStatusCollectible4.collectible_id == h1Var.getGiftId()) || ((tL_peerColorCollectible = this.f34324s) != null && tL_peerColorCollectible.collectible_id == h1Var.getGiftId())) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    h1Var.e(z11, true);
                }
                i13++;
            } else {
                return;
            }
        }
    }

    public final void k() {
        zh.f5 f5Var;
        gq0 gq0Var = this.f34322p0;
        zh.f5 f5Var2 = gq0Var.f36450b;
        this.V = -1;
        this.W = -1;
        this.f34304a0 = -1;
        this.f34306b0 = -1;
        this.f34309d0 = -1;
        this.f34310e0 = -1;
        this.f34308c0 = -1;
        this.f34313g0 = -1;
        this.f34314h0 = -1;
        this.f34315i0 = -1;
        this.f34316j0 = -1;
        this.f34312f0 = 0;
        ArrayList arrayList = this.f34318l0;
        arrayList.clear();
        this.Q = 0;
        this.S = 1;
        int i10 = 3;
        this.f34317k0 = 3;
        this.R = 2;
        int i11 = this.m0;
        if (i11 == 0 && (this.h >= 0 || this.f34323r != null || this.f34324s != null)) {
            this.V = 3;
            this.f34317k0 = 5;
            this.W = 4;
        }
        if (i11 == 1) {
            f5Var = gq0Var.f36452c;
        } else {
            f5Var = f5Var2;
        }
        if ((i11 == 0 || i11 == 1) && f5Var != null) {
            ArrayList arrayList2 = f5Var.f50509l;
            int i12 = this.f34317k0;
            this.f34317k0 = i12 + 1;
            this.f34314h0 = i12;
            if (this.K == null) {
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) arrayList2.get(i13)).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        arrayList.add((TL_stars.TL_starGiftUnique) starGift);
                    }
                }
                int i14 = this.f34317k0;
                this.f34306b0 = i14;
                this.f34317k0 = arrayList.size() + i14;
                int size = arrayList.size() + this.f34312f0;
                this.f34312f0 = size;
                int i15 = this.f34317k0;
                this.f34308c0 = i15;
                if (!f5Var2.f50506i && f5Var2.f50507j) {
                    if (arrayList.isEmpty()) {
                        int i16 = this.f34317k0;
                        this.f34316j0 = i16;
                        this.f34317k0 = i16 + 2;
                        this.f34315i0 = i16 + 1;
                    }
                } else {
                    this.f34309d0 = i15;
                    int i17 = 3 - (size % 3);
                    if (size <= 0) {
                        i10 = 9;
                    } else if (i17 > 0) {
                        i10 = i17;
                    }
                    int i18 = i15 + i10;
                    this.f34317k0 = i18;
                    this.f34312f0 = size + i10;
                    this.f34310e0 = i18;
                }
                if (c()) {
                    f5Var.a();
                }
            } else if (this.J != null) {
                long clientUserId = UserConfig.getInstance(gq0.u0(gq0Var)).getClientUserId();
                for (int i19 = 0; i19 < this.J.d.size(); i19++) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.J.d.get(i19);
                    if (DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id) != clientUserId && DialogObject.getPeerDialogId(tL_starGiftUnique.host_id) != clientUserId) {
                        arrayList.add(tL_starGiftUnique);
                    }
                }
                int i20 = this.f34317k0;
                this.f34306b0 = i20;
                this.f34317k0 = arrayList.size() + i20;
                int size2 = arrayList.size() + this.f34312f0;
                this.f34312f0 = size2;
                int i21 = this.f34317k0;
                this.f34308c0 = i21;
                yh.t3 t3Var = this.J;
                if (t3Var.f49145t || !t3Var.f49146u) {
                    this.f34309d0 = i21;
                    int i22 = 3 - (size2 % 3);
                    if (size2 <= 0) {
                        i10 = 9;
                    } else if (i22 > 0) {
                        i10 = i22;
                    }
                    int i23 = i21 + i10;
                    this.f34317k0 = i23;
                    this.f34312f0 = size2 + i10;
                    this.f34310e0 = i23;
                }
                if (c()) {
                    this.J.g(false);
                }
            }
            int i24 = this.f34317k0;
            this.f34317k0 = i24 + 1;
            this.f34313g0 = i24;
        }
        int i25 = this.f34317k0;
        this.f34317k0 = i25 + 1;
        this.U = i25;
        fq0 fq0Var = this.E;
        if (fq0Var != null) {
            fq0Var.post(new qp0(this, 1));
        }
    }

    public final void l(fq0 fq0Var) {
        int i10;
        int i11 = org.telegram.ui.ActionBar.g6.f19901d6;
        gq0 gq0Var = this.f34322p0;
        int themedColor = gq0Var.getThemedColor(i11);
        gq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19843a7);
        int themedColor2 = gq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f20305z6);
        int themedColor3 = gq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.G6);
        fq0Var.v.setColor(themedColor);
        fq0Var.f36213x = org.telegram.ui.ActionBar.g6.m1(0.06f, themedColor3);
        fq0Var.f36214y = themedColor2;
        fq0Var.E = themedColor3;
        v60 v60Var = fq0Var.f36205a;
        for (int i12 = 0; i12 < v60Var.getChildCount(); i12++) {
            View childAt = v60Var.getChildAt(i12);
            int R = RecyclerView.R(childAt);
            if (R != -1 && (childAt instanceof TextView)) {
                TextView textView = (TextView) childAt;
                if (R == fq0Var.d) {
                    i10 = fq0Var.E;
                } else {
                    i10 = fq0Var.f36214y;
                }
                textView.setTextColor(i10);
                childAt.invalidate();
            }
        }
        v60Var.invalidate();
        fq0Var.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = this.m0;
        View view = this.f34325w;
        rp0 rp0Var = this.f34305b;
        if (i12 == 1) {
            super.onMeasure(i10, i11);
            vp0 vp0Var = this.v;
            this.f34320n0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + vp0Var.getMeasuredHeight() + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) vp0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) rp0Var.getLayoutParams()).topMargin = this.f34320n0 - AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.f34320n0 - AndroidUtilities.dp(64.0f);
            ((ViewGroup.MarginLayoutParams) this.f34326x.getLayoutParams()).topMargin = this.f34320n0 - AndroidUtilities.dp(16.0f);
            rp0Var.setPadding(rp0Var.getPaddingLeft(), AndroidUtilities.dp(16.0f), rp0Var.getPaddingRight(), rp0Var.getPaddingBottom());
        } else {
            this.f34320n0 = AndroidUtilities.dp(230.0f) + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) rp0Var.getLayoutParams()).topMargin = this.f34320n0;
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.f34320n0 - AndroidUtilities.dp(64.0f);
            ((ViewGroup.MarginLayoutParams) this.f34303a.getLayoutParams()).height = this.f34320n0;
        }
        super.onMeasure(i10, i11);
    }
}
