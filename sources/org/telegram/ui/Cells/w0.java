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
import org.telegram.ui.Components.o21;
import org.telegram.ui.Components.r90;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.ry0;
import org.telegram.ui.Components.s51;
import org.telegram.ui.Components.t01;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.z51;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ak;
import org.telegram.ui.g20;
import org.telegram.ui.pm;
public class w0 extends a0 implements DownloadController.FileDownloadProgressListener, NotificationCenter.NotificationCenterDelegate, o4 {
    public static final HashMap f21703k2;
    public boolean A0;
    public TLRPC.VideoSize A1;
    public boolean B0;
    public final RadialProgress2 B1;
    public final zg.p0 C0;
    public int C1;
    public float D0;
    public boolean D1;
    public boolean E;
    public float E0;
    public RectF E1;
    public boolean F;
    public final yh.z3 F0;
    public final la F1;
    public boolean G;
    public ry0 G0;
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
    public xh.f1 K0;
    public t01 K1;
    public final org.telegram.ui.Components.h9 L;
    public int L0;
    public final View L1;
    public StaticLayout M;
    public int M0;
    public final Path M1;
    public int N;
    public Paint N0;
    public final rg.v1 N1;
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
    public NotificationCenter.ObserversGroup V1;
    public boolean W;
    public boolean W0;
    public View.OnClickListener W1;
    public t0 X0;
    public int X1;
    public final org.telegram.ui.ActionBar.d6 Y0;
    public final Path Y1;
    public int Z0;
    public final float[] Z1;
    public boolean f21704a0;
    public int f21705a1;
    public final float[] a2;
    public RadialProgressView f21706b0;
    public StaticLayout f21707b1;
    public final Path f21708b2;
    public float f21709c0;
    public Paint f21710c1;
    public final int[] f21711c2;
    public final ai.ca f21712d0;
    public t01 f21713d1;
    public int f21714d2;
    public boolean f21715e0;
    public StaticLayout f21716e1;
    public SpannableStringBuilder f21717e2;
    public int f21718f;
    public boolean f21719f0;
    public boolean f21720f1;
    public boolean f21721f2;
    public boolean f21722g0;
    public boolean f21723g1;
    public Runnable f21724g2;
    public int h;
    public boolean f21725h0;
    public int f21726h1;
    public PorterDuffColorFilter f21727h2;
    public boolean f21728i0;
    public final org.telegram.ui.Components.e6 f21729i1;
    public int f21730i2;
    public int f21731j0;
    public g20 f21732j1;
    public final v0 f21733j2;
    public boolean f21734k0;
    public u0 f21735k1;
    public int f21736l0;
    public int l1;
    public boolean m0;
    public int f21737m1;
    public final zc f21738n;
    public o21 f21739n0;
    public int f21740n1;
    public final RectF f21741o0;
    public t01 f21742o1;
    public final ArrayList f21743p0;
    public StaticLayout f21744p1;
    public final Stack f21745q0;
    public boolean f21746q1;
    public r90 f21747r;
    public org.telegram.ui.Components.v5 f21748r0;
    public TextPaint f21749r1;
    public final boolean f21750s;
    public TextPaint f21751s0;
    public StaticLayout f21752s1;
    public float f21753t0;
    public float f21754t1;
    public float f21755u0;
    public StaticLayout f21756u1;
    public View v;
    public int f21757v0;
    public float f21758v1;
    public final int f21759w;
    public boolean f21760w0;
    public final TextPaint f21761w1;
    public URLSpan f21762x;
    public ImageLocation f21763x0;
    public final TextPaint f21764x1;
    public vh.g f21765y;
    public float f21766y0;
    public final TextPaint f21767y1;
    public float f21768z0;
    public TLRPC.Document f21769z1;

    static {
        HashMap hashMap = new HashMap();
        f21703k2 = hashMap;
        hg.c.o(1, hashMap, "1⃣", 3, "2⃣");
        hg.c.o(6, hashMap, "3⃣", 12, "4⃣");
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
        rg.v1 v1Var = this.N1;
        if (z10 == v1Var.f42776g) {
            return;
        }
        v1Var.f42776g = z10;
        if (z10) {
            v1Var.Q = System.currentTimeMillis();
            return;
        }
        for (int i10 = 0; i10 < v1Var.f42782n.size(); i10++) {
            rg.u1 u1Var = (rg.u1) v1Var.f42782n.get(i10);
            u1Var.f42753a = (System.currentTimeMillis() - v1Var.Q) + u1Var.f42753a;
        }
        invalidate();
    }

    public static SpannableStringBuilder x(int i10, String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceArrows(str, false, AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(1.3f), 0.8f, i10));
        spannableStringBuilder.insert(0, (CharSequence) "*");
        spannableStringBuilder.setSpan(new q2(AndroidUtilities.dp(18.0f)), 0, 1, 33);
        if (Build.VERSION.SDK_INT >= 29) {
            ah.e.l();
            spannableStringBuilder.setSpan(ah.e.g(AndroidUtilities.dp(12.0f)), 0, spannableStringBuilder.length(), 33);
        }
        spannableStringBuilder.setSpan(new AlignmentSpan.Standard(Layout.Alignment.ALIGN_NORMAL), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public final void A(Canvas canvas, boolean z10) {
        if (this.f21750s) {
            if (!J() || z10) {
                if (!J() && z10) {
                    return;
                }
            } else {
                return;
            }
        }
        B(canvas, z10, null);
    }

    public final void B(Canvas canvas, boolean z10, Integer num) {
        float f7;
        Canvas canvas2;
        float f10 = 1.0f;
        if (z10) {
            f7 = getAlpha();
        } else {
            f7 = 1.0f;
        }
        if (f7 > 0.0f) {
            org.telegram.ui.ActionBar.d6 d6Var = this.Y0;
            if (d6Var != null) {
                d6Var.m(this.f21755u0, this.f21753t0 + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.f21757v0);
            } else {
                org.telegram.ui.ActionBar.h6.q(this.f21755u0, this.f21753t0 + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.f21757v0);
            }
            MessageObject messageObject = this.H0;
            if (messageObject != null && messageObject.shouldDrawReactions()) {
                zg.p0 p0Var = this.C0;
                boolean z11 = p0Var.f49393b;
                v0 v0Var = this.f21733j2;
                if (!z11 || (v0Var.f21657b && p0Var.f49400l)) {
                    p0Var.f49392a = 1.0f;
                    int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
                    if (i10 < 0) {
                        canvas2 = canvas;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f7 * 255.0f), 31);
                    } else {
                        canvas2 = canvas;
                    }
                    if (v0Var.f21657b) {
                        f10 = v0Var.f21658c;
                    }
                    p0Var.d(canvas2, f10, num);
                    if (i10 < 0) {
                        canvas2.restore();
                    }
                }
            }
        }
    }

    public final void E(pm pmVar, Canvas canvas, int i10, Integer num, float f7) {
        zg.p0 p0Var = this.C0;
        if (!p0Var.f49393b) {
            org.telegram.ui.ActionBar.d6 d6Var = this.Y0;
            if (d6Var != null) {
                d6Var.m(this.f21755u0, this.f21753t0 + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.f21757v0);
            } else {
                org.telegram.ui.ActionBar.h6.q(this.f21755u0, this.f21753t0 + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.f21757v0);
            }
            p0Var.D = f7;
            p0Var.f(pmVar, canvas, i10, num);
        }
    }

    public final ColorFilter F(int i10) {
        if (i10 != this.f21730i2 || this.f21727h2 == null) {
            this.f21730i2 = i10;
            this.f21727h2 = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        }
        return this.f21727h2;
    }

    public final int G(MessageObject messageObject) {
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
        org.telegram.ui.ActionBar.d6 d6Var = this.Y0;
        if (d6Var != null) {
            paint = d6Var.G(str);
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return org.telegram.ui.ActionBar.h6.S0(str);
    }

    public final float I(MessageObject messageObject) {
        MessagesController messagesController;
        String str;
        if (messageObject != null) {
            try {
                if (messageObject.type == 22 && (str = (messagesController = MessagesController.getInstance(this.H)).uploadingWallpaper) != null && TextUtils.equals(messageObject.messageOwner.action.wallpaper.uploadingImage, str)) {
                    return messagesController.uploadingWallpaperInfo.f19958r;
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
            org.telegram.ui.ActionBar.d6 d6Var = this.Y0;
            if (d6Var != null) {
                if (d6Var.p0()) {
                    return true;
                }
                return false;
            } else if (org.telegram.ui.ActionBar.h6.a1()) {
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
                URLSpan uRLSpan = this.f21762x;
                if (uRLSpan instanceof z51) {
                    TLObject tLObject = ((z51) uRLSpan).f30783c;
                    if (tLObject instanceof TLRPC.TL_forumTopic) {
                        ng.d.m(this.X0.O0(), -this.X0.a(), (TLRPC.TL_forumTopic) tLObject, 0);
                        return;
                    }
                    return;
                }
            }
            if (url.startsWith("invite")) {
                URLSpan uRLSpan2 = this.f21762x;
                if (uRLSpan2 instanceof z51) {
                    TLObject tLObject2 = ((z51) uRLSpan2).f30783c;
                    if (tLObject2 instanceof TLRPC.TL_chatInviteExported) {
                        this.X0.Q0((TLRPC.TL_chatInviteExported) tLObject2);
                        return;
                    }
                    return;
                }
            }
            if (url.startsWith("game")) {
                this.X0.U(this, this.H0.getReplyMsgId());
            } else if (url.startsWith("http")) {
                nf.f.s(getContext(), url);
            } else {
                this.X0.x1(Long.parseLong(url));
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
            AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o(this, tL_premiumGiftOption, str, 7));
        }
    }

    public final void S() {
        TLRPC.Message message;
        MessageObject messageObject = this.H0;
        if (messageObject != null && (message = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            boolean z10 = messageAction instanceof TLRPC.TL_messageActionGiftStars;
            ai.ca caVar = this.f21712d0;
            if (z10) {
                Context context = getContext();
                TLRPC.Message message2 = this.H0.messageOwner;
                int i10 = message2.date;
                TLRPC.Peer peer = message2.from_id;
                TLRPC.Peer peer2 = message2.peer_id;
                TLRPC.TL_messageActionGiftStars tL_messageActionGiftStars = (TLRPC.TL_messageActionGiftStars) message2.action;
                org.telegram.ui.ActionBar.d6 d6Var = caVar.J;
                TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
                starsTransaction.title = null;
                starsTransaction.description = null;
                starsTransaction.photo = null;
                TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
                starsTransaction.peer = tL_starsTransactionPeer;
                tL_starsTransactionPeer.peer = peer;
                starsTransaction.date = i10;
                starsTransaction.amount = TL_stars.StarsAmount.ofStars(tL_messageActionGiftStars.stars);
                starsTransaction.f18548id = tL_messageActionGiftStars.transaction_id;
                starsTransaction.gift = true;
                starsTransaction.sent_by = peer;
                starsTransaction.received_by = peer2;
                yh.w7.h1(context, false, 0L, this.H, starsTransaction, d6Var);
            } else if (messageAction instanceof TLRPC.TL_messageActionPrizeStars) {
                Context context2 = getContext();
                TLRPC.Message message3 = this.H0.messageOwner;
                int i11 = message3.date;
                TLRPC.Peer peer3 = message3.from_id;
                TLRPC.Peer peer4 = message3.peer_id;
                TLRPC.TL_messageActionPrizeStars tL_messageActionPrizeStars = (TLRPC.TL_messageActionPrizeStars) message3.action;
                org.telegram.ui.ActionBar.d6 d6Var2 = caVar.J;
                TL_stars.StarsTransaction starsTransaction2 = new TL_stars.StarsTransaction();
                starsTransaction2.title = null;
                starsTransaction2.description = null;
                starsTransaction2.photo = null;
                TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer2 = new TL_stars.TL_starsTransactionPeer();
                starsTransaction2.peer = tL_starsTransactionPeer2;
                tL_starsTransactionPeer2.peer = tL_messageActionPrizeStars.boost_peer;
                starsTransaction2.date = i11;
                starsTransaction2.amount = TL_stars.StarsAmount.ofStars(tL_messageActionPrizeStars.stars);
                starsTransaction2.f18548id = tL_messageActionPrizeStars.transaction_id;
                starsTransaction2.gift = true;
                starsTransaction2.flags |= 8192;
                starsTransaction2.giveaway_post_id = tL_messageActionPrizeStars.giveaway_msg_id;
                starsTransaction2.sent_by = peer3;
                starsTransaction2.received_by = peer4;
                yh.w7.h1(context2, false, 0L, this.H, starsTransaction2, d6Var2);
            } else if (messageAction instanceof TLRPC.TL_messageActionGiftTon) {
                Context context3 = getContext();
                TLRPC.Message message4 = this.H0.messageOwner;
                int i12 = message4.date;
                TLRPC.Peer peer5 = message4.from_id;
                TLRPC.Peer peer6 = message4.peer_id;
                TLRPC.TL_messageActionGiftTon tL_messageActionGiftTon = (TLRPC.TL_messageActionGiftTon) message4.action;
                org.telegram.ui.ActionBar.d6 d6Var3 = caVar.J;
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
                starsTransaction3.f18548id = tL_messageActionGiftTon.transaction_id;
                starsTransaction3.gift = true;
                starsTransaction3.sent_by = peer5;
                starsTransaction3.received_by = peer6;
                yh.w7.h1(context3, false, 0L, this.H, starsTransaction3, d6Var3);
            } else if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                if (!((TLRPC.TL_messageActionStarGift) messageAction).forceIn) {
                    yh.x3 x3Var = new yh.x3(getContext(), this.H, this.H0.getDialogId(), this.Y0, null);
                    x3Var.i2(this.H0, null);
                    x3Var.show();
                }
            } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                if (((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift.burned) {
                    org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                    if (U != null) {
                        org.telegram.messenger.f0.p(R.string.UniqueGiftNotFoundBurned, yc.a0(U), R.raw.fire_on, 36);
                        return;
                    }
                    return;
                }
                yh.x3 x3Var2 = new yh.x3(getContext(), this.H, this.H0.getDialogId(), this.Y0, null);
                x3Var2.i2(this.H0, null);
                x3Var2.show();
            } else if (messageAction instanceof TLRPC.TL_messageActionSetChatTheme) {
                TLRPC.ChatTheme chatTheme = ((TLRPC.TL_messageActionSetChatTheme) messageAction).theme;
                if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                    TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        yh.x3 x3Var3 = new yh.x3(getContext(), this.H, this.H0.getDialogId(), this.Y0, null);
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
                this.f21717e2 = null;
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
        this.f21760w0 = true;
        this.f21757v0 = i10;
        this.f21753t0 = f7;
        this.f21755u0 = 0.0f;
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
            float a2 = this.f21738n.a(0.02f);
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
            t0Var.u2(this, reactionCount, z10, f7, f10);
        }
    }

    public ImageReceiver getAvatarImage() {
        return null;
    }

    @Override
    public int getBoundsLeft() {
        yh.z3 z3Var = this.F0;
        if (z3Var.d()) {
            int width = ((int) (getWidth() - (z3Var.Q.e + AndroidUtilities.dp(8.0f)))) / 2;
            if (z3Var.f48318p) {
                return width;
            }
            return Math.min(this.S0, width);
        } else if (L(this.H0)) {
            return hg.c.z(getWidth(), this.f21705a1, 2, this.f21731j0 / 2);
        } else {
            int i10 = this.S0;
            ImageReceiver imageReceiver = this.I;
            if (imageReceiver != null && imageReceiver.getVisible()) {
                i10 = Math.min((int) imageReceiver.getImageX(), i10);
            }
            return (this.f21731j0 / 2) + i10;
        }
    }

    @Override
    public int getBoundsRight() {
        int i10;
        int i11;
        yh.z3 z3Var = this.F0;
        if (z3Var.d()) {
            int dp = ((int) ((z3Var.Q.e + AndroidUtilities.dp(8.0f)) + getWidth())) / 2;
            if (z3Var.f48318p) {
                return dp;
            }
            return Math.max(this.T0, dp);
        }
        if (L(this.H0)) {
            i10 = this.f21731j0 / 2;
            i11 = (getWidth() + this.f21705a1) / 2;
        } else {
            i10 = this.T0;
            ImageReceiver imageReceiver = this.I;
            if (imageReceiver != null && imageReceiver.getVisible()) {
                i10 = Math.max((int) imageReceiver.getImageX2(), i10);
            }
            i11 = this.f21731j0 / 2;
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
        return this.f21759w;
    }

    public ImageReceiver getPhotoImage() {
        return this.I;
    }

    public zg.p0 getReactionsLayout() {
        return this.C0;
    }

    @Override
    public float getSlidingOffsetX() {
        return 0.0f;
    }

    public v0 getTransitionParams() {
        return this.f21733j2;
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
        Runnable runnable = this.f21724g2;
        if (runnable != null) {
            runnable.run();
        }
        if (!this.f21721f2 || getParent() == null) {
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
            return t0Var.r2(this, this.f21766y0, this.f21768z0);
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
        if (this.f21750s && (t0Var = this.X0) != null && !t0Var.f()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f21748r0 = org.telegram.ui.Components.z5.update(0, this, z10, this.f21748r0, this.M);
        u0 u0Var = this.f21735k1;
        if (u0Var != null) {
            u0Var.h = org.telegram.ui.Components.z5.update(0, (View) ((w0) u0Var.f21243i), false, (org.telegram.ui.Components.v5) u0Var.h, (StaticLayout) u0Var.f21241f);
        }
        NotificationCenter.ObserversGroup observersGroup = this.V1;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.V1 = null;
        }
        this.V1 = NotificationCenter.getInstance(this.H).createObserversGroup(this).addGlobal(NotificationCenter.emojiLoaded).add(NotificationCenter.didUpdatePremiumGiftStickers).add(NotificationCenter.didUpdateTonGiftStickers).add(NotificationCenter.starGiftsLoaded).add(NotificationCenter.diceStickersDidLoad);
        MessageObject messageObject = this.H0;
        if (messageObject != null && messageObject.type == 21) {
            U(messageObject, true);
        }
        yh.z3 z3Var = this.F0;
        z3Var.P = true;
        if (z3Var.N != null) {
            z3Var.d.onAttachedToWindow();
            z3Var.e.a();
            z3Var.f48326y.d.onAttachedToWindow();
        }
        zg.p0 p0Var = this.C0;
        ArrayList arrayList = p0Var.v;
        p0Var.G = true;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((zg.m0) arrayList.get(i10)).a();
        }
        o21 o21Var = this.f21739n0;
        if (o21Var != null) {
            o21Var.a();
        }
        ry0 ry0Var = this.G0;
        if (ry0Var != null) {
            ry0Var.d.R(ry0Var.f28054b);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.U1 = false;
        DownloadController.getInstance(this.H).removeLoadingFileObserver(this);
        this.I.onDetachedFromWindow();
        setStarsPaused(true);
        this.A0 = false;
        org.telegram.ui.Components.z5.release(this, this.f21748r0);
        u0 u0Var = this.f21735k1;
        if (u0Var != null) {
            org.telegram.ui.Components.z5.release((w0) u0Var.f21243i, (org.telegram.ui.Components.v5) u0Var.h);
        }
        NotificationCenter.ObserversGroup observersGroup = this.V1;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.V1 = null;
        }
        this.f21712d0.g();
        this.f21733j2.f21656a = false;
        yh.z3 z3Var = this.F0;
        z3Var.P = false;
        z3Var.d.onDetachedFromWindow();
        z3Var.e.b();
        xh.k0 k0Var = z3Var.f48326y;
        k0Var.d.onDetachedFromWindow();
        org.telegram.ui.Components.z5.release((View) null, k0Var.f46231q);
        k0Var.f46231q = null;
        this.C0.q();
        o21 o21Var = this.f21739n0;
        if (o21Var != null) {
            o21Var.b();
        }
        ry0 ry0Var = this.G0;
        if (ry0Var != null) {
            ry0Var.d.R(null);
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
        if (this.f21717e2 == null) {
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
            this.f21717e2 = spannableStringBuilder;
        }
        if (Build.VERSION.SDK_INT < 24) {
            accessibilityNodeInfo.setContentDescription(this.f21717e2.toString());
        } else {
            accessibilityNodeInfo.setText(this.f21717e2);
        }
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        RectF rectF = this.f21741o0;
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
            this.I.setImage(this.f21763x0, "g", ImageLocation.getForObject(photoSize, messageObject.photoThumbsObject), "50_50_b", this.L, 0L, null, messageObject, 1);
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
        this.f21724g2 = runnable;
    }

    public void setInvalidateWithParent(View view) {
        this.v = view;
    }

    public void setInvalidatesParent(boolean z10) {
        this.f21721f2 = z10;
    }

    public void setMessageObject(MessageObject messageObject) {
        U(messageObject, false);
    }

    public void setOnActionClickListener(View.OnClickListener onClickListener) {
        this.W1 = onClickListener;
    }

    public void setOverrideTextMaxWidth(int i10) {
        this.X1 = i10;
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
        ArrayList arrayList = this.f21743p0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((vh.g) obj).invalidateSelf();
        }
    }

    public final boolean t(float f7, int i10) {
        zg.p0 p0Var = this.C0;
        if (!p0Var.K) {
            return false;
        }
        float y3 = getY() + p0Var.d;
        if (y3 <= f7 || (y3 + p0Var.f49403o) - AndroidUtilities.dp(16.0f) >= i10) {
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
        int dp = this.f21705a1 - AndroidUtilities.dp(16.0f);
        TextPaint textPaint = this.f21761w1;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        TextPaint textPaint2 = this.f21764x1;
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
        this.f21707b1 = new StaticLayout(valueOf, textPaint, dp, alignment, 1.1f, 0.0f, false);
        this.f21716e1 = null;
        this.f21713d1 = null;
        u0 u0Var = this.f21735k1;
        if (u0Var != null) {
            org.telegram.ui.Components.z5.release((w0) u0Var.f21243i, (org.telegram.ui.Components.v5) u0Var.h);
        }
        u0 u0Var2 = new u0(this);
        this.f21735k1 = u0Var2;
        u0Var2.a(spannableStringBuilder, textPaint2, dp);
        SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(string2);
        valueOf2.setSpan(new s51(AndroidUtilities.bold()), 0, valueOf2.length(), 33);
        this.f21723g1 = false;
        this.f21726h1 = 0;
        this.f21742o1 = null;
        StaticLayout staticLayout = new StaticLayout(valueOf2, (TextPaint) H("paintChatActionText"), dp, alignment, 1.0f, 0.0f, false);
        this.f21744p1 = staticLayout;
        this.f21746q1 = true;
        this.f21758v1 = P(staticLayout);
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
            TextPaint textPaint = this.f21761w1;
            if (messageObject2 != null && messageObject2.type == 30) {
                textPaint.setTextSize(AndroidUtilities.dp(14.0f));
            } else {
                textPaint.setTextSize(AndroidUtilities.dp(16.0f));
            }
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
            valueOf.setSpan(new s51(AndroidUtilities.bold()), 0, valueOf.length(), 33);
            r42 = 0;
            this.f21707b1 = new StaticLayout(valueOf, textPaint, i13, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        } else {
            r42 = 0;
            this.f21707b1 = null;
        }
        this.f21716e1 = null;
        if (spannableStringBuilder != null) {
            t01 t01Var = new t01(spannableStringBuilder, 10.0f, null);
            this.f21713d1 = t01Var;
            t01Var.f28355a.linkColor = -1;
        } else {
            this.f21713d1 = null;
        }
        MessageObject messageObject3 = this.H0;
        TextPaint textPaint2 = this.f21764x1;
        if (messageObject3 != null && messageObject3.type == 35) {
            textPaint2.setTextSize(AndroidUtilities.dp(14.3f));
        } else if (messageObject3 != null && (N() || (i12 = this.H0.type) == 30 || i12 == 18 || i12 == 31 || i12 == 37 || i12 == 33)) {
            textPaint2.setTextSize(AndroidUtilities.dp(13.0f));
        } else {
            textPaint2.setTextSize(AndroidUtilities.dp(15.0f));
        }
        int dp2 = i13 - AndroidUtilities.dp(12.0f);
        MessageObject messageObject4 = this.H0;
        if (messageObject4 != null && messageObject4.type == 22 && messageObject4.getDialogId() >= 0 && (a2 = ci.e4.a(charSequence4, textPaint2)) < dp2 && a2 > dp2 / 5.0f) {
            dp2 = a2;
        }
        boolean z12 = true;
        if (charSequence4 == null) {
            u0 u0Var = this.f21735k1;
            if (u0Var != null) {
                org.telegram.ui.Components.z5.release((w0) u0Var.f21243i, (org.telegram.ui.Components.v5) u0Var.h);
                this.f21735k1 = null;
            }
            this.f21723g1 = r42;
        } else {
            if (this.f21735k1 == null) {
                this.f21735k1 = new u0(this);
            }
            try {
                charSequence4 = Emoji.replaceEmoji(charSequence4, textPaint2.getFontMetricsInt(), r42);
            } catch (Exception unused) {
            }
            this.f21735k1.a(charSequence4, textPaint2, dp2);
            if (z10 && ((StaticLayout) this.f21735k1.f21241f).getLineCount() > 3) {
                this.f21723g1 = !this.f21720f1;
                this.f21726h1 = ((StaticLayout) this.f21735k1.f21241f).getLineBottom(2);
                this.f21742o1 = new t01(LocaleController.getString(R.string.Gift2CaptionMore), textPaint2.getTextSize() / AndroidUtilities.density, AndroidUtilities.bold());
                int lineBottom = ((StaticLayout) this.f21735k1.f21241f).getLineBottom(2);
                this.f21737m1 = lineBottom;
                this.f21740n1 = lineBottom - ((StaticLayout) this.f21735k1.f21241f).getLineTop(2);
                this.l1 = (int) ((StaticLayout) this.f21735k1.f21241f).getLineRight(2);
            } else {
                this.f21723g1 = r42;
                this.f21729i1.f(true, true);
                this.f21726h1 = r42;
            }
            if (this.f21723g1) {
                int lineEnd = ((StaticLayout) this.f21735k1.f21241f).getLineEnd(2) - 1;
                u0 u0Var2 = this.f21735k1;
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
            this.f21744p1 = staticLayout;
            this.f21746q1 = (!z11 || this.f21723g1) ? false : false;
            this.f21758v1 = P(staticLayout);
        } else {
            this.f21744p1 = null;
            this.f21746q1 = r42;
            this.f21758v1 = 0.0f;
        }
        if (str != null) {
            if (this.I1 == null) {
                this.I1 = new CornerPathEffect(AndroidUtilities.dp(5.0f));
            }
            if (this.J1 == null) {
                Path path = new Path();
                this.J1 = path;
                xh.m1.c(path, 1.35f, r42);
            }
            t01 t01Var2 = new t01(str, i10, AndroidUtilities.bold());
            this.K1 = t01Var2;
            t01Var2.f28367p = AndroidUtilities.dp(62.0f);
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
        if (this.f21728i0) {
            dp -= AndroidUtilities.dp(64.0f);
        }
        if (M()) {
            if (this.f21728i0) {
                f7 = 28.0f;
            } else {
                f7 = 82.0f;
            }
            dp = Math.min(dp - AndroidUtilities.dp(f7), AndroidUtilities.dp(272.0f));
        }
        if (dp >= 0) {
            int i12 = this.X1;
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
            if (this.f21750s && (t0Var = this.X0) != null && !t0Var.f()) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f21748r0 = org.telegram.ui.Components.z5.update(0, this, z10, this.f21748r0, this.M);
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
                this.S = org.telegram.messenger.f0.C(11.0f, this.Q, dp2);
            }
            if (M()) {
                width = this.N;
            } else {
                width = this.M.getWidth();
            }
            this.T = (i10 - width) / 2;
            this.U = (i10 - i13) / 2;
            Stack stack = this.f21745q0;
            ArrayList arrayList = this.f21743p0;
            stack.addAll(arrayList);
            arrayList.clear();
            if (charSequence3 instanceof Spannable) {
                StaticLayout staticLayout3 = this.M;
                int i15 = this.R;
                vh.g.a(this, staticLayout3, i15, i15 + this.N, (Spannable) charSequence3, stack, arrayList, null);
            }
        }
    }

    public final void y(Canvas canvas, boolean z10) {
        Paint paint;
        Paint paint2;
        org.telegram.ui.ActionBar.d6 d6Var;
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
        org.telegram.ui.ActionBar.d6 d6Var2;
        int i22;
        int i23;
        int i24;
        w0 w0Var2 = this;
        if (!w0Var2.f21750s || ((!w0Var2.J() || z10) && (w0Var2.J() || !z10))) {
            Paint H = w0Var2.H("paintChatActionBackground");
            Paint H2 = w0Var2.H("paintChatActionBackgroundDarken");
            w0Var2.f21751s0 = (TextPaint) w0Var2.H("paintChatActionText");
            int i25 = w0Var2.L0;
            org.telegram.ui.ActionBar.d6 d6Var3 = w0Var2.Y0;
            if (i25 >= 0) {
                int v02 = org.telegram.ui.ActionBar.h6.v0(i25, d6Var3);
                if (w0Var2.N0 == null) {
                    Paint paint6 = new Paint(1);
                    w0Var2.N0 = paint6;
                    paint6.setColor(v02);
                    TextPaint textPaint = new TextPaint(1);
                    w0Var2.O0 = textPaint;
                    textPaint.setTypeface(AndroidUtilities.bold());
                    w0Var2.O0.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
                    w0Var2.O0.setColor(org.telegram.ui.ActionBar.h6.v0(w0Var2.M0, d6Var3));
                }
                H = w0Var2.N0;
                w0Var2.f21751s0 = w0Var2.O0;
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
                    i26 = com.google.android.gms.internal.vision.e2.e(ceil, i26, 1, arrayList3);
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
                        d6Var2 = d6Var3;
                        rectF.set((f16 - dp5) - dp2, dp4, f16 + i30, (dp2 * 2) + dp4);
                        s();
                        path.arcTo(rectF, -90.0f, 90.0f);
                    } else {
                        f16 = f18;
                        if (intValue2 < i31) {
                            float f19 = f16 + i30;
                            d6Var2 = d6Var3;
                            arrayList2 = arrayList3;
                            rectF.set(f19, dp4, (i21 * 2) + f19, i23 + dp4);
                            s();
                            path.arcTo(rectF, -90.0f, -90.0f);
                        } else {
                            arrayList2 = arrayList3;
                            d6Var2 = d6Var3;
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
                    d6Var3 = d6Var2;
                    arrayList3 = arrayList2;
                }
                paint = H;
                paint2 = H2;
                ArrayList arrayList5 = arrayList3;
                d6Var = d6Var3;
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
                d6Var = d6Var3;
                f7 = 6.0f;
                f10 = 8.0f;
                f11 = 2.0f;
                f12 = 4.0f;
                w0Var = w0Var2;
            }
            if (!w0Var.f21760w0) {
                w0Var.f21757v0 = ((ViewGroup) w0Var.getParent()).getMeasuredHeight();
            }
            if (d6Var != null) {
                d6Var.m(w0Var.f21755u0, w0Var.f21753t0 + AndroidUtilities.dp(f12), w0Var.getMeasuredWidth(), w0Var.f21757v0);
            } else {
                org.telegram.ui.ActionBar.h6.q(w0Var.f21755u0, w0Var.f21753t0 + AndroidUtilities.dp(f12), w0Var.getMeasuredWidth(), w0Var.f21757v0);
            }
            float f24 = 0.75f;
            if (!z10 || (w0Var.getAlpha() == 1.0f && !(w0Var instanceof ak))) {
                paint3 = paint2;
                paint4 = paint;
                boolean z12 = w0Var instanceof ak;
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
                boolean z13 = w0Var instanceof ak;
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
            yh.z3 z3Var = w0Var.F0;
            if (z3Var.d()) {
                float dp7 = z3Var.Q.e + AndroidUtilities.dp(f10);
                float width = (w0Var.getWidth() - dp7) / f11;
                if (z3Var.f48318p) {
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
                ry0 ry0Var = w0Var.G0;
                ry0Var.getClass();
                int dp9 = AndroidUtilities.dp(140.0f) + ((int) ry0Var.f28056f.j());
                if (ry0Var.f28058i) {
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
                float width3 = (w0Var.getWidth() - w0Var.f21705a1) / f11;
                float f28 = w0Var.S + w0Var.O;
                if (w0Var.N()) {
                    float dp10 = f28 + AndroidUtilities.dp(f12);
                    AndroidUtilities.rectTmp.set(width3, dp10, w0Var.f21705a1 + width3, w0Var.f21718f + dp10);
                } else {
                    float dp11 = f28 + AndroidUtilities.dp(12.0f);
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    float f29 = w0Var.f21705a1;
                    rectF3.set(width3, dp11, width3 + f29, f29 + dp11 + w0Var.C1);
                }
                if (messageObject2 != null && messageObject2.type == 18 && !w0Var.f21723g1 && (u0Var = w0Var.f21735k1) != null && w0Var.f21726h1 > 0) {
                    RectF rectF4 = AndroidUtilities.rectTmp;
                    rectF4.bottom = com.google.android.gms.internal.vision.e2.b(1.0f, w0Var.f21729i1.f23817c, ((StaticLayout) u0Var.f21241f).getHeight() - w0Var.f21726h1, rectF4.bottom);
                }
                if (w0Var.E1 == null) {
                    w0Var.E1 = new RectF();
                }
                w0Var.E1.set(AndroidUtilities.rectTmp);
                if (messageObject2 != null && (((i12 = messageObject2.type) == 33 || i12 == 35) && w0Var.Q1 != null)) {
                    float[] fArr = w0Var.Z1;
                    Arrays.fill(fArr, AndroidUtilities.dp(16.0f));
                    float dp12 = AndroidUtilities.dp(f7);
                    fArr[7] = dp12;
                    fArr[6] = dp12;
                    fArr[5] = dp12;
                    fArr[4] = dp12;
                    Path path2 = w0Var.Y1;
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
        canvas2.translate(this.f21731j0 / 2.0f, getPaddingTop());
        canvas2.save();
        canvas2.translate(this.T, this.S);
        StaticLayout staticLayout = this.M;
        org.telegram.ui.Components.v5 v5Var = this.f21748r0;
        if (staticLayout != null) {
            colorFilter = F(staticLayout.getPaint().getColor());
        } else {
            colorFilter = null;
        }
        org.telegram.ui.Components.z5.drawAnimatedEmojis(canvas2, staticLayout, v5Var, 0.0f, this.f21743p0, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
        canvas2.restore();
        yh.z3 z3Var = this.F0;
        float f13 = 4.0f;
        if (z3Var.d()) {
            canvas2.save();
            float width = (getWidth() - z3Var.Q.e) / 2.0f;
            if (z3Var.f48318p) {
                dp = AndroidUtilities.dp(4.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f) + this.S + this.O;
            }
            canvas2.translate(width, dp);
            z3Var.b(canvas2);
            canvas2.restore();
        }
        canvas2.restore();
        o21 o21Var = this.f21739n0;
        org.telegram.ui.ActionBar.d6 d6Var = this.Y0;
        if (o21Var != null) {
            float alpha = getAlpha();
            if (d6Var != null) {
                d6Var.m(this.f21755u0, this.f21753t0 + 0.0f, getMeasuredWidth(), this.f21757v0);
            } else {
                org.telegram.ui.ActionBar.h6.q(this.f21755u0, this.f21753t0 + 0.0f, getMeasuredWidth(), this.f21757v0);
            }
            this.f21739n0.c(canvas, getWidth(), this.f21731j0, 0.0f, 1.0f, alpha, this.m0);
            canvas2 = canvas;
        }
        ArrayList arrayList = this.P1;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (d6Var != null) {
                d6Var.m(this.f21755u0, this.f21753t0 + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.f21757v0);
            } else {
                org.telegram.ui.ActionBar.h6.q(this.f21755u0, this.f21753t0 + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.f21757v0);
            }
            float width2 = (getWidth() - this.f21705a1) / 2.0f;
            float dp2 = AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(4.0f) + this.S + this.O + this.f21718f;
            float dp3 = (this.f21705a1 - AndroidUtilities.dp(4.0f)) / 2.0f;
            int i13 = 0;
            while (i13 < arrayList.size()) {
                e0 e0Var = (e0) arrayList.get(i13);
                float a2 = e0Var.a();
                float dp4 = ((AndroidUtilities.dp(f13) + dp3) * i13) + width2;
                float f14 = dp4 + dp3;
                RectF rectF = this.U0;
                rectF.set(dp4, dp2, f14, e0Var.f20191f + dp2);
                canvas2.save();
                if (a2 != 1.0f) {
                    f7 = 4.0f;
                    canvas2.scale(a2, a2, rectF.centerX(), rectF.centerY());
                } else {
                    f7 = 4.0f;
                }
                float[] fArr = this.a2;
                Arrays.fill(fArr, AndroidUtilities.dp(Math.min(6.75f, SharedConfig.bubbleRadius)));
                if ((e0Var.f20192g & 9) == 9) {
                    float dp5 = AndroidUtilities.dp(SharedConfig.bubbleRadius);
                    fArr[7] = dp5;
                    fArr[6] = dp5;
                }
                if ((e0Var.f20192g & 10) == 10) {
                    float dp6 = AndroidUtilities.dp(SharedConfig.bubbleRadius);
                    fArr[5] = dp6;
                    fArr[4] = dp6;
                }
                Path path = this.f21708b2;
                path.rewind();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas2.drawPath(path, H("paintChatActionBackground"));
                if (J()) {
                    canvas2.drawPath(path, org.telegram.ui.ActionBar.h6.f19112h2);
                }
                canvas2.save();
                canvas2.clipPath(path);
                z zVar = e0Var.f20203s;
                if (zVar != null) {
                    int i14 = (int) dp2;
                    zVar.setBounds((int) dp4, i14, (int) f14, e0Var.f20191f + i14);
                    e0Var.f20203s.setAlpha(255);
                    e0Var.f20203s.draw(canvas2);
                }
                canvas2.restore();
                canvas2.save();
                if (e0Var.f20204t != null) {
                    i10 = AndroidUtilities.dp(26.0f);
                } else {
                    i10 = 0;
                }
                float l4 = e0Var.h.l();
                if (e0Var.f20204t != null) {
                    i11 = AndroidUtilities.dp(f7);
                } else {
                    i11 = 0;
                }
                float f15 = i10;
                float A = com.google.android.gms.internal.vision.e2.A(dp3 - (l4 + i11), f15, f12, dp4);
                Drawable drawable = e0Var.f20204t;
                if (drawable != null) {
                    int i15 = (int) A;
                    f10 = 2.0f;
                    drawable.setBounds(i15, (int) (((e0Var.f20191f - AndroidUtilities.dp(24.0f)) / f12) + dp2), AndroidUtilities.dp(24.0f) + i15, AndroidUtilities.dp(24.0f) + ((int) (((e0Var.f20191f - AndroidUtilities.dp(24.0f)) / 2.0f) + dp2)));
                    Drawable drawable2 = e0Var.f20204t;
                    if (e0Var.f20197m) {
                        i12 = 128;
                    } else {
                        i12 = 255;
                    }
                    drawable2.setAlpha(i12);
                    e0Var.f20204t.draw(canvas2);
                    A += f15;
                } else {
                    f10 = 2.0f;
                }
                e0Var.h.f28367p = Math.max(1, (((int) dp3) - AndroidUtilities.dp(15.0f)) - i10);
                t01 t01Var = e0Var.h;
                float dp7 = (AndroidUtilities.dp(40.0f) / f10) + dp2;
                if (e0Var.f20197m) {
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

    public w0(Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context);
        this.f21738n = new zc(this);
        int i10 = UserConfig.selectedAccount;
        this.H = i10;
        ai.ca caVar = new ai.ca(null, false);
        this.f21712d0 = caVar;
        this.m0 = true;
        this.f21741o0 = new RectF();
        this.f21743p0 = new ArrayList();
        this.f21745q0 = new Stack();
        this.C0 = new zg.p0(this);
        this.L0 = -1;
        this.M0 = -1;
        this.P0 = new ArrayList();
        this.Q0 = new ArrayList();
        this.R0 = new Path();
        this.U0 = new RectF();
        this.V0 = true;
        this.W0 = false;
        this.f21720f1 = false;
        this.f21723g1 = false;
        this.f21729i1 = new org.telegram.ui.Components.e6(this, 0L, 320L, rr.h);
        this.f21746q1 = true;
        TextPaint textPaint = new TextPaint(1);
        this.f21761w1 = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f21764x1 = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.f21767y1 = textPaint3;
        this.B1 = new RadialProgress2(this, null);
        this.F1 = new la(this, 2);
        this.M1 = new Path();
        this.P1 = new ArrayList();
        this.T1 = new Paint(1);
        this.Y1 = new Path();
        this.Z1 = new float[8];
        this.a2 = new float[8];
        this.f21708b2 = new Path();
        this.f21711c2 = new int[]{16842910, 16842919};
        this.f21733j2 = new v0(this);
        caVar.f656a = false;
        this.f21750s = z10;
        this.Y0 = d6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.I = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.roundMessageSize / 2);
        this.L = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        this.f21759w = DownloadController.getInstance(i10).generateObserverTag();
        this.F0 = new yh.z3(i10, this, d6Var);
        textPaint.setTextSize(TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics()));
        textPaint3.setTextSize(TypedValue.applyDimension(1, 15.0f, getResources().getDisplayMetrics()));
        textPaint2.setTextSize(TypedValue.applyDimension(1, 15.0f, getResources().getDisplayMetrics()));
        View view = new View(context);
        this.L1 = view;
        view.setBackground(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.l1(0.1f, -16777216), 7, AndroidUtilities.dp(16.0f)));
        view.setVisibility(8);
        addView(view);
        rg.v1 v1Var = new rg.v1(10);
        this.N1 = v1Var;
        v1Var.N = 100;
        v1Var.J = false;
        v1Var.M = true;
        v1Var.G = false;
        v1Var.K = true;
        v1Var.H = true;
        v1Var.f42786r = 1;
        v1Var.f42790w = 0.98f;
        v1Var.v = 0.98f;
        v1Var.f42789u = 0.98f;
        v1Var.f42776g = false;
        v1Var.f42783o = 0.0f;
        v1Var.f42791x = 750L;
        v1Var.f42792y = 750;
        v1Var.c();
    }

    @Override
    public final void invalidate(Rect rect) {
        super.invalidate(rect);
        View view = this.v;
        if (view != null) {
            view.invalidate();
        }
        if (!this.f21721f2 || getParent() == null) {
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
        if (!this.f21721f2 || getParent() == null) {
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
