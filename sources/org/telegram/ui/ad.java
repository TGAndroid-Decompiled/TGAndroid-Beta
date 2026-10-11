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
public class ad extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public TLRPC.WallPaper E;
    public TLRPC.WallPaper F;
    public TLRPC.WallPaper G;
    public Drawable H;
    public SpannableStringBuilder I;
    public boolean J;
    public org.telegram.ui.Components.dk0 K;
    public org.telegram.ui.ActionBar.u0 L;
    public org.telegram.ui.Components.rm0 M;
    public mc N;
    public FrameLayout O;
    public ci.d P;
    public jc Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public final long f36038a;
    public int f36039a0;
    public int f36040b;
    public int f36041b0;
    public TL_stories.TL_premium_boostsStatus f36042c;
    public int f36043c0;
    public boolean d;
    public int f36044d0;
    public int f36045e;
    public int f36046e0;
    public int f36047f;
    public int f36048f0;
    public int f36049g0;
    public long h;
    public int f36050h0;
    public int f36051i0;
    public int f36052j0;
    public int f36053k0;
    public org.telegram.ui.ActionBar.m2 f36054l0;
    public kc m0;
    public long f36055n;
    public float f36056n0;
    public ValueAnimator f36057o0;
    public boolean f36058p0;
    public org.telegram.ui.ActionBar.d6 f36059q0;
    public int f36060r;
    public final SparseIntArray f36061r0;
    public int f36062s;
    public final org.telegram.ui.ActionBar.d5 f36063s0;
    public final org.telegram.ui.ActionBar.d5 f36064t0;
    public final org.telegram.ui.ActionBar.d5 f36065u0;
    public long v;
    public final org.telegram.ui.ActionBar.d5 f36066v0;
    public long f36067w;
    public final Drawable f36068w0;
    public TLRPC.EmojiStatus f36069x;
    public final Drawable f36070x0;
    public TLRPC.EmojiStatus f36071y;
    public final Paint f36072y0;

    public ad(long j3) {
        super(null);
        boolean q6 = org.telegram.ui.ActionBar.h6.I.q();
        this.J = q6;
        this.R = 0;
        this.f36058p0 = q6;
        this.f36061r0 = new SparseIntArray();
        Paint paint = new Paint(1);
        this.f36072y0 = paint;
        paint.setStrokeWidth(1.0f);
        paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20823d7, this.resourceProvider));
        this.f36068w0 = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_check_s).mutate();
        this.f36070x0 = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_halfcheck).mutate();
        this.f36038a = j3;
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j3));
        if (chat != null) {
            this.f36040b = chat.level;
        }
        MessagesController.getInstance(this.currentAccount).getBoostsController().getBoostsStats(j3, new ai.h3(29, this, chat));
        this.resourceProvider = new zc(this);
        this.f36063s0 = new org.telegram.ui.ActionBar.d5(0, false, false, this.resourceProvider);
        this.f36064t0 = new org.telegram.ui.ActionBar.d5(0, false, true, this.resourceProvider);
        this.f36065u0 = new org.telegram.ui.ActionBar.d5(0, true, false, this.resourceProvider);
        this.f36066v0 = new org.telegram.ui.ActionBar.d5(0, true, true, this.resourceProvider);
    }

    public static void U(ad adVar) {
        org.telegram.ui.ActionBar.d6 d6Var = adVar.resourceProvider;
        if (d6Var instanceof zc) {
            ad adVar2 = ((zc) d6Var).f44671a;
            adVar2.J = !adVar2.J;
            adVar2.d1();
            adVar2.Z0(false);
        } else {
            adVar.J = !adVar.J;
            adVar.d1();
        }
        adVar.U0(adVar.J, true);
        adVar.Z0(false);
    }

    public static void V(org.telegram.ui.ad r13, org.telegram.messenger.ChannelBoostsController.CanApplyBoost r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ad.V(org.telegram.ui.ad, org.telegram.messenger.ChannelBoostsController$CanApplyBoost):void");
    }

    public static void W(org.telegram.ui.ad r22, org.telegram.tgnet.TLRPC.ChatFull r23, android.view.View r24, int r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ad.W(org.telegram.ui.ad, org.telegram.tgnet.TLRPC$ChatFull, android.view.View, int):void");
    }

    public static void Y0(View view) {
        int i10;
        if (view instanceof nc) {
            nc ncVar = (nc) view;
            ncVar.f40243a.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, ncVar.d));
        } else if (view instanceof org.telegram.ui.Cells.r8) {
            ((org.telegram.ui.Cells.r8) view).v();
        } else if (view instanceof rc) {
            rc rcVar = (rc) view;
            AndroidUtilities.forEachViews((RecyclerView) rcVar.f41443b, (Utilities.Callback<View>) new oc(0, rcVar, MessagesController.getInstance(rcVar.d).peerColors));
        } else if (view instanceof yc) {
            yc ycVar = (yc) view;
            ArrayList arrayList = ycVar.f44345c;
            org.telegram.ui.ActionBar.d6 d6Var = ycVar.f44344b;
            if (d6Var != null) {
                i10 = d6Var.a();
            } else {
                i10 = org.telegram.ui.ActionBar.h6.I.q();
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((org.telegram.ui.Components.bq) arrayList.get(i11)).f25060c = i10;
            }
            AndroidUtilities.forEachViews((RecyclerView) ycVar.d, (Utilities.Callback<View>) new uc(ycVar, 0));
            ycVar.h.l();
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
                return groupStickerSetById.documents.get(0).f20074id;
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
        if (this.f36045e == this.f36047f && this.h == this.f36055n && this.f36060r == this.f36062s && this.v == this.f36067w && DialogObject.emojiStatusesEqual(this.f36069x, this.f36071y) && ChatThemeController.wallpaperEquals(this.E, this.F)) {
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
        if (this.f36045e != this.f36047f) {
            MessagesController.PeerColors peerColors = getMessagesController().peerColors;
            if (peerColors == null) {
                color = null;
            } else {
                color = peerColors.getColor(this.f36047f);
            }
            if (color != null) {
                i10 = Math.max(0, color.getLvl(this.d));
            }
        }
        if (this.h != this.f36055n) {
            i10 = Math.max(i10, getMessagesController().channelBgIconLevelMin);
        }
        if (this.f36060r != this.f36062s) {
            MessagesController.PeerColors peerColors2 = getMessagesController().profilePeerColors;
            if (peerColors2 != null) {
                peerColor = peerColors2.getColor(this.f36062s);
            }
            if (peerColor != null) {
                i10 = Math.max(i10, peerColor.getLvl(this.d));
            }
        }
        if (this.v != this.f36067w) {
            i10 = Math.max(i10, J0());
        }
        if (!DialogObject.emojiStatusesEqual(this.f36069x, this.f36071y)) {
            i10 = Math.max(i10, F0());
        }
        if (!ChatThemeController.wallpaperEquals(this.E, this.F)) {
            return Math.max(i10, O0());
        }
        return i10;
    }

    public final void U0(boolean z10, boolean z11) {
        int i10;
        if (this.f36058p0 != z10) {
            this.f36058p0 = z10;
            int i11 = 0;
            if (z11) {
                org.telegram.ui.Components.dk0 dk0Var = this.K;
                if (z10) {
                    i11 = dk0Var.f25810e[0];
                }
                dk0Var.P(i11);
                org.telegram.ui.Components.dk0 dk0Var2 = this.K;
                if (dk0Var2 != null) {
                    dk0Var2.start();
                    return;
                }
                return;
            }
            if (z10) {
                i10 = this.K.f25810e[0] - 1;
            } else {
                i10 = 0;
            }
            this.K.N(i10, false, true);
            this.K.P(i10);
            org.telegram.ui.ActionBar.u0 u0Var = this.L;
            if (u0Var != null) {
                u0Var.invalidate();
            }
        }
    }

    public final void V0() {
        if (getVisibleDialog() != null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
        alertDialog$Builder.f20404a.R = LocaleController.getString(R.string.ChannelColorUnsaved);
        alertDialog$Builder.f20404a.T = LocaleController.getString(R.string.ChannelColorUnsavedMessage);
        alertDialog$Builder.h(LocaleController.getString(R.string.Dismiss), new org.telegram.ui.ActionBar.z1(this) {
            public final ad f38041b;

            {
                this.f38041b = this;
            }

            @Override
            public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
                switch (r2) {
                    case 0:
                        this.f38041b.finishFragment();
                        return;
                    default:
                        this.f38041b.w0();
                        return;
                }
            }
        });
        alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new org.telegram.ui.ActionBar.z1(this) {
            public final ad f38041b;

            {
                this.f38041b = this;
            }

            @Override
            public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
                switch (r2) {
                    case 0:
                        this.f38041b.finishFragment();
                        return;
                    default:
                        this.f38041b.w0();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20404a;
        showDialog(a2Var);
        ((TextView) a2Var.d(-2)).setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21062q7));
    }

    public final void W0(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        if (tL_premium_boostsStatus != null) {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.f36038a));
            this.f36042c = tL_premium_boostsStatus;
            int i10 = tL_premium_boostsStatus.level;
            this.f36040b = i10;
            if (chat != null) {
                chat.level = i10;
            }
            mc mcVar = this.N;
            if (mcVar != null) {
                mcVar.l();
            }
            X0(true);
        }
    }

    public void X0(boolean z10) {
        if (this.P != null && this.f36042c != null) {
            int S0 = S0();
            if (this.f36040b >= S0) {
                this.P.f(null, z10);
                return;
            }
            if (this.I == null) {
                this.I = new SpannableStringBuilder("l");
                org.telegram.ui.Components.er erVar = new org.telegram.ui.Components.er(R.drawable.mini_switch_lock, 0);
                erVar.setTopOffset(1);
                this.I.setSpan(erVar, 0, 1, 33);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.I).append((CharSequence) LocaleController.formatPluralString("BoostLevelRequired", S0, new Object[0]));
            this.P.f(spannableStringBuilder, z10);
        }
    }

    public void Z0(boolean z10) {
        int themedColor;
        this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21101s8));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = -1;
        if (this.d && this.f36062s != -1) {
            themedColor = -1;
        } else {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.h6.A8);
        }
        kVar.setTitleColor(themedColor);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        if (!this.d || this.f36062s == -1) {
            i10 = getThemedColor(org.telegram.ui.ActionBar.h6.f21156v8);
        }
        kVar2.D(i10, false);
        this.actionBar.C(getThemedColor(org.telegram.ui.ActionBar.h6.f21120t8), false);
        if (!z10) {
            org.telegram.ui.Components.rm0 rm0Var = this.M;
            int i11 = org.telegram.ui.ActionBar.h6.f20766a7;
            rm0Var.setBackgroundColor(getThemedColor(i11));
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
        if (y02 instanceof org.telegram.ui.Cells.ga) {
            org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) y02;
            org.telegram.ui.Cells.u1[] cells = gaVar.getCells();
            for (int i10 = 0; i10 < cells.length; i10++) {
                org.telegram.ui.Cells.u1 u1Var = cells[i10];
                if (u1Var != null && (messageObject = u1Var.getMessageObject()) != null) {
                    messageObject.overrideLinkColor = this.f36047f;
                    messageObject.overrideLinkEmoji = this.f36055n;
                    cells[i10].setAvatar(messageObject);
                    cells[i10].invalidate();
                }
            }
            Drawable f7 = ci.b7.f(this.H, this.currentAccount, this.F, this.J);
            this.H = f7;
            gaVar.setOverrideBackground(f7);
        }
        if (y03 instanceof wp0) {
            ((wp0) y03).a(this.f36047f, z10);
        } else if (y03 instanceof rc) {
            ((rc) y03).a(this.f36047f, z10);
        }
        if (y04 instanceof nc) {
            nc ncVar = (nc) y04;
            ncVar.a(this.currentAccount, this.f36047f, true);
            ncVar.c(this.f36055n, false, z10);
        }
        if (y05 instanceof yc) {
            yc ycVar = (yc) y05;
            String wallpaperEmoticon = ChatThemeController.getWallpaperEmoticon(this.F);
            if (wallpaperEmoticon == null && this.F == null && this.G != null) {
                wallpaperEmoticon = "❌";
            }
            ycVar.a(wallpaperEmoticon, z10);
            ycVar.setGalleryWallpaper(this.G);
        }
    }

    public final void b1() {
        TLRPC.StickerSet stickerSet;
        TLRPC.StickerSet stickerSet2;
        View y02 = y0(this.Z);
        View y03 = y0(this.f36041b0);
        View y04 = y0(this.f36043c0);
        View y05 = y0(this.f36048f0);
        View y06 = y0(this.f36050h0);
        View y07 = y0(this.f36052j0);
        if (y02 instanceof tc) {
            TLRPC.EmojiStatus emojiStatus = this.f36071y;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                tc tcVar = (tc) y02;
                sc scVar = tcVar.f42186b;
                MessagesController.PeerColor fromCollectible = MessagesController.PeerColor.fromCollectible(emojiStatus);
                scVar.c(fromCollectible, true);
                tcVar.f42185a.c(fromCollectible, true);
                scVar.d(((TLRPC.TL_emojiStatusCollectible) this.f36071y).pattern_document_id, true, true);
            } else {
                tc tcVar2 = (tc) y02;
                sc scVar2 = tcVar2.f42186b;
                int i10 = this.f36062s;
                scVar2.b(i10, true);
                tcVar2.f42185a.b(tcVar2.h.currentAccount, i10, true);
                scVar2.d(this.f36067w, false, true);
            }
            tc tcVar3 = (tc) y02;
            sc scVar3 = tcVar3.f42186b;
            scVar3.e(DialogObject.getEmojiStatusDocumentId(this.f36071y), false, true);
            scVar3.a(this.f36047f);
            tcVar3.e();
        }
        if (y03 instanceof wp0) {
            ((wp0) y03).a(this.f36062s, true);
        } else if (y03 instanceof rc) {
            ((rc) y03).a(this.f36047f, true);
        }
        if (y04 instanceof nc) {
            nc ncVar = (nc) y04;
            ncVar.a(this.currentAccount, this.f36062s, false);
            ncVar.c(this.f36067w, false, true);
        }
        if (y05 instanceof nc) {
            TLRPC.EmojiStatus emojiStatus2 = this.f36071y;
            if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                ((nc) y05).b(MessagesController.PeerColor.fromCollectible(emojiStatus2));
            } else {
                ((nc) y05).a(this.currentAccount, this.f36062s, false);
            }
            ((nc) y05).c(DialogObject.getEmojiStatusDocumentId(this.f36071y), DialogObject.isEmojiStatusCollectible(this.f36071y), true);
        }
        boolean z10 = y06 instanceof nc;
        long j3 = this.f36038a;
        if (z10) {
            nc ncVar2 = (nc) y06;
            ncVar2.a(this.currentAccount, this.f36062s, false);
            TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-j3);
            if (chatFull != null && (stickerSet2 = chatFull.emojiset) != null) {
                ncVar2.c(D0(stickerSet2), false, false);
            } else {
                ncVar2.c(0L, false, false);
            }
        }
        if (y07 instanceof nc) {
            TLRPC.ChatFull chatFull2 = getMessagesController().getChatFull(-j3);
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
        this.f36041b0 = i10 + 6;
        int i11 = i10 + 8;
        this.R = i11;
        this.f36043c0 = i10 + 7;
        if (this.f36067w == 0 && this.f36062s < 0 && !(this.f36071y instanceof TLRPC.TL_emojiStatusCollectible)) {
            int i12 = this.f36046e0;
            this.f36046e0 = -1;
            if (i12 >= 0 && (mcVar2 = this.N) != null) {
                mcVar2.u(i12);
                this.N.m(this.f36043c0);
            }
        } else {
            if (this.f36046e0 >= 0) {
                z10 = true;
            }
            this.R = i10 + 9;
            this.f36046e0 = i11;
            if (!z10 && (mcVar = this.N) != null) {
                mcVar.o(i11);
                this.N.m(this.f36043c0);
            }
        }
        int i13 = this.R;
        this.f36044d0 = i13;
        this.f36048f0 = i13 + 1;
        this.R = i13 + 3;
        this.f36049g0 = i13 + 2;
    }

    @Override
    public View createView(Context context) {
        MessagesController messagesController = getMessagesController();
        long j3 = -this.f36038a;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
        if (chat != null) {
            int colorId = ChatObject.getColorId(chat);
            this.f36047f = colorId;
            this.f36045e = colorId;
            long emojiId = ChatObject.getEmojiId(chat);
            this.f36055n = emojiId;
            this.h = emojiId;
            int profileColorId = ChatObject.getProfileColorId(chat);
            this.f36062s = profileColorId;
            this.f36060r = profileColorId;
            long profileEmojiId = ChatObject.getProfileEmojiId(chat);
            this.f36067w = profileEmojiId;
            this.v = profileEmojiId;
            TLRPC.EmojiStatus emojiStatus = chat.emoji_status;
            this.f36071y = emojiStatus;
            this.f36069x = emojiStatus;
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
        org.telegram.ui.Components.dk0 dk0Var = new org.telegram.ui.Components.dk0(R.raw.sun, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.K = dk0Var;
        dk0Var.h = true;
        if (!this.J) {
            dk0Var.P(0);
            this.K.M(0);
        } else {
            dk0Var.M(35);
            this.K.P(36);
        }
        this.K.Z = true;
        int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.J9, this.resourceProvider);
        this.K.Q(w02, "Sunny");
        this.K.Q(w02, "Path 6");
        this.K.Q(w02, "Path");
        this.K.Q(w02, "Path 5");
        this.L = this.actionBar.o().d(1, this.K);
        FrameLayout frameLayout = new FrameLayout(context);
        c1();
        x0();
        if (!this.d) {
            this.actionBar.setAdaptiveBackground(this.M);
        }
        org.telegram.ui.Components.rm0 rm0Var = this.M;
        mc mcVar = new mc(this);
        this.N = mcVar;
        rm0Var.setAdapter(mcVar);
        new s4.s(3);
        this.M.setLayoutManager(new s4.d0());
        org.telegram.ui.Components.rm0 rm0Var2 = this.M;
        int i10 = org.telegram.ui.ActionBar.h6.f20766a7;
        rm0Var2.setBackgroundColor(getThemedColor(i10));
        frameLayout.addView(this.M, w7.x5.a(-1.0f, 0.0f, 0.0f, 0.0f, 68.0f, -1, 119));
        this.M.setOnItemClickListener(new ai.o6(4, this, chatFull));
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(org.telegram.ui.Components.is.h);
        jVar.C = false;
        jVar.f47822m = false;
        this.M.setItemAnimator(jVar);
        ci.d dVar = new ci.d(context, this.resourceProvider, true);
        dVar.setRoundRadius(24);
        this.P = dVar;
        dVar.g(LocaleController.getString(R.string.ApplyChanges), false, true);
        this.P.setOnClickListener(new a(this, 11));
        X0(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.O = frameLayout2;
        frameLayout2.setBackgroundColor(getThemedColor(i10));
        this.O.addView(this.P, w7.x5.a(48.0f, 10.0f, 10.0f, 10.0f, 10.0f, -1, 80));
        frameLayout.addView(this.O, w7.x5.e(-1, 68, 80));
        setBulletinDelegate(new x8(this, 1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ad.d1():void");
    }

    @Override
    public void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.chatWasBoostedByUser;
        long j3 = this.f36038a;
        if (i10 == i12) {
            if (j3 == ((Long) objArr[2]).longValue()) {
                W0((TL_stories.TL_premium_boostsStatus) objArr[0]);
            }
        } else if (i10 == NotificationCenter.boostByChannelCreated) {
            if (!((Boolean) objArr[1]).booleanValue()) {
                getMessagesController().getBoostsController().getBoostsStats(j3, new ec(this, 2));
            }
        } else if (i10 == NotificationCenter.dialogDeleted && j3 == ((Long) objArr[0]).longValue()) {
            org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
            if (b5Var != null && b5Var.getLastFragment() == this) {
                finishFragment();
            } else {
                removeSelfFromStack();
            }
        }
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (Q0() && this.f36040b >= S0()) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.f36040b >= S0() && Q0()) {
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
        this.f36059q0 = d6Var;
    }

    public final void w0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ad.w0():void");
    }

    public void x0() {
        org.telegram.ui.Components.rm0 rm0Var = new org.telegram.ui.Components.rm0(getParentActivity(), this.resourceProvider);
        this.M = rm0Var;
        rm0Var.setSections(false);
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
