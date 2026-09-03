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
public final class n4 extends p70 implements NotificationCenter.NotificationCenterDelegate {
    public static TextPaint f36338d1;
    public static TextPaint f36339e1;
    public static TextPaint f36340f1;
    public static TextPaint f36341g1;
    public static TextPaint f36342h1;
    public static TextPaint f36343i1;
    public static TextPaint f36344j1;
    public static TextPaint f36345k1;
    public static Paint l1;
    public static Paint f36346m1;
    public static Paint f36347n1;
    public static Paint f36348o1;
    public static Paint f36349p1;
    public static Paint f36350q1;
    public static Paint f36351r1;
    public static Paint f36352s1;
    public static Paint f36353t1;
    public static Paint f36354u1;
    public static Paint f36355v1;
    public static Paint f36356w1;
    public static Paint f36358y1;
    public org.telegram.ui.Components.e91 A0;
    public org.telegram.ui.Components.e91 B0;
    public int C0;
    public int D0;
    public int E0;
    public int F0;
    public final boolean G;
    public boolean G0;
    public final a4 H;
    public e3 H0;
    public Activity I;
    public e3 I0;
    public org.telegram.ui.ActionBar.p2 J;
    public ze.c J0;
    public final ArrayList K;
    public int K0;
    public View L;
    public org.telegram.ui.Cells.l9 L0;
    public FrameLayout M;
    public org.telegram.ui.Cells.l9 M0;
    public TextureView N;
    public cv0 N0;
    public q4 O;
    public final AnimationNotificationsLocker O0;
    public WebChromeClient.CustomViewCallback P;
    public final n0[] P0;
    public WindowInsets Q;
    public boolean Q0;
    public boolean R;
    public kf.t0 R0;
    public boolean S;
    public ah.a S0;
    public boolean T;
    public int T0;
    public int U;
    public ValueAnimator U0;
    public int V;
    public float V0;
    public int W;
    public final org.telegram.ui.Components.c5 W0;
    public Runnable X;
    public final org.telegram.ui.Components.c5 X0;
    public long Y;
    public final DecelerateInterpolator Z;
    public final ArrayList f36359a0;
    public WindowManager.LayoutParams f36360b0;
    public ArticleViewer$WindowView f36361c0;
    public n0 f36362d0;
    public o0 f36363e0;
    public org.telegram.ui.web.k f36364f0;
    public d0 f36365g0;
    public org.telegram.ui.ActionBar.g3 f36366h0;
    public Paint f36367i0;
    public Drawable f36368j0;
    public Paint f36369k0;
    public boolean f36370l0;
    public float m0;
    public dh.d f36371n0;
    public ImageView f36372o0;
    public ImageView f36373p0;
    public org.telegram.ui.Components.k6 f36374q0;
    public r3[] f36375r0;
    public AnimatorSet f36376s0;
    public final Paint f36377t0;
    public final Paint f36378u0;
    public final Paint f36379v0;
    public final Paint f36380w0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f36381x0;
    public TextView f36382y0;
    public Rect f36383z0;
    public static final HashSet Y0 = new HashSet();
    public static volatile n4 Z0 = null;
    public static final w0 f36335a1 = new w0("innerTranslationX", 0);
    public static final TextPaint f36336b1 = new TextPaint(1);
    public static final v3 f36337c1 = new v3();
    public static final WeakHashMap f36357x1 = new WeakHashMap();

    public n4() {
        this.K = new ArrayList();
        this.V = 1;
        this.Z = new DecelerateInterpolator(1.5f);
        this.f36359a0 = new ArrayList();
        this.f36377t0 = new Paint();
        this.f36378u0 = new Paint();
        this.f36379v0 = new Paint();
        this.f36380w0 = new Paint();
        this.G0 = false;
        this.H0 = null;
        this.I0 = null;
        this.O0 = new AnimationNotificationsLocker(new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats});
        this.P0 = new n0[2];
        this.T0 = -1;
        d0 d0Var = new d0(this, 2);
        org.telegram.ui.Components.mr mrVar = org.telegram.ui.Components.mr.h;
        this.W0 = new org.telegram.ui.Components.c5(d0Var, 320L, mrVar);
        this.X0 = new org.telegram.ui.Components.c5(new d0(this, 4), 320L, mrVar);
        this.G = false;
        this.H = null;
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
            StringBuilder sb = new StringBuilder();
            int size = richText.texts.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb.append(B(richText.texts.get(i10)));
            }
            return sb;
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

    public static CharSequence C(p70 p70Var, TLRPC.WebPage webPage, View view, TL_iv.RichText richText, TL_iv.RichText richText2, TL_iv.PageBlock pageBlock, int i10) {
        boolean z4;
        boolean z10;
        org.telegram.ui.Components.o01 o01Var;
        org.telegram.ui.Components.o01 o01Var2;
        TextPaint textPaint = null;
        if (richText2 == null) {
            return null;
        }
        if (richText2 instanceof TL_iv.textFixed) {
            return C(p70Var, webPage, view, richText, ((TL_iv.textFixed) richText2).text, pageBlock, i10);
        }
        if (richText2 instanceof TL_iv.textItalic) {
            return C(p70Var, webPage, view, richText, ((TL_iv.textItalic) richText2).text, pageBlock, i10);
        }
        if (richText2 instanceof TL_iv.textBold) {
            return C(p70Var, webPage, view, richText, ((TL_iv.textBold) richText2).text, pageBlock, i10);
        }
        if (richText2 instanceof TL_iv.textUnderline) {
            return C(p70Var, webPage, view, richText, ((TL_iv.textUnderline) richText2).text, pageBlock, i10);
        }
        if (richText2 instanceof TL_iv.textStrike) {
            return C(p70Var, webPage, view, richText, ((TL_iv.textStrike) richText2).text, pageBlock, i10);
        }
        if (richText2 instanceof TL_iv.textEmail) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C(p70Var, webPage, view, richText, ((TL_iv.textEmail) richText2).text, pageBlock, i10));
            MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), MetricAffectingSpan.class);
            if (spannableStringBuilder.length() != 0) {
                if (metricAffectingSpanArr == null || metricAffectingSpanArr.length == 0) {
                    textPaint = E(p70Var, richText, richText2, pageBlock);
                }
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.o01(textPaint, "mailto:" + F(richText2)), 0, spannableStringBuilder.length(), 33);
            }
            return spannableStringBuilder;
        }
        long j10 = 0;
        if (richText2 instanceof TL_iv.textUrl) {
            TL_iv.textUrl texturl = (TL_iv.textUrl) richText2;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(C(p70Var, webPage, view, richText, texturl.text, pageBlock, i10));
            MetricAffectingSpan[] metricAffectingSpanArr2 = (MetricAffectingSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), MetricAffectingSpan.class);
            if (metricAffectingSpanArr2 == null || metricAffectingSpanArr2.length == 0) {
                textPaint = E(p70Var, richText, richText2, pageBlock);
            }
            if (texturl.webpage_id != 0) {
                o01Var2 = new org.telegram.ui.Components.o01(textPaint, F(richText2));
            } else {
                o01Var2 = new org.telegram.ui.Components.o01(textPaint, F(richText2));
            }
            if (spannableStringBuilder2.length() != 0) {
                spannableStringBuilder2.setSpan(o01Var2, 0, spannableStringBuilder2.length(), 33);
            }
            return spannableStringBuilder2;
        } else if (richText2 instanceof TL_iv.textPlain) {
            return ((TL_iv.textPlain) richText2).text;
        } else {
            if (richText2 instanceof TL_iv.textAnchor) {
                TL_iv.textAnchor textanchor = (TL_iv.textAnchor) richText2;
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(C(p70Var, webPage, view, richText, textanchor.text, pageBlock, i10));
                String str = textanchor.name;
                ?? metricAffectingSpan = new MetricAffectingSpan();
                metricAffectingSpan.f23313a = str.toLowerCase();
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
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10 && spannableStringBuilder4.length() != 0 && spannableStringBuilder4.charAt(spannableStringBuilder4.length() - 1) != '\n') {
                            spannableStringBuilder4.append((CharSequence) " ");
                            spannableStringBuilder4.setSpan(new Object(), spannableStringBuilder4.length() - 1, spannableStringBuilder4.length(), 33);
                        }
                        CharSequence C = C(p70Var, webPage, view, richText, richText3, pageBlock, i10);
                        int D = D(A);
                        int length = spannableStringBuilder4.length();
                        spannableStringBuilder4.append(C);
                        if (D != 0 && !(C instanceof SpannableStringBuilder)) {
                            if ((D & 8) == 0 && (D & 512) == 0) {
                                if (length != spannableStringBuilder4.length()) {
                                    TextPaint E = E(p70Var, richText, A, pageBlock);
                                    ?? metricAffectingSpan2 = new MetricAffectingSpan();
                                    metricAffectingSpan2.f27161a = E;
                                    spannableStringBuilder4.setSpan(metricAffectingSpan2, length, spannableStringBuilder4.length(), 33);
                                }
                            } else {
                                String F = F(richText3);
                                if (F == null) {
                                    F = F(richText);
                                }
                                if ((D & 512) != 0) {
                                    o01Var = new org.telegram.ui.Components.o01(E(p70Var, richText, A, pageBlock), F);
                                } else {
                                    o01Var = new org.telegram.ui.Components.o01(E(p70Var, richText, A, pageBlock), F);
                                }
                                if (length != spannableStringBuilder4.length()) {
                                    spannableStringBuilder4.setSpan(o01Var, length, spannableStringBuilder4.length(), 33);
                                }
                            }
                        }
                        if (z10 && i11 != size - 1) {
                            spannableStringBuilder4.append((CharSequence) " ");
                            spannableStringBuilder4.setSpan(new Object(), spannableStringBuilder4.length() - 1, spannableStringBuilder4.length(), 33);
                        }
                        i11++;
                        j10 = 0;
                    }
                    return spannableStringBuilder4;
                } else if (richText2 instanceof TL_iv.textSubscript) {
                    return C(p70Var, webPage, view, richText, ((TL_iv.textSubscript) richText2).text, pageBlock, i10);
                } else {
                    if (richText2 instanceof TL_iv.textSuperscript) {
                        return C(p70Var, webPage, view, richText, ((TL_iv.textSuperscript) richText2).text, pageBlock, i10);
                    }
                    if (richText2 instanceof TL_iv.textMarked) {
                        SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(C(p70Var, webPage, view, richText, ((TL_iv.textMarked) richText2).text, pageBlock, i10));
                        MetricAffectingSpan[] metricAffectingSpanArr3 = (MetricAffectingSpan[]) spannableStringBuilder5.getSpans(0, spannableStringBuilder5.length(), MetricAffectingSpan.class);
                        if (spannableStringBuilder5.length() != 0) {
                            if (metricAffectingSpanArr3 == null || metricAffectingSpanArr3.length == 0) {
                                textPaint = E(p70Var, richText, richText2, pageBlock);
                            }
                            ?? metricAffectingSpan3 = new MetricAffectingSpan();
                            metricAffectingSpan3.f26904a = textPaint;
                            spannableStringBuilder5.setSpan(metricAffectingSpan3, 0, spannableStringBuilder5.length(), 33);
                        }
                        return spannableStringBuilder5;
                    } else if (richText2 instanceof TL_iv.textSpoiler) {
                        SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder(C(p70Var, webPage, view, richText, ((TL_iv.textSpoiler) richText2).text, pageBlock, i10));
                        if (spannableStringBuilder6.length() != 0) {
                            ?? obj = new Object();
                            obj.f28632a |= 256;
                            spannableStringBuilder6.setSpan(new org.telegram.ui.Components.t01(obj, 0), 0, spannableStringBuilder6.length(), 33);
                        }
                        return spannableStringBuilder6;
                    } else if (richText2 instanceof TL_iv.textPhone) {
                        SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder(C(p70Var, webPage, view, richText, ((TL_iv.textPhone) richText2).text, pageBlock, i10));
                        MetricAffectingSpan[] metricAffectingSpanArr4 = (MetricAffectingSpan[]) spannableStringBuilder7.getSpans(0, spannableStringBuilder7.length(), MetricAffectingSpan.class);
                        if (spannableStringBuilder7.length() != 0) {
                            if (metricAffectingSpanArr4 == null || metricAffectingSpanArr4.length == 0) {
                                textPaint = E(p70Var, richText, richText2, pageBlock);
                            }
                            spannableStringBuilder7.setSpan(new org.telegram.ui.Components.o01(textPaint, "tel:" + F(richText2)), 0, spannableStringBuilder7.length(), 33);
                        }
                        return spannableStringBuilder7;
                    } else {
                        if (richText2 instanceof TL_iv.textImage) {
                            TL_iv.textImage textimage = (TL_iv.textImage) richText2;
                            TLRPC.Document a2 = k4.a(webPage, textimage.document_id);
                            TLRPC.Photo e = k4.e(webPage, textimage.photo_id);
                            if (a2 != null) {
                                SpannableStringBuilder spannableStringBuilder8 = new SpannableStringBuilder("*");
                                int dp = AndroidUtilities.dp(textimage.f19381w);
                                int dp2 = AndroidUtilities.dp(textimage.h);
                                int abs = Math.abs(i10);
                                if (dp > abs) {
                                    dp2 = (int) (dp2 * (abs / dp));
                                    dp = abs;
                                }
                                if (view != null) {
                                    int i12 = org.telegram.ui.ActionBar.j6.f19881d6;
                                    ((n4) p70Var).getClass();
                                    if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.w0(null, i12, false)) <= 0.705f) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    ?? replacementSpan = new ReplacementSpan();
                                    Locale locale = Locale.US;
                                    String str2 = dp + "_" + dp2 + "_i";
                                    replacementSpan.f26518b = dp;
                                    replacementSpan.f26519c = dp2;
                                    boolean z11 = z4;
                                    ImageReceiver imageReceiver = new ImageReceiver(view);
                                    replacementSpan.f26517a = imageReceiver;
                                    imageReceiver.setInvalidateAll(true);
                                    if (z11) {
                                        imageReceiver.setDelegate(new org.telegram.ui.Components.lh0(11));
                                    }
                                    imageReceiver.setImage(ImageLocation.getForDocument(a2), str2, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(a2.thumbs, 90), a2), str2, -1L, null, webPage, 1);
                                    spannableStringBuilder8.setSpan(replacementSpan, 0, spannableStringBuilder8.length(), 33);
                                }
                                return spannableStringBuilder8;
                            } else if (e instanceof org.telegram.ui.web.g2) {
                                org.telegram.ui.web.g2 g2Var = (org.telegram.ui.web.g2) e;
                                SpannableStringBuilder spannableStringBuilder9 = new SpannableStringBuilder("*");
                                int dp3 = AndroidUtilities.dp(textimage.f19381w);
                                int dp4 = AndroidUtilities.dp(textimage.h);
                                int abs2 = Math.abs(i10);
                                if (dp3 > abs2) {
                                    dp4 = (int) (dp4 * (abs2 / dp3));
                                    dp3 = abs2;
                                }
                                if (view != null) {
                                    ?? replacementSpan2 = new ReplacementSpan();
                                    replacementSpan2.f26518b = dp3;
                                    replacementSpan2.f26519c = dp4;
                                    ImageReceiver imageReceiver2 = new ImageReceiver(view);
                                    replacementSpan2.f26517a = imageReceiver2;
                                    imageReceiver2.setInvalidateAll(true);
                                    org.telegram.ui.web.h2.g(g2Var, imageReceiver2, new org.telegram.ui.Components.mc(11));
                                    spannableStringBuilder9.setSpan(replacementSpan2, 0, spannableStringBuilder9.length(), 33);
                                }
                                return spannableStringBuilder9;
                            }
                        } else if (richText2 instanceof TL_iv.textMath) {
                            TL_iv.textMath textmath = (TL_iv.textMath) richText2;
                            if (textmath.bitmap == null && !textmath.tried) {
                                textmath.tried = true;
                                vh.r a10 = vh.r.a(textmath.source, AndroidUtilities.dp(20.0f), true);
                                if (a10 != null) {
                                    textmath.f19382w = a10.f46173b;
                                    textmath.h = a10.f46174c;
                                    textmath.depth = a10.d;
                                    textmath.bitmap = a10.f46172a;
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
                                int i13 = textmath.f19382w;
                                int i14 = textmath.h;
                                int i15 = org.telegram.ui.ActionBar.j6.G6;
                                ((n4) p70Var).getClass();
                                spannableStringBuilder10.setSpan(new org.telegram.ui.Components.l01(view, bitmap, i13, i14, org.telegram.ui.ActionBar.j6.w0(null, i15, false), textmath.depth), 0, spannableStringBuilder10.length(), 33);
                                String str4 = textmath.source;
                                if (str4 != null && !str4.isEmpty()) {
                                    spannableStringBuilder10.setSpan(new org.telegram.ui.Cells.r9(textmath.source), 0, spannableStringBuilder10.length(), 33);
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

    public static TextPaint E(p70 p70Var, TL_iv.RichText richText, TL_iv.RichText richText2, TL_iv.PageBlock pageBlock) {
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
        n4 n4Var = (n4) p70Var;
        n4Var.getClass();
        v3 v3Var = f36337c1;
        v3Var.getClass();
        SparseArray sparseArray = v3Var.f38986x;
        SparseArray sparseArray2 = v3Var.f38985w;
        SparseArray sparseArray3 = v3Var.f38983t;
        SparseArray sparseArray4 = v3Var.f38969c;
        SparseArray sparseArray5 = v3Var.f38968b;
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
            b10 = p70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockMap) {
            TL_iv.RichText richText4 = ((TL_iv.pageBlockMap) pageBlock).caption.text;
            if (richText4 != richText2 && richText4 != richText) {
                dp6 = AndroidUtilities.dp(12.0f);
            } else {
                dp6 = AndroidUtilities.dp(14.0f);
                sparseArray4 = sparseArray5;
            }
            dp8 = dp6;
            b10 = p70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockTitle) {
            sparseArray4 = v3Var.d;
            dp8 = AndroidUtilities.dp(23.0f);
            b10 = p70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockKicker) {
            sparseArray4 = v3Var.e;
            dp8 = AndroidUtilities.dp(14.0f);
            b10 = p70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockAuthorDate) {
            sparseArray4 = v3Var.f38978o;
            dp8 = AndroidUtilities.dp(14.0f);
            b10 = p70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockFooter) {
            sparseArray4 = v3Var.f38979p;
            dp8 = AndroidUtilities.dp(14.0f);
            b10 = p70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockSubtitle) {
            sparseArray4 = v3Var.f38971g;
            dp8 = AndroidUtilities.dp(20.0f);
            b10 = p70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeader) {
            sparseArray4 = v3Var.f38970f;
            dp8 = AndroidUtilities.dp(20.0f);
            b10 = p70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockSubheader) {
            sparseArray4 = v3Var.h;
            dp8 = AndroidUtilities.dp(17.0f);
            b10 = p70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading1) {
            sparseArray4 = v3Var.f38972i;
            dp8 = AndroidUtilities.dp(18.0f);
            b10 = p70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading2) {
            sparseArray4 = v3Var.f38973j;
            dp8 = AndroidUtilities.dp(16.0f);
            b10 = p70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading3) {
            sparseArray4 = v3Var.f38974k;
            dp8 = AndroidUtilities.dp(15.0f);
            b10 = p70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading4) {
            sparseArray4 = v3Var.f38975l;
            dp8 = AndroidUtilities.dp(14.0f);
            b10 = p70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading5) {
            sparseArray4 = v3Var.f38976m;
            dp8 = AndroidUtilities.dp(13.0f);
            b10 = p70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading6) {
            sparseArray4 = v3Var.f38977n;
            dp8 = AndroidUtilities.dp(12.0f);
            b10 = p70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) pageBlock;
            if (pageblockblockquote.text == richText) {
                dp8 = AndroidUtilities.dp(15.0f);
                b10 = p70Var.b();
                sparseArray4 = sparseArray3;
            } else {
                if (pageblockblockquote.caption == richText) {
                    dp8 = AndroidUtilities.dp(14.0f);
                    b10 = p70Var.a();
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
                b10 = p70Var.b();
                sparseArray4 = sparseArray3;
            } else {
                if (pageblockpullquote.caption == richText) {
                    dp8 = AndroidUtilities.dp(14.0f);
                    b10 = p70Var.a();
                    sparseArray3 = sparseArray5;
                    sparseArray4 = sparseArray3;
                }
                b10 = -65536;
                sparseArray3 = null;
                sparseArray4 = sparseArray3;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
            sparseArray4 = v3Var.f38982s;
            dp8 = AndroidUtilities.dp(14.0f);
            b10 = p70Var.b();
            D |= 4;
        } else if (pageBlock instanceof TL_iv.pageBlockParagraph) {
            sparseArray4 = v3Var.f38980q;
            dp8 = AndroidUtilities.dp(16.0f);
            b10 = p70Var.b();
        } else if (L(pageBlock)) {
            sparseArray4 = v3Var.f38981r;
            dp8 = AndroidUtilities.dp(16.0f);
            b10 = p70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockEmbed) {
            TL_iv.RichText richText5 = ((TL_iv.pageBlockEmbed) pageBlock).caption.text;
            if (richText5 != richText2 && richText5 != richText) {
                dp5 = AndroidUtilities.dp(12.0f);
            } else {
                dp5 = AndroidUtilities.dp(14.0f);
                sparseArray4 = sparseArray5;
            }
            dp8 = dp5;
            b10 = p70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
            TL_iv.RichText richText6 = ((TL_iv.pageBlockSlideshow) pageBlock).caption.text;
            if (richText6 != richText2 && richText6 != richText) {
                dp4 = AndroidUtilities.dp(12.0f);
            } else {
                dp4 = AndroidUtilities.dp(14.0f);
                sparseArray4 = sparseArray5;
            }
            dp8 = dp4;
            b10 = p70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockCollage) {
            TL_iv.RichText richText7 = ((TL_iv.pageBlockCollage) pageBlock).caption.text;
            if (richText7 != richText2 && richText7 != richText) {
                dp3 = AndroidUtilities.dp(12.0f);
            } else {
                dp3 = AndroidUtilities.dp(14.0f);
                sparseArray4 = sparseArray5;
            }
            dp8 = dp3;
            b10 = p70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockEmbedPost) {
            TL_iv.PageCaption pageCaption = ((TL_iv.pageBlockEmbedPost) pageBlock).caption;
            if (richText2 == pageCaption.text) {
                dp8 = AndroidUtilities.dp(14.0f);
                b10 = p70Var.a();
                sparseArray4 = sparseArray5;
            } else if (richText2 == pageCaption.credit) {
                dp8 = AndroidUtilities.dp(12.0f);
                b10 = p70Var.a();
            } else {
                if (richText2 != null) {
                    sparseArray4 = v3Var.f38984u;
                    dp8 = AndroidUtilities.dp(14.0f);
                    b10 = p70Var.b();
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
                b10 = p70Var.b();
            } else if (pageBlock instanceof TL_iv.pageBlockAudio) {
                if (richText2 == ((TL_iv.pageBlockAudio) pageBlock).caption.text) {
                    dp = AndroidUtilities.dp(14.0f);
                    sparseArray = sparseArray2;
                } else {
                    dp = AndroidUtilities.dp(12.0f);
                }
                dp8 = dp;
                b10 = p70Var.b();
            } else if (pageBlock instanceof TL_iv.pageBlockRelatedArticles) {
                sparseArray4 = v3Var.f38987y;
                dp8 = AndroidUtilities.dp(15.0f);
                b10 = p70Var.a();
            } else if (pageBlock instanceof TL_iv.pageBlockDetails) {
                sparseArray4 = v3Var.f38988z;
                dp8 = AndroidUtilities.dp(15.0f);
                b10 = p70Var.b();
            } else {
                if (pageBlock instanceof TL_iv.pageBlockTable) {
                    sparseArray4 = v3Var.A;
                    dp8 = AndroidUtilities.dp(15.0f);
                    b10 = p70Var.b();
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
            if (v3Var.f38967a == null) {
                TextPaint textPaint = new TextPaint(1);
                v3Var.f38967a = textPaint;
                textPaint.setColor(-65536);
            }
            v3Var.f38967a.setTextSize(AndroidUtilities.dp(14.0f));
            return v3Var.f38967a;
        }
        TextPaint textPaint2 = (TextPaint) sparseArray4.get(D);
        if (textPaint2 == null) {
            textPaint2 = new TextPaint(1);
            if ((D & 4) != 0) {
                textPaint2.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
            } else if (pageBlock instanceof TL_iv.pageBlockRelatedArticles) {
                textPaint2.setTypeface(AndroidUtilities.bold());
            } else if (p70Var.f36980a != 1 && !(pageBlock instanceof TL_iv.pageBlockTitle) && !(pageBlock instanceof TL_iv.pageBlockKicker) && !(pageBlock instanceof TL_iv.pageBlockHeader) && !(pageBlock instanceof TL_iv.pageBlockSubtitle) && !(pageBlock instanceof TL_iv.pageBlockSubheader) && !K(pageBlock)) {
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
                n4Var.getClass();
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
        if (Z0 != null) {
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
        if (!(pageBlock instanceof d4) && !(pageBlock instanceof f4)) {
            return false;
        }
        return true;
    }

    public static boolean O(b4 b4Var) {
        boolean z4;
        TL_iv.PageBlock z10 = z(b4Var.f32728a);
        if (z10 instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) z10;
            if (!pageblockdetails.open) {
                pageblockdetails.open = true;
                return true;
            }
        } else if (z10 instanceof b4) {
            b4 b4Var2 = (b4) z10;
            TL_iv.PageBlock z11 = z(b4Var2.f32729b);
            if (z11 instanceof TL_iv.pageBlockDetails) {
                TL_iv.pageBlockDetails pageblockdetails2 = (TL_iv.pageBlockDetails) z11;
                if (!pageblockdetails2.open) {
                    pageblockdetails2.open = true;
                    z4 = true;
                    if (!O(b4Var2) || z4) {
                        return true;
                    }
                }
            }
            z4 = false;
            if (!O(b4Var2)) {
            }
            return true;
        }
        return false;
    }

    public static void T(p70 p70Var) {
        if (p70Var.f36981b != null || p70Var.f36983f != null) {
            View view = p70Var.f36983f;
            p70Var.f36982c.d(true);
            p70Var.f36981b = null;
            p70Var.d = null;
            p70Var.f36983f = null;
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

    public static void f(String str, int i10, FrameLayout frameLayout, a4 a4Var, org.telegram.ui.ActionBar.f6 f6Var) {
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
        new org.telegram.ui.Components.qc(frameLayout, f6Var).Q(R.raw.saved_messages, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.WebBookmarkedToast), new gg.y1(a4Var, clientUserId, 14))).k(true);
    }

    public static void g0(n4 n4Var) {
        TextPaint textPaint = f36344j1;
        if (textPaint != null) {
            textPaint.setColor(n4Var.b());
        }
        TextPaint textPaint2 = f36345k1;
        if (textPaint2 != null) {
            textPaint2.setColor(n4Var.b());
        }
        TextPaint textPaint3 = f36338d1;
        if (textPaint3 != null) {
            textPaint3.setColor(n4Var.b());
        }
        TextPaint textPaint4 = f36340f1;
        if (textPaint4 != null) {
            textPaint4.setColor(n4Var.b());
        }
        TextPaint textPaint5 = f36341g1;
        if (textPaint5 != null) {
            textPaint5.setColor(-1);
        }
        TextPaint textPaint6 = f36342h1;
        if (textPaint6 != null) {
            textPaint6.setColor(n4Var.b());
        }
        TextPaint textPaint7 = f36343i1;
        if (textPaint7 != null) {
            textPaint7.setColor(n4Var.a());
        }
        TextPaint textPaint8 = f36339e1;
        if (textPaint8 != null) {
            textPaint8.setColor(n4Var.a());
        }
        r(n4Var, true);
        v3 v3Var = f36337c1;
        v3.a(n4Var, v3Var.d);
        v3.a(n4Var, v3Var.e);
        v3.a(n4Var, v3Var.f38971g);
        v3.a(n4Var, v3Var.f38970f);
        v3.a(n4Var, v3Var.h);
        v3.a(n4Var, v3Var.f38972i);
        v3.a(n4Var, v3Var.f38973j);
        v3.a(n4Var, v3Var.f38974k);
        v3.a(n4Var, v3Var.f38975l);
        v3.a(n4Var, v3Var.f38976m);
        v3.a(n4Var, v3Var.f38977n);
        v3.a(n4Var, v3Var.f38983t);
        v3.a(n4Var, v3Var.f38982s);
        v3.a(n4Var, v3Var.f38980q);
        v3.a(n4Var, v3Var.f38981r);
        v3.a(n4Var, v3Var.f38984u);
        v3.a(n4Var, v3Var.f38985w);
        v3.a(n4Var, v3Var.f38986x);
        v3.a(n4Var, v3Var.f38968b);
        v3.a(n4Var, v3Var.f38969c);
        v3.a(n4Var, v3Var.f38978o);
        v3.a(n4Var, v3Var.f38979p);
        v3.a(n4Var, v3Var.v);
        v3.a(n4Var, v3Var.f38987y);
        v3.a(n4Var, v3Var.f38988z);
        v3.a(n4Var, v3Var.A);
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

    public static CharSequence j(p70 p70Var, l4 l4Var, f3 f3Var) {
        StaticLayout staticLayout;
        if (f3Var != null && (staticLayout = f3Var.d) != null) {
            SpannableStringBuilder spannableStringBuilder = f3Var.f33936y;
            if (spannableStringBuilder != null) {
                return spannableStringBuilder;
            }
            CharSequence text = staticLayout.getText();
            if (!(text instanceof Spannable)) {
                return text;
            }
            Spannable spannable = (Spannable) text;
            org.telegram.ui.Components.o01[] o01VarArr = (org.telegram.ui.Components.o01[]) spannable.getSpans(0, spannable.length(), org.telegram.ui.Components.o01.class);
            SpannableStringBuilder spannableStringBuilder2 = text;
            if (o01VarArr != null) {
                spannableStringBuilder2 = text;
                if (o01VarArr.length != 0) {
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannable);
                    for (org.telegram.ui.Components.o01 o01Var : o01VarArr) {
                        int spanStart = spannableStringBuilder3.getSpanStart(o01Var);
                        int spanEnd = spannableStringBuilder3.getSpanEnd(o01Var);
                        if (spanStart >= 0 && spanEnd > spanStart) {
                            spannableStringBuilder3.setSpan(new r0(p70Var, l4Var, o01Var, 0), spanStart, spanEnd, 33);
                        }
                    }
                    f3Var.f33936y = spannableStringBuilder3;
                    spannableStringBuilder2 = spannableStringBuilder3;
                }
            }
            return spannableStringBuilder2;
        }
        return null;
    }

    public static TL_iv.PageBlock j0(TL_iv.PageBlock pageBlock, b4 b4Var) {
        if (pageBlock instanceof d4) {
            d4 d4Var = (d4) pageBlock;
            d4 d4Var2 = new d4();
            d4Var2.f33316a = d4Var.f33316a;
            d4Var2.f33317b = d4Var.f33317b;
            d4Var2.f33318c = d4Var.f33318c;
            d4Var2.d = j0(d4Var.d, b4Var);
            return d4Var2;
        } else if (pageBlock instanceof f4) {
            f4 f4Var = (f4) pageBlock;
            f4 f4Var2 = new f4();
            f4Var2.f33941a = f4Var.f33941a;
            f4Var2.f33942b = f4Var.f33942b;
            f4Var2.f33943c = f4Var.f33943c;
            f4Var2.d = j0(f4Var.d, b4Var);
            return f4Var2;
        } else {
            return b4Var;
        }
    }

    public static boolean l(org.telegram.ui.p70 r25, org.telegram.ui.l4 r26, android.view.MotionEvent r27, android.view.View r28, org.telegram.ui.f3 r29, int r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.n4.l(org.telegram.ui.p70, org.telegram.ui.l4, android.view.MotionEvent, android.view.View, org.telegram.ui.f3, int, int):boolean");
    }

    public static org.telegram.ui.f3 p(org.telegram.ui.p70 r20, android.view.View r21, java.lang.CharSequence r22, org.telegram.tgnet.tl.TL_iv.RichText r23, int r24, int r25, org.telegram.tgnet.tl.TL_iv.PageBlock r26, android.text.Layout.Alignment r27, int r28, org.telegram.ui.l4 r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.n4.p(org.telegram.ui.p70, android.view.View, java.lang.CharSequence, org.telegram.tgnet.tl.TL_iv$RichText, int, int, org.telegram.tgnet.tl.TL_iv$PageBlock, android.text.Layout$Alignment, int, org.telegram.ui.l4):org.telegram.ui.f3");
    }

    public static f3 q(p70 p70Var, View view, CharSequence charSequence, TL_iv.RichText richText, int i10, int i11, TL_iv.PageBlock pageBlock, l4 l4Var) {
        return p(p70Var, view, charSequence, richText, i10, i11, pageBlock, Layout.Alignment.ALIGN_NORMAL, 0, l4Var);
    }

    public static void r(n4 n4Var, boolean z4) {
        int i10;
        if (f36347n1 == null) {
            f36347n1 = new Paint();
            f36346m1 = new Paint();
            Paint paint = new Paint(1);
            f36349p1 = paint;
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            f36349p1.setStrokeWidth(AndroidUtilities.dp(1.0f));
            Paint paint2 = new Paint();
            f36350q1 = paint2;
            paint2.setStyle(style);
            f36350q1.setStrokeWidth(AndroidUtilities.dp(1.0f) / 2.0f);
            f36351r1 = new Paint();
            f36352s1 = new Paint();
            f36353t1 = new Paint();
            f36354u1 = new Paint(1);
            f36355v1 = new Paint(1);
            l1 = new Paint();
            f36348o1 = new Paint();
            f36356w1 = new Paint(1);
        } else if (!z4) {
            return;
        }
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false);
        float green = Color.green(w02) * 0.7152f;
        float v = e2.c.v(Color.blue(w02), 0.0722f, green + (Color.red(w02) * 0.2126f), 255.0f);
        Paint paint3 = f36355v1;
        if (v <= 0.705f) {
            i10 = -3041234;
        } else {
            i10 = -6551;
        }
        paint3.setColor(i10);
        Paint paint4 = f36354u1;
        int i11 = org.telegram.ui.ActionBar.j6.K6;
        paint4.setColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false) & 872415231);
        f36354u1.setPathEffect(org.telegram.ui.Components.y80.c());
        f36353t1.setColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false) & 872415231);
        f36353t1.setPathEffect(org.telegram.ui.Components.y80.c());
        Paint paint5 = f36350q1;
        int i12 = org.telegram.ui.ActionBar.j6.f20006k6;
        paint5.setColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        f36349p1.setColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        l1.setColor(251658240);
        f36348o1.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19882d7, false));
        f36356w1.setColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false) & 872415231);
        f36356w1.setPathEffect(org.telegram.ui.Components.y80.c());
        int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.M6, false);
        int red = Color.red(w03);
        int green2 = Color.green(w03);
        int blue = Color.blue(w03);
        f36352s1.setColor(Color.argb(20, red, green2, blue));
        f36351r1.setColor(Color.argb(34, red, green2, blue));
        int w04 = org.telegram.ui.ActionBar.j6.w0(null, i11, false);
        f36346m1.setColor(Color.argb(20, Color.red(w04), Color.green(w04), Color.blue(w04)));
        f36347n1.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Uc, false));
    }

    public static void u(Canvas canvas, p70 p70Var, TL_iv.PageBlock pageBlock, int i10) {
        int i11;
        if (pageBlock != null && p70Var != null && f36347n1 != null) {
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
                    canvas.drawRect(dp, 0.0f, AndroidUtilities.dp(2.0f) + dp, i13, f36347n1);
                    return;
                }
                return;
            }
            while (i14 != 0) {
                if ((i14 & 1) != 0) {
                    int dp2 = AndroidUtilities.dp((i12 * 14) + 18);
                    canvas.drawRect(dp2, 0.0f, AndroidUtilities.dp(2.0f) + dp2, i13, f36347n1);
                }
                i14 >>>= 1;
                i12++;
            }
        }
    }

    public static void v(org.telegram.ui.p70 r2, android.graphics.Canvas r3, org.telegram.ui.Cells.k9 r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.n4.v(org.telegram.ui.p70, android.graphics.Canvas, org.telegram.ui.Cells.k9, int):void");
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

    public static n4 x() {
        n4 n4Var;
        n4 n4Var2 = Z0;
        if (n4Var2 == null) {
            synchronized (n4.class) {
                try {
                    n4Var = Z0;
                    if (n4Var == null) {
                        n4Var = new n4();
                        Z0 = n4Var;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return n4Var;
        }
        return n4Var2;
    }

    public static View y(View view) {
        org.telegram.ui.Components.dl0 dl0Var;
        if (view instanceof b2) {
            org.telegram.ui.Components.dl0 dl0Var2 = ((b2) view).d;
            if (dl0Var2 != null) {
                return y(dl0Var2.f5774a);
            }
            return view;
        } else if ((view instanceof e2) && (dl0Var = ((e2) view).d) != null) {
            return y(dl0Var.f5774a);
        } else {
            return view;
        }
    }

    public static TL_iv.PageBlock z(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof d4) {
            TL_iv.PageBlock pageBlock2 = ((d4) pageBlock).d;
            if (pageBlock2 != null) {
                return z(pageBlock2);
            }
            return pageBlock2;
        } else if (pageBlock instanceof f4) {
            TL_iv.PageBlock pageBlock3 = ((f4) pageBlock).d;
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
        boolean z4;
        float x10;
        ArrayList arrayList = this.f36359a0;
        int size = arrayList.size();
        a4 a4Var = this.H;
        boolean z10 = false;
        if (size <= 1) {
            ArticleViewer$WindowView articleViewer$WindowView = this.f36361c0;
            articleViewer$WindowView.e = false;
            articleViewer$WindowView.d = false;
            n0 n0Var = this.f36362d0;
            if (a4Var != null) {
                x10 = a4Var.F * a4Var.f32442c.getWidth();
            } else {
                x10 = n0Var.getX();
            }
            AnimatorSet animatorSet = new AnimatorSet();
            float measuredWidth = n0Var.getMeasuredWidth() - x10;
            if (a4Var != null) {
                animatorSet.playTogether(a4Var.d(1.0f));
            } else {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.f36362d0, View.TRANSLATION_X, n0Var.getMeasuredWidth()), ObjectAnimator.ofFloat(this.f36361c0, f36335a1, n0Var.getMeasuredWidth()));
            }
            animatorSet.setDuration(Math.max((int) ((420.0f / n0Var.getMeasuredWidth()) * measuredWidth), 250));
            animatorSet.setInterpolator(org.telegram.ui.Components.mr.h);
            animatorSet.addListener(new y0(this));
            animatorSet.start();
            this.Q0 = true;
            return;
        }
        ArticleViewer$WindowView articleViewer$WindowView2 = this.f36361c0;
        articleViewer$WindowView2.f20767f = true;
        articleViewer$WindowView2.e = true;
        articleViewer$WindowView2.h = this.F0;
        this.f36375r0[1].setVisibility(0);
        this.f36375r0[1].setAlpha(1.0f);
        this.f36375r0[1].setTranslationX(0.0f);
        r3 r3Var = this.f36375r0[0];
        if (a4Var == null) {
            color = 0;
        } else {
            color = this.f36367i0.getColor();
        }
        r3Var.setBackgroundColor(color);
        e0(-1, arrayList.get(arrayList.size() - 2), true);
        r3 r3Var2 = this.f36375r0[0];
        r3Var2.getX();
        AnimatorSet animatorSet2 = new AnimatorSet();
        r3Var2.getMeasuredWidth();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f36375r0[0], View.TRANSLATION_X, r3Var2.getMeasuredWidth()));
        animatorSet2.setDuration(420L);
        animatorSet2.setInterpolator(org.telegram.ui.Components.mr.h);
        animatorSet2.addListener(new z0(this));
        animatorSet2.start();
        o0 o0Var = this.f36363e0;
        r3 r3Var3 = this.f36375r0[0];
        if (r3Var3 != null && SharedConfig.adaptableColorInBrowser) {
            w02 = r3Var3.getBackgroundColor();
        } else {
            w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false);
        }
        o0Var.setMenuColors(w02);
        o0 o0Var2 = this.f36363e0;
        r3 r3Var4 = this.f36375r0[0];
        if (r3Var4 != null && SharedConfig.adaptableColorInBrowser) {
            w03 = r3Var4.getActionBarColor();
        } else {
            w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false);
        }
        o0Var2.d(w03, true);
        o0 o0Var3 = this.f36363e0;
        r3 r3Var5 = this.f36375r0[0];
        if (r3Var5 != null && r3Var5.e()) {
            z4 = true;
        } else {
            z4 = false;
        }
        o0Var3.setIsTonsite(z4);
        o0 o0Var4 = this.f36363e0;
        r3 r3Var6 = this.f36375r0[0];
        if (r3Var6 != null && r3Var6.d()) {
            z10 = true;
        }
        o0Var4.setIsLocal(z10);
        this.Q0 = true;
    }

    public final void H(int i10) {
        int color;
        int w02;
        int w03;
        boolean z4;
        float x10;
        ArrayList arrayList = this.f36359a0;
        int size = arrayList.size();
        a4 a4Var = this.H;
        boolean z10 = false;
        if (size <= 1) {
            ArticleViewer$WindowView articleViewer$WindowView = this.f36361c0;
            articleViewer$WindowView.e = false;
            articleViewer$WindowView.d = false;
            n0 n0Var = this.f36362d0;
            if (a4Var != null) {
                x10 = a4Var.F * a4Var.f32442c.getWidth();
            } else {
                x10 = n0Var.getX();
            }
            AnimatorSet animatorSet = new AnimatorSet();
            float measuredWidth = n0Var.getMeasuredWidth() - x10;
            if (a4Var != null) {
                animatorSet.playTogether(a4Var.d(1.0f));
            } else {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.f36362d0, View.TRANSLATION_X, n0Var.getMeasuredWidth()), ObjectAnimator.ofFloat(this.f36361c0, f36335a1, n0Var.getMeasuredWidth()));
            }
            animatorSet.setDuration(Math.max((int) ((420.0f / n0Var.getMeasuredWidth()) * measuredWidth), 250));
            animatorSet.setInterpolator(org.telegram.ui.Components.mr.h);
            animatorSet.addListener(new a1(this));
            animatorSet.start();
            this.Q0 = true;
            return;
        }
        this.f36361c0.f20767f = true;
        this.f36375r0[1].setVisibility(0);
        this.f36375r0[1].setAlpha(1.0f);
        this.f36375r0[1].setTranslationX(0.0f);
        r3 r3Var = this.f36375r0[0];
        if (a4Var == null) {
            color = 0;
        } else {
            color = this.f36367i0.getColor();
        }
        r3Var.setBackgroundColor(color);
        e0(-1, arrayList.get(i10), true);
        r3 r3Var2 = this.f36375r0[0];
        r3Var2.getX();
        AnimatorSet animatorSet2 = new AnimatorSet();
        r3Var2.getMeasuredWidth();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f36375r0[0], View.TRANSLATION_X, r3Var2.getMeasuredWidth()));
        animatorSet2.setDuration(420L);
        animatorSet2.setInterpolator(org.telegram.ui.Components.mr.h);
        animatorSet2.addListener(new b1(this, i10));
        animatorSet2.start();
        o0 o0Var = this.f36363e0;
        r3 r3Var3 = this.f36375r0[0];
        if (r3Var3 != null && SharedConfig.adaptableColorInBrowser) {
            w02 = r3Var3.getBackgroundColor();
        } else {
            w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false);
        }
        o0Var.setMenuColors(w02);
        o0 o0Var2 = this.f36363e0;
        r3 r3Var4 = this.f36375r0[0];
        if (r3Var4 != null && SharedConfig.adaptableColorInBrowser) {
            w03 = r3Var4.getActionBarColor();
        } else {
            w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false);
        }
        o0Var2.d(w03, true);
        o0 o0Var3 = this.f36363e0;
        r3 r3Var5 = this.f36375r0[0];
        if (r3Var5 != null && r3Var5.e()) {
            z4 = true;
        } else {
            z4 = false;
        }
        o0Var3.setIsTonsite(z4);
        o0 o0Var4 = this.f36363e0;
        r3 r3Var6 = this.f36375r0[0];
        if (r3Var6 != null && r3Var6.d()) {
            z10 = true;
        }
        o0Var4.setIsLocal(z10);
        this.Q0 = true;
    }

    public final boolean J() {
        ArrayList arrayList = this.f36359a0;
        if (arrayList.size() <= 0 || !(arrayList.get(0) instanceof TLRPC.WebPage)) {
            return false;
        }
        return true;
    }

    public final void M() {
        this.S = false;
        int i10 = 0;
        while (true) {
            r3[] r3VarArr = this.f36375r0;
            if (i10 < r3VarArr.length) {
                r3VarArr[i10].b();
                i10++;
            } else {
                try {
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
        this.I.getWindow().clearFlags(128);
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.K;
            if (i11 < arrayList.size()) {
                ((w1) arrayList.get(i11)).a(false);
                i11++;
            } else {
                this.f36362d0.post(new d0(this, 0));
                NotificationCenter.getInstance(this.U).lambda$postNotificationNameOnUIThread$1(NotificationCenter.articleClosed, new Object[0]);
                return;
            }
        }
    }

    public final boolean N(MessageObject messageObject, TLRPC.WebPage webPage, String str, String str2) {
        TLRPC.WebPage webPage2;
        String str3;
        boolean z4;
        int lastIndexOf;
        boolean z10;
        ?? r52;
        String str4;
        int i10;
        String lowerCase;
        TL_iv.Page page;
        if (this.I == null) {
            return false;
        }
        a4 a4Var = this.H;
        if (a4Var == null && this.S) {
            return false;
        }
        org.telegram.ui.ActionBar.p2 p2Var = this.J;
        if (p2Var != null && (p2Var.getParentLayout() instanceof ActionBarLayout)) {
            AndroidUtilities.hideKeyboard((ActionBarLayout) this.J.getParentLayout());
        }
        if (messageObject != null) {
            if (webPage == null) {
                webPage2 = messageObject.messageOwner.media.webpage;
            } else {
                webPage2 = webPage;
            }
            if (webPage2 != null && (page = webPage2.cached_page) != null && page.local != null) {
                z4 = true;
            } else {
                z4 = false;
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
            z4 = false;
        }
        ArrayList arrayList = this.f36359a0;
        if (a4Var != null && !arrayList.isEmpty()) {
            z10 = z4;
            r52 = 1;
        } else {
            z10 = z4;
            r52 = 0;
        }
        if (r52 == 0) {
            arrayList.clear();
            this.f36362d0.setTranslationX(0.0f);
            if (a4Var != null) {
                a4Var.F = 0.0f;
                a4Var.f32442c.invalidate();
                a4Var.i();
                a4Var.h();
            }
            this.f36362d0.setTranslationY(0.0f);
            this.f36375r0[0].setTranslationY(0.0f);
            this.f36375r0[0].setTranslationX(0.0f);
            this.f36375r0[1].setTranslationX(0.0f);
            this.f36375r0[0].setAlpha(1.0f);
            this.f36361c0.setInnerTranslationX(0.0f);
            this.f36375r0[0].g();
            X(AndroidUtilities.dp(56.0f));
        }
        if (a4Var != null && org.telegram.ui.web.c1.M0) {
            a4Var.f32440a.lock();
        }
        if (webPage2 != null) {
            boolean h = h(webPage2, str3, r52);
            if (!z10) {
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
                ConnectionsManager.getInstance(i13).sendRequest(tL_messages_getWebPage, new j0(this, i13, webPage2, messageObject, (boolean) r52, str4));
            }
        } else {
            g(r52, str2);
        }
        o0 o0Var = this.f36363e0;
        if (o0Var != null && r52 == 0) {
            o0Var.setIsLocal(this.f36375r0[0].d());
        }
        this.Q = null;
        if (a4Var != null) {
            if (r52 == 0) {
                AndroidUtilities.removeFromParent(this.f36361c0);
                a4Var.d = this.f36361c0;
                a4Var.n();
                a4Var.f32442c.addView(this.f36361c0, k7.b6.c(-1.0f, -1));
            }
        } else if (!this.S) {
            WindowManager windowManager = (WindowManager) this.I.getSystemService("window");
            if (this.T) {
                try {
                    windowManager.removeView(this.f36361c0);
                } catch (Exception unused) {
                }
            }
            try {
                WindowManager.LayoutParams layoutParams = this.f36360b0;
                layoutParams.flags = -2013200384;
                if (Build.VERSION.SDK_INT >= 28) {
                    layoutParams.layoutInDisplayCutoutMode = 1;
                }
                this.f36361c0.setFocusable(false);
                this.f36362d0.setFocusable(false);
                windowManager.addView(this.f36361c0, this.f36360b0);
            } catch (Exception e6) {
                FileLog.e(e6);
                return false;
            }
        } else {
            this.f36360b0.flags &= -17;
            ((WindowManager) this.I.getSystemService("window")).updateViewLayout(this.f36361c0, this.f36360b0);
        }
        this.S = true;
        this.W = 1;
        if (r52 == 0) {
            if (a4Var != null) {
                if (r52 != 0) {
                    a4Var.f32440a.unlock();
                } else if (!a4Var.h) {
                    a4Var.g(a4Var.f32441b);
                    a4Var.f();
                }
            } else {
                this.f36361c0.setAlpha(0.0f);
                this.f36362d0.setAlpha(0.0f);
                AnimatorSet animatorSet = new AnimatorSet();
                ArticleViewer$WindowView articleViewer$WindowView = this.f36361c0;
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(articleViewer$WindowView, property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f36362d0, property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f36361c0, View.TRANSLATION_X, AndroidUtilities.dp(56.0f), 0.0f));
                this.X = new d0(this, 1);
                animatorSet.setDuration(150L);
                animatorSet.setInterpolator(this.Z);
                animatorSet.addListener(new v0(this));
                this.Y = System.currentTimeMillis();
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.h(16, this, animatorSet));
            }
        }
        this.f36362d0.setLayerType(2, null);
        return true;
    }

    public final void P(long j10, TLRPC.User user) {
        if (user != null && (this.I instanceof LaunchActivity)) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f19306id);
            bundle.putString("botUser", "webpage" + j10);
            ((LaunchActivity) this.I).q0(new zn(bundle), false, true);
            o(false, true);
        }
    }

    public final void Q(String str, String str2, m0 m0Var) {
        Activity activity = this.I;
        if (activity != null && !activity.isFinishing()) {
            r3 r3Var = this.f36375r0[0];
            if (r3Var != null && r3Var.d()) {
                String string = LocaleController.getString(R.string.OpenUrlAlert2);
                int indexOf = string.indexOf("%");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(String.format(string, str));
                if (indexOf >= 0) {
                    spannableStringBuilder.setSpan(new URLSpan(str), indexOf, str.length() + indexOf, 33);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.I, 0, null);
                String string2 = LocaleController.getString(R.string.OpenUrlTitle);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
                d2Var.O = string2;
                d2Var.Q = spannableStringBuilder;
                d2Var.f19564c0 = false;
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.Open), new a1.d(this, str, str2, m0Var, 4));
                alertDialog$Builder.o();
                return;
            }
            R(str, str2, m0Var);
        }
    }

    public final void R(String str, String str2, ze.c cVar) {
        a4 a4Var;
        ze.c cVar2 = this.J0;
        if (cVar2 != null) {
            cVar2.a(false);
        }
        this.J0 = cVar;
        if (this.C0 != 0) {
            ConnectionsManager.getInstance(this.U).cancelRequest(this.C0, false);
            this.C0 = 0;
        }
        boolean[] zArr = new boolean[1];
        if (ze.d.l(this.I, str, false)) {
            if (this.f36359a0.isEmpty() && (a4Var = this.H) != null) {
                a4Var.dismiss(false);
                return;
            }
            return;
        }
        i0 i0Var = new i0(this, str, zArr, cVar);
        int i10 = this.E0 + 1;
        this.E0 = i10;
        b0(true);
        TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
        tL_messages_getWebPage.url = str;
        tL_messages_getWebPage.hash = 0;
        this.C0 = ConnectionsManager.getInstance(this.U).sendRequest(tL_messages_getWebPage, new org.telegram.messenger.li(this, i10, cVar, str2, i0Var, tL_messages_getWebPage));
        if (cVar != null) {
            cVar.f47468b = new ah.a(this, i10, cVar, 21);
            cVar.d();
        }
    }

    public final void S() {
        int w02;
        int w03;
        TextView textView = this.f36382y0;
        if (textView != null) {
            textView.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19971i6, false), 2, -1));
            this.f36382y0.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E8, false));
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f36381x0;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G8, false));
        }
        ImageView imageView = this.f36372o0;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false), PorterDuff.Mode.MULTIPLY));
            this.f36372o0.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20275z8, false), 1, -1));
        }
        ImageView imageView2 = this.f36373p0;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false), PorterDuff.Mode.MULTIPLY));
            this.f36373p0.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20275z8, false), 1, -1));
        }
        org.telegram.ui.Components.k6 k6Var = this.f36374q0;
        if (k6Var != null) {
            k6Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        }
        o0 o0Var = this.f36363e0;
        if (o0Var != null) {
            r3 r3Var = this.f36375r0[0];
            if (r3Var != null && SharedConfig.adaptableColorInBrowser) {
                w02 = r3Var.getBackgroundColor();
            } else {
                w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false);
            }
            o0Var.setMenuColors(w02);
            o0 o0Var2 = this.f36363e0;
            r3 r3Var2 = this.f36375r0[0];
            if (r3Var2 != null && SharedConfig.adaptableColorInBrowser) {
                w03 = r3Var2.getActionBarColor();
            } else {
                w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false);
            }
            o0Var2.d(w03, true);
        }
        this.f36367i0.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false));
    }

    public final void U() {
        int L0;
        int i10;
        boolean z4 = false;
        r3 r3Var = this.f36375r0[0];
        if (r3Var.f37685c.B != null && (L0 = r3Var.d.L0()) != -1) {
            View m9 = this.f36375r0[0].d.m(L0);
            if (m9 != null) {
                i10 = m9.getTop();
            } else {
                i10 = 0;
            }
            String str = "article" + this.f36375r0[0].f37685c.B.f19312id;
            SharedPreferences.Editor putInt = ApplicationLoader.applicationContext.getSharedPreferences("articles", 0).edit().putInt(str, L0).putInt(str + "o", i10);
            String k10 = vh.w2.k(str, "r");
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                z4 = true;
            }
            putInt.putBoolean(k10, z4).commit();
        }
    }

    public final boolean V(String str, boolean z4) {
        String lowerCase;
        int i10;
        Integer num = 0;
        if (!TextUtils.isEmpty(str)) {
            String lowerCase2 = str.toLowerCase();
            Integer num2 = (Integer) this.f36375r0[0].f37685c.h.get(lowerCase2);
            if (num2 != null) {
                TL_iv.textAnchor textanchor = (TL_iv.textAnchor) this.f36375r0[0].f37685c.f35644r.get(lowerCase2);
                if (textanchor != null) {
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    if (!TextUtils.isEmpty(this.f36375r0[0].f37685c.B.cached_page.url)) {
                        lowerCase = this.f36375r0[0].f37685c.B.cached_page.url.toLowerCase();
                    } else {
                        lowerCase = this.f36375r0[0].f37685c.B.url.toLowerCase();
                    }
                    pageblockparagraph.text = org.telegram.ui.web.h2.d(textanchor.text, lowerCase, lowerCase2);
                    this.f36375r0[0].f37685c.getClass();
                    int I = l4.I(pageblockparagraph);
                    f2.l1 x10 = this.f36375r0[0].f37685c.x(null, I);
                    View view = x10.f5774a;
                    this.f36375r0[0].f37685c.H(I, x10, pageblockparagraph, 0, 0, false);
                    org.telegram.ui.ActionBar.g3 g3Var = new org.telegram.ui.ActionBar.g3(this.I, null, false, false);
                    g3Var.fixNavigationBar();
                    g3Var.applyTopPadding = false;
                    g3Var.applyBottomPadding = false;
                    LinearLayout linearLayout = new LinearLayout(this.I);
                    linearLayout.setOrientation(1);
                    org.telegram.ui.Cells.l9 l9Var = new org.telegram.ui.Cells.l9();
                    this.M0 = l9Var;
                    l9Var.T(linearLayout);
                    this.M0.D = new nh.h2(this, 1);
                    gg.q qVar = new gg.q(this.I, 3);
                    qVar.setTextSize(1, 16.0f);
                    qVar.setTypeface(AndroidUtilities.bold());
                    qVar.setText(LocaleController.getString(R.string.InstantViewReference));
                    if (this.f36375r0[0].f37685c.D) {
                        i10 = 5;
                    } else {
                        i10 = 3;
                    }
                    qVar.setGravity(i10 | 16);
                    qVar.setTextColor(b());
                    qVar.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                    linearLayout.addView(qVar, new LinearLayout.LayoutParams(-1, AndroidUtilities.dp(48.0f) + 1));
                    view.setTag("bottomSheet");
                    linearLayout.addView(view, k7.b6.k(0.0f, 7.0f, 0.0f, 0.0f, -1, -2));
                    org.telegram.ui.Cells.x9 o10 = this.M0.o(this.I);
                    ah.e eVar = new ah.e(this, this.I, linearLayout, 7);
                    g3Var.setDelegate(new k0(this, 0));
                    eVar.addView(linearLayout, -1, -2);
                    eVar.addView(o10, -1, -2);
                    g3Var.customView = eVar;
                    if (this.L0.y()) {
                        this.L0.f(false);
                    }
                    this.F = g3Var;
                    a0(g3Var);
                    return true;
                } else if (num2.intValue() >= 0 && num2.intValue() < this.f36375r0[0].f37685c.e.size()) {
                    TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) this.f36375r0[0].f37685c.e.get(num2.intValue());
                    TL_iv.PageBlock z10 = z(pageBlock);
                    if ((z10 instanceof b4) && O((b4) z10)) {
                        this.f36375r0[0].f37685c.M();
                        this.f36375r0[0].f37685c.l();
                    }
                    int indexOf = this.f36375r0[0].f37685c.d.indexOf(pageBlock);
                    if (indexOf != -1) {
                        num2 = Integer.valueOf(indexOf);
                    }
                    Integer num3 = (Integer) this.f36375r0[0].f37685c.f35643n.get(lowerCase2);
                    if (num3 != null) {
                        if (num3.intValue() == -1) {
                            this.f36375r0[0].f37685c.getClass();
                            int I2 = l4.I(pageBlock);
                            f2.l1 x11 = this.f36375r0[0].f37685c.x(null, I2);
                            this.f36375r0[0].f37685c.H(I2, x11, pageBlock, 0, 0, false);
                            x11.f5774a.measure(View.MeasureSpec.makeMeasureSpec(this.f36375r0[0].f37684b.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                            Integer num4 = (Integer) this.f36375r0[0].f37685c.f35643n.get(lowerCase2);
                            if (num4.intValue() != -1) {
                                num = num4;
                            }
                        } else {
                            num = num3;
                        }
                    }
                    if (this.f36375r0[0].f37685c.E) {
                        num2 = Integer.valueOf(num2.intValue() + 1);
                    }
                    if (z4) {
                        org.telegram.ui.Components.zv0 zv0Var = new org.telegram.ui.Components.zv0(this.f36375r0[0].getContext());
                        zv0Var.f5712a = num2.intValue();
                        zv0Var.f31475s = (-AndroidUtilities.dp(56.0f)) - num.intValue();
                        this.f36375r0[0].d.w0(zv0Var);
                        return true;
                    }
                    this.f36375r0[0].d.h1(num2.intValue(), (-AndroidUtilities.dp(56.0f)) - num.intValue());
                    return true;
                }
            }
        }
        return false;
    }

    public final void W(int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.n4.W(int):void");
    }

    public final void X(int i10) {
        o0 o0Var = this.f36363e0;
        if (o0Var != null && !o0Var.Q && !o0Var.T) {
            int clamp = Utilities.clamp(i10, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(24.0f));
            this.F0 = clamp;
            this.f36363e0.setHeight(clamp);
            this.L0.f22639x = this.F0;
            int i11 = 0;
            while (true) {
                r3[] r3VarArr = this.f36375r0;
                if (i11 < r3VarArr.length) {
                    r3VarArr[i11].f37684b.setTopGlowOffset(this.F0);
                    i11++;
                } else {
                    return;
                }
            }
        }
    }

    public final void Y(Activity activity, org.telegram.ui.ActionBar.p2 p2Var) {
        kf.t0 t0Var;
        int i10;
        boolean z4;
        int w02;
        int i11;
        int i12;
        a4 a4Var;
        kf.t0 t0Var2 = this.R0;
        if (t0Var2 != null) {
            t0Var2.destroy();
            this.R0 = null;
        }
        LaunchActivity launchActivity = LaunchActivity.D1;
        if (launchActivity != null) {
            t0Var = new kf.t0(launchActivity, true);
        } else {
            t0Var = null;
        }
        this.R0 = t0Var;
        this.J = p2Var;
        if (!(p2Var instanceof ez)) {
            i10 = p2Var.getCurrentAccount();
        } else {
            i10 = UserConfig.selectedAccount;
        }
        this.U = i10;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
        NotificationCenter.getInstance(this.U).addObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(this.U).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(this.U).addObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(this.U).addObserver(this, NotificationCenter.emojiLoaded);
        Activity activity2 = this.I;
        if (activity2 != activity && (activity2 == null || !this.G || (a4Var = this.H) == null || a4Var.e == null)) {
            this.I = activity;
            this.f36980a = ApplicationLoader.applicationContext.getSharedPreferences("articles", 0).getInt("font_type", 0);
            r(this, false);
            this.f36367i0 = new Paint();
            this.f36368j0 = activity.getResources().getDrawable(R.drawable.layer_shadow);
            this.f36369k0 = new Paint();
            ArticleViewer$WindowView articleViewer$WindowView = new ArticleViewer$WindowView(this, activity);
            this.f36361c0 = articleViewer$WindowView;
            articleViewer$WindowView.setWillNotDraw(false);
            this.f36361c0.setClipChildren(true);
            this.f36361c0.setFocusable(false);
            n0 n0Var = new n0(this, activity, 0);
            this.f36362d0 = n0Var;
            this.f36361c0.addView(n0Var, k7.b6.e(-1, -1, 51));
            if (this.H == null) {
                this.f36361c0.setFitsSystemWindows(true);
                this.f36362d0.setOnApplyWindowInsetsListener(new org.telegram.ui.ActionBar.h3(1));
            }
            FrameLayout frameLayout = new FrameLayout(activity);
            this.M = frameLayout;
            frameLayout.setBackgroundColor(-16777216);
            this.M.setVisibility(4);
            this.f36361c0.addView(this.M, k7.b6.c(-1.0f, -1));
            q4 q4Var = new q4(activity);
            this.O = q4Var;
            q4Var.setVisibility(0);
            this.O.setBackgroundColor(-16777216);
            this.M.addView(this.O, k7.b6.e(-1, -1, 17));
            this.N = new TextureView(activity);
            this.f36375r0 = new r3[2];
            int i13 = 0;
            while (true) {
                r3[] r3VarArr = this.f36375r0;
                if (i13 >= r3VarArr.length) {
                    break;
                }
                r3 r3Var = new r3(this, activity);
                r3VarArr[i13] = r3Var;
                if (i13 == 0) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                r3Var.setVisibility(i12);
                this.f36362d0.addView(r3Var, k7.b6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
                r3Var.f37684b.setOnItemLongClickListener(new v(this));
                r3Var.f37684b.setOnItemClickListener(new mg.w(7, this, r3Var));
                i13++;
            }
            this.f36362d0.addView(new FrameLayout(activity), k7.b6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f36377t0.setColor(-16777216);
            this.f36378u0.setColor(-16777216);
            this.f36380w0.setColor(-14408666);
            this.f36379v0.setColor(-16777216);
            o0 o0Var = new o0(this, activity);
            this.f36363e0 = o0Var;
            if (this.H != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            o0Var.f39596b0 = z4;
            this.f36362d0.addView(o0Var, k7.b6.e(-1, -2, 48));
            this.f36363e0.setOnClickListener(new org.telegram.messenger.video.g(7, this, activity));
            this.f36363e0.V.addTextChangedListener(new p0(this, 0));
            org.telegram.ui.web.k kVar = new org.telegram.ui.web.k(activity);
            this.f36364f0 = kVar;
            kVar.setOpenProgress(0.0f);
            this.f36364f0.f39503w.j(new n3(this, 2));
            this.f36362d0.addView(this.f36364f0, k7.b6.c(-1.0f, -1));
            this.f36365g0 = new d0(this, 3);
            this.f36363e0.I.setOnClickListener(new u(this, 2));
            this.f36363e0.I.setOnLongClickListener(new w(this, 0));
            this.f36363e0.setMenuListener(new kh.a1(13, this, activity));
            this.f36363e0.L.setOnClickListener(new u(this, 3));
            dh.d dVar = new dh.d(this.I, 6);
            this.f36371n0 = dVar;
            dVar.setOnTouchListener(new oh.d(3));
            this.f36371n0.setWillNotDraw(false);
            this.f36371n0.setTranslationY(AndroidUtilities.dp(51.0f));
            this.f36371n0.setVisibility(4);
            this.f36371n0.setFocusable(true);
            this.f36371n0.setFocusableInTouchMode(true);
            this.f36371n0.setClickable(true);
            this.f36371n0.setPadding(0, AndroidUtilities.dp(3.0f), 0, 0);
            this.f36362d0.addView(this.f36371n0, k7.b6.e(-1, 51, 80));
            new ph.i3(this.f36361c0, false, new t(this, 0));
            ImageView imageView = new ImageView(this.I);
            this.f36372o0 = imageView;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            this.f36372o0.setImageResource(R.drawable.msg_go_up);
            ImageView imageView2 = this.f36372o0;
            int i14 = org.telegram.ui.ActionBar.j6.G6;
            int w03 = org.telegram.ui.ActionBar.j6.w0(null, i14, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            imageView2.setColorFilter(new PorterDuffColorFilter(w03, mode));
            ImageView imageView3 = this.f36372o0;
            int i15 = org.telegram.ui.ActionBar.j6.f20275z8;
            imageView3.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i15, false), 1, -1));
            this.f36371n0.addView(this.f36372o0, k7.b6.d(48, 48.0f, 53, 0.0f, 0.0f, 48.0f, 0.0f));
            this.f36372o0.setOnClickListener(new u(this, 0));
            this.f36372o0.setContentDescription(LocaleController.getString(R.string.AccDescrSearchNext));
            ImageView imageView4 = new ImageView(this.I);
            this.f36373p0 = imageView4;
            imageView4.setScaleType(scaleType);
            this.f36373p0.setImageResource(R.drawable.msg_go_down);
            this.f36373p0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i14, false), mode));
            this.f36373p0.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i15, false), 1, -1));
            this.f36371n0.addView(this.f36373p0, k7.b6.d(48, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f36373p0.setOnClickListener(new u(this, 1));
            this.f36373p0.setContentDescription(LocaleController.getString(R.string.AccDescrSearchPrev));
            org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(this.I, true, true, true);
            this.f36374q0 = k6Var;
            k6Var.setScaleProperty(0.6f);
            this.f36374q0.b(0.4f, 350L, org.telegram.ui.Components.mr.h);
            this.f36374q0.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
            this.f36374q0.setTextSize(AndroidUtilities.dp(15.0f));
            this.f36374q0.setTypeface(AndroidUtilities.bold());
            this.f36374q0.setGravity(3);
            this.f36374q0.getDrawable().G = AndroidUtilities.displaySize.x;
            this.f36371n0.addView(this.f36374q0, k7.b6.d(-2, -2.0f, 19, 18.0f, 0.0f, 108.0f, 0.0f));
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.f36360b0 = layoutParams;
            layoutParams.height = -1;
            layoutParams.format = -3;
            layoutParams.width = -1;
            layoutParams.gravity = 51;
            layoutParams.type = 98;
            layoutParams.softInputMode = 48;
            layoutParams.flags = 131072;
            if (this.H == null) {
                w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19827a7, true);
            } else {
                w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19827a7, false);
            }
            if (AndroidUtilities.computePerceivedBrightness(w02) >= 0.721f && Build.VERSION.SDK_INT >= 26) {
                i11 = 1808;
            } else {
                i11 = 1792;
            }
            this.f36379v0.setColor(w02);
            WindowManager.LayoutParams layoutParams2 = this.f36360b0;
            layoutParams2.systemUiVisibility = i11;
            layoutParams2.flags |= -2147417856;
            if (Build.VERSION.SDK_INT >= 28) {
                layoutParams2.layoutInDisplayCutoutMode = 1;
            }
            org.telegram.ui.Cells.l9 l9Var = new org.telegram.ui.Cells.l9();
            this.L0 = l9Var;
            l9Var.T(this.f36375r0[0].f37684b);
            if (MessagesController.getInstance(this.U).getTranslateController().isContextTranslateEnabled()) {
                this.L0.f22621l0 = new v(this);
            }
            org.telegram.ui.Cells.l9 l9Var2 = this.L0;
            l9Var2.E0 = this.f36375r0[0].d;
            l9Var2.D = new s0(this);
            this.f36362d0.addView(l9Var2.o(activity));
            n0 n0Var2 = this.f36362d0;
            cv0 cv0Var = new cv0(n0Var2, n0Var2);
            this.N0 = cv0Var;
            cv0Var.F = new v(this);
            cv0Var.E = new h(this, 1);
            this.f36367i0.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false));
            g0(this);
            return;
        }
        g0(this);
        S();
    }

    public final void Z(String str) {
        String str2;
        if (this.I == null) {
            return;
        }
        org.telegram.ui.ActionBar.g3 g3Var = this.F;
        if (g3Var != null) {
            g3Var.dismiss();
            this.F = null;
        }
        org.telegram.ui.ActionBar.g3 g3Var2 = new org.telegram.ui.ActionBar.g3(this.I, null, false, false);
        g3Var2.fixNavigationBar();
        try {
            str2 = URLDecoder.decode(str.replaceAll("\\+", "%2b"), "UTF-8");
        } catch (Exception e) {
            FileLog.e(e);
            str2 = str;
        }
        g3Var2.title = str2;
        g3Var2.bigTitle = false;
        g3Var2.multipleLinesTitle = true;
        CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
        cg.u1 u1Var = new cg.u1(1, this, str);
        g3Var2.items = charSequenceArr;
        g3Var2.onClickListener = u1Var;
        g3Var2.setOnHideListener(new x(this, 0));
        a0(g3Var2);
    }

    @Override
    public final int a() {
        return org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20256y6, false);
    }

    public final void a0(org.telegram.ui.ActionBar.g3 g3Var) {
        if (this.I != null) {
            try {
                org.telegram.ui.ActionBar.g3 g3Var2 = this.f36366h0;
                if (g3Var2 != null) {
                    g3Var2.dismiss();
                    this.f36366h0 = null;
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            try {
                this.f36366h0 = g3Var;
                g3Var.setCanceledOnTouchOutside(true);
                this.f36366h0.setOnDismissListener(new x(this, 1));
                g3Var.show();
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }
    }

    @Override
    public final int b() {
        return org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false);
    }

    public final void b0(boolean z4) {
        AndroidUtilities.cancelRunOnUIThread(this.f36365g0);
        if (z4) {
            this.f36363e0.f39594a0.a(0.0f, false);
            this.f36363e0.f39594a0.a(0.3f, true);
            AndroidUtilities.runOnUIThread(this.f36365g0, 100L);
            return;
        }
        this.f36363e0.f39594a0.a(1.0f, true);
    }

    @Override
    public final void c(l4 l4Var, org.telegram.ui.Components.o01 o01Var) {
        String str;
        String str2;
        org.telegram.ui.Components.g90 g90Var;
        String lowerCase;
        if (o01Var != null && (str = o01Var.f27424b) != null) {
            org.telegram.ui.ActionBar.g3 g3Var = this.F;
            m0 m0Var = null;
            if (g3Var != null) {
                g3Var.dismiss();
                this.F = null;
            }
            int lastIndexOf = str.lastIndexOf(35);
            boolean z4 = false;
            if (lastIndexOf != -1) {
                if (!TextUtils.isEmpty(l4Var.B.cached_page.url)) {
                    lowerCase = l4Var.B.cached_page.url.toLowerCase();
                } else {
                    lowerCase = l4Var.B.url.toLowerCase();
                }
                try {
                    str2 = URLDecoder.decode(str.substring(lastIndexOf + 1), "UTF-8");
                } catch (Exception unused) {
                    str2 = "";
                }
                if (lastIndexOf == 0 || str.toLowerCase().contains(lowerCase)) {
                    z4 = true;
                    V(str2, true);
                }
            } else {
                str2 = null;
            }
            if (!z4) {
                f3 f3Var = this.d;
                if (f3Var != null && (g90Var = this.f36981b) != null) {
                    m0Var = new m0(this, f3Var, g90Var);
                }
                Q(str, str2, m0Var);
            }
        }
    }

    public final void c0() {
        LaunchActivity launchActivity;
        FrameLayout frameLayout;
        if (this.T && (launchActivity = LaunchActivity.D1) != null && !launchActivity.isFinishing()) {
            if (this.f36375r0[0].f()) {
                if (this.f36375r0[0].getWebView() != null) {
                    frameLayout = this.f36375r0[0].f37686f;
                } else {
                    return;
                }
            } else {
                r3 r3Var = this.f36375r0[0];
                TLRPC.WebPage webPage = r3Var.f37685c.B;
                frameLayout = r3Var;
                if (webPage == null) {
                    return;
                }
            }
            new org.telegram.ui.Components.qc(frameLayout, null).G(R.raw.chats_infotip, 4, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BrowserExternalRestricted), new d0(this, 10))).k(true);
        }
    }

    @Override
    public final boolean d(TL_iv.PageBlock pageBlock, l4 l4Var) {
        int indexOf;
        List list;
        org.telegram.ui.ActionBar.p2 p2Var = this.J;
        if (p2Var != null && p2Var.getParentActivity() != null) {
            if ((pageBlock instanceof TL_iv.pageBlockVideo) && !k4.g(l4Var.B, pageBlock)) {
                list = Collections.singletonList(pageBlock);
                indexOf = 0;
            } else {
                ArrayList arrayList = new ArrayList(l4Var.f35642f);
                indexOf = l4Var.f35642f.indexOf(pageBlock);
                list = arrayList;
            }
            PhotoViewer t12 = PhotoViewer.t1();
            t12.K2(null, this.J, null);
            if (t12.e2(null, null, null, null, null, null, null, indexOf, new j3(this, list), null, 0L, 0L, 0L, true, new t3(this, l4Var.B, list), null)) {
                n();
                return true;
            }
        }
        return false;
    }

    public final void d0(boolean z4) {
        float f10;
        this.f36371n0.setVisibility(0);
        ValueAnimator valueAnimator = this.U0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.V0;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.U0 = ofFloat;
        ofFloat.addUpdateListener(new s(this, 1));
        this.U0.addListener(new dg.w2(11, this, z4));
        this.U0.setDuration(320L);
        this.U0.setInterpolator(org.telegram.ui.Components.mr.h);
        this.U0.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        d1 d1Var;
        MessageObject messageObject;
        if (i10 == NotificationCenter.messagePlayingDidStart) {
            MessageObject messageObject2 = (MessageObject) objArr[0];
            if (this.f36375r0 != null) {
                int i12 = 0;
                while (true) {
                    r3[] r3VarArr = this.f36375r0;
                    if (i12 < r3VarArr.length) {
                        int childCount = r3VarArr[i12].f37684b.getChildCount();
                        for (int i13 = 0; i13 < childCount; i13++) {
                            View childAt = this.f36375r0[i12].f37684b.getChildAt(i13);
                            if (childAt instanceof d1) {
                                ((d1) childAt).a(true);
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
                if (this.f36375r0 != null) {
                    int i14 = 0;
                    while (true) {
                        r3[] r3VarArr2 = this.f36375r0;
                        if (i14 < r3VarArr2.length) {
                            int childCount2 = r3VarArr2[i14].f37684b.getChildCount();
                            int i15 = 0;
                            while (true) {
                                if (i15 < childCount2) {
                                    View childAt2 = this.f36375r0[i14].f37684b.getChildAt(i15);
                                    if ((childAt2 instanceof d1) && (messageObject = (d1Var = (d1) childAt2).getMessageObject()) != null && messageObject.getId() == num.intValue()) {
                                        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                                        if (playingMessageObject != null) {
                                            messageObject.audioProgress = playingMessageObject.audioProgress;
                                            messageObject.audioProgressSec = playingMessageObject.audioProgressSec;
                                            messageObject.audioPlayerDuration = playingMessageObject.audioPlayerDuration;
                                            d1Var.b();
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
            } else if (i10 == NotificationCenter.emojiLoaded && this.f36375r0 != null) {
                int i16 = 0;
                while (true) {
                    r3[] r3VarArr3 = this.f36375r0;
                    if (i16 < r3VarArr3.length) {
                        int childCount3 = r3VarArr3[i16].f37684b.getChildCount();
                        for (int i17 = 0; i17 < childCount3; i17++) {
                            View childAt3 = this.f36375r0[i16].f37684b.getChildAt(i17);
                            if (childAt3 instanceof y2) {
                                ((y2) childAt3).e.invalidate();
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
        } else if (this.f36375r0 != null) {
            int i18 = 0;
            while (true) {
                r3[] r3VarArr4 = this.f36375r0;
                if (i18 < r3VarArr4.length) {
                    int childCount4 = r3VarArr4[i18].f37684b.getChildCount();
                    for (int i19 = 0; i19 < childCount4; i19++) {
                        View childAt4 = this.f36375r0[i18].f37684b.getChildAt(i19);
                        if (childAt4 instanceof d1) {
                            d1 d1Var2 = (d1) childAt4;
                            if (d1Var2.getMessageObject() != null) {
                                d1Var2.a(true);
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

    public final void e0(int i10, Object obj, boolean z4) {
        int dp;
        int i11;
        int i12;
        int i13;
        int color;
        int w02;
        int w03;
        boolean z10;
        boolean z11;
        if (obj != null) {
            if (((obj instanceof TLRPC.WebPage) && ((TLRPC.WebPage) obj).cached_page != null) || (obj instanceof d3)) {
                int i14 = 1;
                if (!z4 && i10 != 0) {
                    r3[] r3VarArr = this.f36375r0;
                    r3 r3Var = r3VarArr[1];
                    r3VarArr[1] = r3VarArr[0];
                    r3VarArr[0] = r3Var;
                    this.f36363e0.i();
                    this.W0.a(this.f36375r0[0].getBackgroundColor(), true);
                    this.X0.a(this.f36375r0[1].getBackgroundColor(), true);
                    a4 a4Var = this.H;
                    if (a4Var != null) {
                        a4Var.m();
                    }
                    int indexOfChild = this.f36362d0.indexOfChild(this.f36375r0[0]);
                    int indexOfChild2 = this.f36362d0.indexOfChild(this.f36375r0[1]);
                    if (i10 == 1) {
                        if (indexOfChild < indexOfChild2) {
                            this.f36362d0.removeView(this.f36375r0[0]);
                            this.f36362d0.addView(this.f36375r0[0], indexOfChild2);
                        }
                    } else if (indexOfChild2 < indexOfChild) {
                        this.f36362d0.removeView(this.f36375r0[0]);
                        this.f36362d0.addView(this.f36375r0[0], indexOfChild);
                    }
                    this.f36376s0 = new AnimatorSet();
                    this.f36375r0[0].setVisibility(0);
                    if (i10 == 1) {
                        i13 = 0;
                    } else {
                        i13 = 1;
                    }
                    r3 r3Var2 = this.f36375r0[i13];
                    if (this.H == null) {
                        color = 0;
                    } else {
                        color = this.f36367i0.getColor();
                    }
                    r3Var2.setBackgroundColor(color);
                    this.f36375r0[i13].setLayerType(2, null);
                    if (i10 == 1) {
                        this.f36375r0[0].setTranslationX(AndroidUtilities.displaySize.x);
                        this.f36376s0.playTogether(ObjectAnimator.ofFloat(this.f36375r0[0], View.TRANSLATION_X, AndroidUtilities.displaySize.x, 0.0f));
                    } else if (i10 == -1) {
                        this.f36375r0[0].setTranslationX(0.0f);
                        this.f36376s0.playTogether(ObjectAnimator.ofFloat(this.f36375r0[1], View.TRANSLATION_X, 0.0f, AndroidUtilities.displaySize.x));
                    }
                    this.f36376s0.setDuration(320L);
                    this.f36376s0.setInterpolator(org.telegram.ui.Components.mr.h);
                    this.f36376s0.addListener(new x0(this, i13, 0));
                    this.f36361c0.f20767f = true;
                    o0 o0Var = this.f36363e0;
                    r3 r3Var3 = this.f36375r0[0];
                    if (r3Var3 != null && SharedConfig.adaptableColorInBrowser) {
                        w02 = r3Var3.getBackgroundColor();
                    } else {
                        w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false);
                    }
                    o0Var.setMenuColors(w02);
                    o0 o0Var2 = this.f36363e0;
                    r3 r3Var4 = this.f36375r0[0];
                    if (r3Var4 != null && SharedConfig.adaptableColorInBrowser) {
                        w03 = r3Var4.getActionBarColor();
                    } else {
                        w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false);
                    }
                    o0Var2.d(w03, true);
                    o0 o0Var3 = this.f36363e0;
                    r3 r3Var5 = this.f36375r0[0];
                    if (r3Var5 != null && r3Var5.e()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    o0Var3.setIsTonsite(z10);
                    o0 o0Var4 = this.f36363e0;
                    r3 r3Var6 = this.f36375r0[0];
                    if (r3Var6 != null && r3Var6.d()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    o0Var4.setIsLocal(z11);
                    AnimatorSet animatorSet = this.f36376s0;
                    Objects.requireNonNull(animatorSet);
                    AndroidUtilities.runOnUIThread(new yt0(animatorSet, 4));
                }
                if (!z4) {
                    this.L0.f(true);
                }
                l4 l4Var = this.f36375r0[z4 ? 1 : 0].f37685c;
                if (z4) {
                    obj = kf.k0.i(2, this.f36359a0);
                }
                this.f36375r0[z4 ? 1 : 0].b();
                if (obj instanceof TLRPC.WebPage) {
                    TLRPC.WebPage webPage = (TLRPC.WebPage) obj;
                    this.f36375r0[z4 ? 1 : 0].setWeb(null);
                    this.f36375r0[z4 ? 1 : 0].setType(0);
                    TL_iv.Page page = webPage.cached_page;
                    l4Var.D = page.rtl;
                    l4Var.B = webPage;
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
                                        l4Var.C = (TL_iv.pageBlockChannel) pageBlock2;
                                    }
                                }
                            }
                        } else if (i15 == 1 && l4Var.C != null) {
                        }
                        if (i15 == size - 1) {
                            i12 = i15;
                        } else {
                            i12 = 0;
                        }
                        l4Var.F(l4Var, pageBlock, 0, 0, i12);
                    }
                    l4Var.l();
                    if (this.f36359a0.size() != 1 && i10 != -1) {
                        f2.i0 i0Var = this.f36375r0[z4 ? 1 : 0].d;
                        a4 a4Var2 = this.H;
                        if (a4Var2 == null) {
                            i14 = 0;
                        }
                        if (a4Var2 != null) {
                            i11 = AndroidUtilities.dp(32.0f);
                        } else {
                            i11 = 0;
                        }
                        i0Var.h1(i14, i11);
                    } else {
                        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("articles", 0);
                        String str = "article" + webPage.f19312id;
                        int i16 = sharedPreferences.getInt(str, -1);
                        boolean z12 = sharedPreferences.getBoolean(str + "r", true);
                        Point point = AndroidUtilities.displaySize;
                        if (point.x <= point.y) {
                            i14 = 0;
                        }
                        if (z12 == i14) {
                            dp = sharedPreferences.getInt(str + "o", 0) - this.f36375r0[z4 ? 1 : 0].f37684b.getPaddingTop();
                        } else {
                            dp = AndroidUtilities.dp(10.0f);
                        }
                        if (i16 != -1) {
                            this.f36375r0[z4 ? 1 : 0].d.h1(i16, dp);
                        }
                    }
                } else if (obj instanceof d3) {
                    this.f36375r0[z4 ? 1 : 0].setType(1);
                    this.f36375r0[z4 ? 1 : 0].g();
                    this.f36375r0[z4 ? 1 : 0].setWeb((d3) obj);
                }
                if (!z4) {
                    m(null);
                }
                i0(false);
                f0();
            }
        }
    }

    public final void f0() {
        r3[] r3VarArr;
        r3 r3Var;
        float translationX;
        boolean z4;
        boolean z10;
        r3 r3Var2;
        float f10;
        boolean z11;
        boolean z12;
        if (this.f36363e0 != null && (r3Var = (r3VarArr = this.f36375r0)[0]) != null && r3VarArr[1] != null) {
            int visibility = r3Var.getVisibility();
            float f11 = 0.0f;
            if (visibility != 0) {
                translationX = 0.0f;
            } else {
                translationX = 1.0f - (this.f36375r0[0].getTranslationX() / this.f36375r0[0].getWidth());
            }
            float f12 = 1.0f - translationX;
            o0 o0Var = this.f36363e0;
            o0Var.d[0] = this.f36375r0[0].getProgress();
            o0Var.invalidate();
            o0 o0Var2 = this.f36363e0;
            o0Var2.d[1] = this.f36375r0[1].getProgress();
            o0Var2.invalidate();
            this.f36363e0.setTransitionProgress(f12);
            o0 o0Var3 = this.f36363e0;
            if (!o0Var3.T && !o0Var3.Q) {
                ArticleViewer$WindowView articleViewer$WindowView = this.f36361c0;
                if (articleViewer$WindowView.e || articleViewer$WindowView.f20767f) {
                    boolean J = J();
                    ArrayList arrayList = this.f36359a0;
                    if (!J && arrayList.size() <= 1) {
                        this.f36363e0.M.f();
                        this.f36363e0.setBackButtonCached(false);
                    } else {
                        if (!this.f36375r0[0].f37689s && arrayList.size() <= 1) {
                            f10 = 0.0f;
                        } else {
                            f10 = 1.0f;
                        }
                        float lerp = AndroidUtilities.lerp(f10, (this.f36375r0[1].f37689s || arrayList.size() > 2) ? 1.0f : 1.0f, f12);
                        this.f36363e0.J.c(1.0f - lerp, false);
                        this.f36363e0.M.f();
                        o0 o0Var4 = this.f36363e0;
                        if (lerp > 0.5f) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        o0Var4.setBackButtonCached(z11);
                    }
                    this.f36363e0.setHasForward(this.f36375r0[0].v);
                    this.f36363e0.setIsLocal(this.f36375r0[0].d());
                    o0 o0Var5 = this.f36363e0;
                    if (this.f36375r0[0].getWebView() != null && this.f36375r0[0].getWebView().f39652b) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    o0Var5.setIsLoaded(z12);
                }
            }
            o0 o0Var6 = this.f36363e0;
            int actionBarColor = this.f36375r0[0].getActionBarColor();
            ArticleViewer$WindowView articleViewer$WindowView2 = this.f36361c0;
            if (!articleViewer$WindowView2.e && !articleViewer$WindowView2.f20767f) {
                z4 = false;
            } else {
                z4 = true;
            }
            o0Var6.b(0, this.W0.a(actionBarColor, z4));
            o0 o0Var7 = this.f36363e0;
            int actionBarColor2 = this.f36375r0[1].getActionBarColor();
            ArticleViewer$WindowView articleViewer$WindowView3 = this.f36361c0;
            if (!articleViewer$WindowView3.e && !articleViewer$WindowView3.f20767f) {
                z10 = false;
            } else {
                z10 = true;
            }
            o0Var7.b(1, this.X0.a(actionBarColor2, z10));
            this.f36363e0.d(i0.a.d(f12, this.f36375r0[0].getActionBarColor(), this.f36375r0[1].getActionBarColor()), false);
            o0 o0Var8 = this.f36363e0;
            if (translationX > 0.5f) {
                r3Var2 = this.f36375r0[0];
            } else {
                r3Var2 = this.f36375r0[1];
            }
            o0Var8.setMenuType(r3Var2.f37683a);
            a4 a4Var = this.H;
            if (a4Var != null) {
                a4Var.f32442c.invalidate();
                return;
            }
            ArticleViewer$WindowView articleViewer$WindowView4 = this.f36361c0;
            if (articleViewer$WindowView4 != null) {
                articleViewer$WindowView4.invalidate();
            }
        }
    }

    public final void g(int i10, String str) {
        U();
        org.telegram.ui.ActionBar.m3 m3Var = new org.telegram.ui.ActionBar.m3();
        m3Var.f20442x = str;
        this.f36359a0.add(m3Var);
        this.f36363e0.h(false);
        e0(i10, m3Var, false);
    }

    public final boolean h(TLRPC.WebPage webPage, String str, int i10) {
        U();
        this.f36359a0.add(webPage);
        this.f36363e0.h(false);
        e0(i10, webPage, false);
        return V(str, false);
    }

    public final void h0() {
        int i10;
        int size;
        boolean z4;
        boolean z10;
        float f10;
        if (this.B == null && !this.f36375r0[0].f()) {
            return;
        }
        if (this.f36375r0[0].f()) {
            if (this.f36375r0[0].getWebView() == null) {
                i10 = 0;
            } else {
                i10 = this.f36375r0[0].getWebView().getSearchIndex();
            }
            if (this.f36375r0[0].getWebView() == null) {
                size = 0;
            } else {
                size = this.f36375r0[0].getWebView().getSearchCount();
            }
        } else {
            i10 = this.D;
            size = this.B.size();
        }
        ImageView imageView = this.f36372o0;
        if (size > 0 && i10 != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        imageView.setEnabled(z4);
        ImageView imageView2 = this.f36373p0;
        if (size > 0 && i10 != size - 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        imageView2.setEnabled(z10);
        ImageView imageView3 = this.f36372o0;
        float f11 = 0.5f;
        if (imageView3.isEnabled()) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        imageView3.setAlpha(f10);
        ImageView imageView4 = this.f36373p0;
        if (imageView4.isEnabled()) {
            f11 = 1.0f;
        }
        imageView4.setAlpha(f11);
        this.f36374q0.a();
        if (size < 0) {
            this.f36374q0.setText("");
        } else if (size == 0) {
            this.f36374q0.setText(LocaleController.getString(R.string.NoResult));
        } else if (size == 1) {
            this.f36374q0.setText(LocaleController.getString(R.string.OneResult));
        } else {
            this.f36374q0.setText(String.format(LocaleController.getPluralString("CountOfResults", size), Integer.valueOf(i10 + 1), Integer.valueOf(size)));
        }
    }

    public final void i0(boolean z4) {
        boolean z10;
        boolean z11 = false;
        this.f36363e0.g(0, this.f36375r0[0].getTitle(), z4);
        this.f36363e0.f(0, this.f36375r0[0].getSubtitle());
        o0 o0Var = this.f36363e0;
        if (this.f36375r0[0].f() && this.f36375r0[0].getWebView() != null && this.f36375r0[0].getWebView().B) {
            z10 = true;
        } else {
            z10 = false;
        }
        o0Var.e(0, z10);
        this.f36363e0.g(1, this.f36375r0[1].getTitle(), z4);
        this.f36363e0.f(1, this.f36375r0[1].getSubtitle());
        o0 o0Var2 = this.f36363e0;
        if (this.f36375r0[1].f() && this.f36375r0[1].getWebView() != null && this.f36375r0[1].getWebView().B) {
            z11 = true;
        }
        o0Var2.e(1, z11);
    }

    public final void k() {
        this.G0 = false;
        e3 e3Var = this.H0;
        if (e3Var != null) {
            this.f36361c0.removeCallbacks(e3Var);
            this.H0 = null;
        }
        e3 e3Var2 = this.I0;
        if (e3Var2 != null) {
            this.f36361c0.removeCallbacks(e3Var2);
            this.I0 = null;
        }
    }

    public final void m(org.telegram.messenger.c6 c6Var) {
        if (this.F0 == AndroidUtilities.dp(56.0f)) {
            if (c6Var != null) {
                c6Var.run();
                return;
            }
            return;
        }
        ValueAnimator duration = ValueAnimator.ofObject(new IntEvaluator(), Integer.valueOf(this.F0), Integer.valueOf(AndroidUtilities.dp(56.0f))).setDuration(180L);
        duration.setInterpolator(new DecelerateInterpolator());
        duration.addUpdateListener(new s(this, 0));
        duration.addListener(new u0(0, c6Var));
        if (c6Var != null) {
            duration.setDuration(duration.getDuration() / 2);
        }
        duration.start();
    }

    public final void n() {
        long j10;
        b3 b3Var;
        m3 m3Var = this.f36375r0[0].f37684b;
        if (m3Var != null && this.T) {
            float measuredHeight = m3Var.getMeasuredHeight() / 2.0f;
            Uri uri = null;
            float f10 = 0.0f;
            b3 b3Var2 = null;
            for (int i10 = 0; i10 < m3Var.getChildCount(); i10++) {
                View childAt = m3Var.getChildAt(i10);
                if (childAt instanceof b3) {
                    float measuredHeight2 = (childAt.getMeasuredHeight() / 2.0f) + childAt.getTop();
                    if (b3Var2 == null || Math.abs(measuredHeight - measuredHeight2) < Math.abs(measuredHeight - f10)) {
                        b3Var2 = (b3) childAt;
                        f10 = measuredHeight2;
                    }
                }
            }
            boolean z4 = PhotoViewer.t1().f31714f;
            if (z4 || ((b3Var = this.f36988x) != null && b3Var != b3Var2 && this.f36987w != null)) {
                VideoPlayerHolderBase videoPlayerHolderBase = this.f36987w;
                if (videoPlayerHolderBase != null) {
                    b3 b3Var3 = this.f36988x;
                    long j11 = b3Var3.I.video_id;
                    c3 a2 = c3.a(videoPlayerHolderBase, b3Var3);
                    b3Var3.c(a2);
                    this.f36989y.k(a2, j11);
                    b3 b3Var4 = this.f36988x;
                    c3 c3Var = b3Var4.J;
                    if (c3Var != null) {
                        Bitmap bitmap = c3Var.f33007b;
                        if (bitmap != null) {
                            b3Var4.e.setImageBitmap(bitmap);
                        }
                        this.f36988x.e(false);
                    }
                    this.f36987w.release(null);
                }
                this.f36987w = null;
                this.f36988x = null;
            }
            if (!z4 && b3Var2 != null) {
                p70 p70Var = b3Var2.f32709a;
                if (b3Var2.L != null && p70Var.f36987w == null) {
                    p70Var.f36987w = new a3(b3Var2).with(b3Var2.f32713n);
                    TLRPC.Document document = b3Var2.L;
                    for (int i11 = 0; i11 < document.attributes.size(); i11++) {
                        if (document.attributes.get(i11) instanceof TLRPC.TL_documentAttributeVideo) {
                            TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) document.attributes.get(i11);
                            b3Var2.h.a(tL_documentAttributeVideo.f19166w / tL_documentAttributeVideo.h, 0);
                        }
                    }
                    TLRPC.WebPage webPage = b3Var2.f32710b.B;
                    if (webPage != null) {
                        uri = FileStreamLoadOperation.prepareUri(((n4) p70Var).U, document, webPage);
                    }
                    if (uri != null) {
                        VideoPlayerHolderBase videoPlayerHolderBase2 = p70Var.f36987w;
                        c3 c3Var2 = b3Var2.J;
                        if (c3Var2 == null) {
                            j10 = 0;
                        } else {
                            j10 = c3Var2.f33006a;
                        }
                        videoPlayerHolderBase2.seekTo(j10);
                        p70Var.f36987w.preparePlayer(uri, true, 1.0f);
                        p70Var.f36987w.play();
                    }
                }
                this.f36988x = b3Var2;
            }
        }
    }

    public final void o(boolean z4, boolean z10) {
        if (this.I != null && !this.Q0 && this.S) {
            int i10 = 0;
            if (this.W != 0 && Math.abs(this.Y - System.currentTimeMillis()) >= 500) {
                Runnable runnable = this.X;
                if (runnable != null) {
                    runnable.run();
                    this.X = null;
                }
                this.W = 0;
            }
            if (this.W == 0) {
                a4 a4Var = this.H;
                if (a4Var != null) {
                    a4Var.dismiss(false);
                    return;
                }
                if (this.M.getVisibility() == 0) {
                    if (this.L != null) {
                        this.M.setVisibility(4);
                        this.P.onCustomViewHidden();
                        this.M.removeView(this.L);
                        this.L = null;
                    } else {
                        org.telegram.ui.Components.e91 e91Var = this.B0;
                        if (e91Var != null && e91Var.Q) {
                            e91Var.Q = false;
                            e91Var.m();
                            e91Var.l(false);
                        }
                    }
                    if (!z10) {
                        return;
                    }
                }
                if (this.L0.y()) {
                    this.L0.f(false);
                    return;
                }
                o0 o0Var = this.f36363e0;
                if (o0Var.Q) {
                    o0Var.h(false);
                } else if (o0Var.T) {
                    o0Var.k(false);
                } else {
                    if (this.C0 != 0) {
                        ConnectionsManager.getInstance(this.U).cancelRequest(this.C0, true);
                        this.C0 = 0;
                        b0(false);
                    }
                    if (this.D0 != 0) {
                        ConnectionsManager.getInstance(this.U).cancelRequest(this.D0, true);
                        this.D0 = 0;
                        b0(false);
                    }
                    U();
                    if (z4 && !z10) {
                        ArrayList arrayList = this.f36359a0;
                        if (arrayList.size() >= 2) {
                            Object g10 = e2.c.g(1, arrayList);
                            if (g10 instanceof d3) {
                                ((d3) g10).a();
                            }
                            if (g10 instanceof TLRPC.WebPage) {
                                org.telegram.ui.web.h2.o((TLRPC.WebPage) g10);
                            }
                            e0(-1, arrayList.get(arrayList.size() - 1), false);
                            return;
                        }
                    }
                    NotificationCenter.getInstance(this.U).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
                    NotificationCenter.getInstance(this.U).removeObserver(this, NotificationCenter.messagePlayingDidReset);
                    NotificationCenter.getInstance(this.U).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
                    NotificationCenter.getInstance(this.U).removeObserver(this, NotificationCenter.messagePlayingDidStart);
                    NotificationCenter.getInstance(this.U).removeObserver(this, NotificationCenter.emojiLoaded);
                    kf.t0 t0Var = this.R0;
                    if (t0Var != null) {
                        t0Var.destroy();
                        this.R0 = null;
                    }
                    this.J = null;
                    try {
                        org.telegram.ui.ActionBar.g3 g3Var = this.f36366h0;
                        if (g3Var != null) {
                            g3Var.dismiss();
                            this.f36366h0 = null;
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    ArticleViewer$WindowView articleViewer$WindowView = this.f36361c0;
                    Property property = View.ALPHA;
                    animatorSet.playTogether(ObjectAnimator.ofFloat(articleViewer$WindowView, property, 0.0f), ObjectAnimator.ofFloat(this.f36362d0, property, 0.0f), ObjectAnimator.ofFloat(this.f36361c0, View.TRANSLATION_X, 0.0f, AndroidUtilities.dp(56.0f)));
                    this.W = 2;
                    this.X = new d0(this, 7);
                    animatorSet.setDuration(150L);
                    animatorSet.setInterpolator(this.Z);
                    animatorSet.addListener(new cg.l0(this, 26));
                    this.Y = System.currentTimeMillis();
                    this.f36362d0.setLayerType(2, null);
                    animatorSet.start();
                    while (true) {
                        a0.h hVar = this.f36989y;
                        if (i10 < hVar.m()) {
                            c3 c3Var = (c3) hVar.n(i10);
                            Bitmap bitmap = c3Var.f33007b;
                            if (bitmap != null) {
                                bitmap.recycle();
                                c3Var.f33007b = null;
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
            ArrayList arrayList = this.f36359a0;
            if (i10 < arrayList.size()) {
                Object obj = arrayList.get(i10);
                if (obj instanceof d3) {
                    r3 r3Var = this.f36375r0[0];
                    if (r3Var != null && r3Var.G == obj) {
                        ((d3) obj).c(r3Var);
                    }
                    r3 r3Var2 = this.f36375r0[1];
                    if (r3Var2 != null && r3Var2.G == obj) {
                        ((d3) obj).c(r3Var2);
                    }
                    ((d3) obj).a();
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
        if (this.I != null && (articleViewer$WindowView = this.f36361c0) != null) {
            if (this.H == null) {
                try {
                    if (articleViewer$WindowView.getParent() != null) {
                        ((WindowManager) this.I.getSystemService("window")).removeViewImmediate(this.f36361c0);
                    }
                    this.f36361c0 = null;
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            for (int i10 = 0; i10 < this.K.size(); i10++) {
                ((w1) this.K.get(i10)).a(true);
            }
            this.K.clear();
            try {
                this.I.getWindow().clearFlags(128);
            } catch (Exception e6) {
                FileLog.e(e6);
            }
            this.I = null;
            this.J = null;
            Z0 = null;
        }
    }

    public n4(org.telegram.ui.ActionBar.p2 p2Var) {
        this.K = new ArrayList();
        this.V = 1;
        this.Z = new DecelerateInterpolator(1.5f);
        this.f36359a0 = new ArrayList();
        this.f36377t0 = new Paint();
        this.f36378u0 = new Paint();
        this.f36379v0 = new Paint();
        this.f36380w0 = new Paint();
        this.G0 = false;
        this.H0 = null;
        this.I0 = null;
        this.O0 = new AnimationNotificationsLocker(new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats});
        this.P0 = new n0[2];
        this.T0 = -1;
        d0 d0Var = new d0(this, 2);
        org.telegram.ui.Components.mr mrVar = org.telegram.ui.Components.mr.h;
        this.W0 = new org.telegram.ui.Components.c5(d0Var, 320L, mrVar);
        this.X0 = new org.telegram.ui.Components.c5(new d0(this, 4), 320L, mrVar);
        this.G = true;
        this.H = new a4(this, p2Var);
        Y(p2Var.getParentActivity(), p2Var);
    }
}
