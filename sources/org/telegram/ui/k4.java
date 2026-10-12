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
public final class k4 extends z70 implements NotificationCenter.NotificationCenterDelegate {
    public static Paint B1;
    public static TextPaint f37518g1;
    public static TextPaint f37519h1;
    public static TextPaint f37520i1;
    public static TextPaint f37521j1;
    public static TextPaint f37522k1;
    public static TextPaint l1;
    public static TextPaint f37523m1;
    public static TextPaint f37524n1;
    public static Paint f37525o1;
    public static Paint f37526p1;
    public static Paint f37527q1;
    public static Paint f37528r1;
    public static Paint f37529s1;
    public static Paint f37530t1;
    public static Paint f37531u1;
    public static Paint f37532v1;
    public static Paint f37533w1;
    public static Paint f37534x1;
    public static Paint f37535y1;
    public static Paint f37536z1;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout A0;
    public TextView B0;
    public Rect C0;
    public org.telegram.ui.Components.ca1 D0;
    public org.telegram.ui.Components.ca1 E0;
    public int F0;
    public int G0;
    public int H0;
    public int I0;
    public final boolean J;
    public boolean J0;
    public final x3 K;
    public c3 K0;
    public Activity L;
    public c3 L0;
    public org.telegram.ui.ActionBar.m2 M;
    public pf.c M0;
    public final ArrayList N;
    public int N0;
    public View O;
    public org.telegram.ui.Cells.o9 O0;
    public FrameLayout P;
    public org.telegram.ui.Cells.o9 P0;
    public TextureView Q;
    public wv0 Q0;
    public n4 R;
    public final AnimationNotificationsLocker R0;
    public WebChromeClient.CustomViewCallback S;
    public final l0[] S0;
    public WindowInsets T;
    public boolean T0;
    public boolean U;
    public nb0 U0;
    public boolean V;
    public ah.o V0;
    public boolean W;
    public int W0;
    public int X;
    public ValueAnimator X0;
    public int Y;
    public float Y0;
    public int Z;
    public final org.telegram.ui.Components.j5 Z0;
    public Runnable f37537a0;
    public final org.telegram.ui.Components.j5 f37538a1;
    public long f37539b0;
    public final DecelerateInterpolator f37540c0;
    public final ArrayList f37541d0;
    public WindowManager.LayoutParams f37542e0;
    public ArticleViewer$WindowView f37543f0;
    public l0 f37544g0;
    public m0 f37545h0;
    public org.telegram.ui.web.k f37546i0;
    public b0 f37547j0;
    public org.telegram.ui.ActionBar.e3 f37548k0;
    public Paint f37549l0;
    public Drawable m0;
    public Paint f37550n0;
    public boolean f37551o0;
    public float f37552p0;
    public bi.i5 f37553q0;
    public ImageView f37554r0;
    public ImageView f37555s0;
    public org.telegram.ui.Components.s6 f37556t0;
    public o3[] f37557u0;
    public AnimatorSet f37558v0;
    public final Paint f37559w0;
    public final Paint f37560x0;
    public final Paint f37561y0;
    public final Paint f37562z0;
    public static final HashSet f37513b1 = new HashSet();
    public static volatile k4 f37514c1 = null;
    public static final v0 f37515d1 = new v0("innerTranslationX", 0);
    public static final TextPaint f37516e1 = new TextPaint(1);
    public static final s3 f37517f1 = new s3();
    public static final WeakHashMap A1 = new WeakHashMap();

    public k4() {
        this.N = new ArrayList();
        this.Y = 1;
        this.f37540c0 = new DecelerateInterpolator(1.5f);
        this.f37541d0 = new ArrayList();
        this.f37559w0 = new Paint();
        this.f37560x0 = new Paint();
        this.f37561y0 = new Paint();
        this.f37562z0 = new Paint();
        this.J0 = false;
        this.K0 = null;
        this.L0 = null;
        this.R0 = new AnimationNotificationsLocker(new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats});
        this.S0 = new l0[2];
        this.W0 = -1;
        b0 b0Var = new b0(this, 2);
        org.telegram.ui.Components.es esVar = org.telegram.ui.Components.es.h;
        this.Z0 = new org.telegram.ui.Components.j5(b0Var, 320L, esVar);
        this.f37538a1 = new org.telegram.ui.Components.j5(new b0(this, 4), 320L, esVar);
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

    public static CharSequence C(z70 z70Var, TLRPC.WebPage webPage, View view, TL_iv.RichText richText, TL_iv.RichText richText2, TL_iv.PageBlock pageBlock, int i10) {
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.l11 l11Var;
        org.telegram.ui.Components.l11 l11Var2;
        TextPaint textPaint = null;
        if (richText2 == null) {
            return null;
        }
        if (richText2 instanceof TL_iv.textFixed) {
            return C(z70Var, webPage, view, richText, ((TL_iv.textFixed) richText2).text, pageBlock, i10);
        }
        if (richText2 instanceof TL_iv.textItalic) {
            return C(z70Var, webPage, view, richText, ((TL_iv.textItalic) richText2).text, pageBlock, i10);
        }
        if (richText2 instanceof TL_iv.textBold) {
            return C(z70Var, webPage, view, richText, ((TL_iv.textBold) richText2).text, pageBlock, i10);
        }
        if (richText2 instanceof TL_iv.textUnderline) {
            return C(z70Var, webPage, view, richText, ((TL_iv.textUnderline) richText2).text, pageBlock, i10);
        }
        if (richText2 instanceof TL_iv.textStrike) {
            return C(z70Var, webPage, view, richText, ((TL_iv.textStrike) richText2).text, pageBlock, i10);
        }
        if (richText2 instanceof TL_iv.textEmail) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C(z70Var, webPage, view, richText, ((TL_iv.textEmail) richText2).text, pageBlock, i10));
            MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), MetricAffectingSpan.class);
            if (spannableStringBuilder.length() != 0) {
                if (metricAffectingSpanArr == null || metricAffectingSpanArr.length == 0) {
                    textPaint = E(z70Var, richText, richText2, pageBlock);
                }
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.l11(textPaint, "mailto:" + F(richText2)), 0, spannableStringBuilder.length(), 33);
            }
            return spannableStringBuilder;
        }
        long j10 = 0;
        if (richText2 instanceof TL_iv.textUrl) {
            TL_iv.textUrl texturl = (TL_iv.textUrl) richText2;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(C(z70Var, webPage, view, richText, texturl.text, pageBlock, i10));
            MetricAffectingSpan[] metricAffectingSpanArr2 = (MetricAffectingSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), MetricAffectingSpan.class);
            if (metricAffectingSpanArr2 == null || metricAffectingSpanArr2.length == 0) {
                textPaint = E(z70Var, richText, richText2, pageBlock);
            }
            if (texturl.webpage_id != 0) {
                l11Var2 = new org.telegram.ui.Components.l11(textPaint, F(richText2));
            } else {
                l11Var2 = new org.telegram.ui.Components.l11(textPaint, F(richText2));
            }
            if (spannableStringBuilder2.length() != 0) {
                spannableStringBuilder2.setSpan(l11Var2, 0, spannableStringBuilder2.length(), 33);
            }
            return spannableStringBuilder2;
        } else if (richText2 instanceof TL_iv.textPlain) {
            return ((TL_iv.textPlain) richText2).text;
        } else {
            if (richText2 instanceof TL_iv.textAnchor) {
                TL_iv.textAnchor textanchor = (TL_iv.textAnchor) richText2;
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(C(z70Var, webPage, view, richText, textanchor.text, pageBlock, i10));
                String str = textanchor.name;
                ?? metricAffectingSpan = new MetricAffectingSpan();
                metricAffectingSpan.f25505a = str.toLowerCase();
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
                        if (i10 >= 0 && (richText3 instanceof TL_iv.textUrl) && ((TL_iv.textUrl) richText3).webpage_id != j10) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11 && spannableStringBuilder4.length() != 0 && spannableStringBuilder4.charAt(spannableStringBuilder4.length() - 1) != '\n') {
                            spannableStringBuilder4.append((CharSequence) " ");
                            spannableStringBuilder4.setSpan(new Object(), spannableStringBuilder4.length() - 1, spannableStringBuilder4.length(), 33);
                        }
                        CharSequence C = C(z70Var, webPage, view, richText, richText3, pageBlock, i10);
                        int D = D(A);
                        int length = spannableStringBuilder4.length();
                        spannableStringBuilder4.append(C);
                        if (D != 0 && !(C instanceof SpannableStringBuilder)) {
                            if ((D & 8) == 0 && (D & 512) == 0) {
                                if (length != spannableStringBuilder4.length()) {
                                    TextPaint E = E(z70Var, richText, A, pageBlock);
                                    ?? metricAffectingSpan2 = new MetricAffectingSpan();
                                    metricAffectingSpan2.f26543a = E;
                                    spannableStringBuilder4.setSpan(metricAffectingSpan2, length, spannableStringBuilder4.length(), 33);
                                }
                            } else {
                                String F = F(richText3);
                                if (F == null) {
                                    F = F(richText);
                                }
                                if ((D & 512) != 0) {
                                    l11Var = new org.telegram.ui.Components.l11(E(z70Var, richText, A, pageBlock), F);
                                } else {
                                    l11Var = new org.telegram.ui.Components.l11(E(z70Var, richText, A, pageBlock), F);
                                }
                                if (length != spannableStringBuilder4.length()) {
                                    spannableStringBuilder4.setSpan(l11Var, length, spannableStringBuilder4.length(), 33);
                                }
                            }
                        }
                        if (z11 && i11 != size - 1) {
                            spannableStringBuilder4.append((CharSequence) " ");
                            spannableStringBuilder4.setSpan(new Object(), spannableStringBuilder4.length() - 1, spannableStringBuilder4.length(), 33);
                        }
                        i11++;
                        j10 = 0;
                    }
                    return spannableStringBuilder4;
                } else if (richText2 instanceof TL_iv.textSubscript) {
                    return C(z70Var, webPage, view, richText, ((TL_iv.textSubscript) richText2).text, pageBlock, i10);
                } else {
                    if (richText2 instanceof TL_iv.textSuperscript) {
                        return C(z70Var, webPage, view, richText, ((TL_iv.textSuperscript) richText2).text, pageBlock, i10);
                    }
                    if (richText2 instanceof TL_iv.textMarked) {
                        SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(C(z70Var, webPage, view, richText, ((TL_iv.textMarked) richText2).text, pageBlock, i10));
                        MetricAffectingSpan[] metricAffectingSpanArr3 = (MetricAffectingSpan[]) spannableStringBuilder5.getSpans(0, spannableStringBuilder5.length(), MetricAffectingSpan.class);
                        if (spannableStringBuilder5.length() != 0) {
                            if (metricAffectingSpanArr3 == null || metricAffectingSpanArr3.length == 0) {
                                textPaint = E(z70Var, richText, richText2, pageBlock);
                            }
                            ?? metricAffectingSpan3 = new MetricAffectingSpan();
                            metricAffectingSpan3.f26153a = textPaint;
                            spannableStringBuilder5.setSpan(metricAffectingSpan3, 0, spannableStringBuilder5.length(), 33);
                        }
                        return spannableStringBuilder5;
                    } else if (richText2 instanceof TL_iv.textSpoiler) {
                        SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder(C(z70Var, webPage, view, richText, ((TL_iv.textSpoiler) richText2).text, pageBlock, i10));
                        if (spannableStringBuilder6.length() != 0) {
                            ?? obj = new Object();
                            obj.f28135a |= 256;
                            spannableStringBuilder6.setSpan(new org.telegram.ui.Components.q11(obj, 0), 0, spannableStringBuilder6.length(), 33);
                        }
                        return spannableStringBuilder6;
                    } else if (richText2 instanceof TL_iv.textPhone) {
                        SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder(C(z70Var, webPage, view, richText, ((TL_iv.textPhone) richText2).text, pageBlock, i10));
                        MetricAffectingSpan[] metricAffectingSpanArr4 = (MetricAffectingSpan[]) spannableStringBuilder7.getSpans(0, spannableStringBuilder7.length(), MetricAffectingSpan.class);
                        if (spannableStringBuilder7.length() != 0) {
                            if (metricAffectingSpanArr4 == null || metricAffectingSpanArr4.length == 0) {
                                textPaint = E(z70Var, richText, richText2, pageBlock);
                            }
                            spannableStringBuilder7.setSpan(new org.telegram.ui.Components.l11(textPaint, "tel:" + F(richText2)), 0, spannableStringBuilder7.length(), 33);
                        }
                        return spannableStringBuilder7;
                    } else {
                        if (richText2 instanceof TL_iv.textImage) {
                            TL_iv.textImage textimage = (TL_iv.textImage) richText2;
                            TLRPC.Document a2 = h4.a(webPage, textimage.document_id);
                            TLRPC.Photo e = h4.e(webPage, textimage.photo_id);
                            if (a2 != null) {
                                SpannableStringBuilder spannableStringBuilder8 = new SpannableStringBuilder("*");
                                int dp = AndroidUtilities.dp(textimage.f19438w);
                                int dp2 = AndroidUtilities.dp(textimage.h);
                                int abs = Math.abs(i10);
                                if (dp > abs) {
                                    dp2 = (int) (dp2 * (abs / dp));
                                    dp = abs;
                                }
                                if (view != null) {
                                    int i12 = org.telegram.ui.ActionBar.g6.f19901d6;
                                    ((k4) z70Var).getClass();
                                    if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.x0(null, i12, false)) <= 0.705f) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    ?? replacementSpan = new ReplacementSpan();
                                    Locale locale = Locale.US;
                                    String str2 = dp + "_" + dp2 + "_i";
                                    replacementSpan.f25796b = dp;
                                    replacementSpan.f25797c = dp2;
                                    boolean z12 = z10;
                                    ImageReceiver imageReceiver = new ImageReceiver(view);
                                    replacementSpan.f25795a = imageReceiver;
                                    imageReceiver.setInvalidateAll(true);
                                    if (z12) {
                                        imageReceiver.setDelegate(new org.telegram.ui.Components.zg0(12));
                                    }
                                    imageReceiver.setImage(ImageLocation.getForDocument(a2), str2, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(a2.thumbs, 90), a2), str2, -1L, null, webPage, 1);
                                    spannableStringBuilder8.setSpan(replacementSpan, 0, spannableStringBuilder8.length(), 33);
                                }
                                return spannableStringBuilder8;
                            } else if (e instanceof org.telegram.ui.web.g2) {
                                org.telegram.ui.web.g2 g2Var = (org.telegram.ui.web.g2) e;
                                SpannableStringBuilder spannableStringBuilder9 = new SpannableStringBuilder("*");
                                int dp3 = AndroidUtilities.dp(textimage.f19438w);
                                int dp4 = AndroidUtilities.dp(textimage.h);
                                int abs2 = Math.abs(i10);
                                if (dp3 > abs2) {
                                    dp4 = (int) (dp4 * (abs2 / dp3));
                                    dp3 = abs2;
                                }
                                if (view != null) {
                                    ?? replacementSpan2 = new ReplacementSpan();
                                    replacementSpan2.f25796b = dp3;
                                    replacementSpan2.f25797c = dp4;
                                    ImageReceiver imageReceiver2 = new ImageReceiver(view);
                                    replacementSpan2.f25795a = imageReceiver2;
                                    imageReceiver2.setInvalidateAll(true);
                                    org.telegram.ui.web.h2.g(g2Var, imageReceiver2, new org.telegram.ui.Components.ve(11));
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
                                    textmath.f19439w = a10.f13505b;
                                    textmath.h = a10.f13506c;
                                    textmath.depth = a10.d;
                                    textmath.bitmap = a10.f13504a;
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
                                int i13 = textmath.f19439w;
                                int i14 = textmath.h;
                                int i15 = org.telegram.ui.ActionBar.g6.G6;
                                ((k4) z70Var).getClass();
                                spannableStringBuilder10.setSpan(new org.telegram.ui.Components.i11(view, bitmap, i13, i14, org.telegram.ui.ActionBar.g6.x0(null, i15, false), textmath.depth), 0, spannableStringBuilder10.length(), 33);
                                String str4 = textmath.source;
                                if (str4 != null && !str4.isEmpty()) {
                                    spannableStringBuilder10.setSpan(new org.telegram.ui.Cells.u9(textmath.source), 0, spannableStringBuilder10.length(), 33);
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

    public static TextPaint E(z70 z70Var, TL_iv.RichText richText, TL_iv.RichText richText2, TL_iv.PageBlock pageBlock) {
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
        k4 k4Var = (k4) z70Var;
        k4Var.getClass();
        s3 s3Var = f37517f1;
        s3Var.getClass();
        SparseArray sparseArray = s3Var.f39962x;
        SparseArray sparseArray2 = s3Var.f39961w;
        SparseArray sparseArray3 = s3Var.f39959t;
        SparseArray sparseArray4 = s3Var.f39945c;
        SparseArray sparseArray5 = s3Var.f39944b;
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
            b10 = z70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockMap) {
            TL_iv.RichText richText4 = ((TL_iv.pageBlockMap) pageBlock).caption.text;
            if (richText4 != richText2 && richText4 != richText) {
                dp6 = AndroidUtilities.dp(12.0f);
            } else {
                dp6 = AndroidUtilities.dp(14.0f);
                sparseArray4 = sparseArray5;
            }
            dp8 = dp6;
            b10 = z70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockTitle) {
            sparseArray4 = s3Var.d;
            dp8 = AndroidUtilities.dp(23.0f);
            b10 = z70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockKicker) {
            sparseArray4 = s3Var.e;
            dp8 = AndroidUtilities.dp(14.0f);
            b10 = z70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockAuthorDate) {
            sparseArray4 = s3Var.f39954o;
            dp8 = AndroidUtilities.dp(14.0f);
            b10 = z70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockFooter) {
            sparseArray4 = s3Var.f39955p;
            dp8 = AndroidUtilities.dp(14.0f);
            b10 = z70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockSubtitle) {
            sparseArray4 = s3Var.f39947g;
            dp8 = AndroidUtilities.dp(20.0f);
            b10 = z70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeader) {
            sparseArray4 = s3Var.f39946f;
            dp8 = AndroidUtilities.dp(20.0f);
            b10 = z70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockSubheader) {
            sparseArray4 = s3Var.h;
            dp8 = AndroidUtilities.dp(17.0f);
            b10 = z70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading1) {
            sparseArray4 = s3Var.f39948i;
            dp8 = AndroidUtilities.dp(18.0f);
            b10 = z70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading2) {
            sparseArray4 = s3Var.f39949j;
            dp8 = AndroidUtilities.dp(16.0f);
            b10 = z70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading3) {
            sparseArray4 = s3Var.f39950k;
            dp8 = AndroidUtilities.dp(15.0f);
            b10 = z70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading4) {
            sparseArray4 = s3Var.f39951l;
            dp8 = AndroidUtilities.dp(14.0f);
            b10 = z70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading5) {
            sparseArray4 = s3Var.f39952m;
            dp8 = AndroidUtilities.dp(13.0f);
            b10 = z70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading6) {
            sparseArray4 = s3Var.f39953n;
            dp8 = AndroidUtilities.dp(12.0f);
            b10 = z70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) pageBlock;
            if (pageblockblockquote.text == richText) {
                dp8 = AndroidUtilities.dp(15.0f);
                b10 = z70Var.b();
                sparseArray4 = sparseArray3;
            } else {
                if (pageblockblockquote.caption == richText) {
                    dp8 = AndroidUtilities.dp(14.0f);
                    b10 = z70Var.a();
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
                b10 = z70Var.b();
                sparseArray4 = sparseArray3;
            } else {
                if (pageblockpullquote.caption == richText) {
                    dp8 = AndroidUtilities.dp(14.0f);
                    b10 = z70Var.a();
                    sparseArray3 = sparseArray5;
                    sparseArray4 = sparseArray3;
                }
                b10 = -65536;
                sparseArray3 = null;
                sparseArray4 = sparseArray3;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
            sparseArray4 = s3Var.f39958s;
            dp8 = AndroidUtilities.dp(14.0f);
            b10 = z70Var.b();
            D |= 4;
        } else if (pageBlock instanceof TL_iv.pageBlockParagraph) {
            sparseArray4 = s3Var.f39956q;
            dp8 = AndroidUtilities.dp(16.0f);
            b10 = z70Var.b();
        } else if (L(pageBlock)) {
            sparseArray4 = s3Var.f39957r;
            dp8 = AndroidUtilities.dp(16.0f);
            b10 = z70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockEmbed) {
            TL_iv.RichText richText5 = ((TL_iv.pageBlockEmbed) pageBlock).caption.text;
            if (richText5 != richText2 && richText5 != richText) {
                dp5 = AndroidUtilities.dp(12.0f);
            } else {
                dp5 = AndroidUtilities.dp(14.0f);
                sparseArray4 = sparseArray5;
            }
            dp8 = dp5;
            b10 = z70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
            TL_iv.RichText richText6 = ((TL_iv.pageBlockSlideshow) pageBlock).caption.text;
            if (richText6 != richText2 && richText6 != richText) {
                dp4 = AndroidUtilities.dp(12.0f);
            } else {
                dp4 = AndroidUtilities.dp(14.0f);
                sparseArray4 = sparseArray5;
            }
            dp8 = dp4;
            b10 = z70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockCollage) {
            TL_iv.RichText richText7 = ((TL_iv.pageBlockCollage) pageBlock).caption.text;
            if (richText7 != richText2 && richText7 != richText) {
                dp3 = AndroidUtilities.dp(12.0f);
            } else {
                dp3 = AndroidUtilities.dp(14.0f);
                sparseArray4 = sparseArray5;
            }
            dp8 = dp3;
            b10 = z70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockEmbedPost) {
            TL_iv.PageCaption pageCaption = ((TL_iv.pageBlockEmbedPost) pageBlock).caption;
            if (richText2 == pageCaption.text) {
                dp8 = AndroidUtilities.dp(14.0f);
                b10 = z70Var.a();
                sparseArray4 = sparseArray5;
            } else if (richText2 == pageCaption.credit) {
                dp8 = AndroidUtilities.dp(12.0f);
                b10 = z70Var.a();
            } else {
                if (richText2 != null) {
                    sparseArray4 = s3Var.f39960u;
                    dp8 = AndroidUtilities.dp(14.0f);
                    b10 = z70Var.b();
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
                b10 = z70Var.b();
            } else if (pageBlock instanceof TL_iv.pageBlockAudio) {
                if (richText2 == ((TL_iv.pageBlockAudio) pageBlock).caption.text) {
                    dp = AndroidUtilities.dp(14.0f);
                    sparseArray = sparseArray2;
                } else {
                    dp = AndroidUtilities.dp(12.0f);
                }
                dp8 = dp;
                b10 = z70Var.b();
            } else if (pageBlock instanceof TL_iv.pageBlockRelatedArticles) {
                sparseArray4 = s3Var.f39963y;
                dp8 = AndroidUtilities.dp(15.0f);
                b10 = z70Var.a();
            } else if (pageBlock instanceof TL_iv.pageBlockDetails) {
                sparseArray4 = s3Var.f39964z;
                dp8 = AndroidUtilities.dp(15.0f);
                b10 = z70Var.b();
            } else {
                if (pageBlock instanceof TL_iv.pageBlockTable) {
                    sparseArray4 = s3Var.A;
                    dp8 = AndroidUtilities.dp(15.0f);
                    b10 = z70Var.b();
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
            if (s3Var.f39943a == null) {
                TextPaint textPaint = new TextPaint(1);
                s3Var.f39943a = textPaint;
                textPaint.setColor(-65536);
            }
            s3Var.f39943a.setTextSize(AndroidUtilities.dp(14.0f));
            return s3Var.f39943a;
        }
        TextPaint textPaint2 = (TextPaint) sparseArray4.get(D);
        if (textPaint2 == null) {
            textPaint2 = new TextPaint(1);
            if ((D & 4) != 0) {
                textPaint2.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
            } else if (pageBlock instanceof TL_iv.pageBlockRelatedArticles) {
                textPaint2.setTypeface(AndroidUtilities.bold());
            } else if (z70Var.f42500a != 1 && !(pageBlock instanceof TL_iv.pageBlockTitle) && !(pageBlock instanceof TL_iv.pageBlockKicker) && !(pageBlock instanceof TL_iv.pageBlockHeader) && !(pageBlock instanceof TL_iv.pageBlockSubtitle) && !(pageBlock instanceof TL_iv.pageBlockSubheader) && !K(pageBlock)) {
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
                k4Var.getClass();
                b10 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.J6, false);
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
        if (f37514c1 != null) {
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
        if (!(pageBlock instanceof a4) && !(pageBlock instanceof c4)) {
            return false;
        }
        return true;
    }

    public static boolean O(y3 y3Var) {
        boolean z10;
        TL_iv.PageBlock z11 = z(y3Var.f42015a);
        if (z11 instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) z11;
            if (!pageblockdetails.open) {
                pageblockdetails.open = true;
                return true;
            }
        } else if (z11 instanceof y3) {
            y3 y3Var2 = (y3) z11;
            TL_iv.PageBlock z12 = z(y3Var2.f42016b);
            if (z12 instanceof TL_iv.pageBlockDetails) {
                TL_iv.pageBlockDetails pageblockdetails2 = (TL_iv.pageBlockDetails) z12;
                if (!pageblockdetails2.open) {
                    pageblockdetails2.open = true;
                    z10 = true;
                    if (!O(y3Var2) || z10) {
                        return true;
                    }
                }
            }
            z10 = false;
            if (!O(y3Var2)) {
            }
            return true;
        }
        return false;
    }

    public static void T(z70 z70Var) {
        if (z70Var.f42501b != null || z70Var.f42503f != null) {
            View view = z70Var.f42503f;
            z70Var.f42502c.d(true);
            z70Var.f42501b = null;
            z70Var.d = null;
            z70Var.f42503f = null;
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

    public static void f(String str, int i10, FrameLayout frameLayout, x3 x3Var, org.telegram.ui.ActionBar.c6 c6Var) {
        String u10 = org.telegram.ui.web.b1.u(str);
        long clientUserId = UserConfig.getInstance(i10).getClientUserId();
        SendMessagesHelper.getInstance(i10).sendMessage(SendMessagesHelper.SendMessageParams.of(u10, clientUserId));
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
        tL_message.peer_id = tL_peerUser;
        tL_peerUser.user_id = clientUserId;
        TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
        tL_message.from_id = tL_peerUser2;
        tL_peerUser2.user_id = clientUserId;
        tL_message.message = u10;
        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
        tL_message.media = tL_messageMediaWebPage;
        tL_messageMediaWebPage.webpage = new TLRPC.TL_webPage();
        TLRPC.WebPage webPage = tL_message.media.webpage;
        webPage.url = u10;
        webPage.display_url = u10;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.bookmarkAdded, new MessageObject(i10, tL_message, false, false));
        new org.telegram.ui.Components.zc(frameLayout, c6Var).Q(R.raw.saved_messages, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.WebBookmarkedToast), new bi.g(x3Var, clientUserId, 19))).k(true);
    }

    public static void g0(k4 k4Var) {
        TextPaint textPaint = f37523m1;
        if (textPaint != null) {
            textPaint.setColor(k4Var.b());
        }
        TextPaint textPaint2 = f37524n1;
        if (textPaint2 != null) {
            textPaint2.setColor(k4Var.b());
        }
        TextPaint textPaint3 = f37518g1;
        if (textPaint3 != null) {
            textPaint3.setColor(k4Var.b());
        }
        TextPaint textPaint4 = f37520i1;
        if (textPaint4 != null) {
            textPaint4.setColor(k4Var.b());
        }
        TextPaint textPaint5 = f37521j1;
        if (textPaint5 != null) {
            textPaint5.setColor(-1);
        }
        TextPaint textPaint6 = f37522k1;
        if (textPaint6 != null) {
            textPaint6.setColor(k4Var.b());
        }
        TextPaint textPaint7 = l1;
        if (textPaint7 != null) {
            textPaint7.setColor(k4Var.a());
        }
        TextPaint textPaint8 = f37519h1;
        if (textPaint8 != null) {
            textPaint8.setColor(k4Var.a());
        }
        r(k4Var, true);
        s3 s3Var = f37517f1;
        s3.a(k4Var, s3Var.d);
        s3.a(k4Var, s3Var.e);
        s3.a(k4Var, s3Var.f39947g);
        s3.a(k4Var, s3Var.f39946f);
        s3.a(k4Var, s3Var.h);
        s3.a(k4Var, s3Var.f39948i);
        s3.a(k4Var, s3Var.f39949j);
        s3.a(k4Var, s3Var.f39950k);
        s3.a(k4Var, s3Var.f39951l);
        s3.a(k4Var, s3Var.f39952m);
        s3.a(k4Var, s3Var.f39953n);
        s3.a(k4Var, s3Var.f39959t);
        s3.a(k4Var, s3Var.f39958s);
        s3.a(k4Var, s3Var.f39956q);
        s3.a(k4Var, s3Var.f39957r);
        s3.a(k4Var, s3Var.f39960u);
        s3.a(k4Var, s3Var.f39961w);
        s3.a(k4Var, s3Var.f39962x);
        s3.a(k4Var, s3Var.f39944b);
        s3.a(k4Var, s3Var.f39945c);
        s3.a(k4Var, s3Var.f39954o);
        s3.a(k4Var, s3Var.f39955p);
        s3.a(k4Var, s3Var.v);
        s3.a(k4Var, s3Var.f39963y);
        s3.a(k4Var, s3Var.f39964z);
        s3.a(k4Var, s3Var.A);
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

    public static CharSequence j(z70 z70Var, i4 i4Var, d3 d3Var) {
        StaticLayout staticLayout;
        if (d3Var != null && (staticLayout = d3Var.d) != null) {
            SpannableStringBuilder spannableStringBuilder = d3Var.f35135y;
            if (spannableStringBuilder != null) {
                return spannableStringBuilder;
            }
            CharSequence text = staticLayout.getText();
            if (!(text instanceof Spannable)) {
                return text;
            }
            Spannable spannable = (Spannable) text;
            org.telegram.ui.Components.l11[] l11VarArr = (org.telegram.ui.Components.l11[]) spannable.getSpans(0, spannable.length(), org.telegram.ui.Components.l11.class);
            SpannableStringBuilder spannableStringBuilder2 = text;
            if (l11VarArr != null) {
                spannableStringBuilder2 = text;
                if (l11VarArr.length != 0) {
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannable);
                    for (org.telegram.ui.Components.l11 l11Var : l11VarArr) {
                        int spanStart = spannableStringBuilder3.getSpanStart(l11Var);
                        int spanEnd = spannableStringBuilder3.getSpanEnd(l11Var);
                        if (spanStart >= 0 && spanEnd > spanStart) {
                            spannableStringBuilder3.setSpan(new p0(z70Var, i4Var, l11Var, 0), spanStart, spanEnd, 33);
                        }
                    }
                    d3Var.f35135y = spannableStringBuilder3;
                    spannableStringBuilder2 = spannableStringBuilder3;
                }
            }
            return spannableStringBuilder2;
        }
        return null;
    }

    public static TL_iv.PageBlock j0(TL_iv.PageBlock pageBlock, y3 y3Var) {
        if (pageBlock instanceof a4) {
            a4 a4Var = (a4) pageBlock;
            a4 a4Var2 = new a4();
            a4Var2.f34031a = a4Var.f34031a;
            a4Var2.f34032b = a4Var.f34032b;
            a4Var2.f34033c = a4Var.f34033c;
            a4Var2.d = j0(a4Var.d, y3Var);
            return a4Var2;
        } else if (pageBlock instanceof c4) {
            c4 c4Var = (c4) pageBlock;
            c4 c4Var2 = new c4();
            c4Var2.f34724a = c4Var.f34724a;
            c4Var2.f34725b = c4Var.f34725b;
            c4Var2.f34726c = c4Var.f34726c;
            c4Var2.d = j0(c4Var.d, y3Var);
            return c4Var2;
        } else {
            return y3Var;
        }
    }

    public static boolean l(org.telegram.ui.z70 r25, org.telegram.ui.i4 r26, android.view.MotionEvent r27, android.view.View r28, org.telegram.ui.d3 r29, int r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.k4.l(org.telegram.ui.z70, org.telegram.ui.i4, android.view.MotionEvent, android.view.View, org.telegram.ui.d3, int, int):boolean");
    }

    public static org.telegram.ui.d3 p(org.telegram.ui.z70 r20, android.view.View r21, java.lang.CharSequence r22, org.telegram.tgnet.tl.TL_iv.RichText r23, int r24, int r25, org.telegram.tgnet.tl.TL_iv.PageBlock r26, android.text.Layout.Alignment r27, int r28, org.telegram.ui.i4 r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.k4.p(org.telegram.ui.z70, android.view.View, java.lang.CharSequence, org.telegram.tgnet.tl.TL_iv$RichText, int, int, org.telegram.tgnet.tl.TL_iv$PageBlock, android.text.Layout$Alignment, int, org.telegram.ui.i4):org.telegram.ui.d3");
    }

    public static d3 q(z70 z70Var, View view, CharSequence charSequence, TL_iv.RichText richText, int i10, int i11, TL_iv.PageBlock pageBlock, i4 i4Var) {
        return p(z70Var, view, charSequence, richText, i10, i11, pageBlock, Layout.Alignment.ALIGN_NORMAL, 0, i4Var);
    }

    public static void r(k4 k4Var, boolean z10) {
        int i10;
        if (f37527q1 == null) {
            f37527q1 = new Paint();
            f37526p1 = new Paint();
            Paint paint = new Paint(1);
            f37529s1 = paint;
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            f37529s1.setStrokeWidth(AndroidUtilities.dp(1.0f));
            Paint paint2 = new Paint();
            f37530t1 = paint2;
            paint2.setStyle(style);
            f37530t1.setStrokeWidth(AndroidUtilities.dp(1.0f) / 2.0f);
            f37531u1 = new Paint();
            f37532v1 = new Paint();
            f37533w1 = new Paint();
            f37534x1 = new Paint(1);
            f37535y1 = new Paint(1);
            f37525o1 = new Paint();
            f37528r1 = new Paint();
            f37536z1 = new Paint(1);
        } else if (!z10) {
            return;
        }
        int x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19901d6, false);
        float green = Color.green(x02) * 0.7152f;
        float w9 = com.google.android.gms.internal.play_billing.k3.w(Color.blue(x02), 0.0722f, green + (Color.red(x02) * 0.2126f), 255.0f);
        Paint paint3 = f37535y1;
        if (w9 <= 0.705f) {
            i10 = -3041234;
        } else {
            i10 = -6551;
        }
        paint3.setColor(i10);
        Paint paint4 = f37534x1;
        int i11 = org.telegram.ui.ActionBar.g6.K6;
        paint4.setColor(org.telegram.ui.ActionBar.g6.x0(null, i11, false) & 872415231);
        f37534x1.setPathEffect(org.telegram.ui.Components.x90.c());
        f37533w1.setColor(org.telegram.ui.ActionBar.g6.x0(null, i11, false) & 872415231);
        f37533w1.setPathEffect(org.telegram.ui.Components.x90.c());
        Paint paint5 = f37530t1;
        int i12 = org.telegram.ui.ActionBar.g6.f20028k6;
        paint5.setColor(org.telegram.ui.ActionBar.g6.x0(null, i12, false));
        f37529s1.setColor(org.telegram.ui.ActionBar.g6.x0(null, i12, false));
        f37525o1.setColor(251658240);
        f37528r1.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19902d7, false));
        f37536z1.setColor(org.telegram.ui.ActionBar.g6.x0(null, i11, false) & 872415231);
        f37536z1.setPathEffect(org.telegram.ui.Components.x90.c());
        int x03 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.M6, false);
        int red = Color.red(x03);
        int green2 = Color.green(x03);
        int blue = Color.blue(x03);
        f37532v1.setColor(Color.argb(20, red, green2, blue));
        f37531u1.setColor(Color.argb(34, red, green2, blue));
        int x04 = org.telegram.ui.ActionBar.g6.x0(null, i11, false);
        f37526p1.setColor(Color.argb(20, Color.red(x04), Color.green(x04), Color.blue(x04)));
        f37527q1.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Uc, false));
    }

    public static void u(Canvas canvas, z70 z70Var, TL_iv.PageBlock pageBlock, int i10) {
        int i11;
        int dp;
        int dp2;
        if (pageBlock != null && z70Var != null && f37527q1 != null) {
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
                    canvas.drawRect(AndroidUtilities.dp(18), 0.0f, AndroidUtilities.dp(2.0f) + dp2, i13, f37527q1);
                    return;
                }
                return;
            }
            while (i14 != 0) {
                if ((i14 & 1) != 0) {
                    canvas.drawRect(AndroidUtilities.dp((i12 * 14) + 18), 0.0f, AndroidUtilities.dp(2.0f) + dp, i13, f37527q1);
                }
                i14 >>>= 1;
                i12++;
            }
        }
    }

    public static void v(org.telegram.ui.z70 r2, android.graphics.Canvas r3, org.telegram.ui.Cells.n9 r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.k4.v(org.telegram.ui.z70, android.graphics.Canvas, org.telegram.ui.Cells.n9, int):void");
    }

    public static TL_iv.RichText w(int i10, TL_iv.PageBlock pageBlock) {
        if (i10 == 2) {
            TL_iv.RichText w9 = w(0, pageBlock);
            if (w9 instanceof TL_iv.textEmpty) {
                w9 = null;
            }
            TL_iv.RichText w10 = w(1, pageBlock);
            if (w10 instanceof TL_iv.textEmpty) {
                w10 = null;
            }
            if (w9 != null && w10 == null) {
                return w9;
            }
            if (w9 == null && w10 != null) {
                return w10;
            }
            if (w9 != null && w10 != null) {
                TL_iv.textPlain textplain = new TL_iv.textPlain();
                textplain.text = " ";
                TL_iv.textConcat textconcat = new TL_iv.textConcat();
                textconcat.texts.add(w9);
                textconcat.texts.add(textplain);
                textconcat.texts.add(w10);
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

    public static k4 x() {
        k4 k4Var;
        k4 k4Var2 = f37514c1;
        if (k4Var2 == null) {
            synchronized (k4.class) {
                try {
                    k4Var = f37514c1;
                    if (k4Var == null) {
                        k4Var = new k4();
                        f37514c1 = k4Var;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return k4Var;
        }
        return k4Var2;
    }

    public static View y(View view) {
        org.telegram.ui.Components.wl0 wl0Var;
        if (view instanceof a2) {
            org.telegram.ui.Components.wl0 wl0Var2 = ((a2) view).d;
            if (wl0Var2 != null) {
                return y(wl0Var2.f44838a);
            }
            return view;
        } else if ((view instanceof d2) && (wl0Var = ((d2) view).d) != null) {
            return y(wl0Var.f44838a);
        } else {
            return view;
        }
    }

    public static TL_iv.PageBlock z(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof a4) {
            TL_iv.PageBlock pageBlock2 = ((a4) pageBlock).d;
            if (pageBlock2 != null) {
                return z(pageBlock2);
            }
            return pageBlock2;
        } else if (pageBlock instanceof c4) {
            TL_iv.PageBlock pageBlock3 = ((c4) pageBlock).d;
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
        int x02;
        int x03;
        boolean z10;
        float x10;
        ArrayList arrayList = this.f37541d0;
        int size = arrayList.size();
        x3 x3Var = this.K;
        boolean z11 = false;
        if (size <= 1) {
            ArticleViewer$WindowView articleViewer$WindowView = this.f37543f0;
            articleViewer$WindowView.e = false;
            articleViewer$WindowView.d = false;
            l0 l0Var = this.f37544g0;
            if (x3Var != null) {
                x10 = x3Var.I * x3Var.f41730c.getWidth();
            } else {
                x10 = l0Var.getX();
            }
            AnimatorSet animatorSet = new AnimatorSet();
            float measuredWidth = l0Var.getMeasuredWidth() - x10;
            if (x3Var != null) {
                animatorSet.playTogether(x3Var.d(1.0f));
            } else {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.f37544g0, View.TRANSLATION_X, l0Var.getMeasuredWidth()), ObjectAnimator.ofFloat(this.f37543f0, f37515d1, l0Var.getMeasuredWidth()));
            }
            animatorSet.setDuration(Math.max((int) ((420.0f / l0Var.getMeasuredWidth()) * measuredWidth), 250));
            animatorSet.setInterpolator(org.telegram.ui.Components.es.h);
            animatorSet.addListener(new x0(this));
            animatorSet.start();
            this.T0 = true;
            return;
        }
        ArticleViewer$WindowView articleViewer$WindowView2 = this.f37543f0;
        articleViewer$WindowView2.f20868f = true;
        articleViewer$WindowView2.e = true;
        articleViewer$WindowView2.h = this.I0;
        this.f37557u0[1].setVisibility(0);
        this.f37557u0[1].setAlpha(1.0f);
        this.f37557u0[1].setTranslationX(0.0f);
        o3 o3Var = this.f37557u0[0];
        if (x3Var == null) {
            color = 0;
        } else {
            color = this.f37549l0.getColor();
        }
        o3Var.setBackgroundColor(color);
        e0(-1, arrayList.get(arrayList.size() - 2), true);
        o3 o3Var2 = this.f37557u0[0];
        o3Var2.getX();
        AnimatorSet animatorSet2 = new AnimatorSet();
        o3Var2.getMeasuredWidth();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f37557u0[0], View.TRANSLATION_X, o3Var2.getMeasuredWidth()));
        animatorSet2.setDuration(420L);
        animatorSet2.setInterpolator(org.telegram.ui.Components.es.h);
        animatorSet2.addListener(new y0(this));
        animatorSet2.start();
        m0 m0Var = this.f37545h0;
        o3 o3Var3 = this.f37557u0[0];
        if (o3Var3 != null && SharedConfig.adaptableColorInBrowser) {
            x02 = o3Var3.getBackgroundColor();
        } else {
            x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Pk, false);
        }
        m0Var.setMenuColors(x02);
        m0 m0Var2 = this.f37545h0;
        o3 o3Var4 = this.f37557u0[0];
        if (o3Var4 != null && SharedConfig.adaptableColorInBrowser) {
            x03 = o3Var4.getActionBarColor();
        } else {
            x03 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Pk, false);
        }
        m0Var2.d(x03, true);
        m0 m0Var3 = this.f37545h0;
        o3 o3Var5 = this.f37557u0[0];
        if (o3Var5 != null && o3Var5.e()) {
            z10 = true;
        } else {
            z10 = false;
        }
        m0Var3.setIsTonsite(z10);
        m0 m0Var4 = this.f37545h0;
        o3 o3Var6 = this.f37557u0[0];
        if (o3Var6 != null && o3Var6.d()) {
            z11 = true;
        }
        m0Var4.setIsLocal(z11);
        this.T0 = true;
    }

    public final void H(int i10) {
        int color;
        int x02;
        int x03;
        boolean z10;
        float x10;
        ArrayList arrayList = this.f37541d0;
        int size = arrayList.size();
        x3 x3Var = this.K;
        boolean z11 = false;
        if (size <= 1) {
            ArticleViewer$WindowView articleViewer$WindowView = this.f37543f0;
            articleViewer$WindowView.e = false;
            articleViewer$WindowView.d = false;
            l0 l0Var = this.f37544g0;
            if (x3Var != null) {
                x10 = x3Var.I * x3Var.f41730c.getWidth();
            } else {
                x10 = l0Var.getX();
            }
            AnimatorSet animatorSet = new AnimatorSet();
            float measuredWidth = l0Var.getMeasuredWidth() - x10;
            if (x3Var != null) {
                animatorSet.playTogether(x3Var.d(1.0f));
            } else {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.f37544g0, View.TRANSLATION_X, l0Var.getMeasuredWidth()), ObjectAnimator.ofFloat(this.f37543f0, f37515d1, l0Var.getMeasuredWidth()));
            }
            animatorSet.setDuration(Math.max((int) ((420.0f / l0Var.getMeasuredWidth()) * measuredWidth), 250));
            animatorSet.setInterpolator(org.telegram.ui.Components.es.h);
            animatorSet.addListener(new z0(this));
            animatorSet.start();
            this.T0 = true;
            return;
        }
        this.f37543f0.f20868f = true;
        this.f37557u0[1].setVisibility(0);
        this.f37557u0[1].setAlpha(1.0f);
        this.f37557u0[1].setTranslationX(0.0f);
        o3 o3Var = this.f37557u0[0];
        if (x3Var == null) {
            color = 0;
        } else {
            color = this.f37549l0.getColor();
        }
        o3Var.setBackgroundColor(color);
        e0(-1, arrayList.get(i10), true);
        o3 o3Var2 = this.f37557u0[0];
        o3Var2.getX();
        AnimatorSet animatorSet2 = new AnimatorSet();
        o3Var2.getMeasuredWidth();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f37557u0[0], View.TRANSLATION_X, o3Var2.getMeasuredWidth()));
        animatorSet2.setDuration(420L);
        animatorSet2.setInterpolator(org.telegram.ui.Components.es.h);
        animatorSet2.addListener(new a1(this, i10));
        animatorSet2.start();
        m0 m0Var = this.f37545h0;
        o3 o3Var3 = this.f37557u0[0];
        if (o3Var3 != null && SharedConfig.adaptableColorInBrowser) {
            x02 = o3Var3.getBackgroundColor();
        } else {
            x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Pk, false);
        }
        m0Var.setMenuColors(x02);
        m0 m0Var2 = this.f37545h0;
        o3 o3Var4 = this.f37557u0[0];
        if (o3Var4 != null && SharedConfig.adaptableColorInBrowser) {
            x03 = o3Var4.getActionBarColor();
        } else {
            x03 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Pk, false);
        }
        m0Var2.d(x03, true);
        m0 m0Var3 = this.f37545h0;
        o3 o3Var5 = this.f37557u0[0];
        if (o3Var5 != null && o3Var5.e()) {
            z10 = true;
        } else {
            z10 = false;
        }
        m0Var3.setIsTonsite(z10);
        m0 m0Var4 = this.f37545h0;
        o3 o3Var6 = this.f37557u0[0];
        if (o3Var6 != null && o3Var6.d()) {
            z11 = true;
        }
        m0Var4.setIsLocal(z11);
        this.T0 = true;
    }

    public final boolean J() {
        ArrayList arrayList = this.f37541d0;
        if (arrayList.size() <= 0 || !(arrayList.get(0) instanceof TLRPC.WebPage)) {
            return false;
        }
        return true;
    }

    public final void M() {
        this.V = false;
        int i10 = 0;
        while (true) {
            o3[] o3VarArr = this.f37557u0;
            if (i10 < o3VarArr.length) {
                o3VarArr[i10].b();
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
                ((v1) arrayList.get(i11)).a(false);
                i11++;
            } else {
                this.f37544g0.post(new b0(this, 0));
                NotificationCenter.getInstance(this.X).lambda$postNotificationNameOnUIThread$1(NotificationCenter.articleClosed, new Object[0]);
                return;
            }
        }
    }

    public final boolean N(MessageObject messageObject, TLRPC.WebPage webPage, String str, String str2) {
        TLRPC.WebPage webPage2;
        boolean z10;
        int lastIndexOf;
        String substring;
        boolean z11;
        ?? r52;
        String str3;
        int i10;
        String lowerCase;
        TL_iv.Page page;
        if (this.L == null) {
            return false;
        }
        x3 x3Var = this.K;
        if (x3Var == null && this.V) {
            return false;
        }
        org.telegram.ui.ActionBar.m2 m2Var = this.M;
        if (m2Var != null && (m2Var.getParentLayout() instanceof ActionBarLayout)) {
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
                        String str4 = messageObject.messageOwner.message;
                        int i12 = messageEntity.offset;
                        String lowerCase2 = str4.substring(i12, messageEntity.length + i12).toLowerCase();
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
                            substring = lowerCase2.substring(lastIndexOf2 + 1);
                            break;
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
            }
            substring = null;
        } else if (str != null && (lastIndexOf = str.lastIndexOf(35)) != -1) {
            substring = str.substring(lastIndexOf + 1);
            webPage2 = webPage;
            z10 = false;
        } else {
            webPage2 = webPage;
            z10 = false;
            substring = null;
        }
        ArrayList arrayList = this.f37541d0;
        if (x3Var != null && !arrayList.isEmpty()) {
            z11 = z10;
            r52 = 1;
        } else {
            z11 = z10;
            r52 = 0;
        }
        if (r52 == 0) {
            arrayList.clear();
            this.f37544g0.setTranslationX(0.0f);
            if (x3Var != null) {
                x3Var.I = 0.0f;
                x3Var.f41730c.invalidate();
                x3Var.i();
                x3Var.h();
            }
            this.f37544g0.setTranslationY(0.0f);
            this.f37557u0[0].setTranslationY(0.0f);
            this.f37557u0[0].setTranslationX(0.0f);
            this.f37557u0[1].setTranslationX(0.0f);
            this.f37557u0[0].setAlpha(1.0f);
            this.f37543f0.setInnerTranslationX(0.0f);
            this.f37557u0[0].g();
            X(AndroidUtilities.dp(56.0f));
        }
        if (x3Var != null && org.telegram.ui.web.b1.P0) {
            x3Var.f41728a.lock();
        }
        if (webPage2 != null) {
            boolean h = h(webPage2, substring, r52);
            if (!z11) {
                if (!h && substring != null) {
                    str3 = substring;
                } else {
                    str3 = null;
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
                ConnectionsManager.getInstance(i13).sendRequest(tL_messages_getWebPage, new h0(this, i13, webPage2, messageObject, (boolean) r52, str3));
            }
        } else {
            g(r52, str2);
        }
        m0 m0Var = this.f37545h0;
        if (m0Var != null && r52 == 0) {
            m0Var.setIsLocal(this.f37557u0[0].d());
        }
        this.T = null;
        if (x3Var != null) {
            if (r52 == 0) {
                AndroidUtilities.removeFromParent(this.f37543f0);
                x3Var.d = this.f37543f0;
                x3Var.n();
                x3Var.f41730c.addView(this.f37543f0, w7.a6.d(-1.0f, -1));
            }
        } else if (!this.V) {
            WindowManager windowManager = (WindowManager) this.L.getSystemService("window");
            if (this.W) {
                try {
                    windowManager.removeView(this.f37543f0);
                } catch (Exception unused) {
                }
            }
            try {
                WindowManager.LayoutParams layoutParams = this.f37542e0;
                layoutParams.flags = -2013200384;
                if (Build.VERSION.SDK_INT >= 28) {
                    layoutParams.layoutInDisplayCutoutMode = 1;
                }
                this.f37543f0.setFocusable(false);
                this.f37544g0.setFocusable(false);
                windowManager.addView(this.f37543f0, this.f37542e0);
            } catch (Exception e7) {
                FileLog.e(e7);
                return false;
            }
        } else {
            this.f37542e0.flags &= -17;
            ((WindowManager) this.L.getSystemService("window")).updateViewLayout(this.f37543f0, this.f37542e0);
        }
        this.V = true;
        this.Z = 1;
        if (r52 == 0) {
            if (x3Var != null) {
                if (r52 != 0) {
                    x3Var.f41728a.unlock();
                } else if (!x3Var.h) {
                    x3Var.g(x3Var.f41729b);
                    x3Var.f();
                }
            } else {
                this.f37543f0.setAlpha(0.0f);
                this.f37544g0.setAlpha(0.0f);
                AnimatorSet animatorSet = new AnimatorSet();
                ArticleViewer$WindowView articleViewer$WindowView = this.f37543f0;
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(articleViewer$WindowView, property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f37544g0, property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f37543f0, View.TRANSLATION_X, AndroidUtilities.dp(56.0f), 0.0f));
                this.f37537a0 = new b0(this, 1);
                animatorSet.setDuration(150L);
                animatorSet.setInterpolator(this.f37540c0);
                animatorSet.addListener(new t0(this));
                this.f37539b0 = System.currentTimeMillis();
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.j(17, this, animatorSet));
            }
        }
        this.f37544g0.setLayerType(2, null);
        return true;
    }

    public final void P(long j10, TLRPC.User user) {
        if (user != null && (this.L instanceof LaunchActivity)) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f19363id);
            bundle.putString("botUser", "webpage" + j10);
            ((LaunchActivity) this.L).q0(new fo(bundle), false, true);
            o(false, true);
        }
    }

    public final void Q(String str, String str2, k0 k0Var) {
        Activity activity = this.L;
        if (activity != null && !activity.isFinishing()) {
            o3 o3Var = this.f37557u0[0];
            if (o3Var != null && o3Var.d()) {
                String string = LocaleController.getString(R.string.OpenUrlAlert2);
                int indexOf = string.indexOf("%");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(String.format(string, str));
                if (indexOf >= 0) {
                    spannableStringBuilder.setSpan(new URLSpan(str), indexOf, str.length() + indexOf, 33);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.L, 0, null);
                String string2 = LocaleController.getString(R.string.OpenUrlTitle);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
                a2Var.R = string2;
                a2Var.T = spannableStringBuilder;
                a2Var.f19568f0 = false;
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.Open), new a1.d(this, str, str2, k0Var, 3));
                alertDialog$Builder.o();
                return;
            }
            R(str, str2, k0Var);
        }
    }

    public final void R(String str, String str2, pf.c cVar) {
        x3 x3Var;
        pf.c cVar2 = this.M0;
        if (cVar2 != null) {
            cVar2.a(false);
        }
        this.M0 = cVar;
        if (this.F0 != 0) {
            ConnectionsManager.getInstance(this.X).cancelRequest(this.F0, false);
            this.F0 = 0;
        }
        boolean[] zArr = new boolean[1];
        if (pf.d.l(this.L, str, false)) {
            if (this.f37541d0.isEmpty() && (x3Var = this.K) != null) {
                x3Var.dismiss(false);
                return;
            }
            return;
        }
        g0 g0Var = new g0(this, str, zArr, cVar);
        int i10 = this.H0 + 1;
        this.H0 = i10;
        b0(true);
        TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
        tL_messages_getWebPage.url = str;
        tL_messages_getWebPage.hash = 0;
        this.F0 = ConnectionsManager.getInstance(this.X).sendRequest(tL_messages_getWebPage, new org.telegram.messenger.ni(this, i10, cVar, str2, g0Var, tL_messages_getWebPage));
        if (cVar != null) {
            cVar.f43197b = new ah.o(this, i10, cVar, 24);
            cVar.d();
        }
    }

    public final void S() {
        int x02;
        int x03;
        TextView textView = this.B0;
        if (textView != null) {
            textView.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19990i6, false), 2, -1));
            this.B0.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.E8, false));
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.A0;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.G8, false));
        }
        ImageView imageView = this.f37554r0;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.G6, false), PorterDuff.Mode.MULTIPLY));
            this.f37554r0.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20307z8, false), 1, -1));
        }
        ImageView imageView2 = this.f37555s0;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.G6, false), PorterDuff.Mode.MULTIPLY));
            this.f37555s0.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20307z8, false), 1, -1));
        }
        org.telegram.ui.Components.s6 s6Var = this.f37556t0;
        if (s6Var != null) {
            s6Var.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.G6, false));
        }
        m0 m0Var = this.f37545h0;
        if (m0Var != null) {
            o3 o3Var = this.f37557u0[0];
            if (o3Var != null && SharedConfig.adaptableColorInBrowser) {
                x02 = o3Var.getBackgroundColor();
            } else {
                x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Pk, false);
            }
            m0Var.setMenuColors(x02);
            m0 m0Var2 = this.f37545h0;
            o3 o3Var2 = this.f37557u0[0];
            if (o3Var2 != null && SharedConfig.adaptableColorInBrowser) {
                x03 = o3Var2.getActionBarColor();
            } else {
                x03 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Pk, false);
            }
            m0Var2.d(x03, true);
        }
        this.f37549l0.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Pk, false));
    }

    public final void U() {
        int L0;
        int i10;
        boolean z10 = false;
        o3 o3Var = this.f37557u0[0];
        if (o3Var.f38848c.E != null && (L0 = o3Var.d.L0()) != -1) {
            View m10 = this.f37557u0[0].d.m(L0);
            if (m10 != null) {
                i10 = m10.getTop();
            } else {
                i10 = 0;
            }
            String str = "article" + this.f37557u0[0].f38848c.E.f19369id;
            SharedPreferences.Editor putInt = ApplicationLoader.applicationContext.getSharedPreferences("articles", 0).edit().putInt(str, L0).putInt(str + "o", i10);
            String u10 = t8.b.u(str, "r");
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                z10 = true;
            }
            putInt.putBoolean(u10, z10).commit();
        }
    }

    public final boolean V(String str, boolean z10) {
        String lowerCase;
        int i10;
        Integer num = 0;
        if (!TextUtils.isEmpty(str)) {
            String lowerCase2 = str.toLowerCase();
            Integer num2 = (Integer) this.f37557u0[0].f38848c.h.get(lowerCase2);
            if (num2 != null) {
                TL_iv.textAnchor textanchor = (TL_iv.textAnchor) this.f37557u0[0].f38848c.f37024r.get(lowerCase2);
                if (textanchor != null) {
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    if (!TextUtils.isEmpty(this.f37557u0[0].f38848c.E.cached_page.url)) {
                        lowerCase = this.f37557u0[0].f38848c.E.cached_page.url.toLowerCase();
                    } else {
                        lowerCase = this.f37557u0[0].f38848c.E.url.toLowerCase();
                    }
                    pageblockparagraph.text = org.telegram.ui.web.h2.d(textanchor.text, lowerCase, lowerCase2);
                    this.f37557u0[0].f38848c.getClass();
                    int I = i4.I(pageblockparagraph);
                    s4.b1 x10 = this.f37557u0[0].f38848c.x(null, I);
                    View view = x10.f44838a;
                    this.f37557u0[0].f38848c.H(I, x10, pageblockparagraph, 0, 0, false);
                    org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(1, (Context) this.L, (org.telegram.ui.ActionBar.c6) null, false);
                    e3Var.fixNavigationBar();
                    e3Var.applyTopPadding = false;
                    e3Var.applyBottomPadding = false;
                    LinearLayout linearLayout = new LinearLayout(this.L);
                    linearLayout.setOrientation(1);
                    org.telegram.ui.Cells.o9 o9Var = new org.telegram.ui.Cells.o9();
                    this.P0 = o9Var;
                    o9Var.S(linearLayout);
                    this.P0.D = new bi.i3(this, 1);
                    bi.f4 f4Var = new bi.f4(this.L, 4);
                    f4Var.setTextSize(1, 16.0f);
                    f4Var.setTypeface(AndroidUtilities.bold());
                    f4Var.setText(LocaleController.getString(R.string.InstantViewReference));
                    if (this.f37557u0[0].f38848c.G) {
                        i10 = 5;
                    } else {
                        i10 = 3;
                    }
                    f4Var.setGravity(i10 | 16);
                    f4Var.setTextColor(b());
                    f4Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                    linearLayout.addView(f4Var, new LinearLayout.LayoutParams(-1, AndroidUtilities.dp(48.0f) + 1));
                    view.setTag("bottomSheet");
                    linearLayout.addView(view, w7.a6.k(0.0f, 7.0f, 0.0f, 0.0f, -1, -2));
                    org.telegram.ui.Cells.aa n10 = this.P0.n(this.L);
                    ah.v vVar = new ah.v(this, this.L, linearLayout, 6);
                    e3Var.setDelegate(new i0(this, 0));
                    vVar.addView(linearLayout, -1, -2);
                    vVar.addView(n10, -1, -2);
                    e3Var.customView = vVar;
                    if (this.O0.x()) {
                        this.O0.f(false);
                    }
                    this.I = e3Var;
                    a0(e3Var);
                    return true;
                } else if (num2.intValue() >= 0 && num2.intValue() < this.f37557u0[0].f38848c.e.size()) {
                    TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) this.f37557u0[0].f38848c.e.get(num2.intValue());
                    TL_iv.PageBlock z11 = z(pageBlock);
                    if ((z11 instanceof y3) && O((y3) z11)) {
                        this.f37557u0[0].f38848c.M();
                        this.f37557u0[0].f38848c.l();
                    }
                    int indexOf = this.f37557u0[0].f38848c.d.indexOf(pageBlock);
                    if (indexOf != -1) {
                        num2 = Integer.valueOf(indexOf);
                    }
                    Integer num3 = (Integer) this.f37557u0[0].f38848c.f37023n.get(lowerCase2);
                    if (num3 != null) {
                        if (num3.intValue() == -1) {
                            this.f37557u0[0].f38848c.getClass();
                            int I2 = i4.I(pageBlock);
                            s4.b1 x11 = this.f37557u0[0].f38848c.x(null, I2);
                            this.f37557u0[0].f38848c.H(I2, x11, pageBlock, 0, 0, false);
                            x11.f44838a.measure(View.MeasureSpec.makeMeasureSpec(this.f37557u0[0].f38847b.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                            Integer num4 = (Integer) this.f37557u0[0].f38848c.f37023n.get(lowerCase2);
                            if (num4.intValue() != -1) {
                                num = num4;
                            }
                        } else {
                            num = num3;
                        }
                    }
                    if (this.f37557u0[0].f38848c.H) {
                        num2 = Integer.valueOf(num2.intValue() + 1);
                    }
                    if (z10) {
                        org.telegram.ui.Components.xw0 xw0Var = new org.telegram.ui.Components.xw0(this.f37557u0[0].getContext());
                        xw0Var.f44979a = num2.intValue();
                        xw0Var.f31402s = (-AndroidUtilities.dp(56.0f)) - num.intValue();
                        this.f37557u0[0].d.w0(xw0Var);
                        return true;
                    }
                    this.f37557u0[0].d.h1(num2.intValue(), (-AndroidUtilities.dp(56.0f)) - num.intValue());
                    return true;
                }
            }
        }
        return false;
    }

    public final void W(int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.k4.W(int):void");
    }

    public final void X(int i10) {
        m0 m0Var = this.f37545h0;
        if (m0Var != null && !m0Var.T && !m0Var.W) {
            int clamp = Utilities.clamp(i10, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(24.0f));
            this.I0 = clamp;
            this.f37545h0.setHeight(clamp);
            this.O0.f20992x = this.I0;
            int i11 = 0;
            while (true) {
                o3[] o3VarArr = this.f37557u0;
                if (i11 < o3VarArr.length) {
                    o3VarArr[i11].f38847b.setTopGlowOffset(this.I0);
                    i11++;
                } else {
                    return;
                }
            }
        }
    }

    public final void Y(Activity activity, org.telegram.ui.ActionBar.m2 m2Var) {
        nb0 nb0Var;
        int i10;
        boolean z10;
        int x02;
        int i11;
        int i12;
        x3 x3Var;
        nb0 nb0Var2 = this.U0;
        if (nb0Var2 != null) {
            nb0Var2.destroy();
            this.U0 = null;
        }
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            nb0Var = new nb0(launchActivity, true);
        } else {
            nb0Var = null;
        }
        this.U0 = nb0Var;
        this.M = m2Var;
        if (!(m2Var instanceof lz)) {
            i10 = m2Var.getCurrentAccount();
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
        if (activity2 != activity && (activity2 == null || !this.J || (x3Var = this.K) == null || x3Var.e == null)) {
            this.L = activity;
            this.f42500a = ApplicationLoader.applicationContext.getSharedPreferences("articles", 0).getInt("font_type", 0);
            r(this, false);
            this.f37549l0 = new Paint();
            this.m0 = activity.getResources().getDrawable(R.drawable.layer_shadow);
            this.f37550n0 = new Paint();
            ArticleViewer$WindowView articleViewer$WindowView = new ArticleViewer$WindowView(this, activity);
            this.f37543f0 = articleViewer$WindowView;
            articleViewer$WindowView.setWillNotDraw(false);
            this.f37543f0.setClipChildren(true);
            this.f37543f0.setFocusable(false);
            l0 l0Var = new l0(this, activity, 0);
            this.f37544g0 = l0Var;
            this.f37543f0.addView(l0Var, w7.a6.e(-1, -1, 51));
            if (this.K == null) {
                this.f37543f0.setFitsSystemWindows(true);
                this.f37544g0.setOnApplyWindowInsetsListener(new org.telegram.ui.ActionBar.f3(1));
            }
            FrameLayout frameLayout = new FrameLayout(activity);
            this.P = frameLayout;
            frameLayout.setBackgroundColor(-16777216);
            this.P.setVisibility(4);
            this.f37543f0.addView(this.P, w7.a6.d(-1.0f, -1));
            n4 n4Var = new n4(activity);
            this.R = n4Var;
            n4Var.setVisibility(0);
            this.R.setBackgroundColor(-16777216);
            this.P.addView(this.R, w7.a6.e(-1, -1, 17));
            this.Q = new TextureView(activity);
            this.f37557u0 = new o3[2];
            int i13 = 0;
            while (true) {
                o3[] o3VarArr = this.f37557u0;
                if (i13 >= o3VarArr.length) {
                    break;
                }
                o3 o3Var = new o3(this, activity);
                o3VarArr[i13] = o3Var;
                if (i13 == 0) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                o3Var.setVisibility(i12);
                this.f37544g0.addView(o3Var, w7.a6.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 119));
                o3Var.f38847b.setOnItemLongClickListener(new t(this));
                o3Var.f38847b.setOnItemClickListener(new m4.z0(4, this, o3Var));
                i13++;
            }
            this.f37544g0.addView(new FrameLayout(activity), w7.a6.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 119));
            this.f37559w0.setColor(-16777216);
            this.f37560x0.setColor(-16777216);
            this.f37562z0.setColor(-14408666);
            this.f37561y0.setColor(-16777216);
            m0 m0Var = new m0(this, activity);
            this.f37545h0 = m0Var;
            if (this.K != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            m0Var.f41507e0 = z10;
            this.f37544g0.addView(m0Var, w7.a6.e(-1, -2, 48));
            this.f37545h0.setOnClickListener(new bi.u1(22, this, activity));
            this.f37545h0.f41503b0.addTextChangedListener(new n0(this, 0));
            org.telegram.ui.web.k kVar = new org.telegram.ui.web.k(activity);
            this.f37546i0 = kVar;
            kVar.setOpenProgress(0.0f);
            this.f37546i0.f41408w.j(new k3(this, 2));
            this.f37544g0.addView(this.f37546i0, w7.a6.d(-1.0f, -1));
            this.f37547j0 = new b0(this, 3);
            this.f37545h0.L.setOnClickListener(new s(this, 2));
            this.f37545h0.L.setOnLongClickListener(new u(this, 0));
            this.f37545h0.setMenuListener(new bi.v2(27, this, activity));
            this.f37545h0.O.setOnClickListener(new s(this, 3));
            bi.i5 i5Var = new bi.i5(this.L, 6);
            this.f37553q0 = i5Var;
            i5Var.setOnTouchListener(new ci.d(3));
            this.f37553q0.setWillNotDraw(false);
            this.f37553q0.setTranslationY(AndroidUtilities.dp(51.0f));
            this.f37553q0.setVisibility(4);
            this.f37553q0.setFocusable(true);
            this.f37553q0.setFocusableInTouchMode(true);
            this.f37553q0.setClickable(true);
            this.f37553q0.setPadding(0, AndroidUtilities.dp(3.0f), 0, 0);
            this.f37544g0.addView(this.f37553q0, w7.a6.e(-1, 51, 80));
            new di.h4(this.f37543f0, false, new r(this, 0));
            ImageView imageView = new ImageView(this.L);
            this.f37554r0 = imageView;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            this.f37554r0.setImageResource(R.drawable.msg_go_up);
            ImageView imageView2 = this.f37554r0;
            int i14 = org.telegram.ui.ActionBar.g6.G6;
            int x03 = org.telegram.ui.ActionBar.g6.x0(null, i14, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            imageView2.setColorFilter(new PorterDuffColorFilter(x03, mode));
            ImageView imageView3 = this.f37554r0;
            int i15 = org.telegram.ui.ActionBar.g6.f20307z8;
            imageView3.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.x0(null, i15, false), 1, -1));
            this.f37553q0.addView(this.f37554r0, w7.a6.a(48.0f, 0.0f, 0.0f, 48.0f, 0.0f, 48, 53));
            this.f37554r0.setOnClickListener(new s(this, 0));
            this.f37554r0.setContentDescription(LocaleController.getString(R.string.AccDescrSearchNext));
            ImageView imageView4 = new ImageView(this.L);
            this.f37555s0 = imageView4;
            imageView4.setScaleType(scaleType);
            this.f37555s0.setImageResource(R.drawable.msg_go_down);
            this.f37555s0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, i14, false), mode));
            this.f37555s0.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.x0(null, i15, false), 1, -1));
            this.f37553q0.addView(this.f37555s0, w7.a6.a(48.0f, 0.0f, 0.0f, 0.0f, 0.0f, 48, 53));
            this.f37555s0.setOnClickListener(new s(this, 1));
            this.f37555s0.setContentDescription(LocaleController.getString(R.string.AccDescrSearchPrev));
            org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(this.L, true, true, true);
            this.f37556t0 = s6Var;
            s6Var.setScaleProperty(0.6f);
            this.f37556t0.b(0.4f, 350L, org.telegram.ui.Components.es.h);
            this.f37556t0.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i14, false));
            this.f37556t0.setTextSize(AndroidUtilities.dp(15.0f));
            this.f37556t0.setTypeface(AndroidUtilities.bold());
            this.f37556t0.setGravity(3);
            this.f37556t0.getDrawable().M = AndroidUtilities.displaySize.x;
            this.f37553q0.addView(this.f37556t0, w7.a6.a(-2.0f, 18.0f, 0.0f, 108.0f, 0.0f, -2, 19));
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.f37542e0 = layoutParams;
            layoutParams.height = -1;
            layoutParams.format = -3;
            layoutParams.width = -1;
            layoutParams.gravity = 51;
            layoutParams.type = 98;
            layoutParams.softInputMode = 48;
            layoutParams.flags = 131072;
            if (this.K == null) {
                x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19843a7, true);
            } else {
                x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19843a7, false);
            }
            if (AndroidUtilities.computePerceivedBrightness(x02) >= 0.721f && Build.VERSION.SDK_INT >= 26) {
                i11 = 1808;
            } else {
                i11 = 1792;
            }
            this.f37561y0.setColor(x02);
            WindowManager.LayoutParams layoutParams2 = this.f37542e0;
            layoutParams2.systemUiVisibility = i11;
            layoutParams2.flags |= -2147417856;
            if (Build.VERSION.SDK_INT >= 28) {
                layoutParams2.layoutInDisplayCutoutMode = 1;
            }
            org.telegram.ui.Cells.o9 o9Var = new org.telegram.ui.Cells.o9();
            this.O0 = o9Var;
            o9Var.S(this.f37557u0[0].f38847b);
            if (MessagesController.getInstance(this.X).getTranslateController().isContextTranslateEnabled()) {
                this.O0.f20977k0 = new t(this);
            }
            org.telegram.ui.Cells.o9 o9Var2 = this.O0;
            o9Var2.f21647z0 = this.f37557u0[0].d;
            o9Var2.D = new q0(this);
            this.f37544g0.addView(o9Var2.n(activity));
            l0 l0Var2 = this.f37544g0;
            wv0 wv0Var = new wv0(l0Var2, l0Var2);
            this.Q0 = wv0Var;
            wv0Var.F = new t(this);
            wv0Var.E = new g(this, 1);
            this.f37549l0.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Pk, false));
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
        org.telegram.ui.ActionBar.e3 e3Var = this.I;
        if (e3Var != null) {
            e3Var.dismiss();
            this.I = null;
        }
        org.telegram.ui.ActionBar.e3 e3Var2 = new org.telegram.ui.ActionBar.e3(1, (Context) this.L, (org.telegram.ui.ActionBar.c6) null, false);
        e3Var2.fixNavigationBar();
        try {
            str2 = URLDecoder.decode(str.replaceAll("\\+", "%2b"), "UTF-8");
        } catch (Exception e) {
            FileLog.e(e);
            str2 = str;
        }
        e3Var2.title = str2;
        e3Var2.bigTitle = false;
        e3Var2.multipleLinesTitle = true;
        CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
        mg.j jVar = new mg.j(1, this, str);
        e3Var2.items = charSequenceArr;
        e3Var2.onClickListener = jVar;
        e3Var2.setOnHideListener(new v(this, 0));
        a0(e3Var2);
    }

    @Override
    public final int a() {
        return org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20288y6, false);
    }

    public final void a0(org.telegram.ui.ActionBar.e3 e3Var) {
        if (this.L != null) {
            try {
                org.telegram.ui.ActionBar.e3 e3Var2 = this.f37548k0;
                if (e3Var2 != null) {
                    e3Var2.dismiss();
                    this.f37548k0 = null;
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            try {
                this.f37548k0 = e3Var;
                e3Var.setCanceledOnTouchOutside(true);
                this.f37548k0.setOnDismissListener(new v(this, 1));
                e3Var.show();
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
    }

    @Override
    public final int b() {
        return org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.G6, false);
    }

    public final void b0(boolean z10) {
        AndroidUtilities.cancelRunOnUIThread(this.f37547j0);
        if (z10) {
            this.f37545h0.f41506d0.a(0.0f, false);
            this.f37545h0.f41506d0.a(0.3f, true);
            AndroidUtilities.runOnUIThread(this.f37547j0, 100L);
            return;
        }
        this.f37545h0.f41506d0.a(1.0f, true);
    }

    @Override
    public final void c(i4 i4Var, org.telegram.ui.Components.l11 l11Var) {
        String str;
        String str2;
        org.telegram.ui.Components.ea0 ea0Var;
        String lowerCase;
        if (l11Var != null && (str = l11Var.f26910b) != null) {
            org.telegram.ui.ActionBar.e3 e3Var = this.I;
            k0 k0Var = null;
            if (e3Var != null) {
                e3Var.dismiss();
                this.I = null;
            }
            int lastIndexOf = str.lastIndexOf(35);
            boolean z10 = false;
            if (lastIndexOf != -1) {
                if (!TextUtils.isEmpty(i4Var.E.cached_page.url)) {
                    lowerCase = i4Var.E.cached_page.url.toLowerCase();
                } else {
                    lowerCase = i4Var.E.url.toLowerCase();
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
                d3 d3Var = this.d;
                if (d3Var != null && (ea0Var = this.f42501b) != null) {
                    k0Var = new k0(this, d3Var, ea0Var);
                }
                Q(str, str2, k0Var);
            }
        }
    }

    public final void c0() {
        LaunchActivity launchActivity;
        FrameLayout frameLayout;
        if (this.W && (launchActivity = LaunchActivity.G1) != null && !launchActivity.isFinishing()) {
            if (this.f37557u0[0].f()) {
                if (this.f37557u0[0].getWebView() != null) {
                    frameLayout = this.f37557u0[0].f38849f;
                } else {
                    return;
                }
            } else {
                o3 o3Var = this.f37557u0[0];
                TLRPC.WebPage webPage = o3Var.f38848c.E;
                frameLayout = o3Var;
                if (webPage == null) {
                    return;
                }
            }
            new org.telegram.ui.Components.zc(frameLayout, null).G(R.raw.chats_infotip, 4, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BrowserExternalRestricted), new b0(this, 10))).k(true);
        }
    }

    @Override
    public final boolean d(TL_iv.PageBlock pageBlock, i4 i4Var) {
        int indexOf;
        List list;
        org.telegram.ui.ActionBar.m2 m2Var = this.M;
        if (m2Var != null && m2Var.getParentActivity() != null) {
            if ((pageBlock instanceof TL_iv.pageBlockVideo) && !h4.g(i4Var.E, pageBlock)) {
                list = Collections.singletonList(pageBlock);
                indexOf = 0;
            } else {
                ArrayList arrayList = new ArrayList(i4Var.f37022f);
                indexOf = i4Var.f37022f.indexOf(pageBlock);
                list = arrayList;
            }
            PhotoViewer t12 = PhotoViewer.t1();
            t12.K2(null, this.M, null);
            if (t12.f2(null, null, null, null, null, null, null, indexOf, new h3(this, list), null, 0L, 0L, 0L, true, new q3(this, i4Var.E, list), null)) {
                n();
                return true;
            }
        }
        return false;
    }

    public final void d0(boolean z10) {
        float f7;
        this.f37553q0.setVisibility(0);
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
        this.X0.addListener(new ah.p0(20, this, z10));
        this.X0.setDuration(320L);
        this.X0.setInterpolator(org.telegram.ui.Components.es.h);
        this.X0.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        c1 c1Var;
        MessageObject messageObject;
        if (i10 == NotificationCenter.messagePlayingDidStart) {
            MessageObject messageObject2 = (MessageObject) objArr[0];
            if (this.f37557u0 != null) {
                int i12 = 0;
                while (true) {
                    o3[] o3VarArr = this.f37557u0;
                    if (i12 < o3VarArr.length) {
                        int childCount = o3VarArr[i12].f38847b.getChildCount();
                        for (int i13 = 0; i13 < childCount; i13++) {
                            View childAt = this.f37557u0[i12].f38847b.getChildAt(i13);
                            if (childAt instanceof c1) {
                                ((c1) childAt).a(true);
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
                if (this.f37557u0 != null) {
                    int i14 = 0;
                    while (true) {
                        o3[] o3VarArr2 = this.f37557u0;
                        if (i14 < o3VarArr2.length) {
                            int childCount2 = o3VarArr2[i14].f38847b.getChildCount();
                            int i15 = 0;
                            while (true) {
                                if (i15 < childCount2) {
                                    View childAt2 = this.f37557u0[i14].f38847b.getChildAt(i15);
                                    if ((childAt2 instanceof c1) && (messageObject = (c1Var = (c1) childAt2).getMessageObject()) != null && messageObject.getId() == num.intValue()) {
                                        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                                        if (playingMessageObject != null) {
                                            messageObject.audioProgress = playingMessageObject.audioProgress;
                                            messageObject.audioProgressSec = playingMessageObject.audioProgressSec;
                                            messageObject.audioPlayerDuration = playingMessageObject.audioPlayerDuration;
                                            c1Var.b();
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
            } else if (i10 == NotificationCenter.emojiLoaded && this.f37557u0 != null) {
                int i16 = 0;
                while (true) {
                    o3[] o3VarArr3 = this.f37557u0;
                    if (i16 < o3VarArr3.length) {
                        int childCount3 = o3VarArr3[i16].f38847b.getChildCount();
                        for (int i17 = 0; i17 < childCount3; i17++) {
                            View childAt3 = this.f37557u0[i16].f38847b.getChildAt(i17);
                            if (childAt3 instanceof w2) {
                                ((w2) childAt3).e.invalidate();
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
        } else if (this.f37557u0 != null) {
            int i18 = 0;
            while (true) {
                o3[] o3VarArr4 = this.f37557u0;
                if (i18 < o3VarArr4.length) {
                    int childCount4 = o3VarArr4[i18].f38847b.getChildCount();
                    for (int i19 = 0; i19 < childCount4; i19++) {
                        View childAt4 = this.f37557u0[i18].f38847b.getChildAt(i19);
                        if (childAt4 instanceof c1) {
                            c1 c1Var2 = (c1) childAt4;
                            if (c1Var2.getMessageObject() != null) {
                                c1Var2.a(true);
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
        int x02;
        int x03;
        boolean z11;
        boolean z12;
        if (obj != null) {
            if (((obj instanceof TLRPC.WebPage) && ((TLRPC.WebPage) obj).cached_page != null) || (obj instanceof b3)) {
                int i14 = 1;
                if (!z10 && i10 != 0) {
                    o3[] o3VarArr = this.f37557u0;
                    o3 o3Var = o3VarArr[1];
                    o3VarArr[1] = o3VarArr[0];
                    o3VarArr[0] = o3Var;
                    this.f37545h0.i();
                    this.Z0.a(this.f37557u0[0].getBackgroundColor(), true);
                    this.f37538a1.a(this.f37557u0[1].getBackgroundColor(), true);
                    x3 x3Var = this.K;
                    if (x3Var != null) {
                        x3Var.m();
                    }
                    int indexOfChild = this.f37544g0.indexOfChild(this.f37557u0[0]);
                    int indexOfChild2 = this.f37544g0.indexOfChild(this.f37557u0[1]);
                    if (i10 == 1) {
                        if (indexOfChild < indexOfChild2) {
                            this.f37544g0.removeView(this.f37557u0[0]);
                            this.f37544g0.addView(this.f37557u0[0], indexOfChild2);
                        }
                    } else if (indexOfChild2 < indexOfChild) {
                        this.f37544g0.removeView(this.f37557u0[0]);
                        this.f37544g0.addView(this.f37557u0[0], indexOfChild);
                    }
                    this.f37558v0 = new AnimatorSet();
                    this.f37557u0[0].setVisibility(0);
                    if (i10 == 1) {
                        i13 = 0;
                    } else {
                        i13 = 1;
                    }
                    o3 o3Var2 = this.f37557u0[i13];
                    if (this.K == null) {
                        color = 0;
                    } else {
                        color = this.f37549l0.getColor();
                    }
                    o3Var2.setBackgroundColor(color);
                    this.f37557u0[i13].setLayerType(2, null);
                    if (i10 == 1) {
                        this.f37557u0[0].setTranslationX(AndroidUtilities.displaySize.x);
                        this.f37558v0.playTogether(ObjectAnimator.ofFloat(this.f37557u0[0], View.TRANSLATION_X, AndroidUtilities.displaySize.x, 0.0f));
                    } else if (i10 == -1) {
                        this.f37557u0[0].setTranslationX(0.0f);
                        this.f37558v0.playTogether(ObjectAnimator.ofFloat(this.f37557u0[1], View.TRANSLATION_X, 0.0f, AndroidUtilities.displaySize.x));
                    }
                    this.f37558v0.setDuration(320L);
                    this.f37558v0.setInterpolator(org.telegram.ui.Components.es.h);
                    this.f37558v0.addListener(new w0(this, i13, 0));
                    this.f37543f0.f20868f = true;
                    m0 m0Var = this.f37545h0;
                    o3 o3Var3 = this.f37557u0[0];
                    if (o3Var3 != null && SharedConfig.adaptableColorInBrowser) {
                        x02 = o3Var3.getBackgroundColor();
                    } else {
                        x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Pk, false);
                    }
                    m0Var.setMenuColors(x02);
                    m0 m0Var2 = this.f37545h0;
                    o3 o3Var4 = this.f37557u0[0];
                    if (o3Var4 != null && SharedConfig.adaptableColorInBrowser) {
                        x03 = o3Var4.getActionBarColor();
                    } else {
                        x03 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Pk, false);
                    }
                    m0Var2.d(x03, true);
                    m0 m0Var3 = this.f37545h0;
                    o3 o3Var5 = this.f37557u0[0];
                    if (o3Var5 != null && o3Var5.e()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    m0Var3.setIsTonsite(z11);
                    m0 m0Var4 = this.f37545h0;
                    o3 o3Var6 = this.f37557u0[0];
                    if (o3Var6 != null && o3Var6.d()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    m0Var4.setIsLocal(z12);
                    AnimatorSet animatorSet = this.f37558v0;
                    Objects.requireNonNull(animatorSet);
                    AndroidUtilities.runOnUIThread(new tu0(animatorSet, 4));
                }
                if (!z10) {
                    this.O0.f(true);
                }
                i4 i4Var = this.f37557u0[z10 ? 1 : 0].f38848c;
                if (z10) {
                    obj = i2.d.g(2, this.f37541d0);
                }
                this.f37557u0[z10 ? 1 : 0].b();
                if (obj instanceof TLRPC.WebPage) {
                    TLRPC.WebPage webPage = (TLRPC.WebPage) obj;
                    this.f37557u0[z10 ? 1 : 0].setWeb(null);
                    this.f37557u0[z10 ? 1 : 0].setType(0);
                    TL_iv.Page page = webPage.cached_page;
                    i4Var.G = page.rtl;
                    i4Var.E = webPage;
                    int size = page.blocks.size();
                    for (int i15 = 0; i15 < size; i15++) {
                        TL_iv.PageBlock pageBlock = webPage.cached_page.blocks.get(i15);
                        if (i15 == 0) {
                            pageBlock.first = true;
                            if (pageBlock instanceof TL_iv.pageBlockCover) {
                                TL_iv.pageBlockCover pageblockcover = (TL_iv.pageBlockCover) pageBlock;
                                TL_iv.RichText w9 = w(0, pageblockcover);
                                TL_iv.RichText w10 = w(1, pageblockcover);
                                if (((w9 != null && !(w9 instanceof TL_iv.textEmpty)) || (w10 != null && !(w10 instanceof TL_iv.textEmpty))) && size > 1) {
                                    TL_iv.PageBlock pageBlock2 = webPage.cached_page.blocks.get(1);
                                    if (pageBlock2 instanceof TL_iv.pageBlockChannel) {
                                        i4Var.F = (TL_iv.pageBlockChannel) pageBlock2;
                                    }
                                }
                            }
                        } else if (i15 == 1 && i4Var.F != null) {
                        }
                        if (i15 == size - 1) {
                            i12 = i15;
                        } else {
                            i12 = 0;
                        }
                        i4Var.F(i4Var, pageBlock, 0, 0, i12);
                    }
                    i4Var.l();
                    if (this.f37541d0.size() != 1 && i10 != -1) {
                        s4.b0 b0Var = this.f37557u0[z10 ? 1 : 0].d;
                        x3 x3Var2 = this.K;
                        if (x3Var2 == null) {
                            i14 = 0;
                        }
                        if (x3Var2 != null) {
                            i11 = AndroidUtilities.dp(32.0f);
                        } else {
                            i11 = 0;
                        }
                        b0Var.h1(i14, i11);
                    } else {
                        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("articles", 0);
                        String str = "article" + webPage.f19369id;
                        int i16 = sharedPreferences.getInt(str, -1);
                        boolean z13 = sharedPreferences.getBoolean(str + "r", true);
                        Point point = AndroidUtilities.displaySize;
                        if (point.x <= point.y) {
                            i14 = 0;
                        }
                        if (z13 == i14) {
                            dp = sharedPreferences.getInt(str + "o", 0) - this.f37557u0[z10 ? 1 : 0].f38847b.getPaddingTop();
                        } else {
                            dp = AndroidUtilities.dp(10.0f);
                        }
                        if (i16 != -1) {
                            this.f37557u0[z10 ? 1 : 0].d.h1(i16, dp);
                        }
                    }
                } else if (obj instanceof b3) {
                    this.f37557u0[z10 ? 1 : 0].setType(1);
                    this.f37557u0[z10 ? 1 : 0].g();
                    this.f37557u0[z10 ? 1 : 0].setWeb((b3) obj);
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
        o3[] o3VarArr;
        o3 o3Var;
        float translationX;
        boolean z10;
        boolean z11;
        o3 o3Var2;
        float f7;
        boolean z12;
        boolean z13;
        if (this.f37545h0 != null && (o3Var = (o3VarArr = this.f37557u0)[0]) != null && o3VarArr[1] != null) {
            int visibility = o3Var.getVisibility();
            float f10 = 0.0f;
            if (visibility != 0) {
                translationX = 0.0f;
            } else {
                translationX = 1.0f - (this.f37557u0[0].getTranslationX() / this.f37557u0[0].getWidth());
            }
            float f11 = 1.0f - translationX;
            m0 m0Var = this.f37545h0;
            m0Var.d[0] = this.f37557u0[0].getProgress();
            m0Var.invalidate();
            m0 m0Var2 = this.f37545h0;
            m0Var2.d[1] = this.f37557u0[1].getProgress();
            m0Var2.invalidate();
            this.f37545h0.setTransitionProgress(f11);
            m0 m0Var3 = this.f37545h0;
            if (!m0Var3.W && !m0Var3.T) {
                ArticleViewer$WindowView articleViewer$WindowView = this.f37543f0;
                if (articleViewer$WindowView.e || articleViewer$WindowView.f20868f) {
                    boolean J = J();
                    ArrayList arrayList = this.f37541d0;
                    if (!J && arrayList.size() <= 1) {
                        this.f37545h0.P.f();
                        this.f37545h0.setBackButtonCached(false);
                    } else {
                        if (!this.f37557u0[0].f38852s && arrayList.size() <= 1) {
                            f7 = 0.0f;
                        } else {
                            f7 = 1.0f;
                        }
                        if (this.f37557u0[1].f38852s || arrayList.size() > 2) {
                            f10 = 1.0f;
                        }
                        float lerp = AndroidUtilities.lerp(f7, f10, f11);
                        this.f37545h0.M.c(1.0f - lerp, false);
                        this.f37545h0.P.f();
                        m0 m0Var4 = this.f37545h0;
                        if (lerp > 0.5f) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        m0Var4.setBackButtonCached(z12);
                    }
                    this.f37545h0.setHasForward(this.f37557u0[0].v);
                    this.f37545h0.setIsLocal(this.f37557u0[0].d());
                    m0 m0Var5 = this.f37545h0;
                    if (this.f37557u0[0].getWebView() != null && this.f37557u0[0].getWebView().f41561b) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    m0Var5.setIsLoaded(z13);
                }
            }
            m0 m0Var6 = this.f37545h0;
            int actionBarColor = this.f37557u0[0].getActionBarColor();
            ArticleViewer$WindowView articleViewer$WindowView2 = this.f37543f0;
            if (!articleViewer$WindowView2.e && !articleViewer$WindowView2.f20868f) {
                z10 = false;
            } else {
                z10 = true;
            }
            m0Var6.b(0, this.Z0.a(actionBarColor, z10));
            m0 m0Var7 = this.f37545h0;
            int actionBarColor2 = this.f37557u0[1].getActionBarColor();
            ArticleViewer$WindowView articleViewer$WindowView3 = this.f37543f0;
            if (!articleViewer$WindowView3.e && !articleViewer$WindowView3.f20868f) {
                z11 = false;
            } else {
                z11 = true;
            }
            m0Var7.b(1, this.f37538a1.a(actionBarColor2, z11));
            this.f37545h0.d(i0.a.d(f11, this.f37557u0[0].getActionBarColor(), this.f37557u0[1].getActionBarColor()), false);
            m0 m0Var8 = this.f37545h0;
            if (translationX > 0.5f) {
                o3Var2 = this.f37557u0[0];
            } else {
                o3Var2 = this.f37557u0[1];
            }
            m0Var8.setMenuType(o3Var2.f38846a);
            x3 x3Var = this.K;
            if (x3Var != null) {
                x3Var.f41730c.invalidate();
                return;
            }
            ArticleViewer$WindowView articleViewer$WindowView4 = this.f37543f0;
            if (articleViewer$WindowView4 != null) {
                articleViewer$WindowView4.invalidate();
            }
        }
    }

    public final void g(int i10, String str) {
        U();
        org.telegram.ui.ActionBar.l3 l3Var = new org.telegram.ui.ActionBar.l3();
        l3Var.f20504x = str;
        this.f37541d0.add(l3Var);
        this.f37545h0.h(false);
        e0(i10, l3Var, false);
    }

    public final boolean h(TLRPC.WebPage webPage, String str, int i10) {
        U();
        this.f37541d0.add(webPage);
        this.f37545h0.h(false);
        e0(i10, webPage, false);
        return V(str, false);
    }

    public final void h0() {
        int i10;
        int size;
        boolean z10;
        boolean z11;
        float f7;
        if (this.E == null && !this.f37557u0[0].f()) {
            return;
        }
        if (this.f37557u0[0].f()) {
            if (this.f37557u0[0].getWebView() == null) {
                i10 = 0;
            } else {
                i10 = this.f37557u0[0].getWebView().getSearchIndex();
            }
            if (this.f37557u0[0].getWebView() == null) {
                size = 0;
            } else {
                size = this.f37557u0[0].getWebView().getSearchCount();
            }
        } else {
            i10 = this.G;
            size = this.E.size();
        }
        ImageView imageView = this.f37554r0;
        if (size > 0 && i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        imageView.setEnabled(z10);
        ImageView imageView2 = this.f37555s0;
        if (size > 0 && i10 != size - 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        imageView2.setEnabled(z11);
        ImageView imageView3 = this.f37554r0;
        float f10 = 0.5f;
        if (imageView3.isEnabled()) {
            f7 = 1.0f;
        } else {
            f7 = 0.5f;
        }
        imageView3.setAlpha(f7);
        ImageView imageView4 = this.f37555s0;
        if (imageView4.isEnabled()) {
            f10 = 1.0f;
        }
        imageView4.setAlpha(f10);
        this.f37556t0.a();
        if (size < 0) {
            this.f37556t0.setText("");
        } else if (size == 0) {
            this.f37556t0.setText(LocaleController.getString(R.string.NoResult));
        } else if (size == 1) {
            this.f37556t0.setText(LocaleController.getString(R.string.OneResult));
        } else {
            this.f37556t0.setText(String.format(LocaleController.getPluralString("CountOfResults", size), Integer.valueOf(i10 + 1), Integer.valueOf(size)));
        }
    }

    public final void i0(boolean z10) {
        boolean z11;
        boolean z12 = false;
        this.f37545h0.g(0, this.f37557u0[0].getTitle(), z10);
        this.f37545h0.f(0, this.f37557u0[0].getSubtitle());
        m0 m0Var = this.f37545h0;
        if (this.f37557u0[0].f() && this.f37557u0[0].getWebView() != null && this.f37557u0[0].getWebView().E) {
            z11 = true;
        } else {
            z11 = false;
        }
        m0Var.e(0, z11);
        this.f37545h0.g(1, this.f37557u0[1].getTitle(), z10);
        this.f37545h0.f(1, this.f37557u0[1].getSubtitle());
        m0 m0Var2 = this.f37545h0;
        if (this.f37557u0[1].f() && this.f37557u0[1].getWebView() != null && this.f37557u0[1].getWebView().E) {
            z12 = true;
        }
        m0Var2.e(1, z12);
    }

    public final void k() {
        this.J0 = false;
        c3 c3Var = this.K0;
        if (c3Var != null) {
            this.f37543f0.removeCallbacks(c3Var);
            this.K0 = null;
        }
        c3 c3Var2 = this.L0;
        if (c3Var2 != null) {
            this.f37543f0.removeCallbacks(c3Var2);
            this.L0 = null;
        }
    }

    public final void m(org.telegram.messenger.f6 f6Var) {
        if (this.I0 == AndroidUtilities.dp(56.0f)) {
            if (f6Var != null) {
                f6Var.run();
                return;
            }
            return;
        }
        ValueAnimator duration = ValueAnimator.ofObject(new IntEvaluator(), Integer.valueOf(this.I0), Integer.valueOf(AndroidUtilities.dp(56.0f))).setDuration(180L);
        duration.setInterpolator(new DecelerateInterpolator());
        duration.addUpdateListener(new q(this, 0));
        duration.addListener(new s0(0, f6Var));
        if (f6Var != null) {
            duration.setDuration(duration.getDuration() / 2);
        }
        duration.start();
    }

    public final void n() {
        long j10;
        z2 z2Var;
        di.v vVar = this.f37557u0[0].f38847b;
        if (vVar != null && this.W) {
            float measuredHeight = vVar.getMeasuredHeight() / 2.0f;
            Uri uri = null;
            float f7 = 0.0f;
            z2 z2Var2 = null;
            for (int i10 = 0; i10 < vVar.getChildCount(); i10++) {
                View childAt = vVar.getChildAt(i10);
                if (childAt instanceof z2) {
                    float measuredHeight2 = (childAt.getMeasuredHeight() / 2.0f) + childAt.getTop();
                    if (z2Var2 == null || Math.abs(measuredHeight - measuredHeight2) < Math.abs(measuredHeight - f7)) {
                        z2Var2 = (z2) childAt;
                        f7 = measuredHeight2;
                    }
                }
            }
            boolean z10 = PhotoViewer.t1().f32234f;
            if (z10 || ((z2Var = this.f42508x) != null && z2Var != z2Var2 && this.f42507w != null)) {
                VideoPlayerHolderBase videoPlayerHolderBase = this.f42507w;
                if (videoPlayerHolderBase != null) {
                    z2 z2Var3 = this.f42508x;
                    long j11 = z2Var3.L.video_id;
                    a3 a2 = a3.a(videoPlayerHolderBase, z2Var3);
                    z2Var3.c(a2);
                    this.f42509y.k(a2, j11);
                    z2 z2Var4 = this.f42508x;
                    a3 a3Var = z2Var4.M;
                    if (a3Var != null) {
                        Bitmap bitmap = a3Var.f34027b;
                        if (bitmap != null) {
                            z2Var4.e.setImageBitmap(bitmap);
                        }
                        this.f42508x.e(false);
                    }
                    this.f42507w.release(null);
                }
                this.f42507w = null;
                this.f42508x = null;
            }
            if (!z10 && z2Var2 != null) {
                z70 z70Var = z2Var2.f42458a;
                if (z2Var2.O != null && z70Var.f42507w == null) {
                    z70Var.f42507w = new y2(z2Var2).with(z2Var2.f42462n);
                    TLRPC.Document document = z2Var2.O;
                    for (int i11 = 0; i11 < document.attributes.size(); i11++) {
                        if (document.attributes.get(i11) instanceof TLRPC.TL_documentAttributeVideo) {
                            TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) document.attributes.get(i11);
                            z2Var2.h.a(tL_documentAttributeVideo.f19223w / tL_documentAttributeVideo.h, 0);
                        }
                    }
                    TLRPC.WebPage webPage = z2Var2.f42459b.E;
                    if (webPage != null) {
                        uri = FileStreamLoadOperation.prepareUri(((k4) z70Var).X, document, webPage);
                    }
                    if (uri != null) {
                        VideoPlayerHolderBase videoPlayerHolderBase2 = z70Var.f42507w;
                        a3 a3Var2 = z2Var2.M;
                        if (a3Var2 == null) {
                            j10 = 0;
                        } else {
                            j10 = a3Var2.f34026a;
                        }
                        videoPlayerHolderBase2.seekTo(j10);
                        z70Var.f42507w.preparePlayer(uri, true, 1.0f);
                        z70Var.f42507w.play();
                    }
                }
                this.f42508x = z2Var2;
            }
        }
    }

    public final void o(boolean z10, boolean z11) {
        if (this.L != null && !this.T0 && this.V) {
            int i10 = 0;
            if (this.Z != 0 && Math.abs(this.f37539b0 - System.currentTimeMillis()) >= 500) {
                Runnable runnable = this.f37537a0;
                if (runnable != null) {
                    runnable.run();
                    this.f37537a0 = null;
                }
                this.Z = 0;
            }
            if (this.Z == 0) {
                x3 x3Var = this.K;
                if (x3Var != null) {
                    x3Var.dismiss(false);
                    return;
                }
                if (this.P.getVisibility() == 0) {
                    if (this.O != null) {
                        this.P.setVisibility(4);
                        this.S.onCustomViewHidden();
                        this.P.removeView(this.O);
                        this.O = null;
                    } else {
                        org.telegram.ui.Components.ca1 ca1Var = this.E0;
                        if (ca1Var != null && ca1Var.T) {
                            ca1Var.T = false;
                            ca1Var.m();
                            ca1Var.l(false);
                        }
                    }
                    if (!z11) {
                        return;
                    }
                }
                if (this.O0.x()) {
                    this.O0.f(false);
                    return;
                }
                m0 m0Var = this.f37545h0;
                if (m0Var.T) {
                    m0Var.h(false);
                } else if (m0Var.W) {
                    m0Var.k(false);
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
                        ArrayList arrayList = this.f37541d0;
                        if (arrayList.size() >= 2) {
                            Object x10 = i2.d.x(1, arrayList);
                            if (x10 instanceof b3) {
                                ((b3) x10).a();
                            }
                            if (x10 instanceof TLRPC.WebPage) {
                                org.telegram.ui.web.h2.o((TLRPC.WebPage) x10);
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
                    nb0 nb0Var = this.U0;
                    if (nb0Var != null) {
                        nb0Var.destroy();
                        this.U0 = null;
                    }
                    this.M = null;
                    try {
                        org.telegram.ui.ActionBar.e3 e3Var = this.f37548k0;
                        if (e3Var != null) {
                            e3Var.dismiss();
                            this.f37548k0 = null;
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    ArticleViewer$WindowView articleViewer$WindowView = this.f37543f0;
                    Property property = View.ALPHA;
                    animatorSet.playTogether(ObjectAnimator.ofFloat(articleViewer$WindowView, property, 0.0f), ObjectAnimator.ofFloat(this.f37544g0, property, 0.0f), ObjectAnimator.ofFloat(this.f37543f0, View.TRANSLATION_X, 0.0f, AndroidUtilities.dp(56.0f)));
                    this.Z = 2;
                    this.f37537a0 = new b0(this, 7);
                    animatorSet.setDuration(150L);
                    animatorSet.setInterpolator(this.f37540c0);
                    animatorSet.addListener(new u0(this, 0));
                    this.f37539b0 = System.currentTimeMillis();
                    this.f37544g0.setLayerType(2, null);
                    animatorSet.start();
                    while (true) {
                        a0.h hVar = this.f42509y;
                        if (i10 < hVar.m()) {
                            a3 a3Var = (a3) hVar.n(i10);
                            Bitmap bitmap = a3Var.f34027b;
                            if (bitmap != null) {
                                bitmap.recycle();
                                a3Var.f34027b = null;
                            }
                            i10++;
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
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f37541d0;
            if (i10 < arrayList.size()) {
                Object obj = arrayList.get(i10);
                if (obj instanceof b3) {
                    o3 o3Var = this.f37557u0[0];
                    if (o3Var != null && o3Var.J == obj) {
                        ((b3) obj).c(o3Var);
                    }
                    o3 o3Var2 = this.f37557u0[1];
                    if (o3Var2 != null && o3Var2.J == obj) {
                        ((b3) obj).c(o3Var2);
                    }
                    ((b3) obj).a();
                } else if (obj instanceof TLRPC.WebPage) {
                    org.telegram.ui.web.h2.o((TLRPC.WebPage) obj);
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
        if (this.L != null && (articleViewer$WindowView = this.f37543f0) != null) {
            if (this.K == null) {
                try {
                    if (articleViewer$WindowView.getParent() != null) {
                        ((WindowManager) this.L.getSystemService("window")).removeViewImmediate(this.f37543f0);
                    }
                    this.f37543f0 = null;
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            for (int i10 = 0; i10 < this.N.size(); i10++) {
                ((v1) this.N.get(i10)).a(true);
            }
            this.N.clear();
            try {
                this.L.getWindow().clearFlags(128);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            this.L = null;
            this.M = null;
            f37514c1 = null;
        }
    }

    public k4(org.telegram.ui.ActionBar.m2 m2Var) {
        this.N = new ArrayList();
        this.Y = 1;
        this.f37540c0 = new DecelerateInterpolator(1.5f);
        this.f37541d0 = new ArrayList();
        this.f37559w0 = new Paint();
        this.f37560x0 = new Paint();
        this.f37561y0 = new Paint();
        this.f37562z0 = new Paint();
        this.J0 = false;
        this.K0 = null;
        this.L0 = null;
        this.R0 = new AnimationNotificationsLocker(new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats});
        this.S0 = new l0[2];
        this.W0 = -1;
        b0 b0Var = new b0(this, 2);
        org.telegram.ui.Components.es esVar = org.telegram.ui.Components.es.h;
        this.Z0 = new org.telegram.ui.Components.j5(b0Var, 320L, esVar);
        this.f37538a1 = new org.telegram.ui.Components.j5(new b0(this, 4), 320L, esVar);
        this.J = true;
        this.K = new x3(this, m2Var);
        Y(m2Var.getParentActivity(), m2Var);
    }
}
