package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public class bd extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public TLRPC.WallPaper B;
    public TLRPC.WallPaper C;
    public TLRPC.WallPaper D;
    public Drawable E;
    public SpannableStringBuilder F;
    public boolean G;
    public org.telegram.ui.Components.hj0 H;
    public org.telegram.ui.ActionBar.w0 I;
    public org.telegram.ui.Components.sl0 J;
    public mc K;
    public FrameLayout L;
    public qh.d M;
    public ic N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public final long f35436a;
    public int f35437a0;
    public int f35438b;
    public int f35439b0;
    public TL_stories.TL_premium_boostsStatus f35440c;
    public int f35441c0;
    public boolean d;
    public int f35442d0;
    public int f35443e;
    public int f35444e0;
    public int f35445f;
    public int f35446f0;
    public int f35447g0;
    public long h;
    public int f35448h0;
    public org.telegram.ui.ActionBar.p2 f35449i0;
    public jc f35450j0;
    public float f35451k0;
    public ValueAnimator f35452l0;
    public boolean m0;
    public long f35453n;
    public org.telegram.ui.ActionBar.g6 f35454n0;
    public final SparseIntArray f35455o0;
    public final org.telegram.ui.ActionBar.h5 f35456p0;
    public final org.telegram.ui.ActionBar.h5 f35457q0;
    public int f35458r;
    public final org.telegram.ui.ActionBar.h5 f35459r0;
    public int f35460s;
    public final org.telegram.ui.ActionBar.h5 f35461s0;
    public final Drawable f35462t0;
    public final Drawable f35463u0;
    public long v;
    public final Paint f35464v0;
    public long f35465w;
    public TLRPC.EmojiStatus f35466x;
    public TLRPC.EmojiStatus f35467y;

    public bd(long j10) {
        super(null);
        boolean q10 = org.telegram.ui.ActionBar.k6.I.q();
        this.G = q10;
        this.O = 0;
        this.m0 = q10;
        this.f35455o0 = new SparseIntArray();
        Paint paint = new Paint(1);
        this.f35464v0 = paint;
        paint.setStrokeWidth(1.0f);
        paint.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21662d7, this.resourceProvider));
        this.f35462t0 = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_check_s).mutate();
        this.f35463u0 = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_halfcheck).mutate();
        this.f35436a = j10;
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j10));
        if (chat != null) {
            this.f35438b = chat.level;
        }
        MessagesController.getInstance(this.currentAccount).getBoostsController().getBoostsStats(j10, new oh.a2(1, this, chat));
        this.resourceProvider = new ad(this);
        this.f35456p0 = new org.telegram.ui.ActionBar.h5(0, false, false, this.resourceProvider);
        this.f35457q0 = new org.telegram.ui.ActionBar.h5(0, false, true, this.resourceProvider);
        this.f35459r0 = new org.telegram.ui.ActionBar.h5(0, true, false, this.resourceProvider);
        this.f35461s0 = new org.telegram.ui.ActionBar.h5(0, true, true, this.resourceProvider);
    }

    public static void U(bd bdVar) {
        org.telegram.ui.ActionBar.g6 g6Var = bdVar.resourceProvider;
        if (g6Var instanceof ad) {
            bd bdVar2 = ((ad) g6Var).f35142a;
            bdVar2.G = !bdVar2.G;
            bdVar2.d1();
            bdVar2.Z0(false);
        } else {
            bdVar.G = !bdVar.G;
            bdVar.d1();
        }
        bdVar.U0(bdVar.G, true);
        bdVar.Z0(false);
    }

    public static void V(org.telegram.ui.bd r22, org.telegram.tgnet.TLRPC.ChatFull r23, android.view.View r24, int r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bd.V(org.telegram.ui.bd, org.telegram.tgnet.TLRPC$ChatFull, android.view.View, int):void");
    }

    public static void W(org.telegram.ui.bd r13, org.telegram.messenger.ChannelBoostsController.CanApplyBoost r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bd.W(org.telegram.ui.bd, org.telegram.messenger.ChannelBoostsController$CanApplyBoost):void");
    }

    public static void Y0(View view) {
        int i10;
        if (view instanceof nc) {
            nc ncVar = (nc) view;
            ncVar.f39288a.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, ncVar.d));
        } else if (view instanceof org.telegram.ui.Cells.o8) {
            ((org.telegram.ui.Cells.o8) view).v();
        } else if (view instanceof rc) {
            rc rcVar = (rc) view;
            AndroidUtilities.forEachViews((RecyclerView) rcVar.f40810b, (h5.d) new oh.a2(2, rcVar, MessagesController.getInstance(rcVar.d).peerColors));
        } else if (view instanceof zc) {
            zc zcVar = (zc) view;
            ArrayList arrayList = zcVar.f43893c;
            org.telegram.ui.ActionBar.g6 g6Var = zcVar.f43892b;
            if (g6Var != null) {
                i10 = g6Var.a();
            } else {
                i10 = org.telegram.ui.ActionBar.k6.I.q();
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((org.telegram.ui.Components.lp) arrayList.get(i11)).f28821c = i10;
            }
            AndroidUtilities.forEachViews((RecyclerView) zcVar.d, (h5.d) new uc(zcVar, 0));
            zcVar.h.l();
        }
    }

    public int A0() {
        return 0;
    }

    public int B0() {
        return 0;
    }

    public final TLRPC.Document C0(TLRPC.StickerSet stickerSet) {
        if (stickerSet != null && stickerSet.thumb_document_id == 0) {
            TLRPC.TL_messages_stickerSet groupStickerSetById = getMediaDataController().getGroupStickerSetById(stickerSet);
            if (!groupStickerSetById.documents.isEmpty()) {
                return groupStickerSetById.documents.get(0);
            }
        }
        return null;
    }

    public final long D0(TLRPC.StickerSet stickerSet) {
        if (stickerSet == null) {
            return 0L;
        }
        long j10 = stickerSet.thumb_document_id;
        if (j10 == 0) {
            TLRPC.TL_messages_stickerSet groupStickerSetById = getMediaDataController().getGroupStickerSetById(stickerSet);
            if (!groupStickerSetById.documents.isEmpty()) {
                return groupStickerSetById.documents.get(0).f20851id;
            }
        }
        return j10;
    }

    public int E0() {
        return R.string.ChannelEmojiStatusInfo;
    }

    public int F0() {
        return getMessagesController().channelEmojiStatusLevelMin;
    }

    public int G0() {
        return R.string.ChannelEmojiStatus;
    }

    public int H0() {
        return 0;
    }

    public int I0() {
        return 3;
    }

    public int J0() {
        return getMessagesController().channelProfileIconLevelMin;
    }

    public int K0() {
        return R.string.ChannelProfileInfo;
    }

    public int L0() {
        return 0;
    }

    public int M0() {
        return 0;
    }

    public int N0() {
        return R.string.ChannelWallpaper2Info;
    }

    public int O0() {
        return getMessagesController().channelWallpaperLevelMin;
    }

    public int P0() {
        return R.string.ChannelWallpaper;
    }

    public final boolean Q0() {
        if (this.f35443e == this.f35445f && this.h == this.f35453n && this.f35458r == this.f35460s && this.v == this.f35465w && DialogObject.emojiStatusesEqual(this.f35466x, this.f35467y) && ChatThemeController.wallpaperEquals(this.B, this.C)) {
            return false;
        }
        return true;
    }

    public boolean R0() {
        return false;
    }

    public final int S0() {
        MessagesController.PeerColor color;
        MessagesController.PeerColor peerColor = null;
        int i10 = 0;
        if (this.f35443e != this.f35445f) {
            MessagesController.PeerColors peerColors = getMessagesController().peerColors;
            if (peerColors == null) {
                color = null;
            } else {
                color = peerColors.getColor(this.f35445f);
            }
            if (color != null) {
                i10 = Math.max(0, color.getLvl(this.d));
            }
        }
        if (this.h != this.f35453n) {
            i10 = Math.max(i10, getMessagesController().channelBgIconLevelMin);
        }
        if (this.f35458r != this.f35460s) {
            MessagesController.PeerColors peerColors2 = getMessagesController().profilePeerColors;
            if (peerColors2 != null) {
                peerColor = peerColors2.getColor(this.f35460s);
            }
            if (peerColor != null) {
                i10 = Math.max(i10, peerColor.getLvl(this.d));
            }
        }
        if (this.v != this.f35465w) {
            i10 = Math.max(i10, J0());
        }
        if (!DialogObject.emojiStatusesEqual(this.f35466x, this.f35467y)) {
            i10 = Math.max(i10, F0());
        }
        if (!ChatThemeController.wallpaperEquals(this.B, this.C)) {
            return Math.max(i10, O0());
        }
        return i10;
    }

    public final void U0(boolean z4, boolean z10) {
        int i10;
        if (this.m0 != z4) {
            this.m0 = z4;
            int i11 = 0;
            if (z10) {
                org.telegram.ui.Components.hj0 hj0Var = this.H;
                if (z4) {
                    i11 = hj0Var.f27524e[0];
                }
                hj0Var.N(i11);
                org.telegram.ui.Components.hj0 hj0Var2 = this.H;
                if (hj0Var2 != null) {
                    hj0Var2.start();
                    return;
                }
                return;
            }
            if (z4) {
                i10 = this.H.f27524e[0] - 1;
            } else {
                i10 = 0;
            }
            this.H.L(i10, false, true);
            this.H.N(i10);
            org.telegram.ui.ActionBar.w0 w0Var = this.I;
            if (w0Var != null) {
                w0Var.invalidate();
            }
        }
    }

    public final void V0() {
        if (getVisibleDialog() != null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
        alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.ChannelColorUnsaved);
        alertDialog$Builder.f21168a.Q = LocaleController.getString(R.string.ChannelColorUnsavedMessage);
        alertDialog$Builder.h(LocaleController.getString(R.string.Dismiss), new org.telegram.ui.ActionBar.c2(this) {
            public final bd f36761b;

            {
                this.f36761b = this;
            }

            @Override
            public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
                switch (r2) {
                    case 0:
                        this.f36761b.finishFragment();
                        return;
                    default:
                        this.f36761b.w0();
                        return;
                }
            }
        });
        alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new org.telegram.ui.ActionBar.c2(this) {
            public final bd f36761b;

            {
                this.f36761b = this;
            }

            @Override
            public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
                switch (r2) {
                    case 0:
                        this.f36761b.finishFragment();
                        return;
                    default:
                        this.f36761b.w0();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
        showDialog(d2Var);
        ((TextView) d2Var.d(-2)).setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21897q7));
    }

    public final void W0(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        if (tL_premium_boostsStatus != null) {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.f35436a));
            this.f35440c = tL_premium_boostsStatus;
            int i10 = tL_premium_boostsStatus.level;
            this.f35438b = i10;
            if (chat != null) {
                chat.level = i10;
            }
            mc mcVar = this.K;
            if (mcVar != null) {
                mcVar.l();
            }
            X0(true);
        }
    }

    public void X0(boolean z4) {
        if (this.M != null && this.f35440c != null) {
            int S0 = S0();
            if (this.f35438b >= S0) {
                this.M.f(null, z4);
                return;
            }
            if (this.F == null) {
                this.F = new SpannableStringBuilder("l");
                org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(R.drawable.mini_switch_lock, 0);
                oqVar.setTopOffset(1);
                this.F.setSpan(oqVar, 0, 1, 33);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.F).append((CharSequence) LocaleController.formatPluralString("BoostLevelRequired", S0, new Object[0]));
            this.M.f(spannableStringBuilder, z4);
        }
    }

    public void Z0(boolean z4) {
        int themedColor;
        this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21932s8));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = -1;
        if (this.d && this.f35460s != -1) {
            themedColor = -1;
        } else {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.A8);
        }
        kVar.setTitleColor(themedColor);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        if (!this.d || this.f35460s == -1) {
            i10 = getThemedColor(org.telegram.ui.ActionBar.k6.f21983v8);
        }
        kVar2.C(i10, false);
        this.actionBar.B(getThemedColor(org.telegram.ui.ActionBar.k6.f21948t8), false);
        if (!z4) {
            org.telegram.ui.Components.sl0 sl0Var = this.J;
            int i11 = org.telegram.ui.ActionBar.k6.f21607a7;
            sl0Var.setBackgroundColor(getThemedColor(i11));
            this.K.l();
            AndroidUtilities.forEachViews((RecyclerView) this.J, (h5.d) new ag.d(this));
            this.L.setBackgroundColor(getThemedColor(i11));
            this.M.j();
            setNavigationBarColor(getNavigationBarColor());
        }
    }

    public final void a1(boolean z4) {
        MessageObject messageObject;
        View y02 = y0(this.P);
        View y03 = y0(this.Q);
        View y04 = y0(this.R);
        View y05 = y0(this.T);
        if (y02 instanceof org.telegram.ui.Cells.ea) {
            org.telegram.ui.Cells.ea eaVar = (org.telegram.ui.Cells.ea) y02;
            org.telegram.ui.Cells.t1[] cells = eaVar.getCells();
            for (int i10 = 0; i10 < cells.length; i10++) {
                org.telegram.ui.Cells.t1 t1Var = cells[i10];
                if (t1Var != null && (messageObject = t1Var.getMessageObject()) != null) {
                    messageObject.overrideLinkColor = this.f35445f;
                    messageObject.overrideLinkEmoji = this.f35453n;
                    cells[i10].setAvatar(messageObject);
                    cells[i10].invalidate();
                }
            }
            Drawable f10 = qh.i5.f(this.E, this.currentAccount, this.C, this.G);
            this.E = f10;
            eaVar.setOverrideBackground(f10);
        }
        if (y03 instanceof kp0) {
            ((kp0) y03).a(this.f35445f, z4);
        } else if (y03 instanceof rc) {
            ((rc) y03).a(this.f35445f, z4);
        }
        if (y04 instanceof nc) {
            nc ncVar = (nc) y04;
            ncVar.a(this.currentAccount, this.f35445f, true);
            ncVar.c(this.f35453n, false, z4);
        }
        if (y05 instanceof zc) {
            zc zcVar = (zc) y05;
            String wallpaperEmoticon = ChatThemeController.getWallpaperEmoticon(this.C);
            if (wallpaperEmoticon == null && this.C == null && this.D != null) {
                wallpaperEmoticon = "❌";
            }
            zcVar.a(wallpaperEmoticon, z4);
            zcVar.setGalleryWallpaper(this.D);
        }
    }

    public final void b1() {
        TLRPC.StickerSet stickerSet;
        TLRPC.StickerSet stickerSet2;
        View y02 = y0(this.W);
        View y03 = y0(this.Y);
        View y04 = y0(this.Z);
        View y05 = y0(this.f35441c0);
        View y06 = y0(this.f35444e0);
        View y07 = y0(this.f35447g0);
        if (y02 instanceof tc) {
            TLRPC.EmojiStatus emojiStatus = this.f35467y;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                tc tcVar = (tc) y02;
                sc scVar = tcVar.f41503b;
                MessagesController.PeerColor fromCollectible = MessagesController.PeerColor.fromCollectible(emojiStatus);
                scVar.c(fromCollectible, true);
                tcVar.f41502a.c(fromCollectible, true);
                scVar.d(((TLRPC.TL_emojiStatusCollectible) this.f35467y).pattern_document_id, true, true);
            } else {
                tc tcVar2 = (tc) y02;
                sc scVar2 = tcVar2.f41503b;
                int i10 = this.f35460s;
                scVar2.b(i10, true);
                tcVar2.f41502a.b(tcVar2.h.currentAccount, i10, true);
                scVar2.d(this.f35465w, false, true);
            }
            tc tcVar3 = (tc) y02;
            sc scVar3 = tcVar3.f41503b;
            scVar3.e(DialogObject.getEmojiStatusDocumentId(this.f35467y), false, true);
            scVar3.a(this.f35445f);
            tcVar3.e();
        }
        if (y03 instanceof kp0) {
            ((kp0) y03).a(this.f35460s, true);
        } else if (y03 instanceof rc) {
            ((rc) y03).a(this.f35445f, true);
        }
        if (y04 instanceof nc) {
            nc ncVar = (nc) y04;
            ncVar.a(this.currentAccount, this.f35460s, false);
            ncVar.c(this.f35465w, false, true);
        }
        if (y05 instanceof nc) {
            TLRPC.EmojiStatus emojiStatus2 = this.f35467y;
            if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                ((nc) y05).b(MessagesController.PeerColor.fromCollectible(emojiStatus2));
            } else {
                ((nc) y05).a(this.currentAccount, this.f35460s, false);
            }
            ((nc) y05).c(DialogObject.getEmojiStatusDocumentId(this.f35467y), DialogObject.isEmojiStatusCollectible(this.f35467y), true);
        }
        boolean z4 = y06 instanceof nc;
        long j10 = this.f35436a;
        if (z4) {
            nc ncVar2 = (nc) y06;
            ncVar2.a(this.currentAccount, this.f35460s, false);
            TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-j10);
            if (chatFull != null && (stickerSet2 = chatFull.emojiset) != null) {
                ncVar2.c(D0(stickerSet2), false, false);
            } else {
                ncVar2.c(0L, false, false);
            }
        }
        if (y07 instanceof nc) {
            TLRPC.ChatFull chatFull2 = getMessagesController().getChatFull(-j10);
            if (chatFull2 != null && (stickerSet = chatFull2.stickerset) != null) {
                ((nc) y07).d(C0(stickerSet));
            } else {
                ((nc) y07).c(0L, false, false);
            }
        }
        c1();
    }

    public void c1() {
        mc mcVar;
        mc mcVar2;
        boolean z4 = false;
        this.P = 0;
        int i10 = 1 + 1;
        this.Q = 1;
        this.R = i10;
        this.S = i10 + 1;
        this.T = i10 + 2;
        this.U = i10 + 3;
        this.V = i10 + 4;
        this.W = i10 + 5;
        this.Y = i10 + 6;
        int i11 = i10 + 8;
        this.O = i11;
        this.Z = i10 + 7;
        if (this.f35465w == 0 && this.f35460s < 0 && !(this.f35467y instanceof TLRPC.TL_emojiStatusCollectible)) {
            int i12 = this.f35439b0;
            this.f35439b0 = -1;
            if (i12 >= 0 && (mcVar2 = this.K) != null) {
                mcVar2.u(i12);
                this.K.m(this.Z);
            }
        } else {
            if (this.f35439b0 >= 0) {
                z4 = true;
            }
            this.O = i10 + 9;
            this.f35439b0 = i11;
            if (!z4 && (mcVar = this.K) != null) {
                mcVar.o(i11);
                this.K.m(this.Z);
            }
        }
        int i13 = this.O;
        this.f35437a0 = i13;
        this.f35441c0 = i13 + 1;
        this.O = i13 + 3;
        this.f35442d0 = i13 + 2;
    }

    @Override
    public View createView(Context context) {
        MessagesController messagesController = getMessagesController();
        long j10 = -this.f35436a;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        if (chat != null) {
            int colorId = ChatObject.getColorId(chat);
            this.f35445f = colorId;
            this.f35443e = colorId;
            long emojiId = ChatObject.getEmojiId(chat);
            this.f35453n = emojiId;
            this.h = emojiId;
            int profileColorId = ChatObject.getProfileColorId(chat);
            this.f35460s = profileColorId;
            this.f35458r = profileColorId;
            long profileEmojiId = ChatObject.getProfileEmojiId(chat);
            this.f35465w = profileEmojiId;
            this.v = profileEmojiId;
            TLRPC.EmojiStatus emojiStatus = chat.emoji_status;
            this.f35467y = emojiStatus;
            this.f35466x = emojiStatus;
        }
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(j10);
        if (chatFull != null) {
            TLRPC.WallPaper wallPaper = chatFull.wallpaper;
            this.C = wallPaper;
            this.B = wallPaper;
            if (ChatThemeController.isNotEmoticonWallpaper(wallPaper)) {
                this.D = this.B;
            }
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.ChannelColorTitle2));
        this.actionBar.setActionBarMenuOnItemClick(new fg.l1(this, 16));
        org.telegram.ui.Components.hj0 hj0Var = new org.telegram.ui.Components.hj0(R.raw.sun, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.H = hj0Var;
        hj0Var.h = true;
        if (!this.G) {
            hj0Var.N(0);
            this.H.K(0);
        } else {
            hj0Var.K(35);
            this.H.N(36);
        }
        this.H.X = true;
        int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.J9, this.resourceProvider);
        this.H.O(v02, "Sunny");
        this.H.O(v02, "Path 6");
        this.H.O(v02, "Path");
        this.H.O(v02, "Path 5");
        this.I = this.actionBar.n().d(1, this.H);
        FrameLayout frameLayout = new FrameLayout(context);
        c1();
        x0();
        if (!this.d) {
            this.actionBar.setAdaptiveBackground(this.J);
        }
        org.telegram.ui.Components.sl0 sl0Var = this.J;
        mc mcVar = new mc(this);
        this.K = mcVar;
        sl0Var.setAdapter(mcVar);
        new f2.w(3);
        this.J.setLayoutManager(new f2.j0());
        org.telegram.ui.Components.sl0 sl0Var2 = this.J;
        int i10 = org.telegram.ui.ActionBar.k6.f21607a7;
        sl0Var2.setBackgroundColor(getThemedColor(i10));
        frameLayout.addView(this.J, k7.c6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 68.0f));
        this.J.setOnItemClickListener(new hg.v0(4, this, chatFull));
        f2.l lVar = new f2.l();
        lVar.n(350L);
        lVar.o(org.telegram.ui.Components.pr.h);
        lVar.C = false;
        lVar.f5910m = false;
        this.J.setItemAnimator(lVar);
        qh.d dVar = new qh.d(context, this.resourceProvider, true);
        dVar.setRoundRadius(24);
        this.M = dVar;
        dVar.g(LocaleController.getString(R.string.ApplyChanges), false, true);
        this.M.setOnClickListener(new a(this, 12));
        X0(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.L = frameLayout2;
        frameLayout2.setBackgroundColor(getThemedColor(i10));
        this.L.addView(this.M, k7.c6.d(-1, 48.0f, 80, 10.0f, 10.0f, 10.0f, 10.0f));
        frameLayout.addView(this.L, k7.c6.e(-1, 68, 80));
        setBulletinDelegate(new a9(this, 1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bd.d1():void");
    }

    @Override
    public void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.chatWasBoostedByUser;
        long j10 = this.f35436a;
        if (i10 == i12) {
            if (j10 == ((Long) objArr[2]).longValue()) {
                W0((TL_stories.TL_premium_boostsStatus) objArr[0]);
            }
        } else if (i10 == NotificationCenter.boostByChannelCreated) {
            if (!((Boolean) objArr[1]).booleanValue()) {
                getMessagesController().getBoostsController().getBoostsStats(j10, new ec(this, 1));
            }
        } else if (i10 == NotificationCenter.dialogDeleted && j10 == ((Long) objArr[0]).longValue()) {
            org.telegram.ui.ActionBar.f5 f5Var = this.parentLayout;
            if (f5Var != null && f5Var.getLastFragment() == this) {
                finishFragment();
            } else {
                removeSelfFromStack();
            }
        }
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (Q0() && this.f35438b >= S0()) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z4) {
        if (this.f35438b >= S0() && Q0()) {
            if (z4) {
                V0();
                return false;
            }
            return false;
        }
        return super.onBackPressed(z4);
    }

    @Override
    public boolean onFragmentCreate() {
        getMediaDataController().loadRestrictedStatusEmojis();
        getNotificationCenter().addObserver(this, NotificationCenter.boostByChannelCreated);
        getNotificationCenter().addObserver(this, NotificationCenter.chatWasBoostedByUser);
        getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
        return super.onFragmentCreate();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.boostByChannelCreated);
        getNotificationCenter().removeObserver(this, NotificationCenter.chatWasBoostedByUser);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }

    @Override
    public final void setResourceProvider(org.telegram.ui.ActionBar.g6 g6Var) {
        this.f35454n0 = g6Var;
    }

    public final void w0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bd.w0():void");
    }

    public void x0() {
        org.telegram.ui.Components.sl0 sl0Var = new org.telegram.ui.Components.sl0(getParentActivity(), this.resourceProvider);
        this.J = sl0Var;
        sl0Var.setSections(false);
    }

    public final View y0(int i10) {
        for (int i11 = 0; i11 < this.J.getChildCount(); i11++) {
            View childAt = this.J.getChildAt(i11);
            this.J.getClass();
            if (RecyclerView.R(childAt) == i10) {
                return childAt;
            }
        }
        return null;
    }

    public int z0() {
        return getMessagesController().channelCustomWallpaperLevelMin;
    }

    public void T0(int i10) {
    }
}
