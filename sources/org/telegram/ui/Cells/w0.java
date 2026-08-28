package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AlignmentSpan;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.h11;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.nz0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.ox0;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.pc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.im;
import org.telegram.ui.rj;
import org.telegram.ui.s10;
public class w0 extends a0 implements DownloadController.FileDownloadProgressListener, NotificationCenter.NotificationCenterDelegate, o4 {
    public static final HashMap f25824f2;
    public boolean A;
    public float A0;
    public RectF A1;
    public boolean B;
    public final gh.m5 B0;
    public final ia B1;
    public boolean C;
    public ox0 C0;
    public boolean C1;
    public final int D;
    public MessageObject D0;
    public ColorMatrixColorFilter D1;
    public final ImageReceiver E;
    public int E0;
    public CornerPathEffect E1;
    public Drawable F;
    public CharSequence F0;
    public Path F1;
    public Path G;
    public fh.b2 G0;
    public nz0 G1;
    public final org.telegram.ui.Components.z8 H;
    public int H0;
    public final View H1;
    public StaticLayout I;
    public int I0;
    public final Path I1;
    public int J;
    public Paint J0;
    public final zf.v1 J1;
    public int K;
    public TextPaint K0;
    public int K1;
    public StaticLayout L;
    public final ArrayList L0;
    public final ArrayList L1;
    public int M;
    public final ArrayList M0;
    public BotInlineKeyboard.Source M1;
    public int N;
    public final Path N0;
    public boolean N1;
    public int O;
    public int O0;
    public float O1;
    public int P;
    public int P0;
    public final Paint P1;
    public int Q;
    public final RectF Q0;
    public boolean Q1;
    public int R;
    public boolean R0;
    public View.OnClickListener R1;
    public boolean S;
    public boolean S0;
    public int S1;
    public boolean T;
    public t0 T0;
    public final Path T1;
    public RadialProgressView U;
    public final org.telegram.ui.ActionBar.b6 U0;
    public final float[] U1;
    public float V;
    public int V0;
    public final float[] V1;
    public final ih.l7 W;
    public int W0;
    public final Path W1;
    public StaticLayout X0;
    public final int[] X1;
    public Paint Y0;
    public int Y1;
    public nz0 Z0;
    public SpannableStringBuilder Z1;
    public boolean f25825a0;
    public StaticLayout f25826a1;
    public boolean a2;
    public boolean f25827b0;
    public boolean f25828b1;
    public Runnable f25829b2;
    public boolean f25830c0;
    public boolean f25831c1;
    public PorterDuffColorFilter f25832c2;
    public boolean f25833d0;
    public int f25834d1;
    public int f25835d2;
    public boolean f25836e0;
    public final org.telegram.ui.Components.y5 f25837e1;
    public final v0 f25838e2;
    public int f25839f;
    public int f25840f0;
    public s10 f25841f1;
    public boolean f25842g0;
    public u0 f25843g1;
    public int h;
    public int f25844h0;
    public int f25845h1;
    public boolean f25846i0;
    public int f25847i1;
    public h11 f25848j0;
    public int f25849j1;
    public final RectF f25850k0;
    public nz0 f25851k1;
    public final ArrayList f25852l0;
    public StaticLayout l1;
    public final Stack m0;
    public boolean f25853m1;
    public final pc f25854n;
    public org.telegram.ui.Components.p5 f25855n0;
    public TextPaint f25856n1;
    public TextPaint f25857o0;
    public StaticLayout f25858o1;
    public float f25859p0;
    public float f25860p1;
    public float f25861q0;
    public StaticLayout f25862q1;
    public p80 f25863r;
    public int f25864r0;
    public float f25865r1;
    public final boolean f25866s;
    public boolean f25867s0;
    public final TextPaint f25868s1;
    public ImageLocation f25869t0;
    public final TextPaint f25870t1;
    public float f25871u0;
    public final TextPaint f25872u1;
    public View v;
    public float f25873v0;
    public TLRPC.Document f25874v1;
    public final int f25875w;
    public boolean f25876w0;
    public TLRPC.VideoSize f25877w1;
    public URLSpan f25878x;
    public boolean f25879x0;
    public final RadialProgress2 f25880x1;
    public dh.l f25881y;
    public final hg.s0 f25882y0;
    public int f25883y1;
    public float f25884z0;
    public boolean f25885z1;

    static {
        HashMap hashMap = new HashMap();
        f25824f2 = hashMap;
        ta.b.h(1, hashMap, "1⃣", 3, "2⃣");
        ta.b.h(6, hashMap, "3⃣", 12, "4⃣");
        hashMap.put(24, "5⃣");
    }

    public w0(Context context) {
        this(context, null, false);
    }

    public static float O(StaticLayout staticLayout) {
        float f10 = 0.0f;
        for (int i9 = 0; i9 < staticLayout.getLineCount(); i9++) {
            float ceil = (int) Math.ceil(staticLayout.getLineWidth(i9));
            if (ceil > f10) {
                f10 = ceil;
            }
        }
        return f10;
    }

    private void setStarsPaused(boolean z10) {
        zf.v1 v1Var = this.J1;
        if (z10 == v1Var.f50738g) {
            return;
        }
        v1Var.f50738g = z10;
        if (z10) {
            v1Var.Q = System.currentTimeMillis();
            return;
        }
        for (int i9 = 0; i9 < v1Var.f50744n.size(); i9++) {
            zf.u1 u1Var = (zf.u1) v1Var.f50744n.get(i9);
            u1Var.f50713a = (System.currentTimeMillis() - v1Var.Q) + u1Var.f50713a;
        }
        invalidate();
    }

    public static SpannableStringBuilder x(int i9, String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceArrows(str, false, AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(1.3f), 0.8f, i9));
        spannableStringBuilder.insert(0, (CharSequence) "*");
        spannableStringBuilder.setSpan(new p2(AndroidUtilities.dp(18.0f)), 0, 1, 33);
        if (Build.VERSION.SDK_INT >= 29) {
            android.support.v4.media.session.z.k();
            spannableStringBuilder.setSpan(android.support.v4.media.session.z.f(AndroidUtilities.dp(12.0f)), 0, spannableStringBuilder.length(), 33);
        }
        spannableStringBuilder.setSpan(new AlignmentSpan.Standard(Layout.Alignment.ALIGN_NORMAL), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public final void A(Canvas canvas, boolean z10) {
        if (this.f25866s) {
            if (!I() || z10) {
                if (!I() && z10) {
                    return;
                }
            } else {
                return;
            }
        }
        C(canvas, z10, null);
    }

    public final void C(Canvas canvas, boolean z10, Integer num) {
        float f10;
        Canvas canvas2;
        float f11 = 1.0f;
        if (z10) {
            f10 = getAlpha();
        } else {
            f10 = 1.0f;
        }
        if (f10 > 0.0f) {
            org.telegram.ui.ActionBar.b6 b6Var = this.U0;
            if (b6Var != null) {
                b6Var.o(this.f25861q0, this.f25859p0 + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.f25864r0);
            } else {
                org.telegram.ui.ActionBar.f6.q(this.f25861q0, this.f25859p0 + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.f25864r0);
            }
            MessageObject messageObject = this.D0;
            if (messageObject != null && messageObject.shouldDrawReactions()) {
                hg.s0 s0Var = this.f25882y0;
                boolean z11 = s0Var.f10734b;
                v0 v0Var = this.f25838e2;
                if (!z11 || (v0Var.f25779b && s0Var.f10742l)) {
                    s0Var.f10733a = 1.0f;
                    int i9 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
                    if (i9 < 0) {
                        canvas2 = canvas;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f10 * 255.0f), 31);
                    } else {
                        canvas2 = canvas;
                    }
                    if (v0Var.f25779b) {
                        f11 = v0Var.f25780c;
                    }
                    s0Var.d(canvas2, f11, num);
                    if (i9 < 0) {
                        canvas2.restore();
                    }
                }
            }
        }
    }

    public final void D(im imVar, Canvas canvas, int i9, Integer num, float f10) {
        hg.s0 s0Var = this.f25882y0;
        if (!s0Var.f10734b) {
            org.telegram.ui.ActionBar.b6 b6Var = this.U0;
            if (b6Var != null) {
                b6Var.o(this.f25861q0, this.f25859p0 + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.f25864r0);
            } else {
                org.telegram.ui.ActionBar.f6.q(this.f25861q0, this.f25859p0 + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.f25864r0);
            }
            s0Var.D = f10;
            s0Var.f(imVar, canvas, i9, num);
        }
    }

    public final ColorFilter E(int i9) {
        if (i9 != this.f25835d2 || this.f25832c2 == null) {
            this.f25835d2 = i9;
            this.f25832c2 = new PorterDuffColorFilter(i9, PorterDuff.Mode.SRC_IN);
        }
        return this.f25832c2;
    }

    public final int F(MessageObject messageObject) {
        int i9;
        int i10 = this.V0;
        int i11 = messageObject.type;
        if (i11 == 37) {
            i10 = AndroidUtilities.dp(52.0f);
        } else if (i11 == 21 || M()) {
            i10 = AndroidUtilities.dp(78.0f);
        }
        if (!L() && (i9 = messageObject.type) != 34 && i9 != 35) {
            return i10;
        }
        return 0;
    }

    public Paint G(String str) {
        Paint paint;
        org.telegram.ui.ActionBar.b6 b6Var = this.U0;
        if (b6Var != null) {
            paint = b6Var.O(str);
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return org.telegram.ui.ActionBar.f6.S0(str);
    }

    public final float H(MessageObject messageObject) {
        MessagesController messagesController;
        String str;
        if (messageObject != null) {
            try {
                if (messageObject.type == 22 && (str = (messagesController = MessagesController.getInstance(this.D)).uploadingWallpaper) != null && TextUtils.equals(messageObject.messageOwner.action.wallpaper.uploadingImage, str)) {
                    return messagesController.uploadingWallpaperInfo.f23995r;
                }
                return 1.0f;
            } catch (Exception e10) {
                FileLog.e(e10);
                return 1.0f;
            }
        }
        return 1.0f;
    }

    public final boolean I() {
        if (this.J0 == null) {
            org.telegram.ui.ActionBar.b6 b6Var = this.U0;
            if (b6Var != null) {
                if (b6Var.t0()) {
                    return true;
                }
                return false;
            } else if (org.telegram.ui.ActionBar.f6.a1()) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public final void J() {
        t0 t0Var = this.T0;
        if (t0Var != null && t0Var.h()) {
            super.invalidate();
        } else if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    public final boolean K(MessageObject messageObject) {
        if (messageObject != null) {
            int i9 = messageObject.type;
            if (i9 == 30 || i9 == 18 || i9 == 25 || M()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean L() {
        TLRPC.Message message;
        MessageObject messageObject = this.D0;
        if (messageObject != null && (message = messageObject.messageOwner) != null && (message.action instanceof TLRPC.TL_messageActionSuggestedPostApproval)) {
            return true;
        }
        return false;
    }

    public final boolean M() {
        MessageObject messageObject;
        int i9;
        if (!this.B0.d() && this.C0 == null && (i9 = (messageObject = this.D0).type) != 31 && i9 != 37 && i9 != 33 && i9 != 35 && i9 != 34 && i9 != 21 && i9 != 22 && !messageObject.isStoryMention()) {
            TLRPC.Message message = this.D0.messageOwner;
            if (message != null) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
                    if (!((TLRPC.TL_messageActionSuggestedPostApproval) messageAction).balance_too_low && !((TLRPC.TL_messageActionSuggestedPostApproval) messageAction).rejected) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final boolean N() {
        MessageObject messageObject = this.D0;
        if (messageObject != null) {
            TLRPC.Message message = messageObject.messageOwner;
            TLRPC.MessageAction messageAction = message.action;
            if (((messageAction instanceof TLRPC.TL_messageActionGiftCode) || (messageAction instanceof TLRPC.TL_messageActionGiftStars)) && (message.from_id instanceof TLRPC.TL_peerUser)) {
                return UserObject.isUserSelf(MessagesController.getInstance(this.D).getUser(Long.valueOf(this.D0.messageOwner.from_id.user_id)));
            }
            return false;
        }
        return false;
    }

    public final void P(CharacterStyle characterStyle) {
        if (this.T0 != null && (characterStyle instanceof URLSpan)) {
            String url = ((URLSpan) characterStyle).getURL();
            if (url.startsWith("task")) {
                this.T0.L(this, this.D0.getReplyMsgId(), Integer.parseInt(url.substring(5)));
                return;
            }
            if (url.startsWith("topic")) {
                URLSpan uRLSpan = this.f25878x;
                if (uRLSpan instanceof p41) {
                    TLObject tLObject = ((p41) uRLSpan).f31543c;
                    if (tLObject instanceof TLRPC.TL_forumTopic) {
                        vf.c.m(this.T0.y0(), -this.T0.a(), (TLRPC.TL_forumTopic) tLObject, 0);
                        return;
                    }
                    return;
                }
            }
            if (url.startsWith("invite")) {
                URLSpan uRLSpan2 = this.f25878x;
                if (uRLSpan2 instanceof p41) {
                    TLObject tLObject2 = ((p41) uRLSpan2).f31543c;
                    if (tLObject2 instanceof TLRPC.TL_chatInviteExported) {
                        this.T0.C0((TLRPC.TL_chatInviteExported) tLObject2);
                        return;
                    }
                    return;
                }
            }
            if (url.startsWith("game")) {
                this.T0.E(this, this.D0.getReplyMsgId());
            } else if (url.startsWith("http")) {
                ve.e.s(getContext(), url);
            } else {
                this.T0.o1(Long.parseLong(url));
            }
        }
    }

    public final void Q() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = new TLRPC.TL_premiumGiftOption();
        MessageObject messageObject = this.D0;
        TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
        tL_premiumGiftOption.amount = messageAction.amount;
        tL_premiumGiftOption.months = messageAction.months;
        tL_premiumGiftOption.currency = messageAction.currency;
        String str = null;
        if (messageObject != null && (messageAction instanceof TLRPC.TL_messageActionGiftCode) && !N()) {
            str = ((TLRPC.TL_messageActionGiftCode) this.D0.messageOwner.action).slug;
        }
        if (this.T0 != null) {
            AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.e(this, tL_premiumGiftOption, str, 9));
        }
    }

    public final void R() {
        TLRPC.Message message;
        MessageObject messageObject = this.D0;
        if (messageObject != null && (message = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            boolean z10 = messageAction instanceof TLRPC.TL_messageActionGiftStars;
            ih.l7 l7Var = this.W;
            if (z10) {
                Context context = getContext();
                TLRPC.Message message2 = this.D0.messageOwner;
                int i9 = message2.date;
                TLRPC.Peer peer = message2.from_id;
                TLRPC.Peer peer2 = message2.peer_id;
                TLRPC.TL_messageActionGiftStars tL_messageActionGiftStars = (TLRPC.TL_messageActionGiftStars) message2.action;
                org.telegram.ui.ActionBar.b6 b6Var = l7Var.J;
                TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
                starsTransaction.title = null;
                starsTransaction.description = null;
                starsTransaction.photo = null;
                TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
                starsTransaction.peer = tL_starsTransactionPeer;
                tL_starsTransactionPeer.peer = peer;
                starsTransaction.date = i9;
                starsTransaction.amount = TL_stars.StarsAmount.ofStars(tL_messageActionGiftStars.stars);
                starsTransaction.f22609id = tL_messageActionGiftStars.transaction_id;
                starsTransaction.gift = true;
                starsTransaction.sent_by = peer;
                starsTransaction.received_by = peer2;
                gh.oa.h1(context, false, 0L, this.D, starsTransaction, b6Var);
            } else if (messageAction instanceof TLRPC.TL_messageActionPrizeStars) {
                Context context2 = getContext();
                TLRPC.Message message3 = this.D0.messageOwner;
                int i10 = message3.date;
                TLRPC.Peer peer3 = message3.from_id;
                TLRPC.Peer peer4 = message3.peer_id;
                TLRPC.TL_messageActionPrizeStars tL_messageActionPrizeStars = (TLRPC.TL_messageActionPrizeStars) message3.action;
                org.telegram.ui.ActionBar.b6 b6Var2 = l7Var.J;
                TL_stars.StarsTransaction starsTransaction2 = new TL_stars.StarsTransaction();
                starsTransaction2.title = null;
                starsTransaction2.description = null;
                starsTransaction2.photo = null;
                TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer2 = new TL_stars.TL_starsTransactionPeer();
                starsTransaction2.peer = tL_starsTransactionPeer2;
                tL_starsTransactionPeer2.peer = tL_messageActionPrizeStars.boost_peer;
                starsTransaction2.date = i10;
                starsTransaction2.amount = TL_stars.StarsAmount.ofStars(tL_messageActionPrizeStars.stars);
                starsTransaction2.f22609id = tL_messageActionPrizeStars.transaction_id;
                starsTransaction2.gift = true;
                starsTransaction2.flags |= 8192;
                starsTransaction2.giveaway_post_id = tL_messageActionPrizeStars.giveaway_msg_id;
                starsTransaction2.sent_by = peer3;
                starsTransaction2.received_by = peer4;
                gh.oa.h1(context2, false, 0L, this.D, starsTransaction2, b6Var2);
            } else if (messageAction instanceof TLRPC.TL_messageActionGiftTon) {
                Context context3 = getContext();
                TLRPC.Message message4 = this.D0.messageOwner;
                int i11 = message4.date;
                TLRPC.Peer peer5 = message4.from_id;
                TLRPC.Peer peer6 = message4.peer_id;
                TLRPC.TL_messageActionGiftTon tL_messageActionGiftTon = (TLRPC.TL_messageActionGiftTon) message4.action;
                org.telegram.ui.ActionBar.b6 b6Var3 = l7Var.J;
                TL_stars.StarsTransaction starsTransaction3 = new TL_stars.StarsTransaction();
                starsTransaction3.title = null;
                starsTransaction3.description = null;
                starsTransaction3.photo = null;
                TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer3 = new TL_stars.TL_starsTransactionPeer();
                starsTransaction3.peer = tL_starsTransactionPeer3;
                tL_starsTransactionPeer3.peer = peer5;
                starsTransaction3.date = i11;
                TL_stars.TL_starsTonAmount tL_starsTonAmount = new TL_stars.TL_starsTonAmount();
                starsTransaction3.amount = tL_starsTonAmount;
                tL_starsTonAmount.amount = tL_messageActionGiftTon.cryptoAmount;
                starsTransaction3.f22609id = tL_messageActionGiftTon.transaction_id;
                starsTransaction3.gift = true;
                starsTransaction3.sent_by = peer5;
                starsTransaction3.received_by = peer6;
                gh.oa.h1(context3, false, 0L, this.D, starsTransaction3, b6Var3);
            } else if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                if (!((TLRPC.TL_messageActionStarGift) messageAction).forceIn) {
                    gh.k5 k5Var = new gh.k5(getContext(), this.D, this.D0.getDialogId(), this.U0, null);
                    k5Var.i2(this.D0, null);
                    k5Var.show();
                }
            } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                if (((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift.burned) {
                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                    if (U != null) {
                        org.telegram.messenger.l0.p(R.string.UniqueGiftNotFoundBurned, oc.a0(U), R.raw.fire_on, 36);
                        return;
                    }
                    return;
                }
                gh.k5 k5Var2 = new gh.k5(getContext(), this.D, this.D0.getDialogId(), this.U0, null);
                k5Var2.i2(this.D0, null);
                k5Var2.show();
            } else if (messageAction instanceof TLRPC.TL_messageActionSetChatTheme) {
                TLRPC.ChatTheme chatTheme = ((TLRPC.TL_messageActionSetChatTheme) messageAction).theme;
                if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                    TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        gh.k5 k5Var3 = new gh.k5(getContext(), this.D, this.D0.getDialogId(), this.U0, null);
                        k5Var3.h2(starGift.slug, (TL_stars.TL_starGiftUnique) starGift, null);
                        k5Var3.show();
                    }
                }
            }
        }
    }

    public final void S(int i9, boolean z10, boolean z11) {
        String formatDateChat;
        int i10 = this.E0;
        if (i10 != i9 && i10 / 3600 != i9 / 3600) {
            if (z10) {
                if (i9 == 2147483646) {
                    formatDateChat = LocaleController.getString("MessageScheduledUntilOnline", R.string.MessageScheduledUntilOnline);
                } else {
                    formatDateChat = LocaleController.formatString("MessageScheduledOn", R.string.MessageScheduledOn, LocaleController.formatDateChat(i9));
                }
            } else {
                formatDateChat = LocaleController.formatDateChat(i9);
            }
            this.E0 = i9;
            CharSequence charSequence = this.F0;
            if (charSequence == null || !TextUtils.equals(formatDateChat, charSequence)) {
                this.F0 = formatDateChat;
                this.Z1 = null;
                W(z11);
            }
        }
    }

    public final void T(org.telegram.messenger.MessageObject r38, boolean r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.w0.T(org.telegram.messenger.MessageObject, boolean):void");
    }

    public final void U(int i9, int i10) {
        this.H0 = i9;
        this.I0 = i10;
    }

    public final void V(float f10, int i9) {
        this.f25867s0 = true;
        this.f25864r0 = i9;
        this.f25859p0 = f10;
        this.f25861q0 = 0.0f;
    }

    public final void W(boolean z10) {
        if (getMeasuredWidth() != 0) {
            w(getMeasuredWidth(), this.F0);
            invalidate();
        }
        if (!this.f25876w0) {
            if (z10) {
                AndroidUtilities.runOnUIThread(new s0(this, 3));
                return;
            } else {
                requestLayout();
                return;
            }
        }
        r();
    }

    @Override
    public final boolean a() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        MessageObject messageObject;
        if (i9 == NotificationCenter.startSpoilers) {
            setSpoilersSuppressed(false);
        } else if (i9 == NotificationCenter.emojiLoaded) {
            invalidate();
        } else if (i9 == NotificationCenter.stopSpoilers) {
            setSpoilersSuppressed(true);
        } else if (i9 != NotificationCenter.didUpdatePremiumGiftStickers && i9 != NotificationCenter.starGiftsLoaded && i9 != NotificationCenter.didUpdateTonGiftStickers) {
            if (i9 == NotificationCenter.diceStickersDidLoad && Objects.equals(objArr[0], UserConfig.getInstance(this.D).premiumGiftsStickerPack) && (messageObject = this.D0) != null) {
                T(messageObject, true);
            }
        } else {
            MessageObject messageObject2 = this.D0;
            if (messageObject2 != null) {
                T(messageObject2, true);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.H1) {
            float a2 = this.f25854n.a(0.02f);
            canvas.save();
            canvas.scale(a2, a2, (view.getMeasuredWidth() / 2.0f) + view.getX(), (view.getMeasuredHeight() / 2.0f) + view.getY());
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void f(TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
        t0 t0Var = this.T0;
        if (t0Var != null) {
            t0Var.a2(this, reactionCount, z10, f10, f11);
        }
    }

    public ImageReceiver getAvatarImage() {
        return null;
    }

    @Override
    public int getBoundsLeft() {
        gh.m5 m5Var = this.B0;
        if (m5Var.d()) {
            int width = ((int) (getWidth() - (m5Var.Q.f47780e + AndroidUtilities.dp(8.0f)))) / 2;
            if (m5Var.f8559p) {
                return width;
            }
            return Math.min(this.O0, width);
        } else if (K(this.D0)) {
            return j3.r0.d(getWidth(), this.W0, 2, this.f25840f0 / 2);
        } else {
            int i9 = this.O0;
            ImageReceiver imageReceiver = this.E;
            if (imageReceiver != null && imageReceiver.getVisible()) {
                i9 = Math.min((int) imageReceiver.getImageX(), i9);
            }
            return (this.f25840f0 / 2) + i9;
        }
    }

    @Override
    public int getBoundsRight() {
        int i9;
        int i10;
        gh.m5 m5Var = this.B0;
        if (m5Var.d()) {
            int dp = ((int) ((m5Var.Q.f47780e + AndroidUtilities.dp(8.0f)) + getWidth())) / 2;
            if (m5Var.f8559p) {
                return dp;
            }
            return Math.max(this.P0, dp);
        }
        if (K(this.D0)) {
            i9 = this.f25840f0 / 2;
            i10 = (getWidth() + this.W0) / 2;
        } else {
            i9 = this.P0;
            ImageReceiver imageReceiver = this.E;
            if (imageReceiver != null && imageReceiver.getVisible()) {
                i9 = Math.max((int) imageReceiver.getImageX2(), i9);
            }
            i10 = this.f25840f0 / 2;
        }
        return i10 + i9;
    }

    @Override
    public float getCheckBoxTranslation() {
        return 0.0f;
    }

    public MessageObject.GroupedMessagePosition getCurrentPosition() {
        return null;
    }

    public int getCustomDate() {
        return this.E0;
    }

    public t0 getDelegate() {
        return this.T0;
    }

    @Override
    public float getDeltaBottom() {
        return 0.0f;
    }

    public float getDeltaLeft() {
        return 0.0f;
    }

    public float getDeltaRight() {
        return 0.0f;
    }

    public float getDeltaTop() {
        return 0.0f;
    }

    public int getLayoutHeight() {
        return getMeasuredHeight();
    }

    @Override
    public MessageObject getMessageObject() {
        return this.D0;
    }

    @Override
    public int getObserverTag() {
        return this.f25875w;
    }

    public ImageReceiver getPhotoImage() {
        return this.E;
    }

    public hg.s0 getReactionsLayout() {
        return this.f25882y0;
    }

    @Override
    public float getSlidingOffsetX() {
        return 0.0f;
    }

    public v0 getTransitionParams() {
        return this.f25838e2;
    }

    @Override
    public final boolean h() {
        return false;
    }

    @Override
    public final boolean i() {
        return false;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        View view = this.v;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.f25829b2;
        if (runnable != null) {
            runnable.run();
        }
        if (!this.a2 || getParent() == null) {
            return;
        }
        View view2 = (View) getParent();
        if (view2.getParent() != null) {
            view2.invalidate();
            ((View) view2.getParent()).invalidate();
        }
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean m() {
        t0 t0Var = this.T0;
        if (t0Var != null) {
            return t0Var.Z1(this, this.f25871u0, this.f25873v0);
        }
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        boolean z10;
        t0 t0Var;
        super.onAttachedToWindow();
        this.Q1 = true;
        this.E.onAttachedToWindow();
        setStarsPaused(false);
        if (this.f25866s && (t0Var = this.T0) != null && !t0Var.h()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f25855n0 = org.telegram.ui.Components.t5.update(0, this, z10, this.f25855n0, this.I);
        u0 u0Var = this.f25843g1;
        if (u0Var != null) {
            u0Var.h = org.telegram.ui.Components.t5.update(0, (View) ((w0) u0Var.f25726i), false, (org.telegram.ui.Components.p5) u0Var.h, (StaticLayout) u0Var.f25724f);
        }
        int i9 = this.D;
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.didUpdatePremiumGiftStickers);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.didUpdateTonGiftStickers);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.starGiftsLoaded);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.diceStickersDidLoad);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        MessageObject messageObject = this.D0;
        if (messageObject != null && messageObject.type == 21) {
            T(messageObject, true);
        }
        gh.m5 m5Var = this.B0;
        m5Var.P = true;
        if (m5Var.N != null) {
            m5Var.d.onAttachedToWindow();
            m5Var.f8549e.a();
            m5Var.f8567y.d.onAttachedToWindow();
        }
        hg.s0 s0Var = this.f25882y0;
        ArrayList arrayList = s0Var.v;
        s0Var.G = true;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((hg.p0) arrayList.get(i10)).a();
        }
        h11 h11Var = this.f25848j0;
        if (h11Var != null) {
            h11Var.a();
        }
        ox0 ox0Var = this.C0;
        if (ox0Var != null) {
            ox0Var.d.f30863r0 = ox0Var.f31462b;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.Q1 = false;
        int i9 = this.D;
        DownloadController.getInstance(i9).removeLoadingFileObserver(this);
        this.E.onDetachedFromWindow();
        setStarsPaused(true);
        this.f25876w0 = false;
        org.telegram.ui.Components.t5.release(this, this.f25855n0);
        u0 u0Var = this.f25843g1;
        if (u0Var != null) {
            org.telegram.ui.Components.t5.release((w0) u0Var.f25726i, (org.telegram.ui.Components.p5) u0Var.h);
        }
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.didUpdatePremiumGiftStickers);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.didUpdateTonGiftStickers);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.starGiftsLoaded);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.diceStickersDidLoad);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        this.W.g();
        this.f25838e2.f25778a = false;
        gh.m5 m5Var = this.B0;
        m5Var.P = false;
        m5Var.d.onDetachedFromWindow();
        m5Var.f8549e.b();
        fh.a1 a1Var = m5Var.f8567y;
        a1Var.d.onDetachedFromWindow();
        org.telegram.ui.Components.t5.release((View) null, a1Var.f6345q);
        a1Var.f6345q = null;
        this.f25882y0.q();
        h11 h11Var = this.f25848j0;
        if (h11Var != null) {
            h11Var.b();
        }
        ox0 ox0Var = this.C0;
        if (ox0Var != null) {
            ox0Var.d.f30863r0 = null;
        }
    }

    @Override
    public void onDraw(android.graphics.Canvas r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.w0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        CharacterStyle[] characterStyleArr;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        MessageObject messageObject = this.D0;
        if (TextUtils.isEmpty(this.F0) && messageObject == null) {
            return;
        }
        if (this.Z1 == null) {
            if (!TextUtils.isEmpty(this.F0)) {
                charSequence = this.F0;
            } else {
                charSequence = messageObject.messageText;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            for (CharacterStyle characterStyle : (CharacterStyle[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ClickableSpan.class)) {
                int spanStart = spannableStringBuilder.getSpanStart(characterStyle);
                int spanEnd = spannableStringBuilder.getSpanEnd(characterStyle);
                spannableStringBuilder.removeSpan(characterStyle);
                spannableStringBuilder.setSpan(new i(1, this, characterStyle), spanStart, spanEnd, 33);
            }
            this.Z1 = spannableStringBuilder;
        }
        if (Build.VERSION.SDK_INT < 24) {
            accessibilityNodeInfo.setContentDescription(this.Z1.toString());
        } else {
            accessibilityNodeInfo.setText(this.Z1);
        }
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        RectF rectF = this.f25850k0;
        this.H1.layout((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    @Override
    public final void onMeasure(int r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.w0.onMeasure(int, int):void");
    }

    @Override
    public final void onSuccessDownload(String str) {
        TLRPC.PhotoSize photoSize;
        MessageObject messageObject = this.D0;
        if (messageObject != null && messageObject.type == 11) {
            int size = messageObject.photoThumbs.size();
            int i9 = 0;
            while (true) {
                if (i9 < size) {
                    photoSize = messageObject.photoThumbs.get(i9);
                    if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                        break;
                    }
                    i9++;
                } else {
                    photoSize = null;
                    break;
                }
            }
            this.E.setImage(this.f25869t0, "g", ImageLocation.getForObject(photoSize, messageObject.photoThumbsObject), "50_50_b", this.H, 0L, null, messageObject, 1);
            DownloadController.getInstance(this.D).removeLoadingFileObserver(this);
        }
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.w0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void r() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.w0.r():void");
    }

    public final void s() {
        RectF rectF = this.Q0;
        this.O0 = (int) Math.min(this.O0, rectF.left);
        this.P0 = (int) Math.max(this.P0, rectF.right);
    }

    public void setCustomText(CharSequence charSequence) {
        this.F0 = charSequence;
        if (charSequence != null) {
            W(false);
        }
    }

    public void setDelegate(t0 t0Var) {
        this.T0 = t0Var;
    }

    public void setInvalidateColors(boolean z10) {
        if (this.S0 == z10) {
            return;
        }
        this.S0 = z10;
        invalidate();
    }

    public void setInvalidateListener(Runnable runnable) {
        this.f25829b2 = runnable;
    }

    public void setInvalidateWithParent(View view) {
        this.v = view;
    }

    public void setInvalidatesParent(boolean z10) {
        this.a2 = z10;
    }

    public void setMessageObject(MessageObject messageObject) {
        T(messageObject, false);
    }

    public void setOnActionClickListener(View.OnClickListener onClickListener) {
        this.R1 = onClickListener;
    }

    public void setOverrideTextMaxWidth(int i9) {
        this.S1 = i9;
    }

    public void setScrimReaction(Integer num) {
        this.f25882y0.C = num;
    }

    public void setShowTopic(boolean z10) {
        if (this.f25846i0 != z10) {
            this.f25846i0 = z10;
            J();
            invalidate();
        }
    }

    public void setSpoilersSuppressed(boolean z10) {
        ArrayList arrayList = this.f25852l0;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ((dh.l) obj).invalidateSelf();
        }
    }

    public final boolean t(float f10, int i9) {
        hg.s0 s0Var = this.f25882y0;
        if (!s0Var.K) {
            return false;
        }
        float y10 = getY() + s0Var.d;
        if (y10 <= f10 || (y10 + s0Var.f10745o) - AndroidUtilities.dp(16.0f) >= i9) {
            return false;
        }
        return true;
    }

    public final void u() {
        String str;
        String string;
        String formatPluralString;
        SpannableStringBuilder spannableStringBuilder;
        String formatString;
        int dp = this.W0 - AndroidUtilities.dp(16.0f);
        TextPaint textPaint = this.f25868s1;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        TextPaint textPaint2 = this.f25870t1;
        textPaint2.setTextSize(AndroidUtilities.dp(13.0f));
        TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode = (TLRPC.TL_messageActionGiftCode) this.D0.messageOwner.action;
        int i9 = tL_messageActionGiftCode.months;
        TLRPC.Chat chat = MessagesController.getInstance(this.D).getChat(Long.valueOf(-DialogObject.getPeerDialogId(tL_messageActionGiftCode.boost_peer)));
        if (chat == null) {
            str = null;
        } else {
            str = chat.title;
        }
        boolean z10 = tL_messageActionGiftCode.via_giveaway;
        if (tL_messageActionGiftCode.unclaimed) {
            string = LocaleController.getString("BoostingUnclaimedPrize", R.string.BoostingUnclaimedPrize);
        } else {
            string = LocaleController.getString("BoostingCongratulations", R.string.BoostingCongratulations);
        }
        if (i9 == 12) {
            formatPluralString = LocaleController.formatPluralString("BoldYears", 1, new Object[0]);
        } else {
            formatPluralString = LocaleController.formatPluralString("BoldMonths", i9, new Object[0]);
        }
        if (z10) {
            if (tL_messageActionGiftCode.unclaimed) {
                spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BoostingYouHaveUnclaimedPrize, str)));
                spannableStringBuilder.append((CharSequence) "\n\n");
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BoostingUnclaimedPrizeDuration, formatPluralString)));
            } else {
                spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BoostingReceivedPrizeFrom, str)));
                spannableStringBuilder.append((CharSequence) "\n\n");
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BoostingReceivedPrizeDuration, formatPluralString)));
            }
        } else {
            if (str == null) {
                formatString = LocaleController.getString(R.string.BoostingReceivedGiftNoName);
            } else {
                formatString = LocaleController.formatString("BoostingReceivedGiftFrom", R.string.BoostingReceivedGiftFrom, str);
            }
            spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(formatString));
            spannableStringBuilder.append((CharSequence) "\n\n");
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BoostingReceivedGiftDuration, formatPluralString)));
        }
        String string2 = LocaleController.getString("BoostingReceivedGiftOpenBtn", R.string.BoostingReceivedGiftOpenBtn);
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
        valueOf.setSpan(new i41(AndroidUtilities.bold()), 0, valueOf.length(), 33);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        this.X0 = new StaticLayout(valueOf, textPaint, dp, alignment, 1.1f, 0.0f, false);
        this.f25826a1 = null;
        this.Z0 = null;
        u0 u0Var = this.f25843g1;
        if (u0Var != null) {
            org.telegram.ui.Components.t5.release((w0) u0Var.f25726i, (org.telegram.ui.Components.p5) u0Var.h);
        }
        u0 u0Var2 = new u0(this);
        this.f25843g1 = u0Var2;
        u0Var2.a(spannableStringBuilder, textPaint2, dp);
        SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(string2);
        valueOf2.setSpan(new i41(AndroidUtilities.bold()), 0, valueOf2.length(), 33);
        this.f25831c1 = false;
        this.f25834d1 = 0;
        this.f25851k1 = null;
        StaticLayout staticLayout = new StaticLayout(valueOf2, (TextPaint) G("paintChatActionText"), dp, alignment, 1.0f, 0.0f, false);
        this.l1 = staticLayout;
        this.f25853m1 = true;
        this.f25865r1 = O(staticLayout);
    }

    public final void v(CharSequence charSequence, SpannableStringBuilder spannableStringBuilder, CharSequence charSequence2, boolean z10, CharSequence charSequence3, int i9, String str, int i10, boolean z11) {
        ?? r42;
        int i11;
        int a2;
        CharSequence charSequence4 = charSequence2;
        int dp = i10 - AndroidUtilities.dp(16.0f);
        MessageObject messageObject = this.D0;
        if (messageObject != null && messageObject.type == 30) {
            dp -= AndroidUtilities.dp(16.0f);
        }
        int i12 = dp;
        if (charSequence != null) {
            MessageObject messageObject2 = this.D0;
            TextPaint textPaint = this.f25868s1;
            if (messageObject2 != null && messageObject2.type == 30) {
                textPaint.setTextSize(AndroidUtilities.dp(14.0f));
            } else {
                textPaint.setTextSize(AndroidUtilities.dp(16.0f));
            }
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
            valueOf.setSpan(new i41(AndroidUtilities.bold()), 0, valueOf.length(), 33);
            r42 = 0;
            this.X0 = new StaticLayout(valueOf, textPaint, i12, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        } else {
            r42 = 0;
            this.X0 = null;
        }
        this.f25826a1 = null;
        if (spannableStringBuilder != null) {
            nz0 nz0Var = new nz0(spannableStringBuilder, 10.0f, null);
            this.Z0 = nz0Var;
            nz0Var.f31221a.linkColor = -1;
        } else {
            this.Z0 = null;
        }
        MessageObject messageObject3 = this.D0;
        TextPaint textPaint2 = this.f25870t1;
        if (messageObject3 != null && messageObject3.type == 35) {
            textPaint2.setTextSize(AndroidUtilities.dp(14.3f));
        } else if (messageObject3 != null && (M() || (i11 = this.D0.type) == 30 || i11 == 18 || i11 == 31 || i11 == 37 || i11 == 33)) {
            textPaint2.setTextSize(AndroidUtilities.dp(13.0f));
        } else {
            textPaint2.setTextSize(AndroidUtilities.dp(15.0f));
        }
        int dp2 = i12 - AndroidUtilities.dp(12.0f);
        MessageObject messageObject4 = this.D0;
        if (messageObject4 != null && messageObject4.type == 22 && messageObject4.getDialogId() >= 0 && (a2 = kh.x3.a(charSequence4, textPaint2)) < dp2 && a2 > dp2 / 5.0f) {
            dp2 = a2;
        }
        boolean z12 = true;
        if (charSequence4 == null) {
            u0 u0Var = this.f25843g1;
            if (u0Var != null) {
                org.telegram.ui.Components.t5.release((w0) u0Var.f25726i, (org.telegram.ui.Components.p5) u0Var.h);
                this.f25843g1 = null;
            }
            this.f25831c1 = r42;
        } else {
            if (this.f25843g1 == null) {
                this.f25843g1 = new u0(this);
            }
            try {
                charSequence4 = Emoji.replaceEmoji(charSequence4, textPaint2.getFontMetricsInt(), r42);
            } catch (Exception unused) {
            }
            this.f25843g1.a(charSequence4, textPaint2, dp2);
            if (z10 && ((StaticLayout) this.f25843g1.f25724f).getLineCount() > 3) {
                this.f25831c1 = !this.f25828b1;
                this.f25834d1 = ((StaticLayout) this.f25843g1.f25724f).getLineBottom(2);
                this.f25851k1 = new nz0(LocaleController.getString(R.string.Gift2CaptionMore), textPaint2.getTextSize() / AndroidUtilities.density, AndroidUtilities.bold());
                int lineBottom = ((StaticLayout) this.f25843g1.f25724f).getLineBottom(2);
                this.f25847i1 = lineBottom;
                this.f25849j1 = lineBottom - ((StaticLayout) this.f25843g1.f25724f).getLineTop(2);
                this.f25845h1 = (int) ((StaticLayout) this.f25843g1.f25724f).getLineRight(2);
            } else {
                this.f25831c1 = r42;
                this.f25837e1.f(true, true);
                this.f25834d1 = r42;
            }
            if (this.f25831c1) {
                int lineEnd = ((StaticLayout) this.f25843g1.f25724f).getLineEnd(2) - 1;
                u0 u0Var2 = this.f25843g1;
                if (lineEnd >= 0) {
                    charSequence4 = charSequence4.subSequence(r42, lineEnd);
                }
                u0Var2.a(charSequence4, textPaint2, dp2);
            }
        }
        if (charSequence3 != null) {
            SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(charSequence3);
            valueOf2.setSpan(new i41(AndroidUtilities.bold()), r42, valueOf2.length(), 33);
            StaticLayout staticLayout = new StaticLayout(valueOf2, (TextPaint) G("paintChatActionText"), i12, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            this.l1 = staticLayout;
            this.f25853m1 = (!z11 || this.f25831c1) ? false : false;
            this.f25865r1 = O(staticLayout);
        } else {
            this.l1 = null;
            this.f25853m1 = r42;
            this.f25865r1 = 0.0f;
        }
        if (str != null) {
            if (this.E1 == null) {
                this.E1 = new CornerPathEffect(AndroidUtilities.dp(5.0f));
            }
            if (this.F1 == null) {
                Path path = new Path();
                this.F1 = path;
                fh.i2.c(path, 1.35f, r42);
            }
            nz0 nz0Var2 = new nz0(str, i9, AndroidUtilities.bold());
            this.G1 = nz0Var2;
            nz0Var2.f31234p = AndroidUtilities.dp(62.0f);
            return;
        }
        this.F1 = null;
        this.G1 = null;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.F && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public final void w(int i9, CharSequence charSequence) {
        TextPaint textPaint;
        CharSequence charSequence2;
        Layout.Alignment alignment;
        boolean z10;
        int width;
        t0 t0Var;
        TLRPC.Message message;
        MessageObject messageObject;
        int i10;
        float f10;
        int dp = i9 - AndroidUtilities.dp(30.0f);
        if (this.f25836e0) {
            dp -= AndroidUtilities.dp(64.0f);
        }
        if (L()) {
            if (this.f25836e0) {
                f10 = 28.0f;
            } else {
                f10 = 82.0f;
            }
            dp = Math.min(dp - AndroidUtilities.dp(f10), AndroidUtilities.dp(272.0f));
        }
        if (dp >= 0) {
            int i11 = this.S1;
            if (i11 > 0) {
                dp = Math.min(i11, dp);
            }
            int i12 = dp;
            this.R0 = true;
            if (!L() && ((messageObject = this.D0) == null || ((i10 = messageObject.type) != 34 && i10 != 35))) {
                if (messageObject != null && messageObject.drawServiceWithDefaultTypeface) {
                    textPaint = (TextPaint) G("paintChatActionText2");
                } else {
                    textPaint = (TextPaint) G("paintChatActionText");
                }
            } else {
                textPaint = (TextPaint) G("paintChatActionText3");
            }
            TextPaint textPaint2 = textPaint;
            textPaint2.linkColor = textPaint2.getColor();
            if (L()) {
                if (charSequence instanceof Spannable) {
                    Spannable spannable = (Spannable) charSequence;
                    for (Emoji.EmojiSpan emojiSpan : (Emoji.EmojiSpan[]) spannable.getSpans(0, spannable.length(), Emoji.EmojiSpan.class)) {
                        spannable.removeSpan(emojiSpan);
                    }
                }
                charSequence2 = Emoji.replaceEmoji(charSequence, textPaint2.getFontMetricsInt(), false, null, 0, 0.85f, 0);
            } else {
                charSequence2 = charSequence;
            }
            if (L()) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
            StaticLayout staticLayout = new StaticLayout(charSequence2, textPaint2, i12, alignment, 1.0f, 0.0f, false);
            CharSequence charSequence3 = charSequence2;
            this.I = staticLayout;
            this.L = null;
            MessageObject messageObject2 = this.D0;
            if (messageObject2 != null && (message = messageObject2.messageOwner) != null) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
                    TLRPC.TL_messageActionSuggestedPostApproval tL_messageActionSuggestedPostApproval = (TLRPC.TL_messageActionSuggestedPostApproval) messageAction;
                    if (!tL_messageActionSuggestedPostApproval.rejected && !tL_messageActionSuggestedPostApproval.balance_too_low) {
                        this.L = new StaticLayout(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.getString(R.string.SuggestionAgreementReached)), textPaint2.getFontMetricsInt(), false, null, 0, 1.0f, 0), textPaint2, i12, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    }
                }
            }
            if (this.f25866s && (t0Var = this.T0) != null && !t0Var.h()) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f25855n0 = org.telegram.ui.Components.t5.update(0, this, z10, this.f25855n0, this.I);
            this.K = 0;
            this.J = 0;
            this.M = 0;
            StaticLayout staticLayout2 = this.L;
            if (staticLayout2 != null) {
                int height = staticLayout2.getHeight();
                this.M = height;
                this.M = AndroidUtilities.dp(12.0f) + height;
            }
            MessageObject messageObject3 = this.D0;
            if (messageObject3 == null || !messageObject3.isRepostPreview) {
                try {
                    int lineCount = this.I.getLineCount();
                    for (int i13 = 0; i13 < lineCount; i13++) {
                        try {
                            float lineWidth = this.I.getLineWidth(i13);
                            float f11 = i12;
                            if (lineWidth > f11) {
                                lineWidth = f11;
                            }
                            this.K = (int) Math.max(this.K, Math.ceil(this.I.getLineBottom(i13)));
                            this.J = (int) Math.max(this.J, Math.ceil(lineWidth));
                        } catch (Exception e10) {
                            FileLog.e(e10);
                            return;
                        }
                    }
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
            }
            this.N = (i9 - this.J) / 2;
            int dp2 = AndroidUtilities.dp(7.0f);
            this.O = dp2;
            if (this.L != null) {
                this.O = org.telegram.messenger.l0.C(11.0f, this.M, dp2);
            }
            if (L()) {
                width = this.J;
            } else {
                width = this.I.getWidth();
            }
            this.P = (i9 - width) / 2;
            this.Q = (i9 - i12) / 2;
            Stack stack = this.m0;
            ArrayList arrayList = this.f25852l0;
            stack.addAll(arrayList);
            arrayList.clear();
            if (charSequence3 instanceof Spannable) {
                StaticLayout staticLayout3 = this.I;
                int i14 = this.N;
                dh.l.a(this, staticLayout3, i14, i14 + this.J, (Spannable) charSequence3, stack, arrayList, null);
            }
        }
    }

    public final void y(Canvas canvas, boolean z10) {
        Paint paint;
        Paint paint2;
        org.telegram.ui.ActionBar.b6 b6Var;
        float f10;
        float f11;
        float f12;
        float f13;
        w0 w0Var;
        Paint paint3;
        Paint paint4;
        int i9;
        int i10;
        float f14;
        Canvas canvas2;
        int i11;
        u0 u0Var;
        int i12;
        float dp;
        float f15;
        int lineCount;
        RectF rectF;
        ArrayList arrayList;
        int i13;
        int i14;
        int i15;
        float f16;
        int i16;
        int i17;
        int i18;
        Paint paint5;
        int i19;
        int i20;
        float f17;
        ArrayList arrayList2;
        org.telegram.ui.ActionBar.b6 b6Var2;
        int i21;
        int i22;
        int i23;
        w0 w0Var2 = this;
        if (!w0Var2.f25866s || ((!w0Var2.I() || z10) && (w0Var2.I() || !z10))) {
            Paint G = w0Var2.G("paintChatActionBackground");
            Paint G2 = w0Var2.G("paintChatActionBackgroundDarken");
            w0Var2.f25857o0 = (TextPaint) w0Var2.G("paintChatActionText");
            int i24 = w0Var2.H0;
            org.telegram.ui.ActionBar.b6 b6Var3 = w0Var2.U0;
            if (i24 >= 0) {
                int v02 = org.telegram.ui.ActionBar.f6.v0(i24, b6Var3);
                if (w0Var2.J0 == null) {
                    Paint paint6 = new Paint(1);
                    w0Var2.J0 = paint6;
                    paint6.setColor(v02);
                    TextPaint textPaint = new TextPaint(1);
                    w0Var2.K0 = textPaint;
                    textPaint.setTypeface(AndroidUtilities.bold());
                    w0Var2.K0.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
                    w0Var2.K0.setColor(org.telegram.ui.ActionBar.f6.v0(w0Var2.I0, b6Var3));
                }
                G = w0Var2.J0;
                w0Var2.f25857o0 = w0Var2.K0;
            }
            boolean z11 = w0Var2.R0;
            Path path = w0Var2.N0;
            if (z11) {
                w0Var2.R0 = false;
                w0Var2.O0 = w0Var2.getWidth();
                w0Var2.P0 = 0;
                ArrayList arrayList3 = w0Var2.L0;
                arrayList3.clear();
                StaticLayout staticLayout = w0Var2.I;
                if (staticLayout == null) {
                    lineCount = 0;
                } else {
                    lineCount = staticLayout.getLineCount();
                }
                int dp2 = AndroidUtilities.dp(11.0f);
                f10 = 6.0f;
                int dp3 = AndroidUtilities.dp(8.0f);
                int i25 = 0;
                f11 = 8.0f;
                int i26 = 0;
                while (i25 < lineCount) {
                    int ceil = (int) Math.ceil(w0Var2.I.getLineWidth(i25));
                    if (i25 != 0 && (i23 = i26 - ceil) > 0 && i23 <= (dp2 * 1.5f) + dp3) {
                        ceil = i26;
                    }
                    i25 = j3.r0.e(ceil, i25, 1, arrayList3);
                    i26 = ceil;
                }
                f12 = 2.0f;
                f13 = 4.0f;
                for (int i27 = lineCount - 2; i27 >= 0; i27--) {
                    int intValue = ((Integer) arrayList3.get(i27)).intValue();
                    int i28 = i26 - intValue;
                    if (i28 <= 0 || i28 > (dp2 * 1.5f) + dp3) {
                        i26 = intValue;
                    }
                    arrayList3.set(i27, Integer.valueOf(i26));
                }
                int dp4 = AndroidUtilities.dp(4.0f);
                int measuredWidth = w0Var2.getMeasuredWidth() / 2;
                int dp5 = AndroidUtilities.dp(3.0f);
                int dp6 = AndroidUtilities.dp(6.0f);
                int i29 = dp2 - dp5;
                ArrayList arrayList4 = w0Var2.M0;
                arrayList4.clear();
                path.reset();
                float f18 = measuredWidth;
                path.moveTo(f18, dp4);
                int i30 = i26;
                int i31 = 0;
                int i32 = 0;
                while (true) {
                    rectF = w0Var2.Q0;
                    if (i32 >= lineCount) {
                        break;
                    }
                    int i33 = lineCount;
                    int intValue2 = ((Integer) arrayList3.get(i32)).intValue();
                    int lineBottom = w0Var2.I.getLineBottom(i32);
                    int i34 = i33 - 1;
                    if (i32 < i34) {
                        paint5 = G2;
                        i19 = ((Integer) arrayList3.get(i32 + 1)).intValue();
                    } else {
                        paint5 = G2;
                        i19 = 0;
                    }
                    int i35 = lineBottom - i31;
                    if (i32 == 0 || intValue2 > i30) {
                        i35 = AndroidUtilities.dp(3.0f) + i35;
                    }
                    if (i32 == i34 || intValue2 > i19) {
                        i35 = AndroidUtilities.dp(3.0f) + i35;
                    }
                    Paint paint7 = G;
                    float f19 = (intValue2 / 2.0f) + f18;
                    if (i32 != i34 && intValue2 < i19 && i32 != 0 && intValue2 < i30) {
                        i20 = dp6;
                    } else {
                        i20 = dp3;
                    }
                    if (i32 == 0 || intValue2 > i30) {
                        f17 = f19;
                        arrayList2 = arrayList3;
                        b6Var2 = b6Var3;
                        rectF.set((f17 - dp5) - dp2, dp4, f17 + i29, (dp2 * 2) + dp4);
                        s();
                        path.arcTo(rectF, -90.0f, 90.0f);
                    } else {
                        f17 = f19;
                        if (intValue2 < i30) {
                            float f20 = f17 + i29;
                            b6Var2 = b6Var3;
                            arrayList2 = arrayList3;
                            rectF.set(f20, dp4, (i20 * 2) + f20, i22 + dp4);
                            s();
                            path.arcTo(rectF, -90.0f, -90.0f);
                        } else {
                            arrayList2 = arrayList3;
                            b6Var2 = b6Var3;
                        }
                    }
                    dp4 += i35;
                    if (i32 != i34 && intValue2 < i19) {
                        dp4 -= AndroidUtilities.dp(3.0f);
                        i35 -= AndroidUtilities.dp(3.0f);
                    }
                    if (i32 != 0 && intValue2 < i30) {
                        dp4 -= AndroidUtilities.dp(3.0f);
                        i35 -= AndroidUtilities.dp(3.0f);
                    }
                    arrayList4.add(Integer.valueOf(i35));
                    if (i32 != i34 && intValue2 <= i19) {
                        if (intValue2 < i19) {
                            float f21 = f17 + i29;
                            rectF.set(f21, dp4 - i21, (i20 * 2) + f21, dp4);
                            s();
                            path.arcTo(rectF, 180.0f, -90.0f);
                        }
                    } else {
                        rectF.set((f17 - dp5) - dp2, dp4 - (dp2 * 2), f17 + i29, dp4);
                        s();
                        path.arcTo(rectF, 0.0f, 90.0f);
                    }
                    i32++;
                    w0Var2 = this;
                    i30 = intValue2;
                    i31 = lineBottom;
                    lineCount = i33;
                    G2 = paint5;
                    G = paint7;
                    b6Var3 = b6Var2;
                    arrayList3 = arrayList2;
                }
                paint = G;
                paint2 = G2;
                ArrayList arrayList5 = arrayList3;
                b6Var = b6Var3;
                int i36 = lineCount - 1;
                for (int i37 = i36; i37 >= 0; i37--) {
                    if (i37 != 0) {
                        arrayList = arrayList5;
                        i13 = ((Integer) arrayList.get(i37 - 1)).intValue();
                    } else {
                        arrayList = arrayList5;
                        i13 = 0;
                    }
                    int intValue3 = ((Integer) arrayList.get(i37)).intValue();
                    if (i37 != i36) {
                        i14 = ((Integer) arrayList.get(i37 + 1)).intValue();
                    } else {
                        i14 = 0;
                    }
                    this.I.getLineBottom(i37);
                    float f22 = measuredWidth - (intValue3 / 2);
                    if (i37 != i36 && intValue3 < i14 && i37 != 0 && intValue3 < i13) {
                        i15 = dp6;
                    } else {
                        i15 = dp3;
                    }
                    if (i37 == i36 || intValue3 > i14) {
                        arrayList5 = arrayList;
                        f16 = f22;
                        i16 = i15;
                        rectF.set(f16 - i29, dp4 - (dp2 * 2), f16 + dp5 + dp2, dp4);
                        s();
                        path.arcTo(rectF, 90.0f, 90.0f);
                    } else if (intValue3 < i14) {
                        float f23 = f22 - i29;
                        arrayList5 = arrayList;
                        f16 = f22;
                        i16 = i15;
                        rectF.set(f23 - (i15 * 2), dp4 - i18, f23, dp4);
                        s();
                        path.arcTo(rectF, 90.0f, -90.0f);
                    } else {
                        arrayList5 = arrayList;
                        f16 = f22;
                        i16 = i15;
                    }
                    dp4 -= ((Integer) arrayList4.get(i37)).intValue();
                    if (i37 != 0 && intValue3 <= i13) {
                        if (intValue3 < i13) {
                            float f24 = f16 - i29;
                            rectF.set(f24 - (i16 * 2), dp4, f24, i17 + dp4);
                            s();
                            path.arcTo(rectF, 0.0f, -90.0f);
                        }
                    } else {
                        rectF.set(f16 - i29, dp4, f16 + dp5 + dp2, (dp2 * 2) + dp4);
                        s();
                        path.arcTo(rectF, 180.0f, 90.0f);
                    }
                }
                w0Var = this;
                path.close();
                if (w0Var.L() && !w0Var.M()) {
                    rectF.left = (f18 - (w0Var.J / 2.0f)) - AndroidUtilities.dp(17.0f);
                    rectF.top = dp4;
                    rectF.right = (w0Var.J / 2.0f) + f18 + AndroidUtilities.dp(17.0f);
                    rectF.bottom = AndroidUtilities.dp(28.0f) + dp4 + w0Var.K + w0Var.M;
                    path.reset();
                    path.addRoundRect(rectF, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), Path.Direction.CW);
                    path.close();
                }
            } else {
                paint = G;
                paint2 = G2;
                b6Var = b6Var3;
                f10 = 6.0f;
                f11 = 8.0f;
                f12 = 2.0f;
                f13 = 4.0f;
                w0Var = w0Var2;
            }
            if (!w0Var.f25867s0) {
                w0Var.f25864r0 = ((ViewGroup) w0Var.getParent()).getMeasuredHeight();
            }
            if (b6Var != null) {
                b6Var.o(w0Var.f25861q0, w0Var.f25859p0 + AndroidUtilities.dp(f13), w0Var.getMeasuredWidth(), w0Var.f25864r0);
            } else {
                org.telegram.ui.ActionBar.f6.q(w0Var.f25861q0, w0Var.f25859p0 + AndroidUtilities.dp(f13), w0Var.getMeasuredWidth(), w0Var.f25864r0);
            }
            float f25 = 0.75f;
            if (!z10 || (w0Var.getAlpha() == 1.0f && !(w0Var instanceof rj))) {
                paint3 = paint2;
                paint4 = paint;
                boolean z12 = w0Var instanceof rj;
                if (z12) {
                    int alpha = paint4.getAlpha();
                    int alpha2 = paint3.getAlpha();
                    float f26 = alpha;
                    if (z12) {
                        f14 = 0.75f;
                    } else {
                        f14 = 1.0f;
                    }
                    paint4.setAlpha((int) (f26 * f14));
                    float f27 = alpha2;
                    if (!z12) {
                        f25 = 1.0f;
                    }
                    paint3.setAlpha((int) (f27 * f25));
                    i9 = alpha;
                    i10 = alpha2;
                } else {
                    i9 = -1;
                    i10 = -1;
                }
            } else {
                i9 = paint.getAlpha();
                i10 = paint2.getAlpha();
                float alpha3 = w0Var.getAlpha() * i9;
                boolean z13 = w0Var instanceof rj;
                if (z13) {
                    f15 = 0.75f;
                } else {
                    f15 = 1.0f;
                }
                paint4 = paint;
                paint4.setAlpha((int) (alpha3 * f15));
                float alpha4 = w0Var.getAlpha() * i10;
                if (!z13) {
                    f25 = 1.0f;
                }
                paint3 = paint2;
                paint3.setAlpha((int) (alpha4 * f25));
            }
            MessageObject messageObject = w0Var.D0;
            if (messageObject == null || !messageObject.isRepostPreview) {
                canvas2 = canvas;
                canvas2.drawPath(path, paint4);
                if (w0Var.I() && paint3.getAlpha() > 0) {
                    canvas2.drawPath(path, paint3);
                }
                if (w0Var.O1 > 0.0f) {
                    Paint paint8 = w0Var.P1;
                    int alpha5 = paint8.getAlpha();
                    if (z10) {
                        paint8.setAlpha((int) (w0Var.getAlpha() * alpha5));
                    }
                    canvas2.drawPath(path, paint8);
                    paint8.setAlpha(alpha5);
                }
            } else {
                canvas2 = canvas;
            }
            MessageObject messageObject2 = w0Var.D0;
            gh.m5 m5Var = w0Var.B0;
            if (m5Var.d()) {
                float dp7 = m5Var.Q.f47780e + AndroidUtilities.dp(f11);
                float width = (w0Var.getWidth() - dp7) / f12;
                if (m5Var.f8559p) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(12.0f) + w0Var.O + w0Var.K;
                }
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(width, dp, dp7 + width, m5Var.M + dp + AndroidUtilities.dp(f11));
                if (w0Var.A1 == null) {
                    w0Var.A1 = new RectF();
                }
                w0Var.A1.set(rectF2);
                canvas2.drawRoundRect(w0Var.A1, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint4);
                if (w0Var.I()) {
                    canvas2.drawRoundRect(w0Var.A1, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint3);
                }
            } else if (w0Var.C0 != null) {
                float dp8 = AndroidUtilities.dp(174.0f);
                ox0 ox0Var = w0Var.C0;
                ox0Var.getClass();
                int dp9 = AndroidUtilities.dp(140.0f) + ((int) ox0Var.f31465f.j());
                if (ox0Var.f31467i) {
                    i12 = AndroidUtilities.dp(40.0f);
                } else {
                    i12 = 0;
                }
                float f28 = dp9 + i12;
                float width2 = (w0Var.getWidth() - dp8) / f12;
                if (w0Var.A1 == null) {
                    w0Var.A1 = new RectF();
                }
                w0Var.A1.set(width2, AndroidUtilities.dp(f13), dp8 + width2, AndroidUtilities.dp(f13) + f28);
                canvas2.drawRoundRect(w0Var.A1, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint4);
                if (w0Var.I()) {
                    canvas2.drawRoundRect(w0Var.A1, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint3);
                }
            } else if (w0Var.K(messageObject2)) {
                float width3 = (w0Var.getWidth() - w0Var.W0) / f12;
                float f29 = w0Var.O + w0Var.K;
                if (w0Var.M()) {
                    float dp10 = f29 + AndroidUtilities.dp(f13);
                    AndroidUtilities.rectTmp.set(width3, dp10, w0Var.W0 + width3, w0Var.f25839f + dp10);
                } else {
                    float dp11 = f29 + AndroidUtilities.dp(12.0f);
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    float f30 = w0Var.W0;
                    rectF3.set(width3, dp11, width3 + f30, f30 + dp11 + w0Var.f25883y1);
                }
                if (messageObject2 != null && messageObject2.type == 18 && !w0Var.f25831c1 && (u0Var = w0Var.f25843g1) != null && w0Var.f25834d1 > 0) {
                    RectF rectF4 = AndroidUtilities.rectTmp;
                    rectF4.bottom = j3.r0.C(1.0f, w0Var.f25837e1.f34854c, ((StaticLayout) u0Var.f25724f).getHeight() - w0Var.f25834d1, rectF4.bottom);
                }
                if (w0Var.A1 == null) {
                    w0Var.A1 = new RectF();
                }
                w0Var.A1.set(AndroidUtilities.rectTmp);
                if (messageObject2 != null && (((i11 = messageObject2.type) == 33 || i11 == 35) && w0Var.M1 != null)) {
                    float[] fArr = w0Var.U1;
                    Arrays.fill(fArr, AndroidUtilities.dp(16.0f));
                    float dp12 = AndroidUtilities.dp(f10);
                    fArr[7] = dp12;
                    fArr[6] = dp12;
                    fArr[5] = dp12;
                    fArr[4] = dp12;
                    Path path2 = w0Var.T1;
                    path2.rewind();
                    path2.addRoundRect(w0Var.A1, fArr, Path.Direction.CW);
                    canvas2.drawPath(path2, paint4);
                    if (w0Var.I()) {
                        canvas2.drawPath(path2, paint3);
                    }
                } else {
                    canvas2.drawRoundRect(w0Var.A1, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), paint4);
                    if (w0Var.I()) {
                        canvas2.drawRoundRect(w0Var.A1, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), paint3);
                    }
                }
            }
            if (i9 >= 0) {
                paint4.setAlpha(i9);
                paint3.setAlpha(i10);
            }
        }
    }

    public final void z(Canvas canvas) {
        ColorFilter colorFilter;
        float f10;
        int i9;
        int i10;
        float f11;
        float f12;
        int i11;
        float dp;
        Canvas canvas2 = canvas;
        canvas2.save();
        float f13 = 2.0f;
        canvas2.translate(this.f25840f0 / 2.0f, getPaddingTop());
        canvas2.save();
        canvas2.translate(this.P, this.O);
        StaticLayout staticLayout = this.I;
        org.telegram.ui.Components.p5 p5Var = this.f25855n0;
        if (staticLayout != null) {
            colorFilter = E(staticLayout.getPaint().getColor());
        } else {
            colorFilter = null;
        }
        org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas2, staticLayout, p5Var, 0.0f, this.f25852l0, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
        canvas2.restore();
        gh.m5 m5Var = this.B0;
        float f14 = 4.0f;
        if (m5Var.d()) {
            canvas2.save();
            float width = (getWidth() - m5Var.Q.f47780e) / 2.0f;
            if (m5Var.f8559p) {
                dp = AndroidUtilities.dp(4.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f) + this.O + this.K;
            }
            canvas2.translate(width, dp);
            m5Var.b(canvas2);
            canvas2.restore();
        }
        canvas2.restore();
        h11 h11Var = this.f25848j0;
        org.telegram.ui.ActionBar.b6 b6Var = this.U0;
        if (h11Var != null) {
            float alpha = getAlpha();
            if (b6Var != null) {
                b6Var.o(this.f25861q0, this.f25859p0 + 0.0f, getMeasuredWidth(), this.f25864r0);
            } else {
                org.telegram.ui.ActionBar.f6.q(this.f25861q0, this.f25859p0 + 0.0f, getMeasuredWidth(), this.f25864r0);
            }
            this.f25848j0.c(canvas, getWidth(), this.f25840f0, 0.0f, 1.0f, alpha, this.f25846i0);
            canvas2 = canvas;
        }
        ArrayList arrayList = this.L1;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (b6Var != null) {
                b6Var.o(this.f25861q0, this.f25859p0 + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.f25864r0);
            } else {
                org.telegram.ui.ActionBar.f6.q(this.f25861q0, this.f25859p0 + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.f25864r0);
            }
            float width2 = (getWidth() - this.W0) / 2.0f;
            float dp2 = AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(4.0f) + this.O + this.K + this.f25839f;
            float dp3 = (this.W0 - AndroidUtilities.dp(4.0f)) / 2.0f;
            int i12 = 0;
            while (i12 < arrayList.size()) {
                e0 e0Var = (e0) arrayList.get(i12);
                float a2 = e0Var.a();
                float dp4 = ((AndroidUtilities.dp(f14) + dp3) * i12) + width2;
                float f15 = dp4 + dp3;
                RectF rectF = this.Q0;
                rectF.set(dp4, dp2, f15, e0Var.f24253f + dp2);
                canvas2.save();
                if (a2 != 1.0f) {
                    f10 = 4.0f;
                    canvas2.scale(a2, a2, rectF.centerX(), rectF.centerY());
                } else {
                    f10 = 4.0f;
                }
                float[] fArr = this.V1;
                Arrays.fill(fArr, AndroidUtilities.dp(Math.min(6.75f, SharedConfig.bubbleRadius)));
                if ((e0Var.f24254g & 9) == 9) {
                    float dp5 = AndroidUtilities.dp(SharedConfig.bubbleRadius);
                    fArr[7] = dp5;
                    fArr[6] = dp5;
                }
                if ((e0Var.f24254g & 10) == 10) {
                    float dp6 = AndroidUtilities.dp(SharedConfig.bubbleRadius);
                    fArr[5] = dp6;
                    fArr[4] = dp6;
                }
                Path path = this.W1;
                path.rewind();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas2.drawPath(path, G("paintChatActionBackground"));
                if (I()) {
                    canvas2.drawPath(path, org.telegram.ui.ActionBar.f6.f23069h2);
                }
                canvas2.save();
                canvas2.clipPath(path);
                z zVar = e0Var.f24265s;
                if (zVar != null) {
                    int i13 = (int) dp2;
                    zVar.setBounds((int) dp4, i13, (int) f15, e0Var.f24253f + i13);
                    e0Var.f24265s.setAlpha(255);
                    e0Var.f24265s.draw(canvas2);
                }
                canvas2.restore();
                canvas2.save();
                if (e0Var.f24266t != null) {
                    i9 = AndroidUtilities.dp(26.0f);
                } else {
                    i9 = 0;
                }
                float l10 = e0Var.h.l();
                if (e0Var.f24266t != null) {
                    i10 = AndroidUtilities.dp(f10);
                } else {
                    i10 = 0;
                }
                float f16 = i9;
                float A = e2.c.A(dp3 - (l10 + i10), f16, f13, dp4);
                Drawable drawable = e0Var.f24266t;
                if (drawable != null) {
                    int i14 = (int) A;
                    f11 = 2.0f;
                    drawable.setBounds(i14, (int) (((e0Var.f24253f - AndroidUtilities.dp(24.0f)) / f13) + dp2), AndroidUtilities.dp(24.0f) + i14, AndroidUtilities.dp(24.0f) + ((int) (((e0Var.f24253f - AndroidUtilities.dp(24.0f)) / 2.0f) + dp2)));
                    Drawable drawable2 = e0Var.f24266t;
                    if (e0Var.f24259m) {
                        i11 = 128;
                    } else {
                        i11 = 255;
                    }
                    drawable2.setAlpha(i11);
                    e0Var.f24266t.draw(canvas2);
                    A += f16;
                } else {
                    f11 = 2.0f;
                }
                e0Var.h.f31234p = Math.max(1, (((int) dp3) - AndroidUtilities.dp(15.0f)) - i9);
                nz0 nz0Var = e0Var.h;
                float dp7 = (AndroidUtilities.dp(40.0f) / f11) + dp2;
                if (e0Var.f24259m) {
                    f12 = 0.5f;
                } else {
                    f12 = 1.0f;
                }
                nz0Var.f(canvas2, A, dp7, f12);
                canvas2.restore();
                canvas2.restore();
                i12++;
                f14 = 4.0f;
                f13 = 2.0f;
            }
        }
    }

    public w0(Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        super(context);
        this.f25854n = new pc(this);
        int i9 = UserConfig.selectedAccount;
        this.D = i9;
        ih.l7 l7Var = new ih.l7(null, false);
        this.W = l7Var;
        this.f25846i0 = true;
        this.f25850k0 = new RectF();
        this.f25852l0 = new ArrayList();
        this.m0 = new Stack();
        this.f25882y0 = new hg.s0(this);
        this.H0 = -1;
        this.I0 = -1;
        this.L0 = new ArrayList();
        this.M0 = new ArrayList();
        this.N0 = new Path();
        this.Q0 = new RectF();
        this.R0 = true;
        this.S0 = false;
        this.f25828b1 = false;
        this.f25831c1 = false;
        this.f25837e1 = new org.telegram.ui.Components.y5(this, 0L, 320L, gr.h);
        this.f25853m1 = true;
        TextPaint textPaint = new TextPaint(1);
        this.f25868s1 = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f25870t1 = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.f25872u1 = textPaint3;
        this.f25880x1 = new RadialProgress2(this, null);
        this.B1 = new ia(this, 2);
        this.I1 = new Path();
        this.L1 = new ArrayList();
        this.P1 = new Paint(1);
        this.T1 = new Path();
        this.U1 = new float[8];
        this.V1 = new float[8];
        this.W1 = new Path();
        this.X1 = new int[]{16842910, 16842919};
        this.f25838e2 = new v0(this);
        l7Var.f11716a = false;
        this.f25866s = z10;
        this.U0 = b6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.E = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.roundMessageSize / 2);
        this.H = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        this.f25875w = DownloadController.getInstance(i9).generateObserverTag();
        this.B0 = new gh.m5(i9, this, b6Var);
        textPaint.setTextSize(TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics()));
        textPaint3.setTextSize(TypedValue.applyDimension(1, 15.0f, getResources().getDisplayMetrics()));
        textPaint2.setTextSize(TypedValue.applyDimension(1, 15.0f, getResources().getDisplayMetrics()));
        View view = new View(context);
        this.H1 = view;
        view.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.l1(0.1f, -16777216), 7, AndroidUtilities.dp(16.0f)));
        view.setVisibility(8);
        addView(view);
        zf.v1 v1Var = new zf.v1(10);
        this.J1 = v1Var;
        v1Var.N = 100;
        v1Var.J = false;
        v1Var.M = true;
        v1Var.G = false;
        v1Var.K = true;
        v1Var.H = true;
        v1Var.f50748r = 1;
        v1Var.f50752w = 0.98f;
        v1Var.v = 0.98f;
        v1Var.f50751u = 0.98f;
        v1Var.f50738g = false;
        v1Var.f50745o = 0.0f;
        v1Var.f50753x = 750L;
        v1Var.f50754y = 750;
        v1Var.c();
    }

    @Override
    public final void invalidate(Rect rect) {
        super.invalidate(rect);
        View view = this.v;
        if (view != null) {
            view.invalidate();
        }
        if (!this.a2 || getParent() == null) {
            return;
        }
        View view2 = (View) getParent();
        if (view2.getParent() != null) {
            view2.invalidate();
            ((View) view2.getParent()).invalidate();
        }
    }

    @Override
    public final void invalidate(int i9, int i10, int i11, int i12) {
        super.invalidate(i9, i10, i11, i12);
        View view = this.v;
        if (view != null) {
            view.invalidate();
        }
        if (!this.a2 || getParent() == null) {
            return;
        }
        View view2 = (View) getParent();
        if (view2.getParent() != null) {
            view2.invalidate();
            ((View) view2.getParent()).invalidate();
        }
    }

    @Override
    public final void c(boolean z10, boolean z11) {
    }

    @Override
    public final void onFailedDownload(String str, boolean z10) {
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
