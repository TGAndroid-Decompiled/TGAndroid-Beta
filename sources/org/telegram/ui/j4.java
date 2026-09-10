package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.IntEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import android.text.style.ReplacementSpan;
import android.text.style.URLSpan;
import android.util.Property;
import android.util.SparseArray;
import android.view.TextureView;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FileStreamLoadOperation;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class j4 extends t70 implements NotificationCenter.NotificationCenterDelegate {
    public static Paint B1;
    public static TextPaint f33881g1;
    public static TextPaint f33882h1;
    public static TextPaint f33883i1;
    public static TextPaint f33884j1;
    public static TextPaint f33885k1;
    public static TextPaint l1;
    public static TextPaint f33886m1;
    public static TextPaint f33887n1;
    public static Paint f33888o1;
    public static Paint f33889p1;
    public static Paint f33890q1;
    public static Paint f33891r1;
    public static Paint f33892s1;
    public static Paint f33893t1;
    public static Paint f33894u1;
    public static Paint f33895v1;
    public static Paint f33896w1;
    public static Paint f33897x1;
    public static Paint f33898y1;
    public static Paint f33899z1;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout A0;
    public TextView B0;
    public Rect C0;
    public org.telegram.ui.Components.o91 D0;
    public org.telegram.ui.Components.o91 E0;
    public int F0;
    public int G0;
    public int H0;
    public int I0;
    public final boolean J;
    public boolean J0;
    public final w3 K;
    public b3 K0;
    public Activity L;
    public b3 L0;
    public org.telegram.ui.ActionBar.p2 M;
    public nf.e M0;
    public final ArrayList N;
    public int N0;
    public View O;
    public org.telegram.ui.Cells.s9 O0;
    public FrameLayout P;
    public org.telegram.ui.Cells.s9 P0;
    public TextureView Q;
    public rv0 Q0;
    public m4 R;
    public final AnimationNotificationsLocker R0;
    public WebChromeClient.CustomViewCallback S;
    public final k0[] S0;
    public WindowInsets T;
    public boolean T0;
    public boolean U;
    public kb0 U0;
    public boolean V;
    public bi.g3 V0;
    public boolean W;
    public int W0;
    public int X;
    public ValueAnimator X0;
    public int Y;
    public float Y0;
    public int Z;
    public final org.telegram.ui.Components.g5 Z0;
    public Runnable f33900a0;
    public final org.telegram.ui.Components.g5 f33901a1;
    public long f33902b0;
    public final DecelerateInterpolator f33903c0;
    public final ArrayList f33904d0;
    public WindowManager.LayoutParams f33905e0;
    public ArticleViewer$WindowView f33906f0;
    public k0 f33907g0;
    public l0 f33908h0;
    public org.telegram.ui.web.l f33909i0;
    public b0 f33910j0;
    public org.telegram.ui.ActionBar.h3 f33911k0;
    public Paint f33912l0;
    public Drawable m0;
    public Paint f33913n0;
    public boolean f33914o0;
    public float f33915p0;
    public bi.l4 f33916q0;
    public ImageView f33917r0;
    public ImageView f33918s0;
    public org.telegram.ui.Components.o6 f33919t0;
    public n3[] f33920u0;
    public AnimatorSet f33921v0;
    public final Paint f33922w0;
    public final Paint f33923x0;
    public final Paint f33924y0;
    public final Paint f33925z0;
    public static final HashSet f33876b1 = new HashSet();
    public static volatile j4 f33877c1 = null;
    public static final t0 f33878d1 = new t0("innerTranslationX", 0);
    public static final TextPaint f33879e1 = new TextPaint(1);
    public static final r3 f33880f1 = new r3();
    public static final WeakHashMap A1 = new WeakHashMap();

    public j4() {
        this.N = new ArrayList();
        this.Y = 1;
        this.f33903c0 = new DecelerateInterpolator(1.5f);
        this.f33904d0 = new ArrayList();
        this.f33922w0 = new Paint();
        this.f33923x0 = new Paint();
        this.f33924y0 = new Paint();
        this.f33925z0 = new Paint();
        this.J0 = false;
        this.K0 = null;
        this.L0 = null;
        this.R0 = new AnimationNotificationsLocker(new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats});
        this.S0 = new k0[2];
        this.W0 = -1;
        b0 b0Var = new b0(this, 2);
        org.telegram.ui.Components.wr wrVar = org.telegram.ui.Components.wr.h;
        this.Z0 = new org.telegram.ui.Components.g5(b0Var, 320L, wrVar);
        this.f33901a1 = new org.telegram.ui.Components.g5(new b0(this, 4), 320L, wrVar);
        this.J = false;
        this.K = null;
    }

    public static TL_iv.RichText A(TL_iv.RichText richText) {
        if (richText == null) {
            return null;
        }
        if (richText instanceof TL_iv.textFixed) {
            return A(((TL_iv.textFixed) richText).text);
        }
        if (richText instanceof TL_iv.textItalic) {
            return A(((TL_iv.textItalic) richText).text);
        }
        if (richText instanceof TL_iv.textBold) {
            return A(((TL_iv.textBold) richText).text);
        }
        if (richText instanceof TL_iv.textUnderline) {
            return A(((TL_iv.textUnderline) richText).text);
        }
        if (richText instanceof TL_iv.textStrike) {
            return A(((TL_iv.textStrike) richText).text);
        }
        if (richText instanceof TL_iv.textEmail) {
            return A(((TL_iv.textEmail) richText).text);
        }
        if (richText instanceof TL_iv.textUrl) {
            return A(((TL_iv.textUrl) richText).text);
        }
        if (richText instanceof TL_iv.textAnchor) {
            A(((TL_iv.textAnchor) richText).text);
            return richText;
        } else if (richText instanceof TL_iv.textSubscript) {
            return A(((TL_iv.textSubscript) richText).text);
        } else {
            if (richText instanceof TL_iv.textSuperscript) {
                return A(((TL_iv.textSuperscript) richText).text);
            }
            if (richText instanceof TL_iv.textMarked) {
                return A(((TL_iv.textMarked) richText).text);
            }
            if (richText instanceof TL_iv.textPhone) {
                return A(((TL_iv.textPhone) richText).text);
            }
            if (richText instanceof TL_iv.textSpoiler) {
                return A(((TL_iv.textSpoiler) richText).text);
            }
            return richText;
        }
    }

    public static CharSequence B(TL_iv.RichText richText) {
        if (richText == null) {
            return "";
        }
        if (richText instanceof TL_iv.textFixed) {
            return B(((TL_iv.textFixed) richText).text);
        }
        if (richText instanceof TL_iv.textItalic) {
            return B(((TL_iv.textItalic) richText).text);
        }
        if (richText instanceof TL_iv.textBold) {
            return B(((TL_iv.textBold) richText).text);
        }
        if (richText instanceof TL_iv.textUnderline) {
            return B(((TL_iv.textUnderline) richText).text);
        }
        if (richText instanceof TL_iv.textStrike) {
            return B(((TL_iv.textStrike) richText).text);
        }
        if (richText instanceof TL_iv.textEmail) {
            return B(((TL_iv.textEmail) richText).text);
        }
        if (richText instanceof TL_iv.textUrl) {
            return B(((TL_iv.textUrl) richText).text);
        }
        if (richText instanceof TL_iv.textPlain) {
            return ((TL_iv.textPlain) richText).text;
        }
        if (richText instanceof TL_iv.textAnchor) {
            return B(((TL_iv.textAnchor) richText).text);
        }
        if (richText instanceof TL_iv.textEmpty) {
            return "";
        }
        if (richText instanceof TL_iv.textConcat) {
            StringBuilder sb2 = new StringBuilder();
            int size = richText.texts.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append(B(richText.texts.get(i10)));
            }
            return sb2;
        } else if (richText instanceof TL_iv.textSubscript) {
            return B(((TL_iv.textSubscript) richText).text);
        } else {
            if (richText instanceof TL_iv.textSuperscript) {
                return B(((TL_iv.textSuperscript) richText).text);
            }
            if (richText instanceof TL_iv.textMarked) {
                return B(((TL_iv.textMarked) richText).text);
            }
            if (!(richText instanceof TL_iv.textPhone)) {
                return "";
            }
            return B(((TL_iv.textPhone) richText).text);
        }
    }

    public static CharSequence C(t70 t70Var, TLRPC.WebPage webPage, View view, TL_iv.RichText richText, TL_iv.RichText richText2, TL_iv.PageBlock pageBlock, int i10) {
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.x01 x01Var;
        org.telegram.ui.Components.x01 x01Var2;
        TextPaint textPaint = null;
        if (richText2 == null) {
            return null;
        }
        if (richText2 instanceof TL_iv.textFixed) {
            return C(t70Var, webPage, view, richText, ((TL_iv.textFixed) richText2).text, pageBlock, i10);
        }
        if (richText2 instanceof TL_iv.textItalic) {
            return C(t70Var, webPage, view, richText, ((TL_iv.textItalic) richText2).text, pageBlock, i10);
        }
        if (richText2 instanceof TL_iv.textBold) {
            return C(t70Var, webPage, view, richText, ((TL_iv.textBold) richText2).text, pageBlock, i10);
        }
        if (richText2 instanceof TL_iv.textUnderline) {
            return C(t70Var, webPage, view, richText, ((TL_iv.textUnderline) richText2).text, pageBlock, i10);
        }
        if (richText2 instanceof TL_iv.textStrike) {
            return C(t70Var, webPage, view, richText, ((TL_iv.textStrike) richText2).text, pageBlock, i10);
        }
        if (richText2 instanceof TL_iv.textEmail) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C(t70Var, webPage, view, richText, ((TL_iv.textEmail) richText2).text, pageBlock, i10));
            MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), MetricAffectingSpan.class);
            if (spannableStringBuilder.length() != 0) {
                if (metricAffectingSpanArr == null || metricAffectingSpanArr.length == 0) {
                    textPaint = E(t70Var, richText, richText2, pageBlock);
                }
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.x01(textPaint, "mailto:" + F(richText2)), 0, spannableStringBuilder.length(), 33);
            }
            return spannableStringBuilder;
        }
        long j3 = 0;
        if (richText2 instanceof TL_iv.textUrl) {
            TL_iv.textUrl texturl = (TL_iv.textUrl) richText2;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(C(t70Var, webPage, view, richText, texturl.text, pageBlock, i10));
            MetricAffectingSpan[] metricAffectingSpanArr2 = (MetricAffectingSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), MetricAffectingSpan.class);
            if (metricAffectingSpanArr2 == null || metricAffectingSpanArr2.length == 0) {
                textPaint = E(t70Var, richText, richText2, pageBlock);
            }
            if (texturl.webpage_id != 0) {
                x01Var2 = new org.telegram.ui.Components.x01(textPaint, F(richText2));
            } else {
                x01Var2 = new org.telegram.ui.Components.x01(textPaint, F(richText2));
            }
            if (spannableStringBuilder2.length() != 0) {
                spannableStringBuilder2.setSpan(x01Var2, 0, spannableStringBuilder2.length(), 33);
            }
            return spannableStringBuilder2;
        } else if (richText2 instanceof TL_iv.textPlain) {
            return ((TL_iv.textPlain) richText2).text;
        } else {
            if (richText2 instanceof TL_iv.textAnchor) {
                TL_iv.textAnchor textanchor = (TL_iv.textAnchor) richText2;
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(C(t70Var, webPage, view, richText, textanchor.text, pageBlock, i10));
                String str = textanchor.name;
                ?? metricAffectingSpan = new MetricAffectingSpan();
                metricAffectingSpan.f22551a = str.toLowerCase();
                spannableStringBuilder3.setSpan(metricAffectingSpan, 0, spannableStringBuilder3.length(), 17);
                return spannableStringBuilder3;
            } else if (richText2 instanceof TL_iv.textEmpty) {
                return "";
            } else {
                if (richText2 instanceof TL_iv.textConcat) {
                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                    int size = richText2.texts.size();
                    int i11 = 0;
                    while (i11 < size) {
                        TL_iv.RichText richText3 = richText2.texts.get(i11);
                        TL_iv.RichText A = A(richText3);
                        if (i10 >= 0 && (richText3 instanceof TL_iv.textUrl) && ((TL_iv.textUrl) richText3).webpage_id != j3) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11 && spannableStringBuilder4.length() != 0 && spannableStringBuilder4.charAt(spannableStringBuilder4.length() - 1) != '\n') {
                            spannableStringBuilder4.append((CharSequence) " ");
                            spannableStringBuilder4.setSpan(new Object(), spannableStringBuilder4.length() - 1, spannableStringBuilder4.length(), 33);
                        }
                        CharSequence C = C(t70Var, webPage, view, richText, richText3, pageBlock, i10);
                        int D = D(A);
                        int length = spannableStringBuilder4.length();
                        spannableStringBuilder4.append(C);
                        if (D != 0 && !(C instanceof SpannableStringBuilder)) {
                            if ((D & 8) == 0 && (D & 512) == 0) {
                                if (length != spannableStringBuilder4.length()) {
                                    TextPaint E = E(t70Var, richText, A, pageBlock);
                                    ?? metricAffectingSpan2 = new MetricAffectingSpan();
                                    metricAffectingSpan2.f28620a = E;
                                    spannableStringBuilder4.setSpan(metricAffectingSpan2, length, spannableStringBuilder4.length(), 33);
                                }
                            } else {
                                String F = F(richText3);
                                if (F == null) {
                                    F = F(richText);
                                }
                                if ((D & 512) != 0) {
                                    x01Var = new org.telegram.ui.Components.x01(E(t70Var, richText, A, pageBlock), F);
                                } else {
                                    x01Var = new org.telegram.ui.Components.x01(E(t70Var, richText, A, pageBlock), F);
                                }
                                if (length != spannableStringBuilder4.length()) {
                                    spannableStringBuilder4.setSpan(x01Var, length, spannableStringBuilder4.length(), 33);
                                }
                            }
                        }
                        if (z11 && i11 != size - 1) {
                            spannableStringBuilder4.append((CharSequence) " ");
                            spannableStringBuilder4.setSpan(new Object(), spannableStringBuilder4.length() - 1, spannableStringBuilder4.length(), 33);
                        }
                        i11++;
                        j3 = 0;
                    }
                    return spannableStringBuilder4;
                } else if (richText2 instanceof TL_iv.textSubscript) {
                    return C(t70Var, webPage, view, richText, ((TL_iv.textSubscript) richText2).text, pageBlock, i10);
                } else {
                    if (richText2 instanceof TL_iv.textSuperscript) {
                        return C(t70Var, webPage, view, richText, ((TL_iv.textSuperscript) richText2).text, pageBlock, i10);
                    }
                    if (richText2 instanceof TL_iv.textMarked) {
                        SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(C(t70Var, webPage, view, richText, ((TL_iv.textMarked) richText2).text, pageBlock, i10));
                        MetricAffectingSpan[] metricAffectingSpanArr3 = (MetricAffectingSpan[]) spannableStringBuilder5.getSpans(0, spannableStringBuilder5.length(), MetricAffectingSpan.class);
                        if (spannableStringBuilder5.length() != 0) {
                            if (metricAffectingSpanArr3 == null || metricAffectingSpanArr3.length == 0) {
                                textPaint = E(t70Var, richText, richText2, pageBlock);
                            }
                            ?? metricAffectingSpan3 = new MetricAffectingSpan();
                            metricAffectingSpan3.f27780a = textPaint;
                            spannableStringBuilder5.setSpan(metricAffectingSpan3, 0, spannableStringBuilder5.length(), 33);
                        }
                        return spannableStringBuilder5;
                    } else if (richText2 instanceof TL_iv.textSpoiler) {
                        SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder(C(t70Var, webPage, view, richText, ((TL_iv.textSpoiler) richText2).text, pageBlock, i10));
                        if (spannableStringBuilder6.length() != 0) {
                            ?? obj = new Object();
                            obj.f21677a |= 256;
                            spannableStringBuilder6.setSpan(new org.telegram.ui.Components.c11(obj, 0), 0, spannableStringBuilder6.length(), 33);
                        }
                        return spannableStringBuilder6;
                    } else if (richText2 instanceof TL_iv.textPhone) {
                        SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder(C(t70Var, webPage, view, richText, ((TL_iv.textPhone) richText2).text, pageBlock, i10));
                        MetricAffectingSpan[] metricAffectingSpanArr4 = (MetricAffectingSpan[]) spannableStringBuilder7.getSpans(0, spannableStringBuilder7.length(), MetricAffectingSpan.class);
                        if (spannableStringBuilder7.length() != 0) {
                            if (metricAffectingSpanArr4 == null || metricAffectingSpanArr4.length == 0) {
                                textPaint = E(t70Var, richText, richText2, pageBlock);
                            }
                            spannableStringBuilder7.setSpan(new org.telegram.ui.Components.x01(textPaint, "tel:" + F(richText2)), 0, spannableStringBuilder7.length(), 33);
                        }
                        return spannableStringBuilder7;
                    } else {
                        if (richText2 instanceof TL_iv.textImage) {
                            TL_iv.textImage textimage = (TL_iv.textImage) richText2;
                            TLRPC.Document a2 = g4.a(webPage, textimage.document_id);
                            TLRPC.Photo e = g4.e(webPage, textimage.photo_id);
                            if (a2 != null) {
                                SpannableStringBuilder spannableStringBuilder8 = new SpannableStringBuilder("*");
                                int dp = AndroidUtilities.dp(textimage.f17422w);
                                int dp2 = AndroidUtilities.dp(textimage.h);
                                int abs = Math.abs(i10);
                                if (dp > abs) {
                                    dp2 = (int) (dp2 * (abs / dp));
                                    dp = abs;
                                }
                                if (view != null) {
                                    int i12 = org.telegram.ui.ActionBar.j6.f17928d6;
                                    ((j4) t70Var).getClass();
                                    if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.w0(null, i12, false)) <= 0.705f) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    ?? replacementSpan = new ReplacementSpan();
                                    Locale locale = Locale.US;
                                    String str2 = dp + "_" + dp2 + "_i";
                                    replacementSpan.f27542b = dp;
                                    replacementSpan.f27543c = dp2;
                                    boolean z12 = z10;
                                    ImageReceiver imageReceiver = new ImageReceiver(view);
                                    replacementSpan.f27541a = imageReceiver;
                                    imageReceiver.setInvalidateAll(true);
                                    if (z12) {
                                        imageReceiver.setDelegate(new org.telegram.ui.Components.gp0(8));
                                    }
                                    imageReceiver.setImage(ImageLocation.getForDocument(a2), str2, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(a2.thumbs, 90), a2), str2, -1L, null, webPage, 1);
                                    spannableStringBuilder8.setSpan(replacementSpan, 0, spannableStringBuilder8.length(), 33);
                                }
                                return spannableStringBuilder8;
                            } else if (e instanceof org.telegram.ui.web.j2) {
                                org.telegram.ui.web.j2 j2Var = (org.telegram.ui.web.j2) e;
                                SpannableStringBuilder spannableStringBuilder9 = new SpannableStringBuilder("*");
                                int dp3 = AndroidUtilities.dp(textimage.f17422w);
                                int dp4 = AndroidUtilities.dp(textimage.h);
                                int abs2 = Math.abs(i10);
                                if (dp3 > abs2) {
                                    dp4 = (int) (dp4 * (abs2 / dp3));
                                    dp3 = abs2;
                                }
                                if (view != null) {
                                    ?? replacementSpan2 = new ReplacementSpan();
                                    replacementSpan2.f27542b = dp3;
                                    replacementSpan2.f27543c = dp4;
                                    ImageReceiver imageReceiver2 = new ImageReceiver(view);
                                    replacementSpan2.f27541a = imageReceiver2;
                                    imageReceiver2.setInvalidateAll(true);
                                    org.telegram.ui.web.k2.g(j2Var, imageReceiver2, new org.telegram.ui.Components.c30(3));
                                    spannableStringBuilder9.setSpan(replacementSpan2, 0, spannableStringBuilder9.length(), 33);
                                }
                                return spannableStringBuilder9;
                            }
                        } else if (richText2 instanceof TL_iv.textMath) {
                            TL_iv.textMath textmath = (TL_iv.textMath) richText2;
                            if (textmath.bitmap == null && !textmath.tried) {
                                textmath.tried = true;
                                hi.t a10 = hi.t.a(textmath.source, AndroidUtilities.dp(20.0f), true);
                                if (a10 != null) {
                                    textmath.f17423w = a10.f9851b;
                                    textmath.h = a10.f9852c;
                                    textmath.depth = a10.d;
                                    textmath.bitmap = a10.f9850a;
                                }
                            }
                            if (textmath.bitmap == null) {
                                String str3 = textmath.source;
                                if (str3 != null) {
                                    return str3;
                                }
                            } else {
                                SpannableStringBuilder spannableStringBuilder10 = new SpannableStringBuilder("￼");
                                Bitmap bitmap = textmath.bitmap;
                                int i13 = textmath.f17423w;
                                int i14 = textmath.h;
                                int i15 = org.telegram.ui.ActionBar.j6.G6;
                                ((j4) t70Var).getClass();
                                spannableStringBuilder10.setSpan(new org.telegram.ui.Components.u01(view, bitmap, i13, i14, org.telegram.ui.ActionBar.j6.w0(null, i15, false), textmath.depth), 0, spannableStringBuilder10.length(), 33);
                                String str4 = textmath.source;
                                if (str4 != null && !str4.isEmpty()) {
                                    spannableStringBuilder10.setSpan(new org.telegram.ui.Cells.y9(textmath.source), 0, spannableStringBuilder10.length(), 33);
                                }
                                return spannableStringBuilder10;
                            }
                        } else {
                            return "not supported " + richText2;
                        }
                        return "";
                    }
                }
            }
        }
    }

    public static int D(TL_iv.RichText richText) {
        if (richText instanceof TL_iv.textFixed) {
            return D(richText.parentRichText) | 4;
        }
        if (richText instanceof TL_iv.textItalic) {
            return D(richText.parentRichText) | 2;
        }
        if (richText instanceof TL_iv.textBold) {
            return D(richText.parentRichText) | 1;
        }
        if (richText instanceof TL_iv.textUnderline) {
            return D(richText.parentRichText) | 16;
        }
        if (richText instanceof TL_iv.textStrike) {
            return D(richText.parentRichText) | 32;
        }
        if (richText instanceof TL_iv.textEmail) {
            return D(richText.parentRichText) | 8;
        }
        if (richText instanceof TL_iv.textPhone) {
            return D(richText.parentRichText) | 8;
        }
        if (richText instanceof TL_iv.textUrl) {
            if (((TL_iv.textUrl) richText).webpage_id != 0) {
                return D(richText.parentRichText) | 512;
            }
            return D(richText.parentRichText) | 8;
        } else if (richText instanceof TL_iv.textSubscript) {
            return D(richText.parentRichText) | 128;
        } else {
            if (richText instanceof TL_iv.textSuperscript) {
                return D(richText.parentRichText) | 256;
            }
            if (richText instanceof TL_iv.textMarked) {
                return D(richText.parentRichText) | 64;
            }
            if (richText != null) {
                return D(richText.parentRichText);
            }
            return 0;
        }
    }

    public static TextPaint E(t70 t70Var, TL_iv.RichText richText, TL_iv.RichText richText2, TL_iv.PageBlock pageBlock) {
        int b10;
        int dp;
        int dp2;
        int dp3;
        int dp4;
        int dp5;
        int dp6;
        int dp7;
        int D = D(richText2);
        int dp8 = AndroidUtilities.dp(14.0f);
        j4 j4Var = (j4) t70Var;
        j4Var.getClass();
        r3 r3Var = f33880f1;
        r3Var.getClass();
        SparseArray sparseArray = r3Var.f36199x;
        SparseArray sparseArray2 = r3Var.f36198w;
        SparseArray sparseArray3 = r3Var.f36196t;
        SparseArray sparseArray4 = r3Var.f36182c;
        SparseArray sparseArray5 = r3Var.f36181b;
        int dp9 = AndroidUtilities.dp(SharedConfig.ivFontSize - 16);
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            TL_iv.RichText richText3 = ((TL_iv.pageBlockPhoto) pageBlock).caption.text;
            if (richText3 != richText2 && richText3 != richText) {
                dp7 = AndroidUtilities.dp(12.0f);
            } else {
                dp7 = AndroidUtilities.dp(14.0f);
                sparseArray4 = sparseArray5;
            }
            dp8 = dp7;
            b10 = t70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockMap) {
            TL_iv.RichText richText4 = ((TL_iv.pageBlockMap) pageBlock).caption.text;
            if (richText4 != richText2 && richText4 != richText) {
                dp6 = AndroidUtilities.dp(12.0f);
            } else {
                dp6 = AndroidUtilities.dp(14.0f);
                sparseArray4 = sparseArray5;
            }
            dp8 = dp6;
            b10 = t70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockTitle) {
            sparseArray4 = r3Var.d;
            dp8 = AndroidUtilities.dp(23.0f);
            b10 = t70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockKicker) {
            sparseArray4 = r3Var.e;
            dp8 = AndroidUtilities.dp(14.0f);
            b10 = t70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockAuthorDate) {
            sparseArray4 = r3Var.f36191o;
            dp8 = AndroidUtilities.dp(14.0f);
            b10 = t70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockFooter) {
            sparseArray4 = r3Var.f36192p;
            dp8 = AndroidUtilities.dp(14.0f);
            b10 = t70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockSubtitle) {
            sparseArray4 = r3Var.f36184g;
            dp8 = AndroidUtilities.dp(20.0f);
            b10 = t70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeader) {
            sparseArray4 = r3Var.f36183f;
            dp8 = AndroidUtilities.dp(20.0f);
            b10 = t70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockSubheader) {
            sparseArray4 = r3Var.h;
            dp8 = AndroidUtilities.dp(17.0f);
            b10 = t70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading1) {
            sparseArray4 = r3Var.f36185i;
            dp8 = AndroidUtilities.dp(18.0f);
            b10 = t70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading2) {
            sparseArray4 = r3Var.f36186j;
            dp8 = AndroidUtilities.dp(16.0f);
            b10 = t70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading3) {
            sparseArray4 = r3Var.f36187k;
            dp8 = AndroidUtilities.dp(15.0f);
            b10 = t70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading4) {
            sparseArray4 = r3Var.f36188l;
            dp8 = AndroidUtilities.dp(14.0f);
            b10 = t70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading5) {
            sparseArray4 = r3Var.f36189m;
            dp8 = AndroidUtilities.dp(13.0f);
            b10 = t70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading6) {
            sparseArray4 = r3Var.f36190n;
            dp8 = AndroidUtilities.dp(12.0f);
            b10 = t70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) pageBlock;
            if (pageblockblockquote.text == richText) {
                dp8 = AndroidUtilities.dp(15.0f);
                b10 = t70Var.b();
                sparseArray4 = sparseArray3;
            } else {
                if (pageblockblockquote.caption == richText) {
                    dp8 = AndroidUtilities.dp(14.0f);
                    b10 = t70Var.a();
                    sparseArray3 = sparseArray5;
                    sparseArray4 = sparseArray3;
                }
                b10 = -65536;
                sparseArray3 = null;
                sparseArray4 = sparseArray3;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            TL_iv.pageBlockPullquote pageblockpullquote = (TL_iv.pageBlockPullquote) pageBlock;
            if (pageblockpullquote.text == richText) {
                dp8 = AndroidUtilities.dp(15.0f);
                b10 = t70Var.b();
                sparseArray4 = sparseArray3;
            } else {
                if (pageblockpullquote.caption == richText) {
                    dp8 = AndroidUtilities.dp(14.0f);
                    b10 = t70Var.a();
                    sparseArray3 = sparseArray5;
                    sparseArray4 = sparseArray3;
                }
                b10 = -65536;
                sparseArray3 = null;
                sparseArray4 = sparseArray3;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
            sparseArray4 = r3Var.f36195s;
            dp8 = AndroidUtilities.dp(14.0f);
            b10 = t70Var.b();
            D |= 4;
        } else if (pageBlock instanceof TL_iv.pageBlockParagraph) {
            sparseArray4 = r3Var.f36193q;
            dp8 = AndroidUtilities.dp(16.0f);
            b10 = t70Var.b();
        } else if (L(pageBlock)) {
            sparseArray4 = r3Var.f36194r;
            dp8 = AndroidUtilities.dp(16.0f);
            b10 = t70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockEmbed) {
            TL_iv.RichText richText5 = ((TL_iv.pageBlockEmbed) pageBlock).caption.text;
            if (richText5 != richText2 && richText5 != richText) {
                dp5 = AndroidUtilities.dp(12.0f);
            } else {
                dp5 = AndroidUtilities.dp(14.0f);
                sparseArray4 = sparseArray5;
            }
            dp8 = dp5;
            b10 = t70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
            TL_iv.RichText richText6 = ((TL_iv.pageBlockSlideshow) pageBlock).caption.text;
            if (richText6 != richText2 && richText6 != richText) {
                dp4 = AndroidUtilities.dp(12.0f);
            } else {
                dp4 = AndroidUtilities.dp(14.0f);
                sparseArray4 = sparseArray5;
            }
            dp8 = dp4;
            b10 = t70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockCollage) {
            TL_iv.RichText richText7 = ((TL_iv.pageBlockCollage) pageBlock).caption.text;
            if (richText7 != richText2 && richText7 != richText) {
                dp3 = AndroidUtilities.dp(12.0f);
            } else {
                dp3 = AndroidUtilities.dp(14.0f);
                sparseArray4 = sparseArray5;
            }
            dp8 = dp3;
            b10 = t70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockEmbedPost) {
            TL_iv.PageCaption pageCaption = ((TL_iv.pageBlockEmbedPost) pageBlock).caption;
            if (richText2 == pageCaption.text) {
                dp8 = AndroidUtilities.dp(14.0f);
                b10 = t70Var.a();
                sparseArray4 = sparseArray5;
            } else if (richText2 == pageCaption.credit) {
                dp8 = AndroidUtilities.dp(12.0f);
                b10 = t70Var.a();
            } else {
                if (richText2 != null) {
                    sparseArray4 = r3Var.f36197u;
                    dp8 = AndroidUtilities.dp(14.0f);
                    b10 = t70Var.b();
                }
                b10 = -65536;
                sparseArray4 = null;
            }
        } else {
            if (pageBlock instanceof TL_iv.pageBlockVideo) {
                if (richText2 == ((TL_iv.pageBlockVideo) pageBlock).caption.text) {
                    dp2 = AndroidUtilities.dp(14.0f);
                    sparseArray = sparseArray2;
                } else {
                    dp2 = AndroidUtilities.dp(12.0f);
                }
                dp8 = dp2;
                b10 = t70Var.b();
            } else if (pageBlock instanceof TL_iv.pageBlockAudio) {
                if (richText2 == ((TL_iv.pageBlockAudio) pageBlock).caption.text) {
                    dp = AndroidUtilities.dp(14.0f);
                    sparseArray = sparseArray2;
                } else {
                    dp = AndroidUtilities.dp(12.0f);
                }
                dp8 = dp;
                b10 = t70Var.b();
            } else if (pageBlock instanceof TL_iv.pageBlockRelatedArticles) {
                sparseArray4 = r3Var.f36200y;
                dp8 = AndroidUtilities.dp(15.0f);
                b10 = t70Var.a();
            } else if (pageBlock instanceof TL_iv.pageBlockDetails) {
                sparseArray4 = r3Var.f36201z;
                dp8 = AndroidUtilities.dp(15.0f);
                b10 = t70Var.b();
            } else {
                if (pageBlock instanceof TL_iv.pageBlockTable) {
                    sparseArray4 = r3Var.A;
                    dp8 = AndroidUtilities.dp(15.0f);
                    b10 = t70Var.b();
                }
                b10 = -65536;
                sparseArray4 = null;
            }
            sparseArray4 = sparseArray;
        }
        int i10 = D & 256;
        if (i10 != 0 || (D & 128) != 0) {
            dp8 -= AndroidUtilities.dp(4.0f);
        }
        if (sparseArray4 == null) {
            if (r3Var.f36180a == null) {
                TextPaint textPaint = new TextPaint(1);
                r3Var.f36180a = textPaint;
                textPaint.setColor(-65536);
            }
            r3Var.f36180a.setTextSize(AndroidUtilities.dp(14.0f));
            return r3Var.f36180a;
        }
        TextPaint textPaint2 = (TextPaint) sparseArray4.get(D);
        if (textPaint2 == null) {
            textPaint2 = new TextPaint(1);
            if ((D & 4) != 0) {
                textPaint2.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
            } else if (pageBlock instanceof TL_iv.pageBlockRelatedArticles) {
                textPaint2.setTypeface(AndroidUtilities.bold());
            } else if (t70Var.f36854a != 1 && !(pageBlock instanceof TL_iv.pageBlockTitle) && !(pageBlock instanceof TL_iv.pageBlockKicker) && !(pageBlock instanceof TL_iv.pageBlockHeader) && !(pageBlock instanceof TL_iv.pageBlockSubtitle) && !(pageBlock instanceof TL_iv.pageBlockSubheader) && !K(pageBlock)) {
                int i11 = D & 1;
                if (i11 != 0 && (D & 2) != 0) {
                    textPaint2.setTypeface(AndroidUtilities.getTypeface("fonts/rmediumitalic.ttf"));
                } else if (i11 != 0) {
                    textPaint2.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
                } else if ((D & 2) != 0) {
                    textPaint2.setTypeface(AndroidUtilities.getTypeface("fonts/ritalic.ttf"));
                }
            } else if (!(pageBlock instanceof TL_iv.pageBlockTitle) && !(pageBlock instanceof TL_iv.pageBlockHeader) && !(pageBlock instanceof TL_iv.pageBlockSubtitle) && !(pageBlock instanceof TL_iv.pageBlockSubheader) && !K(pageBlock)) {
                int i12 = D & 1;
                if (i12 != 0 && (D & 2) != 0) {
                    textPaint2.setTypeface(Typeface.create("serif", 3));
                } else if (i12 != 0) {
                    textPaint2.setTypeface(Typeface.create("serif", 1));
                } else if ((D & 2) != 0) {
                    textPaint2.setTypeface(Typeface.create("serif", 2));
                } else {
                    textPaint2.setTypeface(Typeface.create("serif", 0));
                }
            } else {
                textPaint2.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
            }
            if ((D & 32) != 0) {
                textPaint2.setFlags(textPaint2.getFlags() | 16);
            }
            if ((D & 16) != 0) {
                textPaint2.setFlags(textPaint2.getFlags() | 8);
            }
            if ((D & 8) != 0 || (D & 512) != 0) {
                textPaint2.setFlags(textPaint2.getFlags());
                j4Var.getClass();
                b10 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.J6, false);
            }
            if (i10 != 0) {
                textPaint2.baselineShift -= AndroidUtilities.dp(6.0f);
            } else if ((D & 128) != 0) {
                textPaint2.baselineShift = AndroidUtilities.dp(2.0f) + textPaint2.baselineShift;
            }
            textPaint2.setColor(b10);
            sparseArray4.put(D, textPaint2);
        }
        textPaint2.setTextSize(dp8 + dp9);
        return textPaint2;
    }

    public static String F(TL_iv.RichText richText) {
        if (richText instanceof TL_iv.textFixed) {
            return F(((TL_iv.textFixed) richText).text);
        }
        if (richText instanceof TL_iv.textItalic) {
            return F(((TL_iv.textItalic) richText).text);
        }
        if (richText instanceof TL_iv.textBold) {
            return F(((TL_iv.textBold) richText).text);
        }
        if (richText instanceof TL_iv.textUnderline) {
            return F(((TL_iv.textUnderline) richText).text);
        }
        if (richText instanceof TL_iv.textStrike) {
            return F(((TL_iv.textStrike) richText).text);
        }
        if (richText instanceof TL_iv.textEmail) {
            return ((TL_iv.textEmail) richText).email;
        }
        if (richText instanceof TL_iv.textUrl) {
            return ((TL_iv.textUrl) richText).url;
        }
        if (richText instanceof TL_iv.textPhone) {
            return ((TL_iv.textPhone) richText).phone;
        }
        return null;
    }

    public static boolean I() {
        if (f33877c1 != null) {
            return true;
        }
        return false;
    }

    public static boolean K(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockHeading1) && !(pageBlock instanceof TL_iv.pageBlockHeading2) && !(pageBlock instanceof TL_iv.pageBlockHeading3) && !(pageBlock instanceof TL_iv.pageBlockHeading4) && !(pageBlock instanceof TL_iv.pageBlockHeading5) && !(pageBlock instanceof TL_iv.pageBlockHeading6)) {
            return false;
        }
        return true;
    }

    public static boolean L(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof z3) && !(pageBlock instanceof b4)) {
            return false;
        }
        return true;
    }

    public static boolean O(x3 x3Var) {
        boolean z10;
        TL_iv.PageBlock z11 = z(x3Var.f38565a);
        if (z11 instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) z11;
            if (!pageblockdetails.open) {
                pageblockdetails.open = true;
                return true;
            }
        } else if (z11 instanceof x3) {
            x3 x3Var2 = (x3) z11;
            TL_iv.PageBlock z12 = z(x3Var2.f38566b);
            if (z12 instanceof TL_iv.pageBlockDetails) {
                TL_iv.pageBlockDetails pageblockdetails2 = (TL_iv.pageBlockDetails) z12;
                if (!pageblockdetails2.open) {
                    pageblockdetails2.open = true;
                    z10 = true;
                    if (!O(x3Var2) || z10) {
                        return true;
                    }
                }
            }
            z10 = false;
            if (!O(x3Var2)) {
            }
            return true;
        }
        return false;
    }

    public static void T(t70 t70Var) {
        if (t70Var.f36855b != null || t70Var.f36857f != null) {
            View view = t70Var.f36857f;
            t70Var.f36856c.d(true);
            t70Var.f36855b = null;
            t70Var.d = null;
            t70Var.f36857f = null;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public static WindowInsets e(WindowInsets windowInsets) {
        if (Build.VERSION.SDK_INT >= 30) {
            return WindowInsets.CONSUMED;
        }
        return windowInsets.consumeSystemWindowInsets();
    }

    public static void f(String str, int i10, FrameLayout frameLayout, w3 w3Var, org.telegram.ui.ActionBar.f6 f6Var) {
        String v = org.telegram.ui.web.c1.v(str);
        long clientUserId = UserConfig.getInstance(i10).getClientUserId();
        SendMessagesHelper.getInstance(i10).sendMessage(SendMessagesHelper.SendMessageParams.of(v, clientUserId));
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
        tL_message.peer_id = tL_peerUser;
        tL_peerUser.user_id = clientUserId;
        TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
        tL_message.from_id = tL_peerUser2;
        tL_peerUser2.user_id = clientUserId;
        tL_message.message = v;
        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
        tL_message.media = tL_messageMediaWebPage;
        tL_messageMediaWebPage.webpage = new TLRPC.TL_webPage();
        TLRPC.WebPage webPage = tL_message.media.webpage;
        webPage.url = v;
        webPage.display_url = v;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.bookmarkAdded, new MessageObject(i10, tL_message, false, false));
        new org.telegram.ui.Components.wc(frameLayout, f6Var).Q(R.raw.saved_messages, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.WebBookmarkedToast), new bi.va(w3Var, clientUserId, 13))).k(true);
    }

    public static void g0(j4 j4Var) {
        TextPaint textPaint = f33886m1;
        if (textPaint != null) {
            textPaint.setColor(j4Var.b());
        }
        TextPaint textPaint2 = f33887n1;
        if (textPaint2 != null) {
            textPaint2.setColor(j4Var.b());
        }
        TextPaint textPaint3 = f33881g1;
        if (textPaint3 != null) {
            textPaint3.setColor(j4Var.b());
        }
        TextPaint textPaint4 = f33883i1;
        if (textPaint4 != null) {
            textPaint4.setColor(j4Var.b());
        }
        TextPaint textPaint5 = f33884j1;
        if (textPaint5 != null) {
            textPaint5.setColor(-1);
        }
        TextPaint textPaint6 = f33885k1;
        if (textPaint6 != null) {
            textPaint6.setColor(j4Var.b());
        }
        TextPaint textPaint7 = l1;
        if (textPaint7 != null) {
            textPaint7.setColor(j4Var.a());
        }
        TextPaint textPaint8 = f33882h1;
        if (textPaint8 != null) {
            textPaint8.setColor(j4Var.a());
        }
        r(j4Var, true);
        r3 r3Var = f33880f1;
        r3.a(j4Var, r3Var.d);
        r3.a(j4Var, r3Var.e);
        r3.a(j4Var, r3Var.f36184g);
        r3.a(j4Var, r3Var.f36183f);
        r3.a(j4Var, r3Var.h);
        r3.a(j4Var, r3Var.f36185i);
        r3.a(j4Var, r3Var.f36186j);
        r3.a(j4Var, r3Var.f36187k);
        r3.a(j4Var, r3Var.f36188l);
        r3.a(j4Var, r3Var.f36189m);
        r3.a(j4Var, r3Var.f36190n);
        r3.a(j4Var, r3Var.f36196t);
        r3.a(j4Var, r3Var.f36195s);
        r3.a(j4Var, r3Var.f36193q);
        r3.a(j4Var, r3Var.f36194r);
        r3.a(j4Var, r3Var.f36197u);
        r3.a(j4Var, r3Var.f36198w);
        r3.a(j4Var, r3Var.f36199x);
        r3.a(j4Var, r3Var.f36181b);
        r3.a(j4Var, r3Var.f36182c);
        r3.a(j4Var, r3Var.f36191o);
        r3.a(j4Var, r3Var.f36192p);
        r3.a(j4Var, r3Var.v);
        r3.a(j4Var, r3Var.f36200y);
        r3.a(j4Var, r3Var.f36201z);
        r3.a(j4Var, r3Var.A);
    }

    public static SpannableStringBuilder i(int i10, CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (charSequence != null) {
            spannableStringBuilder.append(charSequence);
        }
        if (spannableStringBuilder.length() > 0) {
            spannableStringBuilder.append((CharSequence) ", ");
        }
        spannableStringBuilder.append((CharSequence) LocaleController.getString(i10));
        return spannableStringBuilder;
    }

    public static CharSequence j(t70 t70Var, h4 h4Var, c3 c3Var) {
        StaticLayout staticLayout;
        if (c3Var != null && (staticLayout = c3Var.d) != null) {
            SpannableStringBuilder spannableStringBuilder = c3Var.f31518y;
            if (spannableStringBuilder != null) {
                return spannableStringBuilder;
            }
            CharSequence text = staticLayout.getText();
            if (!(text instanceof Spannable)) {
                return text;
            }
            Spannable spannable = (Spannable) text;
            org.telegram.ui.Components.x01[] x01VarArr = (org.telegram.ui.Components.x01[]) spannable.getSpans(0, spannable.length(), org.telegram.ui.Components.x01.class);
            SpannableStringBuilder spannableStringBuilder2 = text;
            if (x01VarArr != null) {
                spannableStringBuilder2 = text;
                if (x01VarArr.length != 0) {
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannable);
                    for (org.telegram.ui.Components.x01 x01Var : x01VarArr) {
                        int spanStart = spannableStringBuilder3.getSpanStart(x01Var);
                        int spanEnd = spannableStringBuilder3.getSpanEnd(x01Var);
                        if (spanStart >= 0 && spanEnd > spanStart) {
                            spannableStringBuilder3.setSpan(new o0(t70Var, h4Var, x01Var, 0), spanStart, spanEnd, 33);
                        }
                    }
                    c3Var.f31518y = spannableStringBuilder3;
                    spannableStringBuilder2 = spannableStringBuilder3;
                }
            }
            return spannableStringBuilder2;
        }
        return null;
    }

    public static TL_iv.PageBlock j0(TL_iv.PageBlock pageBlock, x3 x3Var) {
        if (pageBlock instanceof z3) {
            z3 z3Var = (z3) pageBlock;
            z3 z3Var2 = new z3();
            z3Var2.f39195a = z3Var.f39195a;
            z3Var2.f39196b = z3Var.f39196b;
            z3Var2.f39197c = z3Var.f39197c;
            z3Var2.d = j0(z3Var.d, x3Var);
            return z3Var2;
        } else if (pageBlock instanceof b4) {
            b4 b4Var = (b4) pageBlock;
            b4 b4Var2 = new b4();
            b4Var2.f31150a = b4Var.f31150a;
            b4Var2.f31151b = b4Var.f31151b;
            b4Var2.f31152c = b4Var.f31152c;
            b4Var2.d = j0(b4Var.d, x3Var);
            return b4Var2;
        } else {
            return x3Var;
        }
    }

    public static boolean l(org.telegram.ui.t70 r25, org.telegram.ui.h4 r26, android.view.MotionEvent r27, android.view.View r28, org.telegram.ui.c3 r29, int r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j4.l(org.telegram.ui.t70, org.telegram.ui.h4, android.view.MotionEvent, android.view.View, org.telegram.ui.c3, int, int):boolean");
    }

    public static org.telegram.ui.c3 p(org.telegram.ui.t70 r20, android.view.View r21, java.lang.CharSequence r22, org.telegram.tgnet.tl.TL_iv.RichText r23, int r24, int r25, org.telegram.tgnet.tl.TL_iv.PageBlock r26, android.text.Layout.Alignment r27, int r28, org.telegram.ui.h4 r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j4.p(org.telegram.ui.t70, android.view.View, java.lang.CharSequence, org.telegram.tgnet.tl.TL_iv$RichText, int, int, org.telegram.tgnet.tl.TL_iv$PageBlock, android.text.Layout$Alignment, int, org.telegram.ui.h4):org.telegram.ui.c3");
    }

    public static c3 q(t70 t70Var, View view, CharSequence charSequence, TL_iv.RichText richText, int i10, int i11, TL_iv.PageBlock pageBlock, h4 h4Var) {
        return p(t70Var, view, charSequence, richText, i10, i11, pageBlock, Layout.Alignment.ALIGN_NORMAL, 0, h4Var);
    }

    public static void r(j4 j4Var, boolean z10) {
        int i10;
        if (f33890q1 == null) {
            f33890q1 = new Paint();
            f33889p1 = new Paint();
            Paint paint = new Paint(1);
            f33892s1 = paint;
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            f33892s1.setStrokeWidth(AndroidUtilities.dp(1.0f));
            Paint paint2 = new Paint();
            f33893t1 = paint2;
            paint2.setStyle(style);
            f33893t1.setStrokeWidth(AndroidUtilities.dp(1.0f) / 2.0f);
            f33894u1 = new Paint();
            f33895v1 = new Paint();
            f33896w1 = new Paint();
            f33897x1 = new Paint(1);
            f33898y1 = new Paint(1);
            f33888o1 = new Paint();
            f33891r1 = new Paint();
            f33899z1 = new Paint(1);
        } else if (!z10) {
            return;
        }
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false);
        float green = Color.green(w02) * 0.7152f;
        float y3 = com.google.android.gms.internal.vision.e2.y(Color.blue(w02), 0.0722f, green + (Color.red(w02) * 0.2126f), 255.0f);
        Paint paint3 = f33898y1;
        if (y3 <= 0.705f) {
            i10 = -3041234;
        } else {
            i10 = -6551;
        }
        paint3.setColor(i10);
        Paint paint4 = f33897x1;
        int i11 = org.telegram.ui.ActionBar.j6.K6;
        paint4.setColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false) & 872415231);
        f33897x1.setPathEffect(org.telegram.ui.Components.g90.c());
        f33896w1.setColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false) & 872415231);
        f33896w1.setPathEffect(org.telegram.ui.Components.g90.c());
        Paint paint5 = f33893t1;
        int i12 = org.telegram.ui.ActionBar.j6.f18055k6;
        paint5.setColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        f33892s1.setColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        f33888o1.setColor(251658240);
        f33891r1.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17929d7, false));
        f33899z1.setColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false) & 872415231);
        f33899z1.setPathEffect(org.telegram.ui.Components.g90.c());
        int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.M6, false);
        int red = Color.red(w03);
        int green2 = Color.green(w03);
        int blue = Color.blue(w03);
        f33895v1.setColor(Color.argb(20, red, green2, blue));
        f33894u1.setColor(Color.argb(34, red, green2, blue));
        int w04 = org.telegram.ui.ActionBar.j6.w0(null, i11, false);
        f33889p1.setColor(Color.argb(20, Color.red(w04), Color.green(w04), Color.blue(w04)));
        f33890q1.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Uc, false));
    }

    public static void u(Canvas canvas, t70 t70Var, TL_iv.PageBlock pageBlock, int i10) {
        int i11;
        if (pageBlock != null && t70Var != null && f33890q1 != null) {
            int i12 = 0;
            if (pageBlock.bottom) {
                i11 = AndroidUtilities.dp(6.0f);
            } else {
                i11 = 0;
            }
            int i13 = i10 - i11;
            int i14 = pageBlock.quoteLevels;
            if (i14 == 0) {
                if (pageBlock.level > 0) {
                    int dp = AndroidUtilities.dp(18);
                    canvas.drawRect(dp, 0.0f, AndroidUtilities.dp(2.0f) + dp, i13, f33890q1);
                    return;
                }
                return;
            }
            while (i14 != 0) {
                if ((i14 & 1) != 0) {
                    int dp2 = AndroidUtilities.dp((i12 * 14) + 18);
                    canvas.drawRect(dp2, 0.0f, AndroidUtilities.dp(2.0f) + dp2, i13, f33890q1);
                }
                i14 >>>= 1;
                i12++;
            }
        }
    }

    public static void v(org.telegram.ui.t70 r2, android.graphics.Canvas r3, org.telegram.ui.Cells.r9 r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j4.v(org.telegram.ui.t70, android.graphics.Canvas, org.telegram.ui.Cells.r9, int):void");
    }

    public static TL_iv.RichText w(int i10, TL_iv.PageBlock pageBlock) {
        if (i10 == 2) {
            TL_iv.RichText w10 = w(0, pageBlock);
            if (w10 instanceof TL_iv.textEmpty) {
                w10 = null;
            }
            TL_iv.RichText w11 = w(1, pageBlock);
            if (w11 instanceof TL_iv.textEmpty) {
                w11 = null;
            }
            if (w10 != null && w11 == null) {
                return w10;
            }
            if (w10 == null && w11 != null) {
                return w11;
            }
            if (w10 != null && w11 != null) {
                TL_iv.textPlain textplain = new TL_iv.textPlain();
                textplain.text = " ";
                TL_iv.textConcat textconcat = new TL_iv.textConcat();
                textconcat.texts.add(w10);
                textconcat.texts.add(textplain);
                textconcat.texts.add(w11);
                return textconcat;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockEmbedPost) {
            TL_iv.pageBlockEmbedPost pageblockembedpost = (TL_iv.pageBlockEmbedPost) pageBlock;
            if (i10 == 0) {
                return pageblockembedpost.caption.text;
            }
            if (i10 == 1) {
                return pageblockembedpost.caption.credit;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
            TL_iv.pageBlockSlideshow pageblockslideshow = (TL_iv.pageBlockSlideshow) pageBlock;
            if (i10 == 0) {
                return pageblockslideshow.caption.text;
            }
            if (i10 == 1) {
                return pageblockslideshow.caption.credit;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            TL_iv.pageBlockPhoto pageblockphoto = (TL_iv.pageBlockPhoto) pageBlock;
            if (i10 == 0) {
                return pageblockphoto.caption.text;
            }
            if (i10 == 1) {
                return pageblockphoto.caption.credit;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockCollage) {
            TL_iv.pageBlockCollage pageblockcollage = (TL_iv.pageBlockCollage) pageBlock;
            if (i10 == 0) {
                return pageblockcollage.caption.text;
            }
            if (i10 == 1) {
                return pageblockcollage.caption.credit;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockEmbed) {
            TL_iv.pageBlockEmbed pageblockembed = (TL_iv.pageBlockEmbed) pageBlock;
            if (i10 == 0) {
                return pageblockembed.caption.text;
            }
            if (i10 == 1) {
                return pageblockembed.caption.credit;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            return ((TL_iv.pageBlockBlockquote) pageBlock).caption;
        } else {
            if (pageBlock instanceof TL_iv.pageBlockVideo) {
                TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
                if (i10 == 0) {
                    return pageblockvideo.caption.text;
                }
                if (i10 == 1) {
                    return pageblockvideo.caption.credit;
                }
            } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                return ((TL_iv.pageBlockPullquote) pageBlock).caption;
            } else {
                if (pageBlock instanceof TL_iv.pageBlockAudio) {
                    TL_iv.pageBlockAudio pageblockaudio = (TL_iv.pageBlockAudio) pageBlock;
                    if (i10 == 0) {
                        return pageblockaudio.caption.text;
                    }
                    if (i10 == 1) {
                        return pageblockaudio.caption.credit;
                    }
                } else if (pageBlock instanceof TL_iv.pageBlockCover) {
                    return w(i10, ((TL_iv.pageBlockCover) pageBlock).cover);
                } else {
                    if (pageBlock instanceof TL_iv.pageBlockMap) {
                        TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock;
                        if (i10 == 0) {
                            return pageblockmap.caption.text;
                        }
                        if (i10 == 1) {
                            return pageblockmap.caption.credit;
                        }
                    }
                }
            }
        }
        return null;
    }

    public static j4 x() {
        j4 j4Var;
        j4 j4Var2 = f33877c1;
        if (j4Var2 == null) {
            synchronized (j4.class) {
                try {
                    j4Var = f33877c1;
                    if (j4Var == null) {
                        j4Var = new j4();
                        f33877c1 = j4Var;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return j4Var;
        }
        return j4Var2;
    }

    public static View y(View view) {
        org.telegram.ui.Components.fl0 fl0Var;
        if (view instanceof z1) {
            org.telegram.ui.Components.fl0 fl0Var2 = ((z1) view).d;
            if (fl0Var2 != null) {
                return y(fl0Var2.f41610a);
            }
            return view;
        } else if ((view instanceof c2) && (fl0Var = ((c2) view).d) != null) {
            return y(fl0Var.f41610a);
        } else {
            return view;
        }
    }

    public static TL_iv.PageBlock z(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof z3) {
            TL_iv.PageBlock pageBlock2 = ((z3) pageBlock).d;
            if (pageBlock2 != null) {
                return z(pageBlock2);
            }
            return pageBlock2;
        } else if (pageBlock instanceof b4) {
            TL_iv.PageBlock pageBlock3 = ((b4) pageBlock).d;
            if (pageBlock3 != null) {
                return z(pageBlock3);
            }
            return pageBlock3;
        } else {
            return pageBlock;
        }
    }

    public final void G() {
        int color;
        int w02;
        int w03;
        boolean z10;
        float x10;
        ArrayList arrayList = this.f33904d0;
        int size = arrayList.size();
        w3 w3Var = this.K;
        boolean z11 = false;
        if (size <= 1) {
            ArticleViewer$WindowView articleViewer$WindowView = this.f33906f0;
            articleViewer$WindowView.e = false;
            articleViewer$WindowView.d = false;
            k0 k0Var = this.f33907g0;
            if (w3Var != null) {
                x10 = w3Var.I * w3Var.f37687c.getWidth();
            } else {
                x10 = k0Var.getX();
            }
            AnimatorSet animatorSet = new AnimatorSet();
            float measuredWidth = k0Var.getMeasuredWidth() - x10;
            if (w3Var != null) {
                animatorSet.playTogether(w3Var.d(1.0f));
            } else {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.f33907g0, View.TRANSLATION_X, k0Var.getMeasuredWidth()), ObjectAnimator.ofFloat(this.f33906f0, f33878d1, k0Var.getMeasuredWidth()));
            }
            animatorSet.setDuration(Math.max((int) ((420.0f / k0Var.getMeasuredWidth()) * measuredWidth), 250));
            animatorSet.setInterpolator(org.telegram.ui.Components.wr.h);
            animatorSet.addListener(new v0(this));
            animatorSet.start();
            this.T0 = true;
            return;
        }
        ArticleViewer$WindowView articleViewer$WindowView2 = this.f33906f0;
        articleViewer$WindowView2.f18842f = true;
        articleViewer$WindowView2.e = true;
        articleViewer$WindowView2.h = this.I0;
        this.f33920u0[1].setVisibility(0);
        this.f33920u0[1].setAlpha(1.0f);
        this.f33920u0[1].setTranslationX(0.0f);
        n3 n3Var = this.f33920u0[0];
        if (w3Var == null) {
            color = 0;
        } else {
            color = this.f33912l0.getColor();
        }
        n3Var.setBackgroundColor(color);
        e0(-1, arrayList.get(arrayList.size() - 2), true);
        n3 n3Var2 = this.f33920u0[0];
        n3Var2.getX();
        AnimatorSet animatorSet2 = new AnimatorSet();
        n3Var2.getMeasuredWidth();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f33920u0[0], View.TRANSLATION_X, n3Var2.getMeasuredWidth()));
        animatorSet2.setDuration(420L);
        animatorSet2.setInterpolator(org.telegram.ui.Components.wr.h);
        animatorSet2.addListener(new w0(this));
        animatorSet2.start();
        l0 l0Var = this.f33908h0;
        n3 n3Var3 = this.f33920u0[0];
        if (n3Var3 != null && SharedConfig.adaptableColorInBrowser) {
            w02 = n3Var3.getBackgroundColor();
        } else {
            w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false);
        }
        l0Var.setMenuColors(w02);
        l0 l0Var2 = this.f33908h0;
        n3 n3Var4 = this.f33920u0[0];
        if (n3Var4 != null && SharedConfig.adaptableColorInBrowser) {
            w03 = n3Var4.getActionBarColor();
        } else {
            w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false);
        }
        l0Var2.d(w03, true);
        l0 l0Var3 = this.f33908h0;
        n3 n3Var5 = this.f33920u0[0];
        if (n3Var5 != null && n3Var5.e()) {
            z10 = true;
        } else {
            z10 = false;
        }
        l0Var3.setIsTonsite(z10);
        l0 l0Var4 = this.f33908h0;
        n3 n3Var6 = this.f33920u0[0];
        if (n3Var6 != null && n3Var6.d()) {
            z11 = true;
        }
        l0Var4.setIsLocal(z11);
        this.T0 = true;
    }

    public final void H(int i10) {
        int color;
        int w02;
        int w03;
        boolean z10;
        float x10;
        ArrayList arrayList = this.f33904d0;
        int size = arrayList.size();
        w3 w3Var = this.K;
        boolean z11 = false;
        if (size <= 1) {
            ArticleViewer$WindowView articleViewer$WindowView = this.f33906f0;
            articleViewer$WindowView.e = false;
            articleViewer$WindowView.d = false;
            k0 k0Var = this.f33907g0;
            if (w3Var != null) {
                x10 = w3Var.I * w3Var.f37687c.getWidth();
            } else {
                x10 = k0Var.getX();
            }
            AnimatorSet animatorSet = new AnimatorSet();
            float measuredWidth = k0Var.getMeasuredWidth() - x10;
            if (w3Var != null) {
                animatorSet.playTogether(w3Var.d(1.0f));
            } else {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.f33907g0, View.TRANSLATION_X, k0Var.getMeasuredWidth()), ObjectAnimator.ofFloat(this.f33906f0, f33878d1, k0Var.getMeasuredWidth()));
            }
            animatorSet.setDuration(Math.max((int) ((420.0f / k0Var.getMeasuredWidth()) * measuredWidth), 250));
            animatorSet.setInterpolator(org.telegram.ui.Components.wr.h);
            animatorSet.addListener(new x0(this));
            animatorSet.start();
            this.T0 = true;
            return;
        }
        this.f33906f0.f18842f = true;
        this.f33920u0[1].setVisibility(0);
        this.f33920u0[1].setAlpha(1.0f);
        this.f33920u0[1].setTranslationX(0.0f);
        n3 n3Var = this.f33920u0[0];
        if (w3Var == null) {
            color = 0;
        } else {
            color = this.f33912l0.getColor();
        }
        n3Var.setBackgroundColor(color);
        e0(-1, arrayList.get(i10), true);
        n3 n3Var2 = this.f33920u0[0];
        n3Var2.getX();
        AnimatorSet animatorSet2 = new AnimatorSet();
        n3Var2.getMeasuredWidth();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f33920u0[0], View.TRANSLATION_X, n3Var2.getMeasuredWidth()));
        animatorSet2.setDuration(420L);
        animatorSet2.setInterpolator(org.telegram.ui.Components.wr.h);
        animatorSet2.addListener(new y0(this, i10));
        animatorSet2.start();
        l0 l0Var = this.f33908h0;
        n3 n3Var3 = this.f33920u0[0];
        if (n3Var3 != null && SharedConfig.adaptableColorInBrowser) {
            w02 = n3Var3.getBackgroundColor();
        } else {
            w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false);
        }
        l0Var.setMenuColors(w02);
        l0 l0Var2 = this.f33908h0;
        n3 n3Var4 = this.f33920u0[0];
        if (n3Var4 != null && SharedConfig.adaptableColorInBrowser) {
            w03 = n3Var4.getActionBarColor();
        } else {
            w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false);
        }
        l0Var2.d(w03, true);
        l0 l0Var3 = this.f33908h0;
        n3 n3Var5 = this.f33920u0[0];
        if (n3Var5 != null && n3Var5.e()) {
            z10 = true;
        } else {
            z10 = false;
        }
        l0Var3.setIsTonsite(z10);
        l0 l0Var4 = this.f33908h0;
        n3 n3Var6 = this.f33920u0[0];
        if (n3Var6 != null && n3Var6.d()) {
            z11 = true;
        }
        l0Var4.setIsLocal(z11);
        this.T0 = true;
    }

    public final boolean J() {
        ArrayList arrayList = this.f33904d0;
        if (arrayList.size() <= 0 || !(arrayList.get(0) instanceof TLRPC.WebPage)) {
            return false;
        }
        return true;
    }

    public final void M() {
        this.V = false;
        int i10 = 0;
        while (true) {
            n3[] n3VarArr = this.f33920u0;
            if (i10 < n3VarArr.length) {
                n3VarArr[i10].b();
                i10++;
            } else {
                try {
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
        this.L.getWindow().clearFlags(128);
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.N;
            if (i11 < arrayList.size()) {
                ((u1) arrayList.get(i11)).a(false);
                i11++;
            } else {
                this.f33907g0.post(new b0(this, 0));
                NotificationCenter.getInstance(this.X).lambda$postNotificationNameOnUIThread$1(NotificationCenter.articleClosed, new Object[0]);
                return;
            }
        }
    }

    public final boolean N(MessageObject messageObject, TLRPC.WebPage webPage, String str, String str2) {
        TLRPC.WebPage webPage2;
        String str3;
        boolean z10;
        int lastIndexOf;
        boolean z11;
        ?? r52;
        String str4;
        int i10;
        String lowerCase;
        TL_iv.Page page;
        if (this.L == null) {
            return false;
        }
        w3 w3Var = this.K;
        if (w3Var == null && this.V) {
            return false;
        }
        org.telegram.ui.ActionBar.p2 p2Var = this.M;
        if (p2Var != null && (p2Var.getParentLayout() instanceof ActionBarLayout)) {
            AndroidUtilities.hideKeyboard((ActionBarLayout) this.M.getParentLayout());
        }
        if (messageObject != null) {
            if (webPage == null) {
                webPage2 = messageObject.messageOwner.media.webpage;
            } else {
                webPage2 = webPage;
            }
            if (webPage2 != null && (page = webPage2.cached_page) != null && page.local != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            for (int i11 = 0; i11 < messageObject.messageOwner.entities.size(); i11++) {
                TLRPC.MessageEntity messageEntity = messageObject.messageOwner.entities.get(i11);
                if (messageEntity instanceof TLRPC.TL_messageEntityUrl) {
                    try {
                        String str5 = messageObject.messageOwner.message;
                        int i12 = messageEntity.offset;
                        String lowerCase2 = str5.substring(i12, messageEntity.length + i12).toLowerCase();
                        if (!TextUtils.isEmpty(webPage2.cached_page.url)) {
                            lowerCase = webPage2.cached_page.url.toLowerCase();
                        } else {
                            lowerCase = webPage2.url.toLowerCase();
                        }
                        if (lowerCase2.contains(lowerCase) || lowerCase.contains(lowerCase2)) {
                            int lastIndexOf2 = lowerCase2.lastIndexOf(35);
                            if (lastIndexOf2 == -1) {
                                break;
                            }
                            str3 = lowerCase2.substring(lastIndexOf2 + 1);
                            break;
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
            }
            str3 = null;
        } else {
            if (str != null && (lastIndexOf = str.lastIndexOf(35)) != -1) {
                str3 = str.substring(lastIndexOf + 1);
                webPage2 = webPage;
            } else {
                webPage2 = webPage;
                str3 = null;
            }
            z10 = false;
        }
        ArrayList arrayList = this.f33904d0;
        if (w3Var != null && !arrayList.isEmpty()) {
            z11 = z10;
            r52 = 1;
        } else {
            z11 = z10;
            r52 = 0;
        }
        if (r52 == 0) {
            arrayList.clear();
            this.f33907g0.setTranslationX(0.0f);
            if (w3Var != null) {
                w3Var.I = 0.0f;
                w3Var.f37687c.invalidate();
                w3Var.i();
                w3Var.h();
            }
            this.f33907g0.setTranslationY(0.0f);
            this.f33920u0[0].setTranslationY(0.0f);
            this.f33920u0[0].setTranslationX(0.0f);
            this.f33920u0[1].setTranslationX(0.0f);
            this.f33920u0[0].setAlpha(1.0f);
            this.f33906f0.setInnerTranslationX(0.0f);
            this.f33920u0[0].g();
            X(AndroidUtilities.dp(56.0f));
        }
        if (w3Var != null && org.telegram.ui.web.c1.P0) {
            w3Var.f37685a.lock();
        }
        if (webPage2 != null) {
            boolean h = h(webPage2, str3, r52);
            if (!z11) {
                if (!h && str3 != null) {
                    str4 = str3;
                } else {
                    str4 = null;
                }
                TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
                tL_messages_getWebPage.url = webPage2.url;
                TL_iv.Page page2 = webPage2.cached_page;
                if (!(page2 instanceof TL_iv.TL_pagePart_layer82) && !page2.part) {
                    tL_messages_getWebPage.hash = webPage2.hash;
                } else {
                    tL_messages_getWebPage.hash = 0;
                }
                if (messageObject != null) {
                    i10 = messageObject.currentAccount;
                } else {
                    i10 = UserConfig.selectedAccount;
                }
                int i13 = i10;
                ConnectionsManager.getInstance(i13).sendRequest(tL_messages_getWebPage, new nf.a(this, i13, webPage2, messageObject, (boolean) r52, str4));
            }
        } else {
            g(r52, str2);
        }
        l0 l0Var = this.f33908h0;
        if (l0Var != null && r52 == 0) {
            l0Var.setIsLocal(this.f33920u0[0].d());
        }
        this.T = null;
        if (w3Var != null) {
            if (r52 == 0) {
                AndroidUtilities.removeFromParent(this.f33906f0);
                w3Var.d = this.f33906f0;
                w3Var.n();
                w3Var.f37687c.addView(this.f33906f0, w7.a6.c(-1.0f, -1));
            }
        } else if (!this.V) {
            WindowManager windowManager = (WindowManager) this.L.getSystemService("window");
            if (this.W) {
                try {
                    windowManager.removeView(this.f33906f0);
                } catch (Exception unused) {
                }
            }
            try {
                WindowManager.LayoutParams layoutParams = this.f33905e0;
                layoutParams.flags = -2013200384;
                if (Build.VERSION.SDK_INT >= 28) {
                    layoutParams.layoutInDisplayCutoutMode = 1;
                }
                this.f33906f0.setFocusable(false);
                this.f33907g0.setFocusable(false);
                windowManager.addView(this.f33906f0, this.f33905e0);
            } catch (Exception e7) {
                FileLog.e(e7);
                return false;
            }
        } else {
            this.f33905e0.flags &= -17;
            ((WindowManager) this.L.getSystemService("window")).updateViewLayout(this.f33906f0, this.f33905e0);
        }
        this.V = true;
        this.Z = 1;
        if (r52 == 0) {
            if (w3Var != null) {
                if (r52 != 0) {
                    w3Var.f37685a.unlock();
                } else if (!w3Var.h) {
                    w3Var.g(w3Var.f37686b);
                    w3Var.f();
                }
            } else {
                this.f33906f0.setAlpha(0.0f);
                this.f33907g0.setAlpha(0.0f);
                AnimatorSet animatorSet = new AnimatorSet();
                ArticleViewer$WindowView articleViewer$WindowView = this.f33906f0;
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(articleViewer$WindowView, property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f33907g0, property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f33906f0, View.TRANSLATION_X, AndroidUtilities.dp(56.0f), 0.0f));
                this.f33900a0 = new b0(this, 1);
                animatorSet.setDuration(150L);
                animatorSet.setInterpolator(this.f33903c0);
                animatorSet.addListener(new s0(this));
                this.f33902b0 = System.currentTimeMillis();
                AndroidUtilities.runOnUIThread(new n(2, this, animatorSet));
            }
        }
        this.f33907g0.setLayerType(2, null);
        return true;
    }

    public final void P(long j3, TLRPC.User user) {
        if (user != null && (this.L instanceof LaunchActivity)) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f17342id);
            bundle.putString("botUser", "webpage" + j3);
            ((LaunchActivity) this.L).q0(new eo(bundle), false, true);
            o(false, true);
        }
    }

    public final void Q(String str, String str2, j0 j0Var) {
        Activity activity = this.L;
        if (activity != null && !activity.isFinishing()) {
            n3 n3Var = this.f33920u0[0];
            if (n3Var != null && n3Var.d()) {
                String string = LocaleController.getString(R.string.OpenUrlAlert2);
                int indexOf = string.indexOf("%");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(String.format(string, str));
                if (indexOf >= 0) {
                    spannableStringBuilder.setSpan(new URLSpan(str), indexOf, str.length() + indexOf, 33);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.L, 0, null);
                String string2 = LocaleController.getString(R.string.OpenUrlTitle);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                d2Var.R = string2;
                d2Var.T = spannableStringBuilder;
                d2Var.f17620f0 = false;
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.Open), new a1.d(this, str, str2, j0Var, 3));
                alertDialog$Builder.o();
                return;
            }
            R(str, str2, j0Var);
        }
    }

    public final void R(String str, String str2, nf.e eVar) {
        w3 w3Var;
        nf.e eVar2 = this.M0;
        if (eVar2 != null) {
            eVar2.a(false);
        }
        this.M0 = eVar;
        if (this.F0 != 0) {
            ConnectionsManager.getInstance(this.X).cancelRequest(this.F0, false);
            this.F0 = 0;
        }
        boolean[] zArr = new boolean[1];
        if (nf.f.l(this.L, str, false)) {
            if (this.f33904d0.isEmpty() && (w3Var = this.K) != null) {
                w3Var.dismiss(false);
                return;
            }
            return;
        }
        g0 g0Var = new g0(this, str, zArr, eVar);
        int i10 = this.H0 + 1;
        this.H0 = i10;
        b0(true);
        TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
        tL_messages_getWebPage.url = str;
        tL_messages_getWebPage.hash = 0;
        this.F0 = ConnectionsManager.getInstance(this.X).sendRequest(tL_messages_getWebPage, new org.telegram.messenger.qi(this, i10, eVar, str2, g0Var, tL_messages_getWebPage));
        if (eVar != null) {
            eVar.f14040b = new bi.g3(this, i10, eVar, 21);
            eVar.d();
        }
    }

    public final void S() {
        int w02;
        int w03;
        TextView textView = this.B0;
        if (textView != null) {
            textView.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18017i6, false), 2, -1));
            this.B0.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E8, false));
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.A0;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G8, false));
        }
        ImageView imageView = this.f33917r0;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false), PorterDuff.Mode.MULTIPLY));
            this.f33917r0.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18327z8, false), 1, -1));
        }
        ImageView imageView2 = this.f33918s0;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false), PorterDuff.Mode.MULTIPLY));
            this.f33918s0.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18327z8, false), 1, -1));
        }
        org.telegram.ui.Components.o6 o6Var = this.f33919t0;
        if (o6Var != null) {
            o6Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        }
        l0 l0Var = this.f33908h0;
        if (l0Var != null) {
            n3 n3Var = this.f33920u0[0];
            if (n3Var != null && SharedConfig.adaptableColorInBrowser) {
                w02 = n3Var.getBackgroundColor();
            } else {
                w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false);
            }
            l0Var.setMenuColors(w02);
            l0 l0Var2 = this.f33908h0;
            n3 n3Var2 = this.f33920u0[0];
            if (n3Var2 != null && SharedConfig.adaptableColorInBrowser) {
                w03 = n3Var2.getActionBarColor();
            } else {
                w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false);
            }
            l0Var2.d(w03, true);
        }
        this.f33912l0.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false));
    }

    public final void U() {
        int L0;
        int i10;
        boolean z10 = false;
        n3 n3Var = this.f33920u0[0];
        if (n3Var.f35103c.E != null && (L0 = n3Var.d.L0()) != -1) {
            View m10 = this.f33920u0[0].d.m(L0);
            if (m10 != null) {
                i10 = m10.getTop();
            } else {
                i10 = 0;
            }
            String str = "article" + this.f33920u0[0].f35103c.E.f17348id;
            SharedPreferences.Editor putInt = ApplicationLoader.applicationContext.getSharedPreferences("articles", 0).edit().putInt(str, L0).putInt(str + "o", i10);
            String t10 = org.telegram.ui.Cells.r6.t(str, "r");
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                z10 = true;
            }
            putInt.putBoolean(t10, z10).commit();
        }
    }

    public final boolean V(String str, boolean z10) {
        String lowerCase;
        int i10;
        Integer num = 0;
        if (!TextUtils.isEmpty(str)) {
            String lowerCase2 = str.toLowerCase();
            Integer num2 = (Integer) this.f33920u0[0].f35103c.h.get(lowerCase2);
            if (num2 != null) {
                TL_iv.textAnchor textanchor = (TL_iv.textAnchor) this.f33920u0[0].f35103c.f33263r.get(lowerCase2);
                if (textanchor != null) {
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    if (!TextUtils.isEmpty(this.f33920u0[0].f35103c.E.cached_page.url)) {
                        lowerCase = this.f33920u0[0].f35103c.E.cached_page.url.toLowerCase();
                    } else {
                        lowerCase = this.f33920u0[0].f35103c.E.url.toLowerCase();
                    }
                    pageblockparagraph.text = org.telegram.ui.web.k2.d(textanchor.text, lowerCase, lowerCase2);
                    this.f33920u0[0].f35103c.getClass();
                    int I = h4.I(pageblockparagraph);
                    s4.c1 x10 = this.f33920u0[0].f35103c.x(null, I);
                    View view = x10.f41610a;
                    this.f33920u0[0].f35103c.H(I, x10, pageblockparagraph, 0, 0, false);
                    org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, (Context) this.L, (org.telegram.ui.ActionBar.f6) null, false);
                    h3Var.fixNavigationBar();
                    h3Var.applyTopPadding = false;
                    h3Var.applyBottomPadding = false;
                    LinearLayout linearLayout = new LinearLayout(this.L);
                    linearLayout.setOrientation(1);
                    org.telegram.ui.Cells.s9 s9Var = new org.telegram.ui.Cells.s9();
                    this.P0 = s9Var;
                    s9Var.T(linearLayout);
                    this.P0.D = new z0(this, 0);
                    di.h hVar = new di.h(this.L, 3);
                    hVar.setTextSize(1, 16.0f);
                    hVar.setTypeface(AndroidUtilities.bold());
                    hVar.setText(LocaleController.getString(R.string.InstantViewReference));
                    if (this.f33920u0[0].f35103c.G) {
                        i10 = 5;
                    } else {
                        i10 = 3;
                    }
                    hVar.setGravity(i10 | 16);
                    hVar.setTextColor(b());
                    hVar.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                    linearLayout.addView(hVar, new LinearLayout.LayoutParams(-1, AndroidUtilities.dp(48.0f) + 1));
                    view.setTag("bottomSheet");
                    linearLayout.addView(view, w7.a6.k(0.0f, 7.0f, 0.0f, 0.0f, -1, -2));
                    org.telegram.ui.Cells.ea o9 = this.P0.o(this.L);
                    bi.n7 n7Var = new bi.n7(this, this.L, linearLayout, 4);
                    h3Var.setDelegate(new h0(this, 0));
                    n7Var.addView(linearLayout, -1, -2);
                    n7Var.addView(o9, -1, -2);
                    h3Var.customView = n7Var;
                    if (this.O0.y()) {
                        this.O0.f(false);
                    }
                    this.I = h3Var;
                    a0(h3Var);
                    return true;
                } else if (num2.intValue() >= 0 && num2.intValue() < this.f33920u0[0].f35103c.e.size()) {
                    TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) this.f33920u0[0].f35103c.e.get(num2.intValue());
                    TL_iv.PageBlock z11 = z(pageBlock);
                    if ((z11 instanceof x3) && O((x3) z11)) {
                        this.f33920u0[0].f35103c.M();
                        this.f33920u0[0].f35103c.l();
                    }
                    int indexOf = this.f33920u0[0].f35103c.d.indexOf(pageBlock);
                    if (indexOf != -1) {
                        num2 = Integer.valueOf(indexOf);
                    }
                    Integer num3 = (Integer) this.f33920u0[0].f35103c.f33262n.get(lowerCase2);
                    if (num3 != null) {
                        if (num3.intValue() == -1) {
                            this.f33920u0[0].f35103c.getClass();
                            int I2 = h4.I(pageBlock);
                            s4.c1 x11 = this.f33920u0[0].f35103c.x(null, I2);
                            this.f33920u0[0].f35103c.H(I2, x11, pageBlock, 0, 0, false);
                            x11.f41610a.measure(View.MeasureSpec.makeMeasureSpec(this.f33920u0[0].f35102b.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                            Integer num4 = (Integer) this.f33920u0[0].f35103c.f33262n.get(lowerCase2);
                            if (num4.intValue() != -1) {
                                num = num4;
                            }
                        } else {
                            num = num3;
                        }
                    }
                    if (this.f33920u0[0].f35103c.H) {
                        num2 = Integer.valueOf(num2.intValue() + 1);
                    }
                    if (z10) {
                        org.telegram.ui.Components.jw0 jw0Var = new org.telegram.ui.Components.jw0(this.f33920u0[0].getContext());
                        jw0Var.f41760a = num2.intValue();
                        jw0Var.f24507s = (-AndroidUtilities.dp(56.0f)) - num.intValue();
                        this.f33920u0[0].d.w0(jw0Var);
                        return true;
                    }
                    this.f33920u0[0].d.h1(num2.intValue(), (-AndroidUtilities.dp(56.0f)) - num.intValue());
                    return true;
                }
            }
        }
        return false;
    }

    public final void W(int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j4.W(int):void");
    }

    public final void X(int i10) {
        l0 l0Var = this.f33908h0;
        if (l0Var != null && !l0Var.T && !l0Var.W) {
            int clamp = Utilities.clamp(i10, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(24.0f));
            this.I0 = clamp;
            this.f33908h0.setHeight(clamp);
            this.O0.f19166x = this.I0;
            int i11 = 0;
            while (true) {
                n3[] n3VarArr = this.f33920u0;
                if (i11 < n3VarArr.length) {
                    n3VarArr[i11].f35102b.setTopGlowOffset(this.I0);
                    i11++;
                } else {
                    return;
                }
            }
        }
    }

    public final void Y(Activity activity, org.telegram.ui.ActionBar.p2 p2Var) {
        kb0 kb0Var;
        int i10;
        boolean z10;
        int w02;
        int i11;
        int i12;
        w3 w3Var;
        kb0 kb0Var2 = this.U0;
        if (kb0Var2 != null) {
            kb0Var2.destroy();
            this.U0 = null;
        }
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            kb0Var = new kb0(launchActivity, true);
        } else {
            kb0Var = null;
        }
        this.U0 = kb0Var;
        this.M = p2Var;
        if (!(p2Var instanceof jz)) {
            i10 = p2Var.getCurrentAccount();
        } else {
            i10 = UserConfig.selectedAccount;
        }
        this.X = i10;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
        NotificationCenter.getInstance(this.X).addObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(this.X).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(this.X).addObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(this.X).addObserver(this, NotificationCenter.emojiLoaded);
        Activity activity2 = this.L;
        if (activity2 != activity && (activity2 == null || !this.J || (w3Var = this.K) == null || w3Var.e == null)) {
            this.L = activity;
            this.f36854a = ApplicationLoader.applicationContext.getSharedPreferences("articles", 0).getInt("font_type", 0);
            r(this, false);
            this.f33912l0 = new Paint();
            this.m0 = activity.getResources().getDrawable(R.drawable.layer_shadow);
            this.f33913n0 = new Paint();
            ArticleViewer$WindowView articleViewer$WindowView = new ArticleViewer$WindowView(this, activity);
            this.f33906f0 = articleViewer$WindowView;
            articleViewer$WindowView.setWillNotDraw(false);
            this.f33906f0.setClipChildren(true);
            this.f33906f0.setFocusable(false);
            k0 k0Var = new k0(this, activity, 0);
            this.f33907g0 = k0Var;
            this.f33906f0.addView(k0Var, w7.a6.e(-1, -1, 51));
            if (this.K == null) {
                this.f33906f0.setFitsSystemWindows(true);
                this.f33907g0.setOnApplyWindowInsetsListener(new org.telegram.ui.ActionBar.i3(1));
            }
            FrameLayout frameLayout = new FrameLayout(activity);
            this.P = frameLayout;
            frameLayout.setBackgroundColor(-16777216);
            this.P.setVisibility(4);
            this.f33906f0.addView(this.P, w7.a6.c(-1.0f, -1));
            m4 m4Var = new m4(activity);
            this.R = m4Var;
            m4Var.setVisibility(0);
            this.R.setBackgroundColor(-16777216);
            this.P.addView(this.R, w7.a6.e(-1, -1, 17));
            this.Q = new TextureView(activity);
            this.f33920u0 = new n3[2];
            int i13 = 0;
            while (true) {
                n3[] n3VarArr = this.f33920u0;
                if (i13 >= n3VarArr.length) {
                    break;
                }
                n3 n3Var = new n3(this, activity);
                n3VarArr[i13] = n3Var;
                if (i13 == 0) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                n3Var.setVisibility(i12);
                this.f33907g0.addView(n3Var, w7.a6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
                n3Var.f35102b.setOnItemLongClickListener(new u(this));
                n3Var.f35102b.setOnItemClickListener(new bi.cb(24, this, n3Var));
                i13++;
            }
            this.f33907g0.addView(new FrameLayout(activity), w7.a6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f33922w0.setColor(-16777216);
            this.f33923x0.setColor(-16777216);
            this.f33925z0.setColor(-14408666);
            this.f33924y0.setColor(-16777216);
            l0 l0Var = new l0(this, activity);
            this.f33908h0 = l0Var;
            if (this.K != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            l0Var.f38107e0 = z10;
            this.f33907g0.addView(l0Var, w7.a6.e(-1, -2, 48));
            this.f33908h0.setOnClickListener(new bi.n3(19, this, activity));
            this.f33908h0.f38103b0.addTextChangedListener(new m0(this, 0));
            org.telegram.ui.web.l lVar = new org.telegram.ui.web.l(activity);
            this.f33909i0 = lVar;
            lVar.setOpenProgress(0.0f);
            this.f33909i0.f38004w.j(new j3(this, 2));
            this.f33907g0.addView(this.f33909i0, w7.a6.c(-1.0f, -1));
            this.f33910j0 = new b0(this, 3);
            this.f33908h0.L.setOnClickListener(new t(this, 2));
            this.f33908h0.L.setOnLongClickListener(new v(this, 0));
            this.f33908h0.setMenuListener(new bi.y2(26, this, activity));
            this.f33908h0.O.setOnClickListener(new t(this, 3));
            bi.l4 l4Var = new bi.l4(this.L, 5);
            this.f33916q0 = l4Var;
            l4Var.setOnTouchListener(new ai.h(3));
            this.f33916q0.setWillNotDraw(false);
            this.f33916q0.setTranslationY(AndroidUtilities.dp(51.0f));
            this.f33916q0.setVisibility(4);
            this.f33916q0.setFocusable(true);
            this.f33916q0.setFocusableInTouchMode(true);
            this.f33916q0.setClickable(true);
            this.f33916q0.setPadding(0, AndroidUtilities.dp(3.0f), 0, 0);
            this.f33907g0.addView(this.f33916q0, w7.a6.e(-1, 51, 80));
            new bi.b5(this.f33906f0, false, new s(this, 0));
            ImageView imageView = new ImageView(this.L);
            this.f33917r0 = imageView;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            this.f33917r0.setImageResource(R.drawable.msg_go_up);
            ImageView imageView2 = this.f33917r0;
            int i14 = org.telegram.ui.ActionBar.j6.G6;
            int w03 = org.telegram.ui.ActionBar.j6.w0(null, i14, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            imageView2.setColorFilter(new PorterDuffColorFilter(w03, mode));
            ImageView imageView3 = this.f33917r0;
            int i15 = org.telegram.ui.ActionBar.j6.f18327z8;
            imageView3.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i15, false), 1, -1));
            this.f33916q0.addView(this.f33917r0, w7.a6.d(48, 48.0f, 53, 0.0f, 0.0f, 48.0f, 0.0f));
            this.f33917r0.setOnClickListener(new t(this, 0));
            this.f33917r0.setContentDescription(LocaleController.getString(R.string.AccDescrSearchNext));
            ImageView imageView4 = new ImageView(this.L);
            this.f33918s0 = imageView4;
            imageView4.setScaleType(scaleType);
            this.f33918s0.setImageResource(R.drawable.msg_go_down);
            this.f33918s0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i14, false), mode));
            this.f33918s0.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i15, false), 1, -1));
            this.f33916q0.addView(this.f33918s0, w7.a6.d(48, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f33918s0.setOnClickListener(new t(this, 1));
            this.f33918s0.setContentDescription(LocaleController.getString(R.string.AccDescrSearchPrev));
            org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(this.L, true, true, true);
            this.f33919t0 = o6Var;
            o6Var.setScaleProperty(0.6f);
            this.f33919t0.b(0.4f, 350L, org.telegram.ui.Components.wr.h);
            this.f33919t0.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
            this.f33919t0.setTextSize(AndroidUtilities.dp(15.0f));
            this.f33919t0.setTypeface(AndroidUtilities.bold());
            this.f33919t0.setGravity(3);
            this.f33919t0.getDrawable().G = AndroidUtilities.displaySize.x;
            this.f33916q0.addView(this.f33919t0, w7.a6.d(-2, -2.0f, 19, 18.0f, 0.0f, 108.0f, 0.0f));
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.f33905e0 = layoutParams;
            layoutParams.height = -1;
            layoutParams.format = -3;
            layoutParams.width = -1;
            layoutParams.gravity = 51;
            layoutParams.type = 98;
            layoutParams.softInputMode = 48;
            layoutParams.flags = 131072;
            if (this.K == null) {
                w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17872a7, true);
            } else {
                w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17872a7, false);
            }
            if (AndroidUtilities.computePerceivedBrightness(w02) >= 0.721f && Build.VERSION.SDK_INT >= 26) {
                i11 = 1808;
            } else {
                i11 = 1792;
            }
            this.f33924y0.setColor(w02);
            WindowManager.LayoutParams layoutParams2 = this.f33905e0;
            layoutParams2.systemUiVisibility = i11;
            layoutParams2.flags |= -2147417856;
            if (Build.VERSION.SDK_INT >= 28) {
                layoutParams2.layoutInDisplayCutoutMode = 1;
            }
            org.telegram.ui.Cells.s9 s9Var = new org.telegram.ui.Cells.s9();
            this.O0 = s9Var;
            s9Var.T(this.f33920u0[0].f35102b);
            if (MessagesController.getInstance(this.X).getTranslateController().isContextTranslateEnabled()) {
                this.O0.f19148l0 = new u(this);
            }
            org.telegram.ui.Cells.s9 s9Var2 = this.O0;
            s9Var2.E0 = this.f33920u0[0].d;
            s9Var2.D = new p0(this);
            this.f33907g0.addView(s9Var2.o(activity));
            k0 k0Var2 = this.f33907g0;
            rv0 rv0Var = new rv0(k0Var2, k0Var2);
            this.Q0 = rv0Var;
            rv0Var.F = new u(this);
            rv0Var.E = new g(this, 1);
            this.f33912l0.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false));
            g0(this);
            return;
        }
        g0(this);
        S();
    }

    public final void Z(String str) {
        String str2;
        if (this.L == null) {
            return;
        }
        org.telegram.ui.ActionBar.h3 h3Var = this.I;
        if (h3Var != null) {
            h3Var.dismiss();
            this.I = null;
        }
        org.telegram.ui.ActionBar.h3 h3Var2 = new org.telegram.ui.ActionBar.h3(1, (Context) this.L, (org.telegram.ui.ActionBar.f6) null, false);
        h3Var2.fixNavigationBar();
        try {
            str2 = URLDecoder.decode(str.replaceAll("\\+", "%2b"), "UTF-8");
        } catch (Exception e) {
            FileLog.e(e);
            str2 = str;
        }
        h3Var2.title = str2;
        h3Var2.bigTitle = false;
        h3Var2.multipleLinesTitle = true;
        CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
        kg.j jVar = new kg.j(2, this, str);
        h3Var2.items = charSequenceArr;
        h3Var2.onClickListener = jVar;
        h3Var2.setOnHideListener(new w(this, 0));
        a0(h3Var2);
    }

    @Override
    public final int a() {
        return org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18306y6, false);
    }

    public final void a0(org.telegram.ui.ActionBar.h3 h3Var) {
        if (this.L != null) {
            try {
                org.telegram.ui.ActionBar.h3 h3Var2 = this.f33911k0;
                if (h3Var2 != null) {
                    h3Var2.dismiss();
                    this.f33911k0 = null;
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            try {
                this.f33911k0 = h3Var;
                h3Var.setCanceledOnTouchOutside(true);
                this.f33911k0.setOnDismissListener(new w(this, 1));
                h3Var.show();
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
    }

    @Override
    public final int b() {
        return org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false);
    }

    public final void b0(boolean z10) {
        AndroidUtilities.cancelRunOnUIThread(this.f33910j0);
        if (z10) {
            this.f33908h0.f38106d0.a(0.0f, false);
            this.f33908h0.f38106d0.a(0.3f, true);
            AndroidUtilities.runOnUIThread(this.f33910j0, 100L);
            return;
        }
        this.f33908h0.f38106d0.a(1.0f, true);
    }

    @Override
    public final void c(h4 h4Var, org.telegram.ui.Components.x01 x01Var) {
        String str;
        String str2;
        org.telegram.ui.Components.n90 n90Var;
        String lowerCase;
        if (x01Var != null && (str = x01Var.f28901b) != null) {
            org.telegram.ui.ActionBar.h3 h3Var = this.I;
            j0 j0Var = null;
            if (h3Var != null) {
                h3Var.dismiss();
                this.I = null;
            }
            int lastIndexOf = str.lastIndexOf(35);
            boolean z10 = false;
            if (lastIndexOf != -1) {
                if (!TextUtils.isEmpty(h4Var.E.cached_page.url)) {
                    lowerCase = h4Var.E.cached_page.url.toLowerCase();
                } else {
                    lowerCase = h4Var.E.url.toLowerCase();
                }
                try {
                    str2 = URLDecoder.decode(str.substring(lastIndexOf + 1), "UTF-8");
                } catch (Exception unused) {
                    str2 = "";
                }
                if (lastIndexOf == 0 || str.toLowerCase().contains(lowerCase)) {
                    z10 = true;
                    V(str2, true);
                }
            } else {
                str2 = null;
            }
            if (!z10) {
                c3 c3Var = this.d;
                if (c3Var != null && (n90Var = this.f36855b) != null) {
                    j0Var = new j0(this, c3Var, n90Var);
                }
                Q(str, str2, j0Var);
            }
        }
    }

    public final void c0() {
        LaunchActivity launchActivity;
        FrameLayout frameLayout;
        if (this.W && (launchActivity = LaunchActivity.G1) != null && !launchActivity.isFinishing()) {
            if (this.f33920u0[0].f()) {
                if (this.f33920u0[0].getWebView() != null) {
                    frameLayout = this.f33920u0[0].f35104f;
                } else {
                    return;
                }
            } else {
                n3 n3Var = this.f33920u0[0];
                TLRPC.WebPage webPage = n3Var.f35103c.E;
                frameLayout = n3Var;
                if (webPage == null) {
                    return;
                }
            }
            new org.telegram.ui.Components.wc(frameLayout, null).G(R.raw.chats_infotip, 4, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BrowserExternalRestricted), new b0(this, 10))).k(true);
        }
    }

    @Override
    public final boolean d(TL_iv.PageBlock pageBlock, h4 h4Var) {
        int indexOf;
        List list;
        org.telegram.ui.ActionBar.p2 p2Var = this.M;
        if (p2Var != null && p2Var.getParentActivity() != null) {
            if ((pageBlock instanceof TL_iv.pageBlockVideo) && !g4.g(h4Var.E, pageBlock)) {
                list = Collections.singletonList(pageBlock);
                indexOf = 0;
            } else {
                ArrayList arrayList = new ArrayList(h4Var.f33261f);
                indexOf = h4Var.f33261f.indexOf(pageBlock);
                list = arrayList;
            }
            PhotoViewer t12 = PhotoViewer.t1();
            t12.K2(null, this.M, null);
            if (t12.e2(null, null, null, null, null, null, null, indexOf, new g3(this, list), null, 0L, 0L, 0L, true, new p3(this, h4Var.E, list), null)) {
                n();
                return true;
            }
        }
        return false;
    }

    public final void d0(boolean z10) {
        float f7;
        this.f33916q0.setVisibility(0);
        ValueAnimator valueAnimator = this.X0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.Y0;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.X0 = ofFloat;
        ofFloat.addUpdateListener(new r(this, 1));
        this.X0.addListener(new ai.e(15, this, z10));
        this.X0.setDuration(320L);
        this.X0.setInterpolator(org.telegram.ui.Components.wr.h);
        this.X0.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        b1 b1Var;
        MessageObject messageObject;
        if (i10 == NotificationCenter.messagePlayingDidStart) {
            MessageObject messageObject2 = (MessageObject) objArr[0];
            if (this.f33920u0 != null) {
                int i12 = 0;
                while (true) {
                    n3[] n3VarArr = this.f33920u0;
                    if (i12 < n3VarArr.length) {
                        int childCount = n3VarArr[i12].f35102b.getChildCount();
                        for (int i13 = 0; i13 < childCount; i13++) {
                            View childAt = this.f33920u0[i12].f35102b.getChildAt(i13);
                            if (childAt instanceof b1) {
                                ((b1) childAt).a(true);
                            }
                        }
                        i12++;
                    } else {
                        return;
                    }
                }
            }
        } else if (i10 != NotificationCenter.messagePlayingDidReset && i10 != NotificationCenter.messagePlayingPlayStateChanged) {
            if (i10 == NotificationCenter.messagePlayingProgressDidChanged) {
                Integer num = (Integer) objArr[0];
                if (this.f33920u0 != null) {
                    int i14 = 0;
                    while (true) {
                        n3[] n3VarArr2 = this.f33920u0;
                        if (i14 < n3VarArr2.length) {
                            int childCount2 = n3VarArr2[i14].f35102b.getChildCount();
                            int i15 = 0;
                            while (true) {
                                if (i15 < childCount2) {
                                    View childAt2 = this.f33920u0[i14].f35102b.getChildAt(i15);
                                    if ((childAt2 instanceof b1) && (messageObject = (b1Var = (b1) childAt2).getMessageObject()) != null && messageObject.getId() == num.intValue()) {
                                        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                                        if (playingMessageObject != null) {
                                            messageObject.audioProgress = playingMessageObject.audioProgress;
                                            messageObject.audioProgressSec = playingMessageObject.audioProgressSec;
                                            messageObject.audioPlayerDuration = playingMessageObject.audioPlayerDuration;
                                            b1Var.b();
                                        }
                                    } else {
                                        i15++;
                                    }
                                }
                            }
                            i14++;
                        } else {
                            return;
                        }
                    }
                }
            } else if (i10 == NotificationCenter.emojiLoaded && this.f33920u0 != null) {
                int i16 = 0;
                while (true) {
                    n3[] n3VarArr3 = this.f33920u0;
                    if (i16 < n3VarArr3.length) {
                        int childCount3 = n3VarArr3[i16].f35102b.getChildCount();
                        for (int i17 = 0; i17 < childCount3; i17++) {
                            View childAt3 = this.f33920u0[i16].f35102b.getChildAt(i17);
                            if (childAt3 instanceof v2) {
                                ((v2) childAt3).e.invalidate();
                            } else {
                                childAt3.invalidate();
                            }
                        }
                        i16++;
                    } else {
                        return;
                    }
                }
            }
        } else if (this.f33920u0 != null) {
            int i18 = 0;
            while (true) {
                n3[] n3VarArr4 = this.f33920u0;
                if (i18 < n3VarArr4.length) {
                    int childCount4 = n3VarArr4[i18].f35102b.getChildCount();
                    for (int i19 = 0; i19 < childCount4; i19++) {
                        View childAt4 = this.f33920u0[i18].f35102b.getChildAt(i19);
                        if (childAt4 instanceof b1) {
                            b1 b1Var2 = (b1) childAt4;
                            if (b1Var2.getMessageObject() != null) {
                                b1Var2.a(true);
                            }
                        }
                    }
                    i18++;
                } else {
                    return;
                }
            }
        }
    }

    public final void e0(int i10, Object obj, boolean z10) {
        int dp;
        int i11;
        int i12;
        int i13;
        int color;
        int w02;
        int w03;
        boolean z11;
        boolean z12;
        if (obj != null) {
            if (((obj instanceof TLRPC.WebPage) && ((TLRPC.WebPage) obj).cached_page != null) || (obj instanceof a3)) {
                int i14 = 1;
                if (!z10 && i10 != 0) {
                    n3[] n3VarArr = this.f33920u0;
                    n3 n3Var = n3VarArr[1];
                    n3VarArr[1] = n3VarArr[0];
                    n3VarArr[0] = n3Var;
                    this.f33908h0.i();
                    this.Z0.a(this.f33920u0[0].getBackgroundColor(), true);
                    this.f33901a1.a(this.f33920u0[1].getBackgroundColor(), true);
                    w3 w3Var = this.K;
                    if (w3Var != null) {
                        w3Var.m();
                    }
                    int indexOfChild = this.f33907g0.indexOfChild(this.f33920u0[0]);
                    int indexOfChild2 = this.f33907g0.indexOfChild(this.f33920u0[1]);
                    if (i10 == 1) {
                        if (indexOfChild < indexOfChild2) {
                            this.f33907g0.removeView(this.f33920u0[0]);
                            this.f33907g0.addView(this.f33920u0[0], indexOfChild2);
                        }
                    } else if (indexOfChild2 < indexOfChild) {
                        this.f33907g0.removeView(this.f33920u0[0]);
                        this.f33907g0.addView(this.f33920u0[0], indexOfChild);
                    }
                    this.f33921v0 = new AnimatorSet();
                    this.f33920u0[0].setVisibility(0);
                    if (i10 == 1) {
                        i13 = 0;
                    } else {
                        i13 = 1;
                    }
                    n3 n3Var2 = this.f33920u0[i13];
                    if (this.K == null) {
                        color = 0;
                    } else {
                        color = this.f33912l0.getColor();
                    }
                    n3Var2.setBackgroundColor(color);
                    this.f33920u0[i13].setLayerType(2, null);
                    if (i10 == 1) {
                        this.f33920u0[0].setTranslationX(AndroidUtilities.displaySize.x);
                        this.f33921v0.playTogether(ObjectAnimator.ofFloat(this.f33920u0[0], View.TRANSLATION_X, AndroidUtilities.displaySize.x, 0.0f));
                    } else if (i10 == -1) {
                        this.f33920u0[0].setTranslationX(0.0f);
                        this.f33921v0.playTogether(ObjectAnimator.ofFloat(this.f33920u0[1], View.TRANSLATION_X, 0.0f, AndroidUtilities.displaySize.x));
                    }
                    this.f33921v0.setDuration(320L);
                    this.f33921v0.setInterpolator(org.telegram.ui.Components.wr.h);
                    this.f33921v0.addListener(new u0(this, i13, 0));
                    this.f33906f0.f18842f = true;
                    l0 l0Var = this.f33908h0;
                    n3 n3Var3 = this.f33920u0[0];
                    if (n3Var3 != null && SharedConfig.adaptableColorInBrowser) {
                        w02 = n3Var3.getBackgroundColor();
                    } else {
                        w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false);
                    }
                    l0Var.setMenuColors(w02);
                    l0 l0Var2 = this.f33908h0;
                    n3 n3Var4 = this.f33920u0[0];
                    if (n3Var4 != null && SharedConfig.adaptableColorInBrowser) {
                        w03 = n3Var4.getActionBarColor();
                    } else {
                        w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false);
                    }
                    l0Var2.d(w03, true);
                    l0 l0Var3 = this.f33908h0;
                    n3 n3Var5 = this.f33920u0[0];
                    if (n3Var5 != null && n3Var5.e()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    l0Var3.setIsTonsite(z11);
                    l0 l0Var4 = this.f33908h0;
                    n3 n3Var6 = this.f33920u0[0];
                    if (n3Var6 != null && n3Var6.d()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    l0Var4.setIsLocal(z12);
                    AnimatorSet animatorSet = this.f33921v0;
                    Objects.requireNonNull(animatorSet);
                    AndroidUtilities.runOnUIThread(new mu0(animatorSet, 4));
                }
                if (!z10) {
                    this.O0.f(true);
                }
                h4 h4Var = this.f33920u0[z10 ? 1 : 0].f35103c;
                if (z10) {
                    obj = hc.b.i(2, this.f33904d0);
                }
                this.f33920u0[z10 ? 1 : 0].b();
                if (obj instanceof TLRPC.WebPage) {
                    TLRPC.WebPage webPage = (TLRPC.WebPage) obj;
                    this.f33920u0[z10 ? 1 : 0].setWeb(null);
                    this.f33920u0[z10 ? 1 : 0].setType(0);
                    TL_iv.Page page = webPage.cached_page;
                    h4Var.G = page.rtl;
                    h4Var.E = webPage;
                    int size = page.blocks.size();
                    for (int i15 = 0; i15 < size; i15++) {
                        TL_iv.PageBlock pageBlock = webPage.cached_page.blocks.get(i15);
                        if (i15 == 0) {
                            pageBlock.first = true;
                            if (pageBlock instanceof TL_iv.pageBlockCover) {
                                TL_iv.pageBlockCover pageblockcover = (TL_iv.pageBlockCover) pageBlock;
                                TL_iv.RichText w10 = w(0, pageblockcover);
                                TL_iv.RichText w11 = w(1, pageblockcover);
                                if (((w10 != null && !(w10 instanceof TL_iv.textEmpty)) || (w11 != null && !(w11 instanceof TL_iv.textEmpty))) && size > 1) {
                                    TL_iv.PageBlock pageBlock2 = webPage.cached_page.blocks.get(1);
                                    if (pageBlock2 instanceof TL_iv.pageBlockChannel) {
                                        h4Var.F = (TL_iv.pageBlockChannel) pageBlock2;
                                    }
                                }
                            }
                        } else if (i15 == 1 && h4Var.F != null) {
                        }
                        if (i15 == size - 1) {
                            i12 = i15;
                        } else {
                            i12 = 0;
                        }
                        h4Var.F(h4Var, pageBlock, 0, 0, i12);
                    }
                    h4Var.l();
                    if (this.f33904d0.size() != 1 && i10 != -1) {
                        s4.c0 c0Var = this.f33920u0[z10 ? 1 : 0].d;
                        w3 w3Var2 = this.K;
                        if (w3Var2 == null) {
                            i14 = 0;
                        }
                        if (w3Var2 != null) {
                            i11 = AndroidUtilities.dp(32.0f);
                        } else {
                            i11 = 0;
                        }
                        c0Var.h1(i14, i11);
                    } else {
                        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("articles", 0);
                        String str = "article" + webPage.f17348id;
                        int i16 = sharedPreferences.getInt(str, -1);
                        boolean z13 = sharedPreferences.getBoolean(str + "r", true);
                        Point point = AndroidUtilities.displaySize;
                        if (point.x <= point.y) {
                            i14 = 0;
                        }
                        if (z13 == i14) {
                            dp = sharedPreferences.getInt(str + "o", 0) - this.f33920u0[z10 ? 1 : 0].f35102b.getPaddingTop();
                        } else {
                            dp = AndroidUtilities.dp(10.0f);
                        }
                        if (i16 != -1) {
                            this.f33920u0[z10 ? 1 : 0].d.h1(i16, dp);
                        }
                    }
                } else if (obj instanceof a3) {
                    this.f33920u0[z10 ? 1 : 0].setType(1);
                    this.f33920u0[z10 ? 1 : 0].g();
                    this.f33920u0[z10 ? 1 : 0].setWeb((a3) obj);
                }
                if (!z10) {
                    m(null);
                }
                i0(false);
                f0();
            }
        }
    }

    public final void f0() {
        n3[] n3VarArr;
        n3 n3Var;
        float translationX;
        boolean z10;
        boolean z11;
        n3 n3Var2;
        float f7;
        boolean z12;
        boolean z13;
        if (this.f33908h0 != null && (n3Var = (n3VarArr = this.f33920u0)[0]) != null && n3VarArr[1] != null) {
            int visibility = n3Var.getVisibility();
            float f10 = 0.0f;
            if (visibility != 0) {
                translationX = 0.0f;
            } else {
                translationX = 1.0f - (this.f33920u0[0].getTranslationX() / this.f33920u0[0].getWidth());
            }
            float f11 = 1.0f - translationX;
            l0 l0Var = this.f33908h0;
            l0Var.d[0] = this.f33920u0[0].getProgress();
            l0Var.invalidate();
            l0 l0Var2 = this.f33908h0;
            l0Var2.d[1] = this.f33920u0[1].getProgress();
            l0Var2.invalidate();
            this.f33908h0.setTransitionProgress(f11);
            l0 l0Var3 = this.f33908h0;
            if (!l0Var3.W && !l0Var3.T) {
                ArticleViewer$WindowView articleViewer$WindowView = this.f33906f0;
                if (articleViewer$WindowView.e || articleViewer$WindowView.f18842f) {
                    boolean J = J();
                    ArrayList arrayList = this.f33904d0;
                    if (!J && arrayList.size() <= 1) {
                        this.f33908h0.P.f();
                        this.f33908h0.setBackButtonCached(false);
                    } else {
                        if (!this.f33920u0[0].f35107s && arrayList.size() <= 1) {
                            f7 = 0.0f;
                        } else {
                            f7 = 1.0f;
                        }
                        float lerp = AndroidUtilities.lerp(f7, (this.f33920u0[1].f35107s || arrayList.size() > 2) ? 1.0f : 1.0f, f11);
                        this.f33908h0.M.c(1.0f - lerp, false);
                        this.f33908h0.P.f();
                        l0 l0Var4 = this.f33908h0;
                        if (lerp > 0.5f) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        l0Var4.setBackButtonCached(z12);
                    }
                    this.f33908h0.setHasForward(this.f33920u0[0].v);
                    this.f33908h0.setIsLocal(this.f33920u0[0].d());
                    l0 l0Var5 = this.f33908h0;
                    if (this.f33920u0[0].getWebView() != null && this.f33920u0[0].getWebView().f38153b) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    l0Var5.setIsLoaded(z13);
                }
            }
            l0 l0Var6 = this.f33908h0;
            int actionBarColor = this.f33920u0[0].getActionBarColor();
            ArticleViewer$WindowView articleViewer$WindowView2 = this.f33906f0;
            if (!articleViewer$WindowView2.e && !articleViewer$WindowView2.f18842f) {
                z10 = false;
            } else {
                z10 = true;
            }
            l0Var6.b(0, this.Z0.a(actionBarColor, z10));
            l0 l0Var7 = this.f33908h0;
            int actionBarColor2 = this.f33920u0[1].getActionBarColor();
            ArticleViewer$WindowView articleViewer$WindowView3 = this.f33906f0;
            if (!articleViewer$WindowView3.e && !articleViewer$WindowView3.f18842f) {
                z11 = false;
            } else {
                z11 = true;
            }
            l0Var7.b(1, this.f33901a1.a(actionBarColor2, z11));
            this.f33908h0.d(i0.a.d(f11, this.f33920u0[0].getActionBarColor(), this.f33920u0[1].getActionBarColor()), false);
            l0 l0Var8 = this.f33908h0;
            if (translationX > 0.5f) {
                n3Var2 = this.f33920u0[0];
            } else {
                n3Var2 = this.f33920u0[1];
            }
            l0Var8.setMenuType(n3Var2.f35101a);
            w3 w3Var = this.K;
            if (w3Var != null) {
                w3Var.f37687c.invalidate();
                return;
            }
            ArticleViewer$WindowView articleViewer$WindowView4 = this.f33906f0;
            if (articleViewer$WindowView4 != null) {
                articleViewer$WindowView4.invalidate();
            }
        }
    }

    public final void g(int i10, String str) {
        U();
        org.telegram.ui.ActionBar.p3 p3Var = new org.telegram.ui.ActionBar.p3();
        p3Var.f18559x = str;
        this.f33904d0.add(p3Var);
        this.f33908h0.h(false);
        e0(i10, p3Var, false);
    }

    public final boolean h(TLRPC.WebPage webPage, String str, int i10) {
        U();
        this.f33904d0.add(webPage);
        this.f33908h0.h(false);
        e0(i10, webPage, false);
        return V(str, false);
    }

    public final void h0() {
        int i10;
        int size;
        boolean z10;
        boolean z11;
        float f7;
        if (this.E == null && !this.f33920u0[0].f()) {
            return;
        }
        if (this.f33920u0[0].f()) {
            if (this.f33920u0[0].getWebView() == null) {
                i10 = 0;
            } else {
                i10 = this.f33920u0[0].getWebView().getSearchIndex();
            }
            if (this.f33920u0[0].getWebView() == null) {
                size = 0;
            } else {
                size = this.f33920u0[0].getWebView().getSearchCount();
            }
        } else {
            i10 = this.G;
            size = this.E.size();
        }
        ImageView imageView = this.f33917r0;
        if (size > 0 && i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        imageView.setEnabled(z10);
        ImageView imageView2 = this.f33918s0;
        if (size > 0 && i10 != size - 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        imageView2.setEnabled(z11);
        ImageView imageView3 = this.f33917r0;
        float f10 = 0.5f;
        if (imageView3.isEnabled()) {
            f7 = 1.0f;
        } else {
            f7 = 0.5f;
        }
        imageView3.setAlpha(f7);
        ImageView imageView4 = this.f33918s0;
        if (imageView4.isEnabled()) {
            f10 = 1.0f;
        }
        imageView4.setAlpha(f10);
        this.f33919t0.a();
        if (size < 0) {
            this.f33919t0.setText("");
        } else if (size == 0) {
            this.f33919t0.setText(LocaleController.getString(R.string.NoResult));
        } else if (size == 1) {
            this.f33919t0.setText(LocaleController.getString(R.string.OneResult));
        } else {
            this.f33919t0.setText(String.format(LocaleController.getPluralString("CountOfResults", size), Integer.valueOf(i10 + 1), Integer.valueOf(size)));
        }
    }

    public final void i0(boolean z10) {
        boolean z11;
        boolean z12 = false;
        this.f33908h0.g(0, this.f33920u0[0].getTitle(), z10);
        this.f33908h0.f(0, this.f33920u0[0].getSubtitle());
        l0 l0Var = this.f33908h0;
        if (this.f33920u0[0].f() && this.f33920u0[0].getWebView() != null && this.f33920u0[0].getWebView().E) {
            z11 = true;
        } else {
            z11 = false;
        }
        l0Var.e(0, z11);
        this.f33908h0.g(1, this.f33920u0[1].getTitle(), z10);
        this.f33908h0.f(1, this.f33920u0[1].getSubtitle());
        l0 l0Var2 = this.f33908h0;
        if (this.f33920u0[1].f() && this.f33920u0[1].getWebView() != null && this.f33920u0[1].getWebView().E) {
            z12 = true;
        }
        l0Var2.e(1, z12);
    }

    public final void k() {
        this.J0 = false;
        b3 b3Var = this.K0;
        if (b3Var != null) {
            this.f33906f0.removeCallbacks(b3Var);
            this.K0 = null;
        }
        b3 b3Var2 = this.L0;
        if (b3Var2 != null) {
            this.f33906f0.removeCallbacks(b3Var2);
            this.L0 = null;
        }
    }

    public final void m(org.telegram.messenger.g6 g6Var) {
        if (this.I0 == AndroidUtilities.dp(56.0f)) {
            if (g6Var != null) {
                g6Var.run();
                return;
            }
            return;
        }
        ValueAnimator duration = ValueAnimator.ofObject(new IntEvaluator(), Integer.valueOf(this.I0), Integer.valueOf(AndroidUtilities.dp(56.0f))).setDuration(180L);
        duration.setInterpolator(new DecelerateInterpolator());
        duration.addUpdateListener(new r(this, 0));
        duration.addListener(new r0(0, g6Var));
        if (g6Var != null) {
            duration.setDuration(duration.getDuration() / 2);
        }
        duration.start();
    }

    public final void n() {
        long j3;
        y2 y2Var;
        bi.z zVar = this.f33920u0[0].f35102b;
        if (zVar != null && this.W) {
            float measuredHeight = zVar.getMeasuredHeight() / 2.0f;
            Uri uri = null;
            float f7 = 0.0f;
            y2 y2Var2 = null;
            for (int i10 = 0; i10 < zVar.getChildCount(); i10++) {
                View childAt = zVar.getChildAt(i10);
                if (childAt instanceof y2) {
                    float measuredHeight2 = (childAt.getMeasuredHeight() / 2.0f) + childAt.getTop();
                    if (y2Var2 == null || Math.abs(measuredHeight - measuredHeight2) < Math.abs(measuredHeight - f7)) {
                        y2Var2 = (y2) childAt;
                        f7 = measuredHeight2;
                    }
                }
            }
            boolean z10 = PhotoViewer.t1().f30057f;
            if (z10 || ((y2Var = this.f36862x) != null && y2Var != y2Var2 && this.f36861w != null)) {
                VideoPlayerHolderBase videoPlayerHolderBase = this.f36861w;
                if (videoPlayerHolderBase != null) {
                    y2 y2Var3 = this.f36862x;
                    long j10 = y2Var3.L.video_id;
                    z2 a2 = z2.a(videoPlayerHolderBase, y2Var3);
                    y2Var3.c(a2);
                    this.f36863y.k(a2, j10);
                    y2 y2Var4 = this.f36862x;
                    z2 z2Var = y2Var4.M;
                    if (z2Var != null) {
                        Bitmap bitmap = z2Var.f39190b;
                        if (bitmap != null) {
                            y2Var4.e.setImageBitmap(bitmap);
                        }
                        this.f36862x.e(false);
                    }
                    this.f36861w.release(null);
                }
                this.f36861w = null;
                this.f36862x = null;
            }
            if (!z10 && y2Var2 != null) {
                t70 t70Var = y2Var2.f38874a;
                if (y2Var2.O != null && t70Var.f36861w == null) {
                    t70Var.f36861w = new x2(y2Var2).with(y2Var2.f38878n);
                    TLRPC.Document document = y2Var2.O;
                    for (int i11 = 0; i11 < document.attributes.size(); i11++) {
                        if (document.attributes.get(i11) instanceof TLRPC.TL_documentAttributeVideo) {
                            TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) document.attributes.get(i11);
                            y2Var2.h.a(tL_documentAttributeVideo.f17202w / tL_documentAttributeVideo.h, 0);
                        }
                    }
                    TLRPC.WebPage webPage = y2Var2.f38875b.E;
                    if (webPage != null) {
                        uri = FileStreamLoadOperation.prepareUri(((j4) t70Var).X, document, webPage);
                    }
                    if (uri != null) {
                        VideoPlayerHolderBase videoPlayerHolderBase2 = t70Var.f36861w;
                        z2 z2Var2 = y2Var2.M;
                        if (z2Var2 == null) {
                            j3 = 0;
                        } else {
                            j3 = z2Var2.f39189a;
                        }
                        videoPlayerHolderBase2.seekTo(j3);
                        t70Var.f36861w.preparePlayer(uri, true, 1.0f);
                        t70Var.f36861w.play();
                    }
                }
                this.f36862x = y2Var2;
            }
        }
    }

    public final void o(boolean z10, boolean z11) {
        if (this.L != null && !this.T0 && this.V) {
            int i10 = 0;
            if (this.Z != 0 && Math.abs(this.f33902b0 - System.currentTimeMillis()) >= 500) {
                Runnable runnable = this.f33900a0;
                if (runnable != null) {
                    runnable.run();
                    this.f33900a0 = null;
                }
                this.Z = 0;
            }
            if (this.Z == 0) {
                w3 w3Var = this.K;
                if (w3Var != null) {
                    w3Var.dismiss(false);
                    return;
                }
                if (this.P.getVisibility() == 0) {
                    if (this.O != null) {
                        this.P.setVisibility(4);
                        this.S.onCustomViewHidden();
                        this.P.removeView(this.O);
                        this.O = null;
                    } else {
                        org.telegram.ui.Components.o91 o91Var = this.E0;
                        if (o91Var != null && o91Var.T) {
                            o91Var.T = false;
                            o91Var.m();
                            o91Var.l(false);
                        }
                    }
                    if (!z11) {
                        return;
                    }
                }
                if (this.O0.y()) {
                    this.O0.f(false);
                    return;
                }
                l0 l0Var = this.f33908h0;
                if (l0Var.T) {
                    l0Var.h(false);
                } else if (l0Var.W) {
                    l0Var.k(false);
                } else {
                    if (this.F0 != 0) {
                        ConnectionsManager.getInstance(this.X).cancelRequest(this.F0, true);
                        this.F0 = 0;
                        b0(false);
                    }
                    if (this.G0 != 0) {
                        ConnectionsManager.getInstance(this.X).cancelRequest(this.G0, true);
                        this.G0 = 0;
                        b0(false);
                    }
                    U();
                    if (z10 && !z11) {
                        ArrayList arrayList = this.f33904d0;
                        if (arrayList.size() >= 2) {
                            Object z12 = hc.b.z(1, arrayList);
                            if (z12 instanceof a3) {
                                ((a3) z12).a();
                            }
                            if (z12 instanceof TLRPC.WebPage) {
                                org.telegram.ui.web.k2.o((TLRPC.WebPage) z12);
                            }
                            e0(-1, arrayList.get(arrayList.size() - 1), false);
                            return;
                        }
                    }
                    NotificationCenter.getInstance(this.X).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
                    NotificationCenter.getInstance(this.X).removeObserver(this, NotificationCenter.messagePlayingDidReset);
                    NotificationCenter.getInstance(this.X).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
                    NotificationCenter.getInstance(this.X).removeObserver(this, NotificationCenter.messagePlayingDidStart);
                    NotificationCenter.getInstance(this.X).removeObserver(this, NotificationCenter.emojiLoaded);
                    kb0 kb0Var = this.U0;
                    if (kb0Var != null) {
                        kb0Var.destroy();
                        this.U0 = null;
                    }
                    this.M = null;
                    try {
                        org.telegram.ui.ActionBar.h3 h3Var = this.f33911k0;
                        if (h3Var != null) {
                            h3Var.dismiss();
                            this.f33911k0 = null;
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    ArticleViewer$WindowView articleViewer$WindowView = this.f33906f0;
                    Property property = View.ALPHA;
                    animatorSet.playTogether(ObjectAnimator.ofFloat(articleViewer$WindowView, property, 0.0f), ObjectAnimator.ofFloat(this.f33907g0, property, 0.0f), ObjectAnimator.ofFloat(this.f33906f0, View.TRANSLATION_X, 0.0f, AndroidUtilities.dp(56.0f)));
                    this.Z = 2;
                    this.f33900a0 = new b0(this, 7);
                    animatorSet.setDuration(150L);
                    animatorSet.setInterpolator(this.f33903c0);
                    animatorSet.addListener(new bi.h(this, 17));
                    this.f33902b0 = System.currentTimeMillis();
                    this.f33907g0.setLayerType(2, null);
                    animatorSet.start();
                    while (true) {
                        a0.i iVar = this.f36863y;
                        if (i10 < iVar.m()) {
                            z2 z2Var = (z2) iVar.n(i10);
                            Bitmap bitmap = z2Var.f39190b;
                            if (bitmap != null) {
                                bitmap.recycle();
                                z2Var.f39190b = null;
                            }
                            i10++;
                        } else {
                            iVar.b();
                            return;
                        }
                    }
                }
            }
        }
    }

    public final void s() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f33904d0;
            if (i10 < arrayList.size()) {
                Object obj = arrayList.get(i10);
                if (obj instanceof a3) {
                    n3 n3Var = this.f33920u0[0];
                    if (n3Var != null && n3Var.J == obj) {
                        ((a3) obj).c(n3Var);
                    }
                    n3 n3Var2 = this.f33920u0[1];
                    if (n3Var2 != null && n3Var2.J == obj) {
                        ((a3) obj).c(n3Var2);
                    }
                    ((a3) obj).a();
                } else if (obj instanceof TLRPC.WebPage) {
                    org.telegram.ui.web.k2.o((TLRPC.WebPage) obj);
                }
                i10++;
            } else {
                arrayList.clear();
                t();
                return;
            }
        }
    }

    public final void t() {
        ArticleViewer$WindowView articleViewer$WindowView;
        if (this.L != null && (articleViewer$WindowView = this.f33906f0) != null) {
            if (this.K == null) {
                try {
                    if (articleViewer$WindowView.getParent() != null) {
                        ((WindowManager) this.L.getSystemService("window")).removeViewImmediate(this.f33906f0);
                    }
                    this.f33906f0 = null;
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            for (int i10 = 0; i10 < this.N.size(); i10++) {
                ((u1) this.N.get(i10)).a(true);
            }
            this.N.clear();
            try {
                this.L.getWindow().clearFlags(128);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            this.L = null;
            this.M = null;
            f33877c1 = null;
        }
    }

    public j4(org.telegram.ui.ActionBar.p2 p2Var) {
        this.N = new ArrayList();
        this.Y = 1;
        this.f33903c0 = new DecelerateInterpolator(1.5f);
        this.f33904d0 = new ArrayList();
        this.f33922w0 = new Paint();
        this.f33923x0 = new Paint();
        this.f33924y0 = new Paint();
        this.f33925z0 = new Paint();
        this.J0 = false;
        this.K0 = null;
        this.L0 = null;
        this.R0 = new AnimationNotificationsLocker(new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats});
        this.S0 = new k0[2];
        this.W0 = -1;
        b0 b0Var = new b0(this, 2);
        org.telegram.ui.Components.wr wrVar = org.telegram.ui.Components.wr.h;
        this.Z0 = new org.telegram.ui.Components.g5(b0Var, 320L, wrVar);
        this.f33901a1 = new org.telegram.ui.Components.g5(new b0(this, 4), 320L, wrVar);
        this.J = true;
        this.K = new w3(this, p2Var);
        Y(p2Var.getParentActivity(), p2Var);
    }
}
