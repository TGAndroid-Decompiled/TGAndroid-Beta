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
    public static final int f41836q0 = 0;
    public final sp0 E;
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
    public final rp0 f41837a;
    public int f41838a0;
    public final ep0 f41839b;
    public int f41840b0;
    public final s4.t f41841c;
    public int f41842c0;
    public final gp0 d;
    public int f41843d0;
    public final m4.c e;
    public int f41844e0;
    public qp0 f41845f;
    public int f41846f0;
    public int f41847g0;
    public int h;
    public int f41848h0;
    public int f41849i0;
    public int f41850j0;
    public int f41851k0;
    public final ArrayList f41852l0;
    public final int m0;
    public long f41853n;
    public int f41854n0;
    public kp0 f41855o0;
    public final tp0 f41856p0;
    public TLRPC.TL_emojiStatusCollectible f41857r;
    public TLRPC.TL_peerColorCollectible f41858s;
    public final ip0 v;
    public final View f41859w;
    public final View f41860x;
    public mp0 f41861y;

    public np0(tp0 tp0Var, Context context, int i10) {
        super(context);
        int i11;
        this.f41856p0 = tp0Var;
        this.e = new m4.c(12, false);
        this.h = -1;
        this.f41853n = 0L;
        this.f41857r = null;
        this.f41858s = null;
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
        this.f41838a0 = -1;
        this.f41840b0 = -1;
        this.f41842c0 = -1;
        this.f41843d0 = -1;
        this.f41844e0 = -1;
        this.f41846f0 = 0;
        this.f41847g0 = -1;
        this.f41848h0 = -1;
        this.f41849i0 = -1;
        this.f41850j0 = -1;
        this.f41852l0 = new ArrayList();
        this.m0 = i10;
        d();
        Context context2 = getContext();
        org.telegram.ui.ActionBar.u6 resourceProvider = tp0Var.getResourceProvider();
        ch.b bVar = tp0Var.G;
        ep0 ep0Var = new ep0(this, context2, resourceProvider, i10);
        this.f41839b = ep0Var;
        ep0Var.setClipToPadding(false);
        ep0Var.setSections(true);
        ((s4.l) ep0Var.getItemAnimator()).f47798m = false;
        getContext();
        s4.t tVar = new s4.t(3);
        this.f41841c = tVar;
        tVar.O = new ai.l(this, 8);
        ep0Var.i(new fi.p1(this, 7));
        ep0Var.setLayoutManager(tVar);
        gp0 gp0Var = new gp0(this, context, i10);
        this.d = gp0Var;
        ep0Var.setAdapter(gp0Var);
        ep0Var.setOnItemClickListener(new org.telegram.ui.Components.xn0(this, i10, 1));
        ep0Var.j(new hp0(this, i10));
        addView(ep0Var, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.zq(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
        if (tp0Var.f43711a) {
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
        lVar.f47798m = false;
        ep0Var.setItemAnimator(lVar);
        View view = new View(getContext());
        this.f41859w = view;
        ch.c cVar = new ch.c(bVar.c(view, null, false));
        cVar.b(-AndroidUtilities.dp(24.0f), true);
        cVar.G = 220;
        view.setBackground(cVar);
        addView(view, org.telegram.ui.Components.kb1.i(-1, 72, 55));
        if (i10 == 0) {
            this.f41837a = new rp0(tp0.g0(tp0Var), 0L, getContext(), tp0.h0(tp0Var));
            j(false);
        } else {
            View view2 = new View(getContext());
            this.f41860x = view2;
            ch.c cVar2 = new ch.c(bVar.c(view2, null, false));
            cVar2.b(-AndroidUtilities.dp(16.0f), false);
            view2.setBackground(cVar2);
            addView(view2, org.telegram.ui.Components.kb1.i(-1, 16, 55));
            ?? kaVar = new org.telegram.ui.Cells.ka(getContext(), tp0.i0(tp0Var), 3, 0L, tp0.j0(tp0Var));
            this.v = kaVar;
            kaVar.setImportantForAccessibility(4);
            kaVar.f24366r = tp0Var;
            kaVar.setClipToOutline(true);
            ag.v0 v0Var = ag.z0.f1400a;
            kaVar.setOutlineProvider(new ag.x0(0, AndroidUtilities.dp(16.0f)));
            addView((View) kaVar, org.telegram.ui.Components.kb1.h(-1, -2.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        sp0 sp0Var = new sp0(getContext(), tp0.k0(tp0Var));
        this.E = sp0Var;
        eh.d c10 = tp0Var.E.c(sp0Var, null, false);
        fh.e eVar = new fh.e(tp0.l0(tp0Var));
        eVar.e = new gh.a(4);
        eVar.d(0, 0);
        eVar.c(0, 0);
        eVar.b(0, 0);
        c10.v(eVar);
        c10.x(AndroidUtilities.dp(18.0f));
        c10.f9965x.e = true;
        sp0Var.H = c10;
        sp0Var.G = c10;
        sp0Var.F = new dp0(this, 0);
        sp0Var.setVisibility(4);
        addView(sp0Var, org.telegram.ui.Components.kb1.h(-1, 36.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        rp0 rp0Var = this.f41837a;
        if (rp0Var != null) {
            addView(rp0Var, org.telegram.ui.Components.kb1.i(-1, -2, 55));
        }
        g();
        k();
        setWillNotDraw(false);
    }

    public static void a(np0 np0Var) {
        int i10;
        ep0 ep0Var = np0Var.f41839b;
        boolean z10 = np0Var.H;
        if (z10) {
            ep0Var.C0();
        }
        np0Var.e();
        if (z10 && (i10 = np0Var.f41848h0) >= 0) {
            np0Var.f41841c.h1(i10, np0Var.f41856p0.f43718f);
            ep0Var.post(new dp0(np0Var, 1));
        }
    }

    public final boolean b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.np0.b():boolean");
    }

    public final boolean c() {
        ep0 ep0Var = this.f41839b;
        if (ep0Var != null) {
            for (int i10 = 0; i10 < ep0Var.getChildCount(); i10++) {
                if (ep0Var.getChildAt(i10) instanceof org.telegram.ui.Components.c10) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void d() {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible;
        int i10 = this.m0;
        tp0 tp0Var = this.f41856p0;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible = null;
        if (i10 == 0) {
            TLRPC.User currentUser = tp0Var.getUserConfig().getCurrentUser();
            this.h = UserObject.getProfileColorId(currentUser);
            this.f41853n = UserObject.getProfileEmojiId(currentUser);
            if (currentUser != null) {
                TLRPC.EmojiStatus emojiStatus = currentUser.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                    this.f41857r = tL_emojiStatusCollectible;
                    this.f41858s = null;
                }
            }
            tL_emojiStatusCollectible = null;
            this.f41857r = tL_emojiStatusCollectible;
            this.f41858s = null;
        } else {
            TLRPC.User currentUser2 = tp0Var.getUserConfig().getCurrentUser();
            this.h = UserObject.getColorId(currentUser2);
            this.f41853n = UserObject.getEmojiId(currentUser2);
            this.f41857r = null;
            if (currentUser2 != null) {
                TLRPC.PeerColor peerColor = currentUser2.color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                }
            }
            this.f41858s = tL_peerColorCollectible;
        }
        if (this.f41857r == null && this.f41858s == null) {
            return;
        }
        this.h = -1;
        this.f41853n = 0L;
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
        tp0 tp0Var = this.f41856p0;
        m4.c cVar = this.e;
        if (tL_starGiftUnique != null) {
            bg.a resellAmount = tL_starGiftUnique.getResellAmount(bg.b.f3980a);
            if (tL_starGiftUnique.resale_ton_only) {
                cVar.f18008b = bi.dd.o1(bi.dd.R0(LocaleController.formatString(R.string.ResellGiftBuyTON, tL_starGiftUnique.getResellAmount(bg.b.f3981b).d()), true), true);
                cVar.f18009c = bi.dd.P0(LocaleController.formatPluralStringComma("ResellGiftBuyEq", (int) resellAmount.a()));
            } else {
                cVar.f18008b = bi.dd.P0(LocaleController.formatPluralStringComma("ResellGiftBuy", (int) resellAmount.a()));
                cVar.f18009c = null;
            }
        } else {
            if (!tp0Var.getUserConfig().isPremium() && !tp0Var.f43711a) {
                obj = this.N;
            } else if (this.f41857r != null) {
                obj = this.P;
            } else {
                obj = this.O;
            }
            cVar.f18008b = obj;
            cVar.f18009c = null;
        }
        if (tp0Var.D0() == this) {
            tp0Var.R = this;
            tp0Var.Q.i((CharSequence) cVar.f18008b, z10, true);
            tp0Var.Q.g((SpannableStringBuilder) cVar.f18009c, z10);
        }
    }

    public final void g() {
        fi.d dVar = this.f41856p0.Q;
        if (dVar != null) {
            dVar.updateColors();
        }
        ip0 ip0Var = this.v;
        if (ip0Var != null) {
            ip0Var.invalidate();
        }
        j(true);
        AndroidUtilities.forEachViews((RecyclerView) this.f41839b, (Utilities.Callback<View>) new t3(this, 15));
        sp0 sp0Var = this.E;
        if (sp0Var != null) {
            l(sp0Var);
        }
    }

    public final void h() {
        int i10;
        boolean z10;
        int i11 = this.f41856p0.f43718f;
        float f7 = 0.0f;
        View view = this.f41859w;
        sp0 sp0Var = this.E;
        if (sp0Var != null && (i10 = this.f41848h0) >= 0) {
            s4.t tVar = this.f41841c;
            this.F = tVar.m(i10);
            ep0 ep0Var = this.f41839b;
            int paddingTop = ep0Var.getPaddingTop() + i11;
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
                sp0Var.setVisibility(0);
                sp0Var.setTranslationY((Math.max(this.F.getTop(), paddingTop) + ep0Var.getTop()) - sp0Var.getTop());
            } else if (L0 != -1 && L0 > this.f41848h0) {
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
                sp0Var.invalidate();
            }
        }
    }

    public final void i() {
        MessageObject messageObject;
        ip0 ip0Var = this.v;
        if (ip0Var != null) {
            org.telegram.ui.Cells.s1[] cells = ip0Var.getCells();
            for (int i10 = 0; i10 < cells.length; i10++) {
                org.telegram.ui.Cells.s1 s1Var = cells[i10];
                if (s1Var != null && (messageObject = s1Var.getMessageObject()) != null) {
                    messageObject.notime = true;
                    qp0 qp0Var = this.f41845f;
                    if (qp0Var != null) {
                        messageObject.overrideLinkColor = qp0Var.getColorId();
                    }
                    messageObject.overrideLinkEmoji = this.f41853n;
                    messageObject.overrideLinkPeerColor = this.f41858s;
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
        wo0 wo0Var;
        qp0 qp0Var = this.f41845f;
        if (qp0Var != null) {
            qp0Var.a(this.h, z10);
        }
        rp0 rp0Var = this.f41837a;
        if (rp0Var != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.f41857r;
            if (tL_emojiStatusCollectible != null) {
                rp0Var.e(tL_emojiStatusCollectible.document_id, true, z10);
                rp0Var.c(MessagesController.PeerColor.fromCollectible(this.f41857r), z10);
                rp0Var.d(this.f41857r.pattern_document_id, true, z10);
            } else {
                if (DialogObject.isEmojiStatusCollectible(0L)) {
                    rp0Var.e(0L, false, z10);
                } else {
                    rp0Var.e(DialogObject.getEmojiStatusDocumentId(0L), DialogObject.isEmojiStatusCollectible(0L), z10);
                }
                rp0Var.b(this.h, z10);
                rp0Var.d(this.f41853n, false, z10);
            }
        }
        int i11 = this.m0;
        if (i11 == 0 && (wo0Var = (tp0Var = this.f41856p0).e) != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = this.f41857r;
            if (tL_emojiStatusCollectible2 != null) {
                wo0Var.c(MessagesController.PeerColor.fromCollectible(tL_emojiStatusCollectible2), z10);
            } else {
                wo0Var.b(tp0.w0(tp0Var), this.h, z10);
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
            ep0 ep0Var = this.f41839b;
            if (i13 < ep0Var.getChildCount()) {
                View childAt = ep0Var.getChildAt(i13);
                if (childAt instanceof bp0) {
                    bp0 bp0Var = (bp0) childAt;
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible3 = this.f41857r;
                    if ((tL_emojiStatusCollectible3 != null && tL_emojiStatusCollectible3.collectible_id == bp0Var.getGiftId()) || ((tL_peerColorCollectible2 = this.f41858s) != null && tL_peerColorCollectible2.collectible_id == bp0Var.getGiftId())) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    bp0Var.b(z12, true);
                } else if (childAt instanceof zh.g1) {
                    zh.g1 g1Var = (zh.g1) childAt;
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible4 = this.f41857r;
                    if ((tL_emojiStatusCollectible4 != null && tL_emojiStatusCollectible4.collectible_id == g1Var.getGiftId()) || ((tL_peerColorCollectible = this.f41858s) != null && tL_peerColorCollectible.collectible_id == g1Var.getGiftId())) {
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
        tp0 tp0Var = this.f41856p0;
        bi.t9 t9Var2 = tp0Var.f43713b;
        this.V = -1;
        this.W = -1;
        this.f41838a0 = -1;
        this.f41840b0 = -1;
        this.f41843d0 = -1;
        this.f41844e0 = -1;
        this.f41842c0 = -1;
        this.f41847g0 = -1;
        this.f41848h0 = -1;
        this.f41849i0 = -1;
        this.f41850j0 = -1;
        this.f41846f0 = 0;
        ArrayList arrayList = this.f41852l0;
        arrayList.clear();
        this.Q = 0;
        this.S = 1;
        int i10 = 3;
        this.f41851k0 = 3;
        this.R = 2;
        int i11 = this.m0;
        if (i11 == 0 && (this.h >= 0 || this.f41857r != null || this.f41858s != null)) {
            this.V = 3;
            this.f41851k0 = 5;
            this.W = 4;
        }
        if (i11 == 1) {
            t9Var = tp0Var.f43715c;
        } else {
            t9Var = t9Var2;
        }
        if ((i11 == 0 || i11 == 1) && t9Var != null) {
            ArrayList arrayList2 = t9Var.f5471l;
            int i12 = this.f41851k0;
            this.f41851k0 = i12 + 1;
            this.f41848h0 = i12;
            if (this.K == null) {
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) arrayList2.get(i13)).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        arrayList.add((TL_stars.TL_starGiftUnique) starGift);
                    }
                }
                int i14 = this.f41851k0;
                this.f41840b0 = i14;
                this.f41851k0 = arrayList.size() + i14;
                int size = arrayList.size() + this.f41846f0;
                this.f41846f0 = size;
                int i15 = this.f41851k0;
                this.f41842c0 = i15;
                if (!t9Var2.f5468i && t9Var2.f5469j) {
                    if (arrayList.isEmpty()) {
                        int i16 = this.f41851k0;
                        this.f41850j0 = i16;
                        this.f41851k0 = i16 + 2;
                        this.f41849i0 = i16 + 1;
                    }
                } else {
                    this.f41843d0 = i15;
                    int i17 = 3 - (size % 3);
                    if (size <= 0) {
                        i10 = 9;
                    } else if (i17 > 0) {
                        i10 = i17;
                    }
                    int i18 = i15 + i10;
                    this.f41851k0 = i18;
                    this.f41846f0 = size + i10;
                    this.f41844e0 = i18;
                }
                if (c()) {
                    t9Var.b();
                }
            } else if (this.J != null) {
                long clientUserId = UserConfig.getInstance(tp0.v0(tp0Var)).getClientUserId();
                for (int i19 = 0; i19 < this.J.d.size(); i19++) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.J.d.get(i19);
                    if (DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id) != clientUserId && DialogObject.getPeerDialogId(tL_starGiftUnique.host_id) != clientUserId) {
                        arrayList.add(tL_starGiftUnique);
                    }
                }
                int i20 = this.f41851k0;
                this.f41840b0 = i20;
                this.f41851k0 = arrayList.size() + i20;
                int size2 = arrayList.size() + this.f41846f0;
                this.f41846f0 = size2;
                int i21 = this.f41851k0;
                this.f41842c0 = i21;
                zh.u3 u3Var = this.J;
                if (u3Var.f53339t || !u3Var.f53340u) {
                    this.f41843d0 = i21;
                    int i22 = 3 - (size2 % 3);
                    if (size2 <= 0) {
                        i10 = 9;
                    } else if (i22 > 0) {
                        i10 = i22;
                    }
                    int i23 = i21 + i10;
                    this.f41851k0 = i23;
                    this.f41846f0 = size2 + i10;
                    this.f41844e0 = i23;
                }
                if (c()) {
                    this.J.g(false);
                }
            }
            int i24 = this.f41851k0;
            this.f41851k0 = i24 + 1;
            this.f41847g0 = i24;
        }
        int i25 = this.f41851k0;
        this.f41851k0 = i25 + 1;
        this.U = i25;
        sp0 sp0Var = this.E;
        if (sp0Var != null) {
            sp0Var.post(new dp0(this, 1));
        }
    }

    public final void l(sp0 sp0Var) {
        int i10;
        int i11 = org.telegram.ui.ActionBar.y6.f23357d6;
        tp0 tp0Var = this.f41856p0;
        int themedColor = tp0Var.getThemedColor(i11);
        tp0Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23300a7);
        int themedColor2 = tp0Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23768z6);
        int themedColor3 = tp0Var.getThemedColor(org.telegram.ui.ActionBar.y6.G6);
        sp0Var.v.setColor(themedColor);
        sp0Var.f43381x = org.telegram.ui.ActionBar.y6.o1(0.06f, themedColor3);
        sp0Var.f43382y = themedColor2;
        sp0Var.E = themedColor3;
        m10 m10Var = sp0Var.f43373a;
        for (int i12 = 0; i12 < m10Var.getChildCount(); i12++) {
            View childAt = m10Var.getChildAt(i12);
            int R = RecyclerView.R(childAt);
            if (R != -1 && (childAt instanceof TextView)) {
                TextView textView = (TextView) childAt;
                if (R == sp0Var.d) {
                    i10 = sp0Var.E;
                } else {
                    i10 = sp0Var.f43382y;
                }
                textView.setTextColor(i10);
                childAt.invalidate();
            }
        }
        m10Var.invalidate();
        sp0Var.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = this.m0;
        View view = this.f41859w;
        ep0 ep0Var = this.f41839b;
        if (i12 == 1) {
            super.onMeasure(i10, i11);
            ip0 ip0Var = this.v;
            this.f41854n0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + ip0Var.getMeasuredHeight() + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) ip0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) ep0Var.getLayoutParams()).topMargin = this.f41854n0 - AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.f41854n0 - AndroidUtilities.dp(64.0f);
            ((ViewGroup.MarginLayoutParams) this.f41860x.getLayoutParams()).topMargin = this.f41854n0 - AndroidUtilities.dp(16.0f);
            ep0Var.setPadding(ep0Var.getPaddingLeft(), AndroidUtilities.dp(16.0f), ep0Var.getPaddingRight(), ep0Var.getPaddingBottom());
        } else {
            this.f41854n0 = AndroidUtilities.dp(230.0f) + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) ep0Var.getLayoutParams()).topMargin = this.f41854n0;
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.f41854n0 - AndroidUtilities.dp(64.0f);
            ((ViewGroup.MarginLayoutParams) this.f41837a.getLayoutParams()).height = this.f41854n0;
        }
        super.onMeasure(i10, i11);
    }
}
