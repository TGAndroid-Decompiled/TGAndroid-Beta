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
public class dd extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public TLRPC.WallPaper B;
    public TLRPC.WallPaper C;
    public TLRPC.WallPaper D;
    public Drawable E;
    public SpannableStringBuilder F;
    public boolean G;
    public org.telegram.ui.Components.gj0 H;
    public org.telegram.ui.ActionBar.w0 I;
    public org.telegram.ui.Components.rl0 J;
    public pc K;
    public FrameLayout L;
    public ph.d M;
    public lc N;
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
    public final long f33416a;
    public int f33417a0;
    public int f33418b;
    public int f33419b0;
    public TL_stories.TL_premium_boostsStatus f33420c;
    public int f33421c0;
    public boolean d;
    public int f33422d0;
    public int e;
    public int f33423e0;
    public int f33424f;
    public int f33425f0;
    public int f33426g0;
    public long h;
    public int f33427h0;
    public org.telegram.ui.ActionBar.p2 f33428i0;
    public mc f33429j0;
    public float f33430k0;
    public ValueAnimator f33431l0;
    public boolean m0;
    public long f33432n;
    public org.telegram.ui.ActionBar.f6 f33433n0;
    public final SparseIntArray f33434o0;
    public final org.telegram.ui.ActionBar.g5 f33435p0;
    public final org.telegram.ui.ActionBar.g5 f33436q0;
    public int f33437r;
    public final org.telegram.ui.ActionBar.g5 f33438r0;
    public int f33439s;
    public final org.telegram.ui.ActionBar.g5 f33440s0;
    public final Drawable f33441t0;
    public final Drawable f33442u0;
    public long v;
    public final Paint f33443v0;
    public long f33444w;
    public TLRPC.EmojiStatus f33445x;
    public TLRPC.EmojiStatus f33446y;

    public dd(long j10) {
        super(null);
        boolean q10 = org.telegram.ui.ActionBar.j6.I.q();
        this.G = q10;
        this.O = 0;
        this.m0 = q10;
        this.f33434o0 = new SparseIntArray();
        Paint paint = new Paint(1);
        this.f33443v0 = paint;
        paint.setStrokeWidth(1.0f);
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19882d7, this.resourceProvider));
        this.f33441t0 = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_check_s).mutate();
        this.f33442u0 = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_halfcheck).mutate();
        this.f33416a = j10;
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j10));
        if (chat != null) {
            this.f33418b = chat.level;
        }
        MessagesController.getInstance(this.currentAccount).getBoostsController().getBoostsStats(j10, new nh.z1(1, this, chat));
        this.resourceProvider = new cd(this);
        this.f33435p0 = new org.telegram.ui.ActionBar.g5(0, false, false, this.resourceProvider);
        this.f33436q0 = new org.telegram.ui.ActionBar.g5(0, false, true, this.resourceProvider);
        this.f33438r0 = new org.telegram.ui.ActionBar.g5(0, true, false, this.resourceProvider);
        this.f33440s0 = new org.telegram.ui.ActionBar.g5(0, true, true, this.resourceProvider);
    }

    public static void U(dd ddVar) {
        org.telegram.ui.ActionBar.f6 f6Var = ddVar.resourceProvider;
        if (f6Var instanceof cd) {
            dd ddVar2 = ((cd) f6Var).f33082a;
            ddVar2.G = !ddVar2.G;
            ddVar2.d1();
            ddVar2.Z0(false);
        } else {
            ddVar.G = !ddVar.G;
            ddVar.d1();
        }
        ddVar.U0(ddVar.G, true);
        ddVar.Z0(false);
    }

    public static void V(org.telegram.ui.dd r22, org.telegram.tgnet.TLRPC.ChatFull r23, android.view.View r24, int r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dd.V(org.telegram.ui.dd, org.telegram.tgnet.TLRPC$ChatFull, android.view.View, int):void");
    }

    public static void W(org.telegram.ui.dd r13, org.telegram.messenger.ChannelBoostsController.CanApplyBoost r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dd.W(org.telegram.ui.dd, org.telegram.messenger.ChannelBoostsController$CanApplyBoost):void");
    }

    public static void Y0(View view) {
        int i10;
        if (view instanceof qc) {
            qc qcVar = (qc) view;
            qcVar.f37379a.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, qcVar.d));
        } else if (view instanceof org.telegram.ui.Cells.n8) {
            ((org.telegram.ui.Cells.n8) view).v();
        } else if (view instanceof uc) {
            uc ucVar = (uc) view;
            AndroidUtilities.forEachViews((RecyclerView) ucVar.f38772b, (h5.d) new nh.z1(2, ucVar, MessagesController.getInstance(ucVar.d).peerColors));
        } else if (view instanceof bd) {
            bd bdVar = (bd) view;
            ArrayList arrayList = bdVar.f32842c;
            org.telegram.ui.ActionBar.f6 f6Var = bdVar.f32841b;
            if (f6Var != null) {
                i10 = f6Var.a();
            } else {
                i10 = org.telegram.ui.ActionBar.j6.I.q();
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((org.telegram.ui.Components.ip) arrayList.get(i11)).f25751c = i10;
            }
            AndroidUtilities.forEachViews((RecyclerView) bdVar.d, (h5.d) new xc(bdVar, 0));
            bdVar.h.l();
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
                return groupStickerSetById.documents.get(0).f19165id;
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
        if (this.e == this.f33424f && this.h == this.f33432n && this.f33437r == this.f33439s && this.v == this.f33444w && DialogObject.emojiStatusesEqual(this.f33445x, this.f33446y) && ChatThemeController.wallpaperEquals(this.B, this.C)) {
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
        if (this.e != this.f33424f) {
            MessagesController.PeerColors peerColors = getMessagesController().peerColors;
            if (peerColors == null) {
                color = null;
            } else {
                color = peerColors.getColor(this.f33424f);
            }
            if (color != null) {
                i10 = Math.max(0, color.getLvl(this.d));
            }
        }
        if (this.h != this.f33432n) {
            i10 = Math.max(i10, getMessagesController().channelBgIconLevelMin);
        }
        if (this.f33437r != this.f33439s) {
            MessagesController.PeerColors peerColors2 = getMessagesController().profilePeerColors;
            if (peerColors2 != null) {
                peerColor = peerColors2.getColor(this.f33439s);
            }
            if (peerColor != null) {
                i10 = Math.max(i10, peerColor.getLvl(this.d));
            }
        }
        if (this.v != this.f33444w) {
            i10 = Math.max(i10, J0());
        }
        if (!DialogObject.emojiStatusesEqual(this.f33445x, this.f33446y)) {
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
                org.telegram.ui.Components.gj0 gj0Var = this.H;
                if (z4) {
                    i11 = gj0Var.e[0];
                }
                gj0Var.N(i11);
                org.telegram.ui.Components.gj0 gj0Var2 = this.H;
                if (gj0Var2 != null) {
                    gj0Var2.start();
                    return;
                }
                return;
            }
            if (z4) {
                i10 = this.H.e[0] - 1;
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
        alertDialog$Builder.f19478a.O = LocaleController.getString(R.string.ChannelColorUnsaved);
        alertDialog$Builder.f19478a.Q = LocaleController.getString(R.string.ChannelColorUnsavedMessage);
        alertDialog$Builder.h(LocaleController.getString(R.string.Dismiss), new org.telegram.ui.ActionBar.c2(this) {
            public final dd f34896b;

            {
                this.f34896b = this;
            }

            @Override
            public final void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
                switch (r2) {
                    case 0:
                        this.f34896b.finishFragment();
                        return;
                    default:
                        this.f34896b.w0();
                        return;
                }
            }
        });
        alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new org.telegram.ui.ActionBar.c2(this) {
            public final dd f34896b;

            {
                this.f34896b = this;
            }

            @Override
            public final void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
                switch (r2) {
                    case 0:
                        this.f34896b.finishFragment();
                        return;
                    default:
                        this.f34896b.w0();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
        showDialog(d2Var);
        ((TextView) d2Var.d(-2)).setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f20116q7));
    }

    public final void W0(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        if (tL_premium_boostsStatus != null) {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.f33416a));
            this.f33420c = tL_premium_boostsStatus;
            int i10 = tL_premium_boostsStatus.level;
            this.f33418b = i10;
            if (chat != null) {
                chat.level = i10;
            }
            pc pcVar = this.K;
            if (pcVar != null) {
                pcVar.l();
            }
            X0(true);
        }
    }

    public void X0(boolean z4) {
        if (this.M != null && this.f33420c != null) {
            int S0 = S0();
            if (this.f33418b >= S0) {
                this.M.f(null, z4);
                return;
            }
            if (this.F == null) {
                this.F = new SpannableStringBuilder("l");
                org.telegram.ui.Components.lq lqVar = new org.telegram.ui.Components.lq(R.drawable.mini_switch_lock, 0);
                lqVar.setTopOffset(1);
                this.F.setSpan(lqVar, 0, 1, 33);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.F).append((CharSequence) LocaleController.formatPluralString("BoostLevelRequired", S0, new Object[0]));
            this.M.f(spannableStringBuilder, z4);
        }
    }

    public void Z0(boolean z4) {
        int themedColor;
        this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.f20151s8));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = -1;
        if (this.d && this.f33439s != -1) {
            themedColor = -1;
        } else {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.A8);
        }
        kVar.setTitleColor(themedColor);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        if (!this.d || this.f33439s == -1) {
            i10 = getThemedColor(org.telegram.ui.ActionBar.j6.f20202v8);
        }
        kVar2.C(i10, false);
        this.actionBar.B(getThemedColor(org.telegram.ui.ActionBar.j6.f20167t8), false);
        if (!z4) {
            org.telegram.ui.Components.rl0 rl0Var = this.J;
            int i11 = org.telegram.ui.ActionBar.j6.f19827a7;
            rl0Var.setBackgroundColor(getThemedColor(i11));
            this.K.l();
            AndroidUtilities.forEachViews((RecyclerView) this.J, (h5.d) new nh.e(this));
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
        if (y02 instanceof org.telegram.ui.Cells.da) {
            org.telegram.ui.Cells.da daVar = (org.telegram.ui.Cells.da) y02;
            org.telegram.ui.Cells.s1[] cells = daVar.getCells();
            for (int i10 = 0; i10 < cells.length; i10++) {
                org.telegram.ui.Cells.s1 s1Var = cells[i10];
                if (s1Var != null && (messageObject = s1Var.getMessageObject()) != null) {
                    messageObject.overrideLinkColor = this.f33424f;
                    messageObject.overrideLinkEmoji = this.f33432n;
                    cells[i10].setAvatar(messageObject);
                    cells[i10].invalidate();
                }
            }
            Drawable f10 = ph.k5.f(this.E, this.currentAccount, this.C, this.G);
            this.E = f10;
            daVar.setOverrideBackground(f10);
        }
        if (y03 instanceof kp0) {
            ((kp0) y03).a(this.f33424f, z4);
        } else if (y03 instanceof uc) {
            ((uc) y03).a(this.f33424f, z4);
        }
        if (y04 instanceof qc) {
            qc qcVar = (qc) y04;
            qcVar.a(this.currentAccount, this.f33424f, true);
            qcVar.c(this.f33432n, false, z4);
        }
        if (y05 instanceof bd) {
            bd bdVar = (bd) y05;
            String wallpaperEmoticon = ChatThemeController.getWallpaperEmoticon(this.C);
            if (wallpaperEmoticon == null && this.C == null && this.D != null) {
                wallpaperEmoticon = "❌";
            }
            bdVar.a(wallpaperEmoticon, z4);
            bdVar.setGalleryWallpaper(this.D);
        }
    }

    public final void b1() {
        TLRPC.StickerSet stickerSet;
        TLRPC.StickerSet stickerSet2;
        View y02 = y0(this.W);
        View y03 = y0(this.Y);
        View y04 = y0(this.Z);
        View y05 = y0(this.f33421c0);
        View y06 = y0(this.f33423e0);
        View y07 = y0(this.f33426g0);
        if (y02 instanceof wc) {
            TLRPC.EmojiStatus emojiStatus = this.f33446y;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                wc wcVar = (wc) y02;
                vc vcVar = wcVar.f39335b;
                MessagesController.PeerColor fromCollectible = MessagesController.PeerColor.fromCollectible(emojiStatus);
                vcVar.c(fromCollectible, true);
                wcVar.f39334a.c(fromCollectible, true);
                vcVar.d(((TLRPC.TL_emojiStatusCollectible) this.f33446y).pattern_document_id, true, true);
            } else {
                wc wcVar2 = (wc) y02;
                vc vcVar2 = wcVar2.f39335b;
                int i10 = this.f33439s;
                vcVar2.b(i10, true);
                wcVar2.f39334a.b(wcVar2.h.currentAccount, i10, true);
                vcVar2.d(this.f33444w, false, true);
            }
            wc wcVar3 = (wc) y02;
            vc vcVar3 = wcVar3.f39335b;
            vcVar3.e(DialogObject.getEmojiStatusDocumentId(this.f33446y), false, true);
            vcVar3.a(this.f33424f);
            wcVar3.e();
        }
        if (y03 instanceof kp0) {
            ((kp0) y03).a(this.f33439s, true);
        } else if (y03 instanceof uc) {
            ((uc) y03).a(this.f33424f, true);
        }
        if (y04 instanceof qc) {
            qc qcVar = (qc) y04;
            qcVar.a(this.currentAccount, this.f33439s, false);
            qcVar.c(this.f33444w, false, true);
        }
        if (y05 instanceof qc) {
            TLRPC.EmojiStatus emojiStatus2 = this.f33446y;
            if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                ((qc) y05).b(MessagesController.PeerColor.fromCollectible(emojiStatus2));
            } else {
                ((qc) y05).a(this.currentAccount, this.f33439s, false);
            }
            ((qc) y05).c(DialogObject.getEmojiStatusDocumentId(this.f33446y), DialogObject.isEmojiStatusCollectible(this.f33446y), true);
        }
        boolean z4 = y06 instanceof qc;
        long j10 = this.f33416a;
        if (z4) {
            qc qcVar2 = (qc) y06;
            qcVar2.a(this.currentAccount, this.f33439s, false);
            TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-j10);
            if (chatFull != null && (stickerSet2 = chatFull.emojiset) != null) {
                qcVar2.c(D0(stickerSet2), false, false);
            } else {
                qcVar2.c(0L, false, false);
            }
        }
        if (y07 instanceof qc) {
            TLRPC.ChatFull chatFull2 = getMessagesController().getChatFull(-j10);
            if (chatFull2 != null && (stickerSet = chatFull2.stickerset) != null) {
                ((qc) y07).d(C0(stickerSet));
            } else {
                ((qc) y07).c(0L, false, false);
            }
        }
        c1();
    }

    public void c1() {
        pc pcVar;
        pc pcVar2;
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
        if (this.f33444w == 0 && this.f33439s < 0 && !(this.f33446y instanceof TLRPC.TL_emojiStatusCollectible)) {
            int i12 = this.f33419b0;
            this.f33419b0 = -1;
            if (i12 >= 0 && (pcVar2 = this.K) != null) {
                pcVar2.u(i12);
                this.K.m(this.Z);
            }
        } else {
            if (this.f33419b0 >= 0) {
                z4 = true;
            }
            this.O = i10 + 9;
            this.f33419b0 = i11;
            if (!z4 && (pcVar = this.K) != null) {
                pcVar.o(i11);
                this.K.m(this.Z);
            }
        }
        int i13 = this.O;
        this.f33417a0 = i13;
        this.f33421c0 = i13 + 1;
        this.O = i13 + 3;
        this.f33422d0 = i13 + 2;
    }

    @Override
    public View createView(Context context) {
        MessagesController messagesController = getMessagesController();
        long j10 = -this.f33416a;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        if (chat != null) {
            int colorId = ChatObject.getColorId(chat);
            this.f33424f = colorId;
            this.e = colorId;
            long emojiId = ChatObject.getEmojiId(chat);
            this.f33432n = emojiId;
            this.h = emojiId;
            int profileColorId = ChatObject.getProfileColorId(chat);
            this.f33439s = profileColorId;
            this.f33437r = profileColorId;
            long profileEmojiId = ChatObject.getProfileEmojiId(chat);
            this.f33444w = profileEmojiId;
            this.v = profileEmojiId;
            TLRPC.EmojiStatus emojiStatus = chat.emoji_status;
            this.f33446y = emojiStatus;
            this.f33445x = emojiStatus;
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
        this.actionBar.setActionBarMenuOnItemClick(new eg.m1(this, 16));
        org.telegram.ui.Components.gj0 gj0Var = new org.telegram.ui.Components.gj0(R.raw.sun, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.H = gj0Var;
        gj0Var.h = true;
        if (!this.G) {
            gj0Var.N(0);
            this.H.K(0);
        } else {
            gj0Var.K(35);
            this.H.N(36);
        }
        this.H.X = true;
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.J9, this.resourceProvider);
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
        org.telegram.ui.Components.rl0 rl0Var = this.J;
        pc pcVar = new pc(this);
        this.K = pcVar;
        rl0Var.setAdapter(pcVar);
        new f2.w(3);
        this.J.setLayoutManager(new f2.i0());
        org.telegram.ui.Components.rl0 rl0Var2 = this.J;
        int i10 = org.telegram.ui.ActionBar.j6.f19827a7;
        rl0Var2.setBackgroundColor(getThemedColor(i10));
        frameLayout.addView(this.J, k7.b6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 68.0f));
        this.J.setOnItemClickListener(new gg.v0(5, this, chatFull));
        f2.l lVar = new f2.l();
        lVar.n(350L);
        lVar.o(org.telegram.ui.Components.mr.h);
        lVar.C = false;
        lVar.f5807m = false;
        this.J.setItemAnimator(lVar);
        ph.d dVar = new ph.d(context, this.resourceProvider, true);
        dVar.setRoundRadius(24);
        this.M = dVar;
        dVar.g(LocaleController.getString(R.string.ApplyChanges), false, true);
        this.M.setOnClickListener(new a(this, 12));
        X0(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.L = frameLayout2;
        frameLayout2.setBackgroundColor(getThemedColor(i10));
        this.L.addView(this.M, k7.b6.d(-1, 48.0f, 80, 10.0f, 10.0f, 10.0f, 10.0f));
        frameLayout.addView(this.L, k7.b6.e(-1, 68, 80));
        setBulletinDelegate(new c9(this, 1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dd.d1():void");
    }

    @Override
    public void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.chatWasBoostedByUser;
        long j10 = this.f33416a;
        if (i10 == i12) {
            if (j10 == ((Long) objArr[2]).longValue()) {
                W0((TL_stories.TL_premium_boostsStatus) objArr[0]);
            }
        } else if (i10 == NotificationCenter.boostByChannelCreated) {
            if (!((Boolean) objArr[1]).booleanValue()) {
                getMessagesController().getBoostsController().getBoostsStats(j10, new gc(this, 1));
            }
        } else if (i10 == NotificationCenter.dialogDeleted && j10 == ((Long) objArr[0]).longValue()) {
            org.telegram.ui.ActionBar.e5 e5Var = this.parentLayout;
            if (e5Var != null && e5Var.getLastFragment() == this) {
                finishFragment();
            } else {
                removeSelfFromStack();
            }
        }
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (Q0() && this.f33418b >= S0()) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z4) {
        if (this.f33418b >= S0() && Q0()) {
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
    public final void setResourceProvider(org.telegram.ui.ActionBar.f6 f6Var) {
        this.f33433n0 = f6Var;
    }

    public final void w0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dd.w0():void");
    }

    public void x0() {
        org.telegram.ui.Components.rl0 rl0Var = new org.telegram.ui.Components.rl0(getParentActivity(), this.resourceProvider);
        this.J = rl0Var;
        rl0Var.setSections(false);
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
