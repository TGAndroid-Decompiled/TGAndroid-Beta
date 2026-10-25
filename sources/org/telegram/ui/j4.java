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
public final class j4 extends h70 implements NotificationCenter.NotificationCenterDelegate {
    public static Paint A1;
    public static Paint C1;
    public static TextPaint f40407h1;
    public static TextPaint f40408i1;
    public static TextPaint f40409j1;
    public static TextPaint f40410k1;
    public static TextPaint l1;
    public static TextPaint f40411m1;
    public static TextPaint f40412n1;
    public static TextPaint f40413o1;
    public static Paint f40414p1;
    public static Paint f40415q1;
    public static Paint f40416r1;
    public static Paint f40417s1;
    public static Paint f40418t1;
    public static Paint f40419u1;
    public static Paint f40420v1;
    public static Paint f40421w1;
    public static Paint f40422x1;
    public static Paint f40423y1;
    public static Paint f40424z1;
    public final Paint A0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout B0;
    public TextView C0;
    public Rect D0;
    public org.telegram.ui.Components.ma1 E0;
    public org.telegram.ui.Components.ma1 F0;
    public int G0;
    public int H0;
    public int I0;
    public final boolean J;
    public int J0;
    public final v3 K;
    public boolean K0;
    public Activity L;
    public z2 L0;
    public org.telegram.ui.ActionBar.r2 M;
    public z2 M0;
    public final ArrayList N;
    public qf.c N0;
    public View O;
    public int O0;
    public FrameLayout P;
    public org.telegram.ui.Cells.s9 P0;
    public TextureView Q;
    public org.telegram.ui.Cells.s9 Q0;
    public m4 R;
    public cv0 R0;
    public WebChromeClient.CustomViewCallback S;
    public final AnimationNotificationsLocker S0;
    public WindowInsets T;
    public final k0[] T0;
    public boolean U;
    public boolean U0;
    public boolean V;
    public ag.b1 V0;
    public boolean W;
    public ai.h0 W0;
    public int X;
    public int X0;
    public int Y;
    public ValueAnimator Y0;
    public int Z;
    public float Z0;
    public Runnable f40425a0;
    public final org.telegram.ui.Components.j5 f40426a1;
    public long f40427b0;
    public final org.telegram.ui.Components.j5 f40428b1;
    public final DecelerateInterpolator f40429c0;
    public final ArrayList f40430d0;
    public WindowManager.LayoutParams f40431e0;
    public ArticleViewer$WindowView f40432f0;
    public k0 f40433g0;
    public l0 f40434h0;
    public org.telegram.ui.web.l f40435i0;
    public a0 f40436j0;
    public org.telegram.ui.ActionBar.k3 f40437k0;
    public Paint f40438l0;
    public Drawable m0;
    public Paint f40439n0;
    public boolean f40440o0;
    public float f40441p0;
    public di.i4 f40442q0;
    public ImageView f40443r0;
    public ImageView f40444s0;
    public org.telegram.ui.Components.s6 f40445t0;
    public m3[] f40446u0;
    public AnimatorSet f40447v0;
    public final Paint f40448w0;
    public final Paint f40449x0;
    public final Paint f40450y0;
    public boolean f40451z0;
    public static final HashSet f40402c1 = new HashSet();
    public static volatile j4 f40403d1 = null;
    public static final s0 f40404e1 = new s0("innerTranslationX", 0);
    public static final TextPaint f40405f1 = new TextPaint(1);
    public static final q3 f40406g1 = new q3();
    public static final WeakHashMap B1 = new WeakHashMap();

    public j4() {
        this.N = new ArrayList();
        this.Y = 1;
        this.f40429c0 = new DecelerateInterpolator(1.5f);
        this.f40430d0 = new ArrayList();
        this.f40448w0 = new Paint();
        this.f40449x0 = new Paint();
        this.f40450y0 = new Paint();
        this.A0 = new Paint();
        this.K0 = false;
        this.L0 = null;
        this.M0 = null;
        this.S0 = new AnimationNotificationsLocker(new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats});
        this.T0 = new k0[2];
        this.X0 = -1;
        a0 a0Var = new a0(this, 2);
        org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.h;
        this.f40426a1 = new org.telegram.ui.Components.j5(a0Var, 320L, dsVar);
        this.f40428b1 = new org.telegram.ui.Components.j5(new a0(this, 4), 320L, dsVar);
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

    public static CharSequence C(h70 h70Var, TLRPC.WebPage webPage, View view, TL_iv.RichText richText, TL_iv.RichText richText2, TL_iv.PageBlock pageBlock, int i10) {
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.u11 u11Var;
        org.telegram.ui.Components.u11 u11Var2;
        TextPaint textPaint = null;
        if (richText2 == null) {
            return null;
        }
        if (richText2 instanceof TL_iv.textFixed) {
            return C(h70Var, webPage, view, richText, ((TL_iv.textFixed) richText2).text, pageBlock, i10);
        }
        if (richText2 instanceof TL_iv.textItalic) {
            return C(h70Var, webPage, view, richText, ((TL_iv.textItalic) richText2).text, pageBlock, i10);
        }
        if (richText2 instanceof TL_iv.textBold) {
            return C(h70Var, webPage, view, richText, ((TL_iv.textBold) richText2).text, pageBlock, i10);
        }
        if (richText2 instanceof TL_iv.textUnderline) {
            return C(h70Var, webPage, view, richText, ((TL_iv.textUnderline) richText2).text, pageBlock, i10);
        }
        if (richText2 instanceof TL_iv.textStrike) {
            return C(h70Var, webPage, view, richText, ((TL_iv.textStrike) richText2).text, pageBlock, i10);
        }
        if (richText2 instanceof TL_iv.textEmail) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C(h70Var, webPage, view, richText, ((TL_iv.textEmail) richText2).text, pageBlock, i10));
            MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), MetricAffectingSpan.class);
            if (spannableStringBuilder.length() != 0) {
                if (metricAffectingSpanArr == null || metricAffectingSpanArr.length == 0) {
                    textPaint = E(h70Var, richText, richText2, pageBlock);
                }
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.u11(textPaint, "mailto:" + F(richText2)), 0, spannableStringBuilder.length(), 33);
            }
            return spannableStringBuilder;
        }
        long j10 = 0;
        if (richText2 instanceof TL_iv.textUrl) {
            TL_iv.textUrl texturl = (TL_iv.textUrl) richText2;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(C(h70Var, webPage, view, richText, texturl.text, pageBlock, i10));
            MetricAffectingSpan[] metricAffectingSpanArr2 = (MetricAffectingSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), MetricAffectingSpan.class);
            if (metricAffectingSpanArr2 == null || metricAffectingSpanArr2.length == 0) {
                textPaint = E(h70Var, richText, richText2, pageBlock);
            }
            if (texturl.webpage_id != 0) {
                u11Var2 = new org.telegram.ui.Components.u11(textPaint, F(richText2));
            } else {
                u11Var2 = new org.telegram.ui.Components.u11(textPaint, F(richText2));
            }
            if (spannableStringBuilder2.length() != 0) {
                spannableStringBuilder2.setSpan(u11Var2, 0, spannableStringBuilder2.length(), 33);
            }
            return spannableStringBuilder2;
        } else if (richText2 instanceof TL_iv.textPlain) {
            return ((TL_iv.textPlain) richText2).text;
        } else {
            if (richText2 instanceof TL_iv.textAnchor) {
                TL_iv.textAnchor textanchor = (TL_iv.textAnchor) richText2;
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(C(h70Var, webPage, view, richText, textanchor.text, pageBlock, i10));
                String str = textanchor.name;
                ?? metricAffectingSpan = new MetricAffectingSpan();
                metricAffectingSpan.f28801a = str.toLowerCase();
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
                        CharSequence C = C(h70Var, webPage, view, richText, richText3, pageBlock, i10);
                        int D = D(A);
                        int length = spannableStringBuilder4.length();
                        spannableStringBuilder4.append(C);
                        if (D != 0 && !(C instanceof SpannableStringBuilder)) {
                            if ((D & 8) == 0 && (D & 512) == 0) {
                                if (length != spannableStringBuilder4.length()) {
                                    TextPaint E = E(h70Var, richText, A, pageBlock);
                                    ?? metricAffectingSpan2 = new MetricAffectingSpan();
                                    metricAffectingSpan2.f32812a = E;
                                    spannableStringBuilder4.setSpan(metricAffectingSpan2, length, spannableStringBuilder4.length(), 33);
                                }
                            } else {
                                String F = F(richText3);
                                if (F == null) {
                                    F = F(richText);
                                }
                                if ((D & 512) != 0) {
                                    u11Var = new org.telegram.ui.Components.u11(E(h70Var, richText, A, pageBlock), F);
                                } else {
                                    u11Var = new org.telegram.ui.Components.u11(E(h70Var, richText, A, pageBlock), F);
                                }
                                if (length != spannableStringBuilder4.length()) {
                                    spannableStringBuilder4.setSpan(u11Var, length, spannableStringBuilder4.length(), 33);
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
                    return C(h70Var, webPage, view, richText, ((TL_iv.textSubscript) richText2).text, pageBlock, i10);
                } else {
                    if (richText2 instanceof TL_iv.textSuperscript) {
                        return C(h70Var, webPage, view, richText, ((TL_iv.textSuperscript) richText2).text, pageBlock, i10);
                    }
                    if (richText2 instanceof TL_iv.textMarked) {
                        SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(C(h70Var, webPage, view, richText, ((TL_iv.textMarked) richText2).text, pageBlock, i10));
                        MetricAffectingSpan[] metricAffectingSpanArr3 = (MetricAffectingSpan[]) spannableStringBuilder5.getSpans(0, spannableStringBuilder5.length(), MetricAffectingSpan.class);
                        if (spannableStringBuilder5.length() != 0) {
                            if (metricAffectingSpanArr3 == null || metricAffectingSpanArr3.length == 0) {
                                textPaint = E(h70Var, richText, richText2, pageBlock);
                            }
                            ?? metricAffectingSpan3 = new MetricAffectingSpan();
                            metricAffectingSpan3.f32404a = textPaint;
                            spannableStringBuilder5.setSpan(metricAffectingSpan3, 0, spannableStringBuilder5.length(), 33);
                        }
                        return spannableStringBuilder5;
                    } else if (richText2 instanceof TL_iv.textSpoiler) {
                        SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder(C(h70Var, webPage, view, richText, ((TL_iv.textSpoiler) richText2).text, pageBlock, i10));
                        if (spannableStringBuilder6.length() != 0) {
                            ?? obj = new Object();
                            obj.f34904a |= 256;
                            spannableStringBuilder6.setSpan(new org.telegram.ui.Components.z11(obj, 0), 0, spannableStringBuilder6.length(), 33);
                        }
                        return spannableStringBuilder6;
                    } else if (richText2 instanceof TL_iv.textPhone) {
                        SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder(C(h70Var, webPage, view, richText, ((TL_iv.textPhone) richText2).text, pageBlock, i10));
                        MetricAffectingSpan[] metricAffectingSpanArr4 = (MetricAffectingSpan[]) spannableStringBuilder7.getSpans(0, spannableStringBuilder7.length(), MetricAffectingSpan.class);
                        if (spannableStringBuilder7.length() != 0) {
                            if (metricAffectingSpanArr4 == null || metricAffectingSpanArr4.length == 0) {
                                textPaint = E(h70Var, richText, richText2, pageBlock);
                            }
                            spannableStringBuilder7.setSpan(new org.telegram.ui.Components.u11(textPaint, "tel:" + F(richText2)), 0, spannableStringBuilder7.length(), 33);
                        }
                        return spannableStringBuilder7;
                    } else {
                        if (richText2 instanceof TL_iv.textImage) {
                            TL_iv.textImage textimage = (TL_iv.textImage) richText2;
                            TLRPC.Document a2 = f4.a(webPage, textimage.document_id);
                            TLRPC.Photo e = f4.e(webPage, textimage.photo_id);
                            if (a2 != null) {
                                SpannableStringBuilder spannableStringBuilder8 = new SpannableStringBuilder("*");
                                int dp = AndroidUtilities.dp(textimage.f22251w);
                                int dp2 = AndroidUtilities.dp(textimage.h);
                                int abs = Math.abs(i10);
                                if (dp > abs) {
                                    dp2 = (int) (dp2 * (abs / dp));
                                    dp = abs;
                                }
                                if (view != null) {
                                    int i12 = org.telegram.ui.ActionBar.y6.f23354d6;
                                    ((j4) h70Var).getClass();
                                    if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.y6.x0(null, i12, false)) <= 0.705f) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    ?? replacementSpan = new ReplacementSpan();
                                    Locale locale = Locale.US;
                                    String str2 = dp + "_" + dp2 + "_i";
                                    replacementSpan.f32076b = dp;
                                    replacementSpan.f32077c = dp2;
                                    boolean z12 = z10;
                                    ImageReceiver imageReceiver = new ImageReceiver(view);
                                    replacementSpan.f32075a = imageReceiver;
                                    imageReceiver.setInvalidateAll(true);
                                    if (z12) {
                                        imageReceiver.setDelegate(new org.telegram.ui.Components.qd0(24));
                                    }
                                    imageReceiver.setImage(ImageLocation.getForDocument(a2), str2, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(a2.thumbs, 90), a2), str2, -1L, null, webPage, 1);
                                    spannableStringBuilder8.setSpan(replacementSpan, 0, spannableStringBuilder8.length(), 33);
                                }
                                return spannableStringBuilder8;
                            } else if (e instanceof org.telegram.ui.web.g2) {
                                org.telegram.ui.web.g2 g2Var = (org.telegram.ui.web.g2) e;
                                SpannableStringBuilder spannableStringBuilder9 = new SpannableStringBuilder("*");
                                int dp3 = AndroidUtilities.dp(textimage.f22251w);
                                int dp4 = AndroidUtilities.dp(textimage.h);
                                int abs2 = Math.abs(i10);
                                if (dp3 > abs2) {
                                    dp4 = (int) (dp4 * (abs2 / dp3));
                                    dp3 = abs2;
                                }
                                if (view != null) {
                                    ?? replacementSpan2 = new ReplacementSpan();
                                    replacementSpan2.f32076b = dp3;
                                    replacementSpan2.f32077c = dp4;
                                    ImageReceiver imageReceiver2 = new ImageReceiver(view);
                                    replacementSpan2.f32075a = imageReceiver2;
                                    imageReceiver2.setInvalidateAll(true);
                                    org.telegram.ui.web.h2.g(g2Var, imageReceiver2, new org.telegram.ui.Components.k5(17));
                                    spannableStringBuilder9.setSpan(replacementSpan2, 0, spannableStringBuilder9.length(), 33);
                                }
                                return spannableStringBuilder9;
                            }
                        } else if (richText2 instanceof TL_iv.textMath) {
                            TL_iv.textMath textmath = (TL_iv.textMath) richText2;
                            if (textmath.bitmap == null && !textmath.tried) {
                                textmath.tried = true;
                                li.r a10 = li.r.a(textmath.source, AndroidUtilities.dp(20.0f), true);
                                if (a10 != null) {
                                    textmath.f22252w = a10.f17437b;
                                    textmath.h = a10.f17438c;
                                    textmath.depth = a10.d;
                                    textmath.bitmap = a10.f17436a;
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
                                int i13 = textmath.f22252w;
                                int i14 = textmath.h;
                                int i15 = org.telegram.ui.ActionBar.y6.G6;
                                ((j4) h70Var).getClass();
                                spannableStringBuilder10.setSpan(new org.telegram.ui.Components.r11(view, bitmap, i13, i14, org.telegram.ui.ActionBar.y6.x0(null, i15, false), textmath.depth), 0, spannableStringBuilder10.length(), 33);
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

    public static TextPaint E(h70 h70Var, TL_iv.RichText richText, TL_iv.RichText richText2, TL_iv.PageBlock pageBlock) {
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
        j4 j4Var = (j4) h70Var;
        j4Var.getClass();
        q3 q3Var = f40406g1;
        q3Var.getClass();
        SparseArray sparseArray = q3Var.f42731x;
        SparseArray sparseArray2 = q3Var.f42730w;
        SparseArray sparseArray3 = q3Var.f42728t;
        SparseArray sparseArray4 = q3Var.f42714c;
        SparseArray sparseArray5 = q3Var.f42713b;
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
            b10 = h70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockMap) {
            TL_iv.RichText richText4 = ((TL_iv.pageBlockMap) pageBlock).caption.text;
            if (richText4 != richText2 && richText4 != richText) {
                dp6 = AndroidUtilities.dp(12.0f);
            } else {
                dp6 = AndroidUtilities.dp(14.0f);
                sparseArray4 = sparseArray5;
            }
            dp8 = dp6;
            b10 = h70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockTitle) {
            sparseArray4 = q3Var.d;
            dp8 = AndroidUtilities.dp(23.0f);
            b10 = h70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockKicker) {
            sparseArray4 = q3Var.e;
            dp8 = AndroidUtilities.dp(14.0f);
            b10 = h70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockAuthorDate) {
            sparseArray4 = q3Var.f42723o;
            dp8 = AndroidUtilities.dp(14.0f);
            b10 = h70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockFooter) {
            sparseArray4 = q3Var.f42724p;
            dp8 = AndroidUtilities.dp(14.0f);
            b10 = h70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockSubtitle) {
            sparseArray4 = q3Var.f42716g;
            dp8 = AndroidUtilities.dp(20.0f);
            b10 = h70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeader) {
            sparseArray4 = q3Var.f42715f;
            dp8 = AndroidUtilities.dp(20.0f);
            b10 = h70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockSubheader) {
            sparseArray4 = q3Var.h;
            dp8 = AndroidUtilities.dp(17.0f);
            b10 = h70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading1) {
            sparseArray4 = q3Var.f42717i;
            dp8 = AndroidUtilities.dp(18.0f);
            b10 = h70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading2) {
            sparseArray4 = q3Var.f42718j;
            dp8 = AndroidUtilities.dp(16.0f);
            b10 = h70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading3) {
            sparseArray4 = q3Var.f42719k;
            dp8 = AndroidUtilities.dp(15.0f);
            b10 = h70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading4) {
            sparseArray4 = q3Var.f42720l;
            dp8 = AndroidUtilities.dp(14.0f);
            b10 = h70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading5) {
            sparseArray4 = q3Var.f42721m;
            dp8 = AndroidUtilities.dp(13.0f);
            b10 = h70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading6) {
            sparseArray4 = q3Var.f42722n;
            dp8 = AndroidUtilities.dp(12.0f);
            b10 = h70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) pageBlock;
            if (pageblockblockquote.text == richText) {
                dp8 = AndroidUtilities.dp(15.0f);
                b10 = h70Var.b();
                sparseArray4 = sparseArray3;
            } else {
                if (pageblockblockquote.caption == richText) {
                    dp8 = AndroidUtilities.dp(14.0f);
                    b10 = h70Var.a();
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
                b10 = h70Var.b();
                sparseArray4 = sparseArray3;
            } else {
                if (pageblockpullquote.caption == richText) {
                    dp8 = AndroidUtilities.dp(14.0f);
                    b10 = h70Var.a();
                    sparseArray3 = sparseArray5;
                    sparseArray4 = sparseArray3;
                }
                b10 = -65536;
                sparseArray3 = null;
                sparseArray4 = sparseArray3;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
            sparseArray4 = q3Var.f42727s;
            dp8 = AndroidUtilities.dp(14.0f);
            b10 = h70Var.b();
            D |= 4;
        } else if (pageBlock instanceof TL_iv.pageBlockParagraph) {
            sparseArray4 = q3Var.f42725q;
            dp8 = AndroidUtilities.dp(16.0f);
            b10 = h70Var.b();
        } else if (L(pageBlock)) {
            sparseArray4 = q3Var.f42726r;
            dp8 = AndroidUtilities.dp(16.0f);
            b10 = h70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockEmbed) {
            TL_iv.RichText richText5 = ((TL_iv.pageBlockEmbed) pageBlock).caption.text;
            if (richText5 != richText2 && richText5 != richText) {
                dp5 = AndroidUtilities.dp(12.0f);
            } else {
                dp5 = AndroidUtilities.dp(14.0f);
                sparseArray4 = sparseArray5;
            }
            dp8 = dp5;
            b10 = h70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
            TL_iv.RichText richText6 = ((TL_iv.pageBlockSlideshow) pageBlock).caption.text;
            if (richText6 != richText2 && richText6 != richText) {
                dp4 = AndroidUtilities.dp(12.0f);
            } else {
                dp4 = AndroidUtilities.dp(14.0f);
                sparseArray4 = sparseArray5;
            }
            dp8 = dp4;
            b10 = h70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockCollage) {
            TL_iv.RichText richText7 = ((TL_iv.pageBlockCollage) pageBlock).caption.text;
            if (richText7 != richText2 && richText7 != richText) {
                dp3 = AndroidUtilities.dp(12.0f);
            } else {
                dp3 = AndroidUtilities.dp(14.0f);
                sparseArray4 = sparseArray5;
            }
            dp8 = dp3;
            b10 = h70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockEmbedPost) {
            TL_iv.PageCaption pageCaption = ((TL_iv.pageBlockEmbedPost) pageBlock).caption;
            if (richText2 == pageCaption.text) {
                dp8 = AndroidUtilities.dp(14.0f);
                b10 = h70Var.a();
                sparseArray4 = sparseArray5;
            } else if (richText2 == pageCaption.credit) {
                dp8 = AndroidUtilities.dp(12.0f);
                b10 = h70Var.a();
            } else {
                if (richText2 != null) {
                    sparseArray4 = q3Var.f42729u;
                    dp8 = AndroidUtilities.dp(14.0f);
                    b10 = h70Var.b();
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
                b10 = h70Var.b();
            } else if (pageBlock instanceof TL_iv.pageBlockAudio) {
                if (richText2 == ((TL_iv.pageBlockAudio) pageBlock).caption.text) {
                    dp = AndroidUtilities.dp(14.0f);
                    sparseArray = sparseArray2;
                } else {
                    dp = AndroidUtilities.dp(12.0f);
                }
                dp8 = dp;
                b10 = h70Var.b();
            } else if (pageBlock instanceof TL_iv.pageBlockRelatedArticles) {
                sparseArray4 = q3Var.f42732y;
                dp8 = AndroidUtilities.dp(15.0f);
                b10 = h70Var.a();
            } else if (pageBlock instanceof TL_iv.pageBlockDetails) {
                sparseArray4 = q3Var.f42733z;
                dp8 = AndroidUtilities.dp(15.0f);
                b10 = h70Var.b();
            } else {
                if (pageBlock instanceof TL_iv.pageBlockTable) {
                    sparseArray4 = q3Var.A;
                    dp8 = AndroidUtilities.dp(15.0f);
                    b10 = h70Var.b();
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
            if (q3Var.f42712a == null) {
                TextPaint textPaint = new TextPaint(1);
                q3Var.f42712a = textPaint;
                textPaint.setColor(-65536);
            }
            q3Var.f42712a.setTextSize(AndroidUtilities.dp(14.0f));
            return q3Var.f42712a;
        }
        TextPaint textPaint2 = (TextPaint) sparseArray4.get(D);
        if (textPaint2 == null) {
            textPaint2 = new TextPaint(1);
            if ((D & 4) != 0) {
                textPaint2.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
            } else if (pageBlock instanceof TL_iv.pageBlockRelatedArticles) {
                textPaint2.setTypeface(AndroidUtilities.bold());
            } else if (h70Var.f39916a != 1 && !(pageBlock instanceof TL_iv.pageBlockTitle) && !(pageBlock instanceof TL_iv.pageBlockKicker) && !(pageBlock instanceof TL_iv.pageBlockHeader) && !(pageBlock instanceof TL_iv.pageBlockSubtitle) && !(pageBlock instanceof TL_iv.pageBlockSubheader) && !K(pageBlock)) {
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
                b10 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.J6, false);
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
        if (f40403d1 != null) {
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
        TL_iv.PageBlock z11 = z(w3Var.f44958a);
        if (z11 instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) z11;
            if (!pageblockdetails.open) {
                pageblockdetails.open = true;
                return true;
            }
        } else if (z11 instanceof w3) {
            w3 w3Var2 = (w3) z11;
            TL_iv.PageBlock z12 = z(w3Var2.f44959b);
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

    public static void T(h70 h70Var) {
        if (h70Var.f39917b != null || h70Var.f39919f != null) {
            View view = h70Var.f39919f;
            h70Var.f39918c.d(true);
            h70Var.f39917b = null;
            h70Var.d = null;
            h70Var.f39919f = null;
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

    public static void f(String str, int i10, FrameLayout frameLayout, v3 v3Var, org.telegram.ui.ActionBar.u6 u6Var) {
        String u10 = org.telegram.ui.web.a1.u(str);
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
        new org.telegram.ui.Components.wc(frameLayout, u6Var).R(R.raw.saved_messages, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.WebBookmarkedToast), new bi.r3(v3Var, clientUserId, 21))).k(true);
    }

    public static void g0(h70 h70Var) {
        TextPaint textPaint = f40412n1;
        if (textPaint != null) {
            textPaint.setColor(h70Var.b());
        }
        TextPaint textPaint2 = f40413o1;
        if (textPaint2 != null) {
            textPaint2.setColor(h70Var.b());
        }
        TextPaint textPaint3 = f40407h1;
        if (textPaint3 != null) {
            textPaint3.setColor(h70Var.b());
        }
        TextPaint textPaint4 = f40409j1;
        if (textPaint4 != null) {
            textPaint4.setColor(h70Var.b());
        }
        TextPaint textPaint5 = f40410k1;
        if (textPaint5 != null) {
            textPaint5.setColor(-1);
        }
        TextPaint textPaint6 = l1;
        if (textPaint6 != null) {
            textPaint6.setColor(h70Var.b());
        }
        TextPaint textPaint7 = f40411m1;
        if (textPaint7 != null) {
            textPaint7.setColor(h70Var.a());
        }
        TextPaint textPaint8 = f40408i1;
        if (textPaint8 != null) {
            textPaint8.setColor(h70Var.a());
        }
        r(h70Var, true);
        q3 q3Var = f40406g1;
        q3.a(h70Var, q3Var.d);
        q3.a(h70Var, q3Var.e);
        q3.a(h70Var, q3Var.f42716g);
        q3.a(h70Var, q3Var.f42715f);
        q3.a(h70Var, q3Var.h);
        q3.a(h70Var, q3Var.f42717i);
        q3.a(h70Var, q3Var.f42718j);
        q3.a(h70Var, q3Var.f42719k);
        q3.a(h70Var, q3Var.f42720l);
        q3.a(h70Var, q3Var.f42721m);
        q3.a(h70Var, q3Var.f42722n);
        q3.a(h70Var, q3Var.f42728t);
        q3.a(h70Var, q3Var.f42727s);
        q3.a(h70Var, q3Var.f42725q);
        q3.a(h70Var, q3Var.f42726r);
        q3.a(h70Var, q3Var.f42729u);
        q3.a(h70Var, q3Var.f42730w);
        q3.a(h70Var, q3Var.f42731x);
        q3.a(h70Var, q3Var.f42713b);
        q3.a(h70Var, q3Var.f42714c);
        q3.a(h70Var, q3Var.f42723o);
        q3.a(h70Var, q3Var.f42724p);
        q3.a(h70Var, q3Var.v);
        q3.a(h70Var, q3Var.f42732y);
        q3.a(h70Var, q3Var.f42733z);
        q3.a(h70Var, q3Var.A);
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

    public static CharSequence j(h70 h70Var, h4 h4Var, a3 a3Var) {
        StaticLayout staticLayout;
        if (a3Var != null && (staticLayout = a3Var.d) != null) {
            SpannableStringBuilder spannableStringBuilder = a3Var.f37634y;
            if (spannableStringBuilder != null) {
                return spannableStringBuilder;
            }
            CharSequence text = staticLayout.getText();
            if (!(text instanceof Spannable)) {
                return text;
            }
            Spannable spannable = (Spannable) text;
            org.telegram.ui.Components.u11[] u11VarArr = (org.telegram.ui.Components.u11[]) spannable.getSpans(0, spannable.length(), org.telegram.ui.Components.u11.class);
            SpannableStringBuilder spannableStringBuilder2 = text;
            if (u11VarArr != null) {
                spannableStringBuilder2 = text;
                if (u11VarArr.length != 0) {
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannable);
                    for (org.telegram.ui.Components.u11 u11Var : u11VarArr) {
                        int spanStart = spannableStringBuilder3.getSpanStart(u11Var);
                        int spanEnd = spannableStringBuilder3.getSpanEnd(u11Var);
                        if (spanStart >= 0 && spanEnd > spanStart) {
                            spannableStringBuilder3.setSpan(new n0(h70Var, h4Var, u11Var, 0), spanStart, spanEnd, 33);
                        }
                    }
                    a3Var.f37634y = spannableStringBuilder3;
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
            y3Var2.f45941a = y3Var.f45941a;
            y3Var2.f45942b = y3Var.f45942b;
            y3Var2.f45943c = y3Var.f45943c;
            y3Var2.d = j0(y3Var.d, w3Var);
            return y3Var2;
        } else if (pageBlock instanceof a4) {
            a4 a4Var = (a4) pageBlock;
            a4 a4Var2 = new a4();
            a4Var2.f37637a = a4Var.f37637a;
            a4Var2.f37638b = a4Var.f37638b;
            a4Var2.f37639c = a4Var.f37639c;
            a4Var2.d = j0(a4Var.d, w3Var);
            return a4Var2;
        } else {
            return w3Var;
        }
    }

    public static boolean l(org.telegram.ui.h70 r25, org.telegram.ui.h4 r26, android.view.MotionEvent r27, android.view.View r28, org.telegram.ui.a3 r29, int r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j4.l(org.telegram.ui.h70, org.telegram.ui.h4, android.view.MotionEvent, android.view.View, org.telegram.ui.a3, int, int):boolean");
    }

    public static org.telegram.ui.a3 p(org.telegram.ui.h70 r20, android.view.View r21, java.lang.CharSequence r22, org.telegram.tgnet.tl.TL_iv.RichText r23, int r24, int r25, org.telegram.tgnet.tl.TL_iv.PageBlock r26, android.text.Layout.Alignment r27, int r28, org.telegram.ui.h4 r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j4.p(org.telegram.ui.h70, android.view.View, java.lang.CharSequence, org.telegram.tgnet.tl.TL_iv$RichText, int, int, org.telegram.tgnet.tl.TL_iv$PageBlock, android.text.Layout$Alignment, int, org.telegram.ui.h4):org.telegram.ui.a3");
    }

    public static a3 q(h70 h70Var, View view, CharSequence charSequence, TL_iv.RichText richText, int i10, int i11, TL_iv.PageBlock pageBlock, h4 h4Var) {
        return p(h70Var, view, charSequence, richText, i10, i11, pageBlock, Layout.Alignment.ALIGN_NORMAL, 0, h4Var);
    }

    public static void r(h70 h70Var, boolean z10) {
        int i10;
        if (f40416r1 == null) {
            f40416r1 = new Paint();
            f40415q1 = new Paint();
            Paint paint = new Paint(1);
            f40418t1 = paint;
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            f40418t1.setStrokeWidth(AndroidUtilities.dp(1.0f));
            Paint paint2 = new Paint();
            f40419u1 = paint2;
            paint2.setStyle(style);
            f40419u1.setStrokeWidth(AndroidUtilities.dp(1.0f) / 2.0f);
            f40420v1 = new Paint();
            f40421w1 = new Paint();
            f40422x1 = new Paint();
            f40423y1 = new Paint(1);
            f40424z1 = new Paint(1);
            f40414p1 = new Paint();
            f40417s1 = new Paint();
            A1 = new Paint(1);
        } else if (!z10) {
            return;
        }
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23354d6, false);
        float green = Color.green(x02) * 0.7152f;
        float x9 = c3.h0.x(Color.blue(x02), 0.0722f, green + (Color.red(x02) * 0.2126f), 255.0f);
        Paint paint3 = f40424z1;
        if (x9 <= 0.705f) {
            i10 = -3041234;
        } else {
            i10 = -6551;
        }
        paint3.setColor(i10);
        Paint paint4 = f40423y1;
        int i11 = org.telegram.ui.ActionBar.y6.K6;
        paint4.setColor(org.telegram.ui.ActionBar.y6.x0(null, i11, false) & 872415231);
        f40423y1.setPathEffect(org.telegram.ui.Components.s90.c());
        f40422x1.setColor(org.telegram.ui.ActionBar.y6.x0(null, i11, false) & 872415231);
        f40422x1.setPathEffect(org.telegram.ui.Components.s90.c());
        Paint paint5 = f40419u1;
        int i12 = org.telegram.ui.ActionBar.y6.f23482k6;
        paint5.setColor(org.telegram.ui.ActionBar.y6.x0(null, i12, false));
        f40418t1.setColor(org.telegram.ui.ActionBar.y6.x0(null, i12, false));
        f40414p1.setColor(251658240);
        f40417s1.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23355d7, false));
        A1.setColor(org.telegram.ui.ActionBar.y6.x0(null, i11, false) & 872415231);
        A1.setPathEffect(org.telegram.ui.Components.s90.c());
        int x03 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.M6, false);
        int red = Color.red(x03);
        int green2 = Color.green(x03);
        int blue = Color.blue(x03);
        f40421w1.setColor(Color.argb(20, red, green2, blue));
        f40420v1.setColor(Color.argb(34, red, green2, blue));
        int x04 = org.telegram.ui.ActionBar.y6.x0(null, i11, false);
        f40415q1.setColor(Color.argb(20, Color.red(x04), Color.green(x04), Color.blue(x04)));
        f40416r1.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Uc, false));
    }

    public static void u(Canvas canvas, h70 h70Var, TL_iv.PageBlock pageBlock, int i10) {
        int i11;
        int dp;
        int dp2;
        if (pageBlock != null && h70Var != null && f40416r1 != null) {
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
                    canvas.drawRect(AndroidUtilities.dp(18), 0.0f, AndroidUtilities.dp(2.0f) + dp2, i13, f40416r1);
                    return;
                }
                return;
            }
            while (i14 != 0) {
                if ((i14 & 1) != 0) {
                    canvas.drawRect(AndroidUtilities.dp((i12 * 14) + 18), 0.0f, AndroidUtilities.dp(2.0f) + dp, i13, f40416r1);
                }
                i14 >>>= 1;
                i12++;
            }
        }
    }

    public static void v(org.telegram.ui.h70 r2, android.graphics.Canvas r3, org.telegram.ui.Cells.r9 r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j4.v(org.telegram.ui.h70, android.graphics.Canvas, org.telegram.ui.Cells.r9, int):void");
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
        j4 j4Var2 = f40403d1;
        if (j4Var2 == null) {
            synchronized (j4.class) {
                try {
                    j4Var = f40403d1;
                    if (j4Var == null) {
                        j4Var = new j4();
                        f40403d1 = j4Var;
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
        org.telegram.ui.Components.vl0 vl0Var;
        if (view instanceof x1) {
            org.telegram.ui.Components.vl0 vl0Var2 = ((x1) view).d;
            if (vl0Var2 != null) {
                return y(vl0Var2.f47735a);
            }
            return view;
        } else if ((view instanceof a2) && (vl0Var = ((a2) view).d) != null) {
            return y(vl0Var.f47735a);
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
        int x02;
        int x03;
        boolean z10;
        float x9;
        ArrayList arrayList = this.f40430d0;
        int size = arrayList.size();
        v3 v3Var = this.K;
        boolean z11 = false;
        if (size <= 1) {
            ArticleViewer$WindowView articleViewer$WindowView = this.f40432f0;
            articleViewer$WindowView.e = false;
            articleViewer$WindowView.d = false;
            k0 k0Var = this.f40433g0;
            if (v3Var != null) {
                x9 = v3Var.I * v3Var.f44583c.getWidth();
            } else {
                x9 = k0Var.getX();
            }
            AnimatorSet animatorSet = new AnimatorSet();
            float measuredWidth = k0Var.getMeasuredWidth() - x9;
            if (v3Var != null) {
                animatorSet.playTogether(v3Var.d(1.0f));
            } else {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.f40433g0, View.TRANSLATION_X, k0Var.getMeasuredWidth()), ObjectAnimator.ofFloat(this.f40432f0, f40404e1, k0Var.getMeasuredWidth()));
            }
            animatorSet.setDuration(Math.max((int) ((420.0f / k0Var.getMeasuredWidth()) * measuredWidth), 250));
            animatorSet.setInterpolator(org.telegram.ui.Components.ds.h);
            animatorSet.addListener(new u0(this));
            animatorSet.start();
            this.U0 = true;
            return;
        }
        ArticleViewer$WindowView articleViewer$WindowView2 = this.f40432f0;
        articleViewer$WindowView2.f23813f = true;
        articleViewer$WindowView2.e = true;
        articleViewer$WindowView2.h = this.J0;
        this.f40446u0[1].setVisibility(0);
        this.f40446u0[1].setAlpha(1.0f);
        this.f40446u0[1].setTranslationX(0.0f);
        m3 m3Var = this.f40446u0[0];
        if (v3Var == null) {
            color = 0;
        } else {
            color = this.f40438l0.getColor();
        }
        m3Var.setBackgroundColor(color);
        e0(-1, arrayList.get(arrayList.size() - 2), true);
        m3 m3Var2 = this.f40446u0[0];
        m3Var2.getX();
        AnimatorSet animatorSet2 = new AnimatorSet();
        m3Var2.getMeasuredWidth();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f40446u0[0], View.TRANSLATION_X, m3Var2.getMeasuredWidth()));
        animatorSet2.setDuration(420L);
        animatorSet2.setInterpolator(org.telegram.ui.Components.ds.h);
        animatorSet2.addListener(new v0(this));
        animatorSet2.start();
        l0 l0Var = this.f40434h0;
        m3 m3Var3 = this.f40446u0[0];
        if (m3Var3 != null && SharedConfig.adaptableColorInBrowser) {
            x02 = m3Var3.getBackgroundColor();
        } else {
            x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Pk, false);
        }
        l0Var.setMenuColors(x02);
        l0 l0Var2 = this.f40434h0;
        m3 m3Var4 = this.f40446u0[0];
        if (m3Var4 != null && SharedConfig.adaptableColorInBrowser) {
            x03 = m3Var4.getActionBarColor();
        } else {
            x03 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Pk, false);
        }
        l0Var2.d(x03, true);
        l0 l0Var3 = this.f40434h0;
        m3 m3Var5 = this.f40446u0[0];
        if (m3Var5 != null && m3Var5.e()) {
            z10 = true;
        } else {
            z10 = false;
        }
        l0Var3.setIsTonsite(z10);
        l0 l0Var4 = this.f40434h0;
        m3 m3Var6 = this.f40446u0[0];
        if (m3Var6 != null && m3Var6.d()) {
            z11 = true;
        }
        l0Var4.setIsLocal(z11);
        this.U0 = true;
    }

    public final void H(int i10) {
        int color;
        int x02;
        int x03;
        boolean z10;
        float x9;
        ArrayList arrayList = this.f40430d0;
        int size = arrayList.size();
        v3 v3Var = this.K;
        boolean z11 = false;
        if (size <= 1) {
            ArticleViewer$WindowView articleViewer$WindowView = this.f40432f0;
            articleViewer$WindowView.e = false;
            articleViewer$WindowView.d = false;
            k0 k0Var = this.f40433g0;
            if (v3Var != null) {
                x9 = v3Var.I * v3Var.f44583c.getWidth();
            } else {
                x9 = k0Var.getX();
            }
            AnimatorSet animatorSet = new AnimatorSet();
            float measuredWidth = k0Var.getMeasuredWidth() - x9;
            if (v3Var != null) {
                animatorSet.playTogether(v3Var.d(1.0f));
            } else {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.f40433g0, View.TRANSLATION_X, k0Var.getMeasuredWidth()), ObjectAnimator.ofFloat(this.f40432f0, f40404e1, k0Var.getMeasuredWidth()));
            }
            animatorSet.setDuration(Math.max((int) ((420.0f / k0Var.getMeasuredWidth()) * measuredWidth), 250));
            animatorSet.setInterpolator(org.telegram.ui.Components.ds.h);
            animatorSet.addListener(new w0(this));
            animatorSet.start();
            this.U0 = true;
            return;
        }
        this.f40432f0.f23813f = true;
        this.f40446u0[1].setVisibility(0);
        this.f40446u0[1].setAlpha(1.0f);
        this.f40446u0[1].setTranslationX(0.0f);
        m3 m3Var = this.f40446u0[0];
        if (v3Var == null) {
            color = 0;
        } else {
            color = this.f40438l0.getColor();
        }
        m3Var.setBackgroundColor(color);
        e0(-1, arrayList.get(i10), true);
        m3 m3Var2 = this.f40446u0[0];
        m3Var2.getX();
        AnimatorSet animatorSet2 = new AnimatorSet();
        m3Var2.getMeasuredWidth();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f40446u0[0], View.TRANSLATION_X, m3Var2.getMeasuredWidth()));
        animatorSet2.setDuration(420L);
        animatorSet2.setInterpolator(org.telegram.ui.Components.ds.h);
        animatorSet2.addListener(new x0(this, i10));
        animatorSet2.start();
        l0 l0Var = this.f40434h0;
        m3 m3Var3 = this.f40446u0[0];
        if (m3Var3 != null && SharedConfig.adaptableColorInBrowser) {
            x02 = m3Var3.getBackgroundColor();
        } else {
            x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Pk, false);
        }
        l0Var.setMenuColors(x02);
        l0 l0Var2 = this.f40434h0;
        m3 m3Var4 = this.f40446u0[0];
        if (m3Var4 != null && SharedConfig.adaptableColorInBrowser) {
            x03 = m3Var4.getActionBarColor();
        } else {
            x03 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Pk, false);
        }
        l0Var2.d(x03, true);
        l0 l0Var3 = this.f40434h0;
        m3 m3Var5 = this.f40446u0[0];
        if (m3Var5 != null && m3Var5.e()) {
            z10 = true;
        } else {
            z10 = false;
        }
        l0Var3.setIsTonsite(z10);
        l0 l0Var4 = this.f40434h0;
        m3 m3Var6 = this.f40446u0[0];
        if (m3Var6 != null && m3Var6.d()) {
            z11 = true;
        }
        l0Var4.setIsLocal(z11);
        this.U0 = true;
    }

    public final boolean J() {
        ArrayList arrayList = this.f40430d0;
        if (arrayList.size() <= 0 || !(arrayList.get(0) instanceof TLRPC.WebPage)) {
            return false;
        }
        return true;
    }

    public final void M() {
        this.V = false;
        int i10 = 0;
        while (true) {
            m3[] m3VarArr = this.f40446u0;
            if (i10 < m3VarArr.length) {
                m3VarArr[i10].b();
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
                ((s1) arrayList.get(i11)).a(false);
                i11++;
            } else {
                this.f40433g0.post(new a0(this, 0));
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
        v3 v3Var = this.K;
        if (v3Var == null && this.V) {
            return false;
        }
        org.telegram.ui.ActionBar.r2 r2Var = this.M;
        if (r2Var != null && (r2Var.getParentLayout() instanceof ActionBarLayout)) {
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
        ArrayList arrayList = this.f40430d0;
        if (v3Var != null && !arrayList.isEmpty()) {
            z11 = z10;
            r52 = 1;
        } else {
            z11 = z10;
            r52 = 0;
        }
        if (r52 == 0) {
            arrayList.clear();
            this.f40433g0.setTranslationX(0.0f);
            if (v3Var != null) {
                v3Var.I = 0.0f;
                v3Var.f44583c.invalidate();
                v3Var.i();
                v3Var.h();
            }
            this.f40433g0.setTranslationY(0.0f);
            this.f40446u0[0].setTranslationY(0.0f);
            this.f40446u0[0].setTranslationX(0.0f);
            this.f40446u0[1].setTranslationX(0.0f);
            this.f40446u0[0].setAlpha(1.0f);
            this.f40432f0.setInnerTranslationX(0.0f);
            this.f40446u0[0].g();
            X(AndroidUtilities.dp(56.0f));
        }
        if (v3Var != null && org.telegram.ui.web.a1.Q0) {
            v3Var.f44581a.lock();
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
                ConnectionsManager.getInstance(i13).sendRequest(tL_messages_getWebPage, new g0(this, i13, webPage2, messageObject, (boolean) r52, str3));
            }
        } else {
            g(r52, str2);
        }
        l0 l0Var = this.f40434h0;
        if (l0Var != null && r52 == 0) {
            l0Var.setIsLocal(this.f40446u0[0].d());
        }
        this.T = null;
        if (v3Var != null) {
            if (r52 == 0) {
                AndroidUtilities.removeFromParent(this.f40432f0);
                v3Var.d = this.f40432f0;
                v3Var.n();
                v3Var.f44583c.addView(this.f40432f0, org.telegram.ui.Components.gb1.g(-1.0f, -1));
            }
        } else if (!this.V) {
            WindowManager windowManager = (WindowManager) this.L.getSystemService("window");
            if (this.W) {
                try {
                    windowManager.removeView(this.f40432f0);
                } catch (Exception unused) {
                }
            }
            try {
                WindowManager.LayoutParams layoutParams = this.f40431e0;
                layoutParams.flags = -2013200384;
                if (Build.VERSION.SDK_INT >= 28) {
                    layoutParams.layoutInDisplayCutoutMode = 1;
                }
                this.f40432f0.setFocusable(false);
                this.f40433g0.setFocusable(false);
                windowManager.addView(this.f40432f0, this.f40431e0);
            } catch (Exception e10) {
                FileLog.e(e10);
                return false;
            }
        } else {
            this.f40431e0.flags &= -17;
            ((WindowManager) this.L.getSystemService("window")).updateViewLayout(this.f40432f0, this.f40431e0);
        }
        this.V = true;
        this.Z = 1;
        if (r52 == 0) {
            if (v3Var != null) {
                if (r52 != 0) {
                    v3Var.f44581a.unlock();
                } else if (!v3Var.h) {
                    v3Var.g(v3Var.f44582b);
                    v3Var.f();
                }
            } else {
                this.f40432f0.setAlpha(0.0f);
                this.f40433g0.setAlpha(0.0f);
                AnimatorSet animatorSet = new AnimatorSet();
                ArticleViewer$WindowView articleViewer$WindowView = this.f40432f0;
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(articleViewer$WindowView, property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f40433g0, property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f40432f0, View.TRANSLATION_X, AndroidUtilities.dp(56.0f), 0.0f));
                this.f40425a0 = new a0(this, 1);
                animatorSet.setDuration(150L);
                animatorSet.setInterpolator(this.f40429c0);
                animatorSet.addListener(new r0(this));
                this.f40427b0 = System.currentTimeMillis();
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.m0(12, this, animatorSet));
            }
        }
        this.f40433g0.setLayerType(2, null);
        return true;
    }

    public final void P(long j10, TLRPC.User user) {
        if (user != null && (this.L instanceof LaunchActivity)) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f22174id);
            bundle.putString("botUser", "webpage" + j10);
            ((LaunchActivity) this.L).v0(new un(bundle), false, true);
            o(false, true);
        }
    }

    public final void Q(String str, String str2, j0 j0Var) {
        Activity activity = this.L;
        if (activity != null && !activity.isFinishing()) {
            m3 m3Var = this.f40446u0[0];
            if (m3Var != null && m3Var.d()) {
                String string = LocaleController.getString(R.string.OpenUrlAlert2);
                int indexOf = string.indexOf("%");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(String.format(string, str));
                if (indexOf >= 0) {
                    spannableStringBuilder.setSpan(new URLSpan(str), indexOf, str.length() + indexOf, 33);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.L, 0, null);
                String string2 = LocaleController.getString(R.string.OpenUrlTitle);
                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22366a;
                e2Var.R = string2;
                e2Var.T = spannableStringBuilder;
                e2Var.f22571h0 = false;
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.Open), new a1.d(this, str, str2, j0Var, 5));
                alertDialog$Builder.p();
                return;
            }
            R(str, str2, j0Var);
        }
    }

    public final void R(String str, String str2, qf.c cVar) {
        v3 v3Var;
        qf.c cVar2 = this.N0;
        if (cVar2 != null) {
            cVar2.a(false);
        }
        this.N0 = cVar;
        if (this.G0 != 0) {
            ConnectionsManager.getInstance(this.X).cancelRequest(this.G0, false);
            this.G0 = 0;
        }
        boolean[] zArr = new boolean[1];
        if (qf.d.k(this.L, str, false)) {
            if (this.f40430d0.isEmpty() && (v3Var = this.K) != null) {
                v3Var.dismiss(false);
                return;
            }
            return;
        }
        f0 f0Var = new f0(this, str, zArr, cVar);
        int i10 = this.I0 + 1;
        this.I0 = i10;
        b0(true);
        TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
        tL_messages_getWebPage.url = str;
        tL_messages_getWebPage.hash = 0;
        this.G0 = ConnectionsManager.getInstance(this.X).sendRequest(tL_messages_getWebPage, new org.telegram.messenger.li(this, i10, cVar, str2, f0Var, tL_messages_getWebPage));
        if (cVar != null) {
            cVar.f47031b = new ai.h0(this, i10, cVar, 28);
            cVar.d();
        }
    }

    public final void S() {
        int x02;
        int x03;
        TextView textView = this.C0;
        if (textView != null) {
            int i10 = org.telegram.ui.ActionBar.y6.f23446i6;
            org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.x0(null, i10, false), 2, -1);
            org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i10);
            textView.setBackground(g02);
            org.telegram.ui.ActionBar.f7.k(textView, g02, null, N, null);
            org.telegram.ui.ActionBar.f7.V(this.C0, org.telegram.ui.ActionBar.y6.E8, null);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.B0;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, null);
        }
        ImageView imageView = this.f40443r0;
        if (imageView != null) {
            org.telegram.ui.ActionBar.f7.t(imageView, org.telegram.ui.ActionBar.y6.G6, null, PorterDuff.Mode.MULTIPLY);
            ImageView imageView2 = this.f40443r0;
            int i11 = org.telegram.ui.ActionBar.y6.f23767z8;
            org.telegram.ui.ActionBar.f7.R(imageView2, org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.x0(null, i11, false), 1, -1), null, org.telegram.ui.ActionBar.f7.N(i11), null);
        }
        ImageView imageView3 = this.f40444s0;
        if (imageView3 != null) {
            org.telegram.ui.ActionBar.f7.t(imageView3, org.telegram.ui.ActionBar.y6.G6, null, PorterDuff.Mode.MULTIPLY);
            ImageView imageView4 = this.f40444s0;
            int i12 = org.telegram.ui.ActionBar.y6.f23767z8;
            org.telegram.ui.ActionBar.f7.R(imageView4, org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.x0(null, i12, false), 1, -1), null, org.telegram.ui.ActionBar.f7.N(i12), null);
        }
        org.telegram.ui.Components.s6 s6Var = this.f40445t0;
        if (s6Var != null) {
            org.telegram.ui.ActionBar.f7.Z(s6Var, org.telegram.ui.ActionBar.y6.G6, null);
        }
        l0 l0Var = this.f40434h0;
        if (l0Var != null) {
            m3 m3Var = this.f40446u0[0];
            if (m3Var != null && SharedConfig.adaptableColorInBrowser) {
                x02 = m3Var.getBackgroundColor();
            } else {
                x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Pk, false);
            }
            l0Var.setMenuColors(x02);
            l0 l0Var2 = this.f40434h0;
            m3 m3Var2 = this.f40446u0[0];
            if (m3Var2 != null && SharedConfig.adaptableColorInBrowser) {
                x03 = m3Var2.getActionBarColor();
            } else {
                x03 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Pk, false);
            }
            l0Var2.d(x03, true);
        }
        this.f40438l0.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Pk, false));
    }

    public final void U() {
        int L0;
        int i10;
        boolean z10 = false;
        m3 m3Var = this.f40446u0[0];
        if (m3Var.f41441c.E != null && (L0 = m3Var.d.L0()) != -1) {
            View m10 = this.f40446u0[0].d.m(L0);
            if (m10 != null) {
                i10 = m10.getTop();
            } else {
                i10 = 0;
            }
            String str = "article" + this.f40446u0[0].f41441c.E.f22180id;
            SharedPreferences.Editor putInt = ApplicationLoader.applicationContext.getSharedPreferences("articles", 0).edit().putInt(str, L0).putInt(str + "o", i10);
            String u10 = org.telegram.ui.Components.b10.u(str, "r");
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
            Integer num2 = (Integer) this.f40446u0[0].f41441c.h.get(lowerCase2);
            if (num2 != null) {
                TL_iv.textAnchor textanchor = (TL_iv.textAnchor) this.f40446u0[0].f41441c.f39882r.get(lowerCase2);
                if (textanchor != null) {
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    if (!TextUtils.isEmpty(this.f40446u0[0].f41441c.E.cached_page.url)) {
                        lowerCase = this.f40446u0[0].f41441c.E.cached_page.url.toLowerCase();
                    } else {
                        lowerCase = this.f40446u0[0].f41441c.E.url.toLowerCase();
                    }
                    pageblockparagraph.text = org.telegram.ui.web.h2.d(textanchor.text, lowerCase, lowerCase2);
                    this.f40446u0[0].f41441c.getClass();
                    int I = h4.I(pageblockparagraph);
                    s4.e1 x9 = this.f40446u0[0].f41441c.x(null, I);
                    View view = x9.f47735a;
                    this.f40446u0[0].f41441c.H(I, x9, pageblockparagraph, 0, 0, false);
                    org.telegram.ui.ActionBar.k3 k3Var = new org.telegram.ui.ActionBar.k3(1, (Context) this.L, (org.telegram.ui.ActionBar.u6) null, false);
                    k3Var.fixNavigationBar();
                    k3Var.applyTopPadding = false;
                    k3Var.applyBottomPadding = false;
                    LinearLayout linearLayout = new LinearLayout(this.L);
                    linearLayout.setOrientation(1);
                    org.telegram.ui.Cells.s9 s9Var = new org.telegram.ui.Cells.s9();
                    this.Q0 = s9Var;
                    s9Var.S(linearLayout);
                    this.Q0.D = new di.n2(this, 1);
                    bi.md mdVar = new bi.md(this.L, 5);
                    mdVar.setTextSize(1, 16.0f);
                    mdVar.setTypeface(AndroidUtilities.bold());
                    mdVar.setText(LocaleController.getString(R.string.InstantViewReference));
                    if (this.f40446u0[0].f41441c.G) {
                        i10 = 5;
                    } else {
                        i10 = 3;
                    }
                    mdVar.setGravity(i10 | 16);
                    mdVar.setTextColor(b());
                    mdVar.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                    linearLayout.addView(mdVar, new LinearLayout.LayoutParams(-1, AndroidUtilities.dp(48.0f) + 1));
                    view.setTag("bottomSheet");
                    linearLayout.addView(view, org.telegram.ui.Components.gb1.o(0.0f, 7.0f, 0.0f, 0.0f, -1, -2));
                    org.telegram.ui.Cells.ea n10 = this.Q0.n(this.L);
                    bh.p pVar = new bh.p(this, this.L, linearLayout, 6);
                    k3Var.setDelegate(new h0(this, 0));
                    pVar.addView(linearLayout, -1, -2);
                    pVar.addView(n10, -1, -2);
                    k3Var.customView = pVar;
                    if (this.P0.x()) {
                        this.P0.f(false);
                    }
                    this.I = k3Var;
                    a0(k3Var);
                    return true;
                } else if (num2.intValue() >= 0 && num2.intValue() < this.f40446u0[0].f41441c.e.size()) {
                    TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) this.f40446u0[0].f41441c.e.get(num2.intValue());
                    TL_iv.PageBlock z11 = z(pageBlock);
                    if ((z11 instanceof w3) && O((w3) z11)) {
                        this.f40446u0[0].f41441c.M();
                        this.f40446u0[0].f41441c.l();
                    }
                    int indexOf = this.f40446u0[0].f41441c.d.indexOf(pageBlock);
                    if (indexOf != -1) {
                        num2 = Integer.valueOf(indexOf);
                    }
                    Integer num3 = (Integer) this.f40446u0[0].f41441c.f39881n.get(lowerCase2);
                    if (num3 != null) {
                        if (num3.intValue() == -1) {
                            this.f40446u0[0].f41441c.getClass();
                            int I2 = h4.I(pageBlock);
                            s4.e1 x10 = this.f40446u0[0].f41441c.x(null, I2);
                            this.f40446u0[0].f41441c.H(I2, x10, pageBlock, 0, 0, false);
                            x10.f47735a.measure(View.MeasureSpec.makeMeasureSpec(this.f40446u0[0].f41440b.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                            Integer num4 = (Integer) this.f40446u0[0].f41441c.f39881n.get(lowerCase2);
                            if (num4.intValue() != -1) {
                                num = num4;
                            }
                        } else {
                            num = num3;
                        }
                    }
                    if (this.f40446u0[0].f41441c.H) {
                        num2 = Integer.valueOf(num2.intValue() + 1);
                    }
                    if (z10) {
                        org.telegram.ui.Components.ex0 ex0Var = new org.telegram.ui.Components.ex0(this.f40446u0[0].getContext());
                        ex0Var.f47677a = num2.intValue();
                        ex0Var.f28003s = (-AndroidUtilities.dp(56.0f)) - num.intValue();
                        this.f40446u0[0].d.w0(ex0Var);
                        return true;
                    }
                    this.f40446u0[0].d.h1(num2.intValue(), (-AndroidUtilities.dp(56.0f)) - num.intValue());
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
        l0 l0Var = this.f40434h0;
        if (l0Var != null && !l0Var.T && !l0Var.W) {
            int clamp = Utilities.clamp(i10, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(24.0f));
            this.J0 = clamp;
            this.f40434h0.setHeight(clamp);
            this.P0.f24118x = this.J0;
            int i11 = 0;
            while (true) {
                m3[] m3VarArr = this.f40446u0;
                if (i11 < m3VarArr.length) {
                    m3VarArr[i11].f41440b.setTopGlowOffset(this.J0);
                    i11++;
                } else {
                    return;
                }
            }
        }
    }

    public final void Y(Activity activity, org.telegram.ui.ActionBar.r2 r2Var) {
        ag.b1 b1Var;
        int i10;
        boolean z10;
        int x02;
        int i11;
        int i12;
        v3 v3Var;
        ag.b1 b1Var2 = this.V0;
        if (b1Var2 != null) {
            b1Var2.destroy();
            this.V0 = null;
        }
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity != null) {
            b1Var = new ag.b1(launchActivity, true);
        } else {
            b1Var = null;
        }
        this.V0 = b1Var;
        this.M = r2Var;
        if (!(r2Var instanceof py)) {
            i10 = r2Var.getCurrentAccount();
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
        if (activity2 != activity && (activity2 == null || !this.J || (v3Var = this.K) == null || v3Var.e == null)) {
            this.L = activity;
            this.f39916a = ApplicationLoader.applicationContext.getSharedPreferences("articles", 0).getInt("font_type", 0);
            r(this, false);
            this.f40438l0 = new Paint();
            this.m0 = activity.getResources().getDrawable(R.drawable.layer_shadow);
            this.f40439n0 = new Paint();
            ArticleViewer$WindowView articleViewer$WindowView = new ArticleViewer$WindowView(this, activity);
            this.f40432f0 = articleViewer$WindowView;
            articleViewer$WindowView.setWillNotDraw(false);
            this.f40432f0.setClipChildren(true);
            this.f40432f0.setFocusable(false);
            k0 k0Var = new k0(this, activity, 0);
            this.f40433g0 = k0Var;
            this.f40432f0.addView(k0Var, org.telegram.ui.Components.gb1.i(-1, -1, 51));
            if (this.K == null) {
                this.f40432f0.setFitsSystemWindows(true);
                this.f40433g0.setOnApplyWindowInsetsListener(new org.telegram.ui.ActionBar.l3(1));
            }
            FrameLayout frameLayout = new FrameLayout(activity);
            this.P = frameLayout;
            frameLayout.setBackgroundColor(-16777216);
            this.P.setVisibility(4);
            this.f40432f0.addView(this.P, org.telegram.ui.Components.gb1.g(-1.0f, -1));
            m4 m4Var = new m4(activity);
            this.R = m4Var;
            m4Var.setVisibility(0);
            this.R.setBackgroundColor(-16777216);
            this.P.addView(this.R, org.telegram.ui.Components.gb1.i(-1, -1, 17));
            this.Q = new TextureView(activity);
            this.f40446u0 = new m3[2];
            int i13 = 0;
            while (true) {
                m3[] m3VarArr = this.f40446u0;
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
                this.f40433g0.addView(m3Var, org.telegram.ui.Components.gb1.h(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
                m3Var.f41440b.setOnItemLongClickListener(new s(this));
                m3Var.f41440b.setOnItemClickListener(new m4.s0(7, this, m3Var));
                i13++;
            }
            this.f40433g0.addView(new FrameLayout(activity), org.telegram.ui.Components.gb1.h(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f40448w0.setColor(-16777216);
            this.f40449x0.setColor(-16777216);
            this.A0.setColor(-14408666);
            this.f40450y0.setColor(-16777216);
            l0 l0Var = new l0(this, activity);
            this.f40434h0 = l0Var;
            if (this.K != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            l0Var.f45396e0 = z10;
            this.f40433g0.addView(l0Var, org.telegram.ui.Components.gb1.i(-1, -2, 48));
            this.f40434h0.setOnClickListener(new org.telegram.ui.ActionBar.u1(2, this, activity));
            this.f40434h0.f45392b0.addTextChangedListener(new m0(this, 0));
            org.telegram.ui.web.l lVar = new org.telegram.ui.web.l(activity);
            this.f40435i0 = lVar;
            lVar.setOpenProgress(0.0f);
            this.f40435i0.f45303w.j(new i3(this, 2));
            this.f40433g0.addView(this.f40435i0, org.telegram.ui.Components.gb1.g(-1.0f, -1));
            this.f40436j0 = new a0(this, 3);
            this.f40434h0.L.setOnClickListener(new r(this, 2));
            this.f40434h0.L.setOnLongClickListener(new t(this, 0));
            this.f40434h0.setMenuListener(new li.s2(5, this, activity));
            this.f40434h0.O.setOnClickListener(new r(this, 3));
            di.i4 i4Var = new di.i4(this.L, 6);
            this.f40442q0 = i4Var;
            i4Var.setOnTouchListener(new ei.d(3));
            this.f40442q0.setWillNotDraw(false);
            this.f40442q0.setTranslationY(AndroidUtilities.dp(51.0f));
            this.f40442q0.setVisibility(4);
            this.f40442q0.setFocusable(true);
            this.f40442q0.setFocusableInTouchMode(true);
            this.f40442q0.setClickable(true);
            this.f40442q0.setPadding(0, AndroidUtilities.dp(3.0f), 0, 0);
            this.f40433g0.addView(this.f40442q0, org.telegram.ui.Components.gb1.i(-1, 51, 80));
            new fi.z3(this.f40432f0, false, new q(this, 0));
            ImageView imageView = new ImageView(this.L);
            this.f40443r0 = imageView;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            this.f40443r0.setImageResource(R.drawable.msg_go_up);
            ImageView imageView2 = this.f40443r0;
            int i14 = org.telegram.ui.ActionBar.y6.G6;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.f7.t(imageView2, i14, null, mode);
            ImageView imageView3 = this.f40443r0;
            int i15 = org.telegram.ui.ActionBar.y6.f23767z8;
            org.telegram.ui.ActionBar.f7.R(imageView3, org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.x0(null, i15, false), 1, -1), null, org.telegram.ui.ActionBar.f7.N(i15), null);
            this.f40442q0.addView(this.f40443r0, org.telegram.ui.Components.gb1.h(48, 48.0f, 53, 0.0f, 0.0f, 48.0f, 0.0f));
            this.f40443r0.setOnClickListener(new r(this, 0));
            this.f40443r0.setContentDescription(LocaleController.getString(R.string.AccDescrSearchNext));
            ImageView imageView4 = new ImageView(this.L);
            this.f40444s0 = imageView4;
            imageView4.setScaleType(scaleType);
            this.f40444s0.setImageResource(R.drawable.msg_go_down);
            org.telegram.ui.ActionBar.f7.t(this.f40444s0, i14, null, mode);
            org.telegram.ui.ActionBar.f7.R(this.f40444s0, org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.x0(null, i15, false), 1, -1), null, org.telegram.ui.ActionBar.f7.N(i15), null);
            this.f40442q0.addView(this.f40444s0, org.telegram.ui.Components.gb1.h(48, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f40444s0.setOnClickListener(new r(this, 1));
            this.f40444s0.setContentDescription(LocaleController.getString(R.string.AccDescrSearchPrev));
            org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(this.L, true, true, true);
            this.f40445t0 = s6Var;
            s6Var.setScaleProperty(0.6f);
            this.f40445t0.b(0.4f, 350L, org.telegram.ui.Components.ds.h);
            org.telegram.ui.ActionBar.f7.Z(this.f40445t0, i14, null);
            this.f40445t0.setTextSize(AndroidUtilities.dp(15.0f));
            this.f40445t0.setTypeface(AndroidUtilities.bold());
            this.f40445t0.setGravity(3);
            this.f40445t0.getDrawable().M = AndroidUtilities.displaySize.x;
            this.f40442q0.addView(this.f40445t0, org.telegram.ui.Components.gb1.h(-2, -2.0f, 19, 18.0f, 0.0f, 108.0f, 0.0f));
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.f40431e0 = layoutParams;
            layoutParams.height = -1;
            layoutParams.format = -3;
            layoutParams.width = -1;
            layoutParams.gravity = 51;
            layoutParams.type = 98;
            layoutParams.softInputMode = 48;
            layoutParams.flags = 131072;
            if (this.K == null) {
                x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23297a7, true);
            } else {
                x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23297a7, false);
            }
            if (AndroidUtilities.computePerceivedBrightness(x02) >= 0.721f && Build.VERSION.SDK_INT >= 26) {
                i11 = 1808;
            } else {
                i11 = 1792;
            }
            this.f40450y0.setColor(x02);
            this.f40451z0 = true;
            WindowManager.LayoutParams layoutParams2 = this.f40431e0;
            layoutParams2.systemUiVisibility = i11;
            layoutParams2.flags |= -2147417856;
            if (Build.VERSION.SDK_INT >= 28) {
                layoutParams2.layoutInDisplayCutoutMode = 1;
            }
            org.telegram.ui.Cells.s9 s9Var = new org.telegram.ui.Cells.s9();
            this.P0 = s9Var;
            s9Var.S(this.f40446u0[0].f41440b);
            if (MessagesController.getInstance(this.X).getTranslateController().isContextTranslateEnabled()) {
                this.P0.f24103k0 = new s(this);
            }
            org.telegram.ui.Cells.s9 s9Var2 = this.P0;
            s9Var2.f25418z0 = this.f40446u0[0].d;
            s9Var2.D = new o0(this);
            this.f40433g0.addView(s9Var2.n(activity));
            k0 k0Var2 = this.f40433g0;
            cv0 cv0Var = new cv0(k0Var2, k0Var2);
            this.R0 = cv0Var;
            cv0Var.F = new s(this);
            cv0Var.E = new f(this, 1);
            this.f40438l0.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Pk, false));
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
        org.telegram.ui.ActionBar.k3 k3Var = this.I;
        if (k3Var != null) {
            k3Var.dismiss();
            this.I = null;
        }
        org.telegram.ui.ActionBar.k3 k3Var2 = new org.telegram.ui.ActionBar.k3(1, (Context) this.L, (org.telegram.ui.ActionBar.u6) null, false);
        k3Var2.fixNavigationBar();
        try {
            str2 = URLDecoder.decode(str.replaceAll("\\+", "%2b"), "UTF-8");
        } catch (Exception e) {
            FileLog.e(e);
            str2 = str;
        }
        k3Var2.title = str2;
        k3Var2.bigTitle = false;
        k3Var2.multipleLinesTitle = true;
        CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
        ng.j jVar = new ng.j(1, this, str);
        k3Var2.items = charSequenceArr;
        k3Var2.onClickListener = jVar;
        k3Var2.setOnHideListener(new u(this, 0));
        a0(k3Var2);
    }

    @Override
    public final int a() {
        return org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23746y6, false);
    }

    public final void a0(org.telegram.ui.ActionBar.k3 k3Var) {
        if (this.L != null) {
            try {
                org.telegram.ui.ActionBar.k3 k3Var2 = this.f40437k0;
                if (k3Var2 != null) {
                    k3Var2.dismiss();
                    this.f40437k0 = null;
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            try {
                this.f40437k0 = k3Var;
                k3Var.setCanceledOnTouchOutside(true);
                this.f40437k0.setOnDismissListener(new u(this, 1));
                k3Var.show();
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
    }

    @Override
    public final int b() {
        return org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.G6, false);
    }

    public final void b0(boolean z10) {
        AndroidUtilities.cancelRunOnUIThread(this.f40436j0);
        if (z10) {
            this.f40434h0.f45395d0.a(0.0f, false);
            this.f40434h0.f45395d0.a(0.3f, true);
            AndroidUtilities.runOnUIThread(this.f40436j0, 100L);
            return;
        }
        this.f40434h0.f45395d0.a(1.0f, true);
    }

    @Override
    public final void c(h4 h4Var, org.telegram.ui.Components.u11 u11Var) {
        String str;
        String str2;
        org.telegram.ui.Components.aa0 aa0Var;
        String lowerCase;
        if (u11Var != null && (str = u11Var.f33204b) != null) {
            org.telegram.ui.ActionBar.k3 k3Var = this.I;
            j0 j0Var = null;
            if (k3Var != null) {
                k3Var.dismiss();
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
                a3 a3Var = this.d;
                if (a3Var != null && (aa0Var = this.f39917b) != null) {
                    j0Var = new j0(this, a3Var, aa0Var);
                }
                Q(str, str2, j0Var);
            }
        }
    }

    public final void c0() {
        LaunchActivity launchActivity;
        FrameLayout frameLayout;
        if (this.W && (launchActivity = LaunchActivity.I1) != null && !launchActivity.isFinishing()) {
            if (this.f40446u0[0].f()) {
                if (this.f40446u0[0].getWebView() != null) {
                    frameLayout = this.f40446u0[0].f41442f;
                } else {
                    return;
                }
            } else {
                m3 m3Var = this.f40446u0[0];
                TLRPC.WebPage webPage = m3Var.f41441c.E;
                frameLayout = m3Var;
                if (webPage == null) {
                    return;
                }
            }
            new org.telegram.ui.Components.wc(frameLayout, null).G(R.raw.chats_infotip, 4, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BrowserExternalRestricted), new a0(this, 10))).k(true);
        }
    }

    @Override
    public final boolean d(TL_iv.PageBlock pageBlock, h4 h4Var) {
        int indexOf;
        List list;
        org.telegram.ui.ActionBar.r2 r2Var = this.M;
        if (r2Var != null && r2Var.getParentActivity() != null) {
            if ((pageBlock instanceof TL_iv.pageBlockVideo) && !f4.g(h4Var.E, pageBlock)) {
                list = Collections.singletonList(pageBlock);
                indexOf = 0;
            } else {
                ArrayList arrayList = new ArrayList(h4Var.f39880f);
                indexOf = h4Var.f39880f.indexOf(pageBlock);
                list = arrayList;
            }
            PhotoViewer u12 = PhotoViewer.u1();
            u12.M2(null, this.M, null);
            if (u12.g2(null, null, null, null, null, null, null, indexOf, new f3(this, list), null, 0L, 0L, 0L, true, new o3(this, h4Var.E, list), null)) {
                n();
                return true;
            }
        }
        return false;
    }

    public final void d0(boolean z10) {
        float f7;
        this.f40442q0.setVisibility(0);
        ValueAnimator valueAnimator = this.Y0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.Z0;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.Y0 = ofFloat;
        ofFloat.addUpdateListener(new p(this, 1));
        this.Y0.addListener(new bh.f0(20, this, z10));
        this.Y0.setDuration(320L);
        this.Y0.setInterpolator(org.telegram.ui.Components.ds.h);
        this.Y0.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        z0 z0Var;
        MessageObject messageObject;
        if (i10 == NotificationCenter.messagePlayingDidStart) {
            MessageObject messageObject2 = (MessageObject) objArr[0];
            if (this.f40446u0 != null) {
                int i12 = 0;
                while (true) {
                    m3[] m3VarArr = this.f40446u0;
                    if (i12 < m3VarArr.length) {
                        int childCount = m3VarArr[i12].f41440b.getChildCount();
                        for (int i13 = 0; i13 < childCount; i13++) {
                            View childAt = this.f40446u0[i12].f41440b.getChildAt(i13);
                            if (childAt instanceof z0) {
                                ((z0) childAt).a(true);
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
                if (this.f40446u0 != null) {
                    int i14 = 0;
                    while (true) {
                        m3[] m3VarArr2 = this.f40446u0;
                        if (i14 < m3VarArr2.length) {
                            int childCount2 = m3VarArr2[i14].f41440b.getChildCount();
                            int i15 = 0;
                            while (true) {
                                if (i15 < childCount2) {
                                    View childAt2 = this.f40446u0[i14].f41440b.getChildAt(i15);
                                    if ((childAt2 instanceof z0) && (messageObject = (z0Var = (z0) childAt2).getMessageObject()) != null && messageObject.getId() == num.intValue()) {
                                        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                                        if (playingMessageObject != null) {
                                            messageObject.audioProgress = playingMessageObject.audioProgress;
                                            messageObject.audioProgressSec = playingMessageObject.audioProgressSec;
                                            messageObject.audioPlayerDuration = playingMessageObject.audioPlayerDuration;
                                            z0Var.b();
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
            } else if (i10 == NotificationCenter.emojiLoaded && this.f40446u0 != null) {
                int i16 = 0;
                while (true) {
                    m3[] m3VarArr3 = this.f40446u0;
                    if (i16 < m3VarArr3.length) {
                        int childCount3 = m3VarArr3[i16].f41440b.getChildCount();
                        for (int i17 = 0; i17 < childCount3; i17++) {
                            View childAt3 = this.f40446u0[i16].f41440b.getChildAt(i17);
                            if (childAt3 instanceof t2) {
                                ((t2) childAt3).e.invalidate();
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
        } else if (this.f40446u0 != null) {
            int i18 = 0;
            while (true) {
                m3[] m3VarArr4 = this.f40446u0;
                if (i18 < m3VarArr4.length) {
                    int childCount4 = m3VarArr4[i18].f41440b.getChildCount();
                    for (int i19 = 0; i19 < childCount4; i19++) {
                        View childAt4 = this.f40446u0[i18].f41440b.getChildAt(i19);
                        if (childAt4 instanceof z0) {
                            z0 z0Var2 = (z0) childAt4;
                            if (z0Var2.getMessageObject() != null) {
                                z0Var2.a(true);
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
            if (((obj instanceof TLRPC.WebPage) && ((TLRPC.WebPage) obj).cached_page != null) || (obj instanceof y2)) {
                int i14 = 1;
                if (!z10 && i10 != 0) {
                    m3[] m3VarArr = this.f40446u0;
                    m3 m3Var = m3VarArr[1];
                    m3VarArr[1] = m3VarArr[0];
                    m3VarArr[0] = m3Var;
                    this.f40434h0.i();
                    this.f40426a1.a(this.f40446u0[0].getBackgroundColor(), true);
                    this.f40428b1.a(this.f40446u0[1].getBackgroundColor(), true);
                    v3 v3Var = this.K;
                    if (v3Var != null) {
                        v3Var.m();
                    }
                    int indexOfChild = this.f40433g0.indexOfChild(this.f40446u0[0]);
                    int indexOfChild2 = this.f40433g0.indexOfChild(this.f40446u0[1]);
                    if (i10 == 1) {
                        if (indexOfChild < indexOfChild2) {
                            this.f40433g0.removeView(this.f40446u0[0]);
                            this.f40433g0.addView(this.f40446u0[0], indexOfChild2);
                        }
                    } else if (indexOfChild2 < indexOfChild) {
                        this.f40433g0.removeView(this.f40446u0[0]);
                        this.f40433g0.addView(this.f40446u0[0], indexOfChild);
                    }
                    this.f40447v0 = new AnimatorSet();
                    this.f40446u0[0].setVisibility(0);
                    if (i10 == 1) {
                        i13 = 0;
                    } else {
                        i13 = 1;
                    }
                    m3 m3Var2 = this.f40446u0[i13];
                    if (this.K == null) {
                        color = 0;
                    } else {
                        color = this.f40438l0.getColor();
                    }
                    m3Var2.setBackgroundColor(color);
                    this.f40446u0[i13].setLayerType(2, null);
                    if (i10 == 1) {
                        this.f40446u0[0].setTranslationX(AndroidUtilities.displaySize.x);
                        this.f40447v0.playTogether(ObjectAnimator.ofFloat(this.f40446u0[0], View.TRANSLATION_X, AndroidUtilities.displaySize.x, 0.0f));
                    } else if (i10 == -1) {
                        this.f40446u0[0].setTranslationX(0.0f);
                        this.f40447v0.playTogether(ObjectAnimator.ofFloat(this.f40446u0[1], View.TRANSLATION_X, 0.0f, AndroidUtilities.displaySize.x));
                    }
                    this.f40447v0.setDuration(320L);
                    this.f40447v0.setInterpolator(org.telegram.ui.Components.ds.h);
                    this.f40447v0.addListener(new t0(this, i13, 0));
                    this.f40432f0.f23813f = true;
                    l0 l0Var = this.f40434h0;
                    m3 m3Var3 = this.f40446u0[0];
                    if (m3Var3 != null && SharedConfig.adaptableColorInBrowser) {
                        x02 = m3Var3.getBackgroundColor();
                    } else {
                        x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Pk, false);
                    }
                    l0Var.setMenuColors(x02);
                    l0 l0Var2 = this.f40434h0;
                    m3 m3Var4 = this.f40446u0[0];
                    if (m3Var4 != null && SharedConfig.adaptableColorInBrowser) {
                        x03 = m3Var4.getActionBarColor();
                    } else {
                        x03 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Pk, false);
                    }
                    l0Var2.d(x03, true);
                    l0 l0Var3 = this.f40434h0;
                    m3 m3Var5 = this.f40446u0[0];
                    if (m3Var5 != null && m3Var5.e()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    l0Var3.setIsTonsite(z11);
                    l0 l0Var4 = this.f40434h0;
                    m3 m3Var6 = this.f40446u0[0];
                    if (m3Var6 != null && m3Var6.d()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    l0Var4.setIsLocal(z12);
                    AnimatorSet animatorSet = this.f40447v0;
                    Objects.requireNonNull(animatorSet);
                    AndroidUtilities.runOnUIThread(new zt0(animatorSet, 4));
                }
                if (!z10) {
                    this.P0.f(true);
                }
                h4 h4Var = this.f40446u0[z10 ? 1 : 0].f41441c;
                if (z10) {
                    obj = ic.a.g(2, this.f40430d0);
                }
                this.f40446u0[z10 ? 1 : 0].b();
                if (obj instanceof TLRPC.WebPage) {
                    TLRPC.WebPage webPage = (TLRPC.WebPage) obj;
                    this.f40446u0[z10 ? 1 : 0].setWeb(null);
                    this.f40446u0[z10 ? 1 : 0].setType(0);
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
                    if (this.f40430d0.size() != 1 && i10 != -1) {
                        s4.c0 c0Var = this.f40446u0[z10 ? 1 : 0].d;
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
                        String str = "article" + webPage.f22180id;
                        int i16 = sharedPreferences.getInt(str, -1);
                        boolean z13 = sharedPreferences.getBoolean(str + "r", true);
                        Point point = AndroidUtilities.displaySize;
                        if (point.x <= point.y) {
                            i14 = 0;
                        }
                        if (z13 == i14) {
                            dp = sharedPreferences.getInt(str + "o", 0) - this.f40446u0[z10 ? 1 : 0].f41440b.getPaddingTop();
                        } else {
                            dp = AndroidUtilities.dp(10.0f);
                        }
                        if (i16 != -1) {
                            this.f40446u0[z10 ? 1 : 0].d.h1(i16, dp);
                        }
                    }
                } else if (obj instanceof y2) {
                    this.f40446u0[z10 ? 1 : 0].setType(1);
                    this.f40446u0[z10 ? 1 : 0].g();
                    this.f40446u0[z10 ? 1 : 0].setWeb((y2) obj);
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
        if (this.f40434h0 != null && (m3Var = (m3VarArr = this.f40446u0)[0]) != null && m3VarArr[1] != null) {
            int visibility = m3Var.getVisibility();
            float f10 = 0.0f;
            if (visibility != 0) {
                translationX = 0.0f;
            } else {
                translationX = 1.0f - (this.f40446u0[0].getTranslationX() / this.f40446u0[0].getWidth());
            }
            float f11 = 1.0f - translationX;
            l0 l0Var = this.f40434h0;
            l0Var.d[0] = this.f40446u0[0].getProgress();
            l0Var.invalidate();
            l0 l0Var2 = this.f40434h0;
            l0Var2.d[1] = this.f40446u0[1].getProgress();
            l0Var2.invalidate();
            this.f40434h0.setTransitionProgress(f11);
            l0 l0Var3 = this.f40434h0;
            if (!l0Var3.W && !l0Var3.T) {
                ArticleViewer$WindowView articleViewer$WindowView = this.f40432f0;
                if (articleViewer$WindowView.e || articleViewer$WindowView.f23813f) {
                    boolean J = J();
                    ArrayList arrayList = this.f40430d0;
                    if (!J && arrayList.size() <= 1) {
                        this.f40434h0.P.f();
                        this.f40434h0.setBackButtonCached(false);
                    } else {
                        if (!this.f40446u0[0].f41445s && arrayList.size() <= 1) {
                            f7 = 0.0f;
                        } else {
                            f7 = 1.0f;
                        }
                        if (this.f40446u0[1].f41445s || arrayList.size() > 2) {
                            f10 = 1.0f;
                        }
                        float lerp = AndroidUtilities.lerp(f7, f10, f11);
                        this.f40434h0.M.c(1.0f - lerp, false);
                        this.f40434h0.P.f();
                        l0 l0Var4 = this.f40434h0;
                        if (lerp > 0.5f) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        l0Var4.setBackButtonCached(z12);
                    }
                    this.f40434h0.setHasForward(this.f40446u0[0].v);
                    this.f40434h0.setIsLocal(this.f40446u0[0].d());
                    l0 l0Var5 = this.f40434h0;
                    if (this.f40446u0[0].getWebView() != null && this.f40446u0[0].getWebView().f45440b) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    l0Var5.setIsLoaded(z13);
                }
            }
            l0 l0Var6 = this.f40434h0;
            int actionBarColor = this.f40446u0[0].getActionBarColor();
            ArticleViewer$WindowView articleViewer$WindowView2 = this.f40432f0;
            if (!articleViewer$WindowView2.e && !articleViewer$WindowView2.f23813f) {
                z10 = false;
            } else {
                z10 = true;
            }
            l0Var6.b(0, this.f40426a1.a(actionBarColor, z10));
            l0 l0Var7 = this.f40434h0;
            int actionBarColor2 = this.f40446u0[1].getActionBarColor();
            ArticleViewer$WindowView articleViewer$WindowView3 = this.f40432f0;
            if (!articleViewer$WindowView3.e && !articleViewer$WindowView3.f23813f) {
                z11 = false;
            } else {
                z11 = true;
            }
            l0Var7.b(1, this.f40428b1.a(actionBarColor2, z11));
            this.f40434h0.d(i0.a.f(f11, this.f40446u0[0].getActionBarColor(), this.f40446u0[1].getActionBarColor()), false);
            l0 l0Var8 = this.f40434h0;
            if (translationX > 0.5f) {
                m3Var2 = this.f40446u0[0];
            } else {
                m3Var2 = this.f40446u0[1];
            }
            l0Var8.setMenuType(m3Var2.f41439a);
            v3 v3Var = this.K;
            if (v3Var != null) {
                v3Var.f44583c.invalidate();
                return;
            }
            ArticleViewer$WindowView articleViewer$WindowView4 = this.f40432f0;
            if (articleViewer$WindowView4 != null) {
                articleViewer$WindowView4.invalidate();
            }
        }
    }

    public final void g(int i10, String str) {
        U();
        org.telegram.ui.ActionBar.r3 r3Var = new org.telegram.ui.ActionBar.r3();
        r3Var.f23021x = str;
        this.f40430d0.add(r3Var);
        this.f40434h0.h(false);
        e0(i10, r3Var, false);
    }

    public final boolean h(TLRPC.WebPage webPage, String str, int i10) {
        U();
        this.f40430d0.add(webPage);
        this.f40434h0.h(false);
        e0(i10, webPage, false);
        return V(str, false);
    }

    public final void h0() {
        int i10;
        int size;
        boolean z10;
        boolean z11;
        float f7;
        if (this.E == null && !this.f40446u0[0].f()) {
            return;
        }
        if (this.f40446u0[0].f()) {
            if (this.f40446u0[0].getWebView() == null) {
                i10 = 0;
            } else {
                i10 = this.f40446u0[0].getWebView().getSearchIndex();
            }
            if (this.f40446u0[0].getWebView() == null) {
                size = 0;
            } else {
                size = this.f40446u0[0].getWebView().getSearchCount();
            }
        } else {
            i10 = this.G;
            size = this.E.size();
        }
        ImageView imageView = this.f40443r0;
        if (size > 0 && i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        imageView.setEnabled(z10);
        ImageView imageView2 = this.f40444s0;
        if (size > 0 && i10 != size - 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        imageView2.setEnabled(z11);
        ImageView imageView3 = this.f40443r0;
        float f10 = 0.5f;
        if (imageView3.isEnabled()) {
            f7 = 1.0f;
        } else {
            f7 = 0.5f;
        }
        imageView3.setAlpha(f7);
        ImageView imageView4 = this.f40444s0;
        if (imageView4.isEnabled()) {
            f10 = 1.0f;
        }
        imageView4.setAlpha(f10);
        this.f40445t0.a();
        if (size < 0) {
            this.f40445t0.setText("");
        } else if (size == 0) {
            this.f40445t0.setText(LocaleController.getString(R.string.NoResult));
        } else if (size == 1) {
            this.f40445t0.setText(LocaleController.getString(R.string.OneResult));
        } else {
            this.f40445t0.setText(String.format(LocaleController.getPluralString("CountOfResults", size), Integer.valueOf(i10 + 1), Integer.valueOf(size)));
        }
    }

    public final void i0(boolean z10) {
        boolean z11;
        boolean z12 = false;
        this.f40434h0.g(0, this.f40446u0[0].getTitle(), z10);
        this.f40434h0.f(0, this.f40446u0[0].getSubtitle());
        l0 l0Var = this.f40434h0;
        if (this.f40446u0[0].f() && this.f40446u0[0].getWebView() != null && this.f40446u0[0].getWebView().E) {
            z11 = true;
        } else {
            z11 = false;
        }
        l0Var.e(0, z11);
        this.f40434h0.g(1, this.f40446u0[1].getTitle(), z10);
        this.f40434h0.f(1, this.f40446u0[1].getSubtitle());
        l0 l0Var2 = this.f40434h0;
        if (this.f40446u0[1].f() && this.f40446u0[1].getWebView() != null && this.f40446u0[1].getWebView().E) {
            z12 = true;
        }
        l0Var2.e(1, z12);
    }

    public final void k() {
        this.K0 = false;
        z2 z2Var = this.L0;
        if (z2Var != null) {
            this.f40432f0.removeCallbacks(z2Var);
            this.L0 = null;
        }
        z2 z2Var2 = this.M0;
        if (z2Var2 != null) {
            this.f40432f0.removeCallbacks(z2Var2);
            this.M0 = null;
        }
    }

    public final void m(org.telegram.messenger.i6 i6Var) {
        if (this.J0 == AndroidUtilities.dp(56.0f)) {
            if (i6Var != null) {
                i6Var.run();
                return;
            }
            return;
        }
        ValueAnimator duration = ValueAnimator.ofObject(new IntEvaluator(), Integer.valueOf(this.J0), Integer.valueOf(AndroidUtilities.dp(56.0f))).setDuration(180L);
        duration.setInterpolator(new DecelerateInterpolator());
        duration.addUpdateListener(new p(this, 0));
        duration.addListener(new q0(0, i6Var));
        if (i6Var != null) {
            duration.setDuration(duration.getDuration() / 2);
        }
        duration.start();
    }

    public final void n() {
        long j10;
        w2 w2Var;
        fi.v vVar = this.f40446u0[0].f41440b;
        if (vVar != null && this.W) {
            float measuredHeight = vVar.getMeasuredHeight() / 2.0f;
            Uri uri = null;
            float f7 = 0.0f;
            w2 w2Var2 = null;
            for (int i10 = 0; i10 < vVar.getChildCount(); i10++) {
                View childAt = vVar.getChildAt(i10);
                if (childAt instanceof w2) {
                    float measuredHeight2 = (childAt.getMeasuredHeight() / 2.0f) + childAt.getTop();
                    if (w2Var2 == null || Math.abs(measuredHeight - measuredHeight2) < Math.abs(measuredHeight - f7)) {
                        w2Var2 = (w2) childAt;
                        f7 = measuredHeight2;
                    }
                }
            }
            boolean z10 = PhotoViewer.u1().f35652f;
            if (z10 || ((w2Var = this.f39924x) != null && w2Var != w2Var2 && this.f39923w != null)) {
                VideoPlayerHolderBase videoPlayerHolderBase = this.f39923w;
                if (videoPlayerHolderBase != null) {
                    w2 w2Var3 = this.f39924x;
                    long j11 = w2Var3.L.video_id;
                    x2 a2 = x2.a(videoPlayerHolderBase, w2Var3);
                    w2Var3.c(a2);
                    this.f39925y.k(a2, j11);
                    w2 w2Var4 = this.f39924x;
                    x2 x2Var = w2Var4.M;
                    if (x2Var != null) {
                        Bitmap bitmap = x2Var.f45626b;
                        if (bitmap != null) {
                            w2Var4.e.setImageBitmap(bitmap);
                        }
                        this.f39924x.e(false);
                    }
                    this.f39923w.release(null);
                }
                this.f39923w = null;
                this.f39924x = null;
            }
            if (!z10 && w2Var2 != null) {
                h70 h70Var = w2Var2.f44945a;
                if (w2Var2.O != null && h70Var.f39923w == null) {
                    h70Var.f39923w = new v2(w2Var2).with(w2Var2.f44949n);
                    TLRPC.Document document = w2Var2.O;
                    for (int i11 = 0; i11 < document.attributes.size(); i11++) {
                        if (document.attributes.get(i11) instanceof TLRPC.TL_documentAttributeVideo) {
                            TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) document.attributes.get(i11);
                            w2Var2.h.a(tL_documentAttributeVideo.f22034w / tL_documentAttributeVideo.h, 0);
                        }
                    }
                    TLRPC.WebPage webPage = w2Var2.f44946b.E;
                    if (webPage != null) {
                        uri = FileStreamLoadOperation.prepareUri(((j4) h70Var).X, document, webPage);
                    }
                    if (uri != null) {
                        VideoPlayerHolderBase videoPlayerHolderBase2 = h70Var.f39923w;
                        x2 x2Var2 = w2Var2.M;
                        if (x2Var2 == null) {
                            j10 = 0;
                        } else {
                            j10 = x2Var2.f45625a;
                        }
                        videoPlayerHolderBase2.seekTo(j10);
                        h70Var.f39923w.preparePlayer(uri, true, 1.0f);
                        h70Var.f39923w.play();
                    }
                }
                this.f39924x = w2Var2;
            }
        }
    }

    public final void o(boolean z10, boolean z11) {
        if (this.L != null && !this.U0 && this.V) {
            int i10 = 0;
            if (this.Z != 0 && Math.abs(this.f40427b0 - System.currentTimeMillis()) >= 500) {
                Runnable runnable = this.f40425a0;
                if (runnable != null) {
                    runnable.run();
                    this.f40425a0 = null;
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
                        org.telegram.ui.Components.ma1 ma1Var = this.F0;
                        if (ma1Var != null && ma1Var.T) {
                            ma1Var.T = false;
                            ma1Var.m();
                            ma1Var.l(false);
                        }
                    }
                    if (!z11) {
                        return;
                    }
                }
                if (this.P0.x()) {
                    this.P0.f(false);
                    return;
                }
                l0 l0Var = this.f40434h0;
                if (l0Var.T) {
                    l0Var.h(false);
                } else if (l0Var.W) {
                    l0Var.k(false);
                } else {
                    if (this.G0 != 0) {
                        ConnectionsManager.getInstance(this.X).cancelRequest(this.G0, true);
                        this.G0 = 0;
                        b0(false);
                    }
                    if (this.H0 != 0) {
                        ConnectionsManager.getInstance(this.X).cancelRequest(this.H0, true);
                        this.H0 = 0;
                        b0(false);
                    }
                    U();
                    if (z10 && !z11) {
                        ArrayList arrayList = this.f40430d0;
                        if (arrayList.size() >= 2) {
                            Object y3 = ic.a.y(1, arrayList);
                            if (y3 instanceof y2) {
                                ((y2) y3).a();
                            }
                            if (y3 instanceof TLRPC.WebPage) {
                                org.telegram.ui.web.h2.o((TLRPC.WebPage) y3);
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
                    ag.b1 b1Var = this.V0;
                    if (b1Var != null) {
                        b1Var.destroy();
                        this.V0 = null;
                    }
                    this.M = null;
                    try {
                        org.telegram.ui.ActionBar.k3 k3Var = this.f40437k0;
                        if (k3Var != null) {
                            k3Var.dismiss();
                            this.f40437k0 = null;
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    ArticleViewer$WindowView articleViewer$WindowView = this.f40432f0;
                    Property property = View.ALPHA;
                    animatorSet.playTogether(ObjectAnimator.ofFloat(articleViewer$WindowView, property, 0.0f), ObjectAnimator.ofFloat(this.f40433g0, property, 0.0f), ObjectAnimator.ofFloat(this.f40432f0, View.TRANSLATION_X, 0.0f, AndroidUtilities.dp(56.0f)));
                    this.Z = 2;
                    this.f40425a0 = new a0(this, 7);
                    animatorSet.setDuration(150L);
                    animatorSet.setInterpolator(this.f40429c0);
                    animatorSet.addListener(new kg.e(this, 4));
                    this.f40427b0 = System.currentTimeMillis();
                    this.f40433g0.setLayerType(2, null);
                    animatorSet.start();
                    while (true) {
                        a0.h hVar = this.f39925y;
                        if (i10 < hVar.m()) {
                            x2 x2Var = (x2) hVar.n(i10);
                            Bitmap bitmap = x2Var.f45626b;
                            if (bitmap != null) {
                                bitmap.recycle();
                                x2Var.f45626b = null;
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
            ArrayList arrayList = this.f40430d0;
            if (i10 < arrayList.size()) {
                Object obj = arrayList.get(i10);
                if (obj instanceof y2) {
                    m3 m3Var = this.f40446u0[0];
                    if (m3Var != null && m3Var.K == obj) {
                        ((y2) obj).c(m3Var);
                    }
                    m3 m3Var2 = this.f40446u0[1];
                    if (m3Var2 != null && m3Var2.K == obj) {
                        ((y2) obj).c(m3Var2);
                    }
                    ((y2) obj).a();
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
        if (this.L != null && (articleViewer$WindowView = this.f40432f0) != null) {
            if (this.K == null) {
                try {
                    if (articleViewer$WindowView.getParent() != null) {
                        ((WindowManager) this.L.getSystemService("window")).removeViewImmediate(this.f40432f0);
                    }
                    this.f40432f0 = null;
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            for (int i10 = 0; i10 < this.N.size(); i10++) {
                ((s1) this.N.get(i10)).a(true);
            }
            this.N.clear();
            try {
                this.L.getWindow().clearFlags(128);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            this.L = null;
            this.M = null;
            f40403d1 = null;
        }
    }

    public j4(org.telegram.ui.ActionBar.r2 r2Var) {
        this.N = new ArrayList();
        this.Y = 1;
        this.f40429c0 = new DecelerateInterpolator(1.5f);
        this.f40430d0 = new ArrayList();
        this.f40448w0 = new Paint();
        this.f40449x0 = new Paint();
        this.f40450y0 = new Paint();
        this.A0 = new Paint();
        this.K0 = false;
        this.L0 = null;
        this.M0 = null;
        this.S0 = new AnimationNotificationsLocker(new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats});
        this.T0 = new k0[2];
        this.X0 = -1;
        a0 a0Var = new a0(this, 2);
        org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.h;
        this.f40426a1 = new org.telegram.ui.Components.j5(a0Var, 320L, dsVar);
        this.f40428b1 = new org.telegram.ui.Components.j5(new a0(this, 4), 320L, dsVar);
        this.J = true;
        this.K = new v3(this, r2Var);
        Y(r2Var.getParentActivity(), r2Var);
    }
}
