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
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.t11;
import org.telegram.ui.Components.t41;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.uc;
import org.telegram.ui.Components.zx0;
import org.telegram.ui.Components.zz0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.km;
import org.telegram.ui.th;
import org.telegram.ui.u10;
import org.telegram.ui.uj;
public class v0 extends a0 implements DownloadController.FileDownloadProgressListener, NotificationCenter.NotificationCenterDelegate, m4 {
    public static final HashMap f25757f2;
    public boolean A;
    public float A0;
    public RectF A1;
    public boolean B;
    public final jh.j5 B0;
    public final fa B1;
    public boolean C;
    public zx0 C0;
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
    public ih.v1 G0;
    public zz0 G1;
    public final org.telegram.ui.Components.e9 H;
    public int H0;
    public final View H1;
    public StaticLayout I;
    public int I0;
    public final Path I1;
    public int J;
    public Paint J0;
    public final cg.r2 J1;
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
    public final org.telegram.ui.ActionBar.c6 U0;
    public final float[] U1;
    public float V;
    public int V0;
    public final float[] V1;
    public final lh.h7 W;
    public int W0;
    public final Path W1;
    public StaticLayout X0;
    public final int[] X1;
    public Paint Y0;
    public int Y1;
    public zz0 Z0;
    public SpannableStringBuilder Z1;
    public boolean f25758a0;
    public StaticLayout f25759a1;
    public boolean a2;
    public boolean f25760b0;
    public boolean f25761b1;
    public Runnable f25762b2;
    public boolean f25763c0;
    public boolean f25764c1;
    public PorterDuffColorFilter f25765c2;
    public boolean f25766d0;
    public int f25767d1;
    public int f25768d2;
    public boolean f25769e0;
    public final org.telegram.ui.Components.d6 f25770e1;
    public final u0 f25771e2;
    public int f25772f;
    public int f25773f0;
    public u10 f25774f1;
    public boolean f25775g0;
    public cg.p f25776g1;
    public int h;
    public int f25777h0;
    public int f25778h1;
    public boolean f25779i0;
    public int f25780i1;
    public t11 f25781j0;
    public int f25782j1;
    public final RectF f25783k0;
    public zz0 f25784k1;
    public final ArrayList f25785l0;
    public StaticLayout l1;
    public final Stack m0;
    public boolean f25786m1;
    public final uc f25787n;
    public org.telegram.ui.Components.u5 f25788n0;
    public TextPaint f25789n1;
    public TextPaint f25790o0;
    public StaticLayout f25791o1;
    public float f25792p0;
    public float f25793p1;
    public float f25794q0;
    public StaticLayout f25795q1;
    public c90 f25796r;
    public int f25797r0;
    public float f25798r1;
    public final boolean f25799s;
    public boolean f25800s0;
    public final TextPaint f25801s1;
    public ImageLocation f25802t0;
    public final TextPaint f25803t1;
    public float f25804u0;
    public final TextPaint f25805u1;
    public View v;
    public float f25806v0;
    public TLRPC.Document f25807v1;
    public final int f25808w;
    public boolean f25809w0;
    public TLRPC.VideoSize f25810w1;
    public URLSpan f25811x;
    public boolean f25812x0;
    public final RadialProgress2 f25813x1;
    public gh.k f25814y;
    public final kg.r0 f25815y0;
    public int f25816y1;
    public float f25817z0;
    public boolean f25818z1;

    static {
        HashMap hashMap = new HashMap();
        f25757f2 = hashMap;
        u3.c.l(1, hashMap, "1⃣", 3, "2⃣");
        u3.c.l(6, hashMap, "3⃣", 12, "4⃣");
        hashMap.put(24, "5⃣");
    }

    public v0(Context context) {
        this(context, null, false);
    }

    public static float P(StaticLayout staticLayout) {
        float f9 = 0.0f;
        for (int i10 = 0; i10 < staticLayout.getLineCount(); i10++) {
            float ceil = (int) Math.ceil(staticLayout.getLineWidth(i10));
            if (ceil > f9) {
                f9 = ceil;
            }
        }
        return f9;
    }

    private void setStarsPaused(boolean z10) {
        cg.r2 r2Var = this.J1;
        if (z10 == r2Var.f3335g) {
            return;
        }
        r2Var.f3335g = z10;
        if (z10) {
            r2Var.Q = System.currentTimeMillis();
            return;
        }
        for (int i10 = 0; i10 < r2Var.f3341n.size(); i10++) {
            cg.q2 q2Var = (cg.q2) r2Var.f3341n.get(i10);
            q2Var.f3289a = (System.currentTimeMillis() - r2Var.Q) + q2Var.f3289a;
        }
        invalidate();
    }

    public static SpannableStringBuilder x(int i10, String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceArrows(str, false, AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(1.3f), 0.8f, i10));
        spannableStringBuilder.insert(0, (CharSequence) "*");
        spannableStringBuilder.setSpan(new n2(AndroidUtilities.dp(18.0f)), 0, 1, 33);
        if (Build.VERSION.SDK_INT >= 29) {
            android.support.v4.media.session.z.k();
            spannableStringBuilder.setSpan(android.support.v4.media.session.z.f(AndroidUtilities.dp(12.0f)), 0, spannableStringBuilder.length(), 33);
        }
        spannableStringBuilder.setSpan(new AlignmentSpan.Standard(Layout.Alignment.ALIGN_NORMAL), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public final void A(Canvas canvas) {
        ColorFilter colorFilter;
        float f9;
        int i10;
        int i11;
        float f10;
        float f11;
        int i12;
        float dp;
        Canvas canvas2 = canvas;
        canvas2.save();
        float f12 = 2.0f;
        canvas2.translate(this.f25773f0 / 2.0f, getPaddingTop());
        canvas2.save();
        canvas2.translate(this.P, this.O);
        StaticLayout staticLayout = this.I;
        org.telegram.ui.Components.u5 u5Var = this.f25788n0;
        if (staticLayout != null) {
            colorFilter = E(staticLayout.getPaint().getColor());
        } else {
            colorFilter = null;
        }
        org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas2, staticLayout, u5Var, 0.0f, this.f25785l0, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
        canvas2.restore();
        jh.j5 j5Var = this.B0;
        float f13 = 4.0f;
        if (j5Var.d()) {
            canvas2.save();
            float width = (getWidth() - j5Var.Q.f49510e) / 2.0f;
            if (j5Var.f12329p) {
                dp = AndroidUtilities.dp(4.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f) + this.O + this.K;
            }
            canvas2.translate(width, dp);
            j5Var.b(canvas2);
            canvas2.restore();
        }
        canvas2.restore();
        t11 t11Var = this.f25781j0;
        org.telegram.ui.ActionBar.c6 c6Var = this.U0;
        if (t11Var != null) {
            float alpha = getAlpha();
            if (c6Var != null) {
                c6Var.l(this.f25794q0, this.f25792p0 + 0.0f, getMeasuredWidth(), this.f25797r0);
            } else {
                org.telegram.ui.ActionBar.g6.q(this.f25794q0, this.f25792p0 + 0.0f, getMeasuredWidth(), this.f25797r0);
            }
            this.f25781j0.c(canvas, getWidth(), this.f25773f0, 0.0f, 1.0f, alpha, this.f25779i0);
            canvas2 = canvas;
        }
        ArrayList arrayList = this.L1;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (c6Var != null) {
                c6Var.l(this.f25794q0, this.f25792p0 + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.f25797r0);
            } else {
                org.telegram.ui.ActionBar.g6.q(this.f25794q0, this.f25792p0 + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.f25797r0);
            }
            float width2 = (getWidth() - this.W0) / 2.0f;
            float dp2 = AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(4.0f) + this.O + this.K + this.f25772f;
            float dp3 = (this.W0 - AndroidUtilities.dp(4.0f)) / 2.0f;
            int i13 = 0;
            while (i13 < arrayList.size()) {
                e0 e0Var = (e0) arrayList.get(i13);
                float a2 = e0Var.a();
                float dp4 = ((AndroidUtilities.dp(f13) + dp3) * i13) + width2;
                float f14 = dp4 + dp3;
                RectF rectF = this.Q0;
                rectF.set(dp4, dp2, f14, e0Var.f24252f + dp2);
                canvas2.save();
                if (a2 != 1.0f) {
                    f9 = 4.0f;
                    canvas2.scale(a2, a2, rectF.centerX(), rectF.centerY());
                } else {
                    f9 = 4.0f;
                }
                float[] fArr = this.V1;
                Arrays.fill(fArr, AndroidUtilities.dp(Math.min(6.75f, SharedConfig.bubbleRadius)));
                if ((e0Var.f24253g & 9) == 9) {
                    float dp5 = AndroidUtilities.dp(SharedConfig.bubbleRadius);
                    fArr[7] = dp5;
                    fArr[6] = dp5;
                }
                if ((e0Var.f24253g & 10) == 10) {
                    float dp6 = AndroidUtilities.dp(SharedConfig.bubbleRadius);
                    fArr[5] = dp6;
                    fArr[4] = dp6;
                }
                Path path = this.W1;
                path.rewind();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas2.drawPath(path, G("paintChatActionBackground"));
                if (I()) {
                    canvas2.drawPath(path, org.telegram.ui.ActionBar.g6.f23130h2);
                }
                canvas2.save();
                canvas2.clipPath(path);
                z zVar = e0Var.f24264s;
                if (zVar != null) {
                    int i14 = (int) dp2;
                    zVar.setBounds((int) dp4, i14, (int) f14, e0Var.f24252f + i14);
                    e0Var.f24264s.setAlpha(255);
                    e0Var.f24264s.draw(canvas2);
                }
                canvas2.restore();
                canvas2.save();
                if (e0Var.f24265t != null) {
                    i10 = AndroidUtilities.dp(26.0f);
                } else {
                    i10 = 0;
                }
                float l10 = e0Var.h.l();
                if (e0Var.f24265t != null) {
                    i11 = AndroidUtilities.dp(f9);
                } else {
                    i11 = 0;
                }
                float f15 = i10;
                float A = com.google.android.recaptcha.internal.a.A(dp3 - (l10 + i11), f15, f12, dp4);
                Drawable drawable = e0Var.f24265t;
                if (drawable != null) {
                    int i15 = (int) A;
                    f10 = 2.0f;
                    drawable.setBounds(i15, (int) (((e0Var.f24252f - AndroidUtilities.dp(24.0f)) / f12) + dp2), AndroidUtilities.dp(24.0f) + i15, AndroidUtilities.dp(24.0f) + ((int) (((e0Var.f24252f - AndroidUtilities.dp(24.0f)) / 2.0f) + dp2)));
                    Drawable drawable2 = e0Var.f24265t;
                    if (e0Var.f24258m) {
                        i12 = 128;
                    } else {
                        i12 = 255;
                    }
                    drawable2.setAlpha(i12);
                    e0Var.f24265t.draw(canvas2);
                    A += f15;
                } else {
                    f10 = 2.0f;
                }
                e0Var.h.f35473p = Math.max(1, (((int) dp3) - AndroidUtilities.dp(15.0f)) - i10);
                zz0 zz0Var = e0Var.h;
                float dp7 = (AndroidUtilities.dp(40.0f) / f10) + dp2;
                if (e0Var.f24258m) {
                    f11 = 0.5f;
                } else {
                    f11 = 1.0f;
                }
                zz0Var.f(canvas2, A, dp7, f11);
                canvas2.restore();
                canvas2.restore();
                i13++;
                f13 = 4.0f;
                f12 = 2.0f;
            }
        }
    }

    public final void B(Canvas canvas, boolean z10) {
        if (this.f25799s) {
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
        float f9;
        Canvas canvas2;
        float f10 = 1.0f;
        if (z10) {
            f9 = getAlpha();
        } else {
            f9 = 1.0f;
        }
        if (f9 > 0.0f) {
            org.telegram.ui.ActionBar.c6 c6Var = this.U0;
            if (c6Var != null) {
                c6Var.l(this.f25794q0, this.f25792p0 + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.f25797r0);
            } else {
                org.telegram.ui.ActionBar.g6.q(this.f25794q0, this.f25792p0 + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.f25797r0);
            }
            MessageObject messageObject = this.D0;
            if (messageObject != null && messageObject.shouldDrawReactions()) {
                kg.r0 r0Var = this.f25815y0;
                boolean z11 = r0Var.f13832b;
                u0 u0Var = this.f25771e2;
                if (!z11 || (u0Var.f25714b && r0Var.f13840l)) {
                    r0Var.f13831a = 1.0f;
                    int i10 = (f9 > 1.0f ? 1 : (f9 == 1.0f ? 0 : -1));
                    if (i10 < 0) {
                        canvas2 = canvas;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f9 * 255.0f), 31);
                    } else {
                        canvas2 = canvas;
                    }
                    if (u0Var.f25714b) {
                        f10 = u0Var.f25715c;
                    }
                    r0Var.d(canvas2, f10, num);
                    if (i10 < 0) {
                        canvas2.restore();
                    }
                }
            }
        }
    }

    public final void D(km kmVar, Canvas canvas, int i10, Integer num, float f9) {
        kg.r0 r0Var = this.f25815y0;
        if (!r0Var.f13832b) {
            org.telegram.ui.ActionBar.c6 c6Var = this.U0;
            if (c6Var != null) {
                c6Var.l(this.f25794q0, this.f25792p0 + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.f25797r0);
            } else {
                org.telegram.ui.ActionBar.g6.q(this.f25794q0, this.f25792p0 + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.f25797r0);
            }
            r0Var.D = f9;
            r0Var.f(kmVar, canvas, i10, num);
        }
    }

    public final ColorFilter E(int i10) {
        if (i10 != this.f25768d2 || this.f25765c2 == null) {
            this.f25768d2 = i10;
            this.f25765c2 = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        }
        return this.f25765c2;
    }

    public final int F(MessageObject messageObject) {
        int i10;
        int i11 = this.V0;
        int i12 = messageObject.type;
        if (i12 == 37) {
            i11 = AndroidUtilities.dp(52.0f);
        } else if (i12 == 21 || M()) {
            i11 = AndroidUtilities.dp(78.0f);
        }
        if (!L() && (i10 = messageObject.type) != 34 && i10 != 35) {
            return i11;
        }
        return 0;
    }

    public Paint G(String str) {
        Paint paint;
        org.telegram.ui.ActionBar.c6 c6Var = this.U0;
        if (c6Var != null) {
            paint = c6Var.G(str);
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return org.telegram.ui.ActionBar.g6.S0(str);
    }

    public final float H(MessageObject messageObject) {
        MessagesController messagesController;
        String str;
        if (messageObject != null) {
            try {
                if (messageObject.type == 22 && (str = (messagesController = MessagesController.getInstance(this.D)).uploadingWallpaper) != null && TextUtils.equals(messageObject.messageOwner.action.wallpaper.uploadingImage, str)) {
                    return messagesController.uploadingWallpaperInfo.f24033r;
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
            org.telegram.ui.ActionBar.c6 c6Var = this.U0;
            if (c6Var != null) {
                if (c6Var.l0()) {
                    return true;
                }
                return false;
            } else if (org.telegram.ui.ActionBar.g6.a1()) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public final void J() {
        t0 t0Var = this.T0;
        if (t0Var != null && t0Var.f()) {
            super.invalidate();
        } else if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    public final boolean K(MessageObject messageObject) {
        if (messageObject != null) {
            int i10 = messageObject.type;
            if (i10 == 30 || i10 == 18 || i10 == 25 || M()) {
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
        int i10;
        if (!this.B0.d() && this.C0 == null && (i10 = (messageObject = this.D0).type) != 31 && i10 != 37 && i10 != 33 && i10 != 35 && i10 != 34 && i10 != 21 && i10 != 22 && !messageObject.isStoryMention()) {
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

    public final boolean O() {
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

    public final void Q(CharacterStyle characterStyle) {
        if (this.T0 != null && (characterStyle instanceof URLSpan)) {
            String url = ((URLSpan) characterStyle).getURL();
            if (url.startsWith("task")) {
                this.T0.b0(this, this.D0.getReplyMsgId(), Integer.parseInt(url.substring(5)));
                return;
            }
            if (url.startsWith("topic")) {
                URLSpan uRLSpan = this.f25811x;
                if (uRLSpan instanceof a51) {
                    TLObject tLObject = ((a51) uRLSpan).f26675c;
                    if (tLObject instanceof TLRPC.TL_forumTopic) {
                        yf.d.m(this.T0.O0(), -this.T0.a(), (TLRPC.TL_forumTopic) tLObject, 0);
                        return;
                    }
                    return;
                }
            }
            if (url.startsWith("invite")) {
                URLSpan uRLSpan2 = this.f25811x;
                if (uRLSpan2 instanceof a51) {
                    TLObject tLObject2 = ((a51) uRLSpan2).f26675c;
                    if (tLObject2 instanceof TLRPC.TL_chatInviteExported) {
                        this.T0.Q0((TLRPC.TL_chatInviteExported) tLObject2);
                        return;
                    }
                    return;
                }
            }
            if (url.startsWith("game")) {
                this.T0.J(this, this.D0.getReplyMsgId());
            } else if (url.startsWith("http")) {
                ye.d.s(getContext(), url);
            } else {
                this.T0.x1(Long.parseLong(url));
            }
        }
    }

    public final void R() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = new TLRPC.TL_premiumGiftOption();
        MessageObject messageObject = this.D0;
        TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
        tL_premiumGiftOption.amount = messageAction.amount;
        tL_premiumGiftOption.months = messageAction.months;
        tL_premiumGiftOption.currency = messageAction.currency;
        String str = null;
        if (messageObject != null && (messageAction instanceof TLRPC.TL_messageActionGiftCode) && !O()) {
            str = ((TLRPC.TL_messageActionGiftCode) this.D0.messageOwner.action).slug;
        }
        if (this.T0 != null) {
            AndroidUtilities.runOnUIThread(new l3.m(this, tL_premiumGiftOption, str, 28));
        }
    }

    public final void S() {
        TLRPC.Message message;
        MessageObject messageObject = this.D0;
        if (messageObject != null && (message = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            boolean z10 = messageAction instanceof TLRPC.TL_messageActionGiftStars;
            lh.h7 h7Var = this.W;
            if (z10) {
                Context context = getContext();
                TLRPC.Message message2 = this.D0.messageOwner;
                int i10 = message2.date;
                TLRPC.Peer peer = message2.from_id;
                TLRPC.Peer peer2 = message2.peer_id;
                TLRPC.TL_messageActionGiftStars tL_messageActionGiftStars = (TLRPC.TL_messageActionGiftStars) message2.action;
                org.telegram.ui.ActionBar.c6 c6Var = h7Var.J;
                TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
                starsTransaction.title = null;
                starsTransaction.description = null;
                starsTransaction.photo = null;
                TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
                starsTransaction.peer = tL_starsTransactionPeer;
                tL_starsTransactionPeer.peer = peer;
                starsTransaction.date = i10;
                starsTransaction.amount = TL_stars.StarsAmount.ofStars(tL_messageActionGiftStars.stars);
                starsTransaction.f22621id = tL_messageActionGiftStars.transaction_id;
                starsTransaction.gift = true;
                starsTransaction.sent_by = peer;
                starsTransaction.received_by = peer2;
                jh.ia.h1(context, false, 0L, this.D, starsTransaction, c6Var);
            } else if (messageAction instanceof TLRPC.TL_messageActionPrizeStars) {
                Context context2 = getContext();
                TLRPC.Message message3 = this.D0.messageOwner;
                int i11 = message3.date;
                TLRPC.Peer peer3 = message3.from_id;
                TLRPC.Peer peer4 = message3.peer_id;
                TLRPC.TL_messageActionPrizeStars tL_messageActionPrizeStars = (TLRPC.TL_messageActionPrizeStars) message3.action;
                org.telegram.ui.ActionBar.c6 c6Var2 = h7Var.J;
                TL_stars.StarsTransaction starsTransaction2 = new TL_stars.StarsTransaction();
                starsTransaction2.title = null;
                starsTransaction2.description = null;
                starsTransaction2.photo = null;
                TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer2 = new TL_stars.TL_starsTransactionPeer();
                starsTransaction2.peer = tL_starsTransactionPeer2;
                tL_starsTransactionPeer2.peer = tL_messageActionPrizeStars.boost_peer;
                starsTransaction2.date = i11;
                starsTransaction2.amount = TL_stars.StarsAmount.ofStars(tL_messageActionPrizeStars.stars);
                starsTransaction2.f22621id = tL_messageActionPrizeStars.transaction_id;
                starsTransaction2.gift = true;
                starsTransaction2.flags |= 8192;
                starsTransaction2.giveaway_post_id = tL_messageActionPrizeStars.giveaway_msg_id;
                starsTransaction2.sent_by = peer3;
                starsTransaction2.received_by = peer4;
                jh.ia.h1(context2, false, 0L, this.D, starsTransaction2, c6Var2);
            } else if (messageAction instanceof TLRPC.TL_messageActionGiftTon) {
                Context context3 = getContext();
                TLRPC.Message message4 = this.D0.messageOwner;
                int i12 = message4.date;
                TLRPC.Peer peer5 = message4.from_id;
                TLRPC.Peer peer6 = message4.peer_id;
                TLRPC.TL_messageActionGiftTon tL_messageActionGiftTon = (TLRPC.TL_messageActionGiftTon) message4.action;
                org.telegram.ui.ActionBar.c6 c6Var3 = h7Var.J;
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
                starsTransaction3.f22621id = tL_messageActionGiftTon.transaction_id;
                starsTransaction3.gift = true;
                starsTransaction3.sent_by = peer5;
                starsTransaction3.received_by = peer6;
                jh.ia.h1(context3, false, 0L, this.D, starsTransaction3, c6Var3);
            } else if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                if (!((TLRPC.TL_messageActionStarGift) messageAction).forceIn) {
                    jh.h5 h5Var = new jh.h5(getContext(), this.D, this.D0.getDialogId(), this.U0, null);
                    h5Var.i2(this.D0, null);
                    h5Var.show();
                }
            } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                if (((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift.burned) {
                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                    if (U != null) {
                        j7.l1.v(R.string.UniqueGiftNotFoundBurned, tc.a0(U), R.raw.fire_on, 36);
                        return;
                    }
                    return;
                }
                jh.h5 h5Var2 = new jh.h5(getContext(), this.D, this.D0.getDialogId(), this.U0, null);
                h5Var2.i2(this.D0, null);
                h5Var2.show();
            } else if (messageAction instanceof TLRPC.TL_messageActionSetChatTheme) {
                TLRPC.ChatTheme chatTheme = ((TLRPC.TL_messageActionSetChatTheme) messageAction).theme;
                if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                    TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        jh.h5 h5Var3 = new jh.h5(getContext(), this.D, this.D0.getDialogId(), this.U0, null);
                        h5Var3.h2(starGift.slug, (TL_stars.TL_starGiftUnique) starGift, null);
                        h5Var3.show();
                    }
                }
            }
        }
    }

    public final void T(int i10, boolean z10, boolean z11) {
        String formatDateChat;
        int i11 = this.E0;
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
            this.E0 = i10;
            CharSequence charSequence = this.F0;
            if (charSequence == null || !TextUtils.equals(formatDateChat, charSequence)) {
                this.F0 = formatDateChat;
                this.Z1 = null;
                X(z11);
            }
        }
    }

    public final void U(org.telegram.messenger.MessageObject r38, boolean r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.v0.U(org.telegram.messenger.MessageObject, boolean):void");
    }

    public final void V(int i10, int i11) {
        this.H0 = i10;
        this.I0 = i11;
    }

    public final void W(float f9, int i10) {
        this.f25800s0 = true;
        this.f25797r0 = i10;
        this.f25792p0 = f9;
        this.f25794q0 = 0.0f;
    }

    public final void X(boolean z10) {
        if (getMeasuredWidth() != 0) {
            w(getMeasuredWidth(), this.F0);
            invalidate();
        }
        if (!this.f25809w0) {
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
            if (i10 == NotificationCenter.diceStickersDidLoad && Objects.equals(objArr[0], UserConfig.getInstance(this.D).premiumGiftsStickerPack) && (messageObject = this.D0) != null) {
                U(messageObject, true);
            }
        } else {
            MessageObject messageObject2 = this.D0;
            if (messageObject2 != null) {
                U(messageObject2, true);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.H1) {
            float a2 = this.f25787n.a(0.02f);
            canvas.save();
            canvas.scale(a2, a2, (view.getMeasuredWidth() / 2.0f) + view.getX(), (view.getMeasuredHeight() / 2.0f) + view.getY());
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void f(TLRPC.ReactionCount reactionCount, boolean z10, float f9, float f10) {
        t0 t0Var = this.T0;
        if (t0Var != null) {
            t0Var.t2(this, reactionCount, z10, f9, f10);
        }
    }

    public ImageReceiver getAvatarImage() {
        return null;
    }

    @Override
    public int getBoundsLeft() {
        jh.j5 j5Var = this.B0;
        if (j5Var.d()) {
            int width = ((int) (getWidth() - (j5Var.Q.f49510e + AndroidUtilities.dp(8.0f)))) / 2;
            if (j5Var.f12329p) {
                return width;
            }
            return Math.min(this.O0, width);
        } else if (K(this.D0)) {
            return j7.l1.e(getWidth(), this.W0, 2, this.f25773f0 / 2);
        } else {
            int i10 = this.O0;
            ImageReceiver imageReceiver = this.E;
            if (imageReceiver != null && imageReceiver.getVisible()) {
                i10 = Math.min((int) imageReceiver.getImageX(), i10);
            }
            return (this.f25773f0 / 2) + i10;
        }
    }

    @Override
    public int getBoundsRight() {
        int i10;
        int i11;
        jh.j5 j5Var = this.B0;
        if (j5Var.d()) {
            int dp = ((int) ((j5Var.Q.f49510e + AndroidUtilities.dp(8.0f)) + getWidth())) / 2;
            if (j5Var.f12329p) {
                return dp;
            }
            return Math.max(this.P0, dp);
        }
        if (K(this.D0)) {
            i10 = this.f25773f0 / 2;
            i11 = (getWidth() + this.W0) / 2;
        } else {
            i10 = this.P0;
            ImageReceiver imageReceiver = this.E;
            if (imageReceiver != null && imageReceiver.getVisible()) {
                i10 = Math.max((int) imageReceiver.getImageX2(), i10);
            }
            i11 = this.f25773f0 / 2;
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
        return this.f25808w;
    }

    public ImageReceiver getPhotoImage() {
        return this.E;
    }

    public kg.r0 getReactionsLayout() {
        return this.f25815y0;
    }

    @Override
    public float getSlidingOffsetX() {
        return 0.0f;
    }

    public u0 getTransitionParams() {
        return this.f25771e2;
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
        Runnable runnable = this.f25762b2;
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
            return t0Var.r2(this, this.f25804u0, this.f25806v0);
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
        if (this.f25799s && (t0Var = this.T0) != null && !t0Var.f()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f25788n0 = org.telegram.ui.Components.y5.update(0, this, z10, this.f25788n0, this.I);
        cg.p pVar = this.f25776g1;
        if (pVar != null) {
            pVar.h = org.telegram.ui.Components.y5.update(0, (View) ((v0) pVar.f3257i), false, (org.telegram.ui.Components.u5) pVar.h, (StaticLayout) pVar.f3255f);
        }
        int i10 = this.D;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.didUpdatePremiumGiftStickers);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.didUpdateTonGiftStickers);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starGiftsLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.diceStickersDidLoad);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        MessageObject messageObject = this.D0;
        if (messageObject != null && messageObject.type == 21) {
            U(messageObject, true);
        }
        jh.j5 j5Var = this.B0;
        j5Var.P = true;
        if (j5Var.N != null) {
            j5Var.d.onAttachedToWindow();
            j5Var.f12319e.a();
            j5Var.f12337y.d.onAttachedToWindow();
        }
        kg.r0 r0Var = this.f25815y0;
        ArrayList arrayList = r0Var.v;
        r0Var.G = true;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((kg.o0) arrayList.get(i11)).a();
        }
        t11 t11Var = this.f25781j0;
        if (t11Var != null) {
            t11Var.a();
        }
        zx0 zx0Var = this.C0;
        if (zx0Var != null) {
            zx0Var.d.f34753r0 = zx0Var.f35444b;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.Q1 = false;
        int i10 = this.D;
        DownloadController.getInstance(i10).removeLoadingFileObserver(this);
        this.E.onDetachedFromWindow();
        setStarsPaused(true);
        this.f25809w0 = false;
        org.telegram.ui.Components.y5.release(this, this.f25788n0);
        cg.p pVar = this.f25776g1;
        if (pVar != null) {
            org.telegram.ui.Components.y5.release((v0) pVar.f3257i, (org.telegram.ui.Components.u5) pVar.h);
        }
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.didUpdatePremiumGiftStickers);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.didUpdateTonGiftStickers);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starGiftsLoaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.diceStickersDidLoad);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        this.W.g();
        this.f25771e2.f25713a = false;
        jh.j5 j5Var = this.B0;
        j5Var.P = false;
        j5Var.d.onDetachedFromWindow();
        j5Var.f12319e.b();
        ih.w0 w0Var = j5Var.f12337y;
        w0Var.d.onDetachedFromWindow();
        org.telegram.ui.Components.y5.release((View) null, w0Var.f9479q);
        w0Var.f9479q = null;
        this.f25815y0.q();
        t11 t11Var = this.f25781j0;
        if (t11Var != null) {
            t11Var.b();
        }
        zx0 zx0Var = this.C0;
        if (zx0Var != null) {
            zx0Var.d.f34753r0 = null;
        }
    }

    @Override
    public void onDraw(android.graphics.Canvas r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.v0.onDraw(android.graphics.Canvas):void");
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
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        RectF rectF = this.f25783k0;
        this.H1.layout((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    @Override
    public final void onMeasure(int r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.v0.onMeasure(int, int):void");
    }

    @Override
    public final void onSuccessDownload(String str) {
        TLRPC.PhotoSize photoSize;
        MessageObject messageObject = this.D0;
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
            this.E.setImage(this.f25802t0, "g", ImageLocation.getForObject(photoSize, messageObject.photoThumbsObject), "50_50_b", this.H, 0L, null, messageObject, 1);
            DownloadController.getInstance(this.D).removeLoadingFileObserver(this);
        }
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.v0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void r() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.v0.r():void");
    }

    public final void s() {
        RectF rectF = this.Q0;
        this.O0 = (int) Math.min(this.O0, rectF.left);
        this.P0 = (int) Math.max(this.P0, rectF.right);
    }

    public void setCustomText(CharSequence charSequence) {
        this.F0 = charSequence;
        if (charSequence != null) {
            X(false);
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
        this.f25762b2 = runnable;
    }

    public void setInvalidateWithParent(View view) {
        this.v = view;
    }

    public void setInvalidatesParent(boolean z10) {
        this.a2 = z10;
    }

    public void setMessageObject(MessageObject messageObject) {
        U(messageObject, false);
    }

    public void setOnActionClickListener(View.OnClickListener onClickListener) {
        this.R1 = onClickListener;
    }

    public void setOverrideTextMaxWidth(int i10) {
        this.S1 = i10;
    }

    public void setScrimReaction(Integer num) {
        this.f25815y0.C = num;
    }

    public void setShowTopic(boolean z10) {
        if (this.f25779i0 != z10) {
            this.f25779i0 = z10;
            J();
            invalidate();
        }
    }

    public void setSpoilersSuppressed(boolean z10) {
        ArrayList arrayList = this.f25785l0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((gh.k) obj).invalidateSelf();
        }
    }

    public final boolean t(float f9, int i10) {
        kg.r0 r0Var = this.f25815y0;
        if (!r0Var.K) {
            return false;
        }
        float y8 = getY() + r0Var.d;
        if (y8 <= f9 || (y8 + r0Var.f13843o) - AndroidUtilities.dp(16.0f) >= i10) {
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
        TextPaint textPaint = this.f25801s1;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        TextPaint textPaint2 = this.f25803t1;
        textPaint2.setTextSize(AndroidUtilities.dp(13.0f));
        TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode = (TLRPC.TL_messageActionGiftCode) this.D0.messageOwner.action;
        int i10 = tL_messageActionGiftCode.months;
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
        valueOf.setSpan(new t41(AndroidUtilities.bold()), 0, valueOf.length(), 33);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        this.X0 = new StaticLayout(valueOf, textPaint, dp, alignment, 1.1f, 0.0f, false);
        this.f25759a1 = null;
        this.Z0 = null;
        cg.p pVar = this.f25776g1;
        if (pVar != null) {
            org.telegram.ui.Components.y5.release((v0) pVar.f3257i, (org.telegram.ui.Components.u5) pVar.h);
        }
        cg.p pVar2 = new cg.p(this);
        this.f25776g1 = pVar2;
        pVar2.a(spannableStringBuilder, textPaint2, dp);
        SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(string2);
        valueOf2.setSpan(new t41(AndroidUtilities.bold()), 0, valueOf2.length(), 33);
        this.f25764c1 = false;
        this.f25767d1 = 0;
        this.f25784k1 = null;
        StaticLayout staticLayout = new StaticLayout(valueOf2, (TextPaint) G("paintChatActionText"), dp, alignment, 1.0f, 0.0f, false);
        this.l1 = staticLayout;
        this.f25786m1 = true;
        this.f25798r1 = P(staticLayout);
    }

    public final void v(CharSequence charSequence, SpannableStringBuilder spannableStringBuilder, CharSequence charSequence2, boolean z10, CharSequence charSequence3, int i10, String str, int i11, boolean z11) {
        ?? r42;
        int i12;
        int a2;
        CharSequence charSequence4 = charSequence2;
        int dp = i11 - AndroidUtilities.dp(16.0f);
        MessageObject messageObject = this.D0;
        if (messageObject != null && messageObject.type == 30) {
            dp -= AndroidUtilities.dp(16.0f);
        }
        int i13 = dp;
        if (charSequence != null) {
            MessageObject messageObject2 = this.D0;
            TextPaint textPaint = this.f25801s1;
            if (messageObject2 != null && messageObject2.type == 30) {
                textPaint.setTextSize(AndroidUtilities.dp(14.0f));
            } else {
                textPaint.setTextSize(AndroidUtilities.dp(16.0f));
            }
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
            valueOf.setSpan(new t41(AndroidUtilities.bold()), 0, valueOf.length(), 33);
            r42 = 0;
            this.X0 = new StaticLayout(valueOf, textPaint, i13, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        } else {
            r42 = 0;
            this.X0 = null;
        }
        this.f25759a1 = null;
        if (spannableStringBuilder != null) {
            zz0 zz0Var = new zz0(spannableStringBuilder, 10.0f, null);
            this.Z0 = zz0Var;
            zz0Var.f35460a.linkColor = -1;
        } else {
            this.Z0 = null;
        }
        MessageObject messageObject3 = this.D0;
        TextPaint textPaint2 = this.f25803t1;
        if (messageObject3 != null && messageObject3.type == 35) {
            textPaint2.setTextSize(AndroidUtilities.dp(14.3f));
        } else if (messageObject3 != null && (M() || (i12 = this.D0.type) == 30 || i12 == 18 || i12 == 31 || i12 == 37 || i12 == 33)) {
            textPaint2.setTextSize(AndroidUtilities.dp(13.0f));
        } else {
            textPaint2.setTextSize(AndroidUtilities.dp(15.0f));
        }
        int dp2 = i13 - AndroidUtilities.dp(12.0f);
        MessageObject messageObject4 = this.D0;
        if (messageObject4 != null && messageObject4.type == 22 && messageObject4.getDialogId() >= 0 && (a2 = nh.t3.a(charSequence4, textPaint2)) < dp2 && a2 > dp2 / 5.0f) {
            dp2 = a2;
        }
        boolean z12 = true;
        if (charSequence4 == null) {
            cg.p pVar = this.f25776g1;
            if (pVar != null) {
                org.telegram.ui.Components.y5.release((v0) pVar.f3257i, (org.telegram.ui.Components.u5) pVar.h);
                this.f25776g1 = null;
            }
            this.f25764c1 = r42;
        } else {
            if (this.f25776g1 == null) {
                this.f25776g1 = new cg.p(this);
            }
            try {
                charSequence4 = Emoji.replaceEmoji(charSequence4, textPaint2.getFontMetricsInt(), r42);
            } catch (Exception unused) {
            }
            this.f25776g1.a(charSequence4, textPaint2, dp2);
            if (z10 && ((StaticLayout) this.f25776g1.f3255f).getLineCount() > 3) {
                this.f25764c1 = !this.f25761b1;
                this.f25767d1 = ((StaticLayout) this.f25776g1.f3255f).getLineBottom(2);
                this.f25784k1 = new zz0(LocaleController.getString(R.string.Gift2CaptionMore), textPaint2.getTextSize() / AndroidUtilities.density, AndroidUtilities.bold());
                int lineBottom = ((StaticLayout) this.f25776g1.f3255f).getLineBottom(2);
                this.f25780i1 = lineBottom;
                this.f25782j1 = lineBottom - ((StaticLayout) this.f25776g1.f3255f).getLineTop(2);
                this.f25778h1 = (int) ((StaticLayout) this.f25776g1.f3255f).getLineRight(2);
            } else {
                this.f25764c1 = r42;
                this.f25770e1.f(true, true);
                this.f25767d1 = r42;
            }
            if (this.f25764c1) {
                int lineEnd = ((StaticLayout) this.f25776g1.f3255f).getLineEnd(2) - 1;
                cg.p pVar2 = this.f25776g1;
                if (lineEnd >= 0) {
                    charSequence4 = charSequence4.subSequence(r42, lineEnd);
                }
                pVar2.a(charSequence4, textPaint2, dp2);
            }
        }
        if (charSequence3 != null) {
            SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(charSequence3);
            valueOf2.setSpan(new t41(AndroidUtilities.bold()), r42, valueOf2.length(), 33);
            StaticLayout staticLayout = new StaticLayout(valueOf2, (TextPaint) G("paintChatActionText"), i13, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            this.l1 = staticLayout;
            this.f25786m1 = (!z11 || this.f25764c1) ? false : false;
            this.f25798r1 = P(staticLayout);
        } else {
            this.l1 = null;
            this.f25786m1 = r42;
            this.f25798r1 = 0.0f;
        }
        if (str != null) {
            if (this.E1 == null) {
                this.E1 = new CornerPathEffect(AndroidUtilities.dp(5.0f));
            }
            if (this.F1 == null) {
                Path path = new Path();
                this.F1 = path;
                ih.b2.c(path, 1.35f, r42);
            }
            zz0 zz0Var2 = new zz0(str, i10, AndroidUtilities.bold());
            this.G1 = zz0Var2;
            zz0Var2.f35473p = AndroidUtilities.dp(62.0f);
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
        float f9;
        int dp = i10 - AndroidUtilities.dp(30.0f);
        if (this.f25769e0) {
            dp -= AndroidUtilities.dp(64.0f);
        }
        if (L()) {
            if (this.f25769e0) {
                f9 = 28.0f;
            } else {
                f9 = 82.0f;
            }
            dp = Math.min(dp - AndroidUtilities.dp(f9), AndroidUtilities.dp(272.0f));
        }
        if (dp >= 0) {
            int i12 = this.S1;
            if (i12 > 0) {
                dp = Math.min(i12, dp);
            }
            int i13 = dp;
            this.R0 = true;
            if (!L() && ((messageObject = this.D0) == null || ((i11 = messageObject.type) != 34 && i11 != 35))) {
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
            StaticLayout staticLayout = new StaticLayout(charSequence2, textPaint2, i13, alignment, 1.0f, 0.0f, false);
            CharSequence charSequence3 = charSequence2;
            this.I = staticLayout;
            this.L = null;
            MessageObject messageObject2 = this.D0;
            if (messageObject2 != null && (message = messageObject2.messageOwner) != null) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
                    TLRPC.TL_messageActionSuggestedPostApproval tL_messageActionSuggestedPostApproval = (TLRPC.TL_messageActionSuggestedPostApproval) messageAction;
                    if (!tL_messageActionSuggestedPostApproval.rejected && !tL_messageActionSuggestedPostApproval.balance_too_low) {
                        this.L = new StaticLayout(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.getString(R.string.SuggestionAgreementReached)), textPaint2.getFontMetricsInt(), false, null, 0, 1.0f, 0), textPaint2, i13, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    }
                }
            }
            if (this.f25799s && (t0Var = this.T0) != null && !t0Var.f()) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f25788n0 = org.telegram.ui.Components.y5.update(0, this, z10, this.f25788n0, this.I);
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
                    for (int i14 = 0; i14 < lineCount; i14++) {
                        try {
                            float lineWidth = this.I.getLineWidth(i14);
                            float f10 = i13;
                            if (lineWidth > f10) {
                                lineWidth = f10;
                            }
                            this.K = (int) Math.max(this.K, Math.ceil(this.I.getLineBottom(i14)));
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
            this.N = (i10 - this.J) / 2;
            int dp2 = AndroidUtilities.dp(7.0f);
            this.O = dp2;
            if (this.L != null) {
                this.O = org.telegram.messenger.x3.C(11.0f, this.M, dp2);
            }
            if (L()) {
                width = this.J;
            } else {
                width = this.I.getWidth();
            }
            this.P = (i10 - width) / 2;
            this.Q = (i10 - i13) / 2;
            Stack stack = this.m0;
            ArrayList arrayList = this.f25785l0;
            stack.addAll(arrayList);
            arrayList.clear();
            if (charSequence3 instanceof Spannable) {
                StaticLayout staticLayout3 = this.I;
                int i15 = this.N;
                gh.k.a(this, staticLayout3, i15, i15 + this.J, (Spannable) charSequence3, stack, arrayList, null);
            }
        }
    }

    public final void y(Canvas canvas, boolean z10) {
        Paint paint;
        Paint paint2;
        org.telegram.ui.ActionBar.c6 c6Var;
        float f9;
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
        int i12;
        cg.p pVar;
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
        org.telegram.ui.ActionBar.c6 c6Var2;
        int i22;
        int i23;
        int i24;
        v0 v0Var2 = this;
        if (!v0Var2.f25799s || ((!v0Var2.I() || z10) && (v0Var2.I() || !z10))) {
            Paint G = v0Var2.G("paintChatActionBackground");
            Paint G2 = v0Var2.G("paintChatActionBackgroundDarken");
            v0Var2.f25790o0 = (TextPaint) v0Var2.G("paintChatActionText");
            int i25 = v0Var2.H0;
            org.telegram.ui.ActionBar.c6 c6Var3 = v0Var2.U0;
            if (i25 >= 0) {
                int v02 = org.telegram.ui.ActionBar.g6.v0(i25, c6Var3);
                if (v0Var2.J0 == null) {
                    Paint paint6 = new Paint(1);
                    v0Var2.J0 = paint6;
                    paint6.setColor(v02);
                    TextPaint textPaint = new TextPaint(1);
                    v0Var2.K0 = textPaint;
                    textPaint.setTypeface(AndroidUtilities.bold());
                    v0Var2.K0.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
                    v0Var2.K0.setColor(org.telegram.ui.ActionBar.g6.v0(v0Var2.I0, c6Var3));
                }
                G = v0Var2.J0;
                v0Var2.f25790o0 = v0Var2.K0;
            }
            boolean z11 = v0Var2.R0;
            Path path = v0Var2.N0;
            if (z11) {
                v0Var2.R0 = false;
                v0Var2.O0 = v0Var2.getWidth();
                v0Var2.P0 = 0;
                ArrayList arrayList3 = v0Var2.L0;
                arrayList3.clear();
                StaticLayout staticLayout = v0Var2.I;
                if (staticLayout == null) {
                    lineCount = 0;
                } else {
                    lineCount = staticLayout.getLineCount();
                }
                int dp2 = AndroidUtilities.dp(11.0f);
                f9 = 6.0f;
                int dp3 = AndroidUtilities.dp(8.0f);
                int i26 = 0;
                f10 = 8.0f;
                int i27 = 0;
                while (i26 < lineCount) {
                    int ceil = (int) Math.ceil(v0Var2.I.getLineWidth(i26));
                    if (i26 != 0 && (i24 = i27 - ceil) > 0 && i24 <= (dp2 * 1.5f) + dp3) {
                        ceil = i27;
                    }
                    i26 = th.d(ceil, i26, 1, arrayList3);
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
                int measuredWidth = v0Var2.getMeasuredWidth() / 2;
                int dp5 = AndroidUtilities.dp(3.0f);
                int dp6 = AndroidUtilities.dp(6.0f);
                int i30 = dp2 - dp5;
                ArrayList arrayList4 = v0Var2.M0;
                arrayList4.clear();
                path.reset();
                float f17 = measuredWidth;
                path.moveTo(f17, dp4);
                int i31 = i27;
                int i32 = 0;
                int i33 = 0;
                while (true) {
                    rectF = v0Var2.Q0;
                    if (i33 >= lineCount) {
                        break;
                    }
                    int i34 = lineCount;
                    int intValue2 = ((Integer) arrayList3.get(i33)).intValue();
                    int lineBottom = v0Var2.I.getLineBottom(i33);
                    int i35 = i34 - 1;
                    if (i33 < i35) {
                        paint5 = G2;
                        i20 = ((Integer) arrayList3.get(i33 + 1)).intValue();
                    } else {
                        paint5 = G2;
                        i20 = 0;
                    }
                    int i36 = lineBottom - i32;
                    if (i33 == 0 || intValue2 > i31) {
                        i36 = AndroidUtilities.dp(3.0f) + i36;
                    }
                    if (i33 == i35 || intValue2 > i20) {
                        i36 = AndroidUtilities.dp(3.0f) + i36;
                    }
                    Paint paint7 = G;
                    float f18 = (intValue2 / 2.0f) + f17;
                    if (i33 != i35 && intValue2 < i20 && i33 != 0 && intValue2 < i31) {
                        i21 = dp6;
                    } else {
                        i21 = dp3;
                    }
                    if (i33 == 0 || intValue2 > i31) {
                        f16 = f18;
                        arrayList2 = arrayList3;
                        c6Var2 = c6Var3;
                        rectF.set((f16 - dp5) - dp2, dp4, f16 + i30, (dp2 * 2) + dp4);
                        s();
                        path.arcTo(rectF, -90.0f, 90.0f);
                    } else {
                        f16 = f18;
                        if (intValue2 < i31) {
                            float f19 = f16 + i30;
                            c6Var2 = c6Var3;
                            arrayList2 = arrayList3;
                            rectF.set(f19, dp4, (i21 * 2) + f19, i23 + dp4);
                            s();
                            path.arcTo(rectF, -90.0f, -90.0f);
                        } else {
                            arrayList2 = arrayList3;
                            c6Var2 = c6Var3;
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
                    v0Var2 = this;
                    i31 = intValue2;
                    i32 = lineBottom;
                    lineCount = i34;
                    G2 = paint5;
                    G = paint7;
                    c6Var3 = c6Var2;
                    arrayList3 = arrayList2;
                }
                paint = G;
                paint2 = G2;
                ArrayList arrayList5 = arrayList3;
                c6Var = c6Var3;
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
                    this.I.getLineBottom(i38);
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
                v0Var = this;
                path.close();
                if (v0Var.L() && !v0Var.M()) {
                    rectF.left = (f17 - (v0Var.J / 2.0f)) - AndroidUtilities.dp(17.0f);
                    rectF.top = dp4;
                    rectF.right = (v0Var.J / 2.0f) + f17 + AndroidUtilities.dp(17.0f);
                    rectF.bottom = AndroidUtilities.dp(28.0f) + dp4 + v0Var.K + v0Var.M;
                    path.reset();
                    path.addRoundRect(rectF, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), Path.Direction.CW);
                    path.close();
                }
            } else {
                paint = G;
                paint2 = G2;
                c6Var = c6Var3;
                f9 = 6.0f;
                f10 = 8.0f;
                f11 = 2.0f;
                f12 = 4.0f;
                v0Var = v0Var2;
            }
            if (!v0Var.f25800s0) {
                v0Var.f25797r0 = ((ViewGroup) v0Var.getParent()).getMeasuredHeight();
            }
            if (c6Var != null) {
                c6Var.l(v0Var.f25794q0, v0Var.f25792p0 + AndroidUtilities.dp(f12), v0Var.getMeasuredWidth(), v0Var.f25797r0);
            } else {
                org.telegram.ui.ActionBar.g6.q(v0Var.f25794q0, v0Var.f25792p0 + AndroidUtilities.dp(f12), v0Var.getMeasuredWidth(), v0Var.f25797r0);
            }
            float f24 = 0.75f;
            if (!z10 || (v0Var.getAlpha() == 1.0f && !(v0Var instanceof uj))) {
                paint3 = paint2;
                paint4 = paint;
                boolean z12 = v0Var instanceof uj;
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
                float alpha3 = v0Var.getAlpha() * i10;
                boolean z13 = v0Var instanceof uj;
                if (z13) {
                    f14 = 0.75f;
                } else {
                    f14 = 1.0f;
                }
                paint4 = paint;
                paint4.setAlpha((int) (alpha3 * f14));
                float alpha4 = v0Var.getAlpha() * i11;
                if (!z13) {
                    f24 = 1.0f;
                }
                paint3 = paint2;
                paint3.setAlpha((int) (alpha4 * f24));
            }
            MessageObject messageObject = v0Var.D0;
            if (messageObject == null || !messageObject.isRepostPreview) {
                canvas2 = canvas;
                canvas2.drawPath(path, paint4);
                if (v0Var.I() && paint3.getAlpha() > 0) {
                    canvas2.drawPath(path, paint3);
                }
                if (v0Var.O1 > 0.0f) {
                    Paint paint8 = v0Var.P1;
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
            MessageObject messageObject2 = v0Var.D0;
            jh.j5 j5Var = v0Var.B0;
            if (j5Var.d()) {
                float dp7 = j5Var.Q.f49510e + AndroidUtilities.dp(f10);
                float width = (v0Var.getWidth() - dp7) / f11;
                if (j5Var.f12329p) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(12.0f) + v0Var.O + v0Var.K;
                }
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(width, dp, dp7 + width, j5Var.M + dp + AndroidUtilities.dp(f10));
                if (v0Var.A1 == null) {
                    v0Var.A1 = new RectF();
                }
                v0Var.A1.set(rectF2);
                canvas2.drawRoundRect(v0Var.A1, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint4);
                if (v0Var.I()) {
                    canvas2.drawRoundRect(v0Var.A1, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint3);
                }
            } else if (v0Var.C0 != null) {
                float dp8 = AndroidUtilities.dp(174.0f);
                zx0 zx0Var = v0Var.C0;
                zx0Var.getClass();
                int dp9 = AndroidUtilities.dp(140.0f) + ((int) zx0Var.f35447f.j());
                if (zx0Var.f35449i) {
                    i13 = AndroidUtilities.dp(40.0f);
                } else {
                    i13 = 0;
                }
                float f27 = dp9 + i13;
                float width2 = (v0Var.getWidth() - dp8) / f11;
                if (v0Var.A1 == null) {
                    v0Var.A1 = new RectF();
                }
                v0Var.A1.set(width2, AndroidUtilities.dp(f12), dp8 + width2, AndroidUtilities.dp(f12) + f27);
                canvas2.drawRoundRect(v0Var.A1, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint4);
                if (v0Var.I()) {
                    canvas2.drawRoundRect(v0Var.A1, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint3);
                }
            } else if (v0Var.K(messageObject2)) {
                float width3 = (v0Var.getWidth() - v0Var.W0) / f11;
                float f28 = v0Var.O + v0Var.K;
                if (v0Var.M()) {
                    float dp10 = f28 + AndroidUtilities.dp(f12);
                    AndroidUtilities.rectTmp.set(width3, dp10, v0Var.W0 + width3, v0Var.f25772f + dp10);
                } else {
                    float dp11 = f28 + AndroidUtilities.dp(12.0f);
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    float f29 = v0Var.W0;
                    rectF3.set(width3, dp11, width3 + f29, f29 + dp11 + v0Var.f25816y1);
                }
                if (messageObject2 != null && messageObject2.type == 18 && !v0Var.f25764c1 && (pVar = v0Var.f25776g1) != null && v0Var.f25767d1 > 0) {
                    RectF rectF4 = AndroidUtilities.rectTmp;
                    rectF4.bottom = th.b(1.0f, v0Var.f25770e1.f27666c, ((StaticLayout) pVar.f3255f).getHeight() - v0Var.f25767d1, rectF4.bottom);
                }
                if (v0Var.A1 == null) {
                    v0Var.A1 = new RectF();
                }
                v0Var.A1.set(AndroidUtilities.rectTmp);
                if (messageObject2 != null && (((i12 = messageObject2.type) == 33 || i12 == 35) && v0Var.M1 != null)) {
                    float[] fArr = v0Var.U1;
                    Arrays.fill(fArr, AndroidUtilities.dp(16.0f));
                    float dp12 = AndroidUtilities.dp(f9);
                    fArr[7] = dp12;
                    fArr[6] = dp12;
                    fArr[5] = dp12;
                    fArr[4] = dp12;
                    Path path2 = v0Var.T1;
                    path2.rewind();
                    path2.addRoundRect(v0Var.A1, fArr, Path.Direction.CW);
                    canvas2.drawPath(path2, paint4);
                    if (v0Var.I()) {
                        canvas2.drawPath(path2, paint3);
                    }
                } else {
                    canvas2.drawRoundRect(v0Var.A1, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), paint4);
                    if (v0Var.I()) {
                        canvas2.drawRoundRect(v0Var.A1, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), paint3);
                    }
                }
            }
            if (i10 >= 0) {
                paint4.setAlpha(i10);
                paint3.setAlpha(i11);
            }
        }
    }

    public v0(Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context);
        this.f25787n = new uc(this);
        int i10 = UserConfig.selectedAccount;
        this.D = i10;
        lh.h7 h7Var = new lh.h7(null, false);
        this.W = h7Var;
        this.f25779i0 = true;
        this.f25783k0 = new RectF();
        this.f25785l0 = new ArrayList();
        this.m0 = new Stack();
        this.f25815y0 = new kg.r0(this);
        this.H0 = -1;
        this.I0 = -1;
        this.L0 = new ArrayList();
        this.M0 = new ArrayList();
        this.N0 = new Path();
        this.Q0 = new RectF();
        this.R0 = true;
        this.S0 = false;
        this.f25761b1 = false;
        this.f25764c1 = false;
        this.f25770e1 = new org.telegram.ui.Components.d6(this, 0L, 320L, jr.h);
        this.f25786m1 = true;
        TextPaint textPaint = new TextPaint(1);
        this.f25801s1 = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f25803t1 = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.f25805u1 = textPaint3;
        this.f25813x1 = new RadialProgress2(this, null);
        this.B1 = new fa(this, 2);
        this.I1 = new Path();
        this.L1 = new ArrayList();
        this.P1 = new Paint(1);
        this.T1 = new Path();
        this.U1 = new float[8];
        this.V1 = new float[8];
        this.W1 = new Path();
        this.X1 = new int[]{16842910, 16842919};
        this.f25771e2 = new u0(this);
        h7Var.f15665a = false;
        this.f25799s = z10;
        this.U0 = c6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.E = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.roundMessageSize / 2);
        this.H = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
        this.f25808w = DownloadController.getInstance(i10).generateObserverTag();
        this.B0 = new jh.j5(i10, this, c6Var);
        textPaint.setTextSize(TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics()));
        textPaint3.setTextSize(TypedValue.applyDimension(1, 15.0f, getResources().getDisplayMetrics()));
        textPaint2.setTextSize(TypedValue.applyDimension(1, 15.0f, getResources().getDisplayMetrics()));
        View view = new View(context);
        this.H1 = view;
        view.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.l1(0.1f, -16777216), 7, AndroidUtilities.dp(16.0f)));
        view.setVisibility(8);
        addView(view);
        cg.r2 r2Var = new cg.r2(10);
        this.J1 = r2Var;
        r2Var.N = 100;
        r2Var.J = false;
        r2Var.M = true;
        r2Var.G = false;
        r2Var.K = true;
        r2Var.H = true;
        r2Var.f3345r = 1;
        r2Var.f3349w = 0.98f;
        r2Var.v = 0.98f;
        r2Var.f3348u = 0.98f;
        r2Var.f3335g = false;
        r2Var.f3342o = 0.0f;
        r2Var.f3350x = 750L;
        r2Var.f3351y = 750;
        r2Var.c();
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
    public final void invalidate(int i10, int i11, int i12, int i13) {
        super.invalidate(i10, i11, i12, i13);
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
