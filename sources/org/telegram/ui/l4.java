package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.IntEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
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
public final class l4 extends a70 implements NotificationCenter.NotificationCenterDelegate {
    public static TextPaint f39990c1;
    public static TextPaint f39991d1;
    public static TextPaint f39992e1;
    public static TextPaint f39993f1;
    public static TextPaint f39994g1;
    public static TextPaint f39995h1;
    public static TextPaint f39996i1;
    public static TextPaint f39997j1;
    public static Paint f39998k1;
    public static Paint l1;
    public static Paint f39999m1;
    public static Paint f40000n1;
    public static Paint f40001o1;
    public static Paint f40002p1;
    public static Paint f40003q1;
    public static Paint f40004r1;
    public static Paint f40005s1;
    public static Paint f40006t1;
    public static Paint f40007u1;
    public static Paint f40008v1;
    public static Paint f40010x1;
    public org.telegram.ui.Components.g81 A0;
    public int B0;
    public int C0;
    public int D0;
    public int E0;
    public final boolean F;
    public boolean F0;
    public final y3 G;
    public d3 G0;
    public Activity H;
    public d3 H0;
    public org.telegram.ui.ActionBar.o2 I;
    public ve.d I0;
    public final ArrayList J;
    public int J0;
    public View K;
    public org.telegram.ui.Cells.n9 K0;
    public FrameLayout L;
    public org.telegram.ui.Cells.n9 L0;
    public TextureView M;
    public nu0 M0;
    public c5.c N;
    public final AnimationNotificationsLocker N0;
    public WebChromeClient.CustomViewCallback O;
    public final m0[] O0;
    public WindowInsets P;
    public boolean P0;
    public boolean Q;
    public ff.t0 Q0;
    public boolean R;
    public d5.i R0;
    public boolean S;
    public int S0;
    public int T;
    public ValueAnimator T0;
    public int U;
    public float U0;
    public int V;
    public final org.telegram.ui.Components.b5 V0;
    public Runnable W;
    public final org.telegram.ui.Components.b5 W0;
    public long X;
    public final DecelerateInterpolator Y;
    public final ArrayList Z;
    public WindowManager.LayoutParams f40011a0;
    public ArticleViewer$WindowView f40012b0;
    public m0 f40013c0;
    public n0 f40014d0;
    public org.telegram.ui.web.k f40015e0;
    public c0 f40016f0;
    public org.telegram.ui.ActionBar.f3 f40017g0;
    public Paint f40018h0;
    public Drawable f40019i0;
    public Paint f40020j0;
    public boolean f40021k0;
    public float f40022l0;
    public dh.g m0;
    public ImageView f40023n0;
    public ImageView f40024o0;
    public org.telegram.ui.Components.j6 f40025p0;
    public p3[] f40026q0;
    public AnimatorSet f40027r0;
    public final Paint f40028s0;
    public final Paint f40029t0;
    public final Paint f40030u0;
    public final Paint f40031v0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f40032w0;
    public TextView f40033x0;
    public Rect f40034y0;
    public org.telegram.ui.Components.g81 f40035z0;
    public static final HashSet X0 = new HashSet();
    public static volatile l4 Y0 = null;
    public static final v0 Z0 = new v0("innerTranslationX", 0);
    public static final TextPaint f39988a1 = new TextPaint(1);
    public static final t3 f39989b1 = new t3();
    public static final WeakHashMap f40009w1 = new WeakHashMap();

    public l4() {
        this.J = new ArrayList();
        this.U = 1;
        this.Y = new DecelerateInterpolator(1.5f);
        this.Z = new ArrayList();
        this.f40028s0 = new Paint();
        this.f40029t0 = new Paint();
        this.f40030u0 = new Paint();
        this.f40031v0 = new Paint();
        this.F0 = false;
        this.G0 = null;
        this.H0 = null;
        this.N0 = new AnimationNotificationsLocker(new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats});
        this.O0 = new m0[2];
        this.S0 = -1;
        c0 c0Var = new c0(this, 2);
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        this.V0 = new org.telegram.ui.Components.b5(c0Var, 320L, grVar);
        this.W0 = new org.telegram.ui.Components.b5(new c0(this, 4), 320L, grVar);
        this.F = false;
        this.G = null;
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
            for (int i9 = 0; i9 < size; i9++) {
                sb2.append(B(richText.texts.get(i9)));
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

    public static CharSequence C(a70 a70Var, TLRPC.WebPage webPage, View view, TL_iv.RichText richText, TL_iv.RichText richText2, TL_iv.PageBlock pageBlock, int i9) {
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.rz0 rz0Var;
        org.telegram.ui.Components.rz0 rz0Var2;
        TextPaint textPaint = null;
        if (richText2 == null) {
            return null;
        }
        if (richText2 instanceof TL_iv.textFixed) {
            return C(a70Var, webPage, view, richText, ((TL_iv.textFixed) richText2).text, pageBlock, i9);
        }
        if (richText2 instanceof TL_iv.textItalic) {
            return C(a70Var, webPage, view, richText, ((TL_iv.textItalic) richText2).text, pageBlock, i9);
        }
        if (richText2 instanceof TL_iv.textBold) {
            return C(a70Var, webPage, view, richText, ((TL_iv.textBold) richText2).text, pageBlock, i9);
        }
        if (richText2 instanceof TL_iv.textUnderline) {
            return C(a70Var, webPage, view, richText, ((TL_iv.textUnderline) richText2).text, pageBlock, i9);
        }
        if (richText2 instanceof TL_iv.textStrike) {
            return C(a70Var, webPage, view, richText, ((TL_iv.textStrike) richText2).text, pageBlock, i9);
        }
        if (richText2 instanceof TL_iv.textEmail) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C(a70Var, webPage, view, richText, ((TL_iv.textEmail) richText2).text, pageBlock, i9));
            MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), MetricAffectingSpan.class);
            if (spannableStringBuilder.length() != 0) {
                if (metricAffectingSpanArr == null || metricAffectingSpanArr.length == 0) {
                    textPaint = E(a70Var, richText, richText2, pageBlock);
                }
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.rz0(textPaint, "mailto:" + F(richText2)), 0, spannableStringBuilder.length(), 33);
            }
            return spannableStringBuilder;
        }
        long j10 = 0;
        if (richText2 instanceof TL_iv.textUrl) {
            TL_iv.textUrl texturl = (TL_iv.textUrl) richText2;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(C(a70Var, webPage, view, richText, texturl.text, pageBlock, i9));
            MetricAffectingSpan[] metricAffectingSpanArr2 = (MetricAffectingSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), MetricAffectingSpan.class);
            if (metricAffectingSpanArr2 == null || metricAffectingSpanArr2.length == 0) {
                textPaint = E(a70Var, richText, richText2, pageBlock);
            }
            if (texturl.webpage_id != 0) {
                rz0Var2 = new org.telegram.ui.Components.rz0(textPaint, F(richText2));
            } else {
                rz0Var2 = new org.telegram.ui.Components.rz0(textPaint, F(richText2));
            }
            if (spannableStringBuilder2.length() != 0) {
                spannableStringBuilder2.setSpan(rz0Var2, 0, spannableStringBuilder2.length(), 33);
            }
            return spannableStringBuilder2;
        } else if (richText2 instanceof TL_iv.textPlain) {
            return ((TL_iv.textPlain) richText2).text;
        } else {
            if (richText2 instanceof TL_iv.textAnchor) {
                TL_iv.textAnchor textanchor = (TL_iv.textAnchor) richText2;
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(C(a70Var, webPage, view, richText, textanchor.text, pageBlock, i9));
                String str = textanchor.name;
                ?? metricAffectingSpan = new MetricAffectingSpan();
                metricAffectingSpan.f35180a = str.toLowerCase();
                spannableStringBuilder3.setSpan(metricAffectingSpan, 0, spannableStringBuilder3.length(), 17);
                return spannableStringBuilder3;
            } else if (richText2 instanceof TL_iv.textEmpty) {
                return "";
            } else {
                if (richText2 instanceof TL_iv.textConcat) {
                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                    int size = richText2.texts.size();
                    int i10 = 0;
                    while (i10 < size) {
                        TL_iv.RichText richText3 = richText2.texts.get(i10);
                        TL_iv.RichText A = A(richText3);
                        if (i9 >= 0 && (richText3 instanceof TL_iv.textUrl) && ((TL_iv.textUrl) richText3).webpage_id != j10) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11 && spannableStringBuilder4.length() != 0 && spannableStringBuilder4.charAt(spannableStringBuilder4.length() - 1) != '\n') {
                            spannableStringBuilder4.append((CharSequence) " ");
                            spannableStringBuilder4.setSpan(new Object(), spannableStringBuilder4.length() - 1, spannableStringBuilder4.length(), 33);
                        }
                        CharSequence C = C(a70Var, webPage, view, richText, richText3, pageBlock, i9);
                        int D = D(A);
                        int length = spannableStringBuilder4.length();
                        spannableStringBuilder4.append(C);
                        if (D != 0 && !(C instanceof SpannableStringBuilder)) {
                            if ((D & 8) == 0 && (D & 512) == 0) {
                                if (length != spannableStringBuilder4.length()) {
                                    TextPaint E = E(a70Var, richText, A, pageBlock);
                                    ?? metricAffectingSpan2 = new MetricAffectingSpan();
                                    metricAffectingSpan2.f32041a = E;
                                    spannableStringBuilder4.setSpan(metricAffectingSpan2, length, spannableStringBuilder4.length(), 33);
                                }
                            } else {
                                String F = F(richText3);
                                if (F == null) {
                                    F = F(richText);
                                }
                                if ((D & 512) != 0) {
                                    rz0Var = new org.telegram.ui.Components.rz0(E(a70Var, richText, A, pageBlock), F);
                                } else {
                                    rz0Var = new org.telegram.ui.Components.rz0(E(a70Var, richText, A, pageBlock), F);
                                }
                                if (length != spannableStringBuilder4.length()) {
                                    spannableStringBuilder4.setSpan(rz0Var, length, spannableStringBuilder4.length(), 33);
                                }
                            }
                        }
                        if (z11 && i10 != size - 1) {
                            spannableStringBuilder4.append((CharSequence) " ");
                            spannableStringBuilder4.setSpan(new Object(), spannableStringBuilder4.length() - 1, spannableStringBuilder4.length(), 33);
                        }
                        i10++;
                        j10 = 0;
                    }
                    return spannableStringBuilder4;
                } else if (richText2 instanceof TL_iv.textSubscript) {
                    return C(a70Var, webPage, view, richText, ((TL_iv.textSubscript) richText2).text, pageBlock, i9);
                } else {
                    if (richText2 instanceof TL_iv.textSuperscript) {
                        return C(a70Var, webPage, view, richText, ((TL_iv.textSuperscript) richText2).text, pageBlock, i9);
                    }
                    if (richText2 instanceof TL_iv.textMarked) {
                        SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(C(a70Var, webPage, view, richText, ((TL_iv.textMarked) richText2).text, pageBlock, i9));
                        MetricAffectingSpan[] metricAffectingSpanArr3 = (MetricAffectingSpan[]) spannableStringBuilder5.getSpans(0, spannableStringBuilder5.length(), MetricAffectingSpan.class);
                        if (spannableStringBuilder5.length() != 0) {
                            if (metricAffectingSpanArr3 == null || metricAffectingSpanArr3.length == 0) {
                                textPaint = E(a70Var, richText, richText2, pageBlock);
                            }
                            ?? metricAffectingSpan3 = new MetricAffectingSpan();
                            metricAffectingSpan3.f31782a = textPaint;
                            spannableStringBuilder5.setSpan(metricAffectingSpan3, 0, spannableStringBuilder5.length(), 33);
                        }
                        return spannableStringBuilder5;
                    } else if (richText2 instanceof TL_iv.textSpoiler) {
                        SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder(C(a70Var, webPage, view, richText, ((TL_iv.textSpoiler) richText2).text, pageBlock, i9));
                        if (spannableStringBuilder6.length() != 0) {
                            ?? obj = new Object();
                            obj.f34062a |= 256;
                            spannableStringBuilder6.setSpan(new org.telegram.ui.Components.wz0(obj, 0), 0, spannableStringBuilder6.length(), 33);
                        }
                        return spannableStringBuilder6;
                    } else if (richText2 instanceof TL_iv.textPhone) {
                        SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder(C(a70Var, webPage, view, richText, ((TL_iv.textPhone) richText2).text, pageBlock, i9));
                        MetricAffectingSpan[] metricAffectingSpanArr4 = (MetricAffectingSpan[]) spannableStringBuilder7.getSpans(0, spannableStringBuilder7.length(), MetricAffectingSpan.class);
                        if (spannableStringBuilder7.length() != 0) {
                            if (metricAffectingSpanArr4 == null || metricAffectingSpanArr4.length == 0) {
                                textPaint = E(a70Var, richText, richText2, pageBlock);
                            }
                            spannableStringBuilder7.setSpan(new org.telegram.ui.Components.rz0(textPaint, "tel:" + F(richText2)), 0, spannableStringBuilder7.length(), 33);
                        }
                        return spannableStringBuilder7;
                    } else {
                        if (richText2 instanceof TL_iv.textImage) {
                            TL_iv.textImage textimage = (TL_iv.textImage) richText2;
                            TLRPC.Document a2 = i4.a(webPage, textimage.document_id);
                            TLRPC.Photo e10 = i4.e(webPage, textimage.photo_id);
                            if (a2 != null) {
                                SpannableStringBuilder spannableStringBuilder8 = new SpannableStringBuilder("*");
                                int dp = AndroidUtilities.dp(textimage.f22604w);
                                int dp2 = AndroidUtilities.dp(textimage.h);
                                int abs = Math.abs(i9);
                                if (dp > abs) {
                                    dp2 = (int) (dp2 * (abs / dp));
                                    dp = abs;
                                }
                                if (view != null) {
                                    int i11 = org.telegram.ui.ActionBar.f6.f23001d6;
                                    ((l4) a70Var).getClass();
                                    if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.f6.w0(null, i11, false)) <= 0.705f) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    ?? replacementSpan = new ReplacementSpan();
                                    Locale locale = Locale.US;
                                    String str2 = dp + "_" + dp2 + "_i";
                                    replacementSpan.f31480b = dp;
                                    replacementSpan.f31481c = dp2;
                                    boolean z12 = z10;
                                    ImageReceiver imageReceiver = new ImageReceiver(view);
                                    replacementSpan.f31479a = imageReceiver;
                                    imageReceiver.setInvalidateAll(true);
                                    if (z12) {
                                        imageReceiver.setDelegate(new org.telegram.ui.Components.if0(12));
                                    }
                                    imageReceiver.setImage(ImageLocation.getForDocument(a2), str2, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(a2.thumbs, 90), a2), str2, -1L, null, webPage, 1);
                                    spannableStringBuilder8.setSpan(replacementSpan, 0, spannableStringBuilder8.length(), 33);
                                }
                                return spannableStringBuilder8;
                            } else if (e10 instanceof org.telegram.ui.web.c2) {
                                org.telegram.ui.web.c2 c2Var = (org.telegram.ui.web.c2) e10;
                                SpannableStringBuilder spannableStringBuilder9 = new SpannableStringBuilder("*");
                                int dp3 = AndroidUtilities.dp(textimage.f22604w);
                                int dp4 = AndroidUtilities.dp(textimage.h);
                                int abs2 = Math.abs(i9);
                                if (dp3 > abs2) {
                                    dp4 = (int) (dp4 * (abs2 / dp3));
                                    dp3 = abs2;
                                }
                                if (view != null) {
                                    ?? replacementSpan2 = new ReplacementSpan();
                                    replacementSpan2.f31480b = dp3;
                                    replacementSpan2.f31481c = dp4;
                                    ImageReceiver imageReceiver2 = new ImageReceiver(view);
                                    replacementSpan2.f31479a = imageReceiver2;
                                    imageReceiver2.setInvalidateAll(true);
                                    org.telegram.ui.web.d2.g(c2Var, imageReceiver2, new org.telegram.ui.Components.hc(13));
                                    spannableStringBuilder9.setSpan(replacementSpan2, 0, spannableStringBuilder9.length(), 33);
                                }
                                return spannableStringBuilder9;
                            }
                        } else if (richText2 instanceof TL_iv.textMath) {
                            TL_iv.textMath textmath = (TL_iv.textMath) richText2;
                            if (textmath.bitmap == null && !textmath.tried) {
                                textmath.tried = true;
                                qh.q a3 = qh.q.a(textmath.source, AndroidUtilities.dp(20.0f), true);
                                if (a3 != null) {
                                    textmath.f22605w = a3.f46619b;
                                    textmath.h = a3.f46620c;
                                    textmath.depth = a3.d;
                                    textmath.bitmap = a3.f46618a;
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
                                int i12 = textmath.f22605w;
                                int i13 = textmath.h;
                                int i14 = org.telegram.ui.ActionBar.f6.G6;
                                ((l4) a70Var).getClass();
                                spannableStringBuilder10.setSpan(new org.telegram.ui.Components.oz0(view, bitmap, i12, i13, org.telegram.ui.ActionBar.f6.w0(null, i14, false), textmath.depth), 0, spannableStringBuilder10.length(), 33);
                                String str4 = textmath.source;
                                if (str4 != null && !str4.isEmpty()) {
                                    spannableStringBuilder10.setSpan(new org.telegram.ui.Cells.t9(textmath.source), 0, spannableStringBuilder10.length(), 33);
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

    public static TextPaint E(a70 a70Var, TL_iv.RichText richText, TL_iv.RichText richText2, TL_iv.PageBlock pageBlock) {
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
        l4 l4Var = (l4) a70Var;
        l4Var.getClass();
        t3 t3Var = f39989b1;
        t3Var.getClass();
        SparseArray sparseArray = t3Var.f42842x;
        SparseArray sparseArray2 = t3Var.f42841w;
        SparseArray sparseArray3 = t3Var.f42839t;
        SparseArray sparseArray4 = t3Var.f42824c;
        SparseArray sparseArray5 = t3Var.f42823b;
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
            b10 = a70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockMap) {
            TL_iv.RichText richText4 = ((TL_iv.pageBlockMap) pageBlock).caption.text;
            if (richText4 != richText2 && richText4 != richText) {
                dp6 = AndroidUtilities.dp(12.0f);
            } else {
                dp6 = AndroidUtilities.dp(14.0f);
                sparseArray4 = sparseArray5;
            }
            dp8 = dp6;
            b10 = a70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockTitle) {
            sparseArray4 = t3Var.d;
            dp8 = AndroidUtilities.dp(23.0f);
            b10 = a70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockKicker) {
            sparseArray4 = t3Var.f42825e;
            dp8 = AndroidUtilities.dp(14.0f);
            b10 = a70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockAuthorDate) {
            sparseArray4 = t3Var.f42834o;
            dp8 = AndroidUtilities.dp(14.0f);
            b10 = a70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockFooter) {
            sparseArray4 = t3Var.f42835p;
            dp8 = AndroidUtilities.dp(14.0f);
            b10 = a70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockSubtitle) {
            sparseArray4 = t3Var.f42827g;
            dp8 = AndroidUtilities.dp(20.0f);
            b10 = a70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeader) {
            sparseArray4 = t3Var.f42826f;
            dp8 = AndroidUtilities.dp(20.0f);
            b10 = a70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockSubheader) {
            sparseArray4 = t3Var.h;
            dp8 = AndroidUtilities.dp(17.0f);
            b10 = a70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading1) {
            sparseArray4 = t3Var.f42828i;
            dp8 = AndroidUtilities.dp(18.0f);
            b10 = a70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading2) {
            sparseArray4 = t3Var.f42829j;
            dp8 = AndroidUtilities.dp(16.0f);
            b10 = a70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading3) {
            sparseArray4 = t3Var.f42830k;
            dp8 = AndroidUtilities.dp(15.0f);
            b10 = a70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading4) {
            sparseArray4 = t3Var.f42831l;
            dp8 = AndroidUtilities.dp(14.0f);
            b10 = a70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading5) {
            sparseArray4 = t3Var.f42832m;
            dp8 = AndroidUtilities.dp(13.0f);
            b10 = a70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading6) {
            sparseArray4 = t3Var.f42833n;
            dp8 = AndroidUtilities.dp(12.0f);
            b10 = a70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) pageBlock;
            if (pageblockblockquote.text == richText) {
                dp8 = AndroidUtilities.dp(15.0f);
                b10 = a70Var.b();
                sparseArray4 = sparseArray3;
            } else {
                if (pageblockblockquote.caption == richText) {
                    dp8 = AndroidUtilities.dp(14.0f);
                    b10 = a70Var.a();
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
                b10 = a70Var.b();
                sparseArray4 = sparseArray3;
            } else {
                if (pageblockpullquote.caption == richText) {
                    dp8 = AndroidUtilities.dp(14.0f);
                    b10 = a70Var.a();
                    sparseArray3 = sparseArray5;
                    sparseArray4 = sparseArray3;
                }
                b10 = -65536;
                sparseArray3 = null;
                sparseArray4 = sparseArray3;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
            sparseArray4 = t3Var.f42838s;
            dp8 = AndroidUtilities.dp(14.0f);
            b10 = a70Var.b();
            D |= 4;
        } else if (pageBlock instanceof TL_iv.pageBlockParagraph) {
            sparseArray4 = t3Var.f42836q;
            dp8 = AndroidUtilities.dp(16.0f);
            b10 = a70Var.b();
        } else if (L(pageBlock)) {
            sparseArray4 = t3Var.f42837r;
            dp8 = AndroidUtilities.dp(16.0f);
            b10 = a70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockEmbed) {
            TL_iv.RichText richText5 = ((TL_iv.pageBlockEmbed) pageBlock).caption.text;
            if (richText5 != richText2 && richText5 != richText) {
                dp5 = AndroidUtilities.dp(12.0f);
            } else {
                dp5 = AndroidUtilities.dp(14.0f);
                sparseArray4 = sparseArray5;
            }
            dp8 = dp5;
            b10 = a70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
            TL_iv.RichText richText6 = ((TL_iv.pageBlockSlideshow) pageBlock).caption.text;
            if (richText6 != richText2 && richText6 != richText) {
                dp4 = AndroidUtilities.dp(12.0f);
            } else {
                dp4 = AndroidUtilities.dp(14.0f);
                sparseArray4 = sparseArray5;
            }
            dp8 = dp4;
            b10 = a70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockCollage) {
            TL_iv.RichText richText7 = ((TL_iv.pageBlockCollage) pageBlock).caption.text;
            if (richText7 != richText2 && richText7 != richText) {
                dp3 = AndroidUtilities.dp(12.0f);
            } else {
                dp3 = AndroidUtilities.dp(14.0f);
                sparseArray4 = sparseArray5;
            }
            dp8 = dp3;
            b10 = a70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockEmbedPost) {
            TL_iv.PageCaption pageCaption = ((TL_iv.pageBlockEmbedPost) pageBlock).caption;
            if (richText2 == pageCaption.text) {
                dp8 = AndroidUtilities.dp(14.0f);
                b10 = a70Var.a();
                sparseArray4 = sparseArray5;
            } else if (richText2 == pageCaption.credit) {
                dp8 = AndroidUtilities.dp(12.0f);
                b10 = a70Var.a();
            } else {
                if (richText2 != null) {
                    sparseArray4 = t3Var.f42840u;
                    dp8 = AndroidUtilities.dp(14.0f);
                    b10 = a70Var.b();
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
                b10 = a70Var.b();
            } else if (pageBlock instanceof TL_iv.pageBlockAudio) {
                if (richText2 == ((TL_iv.pageBlockAudio) pageBlock).caption.text) {
                    dp = AndroidUtilities.dp(14.0f);
                    sparseArray = sparseArray2;
                } else {
                    dp = AndroidUtilities.dp(12.0f);
                }
                dp8 = dp;
                b10 = a70Var.b();
            } else if (pageBlock instanceof TL_iv.pageBlockRelatedArticles) {
                sparseArray4 = t3Var.f42843y;
                dp8 = AndroidUtilities.dp(15.0f);
                b10 = a70Var.a();
            } else if (pageBlock instanceof TL_iv.pageBlockDetails) {
                sparseArray4 = t3Var.f42844z;
                dp8 = AndroidUtilities.dp(15.0f);
                b10 = a70Var.b();
            } else {
                if (pageBlock instanceof TL_iv.pageBlockTable) {
                    sparseArray4 = t3Var.A;
                    dp8 = AndroidUtilities.dp(15.0f);
                    b10 = a70Var.b();
                }
                b10 = -65536;
                sparseArray4 = null;
            }
            sparseArray4 = sparseArray;
        }
        int i9 = D & 256;
        if (i9 != 0 || (D & 128) != 0) {
            dp8 -= AndroidUtilities.dp(4.0f);
        }
        if (sparseArray4 == null) {
            if (t3Var.f42822a == null) {
                TextPaint textPaint = new TextPaint(1);
                t3Var.f42822a = textPaint;
                textPaint.setColor(-65536);
            }
            t3Var.f42822a.setTextSize(AndroidUtilities.dp(14.0f));
            return t3Var.f42822a;
        }
        TextPaint textPaint2 = (TextPaint) sparseArray4.get(D);
        if (textPaint2 == null) {
            textPaint2 = new TextPaint(1);
            if ((D & 4) != 0) {
                textPaint2.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
            } else if (pageBlock instanceof TL_iv.pageBlockRelatedArticles) {
                textPaint2.setTypeface(AndroidUtilities.bold());
            } else if (a70Var.f36373a != 1 && !(pageBlock instanceof TL_iv.pageBlockTitle) && !(pageBlock instanceof TL_iv.pageBlockKicker) && !(pageBlock instanceof TL_iv.pageBlockHeader) && !(pageBlock instanceof TL_iv.pageBlockSubtitle) && !(pageBlock instanceof TL_iv.pageBlockSubheader) && !K(pageBlock)) {
                int i10 = D & 1;
                if (i10 != 0 && (D & 2) != 0) {
                    textPaint2.setTypeface(AndroidUtilities.getTypeface("fonts/rmediumitalic.ttf"));
                } else if (i10 != 0) {
                    textPaint2.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
                } else if ((D & 2) != 0) {
                    textPaint2.setTypeface(AndroidUtilities.getTypeface("fonts/ritalic.ttf"));
                }
            } else if (!(pageBlock instanceof TL_iv.pageBlockTitle) && !(pageBlock instanceof TL_iv.pageBlockHeader) && !(pageBlock instanceof TL_iv.pageBlockSubtitle) && !(pageBlock instanceof TL_iv.pageBlockSubheader) && !K(pageBlock)) {
                int i11 = D & 1;
                if (i11 != 0 && (D & 2) != 0) {
                    textPaint2.setTypeface(Typeface.create("serif", 3));
                } else if (i11 != 0) {
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
                l4Var.getClass();
                b10 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.J6, false);
            }
            if (i9 != 0) {
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
        if (Y0 != null) {
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
        if (!(pageBlock instanceof b4) && !(pageBlock instanceof d4)) {
            return false;
        }
        return true;
    }

    public static boolean O(z3 z3Var) {
        boolean z10;
        TL_iv.PageBlock z11 = z(z3Var.f45014a);
        if (z11 instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) z11;
            if (!pageblockdetails.open) {
                pageblockdetails.open = true;
                return true;
            }
        } else if (z11 instanceof z3) {
            z3 z3Var2 = (z3) z11;
            TL_iv.PageBlock z12 = z(z3Var2.f45015b);
            if (z12 instanceof TL_iv.pageBlockDetails) {
                TL_iv.pageBlockDetails pageblockdetails2 = (TL_iv.pageBlockDetails) z12;
                if (!pageblockdetails2.open) {
                    pageblockdetails2.open = true;
                    z10 = true;
                    if (!O(z3Var2) || z10) {
                        return true;
                    }
                }
            }
            z10 = false;
            if (!O(z3Var2)) {
            }
            return true;
        }
        return false;
    }

    public static void T(a70 a70Var) {
        if (a70Var.f36374b != null || a70Var.f36377f != null) {
            View view = a70Var.f36377f;
            a70Var.f36375c.d(true);
            a70Var.f36374b = null;
            a70Var.d = null;
            a70Var.f36377f = null;
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

    public static void f(String str, int i9, FrameLayout frameLayout, y3 y3Var, org.telegram.ui.ActionBar.b6 b6Var) {
        String s10 = org.telegram.ui.web.y0.s(str);
        long clientUserId = UserConfig.getInstance(i9).getClientUserId();
        SendMessagesHelper.getInstance(i9).sendMessage(SendMessagesHelper.SendMessageParams.of(s10, clientUserId));
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
        tL_message.peer_id = tL_peerUser;
        tL_peerUser.user_id = clientUserId;
        TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
        tL_message.from_id = tL_peerUser2;
        tL_peerUser2.user_id = clientUserId;
        tL_message.message = s10;
        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
        tL_message.media = tL_messageMediaWebPage;
        tL_messageMediaWebPage.webpage = new TLRPC.TL_webPage();
        TLRPC.WebPage webPage = tL_message.media.webpage;
        webPage.url = s10;
        webPage.display_url = s10;
        NotificationCenter.getInstance(i9).lambda$postNotificationNameOnUIThread$1(NotificationCenter.bookmarkAdded, new MessageObject(i9, tL_message, false, false));
        new org.telegram.ui.Components.oc(frameLayout, b6Var).Q(R.raw.saved_messages, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.WebBookmarkedToast), new bg.i2(y3Var, clientUserId, 20))).k(true);
    }

    public static void g0(l4 l4Var) {
        TextPaint textPaint = f39996i1;
        if (textPaint != null) {
            textPaint.setColor(l4Var.b());
        }
        TextPaint textPaint2 = f39997j1;
        if (textPaint2 != null) {
            textPaint2.setColor(l4Var.b());
        }
        TextPaint textPaint3 = f39990c1;
        if (textPaint3 != null) {
            textPaint3.setColor(l4Var.b());
        }
        TextPaint textPaint4 = f39992e1;
        if (textPaint4 != null) {
            textPaint4.setColor(l4Var.b());
        }
        TextPaint textPaint5 = f39993f1;
        if (textPaint5 != null) {
            textPaint5.setColor(-1);
        }
        TextPaint textPaint6 = f39994g1;
        if (textPaint6 != null) {
            textPaint6.setColor(l4Var.b());
        }
        TextPaint textPaint7 = f39995h1;
        if (textPaint7 != null) {
            textPaint7.setColor(l4Var.a());
        }
        TextPaint textPaint8 = f39991d1;
        if (textPaint8 != null) {
            textPaint8.setColor(l4Var.a());
        }
        r(l4Var, true);
        t3 t3Var = f39989b1;
        t3.a(l4Var, t3Var.d);
        t3.a(l4Var, t3Var.f42825e);
        t3.a(l4Var, t3Var.f42827g);
        t3.a(l4Var, t3Var.f42826f);
        t3.a(l4Var, t3Var.h);
        t3.a(l4Var, t3Var.f42828i);
        t3.a(l4Var, t3Var.f42829j);
        t3.a(l4Var, t3Var.f42830k);
        t3.a(l4Var, t3Var.f42831l);
        t3.a(l4Var, t3Var.f42832m);
        t3.a(l4Var, t3Var.f42833n);
        t3.a(l4Var, t3Var.f42839t);
        t3.a(l4Var, t3Var.f42838s);
        t3.a(l4Var, t3Var.f42836q);
        t3.a(l4Var, t3Var.f42837r);
        t3.a(l4Var, t3Var.f42840u);
        t3.a(l4Var, t3Var.f42841w);
        t3.a(l4Var, t3Var.f42842x);
        t3.a(l4Var, t3Var.f42823b);
        t3.a(l4Var, t3Var.f42824c);
        t3.a(l4Var, t3Var.f42834o);
        t3.a(l4Var, t3Var.f42835p);
        t3.a(l4Var, t3Var.v);
        t3.a(l4Var, t3Var.f42843y);
        t3.a(l4Var, t3Var.f42844z);
        t3.a(l4Var, t3Var.A);
    }

    public static SpannableStringBuilder i(int i9, CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (charSequence != null) {
            spannableStringBuilder.append(charSequence);
        }
        if (spannableStringBuilder.length() > 0) {
            spannableStringBuilder.append((CharSequence) ", ");
        }
        spannableStringBuilder.append((CharSequence) LocaleController.getString(i9));
        return spannableStringBuilder;
    }

    public static CharSequence j(a70 a70Var, j4 j4Var, e3 e3Var) {
        StaticLayout staticLayout;
        if (e3Var != null && (staticLayout = e3Var.d) != null) {
            SpannableStringBuilder spannableStringBuilder = e3Var.f37808y;
            if (spannableStringBuilder != null) {
                return spannableStringBuilder;
            }
            CharSequence text = staticLayout.getText();
            if (!(text instanceof Spannable)) {
                return text;
            }
            Spannable spannable = (Spannable) text;
            org.telegram.ui.Components.rz0[] rz0VarArr = (org.telegram.ui.Components.rz0[]) spannable.getSpans(0, spannable.length(), org.telegram.ui.Components.rz0.class);
            SpannableStringBuilder spannableStringBuilder2 = text;
            if (rz0VarArr != null) {
                spannableStringBuilder2 = text;
                if (rz0VarArr.length != 0) {
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannable);
                    for (org.telegram.ui.Components.rz0 rz0Var : rz0VarArr) {
                        int spanStart = spannableStringBuilder3.getSpanStart(rz0Var);
                        int spanEnd = spannableStringBuilder3.getSpanEnd(rz0Var);
                        if (spanStart >= 0 && spanEnd > spanStart) {
                            spannableStringBuilder3.setSpan(new q0(a70Var, j4Var, rz0Var, 0), spanStart, spanEnd, 33);
                        }
                    }
                    e3Var.f37808y = spannableStringBuilder3;
                    spannableStringBuilder2 = spannableStringBuilder3;
                }
            }
            return spannableStringBuilder2;
        }
        return null;
    }

    public static TL_iv.PageBlock j0(TL_iv.PageBlock pageBlock, z3 z3Var) {
        if (pageBlock instanceof b4) {
            b4 b4Var = (b4) pageBlock;
            b4 b4Var2 = new b4();
            b4Var2.f36625a = b4Var.f36625a;
            b4Var2.f36626b = b4Var.f36626b;
            b4Var2.f36627c = b4Var.f36627c;
            b4Var2.d = j0(b4Var.d, z3Var);
            return b4Var2;
        } else if (pageBlock instanceof d4) {
            d4 d4Var = (d4) pageBlock;
            d4 d4Var2 = new d4();
            d4Var2.f37395a = d4Var.f37395a;
            d4Var2.f37396b = d4Var.f37396b;
            d4Var2.f37397c = d4Var.f37397c;
            d4Var2.d = j0(d4Var.d, z3Var);
            return d4Var2;
        } else {
            return z3Var;
        }
    }

    public static boolean l(org.telegram.ui.a70 r25, org.telegram.ui.j4 r26, android.view.MotionEvent r27, android.view.View r28, org.telegram.ui.e3 r29, int r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l4.l(org.telegram.ui.a70, org.telegram.ui.j4, android.view.MotionEvent, android.view.View, org.telegram.ui.e3, int, int):boolean");
    }

    public static org.telegram.ui.e3 p(org.telegram.ui.a70 r20, android.view.View r21, java.lang.CharSequence r22, org.telegram.tgnet.tl.TL_iv.RichText r23, int r24, int r25, org.telegram.tgnet.tl.TL_iv.PageBlock r26, android.text.Layout.Alignment r27, int r28, org.telegram.ui.j4 r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l4.p(org.telegram.ui.a70, android.view.View, java.lang.CharSequence, org.telegram.tgnet.tl.TL_iv$RichText, int, int, org.telegram.tgnet.tl.TL_iv$PageBlock, android.text.Layout$Alignment, int, org.telegram.ui.j4):org.telegram.ui.e3");
    }

    public static e3 q(a70 a70Var, View view, CharSequence charSequence, TL_iv.RichText richText, int i9, int i10, TL_iv.PageBlock pageBlock, j4 j4Var) {
        return p(a70Var, view, charSequence, richText, i9, i10, pageBlock, Layout.Alignment.ALIGN_NORMAL, 0, j4Var);
    }

    public static void r(l4 l4Var, boolean z10) {
        int i9;
        if (f39999m1 == null) {
            f39999m1 = new Paint();
            l1 = new Paint();
            Paint paint = new Paint(1);
            f40001o1 = paint;
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            f40001o1.setStrokeWidth(AndroidUtilities.dp(1.0f));
            Paint paint2 = new Paint();
            f40002p1 = paint2;
            paint2.setStyle(style);
            f40002p1.setStrokeWidth(AndroidUtilities.dp(1.0f) / 2.0f);
            f40003q1 = new Paint();
            f40004r1 = new Paint();
            f40005s1 = new Paint();
            f40006t1 = new Paint(1);
            f40007u1 = new Paint(1);
            f39998k1 = new Paint();
            f40000n1 = new Paint();
            f40008v1 = new Paint(1);
        } else if (!z10) {
            return;
        }
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false);
        float green = Color.green(w02) * 0.7152f;
        float y10 = e2.c.y(Color.blue(w02), 0.0722f, green + (Color.red(w02) * 0.2126f), 255.0f);
        Paint paint3 = f40007u1;
        if (y10 <= 0.705f) {
            i9 = -3041234;
        } else {
            i9 = -6551;
        }
        paint3.setColor(i9);
        Paint paint4 = f40006t1;
        int i10 = org.telegram.ui.ActionBar.f6.K6;
        paint4.setColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false) & 872415231);
        f40006t1.setPathEffect(org.telegram.ui.Components.f80.c());
        f40005s1.setColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false) & 872415231);
        f40005s1.setPathEffect(org.telegram.ui.Components.f80.c());
        Paint paint5 = f40002p1;
        int i11 = org.telegram.ui.ActionBar.f6.f23127k6;
        paint5.setColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
        f40001o1.setColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
        f39998k1.setColor(251658240);
        f40000n1.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23002d7, false));
        f40008v1.setColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false) & 872415231);
        f40008v1.setPathEffect(org.telegram.ui.Components.f80.c());
        int w03 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.M6, false);
        int red = Color.red(w03);
        int green2 = Color.green(w03);
        int blue = Color.blue(w03);
        f40004r1.setColor(Color.argb(20, red, green2, blue));
        f40003q1.setColor(Color.argb(34, red, green2, blue));
        int w04 = org.telegram.ui.ActionBar.f6.w0(null, i10, false);
        l1.setColor(Color.argb(20, Color.red(w04), Color.green(w04), Color.blue(w04)));
        f39999m1.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Uc, false));
    }

    public static void u(Canvas canvas, a70 a70Var, TL_iv.PageBlock pageBlock, int i9) {
        int i10;
        if (pageBlock != null && a70Var != null && f39999m1 != null) {
            int i11 = 0;
            if (pageBlock.bottom) {
                i10 = AndroidUtilities.dp(6.0f);
            } else {
                i10 = 0;
            }
            int i12 = i9 - i10;
            int i13 = pageBlock.quoteLevels;
            if (i13 == 0) {
                if (pageBlock.level > 0) {
                    int dp = AndroidUtilities.dp(18);
                    canvas.drawRect(dp, 0.0f, AndroidUtilities.dp(2.0f) + dp, i12, f39999m1);
                    return;
                }
                return;
            }
            while (i13 != 0) {
                if ((i13 & 1) != 0) {
                    int dp2 = AndroidUtilities.dp((i11 * 14) + 18);
                    canvas.drawRect(dp2, 0.0f, AndroidUtilities.dp(2.0f) + dp2, i12, f39999m1);
                }
                i13 >>>= 1;
                i11++;
            }
        }
    }

    public static void v(org.telegram.ui.a70 r2, android.graphics.Canvas r3, org.telegram.ui.Cells.m9 r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l4.v(org.telegram.ui.a70, android.graphics.Canvas, org.telegram.ui.Cells.m9, int):void");
    }

    public static TL_iv.RichText w(int i9, TL_iv.PageBlock pageBlock) {
        if (i9 == 2) {
            TL_iv.RichText w8 = w(0, pageBlock);
            if (w8 instanceof TL_iv.textEmpty) {
                w8 = null;
            }
            TL_iv.RichText w10 = w(1, pageBlock);
            if (w10 instanceof TL_iv.textEmpty) {
                w10 = null;
            }
            if (w8 != null && w10 == null) {
                return w8;
            }
            if (w8 == null && w10 != null) {
                return w10;
            }
            if (w8 != null && w10 != null) {
                TL_iv.textPlain textplain = new TL_iv.textPlain();
                textplain.text = " ";
                TL_iv.textConcat textconcat = new TL_iv.textConcat();
                textconcat.texts.add(w8);
                textconcat.texts.add(textplain);
                textconcat.texts.add(w10);
                return textconcat;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockEmbedPost) {
            TL_iv.pageBlockEmbedPost pageblockembedpost = (TL_iv.pageBlockEmbedPost) pageBlock;
            if (i9 == 0) {
                return pageblockembedpost.caption.text;
            }
            if (i9 == 1) {
                return pageblockembedpost.caption.credit;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
            TL_iv.pageBlockSlideshow pageblockslideshow = (TL_iv.pageBlockSlideshow) pageBlock;
            if (i9 == 0) {
                return pageblockslideshow.caption.text;
            }
            if (i9 == 1) {
                return pageblockslideshow.caption.credit;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            TL_iv.pageBlockPhoto pageblockphoto = (TL_iv.pageBlockPhoto) pageBlock;
            if (i9 == 0) {
                return pageblockphoto.caption.text;
            }
            if (i9 == 1) {
                return pageblockphoto.caption.credit;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockCollage) {
            TL_iv.pageBlockCollage pageblockcollage = (TL_iv.pageBlockCollage) pageBlock;
            if (i9 == 0) {
                return pageblockcollage.caption.text;
            }
            if (i9 == 1) {
                return pageblockcollage.caption.credit;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockEmbed) {
            TL_iv.pageBlockEmbed pageblockembed = (TL_iv.pageBlockEmbed) pageBlock;
            if (i9 == 0) {
                return pageblockembed.caption.text;
            }
            if (i9 == 1) {
                return pageblockembed.caption.credit;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            return ((TL_iv.pageBlockBlockquote) pageBlock).caption;
        } else {
            if (pageBlock instanceof TL_iv.pageBlockVideo) {
                TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
                if (i9 == 0) {
                    return pageblockvideo.caption.text;
                }
                if (i9 == 1) {
                    return pageblockvideo.caption.credit;
                }
            } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                return ((TL_iv.pageBlockPullquote) pageBlock).caption;
            } else {
                if (pageBlock instanceof TL_iv.pageBlockAudio) {
                    TL_iv.pageBlockAudio pageblockaudio = (TL_iv.pageBlockAudio) pageBlock;
                    if (i9 == 0) {
                        return pageblockaudio.caption.text;
                    }
                    if (i9 == 1) {
                        return pageblockaudio.caption.credit;
                    }
                } else if (pageBlock instanceof TL_iv.pageBlockCover) {
                    return w(i9, ((TL_iv.pageBlockCover) pageBlock).cover);
                } else {
                    if (pageBlock instanceof TL_iv.pageBlockMap) {
                        TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock;
                        if (i9 == 0) {
                            return pageblockmap.caption.text;
                        }
                        if (i9 == 1) {
                            return pageblockmap.caption.credit;
                        }
                    }
                }
            }
        }
        return null;
    }

    public static l4 x() {
        l4 l4Var;
        l4 l4Var2 = Y0;
        if (l4Var2 == null) {
            synchronized (l4.class) {
                try {
                    l4Var = Y0;
                    if (l4Var == null) {
                        l4Var = new l4();
                        Y0 = l4Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return l4Var;
        }
        return l4Var2;
    }

    public static View y(View view) {
        org.telegram.ui.Components.ik0 ik0Var;
        if (view instanceof a2) {
            org.telegram.ui.Components.ik0 ik0Var2 = ((a2) view).d;
            if (ik0Var2 != null) {
                return y(ik0Var2.f5501a);
            }
            return view;
        } else if ((view instanceof d2) && (ik0Var = ((d2) view).d) != null) {
            return y(ik0Var.f5501a);
        } else {
            return view;
        }
    }

    public static TL_iv.PageBlock z(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof b4) {
            TL_iv.PageBlock pageBlock2 = ((b4) pageBlock).d;
            if (pageBlock2 != null) {
                return z(pageBlock2);
            }
            return pageBlock2;
        } else if (pageBlock instanceof d4) {
            TL_iv.PageBlock pageBlock3 = ((d4) pageBlock).d;
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
        ArrayList arrayList = this.Z;
        int size = arrayList.size();
        y3 y3Var = this.G;
        boolean z11 = false;
        if (size <= 1) {
            ArticleViewer$WindowView articleViewer$WindowView = this.f40012b0;
            articleViewer$WindowView.f24020e = false;
            articleViewer$WindowView.d = false;
            m0 m0Var = this.f40013c0;
            if (y3Var != null) {
                x10 = y3Var.E * y3Var.f44700c.getWidth();
            } else {
                x10 = m0Var.getX();
            }
            AnimatorSet animatorSet = new AnimatorSet();
            float measuredWidth = m0Var.getMeasuredWidth() - x10;
            if (y3Var != null) {
                animatorSet.playTogether(y3Var.d(1.0f));
            } else {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.f40013c0, View.TRANSLATION_X, m0Var.getMeasuredWidth()), ObjectAnimator.ofFloat(this.f40012b0, Z0, m0Var.getMeasuredWidth()));
            }
            animatorSet.setDuration(Math.max((int) ((420.0f / m0Var.getMeasuredWidth()) * measuredWidth), 250));
            animatorSet.setInterpolator(org.telegram.ui.Components.gr.h);
            animatorSet.addListener(new x0(this));
            animatorSet.start();
            this.P0 = true;
            return;
        }
        ArticleViewer$WindowView articleViewer$WindowView2 = this.f40012b0;
        articleViewer$WindowView2.f24021f = true;
        articleViewer$WindowView2.f24020e = true;
        articleViewer$WindowView2.h = this.E0;
        this.f40026q0[1].setVisibility(0);
        this.f40026q0[1].setAlpha(1.0f);
        this.f40026q0[1].setTranslationX(0.0f);
        p3 p3Var = this.f40026q0[0];
        if (y3Var == null) {
            color = 0;
        } else {
            color = this.f40018h0.getColor();
        }
        p3Var.setBackgroundColor(color);
        e0(-1, arrayList.get(arrayList.size() - 2), true);
        p3 p3Var2 = this.f40026q0[0];
        p3Var2.getX();
        AnimatorSet animatorSet2 = new AnimatorSet();
        p3Var2.getMeasuredWidth();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f40026q0[0], View.TRANSLATION_X, p3Var2.getMeasuredWidth()));
        animatorSet2.setDuration(420L);
        animatorSet2.setInterpolator(org.telegram.ui.Components.gr.h);
        animatorSet2.addListener(new y0(this));
        animatorSet2.start();
        n0 n0Var = this.f40014d0;
        p3 p3Var3 = this.f40026q0[0];
        if (p3Var3 != null && SharedConfig.adaptableColorInBrowser) {
            w02 = p3Var3.getBackgroundColor();
        } else {
            w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Pk, false);
        }
        n0Var.setMenuColors(w02);
        n0 n0Var2 = this.f40014d0;
        p3 p3Var4 = this.f40026q0[0];
        if (p3Var4 != null && SharedConfig.adaptableColorInBrowser) {
            w03 = p3Var4.getActionBarColor();
        } else {
            w03 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Pk, false);
        }
        n0Var2.d(w03, true);
        n0 n0Var3 = this.f40014d0;
        p3 p3Var5 = this.f40026q0[0];
        if (p3Var5 != null && p3Var5.e()) {
            z10 = true;
        } else {
            z10 = false;
        }
        n0Var3.setIsTonsite(z10);
        n0 n0Var4 = this.f40014d0;
        p3 p3Var6 = this.f40026q0[0];
        if (p3Var6 != null && p3Var6.d()) {
            z11 = true;
        }
        n0Var4.setIsLocal(z11);
        this.P0 = true;
    }

    public final void H(int i9) {
        int color;
        int w02;
        int w03;
        boolean z10;
        float x10;
        ArrayList arrayList = this.Z;
        int size = arrayList.size();
        y3 y3Var = this.G;
        boolean z11 = false;
        if (size <= 1) {
            ArticleViewer$WindowView articleViewer$WindowView = this.f40012b0;
            articleViewer$WindowView.f24020e = false;
            articleViewer$WindowView.d = false;
            m0 m0Var = this.f40013c0;
            if (y3Var != null) {
                x10 = y3Var.E * y3Var.f44700c.getWidth();
            } else {
                x10 = m0Var.getX();
            }
            AnimatorSet animatorSet = new AnimatorSet();
            float measuredWidth = m0Var.getMeasuredWidth() - x10;
            if (y3Var != null) {
                animatorSet.playTogether(y3Var.d(1.0f));
            } else {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.f40013c0, View.TRANSLATION_X, m0Var.getMeasuredWidth()), ObjectAnimator.ofFloat(this.f40012b0, Z0, m0Var.getMeasuredWidth()));
            }
            animatorSet.setDuration(Math.max((int) ((420.0f / m0Var.getMeasuredWidth()) * measuredWidth), 250));
            animatorSet.setInterpolator(org.telegram.ui.Components.gr.h);
            animatorSet.addListener(new z0(this));
            animatorSet.start();
            this.P0 = true;
            return;
        }
        this.f40012b0.f24021f = true;
        this.f40026q0[1].setVisibility(0);
        this.f40026q0[1].setAlpha(1.0f);
        this.f40026q0[1].setTranslationX(0.0f);
        p3 p3Var = this.f40026q0[0];
        if (y3Var == null) {
            color = 0;
        } else {
            color = this.f40018h0.getColor();
        }
        p3Var.setBackgroundColor(color);
        e0(-1, arrayList.get(i9), true);
        p3 p3Var2 = this.f40026q0[0];
        p3Var2.getX();
        AnimatorSet animatorSet2 = new AnimatorSet();
        p3Var2.getMeasuredWidth();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f40026q0[0], View.TRANSLATION_X, p3Var2.getMeasuredWidth()));
        animatorSet2.setDuration(420L);
        animatorSet2.setInterpolator(org.telegram.ui.Components.gr.h);
        animatorSet2.addListener(new a1(this, i9));
        animatorSet2.start();
        n0 n0Var = this.f40014d0;
        p3 p3Var3 = this.f40026q0[0];
        if (p3Var3 != null && SharedConfig.adaptableColorInBrowser) {
            w02 = p3Var3.getBackgroundColor();
        } else {
            w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Pk, false);
        }
        n0Var.setMenuColors(w02);
        n0 n0Var2 = this.f40014d0;
        p3 p3Var4 = this.f40026q0[0];
        if (p3Var4 != null && SharedConfig.adaptableColorInBrowser) {
            w03 = p3Var4.getActionBarColor();
        } else {
            w03 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Pk, false);
        }
        n0Var2.d(w03, true);
        n0 n0Var3 = this.f40014d0;
        p3 p3Var5 = this.f40026q0[0];
        if (p3Var5 != null && p3Var5.e()) {
            z10 = true;
        } else {
            z10 = false;
        }
        n0Var3.setIsTonsite(z10);
        n0 n0Var4 = this.f40014d0;
        p3 p3Var6 = this.f40026q0[0];
        if (p3Var6 != null && p3Var6.d()) {
            z11 = true;
        }
        n0Var4.setIsLocal(z11);
        this.P0 = true;
    }

    public final boolean J() {
        ArrayList arrayList = this.Z;
        if (arrayList.size() <= 0 || !(arrayList.get(0) instanceof TLRPC.WebPage)) {
            return false;
        }
        return true;
    }

    public final void M() {
        this.R = false;
        int i9 = 0;
        while (true) {
            p3[] p3VarArr = this.f40026q0;
            if (i9 < p3VarArr.length) {
                p3VarArr[i9].b();
                i9++;
            } else {
                try {
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
        }
        this.H.getWindow().clearFlags(128);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.J;
            if (i10 < arrayList.size()) {
                ((v1) arrayList.get(i10)).a(false);
                i10++;
            } else {
                this.f40013c0.post(new c0(this, 0));
                NotificationCenter.getInstance(this.T).lambda$postNotificationNameOnUIThread$1(NotificationCenter.articleClosed, new Object[0]);
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
        int i9;
        String lowerCase;
        TL_iv.Page page;
        if (this.H == null) {
            return false;
        }
        y3 y3Var = this.G;
        if (y3Var == null && this.R) {
            return false;
        }
        org.telegram.ui.ActionBar.o2 o2Var = this.I;
        if (o2Var != null && (o2Var.getParentLayout() instanceof ActionBarLayout)) {
            AndroidUtilities.hideKeyboard((ActionBarLayout) this.I.getParentLayout());
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
            for (int i10 = 0; i10 < messageObject.messageOwner.entities.size(); i10++) {
                TLRPC.MessageEntity messageEntity = messageObject.messageOwner.entities.get(i10);
                if (messageEntity instanceof TLRPC.TL_messageEntityUrl) {
                    try {
                        String str5 = messageObject.messageOwner.message;
                        int i11 = messageEntity.offset;
                        String lowerCase2 = str5.substring(i11, messageEntity.length + i11).toLowerCase();
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
                    } catch (Exception e10) {
                        FileLog.e(e10);
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
        ArrayList arrayList = this.Z;
        if (y3Var != null && !arrayList.isEmpty()) {
            z11 = z10;
            r52 = 1;
        } else {
            z11 = z10;
            r52 = 0;
        }
        if (r52 == 0) {
            arrayList.clear();
            this.f40013c0.setTranslationX(0.0f);
            if (y3Var != null) {
                y3Var.E = 0.0f;
                y3Var.f44700c.invalidate();
                y3Var.i();
                y3Var.h();
            }
            this.f40013c0.setTranslationY(0.0f);
            this.f40026q0[0].setTranslationY(0.0f);
            this.f40026q0[0].setTranslationX(0.0f);
            this.f40026q0[1].setTranslationX(0.0f);
            this.f40026q0[0].setAlpha(1.0f);
            this.f40012b0.setInnerTranslationX(0.0f);
            this.f40026q0[0].g();
            X(AndroidUtilities.dp(56.0f));
        }
        if (y3Var != null && org.telegram.ui.web.y0.I0) {
            y3Var.f44698a.lock();
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
                    i9 = messageObject.currentAccount;
                } else {
                    i9 = UserConfig.selectedAccount;
                }
                int i12 = i9;
                ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getWebPage, new i0(this, i12, webPage2, messageObject, (boolean) r52, str4));
            }
        } else {
            g(r52, str2);
        }
        n0 n0Var = this.f40014d0;
        if (n0Var != null && r52 == 0) {
            n0Var.setIsLocal(this.f40026q0[0].d());
        }
        this.P = null;
        if (y3Var != null) {
            if (r52 == 0) {
                AndroidUtilities.removeFromParent(this.f40012b0);
                y3Var.d = this.f40012b0;
                y3Var.n();
                y3Var.f44700c.addView(this.f40012b0, g7.e6.c(-1.0f, -1));
            }
        } else if (!this.R) {
            WindowManager windowManager = (WindowManager) this.H.getSystemService("window");
            if (this.S) {
                try {
                    windowManager.removeView(this.f40012b0);
                } catch (Exception unused) {
                }
            }
            try {
                WindowManager.LayoutParams layoutParams = this.f40011a0;
                layoutParams.flags = -2013200384;
                if (Build.VERSION.SDK_INT >= 28) {
                    layoutParams.layoutInDisplayCutoutMode = 1;
                }
                this.f40012b0.setFocusable(false);
                this.f40013c0.setFocusable(false);
                windowManager.addView(this.f40012b0, this.f40011a0);
            } catch (Exception e11) {
                FileLog.e(e11);
                return false;
            }
        } else {
            this.f40011a0.flags &= -17;
            ((WindowManager) this.H.getSystemService("window")).updateViewLayout(this.f40012b0, this.f40011a0);
        }
        this.R = true;
        this.V = 1;
        if (r52 == 0) {
            if (y3Var != null) {
                if (r52 != 0) {
                    y3Var.f44698a.unlock();
                } else if (!y3Var.h) {
                    y3Var.g(y3Var.f44699b);
                    y3Var.f();
                }
            } else {
                this.f40012b0.setAlpha(0.0f);
                this.f40013c0.setAlpha(0.0f);
                AnimatorSet animatorSet = new AnimatorSet();
                ArticleViewer$WindowView articleViewer$WindowView = this.f40012b0;
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(articleViewer$WindowView, property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f40013c0, property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f40012b0, View.TRANSLATION_X, AndroidUtilities.dp(56.0f), 0.0f));
                this.W = new c0(this, 1);
                animatorSet.setDuration(150L);
                animatorSet.setInterpolator(this.Y);
                animatorSet.addListener(new u0(this));
                this.X = System.currentTimeMillis();
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.l0(11, this, animatorSet));
            }
        }
        this.f40013c0.setLayerType(2, null);
        return true;
    }

    public final void P(long j10, TLRPC.User user) {
        if (user != null && (this.H instanceof LaunchActivity)) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f22527id);
            bundle.putString("botUser", "webpage" + j10);
            ((LaunchActivity) this.H).q0(new qn(bundle), false, true);
            o(false, true);
        }
    }

    public final void Q(String str, String str2, l0 l0Var) {
        Activity activity = this.H;
        if (activity != null && !activity.isFinishing()) {
            p3 p3Var = this.f40026q0[0];
            if (p3Var != null && p3Var.d()) {
                String string = LocaleController.getString(R.string.OpenUrlAlert2);
                int indexOf = string.indexOf("%");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(String.format(string, str));
                if (indexOf >= 0) {
                    spannableStringBuilder.setSpan(new URLSpan(str), indexOf, str.length() + indexOf, 33);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.H, 0, null);
                String string2 = LocaleController.getString(R.string.OpenUrlTitle);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                c2Var.N = string2;
                c2Var.P = spannableStringBuilder;
                c2Var.f22764b0 = false;
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.Open), new a1.d(this, str, str2, l0Var, 5));
                alertDialog$Builder.o();
                return;
            }
            R(str, str2, l0Var);
        }
    }

    public final void R(String str, String str2, ve.d dVar) {
        y3 y3Var;
        ve.d dVar2 = this.I0;
        if (dVar2 != null) {
            dVar2.a(false);
        }
        this.I0 = dVar;
        if (this.B0 != 0) {
            ConnectionsManager.getInstance(this.T).cancelRequest(this.B0, false);
            this.B0 = 0;
        }
        boolean[] zArr = new boolean[1];
        if (ve.e.l(this.H, str, false)) {
            if (this.Z.isEmpty() && (y3Var = this.G) != null) {
                y3Var.dismiss(false);
                return;
            }
            return;
        }
        h0 h0Var = new h0(this, str, zArr, dVar);
        int i9 = this.D0 + 1;
        this.D0 = i9;
        b0(true);
        TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
        tL_messages_getWebPage.url = str;
        tL_messages_getWebPage.hash = 0;
        this.B0 = ConnectionsManager.getInstance(this.T).sendRequest(tL_messages_getWebPage, new org.telegram.messenger.zh(this, i9, dVar, str2, h0Var, tL_messages_getWebPage));
        if (dVar != null) {
            dVar.f48382b = new d5.i(this, i9, dVar, 24);
            dVar.d();
        }
    }

    public final void S() {
        int w02;
        int w03;
        TextView textView = this.f40033x0;
        if (textView != null) {
            textView.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23092i6, false), 2, -1));
            this.f40033x0.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.E8, false));
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f40032w0;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G8, false));
        }
        ImageView imageView = this.f40023n0;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false), PorterDuff.Mode.MULTIPLY));
            this.f40023n0.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23388z8, false), 1, -1));
        }
        ImageView imageView2 = this.f40024o0;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false), PorterDuff.Mode.MULTIPLY));
            this.f40024o0.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23388z8, false), 1, -1));
        }
        org.telegram.ui.Components.j6 j6Var = this.f40025p0;
        if (j6Var != null) {
            j6Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
        }
        n0 n0Var = this.f40014d0;
        if (n0Var != null) {
            p3 p3Var = this.f40026q0[0];
            if (p3Var != null && SharedConfig.adaptableColorInBrowser) {
                w02 = p3Var.getBackgroundColor();
            } else {
                w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Pk, false);
            }
            n0Var.setMenuColors(w02);
            n0 n0Var2 = this.f40014d0;
            p3 p3Var2 = this.f40026q0[0];
            if (p3Var2 != null && SharedConfig.adaptableColorInBrowser) {
                w03 = p3Var2.getActionBarColor();
            } else {
                w03 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Pk, false);
            }
            n0Var2.d(w03, true);
        }
        this.f40018h0.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Pk, false));
    }

    public final void U() {
        int L0;
        int i9;
        boolean z10 = false;
        p3 p3Var = this.f40026q0[0];
        if (p3Var.f41321c.A != null && (L0 = p3Var.d.L0()) != -1) {
            View m10 = this.f40026q0[0].d.m(L0);
            if (m10 != null) {
                i9 = m10.getTop();
            } else {
                i9 = 0;
            }
            String str = "article" + this.f40026q0[0].f41321c.A.f22533id;
            SharedPreferences.Editor putInt = ApplicationLoader.applicationContext.getSharedPreferences("articles", 0).edit().putInt(str, L0).putInt(str + "o", i9);
            String j10 = ta.b.j(str, "r");
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                z10 = true;
            }
            putInt.putBoolean(j10, z10).commit();
        }
    }

    public final boolean V(String str, boolean z10) {
        String lowerCase;
        int i9;
        Integer num = 0;
        if (!TextUtils.isEmpty(str)) {
            String lowerCase2 = str.toLowerCase();
            Integer num2 = (Integer) this.f40026q0[0].f41321c.h.get(lowerCase2);
            if (num2 != null) {
                TL_iv.textAnchor textanchor = (TL_iv.textAnchor) this.f40026q0[0].f41321c.f39363r.get(lowerCase2);
                if (textanchor != null) {
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    if (!TextUtils.isEmpty(this.f40026q0[0].f41321c.A.cached_page.url)) {
                        lowerCase = this.f40026q0[0].f41321c.A.cached_page.url.toLowerCase();
                    } else {
                        lowerCase = this.f40026q0[0].f41321c.A.url.toLowerCase();
                    }
                    pageblockparagraph.text = org.telegram.ui.web.d2.d(textanchor.text, lowerCase, lowerCase2);
                    this.f40026q0[0].f41321c.getClass();
                    int I = j4.I(pageblockparagraph);
                    f2.q1 x10 = this.f40026q0[0].f41321c.x(null, I);
                    View view = x10.f5501a;
                    this.f40026q0[0].f41321c.H(I, x10, pageblockparagraph, 0, 0, false);
                    org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(this.H, null, false, false);
                    f3Var.fixNavigationBar();
                    f3Var.applyTopPadding = false;
                    f3Var.applyBottomPadding = false;
                    LinearLayout linearLayout = new LinearLayout(this.H);
                    linearLayout.setOrientation(1);
                    org.telegram.ui.Cells.n9 n9Var = new org.telegram.ui.Cells.n9();
                    this.L0 = n9Var;
                    n9Var.T(linearLayout);
                    this.L0.D = new ih.i2(this, 1);
                    bg.t tVar = new bg.t(this.H, 5);
                    tVar.setTextSize(1, 16.0f);
                    tVar.setTypeface(AndroidUtilities.bold());
                    tVar.setText(LocaleController.getString(R.string.InstantViewReference));
                    if (this.f40026q0[0].f41321c.C) {
                        i9 = 5;
                    } else {
                        i9 = 3;
                    }
                    tVar.setGravity(i9 | 16);
                    tVar.setTextColor(b());
                    tVar.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                    linearLayout.addView(tVar, new LinearLayout.LayoutParams(-1, AndroidUtilities.dp(48.0f) + 1));
                    view.setTag("bottomSheet");
                    linearLayout.addView(view, g7.e6.k(0.0f, 7.0f, 0.0f, 0.0f, -1, -2));
                    org.telegram.ui.Cells.z9 o6 = this.L0.o(this.H);
                    fh.v vVar = new fh.v(this, this.H, linearLayout, 6);
                    f3Var.setDelegate(new j0(this, 0));
                    vVar.addView(linearLayout, -1, -2);
                    vVar.addView(o6, -1, -2);
                    f3Var.customView = vVar;
                    if (this.K0.y()) {
                        this.K0.f(false);
                    }
                    this.E = f3Var;
                    a0(f3Var);
                    return true;
                } else if (num2.intValue() >= 0 && num2.intValue() < this.f40026q0[0].f41321c.f39360e.size()) {
                    TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) this.f40026q0[0].f41321c.f39360e.get(num2.intValue());
                    TL_iv.PageBlock z11 = z(pageBlock);
                    if ((z11 instanceof z3) && O((z3) z11)) {
                        this.f40026q0[0].f41321c.M();
                        this.f40026q0[0].f41321c.l();
                    }
                    int indexOf = this.f40026q0[0].f41321c.d.indexOf(pageBlock);
                    if (indexOf != -1) {
                        num2 = Integer.valueOf(indexOf);
                    }
                    Integer num3 = (Integer) this.f40026q0[0].f41321c.f39362n.get(lowerCase2);
                    if (num3 != null) {
                        if (num3.intValue() == -1) {
                            this.f40026q0[0].f41321c.getClass();
                            int I2 = j4.I(pageBlock);
                            f2.q1 x11 = this.f40026q0[0].f41321c.x(null, I2);
                            this.f40026q0[0].f41321c.H(I2, x11, pageBlock, 0, 0, false);
                            x11.f5501a.measure(View.MeasureSpec.makeMeasureSpec(this.f40026q0[0].f41320b.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                            Integer num4 = (Integer) this.f40026q0[0].f41321c.f39362n.get(lowerCase2);
                            if (num4.intValue() != -1) {
                                num = num4;
                            }
                        } else {
                            num = num3;
                        }
                    }
                    if (this.f40026q0[0].f41321c.D) {
                        num2 = Integer.valueOf(num2.intValue() + 1);
                    }
                    if (z10) {
                        org.telegram.ui.Components.gv0 gv0Var = new org.telegram.ui.Components.gv0(this.f40026q0[0].getContext());
                        gv0Var.f5443a = num2.intValue();
                        gv0Var.f28880s = (-AndroidUtilities.dp(56.0f)) - num.intValue();
                        this.f40026q0[0].d.w0(gv0Var);
                        return true;
                    }
                    this.f40026q0[0].d.h1(num2.intValue(), (-AndroidUtilities.dp(56.0f)) - num.intValue());
                    return true;
                }
            }
        }
        return false;
    }

    public final void W(int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l4.W(int):void");
    }

    public final void X(int i9) {
        n0 n0Var = this.f40014d0;
        if (n0Var != null && !n0Var.P && !n0Var.S) {
            int clamp = Utilities.clamp(i9, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(24.0f));
            this.E0 = clamp;
            this.f40014d0.setHeight(clamp);
            this.K0.f24110x = this.E0;
            int i10 = 0;
            while (true) {
                p3[] p3VarArr = this.f40026q0;
                if (i10 < p3VarArr.length) {
                    p3VarArr[i10].f41320b.setTopGlowOffset(this.E0);
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void Y(Activity activity, org.telegram.ui.ActionBar.o2 o2Var) {
        ff.t0 t0Var;
        int i9;
        boolean z10;
        int w02;
        int i10;
        int i11;
        y3 y3Var;
        ff.t0 t0Var2 = this.Q0;
        if (t0Var2 != null) {
            t0Var2.destroy();
            this.Q0 = null;
        }
        LaunchActivity launchActivity = LaunchActivity.C1;
        if (launchActivity != null) {
            t0Var = new ff.t0(launchActivity, true);
        } else {
            t0Var = null;
        }
        this.Q0 = t0Var;
        this.I = o2Var;
        if (!(o2Var instanceof qy)) {
            i9 = o2Var.getCurrentAccount();
        } else {
            i9 = UserConfig.selectedAccount;
        }
        this.T = i9;
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
        NotificationCenter.getInstance(this.T).addObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(this.T).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(this.T).addObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(this.T).addObserver(this, NotificationCenter.emojiLoaded);
        Activity activity2 = this.H;
        if (activity2 != activity && (activity2 == null || !this.F || (y3Var = this.G) == null || y3Var.f44701e == null)) {
            this.H = activity;
            this.f36373a = ApplicationLoader.applicationContext.getSharedPreferences("articles", 0).getInt("font_type", 0);
            r(this, false);
            this.f40018h0 = new Paint();
            this.f40019i0 = activity.getResources().getDrawable(R.drawable.layer_shadow);
            this.f40020j0 = new Paint();
            ArticleViewer$WindowView articleViewer$WindowView = new ArticleViewer$WindowView(this, activity);
            this.f40012b0 = articleViewer$WindowView;
            articleViewer$WindowView.setWillNotDraw(false);
            this.f40012b0.setClipChildren(true);
            this.f40012b0.setFocusable(false);
            m0 m0Var = new m0(this, activity, 0);
            this.f40013c0 = m0Var;
            this.f40012b0.addView(m0Var, g7.e6.e(-1, -1, 51));
            if (this.G == null) {
                this.f40012b0.setFitsSystemWindows(true);
                this.f40013c0.setOnApplyWindowInsetsListener(new org.telegram.ui.ActionBar.g3(1));
            }
            FrameLayout frameLayout = new FrameLayout(activity);
            this.L = frameLayout;
            frameLayout.setBackgroundColor(-16777216);
            this.L.setVisibility(4);
            this.f40012b0.addView(this.L, g7.e6.c(-1.0f, -1));
            c5.c cVar = new c5.c(activity);
            this.N = cVar;
            cVar.setVisibility(0);
            this.N.setBackgroundColor(-16777216);
            this.L.addView(this.N, g7.e6.e(-1, -1, 17));
            this.M = new TextureView(activity);
            this.f40026q0 = new p3[2];
            int i12 = 0;
            while (true) {
                p3[] p3VarArr = this.f40026q0;
                if (i12 >= p3VarArr.length) {
                    break;
                }
                p3 p3Var = new p3(this, activity);
                p3VarArr[i12] = p3Var;
                if (i12 == 0) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                p3Var.setVisibility(i11);
                this.f40013c0.addView(p3Var, g7.e6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
                p3Var.f41320b.setOnItemLongClickListener(new t(this));
                p3Var.f41320b.setOnItemClickListener(new ih.v3(8, this, p3Var));
                i12++;
            }
            this.f40013c0.addView(new FrameLayout(activity), g7.e6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f40028s0.setColor(-16777216);
            this.f40029t0.setColor(-16777216);
            this.f40031v0.setColor(-14408666);
            this.f40030u0.setColor(-16777216);
            n0 n0Var = new n0(this, activity);
            this.f40014d0 = n0Var;
            if (this.G != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            n0Var.f43971a0 = z10;
            this.f40013c0.addView(n0Var, g7.e6.e(-1, -2, 48));
            this.f40014d0.setOnClickListener(new mh.k3(9, this, activity));
            this.f40014d0.U.addTextChangedListener(new o0(this, 0));
            org.telegram.ui.web.k kVar = new org.telegram.ui.web.k(activity);
            this.f40015e0 = kVar;
            kVar.setOpenProgress(0.0f);
            this.f40015e0.f43913w.j(new l3(this, 2));
            this.f40013c0.addView(this.f40015e0, g7.e6.c(-1.0f, -1));
            this.f40016f0 = new c0(this, 3);
            this.f40014d0.H.setOnClickListener(new s(this, 2));
            this.f40014d0.H.setOnLongClickListener(new u(this, 0));
            this.f40014d0.setMenuListener(new fh.f1(28, this, activity));
            this.f40014d0.K.setOnClickListener(new s(this, 3));
            dh.g gVar = new dh.g(this.H, 5);
            this.m0 = gVar;
            gVar.setOnTouchListener(new jh.d(3));
            this.m0.setWillNotDraw(false);
            this.m0.setTranslationY(AndroidUtilities.dp(51.0f));
            this.m0.setVisibility(4);
            this.m0.setFocusable(true);
            this.m0.setFocusableInTouchMode(true);
            this.m0.setClickable(true);
            this.m0.setPadding(0, AndroidUtilities.dp(3.0f), 0, 0);
            this.f40013c0.addView(this.m0, g7.e6.e(-1, 51, 80));
            new kh.b4(this.f40012b0, false, new r(this, 0));
            ImageView imageView = new ImageView(this.H);
            this.f40023n0 = imageView;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            this.f40023n0.setImageResource(R.drawable.msg_go_up);
            ImageView imageView2 = this.f40023n0;
            int i13 = org.telegram.ui.ActionBar.f6.G6;
            int w03 = org.telegram.ui.ActionBar.f6.w0(null, i13, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            imageView2.setColorFilter(new PorterDuffColorFilter(w03, mode));
            ImageView imageView3 = this.f40023n0;
            int i14 = org.telegram.ui.ActionBar.f6.f23388z8;
            imageView3.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, i14, false), 1, -1));
            this.m0.addView(this.f40023n0, g7.e6.d(48, 48.0f, 53, 0.0f, 0.0f, 48.0f, 0.0f));
            this.f40023n0.setOnClickListener(new s(this, 0));
            this.f40023n0.setContentDescription(LocaleController.getString(R.string.AccDescrSearchNext));
            ImageView imageView4 = new ImageView(this.H);
            this.f40024o0 = imageView4;
            imageView4.setScaleType(scaleType);
            this.f40024o0.setImageResource(R.drawable.msg_go_down);
            this.f40024o0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i13, false), mode));
            this.f40024o0.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, i14, false), 1, -1));
            this.m0.addView(this.f40024o0, g7.e6.d(48, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f40024o0.setOnClickListener(new s(this, 1));
            this.f40024o0.setContentDescription(LocaleController.getString(R.string.AccDescrSearchPrev));
            org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(this.H, true, true, true);
            this.f40025p0 = j6Var;
            j6Var.setScaleProperty(0.6f);
            this.f40025p0.b(0.4f, 350L, org.telegram.ui.Components.gr.h);
            this.f40025p0.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i13, false));
            this.f40025p0.setTextSize(AndroidUtilities.dp(15.0f));
            this.f40025p0.setTypeface(AndroidUtilities.bold());
            this.f40025p0.setGravity(3);
            this.f40025p0.getDrawable().G = AndroidUtilities.displaySize.x;
            this.m0.addView(this.f40025p0, g7.e6.d(-2, -2.0f, 19, 18.0f, 0.0f, 108.0f, 0.0f));
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.f40011a0 = layoutParams;
            layoutParams.height = -1;
            layoutParams.format = -3;
            layoutParams.width = -1;
            layoutParams.gravity = 51;
            layoutParams.type = 98;
            layoutParams.softInputMode = 48;
            layoutParams.flags = 131072;
            if (this.G == null) {
                w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f22947a7, true);
            } else {
                w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f22947a7, false);
            }
            if (AndroidUtilities.computePerceivedBrightness(w02) >= 0.721f && Build.VERSION.SDK_INT >= 26) {
                i10 = 1808;
            } else {
                i10 = 1792;
            }
            this.f40030u0.setColor(w02);
            WindowManager.LayoutParams layoutParams2 = this.f40011a0;
            layoutParams2.systemUiVisibility = i10;
            layoutParams2.flags |= -2147417856;
            if (Build.VERSION.SDK_INT >= 28) {
                layoutParams2.layoutInDisplayCutoutMode = 1;
            }
            org.telegram.ui.Cells.n9 n9Var = new org.telegram.ui.Cells.n9();
            this.K0 = n9Var;
            n9Var.T(this.f40026q0[0].f41320b);
            if (MessagesController.getInstance(this.T).getTranslateController().isContextTranslateEnabled()) {
                this.K0.f24092l0 = new t(this);
            }
            org.telegram.ui.Cells.n9 n9Var2 = this.K0;
            n9Var2.E0 = this.f40026q0[0].d;
            n9Var2.D = new r0(this);
            this.f40013c0.addView(n9Var2.o(activity));
            m0 m0Var2 = this.f40013c0;
            nu0 nu0Var = new nu0(m0Var2, m0Var2);
            this.M0 = nu0Var;
            nu0Var.F = new t(this);
            nu0Var.E = new g(this, 1);
            this.f40018h0.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Pk, false));
            g0(this);
            return;
        }
        g0(this);
        S();
    }

    public final void Z(String str) {
        String str2;
        if (this.H == null) {
            return;
        }
        org.telegram.ui.ActionBar.f3 f3Var = this.E;
        if (f3Var != null) {
            f3Var.dismiss();
            this.E = null;
        }
        org.telegram.ui.ActionBar.f3 f3Var2 = new org.telegram.ui.ActionBar.f3(this.H, null, false, false);
        f3Var2.fixNavigationBar();
        try {
            str2 = URLDecoder.decode(str.replaceAll("\\+", "%2b"), "UTF-8");
        } catch (Exception e10) {
            FileLog.e(e10);
            str2 = str;
        }
        f3Var2.title = str2;
        f3Var2.bigTitle = false;
        f3Var2.multipleLinesTitle = true;
        v vVar = new v(0, this, str);
        f3Var2.items = new CharSequence[]{LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
        f3Var2.onClickListener = vVar;
        f3Var2.setOnHideListener(new w(this, 0));
        a0(f3Var2);
    }

    @Override
    public final int a() {
        return org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23369y6, false);
    }

    public final void a0(org.telegram.ui.ActionBar.f3 f3Var) {
        if (this.H != null) {
            try {
                org.telegram.ui.ActionBar.f3 f3Var2 = this.f40017g0;
                if (f3Var2 != null) {
                    f3Var2.dismiss();
                    this.f40017g0 = null;
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            try {
                this.f40017g0 = f3Var;
                f3Var.setCanceledOnTouchOutside(true);
                this.f40017g0.setOnDismissListener(new w(this, 1));
                f3Var.show();
            } catch (Exception e11) {
                FileLog.e(e11);
            }
        }
    }

    @Override
    public final int b() {
        return org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false);
    }

    public final void b0(boolean z10) {
        AndroidUtilities.cancelRunOnUIThread(this.f40016f0);
        if (z10) {
            this.f40014d0.W.a(0.0f, false);
            this.f40014d0.W.a(0.3f, true);
            AndroidUtilities.runOnUIThread(this.f40016f0, 100L);
            return;
        }
        this.f40014d0.W.a(1.0f, true);
    }

    @Override
    public final void c(j4 j4Var, org.telegram.ui.Components.rz0 rz0Var) {
        String str;
        String str2;
        org.telegram.ui.Components.m80 m80Var;
        String lowerCase;
        if (rz0Var != null && (str = rz0Var.f32323b) != null) {
            org.telegram.ui.ActionBar.f3 f3Var = this.E;
            l0 l0Var = null;
            if (f3Var != null) {
                f3Var.dismiss();
                this.E = null;
            }
            int lastIndexOf = str.lastIndexOf(35);
            boolean z10 = false;
            if (lastIndexOf != -1) {
                if (!TextUtils.isEmpty(j4Var.A.cached_page.url)) {
                    lowerCase = j4Var.A.cached_page.url.toLowerCase();
                } else {
                    lowerCase = j4Var.A.url.toLowerCase();
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
                e3 e3Var = this.d;
                if (e3Var != null && (m80Var = this.f36374b) != null) {
                    l0Var = new l0(this, e3Var, m80Var);
                }
                Q(str, str2, l0Var);
            }
        }
    }

    public final void c0() {
        LaunchActivity launchActivity;
        FrameLayout frameLayout;
        if (this.S && (launchActivity = LaunchActivity.C1) != null && !launchActivity.isFinishing()) {
            if (this.f40026q0[0].f()) {
                if (this.f40026q0[0].getWebView() != null) {
                    frameLayout = this.f40026q0[0].f41323f;
                } else {
                    return;
                }
            } else {
                p3 p3Var = this.f40026q0[0];
                TLRPC.WebPage webPage = p3Var.f41321c.A;
                frameLayout = p3Var;
                if (webPage == null) {
                    return;
                }
            }
            new org.telegram.ui.Components.oc(frameLayout, null).G(R.raw.chats_infotip, 4, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BrowserExternalRestricted), new c0(this, 10))).k(true);
        }
    }

    @Override
    public final boolean d(TL_iv.PageBlock pageBlock, j4 j4Var) {
        int indexOf;
        List list;
        org.telegram.ui.ActionBar.o2 o2Var = this.I;
        if (o2Var != null && o2Var.getParentActivity() != null) {
            if ((pageBlock instanceof TL_iv.pageBlockVideo) && !i4.g(j4Var.A, pageBlock)) {
                list = Collections.singletonList(pageBlock);
                indexOf = 0;
            } else {
                ArrayList arrayList = new ArrayList(j4Var.f39361f);
                indexOf = j4Var.f39361f.indexOf(pageBlock);
                list = arrayList;
            }
            PhotoViewer t12 = PhotoViewer.t1();
            t12.K2(null, this.I, null);
            if (t12.e2(null, null, null, null, null, null, null, indexOf, new i3(this, list), null, 0L, 0L, 0L, true, new r3(this, j4Var.A, list), null)) {
                n();
                return true;
            }
        }
        return false;
    }

    public final void d0(boolean z10) {
        float f10;
        this.m0.setVisibility(0);
        ValueAnimator valueAnimator = this.T0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.U0;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.T0 = ofFloat;
        ofFloat.addUpdateListener(new q(this, 1));
        this.T0.addListener(new hg.b0(19, this, z10));
        this.T0.setDuration(320L);
        this.T0.setInterpolator(org.telegram.ui.Components.gr.h);
        this.T0.start();
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        c1 c1Var;
        MessageObject messageObject;
        if (i9 == NotificationCenter.messagePlayingDidStart) {
            MessageObject messageObject2 = (MessageObject) objArr[0];
            if (this.f40026q0 != null) {
                int i11 = 0;
                while (true) {
                    p3[] p3VarArr = this.f40026q0;
                    if (i11 < p3VarArr.length) {
                        int childCount = p3VarArr[i11].f41320b.getChildCount();
                        for (int i12 = 0; i12 < childCount; i12++) {
                            View childAt = this.f40026q0[i11].f41320b.getChildAt(i12);
                            if (childAt instanceof c1) {
                                ((c1) childAt).a(true);
                            }
                        }
                        i11++;
                    } else {
                        return;
                    }
                }
            }
        } else if (i9 != NotificationCenter.messagePlayingDidReset && i9 != NotificationCenter.messagePlayingPlayStateChanged) {
            if (i9 == NotificationCenter.messagePlayingProgressDidChanged) {
                Integer num = (Integer) objArr[0];
                if (this.f40026q0 != null) {
                    int i13 = 0;
                    while (true) {
                        p3[] p3VarArr2 = this.f40026q0;
                        if (i13 < p3VarArr2.length) {
                            int childCount2 = p3VarArr2[i13].f41320b.getChildCount();
                            int i14 = 0;
                            while (true) {
                                if (i14 < childCount2) {
                                    View childAt2 = this.f40026q0[i13].f41320b.getChildAt(i14);
                                    if ((childAt2 instanceof c1) && (messageObject = (c1Var = (c1) childAt2).getMessageObject()) != null && messageObject.getId() == num.intValue()) {
                                        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                                        if (playingMessageObject != null) {
                                            messageObject.audioProgress = playingMessageObject.audioProgress;
                                            messageObject.audioProgressSec = playingMessageObject.audioProgressSec;
                                            messageObject.audioPlayerDuration = playingMessageObject.audioPlayerDuration;
                                            c1Var.b();
                                        }
                                    } else {
                                        i14++;
                                    }
                                }
                            }
                            i13++;
                        } else {
                            return;
                        }
                    }
                }
            } else if (i9 == NotificationCenter.emojiLoaded && this.f40026q0 != null) {
                int i15 = 0;
                while (true) {
                    p3[] p3VarArr3 = this.f40026q0;
                    if (i15 < p3VarArr3.length) {
                        int childCount3 = p3VarArr3[i15].f41320b.getChildCount();
                        for (int i16 = 0; i16 < childCount3; i16++) {
                            View childAt3 = this.f40026q0[i15].f41320b.getChildAt(i16);
                            if (childAt3 instanceof x2) {
                                ((x2) childAt3).f44328e.invalidate();
                            } else {
                                childAt3.invalidate();
                            }
                        }
                        i15++;
                    } else {
                        return;
                    }
                }
            }
        } else if (this.f40026q0 != null) {
            int i17 = 0;
            while (true) {
                p3[] p3VarArr4 = this.f40026q0;
                if (i17 < p3VarArr4.length) {
                    int childCount4 = p3VarArr4[i17].f41320b.getChildCount();
                    for (int i18 = 0; i18 < childCount4; i18++) {
                        View childAt4 = this.f40026q0[i17].f41320b.getChildAt(i18);
                        if (childAt4 instanceof c1) {
                            c1 c1Var2 = (c1) childAt4;
                            if (c1Var2.getMessageObject() != null) {
                                c1Var2.a(true);
                            }
                        }
                    }
                    i17++;
                } else {
                    return;
                }
            }
        }
    }

    public final void e0(int i9, Object obj, boolean z10) {
        int dp;
        int i10;
        int i11;
        int i12;
        int color;
        int w02;
        int w03;
        boolean z11;
        boolean z12;
        if (obj != null) {
            if (((obj instanceof TLRPC.WebPage) && ((TLRPC.WebPage) obj).cached_page != null) || (obj instanceof c3)) {
                int i13 = 1;
                if (!z10 && i9 != 0) {
                    p3[] p3VarArr = this.f40026q0;
                    p3 p3Var = p3VarArr[1];
                    p3VarArr[1] = p3VarArr[0];
                    p3VarArr[0] = p3Var;
                    this.f40014d0.i();
                    this.V0.a(this.f40026q0[0].getBackgroundColor(), true);
                    this.W0.a(this.f40026q0[1].getBackgroundColor(), true);
                    y3 y3Var = this.G;
                    if (y3Var != null) {
                        y3Var.m();
                    }
                    int indexOfChild = this.f40013c0.indexOfChild(this.f40026q0[0]);
                    int indexOfChild2 = this.f40013c0.indexOfChild(this.f40026q0[1]);
                    if (i9 == 1) {
                        if (indexOfChild < indexOfChild2) {
                            this.f40013c0.removeView(this.f40026q0[0]);
                            this.f40013c0.addView(this.f40026q0[0], indexOfChild2);
                        }
                    } else if (indexOfChild2 < indexOfChild) {
                        this.f40013c0.removeView(this.f40026q0[0]);
                        this.f40013c0.addView(this.f40026q0[0], indexOfChild);
                    }
                    this.f40027r0 = new AnimatorSet();
                    this.f40026q0[0].setVisibility(0);
                    if (i9 == 1) {
                        i12 = 0;
                    } else {
                        i12 = 1;
                    }
                    p3 p3Var2 = this.f40026q0[i12];
                    if (this.G == null) {
                        color = 0;
                    } else {
                        color = this.f40018h0.getColor();
                    }
                    p3Var2.setBackgroundColor(color);
                    this.f40026q0[i12].setLayerType(2, null);
                    if (i9 == 1) {
                        this.f40026q0[0].setTranslationX(AndroidUtilities.displaySize.x);
                        this.f40027r0.playTogether(ObjectAnimator.ofFloat(this.f40026q0[0], View.TRANSLATION_X, AndroidUtilities.displaySize.x, 0.0f));
                    } else if (i9 == -1) {
                        this.f40026q0[0].setTranslationX(0.0f);
                        this.f40027r0.playTogether(ObjectAnimator.ofFloat(this.f40026q0[1], View.TRANSLATION_X, 0.0f, AndroidUtilities.displaySize.x));
                    }
                    this.f40027r0.setDuration(320L);
                    this.f40027r0.setInterpolator(org.telegram.ui.Components.gr.h);
                    this.f40027r0.addListener(new w0(this, i12, 0));
                    this.f40012b0.f24021f = true;
                    n0 n0Var = this.f40014d0;
                    p3 p3Var3 = this.f40026q0[0];
                    if (p3Var3 != null && SharedConfig.adaptableColorInBrowser) {
                        w02 = p3Var3.getBackgroundColor();
                    } else {
                        w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Pk, false);
                    }
                    n0Var.setMenuColors(w02);
                    n0 n0Var2 = this.f40014d0;
                    p3 p3Var4 = this.f40026q0[0];
                    if (p3Var4 != null && SharedConfig.adaptableColorInBrowser) {
                        w03 = p3Var4.getActionBarColor();
                    } else {
                        w03 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Pk, false);
                    }
                    n0Var2.d(w03, true);
                    n0 n0Var3 = this.f40014d0;
                    p3 p3Var5 = this.f40026q0[0];
                    if (p3Var5 != null && p3Var5.e()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    n0Var3.setIsTonsite(z11);
                    n0 n0Var4 = this.f40014d0;
                    p3 p3Var6 = this.f40026q0[0];
                    if (p3Var6 != null && p3Var6.d()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    n0Var4.setIsLocal(z12);
                    AnimatorSet animatorSet = this.f40027r0;
                    Objects.requireNonNull(animatorSet);
                    AndroidUtilities.runOnUIThread(new kt0(animatorSet, 4));
                }
                if (!z10) {
                    this.K0.f(true);
                }
                j4 j4Var = this.f40026q0[z10 ? 1 : 0].f41321c;
                if (z10) {
                    obj = j3.r0.j(2, this.Z);
                }
                this.f40026q0[z10 ? 1 : 0].b();
                if (obj instanceof TLRPC.WebPage) {
                    TLRPC.WebPage webPage = (TLRPC.WebPage) obj;
                    this.f40026q0[z10 ? 1 : 0].setWeb(null);
                    this.f40026q0[z10 ? 1 : 0].setType(0);
                    TL_iv.Page page = webPage.cached_page;
                    j4Var.C = page.rtl;
                    j4Var.A = webPage;
                    int size = page.blocks.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        TL_iv.PageBlock pageBlock = webPage.cached_page.blocks.get(i14);
                        if (i14 == 0) {
                            pageBlock.first = true;
                            if (pageBlock instanceof TL_iv.pageBlockCover) {
                                TL_iv.pageBlockCover pageblockcover = (TL_iv.pageBlockCover) pageBlock;
                                TL_iv.RichText w8 = w(0, pageblockcover);
                                TL_iv.RichText w10 = w(1, pageblockcover);
                                if (((w8 != null && !(w8 instanceof TL_iv.textEmpty)) || (w10 != null && !(w10 instanceof TL_iv.textEmpty))) && size > 1) {
                                    TL_iv.PageBlock pageBlock2 = webPage.cached_page.blocks.get(1);
                                    if (pageBlock2 instanceof TL_iv.pageBlockChannel) {
                                        j4Var.B = (TL_iv.pageBlockChannel) pageBlock2;
                                    }
                                }
                            }
                        } else if (i14 == 1 && j4Var.B != null) {
                        }
                        if (i14 == size - 1) {
                            i11 = i14;
                        } else {
                            i11 = 0;
                        }
                        j4Var.F(j4Var, pageBlock, 0, 0, i11);
                    }
                    j4Var.l();
                    if (this.Z.size() != 1 && i9 != -1) {
                        f2.m0 m0Var = this.f40026q0[z10 ? 1 : 0].d;
                        y3 y3Var2 = this.G;
                        if (y3Var2 == null) {
                            i13 = 0;
                        }
                        if (y3Var2 != null) {
                            i10 = AndroidUtilities.dp(32.0f);
                        } else {
                            i10 = 0;
                        }
                        m0Var.h1(i13, i10);
                    } else {
                        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("articles", 0);
                        String str = "article" + webPage.f22533id;
                        int i15 = sharedPreferences.getInt(str, -1);
                        boolean z13 = sharedPreferences.getBoolean(str + "r", true);
                        Point point = AndroidUtilities.displaySize;
                        if (point.x <= point.y) {
                            i13 = 0;
                        }
                        if (z13 == i13) {
                            dp = sharedPreferences.getInt(str + "o", 0) - this.f40026q0[z10 ? 1 : 0].f41320b.getPaddingTop();
                        } else {
                            dp = AndroidUtilities.dp(10.0f);
                        }
                        if (i15 != -1) {
                            this.f40026q0[z10 ? 1 : 0].d.h1(i15, dp);
                        }
                    }
                } else if (obj instanceof c3) {
                    this.f40026q0[z10 ? 1 : 0].setType(1);
                    this.f40026q0[z10 ? 1 : 0].g();
                    this.f40026q0[z10 ? 1 : 0].setWeb((c3) obj);
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
        p3[] p3VarArr;
        p3 p3Var;
        float translationX;
        boolean z10;
        boolean z11;
        p3 p3Var2;
        float f10;
        boolean z12;
        boolean z13;
        if (this.f40014d0 != null && (p3Var = (p3VarArr = this.f40026q0)[0]) != null && p3VarArr[1] != null) {
            int visibility = p3Var.getVisibility();
            float f11 = 0.0f;
            if (visibility != 0) {
                translationX = 0.0f;
            } else {
                translationX = 1.0f - (this.f40026q0[0].getTranslationX() / this.f40026q0[0].getWidth());
            }
            float f12 = 1.0f - translationX;
            n0 n0Var = this.f40014d0;
            n0Var.d[0] = this.f40026q0[0].getProgress();
            n0Var.invalidate();
            n0 n0Var2 = this.f40014d0;
            n0Var2.d[1] = this.f40026q0[1].getProgress();
            n0Var2.invalidate();
            this.f40014d0.setTransitionProgress(f12);
            n0 n0Var3 = this.f40014d0;
            if (!n0Var3.S && !n0Var3.P) {
                ArticleViewer$WindowView articleViewer$WindowView = this.f40012b0;
                if (articleViewer$WindowView.f24020e || articleViewer$WindowView.f24021f) {
                    boolean J = J();
                    ArrayList arrayList = this.Z;
                    if (!J && arrayList.size() <= 1) {
                        this.f40014d0.L.f();
                        this.f40014d0.setBackButtonCached(false);
                    } else {
                        if (!this.f40026q0[0].f41326s && arrayList.size() <= 1) {
                            f10 = 0.0f;
                        } else {
                            f10 = 1.0f;
                        }
                        float lerp = AndroidUtilities.lerp(f10, (this.f40026q0[1].f41326s || arrayList.size() > 2) ? 1.0f : 1.0f, f12);
                        this.f40014d0.I.c(1.0f - lerp, false);
                        this.f40014d0.L.f();
                        n0 n0Var4 = this.f40014d0;
                        if (lerp > 0.5f) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        n0Var4.setBackButtonCached(z12);
                    }
                    this.f40014d0.setHasForward(this.f40026q0[0].v);
                    this.f40014d0.setIsLocal(this.f40026q0[0].d());
                    n0 n0Var5 = this.f40014d0;
                    if (this.f40026q0[0].getWebView() != null && this.f40026q0[0].getWebView().f44037b) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    n0Var5.setIsLoaded(z13);
                }
            }
            n0 n0Var6 = this.f40014d0;
            int actionBarColor = this.f40026q0[0].getActionBarColor();
            ArticleViewer$WindowView articleViewer$WindowView2 = this.f40012b0;
            if (!articleViewer$WindowView2.f24020e && !articleViewer$WindowView2.f24021f) {
                z10 = false;
            } else {
                z10 = true;
            }
            n0Var6.b(0, this.V0.a(actionBarColor, z10));
            n0 n0Var7 = this.f40014d0;
            int actionBarColor2 = this.f40026q0[1].getActionBarColor();
            ArticleViewer$WindowView articleViewer$WindowView3 = this.f40012b0;
            if (!articleViewer$WindowView3.f24020e && !articleViewer$WindowView3.f24021f) {
                z11 = false;
            } else {
                z11 = true;
            }
            n0Var7.b(1, this.W0.a(actionBarColor2, z11));
            this.f40014d0.d(i0.a.d(f12, this.f40026q0[0].getActionBarColor(), this.f40026q0[1].getActionBarColor()), false);
            n0 n0Var8 = this.f40014d0;
            if (translationX > 0.5f) {
                p3Var2 = this.f40026q0[0];
            } else {
                p3Var2 = this.f40026q0[1];
            }
            n0Var8.setMenuType(p3Var2.f41319a);
            y3 y3Var = this.G;
            if (y3Var != null) {
                y3Var.f44700c.invalidate();
                return;
            }
            ArticleViewer$WindowView articleViewer$WindowView4 = this.f40012b0;
            if (articleViewer$WindowView4 != null) {
                articleViewer$WindowView4.invalidate();
            }
        }
    }

    public final void g(int i9, String str) {
        U();
        org.telegram.ui.ActionBar.l3 l3Var = new org.telegram.ui.ActionBar.l3();
        l3Var.v = str;
        this.Z.add(l3Var);
        this.f40014d0.h(false);
        e0(i9, l3Var, false);
    }

    public final boolean h(TLRPC.WebPage webPage, String str, int i9) {
        U();
        this.Z.add(webPage);
        this.f40014d0.h(false);
        e0(i9, webPage, false);
        return V(str, false);
    }

    public final void h0() {
        int i9;
        int size;
        boolean z10;
        boolean z11;
        float f10;
        if (this.A == null && !this.f40026q0[0].f()) {
            return;
        }
        if (this.f40026q0[0].f()) {
            if (this.f40026q0[0].getWebView() == null) {
                i9 = 0;
            } else {
                i9 = this.f40026q0[0].getWebView().getSearchIndex();
            }
            if (this.f40026q0[0].getWebView() == null) {
                size = 0;
            } else {
                size = this.f40026q0[0].getWebView().getSearchCount();
            }
        } else {
            i9 = this.C;
            size = this.A.size();
        }
        ImageView imageView = this.f40023n0;
        if (size > 0 && i9 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        imageView.setEnabled(z10);
        ImageView imageView2 = this.f40024o0;
        if (size > 0 && i9 != size - 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        imageView2.setEnabled(z11);
        ImageView imageView3 = this.f40023n0;
        float f11 = 0.5f;
        if (imageView3.isEnabled()) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        imageView3.setAlpha(f10);
        ImageView imageView4 = this.f40024o0;
        if (imageView4.isEnabled()) {
            f11 = 1.0f;
        }
        imageView4.setAlpha(f11);
        this.f40025p0.a();
        if (size < 0) {
            this.f40025p0.setText("");
        } else if (size == 0) {
            this.f40025p0.setText(LocaleController.getString(R.string.NoResult));
        } else if (size == 1) {
            this.f40025p0.setText(LocaleController.getString(R.string.OneResult));
        } else {
            this.f40025p0.setText(String.format(LocaleController.getPluralString("CountOfResults", size), Integer.valueOf(i9 + 1), Integer.valueOf(size)));
        }
    }

    public final void i0(boolean z10) {
        boolean z11;
        boolean z12 = false;
        this.f40014d0.g(0, this.f40026q0[0].getTitle(), z10);
        this.f40014d0.f(0, this.f40026q0[0].getSubtitle());
        n0 n0Var = this.f40014d0;
        if (this.f40026q0[0].f() && this.f40026q0[0].getWebView() != null && this.f40026q0[0].getWebView().A) {
            z11 = true;
        } else {
            z11 = false;
        }
        n0Var.e(0, z11);
        this.f40014d0.g(1, this.f40026q0[1].getTitle(), z10);
        this.f40014d0.f(1, this.f40026q0[1].getSubtitle());
        n0 n0Var2 = this.f40014d0;
        if (this.f40026q0[1].f() && this.f40026q0[1].getWebView() != null && this.f40026q0[1].getWebView().A) {
            z12 = true;
        }
        n0Var2.e(1, z12);
    }

    public final void k() {
        this.F0 = false;
        d3 d3Var = this.G0;
        if (d3Var != null) {
            this.f40012b0.removeCallbacks(d3Var);
            this.G0 = null;
        }
        d3 d3Var2 = this.H0;
        if (d3Var2 != null) {
            this.f40012b0.removeCallbacks(d3Var2);
            this.H0 = null;
        }
    }

    public final void m(org.telegram.messenger.z5 z5Var) {
        if (this.E0 == AndroidUtilities.dp(56.0f)) {
            if (z5Var != null) {
                z5Var.run();
                return;
            }
            return;
        }
        ValueAnimator duration = ValueAnimator.ofObject(new IntEvaluator(), Integer.valueOf(this.E0), Integer.valueOf(AndroidUtilities.dp(56.0f))).setDuration(180L);
        duration.setInterpolator(new DecelerateInterpolator());
        duration.addUpdateListener(new q(this, 0));
        duration.addListener(new t0(0, z5Var));
        if (z5Var != null) {
            duration.setDuration(duration.getDuration() / 2);
        }
        duration.start();
    }

    public final void n() {
        long j10;
        a3 a3Var;
        kh.w wVar = this.f40026q0[0].f41320b;
        if (wVar != null && this.S) {
            float measuredHeight = wVar.getMeasuredHeight() / 2.0f;
            Uri uri = null;
            float f10 = 0.0f;
            a3 a3Var2 = null;
            for (int i9 = 0; i9 < wVar.getChildCount(); i9++) {
                View childAt = wVar.getChildAt(i9);
                if (childAt instanceof a3) {
                    float measuredHeight2 = (childAt.getMeasuredHeight() / 2.0f) + childAt.getTop();
                    if (a3Var2 == null || Math.abs(measuredHeight - measuredHeight2) < Math.abs(measuredHeight - f10)) {
                        a3Var2 = (a3) childAt;
                        f10 = measuredHeight2;
                    }
                }
            }
            boolean z10 = PhotoViewer.t1().f35626f;
            if (z10 || ((a3Var = this.f36382x) != null && a3Var != a3Var2 && this.f36381w != null)) {
                VideoPlayerHolderBase videoPlayerHolderBase = this.f36381w;
                if (videoPlayerHolderBase != null) {
                    a3 a3Var3 = this.f36382x;
                    long j11 = a3Var3.H.video_id;
                    b3 a2 = b3.a(videoPlayerHolderBase, a3Var3);
                    a3Var3.c(a2);
                    this.f36383y.k(a2, j11);
                    a3 a3Var4 = this.f36382x;
                    b3 b3Var = a3Var4.I;
                    if (b3Var != null) {
                        Bitmap bitmap = b3Var.f36615b;
                        if (bitmap != null) {
                            a3Var4.f36348e.setImageBitmap(bitmap);
                        }
                        this.f36382x.e(false);
                    }
                    this.f36381w.release(null);
                }
                this.f36381w = null;
                this.f36382x = null;
            }
            if (!z10 && a3Var2 != null) {
                a70 a70Var = a3Var2.f36345a;
                if (a3Var2.K != null && a70Var.f36381w == null) {
                    a70Var.f36381w = new z2(a3Var2).with(a3Var2.f36350n);
                    TLRPC.Document document = a3Var2.K;
                    for (int i10 = 0; i10 < document.attributes.size(); i10++) {
                        if (document.attributes.get(i10) instanceof TLRPC.TL_documentAttributeVideo) {
                            TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) document.attributes.get(i10);
                            a3Var2.h.a(tL_documentAttributeVideo.f22387w / tL_documentAttributeVideo.h, 0);
                        }
                    }
                    TLRPC.WebPage webPage = a3Var2.f36346b.A;
                    if (webPage != null) {
                        uri = FileStreamLoadOperation.prepareUri(((l4) a70Var).T, document, webPage);
                    }
                    if (uri != null) {
                        VideoPlayerHolderBase videoPlayerHolderBase2 = a70Var.f36381w;
                        b3 b3Var2 = a3Var2.I;
                        if (b3Var2 == null) {
                            j10 = 0;
                        } else {
                            j10 = b3Var2.f36614a;
                        }
                        videoPlayerHolderBase2.seekTo(j10);
                        a70Var.f36381w.preparePlayer(uri, true, 1.0f);
                        a70Var.f36381w.play();
                    }
                }
                this.f36382x = a3Var2;
            }
        }
    }

    public final void o(boolean z10, boolean z11) {
        if (this.H != null && !this.P0 && this.R) {
            int i9 = 0;
            if (this.V != 0 && Math.abs(this.X - System.currentTimeMillis()) >= 500) {
                Runnable runnable = this.W;
                if (runnable != null) {
                    runnable.run();
                    this.W = null;
                }
                this.V = 0;
            }
            if (this.V == 0) {
                y3 y3Var = this.G;
                if (y3Var != null) {
                    y3Var.dismiss(false);
                    return;
                }
                if (this.L.getVisibility() == 0) {
                    if (this.K != null) {
                        this.L.setVisibility(4);
                        this.O.onCustomViewHidden();
                        this.L.removeView(this.K);
                        this.K = null;
                    } else {
                        org.telegram.ui.Components.g81 g81Var = this.A0;
                        if (g81Var != null && g81Var.P) {
                            g81Var.P = false;
                            g81Var.m();
                            g81Var.l(false);
                        }
                    }
                    if (!z11) {
                        return;
                    }
                }
                if (this.K0.y()) {
                    this.K0.f(false);
                    return;
                }
                n0 n0Var = this.f40014d0;
                if (n0Var.P) {
                    n0Var.h(false);
                } else if (n0Var.S) {
                    n0Var.k(false);
                } else {
                    if (this.B0 != 0) {
                        ConnectionsManager.getInstance(this.T).cancelRequest(this.B0, true);
                        this.B0 = 0;
                        b0(false);
                    }
                    if (this.C0 != 0) {
                        ConnectionsManager.getInstance(this.T).cancelRequest(this.C0, true);
                        this.C0 = 0;
                        b0(false);
                    }
                    U();
                    if (z10 && !z11) {
                        ArrayList arrayList = this.Z;
                        if (arrayList.size() >= 2) {
                            Object k10 = e2.c.k(1, arrayList);
                            if (k10 instanceof c3) {
                                ((c3) k10).a();
                            }
                            if (k10 instanceof TLRPC.WebPage) {
                                org.telegram.ui.web.d2.o((TLRPC.WebPage) k10);
                            }
                            e0(-1, arrayList.get(arrayList.size() - 1), false);
                            return;
                        }
                    }
                    NotificationCenter.getInstance(this.T).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
                    NotificationCenter.getInstance(this.T).removeObserver(this, NotificationCenter.messagePlayingDidReset);
                    NotificationCenter.getInstance(this.T).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
                    NotificationCenter.getInstance(this.T).removeObserver(this, NotificationCenter.messagePlayingDidStart);
                    NotificationCenter.getInstance(this.T).removeObserver(this, NotificationCenter.emojiLoaded);
                    ff.t0 t0Var = this.Q0;
                    if (t0Var != null) {
                        t0Var.destroy();
                        this.Q0 = null;
                    }
                    this.I = null;
                    try {
                        org.telegram.ui.ActionBar.f3 f3Var = this.f40017g0;
                        if (f3Var != null) {
                            f3Var.dismiss();
                            this.f40017g0 = null;
                        }
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    ArticleViewer$WindowView articleViewer$WindowView = this.f40012b0;
                    Property property = View.ALPHA;
                    animatorSet.playTogether(ObjectAnimator.ofFloat(articleViewer$WindowView, property, 0.0f), ObjectAnimator.ofFloat(this.f40013c0, property, 0.0f), ObjectAnimator.ofFloat(this.f40012b0, View.TRANSLATION_X, 0.0f, AndroidUtilities.dp(56.0f)));
                    this.V = 2;
                    this.W = new c0(this, 7);
                    animatorSet.setDuration(150L);
                    animatorSet.setInterpolator(this.Y);
                    animatorSet.addListener(new mh.x(this, 3));
                    this.X = System.currentTimeMillis();
                    this.f40013c0.setLayerType(2, null);
                    animatorSet.start();
                    while (true) {
                        a0.h hVar = this.f36383y;
                        if (i9 < hVar.m()) {
                            b3 b3Var = (b3) hVar.n(i9);
                            Bitmap bitmap = b3Var.f36615b;
                            if (bitmap != null) {
                                bitmap.recycle();
                                b3Var.f36615b = null;
                            }
                            i9++;
                        } else {
                            hVar.b();
                            return;
                        }
                    }
                }
            }
        }
    }

    public final void s() {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.Z;
            if (i9 < arrayList.size()) {
                Object obj = arrayList.get(i9);
                if (obj instanceof c3) {
                    p3 p3Var = this.f40026q0[0];
                    if (p3Var != null && p3Var.F == obj) {
                        ((c3) obj).c(p3Var);
                    }
                    p3 p3Var2 = this.f40026q0[1];
                    if (p3Var2 != null && p3Var2.F == obj) {
                        ((c3) obj).c(p3Var2);
                    }
                    ((c3) obj).a();
                } else if (obj instanceof TLRPC.WebPage) {
                    org.telegram.ui.web.d2.o((TLRPC.WebPage) obj);
                }
                i9++;
            } else {
                arrayList.clear();
                t();
                return;
            }
        }
    }

    public final void t() {
        ArticleViewer$WindowView articleViewer$WindowView;
        if (this.H != null && (articleViewer$WindowView = this.f40012b0) != null) {
            if (this.G == null) {
                try {
                    if (articleViewer$WindowView.getParent() != null) {
                        ((WindowManager) this.H.getSystemService("window")).removeViewImmediate(this.f40012b0);
                    }
                    this.f40012b0 = null;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            for (int i9 = 0; i9 < this.J.size(); i9++) {
                ((v1) this.J.get(i9)).a(true);
            }
            this.J.clear();
            try {
                this.H.getWindow().clearFlags(128);
            } catch (Exception e11) {
                FileLog.e(e11);
            }
            this.H = null;
            this.I = null;
            Y0 = null;
        }
    }

    public l4(org.telegram.ui.ActionBar.o2 o2Var) {
        this.J = new ArrayList();
        this.U = 1;
        this.Y = new DecelerateInterpolator(1.5f);
        this.Z = new ArrayList();
        this.f40028s0 = new Paint();
        this.f40029t0 = new Paint();
        this.f40030u0 = new Paint();
        this.f40031v0 = new Paint();
        this.F0 = false;
        this.G0 = null;
        this.H0 = null;
        this.N0 = new AnimationNotificationsLocker(new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats});
        this.O0 = new m0[2];
        this.S0 = -1;
        c0 c0Var = new c0(this, 2);
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        this.V0 = new org.telegram.ui.Components.b5(c0Var, 320L, grVar);
        this.W0 = new org.telegram.ui.Components.b5(new c0(this, 4), 320L, grVar);
        this.F = true;
        this.G = new y3(this, o2Var);
        Y(o2Var.getParentActivity(), o2Var);
    }
}
