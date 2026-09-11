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
public final class i4 extends v70 implements NotificationCenter.NotificationCenterDelegate {
    public static Paint B1;
    public static TextPaint f37193g1;
    public static TextPaint f37194h1;
    public static TextPaint f37195i1;
    public static TextPaint f37196j1;
    public static TextPaint f37197k1;
    public static TextPaint l1;
    public static TextPaint f37198m1;
    public static TextPaint f37199n1;
    public static Paint f37200o1;
    public static Paint f37201p1;
    public static Paint f37202q1;
    public static Paint f37203r1;
    public static Paint f37204s1;
    public static Paint f37205t1;
    public static Paint f37206u1;
    public static Paint f37207v1;
    public static Paint f37208w1;
    public static Paint f37209x1;
    public static Paint f37210y1;
    public static Paint f37211z1;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout A0;
    public TextView B0;
    public Rect C0;
    public org.telegram.ui.Components.b91 D0;
    public org.telegram.ui.Components.b91 E0;
    public int F0;
    public int G0;
    public int H0;
    public int I0;
    public final boolean J;
    public boolean J0;
    public final v3 K;
    public a3 K0;
    public Activity L;
    public a3 L0;
    public org.telegram.ui.ActionBar.n2 M;
    public of.e M0;
    public final ArrayList N;
    public int N0;
    public View O;
    public org.telegram.ui.Cells.q9 O0;
    public FrameLayout P;
    public org.telegram.ui.Cells.q9 P0;
    public TextureView Q;
    public ov0 Q0;
    public l4 R;
    public final AnimationNotificationsLocker R0;
    public WebChromeClient.CustomViewCallback S;
    public final j0[] S0;
    public WindowInsets T;
    public boolean T0;
    public boolean U;
    public kb0 U0;
    public boolean V;
    public ah.p V0;
    public boolean W;
    public int W0;
    public int X;
    public ValueAnimator X0;
    public int Y;
    public float Y0;
    public int Z;
    public final org.telegram.ui.Components.h5 Z0;
    public Runnable f37212a0;
    public final org.telegram.ui.Components.h5 f37213a1;
    public long f37214b0;
    public final DecelerateInterpolator f37215c0;
    public final ArrayList f37216d0;
    public WindowManager.LayoutParams f37217e0;
    public ArticleViewer$WindowView f37218f0;
    public j0 f37219g0;
    public k0 f37220h0;
    public org.telegram.ui.web.l f37221i0;
    public a0 f37222j0;
    public org.telegram.ui.ActionBar.f3 f37223k0;
    public Paint f37224l0;
    public Drawable m0;
    public Paint f37225n0;
    public boolean f37226o0;
    public float f37227p0;
    public bi.g5 f37228q0;
    public ImageView f37229r0;
    public ImageView f37230s0;
    public org.telegram.ui.Components.q6 f37231t0;
    public m3[] f37232u0;
    public AnimatorSet f37233v0;
    public final Paint f37234w0;
    public final Paint f37235x0;
    public final Paint f37236y0;
    public final Paint f37237z0;
    public static final HashSet f37188b1 = new HashSet();
    public static volatile i4 f37189c1 = null;
    public static final t0 f37190d1 = new t0("innerTranslationX", 0);
    public static final TextPaint f37191e1 = new TextPaint(1);
    public static final q3 f37192f1 = new q3();
    public static final WeakHashMap A1 = new WeakHashMap();

    public i4() {
        this.N = new ArrayList();
        this.Y = 1;
        this.f37215c0 = new DecelerateInterpolator(1.5f);
        this.f37216d0 = new ArrayList();
        this.f37234w0 = new Paint();
        this.f37235x0 = new Paint();
        this.f37236y0 = new Paint();
        this.f37237z0 = new Paint();
        this.J0 = false;
        this.K0 = null;
        this.L0 = null;
        this.R0 = new AnimationNotificationsLocker(new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats});
        this.S0 = new j0[2];
        this.W0 = -1;
        a0 a0Var = new a0(this, 2);
        org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
        this.Z0 = new org.telegram.ui.Components.h5(a0Var, 320L, prVar);
        this.f37213a1 = new org.telegram.ui.Components.h5(new a0(this, 4), 320L, prVar);
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

    public static CharSequence C(v70 v70Var, TLRPC.WebPage webPage, View view, TL_iv.RichText richText, TL_iv.RichText richText2, TL_iv.PageBlock pageBlock, int i10) {
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.j01 j01Var;
        org.telegram.ui.Components.j01 j01Var2;
        TextPaint textPaint = null;
        if (richText2 == null) {
            return null;
        }
        if (richText2 instanceof TL_iv.textFixed) {
            return C(v70Var, webPage, view, richText, ((TL_iv.textFixed) richText2).text, pageBlock, i10);
        }
        if (richText2 instanceof TL_iv.textItalic) {
            return C(v70Var, webPage, view, richText, ((TL_iv.textItalic) richText2).text, pageBlock, i10);
        }
        if (richText2 instanceof TL_iv.textBold) {
            return C(v70Var, webPage, view, richText, ((TL_iv.textBold) richText2).text, pageBlock, i10);
        }
        if (richText2 instanceof TL_iv.textUnderline) {
            return C(v70Var, webPage, view, richText, ((TL_iv.textUnderline) richText2).text, pageBlock, i10);
        }
        if (richText2 instanceof TL_iv.textStrike) {
            return C(v70Var, webPage, view, richText, ((TL_iv.textStrike) richText2).text, pageBlock, i10);
        }
        if (richText2 instanceof TL_iv.textEmail) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C(v70Var, webPage, view, richText, ((TL_iv.textEmail) richText2).text, pageBlock, i10));
            MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), MetricAffectingSpan.class);
            if (spannableStringBuilder.length() != 0) {
                if (metricAffectingSpanArr == null || metricAffectingSpanArr.length == 0) {
                    textPaint = E(v70Var, richText, richText2, pageBlock);
                }
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.j01(textPaint, "mailto:" + F(richText2)), 0, spannableStringBuilder.length(), 33);
            }
            return spannableStringBuilder;
        }
        long j3 = 0;
        if (richText2 instanceof TL_iv.textUrl) {
            TL_iv.textUrl texturl = (TL_iv.textUrl) richText2;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(C(v70Var, webPage, view, richText, texturl.text, pageBlock, i10));
            MetricAffectingSpan[] metricAffectingSpanArr2 = (MetricAffectingSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), MetricAffectingSpan.class);
            if (metricAffectingSpanArr2 == null || metricAffectingSpanArr2.length == 0) {
                textPaint = E(v70Var, richText, richText2, pageBlock);
            }
            if (texturl.webpage_id != 0) {
                j01Var2 = new org.telegram.ui.Components.j01(textPaint, F(richText2));
            } else {
                j01Var2 = new org.telegram.ui.Components.j01(textPaint, F(richText2));
            }
            if (spannableStringBuilder2.length() != 0) {
                spannableStringBuilder2.setSpan(j01Var2, 0, spannableStringBuilder2.length(), 33);
            }
            return spannableStringBuilder2;
        } else if (richText2 instanceof TL_iv.textPlain) {
            return ((TL_iv.textPlain) richText2).text;
        } else {
            if (richText2 instanceof TL_iv.textAnchor) {
                TL_iv.textAnchor textanchor = (TL_iv.textAnchor) richText2;
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(C(v70Var, webPage, view, richText, textanchor.text, pageBlock, i10));
                String str = textanchor.name;
                ?? metricAffectingSpan = new MetricAffectingSpan();
                metricAffectingSpan.f25914a = str.toLowerCase();
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
                        CharSequence C = C(v70Var, webPage, view, richText, richText3, pageBlock, i10);
                        int D = D(A);
                        int length = spannableStringBuilder4.length();
                        spannableStringBuilder4.append(C);
                        if (D != 0 && !(C instanceof SpannableStringBuilder)) {
                            if ((D & 8) == 0 && (D & 512) == 0) {
                                if (length != spannableStringBuilder4.length()) {
                                    TextPaint E = E(v70Var, richText, A, pageBlock);
                                    ?? metricAffectingSpan2 = new MetricAffectingSpan();
                                    metricAffectingSpan2.f26921a = E;
                                    spannableStringBuilder4.setSpan(metricAffectingSpan2, length, spannableStringBuilder4.length(), 33);
                                }
                            } else {
                                String F = F(richText3);
                                if (F == null) {
                                    F = F(richText);
                                }
                                if ((D & 512) != 0) {
                                    j01Var = new org.telegram.ui.Components.j01(E(v70Var, richText, A, pageBlock), F);
                                } else {
                                    j01Var = new org.telegram.ui.Components.j01(E(v70Var, richText, A, pageBlock), F);
                                }
                                if (length != spannableStringBuilder4.length()) {
                                    spannableStringBuilder4.setSpan(j01Var, length, spannableStringBuilder4.length(), 33);
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
                    return C(v70Var, webPage, view, richText, ((TL_iv.textSubscript) richText2).text, pageBlock, i10);
                } else {
                    if (richText2 instanceof TL_iv.textSuperscript) {
                        return C(v70Var, webPage, view, richText, ((TL_iv.textSuperscript) richText2).text, pageBlock, i10);
                    }
                    if (richText2 instanceof TL_iv.textMarked) {
                        SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(C(v70Var, webPage, view, richText, ((TL_iv.textMarked) richText2).text, pageBlock, i10));
                        MetricAffectingSpan[] metricAffectingSpanArr3 = (MetricAffectingSpan[]) spannableStringBuilder5.getSpans(0, spannableStringBuilder5.length(), MetricAffectingSpan.class);
                        if (spannableStringBuilder5.length() != 0) {
                            if (metricAffectingSpanArr3 == null || metricAffectingSpanArr3.length == 0) {
                                textPaint = E(v70Var, richText, richText2, pageBlock);
                            }
                            ?? metricAffectingSpan3 = new MetricAffectingSpan();
                            metricAffectingSpan3.f26554a = textPaint;
                            spannableStringBuilder5.setSpan(metricAffectingSpan3, 0, spannableStringBuilder5.length(), 33);
                        }
                        return spannableStringBuilder5;
                    } else if (richText2 instanceof TL_iv.textSpoiler) {
                        SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder(C(v70Var, webPage, view, richText, ((TL_iv.textSpoiler) richText2).text, pageBlock, i10));
                        if (spannableStringBuilder6.length() != 0) {
                            ?? obj = new Object();
                            obj.f28591a |= 256;
                            spannableStringBuilder6.setSpan(new org.telegram.ui.Components.o01(obj, 0), 0, spannableStringBuilder6.length(), 33);
                        }
                        return spannableStringBuilder6;
                    } else if (richText2 instanceof TL_iv.textPhone) {
                        SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder(C(v70Var, webPage, view, richText, ((TL_iv.textPhone) richText2).text, pageBlock, i10));
                        MetricAffectingSpan[] metricAffectingSpanArr4 = (MetricAffectingSpan[]) spannableStringBuilder7.getSpans(0, spannableStringBuilder7.length(), MetricAffectingSpan.class);
                        if (spannableStringBuilder7.length() != 0) {
                            if (metricAffectingSpanArr4 == null || metricAffectingSpanArr4.length == 0) {
                                textPaint = E(v70Var, richText, richText2, pageBlock);
                            }
                            spannableStringBuilder7.setSpan(new org.telegram.ui.Components.j01(textPaint, "tel:" + F(richText2)), 0, spannableStringBuilder7.length(), 33);
                        }
                        return spannableStringBuilder7;
                    } else {
                        if (richText2 instanceof TL_iv.textImage) {
                            TL_iv.textImage textimage = (TL_iv.textImage) richText2;
                            TLRPC.Document a2 = f4.a(webPage, textimage.document_id);
                            TLRPC.Photo e7 = f4.e(webPage, textimage.photo_id);
                            if (a2 != null) {
                                SpannableStringBuilder spannableStringBuilder8 = new SpannableStringBuilder("*");
                                int dp = AndroidUtilities.dp(textimage.f20094w);
                                int dp2 = AndroidUtilities.dp(textimage.h);
                                int abs = Math.abs(i10);
                                if (dp > abs) {
                                    dp2 = (int) (dp2 * (abs / dp));
                                    dp = abs;
                                }
                                if (view != null) {
                                    int i12 = org.telegram.ui.ActionBar.j6.f20663d6;
                                    ((i4) v70Var).getClass();
                                    if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.w0(null, i12, false)) <= 0.705f) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    ?? replacementSpan = new ReplacementSpan();
                                    Locale locale = Locale.US;
                                    String str2 = dp + "_" + dp2 + "_i";
                                    replacementSpan.f26225b = dp;
                                    replacementSpan.f26226c = dp2;
                                    boolean z12 = z10;
                                    ImageReceiver imageReceiver = new ImageReceiver(view);
                                    replacementSpan.f26224a = imageReceiver;
                                    imageReceiver.setInvalidateAll(true);
                                    if (z12) {
                                        imageReceiver.setDelegate(new org.telegram.ui.Components.wo0(7));
                                    }
                                    imageReceiver.setImage(ImageLocation.getForDocument(a2), str2, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(a2.thumbs, 90), a2), str2, -1L, null, webPage, 1);
                                    spannableStringBuilder8.setSpan(replacementSpan, 0, spannableStringBuilder8.length(), 33);
                                }
                                return spannableStringBuilder8;
                            } else if (e7 instanceof org.telegram.ui.web.i2) {
                                org.telegram.ui.web.i2 i2Var = (org.telegram.ui.web.i2) e7;
                                SpannableStringBuilder spannableStringBuilder9 = new SpannableStringBuilder("*");
                                int dp3 = AndroidUtilities.dp(textimage.f20094w);
                                int dp4 = AndroidUtilities.dp(textimage.h);
                                int abs2 = Math.abs(i10);
                                if (dp3 > abs2) {
                                    dp4 = (int) (dp4 * (abs2 / dp3));
                                    dp3 = abs2;
                                }
                                if (view != null) {
                                    ?? replacementSpan2 = new ReplacementSpan();
                                    replacementSpan2.f26225b = dp3;
                                    replacementSpan2.f26226c = dp4;
                                    ImageReceiver imageReceiver2 = new ImageReceiver(view);
                                    replacementSpan2.f26224a = imageReceiver2;
                                    imageReceiver2.setInvalidateAll(true);
                                    org.telegram.ui.web.j2.g(i2Var, imageReceiver2, new org.telegram.ui.Components.ue(9));
                                    spannableStringBuilder9.setSpan(replacementSpan2, 0, spannableStringBuilder9.length(), 33);
                                }
                                return spannableStringBuilder9;
                            }
                        } else if (richText2 instanceof TL_iv.textMath) {
                            TL_iv.textMath textmath = (TL_iv.textMath) richText2;
                            if (textmath.bitmap == null && !textmath.tried) {
                                textmath.tried = true;
                                ji.s a10 = ji.s.a(textmath.source, AndroidUtilities.dp(20.0f), true);
                                if (a10 != null) {
                                    textmath.f20095w = a10.f14155b;
                                    textmath.h = a10.f14156c;
                                    textmath.depth = a10.d;
                                    textmath.bitmap = a10.f14154a;
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
                                int i13 = textmath.f20095w;
                                int i14 = textmath.h;
                                int i15 = org.telegram.ui.ActionBar.j6.G6;
                                ((i4) v70Var).getClass();
                                spannableStringBuilder10.setSpan(new org.telegram.ui.Components.g01(view, bitmap, i13, i14, org.telegram.ui.ActionBar.j6.w0(null, i15, false), textmath.depth), 0, spannableStringBuilder10.length(), 33);
                                String str4 = textmath.source;
                                if (str4 != null && !str4.isEmpty()) {
                                    spannableStringBuilder10.setSpan(new org.telegram.ui.Cells.w9(textmath.source), 0, spannableStringBuilder10.length(), 33);
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

    public static TextPaint E(v70 v70Var, TL_iv.RichText richText, TL_iv.RichText richText2, TL_iv.PageBlock pageBlock) {
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
        i4 i4Var = (i4) v70Var;
        i4Var.getClass();
        q3 q3Var = f37192f1;
        q3Var.getClass();
        SparseArray sparseArray = q3Var.f39712x;
        SparseArray sparseArray2 = q3Var.f39711w;
        SparseArray sparseArray3 = q3Var.f39709t;
        SparseArray sparseArray4 = q3Var.f39694c;
        SparseArray sparseArray5 = q3Var.f39693b;
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
            b10 = v70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockMap) {
            TL_iv.RichText richText4 = ((TL_iv.pageBlockMap) pageBlock).caption.text;
            if (richText4 != richText2 && richText4 != richText) {
                dp6 = AndroidUtilities.dp(12.0f);
            } else {
                dp6 = AndroidUtilities.dp(14.0f);
                sparseArray4 = sparseArray5;
            }
            dp8 = dp6;
            b10 = v70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockTitle) {
            sparseArray4 = q3Var.d;
            dp8 = AndroidUtilities.dp(23.0f);
            b10 = v70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockKicker) {
            sparseArray4 = q3Var.f39695e;
            dp8 = AndroidUtilities.dp(14.0f);
            b10 = v70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockAuthorDate) {
            sparseArray4 = q3Var.f39704o;
            dp8 = AndroidUtilities.dp(14.0f);
            b10 = v70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockFooter) {
            sparseArray4 = q3Var.f39705p;
            dp8 = AndroidUtilities.dp(14.0f);
            b10 = v70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockSubtitle) {
            sparseArray4 = q3Var.f39697g;
            dp8 = AndroidUtilities.dp(20.0f);
            b10 = v70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeader) {
            sparseArray4 = q3Var.f39696f;
            dp8 = AndroidUtilities.dp(20.0f);
            b10 = v70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockSubheader) {
            sparseArray4 = q3Var.h;
            dp8 = AndroidUtilities.dp(17.0f);
            b10 = v70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading1) {
            sparseArray4 = q3Var.f39698i;
            dp8 = AndroidUtilities.dp(18.0f);
            b10 = v70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading2) {
            sparseArray4 = q3Var.f39699j;
            dp8 = AndroidUtilities.dp(16.0f);
            b10 = v70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading3) {
            sparseArray4 = q3Var.f39700k;
            dp8 = AndroidUtilities.dp(15.0f);
            b10 = v70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading4) {
            sparseArray4 = q3Var.f39701l;
            dp8 = AndroidUtilities.dp(14.0f);
            b10 = v70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading5) {
            sparseArray4 = q3Var.f39702m;
            dp8 = AndroidUtilities.dp(13.0f);
            b10 = v70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading6) {
            sparseArray4 = q3Var.f39703n;
            dp8 = AndroidUtilities.dp(12.0f);
            b10 = v70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) pageBlock;
            if (pageblockblockquote.text == richText) {
                dp8 = AndroidUtilities.dp(15.0f);
                b10 = v70Var.b();
                sparseArray4 = sparseArray3;
            } else {
                if (pageblockblockquote.caption == richText) {
                    dp8 = AndroidUtilities.dp(14.0f);
                    b10 = v70Var.a();
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
                b10 = v70Var.b();
                sparseArray4 = sparseArray3;
            } else {
                if (pageblockpullquote.caption == richText) {
                    dp8 = AndroidUtilities.dp(14.0f);
                    b10 = v70Var.a();
                    sparseArray3 = sparseArray5;
                    sparseArray4 = sparseArray3;
                }
                b10 = -65536;
                sparseArray3 = null;
                sparseArray4 = sparseArray3;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
            sparseArray4 = q3Var.f39708s;
            dp8 = AndroidUtilities.dp(14.0f);
            b10 = v70Var.b();
            D |= 4;
        } else if (pageBlock instanceof TL_iv.pageBlockParagraph) {
            sparseArray4 = q3Var.f39706q;
            dp8 = AndroidUtilities.dp(16.0f);
            b10 = v70Var.b();
        } else if (L(pageBlock)) {
            sparseArray4 = q3Var.f39707r;
            dp8 = AndroidUtilities.dp(16.0f);
            b10 = v70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockEmbed) {
            TL_iv.RichText richText5 = ((TL_iv.pageBlockEmbed) pageBlock).caption.text;
            if (richText5 != richText2 && richText5 != richText) {
                dp5 = AndroidUtilities.dp(12.0f);
            } else {
                dp5 = AndroidUtilities.dp(14.0f);
                sparseArray4 = sparseArray5;
            }
            dp8 = dp5;
            b10 = v70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
            TL_iv.RichText richText6 = ((TL_iv.pageBlockSlideshow) pageBlock).caption.text;
            if (richText6 != richText2 && richText6 != richText) {
                dp4 = AndroidUtilities.dp(12.0f);
            } else {
                dp4 = AndroidUtilities.dp(14.0f);
                sparseArray4 = sparseArray5;
            }
            dp8 = dp4;
            b10 = v70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockCollage) {
            TL_iv.RichText richText7 = ((TL_iv.pageBlockCollage) pageBlock).caption.text;
            if (richText7 != richText2 && richText7 != richText) {
                dp3 = AndroidUtilities.dp(12.0f);
            } else {
                dp3 = AndroidUtilities.dp(14.0f);
                sparseArray4 = sparseArray5;
            }
            dp8 = dp3;
            b10 = v70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockEmbedPost) {
            TL_iv.PageCaption pageCaption = ((TL_iv.pageBlockEmbedPost) pageBlock).caption;
            if (richText2 == pageCaption.text) {
                dp8 = AndroidUtilities.dp(14.0f);
                b10 = v70Var.a();
                sparseArray4 = sparseArray5;
            } else if (richText2 == pageCaption.credit) {
                dp8 = AndroidUtilities.dp(12.0f);
                b10 = v70Var.a();
            } else {
                if (richText2 != null) {
                    sparseArray4 = q3Var.f39710u;
                    dp8 = AndroidUtilities.dp(14.0f);
                    b10 = v70Var.b();
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
                b10 = v70Var.b();
            } else if (pageBlock instanceof TL_iv.pageBlockAudio) {
                if (richText2 == ((TL_iv.pageBlockAudio) pageBlock).caption.text) {
                    dp = AndroidUtilities.dp(14.0f);
                    sparseArray = sparseArray2;
                } else {
                    dp = AndroidUtilities.dp(12.0f);
                }
                dp8 = dp;
                b10 = v70Var.b();
            } else if (pageBlock instanceof TL_iv.pageBlockRelatedArticles) {
                sparseArray4 = q3Var.f39713y;
                dp8 = AndroidUtilities.dp(15.0f);
                b10 = v70Var.a();
            } else if (pageBlock instanceof TL_iv.pageBlockDetails) {
                sparseArray4 = q3Var.f39714z;
                dp8 = AndroidUtilities.dp(15.0f);
                b10 = v70Var.b();
            } else {
                if (pageBlock instanceof TL_iv.pageBlockTable) {
                    sparseArray4 = q3Var.A;
                    dp8 = AndroidUtilities.dp(15.0f);
                    b10 = v70Var.b();
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
            if (q3Var.f39692a == null) {
                TextPaint textPaint = new TextPaint(1);
                q3Var.f39692a = textPaint;
                textPaint.setColor(-65536);
            }
            q3Var.f39692a.setTextSize(AndroidUtilities.dp(14.0f));
            return q3Var.f39692a;
        }
        TextPaint textPaint2 = (TextPaint) sparseArray4.get(D);
        if (textPaint2 == null) {
            textPaint2 = new TextPaint(1);
            if ((D & 4) != 0) {
                textPaint2.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
            } else if (pageBlock instanceof TL_iv.pageBlockRelatedArticles) {
                textPaint2.setTypeface(AndroidUtilities.bold());
            } else if (v70Var.f41433a != 1 && !(pageBlock instanceof TL_iv.pageBlockTitle) && !(pageBlock instanceof TL_iv.pageBlockKicker) && !(pageBlock instanceof TL_iv.pageBlockHeader) && !(pageBlock instanceof TL_iv.pageBlockSubtitle) && !(pageBlock instanceof TL_iv.pageBlockSubheader) && !K(pageBlock)) {
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
                i4Var.getClass();
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
        if (f37189c1 != null) {
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
        if (!(pageBlock instanceof y3) && !(pageBlock instanceof a4)) {
            return false;
        }
        return true;
    }

    public static boolean O(w3 w3Var) {
        boolean z10;
        TL_iv.PageBlock z11 = z(w3Var.f41752a);
        if (z11 instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) z11;
            if (!pageblockdetails.open) {
                pageblockdetails.open = true;
                return true;
            }
        } else if (z11 instanceof w3) {
            w3 w3Var2 = (w3) z11;
            TL_iv.PageBlock z12 = z(w3Var2.f41753b);
            if (z12 instanceof TL_iv.pageBlockDetails) {
                TL_iv.pageBlockDetails pageblockdetails2 = (TL_iv.pageBlockDetails) z12;
                if (!pageblockdetails2.open) {
                    pageblockdetails2.open = true;
                    z10 = true;
                    if (!O(w3Var2) || z10) {
                        return true;
                    }
                }
            }
            z10 = false;
            if (!O(w3Var2)) {
            }
            return true;
        }
        return false;
    }

    public static void T(v70 v70Var) {
        if (v70Var.f41434b != null || v70Var.f41437f != null) {
            View view = v70Var.f41437f;
            v70Var.f41435c.d(true);
            v70Var.f41434b = null;
            v70Var.d = null;
            v70Var.f41437f = null;
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

    public static void f(String str, int i10, FrameLayout frameLayout, v3 v3Var, org.telegram.ui.ActionBar.f6 f6Var) {
        String v = org.telegram.ui.web.d1.v(str);
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
        new org.telegram.ui.Components.yc(frameLayout, f6Var).Q(R.raw.saved_messages, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.WebBookmarkedToast), new bi.g(v3Var, clientUserId, 18))).k(true);
    }

    public static void g0(i4 i4Var) {
        TextPaint textPaint = f37198m1;
        if (textPaint != null) {
            textPaint.setColor(i4Var.b());
        }
        TextPaint textPaint2 = f37199n1;
        if (textPaint2 != null) {
            textPaint2.setColor(i4Var.b());
        }
        TextPaint textPaint3 = f37193g1;
        if (textPaint3 != null) {
            textPaint3.setColor(i4Var.b());
        }
        TextPaint textPaint4 = f37195i1;
        if (textPaint4 != null) {
            textPaint4.setColor(i4Var.b());
        }
        TextPaint textPaint5 = f37196j1;
        if (textPaint5 != null) {
            textPaint5.setColor(-1);
        }
        TextPaint textPaint6 = f37197k1;
        if (textPaint6 != null) {
            textPaint6.setColor(i4Var.b());
        }
        TextPaint textPaint7 = l1;
        if (textPaint7 != null) {
            textPaint7.setColor(i4Var.a());
        }
        TextPaint textPaint8 = f37194h1;
        if (textPaint8 != null) {
            textPaint8.setColor(i4Var.a());
        }
        r(i4Var, true);
        q3 q3Var = f37192f1;
        q3.a(i4Var, q3Var.d);
        q3.a(i4Var, q3Var.f39695e);
        q3.a(i4Var, q3Var.f39697g);
        q3.a(i4Var, q3Var.f39696f);
        q3.a(i4Var, q3Var.h);
        q3.a(i4Var, q3Var.f39698i);
        q3.a(i4Var, q3Var.f39699j);
        q3.a(i4Var, q3Var.f39700k);
        q3.a(i4Var, q3Var.f39701l);
        q3.a(i4Var, q3Var.f39702m);
        q3.a(i4Var, q3Var.f39703n);
        q3.a(i4Var, q3Var.f39709t);
        q3.a(i4Var, q3Var.f39708s);
        q3.a(i4Var, q3Var.f39706q);
        q3.a(i4Var, q3Var.f39707r);
        q3.a(i4Var, q3Var.f39710u);
        q3.a(i4Var, q3Var.f39711w);
        q3.a(i4Var, q3Var.f39712x);
        q3.a(i4Var, q3Var.f39693b);
        q3.a(i4Var, q3Var.f39694c);
        q3.a(i4Var, q3Var.f39704o);
        q3.a(i4Var, q3Var.f39705p);
        q3.a(i4Var, q3Var.v);
        q3.a(i4Var, q3Var.f39713y);
        q3.a(i4Var, q3Var.f39714z);
        q3.a(i4Var, q3Var.A);
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

    public static CharSequence j(v70 v70Var, g4 g4Var, b3 b3Var) {
        StaticLayout staticLayout;
        if (b3Var != null && (staticLayout = b3Var.d) != null) {
            SpannableStringBuilder spannableStringBuilder = b3Var.f34620y;
            if (spannableStringBuilder != null) {
                return spannableStringBuilder;
            }
            CharSequence text = staticLayout.getText();
            if (!(text instanceof Spannable)) {
                return text;
            }
            Spannable spannable = (Spannable) text;
            org.telegram.ui.Components.j01[] j01VarArr = (org.telegram.ui.Components.j01[]) spannable.getSpans(0, spannable.length(), org.telegram.ui.Components.j01.class);
            SpannableStringBuilder spannableStringBuilder2 = text;
            if (j01VarArr != null) {
                spannableStringBuilder2 = text;
                if (j01VarArr.length != 0) {
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannable);
                    for (org.telegram.ui.Components.j01 j01Var : j01VarArr) {
                        int spanStart = spannableStringBuilder3.getSpanStart(j01Var);
                        int spanEnd = spannableStringBuilder3.getSpanEnd(j01Var);
                        if (spanStart >= 0 && spanEnd > spanStart) {
                            spannableStringBuilder3.setSpan(new n0(v70Var, g4Var, j01Var, 0), spanStart, spanEnd, 33);
                        }
                    }
                    b3Var.f34620y = spannableStringBuilder3;
                    spannableStringBuilder2 = spannableStringBuilder3;
                }
            }
            return spannableStringBuilder2;
        }
        return null;
    }

    public static TL_iv.PageBlock j0(TL_iv.PageBlock pageBlock, w3 w3Var) {
        if (pageBlock instanceof y3) {
            y3 y3Var = (y3) pageBlock;
            y3 y3Var2 = new y3();
            y3Var2.f42970a = y3Var.f42970a;
            y3Var2.f42971b = y3Var.f42971b;
            y3Var2.f42972c = y3Var.f42972c;
            y3Var2.d = j0(y3Var.d, w3Var);
            return y3Var2;
        } else if (pageBlock instanceof a4) {
            a4 a4Var = (a4) pageBlock;
            a4 a4Var2 = new a4();
            a4Var2.f34325a = a4Var.f34325a;
            a4Var2.f34326b = a4Var.f34326b;
            a4Var2.f34327c = a4Var.f34327c;
            a4Var2.d = j0(a4Var.d, w3Var);
            return a4Var2;
        } else {
            return w3Var;
        }
    }

    public static boolean l(org.telegram.ui.v70 r25, org.telegram.ui.g4 r26, android.view.MotionEvent r27, android.view.View r28, org.telegram.ui.b3 r29, int r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.i4.l(org.telegram.ui.v70, org.telegram.ui.g4, android.view.MotionEvent, android.view.View, org.telegram.ui.b3, int, int):boolean");
    }

    public static org.telegram.ui.b3 p(org.telegram.ui.v70 r20, android.view.View r21, java.lang.CharSequence r22, org.telegram.tgnet.tl.TL_iv.RichText r23, int r24, int r25, org.telegram.tgnet.tl.TL_iv.PageBlock r26, android.text.Layout.Alignment r27, int r28, org.telegram.ui.g4 r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.i4.p(org.telegram.ui.v70, android.view.View, java.lang.CharSequence, org.telegram.tgnet.tl.TL_iv$RichText, int, int, org.telegram.tgnet.tl.TL_iv$PageBlock, android.text.Layout$Alignment, int, org.telegram.ui.g4):org.telegram.ui.b3");
    }

    public static b3 q(v70 v70Var, View view, CharSequence charSequence, TL_iv.RichText richText, int i10, int i11, TL_iv.PageBlock pageBlock, g4 g4Var) {
        return p(v70Var, view, charSequence, richText, i10, i11, pageBlock, Layout.Alignment.ALIGN_NORMAL, 0, g4Var);
    }

    public static void r(i4 i4Var, boolean z10) {
        int i10;
        if (f37202q1 == null) {
            f37202q1 = new Paint();
            f37201p1 = new Paint();
            Paint paint = new Paint(1);
            f37204s1 = paint;
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            f37204s1.setStrokeWidth(AndroidUtilities.dp(1.0f));
            Paint paint2 = new Paint();
            f37205t1 = paint2;
            paint2.setStyle(style);
            f37205t1.setStrokeWidth(AndroidUtilities.dp(1.0f) / 2.0f);
            f37206u1 = new Paint();
            f37207v1 = new Paint();
            f37208w1 = new Paint();
            f37209x1 = new Paint(1);
            f37210y1 = new Paint(1);
            f37200o1 = new Paint();
            f37203r1 = new Paint();
            f37211z1 = new Paint(1);
        } else if (!z10) {
            return;
        }
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20663d6, false);
        float green = Color.green(w02) * 0.7152f;
        float y3 = com.google.android.gms.internal.vision.e2.y(Color.blue(w02), 0.0722f, green + (Color.red(w02) * 0.2126f), 255.0f);
        Paint paint3 = f37210y1;
        if (y3 <= 0.705f) {
            i10 = -3041234;
        } else {
            i10 = -6551;
        }
        paint3.setColor(i10);
        Paint paint4 = f37209x1;
        int i11 = org.telegram.ui.ActionBar.j6.K6;
        paint4.setColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false) & 872415231);
        f37209x1.setPathEffect(org.telegram.ui.Components.x80.c());
        f37208w1.setColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false) & 872415231);
        f37208w1.setPathEffect(org.telegram.ui.Components.x80.c());
        Paint paint5 = f37205t1;
        int i12 = org.telegram.ui.ActionBar.j6.f20791k6;
        paint5.setColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        f37204s1.setColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        f37200o1.setColor(251658240);
        f37203r1.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20664d7, false));
        f37211z1.setColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false) & 872415231);
        f37211z1.setPathEffect(org.telegram.ui.Components.x80.c());
        int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.M6, false);
        int red = Color.red(w03);
        int green2 = Color.green(w03);
        int blue = Color.blue(w03);
        f37207v1.setColor(Color.argb(20, red, green2, blue));
        f37206u1.setColor(Color.argb(34, red, green2, blue));
        int w04 = org.telegram.ui.ActionBar.j6.w0(null, i11, false);
        f37201p1.setColor(Color.argb(20, Color.red(w04), Color.green(w04), Color.blue(w04)));
        f37202q1.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Uc, false));
    }

    public static void u(Canvas canvas, v70 v70Var, TL_iv.PageBlock pageBlock, int i10) {
        int i11;
        if (pageBlock != null && v70Var != null && f37202q1 != null) {
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
                    canvas.drawRect(dp, 0.0f, AndroidUtilities.dp(2.0f) + dp, i13, f37202q1);
                    return;
                }
                return;
            }
            while (i14 != 0) {
                if ((i14 & 1) != 0) {
                    int dp2 = AndroidUtilities.dp((i12 * 14) + 18);
                    canvas.drawRect(dp2, 0.0f, AndroidUtilities.dp(2.0f) + dp2, i13, f37202q1);
                }
                i14 >>>= 1;
                i12++;
            }
        }
    }

    public static void v(org.telegram.ui.v70 r2, android.graphics.Canvas r3, org.telegram.ui.Cells.p9 r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.i4.v(org.telegram.ui.v70, android.graphics.Canvas, org.telegram.ui.Cells.p9, int):void");
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

    public static i4 x() {
        i4 i4Var;
        i4 i4Var2 = f37189c1;
        if (i4Var2 == null) {
            synchronized (i4.class) {
                try {
                    i4Var = f37189c1;
                    if (i4Var == null) {
                        i4Var = new i4();
                        f37189c1 = i4Var;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return i4Var;
        }
        return i4Var2;
    }

    public static View y(View view) {
        org.telegram.ui.Components.vk0 vk0Var;
        if (view instanceof y1) {
            org.telegram.ui.Components.vk0 vk0Var2 = ((y1) view).d;
            if (vk0Var2 != null) {
                return y(vk0Var2.f45738a);
            }
            return view;
        } else if ((view instanceof b2) && (vk0Var = ((b2) view).d) != null) {
            return y(vk0Var.f45738a);
        } else {
            return view;
        }
    }

    public static TL_iv.PageBlock z(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof y3) {
            TL_iv.PageBlock pageBlock2 = ((y3) pageBlock).d;
            if (pageBlock2 != null) {
                return z(pageBlock2);
            }
            return pageBlock2;
        } else if (pageBlock instanceof a4) {
            TL_iv.PageBlock pageBlock3 = ((a4) pageBlock).d;
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
        ArrayList arrayList = this.f37216d0;
        int size = arrayList.size();
        v3 v3Var = this.K;
        boolean z11 = false;
        if (size <= 1) {
            ArticleViewer$WindowView articleViewer$WindowView = this.f37218f0;
            articleViewer$WindowView.f21568e = false;
            articleViewer$WindowView.d = false;
            j0 j0Var = this.f37219g0;
            if (v3Var != null) {
                x10 = v3Var.I * v3Var.f41395c.getWidth();
            } else {
                x10 = j0Var.getX();
            }
            AnimatorSet animatorSet = new AnimatorSet();
            float measuredWidth = j0Var.getMeasuredWidth() - x10;
            if (v3Var != null) {
                animatorSet.playTogether(v3Var.d(1.0f));
            } else {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.f37219g0, View.TRANSLATION_X, j0Var.getMeasuredWidth()), ObjectAnimator.ofFloat(this.f37218f0, f37190d1, j0Var.getMeasuredWidth()));
            }
            animatorSet.setDuration(Math.max((int) ((420.0f / j0Var.getMeasuredWidth()) * measuredWidth), 250));
            animatorSet.setInterpolator(org.telegram.ui.Components.pr.h);
            animatorSet.addListener(new v0(this));
            animatorSet.start();
            this.T0 = true;
            return;
        }
        ArticleViewer$WindowView articleViewer$WindowView2 = this.f37218f0;
        articleViewer$WindowView2.f21569f = true;
        articleViewer$WindowView2.f21568e = true;
        articleViewer$WindowView2.h = this.I0;
        this.f37232u0[1].setVisibility(0);
        this.f37232u0[1].setAlpha(1.0f);
        this.f37232u0[1].setTranslationX(0.0f);
        m3 m3Var = this.f37232u0[0];
        if (v3Var == null) {
            color = 0;
        } else {
            color = this.f37224l0.getColor();
        }
        m3Var.setBackgroundColor(color);
        e0(-1, arrayList.get(arrayList.size() - 2), true);
        m3 m3Var2 = this.f37232u0[0];
        m3Var2.getX();
        AnimatorSet animatorSet2 = new AnimatorSet();
        m3Var2.getMeasuredWidth();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f37232u0[0], View.TRANSLATION_X, m3Var2.getMeasuredWidth()));
        animatorSet2.setDuration(420L);
        animatorSet2.setInterpolator(org.telegram.ui.Components.pr.h);
        animatorSet2.addListener(new w0(this));
        animatorSet2.start();
        k0 k0Var = this.f37220h0;
        m3 m3Var3 = this.f37232u0[0];
        if (m3Var3 != null && SharedConfig.adaptableColorInBrowser) {
            w02 = m3Var3.getBackgroundColor();
        } else {
            w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false);
        }
        k0Var.setMenuColors(w02);
        k0 k0Var2 = this.f37220h0;
        m3 m3Var4 = this.f37232u0[0];
        if (m3Var4 != null && SharedConfig.adaptableColorInBrowser) {
            w03 = m3Var4.getActionBarColor();
        } else {
            w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false);
        }
        k0Var2.d(w03, true);
        k0 k0Var3 = this.f37220h0;
        m3 m3Var5 = this.f37232u0[0];
        if (m3Var5 != null && m3Var5.e()) {
            z10 = true;
        } else {
            z10 = false;
        }
        k0Var3.setIsTonsite(z10);
        k0 k0Var4 = this.f37220h0;
        m3 m3Var6 = this.f37232u0[0];
        if (m3Var6 != null && m3Var6.d()) {
            z11 = true;
        }
        k0Var4.setIsLocal(z11);
        this.T0 = true;
    }

    public final void H(int i10) {
        int color;
        int w02;
        int w03;
        boolean z10;
        float x10;
        ArrayList arrayList = this.f37216d0;
        int size = arrayList.size();
        v3 v3Var = this.K;
        boolean z11 = false;
        if (size <= 1) {
            ArticleViewer$WindowView articleViewer$WindowView = this.f37218f0;
            articleViewer$WindowView.f21568e = false;
            articleViewer$WindowView.d = false;
            j0 j0Var = this.f37219g0;
            if (v3Var != null) {
                x10 = v3Var.I * v3Var.f41395c.getWidth();
            } else {
                x10 = j0Var.getX();
            }
            AnimatorSet animatorSet = new AnimatorSet();
            float measuredWidth = j0Var.getMeasuredWidth() - x10;
            if (v3Var != null) {
                animatorSet.playTogether(v3Var.d(1.0f));
            } else {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.f37219g0, View.TRANSLATION_X, j0Var.getMeasuredWidth()), ObjectAnimator.ofFloat(this.f37218f0, f37190d1, j0Var.getMeasuredWidth()));
            }
            animatorSet.setDuration(Math.max((int) ((420.0f / j0Var.getMeasuredWidth()) * measuredWidth), 250));
            animatorSet.setInterpolator(org.telegram.ui.Components.pr.h);
            animatorSet.addListener(new x0(this));
            animatorSet.start();
            this.T0 = true;
            return;
        }
        this.f37218f0.f21569f = true;
        this.f37232u0[1].setVisibility(0);
        this.f37232u0[1].setAlpha(1.0f);
        this.f37232u0[1].setTranslationX(0.0f);
        m3 m3Var = this.f37232u0[0];
        if (v3Var == null) {
            color = 0;
        } else {
            color = this.f37224l0.getColor();
        }
        m3Var.setBackgroundColor(color);
        e0(-1, arrayList.get(i10), true);
        m3 m3Var2 = this.f37232u0[0];
        m3Var2.getX();
        AnimatorSet animatorSet2 = new AnimatorSet();
        m3Var2.getMeasuredWidth();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f37232u0[0], View.TRANSLATION_X, m3Var2.getMeasuredWidth()));
        animatorSet2.setDuration(420L);
        animatorSet2.setInterpolator(org.telegram.ui.Components.pr.h);
        animatorSet2.addListener(new y0(this, i10));
        animatorSet2.start();
        k0 k0Var = this.f37220h0;
        m3 m3Var3 = this.f37232u0[0];
        if (m3Var3 != null && SharedConfig.adaptableColorInBrowser) {
            w02 = m3Var3.getBackgroundColor();
        } else {
            w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false);
        }
        k0Var.setMenuColors(w02);
        k0 k0Var2 = this.f37220h0;
        m3 m3Var4 = this.f37232u0[0];
        if (m3Var4 != null && SharedConfig.adaptableColorInBrowser) {
            w03 = m3Var4.getActionBarColor();
        } else {
            w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false);
        }
        k0Var2.d(w03, true);
        k0 k0Var3 = this.f37220h0;
        m3 m3Var5 = this.f37232u0[0];
        if (m3Var5 != null && m3Var5.e()) {
            z10 = true;
        } else {
            z10 = false;
        }
        k0Var3.setIsTonsite(z10);
        k0 k0Var4 = this.f37220h0;
        m3 m3Var6 = this.f37232u0[0];
        if (m3Var6 != null && m3Var6.d()) {
            z11 = true;
        }
        k0Var4.setIsLocal(z11);
        this.T0 = true;
    }

    public final boolean J() {
        ArrayList arrayList = this.f37216d0;
        if (arrayList.size() <= 0 || !(arrayList.get(0) instanceof TLRPC.WebPage)) {
            return false;
        }
        return true;
    }

    public final void M() {
        this.V = false;
        int i10 = 0;
        while (true) {
            m3[] m3VarArr = this.f37232u0;
            if (i10 < m3VarArr.length) {
                m3VarArr[i10].b();
                i10++;
            } else {
                try {
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
        }
        this.L.getWindow().clearFlags(128);
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.N;
            if (i11 < arrayList.size()) {
                ((t1) arrayList.get(i11)).a(false);
                i11++;
            } else {
                this.f37219g0.post(new a0(this, 0));
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
        v3 v3Var = this.K;
        if (v3Var == null && this.V) {
            return false;
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.M;
        if (n2Var != null && (n2Var.getParentLayout() instanceof ActionBarLayout)) {
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
                    } catch (Exception e7) {
                        FileLog.e(e7);
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
        ArrayList arrayList = this.f37216d0;
        if (v3Var != null && !arrayList.isEmpty()) {
            z11 = z10;
            r52 = 1;
        } else {
            z11 = z10;
            r52 = 0;
        }
        if (r52 == 0) {
            arrayList.clear();
            this.f37219g0.setTranslationX(0.0f);
            if (v3Var != null) {
                v3Var.I = 0.0f;
                v3Var.f41395c.invalidate();
                v3Var.i();
                v3Var.h();
            }
            this.f37219g0.setTranslationY(0.0f);
            this.f37232u0[0].setTranslationY(0.0f);
            this.f37232u0[0].setTranslationX(0.0f);
            this.f37232u0[1].setTranslationX(0.0f);
            this.f37232u0[0].setAlpha(1.0f);
            this.f37218f0.setInnerTranslationX(0.0f);
            this.f37232u0[0].g();
            X(AndroidUtilities.dp(56.0f));
        }
        if (v3Var != null && org.telegram.ui.web.d1.P0) {
            v3Var.f41393a.lock();
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
                ConnectionsManager.getInstance(i13).sendRequest(tL_messages_getWebPage, new of.a(this, i13, webPage2, messageObject, (boolean) r52, str4));
            }
        } else {
            g(r52, str2);
        }
        k0 k0Var = this.f37220h0;
        if (k0Var != null && r52 == 0) {
            k0Var.setIsLocal(this.f37232u0[0].d());
        }
        this.T = null;
        if (v3Var != null) {
            if (r52 == 0) {
                AndroidUtilities.removeFromParent(this.f37218f0);
                v3Var.d = this.f37218f0;
                v3Var.n();
                v3Var.f41395c.addView(this.f37218f0, w7.x5.c(-1.0f, -1));
            }
        } else if (!this.V) {
            WindowManager windowManager = (WindowManager) this.L.getSystemService("window");
            if (this.W) {
                try {
                    windowManager.removeView(this.f37218f0);
                } catch (Exception unused) {
                }
            }
            try {
                WindowManager.LayoutParams layoutParams = this.f37217e0;
                layoutParams.flags = -2013200384;
                if (Build.VERSION.SDK_INT >= 28) {
                    layoutParams.layoutInDisplayCutoutMode = 1;
                }
                this.f37218f0.setFocusable(false);
                this.f37219g0.setFocusable(false);
                windowManager.addView(this.f37218f0, this.f37217e0);
            } catch (Exception e10) {
                FileLog.e(e10);
                return false;
            }
        } else {
            this.f37217e0.flags &= -17;
            ((WindowManager) this.L.getSystemService("window")).updateViewLayout(this.f37218f0, this.f37217e0);
        }
        this.V = true;
        this.Z = 1;
        if (r52 == 0) {
            if (v3Var != null) {
                if (r52 != 0) {
                    v3Var.f41393a.unlock();
                } else if (!v3Var.h) {
                    v3Var.g(v3Var.f41394b);
                    v3Var.f();
                }
            } else {
                this.f37218f0.setAlpha(0.0f);
                this.f37219g0.setAlpha(0.0f);
                AnimatorSet animatorSet = new AnimatorSet();
                ArticleViewer$WindowView articleViewer$WindowView = this.f37218f0;
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(articleViewer$WindowView, property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f37219g0, property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f37218f0, View.TRANSLATION_X, AndroidUtilities.dp(56.0f), 0.0f));
                this.f37212a0 = new a0(this, 1);
                animatorSet.setDuration(150L);
                animatorSet.setInterpolator(this.f37215c0);
                animatorSet.addListener(new r0(this));
                this.f37214b0 = System.currentTimeMillis();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.c6(5, this, animatorSet));
            }
        }
        this.f37219g0.setLayerType(2, null);
        return true;
    }

    public final void P(long j3, TLRPC.User user) {
        if (user != null && (this.L instanceof LaunchActivity)) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f20016id);
            bundle.putString("botUser", "webpage" + j3);
            ((LaunchActivity) this.L).q0(new co(bundle), false, true);
            o(false, true);
        }
    }

    public final void Q(String str, String str2, i0 i0Var) {
        Activity activity = this.L;
        if (activity != null && !activity.isFinishing()) {
            m3 m3Var = this.f37232u0[0];
            if (m3Var != null && m3Var.d()) {
                String string = LocaleController.getString(R.string.OpenUrlAlert2);
                int indexOf = string.indexOf("%");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(String.format(string, str));
                if (indexOf >= 0) {
                    spannableStringBuilder.setSpan(new URLSpan(str), indexOf, str.length() + indexOf, 33);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.L, 0, null);
                String string2 = LocaleController.getString(R.string.OpenUrlTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20198a;
                b2Var.R = string2;
                b2Var.T = spannableStringBuilder;
                b2Var.f20236f0 = false;
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.Open), new a1.d(this, str, str2, i0Var, 3));
                alertDialog$Builder.o();
                return;
            }
            R(str, str2, i0Var);
        }
    }

    public final void R(String str, String str2, of.e eVar) {
        v3 v3Var;
        of.e eVar2 = this.M0;
        if (eVar2 != null) {
            eVar2.a(false);
        }
        this.M0 = eVar;
        if (this.F0 != 0) {
            ConnectionsManager.getInstance(this.X).cancelRequest(this.F0, false);
            this.F0 = 0;
        }
        boolean[] zArr = new boolean[1];
        if (of.f.l(this.L, str, false)) {
            if (this.f37216d0.isEmpty() && (v3Var = this.K) != null) {
                v3Var.dismiss(false);
                return;
            }
            return;
        }
        f0 f0Var = new f0(this, str, zArr, eVar);
        int i10 = this.H0 + 1;
        this.H0 = i10;
        b0(true);
        TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
        tL_messages_getWebPage.url = str;
        tL_messages_getWebPage.hash = 0;
        this.F0 = ConnectionsManager.getInstance(this.X).sendRequest(tL_messages_getWebPage, new org.telegram.messenger.hi(this, i10, eVar, str2, f0Var, tL_messages_getWebPage));
        if (eVar != null) {
            eVar.f17004b = new ah.p(this, i10, eVar, 24);
            eVar.d();
        }
    }

    public final void S() {
        int w02;
        int w03;
        TextView textView = this.B0;
        if (textView != null) {
            textView.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20753i6, false), 2, -1));
            this.B0.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E8, false));
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.A0;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G8, false));
        }
        ImageView imageView = this.f37229r0;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false), PorterDuff.Mode.MULTIPLY));
            this.f37229r0.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f21063z8, false), 1, -1));
        }
        ImageView imageView2 = this.f37230s0;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false), PorterDuff.Mode.MULTIPLY));
            this.f37230s0.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f21063z8, false), 1, -1));
        }
        org.telegram.ui.Components.q6 q6Var = this.f37231t0;
        if (q6Var != null) {
            q6Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        }
        k0 k0Var = this.f37220h0;
        if (k0Var != null) {
            m3 m3Var = this.f37232u0[0];
            if (m3Var != null && SharedConfig.adaptableColorInBrowser) {
                w02 = m3Var.getBackgroundColor();
            } else {
                w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false);
            }
            k0Var.setMenuColors(w02);
            k0 k0Var2 = this.f37220h0;
            m3 m3Var2 = this.f37232u0[0];
            if (m3Var2 != null && SharedConfig.adaptableColorInBrowser) {
                w03 = m3Var2.getActionBarColor();
            } else {
                w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false);
            }
            k0Var2.d(w03, true);
        }
        this.f37224l0.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false));
    }

    public final void U() {
        int L0;
        int i10;
        boolean z10 = false;
        m3 m3Var = this.f37232u0[0];
        if (m3Var.f38552c.E != null && (L0 = m3Var.d.L0()) != -1) {
            View m10 = this.f37232u0[0].d.m(L0);
            if (m10 != null) {
                i10 = m10.getTop();
            } else {
                i10 = 0;
            }
            String str = "article" + this.f37232u0[0].f38552c.E.f20022id;
            SharedPreferences.Editor putInt = ApplicationLoader.applicationContext.getSharedPreferences("articles", 0).edit().putInt(str, L0).putInt(str + "o", i10);
            String t10 = org.telegram.ui.Cells.p6.t(str, "r");
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
            Integer num2 = (Integer) this.f37232u0[0].f38552c.h.get(lowerCase2);
            if (num2 != null) {
                TL_iv.textAnchor textanchor = (TL_iv.textAnchor) this.f37232u0[0].f38552c.f36553r.get(lowerCase2);
                if (textanchor != null) {
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    if (!TextUtils.isEmpty(this.f37232u0[0].f38552c.E.cached_page.url)) {
                        lowerCase = this.f37232u0[0].f38552c.E.cached_page.url.toLowerCase();
                    } else {
                        lowerCase = this.f37232u0[0].f38552c.E.url.toLowerCase();
                    }
                    pageblockparagraph.text = org.telegram.ui.web.j2.d(textanchor.text, lowerCase, lowerCase2);
                    this.f37232u0[0].f38552c.getClass();
                    int I = g4.I(pageblockparagraph);
                    s4.c1 x10 = this.f37232u0[0].f38552c.x(null, I);
                    View view = x10.f45738a;
                    this.f37232u0[0].f38552c.H(I, x10, pageblockparagraph, 0, 0, false);
                    org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) this.L, (org.telegram.ui.ActionBar.f6) null, false);
                    f3Var.fixNavigationBar();
                    f3Var.applyTopPadding = false;
                    f3Var.applyBottomPadding = false;
                    LinearLayout linearLayout = new LinearLayout(this.L);
                    linearLayout.setOrientation(1);
                    org.telegram.ui.Cells.q9 q9Var = new org.telegram.ui.Cells.q9();
                    this.P0 = q9Var;
                    q9Var.T(linearLayout);
                    this.P0.D = new bi.f3(this, 1);
                    bi.c4 c4Var = new bi.c4(this.L, 4);
                    c4Var.setTextSize(1, 16.0f);
                    c4Var.setTypeface(AndroidUtilities.bold());
                    c4Var.setText(LocaleController.getString(R.string.InstantViewReference));
                    if (this.f37232u0[0].f38552c.G) {
                        i10 = 5;
                    } else {
                        i10 = 3;
                    }
                    c4Var.setGravity(i10 | 16);
                    c4Var.setTextColor(b());
                    c4Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                    linearLayout.addView(c4Var, new LinearLayout.LayoutParams(-1, AndroidUtilities.dp(48.0f) + 1));
                    view.setTag("bottomSheet");
                    linearLayout.addView(view, w7.x5.k(0.0f, 7.0f, 0.0f, 0.0f, -1, -2));
                    org.telegram.ui.Cells.ca o9 = this.P0.o(this.L);
                    ah.w wVar = new ah.w(this, this.L, linearLayout, 6);
                    f3Var.setDelegate(new g0(this, 0));
                    wVar.addView(linearLayout, -1, -2);
                    wVar.addView(o9, -1, -2);
                    f3Var.customView = wVar;
                    if (this.O0.y()) {
                        this.O0.f(false);
                    }
                    this.I = f3Var;
                    a0(f3Var);
                    return true;
                } else if (num2.intValue() >= 0 && num2.intValue() < this.f37232u0[0].f38552c.f36550e.size()) {
                    TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) this.f37232u0[0].f38552c.f36550e.get(num2.intValue());
                    TL_iv.PageBlock z11 = z(pageBlock);
                    if ((z11 instanceof w3) && O((w3) z11)) {
                        this.f37232u0[0].f38552c.M();
                        this.f37232u0[0].f38552c.l();
                    }
                    int indexOf = this.f37232u0[0].f38552c.d.indexOf(pageBlock);
                    if (indexOf != -1) {
                        num2 = Integer.valueOf(indexOf);
                    }
                    Integer num3 = (Integer) this.f37232u0[0].f38552c.f36552n.get(lowerCase2);
                    if (num3 != null) {
                        if (num3.intValue() == -1) {
                            this.f37232u0[0].f38552c.getClass();
                            int I2 = g4.I(pageBlock);
                            s4.c1 x11 = this.f37232u0[0].f38552c.x(null, I2);
                            this.f37232u0[0].f38552c.H(I2, x11, pageBlock, 0, 0, false);
                            x11.f45738a.measure(View.MeasureSpec.makeMeasureSpec(this.f37232u0[0].f38551b.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                            Integer num4 = (Integer) this.f37232u0[0].f38552c.f36552n.get(lowerCase2);
                            if (num4.intValue() != -1) {
                                num = num4;
                            }
                        } else {
                            num = num3;
                        }
                    }
                    if (this.f37232u0[0].f38552c.H) {
                        num2 = Integer.valueOf(num2.intValue() + 1);
                    }
                    if (z10) {
                        org.telegram.ui.Components.xv0 xv0Var = new org.telegram.ui.Components.xv0(this.f37232u0[0].getContext());
                        xv0Var.f45906a = num2.intValue();
                        xv0Var.f32750s = (-AndroidUtilities.dp(56.0f)) - num.intValue();
                        this.f37232u0[0].d.w0(xv0Var);
                        return true;
                    }
                    this.f37232u0[0].d.h1(num2.intValue(), (-AndroidUtilities.dp(56.0f)) - num.intValue());
                    return true;
                }
            }
        }
        return false;
    }

    public final void W(int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.i4.W(int):void");
    }

    public final void X(int i10) {
        k0 k0Var = this.f37220h0;
        if (k0Var != null && !k0Var.T && !k0Var.W) {
            int clamp = Utilities.clamp(i10, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(24.0f));
            this.I0 = clamp;
            this.f37220h0.setHeight(clamp);
            this.O0.f21801x = this.I0;
            int i11 = 0;
            while (true) {
                m3[] m3VarArr = this.f37232u0;
                if (i11 < m3VarArr.length) {
                    m3VarArr[i11].f38551b.setTopGlowOffset(this.I0);
                    i11++;
                } else {
                    return;
                }
            }
        }
    }

    public final void Y(Activity activity, org.telegram.ui.ActionBar.n2 n2Var) {
        kb0 kb0Var;
        int i10;
        boolean z10;
        int w02;
        int i11;
        int i12;
        v3 v3Var;
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
        this.M = n2Var;
        if (!(n2Var instanceof hz)) {
            i10 = n2Var.getCurrentAccount();
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
        if (activity2 != activity && (activity2 == null || !this.J || (v3Var = this.K) == null || v3Var.f41396e == null)) {
            this.L = activity;
            this.f41433a = ApplicationLoader.applicationContext.getSharedPreferences("articles", 0).getInt("font_type", 0);
            r(this, false);
            this.f37224l0 = new Paint();
            this.m0 = activity.getResources().getDrawable(R.drawable.layer_shadow);
            this.f37225n0 = new Paint();
            ArticleViewer$WindowView articleViewer$WindowView = new ArticleViewer$WindowView(this, activity);
            this.f37218f0 = articleViewer$WindowView;
            articleViewer$WindowView.setWillNotDraw(false);
            this.f37218f0.setClipChildren(true);
            this.f37218f0.setFocusable(false);
            j0 j0Var = new j0(this, activity, 0);
            this.f37219g0 = j0Var;
            this.f37218f0.addView(j0Var, w7.x5.e(-1, -1, 51));
            if (this.K == null) {
                this.f37218f0.setFitsSystemWindows(true);
                this.f37219g0.setOnApplyWindowInsetsListener(new org.telegram.ui.ActionBar.g3(1));
            }
            FrameLayout frameLayout = new FrameLayout(activity);
            this.P = frameLayout;
            frameLayout.setBackgroundColor(-16777216);
            this.P.setVisibility(4);
            this.f37218f0.addView(this.P, w7.x5.c(-1.0f, -1));
            l4 l4Var = new l4(activity);
            this.R = l4Var;
            l4Var.setVisibility(0);
            this.R.setBackgroundColor(-16777216);
            this.P.addView(this.R, w7.x5.e(-1, -1, 17));
            this.Q = new TextureView(activity);
            this.f37232u0 = new m3[2];
            int i13 = 0;
            while (true) {
                m3[] m3VarArr = this.f37232u0;
                if (i13 >= m3VarArr.length) {
                    break;
                }
                m3 m3Var = new m3(this, activity);
                m3VarArr[i13] = m3Var;
                if (i13 == 0) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                m3Var.setVisibility(i12);
                this.f37219g0.addView(m3Var, w7.x5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
                m3Var.f38551b.setOnItemLongClickListener(new t(this));
                m3Var.f38551b.setOnItemClickListener(new ah.i0(29, this, m3Var));
                i13++;
            }
            this.f37219g0.addView(new FrameLayout(activity), w7.x5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f37234w0.setColor(-16777216);
            this.f37235x0.setColor(-16777216);
            this.f37237z0.setColor(-14408666);
            this.f37236y0.setColor(-16777216);
            k0 k0Var = new k0(this, activity);
            this.f37220h0 = k0Var;
            if (this.K != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            k0Var.f42282e0 = z10;
            this.f37219g0.addView(k0Var, w7.x5.e(-1, -2, 48));
            this.f37220h0.setOnClickListener(new bi.u1(22, this, activity));
            this.f37220h0.f42277b0.addTextChangedListener(new l0(this, 0));
            org.telegram.ui.web.l lVar = new org.telegram.ui.web.l(activity);
            this.f37221i0 = lVar;
            lVar.setOpenProgress(0.0f);
            this.f37221i0.f42166w.j(new i3(this, 2));
            this.f37219g0.addView(this.f37221i0, w7.x5.c(-1.0f, -1));
            this.f37222j0 = new a0(this, 3);
            this.f37220h0.L.setOnClickListener(new s(this, 2));
            this.f37220h0.L.setOnLongClickListener(new u(this, 0));
            this.f37220h0.setMenuListener(new di.m2(26, this, activity));
            this.f37220h0.O.setOnClickListener(new s(this, 3));
            bi.g5 g5Var = new bi.g5(this.L, 6);
            this.f37228q0 = g5Var;
            g5Var.setOnTouchListener(new ci.d(3));
            this.f37228q0.setWillNotDraw(false);
            this.f37228q0.setTranslationY(AndroidUtilities.dp(51.0f));
            this.f37228q0.setVisibility(4);
            this.f37228q0.setFocusable(true);
            this.f37228q0.setFocusableInTouchMode(true);
            this.f37228q0.setClickable(true);
            this.f37228q0.setPadding(0, AndroidUtilities.dp(3.0f), 0, 0);
            this.f37219g0.addView(this.f37228q0, w7.x5.e(-1, 51, 80));
            new di.j4(this.f37218f0, false, new r(this, 0));
            ImageView imageView = new ImageView(this.L);
            this.f37229r0 = imageView;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            this.f37229r0.setImageResource(R.drawable.msg_go_up);
            ImageView imageView2 = this.f37229r0;
            int i14 = org.telegram.ui.ActionBar.j6.G6;
            int w03 = org.telegram.ui.ActionBar.j6.w0(null, i14, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            imageView2.setColorFilter(new PorterDuffColorFilter(w03, mode));
            ImageView imageView3 = this.f37229r0;
            int i15 = org.telegram.ui.ActionBar.j6.f21063z8;
            imageView3.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i15, false), 1, -1));
            this.f37228q0.addView(this.f37229r0, w7.x5.d(48, 48.0f, 53, 0.0f, 0.0f, 48.0f, 0.0f));
            this.f37229r0.setOnClickListener(new s(this, 0));
            this.f37229r0.setContentDescription(LocaleController.getString(R.string.AccDescrSearchNext));
            ImageView imageView4 = new ImageView(this.L);
            this.f37230s0 = imageView4;
            imageView4.setScaleType(scaleType);
            this.f37230s0.setImageResource(R.drawable.msg_go_down);
            this.f37230s0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i14, false), mode));
            this.f37230s0.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i15, false), 1, -1));
            this.f37228q0.addView(this.f37230s0, w7.x5.d(48, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f37230s0.setOnClickListener(new s(this, 1));
            this.f37230s0.setContentDescription(LocaleController.getString(R.string.AccDescrSearchPrev));
            org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(this.L, true, true, true);
            this.f37231t0 = q6Var;
            q6Var.setScaleProperty(0.6f);
            this.f37231t0.b(0.4f, 350L, org.telegram.ui.Components.pr.h);
            this.f37231t0.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
            this.f37231t0.setTextSize(AndroidUtilities.dp(15.0f));
            this.f37231t0.setTypeface(AndroidUtilities.bold());
            this.f37231t0.setGravity(3);
            this.f37231t0.getDrawable().G = AndroidUtilities.displaySize.x;
            this.f37228q0.addView(this.f37231t0, w7.x5.d(-2, -2.0f, 19, 18.0f, 0.0f, 108.0f, 0.0f));
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.f37217e0 = layoutParams;
            layoutParams.height = -1;
            layoutParams.format = -3;
            layoutParams.width = -1;
            layoutParams.gravity = 51;
            layoutParams.type = 98;
            layoutParams.softInputMode = 48;
            layoutParams.flags = 131072;
            if (this.K == null) {
                w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20607a7, true);
            } else {
                w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20607a7, false);
            }
            if (AndroidUtilities.computePerceivedBrightness(w02) >= 0.721f && Build.VERSION.SDK_INT >= 26) {
                i11 = 1808;
            } else {
                i11 = 1792;
            }
            this.f37236y0.setColor(w02);
            WindowManager.LayoutParams layoutParams2 = this.f37217e0;
            layoutParams2.systemUiVisibility = i11;
            layoutParams2.flags |= -2147417856;
            if (Build.VERSION.SDK_INT >= 28) {
                layoutParams2.layoutInDisplayCutoutMode = 1;
            }
            org.telegram.ui.Cells.q9 q9Var = new org.telegram.ui.Cells.q9();
            this.O0 = q9Var;
            q9Var.T(this.f37232u0[0].f38551b);
            if (MessagesController.getInstance(this.X).getTranslateController().isContextTranslateEnabled()) {
                this.O0.f21783l0 = new t(this);
            }
            org.telegram.ui.Cells.q9 q9Var2 = this.O0;
            q9Var2.E0 = this.f37232u0[0].d;
            q9Var2.D = new o0(this);
            this.f37219g0.addView(q9Var2.o(activity));
            j0 j0Var2 = this.f37219g0;
            ov0 ov0Var = new ov0(j0Var2, j0Var2);
            this.Q0 = ov0Var;
            ov0Var.F = new t(this);
            ov0Var.E = new g(this, 1);
            this.f37224l0.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false));
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
        org.telegram.ui.ActionBar.f3 f3Var = this.I;
        if (f3Var != null) {
            f3Var.dismiss();
            this.I = null;
        }
        org.telegram.ui.ActionBar.f3 f3Var2 = new org.telegram.ui.ActionBar.f3(1, (Context) this.L, (org.telegram.ui.ActionBar.f6) null, false);
        f3Var2.fixNavigationBar();
        try {
            str2 = URLDecoder.decode(str.replaceAll("\\+", "%2b"), "UTF-8");
        } catch (Exception e7) {
            FileLog.e(e7);
            str2 = str;
        }
        f3Var2.title = str2;
        f3Var2.bigTitle = false;
        f3Var2.multipleLinesTitle = true;
        CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
        mg.j jVar = new mg.j(1, this, str);
        f3Var2.items = charSequenceArr;
        f3Var2.onClickListener = jVar;
        f3Var2.setOnHideListener(new v(this, 0));
        a0(f3Var2);
    }

    @Override
    public final int a() {
        return org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f21042y6, false);
    }

    public final void a0(org.telegram.ui.ActionBar.f3 f3Var) {
        if (this.L != null) {
            try {
                org.telegram.ui.ActionBar.f3 f3Var2 = this.f37223k0;
                if (f3Var2 != null) {
                    f3Var2.dismiss();
                    this.f37223k0 = null;
                }
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            try {
                this.f37223k0 = f3Var;
                f3Var.setCanceledOnTouchOutside(true);
                this.f37223k0.setOnDismissListener(new v(this, 1));
                f3Var.show();
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
    }

    @Override
    public final int b() {
        return org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false);
    }

    public final void b0(boolean z10) {
        AndroidUtilities.cancelRunOnUIThread(this.f37222j0);
        if (z10) {
            this.f37220h0.f42280d0.a(0.0f, false);
            this.f37220h0.f42280d0.a(0.3f, true);
            AndroidUtilities.runOnUIThread(this.f37222j0, 100L);
            return;
        }
        this.f37220h0.f42280d0.a(1.0f, true);
    }

    @Override
    public final void c(g4 g4Var, org.telegram.ui.Components.j01 j01Var) {
        String str;
        String str2;
        org.telegram.ui.Components.e90 e90Var;
        String lowerCase;
        if (j01Var != null && (str = j01Var.f27296b) != null) {
            org.telegram.ui.ActionBar.f3 f3Var = this.I;
            i0 i0Var = null;
            if (f3Var != null) {
                f3Var.dismiss();
                this.I = null;
            }
            int lastIndexOf = str.lastIndexOf(35);
            boolean z10 = false;
            if (lastIndexOf != -1) {
                if (!TextUtils.isEmpty(g4Var.E.cached_page.url)) {
                    lowerCase = g4Var.E.cached_page.url.toLowerCase();
                } else {
                    lowerCase = g4Var.E.url.toLowerCase();
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
                b3 b3Var = this.d;
                if (b3Var != null && (e90Var = this.f41434b) != null) {
                    i0Var = new i0(this, b3Var, e90Var);
                }
                Q(str, str2, i0Var);
            }
        }
    }

    public final void c0() {
        LaunchActivity launchActivity;
        FrameLayout frameLayout;
        if (this.W && (launchActivity = LaunchActivity.G1) != null && !launchActivity.isFinishing()) {
            if (this.f37232u0[0].f()) {
                if (this.f37232u0[0].getWebView() != null) {
                    frameLayout = this.f37232u0[0].f38554f;
                } else {
                    return;
                }
            } else {
                m3 m3Var = this.f37232u0[0];
                TLRPC.WebPage webPage = m3Var.f38552c.E;
                frameLayout = m3Var;
                if (webPage == null) {
                    return;
                }
            }
            new org.telegram.ui.Components.yc(frameLayout, null).G(R.raw.chats_infotip, 4, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BrowserExternalRestricted), new a0(this, 10))).k(true);
        }
    }

    @Override
    public final boolean d(TL_iv.PageBlock pageBlock, g4 g4Var) {
        int indexOf;
        List list;
        org.telegram.ui.ActionBar.n2 n2Var = this.M;
        if (n2Var != null && n2Var.getParentActivity() != null) {
            if ((pageBlock instanceof TL_iv.pageBlockVideo) && !f4.g(g4Var.E, pageBlock)) {
                list = Collections.singletonList(pageBlock);
                indexOf = 0;
            } else {
                ArrayList arrayList = new ArrayList(g4Var.f36551f);
                indexOf = g4Var.f36551f.indexOf(pageBlock);
                list = arrayList;
            }
            PhotoViewer t12 = PhotoViewer.t1();
            t12.K2(null, this.M, null);
            if (t12.e2(null, null, null, null, null, null, null, indexOf, new f3(this, list), null, 0L, 0L, 0L, true, new o3(this, g4Var.E, list), null)) {
                n();
                return true;
            }
        }
        return false;
    }

    public final void d0(boolean z10) {
        float f7;
        this.f37228q0.setVisibility(0);
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
        ofFloat.addUpdateListener(new q(this, 1));
        this.X0.addListener(new ah.q0(20, this, z10));
        this.X0.setDuration(320L);
        this.X0.setInterpolator(org.telegram.ui.Components.pr.h);
        this.X0.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        a1 a1Var;
        MessageObject messageObject;
        if (i10 == NotificationCenter.messagePlayingDidStart) {
            MessageObject messageObject2 = (MessageObject) objArr[0];
            if (this.f37232u0 != null) {
                int i12 = 0;
                while (true) {
                    m3[] m3VarArr = this.f37232u0;
                    if (i12 < m3VarArr.length) {
                        int childCount = m3VarArr[i12].f38551b.getChildCount();
                        for (int i13 = 0; i13 < childCount; i13++) {
                            View childAt = this.f37232u0[i12].f38551b.getChildAt(i13);
                            if (childAt instanceof a1) {
                                ((a1) childAt).a(true);
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
                if (this.f37232u0 != null) {
                    int i14 = 0;
                    while (true) {
                        m3[] m3VarArr2 = this.f37232u0;
                        if (i14 < m3VarArr2.length) {
                            int childCount2 = m3VarArr2[i14].f38551b.getChildCount();
                            int i15 = 0;
                            while (true) {
                                if (i15 < childCount2) {
                                    View childAt2 = this.f37232u0[i14].f38551b.getChildAt(i15);
                                    if ((childAt2 instanceof a1) && (messageObject = (a1Var = (a1) childAt2).getMessageObject()) != null && messageObject.getId() == num.intValue()) {
                                        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                                        if (playingMessageObject != null) {
                                            messageObject.audioProgress = playingMessageObject.audioProgress;
                                            messageObject.audioProgressSec = playingMessageObject.audioProgressSec;
                                            messageObject.audioPlayerDuration = playingMessageObject.audioPlayerDuration;
                                            a1Var.b();
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
            } else if (i10 == NotificationCenter.emojiLoaded && this.f37232u0 != null) {
                int i16 = 0;
                while (true) {
                    m3[] m3VarArr3 = this.f37232u0;
                    if (i16 < m3VarArr3.length) {
                        int childCount3 = m3VarArr3[i16].f38551b.getChildCount();
                        for (int i17 = 0; i17 < childCount3; i17++) {
                            View childAt3 = this.f37232u0[i16].f38551b.getChildAt(i17);
                            if (childAt3 instanceof u2) {
                                ((u2) childAt3).f40898e.invalidate();
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
        } else if (this.f37232u0 != null) {
            int i18 = 0;
            while (true) {
                m3[] m3VarArr4 = this.f37232u0;
                if (i18 < m3VarArr4.length) {
                    int childCount4 = m3VarArr4[i18].f38551b.getChildCount();
                    for (int i19 = 0; i19 < childCount4; i19++) {
                        View childAt4 = this.f37232u0[i18].f38551b.getChildAt(i19);
                        if (childAt4 instanceof a1) {
                            a1 a1Var2 = (a1) childAt4;
                            if (a1Var2.getMessageObject() != null) {
                                a1Var2.a(true);
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
            if (((obj instanceof TLRPC.WebPage) && ((TLRPC.WebPage) obj).cached_page != null) || (obj instanceof z2)) {
                int i14 = 1;
                if (!z10 && i10 != 0) {
                    m3[] m3VarArr = this.f37232u0;
                    m3 m3Var = m3VarArr[1];
                    m3VarArr[1] = m3VarArr[0];
                    m3VarArr[0] = m3Var;
                    this.f37220h0.i();
                    this.Z0.a(this.f37232u0[0].getBackgroundColor(), true);
                    this.f37213a1.a(this.f37232u0[1].getBackgroundColor(), true);
                    v3 v3Var = this.K;
                    if (v3Var != null) {
                        v3Var.m();
                    }
                    int indexOfChild = this.f37219g0.indexOfChild(this.f37232u0[0]);
                    int indexOfChild2 = this.f37219g0.indexOfChild(this.f37232u0[1]);
                    if (i10 == 1) {
                        if (indexOfChild < indexOfChild2) {
                            this.f37219g0.removeView(this.f37232u0[0]);
                            this.f37219g0.addView(this.f37232u0[0], indexOfChild2);
                        }
                    } else if (indexOfChild2 < indexOfChild) {
                        this.f37219g0.removeView(this.f37232u0[0]);
                        this.f37219g0.addView(this.f37232u0[0], indexOfChild);
                    }
                    this.f37233v0 = new AnimatorSet();
                    this.f37232u0[0].setVisibility(0);
                    if (i10 == 1) {
                        i13 = 0;
                    } else {
                        i13 = 1;
                    }
                    m3 m3Var2 = this.f37232u0[i13];
                    if (this.K == null) {
                        color = 0;
                    } else {
                        color = this.f37224l0.getColor();
                    }
                    m3Var2.setBackgroundColor(color);
                    this.f37232u0[i13].setLayerType(2, null);
                    if (i10 == 1) {
                        this.f37232u0[0].setTranslationX(AndroidUtilities.displaySize.x);
                        this.f37233v0.playTogether(ObjectAnimator.ofFloat(this.f37232u0[0], View.TRANSLATION_X, AndroidUtilities.displaySize.x, 0.0f));
                    } else if (i10 == -1) {
                        this.f37232u0[0].setTranslationX(0.0f);
                        this.f37233v0.playTogether(ObjectAnimator.ofFloat(this.f37232u0[1], View.TRANSLATION_X, 0.0f, AndroidUtilities.displaySize.x));
                    }
                    this.f37233v0.setDuration(320L);
                    this.f37233v0.setInterpolator(org.telegram.ui.Components.pr.h);
                    this.f37233v0.addListener(new u0(this, i13, 0));
                    this.f37218f0.f21569f = true;
                    k0 k0Var = this.f37220h0;
                    m3 m3Var3 = this.f37232u0[0];
                    if (m3Var3 != null && SharedConfig.adaptableColorInBrowser) {
                        w02 = m3Var3.getBackgroundColor();
                    } else {
                        w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false);
                    }
                    k0Var.setMenuColors(w02);
                    k0 k0Var2 = this.f37220h0;
                    m3 m3Var4 = this.f37232u0[0];
                    if (m3Var4 != null && SharedConfig.adaptableColorInBrowser) {
                        w03 = m3Var4.getActionBarColor();
                    } else {
                        w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false);
                    }
                    k0Var2.d(w03, true);
                    k0 k0Var3 = this.f37220h0;
                    m3 m3Var5 = this.f37232u0[0];
                    if (m3Var5 != null && m3Var5.e()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    k0Var3.setIsTonsite(z11);
                    k0 k0Var4 = this.f37220h0;
                    m3 m3Var6 = this.f37232u0[0];
                    if (m3Var6 != null && m3Var6.d()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    k0Var4.setIsLocal(z12);
                    AnimatorSet animatorSet = this.f37233v0;
                    Objects.requireNonNull(animatorSet);
                    AndroidUtilities.runOnUIThread(new lu0(animatorSet, 4));
                }
                if (!z10) {
                    this.O0.f(true);
                }
                g4 g4Var = this.f37232u0[z10 ? 1 : 0].f38552c;
                if (z10) {
                    obj = i2.g.h(2, this.f37216d0);
                }
                this.f37232u0[z10 ? 1 : 0].b();
                if (obj instanceof TLRPC.WebPage) {
                    TLRPC.WebPage webPage = (TLRPC.WebPage) obj;
                    this.f37232u0[z10 ? 1 : 0].setWeb(null);
                    this.f37232u0[z10 ? 1 : 0].setType(0);
                    TL_iv.Page page = webPage.cached_page;
                    g4Var.G = page.rtl;
                    g4Var.E = webPage;
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
                                        g4Var.F = (TL_iv.pageBlockChannel) pageBlock2;
                                    }
                                }
                            }
                        } else if (i15 == 1 && g4Var.F != null) {
                        }
                        if (i15 == size - 1) {
                            i12 = i15;
                        } else {
                            i12 = 0;
                        }
                        g4Var.F(g4Var, pageBlock, 0, 0, i12);
                    }
                    g4Var.l();
                    if (this.f37216d0.size() != 1 && i10 != -1) {
                        s4.c0 c0Var = this.f37232u0[z10 ? 1 : 0].d;
                        v3 v3Var2 = this.K;
                        if (v3Var2 == null) {
                            i14 = 0;
                        }
                        if (v3Var2 != null) {
                            i11 = AndroidUtilities.dp(32.0f);
                        } else {
                            i11 = 0;
                        }
                        c0Var.h1(i14, i11);
                    } else {
                        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("articles", 0);
                        String str = "article" + webPage.f20022id;
                        int i16 = sharedPreferences.getInt(str, -1);
                        boolean z13 = sharedPreferences.getBoolean(str + "r", true);
                        Point point = AndroidUtilities.displaySize;
                        if (point.x <= point.y) {
                            i14 = 0;
                        }
                        if (z13 == i14) {
                            dp = sharedPreferences.getInt(str + "o", 0) - this.f37232u0[z10 ? 1 : 0].f38551b.getPaddingTop();
                        } else {
                            dp = AndroidUtilities.dp(10.0f);
                        }
                        if (i16 != -1) {
                            this.f37232u0[z10 ? 1 : 0].d.h1(i16, dp);
                        }
                    }
                } else if (obj instanceof z2) {
                    this.f37232u0[z10 ? 1 : 0].setType(1);
                    this.f37232u0[z10 ? 1 : 0].g();
                    this.f37232u0[z10 ? 1 : 0].setWeb((z2) obj);
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
        m3[] m3VarArr;
        m3 m3Var;
        float translationX;
        boolean z10;
        boolean z11;
        m3 m3Var2;
        float f7;
        boolean z12;
        boolean z13;
        if (this.f37220h0 != null && (m3Var = (m3VarArr = this.f37232u0)[0]) != null && m3VarArr[1] != null) {
            int visibility = m3Var.getVisibility();
            float f10 = 0.0f;
            if (visibility != 0) {
                translationX = 0.0f;
            } else {
                translationX = 1.0f - (this.f37232u0[0].getTranslationX() / this.f37232u0[0].getWidth());
            }
            float f11 = 1.0f - translationX;
            k0 k0Var = this.f37220h0;
            k0Var.d[0] = this.f37232u0[0].getProgress();
            k0Var.invalidate();
            k0 k0Var2 = this.f37220h0;
            k0Var2.d[1] = this.f37232u0[1].getProgress();
            k0Var2.invalidate();
            this.f37220h0.setTransitionProgress(f11);
            k0 k0Var3 = this.f37220h0;
            if (!k0Var3.W && !k0Var3.T) {
                ArticleViewer$WindowView articleViewer$WindowView = this.f37218f0;
                if (articleViewer$WindowView.f21568e || articleViewer$WindowView.f21569f) {
                    boolean J = J();
                    ArrayList arrayList = this.f37216d0;
                    if (!J && arrayList.size() <= 1) {
                        this.f37220h0.P.f();
                        this.f37220h0.setBackButtonCached(false);
                    } else {
                        if (!this.f37232u0[0].f38557s && arrayList.size() <= 1) {
                            f7 = 0.0f;
                        } else {
                            f7 = 1.0f;
                        }
                        float lerp = AndroidUtilities.lerp(f7, (this.f37232u0[1].f38557s || arrayList.size() > 2) ? 1.0f : 1.0f, f11);
                        this.f37220h0.M.c(1.0f - lerp, false);
                        this.f37220h0.P.f();
                        k0 k0Var4 = this.f37220h0;
                        if (lerp > 0.5f) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        k0Var4.setBackButtonCached(z12);
                    }
                    this.f37220h0.setHasForward(this.f37232u0[0].v);
                    this.f37220h0.setIsLocal(this.f37232u0[0].d());
                    k0 k0Var5 = this.f37220h0;
                    if (this.f37232u0[0].getWebView() != null && this.f37232u0[0].getWebView().f42328b) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    k0Var5.setIsLoaded(z13);
                }
            }
            k0 k0Var6 = this.f37220h0;
            int actionBarColor = this.f37232u0[0].getActionBarColor();
            ArticleViewer$WindowView articleViewer$WindowView2 = this.f37218f0;
            if (!articleViewer$WindowView2.f21568e && !articleViewer$WindowView2.f21569f) {
                z10 = false;
            } else {
                z10 = true;
            }
            k0Var6.b(0, this.Z0.a(actionBarColor, z10));
            k0 k0Var7 = this.f37220h0;
            int actionBarColor2 = this.f37232u0[1].getActionBarColor();
            ArticleViewer$WindowView articleViewer$WindowView3 = this.f37218f0;
            if (!articleViewer$WindowView3.f21568e && !articleViewer$WindowView3.f21569f) {
                z11 = false;
            } else {
                z11 = true;
            }
            k0Var7.b(1, this.f37213a1.a(actionBarColor2, z11));
            this.f37220h0.d(i0.a.d(f11, this.f37232u0[0].getActionBarColor(), this.f37232u0[1].getActionBarColor()), false);
            k0 k0Var8 = this.f37220h0;
            if (translationX > 0.5f) {
                m3Var2 = this.f37232u0[0];
            } else {
                m3Var2 = this.f37232u0[1];
            }
            k0Var8.setMenuType(m3Var2.f38550a);
            v3 v3Var = this.K;
            if (v3Var != null) {
                v3Var.f41395c.invalidate();
                return;
            }
            ArticleViewer$WindowView articleViewer$WindowView4 = this.f37218f0;
            if (articleViewer$WindowView4 != null) {
                articleViewer$WindowView4.invalidate();
            }
        }
    }

    public final void g(int i10, String str) {
        U();
        org.telegram.ui.ActionBar.n3 n3Var = new org.telegram.ui.ActionBar.n3();
        n3Var.f21236x = str;
        this.f37216d0.add(n3Var);
        this.f37220h0.h(false);
        e0(i10, n3Var, false);
    }

    public final boolean h(TLRPC.WebPage webPage, String str, int i10) {
        U();
        this.f37216d0.add(webPage);
        this.f37220h0.h(false);
        e0(i10, webPage, false);
        return V(str, false);
    }

    public final void h0() {
        int i10;
        int size;
        boolean z10;
        boolean z11;
        float f7;
        if (this.E == null && !this.f37232u0[0].f()) {
            return;
        }
        if (this.f37232u0[0].f()) {
            if (this.f37232u0[0].getWebView() == null) {
                i10 = 0;
            } else {
                i10 = this.f37232u0[0].getWebView().getSearchIndex();
            }
            if (this.f37232u0[0].getWebView() == null) {
                size = 0;
            } else {
                size = this.f37232u0[0].getWebView().getSearchCount();
            }
        } else {
            i10 = this.G;
            size = this.E.size();
        }
        ImageView imageView = this.f37229r0;
        if (size > 0 && i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        imageView.setEnabled(z10);
        ImageView imageView2 = this.f37230s0;
        if (size > 0 && i10 != size - 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        imageView2.setEnabled(z11);
        ImageView imageView3 = this.f37229r0;
        float f10 = 0.5f;
        if (imageView3.isEnabled()) {
            f7 = 1.0f;
        } else {
            f7 = 0.5f;
        }
        imageView3.setAlpha(f7);
        ImageView imageView4 = this.f37230s0;
        if (imageView4.isEnabled()) {
            f10 = 1.0f;
        }
        imageView4.setAlpha(f10);
        this.f37231t0.a();
        if (size < 0) {
            this.f37231t0.setText("");
        } else if (size == 0) {
            this.f37231t0.setText(LocaleController.getString(R.string.NoResult));
        } else if (size == 1) {
            this.f37231t0.setText(LocaleController.getString(R.string.OneResult));
        } else {
            this.f37231t0.setText(String.format(LocaleController.getPluralString("CountOfResults", size), Integer.valueOf(i10 + 1), Integer.valueOf(size)));
        }
    }

    public final void i0(boolean z10) {
        boolean z11;
        boolean z12 = false;
        this.f37220h0.g(0, this.f37232u0[0].getTitle(), z10);
        this.f37220h0.f(0, this.f37232u0[0].getSubtitle());
        k0 k0Var = this.f37220h0;
        if (this.f37232u0[0].f() && this.f37232u0[0].getWebView() != null && this.f37232u0[0].getWebView().E) {
            z11 = true;
        } else {
            z11 = false;
        }
        k0Var.e(0, z11);
        this.f37220h0.g(1, this.f37232u0[1].getTitle(), z10);
        this.f37220h0.f(1, this.f37232u0[1].getSubtitle());
        k0 k0Var2 = this.f37220h0;
        if (this.f37232u0[1].f() && this.f37232u0[1].getWebView() != null && this.f37232u0[1].getWebView().E) {
            z12 = true;
        }
        k0Var2.e(1, z12);
    }

    public final void k() {
        this.J0 = false;
        a3 a3Var = this.K0;
        if (a3Var != null) {
            this.f37218f0.removeCallbacks(a3Var);
            this.K0 = null;
        }
        a3 a3Var2 = this.L0;
        if (a3Var2 != null) {
            this.f37218f0.removeCallbacks(a3Var2);
            this.L0 = null;
        }
    }

    public final void m(org.telegram.messenger.z5 z5Var) {
        if (this.I0 == AndroidUtilities.dp(56.0f)) {
            if (z5Var != null) {
                z5Var.run();
                return;
            }
            return;
        }
        ValueAnimator duration = ValueAnimator.ofObject(new IntEvaluator(), Integer.valueOf(this.I0), Integer.valueOf(AndroidUtilities.dp(56.0f))).setDuration(180L);
        duration.setInterpolator(new DecelerateInterpolator());
        duration.addUpdateListener(new q(this, 0));
        duration.addListener(new q0(0, z5Var));
        if (z5Var != null) {
            duration.setDuration(duration.getDuration() / 2);
        }
        duration.start();
    }

    public final void n() {
        long j3;
        x2 x2Var;
        di.v vVar = this.f37232u0[0].f38551b;
        if (vVar != null && this.W) {
            float measuredHeight = vVar.getMeasuredHeight() / 2.0f;
            Uri uri = null;
            float f7 = 0.0f;
            x2 x2Var2 = null;
            for (int i10 = 0; i10 < vVar.getChildCount(); i10++) {
                View childAt = vVar.getChildAt(i10);
                if (childAt instanceof x2) {
                    float measuredHeight2 = (childAt.getMeasuredHeight() / 2.0f) + childAt.getTop();
                    if (x2Var2 == null || Math.abs(measuredHeight - measuredHeight2) < Math.abs(measuredHeight - f7)) {
                        x2Var2 = (x2) childAt;
                        f7 = measuredHeight2;
                    }
                }
            }
            boolean z10 = PhotoViewer.t1().f33557f;
            if (z10 || ((x2Var = this.f41442x) != null && x2Var != x2Var2 && this.f41441w != null)) {
                VideoPlayerHolderBase videoPlayerHolderBase = this.f41441w;
                if (videoPlayerHolderBase != null) {
                    x2 x2Var3 = this.f41442x;
                    long j10 = x2Var3.L.video_id;
                    y2 a2 = y2.a(videoPlayerHolderBase, x2Var3);
                    x2Var3.c(a2);
                    this.f41443y.k(a2, j10);
                    x2 x2Var4 = this.f41442x;
                    y2 y2Var = x2Var4.M;
                    if (y2Var != null) {
                        Bitmap bitmap = y2Var.f42963b;
                        if (bitmap != null) {
                            x2Var4.f42566e.setImageBitmap(bitmap);
                        }
                        this.f41442x.e(false);
                    }
                    this.f41441w.release(null);
                }
                this.f41441w = null;
                this.f41442x = null;
            }
            if (!z10 && x2Var2 != null) {
                v70 v70Var = x2Var2.f42563a;
                if (x2Var2.O != null && v70Var.f41441w == null) {
                    v70Var.f41441w = new w2(x2Var2).with(x2Var2.f42568n);
                    TLRPC.Document document = x2Var2.O;
                    for (int i11 = 0; i11 < document.attributes.size(); i11++) {
                        if (document.attributes.get(i11) instanceof TLRPC.TL_documentAttributeVideo) {
                            TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) document.attributes.get(i11);
                            x2Var2.h.a(tL_documentAttributeVideo.f19876w / tL_documentAttributeVideo.h, 0);
                        }
                    }
                    TLRPC.WebPage webPage = x2Var2.f42564b.E;
                    if (webPage != null) {
                        uri = FileStreamLoadOperation.prepareUri(((i4) v70Var).X, document, webPage);
                    }
                    if (uri != null) {
                        VideoPlayerHolderBase videoPlayerHolderBase2 = v70Var.f41441w;
                        y2 y2Var2 = x2Var2.M;
                        if (y2Var2 == null) {
                            j3 = 0;
                        } else {
                            j3 = y2Var2.f42962a;
                        }
                        videoPlayerHolderBase2.seekTo(j3);
                        v70Var.f41441w.preparePlayer(uri, true, 1.0f);
                        v70Var.f41441w.play();
                    }
                }
                this.f41442x = x2Var2;
            }
        }
    }

    public final void o(boolean z10, boolean z11) {
        if (this.L != null && !this.T0 && this.V) {
            int i10 = 0;
            if (this.Z != 0 && Math.abs(this.f37214b0 - System.currentTimeMillis()) >= 500) {
                Runnable runnable = this.f37212a0;
                if (runnable != null) {
                    runnable.run();
                    this.f37212a0 = null;
                }
                this.Z = 0;
            }
            if (this.Z == 0) {
                v3 v3Var = this.K;
                if (v3Var != null) {
                    v3Var.dismiss(false);
                    return;
                }
                if (this.P.getVisibility() == 0) {
                    if (this.O != null) {
                        this.P.setVisibility(4);
                        this.S.onCustomViewHidden();
                        this.P.removeView(this.O);
                        this.O = null;
                    } else {
                        org.telegram.ui.Components.b91 b91Var = this.E0;
                        if (b91Var != null && b91Var.T) {
                            b91Var.T = false;
                            b91Var.m();
                            b91Var.l(false);
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
                k0 k0Var = this.f37220h0;
                if (k0Var.T) {
                    k0Var.h(false);
                } else if (k0Var.W) {
                    k0Var.k(false);
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
                        ArrayList arrayList = this.f37216d0;
                        if (arrayList.size() >= 2) {
                            Object z12 = i2.g.z(1, arrayList);
                            if (z12 instanceof z2) {
                                ((z2) z12).a();
                            }
                            if (z12 instanceof TLRPC.WebPage) {
                                org.telegram.ui.web.j2.o((TLRPC.WebPage) z12);
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
                        org.telegram.ui.ActionBar.f3 f3Var = this.f37223k0;
                        if (f3Var != null) {
                            f3Var.dismiss();
                            this.f37223k0 = null;
                        }
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    ArticleViewer$WindowView articleViewer$WindowView = this.f37218f0;
                    Property property = View.ALPHA;
                    animatorSet.playTogether(ObjectAnimator.ofFloat(articleViewer$WindowView, property, 0.0f), ObjectAnimator.ofFloat(this.f37219g0, property, 0.0f), ObjectAnimator.ofFloat(this.f37218f0, View.TRANSLATION_X, 0.0f, AndroidUtilities.dp(56.0f)));
                    this.Z = 2;
                    this.f37212a0 = new a0(this, 7);
                    animatorSet.setDuration(150L);
                    animatorSet.setInterpolator(this.f37215c0);
                    animatorSet.addListener(new s0(this, 0));
                    this.f37214b0 = System.currentTimeMillis();
                    this.f37219g0.setLayerType(2, null);
                    animatorSet.start();
                    while (true) {
                        a0.i iVar = this.f41443y;
                        if (i10 < iVar.m()) {
                            y2 y2Var = (y2) iVar.n(i10);
                            Bitmap bitmap = y2Var.f42963b;
                            if (bitmap != null) {
                                bitmap.recycle();
                                y2Var.f42963b = null;
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
            ArrayList arrayList = this.f37216d0;
            if (i10 < arrayList.size()) {
                Object obj = arrayList.get(i10);
                if (obj instanceof z2) {
                    m3 m3Var = this.f37232u0[0];
                    if (m3Var != null && m3Var.J == obj) {
                        ((z2) obj).c(m3Var);
                    }
                    m3 m3Var2 = this.f37232u0[1];
                    if (m3Var2 != null && m3Var2.J == obj) {
                        ((z2) obj).c(m3Var2);
                    }
                    ((z2) obj).a();
                } else if (obj instanceof TLRPC.WebPage) {
                    org.telegram.ui.web.j2.o((TLRPC.WebPage) obj);
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
        if (this.L != null && (articleViewer$WindowView = this.f37218f0) != null) {
            if (this.K == null) {
                try {
                    if (articleViewer$WindowView.getParent() != null) {
                        ((WindowManager) this.L.getSystemService("window")).removeViewImmediate(this.f37218f0);
                    }
                    this.f37218f0 = null;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
            for (int i10 = 0; i10 < this.N.size(); i10++) {
                ((t1) this.N.get(i10)).a(true);
            }
            this.N.clear();
            try {
                this.L.getWindow().clearFlags(128);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            this.L = null;
            this.M = null;
            f37189c1 = null;
        }
    }

    public i4(org.telegram.ui.ActionBar.n2 n2Var) {
        this.N = new ArrayList();
        this.Y = 1;
        this.f37215c0 = new DecelerateInterpolator(1.5f);
        this.f37216d0 = new ArrayList();
        this.f37234w0 = new Paint();
        this.f37235x0 = new Paint();
        this.f37236y0 = new Paint();
        this.f37237z0 = new Paint();
        this.J0 = false;
        this.K0 = null;
        this.L0 = null;
        this.R0 = new AnimationNotificationsLocker(new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats});
        this.S0 = new j0[2];
        this.W0 = -1;
        a0 a0Var = new a0(this, 2);
        org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
        this.Z0 = new org.telegram.ui.Components.h5(a0Var, 320L, prVar);
        this.f37213a1 = new org.telegram.ui.Components.h5(new a0(this, 4), 320L, prVar);
        this.J = true;
        this.K = new v3(this, n2Var);
        Y(n2Var.getParentActivity(), n2Var);
    }
}
