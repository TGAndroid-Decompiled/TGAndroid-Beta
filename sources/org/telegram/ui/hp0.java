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
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class hp0 extends FrameLayout {
    public static final int f34717n0 = 0;
    public final mp0 B;
    public View C;
    public boolean D;
    public boolean E;
    public TL_stars.TL_starGiftUnique F;
    public kh.a5 G;
    public TL_stars.StarGift H;
    public final ArrayList I;
    public final HashMap J;
    public final SpannableStringBuilder K;
    public final String L;
    public final String M;
    public int N;
    public int O;
    public int P;
    public final int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public final lp0 f34718a;
    public int f34719a0;
    public final yo0 f34720b;
    public int f34721b0;
    public final f2.w f34722c;
    public int f34723c0;
    public final ap0 d;
    public int f34724d0;
    public final n7.qa e;
    public int f34725e0;
    public kp0 f34726f;
    public int f34727f0;
    public int f34728g0;
    public int h;
    public int f34729h0;
    public final ArrayList f34730i0;
    public final int f34731j0;
    public int f34732k0;
    public ep0 f34733l0;
    public final np0 m0;
    public long f34734n;
    public TLRPC.TL_emojiStatusCollectible f34735r;
    public TLRPC.TL_peerColorCollectible f34736s;
    public final cp0 v;
    public final View f34737w;
    public final View f34738x;
    public gp0 f34739y;

    public hp0(np0 np0Var, Context context, int i10) {
        super(context);
        int i11;
        this.m0 = np0Var;
        this.e = new n7.qa(18);
        this.h = -1;
        this.f34734n = 0L;
        this.f34735r = null;
        this.f34736s = null;
        this.H = null;
        this.I = new ArrayList();
        this.J = new HashMap();
        this.N = -1;
        this.O = -1;
        this.P = -1;
        this.Q = -1;
        this.R = -1;
        this.S = -1;
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.f34719a0 = -1;
        this.f34721b0 = -1;
        this.f34723c0 = 0;
        this.f34724d0 = -1;
        this.f34725e0 = -1;
        this.f34727f0 = -1;
        this.f34728g0 = -1;
        this.f34730i0 = new ArrayList();
        this.f34731j0 = i10;
        d();
        Context context2 = getContext();
        org.telegram.ui.ActionBar.f6 resourceProvider = np0Var.getResourceProvider();
        ng.a aVar = np0Var.D;
        yo0 yo0Var = new yo0(this, context2, resourceProvider, i10);
        this.f34720b = yo0Var;
        yo0Var.setClipToPadding(false);
        yo0Var.setSections(true);
        ((f2.l) yo0Var.getItemAnimator()).f5807m = false;
        getContext();
        f2.w wVar = new f2.w(3);
        this.f34722c = wVar;
        wVar.O = new kh.m5(this, 6);
        yo0Var.i(new gg.e2(this, 7));
        yo0Var.setLayoutManager(wVar);
        ap0 ap0Var = new ap0(this, context, i10);
        this.d = ap0Var;
        yo0Var.setAdapter(ap0Var);
        yo0Var.setOnItemClickListener(new org.telegram.ui.Components.wm0(this, i10, 1));
        yo0Var.j(new bp0(this, i10));
        addView(yo0Var, k7.b6.c(-1.0f, -1));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.lq(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
        if (np0Var.f36553a) {
            i11 = R.string.ChannelColorApply;
        } else {
            i11 = R.string.UserColorApply;
        }
        String string = LocaleController.getString(i11);
        this.L = string;
        this.K = new SpannableStringBuilder(spannableStringBuilder).append((CharSequence) " ").append((CharSequence) string);
        this.M = LocaleController.getString(R.string.UserColorApplyCollectible);
        f(false);
        f2.l lVar = new f2.l();
        lVar.n(350L);
        lVar.o(org.telegram.ui.Components.mr.h);
        lVar.C = false;
        lVar.f5807m = false;
        yo0Var.setItemAnimator(lVar);
        View view = new View(getContext());
        this.f34737w = view;
        ng.b bVar = new ng.b(aVar.c(view, null, false));
        bVar.b(-AndroidUtilities.dp(24.0f), true);
        bVar.f14966q = 220;
        view.setBackground(bVar);
        addView(view, k7.b6.e(-1, 72, 55));
        if (i10 == 0) {
            this.f34718a = new lp0(np0.f0(np0Var), 0L, getContext(), np0.g0(np0Var));
            j(false);
        } else {
            View view2 = new View(getContext());
            this.f34738x = view2;
            ng.b bVar2 = new ng.b(aVar.c(view2, null, false));
            bVar2.b(-AndroidUtilities.dp(16.0f), false);
            view2.setBackground(bVar2);
            addView(view2, k7.b6.e(-1, 16, 55));
            ?? daVar = new org.telegram.ui.Cells.da(getContext(), np0.h0(np0Var), 3, 0L, np0.i0(np0Var));
            this.v = daVar;
            daVar.setImportantForAccessibility(4);
            daVar.f20955r = np0Var;
            daVar.setClipToOutline(true);
            gg.j1 j1Var = kf.r0.f10496a;
            daVar.setOutlineProvider(new kf.q0(0, AndroidUtilities.dp(16.0f)));
            addView((View) daVar, k7.b6.d(-1, -2.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        mp0 mp0Var = new mp0(np0Var, getContext(), np0.j0(np0Var));
        this.B = mp0Var;
        pg.b c3 = np0Var.B.c(mp0Var, null, false);
        qg.d dVar = new qg.d(np0.k0(np0Var));
        dVar.e = new rg.a(3);
        dVar.d(0, 0);
        dVar.c(0, 0);
        dVar.b(0, 0);
        c3.n(dVar);
        c3.p(AndroidUtilities.dp(18.0f));
        c3.h.e = true;
        mp0Var.E = c3;
        mp0Var.D = c3;
        mp0Var.C = new xo0(this, 0);
        mp0Var.setVisibility(4);
        addView(mp0Var, k7.b6.d(-1, 36.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        lp0 lp0Var = this.f34718a;
        if (lp0Var != null) {
            addView(lp0Var, k7.b6.e(-1, -2, 55));
        }
        g();
        k();
        setWillNotDraw(false);
    }

    public static void a(hp0 hp0Var) {
        int i10;
        yo0 yo0Var = hp0Var.f34720b;
        boolean z4 = hp0Var.E;
        if (z4) {
            yo0Var.B0();
        }
        hp0Var.e();
        if (z4 && (i10 = hp0Var.f34725e0) >= 0) {
            hp0Var.f34722c.h1(i10, hp0Var.m0.f36561f);
            yo0Var.post(new xo0(hp0Var, 1));
        }
    }

    public final boolean b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hp0.b():boolean");
    }

    public final boolean c() {
        yo0 yo0Var = this.f34720b;
        if (yo0Var != null) {
            for (int i10 = 0; i10 < yo0Var.getChildCount(); i10++) {
                if (yo0Var.getChildAt(i10) instanceof org.telegram.ui.Components.u00) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void d() {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible;
        int i10 = this.f34731j0;
        np0 np0Var = this.m0;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible = null;
        if (i10 == 0) {
            TLRPC.User currentUser = np0Var.getUserConfig().getCurrentUser();
            this.h = UserObject.getProfileColorId(currentUser);
            this.f34734n = UserObject.getProfileEmojiId(currentUser);
            if (currentUser != null) {
                TLRPC.EmojiStatus emojiStatus = currentUser.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                    this.f34735r = tL_emojiStatusCollectible;
                    this.f34736s = null;
                }
            }
            tL_emojiStatusCollectible = null;
            this.f34735r = tL_emojiStatusCollectible;
            this.f34736s = null;
        } else {
            TLRPC.User currentUser2 = np0Var.getUserConfig().getCurrentUser();
            this.h = UserObject.getColorId(currentUser2);
            this.f34734n = UserObject.getEmojiId(currentUser2);
            this.f34735r = null;
            if (currentUser2 != null) {
                TLRPC.PeerColor peerColor = currentUser2.color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                }
            }
            this.f34736s = tL_peerColorCollectible;
        }
        if (this.f34735r == null && this.f34736s == null) {
            return;
        }
        this.h = -1;
        this.f34734n = 0L;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.B && !this.E) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e() {
        k();
        this.d.l();
    }

    public final void f(boolean z4) {
        Object obj;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.F;
        np0 np0Var = this.m0;
        n7.qa qaVar = this.e;
        if (tL_starGiftUnique != null) {
            lf.a resellAmount = tL_starGiftUnique.getResellAmount(lf.b.f12056a);
            if (tL_starGiftUnique.resale_ton_only) {
                qaVar.f14687b = lh.ja.S0(LocaleController.formatString(R.string.ResellGiftBuyTON, tL_starGiftUnique.getResellAmount(lf.b.f12057b).d()), true);
                qaVar.f14688c = lh.ja.Q0(LocaleController.formatPluralStringComma("ResellGiftBuyEq", (int) resellAmount.a()));
            } else {
                qaVar.f14687b = lh.ja.Q0(LocaleController.formatPluralStringComma("ResellGiftBuy", (int) resellAmount.a()));
                qaVar.f14688c = null;
            }
        } else {
            if (!np0Var.getUserConfig().isPremium() && !np0Var.f36553a) {
                obj = this.K;
            } else if (this.f34735r != null) {
                obj = this.M;
            } else {
                obj = this.L;
            }
            qaVar.f14687b = obj;
            qaVar.f14688c = null;
        }
        if (np0Var.C0() == this) {
            np0Var.O = this;
            np0Var.N.g((CharSequence) qaVar.f14687b, z4, true);
            np0Var.N.f((SpannableStringBuilder) qaVar.f14688c, z4);
        }
    }

    public final void g() {
        ph.d dVar = this.m0.N;
        if (dVar != null) {
            dVar.j();
        }
        cp0 cp0Var = this.v;
        if (cp0Var != null) {
            cp0Var.invalidate();
        }
        j(true);
        AndroidUtilities.forEachViews((RecyclerView) this.f34720b, (h5.d) new xb(this, 3));
        mp0 mp0Var = this.B;
        if (mp0Var != null) {
            l(mp0Var);
        }
    }

    public final void h() {
        int i10;
        boolean z4;
        int i11 = this.m0.f36561f;
        float f10 = 0.0f;
        View view = this.f34737w;
        mp0 mp0Var = this.B;
        if (mp0Var != null && (i10 = this.f34725e0) >= 0) {
            f2.w wVar = this.f34722c;
            this.C = wVar.m(i10);
            yo0 yo0Var = this.f34720b;
            int paddingTop = yo0Var.getPaddingTop() + i11;
            int L0 = wVar.L0();
            View view2 = this.C;
            if (view2 != null) {
                if (view2.getTop() <= paddingTop) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.E = z4;
                this.D = !z4;
                mp0Var.setVisibility(0);
                mp0Var.setTranslationY((Math.max(this.C.getTop(), paddingTop) + yo0Var.getTop()) - mp0Var.getTop());
            } else if (L0 != -1 && L0 > this.f34725e0) {
                this.E = true;
                this.D = false;
                mp0Var.setVisibility(0);
                mp0Var.setTranslationY((yo0Var.getTop() + paddingTop) - mp0Var.getTop());
            } else {
                this.E = false;
                this.D = false;
                mp0Var.setVisibility(0);
                mp0Var.setTranslationY((AndroidUtilities.dp(1.0f) + getHeight()) - mp0Var.getTop());
            }
            boolean z10 = this.D;
            if (mp0Var.F != z10) {
                mp0Var.F = z10;
                mp0Var.I.D0(2);
                mp0Var.invalidate();
            }
            if (this.E) {
                f10 = AndroidUtilities.dp(36.0f) + i11;
            }
            view.setTranslationY(f10);
            yo0Var.invalidate();
            invalidate();
            return;
        }
        this.D = false;
        this.E = false;
        if (view != null) {
            view.setTranslationY(0.0f);
        }
        if (mp0Var != null) {
            mp0Var.setVisibility(4);
            boolean z11 = this.D;
            if (mp0Var.F != z11) {
                mp0Var.F = z11;
                mp0Var.I.D0(2);
                mp0Var.invalidate();
            }
        }
    }

    public final void i() {
        MessageObject messageObject;
        cp0 cp0Var = this.v;
        if (cp0Var != null) {
            org.telegram.ui.Cells.s1[] cells = cp0Var.getCells();
            for (int i10 = 0; i10 < cells.length; i10++) {
                org.telegram.ui.Cells.s1 s1Var = cells[i10];
                if (s1Var != null && (messageObject = s1Var.getMessageObject()) != null) {
                    messageObject.notime = true;
                    kp0 kp0Var = this.f34726f;
                    if (kp0Var != null) {
                        messageObject.overrideLinkColor = kp0Var.getColorId();
                    }
                    messageObject.overrideLinkEmoji = this.f34734n;
                    messageObject.overrideLinkPeerColor = this.f34736s;
                    cells[i10].setAvatar(messageObject);
                    cells[i10].invalidate();
                }
            }
        }
    }

    public final void j(boolean z4) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        boolean z10;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        boolean z11;
        int i10;
        np0 np0Var;
        qo0 qo0Var;
        kp0 kp0Var = this.f34726f;
        if (kp0Var != null) {
            kp0Var.a(this.h, z4);
        }
        lp0 lp0Var = this.f34718a;
        if (lp0Var != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.f34735r;
            if (tL_emojiStatusCollectible != null) {
                lp0Var.e(tL_emojiStatusCollectible.document_id, true, z4);
                lp0Var.c(MessagesController.PeerColor.fromCollectible(this.f34735r), z4);
                lp0Var.d(this.f34735r.pattern_document_id, true, z4);
            } else {
                if (DialogObject.isEmojiStatusCollectible(0L)) {
                    lp0Var.e(0L, false, z4);
                } else {
                    lp0Var.e(DialogObject.getEmojiStatusDocumentId(0L), DialogObject.isEmojiStatusCollectible(0L), z4);
                }
                lp0Var.b(this.h, z4);
                lp0Var.d(this.f34734n, false, z4);
            }
        }
        int i11 = this.f34731j0;
        if (i11 == 0 && (qo0Var = (np0Var = this.m0).e) != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = this.f34735r;
            if (tL_emojiStatusCollectible2 != null) {
                qo0Var.c(MessagesController.PeerColor.fromCollectible(tL_emojiStatusCollectible2), z4);
            } else {
                qo0Var.b(np0.v0(np0Var), this.h, z4);
            }
        }
        if (i11 == 0) {
            int i12 = this.S;
            k();
            ap0 ap0Var = this.d;
            if (i12 >= 0 && this.S < 0) {
                ap0Var.t(i12, 2);
            } else if (i12 < 0 && (i10 = this.S) >= 0) {
                ap0Var.s(i10, 2);
            }
        }
        int i13 = 0;
        while (true) {
            yo0 yo0Var = this.f34720b;
            if (i13 < yo0Var.getChildCount()) {
                View childAt = yo0Var.getChildAt(i13);
                if (childAt instanceof vo0) {
                    vo0 vo0Var = (vo0) childAt;
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible3 = this.f34735r;
                    if ((tL_emojiStatusCollectible3 != null && tL_emojiStatusCollectible3.collectible_id == vo0Var.getGiftId()) || ((tL_peerColorCollectible2 = this.f34736s) != null && tL_peerColorCollectible2.collectible_id == vo0Var.getGiftId())) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    vo0Var.b(z11, true);
                } else if (childAt instanceof kh.x1) {
                    kh.x1 x1Var = (kh.x1) childAt;
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible4 = this.f34735r;
                    if ((tL_emojiStatusCollectible4 != null && tL_emojiStatusCollectible4.collectible_id == x1Var.getGiftId()) || ((tL_peerColorCollectible = this.f34736s) != null && tL_peerColorCollectible.collectible_id == x1Var.getGiftId())) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    x1Var.e(z10, true);
                }
                i13++;
            } else {
                return;
            }
        }
    }

    public final void k() {
        lh.l7 l7Var;
        np0 np0Var = this.m0;
        lh.l7 l7Var2 = np0Var.f36555b;
        this.S = -1;
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.f34719a0 = -1;
        this.f34721b0 = -1;
        this.W = -1;
        this.f34724d0 = -1;
        this.f34725e0 = -1;
        this.f34727f0 = -1;
        this.f34728g0 = -1;
        this.f34723c0 = 0;
        ArrayList arrayList = this.f34730i0;
        arrayList.clear();
        this.N = 0;
        this.P = 1;
        int i10 = 3;
        this.f34729h0 = 3;
        this.O = 2;
        int i11 = this.f34731j0;
        if (i11 == 0 && (this.h >= 0 || this.f34735r != null || this.f34736s != null)) {
            this.S = 3;
            this.f34729h0 = 5;
            this.T = 4;
        }
        if (i11 == 1) {
            l7Var = np0Var.f36557c;
        } else {
            l7Var = l7Var2;
        }
        if ((i11 == 0 || i11 == 1) && l7Var != null) {
            ArrayList arrayList2 = l7Var.f12756l;
            int i12 = this.f34729h0;
            this.f34729h0 = i12 + 1;
            this.f34725e0 = i12;
            if (this.H == null) {
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) arrayList2.get(i13)).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        arrayList.add((TL_stars.TL_starGiftUnique) starGift);
                    }
                }
                int i14 = this.f34729h0;
                this.V = i14;
                this.f34729h0 = arrayList.size() + i14;
                int size = arrayList.size() + this.f34723c0;
                this.f34723c0 = size;
                int i15 = this.f34729h0;
                this.W = i15;
                if (!l7Var2.f12753i && l7Var2.f12754j) {
                    if (arrayList.isEmpty()) {
                        int i16 = this.f34729h0;
                        this.f34728g0 = i16;
                        this.f34729h0 = i16 + 2;
                        this.f34727f0 = i16 + 1;
                    }
                } else {
                    this.f34719a0 = i15;
                    int i17 = 3 - (size % 3);
                    if (size <= 0) {
                        i10 = 9;
                    } else if (i17 > 0) {
                        i10 = i17;
                    }
                    int i18 = i15 + i10;
                    this.f34729h0 = i18;
                    this.f34723c0 = size + i10;
                    this.f34721b0 = i18;
                }
                if (c()) {
                    l7Var.a();
                }
            } else if (this.G != null) {
                long clientUserId = UserConfig.getInstance(np0.u0(np0Var)).getClientUserId();
                for (int i19 = 0; i19 < this.G.d.size(); i19++) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.G.d.get(i19);
                    if (DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id) != clientUserId && DialogObject.getPeerDialogId(tL_starGiftUnique.host_id) != clientUserId) {
                        arrayList.add(tL_starGiftUnique);
                    }
                }
                int i20 = this.f34729h0;
                this.V = i20;
                this.f34729h0 = arrayList.size() + i20;
                int size2 = arrayList.size() + this.f34723c0;
                this.f34723c0 = size2;
                int i21 = this.f34729h0;
                this.W = i21;
                kh.a5 a5Var = this.G;
                if (a5Var.f10596t || !a5Var.f10597u) {
                    this.f34719a0 = i21;
                    int i22 = 3 - (size2 % 3);
                    if (size2 <= 0) {
                        i10 = 9;
                    } else if (i22 > 0) {
                        i10 = i22;
                    }
                    int i23 = i21 + i10;
                    this.f34729h0 = i23;
                    this.f34723c0 = size2 + i10;
                    this.f34721b0 = i23;
                }
                if (c()) {
                    this.G.g(false);
                }
            }
            int i24 = this.f34729h0;
            this.f34729h0 = i24 + 1;
            this.f34724d0 = i24;
        }
        int i25 = this.f34729h0;
        this.f34729h0 = i25 + 1;
        this.R = i25;
        mp0 mp0Var = this.B;
        if (mp0Var != null) {
            mp0Var.post(new xo0(this, 1));
        }
    }

    public final void l(mp0 mp0Var) {
        int i10;
        int i11 = org.telegram.ui.ActionBar.j6.f19881d6;
        np0 np0Var = this.m0;
        int themedColor = np0Var.getThemedColor(i11);
        np0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19827a7);
        int themedColor2 = np0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f20273z6);
        int themedColor3 = np0Var.getThemedColor(org.telegram.ui.ActionBar.j6.G6);
        mp0Var.v.setColor(themedColor);
        mp0Var.f36157x = org.telegram.ui.ActionBar.j6.l1(0.06f, themedColor3);
        mp0Var.f36158y = themedColor2;
        mp0Var.B = themedColor3;
        lh.e1 e1Var = mp0Var.f36149a;
        for (int i12 = 0; i12 < e1Var.getChildCount(); i12++) {
            View childAt = e1Var.getChildAt(i12);
            int R = RecyclerView.R(childAt);
            if (R != -1 && (childAt instanceof TextView)) {
                TextView textView = (TextView) childAt;
                if (R == mp0Var.d) {
                    i10 = mp0Var.B;
                } else {
                    i10 = mp0Var.f36158y;
                }
                textView.setTextColor(i10);
                childAt.invalidate();
            }
        }
        e1Var.invalidate();
        mp0Var.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = this.f34731j0;
        View view = this.f34737w;
        yo0 yo0Var = this.f34720b;
        if (i12 == 1) {
            super.onMeasure(i10, i11);
            cp0 cp0Var = this.v;
            this.f34732k0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + cp0Var.getMeasuredHeight() + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) cp0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) yo0Var.getLayoutParams()).topMargin = this.f34732k0 - AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.f34732k0 - AndroidUtilities.dp(64.0f);
            ((ViewGroup.MarginLayoutParams) this.f34738x.getLayoutParams()).topMargin = this.f34732k0 - AndroidUtilities.dp(16.0f);
            yo0Var.setPadding(yo0Var.getPaddingLeft(), AndroidUtilities.dp(16.0f), yo0Var.getPaddingRight(), yo0Var.getPaddingBottom());
        } else {
            this.f34732k0 = AndroidUtilities.dp(230.0f) + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) yo0Var.getLayoutParams()).topMargin = this.f34732k0;
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.f34732k0 - AndroidUtilities.dp(64.0f);
            ((ViewGroup.MarginLayoutParams) this.f34718a.getLayoutParams()).height = this.f34732k0;
        }
        super.onMeasure(i10, i11);
    }
}
