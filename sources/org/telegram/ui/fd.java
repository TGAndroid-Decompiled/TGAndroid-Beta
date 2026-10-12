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
public class fd extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public TLRPC.WallPaper E;
    public TLRPC.WallPaper F;
    public TLRPC.WallPaper G;
    public Drawable H;
    public SpannableStringBuilder I;
    public boolean J;
    public org.telegram.ui.Components.fk0 K;
    public org.telegram.ui.ActionBar.u0 L;
    public org.telegram.ui.Components.wm0 M;
    public rc N;
    public FrameLayout O;
    public ci.d P;
    public oc Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public final long f37720a;
    public int f37721a0;
    public int f37722b;
    public int f37723b0;
    public TL_stories.TL_premium_boostsStatus f37724c;
    public int f37725c0;
    public boolean d;
    public int f37726d0;
    public int f37727e;
    public int f37728e0;
    public int f37729f;
    public int f37730f0;
    public int f37731g0;
    public long h;
    public int f37732h0;
    public int f37733i0;
    public int f37734j0;
    public int f37735k0;
    public org.telegram.ui.ActionBar.m2 f37736l0;
    public pc m0;
    public long f37737n;
    public float f37738n0;
    public ValueAnimator f37739o0;
    public boolean f37740p0;
    public org.telegram.ui.ActionBar.c6 f37741q0;
    public int f37742r;
    public final SparseIntArray f37743r0;
    public int f37744s;
    public final org.telegram.ui.ActionBar.d5 f37745s0;
    public final org.telegram.ui.ActionBar.d5 f37746t0;
    public final org.telegram.ui.ActionBar.d5 f37747u0;
    public long v;
    public final org.telegram.ui.ActionBar.d5 f37748v0;
    public long f37749w;
    public final Drawable f37750w0;
    public TLRPC.EmojiStatus f37751x;
    public final Drawable f37752x0;
    public TLRPC.EmojiStatus f37753y;
    public final Paint f37754y0;

    public fd(long j3) {
        super(null);
        boolean q6 = org.telegram.ui.ActionBar.h6.I.q();
        this.J = q6;
        this.R = 0;
        this.f37740p0 = q6;
        this.f37743r0 = new SparseIntArray();
        Paint paint = new Paint(1);
        this.f37754y0 = paint;
        paint.setStrokeWidth(1.0f);
        paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20560d7, this.resourceProvider));
        this.f37750w0 = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_check_s).mutate();
        this.f37752x0 = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_halfcheck).mutate();
        this.f37720a = j3;
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j3));
        if (chat != null) {
            this.f37722b = chat.level;
        }
        MessagesController.getInstance(this.currentAccount).getBoostsController().getBoostsStats(j3, new ai.h3(29, this, chat));
        this.resourceProvider = new ed(this);
        this.f37745s0 = new org.telegram.ui.ActionBar.d5(0, false, false, this.resourceProvider);
        this.f37746t0 = new org.telegram.ui.ActionBar.d5(0, false, true, this.resourceProvider);
        this.f37747u0 = new org.telegram.ui.ActionBar.d5(0, true, false, this.resourceProvider);
        this.f37748v0 = new org.telegram.ui.ActionBar.d5(0, true, true, this.resourceProvider);
    }

    public static void U(fd fdVar) {
        org.telegram.ui.ActionBar.c6 c6Var = fdVar.resourceProvider;
        if (c6Var instanceof ed) {
            fd fdVar2 = ((ed) c6Var).f37062a;
            fdVar2.J = !fdVar2.J;
            fdVar2.d1();
            fdVar2.Z0(false);
        } else {
            fdVar.J = !fdVar.J;
            fdVar.d1();
        }
        fdVar.U0(fdVar.J, true);
        fdVar.Z0(false);
    }

    public static void V(org.telegram.ui.fd r13, org.telegram.messenger.ChannelBoostsController.CanApplyBoost r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fd.V(org.telegram.ui.fd, org.telegram.messenger.ChannelBoostsController$CanApplyBoost):void");
    }

    public static void W(org.telegram.ui.fd r22, org.telegram.tgnet.TLRPC.ChatFull r23, android.view.View r24, int r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fd.W(org.telegram.ui.fd, org.telegram.tgnet.TLRPC$ChatFull, android.view.View, int):void");
    }

    public static void Y0(View view) {
        int i10;
        if (view instanceof sc) {
            sc scVar = (sc) view;
            scVar.f41889a.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, scVar.d));
        } else if (view instanceof org.telegram.ui.Cells.r8) {
            ((org.telegram.ui.Cells.r8) view).v();
        } else if (view instanceof wc) {
            wc wcVar = (wc) view;
            AndroidUtilities.forEachViews((RecyclerView) wcVar.f43131b, (Utilities.Callback<View>) new tc(0, wcVar, MessagesController.getInstance(wcVar.d).peerColors));
        } else if (view instanceof dd) {
            dd ddVar = (dd) view;
            ArrayList arrayList = ddVar.f36765c;
            org.telegram.ui.ActionBar.c6 c6Var = ddVar.f36764b;
            if (c6Var != null) {
                i10 = c6Var.a();
            } else {
                i10 = org.telegram.ui.ActionBar.h6.I.q();
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((org.telegram.ui.Components.dq) arrayList.get(i11)).f25448c = i10;
            }
            AndroidUtilities.forEachViews((RecyclerView) ddVar.d, (Utilities.Callback<View>) new zc(ddVar, 0));
            ddVar.h.l();
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
                return groupStickerSetById.documents.get(0).f19808id;
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
        if (this.f37727e == this.f37729f && this.h == this.f37737n && this.f37742r == this.f37744s && this.v == this.f37749w && DialogObject.emojiStatusesEqual(this.f37751x, this.f37753y) && ChatThemeController.wallpaperEquals(this.E, this.F)) {
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
        if (this.f37727e != this.f37729f) {
            MessagesController.PeerColors peerColors = getMessagesController().peerColors;
            if (peerColors == null) {
                color = null;
            } else {
                color = peerColors.getColor(this.f37729f);
            }
            if (color != null) {
                i10 = Math.max(0, color.getLvl(this.d));
            }
        }
        if (this.h != this.f37737n) {
            i10 = Math.max(i10, getMessagesController().channelBgIconLevelMin);
        }
        if (this.f37742r != this.f37744s) {
            MessagesController.PeerColors peerColors2 = getMessagesController().profilePeerColors;
            if (peerColors2 != null) {
                peerColor = peerColors2.getColor(this.f37744s);
            }
            if (peerColor != null) {
                i10 = Math.max(i10, peerColor.getLvl(this.d));
            }
        }
        if (this.v != this.f37749w) {
            i10 = Math.max(i10, J0());
        }
        if (!DialogObject.emojiStatusesEqual(this.f37751x, this.f37753y)) {
            i10 = Math.max(i10, F0());
        }
        if (!ChatThemeController.wallpaperEquals(this.E, this.F)) {
            return Math.max(i10, O0());
        }
        return i10;
    }

    public final void U0(boolean z10, boolean z11) {
        int i10;
        if (this.f37740p0 != z10) {
            this.f37740p0 = z10;
            int i11 = 0;
            if (z11) {
                org.telegram.ui.Components.fk0 fk0Var = this.K;
                if (z10) {
                    i11 = fk0Var.f26107e[0];
                }
                fk0Var.P(i11);
                org.telegram.ui.Components.fk0 fk0Var2 = this.K;
                if (fk0Var2 != null) {
                    fk0Var2.start();
                    return;
                }
                return;
            }
            if (z10) {
                i10 = this.K.f26107e[0] - 1;
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
        alertDialog$Builder.f20141a.R = LocaleController.getString(R.string.ChannelColorUnsaved);
        alertDialog$Builder.f20141a.T = LocaleController.getString(R.string.ChannelColorUnsavedMessage);
        alertDialog$Builder.h(LocaleController.getString(R.string.Dismiss), new org.telegram.ui.ActionBar.z1(this) {
            public final fd f39444b;

            {
                this.f39444b = this;
            }

            @Override
            public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
                switch (r2) {
                    case 0:
                        this.f39444b.finishFragment();
                        return;
                    default:
                        this.f39444b.w0();
                        return;
                }
            }
        });
        alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new org.telegram.ui.ActionBar.z1(this) {
            public final fd f39444b;

            {
                this.f39444b = this;
            }

            @Override
            public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
                switch (r2) {
                    case 0:
                        this.f39444b.finishFragment();
                        return;
                    default:
                        this.f39444b.w0();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20141a;
        showDialog(a2Var);
        ((TextView) a2Var.d(-2)).setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f20799q7));
    }

    public final void W0(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        if (tL_premium_boostsStatus != null) {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.f37720a));
            this.f37724c = tL_premium_boostsStatus;
            int i10 = tL_premium_boostsStatus.level;
            this.f37722b = i10;
            if (chat != null) {
                chat.level = i10;
            }
            rc rcVar = this.N;
            if (rcVar != null) {
                rcVar.l();
            }
            X0(true);
        }
    }

    public void X0(boolean z10) {
        if (this.P != null && this.f37724c != null) {
            int S0 = S0();
            if (this.f37722b >= S0) {
                this.P.f(null, z10);
                return;
            }
            if (this.I == null) {
                this.I = new SpannableStringBuilder("l");
                org.telegram.ui.Components.gr grVar = new org.telegram.ui.Components.gr(R.drawable.mini_switch_lock, 0);
                grVar.setTopOffset(1);
                this.I.setSpan(grVar, 0, 1, 33);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.I).append((CharSequence) LocaleController.formatPluralString("BoostLevelRequired", S0, new Object[0]));
            this.P.f(spannableStringBuilder, z10);
        }
    }

    public void Z0(boolean z10) {
        int themedColor;
        this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.h6.f20839s8));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = -1;
        if (this.d && this.f37744s != -1) {
            themedColor = -1;
        } else {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.h6.A8);
        }
        kVar.setTitleColor(themedColor);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        if (!this.d || this.f37744s == -1) {
            i10 = getThemedColor(org.telegram.ui.ActionBar.h6.f20894v8);
        }
        kVar2.E(i10, false);
        this.actionBar.D(getThemedColor(org.telegram.ui.ActionBar.h6.f20858t8), false);
        if (!z10) {
            org.telegram.ui.Components.wm0 wm0Var = this.M;
            int i11 = org.telegram.ui.ActionBar.h6.f20503a7;
            wm0Var.setBackgroundColor(getThemedColor(i11));
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
                    messageObject.overrideLinkColor = this.f37729f;
                    messageObject.overrideLinkEmoji = this.f37737n;
                    cells[i10].setAvatar(messageObject);
                    cells[i10].invalidate();
                }
            }
            Drawable f7 = ci.b7.f(this.H, this.currentAccount, this.F, this.J);
            this.H = f7;
            gaVar.setOverrideBackground(f7);
        }
        if (y03 instanceof zp0) {
            ((zp0) y03).a(this.f37729f, z10);
        } else if (y03 instanceof wc) {
            ((wc) y03).a(this.f37729f, z10);
        }
        if (y04 instanceof sc) {
            sc scVar = (sc) y04;
            scVar.a(this.currentAccount, this.f37729f, true);
            scVar.c(this.f37737n, false, z10);
        }
        if (y05 instanceof dd) {
            dd ddVar = (dd) y05;
            String wallpaperEmoticon = ChatThemeController.getWallpaperEmoticon(this.F);
            if (wallpaperEmoticon == null && this.F == null && this.G != null) {
                wallpaperEmoticon = "❌";
            }
            ddVar.a(wallpaperEmoticon, z10);
            ddVar.setGalleryWallpaper(this.G);
        }
    }

    public final void b1() {
        TLRPC.StickerSet stickerSet;
        TLRPC.StickerSet stickerSet2;
        View y02 = y0(this.Z);
        View y03 = y0(this.f37723b0);
        View y04 = y0(this.f37725c0);
        View y05 = y0(this.f37730f0);
        View y06 = y0(this.f37732h0);
        View y07 = y0(this.f37734j0);
        if (y02 instanceof yc) {
            TLRPC.EmojiStatus emojiStatus = this.f37753y;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                yc ycVar = (yc) y02;
                xc xcVar = ycVar.f44445b;
                MessagesController.PeerColor fromCollectible = MessagesController.PeerColor.fromCollectible(emojiStatus);
                xcVar.c(fromCollectible, true);
                ycVar.f44444a.c(fromCollectible, true);
                xcVar.d(((TLRPC.TL_emojiStatusCollectible) this.f37753y).pattern_document_id, true, true);
            } else {
                yc ycVar2 = (yc) y02;
                xc xcVar2 = ycVar2.f44445b;
                int i10 = this.f37744s;
                xcVar2.b(i10, true);
                ycVar2.f44444a.b(ycVar2.h.currentAccount, i10, true);
                xcVar2.d(this.f37749w, false, true);
            }
            yc ycVar3 = (yc) y02;
            xc xcVar3 = ycVar3.f44445b;
            xcVar3.e(DialogObject.getEmojiStatusDocumentId(this.f37753y), false, true);
            xcVar3.a(this.f37729f);
            ycVar3.e();
        }
        if (y03 instanceof zp0) {
            ((zp0) y03).a(this.f37744s, true);
        } else if (y03 instanceof wc) {
            ((wc) y03).a(this.f37729f, true);
        }
        if (y04 instanceof sc) {
            sc scVar = (sc) y04;
            scVar.a(this.currentAccount, this.f37744s, false);
            scVar.c(this.f37749w, false, true);
        }
        if (y05 instanceof sc) {
            TLRPC.EmojiStatus emojiStatus2 = this.f37753y;
            if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                ((sc) y05).b(MessagesController.PeerColor.fromCollectible(emojiStatus2));
            } else {
                ((sc) y05).a(this.currentAccount, this.f37744s, false);
            }
            ((sc) y05).c(DialogObject.getEmojiStatusDocumentId(this.f37753y), DialogObject.isEmojiStatusCollectible(this.f37753y), true);
        }
        boolean z10 = y06 instanceof sc;
        long j3 = this.f37720a;
        if (z10) {
            sc scVar2 = (sc) y06;
            scVar2.a(this.currentAccount, this.f37744s, false);
            TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-j3);
            if (chatFull != null && (stickerSet2 = chatFull.emojiset) != null) {
                scVar2.c(D0(stickerSet2), false, false);
            } else {
                scVar2.c(0L, false, false);
            }
        }
        if (y07 instanceof sc) {
            TLRPC.ChatFull chatFull2 = getMessagesController().getChatFull(-j3);
            if (chatFull2 != null && (stickerSet = chatFull2.stickerset) != null) {
                ((sc) y07).d(C0(stickerSet));
            } else {
                ((sc) y07).c(0L, false, false);
            }
        }
        c1();
    }

    public void c1() {
        rc rcVar;
        rc rcVar2;
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
        this.f37723b0 = i10 + 6;
        int i11 = i10 + 8;
        this.R = i11;
        this.f37725c0 = i10 + 7;
        if (this.f37749w == 0 && this.f37744s < 0 && !(this.f37753y instanceof TLRPC.TL_emojiStatusCollectible)) {
            int i12 = this.f37728e0;
            this.f37728e0 = -1;
            if (i12 >= 0 && (rcVar2 = this.N) != null) {
                rcVar2.u(i12);
                this.N.m(this.f37725c0);
            }
        } else {
            if (this.f37728e0 >= 0) {
                z10 = true;
            }
            this.R = i10 + 9;
            this.f37728e0 = i11;
            if (!z10 && (rcVar = this.N) != null) {
                rcVar.o(i11);
                this.N.m(this.f37725c0);
            }
        }
        int i13 = this.R;
        this.f37726d0 = i13;
        this.f37730f0 = i13 + 1;
        this.R = i13 + 3;
        this.f37731g0 = i13 + 2;
    }

    @Override
    public View createView(Context context) {
        MessagesController messagesController = getMessagesController();
        long j3 = -this.f37720a;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
        if (chat != null) {
            int colorId = ChatObject.getColorId(chat);
            this.f37729f = colorId;
            this.f37727e = colorId;
            long emojiId = ChatObject.getEmojiId(chat);
            this.f37737n = emojiId;
            this.h = emojiId;
            int profileColorId = ChatObject.getProfileColorId(chat);
            this.f37744s = profileColorId;
            this.f37742r = profileColorId;
            long profileEmojiId = ChatObject.getProfileEmojiId(chat);
            this.f37749w = profileEmojiId;
            this.v = profileEmojiId;
            TLRPC.EmojiStatus emojiStatus = chat.emoji_status;
            this.f37753y = emojiStatus;
            this.f37751x = emojiStatus;
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
        this.actionBar.setActionBarMenuOnItemClick(new lc(this, 0));
        org.telegram.ui.Components.fk0 fk0Var = new org.telegram.ui.Components.fk0(R.raw.sun, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.K = fk0Var;
        fk0Var.h = true;
        if (!this.J) {
            fk0Var.P(0);
            this.K.M(0);
        } else {
            fk0Var.M(35);
            this.K.P(36);
        }
        this.K.Z = true;
        int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.J9, this.resourceProvider);
        this.K.Q(w02, "Sunny");
        this.K.Q(w02, "Path 6");
        this.K.Q(w02, "Path");
        this.K.Q(w02, "Path 5");
        this.L = this.actionBar.p().d(1, this.K);
        FrameLayout frameLayout = new FrameLayout(context);
        c1();
        x0();
        if (!this.d) {
            this.actionBar.setAdaptiveBackground(this.M);
        }
        org.telegram.ui.Components.wm0 wm0Var = this.M;
        rc rcVar = new rc(this);
        this.N = rcVar;
        wm0Var.setAdapter(rcVar);
        new s4.s(3);
        this.M.setLayoutManager(new s4.d0());
        org.telegram.ui.Components.wm0 wm0Var2 = this.M;
        int i10 = org.telegram.ui.ActionBar.h6.f20503a7;
        wm0Var2.setBackgroundColor(getThemedColor(i10));
        frameLayout.addView(this.M, w7.w5.a(-1.0f, 0.0f, 0.0f, 0.0f, 68.0f, -1, 119));
        this.M.setOnItemClickListener(new ai.o6(4, this, chatFull));
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(org.telegram.ui.Components.js.h);
        jVar.C = false;
        jVar.f47929m = false;
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
        this.O.addView(this.P, w7.w5.a(48.0f, 10.0f, 10.0f, 10.0f, 10.0f, -1, 80));
        frameLayout.addView(this.O, w7.w5.e(-1, 68, 80));
        setBulletinDelegate(new b9(this, 1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fd.d1():void");
    }

    @Override
    public void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.chatWasBoostedByUser;
        long j3 = this.f37720a;
        if (i10 == i12) {
            if (j3 == ((Long) objArr[2]).longValue()) {
                W0((TL_stories.TL_premium_boostsStatus) objArr[0]);
            }
        } else if (i10 == NotificationCenter.boostByChannelCreated) {
            if (!((Boolean) objArr[1]).booleanValue()) {
                getMessagesController().getBoostsController().getBoostsStats(j3, new ic(this, 2));
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
        if (Q0() && this.f37722b >= S0()) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.f37722b >= S0() && Q0()) {
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
    public final void setResourceProvider(org.telegram.ui.ActionBar.c6 c6Var) {
        this.f37741q0 = c6Var;
    }

    public final void w0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fd.w0():void");
    }

    public void x0() {
        org.telegram.ui.Components.wm0 wm0Var = new org.telegram.ui.Components.wm0(getParentActivity(), this.resourceProvider);
        this.M = wm0Var;
        wm0Var.setSections(false);
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
