package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AlignmentSpan;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Stack;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.rl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.j11;
import org.telegram.ui.Components.j40;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.pz0;
import org.telegram.ui.Components.qx0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.t80;
import org.telegram.ui.Components.yy0;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.h01;
import org.telegram.ui.jm;
import org.telegram.ui.qb;
import org.telegram.ui.tj;
import org.telegram.ui.un;
import org.telegram.ui.v10;

public class v0 extends a0 implements DownloadController.FileDownloadProgressListener, NotificationCenter.NotificationCenterDelegate, l4 {

    public static final HashMap f25727f2;
    public boolean A;
    public float A0;
    public RectF A1;
    public boolean B;
    public final hh.k5 B0;
    public final ea B1;
    public boolean C;
    public qx0 C0;
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
    public gh.y1 G0;
    public pz0 G1;
    public final org.telegram.ui.Components.y8 H;
    public int H0;
    public final View H1;
    public StaticLayout I;
    public int I0;
    public final Path I1;
    public int J;
    public Paint J0;
    public final ag.j3 J1;
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
    public final jh.h7 W;
    public int W0;
    public final Path W1;
    public StaticLayout X0;
    public final int[] X1;
    public Paint Y0;
    public int Y1;
    public pz0 Z0;
    public SpannableStringBuilder Z1;

    public boolean f25728a0;

    public StaticLayout f25729a1;
    public boolean a2;

    public boolean f25730b0;

    public boolean f25731b1;

    public Runnable f25732b2;

    public boolean f25733c0;

    public boolean f25734c1;

    public PorterDuffColorFilter f25735c2;

    public boolean f25736d0;

    public int f25737d1;

    public int f25738d2;

    public boolean f25739e0;

    public final org.telegram.ui.Components.y5 f25740e1;

    public final u0 f25741e2;

    public int f25742f;

    public int f25743f0;

    public v10 f25744f1;

    public boolean f25745g0;

    public ag.r f25746g1;
    public int h;

    public int f25747h0;

    public int f25748h1;

    public boolean f25749i0;

    public int f25750i1;

    public j11 f25751j0;

    public int f25752j1;

    public final RectF f25753k0;

    public pz0 f25754k1;

    public final ArrayList f25755l0;
    public StaticLayout l1;
    public final Stack m0;

    public boolean f25756m1;

    public final nc f25757n;

    public org.telegram.ui.Components.p5 f25758n0;

    public TextPaint f25759n1;

    public TextPaint f25760o0;

    public StaticLayout f25761o1;

    public float f25762p0;

    public float f25763p1;

    public float f25764q0;

    public StaticLayout f25765q1;

    public t80 f25766r;

    public int f25767r0;

    public float f25768r1;

    public final boolean f25769s;

    public boolean f25770s0;

    public final TextPaint f25771s1;

    public ImageLocation f25772t0;

    public final TextPaint f25773t1;

    public float f25774u0;

    public final TextPaint f25775u1;
    public View v;

    public float f25776v0;

    public TLRPC.Document f25777v1;

    public final int f25778w;

    public boolean f25779w0;

    public TLRPC.VideoSize f25780w1;

    public URLSpan f25781x;

    public boolean f25782x0;

    public final RadialProgress2 f25783x1;

    public eh.k f25784y;

    public final ig.r0 f25785y0;

    public int f25786y1;

    public float f25787z0;

    public boolean f25788z1;

    static {
        HashMap map = new HashMap();
        f25727f2 = map;
        s3.c.m(1, map, "1⃣", 3, "2⃣");
        s3.c.m(6, map, "3⃣", 12, "4⃣");
        map.put(24, "5⃣");
    }

    public v0(Context context) {
        this(context, null, false);
    }

    public static float P(StaticLayout staticLayout) {
        float f10 = 0.0f;
        for (int i10 = 0; i10 < staticLayout.getLineCount(); i10++) {
            float fCeil = (int) Math.ceil(staticLayout.getLineWidth(i10));
            if (fCeil > f10) {
                f10 = fCeil;
            }
        }
        return f10;
    }

    private void setStarsPaused(boolean z10) {
        ag.j3 j3Var = this.J1;
        if (z10 == j3Var.f504g) {
            return;
        }
        j3Var.f504g = z10;
        if (z10) {
            j3Var.Q = System.currentTimeMillis();
            return;
        }
        for (int i10 = 0; i10 < j3Var.f510n.size(); i10++) {
            ag.i3 i3Var = (ag.i3) j3Var.f510n.get(i10);
            i3Var.f469a = (System.currentTimeMillis() - j3Var.Q) + i3Var.f469a;
        }
        invalidate();
    }

    public static SpannableStringBuilder y(int i10, String str) {
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

    public final void B(Canvas canvas) {
        float f10;
        float f11;
        float fDp;
        Canvas canvas2 = canvas;
        canvas2.save();
        float f12 = 2.0f;
        canvas2.translate(this.f25743f0 / 2.0f, getPaddingTop());
        canvas2.save();
        canvas2.translate(this.P, this.O);
        StaticLayout staticLayout = this.I;
        org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas2, staticLayout, this.f25758n0, 0.0f, this.f25755l0, 0.0f, 0.0f, 0.0f, 1.0f, staticLayout != null ? F(staticLayout.getPaint().getColor()) : null);
        canvas2.restore();
        hh.k5 k5Var = this.B0;
        float f13 = 4.0f;
        if (k5Var.d()) {
            canvas2.save();
            float width = (getWidth() - k5Var.Q.f48502e) / 2.0f;
            if (k5Var.f9594p) {
                fDp = AndroidUtilities.dp(4.0f);
            } else {
                fDp = AndroidUtilities.dp(16.0f) + this.O + this.K;
            }
            canvas2.translate(width, fDp);
            k5Var.b(canvas2);
            canvas2.restore();
        }
        canvas2.restore();
        j11 j11Var = this.f25751j0;
        org.telegram.ui.ActionBar.c6 c6Var = this.U0;
        if (j11Var != null) {
            float alpha = getAlpha();
            if (c6Var != null) {
                c6Var.m(this.f25764q0, this.f25762p0 + 0.0f, getMeasuredWidth(), this.f25767r0);
            } else {
                org.telegram.ui.ActionBar.g6.q(this.f25764q0, this.f25762p0 + 0.0f, getMeasuredWidth(), this.f25767r0);
            }
            this.f25751j0.c(canvas, getWidth(), this.f25743f0, 0.0f, 1.0f, alpha, this.f25749i0);
            canvas2 = canvas;
        }
        ArrayList arrayList = this.L1;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (c6Var != null) {
            c6Var.m(this.f25764q0, this.f25762p0 + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.f25767r0);
        } else {
            org.telegram.ui.ActionBar.g6.q(this.f25764q0, this.f25762p0 + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.f25767r0);
        }
        float width2 = (getWidth() - this.W0) / 2.0f;
        float fDp2 = AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(4.0f) + this.O + this.K + this.f25742f;
        float fDp3 = (this.W0 - AndroidUtilities.dp(4.0f)) / 2.0f;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            e0 e0Var = (e0) arrayList.get(i10);
            float fA = e0Var.a();
            float fDp4 = ((AndroidUtilities.dp(f13) + fDp3) * i10) + width2;
            float f14 = fDp4 + fDp3;
            float f15 = e0Var.f24235f + fDp2;
            RectF rectF = this.Q0;
            rectF.set(fDp4, fDp2, f14, f15);
            canvas2.save();
            if (fA != 1.0f) {
                f10 = 4.0f;
                canvas2.scale(fA, fA, rectF.centerX(), rectF.centerY());
            } else {
                f10 = 4.0f;
            }
            float fDp5 = AndroidUtilities.dp(Math.min(6.75f, SharedConfig.bubbleRadius));
            float[] fArr = this.V1;
            Arrays.fill(fArr, fDp5);
            if ((e0Var.f24236g & 9) == 9) {
                float fDp6 = AndroidUtilities.dp(SharedConfig.bubbleRadius);
                fArr[7] = fDp6;
                fArr[6] = fDp6;
            }
            if ((e0Var.f24236g & 10) == 10) {
                float fDp7 = AndroidUtilities.dp(SharedConfig.bubbleRadius);
                fArr[5] = fDp7;
                fArr[4] = fDp7;
            }
            Path path = this.W1;
            path.rewind();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas2.drawPath(path, H("paintChatActionBackground"));
            if (J()) {
                canvas2.drawPath(path, org.telegram.ui.ActionBar.g6.f23121h2);
            }
            canvas2.save();
            canvas2.clipPath(path);
            z zVar = e0Var.f24247s;
            if (zVar != null) {
                int i11 = (int) fDp2;
                zVar.setBounds((int) fDp4, i11, (int) f14, e0Var.f24235f + i11);
                e0Var.f24247s.setAlpha(255);
                e0Var.f24247s.draw(canvas2);
            }
            canvas2.restore();
            canvas2.save();
            int iDp = e0Var.f24248t != null ? AndroidUtilities.dp(26.0f) : 0;
            float f16 = iDp;
            float fA2 = com.google.android.recaptcha.internal.a.A(fDp3 - (e0Var.h.l() + (e0Var.f24248t != null ? AndroidUtilities.dp(f10) : 0)), f16, f12, fDp4);
            Drawable drawable = e0Var.f24248t;
            if (drawable != null) {
                int i12 = (int) fA2;
                f11 = 2.0f;
                drawable.setBounds(i12, (int) (((e0Var.f24235f - AndroidUtilities.dp(24.0f)) / f12) + fDp2), AndroidUtilities.dp(24.0f) + i12, AndroidUtilities.dp(24.0f) + ((int) (((e0Var.f24235f - AndroidUtilities.dp(24.0f)) / 2.0f) + fDp2)));
                e0Var.f24248t.setAlpha(e0Var.f24241m ? 128 : 255);
                e0Var.f24248t.draw(canvas2);
                fA2 += f16;
            } else {
                f11 = 2.0f;
            }
            e0Var.h.f31708p = Math.max(1, (((int) fDp3) - AndroidUtilities.dp(15.0f)) - iDp);
            e0Var.h.f(canvas2, fA2, (AndroidUtilities.dp(40.0f) / f11) + fDp2, e0Var.f24241m ? 0.5f : 1.0f);
            canvas2.restore();
            canvas2.restore();
            i10++;
            f13 = 4.0f;
            f12 = 2.0f;
        }
    }

    public final void C(Canvas canvas, boolean z10) {
        if (this.f25769s) {
            if (J() && !z10) {
                return;
            }
            if (!J() && z10) {
                return;
            }
        }
        D(canvas, z10, null);
    }

    public final void D(Canvas canvas, boolean z10, Integer num) {
        Canvas canvas2;
        float alpha = z10 ? getAlpha() : 1.0f;
        if (alpha <= 0.0f) {
            return;
        }
        org.telegram.ui.ActionBar.c6 c6Var = this.U0;
        if (c6Var != null) {
            c6Var.m(this.f25764q0, this.f25762p0 + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.f25767r0);
        } else {
            org.telegram.ui.ActionBar.g6.q(this.f25764q0, this.f25762p0 + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.f25767r0);
        }
        MessageObject messageObject = this.D0;
        if (messageObject == null || !messageObject.shouldDrawReactions()) {
            return;
        }
        ig.r0 r0Var = this.f25785y0;
        boolean z11 = r0Var.f11419b;
        u0 u0Var = this.f25741e2;
        if (!z11 || (u0Var.f25690b && r0Var.f11427l)) {
            r0Var.f11418a = 1.0f;
            if (alpha < 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (alpha * 255.0f), 31);
            } else {
                canvas2 = canvas;
            }
            r0Var.d(canvas2, u0Var.f25690b ? u0Var.f25691c : 1.0f, num);
            if (alpha < 1.0f) {
                canvas2.restore();
            }
        }
    }

    public final void E(jm jmVar, Canvas canvas, int i10, Integer num, float f10) {
        ig.r0 r0Var = this.f25785y0;
        if (r0Var.f11419b) {
            return;
        }
        org.telegram.ui.ActionBar.c6 c6Var = this.U0;
        if (c6Var != null) {
            c6Var.m(this.f25764q0, this.f25762p0 + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.f25767r0);
        } else {
            org.telegram.ui.ActionBar.g6.q(this.f25764q0, this.f25762p0 + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.f25767r0);
        }
        r0Var.D = f10;
        r0Var.f(jmVar, canvas, i10, num);
    }

    public final ColorFilter F(int i10) {
        if (i10 != this.f25738d2 || this.f25735c2 == null) {
            this.f25738d2 = i10;
            this.f25735c2 = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        }
        return this.f25735c2;
    }

    public final int G(MessageObject messageObject) {
        int i10;
        int iDp = this.V0;
        int i11 = messageObject.type;
        if (i11 == 37) {
            iDp = AndroidUtilities.dp(52.0f);
        } else if (i11 == 21 || N()) {
            iDp = AndroidUtilities.dp(78.0f);
        }
        if (M() || (i10 = messageObject.type) == 34 || i10 == 35) {
            return 0;
        }
        return iDp;
    }

    public Paint H(String str) {
        org.telegram.ui.ActionBar.c6 c6Var = this.U0;
        Paint paintN = c6Var != null ? c6Var.N(str) : null;
        return paintN != null ? paintN : org.telegram.ui.ActionBar.g6.S0(str);
    }

    public final float I(MessageObject messageObject) {
        MessagesController messagesController;
        String str;
        if (messageObject == null) {
            return 1.0f;
        }
        try {
            if (messageObject.type == 22 && (str = (messagesController = MessagesController.getInstance(this.D)).uploadingWallpaper) != null && TextUtils.equals(messageObject.messageOwner.action.wallpaper.uploadingImage, str)) {
                return messagesController.uploadingWallpaperInfo.f24020r;
            }
            return 1.0f;
        } catch (Exception e9) {
            FileLog.e(e9);
            return 1.0f;
        }
    }

    public final boolean J() {
        if (this.J0 != null) {
            return false;
        }
        org.telegram.ui.ActionBar.c6 c6Var = this.U0;
        if (c6Var != null) {
            return c6Var.u0();
        }
        return org.telegram.ui.ActionBar.g6.a1();
    }

    public final void K() {
        t0 t0Var = this.T0;
        if (t0Var != null && t0Var.f()) {
            super.invalidate();
        } else if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    public final boolean L(MessageObject messageObject) {
        if (messageObject == null) {
            return false;
        }
        int i10 = messageObject.type;
        return i10 == 30 || i10 == 18 || i10 == 25 || N();
    }

    public final boolean M() {
        TLRPC.Message message;
        MessageObject messageObject = this.D0;
        return (messageObject == null || (message = messageObject.messageOwner) == null || !(message.action instanceof TLRPC.TL_messageActionSuggestedPostApproval)) ? false : true;
    }

    public final boolean N() {
        MessageObject messageObject;
        int i10;
        if (this.B0.d() || this.C0 != null || (i10 = (messageObject = this.D0).type) == 31 || i10 == 37 || i10 == 33 || i10 == 35 || i10 == 34 || i10 == 21 || i10 == 22 || messageObject.isStoryMention()) {
            return true;
        }
        TLRPC.Message message = this.D0.messageOwner;
        if (message == null) {
            return false;
        }
        TLRPC.MessageAction messageAction = message.action;
        if (messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
            return ((TLRPC.TL_messageActionSuggestedPostApproval) messageAction).balance_too_low || ((TLRPC.TL_messageActionSuggestedPostApproval) messageAction).rejected;
        }
        return false;
    }

    public final boolean O() {
        MessageObject messageObject = this.D0;
        if (messageObject == null) {
            return false;
        }
        TLRPC.Message message = messageObject.messageOwner;
        TLRPC.MessageAction messageAction = message.action;
        if (((messageAction instanceof TLRPC.TL_messageActionGiftCode) || (messageAction instanceof TLRPC.TL_messageActionGiftStars)) && (message.from_id instanceof TLRPC.TL_peerUser)) {
            return UserObject.isUserSelf(MessagesController.getInstance(this.D).getUser(Long.valueOf(this.D0.messageOwner.from_id.user_id)));
        }
        return false;
    }

    public final void Q(CharacterStyle characterStyle) {
        if (this.T0 == null || !(characterStyle instanceof URLSpan)) {
            return;
        }
        String url = ((URLSpan) characterStyle).getURL();
        if (url.startsWith("task")) {
            this.T0.J(this, this.D0.getReplyMsgId(), Integer.parseInt(url.substring(5)));
            return;
        }
        if (url.startsWith("topic")) {
            URLSpan uRLSpan = this.f25781x;
            if (uRLSpan instanceof r41) {
                TLObject tLObject = ((r41) uRLSpan).f32082c;
                if (tLObject instanceof TLRPC.TL_forumTopic) {
                    wf.c.m(this.T0.y0(), -this.T0.a(), (TLRPC.TL_forumTopic) tLObject, 0);
                    return;
                }
                return;
            }
        }
        if (url.startsWith("invite")) {
            URLSpan uRLSpan2 = this.f25781x;
            if (uRLSpan2 instanceof r41) {
                TLObject tLObject2 = ((r41) uRLSpan2).f32082c;
                if (tLObject2 instanceof TLRPC.TL_chatInviteExported) {
                    this.T0.z0((TLRPC.TL_chatInviteExported) tLObject2);
                    return;
                }
                return;
            }
        }
        if (url.startsWith("game")) {
            this.T0.C(this, this.D0.getReplyMsgId());
        } else if (url.startsWith("http")) {
            we.e.s(getContext(), url);
        } else {
            this.T0.p1(Long.parseLong(url));
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
            AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.i3(this, tL_premiumGiftOption, str, 3));
        }
    }

    public final void S() {
        TLRPC.Message message;
        MessageObject messageObject = this.D0;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return;
        }
        TLRPC.MessageAction messageAction = message.action;
        boolean z10 = messageAction instanceof TLRPC.TL_messageActionGiftStars;
        jh.h7 h7Var = this.W;
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
            starsTransaction.f22609id = tL_messageActionGiftStars.transaction_id;
            starsTransaction.gift = true;
            starsTransaction.sent_by = peer;
            starsTransaction.received_by = peer2;
            hh.oa.h1(context, false, 0L, this.D, starsTransaction, c6Var);
            return;
        }
        if (messageAction instanceof TLRPC.TL_messageActionPrizeStars) {
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
            starsTransaction2.f22609id = tL_messageActionPrizeStars.transaction_id;
            starsTransaction2.gift = true;
            starsTransaction2.flags |= 8192;
            starsTransaction2.giveaway_post_id = tL_messageActionPrizeStars.giveaway_msg_id;
            starsTransaction2.sent_by = peer3;
            starsTransaction2.received_by = peer4;
            hh.oa.h1(context2, false, 0L, this.D, starsTransaction2, c6Var2);
            return;
        }
        if (messageAction instanceof TLRPC.TL_messageActionGiftTon) {
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
            starsTransaction3.f22609id = tL_messageActionGiftTon.transaction_id;
            starsTransaction3.gift = true;
            starsTransaction3.sent_by = peer5;
            starsTransaction3.received_by = peer6;
            hh.oa.h1(context3, false, 0L, this.D, starsTransaction3, c6Var3);
            return;
        }
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            if (((TLRPC.TL_messageActionStarGift) messageAction).forceIn) {
                return;
            }
            hh.i5 i5Var = new hh.i5(getContext(), this.D, this.D0.getDialogId(), this.U0, null);
            i5Var.i2(this.D0, null);
            i5Var.show();
            return;
        }
        if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
            if (!((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift.burned) {
                hh.i5 i5Var2 = new hh.i5(getContext(), this.D, this.D0.getDialogId(), this.U0, null);
                i5Var2.i2(this.D0, null);
                i5Var2.show();
                return;
            } else {
                org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
                if (n2VarU == null) {
                    return;
                }
                org.telegram.messenger.y1.q(R.string.UniqueGiftNotFoundBurned, mc.a0(n2VarU), R.raw.fire_on, 36);
                return;
            }
        }
        if (messageAction instanceof TLRPC.TL_messageActionSetChatTheme) {
            TLRPC.ChatTheme chatTheme = ((TLRPC.TL_messageActionSetChatTheme) messageAction).theme;
            if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                    hh.i5 i5Var3 = new hh.i5(getContext(), this.D, this.D0.getDialogId(), this.U0, null);
                    i5Var3.h2(starGift.slug, (TL_stars.TL_starGiftUnique) starGift, null);
                    i5Var3.show();
                }
            }
        }
    }

    public final void T(int i10, boolean z10, boolean z11) {
        String dateChat;
        int i11 = this.E0;
        if (i11 == i10 || i11 / 3600 == i10 / 3600) {
            return;
        }
        if (z10) {
            dateChat = i10 == 2147483646 ? LocaleController.getString("MessageScheduledUntilOnline", R.string.MessageScheduledUntilOnline) : LocaleController.formatString("MessageScheduledOn", R.string.MessageScheduledOn, LocaleController.formatDateChat(i10));
        } else {
            dateChat = LocaleController.formatDateChat(i10);
        }
        this.E0 = i10;
        CharSequence charSequence = this.F0;
        if (charSequence == null || !TextUtils.equals(dateChat, charSequence)) {
            this.F0 = dateChat;
            this.Z1 = null;
            X(z11);
        }
    }

    public final void U(MessageObject messageObject, boolean z10) {
        TLRPC.TL_messageReactions tL_messageReactions;
        boolean z11;
        String str;
        TLRPC.TL_messages_stickerSet stickerSetByName;
        String str2;
        TLRPC.Document document;
        TLRPC.Document document2;
        String str3;
        ArrayList<TLRPC.TL_stickerPack> arrayList;
        Object obj;
        TLRPC.Document document3;
        TLRPC.Document documentE;
        TLRPC.Document documentE2;
        BotInlineKeyboard.Source source;
        boolean z12;
        int i10;
        int i11;
        int rowsCount;
        int i12;
        int columnsCount;
        int i13;
        e0 e0Var;
        int iconRes;
        boolean z13;
        boolean z14;
        boolean z15;
        TLRPC.PhotoSize photoSize;
        TLRPC.VideoSize closestVideoSizeWithSize;
        TLRPC.PhotoSize photoSize2;
        boolean z16;
        float f10;
        TLRPC.Message message;
        TLRPC.WallPaper wallPaper;
        TLRPC.MessageAction messageAction;
        String str4;
        int i14;
        StaticLayout staticLayout;
        MessageObject messageObject2 = messageObject;
        if (messageObject2 == null) {
            return;
        }
        if (this.D0 != messageObject2 || (!((staticLayout = this.I) == null || TextUtils.equals(staticLayout.getText(), messageObject2.messageText)) || (!(this.f25782x0 || messageObject2.replyMessageObject == null) || z10 || messageObject2.type == 21 || messageObject2.forceUpdate))) {
            if (BuildVars.DEBUG_PRIVATE_VERSION && Thread.currentThread() != ApplicationLoader.applicationHandler.getLooper().getThread()) {
                FileLog.e(new IllegalStateException("Wrong thread!!!"));
            }
            this.L1.clear();
            this.M1 = null;
            this.Z1 = null;
            MessageObject messageObject3 = this.D0;
            boolean z17 = messageObject3 == null || messageObject3.stableId != messageObject2.stableId;
            if (messageObject3 != null) {
                messageObject2.playedGiftAnimation = messageObject3.playedGiftAnimation;
            }
            this.D0 = messageObject2;
            messageObject2.forceUpdate = false;
            this.f25782x0 = messageObject2.replyMessageObject != null;
            DownloadController.getInstance(this.D).removeLoadingFileObserver(this);
            this.R = 0;
            this.C = false;
            ag.r rVar = this.f25746g1;
            if (rVar != null && z17) {
                org.telegram.ui.Components.t5.release((v0) rVar.f633i, (org.telegram.ui.Components.p5) rVar.h);
                this.f25746g1 = null;
                this.f25731b1 = false;
            }
            if (z17 || messageObject2.reactionsChanged) {
                messageObject2.reactionsChanged = false;
                TLRPC.Message message2 = messageObject2.messageOwner;
                boolean z18 = (message2 == null || (tL_messageReactions = message2.reactions) == null || !tL_messageReactions.reactions_as_tags) ? false : true;
                if (messageObject2.shouldDrawReactions()) {
                    this.f25785y0.s(messageObject2, !messageObject2.shouldDrawReactionsInLayout(), z18, this.U0);
                } else {
                    this.f25785y0.s(null, false, false, this.U0);
                }
            }
            if (messageObject2.type == 32) {
                if (this.C0 == null) {
                    qx0 qx0Var = new qx0(this.D, this, this.U0);
                    this.C0 = qx0Var;
                    if (this.Q1) {
                        qx0Var.d.f31328r0 = qx0Var.f31992b;
                    }
                }
                qx0 qx0Var2 = this.C0;
                qx0Var2.getClass();
                TLRPC.TL_messageActionSuggestBirthday tL_messageActionSuggestBirthday = (TLRPC.TL_messageActionSuggestBirthday) messageObject2.messageOwner.action;
                qx0Var2.f31994e = tL_messageActionSuggestBirthday.birthday;
                pz0 pz0Var = new pz0(TextUtils.concat(messageObject2.messageText, ":"), 13.0f, null);
                pz0Var.n(6);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                pz0Var.a();
                pz0Var.q(AndroidUtilities.dp(174.0f) - AndroidUtilities.dp(32.0f));
                qx0Var2.f31995f = pz0Var;
                int i15 = (tL_messageActionSuggestBirthday.birthday.flags & 1) != 0 ? 3 : 2;
                pz0[] pz0VarArr = new pz0[i15];
                qx0Var2.f31996g = pz0VarArr;
                qx0Var2.h = new pz0[i15];
                pz0VarArr[0] = new pz0(LocaleController.getString(R.string.DateDay), 11.0f, null);
                qx0Var2.h[0] = new pz0("" + tL_messageActionSuggestBirthday.birthday.day, 11.0f, AndroidUtilities.bold());
                qx0Var2.f31996g[1] = new pz0(LocaleController.getString(R.string.DateMonth), 11.0f, null);
                pz0[] pz0VarArr2 = qx0Var2.h;
                StringBuilder sb2 = new StringBuilder("");
                int i16 = tL_messageActionSuggestBirthday.birthday.month - 1;
                sb2.append((i16 < 0 || i16 >= 12) ? i0.a.k(i16, "") : LocaleController.getString(new int[]{R.string.January, R.string.February, R.string.March, R.string.April, R.string.May, R.string.June, R.string.July, R.string.August, R.string.September, R.string.October, R.string.November, R.string.December}[i16]));
                pz0VarArr2[1] = new pz0(sb2.toString(), 11.0f, AndroidUtilities.bold());
                if ((tL_messageActionSuggestBirthday.birthday.flags & 1) != 0) {
                    qx0Var2.f31996g[2] = new pz0(LocaleController.getString(R.string.DateYear), 11.0f, null);
                    qx0Var2.h[2] = new pz0("" + tL_messageActionSuggestBirthday.birthday.year, 11.0f, AndroidUtilities.bold());
                }
                qx0Var2.f31997i = !messageObject2.isOutOwner();
                org.telegram.ui.ActionBar.c6 c6Var = qx0Var2.f31993c;
                qx0Var2.f32000l.setColor(c6Var != null ? c6Var.a() : org.telegram.ui.ActionBar.g6.I.q() ? org.telegram.ui.ActionBar.g6.l1(0.12f, -1) : org.telegram.ui.ActionBar.g6.l1(0.12f, -16777216));
                qx0Var2.f31998j = new pz0(LocaleController.getString(R.string.SuggestedDateOfBirthView), 14.0f, AndroidUtilities.bold());
            } else {
                qx0 qx0Var3 = this.C0;
                if (qx0Var3 != null) {
                    qx0Var3.d.f31328r0 = null;
                    this.C0 = null;
                }
            }
            boolean z19 = !z17;
            this.B0.f(messageObject2, z19);
            this.E.setAutoRepeatCount(0);
            this.E.clearDecorators();
            if (messageObject2.type != 22) {
                this.F = null;
            }
            if (messageObject2.actionDeleteGroupEventId != -1) {
                h7.b6.b(this, 0.02f, 1.2f);
                this.S1 = Math.max(AndroidUtilities.dp(250.0f), lh.w3.a(messageObject2.messageText, (TextPaint) H("paintChatActionText")));
                h01 h01VarS0 = qb.S0(messageObject2.messageText);
                if (h01VarS0 != null) {
                    h01VarS0.h = this;
                }
            } else {
                setStateListAnimator(null);
                this.S1 = 0;
            }
            if (messageObject2.isStoryMention()) {
                TLRPC.User user = MessagesController.getInstance(this.D).getUser(Long.valueOf(messageObject2.messageOwner.media.user_id));
                this.H.m(this.D, user);
                TL_stories.StoryItem storyItem = messageObject2.messageOwner.media.storyItem;
                if (storyItem == null || !storyItem.noforwards) {
                    jh.l7.x(this.E, storyItem);
                } else {
                    this.E.setForUserOrChat(user, this.H, null, true, 0, true);
                }
                this.E.setRoundRadius((int) (this.V0 / 2.0f));
            } else {
                int i17 = messageObject2.type;
                if (i17 == 22) {
                    if (messageObject2.strippedThumb == null) {
                        int size = messageObject2.photoThumbs.size();
                        for (int i18 = 0; i18 < size && !(messageObject2.photoThumbs.get(i18) instanceof TLRPC.TL_photoStrippedSize); i18++) {
                        }
                    }
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = messageObject2.currentEvent;
                    if (tL_channelAdminLogEvent != null) {
                        TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent.action;
                        if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeWallpaper) {
                            wallPaper = ((TLRPC.TL_channelAdminLogEventActionChangeWallpaper) channelAdminLogEventAction).new_value;
                        } else {
                            message = messageObject2.messageOwner;
                            if (message != null || (messageAction = message.action) == null) {
                                wallPaper = null;
                            } else {
                                wallPaper = messageAction.wallpaper;
                            }
                        }
                    } else {
                        message = messageObject2.messageOwner;
                        if (message != null) {
                            wallPaper = null;
                        } else {
                            wallPaper = null;
                        }
                    }
                    if (!TextUtils.isEmpty(ChatThemeController.getWallpaperEmoticon(wallPaper))) {
                        org.telegram.ui.ActionBar.c6 c6Var2 = this.U0;
                        boolean zA = c6Var2 != null ? c6Var2.a() : org.telegram.ui.ActionBar.g6.I.q();
                        this.E.clearImage();
                        int i19 = this.D;
                        String wallpaperEmoticon = ChatThemeController.getWallpaperEmoticon(wallPaper);
                        int i20 = lh.q6.f16557x0;
                        org.telegram.ui.ActionBar.b4 theme = ChatThemeController.getInstance(i19).getTheme(of.b.d(wallpaperEmoticon));
                        Drawable drawableR0 = theme == null ? org.telegram.ui.ActionBar.g6.r0() : lh.q6.g(i19, theme, zA);
                        this.F = drawableR0;
                        if (drawableR0 != null) {
                            drawableR0.setCallback(this);
                        }
                    } else if (wallPaper != null && (str4 = wallPaper.uploadingImage) != null) {
                        this.E.setImage(ImageLocation.getForPath(str4), "150_150_wallpaper" + wallPaper.f22532id + un.e(wallPaper.settings), null, null, un.b(wallPaper), 0L, null, wallPaper, 1);
                        this.F = null;
                    } else if (wallPaper != null) {
                        TLObject tLObject = messageObject2.photoThumbsObject;
                        TLRPC.Document document4 = tLObject instanceof TLRPC.Document ? (TLRPC.Document) tLObject : wallPaper.document;
                        this.E.setImage(ImageLocation.getForDocument(document4), "150_150_wallpaper" + wallPaper.f22532id + un.e(wallPaper.settings), null, null, un.b(wallPaper), 0L, null, wallPaper, 1);
                        this.F = null;
                    } else {
                        this.F = null;
                    }
                    this.E.setRoundRadius((int) (this.V0 / 2.0f));
                    if (I(messageObject) == 1.0f) {
                        this.f25783x1.o(1.0f, z19);
                        this.f25783x1.setIcon(4, z19, z19);
                    } else {
                        this.f25783x1.setIcon(3, z19, z19);
                    }
                } else if (i17 == 21) {
                    this.E.setRoundRadius((int) (this.V0 / 2.0f));
                    this.E.setAllowStartLottieAnimation(true);
                    this.E.setDelegate(null);
                    TLRPC.TL_messageActionSuggestProfilePhoto tL_messageActionSuggestProfilePhoto = (TLRPC.TL_messageActionSuggestProfilePhoto) messageObject2.messageOwner.action;
                    TLRPC.VideoSize closestVideoSizeWithSize2 = FileLoader.getClosestVideoSizeWithSize(tL_messageActionSuggestProfilePhoto.photo.video_sizes, 1000);
                    ArrayList<TLRPC.VideoSize> arrayList2 = tL_messageActionSuggestProfilePhoto.photo.video_sizes;
                    ImageLocation forPhoto = (arrayList2 == null || arrayList2.isEmpty()) ? null : ImageLocation.getForPhoto(closestVideoSizeWithSize2, tL_messageActionSuggestProfilePhoto.photo);
                    TLRPC.Photo photo = messageObject2.messageOwner.action.photo;
                    if (messageObject2.strippedThumb != null) {
                        photoSize2 = null;
                        break;
                    }
                    int size2 = messageObject2.photoThumbs.size();
                    int i21 = 0;
                    while (true) {
                        if (i21 >= size2) {
                            photoSize2 = null;
                            break;
                        }
                        photoSize2 = messageObject2.photoThumbs.get(i21);
                        if (photoSize2 instanceof TLRPC.TL_photoStrippedSize) {
                            break;
                        } else {
                            i21++;
                        }
                    }
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject2.photoThumbs, 1000);
                    if (closestPhotoSizeWithSize == null) {
                        z16 = false;
                    } else if (closestVideoSizeWithSize2 != null) {
                        z16 = false;
                        this.E.setImage(forPhoto, "g", ImageLocation.getForPhoto(closestPhotoSizeWithSize, photo), "150_150", ImageLocation.getForObject(photoSize2, messageObject2.photoThumbsObject), "50_50_b", messageObject2.strippedThumb, 0L, null, messageObject, 0);
                        messageObject2 = messageObject;
                    } else {
                        z16 = false;
                        this.E.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, photo), "150_150", ImageLocation.getForObject(photoSize2, messageObject2.photoThumbsObject), "50_50_b", messageObject2.strippedThumb, 0L, null, messageObject2, 0);
                    }
                    this.E.setAllowStartLottieAnimation(z16);
                    j40 j40Var = MessagesController.getInstance(this.D).photoSuggestion.get(messageObject2.messageOwner.local_id);
                    if (j40Var != null) {
                        f10 = 1.0f;
                        if (j40Var.S != 1.0f) {
                            this.f25783x1.setIcon(3, z19, z19);
                        }
                    } else {
                        f10 = 1.0f;
                    }
                    this.f25783x1.o(f10, z19);
                    this.f25783x1.setIcon(4, z19, z19);
                } else if (i17 == 31 || i17 == 33 || i17 == 30 || i17 == 18 || i17 == 25 || i17 == 35) {
                    this.E.setRoundRadius(0);
                    TLRPC.MessageAction messageAction2 = messageObject2.messageOwner.action;
                    if (messageAction2 instanceof TLRPC.TL_messageActionNoForwardsRequest) {
                        TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest = (TLRPC.TL_messageActionNoForwardsRequest) messageAction2;
                        long j10 = MessagesController.getInstance(this.D).config.noForwardsRequestExpirePeriod.get(TimeUnit.SECONDS);
                        if (tL_messageActionNoForwardsRequest.expired) {
                            z11 = z17;
                        } else {
                            z11 = z17;
                            if (((long) messageObject2.messageOwner.date) + j10 >= ConnectionsManager.getInstance(this.D).getCurrentTime()) {
                                z15 = false;
                            }
                            this.N1 = z15;
                            if (!messageObject2.isOut() && !tL_messageActionNoForwardsRequest.expired && !this.N1) {
                                BotInlineKeyboard.Builder builder = new BotInlineKeyboard.Builder();
                                builder.addSharingOfferKeyboard();
                                this.M1 = builder.build();
                            }
                            document = null;
                        }
                        z15 = true;
                        this.N1 = z15;
                        if (!messageObject2.isOut()) {
                            BotInlineKeyboard.Builder builder2 = new BotInlineKeyboard.Builder();
                            builder2.addSharingOfferKeyboard();
                            this.M1 = builder2.build();
                        }
                        document = null;
                    } else {
                        z11 = z17;
                        if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftPurchaseOffer) {
                            TLRPC.TL_messageActionStarGiftPurchaseOffer tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) messageAction2;
                            TL_stars.StarGift starGift = tL_messageActionStarGiftPurchaseOffer.gift;
                            if (starGift != null) {
                                documentE2 = hf.d.e(starGift);
                                if (this.G0 == null) {
                                    this.G0 = new gh.y1(this, this.U0, false);
                                }
                                this.G0.d((TL_stars.starGiftAttributeBackdrop) hh.u7.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                                this.G0.e((TL_stars.starGiftAttributePattern) hh.u7.l(starGift.attributes, TL_stars.starGiftAttributePattern.class));
                            } else {
                                documentE2 = null;
                            }
                            this.N1 = tL_messageActionStarGiftPurchaseOffer.expires_at < ConnectionsManager.getInstance(this.D).getCurrentTime();
                            if (!messageObject2.isOut() && !tL_messageActionStarGiftPurchaseOffer.accepted && !tL_messageActionStarGiftPurchaseOffer.declined && !this.N1) {
                                BotInlineKeyboard.Builder builder3 = new BotInlineKeyboard.Builder();
                                builder3.addGiftOfferKeyboard();
                                this.M1 = builder3.build();
                            }
                            document = documentE2;
                        } else {
                            if (messageAction2 instanceof TLRPC.TL_messageActionSetChatTheme) {
                                TL_stars.StarGift starGift2 = ((TLRPC.TL_chatThemeUniqueGift) ((TLRPC.TL_messageActionSetChatTheme) messageAction2).theme).gift;
                                if (starGift2 != null) {
                                    documentE = hf.d.e(starGift2);
                                    if (this.G0 == null) {
                                        this.G0 = new gh.y1(this, this.U0, false);
                                    }
                                    this.G0.d((TL_stars.starGiftAttributeBackdrop) hh.u7.l(starGift2.attributes, TL_stars.starGiftAttributeBackdrop.class));
                                    this.G0.e((TL_stars.starGiftAttributePattern) hh.u7.l(starGift2.attributes, TL_stars.starGiftAttributePattern.class));
                                } else {
                                    documentE = null;
                                }
                                document = documentE;
                            } else if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                                TL_stars.StarGift starGift3 = ((TLRPC.TL_messageActionStarGift) messageAction2).gift;
                                if (starGift3 != null) {
                                    document = starGift3.sticker;
                                } else {
                                    document = null;
                                }
                                obj = messageObject2;
                                stickerSetByName = null;
                                str2 = null;
                            } else {
                                if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                    TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction2;
                                    if (tL_messageActionStarGiftUnique.refunded) {
                                        TL_stars.StarGift starGift4 = tL_messageActionStarGiftUnique.gift;
                                        if (starGift4 != null) {
                                            document = starGift4.getDocument();
                                        } else {
                                            document = null;
                                        }
                                        obj = messageObject2;
                                        stickerSetByName = null;
                                        str2 = null;
                                    }
                                }
                                if (messageAction2 instanceof TLRPC.TL_messageActionGiftTon) {
                                    str = UserConfig.getInstance(this.D).premiumTonStickerPack;
                                    if (str == null) {
                                        MediaDataController.getInstance(this.D).checkTonGiftStickers();
                                        return;
                                    }
                                } else {
                                    str = UserConfig.getInstance(this.D).premiumGiftsStickerPack;
                                    if (str == null) {
                                        MediaDataController.getInstance(this.D).checkPremiumGiftStickers();
                                        return;
                                    }
                                }
                                stickerSetByName = MediaDataController.getInstance(this.D).getStickerSetByName(str);
                                if (stickerSetByName == null) {
                                    stickerSetByName = MediaDataController.getInstance(this.D).getStickerSetByEmojiOrName(str);
                                }
                                if (stickerSetByName != null) {
                                    TLRPC.MessageAction messageAction3 = messageObject2.messageOwner.action;
                                    int i22 = messageAction3.months;
                                    if (messageObject2.type == 30) {
                                        String str5 = "3⃣";
                                        if (messageAction3 instanceof TLRPC.TL_messageActionGiftTon) {
                                            long j11 = messageAction3.cryptoAmount;
                                            if (j11 <= 10000000000L) {
                                                str5 = "2⃣";
                                            } else if (j11 <= 50000000000L) {
                                                str5 = "1⃣";
                                            }
                                        } else {
                                            long j12 = messageAction3 instanceof TLRPC.TL_messageActionGiftStars ? ((TLRPC.TL_messageActionGiftStars) messageAction3).stars : ((TLRPC.TL_messageActionPrizeStars) messageAction3).stars;
                                            if (j12 <= 1000) {
                                                str5 = "2⃣";
                                            } else if (j12 >= 2500) {
                                                str5 = "4⃣";
                                            }
                                        }
                                        int i23 = 0;
                                        while (true) {
                                            if (i23 < stickerSetByName.packs.size()) {
                                                TLRPC.TL_stickerPack tL_stickerPack = stickerSetByName.packs.get(i23);
                                                if (!TextUtils.equals(tL_stickerPack.emoticon, str5) || tL_stickerPack.documents.isEmpty()) {
                                                    i23++;
                                                } else {
                                                    long jLongValue = tL_stickerPack.documents.get(0).longValue();
                                                    int i24 = 0;
                                                    while (true) {
                                                        if (i24 < stickerSetByName.documents.size()) {
                                                            document3 = stickerSetByName.documents.get(i24);
                                                            if (document3 != null && document3.f22386id == jLongValue) {
                                                                break;
                                                            } else {
                                                                i24++;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            document3 = null;
                                            break;
                                        }
                                        document2 = document3;
                                    } else {
                                        String str6 = (String) f25727f2.get(Integer.valueOf(i22));
                                        ArrayList<TLRPC.TL_stickerPack> arrayList3 = stickerSetByName.packs;
                                        int size3 = arrayList3.size();
                                        int i25 = 0;
                                        document2 = null;
                                        while (i25 < size3) {
                                            TLRPC.TL_stickerPack tL_stickerPack2 = arrayList3.get(i25);
                                            i25++;
                                            TLRPC.TL_stickerPack tL_stickerPack3 = tL_stickerPack2;
                                            if (Objects.equals(tL_stickerPack3.emoticon, str6)) {
                                                ArrayList<Long> arrayList4 = tL_stickerPack3.documents;
                                                int size4 = arrayList4.size();
                                                TLRPC.Document document5 = document2;
                                                int i26 = 0;
                                                while (true) {
                                                    if (i26 >= size4) {
                                                        str3 = str6;
                                                        arrayList = arrayList3;
                                                        break;
                                                    }
                                                    Long l10 = arrayList4.get(i26);
                                                    i26++;
                                                    long jLongValue2 = l10.longValue();
                                                    ArrayList<TLRPC.Document> arrayList5 = stickerSetByName.documents;
                                                    int size5 = arrayList5.size();
                                                    int i27 = 0;
                                                    while (true) {
                                                        if (i27 >= size5) {
                                                            str3 = str6;
                                                            arrayList = arrayList3;
                                                            break;
                                                        }
                                                        TLRPC.Document document6 = arrayList5.get(i27);
                                                        i27++;
                                                        TLRPC.Document document7 = document6;
                                                        str3 = str6;
                                                        arrayList = arrayList3;
                                                        if (document7.f22386id == jLongValue2) {
                                                            document5 = document7;
                                                            break;
                                                        } else {
                                                            str6 = str3;
                                                            arrayList3 = arrayList;
                                                        }
                                                    }
                                                    if (document5 != null) {
                                                        break;
                                                    }
                                                    str6 = str3;
                                                    arrayList3 = arrayList;
                                                }
                                                document2 = document5;
                                            } else {
                                                str3 = str6;
                                                arrayList = arrayList3;
                                            }
                                            if (document2 != null) {
                                                break;
                                            }
                                            str6 = str3;
                                            arrayList3 = arrayList;
                                        }
                                    }
                                    if (document2 != null || stickerSetByName.documents.isEmpty()) {
                                        str2 = str;
                                        obj = stickerSetByName;
                                        document = document2;
                                    } else {
                                        str2 = str;
                                        document = stickerSetByName.documents.get(0);
                                        obj = stickerSetByName;
                                    }
                                } else {
                                    str2 = str;
                                    document = null;
                                    obj = null;
                                }
                            }
                            source = this.M1;
                            if (source != null) {
                                rowsCount = source.getRowsCount();
                                for (i12 = 0; i12 < rowsCount; i12++) {
                                    columnsCount = this.M1.getColumnsCount(i12);
                                    for (i13 = 0; i13 < columnsCount; i13++) {
                                        BotInlineKeyboard.Button button = this.M1.getButton(i12, i13);
                                        e0Var = new e0(new s0(this, 0));
                                        e0Var.f24238j = (BotInlineKeyboard.ButtonCustom) button;
                                        iconRes = button.getIconRes();
                                        if (iconRes != 0) {
                                            Drawable drawable = getResources().getDrawable(iconRes);
                                            e0Var.f24248t = drawable;
                                            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                                        }
                                        e0Var.f24235f = AndroidUtilities.dp(40.0f);
                                        int i28 = e0Var.f24236g | 8;
                                        e0Var.f24236g = i28;
                                        if (i13 == 0) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        int iB = h7.a8.b(i28, 1, z13);
                                        e0Var.f24236g = iB;
                                        if (i13 == 1) {
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        e0Var.f24236g = h7.a8.b(iB, 2, z14);
                                        e0Var.h = new pz0(button.getText(), (TextPaint) H("paintChatBotButton"));
                                        this.L1.add(e0Var);
                                    }
                                }
                            }
                            this.f25788z1 = messageObject2.wasUnread;
                            this.f25777v1 = document;
                            if (document != null) {
                                this.E.setAllowStartLottieAnimation(true);
                                i10 = messageObject2.type;
                                if (i10 != 31 && i10 != 37 && i10 != 33) {
                                    this.E.setDelegate(this.B1);
                                }
                                this.f25780w1 = null;
                                for (i11 = 0; i11 < document.video_thumbs.size(); i11++) {
                                    if ("f".equals(document.video_thumbs.get(i11).type)) {
                                        this.f25780w1 = document.video_thumbs.get(i11);
                                        break;
                                    }
                                }
                                if (z11 || messageObject2.type != 18) {
                                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.g6.f22999a7, 0.3f);
                                    this.E.setAutoRepeat(0);
                                    ImageReceiver imageReceiver = this.E;
                                    ImageLocation forDocument = ImageLocation.getForDocument(document);
                                    Locale locale = Locale.US;
                                    imageReceiver.setImage(forDocument, i0.a.k(messageObject2.stableId, "160_160_nr_messageId="), svgThumb, "tgs", obj, 1);
                                }
                            } else if (str2 != null) {
                                MediaDataController mediaDataController = MediaDataController.getInstance(this.D);
                                if (stickerSetByName == null) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                mediaDataController.loadStickersByEmojiOrName(str2, false, z12);
                            }
                        }
                    }
                    stickerSetByName = null;
                    str2 = null;
                    obj = null;
                    source = this.M1;
                    if (source != null) {
                        rowsCount = source.getRowsCount();
                        while (i12 < rowsCount) {
                            columnsCount = this.M1.getColumnsCount(i12);
                            while (i13 < columnsCount) {
                                BotInlineKeyboard.Button button2 = this.M1.getButton(i12, i13);
                                e0Var = new e0(new s0(this, 0));
                                e0Var.f24238j = (BotInlineKeyboard.ButtonCustom) button2;
                                iconRes = button2.getIconRes();
                                if (iconRes != 0) {
                                    Drawable drawable2 = getResources().getDrawable(iconRes);
                                    e0Var.f24248t = drawable2;
                                    drawable2.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                                }
                                e0Var.f24235f = AndroidUtilities.dp(40.0f);
                                int i29 = e0Var.f24236g | 8;
                                e0Var.f24236g = i29;
                                if (i13 == 0) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                int iB2 = h7.a8.b(i29, 1, z13);
                                e0Var.f24236g = iB2;
                                if (i13 == 1) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                e0Var.f24236g = h7.a8.b(iB2, 2, z14);
                                e0Var.h = new pz0(button2.getText(), (TextPaint) H("paintChatBotButton"));
                                this.L1.add(e0Var);
                            }
                        }
                    }
                    this.f25788z1 = messageObject2.wasUnread;
                    this.f25777v1 = document;
                    if (document != null) {
                        this.E.setAllowStartLottieAnimation(true);
                        i10 = messageObject2.type;
                        if (i10 != 31) {
                            this.E.setDelegate(this.B1);
                        }
                        this.f25780w1 = null;
                        while (i11 < document.video_thumbs.size()) {
                            if ("f".equals(document.video_thumbs.get(i11).type)) {
                                this.f25780w1 = document.video_thumbs.get(i11);
                                break;
                            }
                        }
                        if (z11) {
                            SvgHelper.SvgDrawable svgThumb2 = DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.g6.f22999a7, 0.3f);
                            this.E.setAutoRepeat(0);
                            ImageReceiver imageReceiver2 = this.E;
                            ImageLocation forDocument2 = ImageLocation.getForDocument(document);
                            Locale locale2 = Locale.US;
                            imageReceiver2.setImage(forDocument2, i0.a.k(messageObject2.stableId, "160_160_nr_messageId="), svgThumb2, "tgs", obj, 1);
                        } else {
                            SvgHelper.SvgDrawable svgThumb3 = DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.g6.f22999a7, 0.3f);
                            this.E.setAutoRepeat(0);
                            ImageReceiver imageReceiver3 = this.E;
                            ImageLocation forDocument3 = ImageLocation.getForDocument(document);
                            Locale locale3 = Locale.US;
                            imageReceiver3.setImage(forDocument3, i0.a.k(messageObject2.stableId, "160_160_nr_messageId="), svgThumb3, "tgs", obj, 1);
                        }
                    } else if (str2 != null) {
                        MediaDataController mediaDataController2 = MediaDataController.getInstance(this.D);
                        if (stickerSetByName == null) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        mediaDataController2.loadStickersByEmojiOrName(str2, false, z12);
                    }
                } else if (i17 == 37) {
                    TLRPC.Chat chat = MessagesController.getInstance(this.D).getChat(Long.valueOf(((TLRPC.TL_messageActionChangeCommunity) messageObject2.messageOwner.action).community_id));
                    this.E.setAllowStartLottieAnimation(true);
                    this.E.setDelegate(null);
                    this.E.setRoundRadius(AndroidUtilities.dp(14.0f));
                    this.E.setAutoRepeatCount(1);
                    this.H.q(chat);
                    this.E.setForUserOrChat(chat, new eq(getContext(), AndroidUtilities.dp(14.0f)), chat);
                } else if (i17 == 11) {
                    this.E.setAllowStartLottieAnimation(true);
                    this.E.setDelegate(null);
                    this.E.setRoundRadius(AndroidUtilities.roundMessageSize / 2);
                    this.E.setAutoRepeatCount(1);
                    this.H.n(messageObject2.getDialogId(), null, null);
                    if (messageObject2.messageOwner.action instanceof TLRPC.TL_messageActionUserUpdatedPhoto) {
                        this.E.setImage(null, null, this.H, null, messageObject2, 0);
                    } else {
                        if (messageObject2.strippedThumb != null) {
                            photoSize = null;
                            break;
                        }
                        int size6 = messageObject2.photoThumbs.size();
                        int i30 = 0;
                        while (true) {
                            if (i30 >= size6) {
                                photoSize = null;
                                break;
                            }
                            photoSize = messageObject2.photoThumbs.get(i30);
                            if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                                break;
                            } else {
                                i30++;
                            }
                        }
                        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(messageObject2.photoThumbs, 640);
                        if (closestPhotoSizeWithSize2 != null) {
                            TLRPC.Photo photo2 = messageObject2.messageOwner.action.photo;
                            if (photo2.video_sizes.isEmpty() || !SharedConfig.isAutoplayGifs()) {
                                closestVideoSizeWithSize = null;
                            } else {
                                closestVideoSizeWithSize = FileLoader.getClosestVideoSizeWithSize(photo2.video_sizes, 1000);
                                if (!messageObject2.mediaExists && !DownloadController.getInstance(this.D).canDownloadMedia(4, closestVideoSizeWithSize.size)) {
                                    this.f25772t0 = ImageLocation.getForPhoto(closestVideoSizeWithSize, photo2);
                                    DownloadController.getInstance(this.D).addLoadingFileObserver(FileLoader.getAttachFileName(closestVideoSizeWithSize), messageObject2, this);
                                    closestVideoSizeWithSize = null;
                                }
                            }
                            if (closestVideoSizeWithSize != null) {
                                this.E.setImage(ImageLocation.getForPhoto(closestVideoSizeWithSize, photo2), "g", ImageLocation.getForObject(photoSize, messageObject2.photoThumbsObject), "50_50_b", messageObject2.strippedThumb, 0L, null, messageObject2, 1);
                            } else {
                                this.E.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize2, messageObject2.photoThumbsObject), "150_150", ImageLocation.getForObject(photoSize, messageObject2.photoThumbsObject), "50_50_b", messageObject2.strippedThumb, 0L, null, messageObject2, 1);
                            }
                        } else {
                            this.E.setImageBitmap(this.H);
                        }
                    }
                    this.E.setVisible(!PhotoViewer.M1(messageObject2), false);
                } else {
                    this.E.setAllowStartLottieAnimation(true);
                    this.E.setDelegate(null);
                    this.E.setImageBitmap((Bitmap) null);
                }
            }
            if (this.f25745g0 && this.f25728a0 && this.f25739e0 && (this.f25730b0 || this.f25733c0 || this.f25736d0)) {
                this.f25747h0 = AndroidUtilities.dp(33.0f);
                if (this.f25751j0 == null) {
                    j11 j11Var = new j11(this.D, this, this.U0, true);
                    this.f25751j0 = j11Var;
                    j11Var.f29553r = new s0(this, 1);
                }
                if (this.f25751j0.f(this.D0)) {
                    if (this.Q1) {
                        this.f25751j0.a();
                    }
                    i14 = 0;
                } else {
                    this.f25751j0.b();
                    this.f25751j0 = null;
                    i14 = 0;
                    this.f25747h0 = 0;
                }
            } else {
                j11 j11Var2 = this.f25751j0;
                if (j11Var2 != null) {
                    j11Var2.b();
                    this.f25751j0 = null;
                }
                i14 = 0;
                this.f25747h0 = 0;
            }
            int paddingTop = getPaddingTop();
            int i31 = this.f25747h0;
            if (paddingTop != i31) {
                setPadding(i14, i31, i14, i14);
            }
            this.H1.setVisibility((!L(messageObject) || this.B0.d()) ? 8 : 0);
            wf.c.b(messageObject2);
            requestLayout();
        }
    }

    public final void V(int i10, int i11) {
        this.H0 = i10;
        this.I0 = i11;
    }

    public final void W(float f10, int i10) {
        this.f25770s0 = true;
        this.f25767r0 = i10;
        this.f25762p0 = f10;
        this.f25764q0 = 0.0f;
    }

    public final void X(boolean z10) {
        if (getMeasuredWidth() != 0) {
            x(getMeasuredWidth(), this.F0);
            invalidate();
        }
        if (this.f25779w0) {
            s();
        } else if (z10) {
            AndroidUtilities.runOnUIThread(new s0(this, 3));
        } else {
            requestLayout();
        }
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
            return;
        }
        if (i10 == NotificationCenter.emojiLoaded) {
            invalidate();
            return;
        }
        if (i10 == NotificationCenter.stopSpoilers) {
            setSpoilersSuppressed(true);
            return;
        }
        if (i10 == NotificationCenter.didUpdatePremiumGiftStickers || i10 == NotificationCenter.starGiftsLoaded || i10 == NotificationCenter.didUpdateTonGiftStickers) {
            MessageObject messageObject2 = this.D0;
            if (messageObject2 != null) {
                U(messageObject2, true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.diceStickersDidLoad && Objects.equals(objArr[0], UserConfig.getInstance(this.D).premiumGiftsStickerPack) && (messageObject = this.D0) != null) {
            U(messageObject, true);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != this.H1) {
            return super.drawChild(canvas, view, j10);
        }
        float fA = this.f25757n.a(0.02f);
        canvas.save();
        canvas.scale(fA, fA, (view.getMeasuredWidth() / 2.0f) + view.getX(), (view.getMeasuredHeight() / 2.0f) + view.getY());
        boolean zDrawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return zDrawChild;
    }

    @Override
    public final void f(TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
        t0 t0Var = this.T0;
        if (t0Var != null) {
            t0Var.j2(this, reactionCount, z10, f10, f11);
        }
    }

    public ImageReceiver getAvatarImage() {
        return null;
    }

    @Override
    public int getBoundsLeft() {
        hh.k5 k5Var = this.B0;
        if (k5Var.d()) {
            int width = ((int) (getWidth() - (k5Var.Q.f48502e + AndroidUtilities.dp(8.0f)))) / 2;
            return k5Var.f9594p ? width : Math.min(this.O0, width);
        }
        if (L(this.D0)) {
            return i0.a.B(getWidth(), this.W0, 2, this.f25743f0 / 2);
        }
        int iMin = this.O0;
        ImageReceiver imageReceiver = this.E;
        if (imageReceiver != null && imageReceiver.getVisible()) {
            iMin = Math.min((int) imageReceiver.getImageX(), iMin);
        }
        return (this.f25743f0 / 2) + iMin;
    }

    @Override
    public int getBoundsRight() {
        int iMax;
        int width;
        hh.k5 k5Var = this.B0;
        if (k5Var.d()) {
            int iDp = ((int) ((k5Var.Q.f48502e + AndroidUtilities.dp(8.0f)) + getWidth())) / 2;
            return k5Var.f9594p ? iDp : Math.max(this.P0, iDp);
        }
        if (L(this.D0)) {
            iMax = this.f25743f0 / 2;
            width = (getWidth() + this.W0) / 2;
        } else {
            iMax = this.P0;
            ImageReceiver imageReceiver = this.E;
            if (imageReceiver != null && imageReceiver.getVisible()) {
                iMax = Math.max((int) imageReceiver.getImageX2(), iMax);
            }
            width = this.f25743f0 / 2;
        }
        return width + iMax;
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
        return this.f25778w;
    }

    public ImageReceiver getPhotoImage() {
        return this.E;
    }

    public ig.r0 getReactionsLayout() {
        return this.f25785y0;
    }

    @Override
    public float getSlidingOffsetX() {
        return 0.0f;
    }

    public u0 getTransitionParams() {
        return this.f25741e2;
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
        Runnable runnable = this.f25732b2;
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
            return t0Var.g2(this, this.f25774u0, this.f25776v0);
        }
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        t0 t0Var;
        super.onAttachedToWindow();
        this.Q1 = true;
        this.E.onAttachedToWindow();
        setStarsPaused(false);
        this.f25758n0 = org.telegram.ui.Components.t5.update(0, this, (!this.f25769s || (t0Var = this.T0) == null || t0Var.f()) ? false : true, this.f25758n0, this.I);
        ag.r rVar = this.f25746g1;
        if (rVar != null) {
            rVar.h = org.telegram.ui.Components.t5.update(0, (View) rVar.f633i, false, (org.telegram.ui.Components.p5) rVar.h, (StaticLayout) rVar.f631f);
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
        hh.k5 k5Var = this.B0;
        k5Var.P = true;
        if (k5Var.N != null) {
            k5Var.d.onAttachedToWindow();
            k5Var.f9584e.a();
            k5Var.f9602y.d.onAttachedToWindow();
        }
        ig.r0 r0Var = this.f25785y0;
        ArrayList arrayList = r0Var.v;
        r0Var.G = true;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((ig.o0) arrayList.get(i11)).a();
        }
        j11 j11Var = this.f25751j0;
        if (j11Var != null) {
            j11Var.a();
        }
        qx0 qx0Var = this.C0;
        if (qx0Var != null) {
            qx0Var.d.f31328r0 = qx0Var.f31992b;
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
        this.f25779w0 = false;
        org.telegram.ui.Components.t5.release(this, this.f25758n0);
        ag.r rVar = this.f25746g1;
        if (rVar != null) {
            org.telegram.ui.Components.t5.release((v0) rVar.f633i, (org.telegram.ui.Components.p5) rVar.h);
        }
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.didUpdatePremiumGiftStickers);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.didUpdateTonGiftStickers);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starGiftsLoaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.diceStickersDidLoad);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        this.W.g();
        this.f25741e2.f25689a = false;
        hh.k5 k5Var = this.B0;
        k5Var.P = false;
        k5Var.d.onDetachedFromWindow();
        k5Var.f9584e.b();
        gh.y0 y0Var = k5Var.f9602y;
        y0Var.d.onDetachedFromWindow();
        org.telegram.ui.Components.t5.release((View) null, y0Var.f7648q);
        y0Var.f7648q = null;
        this.f25785y0.q();
        j11 j11Var = this.f25751j0;
        if (j11Var != null) {
            j11Var.b();
        }
        qx0 qx0Var = this.C0;
        if (qx0Var != null) {
            qx0Var.d.f31328r0 = null;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        int i10;
        TextPaint textPaint;
        ArrayList arrayList;
        RadialProgress2 radialProgress2;
        int i11;
        v0 v0Var;
        float f10;
        float fDp;
        float fDp2;
        Canvas canvas2;
        float f11;
        v0 v0Var2;
        float f12;
        float f13;
        pz0 pz0Var;
        float f14;
        float f15;
        int i12;
        TextPaint textPaint2;
        int i13;
        int i14;
        pz0 pz0Var2;
        int iDp;
        t0 t0Var;
        StaticLayout staticLayout;
        ColorFilter colorFilterF;
        int size;
        int i15;
        TextPaint textPaint3;
        TextPaint textPaint4;
        TextPaint textPaint5;
        Canvas canvas3 = canvas;
        canvas3.save();
        canvas3.translate(this.f25743f0 / 2.0f, getPaddingTop());
        MessageObject messageObject = this.D0;
        float fE = this.f25740e1.e(!this.f25734c1);
        int iG = this.V0;
        hh.k5 k5Var = this.B0;
        boolean zD = k5Var.d();
        jh.h7 h7Var = this.W;
        TextPaint textPaint6 = this.f25773t1;
        ImageReceiver imageReceiver = this.E;
        if (!zD && this.C0 == null && L(messageObject)) {
            this.V0 = this.W0 - AndroidUtilities.dp(106.0f);
            if (N()) {
                iG = G(messageObject);
                int iDp2 = AndroidUtilities.dp(16.0f) + AndroidUtilities.dp(4.0f) + this.O + this.K;
                float fDp3 = (this.R - iG) / 2.0f;
                float fDp4 = iDp2;
                if (messageObject.isStoryMention()) {
                    h7Var.d = messageObject.messageOwner.media.storyItem;
                }
                float f16 = iG;
                h7Var.F.set(fDp3, fDp4, fDp3 + f16, f16 + fDp4);
                int i16 = messageObject.type;
                if (i16 == 31 || i16 == 33 || i16 == 34 || i16 == 35) {
                    fDp3 += AndroidUtilities.dp(10.0f);
                    fDp4 += AndroidUtilities.dp(10.0f);
                    iG -= AndroidUtilities.dp(20.0f);
                }
                if (messageObject.type == 37) {
                    fDp3 += AndroidUtilities.dp(2.0f);
                }
                imageReceiver.setImageCoords(fDp3, fDp4, Math.max(0, iG), Math.max(0, iG));
                int i17 = messageObject.type;
                if (i17 == 31 || i17 == 33 || i17 == 34 || i17 == 35) {
                    iG = AndroidUtilities.dp(20.0f) + iG;
                }
            } else {
                int i18 = messageObject.type;
                if (i18 == 11) {
                    int i19 = this.R;
                    int i20 = this.V0;
                    float f17 = i20;
                    imageReceiver.setImageCoords((i19 - i20) / 2.0f, (this.W0 * 0.075f) + this.O + this.K, f17, f17);
                } else if (i18 == 25) {
                    iG = (int) (this.V0 * (AndroidUtilities.isTablet() ? 1.0f : 1.2f));
                    float f18 = iG;
                    imageReceiver.setImageCoords((this.R - iG) / 2.0f, ((this.W0 * 0.075f) + (this.O + this.K)) - AndroidUtilities.dp(22.0f), f18, f18);
                } else if (messageObject.isStarGiftAction()) {
                    float f19 = iG;
                    imageReceiver.setImageCoords((this.R - iG) / 2.0f, (this.W0 * 0.075f) + this.O + this.K + AndroidUtilities.dp(2.0f), f19, f19);
                } else if (messageObject.type == 30) {
                    iG = (int) (this.V0 * 1.1f);
                    TLRPC.Message message = messageObject.messageOwner;
                    if (message == null || (message.action instanceof TLRPC.TL_messageActionStarGift)) {
                        float f20 = iG;
                        imageReceiver.setImageCoords((this.R - iG) / 2.0f, ((this.W0 * 0.075f) + (this.O + this.K)) - AndroidUtilities.dp(12.0f), f20, f20);
                    } else {
                        float f21 = iG;
                        imageReceiver.setImageCoords((this.R - iG) / 2.0f, ((this.W0 * 0.075f) + (this.O + this.K)) - AndroidUtilities.dp(22.0f), f21, f21);
                    }
                } else {
                    iG = (int) (this.V0 * 1.0f);
                    float f22 = iG;
                    imageReceiver.setImageCoords((this.R - iG) / 2.0f, ((this.W0 * 0.075f) + (this.O + this.K)) - AndroidUtilities.dp(4.0f), f22, f22);
                }
                textPaint3 = (TextPaint) H("paintChatActionText");
                this.f25760o0 = textPaint3;
                if (textPaint3 != null) {
                    textPaint4 = this.f25771s1;
                    if (textPaint4 != null && textPaint4.getColor() != this.f25760o0.getColor()) {
                        this.f25771s1.setColor(this.f25760o0.getColor());
                    }
                    textPaint5 = this.f25775u1;
                    if (textPaint5 != null && textPaint5.getColor() != this.f25760o0.getColor()) {
                        textPaint5.setColor(this.f25760o0.getColor());
                        textPaint5.linkColor = this.f25760o0.getColor();
                    }
                    if (textPaint6 != null && textPaint6.getColor() != this.f25760o0.getColor()) {
                        textPaint6.setColor(this.f25760o0.getColor());
                        textPaint6.linkColor = this.f25760o0.getColor();
                    }
                }
            }
            textPaint3 = (TextPaint) H("paintChatActionText");
            this.f25760o0 = textPaint3;
            if (textPaint3 != null) {
                textPaint4 = this.f25771s1;
                if (textPaint4 != null) {
                    this.f25771s1.setColor(this.f25760o0.getColor());
                }
                textPaint5 = this.f25775u1;
                if (textPaint5 != null) {
                    textPaint5.setColor(this.f25760o0.getColor());
                    textPaint5.linkColor = this.f25760o0.getColor();
                }
                if (textPaint6 != null) {
                    textPaint6.setColor(this.f25760o0.getColor());
                    textPaint6.linkColor = this.f25760o0.getColor();
                }
            }
        }
        int i21 = iG;
        z(canvas3, false);
        boolean zD2 = k5Var.d();
        RadialProgress2 radialProgress3 = this.f25783x1;
        if (zD2) {
            canvas3.save();
            float width = (getWidth() - k5Var.c()) / 2.0f;
            this.f25787z0 = width;
            float fDp5 = k5Var.f9594p ? AndroidUtilities.dp(4.0f) : AndroidUtilities.dp(16.0f) + this.O + this.K;
            this.A0 = fDp5;
            canvas3.translate(width, fDp5);
            k5Var.a(canvas3);
            t0 t0Var2 = this.T0;
            if (t0Var2 == null || t0Var2.f()) {
                k5Var.b(canvas3);
            }
            canvas3.restore();
        } else {
            if (this.C0 == null) {
                if (L(messageObject) || (messageObject != null && messageObject.type == 11)) {
                    gh.y1 y1Var = this.G0;
                    if (y1Var != null && ((i10 = messageObject.type) == 31 || i10 == 37 || i10 == 33)) {
                        y1Var.setBounds((int) (imageReceiver.getImageX() - AndroidUtilities.dp(13.33f)), (int) (imageReceiver.getImageY() - AndroidUtilities.dp(14.0f)), (int) (imageReceiver.getImageWidth() + imageReceiver.getImageX() + AndroidUtilities.dp(13.33f)), (int) (imageReceiver.getImageHeight() + imageReceiver.getImageY() + AndroidUtilities.dp(14.0f)));
                        this.G0.draw(canvas3);
                    }
                    if (this.F != null) {
                        canvas3.save();
                        canvas3.translate(imageReceiver.getImageX(), imageReceiver.getImageY());
                        Path path = this.G;
                        if (path == null) {
                            this.G = new Path();
                        } else {
                            path.rewind();
                        }
                        this.G.addCircle(imageReceiver.getImageWidth() / 2.0f, imageReceiver.getImageHeight() / 2.0f, imageReceiver.getImageWidth() / 2.0f, Path.Direction.CW);
                        canvas3.clipPath(this.G);
                        this.F.setBounds(0, 0, (int) imageReceiver.getImageWidth(), (int) imageReceiver.getImageHeight());
                        this.F.draw(canvas3);
                        canvas3.restore();
                    } else if (messageObject.isStoryMention()) {
                        TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                        long j10 = messageMedia.user_id;
                        h7Var.f13393c = messageMedia.f22402id;
                        jh.l7.h(j10, canvas3, imageReceiver, h7Var);
                    } else {
                        imageReceiver.draw(canvas3);
                    }
                    if (messageObject.type == 37) {
                        gf.s.a(canvas3, org.telegram.ui.ActionBar.g6.S0, imageReceiver.getImageX() + AndroidUtilities.dp(26.0f), imageReceiver.getImageY() + AndroidUtilities.dp(26.0f), AndroidUtilities.dp(52.0f));
                    }
                    radialProgress3.f26464a.set(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageWidth() + imageReceiver.getImageX(), imageReceiver.getImageHeight() + imageReceiver.getImageY());
                    int i22 = messageObject.type;
                    if (i22 == 21) {
                        j40 j40Var = MessagesController.getInstance(this.D).photoSuggestion.get(messageObject.messageOwner.local_id);
                        if (j40Var != null) {
                            radialProgress3.o(j40Var.S, true);
                            radialProgress3.setCircleRadius(((int) (imageReceiver.getImageWidth() * 0.5f)) + 1);
                            radialProgress3.G = AndroidUtilities.dp(24.0f);
                            radialProgress3.g(org.telegram.ui.ActionBar.g6.f23205le, org.telegram.ui.ActionBar.g6.f23223me, org.telegram.ui.ActionBar.g6.f23241ne, org.telegram.ui.ActionBar.g6.f23258oe);
                            if (j40Var.S == 1.0f) {
                                radialProgress3.setIcon(4, true, true);
                            } else {
                                radialProgress3.setIcon(3, true, true);
                            }
                        }
                        radialProgress3.draw(canvas3);
                    } else if (i22 == 22) {
                        float fI = I(messageObject);
                        radialProgress3.o(fI, true);
                        radialProgress3.setCircleRadius(AndroidUtilities.dp(26.0f));
                        radialProgress3.G = AndroidUtilities.dp(24.0f);
                        radialProgress3.g(org.telegram.ui.ActionBar.g6.f23205le, org.telegram.ui.ActionBar.g6.f23223me, org.telegram.ui.ActionBar.g6.f23241ne, org.telegram.ui.ActionBar.g6.f23258oe);
                        if (fI == 1.0f) {
                            radialProgress3.setIcon(4, true, true);
                        } else {
                            radialProgress3.setIcon(3, true, true);
                        }
                        radialProgress3.draw(canvas3);
                    }
                }
                textPaint = this.f25760o0;
                arrayList = this.f25755l0;
                if (textPaint != null || this.I == null) {
                    radialProgress2 = radialProgress3;
                    textPaint6 = textPaint6;
                    i11 = 22;
                } else {
                    canvas3.save();
                    canvas3.translate(this.P, this.O);
                    if (this.I.getPaint() != this.f25760o0) {
                        s();
                    }
                    canvas3.save();
                    eh.k.d(canvas3, arrayList);
                    eh.k.f(canvas3, this.I);
                    t0 t0Var3 = this.T0;
                    if (t0Var3 == null || t0Var3.f()) {
                        StaticLayout staticLayout2 = this.I;
                        radialProgress2 = radialProgress3;
                        i11 = 22;
                        org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas, staticLayout2, this.f25758n0, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, staticLayout2 == null ? null : F(staticLayout2.getPaint().getColor()));
                        canvas3 = canvas;
                    } else {
                        radialProgress2 = radialProgress3;
                        i11 = 22;
                    }
                    canvas3.restore();
                    int size2 = arrayList.size();
                    int i23 = 0;
                    while (i23 < size2) {
                        Object obj = arrayList.get(i23);
                        i23++;
                        eh.k kVar = (eh.k) obj;
                        kVar.h(this.I.getPaint().getColor());
                        kVar.draw(canvas3);
                    }
                    canvas3.restore();
                }
                if (this.f25760o0 != null && this.L != null) {
                    canvas3.save();
                    canvas3.translate(this.Q, this.O - this.M);
                    if (this.L.getPaint() != this.f25760o0) {
                        s();
                    }
                    canvas3.save();
                    eh.k.d(canvas3, arrayList);
                    eh.k.f(canvas3, this.L);
                    t0Var = this.T0;
                    if (t0Var != null || t0Var.f()) {
                        StaticLayout staticLayout3 = this.L;
                        org.telegram.ui.Components.p5 p5Var = this.f25758n0;
                        staticLayout = this.I;
                        if (staticLayout == null) {
                            colorFilterF = null;
                        } else {
                            colorFilterF = F(staticLayout.getPaint().getColor());
                        }
                        org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas, staticLayout3, p5Var, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, colorFilterF);
                        canvas3 = canvas;
                    }
                    canvas3.restore();
                    size = arrayList.size();
                    i15 = 0;
                    while (i15 < size) {
                        Object obj2 = arrayList.get(i15);
                        i15++;
                        eh.k kVar2 = (eh.k) obj2;
                        kVar2.h(this.L.getPaint().getColor());
                        kVar2.draw(canvas3);
                    }
                    canvas3.restore();
                }
                if (k5Var.d() && L(messageObject)) {
                    canvas3.save();
                    float fDp6 = (this.R - this.W0) / 2.0f;
                    if (messageObject.type != i11) {
                        fDp6 += AndroidUtilities.dp(8.0f);
                    }
                    float f23 = fDp6;
                    if (N()) {
                        RectF rectF = this.A1;
                        float fDp7 = rectF != null ? rectF.top : AndroidUtilities.dp(4.0f) + this.O + this.K;
                        if (i21 > 0) {
                            f10 = 16.0f;
                            iDp = org.telegram.messenger.y1.D(16.0f, 2, i21);
                        } else {
                            f10 = 16.0f;
                            iDp = AndroidUtilities.dp(16.0f);
                        }
                        fDp = fDp7 + iDp;
                    } else {
                        f10 = 16.0f;
                        float f24 = (this.W0 * 0.075f) + this.O + this.K;
                        if (messageObject.type != 21) {
                            i21 = this.V0;
                        }
                        float fDp8 = f24 + i21 + AndroidUtilities.dp(4.0f);
                        if (messageObject.type == 21) {
                            fDp8 += AndroidUtilities.dp(16.0f);
                        }
                        fDp = fDp8;
                        if (messageObject.isStarGiftAction()) {
                            fDp += AndroidUtilities.dp(12.0f);
                        } else if (messageObject.type == 30 && !messageObject.isStarGiftAction()) {
                            fDp -= AndroidUtilities.dp(3.66f);
                        }
                    }
                    int i24 = messageObject.type;
                    if (i24 == 31 || i24 == 37 || i24 == 33) {
                        fDp -= AndroidUtilities.dp(3.66f);
                    }
                    canvas3.translate(f23, fDp);
                    if (this.X0 != null) {
                        canvas3.save();
                        canvas3.translate(((this.W0 - AndroidUtilities.dp(f10)) - this.X0.getWidth()) / 2.0f, 0.0f);
                        this.X0.draw(canvas3);
                        canvas3.restore();
                        float height = this.X0.getHeight() + fDp;
                        if (this.f25729a1 != null) {
                            canvas3.save();
                            canvas3.translate(((this.W0 - AndroidUtilities.dp(f10)) - this.f25729a1.getWidth()) / 2.0f, AndroidUtilities.dp(4.0f) + this.X0.getHeight());
                            this.f25729a1.draw(canvas3);
                            canvas3.restore();
                            height += AndroidUtilities.dp(10.0f) + this.f25729a1.getHeight();
                        }
                        fDp2 = height + AndroidUtilities.dp(messageObject.type == 25 ? 6.0f : 0.0f);
                    } else {
                        fDp2 = fDp - AndroidUtilities.dp(4.0f);
                    }
                    float fDp9 = fDp2;
                    canvas3.restore();
                    if (this.X0 == null || (pz0Var2 = this.Z0) == null) {
                        canvas2 = canvas3;
                        f11 = 0.0f;
                    } else {
                        float fL = pz0Var2.l() + AndroidUtilities.dp(12.0f);
                        float fA = com.google.android.recaptcha.internal.a.A(this.W0 - AndroidUtilities.dp(f10), fL, 2.0f, f23);
                        float height2 = fDp + this.X0.getHeight() + AndroidUtilities.dp(14.0f);
                        if (this.Y0 == null) {
                            this.Y0 = new Paint(1);
                        }
                        this.Y0.setColor(org.telegram.ui.ActionBar.g6.e1() ? 285212671 : 268435456);
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        rectF2.set(fA, height2 - AndroidUtilities.dp(8.0f), fL + fA, AndroidUtilities.dp(8.0f) + height2);
                        canvas3.drawRoundRect(rectF2, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.Y0);
                        Canvas canvas4 = canvas3;
                        f11 = 0.0f;
                        this.Z0.c(fA + AndroidUtilities.dp(6.0f), height2, 1.0f, -855638017, canvas4);
                        canvas2 = canvas4;
                        fDp9 += AndroidUtilities.dp(24.0f);
                    }
                    float fDp10 = fDp9 + AndroidUtilities.dp(4.0f);
                    if (messageObject.type == 18) {
                        fDp10 += AndroidUtilities.dp(2.0f);
                    }
                    float f25 = fDp10;
                    canvas2.save();
                    canvas2.translate(f23, f25);
                    if (messageObject.type == i11) {
                        RadialProgress2 radialProgress4 = radialProgress2;
                        if ((radialProgress4.f26466c ? radialProgress4.f26471j : radialProgress4.f26470i).b() == 1.0f) {
                            i12 = 4;
                            if (radialProgress4.a() == 4) {
                                if (this.f25746g1 != null) {
                                    canvas2.save();
                                    canvas2.translate((this.W0 - ((StaticLayout) this.f25746g1.f631f).getWidth()) / 2.0f, f11);
                                    ag.r rVar = this.f25746g1;
                                    rVar.f627a = ((this.W0 - ((StaticLayout) rVar.f631f).getWidth()) / 2.0f) + f23;
                                    this.f25746g1.f628b = f25;
                                    int color = textPaint6.getColor();
                                    ag.r rVar2 = this.f25746g1;
                                    f12 = 8.0f;
                                    f13 = 16.0f;
                                    eh.k.g(this, false, color, 0, (AtomicReference) rVar2.f632g, 1, (StaticLayout) rVar2.f631f, rVar2.f630e, canvas, false);
                                    ag.r rVar3 = this.f25746g1;
                                    org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas, (StaticLayout) rVar3.f631f, (org.telegram.ui.Components.p5) rVar3.h, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, F(textPaint6.getColor()));
                                    canvas3 = canvas;
                                    canvas3.restore();
                                    v0Var = this;
                                } else {
                                    f12 = 8.0f;
                                    f13 = 16.0f;
                                    v0Var = this;
                                    canvas3 = canvas2;
                                }
                            }
                        } else {
                            i12 = 4;
                        }
                        canvas3 = canvas2;
                        f12 = 8.0f;
                        f13 = 16.0f;
                        if (this.f25761o1 == null) {
                            TextPaint textPaint7 = new TextPaint();
                            this.f25759n1 = textPaint7;
                            textPaint7.setTextSize(AndroidUtilities.dp(13.0f));
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.ActionSettingWallpaper));
                            int iIndexOf = spannableStringBuilder.toString().indexOf("...");
                            if (iIndexOf < 0) {
                                iIndexOf = spannableStringBuilder.toString().indexOf("…");
                                i14 = 1;
                            } else {
                                i14 = 3;
                            }
                            if (iIndexOf >= 0) {
                                SpannableString spannableString = new SpannableString("…");
                                jh.o9 o9Var = new jh.o9();
                                o9Var.f13770r = true;
                                o9Var.a(this);
                                spannableString.setSpan(o9Var, 0, spannableString.length(), 33);
                                spannableStringBuilder.replace(iIndexOf, i14 + iIndexOf, (CharSequence) spannableString);
                            }
                            TextPaint textPaint8 = this.f25759n1;
                            ag.r rVar4 = this.f25746g1;
                            this.f25761o1 = new StaticLayout(spannableStringBuilder, textPaint8, rVar4 == null ? 1 : rVar4.f629c, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                        }
                        float fI2 = I(messageObject);
                        if (this.f25765q1 == null || this.f25763p1 != fI2) {
                            this.f25763p1 = fI2;
                            String strK = a9.p.k((int) (fI2 * 100.0f), "%", new StringBuilder());
                            ag.r rVar5 = this.f25746g1;
                            TextPaint textPaint9 = textPaint6;
                            textPaint2 = textPaint9;
                            this.f25765q1 = new StaticLayout(strK, textPaint9, rVar5 == null ? 1 : rVar5.f629c, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                        } else {
                            textPaint2 = textPaint6;
                        }
                        this.f25759n1.setColor(textPaint2.getColor());
                        if (radialProgress4.a() == i12) {
                            float fB = (radialProgress4.f26466c ? radialProgress4.f26471j : radialProgress4.f26470i).b();
                            int color2 = textPaint2.getColor();
                            float f26 = 1.0f - fB;
                            this.f25759n1.setAlpha((int) (Color.alpha(color2) * f26));
                            textPaint2.setAlpha((int) (Color.alpha(color2) * fB));
                            textPaint2.linkColor = textPaint2.getColor();
                            if (this.f25746g1 != null) {
                                float f27 = (fB * 0.2f) + 0.8f;
                                canvas3.save();
                                canvas3.scale(f27, f27, this.W0 / 2.0f, ((StaticLayout) this.f25746g1.f631f).getHeight() / 2.0f);
                                canvas3.translate((this.W0 - ((StaticLayout) this.f25746g1.f631f).getWidth()) / 2.0f, 0.0f);
                                ag.r rVar6 = this.f25746g1;
                                rVar6.f627a = ((this.W0 - ((StaticLayout) rVar6.f631f).getWidth()) / 2.0f) + f23;
                                this.f25746g1.f628b = f25;
                                int color3 = textPaint2.getColor();
                                ag.r rVar7 = this.f25746g1;
                                i13 = color2;
                                eh.k.g(this, false, color3, 0, (AtomicReference) rVar7.f632g, 1, (StaticLayout) rVar7.f631f, rVar7.f630e, canvas3, false);
                                ag.r rVar8 = this.f25746g1;
                                v0Var2 = this;
                                org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas, (StaticLayout) rVar8.f631f, (org.telegram.ui.Components.p5) rVar8.h, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, F(textPaint2.getColor()));
                                canvas3 = canvas;
                                canvas3.restore();
                            } else {
                                v0Var2 = this;
                                i13 = color2;
                            }
                            textPaint2.setAlpha((int) (Color.alpha(i13) * f26));
                            textPaint2.linkColor = textPaint2.getColor();
                            float f28 = (f26 * 0.2f) + 0.8f;
                            canvas3.save();
                            canvas3.scale(f28, f28, v0Var2.W0 / 2.0f, v0Var2.f25761o1.getHeight() / 2.0f);
                            canvas3.translate((v0Var2.W0 - v0Var2.f25761o1.getWidth()) / 2.0f, 0.0f);
                            eh.k.f(canvas3, v0Var2.f25761o1);
                            canvas3.restore();
                            canvas3.save();
                            canvas3.translate(0.0f, AndroidUtilities.dp(4.0f) + v0Var2.f25761o1.getHeight());
                            canvas3.scale(f28, f28, v0Var2.W0 / 2.0f, v0Var2.f25765q1.getHeight() / 2.0f);
                            canvas3.translate((v0Var2.W0 - v0Var2.f25765q1.getWidth()) / 2.0f, 0.0f);
                            eh.k.f(canvas3, v0Var2.f25765q1);
                            canvas3.restore();
                            textPaint2.setColor(i13);
                            textPaint2.linkColor = i13;
                        } else {
                            v0Var2 = this;
                            canvas3.save();
                            canvas3.translate((v0Var2.W0 - v0Var2.f25761o1.getWidth()) / 2.0f, 0.0f);
                            v0Var2.f25761o1.draw(canvas3);
                            canvas3.restore();
                            canvas3.save();
                            canvas3.translate((v0Var2.W0 - v0Var2.f25765q1.getWidth()) / 2.0f, AndroidUtilities.dp(4.0f) + v0Var2.f25761o1.getHeight());
                            eh.k.f(canvas3, v0Var2.f25765q1);
                            canvas3.restore();
                        }
                        v0Var = v0Var2;
                    } else {
                        v0Var2 = this;
                        canvas3 = canvas2;
                        TextPaint textPaint10 = textPaint6;
                        f12 = 8.0f;
                        f13 = 16.0f;
                        ag.r rVar9 = v0Var2.f25746g1;
                        if (rVar9 != null) {
                            float height3 = ((StaticLayout) rVar9.f631f).getHeight();
                            if (fE < 1.0f) {
                                height3 = AndroidUtilities.lerp(v0Var2.f25737d1, height3, fE);
                                RectF rectF3 = AndroidUtilities.rectTmp;
                                rectF3.set(0.0f, -AndroidUtilities.dp(20.0f), v0Var2.getWidth(), height3);
                                canvas3.saveLayerAlpha(rectF3, 255, 31);
                            } else {
                                canvas3.save();
                            }
                            canvas3.translate(((v0Var2.W0 - AndroidUtilities.dp(16.0f)) - ((StaticLayout) v0Var2.f25746g1.f631f).getWidth()) / 2.0f, 0.0f);
                            v0Var2.f25746g1.f627a = (((v0Var2.W0 - AndroidUtilities.dp(16.0f)) - ((StaticLayout) v0Var2.f25746g1.f631f).getWidth()) / 2.0f) + f23;
                            ag.r rVar10 = v0Var2.f25746g1;
                            rVar10.f628b = f25;
                            int color4 = rVar10.d.getColor();
                            ag.r rVar11 = v0Var2.f25746g1;
                            float f29 = height3;
                            eh.k.g(v0Var2, false, color4, 0, (AtomicReference) rVar11.f632g, 1, (StaticLayout) rVar11.f631f, rVar11.f630e, canvas3, false);
                            ag.r rVar12 = v0Var2.f25746g1;
                            StaticLayout staticLayout4 = (StaticLayout) rVar12.f631f;
                            org.telegram.ui.Components.p5 p5Var2 = (org.telegram.ui.Components.p5) rVar12.h;
                            ColorFilter colorFilterF2 = v0Var2.F(textPaint10.getColor());
                            v0Var = v0Var2;
                            org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas, staticLayout4, p5Var2, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, colorFilterF2);
                            canvas3 = canvas;
                            if (fE < 1.0f && v0Var.f25754k1 != null) {
                                canvas3.save();
                                if (v0Var.f25744f1 == null) {
                                    v0Var.f25744f1 = new v10();
                                }
                                canvas3.translate((-((v0Var.W0 - AndroidUtilities.dp(16.0f)) - ((StaticLayout) v0Var.f25746g1.f631f).getWidth())) / 2.0f, 0.0f);
                                RectF rectF4 = AndroidUtilities.rectTmp;
                                rectF4.set((v0Var.f25748h1 - v0Var.f25754k1.h()) + AndroidUtilities.dp(8.0f), (v0Var.f25750i1 - v0Var.f25752j1) - AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f) + v0Var.f25748h1, v0Var.f25750i1);
                                float f30 = 1.0f - fE;
                                v0Var.f25744f1.a(canvas3, rectF4, f30);
                                rectF4.set((v0Var.f25748h1 - v0Var.f25754k1.h()) - AndroidUtilities.dp(16.0f), (v0Var.f25750i1 - v0Var.f25752j1) - AndroidUtilities.dp(6.0f), (v0Var.f25748h1 - v0Var.f25754k1.h()) + AndroidUtilities.dp(8.0f), v0Var.f25750i1);
                                v0Var.f25744f1.b(canvas3, rectF4, 2, f30);
                                rectF4.set(0.0f, f29 - AndroidUtilities.dp(12.0f), v0Var.getWidth(), f29);
                                v0Var.f25744f1.b(canvas3, rectF4, 3, (1.0f - f30) * f30 * 4.0f);
                                canvas3.restore();
                            }
                            canvas3.restore();
                            if (fE < 1.0f && (pz0Var = v0Var.f25754k1) != null) {
                                pz0Var.c((v0Var.f25748h1 - pz0Var.h()) + AndroidUtilities.dp(5.0f), (v0Var.f25750i1 - (v0Var.f25752j1 / 2.0f)) - AndroidUtilities.dp(1.0f), 1.0f - fE, v0Var.f25746g1.d.getColor(), canvas3);
                            }
                        } else {
                            v0Var = v0Var2;
                        }
                    }
                    canvas3.restore();
                    if (v0Var.X0 == null) {
                        AndroidUtilities.dp(f12);
                    }
                    ag.r rVar13 = v0Var.f25746g1;
                    if (rVar13 != null) {
                        AndroidUtilities.lerp(v0Var.f25737d1, ((StaticLayout) rVar13.f631f).getHeight(), fE);
                    }
                    StaticLayout staticLayout5 = v0Var.l1;
                    if (staticLayout5 != null) {
                        staticLayout5.getHeight();
                    }
                    v0Var.getHeight();
                    AndroidUtilities.dp(f12);
                    org.telegram.ui.ActionBar.c6 c6Var = v0Var.U0;
                    if (c6Var != null) {
                        c6Var.m(v0Var.f25764q0, v0Var.f25762p0 + AndroidUtilities.dp(4.0f), v0Var.getMeasuredWidth(), v0Var.f25767r0);
                    } else {
                        org.telegram.ui.ActionBar.g6.q(v0Var.f25764q0, v0Var.f25762p0 + AndroidUtilities.dp(4.0f), v0Var.getMeasuredWidth(), v0Var.f25767r0);
                    }
                    float fA2 = v0Var.f25757n.a(0.02f);
                    canvas3.save();
                    RectF rectF5 = v0Var.f25753k0;
                    canvas3.scale(fA2, fA2, rectF5.centerX(), rectF5.centerY());
                    if (v0Var.l1 != null) {
                        canvas3.drawRoundRect(rectF5, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), v0Var.H("paintChatActionBackgroundSelected"));
                        if (v0Var.J()) {
                            canvas3.drawRoundRect(rectF5, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), v0Var.H("paintChatActionBackgroundDarken"));
                        }
                        float f31 = v0Var.O1;
                        Paint paint = v0Var.P1;
                        if (f31 > 0.0f) {
                            canvas3.drawRoundRect(rectF5, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), paint);
                        }
                        if (v0Var.getMessageObject().type == 31 || v0Var.getMessageObject().type == 37 || v0Var.getMessageObject().type == 33) {
                            boolean zA = c6Var != null ? c6Var.a() : org.telegram.ui.ActionBar.g6.e1();
                            int color5 = paint.getColor();
                            paint.setColor(zA ? 620756991 : 268435456);
                            canvas3.drawRoundRect(rectF5, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), paint);
                            paint.setColor(color5);
                        }
                        if (v0Var.getMessageObject().type == 31 || v0Var.getMessageObject().type == 37 || v0Var.getMessageObject().type == 33 || v0Var.getMessageObject().type == 21 || v0Var.getMessageObject().type == 22 || v0Var.getMessageObject().type == 24) {
                            v0Var.invalidate();
                        } else {
                            Path path2 = v0Var.I1;
                            path2.rewind();
                            path2.addRoundRect(rectF5, AndroidUtilities.dp(f13), AndroidUtilities.dp(f13), Path.Direction.CW);
                            canvas3.save();
                            canvas3.clipPath(path2);
                            v0Var.J1.d(canvas3);
                            if (!v0Var.J1.f504g) {
                                v0Var.invalidate();
                            }
                            canvas3.restore();
                        }
                    }
                    boolean z10 = messageObject.settingAvatar;
                    if (z10) {
                        float f32 = v0Var.V;
                        if (f32 != 1.0f) {
                            v0Var.V = f32 + 0.10666667f;
                        } else if (z10) {
                            f14 = v0Var.V;
                            f15 = 0.0f;
                            if (f14 != 0.0f) {
                                v0Var.V = f14 - 0.10666667f;
                            }
                        }
                        f15 = 0.0f;
                    } else if (z10) {
                        f15 = 0.0f;
                    } else {
                        f14 = v0Var.V;
                        f15 = 0.0f;
                        if (f14 != 0.0f) {
                            v0Var.V = f14 - 0.10666667f;
                        }
                    }
                    float fClamp = Utilities.clamp(v0Var.V, 1.0f, f15);
                    v0Var.V = fClamp;
                    if (fClamp != f15) {
                        if (v0Var.U == null) {
                            v0Var.U = new RadialProgressView(v0Var.getContext());
                        }
                        int iDp3 = AndroidUtilities.dp(f13);
                        canvas3.save();
                        float f33 = v0Var.V;
                        canvas3.scale(f33, f33, rectF5.centerX(), rectF5.centerY());
                        v0Var.U.setSize(iDp3);
                        v0Var.U.setProgressColor(org.telegram.ui.ActionBar.g6.u0(org.telegram.ui.ActionBar.g6.f23150ic));
                        v0Var.U.a(canvas3, rectF5.centerX(), rectF5.centerY());
                        canvas3.restore();
                    }
                    if (v0Var.V != 1.0f && v0Var.l1 != null) {
                        canvas3.save();
                        float f34 = 1.0f - v0Var.V;
                        canvas3.scale(f34, f34, rectF5.centerX(), rectF5.centerY());
                        canvas3.translate(f23, rectF5.top + AndroidUtilities.dp(7.0f));
                        canvas3.translate(((v0Var.W0 - AndroidUtilities.dp(f13)) - v0Var.l1.getWidth()) / 2.0f, 0.0f);
                        v0Var.l1.draw(canvas3);
                        canvas3.restore();
                    }
                    if (messageObject.flickerLoading) {
                        if (v0Var.f25766r == null) {
                            t80 t80Var = new t80(c6Var);
                            v0Var.f25766r = t80Var;
                            t80Var.g();
                            t80 t80Var2 = v0Var.f25766r;
                            t80Var2.C = true;
                            t80Var2.f(org.telegram.ui.ActionBar.g6.l1(0.08f, -1), org.telegram.ui.ActionBar.g6.l1(0.2f, -1), org.telegram.ui.ActionBar.g6.l1(0.2f, -1), org.telegram.ui.ActionBar.g6.l1(0.7f, -1));
                            v0Var.f25766r.f32710w.setStrokeWidth(AndroidUtilities.dp(1.0f));
                        }
                        t80 t80Var3 = v0Var.f25766r;
                        t80Var3.f32693c = -1L;
                        t80Var3.d(rectF5);
                        v0Var.f25766r.j(16.0f);
                        v0Var.f25766r.draw(canvas3);
                    } else {
                        t80 t80Var4 = v0Var.f25766r;
                        if (t80Var4 != null) {
                            t80Var4.d(rectF5);
                            v0Var.f25766r.j(16.0f);
                            v0Var.f25766r.a();
                            v0Var.f25766r.draw(canvas3);
                            if (v0Var.f25766r.b()) {
                                v0Var.f25766r.f32692b = -1L;
                            }
                        }
                    }
                    canvas3.restore();
                    if (v0Var.A1 != null && v0Var.F1 != null && v0Var.G1 != null) {
                        Paint paintH = v0Var.H("paintChatActionBackground");
                        Paint paintH2 = v0Var.H("paintChatActionBackgroundDarken");
                        float fDp11 = (v0Var.A1.right - AndroidUtilities.dp(65.0f)) + AndroidUtilities.dp(2.0f);
                        float fDp12 = v0Var.A1.top - AndroidUtilities.dp(2.0f);
                        if (c6Var != null) {
                            c6Var.m(v0Var.f25764q0 + fDp11, v0Var.f25762p0 + AndroidUtilities.dp(4.0f) + fDp12, v0Var.getMeasuredWidth(), v0Var.f25767r0);
                        } else {
                            org.telegram.ui.ActionBar.g6.q(v0Var.f25764q0 + fDp11, v0Var.f25762p0 + AndroidUtilities.dp(4.0f) + fDp12, v0Var.getMeasuredWidth(), v0Var.f25767r0);
                        }
                        canvas3.save();
                        canvas3.translate(fDp11, fDp12);
                        ColorFilter colorFilter = paintH.getColorFilter();
                        PathEffect pathEffect = paintH.getPathEffect();
                        boolean zA2 = c6Var != null ? c6Var.a() : org.telegram.ui.ActionBar.g6.e1();
                        if (v0Var.D1 == null || v0Var.C1 != zA2) {
                            ColorMatrix colorMatrix = new ColorMatrix();
                            if ((paintH.getColorFilter() instanceof ColorMatrixColorFilter) && Build.VERSION.SDK_INT >= 26) {
                                ((ColorMatrixColorFilter) paintH.getColorFilter()).getColorMatrix(colorMatrix);
                            }
                            AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, zA2 ? 0.1f : -0.08f);
                            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, zA2 ? 0.15f : 0.1f);
                            v0Var.D1 = new ColorMatrixColorFilter(colorMatrix);
                            v0Var.C1 = zA2;
                        }
                        paintH.setColorFilter(v0Var.D1);
                        paintH.setPathEffect(v0Var.E1);
                        canvas3.drawPath(v0Var.F1, paintH);
                        paintH.setColorFilter(colorFilter);
                        paintH.setPathEffect(pathEffect);
                        if (v0Var.J()) {
                            PathEffect pathEffect2 = paintH2.getPathEffect();
                            paintH2.setPathEffect(v0Var.E1);
                            canvas3.drawPath(v0Var.F1, paintH2);
                            paintH2.setPathEffect(pathEffect2);
                        }
                        canvas3.rotate(45.0f, AndroidUtilities.dp(40.43f), AndroidUtilities.dp(24.56f));
                        v0Var.G1.c(AndroidUtilities.dp(40.43f) - (v0Var.G1.h() / 2.0f), AndroidUtilities.dp(26.0f), 1.0f, -1, canvas3);
                        canvas3.restore();
                    }
                } else {
                    v0Var = this;
                }
                v0Var.C(canvas3, false);
                v0Var.f25741e2.a();
                canvas3.restore();
            }
            canvas3.save();
            this.C0.a(canvas3);
            canvas3.restore();
        }
        textPaint = this.f25760o0;
        arrayList = this.f25755l0;
        if (textPaint != null) {
            radialProgress2 = radialProgress3;
            textPaint6 = textPaint6;
            i11 = 22;
        } else {
            radialProgress2 = radialProgress3;
            textPaint6 = textPaint6;
            i11 = 22;
        }
        if (this.f25760o0 != null) {
            canvas3.save();
            canvas3.translate(this.Q, this.O - this.M);
            if (this.L.getPaint() != this.f25760o0) {
                s();
            }
            canvas3.save();
            eh.k.d(canvas3, arrayList);
            eh.k.f(canvas3, this.L);
            t0Var = this.T0;
            if (t0Var != null) {
                StaticLayout staticLayout6 = this.L;
                org.telegram.ui.Components.p5 p5Var3 = this.f25758n0;
                staticLayout = this.I;
                if (staticLayout == null) {
                    colorFilterF = null;
                } else {
                    colorFilterF = F(staticLayout.getPaint().getColor());
                }
                org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas, staticLayout6, p5Var3, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, colorFilterF);
                canvas3 = canvas;
            } else {
                StaticLayout staticLayout7 = this.L;
                org.telegram.ui.Components.p5 p5Var4 = this.f25758n0;
                staticLayout = this.I;
                if (staticLayout == null) {
                    colorFilterF = null;
                } else {
                    colorFilterF = F(staticLayout.getPaint().getColor());
                }
                org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas, staticLayout7, p5Var4, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, colorFilterF);
                canvas3 = canvas;
            }
            canvas3.restore();
            size = arrayList.size();
            i15 = 0;
            while (i15 < size) {
                Object obj3 = arrayList.get(i15);
                i15++;
                eh.k kVar3 = (eh.k) obj3;
                kVar3.h(this.L.getPaint().getColor());
                kVar3.draw(canvas3);
            }
            canvas3.restore();
        }
        if (k5Var.d()) {
            v0Var = this;
        } else {
            v0Var = this;
        }
        v0Var.C(canvas3, false);
        v0Var.f25741e2.a();
        canvas3.restore();
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        MessageObject messageObject = this.D0;
        if (TextUtils.isEmpty(this.F0) && messageObject == null) {
            return;
        }
        if (this.Z1 == null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(!TextUtils.isEmpty(this.F0) ? this.F0 : messageObject.messageText);
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
        RectF rectF = this.f25753k0;
        this.H1.layout((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int iDp;
        float f10;
        float fDp;
        float fDp2;
        float f11;
        TLRPC.Message message;
        int i12;
        int iDp2;
        int i13;
        int iDp3;
        int i14;
        MessageObject messageObject = this.D0;
        if (messageObject == null && this.F0 == null) {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(14.0f) + this.f25747h0 + this.K);
            return;
        }
        int iDp4 = 0;
        if (L(messageObject)) {
            this.W0 = Math.min((int) (AndroidUtilities.isTablet() ? AndroidUtilities.getMinTabletSide() * 0.6f : (AndroidUtilities.displaySize.x * 0.62f) - AndroidUtilities.dp(34.0f)), ((AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(64.0f));
            if ((!AndroidUtilities.isTablet() && ((i14 = messageObject.type) == 18 || i14 == 30 || M())) || messageObject.type == 35) {
                this.W0 = (int) (this.W0 * 1.2f);
            }
            this.V0 = this.W0 - AndroidUtilities.dp(106.0f);
            if (messageObject.type == 31) {
                this.W0 = Math.min(this.W0, AndroidUtilities.dp(192.0f));
                this.V0 = AndroidUtilities.dp(78.0f);
            }
            if (messageObject.type == 33) {
                this.W0 = Math.min(this.W0, AndroidUtilities.dp(220.0f));
                this.V0 = AndroidUtilities.dp(78.0f);
            }
            int i15 = messageObject.type;
            ImageReceiver imageReceiver = this.E;
            if (i15 == 37) {
                this.V0 = AndroidUtilities.dp(52.0f);
                imageReceiver.setRoundRadius(AndroidUtilities.dp(14.0f));
            } else if (N()) {
                imageReceiver.setRoundRadius(this.V0 / 2);
            } else {
                imageReceiver.setRoundRadius(0);
            }
        }
        int iMax = Math.max(AndroidUtilities.dp(30.0f), View.MeasureSpec.getSize(i10));
        if (this.R != iMax) {
            this.f25779w0 = true;
            this.R = iMax;
            s();
        }
        if (messageObject == null) {
            iDp = 0;
        } else {
            if (messageObject.type == 11) {
                i13 = AndroidUtilities.roundMessageSize;
                iDp3 = AndroidUtilities.dp(10.0f);
            } else if (L(messageObject)) {
                i13 = this.W0;
                iDp3 = AndroidUtilities.dp(12.0f);
            } else {
                iDp = 0;
            }
            iDp = iDp3 + i13;
        }
        hh.k5 k5Var = this.B0;
        boolean zD = k5Var.d();
        ig.r0 r0Var = this.f25785y0;
        if (zD) {
            iDp4 = org.telegram.messenger.y1.C(8.0f, k5Var.M, k5Var.f9594p ? 0 : AndroidUtilities.dp(16.0f) + this.O + this.K);
            if (!r0Var.f11434s) {
                iDp2 = AndroidUtilities.dp(8.0f) + r0Var.f11430o;
                r0Var.f11431p = iDp2;
                iDp4 += iDp2;
            }
        } else {
            qx0 qx0Var = this.C0;
            if (qx0Var != null) {
                iDp4 = AndroidUtilities.dp(12.0f) + AndroidUtilities.dp(140.0f) + ((int) qx0Var.f31995f.j()) + (qx0Var.f31997i ? AndroidUtilities.dp(40.0f) : 0);
                if (!r0Var.f11434s) {
                    iDp2 = AndroidUtilities.dp(8.0f) + r0Var.f11430o;
                    r0Var.f11431p = iDp2;
                    iDp4 += iDp2;
                }
            } else if (L(messageObject)) {
                boolean z10 = messageObject != null && messageObject.type == 25;
                int iG = G(messageObject);
                if (N()) {
                    f10 = 8.0f;
                    int iDp5 = AndroidUtilities.dp(4.0f) + this.O + this.K + (iG > 0 ? org.telegram.messenger.y1.D(16.0f, 2, iG) : AndroidUtilities.dp(16.0f));
                    ag.r rVar = this.f25746g1;
                    fDp = iDp5 + (rVar == null ? 0 : AndroidUtilities.dp(4.0f) + ((StaticLayout) rVar.f631f).getHeight());
                } else {
                    f10 = 8.0f;
                    float fDp3 = (this.W0 * 0.075f) + this.O + this.K + iG + AndroidUtilities.dp(4.0f);
                    ag.r rVar2 = this.f25746g1;
                    fDp = (rVar2 == null ? 0 : AndroidUtilities.dp(4.0f) + ((StaticLayout) rVar2.f631f).getHeight()) + fDp3;
                }
                this.f25786y1 = 0;
                StaticLayout staticLayout = this.X0;
                if (staticLayout != null) {
                    float height = fDp + staticLayout.getHeight();
                    if (this.X0.getLineCount() > 1) {
                        this.f25786y1 = (this.X0.getHeight() - this.X0.getLineTop(1)) + this.f25786y1;
                    }
                    fDp2 = height + AndroidUtilities.dp(z10 ? 6.0f : 0.0f);
                    StaticLayout staticLayout2 = this.f25729a1;
                    if (staticLayout2 != null) {
                        fDp2 += AndroidUtilities.dp(9.0f) + staticLayout2.getHeight();
                    }
                    if (this.Z0 != null) {
                        fDp2 += AndroidUtilities.dp(24.0f);
                    }
                } else {
                    fDp2 = fDp - AndroidUtilities.dp(12.0f);
                    this.f25786y1 -= AndroidUtilities.dp(30.0f);
                }
                ag.r rVar3 = this.f25746g1;
                int height2 = rVar3 == null ? 0 : ((StaticLayout) rVar3.f631f).getHeight();
                if (this.f25746g1 == null) {
                    this.f25786y1 = 0;
                } else if (this.f25729a1 != null) {
                    this.f25786y1 = org.telegram.messenger.y1.C(10.0f, height2, this.f25786y1);
                } else {
                    MessageObject messageObject2 = this.D0;
                    if (messageObject2.type == 18 || messageObject2.isStarGiftAction()) {
                        this.f25786y1 = rl.C(this.l1 == null ? 0.0f : 10.0f, height2, this.f25786y1);
                    } else if (this.D0.type == 30) {
                        this.f25786y1 = rl.C(20.0f, height2, this.f25786y1);
                    } else if (this.f25734c1) {
                        this.f25786y1 += height2;
                    } else if (((StaticLayout) this.f25746g1.f631f).getLineCount() > 2) {
                        this.f25786y1 = ((((StaticLayout) this.f25746g1.f631f).getLineCount() * (((StaticLayout) this.f25746g1.f631f).getLineBottom(0) - ((StaticLayout) this.f25746g1.f631f).getLineTop(0))) - 2) + this.f25786y1;
                    }
                }
                if (this.Z0 != null) {
                    this.f25786y1 = AndroidUtilities.dp(24.0f) + this.f25786y1;
                }
                int iDp6 = this.f25786y1 - AndroidUtilities.dp(z10 ? 14.0f : 0.0f);
                this.f25786y1 = iDp6;
                iDp += iDp6;
                int iDp7 = AndroidUtilities.dp(14.0f) + this.K + iDp;
                StaticLayout staticLayout3 = this.l1;
                RectF rectF = this.f25753k0;
                if (staticLayout3 != null) {
                    float fA = com.google.android.recaptcha.internal.a.A((iDp7 - fDp2) - staticLayout3.getHeight(), AndroidUtilities.dp(f10), 2.0f, fDp2);
                    if (this.D0.isStarGiftAction()) {
                        fA += AndroidUtilities.dp(4.0f);
                    }
                    float f12 = (this.R - this.f25768r1) / 2.0f;
                    float fDp4 = f12 - AndroidUtilities.dp(18.0f);
                    float fDp5 = fA - AndroidUtilities.dp(f10);
                    f11 = 2.0f;
                    float fDp6 = f12 + this.f25768r1 + AndroidUtilities.dp(18.0f);
                    StaticLayout staticLayout4 = this.l1;
                    rectF.set(fDp4, fDp5, fDp6, fA + (staticLayout4 != null ? staticLayout4.getHeight() : 0) + AndroidUtilities.dp(f10));
                } else {
                    f11 = 2.0f;
                    iDp -= AndroidUtilities.dp(40.0f);
                    this.f25786y1 -= AndroidUtilities.dp(40.0f);
                    MessageObject messageObject3 = this.D0;
                    if (messageObject3 != null && (message = messageObject3.messageOwner) != null && (message.action instanceof TLRPC.TL_messageActionStarGift)) {
                        iDp -= AndroidUtilities.dp(f10);
                        this.f25786y1 -= AndroidUtilities.dp(f10);
                    }
                }
                int measuredWidth = getMeasuredWidth() << (getMeasuredHeight() + 16);
                ag.j3 j3Var = this.J1;
                j3Var.f499a.set(rectF);
                j3Var.f500b.set(rectF);
                if (this.K1 != measuredWidth) {
                    this.K1 = measuredWidth;
                    j3Var.f();
                }
                if (N()) {
                    int iDp8 = AndroidUtilities.dp(4.0f) + this.O + this.K;
                    this.f25742f = 0;
                    int iD = iG > 0 ? org.telegram.messenger.y1.D(16.0f, 2, iG) : AndroidUtilities.dp(16.0f);
                    this.f25742f = iD;
                    StaticLayout staticLayout5 = this.f25729a1;
                    if (staticLayout5 != null) {
                        this.f25742f = org.telegram.messenger.y1.C(10.0f, staticLayout5.getHeight(), iD);
                    }
                    if (this.Z0 != null) {
                        this.f25742f = AndroidUtilities.dp(15.0f) + this.f25742f;
                    }
                    int i16 = this.f25742f + height2;
                    this.f25742f = i16;
                    float f13 = (this.R - this.f25768r1) / f11;
                    if (this.l1 != null) {
                        this.h = AndroidUtilities.dp(7.0f) + i16 + iDp8;
                        rectF.set(f13 - AndroidUtilities.dp(18.0f), this.h, f13 + this.f25768r1 + AndroidUtilities.dp(18.0f), org.telegram.messenger.y1.D(8.0f, 2, this.l1.getHeight() + this.h));
                        this.f25742f = (int) (rectF.height() + AndroidUtilities.dp(4.0f) + this.f25742f);
                    } else if (!M() && (i12 = messageObject.type) != 34 && i12 != 33 && i12 != 35) {
                        rectF.set(f13 - AndroidUtilities.dp(18.0f), this.h, f13 + this.f25768r1 + AndroidUtilities.dp(18.0f), org.telegram.messenger.y1.D(8.0f, 2, AndroidUtilities.dp(17.0f) + this.h));
                        this.f25742f = AndroidUtilities.dp(17.0f) + this.f25742f;
                    }
                    int iDp9 = AndroidUtilities.dp(15.0f) + this.f25742f;
                    this.f25742f = iDp9;
                    int iDp10 = AndroidUtilities.dp(6.0f) + iDp8 + iDp9;
                    if (!r0Var.f11434s) {
                        int iDp11 = AndroidUtilities.dp(8.0f) + r0Var.f11430o;
                        r0Var.f11431p = iDp11;
                        iDp10 += iDp11;
                    }
                    iDp4 = iDp10;
                    if (this.M1 != null) {
                        iDp4 += AndroidUtilities.dp(44.0f);
                    }
                }
                rectF.inset(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(1.0f));
            }
        }
        if (this.D0 != null && !r0Var.f11434s) {
            int iDp12 = AndroidUtilities.dp(8.0f) + r0Var.f11430o;
            r0Var.f11431p = iDp12;
            iDp += iDp12;
        }
        if (M()) {
            iDp = org.telegram.messenger.y1.C(24.0f, this.M, iDp);
        }
        if (messageObject == null || !N()) {
            setMeasuredDimension(iMax, AndroidUtilities.dp(14.0f) + this.f25747h0 + this.K + iDp);
        } else {
            setMeasuredDimension(iMax, this.f25747h0 + iDp4);
        }
        r0Var.d = (getMeasuredHeight() - getPaddingTop()) - r0Var.f11431p;
    }

    @Override
    public final void onSuccessDownload(String str) {
        TLRPC.PhotoSize photoSize;
        MessageObject messageObject = this.D0;
        if (messageObject == null || messageObject.type != 11) {
            return;
        }
        int size = messageObject.photoThumbs.size();
        for (int i10 = 0; i10 < size; i10++) {
            photoSize = messageObject.photoThumbs.get(i10);
            if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                this.E.setImage(this.f25772t0, "g", ImageLocation.getForObject(photoSize, messageObject.photoThumbsObject), "50_50_b", this.H, 0L, null, messageObject, 1);
                DownloadController.getInstance(this.D).removeLoadingFileObserver(this);
            }
        }
        photoSize = null;
        this.E.setImage(this.f25772t0, "g", ImageLocation.getForObject(photoSize, messageObject.photoThumbsObject), "50_50_b", this.H, 0L, null, messageObject, 1);
        DownloadController.getInstance(this.D).removeLoadingFileObserver(this);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        j40 j40Var;
        ag.r rVar;
        ag.r rVar2;
        TLRPC.Message message;
        boolean z10;
        int i10;
        BotInlineKeyboard.ButtonCustom buttonCustom;
        MessageObject messageObject;
        TLRPC.Message message2;
        MessageObject messageObject2;
        TLRPC.Message message3;
        TLRPC.Message message4;
        int i11;
        SpannableStringBuilder spannableStringBuilderReplaceTags;
        boolean z11;
        boolean z12;
        StaticLayout staticLayout;
        ArrayList arrayList;
        boolean z13;
        boolean z14;
        boolean z15;
        MessageObject messageObject3;
        TLRPC.MessageAction messageAction;
        TLRPC.Message message5;
        int i12;
        MessageObject messageObject4 = this.D0;
        float x8 = motionEvent.getX() - (this.f25743f0 / 2.0f);
        this.f25774u0 = x8;
        float y10 = motionEvent.getY() + getPaddingTop();
        this.f25776v0 = y10;
        if (messageObject4 == null) {
            if (this.R1 != null) {
                if (motionEvent.getAction() == 0) {
                    if (x8 >= this.O0 && x8 <= this.P0) {
                        this.B = true;
                        return true;
                    }
                } else if (this.B) {
                    if (motionEvent.getAction() == 1) {
                        this.R1.onClick(this);
                        this.B = false;
                    } else if (motionEvent.getAction() == 3) {
                        this.B = false;
                    }
                }
            }
            return super.onTouchEvent(motionEvent);
        }
        j11 j11Var = this.f25751j0;
        if (j11Var != null && j11Var.d(motionEvent, false)) {
            return true;
        }
        qx0 qx0Var = this.C0;
        if (qx0Var != null) {
            nc ncVar = qx0Var.f32001m;
            boolean zContains = qx0Var.f31999k.contains(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0) {
                ncVar.c(zContains);
            } else if (motionEvent.getAction() != 2) {
                if (motionEvent.getAction() == 1) {
                    if (ncVar.h) {
                        qx0Var.b();
                    }
                    ncVar.c(false);
                } else if (motionEvent.getAction() == 3) {
                    ncVar.c(false);
                }
            }
            if (ncVar.h) {
                return true;
            }
        }
        hh.k5 k5Var = this.B0;
        if ((k5Var.d() && k5Var.e(this.f25787z0, this.A0, motionEvent)) || this.f25785y0.c(motionEvent)) {
            return true;
        }
        int action = motionEvent.getAction();
        hf.b bVar = hf.b.f8921a;
        RectF rectF = this.f25753k0;
        ImageReceiver imageReceiver = this.E;
        int i13 = this.D;
        View view = this.H1;
        nc ncVar2 = this.f25757n;
        if (action != 0) {
            if (motionEvent.getAction() != 2) {
                k();
            }
            if (this.B) {
                if (motionEvent.getAction() == 2) {
                    if (x8 < this.O0 || x8 > this.P0) {
                        z10 = false;
                        this.B = false;
                    }
                } else if (motionEvent.getAction() == 1) {
                    View.OnClickListener onClickListener = this.R1;
                    if (onClickListener != null) {
                        onClickListener.onClick(this);
                    }
                    this.B = false;
                } else if (motionEvent.getAction() == 3) {
                    this.B = false;
                }
                z10 = false;
            } else {
                if (this.A) {
                    int action2 = motionEvent.getAction();
                    if (action2 == 1) {
                        this.A = false;
                        view.setPressed(false);
                        ncVar2.c(false);
                        if (this.T0 != null && messageObject4.replyMessageObject != null && (message = messageObject4.messageOwner) != null && hf.d.g(message.action, TLRPC.TL_messageActionTodoAppendTasks.class, TLRPC.TL_messageActionTodoCompletions.class, TLRPC.TL_messageActionSuggestedPostApproval.class, TLRPC.TL_messageActionSuggestedPostRefund.class, TLRPC.TL_messageActionSuggestedPostSuccess.class)) {
                            this.T0.C(this, this.D0.getReplyMsgId());
                        } else {
                            if (this.f25734c1 && !this.f25731b1 && (rVar2 = this.f25746g1) != null) {
                                int height = ((StaticLayout) rVar2.f631f).getHeight() - this.f25737d1;
                                this.f25731b1 = true;
                                t0 t0Var = this.T0;
                                if (t0Var == null) {
                                    return true;
                                }
                                t0Var.I(this);
                                if (!(getParent() instanceof zk0)) {
                                    return true;
                                }
                                ((zk0) getParent()).v0(0, AndroidUtilities.dp(24.0f) + height, null);
                                return true;
                            }
                            if (this.C0 != null && this.A1.contains(motionEvent.getX(), motionEvent.getY())) {
                                this.C0.b();
                                return true;
                            }
                        }
                    } else if (action2 == 2) {
                        ag.r rVar3 = this.f25746g1;
                        if (rVar3 == null || !this.f25734c1) {
                            this.A = false;
                        } else {
                            RectF rectF2 = AndroidUtilities.rectTmp;
                            float f10 = rVar3.f627a;
                            float f11 = rVar3.f628b;
                            float width = ((StaticLayout) rVar3.f631f).getWidth() + f10;
                            ag.r rVar4 = this.f25746g1;
                            rectF2.set(f10, f11, width, rVar4.f628b + ((StaticLayout) rVar4.f631f).getHeight());
                            if (!rectF2.contains(x8, y10)) {
                                this.A = false;
                            }
                        }
                        z10 = true;
                    } else if (action2 == 3) {
                        this.A = false;
                        ncVar2.c(false);
                    }
                } else if (this.T) {
                    int action3 = motionEvent.getAction();
                    if (action3 == 1) {
                        this.S = false;
                        this.T = false;
                        view.setPressed(false);
                        ncVar2.c(false);
                        if (this.T0 != null) {
                            int i14 = messageObject4.type;
                            if (i14 == 37) {
                                playSoundEffect(0);
                                org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
                                if (n2VarU != null) {
                                    new oh.j0(n2VarU, ((TLRPC.TL_messageActionChangeCommunity) messageObject4.messageOwner.action).community_id, null, null).show();
                                }
                            } else if (i14 == 31) {
                                playSoundEffect(0);
                                S();
                            } else if (i14 == 25) {
                                playSoundEffect(0);
                                if (this.T0 != null) {
                                    AndroidUtilities.runOnUIThread(new ga(4, this, (TLRPC.TL_messageActionGiftCode) this.D0.messageOwner.action));
                                }
                            } else if (i14 == 18) {
                                playSoundEffect(0);
                                R();
                            } else if (i14 == 30) {
                                playSoundEffect(0);
                                S();
                            } else {
                                TLRPC.Message message6 = messageObject4.messageOwner;
                                if (message6 != null) {
                                    TLRPC.MessageAction messageAction2 = message6.action;
                                    if ((messageAction2 instanceof TLRPC.TL_messageActionSuggestedPostApproval) && ((TLRPC.TL_messageActionSuggestedPostApproval) messageAction2).balance_too_low) {
                                        playSoundEffect(0);
                                        MessageSuggestionParams messageSuggestionParamsObtainSuggestionOffer = this.D0.obtainSuggestionOffer();
                                        hf.a aVar = messageSuggestionParamsObtainSuggestionOffer.amount;
                                        if (aVar != null && aVar.f8919a == bVar) {
                                            new hh.ea(getContext(), this.U0, messageSuggestionParamsObtainSuggestionOffer.amount.a(), 13, wf.c.h(i13, this.D0.getDialogId()), null, this.D0.getDialogId()).show();
                                        }
                                    } else if (MessagesController.getInstance(i13).photoSuggestion.get(messageObject4.messageOwner.local_id) == null) {
                                        if (this.f25756m1) {
                                            this.T0.K(this);
                                        } else {
                                            this.T0.S(this);
                                        }
                                    }
                                } else if (MessagesController.getInstance(i13).photoSuggestion.get(messageObject4.messageOwner.local_id) == null) {
                                    if (this.f25756m1) {
                                        this.T0.K(this);
                                    } else {
                                        this.T0.S(this);
                                    }
                                }
                            }
                        }
                    } else if (action3 != 2) {
                        if (action3 == 3) {
                            this.S = false;
                            this.T = false;
                            view.setPressed(false);
                            ncVar2.c(false);
                        }
                    } else if (!L(messageObject4) || (!rectF.contains(x8, y10) && !this.A1.contains(x8, y10))) {
                        this.T = false;
                        view.setPressed(false);
                        ncVar2.c(false);
                    }
                } else if (this.S) {
                    int action4 = motionEvent.getAction();
                    if (action4 == 1) {
                        this.S = false;
                        if (this.f25734c1 && !this.f25731b1 && (rVar = this.f25746g1) != null) {
                            int height2 = ((StaticLayout) rVar.f631f).getHeight() - this.f25737d1;
                            this.f25731b1 = true;
                            t0 t0Var2 = this.T0;
                            if (t0Var2 == null) {
                                return true;
                            }
                            t0Var2.I(this);
                            if (!(getParent() instanceof zk0)) {
                                return true;
                            }
                            ((zk0) getParent()).v0(0, AndroidUtilities.dp(16.0f) + height2, null);
                            return true;
                        }
                        int i15 = messageObject4.type;
                        if (i15 == 31) {
                            S();
                        } else if (i15 == 25) {
                            if (this.T0 != null) {
                                AndroidUtilities.runOnUIThread(new ga(4, this, (TLRPC.TL_messageActionGiftCode) this.D0.messageOwner.action));
                            }
                        } else if (i15 == 18) {
                            R();
                        } else if (i15 == 30) {
                            S();
                        } else if (this.T0 != null) {
                            if (i15 != 21 || (j40Var = MessagesController.getInstance(i13).photoSuggestion.get(messageObject4.messageOwner.local_id)) == null) {
                                this.T0.K(this);
                                playSoundEffect(0);
                            } else {
                                j40Var.c();
                            }
                        }
                    } else if (action4 != 2) {
                        if (action4 == 3) {
                            this.S = false;
                        }
                    } else if (N()) {
                        if (!this.A1.contains(x8, y10)) {
                            this.S = false;
                        }
                    } else if (!imageReceiver.isInsideImage(x8, y10)) {
                        this.S = false;
                    }
                }
                z10 = false;
            }
        } else if (this.T0 != null) {
            if ((messageObject4.type == 11 || L(messageObject4)) && imageReceiver.isInsideImage(x8, y10)) {
                this.S = true;
                z13 = true;
            } else {
                z13 = false;
            }
            if (this.f25783x1.f26470i.f28309q == 4 && (((i12 = messageObject4.type) == 21 || i12 == 22) && this.A1.contains(x8, y10))) {
                this.S = true;
                z13 = true;
            }
            ag.r rVar5 = this.f25746g1;
            if (rVar5 != null && this.f25734c1) {
                RectF rectF3 = AndroidUtilities.rectTmp;
                float f12 = rVar5.f627a;
                float f13 = rVar5.f628b;
                float width2 = ((StaticLayout) rVar5.f631f).getWidth() + f12;
                ag.r rVar6 = this.f25746g1;
                rectF3.set(f12, f13, width2, rVar6.f628b + ((StaticLayout) rVar6.f631f).getHeight());
                if (rectF3.contains(x8, y10)) {
                    this.A = true;
                    z14 = true;
                }
                if (L(messageObject4) || this.l1 == null || !(rectF.contains(x8, y10) || (this.f25756m1 && this.A1.contains(x8, y10)))) {
                    z15 = true;
                } else {
                    z15 = true;
                    this.T = true;
                    view.setPressed(true);
                    ncVar2.c(true);
                    z14 = true;
                }
                if (!z14 && M()) {
                    this.A = z15;
                    z14 = true;
                }
                if (!z14) {
                    messageObject3 = this.D0;
                    if (messageObject3 != null || (message5 = messageObject3.messageOwner) == null) {
                        messageAction = null;
                    } else {
                        messageAction = message5.action;
                    }
                    if (hf.d.g(messageAction, TLRPC.TL_messageActionSuggestedPostRefund.class, TLRPC.TL_messageActionSuggestedPostSuccess.class)) {
                        this.A = true;
                        z14 = true;
                    }
                }
                if (z14) {
                    r();
                }
                z10 = z14;
            }
            z14 = z13;
            if (L(messageObject4)) {
                z15 = true;
            } else {
                z15 = true;
            }
            if (!z14) {
                this.A = z15;
                z14 = true;
            }
            if (!z14) {
                messageObject3 = this.D0;
                if (messageObject3 != null) {
                    messageAction = null;
                } else {
                    messageAction = null;
                }
                if (hf.d.g(messageAction, TLRPC.TL_messageActionSuggestedPostRefund.class, TLRPC.TL_messageActionSuggestedPostSuccess.class)) {
                    this.A = true;
                    z14 = true;
                }
            }
            if (z14) {
                r();
            }
            z10 = z14;
        } else {
            z10 = false;
        }
        if (!z10 && (motionEvent.getAction() == 0 || ((this.f25781x != null || this.f25784y != null) && motionEvent.getAction() == 1))) {
            ag.r rVar7 = this.f25746g1;
            if (rVar7 != null && (arrayList = rVar7.f630e) != null && !arrayList.isEmpty() && !this.C) {
                ArrayList arrayList2 = this.f25746g1.f630e;
                int size = arrayList2.size();
                int i16 = 0;
                while (i16 < size) {
                    Object obj = arrayList2.get(i16);
                    i16++;
                    eh.k kVar = (eh.k) obj;
                    Rect bounds = kVar.getBounds();
                    ag.r rVar8 = this.f25746g1;
                    if (bounds.contains((int) (x8 - rVar8.f627a), (int) (y10 - rVar8.f628b))) {
                        this.f25781x = null;
                        if (motionEvent.getAction() == 0) {
                            this.f25784y = kVar;
                        } else {
                            eh.k kVar2 = this.f25784y;
                            if (kVar == kVar2) {
                                this.C = true;
                                kVar2.f5525q = new s0(this, 2);
                                float fSqrt = (float) Math.sqrt(Math.pow(((StaticLayout) this.f25746g1.f631f).getHeight(), 2.0d) + Math.pow(((StaticLayout) this.f25746g1.f631f).getWidth(), 2.0d));
                                eh.k kVar3 = this.f25784y;
                                ag.r rVar9 = this.f25746g1;
                                kVar3.j((int) (x8 - rVar9.f627a), (int) (y10 - rVar9.f628b), fSqrt, false);
                                invalidate();
                            }
                        }
                        z10 = true;
                        break;
                    }
                }
            }
            if (z10 || (staticLayout = this.I) == null) {
                this.f25781x = null;
            } else {
                int i17 = this.N;
                if (x8 >= i17) {
                    int i18 = this.O;
                    float f14 = i18;
                    if (y10 < f14 || x8 > i17 + this.J || y10 > i18 + this.K) {
                        this.f25781x = null;
                    } else {
                        float f15 = y10 - f14;
                        float f16 = x8 - this.P;
                        if (!z10) {
                            int lineForVertical = staticLayout.getLineForVertical((int) f15);
                            int offsetForHorizontal = this.I.getOffsetForHorizontal(lineForVertical, f16);
                            float lineLeft = this.I.getLineLeft(lineForVertical);
                            if (lineLeft > f16 || this.I.getLineWidth(lineForVertical) + lineLeft < f16) {
                                this.f25781x = null;
                            } else {
                                CharSequence charSequence = messageObject4.messageText;
                                if (charSequence instanceof Spannable) {
                                    URLSpan[] uRLSpanArr = (URLSpan[]) ((Spannable) charSequence).getSpans(offsetForHorizontal, offsetForHorizontal, URLSpan.class);
                                    if (uRLSpanArr.length != 0) {
                                        if (motionEvent.getAction() == 0) {
                                            this.f25781x = uRLSpanArr[0];
                                        } else {
                                            URLSpan uRLSpan = uRLSpanArr[0];
                                            URLSpan uRLSpan2 = this.f25781x;
                                            if (uRLSpan == uRLSpan2) {
                                                Q(uRLSpan2);
                                            }
                                        }
                                        z10 = true;
                                    } else {
                                        this.f25781x = null;
                                    }
                                } else {
                                    this.f25781x = null;
                                }
                            }
                        }
                    }
                } else {
                    this.f25781x = null;
                }
            }
        }
        if (!z10) {
            ArrayList arrayList3 = this.L1;
            if (arrayList3.isEmpty()) {
                z12 = false;
            } else {
                int x10 = (int) motionEvent.getX();
                int y11 = (int) motionEvent.getY();
                float width3 = (getWidth() - this.W0) / 2.0f;
                float fDp = AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(4.0f) + this.O + this.K + this.f25742f;
                float fDp2 = (this.W0 - AndroidUtilities.dp(4.0f)) / 2.0f;
                int action5 = motionEvent.getAction();
                org.telegram.ui.ActionBar.c6 c6Var = this.U0;
                if (action5 == 0) {
                    this.Y1 = -1;
                    int i19 = 0;
                    while (true) {
                        if (i19 < arrayList3.size()) {
                            e0 e0Var = (e0) arrayList3.get(i19);
                            float fDp3 = ((AndroidUtilities.dp(4.0f) + fDp2) * i19) + width3;
                            RectF rectF4 = AndroidUtilities.rectTmp;
                            rectF4.set(fDp3, fDp, fDp3 + fDp2, e0Var.f24235f + fDp);
                            float f17 = x10;
                            float f18 = y11;
                            if (rectF4.contains(f17, f18)) {
                                this.Y1 = i19;
                                K();
                                if (e0Var.f24247s == null) {
                                    z zVarY = org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23239nc, c6Var), 6, 6);
                                    e0Var.f24247s = zVarY;
                                    zVarY.setCallback(this);
                                }
                                e0Var.f24247s.setHotspot(f17, f18);
                                e0Var.f24247s.setState(this.X1);
                                e0Var.b(!e0Var.f24241m);
                                z12 = true;
                            } else {
                                i19++;
                            }
                        }
                    }
                } else {
                    if (motionEvent.getAction() == 1) {
                        if (this.Y1 != -1) {
                            playSoundEffect(0);
                            e0 e0Var2 = (e0) arrayList3.get(this.Y1);
                            z zVar = e0Var2.f24247s;
                            if (zVar != null) {
                                zVar.setState(StateSet.NOTHING);
                            }
                            e0Var2.b(false);
                            if (this.T0 != null && !e0Var2.f24241m && (buttonCustom = e0Var2.f24238j) != null && getMessageObject() != null) {
                                int i20 = buttonCustom.f19608id;
                                if (i20 == 5) {
                                    t0 t0Var3 = this.T0;
                                    org.telegram.ui.ActionBar.n2 n2VarY0 = t0Var3 != null ? t0Var3.y0() : null;
                                    if (n2VarY0 != null && this.D0 != null) {
                                        org.telegram.ui.Components.y4.v0(n2VarY0, LocaleController.getString(R.string.GiftOfferRejectConfirmTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferRejectConfirmText, DialogObject.getShortName(this.D0.getDialogId()))), LocaleController.getString(R.string.GiftOfferRejectConfirmConfirm), true, new ga(2, this, n2VarY0));
                                    }
                                } else if (i20 == 6) {
                                    MessageObject messageObject5 = this.D0;
                                    if (messageObject5 != null && (message4 = messageObject5.messageOwner) != null) {
                                        TLRPC.MessageAction messageAction3 = message4.action;
                                        if (messageAction3 instanceof TLRPC.TL_messageActionStarGiftPurchaseOffer) {
                                            TLRPC.TL_messageActionStarGiftPurchaseOffer tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) messageAction3;
                                            org.telegram.ui.ActionBar.n2 n2VarR = LaunchActivity.R();
                                            Context context = getContext();
                                            long dialogId = this.D0.getDialogId();
                                            int id2 = this.D0.getId();
                                            int[] iArr = hh.o0.f9796s0;
                                            hf.a aVarM = hf.a.m(tL_messageActionStarGiftPurchaseOffer.price);
                                            hf.b bVar2 = aVarM.f8919a;
                                            hf.a aVarI = hf.a.i((aVarM.f8920b * ((long) (bVar2 == bVar ? MessagesController.getInstance(i13).config.starsStarGiftResaleCommissionPermille.get() : MessagesController.getInstance(i13).config.tonStarGiftResaleCommissionPermille.get()))) / 1000, bVar2);
                                            TL_stars.StarGift starGift = tL_messageActionStarGiftPurchaseOffer.gift;
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append(starGift.title);
                                            sb2.append(" #");
                                            String strM = i0.a.m(starGift.num, ',', sb2);
                                            TLObject user = dialogId >= 0 ? MessagesController.getInstance(i13).getUser(Long.valueOf(dialogId)) : MessagesController.getInstance(i13).getChat(Long.valueOf(-dialogId));
                                            String strD = aVarM.d();
                                            String strD2 = aVarI.d();
                                            boolean z16 = bVar2 == hf.b.f8922b;
                                            LinearLayout linearLayoutG = org.telegram.messenger.y1.g(context, 1);
                                            linearLayoutG.addView(new hh.i4(context, starGift, user), h7.z5.t(-1, -2, 48, 0, -4, 0, 0));
                                            TextView textView = new TextView(context);
                                            rl.l(org.telegram.ui.ActionBar.g6.f23161j5, c6Var, textView, 1, 16.0f);
                                            textView.setText(AndroidUtilities.replaceTags(bVar2 == bVar ? LocaleController.formatString(R.string.GiftOfferTransferInfoTextSellStars, strD, DialogObject.getShortName(dialogId), strM, strD2) : LocaleController.formatString(R.string.GiftOfferTransferInfoTextSellTON, strD, DialogObject.getShortName(dialogId), strM, strD2)));
                                            linearLayoutG.addView(textView, h7.z5.t(-1, -2, 48, 24, 4, 24, 4));
                                            FrameLayout frameLayout = new FrameLayout(context);
                                            frameLayout.setClipChildren(false);
                                            frameLayout.setClipToPadding(false);
                                            yy0 yy0Var = new yy0(context, c6Var);
                                            frameLayout.addView(yy0Var, h7.z5.e(-1, -1, 119));
                                            hh.i5.q1(yy0Var, hh.u7.l(starGift.attributes, TL_stars.starGiftAttributeModel.class));
                                            hh.i5.q1(yy0Var, hh.u7.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                                            hh.i5.q1(yy0Var, hh.u7.l(starGift.attributes, TL_stars.starGiftAttributePattern.class));
                                            linearLayoutG.addView(frameLayout, h7.z5.t(-1, -2, 48, 23, 16, 23, 4));
                                            hf.a aVarJ = hf.a.j(starGift.value_usd_amount / Math.pow(10.0d, BillingController.getInstance().getCurrencyExp("USD")), bVar2);
                                            if (aVarJ.c() > 0.0d && starGift.value_usd_amount > 0) {
                                                if (aVarJ.f8920b >= aVarI.f8920b) {
                                                    int iRound = (int) Math.round((1.0d - (aVarI.c() / aVarJ.c())) * 100.0d);
                                                    spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferAmountLowerHint2, s3.c.d(iRound, "%"), starGift.title));
                                                    z11 = iRound > 10;
                                                    i11 = 1;
                                                } else {
                                                    i11 = 1;
                                                    spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferAmountHigherHint2, s3.c.d((int) Math.round(((aVarI.c() / aVarJ.c()) - 1.0d) * 100.0d), "%"), starGift.title));
                                                    z11 = false;
                                                }
                                                TextView textView2 = new TextView(context);
                                                textView2.setTextSize(i11, 13.0f);
                                                textView2.setGravity(17);
                                                textView2.setText(spannableStringBuilderReplaceTags);
                                                textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(z11 ? org.telegram.ui.ActionBar.g6.f23269p7 : org.telegram.ui.ActionBar.g6.f23423y6, c6Var));
                                                linearLayoutG.addView(textView2, h7.z5.t(-1, -2, 49, 40, 12, 40, 9));
                                            }
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
                                            alertDialog$Builder.n(linearLayoutG);
                                            alertDialog$Builder.k(hh.oa.S0(LocaleController.formatString(R.string.GiftOfferSellFor, strD2), z16), new hh.h0(id2, i13, n2VarR));
                                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                            alertDialog$Builder.f22702a.show();
                                        }
                                    }
                                } else if (i20 == 7) {
                                    t0 t0Var4 = this.T0;
                                    org.telegram.ui.ActionBar.n2 n2VarY1 = t0Var4 != null ? t0Var4.y0() : null;
                                    if (n2VarY1 != null && (messageObject2 = this.D0) != null && (message3 = messageObject2.messageOwner) != null) {
                                        TLRPC.MessageAction messageAction4 = message3.action;
                                        if (messageAction4 instanceof TLRPC.TL_messageActionNoForwardsRequest) {
                                            final TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest = (TLRPC.TL_messageActionNoForwardsRequest) messageAction4;
                                            final int i21 = 0;
                                            org.telegram.ui.Components.y4.v0(n2VarY1, LocaleController.getString(tL_messageActionNoForwardsRequest.prev_value ? R.string.SharingOfferDisableCancelTitle : R.string.SharingOfferEnableCancelTitle), LocaleController.getString(tL_messageActionNoForwardsRequest.prev_value ? R.string.SharingOfferDisableCancelText : R.string.SharingOfferEnableCancelText), LocaleController.getString(R.string.SharingOfferCancelYes), false, new Runnable(this) {

                                                public final v0 f24832b;

                                                {
                                                    this.f24832b = this;
                                                }

                                                @Override
                                                public final void run() {
                                                    switch (i21) {
                                                        case 0:
                                                            v0 v0Var = this.f24832b;
                                                            MessagesController.getInstance(v0Var.D).toggleChatNoForwards(v0Var.D0.getDialogId(), v0Var.D0.getId(), tL_messageActionNoForwardsRequest.prev_value, null);
                                                            break;
                                                        default:
                                                            v0 v0Var2 = this.f24832b;
                                                            MessagesController.getInstance(v0Var2.D).toggleChatNoForwards(v0Var2.D0.getDialogId(), v0Var2.D0.getId(), tL_messageActionNoForwardsRequest.new_value, null);
                                                            break;
                                                    }
                                                }
                                            });
                                        }
                                    }
                                } else if (i20 == 8) {
                                    t0 t0Var5 = this.T0;
                                    org.telegram.ui.ActionBar.n2 n2VarY2 = t0Var5 != null ? t0Var5.y0() : null;
                                    if (n2VarY2 != null && (messageObject = this.D0) != null && (message2 = messageObject.messageOwner) != null) {
                                        TLRPC.MessageAction messageAction5 = message2.action;
                                        if (messageAction5 instanceof TLRPC.TL_messageActionNoForwardsRequest) {
                                            final TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest2 = (TLRPC.TL_messageActionNoForwardsRequest) messageAction5;
                                            final int i22 = 1;
                                            org.telegram.ui.Components.y4.v0(n2VarY2, LocaleController.getString(tL_messageActionNoForwardsRequest2.new_value ? R.string.SharingOfferDisableCancelTitle : R.string.SharingOfferEnableCancelTitle), LocaleController.getString(tL_messageActionNoForwardsRequest2.new_value ? R.string.SharingOfferDisableConfirmText : R.string.SharingOfferEnableConfirmText), LocaleController.getString(R.string.SharingOfferCancelYes), false, new Runnable(this) {

                                                public final v0 f24832b;

                                                {
                                                    this.f24832b = this;
                                                }

                                                @Override
                                                public final void run() {
                                                    switch (i22) {
                                                        case 0:
                                                            v0 v0Var = this.f24832b;
                                                            MessagesController.getInstance(v0Var.D).toggleChatNoForwards(v0Var.D0.getDialogId(), v0Var.D0.getId(), tL_messageActionNoForwardsRequest2.prev_value, null);
                                                            break;
                                                        default:
                                                            v0 v0Var2 = this.f24832b;
                                                            MessagesController.getInstance(v0Var2.D).toggleChatNoForwards(v0Var2.D0.getDialogId(), v0Var2.D0.getId(), tL_messageActionNoForwardsRequest2.new_value, null);
                                                            break;
                                                    }
                                                }
                                            });
                                        }
                                    }
                                }
                            }
                            this.Y1 = -1;
                            K();
                        }
                    } else if (motionEvent.getAction() == 3 && (i10 = this.Y1) != -1) {
                        e0 e0Var3 = (e0) arrayList3.get(i10);
                        z zVar2 = e0Var3.f24247s;
                        if (zVar2 != null) {
                            zVar2.setState(StateSet.NOTHING);
                        }
                        e0Var3.b(false);
                        this.Y1 = -1;
                        K();
                    }
                    z12 = false;
                }
                z12 = false;
            }
            z10 = z12;
        }
        return !z10 ? super.onTouchEvent(motionEvent) : z10;
    }

    public final void s() {
        long j10;
        CharSequence charSequenceReplaceCharSequence;
        CharSequence charSequence;
        int i10;
        TLRPC.User user;
        CharSequence charSequenceReplaceTags;
        long dialogId;
        TLRPC.User user2;
        CharSequence charSequence2;
        CharSequence string;
        CharSequence charSequence3;
        boolean z10;
        TLRPC.TL_messageActionSuggestProfilePhoto tL_messageActionSuggestProfilePhoto;
        long dialogId2;
        TLRPC.User user3;
        boolean z11;
        CharSequence string2;
        CharSequence string3;
        ArrayList<TLRPC.VideoSize> arrayList;
        TLRPC.User user4;
        TLRPC.Photo photo;
        ArrayList<TLRPC.VideoSize> arrayList2;
        TLRPC.MessageAction messageAction;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        CharSequence string4;
        MessageObject messageObject;
        int i11;
        long peerDialogId;
        boolean z12;
        String strM;
        long fromChatId;
        String string5;
        TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest;
        SpannableStringBuilder spannableStringBuilder;
        String shortName;
        CharSequence charSequenceReplaceTags2;
        CharSequence charSequenceReplaceTags3;
        TLRPC.TL_messageActionStarGiftPurchaseOffer tL_messageActionStarGiftPurchaseOffer;
        SpannableStringBuilder spannableStringBuilder2;
        int iMax;
        String shortDuration2;
        TLRPC.User user5;
        TLRPC.MessageAction messageAction2;
        TLRPC.TL_messageActionStarGift tL_messageActionStarGift;
        long j11;
        long clientUserId;
        TLRPC.Peer peer;
        boolean z13;
        boolean z14;
        long fromChatId2;
        SpannableStringBuilder spannableStringBuilder3;
        TLObject userOrChat;
        long peerDialogId2;
        boolean z15;
        boolean z16;
        int i12;
        TL_stars.StarGift starGift;
        String str;
        boolean z17;
        TLRPC.TL_textWithEntities tL_textWithEntities2;
        CharSequence charSequenceReplaceTags4;
        String string6;
        TL_stars.StarGift starGift2;
        String string7;
        CharSequence string8;
        CharSequence charSequence4;
        TL_stars.StarGift starGift3;
        SpannableStringBuilder spannableStringBuilder4;
        String publicUsername;
        int i13;
        int i14;
        char c10;
        Object objValueOf;
        TLRPC.Peer peer2;
        String string9;
        TLRPC.MessageAction messageAction3;
        TLRPC.Message message;
        TLRPC.MessageAction messageAction4;
        int i15;
        TLRPC.Chat chat;
        TLRPC.User user6;
        String name;
        CharSequence charSequenceReplaceCharSequence2;
        TLRPC.Message message2;
        TLRPC.MessageMedia messageMedia;
        MessageObject messageObject2 = this.D0;
        int i16 = this.D;
        if (messageObject2 != null) {
            if (messageObject2.isExpiredStory()) {
                charSequenceReplaceCharSequence = messageObject2.messageOwner.media.user_id != UserConfig.getInstance(i16).getClientUserId() ? jh.l7.e(R.string.ExpiredStoryMention, true, new Object[0]) : jh.l7.e(R.string.ExpiredStoryMentioned, true, MessagesController.getInstance(i16).getUser(Long.valueOf(messageObject2.getDialogId())).first_name);
            } else {
                t0 t0Var = this.T0;
                if (t0Var != null && t0Var.b() == 0 && MessageObject.isTopicActionMessage(messageObject2)) {
                    TLRPC.TL_forumTopic tL_forumTopicFindTopic = MessagesController.getInstance(i16).getTopicsController().findTopic(-messageObject2.getDialogId(), MessageObject.getTopicId(i16, messageObject2.messageOwner, true));
                    int i17 = wf.c.f49313a;
                    if (tL_forumTopicFindTopic == null) {
                        j10 = 0;
                        charSequenceReplaceCharSequence = null;
                    } else {
                        TLRPC.MessageAction messageAction5 = messageObject2.messageOwner.action;
                        if (messageAction5 instanceof TLRPC.TL_messageActionTopicCreate) {
                            charSequenceReplaceCharSequence = AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.TopicWasCreatedAction), wf.c.j(tL_forumTopicFindTopic, null, null));
                        } else {
                            if (messageAction5 instanceof TLRPC.TL_messageActionTopicEdit) {
                                TLRPC.TL_messageActionTopicEdit tL_messageActionTopicEdit = (TLRPC.TL_messageActionTopicEdit) messageAction5;
                                long fromChatId3 = messageObject2.getFromChatId();
                                if (DialogObject.isUserDialog(fromChatId3)) {
                                    user6 = MessagesController.getInstance(messageObject2.currentAccount).getUser(Long.valueOf(fromChatId3));
                                    chat = null;
                                } else {
                                    chat = MessagesController.getInstance(messageObject2.currentAccount).getChat(Long.valueOf(-fromChatId3));
                                    user6 = null;
                                }
                                if (user6 != null) {
                                    name = ContactsController.formatName(user6.first_name, user6.last_name);
                                } else {
                                    name = chat != null ? chat.title : null;
                                }
                                int i18 = tL_messageActionTopicEdit.flags;
                                if ((i18 & 8) != 0) {
                                    charSequenceReplaceCharSequence = AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(tL_messageActionTopicEdit.hidden ? R.string.TopicHidden2 : R.string.TopicShown2), name);
                                } else {
                                    j10 = 0;
                                    if ((i18 & 4) != 0) {
                                        charSequenceReplaceCharSequence2 = AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceCharSequence("%2$s", LocaleController.getString(tL_messageActionTopicEdit.closed ? R.string.TopicWasClosedAction : R.string.TopicWasReopenedAction), wf.c.j(tL_forumTopicFindTopic, null, null)), name);
                                    } else {
                                        int i19 = i18 & 1;
                                        if (i19 != 0 && (i18 & 2) != 0) {
                                            TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                                            tL_forumTopic.icon_emoji_id = tL_messageActionTopicEdit.icon_emoji_id;
                                            tL_forumTopic.title = tL_messageActionTopicEdit.title;
                                            charSequenceReplaceCharSequence2 = AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceCharSequence("%2$s", LocaleController.getString(R.string.TopicWasRenamedToAction2), wf.c.j(tL_forumTopic, null, null)), name);
                                        } else if (i19 != 0) {
                                            charSequenceReplaceCharSequence2 = AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceCharSequence("%2$s", LocaleController.getString(R.string.TopicWasRenamedToAction), tL_messageActionTopicEdit.title), name);
                                        } else if ((i18 & 2) != 0) {
                                            TLRPC.TL_forumTopic tL_forumTopic2 = new TLRPC.TL_forumTopic();
                                            tL_forumTopic2.icon_emoji_id = tL_messageActionTopicEdit.icon_emoji_id;
                                            tL_forumTopic2.title = "";
                                            charSequenceReplaceCharSequence2 = AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceCharSequence("%2$s", LocaleController.getString(R.string.TopicWasIconChangedToAction), wf.c.j(tL_forumTopic2, null, null)), name);
                                        }
                                    }
                                    charSequenceReplaceCharSequence = charSequenceReplaceCharSequence2;
                                }
                            } else {
                                j10 = 0;
                            }
                            charSequenceReplaceCharSequence = null;
                        }
                    }
                } else {
                    j10 = 0;
                    charSequenceReplaceCharSequence = null;
                }
                if (charSequenceReplaceCharSequence == null) {
                    message2 = messageObject2.messageOwner;
                    if (message2 != null || (messageMedia = message2.media) == null || messageMedia.ttl_seconds == 0) {
                        charSequenceReplaceCharSequence = org.telegram.ui.Components.t5.cloneSpans(messageObject2.messageText);
                    } else if (messageMedia.photo != null) {
                        charSequenceReplaceCharSequence = LocaleController.getString(R.string.AttachPhotoExpired);
                    } else {
                        TLRPC.Document document = messageMedia.document;
                        if (!(document instanceof TLRPC.TL_documentEmpty) && (!(messageMedia instanceof TLRPC.TL_messageMediaDocument) || document != null)) {
                            charSequenceReplaceCharSequence = org.telegram.ui.Components.t5.cloneSpans(messageObject2.messageText);
                        } else if (messageMedia.voice) {
                            charSequenceReplaceCharSequence = LocaleController.getString(R.string.AttachVoiceExpired);
                        } else {
                            charSequenceReplaceCharSequence = messageMedia.round ? LocaleController.getString(R.string.AttachRoundExpired) : LocaleController.getString(R.string.AttachVideoExpired);
                        }
                    }
                }
            }
            j10 = 0;
            if (charSequenceReplaceCharSequence == null) {
                message2 = messageObject2.messageOwner;
                if (message2 != null) {
                    charSequenceReplaceCharSequence = org.telegram.ui.Components.t5.cloneSpans(messageObject2.messageText);
                } else {
                    charSequenceReplaceCharSequence = org.telegram.ui.Components.t5.cloneSpans(messageObject2.messageText);
                }
            }
        } else {
            j10 = 0;
            charSequenceReplaceCharSequence = this.F0;
        }
        MessageObject messageObject3 = this.D0;
        if (messageObject3 != null && messageObject3.isRepostPreview) {
            charSequenceReplaceCharSequence = "";
        }
        if (messageObject3 != null && (message = messageObject3.messageOwner) != null && (messageAction4 = message.action) != null) {
            if (messageAction4 instanceof TLRPC.TL_messageActionTodoAppendTasks) {
                i15 = R.drawable.mini_checklist_add;
            } else if (messageAction4 instanceof TLRPC.TL_messageActionTodoCompletions) {
                TLRPC.TL_messageActionTodoCompletions tL_messageActionTodoCompletions = (TLRPC.TL_messageActionTodoCompletions) messageAction4;
                i15 = tL_messageActionTodoCompletions.incompleted.size() > tL_messageActionTodoCompletions.completed.size() ? R.drawable.mini_checklist_undone : R.drawable.mini_checklist_done;
            } else {
                i15 = 0;
            }
            if (i15 != 0) {
                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(charSequenceReplaceCharSequence);
                spannableStringBuilder5.insert(0, (CharSequence) "i ");
                spannableStringBuilder5.setSpan(new cq(i15, 0), 0, 1, 33);
                charSequenceReplaceCharSequence = spannableStringBuilder5;
            }
        }
        x(this.R, charSequenceReplaceCharSequence);
        if (this.C0 != null) {
            this.I = null;
            this.K = 0;
            this.L = null;
            this.M = 0;
            this.O = 0;
        }
        if (messageObject2 != null) {
            TLRPC.Message message3 = messageObject2.messageOwner;
            if (message3 != null) {
                TLRPC.MessageAction messageAction6 = message3.action;
                if ((messageAction6 instanceof TLRPC.TL_messageActionSuggestedPostApproval) && ((TLRPC.TL_messageActionSuggestedPostApproval) messageAction6).balance_too_low) {
                    w(null, null, charSequenceReplaceCharSequence, false, !ChatObject.canManageMonoForum(i16, messageObject2.getDialogId()) ? LocaleController.getString(R.string.StarsBuy) : null, 11, null, this.W0, false);
                    this.I = null;
                    this.K = 0;
                    this.L = null;
                    this.M = 0;
                    this.O = 0;
                } else {
                    charSequence = charSequenceReplaceCharSequence;
                    if (message3 != null) {
                        messageAction3 = message3.action;
                        if ((messageAction3 instanceof TLRPC.TL_messageActionSuggestedPostApproval) || !((TLRPC.TL_messageActionSuggestedPostApproval) messageAction3).rejected) {
                            i10 = messageObject2.type;
                            if (i10 == 11) {
                                float f10 = (this.R - AndroidUtilities.roundMessageSize) / 2.0f;
                                float fDp = AndroidUtilities.dp(19.0f) + this.K;
                                float f11 = AndroidUtilities.roundMessageSize;
                                this.E.setImageCoords(f10, fDp, f11, f11);
                            } else if (i10 == 25) {
                                v();
                            } else {
                                TextPaint textPaint = this.f25773t1;
                                if (i10 == 30) {
                                    user5 = MessagesController.getInstance(i16).getUser(Long.valueOf(this.D0.getDialogId()));
                                    messageAction2 = messageObject2.messageOwner.action;
                                    if (messageAction2 instanceof TLRPC.TL_messageActionGiftStars) {
                                        CharSequence pluralStringComma = LocaleController.formatPluralStringComma("ActionGiftStarsTitle", (int) ((TLRPC.TL_messageActionGiftStars) messageAction2).stars);
                                        if (this.D0.isOutOwner()) {
                                            string9 = LocaleController.formatString(R.string.ActionGiftStarsSubtitle, UserObject.getForcedFirstName(user5));
                                        } else {
                                            string9 = LocaleController.getString(R.string.ActionGiftStarsSubtitleYou);
                                        }
                                        w(pluralStringComma, null, AndroidUtilities.replaceTags(string9), false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.W0, true);
                                    } else if (!(messageAction2 instanceof TLRPC.TL_messageActionStarGiftUnique) && ((TLRPC.TL_messageActionStarGiftUnique) messageAction2).refunded) {
                                        long clientUserId2 = UserConfig.getInstance(i16).getClientUserId();
                                        TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageObject2.messageOwner.action;
                                        if (messageObject2.isOutOwner() != (!tL_messageActionStarGiftUnique.upgrade)) {
                                            clientUserId2 = messageObject2.getDialogId();
                                        }
                                        TLRPC.User user7 = MessagesController.getInstance(i16).getUser(Long.valueOf(clientUserId2));
                                        SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder();
                                        spannableStringBuilder6.append((CharSequence) LocaleController.getString(tL_messageActionStarGiftUnique.prepaid_upgrade ? R.string.Gift2ActionUpgradeTitle : R.string.Gift2ActionTitle)).append((CharSequence) " ");
                                        if (user7 != null && user7.photo != null) {
                                            spannableStringBuilder6.append((CharSequence) "a ");
                                            org.telegram.ui.g5 g5Var = new org.telegram.ui.g5(this, 18.0f, i16);
                                            g5Var.e(user7);
                                            spannableStringBuilder6.setSpan(g5Var, spannableStringBuilder6.length() - 2, spannableStringBuilder6.length() - 1, 33);
                                        }
                                        spannableStringBuilder6.append((CharSequence) UserObject.getForcedFirstName(user7));
                                        w(spannableStringBuilder6, null, LocaleController.getString(R.string.Gift2ActionUpgradeRefundedText), false, LocaleController.getString(R.string.ActionGiftStarsView), 12, LocaleController.getString(R.string.Gift2UniqueRibbon), this.W0, true);
                                    } else if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                                        tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction2;
                                        j11 = tL_messageActionStarGift.convert_stars;
                                        clientUserId = UserConfig.getInstance(i16).getClientUserId();
                                        peer = tL_messageActionStarGift.peer;
                                        if (peer != null || (tL_messageActionStarGift.prepaid_upgrade && !(peer instanceof TLRPC.TL_peerChannel))) {
                                            z13 = false;
                                        } else {
                                            z13 = true;
                                        }
                                        if (messageObject2.getDialogId() == clientUserId || z13) {
                                            z14 = false;
                                        } else {
                                            z14 = true;
                                        }
                                        fromChatId2 = messageObject2.getFromChatId();
                                        if (!tL_messageActionStarGift.prepaid_upgrade && (peer2 = tL_messageActionStarGift.from_id) != null) {
                                            fromChatId2 = DialogObject.getPeerDialogId(peer2);
                                        }
                                        spannableStringBuilder3 = new SpannableStringBuilder();
                                        userOrChat = MessagesController.getInstance(i16).getUserOrChat(fromChatId2);
                                        peerDialogId2 = DialogObject.getPeerDialogId(tL_messageActionStarGift.to_id);
                                        z15 = z13;
                                        TLObject userOrChat2 = MessagesController.getInstance(i16).getUserOrChat(peerDialogId2);
                                        if (tL_messageActionStarGift.can_upgrade || tL_messageActionStarGift.converted || tL_messageActionStarGift.upgrade_stars <= j10 || tL_messageActionStarGift.upgraded) {
                                            z16 = false;
                                        } else {
                                            z16 = true;
                                        }
                                        if (peerDialogId2 == j10 && tL_messageActionStarGift.auction_acquired && userOrChat2 != null) {
                                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionTitleTo)).append((CharSequence) " ");
                                            if (DialogObject.hasPhoto(userOrChat2)) {
                                                spannableStringBuilder3.append((CharSequence) "a ");
                                                org.telegram.ui.g5 g5Var2 = new org.telegram.ui.g5(this, 18.0f, i16);
                                                int i20 = g5Var2.f38318e;
                                                org.telegram.ui.Components.y8 y8Var = g5Var2.f38317c;
                                                y8Var.j(i20, userOrChat2);
                                                g5Var2.f38316b.setForUserOrChat(userOrChat2, y8Var);
                                                spannableStringBuilder3.setSpan(g5Var2, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                                            }
                                            spannableStringBuilder3.append((CharSequence) DialogObject.getShortName(userOrChat2));
                                        } else if (!z14) {
                                            if (tL_messageActionStarGift.prepaid_upgrade) {
                                                i12 = R.string.Gift2ActionUpgradeTitle;
                                            } else {
                                                i12 = R.string.Gift2ActionTitle;
                                            }
                                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(i12)).append((CharSequence) " ");
                                            if (DialogObject.hasPhoto(userOrChat)) {
                                                spannableStringBuilder3.append((CharSequence) "a ");
                                                org.telegram.ui.g5 g5Var3 = new org.telegram.ui.g5(this, 18.0f, i16);
                                                int i21 = g5Var3.f38318e;
                                                org.telegram.ui.Components.y8 y8Var2 = g5Var3.f38317c;
                                                y8Var2.j(i21, userOrChat);
                                                g5Var3.f38316b.setForUserOrChat(userOrChat, y8Var2);
                                                spannableStringBuilder3.setSpan(g5Var3, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                                            }
                                            spannableStringBuilder3.append((CharSequence) DialogObject.getShortName(userOrChat));
                                        } else if (tL_messageActionStarGift.gift_num > 0 || (starGift = tL_messageActionStarGift.gift) == null || (str = starGift.title) == null) {
                                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                        } else {
                                            spannableStringBuilder3.append((CharSequence) str).append((CharSequence) " #").append((CharSequence) LocaleController.formatNumber(tL_messageActionStarGift.gift_num, ','));
                                        }
                                        z17 = !((messageObject2.isOutOwner() || z14) && tL_messageActionStarGift.converted) && tL_messageActionStarGift.convert_stars > j10 && MessagesController.getInstance(i16).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(i16).getCurrentTime() - messageObject2.messageOwner.date) > 0 && !tL_messageActionStarGift.refunded;
                                        if (tL_messageActionStarGift.refunded) {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionConvertRefundedText);
                                        } else {
                                            tL_textWithEntities2 = tL_messageActionStarGift.message;
                                            if (tL_textWithEntities2 == null && !TextUtils.isEmpty(tL_textWithEntities2.text)) {
                                                SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder(tL_messageActionStarGift.message.text);
                                                textPaint.setTextSize(AndroidUtilities.dp(13.0f));
                                                MessageObject.addEntitiesToText(spannableStringBuilder7, tL_messageActionStarGift.message.entities, false, false, true, true);
                                                charSequenceReplaceTags4 = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji((CharSequence) spannableStringBuilder7, textPaint.getFontMetricsInt(), false, (int[]) null), tL_messageActionStarGift.message.entities, textPaint.getFontMetricsInt());
                                            } else if (tL_messageActionStarGift.auction_acquired) {
                                                charSequenceReplaceTags4 = LocaleController.formatString(R.string.Gift2ActionWonActionText, LocaleController.formatNumber(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                                            } else if (z15) {
                                                if (tL_messageActionStarGift.converted) {
                                                    charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j11);
                                                } else if (z17 || j11 <= j10) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfoChannel", (int) j11));
                                                }
                                            } else if (z14) {
                                                if (!tL_messageActionStarGift.converted && j11 > j10) {
                                                    charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j11);
                                                } else if (tL_messageActionStarGift.can_upgrade) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert));
                                                }
                                            } else if (z16) {
                                                if (messageObject2.isOutOwner()) {
                                                    string6 = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user5));
                                                } else {
                                                    string6 = LocaleController.getString(R.string.Gift2ActionUpgrade);
                                                }
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(string6);
                                            } else if (messageObject2.isOutOwner()) {
                                                if (!z17 && j11 > j10) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionOutInfo", (int) j11, UserObject.getForcedFirstName(user5)));
                                                } else if (tL_messageActionStarGift.can_upgrade) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                                }
                                            } else if (tL_messageActionStarGift.converted) {
                                                charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j11);
                                            } else if (tL_messageActionStarGift.saved) {
                                                if (z17) {
                                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                                } else {
                                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                                }
                                            } else if (z17) {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j11));
                                            } else {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                            }
                                        }
                                        starGift2 = tL_messageActionStarGift.gift;
                                        if (starGift2 == null && starGift2.limited) {
                                            int i22 = R.string.Gift2Limited1OfRibbon;
                                            int i23 = starGift2.availability_total;
                                            if (i23 > 1500) {
                                                c10 = 0;
                                                objValueOf = AndroidUtilities.formatWholeNumber(i23, 0);
                                            } else {
                                                c10 = 0;
                                                objValueOf = Integer.valueOf(i23);
                                            }
                                            Object[] objArr = new Object[1];
                                            objArr[c10] = objValueOf;
                                            string7 = LocaleController.formatString(i22, objArr);
                                        } else {
                                            string7 = null;
                                        }
                                        string8 = LocaleController.getString(R.string.ActionGiftStarsView);
                                        if (messageObject2.isOutOwner() || tL_messageActionStarGift.forceIn || z16) {
                                            charSequence4 = string8;
                                            charSequence4 = string8;
                                            charSequence4 = string8;
                                            if (!messageObject2.isOutOwner() && z16) {
                                                SpannableStringBuilder spannableStringBuilder8 = new SpannableStringBuilder();
                                                spannableStringBuilder8.append((CharSequence) "^  ");
                                                cq cqVar = new cq(R.drawable.gift_unpack, 0);
                                                cqVar.setScale(0.8f, 0.8f);
                                                spannableStringBuilder8.setSpan(cqVar, 0, 1, 33);
                                                spannableStringBuilder8.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                                charSequence4 = spannableStringBuilder8;
                                            }
                                        }
                                        starGift3 = tL_messageActionStarGift.gift;
                                        if (starGift3 != null || starGift3.released_by == null || (publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(i16).getUserOrChat(DialogObject.getPeerDialogId(tL_messageActionStarGift.gift.released_by)))) == null) {
                                            spannableStringBuilder4 = null;
                                        } else {
                                            String string10 = LocaleController.formatString(R.string.Gift2ActionReleasedBy, "@".concat(publicUsername));
                                            int i24 = hh.i5.f9450m1;
                                            int iIndexOf = string10.indexOf("**");
                                            int iIndexOf2 = string10.indexOf("**", iIndexOf + 1);
                                            String strReplace = string10.replace("**", "");
                                            if (iIndexOf < 0 || iIndexOf2 < 0 || (i14 = iIndexOf2 - iIndexOf) <= 2) {
                                                iIndexOf = -1;
                                                i13 = 0;
                                            } else {
                                                i13 = i14 - 2;
                                            }
                                            SpannableStringBuilder spannableStringBuilder9 = new SpannableStringBuilder(strReplace);
                                            if (iIndexOf >= 0) {
                                                spannableStringBuilder9.setSpan(new hh.m3(0), iIndexOf, i13 + iIndexOf, 0);
                                            }
                                            spannableStringBuilder4 = spannableStringBuilder9;
                                        }
                                        w(spannableStringBuilder3, spannableStringBuilder4, charSequenceReplaceTags4, false, charSequence4, 11, string7, this.W0, true);
                                    } else if (messageAction2 instanceof TLRPC.TL_messageActionGiftTon) {
                                        w(LocaleController.getString(R.string.ActionGiftTonTitle), null, this.D0.messageText, false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.W0, true);
                                        this.I = null;
                                        this.K = 0;
                                        this.L = null;
                                        this.M = 0;
                                        this.O = 0;
                                    } else {
                                        w(LocaleController.getString(R.string.ActionStarGiveawayPrizeTitle), null, this.D0.messageText, false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.W0, true);
                                        this.I = null;
                                        this.K = 0;
                                        this.L = null;
                                        this.M = 0;
                                        this.O = 0;
                                    }
                                } else if (i10 == 33) {
                                    tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) message3.action;
                                    spannableStringBuilder2 = new SpannableStringBuilder(charSequence);
                                    spannableStringBuilder2.append((CharSequence) "\n\n");
                                    if (tL_messageActionStarGiftPurchaseOffer.accepted) {
                                        spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftOfferStatusAccepted)));
                                    } else if (tL_messageActionStarGiftPurchaseOffer.declined) {
                                        spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftOfferStatusRejected)));
                                    } else {
                                        iMax = Math.max(0, tL_messageActionStarGiftPurchaseOffer.expires_at - ConnectionsManager.getInstance(i16).getCurrentTime());
                                        if (iMax == 0) {
                                            spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftOfferStatusExpired)));
                                        } else {
                                            shortDuration2 = LocaleController.formatShortDuration2(iMax);
                                            if (shortDuration2.endsWith(".")) {
                                                shortDuration2 = com.google.android.recaptcha.internal.a.n(shortDuration2, 1, 0);
                                            }
                                            spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferStatusPending, shortDuration2)));
                                        }
                                    }
                                    w(null, null, spannableStringBuilder2, false, null, 11, null, this.W0, false);
                                    this.I = null;
                                    this.K = 0;
                                    this.L = null;
                                    this.M = 0;
                                    this.O = 0;
                                } else if (i10 == 34) {
                                    w(null, null, charSequence, false, null, 11, null, this.W0, false);
                                    this.I = null;
                                    this.K = 0;
                                    this.L = null;
                                    this.M = 0;
                                    this.O = 0;
                                } else if (i10 == 35) {
                                    tL_messageActionNoForwardsRequest = (TLRPC.TL_messageActionNoForwardsRequest) message3.action;
                                    spannableStringBuilder = new SpannableStringBuilder();
                                    shortName = DialogObject.getShortName(MessagesController.getInstance(i16).getUser(Long.valueOf(messageObject2.getDialogId())));
                                    if (tL_messageActionNoForwardsRequest.new_value) {
                                        if (messageObject2.isOut()) {
                                            charSequenceReplaceTags3 = LocaleController.getString(R.string.SharingOfferDisableHeaderYou);
                                        } else {
                                            charSequenceReplaceTags3 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SharingOfferDisableHeaderOther, shortName));
                                        }
                                        spannableStringBuilder.append(charSequenceReplaceTags3);
                                    } else {
                                        if (messageObject2.isOut()) {
                                            charSequenceReplaceTags2 = LocaleController.getString(R.string.SharingOfferEnableHeaderYou);
                                        } else {
                                            charSequenceReplaceTags2 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SharingOfferEnableHeaderOther, shortName));
                                        }
                                        spannableStringBuilder.append(charSequenceReplaceTags2);
                                    }
                                    if (tL_messageActionNoForwardsRequest.new_value) {
                                        spannableStringBuilder.append((CharSequence) "\n\n");
                                        spannableStringBuilder.append((CharSequence) y(R.drawable.floating_check, LocaleController.getString(R.string.SharingOfferDisable1)));
                                        spannableStringBuilder.append((CharSequence) "\n\n");
                                        spannableStringBuilder.append((CharSequence) y(R.drawable.floating_check, LocaleController.getString(R.string.SharingOfferDisable2)));
                                        spannableStringBuilder.append((CharSequence) "\n\n");
                                        spannableStringBuilder.append((CharSequence) y(R.drawable.floating_check, LocaleController.getString(R.string.SharingOfferDisable3)));
                                        spannableStringBuilder.append((CharSequence) "\n\n");
                                        spannableStringBuilder.append((CharSequence) y(R.drawable.floating_check, LocaleController.getString(R.string.SharingOfferDisable4)));
                                    } else {
                                        spannableStringBuilder.append((CharSequence) "\n\n");
                                        spannableStringBuilder.append((CharSequence) y(R.drawable.floating_check, LocaleController.getString(R.string.SharingOfferEnable1)));
                                        spannableStringBuilder.append((CharSequence) "\n\n");
                                        spannableStringBuilder.append((CharSequence) y(R.drawable.floating_check, LocaleController.getString(R.string.SharingOfferEnable2)));
                                        spannableStringBuilder.append((CharSequence) "\n\n");
                                        spannableStringBuilder.append((CharSequence) y(R.drawable.floating_check, LocaleController.getString(R.string.SharingOfferEnable3)));
                                        spannableStringBuilder.append((CharSequence) "\n\n");
                                        spannableStringBuilder.append((CharSequence) y(R.drawable.floating_check, LocaleController.getString(R.string.SharingOfferEnable4)));
                                    }
                                    w(null, null, spannableStringBuilder, false, null, 11, null, this.W0, false);
                                    this.I = null;
                                    this.K = 0;
                                    this.L = null;
                                    this.M = 0;
                                    this.O = 0;
                                } else if (i10 == 31) {
                                    TL_stars.StarGift starGift4 = ((TLRPC.TL_chatThemeUniqueGift) ((TLRPC.TL_messageActionSetChatTheme) message3.action).theme).gift;
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(starGift4.title);
                                    sb2.append(" #");
                                    strM = i0.a.m(starGift4.num, ',', sb2);
                                    fromChatId = messageObject2.getFromChatId();
                                    if (UserConfig.getInstance(i16).getClientUserId() == fromChatId) {
                                        string5 = LocaleController.formatString(R.string.GiftThemesSetByYou, strM);
                                    } else {
                                        string5 = LocaleController.formatString(R.string.GiftThemesSetByOther, DialogObject.getShortName(i16, fromChatId), strM);
                                    }
                                    w(null, null, AndroidUtilities.replaceTags(string5), false, LocaleController.getString(R.string.GiftThemesSetActionView), 11, null, this.W0, true);
                                    this.I = null;
                                    this.K = 0;
                                    this.L = null;
                                    this.M = 0;
                                    this.O = 0;
                                } else if (i10 == 37) {
                                    TLRPC.TL_messageActionChangeCommunity tL_messageActionChangeCommunity = (TLRPC.TL_messageActionChangeCommunity) message3.action;
                                    peerDialogId = DialogObject.getPeerDialogId(message3.peer_id);
                                    boolean zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(-peerDialogId, i16);
                                    if (peerDialogId > j10) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    String shortName2 = DialogObject.getShortName(i16, DialogObject.getPeerDialogId(messageObject2.messageOwner.from_id));
                                    String shortName3 = DialogObject.getShortName(i16, -tL_messageActionChangeCommunity.community_id);
                                    SpannableStringBuilder spannableStringBuilder10 = new SpannableStringBuilder();
                                    spannableStringBuilder10.append((CharSequence) oh.r0.a(messageObject2, shortName3, shortName2, zIsChannelAndNotMegaGroup, z12));
                                    w(null, null, spannableStringBuilder10, false, LocaleController.getString(R.string.GiftThemesSetActionView), 11, null, this.W0, true);
                                    this.I = null;
                                    this.K = 0;
                                    this.L = null;
                                    this.M = 0;
                                    this.O = 0;
                                } else if (i10 == 18) {
                                    messageAction = message3.action;
                                    if (messageAction instanceof TLRPC.TL_messageActionGiftPremium) {
                                        tL_textWithEntities = ((TLRPC.TL_messageActionGiftPremium) messageAction).message;
                                    } else if (messageAction instanceof TLRPC.TL_messageActionGiftCode) {
                                        tL_textWithEntities = ((TLRPC.TL_messageActionGiftCode) messageAction).message;
                                    } else {
                                        tL_textWithEntities = null;
                                    }
                                    if (tL_textWithEntities != null || TextUtils.isEmpty(tL_textWithEntities.text)) {
                                        string4 = null;
                                    } else {
                                        SpannableStringBuilder spannableStringBuilder11 = new SpannableStringBuilder(tL_textWithEntities.text);
                                        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
                                        MessageObject.addEntitiesToText(spannableStringBuilder11, tL_textWithEntities.entities, false, false, true, true);
                                        string4 = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji((CharSequence) spannableStringBuilder11, textPaint.getFontMetricsInt(), false, (int[]) null), tL_textWithEntities.entities, textPaint.getFontMetricsInt());
                                    }
                                    if (string4 == null) {
                                        string4 = LocaleController.getString(R.string.ActionGiftPremiumText);
                                    }
                                    CharSequence charSequence5 = string4;
                                    messageObject = this.D0;
                                    if (messageObject == null && (messageObject.messageOwner.action instanceof TLRPC.TL_messageActionGiftCode) && !O()) {
                                        i11 = R.string.GiftPremiumUseGiftBtn;
                                    } else {
                                        i11 = R.string.ActionGiftPremiumView;
                                    }
                                    w(LocaleController.formatPluralStringComma("ActionGiftPremiumTitle2", messageObject2.messageOwner.action.months), null, charSequence5, true, LocaleController.getString(i11), 11, null, this.W0, false);
                                } else if (i10 == 21) {
                                    tL_messageActionSuggestProfilePhoto = (TLRPC.TL_messageActionSuggestProfilePhoto) message3.action;
                                    MessagesController messagesController = MessagesController.getInstance(i16);
                                    if (messageObject2.isOutOwner()) {
                                        dialogId2 = j10;
                                    } else {
                                        dialogId2 = messageObject2.getDialogId();
                                    }
                                    user3 = messagesController.getUser(Long.valueOf(dialogId2));
                                    if (tL_messageActionSuggestProfilePhoto.video && ((photo = tL_messageActionSuggestProfilePhoto.photo) == null || (arrayList2 = photo.video_sizes) == null || arrayList2.isEmpty())) {
                                        z11 = false;
                                    } else {
                                        z11 = true;
                                    }
                                    if (user3.f22527id == UserConfig.getInstance(i16).clientUserId) {
                                        user4 = MessagesController.getInstance(i16).getUser(Long.valueOf(messageObject2.getDialogId()));
                                        if (z11) {
                                            string2 = LocaleController.formatString(R.string.ActionSuggestVideoFromYouDescription, user4.first_name);
                                        } else {
                                            string2 = LocaleController.formatString(R.string.ActionSuggestPhotoFromYouDescription, user4.first_name);
                                        }
                                    } else if (z11) {
                                        string2 = LocaleController.formatString(R.string.ActionSuggestVideoToYouDescription, user3.first_name);
                                    } else {
                                        string2 = LocaleController.formatString(R.string.ActionSuggestPhotoToYouDescription, user3.first_name);
                                    }
                                    CharSequence charSequence6 = string2;
                                    if (tL_messageActionSuggestProfilePhoto.video && ((arrayList = tL_messageActionSuggestProfilePhoto.photo.video_sizes) == null || arrayList.isEmpty())) {
                                        string3 = LocaleController.getString(R.string.ViewPhotoAction);
                                    } else {
                                        string3 = LocaleController.getString(R.string.ViewVideoAction);
                                    }
                                    w(null, null, charSequence6, false, string3, 11, null, this.W0, true);
                                    this.I = null;
                                    this.K = 0;
                                    this.L = null;
                                    this.M = 0;
                                    this.O = 0;
                                } else if (i10 == 22) {
                                    MessagesController messagesController2 = MessagesController.getInstance(i16);
                                    if (messageObject2.isOutOwner()) {
                                        dialogId = j10;
                                    } else {
                                        dialogId = messageObject2.getDialogId();
                                    }
                                    user2 = messagesController2.getUser(Long.valueOf(dialogId));
                                    if (messageObject2.getDialogId() < j10) {
                                        charSequence3 = messageObject2.messageText;
                                    } else {
                                        if (messageObject2.isOutOwner() && messageObject2.isWallpaperForBoth() && messageObject2.isCurrentWallpaper()) {
                                            charSequence2 = messageObject2.messageText;
                                            string = LocaleController.getString(R.string.RemoveWallpaperAction);
                                            z10 = false;
                                        } else {
                                            if (user2 == null && user2.f22527id == UserConfig.getInstance(i16).clientUserId) {
                                                charSequence3 = messageObject2.messageText;
                                            } else {
                                                charSequence2 = messageObject2.messageText;
                                                string = LocaleController.getString(R.string.ViewWallpaperAction);
                                            }
                                            z10 = true;
                                        }
                                        w(null, null, charSequence2, false, string, 11, null, this.W0, z10);
                                        this.I = null;
                                        this.K = 0;
                                        this.L = null;
                                        this.M = 0;
                                        this.O = 0;
                                    }
                                    charSequence2 = charSequence3;
                                    string = null;
                                    z10 = true;
                                    w(null, null, charSequence2, false, string, 11, null, this.W0, z10);
                                    this.I = null;
                                    this.K = 0;
                                    this.L = null;
                                    this.M = 0;
                                    this.O = 0;
                                } else if (messageObject2.isStoryMention()) {
                                    user = MessagesController.getInstance(i16).getUser(Long.valueOf(messageObject2.messageOwner.media.user_id));
                                    if (user.self) {
                                        charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoryYouMentionedTitle, MessagesController.getInstance(i16).getUser(Long.valueOf(messageObject2.getDialogId())).first_name));
                                    } else {
                                        charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoryMentionedTitle, user.first_name));
                                    }
                                    w(null, null, charSequenceReplaceTags, false, LocaleController.getString(R.string.StoryMentionedAction), 11, null, this.W0, true);
                                    this.I = null;
                                    this.K = 0;
                                    this.L = null;
                                    this.M = 0;
                                    this.O = 0;
                                }
                            }
                        } else {
                            w(null, null, charSequence, false, null, 11, null, this.W0, false);
                            this.I = null;
                            this.K = 0;
                            this.L = null;
                            this.M = 0;
                            this.O = 0;
                        }
                    } else {
                        i10 = messageObject2.type;
                        if (i10 == 11) {
                            float f12 = (this.R - AndroidUtilities.roundMessageSize) / 2.0f;
                            float fDp2 = AndroidUtilities.dp(19.0f) + this.K;
                            float f13 = AndroidUtilities.roundMessageSize;
                            this.E.setImageCoords(f12, fDp2, f13, f13);
                        } else if (i10 == 25) {
                            v();
                        } else {
                            TextPaint textPaint2 = this.f25773t1;
                            if (i10 == 30) {
                                user5 = MessagesController.getInstance(i16).getUser(Long.valueOf(this.D0.getDialogId()));
                                messageAction2 = messageObject2.messageOwner.action;
                                if (messageAction2 instanceof TLRPC.TL_messageActionGiftStars) {
                                    CharSequence pluralStringComma2 = LocaleController.formatPluralStringComma("ActionGiftStarsTitle", (int) ((TLRPC.TL_messageActionGiftStars) messageAction2).stars);
                                    if (this.D0.isOutOwner()) {
                                        string9 = LocaleController.formatString(R.string.ActionGiftStarsSubtitle, UserObject.getForcedFirstName(user5));
                                    } else {
                                        string9 = LocaleController.getString(R.string.ActionGiftStarsSubtitleYou);
                                    }
                                    w(pluralStringComma2, null, AndroidUtilities.replaceTags(string9), false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.W0, true);
                                } else if (!(messageAction2 instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                                    if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                                        tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction2;
                                        j11 = tL_messageActionStarGift.convert_stars;
                                        clientUserId = UserConfig.getInstance(i16).getClientUserId();
                                        peer = tL_messageActionStarGift.peer;
                                        if (peer != null) {
                                            z13 = false;
                                        } else {
                                            z13 = false;
                                        }
                                        if (messageObject2.getDialogId() == clientUserId) {
                                            z14 = false;
                                        } else {
                                            z14 = false;
                                        }
                                        fromChatId2 = messageObject2.getFromChatId();
                                        if (!tL_messageActionStarGift.prepaid_upgrade) {
                                            fromChatId2 = DialogObject.getPeerDialogId(peer2);
                                        }
                                        spannableStringBuilder3 = new SpannableStringBuilder();
                                        userOrChat = MessagesController.getInstance(i16).getUserOrChat(fromChatId2);
                                        peerDialogId2 = DialogObject.getPeerDialogId(tL_messageActionStarGift.to_id);
                                        z15 = z13;
                                        TLObject userOrChat3 = MessagesController.getInstance(i16).getUserOrChat(peerDialogId2);
                                        if (tL_messageActionStarGift.can_upgrade) {
                                            z16 = false;
                                        } else {
                                            z16 = false;
                                        }
                                        if (peerDialogId2 == j10) {
                                            if (!z14) {
                                                if (tL_messageActionStarGift.prepaid_upgrade) {
                                                    i12 = R.string.Gift2ActionUpgradeTitle;
                                                } else {
                                                    i12 = R.string.Gift2ActionTitle;
                                                }
                                                spannableStringBuilder3.append((CharSequence) LocaleController.getString(i12)).append((CharSequence) " ");
                                                if (DialogObject.hasPhoto(userOrChat)) {
                                                    spannableStringBuilder3.append((CharSequence) "a ");
                                                    org.telegram.ui.g5 g5Var4 = new org.telegram.ui.g5(this, 18.0f, i16);
                                                    int i25 = g5Var4.f38318e;
                                                    org.telegram.ui.Components.y8 y8Var3 = g5Var4.f38317c;
                                                    y8Var3.j(i25, userOrChat);
                                                    g5Var4.f38316b.setForUserOrChat(userOrChat, y8Var3);
                                                    spannableStringBuilder3.setSpan(g5Var4, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                                                }
                                                spannableStringBuilder3.append((CharSequence) DialogObject.getShortName(userOrChat));
                                            } else if (tL_messageActionStarGift.gift_num > 0) {
                                                spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                            } else {
                                                spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                            }
                                        } else if (!z14) {
                                            if (tL_messageActionStarGift.prepaid_upgrade) {
                                                i12 = R.string.Gift2ActionUpgradeTitle;
                                            } else {
                                                i12 = R.string.Gift2ActionTitle;
                                            }
                                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(i12)).append((CharSequence) " ");
                                            if (DialogObject.hasPhoto(userOrChat)) {
                                                spannableStringBuilder3.append((CharSequence) "a ");
                                                org.telegram.ui.g5 g5Var5 = new org.telegram.ui.g5(this, 18.0f, i16);
                                                int i26 = g5Var5.f38318e;
                                                org.telegram.ui.Components.y8 y8Var4 = g5Var5.f38317c;
                                                y8Var4.j(i26, userOrChat);
                                                g5Var5.f38316b.setForUserOrChat(userOrChat, y8Var4);
                                                spannableStringBuilder3.setSpan(g5Var5, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                                            }
                                            spannableStringBuilder3.append((CharSequence) DialogObject.getShortName(userOrChat));
                                        } else if (tL_messageActionStarGift.gift_num > 0) {
                                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                        } else {
                                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                        }
                                        if (messageObject2.isOutOwner()) {
                                        }
                                        if (tL_messageActionStarGift.refunded) {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionConvertRefundedText);
                                        } else {
                                            tL_textWithEntities2 = tL_messageActionStarGift.message;
                                            if (tL_textWithEntities2 == null) {
                                                if (tL_messageActionStarGift.auction_acquired) {
                                                    charSequenceReplaceTags4 = LocaleController.formatString(R.string.Gift2ActionWonActionText, LocaleController.formatNumber(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                                                } else if (z15) {
                                                    if (tL_messageActionStarGift.converted) {
                                                        charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j11);
                                                    } else if (z17) {
                                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                                    } else {
                                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                                    }
                                                } else if (z14) {
                                                    if (!tL_messageActionStarGift.converted) {
                                                        if (tL_messageActionStarGift.can_upgrade) {
                                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade));
                                                        } else {
                                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert));
                                                        }
                                                    } else if (tL_messageActionStarGift.can_upgrade) {
                                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade));
                                                    } else {
                                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert));
                                                    }
                                                } else if (z16) {
                                                    if (messageObject2.isOutOwner()) {
                                                        string6 = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user5));
                                                    } else {
                                                        string6 = LocaleController.getString(R.string.Gift2ActionUpgrade);
                                                    }
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(string6);
                                                } else if (messageObject2.isOutOwner()) {
                                                    if (!z17) {
                                                        if (tL_messageActionStarGift.can_upgrade) {
                                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                                        } else {
                                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                                        }
                                                    } else if (tL_messageActionStarGift.can_upgrade) {
                                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                                    } else {
                                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                                    }
                                                } else if (tL_messageActionStarGift.converted) {
                                                    charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j11);
                                                } else if (tL_messageActionStarGift.saved) {
                                                    if (z17) {
                                                        charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                                    } else {
                                                        charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                                    }
                                                } else if (z17) {
                                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j11));
                                                }
                                            } else if (tL_messageActionStarGift.auction_acquired) {
                                                charSequenceReplaceTags4 = LocaleController.formatString(R.string.Gift2ActionWonActionText, LocaleController.formatNumber(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                                            } else if (z15) {
                                                if (tL_messageActionStarGift.converted) {
                                                    charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j11);
                                                } else if (z17) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                                }
                                            } else if (z14) {
                                                if (!tL_messageActionStarGift.converted) {
                                                    if (tL_messageActionStarGift.can_upgrade) {
                                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade));
                                                    } else {
                                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert));
                                                    }
                                                } else if (tL_messageActionStarGift.can_upgrade) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert));
                                                }
                                            } else if (z16) {
                                                if (messageObject2.isOutOwner()) {
                                                    string6 = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user5));
                                                } else {
                                                    string6 = LocaleController.getString(R.string.Gift2ActionUpgrade);
                                                }
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(string6);
                                            } else if (messageObject2.isOutOwner()) {
                                                if (!z17) {
                                                    if (tL_messageActionStarGift.can_upgrade) {
                                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                                    } else {
                                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                                    }
                                                } else if (tL_messageActionStarGift.can_upgrade) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                                }
                                            } else if (tL_messageActionStarGift.converted) {
                                                charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j11);
                                            } else if (tL_messageActionStarGift.saved) {
                                                if (z17) {
                                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                                } else {
                                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                                }
                                            } else if (z17) {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j11));
                                            }
                                        }
                                        starGift2 = tL_messageActionStarGift.gift;
                                        if (starGift2 == null) {
                                            string7 = null;
                                        } else {
                                            string7 = null;
                                        }
                                        string8 = LocaleController.getString(R.string.ActionGiftStarsView);
                                        if (messageObject2.isOutOwner()) {
                                            charSequence4 = string8;
                                            charSequence4 = string8;
                                            charSequence4 = string8;
                                            if (!messageObject2.isOutOwner()) {
                                                SpannableStringBuilder spannableStringBuilder12 = new SpannableStringBuilder();
                                                spannableStringBuilder12.append((CharSequence) "^  ");
                                                cq cqVar2 = new cq(R.drawable.gift_unpack, 0);
                                                cqVar2.setScale(0.8f, 0.8f);
                                                spannableStringBuilder12.setSpan(cqVar2, 0, 1, 33);
                                                spannableStringBuilder12.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                                charSequence4 = spannableStringBuilder12;
                                            }
                                        } else {
                                            charSequence4 = string8;
                                            charSequence4 = string8;
                                            charSequence4 = string8;
                                            if (!messageObject2.isOutOwner()) {
                                                SpannableStringBuilder spannableStringBuilder13 = new SpannableStringBuilder();
                                                spannableStringBuilder13.append((CharSequence) "^  ");
                                                cq cqVar3 = new cq(R.drawable.gift_unpack, 0);
                                                cqVar3.setScale(0.8f, 0.8f);
                                                spannableStringBuilder13.setSpan(cqVar3, 0, 1, 33);
                                                spannableStringBuilder13.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                                charSequence4 = spannableStringBuilder13;
                                            }
                                        }
                                        starGift3 = tL_messageActionStarGift.gift;
                                        if (starGift3 != null) {
                                            spannableStringBuilder4 = null;
                                        } else {
                                            spannableStringBuilder4 = null;
                                        }
                                        w(spannableStringBuilder3, spannableStringBuilder4, charSequenceReplaceTags4, false, charSequence4, 11, string7, this.W0, true);
                                    } else if (messageAction2 instanceof TLRPC.TL_messageActionGiftTon) {
                                        w(LocaleController.getString(R.string.ActionGiftTonTitle), null, this.D0.messageText, false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.W0, true);
                                        this.I = null;
                                        this.K = 0;
                                        this.L = null;
                                        this.M = 0;
                                        this.O = 0;
                                    } else {
                                        w(LocaleController.getString(R.string.ActionStarGiveawayPrizeTitle), null, this.D0.messageText, false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.W0, true);
                                        this.I = null;
                                        this.K = 0;
                                        this.L = null;
                                        this.M = 0;
                                        this.O = 0;
                                    }
                                } else if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                                    tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction2;
                                    j11 = tL_messageActionStarGift.convert_stars;
                                    clientUserId = UserConfig.getInstance(i16).getClientUserId();
                                    peer = tL_messageActionStarGift.peer;
                                    if (peer != null) {
                                        z13 = false;
                                    } else {
                                        z13 = false;
                                    }
                                    if (messageObject2.getDialogId() == clientUserId) {
                                        z14 = false;
                                    } else {
                                        z14 = false;
                                    }
                                    fromChatId2 = messageObject2.getFromChatId();
                                    if (!tL_messageActionStarGift.prepaid_upgrade) {
                                        fromChatId2 = DialogObject.getPeerDialogId(peer2);
                                    }
                                    spannableStringBuilder3 = new SpannableStringBuilder();
                                    userOrChat = MessagesController.getInstance(i16).getUserOrChat(fromChatId2);
                                    peerDialogId2 = DialogObject.getPeerDialogId(tL_messageActionStarGift.to_id);
                                    z15 = z13;
                                    TLObject userOrChat4 = MessagesController.getInstance(i16).getUserOrChat(peerDialogId2);
                                    if (tL_messageActionStarGift.can_upgrade) {
                                        z16 = false;
                                    } else {
                                        z16 = false;
                                    }
                                    if (peerDialogId2 == j10) {
                                        if (!z14) {
                                            if (tL_messageActionStarGift.prepaid_upgrade) {
                                                i12 = R.string.Gift2ActionUpgradeTitle;
                                            } else {
                                                i12 = R.string.Gift2ActionTitle;
                                            }
                                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(i12)).append((CharSequence) " ");
                                            if (DialogObject.hasPhoto(userOrChat)) {
                                                spannableStringBuilder3.append((CharSequence) "a ");
                                                org.telegram.ui.g5 g5Var6 = new org.telegram.ui.g5(this, 18.0f, i16);
                                                int i27 = g5Var6.f38318e;
                                                org.telegram.ui.Components.y8 y8Var5 = g5Var6.f38317c;
                                                y8Var5.j(i27, userOrChat);
                                                g5Var6.f38316b.setForUserOrChat(userOrChat, y8Var5);
                                                spannableStringBuilder3.setSpan(g5Var6, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                                            }
                                            spannableStringBuilder3.append((CharSequence) DialogObject.getShortName(userOrChat));
                                        } else if (tL_messageActionStarGift.gift_num > 0) {
                                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                        } else {
                                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                        }
                                    } else if (!z14) {
                                        if (tL_messageActionStarGift.prepaid_upgrade) {
                                            i12 = R.string.Gift2ActionUpgradeTitle;
                                        } else {
                                            i12 = R.string.Gift2ActionTitle;
                                        }
                                        spannableStringBuilder3.append((CharSequence) LocaleController.getString(i12)).append((CharSequence) " ");
                                        if (DialogObject.hasPhoto(userOrChat)) {
                                            spannableStringBuilder3.append((CharSequence) "a ");
                                            org.telegram.ui.g5 g5Var7 = new org.telegram.ui.g5(this, 18.0f, i16);
                                            int i28 = g5Var7.f38318e;
                                            org.telegram.ui.Components.y8 y8Var6 = g5Var7.f38317c;
                                            y8Var6.j(i28, userOrChat);
                                            g5Var7.f38316b.setForUserOrChat(userOrChat, y8Var6);
                                            spannableStringBuilder3.setSpan(g5Var7, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                                        }
                                        spannableStringBuilder3.append((CharSequence) DialogObject.getShortName(userOrChat));
                                    } else if (tL_messageActionStarGift.gift_num > 0) {
                                        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                    } else {
                                        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                    }
                                    if (messageObject2.isOutOwner()) {
                                    }
                                    if (tL_messageActionStarGift.refunded) {
                                        charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionConvertRefundedText);
                                    } else {
                                        tL_textWithEntities2 = tL_messageActionStarGift.message;
                                        if (tL_textWithEntities2 == null) {
                                            if (tL_messageActionStarGift.auction_acquired) {
                                                charSequenceReplaceTags4 = LocaleController.formatString(R.string.Gift2ActionWonActionText, LocaleController.formatNumber(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                                            } else if (z15) {
                                                if (tL_messageActionStarGift.converted) {
                                                    charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j11);
                                                } else if (z17) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                                }
                                            } else if (z14) {
                                                if (!tL_messageActionStarGift.converted) {
                                                    if (tL_messageActionStarGift.can_upgrade) {
                                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade));
                                                    } else {
                                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert));
                                                    }
                                                } else if (tL_messageActionStarGift.can_upgrade) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert));
                                                }
                                            } else if (z16) {
                                                if (messageObject2.isOutOwner()) {
                                                    string6 = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user5));
                                                } else {
                                                    string6 = LocaleController.getString(R.string.Gift2ActionUpgrade);
                                                }
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(string6);
                                            } else if (messageObject2.isOutOwner()) {
                                                if (!z17) {
                                                    if (tL_messageActionStarGift.can_upgrade) {
                                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                                    } else {
                                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                                    }
                                                } else if (tL_messageActionStarGift.can_upgrade) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                                }
                                            } else if (tL_messageActionStarGift.converted) {
                                                charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j11);
                                            } else if (tL_messageActionStarGift.saved) {
                                                if (z17) {
                                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                                } else {
                                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                                }
                                            } else if (z17) {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j11));
                                            }
                                        } else if (tL_messageActionStarGift.auction_acquired) {
                                            charSequenceReplaceTags4 = LocaleController.formatString(R.string.Gift2ActionWonActionText, LocaleController.formatNumber(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                                        } else if (z15) {
                                            if (tL_messageActionStarGift.converted) {
                                                charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j11);
                                            } else if (z17) {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                            }
                                        } else if (z14) {
                                            if (!tL_messageActionStarGift.converted) {
                                                if (tL_messageActionStarGift.can_upgrade) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert));
                                                }
                                            } else if (tL_messageActionStarGift.can_upgrade) {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade));
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert));
                                            }
                                        } else if (z16) {
                                            if (messageObject2.isOutOwner()) {
                                                string6 = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user5));
                                            } else {
                                                string6 = LocaleController.getString(R.string.Gift2ActionUpgrade);
                                            }
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(string6);
                                        } else if (messageObject2.isOutOwner()) {
                                            if (!z17) {
                                                if (tL_messageActionStarGift.can_upgrade) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                                }
                                            } else if (tL_messageActionStarGift.can_upgrade) {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                            }
                                        } else if (tL_messageActionStarGift.converted) {
                                            charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j11);
                                        } else if (tL_messageActionStarGift.saved) {
                                            if (z17) {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                            } else {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                            }
                                        } else if (z17) {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                        } else {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j11));
                                        }
                                    }
                                    starGift2 = tL_messageActionStarGift.gift;
                                    if (starGift2 == null) {
                                        string7 = null;
                                    } else {
                                        string7 = null;
                                    }
                                    string8 = LocaleController.getString(R.string.ActionGiftStarsView);
                                    if (messageObject2.isOutOwner()) {
                                        charSequence4 = string8;
                                        charSequence4 = string8;
                                        charSequence4 = string8;
                                        if (!messageObject2.isOutOwner()) {
                                            SpannableStringBuilder spannableStringBuilder14 = new SpannableStringBuilder();
                                            spannableStringBuilder14.append((CharSequence) "^  ");
                                            cq cqVar4 = new cq(R.drawable.gift_unpack, 0);
                                            cqVar4.setScale(0.8f, 0.8f);
                                            spannableStringBuilder14.setSpan(cqVar4, 0, 1, 33);
                                            spannableStringBuilder14.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                            charSequence4 = spannableStringBuilder14;
                                        }
                                    } else {
                                        charSequence4 = string8;
                                        charSequence4 = string8;
                                        charSequence4 = string8;
                                        if (!messageObject2.isOutOwner()) {
                                            SpannableStringBuilder spannableStringBuilder15 = new SpannableStringBuilder();
                                            spannableStringBuilder15.append((CharSequence) "^  ");
                                            cq cqVar5 = new cq(R.drawable.gift_unpack, 0);
                                            cqVar5.setScale(0.8f, 0.8f);
                                            spannableStringBuilder15.setSpan(cqVar5, 0, 1, 33);
                                            spannableStringBuilder15.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                            charSequence4 = spannableStringBuilder15;
                                        }
                                    }
                                    starGift3 = tL_messageActionStarGift.gift;
                                    if (starGift3 != null) {
                                        spannableStringBuilder4 = null;
                                    } else {
                                        spannableStringBuilder4 = null;
                                    }
                                    w(spannableStringBuilder3, spannableStringBuilder4, charSequenceReplaceTags4, false, charSequence4, 11, string7, this.W0, true);
                                } else if (messageAction2 instanceof TLRPC.TL_messageActionGiftTon) {
                                    w(LocaleController.getString(R.string.ActionGiftTonTitle), null, this.D0.messageText, false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.W0, true);
                                    this.I = null;
                                    this.K = 0;
                                    this.L = null;
                                    this.M = 0;
                                    this.O = 0;
                                } else {
                                    w(LocaleController.getString(R.string.ActionStarGiveawayPrizeTitle), null, this.D0.messageText, false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.W0, true);
                                    this.I = null;
                                    this.K = 0;
                                    this.L = null;
                                    this.M = 0;
                                    this.O = 0;
                                }
                            } else if (i10 == 33) {
                                tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) message3.action;
                                spannableStringBuilder2 = new SpannableStringBuilder(charSequence);
                                spannableStringBuilder2.append((CharSequence) "\n\n");
                                if (tL_messageActionStarGiftPurchaseOffer.accepted) {
                                    spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftOfferStatusAccepted)));
                                } else if (tL_messageActionStarGiftPurchaseOffer.declined) {
                                    spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftOfferStatusRejected)));
                                } else {
                                    iMax = Math.max(0, tL_messageActionStarGiftPurchaseOffer.expires_at - ConnectionsManager.getInstance(i16).getCurrentTime());
                                    if (iMax == 0) {
                                        spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftOfferStatusExpired)));
                                    } else {
                                        shortDuration2 = LocaleController.formatShortDuration2(iMax);
                                        if (shortDuration2.endsWith(".")) {
                                            shortDuration2 = com.google.android.recaptcha.internal.a.n(shortDuration2, 1, 0);
                                        }
                                        spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferStatusPending, shortDuration2)));
                                    }
                                }
                                w(null, null, spannableStringBuilder2, false, null, 11, null, this.W0, false);
                                this.I = null;
                                this.K = 0;
                                this.L = null;
                                this.M = 0;
                                this.O = 0;
                            } else if (i10 == 34) {
                                w(null, null, charSequence, false, null, 11, null, this.W0, false);
                                this.I = null;
                                this.K = 0;
                                this.L = null;
                                this.M = 0;
                                this.O = 0;
                            } else if (i10 == 35) {
                                tL_messageActionNoForwardsRequest = (TLRPC.TL_messageActionNoForwardsRequest) message3.action;
                                spannableStringBuilder = new SpannableStringBuilder();
                                shortName = DialogObject.getShortName(MessagesController.getInstance(i16).getUser(Long.valueOf(messageObject2.getDialogId())));
                                if (tL_messageActionNoForwardsRequest.new_value) {
                                    if (messageObject2.isOut()) {
                                        charSequenceReplaceTags3 = LocaleController.getString(R.string.SharingOfferDisableHeaderYou);
                                    } else {
                                        charSequenceReplaceTags3 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SharingOfferDisableHeaderOther, shortName));
                                    }
                                    spannableStringBuilder.append(charSequenceReplaceTags3);
                                } else {
                                    if (messageObject2.isOut()) {
                                        charSequenceReplaceTags2 = LocaleController.getString(R.string.SharingOfferEnableHeaderYou);
                                    } else {
                                        charSequenceReplaceTags2 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SharingOfferEnableHeaderOther, shortName));
                                    }
                                    spannableStringBuilder.append(charSequenceReplaceTags2);
                                }
                                if (tL_messageActionNoForwardsRequest.new_value) {
                                    spannableStringBuilder.append((CharSequence) "\n\n");
                                    spannableStringBuilder.append((CharSequence) y(R.drawable.floating_check, LocaleController.getString(R.string.SharingOfferDisable1)));
                                    spannableStringBuilder.append((CharSequence) "\n\n");
                                    spannableStringBuilder.append((CharSequence) y(R.drawable.floating_check, LocaleController.getString(R.string.SharingOfferDisable2)));
                                    spannableStringBuilder.append((CharSequence) "\n\n");
                                    spannableStringBuilder.append((CharSequence) y(R.drawable.floating_check, LocaleController.getString(R.string.SharingOfferDisable3)));
                                    spannableStringBuilder.append((CharSequence) "\n\n");
                                    spannableStringBuilder.append((CharSequence) y(R.drawable.floating_check, LocaleController.getString(R.string.SharingOfferDisable4)));
                                } else {
                                    spannableStringBuilder.append((CharSequence) "\n\n");
                                    spannableStringBuilder.append((CharSequence) y(R.drawable.floating_check, LocaleController.getString(R.string.SharingOfferEnable1)));
                                    spannableStringBuilder.append((CharSequence) "\n\n");
                                    spannableStringBuilder.append((CharSequence) y(R.drawable.floating_check, LocaleController.getString(R.string.SharingOfferEnable2)));
                                    spannableStringBuilder.append((CharSequence) "\n\n");
                                    spannableStringBuilder.append((CharSequence) y(R.drawable.floating_check, LocaleController.getString(R.string.SharingOfferEnable3)));
                                    spannableStringBuilder.append((CharSequence) "\n\n");
                                    spannableStringBuilder.append((CharSequence) y(R.drawable.floating_check, LocaleController.getString(R.string.SharingOfferEnable4)));
                                }
                                w(null, null, spannableStringBuilder, false, null, 11, null, this.W0, false);
                                this.I = null;
                                this.K = 0;
                                this.L = null;
                                this.M = 0;
                                this.O = 0;
                            } else if (i10 == 31) {
                                TL_stars.StarGift starGift5 = ((TLRPC.TL_chatThemeUniqueGift) ((TLRPC.TL_messageActionSetChatTheme) message3.action).theme).gift;
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(starGift5.title);
                                sb3.append(" #");
                                strM = i0.a.m(starGift5.num, ',', sb3);
                                fromChatId = messageObject2.getFromChatId();
                                if (UserConfig.getInstance(i16).getClientUserId() == fromChatId) {
                                    string5 = LocaleController.formatString(R.string.GiftThemesSetByYou, strM);
                                } else {
                                    string5 = LocaleController.formatString(R.string.GiftThemesSetByOther, DialogObject.getShortName(i16, fromChatId), strM);
                                }
                                w(null, null, AndroidUtilities.replaceTags(string5), false, LocaleController.getString(R.string.GiftThemesSetActionView), 11, null, this.W0, true);
                                this.I = null;
                                this.K = 0;
                                this.L = null;
                                this.M = 0;
                                this.O = 0;
                            } else if (i10 == 37) {
                                TLRPC.TL_messageActionChangeCommunity tL_messageActionChangeCommunity2 = (TLRPC.TL_messageActionChangeCommunity) message3.action;
                                peerDialogId = DialogObject.getPeerDialogId(message3.peer_id);
                                boolean zIsChannelAndNotMegaGroup2 = ChatObject.isChannelAndNotMegaGroup(-peerDialogId, i16);
                                if (peerDialogId > j10) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                String shortName4 = DialogObject.getShortName(i16, DialogObject.getPeerDialogId(messageObject2.messageOwner.from_id));
                                String shortName5 = DialogObject.getShortName(i16, -tL_messageActionChangeCommunity2.community_id);
                                SpannableStringBuilder spannableStringBuilder16 = new SpannableStringBuilder();
                                spannableStringBuilder16.append((CharSequence) oh.r0.a(messageObject2, shortName5, shortName4, zIsChannelAndNotMegaGroup2, z12));
                                w(null, null, spannableStringBuilder16, false, LocaleController.getString(R.string.GiftThemesSetActionView), 11, null, this.W0, true);
                                this.I = null;
                                this.K = 0;
                                this.L = null;
                                this.M = 0;
                                this.O = 0;
                            } else if (i10 == 18) {
                                messageAction = message3.action;
                                if (messageAction instanceof TLRPC.TL_messageActionGiftPremium) {
                                    tL_textWithEntities = ((TLRPC.TL_messageActionGiftPremium) messageAction).message;
                                } else if (messageAction instanceof TLRPC.TL_messageActionGiftCode) {
                                    tL_textWithEntities = ((TLRPC.TL_messageActionGiftCode) messageAction).message;
                                } else {
                                    tL_textWithEntities = null;
                                }
                                if (tL_textWithEntities != null) {
                                    string4 = null;
                                } else {
                                    string4 = null;
                                }
                                if (string4 == null) {
                                    string4 = LocaleController.getString(R.string.ActionGiftPremiumText);
                                }
                                CharSequence charSequence7 = string4;
                                messageObject = this.D0;
                                if (messageObject == null) {
                                    i11 = R.string.ActionGiftPremiumView;
                                } else {
                                    i11 = R.string.ActionGiftPremiumView;
                                }
                                w(LocaleController.formatPluralStringComma("ActionGiftPremiumTitle2", messageObject2.messageOwner.action.months), null, charSequence7, true, LocaleController.getString(i11), 11, null, this.W0, false);
                            } else if (i10 == 21) {
                                tL_messageActionSuggestProfilePhoto = (TLRPC.TL_messageActionSuggestProfilePhoto) message3.action;
                                MessagesController messagesController3 = MessagesController.getInstance(i16);
                                if (messageObject2.isOutOwner()) {
                                    dialogId2 = j10;
                                } else {
                                    dialogId2 = messageObject2.getDialogId();
                                }
                                user3 = messagesController3.getUser(Long.valueOf(dialogId2));
                                if (tL_messageActionSuggestProfilePhoto.video) {
                                    z11 = true;
                                } else {
                                    z11 = true;
                                }
                                if (user3.f22527id == UserConfig.getInstance(i16).clientUserId) {
                                    user4 = MessagesController.getInstance(i16).getUser(Long.valueOf(messageObject2.getDialogId()));
                                    if (z11) {
                                        string2 = LocaleController.formatString(R.string.ActionSuggestVideoFromYouDescription, user4.first_name);
                                    } else {
                                        string2 = LocaleController.formatString(R.string.ActionSuggestPhotoFromYouDescription, user4.first_name);
                                    }
                                } else if (z11) {
                                    string2 = LocaleController.formatString(R.string.ActionSuggestVideoToYouDescription, user3.first_name);
                                } else {
                                    string2 = LocaleController.formatString(R.string.ActionSuggestPhotoToYouDescription, user3.first_name);
                                }
                                CharSequence charSequence8 = string2;
                                if (tL_messageActionSuggestProfilePhoto.video) {
                                    string3 = LocaleController.getString(R.string.ViewVideoAction);
                                } else {
                                    string3 = LocaleController.getString(R.string.ViewVideoAction);
                                }
                                w(null, null, charSequence8, false, string3, 11, null, this.W0, true);
                                this.I = null;
                                this.K = 0;
                                this.L = null;
                                this.M = 0;
                                this.O = 0;
                            } else if (i10 == 22) {
                                MessagesController messagesController4 = MessagesController.getInstance(i16);
                                if (messageObject2.isOutOwner()) {
                                    dialogId = j10;
                                } else {
                                    dialogId = messageObject2.getDialogId();
                                }
                                user2 = messagesController4.getUser(Long.valueOf(dialogId));
                                if (messageObject2.getDialogId() < j10) {
                                    charSequence3 = messageObject2.messageText;
                                } else {
                                    if (messageObject2.isOutOwner()) {
                                    }
                                    if (user2 == null) {
                                    }
                                    charSequence2 = messageObject2.messageText;
                                    string = LocaleController.getString(R.string.ViewWallpaperAction);
                                    z10 = true;
                                    w(null, null, charSequence2, false, string, 11, null, this.W0, z10);
                                    this.I = null;
                                    this.K = 0;
                                    this.L = null;
                                    this.M = 0;
                                    this.O = 0;
                                }
                                charSequence2 = charSequence3;
                                string = null;
                                z10 = true;
                                w(null, null, charSequence2, false, string, 11, null, this.W0, z10);
                                this.I = null;
                                this.K = 0;
                                this.L = null;
                                this.M = 0;
                                this.O = 0;
                            } else if (messageObject2.isStoryMention()) {
                                user = MessagesController.getInstance(i16).getUser(Long.valueOf(messageObject2.messageOwner.media.user_id));
                                if (user.self) {
                                    charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoryYouMentionedTitle, MessagesController.getInstance(i16).getUser(Long.valueOf(messageObject2.getDialogId())).first_name));
                                } else {
                                    charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoryMentionedTitle, user.first_name));
                                }
                                w(null, null, charSequenceReplaceTags, false, LocaleController.getString(R.string.StoryMentionedAction), 11, null, this.W0, true);
                                this.I = null;
                                this.K = 0;
                                this.L = null;
                                this.M = 0;
                                this.O = 0;
                            }
                        }
                    }
                }
            } else {
                charSequence = charSequenceReplaceCharSequence;
                if (message3 != null) {
                    messageAction3 = message3.action;
                    if (messageAction3 instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
                        i10 = messageObject2.type;
                        if (i10 == 11) {
                            float f14 = (this.R - AndroidUtilities.roundMessageSize) / 2.0f;
                            float fDp3 = AndroidUtilities.dp(19.0f) + this.K;
                            float f15 = AndroidUtilities.roundMessageSize;
                            this.E.setImageCoords(f14, fDp3, f15, f15);
                        } else if (i10 == 25) {
                            v();
                        } else {
                            TextPaint textPaint3 = this.f25773t1;
                            if (i10 == 30) {
                                user5 = MessagesController.getInstance(i16).getUser(Long.valueOf(this.D0.getDialogId()));
                                messageAction2 = messageObject2.messageOwner.action;
                                if (messageAction2 instanceof TLRPC.TL_messageActionGiftStars) {
                                    CharSequence pluralStringComma3 = LocaleController.formatPluralStringComma("ActionGiftStarsTitle", (int) ((TLRPC.TL_messageActionGiftStars) messageAction2).stars);
                                    if (this.D0.isOutOwner()) {
                                        string9 = LocaleController.formatString(R.string.ActionGiftStarsSubtitle, UserObject.getForcedFirstName(user5));
                                    } else {
                                        string9 = LocaleController.getString(R.string.ActionGiftStarsSubtitleYou);
                                    }
                                    w(pluralStringComma3, null, AndroidUtilities.replaceTags(string9), false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.W0, true);
                                } else if (!(messageAction2 instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                                    if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                                        tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction2;
                                        j11 = tL_messageActionStarGift.convert_stars;
                                        clientUserId = UserConfig.getInstance(i16).getClientUserId();
                                        peer = tL_messageActionStarGift.peer;
                                        if (peer != null) {
                                            z13 = false;
                                        } else {
                                            z13 = false;
                                        }
                                        if (messageObject2.getDialogId() == clientUserId) {
                                            z14 = false;
                                        } else {
                                            z14 = false;
                                        }
                                        fromChatId2 = messageObject2.getFromChatId();
                                        if (!tL_messageActionStarGift.prepaid_upgrade) {
                                            fromChatId2 = DialogObject.getPeerDialogId(peer2);
                                        }
                                        spannableStringBuilder3 = new SpannableStringBuilder();
                                        userOrChat = MessagesController.getInstance(i16).getUserOrChat(fromChatId2);
                                        peerDialogId2 = DialogObject.getPeerDialogId(tL_messageActionStarGift.to_id);
                                        z15 = z13;
                                        TLObject userOrChat5 = MessagesController.getInstance(i16).getUserOrChat(peerDialogId2);
                                        if (tL_messageActionStarGift.can_upgrade) {
                                            z16 = false;
                                        } else {
                                            z16 = false;
                                        }
                                        if (peerDialogId2 == j10) {
                                            if (!z14) {
                                                if (tL_messageActionStarGift.prepaid_upgrade) {
                                                    i12 = R.string.Gift2ActionUpgradeTitle;
                                                } else {
                                                    i12 = R.string.Gift2ActionTitle;
                                                }
                                                spannableStringBuilder3.append((CharSequence) LocaleController.getString(i12)).append((CharSequence) " ");
                                                if (DialogObject.hasPhoto(userOrChat)) {
                                                    spannableStringBuilder3.append((CharSequence) "a ");
                                                    org.telegram.ui.g5 g5Var8 = new org.telegram.ui.g5(this, 18.0f, i16);
                                                    int i29 = g5Var8.f38318e;
                                                    org.telegram.ui.Components.y8 y8Var7 = g5Var8.f38317c;
                                                    y8Var7.j(i29, userOrChat);
                                                    g5Var8.f38316b.setForUserOrChat(userOrChat, y8Var7);
                                                    spannableStringBuilder3.setSpan(g5Var8, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                                                }
                                                spannableStringBuilder3.append((CharSequence) DialogObject.getShortName(userOrChat));
                                            } else if (tL_messageActionStarGift.gift_num > 0) {
                                                spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                            } else {
                                                spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                            }
                                        } else if (!z14) {
                                            if (tL_messageActionStarGift.prepaid_upgrade) {
                                                i12 = R.string.Gift2ActionUpgradeTitle;
                                            } else {
                                                i12 = R.string.Gift2ActionTitle;
                                            }
                                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(i12)).append((CharSequence) " ");
                                            if (DialogObject.hasPhoto(userOrChat)) {
                                                spannableStringBuilder3.append((CharSequence) "a ");
                                                org.telegram.ui.g5 g5Var9 = new org.telegram.ui.g5(this, 18.0f, i16);
                                                int i210 = g5Var9.f38318e;
                                                org.telegram.ui.Components.y8 y8Var8 = g5Var9.f38317c;
                                                y8Var8.j(i210, userOrChat);
                                                g5Var9.f38316b.setForUserOrChat(userOrChat, y8Var8);
                                                spannableStringBuilder3.setSpan(g5Var9, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                                            }
                                            spannableStringBuilder3.append((CharSequence) DialogObject.getShortName(userOrChat));
                                        } else if (tL_messageActionStarGift.gift_num > 0) {
                                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                        } else {
                                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                        }
                                        if (messageObject2.isOutOwner()) {
                                        }
                                        if (tL_messageActionStarGift.refunded) {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionConvertRefundedText);
                                        } else {
                                            tL_textWithEntities2 = tL_messageActionStarGift.message;
                                            if (tL_textWithEntities2 == null) {
                                                if (tL_messageActionStarGift.auction_acquired) {
                                                    charSequenceReplaceTags4 = LocaleController.formatString(R.string.Gift2ActionWonActionText, LocaleController.formatNumber(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                                                } else if (z15) {
                                                    if (tL_messageActionStarGift.converted) {
                                                        charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j11);
                                                    } else if (z17) {
                                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                                    } else {
                                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                                    }
                                                } else if (z14) {
                                                    if (!tL_messageActionStarGift.converted) {
                                                        if (tL_messageActionStarGift.can_upgrade) {
                                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade));
                                                        } else {
                                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert));
                                                        }
                                                    } else if (tL_messageActionStarGift.can_upgrade) {
                                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade));
                                                    } else {
                                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert));
                                                    }
                                                } else if (z16) {
                                                    if (messageObject2.isOutOwner()) {
                                                        string6 = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user5));
                                                    } else {
                                                        string6 = LocaleController.getString(R.string.Gift2ActionUpgrade);
                                                    }
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(string6);
                                                } else if (messageObject2.isOutOwner()) {
                                                    if (!z17) {
                                                        if (tL_messageActionStarGift.can_upgrade) {
                                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                                        } else {
                                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                                        }
                                                    } else if (tL_messageActionStarGift.can_upgrade) {
                                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                                    } else {
                                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                                    }
                                                } else if (tL_messageActionStarGift.converted) {
                                                    charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j11);
                                                } else if (tL_messageActionStarGift.saved) {
                                                    if (z17) {
                                                        charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                                    } else {
                                                        charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                                    }
                                                } else if (z17) {
                                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j11));
                                                }
                                            } else if (tL_messageActionStarGift.auction_acquired) {
                                                charSequenceReplaceTags4 = LocaleController.formatString(R.string.Gift2ActionWonActionText, LocaleController.formatNumber(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                                            } else if (z15) {
                                                if (tL_messageActionStarGift.converted) {
                                                    charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j11);
                                                } else if (z17) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                                }
                                            } else if (z14) {
                                                if (!tL_messageActionStarGift.converted) {
                                                    if (tL_messageActionStarGift.can_upgrade) {
                                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade));
                                                    } else {
                                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert));
                                                    }
                                                } else if (tL_messageActionStarGift.can_upgrade) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert));
                                                }
                                            } else if (z16) {
                                                if (messageObject2.isOutOwner()) {
                                                    string6 = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user5));
                                                } else {
                                                    string6 = LocaleController.getString(R.string.Gift2ActionUpgrade);
                                                }
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(string6);
                                            } else if (messageObject2.isOutOwner()) {
                                                if (!z17) {
                                                    if (tL_messageActionStarGift.can_upgrade) {
                                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                                    } else {
                                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                                    }
                                                } else if (tL_messageActionStarGift.can_upgrade) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                                }
                                            } else if (tL_messageActionStarGift.converted) {
                                                charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j11);
                                            } else if (tL_messageActionStarGift.saved) {
                                                if (z17) {
                                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                                } else {
                                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                                }
                                            } else if (z17) {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j11));
                                            }
                                        }
                                        starGift2 = tL_messageActionStarGift.gift;
                                        if (starGift2 == null) {
                                            string7 = null;
                                        } else {
                                            string7 = null;
                                        }
                                        string8 = LocaleController.getString(R.string.ActionGiftStarsView);
                                        if (messageObject2.isOutOwner()) {
                                            charSequence4 = string8;
                                            charSequence4 = string8;
                                            charSequence4 = string8;
                                            if (!messageObject2.isOutOwner()) {
                                                SpannableStringBuilder spannableStringBuilder17 = new SpannableStringBuilder();
                                                spannableStringBuilder17.append((CharSequence) "^  ");
                                                cq cqVar6 = new cq(R.drawable.gift_unpack, 0);
                                                cqVar6.setScale(0.8f, 0.8f);
                                                spannableStringBuilder17.setSpan(cqVar6, 0, 1, 33);
                                                spannableStringBuilder17.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                                charSequence4 = spannableStringBuilder17;
                                            }
                                        } else {
                                            charSequence4 = string8;
                                            charSequence4 = string8;
                                            charSequence4 = string8;
                                            if (!messageObject2.isOutOwner()) {
                                                SpannableStringBuilder spannableStringBuilder18 = new SpannableStringBuilder();
                                                spannableStringBuilder18.append((CharSequence) "^  ");
                                                cq cqVar7 = new cq(R.drawable.gift_unpack, 0);
                                                cqVar7.setScale(0.8f, 0.8f);
                                                spannableStringBuilder18.setSpan(cqVar7, 0, 1, 33);
                                                spannableStringBuilder18.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                                charSequence4 = spannableStringBuilder18;
                                            }
                                        }
                                        starGift3 = tL_messageActionStarGift.gift;
                                        if (starGift3 != null) {
                                            spannableStringBuilder4 = null;
                                        } else {
                                            spannableStringBuilder4 = null;
                                        }
                                        w(spannableStringBuilder3, spannableStringBuilder4, charSequenceReplaceTags4, false, charSequence4, 11, string7, this.W0, true);
                                    } else if (messageAction2 instanceof TLRPC.TL_messageActionGiftTon) {
                                        w(LocaleController.getString(R.string.ActionGiftTonTitle), null, this.D0.messageText, false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.W0, true);
                                        this.I = null;
                                        this.K = 0;
                                        this.L = null;
                                        this.M = 0;
                                        this.O = 0;
                                    } else {
                                        w(LocaleController.getString(R.string.ActionStarGiveawayPrizeTitle), null, this.D0.messageText, false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.W0, true);
                                        this.I = null;
                                        this.K = 0;
                                        this.L = null;
                                        this.M = 0;
                                        this.O = 0;
                                    }
                                } else if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                                    tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction2;
                                    j11 = tL_messageActionStarGift.convert_stars;
                                    clientUserId = UserConfig.getInstance(i16).getClientUserId();
                                    peer = tL_messageActionStarGift.peer;
                                    if (peer != null) {
                                        z13 = false;
                                    } else {
                                        z13 = false;
                                    }
                                    if (messageObject2.getDialogId() == clientUserId) {
                                        z14 = false;
                                    } else {
                                        z14 = false;
                                    }
                                    fromChatId2 = messageObject2.getFromChatId();
                                    if (!tL_messageActionStarGift.prepaid_upgrade) {
                                        fromChatId2 = DialogObject.getPeerDialogId(peer2);
                                    }
                                    spannableStringBuilder3 = new SpannableStringBuilder();
                                    userOrChat = MessagesController.getInstance(i16).getUserOrChat(fromChatId2);
                                    peerDialogId2 = DialogObject.getPeerDialogId(tL_messageActionStarGift.to_id);
                                    z15 = z13;
                                    TLObject userOrChat6 = MessagesController.getInstance(i16).getUserOrChat(peerDialogId2);
                                    if (tL_messageActionStarGift.can_upgrade) {
                                        z16 = false;
                                    } else {
                                        z16 = false;
                                    }
                                    if (peerDialogId2 == j10) {
                                        if (!z14) {
                                            if (tL_messageActionStarGift.prepaid_upgrade) {
                                                i12 = R.string.Gift2ActionUpgradeTitle;
                                            } else {
                                                i12 = R.string.Gift2ActionTitle;
                                            }
                                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(i12)).append((CharSequence) " ");
                                            if (DialogObject.hasPhoto(userOrChat)) {
                                                spannableStringBuilder3.append((CharSequence) "a ");
                                                org.telegram.ui.g5 g5Var10 = new org.telegram.ui.g5(this, 18.0f, i16);
                                                int i211 = g5Var10.f38318e;
                                                org.telegram.ui.Components.y8 y8Var9 = g5Var10.f38317c;
                                                y8Var9.j(i211, userOrChat);
                                                g5Var10.f38316b.setForUserOrChat(userOrChat, y8Var9);
                                                spannableStringBuilder3.setSpan(g5Var10, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                                            }
                                            spannableStringBuilder3.append((CharSequence) DialogObject.getShortName(userOrChat));
                                        } else if (tL_messageActionStarGift.gift_num > 0) {
                                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                        } else {
                                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                        }
                                    } else if (!z14) {
                                        if (tL_messageActionStarGift.prepaid_upgrade) {
                                            i12 = R.string.Gift2ActionUpgradeTitle;
                                        } else {
                                            i12 = R.string.Gift2ActionTitle;
                                        }
                                        spannableStringBuilder3.append((CharSequence) LocaleController.getString(i12)).append((CharSequence) " ");
                                        if (DialogObject.hasPhoto(userOrChat)) {
                                            spannableStringBuilder3.append((CharSequence) "a ");
                                            org.telegram.ui.g5 g5Var11 = new org.telegram.ui.g5(this, 18.0f, i16);
                                            int i212 = g5Var11.f38318e;
                                            org.telegram.ui.Components.y8 y8Var10 = g5Var11.f38317c;
                                            y8Var10.j(i212, userOrChat);
                                            g5Var11.f38316b.setForUserOrChat(userOrChat, y8Var10);
                                            spannableStringBuilder3.setSpan(g5Var11, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                                        }
                                        spannableStringBuilder3.append((CharSequence) DialogObject.getShortName(userOrChat));
                                    } else if (tL_messageActionStarGift.gift_num > 0) {
                                        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                    } else {
                                        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                    }
                                    if (messageObject2.isOutOwner()) {
                                    }
                                    if (tL_messageActionStarGift.refunded) {
                                        charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionConvertRefundedText);
                                    } else {
                                        tL_textWithEntities2 = tL_messageActionStarGift.message;
                                        if (tL_textWithEntities2 == null) {
                                            if (tL_messageActionStarGift.auction_acquired) {
                                                charSequenceReplaceTags4 = LocaleController.formatString(R.string.Gift2ActionWonActionText, LocaleController.formatNumber(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                                            } else if (z15) {
                                                if (tL_messageActionStarGift.converted) {
                                                    charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j11);
                                                } else if (z17) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                                }
                                            } else if (z14) {
                                                if (!tL_messageActionStarGift.converted) {
                                                    if (tL_messageActionStarGift.can_upgrade) {
                                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade));
                                                    } else {
                                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert));
                                                    }
                                                } else if (tL_messageActionStarGift.can_upgrade) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert));
                                                }
                                            } else if (z16) {
                                                if (messageObject2.isOutOwner()) {
                                                    string6 = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user5));
                                                } else {
                                                    string6 = LocaleController.getString(R.string.Gift2ActionUpgrade);
                                                }
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(string6);
                                            } else if (messageObject2.isOutOwner()) {
                                                if (!z17) {
                                                    if (tL_messageActionStarGift.can_upgrade) {
                                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                                    } else {
                                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                                    }
                                                } else if (tL_messageActionStarGift.can_upgrade) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                                }
                                            } else if (tL_messageActionStarGift.converted) {
                                                charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j11);
                                            } else if (tL_messageActionStarGift.saved) {
                                                if (z17) {
                                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                                } else {
                                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                                }
                                            } else if (z17) {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j11));
                                            }
                                        } else if (tL_messageActionStarGift.auction_acquired) {
                                            charSequenceReplaceTags4 = LocaleController.formatString(R.string.Gift2ActionWonActionText, LocaleController.formatNumber(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                                        } else if (z15) {
                                            if (tL_messageActionStarGift.converted) {
                                                charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j11);
                                            } else if (z17) {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                            }
                                        } else if (z14) {
                                            if (!tL_messageActionStarGift.converted) {
                                                if (tL_messageActionStarGift.can_upgrade) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert));
                                                }
                                            } else if (tL_messageActionStarGift.can_upgrade) {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade));
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert));
                                            }
                                        } else if (z16) {
                                            if (messageObject2.isOutOwner()) {
                                                string6 = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user5));
                                            } else {
                                                string6 = LocaleController.getString(R.string.Gift2ActionUpgrade);
                                            }
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(string6);
                                        } else if (messageObject2.isOutOwner()) {
                                            if (!z17) {
                                                if (tL_messageActionStarGift.can_upgrade) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                                }
                                            } else if (tL_messageActionStarGift.can_upgrade) {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                            }
                                        } else if (tL_messageActionStarGift.converted) {
                                            charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j11);
                                        } else if (tL_messageActionStarGift.saved) {
                                            if (z17) {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                            } else {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                            }
                                        } else if (z17) {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                        } else {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j11));
                                        }
                                    }
                                    starGift2 = tL_messageActionStarGift.gift;
                                    if (starGift2 == null) {
                                        string7 = null;
                                    } else {
                                        string7 = null;
                                    }
                                    string8 = LocaleController.getString(R.string.ActionGiftStarsView);
                                    if (messageObject2.isOutOwner()) {
                                        charSequence4 = string8;
                                        charSequence4 = string8;
                                        charSequence4 = string8;
                                        if (!messageObject2.isOutOwner()) {
                                            SpannableStringBuilder spannableStringBuilder19 = new SpannableStringBuilder();
                                            spannableStringBuilder19.append((CharSequence) "^  ");
                                            cq cqVar8 = new cq(R.drawable.gift_unpack, 0);
                                            cqVar8.setScale(0.8f, 0.8f);
                                            spannableStringBuilder19.setSpan(cqVar8, 0, 1, 33);
                                            spannableStringBuilder19.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                            charSequence4 = spannableStringBuilder19;
                                        }
                                    } else {
                                        charSequence4 = string8;
                                        charSequence4 = string8;
                                        charSequence4 = string8;
                                        if (!messageObject2.isOutOwner()) {
                                            SpannableStringBuilder spannableStringBuilder110 = new SpannableStringBuilder();
                                            spannableStringBuilder110.append((CharSequence) "^  ");
                                            cq cqVar9 = new cq(R.drawable.gift_unpack, 0);
                                            cqVar9.setScale(0.8f, 0.8f);
                                            spannableStringBuilder110.setSpan(cqVar9, 0, 1, 33);
                                            spannableStringBuilder110.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                            charSequence4 = spannableStringBuilder110;
                                        }
                                    }
                                    starGift3 = tL_messageActionStarGift.gift;
                                    if (starGift3 != null) {
                                        spannableStringBuilder4 = null;
                                    } else {
                                        spannableStringBuilder4 = null;
                                    }
                                    w(spannableStringBuilder3, spannableStringBuilder4, charSequenceReplaceTags4, false, charSequence4, 11, string7, this.W0, true);
                                } else if (messageAction2 instanceof TLRPC.TL_messageActionGiftTon) {
                                    w(LocaleController.getString(R.string.ActionGiftTonTitle), null, this.D0.messageText, false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.W0, true);
                                    this.I = null;
                                    this.K = 0;
                                    this.L = null;
                                    this.M = 0;
                                    this.O = 0;
                                } else {
                                    w(LocaleController.getString(R.string.ActionStarGiveawayPrizeTitle), null, this.D0.messageText, false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.W0, true);
                                    this.I = null;
                                    this.K = 0;
                                    this.L = null;
                                    this.M = 0;
                                    this.O = 0;
                                }
                            } else if (i10 == 33) {
                                tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) message3.action;
                                spannableStringBuilder2 = new SpannableStringBuilder(charSequence);
                                spannableStringBuilder2.append((CharSequence) "\n\n");
                                if (tL_messageActionStarGiftPurchaseOffer.accepted) {
                                    spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftOfferStatusAccepted)));
                                } else if (tL_messageActionStarGiftPurchaseOffer.declined) {
                                    spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftOfferStatusRejected)));
                                } else {
                                    iMax = Math.max(0, tL_messageActionStarGiftPurchaseOffer.expires_at - ConnectionsManager.getInstance(i16).getCurrentTime());
                                    if (iMax == 0) {
                                        spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftOfferStatusExpired)));
                                    } else {
                                        shortDuration2 = LocaleController.formatShortDuration2(iMax);
                                        if (shortDuration2.endsWith(".")) {
                                            shortDuration2 = com.google.android.recaptcha.internal.a.n(shortDuration2, 1, 0);
                                        }
                                        spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferStatusPending, shortDuration2)));
                                    }
                                }
                                w(null, null, spannableStringBuilder2, false, null, 11, null, this.W0, false);
                                this.I = null;
                                this.K = 0;
                                this.L = null;
                                this.M = 0;
                                this.O = 0;
                            } else if (i10 == 34) {
                                w(null, null, charSequence, false, null, 11, null, this.W0, false);
                                this.I = null;
                                this.K = 0;
                                this.L = null;
                                this.M = 0;
                                this.O = 0;
                            } else if (i10 == 35) {
                                tL_messageActionNoForwardsRequest = (TLRPC.TL_messageActionNoForwardsRequest) message3.action;
                                spannableStringBuilder = new SpannableStringBuilder();
                                shortName = DialogObject.getShortName(MessagesController.getInstance(i16).getUser(Long.valueOf(messageObject2.getDialogId())));
                                if (tL_messageActionNoForwardsRequest.new_value) {
                                    if (messageObject2.isOut()) {
                                        charSequenceReplaceTags3 = LocaleController.getString(R.string.SharingOfferDisableHeaderYou);
                                    } else {
                                        charSequenceReplaceTags3 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SharingOfferDisableHeaderOther, shortName));
                                    }
                                    spannableStringBuilder.append(charSequenceReplaceTags3);
                                } else {
                                    if (messageObject2.isOut()) {
                                        charSequenceReplaceTags2 = LocaleController.getString(R.string.SharingOfferEnableHeaderYou);
                                    } else {
                                        charSequenceReplaceTags2 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SharingOfferEnableHeaderOther, shortName));
                                    }
                                    spannableStringBuilder.append(charSequenceReplaceTags2);
                                }
                                if (tL_messageActionNoForwardsRequest.new_value) {
                                    spannableStringBuilder.append((CharSequence) "\n\n");
                                    spannableStringBuilder.append((CharSequence) y(R.drawable.floating_check, LocaleController.getString(R.string.SharingOfferDisable1)));
                                    spannableStringBuilder.append((CharSequence) "\n\n");
                                    spannableStringBuilder.append((CharSequence) y(R.drawable.floating_check, LocaleController.getString(R.string.SharingOfferDisable2)));
                                    spannableStringBuilder.append((CharSequence) "\n\n");
                                    spannableStringBuilder.append((CharSequence) y(R.drawable.floating_check, LocaleController.getString(R.string.SharingOfferDisable3)));
                                    spannableStringBuilder.append((CharSequence) "\n\n");
                                    spannableStringBuilder.append((CharSequence) y(R.drawable.floating_check, LocaleController.getString(R.string.SharingOfferDisable4)));
                                } else {
                                    spannableStringBuilder.append((CharSequence) "\n\n");
                                    spannableStringBuilder.append((CharSequence) y(R.drawable.floating_check, LocaleController.getString(R.string.SharingOfferEnable1)));
                                    spannableStringBuilder.append((CharSequence) "\n\n");
                                    spannableStringBuilder.append((CharSequence) y(R.drawable.floating_check, LocaleController.getString(R.string.SharingOfferEnable2)));
                                    spannableStringBuilder.append((CharSequence) "\n\n");
                                    spannableStringBuilder.append((CharSequence) y(R.drawable.floating_check, LocaleController.getString(R.string.SharingOfferEnable3)));
                                    spannableStringBuilder.append((CharSequence) "\n\n");
                                    spannableStringBuilder.append((CharSequence) y(R.drawable.floating_check, LocaleController.getString(R.string.SharingOfferEnable4)));
                                }
                                w(null, null, spannableStringBuilder, false, null, 11, null, this.W0, false);
                                this.I = null;
                                this.K = 0;
                                this.L = null;
                                this.M = 0;
                                this.O = 0;
                            } else if (i10 == 31) {
                                TL_stars.StarGift starGift6 = ((TLRPC.TL_chatThemeUniqueGift) ((TLRPC.TL_messageActionSetChatTheme) message3.action).theme).gift;
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(starGift6.title);
                                sb4.append(" #");
                                strM = i0.a.m(starGift6.num, ',', sb4);
                                fromChatId = messageObject2.getFromChatId();
                                if (UserConfig.getInstance(i16).getClientUserId() == fromChatId) {
                                    string5 = LocaleController.formatString(R.string.GiftThemesSetByYou, strM);
                                } else {
                                    string5 = LocaleController.formatString(R.string.GiftThemesSetByOther, DialogObject.getShortName(i16, fromChatId), strM);
                                }
                                w(null, null, AndroidUtilities.replaceTags(string5), false, LocaleController.getString(R.string.GiftThemesSetActionView), 11, null, this.W0, true);
                                this.I = null;
                                this.K = 0;
                                this.L = null;
                                this.M = 0;
                                this.O = 0;
                            } else if (i10 == 37) {
                                TLRPC.TL_messageActionChangeCommunity tL_messageActionChangeCommunity3 = (TLRPC.TL_messageActionChangeCommunity) message3.action;
                                peerDialogId = DialogObject.getPeerDialogId(message3.peer_id);
                                boolean zIsChannelAndNotMegaGroup3 = ChatObject.isChannelAndNotMegaGroup(-peerDialogId, i16);
                                if (peerDialogId > j10) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                String shortName6 = DialogObject.getShortName(i16, DialogObject.getPeerDialogId(messageObject2.messageOwner.from_id));
                                String shortName7 = DialogObject.getShortName(i16, -tL_messageActionChangeCommunity3.community_id);
                                SpannableStringBuilder spannableStringBuilder111 = new SpannableStringBuilder();
                                spannableStringBuilder111.append((CharSequence) oh.r0.a(messageObject2, shortName7, shortName6, zIsChannelAndNotMegaGroup3, z12));
                                w(null, null, spannableStringBuilder111, false, LocaleController.getString(R.string.GiftThemesSetActionView), 11, null, this.W0, true);
                                this.I = null;
                                this.K = 0;
                                this.L = null;
                                this.M = 0;
                                this.O = 0;
                            } else if (i10 == 18) {
                                messageAction = message3.action;
                                if (messageAction instanceof TLRPC.TL_messageActionGiftPremium) {
                                    tL_textWithEntities = ((TLRPC.TL_messageActionGiftPremium) messageAction).message;
                                } else if (messageAction instanceof TLRPC.TL_messageActionGiftCode) {
                                    tL_textWithEntities = ((TLRPC.TL_messageActionGiftCode) messageAction).message;
                                } else {
                                    tL_textWithEntities = null;
                                }
                                if (tL_textWithEntities != null) {
                                    string4 = null;
                                } else {
                                    string4 = null;
                                }
                                if (string4 == null) {
                                    string4 = LocaleController.getString(R.string.ActionGiftPremiumText);
                                }
                                CharSequence charSequence9 = string4;
                                messageObject = this.D0;
                                if (messageObject == null) {
                                    i11 = R.string.ActionGiftPremiumView;
                                } else {
                                    i11 = R.string.ActionGiftPremiumView;
                                }
                                w(LocaleController.formatPluralStringComma("ActionGiftPremiumTitle2", messageObject2.messageOwner.action.months), null, charSequence9, true, LocaleController.getString(i11), 11, null, this.W0, false);
                            } else if (i10 == 21) {
                                tL_messageActionSuggestProfilePhoto = (TLRPC.TL_messageActionSuggestProfilePhoto) message3.action;
                                MessagesController messagesController5 = MessagesController.getInstance(i16);
                                if (messageObject2.isOutOwner()) {
                                    dialogId2 = j10;
                                } else {
                                    dialogId2 = messageObject2.getDialogId();
                                }
                                user3 = messagesController5.getUser(Long.valueOf(dialogId2));
                                if (tL_messageActionSuggestProfilePhoto.video) {
                                    z11 = true;
                                } else {
                                    z11 = true;
                                }
                                if (user3.f22527id == UserConfig.getInstance(i16).clientUserId) {
                                    user4 = MessagesController.getInstance(i16).getUser(Long.valueOf(messageObject2.getDialogId()));
                                    if (z11) {
                                        string2 = LocaleController.formatString(R.string.ActionSuggestVideoFromYouDescription, user4.first_name);
                                    } else {
                                        string2 = LocaleController.formatString(R.string.ActionSuggestPhotoFromYouDescription, user4.first_name);
                                    }
                                } else if (z11) {
                                    string2 = LocaleController.formatString(R.string.ActionSuggestVideoToYouDescription, user3.first_name);
                                } else {
                                    string2 = LocaleController.formatString(R.string.ActionSuggestPhotoToYouDescription, user3.first_name);
                                }
                                CharSequence charSequence10 = string2;
                                if (tL_messageActionSuggestProfilePhoto.video) {
                                    string3 = LocaleController.getString(R.string.ViewVideoAction);
                                } else {
                                    string3 = LocaleController.getString(R.string.ViewVideoAction);
                                }
                                w(null, null, charSequence10, false, string3, 11, null, this.W0, true);
                                this.I = null;
                                this.K = 0;
                                this.L = null;
                                this.M = 0;
                                this.O = 0;
                            } else if (i10 == 22) {
                                MessagesController messagesController6 = MessagesController.getInstance(i16);
                                if (messageObject2.isOutOwner()) {
                                    dialogId = j10;
                                } else {
                                    dialogId = messageObject2.getDialogId();
                                }
                                user2 = messagesController6.getUser(Long.valueOf(dialogId));
                                if (messageObject2.getDialogId() < j10) {
                                    charSequence3 = messageObject2.messageText;
                                } else {
                                    if (messageObject2.isOutOwner()) {
                                    }
                                    if (user2 == null) {
                                    }
                                    charSequence2 = messageObject2.messageText;
                                    string = LocaleController.getString(R.string.ViewWallpaperAction);
                                    z10 = true;
                                    w(null, null, charSequence2, false, string, 11, null, this.W0, z10);
                                    this.I = null;
                                    this.K = 0;
                                    this.L = null;
                                    this.M = 0;
                                    this.O = 0;
                                }
                                charSequence2 = charSequence3;
                                string = null;
                                z10 = true;
                                w(null, null, charSequence2, false, string, 11, null, this.W0, z10);
                                this.I = null;
                                this.K = 0;
                                this.L = null;
                                this.M = 0;
                                this.O = 0;
                            } else if (messageObject2.isStoryMention()) {
                                user = MessagesController.getInstance(i16).getUser(Long.valueOf(messageObject2.messageOwner.media.user_id));
                                if (user.self) {
                                    charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoryYouMentionedTitle, MessagesController.getInstance(i16).getUser(Long.valueOf(messageObject2.getDialogId())).first_name));
                                } else {
                                    charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoryMentionedTitle, user.first_name));
                                }
                                w(null, null, charSequenceReplaceTags, false, LocaleController.getString(R.string.StoryMentionedAction), 11, null, this.W0, true);
                                this.I = null;
                                this.K = 0;
                                this.L = null;
                                this.M = 0;
                                this.O = 0;
                            }
                        }
                    } else {
                        i10 = messageObject2.type;
                        if (i10 == 11) {
                            float f16 = (this.R - AndroidUtilities.roundMessageSize) / 2.0f;
                            float fDp4 = AndroidUtilities.dp(19.0f) + this.K;
                            float f17 = AndroidUtilities.roundMessageSize;
                            this.E.setImageCoords(f16, fDp4, f17, f17);
                        } else if (i10 == 25) {
                            v();
                        } else {
                            TextPaint textPaint4 = this.f25773t1;
                            if (i10 == 30) {
                                user5 = MessagesController.getInstance(i16).getUser(Long.valueOf(this.D0.getDialogId()));
                                messageAction2 = messageObject2.messageOwner.action;
                                if (messageAction2 instanceof TLRPC.TL_messageActionGiftStars) {
                                    CharSequence pluralStringComma4 = LocaleController.formatPluralStringComma("ActionGiftStarsTitle", (int) ((TLRPC.TL_messageActionGiftStars) messageAction2).stars);
                                    if (this.D0.isOutOwner()) {
                                        string9 = LocaleController.formatString(R.string.ActionGiftStarsSubtitle, UserObject.getForcedFirstName(user5));
                                    } else {
                                        string9 = LocaleController.getString(R.string.ActionGiftStarsSubtitleYou);
                                    }
                                    w(pluralStringComma4, null, AndroidUtilities.replaceTags(string9), false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.W0, true);
                                } else if (!(messageAction2 instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                                    if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                                        tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction2;
                                        j11 = tL_messageActionStarGift.convert_stars;
                                        clientUserId = UserConfig.getInstance(i16).getClientUserId();
                                        peer = tL_messageActionStarGift.peer;
                                        if (peer != null) {
                                            z13 = false;
                                        } else {
                                            z13 = false;
                                        }
                                        if (messageObject2.getDialogId() == clientUserId) {
                                            z14 = false;
                                        } else {
                                            z14 = false;
                                        }
                                        fromChatId2 = messageObject2.getFromChatId();
                                        if (!tL_messageActionStarGift.prepaid_upgrade) {
                                            fromChatId2 = DialogObject.getPeerDialogId(peer2);
                                        }
                                        spannableStringBuilder3 = new SpannableStringBuilder();
                                        userOrChat = MessagesController.getInstance(i16).getUserOrChat(fromChatId2);
                                        peerDialogId2 = DialogObject.getPeerDialogId(tL_messageActionStarGift.to_id);
                                        z15 = z13;
                                        TLObject userOrChat7 = MessagesController.getInstance(i16).getUserOrChat(peerDialogId2);
                                        if (tL_messageActionStarGift.can_upgrade) {
                                            z16 = false;
                                        } else {
                                            z16 = false;
                                        }
                                        if (peerDialogId2 == j10) {
                                            if (!z14) {
                                                if (tL_messageActionStarGift.prepaid_upgrade) {
                                                    i12 = R.string.Gift2ActionUpgradeTitle;
                                                } else {
                                                    i12 = R.string.Gift2ActionTitle;
                                                }
                                                spannableStringBuilder3.append((CharSequence) LocaleController.getString(i12)).append((CharSequence) " ");
                                                if (DialogObject.hasPhoto(userOrChat)) {
                                                    spannableStringBuilder3.append((CharSequence) "a ");
                                                    org.telegram.ui.g5 g5Var12 = new org.telegram.ui.g5(this, 18.0f, i16);
                                                    int i213 = g5Var12.f38318e;
                                                    org.telegram.ui.Components.y8 y8Var11 = g5Var12.f38317c;
                                                    y8Var11.j(i213, userOrChat);
                                                    g5Var12.f38316b.setForUserOrChat(userOrChat, y8Var11);
                                                    spannableStringBuilder3.setSpan(g5Var12, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                                                }
                                                spannableStringBuilder3.append((CharSequence) DialogObject.getShortName(userOrChat));
                                            } else if (tL_messageActionStarGift.gift_num > 0) {
                                                spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                            } else {
                                                spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                            }
                                        } else if (!z14) {
                                            if (tL_messageActionStarGift.prepaid_upgrade) {
                                                i12 = R.string.Gift2ActionUpgradeTitle;
                                            } else {
                                                i12 = R.string.Gift2ActionTitle;
                                            }
                                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(i12)).append((CharSequence) " ");
                                            if (DialogObject.hasPhoto(userOrChat)) {
                                                spannableStringBuilder3.append((CharSequence) "a ");
                                                org.telegram.ui.g5 g5Var13 = new org.telegram.ui.g5(this, 18.0f, i16);
                                                int i214 = g5Var13.f38318e;
                                                org.telegram.ui.Components.y8 y8Var12 = g5Var13.f38317c;
                                                y8Var12.j(i214, userOrChat);
                                                g5Var13.f38316b.setForUserOrChat(userOrChat, y8Var12);
                                                spannableStringBuilder3.setSpan(g5Var13, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                                            }
                                            spannableStringBuilder3.append((CharSequence) DialogObject.getShortName(userOrChat));
                                        } else if (tL_messageActionStarGift.gift_num > 0) {
                                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                        } else {
                                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                        }
                                        if (messageObject2.isOutOwner()) {
                                        }
                                        if (tL_messageActionStarGift.refunded) {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionConvertRefundedText);
                                        } else {
                                            tL_textWithEntities2 = tL_messageActionStarGift.message;
                                            if (tL_textWithEntities2 == null) {
                                                if (tL_messageActionStarGift.auction_acquired) {
                                                    charSequenceReplaceTags4 = LocaleController.formatString(R.string.Gift2ActionWonActionText, LocaleController.formatNumber(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                                                } else if (z15) {
                                                    if (tL_messageActionStarGift.converted) {
                                                        charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j11);
                                                    } else if (z17) {
                                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                                    } else {
                                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                                    }
                                                } else if (z14) {
                                                    if (!tL_messageActionStarGift.converted) {
                                                        if (tL_messageActionStarGift.can_upgrade) {
                                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade));
                                                        } else {
                                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert));
                                                        }
                                                    } else if (tL_messageActionStarGift.can_upgrade) {
                                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade));
                                                    } else {
                                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert));
                                                    }
                                                } else if (z16) {
                                                    if (messageObject2.isOutOwner()) {
                                                        string6 = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user5));
                                                    } else {
                                                        string6 = LocaleController.getString(R.string.Gift2ActionUpgrade);
                                                    }
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(string6);
                                                } else if (messageObject2.isOutOwner()) {
                                                    if (!z17) {
                                                        if (tL_messageActionStarGift.can_upgrade) {
                                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                                        } else {
                                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                                        }
                                                    } else if (tL_messageActionStarGift.can_upgrade) {
                                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                                    } else {
                                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                                    }
                                                } else if (tL_messageActionStarGift.converted) {
                                                    charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j11);
                                                } else if (tL_messageActionStarGift.saved) {
                                                    if (z17) {
                                                        charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                                    } else {
                                                        charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                                    }
                                                } else if (z17) {
                                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j11));
                                                }
                                            } else if (tL_messageActionStarGift.auction_acquired) {
                                                charSequenceReplaceTags4 = LocaleController.formatString(R.string.Gift2ActionWonActionText, LocaleController.formatNumber(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                                            } else if (z15) {
                                                if (tL_messageActionStarGift.converted) {
                                                    charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j11);
                                                } else if (z17) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                                }
                                            } else if (z14) {
                                                if (!tL_messageActionStarGift.converted) {
                                                    if (tL_messageActionStarGift.can_upgrade) {
                                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade));
                                                    } else {
                                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert));
                                                    }
                                                } else if (tL_messageActionStarGift.can_upgrade) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert));
                                                }
                                            } else if (z16) {
                                                if (messageObject2.isOutOwner()) {
                                                    string6 = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user5));
                                                } else {
                                                    string6 = LocaleController.getString(R.string.Gift2ActionUpgrade);
                                                }
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(string6);
                                            } else if (messageObject2.isOutOwner()) {
                                                if (!z17) {
                                                    if (tL_messageActionStarGift.can_upgrade) {
                                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                                    } else {
                                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                                    }
                                                } else if (tL_messageActionStarGift.can_upgrade) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                                }
                                            } else if (tL_messageActionStarGift.converted) {
                                                charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j11);
                                            } else if (tL_messageActionStarGift.saved) {
                                                if (z17) {
                                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                                } else {
                                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                                }
                                            } else if (z17) {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j11));
                                            }
                                        }
                                        starGift2 = tL_messageActionStarGift.gift;
                                        if (starGift2 == null) {
                                            string7 = null;
                                        } else {
                                            string7 = null;
                                        }
                                        string8 = LocaleController.getString(R.string.ActionGiftStarsView);
                                        if (messageObject2.isOutOwner()) {
                                            charSequence4 = string8;
                                            charSequence4 = string8;
                                            charSequence4 = string8;
                                            if (!messageObject2.isOutOwner()) {
                                                SpannableStringBuilder spannableStringBuilder112 = new SpannableStringBuilder();
                                                spannableStringBuilder112.append((CharSequence) "^  ");
                                                cq cqVar10 = new cq(R.drawable.gift_unpack, 0);
                                                cqVar10.setScale(0.8f, 0.8f);
                                                spannableStringBuilder112.setSpan(cqVar10, 0, 1, 33);
                                                spannableStringBuilder112.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                                charSequence4 = spannableStringBuilder112;
                                            }
                                        } else {
                                            charSequence4 = string8;
                                            charSequence4 = string8;
                                            charSequence4 = string8;
                                            if (!messageObject2.isOutOwner()) {
                                                SpannableStringBuilder spannableStringBuilder113 = new SpannableStringBuilder();
                                                spannableStringBuilder113.append((CharSequence) "^  ");
                                                cq cqVar11 = new cq(R.drawable.gift_unpack, 0);
                                                cqVar11.setScale(0.8f, 0.8f);
                                                spannableStringBuilder113.setSpan(cqVar11, 0, 1, 33);
                                                spannableStringBuilder113.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                                charSequence4 = spannableStringBuilder113;
                                            }
                                        }
                                        starGift3 = tL_messageActionStarGift.gift;
                                        if (starGift3 != null) {
                                            spannableStringBuilder4 = null;
                                        } else {
                                            spannableStringBuilder4 = null;
                                        }
                                        w(spannableStringBuilder3, spannableStringBuilder4, charSequenceReplaceTags4, false, charSequence4, 11, string7, this.W0, true);
                                    } else if (messageAction2 instanceof TLRPC.TL_messageActionGiftTon) {
                                        w(LocaleController.getString(R.string.ActionGiftTonTitle), null, this.D0.messageText, false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.W0, true);
                                        this.I = null;
                                        this.K = 0;
                                        this.L = null;
                                        this.M = 0;
                                        this.O = 0;
                                    } else {
                                        w(LocaleController.getString(R.string.ActionStarGiveawayPrizeTitle), null, this.D0.messageText, false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.W0, true);
                                        this.I = null;
                                        this.K = 0;
                                        this.L = null;
                                        this.M = 0;
                                        this.O = 0;
                                    }
                                } else if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                                    tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction2;
                                    j11 = tL_messageActionStarGift.convert_stars;
                                    clientUserId = UserConfig.getInstance(i16).getClientUserId();
                                    peer = tL_messageActionStarGift.peer;
                                    if (peer != null) {
                                        z13 = false;
                                    } else {
                                        z13 = false;
                                    }
                                    if (messageObject2.getDialogId() == clientUserId) {
                                        z14 = false;
                                    } else {
                                        z14 = false;
                                    }
                                    fromChatId2 = messageObject2.getFromChatId();
                                    if (!tL_messageActionStarGift.prepaid_upgrade) {
                                        fromChatId2 = DialogObject.getPeerDialogId(peer2);
                                    }
                                    spannableStringBuilder3 = new SpannableStringBuilder();
                                    userOrChat = MessagesController.getInstance(i16).getUserOrChat(fromChatId2);
                                    peerDialogId2 = DialogObject.getPeerDialogId(tL_messageActionStarGift.to_id);
                                    z15 = z13;
                                    TLObject userOrChat8 = MessagesController.getInstance(i16).getUserOrChat(peerDialogId2);
                                    if (tL_messageActionStarGift.can_upgrade) {
                                        z16 = false;
                                    } else {
                                        z16 = false;
                                    }
                                    if (peerDialogId2 == j10) {
                                        if (!z14) {
                                            if (tL_messageActionStarGift.prepaid_upgrade) {
                                                i12 = R.string.Gift2ActionUpgradeTitle;
                                            } else {
                                                i12 = R.string.Gift2ActionTitle;
                                            }
                                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(i12)).append((CharSequence) " ");
                                            if (DialogObject.hasPhoto(userOrChat)) {
                                                spannableStringBuilder3.append((CharSequence) "a ");
                                                org.telegram.ui.g5 g5Var14 = new org.telegram.ui.g5(this, 18.0f, i16);
                                                int i215 = g5Var14.f38318e;
                                                org.telegram.ui.Components.y8 y8Var13 = g5Var14.f38317c;
                                                y8Var13.j(i215, userOrChat);
                                                g5Var14.f38316b.setForUserOrChat(userOrChat, y8Var13);
                                                spannableStringBuilder3.setSpan(g5Var14, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                                            }
                                            spannableStringBuilder3.append((CharSequence) DialogObject.getShortName(userOrChat));
                                        } else if (tL_messageActionStarGift.gift_num > 0) {
                                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                        } else {
                                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                        }
                                    } else if (!z14) {
                                        if (tL_messageActionStarGift.prepaid_upgrade) {
                                            i12 = R.string.Gift2ActionUpgradeTitle;
                                        } else {
                                            i12 = R.string.Gift2ActionTitle;
                                        }
                                        spannableStringBuilder3.append((CharSequence) LocaleController.getString(i12)).append((CharSequence) " ");
                                        if (DialogObject.hasPhoto(userOrChat)) {
                                            spannableStringBuilder3.append((CharSequence) "a ");
                                            org.telegram.ui.g5 g5Var15 = new org.telegram.ui.g5(this, 18.0f, i16);
                                            int i216 = g5Var15.f38318e;
                                            org.telegram.ui.Components.y8 y8Var14 = g5Var15.f38317c;
                                            y8Var14.j(i216, userOrChat);
                                            g5Var15.f38316b.setForUserOrChat(userOrChat, y8Var14);
                                            spannableStringBuilder3.setSpan(g5Var15, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                                        }
                                        spannableStringBuilder3.append((CharSequence) DialogObject.getShortName(userOrChat));
                                    } else if (tL_messageActionStarGift.gift_num > 0) {
                                        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                    } else {
                                        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                    }
                                    if (messageObject2.isOutOwner()) {
                                    }
                                    if (tL_messageActionStarGift.refunded) {
                                        charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionConvertRefundedText);
                                    } else {
                                        tL_textWithEntities2 = tL_messageActionStarGift.message;
                                        if (tL_textWithEntities2 == null) {
                                            if (tL_messageActionStarGift.auction_acquired) {
                                                charSequenceReplaceTags4 = LocaleController.formatString(R.string.Gift2ActionWonActionText, LocaleController.formatNumber(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                                            } else if (z15) {
                                                if (tL_messageActionStarGift.converted) {
                                                    charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j11);
                                                } else if (z17) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                                }
                                            } else if (z14) {
                                                if (!tL_messageActionStarGift.converted) {
                                                    if (tL_messageActionStarGift.can_upgrade) {
                                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade));
                                                    } else {
                                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert));
                                                    }
                                                } else if (tL_messageActionStarGift.can_upgrade) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert));
                                                }
                                            } else if (z16) {
                                                if (messageObject2.isOutOwner()) {
                                                    string6 = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user5));
                                                } else {
                                                    string6 = LocaleController.getString(R.string.Gift2ActionUpgrade);
                                                }
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(string6);
                                            } else if (messageObject2.isOutOwner()) {
                                                if (!z17) {
                                                    if (tL_messageActionStarGift.can_upgrade) {
                                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                                    } else {
                                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                                    }
                                                } else if (tL_messageActionStarGift.can_upgrade) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                                }
                                            } else if (tL_messageActionStarGift.converted) {
                                                charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j11);
                                            } else if (tL_messageActionStarGift.saved) {
                                                if (z17) {
                                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                                } else {
                                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                                }
                                            } else if (z17) {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j11));
                                            }
                                        } else if (tL_messageActionStarGift.auction_acquired) {
                                            charSequenceReplaceTags4 = LocaleController.formatString(R.string.Gift2ActionWonActionText, LocaleController.formatNumber(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                                        } else if (z15) {
                                            if (tL_messageActionStarGift.converted) {
                                                charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j11);
                                            } else if (z17) {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                            }
                                        } else if (z14) {
                                            if (!tL_messageActionStarGift.converted) {
                                                if (tL_messageActionStarGift.can_upgrade) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert));
                                                }
                                            } else if (tL_messageActionStarGift.can_upgrade) {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade));
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert));
                                            }
                                        } else if (z16) {
                                            if (messageObject2.isOutOwner()) {
                                                string6 = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user5));
                                            } else {
                                                string6 = LocaleController.getString(R.string.Gift2ActionUpgrade);
                                            }
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(string6);
                                        } else if (messageObject2.isOutOwner()) {
                                            if (!z17) {
                                                if (tL_messageActionStarGift.can_upgrade) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                                }
                                            } else if (tL_messageActionStarGift.can_upgrade) {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                            }
                                        } else if (tL_messageActionStarGift.converted) {
                                            charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j11);
                                        } else if (tL_messageActionStarGift.saved) {
                                            if (z17) {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                            } else {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                            }
                                        } else if (z17) {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                        } else {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j11));
                                        }
                                    }
                                    starGift2 = tL_messageActionStarGift.gift;
                                    if (starGift2 == null) {
                                        string7 = null;
                                    } else {
                                        string7 = null;
                                    }
                                    string8 = LocaleController.getString(R.string.ActionGiftStarsView);
                                    if (messageObject2.isOutOwner()) {
                                        charSequence4 = string8;
                                        charSequence4 = string8;
                                        charSequence4 = string8;
                                        if (!messageObject2.isOutOwner()) {
                                            SpannableStringBuilder spannableStringBuilder114 = new SpannableStringBuilder();
                                            spannableStringBuilder114.append((CharSequence) "^  ");
                                            cq cqVar12 = new cq(R.drawable.gift_unpack, 0);
                                            cqVar12.setScale(0.8f, 0.8f);
                                            spannableStringBuilder114.setSpan(cqVar12, 0, 1, 33);
                                            spannableStringBuilder114.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                            charSequence4 = spannableStringBuilder114;
                                        }
                                    } else {
                                        charSequence4 = string8;
                                        charSequence4 = string8;
                                        charSequence4 = string8;
                                        if (!messageObject2.isOutOwner()) {
                                            SpannableStringBuilder spannableStringBuilder115 = new SpannableStringBuilder();
                                            spannableStringBuilder115.append((CharSequence) "^  ");
                                            cq cqVar13 = new cq(R.drawable.gift_unpack, 0);
                                            cqVar13.setScale(0.8f, 0.8f);
                                            spannableStringBuilder115.setSpan(cqVar13, 0, 1, 33);
                                            spannableStringBuilder115.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                            charSequence4 = spannableStringBuilder115;
                                        }
                                    }
                                    starGift3 = tL_messageActionStarGift.gift;
                                    if (starGift3 != null) {
                                        spannableStringBuilder4 = null;
                                    } else {
                                        spannableStringBuilder4 = null;
                                    }
                                    w(spannableStringBuilder3, spannableStringBuilder4, charSequenceReplaceTags4, false, charSequence4, 11, string7, this.W0, true);
                                } else if (messageAction2 instanceof TLRPC.TL_messageActionGiftTon) {
                                    w(LocaleController.getString(R.string.ActionGiftTonTitle), null, this.D0.messageText, false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.W0, true);
                                    this.I = null;
                                    this.K = 0;
                                    this.L = null;
                                    this.M = 0;
                                    this.O = 0;
                                } else {
                                    w(LocaleController.getString(R.string.ActionStarGiveawayPrizeTitle), null, this.D0.messageText, false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.W0, true);
                                    this.I = null;
                                    this.K = 0;
                                    this.L = null;
                                    this.M = 0;
                                    this.O = 0;
                                }
                            } else if (i10 == 33) {
                                tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) message3.action;
                                spannableStringBuilder2 = new SpannableStringBuilder(charSequence);
                                spannableStringBuilder2.append((CharSequence) "\n\n");
                                if (tL_messageActionStarGiftPurchaseOffer.accepted) {
                                    spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftOfferStatusAccepted)));
                                } else if (tL_messageActionStarGiftPurchaseOffer.declined) {
                                    spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftOfferStatusRejected)));
                                } else {
                                    iMax = Math.max(0, tL_messageActionStarGiftPurchaseOffer.expires_at - ConnectionsManager.getInstance(i16).getCurrentTime());
                                    if (iMax == 0) {
                                        spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftOfferStatusExpired)));
                                    } else {
                                        shortDuration2 = LocaleController.formatShortDuration2(iMax);
                                        if (shortDuration2.endsWith(".")) {
                                            shortDuration2 = com.google.android.recaptcha.internal.a.n(shortDuration2, 1, 0);
                                        }
                                        spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferStatusPending, shortDuration2)));
                                    }
                                }
                                w(null, null, spannableStringBuilder2, false, null, 11, null, this.W0, false);
                                this.I = null;
                                this.K = 0;
                                this.L = null;
                                this.M = 0;
                                this.O = 0;
                            } else if (i10 == 34) {
                                w(null, null, charSequence, false, null, 11, null, this.W0, false);
                                this.I = null;
                                this.K = 0;
                                this.L = null;
                                this.M = 0;
                                this.O = 0;
                            } else if (i10 == 35) {
                                tL_messageActionNoForwardsRequest = (TLRPC.TL_messageActionNoForwardsRequest) message3.action;
                                spannableStringBuilder = new SpannableStringBuilder();
                                shortName = DialogObject.getShortName(MessagesController.getInstance(i16).getUser(Long.valueOf(messageObject2.getDialogId())));
                                if (tL_messageActionNoForwardsRequest.new_value) {
                                    if (messageObject2.isOut()) {
                                        charSequenceReplaceTags3 = LocaleController.getString(R.string.SharingOfferDisableHeaderYou);
                                    } else {
                                        charSequenceReplaceTags3 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SharingOfferDisableHeaderOther, shortName));
                                    }
                                    spannableStringBuilder.append(charSequenceReplaceTags3);
                                } else {
                                    if (messageObject2.isOut()) {
                                        charSequenceReplaceTags2 = LocaleController.getString(R.string.SharingOfferEnableHeaderYou);
                                    } else {
                                        charSequenceReplaceTags2 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SharingOfferEnableHeaderOther, shortName));
                                    }
                                    spannableStringBuilder.append(charSequenceReplaceTags2);
                                }
                                if (tL_messageActionNoForwardsRequest.new_value) {
                                    spannableStringBuilder.append((CharSequence) "\n\n");
                                    spannableStringBuilder.append((CharSequence) y(R.drawable.floating_check, LocaleController.getString(R.string.SharingOfferDisable1)));
                                    spannableStringBuilder.append((CharSequence) "\n\n");
                                    spannableStringBuilder.append((CharSequence) y(R.drawable.floating_check, LocaleController.getString(R.string.SharingOfferDisable2)));
                                    spannableStringBuilder.append((CharSequence) "\n\n");
                                    spannableStringBuilder.append((CharSequence) y(R.drawable.floating_check, LocaleController.getString(R.string.SharingOfferDisable3)));
                                    spannableStringBuilder.append((CharSequence) "\n\n");
                                    spannableStringBuilder.append((CharSequence) y(R.drawable.floating_check, LocaleController.getString(R.string.SharingOfferDisable4)));
                                } else {
                                    spannableStringBuilder.append((CharSequence) "\n\n");
                                    spannableStringBuilder.append((CharSequence) y(R.drawable.floating_check, LocaleController.getString(R.string.SharingOfferEnable1)));
                                    spannableStringBuilder.append((CharSequence) "\n\n");
                                    spannableStringBuilder.append((CharSequence) y(R.drawable.floating_check, LocaleController.getString(R.string.SharingOfferEnable2)));
                                    spannableStringBuilder.append((CharSequence) "\n\n");
                                    spannableStringBuilder.append((CharSequence) y(R.drawable.floating_check, LocaleController.getString(R.string.SharingOfferEnable3)));
                                    spannableStringBuilder.append((CharSequence) "\n\n");
                                    spannableStringBuilder.append((CharSequence) y(R.drawable.floating_check, LocaleController.getString(R.string.SharingOfferEnable4)));
                                }
                                w(null, null, spannableStringBuilder, false, null, 11, null, this.W0, false);
                                this.I = null;
                                this.K = 0;
                                this.L = null;
                                this.M = 0;
                                this.O = 0;
                            } else if (i10 == 31) {
                                TL_stars.StarGift starGift7 = ((TLRPC.TL_chatThemeUniqueGift) ((TLRPC.TL_messageActionSetChatTheme) message3.action).theme).gift;
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append(starGift7.title);
                                sb5.append(" #");
                                strM = i0.a.m(starGift7.num, ',', sb5);
                                fromChatId = messageObject2.getFromChatId();
                                if (UserConfig.getInstance(i16).getClientUserId() == fromChatId) {
                                    string5 = LocaleController.formatString(R.string.GiftThemesSetByYou, strM);
                                } else {
                                    string5 = LocaleController.formatString(R.string.GiftThemesSetByOther, DialogObject.getShortName(i16, fromChatId), strM);
                                }
                                w(null, null, AndroidUtilities.replaceTags(string5), false, LocaleController.getString(R.string.GiftThemesSetActionView), 11, null, this.W0, true);
                                this.I = null;
                                this.K = 0;
                                this.L = null;
                                this.M = 0;
                                this.O = 0;
                            } else if (i10 == 37) {
                                TLRPC.TL_messageActionChangeCommunity tL_messageActionChangeCommunity4 = (TLRPC.TL_messageActionChangeCommunity) message3.action;
                                peerDialogId = DialogObject.getPeerDialogId(message3.peer_id);
                                boolean zIsChannelAndNotMegaGroup4 = ChatObject.isChannelAndNotMegaGroup(-peerDialogId, i16);
                                if (peerDialogId > j10) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                String shortName8 = DialogObject.getShortName(i16, DialogObject.getPeerDialogId(messageObject2.messageOwner.from_id));
                                String shortName9 = DialogObject.getShortName(i16, -tL_messageActionChangeCommunity4.community_id);
                                SpannableStringBuilder spannableStringBuilder116 = new SpannableStringBuilder();
                                spannableStringBuilder116.append((CharSequence) oh.r0.a(messageObject2, shortName9, shortName8, zIsChannelAndNotMegaGroup4, z12));
                                w(null, null, spannableStringBuilder116, false, LocaleController.getString(R.string.GiftThemesSetActionView), 11, null, this.W0, true);
                                this.I = null;
                                this.K = 0;
                                this.L = null;
                                this.M = 0;
                                this.O = 0;
                            } else if (i10 == 18) {
                                messageAction = message3.action;
                                if (messageAction instanceof TLRPC.TL_messageActionGiftPremium) {
                                    tL_textWithEntities = ((TLRPC.TL_messageActionGiftPremium) messageAction).message;
                                } else if (messageAction instanceof TLRPC.TL_messageActionGiftCode) {
                                    tL_textWithEntities = ((TLRPC.TL_messageActionGiftCode) messageAction).message;
                                } else {
                                    tL_textWithEntities = null;
                                }
                                if (tL_textWithEntities != null) {
                                    string4 = null;
                                } else {
                                    string4 = null;
                                }
                                if (string4 == null) {
                                    string4 = LocaleController.getString(R.string.ActionGiftPremiumText);
                                }
                                CharSequence charSequence11 = string4;
                                messageObject = this.D0;
                                if (messageObject == null) {
                                    i11 = R.string.ActionGiftPremiumView;
                                } else {
                                    i11 = R.string.ActionGiftPremiumView;
                                }
                                w(LocaleController.formatPluralStringComma("ActionGiftPremiumTitle2", messageObject2.messageOwner.action.months), null, charSequence11, true, LocaleController.getString(i11), 11, null, this.W0, false);
                            } else if (i10 == 21) {
                                tL_messageActionSuggestProfilePhoto = (TLRPC.TL_messageActionSuggestProfilePhoto) message3.action;
                                MessagesController messagesController7 = MessagesController.getInstance(i16);
                                if (messageObject2.isOutOwner()) {
                                    dialogId2 = j10;
                                } else {
                                    dialogId2 = messageObject2.getDialogId();
                                }
                                user3 = messagesController7.getUser(Long.valueOf(dialogId2));
                                if (tL_messageActionSuggestProfilePhoto.video) {
                                    z11 = true;
                                } else {
                                    z11 = true;
                                }
                                if (user3.f22527id == UserConfig.getInstance(i16).clientUserId) {
                                    user4 = MessagesController.getInstance(i16).getUser(Long.valueOf(messageObject2.getDialogId()));
                                    if (z11) {
                                        string2 = LocaleController.formatString(R.string.ActionSuggestVideoFromYouDescription, user4.first_name);
                                    } else {
                                        string2 = LocaleController.formatString(R.string.ActionSuggestPhotoFromYouDescription, user4.first_name);
                                    }
                                } else if (z11) {
                                    string2 = LocaleController.formatString(R.string.ActionSuggestVideoToYouDescription, user3.first_name);
                                } else {
                                    string2 = LocaleController.formatString(R.string.ActionSuggestPhotoToYouDescription, user3.first_name);
                                }
                                CharSequence charSequence12 = string2;
                                if (tL_messageActionSuggestProfilePhoto.video) {
                                    string3 = LocaleController.getString(R.string.ViewVideoAction);
                                } else {
                                    string3 = LocaleController.getString(R.string.ViewVideoAction);
                                }
                                w(null, null, charSequence12, false, string3, 11, null, this.W0, true);
                                this.I = null;
                                this.K = 0;
                                this.L = null;
                                this.M = 0;
                                this.O = 0;
                            } else if (i10 == 22) {
                                MessagesController messagesController8 = MessagesController.getInstance(i16);
                                if (messageObject2.isOutOwner()) {
                                    dialogId = j10;
                                } else {
                                    dialogId = messageObject2.getDialogId();
                                }
                                user2 = messagesController8.getUser(Long.valueOf(dialogId));
                                if (messageObject2.getDialogId() < j10) {
                                    charSequence3 = messageObject2.messageText;
                                } else {
                                    if (messageObject2.isOutOwner()) {
                                    }
                                    if (user2 == null) {
                                    }
                                    charSequence2 = messageObject2.messageText;
                                    string = LocaleController.getString(R.string.ViewWallpaperAction);
                                    z10 = true;
                                    w(null, null, charSequence2, false, string, 11, null, this.W0, z10);
                                    this.I = null;
                                    this.K = 0;
                                    this.L = null;
                                    this.M = 0;
                                    this.O = 0;
                                }
                                charSequence2 = charSequence3;
                                string = null;
                                z10 = true;
                                w(null, null, charSequence2, false, string, 11, null, this.W0, z10);
                                this.I = null;
                                this.K = 0;
                                this.L = null;
                                this.M = 0;
                                this.O = 0;
                            } else if (messageObject2.isStoryMention()) {
                                user = MessagesController.getInstance(i16).getUser(Long.valueOf(messageObject2.messageOwner.media.user_id));
                                if (user.self) {
                                    charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoryYouMentionedTitle, MessagesController.getInstance(i16).getUser(Long.valueOf(messageObject2.getDialogId())).first_name));
                                } else {
                                    charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoryMentionedTitle, user.first_name));
                                }
                                w(null, null, charSequenceReplaceTags, false, LocaleController.getString(R.string.StoryMentionedAction), 11, null, this.W0, true);
                                this.I = null;
                                this.K = 0;
                                this.L = null;
                                this.M = 0;
                                this.O = 0;
                            }
                        }
                    }
                } else {
                    i10 = messageObject2.type;
                    if (i10 == 11) {
                        float f18 = (this.R - AndroidUtilities.roundMessageSize) / 2.0f;
                        float fDp5 = AndroidUtilities.dp(19.0f) + this.K;
                        float f19 = AndroidUtilities.roundMessageSize;
                        this.E.setImageCoords(f18, fDp5, f19, f19);
                    } else if (i10 == 25) {
                        v();
                    } else {
                        TextPaint textPaint5 = this.f25773t1;
                        if (i10 == 30) {
                            user5 = MessagesController.getInstance(i16).getUser(Long.valueOf(this.D0.getDialogId()));
                            messageAction2 = messageObject2.messageOwner.action;
                            if (messageAction2 instanceof TLRPC.TL_messageActionGiftStars) {
                                CharSequence pluralStringComma5 = LocaleController.formatPluralStringComma("ActionGiftStarsTitle", (int) ((TLRPC.TL_messageActionGiftStars) messageAction2).stars);
                                if (this.D0.isOutOwner()) {
                                    string9 = LocaleController.formatString(R.string.ActionGiftStarsSubtitle, UserObject.getForcedFirstName(user5));
                                } else {
                                    string9 = LocaleController.getString(R.string.ActionGiftStarsSubtitleYou);
                                }
                                w(pluralStringComma5, null, AndroidUtilities.replaceTags(string9), false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.W0, true);
                            } else if (!(messageAction2 instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                                if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                                    tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction2;
                                    j11 = tL_messageActionStarGift.convert_stars;
                                    clientUserId = UserConfig.getInstance(i16).getClientUserId();
                                    peer = tL_messageActionStarGift.peer;
                                    if (peer != null) {
                                        z13 = false;
                                    } else {
                                        z13 = false;
                                    }
                                    if (messageObject2.getDialogId() == clientUserId) {
                                        z14 = false;
                                    } else {
                                        z14 = false;
                                    }
                                    fromChatId2 = messageObject2.getFromChatId();
                                    if (!tL_messageActionStarGift.prepaid_upgrade) {
                                        fromChatId2 = DialogObject.getPeerDialogId(peer2);
                                    }
                                    spannableStringBuilder3 = new SpannableStringBuilder();
                                    userOrChat = MessagesController.getInstance(i16).getUserOrChat(fromChatId2);
                                    peerDialogId2 = DialogObject.getPeerDialogId(tL_messageActionStarGift.to_id);
                                    z15 = z13;
                                    TLObject userOrChat9 = MessagesController.getInstance(i16).getUserOrChat(peerDialogId2);
                                    if (tL_messageActionStarGift.can_upgrade) {
                                        z16 = false;
                                    } else {
                                        z16 = false;
                                    }
                                    if (peerDialogId2 == j10) {
                                        if (!z14) {
                                            if (tL_messageActionStarGift.prepaid_upgrade) {
                                                i12 = R.string.Gift2ActionUpgradeTitle;
                                            } else {
                                                i12 = R.string.Gift2ActionTitle;
                                            }
                                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(i12)).append((CharSequence) " ");
                                            if (DialogObject.hasPhoto(userOrChat)) {
                                                spannableStringBuilder3.append((CharSequence) "a ");
                                                org.telegram.ui.g5 g5Var16 = new org.telegram.ui.g5(this, 18.0f, i16);
                                                int i217 = g5Var16.f38318e;
                                                org.telegram.ui.Components.y8 y8Var15 = g5Var16.f38317c;
                                                y8Var15.j(i217, userOrChat);
                                                g5Var16.f38316b.setForUserOrChat(userOrChat, y8Var15);
                                                spannableStringBuilder3.setSpan(g5Var16, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                                            }
                                            spannableStringBuilder3.append((CharSequence) DialogObject.getShortName(userOrChat));
                                        } else if (tL_messageActionStarGift.gift_num > 0) {
                                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                        } else {
                                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                        }
                                    } else if (!z14) {
                                        if (tL_messageActionStarGift.prepaid_upgrade) {
                                            i12 = R.string.Gift2ActionUpgradeTitle;
                                        } else {
                                            i12 = R.string.Gift2ActionTitle;
                                        }
                                        spannableStringBuilder3.append((CharSequence) LocaleController.getString(i12)).append((CharSequence) " ");
                                        if (DialogObject.hasPhoto(userOrChat)) {
                                            spannableStringBuilder3.append((CharSequence) "a ");
                                            org.telegram.ui.g5 g5Var17 = new org.telegram.ui.g5(this, 18.0f, i16);
                                            int i218 = g5Var17.f38318e;
                                            org.telegram.ui.Components.y8 y8Var16 = g5Var17.f38317c;
                                            y8Var16.j(i218, userOrChat);
                                            g5Var17.f38316b.setForUserOrChat(userOrChat, y8Var16);
                                            spannableStringBuilder3.setSpan(g5Var17, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                                        }
                                        spannableStringBuilder3.append((CharSequence) DialogObject.getShortName(userOrChat));
                                    } else if (tL_messageActionStarGift.gift_num > 0) {
                                        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                    } else {
                                        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                    }
                                    if (messageObject2.isOutOwner()) {
                                    }
                                    if (tL_messageActionStarGift.refunded) {
                                        charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionConvertRefundedText);
                                    } else {
                                        tL_textWithEntities2 = tL_messageActionStarGift.message;
                                        if (tL_textWithEntities2 == null) {
                                            if (tL_messageActionStarGift.auction_acquired) {
                                                charSequenceReplaceTags4 = LocaleController.formatString(R.string.Gift2ActionWonActionText, LocaleController.formatNumber(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                                            } else if (z15) {
                                                if (tL_messageActionStarGift.converted) {
                                                    charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j11);
                                                } else if (z17) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                                }
                                            } else if (z14) {
                                                if (!tL_messageActionStarGift.converted) {
                                                    if (tL_messageActionStarGift.can_upgrade) {
                                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade));
                                                    } else {
                                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert));
                                                    }
                                                } else if (tL_messageActionStarGift.can_upgrade) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert));
                                                }
                                            } else if (z16) {
                                                if (messageObject2.isOutOwner()) {
                                                    string6 = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user5));
                                                } else {
                                                    string6 = LocaleController.getString(R.string.Gift2ActionUpgrade);
                                                }
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(string6);
                                            } else if (messageObject2.isOutOwner()) {
                                                if (!z17) {
                                                    if (tL_messageActionStarGift.can_upgrade) {
                                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                                    } else {
                                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                                    }
                                                } else if (tL_messageActionStarGift.can_upgrade) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                                }
                                            } else if (tL_messageActionStarGift.converted) {
                                                charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j11);
                                            } else if (tL_messageActionStarGift.saved) {
                                                if (z17) {
                                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                                } else {
                                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                                }
                                            } else if (z17) {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j11));
                                            }
                                        } else if (tL_messageActionStarGift.auction_acquired) {
                                            charSequenceReplaceTags4 = LocaleController.formatString(R.string.Gift2ActionWonActionText, LocaleController.formatNumber(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                                        } else if (z15) {
                                            if (tL_messageActionStarGift.converted) {
                                                charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j11);
                                            } else if (z17) {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                            }
                                        } else if (z14) {
                                            if (!tL_messageActionStarGift.converted) {
                                                if (tL_messageActionStarGift.can_upgrade) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert));
                                                }
                                            } else if (tL_messageActionStarGift.can_upgrade) {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade));
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert));
                                            }
                                        } else if (z16) {
                                            if (messageObject2.isOutOwner()) {
                                                string6 = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user5));
                                            } else {
                                                string6 = LocaleController.getString(R.string.Gift2ActionUpgrade);
                                            }
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(string6);
                                        } else if (messageObject2.isOutOwner()) {
                                            if (!z17) {
                                                if (tL_messageActionStarGift.can_upgrade) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                                }
                                            } else if (tL_messageActionStarGift.can_upgrade) {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                            }
                                        } else if (tL_messageActionStarGift.converted) {
                                            charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j11);
                                        } else if (tL_messageActionStarGift.saved) {
                                            if (z17) {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                            } else {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                            }
                                        } else if (z17) {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                        } else {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j11));
                                        }
                                    }
                                    starGift2 = tL_messageActionStarGift.gift;
                                    if (starGift2 == null) {
                                        string7 = null;
                                    } else {
                                        string7 = null;
                                    }
                                    string8 = LocaleController.getString(R.string.ActionGiftStarsView);
                                    if (messageObject2.isOutOwner()) {
                                        charSequence4 = string8;
                                        charSequence4 = string8;
                                        charSequence4 = string8;
                                        if (!messageObject2.isOutOwner()) {
                                            SpannableStringBuilder spannableStringBuilder117 = new SpannableStringBuilder();
                                            spannableStringBuilder117.append((CharSequence) "^  ");
                                            cq cqVar14 = new cq(R.drawable.gift_unpack, 0);
                                            cqVar14.setScale(0.8f, 0.8f);
                                            spannableStringBuilder117.setSpan(cqVar14, 0, 1, 33);
                                            spannableStringBuilder117.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                            charSequence4 = spannableStringBuilder117;
                                        }
                                    } else {
                                        charSequence4 = string8;
                                        charSequence4 = string8;
                                        charSequence4 = string8;
                                        if (!messageObject2.isOutOwner()) {
                                            SpannableStringBuilder spannableStringBuilder118 = new SpannableStringBuilder();
                                            spannableStringBuilder118.append((CharSequence) "^  ");
                                            cq cqVar15 = new cq(R.drawable.gift_unpack, 0);
                                            cqVar15.setScale(0.8f, 0.8f);
                                            spannableStringBuilder118.setSpan(cqVar15, 0, 1, 33);
                                            spannableStringBuilder118.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                            charSequence4 = spannableStringBuilder118;
                                        }
                                    }
                                    starGift3 = tL_messageActionStarGift.gift;
                                    if (starGift3 != null) {
                                        spannableStringBuilder4 = null;
                                    } else {
                                        spannableStringBuilder4 = null;
                                    }
                                    w(spannableStringBuilder3, spannableStringBuilder4, charSequenceReplaceTags4, false, charSequence4, 11, string7, this.W0, true);
                                } else if (messageAction2 instanceof TLRPC.TL_messageActionGiftTon) {
                                    w(LocaleController.getString(R.string.ActionGiftTonTitle), null, this.D0.messageText, false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.W0, true);
                                    this.I = null;
                                    this.K = 0;
                                    this.L = null;
                                    this.M = 0;
                                    this.O = 0;
                                } else {
                                    w(LocaleController.getString(R.string.ActionStarGiveawayPrizeTitle), null, this.D0.messageText, false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.W0, true);
                                    this.I = null;
                                    this.K = 0;
                                    this.L = null;
                                    this.M = 0;
                                    this.O = 0;
                                }
                            } else if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                                tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction2;
                                j11 = tL_messageActionStarGift.convert_stars;
                                clientUserId = UserConfig.getInstance(i16).getClientUserId();
                                peer = tL_messageActionStarGift.peer;
                                if (peer != null) {
                                    z13 = false;
                                } else {
                                    z13 = false;
                                }
                                if (messageObject2.getDialogId() == clientUserId) {
                                    z14 = false;
                                } else {
                                    z14 = false;
                                }
                                fromChatId2 = messageObject2.getFromChatId();
                                if (!tL_messageActionStarGift.prepaid_upgrade) {
                                    fromChatId2 = DialogObject.getPeerDialogId(peer2);
                                }
                                spannableStringBuilder3 = new SpannableStringBuilder();
                                userOrChat = MessagesController.getInstance(i16).getUserOrChat(fromChatId2);
                                peerDialogId2 = DialogObject.getPeerDialogId(tL_messageActionStarGift.to_id);
                                z15 = z13;
                                TLObject userOrChat10 = MessagesController.getInstance(i16).getUserOrChat(peerDialogId2);
                                if (tL_messageActionStarGift.can_upgrade) {
                                    z16 = false;
                                } else {
                                    z16 = false;
                                }
                                if (peerDialogId2 == j10) {
                                    if (!z14) {
                                        if (tL_messageActionStarGift.prepaid_upgrade) {
                                            i12 = R.string.Gift2ActionUpgradeTitle;
                                        } else {
                                            i12 = R.string.Gift2ActionTitle;
                                        }
                                        spannableStringBuilder3.append((CharSequence) LocaleController.getString(i12)).append((CharSequence) " ");
                                        if (DialogObject.hasPhoto(userOrChat)) {
                                            spannableStringBuilder3.append((CharSequence) "a ");
                                            org.telegram.ui.g5 g5Var18 = new org.telegram.ui.g5(this, 18.0f, i16);
                                            int i219 = g5Var18.f38318e;
                                            org.telegram.ui.Components.y8 y8Var17 = g5Var18.f38317c;
                                            y8Var17.j(i219, userOrChat);
                                            g5Var18.f38316b.setForUserOrChat(userOrChat, y8Var17);
                                            spannableStringBuilder3.setSpan(g5Var18, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                                        }
                                        spannableStringBuilder3.append((CharSequence) DialogObject.getShortName(userOrChat));
                                    } else if (tL_messageActionStarGift.gift_num > 0) {
                                        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                    } else {
                                        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                    }
                                } else if (!z14) {
                                    if (tL_messageActionStarGift.prepaid_upgrade) {
                                        i12 = R.string.Gift2ActionUpgradeTitle;
                                    } else {
                                        i12 = R.string.Gift2ActionTitle;
                                    }
                                    spannableStringBuilder3.append((CharSequence) LocaleController.getString(i12)).append((CharSequence) " ");
                                    if (DialogObject.hasPhoto(userOrChat)) {
                                        spannableStringBuilder3.append((CharSequence) "a ");
                                        org.telegram.ui.g5 g5Var19 = new org.telegram.ui.g5(this, 18.0f, i16);
                                        int i2110 = g5Var19.f38318e;
                                        org.telegram.ui.Components.y8 y8Var18 = g5Var19.f38317c;
                                        y8Var18.j(i2110, userOrChat);
                                        g5Var19.f38316b.setForUserOrChat(userOrChat, y8Var18);
                                        spannableStringBuilder3.setSpan(g5Var19, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                                    }
                                    spannableStringBuilder3.append((CharSequence) DialogObject.getShortName(userOrChat));
                                } else if (tL_messageActionStarGift.gift_num > 0) {
                                    spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                } else {
                                    spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                }
                                if (messageObject2.isOutOwner()) {
                                }
                                if (tL_messageActionStarGift.refunded) {
                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionConvertRefundedText);
                                } else {
                                    tL_textWithEntities2 = tL_messageActionStarGift.message;
                                    if (tL_textWithEntities2 == null) {
                                        if (tL_messageActionStarGift.auction_acquired) {
                                            charSequenceReplaceTags4 = LocaleController.formatString(R.string.Gift2ActionWonActionText, LocaleController.formatNumber(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                                        } else if (z15) {
                                            if (tL_messageActionStarGift.converted) {
                                                charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j11);
                                            } else if (z17) {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                            }
                                        } else if (z14) {
                                            if (!tL_messageActionStarGift.converted) {
                                                if (tL_messageActionStarGift.can_upgrade) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert));
                                                }
                                            } else if (tL_messageActionStarGift.can_upgrade) {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade));
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert));
                                            }
                                        } else if (z16) {
                                            if (messageObject2.isOutOwner()) {
                                                string6 = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user5));
                                            } else {
                                                string6 = LocaleController.getString(R.string.Gift2ActionUpgrade);
                                            }
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(string6);
                                        } else if (messageObject2.isOutOwner()) {
                                            if (!z17) {
                                                if (tL_messageActionStarGift.can_upgrade) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                                }
                                            } else if (tL_messageActionStarGift.can_upgrade) {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                            }
                                        } else if (tL_messageActionStarGift.converted) {
                                            charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j11);
                                        } else if (tL_messageActionStarGift.saved) {
                                            if (z17) {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                            } else {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                            }
                                        } else if (z17) {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                        } else {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j11));
                                        }
                                    } else if (tL_messageActionStarGift.auction_acquired) {
                                        charSequenceReplaceTags4 = LocaleController.formatString(R.string.Gift2ActionWonActionText, LocaleController.formatNumber(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                                    } else if (z15) {
                                        if (tL_messageActionStarGift.converted) {
                                            charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j11);
                                        } else if (z17) {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                        } else {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                        }
                                    } else if (z14) {
                                        if (!tL_messageActionStarGift.converted) {
                                            if (tL_messageActionStarGift.can_upgrade) {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade));
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert));
                                            }
                                        } else if (tL_messageActionStarGift.can_upgrade) {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade));
                                        } else {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert));
                                        }
                                    } else if (z16) {
                                        if (messageObject2.isOutOwner()) {
                                            string6 = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user5));
                                        } else {
                                            string6 = LocaleController.getString(R.string.Gift2ActionUpgrade);
                                        }
                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(string6);
                                    } else if (messageObject2.isOutOwner()) {
                                        if (!z17) {
                                            if (tL_messageActionStarGift.can_upgrade) {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                            }
                                        } else if (tL_messageActionStarGift.can_upgrade) {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                        } else {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                        }
                                    } else if (tL_messageActionStarGift.converted) {
                                        charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j11);
                                    } else if (tL_messageActionStarGift.saved) {
                                        if (z17) {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                        } else {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                        }
                                    } else if (z17) {
                                        charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                    } else {
                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j11));
                                    }
                                }
                                starGift2 = tL_messageActionStarGift.gift;
                                if (starGift2 == null) {
                                    string7 = null;
                                } else {
                                    string7 = null;
                                }
                                string8 = LocaleController.getString(R.string.ActionGiftStarsView);
                                if (messageObject2.isOutOwner()) {
                                    charSequence4 = string8;
                                    charSequence4 = string8;
                                    charSequence4 = string8;
                                    if (!messageObject2.isOutOwner()) {
                                        SpannableStringBuilder spannableStringBuilder119 = new SpannableStringBuilder();
                                        spannableStringBuilder119.append((CharSequence) "^  ");
                                        cq cqVar16 = new cq(R.drawable.gift_unpack, 0);
                                        cqVar16.setScale(0.8f, 0.8f);
                                        spannableStringBuilder119.setSpan(cqVar16, 0, 1, 33);
                                        spannableStringBuilder119.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                        charSequence4 = spannableStringBuilder119;
                                    }
                                } else {
                                    charSequence4 = string8;
                                    charSequence4 = string8;
                                    charSequence4 = string8;
                                    if (!messageObject2.isOutOwner()) {
                                        SpannableStringBuilder spannableStringBuilder1110 = new SpannableStringBuilder();
                                        spannableStringBuilder1110.append((CharSequence) "^  ");
                                        cq cqVar17 = new cq(R.drawable.gift_unpack, 0);
                                        cqVar17.setScale(0.8f, 0.8f);
                                        spannableStringBuilder1110.setSpan(cqVar17, 0, 1, 33);
                                        spannableStringBuilder1110.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                        charSequence4 = spannableStringBuilder1110;
                                    }
                                }
                                starGift3 = tL_messageActionStarGift.gift;
                                if (starGift3 != null) {
                                    spannableStringBuilder4 = null;
                                } else {
                                    spannableStringBuilder4 = null;
                                }
                                w(spannableStringBuilder3, spannableStringBuilder4, charSequenceReplaceTags4, false, charSequence4, 11, string7, this.W0, true);
                            } else if (messageAction2 instanceof TLRPC.TL_messageActionGiftTon) {
                                w(LocaleController.getString(R.string.ActionGiftTonTitle), null, this.D0.messageText, false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.W0, true);
                                this.I = null;
                                this.K = 0;
                                this.L = null;
                                this.M = 0;
                                this.O = 0;
                            } else {
                                w(LocaleController.getString(R.string.ActionStarGiveawayPrizeTitle), null, this.D0.messageText, false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.W0, true);
                                this.I = null;
                                this.K = 0;
                                this.L = null;
                                this.M = 0;
                                this.O = 0;
                            }
                        } else if (i10 == 33) {
                            tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) message3.action;
                            spannableStringBuilder2 = new SpannableStringBuilder(charSequence);
                            spannableStringBuilder2.append((CharSequence) "\n\n");
                            if (tL_messageActionStarGiftPurchaseOffer.accepted) {
                                spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftOfferStatusAccepted)));
                            } else if (tL_messageActionStarGiftPurchaseOffer.declined) {
                                spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftOfferStatusRejected)));
                            } else {
                                iMax = Math.max(0, tL_messageActionStarGiftPurchaseOffer.expires_at - ConnectionsManager.getInstance(i16).getCurrentTime());
                                if (iMax == 0) {
                                    spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftOfferStatusExpired)));
                                } else {
                                    shortDuration2 = LocaleController.formatShortDuration2(iMax);
                                    if (shortDuration2.endsWith(".")) {
                                        shortDuration2 = com.google.android.recaptcha.internal.a.n(shortDuration2, 1, 0);
                                    }
                                    spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferStatusPending, shortDuration2)));
                                }
                            }
                            w(null, null, spannableStringBuilder2, false, null, 11, null, this.W0, false);
                            this.I = null;
                            this.K = 0;
                            this.L = null;
                            this.M = 0;
                            this.O = 0;
                        } else if (i10 == 34) {
                            w(null, null, charSequence, false, null, 11, null, this.W0, false);
                            this.I = null;
                            this.K = 0;
                            this.L = null;
                            this.M = 0;
                            this.O = 0;
                        } else if (i10 == 35) {
                            tL_messageActionNoForwardsRequest = (TLRPC.TL_messageActionNoForwardsRequest) message3.action;
                            spannableStringBuilder = new SpannableStringBuilder();
                            shortName = DialogObject.getShortName(MessagesController.getInstance(i16).getUser(Long.valueOf(messageObject2.getDialogId())));
                            if (tL_messageActionNoForwardsRequest.new_value) {
                                if (messageObject2.isOut()) {
                                    charSequenceReplaceTags3 = LocaleController.getString(R.string.SharingOfferDisableHeaderYou);
                                } else {
                                    charSequenceReplaceTags3 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SharingOfferDisableHeaderOther, shortName));
                                }
                                spannableStringBuilder.append(charSequenceReplaceTags3);
                            } else {
                                if (messageObject2.isOut()) {
                                    charSequenceReplaceTags2 = LocaleController.getString(R.string.SharingOfferEnableHeaderYou);
                                } else {
                                    charSequenceReplaceTags2 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SharingOfferEnableHeaderOther, shortName));
                                }
                                spannableStringBuilder.append(charSequenceReplaceTags2);
                            }
                            if (tL_messageActionNoForwardsRequest.new_value) {
                                spannableStringBuilder.append((CharSequence) "\n\n");
                                spannableStringBuilder.append((CharSequence) y(R.drawable.floating_check, LocaleController.getString(R.string.SharingOfferDisable1)));
                                spannableStringBuilder.append((CharSequence) "\n\n");
                                spannableStringBuilder.append((CharSequence) y(R.drawable.floating_check, LocaleController.getString(R.string.SharingOfferDisable2)));
                                spannableStringBuilder.append((CharSequence) "\n\n");
                                spannableStringBuilder.append((CharSequence) y(R.drawable.floating_check, LocaleController.getString(R.string.SharingOfferDisable3)));
                                spannableStringBuilder.append((CharSequence) "\n\n");
                                spannableStringBuilder.append((CharSequence) y(R.drawable.floating_check, LocaleController.getString(R.string.SharingOfferDisable4)));
                            } else {
                                spannableStringBuilder.append((CharSequence) "\n\n");
                                spannableStringBuilder.append((CharSequence) y(R.drawable.floating_check, LocaleController.getString(R.string.SharingOfferEnable1)));
                                spannableStringBuilder.append((CharSequence) "\n\n");
                                spannableStringBuilder.append((CharSequence) y(R.drawable.floating_check, LocaleController.getString(R.string.SharingOfferEnable2)));
                                spannableStringBuilder.append((CharSequence) "\n\n");
                                spannableStringBuilder.append((CharSequence) y(R.drawable.floating_check, LocaleController.getString(R.string.SharingOfferEnable3)));
                                spannableStringBuilder.append((CharSequence) "\n\n");
                                spannableStringBuilder.append((CharSequence) y(R.drawable.floating_check, LocaleController.getString(R.string.SharingOfferEnable4)));
                            }
                            w(null, null, spannableStringBuilder, false, null, 11, null, this.W0, false);
                            this.I = null;
                            this.K = 0;
                            this.L = null;
                            this.M = 0;
                            this.O = 0;
                        } else if (i10 == 31) {
                            TL_stars.StarGift starGift8 = ((TLRPC.TL_chatThemeUniqueGift) ((TLRPC.TL_messageActionSetChatTheme) message3.action).theme).gift;
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append(starGift8.title);
                            sb6.append(" #");
                            strM = i0.a.m(starGift8.num, ',', sb6);
                            fromChatId = messageObject2.getFromChatId();
                            if (UserConfig.getInstance(i16).getClientUserId() == fromChatId) {
                                string5 = LocaleController.formatString(R.string.GiftThemesSetByYou, strM);
                            } else {
                                string5 = LocaleController.formatString(R.string.GiftThemesSetByOther, DialogObject.getShortName(i16, fromChatId), strM);
                            }
                            w(null, null, AndroidUtilities.replaceTags(string5), false, LocaleController.getString(R.string.GiftThemesSetActionView), 11, null, this.W0, true);
                            this.I = null;
                            this.K = 0;
                            this.L = null;
                            this.M = 0;
                            this.O = 0;
                        } else if (i10 == 37) {
                            TLRPC.TL_messageActionChangeCommunity tL_messageActionChangeCommunity5 = (TLRPC.TL_messageActionChangeCommunity) message3.action;
                            peerDialogId = DialogObject.getPeerDialogId(message3.peer_id);
                            boolean zIsChannelAndNotMegaGroup5 = ChatObject.isChannelAndNotMegaGroup(-peerDialogId, i16);
                            if (peerDialogId > j10) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            String shortName10 = DialogObject.getShortName(i16, DialogObject.getPeerDialogId(messageObject2.messageOwner.from_id));
                            String shortName11 = DialogObject.getShortName(i16, -tL_messageActionChangeCommunity5.community_id);
                            SpannableStringBuilder spannableStringBuilder1111 = new SpannableStringBuilder();
                            spannableStringBuilder1111.append((CharSequence) oh.r0.a(messageObject2, shortName11, shortName10, zIsChannelAndNotMegaGroup5, z12));
                            w(null, null, spannableStringBuilder1111, false, LocaleController.getString(R.string.GiftThemesSetActionView), 11, null, this.W0, true);
                            this.I = null;
                            this.K = 0;
                            this.L = null;
                            this.M = 0;
                            this.O = 0;
                        } else if (i10 == 18) {
                            messageAction = message3.action;
                            if (messageAction instanceof TLRPC.TL_messageActionGiftPremium) {
                                tL_textWithEntities = ((TLRPC.TL_messageActionGiftPremium) messageAction).message;
                            } else if (messageAction instanceof TLRPC.TL_messageActionGiftCode) {
                                tL_textWithEntities = ((TLRPC.TL_messageActionGiftCode) messageAction).message;
                            } else {
                                tL_textWithEntities = null;
                            }
                            if (tL_textWithEntities != null) {
                                string4 = null;
                            } else {
                                string4 = null;
                            }
                            if (string4 == null) {
                                string4 = LocaleController.getString(R.string.ActionGiftPremiumText);
                            }
                            CharSequence charSequence13 = string4;
                            messageObject = this.D0;
                            if (messageObject == null) {
                                i11 = R.string.ActionGiftPremiumView;
                            } else {
                                i11 = R.string.ActionGiftPremiumView;
                            }
                            w(LocaleController.formatPluralStringComma("ActionGiftPremiumTitle2", messageObject2.messageOwner.action.months), null, charSequence13, true, LocaleController.getString(i11), 11, null, this.W0, false);
                        } else if (i10 == 21) {
                            tL_messageActionSuggestProfilePhoto = (TLRPC.TL_messageActionSuggestProfilePhoto) message3.action;
                            MessagesController messagesController9 = MessagesController.getInstance(i16);
                            if (messageObject2.isOutOwner()) {
                                dialogId2 = j10;
                            } else {
                                dialogId2 = messageObject2.getDialogId();
                            }
                            user3 = messagesController9.getUser(Long.valueOf(dialogId2));
                            if (tL_messageActionSuggestProfilePhoto.video) {
                                z11 = true;
                            } else {
                                z11 = true;
                            }
                            if (user3.f22527id == UserConfig.getInstance(i16).clientUserId) {
                                user4 = MessagesController.getInstance(i16).getUser(Long.valueOf(messageObject2.getDialogId()));
                                if (z11) {
                                    string2 = LocaleController.formatString(R.string.ActionSuggestVideoFromYouDescription, user4.first_name);
                                } else {
                                    string2 = LocaleController.formatString(R.string.ActionSuggestPhotoFromYouDescription, user4.first_name);
                                }
                            } else if (z11) {
                                string2 = LocaleController.formatString(R.string.ActionSuggestVideoToYouDescription, user3.first_name);
                            } else {
                                string2 = LocaleController.formatString(R.string.ActionSuggestPhotoToYouDescription, user3.first_name);
                            }
                            CharSequence charSequence14 = string2;
                            if (tL_messageActionSuggestProfilePhoto.video) {
                                string3 = LocaleController.getString(R.string.ViewVideoAction);
                            } else {
                                string3 = LocaleController.getString(R.string.ViewVideoAction);
                            }
                            w(null, null, charSequence14, false, string3, 11, null, this.W0, true);
                            this.I = null;
                            this.K = 0;
                            this.L = null;
                            this.M = 0;
                            this.O = 0;
                        } else if (i10 == 22) {
                            MessagesController messagesController10 = MessagesController.getInstance(i16);
                            if (messageObject2.isOutOwner()) {
                                dialogId = j10;
                            } else {
                                dialogId = messageObject2.getDialogId();
                            }
                            user2 = messagesController10.getUser(Long.valueOf(dialogId));
                            if (messageObject2.getDialogId() < j10) {
                                charSequence3 = messageObject2.messageText;
                            } else {
                                if (messageObject2.isOutOwner()) {
                                }
                                if (user2 == null) {
                                }
                                charSequence2 = messageObject2.messageText;
                                string = LocaleController.getString(R.string.ViewWallpaperAction);
                                z10 = true;
                                w(null, null, charSequence2, false, string, 11, null, this.W0, z10);
                                this.I = null;
                                this.K = 0;
                                this.L = null;
                                this.M = 0;
                                this.O = 0;
                            }
                            charSequence2 = charSequence3;
                            string = null;
                            z10 = true;
                            w(null, null, charSequence2, false, string, 11, null, this.W0, z10);
                            this.I = null;
                            this.K = 0;
                            this.L = null;
                            this.M = 0;
                            this.O = 0;
                        } else if (messageObject2.isStoryMention()) {
                            user = MessagesController.getInstance(i16).getUser(Long.valueOf(messageObject2.messageOwner.media.user_id));
                            if (user.self) {
                                charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoryYouMentionedTitle, MessagesController.getInstance(i16).getUser(Long.valueOf(messageObject2.getDialogId())).first_name));
                            } else {
                                charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoryMentionedTitle, user.first_name));
                            }
                            w(null, null, charSequenceReplaceTags, false, LocaleController.getString(R.string.StoryMentionedAction), 11, null, this.W0, true);
                            this.I = null;
                            this.K = 0;
                            this.L = null;
                            this.M = 0;
                            this.O = 0;
                        }
                    }
                }
            }
        }
        int iDp = AndroidUtilities.dp(12.0f);
        ig.r0 r0Var = this.f25785y0;
        r0Var.f11420c = iDp;
        r0Var.p(this.R - AndroidUtilities.dp(24.0f), 1);
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
        this.f25732b2 = runnable;
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
        this.f25785y0.C = num;
    }

    public void setShowTopic(boolean z10) {
        if (this.f25749i0 != z10) {
            this.f25749i0 = z10;
            K();
            invalidate();
        }
    }

    public void setSpoilersSuppressed(boolean z10) {
        ArrayList arrayList = this.f25755l0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((eh.k) obj).invalidateSelf();
        }
    }

    public final void t() {
        float f10 = this.O0;
        RectF rectF = this.Q0;
        this.O0 = (int) Math.min(f10, rectF.left);
        this.P0 = (int) Math.max(this.P0, rectF.right);
    }

    public final boolean u(float f10, int i10) {
        ig.r0 r0Var = this.f25785y0;
        if (!r0Var.K) {
            return false;
        }
        float y10 = getY() + r0Var.d;
        return y10 > f10 && (y10 + ((float) r0Var.f11430o)) - ((float) AndroidUtilities.dp(16.0f)) < ((float) i10);
    }

    public final void v() {
        SpannableStringBuilder spannableStringBuilder;
        int iDp = this.W0 - AndroidUtilities.dp(16.0f);
        float fDp = AndroidUtilities.dp(14.0f);
        TextPaint textPaint = this.f25771s1;
        textPaint.setTextSize(fDp);
        float fDp2 = AndroidUtilities.dp(13.0f);
        TextPaint textPaint2 = this.f25773t1;
        textPaint2.setTextSize(fDp2);
        TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode = (TLRPC.TL_messageActionGiftCode) this.D0.messageOwner.action;
        int i10 = tL_messageActionGiftCode.months;
        TLRPC.Chat chat = MessagesController.getInstance(this.D).getChat(Long.valueOf(-DialogObject.getPeerDialogId(tL_messageActionGiftCode.boost_peer)));
        String str = chat == null ? null : chat.title;
        boolean z10 = tL_messageActionGiftCode.via_giveaway;
        String string = tL_messageActionGiftCode.unclaimed ? LocaleController.getString("BoostingUnclaimedPrize", R.string.BoostingUnclaimedPrize) : LocaleController.getString("BoostingCongratulations", R.string.BoostingCongratulations);
        String pluralString = i10 == 12 ? LocaleController.formatPluralString("BoldYears", 1, new Object[0]) : LocaleController.formatPluralString("BoldMonths", i10, new Object[0]);
        if (!z10) {
            spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(str == null ? LocaleController.getString(R.string.BoostingReceivedGiftNoName) : LocaleController.formatString("BoostingReceivedGiftFrom", R.string.BoostingReceivedGiftFrom, str)));
            spannableStringBuilder.append((CharSequence) "\n\n");
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BoostingReceivedGiftDuration, pluralString)));
        } else if (tL_messageActionGiftCode.unclaimed) {
            spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BoostingYouHaveUnclaimedPrize, str)));
            spannableStringBuilder.append((CharSequence) "\n\n");
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BoostingUnclaimedPrizeDuration, pluralString)));
        } else {
            spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BoostingReceivedPrizeFrom, str)));
            spannableStringBuilder.append((CharSequence) "\n\n");
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BoostingReceivedPrizeDuration, pluralString)));
        }
        String string2 = LocaleController.getString("BoostingReceivedGiftOpenBtn", R.string.BoostingReceivedGiftOpenBtn);
        SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(string);
        spannableStringBuilderValueOf.setSpan(new k41(AndroidUtilities.bold()), 0, spannableStringBuilderValueOf.length(), 33);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        this.X0 = new StaticLayout(spannableStringBuilderValueOf, textPaint, iDp, alignment, 1.1f, 0.0f, false);
        this.f25729a1 = null;
        this.Z0 = null;
        ag.r rVar = this.f25746g1;
        if (rVar != null) {
            org.telegram.ui.Components.t5.release((v0) rVar.f633i, (org.telegram.ui.Components.p5) rVar.h);
        }
        ag.r rVar2 = new ag.r(this);
        this.f25746g1 = rVar2;
        rVar2.a(spannableStringBuilder, textPaint2, iDp);
        SpannableStringBuilder spannableStringBuilderValueOf2 = SpannableStringBuilder.valueOf(string2);
        spannableStringBuilderValueOf2.setSpan(new k41(AndroidUtilities.bold()), 0, spannableStringBuilderValueOf2.length(), 33);
        this.f25734c1 = false;
        this.f25737d1 = 0;
        this.f25754k1 = null;
        StaticLayout staticLayout = new StaticLayout(spannableStringBuilderValueOf2, (TextPaint) H("paintChatActionText"), iDp, alignment, 1.0f, 0.0f, false);
        this.l1 = staticLayout;
        this.f25756m1 = true;
        this.f25768r1 = P(staticLayout);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.F || super.verifyDrawable(drawable);
    }

    public final void w(CharSequence charSequence, SpannableStringBuilder spannableStringBuilder, CharSequence charSequence2, boolean z10, CharSequence charSequence3, int i10, String str, int i11, boolean z11) {
        ?? r10;
        int i12;
        ?? ReplaceEmoji;
        ?? SubSequence;
        int iA;
        CharSequence charSequence4 = charSequence2;
        int iDp = i11 - AndroidUtilities.dp(16.0f);
        MessageObject messageObject = this.D0;
        if (messageObject != null && messageObject.type == 30) {
            iDp -= AndroidUtilities.dp(16.0f);
        }
        int i13 = iDp;
        if (charSequence != null) {
            MessageObject messageObject2 = this.D0;
            TextPaint textPaint = this.f25771s1;
            if (messageObject2 == null || messageObject2.type != 30) {
                textPaint.setTextSize(AndroidUtilities.dp(16.0f));
            } else {
                textPaint.setTextSize(AndroidUtilities.dp(14.0f));
            }
            SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(charSequence);
            spannableStringBuilderValueOf.setSpan(new k41(AndroidUtilities.bold()), 0, spannableStringBuilderValueOf.length(), 33);
            r10 = 0;
            this.X0 = new StaticLayout(spannableStringBuilderValueOf, textPaint, i13, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        } else {
            r10 = 0;
            this.X0 = null;
        }
        this.f25729a1 = null;
        if (spannableStringBuilder != null) {
            pz0 pz0Var = new pz0(spannableStringBuilder, 10.0f, null);
            this.Z0 = pz0Var;
            pz0Var.f31695a.linkColor = -1;
        } else {
            this.Z0 = null;
        }
        MessageObject messageObject3 = this.D0;
        TextPaint textPaint2 = this.f25773t1;
        if (messageObject3 != null && messageObject3.type == 35) {
            textPaint2.setTextSize(AndroidUtilities.dp(14.3f));
        } else if (messageObject3 == null || !(N() || (i12 = this.D0.type) == 30 || i12 == 18 || i12 == 31 || i12 == 37 || i12 == 33)) {
            textPaint2.setTextSize(AndroidUtilities.dp(15.0f));
        } else {
            textPaint2.setTextSize(AndroidUtilities.dp(13.0f));
        }
        int iDp2 = i13 - AndroidUtilities.dp(12.0f);
        MessageObject messageObject4 = this.D0;
        if (messageObject4 != null && messageObject4.type == 22 && messageObject4.getDialogId() >= 0 && (iA = lh.w3.a(charSequence4, textPaint2)) < iDp2 && iA > iDp2 / 5.0f) {
            iDp2 = iA;
        }
        if (charSequence4 == null) {
            ag.r rVar = this.f25746g1;
            if (rVar != null) {
                org.telegram.ui.Components.t5.release((v0) rVar.f633i, (org.telegram.ui.Components.p5) rVar.h);
                this.f25746g1 = null;
            }
            this.f25734c1 = r10;
        } else {
            if (this.f25746g1 == null) {
                this.f25746g1 = new ag.r(this);
            }
            try {
                ReplaceEmoji = Emoji.replaceEmoji(charSequence4, textPaint2.getFontMetricsInt(), r10);
            } catch (Exception unused) {
                ReplaceEmoji = charSequence4;
            }
            this.f25746g1.a(ReplaceEmoji, textPaint2, iDp2);
            if (!z10 || ((StaticLayout) this.f25746g1.f631f).getLineCount() <= 3) {
                this.f25734c1 = r10;
                this.f25740e1.f(true, true);
                this.f25737d1 = r10;
            } else {
                this.f25734c1 = !this.f25731b1;
                this.f25737d1 = ((StaticLayout) this.f25746g1.f631f).getLineBottom(2);
                this.f25754k1 = new pz0(LocaleController.getString(R.string.Gift2CaptionMore), textPaint2.getTextSize() / AndroidUtilities.density, AndroidUtilities.bold());
                int lineBottom = ((StaticLayout) this.f25746g1.f631f).getLineBottom(2);
                this.f25750i1 = lineBottom;
                this.f25752j1 = lineBottom - ((StaticLayout) this.f25746g1.f631f).getLineTop(2);
                this.f25748h1 = (int) ((StaticLayout) this.f25746g1.f631f).getLineRight(2);
            }
            if (this.f25734c1) {
                int lineEnd = ((StaticLayout) this.f25746g1.f631f).getLineEnd(2) - 1;
                ?? r11 = this.f25746g1;
                if (lineEnd >= 0) {
                    SubSequence = ReplaceEmoji;
                    SubSequence = ReplaceEmoji.subSequence(r10, lineEnd);
                }
                SubSequence = ReplaceEmoji;
                r11.a(SubSequence, textPaint2, iDp2);
            }
        }
        if (charSequence3 != null) {
            ?? ValueOf = SpannableStringBuilder.valueOf(charSequence3);
            ValueOf.setSpan(new k41(AndroidUtilities.bold()), r10, ValueOf.length(), 33);
            StaticLayout staticLayout = new StaticLayout(ValueOf, (TextPaint) H("paintChatActionText"), i13, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            this.l1 = staticLayout;
            this.f25756m1 = z11 && !this.f25734c1;
            this.f25768r1 = P(staticLayout);
        } else {
            this.l1 = null;
            this.f25756m1 = r10;
            this.f25768r1 = 0.0f;
        }
        if (str == null) {
            this.F1 = null;
            this.G1 = null;
            return;
        }
        if (this.E1 == null) {
            this.E1 = new CornerPathEffect(AndroidUtilities.dp(5.0f));
        }
        if (this.F1 == null) {
            Path path = new Path();
            this.F1 = path;
            gh.e2.c(path, 1.35f, r10);
        }
        pz0 pz0Var2 = new pz0(str, i10, AndroidUtilities.bold());
        this.G1 = pz0Var2;
        pz0Var2.f31708p = AndroidUtilities.dp(62.0f);
    }

    public final void x(int i10, CharSequence charSequence) {
        CharSequence charSequenceReplaceEmoji;
        t0 t0Var;
        TLRPC.Message message;
        MessageObject messageObject;
        int i11;
        int iDp = i10 - AndroidUtilities.dp(30.0f);
        if (this.f25739e0) {
            iDp -= AndroidUtilities.dp(64.0f);
        }
        if (M()) {
            iDp = Math.min(iDp - AndroidUtilities.dp(this.f25739e0 ? 28.0f : 82.0f), AndroidUtilities.dp(272.0f));
        }
        if (iDp < 0) {
            return;
        }
        int i12 = this.S1;
        if (i12 > 0) {
            iDp = Math.min(i12, iDp);
        }
        int i13 = iDp;
        this.R0 = true;
        TextPaint textPaint = (M() || ((messageObject = this.D0) != null && ((i11 = messageObject.type) == 34 || i11 == 35))) ? (TextPaint) H("paintChatActionText3") : (messageObject == null || !messageObject.drawServiceWithDefaultTypeface) ? (TextPaint) H("paintChatActionText") : (TextPaint) H("paintChatActionText2");
        textPaint.linkColor = textPaint.getColor();
        if (M()) {
            if (charSequence instanceof Spannable) {
                Spannable spannable = (Spannable) charSequence;
                for (Emoji.EmojiSpan emojiSpan : (Emoji.EmojiSpan[]) spannable.getSpans(0, spannable.length(), Emoji.EmojiSpan.class)) {
                    spannable.removeSpan(emojiSpan);
                }
            }
            charSequenceReplaceEmoji = Emoji.replaceEmoji(charSequence, textPaint.getFontMetricsInt(), false, null, 0, 0.85f, 0);
        } else {
            charSequenceReplaceEmoji = charSequence;
        }
        StaticLayout staticLayout = new StaticLayout(charSequenceReplaceEmoji, textPaint, i13, M() ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        CharSequence charSequence2 = charSequenceReplaceEmoji;
        this.I = staticLayout;
        this.L = null;
        MessageObject messageObject2 = this.D0;
        if (messageObject2 != null && (message = messageObject2.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
                TLRPC.TL_messageActionSuggestedPostApproval tL_messageActionSuggestedPostApproval = (TLRPC.TL_messageActionSuggestedPostApproval) messageAction;
                if (!tL_messageActionSuggestedPostApproval.rejected && !tL_messageActionSuggestedPostApproval.balance_too_low) {
                    this.L = new StaticLayout(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.getString(R.string.SuggestionAgreementReached)), textPaint.getFontMetricsInt(), false, null, 0, 1.0f, 0), textPaint, i13, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                }
            }
        }
        this.f25758n0 = org.telegram.ui.Components.t5.update(0, this, (!this.f25769s || (t0Var = this.T0) == null || t0Var.f()) ? false : true, this.f25758n0, this.I);
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
                    } catch (Exception e9) {
                        FileLog.e(e9);
                        return;
                    }
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        this.N = (i10 - this.J) / 2;
        int iDp2 = AndroidUtilities.dp(7.0f);
        this.O = iDp2;
        if (this.L != null) {
            this.O = org.telegram.messenger.y1.C(11.0f, this.M, iDp2);
        }
        this.P = (i10 - (M() ? this.J : this.I.getWidth())) / 2;
        this.Q = (i10 - i13) / 2;
        Stack stack = this.m0;
        ArrayList arrayList = this.f25755l0;
        stack.addAll(arrayList);
        arrayList.clear();
        if (charSequence2 instanceof Spannable) {
            StaticLayout staticLayout3 = this.I;
            int i15 = this.N;
            eh.k.a(this, staticLayout3, i15, i15 + this.J, (Spannable) charSequence2, stack, arrayList, null);
        }
    }

    public final void z(Canvas canvas, boolean z10) {
        Paint paint;
        Paint paint2;
        org.telegram.ui.ActionBar.c6 c6Var;
        float f10;
        float f11;
        float f12;
        float f13;
        v0 v0Var;
        Paint paint3;
        Paint paint4;
        int alpha;
        int alpha2;
        Canvas canvas2;
        int i10;
        ag.r rVar;
        RectF rectF;
        int iIntValue;
        float f14;
        float f15;
        int i11;
        v0 v0Var2 = this;
        if (!v0Var2.f25769s || ((!v0Var2.J() || z10) && (v0Var2.J() || !z10))) {
            Paint paintH = v0Var2.H("paintChatActionBackground");
            Paint paintH2 = v0Var2.H("paintChatActionBackgroundDarken");
            v0Var2.f25760o0 = (TextPaint) v0Var2.H("paintChatActionText");
            int i12 = v0Var2.H0;
            org.telegram.ui.ActionBar.c6 c6Var2 = v0Var2.U0;
            if (i12 >= 0) {
                int iV0 = org.telegram.ui.ActionBar.g6.v0(i12, c6Var2);
                if (v0Var2.J0 == null) {
                    Paint paint5 = new Paint(1);
                    v0Var2.J0 = paint5;
                    paint5.setColor(iV0);
                    TextPaint textPaint = new TextPaint(1);
                    v0Var2.K0 = textPaint;
                    textPaint.setTypeface(AndroidUtilities.bold());
                    v0Var2.K0.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
                    v0Var2.K0.setColor(org.telegram.ui.ActionBar.g6.v0(v0Var2.I0, c6Var2));
                }
                paintH = v0Var2.J0;
                v0Var2.f25760o0 = v0Var2.K0;
            }
            boolean z11 = v0Var2.R0;
            Path path = v0Var2.N0;
            if (z11) {
                v0Var2.R0 = false;
                v0Var2.O0 = v0Var2.getWidth();
                v0Var2.P0 = 0;
                ArrayList arrayList = v0Var2.L0;
                arrayList.clear();
                StaticLayout staticLayout = v0Var2.I;
                int lineCount = staticLayout == null ? 0 : staticLayout.getLineCount();
                int iDp = AndroidUtilities.dp(11.0f);
                f10 = 6.0f;
                int iDp2 = AndroidUtilities.dp(8.0f);
                int iF = 0;
                f11 = 8.0f;
                int i13 = 0;
                while (iF < lineCount) {
                    int iCeil = (int) Math.ceil(v0Var2.I.getLineWidth(iF));
                    if (iF != 0 && (i11 = i13 - iCeil) > 0 && i11 <= (iDp * 1.5f) + iDp2) {
                        iCeil = i13;
                    }
                    iF = i0.a.f(iCeil, iF, 1, arrayList);
                    i13 = iCeil;
                }
                f12 = 2.0f;
                f13 = 4.0f;
                for (int i14 = lineCount - 2; i14 >= 0; i14--) {
                    int iIntValue2 = ((Integer) arrayList.get(i14)).intValue();
                    int i15 = i13 - iIntValue2;
                    if (i15 <= 0 || i15 > (iDp * 1.5f) + iDp2) {
                        i13 = iIntValue2;
                    }
                    arrayList.set(i14, Integer.valueOf(i13));
                }
                int iDp3 = AndroidUtilities.dp(4.0f);
                int measuredWidth = v0Var2.getMeasuredWidth() / 2;
                int iDp4 = AndroidUtilities.dp(3.0f);
                int iDp5 = AndroidUtilities.dp(6.0f);
                int i16 = iDp - iDp4;
                ArrayList arrayList2 = v0Var2.M0;
                arrayList2.clear();
                path.reset();
                float f16 = measuredWidth;
                path.moveTo(f16, iDp3);
                int i17 = i13;
                int i18 = 0;
                int i19 = 0;
                while (true) {
                    rectF = v0Var2.Q0;
                    if (i19 >= lineCount) {
                        break;
                    }
                    int i20 = lineCount;
                    int iIntValue3 = ((Integer) arrayList.get(i19)).intValue();
                    int lineBottom = v0Var2.I.getLineBottom(i19);
                    int i21 = i20 - 1;
                    int iIntValue4 = i19 < i21 ? ((Integer) arrayList.get(i19 + 1)).intValue() : 0;
                    int iDp6 = lineBottom - i18;
                    if (i19 == 0 || iIntValue3 > i17) {
                        iDp6 = AndroidUtilities.dp(3.0f) + iDp6;
                    }
                    if (i19 == i21 || iIntValue3 > iIntValue4) {
                        iDp6 = AndroidUtilities.dp(3.0f) + iDp6;
                    }
                    Paint paint6 = paintH;
                    float f17 = (iIntValue3 / 2.0f) + f16;
                    int i22 = (i19 == i21 || iIntValue3 >= iIntValue4 || i19 == 0 || iIntValue3 >= i17) ? iDp2 : iDp5;
                    if (i19 == 0 || iIntValue3 > i17) {
                        f15 = f17;
                        rectF.set((f15 - iDp4) - iDp, iDp3, f15 + i16, (iDp * 2) + iDp3);
                        t();
                        path.arcTo(rectF, -90.0f, 90.0f);
                    } else {
                        f15 = f17;
                        if (iIntValue3 < i17) {
                            float f18 = f15 + i16;
                            int i23 = i22 * 2;
                            rectF.set(f18, iDp3, i23 + f18, i23 + iDp3);
                            t();
                            path.arcTo(rectF, -90.0f, -90.0f);
                        }
                    }
                    iDp3 += iDp6;
                    if (i19 != i21 && iIntValue3 < iIntValue4) {
                        iDp3 -= AndroidUtilities.dp(3.0f);
                        iDp6 -= AndroidUtilities.dp(3.0f);
                    }
                    if (i19 != 0 && iIntValue3 < i17) {
                        iDp3 -= AndroidUtilities.dp(3.0f);
                        iDp6 -= AndroidUtilities.dp(3.0f);
                    }
                    arrayList2.add(Integer.valueOf(iDp6));
                    if (i19 == i21 || iIntValue3 > iIntValue4) {
                        rectF.set((f15 - iDp4) - iDp, iDp3 - (iDp * 2), f15 + i16, iDp3);
                        t();
                        path.arcTo(rectF, 0.0f, 90.0f);
                    } else if (iIntValue3 < iIntValue4) {
                        float f19 = f15 + i16;
                        int i24 = i22 * 2;
                        rectF.set(f19, iDp3 - i24, i24 + f19, iDp3);
                        t();
                        path.arcTo(rectF, 180.0f, -90.0f);
                    }
                    i19++;
                    v0Var2 = this;
                    i17 = iIntValue3;
                    i18 = lineBottom;
                    lineCount = i20;
                    paintH2 = paintH2;
                    paintH = paint6;
                    c6Var2 = c6Var2;
                    arrayList = arrayList;
                }
                paint = paintH;
                paint2 = paintH2;
                ArrayList arrayList3 = arrayList;
                c6Var = c6Var2;
                int i25 = lineCount - 1;
                int i26 = i25;
                while (i26 >= 0) {
                    if (i26 != 0) {
                        arrayList3 = arrayList3;
                        iIntValue = ((Integer) arrayList3.get(i26 - 1)).intValue();
                    } else {
                        arrayList3 = arrayList3;
                        iIntValue = 0;
                    }
                    int iIntValue5 = ((Integer) arrayList3.get(i26)).intValue();
                    int iIntValue6 = i26 != i25 ? ((Integer) arrayList3.get(i26 + 1)).intValue() : 0;
                    this.I.getLineBottom(i26);
                    float f20 = measuredWidth - (iIntValue5 / 2);
                    int i27 = (i26 == i25 || iIntValue5 >= iIntValue6 || i26 == 0 || iIntValue5 >= iIntValue) ? iDp2 : iDp5;
                    if (i26 == i25 || iIntValue5 > iIntValue6) {
                        f14 = f20;
                        rectF.set(f14 - i16, iDp3 - (iDp * 2), f14 + iDp4 + iDp, iDp3);
                        t();
                        path.arcTo(rectF, 90.0f, 90.0f);
                    } else if (iIntValue5 < iIntValue6) {
                        float f21 = f20 - i16;
                        int i28 = i27 * 2;
                        f14 = f20;
                        rectF.set(f21 - i28, iDp3 - i28, f21, iDp3);
                        t();
                        path.arcTo(rectF, 90.0f, -90.0f);
                    } else {
                        f14 = f20;
                    }
                    iDp3 -= ((Integer) arrayList2.get(i26)).intValue();
                    if (i26 == 0 || iIntValue5 > iIntValue) {
                        rectF.set(f14 - i16, iDp3, f14 + iDp4 + iDp, (iDp * 2) + iDp3);
                        t();
                        path.arcTo(rectF, 180.0f, 90.0f);
                    } else if (iIntValue5 < iIntValue) {
                        float f22 = f14 - i16;
                        int i29 = i27 * 2;
                        rectF.set(f22 - i29, iDp3, f22, i29 + iDp3);
                        t();
                        path.arcTo(rectF, 0.0f, -90.0f);
                    }
                    i26--;
                }
                v0Var = this;
                path.close();
                if (v0Var.M() && !v0Var.N()) {
                    rectF.left = (f16 - (v0Var.J / 2.0f)) - AndroidUtilities.dp(17.0f);
                    rectF.top = iDp3;
                    rectF.right = (v0Var.J / 2.0f) + f16 + AndroidUtilities.dp(17.0f);
                    rectF.bottom = AndroidUtilities.dp(28.0f) + iDp3 + v0Var.K + v0Var.M;
                    path.reset();
                    path.addRoundRect(rectF, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), Path.Direction.CW);
                    path.close();
                }
            } else {
                paint = paintH;
                paint2 = paintH2;
                c6Var = c6Var2;
                f10 = 6.0f;
                f11 = 8.0f;
                f12 = 2.0f;
                f13 = 4.0f;
                v0Var = v0Var2;
            }
            if (!v0Var.f25770s0) {
                v0Var.f25767r0 = ((ViewGroup) v0Var.getParent()).getMeasuredHeight();
            }
            if (c6Var != null) {
                c6Var.m(v0Var.f25764q0, v0Var.f25762p0 + AndroidUtilities.dp(f13), v0Var.getMeasuredWidth(), v0Var.f25767r0);
            } else {
                org.telegram.ui.ActionBar.g6.q(v0Var.f25764q0, v0Var.f25762p0 + AndroidUtilities.dp(f13), v0Var.getMeasuredWidth(), v0Var.f25767r0);
            }
            if (!z10 || (v0Var.getAlpha() == 1.0f && !(v0Var instanceof tj))) {
                paint3 = paint2;
                paint4 = paint;
                boolean z12 = v0Var instanceof tj;
                if (z12) {
                    int alpha3 = paint4.getAlpha();
                    int alpha4 = paint3.getAlpha();
                    paint4.setAlpha((int) (alpha3 * (z12 ? 0.75f : 1.0f)));
                    paint3.setAlpha((int) (alpha4 * (z12 ? 0.75f : 1.0f)));
                    alpha = alpha3;
                    alpha2 = alpha4;
                } else {
                    alpha = -1;
                    alpha2 = -1;
                }
            } else {
                alpha = paint.getAlpha();
                alpha2 = paint2.getAlpha();
                boolean z13 = v0Var instanceof tj;
                paint4 = paint;
                paint4.setAlpha((int) (v0Var.getAlpha() * alpha * (z13 ? 0.75f : 1.0f)));
                float alpha5 = v0Var.getAlpha() * alpha2;
                float f23 = z13 ? 0.75f : 1.0f;
                paint3 = paint2;
                paint3.setAlpha((int) (alpha5 * f23));
            }
            MessageObject messageObject = v0Var.D0;
            if (messageObject == null || !messageObject.isRepostPreview) {
                canvas2 = canvas;
                canvas2.drawPath(path, paint4);
                if (v0Var.J() && paint3.getAlpha() > 0) {
                    canvas2.drawPath(path, paint3);
                }
                if (v0Var.O1 > 0.0f) {
                    Paint paint7 = v0Var.P1;
                    int alpha6 = paint7.getAlpha();
                    if (z10) {
                        paint7.setAlpha((int) (v0Var.getAlpha() * alpha6));
                    }
                    canvas2.drawPath(path, paint7);
                    paint7.setAlpha(alpha6);
                }
            } else {
                canvas2 = canvas;
            }
            MessageObject messageObject2 = v0Var.D0;
            hh.k5 k5Var = v0Var.B0;
            if (k5Var.d()) {
                float fDp = k5Var.Q.f48502e + AndroidUtilities.dp(f11);
                float width = (v0Var.getWidth() - fDp) / f12;
                float fDp2 = k5Var.f9594p ? 0.0f : AndroidUtilities.dp(12.0f) + v0Var.O + v0Var.K;
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(width, fDp2, fDp + width, k5Var.M + fDp2 + AndroidUtilities.dp(f11));
                if (v0Var.A1 == null) {
                    v0Var.A1 = new RectF();
                }
                v0Var.A1.set(rectF2);
                canvas2.drawRoundRect(v0Var.A1, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint4);
                if (v0Var.J()) {
                    canvas2.drawRoundRect(v0Var.A1, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint3);
                }
            } else if (v0Var.C0 != null) {
                float fDp3 = AndroidUtilities.dp(174.0f);
                qx0 qx0Var = v0Var.C0;
                qx0Var.getClass();
                float fDp4 = AndroidUtilities.dp(140.0f) + ((int) qx0Var.f31995f.j()) + (qx0Var.f31997i ? AndroidUtilities.dp(40.0f) : 0);
                float width2 = (v0Var.getWidth() - fDp3) / f12;
                if (v0Var.A1 == null) {
                    v0Var.A1 = new RectF();
                }
                v0Var.A1.set(width2, AndroidUtilities.dp(f13), fDp3 + width2, AndroidUtilities.dp(f13) + fDp4);
                canvas2.drawRoundRect(v0Var.A1, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint4);
                if (v0Var.J()) {
                    canvas2.drawRoundRect(v0Var.A1, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint3);
                }
            } else if (v0Var.L(messageObject2)) {
                float width3 = (v0Var.getWidth() - v0Var.W0) / f12;
                float f24 = v0Var.O + v0Var.K;
                if (v0Var.N()) {
                    float fDp5 = f24 + AndroidUtilities.dp(f13);
                    AndroidUtilities.rectTmp.set(width3, fDp5, v0Var.W0 + width3, v0Var.f25742f + fDp5);
                } else {
                    float fDp6 = f24 + AndroidUtilities.dp(12.0f);
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    float f25 = v0Var.W0;
                    rectF3.set(width3, fDp6, width3 + f25, f25 + fDp6 + v0Var.f25786y1);
                }
                if (messageObject2 != null && messageObject2.type == 18 && !v0Var.f25734c1 && (rVar = v0Var.f25746g1) != null && v0Var.f25737d1 > 0) {
                    RectF rectF4 = AndroidUtilities.rectTmp;
                    rectF4.bottom = pa.b(1.0f, v0Var.f25740e1.f34812c, ((StaticLayout) rVar.f631f).getHeight() - v0Var.f25737d1, rectF4.bottom);
                }
                if (v0Var.A1 == null) {
                    v0Var.A1 = new RectF();
                }
                v0Var.A1.set(AndroidUtilities.rectTmp);
                if (messageObject2 == null || (!((i10 = messageObject2.type) == 33 || i10 == 35) || v0Var.M1 == null)) {
                    canvas2.drawRoundRect(v0Var.A1, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), paint4);
                    if (v0Var.J()) {
                        canvas2.drawRoundRect(v0Var.A1, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), paint3);
                    }
                } else {
                    float fDp7 = AndroidUtilities.dp(16.0f);
                    float[] fArr = v0Var.U1;
                    Arrays.fill(fArr, fDp7);
                    float fDp8 = AndroidUtilities.dp(f10);
                    fArr[7] = fDp8;
                    fArr[6] = fDp8;
                    fArr[5] = fDp8;
                    fArr[4] = fDp8;
                    Path path2 = v0Var.T1;
                    path2.rewind();
                    path2.addRoundRect(v0Var.A1, fArr, Path.Direction.CW);
                    canvas2.drawPath(path2, paint4);
                    if (v0Var.J()) {
                        canvas2.drawPath(path2, paint3);
                    }
                }
            }
            if (alpha >= 0) {
                paint4.setAlpha(alpha);
                paint3.setAlpha(alpha2);
            }
        }
    }

    public v0(Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context);
        this.f25757n = new nc(this);
        int i10 = UserConfig.selectedAccount;
        this.D = i10;
        jh.h7 h7Var = new jh.h7(null, false);
        this.W = h7Var;
        this.f25749i0 = true;
        this.f25753k0 = new RectF();
        this.f25755l0 = new ArrayList();
        this.m0 = new Stack();
        this.f25785y0 = new ig.r0(this);
        this.H0 = -1;
        this.I0 = -1;
        this.L0 = new ArrayList();
        this.M0 = new ArrayList();
        this.N0 = new Path();
        this.Q0 = new RectF();
        this.R0 = true;
        this.S0 = false;
        this.f25731b1 = false;
        this.f25734c1 = false;
        this.f25740e1 = new org.telegram.ui.Components.y5(this, 0L, 320L, er.h);
        this.f25756m1 = true;
        TextPaint textPaint = new TextPaint(1);
        this.f25771s1 = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f25773t1 = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.f25775u1 = textPaint3;
        this.f25783x1 = new RadialProgress2(this, null);
        this.B1 = new ea(this, 2);
        this.I1 = new Path();
        this.L1 = new ArrayList();
        this.P1 = new Paint(1);
        this.T1 = new Path();
        this.U1 = new float[8];
        this.V1 = new float[8];
        this.W1 = new Path();
        this.X1 = new int[]{16842910, 16842919};
        this.f25741e2 = new u0(this);
        h7Var.f13391a = false;
        this.f25769s = z10;
        this.U0 = c6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.E = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.roundMessageSize / 2);
        this.H = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
        this.f25778w = DownloadController.getInstance(i10).generateObserverTag();
        this.B0 = new hh.k5(i10, this, c6Var);
        textPaint.setTextSize(TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics()));
        textPaint3.setTextSize(TypedValue.applyDimension(1, 15.0f, getResources().getDisplayMetrics()));
        textPaint2.setTextSize(TypedValue.applyDimension(1, 15.0f, getResources().getDisplayMetrics()));
        View view = new View(context);
        this.H1 = view;
        view.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.l1(0.1f, -16777216), 7, AndroidUtilities.dp(16.0f)));
        view.setVisibility(8);
        addView(view);
        ag.j3 j3Var = new ag.j3(10);
        this.J1 = j3Var;
        j3Var.N = 100;
        j3Var.J = false;
        j3Var.M = true;
        j3Var.G = false;
        j3Var.K = true;
        j3Var.H = true;
        j3Var.f514r = 1;
        j3Var.f518w = 0.98f;
        j3Var.v = 0.98f;
        j3Var.f517u = 0.98f;
        j3Var.f504g = false;
        j3Var.f511o = 0.0f;
        j3Var.f519x = 750L;
        j3Var.f520y = 750;
        j3Var.c();
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
