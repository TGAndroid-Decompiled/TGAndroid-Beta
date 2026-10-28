package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
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
import bi.dd;
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
import org.telegram.messenger.MessagesStorage;
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
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.m31;
import org.telegram.ui.Components.oz0;
import org.telegram.ui.Components.r11;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.y61;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ak;
import org.telegram.ui.eg;
import org.telegram.ui.hc1;
import org.telegram.ui.ig;
import org.telegram.ui.om;
import org.telegram.ui.y10;
public class v0 extends z implements DownloadController.FileDownloadProgressListener, NotificationCenter.NotificationCenterDelegate, s4 {
    public static final HashMap f25501s2;
    public float A0;
    public StaticLayout A1;
    public float B0;
    public float B1;
    public boolean C0;
    public StaticLayout C1;
    public boolean D0;
    public float D1;
    public boolean E;
    public final bh.y0 E0;
    public final TextPaint E1;
    public boolean F;
    public float F0;
    public final TextPaint F1;
    public boolean G;
    public float G0;
    public final TextPaint G1;
    public final int H;
    public bi.j7 H0;
    public TLRPC.Document H1;
    public final ImageReceiver I;
    public org.telegram.ui.Wallet.m3 I0;
    public TLRPC.VideoSize I1;
    public Drawable J;
    public boolean J0;
    public final RadialProgress2 J1;
    public Path K;
    public float K0;
    public int K1;
    public final org.telegram.ui.Components.j9 L;
    public float L0;
    public boolean L1;
    public StaticLayout M;
    public float M0;
    public RectF M1;
    public int N;
    public final RectF N0;
    public final na N1;
    public int O;
    public oz0 O0;
    public boolean O1;
    public StaticLayout P;
    public MessageObject P0;
    public ColorMatrixColorFilter P1;
    public int Q;
    public int Q0;
    public CornerPathEffect Q1;
    public int R;
    public CharSequence R0;
    public Path R1;
    public int S;
    public zh.d1 S0;
    public r11 S1;
    public int T;
    public int T0;
    public final View T1;
    public int U;
    public int U0;
    public final Path U1;
    public int V;
    public Paint V0;
    public final tg.w1 V1;
    public boolean W;
    public TextPaint W0;
    public int W1;
    public final ArrayList X0;
    public final ArrayList X1;
    public final ArrayList Y0;
    public BotInlineKeyboard.Source Y1;
    public final Path Z0;
    public boolean Z1;
    public boolean f25502a0;
    public int f25503a1;
    public int a2;
    public RadialProgressView f25504b0;
    public int f25505b1;
    public float f25506b2;
    public float f25507c0;
    public final RectF f25508c1;
    public final Paint f25509c2;
    public final di.w7 f25510d0;
    public boolean f25511d1;
    public boolean f25512d2;
    public boolean f25513e0;
    public boolean f25514e1;
    public View.OnClickListener f25515e2;
    public int f25516f;
    public boolean f25517f0;
    public s0 f25518f1;
    public int f25519f2;
    public boolean f25520g0;
    public final org.telegram.ui.ActionBar.u6 f25521g1;
    public final Path f25522g2;
    public int h;
    public boolean f25523h0;
    public int f25524h1;
    public final float[] f25525h2;
    public boolean f25526i0;
    public int f25527i1;
    public final float[] f25528i2;
    public int f25529j0;
    public StaticLayout f25530j1;
    public final Path f25531j2;
    public boolean f25532k0;
    public Paint f25533k1;
    public final int[] f25534k2;
    public int f25535l0;
    public r11 l1;
    public int f25536l2;
    public boolean m0;
    public StaticLayout f25537m1;
    public SpannableStringBuilder f25538m2;
    public final xc f25539n;
    public m31 f25540n0;
    public boolean f25541n1;
    public boolean f25542n2;
    public final RectF f25543o0;
    public boolean f25544o1;
    public Runnable f25545o2;
    public final ArrayList f25546p0;
    public int f25547p1;
    public PorterDuffColorFilter f25548p2;
    public final Stack f25549q0;
    public final org.telegram.ui.Components.h6 f25550q1;
    public int f25551q2;
    public ea0 f25552r;
    public org.telegram.ui.Components.y5 f25553r0;
    public y10 f25554r1;
    public final u0 f25555r2;
    public final boolean f25556s;
    public TextPaint f25557s0;
    public t0 f25558s1;
    public float f25559t0;
    public int f25560t1;
    public float f25561u0;
    public int f25562u1;
    public View v;
    public int f25563v0;
    public int f25564v1;
    public final int f25565w;
    public boolean f25566w0;
    public r11 f25567w1;
    public URLSpan f25568x;
    public ImageLocation f25569x0;
    public StaticLayout f25570x1;
    public xh.g f25571y;
    public float f25572y0;
    public boolean f25573y1;
    public float f25574z0;
    public TextPaint f25575z1;

    static {
        HashMap hashMap = new HashMap();
        f25501s2 = hashMap;
        ic.a.q(1, hashMap, "1⃣", 3, "2⃣");
        ic.a.q(6, hashMap, "3⃣", 12, "4⃣");
        hashMap.put(24, "5⃣");
    }

    public v0(Context context) {
        this(context, null, false);
    }

    public static float R(StaticLayout staticLayout) {
        float f7 = 0.0f;
        for (int i10 = 0; i10 < staticLayout.getLineCount(); i10++) {
            float ceil = (int) Math.ceil(staticLayout.getLineWidth(i10));
            if (ceil > f7) {
                f7 = ceil;
            }
        }
        return f7;
    }

    private float getWalletActionTop() {
        return AndroidUtilities.dp(11.0f) + this.S + this.O;
    }

    private void setStarsPaused(boolean z10) {
        tg.w1 w1Var = this.V1;
        if (z10 == w1Var.f49129g) {
            return;
        }
        w1Var.f49129g = z10;
        if (z10) {
            w1Var.R = System.currentTimeMillis();
            return;
        }
        for (int i10 = 0; i10 < w1Var.f49135n.size(); i10++) {
            tg.v1 v1Var = (tg.v1) w1Var.f49135n.get(i10);
            v1Var.f49104a = (System.currentTimeMillis() - w1Var.R) + v1Var.f49104a;
        }
        invalidate();
    }

    public static SpannableStringBuilder x(int i10, String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceArrows(str, false, AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(1.3f), 0.8f, i10));
        spannableStringBuilder.insert(0, (CharSequence) "*");
        spannableStringBuilder.setSpan(new n2(AndroidUtilities.dp(18.0f)), 0, 1, 33);
        if (Build.VERSION.SDK_INT >= 29) {
            android.support.v4.media.session.x.l();
            spannableStringBuilder.setSpan(android.support.v4.media.session.x.g(AndroidUtilities.dp(12.0f)), 0, spannableStringBuilder.length(), 33);
        }
        spannableStringBuilder.setSpan(new AlignmentSpan.Standard(Layout.Alignment.ALIGN_NORMAL), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public final void A(Canvas canvas) {
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
        canvas2.translate(this.f25529j0 / 2.0f, getPaddingTop());
        canvas2.save();
        canvas2.translate(this.T, this.S);
        StaticLayout staticLayout = this.M;
        org.telegram.ui.Components.y5 y5Var = this.f25553r0;
        if (staticLayout != null) {
            colorFilter = F(staticLayout.getPaint().getColor());
        } else {
            colorFilter = null;
        }
        org.telegram.ui.Components.c6.drawAnimatedEmojis(canvas2, staticLayout, y5Var, 0.0f, this.f25546p0, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
        canvas2.restore();
        float f13 = 4.0f;
        if (K()) {
            canvas2.save();
            bi.j7 j7Var = this.H0;
            float width = (getWidth() - j7Var.T.f19333f) / 2.0f;
            if (j7Var.f4887p) {
                dp = AndroidUtilities.dp(4.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f) + this.S + this.O;
            }
            canvas2.translate(width, dp);
            this.H0.c(canvas2);
            canvas2.restore();
        }
        canvas2.restore();
        m31 m31Var = this.f25540n0;
        org.telegram.ui.ActionBar.u6 u6Var = this.f25521g1;
        if (m31Var != null) {
            float alpha = getAlpha();
            if (u6Var != null) {
                u6Var.b(this.f25561u0, this.f25559t0 + 0.0f, getMeasuredWidth(), this.f25563v0);
            } else {
                org.telegram.ui.ActionBar.y6.q(this.f25561u0, this.f25559t0 + 0.0f, getMeasuredWidth(), this.f25563v0);
            }
            this.f25540n0.c(canvas, getWidth(), this.f25529j0, 0.0f, 1.0f, alpha, this.m0);
            canvas2 = canvas;
        }
        ArrayList arrayList = this.X1;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (u6Var != null) {
                u6Var.b(this.f25561u0, this.f25559t0 + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.f25563v0);
            } else {
                org.telegram.ui.ActionBar.y6.q(this.f25561u0, this.f25559t0 + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.f25563v0);
            }
            float width2 = (getWidth() - this.f25527i1) / 2.0f;
            float dp2 = AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(4.0f) + this.S + this.O + this.f25516f;
            float dp3 = (this.f25527i1 - AndroidUtilities.dp(4.0f)) / 2.0f;
            int i13 = 0;
            while (i13 < arrayList.size()) {
                d0 d0Var = (d0) arrayList.get(i13);
                float a2 = d0Var.a();
                float dp4 = ((AndroidUtilities.dp(f13) + dp3) * i13) + width2;
                float f14 = dp4 + dp3;
                RectF rectF = this.f25508c1;
                rectF.set(dp4, dp2, f14, d0Var.f23966f + dp2);
                canvas2.save();
                if (a2 != 1.0f) {
                    f7 = f13;
                    canvas2.scale(a2, a2, rectF.centerX(), rectF.centerY());
                } else {
                    f7 = f13;
                }
                float[] fArr = this.f25528i2;
                Arrays.fill(fArr, AndroidUtilities.dp(Math.min(6.75f, SharedConfig.bubbleRadius)));
                if ((d0Var.f23967g & 9) == 9) {
                    float dp5 = AndroidUtilities.dp(SharedConfig.bubbleRadius);
                    fArr[7] = dp5;
                    fArr[6] = dp5;
                }
                if ((d0Var.f23967g & 10) == 10) {
                    float dp6 = AndroidUtilities.dp(SharedConfig.bubbleRadius);
                    fArr[5] = dp6;
                    fArr[4] = dp6;
                }
                Path path = this.f25531j2;
                path.rewind();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas2.drawPath(path, H("paintChatActionBackground"));
                if (J()) {
                    canvas2.drawPath(path, org.telegram.ui.ActionBar.y6.f23425h2);
                }
                canvas2.save();
                canvas2.clipPath(path);
                y yVar = d0Var.f23978s;
                if (yVar != null) {
                    int i14 = (int) dp2;
                    yVar.setBounds((int) dp4, i14, (int) f14, d0Var.f23966f + i14);
                    d0Var.f23978s.setAlpha(255);
                    d0Var.f23978s.draw(canvas2);
                }
                canvas2.restore();
                canvas2.save();
                if (d0Var.f23979t != null) {
                    i10 = AndroidUtilities.dp(26.0f);
                } else {
                    i10 = 0;
                }
                float l4 = d0Var.h.l();
                if (d0Var.f23979t != null) {
                    i11 = AndroidUtilities.dp(f7);
                } else {
                    i11 = 0;
                }
                float f15 = i10;
                float B = c3.h0.B(dp3 - (l4 + i11), f15, f12, dp4);
                Drawable drawable = d0Var.f23979t;
                if (drawable != null) {
                    int i15 = (int) B;
                    f10 = f12;
                    drawable.setBounds(i15, (int) (((d0Var.f23966f - AndroidUtilities.dp(24.0f)) / f12) + dp2), AndroidUtilities.dp(24.0f) + i15, AndroidUtilities.dp(24.0f) + ((int) (((d0Var.f23966f - AndroidUtilities.dp(24.0f)) / f10) + dp2)));
                    Drawable drawable2 = d0Var.f23979t;
                    if (d0Var.f23972m) {
                        i12 = 128;
                    } else {
                        i12 = 255;
                    }
                    drawable2.setAlpha(i12);
                    d0Var.f23979t.draw(canvas2);
                    B += f15;
                } else {
                    f10 = f12;
                }
                d0Var.h.f32100p = Math.max(1, (((int) dp3) - AndroidUtilities.dp(15.0f)) - i10);
                r11 r11Var = d0Var.h;
                float dp7 = (AndroidUtilities.dp(40.0f) / f10) + dp2;
                if (d0Var.f23972m) {
                    f11 = 0.5f;
                } else {
                    f11 = 1.0f;
                }
                r11Var.f(canvas2, B, dp7, f11);
                canvas2.restore();
                canvas2.restore();
                i13++;
                f13 = f7;
                f12 = f10;
            }
        }
    }

    public final void B(Canvas canvas, boolean z10) {
        if (this.f25556s) {
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
            org.telegram.ui.ActionBar.u6 u6Var = this.f25521g1;
            if (u6Var != null) {
                u6Var.b(this.f25561u0, this.f25559t0 + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.f25563v0);
            } else {
                org.telegram.ui.ActionBar.y6.q(this.f25561u0, this.f25559t0 + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.f25563v0);
            }
            MessageObject messageObject = this.P0;
            if (messageObject != null && messageObject.shouldDrawReactions()) {
                bh.y0 y0Var = this.E0;
                boolean z11 = y0Var.f4216b;
                u0 u0Var = this.f25555r2;
                if (!z11 || (u0Var.f25472b && y0Var.f4223l)) {
                    y0Var.f4215a = 1.0f;
                    int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
                    if (i10 < 0) {
                        canvas2 = canvas;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f7 * 255.0f), 31);
                    } else {
                        canvas2 = canvas;
                    }
                    if (u0Var.f25472b) {
                        f10 = u0Var.f25473c;
                    }
                    y0Var.d(canvas2, f10, num);
                    if (i10 < 0) {
                        canvas2.restore();
                    }
                }
            }
        }
    }

    public final void D(om omVar, Canvas canvas, int i10, Integer num, float f7) {
        bh.y0 y0Var = this.E0;
        if (!y0Var.f4216b) {
            org.telegram.ui.ActionBar.u6 u6Var = this.f25521g1;
            if (u6Var != null) {
                u6Var.b(this.f25561u0, this.f25559t0 + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.f25563v0);
            } else {
                org.telegram.ui.ActionBar.y6.q(this.f25561u0, this.f25559t0 + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.f25563v0);
            }
            y0Var.D = f7;
            y0Var.f(omVar, canvas, i10, num);
        }
    }

    public final ColorFilter F(int i10) {
        if (i10 != this.f25551q2 || this.f25548p2 == null) {
            this.f25551q2 = i10;
            this.f25548p2 = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        }
        return this.f25548p2;
    }

    public final int G(MessageObject messageObject) {
        int i10;
        int i11 = this.f25524h1;
        int i12 = messageObject.type;
        if (i12 == 37) {
            i11 = AndroidUtilities.dp(52.0f);
        } else if (i12 == 21 || P()) {
            i11 = AndroidUtilities.dp(78.0f);
        }
        if (!O() && (i10 = messageObject.type) != 34 && i10 != 35) {
            return i11;
        }
        return 0;
    }

    public Paint H(String str) {
        Paint paint;
        org.telegram.ui.ActionBar.u6 u6Var = this.f25521g1;
        if (u6Var != null) {
            paint = u6Var.d(str);
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return org.telegram.ui.ActionBar.y6.U0(str);
    }

    public final float I(MessageObject messageObject) {
        MessagesController messagesController;
        String str;
        if (messageObject != null) {
            try {
                if (messageObject.type == 22 && (str = (messagesController = MessagesController.getInstance(this.H)).uploadingWallpaper) != null && TextUtils.equals(messageObject.messageOwner.action.wallpaper.uploadingImage, str)) {
                    return messagesController.uploadingWallpaperInfo.f23065r;
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
        if (this.V0 == null) {
            org.telegram.ui.ActionBar.u6 u6Var = this.f25521g1;
            if (u6Var != null) {
                if (u6Var.f()) {
                    return true;
                }
                return false;
            } else if (org.telegram.ui.ActionBar.y6.c1()) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public final boolean K() {
        bi.j7 j7Var = this.H0;
        if (j7Var != null && j7Var.Q != null) {
            return true;
        }
        return false;
    }

    public final boolean L() {
        TLRPC.Message message;
        MessageObject messageObject = this.P0;
        if (messageObject != null && (message = messageObject.messageOwner) != null && (message.action instanceof TLRPC.TL_messageActionGramTransfer)) {
            return true;
        }
        return false;
    }

    public final void M() {
        s0 s0Var = this.f25518f1;
        if (s0Var != null && s0Var.d()) {
            super.invalidate();
        } else if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    public final boolean N(MessageObject messageObject) {
        if (messageObject != null) {
            int i10 = messageObject.type;
            if (i10 == 30 || i10 == 18 || i10 == 25 || P()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean O() {
        TLRPC.Message message;
        MessageObject messageObject = this.P0;
        if (messageObject != null && (message = messageObject.messageOwner) != null && (message.action instanceof TLRPC.TL_messageActionSuggestedPostApproval)) {
            return true;
        }
        return false;
    }

    public final boolean P() {
        MessageObject messageObject;
        int i10;
        if (!K() && this.O0 == null && (i10 = (messageObject = this.P0).type) != 31 && i10 != 37 && i10 != 33 && i10 != 35 && i10 != 34 && i10 != 21 && i10 != 22 && !messageObject.isStoryMention()) {
            TLRPC.Message message = this.P0.messageOwner;
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

    public final boolean Q() {
        MessageObject messageObject = this.P0;
        if (messageObject != null) {
            TLRPC.Message message = messageObject.messageOwner;
            TLRPC.MessageAction messageAction = message.action;
            if (((messageAction instanceof TLRPC.TL_messageActionGiftCode) || (messageAction instanceof TLRPC.TL_messageActionGiftStars)) && (message.from_id instanceof TLRPC.TL_peerUser)) {
                return UserObject.isUserSelf(MessagesController.getInstance(this.H).getUser(Long.valueOf(this.P0.messageOwner.from_id.user_id)));
            }
            return false;
        }
        return false;
    }

    public final void S(CharacterStyle characterStyle) {
        if (this.f25518f1 != null && (characterStyle instanceof URLSpan)) {
            String url = ((URLSpan) characterStyle).getURL();
            if (url.startsWith("task")) {
                this.f25518f1.g(this, this.P0.getReplyMsgId(), Integer.parseInt(url.substring(5)));
                return;
            }
            if (url.startsWith("topic")) {
                URLSpan uRLSpan = this.f25568x;
                if (uRLSpan instanceof y61) {
                    TLObject tLObject = ((y61) uRLSpan).f34984c;
                    if (tLObject instanceof TLRPC.TL_forumTopic) {
                        pg.d.m(this.f25518f1.y(), -this.f25518f1.a(), (TLRPC.TL_forumTopic) tLObject, 0);
                        return;
                    }
                    return;
                }
            }
            if (url.startsWith("invite")) {
                URLSpan uRLSpan2 = this.f25568x;
                if (uRLSpan2 instanceof y61) {
                    TLObject tLObject2 = ((y61) uRLSpan2).f34984c;
                    if (tLObject2 instanceof TLRPC.TL_chatInviteExported) {
                        this.f25518f1.z((TLRPC.TL_chatInviteExported) tLObject2);
                        return;
                    }
                    return;
                }
            }
            if (url.startsWith("game")) {
                this.f25518f1.e(this, this.P0.getReplyMsgId());
            } else if (url.startsWith("http")) {
                qf.d.r(getContext(), url);
            } else {
                this.f25518f1.i0(Long.parseLong(url));
            }
        }
    }

    public final void T() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = new TLRPC.TL_premiumGiftOption();
        MessageObject messageObject = this.P0;
        TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
        tL_premiumGiftOption.amount = messageAction.amount;
        tL_premiumGiftOption.months = messageAction.months;
        tL_premiumGiftOption.currency = messageAction.currency;
        String str = null;
        if (messageObject != null && (messageAction instanceof TLRPC.TL_messageActionGiftCode) && !Q()) {
            str = ((TLRPC.TL_messageActionGiftCode) this.P0.messageOwner.action).slug;
        }
        if (this.f25518f1 != null) {
            AndroidUtilities.runOnUIThread(new jg.f1((Object) this, (Object) tL_premiumGiftOption, (Object) str, 25));
        }
    }

    public final void U() {
        TLRPC.Message message;
        MessageObject messageObject = this.P0;
        if (messageObject != null && (message = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            boolean z10 = messageAction instanceof TLRPC.TL_messageActionGiftStars;
            di.w7 w7Var = this.f25510d0;
            if (z10) {
                Context context = getContext();
                TLRPC.Message message2 = this.P0.messageOwner;
                int i10 = message2.date;
                TLRPC.Peer peer = message2.from_id;
                TLRPC.Peer peer2 = message2.peer_id;
                TLRPC.TL_messageActionGiftStars tL_messageActionGiftStars = (TLRPC.TL_messageActionGiftStars) message2.action;
                org.telegram.ui.ActionBar.u6 u6Var = w7Var.J;
                TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
                starsTransaction.title = null;
                starsTransaction.description = null;
                starsTransaction.photo = null;
                TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
                starsTransaction.peer = tL_starsTransactionPeer;
                tL_starsTransactionPeer.peer = peer;
                starsTransaction.date = i10;
                starsTransaction.amount = TL_stars.StarsAmount.ofStars(tL_messageActionGiftStars.stars);
                starsTransaction.f22259id = tL_messageActionGiftStars.transaction_id;
                starsTransaction.gift = true;
                starsTransaction.sent_by = peer;
                starsTransaction.received_by = peer2;
                dd.g1(context, false, 0L, this.H, starsTransaction, u6Var);
            } else if (messageAction instanceof TLRPC.TL_messageActionPrizeStars) {
                Context context2 = getContext();
                TLRPC.Message message3 = this.P0.messageOwner;
                int i11 = message3.date;
                TLRPC.Peer peer3 = message3.from_id;
                TLRPC.Peer peer4 = message3.peer_id;
                TLRPC.TL_messageActionPrizeStars tL_messageActionPrizeStars = (TLRPC.TL_messageActionPrizeStars) message3.action;
                org.telegram.ui.ActionBar.u6 u6Var2 = w7Var.J;
                TL_stars.StarsTransaction starsTransaction2 = new TL_stars.StarsTransaction();
                starsTransaction2.title = null;
                starsTransaction2.description = null;
                starsTransaction2.photo = null;
                TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer2 = new TL_stars.TL_starsTransactionPeer();
                starsTransaction2.peer = tL_starsTransactionPeer2;
                tL_starsTransactionPeer2.peer = tL_messageActionPrizeStars.boost_peer;
                starsTransaction2.date = i11;
                starsTransaction2.amount = TL_stars.StarsAmount.ofStars(tL_messageActionPrizeStars.stars);
                starsTransaction2.f22259id = tL_messageActionPrizeStars.transaction_id;
                starsTransaction2.gift = true;
                starsTransaction2.flags |= 8192;
                starsTransaction2.giveaway_post_id = tL_messageActionPrizeStars.giveaway_msg_id;
                starsTransaction2.sent_by = peer3;
                starsTransaction2.received_by = peer4;
                dd.g1(context2, false, 0L, this.H, starsTransaction2, u6Var2);
            } else if (messageAction instanceof TLRPC.TL_messageActionGiftTon) {
                Context context3 = getContext();
                TLRPC.Message message4 = this.P0.messageOwner;
                int i12 = message4.date;
                TLRPC.Peer peer5 = message4.from_id;
                TLRPC.Peer peer6 = message4.peer_id;
                TLRPC.TL_messageActionGiftTon tL_messageActionGiftTon = (TLRPC.TL_messageActionGiftTon) message4.action;
                org.telegram.ui.ActionBar.u6 u6Var3 = w7Var.J;
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
                starsTransaction3.f22259id = tL_messageActionGiftTon.transaction_id;
                starsTransaction3.gift = true;
                starsTransaction3.sent_by = peer5;
                starsTransaction3.received_by = peer6;
                dd.g1(context3, false, 0L, this.H, starsTransaction3, u6Var3);
            } else if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                if (!((TLRPC.TL_messageActionStarGift) messageAction).forceIn) {
                    bi.h7 h7Var = new bi.h7(getContext(), this.H, this.P0.getDialogId(), this.f25521g1, null);
                    h7Var.K2(this.P0, null);
                    h7Var.show();
                }
            } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                if (((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift.burned) {
                    org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                    if (U != null) {
                        org.telegram.messenger.t.q(R.string.UniqueGiftNotFoundBurned, wc.b0(U), R.raw.fire_on, 36);
                        return;
                    }
                    return;
                }
                bi.h7 h7Var2 = new bi.h7(getContext(), this.H, this.P0.getDialogId(), this.f25521g1, null);
                h7Var2.K2(this.P0, null);
                h7Var2.show();
            } else if (messageAction instanceof TLRPC.TL_messageActionSetChatTheme) {
                TLRPC.ChatTheme chatTheme = ((TLRPC.TL_messageActionSetChatTheme) messageAction).theme;
                if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                    TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        bi.h7 h7Var3 = new bi.h7(getContext(), this.H, this.P0.getDialogId(), this.f25521g1, null);
                        h7Var3.J2(starGift.slug, (TL_stars.TL_starGiftUnique) starGift, null);
                        h7Var3.show();
                    }
                }
            }
        }
    }

    public final boolean V(float f7, float f10, ig igVar) {
        if (L() && !this.P0.isOutOwner() && !this.P0.messageOwner.premiumEffectWasPlayed) {
            float y3 = getY() + getPaddingTop() + getWalletActionTop();
            if (y3 >= f7 && y3 + AndroidUtilities.dp(140.0f) <= f10) {
                org.telegram.ui.Wallet.m3 m3Var = this.I0;
                yj0 yj0Var = m3Var.f36911l;
                if (m3Var.f36906i0 && m3Var.f36908j0 == null) {
                    m3Var.f36906i0 = false;
                    m3Var.f36910k0 = igVar;
                    m3Var.K.d(0.0f, true);
                    m3Var.M = false;
                    m3Var.N = 0L;
                    m3Var.b();
                    m3Var.g();
                    m3Var.f36926t = 18.0f;
                    m3Var.f36928u.f();
                    yj0Var.T(0.0f, true);
                    yj0Var.start();
                    m3Var.H = true;
                    float f11 = m3Var.R;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    m3Var.f36908j0 = ofFloat;
                    ofFloat.setDuration(2400L);
                    m3Var.f36908j0.setInterpolator(ds.h);
                    m3Var.f36908j0.addUpdateListener(new eg(m3Var, f11, 5));
                    m3Var.f36908j0.addListener(new hc1(m3Var, 6));
                    m3Var.f36908j0.start();
                    m3Var.f36892a.invalidate();
                    this.P0.messageOwner.premiumEffectWasPlayed = true;
                    MessagesStorage.getInstance(this.H).updateMessageCustomParams(this.P0.getDialogId(), this.P0.messageOwner);
                    return true;
                }
            }
        }
        return false;
    }

    public final void W(int i10, boolean z10, boolean z11) {
        String formatDateChat;
        int i11 = this.Q0;
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
            this.Q0 = i10;
            CharSequence charSequence = this.R0;
            if (charSequence == null || !TextUtils.equals(formatDateChat, charSequence)) {
                this.R0 = formatDateChat;
                this.f25538m2 = null;
                Z(z11);
            }
        }
    }

    public final void X(org.telegram.messenger.MessageObject r38, boolean r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.v0.X(org.telegram.messenger.MessageObject, boolean):void");
    }

    public final void Y(float f7, int i10) {
        this.f25566w0 = true;
        this.f25563v0 = i10;
        this.f25559t0 = f7;
        this.f25561u0 = 0.0f;
    }

    public final void Z(boolean z10) {
        if (getMeasuredWidth() != 0) {
            w(getMeasuredWidth(), this.R0);
            invalidate();
        }
        if (!this.C0) {
            if (z10) {
                AndroidUtilities.runOnUIThread(new o0(this, 5));
                return;
            } else {
                requestLayout();
                return;
            }
        }
        q();
    }

    @Override
    public final boolean a() {
        return false;
    }

    @Override
    public final void d(TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        s0 s0Var = this.f25518f1;
        if (s0Var != null) {
            s0Var.P0(this, reactionCount, z10, f7, f10);
        }
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
            if (i10 == NotificationCenter.diceStickersDidLoad) {
                if (Objects.equals(objArr[0], UserConfig.getInstance(this.H).premiumGiftsStickerPack) && (messageObject = this.P0) != null) {
                    X(messageObject, true);
                }
            } else if (i10 == NotificationCenter.walletUpdate && L()) {
                this.f25538m2 = null;
                this.V = 0;
                requestLayout();
                invalidate();
            }
        } else {
            MessageObject messageObject2 = this.P0;
            if (messageObject2 != null) {
                X(messageObject2, true);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.T1) {
            float a2 = this.f25539n.a(0.02f);
            canvas.save();
            canvas.scale(a2, a2, (view.getMeasuredWidth() / 2.0f) + view.getX(), (view.getMeasuredHeight() / 2.0f) + view.getY());
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final boolean g() {
        return false;
    }

    public ImageReceiver getAvatarImage() {
        return null;
    }

    @Override
    public int getBoundsLeft() {
        if (K()) {
            int width = ((int) (getWidth() - (this.H0.T.f19333f + AndroidUtilities.dp(8.0f)))) / 2;
            if (this.H0.f4887p) {
                return width;
            }
            return Math.min(this.f25503a1, width);
        } else if (N(this.P0)) {
            return ic.a.A(getWidth(), this.f25527i1, 2, this.f25529j0 / 2);
        } else {
            int i10 = this.f25503a1;
            ImageReceiver imageReceiver = this.I;
            if (imageReceiver != null && imageReceiver.getVisible()) {
                i10 = Math.min((int) imageReceiver.getImageX(), i10);
            }
            return (this.f25529j0 / 2) + i10;
        }
    }

    @Override
    public int getBoundsRight() {
        int i10;
        int i11;
        if (K()) {
            int dp = ((int) ((this.H0.T.f19333f + AndroidUtilities.dp(8.0f)) + getWidth())) / 2;
            if (this.H0.f4887p) {
                return dp;
            }
            return Math.max(this.f25505b1, dp);
        }
        if (N(this.P0)) {
            i10 = this.f25529j0 / 2;
            i11 = (getWidth() + this.f25527i1) / 2;
        } else {
            i10 = this.f25505b1;
            ImageReceiver imageReceiver = this.I;
            if (imageReceiver != null && imageReceiver.getVisible()) {
                i10 = Math.max((int) imageReceiver.getImageX2(), i10);
            }
            i11 = this.f25529j0 / 2;
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
        return this.Q0;
    }

    public s0 getDelegate() {
        return this.f25518f1;
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
        return this.P0;
    }

    @Override
    public int getObserverTag() {
        return this.f25565w;
    }

    public ImageReceiver getPhotoImage() {
        return this.I;
    }

    public bh.y0 getReactionsLayout() {
        return this.E0;
    }

    @Override
    public float getSlidingOffsetX() {
        return 0.0f;
    }

    public u0 getTransitionParams() {
        return this.f25555r2;
    }

    public float getWalletSlidingOffset() {
        return this.M0;
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
        Runnable runnable = this.f25545o2;
        if (runnable != null) {
            runnable.run();
        }
        if (!this.f25542n2 || getParent() == null) {
            return;
        }
        View view2 = (View) getParent();
        if (view2.getParent() != null) {
            view2.invalidate();
            ((View) view2.getParent()).invalidate();
        }
    }

    @Override
    public final boolean l() {
        s0 s0Var = this.f25518f1;
        if (s0Var != null) {
            return s0Var.M0(this, this.f25572y0, this.f25574z0);
        }
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        boolean z10;
        s0 s0Var;
        super.onAttachedToWindow();
        this.f25512d2 = true;
        this.I.onAttachedToWindow();
        setStarsPaused(false);
        if (this.f25556s && (s0Var = this.f25518f1) != null && !s0Var.d()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f25553r0 = org.telegram.ui.Components.c6.update(0, this, z10, this.f25553r0, this.M);
        t0 t0Var = this.f25558s1;
        if (t0Var != null) {
            t0Var.h = org.telegram.ui.Components.c6.update(0, (View) ((v0) t0Var.f25432i), false, (org.telegram.ui.Components.y5) t0Var.h, (StaticLayout) t0Var.f25430f);
        }
        int i10 = this.H;
        NotificationCenter.getInstance(i10).addWeakObserver(this, NotificationCenter.didUpdatePremiumGiftStickers);
        NotificationCenter.getInstance(i10).addWeakObserver(this, NotificationCenter.didUpdateTonGiftStickers);
        NotificationCenter.getInstance(i10).addWeakObserver(this, NotificationCenter.starGiftsLoaded);
        NotificationCenter.getInstance(i10).addWeakObserver(this, NotificationCenter.diceStickersDidLoad);
        NotificationCenter.getInstance(i10).addWeakObserver(this, NotificationCenter.walletUpdate);
        NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.emojiLoaded);
        MessageObject messageObject = this.P0;
        if (messageObject != null && messageObject.type == 21) {
            X(messageObject, true);
        }
        bi.j7 j7Var = this.H0;
        if (j7Var != null) {
            j7Var.a();
        }
        bh.y0 y0Var = this.E0;
        ArrayList arrayList = y0Var.v;
        y0Var.G = true;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((bh.v0) arrayList.get(i11)).a();
        }
        m31 m31Var = this.f25540n0;
        if (m31Var != null) {
            m31Var.a();
        }
        oz0 oz0Var = this.O0;
        if (oz0Var != null) {
            oz0Var.d.R(oz0Var.f31404b);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f25512d2 = false;
        int i10 = this.H;
        DownloadController.getInstance(i10).removeLoadingFileObserver(this);
        this.I.onDetachedFromWindow();
        setStarsPaused(true);
        this.C0 = false;
        org.telegram.ui.Components.c6.release(this, this.f25553r0);
        t0 t0Var = this.f25558s1;
        if (t0Var != null) {
            org.telegram.ui.Components.c6.release((v0) t0Var.f25432i, (org.telegram.ui.Components.y5) t0Var.h);
        }
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.didUpdatePremiumGiftStickers);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.didUpdateTonGiftStickers);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starGiftsLoaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.diceStickersDidLoad);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.walletUpdate);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        this.f25510d0.g();
        this.f25555r2.f25471a = false;
        bi.j7 j7Var = this.H0;
        if (j7Var != null) {
            j7Var.S = false;
            j7Var.d.onDetachedFromWindow();
            j7Var.e.b();
            zh.j0 j0Var = j7Var.f4895y;
            j0Var.d.onDetachedFromWindow();
            org.telegram.ui.Components.c6.release((View) null, j0Var.f53123q);
            j0Var.f53123q = null;
        }
        this.E0.q();
        m31 m31Var = this.f25540n0;
        if (m31Var != null) {
            m31Var.b();
        }
        oz0 oz0Var = this.O0;
        if (oz0Var != null) {
            oz0Var.d.R(null);
        }
    }

    @Override
    public void onDraw(android.graphics.Canvas r40) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.v0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        CharacterStyle[] characterStyleArr;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        MessageObject messageObject = this.P0;
        if (TextUtils.isEmpty(this.R0) && messageObject == null) {
            return;
        }
        if (this.f25538m2 == null) {
            if (!TextUtils.isEmpty(this.R0)) {
                charSequence = this.R0;
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
            this.f25538m2 = spannableStringBuilder;
        }
        if (Build.VERSION.SDK_INT < 24) {
            accessibilityNodeInfo.setContentDescription(this.f25538m2.toString());
        } else {
            accessibilityNodeInfo.setText(this.f25538m2);
        }
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Wallet.l3 l3Var;
        RectF rectF = this.f25543o0;
        this.T1.layout((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        org.telegram.ui.Wallet.m3 m3Var = this.I0;
        if (m3Var == null) {
            l3Var = null;
        } else {
            l3Var = m3Var.f36913m;
        }
        if (l3Var != null) {
            l3Var.layout(0, 0, AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f));
        }
    }

    @Override
    public final void onMeasure(int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.v0.onMeasure(int, int):void");
    }

    @Override
    public final void onSuccessDownload(String str) {
        TLRPC.PhotoSize photoSize;
        MessageObject messageObject = this.P0;
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
            this.I.setImage(this.f25569x0, "g", ImageLocation.getForObject(photoSize, messageObject.photoThumbsObject), "50_50_b", this.L, 0L, null, messageObject, 1);
            DownloadController.getInstance(this.H).removeLoadingFileObserver(this);
        }
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.v0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void q() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.v0.q():void");
    }

    public final boolean r(android.view.MotionEvent r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.v0.r(android.view.MotionEvent):boolean");
    }

    public final void s() {
        RectF rectF = this.f25508c1;
        this.f25503a1 = (int) Math.min(this.f25503a1, rectF.left);
        this.f25505b1 = (int) Math.max(this.f25505b1, rectF.right);
    }

    public void setCustomText(CharSequence charSequence) {
        this.R0 = charSequence;
        if (charSequence != null) {
            Z(false);
        }
    }

    public void setDelegate(s0 s0Var) {
        this.f25518f1 = s0Var;
    }

    public void setInvalidateColors(boolean z10) {
        if (this.f25514e1 == z10) {
            return;
        }
        this.f25514e1 = z10;
        invalidate();
    }

    public void setInvalidateListener(Runnable runnable) {
        this.f25545o2 = runnable;
    }

    public void setInvalidateWithParent(View view) {
        this.v = view;
    }

    public void setInvalidatesParent(boolean z10) {
        this.f25542n2 = z10;
    }

    public void setMessageObject(MessageObject messageObject) {
        X(messageObject, false);
    }

    public void setOnActionClickListener(View.OnClickListener onClickListener) {
        this.f25515e2 = onClickListener;
    }

    public void setOverrideTextMaxWidth(int i10) {
        this.f25519f2 = i10;
    }

    public void setScrimReaction(Integer num) {
        this.E0.C = num;
    }

    public void setShowTopic(boolean z10) {
        if (this.m0 != z10) {
            this.m0 = z10;
            M();
            invalidate();
        }
    }

    public void setSpoilersSuppressed(boolean z10) {
        this.J0 = z10;
        org.telegram.ui.Wallet.m3 m3Var = this.I0;
        if (m3Var != null) {
            m3Var.n(z10);
        }
        ArrayList arrayList = this.f25546p0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((xh.g) obj).invalidateSelf();
        }
    }

    public void setWalletSlidingOffset(float f7) {
        setTranslationX((getTranslationX() - this.M0) + f7);
        this.M0 = f7;
    }

    public final boolean t(float f7, int i10) {
        bh.y0 y0Var = this.E0;
        if (!y0Var.K) {
            return false;
        }
        float y3 = getY() + y0Var.d;
        if (y3 <= f7 || (y3 + y0Var.f4226o) - AndroidUtilities.dp(16.0f) >= i10) {
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
        int dp = this.f25527i1 - AndroidUtilities.dp(16.0f);
        TextPaint textPaint = this.E1;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        TextPaint textPaint2 = this.F1;
        textPaint2.setTextSize(AndroidUtilities.dp(13.0f));
        TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode = (TLRPC.TL_messageActionGiftCode) this.P0.messageOwner.action;
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
        valueOf.setSpan(new r61(AndroidUtilities.bold()), 0, valueOf.length(), 33);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        this.f25530j1 = new StaticLayout(valueOf, textPaint, dp, alignment, 1.1f, 0.0f, false);
        this.f25537m1 = null;
        this.l1 = null;
        t0 t0Var = this.f25558s1;
        if (t0Var != null) {
            org.telegram.ui.Components.c6.release((v0) t0Var.f25432i, (org.telegram.ui.Components.y5) t0Var.h);
        }
        t0 t0Var2 = new t0(this);
        this.f25558s1 = t0Var2;
        t0Var2.a(spannableStringBuilder, textPaint2, dp);
        SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(string2);
        valueOf2.setSpan(new r61(AndroidUtilities.bold()), 0, valueOf2.length(), 33);
        this.f25544o1 = false;
        this.f25547p1 = 0;
        this.f25567w1 = null;
        StaticLayout staticLayout = new StaticLayout(valueOf2, (TextPaint) H("paintChatActionText"), dp, alignment, 1.0f, 0.0f, false);
        this.f25570x1 = staticLayout;
        this.f25573y1 = true;
        this.D1 = R(staticLayout);
    }

    public final void v(CharSequence charSequence, SpannableStringBuilder spannableStringBuilder, CharSequence charSequence2, boolean z10, CharSequence charSequence3, int i10, String str, int i11, boolean z11) {
        ?? r42;
        int i12;
        int a2;
        CharSequence charSequence4 = charSequence2;
        int dp = i11 - AndroidUtilities.dp(16.0f);
        MessageObject messageObject = this.P0;
        if (messageObject != null && messageObject.type == 30) {
            dp -= AndroidUtilities.dp(16.0f);
        }
        int i13 = dp;
        if (charSequence != null) {
            MessageObject messageObject2 = this.P0;
            TextPaint textPaint = this.E1;
            if (messageObject2 != null && messageObject2.type == 30) {
                textPaint.setTextSize(AndroidUtilities.dp(14.0f));
            } else {
                textPaint.setTextSize(AndroidUtilities.dp(16.0f));
            }
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
            valueOf.setSpan(new r61(AndroidUtilities.bold()), 0, valueOf.length(), 33);
            r42 = 0;
            this.f25530j1 = new StaticLayout(valueOf, textPaint, i13, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        } else {
            r42 = 0;
            this.f25530j1 = null;
        }
        this.f25537m1 = null;
        if (spannableStringBuilder != null) {
            r11 r11Var = new r11(spannableStringBuilder, 10.0f, null);
            this.l1 = r11Var;
            r11Var.f32088a.linkColor = -1;
        } else {
            this.l1 = null;
        }
        MessageObject messageObject3 = this.P0;
        TextPaint textPaint2 = this.F1;
        if (messageObject3 != null && messageObject3.type == 35) {
            textPaint2.setTextSize(AndroidUtilities.dp(14.3f));
        } else if (messageObject3 != null && (P() || (i12 = this.P0.type) == 30 || i12 == 18 || i12 == 31 || i12 == 37 || i12 == 33)) {
            textPaint2.setTextSize(AndroidUtilities.dp(13.0f));
        } else {
            textPaint2.setTextSize(AndroidUtilities.dp(15.0f));
        }
        int dp2 = i13 - AndroidUtilities.dp(12.0f);
        MessageObject messageObject4 = this.P0;
        if (messageObject4 != null && messageObject4.type == 22 && messageObject4.getDialogId() >= 0 && (a2 = fi.v3.a(charSequence4, textPaint2)) < dp2 && a2 > dp2 / 5.0f) {
            dp2 = a2;
        }
        boolean z12 = true;
        if (charSequence4 == null) {
            t0 t0Var = this.f25558s1;
            if (t0Var != null) {
                org.telegram.ui.Components.c6.release((v0) t0Var.f25432i, (org.telegram.ui.Components.y5) t0Var.h);
                this.f25558s1 = null;
            }
            this.f25544o1 = r42;
        } else {
            if (this.f25558s1 == null) {
                this.f25558s1 = new t0(this);
            }
            try {
                charSequence4 = Emoji.replaceEmoji(charSequence4, textPaint2.getFontMetricsInt(), r42);
            } catch (Exception unused) {
            }
            this.f25558s1.a(charSequence4, textPaint2, dp2);
            if (z10 && ((StaticLayout) this.f25558s1.f25430f).getLineCount() > 3) {
                this.f25544o1 = !this.f25541n1;
                this.f25547p1 = ((StaticLayout) this.f25558s1.f25430f).getLineBottom(2);
                this.f25567w1 = new r11(LocaleController.getString(R.string.Gift2CaptionMore), textPaint2.getTextSize() / AndroidUtilities.density, AndroidUtilities.bold());
                int lineBottom = ((StaticLayout) this.f25558s1.f25430f).getLineBottom(2);
                this.f25562u1 = lineBottom;
                this.f25564v1 = lineBottom - ((StaticLayout) this.f25558s1.f25430f).getLineTop(2);
                this.f25560t1 = (int) ((StaticLayout) this.f25558s1.f25430f).getLineRight(2);
            } else {
                this.f25544o1 = r42;
                this.f25550q1.f(true, true);
                this.f25547p1 = r42;
            }
            if (this.f25544o1) {
                int lineEnd = ((StaticLayout) this.f25558s1.f25430f).getLineEnd(2) - 1;
                t0 t0Var2 = this.f25558s1;
                if (lineEnd >= 0) {
                    charSequence4 = charSequence4.subSequence(r42, lineEnd);
                }
                t0Var2.a(charSequence4, textPaint2, dp2);
            }
        }
        if (charSequence3 != null) {
            SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(charSequence3);
            valueOf2.setSpan(new r61(AndroidUtilities.bold()), r42, valueOf2.length(), 33);
            StaticLayout staticLayout = new StaticLayout(valueOf2, (TextPaint) H("paintChatActionText"), i13, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            this.f25570x1 = staticLayout;
            if (!z11 || this.f25544o1) {
                z12 = r42;
            }
            this.f25573y1 = z12;
            this.D1 = R(staticLayout);
        } else {
            this.f25570x1 = null;
            this.f25573y1 = r42;
            this.D1 = 0.0f;
        }
        if (str != null) {
            if (this.Q1 == null) {
                this.Q1 = new CornerPathEffect(AndroidUtilities.dp(5.0f));
            }
            if (this.R1 == null) {
                Path path = new Path();
                this.R1 = path;
                zh.j1.d(path, 1.35f, r42);
            }
            r11 r11Var2 = new r11(str, i10, AndroidUtilities.bold());
            this.S1 = r11Var2;
            r11Var2.f32100p = AndroidUtilities.dp(62.0f);
            return;
        }
        this.R1 = null;
        this.S1 = null;
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
        s0 s0Var;
        TLRPC.Message message;
        MessageObject messageObject;
        int i11;
        float f7;
        int dp = i10 - AndroidUtilities.dp(30.0f);
        if (this.f25526i0) {
            dp -= AndroidUtilities.dp(64.0f);
        }
        if (O()) {
            if (this.f25526i0) {
                f7 = 28.0f;
            } else {
                f7 = 82.0f;
            }
            dp = Math.min(dp - AndroidUtilities.dp(f7), AndroidUtilities.dp(272.0f));
        }
        if (dp >= 0) {
            int i12 = this.f25519f2;
            if (i12 > 0) {
                dp = Math.min(i12, dp);
            }
            int i13 = dp;
            this.f25511d1 = true;
            if (!O() && ((messageObject = this.P0) == null || ((i11 = messageObject.type) != 34 && i11 != 35))) {
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
            if (O()) {
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
            if (O()) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
            StaticLayout staticLayout = new StaticLayout(charSequence2, textPaint2, i13, alignment, 1.0f, 0.0f, false);
            CharSequence charSequence3 = charSequence2;
            this.M = staticLayout;
            this.P = null;
            MessageObject messageObject2 = this.P0;
            if (messageObject2 != null && (message = messageObject2.messageOwner) != null) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
                    TLRPC.TL_messageActionSuggestedPostApproval tL_messageActionSuggestedPostApproval = (TLRPC.TL_messageActionSuggestedPostApproval) messageAction;
                    if (!tL_messageActionSuggestedPostApproval.rejected && !tL_messageActionSuggestedPostApproval.balance_too_low) {
                        this.P = new StaticLayout(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.getString(R.string.SuggestionAgreementReached)), textPaint2.getFontMetricsInt(), false, null, 0, 1.0f, 0), textPaint2, i13, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    }
                }
            }
            if (this.f25556s && (s0Var = this.f25518f1) != null && !s0Var.d()) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f25553r0 = org.telegram.ui.Components.c6.update(0, this, z10, this.f25553r0, this.M);
            this.O = 0;
            this.N = 0;
            this.Q = 0;
            StaticLayout staticLayout2 = this.P;
            if (staticLayout2 != null) {
                int height = staticLayout2.getHeight();
                this.Q = height;
                this.Q = AndroidUtilities.dp(12.0f) + height;
            }
            MessageObject messageObject3 = this.P0;
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
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            this.R = (i10 - this.N) / 2;
            int dp2 = AndroidUtilities.dp(7.0f);
            this.S = dp2;
            if (this.P != null) {
                this.S = org.telegram.messenger.t.D(11.0f, this.Q, dp2);
            }
            if (O()) {
                width = this.N;
            } else {
                width = this.M.getWidth();
            }
            this.T = (i10 - width) / 2;
            this.U = (i10 - i13) / 2;
            Stack stack = this.f25549q0;
            ArrayList arrayList = this.f25546p0;
            stack.addAll(arrayList);
            arrayList.clear();
            if (charSequence3 instanceof Spannable) {
                StaticLayout staticLayout3 = this.M;
                int i15 = this.R;
                xh.g.a(this, staticLayout3, i15, i15 + this.N, (Spannable) charSequence3, stack, arrayList, null);
            }
        }
    }

    public final void y(Canvas canvas, boolean z10) {
        Paint paint;
        Paint paint2;
        org.telegram.ui.ActionBar.u6 u6Var;
        float f7;
        float f10;
        float f11;
        float f12;
        v0 v0Var;
        Paint paint3;
        Paint paint4;
        int i10;
        int i11;
        float f13;
        Canvas canvas2;
        float f14;
        float f15;
        float f16;
        int i12;
        t0 t0Var;
        int i13;
        float dp;
        org.telegram.ui.Wallet.m3 m3Var;
        int dp2;
        float f17;
        int lineCount;
        RectF rectF;
        ArrayList arrayList;
        int i14;
        int i15;
        int i16;
        float f18;
        int i17;
        int i18;
        int i19;
        Paint paint5;
        int i20;
        int i21;
        float f19;
        ArrayList arrayList2;
        org.telegram.ui.ActionBar.u6 u6Var2;
        int i22;
        int i23;
        int i24;
        v0 v0Var2 = this;
        if (!v0Var2.f25556s || ((!v0Var2.J() || z10) && (v0Var2.J() || !z10))) {
            Paint H = v0Var2.H("paintChatActionBackground");
            Paint H2 = v0Var2.H("paintChatActionBackgroundDarken");
            v0Var2.f25557s0 = (TextPaint) v0Var2.H("paintChatActionText");
            int i25 = v0Var2.T0;
            org.telegram.ui.ActionBar.u6 u6Var3 = v0Var2.f25521g1;
            if (i25 >= 0) {
                int w02 = org.telegram.ui.ActionBar.y6.w0(i25, u6Var3);
                if (v0Var2.V0 == null) {
                    Paint paint6 = new Paint(1);
                    v0Var2.V0 = paint6;
                    paint6.setColor(w02);
                    TextPaint textPaint = new TextPaint(1);
                    v0Var2.W0 = textPaint;
                    textPaint.setTypeface(AndroidUtilities.bold());
                    v0Var2.W0.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
                    v0Var2.W0.setColor(org.telegram.ui.ActionBar.y6.w0(v0Var2.U0, u6Var3));
                }
                H = v0Var2.V0;
                v0Var2.f25557s0 = v0Var2.W0;
            }
            boolean z11 = v0Var2.f25511d1;
            Path path = v0Var2.Z0;
            if (z11) {
                v0Var2.f25511d1 = false;
                v0Var2.f25503a1 = v0Var2.getWidth();
                v0Var2.f25505b1 = 0;
                ArrayList arrayList3 = v0Var2.X0;
                arrayList3.clear();
                StaticLayout staticLayout = v0Var2.M;
                if (staticLayout == null) {
                    lineCount = 0;
                } else {
                    lineCount = staticLayout.getLineCount();
                }
                int dp3 = AndroidUtilities.dp(11.0f);
                f10 = 6.0f;
                int dp4 = AndroidUtilities.dp(8.0f);
                f7 = 8.0f;
                int i26 = 0;
                int i27 = 0;
                while (i26 < lineCount) {
                    int ceil = (int) Math.ceil(v0Var2.M.getLineWidth(i26));
                    if (i26 != 0 && (i24 = i27 - ceil) > 0 && i24 <= (dp3 * 1.5f) + dp4) {
                        ceil = i27;
                    }
                    i26 = c3.h0.i(ceil, i26, 1, arrayList3);
                    i27 = ceil;
                }
                f11 = 4.0f;
                f12 = 2.0f;
                for (int i28 = lineCount - 2; i28 >= 0; i28--) {
                    int intValue = ((Integer) arrayList3.get(i28)).intValue();
                    int i29 = i27 - intValue;
                    if (i29 <= 0 || i29 > (dp3 * 1.5f) + dp4) {
                        i27 = intValue;
                    }
                    arrayList3.set(i28, Integer.valueOf(i27));
                }
                int dp5 = AndroidUtilities.dp(4.0f);
                int measuredWidth = v0Var2.getMeasuredWidth() / 2;
                int dp6 = AndroidUtilities.dp(3.0f);
                int dp7 = AndroidUtilities.dp(6.0f);
                int i30 = dp3 - dp6;
                ArrayList arrayList4 = v0Var2.Y0;
                arrayList4.clear();
                path.reset();
                float f20 = measuredWidth;
                path.moveTo(f20, dp5);
                int i31 = i27;
                int i32 = 0;
                int i33 = 0;
                while (true) {
                    rectF = v0Var2.f25508c1;
                    if (i33 >= lineCount) {
                        break;
                    }
                    int i34 = lineCount;
                    int intValue2 = ((Integer) arrayList3.get(i33)).intValue();
                    int lineBottom = v0Var2.M.getLineBottom(i33);
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
                    float f21 = (intValue2 / 2.0f) + f20;
                    if (i33 != i35 && intValue2 < i20 && i33 != 0 && intValue2 < i31) {
                        i21 = dp7;
                    } else {
                        i21 = dp4;
                    }
                    if (i33 == 0 || intValue2 > i31) {
                        f19 = f21;
                        arrayList2 = arrayList3;
                        u6Var2 = u6Var3;
                        rectF.set((f19 - dp6) - dp3, dp5, f19 + i30, (dp3 * 2) + dp5);
                        s();
                        path.arcTo(rectF, -90.0f, 90.0f);
                    } else {
                        f19 = f21;
                        if (intValue2 < i31) {
                            float f22 = f19 + i30;
                            u6Var2 = u6Var3;
                            arrayList2 = arrayList3;
                            rectF.set(f22, dp5, (i21 * 2) + f22, i23 + dp5);
                            s();
                            path.arcTo(rectF, -90.0f, -90.0f);
                        } else {
                            arrayList2 = arrayList3;
                            u6Var2 = u6Var3;
                        }
                    }
                    dp5 += i36;
                    if (i33 != i35 && intValue2 < i20) {
                        dp5 -= AndroidUtilities.dp(3.0f);
                        i36 -= AndroidUtilities.dp(3.0f);
                    }
                    if (i33 != 0 && intValue2 < i31) {
                        dp5 -= AndroidUtilities.dp(3.0f);
                        i36 -= AndroidUtilities.dp(3.0f);
                    }
                    arrayList4.add(Integer.valueOf(i36));
                    if (i33 != i35 && intValue2 <= i20) {
                        if (intValue2 < i20) {
                            float f23 = f19 + i30;
                            rectF.set(f23, dp5 - i22, (i21 * 2) + f23, dp5);
                            s();
                            path.arcTo(rectF, 180.0f, -90.0f);
                        }
                    } else {
                        rectF.set((f19 - dp6) - dp3, dp5 - (dp3 * 2), f19 + i30, dp5);
                        s();
                        path.arcTo(rectF, 0.0f, 90.0f);
                    }
                    i33++;
                    v0Var2 = this;
                    i31 = intValue2;
                    i32 = lineBottom;
                    lineCount = i34;
                    H2 = paint5;
                    H = paint7;
                    u6Var3 = u6Var2;
                    arrayList3 = arrayList2;
                }
                paint = H;
                paint2 = H2;
                ArrayList arrayList5 = arrayList3;
                u6Var = u6Var3;
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
                    float f24 = measuredWidth - (intValue3 / 2);
                    if (i38 != i37 && intValue3 < i15 && i38 != 0 && intValue3 < i14) {
                        i16 = dp7;
                    } else {
                        i16 = dp4;
                    }
                    if (i38 == i37 || intValue3 > i15) {
                        arrayList5 = arrayList;
                        f18 = f24;
                        i17 = i16;
                        rectF.set(f18 - i30, dp5 - (dp3 * 2), f18 + dp6 + dp3, dp5);
                        s();
                        path.arcTo(rectF, 90.0f, 90.0f);
                    } else if (intValue3 < i15) {
                        float f25 = f24 - i30;
                        arrayList5 = arrayList;
                        f18 = f24;
                        i17 = i16;
                        rectF.set(f25 - (i16 * 2), dp5 - i19, f25, dp5);
                        s();
                        path.arcTo(rectF, 90.0f, -90.0f);
                    } else {
                        arrayList5 = arrayList;
                        f18 = f24;
                        i17 = i16;
                    }
                    dp5 -= ((Integer) arrayList4.get(i38)).intValue();
                    if (i38 != 0 && intValue3 <= i14) {
                        if (intValue3 < i14) {
                            float f26 = f18 - i30;
                            rectF.set(f26 - (i17 * 2), dp5, f26, i18 + dp5);
                            s();
                            path.arcTo(rectF, 0.0f, -90.0f);
                        }
                    } else {
                        rectF.set(f18 - i30, dp5, f18 + dp6 + dp3, (dp3 * 2) + dp5);
                        s();
                        path.arcTo(rectF, 180.0f, 90.0f);
                    }
                }
                v0Var = this;
                path.close();
                if (v0Var.O() && !v0Var.P()) {
                    rectF.left = (f20 - (v0Var.N / 2.0f)) - AndroidUtilities.dp(17.0f);
                    rectF.top = dp5;
                    rectF.right = (v0Var.N / 2.0f) + f20 + AndroidUtilities.dp(17.0f);
                    rectF.bottom = AndroidUtilities.dp(28.0f) + dp5 + v0Var.O + v0Var.Q;
                    path.reset();
                    path.addRoundRect(rectF, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), Path.Direction.CW);
                    path.close();
                }
            } else {
                paint = H;
                paint2 = H2;
                u6Var = u6Var3;
                f7 = 8.0f;
                f10 = 6.0f;
                f11 = 4.0f;
                f12 = 2.0f;
                v0Var = v0Var2;
            }
            if (!v0Var.f25566w0) {
                v0Var.f25563v0 = ((ViewGroup) v0Var.getParent()).getMeasuredHeight();
            }
            if (u6Var != null) {
                u6Var.b(v0Var.f25561u0, v0Var.f25559t0 + AndroidUtilities.dp(f11), v0Var.getMeasuredWidth(), v0Var.f25563v0);
            } else {
                org.telegram.ui.ActionBar.y6.q(v0Var.f25561u0, v0Var.f25559t0 + AndroidUtilities.dp(f11), v0Var.getMeasuredWidth(), v0Var.f25563v0);
            }
            float f27 = 0.75f;
            if (!z10 || (v0Var.getAlpha() == 1.0f && !(v0Var instanceof ak))) {
                paint3 = paint2;
                paint4 = paint;
                boolean z12 = v0Var instanceof ak;
                if (z12) {
                    int alpha = paint4.getAlpha();
                    int alpha2 = paint3.getAlpha();
                    float f28 = alpha;
                    if (z12) {
                        f13 = 0.75f;
                    } else {
                        f13 = 1.0f;
                    }
                    paint4.setAlpha((int) (f28 * f13));
                    float f29 = alpha2;
                    if (!z12) {
                        f27 = 1.0f;
                    }
                    paint3.setAlpha((int) (f29 * f27));
                    i10 = alpha;
                    i11 = alpha2;
                } else {
                    i10 = -1;
                    i11 = -1;
                }
            } else {
                i10 = paint.getAlpha();
                i11 = paint2.getAlpha();
                float alpha3 = v0Var.getAlpha() * i10;
                boolean z13 = v0Var instanceof ak;
                if (z13) {
                    f17 = 0.75f;
                } else {
                    f17 = 1.0f;
                }
                paint4 = paint;
                paint4.setAlpha((int) (alpha3 * f17));
                float alpha4 = v0Var.getAlpha() * i11;
                if (!z13) {
                    f27 = 1.0f;
                }
                paint3 = paint2;
                paint3.setAlpha((int) (alpha4 * f27));
            }
            MessageObject messageObject = v0Var.P0;
            Paint paint8 = v0Var.f25509c2;
            if (messageObject == null || !messageObject.isRepostPreview) {
                canvas2 = canvas;
                canvas2.drawPath(path, paint4);
                if (v0Var.J() && paint3.getAlpha() > 0) {
                    canvas2.drawPath(path, paint3);
                }
                if (v0Var.f25506b2 > 0.0f) {
                    int alpha5 = paint8.getAlpha();
                    if (z10) {
                        paint8.setAlpha((int) (v0Var.getAlpha() * alpha5));
                    }
                    canvas2.drawPath(path, paint8);
                    paint8.setAlpha(alpha5);
                }
            } else {
                canvas2 = canvas;
            }
            if (v0Var.L()) {
                int width = v0Var.getWidth();
                v0Var.I0.getClass();
                float dp8 = (width - AndroidUtilities.dp(206.0f)) / f12;
                float walletActionTop = v0Var.getWalletActionTop();
                v0Var.I0.getClass();
                float dp9 = AndroidUtilities.dp(206.0f) + dp8;
                if (v0Var.I0.f36921q0 == null) {
                    dp2 = AndroidUtilities.dp(140.0f);
                    f14 = 140.0f;
                    f15 = 20.0f;
                } else {
                    f14 = 140.0f;
                    f15 = 20.0f;
                    dp2 = AndroidUtilities.dp(150.0f) + ((int) Math.ceil(m3Var.f36921q0.j()));
                }
                RectF rectF2 = v0Var.N0;
                rectF2.set(dp8, walletActionTop, dp9, dp2 + walletActionTop);
                canvas2.save();
                v0Var.I0.c(canvas2, dp8, walletActionTop);
                canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(f15), AndroidUtilities.dp(f15), paint4);
                if (v0Var.J() && paint3.getAlpha() > 0) {
                    canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(f15), AndroidUtilities.dp(f15), paint3);
                }
                f16 = 0.0f;
                if (v0Var.f25506b2 > 0.0f) {
                    int alpha6 = paint8.getAlpha();
                    if (z10) {
                        paint8.setAlpha((int) (v0Var.getAlpha() * alpha6));
                    }
                    canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(f15), AndroidUtilities.dp(f15), paint8);
                    paint8.setAlpha(alpha6);
                }
                canvas2.restore();
            } else {
                f14 = 140.0f;
                f15 = 20.0f;
                f16 = 0.0f;
            }
            MessageObject messageObject2 = v0Var.P0;
            if (v0Var.K()) {
                float dp10 = v0Var.H0.T.f19333f + AndroidUtilities.dp(f7);
                float width2 = (v0Var.getWidth() - dp10) / f12;
                if (v0Var.H0.f4887p) {
                    dp = f16;
                } else {
                    dp = AndroidUtilities.dp(12.0f) + v0Var.S + v0Var.O;
                }
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(width2, dp, dp10 + width2, v0Var.H0.P + dp + AndroidUtilities.dp(f7));
                if (v0Var.M1 == null) {
                    v0Var.M1 = new RectF();
                }
                v0Var.M1.set(rectF3);
                canvas2.drawRoundRect(v0Var.M1, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint4);
                if (v0Var.J()) {
                    canvas2.drawRoundRect(v0Var.M1, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint3);
                }
            } else if (v0Var.O0 != null) {
                float dp11 = AndroidUtilities.dp(174.0f);
                oz0 oz0Var = v0Var.O0;
                oz0Var.getClass();
                int dp12 = AndroidUtilities.dp(f14) + ((int) oz0Var.f31406f.j());
                if (oz0Var.f31408i) {
                    i13 = AndroidUtilities.dp(40.0f);
                } else {
                    i13 = 0;
                }
                float f30 = dp12 + i13;
                float width3 = (v0Var.getWidth() - dp11) / f12;
                if (v0Var.M1 == null) {
                    v0Var.M1 = new RectF();
                }
                v0Var.M1.set(width3, AndroidUtilities.dp(f11), dp11 + width3, AndroidUtilities.dp(f11) + f30);
                canvas2.drawRoundRect(v0Var.M1, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint4);
                if (v0Var.J()) {
                    canvas2.drawRoundRect(v0Var.M1, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint3);
                }
            } else if (v0Var.N(messageObject2)) {
                float width4 = (v0Var.getWidth() - v0Var.f25527i1) / f12;
                float f31 = v0Var.S + v0Var.O;
                if (v0Var.P()) {
                    float dp13 = f31 + AndroidUtilities.dp(f11);
                    AndroidUtilities.rectTmp.set(width4, dp13, v0Var.f25527i1 + width4, v0Var.f25516f + dp13);
                } else {
                    float dp14 = f31 + AndroidUtilities.dp(12.0f);
                    RectF rectF4 = AndroidUtilities.rectTmp;
                    float f32 = v0Var.f25527i1;
                    rectF4.set(width4, dp14, width4 + f32, f32 + dp14 + v0Var.K1);
                }
                if (messageObject2 != null && messageObject2.type == 18 && !v0Var.f25544o1 && (t0Var = v0Var.f25558s1) != null && v0Var.f25547p1 > 0) {
                    RectF rectF5 = AndroidUtilities.rectTmp;
                    rectF5.bottom = ic.a.d(1.0f, v0Var.f25550q1.f28864c, ((StaticLayout) t0Var.f25430f).getHeight() - v0Var.f25547p1, rectF5.bottom);
                }
                if (v0Var.M1 == null) {
                    v0Var.M1 = new RectF();
                }
                v0Var.M1.set(AndroidUtilities.rectTmp);
                if (messageObject2 != null && (((i12 = messageObject2.type) == 33 || i12 == 35) && v0Var.Y1 != null)) {
                    float[] fArr = v0Var.f25525h2;
                    Arrays.fill(fArr, AndroidUtilities.dp(16.0f));
                    float dp15 = AndroidUtilities.dp(f10);
                    fArr[7] = dp15;
                    fArr[6] = dp15;
                    fArr[5] = dp15;
                    fArr[4] = dp15;
                    Path path2 = v0Var.f25522g2;
                    path2.rewind();
                    path2.addRoundRect(v0Var.M1, fArr, Path.Direction.CW);
                    canvas2.drawPath(path2, paint4);
                    if (v0Var.J()) {
                        canvas2.drawPath(path2, paint3);
                    }
                } else {
                    canvas2.drawRoundRect(v0Var.M1, AndroidUtilities.dp(f15), AndroidUtilities.dp(f15), paint4);
                    if (v0Var.J()) {
                        canvas2.drawRoundRect(v0Var.M1, AndroidUtilities.dp(f15), AndroidUtilities.dp(f15), paint3);
                    }
                }
            }
            if (i10 >= 0) {
                paint4.setAlpha(i10);
                paint3.setAlpha(i11);
            }
        }
    }

    public v0(Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        super(context);
        this.f25539n = new xc(this);
        int i10 = UserConfig.selectedAccount;
        this.H = i10;
        di.w7 w7Var = new di.w7(null, false);
        this.f25510d0 = w7Var;
        this.m0 = true;
        this.f25543o0 = new RectF();
        this.f25546p0 = new ArrayList();
        this.f25549q0 = new Stack();
        this.E0 = new bh.y0(this);
        this.N0 = new RectF();
        this.T0 = -1;
        this.U0 = -1;
        this.X0 = new ArrayList();
        this.Y0 = new ArrayList();
        this.Z0 = new Path();
        this.f25508c1 = new RectF();
        this.f25511d1 = true;
        this.f25514e1 = false;
        this.f25541n1 = false;
        this.f25544o1 = false;
        this.f25550q1 = new org.telegram.ui.Components.h6(this, 0L, 320L, ds.h);
        this.f25573y1 = true;
        TextPaint textPaint = new TextPaint(1);
        this.E1 = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.F1 = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.G1 = textPaint3;
        this.J1 = new RadialProgress2(this, null);
        this.N1 = new na(this, 2);
        this.U1 = new Path();
        this.X1 = new ArrayList();
        this.a2 = -1;
        this.f25509c2 = new Paint(1);
        this.f25522g2 = new Path();
        this.f25525h2 = new float[8];
        this.f25528i2 = new float[8];
        this.f25531j2 = new Path();
        this.f25534k2 = new int[]{16842910, 16842919};
        this.f25555r2 = new u0(this);
        w7Var.f9311a = false;
        this.f25556s = z10;
        this.f25521g1 = u6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.I = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.roundMessageSize / 2);
        this.L = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        this.f25565w = DownloadController.getInstance(i10).generateObserverTag();
        textPaint.setTextSize(TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics()));
        textPaint3.setTextSize(TypedValue.applyDimension(1, 15.0f, getResources().getDisplayMetrics()));
        textPaint2.setTextSize(TypedValue.applyDimension(1, 15.0f, getResources().getDisplayMetrics()));
        View view = new View(context);
        this.T1 = view;
        view.setBackground(org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.o1(0.1f, -16777216), 7, AndroidUtilities.dp(16.0f)));
        view.setVisibility(8);
        addView(view);
        tg.w1 w1Var = new tg.w1(10);
        this.V1 = w1Var;
        w1Var.O = 100;
        w1Var.J = false;
        w1Var.M = true;
        w1Var.G = false;
        w1Var.K = true;
        w1Var.H = true;
        w1Var.f49139r = 1;
        w1Var.f49143w = 0.98f;
        w1Var.v = 0.98f;
        w1Var.f49142u = 0.98f;
        w1Var.f49129g = false;
        w1Var.f49136o = 0.0f;
        w1Var.f49144x = 750L;
        w1Var.f49145y = 750;
        w1Var.c();
    }

    @Override
    public final void invalidate(Rect rect) {
        super.invalidate(rect);
        View view = this.v;
        if (view != null) {
            view.invalidate();
        }
        if (!this.f25542n2 || getParent() == null) {
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
        if (!this.f25542n2 || getParent() == null) {
            return;
        }
        View view2 = (View) getParent();
        if (view2.getParent() != null) {
            view2.invalidate();
            ((View) view2.getParent()).invalidate();
        }
    }

    @Override
    public final void b(boolean z10, boolean z11) {
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
