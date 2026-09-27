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
public class cd extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public TLRPC.WallPaper E;
    public TLRPC.WallPaper F;
    public TLRPC.WallPaper G;
    public Drawable H;
    public SpannableStringBuilder I;
    public boolean J;
    public org.telegram.ui.Components.kj0 K;
    public org.telegram.ui.ActionBar.w0 L;
    public org.telegram.ui.Components.yl0 M;
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
    public final long f32661a;
    public int f32662a0;
    public int f32663b;
    public int f32664b0;
    public TL_stories.TL_premium_boostsStatus f32665c;
    public int f32666c0;
    public boolean d;
    public int f32667d0;
    public int e;
    public int f32668e0;
    public int f32669f;
    public int f32670f0;
    public int f32671g0;
    public long h;
    public int f32672h0;
    public int f32673i0;
    public int f32674j0;
    public int f32675k0;
    public org.telegram.ui.ActionBar.o2 f32676l0;
    public mc m0;
    public long f32677n;
    public float f32678n0;
    public ValueAnimator f32679o0;
    public boolean f32680p0;
    public org.telegram.ui.ActionBar.e6 f32681q0;
    public int f32682r;
    public final SparseIntArray f32683r0;
    public int f32684s;
    public final org.telegram.ui.ActionBar.f5 f32685s0;
    public final org.telegram.ui.ActionBar.f5 f32686t0;
    public final org.telegram.ui.ActionBar.f5 f32687u0;
    public long v;
    public final org.telegram.ui.ActionBar.f5 f32688v0;
    public long f32689w;
    public final Drawable f32690w0;
    public TLRPC.EmojiStatus f32691x;
    public final Drawable f32692x0;
    public TLRPC.EmojiStatus f32693y;
    public final Paint f32694y0;

    public cd(long j3) {
        super(null);
        boolean q6 = org.telegram.ui.ActionBar.i6.I.q();
        this.J = q6;
        this.R = 0;
        this.f32680p0 = q6;
        this.f32683r0 = new SparseIntArray();
        Paint paint = new Paint(1);
        this.f32694y0 = paint;
        paint.setStrokeWidth(1.0f);
        paint.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19058d7, this.resourceProvider));
        this.f32690w0 = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_check_s).mutate();
        this.f32692x0 = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_halfcheck).mutate();
        this.f32661a = j3;
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j3));
        if (chat != null) {
            this.f32663b = chat.level;
        }
        MessagesController.getInstance(this.currentAccount).getBoostsController().getBoostsStats(j3, new yh.o6(1, this, chat));
        this.resourceProvider = new bd(this);
        this.f32685s0 = new org.telegram.ui.ActionBar.f5(0, false, false, this.resourceProvider);
        this.f32686t0 = new org.telegram.ui.ActionBar.f5(0, false, true, this.resourceProvider);
        this.f32687u0 = new org.telegram.ui.ActionBar.f5(0, true, false, this.resourceProvider);
        this.f32688v0 = new org.telegram.ui.ActionBar.f5(0, true, true, this.resourceProvider);
    }

    public static void U(cd cdVar) {
        org.telegram.ui.ActionBar.e6 e6Var = cdVar.resourceProvider;
        if (e6Var instanceof bd) {
            cd cdVar2 = ((bd) e6Var).f32336a;
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

    public static void V(org.telegram.ui.cd r13, org.telegram.messenger.ChannelBoostsController.CanApplyBoost r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cd.V(org.telegram.ui.cd, org.telegram.messenger.ChannelBoostsController$CanApplyBoost):void");
    }

    public static void W(org.telegram.ui.cd r22, org.telegram.tgnet.TLRPC.ChatFull r23, android.view.View r24, int r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cd.W(org.telegram.ui.cd, org.telegram.tgnet.TLRPC$ChatFull, android.view.View, int):void");
    }

    public static void Y0(View view) {
        int i10;
        if (view instanceof pc) {
            pc pcVar = (pc) view;
            pcVar.f36371a.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, pcVar.d));
        } else if (view instanceof org.telegram.ui.Cells.r8) {
            ((org.telegram.ui.Cells.r8) view).v();
        } else if (view instanceof tc) {
            tc tcVar = (tc) view;
            AndroidUtilities.forEachViews((RecyclerView) tcVar.f37752b, (Utilities.Callback<View>) new qc(0, tcVar, MessagesController.getInstance(tcVar.d).peerColors));
        } else if (view instanceof ad) {
            ad adVar = (ad) view;
            ArrayList arrayList = adVar.f32049c;
            org.telegram.ui.ActionBar.e6 e6Var = adVar.f32048b;
            if (e6Var != null) {
                i10 = e6Var.a();
            } else {
                i10 = org.telegram.ui.ActionBar.i6.I.q();
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((org.telegram.ui.Components.np) arrayList.get(i11)).f26879c = i10;
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
                return groupStickerSetById.documents.get(0).f18335id;
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
        if (this.e == this.f32669f && this.h == this.f32677n && this.f32682r == this.f32684s && this.v == this.f32689w && DialogObject.emojiStatusesEqual(this.f32691x, this.f32693y) && ChatThemeController.wallpaperEquals(this.E, this.F)) {
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
        if (this.e != this.f32669f) {
            MessagesController.PeerColors peerColors = getMessagesController().peerColors;
            if (peerColors == null) {
                color = null;
            } else {
                color = peerColors.getColor(this.f32669f);
            }
            if (color != null) {
                i10 = Math.max(0, color.getLvl(this.d));
            }
        }
        if (this.h != this.f32677n) {
            i10 = Math.max(i10, getMessagesController().channelBgIconLevelMin);
        }
        if (this.f32682r != this.f32684s) {
            MessagesController.PeerColors peerColors2 = getMessagesController().profilePeerColors;
            if (peerColors2 != null) {
                peerColor = peerColors2.getColor(this.f32684s);
            }
            if (peerColor != null) {
                i10 = Math.max(i10, peerColor.getLvl(this.d));
            }
        }
        if (this.v != this.f32689w) {
            i10 = Math.max(i10, J0());
        }
        if (!DialogObject.emojiStatusesEqual(this.f32691x, this.f32693y)) {
            i10 = Math.max(i10, F0());
        }
        if (!ChatThemeController.wallpaperEquals(this.E, this.F)) {
            return Math.max(i10, O0());
        }
        return i10;
    }

    public final void U0(boolean z10, boolean z11) {
        int i10;
        if (this.f32680p0 != z10) {
            this.f32680p0 = z10;
            int i11 = 0;
            if (z11) {
                org.telegram.ui.Components.kj0 kj0Var = this.K;
                if (z10) {
                    i11 = kj0Var.e[0];
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
                i10 = this.K.e[0] - 1;
            } else {
                i10 = 0;
            }
            this.K.N(i10, false, true);
            this.K.P(i10);
            org.telegram.ui.ActionBar.w0 w0Var = this.L;
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
        alertDialog$Builder.f18655a.R = LocaleController.getString(R.string.ChannelColorUnsaved);
        alertDialog$Builder.f18655a.T = LocaleController.getString(R.string.ChannelColorUnsavedMessage);
        alertDialog$Builder.h(LocaleController.getString(R.string.Dismiss), new org.telegram.ui.ActionBar.b2(this) {
            public final cd f34429b;

            {
                this.f34429b = this;
            }

            @Override
            public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
                switch (r2) {
                    case 0:
                        this.f34429b.finishFragment();
                        return;
                    default:
                        this.f34429b.w0();
                        return;
                }
            }
        });
        alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new org.telegram.ui.ActionBar.b2(this) {
            public final cd f34429b;

            {
                this.f34429b = this;
            }

            @Override
            public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
                switch (r2) {
                    case 0:
                        this.f34429b.finishFragment();
                        return;
                    default:
                        this.f34429b.w0();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18655a;
        showDialog(c2Var);
        ((TextView) c2Var.d(-2)).setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.f19297q7));
    }

    public final void W0(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        if (tL_premium_boostsStatus != null) {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.f32661a));
            this.f32665c = tL_premium_boostsStatus;
            int i10 = tL_premium_boostsStatus.level;
            this.f32663b = i10;
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
        if (this.P != null && this.f32665c != null) {
            int S0 = S0();
            if (this.f32663b >= S0) {
                this.P.f(null, z10);
                return;
            }
            if (this.I == null) {
                this.I = new SpannableStringBuilder("l");
                org.telegram.ui.Components.qq qqVar = new org.telegram.ui.Components.qq(R.drawable.mini_switch_lock, 0);
                qqVar.setTopOffset(1);
                this.I.setSpan(qqVar, 0, 1, 33);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.I).append((CharSequence) LocaleController.formatPluralString("BoostLevelRequired", S0, new Object[0]));
            this.P.f(spannableStringBuilder, z10);
        }
    }

    public void Z0(boolean z10) {
        int themedColor;
        this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.i6.f19337s8));
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = -1;
        if (this.d && this.f32684s != -1) {
            themedColor = -1;
        } else {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.i6.A8);
        }
        lVar.setTitleColor(themedColor);
        org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
        if (!this.d || this.f32684s == -1) {
            i10 = getThemedColor(org.telegram.ui.ActionBar.i6.f19392v8);
        }
        lVar2.E(i10, false);
        this.actionBar.B(getThemedColor(org.telegram.ui.ActionBar.i6.f19356t8), false);
        if (!z10) {
            org.telegram.ui.Components.yl0 yl0Var = this.M;
            int i11 = org.telegram.ui.ActionBar.i6.f19001a7;
            yl0Var.setBackgroundColor(getThemedColor(i11));
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
                    messageObject.overrideLinkColor = this.f32669f;
                    messageObject.overrideLinkEmoji = this.f32677n;
                    cells[i10].setAvatar(messageObject);
                    cells[i10].invalidate();
                }
            }
            Drawable f7 = ci.b7.f(this.H, this.currentAccount, this.F, this.J);
            this.H = f7;
            iaVar.setOverrideBackground(f7);
        }
        if (y03 instanceof tp0) {
            ((tp0) y03).a(this.f32669f, z10);
        } else if (y03 instanceof tc) {
            ((tc) y03).a(this.f32669f, z10);
        }
        if (y04 instanceof pc) {
            pc pcVar = (pc) y04;
            pcVar.a(this.currentAccount, this.f32669f, true);
            pcVar.c(this.f32677n, false, z10);
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
        View y03 = y0(this.f32664b0);
        View y04 = y0(this.f32666c0);
        View y05 = y0(this.f32670f0);
        View y06 = y0(this.f32672h0);
        View y07 = y0(this.f32674j0);
        if (y02 instanceof vc) {
            TLRPC.EmojiStatus emojiStatus = this.f32693y;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                vc vcVar = (vc) y02;
                uc ucVar = vcVar.f38545b;
                MessagesController.PeerColor fromCollectible = MessagesController.PeerColor.fromCollectible(emojiStatus);
                ucVar.c(fromCollectible, true);
                vcVar.f38544a.c(fromCollectible, true);
                ucVar.d(((TLRPC.TL_emojiStatusCollectible) this.f32693y).pattern_document_id, true, true);
            } else {
                vc vcVar2 = (vc) y02;
                uc ucVar2 = vcVar2.f38545b;
                int i10 = this.f32684s;
                ucVar2.b(i10, true);
                vcVar2.f38544a.b(vcVar2.h.currentAccount, i10, true);
                ucVar2.d(this.f32689w, false, true);
            }
            vc vcVar3 = (vc) y02;
            uc ucVar3 = vcVar3.f38545b;
            ucVar3.e(DialogObject.getEmojiStatusDocumentId(this.f32693y), false, true);
            ucVar3.a(this.f32669f);
            vcVar3.e();
        }
        if (y03 instanceof tp0) {
            ((tp0) y03).a(this.f32684s, true);
        } else if (y03 instanceof tc) {
            ((tc) y03).a(this.f32669f, true);
        }
        if (y04 instanceof pc) {
            pc pcVar = (pc) y04;
            pcVar.a(this.currentAccount, this.f32684s, false);
            pcVar.c(this.f32689w, false, true);
        }
        if (y05 instanceof pc) {
            TLRPC.EmojiStatus emojiStatus2 = this.f32693y;
            if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                ((pc) y05).b(MessagesController.PeerColor.fromCollectible(emojiStatus2));
            } else {
                ((pc) y05).a(this.currentAccount, this.f32684s, false);
            }
            ((pc) y05).c(DialogObject.getEmojiStatusDocumentId(this.f32693y), DialogObject.isEmojiStatusCollectible(this.f32693y), true);
        }
        boolean z10 = y06 instanceof pc;
        long j3 = this.f32661a;
        if (z10) {
            pc pcVar2 = (pc) y06;
            pcVar2.a(this.currentAccount, this.f32684s, false);
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
        this.f32664b0 = i10 + 6;
        int i11 = i10 + 8;
        this.R = i11;
        this.f32666c0 = i10 + 7;
        if (this.f32689w == 0 && this.f32684s < 0 && !(this.f32693y instanceof TLRPC.TL_emojiStatusCollectible)) {
            int i12 = this.f32668e0;
            this.f32668e0 = -1;
            if (i12 >= 0 && (ocVar2 = this.N) != null) {
                ocVar2.u(i12);
                this.N.m(this.f32666c0);
            }
        } else {
            if (this.f32668e0 >= 0) {
                z10 = true;
            }
            this.R = i10 + 9;
            this.f32668e0 = i11;
            if (!z10 && (ocVar = this.N) != null) {
                ocVar.o(i11);
                this.N.m(this.f32666c0);
            }
        }
        int i13 = this.R;
        this.f32667d0 = i13;
        this.f32670f0 = i13 + 1;
        this.R = i13 + 3;
        this.f32671g0 = i13 + 2;
    }

    @Override
    public View createView(Context context) {
        MessagesController messagesController = getMessagesController();
        long j3 = -this.f32661a;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
        if (chat != null) {
            int colorId = ChatObject.getColorId(chat);
            this.f32669f = colorId;
            this.e = colorId;
            long emojiId = ChatObject.getEmojiId(chat);
            this.f32677n = emojiId;
            this.h = emojiId;
            int profileColorId = ChatObject.getProfileColorId(chat);
            this.f32684s = profileColorId;
            this.f32682r = profileColorId;
            long profileEmojiId = ChatObject.getProfileEmojiId(chat);
            this.f32689w = profileEmojiId;
            this.v = profileEmojiId;
            TLRPC.EmojiStatus emojiStatus = chat.emoji_status;
            this.f32693y = emojiStatus;
            this.f32691x = emojiStatus;
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
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 29));
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
        this.L = this.actionBar.o().d(1, this.K);
        FrameLayout frameLayout = new FrameLayout(context);
        c1();
        x0();
        if (!this.d) {
            this.actionBar.setAdaptiveBackground(this.M);
        }
        org.telegram.ui.Components.yl0 yl0Var = this.M;
        oc ocVar = new oc(this);
        this.N = ocVar;
        yl0Var.setAdapter(ocVar);
        new s4.s(3);
        this.M.setLayoutManager(new s4.c0());
        org.telegram.ui.Components.yl0 yl0Var2 = this.M;
        int i10 = org.telegram.ui.ActionBar.i6.f19001a7;
        yl0Var2.setBackgroundColor(getThemedColor(i10));
        frameLayout.addView(this.M, w7.y5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 68.0f));
        this.M.setOnItemClickListener(new ai.n6(4, this, chatFull));
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(org.telegram.ui.Components.sr.h);
        jVar.C = false;
        jVar.f43040m = false;
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
        this.O.addView(this.P, w7.y5.d(-1, 48.0f, 80, 10.0f, 10.0f, 10.0f, 10.0f));
        frameLayout.addView(this.O, w7.y5.e(-1, 68, 80));
        setBulletinDelegate(new c9(this, 1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cd.d1():void");
    }

    @Override
    public void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.chatWasBoostedByUser;
        long j3 = this.f32661a;
        if (i10 == i12) {
            if (j3 == ((Long) objArr[2]).longValue()) {
                W0((TL_stories.TL_premium_boostsStatus) objArr[0]);
            }
        } else if (i10 == NotificationCenter.boostByChannelCreated) {
            if (!((Boolean) objArr[1]).booleanValue()) {
                getMessagesController().getBoostsController().getBoostsStats(j3, new gc(this, 2));
            }
        } else if (i10 == NotificationCenter.dialogDeleted && j3 == ((Long) objArr[0]).longValue()) {
            org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
            if (d5Var != null && d5Var.getLastFragment() == this) {
                finishFragment();
            } else {
                removeSelfFromStack();
            }
        }
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (Q0() && this.f32663b >= S0()) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.f32663b >= S0() && Q0()) {
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
    public final void setResourceProvider(org.telegram.ui.ActionBar.e6 e6Var) {
        this.f32681q0 = e6Var;
    }

    public final void w0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cd.w0():void");
    }

    public void x0() {
        org.telegram.ui.Components.yl0 yl0Var = new org.telegram.ui.Components.yl0(getParentActivity(), this.resourceProvider);
        this.M = yl0Var;
        yl0Var.setSections(false);
    }

    public final View y0(int i10) {
        for (int i11 = 0; i11 < this.M.getChildCount(); i11++) {
            View childAt = this.M.getChildAt(i11);
            this.M.getClass();
            if (RecyclerView.S(childAt) == i10) {
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
