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
public final class ep0 extends FrameLayout {
    public static final int f36563q0 = 0;
    public final jp0 E;
    public View F;
    public boolean G;
    public boolean H;
    public TL_stars.TL_starGiftUnique I;
    public yh.s3 J;
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
    public final ip0 f36564a;
    public int f36565a0;
    public final vo0 f36566b;
    public int f36567b0;
    public final s4.s f36568c;
    public int f36569c0;
    public final xo0 d;
    public int f36570d0;
    public final n2.e e;
    public int f36571e0;
    public hp0 f36572f;
    public int f36573f0;
    public int f36574g0;
    public int h;
    public int f36575h0;
    public int f36576i0;
    public int f36577j0;
    public int f36578k0;
    public final ArrayList f36579l0;
    public final int m0;
    public long f36580n;
    public int f36581n0;
    public bp0 f36582o0;
    public final kp0 f36583p0;
    public TLRPC.TL_emojiStatusCollectible f36584r;
    public TLRPC.TL_peerColorCollectible f36585s;
    public final zo0 v;
    public final View f36586w;
    public final View f36587x;
    public dp0 f36588y;

    public ep0(kp0 kp0Var, Context context, int i10) {
        super(context);
        int i11;
        this.f36583p0 = kp0Var;
        this.e = new n2.e(10, false);
        this.h = -1;
        this.f36580n = 0L;
        this.f36584r = null;
        this.f36585s = null;
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
        this.f36565a0 = -1;
        this.f36567b0 = -1;
        this.f36569c0 = -1;
        this.f36570d0 = -1;
        this.f36571e0 = -1;
        this.f36573f0 = 0;
        this.f36574g0 = -1;
        this.f36575h0 = -1;
        this.f36576i0 = -1;
        this.f36577j0 = -1;
        this.f36579l0 = new ArrayList();
        this.m0 = i10;
        d();
        Context context2 = getContext();
        org.telegram.ui.ActionBar.d6 resourceProvider = kp0Var.getResourceProvider();
        bh.b bVar = kp0Var.G;
        vo0 vo0Var = new vo0(this, context2, resourceProvider, i10);
        this.f36566b = vo0Var;
        vo0Var.setClipToPadding(false);
        vo0Var.setSections(true);
        ((s4.k) vo0Var.getItemAnimator()).f45944m = false;
        getContext();
        s4.s sVar = new s4.s(3);
        this.f36568c = sVar;
        sVar.O = new ai.q1(this, 7);
        vo0Var.i(new ei.q1(this, 7));
        vo0Var.setLayoutManager(sVar);
        xo0 xo0Var = new xo0(this, context, i10);
        this.d = xo0Var;
        vo0Var.setAdapter(xo0Var);
        vo0Var.setOnItemClickListener(new org.telegram.ui.Components.nn0(this, i10, 1));
        vo0Var.j(new yo0(this, i10));
        addView(vo0Var, w7.z5.c(-1.0f, -1));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.yq(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
        if (kp0Var.f38593a) {
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
        kVar.o(org.telegram.ui.Components.bs.h);
        kVar.C = false;
        kVar.f45944m = false;
        vo0Var.setItemAnimator(kVar);
        View view = new View(getContext());
        this.f36586w = view;
        bh.c cVar = new bh.c(bVar.c(view, null, false));
        cVar.b(-AndroidUtilities.dp(24.0f), true);
        cVar.f4378q = 220;
        view.setBackground(cVar);
        addView(view, w7.z5.e(-1, 72, 55));
        if (i10 == 0) {
            this.f36564a = new ip0(kp0.f0(kp0Var), 0L, getContext(), kp0.g0(kp0Var));
            j(false);
        } else {
            View view2 = new View(getContext());
            this.f36587x = view2;
            bh.c cVar2 = new bh.c(bVar.c(view2, null, false));
            cVar2.b(-AndroidUtilities.dp(16.0f), false);
            view2.setBackground(cVar2);
            addView(view2, w7.z5.e(-1, 16, 55));
            ?? faVar = new org.telegram.ui.Cells.fa(getContext(), kp0.h0(kp0Var), 3, 0L, kp0.i0(kp0Var));
            this.v = faVar;
            faVar.setImportantForAccessibility(4);
            faVar.f22268r = kp0Var;
            faVar.setClipToOutline(true);
            ci.n1 n1Var = zf.j0.f51574a;
            faVar.setOutlineProvider(new zf.i0(0, AndroidUtilities.dp(16.0f)));
            addView((View) faVar, w7.z5.d(-1, -2.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        jp0 jp0Var = new jp0(kp0Var, getContext(), kp0.j0(kp0Var));
        this.E = jp0Var;
        dh.d c10 = kp0Var.E.c(jp0Var, null, false);
        eh.e eVar = new eh.e(kp0.k0(kp0Var));
        eVar.e = new ci.i1(24);
        eVar.d(0, 0);
        eVar.c(0, 0);
        eVar.b(0, 0);
        c10.o(eVar);
        c10.q(AndroidUtilities.dp(18.0f));
        c10.f8015j.e = true;
        jp0Var.H = c10;
        jp0Var.G = c10;
        jp0Var.F = new uo0(this, 0);
        jp0Var.setVisibility(4);
        addView(jp0Var, w7.z5.d(-1, 36.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        ip0 ip0Var = this.f36564a;
        if (ip0Var != null) {
            addView(ip0Var, w7.z5.e(-1, -2, 55));
        }
        g();
        k();
        setWillNotDraw(false);
    }

    public static void a(ep0 ep0Var) {
        int i10;
        vo0 vo0Var = ep0Var.f36566b;
        boolean z10 = ep0Var.H;
        if (z10) {
            vo0Var.B0();
        }
        ep0Var.e();
        if (z10 && (i10 = ep0Var.f36575h0) >= 0) {
            ep0Var.f36568c.h1(i10, ep0Var.f36583p0.f38601f);
            vo0Var.post(new uo0(ep0Var, 1));
        }
    }

    public final boolean b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ep0.b():boolean");
    }

    public final boolean c() {
        vo0 vo0Var = this.f36566b;
        if (vo0Var != null) {
            for (int i10 = 0; i10 < vo0Var.getChildCount(); i10++) {
                if (vo0Var.getChildAt(i10) instanceof org.telegram.ui.Components.b10) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void d() {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible;
        int i10 = this.m0;
        kp0 kp0Var = this.f36583p0;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible = null;
        if (i10 == 0) {
            TLRPC.User currentUser = kp0Var.getUserConfig().getCurrentUser();
            this.h = UserObject.getProfileColorId(currentUser);
            this.f36580n = UserObject.getProfileEmojiId(currentUser);
            if (currentUser != null) {
                TLRPC.EmojiStatus emojiStatus = currentUser.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                    this.f36584r = tL_emojiStatusCollectible;
                    this.f36585s = null;
                }
            }
            tL_emojiStatusCollectible = null;
            this.f36584r = tL_emojiStatusCollectible;
            this.f36585s = null;
        } else {
            TLRPC.User currentUser2 = kp0Var.getUserConfig().getCurrentUser();
            this.h = UserObject.getColorId(currentUser2);
            this.f36580n = UserObject.getEmojiId(currentUser2);
            this.f36584r = null;
            if (currentUser2 != null) {
                TLRPC.PeerColor peerColor = currentUser2.color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                }
            }
            this.f36585s = tL_peerColorCollectible;
        }
        if (this.f36584r == null && this.f36585s == null) {
            return;
        }
        this.h = -1;
        this.f36580n = 0L;
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
        kp0 kp0Var = this.f36583p0;
        n2.e eVar = this.e;
        if (tL_starGiftUnique != null) {
            ag.a resellAmount = tL_starGiftUnique.getResellAmount(ag.c.f635a);
            if (tL_starGiftUnique.resale_ton_only) {
                eVar.f17038b = ai.md.n1(ai.md.T0(LocaleController.formatString(R.string.ResellGiftBuyTON, tL_starGiftUnique.getResellAmount(ag.c.f636b).d()), true), true);
                eVar.f17039c = ai.md.R0(LocaleController.formatPluralStringComma("ResellGiftBuyEq", (int) resellAmount.a()));
            } else {
                eVar.f17038b = ai.md.R0(LocaleController.formatPluralStringComma("ResellGiftBuy", (int) resellAmount.a()));
                eVar.f17039c = null;
            }
        } else {
            if (!kp0Var.getUserConfig().isPremium() && !kp0Var.f38593a) {
                obj = this.N;
            } else if (this.f36584r != null) {
                obj = this.P;
            } else {
                obj = this.O;
            }
            eVar.f17038b = obj;
            eVar.f17039c = null;
        }
        if (kp0Var.C0() == this) {
            kp0Var.R = this;
            kp0Var.Q.g((CharSequence) eVar.f17038b, z10, true);
            kp0Var.Q.f((SpannableStringBuilder) eVar.f17039c, z10);
        }
    }

    public final void g() {
        ei.d dVar = this.f36583p0.Q;
        if (dVar != null) {
            dVar.j();
        }
        zo0 zo0Var = this.v;
        if (zo0Var != null) {
            zo0Var.invalidate();
        }
        j(true);
        AndroidUtilities.forEachViews((RecyclerView) this.f36566b, (Utilities.Callback<View>) new v3(this, 14));
        jp0 jp0Var = this.E;
        if (jp0Var != null) {
            l(jp0Var);
        }
    }

    public final void h() {
        int i10;
        boolean z10;
        int i11 = this.f36583p0.f38601f;
        float f7 = 0.0f;
        View view = this.f36586w;
        jp0 jp0Var = this.E;
        if (jp0Var != null && (i10 = this.f36575h0) >= 0) {
            s4.s sVar = this.f36568c;
            this.F = sVar.m(i10);
            vo0 vo0Var = this.f36566b;
            int paddingTop = vo0Var.getPaddingTop() + i11;
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
                jp0Var.setVisibility(0);
                jp0Var.setTranslationY((Math.max(this.F.getTop(), paddingTop) + vo0Var.getTop()) - jp0Var.getTop());
            } else if (L0 != -1 && L0 > this.f36575h0) {
                this.H = true;
                this.G = false;
                jp0Var.setVisibility(0);
                jp0Var.setTranslationY((vo0Var.getTop() + paddingTop) - jp0Var.getTop());
            } else {
                this.H = false;
                this.G = false;
                jp0Var.setVisibility(0);
                jp0Var.setTranslationY((AndroidUtilities.dp(1.0f) + getHeight()) - jp0Var.getTop());
            }
            boolean z11 = this.G;
            if (jp0Var.I != z11) {
                jp0Var.I = z11;
                jp0Var.L.D0(2);
                jp0Var.invalidate();
            }
            if (this.H) {
                f7 = AndroidUtilities.dp(36.0f) + i11;
            }
            view.setTranslationY(f7);
            vo0Var.invalidate();
            invalidate();
            return;
        }
        this.G = false;
        this.H = false;
        if (view != null) {
            view.setTranslationY(0.0f);
        }
        if (jp0Var != null) {
            jp0Var.setVisibility(4);
            boolean z12 = this.G;
            if (jp0Var.I != z12) {
                jp0Var.I = z12;
                jp0Var.L.D0(2);
                jp0Var.invalidate();
            }
        }
    }

    public final void i() {
        MessageObject messageObject;
        zo0 zo0Var = this.v;
        if (zo0Var != null) {
            org.telegram.ui.Cells.u1[] cells = zo0Var.getCells();
            for (int i10 = 0; i10 < cells.length; i10++) {
                org.telegram.ui.Cells.u1 u1Var = cells[i10];
                if (u1Var != null && (messageObject = u1Var.getMessageObject()) != null) {
                    messageObject.notime = true;
                    hp0 hp0Var = this.f36572f;
                    if (hp0Var != null) {
                        messageObject.overrideLinkColor = hp0Var.getColorId();
                    }
                    messageObject.overrideLinkEmoji = this.f36580n;
                    messageObject.overrideLinkPeerColor = this.f36585s;
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
        kp0 kp0Var;
        no0 no0Var;
        hp0 hp0Var = this.f36572f;
        if (hp0Var != null) {
            hp0Var.a(this.h, z10);
        }
        ip0 ip0Var = this.f36564a;
        if (ip0Var != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.f36584r;
            if (tL_emojiStatusCollectible != null) {
                ip0Var.e(tL_emojiStatusCollectible.document_id, true, z10);
                ip0Var.c(MessagesController.PeerColor.fromCollectible(this.f36584r), z10);
                ip0Var.d(this.f36584r.pattern_document_id, true, z10);
            } else {
                if (DialogObject.isEmojiStatusCollectible(0L)) {
                    ip0Var.e(0L, false, z10);
                } else {
                    ip0Var.e(DialogObject.getEmojiStatusDocumentId(0L), DialogObject.isEmojiStatusCollectible(0L), z10);
                }
                ip0Var.b(this.h, z10);
                ip0Var.d(this.f36580n, false, z10);
            }
        }
        int i11 = this.m0;
        if (i11 == 0 && (no0Var = (kp0Var = this.f36583p0).e) != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = this.f36584r;
            if (tL_emojiStatusCollectible2 != null) {
                no0Var.c(MessagesController.PeerColor.fromCollectible(tL_emojiStatusCollectible2), z10);
            } else {
                no0Var.b(kp0.v0(kp0Var), this.h, z10);
            }
        }
        if (i11 == 0) {
            int i12 = this.V;
            k();
            xo0 xo0Var = this.d;
            if (i12 >= 0 && this.V < 0) {
                xo0Var.t(i12, 2);
            } else if (i12 < 0 && (i10 = this.V) >= 0) {
                xo0Var.s(i10, 2);
            }
        }
        int i13 = 0;
        while (true) {
            vo0 vo0Var = this.f36566b;
            if (i13 < vo0Var.getChildCount()) {
                View childAt = vo0Var.getChildAt(i13);
                if (childAt instanceof so0) {
                    so0 so0Var = (so0) childAt;
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible3 = this.f36584r;
                    if ((tL_emojiStatusCollectible3 != null && tL_emojiStatusCollectible3.collectible_id == so0Var.getGiftId()) || ((tL_peerColorCollectible2 = this.f36585s) != null && tL_peerColorCollectible2.collectible_id == so0Var.getGiftId())) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    so0Var.b(z12, true);
                } else if (childAt instanceof yh.g1) {
                    yh.g1 g1Var = (yh.g1) childAt;
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible4 = this.f36584r;
                    if ((tL_emojiStatusCollectible4 != null && tL_emojiStatusCollectible4.collectible_id == g1Var.getGiftId()) || ((tL_peerColorCollectible = this.f36585s) != null && tL_peerColorCollectible.collectible_id == g1Var.getGiftId())) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    g1Var.e(z11, true);
                }
                i13++;
            } else {
                return;
            }
        }
    }

    public final void k() {
        ai.y9 y9Var;
        kp0 kp0Var = this.f36583p0;
        ai.y9 y9Var2 = kp0Var.f38595b;
        this.V = -1;
        this.W = -1;
        this.f36565a0 = -1;
        this.f36567b0 = -1;
        this.f36570d0 = -1;
        this.f36571e0 = -1;
        this.f36569c0 = -1;
        this.f36574g0 = -1;
        this.f36575h0 = -1;
        this.f36576i0 = -1;
        this.f36577j0 = -1;
        this.f36573f0 = 0;
        ArrayList arrayList = this.f36579l0;
        arrayList.clear();
        this.Q = 0;
        this.S = 1;
        int i10 = 3;
        this.f36578k0 = 3;
        this.R = 2;
        int i11 = this.m0;
        if (i11 == 0 && (this.h >= 0 || this.f36584r != null || this.f36585s != null)) {
            this.V = 3;
            this.f36578k0 = 5;
            this.W = 4;
        }
        if (i11 == 1) {
            y9Var = kp0Var.f38597c;
        } else {
            y9Var = y9Var2;
        }
        if ((i11 == 0 || i11 == 1) && y9Var != null) {
            ArrayList arrayList2 = y9Var.f2499l;
            int i12 = this.f36578k0;
            this.f36578k0 = i12 + 1;
            this.f36575h0 = i12;
            if (this.K == null) {
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) arrayList2.get(i13)).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        arrayList.add((TL_stars.TL_starGiftUnique) starGift);
                    }
                }
                int i14 = this.f36578k0;
                this.f36567b0 = i14;
                this.f36578k0 = arrayList.size() + i14;
                int size = arrayList.size() + this.f36573f0;
                this.f36573f0 = size;
                int i15 = this.f36578k0;
                this.f36569c0 = i15;
                if (!y9Var2.f2496i && y9Var2.f2497j) {
                    if (arrayList.isEmpty()) {
                        int i16 = this.f36578k0;
                        this.f36577j0 = i16;
                        this.f36578k0 = i16 + 2;
                        this.f36576i0 = i16 + 1;
                    }
                } else {
                    this.f36570d0 = i15;
                    int i17 = 3 - (size % 3);
                    if (size <= 0) {
                        i10 = 9;
                    } else if (i17 > 0) {
                        i10 = i17;
                    }
                    int i18 = i15 + i10;
                    this.f36578k0 = i18;
                    this.f36573f0 = size + i10;
                    this.f36571e0 = i18;
                }
                if (c()) {
                    y9Var.a();
                }
            } else if (this.J != null) {
                long clientUserId = UserConfig.getInstance(kp0.u0(kp0Var)).getClientUserId();
                for (int i19 = 0; i19 < this.J.d.size(); i19++) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.J.d.get(i19);
                    if (DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id) != clientUserId && DialogObject.getPeerDialogId(tL_starGiftUnique.host_id) != clientUserId) {
                        arrayList.add(tL_starGiftUnique);
                    }
                }
                int i20 = this.f36578k0;
                this.f36567b0 = i20;
                this.f36578k0 = arrayList.size() + i20;
                int size2 = arrayList.size() + this.f36573f0;
                this.f36573f0 = size2;
                int i21 = this.f36578k0;
                this.f36569c0 = i21;
                yh.s3 s3Var = this.J;
                if (s3Var.f50514t || !s3Var.f50515u) {
                    this.f36570d0 = i21;
                    int i22 = 3 - (size2 % 3);
                    if (size2 <= 0) {
                        i10 = 9;
                    } else if (i22 > 0) {
                        i10 = i22;
                    }
                    int i23 = i21 + i10;
                    this.f36578k0 = i23;
                    this.f36573f0 = size2 + i10;
                    this.f36571e0 = i23;
                }
                if (c()) {
                    this.J.g(false);
                }
            }
            int i24 = this.f36578k0;
            this.f36578k0 = i24 + 1;
            this.f36574g0 = i24;
        }
        int i25 = this.f36578k0;
        this.f36578k0 = i25 + 1;
        this.U = i25;
        jp0 jp0Var = this.E;
        if (jp0Var != null) {
            jp0Var.post(new uo0(this, 1));
        }
    }

    public final void l(jp0 jp0Var) {
        int i10;
        int i11 = org.telegram.ui.ActionBar.h6.f20986d6;
        kp0 kp0Var = this.f36583p0;
        int themedColor = kp0Var.getThemedColor(i11);
        kp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20928a7);
        int themedColor2 = kp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f21391z6);
        int themedColor3 = kp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.G6);
        jp0Var.v.setColor(themedColor);
        jp0Var.f38251x = org.telegram.ui.ActionBar.h6.m1(0.06f, themedColor3);
        jp0Var.f38252y = themedColor2;
        jp0Var.E = themedColor3;
        i10 i10Var = jp0Var.f38243a;
        for (int i12 = 0; i12 < i10Var.getChildCount(); i12++) {
            View childAt = i10Var.getChildAt(i12);
            int R = RecyclerView.R(childAt);
            if (R != -1 && (childAt instanceof TextView)) {
                TextView textView = (TextView) childAt;
                if (R == jp0Var.d) {
                    i10 = jp0Var.E;
                } else {
                    i10 = jp0Var.f38252y;
                }
                textView.setTextColor(i10);
                childAt.invalidate();
            }
        }
        i10Var.invalidate();
        jp0Var.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = this.m0;
        View view = this.f36586w;
        vo0 vo0Var = this.f36566b;
        if (i12 == 1) {
            super.onMeasure(i10, i11);
            zo0 zo0Var = this.v;
            this.f36581n0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + zo0Var.getMeasuredHeight() + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) zo0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) vo0Var.getLayoutParams()).topMargin = this.f36581n0 - AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.f36581n0 - AndroidUtilities.dp(64.0f);
            ((ViewGroup.MarginLayoutParams) this.f36587x.getLayoutParams()).topMargin = this.f36581n0 - AndroidUtilities.dp(16.0f);
            vo0Var.setPadding(vo0Var.getPaddingLeft(), AndroidUtilities.dp(16.0f), vo0Var.getPaddingRight(), vo0Var.getPaddingBottom());
        } else {
            this.f36581n0 = AndroidUtilities.dp(230.0f) + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) vo0Var.getLayoutParams()).topMargin = this.f36581n0;
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.f36581n0 - AndroidUtilities.dp(64.0f);
            ((ViewGroup.MarginLayoutParams) this.f36564a.getLayoutParams()).height = this.f36581n0;
        }
        super.onMeasure(i10, i11);
    }
}
