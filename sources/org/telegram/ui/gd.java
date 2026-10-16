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
public class gd extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public TLRPC.WallPaper E;
    public TLRPC.WallPaper F;
    public TLRPC.WallPaper G;
    public Drawable H;
    public SpannableStringBuilder I;
    public boolean J;
    public org.telegram.ui.Components.yj0 K;
    public org.telegram.ui.ActionBar.u0 L;
    public org.telegram.ui.Components.mm0 M;
    public sc N;
    public FrameLayout O;
    public di.d P;
    public pc Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public final long f36137a;
    public int f36138a0;
    public int f36139b;
    public int f36140b0;
    public TL_stories.TL_premium_boostsStatus f36141c;
    public int f36142c0;
    public boolean d;
    public int f36143d0;
    public int e;
    public int f36144e0;
    public int f36145f;
    public int f36146f0;
    public int f36147g0;
    public long h;
    public int f36148h0;
    public int f36149i0;
    public int f36150j0;
    public int f36151k0;
    public org.telegram.ui.ActionBar.m2 f36152l0;
    public qc m0;
    public long f36153n;
    public float f36154n0;
    public ValueAnimator f36155o0;
    public boolean f36156p0;
    public org.telegram.ui.ActionBar.c6 f36157q0;
    public int f36158r;
    public final SparseIntArray f36159r0;
    public int f36160s;
    public final org.telegram.ui.ActionBar.d5 f36161s0;
    public final org.telegram.ui.ActionBar.d5 f36162t0;
    public final org.telegram.ui.ActionBar.d5 f36163u0;
    public long v;
    public final org.telegram.ui.ActionBar.d5 f36164v0;
    public long f36165w;
    public final Drawable f36166w0;
    public TLRPC.EmojiStatus f36167x;
    public final Drawable f36168x0;
    public TLRPC.EmojiStatus f36169y;
    public final Paint f36170y0;

    public gd(long j10) {
        super(null);
        boolean q6 = org.telegram.ui.ActionBar.g6.I.q();
        this.J = q6;
        this.R = 0;
        this.f36156p0 = q6;
        this.f36159r0 = new SparseIntArray();
        Paint paint = new Paint(1);
        this.f36170y0 = paint;
        paint.setStrokeWidth(1.0f);
        paint.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19602d7, this.resourceProvider));
        this.f36166w0 = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_check_s).mutate();
        this.f36168x0 = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_halfcheck).mutate();
        this.f36137a = j10;
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j10));
        if (chat != null) {
            this.f36139b = chat.level;
        }
        MessagesController.getInstance(this.currentAccount).getBoostsController().getBoostsStats(j10, new bi.v2(29, this, chat));
        this.resourceProvider = new fd(this);
        this.f36161s0 = new org.telegram.ui.ActionBar.d5(0, false, false, this.resourceProvider);
        this.f36162t0 = new org.telegram.ui.ActionBar.d5(0, false, true, this.resourceProvider);
        this.f36163u0 = new org.telegram.ui.ActionBar.d5(0, true, false, this.resourceProvider);
        this.f36164v0 = new org.telegram.ui.ActionBar.d5(0, true, true, this.resourceProvider);
    }

    public static void U(gd gdVar) {
        org.telegram.ui.ActionBar.c6 c6Var = gdVar.resourceProvider;
        if (c6Var instanceof fd) {
            gd gdVar2 = ((fd) c6Var).f35507a;
            gdVar2.J = !gdVar2.J;
            gdVar2.d1();
            gdVar2.Z0(false);
        } else {
            gdVar.J = !gdVar.J;
            gdVar.d1();
        }
        gdVar.U0(gdVar.J, true);
        gdVar.Z0(false);
    }

    public static void V(org.telegram.ui.gd r13, org.telegram.messenger.ChannelBoostsController.CanApplyBoost r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gd.V(org.telegram.ui.gd, org.telegram.messenger.ChannelBoostsController$CanApplyBoost):void");
    }

    public static void W(org.telegram.ui.gd r22, org.telegram.tgnet.TLRPC.ChatFull r23, android.view.View r24, int r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gd.W(org.telegram.ui.gd, org.telegram.tgnet.TLRPC$ChatFull, android.view.View, int):void");
    }

    public static void Y0(View view) {
        int i10;
        if (view instanceof tc) {
            tc tcVar = (tc) view;
            tcVar.f40068a.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, tcVar.d));
        } else if (view instanceof org.telegram.ui.Cells.r8) {
            ((org.telegram.ui.Cells.r8) view).v();
        } else if (view instanceof xc) {
            xc xcVar = (xc) view;
            AndroidUtilities.forEachViews((RecyclerView) xcVar.f41539b, (Utilities.Callback<View>) new uc(0, xcVar, MessagesController.getInstance(xcVar.d).peerColors));
        } else if (view instanceof ed) {
            ed edVar = (ed) view;
            ArrayList arrayList = edVar.f35258c;
            org.telegram.ui.ActionBar.c6 c6Var = edVar.f35257b;
            if (c6Var != null) {
                i10 = c6Var.a();
            } else {
                i10 = org.telegram.ui.ActionBar.g6.I.q();
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((org.telegram.ui.Components.yp) arrayList.get(i11)).f31347c = i10;
            }
            AndroidUtilities.forEachViews((RecyclerView) edVar.d, (Utilities.Callback<View>) new ad(edVar, 0));
            edVar.h.l();
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
                return groupStickerSetById.documents.get(0).f18922id;
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
        if (this.e == this.f36145f && this.h == this.f36153n && this.f36158r == this.f36160s && this.v == this.f36165w && DialogObject.emojiStatusesEqual(this.f36167x, this.f36169y) && ChatThemeController.wallpaperEquals(this.E, this.F)) {
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
        if (this.e != this.f36145f) {
            MessagesController.PeerColors peerColors = getMessagesController().peerColors;
            if (peerColors == null) {
                color = null;
            } else {
                color = peerColors.getColor(this.f36145f);
            }
            if (color != null) {
                i10 = Math.max(0, color.getLvl(this.d));
            }
        }
        if (this.h != this.f36153n) {
            i10 = Math.max(i10, getMessagesController().channelBgIconLevelMin);
        }
        if (this.f36158r != this.f36160s) {
            MessagesController.PeerColors peerColors2 = getMessagesController().profilePeerColors;
            if (peerColors2 != null) {
                peerColor = peerColors2.getColor(this.f36160s);
            }
            if (peerColor != null) {
                i10 = Math.max(i10, peerColor.getLvl(this.d));
            }
        }
        if (this.v != this.f36165w) {
            i10 = Math.max(i10, J0());
        }
        if (!DialogObject.emojiStatusesEqual(this.f36167x, this.f36169y)) {
            i10 = Math.max(i10, F0());
        }
        if (!ChatThemeController.wallpaperEquals(this.E, this.F)) {
            return Math.max(i10, O0());
        }
        return i10;
    }

    public final void U0(boolean z10, boolean z11) {
        int i10;
        if (this.f36156p0 != z10) {
            this.f36156p0 = z10;
            int i11 = 0;
            if (z11) {
                org.telegram.ui.Components.yj0 yj0Var = this.K;
                if (z10) {
                    i11 = yj0Var.e[0];
                }
                yj0Var.P(i11);
                org.telegram.ui.Components.yj0 yj0Var2 = this.K;
                if (yj0Var2 != null) {
                    yj0Var2.start();
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
        alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.ChannelColorUnsaved);
        alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.ChannelColorUnsavedMessage);
        alertDialog$Builder.h(LocaleController.getString(R.string.Dismiss), new org.telegram.ui.ActionBar.z1(this) {
            public final gd f37964b;

            {
                this.f37964b = this;
            }

            @Override
            public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
                switch (r2) {
                    case 0:
                        this.f37964b.finishFragment();
                        return;
                    default:
                        this.f37964b.w0();
                        return;
                }
            }
        });
        alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new org.telegram.ui.ActionBar.z1(this) {
            public final gd f37964b;

            {
                this.f37964b = this;
            }

            @Override
            public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
                switch (r2) {
                    case 0:
                        this.f37964b.finishFragment();
                        return;
                    default:
                        this.f37964b.w0();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
        showDialog(a2Var);
        ((TextView) a2Var.d(-2)).setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f19839q7));
    }

    public final void W0(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        if (tL_premium_boostsStatus != null) {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.f36137a));
            this.f36141c = tL_premium_boostsStatus;
            int i10 = tL_premium_boostsStatus.level;
            this.f36139b = i10;
            if (chat != null) {
                chat.level = i10;
            }
            sc scVar = this.N;
            if (scVar != null) {
                scVar.l();
            }
            X0(true);
        }
    }

    public void X0(boolean z10) {
        if (this.P != null && this.f36141c != null) {
            int S0 = S0();
            if (this.f36139b >= S0) {
                this.P.f(null, z10);
                return;
            }
            if (this.I == null) {
                this.I = new SpannableStringBuilder("l");
                org.telegram.ui.Components.br brVar = new org.telegram.ui.Components.br(R.drawable.mini_switch_lock, 0);
                brVar.setTopOffset(1);
                this.I.setSpan(brVar, 0, 1, 33);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.I).append((CharSequence) LocaleController.formatPluralString("BoostLevelRequired", S0, new Object[0]));
            this.P.f(spannableStringBuilder, z10);
        }
    }

    public void Z0(boolean z10) {
        int themedColor;
        this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.f19880s8));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = -1;
        if (this.d && this.f36160s != -1) {
            themedColor = -1;
        } else {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.g6.A8);
        }
        kVar.setTitleColor(themedColor);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        if (!this.d || this.f36160s == -1) {
            i10 = getThemedColor(org.telegram.ui.ActionBar.g6.f19935v8);
        }
        kVar2.D(i10, false);
        this.actionBar.C(getThemedColor(org.telegram.ui.ActionBar.g6.f19899t8), false);
        if (!z10) {
            org.telegram.ui.Components.mm0 mm0Var = this.M;
            int i11 = org.telegram.ui.ActionBar.g6.f19543a7;
            mm0Var.setBackgroundColor(getThemedColor(i11));
            this.N.l();
            AndroidUtilities.forEachViews((RecyclerView) this.M, (Utilities.Callback<View>) new bi.f(this));
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
                    messageObject.overrideLinkColor = this.f36145f;
                    messageObject.overrideLinkEmoji = this.f36153n;
                    cells[i10].setAvatar(messageObject);
                    cells[i10].invalidate();
                }
            }
            Drawable f7 = di.a7.f(this.H, this.currentAccount, this.F, this.J);
            this.H = f7;
            gaVar.setOverrideBackground(f7);
        }
        if (y03 instanceof bq0) {
            ((bq0) y03).a(this.f36145f, z10);
        } else if (y03 instanceof xc) {
            ((xc) y03).a(this.f36145f, z10);
        }
        if (y04 instanceof tc) {
            tc tcVar = (tc) y04;
            tcVar.a(this.currentAccount, this.f36145f, true);
            tcVar.c(this.f36153n, false, z10);
        }
        if (y05 instanceof ed) {
            ed edVar = (ed) y05;
            String wallpaperEmoticon = ChatThemeController.getWallpaperEmoticon(this.F);
            if (wallpaperEmoticon == null && this.F == null && this.G != null) {
                wallpaperEmoticon = "❌";
            }
            edVar.a(wallpaperEmoticon, z10);
            edVar.setGalleryWallpaper(this.G);
        }
    }

    public final void b1() {
        TLRPC.StickerSet stickerSet;
        TLRPC.StickerSet stickerSet2;
        View y02 = y0(this.Z);
        View y03 = y0(this.f36140b0);
        View y04 = y0(this.f36142c0);
        View y05 = y0(this.f36146f0);
        View y06 = y0(this.f36148h0);
        View y07 = y0(this.f36150j0);
        if (y02 instanceof zc) {
            TLRPC.EmojiStatus emojiStatus = this.f36169y;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                zc zcVar = (zc) y02;
                yc ycVar = zcVar.f42274b;
                MessagesController.PeerColor fromCollectible = MessagesController.PeerColor.fromCollectible(emojiStatus);
                ycVar.c(fromCollectible, true);
                zcVar.f42273a.c(fromCollectible, true);
                ycVar.d(((TLRPC.TL_emojiStatusCollectible) this.f36169y).pattern_document_id, true, true);
            } else {
                zc zcVar2 = (zc) y02;
                yc ycVar2 = zcVar2.f42274b;
                int i10 = this.f36160s;
                ycVar2.b(i10, true);
                zcVar2.f42273a.b(zcVar2.h.currentAccount, i10, true);
                ycVar2.d(this.f36165w, false, true);
            }
            zc zcVar3 = (zc) y02;
            yc ycVar3 = zcVar3.f42274b;
            ycVar3.e(DialogObject.getEmojiStatusDocumentId(this.f36169y), false, true);
            ycVar3.a(this.f36145f);
            zcVar3.d();
        }
        if (y03 instanceof bq0) {
            ((bq0) y03).a(this.f36160s, true);
        } else if (y03 instanceof xc) {
            ((xc) y03).a(this.f36145f, true);
        }
        if (y04 instanceof tc) {
            tc tcVar = (tc) y04;
            tcVar.a(this.currentAccount, this.f36160s, false);
            tcVar.c(this.f36165w, false, true);
        }
        if (y05 instanceof tc) {
            TLRPC.EmojiStatus emojiStatus2 = this.f36169y;
            if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                ((tc) y05).b(MessagesController.PeerColor.fromCollectible(emojiStatus2));
            } else {
                ((tc) y05).a(this.currentAccount, this.f36160s, false);
            }
            ((tc) y05).c(DialogObject.getEmojiStatusDocumentId(this.f36169y), DialogObject.isEmojiStatusCollectible(this.f36169y), true);
        }
        boolean z10 = y06 instanceof tc;
        long j10 = this.f36137a;
        if (z10) {
            tc tcVar2 = (tc) y06;
            tcVar2.a(this.currentAccount, this.f36160s, false);
            TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-j10);
            if (chatFull != null && (stickerSet2 = chatFull.emojiset) != null) {
                tcVar2.c(D0(stickerSet2), false, false);
            } else {
                tcVar2.c(0L, false, false);
            }
        }
        if (y07 instanceof tc) {
            TLRPC.ChatFull chatFull2 = getMessagesController().getChatFull(-j10);
            if (chatFull2 != null && (stickerSet = chatFull2.stickerset) != null) {
                ((tc) y07).d(C0(stickerSet));
            } else {
                ((tc) y07).c(0L, false, false);
            }
        }
        c1();
    }

    public void c1() {
        sc scVar;
        sc scVar2;
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
        this.f36140b0 = i10 + 6;
        int i11 = i10 + 8;
        this.R = i11;
        this.f36142c0 = i10 + 7;
        if (this.f36165w == 0 && this.f36160s < 0 && !(this.f36169y instanceof TLRPC.TL_emojiStatusCollectible)) {
            int i12 = this.f36144e0;
            this.f36144e0 = -1;
            if (i12 >= 0 && (scVar2 = this.N) != null) {
                scVar2.u(i12);
                this.N.m(this.f36142c0);
            }
        } else {
            if (this.f36144e0 >= 0) {
                z10 = true;
            }
            this.R = i10 + 9;
            this.f36144e0 = i11;
            if (!z10 && (scVar = this.N) != null) {
                scVar.o(i11);
                this.N.m(this.f36142c0);
            }
        }
        int i13 = this.R;
        this.f36143d0 = i13;
        this.f36146f0 = i13 + 1;
        this.R = i13 + 3;
        this.f36147g0 = i13 + 2;
    }

    @Override
    public View createView(Context context) {
        MessagesController messagesController = getMessagesController();
        long j10 = -this.f36137a;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        if (chat != null) {
            int colorId = ChatObject.getColorId(chat);
            this.f36145f = colorId;
            this.e = colorId;
            long emojiId = ChatObject.getEmojiId(chat);
            this.f36153n = emojiId;
            this.h = emojiId;
            int profileColorId = ChatObject.getProfileColorId(chat);
            this.f36160s = profileColorId;
            this.f36158r = profileColorId;
            long profileEmojiId = ChatObject.getProfileEmojiId(chat);
            this.f36165w = profileEmojiId;
            this.v = profileEmojiId;
            TLRPC.EmojiStatus emojiStatus = chat.emoji_status;
            this.f36169y = emojiStatus;
            this.f36167x = emojiStatus;
        }
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(j10);
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
        this.actionBar.setActionBarMenuOnItemClick(new nb(this, 1));
        org.telegram.ui.Components.yj0 yj0Var = new org.telegram.ui.Components.yj0(R.raw.sun, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.K = yj0Var;
        yj0Var.h = true;
        if (!this.J) {
            yj0Var.P(0);
            this.K.M(0);
        } else {
            yj0Var.M(35);
            this.K.P(36);
        }
        this.K.Z = true;
        int w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.J9, this.resourceProvider);
        this.K.Q(w02, "Sunny");
        this.K.Q(w02, "Path 6");
        this.K.Q(w02, "Path");
        this.K.Q(w02, "Path 5");
        this.L = this.actionBar.n().d(1, this.K);
        FrameLayout frameLayout = new FrameLayout(context);
        c1();
        x0();
        if (!this.d) {
            this.actionBar.setAdaptiveBackground(this.M);
        }
        org.telegram.ui.Components.mm0 mm0Var = this.M;
        sc scVar = new sc(this);
        this.N = scVar;
        mm0Var.setAdapter(scVar);
        new s4.s(3);
        this.M.setLayoutManager(new s4.b0());
        org.telegram.ui.Components.mm0 mm0Var2 = this.M;
        int i10 = org.telegram.ui.ActionBar.g6.f19543a7;
        mm0Var2.setBackgroundColor(getThemedColor(i10));
        frameLayout.addView(this.M, w7.z5.a(-1.0f, 0.0f, 0.0f, 0.0f, 68.0f, -1, 119));
        this.M.setOnItemClickListener(new bi.z5(4, this, chatFull));
        s4.k kVar = new s4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.es.h);
        kVar.C = false;
        kVar.f44872m = false;
        this.M.setItemAnimator(kVar);
        di.d dVar = new di.d(context, this.resourceProvider, true);
        dVar.setRoundRadius(24);
        this.P = dVar;
        dVar.g(LocaleController.getString(R.string.ApplyChanges), false, true);
        this.P.setOnClickListener(new a(this, 11));
        X0(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.O = frameLayout2;
        frameLayout2.setBackgroundColor(getThemedColor(i10));
        this.O.addView(this.P, w7.z5.a(48.0f, 10.0f, 10.0f, 10.0f, 10.0f, -1, 80));
        frameLayout.addView(this.O, w7.z5.e(-1, 68, 80));
        setBulletinDelegate(new c9(this, 1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gd.d1():void");
    }

    @Override
    public void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.chatWasBoostedByUser;
        long j10 = this.f36137a;
        if (i10 == i12) {
            if (j10 == ((Long) objArr[2]).longValue()) {
                W0((TL_stories.TL_premium_boostsStatus) objArr[0]);
            }
        } else if (i10 == NotificationCenter.boostByChannelCreated) {
            if (!((Boolean) objArr[1]).booleanValue()) {
                getMessagesController().getBoostsController().getBoostsStats(j10, new kc(this, 2));
            }
        } else if (i10 == NotificationCenter.dialogDeleted && j10 == ((Long) objArr[0]).longValue()) {
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
        if (Q0() && this.f36139b >= S0()) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.f36139b >= S0() && Q0()) {
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
        this.f36157q0 = c6Var;
    }

    public final void w0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gd.w0():void");
    }

    public void x0() {
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(getParentActivity(), this.resourceProvider);
        this.M = mm0Var;
        mm0Var.setSections(false);
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
