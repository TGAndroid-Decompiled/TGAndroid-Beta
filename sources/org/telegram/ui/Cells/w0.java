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
import org.telegram.ui.Components.p21;
import org.telegram.ui.Components.q90;
import org.telegram.ui.Components.s51;
import org.telegram.ui.Components.t01;
import org.telegram.ui.Components.ty0;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.z51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fk;
import org.telegram.ui.m20;
import org.telegram.ui.vm;
public class w0 extends a0 implements DownloadController.FileDownloadProgressListener, NotificationCenter.NotificationCenterDelegate, o4 {
    public static final HashMap f20583j2;
    public boolean A0;
    public TLRPC.VideoSize A1;
    public boolean B0;
    public final RadialProgress2 B1;
    public final yg.q0 C0;
    public int C1;
    public float D0;
    public boolean D1;
    public boolean E;
    public float E0;
    public RectF E1;
    public boolean F;
    public final xh.z3 F0;
    public final na F1;
    public boolean G;
    public ty0 G0;
    public boolean G1;
    public final int H;
    public MessageObject H0;
    public ColorMatrixColorFilter H1;
    public final ImageReceiver I;
    public int I0;
    public CornerPathEffect I1;
    public Drawable J;
    public CharSequence J0;
    public Path J1;
    public Path K;
    public wh.e1 K0;
    public t01 K1;
    public final org.telegram.ui.Components.g9 L;
    public int L0;
    public final View L1;
    public StaticLayout M;
    public int M0;
    public final Path M1;
    public int N;
    public Paint N0;
    public final qg.w1 N1;
    public int O;
    public TextPaint O0;
    public int O1;
    public StaticLayout P;
    public final ArrayList P0;
    public final ArrayList P1;
    public int Q;
    public final ArrayList Q0;
    public BotInlineKeyboard.Source Q1;
    public int R;
    public final Path R0;
    public boolean R1;
    public int S;
    public int S0;
    public float S1;
    public int T;
    public int T0;
    public final Paint T1;
    public int U;
    public final RectF U0;
    public boolean U1;
    public int V;
    public boolean V0;
    public View.OnClickListener V1;
    public boolean W;
    public boolean W0;
    public int W1;
    public t0 X0;
    public final Path X1;
    public final org.telegram.ui.ActionBar.f6 Y0;
    public final float[] Y1;
    public int Z0;
    public final float[] Z1;
    public boolean f20584a0;
    public int f20585a1;
    public final Path a2;
    public RadialProgressView f20586b0;
    public StaticLayout f20587b1;
    public final int[] f20588b2;
    public float f20589c0;
    public Paint f20590c1;
    public int f20591c2;
    public final zh.x5 f20592d0;
    public t01 f20593d1;
    public SpannableStringBuilder f20594d2;
    public boolean f20595e0;
    public StaticLayout f20596e1;
    public boolean f20597e2;
    public int f20598f;
    public boolean f20599f0;
    public boolean f20600f1;
    public Runnable f20601f2;
    public boolean f20602g0;
    public boolean f20603g1;
    public PorterDuffColorFilter f20604g2;
    public int h;
    public boolean f20605h0;
    public int f20606h1;
    public int f20607h2;
    public boolean f20608i0;
    public final org.telegram.ui.Components.d6 f20609i1;
    public final v0 f20610i2;
    public int f20611j0;
    public m20 f20612j1;
    public boolean f20613k0;
    public u0 f20614k1;
    public int f20615l0;
    public int l1;
    public boolean m0;
    public int f20616m1;
    public final xc f20617n;
    public p21 f20618n0;
    public int f20619n1;
    public final RectF f20620o0;
    public t01 f20621o1;
    public final ArrayList f20622p0;
    public StaticLayout f20623p1;
    public final Stack f20624q0;
    public boolean f20625q1;
    public q90 f20626r;
    public org.telegram.ui.Components.u5 f20627r0;
    public TextPaint f20628r1;
    public final boolean f20629s;
    public TextPaint f20630s0;
    public StaticLayout f20631s1;
    public float f20632t0;
    public float f20633t1;
    public float f20634u0;
    public StaticLayout f20635u1;
    public View v;
    public int f20636v0;
    public float f20637v1;
    public final int f20638w;
    public boolean f20639w0;
    public final TextPaint f20640w1;
    public URLSpan f20641x;
    public ImageLocation f20642x0;
    public final TextPaint f20643x1;
    public uh.h f20644y;
    public float f20645y0;
    public final TextPaint f20646y1;
    public float f20647z0;
    public TLRPC.Document f20648z1;

    static {
        HashMap hashMap = new HashMap();
        f20583j2 = hashMap;
        hc.b.r(1, hashMap, "1⃣", 3, "2⃣");
        hc.b.r(6, hashMap, "3⃣", 12, "4⃣");
        hashMap.put(24, "5⃣");
    }

    public w0(Context context) {
        this(context, null, false);
    }

    public static float P(StaticLayout staticLayout) {
        float f7 = 0.0f;
        for (int i10 = 0; i10 < staticLayout.getLineCount(); i10++) {
            float ceil = (int) Math.ceil(staticLayout.getLineWidth(i10));
            if (ceil > f7) {
                f7 = ceil;
            }
        }
        return f7;
    }

    private void setStarsPaused(boolean z10) {
        qg.w1 w1Var = this.N1;
        if (z10 == w1Var.f40959g) {
            return;
        }
        w1Var.f40959g = z10;
        if (z10) {
            w1Var.Q = System.currentTimeMillis();
            return;
        }
        for (int i10 = 0; i10 < w1Var.f40965n.size(); i10++) {
            qg.v1 v1Var = (qg.v1) w1Var.f40965n.get(i10);
            v1Var.f40937a = (System.currentTimeMillis() - w1Var.Q) + v1Var.f40937a;
        }
        invalidate();
    }

    public static SpannableStringBuilder x(int i10, String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceArrows(str, false, AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(1.3f), 0.8f, i10));
        spannableStringBuilder.insert(0, (CharSequence) "*");
        spannableStringBuilder.setSpan(new p2(AndroidUtilities.dp(18.0f)), 0, 1, 33);
        if (Build.VERSION.SDK_INT >= 29) {
            ah.b.j();
            spannableStringBuilder.setSpan(ah.b.g(AndroidUtilities.dp(12.0f)), 0, spannableStringBuilder.length(), 33);
        }
        spannableStringBuilder.setSpan(new AlignmentSpan.Standard(Layout.Alignment.ALIGN_NORMAL), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public final void A(Canvas canvas, boolean z10) {
        if (this.f20629s) {
            if (!J() || z10) {
                if (!J() && z10) {
                    return;
                }
            } else {
                return;
            }
        }
        C(canvas, z10, null);
    }

    public final void C(Canvas canvas, boolean z10, Integer num) {
        float f7;
        Canvas canvas2;
        float f10 = 1.0f;
        if (z10) {
            f7 = getAlpha();
        } else {
            f7 = 1.0f;
        }
        if (f7 > 0.0f) {
            org.telegram.ui.ActionBar.f6 f6Var = this.Y0;
            if (f6Var != null) {
                f6Var.l(this.f20634u0, this.f20632t0 + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.f20636v0);
            } else {
                org.telegram.ui.ActionBar.j6.q(this.f20634u0, this.f20632t0 + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.f20636v0);
            }
            MessageObject messageObject = this.H0;
            if (messageObject != null && messageObject.shouldDrawReactions()) {
                yg.q0 q0Var = this.C0;
                boolean z11 = q0Var.f47110b;
                v0 v0Var = this.f20610i2;
                if (!z11 || (v0Var.f20533b && q0Var.f47117l)) {
                    q0Var.f47109a = 1.0f;
                    int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
                    if (i10 < 0) {
                        canvas2 = canvas;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f7 * 255.0f), 31);
                    } else {
                        canvas2 = canvas;
                    }
                    if (v0Var.f20533b) {
                        f10 = v0Var.f20534c;
                    }
                    q0Var.d(canvas2, f10, num);
                    if (i10 < 0) {
                        canvas2.restore();
                    }
                }
            }
        }
    }

    public final void D(vm vmVar, Canvas canvas, int i10, Integer num, float f7) {
        yg.q0 q0Var = this.C0;
        if (!q0Var.f47110b) {
            org.telegram.ui.ActionBar.f6 f6Var = this.Y0;
            if (f6Var != null) {
                f6Var.l(this.f20634u0, this.f20632t0 + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.f20636v0);
            } else {
                org.telegram.ui.ActionBar.j6.q(this.f20634u0, this.f20632t0 + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.f20636v0);
            }
            q0Var.D = f7;
            q0Var.f(vmVar, canvas, i10, num);
        }
    }

    public final ColorFilter E(int i10) {
        if (i10 != this.f20607h2 || this.f20604g2 == null) {
            this.f20607h2 = i10;
            this.f20604g2 = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        }
        return this.f20604g2;
    }

    public final int F(MessageObject messageObject) {
        int i10;
        int i11 = this.Z0;
        int i12 = messageObject.type;
        if (i12 == 37) {
            i11 = AndroidUtilities.dp(52.0f);
        } else if (i12 == 21 || N()) {
            i11 = AndroidUtilities.dp(78.0f);
        }
        if (!M() && (i10 = messageObject.type) != 34 && i10 != 35) {
            return i11;
        }
        return 0;
    }

    public Paint H(String str) {
        Paint paint;
        org.telegram.ui.ActionBar.f6 f6Var = this.Y0;
        if (f6Var != null) {
            paint = f6Var.F(str);
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return org.telegram.ui.ActionBar.j6.S0(str);
    }

    public final float I(MessageObject messageObject) {
        MessagesController messagesController;
        String str;
        if (messageObject != null) {
            try {
                if (messageObject.type == 22 && (str = (messagesController = MessagesController.getInstance(this.H)).uploadingWallpaper) != null && TextUtils.equals(messageObject.messageOwner.action.wallpaper.uploadingImage, str)) {
                    return messagesController.uploadingWallpaperInfo.f17589r;
                }
                return 1.0f;
            } catch (Exception e) {
                FileLog.e(e);
                return 1.0f;
            }
        }
        return 1.0f;
    }

    public final boolean J() {
        if (this.N0 == null) {
            org.telegram.ui.ActionBar.f6 f6Var = this.Y0;
            if (f6Var != null) {
                if (f6Var.m0()) {
                    return true;
                }
                return false;
            } else if (org.telegram.ui.ActionBar.j6.a1()) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public final void K() {
        t0 t0Var = this.X0;
        if (t0Var != null && t0Var.f()) {
            super.invalidate();
        } else if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    public final boolean L(MessageObject messageObject) {
        if (messageObject != null) {
            int i10 = messageObject.type;
            if (i10 == 30 || i10 == 18 || i10 == 25 || N()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean M() {
        TLRPC.Message message;
        MessageObject messageObject = this.H0;
        if (messageObject != null && (message = messageObject.messageOwner) != null && (message.action instanceof TLRPC.TL_messageActionSuggestedPostApproval)) {
            return true;
        }
        return false;
    }

    public final boolean N() {
        MessageObject messageObject;
        int i10;
        if (!this.F0.d() && this.G0 == null && (i10 = (messageObject = this.H0).type) != 31 && i10 != 37 && i10 != 33 && i10 != 35 && i10 != 34 && i10 != 21 && i10 != 22 && !messageObject.isStoryMention()) {
            TLRPC.Message message = this.H0.messageOwner;
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

    public final boolean O() {
        MessageObject messageObject = this.H0;
        if (messageObject != null) {
            TLRPC.Message message = messageObject.messageOwner;
            TLRPC.MessageAction messageAction = message.action;
            if (((messageAction instanceof TLRPC.TL_messageActionGiftCode) || (messageAction instanceof TLRPC.TL_messageActionGiftStars)) && (message.from_id instanceof TLRPC.TL_peerUser)) {
                return UserObject.isUserSelf(MessagesController.getInstance(this.H).getUser(Long.valueOf(this.H0.messageOwner.from_id.user_id)));
            }
            return false;
        }
        return false;
    }

    public final void Q(CharacterStyle characterStyle) {
        if (this.X0 != null && (characterStyle instanceof URLSpan)) {
            String url = ((URLSpan) characterStyle).getURL();
            if (url.startsWith("task")) {
                this.X0.g0(this, this.H0.getReplyMsgId(), Integer.parseInt(url.substring(5)));
                return;
            }
            if (url.startsWith("topic")) {
                URLSpan uRLSpan = this.f20641x;
                if (uRLSpan instanceof z51) {
                    TLObject tLObject = ((z51) uRLSpan).f29600c;
                    if (tLObject instanceof TLRPC.TL_forumTopic) {
                        mg.d.m(this.X0.O0(), -this.X0.a(), (TLRPC.TL_forumTopic) tLObject, 0);
                        return;
                    }
                    return;
                }
            }
            if (url.startsWith("invite")) {
                URLSpan uRLSpan2 = this.f20641x;
                if (uRLSpan2 instanceof z51) {
                    TLObject tLObject2 = ((z51) uRLSpan2).f29600c;
                    if (tLObject2 instanceof TLRPC.TL_chatInviteExported) {
                        this.X0.Q0((TLRPC.TL_chatInviteExported) tLObject2);
                        return;
                    }
                    return;
                }
            }
            if (url.startsWith("game")) {
                this.X0.V(this, this.H0.getReplyMsgId());
            } else if (url.startsWith("http")) {
                nf.f.s(getContext(), url);
            } else {
                this.X0.w1(Long.parseLong(url));
            }
        }
    }

    public final void R() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = new TLRPC.TL_premiumGiftOption();
        MessageObject messageObject = this.H0;
        TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
        tL_premiumGiftOption.amount = messageAction.amount;
        tL_premiumGiftOption.months = messageAction.months;
        tL_premiumGiftOption.currency = messageAction.currency;
        String str = null;
        if (messageObject != null && (messageAction instanceof TLRPC.TL_messageActionGiftCode) && !O()) {
            str = ((TLRPC.TL_messageActionGiftCode) this.H0.messageOwner.action).slug;
        }
        if (this.X0 != null) {
            AndroidUtilities.runOnUIThread(new gg.a0((ViewGroup) this, (Object) tL_premiumGiftOption, str, 26));
        }
    }

    public final void S() {
        TLRPC.Message message;
        MessageObject messageObject = this.H0;
        if (messageObject != null && (message = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            boolean z10 = messageAction instanceof TLRPC.TL_messageActionGiftStars;
            zh.x5 x5Var = this.f20592d0;
            if (z10) {
                Context context = getContext();
                TLRPC.Message message2 = this.H0.messageOwner;
                int i10 = message2.date;
                TLRPC.Peer peer = message2.from_id;
                TLRPC.Peer peer2 = message2.peer_id;
                TLRPC.TL_messageActionGiftStars tL_messageActionGiftStars = (TLRPC.TL_messageActionGiftStars) message2.action;
                org.telegram.ui.ActionBar.f6 f6Var = x5Var.J;
                TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
                starsTransaction.title = null;
                starsTransaction.description = null;
                starsTransaction.photo = null;
                TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
                starsTransaction.peer = tL_starsTransactionPeer;
                tL_starsTransactionPeer.peer = peer;
                starsTransaction.date = i10;
                starsTransaction.amount = TL_stars.StarsAmount.ofStars(tL_messageActionGiftStars.stars);
                starsTransaction.f17427id = tL_messageActionGiftStars.transaction_id;
                starsTransaction.gift = true;
                starsTransaction.sent_by = peer;
                starsTransaction.received_by = peer2;
                xh.z7.h1(context, false, 0L, this.H, starsTransaction, f6Var);
            } else if (messageAction instanceof TLRPC.TL_messageActionPrizeStars) {
                Context context2 = getContext();
                TLRPC.Message message3 = this.H0.messageOwner;
                int i11 = message3.date;
                TLRPC.Peer peer3 = message3.from_id;
                TLRPC.Peer peer4 = message3.peer_id;
                TLRPC.TL_messageActionPrizeStars tL_messageActionPrizeStars = (TLRPC.TL_messageActionPrizeStars) message3.action;
                org.telegram.ui.ActionBar.f6 f6Var2 = x5Var.J;
                TL_stars.StarsTransaction starsTransaction2 = new TL_stars.StarsTransaction();
                starsTransaction2.title = null;
                starsTransaction2.description = null;
                starsTransaction2.photo = null;
                TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer2 = new TL_stars.TL_starsTransactionPeer();
                starsTransaction2.peer = tL_starsTransactionPeer2;
                tL_starsTransactionPeer2.peer = tL_messageActionPrizeStars.boost_peer;
                starsTransaction2.date = i11;
                starsTransaction2.amount = TL_stars.StarsAmount.ofStars(tL_messageActionPrizeStars.stars);
                starsTransaction2.f17427id = tL_messageActionPrizeStars.transaction_id;
                starsTransaction2.gift = true;
                starsTransaction2.flags |= 8192;
                starsTransaction2.giveaway_post_id = tL_messageActionPrizeStars.giveaway_msg_id;
                starsTransaction2.sent_by = peer3;
                starsTransaction2.received_by = peer4;
                xh.z7.h1(context2, false, 0L, this.H, starsTransaction2, f6Var2);
            } else if (messageAction instanceof TLRPC.TL_messageActionGiftTon) {
                Context context3 = getContext();
                TLRPC.Message message4 = this.H0.messageOwner;
                int i12 = message4.date;
                TLRPC.Peer peer5 = message4.from_id;
                TLRPC.Peer peer6 = message4.peer_id;
                TLRPC.TL_messageActionGiftTon tL_messageActionGiftTon = (TLRPC.TL_messageActionGiftTon) message4.action;
                org.telegram.ui.ActionBar.f6 f6Var3 = x5Var.J;
                TL_stars.StarsTransaction starsTransaction3 = new TL_stars.StarsTransaction();
                starsTransaction3.title = null;
                starsTransaction3.description = null;
                starsTransaction3.photo = null;
                TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer3 = new TL_stars.TL_starsTransactionPeer();
                starsTransaction3.peer = tL_starsTransactionPeer3;
                tL_starsTransactionPeer3.peer = peer5;
                starsTransaction3.date = i12;
                TL_stars.TL_starsTonAmount tL_starsTonAmount = new TL_stars.TL_starsTonAmount();
                starsTransaction3.amount = tL_starsTonAmount;
                tL_starsTonAmount.amount = tL_messageActionGiftTon.cryptoAmount;
                starsTransaction3.f17427id = tL_messageActionGiftTon.transaction_id;
                starsTransaction3.gift = true;
                starsTransaction3.sent_by = peer5;
                starsTransaction3.received_by = peer6;
                xh.z7.h1(context3, false, 0L, this.H, starsTransaction3, f6Var3);
            } else if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                if (!((TLRPC.TL_messageActionStarGift) messageAction).forceIn) {
                    xh.x3 x3Var = new xh.x3(getContext(), this.H, this.H0.getDialogId(), this.Y0, null);
                    x3Var.i2(this.H0, null);
                    x3Var.show();
                }
            } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                if (((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift.burned) {
                    org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                    if (U != null) {
                        org.telegram.messenger.a2.o(R.string.UniqueGiftNotFoundBurned, wc.a0(U), R.raw.fire_on, 36);
                        return;
                    }
                    return;
                }
                xh.x3 x3Var2 = new xh.x3(getContext(), this.H, this.H0.getDialogId(), this.Y0, null);
                x3Var2.i2(this.H0, null);
                x3Var2.show();
            } else if (messageAction instanceof TLRPC.TL_messageActionSetChatTheme) {
                TLRPC.ChatTheme chatTheme = ((TLRPC.TL_messageActionSetChatTheme) messageAction).theme;
                if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                    TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        xh.x3 x3Var3 = new xh.x3(getContext(), this.H, this.H0.getDialogId(), this.Y0, null);
                        x3Var3.h2(starGift.slug, (TL_stars.TL_starGiftUnique) starGift, null);
                        x3Var3.show();
                    }
                }
            }
        }
    }

    public final void T(int i10, boolean z10, boolean z11) {
        String formatDateChat;
        int i11 = this.I0;
        if (i11 != i10 && i11 / 3600 != i10 / 3600) {
            if (z10) {
                if (i10 == 2147483646) {
                    formatDateChat = LocaleController.getString("MessageScheduledUntilOnline", R.string.MessageScheduledUntilOnline);
                } else {
                    formatDateChat = LocaleController.formatString("MessageScheduledOn", R.string.MessageScheduledOn, LocaleController.formatDateChat(i10));
                }
            } else {
                formatDateChat = LocaleController.formatDateChat(i10);
            }
            this.I0 = i10;
            CharSequence charSequence = this.J0;
            if (charSequence == null || !TextUtils.equals(formatDateChat, charSequence)) {
                this.J0 = formatDateChat;
                this.f20594d2 = null;
                X(z11);
            }
        }
    }

    public final void U(org.telegram.messenger.MessageObject r38, boolean r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.w0.U(org.telegram.messenger.MessageObject, boolean):void");
    }

    public final void V(int i10, int i11) {
        this.L0 = i10;
        this.M0 = i11;
    }

    public final void W(float f7, int i10) {
        this.f20639w0 = true;
        this.f20636v0 = i10;
        this.f20632t0 = f7;
        this.f20634u0 = 0.0f;
    }

    public final void X(boolean z10) {
        if (getMeasuredWidth() != 0) {
            w(getMeasuredWidth(), this.J0);
            invalidate();
        }
        if (!this.A0) {
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
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        MessageObject messageObject;
        if (i10 == NotificationCenter.startSpoilers) {
            setSpoilersSuppressed(false);
        } else if (i10 == NotificationCenter.emojiLoaded) {
            invalidate();
        } else if (i10 == NotificationCenter.stopSpoilers) {
            setSpoilersSuppressed(true);
        } else if (i10 != NotificationCenter.didUpdatePremiumGiftStickers && i10 != NotificationCenter.starGiftsLoaded && i10 != NotificationCenter.didUpdateTonGiftStickers) {
            if (i10 == NotificationCenter.diceStickersDidLoad && Objects.equals(objArr[0], UserConfig.getInstance(this.H).premiumGiftsStickerPack) && (messageObject = this.H0) != null) {
                U(messageObject, true);
            }
        } else {
            MessageObject messageObject2 = this.H0;
            if (messageObject2 != null) {
                U(messageObject2, true);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.L1) {
            float a2 = this.f20617n.a(0.02f);
            canvas.save();
            canvas.scale(a2, a2, (view.getMeasuredWidth() / 2.0f) + view.getX(), (view.getMeasuredHeight() / 2.0f) + view.getY());
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void f(TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        t0 t0Var = this.X0;
        if (t0Var != null) {
            t0Var.s2(this, reactionCount, z10, f7, f10);
        }
    }

    public ImageReceiver getAvatarImage() {
        return null;
    }

    @Override
    public int getBoundsLeft() {
        xh.z3 z3Var = this.F0;
        if (z3Var.d()) {
            int width = ((int) (getWidth() - (z3Var.Q.e + AndroidUtilities.dp(8.0f)))) / 2;
            if (z3Var.f46365p) {
                return width;
            }
            return Math.min(this.S0, width);
        } else if (L(this.H0)) {
            return hc.b.C(getWidth(), this.f20585a1, 2, this.f20611j0 / 2);
        } else {
            int i10 = this.S0;
            ImageReceiver imageReceiver = this.I;
            if (imageReceiver != null && imageReceiver.getVisible()) {
                i10 = Math.min((int) imageReceiver.getImageX(), i10);
            }
            return (this.f20611j0 / 2) + i10;
        }
    }

    @Override
    public int getBoundsRight() {
        int i10;
        int i11;
        xh.z3 z3Var = this.F0;
        if (z3Var.d()) {
            int dp = ((int) ((z3Var.Q.e + AndroidUtilities.dp(8.0f)) + getWidth())) / 2;
            if (z3Var.f46365p) {
                return dp;
            }
            return Math.max(this.T0, dp);
        }
        if (L(this.H0)) {
            i10 = this.f20611j0 / 2;
            i11 = (getWidth() + this.f20585a1) / 2;
        } else {
            i10 = this.T0;
            ImageReceiver imageReceiver = this.I;
            if (imageReceiver != null && imageReceiver.getVisible()) {
                i10 = Math.max((int) imageReceiver.getImageX2(), i10);
            }
            i11 = this.f20611j0 / 2;
        }
        return i11 + i10;
    }

    @Override
    public float getCheckBoxTranslation() {
        return 0.0f;
    }

    public MessageObject.GroupedMessagePosition getCurrentPosition() {
        return null;
    }

    public int getCustomDate() {
        return this.I0;
    }

    public t0 getDelegate() {
        return this.X0;
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
        return this.H0;
    }

    @Override
    public int getObserverTag() {
        return this.f20638w;
    }

    public ImageReceiver getPhotoImage() {
        return this.I;
    }

    public yg.q0 getReactionsLayout() {
        return this.C0;
    }

    @Override
    public float getSlidingOffsetX() {
        return 0.0f;
    }

    public v0 getTransitionParams() {
        return this.f20610i2;
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
        Runnable runnable = this.f20601f2;
        if (runnable != null) {
            runnable.run();
        }
        if (!this.f20597e2 || getParent() == null) {
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
        t0 t0Var = this.X0;
        if (t0Var != null) {
            return t0Var.p2(this, this.f20645y0, this.f20647z0);
        }
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        boolean z10;
        t0 t0Var;
        super.onAttachedToWindow();
        this.U1 = true;
        this.I.onAttachedToWindow();
        setStarsPaused(false);
        if (this.f20629s && (t0Var = this.X0) != null && !t0Var.f()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f20627r0 = org.telegram.ui.Components.y5.update(0, this, z10, this.f20627r0, this.M);
        u0 u0Var = this.f20614k1;
        if (u0Var != null) {
            u0Var.h = org.telegram.ui.Components.y5.update(0, (View) ((w0) u0Var.f20469i), false, (org.telegram.ui.Components.u5) u0Var.h, (StaticLayout) u0Var.f20467f);
        }
        int i10 = this.H;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.didUpdatePremiumGiftStickers);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.didUpdateTonGiftStickers);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starGiftsLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.diceStickersDidLoad);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        MessageObject messageObject = this.H0;
        if (messageObject != null && messageObject.type == 21) {
            U(messageObject, true);
        }
        xh.z3 z3Var = this.F0;
        z3Var.P = true;
        if (z3Var.N != null) {
            z3Var.d.onAttachedToWindow();
            z3Var.e.a();
            z3Var.f46373y.d.onAttachedToWindow();
        }
        yg.q0 q0Var = this.C0;
        ArrayList arrayList = q0Var.v;
        q0Var.G = true;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((yg.n0) arrayList.get(i11)).a();
        }
        p21 p21Var = this.f20618n0;
        if (p21Var != null) {
            p21Var.a();
        }
        ty0 ty0Var = this.G0;
        if (ty0Var != null) {
            ty0Var.d.f23672v0 = ty0Var.f27512b;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.U1 = false;
        int i10 = this.H;
        DownloadController.getInstance(i10).removeLoadingFileObserver(this);
        this.I.onDetachedFromWindow();
        setStarsPaused(true);
        this.A0 = false;
        org.telegram.ui.Components.y5.release(this, this.f20627r0);
        u0 u0Var = this.f20614k1;
        if (u0Var != null) {
            org.telegram.ui.Components.y5.release((w0) u0Var.f20469i, (org.telegram.ui.Components.u5) u0Var.h);
        }
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.didUpdatePremiumGiftStickers);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.didUpdateTonGiftStickers);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starGiftsLoaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.diceStickersDidLoad);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        this.f20592d0.g();
        this.f20610i2.f20532a = false;
        xh.z3 z3Var = this.F0;
        z3Var.P = false;
        z3Var.d.onDetachedFromWindow();
        z3Var.e.b();
        wh.l0 l0Var = z3Var.f46373y;
        l0Var.d.onDetachedFromWindow();
        org.telegram.ui.Components.y5.release((View) null, l0Var.f44193q);
        l0Var.f44193q = null;
        this.C0.q();
        p21 p21Var = this.f20618n0;
        if (p21Var != null) {
            p21Var.b();
        }
        ty0 ty0Var = this.G0;
        if (ty0Var != null) {
            ty0Var.d.f23672v0 = null;
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
        MessageObject messageObject = this.H0;
        if (TextUtils.isEmpty(this.J0) && messageObject == null) {
            return;
        }
        if (this.f20594d2 == null) {
            if (!TextUtils.isEmpty(this.J0)) {
                charSequence = this.J0;
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
            this.f20594d2 = spannableStringBuilder;
        }
        if (Build.VERSION.SDK_INT < 24) {
            accessibilityNodeInfo.setContentDescription(this.f20594d2.toString());
        } else {
            accessibilityNodeInfo.setText(this.f20594d2);
        }
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        RectF rectF = this.f20620o0;
        this.L1.layout((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    @Override
    public final void onMeasure(int r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.w0.onMeasure(int, int):void");
    }

    @Override
    public final void onSuccessDownload(String str) {
        TLRPC.PhotoSize photoSize;
        MessageObject messageObject = this.H0;
        if (messageObject != null && messageObject.type == 11) {
            int size = messageObject.photoThumbs.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    photoSize = messageObject.photoThumbs.get(i10);
                    if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                        break;
                    }
                    i10++;
                } else {
                    photoSize = null;
                    break;
                }
            }
            this.I.setImage(this.f20642x0, "g", ImageLocation.getForObject(photoSize, messageObject.photoThumbsObject), "50_50_b", this.L, 0L, null, messageObject, 1);
            DownloadController.getInstance(this.H).removeLoadingFileObserver(this);
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
        RectF rectF = this.U0;
        this.S0 = (int) Math.min(this.S0, rectF.left);
        this.T0 = (int) Math.max(this.T0, rectF.right);
    }

    public void setCustomText(CharSequence charSequence) {
        this.J0 = charSequence;
        if (charSequence != null) {
            X(false);
        }
    }

    public void setDelegate(t0 t0Var) {
        this.X0 = t0Var;
    }

    public void setInvalidateColors(boolean z10) {
        if (this.W0 == z10) {
            return;
        }
        this.W0 = z10;
        invalidate();
    }

    public void setInvalidateListener(Runnable runnable) {
        this.f20601f2 = runnable;
    }

    public void setInvalidateWithParent(View view) {
        this.v = view;
    }

    public void setInvalidatesParent(boolean z10) {
        this.f20597e2 = z10;
    }

    public void setMessageObject(MessageObject messageObject) {
        U(messageObject, false);
    }

    public void setOnActionClickListener(View.OnClickListener onClickListener) {
        this.V1 = onClickListener;
    }

    public void setOverrideTextMaxWidth(int i10) {
        this.W1 = i10;
    }

    public void setScrimReaction(Integer num) {
        this.C0.C = num;
    }

    public void setShowTopic(boolean z10) {
        if (this.m0 != z10) {
            this.m0 = z10;
            K();
            invalidate();
        }
    }

    public void setSpoilersSuppressed(boolean z10) {
        ArrayList arrayList = this.f20622p0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((uh.h) obj).invalidateSelf();
        }
    }

    public final boolean t(float f7, int i10) {
        yg.q0 q0Var = this.C0;
        if (!q0Var.K) {
            return false;
        }
        float y3 = getY() + q0Var.d;
        if (y3 <= f7 || (y3 + q0Var.f47120o) - AndroidUtilities.dp(16.0f) >= i10) {
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
        int dp = this.f20585a1 - AndroidUtilities.dp(16.0f);
        TextPaint textPaint = this.f20640w1;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        TextPaint textPaint2 = this.f20643x1;
        textPaint2.setTextSize(AndroidUtilities.dp(13.0f));
        TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode = (TLRPC.TL_messageActionGiftCode) this.H0.messageOwner.action;
        int i10 = tL_messageActionGiftCode.months;
        TLRPC.Chat chat = MessagesController.getInstance(this.H).getChat(Long.valueOf(-DialogObject.getPeerDialogId(tL_messageActionGiftCode.boost_peer)));
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
        if (i10 == 12) {
            formatPluralString = LocaleController.formatPluralString("BoldYears", 1, new Object[0]);
        } else {
            formatPluralString = LocaleController.formatPluralString("BoldMonths", i10, new Object[0]);
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
        valueOf.setSpan(new s51(AndroidUtilities.bold()), 0, valueOf.length(), 33);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        this.f20587b1 = new StaticLayout(valueOf, textPaint, dp, alignment, 1.1f, 0.0f, false);
        this.f20596e1 = null;
        this.f20593d1 = null;
        u0 u0Var = this.f20614k1;
        if (u0Var != null) {
            org.telegram.ui.Components.y5.release((w0) u0Var.f20469i, (org.telegram.ui.Components.u5) u0Var.h);
        }
        u0 u0Var2 = new u0(this);
        this.f20614k1 = u0Var2;
        u0Var2.a(spannableStringBuilder, textPaint2, dp);
        SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(string2);
        valueOf2.setSpan(new s51(AndroidUtilities.bold()), 0, valueOf2.length(), 33);
        this.f20603g1 = false;
        this.f20606h1 = 0;
        this.f20621o1 = null;
        StaticLayout staticLayout = new StaticLayout(valueOf2, (TextPaint) H("paintChatActionText"), dp, alignment, 1.0f, 0.0f, false);
        this.f20623p1 = staticLayout;
        this.f20625q1 = true;
        this.f20637v1 = P(staticLayout);
    }

    public final void v(CharSequence charSequence, SpannableStringBuilder spannableStringBuilder, CharSequence charSequence2, boolean z10, CharSequence charSequence3, int i10, String str, int i11, boolean z11) {
        ?? r42;
        int i12;
        int a2;
        CharSequence charSequence4 = charSequence2;
        int dp = i11 - AndroidUtilities.dp(16.0f);
        MessageObject messageObject = this.H0;
        if (messageObject != null && messageObject.type == 30) {
            dp -= AndroidUtilities.dp(16.0f);
        }
        int i13 = dp;
        if (charSequence != null) {
            MessageObject messageObject2 = this.H0;
            TextPaint textPaint = this.f20640w1;
            if (messageObject2 != null && messageObject2.type == 30) {
                textPaint.setTextSize(AndroidUtilities.dp(14.0f));
            } else {
                textPaint.setTextSize(AndroidUtilities.dp(16.0f));
            }
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
            valueOf.setSpan(new s51(AndroidUtilities.bold()), 0, valueOf.length(), 33);
            r42 = 0;
            this.f20587b1 = new StaticLayout(valueOf, textPaint, i13, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        } else {
            r42 = 0;
            this.f20587b1 = null;
        }
        this.f20596e1 = null;
        if (spannableStringBuilder != null) {
            t01 t01Var = new t01(spannableStringBuilder, 10.0f, null);
            this.f20593d1 = t01Var;
            t01Var.f27245a.linkColor = -1;
        } else {
            this.f20593d1 = null;
        }
        MessageObject messageObject3 = this.H0;
        TextPaint textPaint2 = this.f20643x1;
        if (messageObject3 != null && messageObject3.type == 35) {
            textPaint2.setTextSize(AndroidUtilities.dp(14.3f));
        } else if (messageObject3 != null && (N() || (i12 = this.H0.type) == 30 || i12 == 18 || i12 == 31 || i12 == 37 || i12 == 33)) {
            textPaint2.setTextSize(AndroidUtilities.dp(13.0f));
        } else {
            textPaint2.setTextSize(AndroidUtilities.dp(15.0f));
        }
        int dp2 = i13 - AndroidUtilities.dp(12.0f);
        MessageObject messageObject4 = this.H0;
        if (messageObject4 != null && messageObject4.type == 22 && messageObject4.getDialogId() >= 0 && (a2 = bi.x4.a(charSequence4, textPaint2)) < dp2 && a2 > dp2 / 5.0f) {
            dp2 = a2;
        }
        boolean z12 = true;
        if (charSequence4 == null) {
            u0 u0Var = this.f20614k1;
            if (u0Var != null) {
                org.telegram.ui.Components.y5.release((w0) u0Var.f20469i, (org.telegram.ui.Components.u5) u0Var.h);
                this.f20614k1 = null;
            }
            this.f20603g1 = r42;
        } else {
            if (this.f20614k1 == null) {
                this.f20614k1 = new u0(this);
            }
            try {
                charSequence4 = Emoji.replaceEmoji(charSequence4, textPaint2.getFontMetricsInt(), r42);
            } catch (Exception unused) {
            }
            this.f20614k1.a(charSequence4, textPaint2, dp2);
            if (z10 && ((StaticLayout) this.f20614k1.f20467f).getLineCount() > 3) {
                this.f20603g1 = !this.f20600f1;
                this.f20606h1 = ((StaticLayout) this.f20614k1.f20467f).getLineBottom(2);
                this.f20621o1 = new t01(LocaleController.getString(R.string.Gift2CaptionMore), textPaint2.getTextSize() / AndroidUtilities.density, AndroidUtilities.bold());
                int lineBottom = ((StaticLayout) this.f20614k1.f20467f).getLineBottom(2);
                this.f20616m1 = lineBottom;
                this.f20619n1 = lineBottom - ((StaticLayout) this.f20614k1.f20467f).getLineTop(2);
                this.l1 = (int) ((StaticLayout) this.f20614k1.f20467f).getLineRight(2);
            } else {
                this.f20603g1 = r42;
                this.f20609i1.f(true, true);
                this.f20606h1 = r42;
            }
            if (this.f20603g1) {
                int lineEnd = ((StaticLayout) this.f20614k1.f20467f).getLineEnd(2) - 1;
                u0 u0Var2 = this.f20614k1;
                if (lineEnd >= 0) {
                    charSequence4 = charSequence4.subSequence(r42, lineEnd);
                }
                u0Var2.a(charSequence4, textPaint2, dp2);
            }
        }
        if (charSequence3 != null) {
            SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(charSequence3);
            valueOf2.setSpan(new s51(AndroidUtilities.bold()), r42, valueOf2.length(), 33);
            StaticLayout staticLayout = new StaticLayout(valueOf2, (TextPaint) H("paintChatActionText"), i13, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            this.f20623p1 = staticLayout;
            this.f20625q1 = (!z11 || this.f20603g1) ? false : false;
            this.f20637v1 = P(staticLayout);
        } else {
            this.f20623p1 = null;
            this.f20625q1 = r42;
            this.f20637v1 = 0.0f;
        }
        if (str != null) {
            if (this.I1 == null) {
                this.I1 = new CornerPathEffect(AndroidUtilities.dp(5.0f));
            }
            if (this.J1 == null) {
                Path path = new Path();
                this.J1 = path;
                wh.k1.c(path, 1.35f, r42);
            }
            t01 t01Var2 = new t01(str, i10, AndroidUtilities.bold());
            this.K1 = t01Var2;
            t01Var2.f27257p = AndroidUtilities.dp(62.0f);
            return;
        }
        this.J1 = null;
        this.K1 = null;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.J && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public final void w(int i10, CharSequence charSequence) {
        TextPaint textPaint;
        CharSequence charSequence2;
        Layout.Alignment alignment;
        boolean z10;
        int width;
        t0 t0Var;
        TLRPC.Message message;
        MessageObject messageObject;
        int i11;
        float f7;
        int dp = i10 - AndroidUtilities.dp(30.0f);
        if (this.f20608i0) {
            dp -= AndroidUtilities.dp(64.0f);
        }
        if (M()) {
            if (this.f20608i0) {
                f7 = 28.0f;
            } else {
                f7 = 82.0f;
            }
            dp = Math.min(dp - AndroidUtilities.dp(f7), AndroidUtilities.dp(272.0f));
        }
        if (dp >= 0) {
            int i12 = this.W1;
            if (i12 > 0) {
                dp = Math.min(i12, dp);
            }
            int i13 = dp;
            this.V0 = true;
            if (!M() && ((messageObject = this.H0) == null || ((i11 = messageObject.type) != 34 && i11 != 35))) {
                if (messageObject != null && messageObject.drawServiceWithDefaultTypeface) {
                    textPaint = (TextPaint) H("paintChatActionText2");
                } else {
                    textPaint = (TextPaint) H("paintChatActionText");
                }
            } else {
                textPaint = (TextPaint) H("paintChatActionText3");
            }
            TextPaint textPaint2 = textPaint;
            textPaint2.linkColor = textPaint2.getColor();
            if (M()) {
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
            if (M()) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
            StaticLayout staticLayout = new StaticLayout(charSequence2, textPaint2, i13, alignment, 1.0f, 0.0f, false);
            CharSequence charSequence3 = charSequence2;
            this.M = staticLayout;
            this.P = null;
            MessageObject messageObject2 = this.H0;
            if (messageObject2 != null && (message = messageObject2.messageOwner) != null) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
                    TLRPC.TL_messageActionSuggestedPostApproval tL_messageActionSuggestedPostApproval = (TLRPC.TL_messageActionSuggestedPostApproval) messageAction;
                    if (!tL_messageActionSuggestedPostApproval.rejected && !tL_messageActionSuggestedPostApproval.balance_too_low) {
                        this.P = new StaticLayout(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.getString(R.string.SuggestionAgreementReached)), textPaint2.getFontMetricsInt(), false, null, 0, 1.0f, 0), textPaint2, i13, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    }
                }
            }
            if (this.f20629s && (t0Var = this.X0) != null && !t0Var.f()) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f20627r0 = org.telegram.ui.Components.y5.update(0, this, z10, this.f20627r0, this.M);
            this.O = 0;
            this.N = 0;
            this.Q = 0;
            StaticLayout staticLayout2 = this.P;
            if (staticLayout2 != null) {
                int height = staticLayout2.getHeight();
                this.Q = height;
                this.Q = AndroidUtilities.dp(12.0f) + height;
            }
            MessageObject messageObject3 = this.H0;
            if (messageObject3 == null || !messageObject3.isRepostPreview) {
                try {
                    int lineCount = this.M.getLineCount();
                    for (int i14 = 0; i14 < lineCount; i14++) {
                        try {
                            float lineWidth = this.M.getLineWidth(i14);
                            float f10 = i13;
                            if (lineWidth > f10) {
                                lineWidth = f10;
                            }
                            this.O = (int) Math.max(this.O, Math.ceil(this.M.getLineBottom(i14)));
                            this.N = (int) Math.max(this.N, Math.ceil(lineWidth));
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
            this.R = (i10 - this.N) / 2;
            int dp2 = AndroidUtilities.dp(7.0f);
            this.S = dp2;
            if (this.P != null) {
                this.S = org.telegram.messenger.a2.C(11.0f, this.Q, dp2);
            }
            if (M()) {
                width = this.N;
            } else {
                width = this.M.getWidth();
            }
            this.T = (i10 - width) / 2;
            this.U = (i10 - i13) / 2;
            Stack stack = this.f20624q0;
            ArrayList arrayList = this.f20622p0;
            stack.addAll(arrayList);
            arrayList.clear();
            if (charSequence3 instanceof Spannable) {
                StaticLayout staticLayout3 = this.M;
                int i15 = this.R;
                uh.h.a(this, staticLayout3, i15, i15 + this.N, (Spannable) charSequence3, stack, arrayList, null);
            }
        }
    }

    public final void y(Canvas canvas, boolean z10) {
        Paint paint;
        Paint paint2;
        org.telegram.ui.ActionBar.f6 f6Var;
        float f7;
        float f10;
        float f11;
        float f12;
        w0 w0Var;
        Paint paint3;
        Paint paint4;
        int i10;
        int i11;
        float f13;
        Canvas canvas2;
        int i12;
        u0 u0Var;
        int i13;
        float dp;
        float f14;
        int lineCount;
        RectF rectF;
        ArrayList arrayList;
        int i14;
        int i15;
        int i16;
        float f15;
        int i17;
        int i18;
        int i19;
        Paint paint5;
        int i20;
        int i21;
        float f16;
        ArrayList arrayList2;
        org.telegram.ui.ActionBar.f6 f6Var2;
        int i22;
        int i23;
        int i24;
        w0 w0Var2 = this;
        if (!w0Var2.f20629s || ((!w0Var2.J() || z10) && (w0Var2.J() || !z10))) {
            Paint H = w0Var2.H("paintChatActionBackground");
            Paint H2 = w0Var2.H("paintChatActionBackgroundDarken");
            w0Var2.f20630s0 = (TextPaint) w0Var2.H("paintChatActionText");
            int i25 = w0Var2.L0;
            org.telegram.ui.ActionBar.f6 f6Var3 = w0Var2.Y0;
            if (i25 >= 0) {
                int v02 = org.telegram.ui.ActionBar.j6.v0(i25, f6Var3);
                if (w0Var2.N0 == null) {
                    Paint paint6 = new Paint(1);
                    w0Var2.N0 = paint6;
                    paint6.setColor(v02);
                    TextPaint textPaint = new TextPaint(1);
                    w0Var2.O0 = textPaint;
                    textPaint.setTypeface(AndroidUtilities.bold());
                    w0Var2.O0.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
                    w0Var2.O0.setColor(org.telegram.ui.ActionBar.j6.v0(w0Var2.M0, f6Var3));
                }
                H = w0Var2.N0;
                w0Var2.f20630s0 = w0Var2.O0;
            }
            boolean z11 = w0Var2.V0;
            Path path = w0Var2.R0;
            if (z11) {
                w0Var2.V0 = false;
                w0Var2.S0 = w0Var2.getWidth();
                w0Var2.T0 = 0;
                ArrayList arrayList3 = w0Var2.P0;
                arrayList3.clear();
                StaticLayout staticLayout = w0Var2.M;
                if (staticLayout == null) {
                    lineCount = 0;
                } else {
                    lineCount = staticLayout.getLineCount();
                }
                int dp2 = AndroidUtilities.dp(11.0f);
                f7 = 6.0f;
                int dp3 = AndroidUtilities.dp(8.0f);
                int i26 = 0;
                f10 = 8.0f;
                int i27 = 0;
                while (i26 < lineCount) {
                    int ceil = (int) Math.ceil(w0Var2.M.getLineWidth(i26));
                    if (i26 != 0 && (i24 = i27 - ceil) > 0 && i24 <= (dp2 * 1.5f) + dp3) {
                        ceil = i27;
                    }
                    i26 = com.google.android.gms.internal.vision.e2.d(ceil, i26, 1, arrayList3);
                    i27 = ceil;
                }
                f11 = 2.0f;
                f12 = 4.0f;
                for (int i28 = lineCount - 2; i28 >= 0; i28--) {
                    int intValue = ((Integer) arrayList3.get(i28)).intValue();
                    int i29 = i27 - intValue;
                    if (i29 <= 0 || i29 > (dp2 * 1.5f) + dp3) {
                        i27 = intValue;
                    }
                    arrayList3.set(i28, Integer.valueOf(i27));
                }
                int dp4 = AndroidUtilities.dp(4.0f);
                int measuredWidth = w0Var2.getMeasuredWidth() / 2;
                int dp5 = AndroidUtilities.dp(3.0f);
                int dp6 = AndroidUtilities.dp(6.0f);
                int i30 = dp2 - dp5;
                ArrayList arrayList4 = w0Var2.Q0;
                arrayList4.clear();
                path.reset();
                float f17 = measuredWidth;
                path.moveTo(f17, dp4);
                int i31 = i27;
                int i32 = 0;
                int i33 = 0;
                while (true) {
                    rectF = w0Var2.U0;
                    if (i33 >= lineCount) {
                        break;
                    }
                    int i34 = lineCount;
                    int intValue2 = ((Integer) arrayList3.get(i33)).intValue();
                    int lineBottom = w0Var2.M.getLineBottom(i33);
                    int i35 = i34 - 1;
                    if (i33 < i35) {
                        paint5 = H2;
                        i20 = ((Integer) arrayList3.get(i33 + 1)).intValue();
                    } else {
                        paint5 = H2;
                        i20 = 0;
                    }
                    int i36 = lineBottom - i32;
                    if (i33 == 0 || intValue2 > i31) {
                        i36 = AndroidUtilities.dp(3.0f) + i36;
                    }
                    if (i33 == i35 || intValue2 > i20) {
                        i36 = AndroidUtilities.dp(3.0f) + i36;
                    }
                    Paint paint7 = H;
                    float f18 = (intValue2 / 2.0f) + f17;
                    if (i33 != i35 && intValue2 < i20 && i33 != 0 && intValue2 < i31) {
                        i21 = dp6;
                    } else {
                        i21 = dp3;
                    }
                    if (i33 == 0 || intValue2 > i31) {
                        f16 = f18;
                        arrayList2 = arrayList3;
                        f6Var2 = f6Var3;
                        rectF.set((f16 - dp5) - dp2, dp4, f16 + i30, (dp2 * 2) + dp4);
                        s();
                        path.arcTo(rectF, -90.0f, 90.0f);
                    } else {
                        f16 = f18;
                        if (intValue2 < i31) {
                            float f19 = f16 + i30;
                            f6Var2 = f6Var3;
                            arrayList2 = arrayList3;
                            rectF.set(f19, dp4, (i21 * 2) + f19, i23 + dp4);
                            s();
                            path.arcTo(rectF, -90.0f, -90.0f);
                        } else {
                            arrayList2 = arrayList3;
                            f6Var2 = f6Var3;
                        }
                    }
                    dp4 += i36;
                    if (i33 != i35 && intValue2 < i20) {
                        dp4 -= AndroidUtilities.dp(3.0f);
                        i36 -= AndroidUtilities.dp(3.0f);
                    }
                    if (i33 != 0 && intValue2 < i31) {
                        dp4 -= AndroidUtilities.dp(3.0f);
                        i36 -= AndroidUtilities.dp(3.0f);
                    }
                    arrayList4.add(Integer.valueOf(i36));
                    if (i33 != i35 && intValue2 <= i20) {
                        if (intValue2 < i20) {
                            float f20 = f16 + i30;
                            rectF.set(f20, dp4 - i22, (i21 * 2) + f20, dp4);
                            s();
                            path.arcTo(rectF, 180.0f, -90.0f);
                        }
                    } else {
                        rectF.set((f16 - dp5) - dp2, dp4 - (dp2 * 2), f16 + i30, dp4);
                        s();
                        path.arcTo(rectF, 0.0f, 90.0f);
                    }
                    i33++;
                    w0Var2 = this;
                    i31 = intValue2;
                    i32 = lineBottom;
                    lineCount = i34;
                    H2 = paint5;
                    H = paint7;
                    f6Var3 = f6Var2;
                    arrayList3 = arrayList2;
                }
                paint = H;
                paint2 = H2;
                ArrayList arrayList5 = arrayList3;
                f6Var = f6Var3;
                int i37 = lineCount - 1;
                for (int i38 = i37; i38 >= 0; i38--) {
                    if (i38 != 0) {
                        arrayList = arrayList5;
                        i14 = ((Integer) arrayList.get(i38 - 1)).intValue();
                    } else {
                        arrayList = arrayList5;
                        i14 = 0;
                    }
                    int intValue3 = ((Integer) arrayList.get(i38)).intValue();
                    if (i38 != i37) {
                        i15 = ((Integer) arrayList.get(i38 + 1)).intValue();
                    } else {
                        i15 = 0;
                    }
                    this.M.getLineBottom(i38);
                    float f21 = measuredWidth - (intValue3 / 2);
                    if (i38 != i37 && intValue3 < i15 && i38 != 0 && intValue3 < i14) {
                        i16 = dp6;
                    } else {
                        i16 = dp3;
                    }
                    if (i38 == i37 || intValue3 > i15) {
                        arrayList5 = arrayList;
                        f15 = f21;
                        i17 = i16;
                        rectF.set(f15 - i30, dp4 - (dp2 * 2), f15 + dp5 + dp2, dp4);
                        s();
                        path.arcTo(rectF, 90.0f, 90.0f);
                    } else if (intValue3 < i15) {
                        float f22 = f21 - i30;
                        arrayList5 = arrayList;
                        f15 = f21;
                        i17 = i16;
                        rectF.set(f22 - (i16 * 2), dp4 - i19, f22, dp4);
                        s();
                        path.arcTo(rectF, 90.0f, -90.0f);
                    } else {
                        arrayList5 = arrayList;
                        f15 = f21;
                        i17 = i16;
                    }
                    dp4 -= ((Integer) arrayList4.get(i38)).intValue();
                    if (i38 != 0 && intValue3 <= i14) {
                        if (intValue3 < i14) {
                            float f23 = f15 - i30;
                            rectF.set(f23 - (i17 * 2), dp4, f23, i18 + dp4);
                            s();
                            path.arcTo(rectF, 0.0f, -90.0f);
                        }
                    } else {
                        rectF.set(f15 - i30, dp4, f15 + dp5 + dp2, (dp2 * 2) + dp4);
                        s();
                        path.arcTo(rectF, 180.0f, 90.0f);
                    }
                }
                w0Var = this;
                path.close();
                if (w0Var.M() && !w0Var.N()) {
                    rectF.left = (f17 - (w0Var.N / 2.0f)) - AndroidUtilities.dp(17.0f);
                    rectF.top = dp4;
                    rectF.right = (w0Var.N / 2.0f) + f17 + AndroidUtilities.dp(17.0f);
                    rectF.bottom = AndroidUtilities.dp(28.0f) + dp4 + w0Var.O + w0Var.Q;
                    path.reset();
                    path.addRoundRect(rectF, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), Path.Direction.CW);
                    path.close();
                }
            } else {
                paint = H;
                paint2 = H2;
                f6Var = f6Var3;
                f7 = 6.0f;
                f10 = 8.0f;
                f11 = 2.0f;
                f12 = 4.0f;
                w0Var = w0Var2;
            }
            if (!w0Var.f20639w0) {
                w0Var.f20636v0 = ((ViewGroup) w0Var.getParent()).getMeasuredHeight();
            }
            if (f6Var != null) {
                f6Var.l(w0Var.f20634u0, w0Var.f20632t0 + AndroidUtilities.dp(f12), w0Var.getMeasuredWidth(), w0Var.f20636v0);
            } else {
                org.telegram.ui.ActionBar.j6.q(w0Var.f20634u0, w0Var.f20632t0 + AndroidUtilities.dp(f12), w0Var.getMeasuredWidth(), w0Var.f20636v0);
            }
            float f24 = 0.75f;
            if (!z10 || (w0Var.getAlpha() == 1.0f && !(w0Var instanceof fk))) {
                paint3 = paint2;
                paint4 = paint;
                boolean z12 = w0Var instanceof fk;
                if (z12) {
                    int alpha = paint4.getAlpha();
                    int alpha2 = paint3.getAlpha();
                    float f25 = alpha;
                    if (z12) {
                        f13 = 0.75f;
                    } else {
                        f13 = 1.0f;
                    }
                    paint4.setAlpha((int) (f25 * f13));
                    float f26 = alpha2;
                    if (!z12) {
                        f24 = 1.0f;
                    }
                    paint3.setAlpha((int) (f26 * f24));
                    i10 = alpha;
                    i11 = alpha2;
                } else {
                    i10 = -1;
                    i11 = -1;
                }
            } else {
                i10 = paint.getAlpha();
                i11 = paint2.getAlpha();
                float alpha3 = w0Var.getAlpha() * i10;
                boolean z13 = w0Var instanceof fk;
                if (z13) {
                    f14 = 0.75f;
                } else {
                    f14 = 1.0f;
                }
                paint4 = paint;
                paint4.setAlpha((int) (alpha3 * f14));
                float alpha4 = w0Var.getAlpha() * i11;
                if (!z13) {
                    f24 = 1.0f;
                }
                paint3 = paint2;
                paint3.setAlpha((int) (alpha4 * f24));
            }
            MessageObject messageObject = w0Var.H0;
            if (messageObject == null || !messageObject.isRepostPreview) {
                canvas2 = canvas;
                canvas2.drawPath(path, paint4);
                if (w0Var.J() && paint3.getAlpha() > 0) {
                    canvas2.drawPath(path, paint3);
                }
                if (w0Var.S1 > 0.0f) {
                    Paint paint8 = w0Var.T1;
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
            MessageObject messageObject2 = w0Var.H0;
            xh.z3 z3Var = w0Var.F0;
            if (z3Var.d()) {
                float dp7 = z3Var.Q.e + AndroidUtilities.dp(f10);
                float width = (w0Var.getWidth() - dp7) / f11;
                if (z3Var.f46365p) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(12.0f) + w0Var.S + w0Var.O;
                }
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(width, dp, dp7 + width, z3Var.M + dp + AndroidUtilities.dp(f10));
                if (w0Var.E1 == null) {
                    w0Var.E1 = new RectF();
                }
                w0Var.E1.set(rectF2);
                canvas2.drawRoundRect(w0Var.E1, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint4);
                if (w0Var.J()) {
                    canvas2.drawRoundRect(w0Var.E1, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint3);
                }
            } else if (w0Var.G0 != null) {
                float dp8 = AndroidUtilities.dp(174.0f);
                ty0 ty0Var = w0Var.G0;
                ty0Var.getClass();
                int dp9 = AndroidUtilities.dp(140.0f) + ((int) ty0Var.f27514f.j());
                if (ty0Var.f27516i) {
                    i13 = AndroidUtilities.dp(40.0f);
                } else {
                    i13 = 0;
                }
                float f27 = dp9 + i13;
                float width2 = (w0Var.getWidth() - dp8) / f11;
                if (w0Var.E1 == null) {
                    w0Var.E1 = new RectF();
                }
                w0Var.E1.set(width2, AndroidUtilities.dp(f12), dp8 + width2, AndroidUtilities.dp(f12) + f27);
                canvas2.drawRoundRect(w0Var.E1, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint4);
                if (w0Var.J()) {
                    canvas2.drawRoundRect(w0Var.E1, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint3);
                }
            } else if (w0Var.L(messageObject2)) {
                float width3 = (w0Var.getWidth() - w0Var.f20585a1) / f11;
                float f28 = w0Var.S + w0Var.O;
                if (w0Var.N()) {
                    float dp10 = f28 + AndroidUtilities.dp(f12);
                    AndroidUtilities.rectTmp.set(width3, dp10, w0Var.f20585a1 + width3, w0Var.f20598f + dp10);
                } else {
                    float dp11 = f28 + AndroidUtilities.dp(12.0f);
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    float f29 = w0Var.f20585a1;
                    rectF3.set(width3, dp11, width3 + f29, f29 + dp11 + w0Var.C1);
                }
                if (messageObject2 != null && messageObject2.type == 18 && !w0Var.f20603g1 && (u0Var = w0Var.f20614k1) != null && w0Var.f20606h1 > 0) {
                    RectF rectF4 = AndroidUtilities.rectTmp;
                    rectF4.bottom = com.google.android.gms.internal.vision.e2.a(1.0f, w0Var.f20609i1.f22295c, ((StaticLayout) u0Var.f20467f).getHeight() - w0Var.f20606h1, rectF4.bottom);
                }
                if (w0Var.E1 == null) {
                    w0Var.E1 = new RectF();
                }
                w0Var.E1.set(AndroidUtilities.rectTmp);
                if (messageObject2 != null && (((i12 = messageObject2.type) == 33 || i12 == 35) && w0Var.Q1 != null)) {
                    float[] fArr = w0Var.Y1;
                    Arrays.fill(fArr, AndroidUtilities.dp(16.0f));
                    float dp12 = AndroidUtilities.dp(f7);
                    fArr[7] = dp12;
                    fArr[6] = dp12;
                    fArr[5] = dp12;
                    fArr[4] = dp12;
                    Path path2 = w0Var.X1;
                    path2.rewind();
                    path2.addRoundRect(w0Var.E1, fArr, Path.Direction.CW);
                    canvas2.drawPath(path2, paint4);
                    if (w0Var.J()) {
                        canvas2.drawPath(path2, paint3);
                    }
                } else {
                    canvas2.drawRoundRect(w0Var.E1, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), paint4);
                    if (w0Var.J()) {
                        canvas2.drawRoundRect(w0Var.E1, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), paint3);
                    }
                }
            }
            if (i10 >= 0) {
                paint4.setAlpha(i10);
                paint3.setAlpha(i11);
            }
        }
    }

    public final void z(Canvas canvas) {
        ColorFilter colorFilter;
        float f7;
        int i10;
        int i11;
        float f10;
        float f11;
        int i12;
        float dp;
        Canvas canvas2 = canvas;
        canvas2.save();
        float f12 = 2.0f;
        canvas2.translate(this.f20611j0 / 2.0f, getPaddingTop());
        canvas2.save();
        canvas2.translate(this.T, this.S);
        StaticLayout staticLayout = this.M;
        org.telegram.ui.Components.u5 u5Var = this.f20627r0;
        if (staticLayout != null) {
            colorFilter = E(staticLayout.getPaint().getColor());
        } else {
            colorFilter = null;
        }
        org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas2, staticLayout, u5Var, 0.0f, this.f20622p0, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
        canvas2.restore();
        xh.z3 z3Var = this.F0;
        float f13 = 4.0f;
        if (z3Var.d()) {
            canvas2.save();
            float width = (getWidth() - z3Var.Q.e) / 2.0f;
            if (z3Var.f46365p) {
                dp = AndroidUtilities.dp(4.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f) + this.S + this.O;
            }
            canvas2.translate(width, dp);
            z3Var.b(canvas2);
            canvas2.restore();
        }
        canvas2.restore();
        p21 p21Var = this.f20618n0;
        org.telegram.ui.ActionBar.f6 f6Var = this.Y0;
        if (p21Var != null) {
            float alpha = getAlpha();
            if (f6Var != null) {
                f6Var.l(this.f20634u0, this.f20632t0 + 0.0f, getMeasuredWidth(), this.f20636v0);
            } else {
                org.telegram.ui.ActionBar.j6.q(this.f20634u0, this.f20632t0 + 0.0f, getMeasuredWidth(), this.f20636v0);
            }
            this.f20618n0.c(canvas, getWidth(), this.f20611j0, 0.0f, 1.0f, alpha, this.m0);
            canvas2 = canvas;
        }
        ArrayList arrayList = this.P1;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (f6Var != null) {
                f6Var.l(this.f20634u0, this.f20632t0 + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.f20636v0);
            } else {
                org.telegram.ui.ActionBar.j6.q(this.f20634u0, this.f20632t0 + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.f20636v0);
            }
            float width2 = (getWidth() - this.f20585a1) / 2.0f;
            float dp2 = AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(4.0f) + this.S + this.O + this.f20598f;
            float dp3 = (this.f20585a1 - AndroidUtilities.dp(4.0f)) / 2.0f;
            int i13 = 0;
            while (i13 < arrayList.size()) {
                e0 e0Var = (e0) arrayList.get(i13);
                float a2 = e0Var.a();
                float dp4 = ((AndroidUtilities.dp(f13) + dp3) * i13) + width2;
                float f14 = dp4 + dp3;
                RectF rectF = this.U0;
                rectF.set(dp4, dp2, f14, e0Var.f19030f + dp2);
                canvas2.save();
                if (a2 != 1.0f) {
                    f7 = 4.0f;
                    canvas2.scale(a2, a2, rectF.centerX(), rectF.centerY());
                } else {
                    f7 = 4.0f;
                }
                float[] fArr = this.Z1;
                Arrays.fill(fArr, AndroidUtilities.dp(Math.min(6.75f, SharedConfig.bubbleRadius)));
                if ((e0Var.f19031g & 9) == 9) {
                    float dp5 = AndroidUtilities.dp(SharedConfig.bubbleRadius);
                    fArr[7] = dp5;
                    fArr[6] = dp5;
                }
                if ((e0Var.f19031g & 10) == 10) {
                    float dp6 = AndroidUtilities.dp(SharedConfig.bubbleRadius);
                    fArr[5] = dp6;
                    fArr[4] = dp6;
                }
                Path path = this.a2;
                path.rewind();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas2.drawPath(path, H("paintChatActionBackground"));
                if (J()) {
                    canvas2.drawPath(path, org.telegram.ui.ActionBar.j6.f17995h2);
                }
                canvas2.save();
                canvas2.clipPath(path);
                z zVar = e0Var.f19042s;
                if (zVar != null) {
                    int i14 = (int) dp2;
                    zVar.setBounds((int) dp4, i14, (int) f14, e0Var.f19030f + i14);
                    e0Var.f19042s.setAlpha(255);
                    e0Var.f19042s.draw(canvas2);
                }
                canvas2.restore();
                canvas2.save();
                if (e0Var.f19043t != null) {
                    i10 = AndroidUtilities.dp(26.0f);
                } else {
                    i10 = 0;
                }
                float l4 = e0Var.h.l();
                if (e0Var.f19043t != null) {
                    i11 = AndroidUtilities.dp(f7);
                } else {
                    i11 = 0;
                }
                float f15 = i10;
                float A = com.google.android.gms.internal.vision.e2.A(dp3 - (l4 + i11), f15, f12, dp4);
                Drawable drawable = e0Var.f19043t;
                if (drawable != null) {
                    int i15 = (int) A;
                    f10 = 2.0f;
                    drawable.setBounds(i15, (int) (((e0Var.f19030f - AndroidUtilities.dp(24.0f)) / f12) + dp2), AndroidUtilities.dp(24.0f) + i15, AndroidUtilities.dp(24.0f) + ((int) (((e0Var.f19030f - AndroidUtilities.dp(24.0f)) / 2.0f) + dp2)));
                    Drawable drawable2 = e0Var.f19043t;
                    if (e0Var.f19036m) {
                        i12 = 128;
                    } else {
                        i12 = 255;
                    }
                    drawable2.setAlpha(i12);
                    e0Var.f19043t.draw(canvas2);
                    A += f15;
                } else {
                    f10 = 2.0f;
                }
                e0Var.h.f27257p = Math.max(1, (((int) dp3) - AndroidUtilities.dp(15.0f)) - i10);
                t01 t01Var = e0Var.h;
                float dp7 = (AndroidUtilities.dp(40.0f) / f10) + dp2;
                if (e0Var.f19036m) {
                    f11 = 0.5f;
                } else {
                    f11 = 1.0f;
                }
                t01Var.f(canvas2, A, dp7, f11);
                canvas2.restore();
                canvas2.restore();
                i13++;
                f13 = 4.0f;
                f12 = 2.0f;
            }
        }
    }

    public w0(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context);
        this.f20617n = new xc(this);
        int i10 = UserConfig.selectedAccount;
        this.H = i10;
        zh.x5 x5Var = new zh.x5(null, false);
        this.f20592d0 = x5Var;
        this.m0 = true;
        this.f20620o0 = new RectF();
        this.f20622p0 = new ArrayList();
        this.f20624q0 = new Stack();
        this.C0 = new yg.q0(this);
        this.L0 = -1;
        this.M0 = -1;
        this.P0 = new ArrayList();
        this.Q0 = new ArrayList();
        this.R0 = new Path();
        this.U0 = new RectF();
        this.V0 = true;
        this.W0 = false;
        this.f20600f1 = false;
        this.f20603g1 = false;
        this.f20609i1 = new org.telegram.ui.Components.d6(this, 0L, 320L, wr.h);
        this.f20625q1 = true;
        TextPaint textPaint = new TextPaint(1);
        this.f20640w1 = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f20643x1 = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.f20646y1 = textPaint3;
        this.B1 = new RadialProgress2(this, null);
        this.F1 = new na(this, 2);
        this.M1 = new Path();
        this.P1 = new ArrayList();
        this.T1 = new Paint(1);
        this.X1 = new Path();
        this.Y1 = new float[8];
        this.Z1 = new float[8];
        this.a2 = new Path();
        this.f20588b2 = new int[]{16842910, 16842919};
        this.f20610i2 = new v0(this);
        x5Var.f49048a = false;
        this.f20629s = z10;
        this.Y0 = f6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.I = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.roundMessageSize / 2);
        this.L = new org.telegram.ui.Components.g9((org.telegram.ui.ActionBar.f6) null);
        this.f20638w = DownloadController.getInstance(i10).generateObserverTag();
        this.F0 = new xh.z3(i10, this, f6Var);
        textPaint.setTextSize(TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics()));
        textPaint3.setTextSize(TypedValue.applyDimension(1, 15.0f, getResources().getDisplayMetrics()));
        textPaint2.setTextSize(TypedValue.applyDimension(1, 15.0f, getResources().getDisplayMetrics()));
        View view = new View(context);
        this.L1 = view;
        view.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.l1(0.1f, -16777216), 7, AndroidUtilities.dp(16.0f)));
        view.setVisibility(8);
        addView(view);
        qg.w1 w1Var = new qg.w1(10);
        this.N1 = w1Var;
        w1Var.N = 100;
        w1Var.J = false;
        w1Var.M = true;
        w1Var.G = false;
        w1Var.K = true;
        w1Var.H = true;
        w1Var.f40969r = 1;
        w1Var.f40973w = 0.98f;
        w1Var.v = 0.98f;
        w1Var.f40972u = 0.98f;
        w1Var.f40959g = false;
        w1Var.f40966o = 0.0f;
        w1Var.f40974x = 750L;
        w1Var.f40975y = 750;
        w1Var.c();
    }

    @Override
    public final void invalidate(Rect rect) {
        super.invalidate(rect);
        View view = this.v;
        if (view != null) {
            view.invalidate();
        }
        if (!this.f20597e2 || getParent() == null) {
            return;
        }
        View view2 = (View) getParent();
        if (view2.getParent() != null) {
            view2.invalidate();
            ((View) view2.getParent()).invalidate();
        }
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        super.invalidate(i10, i11, i12, i13);
        View view = this.v;
        if (view != null) {
            view.invalidate();
        }
        if (!this.f20597e2 || getParent() == null) {
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
    public final void onProgressDownload(String str, long j3, long j10) {
    }

    @Override
    public final void onProgressUpload(String str, long j3, long j10, boolean z10) {
    }
}
