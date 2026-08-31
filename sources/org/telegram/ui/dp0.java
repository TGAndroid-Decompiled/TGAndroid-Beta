package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class dp0 extends FrameLayout {
    public lh.b5 B;
    public TL_stars.StarGift C;
    public final ArrayList D;
    public final HashMap E;
    public final SpannableStringBuilder F;
    public final String G;
    public final String H;
    public int I;
    public int J;
    public int K;
    public final int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public final hp0 f36271a;
    public int f36272a0;
    public final vo0 f36273b;
    public int f36274b0;
    public final xo0 f36275c;
    public final ArrayList f36276c0;
    public final View d;
    public final int f36277d0;
    public final FrameLayout f36278e;
    public int f36279e0;
    public final qh.d f36280f;
    public ap0 f36281f0;
    public final ip0 f36282g0;
    public gp0 h;
    public int f36283n;
    public long f36284r;
    public TLRPC.TL_emojiStatusCollectible f36285s;
    public TLRPC.TL_peerColorCollectible v;
    public final org.telegram.ui.Cells.ea f36286w;
    public cp0 f36287x;
    public TL_stars.TL_starGiftUnique f36288y;

    public dp0(ip0 ip0Var, Context context, int i10) {
        super(context);
        int i11;
        org.telegram.ui.ActionBar.f5 f5Var;
        org.telegram.ui.ActionBar.g6 g6Var;
        int i12;
        org.telegram.ui.ActionBar.g6 g6Var2;
        this.f36282g0 = ip0Var;
        this.f36283n = -1;
        this.f36284r = 0L;
        this.f36285s = null;
        this.v = null;
        this.C = null;
        this.D = new ArrayList();
        this.E = new HashMap();
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.O = -1;
        this.P = -1;
        this.Q = -1;
        this.R = -1;
        this.S = -1;
        this.T = -1;
        this.U = 0;
        this.V = -1;
        this.W = -1;
        this.f36272a0 = -1;
        this.f36276c0 = new ArrayList();
        this.f36277d0 = i10;
        d();
        vo0 vo0Var = new vo0(this, getContext(), ip0Var.getResourceProvider(), i10);
        this.f36273b = vo0Var;
        ((f2.l) vo0Var.getItemAnimator()).f5910m = false;
        getContext();
        f2.w wVar = new f2.w(3);
        wVar.O = new lh.n5(this, 6);
        vo0Var.i(new hg.e2(this, 7));
        vo0Var.setLayoutManager(wVar);
        xo0 xo0Var = new xo0(this, context, i10);
        this.f36275c = xo0Var;
        vo0Var.setAdapter(xo0Var);
        vo0Var.setOnItemClickListener(new org.telegram.ui.Components.ym0(this, i10, 1));
        vo0Var.j(new yo0(this, i10));
        addView(vo0Var, k7.c6.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f36278e = frameLayout;
        frameLayout.setBackgroundColor(ip0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21605a7));
        View view = new View(getContext());
        this.d = view;
        view.setBackgroundColor(ip0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21660d7));
        view.setAlpha(0.0f);
        frameLayout.addView(view, k7.c6.d(-1, 0.66f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.oq(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
        boolean z4 = ip0Var.f37904a;
        if (z4) {
            i11 = R.string.ChannelColorApply;
        } else {
            i11 = R.string.UserColorApply;
        }
        String string = LocaleController.getString(i11);
        this.G = string;
        SpannableStringBuilder append = new SpannableStringBuilder(spannableStringBuilder).append((CharSequence) " ").append((CharSequence) string);
        this.F = append;
        String string2 = LocaleController.getString(R.string.UserColorApplyCollectible);
        this.H = string2;
        qh.d dVar = new qh.d(getContext(), ip0Var.getResourceProvider(), true);
        this.f36280f = dVar;
        dVar.e();
        dVar.d.o(true, true, false);
        if (!z4) {
            if (!ip0Var.getUserConfig().isPremium()) {
                string = append;
            } else if (this.f36285s != null) {
                string = string2;
            }
        }
        dVar.g(string, false, true);
        dVar.setOnClickListener(new f60(this, 17));
        frameLayout.addView(dVar, k7.c6.d(-1, 48.0f, 119, 14.0f, 14.66f, 14.0f, 14.0f));
        addView(frameLayout, k7.c6.e(-1, -2, 80));
        vo0Var.j(new l3(this, 23));
        f2.l lVar = new f2.l();
        lVar.n(350L);
        lVar.o(org.telegram.ui.Components.pr.h);
        lVar.C = false;
        lVar.f5910m = false;
        vo0Var.setItemAnimator(lVar);
        if (i10 == 0) {
            Context context2 = getContext();
            i12 = ((org.telegram.ui.ActionBar.p2) ip0Var).currentAccount;
            g6Var2 = ((org.telegram.ui.ActionBar.p2) ip0Var).resourceProvider;
            hp0 hp0Var = new hp0(i12, 0L, context2, g6Var2);
            this.f36271a = hp0Var;
            i(false);
            addView(hp0Var, k7.c6.e(-1, -2, 55));
        } else {
            Context context3 = getContext();
            f5Var = ((org.telegram.ui.ActionBar.p2) ip0Var).parentLayout;
            g6Var = ((org.telegram.ui.ActionBar.p2) ip0Var).resourceProvider;
            org.telegram.ui.Cells.ea eaVar = new org.telegram.ui.Cells.ea(context3, f5Var, 3, 0L, g6Var);
            this.f36286w = eaVar;
            eaVar.setImportantForAccessibility(4);
            eaVar.f22781r = ip0Var;
            addView(eaVar, k7.c6.e(-1, -2, 55));
        }
        g();
        j();
        setWillNotDraw(false);
    }

    public static void a(dp0 dp0Var) {
        float f10;
        vo0 vo0Var = dp0Var.f36273b;
        FrameLayout frameLayout = dp0Var.f36278e;
        if (frameLayout == null) {
            return;
        }
        int i10 = dp0Var.f36275c.f43444e.f36274b0 - 1;
        boolean z4 = false;
        int i11 = 0;
        for (int i12 = 0; i12 < vo0Var.getChildCount(); i12++) {
            View childAt = vo0Var.getChildAt(i12);
            int R = RecyclerView.R(childAt);
            if (R != -1 && R <= i10) {
                i11 = Math.max(i11, childAt.getTop());
                if (R == i10) {
                    z4 = true;
                }
            }
        }
        if (!z4) {
            i11 = vo0Var.getMeasuredHeight();
        }
        float max = Math.max(0, i11 - (vo0Var.getMeasuredHeight() - AndroidUtilities.dp(76.66f)));
        int i13 = dp0Var.f36277d0;
        if (i13 == 0 || i13 == 1) {
            ViewPropertyAnimator animate = dp0Var.d.animate();
            if (max > 0.0f) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            animate.alpha(f10).start();
            max = 0.0f;
        }
        frameLayout.setTranslationY(max);
    }

    public final boolean b() {
        ip0 ip0Var = this.f36282g0;
        boolean z4 = ip0Var.f37904a;
        long j10 = 0;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible = null;
        int i10 = this.f36277d0;
        int i11 = -1;
        if (z4) {
            TLRPC.Chat chat = ip0Var.getMessagesController().getChat(0L);
            if (chat != null) {
                if (i10 == 1) {
                    if (this.f36283n == ChatObject.getColorId(chat) && this.f36284r == ChatObject.getEmojiId(chat)) {
                        TLRPC.PeerColor peerColor = chat.color;
                        if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                            tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                        }
                        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2 = this.v;
                        if (tL_peerColorCollectible != tL_peerColorCollectible2) {
                            if (tL_peerColorCollectible != null || tL_peerColorCollectible2 != null) {
                                if (tL_peerColorCollectible != null && tL_peerColorCollectible2 != null && tL_peerColorCollectible.collectible_id == tL_peerColorCollectible2.collectible_id) {
                                    return false;
                                }
                            } else {
                                return false;
                            }
                        } else {
                            return false;
                        }
                    }
                } else {
                    int i12 = this.f36283n;
                    if (!(chat.emoji_status instanceof TLRPC.TL_emojiStatusCollectible)) {
                        i11 = ChatObject.getProfileColorId(chat);
                    }
                    if (i12 == i11) {
                        long j11 = this.f36284r;
                        if (!(chat.emoji_status instanceof TLRPC.TL_emojiStatusCollectible)) {
                            j10 = ChatObject.getOnlyProfileEmojiId(chat);
                        }
                        if (j11 == j10 && ip0.x0(chat.emoji_status, this.f36285s)) {
                            return false;
                        }
                    }
                }
            } else {
                return false;
            }
        } else {
            TLRPC.User currentUser = ip0Var.getUserConfig().getCurrentUser();
            if (currentUser != null) {
                if (i10 == 1) {
                    int i13 = this.f36283n;
                    if (!(currentUser.color instanceof TLRPC.TL_peerColorCollectible)) {
                        i11 = UserObject.getColorId(currentUser);
                    }
                    if (i13 == i11 && this.f36284r == UserObject.getEmojiId(currentUser)) {
                        TLRPC.PeerColor peerColor2 = currentUser.color;
                        if (peerColor2 instanceof TLRPC.TL_peerColorCollectible) {
                            tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor2;
                        }
                        TLRPC.TL_peerColorCollectible tL_peerColorCollectible3 = this.v;
                        if (tL_peerColorCollectible != tL_peerColorCollectible3) {
                            if (tL_peerColorCollectible != null || tL_peerColorCollectible3 != null) {
                                if (tL_peerColorCollectible != null && tL_peerColorCollectible3 != null && tL_peerColorCollectible.collectible_id == tL_peerColorCollectible3.collectible_id) {
                                    return false;
                                }
                            } else {
                                return false;
                            }
                        } else {
                            return false;
                        }
                    }
                } else {
                    int i14 = this.f36283n;
                    if (!(currentUser.emoji_status instanceof TLRPC.TL_emojiStatusCollectible)) {
                        i11 = UserObject.getProfileColorId(currentUser);
                    }
                    if (i14 == i11) {
                        long j12 = this.f36284r;
                        if (!(currentUser.emoji_status instanceof TLRPC.TL_emojiStatusCollectible)) {
                            j10 = UserObject.getOnlyProfileEmojiId(currentUser);
                        }
                        if (j12 == j10 && ip0.x0(currentUser.emoji_status, this.f36285s)) {
                            return false;
                        }
                    }
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public final boolean c() {
        vo0 vo0Var = this.f36273b;
        if (vo0Var != null) {
            for (int i10 = 0; i10 < vo0Var.getChildCount(); i10++) {
                if (vo0Var.getChildAt(i10) instanceof org.telegram.ui.Components.u00) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void d() {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible;
        int i10 = this.f36277d0;
        ip0 ip0Var = this.f36282g0;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible = null;
        if (i10 == 0) {
            TLRPC.User currentUser = ip0Var.getUserConfig().getCurrentUser();
            this.f36283n = UserObject.getProfileColorId(currentUser);
            this.f36284r = UserObject.getProfileEmojiId(currentUser);
            if (currentUser != null) {
                TLRPC.EmojiStatus emojiStatus = currentUser.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                    this.f36285s = tL_emojiStatusCollectible;
                    this.v = null;
                }
            }
            tL_emojiStatusCollectible = null;
            this.f36285s = tL_emojiStatusCollectible;
            this.v = null;
        } else {
            TLRPC.User currentUser2 = ip0Var.getUserConfig().getCurrentUser();
            this.f36283n = UserObject.getColorId(currentUser2);
            this.f36284r = UserObject.getEmojiId(currentUser2);
            this.f36285s = null;
            if (currentUser2 != null) {
                TLRPC.PeerColor peerColor = currentUser2.color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                }
            }
            this.v = tL_peerColorCollectible;
        }
        if (this.f36285s == null && this.v == null) {
            return;
        }
        this.f36283n = -1;
        this.f36284r = 0L;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        ip0 ip0Var = this.f36282g0;
        if (ip0Var.getParentLayout() != null) {
            ((ActionBarLayout) ip0Var.getParentLayout()).q(canvas, this.f36279e0);
        }
    }

    public final void e() {
        j();
        this.f36275c.l();
    }

    public final void f() {
        CharSequence charSequence;
        qh.d dVar = this.f36280f;
        if (dVar == null) {
            return;
        }
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.f36288y;
        if (tL_starGiftUnique != null) {
            mf.a resellAmount = tL_starGiftUnique.getResellAmount(mf.b.f13651a);
            if (tL_starGiftUnique.resale_ton_only) {
                dVar.g(mh.ja.S0(LocaleController.formatString(R.string.ResellGiftBuyTON, tL_starGiftUnique.getResellAmount(mf.b.f13652b).d()), true), true, true);
                dVar.f(mh.ja.Q0(LocaleController.formatPluralStringComma("ResellGiftBuyEq", (int) resellAmount.a())), true);
                return;
            }
            dVar.g(mh.ja.Q0(LocaleController.formatPluralStringComma("ResellGiftBuy", (int) resellAmount.a())), true, true);
            dVar.f(null, true);
            return;
        }
        ip0 ip0Var = this.f36282g0;
        if (!ip0Var.getUserConfig().isPremium() && !ip0Var.f37904a) {
            charSequence = this.F;
        } else if (this.f36285s != null) {
            charSequence = this.H;
        } else {
            charSequence = this.G;
        }
        dVar.g(charSequence, true, true);
        dVar.f(null, true);
    }

    public final void g() {
        int i10 = org.telegram.ui.ActionBar.k6.f21605a7;
        ip0 ip0Var = this.f36282g0;
        int themedColor = ip0Var.getThemedColor(i10);
        vo0 vo0Var = this.f36273b;
        vo0Var.setBackgroundColor(themedColor);
        qh.d dVar = this.f36280f;
        if (dVar != null) {
            dVar.j();
        }
        org.telegram.ui.Cells.ea eaVar = this.f36286w;
        if (eaVar != null) {
            eaVar.invalidate();
        }
        i(true);
        this.f36278e.setBackgroundColor(ip0Var.getThemedColor(i10));
        this.d.setBackgroundColor(ip0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21660d7));
        AndroidUtilities.forEachViews((RecyclerView) vo0Var, (h5.d) new vb(this, 3));
    }

    public final void h() {
        MessageObject messageObject;
        org.telegram.ui.Cells.ea eaVar = this.f36286w;
        if (eaVar != null) {
            org.telegram.ui.Cells.t1[] cells = eaVar.getCells();
            for (int i10 = 0; i10 < cells.length; i10++) {
                org.telegram.ui.Cells.t1 t1Var = cells[i10];
                if (t1Var != null && (messageObject = t1Var.getMessageObject()) != null) {
                    messageObject.notime = true;
                    gp0 gp0Var = this.h;
                    if (gp0Var != null) {
                        messageObject.overrideLinkColor = gp0Var.getColorId();
                    }
                    messageObject.overrideLinkEmoji = this.f36284r;
                    messageObject.overrideLinkPeerColor = this.v;
                    cells[i10].setAvatar(messageObject);
                    cells[i10].invalidate();
                }
            }
        }
    }

    public final void i(boolean z4) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        boolean z10;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        boolean z11;
        int i10;
        ip0 ip0Var;
        oo0 oo0Var;
        int i11;
        gp0 gp0Var = this.h;
        if (gp0Var != null) {
            gp0Var.a(this.f36283n, z4);
        }
        hp0 hp0Var = this.f36271a;
        if (hp0Var != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.f36285s;
            if (tL_emojiStatusCollectible != null) {
                hp0Var.e(tL_emojiStatusCollectible.document_id, true, z4);
                hp0Var.c(MessagesController.PeerColor.fromCollectible(this.f36285s), z4);
                hp0Var.d(this.f36285s.pattern_document_id, true, z4);
            } else {
                if (DialogObject.isEmojiStatusCollectible(0L)) {
                    hp0Var.e(0L, false, z4);
                } else {
                    hp0Var.e(DialogObject.getEmojiStatusDocumentId(0L), DialogObject.isEmojiStatusCollectible(0L), z4);
                }
                hp0Var.b(this.f36283n, z4);
                hp0Var.d(this.f36284r, false, z4);
            }
        }
        int i12 = this.f36277d0;
        if (i12 == 0 && (oo0Var = (ip0Var = this.f36282g0).f37907e) != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = this.f36285s;
            if (tL_emojiStatusCollectible2 == null) {
                i11 = ((org.telegram.ui.ActionBar.p2) ip0Var).currentAccount;
                oo0Var.b(i11, this.f36283n, z4);
            } else {
                oo0Var.c(MessagesController.PeerColor.fromCollectible(tL_emojiStatusCollectible2), z4);
            }
        }
        if (i12 == 0) {
            int i13 = this.N;
            j();
            xo0 xo0Var = this.f36275c;
            if (i13 >= 0 && this.N < 0) {
                xo0Var.t(i13, 2);
            } else if (i13 < 0 && (i10 = this.N) >= 0) {
                xo0Var.s(i10, 2);
            }
        }
        int i14 = 0;
        while (true) {
            vo0 vo0Var = this.f36273b;
            if (i14 < vo0Var.getChildCount()) {
                View childAt = vo0Var.getChildAt(i14);
                if (childAt instanceof to0) {
                    to0 to0Var = (to0) childAt;
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible3 = this.f36285s;
                    if ((tL_emojiStatusCollectible3 != null && tL_emojiStatusCollectible3.collectible_id == to0Var.getGiftId()) || ((tL_peerColorCollectible2 = this.v) != null && tL_peerColorCollectible2.collectible_id == to0Var.getGiftId())) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    to0Var.b(z11, true);
                } else if (childAt instanceof lh.x1) {
                    lh.x1 x1Var = (lh.x1) childAt;
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible4 = this.f36285s;
                    if ((tL_emojiStatusCollectible4 != null && tL_emojiStatusCollectible4.collectible_id == x1Var.getGiftId()) || ((tL_peerColorCollectible = this.v) != null && tL_peerColorCollectible.collectible_id == x1Var.getGiftId())) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    x1Var.e(z10, true);
                }
                i14++;
            } else {
                return;
            }
        }
    }

    public final void j() {
        mh.l7 l7Var;
        int i10;
        ip0 ip0Var = this.f36282g0;
        mh.l7 l7Var2 = ip0Var.f37905b;
        this.N = -1;
        this.O = -1;
        this.P = -1;
        this.Q = -1;
        this.S = -1;
        this.T = -1;
        this.R = -1;
        this.V = -1;
        this.W = -1;
        this.f36272a0 = -1;
        this.U = 0;
        ArrayList arrayList = this.f36276c0;
        arrayList.clear();
        this.I = 0;
        this.K = 1;
        int i11 = 3;
        this.f36274b0 = 3;
        this.J = 2;
        int i12 = this.f36277d0;
        if (i12 == 0 && (this.f36283n >= 0 || this.f36285s != null || this.v != null)) {
            this.N = 3;
            this.f36274b0 = 5;
            this.O = 4;
        }
        if (i12 == 1) {
            l7Var = ip0Var.f37906c;
        } else {
            l7Var = l7Var2;
        }
        if ((i12 == 0 || i12 == 1) && l7Var != null) {
            ArrayList arrayList2 = l7Var.f14405l;
            int i13 = this.f36274b0;
            this.f36274b0 = i13 + 1;
            this.W = i13;
            if (this.C == null) {
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) arrayList2.get(i14)).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        arrayList.add((TL_stars.TL_starGiftUnique) starGift);
                    }
                }
                int i15 = this.f36274b0;
                this.Q = i15;
                this.f36274b0 = arrayList.size() + i15;
                int size = arrayList.size() + this.U;
                this.U = size;
                int i16 = this.f36274b0;
                this.R = i16;
                if (!l7Var2.f14402i && l7Var2.f14403j) {
                    if (arrayList.isEmpty()) {
                        int i17 = this.f36274b0;
                        this.f36274b0 = i17 + 1;
                        this.f36272a0 = i17;
                    }
                } else {
                    this.S = i16;
                    int i18 = 3 - (size % 3);
                    if (size <= 0) {
                        i11 = 9;
                    } else if (i18 > 0) {
                        i11 = i18;
                    }
                    int i19 = i16 + i11;
                    this.f36274b0 = i19;
                    this.U = size + i11;
                    this.T = i19;
                }
                if (c()) {
                    l7Var.a();
                }
            } else if (this.B != null) {
                i10 = ((org.telegram.ui.ActionBar.p2) ip0Var).currentAccount;
                long clientUserId = UserConfig.getInstance(i10).getClientUserId();
                for (int i20 = 0; i20 < this.B.d.size(); i20++) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.B.d.get(i20);
                    if (DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id) != clientUserId && DialogObject.getPeerDialogId(tL_starGiftUnique.host_id) != clientUserId) {
                        arrayList.add(tL_starGiftUnique);
                    }
                }
                int i21 = this.f36274b0;
                this.Q = i21;
                this.f36274b0 = arrayList.size() + i21;
                int size2 = arrayList.size() + this.U;
                this.U = size2;
                int i22 = this.f36274b0;
                this.R = i22;
                lh.b5 b5Var = this.B;
                if (b5Var.f12635t || !b5Var.f12636u) {
                    this.S = i22;
                    int i23 = 3 - (size2 % 3);
                    if (size2 <= 0) {
                        i11 = 9;
                    } else if (i23 > 0) {
                        i11 = i23;
                    }
                    int i24 = i22 + i11;
                    this.f36274b0 = i24;
                    this.U = size2 + i11;
                    this.T = i24;
                }
                if (c()) {
                    this.B.g(false);
                }
            }
            int i25 = this.f36274b0;
            this.f36274b0 = i25 + 1;
            this.V = i25;
        }
        int i26 = this.f36274b0;
        this.f36274b0 = i26 + 1;
        this.M = i26;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = this.f36277d0;
        vo0 vo0Var = this.f36273b;
        if (i12 == 1) {
            super.onMeasure(i10, i11);
            org.telegram.ui.Cells.ea eaVar = this.f36286w;
            this.f36279e0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + eaVar.getMeasuredHeight() + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) eaVar.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) vo0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
            vo0Var.setPadding(0, eaVar.getMeasuredHeight(), 0, 0);
        } else {
            this.f36279e0 = AndroidUtilities.dp(230.0f) + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) vo0Var.getLayoutParams()).topMargin = this.f36279e0;
            ((ViewGroup.MarginLayoutParams) this.f36271a.getLayoutParams()).height = this.f36279e0;
        }
        super.onMeasure(i10, i11);
    }
}
