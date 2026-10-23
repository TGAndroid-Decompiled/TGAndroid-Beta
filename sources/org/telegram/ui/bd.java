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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public class bd extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public TLRPC.WallPaper E;
    public TLRPC.WallPaper F;
    public TLRPC.WallPaper G;
    public Drawable H;
    public SpannableStringBuilder I;
    public boolean J;
    public org.telegram.ui.Components.yj0 K;
    public org.telegram.ui.ActionBar.u0 L;
    public org.telegram.ui.Components.mm0 M;
    public nc N;
    public FrameLayout O;
    public ei.d P;
    public kc Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public final long f36017a;
    public int f36018a0;
    public int f36019b;
    public int f36020b0;
    public TL_stories.TL_premium_boostsStatus f36021c;
    public int f36022c0;
    public boolean d;
    public int f36023d0;
    public int e;
    public int f36024e0;
    public int f36025f;
    public int f36026f0;
    public int f36027g0;
    public long h;
    public int f36028h0;
    public int f36029i0;
    public int f36030j0;
    public int f36031k0;
    public org.telegram.ui.ActionBar.o2 f36032l0;
    public lc m0;
    public long f36033n;
    public float f36034n0;
    public ValueAnimator f36035o0;
    public boolean f36036p0;
    public org.telegram.ui.ActionBar.g6 f36037q0;
    public int f36038r;
    public final SparseIntArray f36039r0;
    public int f36040s;
    public final org.telegram.ui.ActionBar.j5 f36041s0;
    public final org.telegram.ui.ActionBar.j5 f36042t0;
    public final org.telegram.ui.ActionBar.j5 f36043u0;
    public long v;
    public final org.telegram.ui.ActionBar.j5 f36044v0;
    public long f36045w;
    public final Drawable f36046w0;
    public TLRPC.EmojiStatus f36047x;
    public final Drawable f36048x0;
    public TLRPC.EmojiStatus f36049y;
    public final Paint f36050y0;

    public bd(long j10) {
        super(null);
        boolean q6 = org.telegram.ui.ActionBar.k6.I.q();
        this.J = q6;
        this.R = 0;
        this.f36036p0 = q6;
        this.f36039r0 = new SparseIntArray();
        Paint paint = new Paint(1);
        this.f36050y0 = paint;
        paint.setStrokeWidth(1.0f);
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21184d7, this.resourceProvider));
        this.f36046w0 = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_check_s).mutate();
        this.f36048x0 = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_halfcheck).mutate();
        this.f36017a = j10;
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j10));
        if (chat != null) {
            this.f36019b = chat.level;
        }
        MessagesController.getInstance(this.currentAccount).getBoostsController().getBoostsStats(j10, new org.telegram.ui.ActionBar.m3(5, this, chat));
        this.resourceProvider = new ad(this);
        this.f36041s0 = new org.telegram.ui.ActionBar.j5(0, false, false, this.resourceProvider);
        this.f36042t0 = new org.telegram.ui.ActionBar.j5(0, false, true, this.resourceProvider);
        this.f36043u0 = new org.telegram.ui.ActionBar.j5(0, true, false, this.resourceProvider);
        this.f36044v0 = new org.telegram.ui.ActionBar.j5(0, true, true, this.resourceProvider);
    }

    public static void U(bd bdVar) {
        org.telegram.ui.ActionBar.g6 g6Var = bdVar.resourceProvider;
        if (g6Var instanceof ad) {
            bd bdVar2 = ((ad) g6Var).f35649a;
            bdVar2.J = !bdVar2.J;
            bdVar2.f1();
            bdVar2.b1(false);
        } else {
            bdVar.J = !bdVar.J;
            bdVar.f1();
        }
        bdVar.W0(bdVar.J, true);
        bdVar.b1(false);
    }

    public static void V(org.telegram.ui.bd r13, org.telegram.messenger.ChannelBoostsController.CanApplyBoost r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bd.V(org.telegram.ui.bd, org.telegram.messenger.ChannelBoostsController$CanApplyBoost):void");
    }

    public static void W(org.telegram.ui.bd r22, org.telegram.tgnet.TLRPC.ChatFull r23, android.view.View r24, int r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bd.W(org.telegram.ui.bd, org.telegram.tgnet.TLRPC$ChatFull, android.view.View, int):void");
    }

    public static void a1(View view) {
        if (view instanceof oc) {
            ((oc) view).updateColors();
        } else if (view instanceof org.telegram.ui.Cells.r8) {
            ((org.telegram.ui.Cells.r8) view).updateColors();
        } else if (view instanceof rc) {
            ((rc) view).updateColors();
        } else if (view instanceof zc) {
            ((zc) view).updateColors();
        }
    }

    public final View A0(int i10) {
        for (int i11 = 0; i11 < this.M.getChildCount(); i11++) {
            View childAt = this.M.getChildAt(i11);
            this.M.getClass();
            if (RecyclerView.R(childAt) == i10) {
                return childAt;
            }
        }
        return null;
    }

    public int B0() {
        return getMessagesController().channelCustomWallpaperLevelMin;
    }

    public int C0() {
        return 0;
    }

    public int D0() {
        return 0;
    }

    public final TLRPC.Document E0(TLRPC.StickerSet stickerSet) {
        if (stickerSet != null && stickerSet.thumb_document_id == 0) {
            TLRPC.TL_messages_stickerSet groupStickerSetById = getMediaDataController().getGroupStickerSetById(stickerSet);
            if (!groupStickerSetById.documents.isEmpty()) {
                return groupStickerSetById.documents.get(0);
            }
        }
        return null;
    }

    public final long F0(TLRPC.StickerSet stickerSet) {
        if (stickerSet == null) {
            return 0L;
        }
        long j10 = stickerSet.thumb_document_id;
        if (j10 == 0) {
            TLRPC.TL_messages_stickerSet groupStickerSetById = getMediaDataController().getGroupStickerSetById(stickerSet);
            if (!groupStickerSetById.documents.isEmpty()) {
                return groupStickerSetById.documents.get(0).f20349id;
            }
        }
        return j10;
    }

    public int G0() {
        return R.string.ChannelEmojiStatusInfo;
    }

    public int H0() {
        return getMessagesController().channelEmojiStatusLevelMin;
    }

    public int I0() {
        return R.string.ChannelEmojiStatus;
    }

    public int J0() {
        return 0;
    }

    public int K0() {
        return 3;
    }

    public int L0() {
        return getMessagesController().channelProfileIconLevelMin;
    }

    public int M0() {
        return R.string.ChannelProfileInfo;
    }

    public int N0() {
        return 0;
    }

    public int O0() {
        return 0;
    }

    public int P0() {
        return R.string.ChannelWallpaper2Info;
    }

    public int Q0() {
        return getMessagesController().channelWallpaperLevelMin;
    }

    public int R0() {
        return R.string.ChannelWallpaper;
    }

    public final boolean S0() {
        if (this.e == this.f36025f && this.h == this.f36033n && this.f36038r == this.f36040s && this.v == this.f36045w && DialogObject.emojiStatusesEqual(this.f36047x, this.f36049y) && ChatThemeController.wallpaperEquals(this.E, this.F)) {
            return false;
        }
        return true;
    }

    public boolean T0() {
        return false;
    }

    public final int U0() {
        MessagesController.PeerColor color;
        MessagesController.PeerColor peerColor = null;
        int i10 = 0;
        if (this.e != this.f36025f) {
            MessagesController.PeerColors peerColors = getMessagesController().peerColors;
            if (peerColors == null) {
                color = null;
            } else {
                color = peerColors.getColor(this.f36025f);
            }
            if (color != null) {
                i10 = Math.max(0, color.getLvl(this.d));
            }
        }
        if (this.h != this.f36033n) {
            i10 = Math.max(i10, getMessagesController().channelBgIconLevelMin);
        }
        if (this.f36038r != this.f36040s) {
            MessagesController.PeerColors peerColors2 = getMessagesController().profilePeerColors;
            if (peerColors2 != null) {
                peerColor = peerColors2.getColor(this.f36040s);
            }
            if (peerColor != null) {
                i10 = Math.max(i10, peerColor.getLvl(this.d));
            }
        }
        if (this.v != this.f36045w) {
            i10 = Math.max(i10, L0());
        }
        if (!DialogObject.emojiStatusesEqual(this.f36047x, this.f36049y)) {
            i10 = Math.max(i10, H0());
        }
        if (!ChatThemeController.wallpaperEquals(this.E, this.F)) {
            return Math.max(i10, Q0());
        }
        return i10;
    }

    public final void W0(boolean z10, boolean z11) {
        int i10;
        if (this.f36036p0 != z10) {
            this.f36036p0 = z10;
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

    public final void X0() {
        if (getVisibleDialog() != null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
        alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.ChannelColorUnsaved);
        alertDialog$Builder.f20678a.T = LocaleController.getString(R.string.ChannelColorUnsavedMessage);
        alertDialog$Builder.h(LocaleController.getString(R.string.Dismiss), new org.telegram.ui.ActionBar.z1(this) {
            public final bd f37821b;

            {
                this.f37821b = this;
            }

            @Override
            public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
                switch (r2) {
                    case 0:
                        this.f37821b.finishFragment();
                        return;
                    default:
                        this.f37821b.y0();
                        return;
                }
            }
        });
        alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new org.telegram.ui.ActionBar.z1(this) {
            public final bd f37821b;

            {
                this.f37821b = this;
            }

            @Override
            public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
                switch (r2) {
                    case 0:
                        this.f37821b.finishFragment();
                        return;
                    default:
                        this.f37821b.y0();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
        showDialog(c2Var);
        org.telegram.ui.ActionBar.r6.W((TextView) c2Var.d(-2), org.telegram.ui.ActionBar.k6.f21421q7, getResourceProvider());
    }

    public final void Y0(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        if (tL_premium_boostsStatus != null) {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.f36017a));
            this.f36021c = tL_premium_boostsStatus;
            int i10 = tL_premium_boostsStatus.level;
            this.f36019b = i10;
            if (chat != null) {
                chat.level = i10;
            }
            nc ncVar = this.N;
            if (ncVar != null) {
                ncVar.l();
            }
            Z0(true);
        }
    }

    public void Z0(boolean z10) {
        if (this.P != null && this.f36021c != null) {
            int U0 = U0();
            if (this.f36019b >= U0) {
                this.P.g(null, z10);
                return;
            }
            if (this.I == null) {
                this.I = new SpannableStringBuilder("l");
                org.telegram.ui.Components.xq xqVar = new org.telegram.ui.Components.xq(R.drawable.mini_switch_lock, 0);
                xqVar.setTopOffset(1);
                this.I.setSpan(xqVar, 0, 1, 33);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.I).append((CharSequence) LocaleController.formatPluralString("BoostLevelRequired", U0, new Object[0]));
            this.P.g(spannableStringBuilder, z10);
        }
    }

    public void b1(boolean z10) {
        int themedColor;
        this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21462s8));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = -1;
        if (this.d && this.f36040s != -1) {
            themedColor = -1;
        } else {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.A8);
        }
        kVar.setTitleColor(themedColor);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        if (!this.d || this.f36040s == -1) {
            i10 = getThemedColor(org.telegram.ui.ActionBar.k6.f21518v8);
        }
        kVar2.B(i10, false);
        this.actionBar.A(getThemedColor(org.telegram.ui.ActionBar.k6.f21481t8), false);
        if (!z10) {
            org.telegram.ui.Components.mm0 mm0Var = this.M;
            int i11 = org.telegram.ui.ActionBar.k6.f21125a7;
            mm0Var.setBackgroundColor(getThemedColor(i11));
            this.N.l();
            AndroidUtilities.forEachViews((RecyclerView) this.M, (Utilities.Callback<View>) new ci.e(this));
            this.O.setBackgroundColor(getThemedColor(i11));
            this.P.updateColors();
            setNavigationBarColor(getNavigationBarColor());
        }
    }

    public final void c1(boolean z10) {
        MessageObject messageObject;
        View A0 = A0(this.S);
        View A02 = A0(this.T);
        View A03 = A0(this.U);
        View A04 = A0(this.W);
        if (A0 instanceof org.telegram.ui.Cells.ga) {
            org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) A0;
            org.telegram.ui.Cells.t1[] cells = gaVar.getCells();
            for (int i10 = 0; i10 < cells.length; i10++) {
                org.telegram.ui.Cells.t1 t1Var = cells[i10];
                if (t1Var != null && (messageObject = t1Var.getMessageObject()) != null) {
                    messageObject.overrideLinkColor = this.f36025f;
                    messageObject.overrideLinkEmoji = this.f36033n;
                    cells[i10].setAvatar(messageObject);
                    cells[i10].invalidate();
                }
            }
            Drawable f7 = ei.r6.f(this.H, this.currentAccount, this.F, this.J);
            this.H = f7;
            gaVar.setOverrideBackground(f7);
        }
        if (A02 instanceof ip0) {
            ((ip0) A02).a(this.f36025f, z10);
        } else if (A02 instanceof rc) {
            ((rc) A02).a(this.f36025f, z10);
        }
        if (A03 instanceof oc) {
            oc ocVar = (oc) A03;
            ocVar.a(this.currentAccount, this.f36025f, true);
            ocVar.c(this.f36033n, false, z10);
        }
        if (A04 instanceof zc) {
            zc zcVar = (zc) A04;
            String wallpaperEmoticon = ChatThemeController.getWallpaperEmoticon(this.F);
            if (wallpaperEmoticon == null && this.F == null && this.G != null) {
                wallpaperEmoticon = "❌";
            }
            zcVar.a(wallpaperEmoticon, z10);
            zcVar.setGalleryWallpaper(this.G);
        }
    }

    @Override
    public View createView(Context context) {
        MessagesController messagesController = getMessagesController();
        long j10 = -this.f36017a;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        if (chat != null) {
            int colorId = ChatObject.getColorId(chat);
            this.f36025f = colorId;
            this.e = colorId;
            long emojiId = ChatObject.getEmojiId(chat);
            this.f36033n = emojiId;
            this.h = emojiId;
            int profileColorId = ChatObject.getProfileColorId(chat);
            this.f36040s = profileColorId;
            this.f36038r = profileColorId;
            long profileEmojiId = ChatObject.getProfileEmojiId(chat);
            this.f36045w = profileEmojiId;
            this.v = profileEmojiId;
            TLRPC.EmojiStatus emojiStatus = chat.emoji_status;
            this.f36049y = emojiStatus;
            this.f36047x = emojiStatus;
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
        this.actionBar.setActionBarMenuOnItemClick(new ea(this, 2));
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
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.J9, this.resourceProvider);
        this.K.Q(w02, "Sunny");
        this.K.Q(w02, "Path 6");
        this.K.Q(w02, "Path");
        this.K.Q(w02, "Path 5");
        this.L = this.actionBar.m().d(1, this.K);
        FrameLayout frameLayout = new FrameLayout(context);
        e1();
        z0();
        if (!this.d) {
            this.actionBar.setAdaptiveBackground(this.M);
        }
        org.telegram.ui.Components.mm0 mm0Var = this.M;
        nc ncVar = new nc(this);
        this.N = ncVar;
        mm0Var.setAdapter(ncVar);
        new s4.s(3);
        this.M.setLayoutManager(new s4.b0());
        org.telegram.ui.Components.mm0 mm0Var2 = this.M;
        int i10 = org.telegram.ui.ActionBar.k6.f21125a7;
        org.telegram.ui.ActionBar.r6.i(i10, mm0Var2, getResourceProvider());
        frameLayout.addView(this.M, w7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 68.0f));
        this.M.setOnItemClickListener(new ci.x4(4, this, chatFull));
        s4.k kVar = new s4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.bs.h);
        kVar.C = false;
        kVar.f46377m = false;
        this.M.setItemAnimator(kVar);
        ei.d dVar = new ei.d(context, this.resourceProvider, true);
        dVar.setRoundRadius(24);
        this.P = dVar;
        dVar.i(LocaleController.getString(R.string.ApplyChanges), false, true);
        this.P.setOnClickListener(new a(this, 12));
        Z0(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.O = frameLayout2;
        org.telegram.ui.ActionBar.r6.i(i10, frameLayout2, getResourceProvider());
        this.O.addView(this.P, w7.z5.d(-1, 48.0f, 80, 10.0f, 10.0f, 10.0f, 10.0f));
        frameLayout.addView(this.O, w7.z5.e(-1, 68, 80));
        setBulletinDelegate(new b9(this, 1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d1() {
        TLRPC.StickerSet stickerSet;
        TLRPC.StickerSet stickerSet2;
        View A0 = A0(this.Z);
        View A02 = A0(this.f36020b0);
        View A03 = A0(this.f36022c0);
        View A04 = A0(this.f36026f0);
        View A05 = A0(this.f36028h0);
        View A06 = A0(this.f36030j0);
        if (A0 instanceof tc) {
            TLRPC.EmojiStatus emojiStatus = this.f36049y;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                tc tcVar = (tc) A0;
                sc scVar = tcVar.f41947b;
                MessagesController.PeerColor fromCollectible = MessagesController.PeerColor.fromCollectible(emojiStatus);
                scVar.c(fromCollectible, true);
                tcVar.f41946a.c(fromCollectible, true);
                scVar.d(((TLRPC.TL_emojiStatusCollectible) this.f36049y).pattern_document_id, true, true);
            } else {
                tc tcVar2 = (tc) A0;
                sc scVar2 = tcVar2.f41947b;
                int i10 = this.f36040s;
                scVar2.b(i10, true);
                tcVar2.f41946a.b(tcVar2.h.currentAccount, i10, true);
                scVar2.d(this.f36045w, false, true);
            }
            tc tcVar3 = (tc) A0;
            sc scVar3 = tcVar3.f41947b;
            scVar3.e(DialogObject.getEmojiStatusDocumentId(this.f36049y), false, true);
            scVar3.a(this.f36025f);
            tcVar3.updateColors();
        }
        if (A02 instanceof ip0) {
            ((ip0) A02).a(this.f36040s, true);
        } else if (A02 instanceof rc) {
            ((rc) A02).a(this.f36025f, true);
        }
        if (A03 instanceof oc) {
            oc ocVar = (oc) A03;
            ocVar.a(this.currentAccount, this.f36040s, false);
            ocVar.c(this.f36045w, false, true);
        }
        if (A04 instanceof oc) {
            TLRPC.EmojiStatus emojiStatus2 = this.f36049y;
            if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                ((oc) A04).b(MessagesController.PeerColor.fromCollectible(emojiStatus2));
            } else {
                ((oc) A04).a(this.currentAccount, this.f36040s, false);
            }
            ((oc) A04).c(DialogObject.getEmojiStatusDocumentId(this.f36049y), DialogObject.isEmojiStatusCollectible(this.f36049y), true);
        }
        boolean z10 = A05 instanceof oc;
        long j10 = this.f36017a;
        if (z10) {
            oc ocVar2 = (oc) A05;
            ocVar2.a(this.currentAccount, this.f36040s, false);
            TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-j10);
            if (chatFull != null && (stickerSet2 = chatFull.emojiset) != null) {
                ocVar2.c(F0(stickerSet2), false, false);
            } else {
                ocVar2.c(0L, false, false);
            }
        }
        if (A06 instanceof oc) {
            TLRPC.ChatFull chatFull2 = getMessagesController().getChatFull(-j10);
            if (chatFull2 != null && (stickerSet = chatFull2.stickerset) != null) {
                ((oc) A06).d(E0(stickerSet));
            } else {
                ((oc) A06).c(0L, false, false);
            }
        }
        e1();
    }

    @Override
    public void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.chatWasBoostedByUser;
        long j10 = this.f36017a;
        if (i10 == i12) {
            if (j10 == ((Long) objArr[2]).longValue()) {
                Y0((TL_stories.TL_premium_boostsStatus) objArr[0]);
            }
        } else if (i10 == NotificationCenter.boostByChannelCreated) {
            if (!((Boolean) objArr[1]).booleanValue()) {
                getMessagesController().getBoostsController().getBoostsStats(j10, new fc(this, 2));
            }
        } else if (i10 == NotificationCenter.dialogDeleted && j10 == ((Long) objArr[0]).longValue()) {
            org.telegram.ui.ActionBar.h5 h5Var = this.parentLayout;
            if (h5Var != null && h5Var.getLastFragment() == this) {
                finishFragment();
            } else {
                removeSelfFromStack();
            }
        }
    }

    public void e1() {
        nc ncVar;
        nc ncVar2;
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
        this.f36020b0 = i10 + 6;
        int i11 = i10 + 8;
        this.R = i11;
        this.f36022c0 = i10 + 7;
        if (this.f36045w == 0 && this.f36040s < 0 && !(this.f36049y instanceof TLRPC.TL_emojiStatusCollectible)) {
            int i12 = this.f36024e0;
            this.f36024e0 = -1;
            if (i12 >= 0 && (ncVar2 = this.N) != null) {
                ncVar2.u(i12);
                this.N.m(this.f36022c0);
            }
        } else {
            if (this.f36024e0 >= 0) {
                z10 = true;
            }
            this.R = i10 + 9;
            this.f36024e0 = i11;
            if (!z10 && (ncVar = this.N) != null) {
                ncVar.o(i11);
                this.N.m(this.f36022c0);
            }
        }
        int i13 = this.R;
        this.f36023d0 = i13;
        this.f36026f0 = i13 + 1;
        this.R = i13 + 3;
        this.f36027g0 = i13 + 2;
    }

    public final void f1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bd.f1():void");
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (S0() && this.f36019b >= U0()) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.f36019b >= U0() && S0()) {
            if (z10) {
                X0();
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
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            x0();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void setResourceProvider(org.telegram.ui.ActionBar.g6 g6Var) {
        this.f36037q0 = g6Var;
    }

    public final void w0() {
        int themedColor;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar == null) {
            return;
        }
        int i10 = -1;
        if (this.d && this.f36040s != -1) {
            themedColor = -1;
        } else {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.A8);
        }
        kVar.setTitleColor(themedColor);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        if (!this.d || this.f36040s == -1) {
            i10 = getThemedColor(org.telegram.ui.ActionBar.k6.f21518v8);
        }
        kVar2.B(i10, false);
    }

    public void x0() {
        w0();
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21462s8));
        }
        org.telegram.ui.Components.mm0 mm0Var = this.M;
        if (mm0Var != null) {
            mm0Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21125a7));
        }
        FrameLayout frameLayout = this.O;
        if (frameLayout != null) {
            frameLayout.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21125a7));
        }
    }

    public final void y0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bd.y0():void");
    }

    public void z0() {
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(getParentActivity(), this.resourceProvider);
        this.M = mm0Var;
        mm0Var.setSections(false);
    }

    public void V0(int i10) {
    }
}
