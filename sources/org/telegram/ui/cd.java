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
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public class cd extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public TLRPC.WallPaper E;
    public TLRPC.WallPaper F;
    public TLRPC.WallPaper G;
    public Drawable H;
    public SpannableStringBuilder I;
    public boolean J;
    public org.telegram.ui.Components.kj0 K;
    public org.telegram.ui.ActionBar.v0 L;
    public org.telegram.ui.Components.zl0 M;
    public oc N;
    public FrameLayout O;
    public ci.d P;
    public lc Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public final long f35409a;
    public int f35410a0;
    public int f35411b;
    public int f35412b0;
    public TL_stories.TL_premium_boostsStatus f35413c;
    public int f35414c0;
    public boolean d;
    public int f35415d0;
    public int f35416e;
    public int f35417e0;
    public int f35418f;
    public int f35419f0;
    public int f35420g0;
    public long h;
    public int f35421h0;
    public int f35422i0;
    public int f35423j0;
    public int f35424k0;
    public org.telegram.ui.ActionBar.n2 f35425l0;
    public mc m0;
    public long f35426n;
    public float f35427n0;
    public ValueAnimator f35428o0;
    public boolean f35429p0;
    public org.telegram.ui.ActionBar.d6 f35430q0;
    public int f35431r;
    public final SparseIntArray f35432r0;
    public int f35433s;
    public final org.telegram.ui.ActionBar.e5 f35434s0;
    public final org.telegram.ui.ActionBar.e5 f35435t0;
    public final org.telegram.ui.ActionBar.e5 f35436u0;
    public long v;
    public final org.telegram.ui.ActionBar.e5 f35437v0;
    public long f35438w;
    public final Drawable f35439w0;
    public TLRPC.EmojiStatus f35440x;
    public final Drawable f35441x0;
    public TLRPC.EmojiStatus f35442y;
    public final Paint f35443y0;

    public cd(long j3) {
        super(null);
        boolean q6 = org.telegram.ui.ActionBar.i6.I.q();
        this.J = q6;
        this.R = 0;
        this.f35429p0 = q6;
        this.f35432r0 = new SparseIntArray();
        Paint paint = new Paint(1);
        this.f35443y0 = paint;
        paint.setStrokeWidth(1.0f);
        paint.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20819d7, this.resourceProvider));
        this.f35439w0 = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_check_s).mutate();
        this.f35441x0 = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_halfcheck).mutate();
        this.f35409a = j3;
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j3));
        if (chat != null) {
            this.f35411b = chat.level;
        }
        MessagesController.getInstance(this.currentAccount).getBoostsController().getBoostsStats(j3, new yh.q6(1, this, chat));
        this.resourceProvider = new bd(this);
        this.f35434s0 = new org.telegram.ui.ActionBar.e5(0, false, false, this.resourceProvider);
        this.f35435t0 = new org.telegram.ui.ActionBar.e5(0, false, true, this.resourceProvider);
        this.f35436u0 = new org.telegram.ui.ActionBar.e5(0, true, false, this.resourceProvider);
        this.f35437v0 = new org.telegram.ui.ActionBar.e5(0, true, true, this.resourceProvider);
    }

    public static void S(cd cdVar) {
        org.telegram.ui.ActionBar.d6 d6Var = cdVar.resourceProvider;
        if (d6Var instanceof bd) {
            cd cdVar2 = ((bd) d6Var).f35060a;
            cdVar2.J = !cdVar2.J;
            cdVar2.d1();
            cdVar2.Z0(false);
        } else {
            cdVar.J = !cdVar.J;
            cdVar.d1();
        }
        cdVar.U0(cdVar.J, true);
        cdVar.Z0(false);
    }

    public static void T(org.telegram.ui.cd r13, org.telegram.messenger.ChannelBoostsController.CanApplyBoost r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cd.T(org.telegram.ui.cd, org.telegram.messenger.ChannelBoostsController$CanApplyBoost):void");
    }

    public static void U(org.telegram.ui.cd r22, org.telegram.tgnet.TLRPC.ChatFull r23, android.view.View r24, int r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cd.U(org.telegram.ui.cd, org.telegram.tgnet.TLRPC$ChatFull, android.view.View, int):void");
    }

    public static void Y0(View view) {
        int i10;
        if (view instanceof pc) {
            pc pcVar = (pc) view;
            pcVar.f39441a.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, pcVar.d));
        } else if (view instanceof org.telegram.ui.Cells.r8) {
            ((org.telegram.ui.Cells.r8) view).v();
        } else if (view instanceof tc) {
            tc tcVar = (tc) view;
            AndroidUtilities.forEachViews((RecyclerView) tcVar.f40784b, (Utilities.Callback<View>) new qc(0, tcVar, MessagesController.getInstance(tcVar.d).peerColors));
        } else if (view instanceof ad) {
            ad adVar = (ad) view;
            ArrayList arrayList = adVar.f34781c;
            org.telegram.ui.ActionBar.d6 d6Var = adVar.f34780b;
            if (d6Var != null) {
                i10 = d6Var.a();
            } else {
                i10 = org.telegram.ui.ActionBar.i6.I.q();
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((org.telegram.ui.Components.op) arrayList.get(i11)).f29425c = i10;
            }
            AndroidUtilities.forEachViews((RecyclerView) adVar.d, (Utilities.Callback<View>) new wc(adVar, 0));
            adVar.h.l();
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
        long j3 = stickerSet.thumb_document_id;
        if (j3 == 0) {
            TLRPC.TL_messages_stickerSet groupStickerSetById = getMediaDataController().getGroupStickerSetById(stickerSet);
            if (!groupStickerSetById.documents.isEmpty()) {
                return groupStickerSetById.documents.get(0).f20044id;
            }
        }
        return j3;
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
        if (this.f35416e == this.f35418f && this.h == this.f35426n && this.f35431r == this.f35433s && this.v == this.f35438w && DialogObject.emojiStatusesEqual(this.f35440x, this.f35442y) && ChatThemeController.wallpaperEquals(this.E, this.F)) {
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
        if (this.f35416e != this.f35418f) {
            MessagesController.PeerColors peerColors = getMessagesController().peerColors;
            if (peerColors == null) {
                color = null;
            } else {
                color = peerColors.getColor(this.f35418f);
            }
            if (color != null) {
                i10 = Math.max(0, color.getLvl(this.d));
            }
        }
        if (this.h != this.f35426n) {
            i10 = Math.max(i10, getMessagesController().channelBgIconLevelMin);
        }
        if (this.f35431r != this.f35433s) {
            MessagesController.PeerColors peerColors2 = getMessagesController().profilePeerColors;
            if (peerColors2 != null) {
                peerColor = peerColors2.getColor(this.f35433s);
            }
            if (peerColor != null) {
                i10 = Math.max(i10, peerColor.getLvl(this.d));
            }
        }
        if (this.v != this.f35438w) {
            i10 = Math.max(i10, J0());
        }
        if (!DialogObject.emojiStatusesEqual(this.f35440x, this.f35442y)) {
            i10 = Math.max(i10, F0());
        }
        if (!ChatThemeController.wallpaperEquals(this.E, this.F)) {
            return Math.max(i10, O0());
        }
        return i10;
    }

    public final void U0(boolean z10, boolean z11) {
        int i10;
        if (this.f35429p0 != z10) {
            this.f35429p0 = z10;
            int i11 = 0;
            if (z11) {
                org.telegram.ui.Components.kj0 kj0Var = this.K;
                if (z10) {
                    i11 = kj0Var.f28125e[0];
                }
                kj0Var.P(i11);
                org.telegram.ui.Components.kj0 kj0Var2 = this.K;
                if (kj0Var2 != null) {
                    kj0Var2.start();
                    return;
                }
                return;
            }
            if (z10) {
                i10 = this.K.f28125e[0] - 1;
            } else {
                i10 = 0;
            }
            this.K.N(i10, false, true);
            this.K.P(i10);
            org.telegram.ui.ActionBar.v0 v0Var = this.L;
            if (v0Var != null) {
                v0Var.invalidate();
            }
        }
    }

    public final void V0() {
        if (getVisibleDialog() != null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
        alertDialog$Builder.f20368a.R = LocaleController.getString(R.string.ChannelColorUnsaved);
        alertDialog$Builder.f20368a.T = LocaleController.getString(R.string.ChannelColorUnsavedMessage);
        alertDialog$Builder.h(LocaleController.getString(R.string.Dismiss), new org.telegram.ui.ActionBar.a2(this) {
            public final cd f37389b;

            {
                this.f37389b = this;
            }

            @Override
            public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
                switch (r2) {
                    case 0:
                        this.f37389b.finishFragment();
                        return;
                    default:
                        this.f37389b.w0();
                        return;
                }
            }
        });
        alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new org.telegram.ui.ActionBar.a2(this) {
            public final cd f37389b;

            {
                this.f37389b = this;
            }

            @Override
            public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
                switch (r2) {
                    case 0:
                        this.f37389b.finishFragment();
                        return;
                    default:
                        this.f37389b.w0();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20368a;
        showDialog(b2Var);
        ((TextView) b2Var.d(-2)).setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.f21059q7));
    }

    public final void W0(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        if (tL_premium_boostsStatus != null) {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.f35409a));
            this.f35413c = tL_premium_boostsStatus;
            int i10 = tL_premium_boostsStatus.level;
            this.f35411b = i10;
            if (chat != null) {
                chat.level = i10;
            }
            oc ocVar = this.N;
            if (ocVar != null) {
                ocVar.l();
            }
            X0(true);
        }
    }

    public void X0(boolean z10) {
        if (this.P != null && this.f35413c != null) {
            int S0 = S0();
            if (this.f35411b >= S0) {
                this.P.f(null, z10);
                return;
            }
            if (this.I == null) {
                this.I = new SpannableStringBuilder("l");
                org.telegram.ui.Components.rq rqVar = new org.telegram.ui.Components.rq(R.drawable.mini_switch_lock, 0);
                rqVar.setTopOffset(1);
                this.I.setSpan(rqVar, 0, 1, 33);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.I).append((CharSequence) LocaleController.formatPluralString("BoostLevelRequired", S0, new Object[0]));
            this.P.f(spannableStringBuilder, z10);
        }
    }

    public void Z0(boolean z10) {
        int themedColor;
        this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.i6.f21100s8));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = -1;
        if (this.d && this.f35433s != -1) {
            themedColor = -1;
        } else {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.i6.A8);
        }
        kVar.setTitleColor(themedColor);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        if (!this.d || this.f35433s == -1) {
            i10 = getThemedColor(org.telegram.ui.ActionBar.i6.f21155v8);
        }
        kVar2.B(i10, false);
        this.actionBar.A(getThemedColor(org.telegram.ui.ActionBar.i6.f21119t8), false);
        if (!z10) {
            org.telegram.ui.Components.zl0 zl0Var = this.M;
            int i11 = org.telegram.ui.ActionBar.i6.f20762a7;
            zl0Var.setBackgroundColor(getThemedColor(i11));
            this.N.l();
            AndroidUtilities.forEachViews((RecyclerView) this.M, (Utilities.Callback<View>) new ai.i(this));
            this.O.setBackgroundColor(getThemedColor(i11));
            this.P.j();
            setNavigationBarColor(getNavigationBarColor());
        }
    }

    public final void a1(boolean z10) {
        MessageObject messageObject;
        View y02 = y0(this.S);
        View y03 = y0(this.T);
        View y04 = y0(this.U);
        View y05 = y0(this.W);
        if (y02 instanceof org.telegram.ui.Cells.ia) {
            org.telegram.ui.Cells.ia iaVar = (org.telegram.ui.Cells.ia) y02;
            org.telegram.ui.Cells.u1[] cells = iaVar.getCells();
            for (int i10 = 0; i10 < cells.length; i10++) {
                org.telegram.ui.Cells.u1 u1Var = cells[i10];
                if (u1Var != null && (messageObject = u1Var.getMessageObject()) != null) {
                    messageObject.overrideLinkColor = this.f35418f;
                    messageObject.overrideLinkEmoji = this.f35426n;
                    cells[i10].setAvatar(messageObject);
                    cells[i10].invalidate();
                }
            }
            Drawable f7 = ci.b7.f(this.H, this.currentAccount, this.F, this.J);
            this.H = f7;
            iaVar.setOverrideBackground(f7);
        }
        if (y03 instanceof tp0) {
            ((tp0) y03).a(this.f35418f, z10);
        } else if (y03 instanceof tc) {
            ((tc) y03).a(this.f35418f, z10);
        }
        if (y04 instanceof pc) {
            pc pcVar = (pc) y04;
            pcVar.a(this.currentAccount, this.f35418f, true);
            pcVar.c(this.f35426n, false, z10);
        }
        if (y05 instanceof ad) {
            ad adVar = (ad) y05;
            String wallpaperEmoticon = ChatThemeController.getWallpaperEmoticon(this.F);
            if (wallpaperEmoticon == null && this.F == null && this.G != null) {
                wallpaperEmoticon = "❌";
            }
            adVar.a(wallpaperEmoticon, z10);
            adVar.setGalleryWallpaper(this.G);
        }
    }

    public final void b1() {
        TLRPC.StickerSet stickerSet;
        TLRPC.StickerSet stickerSet2;
        View y02 = y0(this.Z);
        View y03 = y0(this.f35412b0);
        View y04 = y0(this.f35414c0);
        View y05 = y0(this.f35419f0);
        View y06 = y0(this.f35421h0);
        View y07 = y0(this.f35423j0);
        if (y02 instanceof vc) {
            TLRPC.EmojiStatus emojiStatus = this.f35442y;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                vc vcVar = (vc) y02;
                uc ucVar = vcVar.f41694b;
                MessagesController.PeerColor fromCollectible = MessagesController.PeerColor.fromCollectible(emojiStatus);
                ucVar.c(fromCollectible, true);
                vcVar.f41693a.c(fromCollectible, true);
                ucVar.d(((TLRPC.TL_emojiStatusCollectible) this.f35442y).pattern_document_id, true, true);
            } else {
                vc vcVar2 = (vc) y02;
                uc ucVar2 = vcVar2.f41694b;
                int i10 = this.f35433s;
                ucVar2.b(i10, true);
                vcVar2.f41693a.b(vcVar2.h.currentAccount, i10, true);
                ucVar2.d(this.f35438w, false, true);
            }
            vc vcVar3 = (vc) y02;
            uc ucVar3 = vcVar3.f41694b;
            ucVar3.e(DialogObject.getEmojiStatusDocumentId(this.f35442y), false, true);
            ucVar3.a(this.f35418f);
            vcVar3.e();
        }
        if (y03 instanceof tp0) {
            ((tp0) y03).a(this.f35433s, true);
        } else if (y03 instanceof tc) {
            ((tc) y03).a(this.f35418f, true);
        }
        if (y04 instanceof pc) {
            pc pcVar = (pc) y04;
            pcVar.a(this.currentAccount, this.f35433s, false);
            pcVar.c(this.f35438w, false, true);
        }
        if (y05 instanceof pc) {
            TLRPC.EmojiStatus emojiStatus2 = this.f35442y;
            if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                ((pc) y05).b(MessagesController.PeerColor.fromCollectible(emojiStatus2));
            } else {
                ((pc) y05).a(this.currentAccount, this.f35433s, false);
            }
            ((pc) y05).c(DialogObject.getEmojiStatusDocumentId(this.f35442y), DialogObject.isEmojiStatusCollectible(this.f35442y), true);
        }
        boolean z10 = y06 instanceof pc;
        long j3 = this.f35409a;
        if (z10) {
            pc pcVar2 = (pc) y06;
            pcVar2.a(this.currentAccount, this.f35433s, false);
            TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-j3);
            if (chatFull != null && (stickerSet2 = chatFull.emojiset) != null) {
                pcVar2.c(D0(stickerSet2), false, false);
            } else {
                pcVar2.c(0L, false, false);
            }
        }
        if (y07 instanceof pc) {
            TLRPC.ChatFull chatFull2 = getMessagesController().getChatFull(-j3);
            if (chatFull2 != null && (stickerSet = chatFull2.stickerset) != null) {
                ((pc) y07).d(C0(stickerSet));
            } else {
                ((pc) y07).c(0L, false, false);
            }
        }
        c1();
    }

    public void c1() {
        oc ocVar;
        oc ocVar2;
        boolean z10 = false;
        this.S = 0;
        int i10 = 1 + 1;
        this.T = 1;
        this.U = i10;
        this.V = i10 + 1;
        this.W = i10 + 2;
        this.X = i10 + 3;
        this.Y = i10 + 4;
        this.Z = i10 + 5;
        this.f35412b0 = i10 + 6;
        int i11 = i10 + 8;
        this.R = i11;
        this.f35414c0 = i10 + 7;
        if (this.f35438w == 0 && this.f35433s < 0 && !(this.f35442y instanceof TLRPC.TL_emojiStatusCollectible)) {
            int i12 = this.f35417e0;
            this.f35417e0 = -1;
            if (i12 >= 0 && (ocVar2 = this.N) != null) {
                ocVar2.u(i12);
                this.N.m(this.f35414c0);
            }
        } else {
            if (this.f35417e0 >= 0) {
                z10 = true;
            }
            this.R = i10 + 9;
            this.f35417e0 = i11;
            if (!z10 && (ocVar = this.N) != null) {
                ocVar.o(i11);
                this.N.m(this.f35414c0);
            }
        }
        int i13 = this.R;
        this.f35415d0 = i13;
        this.f35419f0 = i13 + 1;
        this.R = i13 + 3;
        this.f35420g0 = i13 + 2;
    }

    @Override
    public View createView(Context context) {
        MessagesController messagesController = getMessagesController();
        long j3 = -this.f35409a;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
        if (chat != null) {
            int colorId = ChatObject.getColorId(chat);
            this.f35418f = colorId;
            this.f35416e = colorId;
            long emojiId = ChatObject.getEmojiId(chat);
            this.f35426n = emojiId;
            this.h = emojiId;
            int profileColorId = ChatObject.getProfileColorId(chat);
            this.f35433s = profileColorId;
            this.f35431r = profileColorId;
            long profileEmojiId = ChatObject.getProfileEmojiId(chat);
            this.f35438w = profileEmojiId;
            this.v = profileEmojiId;
            TLRPC.EmojiStatus emojiStatus = chat.emoji_status;
            this.f35442y = emojiStatus;
            this.f35440x = emojiStatus;
        }
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(j3);
        if (chatFull != null) {
            TLRPC.WallPaper wallPaper = chatFull.wallpaper;
            this.F = wallPaper;
            this.E = wallPaper;
            if (ChatThemeController.isNotEmoticonWallpaper(wallPaper)) {
                this.G = this.E;
            }
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.ChannelColorTitle2));
        this.actionBar.setActionBarMenuOnItemClick(new ei.u(this, 29));
        org.telegram.ui.Components.kj0 kj0Var = new org.telegram.ui.Components.kj0(R.raw.sun, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.K = kj0Var;
        kj0Var.h = true;
        if (!this.J) {
            kj0Var.P(0);
            this.K.M(0);
        } else {
            kj0Var.M(35);
            this.K.P(36);
        }
        this.K.Z = true;
        int v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.J9, this.resourceProvider);
        this.K.Q(v02, "Sunny");
        this.K.Q(v02, "Path 6");
        this.K.Q(v02, "Path");
        this.K.Q(v02, "Path 5");
        this.L = this.actionBar.n().d(1, this.K);
        FrameLayout frameLayout = new FrameLayout(context);
        c1();
        x0();
        if (!this.d) {
            this.actionBar.setAdaptiveBackground(this.M);
        }
        org.telegram.ui.Components.zl0 zl0Var = this.M;
        oc ocVar = new oc(this);
        this.N = ocVar;
        zl0Var.setAdapter(ocVar);
        new s4.s(3);
        this.M.setLayoutManager(new s4.c0());
        org.telegram.ui.Components.zl0 zl0Var2 = this.M;
        int i10 = org.telegram.ui.ActionBar.i6.f20762a7;
        zl0Var2.setBackgroundColor(getThemedColor(i10));
        frameLayout.addView(this.M, w7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 68.0f));
        this.M.setOnItemClickListener(new ai.n6(4, this, chatFull));
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(org.telegram.ui.Components.tr.h);
        jVar.C = false;
        jVar.f46563m = false;
        this.M.setItemAnimator(jVar);
        ci.d dVar = new ci.d(context, this.resourceProvider, true);
        dVar.setRoundRadius(24);
        this.P = dVar;
        dVar.g(LocaleController.getString(R.string.ApplyChanges), false, true);
        this.P.setOnClickListener(new a(this, 12));
        X0(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.O = frameLayout2;
        frameLayout2.setBackgroundColor(getThemedColor(i10));
        this.O.addView(this.P, w7.z5.d(-1, 48.0f, 80, 10.0f, 10.0f, 10.0f, 10.0f));
        frameLayout.addView(this.O, w7.z5.e(-1, 68, 80));
        setBulletinDelegate(new b9(this, 1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cd.d1():void");
    }

    @Override
    public void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.chatWasBoostedByUser;
        long j3 = this.f35409a;
        if (i10 == i12) {
            if (j3 == ((Long) objArr[2]).longValue()) {
                W0((TL_stories.TL_premium_boostsStatus) objArr[0]);
            }
        } else if (i10 == NotificationCenter.boostByChannelCreated) {
            if (!((Boolean) objArr[1]).booleanValue()) {
                getMessagesController().getBoostsController().getBoostsStats(j3, new gc(this, 2));
            }
        } else if (i10 == NotificationCenter.dialogDeleted && j3 == ((Long) objArr[0]).longValue()) {
            org.telegram.ui.ActionBar.c5 c5Var = this.parentLayout;
            if (c5Var != null && c5Var.getLastFragment() == this) {
                finishFragment();
            } else {
                removeSelfFromStack();
            }
        }
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (Q0() && this.f35411b >= S0()) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.f35411b >= S0() && Q0()) {
            if (z10) {
                V0();
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
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
    public final void setResourceProvider(org.telegram.ui.ActionBar.d6 d6Var) {
        this.f35430q0 = d6Var;
    }

    public final void w0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cd.w0():void");
    }

    public void x0() {
        org.telegram.ui.Components.zl0 zl0Var = new org.telegram.ui.Components.zl0(getParentActivity(), this.resourceProvider);
        this.M = zl0Var;
        zl0Var.setSections(false);
    }

    public final View y0(int i10) {
        for (int i11 = 0; i11 < this.M.getChildCount(); i11++) {
            View childAt = this.M.getChildAt(i11);
            this.M.getClass();
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
