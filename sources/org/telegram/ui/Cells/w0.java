package org.telegram.ui.Cells;

import ai.md;
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
import org.telegram.ui.Components.ba0;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.bz0;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.f11;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.vj0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.y21;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.dg;
import org.telegram.ui.jm;
import org.telegram.ui.kg;
import org.telegram.ui.s10;
import org.telegram.ui.tf1;
import org.telegram.ui.wj;
public class w0 extends a0 implements DownloadController.FileDownloadProgressListener, NotificationCenter.NotificationCenterDelegate, n4 {
    public static final HashMap f23683s2;
    public float A0;
    public StaticLayout A1;
    public float B0;
    public float B1;
    public boolean C0;
    public StaticLayout C1;
    public boolean D0;
    public float D1;
    public boolean E;
    public final ah.j1 E0;
    public final TextPaint E1;
    public boolean F;
    public float F0;
    public final TextPaint F1;
    public boolean G;
    public float G0;
    public final TextPaint G1;
    public final int H;
    public ai.n7 H0;
    public TLRPC.Document H1;
    public final ImageReceiver I;
    public org.telegram.ui.Wallet.n3 I0;
    public TLRPC.VideoSize I1;
    public Drawable J;
    public boolean J0;
    public final RadialProgress2 J1;
    public Path K;
    public float K0;
    public int K1;
    public final org.telegram.ui.Components.h9 L;
    public float L0;
    public boolean L1;
    public StaticLayout M;
    public float M0;
    public RectF M1;
    public int N;
    public final RectF N0;
    public final ia N1;
    public int O;
    public bz0 O0;
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
    public yh.d1 S0;
    public f11 S1;
    public int T;
    public int T0;
    public final View T1;
    public int U;
    public int U0;
    public final Path U1;
    public int V;
    public Paint V0;
    public final sg.w1 V1;
    public boolean W;
    public TextPaint W0;
    public int W1;
    public final ArrayList X0;
    public final ArrayList X1;
    public final ArrayList Y0;
    public BotInlineKeyboard.Source Y1;
    public final Path Z0;
    public boolean Z1;
    public boolean f23684a0;
    public int f23685a1;
    public int a2;
    public RadialProgressView f23686b0;
    public int f23687b1;
    public float f23688b2;
    public float f23689c0;
    public final RectF f23690c1;
    public final Paint f23691c2;
    public final ci.y7 f23692d0;
    public boolean f23693d1;
    public boolean f23694d2;
    public boolean f23695e0;
    public boolean f23696e1;
    public View.OnClickListener f23697e2;
    public int f23698f;
    public boolean f23699f0;
    public t0 f23700f1;
    public int f23701f2;
    public boolean f23702g0;
    public final org.telegram.ui.ActionBar.d6 f23703g1;
    public final Path f23704g2;
    public int h;
    public boolean f23705h0;
    public int f23706h1;
    public final float[] f23707h2;
    public boolean f23708i0;
    public int f23709i1;
    public final float[] f23710i2;
    public int f23711j0;
    public StaticLayout f23712j1;
    public final Path f23713j2;
    public boolean f23714k0;
    public Paint f23715k1;
    public final int[] f23716k2;
    public int f23717l0;
    public f11 l1;
    public int f23718l2;
    public boolean m0;
    public StaticLayout f23719m1;
    public SpannableStringBuilder f23720m2;
    public final yc f23721n;
    public y21 f23722n0;
    public boolean f23723n1;
    public boolean f23724n2;
    public final RectF f23725o0;
    public boolean f23726o1;
    public Runnable f23727o2;
    public final ArrayList f23728p0;
    public int f23729p1;
    public PorterDuffColorFilter f23730p2;
    public final Stack f23731q0;
    public final org.telegram.ui.Components.f6 f23732q1;
    public int f23733q2;
    public ba0 f23734r;
    public org.telegram.ui.Components.w5 f23735r0;
    public s10 f23736r1;
    public final v0 f23737r2;
    public final boolean f23738s;
    public TextPaint f23739s0;
    public u0 f23740s1;
    public float f23741t0;
    public int f23742t1;
    public float f23743u0;
    public int f23744u1;
    public View v;
    public int f23745v0;
    public int f23746v1;
    public final int f23747w;
    public boolean f23748w0;
    public f11 f23749w1;
    public URLSpan f23750x;
    public ImageLocation f23751x0;
    public StaticLayout f23752x1;
    public wh.g f23753y;
    public float f23754y0;
    public boolean f23755y1;
    public float f23756z0;
    public TextPaint f23757z1;

    static {
        HashMap hashMap = new HashMap();
        f23683s2 = hashMap;
        i2.e.q(1, hashMap, "1⃣", 3, "2⃣");
        i2.e.q(6, hashMap, "3⃣", 12, "4⃣");
        hashMap.put(24, "5⃣");
    }

    public w0(Context context) {
        this(context, null, false);
    }

    public static float S(StaticLayout staticLayout) {
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
        sg.w1 w1Var = this.V1;
        if (z10 == w1Var.f46482g) {
            return;
        }
        w1Var.f46482g = z10;
        if (z10) {
            w1Var.R = System.currentTimeMillis();
            return;
        }
        for (int i10 = 0; i10 < w1Var.f46488n.size(); i10++) {
            sg.v1 v1Var = (sg.v1) w1Var.f46488n.get(i10);
            v1Var.f46457a = (System.currentTimeMillis() - w1Var.R) + v1Var.f46457a;
        }
        invalidate();
    }

    public static SpannableStringBuilder z(int i10, String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceArrows(str, false, AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(1.3f), 0.8f, i10));
        spannableStringBuilder.insert(0, (CharSequence) "*");
        spannableStringBuilder.setSpan(new p2(AndroidUtilities.dp(18.0f)), 0, 1, 33);
        if (Build.VERSION.SDK_INT >= 29) {
            android.support.v4.media.session.x.l();
            spannableStringBuilder.setSpan(android.support.v4.media.session.x.g(AndroidUtilities.dp(12.0f)), 0, spannableStringBuilder.length(), 33);
        }
        spannableStringBuilder.setSpan(new AlignmentSpan.Standard(Layout.Alignment.ALIGN_NORMAL), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public final void A(Canvas canvas, boolean z10) {
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
        float f14;
        float f15;
        float f16;
        int i12;
        u0 u0Var;
        int i13;
        float dp;
        org.telegram.ui.Wallet.n3 n3Var;
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
        org.telegram.ui.ActionBar.d6 d6Var2;
        int i22;
        int i23;
        int i24;
        w0 w0Var2 = this;
        if (!w0Var2.f23738s || ((!w0Var2.K() || z10) && (w0Var2.K() || !z10))) {
            Paint I = w0Var2.I("paintChatActionBackground");
            Paint I2 = w0Var2.I("paintChatActionBackgroundDarken");
            w0Var2.f23739s0 = (TextPaint) w0Var2.I("paintChatActionText");
            int i25 = w0Var2.T0;
            org.telegram.ui.ActionBar.d6 d6Var3 = w0Var2.f23703g1;
            if (i25 >= 0) {
                int w02 = org.telegram.ui.ActionBar.h6.w0(i25, d6Var3);
                if (w0Var2.V0 == null) {
                    Paint paint6 = new Paint(1);
                    w0Var2.V0 = paint6;
                    paint6.setColor(w02);
                    TextPaint textPaint = new TextPaint(1);
                    w0Var2.W0 = textPaint;
                    textPaint.setTypeface(AndroidUtilities.bold());
                    w0Var2.W0.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
                    w0Var2.W0.setColor(org.telegram.ui.ActionBar.h6.w0(w0Var2.U0, d6Var3));
                }
                I = w0Var2.V0;
                w0Var2.f23739s0 = w0Var2.W0;
            }
            boolean z11 = w0Var2.f23693d1;
            Path path = w0Var2.Z0;
            if (z11) {
                w0Var2.f23693d1 = false;
                w0Var2.f23685a1 = w0Var2.getWidth();
                w0Var2.f23687b1 = 0;
                ArrayList arrayList3 = w0Var2.X0;
                arrayList3.clear();
                StaticLayout staticLayout = w0Var2.M;
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
                    int ceil = (int) Math.ceil(w0Var2.M.getLineWidth(i26));
                    if (i26 != 0 && (i24 = i27 - ceil) > 0 && i24 <= (dp3 * 1.5f) + dp4) {
                        ceil = i27;
                    }
                    i26 = com.google.android.gms.internal.play_billing.k3.f(ceil, i26, 1, arrayList3);
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
                int measuredWidth = w0Var2.getMeasuredWidth() / 2;
                int dp6 = AndroidUtilities.dp(3.0f);
                int dp7 = AndroidUtilities.dp(6.0f);
                int i30 = dp3 - dp6;
                ArrayList arrayList4 = w0Var2.Y0;
                arrayList4.clear();
                path.reset();
                float f20 = measuredWidth;
                path.moveTo(f20, dp5);
                int i31 = i27;
                int i32 = 0;
                int i33 = 0;
                while (true) {
                    rectF = w0Var2.f23690c1;
                    if (i33 >= lineCount) {
                        break;
                    }
                    int i34 = lineCount;
                    int intValue2 = ((Integer) arrayList3.get(i33)).intValue();
                    int lineBottom = w0Var2.M.getLineBottom(i33);
                    int i35 = i34 - 1;
                    if (i33 < i35) {
                        paint5 = I2;
                        i20 = ((Integer) arrayList3.get(i33 + 1)).intValue();
                    } else {
                        paint5 = I2;
                        i20 = 0;
                    }
                    int i36 = lineBottom - i32;
                    if (i33 == 0 || intValue2 > i31) {
                        i36 = AndroidUtilities.dp(3.0f) + i36;
                    }
                    if (i33 == i35 || intValue2 > i20) {
                        i36 = AndroidUtilities.dp(3.0f) + i36;
                    }
                    Paint paint7 = I;
                    float f21 = (intValue2 / 2.0f) + f20;
                    if (i33 != i35 && intValue2 < i20 && i33 != 0 && intValue2 < i31) {
                        i21 = dp7;
                    } else {
                        i21 = dp4;
                    }
                    if (i33 == 0 || intValue2 > i31) {
                        f19 = f21;
                        arrayList2 = arrayList3;
                        d6Var2 = d6Var3;
                        rectF.set((f19 - dp6) - dp3, dp5, f19 + i30, (dp3 * 2) + dp5);
                        u();
                        path.arcTo(rectF, -90.0f, 90.0f);
                    } else {
                        f19 = f21;
                        if (intValue2 < i31) {
                            float f22 = f19 + i30;
                            d6Var2 = d6Var3;
                            arrayList2 = arrayList3;
                            rectF.set(f22, dp5, (i21 * 2) + f22, i23 + dp5);
                            u();
                            path.arcTo(rectF, -90.0f, -90.0f);
                        } else {
                            arrayList2 = arrayList3;
                            d6Var2 = d6Var3;
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
                            u();
                            path.arcTo(rectF, 180.0f, -90.0f);
                        }
                    } else {
                        rectF.set((f19 - dp6) - dp3, dp5 - (dp3 * 2), f19 + i30, dp5);
                        u();
                        path.arcTo(rectF, 0.0f, 90.0f);
                    }
                    i33++;
                    w0Var2 = this;
                    i31 = intValue2;
                    i32 = lineBottom;
                    lineCount = i34;
                    I2 = paint5;
                    I = paint7;
                    d6Var3 = d6Var2;
                    arrayList3 = arrayList2;
                }
                paint = I;
                paint2 = I2;
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
                        u();
                        path.arcTo(rectF, 90.0f, 90.0f);
                    } else if (intValue3 < i15) {
                        float f25 = f24 - i30;
                        arrayList5 = arrayList;
                        f18 = f24;
                        i17 = i16;
                        rectF.set(f25 - (i16 * 2), dp5 - i19, f25, dp5);
                        u();
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
                            u();
                            path.arcTo(rectF, 0.0f, -90.0f);
                        }
                    } else {
                        rectF.set(f18 - i30, dp5, f18 + dp6 + dp3, (dp3 * 2) + dp5);
                        u();
                        path.arcTo(rectF, 180.0f, 90.0f);
                    }
                }
                w0Var = this;
                path.close();
                if (w0Var.P() && !w0Var.Q()) {
                    rectF.left = (f20 - (w0Var.N / 2.0f)) - AndroidUtilities.dp(17.0f);
                    rectF.top = dp5;
                    rectF.right = (w0Var.N / 2.0f) + f20 + AndroidUtilities.dp(17.0f);
                    rectF.bottom = AndroidUtilities.dp(28.0f) + dp5 + w0Var.O + w0Var.Q;
                    path.reset();
                    path.addRoundRect(rectF, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), Path.Direction.CW);
                    path.close();
                }
            } else {
                paint = I;
                paint2 = I2;
                d6Var = d6Var3;
                f7 = 8.0f;
                f10 = 6.0f;
                f11 = 4.0f;
                f12 = 2.0f;
                w0Var = w0Var2;
            }
            if (!w0Var.f23748w0) {
                w0Var.f23745v0 = ((ViewGroup) w0Var.getParent()).getMeasuredHeight();
            }
            if (d6Var != null) {
                d6Var.d(w0Var.f23743u0, w0Var.f23741t0 + AndroidUtilities.dp(f11), w0Var.getMeasuredWidth(), w0Var.f23745v0);
            } else {
                org.telegram.ui.ActionBar.h6.q(w0Var.f23743u0, w0Var.f23741t0 + AndroidUtilities.dp(f11), w0Var.getMeasuredWidth(), w0Var.f23745v0);
            }
            float f27 = 0.75f;
            if (!z10 || (w0Var.getAlpha() == 1.0f && !(w0Var instanceof wj))) {
                paint3 = paint2;
                paint4 = paint;
                boolean z12 = w0Var instanceof wj;
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
                float alpha3 = w0Var.getAlpha() * i10;
                boolean z13 = w0Var instanceof wj;
                if (z13) {
                    f17 = 0.75f;
                } else {
                    f17 = 1.0f;
                }
                paint4 = paint;
                paint4.setAlpha((int) (alpha3 * f17));
                float alpha4 = w0Var.getAlpha() * i11;
                if (!z13) {
                    f27 = 1.0f;
                }
                paint3 = paint2;
                paint3.setAlpha((int) (alpha4 * f27));
            }
            MessageObject messageObject = w0Var.P0;
            Paint paint8 = w0Var.f23691c2;
            if (messageObject == null || !messageObject.isRepostPreview) {
                canvas2 = canvas;
                canvas2.drawPath(path, paint4);
                if (w0Var.K() && paint3.getAlpha() > 0) {
                    canvas2.drawPath(path, paint3);
                }
                if (w0Var.f23688b2 > 0.0f) {
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
            if (w0Var.M()) {
                int width = w0Var.getWidth();
                w0Var.I0.getClass();
                float dp8 = (width - AndroidUtilities.dp(206.0f)) / f12;
                float walletActionTop = w0Var.getWalletActionTop();
                w0Var.I0.getClass();
                float dp9 = AndroidUtilities.dp(206.0f) + dp8;
                if (w0Var.I0.f34587q0 == null) {
                    dp2 = AndroidUtilities.dp(140.0f);
                    f14 = 140.0f;
                    f15 = 20.0f;
                } else {
                    f14 = 140.0f;
                    f15 = 20.0f;
                    dp2 = AndroidUtilities.dp(150.0f) + ((int) Math.ceil(n3Var.f34587q0.j()));
                }
                RectF rectF2 = w0Var.N0;
                rectF2.set(dp8, walletActionTop, dp9, dp2 + walletActionTop);
                canvas2.save();
                w0Var.I0.c(canvas2, dp8, walletActionTop);
                canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(f15), AndroidUtilities.dp(f15), paint4);
                if (w0Var.K() && paint3.getAlpha() > 0) {
                    canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(f15), AndroidUtilities.dp(f15), paint3);
                }
                f16 = 0.0f;
                if (w0Var.f23688b2 > 0.0f) {
                    int alpha6 = paint8.getAlpha();
                    if (z10) {
                        paint8.setAlpha((int) (w0Var.getAlpha() * alpha6));
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
            MessageObject messageObject2 = w0Var.P0;
            if (w0Var.L()) {
                float dp10 = w0Var.H0.S.e + AndroidUtilities.dp(f7);
                float width2 = (w0Var.getWidth() - dp10) / f12;
                if (w0Var.H0.f1890p) {
                    dp = f16;
                } else {
                    dp = AndroidUtilities.dp(12.0f) + w0Var.S + w0Var.O;
                }
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(width2, dp, dp10 + width2, w0Var.H0.O + dp + AndroidUtilities.dp(f7));
                if (w0Var.M1 == null) {
                    w0Var.M1 = new RectF();
                }
                w0Var.M1.set(rectF3);
                canvas2.drawRoundRect(w0Var.M1, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint4);
                if (w0Var.K()) {
                    canvas2.drawRoundRect(w0Var.M1, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint3);
                }
            } else if (w0Var.O0 != null) {
                float dp11 = AndroidUtilities.dp(174.0f);
                bz0 bz0Var = w0Var.O0;
                bz0Var.getClass();
                int dp12 = AndroidUtilities.dp(f14) + ((int) bz0Var.f25065f.j());
                if (bz0Var.f25067i) {
                    i13 = AndroidUtilities.dp(40.0f);
                } else {
                    i13 = 0;
                }
                float f30 = dp12 + i13;
                float width3 = (w0Var.getWidth() - dp11) / f12;
                if (w0Var.M1 == null) {
                    w0Var.M1 = new RectF();
                }
                w0Var.M1.set(width3, AndroidUtilities.dp(f11), dp11 + width3, AndroidUtilities.dp(f11) + f30);
                canvas2.drawRoundRect(w0Var.M1, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint4);
                if (w0Var.K()) {
                    canvas2.drawRoundRect(w0Var.M1, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint3);
                }
            } else if (w0Var.O(messageObject2)) {
                float width4 = (w0Var.getWidth() - w0Var.f23709i1) / f12;
                float f31 = w0Var.S + w0Var.O;
                if (w0Var.Q()) {
                    float dp13 = f31 + AndroidUtilities.dp(f11);
                    AndroidUtilities.rectTmp.set(width4, dp13, w0Var.f23709i1 + width4, w0Var.f23698f + dp13);
                } else {
                    float dp14 = f31 + AndroidUtilities.dp(12.0f);
                    RectF rectF4 = AndroidUtilities.rectTmp;
                    float f32 = w0Var.f23709i1;
                    rectF4.set(width4, dp14, width4 + f32, f32 + dp14 + w0Var.K1);
                }
                if (messageObject2 != null && messageObject2.type == 18 && !w0Var.f23726o1 && (u0Var = w0Var.f23740s1) != null && w0Var.f23729p1 > 0) {
                    RectF rectF5 = AndroidUtilities.rectTmp;
                    rectF5.bottom = com.google.android.gms.internal.play_billing.k3.D(1.0f, w0Var.f23732q1.f26089c, ((StaticLayout) u0Var.f23217f).getHeight() - w0Var.f23729p1, rectF5.bottom);
                }
                if (w0Var.M1 == null) {
                    w0Var.M1 = new RectF();
                }
                w0Var.M1.set(AndroidUtilities.rectTmp);
                if (messageObject2 != null && (((i12 = messageObject2.type) == 33 || i12 == 35) && w0Var.Y1 != null)) {
                    float[] fArr = w0Var.f23707h2;
                    Arrays.fill(fArr, AndroidUtilities.dp(16.0f));
                    float dp15 = AndroidUtilities.dp(f10);
                    fArr[7] = dp15;
                    fArr[6] = dp15;
                    fArr[5] = dp15;
                    fArr[4] = dp15;
                    Path path2 = w0Var.f23704g2;
                    path2.rewind();
                    path2.addRoundRect(w0Var.M1, fArr, Path.Direction.CW);
                    canvas2.drawPath(path2, paint4);
                    if (w0Var.K()) {
                        canvas2.drawPath(path2, paint3);
                    }
                } else {
                    canvas2.drawRoundRect(w0Var.M1, AndroidUtilities.dp(f15), AndroidUtilities.dp(f15), paint4);
                    if (w0Var.K()) {
                        canvas2.drawRoundRect(w0Var.M1, AndroidUtilities.dp(f15), AndroidUtilities.dp(f15), paint3);
                    }
                }
            }
            if (i10 >= 0) {
                paint4.setAlpha(i10);
                paint3.setAlpha(i11);
            }
        }
    }

    public final void B(Canvas canvas) {
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
        canvas2.translate(this.f23711j0 / 2.0f, getPaddingTop());
        canvas2.save();
        canvas2.translate(this.T, this.S);
        StaticLayout staticLayout = this.M;
        org.telegram.ui.Components.w5 w5Var = this.f23735r0;
        if (staticLayout != null) {
            colorFilter = F(staticLayout.getPaint().getColor());
        } else {
            colorFilter = null;
        }
        org.telegram.ui.Components.a6.drawAnimatedEmojis(canvas2, staticLayout, w5Var, 0.0f, this.f23728p0, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
        canvas2.restore();
        float f13 = 4.0f;
        if (L()) {
            canvas2.save();
            ai.n7 n7Var = this.H0;
            float width = (getWidth() - n7Var.S.e) / 2.0f;
            if (n7Var.f1890p) {
                dp = AndroidUtilities.dp(4.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f) + this.S + this.O;
            }
            canvas2.translate(width, dp);
            this.H0.c(canvas2);
            canvas2.restore();
        }
        canvas2.restore();
        y21 y21Var = this.f23722n0;
        org.telegram.ui.ActionBar.d6 d6Var = this.f23703g1;
        if (y21Var != null) {
            float alpha = getAlpha();
            if (d6Var != null) {
                d6Var.d(this.f23743u0, this.f23741t0 + 0.0f, getMeasuredWidth(), this.f23745v0);
            } else {
                org.telegram.ui.ActionBar.h6.q(this.f23743u0, this.f23741t0 + 0.0f, getMeasuredWidth(), this.f23745v0);
            }
            this.f23722n0.c(canvas, getWidth(), this.f23711j0, 0.0f, 1.0f, alpha, this.m0);
            canvas2 = canvas;
        }
        ArrayList arrayList = this.X1;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (d6Var != null) {
                d6Var.d(this.f23743u0, this.f23741t0 + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.f23745v0);
            } else {
                org.telegram.ui.ActionBar.h6.q(this.f23743u0, this.f23741t0 + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.f23745v0);
            }
            float width2 = (getWidth() - this.f23709i1) / 2.0f;
            float dp2 = AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(4.0f) + this.S + this.O + this.f23698f;
            float dp3 = (this.f23709i1 - AndroidUtilities.dp(4.0f)) / 2.0f;
            int i13 = 0;
            while (i13 < arrayList.size()) {
                e0 e0Var = (e0) arrayList.get(i13);
                float a2 = e0Var.a();
                float dp4 = ((AndroidUtilities.dp(f13) + dp3) * i13) + width2;
                float f14 = dp4 + dp3;
                RectF rectF = this.f23690c1;
                rectF.set(dp4, dp2, f14, e0Var.f22162f + dp2);
                canvas2.save();
                if (a2 != 1.0f) {
                    f7 = f13;
                    canvas2.scale(a2, a2, rectF.centerX(), rectF.centerY());
                } else {
                    f7 = f13;
                }
                float[] fArr = this.f23710i2;
                Arrays.fill(fArr, AndroidUtilities.dp(Math.min(6.75f, SharedConfig.bubbleRadius)));
                if ((e0Var.f22163g & 9) == 9) {
                    float dp5 = AndroidUtilities.dp(SharedConfig.bubbleRadius);
                    fArr[7] = dp5;
                    fArr[6] = dp5;
                }
                if ((e0Var.f22163g & 10) == 10) {
                    float dp6 = AndroidUtilities.dp(SharedConfig.bubbleRadius);
                    fArr[5] = dp6;
                    fArr[4] = dp6;
                }
                Path path = this.f23713j2;
                path.rewind();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas2.drawPath(path, I("paintChatActionBackground"));
                if (K()) {
                    canvas2.drawPath(path, org.telegram.ui.ActionBar.h6.f21061h2);
                }
                canvas2.save();
                canvas2.clipPath(path);
                z zVar = e0Var.f22174s;
                if (zVar != null) {
                    int i14 = (int) dp2;
                    zVar.setBounds((int) dp4, i14, (int) f14, e0Var.f22162f + i14);
                    e0Var.f22174s.setAlpha(255);
                    e0Var.f22174s.draw(canvas2);
                }
                canvas2.restore();
                canvas2.save();
                if (e0Var.f22175t != null) {
                    i10 = AndroidUtilities.dp(26.0f);
                } else {
                    i10 = 0;
                }
                float l4 = e0Var.h.l();
                if (e0Var.f22175t != null) {
                    i11 = AndroidUtilities.dp(f7);
                } else {
                    i11 = 0;
                }
                float f15 = i10;
                float z10 = com.google.android.gms.internal.play_billing.k3.z(dp3 - (l4 + i11), f15, f12, dp4);
                Drawable drawable = e0Var.f22175t;
                if (drawable != null) {
                    int i15 = (int) z10;
                    f10 = f12;
                    drawable.setBounds(i15, (int) (((e0Var.f22162f - AndroidUtilities.dp(24.0f)) / f12) + dp2), AndroidUtilities.dp(24.0f) + i15, AndroidUtilities.dp(24.0f) + ((int) (((e0Var.f22162f - AndroidUtilities.dp(24.0f)) / f10) + dp2)));
                    Drawable drawable2 = e0Var.f22175t;
                    if (e0Var.f22168m) {
                        i12 = 128;
                    } else {
                        i12 = 255;
                    }
                    drawable2.setAlpha(i12);
                    e0Var.f22175t.draw(canvas2);
                    z10 += f15;
                } else {
                    f10 = f12;
                }
                e0Var.h.f26034p = Math.max(1, (((int) dp3) - AndroidUtilities.dp(15.0f)) - i10);
                f11 f11Var = e0Var.h;
                float dp7 = (AndroidUtilities.dp(40.0f) / f10) + dp2;
                if (e0Var.f22168m) {
                    f11 = 0.5f;
                } else {
                    f11 = 1.0f;
                }
                f11Var.f(canvas2, z10, dp7, f11);
                canvas2.restore();
                canvas2.restore();
                i13++;
                f13 = f7;
                f12 = f10;
            }
        }
    }

    public final void C(Canvas canvas, boolean z10) {
        if (this.f23738s) {
            if (!K() || z10) {
                if (!K() && z10) {
                    return;
                }
            } else {
                return;
            }
        }
        D(canvas, z10, null);
    }

    public final void D(Canvas canvas, boolean z10, Integer num) {
        float f7;
        Canvas canvas2;
        float f10 = 1.0f;
        if (z10) {
            f7 = getAlpha();
        } else {
            f7 = 1.0f;
        }
        if (f7 > 0.0f) {
            org.telegram.ui.ActionBar.d6 d6Var = this.f23703g1;
            if (d6Var != null) {
                d6Var.d(this.f23743u0, this.f23741t0 + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.f23745v0);
            } else {
                org.telegram.ui.ActionBar.h6.q(this.f23743u0, this.f23741t0 + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.f23745v0);
            }
            MessageObject messageObject = this.P0;
            if (messageObject != null && messageObject.shouldDrawReactions()) {
                ah.j1 j1Var = this.E0;
                boolean z11 = j1Var.f792b;
                v0 v0Var = this.f23737r2;
                if (!z11 || (v0Var.f23623b && j1Var.f799l)) {
                    j1Var.f791a = 1.0f;
                    int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
                    if (i10 < 0) {
                        canvas2 = canvas;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f7 * 255.0f), 31);
                    } else {
                        canvas2 = canvas;
                    }
                    if (v0Var.f23623b) {
                        f10 = v0Var.f23624c;
                    }
                    j1Var.d(canvas2, f10, num);
                    if (i10 < 0) {
                        canvas2.restore();
                    }
                }
            }
        }
    }

    public final void E(jm jmVar, Canvas canvas, int i10, Integer num, float f7) {
        ah.j1 j1Var = this.E0;
        if (!j1Var.f792b) {
            org.telegram.ui.ActionBar.d6 d6Var = this.f23703g1;
            if (d6Var != null) {
                d6Var.d(this.f23743u0, this.f23741t0 + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.f23745v0);
            } else {
                org.telegram.ui.ActionBar.h6.q(this.f23743u0, this.f23741t0 + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.f23745v0);
            }
            j1Var.D = f7;
            j1Var.f(jmVar, canvas, i10, num);
        }
    }

    public final ColorFilter F(int i10) {
        if (i10 != this.f23733q2 || this.f23730p2 == null) {
            this.f23733q2 = i10;
            this.f23730p2 = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        }
        return this.f23730p2;
    }

    public final int G(MessageObject messageObject) {
        int i10;
        int i11 = this.f23706h1;
        int i12 = messageObject.type;
        if (i12 == 37) {
            i11 = AndroidUtilities.dp(52.0f);
        } else if (i12 == 21 || Q()) {
            i11 = AndroidUtilities.dp(78.0f);
        }
        if (!P() && (i10 = messageObject.type) != 34 && i10 != 35) {
            return i11;
        }
        return 0;
    }

    public Paint I(String str) {
        Paint paint;
        org.telegram.ui.ActionBar.d6 d6Var = this.f23703g1;
        if (d6Var != null) {
            paint = d6Var.n(str);
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return org.telegram.ui.ActionBar.h6.T0(str);
    }

    public final float J(MessageObject messageObject) {
        MessagesController messagesController;
        String str;
        if (messageObject != null) {
            try {
                if (messageObject.type == 22 && (str = (messagesController = MessagesController.getInstance(this.H)).uploadingWallpaper) != null && TextUtils.equals(messageObject.messageOwner.action.wallpaper.uploadingImage, str)) {
                    return messagesController.uploadingWallpaperInfo.f20634r;
                }
                return 1.0f;
            } catch (Exception e) {
                FileLog.e(e);
                return 1.0f;
            }
        }
        return 1.0f;
    }

    public final boolean K() {
        if (this.V0 == null) {
            org.telegram.ui.ActionBar.d6 d6Var = this.f23703g1;
            if (d6Var != null) {
                if (d6Var.s()) {
                    return true;
                }
                return false;
            } else if (org.telegram.ui.ActionBar.h6.b1()) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public final boolean L() {
        ai.n7 n7Var = this.H0;
        if (n7Var != null && n7Var.P != null) {
            return true;
        }
        return false;
    }

    public final boolean M() {
        TLRPC.Message message;
        MessageObject messageObject = this.P0;
        if (messageObject != null && (message = messageObject.messageOwner) != null && (message.action instanceof TLRPC.TL_messageActionGramTransfer)) {
            return true;
        }
        return false;
    }

    public final void N() {
        t0 t0Var = this.f23700f1;
        if (t0Var != null && t0Var.e()) {
            super.invalidate();
        } else if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    public final boolean O(MessageObject messageObject) {
        if (messageObject != null) {
            int i10 = messageObject.type;
            if (i10 == 30 || i10 == 18 || i10 == 25 || Q()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean P() {
        TLRPC.Message message;
        MessageObject messageObject = this.P0;
        if (messageObject != null && (message = messageObject.messageOwner) != null && (message.action instanceof TLRPC.TL_messageActionSuggestedPostApproval)) {
            return true;
        }
        return false;
    }

    public final boolean Q() {
        MessageObject messageObject;
        int i10;
        if (!L() && this.O0 == null && (i10 = (messageObject = this.P0).type) != 31 && i10 != 37 && i10 != 33 && i10 != 35 && i10 != 34 && i10 != 21 && i10 != 22 && !messageObject.isStoryMention()) {
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

    public final boolean R() {
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

    public final void T(CharacterStyle characterStyle) {
        if (this.f23700f1 != null && (characterStyle instanceof URLSpan)) {
            String url = ((URLSpan) characterStyle).getURL();
            if (url.startsWith("task")) {
                this.f23700f1.g0(this, this.P0.getReplyMsgId(), Integer.parseInt(url.substring(5)));
                return;
            }
            if (url.startsWith("topic")) {
                URLSpan uRLSpan = this.f23750x;
                if (uRLSpan instanceof l61) {
                    TLObject tLObject = ((l61) uRLSpan).f28067c;
                    if (tLObject instanceof TLRPC.TL_forumTopic) {
                        og.d.m(this.f23700f1.L0(), -this.f23700f1.a(), (TLRPC.TL_forumTopic) tLObject, 0);
                        return;
                    }
                    return;
                }
            }
            if (url.startsWith("invite")) {
                URLSpan uRLSpan2 = this.f23750x;
                if (uRLSpan2 instanceof l61) {
                    TLObject tLObject2 = ((l61) uRLSpan2).f28067c;
                    if (tLObject2 instanceof TLRPC.TL_chatInviteExported) {
                        this.f23700f1.N0((TLRPC.TL_chatInviteExported) tLObject2);
                        return;
                    }
                    return;
                }
            }
            if (url.startsWith("game")) {
                this.f23700f1.X(this, this.P0.getReplyMsgId());
            } else if (url.startsWith("http")) {
                pf.d.r(getContext(), url);
            } else {
                this.f23700f1.s1(Long.parseLong(url));
            }
        }
    }

    public final void U() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = new TLRPC.TL_premiumGiftOption();
        MessageObject messageObject = this.P0;
        TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
        tL_premiumGiftOption.amount = messageAction.amount;
        tL_premiumGiftOption.months = messageAction.months;
        tL_premiumGiftOption.currency = messageAction.currency;
        String str = null;
        if (messageObject != null && (messageAction instanceof TLRPC.TL_messageActionGiftCode) && !R()) {
            str = ((TLRPC.TL_messageActionGiftCode) this.P0.messageOwner.action).slug;
        }
        if (this.f23700f1 != null) {
            AndroidUtilities.runOnUIThread(new ig.e2(this, tL_premiumGiftOption, str, 24));
        }
    }

    public final void V() {
        TLRPC.Message message;
        MessageObject messageObject = this.P0;
        if (messageObject != null && (message = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            boolean z10 = messageAction instanceof TLRPC.TL_messageActionGiftStars;
            ci.y7 y7Var = this.f23692d0;
            if (z10) {
                Context context = getContext();
                TLRPC.Message message2 = this.P0.messageOwner;
                int i10 = message2.date;
                TLRPC.Peer peer = message2.from_id;
                TLRPC.Peer peer2 = message2.peer_id;
                TLRPC.TL_messageActionGiftStars tL_messageActionGiftStars = (TLRPC.TL_messageActionGiftStars) message2.action;
                org.telegram.ui.ActionBar.d6 d6Var = y7Var.J;
                TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
                starsTransaction.title = null;
                starsTransaction.description = null;
                starsTransaction.photo = null;
                TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
                starsTransaction.peer = tL_starsTransactionPeer;
                tL_starsTransactionPeer.peer = peer;
                starsTransaction.date = i10;
                starsTransaction.amount = TL_stars.StarsAmount.ofStars(tL_messageActionGiftStars.stars);
                starsTransaction.f20505id = tL_messageActionGiftStars.transaction_id;
                starsTransaction.gift = true;
                starsTransaction.sent_by = peer;
                starsTransaction.received_by = peer2;
                md.i1(context, false, 0L, this.H, starsTransaction, d6Var);
            } else if (messageAction instanceof TLRPC.TL_messageActionPrizeStars) {
                Context context2 = getContext();
                TLRPC.Message message3 = this.P0.messageOwner;
                int i11 = message3.date;
                TLRPC.Peer peer3 = message3.from_id;
                TLRPC.Peer peer4 = message3.peer_id;
                TLRPC.TL_messageActionPrizeStars tL_messageActionPrizeStars = (TLRPC.TL_messageActionPrizeStars) message3.action;
                org.telegram.ui.ActionBar.d6 d6Var2 = y7Var.J;
                TL_stars.StarsTransaction starsTransaction2 = new TL_stars.StarsTransaction();
                starsTransaction2.title = null;
                starsTransaction2.description = null;
                starsTransaction2.photo = null;
                TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer2 = new TL_stars.TL_starsTransactionPeer();
                starsTransaction2.peer = tL_starsTransactionPeer2;
                tL_starsTransactionPeer2.peer = tL_messageActionPrizeStars.boost_peer;
                starsTransaction2.date = i11;
                starsTransaction2.amount = TL_stars.StarsAmount.ofStars(tL_messageActionPrizeStars.stars);
                starsTransaction2.f20505id = tL_messageActionPrizeStars.transaction_id;
                starsTransaction2.gift = true;
                starsTransaction2.flags |= 8192;
                starsTransaction2.giveaway_post_id = tL_messageActionPrizeStars.giveaway_msg_id;
                starsTransaction2.sent_by = peer3;
                starsTransaction2.received_by = peer4;
                md.i1(context2, false, 0L, this.H, starsTransaction2, d6Var2);
            } else if (messageAction instanceof TLRPC.TL_messageActionGiftTon) {
                Context context3 = getContext();
                TLRPC.Message message4 = this.P0.messageOwner;
                int i12 = message4.date;
                TLRPC.Peer peer5 = message4.from_id;
                TLRPC.Peer peer6 = message4.peer_id;
                TLRPC.TL_messageActionGiftTon tL_messageActionGiftTon = (TLRPC.TL_messageActionGiftTon) message4.action;
                org.telegram.ui.ActionBar.d6 d6Var3 = y7Var.J;
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
                starsTransaction3.f20505id = tL_messageActionGiftTon.transaction_id;
                starsTransaction3.gift = true;
                starsTransaction3.sent_by = peer5;
                starsTransaction3.received_by = peer6;
                md.i1(context3, false, 0L, this.H, starsTransaction3, d6Var3);
            } else if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                if (!((TLRPC.TL_messageActionStarGift) messageAction).forceIn) {
                    ai.l7 l7Var = new ai.l7(getContext(), this.H, this.P0.getDialogId(), this.f23703g1, null);
                    l7Var.L2(this.P0, null);
                    l7Var.show();
                }
            } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                if (((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift.burned) {
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != null) {
                        org.telegram.messenger.g0.q(R.string.UniqueGiftNotFoundBurned, xc.a0(U), R.raw.fire_on, 36);
                        return;
                    }
                    return;
                }
                ai.l7 l7Var2 = new ai.l7(getContext(), this.H, this.P0.getDialogId(), this.f23703g1, null);
                l7Var2.L2(this.P0, null);
                l7Var2.show();
            } else if (messageAction instanceof TLRPC.TL_messageActionSetChatTheme) {
                TLRPC.ChatTheme chatTheme = ((TLRPC.TL_messageActionSetChatTheme) messageAction).theme;
                if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                    TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        ai.l7 l7Var3 = new ai.l7(getContext(), this.H, this.P0.getDialogId(), this.f23703g1, null);
                        l7Var3.K2(starGift.slug, (TL_stars.TL_starGiftUnique) starGift, null);
                        l7Var3.show();
                    }
                }
            }
        }
    }

    public final boolean W(float f7, float f10, kg kgVar) {
        if (M() && !this.P0.isOutOwner() && !this.P0.messageOwner.premiumEffectWasPlayed) {
            float y3 = getY() + getPaddingTop() + getWalletActionTop();
            if (y3 >= f7 && y3 + AndroidUtilities.dp(140.0f) <= f10) {
                org.telegram.ui.Wallet.n3 n3Var = this.I0;
                vj0 vj0Var = n3Var.f34577l;
                if (n3Var.f34572i0 && n3Var.f34574j0 == null) {
                    n3Var.f34572i0 = false;
                    n3Var.f34576k0 = kgVar;
                    n3Var.K.d(0.0f, true);
                    n3Var.M = false;
                    n3Var.N = 0L;
                    n3Var.b();
                    n3Var.g();
                    n3Var.f34592t = 18.0f;
                    n3Var.f34594u.f();
                    vj0Var.T(0.0f, true);
                    vj0Var.start();
                    n3Var.H = true;
                    float f11 = n3Var.R;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    n3Var.f34574j0 = ofFloat;
                    ofFloat.setDuration(2400L);
                    n3Var.f34574j0.setInterpolator(bs.h);
                    n3Var.f34574j0.addUpdateListener(new dg(n3Var, f11, 5));
                    n3Var.f34574j0.addListener(new tf1(n3Var, 3));
                    n3Var.f34574j0.start();
                    n3Var.f34558a.invalidate();
                    this.P0.messageOwner.premiumEffectWasPlayed = true;
                    MessagesStorage.getInstance(this.H).updateMessageCustomParams(this.P0.getDialogId(), this.P0.messageOwner);
                    return true;
                }
            }
        }
        return false;
    }

    public final void X(int i10, boolean z10, boolean z11) {
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
                this.f23720m2 = null;
                b0(z11);
            }
        }
    }

    public final void Y(org.telegram.messenger.MessageObject r38, boolean r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.w0.Y(org.telegram.messenger.MessageObject, boolean):void");
    }

    public final void Z(int i10, int i11) {
        this.T0 = i10;
        this.U0 = i11;
    }

    @Override
    public final boolean a() {
        return false;
    }

    public final void a0(float f7, int i10) {
        this.f23748w0 = true;
        this.f23745v0 = i10;
        this.f23741t0 = f7;
        this.f23743u0 = 0.0f;
    }

    public final void b0(boolean z10) {
        if (getMeasuredWidth() != 0) {
            y(getMeasuredWidth(), this.R0);
            invalidate();
        }
        if (!this.C0) {
            if (z10) {
                AndroidUtilities.runOnUIThread(new p0(this, 5));
                return;
            } else {
                requestLayout();
                return;
            }
        }
        s();
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
                    Y(messageObject, true);
                }
            } else if (i10 == NotificationCenter.walletUpdate && M()) {
                this.f23720m2 = null;
                this.V = 0;
                requestLayout();
                invalidate();
            }
        } else {
            MessageObject messageObject2 = this.P0;
            if (messageObject2 != null) {
                Y(messageObject2, true);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.T1) {
            float a2 = this.f23721n.a(0.02f);
            canvas.save();
            canvas.scale(a2, a2, (view.getMeasuredWidth() / 2.0f) + view.getX(), (view.getMeasuredHeight() / 2.0f) + view.getY());
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void f(TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        t0 t0Var = this.f23700f1;
        if (t0Var != null) {
            t0Var.k2(this, reactionCount, z10, f7, f10);
        }
    }

    public ImageReceiver getAvatarImage() {
        return null;
    }

    @Override
    public int getBoundsLeft() {
        if (L()) {
            int width = ((int) (getWidth() - (this.H0.S.e + AndroidUtilities.dp(8.0f)))) / 2;
            if (this.H0.f1890p) {
                return width;
            }
            return Math.min(this.f23685a1, width);
        } else if (O(this.P0)) {
            return i2.e.C(getWidth(), this.f23709i1, 2, this.f23711j0 / 2);
        } else {
            int i10 = this.f23685a1;
            ImageReceiver imageReceiver = this.I;
            if (imageReceiver != null && imageReceiver.getVisible()) {
                i10 = Math.min((int) imageReceiver.getImageX(), i10);
            }
            return (this.f23711j0 / 2) + i10;
        }
    }

    @Override
    public int getBoundsRight() {
        int i10;
        int i11;
        if (L()) {
            int dp = ((int) ((this.H0.S.e + AndroidUtilities.dp(8.0f)) + getWidth())) / 2;
            if (this.H0.f1890p) {
                return dp;
            }
            return Math.max(this.f23687b1, dp);
        }
        if (O(this.P0)) {
            i10 = this.f23711j0 / 2;
            i11 = (getWidth() + this.f23709i1) / 2;
        } else {
            i10 = this.f23687b1;
            ImageReceiver imageReceiver = this.I;
            if (imageReceiver != null && imageReceiver.getVisible()) {
                i10 = Math.max((int) imageReceiver.getImageX2(), i10);
            }
            i11 = this.f23711j0 / 2;
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

    public t0 getDelegate() {
        return this.f23700f1;
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
        return this.f23747w;
    }

    public ImageReceiver getPhotoImage() {
        return this.I;
    }

    public ah.j1 getReactionsLayout() {
        return this.E0;
    }

    @Override
    public float getSlidingOffsetX() {
        return 0.0f;
    }

    public v0 getTransitionParams() {
        return this.f23737r2;
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
        Runnable runnable = this.f23727o2;
        if (runnable != null) {
            runnable.run();
        }
        if (!this.f23724n2 || getParent() == null) {
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
        t0 t0Var = this.f23700f1;
        if (t0Var != null) {
            return t0Var.h2(this, this.f23754y0, this.f23756z0);
        }
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        boolean z10;
        t0 t0Var;
        super.onAttachedToWindow();
        this.f23694d2 = true;
        this.I.onAttachedToWindow();
        setStarsPaused(false);
        if (this.f23738s && (t0Var = this.f23700f1) != null && !t0Var.e()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f23735r0 = org.telegram.ui.Components.a6.update(0, this, z10, this.f23735r0, this.M);
        u0 u0Var = this.f23740s1;
        if (u0Var != null) {
            u0Var.h = org.telegram.ui.Components.a6.update(0, (View) ((w0) u0Var.f23219i), false, (org.telegram.ui.Components.w5) u0Var.h, (StaticLayout) u0Var.f23217f);
        }
        int i10 = this.H;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.didUpdatePremiumGiftStickers);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.didUpdateTonGiftStickers);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starGiftsLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.diceStickersDidLoad);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.walletUpdate);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        MessageObject messageObject = this.P0;
        if (messageObject != null && messageObject.type == 21) {
            Y(messageObject, true);
        }
        ai.n7 n7Var = this.H0;
        if (n7Var != null) {
            n7Var.a();
        }
        ah.j1 j1Var = this.E0;
        ArrayList arrayList = j1Var.v;
        j1Var.G = true;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((ah.g1) arrayList.get(i11)).a();
        }
        y21 y21Var = this.f23722n0;
        if (y21Var != null) {
            y21Var.a();
        }
        bz0 bz0Var = this.O0;
        if (bz0Var != null) {
            bz0Var.d.R(bz0Var.f25063b);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f23694d2 = false;
        int i10 = this.H;
        DownloadController.getInstance(i10).removeLoadingFileObserver(this);
        this.I.onDetachedFromWindow();
        setStarsPaused(true);
        this.C0 = false;
        org.telegram.ui.Components.a6.release(this, this.f23735r0);
        u0 u0Var = this.f23740s1;
        if (u0Var != null) {
            org.telegram.ui.Components.a6.release((w0) u0Var.f23219i, (org.telegram.ui.Components.w5) u0Var.h);
        }
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.didUpdatePremiumGiftStickers);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.didUpdateTonGiftStickers);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starGiftsLoaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.diceStickersDidLoad);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.walletUpdate);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        this.f23692d0.g();
        this.f23737r2.f23622a = false;
        ai.n7 n7Var = this.H0;
        if (n7Var != null) {
            n7Var.R = false;
            n7Var.d.onDetachedFromWindow();
            n7Var.e.b();
            yh.j0 j0Var = n7Var.f1898y;
            j0Var.d.onDetachedFromWindow();
            org.telegram.ui.Components.a6.release((View) null, j0Var.f50323q);
            j0Var.f50323q = null;
        }
        this.E0.q();
        y21 y21Var = this.f23722n0;
        if (y21Var != null) {
            y21Var.b();
        }
        bz0 bz0Var = this.O0;
        if (bz0Var != null) {
            bz0Var.d.R(null);
        }
    }

    @Override
    public void onDraw(android.graphics.Canvas r40) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.w0.onDraw(android.graphics.Canvas):void");
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
        if (this.f23720m2 == null) {
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
            this.f23720m2 = spannableStringBuilder;
        }
        if (Build.VERSION.SDK_INT < 24) {
            accessibilityNodeInfo.setContentDescription(this.f23720m2.toString());
        } else {
            accessibilityNodeInfo.setText(this.f23720m2);
        }
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Wallet.m3 m3Var;
        RectF rectF = this.f23725o0;
        this.T1.layout((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        org.telegram.ui.Wallet.n3 n3Var = this.I0;
        if (n3Var == null) {
            m3Var = null;
        } else {
            m3Var = n3Var.f34579m;
        }
        if (m3Var != null) {
            m3Var.layout(0, 0, AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f));
        }
    }

    @Override
    public final void onMeasure(int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.w0.onMeasure(int, int):void");
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
            this.I.setImage(this.f23751x0, "g", ImageLocation.getForObject(photoSize, messageObject.photoThumbsObject), "50_50_b", this.L, 0L, null, messageObject, 1);
            DownloadController.getInstance(this.H).removeLoadingFileObserver(this);
        }
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.w0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void s() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.w0.s():void");
    }

    public void setCustomText(CharSequence charSequence) {
        this.R0 = charSequence;
        if (charSequence != null) {
            b0(false);
        }
    }

    public void setDelegate(t0 t0Var) {
        this.f23700f1 = t0Var;
    }

    public void setInvalidateColors(boolean z10) {
        if (this.f23696e1 == z10) {
            return;
        }
        this.f23696e1 = z10;
        invalidate();
    }

    public void setInvalidateListener(Runnable runnable) {
        this.f23727o2 = runnable;
    }

    public void setInvalidateWithParent(View view) {
        this.v = view;
    }

    public void setInvalidatesParent(boolean z10) {
        this.f23724n2 = z10;
    }

    public void setMessageObject(MessageObject messageObject) {
        Y(messageObject, false);
    }

    public void setOnActionClickListener(View.OnClickListener onClickListener) {
        this.f23697e2 = onClickListener;
    }

    public void setOverrideTextMaxWidth(int i10) {
        this.f23701f2 = i10;
    }

    public void setScrimReaction(Integer num) {
        this.E0.C = num;
    }

    public void setShowTopic(boolean z10) {
        if (this.m0 != z10) {
            this.m0 = z10;
            N();
            invalidate();
        }
    }

    public void setSpoilersSuppressed(boolean z10) {
        this.J0 = z10;
        org.telegram.ui.Wallet.n3 n3Var = this.I0;
        if (n3Var != null) {
            n3Var.n(z10);
        }
        ArrayList arrayList = this.f23728p0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((wh.g) obj).invalidateSelf();
        }
    }

    public void setWalletSlidingOffset(float f7) {
        setTranslationX((getTranslationX() - this.M0) + f7);
        this.M0 = f7;
    }

    public final boolean t(android.view.MotionEvent r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.w0.t(android.view.MotionEvent):boolean");
    }

    public final void u() {
        RectF rectF = this.f23690c1;
        this.f23685a1 = (int) Math.min(this.f23685a1, rectF.left);
        this.f23687b1 = (int) Math.max(this.f23687b1, rectF.right);
    }

    public final boolean v(float f7, int i10) {
        ah.j1 j1Var = this.E0;
        if (!j1Var.K) {
            return false;
        }
        float y3 = getY() + j1Var.d;
        if (y3 <= f7 || (y3 + j1Var.f802o) - AndroidUtilities.dp(16.0f) >= i10) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.J && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public final void w() {
        String str;
        String string;
        String formatPluralString;
        SpannableStringBuilder spannableStringBuilder;
        String formatString;
        int dp = this.f23709i1 - AndroidUtilities.dp(16.0f);
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
        valueOf.setSpan(new e61(AndroidUtilities.bold()), 0, valueOf.length(), 33);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        this.f23712j1 = new StaticLayout(valueOf, textPaint, dp, alignment, 1.1f, 0.0f, false);
        this.f23719m1 = null;
        this.l1 = null;
        u0 u0Var = this.f23740s1;
        if (u0Var != null) {
            org.telegram.ui.Components.a6.release((w0) u0Var.f23219i, (org.telegram.ui.Components.w5) u0Var.h);
        }
        u0 u0Var2 = new u0(this);
        this.f23740s1 = u0Var2;
        u0Var2.a(spannableStringBuilder, textPaint2, dp);
        SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(string2);
        valueOf2.setSpan(new e61(AndroidUtilities.bold()), 0, valueOf2.length(), 33);
        this.f23726o1 = false;
        this.f23729p1 = 0;
        this.f23749w1 = null;
        StaticLayout staticLayout = new StaticLayout(valueOf2, (TextPaint) I("paintChatActionText"), dp, alignment, 1.0f, 0.0f, false);
        this.f23752x1 = staticLayout;
        this.f23755y1 = true;
        this.D1 = S(staticLayout);
    }

    public final void x(CharSequence charSequence, SpannableStringBuilder spannableStringBuilder, CharSequence charSequence2, boolean z10, CharSequence charSequence3, int i10, String str, int i11, boolean z11) {
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
            valueOf.setSpan(new e61(AndroidUtilities.bold()), 0, valueOf.length(), 33);
            r42 = 0;
            this.f23712j1 = new StaticLayout(valueOf, textPaint, i13, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        } else {
            r42 = 0;
            this.f23712j1 = null;
        }
        this.f23719m1 = null;
        if (spannableStringBuilder != null) {
            f11 f11Var = new f11(spannableStringBuilder, 10.0f, null);
            this.l1 = f11Var;
            f11Var.f26022a.linkColor = -1;
        } else {
            this.l1 = null;
        }
        MessageObject messageObject3 = this.P0;
        TextPaint textPaint2 = this.F1;
        if (messageObject3 != null && messageObject3.type == 35) {
            textPaint2.setTextSize(AndroidUtilities.dp(14.3f));
        } else if (messageObject3 != null && (Q() || (i12 = this.P0.type) == 30 || i12 == 18 || i12 == 31 || i12 == 37 || i12 == 33)) {
            textPaint2.setTextSize(AndroidUtilities.dp(13.0f));
        } else {
            textPaint2.setTextSize(AndroidUtilities.dp(15.0f));
        }
        int dp2 = i13 - AndroidUtilities.dp(12.0f);
        MessageObject messageObject4 = this.P0;
        if (messageObject4 != null && messageObject4.type == 22 && messageObject4.getDialogId() >= 0 && (a2 = ei.x3.a(charSequence4, textPaint2)) < dp2 && a2 > dp2 / 5.0f) {
            dp2 = a2;
        }
        boolean z12 = true;
        if (charSequence4 == null) {
            u0 u0Var = this.f23740s1;
            if (u0Var != null) {
                org.telegram.ui.Components.a6.release((w0) u0Var.f23219i, (org.telegram.ui.Components.w5) u0Var.h);
                this.f23740s1 = null;
            }
            this.f23726o1 = r42;
        } else {
            if (this.f23740s1 == null) {
                this.f23740s1 = new u0(this);
            }
            try {
                charSequence4 = Emoji.replaceEmoji(charSequence4, textPaint2.getFontMetricsInt(), r42);
            } catch (Exception unused) {
            }
            this.f23740s1.a(charSequence4, textPaint2, dp2);
            if (z10 && ((StaticLayout) this.f23740s1.f23217f).getLineCount() > 3) {
                this.f23726o1 = !this.f23723n1;
                this.f23729p1 = ((StaticLayout) this.f23740s1.f23217f).getLineBottom(2);
                this.f23749w1 = new f11(LocaleController.getString(R.string.Gift2CaptionMore), textPaint2.getTextSize() / AndroidUtilities.density, AndroidUtilities.bold());
                int lineBottom = ((StaticLayout) this.f23740s1.f23217f).getLineBottom(2);
                this.f23744u1 = lineBottom;
                this.f23746v1 = lineBottom - ((StaticLayout) this.f23740s1.f23217f).getLineTop(2);
                this.f23742t1 = (int) ((StaticLayout) this.f23740s1.f23217f).getLineRight(2);
            } else {
                this.f23726o1 = r42;
                this.f23732q1.f(true, true);
                this.f23729p1 = r42;
            }
            if (this.f23726o1) {
                int lineEnd = ((StaticLayout) this.f23740s1.f23217f).getLineEnd(2) - 1;
                u0 u0Var2 = this.f23740s1;
                if (lineEnd >= 0) {
                    charSequence4 = charSequence4.subSequence(r42, lineEnd);
                }
                u0Var2.a(charSequence4, textPaint2, dp2);
            }
        }
        if (charSequence3 != null) {
            SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(charSequence3);
            valueOf2.setSpan(new e61(AndroidUtilities.bold()), r42, valueOf2.length(), 33);
            StaticLayout staticLayout = new StaticLayout(valueOf2, (TextPaint) I("paintChatActionText"), i13, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            this.f23752x1 = staticLayout;
            if (!z11 || this.f23726o1) {
                z12 = r42;
            }
            this.f23755y1 = z12;
            this.D1 = S(staticLayout);
        } else {
            this.f23752x1 = null;
            this.f23755y1 = r42;
            this.D1 = 0.0f;
        }
        if (str != null) {
            if (this.Q1 == null) {
                this.Q1 = new CornerPathEffect(AndroidUtilities.dp(5.0f));
            }
            if (this.R1 == null) {
                Path path = new Path();
                this.R1 = path;
                yh.j1.d(path, 1.35f, r42);
            }
            f11 f11Var2 = new f11(str, i10, AndroidUtilities.bold());
            this.S1 = f11Var2;
            f11Var2.f26034p = AndroidUtilities.dp(62.0f);
            return;
        }
        this.R1 = null;
        this.S1 = null;
    }

    public final void y(int i10, CharSequence charSequence) {
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
        if (this.f23708i0) {
            dp -= AndroidUtilities.dp(64.0f);
        }
        if (P()) {
            if (this.f23708i0) {
                f7 = 28.0f;
            } else {
                f7 = 82.0f;
            }
            dp = Math.min(dp - AndroidUtilities.dp(f7), AndroidUtilities.dp(272.0f));
        }
        if (dp >= 0) {
            int i12 = this.f23701f2;
            if (i12 > 0) {
                dp = Math.min(i12, dp);
            }
            int i13 = dp;
            this.f23693d1 = true;
            if (!P() && ((messageObject = this.P0) == null || ((i11 = messageObject.type) != 34 && i11 != 35))) {
                if (messageObject != null && messageObject.drawServiceWithDefaultTypeface) {
                    textPaint = (TextPaint) I("paintChatActionText2");
                } else {
                    textPaint = (TextPaint) I("paintChatActionText");
                }
            } else {
                textPaint = (TextPaint) I("paintChatActionText3");
            }
            TextPaint textPaint2 = textPaint;
            textPaint2.linkColor = textPaint2.getColor();
            if (P()) {
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
            if (P()) {
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
            if (this.f23738s && (t0Var = this.f23700f1) != null && !t0Var.e()) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f23735r0 = org.telegram.ui.Components.a6.update(0, this, z10, this.f23735r0, this.M);
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
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
            this.R = (i10 - this.N) / 2;
            int dp2 = AndroidUtilities.dp(7.0f);
            this.S = dp2;
            if (this.P != null) {
                this.S = org.telegram.messenger.g0.C(11.0f, this.Q, dp2);
            }
            if (P()) {
                width = this.N;
            } else {
                width = this.M.getWidth();
            }
            this.T = (i10 - width) / 2;
            this.U = (i10 - i13) / 2;
            Stack stack = this.f23731q0;
            ArrayList arrayList = this.f23728p0;
            stack.addAll(arrayList);
            arrayList.clear();
            if (charSequence3 instanceof Spannable) {
                StaticLayout staticLayout3 = this.M;
                int i15 = this.R;
                wh.g.a(this, staticLayout3, i15, i15 + this.N, (Spannable) charSequence3, stack, arrayList, null);
            }
        }
    }

    public w0(Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context);
        this.f23721n = new yc(this);
        int i10 = UserConfig.selectedAccount;
        this.H = i10;
        ci.y7 y7Var = new ci.y7(null, false);
        this.f23692d0 = y7Var;
        this.m0 = true;
        this.f23725o0 = new RectF();
        this.f23728p0 = new ArrayList();
        this.f23731q0 = new Stack();
        this.E0 = new ah.j1(this);
        this.N0 = new RectF();
        this.T0 = -1;
        this.U0 = -1;
        this.X0 = new ArrayList();
        this.Y0 = new ArrayList();
        this.Z0 = new Path();
        this.f23690c1 = new RectF();
        this.f23693d1 = true;
        this.f23696e1 = false;
        this.f23723n1 = false;
        this.f23726o1 = false;
        this.f23732q1 = new org.telegram.ui.Components.f6(this, 0L, 320L, bs.h);
        this.f23755y1 = true;
        TextPaint textPaint = new TextPaint(1);
        this.E1 = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.F1 = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.G1 = textPaint3;
        this.J1 = new RadialProgress2(this, null);
        this.N1 = new ia(this, 2);
        this.U1 = new Path();
        this.X1 = new ArrayList();
        this.a2 = -1;
        this.f23691c2 = new Paint(1);
        this.f23704g2 = new Path();
        this.f23707h2 = new float[8];
        this.f23710i2 = new float[8];
        this.f23713j2 = new Path();
        this.f23716k2 = new int[]{16842910, 16842919};
        this.f23737r2 = new v0(this);
        y7Var.f6209a = false;
        this.f23738s = z10;
        this.f23703g1 = d6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.I = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.roundMessageSize / 2);
        this.L = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        this.f23747w = DownloadController.getInstance(i10).generateObserverTag();
        textPaint.setTextSize(TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics()));
        textPaint3.setTextSize(TypedValue.applyDimension(1, 15.0f, getResources().getDisplayMetrics()));
        textPaint2.setTextSize(TypedValue.applyDimension(1, 15.0f, getResources().getDisplayMetrics()));
        View view = new View(context);
        this.T1 = view;
        view.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.m1(0.1f, -16777216), 7, AndroidUtilities.dp(16.0f)));
        view.setVisibility(8);
        addView(view);
        sg.w1 w1Var = new sg.w1(10);
        this.V1 = w1Var;
        w1Var.O = 100;
        w1Var.J = false;
        w1Var.M = true;
        w1Var.G = false;
        w1Var.K = true;
        w1Var.H = true;
        w1Var.f46492r = 1;
        w1Var.f46496w = 0.98f;
        w1Var.v = 0.98f;
        w1Var.f46495u = 0.98f;
        w1Var.f46482g = false;
        w1Var.f46489o = 0.0f;
        w1Var.f46497x = 750L;
        w1Var.f46498y = 750;
        w1Var.c();
    }

    @Override
    public final void invalidate(Rect rect) {
        super.invalidate(rect);
        View view = this.v;
        if (view != null) {
            view.invalidate();
        }
        if (!this.f23724n2 || getParent() == null) {
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
        if (!this.f23724n2 || getParent() == null) {
            return;
        }
        View view2 = (View) getParent();
        if (view2.getParent() != null) {
            view2.invalidate();
            ((View) view2.getParent()).invalidate();
        }
    }

    @Override
    public final void e(boolean z10, boolean z11) {
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
