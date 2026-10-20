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
public final class cp0 extends FrameLayout {
    public static final int f36017q0 = 0;
    public final hp0 E;
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
    public final gp0 f36018a;
    public int f36019a0;
    public final to0 f36020b;
    public int f36021b0;
    public final s4.s f36022c;
    public int f36023c0;
    public final vo0 d;
    public int f36024d0;
    public final n2.e e;
    public int f36025e0;
    public fp0 f36026f;
    public int f36027f0;
    public int f36028g0;
    public int h;
    public int f36029h0;
    public int f36030i0;
    public int f36031j0;
    public int f36032k0;
    public final ArrayList f36033l0;
    public final int m0;
    public long f36034n;
    public int f36035n0;
    public zo0 f36036o0;
    public final ip0 f36037p0;
    public TLRPC.TL_emojiStatusCollectible f36038r;
    public TLRPC.TL_peerColorCollectible f36039s;
    public final xo0 v;
    public final View f36040w;
    public final View f36041x;
    public bp0 f36042y;

    public cp0(ip0 ip0Var, Context context, int i10) {
        super(context);
        int i11;
        this.f36037p0 = ip0Var;
        this.e = new n2.e(10, false);
        this.h = -1;
        this.f36034n = 0L;
        this.f36038r = null;
        this.f36039s = null;
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
        this.f36019a0 = -1;
        this.f36021b0 = -1;
        this.f36023c0 = -1;
        this.f36024d0 = -1;
        this.f36025e0 = -1;
        this.f36027f0 = 0;
        this.f36028g0 = -1;
        this.f36029h0 = -1;
        this.f36030i0 = -1;
        this.f36031j0 = -1;
        this.f36033l0 = new ArrayList();
        this.m0 = i10;
        d();
        Context context2 = getContext();
        org.telegram.ui.ActionBar.d6 resourceProvider = ip0Var.getResourceProvider();
        bh.b bVar = ip0Var.G;
        to0 to0Var = new to0(this, context2, resourceProvider, i10);
        this.f36020b = to0Var;
        to0Var.setClipToPadding(false);
        to0Var.setSections(true);
        ((s4.k) to0Var.getItemAnimator()).f45951m = false;
        getContext();
        s4.s sVar = new s4.s(3);
        this.f36022c = sVar;
        sVar.O = new ai.q1(this, 7);
        to0Var.i(new ei.q1(this, 7));
        to0Var.setLayoutManager(sVar);
        vo0 vo0Var = new vo0(this, context, i10);
        this.d = vo0Var;
        to0Var.setAdapter(vo0Var);
        to0Var.setOnItemClickListener(new org.telegram.ui.Components.on0(this, i10, 1));
        to0Var.j(new wo0(this, i10));
        addView(to0Var, w7.z5.c(-1.0f, -1));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.yq(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
        if (ip0Var.f38079a) {
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
        kVar.f45951m = false;
        to0Var.setItemAnimator(kVar);
        View view = new View(getContext());
        this.f36040w = view;
        bh.c cVar = new bh.c(bVar.c(view, null, false));
        cVar.b(-AndroidUtilities.dp(24.0f), true);
        cVar.f4374q = 220;
        view.setBackground(cVar);
        addView(view, w7.z5.e(-1, 72, 55));
        if (i10 == 0) {
            this.f36018a = new gp0(ip0.f0(ip0Var), 0L, getContext(), ip0.g0(ip0Var));
            j(false);
        } else {
            View view2 = new View(getContext());
            this.f36041x = view2;
            bh.c cVar2 = new bh.c(bVar.c(view2, null, false));
            cVar2.b(-AndroidUtilities.dp(16.0f), false);
            view2.setBackground(cVar2);
            addView(view2, w7.z5.e(-1, 16, 55));
            ?? faVar = new org.telegram.ui.Cells.fa(getContext(), ip0.h0(ip0Var), 3, 0L, ip0.i0(ip0Var));
            this.v = faVar;
            faVar.setImportantForAccessibility(4);
            faVar.f22272r = ip0Var;
            faVar.setClipToOutline(true);
            ci.o1 o1Var = zf.j0.f51581a;
            faVar.setOutlineProvider(new zf.i0(0, AndroidUtilities.dp(16.0f)));
            addView((View) faVar, w7.z5.d(-1, -2.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        hp0 hp0Var = new hp0(ip0Var, getContext(), ip0.j0(ip0Var));
        this.E = hp0Var;
        dh.d c10 = ip0Var.E.c(hp0Var, null, false);
        eh.e eVar = new eh.e(ip0.k0(ip0Var));
        eVar.e = new ci.i1(24);
        eVar.d(0, 0);
        eVar.c(0, 0);
        eVar.b(0, 0);
        c10.o(eVar);
        c10.q(AndroidUtilities.dp(18.0f));
        c10.f8014j.e = true;
        hp0Var.H = c10;
        hp0Var.G = c10;
        hp0Var.F = new so0(this, 0);
        hp0Var.setVisibility(4);
        addView(hp0Var, w7.z5.d(-1, 36.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        gp0 gp0Var = this.f36018a;
        if (gp0Var != null) {
            addView(gp0Var, w7.z5.e(-1, -2, 55));
        }
        g();
        k();
        setWillNotDraw(false);
    }

    public static void a(cp0 cp0Var) {
        int i10;
        to0 to0Var = cp0Var.f36020b;
        boolean z10 = cp0Var.H;
        if (z10) {
            to0Var.B0();
        }
        cp0Var.e();
        if (z10 && (i10 = cp0Var.f36029h0) >= 0) {
            cp0Var.f36022c.h1(i10, cp0Var.f36037p0.f38087f);
            to0Var.post(new so0(cp0Var, 1));
        }
    }

    public final boolean b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cp0.b():boolean");
    }

    public final boolean c() {
        to0 to0Var = this.f36020b;
        if (to0Var != null) {
            for (int i10 = 0; i10 < to0Var.getChildCount(); i10++) {
                if (to0Var.getChildAt(i10) instanceof org.telegram.ui.Components.b10) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void d() {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible;
        int i10 = this.m0;
        ip0 ip0Var = this.f36037p0;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible = null;
        if (i10 == 0) {
            TLRPC.User currentUser = ip0Var.getUserConfig().getCurrentUser();
            this.h = UserObject.getProfileColorId(currentUser);
            this.f36034n = UserObject.getProfileEmojiId(currentUser);
            if (currentUser != null) {
                TLRPC.EmojiStatus emojiStatus = currentUser.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                    this.f36038r = tL_emojiStatusCollectible;
                    this.f36039s = null;
                }
            }
            tL_emojiStatusCollectible = null;
            this.f36038r = tL_emojiStatusCollectible;
            this.f36039s = null;
        } else {
            TLRPC.User currentUser2 = ip0Var.getUserConfig().getCurrentUser();
            this.h = UserObject.getColorId(currentUser2);
            this.f36034n = UserObject.getEmojiId(currentUser2);
            this.f36038r = null;
            if (currentUser2 != null) {
                TLRPC.PeerColor peerColor = currentUser2.color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                }
            }
            this.f36039s = tL_peerColorCollectible;
        }
        if (this.f36038r == null && this.f36039s == null) {
            return;
        }
        this.h = -1;
        this.f36034n = 0L;
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
        ip0 ip0Var = this.f36037p0;
        n2.e eVar = this.e;
        if (tL_starGiftUnique != null) {
            ag.a resellAmount = tL_starGiftUnique.getResellAmount(ag.b.f633a);
            if (tL_starGiftUnique.resale_ton_only) {
                eVar.f17039b = ai.md.n1(ai.md.T0(LocaleController.formatString(R.string.ResellGiftBuyTON, tL_starGiftUnique.getResellAmount(ag.b.f634b).d()), true), true);
                eVar.f17040c = ai.md.R0(LocaleController.formatPluralStringComma("ResellGiftBuyEq", (int) resellAmount.a()));
            } else {
                eVar.f17039b = ai.md.R0(LocaleController.formatPluralStringComma("ResellGiftBuy", (int) resellAmount.a()));
                eVar.f17040c = null;
            }
        } else {
            if (!ip0Var.getUserConfig().isPremium() && !ip0Var.f38079a) {
                obj = this.N;
            } else if (this.f36038r != null) {
                obj = this.P;
            } else {
                obj = this.O;
            }
            eVar.f17039b = obj;
            eVar.f17040c = null;
        }
        if (ip0Var.C0() == this) {
            ip0Var.R = this;
            ip0Var.Q.g((CharSequence) eVar.f17039b, z10, true);
            ip0Var.Q.f((SpannableStringBuilder) eVar.f17040c, z10);
        }
    }

    public final void g() {
        ei.d dVar = this.f36037p0.Q;
        if (dVar != null) {
            dVar.j();
        }
        xo0 xo0Var = this.v;
        if (xo0Var != null) {
            xo0Var.invalidate();
        }
        j(true);
        AndroidUtilities.forEachViews((RecyclerView) this.f36020b, (Utilities.Callback<View>) new v3(this, 14));
        hp0 hp0Var = this.E;
        if (hp0Var != null) {
            l(hp0Var);
        }
    }

    public final void h() {
        int i10;
        boolean z10;
        int i11 = this.f36037p0.f38087f;
        float f7 = 0.0f;
        View view = this.f36040w;
        hp0 hp0Var = this.E;
        if (hp0Var != null && (i10 = this.f36029h0) >= 0) {
            s4.s sVar = this.f36022c;
            this.F = sVar.m(i10);
            to0 to0Var = this.f36020b;
            int paddingTop = to0Var.getPaddingTop() + i11;
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
                hp0Var.setVisibility(0);
                hp0Var.setTranslationY((Math.max(this.F.getTop(), paddingTop) + to0Var.getTop()) - hp0Var.getTop());
            } else if (L0 != -1 && L0 > this.f36029h0) {
                this.H = true;
                this.G = false;
                hp0Var.setVisibility(0);
                hp0Var.setTranslationY((to0Var.getTop() + paddingTop) - hp0Var.getTop());
            } else {
                this.H = false;
                this.G = false;
                hp0Var.setVisibility(0);
                hp0Var.setTranslationY((AndroidUtilities.dp(1.0f) + getHeight()) - hp0Var.getTop());
            }
            boolean z11 = this.G;
            if (hp0Var.I != z11) {
                hp0Var.I = z11;
                hp0Var.L.D0(2);
                hp0Var.invalidate();
            }
            if (this.H) {
                f7 = AndroidUtilities.dp(36.0f) + i11;
            }
            view.setTranslationY(f7);
            to0Var.invalidate();
            invalidate();
            return;
        }
        this.G = false;
        this.H = false;
        if (view != null) {
            view.setTranslationY(0.0f);
        }
        if (hp0Var != null) {
            hp0Var.setVisibility(4);
            boolean z12 = this.G;
            if (hp0Var.I != z12) {
                hp0Var.I = z12;
                hp0Var.L.D0(2);
                hp0Var.invalidate();
            }
        }
    }

    public final void i() {
        MessageObject messageObject;
        xo0 xo0Var = this.v;
        if (xo0Var != null) {
            org.telegram.ui.Cells.u1[] cells = xo0Var.getCells();
            for (int i10 = 0; i10 < cells.length; i10++) {
                org.telegram.ui.Cells.u1 u1Var = cells[i10];
                if (u1Var != null && (messageObject = u1Var.getMessageObject()) != null) {
                    messageObject.notime = true;
                    fp0 fp0Var = this.f36026f;
                    if (fp0Var != null) {
                        messageObject.overrideLinkColor = fp0Var.getColorId();
                    }
                    messageObject.overrideLinkEmoji = this.f36034n;
                    messageObject.overrideLinkPeerColor = this.f36039s;
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
        ip0 ip0Var;
        lo0 lo0Var;
        fp0 fp0Var = this.f36026f;
        if (fp0Var != null) {
            fp0Var.a(this.h, z10);
        }
        gp0 gp0Var = this.f36018a;
        if (gp0Var != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.f36038r;
            if (tL_emojiStatusCollectible != null) {
                gp0Var.e(tL_emojiStatusCollectible.document_id, true, z10);
                gp0Var.c(MessagesController.PeerColor.fromCollectible(this.f36038r), z10);
                gp0Var.d(this.f36038r.pattern_document_id, true, z10);
            } else {
                if (DialogObject.isEmojiStatusCollectible(0L)) {
                    gp0Var.e(0L, false, z10);
                } else {
                    gp0Var.e(DialogObject.getEmojiStatusDocumentId(0L), DialogObject.isEmojiStatusCollectible(0L), z10);
                }
                gp0Var.b(this.h, z10);
                gp0Var.d(this.f36034n, false, z10);
            }
        }
        int i11 = this.m0;
        if (i11 == 0 && (lo0Var = (ip0Var = this.f36037p0).e) != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = this.f36038r;
            if (tL_emojiStatusCollectible2 != null) {
                lo0Var.c(MessagesController.PeerColor.fromCollectible(tL_emojiStatusCollectible2), z10);
            } else {
                lo0Var.b(ip0.v0(ip0Var), this.h, z10);
            }
        }
        if (i11 == 0) {
            int i12 = this.V;
            k();
            vo0 vo0Var = this.d;
            if (i12 >= 0 && this.V < 0) {
                vo0Var.t(i12, 2);
            } else if (i12 < 0 && (i10 = this.V) >= 0) {
                vo0Var.s(i10, 2);
            }
        }
        int i13 = 0;
        while (true) {
            to0 to0Var = this.f36020b;
            if (i13 < to0Var.getChildCount()) {
                View childAt = to0Var.getChildAt(i13);
                if (childAt instanceof qo0) {
                    qo0 qo0Var = (qo0) childAt;
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible3 = this.f36038r;
                    if ((tL_emojiStatusCollectible3 != null && tL_emojiStatusCollectible3.collectible_id == qo0Var.getGiftId()) || ((tL_peerColorCollectible2 = this.f36039s) != null && tL_peerColorCollectible2.collectible_id == qo0Var.getGiftId())) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    qo0Var.b(z12, true);
                } else if (childAt instanceof yh.g1) {
                    yh.g1 g1Var = (yh.g1) childAt;
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible4 = this.f36038r;
                    if ((tL_emojiStatusCollectible4 != null && tL_emojiStatusCollectible4.collectible_id == g1Var.getGiftId()) || ((tL_peerColorCollectible = this.f36039s) != null && tL_peerColorCollectible.collectible_id == g1Var.getGiftId())) {
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
        ip0 ip0Var = this.f36037p0;
        ai.y9 y9Var2 = ip0Var.f38081b;
        this.V = -1;
        this.W = -1;
        this.f36019a0 = -1;
        this.f36021b0 = -1;
        this.f36024d0 = -1;
        this.f36025e0 = -1;
        this.f36023c0 = -1;
        this.f36028g0 = -1;
        this.f36029h0 = -1;
        this.f36030i0 = -1;
        this.f36031j0 = -1;
        this.f36027f0 = 0;
        ArrayList arrayList = this.f36033l0;
        arrayList.clear();
        this.Q = 0;
        this.S = 1;
        int i10 = 3;
        this.f36032k0 = 3;
        this.R = 2;
        int i11 = this.m0;
        if (i11 == 0 && (this.h >= 0 || this.f36038r != null || this.f36039s != null)) {
            this.V = 3;
            this.f36032k0 = 5;
            this.W = 4;
        }
        if (i11 == 1) {
            y9Var = ip0Var.f38083c;
        } else {
            y9Var = y9Var2;
        }
        if ((i11 == 0 || i11 == 1) && y9Var != null) {
            ArrayList arrayList2 = y9Var.f2504l;
            int i12 = this.f36032k0;
            this.f36032k0 = i12 + 1;
            this.f36029h0 = i12;
            if (this.K == null) {
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) arrayList2.get(i13)).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        arrayList.add((TL_stars.TL_starGiftUnique) starGift);
                    }
                }
                int i14 = this.f36032k0;
                this.f36021b0 = i14;
                this.f36032k0 = arrayList.size() + i14;
                int size = arrayList.size() + this.f36027f0;
                this.f36027f0 = size;
                int i15 = this.f36032k0;
                this.f36023c0 = i15;
                if (!y9Var2.f2501i && y9Var2.f2502j) {
                    if (arrayList.isEmpty()) {
                        int i16 = this.f36032k0;
                        this.f36031j0 = i16;
                        this.f36032k0 = i16 + 2;
                        this.f36030i0 = i16 + 1;
                    }
                } else {
                    this.f36024d0 = i15;
                    int i17 = 3 - (size % 3);
                    if (size <= 0) {
                        i10 = 9;
                    } else if (i17 > 0) {
                        i10 = i17;
                    }
                    int i18 = i15 + i10;
                    this.f36032k0 = i18;
                    this.f36027f0 = size + i10;
                    this.f36025e0 = i18;
                }
                if (c()) {
                    y9Var.a();
                }
            } else if (this.J != null) {
                long clientUserId = UserConfig.getInstance(ip0.u0(ip0Var)).getClientUserId();
                for (int i19 = 0; i19 < this.J.d.size(); i19++) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.J.d.get(i19);
                    if (DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id) != clientUserId && DialogObject.getPeerDialogId(tL_starGiftUnique.host_id) != clientUserId) {
                        arrayList.add(tL_starGiftUnique);
                    }
                }
                int i20 = this.f36032k0;
                this.f36021b0 = i20;
                this.f36032k0 = arrayList.size() + i20;
                int size2 = arrayList.size() + this.f36027f0;
                this.f36027f0 = size2;
                int i21 = this.f36032k0;
                this.f36023c0 = i21;
                yh.s3 s3Var = this.J;
                if (s3Var.f50520t || !s3Var.f50521u) {
                    this.f36024d0 = i21;
                    int i22 = 3 - (size2 % 3);
                    if (size2 <= 0) {
                        i10 = 9;
                    } else if (i22 > 0) {
                        i10 = i22;
                    }
                    int i23 = i21 + i10;
                    this.f36032k0 = i23;
                    this.f36027f0 = size2 + i10;
                    this.f36025e0 = i23;
                }
                if (c()) {
                    this.J.g(false);
                }
            }
            int i24 = this.f36032k0;
            this.f36032k0 = i24 + 1;
            this.f36028g0 = i24;
        }
        int i25 = this.f36032k0;
        this.f36032k0 = i25 + 1;
        this.U = i25;
        hp0 hp0Var = this.E;
        if (hp0Var != null) {
            hp0Var.post(new so0(this, 1));
        }
    }

    public final void l(hp0 hp0Var) {
        int i10;
        int i11 = org.telegram.ui.ActionBar.h6.f20990d6;
        ip0 ip0Var = this.f36037p0;
        int themedColor = ip0Var.getThemedColor(i11);
        ip0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20932a7);
        int themedColor2 = ip0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f21395z6);
        int themedColor3 = ip0Var.getThemedColor(org.telegram.ui.ActionBar.h6.G6);
        hp0Var.v.setColor(themedColor);
        hp0Var.f37708x = org.telegram.ui.ActionBar.h6.m1(0.06f, themedColor3);
        hp0Var.f37709y = themedColor2;
        hp0Var.E = themedColor3;
        g10 g10Var = hp0Var.f37700a;
        for (int i12 = 0; i12 < g10Var.getChildCount(); i12++) {
            View childAt = g10Var.getChildAt(i12);
            int R = RecyclerView.R(childAt);
            if (R != -1 && (childAt instanceof TextView)) {
                TextView textView = (TextView) childAt;
                if (R == hp0Var.d) {
                    i10 = hp0Var.E;
                } else {
                    i10 = hp0Var.f37709y;
                }
                textView.setTextColor(i10);
                childAt.invalidate();
            }
        }
        g10Var.invalidate();
        hp0Var.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = this.m0;
        View view = this.f36040w;
        to0 to0Var = this.f36020b;
        if (i12 == 1) {
            super.onMeasure(i10, i11);
            xo0 xo0Var = this.v;
            this.f36035n0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + xo0Var.getMeasuredHeight() + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) xo0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) to0Var.getLayoutParams()).topMargin = this.f36035n0 - AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.f36035n0 - AndroidUtilities.dp(64.0f);
            ((ViewGroup.MarginLayoutParams) this.f36041x.getLayoutParams()).topMargin = this.f36035n0 - AndroidUtilities.dp(16.0f);
            to0Var.setPadding(to0Var.getPaddingLeft(), AndroidUtilities.dp(16.0f), to0Var.getPaddingRight(), to0Var.getPaddingBottom());
        } else {
            this.f36035n0 = AndroidUtilities.dp(230.0f) + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) to0Var.getLayoutParams()).topMargin = this.f36035n0;
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.f36035n0 - AndroidUtilities.dp(64.0f);
            ((ViewGroup.MarginLayoutParams) this.f36018a.getLayoutParams()).height = this.f36035n0;
        }
        super.onMeasure(i10, i11);
    }
}
