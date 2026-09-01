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
import org.telegram.ui.Components.e21;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.k90;
import org.telegram.ui.Components.l01;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.n51;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.rc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.h20;
import org.telegram.ui.pm;
import org.telegram.ui.yh;
import org.telegram.ui.zj;
public class v0 extends a0 implements DownloadController.FileDownloadProgressListener, NotificationCenter.NotificationCenterDelegate, o4 {
    public static final HashMap f24237g2;
    public float A0;
    public boolean A1;
    public boolean B;
    public float B0;
    public RectF B1;
    public boolean C;
    public final mh.i5 C0;
    public final ha C1;
    public boolean D;
    public ly0 D0;
    public boolean D1;
    public final int E;
    public MessageObject E0;
    public ColorMatrixColorFilter E1;
    public final ImageReceiver F;
    public int F0;
    public CornerPathEffect F1;
    public Drawable G;
    public CharSequence G0;
    public Path G1;
    public Path H;
    public lh.u1 H0;
    public l01 H1;
    public final org.telegram.ui.Components.z8 I;
    public int I0;
    public final View I1;
    public StaticLayout J;
    public int J0;
    public final Path J1;
    public int K;
    public Paint K0;
    public final fg.o2 K1;
    public int L;
    public TextPaint L0;
    public int L1;
    public StaticLayout M;
    public final ArrayList M0;
    public final ArrayList M1;
    public int N;
    public final ArrayList N0;
    public BotInlineKeyboard.Source N1;
    public int O;
    public final Path O0;
    public boolean O1;
    public int P;
    public int P0;
    public float P1;
    public int Q;
    public int Q0;
    public final Paint Q1;
    public int R;
    public final RectF R0;
    public boolean R1;
    public int S;
    public boolean S0;
    public View.OnClickListener S1;
    public boolean T;
    public boolean T0;
    public int T1;
    public boolean U;
    public t0 U0;
    public final Path U1;
    public RadialProgressView V;
    public final org.telegram.ui.ActionBar.g6 V0;
    public final float[] V1;
    public float W;
    public int W0;
    public final float[] W1;
    public int X0;
    public final Path X1;
    public StaticLayout Y0;
    public final int[] Y1;
    public Paint Z0;
    public int Z1;
    public final oh.i7 f24238a0;
    public l01 f24239a1;
    public SpannableStringBuilder a2;
    public boolean f24240b0;
    public StaticLayout f24241b1;
    public boolean f24242b2;
    public boolean f24243c0;
    public boolean f24244c1;
    public Runnable f24245c2;
    public boolean f24246d0;
    public boolean f24247d1;
    public PorterDuffColorFilter f24248d2;
    public boolean f24249e0;
    public int f24250e1;
    public int f24251e2;
    public int f24252f;
    public boolean f24253f0;
    public final org.telegram.ui.Components.z5 f24254f1;
    public final u0 f24255f2;
    public int f24256g0;
    public h20 f24257g1;
    public int h;
    public boolean f24258h0;
    public fg.p f24259h1;
    public int f24260i0;
    public int f24261i1;
    public boolean f24262j0;
    public int f24263j1;
    public e21 f24264k0;
    public int f24265k1;
    public final RectF f24266l0;
    public l01 l1;
    public final ArrayList m0;
    public StaticLayout f24267m1;
    public final rc f24268n;
    public final Stack f24269n0;
    public boolean f24270n1;
    public org.telegram.ui.Components.q5 f24271o0;
    public TextPaint f24272o1;
    public TextPaint f24273p0;
    public StaticLayout f24274p1;
    public float f24275q0;
    public float f24276q1;
    public k90 f24277r;
    public float f24278r0;
    public StaticLayout f24279r1;
    public final boolean f24280s;
    public int f24281s0;
    public float f24282s1;
    public boolean f24283t0;
    public final TextPaint f24284t1;
    public ImageLocation f24285u0;
    public final TextPaint f24286u1;
    public View v;
    public float f24287v0;
    public final TextPaint f24288v1;
    public final int f24289w;
    public float f24290w0;
    public TLRPC.Document f24291w1;
    public URLSpan f24292x;
    public boolean f24293x0;
    public TLRPC.VideoSize f24294x1;
    public jh.k f24295y;
    public boolean f24296y0;
    public final RadialProgress2 f24297y1;
    public final ng.r0 f24298z0;
    public int f24299z1;

    static {
        HashMap hashMap = new HashMap();
        f24237g2 = hashMap;
        w.c.l(1, hashMap, "1⃣", 3, "2⃣");
        w.c.l(6, hashMap, "3⃣", 12, "4⃣");
        hashMap.put(24, "5⃣");
    }

    public v0(Context context) {
        this(context, null, false);
    }

    public static float P(StaticLayout staticLayout) {
        float f10 = 0.0f;
        for (int i10 = 0; i10 < staticLayout.getLineCount(); i10++) {
            float ceil = (int) Math.ceil(staticLayout.getLineWidth(i10));
            if (ceil > f10) {
                f10 = ceil;
            }
        }
        return f10;
    }

    private void setStarsPaused(boolean z4) {
        fg.o2 o2Var = this.K1;
        if (z4 == o2Var.f6456g) {
            return;
        }
        o2Var.f6456g = z4;
        if (z4) {
            o2Var.Q = System.currentTimeMillis();
            return;
        }
        for (int i10 = 0; i10 < o2Var.f6462n.size(); i10++) {
            fg.n2 n2Var = (fg.n2) o2Var.f6462n.get(i10);
            n2Var.f6421a = (System.currentTimeMillis() - o2Var.Q) + n2Var.f6421a;
        }
        invalidate();
    }

    public static SpannableStringBuilder x(int i10, String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceArrows(str, false, AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(1.3f), 0.8f, i10));
        spannableStringBuilder.insert(0, (CharSequence) "*");
        spannableStringBuilder.setSpan(new p2(AndroidUtilities.dp(18.0f)), 0, 1, 33);
        if (Build.VERSION.SDK_INT >= 29) {
            android.support.v4.media.session.y.k();
            spannableStringBuilder.setSpan(android.support.v4.media.session.y.f(AndroidUtilities.dp(12.0f)), 0, spannableStringBuilder.length(), 33);
        }
        spannableStringBuilder.setSpan(new AlignmentSpan.Standard(Layout.Alignment.ALIGN_NORMAL), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public final void A(Canvas canvas) {
        ColorFilter colorFilter;
        float f10;
        int i10;
        int i11;
        float f11;
        float f12;
        int i12;
        float dp;
        Canvas canvas2 = canvas;
        canvas2.save();
        float f13 = 2.0f;
        canvas2.translate(this.f24256g0 / 2.0f, getPaddingTop());
        canvas2.save();
        canvas2.translate(this.Q, this.P);
        StaticLayout staticLayout = this.J;
        org.telegram.ui.Components.q5 q5Var = this.f24271o0;
        if (staticLayout != null) {
            colorFilter = E(staticLayout.getPaint().getColor());
        } else {
            colorFilter = null;
        }
        org.telegram.ui.Components.u5.drawAnimatedEmojis(canvas2, staticLayout, q5Var, 0.0f, this.m0, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
        canvas2.restore();
        mh.i5 i5Var = this.C0;
        float f14 = 4.0f;
        if (i5Var.d()) {
            canvas2.save();
            float width = (getWidth() - i5Var.Q.f50510e) / 2.0f;
            if (i5Var.f14247p) {
                dp = AndroidUtilities.dp(4.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f) + this.P + this.L;
            }
            canvas2.translate(width, dp);
            i5Var.b(canvas2);
            canvas2.restore();
        }
        canvas2.restore();
        e21 e21Var = this.f24264k0;
        org.telegram.ui.ActionBar.g6 g6Var = this.V0;
        if (e21Var != null) {
            float alpha = getAlpha();
            if (g6Var != null) {
                g6Var.l(this.f24278r0, this.f24275q0 + 0.0f, getMeasuredWidth(), this.f24281s0);
            } else {
                org.telegram.ui.ActionBar.k6.q(this.f24278r0, this.f24275q0 + 0.0f, getMeasuredWidth(), this.f24281s0);
            }
            this.f24264k0.c(canvas, getWidth(), this.f24256g0, 0.0f, 1.0f, alpha, this.f24262j0);
            canvas2 = canvas;
        }
        ArrayList arrayList = this.M1;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (g6Var != null) {
                g6Var.l(this.f24278r0, this.f24275q0 + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.f24281s0);
            } else {
                org.telegram.ui.ActionBar.k6.q(this.f24278r0, this.f24275q0 + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.f24281s0);
            }
            float width2 = (getWidth() - this.X0) / 2.0f;
            float dp2 = AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(4.0f) + this.P + this.L + this.f24252f;
            float dp3 = (this.X0 - AndroidUtilities.dp(4.0f)) / 2.0f;
            int i13 = 0;
            while (i13 < arrayList.size()) {
                e0 e0Var = (e0) arrayList.get(i13);
                float a2 = e0Var.a();
                float dp4 = ((AndroidUtilities.dp(f14) + dp3) * i13) + width2;
                float f15 = dp4 + dp3;
                RectF rectF = this.R0;
                rectF.set(dp4, dp2, f15, e0Var.f22702f + dp2);
                canvas2.save();
                if (a2 != 1.0f) {
                    f10 = 4.0f;
                    canvas2.scale(a2, a2, rectF.centerX(), rectF.centerY());
                } else {
                    f10 = 4.0f;
                }
                float[] fArr = this.W1;
                Arrays.fill(fArr, AndroidUtilities.dp(Math.min(6.75f, SharedConfig.bubbleRadius)));
                if ((e0Var.f22703g & 9) == 9) {
                    float dp5 = AndroidUtilities.dp(SharedConfig.bubbleRadius);
                    fArr[7] = dp5;
                    fArr[6] = dp5;
                }
                if ((e0Var.f22703g & 10) == 10) {
                    float dp6 = AndroidUtilities.dp(SharedConfig.bubbleRadius);
                    fArr[5] = dp6;
                    fArr[4] = dp6;
                }
                Path path = this.X1;
                path.rewind();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas2.drawPath(path, G("paintChatActionBackground"));
                if (I()) {
                    canvas2.drawPath(path, org.telegram.ui.ActionBar.k6.f21728h2);
                }
                canvas2.save();
                canvas2.clipPath(path);
                z zVar = e0Var.f22714s;
                if (zVar != null) {
                    int i14 = (int) dp2;
                    zVar.setBounds((int) dp4, i14, (int) f15, e0Var.f22702f + i14);
                    e0Var.f22714s.setAlpha(255);
                    e0Var.f22714s.draw(canvas2);
                }
                canvas2.restore();
                canvas2.save();
                if (e0Var.f22715t != null) {
                    i10 = AndroidUtilities.dp(26.0f);
                } else {
                    i10 = 0;
                }
                float l10 = e0Var.h.l();
                if (e0Var.f22715t != null) {
                    i11 = AndroidUtilities.dp(f10);
                } else {
                    i11 = 0;
                }
                float f16 = i10;
                float x10 = e2.c.x(dp3 - (l10 + i11), f16, f13, dp4);
                Drawable drawable = e0Var.f22715t;
                if (drawable != null) {
                    int i15 = (int) x10;
                    f11 = 2.0f;
                    drawable.setBounds(i15, (int) (((e0Var.f22702f - AndroidUtilities.dp(24.0f)) / f13) + dp2), AndroidUtilities.dp(24.0f) + i15, AndroidUtilities.dp(24.0f) + ((int) (((e0Var.f22702f - AndroidUtilities.dp(24.0f)) / 2.0f) + dp2)));
                    Drawable drawable2 = e0Var.f22715t;
                    if (e0Var.f22708m) {
                        i12 = 128;
                    } else {
                        i12 = 255;
                    }
                    drawable2.setAlpha(i12);
                    e0Var.f22715t.draw(canvas2);
                    x10 += f16;
                } else {
                    f11 = 2.0f;
                }
                e0Var.h.f28532p = Math.max(1, (((int) dp3) - AndroidUtilities.dp(15.0f)) - i10);
                l01 l01Var = e0Var.h;
                float dp7 = (AndroidUtilities.dp(40.0f) / f11) + dp2;
                if (e0Var.f22708m) {
                    f12 = 0.5f;
                } else {
                    f12 = 1.0f;
                }
                l01Var.f(canvas2, x10, dp7, f12);
                canvas2.restore();
                canvas2.restore();
                i13++;
                f14 = 4.0f;
                f13 = 2.0f;
            }
        }
    }

    public final void B(Canvas canvas, boolean z4) {
        if (this.f24280s) {
            if (!I() || z4) {
                if (!I() && z4) {
                    return;
                }
            } else {
                return;
            }
        }
        C(canvas, z4, null);
    }

    public final void C(Canvas canvas, boolean z4, Integer num) {
        float f10;
        Canvas canvas2;
        float f11 = 1.0f;
        if (z4) {
            f10 = getAlpha();
        } else {
            f10 = 1.0f;
        }
        if (f10 > 0.0f) {
            org.telegram.ui.ActionBar.g6 g6Var = this.V0;
            if (g6Var != null) {
                g6Var.l(this.f24278r0, this.f24275q0 + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.f24281s0);
            } else {
                org.telegram.ui.ActionBar.k6.q(this.f24278r0, this.f24275q0 + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.f24281s0);
            }
            MessageObject messageObject = this.E0;
            if (messageObject != null && messageObject.shouldDrawReactions()) {
                ng.r0 r0Var = this.f24298z0;
                boolean z10 = r0Var.f16185b;
                u0 u0Var = this.f24255f2;
                if (!z10 || (u0Var.f24184b && r0Var.f16193l)) {
                    r0Var.f16184a = 1.0f;
                    int i10 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
                    if (i10 < 0) {
                        canvas2 = canvas;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f10 * 255.0f), 31);
                    } else {
                        canvas2 = canvas;
                    }
                    if (u0Var.f24184b) {
                        f11 = u0Var.f24185c;
                    }
                    r0Var.d(canvas2, f11, num);
                    if (i10 < 0) {
                        canvas2.restore();
                    }
                }
            }
        }
    }

    public final void D(pm pmVar, Canvas canvas, int i10, Integer num, float f10) {
        ng.r0 r0Var = this.f24298z0;
        if (!r0Var.f16185b) {
            org.telegram.ui.ActionBar.g6 g6Var = this.V0;
            if (g6Var != null) {
                g6Var.l(this.f24278r0, this.f24275q0 + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.f24281s0);
            } else {
                org.telegram.ui.ActionBar.k6.q(this.f24278r0, this.f24275q0 + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.f24281s0);
            }
            r0Var.D = f10;
            r0Var.f(pmVar, canvas, i10, num);
        }
    }

    public final ColorFilter E(int i10) {
        if (i10 != this.f24251e2 || this.f24248d2 == null) {
            this.f24251e2 = i10;
            this.f24248d2 = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        }
        return this.f24248d2;
    }

    public final int F(MessageObject messageObject) {
        int i10;
        int i11 = this.W0;
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

    public Paint G(String str) {
        Paint paint;
        org.telegram.ui.ActionBar.g6 g6Var = this.V0;
        if (g6Var != null) {
            paint = g6Var.F(str);
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return org.telegram.ui.ActionBar.k6.S0(str);
    }

    public final float H(MessageObject messageObject) {
        MessagesController messagesController;
        String str;
        if (messageObject != null) {
            try {
                if (messageObject.type == 22 && (str = (messagesController = MessagesController.getInstance(this.E)).uploadingWallpaper) != null && TextUtils.equals(messageObject.messageOwner.action.wallpaper.uploadingImage, str)) {
                    return messagesController.uploadingWallpaperInfo.f21297r;
                }
                return 1.0f;
            } catch (Exception e6) {
                FileLog.e(e6);
                return 1.0f;
            }
        }
        return 1.0f;
    }

    public final boolean I() {
        if (this.K0 == null) {
            org.telegram.ui.ActionBar.g6 g6Var = this.V0;
            if (g6Var != null) {
                if (g6Var.o0()) {
                    return true;
                }
                return false;
            } else if (org.telegram.ui.ActionBar.k6.a1()) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public final void J() {
        t0 t0Var = this.U0;
        if (t0Var != null && t0Var.e()) {
            super.invalidate();
        } else if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    public final boolean K(MessageObject messageObject) {
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
        MessageObject messageObject = this.E0;
        if (messageObject != null && (message = messageObject.messageOwner) != null && (message.action instanceof TLRPC.TL_messageActionSuggestedPostApproval)) {
            return true;
        }
        return false;
    }

    public final boolean N() {
        MessageObject messageObject;
        int i10;
        if (!this.C0.d() && this.D0 == null && (i10 = (messageObject = this.E0).type) != 31 && i10 != 37 && i10 != 33 && i10 != 35 && i10 != 34 && i10 != 21 && i10 != 22 && !messageObject.isStoryMention()) {
            TLRPC.Message message = this.E0.messageOwner;
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
        MessageObject messageObject = this.E0;
        if (messageObject != null) {
            TLRPC.Message message = messageObject.messageOwner;
            TLRPC.MessageAction messageAction = message.action;
            if (((messageAction instanceof TLRPC.TL_messageActionGiftCode) || (messageAction instanceof TLRPC.TL_messageActionGiftStars)) && (message.from_id instanceof TLRPC.TL_peerUser)) {
                return UserObject.isUserSelf(MessagesController.getInstance(this.E).getUser(Long.valueOf(this.E0.messageOwner.from_id.user_id)));
            }
            return false;
        }
        return false;
    }

    public final void Q(CharacterStyle characterStyle) {
        if (this.U0 != null && (characterStyle instanceof URLSpan)) {
            String url = ((URLSpan) characterStyle).getURL();
            if (url.startsWith("task")) {
                this.U0.j0(this, this.E0.getReplyMsgId(), Integer.parseInt(url.substring(5)));
                return;
            }
            if (url.startsWith("topic")) {
                URLSpan uRLSpan = this.f24292x;
                if (uRLSpan instanceof n51) {
                    TLObject tLObject = ((n51) uRLSpan).f29410c;
                    if (tLObject instanceof TLRPC.TL_forumTopic) {
                        bg.e.m(this.U0.T0(), -this.U0.a(), (TLRPC.TL_forumTopic) tLObject, 0);
                        return;
                    }
                    return;
                }
            }
            if (url.startsWith("invite")) {
                URLSpan uRLSpan2 = this.f24292x;
                if (uRLSpan2 instanceof n51) {
                    TLObject tLObject2 = ((n51) uRLSpan2).f29410c;
                    if (tLObject2 instanceof TLRPC.TL_chatInviteExported) {
                        this.U0.V0((TLRPC.TL_chatInviteExported) tLObject2);
                        return;
                    }
                    return;
                }
            }
            if (url.startsWith("game")) {
                this.U0.I(this, this.E0.getReplyMsgId());
            } else if (url.startsWith("http")) {
                af.g.s(getContext(), url);
            } else {
                this.U0.E1(Long.parseLong(url));
            }
        }
    }

    public final void R() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = new TLRPC.TL_premiumGiftOption();
        MessageObject messageObject = this.E0;
        TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
        tL_premiumGiftOption.amount = messageAction.amount;
        tL_premiumGiftOption.months = messageAction.months;
        tL_premiumGiftOption.currency = messageAction.currency;
        String str = null;
        if (messageObject != null && (messageAction instanceof TLRPC.TL_messageActionGiftCode) && !O()) {
            str = ((TLRPC.TL_messageActionGiftCode) this.E0.messageOwner.action).slug;
        }
        if (this.U0 != null) {
            AndroidUtilities.runOnUIThread(new mh.p6(this, tL_premiumGiftOption, str, 21));
        }
    }

    public final void S() {
        TLRPC.Message message;
        MessageObject messageObject = this.E0;
        if (messageObject != null && (message = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            boolean z4 = messageAction instanceof TLRPC.TL_messageActionGiftStars;
            oh.i7 i7Var = this.f24238a0;
            if (z4) {
                Context context = getContext();
                TLRPC.Message message2 = this.E0.messageOwner;
                int i10 = message2.date;
                TLRPC.Peer peer = message2.from_id;
                TLRPC.Peer peer2 = message2.peer_id;
                TLRPC.TL_messageActionGiftStars tL_messageActionGiftStars = (TLRPC.TL_messageActionGiftStars) message2.action;
                org.telegram.ui.ActionBar.g6 g6Var = i7Var.J;
                TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
                starsTransaction.title = null;
                starsTransaction.description = null;
                starsTransaction.photo = null;
                TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
                starsTransaction.peer = tL_starsTransactionPeer;
                tL_starsTransactionPeer.peer = peer;
                starsTransaction.date = i10;
                starsTransaction.amount = TL_stars.StarsAmount.ofStars(tL_messageActionGiftStars.stars);
                starsTransaction.f21072id = tL_messageActionGiftStars.transaction_id;
                starsTransaction.gift = true;
                starsTransaction.sent_by = peer;
                starsTransaction.received_by = peer2;
                mh.ja.h1(context, false, 0L, this.E, starsTransaction, g6Var);
            } else if (messageAction instanceof TLRPC.TL_messageActionPrizeStars) {
                Context context2 = getContext();
                TLRPC.Message message3 = this.E0.messageOwner;
                int i11 = message3.date;
                TLRPC.Peer peer3 = message3.from_id;
                TLRPC.Peer peer4 = message3.peer_id;
                TLRPC.TL_messageActionPrizeStars tL_messageActionPrizeStars = (TLRPC.TL_messageActionPrizeStars) message3.action;
                org.telegram.ui.ActionBar.g6 g6Var2 = i7Var.J;
                TL_stars.StarsTransaction starsTransaction2 = new TL_stars.StarsTransaction();
                starsTransaction2.title = null;
                starsTransaction2.description = null;
                starsTransaction2.photo = null;
                TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer2 = new TL_stars.TL_starsTransactionPeer();
                starsTransaction2.peer = tL_starsTransactionPeer2;
                tL_starsTransactionPeer2.peer = tL_messageActionPrizeStars.boost_peer;
                starsTransaction2.date = i11;
                starsTransaction2.amount = TL_stars.StarsAmount.ofStars(tL_messageActionPrizeStars.stars);
                starsTransaction2.f21072id = tL_messageActionPrizeStars.transaction_id;
                starsTransaction2.gift = true;
                starsTransaction2.flags |= 8192;
                starsTransaction2.giveaway_post_id = tL_messageActionPrizeStars.giveaway_msg_id;
                starsTransaction2.sent_by = peer3;
                starsTransaction2.received_by = peer4;
                mh.ja.h1(context2, false, 0L, this.E, starsTransaction2, g6Var2);
            } else if (messageAction instanceof TLRPC.TL_messageActionGiftTon) {
                Context context3 = getContext();
                TLRPC.Message message4 = this.E0.messageOwner;
                int i12 = message4.date;
                TLRPC.Peer peer5 = message4.from_id;
                TLRPC.Peer peer6 = message4.peer_id;
                TLRPC.TL_messageActionGiftTon tL_messageActionGiftTon = (TLRPC.TL_messageActionGiftTon) message4.action;
                org.telegram.ui.ActionBar.g6 g6Var3 = i7Var.J;
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
                starsTransaction3.f21072id = tL_messageActionGiftTon.transaction_id;
                starsTransaction3.gift = true;
                starsTransaction3.sent_by = peer5;
                starsTransaction3.received_by = peer6;
                mh.ja.h1(context3, false, 0L, this.E, starsTransaction3, g6Var3);
            } else if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                if (!((TLRPC.TL_messageActionStarGift) messageAction).forceIn) {
                    mh.g5 g5Var = new mh.g5(getContext(), this.E, this.E0.getDialogId(), this.V0, null);
                    g5Var.i2(this.E0, null);
                    g5Var.show();
                }
            } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                if (((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift.burned) {
                    org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                    if (U != null) {
                        l.d.v(R.string.UniqueGiftNotFoundBurned, qc.a0(U), R.raw.fire_on, 36);
                        return;
                    }
                    return;
                }
                mh.g5 g5Var2 = new mh.g5(getContext(), this.E, this.E0.getDialogId(), this.V0, null);
                g5Var2.i2(this.E0, null);
                g5Var2.show();
            } else if (messageAction instanceof TLRPC.TL_messageActionSetChatTheme) {
                TLRPC.ChatTheme chatTheme = ((TLRPC.TL_messageActionSetChatTheme) messageAction).theme;
                if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                    TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        mh.g5 g5Var3 = new mh.g5(getContext(), this.E, this.E0.getDialogId(), this.V0, null);
                        g5Var3.h2(starGift.slug, (TL_stars.TL_starGiftUnique) starGift, null);
                        g5Var3.show();
                    }
                }
            }
        }
    }

    public final void T(int i10, boolean z4, boolean z10) {
        String formatDateChat;
        int i11 = this.F0;
        if (i11 != i10 && i11 / 3600 != i10 / 3600) {
            if (z4) {
                if (i10 == 2147483646) {
                    formatDateChat = LocaleController.getString("MessageScheduledUntilOnline", R.string.MessageScheduledUntilOnline);
                } else {
                    formatDateChat = LocaleController.formatString("MessageScheduledOn", R.string.MessageScheduledOn, LocaleController.formatDateChat(i10));
                }
            } else {
                formatDateChat = LocaleController.formatDateChat(i10);
            }
            this.F0 = i10;
            CharSequence charSequence = this.G0;
            if (charSequence == null || !TextUtils.equals(formatDateChat, charSequence)) {
                this.G0 = formatDateChat;
                this.a2 = null;
                X(z10);
            }
        }
    }

    public final void U(org.telegram.messenger.MessageObject r38, boolean r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.v0.U(org.telegram.messenger.MessageObject, boolean):void");
    }

    public final void V(int i10, int i11) {
        this.I0 = i10;
        this.J0 = i11;
    }

    public final void W(float f10, int i10) {
        this.f24283t0 = true;
        this.f24281s0 = i10;
        this.f24275q0 = f10;
        this.f24278r0 = 0.0f;
    }

    public final void X(boolean z4) {
        if (getMeasuredWidth() != 0) {
            w(getMeasuredWidth(), this.G0);
            invalidate();
        }
        if (!this.f24293x0) {
            if (z4) {
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
            if (i10 == NotificationCenter.diceStickersDidLoad && Objects.equals(objArr[0], UserConfig.getInstance(this.E).premiumGiftsStickerPack) && (messageObject = this.E0) != null) {
                U(messageObject, true);
            }
        } else {
            MessageObject messageObject2 = this.E0;
            if (messageObject2 != null) {
                U(messageObject2, true);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.I1) {
            float a2 = this.f24268n.a(0.02f);
            canvas.save();
            canvas.scale(a2, a2, (view.getMeasuredWidth() / 2.0f) + view.getX(), (view.getMeasuredHeight() / 2.0f) + view.getY());
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void f(TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
        t0 t0Var = this.U0;
        if (t0Var != null) {
            t0Var.D2(this, reactionCount, z4, f10, f11);
        }
    }

    public ImageReceiver getAvatarImage() {
        return null;
    }

    @Override
    public int getBoundsLeft() {
        mh.i5 i5Var = this.C0;
        if (i5Var.d()) {
            int width = ((int) (getWidth() - (i5Var.Q.f50510e + AndroidUtilities.dp(8.0f)))) / 2;
            if (i5Var.f14247p) {
                return width;
            }
            return Math.min(this.P0, width);
        } else if (K(this.E0)) {
            return l.d.d(getWidth(), this.X0, 2, this.f24256g0 / 2);
        } else {
            int i10 = this.P0;
            ImageReceiver imageReceiver = this.F;
            if (imageReceiver != null && imageReceiver.getVisible()) {
                i10 = Math.min((int) imageReceiver.getImageX(), i10);
            }
            return (this.f24256g0 / 2) + i10;
        }
    }

    @Override
    public int getBoundsRight() {
        int i10;
        int i11;
        mh.i5 i5Var = this.C0;
        if (i5Var.d()) {
            int dp = ((int) ((i5Var.Q.f50510e + AndroidUtilities.dp(8.0f)) + getWidth())) / 2;
            if (i5Var.f14247p) {
                return dp;
            }
            return Math.max(this.Q0, dp);
        }
        if (K(this.E0)) {
            i10 = this.f24256g0 / 2;
            i11 = (getWidth() + this.X0) / 2;
        } else {
            i10 = this.Q0;
            ImageReceiver imageReceiver = this.F;
            if (imageReceiver != null && imageReceiver.getVisible()) {
                i10 = Math.max((int) imageReceiver.getImageX2(), i10);
            }
            i11 = this.f24256g0 / 2;
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
        return this.F0;
    }

    public t0 getDelegate() {
        return this.U0;
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
        return this.E0;
    }

    @Override
    public int getObserverTag() {
        return this.f24289w;
    }

    public ImageReceiver getPhotoImage() {
        return this.F;
    }

    public ng.r0 getReactionsLayout() {
        return this.f24298z0;
    }

    @Override
    public float getSlidingOffsetX() {
        return 0.0f;
    }

    public u0 getTransitionParams() {
        return this.f24255f2;
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
        Runnable runnable = this.f24245c2;
        if (runnable != null) {
            runnable.run();
        }
        if (!this.f24242b2 || getParent() == null) {
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
        t0 t0Var = this.U0;
        if (t0Var != null) {
            return t0Var.A2(this, this.f24287v0, this.f24290w0);
        }
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        boolean z4;
        t0 t0Var;
        super.onAttachedToWindow();
        this.R1 = true;
        this.F.onAttachedToWindow();
        setStarsPaused(false);
        if (this.f24280s && (t0Var = this.U0) != null && !t0Var.e()) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f24271o0 = org.telegram.ui.Components.u5.update(0, this, z4, this.f24271o0, this.J);
        fg.p pVar = this.f24259h1;
        if (pVar != null) {
            pVar.h = org.telegram.ui.Components.u5.update(0, (View) ((v0) pVar.f6480i), false, (org.telegram.ui.Components.q5) pVar.h, (StaticLayout) pVar.f6478f);
        }
        int i10 = this.E;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.didUpdatePremiumGiftStickers);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.didUpdateTonGiftStickers);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starGiftsLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.diceStickersDidLoad);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        MessageObject messageObject = this.E0;
        if (messageObject != null && messageObject.type == 21) {
            U(messageObject, true);
        }
        mh.i5 i5Var = this.C0;
        i5Var.P = true;
        if (i5Var.N != null) {
            i5Var.d.onAttachedToWindow();
            i5Var.f14237e.a();
            i5Var.f14255y.d.onAttachedToWindow();
        }
        ng.r0 r0Var = this.f24298z0;
        ArrayList arrayList = r0Var.v;
        r0Var.G = true;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((ng.o0) arrayList.get(i11)).a();
        }
        e21 e21Var = this.f24264k0;
        if (e21Var != null) {
            e21Var.a();
        }
        ly0 ly0Var = this.D0;
        if (ly0Var != null) {
            ly0Var.d.f27835s0 = ly0Var.f28852b;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.R1 = false;
        int i10 = this.E;
        DownloadController.getInstance(i10).removeLoadingFileObserver(this);
        this.F.onDetachedFromWindow();
        setStarsPaused(true);
        this.f24293x0 = false;
        org.telegram.ui.Components.u5.release(this, this.f24271o0);
        fg.p pVar = this.f24259h1;
        if (pVar != null) {
            org.telegram.ui.Components.u5.release((v0) pVar.f6480i, (org.telegram.ui.Components.q5) pVar.h);
        }
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.didUpdatePremiumGiftStickers);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.didUpdateTonGiftStickers);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starGiftsLoaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.diceStickersDidLoad);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        this.f24238a0.g();
        this.f24255f2.f24183a = false;
        mh.i5 i5Var = this.C0;
        i5Var.P = false;
        i5Var.d.onDetachedFromWindow();
        i5Var.f14237e.b();
        lh.v0 v0Var = i5Var.f14255y;
        v0Var.d.onDetachedFromWindow();
        org.telegram.ui.Components.u5.release((View) null, v0Var.f13040q);
        v0Var.f13040q = null;
        this.f24298z0.q();
        e21 e21Var = this.f24264k0;
        if (e21Var != null) {
            e21Var.b();
        }
        ly0 ly0Var = this.D0;
        if (ly0Var != null) {
            ly0Var.d.f27835s0 = null;
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
        MessageObject messageObject = this.E0;
        if (TextUtils.isEmpty(this.G0) && messageObject == null) {
            return;
        }
        if (this.a2 == null) {
            if (!TextUtils.isEmpty(this.G0)) {
                charSequence = this.G0;
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
            this.a2 = spannableStringBuilder;
        }
        if (Build.VERSION.SDK_INT < 24) {
            accessibilityNodeInfo.setContentDescription(this.a2.toString());
        } else {
            accessibilityNodeInfo.setText(this.a2);
        }
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        RectF rectF = this.f24266l0;
        this.I1.layout((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    @Override
    public final void onMeasure(int r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.v0.onMeasure(int, int):void");
    }

    @Override
    public final void onSuccessDownload(String str) {
        TLRPC.PhotoSize photoSize;
        MessageObject messageObject = this.E0;
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
            this.F.setImage(this.f24285u0, "g", ImageLocation.getForObject(photoSize, messageObject.photoThumbsObject), "50_50_b", this.I, 0L, null, messageObject, 1);
            DownloadController.getInstance(this.E).removeLoadingFileObserver(this);
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
        RectF rectF = this.R0;
        this.P0 = (int) Math.min(this.P0, rectF.left);
        this.Q0 = (int) Math.max(this.Q0, rectF.right);
    }

    public void setCustomText(CharSequence charSequence) {
        this.G0 = charSequence;
        if (charSequence != null) {
            X(false);
        }
    }

    public void setDelegate(t0 t0Var) {
        this.U0 = t0Var;
    }

    public void setInvalidateColors(boolean z4) {
        if (this.T0 == z4) {
            return;
        }
        this.T0 = z4;
        invalidate();
    }

    public void setInvalidateListener(Runnable runnable) {
        this.f24245c2 = runnable;
    }

    public void setInvalidateWithParent(View view) {
        this.v = view;
    }

    public void setInvalidatesParent(boolean z4) {
        this.f24242b2 = z4;
    }

    public void setMessageObject(MessageObject messageObject) {
        U(messageObject, false);
    }

    public void setOnActionClickListener(View.OnClickListener onClickListener) {
        this.S1 = onClickListener;
    }

    public void setOverrideTextMaxWidth(int i10) {
        this.T1 = i10;
    }

    public void setScrimReaction(Integer num) {
        this.f24298z0.C = num;
    }

    public void setShowTopic(boolean z4) {
        if (this.f24262j0 != z4) {
            this.f24262j0 = z4;
            J();
            invalidate();
        }
    }

    public void setSpoilersSuppressed(boolean z4) {
        ArrayList arrayList = this.m0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((jh.k) obj).invalidateSelf();
        }
    }

    public final boolean t(float f10, int i10) {
        ng.r0 r0Var = this.f24298z0;
        if (!r0Var.K) {
            return false;
        }
        float y10 = getY() + r0Var.d;
        if (y10 <= f10 || (y10 + r0Var.f16196o) - AndroidUtilities.dp(16.0f) >= i10) {
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
        int dp = this.X0 - AndroidUtilities.dp(16.0f);
        TextPaint textPaint = this.f24284t1;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        TextPaint textPaint2 = this.f24286u1;
        textPaint2.setTextSize(AndroidUtilities.dp(13.0f));
        TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode = (TLRPC.TL_messageActionGiftCode) this.E0.messageOwner.action;
        int i10 = tL_messageActionGiftCode.months;
        TLRPC.Chat chat = MessagesController.getInstance(this.E).getChat(Long.valueOf(-DialogObject.getPeerDialogId(tL_messageActionGiftCode.boost_peer)));
        if (chat == null) {
            str = null;
        } else {
            str = chat.title;
        }
        boolean z4 = tL_messageActionGiftCode.via_giveaway;
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
        if (z4) {
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
        valueOf.setSpan(new g51(AndroidUtilities.bold()), 0, valueOf.length(), 33);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        this.Y0 = new StaticLayout(valueOf, textPaint, dp, alignment, 1.1f, 0.0f, false);
        this.f24241b1 = null;
        this.f24239a1 = null;
        fg.p pVar = this.f24259h1;
        if (pVar != null) {
            org.telegram.ui.Components.u5.release((v0) pVar.f6480i, (org.telegram.ui.Components.q5) pVar.h);
        }
        fg.p pVar2 = new fg.p(this);
        this.f24259h1 = pVar2;
        pVar2.a(spannableStringBuilder, textPaint2, dp);
        SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(string2);
        valueOf2.setSpan(new g51(AndroidUtilities.bold()), 0, valueOf2.length(), 33);
        this.f24247d1 = false;
        this.f24250e1 = 0;
        this.l1 = null;
        StaticLayout staticLayout = new StaticLayout(valueOf2, (TextPaint) G("paintChatActionText"), dp, alignment, 1.0f, 0.0f, false);
        this.f24267m1 = staticLayout;
        this.f24270n1 = true;
        this.f24282s1 = P(staticLayout);
    }

    public final void v(CharSequence charSequence, SpannableStringBuilder spannableStringBuilder, CharSequence charSequence2, boolean z4, CharSequence charSequence3, int i10, String str, int i11, boolean z10) {
        ?? r42;
        int i12;
        int a2;
        CharSequence charSequence4 = charSequence2;
        int dp = i11 - AndroidUtilities.dp(16.0f);
        MessageObject messageObject = this.E0;
        if (messageObject != null && messageObject.type == 30) {
            dp -= AndroidUtilities.dp(16.0f);
        }
        int i13 = dp;
        if (charSequence != null) {
            MessageObject messageObject2 = this.E0;
            TextPaint textPaint = this.f24284t1;
            if (messageObject2 != null && messageObject2.type == 30) {
                textPaint.setTextSize(AndroidUtilities.dp(14.0f));
            } else {
                textPaint.setTextSize(AndroidUtilities.dp(16.0f));
            }
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
            valueOf.setSpan(new g51(AndroidUtilities.bold()), 0, valueOf.length(), 33);
            r42 = 0;
            this.Y0 = new StaticLayout(valueOf, textPaint, i13, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        } else {
            r42 = 0;
            this.Y0 = null;
        }
        this.f24241b1 = null;
        if (spannableStringBuilder != null) {
            l01 l01Var = new l01(spannableStringBuilder, 10.0f, null);
            this.f24239a1 = l01Var;
            l01Var.f28519a.linkColor = -1;
        } else {
            this.f24239a1 = null;
        }
        MessageObject messageObject3 = this.E0;
        TextPaint textPaint2 = this.f24286u1;
        if (messageObject3 != null && messageObject3.type == 35) {
            textPaint2.setTextSize(AndroidUtilities.dp(14.3f));
        } else if (messageObject3 != null && (N() || (i12 = this.E0.type) == 30 || i12 == 18 || i12 == 31 || i12 == 37 || i12 == 33)) {
            textPaint2.setTextSize(AndroidUtilities.dp(13.0f));
        } else {
            textPaint2.setTextSize(AndroidUtilities.dp(15.0f));
        }
        int dp2 = i13 - AndroidUtilities.dp(12.0f);
        MessageObject messageObject4 = this.E0;
        if (messageObject4 != null && messageObject4.type == 22 && messageObject4.getDialogId() >= 0 && (a2 = qh.f3.a(charSequence4, textPaint2)) < dp2 && a2 > dp2 / 5.0f) {
            dp2 = a2;
        }
        boolean z11 = true;
        if (charSequence4 == null) {
            fg.p pVar = this.f24259h1;
            if (pVar != null) {
                org.telegram.ui.Components.u5.release((v0) pVar.f6480i, (org.telegram.ui.Components.q5) pVar.h);
                this.f24259h1 = null;
            }
            this.f24247d1 = r42;
        } else {
            if (this.f24259h1 == null) {
                this.f24259h1 = new fg.p(this);
            }
            try {
                charSequence4 = Emoji.replaceEmoji(charSequence4, textPaint2.getFontMetricsInt(), r42);
            } catch (Exception unused) {
            }
            this.f24259h1.a(charSequence4, textPaint2, dp2);
            if (z4 && ((StaticLayout) this.f24259h1.f6478f).getLineCount() > 3) {
                this.f24247d1 = !this.f24244c1;
                this.f24250e1 = ((StaticLayout) this.f24259h1.f6478f).getLineBottom(2);
                this.l1 = new l01(LocaleController.getString(R.string.Gift2CaptionMore), textPaint2.getTextSize() / AndroidUtilities.density, AndroidUtilities.bold());
                int lineBottom = ((StaticLayout) this.f24259h1.f6478f).getLineBottom(2);
                this.f24263j1 = lineBottom;
                this.f24265k1 = lineBottom - ((StaticLayout) this.f24259h1.f6478f).getLineTop(2);
                this.f24261i1 = (int) ((StaticLayout) this.f24259h1.f6478f).getLineRight(2);
            } else {
                this.f24247d1 = r42;
                this.f24254f1.f(true, true);
                this.f24250e1 = r42;
            }
            if (this.f24247d1) {
                int lineEnd = ((StaticLayout) this.f24259h1.f6478f).getLineEnd(2) - 1;
                fg.p pVar2 = this.f24259h1;
                if (lineEnd >= 0) {
                    charSequence4 = charSequence4.subSequence(r42, lineEnd);
                }
                pVar2.a(charSequence4, textPaint2, dp2);
            }
        }
        if (charSequence3 != null) {
            SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(charSequence3);
            valueOf2.setSpan(new g51(AndroidUtilities.bold()), r42, valueOf2.length(), 33);
            StaticLayout staticLayout = new StaticLayout(valueOf2, (TextPaint) G("paintChatActionText"), i13, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            this.f24267m1 = staticLayout;
            this.f24270n1 = (!z10 || this.f24247d1) ? false : false;
            this.f24282s1 = P(staticLayout);
        } else {
            this.f24267m1 = null;
            this.f24270n1 = r42;
            this.f24282s1 = 0.0f;
        }
        if (str != null) {
            if (this.F1 == null) {
                this.F1 = new CornerPathEffect(AndroidUtilities.dp(5.0f));
            }
            if (this.G1 == null) {
                Path path = new Path();
                this.G1 = path;
                lh.a2.c(path, 1.35f, r42);
            }
            l01 l01Var2 = new l01(str, i10, AndroidUtilities.bold());
            this.H1 = l01Var2;
            l01Var2.f28532p = AndroidUtilities.dp(62.0f);
            return;
        }
        this.G1 = null;
        this.H1 = null;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.G && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public final void w(int i10, CharSequence charSequence) {
        TextPaint textPaint;
        CharSequence charSequence2;
        Layout.Alignment alignment;
        boolean z4;
        int width;
        t0 t0Var;
        TLRPC.Message message;
        MessageObject messageObject;
        int i11;
        float f10;
        int dp = i10 - AndroidUtilities.dp(30.0f);
        if (this.f24253f0) {
            dp -= AndroidUtilities.dp(64.0f);
        }
        if (M()) {
            if (this.f24253f0) {
                f10 = 28.0f;
            } else {
                f10 = 82.0f;
            }
            dp = Math.min(dp - AndroidUtilities.dp(f10), AndroidUtilities.dp(272.0f));
        }
        if (dp >= 0) {
            int i12 = this.T1;
            if (i12 > 0) {
                dp = Math.min(i12, dp);
            }
            int i13 = dp;
            this.S0 = true;
            if (!M() && ((messageObject = this.E0) == null || ((i11 = messageObject.type) != 34 && i11 != 35))) {
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
            this.J = staticLayout;
            this.M = null;
            MessageObject messageObject2 = this.E0;
            if (messageObject2 != null && (message = messageObject2.messageOwner) != null) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
                    TLRPC.TL_messageActionSuggestedPostApproval tL_messageActionSuggestedPostApproval = (TLRPC.TL_messageActionSuggestedPostApproval) messageAction;
                    if (!tL_messageActionSuggestedPostApproval.rejected && !tL_messageActionSuggestedPostApproval.balance_too_low) {
                        this.M = new StaticLayout(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.getString(R.string.SuggestionAgreementReached)), textPaint2.getFontMetricsInt(), false, null, 0, 1.0f, 0), textPaint2, i13, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    }
                }
            }
            if (this.f24280s && (t0Var = this.U0) != null && !t0Var.e()) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.f24271o0 = org.telegram.ui.Components.u5.update(0, this, z4, this.f24271o0, this.J);
            this.L = 0;
            this.K = 0;
            this.N = 0;
            StaticLayout staticLayout2 = this.M;
            if (staticLayout2 != null) {
                int height = staticLayout2.getHeight();
                this.N = height;
                this.N = AndroidUtilities.dp(12.0f) + height;
            }
            MessageObject messageObject3 = this.E0;
            if (messageObject3 == null || !messageObject3.isRepostPreview) {
                try {
                    int lineCount = this.J.getLineCount();
                    for (int i14 = 0; i14 < lineCount; i14++) {
                        try {
                            float lineWidth = this.J.getLineWidth(i14);
                            float f11 = i13;
                            if (lineWidth > f11) {
                                lineWidth = f11;
                            }
                            this.L = (int) Math.max(this.L, Math.ceil(this.J.getLineBottom(i14)));
                            this.K = (int) Math.max(this.K, Math.ceil(lineWidth));
                        } catch (Exception e6) {
                            FileLog.e(e6);
                            return;
                        }
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            this.O = (i10 - this.K) / 2;
            int dp2 = AndroidUtilities.dp(7.0f);
            this.P = dp2;
            if (this.M != null) {
                this.P = org.telegram.messenger.y3.C(11.0f, this.N, dp2);
            }
            if (M()) {
                width = this.K;
            } else {
                width = this.J.getWidth();
            }
            this.Q = (i10 - width) / 2;
            this.R = (i10 - i13) / 2;
            Stack stack = this.f24269n0;
            ArrayList arrayList = this.m0;
            stack.addAll(arrayList);
            arrayList.clear();
            if (charSequence3 instanceof Spannable) {
                StaticLayout staticLayout3 = this.J;
                int i15 = this.O;
                jh.k.a(this, staticLayout3, i15, i15 + this.K, (Spannable) charSequence3, stack, arrayList, null);
            }
        }
    }

    public final void y(Canvas canvas, boolean z4) {
        Paint paint;
        Paint paint2;
        org.telegram.ui.ActionBar.g6 g6Var;
        float f10;
        float f11;
        float f12;
        float f13;
        v0 v0Var;
        Paint paint3;
        Paint paint4;
        int i10;
        int i11;
        float f14;
        Canvas canvas2;
        int i12;
        fg.p pVar;
        int i13;
        float dp;
        float f15;
        int lineCount;
        RectF rectF;
        ArrayList arrayList;
        int i14;
        int i15;
        int i16;
        float f16;
        int i17;
        int i18;
        int i19;
        Paint paint5;
        int i20;
        int i21;
        float f17;
        ArrayList arrayList2;
        org.telegram.ui.ActionBar.g6 g6Var2;
        int i22;
        int i23;
        int i24;
        v0 v0Var2 = this;
        if (!v0Var2.f24280s || ((!v0Var2.I() || z4) && (v0Var2.I() || !z4))) {
            Paint G = v0Var2.G("paintChatActionBackground");
            Paint G2 = v0Var2.G("paintChatActionBackgroundDarken");
            v0Var2.f24273p0 = (TextPaint) v0Var2.G("paintChatActionText");
            int i25 = v0Var2.I0;
            org.telegram.ui.ActionBar.g6 g6Var3 = v0Var2.V0;
            if (i25 >= 0) {
                int v02 = org.telegram.ui.ActionBar.k6.v0(i25, g6Var3);
                if (v0Var2.K0 == null) {
                    Paint paint6 = new Paint(1);
                    v0Var2.K0 = paint6;
                    paint6.setColor(v02);
                    TextPaint textPaint = new TextPaint(1);
                    v0Var2.L0 = textPaint;
                    textPaint.setTypeface(AndroidUtilities.bold());
                    v0Var2.L0.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
                    v0Var2.L0.setColor(org.telegram.ui.ActionBar.k6.v0(v0Var2.J0, g6Var3));
                }
                G = v0Var2.K0;
                v0Var2.f24273p0 = v0Var2.L0;
            }
            boolean z10 = v0Var2.S0;
            Path path = v0Var2.O0;
            if (z10) {
                v0Var2.S0 = false;
                v0Var2.P0 = v0Var2.getWidth();
                v0Var2.Q0 = 0;
                ArrayList arrayList3 = v0Var2.M0;
                arrayList3.clear();
                StaticLayout staticLayout = v0Var2.J;
                if (staticLayout == null) {
                    lineCount = 0;
                } else {
                    lineCount = staticLayout.getLineCount();
                }
                int dp2 = AndroidUtilities.dp(11.0f);
                f10 = 6.0f;
                int dp3 = AndroidUtilities.dp(8.0f);
                int i26 = 0;
                f11 = 8.0f;
                int i27 = 0;
                while (i26 < lineCount) {
                    int ceil = (int) Math.ceil(v0Var2.J.getLineWidth(i26));
                    if (i26 != 0 && (i24 = i27 - ceil) > 0 && i24 <= (dp2 * 1.5f) + dp3) {
                        ceil = i27;
                    }
                    i26 = yh.d(ceil, i26, 1, arrayList3);
                    i27 = ceil;
                }
                f12 = 2.0f;
                f13 = 4.0f;
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
                ArrayList arrayList4 = v0Var2.N0;
                arrayList4.clear();
                path.reset();
                float f18 = measuredWidth;
                path.moveTo(f18, dp4);
                int i31 = i27;
                int i32 = 0;
                int i33 = 0;
                while (true) {
                    rectF = v0Var2.R0;
                    if (i33 >= lineCount) {
                        break;
                    }
                    int i34 = lineCount;
                    int intValue2 = ((Integer) arrayList3.get(i33)).intValue();
                    int lineBottom = v0Var2.J.getLineBottom(i33);
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
                    float f19 = (intValue2 / 2.0f) + f18;
                    if (i33 != i35 && intValue2 < i20 && i33 != 0 && intValue2 < i31) {
                        i21 = dp6;
                    } else {
                        i21 = dp3;
                    }
                    if (i33 == 0 || intValue2 > i31) {
                        f17 = f19;
                        arrayList2 = arrayList3;
                        g6Var2 = g6Var3;
                        rectF.set((f17 - dp5) - dp2, dp4, f17 + i30, (dp2 * 2) + dp4);
                        s();
                        path.arcTo(rectF, -90.0f, 90.0f);
                    } else {
                        f17 = f19;
                        if (intValue2 < i31) {
                            float f20 = f17 + i30;
                            g6Var2 = g6Var3;
                            arrayList2 = arrayList3;
                            rectF.set(f20, dp4, (i21 * 2) + f20, i23 + dp4);
                            s();
                            path.arcTo(rectF, -90.0f, -90.0f);
                        } else {
                            arrayList2 = arrayList3;
                            g6Var2 = g6Var3;
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
                            float f21 = f17 + i30;
                            rectF.set(f21, dp4 - i22, (i21 * 2) + f21, dp4);
                            s();
                            path.arcTo(rectF, 180.0f, -90.0f);
                        }
                    } else {
                        rectF.set((f17 - dp5) - dp2, dp4 - (dp2 * 2), f17 + i30, dp4);
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
                    g6Var3 = g6Var2;
                    arrayList3 = arrayList2;
                }
                paint = G;
                paint2 = G2;
                ArrayList arrayList5 = arrayList3;
                g6Var = g6Var3;
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
                    this.J.getLineBottom(i38);
                    float f22 = measuredWidth - (intValue3 / 2);
                    if (i38 != i37 && intValue3 < i15 && i38 != 0 && intValue3 < i14) {
                        i16 = dp6;
                    } else {
                        i16 = dp3;
                    }
                    if (i38 == i37 || intValue3 > i15) {
                        arrayList5 = arrayList;
                        f16 = f22;
                        i17 = i16;
                        rectF.set(f16 - i30, dp4 - (dp2 * 2), f16 + dp5 + dp2, dp4);
                        s();
                        path.arcTo(rectF, 90.0f, 90.0f);
                    } else if (intValue3 < i15) {
                        float f23 = f22 - i30;
                        arrayList5 = arrayList;
                        f16 = f22;
                        i17 = i16;
                        rectF.set(f23 - (i16 * 2), dp4 - i19, f23, dp4);
                        s();
                        path.arcTo(rectF, 90.0f, -90.0f);
                    } else {
                        arrayList5 = arrayList;
                        f16 = f22;
                        i17 = i16;
                    }
                    dp4 -= ((Integer) arrayList4.get(i38)).intValue();
                    if (i38 != 0 && intValue3 <= i14) {
                        if (intValue3 < i14) {
                            float f24 = f16 - i30;
                            rectF.set(f24 - (i17 * 2), dp4, f24, i18 + dp4);
                            s();
                            path.arcTo(rectF, 0.0f, -90.0f);
                        }
                    } else {
                        rectF.set(f16 - i30, dp4, f16 + dp5 + dp2, (dp2 * 2) + dp4);
                        s();
                        path.arcTo(rectF, 180.0f, 90.0f);
                    }
                }
                v0Var = this;
                path.close();
                if (v0Var.M() && !v0Var.N()) {
                    rectF.left = (f18 - (v0Var.K / 2.0f)) - AndroidUtilities.dp(17.0f);
                    rectF.top = dp4;
                    rectF.right = (v0Var.K / 2.0f) + f18 + AndroidUtilities.dp(17.0f);
                    rectF.bottom = AndroidUtilities.dp(28.0f) + dp4 + v0Var.L + v0Var.N;
                    path.reset();
                    path.addRoundRect(rectF, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), Path.Direction.CW);
                    path.close();
                }
            } else {
                paint = G;
                paint2 = G2;
                g6Var = g6Var3;
                f10 = 6.0f;
                f11 = 8.0f;
                f12 = 2.0f;
                f13 = 4.0f;
                v0Var = v0Var2;
            }
            if (!v0Var.f24283t0) {
                v0Var.f24281s0 = ((ViewGroup) v0Var.getParent()).getMeasuredHeight();
            }
            if (g6Var != null) {
                g6Var.l(v0Var.f24278r0, v0Var.f24275q0 + AndroidUtilities.dp(f13), v0Var.getMeasuredWidth(), v0Var.f24281s0);
            } else {
                org.telegram.ui.ActionBar.k6.q(v0Var.f24278r0, v0Var.f24275q0 + AndroidUtilities.dp(f13), v0Var.getMeasuredWidth(), v0Var.f24281s0);
            }
            float f25 = 0.75f;
            if (!z4 || (v0Var.getAlpha() == 1.0f && !(v0Var instanceof zj))) {
                paint3 = paint2;
                paint4 = paint;
                boolean z11 = v0Var instanceof zj;
                if (z11) {
                    int alpha = paint4.getAlpha();
                    int alpha2 = paint3.getAlpha();
                    float f26 = alpha;
                    if (z11) {
                        f14 = 0.75f;
                    } else {
                        f14 = 1.0f;
                    }
                    paint4.setAlpha((int) (f26 * f14));
                    float f27 = alpha2;
                    if (!z11) {
                        f25 = 1.0f;
                    }
                    paint3.setAlpha((int) (f27 * f25));
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
                boolean z12 = v0Var instanceof zj;
                if (z12) {
                    f15 = 0.75f;
                } else {
                    f15 = 1.0f;
                }
                paint4 = paint;
                paint4.setAlpha((int) (alpha3 * f15));
                float alpha4 = v0Var.getAlpha() * i11;
                if (!z12) {
                    f25 = 1.0f;
                }
                paint3 = paint2;
                paint3.setAlpha((int) (alpha4 * f25));
            }
            MessageObject messageObject = v0Var.E0;
            if (messageObject == null || !messageObject.isRepostPreview) {
                canvas2 = canvas;
                canvas2.drawPath(path, paint4);
                if (v0Var.I() && paint3.getAlpha() > 0) {
                    canvas2.drawPath(path, paint3);
                }
                if (v0Var.P1 > 0.0f) {
                    Paint paint8 = v0Var.Q1;
                    int alpha5 = paint8.getAlpha();
                    if (z4) {
                        paint8.setAlpha((int) (v0Var.getAlpha() * alpha5));
                    }
                    canvas2.drawPath(path, paint8);
                    paint8.setAlpha(alpha5);
                }
            } else {
                canvas2 = canvas;
            }
            MessageObject messageObject2 = v0Var.E0;
            mh.i5 i5Var = v0Var.C0;
            if (i5Var.d()) {
                float dp7 = i5Var.Q.f50510e + AndroidUtilities.dp(f11);
                float width = (v0Var.getWidth() - dp7) / f12;
                if (i5Var.f14247p) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(12.0f) + v0Var.P + v0Var.L;
                }
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(width, dp, dp7 + width, i5Var.M + dp + AndroidUtilities.dp(f11));
                if (v0Var.B1 == null) {
                    v0Var.B1 = new RectF();
                }
                v0Var.B1.set(rectF2);
                canvas2.drawRoundRect(v0Var.B1, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint4);
                if (v0Var.I()) {
                    canvas2.drawRoundRect(v0Var.B1, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint3);
                }
            } else if (v0Var.D0 != null) {
                float dp8 = AndroidUtilities.dp(174.0f);
                ly0 ly0Var = v0Var.D0;
                ly0Var.getClass();
                int dp9 = AndroidUtilities.dp(140.0f) + ((int) ly0Var.f28855f.j());
                if (ly0Var.f28857i) {
                    i13 = AndroidUtilities.dp(40.0f);
                } else {
                    i13 = 0;
                }
                float f28 = dp9 + i13;
                float width2 = (v0Var.getWidth() - dp8) / f12;
                if (v0Var.B1 == null) {
                    v0Var.B1 = new RectF();
                }
                v0Var.B1.set(width2, AndroidUtilities.dp(f13), dp8 + width2, AndroidUtilities.dp(f13) + f28);
                canvas2.drawRoundRect(v0Var.B1, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint4);
                if (v0Var.I()) {
                    canvas2.drawRoundRect(v0Var.B1, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint3);
                }
            } else if (v0Var.K(messageObject2)) {
                float width3 = (v0Var.getWidth() - v0Var.X0) / f12;
                float f29 = v0Var.P + v0Var.L;
                if (v0Var.N()) {
                    float dp10 = f29 + AndroidUtilities.dp(f13);
                    AndroidUtilities.rectTmp.set(width3, dp10, v0Var.X0 + width3, v0Var.f24252f + dp10);
                } else {
                    float dp11 = f29 + AndroidUtilities.dp(12.0f);
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    float f30 = v0Var.X0;
                    rectF3.set(width3, dp11, width3 + f30, f30 + dp11 + v0Var.f24299z1);
                }
                if (messageObject2 != null && messageObject2.type == 18 && !v0Var.f24247d1 && (pVar = v0Var.f24259h1) != null && v0Var.f24250e1 > 0) {
                    RectF rectF4 = AndroidUtilities.rectTmp;
                    rectF4.bottom = yh.c(1.0f, v0Var.f24254f1.f33725c, ((StaticLayout) pVar.f6478f).getHeight() - v0Var.f24250e1, rectF4.bottom);
                }
                if (v0Var.B1 == null) {
                    v0Var.B1 = new RectF();
                }
                v0Var.B1.set(AndroidUtilities.rectTmp);
                if (messageObject2 != null && (((i12 = messageObject2.type) == 33 || i12 == 35) && v0Var.N1 != null)) {
                    float[] fArr = v0Var.V1;
                    Arrays.fill(fArr, AndroidUtilities.dp(16.0f));
                    float dp12 = AndroidUtilities.dp(f10);
                    fArr[7] = dp12;
                    fArr[6] = dp12;
                    fArr[5] = dp12;
                    fArr[4] = dp12;
                    Path path2 = v0Var.U1;
                    path2.rewind();
                    path2.addRoundRect(v0Var.B1, fArr, Path.Direction.CW);
                    canvas2.drawPath(path2, paint4);
                    if (v0Var.I()) {
                        canvas2.drawPath(path2, paint3);
                    }
                } else {
                    canvas2.drawRoundRect(v0Var.B1, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), paint4);
                    if (v0Var.I()) {
                        canvas2.drawRoundRect(v0Var.B1, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), paint3);
                    }
                }
            }
            if (i10 >= 0) {
                paint4.setAlpha(i10);
                paint3.setAlpha(i11);
            }
        }
    }

    public v0(Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z4) {
        super(context);
        this.f24268n = new rc(this);
        int i10 = UserConfig.selectedAccount;
        this.E = i10;
        oh.i7 i7Var = new oh.i7(null, false);
        this.f24238a0 = i7Var;
        this.f24262j0 = true;
        this.f24266l0 = new RectF();
        this.m0 = new ArrayList();
        this.f24269n0 = new Stack();
        this.f24298z0 = new ng.r0(this);
        this.I0 = -1;
        this.J0 = -1;
        this.M0 = new ArrayList();
        this.N0 = new ArrayList();
        this.O0 = new Path();
        this.R0 = new RectF();
        this.S0 = true;
        this.T0 = false;
        this.f24244c1 = false;
        this.f24247d1 = false;
        this.f24254f1 = new org.telegram.ui.Components.z5(this, 0L, 320L, pr.h);
        this.f24270n1 = true;
        TextPaint textPaint = new TextPaint(1);
        this.f24284t1 = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f24286u1 = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.f24288v1 = textPaint3;
        this.f24297y1 = new RadialProgress2(this, null);
        this.C1 = new ha(this, 2);
        this.J1 = new Path();
        this.M1 = new ArrayList();
        this.Q1 = new Paint(1);
        this.U1 = new Path();
        this.V1 = new float[8];
        this.W1 = new float[8];
        this.X1 = new Path();
        this.Y1 = new int[]{16842910, 16842919};
        this.f24255f2 = new u0(this);
        i7Var.f17223a = false;
        this.f24280s = z4;
        this.V0 = g6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.F = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.roundMessageSize / 2);
        this.I = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.g6) null);
        this.f24289w = DownloadController.getInstance(i10).generateObserverTag();
        this.C0 = new mh.i5(i10, this, g6Var);
        textPaint.setTextSize(TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics()));
        textPaint3.setTextSize(TypedValue.applyDimension(1, 15.0f, getResources().getDisplayMetrics()));
        textPaint2.setTextSize(TypedValue.applyDimension(1, 15.0f, getResources().getDisplayMetrics()));
        View view = new View(context);
        this.I1 = view;
        view.setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.l1(0.1f, -16777216), 7, AndroidUtilities.dp(16.0f)));
        view.setVisibility(8);
        addView(view);
        fg.o2 o2Var = new fg.o2(10);
        this.K1 = o2Var;
        o2Var.N = 100;
        o2Var.J = false;
        o2Var.M = true;
        o2Var.G = false;
        o2Var.K = true;
        o2Var.H = true;
        o2Var.f6466r = 1;
        o2Var.f6470w = 0.98f;
        o2Var.v = 0.98f;
        o2Var.f6469u = 0.98f;
        o2Var.f6456g = false;
        o2Var.f6463o = 0.0f;
        o2Var.f6471x = 750L;
        o2Var.f6472y = 750;
        o2Var.c();
    }

    @Override
    public final void invalidate(Rect rect) {
        super.invalidate(rect);
        View view = this.v;
        if (view != null) {
            view.invalidate();
        }
        if (!this.f24242b2 || getParent() == null) {
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
        if (!this.f24242b2 || getParent() == null) {
            return;
        }
        View view2 = (View) getParent();
        if (view2.getParent() != null) {
            view2.invalidate();
            ((View) view2.getParent()).invalidate();
        }
    }

    @Override
    public final void c(boolean z4, boolean z10) {
    }

    @Override
    public final void onFailedDownload(String str, boolean z4) {
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z4) {
    }
}
