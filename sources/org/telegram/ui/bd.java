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
public class bd extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public TLRPC.WallPaper E;
    public TLRPC.WallPaper F;
    public TLRPC.WallPaper G;
    public Drawable H;
    public SpannableStringBuilder I;
    public boolean J;
    public org.telegram.ui.Components.vj0 K;
    public org.telegram.ui.ActionBar.u0 L;
    public org.telegram.ui.Components.jm0 M;
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
    public final long f35576a;
    public int f35577a0;
    public int f35578b;
    public int f35579b0;
    public TL_stories.TL_premium_boostsStatus f35580c;
    public int f35581c0;
    public boolean d;
    public int f35582d0;
    public int e;
    public int f35583e0;
    public int f35584f;
    public int f35585f0;
    public int f35586g0;
    public long h;
    public int f35587h0;
    public int f35588i0;
    public int f35589j0;
    public int f35590k0;
    public org.telegram.ui.ActionBar.n2 f35591l0;
    public lc m0;
    public long f35592n;
    public float f35593n0;
    public ValueAnimator f35594o0;
    public boolean f35595p0;
    public org.telegram.ui.ActionBar.d6 f35596q0;
    public int f35597r;
    public final SparseIntArray f35598r0;
    public int f35599s;
    public final org.telegram.ui.ActionBar.f5 f35600s0;
    public final org.telegram.ui.ActionBar.f5 f35601t0;
    public final org.telegram.ui.ActionBar.f5 f35602u0;
    public long v;
    public final org.telegram.ui.ActionBar.f5 f35603v0;
    public long f35604w;
    public final Drawable f35605w0;
    public TLRPC.EmojiStatus f35606x;
    public final Drawable f35607x0;
    public TLRPC.EmojiStatus f35608y;
    public final Paint f35609y0;

    public bd(long j10) {
        super(null);
        boolean q6 = org.telegram.ui.ActionBar.h6.I.q();
        this.J = q6;
        this.R = 0;
        this.f35595p0 = q6;
        this.f35598r0 = new SparseIntArray();
        Paint paint = new Paint(1);
        this.f35609y0 = paint;
        paint.setStrokeWidth(1.0f);
        paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20994d7, this.resourceProvider));
        this.f35605w0 = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_check_s).mutate();
        this.f35607x0 = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_halfcheck).mutate();
        this.f35576a = j10;
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j10));
        if (chat != null) {
            this.f35578b = chat.level;
        }
        MessagesController.getInstance(this.currentAccount).getBoostsController().getBoostsStats(j10, new org.telegram.ui.ActionBar.j3(5, this, chat));
        this.resourceProvider = new ad(this);
        this.f35600s0 = new org.telegram.ui.ActionBar.f5(0, false, false, this.resourceProvider);
        this.f35601t0 = new org.telegram.ui.ActionBar.f5(0, false, true, this.resourceProvider);
        this.f35602u0 = new org.telegram.ui.ActionBar.f5(0, true, false, this.resourceProvider);
        this.f35603v0 = new org.telegram.ui.ActionBar.f5(0, true, true, this.resourceProvider);
    }

    public static void U(bd bdVar) {
        org.telegram.ui.ActionBar.d6 d6Var = bdVar.resourceProvider;
        if (d6Var instanceof ad) {
            bd bdVar2 = ((ad) d6Var).f35351a;
            bdVar2.J = !bdVar2.J;
            bdVar2.d1();
            bdVar2.Z0(false);
        } else {
            bdVar.J = !bdVar.J;
            bdVar.d1();
        }
        bdVar.U0(bdVar.J, true);
        bdVar.Z0(false);
    }

    public static void V(org.telegram.ui.bd r13, org.telegram.messenger.ChannelBoostsController.CanApplyBoost r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bd.V(org.telegram.ui.bd, org.telegram.messenger.ChannelBoostsController$CanApplyBoost):void");
    }

    public static void W(org.telegram.ui.bd r22, org.telegram.tgnet.TLRPC.ChatFull r23, android.view.View r24, int r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bd.W(org.telegram.ui.bd, org.telegram.tgnet.TLRPC$ChatFull, android.view.View, int):void");
    }

    public static void Y0(View view) {
        int i10;
        if (view instanceof oc) {
            oc ocVar = (oc) view;
            ocVar.f39832a.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, ocVar.d));
        } else if (view instanceof org.telegram.ui.Cells.q8) {
            ((org.telegram.ui.Cells.q8) view).v();
        } else if (view instanceof rc) {
            rc rcVar = (rc) view;
            AndroidUtilities.forEachViews((RecyclerView) rcVar.f41122b, (Utilities.Callback<View>) new org.telegram.ui.ActionBar.j3(6, rcVar, MessagesController.getInstance(rcVar.d).peerColors));
        } else if (view instanceof zc) {
            zc zcVar = (zc) view;
            ArrayList arrayList = zcVar.f43717c;
            org.telegram.ui.ActionBar.d6 d6Var = zcVar.f43716b;
            if (d6Var != null) {
                i10 = d6Var.a();
            } else {
                i10 = org.telegram.ui.ActionBar.h6.I.q();
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((org.telegram.ui.Components.vp) arrayList.get(i11)).f31855c = i10;
            }
            AndroidUtilities.forEachViews((RecyclerView) zcVar.d, (Utilities.Callback<View>) new uc(zcVar, 0));
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
                return groupStickerSetById.documents.get(0).f20285id;
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
        if (this.e == this.f35584f && this.h == this.f35592n && this.f35597r == this.f35599s && this.v == this.f35604w && DialogObject.emojiStatusesEqual(this.f35606x, this.f35608y) && ChatThemeController.wallpaperEquals(this.E, this.F)) {
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
        if (this.e != this.f35584f) {
            MessagesController.PeerColors peerColors = getMessagesController().peerColors;
            if (peerColors == null) {
                color = null;
            } else {
                color = peerColors.getColor(this.f35584f);
            }
            if (color != null) {
                i10 = Math.max(0, color.getLvl(this.d));
            }
        }
        if (this.h != this.f35592n) {
            i10 = Math.max(i10, getMessagesController().channelBgIconLevelMin);
        }
        if (this.f35597r != this.f35599s) {
            MessagesController.PeerColors peerColors2 = getMessagesController().profilePeerColors;
            if (peerColors2 != null) {
                peerColor = peerColors2.getColor(this.f35599s);
            }
            if (peerColor != null) {
                i10 = Math.max(i10, peerColor.getLvl(this.d));
            }
        }
        if (this.v != this.f35604w) {
            i10 = Math.max(i10, J0());
        }
        if (!DialogObject.emojiStatusesEqual(this.f35606x, this.f35608y)) {
            i10 = Math.max(i10, F0());
        }
        if (!ChatThemeController.wallpaperEquals(this.E, this.F)) {
            return Math.max(i10, O0());
        }
        return i10;
    }

    public final void U0(boolean z10, boolean z11) {
        int i10;
        if (this.f35595p0 != z10) {
            this.f35595p0 = z10;
            int i11 = 0;
            if (z11) {
                org.telegram.ui.Components.vj0 vj0Var = this.K;
                if (z10) {
                    i11 = vj0Var.e[0];
                }
                vj0Var.P(i11);
                org.telegram.ui.Components.vj0 vj0Var2 = this.K;
                if (vj0Var2 != null) {
                    vj0Var2.start();
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
        alertDialog$Builder.f20608a.R = LocaleController.getString(R.string.ChannelColorUnsaved);
        alertDialog$Builder.f20608a.T = LocaleController.getString(R.string.ChannelColorUnsavedMessage);
        alertDialog$Builder.h(LocaleController.getString(R.string.Dismiss), new org.telegram.ui.ActionBar.a2(this) {
            public final bd f37572b;

            {
                this.f37572b = this;
            }

            @Override
            public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
                switch (r2) {
                    case 0:
                        this.f37572b.finishFragment();
                        return;
                    default:
                        this.f37572b.w0();
                        return;
                }
            }
        });
        alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new org.telegram.ui.ActionBar.a2(this) {
            public final bd f37572b;

            {
                this.f37572b = this;
            }

            @Override
            public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
                switch (r2) {
                    case 0:
                        this.f37572b.finishFragment();
                        return;
                    default:
                        this.f37572b.w0();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20608a;
        showDialog(b2Var);
        ((TextView) b2Var.d(-2)).setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21231q7));
    }

    public final void W0(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        if (tL_premium_boostsStatus != null) {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.f35576a));
            this.f35580c = tL_premium_boostsStatus;
            int i10 = tL_premium_boostsStatus.level;
            this.f35578b = i10;
            if (chat != null) {
                chat.level = i10;
            }
            nc ncVar = this.N;
            if (ncVar != null) {
                ncVar.l();
            }
            X0(true);
        }
    }

    public void X0(boolean z10) {
        if (this.P != null && this.f35580c != null) {
            int S0 = S0();
            if (this.f35578b >= S0) {
                this.P.f(null, z10);
                return;
            }
            if (this.I == null) {
                this.I = new SpannableStringBuilder("l");
                org.telegram.ui.Components.yq yqVar = new org.telegram.ui.Components.yq(R.drawable.mini_switch_lock, 0);
                yqVar.setTopOffset(1);
                this.I.setSpan(yqVar, 0, 1, 33);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.I).append((CharSequence) LocaleController.formatPluralString("BoostLevelRequired", S0, new Object[0]));
            this.P.f(spannableStringBuilder, z10);
        }
    }

    public void Z0(boolean z10) {
        int themedColor;
        this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21272s8));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = -1;
        if (this.d && this.f35599s != -1) {
            themedColor = -1;
        } else {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.h6.A8);
        }
        kVar.setTitleColor(themedColor);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        if (!this.d || this.f35599s == -1) {
            i10 = getThemedColor(org.telegram.ui.ActionBar.h6.f21328v8);
        }
        kVar2.C(i10, false);
        this.actionBar.B(getThemedColor(org.telegram.ui.ActionBar.h6.f21291t8), false);
        if (!z10) {
            org.telegram.ui.Components.jm0 jm0Var = this.M;
            int i11 = org.telegram.ui.ActionBar.h6.f20935a7;
            jm0Var.setBackgroundColor(getThemedColor(i11));
            this.N.l();
            AndroidUtilities.forEachViews((RecyclerView) this.M, (Utilities.Callback<View>) new ci.e(this));
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
        if (y02 instanceof org.telegram.ui.Cells.fa) {
            org.telegram.ui.Cells.fa faVar = (org.telegram.ui.Cells.fa) y02;
            org.telegram.ui.Cells.u1[] cells = faVar.getCells();
            for (int i10 = 0; i10 < cells.length; i10++) {
                org.telegram.ui.Cells.u1 u1Var = cells[i10];
                if (u1Var != null && (messageObject = u1Var.getMessageObject()) != null) {
                    messageObject.overrideLinkColor = this.f35584f;
                    messageObject.overrideLinkEmoji = this.f35592n;
                    cells[i10].setAvatar(messageObject);
                    cells[i10].invalidate();
                }
            }
            Drawable f7 = ei.r6.f(this.H, this.currentAccount, this.F, this.J);
            this.H = f7;
            faVar.setOverrideBackground(f7);
        }
        if (y03 instanceof fp0) {
            ((fp0) y03).a(this.f35584f, z10);
        } else if (y03 instanceof rc) {
            ((rc) y03).a(this.f35584f, z10);
        }
        if (y04 instanceof oc) {
            oc ocVar = (oc) y04;
            ocVar.a(this.currentAccount, this.f35584f, true);
            ocVar.c(this.f35592n, false, z10);
        }
        if (y05 instanceof zc) {
            zc zcVar = (zc) y05;
            String wallpaperEmoticon = ChatThemeController.getWallpaperEmoticon(this.F);
            if (wallpaperEmoticon == null && this.F == null && this.G != null) {
                wallpaperEmoticon = "❌";
            }
            zcVar.a(wallpaperEmoticon, z10);
            zcVar.setGalleryWallpaper(this.G);
        }
    }

    public final void b1() {
        TLRPC.StickerSet stickerSet;
        TLRPC.StickerSet stickerSet2;
        View y02 = y0(this.Z);
        View y03 = y0(this.f35579b0);
        View y04 = y0(this.f35581c0);
        View y05 = y0(this.f35585f0);
        View y06 = y0(this.f35587h0);
        View y07 = y0(this.f35589j0);
        if (y02 instanceof tc) {
            TLRPC.EmojiStatus emojiStatus = this.f35608y;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                tc tcVar = (tc) y02;
                sc scVar = tcVar.f41640b;
                MessagesController.PeerColor fromCollectible = MessagesController.PeerColor.fromCollectible(emojiStatus);
                scVar.c(fromCollectible, true);
                tcVar.f41639a.c(fromCollectible, true);
                scVar.d(((TLRPC.TL_emojiStatusCollectible) this.f35608y).pattern_document_id, true, true);
            } else {
                tc tcVar2 = (tc) y02;
                sc scVar2 = tcVar2.f41640b;
                int i10 = this.f35599s;
                scVar2.b(i10, true);
                tcVar2.f41639a.b(tcVar2.h.currentAccount, i10, true);
                scVar2.d(this.f35604w, false, true);
            }
            tc tcVar3 = (tc) y02;
            sc scVar3 = tcVar3.f41640b;
            scVar3.e(DialogObject.getEmojiStatusDocumentId(this.f35608y), false, true);
            scVar3.a(this.f35584f);
            tcVar3.d();
        }
        if (y03 instanceof fp0) {
            ((fp0) y03).a(this.f35599s, true);
        } else if (y03 instanceof rc) {
            ((rc) y03).a(this.f35584f, true);
        }
        if (y04 instanceof oc) {
            oc ocVar = (oc) y04;
            ocVar.a(this.currentAccount, this.f35599s, false);
            ocVar.c(this.f35604w, false, true);
        }
        if (y05 instanceof oc) {
            TLRPC.EmojiStatus emojiStatus2 = this.f35608y;
            if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                ((oc) y05).b(MessagesController.PeerColor.fromCollectible(emojiStatus2));
            } else {
                ((oc) y05).a(this.currentAccount, this.f35599s, false);
            }
            ((oc) y05).c(DialogObject.getEmojiStatusDocumentId(this.f35608y), DialogObject.isEmojiStatusCollectible(this.f35608y), true);
        }
        boolean z10 = y06 instanceof oc;
        long j10 = this.f35576a;
        if (z10) {
            oc ocVar2 = (oc) y06;
            ocVar2.a(this.currentAccount, this.f35599s, false);
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
        this.f35579b0 = i10 + 6;
        int i11 = i10 + 8;
        this.R = i11;
        this.f35581c0 = i10 + 7;
        if (this.f35604w == 0 && this.f35599s < 0 && !(this.f35608y instanceof TLRPC.TL_emojiStatusCollectible)) {
            int i12 = this.f35583e0;
            this.f35583e0 = -1;
            if (i12 >= 0 && (ncVar2 = this.N) != null) {
                ncVar2.u(i12);
                this.N.m(this.f35581c0);
            }
        } else {
            if (this.f35583e0 >= 0) {
                z10 = true;
            }
            this.R = i10 + 9;
            this.f35583e0 = i11;
            if (!z10 && (ncVar = this.N) != null) {
                ncVar.o(i11);
                this.N.m(this.f35581c0);
            }
        }
        int i13 = this.R;
        this.f35582d0 = i13;
        this.f35585f0 = i13 + 1;
        this.R = i13 + 3;
        this.f35586g0 = i13 + 2;
    }

    @Override
    public View createView(Context context) {
        MessagesController messagesController = getMessagesController();
        long j10 = -this.f35576a;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        if (chat != null) {
            int colorId = ChatObject.getColorId(chat);
            this.f35584f = colorId;
            this.e = colorId;
            long emojiId = ChatObject.getEmojiId(chat);
            this.f35592n = emojiId;
            this.h = emojiId;
            int profileColorId = ChatObject.getProfileColorId(chat);
            this.f35599s = profileColorId;
            this.f35597r = profileColorId;
            long profileEmojiId = ChatObject.getProfileEmojiId(chat);
            this.f35604w = profileEmojiId;
            this.v = profileEmojiId;
            TLRPC.EmojiStatus emojiStatus = chat.emoji_status;
            this.f35608y = emojiStatus;
            this.f35606x = emojiStatus;
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
        org.telegram.ui.Components.vj0 vj0Var = new org.telegram.ui.Components.vj0(R.raw.sun, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.K = vj0Var;
        vj0Var.h = true;
        if (!this.J) {
            vj0Var.P(0);
            this.K.M(0);
        } else {
            vj0Var.M(35);
            this.K.P(36);
        }
        this.K.Z = true;
        int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.J9, this.resourceProvider);
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
        org.telegram.ui.Components.jm0 jm0Var = this.M;
        nc ncVar = new nc(this);
        this.N = ncVar;
        jm0Var.setAdapter(ncVar);
        new s4.s(3);
        this.M.setLayoutManager(new s4.b0());
        org.telegram.ui.Components.jm0 jm0Var2 = this.M;
        int i10 = org.telegram.ui.ActionBar.h6.f20935a7;
        jm0Var2.setBackgroundColor(getThemedColor(i10));
        frameLayout.addView(this.M, w7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 68.0f));
        this.M.setOnItemClickListener(new ci.y4(4, this, chatFull));
        s4.k kVar = new s4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.bs.h);
        kVar.C = false;
        kVar.f45954m = false;
        this.M.setItemAnimator(kVar);
        ei.d dVar = new ei.d(context, this.resourceProvider, true);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bd.d1():void");
    }

    @Override
    public void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.chatWasBoostedByUser;
        long j10 = this.f35576a;
        if (i10 == i12) {
            if (j10 == ((Long) objArr[2]).longValue()) {
                W0((TL_stories.TL_premium_boostsStatus) objArr[0]);
            }
        } else if (i10 == NotificationCenter.boostByChannelCreated) {
            if (!((Boolean) objArr[1]).booleanValue()) {
                getMessagesController().getBoostsController().getBoostsStats(j10, new fc(this, 2));
            }
        } else if (i10 == NotificationCenter.dialogDeleted && j10 == ((Long) objArr[0]).longValue()) {
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
        if (Q0() && this.f35578b >= S0()) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.f35578b >= S0() && Q0()) {
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
        this.f35596q0 = d6Var;
    }

    public final void w0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bd.w0():void");
    }

    public void x0() {
        org.telegram.ui.Components.jm0 jm0Var = new org.telegram.ui.Components.jm0(getParentActivity(), this.resourceProvider);
        this.M = jm0Var;
        jm0Var.setSections(false);
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
