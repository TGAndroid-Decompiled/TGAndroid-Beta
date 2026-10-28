package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
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
public class bd extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
    public TLRPC.WallPaper E;
    public TLRPC.WallPaper F;
    public TLRPC.WallPaper G;
    public Drawable H;
    public SpannableStringBuilder I;
    public boolean J;
    public org.telegram.ui.Components.yj0 K;
    public org.telegram.ui.ActionBar.w0 L;
    public org.telegram.ui.Components.nm0 M;
    public oc N;
    public FrameLayout O;
    public fi.d P;
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
    public final long f37977a;
    public int f37978a0;
    public int f37979b;
    public int f37980b0;
    public TL_stories.TL_premium_boostsStatus f37981c;
    public int f37982c0;
    public boolean d;
    public int f37983d0;
    public int e;
    public int f37984e0;
    public int f37985f;
    public int f37986f0;
    public int f37987g0;
    public long h;
    public int f37988h0;
    public int f37989i0;
    public int f37990j0;
    public int f37991k0;
    public org.telegram.ui.ActionBar.r2 f37992l0;
    public mc m0;
    public long f37993n;
    public float f37994n0;
    public ValueAnimator f37995o0;
    public boolean f37996p0;
    public org.telegram.ui.ActionBar.u6 f37997q0;
    public int f37998r;
    public final SparseIntArray f37999r0;
    public int f38000s;
    public final org.telegram.ui.ActionBar.l5 f38001s0;
    public final org.telegram.ui.ActionBar.l5 f38002t0;
    public final org.telegram.ui.ActionBar.l5 f38003u0;
    public long v;
    public final org.telegram.ui.ActionBar.l5 f38004v0;
    public long f38005w;
    public final Drawable f38006w0;
    public TLRPC.EmojiStatus f38007x;
    public final Drawable f38008x0;
    public TLRPC.EmojiStatus f38009y;
    public final Paint f38010y0;

    public bd(long j10) {
        super(null);
        boolean q5 = org.telegram.ui.ActionBar.y6.I.q();
        this.J = q5;
        this.R = 0;
        this.f37996p0 = q5;
        this.f37999r0 = new SparseIntArray();
        Paint paint = new Paint(1);
        this.f38010y0 = paint;
        paint.setStrokeWidth(1.0f);
        paint.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23358d7, this.resourceProvider));
        this.f38006w0 = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_check_s).mutate();
        this.f38008x0 = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_halfcheck).mutate();
        this.f37977a = j10;
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j10));
        if (chat != null) {
            this.f37979b = chat.level;
        }
        MessagesController.getInstance(this.currentAccount).getBoostsController().getBoostsStats(j10, new li.s2(7, this, chat));
        this.resourceProvider = new ad(this);
        this.f38001s0 = new org.telegram.ui.ActionBar.l5(0, false, false, this.resourceProvider);
        this.f38002t0 = new org.telegram.ui.ActionBar.l5(0, false, true, this.resourceProvider);
        this.f38003u0 = new org.telegram.ui.ActionBar.l5(0, true, false, this.resourceProvider);
        this.f38004v0 = new org.telegram.ui.ActionBar.l5(0, true, true, this.resourceProvider);
    }

    public static void V(bd bdVar) {
        org.telegram.ui.ActionBar.u6 u6Var = bdVar.resourceProvider;
        if (u6Var instanceof ad) {
            bd bdVar2 = ((ad) u6Var).f37735a;
            bdVar2.J = !bdVar2.J;
            bdVar2.g1();
            bdVar2.c1(false);
        } else {
            bdVar.J = !bdVar.J;
            bdVar.g1();
        }
        bdVar.X0(bdVar.J, true);
        bdVar.c1(false);
        org.telegram.ui.ActionBar.y6.Ll++;
    }

    public static void W(org.telegram.ui.bd r13, org.telegram.messenger.ChannelBoostsController.CanApplyBoost r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bd.W(org.telegram.ui.bd, org.telegram.messenger.ChannelBoostsController$CanApplyBoost):void");
    }

    public static void X(org.telegram.ui.bd r22, org.telegram.tgnet.TLRPC.ChatFull r23, android.view.View r24, int r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bd.X(org.telegram.ui.bd, org.telegram.tgnet.TLRPC$ChatFull, android.view.View, int):void");
    }

    public static void b1(View view) {
        if (view instanceof pc) {
            ((pc) view).updateColors();
        } else if (view instanceof org.telegram.ui.Cells.v8) {
            ((org.telegram.ui.Cells.v8) view).updateColors();
        } else if (view instanceof sc) {
            ((sc) view).updateColors();
        } else if (view instanceof zc) {
            ((zc) view).updateColors();
        }
    }

    public void A0() {
        org.telegram.ui.Components.nm0 nm0Var = new org.telegram.ui.Components.nm0(getParentActivity(), this.resourceProvider);
        this.M = nm0Var;
        nm0Var.setSections(false);
    }

    public final View B0(int i10) {
        for (int i11 = 0; i11 < this.M.getChildCount(); i11++) {
            View childAt = this.M.getChildAt(i11);
            this.M.getClass();
            if (RecyclerView.R(childAt) == i10) {
                return childAt;
            }
        }
        return null;
    }

    public int C0() {
        return getMessagesController().channelCustomWallpaperLevelMin;
    }

    public int D0() {
        return 0;
    }

    public int E0() {
        return 0;
    }

    public final TLRPC.Document F0(TLRPC.StickerSet stickerSet) {
        if (stickerSet != null && stickerSet.thumb_document_id == 0) {
            TLRPC.TL_messages_stickerSet groupStickerSetById = getMediaDataController().getGroupStickerSetById(stickerSet);
            if (!groupStickerSetById.documents.isEmpty()) {
                return groupStickerSetById.documents.get(0);
            }
        }
        return null;
    }

    public final long G0(TLRPC.StickerSet stickerSet) {
        if (stickerSet == null) {
            return 0L;
        }
        long j10 = stickerSet.thumb_document_id;
        if (j10 == 0) {
            TLRPC.TL_messages_stickerSet groupStickerSetById = getMediaDataController().getGroupStickerSetById(stickerSet);
            if (!groupStickerSetById.documents.isEmpty()) {
                return groupStickerSetById.documents.get(0).f22034id;
            }
        }
        return j10;
    }

    public int H0() {
        return R.string.ChannelEmojiStatusInfo;
    }

    public int I0() {
        return getMessagesController().channelEmojiStatusLevelMin;
    }

    public int J0() {
        return R.string.ChannelEmojiStatus;
    }

    public int K0() {
        return 0;
    }

    public int L0() {
        return 3;
    }

    public int M0() {
        return getMessagesController().channelProfileIconLevelMin;
    }

    public int N0() {
        return R.string.ChannelProfileInfo;
    }

    public int O0() {
        return 0;
    }

    public int P0() {
        return 0;
    }

    public int Q0() {
        return R.string.ChannelWallpaper2Info;
    }

    public int R0() {
        return getMessagesController().channelWallpaperLevelMin;
    }

    public int S0() {
        return R.string.ChannelWallpaper;
    }

    public final boolean T0() {
        if (this.e == this.f37985f && this.h == this.f37993n && this.f37998r == this.f38000s && this.v == this.f38005w && DialogObject.emojiStatusesEqual(this.f38007x, this.f38009y) && ChatThemeController.wallpaperEquals(this.E, this.F)) {
            return false;
        }
        return true;
    }

    public boolean U0() {
        return false;
    }

    public final int V0() {
        MessagesController.PeerColor color;
        MessagesController.PeerColor peerColor = null;
        int i10 = 0;
        if (this.e != this.f37985f) {
            MessagesController.PeerColors peerColors = getMessagesController().peerColors;
            if (peerColors == null) {
                color = null;
            } else {
                color = peerColors.getColor(this.f37985f);
            }
            if (color != null) {
                i10 = Math.max(0, color.getLvl(this.d));
            }
        }
        if (this.h != this.f37993n) {
            i10 = Math.max(i10, getMessagesController().channelBgIconLevelMin);
        }
        if (this.f37998r != this.f38000s) {
            MessagesController.PeerColors peerColors2 = getMessagesController().profilePeerColors;
            if (peerColors2 != null) {
                peerColor = peerColors2.getColor(this.f38000s);
            }
            if (peerColor != null) {
                i10 = Math.max(i10, peerColor.getLvl(this.d));
            }
        }
        if (this.v != this.f38005w) {
            i10 = Math.max(i10, M0());
        }
        if (!DialogObject.emojiStatusesEqual(this.f38007x, this.f38009y)) {
            i10 = Math.max(i10, I0());
        }
        if (!ChatThemeController.wallpaperEquals(this.E, this.F)) {
            return Math.max(i10, R0());
        }
        return i10;
    }

    public final void X0(boolean z10, boolean z11) {
        int i10;
        if (this.f37996p0 != z10) {
            this.f37996p0 = z10;
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
            org.telegram.ui.ActionBar.w0 w0Var = this.L;
            if (w0Var != null) {
                w0Var.invalidate();
            }
        }
    }

    public final void Y0() {
        if (getVisibleDialog() != null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
        alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.ChannelColorUnsaved);
        alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.ChannelColorUnsavedMessage);
        alertDialog$Builder.h(LocaleController.getString(R.string.Dismiss), new org.telegram.ui.ActionBar.b2(this) {
            public final bd f40108b;

            {
                this.f40108b = this;
            }

            @Override
            public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
                switch (r2) {
                    case 0:
                        this.f40108b.finishFragment();
                        return;
                    default:
                        this.f40108b.z0();
                        return;
                }
            }
        });
        alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new org.telegram.ui.ActionBar.b2(this) {
            public final bd f40108b;

            {
                this.f40108b = this;
            }

            @Override
            public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
                switch (r2) {
                    case 0:
                        this.f40108b.finishFragment();
                        return;
                    default:
                        this.f40108b.z0();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
        showDialog(e2Var);
        org.telegram.ui.ActionBar.f7.V((TextView) e2Var.d(-2), org.telegram.ui.ActionBar.y6.f23599q7, getResourceProvider());
    }

    public final void Z0(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        if (tL_premium_boostsStatus != null) {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.f37977a));
            this.f37981c = tL_premium_boostsStatus;
            int i10 = tL_premium_boostsStatus.level;
            this.f37979b = i10;
            if (chat != null) {
                chat.level = i10;
            }
            oc ocVar = this.N;
            if (ocVar != null) {
                ocVar.l();
            }
            a1(true);
        }
    }

    public void a1(boolean z10) {
        if (this.P != null && this.f37981c != null) {
            int V0 = V0();
            if (this.f37979b >= V0) {
                this.P.g(null, z10);
                return;
            }
            if (this.I == null) {
                this.I = new SpannableStringBuilder("l");
                org.telegram.ui.Components.zq zqVar = new org.telegram.ui.Components.zq(R.drawable.mini_switch_lock, 0);
                zqVar.setTopOffset(1);
                this.I.setSpan(zqVar, 0, 1, 33);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.I).append((CharSequence) LocaleController.formatPluralString("BoostLevelRequired", V0, new Object[0]));
            this.P.g(spannableStringBuilder, z10);
        }
    }

    public void c1(boolean z10) {
        int themedColor;
        org.telegram.ui.ActionBar.r5 r5Var = this.simpleActionBar;
        if (r5Var != null) {
            r5Var.updateColors();
        } else {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            int i10 = -1;
            if (this.d && this.f38000s != -1) {
                themedColor = -1;
            } else {
                themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.A8);
            }
            kVar.setTitleColor(themedColor);
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            if (!this.d || this.f38000s == -1) {
                i10 = getThemedColor(org.telegram.ui.ActionBar.y6.f23695v8);
            }
            kVar2.y(i10, false);
            this.actionBar.x(getThemedColor(org.telegram.ui.ActionBar.y6.f23657t8), false);
        }
        if (!z10) {
            this.N.l();
            AndroidUtilities.forEachViews((RecyclerView) this.M, (Utilities.Callback<View>) new di.e(this));
            if (this.d) {
                this.O.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.y6.f23300a7));
            }
            this.P.updateColors();
            setNavigationBarColor(getNavigationBarColor());
        }
    }

    @Override
    public View createView(Context context) {
        org.telegram.ui.ActionBar.w0 d;
        float f7;
        MessagesController messagesController = getMessagesController();
        long j10 = -this.f37977a;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        if (chat != null) {
            int colorId = ChatObject.getColorId(chat);
            this.f37985f = colorId;
            this.e = colorId;
            long emojiId = ChatObject.getEmojiId(chat);
            this.f37993n = emojiId;
            this.h = emojiId;
            int profileColorId = ChatObject.getProfileColorId(chat);
            this.f38000s = profileColorId;
            this.f37998r = profileColorId;
            long profileEmojiId = ChatObject.getProfileEmojiId(chat);
            this.f38005w = profileEmojiId;
            this.v = profileEmojiId;
            TLRPC.EmojiStatus emojiStatus = chat.emoji_status;
            this.f38009y = emojiStatus;
            this.f38007x = emojiStatus;
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
        ga gaVar = new ga(this, 2);
        org.telegram.ui.ActionBar.r5 r5Var = this.simpleActionBar;
        if (r5Var != null) {
            r5Var.setBackButtonImage(R.drawable.ic_ab_back);
            this.simpleActionBar.setTitle(LocaleController.getString(R.string.ChannelColorTitle2));
            this.simpleActionBar.setActionBarMenuOnItemClick(gaVar);
        } else {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            this.actionBar.setTitle(LocaleController.getString(R.string.ChannelColorTitle2));
            this.actionBar.setActionBarMenuOnItemClick(gaVar);
        }
        org.telegram.ui.Components.yj0 yj0Var = new org.telegram.ui.Components.yj0(R.raw.sun_outline, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
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
        int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.J9, this.resourceProvider);
        this.K.Q(w02, "Sunny");
        this.K.Q(w02, "Path 6");
        this.K.Q(w02, "Path");
        this.K.Q(w02, "Path 5");
        org.telegram.ui.ActionBar.r5 r5Var2 = this.simpleActionBar;
        if (r5Var2 != null) {
            org.telegram.ui.ActionBar.x5 j11 = r5Var2.j();
            org.telegram.ui.Components.yj0 yj0Var2 = this.K;
            j11.getClass();
            d = j11.b(1, 0, null, yj0Var2, AndroidUtilities.dp(48.0f), null);
        } else {
            d = this.actionBar.l().d(1, this.K);
        }
        this.L = d;
        FrameLayout frameLayout = new FrameLayout(context);
        f1();
        A0();
        if (!this.d) {
            setHasOwnBackground(true);
            this.M.setSectionsDrawBackground(true);
        } else {
            this.M.setLegacySections(true);
            this.M.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.y6.f23300a7));
        }
        org.telegram.ui.Components.nm0 nm0Var = this.M;
        oc ocVar = new oc(this);
        this.N = ocVar;
        nm0Var.setAdapter(ocVar);
        new s4.t(3);
        this.M.setLayoutManager(new s4.c0());
        org.telegram.ui.Components.nm0 nm0Var2 = this.M;
        if (this.d) {
            f7 = 68.0f;
        } else {
            f7 = 0.0f;
        }
        frameLayout.addView(nm0Var2, org.telegram.ui.Components.kb1.h(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, f7));
        this.M.setOnItemClickListener(new di.x4(4, this, chatFull));
        s4.l lVar = new s4.l();
        lVar.n(350L);
        lVar.o(org.telegram.ui.Components.ds.h);
        lVar.C = false;
        lVar.f47798m = false;
        this.M.setItemAnimator(lVar);
        fi.d dVar = new fi.d(context, this.resourceProvider, true);
        dVar.setRoundRadius(24);
        this.P = dVar;
        dVar.i(LocaleController.getString(R.string.ApplyChanges), false, true);
        this.P.setOnClickListener(new a(this, 11));
        a1(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.O = frameLayout2;
        if (this.d) {
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23300a7, frameLayout2, getResourceProvider());
        } else {
            frameLayout2.setBackground(getBaseSimpleGlass().b(this.O));
        }
        this.O.addView(this.P, org.telegram.ui.Components.kb1.h(-1, 48.0f, 80, 10.0f, 10.0f, 10.0f, 10.0f));
        frameLayout.addView(this.O, org.telegram.ui.Components.kb1.i(-1, 68, 80));
        setBulletinDelegate(new d9(this, 1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d1(boolean z10) {
        MessageObject messageObject;
        View B0 = B0(this.S);
        View B02 = B0(this.T);
        View B03 = B0(this.U);
        View B04 = B0(this.W);
        if (B0 instanceof org.telegram.ui.Cells.ka) {
            org.telegram.ui.Cells.ka kaVar = (org.telegram.ui.Cells.ka) B0;
            org.telegram.ui.Cells.s1[] cells = kaVar.getCells();
            for (int i10 = 0; i10 < cells.length; i10++) {
                org.telegram.ui.Cells.s1 s1Var = cells[i10];
                if (s1Var != null && (messageObject = s1Var.getMessageObject()) != null) {
                    messageObject.overrideLinkColor = this.f37985f;
                    messageObject.overrideLinkEmoji = this.f37993n;
                    cells[i10].setAvatar(messageObject);
                    cells[i10].invalidate();
                }
            }
            Drawable f7 = fi.o6.f(this.H, this.currentAccount, this.F, this.J);
            this.H = f7;
            kaVar.setOverrideBackground(f7);
        }
        if (B02 instanceof qp0) {
            ((qp0) B02).a(this.f37985f, z10);
        } else if (B02 instanceof sc) {
            ((sc) B02).a(this.f37985f, z10);
        }
        if (B03 instanceof pc) {
            pc pcVar = (pc) B03;
            pcVar.a(this.currentAccount, this.f37985f, true);
            pcVar.c(this.f37993n, false, z10);
        }
        if (B04 instanceof zc) {
            zc zcVar = (zc) B04;
            String wallpaperEmoticon = ChatThemeController.getWallpaperEmoticon(this.F);
            if (wallpaperEmoticon == null && this.F == null && this.G != null) {
                wallpaperEmoticon = "❌";
            }
            zcVar.a(wallpaperEmoticon, z10);
            zcVar.setGalleryWallpaper(this.G);
        }
    }

    @Override
    public void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.chatWasBoostedByUser;
        long j10 = this.f37977a;
        if (i10 == i12) {
            if (j10 == ((Long) objArr[2]).longValue()) {
                Z0((TL_stories.TL_premium_boostsStatus) objArr[0]);
            }
        } else if (i10 == NotificationCenter.boostByChannelCreated) {
            if (!((Boolean) objArr[1]).booleanValue()) {
                getMessagesController().getBoostsController().getBoostsStats(j10, new gc(this, 2));
            }
        } else if (i10 == NotificationCenter.dialogDeleted && j10 == ((Long) objArr[0]).longValue()) {
            org.telegram.ui.ActionBar.j5 j5Var = this.parentLayout;
            if (j5Var != null && j5Var.getLastFragment() == this) {
                finishFragment();
            } else {
                removeSelfFromStack();
            }
        }
    }

    public final void e1() {
        TLRPC.StickerSet stickerSet;
        TLRPC.StickerSet stickerSet2;
        View B0 = B0(this.Z);
        View B02 = B0(this.f37980b0);
        View B03 = B0(this.f37982c0);
        View B04 = B0(this.f37986f0);
        View B05 = B0(this.f37988h0);
        View B06 = B0(this.f37990j0);
        if (B0 instanceof uc) {
            TLRPC.EmojiStatus emojiStatus = this.f38009y;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                uc ucVar = (uc) B0;
                tc tcVar = ucVar.f43982b;
                MessagesController.PeerColor fromCollectible = MessagesController.PeerColor.fromCollectible(emojiStatus);
                tcVar.c(fromCollectible, true);
                ucVar.f43981a.c(fromCollectible, true);
                tcVar.d(((TLRPC.TL_emojiStatusCollectible) this.f38009y).pattern_document_id, true, true);
            } else {
                uc ucVar2 = (uc) B0;
                tc tcVar2 = ucVar2.f43982b;
                int i10 = this.f38000s;
                tcVar2.b(i10, true);
                ucVar2.f43981a.b(ucVar2.h.currentAccount, i10, true);
                tcVar2.d(this.f38005w, false, true);
            }
            uc ucVar3 = (uc) B0;
            tc tcVar3 = ucVar3.f43982b;
            tcVar3.e(DialogObject.getEmojiStatusDocumentId(this.f38009y), false, true);
            tcVar3.a(this.f37985f);
            ucVar3.updateColors();
        }
        if (B02 instanceof qp0) {
            ((qp0) B02).a(this.f38000s, true);
        } else if (B02 instanceof sc) {
            ((sc) B02).a(this.f37985f, true);
        }
        if (B03 instanceof pc) {
            pc pcVar = (pc) B03;
            pcVar.a(this.currentAccount, this.f38000s, false);
            pcVar.c(this.f38005w, false, true);
        }
        if (B04 instanceof pc) {
            TLRPC.EmojiStatus emojiStatus2 = this.f38009y;
            if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                ((pc) B04).b(MessagesController.PeerColor.fromCollectible(emojiStatus2));
            } else {
                ((pc) B04).a(this.currentAccount, this.f38000s, false);
            }
            ((pc) B04).c(DialogObject.getEmojiStatusDocumentId(this.f38009y), DialogObject.isEmojiStatusCollectible(this.f38009y), true);
        }
        boolean z10 = B05 instanceof pc;
        long j10 = this.f37977a;
        if (z10) {
            pc pcVar2 = (pc) B05;
            pcVar2.a(this.currentAccount, this.f38000s, false);
            TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-j10);
            if (chatFull != null && (stickerSet2 = chatFull.emojiset) != null) {
                pcVar2.c(G0(stickerSet2), false, false);
            } else {
                pcVar2.c(0L, false, false);
            }
        }
        if (B06 instanceof pc) {
            TLRPC.ChatFull chatFull2 = getMessagesController().getChatFull(-j10);
            if (chatFull2 != null && (stickerSet = chatFull2.stickerset) != null) {
                ((pc) B06).d(F0(stickerSet));
            } else {
                ((pc) B06).c(0L, false, false);
            }
        }
        f1();
    }

    public void f1() {
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
        this.f37980b0 = i10 + 6;
        int i11 = i10 + 8;
        this.R = i11;
        this.f37982c0 = i10 + 7;
        if (this.f38005w == 0 && this.f38000s < 0 && !(this.f38009y instanceof TLRPC.TL_emojiStatusCollectible)) {
            int i12 = this.f37984e0;
            this.f37984e0 = -1;
            if (i12 >= 0 && (ocVar2 = this.N) != null) {
                ocVar2.u(i12);
                this.N.m(this.f37982c0);
            }
        } else {
            if (this.f37984e0 >= 0) {
                z10 = true;
            }
            this.R = i10 + 9;
            this.f37984e0 = i11;
            if (!z10 && (ocVar = this.N) != null) {
                ocVar.o(i11);
                this.N.m(this.f37982c0);
            }
        }
        int i13 = this.R;
        this.f37983d0 = i13;
        this.f37986f0 = i13 + 1;
        this.R = i13 + 3;
        this.f37987g0 = i13 + 2;
    }

    public final void g1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bd.g1():void");
    }

    @Override
    public final org.telegram.ui.Components.nm0 getListViewForSimpleGlass() {
        if (!this.d) {
            return this.M;
        }
        return null;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return !this.d;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (T0() && this.f37979b >= V0()) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.f37979b >= V0() && T0()) {
            if (z10) {
                Y0();
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public boolean onFragmentCreate() {
        getMediaDataController().loadRestrictedStatusEmojis();
        getNotificationCenter().addWeakObserver(this, NotificationCenter.boostByChannelCreated);
        getNotificationCenter().addWeakObserver(this, NotificationCenter.chatWasBoostedByUser);
        getNotificationCenter().addWeakObserver(this, NotificationCenter.dialogDeleted);
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
    public final void onInsets(int i10, int i11, int i12, int i13) {
        if (!this.d && this.O != null) {
            int dp = AndroidUtilities.dp(68.0f) + i13;
            ViewGroup.LayoutParams layoutParams = this.O.getLayoutParams();
            if (layoutParams.height != dp) {
                layoutParams.height = dp;
                this.O.setLayoutParams(layoutParams);
            }
            if (this.O.getPaddingLeft() != i10 || this.O.getPaddingRight() != i12 || this.O.getPaddingBottom() != i13) {
                this.O.setPadding(i10, 0, i12, i13);
            }
            oi.a.d(this.M, i11, i13, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), AndroidUtilities.dp(68.0f));
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            y0();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        i0.b bVar = this.mSystemInsets;
        onInsets(bVar.f13449a, bVar.f13450b, bVar.f13451c, bVar.d);
    }

    @Override
    public final void setResourceProvider(org.telegram.ui.ActionBar.u6 u6Var) {
        this.f37997q0 = u6Var;
    }

    @Override
    public final boolean useSimpleActionBar() {
        return !this.d;
    }

    public final void x0() {
        int themedColor;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar == null) {
            return;
        }
        int i10 = -1;
        if (this.d && this.f38000s != -1) {
            themedColor = -1;
        } else {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.A8);
        }
        kVar.setTitleColor(themedColor);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        if (!this.d || this.f38000s == -1) {
            i10 = getThemedColor(org.telegram.ui.ActionBar.y6.f23695v8);
        }
        kVar2.y(i10, false);
    }

    public void y0() {
        x0();
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.y6.f23637s8));
        }
        org.telegram.ui.Components.nm0 nm0Var = this.M;
        if (nm0Var != null && this.d) {
            nm0Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.y6.f23300a7));
        }
        FrameLayout frameLayout = this.O;
        if (frameLayout != null) {
            frameLayout.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.y6.f23300a7));
        }
    }

    public final void z0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bd.z0():void");
    }

    public void W0(int i10) {
    }
}
