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
    public org.telegram.ui.Components.ij0 H;
    public org.telegram.ui.ActionBar.w0 I;
    public org.telegram.ui.Components.tl0 J;
    public nc K;
    public FrameLayout L;
    public qh.d M;
    public jc N;
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
    public final long f35420a;
    public int f35421a0;
    public int f35422b;
    public int f35423b0;
    public TL_stories.TL_premium_boostsStatus f35424c;
    public int f35425c0;
    public boolean d;
    public int f35426d0;
    public int f35427e;
    public int f35428e0;
    public int f35429f;
    public int f35430f0;
    public int f35431g0;
    public long h;
    public int f35432h0;
    public org.telegram.ui.ActionBar.p2 f35433i0;
    public kc f35434j0;
    public float f35435k0;
    public ValueAnimator f35436l0;
    public boolean m0;
    public long f35437n;
    public org.telegram.ui.ActionBar.g6 f35438n0;
    public final SparseIntArray f35439o0;
    public final org.telegram.ui.ActionBar.h5 f35440p0;
    public final org.telegram.ui.ActionBar.h5 f35441q0;
    public int f35442r;
    public final org.telegram.ui.ActionBar.h5 f35443r0;
    public int f35444s;
    public final org.telegram.ui.ActionBar.h5 f35445s0;
    public final Drawable f35446t0;
    public final Drawable f35447u0;
    public long v;
    public final Paint f35448v0;
    public long f35449w;
    public TLRPC.EmojiStatus f35450x;
    public TLRPC.EmojiStatus f35451y;

    public bd(long j10) {
        super(null);
        boolean q10 = org.telegram.ui.ActionBar.k6.I.q();
        this.G = q10;
        this.O = 0;
        this.m0 = q10;
        this.f35439o0 = new SparseIntArray();
        Paint paint = new Paint(1);
        this.f35448v0 = paint;
        paint.setStrokeWidth(1.0f);
        paint.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21660d7, this.resourceProvider));
        this.f35446t0 = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_check_s).mutate();
        this.f35447u0 = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_halfcheck).mutate();
        this.f35420a = j10;
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j10));
        if (chat != null) {
            this.f35422b = chat.level;
        }
        MessagesController.getInstance(this.currentAccount).getBoostsController().getBoostsStats(j10, new oh.a2(1, this, chat));
        this.resourceProvider = new ad(this);
        this.f35440p0 = new org.telegram.ui.ActionBar.h5(0, false, false, this.resourceProvider);
        this.f35441q0 = new org.telegram.ui.ActionBar.h5(0, false, true, this.resourceProvider);
        this.f35443r0 = new org.telegram.ui.ActionBar.h5(0, true, false, this.resourceProvider);
        this.f35445s0 = new org.telegram.ui.ActionBar.h5(0, true, true, this.resourceProvider);
    }

    public static void U(bd bdVar) {
        org.telegram.ui.ActionBar.g6 g6Var = bdVar.resourceProvider;
        if (g6Var instanceof ad) {
            bd bdVar2 = ((ad) g6Var).f35131a;
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
        if (view instanceof oc) {
            oc ocVar = (oc) view;
            ocVar.f39717a.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, ocVar.d));
        } else if (view instanceof org.telegram.ui.Cells.o8) {
            ((org.telegram.ui.Cells.o8) view).v();
        } else if (view instanceof sc) {
            sc scVar = (sc) view;
            AndroidUtilities.forEachViews((RecyclerView) scVar.f41225b, (h5.d) new oh.a2(2, scVar, MessagesController.getInstance(scVar.d).peerColors));
        } else if (view instanceof zc) {
            zc zcVar = (zc) view;
            ArrayList arrayList = zcVar.f43894c;
            org.telegram.ui.ActionBar.g6 g6Var = zcVar.f43893b;
            if (g6Var != null) {
                i10 = g6Var.a();
            } else {
                i10 = org.telegram.ui.ActionBar.k6.I.q();
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((org.telegram.ui.Components.lp) arrayList.get(i11)).f28798c = i10;
            }
            AndroidUtilities.forEachViews((RecyclerView) zcVar.d, (h5.d) new vc(zcVar, 0));
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
                return groupStickerSetById.documents.get(0).f20849id;
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
        if (this.f35427e == this.f35429f && this.h == this.f35437n && this.f35442r == this.f35444s && this.v == this.f35449w && DialogObject.emojiStatusesEqual(this.f35450x, this.f35451y) && ChatThemeController.wallpaperEquals(this.B, this.C)) {
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
        if (this.f35427e != this.f35429f) {
            MessagesController.PeerColors peerColors = getMessagesController().peerColors;
            if (peerColors == null) {
                color = null;
            } else {
                color = peerColors.getColor(this.f35429f);
            }
            if (color != null) {
                i10 = Math.max(0, color.getLvl(this.d));
            }
        }
        if (this.h != this.f35437n) {
            i10 = Math.max(i10, getMessagesController().channelBgIconLevelMin);
        }
        if (this.f35442r != this.f35444s) {
            MessagesController.PeerColors peerColors2 = getMessagesController().profilePeerColors;
            if (peerColors2 != null) {
                peerColor = peerColors2.getColor(this.f35444s);
            }
            if (peerColor != null) {
                i10 = Math.max(i10, peerColor.getLvl(this.d));
            }
        }
        if (this.v != this.f35449w) {
            i10 = Math.max(i10, J0());
        }
        if (!DialogObject.emojiStatusesEqual(this.f35450x, this.f35451y)) {
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
                org.telegram.ui.Components.ij0 ij0Var = this.H;
                if (z4) {
                    i11 = ij0Var.f27817e[0];
                }
                ij0Var.N(i11);
                org.telegram.ui.Components.ij0 ij0Var2 = this.H;
                if (ij0Var2 != null) {
                    ij0Var2.start();
                    return;
                }
                return;
            }
            if (z4) {
                i10 = this.H.f27817e[0] - 1;
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
        alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.ChannelColorUnsaved);
        alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.ChannelColorUnsavedMessage);
        alertDialog$Builder.h(LocaleController.getString(R.string.Dismiss), new org.telegram.ui.ActionBar.c2(this) {
            public final bd f37154b;

            {
                this.f37154b = this;
            }

            @Override
            public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
                switch (r2) {
                    case 0:
                        this.f37154b.finishFragment();
                        return;
                    default:
                        this.f37154b.w0();
                        return;
                }
            }
        });
        alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new org.telegram.ui.ActionBar.c2(this) {
            public final bd f37154b;

            {
                this.f37154b = this;
            }

            @Override
            public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
                switch (r2) {
                    case 0:
                        this.f37154b.finishFragment();
                        return;
                    default:
                        this.f37154b.w0();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
        showDialog(d2Var);
        ((TextView) d2Var.d(-2)).setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21895q7));
    }

    public final void W0(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        if (tL_premium_boostsStatus != null) {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.f35420a));
            this.f35424c = tL_premium_boostsStatus;
            int i10 = tL_premium_boostsStatus.level;
            this.f35422b = i10;
            if (chat != null) {
                chat.level = i10;
            }
            nc ncVar = this.K;
            if (ncVar != null) {
                ncVar.l();
            }
            X0(true);
        }
    }

    public void X0(boolean z4) {
        if (this.M != null && this.f35424c != null) {
            int S0 = S0();
            if (this.f35422b >= S0) {
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
        this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21930s8));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = -1;
        if (this.d && this.f35444s != -1) {
            themedColor = -1;
        } else {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.A8);
        }
        kVar.setTitleColor(themedColor);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        if (!this.d || this.f35444s == -1) {
            i10 = getThemedColor(org.telegram.ui.ActionBar.k6.f21981v8);
        }
        kVar2.C(i10, false);
        this.actionBar.B(getThemedColor(org.telegram.ui.ActionBar.k6.f21946t8), false);
        if (!z4) {
            org.telegram.ui.Components.tl0 tl0Var = this.J;
            int i11 = org.telegram.ui.ActionBar.k6.f21605a7;
            tl0Var.setBackgroundColor(getThemedColor(i11));
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
                    messageObject.overrideLinkColor = this.f35429f;
                    messageObject.overrideLinkEmoji = this.f35437n;
                    cells[i10].setAvatar(messageObject);
                    cells[i10].invalidate();
                }
            }
            Drawable f10 = qh.j5.f(this.E, this.currentAccount, this.C, this.G);
            this.E = f10;
            eaVar.setOverrideBackground(f10);
        }
        if (y03 instanceof gp0) {
            ((gp0) y03).a(this.f35429f, z4);
        } else if (y03 instanceof sc) {
            ((sc) y03).a(this.f35429f, z4);
        }
        if (y04 instanceof oc) {
            oc ocVar = (oc) y04;
            ocVar.a(this.currentAccount, this.f35429f, true);
            ocVar.c(this.f35437n, false, z4);
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
        View y05 = y0(this.f35425c0);
        View y06 = y0(this.f35428e0);
        View y07 = y0(this.f35431g0);
        if (y02 instanceof uc) {
            TLRPC.EmojiStatus emojiStatus = this.f35451y;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                uc ucVar = (uc) y02;
                tc tcVar = ucVar.f41881b;
                MessagesController.PeerColor fromCollectible = MessagesController.PeerColor.fromCollectible(emojiStatus);
                tcVar.c(fromCollectible, true);
                ucVar.f41880a.c(fromCollectible, true);
                tcVar.d(((TLRPC.TL_emojiStatusCollectible) this.f35451y).pattern_document_id, true, true);
            } else {
                uc ucVar2 = (uc) y02;
                tc tcVar2 = ucVar2.f41881b;
                int i10 = this.f35444s;
                tcVar2.b(i10, true);
                ucVar2.f41880a.b(ucVar2.h.currentAccount, i10, true);
                tcVar2.d(this.f35449w, false, true);
            }
            uc ucVar3 = (uc) y02;
            tc tcVar3 = ucVar3.f41881b;
            tcVar3.e(DialogObject.getEmojiStatusDocumentId(this.f35451y), false, true);
            tcVar3.a(this.f35429f);
            ucVar3.e();
        }
        if (y03 instanceof gp0) {
            ((gp0) y03).a(this.f35444s, true);
        } else if (y03 instanceof sc) {
            ((sc) y03).a(this.f35429f, true);
        }
        if (y04 instanceof oc) {
            oc ocVar = (oc) y04;
            ocVar.a(this.currentAccount, this.f35444s, false);
            ocVar.c(this.f35449w, false, true);
        }
        if (y05 instanceof oc) {
            TLRPC.EmojiStatus emojiStatus2 = this.f35451y;
            if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                ((oc) y05).b(MessagesController.PeerColor.fromCollectible(emojiStatus2));
            } else {
                ((oc) y05).a(this.currentAccount, this.f35444s, false);
            }
            ((oc) y05).c(DialogObject.getEmojiStatusDocumentId(this.f35451y), DialogObject.isEmojiStatusCollectible(this.f35451y), true);
        }
        boolean z4 = y06 instanceof oc;
        long j10 = this.f35420a;
        if (z4) {
            oc ocVar2 = (oc) y06;
            ocVar2.a(this.currentAccount, this.f35444s, false);
            TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-j10);
            if (chatFull != null && (stickerSet2 = chatFull.emojiset) != null) {
                ocVar2.c(D0(stickerSet2), false, false);
            } else {
                ocVar2.c(0L, false, false);
            }
        }
        if (y07 instanceof oc) {
            TLRPC.ChatFull chatFull2 = getMessagesController().getChatFull(-j10);
            if (chatFull2 != null && (stickerSet = chatFull2.stickerset) != null) {
                ((oc) y07).d(C0(stickerSet));
            } else {
                ((oc) y07).c(0L, false, false);
            }
        }
        c1();
    }

    public void c1() {
        nc ncVar;
        nc ncVar2;
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
        if (this.f35449w == 0 && this.f35444s < 0 && !(this.f35451y instanceof TLRPC.TL_emojiStatusCollectible)) {
            int i12 = this.f35423b0;
            this.f35423b0 = -1;
            if (i12 >= 0 && (ncVar2 = this.K) != null) {
                ncVar2.u(i12);
                this.K.m(this.Z);
            }
        } else {
            if (this.f35423b0 >= 0) {
                z4 = true;
            }
            this.O = i10 + 9;
            this.f35423b0 = i11;
            if (!z4 && (ncVar = this.K) != null) {
                ncVar.o(i11);
                this.K.m(this.Z);
            }
        }
        int i13 = this.O;
        this.f35421a0 = i13;
        this.f35425c0 = i13 + 1;
        this.O = i13 + 3;
        this.f35426d0 = i13 + 2;
    }

    @Override
    public View createView(Context context) {
        MessagesController messagesController = getMessagesController();
        long j10 = -this.f35420a;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        if (chat != null) {
            int colorId = ChatObject.getColorId(chat);
            this.f35429f = colorId;
            this.f35427e = colorId;
            long emojiId = ChatObject.getEmojiId(chat);
            this.f35437n = emojiId;
            this.h = emojiId;
            int profileColorId = ChatObject.getProfileColorId(chat);
            this.f35444s = profileColorId;
            this.f35442r = profileColorId;
            long profileEmojiId = ChatObject.getProfileEmojiId(chat);
            this.f35449w = profileEmojiId;
            this.v = profileEmojiId;
            TLRPC.EmojiStatus emojiStatus = chat.emoji_status;
            this.f35451y = emojiStatus;
            this.f35450x = emojiStatus;
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
        int i10 = R.raw.sun;
        org.telegram.ui.Components.ij0 ij0Var = new org.telegram.ui.Components.ij0(i10, "" + R.raw.sun, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.H = ij0Var;
        ij0Var.h = true;
        if (!this.G) {
            ij0Var.N(0);
            this.H.K(0);
        } else {
            ij0Var.K(35);
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
        org.telegram.ui.Components.tl0 tl0Var = this.J;
        nc ncVar = new nc(this);
        this.K = ncVar;
        tl0Var.setAdapter(ncVar);
        new f2.w(3);
        this.J.setLayoutManager(new f2.j0());
        org.telegram.ui.Components.tl0 tl0Var2 = this.J;
        int i11 = org.telegram.ui.ActionBar.k6.f21605a7;
        tl0Var2.setBackgroundColor(getThemedColor(i11));
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
        frameLayout2.setBackgroundColor(getThemedColor(i11));
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
        long j10 = this.f35420a;
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
        if (Q0() && this.f35422b >= S0()) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z4) {
        if (this.f35422b >= S0() && Q0()) {
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
        this.f35438n0 = g6Var;
    }

    public final void w0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bd.w0():void");
    }

    public void x0() {
        org.telegram.ui.Components.tl0 tl0Var = new org.telegram.ui.Components.tl0(getParentActivity(), this.resourceProvider);
        this.J = tl0Var;
        tl0Var.setSections(false);
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
