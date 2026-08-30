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
    public org.telegram.ui.Components.gj0 H;
    public org.telegram.ui.ActionBar.w0 I;
    public org.telegram.ui.Components.sl0 J;
    public nc K;
    public FrameLayout L;
    public ph.d M;
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
    public final long f32910a;
    public int f32911a0;
    public int f32912b;
    public int f32913b0;
    public TL_stories.TL_premium_boostsStatus f32914c;
    public int f32915c0;
    public boolean d;
    public int f32916d0;
    public int e;
    public int f32917e0;
    public int f32918f;
    public int f32919f0;
    public int f32920g0;
    public long h;
    public int f32921h0;
    public org.telegram.ui.ActionBar.p2 f32922i0;
    public kc f32923j0;
    public float f32924k0;
    public ValueAnimator f32925l0;
    public boolean m0;
    public long f32926n;
    public org.telegram.ui.ActionBar.f6 f32927n0;
    public final SparseIntArray f32928o0;
    public final org.telegram.ui.ActionBar.g5 f32929p0;
    public final org.telegram.ui.ActionBar.g5 f32930q0;
    public int f32931r;
    public final org.telegram.ui.ActionBar.g5 f32932r0;
    public int f32933s;
    public final org.telegram.ui.ActionBar.g5 f32934s0;
    public final Drawable f32935t0;
    public final Drawable f32936u0;
    public long v;
    public final Paint f32937v0;
    public long f32938w;
    public TLRPC.EmojiStatus f32939x;
    public TLRPC.EmojiStatus f32940y;

    public bd(long j10) {
        super(null);
        boolean q10 = org.telegram.ui.ActionBar.j6.I.q();
        this.G = q10;
        this.O = 0;
        this.m0 = q10;
        this.f32928o0 = new SparseIntArray();
        Paint paint = new Paint(1);
        this.f32937v0 = paint;
        paint.setStrokeWidth(1.0f);
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19907d7, this.resourceProvider));
        this.f32935t0 = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_check_s).mutate();
        this.f32936u0 = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_halfcheck).mutate();
        this.f32910a = j10;
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j10));
        if (chat != null) {
            this.f32912b = chat.level;
        }
        MessagesController.getInstance(this.currentAccount).getBoostsController().getBoostsStats(j10, new nh.z1(1, this, chat));
        this.resourceProvider = new ad(this);
        this.f32929p0 = new org.telegram.ui.ActionBar.g5(0, false, false, this.resourceProvider);
        this.f32930q0 = new org.telegram.ui.ActionBar.g5(0, false, true, this.resourceProvider);
        this.f32932r0 = new org.telegram.ui.ActionBar.g5(0, true, false, this.resourceProvider);
        this.f32934s0 = new org.telegram.ui.ActionBar.g5(0, true, true, this.resourceProvider);
    }

    public static void U(bd bdVar) {
        org.telegram.ui.ActionBar.f6 f6Var = bdVar.resourceProvider;
        if (f6Var instanceof ad) {
            bd bdVar2 = ((ad) f6Var).f32520a;
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
            ocVar.f36869a.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, ocVar.d));
        } else if (view instanceof org.telegram.ui.Cells.o8) {
            ((org.telegram.ui.Cells.o8) view).v();
        } else if (view instanceof sc) {
            sc scVar = (sc) view;
            AndroidUtilities.forEachViews((RecyclerView) scVar.f38292b, (h5.d) new nh.z1(2, scVar, MessagesController.getInstance(scVar.d).peerColors));
        } else if (view instanceof zc) {
            zc zcVar = (zc) view;
            ArrayList arrayList = zcVar.f40757c;
            org.telegram.ui.ActionBar.f6 f6Var = zcVar.f40756b;
            if (f6Var != null) {
                i10 = f6Var.a();
            } else {
                i10 = org.telegram.ui.ActionBar.j6.I.q();
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((org.telegram.ui.Components.jp) arrayList.get(i11)).f26017c = i10;
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
                return groupStickerSetById.documents.get(0).f19190id;
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
        if (this.e == this.f32918f && this.h == this.f32926n && this.f32931r == this.f32933s && this.v == this.f32938w && DialogObject.emojiStatusesEqual(this.f32939x, this.f32940y) && ChatThemeController.wallpaperEquals(this.B, this.C)) {
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
        if (this.e != this.f32918f) {
            MessagesController.PeerColors peerColors = getMessagesController().peerColors;
            if (peerColors == null) {
                color = null;
            } else {
                color = peerColors.getColor(this.f32918f);
            }
            if (color != null) {
                i10 = Math.max(0, color.getLvl(this.d));
            }
        }
        if (this.h != this.f32926n) {
            i10 = Math.max(i10, getMessagesController().channelBgIconLevelMin);
        }
        if (this.f32931r != this.f32933s) {
            MessagesController.PeerColors peerColors2 = getMessagesController().profilePeerColors;
            if (peerColors2 != null) {
                peerColor = peerColors2.getColor(this.f32933s);
            }
            if (peerColor != null) {
                i10 = Math.max(i10, peerColor.getLvl(this.d));
            }
        }
        if (this.v != this.f32938w) {
            i10 = Math.max(i10, J0());
        }
        if (!DialogObject.emojiStatusesEqual(this.f32939x, this.f32940y)) {
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
        alertDialog$Builder.f19503a.O = LocaleController.getString(R.string.ChannelColorUnsaved);
        alertDialog$Builder.f19503a.Q = LocaleController.getString(R.string.ChannelColorUnsavedMessage);
        alertDialog$Builder.h(LocaleController.getString(R.string.Dismiss), new org.telegram.ui.ActionBar.c2(this) {
            public final bd f34568b;

            {
                this.f34568b = this;
            }

            @Override
            public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
                switch (r2) {
                    case 0:
                        this.f34568b.finishFragment();
                        return;
                    default:
                        this.f34568b.w0();
                        return;
                }
            }
        });
        alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new org.telegram.ui.ActionBar.c2(this) {
            public final bd f34568b;

            {
                this.f34568b = this;
            }

            @Override
            public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
                switch (r2) {
                    case 0:
                        this.f34568b.finishFragment();
                        return;
                    default:
                        this.f34568b.w0();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
        showDialog(d2Var);
        ((TextView) d2Var.d(-2)).setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f20141q7));
    }

    public final void W0(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        if (tL_premium_boostsStatus != null) {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.f32910a));
            this.f32914c = tL_premium_boostsStatus;
            int i10 = tL_premium_boostsStatus.level;
            this.f32912b = i10;
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
        if (this.M != null && this.f32914c != null) {
            int S0 = S0();
            if (this.f32912b >= S0) {
                this.M.f(null, z4);
                return;
            }
            if (this.F == null) {
                this.F = new SpannableStringBuilder("l");
                org.telegram.ui.Components.mq mqVar = new org.telegram.ui.Components.mq(R.drawable.mini_switch_lock, 0);
                mqVar.setTopOffset(1);
                this.F.setSpan(mqVar, 0, 1, 33);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.F).append((CharSequence) LocaleController.formatPluralString("BoostLevelRequired", S0, new Object[0]));
            this.M.f(spannableStringBuilder, z4);
        }
    }

    public void Z0(boolean z4) {
        int themedColor;
        this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.f20176s8));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = -1;
        if (this.d && this.f32933s != -1) {
            themedColor = -1;
        } else {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.A8);
        }
        kVar.setTitleColor(themedColor);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        if (!this.d || this.f32933s == -1) {
            i10 = getThemedColor(org.telegram.ui.ActionBar.j6.f20227v8);
        }
        kVar2.C(i10, false);
        this.actionBar.B(getThemedColor(org.telegram.ui.ActionBar.j6.f20192t8), false);
        if (!z4) {
            org.telegram.ui.Components.sl0 sl0Var = this.J;
            int i11 = org.telegram.ui.ActionBar.j6.f19852a7;
            sl0Var.setBackgroundColor(getThemedColor(i11));
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
        if (y02 instanceof org.telegram.ui.Cells.ea) {
            org.telegram.ui.Cells.ea eaVar = (org.telegram.ui.Cells.ea) y02;
            org.telegram.ui.Cells.t1[] cells = eaVar.getCells();
            for (int i10 = 0; i10 < cells.length; i10++) {
                org.telegram.ui.Cells.t1 t1Var = cells[i10];
                if (t1Var != null && (messageObject = t1Var.getMessageObject()) != null) {
                    messageObject.overrideLinkColor = this.f32918f;
                    messageObject.overrideLinkEmoji = this.f32926n;
                    cells[i10].setAvatar(messageObject);
                    cells[i10].invalidate();
                }
            }
            Drawable f10 = ph.l5.f(this.E, this.currentAccount, this.C, this.G);
            this.E = f10;
            eaVar.setOverrideBackground(f10);
        }
        if (y03 instanceof ep0) {
            ((ep0) y03).a(this.f32918f, z4);
        } else if (y03 instanceof sc) {
            ((sc) y03).a(this.f32918f, z4);
        }
        if (y04 instanceof oc) {
            oc ocVar = (oc) y04;
            ocVar.a(this.currentAccount, this.f32918f, true);
            ocVar.c(this.f32926n, false, z4);
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
        View y05 = y0(this.f32915c0);
        View y06 = y0(this.f32917e0);
        View y07 = y0(this.f32920g0);
        if (y02 instanceof uc) {
            TLRPC.EmojiStatus emojiStatus = this.f32940y;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                uc ucVar = (uc) y02;
                tc tcVar = ucVar.f38903b;
                MessagesController.PeerColor fromCollectible = MessagesController.PeerColor.fromCollectible(emojiStatus);
                tcVar.c(fromCollectible, true);
                ucVar.f38902a.c(fromCollectible, true);
                tcVar.d(((TLRPC.TL_emojiStatusCollectible) this.f32940y).pattern_document_id, true, true);
            } else {
                uc ucVar2 = (uc) y02;
                tc tcVar2 = ucVar2.f38903b;
                int i10 = this.f32933s;
                tcVar2.b(i10, true);
                ucVar2.f38902a.b(ucVar2.h.currentAccount, i10, true);
                tcVar2.d(this.f32938w, false, true);
            }
            uc ucVar3 = (uc) y02;
            tc tcVar3 = ucVar3.f38903b;
            tcVar3.e(DialogObject.getEmojiStatusDocumentId(this.f32940y), false, true);
            tcVar3.a(this.f32918f);
            ucVar3.e();
        }
        if (y03 instanceof ep0) {
            ((ep0) y03).a(this.f32933s, true);
        } else if (y03 instanceof sc) {
            ((sc) y03).a(this.f32918f, true);
        }
        if (y04 instanceof oc) {
            oc ocVar = (oc) y04;
            ocVar.a(this.currentAccount, this.f32933s, false);
            ocVar.c(this.f32938w, false, true);
        }
        if (y05 instanceof oc) {
            TLRPC.EmojiStatus emojiStatus2 = this.f32940y;
            if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                ((oc) y05).b(MessagesController.PeerColor.fromCollectible(emojiStatus2));
            } else {
                ((oc) y05).a(this.currentAccount, this.f32933s, false);
            }
            ((oc) y05).c(DialogObject.getEmojiStatusDocumentId(this.f32940y), DialogObject.isEmojiStatusCollectible(this.f32940y), true);
        }
        boolean z4 = y06 instanceof oc;
        long j10 = this.f32910a;
        if (z4) {
            oc ocVar2 = (oc) y06;
            ocVar2.a(this.currentAccount, this.f32933s, false);
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
        if (this.f32938w == 0 && this.f32933s < 0 && !(this.f32940y instanceof TLRPC.TL_emojiStatusCollectible)) {
            int i12 = this.f32913b0;
            this.f32913b0 = -1;
            if (i12 >= 0 && (ncVar2 = this.K) != null) {
                ncVar2.u(i12);
                this.K.m(this.Z);
            }
        } else {
            if (this.f32913b0 >= 0) {
                z4 = true;
            }
            this.O = i10 + 9;
            this.f32913b0 = i11;
            if (!z4 && (ncVar = this.K) != null) {
                ncVar.o(i11);
                this.K.m(this.Z);
            }
        }
        int i13 = this.O;
        this.f32911a0 = i13;
        this.f32915c0 = i13 + 1;
        this.O = i13 + 3;
        this.f32916d0 = i13 + 2;
    }

    @Override
    public View createView(Context context) {
        MessagesController messagesController = getMessagesController();
        long j10 = -this.f32910a;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        if (chat != null) {
            int colorId = ChatObject.getColorId(chat);
            this.f32918f = colorId;
            this.e = colorId;
            long emojiId = ChatObject.getEmojiId(chat);
            this.f32926n = emojiId;
            this.h = emojiId;
            int profileColorId = ChatObject.getProfileColorId(chat);
            this.f32933s = profileColorId;
            this.f32931r = profileColorId;
            long profileEmojiId = ChatObject.getProfileEmojiId(chat);
            this.f32938w = profileEmojiId;
            this.v = profileEmojiId;
            TLRPC.EmojiStatus emojiStatus = chat.emoji_status;
            this.f32940y = emojiStatus;
            this.f32939x = emojiStatus;
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
        int i10 = R.raw.sun;
        org.telegram.ui.Components.gj0 gj0Var = new org.telegram.ui.Components.gj0(i10, "" + R.raw.sun, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
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
        org.telegram.ui.Components.sl0 sl0Var = this.J;
        nc ncVar = new nc(this);
        this.K = ncVar;
        sl0Var.setAdapter(ncVar);
        new f2.w(3);
        this.J.setLayoutManager(new f2.i0());
        org.telegram.ui.Components.sl0 sl0Var2 = this.J;
        int i11 = org.telegram.ui.ActionBar.j6.f19852a7;
        sl0Var2.setBackgroundColor(getThemedColor(i11));
        frameLayout.addView(this.J, k7.b6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 68.0f));
        this.J.setOnItemClickListener(new gg.v0(5, this, chatFull));
        f2.l lVar = new f2.l();
        lVar.n(350L);
        lVar.o(org.telegram.ui.Components.nr.h);
        lVar.C = false;
        lVar.f5818m = false;
        this.J.setItemAnimator(lVar);
        ph.d dVar = new ph.d(context, this.resourceProvider, true);
        dVar.setRoundRadius(24);
        this.M = dVar;
        dVar.g(LocaleController.getString(R.string.ApplyChanges), false, true);
        this.M.setOnClickListener(new a(this, 12));
        X0(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.L = frameLayout2;
        frameLayout2.setBackgroundColor(getThemedColor(i11));
        this.L.addView(this.M, k7.b6.d(-1, 48.0f, 80, 10.0f, 10.0f, 10.0f, 10.0f));
        frameLayout.addView(this.L, k7.b6.e(-1, 68, 80));
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
        long j10 = this.f32910a;
        if (i10 == i12) {
            if (j10 == ((Long) objArr[2]).longValue()) {
                W0((TL_stories.TL_premium_boostsStatus) objArr[0]);
            }
        } else if (i10 == NotificationCenter.boostByChannelCreated) {
            if (!((Boolean) objArr[1]).booleanValue()) {
                getMessagesController().getBoostsController().getBoostsStats(j10, new fc(this, 1));
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
        if (Q0() && this.f32912b >= S0()) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z4) {
        if (this.f32912b >= S0() && Q0()) {
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
        this.f32927n0 = f6Var;
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
