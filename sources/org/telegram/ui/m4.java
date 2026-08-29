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
public final class m4 extends d70 implements NotificationCenter.NotificationCenterDelegate {
    public static TextPaint f40368c1;
    public static TextPaint f40369d1;
    public static TextPaint f40370e1;
    public static TextPaint f40371f1;
    public static TextPaint f40372g1;
    public static TextPaint f40373h1;
    public static TextPaint f40374i1;
    public static TextPaint f40375j1;
    public static Paint f40376k1;
    public static Paint l1;
    public static Paint f40377m1;
    public static Paint f40378n1;
    public static Paint f40379o1;
    public static Paint f40380p1;
    public static Paint f40381q1;
    public static Paint f40382r1;
    public static Paint f40383s1;
    public static Paint f40384t1;
    public static Paint f40385u1;
    public static Paint f40386v1;
    public static Paint f40388x1;
    public org.telegram.ui.Components.s81 A0;
    public int B0;
    public int C0;
    public int D0;
    public int E0;
    public final boolean F;
    public boolean F0;
    public final z3 G;
    public e3 G0;
    public Activity H;
    public e3 H0;
    public org.telegram.ui.ActionBar.o2 I;
    public ye.c I0;
    public final ArrayList J;
    public int J0;
    public View K;
    public org.telegram.ui.Cells.k9 K0;
    public FrameLayout L;
    public org.telegram.ui.Cells.k9 L0;
    public TextureView M;
    public lu0 M0;
    public e5.c N;
    public final AnimationNotificationsLocker N0;
    public WebChromeClient.CustomViewCallback O;
    public final n0[] O0;
    public WindowInsets P;
    public boolean P0;
    public boolean Q;
    public jf.s0 Q0;
    public boolean R;
    public ag.v0 R0;
    public boolean S;
    public int S0;
    public int T;
    public ValueAnimator T0;
    public int U;
    public float U0;
    public int V;
    public final org.telegram.ui.Components.f5 V0;
    public Runnable W;
    public final org.telegram.ui.Components.f5 W0;
    public long X;
    public final DecelerateInterpolator Y;
    public final ArrayList Z;
    public WindowManager.LayoutParams f40389a0;
    public ArticleViewer$WindowView f40390b0;
    public n0 f40391c0;
    public o0 f40392d0;
    public org.telegram.ui.web.l f40393e0;
    public d0 f40394f0;
    public org.telegram.ui.ActionBar.f3 f40395g0;
    public Paint f40396h0;
    public Drawable f40397i0;
    public Paint f40398j0;
    public boolean f40399k0;
    public float f40400l0;
    public bh.d m0;
    public ImageView f40401n0;
    public ImageView f40402o0;
    public org.telegram.ui.Components.o6 f40403p0;
    public q3[] f40404q0;
    public AnimatorSet f40405r0;
    public final Paint f40406s0;
    public final Paint f40407t0;
    public final Paint f40408u0;
    public final Paint f40409v0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f40410w0;
    public TextView f40411x0;
    public Rect f40412y0;
    public org.telegram.ui.Components.s81 f40413z0;
    public static final HashSet X0 = new HashSet();
    public static volatile m4 Y0 = null;
    public static final w0 Z0 = new w0("innerTranslationX", 0);
    public static final TextPaint f40366a1 = new TextPaint(1);
    public static final u3 f40367b1 = new u3();
    public static final WeakHashMap f40387w1 = new WeakHashMap();

    public m4() {
        this.J = new ArrayList();
        this.U = 1;
        this.Y = new DecelerateInterpolator(1.5f);
        this.Z = new ArrayList();
        this.f40406s0 = new Paint();
        this.f40407t0 = new Paint();
        this.f40408u0 = new Paint();
        this.f40409v0 = new Paint();
        this.F0 = false;
        this.G0 = null;
        this.H0 = null;
        this.N0 = new AnimationNotificationsLocker(new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats});
        this.O0 = new n0[2];
        this.S0 = -1;
        d0 d0Var = new d0(this, 2);
        org.telegram.ui.Components.jr jrVar = org.telegram.ui.Components.jr.h;
        this.V0 = new org.telegram.ui.Components.f5(d0Var, 320L, jrVar);
        this.W0 = new org.telegram.ui.Components.f5(new d0(this, 4), 320L, jrVar);
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

    public static CharSequence C(d70 d70Var, TLRPC.WebPage webPage, View view, TL_iv.RichText richText, TL_iv.RichText richText2, TL_iv.PageBlock pageBlock, int i10) {
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.d01 d01Var;
        org.telegram.ui.Components.d01 d01Var2;
        TextPaint textPaint = null;
        if (richText2 == null) {
            return null;
        }
        if (richText2 instanceof TL_iv.textFixed) {
            return C(d70Var, webPage, view, richText, ((TL_iv.textFixed) richText2).text, pageBlock, i10);
        }
        if (richText2 instanceof TL_iv.textItalic) {
            return C(d70Var, webPage, view, richText, ((TL_iv.textItalic) richText2).text, pageBlock, i10);
        }
        if (richText2 instanceof TL_iv.textBold) {
            return C(d70Var, webPage, view, richText, ((TL_iv.textBold) richText2).text, pageBlock, i10);
        }
        if (richText2 instanceof TL_iv.textUnderline) {
            return C(d70Var, webPage, view, richText, ((TL_iv.textUnderline) richText2).text, pageBlock, i10);
        }
        if (richText2 instanceof TL_iv.textStrike) {
            return C(d70Var, webPage, view, richText, ((TL_iv.textStrike) richText2).text, pageBlock, i10);
        }
        if (richText2 instanceof TL_iv.textEmail) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C(d70Var, webPage, view, richText, ((TL_iv.textEmail) richText2).text, pageBlock, i10));
            MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), MetricAffectingSpan.class);
            if (spannableStringBuilder.length() != 0) {
                if (metricAffectingSpanArr == null || metricAffectingSpanArr.length == 0) {
                    textPaint = E(d70Var, richText, richText2, pageBlock);
                }
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.d01(textPaint, "mailto:" + F(richText2)), 0, spannableStringBuilder.length(), 33);
            }
            return spannableStringBuilder;
        }
        long j10 = 0;
        if (richText2 instanceof TL_iv.textUrl) {
            TL_iv.textUrl texturl = (TL_iv.textUrl) richText2;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(C(d70Var, webPage, view, richText, texturl.text, pageBlock, i10));
            MetricAffectingSpan[] metricAffectingSpanArr2 = (MetricAffectingSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), MetricAffectingSpan.class);
            if (metricAffectingSpanArr2 == null || metricAffectingSpanArr2.length == 0) {
                textPaint = E(d70Var, richText, richText2, pageBlock);
            }
            if (texturl.webpage_id != 0) {
                d01Var2 = new org.telegram.ui.Components.d01(textPaint, F(richText2));
            } else {
                d01Var2 = new org.telegram.ui.Components.d01(textPaint, F(richText2));
            }
            if (spannableStringBuilder2.length() != 0) {
                spannableStringBuilder2.setSpan(d01Var2, 0, spannableStringBuilder2.length(), 33);
            }
            return spannableStringBuilder2;
        } else if (richText2 instanceof TL_iv.textPlain) {
            return ((TL_iv.textPlain) richText2).text;
        } else {
            if (richText2 instanceof TL_iv.textAnchor) {
                TL_iv.textAnchor textanchor = (TL_iv.textAnchor) richText2;
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(C(d70Var, webPage, view, richText, textanchor.text, pageBlock, i10));
                String str = textanchor.name;
                ?? metricAffectingSpan = new MetricAffectingSpan();
                metricAffectingSpan.f27659a = str.toLowerCase();
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
                        CharSequence C = C(d70Var, webPage, view, richText, richText3, pageBlock, i10);
                        int D = D(A);
                        int length = spannableStringBuilder4.length();
                        spannableStringBuilder4.append(C);
                        if (D != 0 && !(C instanceof SpannableStringBuilder)) {
                            if ((D & 8) == 0 && (D & 512) == 0) {
                                if (length != spannableStringBuilder4.length()) {
                                    TextPaint E = E(d70Var, richText, A, pageBlock);
                                    ?? metricAffectingSpan2 = new MetricAffectingSpan();
                                    metricAffectingSpan2.f27257a = E;
                                    spannableStringBuilder4.setSpan(metricAffectingSpan2, length, spannableStringBuilder4.length(), 33);
                                }
                            } else {
                                String F = F(richText3);
                                if (F == null) {
                                    F = F(richText);
                                }
                                if ((D & 512) != 0) {
                                    d01Var = new org.telegram.ui.Components.d01(E(d70Var, richText, A, pageBlock), F);
                                } else {
                                    d01Var = new org.telegram.ui.Components.d01(E(d70Var, richText, A, pageBlock), F);
                                }
                                if (length != spannableStringBuilder4.length()) {
                                    spannableStringBuilder4.setSpan(d01Var, length, spannableStringBuilder4.length(), 33);
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
                    return C(d70Var, webPage, view, richText, ((TL_iv.textSubscript) richText2).text, pageBlock, i10);
                } else {
                    if (richText2 instanceof TL_iv.textSuperscript) {
                        return C(d70Var, webPage, view, richText, ((TL_iv.textSuperscript) richText2).text, pageBlock, i10);
                    }
                    if (richText2 instanceof TL_iv.textMarked) {
                        SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(C(d70Var, webPage, view, richText, ((TL_iv.textMarked) richText2).text, pageBlock, i10));
                        MetricAffectingSpan[] metricAffectingSpanArr3 = (MetricAffectingSpan[]) spannableStringBuilder5.getSpans(0, spannableStringBuilder5.length(), MetricAffectingSpan.class);
                        if (spannableStringBuilder5.length() != 0) {
                            if (metricAffectingSpanArr3 == null || metricAffectingSpanArr3.length == 0) {
                                textPaint = E(d70Var, richText, richText2, pageBlock);
                            }
                            ?? metricAffectingSpan3 = new MetricAffectingSpan();
                            metricAffectingSpan3.f26930a = textPaint;
                            spannableStringBuilder5.setSpan(metricAffectingSpan3, 0, spannableStringBuilder5.length(), 33);
                        }
                        return spannableStringBuilder5;
                    } else if (richText2 instanceof TL_iv.textSpoiler) {
                        SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder(C(d70Var, webPage, view, richText, ((TL_iv.textSpoiler) richText2).text, pageBlock, i10));
                        if (spannableStringBuilder6.length() != 0) {
                            ?? obj = new Object();
                            obj.f29024a |= 256;
                            spannableStringBuilder6.setSpan(new org.telegram.ui.Components.i01(obj, 0), 0, spannableStringBuilder6.length(), 33);
                        }
                        return spannableStringBuilder6;
                    } else if (richText2 instanceof TL_iv.textPhone) {
                        SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder(C(d70Var, webPage, view, richText, ((TL_iv.textPhone) richText2).text, pageBlock, i10));
                        MetricAffectingSpan[] metricAffectingSpanArr4 = (MetricAffectingSpan[]) spannableStringBuilder7.getSpans(0, spannableStringBuilder7.length(), MetricAffectingSpan.class);
                        if (spannableStringBuilder7.length() != 0) {
                            if (metricAffectingSpanArr4 == null || metricAffectingSpanArr4.length == 0) {
                                textPaint = E(d70Var, richText, richText2, pageBlock);
                            }
                            spannableStringBuilder7.setSpan(new org.telegram.ui.Components.d01(textPaint, "tel:" + F(richText2)), 0, spannableStringBuilder7.length(), 33);
                        }
                        return spannableStringBuilder7;
                    } else {
                        if (richText2 instanceof TL_iv.textImage) {
                            TL_iv.textImage textimage = (TL_iv.textImage) richText2;
                            TLRPC.Document a2 = j4.a(webPage, textimage.document_id);
                            TLRPC.Photo e10 = j4.e(webPage, textimage.photo_id);
                            if (a2 != null) {
                                SpannableStringBuilder spannableStringBuilder8 = new SpannableStringBuilder("*");
                                int dp = AndroidUtilities.dp(textimage.f22616w);
                                int dp2 = AndroidUtilities.dp(textimage.h);
                                int abs = Math.abs(i10);
                                if (dp > abs) {
                                    dp2 = (int) (dp2 * (abs / dp));
                                    dp = abs;
                                }
                                if (view != null) {
                                    int i12 = org.telegram.ui.ActionBar.g6.f23062d6;
                                    ((m4) d70Var).getClass();
                                    if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.w0(null, i12, false)) <= 0.705f) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    ?? replacementSpan = new ReplacementSpan();
                                    Locale locale = Locale.US;
                                    String str2 = dp + "_" + dp2 + "_i";
                                    replacementSpan.f26612b = dp;
                                    replacementSpan.f26613c = dp2;
                                    boolean z12 = z10;
                                    ImageReceiver imageReceiver = new ImageReceiver(view);
                                    replacementSpan.f26611a = imageReceiver;
                                    imageReceiver.setInvalidateAll(true);
                                    if (z12) {
                                        imageReceiver.setDelegate(new org.telegram.ui.Components.xo0(6));
                                    }
                                    imageReceiver.setImage(ImageLocation.getForDocument(a2), str2, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(a2.thumbs, 90), a2), str2, -1L, null, webPage, 1);
                                    spannableStringBuilder8.setSpan(replacementSpan, 0, spannableStringBuilder8.length(), 33);
                                }
                                return spannableStringBuilder8;
                            } else if (e10 instanceof org.telegram.ui.web.e2) {
                                org.telegram.ui.web.e2 e2Var = (org.telegram.ui.web.e2) e10;
                                SpannableStringBuilder spannableStringBuilder9 = new SpannableStringBuilder("*");
                                int dp3 = AndroidUtilities.dp(textimage.f22616w);
                                int dp4 = AndroidUtilities.dp(textimage.h);
                                int abs2 = Math.abs(i10);
                                if (dp3 > abs2) {
                                    dp4 = (int) (dp4 * (abs2 / dp3));
                                    dp3 = abs2;
                                }
                                if (view != null) {
                                    ?? replacementSpan2 = new ReplacementSpan();
                                    replacementSpan2.f26612b = dp3;
                                    replacementSpan2.f26613c = dp4;
                                    ImageReceiver imageReceiver2 = new ImageReceiver(view);
                                    replacementSpan2.f26611a = imageReceiver2;
                                    imageReceiver2.setInvalidateAll(true);
                                    org.telegram.ui.web.f2.g(e2Var, imageReceiver2, new org.telegram.ui.Components.g5(15));
                                    spannableStringBuilder9.setSpan(replacementSpan2, 0, spannableStringBuilder9.length(), 33);
                                }
                                return spannableStringBuilder9;
                            }
                        } else if (richText2 instanceof TL_iv.textMath) {
                            TL_iv.textMath textmath = (TL_iv.textMath) richText2;
                            if (textmath.bitmap == null && !textmath.tried) {
                                textmath.tried = true;
                                th.q a10 = th.q.a(textmath.source, AndroidUtilities.dp(20.0f), true);
                                if (a10 != null) {
                                    textmath.f22617w = a10.f48680b;
                                    textmath.h = a10.f48681c;
                                    textmath.depth = a10.d;
                                    textmath.bitmap = a10.f48679a;
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
                                int i13 = textmath.f22617w;
                                int i14 = textmath.h;
                                int i15 = org.telegram.ui.ActionBar.g6.G6;
                                ((m4) d70Var).getClass();
                                spannableStringBuilder10.setSpan(new org.telegram.ui.Components.a01(view, bitmap, i13, i14, org.telegram.ui.ActionBar.g6.w0(null, i15, false), textmath.depth), 0, spannableStringBuilder10.length(), 33);
                                String str4 = textmath.source;
                                if (str4 != null && !str4.isEmpty()) {
                                    spannableStringBuilder10.setSpan(new org.telegram.ui.Cells.q9(textmath.source), 0, spannableStringBuilder10.length(), 33);
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

    public static TextPaint E(d70 d70Var, TL_iv.RichText richText, TL_iv.RichText richText2, TL_iv.PageBlock pageBlock) {
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
        m4 m4Var = (m4) d70Var;
        m4Var.getClass();
        u3 u3Var = f40367b1;
        u3Var.getClass();
        SparseArray sparseArray = u3Var.f43167x;
        SparseArray sparseArray2 = u3Var.f43166w;
        SparseArray sparseArray3 = u3Var.f43164t;
        SparseArray sparseArray4 = u3Var.f43149c;
        SparseArray sparseArray5 = u3Var.f43148b;
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
            b10 = d70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockMap) {
            TL_iv.RichText richText4 = ((TL_iv.pageBlockMap) pageBlock).caption.text;
            if (richText4 != richText2 && richText4 != richText) {
                dp6 = AndroidUtilities.dp(12.0f);
            } else {
                dp6 = AndroidUtilities.dp(14.0f);
                sparseArray4 = sparseArray5;
            }
            dp8 = dp6;
            b10 = d70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockTitle) {
            sparseArray4 = u3Var.d;
            dp8 = AndroidUtilities.dp(23.0f);
            b10 = d70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockKicker) {
            sparseArray4 = u3Var.f43150e;
            dp8 = AndroidUtilities.dp(14.0f);
            b10 = d70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockAuthorDate) {
            sparseArray4 = u3Var.f43159o;
            dp8 = AndroidUtilities.dp(14.0f);
            b10 = d70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockFooter) {
            sparseArray4 = u3Var.f43160p;
            dp8 = AndroidUtilities.dp(14.0f);
            b10 = d70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockSubtitle) {
            sparseArray4 = u3Var.f43152g;
            dp8 = AndroidUtilities.dp(20.0f);
            b10 = d70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeader) {
            sparseArray4 = u3Var.f43151f;
            dp8 = AndroidUtilities.dp(20.0f);
            b10 = d70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockSubheader) {
            sparseArray4 = u3Var.h;
            dp8 = AndroidUtilities.dp(17.0f);
            b10 = d70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading1) {
            sparseArray4 = u3Var.f43153i;
            dp8 = AndroidUtilities.dp(18.0f);
            b10 = d70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading2) {
            sparseArray4 = u3Var.f43154j;
            dp8 = AndroidUtilities.dp(16.0f);
            b10 = d70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading3) {
            sparseArray4 = u3Var.f43155k;
            dp8 = AndroidUtilities.dp(15.0f);
            b10 = d70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading4) {
            sparseArray4 = u3Var.f43156l;
            dp8 = AndroidUtilities.dp(14.0f);
            b10 = d70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading5) {
            sparseArray4 = u3Var.f43157m;
            dp8 = AndroidUtilities.dp(13.0f);
            b10 = d70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading6) {
            sparseArray4 = u3Var.f43158n;
            dp8 = AndroidUtilities.dp(12.0f);
            b10 = d70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) pageBlock;
            if (pageblockblockquote.text == richText) {
                dp8 = AndroidUtilities.dp(15.0f);
                b10 = d70Var.b();
                sparseArray4 = sparseArray3;
            } else {
                if (pageblockblockquote.caption == richText) {
                    dp8 = AndroidUtilities.dp(14.0f);
                    b10 = d70Var.a();
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
                b10 = d70Var.b();
                sparseArray4 = sparseArray3;
            } else {
                if (pageblockpullquote.caption == richText) {
                    dp8 = AndroidUtilities.dp(14.0f);
                    b10 = d70Var.a();
                    sparseArray3 = sparseArray5;
                    sparseArray4 = sparseArray3;
                }
                b10 = -65536;
                sparseArray3 = null;
                sparseArray4 = sparseArray3;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
            sparseArray4 = u3Var.f43163s;
            dp8 = AndroidUtilities.dp(14.0f);
            b10 = d70Var.b();
            D |= 4;
        } else if (pageBlock instanceof TL_iv.pageBlockParagraph) {
            sparseArray4 = u3Var.f43161q;
            dp8 = AndroidUtilities.dp(16.0f);
            b10 = d70Var.b();
        } else if (L(pageBlock)) {
            sparseArray4 = u3Var.f43162r;
            dp8 = AndroidUtilities.dp(16.0f);
            b10 = d70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockEmbed) {
            TL_iv.RichText richText5 = ((TL_iv.pageBlockEmbed) pageBlock).caption.text;
            if (richText5 != richText2 && richText5 != richText) {
                dp5 = AndroidUtilities.dp(12.0f);
            } else {
                dp5 = AndroidUtilities.dp(14.0f);
                sparseArray4 = sparseArray5;
            }
            dp8 = dp5;
            b10 = d70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
            TL_iv.RichText richText6 = ((TL_iv.pageBlockSlideshow) pageBlock).caption.text;
            if (richText6 != richText2 && richText6 != richText) {
                dp4 = AndroidUtilities.dp(12.0f);
            } else {
                dp4 = AndroidUtilities.dp(14.0f);
                sparseArray4 = sparseArray5;
            }
            dp8 = dp4;
            b10 = d70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockCollage) {
            TL_iv.RichText richText7 = ((TL_iv.pageBlockCollage) pageBlock).caption.text;
            if (richText7 != richText2 && richText7 != richText) {
                dp3 = AndroidUtilities.dp(12.0f);
            } else {
                dp3 = AndroidUtilities.dp(14.0f);
                sparseArray4 = sparseArray5;
            }
            dp8 = dp3;
            b10 = d70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockEmbedPost) {
            TL_iv.PageCaption pageCaption = ((TL_iv.pageBlockEmbedPost) pageBlock).caption;
            if (richText2 == pageCaption.text) {
                dp8 = AndroidUtilities.dp(14.0f);
                b10 = d70Var.a();
                sparseArray4 = sparseArray5;
            } else if (richText2 == pageCaption.credit) {
                dp8 = AndroidUtilities.dp(12.0f);
                b10 = d70Var.a();
            } else {
                if (richText2 != null) {
                    sparseArray4 = u3Var.f43165u;
                    dp8 = AndroidUtilities.dp(14.0f);
                    b10 = d70Var.b();
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
                b10 = d70Var.b();
            } else if (pageBlock instanceof TL_iv.pageBlockAudio) {
                if (richText2 == ((TL_iv.pageBlockAudio) pageBlock).caption.text) {
                    dp = AndroidUtilities.dp(14.0f);
                    sparseArray = sparseArray2;
                } else {
                    dp = AndroidUtilities.dp(12.0f);
                }
                dp8 = dp;
                b10 = d70Var.b();
            } else if (pageBlock instanceof TL_iv.pageBlockRelatedArticles) {
                sparseArray4 = u3Var.f43168y;
                dp8 = AndroidUtilities.dp(15.0f);
                b10 = d70Var.a();
            } else if (pageBlock instanceof TL_iv.pageBlockDetails) {
                sparseArray4 = u3Var.f43169z;
                dp8 = AndroidUtilities.dp(15.0f);
                b10 = d70Var.b();
            } else {
                if (pageBlock instanceof TL_iv.pageBlockTable) {
                    sparseArray4 = u3Var.A;
                    dp8 = AndroidUtilities.dp(15.0f);
                    b10 = d70Var.b();
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
            if (u3Var.f43147a == null) {
                TextPaint textPaint = new TextPaint(1);
                u3Var.f43147a = textPaint;
                textPaint.setColor(-65536);
            }
            u3Var.f43147a.setTextSize(AndroidUtilities.dp(14.0f));
            return u3Var.f43147a;
        }
        TextPaint textPaint2 = (TextPaint) sparseArray4.get(D);
        if (textPaint2 == null) {
            textPaint2 = new TextPaint(1);
            if ((D & 4) != 0) {
                textPaint2.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
            } else if (pageBlock instanceof TL_iv.pageBlockRelatedArticles) {
                textPaint2.setTypeface(AndroidUtilities.bold());
            } else if (d70Var.f37379a != 1 && !(pageBlock instanceof TL_iv.pageBlockTitle) && !(pageBlock instanceof TL_iv.pageBlockKicker) && !(pageBlock instanceof TL_iv.pageBlockHeader) && !(pageBlock instanceof TL_iv.pageBlockSubtitle) && !(pageBlock instanceof TL_iv.pageBlockSubheader) && !K(pageBlock)) {
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
                m4Var.getClass();
                b10 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.J6, false);
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
        if (!(pageBlock instanceof c4) && !(pageBlock instanceof e4)) {
            return false;
        }
        return true;
    }

    public static boolean O(a4 a4Var) {
        boolean z10;
        TL_iv.PageBlock z11 = z(a4Var.f36418a);
        if (z11 instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) z11;
            if (!pageblockdetails.open) {
                pageblockdetails.open = true;
                return true;
            }
        } else if (z11 instanceof a4) {
            a4 a4Var2 = (a4) z11;
            TL_iv.PageBlock z12 = z(a4Var2.f36419b);
            if (z12 instanceof TL_iv.pageBlockDetails) {
                TL_iv.pageBlockDetails pageblockdetails2 = (TL_iv.pageBlockDetails) z12;
                if (!pageblockdetails2.open) {
                    pageblockdetails2.open = true;
                    z10 = true;
                    if (!O(a4Var2) || z10) {
                        return true;
                    }
                }
            }
            z10 = false;
            if (!O(a4Var2)) {
            }
            return true;
        }
        return false;
    }

    public static void T(d70 d70Var) {
        if (d70Var.f37380b != null || d70Var.f37383f != null) {
            View view = d70Var.f37383f;
            d70Var.f37381c.d(true);
            d70Var.f37380b = null;
            d70Var.d = null;
            d70Var.f37383f = null;
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

    public static void f(String str, int i10, FrameLayout frameLayout, z3 z3Var, org.telegram.ui.ActionBar.c6 c6Var) {
        String s10 = org.telegram.ui.web.z0.s(str);
        long clientUserId = UserConfig.getInstance(i10).getClientUserId();
        SendMessagesHelper.getInstance(i10).sendMessage(SendMessagesHelper.SendMessageParams.of(s10, clientUserId));
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
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.bookmarkAdded, new MessageObject(i10, tL_message, false, false));
        new org.telegram.ui.Components.tc(frameLayout, c6Var).Q(R.raw.saved_messages, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.WebBookmarkedToast), new eg.z1(z3Var, clientUserId, 18))).k(true);
    }

    public static void g0(m4 m4Var) {
        TextPaint textPaint = f40374i1;
        if (textPaint != null) {
            textPaint.setColor(m4Var.b());
        }
        TextPaint textPaint2 = f40375j1;
        if (textPaint2 != null) {
            textPaint2.setColor(m4Var.b());
        }
        TextPaint textPaint3 = f40368c1;
        if (textPaint3 != null) {
            textPaint3.setColor(m4Var.b());
        }
        TextPaint textPaint4 = f40370e1;
        if (textPaint4 != null) {
            textPaint4.setColor(m4Var.b());
        }
        TextPaint textPaint5 = f40371f1;
        if (textPaint5 != null) {
            textPaint5.setColor(-1);
        }
        TextPaint textPaint6 = f40372g1;
        if (textPaint6 != null) {
            textPaint6.setColor(m4Var.b());
        }
        TextPaint textPaint7 = f40373h1;
        if (textPaint7 != null) {
            textPaint7.setColor(m4Var.a());
        }
        TextPaint textPaint8 = f40369d1;
        if (textPaint8 != null) {
            textPaint8.setColor(m4Var.a());
        }
        r(m4Var, true);
        u3 u3Var = f40367b1;
        u3.a(m4Var, u3Var.d);
        u3.a(m4Var, u3Var.f43150e);
        u3.a(m4Var, u3Var.f43152g);
        u3.a(m4Var, u3Var.f43151f);
        u3.a(m4Var, u3Var.h);
        u3.a(m4Var, u3Var.f43153i);
        u3.a(m4Var, u3Var.f43154j);
        u3.a(m4Var, u3Var.f43155k);
        u3.a(m4Var, u3Var.f43156l);
        u3.a(m4Var, u3Var.f43157m);
        u3.a(m4Var, u3Var.f43158n);
        u3.a(m4Var, u3Var.f43164t);
        u3.a(m4Var, u3Var.f43163s);
        u3.a(m4Var, u3Var.f43161q);
        u3.a(m4Var, u3Var.f43162r);
        u3.a(m4Var, u3Var.f43165u);
        u3.a(m4Var, u3Var.f43166w);
        u3.a(m4Var, u3Var.f43167x);
        u3.a(m4Var, u3Var.f43148b);
        u3.a(m4Var, u3Var.f43149c);
        u3.a(m4Var, u3Var.f43159o);
        u3.a(m4Var, u3Var.f43160p);
        u3.a(m4Var, u3Var.v);
        u3.a(m4Var, u3Var.f43168y);
        u3.a(m4Var, u3Var.f43169z);
        u3.a(m4Var, u3Var.A);
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

    public static CharSequence j(d70 d70Var, k4 k4Var, f3 f3Var) {
        StaticLayout staticLayout;
        if (f3Var != null && (staticLayout = f3Var.d) != null) {
            SpannableStringBuilder spannableStringBuilder = f3Var.f37977y;
            if (spannableStringBuilder != null) {
                return spannableStringBuilder;
            }
            CharSequence text = staticLayout.getText();
            if (!(text instanceof Spannable)) {
                return text;
            }
            Spannable spannable = (Spannable) text;
            org.telegram.ui.Components.d01[] d01VarArr = (org.telegram.ui.Components.d01[]) spannable.getSpans(0, spannable.length(), org.telegram.ui.Components.d01.class);
            SpannableStringBuilder spannableStringBuilder2 = text;
            if (d01VarArr != null) {
                spannableStringBuilder2 = text;
                if (d01VarArr.length != 0) {
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannable);
                    for (org.telegram.ui.Components.d01 d01Var : d01VarArr) {
                        int spanStart = spannableStringBuilder3.getSpanStart(d01Var);
                        int spanEnd = spannableStringBuilder3.getSpanEnd(d01Var);
                        if (spanStart >= 0 && spanEnd > spanStart) {
                            spannableStringBuilder3.setSpan(new r0(d70Var, k4Var, d01Var, 0), spanStart, spanEnd, 33);
                        }
                    }
                    f3Var.f37977y = spannableStringBuilder3;
                    spannableStringBuilder2 = spannableStringBuilder3;
                }
            }
            return spannableStringBuilder2;
        }
        return null;
    }

    public static TL_iv.PageBlock j0(TL_iv.PageBlock pageBlock, a4 a4Var) {
        if (pageBlock instanceof c4) {
            c4 c4Var = (c4) pageBlock;
            c4 c4Var2 = new c4();
            c4Var2.f36981a = c4Var.f36981a;
            c4Var2.f36982b = c4Var.f36982b;
            c4Var2.f36983c = c4Var.f36983c;
            c4Var2.d = j0(c4Var.d, a4Var);
            return c4Var2;
        } else if (pageBlock instanceof e4) {
            e4 e4Var = (e4) pageBlock;
            e4 e4Var2 = new e4();
            e4Var2.f37690a = e4Var.f37690a;
            e4Var2.f37691b = e4Var.f37691b;
            e4Var2.f37692c = e4Var.f37692c;
            e4Var2.d = j0(e4Var.d, a4Var);
            return e4Var2;
        } else {
            return a4Var;
        }
    }

    public static boolean l(org.telegram.ui.d70 r25, org.telegram.ui.k4 r26, android.view.MotionEvent r27, android.view.View r28, org.telegram.ui.f3 r29, int r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.m4.l(org.telegram.ui.d70, org.telegram.ui.k4, android.view.MotionEvent, android.view.View, org.telegram.ui.f3, int, int):boolean");
    }

    public static org.telegram.ui.f3 p(org.telegram.ui.d70 r20, android.view.View r21, java.lang.CharSequence r22, org.telegram.tgnet.tl.TL_iv.RichText r23, int r24, int r25, org.telegram.tgnet.tl.TL_iv.PageBlock r26, android.text.Layout.Alignment r27, int r28, org.telegram.ui.k4 r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.m4.p(org.telegram.ui.d70, android.view.View, java.lang.CharSequence, org.telegram.tgnet.tl.TL_iv$RichText, int, int, org.telegram.tgnet.tl.TL_iv$PageBlock, android.text.Layout$Alignment, int, org.telegram.ui.k4):org.telegram.ui.f3");
    }

    public static f3 q(d70 d70Var, View view, CharSequence charSequence, TL_iv.RichText richText, int i10, int i11, TL_iv.PageBlock pageBlock, k4 k4Var) {
        return p(d70Var, view, charSequence, richText, i10, i11, pageBlock, Layout.Alignment.ALIGN_NORMAL, 0, k4Var);
    }

    public static void r(m4 m4Var, boolean z10) {
        int i10;
        if (f40377m1 == null) {
            f40377m1 = new Paint();
            l1 = new Paint();
            Paint paint = new Paint(1);
            f40379o1 = paint;
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            f40379o1.setStrokeWidth(AndroidUtilities.dp(1.0f));
            Paint paint2 = new Paint();
            f40380p1 = paint2;
            paint2.setStyle(style);
            f40380p1.setStrokeWidth(AndroidUtilities.dp(1.0f) / 2.0f);
            f40381q1 = new Paint();
            f40382r1 = new Paint();
            f40383s1 = new Paint();
            f40384t1 = new Paint(1);
            f40385u1 = new Paint(1);
            f40376k1 = new Paint();
            f40378n1 = new Paint();
            f40386v1 = new Paint(1);
        } else if (!z10) {
            return;
        }
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false);
        float green = Color.green(w02) * 0.7152f;
        float y8 = com.google.android.recaptcha.internal.a.y(Color.blue(w02), 0.0722f, green + (Color.red(w02) * 0.2126f), 255.0f);
        Paint paint3 = f40385u1;
        if (y8 <= 0.705f) {
            i10 = -3041234;
        } else {
            i10 = -6551;
        }
        paint3.setColor(i10);
        Paint paint4 = f40384t1;
        int i11 = org.telegram.ui.ActionBar.g6.K6;
        paint4.setColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false) & 872415231);
        f40384t1.setPathEffect(org.telegram.ui.Components.s80.c());
        f40383s1.setColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false) & 872415231);
        f40383s1.setPathEffect(org.telegram.ui.Components.s80.c());
        Paint paint5 = f40380p1;
        int i12 = org.telegram.ui.ActionBar.g6.f23189k6;
        paint5.setColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        f40379o1.setColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        f40376k1.setColor(251658240);
        f40378n1.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23063d7, false));
        f40386v1.setColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false) & 872415231);
        f40386v1.setPathEffect(org.telegram.ui.Components.s80.c());
        int w03 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.M6, false);
        int red = Color.red(w03);
        int green2 = Color.green(w03);
        int blue = Color.blue(w03);
        f40382r1.setColor(Color.argb(20, red, green2, blue));
        f40381q1.setColor(Color.argb(34, red, green2, blue));
        int w04 = org.telegram.ui.ActionBar.g6.w0(null, i11, false);
        l1.setColor(Color.argb(20, Color.red(w04), Color.green(w04), Color.blue(w04)));
        f40377m1.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Uc, false));
    }

    public static void u(Canvas canvas, d70 d70Var, TL_iv.PageBlock pageBlock, int i10) {
        int i11;
        if (pageBlock != null && d70Var != null && f40377m1 != null) {
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
                    canvas.drawRect(dp, 0.0f, AndroidUtilities.dp(2.0f) + dp, i13, f40377m1);
                    return;
                }
                return;
            }
            while (i14 != 0) {
                if ((i14 & 1) != 0) {
                    int dp2 = AndroidUtilities.dp((i12 * 14) + 18);
                    canvas.drawRect(dp2, 0.0f, AndroidUtilities.dp(2.0f) + dp2, i13, f40377m1);
                }
                i14 >>>= 1;
                i12++;
            }
        }
    }

    public static void v(org.telegram.ui.d70 r2, android.graphics.Canvas r3, org.telegram.ui.Cells.j9 r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.m4.v(org.telegram.ui.d70, android.graphics.Canvas, org.telegram.ui.Cells.j9, int):void");
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

    public static m4 x() {
        m4 m4Var;
        m4 m4Var2 = Y0;
        if (m4Var2 == null) {
            synchronized (m4.class) {
                try {
                    m4Var = Y0;
                    if (m4Var == null) {
                        m4Var = new m4();
                        Y0 = m4Var;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return m4Var;
        }
        return m4Var2;
    }

    public static View y(View view) {
        org.telegram.ui.Components.vk0 vk0Var;
        if (view instanceof b2) {
            org.telegram.ui.Components.vk0 vk0Var2 = ((b2) view).d;
            if (vk0Var2 != null) {
                return y(vk0Var2.f6432a);
            }
            return view;
        } else if ((view instanceof e2) && (vk0Var = ((e2) view).d) != null) {
            return y(vk0Var.f6432a);
        } else {
            return view;
        }
    }

    public static TL_iv.PageBlock z(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof c4) {
            TL_iv.PageBlock pageBlock2 = ((c4) pageBlock).d;
            if (pageBlock2 != null) {
                return z(pageBlock2);
            }
            return pageBlock2;
        } else if (pageBlock instanceof e4) {
            TL_iv.PageBlock pageBlock3 = ((e4) pageBlock).d;
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
        float x4;
        ArrayList arrayList = this.Z;
        int size = arrayList.size();
        z3 z3Var = this.G;
        boolean z11 = false;
        if (size <= 1) {
            ArticleViewer$WindowView articleViewer$WindowView = this.f40390b0;
            articleViewer$WindowView.f24040e = false;
            articleViewer$WindowView.d = false;
            n0 n0Var = this.f40391c0;
            if (z3Var != null) {
                x4 = z3Var.E * z3Var.f45046c.getWidth();
            } else {
                x4 = n0Var.getX();
            }
            AnimatorSet animatorSet = new AnimatorSet();
            float measuredWidth = n0Var.getMeasuredWidth() - x4;
            if (z3Var != null) {
                animatorSet.playTogether(z3Var.d(1.0f));
            } else {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.f40391c0, View.TRANSLATION_X, n0Var.getMeasuredWidth()), ObjectAnimator.ofFloat(this.f40390b0, Z0, n0Var.getMeasuredWidth()));
            }
            animatorSet.setDuration(Math.max((int) ((420.0f / n0Var.getMeasuredWidth()) * measuredWidth), 250));
            animatorSet.setInterpolator(org.telegram.ui.Components.jr.h);
            animatorSet.addListener(new y0(this));
            animatorSet.start();
            this.P0 = true;
            return;
        }
        ArticleViewer$WindowView articleViewer$WindowView2 = this.f40390b0;
        articleViewer$WindowView2.f24041f = true;
        articleViewer$WindowView2.f24040e = true;
        articleViewer$WindowView2.h = this.E0;
        this.f40404q0[1].setVisibility(0);
        this.f40404q0[1].setAlpha(1.0f);
        this.f40404q0[1].setTranslationX(0.0f);
        q3 q3Var = this.f40404q0[0];
        if (z3Var == null) {
            color = 0;
        } else {
            color = this.f40396h0.getColor();
        }
        q3Var.setBackgroundColor(color);
        e0(-1, arrayList.get(arrayList.size() - 2), true);
        q3 q3Var2 = this.f40404q0[0];
        q3Var2.getX();
        AnimatorSet animatorSet2 = new AnimatorSet();
        q3Var2.getMeasuredWidth();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f40404q0[0], View.TRANSLATION_X, q3Var2.getMeasuredWidth()));
        animatorSet2.setDuration(420L);
        animatorSet2.setInterpolator(org.telegram.ui.Components.jr.h);
        animatorSet2.addListener(new z0(this));
        animatorSet2.start();
        o0 o0Var = this.f40392d0;
        q3 q3Var3 = this.f40404q0[0];
        if (q3Var3 != null && SharedConfig.adaptableColorInBrowser) {
            w02 = q3Var3.getBackgroundColor();
        } else {
            w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Pk, false);
        }
        o0Var.setMenuColors(w02);
        o0 o0Var2 = this.f40392d0;
        q3 q3Var4 = this.f40404q0[0];
        if (q3Var4 != null && SharedConfig.adaptableColorInBrowser) {
            w03 = q3Var4.getActionBarColor();
        } else {
            w03 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Pk, false);
        }
        o0Var2.d(w03, true);
        o0 o0Var3 = this.f40392d0;
        q3 q3Var5 = this.f40404q0[0];
        if (q3Var5 != null && q3Var5.e()) {
            z10 = true;
        } else {
            z10 = false;
        }
        o0Var3.setIsTonsite(z10);
        o0 o0Var4 = this.f40392d0;
        q3 q3Var6 = this.f40404q0[0];
        if (q3Var6 != null && q3Var6.d()) {
            z11 = true;
        }
        o0Var4.setIsLocal(z11);
        this.P0 = true;
    }

    public final void H(int i10) {
        int color;
        int w02;
        int w03;
        boolean z10;
        float x4;
        ArrayList arrayList = this.Z;
        int size = arrayList.size();
        z3 z3Var = this.G;
        boolean z11 = false;
        if (size <= 1) {
            ArticleViewer$WindowView articleViewer$WindowView = this.f40390b0;
            articleViewer$WindowView.f24040e = false;
            articleViewer$WindowView.d = false;
            n0 n0Var = this.f40391c0;
            if (z3Var != null) {
                x4 = z3Var.E * z3Var.f45046c.getWidth();
            } else {
                x4 = n0Var.getX();
            }
            AnimatorSet animatorSet = new AnimatorSet();
            float measuredWidth = n0Var.getMeasuredWidth() - x4;
            if (z3Var != null) {
                animatorSet.playTogether(z3Var.d(1.0f));
            } else {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.f40391c0, View.TRANSLATION_X, n0Var.getMeasuredWidth()), ObjectAnimator.ofFloat(this.f40390b0, Z0, n0Var.getMeasuredWidth()));
            }
            animatorSet.setDuration(Math.max((int) ((420.0f / n0Var.getMeasuredWidth()) * measuredWidth), 250));
            animatorSet.setInterpolator(org.telegram.ui.Components.jr.h);
            animatorSet.addListener(new a1(this));
            animatorSet.start();
            this.P0 = true;
            return;
        }
        this.f40390b0.f24041f = true;
        this.f40404q0[1].setVisibility(0);
        this.f40404q0[1].setAlpha(1.0f);
        this.f40404q0[1].setTranslationX(0.0f);
        q3 q3Var = this.f40404q0[0];
        if (z3Var == null) {
            color = 0;
        } else {
            color = this.f40396h0.getColor();
        }
        q3Var.setBackgroundColor(color);
        e0(-1, arrayList.get(i10), true);
        q3 q3Var2 = this.f40404q0[0];
        q3Var2.getX();
        AnimatorSet animatorSet2 = new AnimatorSet();
        q3Var2.getMeasuredWidth();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f40404q0[0], View.TRANSLATION_X, q3Var2.getMeasuredWidth()));
        animatorSet2.setDuration(420L);
        animatorSet2.setInterpolator(org.telegram.ui.Components.jr.h);
        animatorSet2.addListener(new b1(this, i10));
        animatorSet2.start();
        o0 o0Var = this.f40392d0;
        q3 q3Var3 = this.f40404q0[0];
        if (q3Var3 != null && SharedConfig.adaptableColorInBrowser) {
            w02 = q3Var3.getBackgroundColor();
        } else {
            w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Pk, false);
        }
        o0Var.setMenuColors(w02);
        o0 o0Var2 = this.f40392d0;
        q3 q3Var4 = this.f40404q0[0];
        if (q3Var4 != null && SharedConfig.adaptableColorInBrowser) {
            w03 = q3Var4.getActionBarColor();
        } else {
            w03 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Pk, false);
        }
        o0Var2.d(w03, true);
        o0 o0Var3 = this.f40392d0;
        q3 q3Var5 = this.f40404q0[0];
        if (q3Var5 != null && q3Var5.e()) {
            z10 = true;
        } else {
            z10 = false;
        }
        o0Var3.setIsTonsite(z10);
        o0 o0Var4 = this.f40392d0;
        q3 q3Var6 = this.f40404q0[0];
        if (q3Var6 != null && q3Var6.d()) {
            z11 = true;
        }
        o0Var4.setIsLocal(z11);
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
        int i10 = 0;
        while (true) {
            q3[] q3VarArr = this.f40404q0;
            if (i10 < q3VarArr.length) {
                q3VarArr[i10].b();
                i10++;
            } else {
                try {
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
        }
        this.H.getWindow().clearFlags(128);
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.J;
            if (i11 < arrayList.size()) {
                ((w1) arrayList.get(i11)).a(false);
                i11++;
            } else {
                this.f40391c0.post(new d0(this, 0));
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
        int i10;
        String lowerCase;
        TL_iv.Page page;
        if (this.H == null) {
            return false;
        }
        z3 z3Var = this.G;
        if (z3Var == null && this.R) {
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
        if (z3Var != null && !arrayList.isEmpty()) {
            z11 = z10;
            r52 = 1;
        } else {
            z11 = z10;
            r52 = 0;
        }
        if (r52 == 0) {
            arrayList.clear();
            this.f40391c0.setTranslationX(0.0f);
            if (z3Var != null) {
                z3Var.E = 0.0f;
                z3Var.f45046c.invalidate();
                z3Var.i();
                z3Var.h();
            }
            this.f40391c0.setTranslationY(0.0f);
            this.f40404q0[0].setTranslationY(0.0f);
            this.f40404q0[0].setTranslationX(0.0f);
            this.f40404q0[1].setTranslationX(0.0f);
            this.f40404q0[0].setAlpha(1.0f);
            this.f40390b0.setInnerTranslationX(0.0f);
            this.f40404q0[0].g();
            X(AndroidUtilities.dp(56.0f));
        }
        if (z3Var != null && org.telegram.ui.web.z0.I0) {
            z3Var.f45044a.lock();
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
                ConnectionsManager.getInstance(i13).sendRequest(tL_messages_getWebPage, new j0(this, i13, webPage2, messageObject, (boolean) r52, str4));
            }
        } else {
            g(r52, str2);
        }
        o0 o0Var = this.f40392d0;
        if (o0Var != null && r52 == 0) {
            o0Var.setIsLocal(this.f40404q0[0].d());
        }
        this.P = null;
        if (z3Var != null) {
            if (r52 == 0) {
                AndroidUtilities.removeFromParent(this.f40390b0);
                z3Var.d = this.f40390b0;
                z3Var.n();
                z3Var.f45046c.addView(this.f40390b0, i7.f6.c(-1.0f, -1));
            }
        } else if (!this.R) {
            WindowManager windowManager = (WindowManager) this.H.getSystemService("window");
            if (this.S) {
                try {
                    windowManager.removeView(this.f40390b0);
                } catch (Exception unused) {
                }
            }
            try {
                WindowManager.LayoutParams layoutParams = this.f40389a0;
                layoutParams.flags = -2013200384;
                if (Build.VERSION.SDK_INT >= 28) {
                    layoutParams.layoutInDisplayCutoutMode = 1;
                }
                this.f40390b0.setFocusable(false);
                this.f40391c0.setFocusable(false);
                windowManager.addView(this.f40390b0, this.f40389a0);
            } catch (Exception e11) {
                FileLog.e(e11);
                return false;
            }
        } else {
            this.f40389a0.flags &= -17;
            ((WindowManager) this.H.getSystemService("window")).updateViewLayout(this.f40390b0, this.f40389a0);
        }
        this.R = true;
        this.V = 1;
        if (r52 == 0) {
            if (z3Var != null) {
                if (r52 != 0) {
                    z3Var.f45044a.unlock();
                } else if (!z3Var.h) {
                    z3Var.g(z3Var.f45045b);
                    z3Var.f();
                }
            } else {
                this.f40390b0.setAlpha(0.0f);
                this.f40391c0.setAlpha(0.0f);
                AnimatorSet animatorSet = new AnimatorSet();
                ArticleViewer$WindowView articleViewer$WindowView = this.f40390b0;
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(articleViewer$WindowView, property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f40391c0, property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f40390b0, View.TRANSLATION_X, AndroidUtilities.dp(56.0f), 0.0f));
                this.W = new d0(this, 1);
                animatorSet.setDuration(150L);
                animatorSet.setInterpolator(this.Y);
                animatorSet.addListener(new v0(this));
                this.X = System.currentTimeMillis();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.c(8, this, animatorSet));
            }
        }
        this.f40391c0.setLayerType(2, null);
        return true;
    }

    public final void P(long j10, TLRPC.User user) {
        if (user != null && (this.H instanceof LaunchActivity)) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f22539id);
            bundle.putString("botUser", "webpage" + j10);
            ((LaunchActivity) this.H).q0(new tn(bundle), false, true);
            o(false, true);
        }
    }

    public final void Q(String str, String str2, m0 m0Var) {
        Activity activity = this.H;
        if (activity != null && !activity.isFinishing()) {
            q3 q3Var = this.f40404q0[0];
            if (q3Var != null && q3Var.d()) {
                String string = LocaleController.getString(R.string.OpenUrlAlert2);
                int indexOf = string.indexOf("%");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(String.format(string, str));
                if (indexOf >= 0) {
                    spannableStringBuilder.setSpan(new URLSpan(str), indexOf, str.length() + indexOf, 33);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.H, 0, null);
                String string2 = LocaleController.getString(R.string.OpenUrlTitle);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                c2Var.N = string2;
                c2Var.P = spannableStringBuilder;
                c2Var.f22781b0 = false;
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.Open), new a1.d(this, str, str2, m0Var, 4));
                alertDialog$Builder.o();
                return;
            }
            R(str, str2, m0Var);
        }
    }

    public final void R(String str, String str2, ye.c cVar) {
        z3 z3Var;
        ye.c cVar2 = this.I0;
        if (cVar2 != null) {
            cVar2.a(false);
        }
        this.I0 = cVar;
        if (this.B0 != 0) {
            ConnectionsManager.getInstance(this.T).cancelRequest(this.B0, false);
            this.B0 = 0;
        }
        boolean[] zArr = new boolean[1];
        if (ye.d.l(this.H, str, false)) {
            if (this.Z.isEmpty() && (z3Var = this.G) != null) {
                z3Var.dismiss(false);
                return;
            }
            return;
        }
        i0 i0Var = new i0(this, str, zArr, cVar);
        int i10 = this.D0 + 1;
        this.D0 = i10;
        b0(true);
        TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
        tL_messages_getWebPage.url = str;
        tL_messages_getWebPage.hash = 0;
        this.B0 = ConnectionsManager.getInstance(this.T).sendRequest(tL_messages_getWebPage, new org.telegram.messenger.gi(this, i10, cVar, str2, i0Var, tL_messages_getWebPage));
        if (cVar != null) {
            cVar.f50515b = new ag.v0(this, i10, cVar, 23);
            cVar.d();
        }
    }

    public final void S() {
        int w02;
        int w03;
        TextView textView = this.f40411x0;
        if (textView != null) {
            textView.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23152i6, false), 2, -1));
            this.f40411x0.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E8, false));
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f40410w0;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G8, false));
        }
        ImageView imageView = this.f40401n0;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false), PorterDuff.Mode.MULTIPLY));
            this.f40401n0.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23452z8, false), 1, -1));
        }
        ImageView imageView2 = this.f40402o0;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false), PorterDuff.Mode.MULTIPLY));
            this.f40402o0.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23452z8, false), 1, -1));
        }
        org.telegram.ui.Components.o6 o6Var = this.f40403p0;
        if (o6Var != null) {
            o6Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        }
        o0 o0Var = this.f40392d0;
        if (o0Var != null) {
            q3 q3Var = this.f40404q0[0];
            if (q3Var != null && SharedConfig.adaptableColorInBrowser) {
                w02 = q3Var.getBackgroundColor();
            } else {
                w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Pk, false);
            }
            o0Var.setMenuColors(w02);
            o0 o0Var2 = this.f40392d0;
            q3 q3Var2 = this.f40404q0[0];
            if (q3Var2 != null && SharedConfig.adaptableColorInBrowser) {
                w03 = q3Var2.getActionBarColor();
            } else {
                w03 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Pk, false);
            }
            o0Var2.d(w03, true);
        }
        this.f40396h0.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Pk, false));
    }

    public final void U() {
        int L0;
        int i10;
        boolean z10 = false;
        q3 q3Var = this.f40404q0[0];
        if (q3Var.f41514c.A != null && (L0 = q3Var.d.L0()) != -1) {
            View m10 = this.f40404q0[0].d.m(L0);
            if (m10 != null) {
                i10 = m10.getTop();
            } else {
                i10 = 0;
            }
            String str = "article" + this.f40404q0[0].f41514c.A.f22545id;
            SharedPreferences.Editor putInt = ApplicationLoader.applicationContext.getSharedPreferences("articles", 0).edit().putInt(str, L0).putInt(str + "o", i10);
            String k9 = u3.c.k(str, "r");
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                z10 = true;
            }
            putInt.putBoolean(k9, z10).commit();
        }
    }

    public final boolean V(String str, boolean z10) {
        String lowerCase;
        int i10;
        Integer num = 0;
        if (!TextUtils.isEmpty(str)) {
            String lowerCase2 = str.toLowerCase();
            Integer num2 = (Integer) this.f40404q0[0].f41514c.h.get(lowerCase2);
            if (num2 != null) {
                TL_iv.textAnchor textanchor = (TL_iv.textAnchor) this.f40404q0[0].f41514c.f39744r.get(lowerCase2);
                if (textanchor != null) {
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    if (!TextUtils.isEmpty(this.f40404q0[0].f41514c.A.cached_page.url)) {
                        lowerCase = this.f40404q0[0].f41514c.A.cached_page.url.toLowerCase();
                    } else {
                        lowerCase = this.f40404q0[0].f41514c.A.url.toLowerCase();
                    }
                    pageblockparagraph.text = org.telegram.ui.web.f2.d(textanchor.text, lowerCase, lowerCase2);
                    this.f40404q0[0].f41514c.getClass();
                    int I = k4.I(pageblockparagraph);
                    f2.n1 x4 = this.f40404q0[0].f41514c.x(null, I);
                    View view = x4.f6432a;
                    this.f40404q0[0].f41514c.H(I, x4, pageblockparagraph, 0, 0, false);
                    org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(this.H, null, false, false);
                    f3Var.fixNavigationBar();
                    f3Var.applyTopPadding = false;
                    f3Var.applyBottomPadding = false;
                    LinearLayout linearLayout = new LinearLayout(this.H);
                    linearLayout.setOrientation(1);
                    org.telegram.ui.Cells.k9 k9Var = new org.telegram.ui.Cells.k9();
                    this.L0 = k9Var;
                    k9Var.T(linearLayout);
                    this.L0.D = new lh.g2(this, 1);
                    eg.r rVar = new eg.r(this.H, 3);
                    rVar.setTextSize(1, 16.0f);
                    rVar.setTypeface(AndroidUtilities.bold());
                    rVar.setText(LocaleController.getString(R.string.InstantViewReference));
                    if (this.f40404q0[0].f41514c.C) {
                        i10 = 5;
                    } else {
                        i10 = 3;
                    }
                    rVar.setGravity(i10 | 16);
                    rVar.setTextColor(b());
                    rVar.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                    linearLayout.addView(rVar, new LinearLayout.LayoutParams(-1, AndroidUtilities.dp(48.0f) + 1));
                    view.setTag("bottomSheet");
                    linearLayout.addView(view, i7.f6.k(0.0f, 7.0f, 0.0f, 0.0f, -1, -2));
                    org.telegram.ui.Cells.w9 o10 = this.L0.o(this.H);
                    bg.d1 d1Var = new bg.d1(this, this.H, linearLayout, 7);
                    f3Var.setDelegate(new k0(this, 0));
                    d1Var.addView(linearLayout, -1, -2);
                    d1Var.addView(o10, -1, -2);
                    f3Var.customView = d1Var;
                    if (this.K0.y()) {
                        this.K0.f(false);
                    }
                    this.E = f3Var;
                    a0(f3Var);
                    return true;
                } else if (num2.intValue() >= 0 && num2.intValue() < this.f40404q0[0].f41514c.f39741e.size()) {
                    TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) this.f40404q0[0].f41514c.f39741e.get(num2.intValue());
                    TL_iv.PageBlock z11 = z(pageBlock);
                    if ((z11 instanceof a4) && O((a4) z11)) {
                        this.f40404q0[0].f41514c.M();
                        this.f40404q0[0].f41514c.l();
                    }
                    int indexOf = this.f40404q0[0].f41514c.d.indexOf(pageBlock);
                    if (indexOf != -1) {
                        num2 = Integer.valueOf(indexOf);
                    }
                    Integer num3 = (Integer) this.f40404q0[0].f41514c.f39743n.get(lowerCase2);
                    if (num3 != null) {
                        if (num3.intValue() == -1) {
                            this.f40404q0[0].f41514c.getClass();
                            int I2 = k4.I(pageBlock);
                            f2.n1 x10 = this.f40404q0[0].f41514c.x(null, I2);
                            this.f40404q0[0].f41514c.H(I2, x10, pageBlock, 0, 0, false);
                            x10.f6432a.measure(View.MeasureSpec.makeMeasureSpec(this.f40404q0[0].f41513b.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                            Integer num4 = (Integer) this.f40404q0[0].f41514c.f39743n.get(lowerCase2);
                            if (num4.intValue() != -1) {
                                num = num4;
                            }
                        } else {
                            num = num3;
                        }
                    }
                    if (this.f40404q0[0].f41514c.D) {
                        num2 = Integer.valueOf(num2.intValue() + 1);
                    }
                    if (z10) {
                        org.telegram.ui.Components.qv0 qv0Var = new org.telegram.ui.Components.qv0(this.f40404q0[0].getContext());
                        qv0Var.f6373a = num2.intValue();
                        qv0Var.f32115s = (-AndroidUtilities.dp(56.0f)) - num.intValue();
                        this.f40404q0[0].d.w0(qv0Var);
                        return true;
                    }
                    this.f40404q0[0].d.h1(num2.intValue(), (-AndroidUtilities.dp(56.0f)) - num.intValue());
                    return true;
                }
            }
        }
        return false;
    }

    public final void W(int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.m4.W(int):void");
    }

    public final void X(int i10) {
        o0 o0Var = this.f40392d0;
        if (o0Var != null && !o0Var.P && !o0Var.S) {
            int clamp = Utilities.clamp(i10, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(24.0f));
            this.E0 = clamp;
            this.f40392d0.setHeight(clamp);
            this.K0.f25971x = this.E0;
            int i11 = 0;
            while (true) {
                q3[] q3VarArr = this.f40404q0;
                if (i11 < q3VarArr.length) {
                    q3VarArr[i11].f41513b.setTopGlowOffset(this.E0);
                    i11++;
                } else {
                    return;
                }
            }
        }
    }

    public final void Y(Activity activity, org.telegram.ui.ActionBar.o2 o2Var) {
        jf.s0 s0Var;
        int i10;
        boolean z10;
        int w02;
        int i11;
        int i12;
        z3 z3Var;
        jf.s0 s0Var2 = this.Q0;
        if (s0Var2 != null) {
            s0Var2.destroy();
            this.Q0 = null;
        }
        LaunchActivity launchActivity = LaunchActivity.C1;
        if (launchActivity != null) {
            s0Var = new jf.s0(launchActivity, true);
        } else {
            s0Var = null;
        }
        this.Q0 = s0Var;
        this.I = o2Var;
        if (!(o2Var instanceof sy)) {
            i10 = o2Var.getCurrentAccount();
        } else {
            i10 = UserConfig.selectedAccount;
        }
        this.T = i10;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
        NotificationCenter.getInstance(this.T).addObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(this.T).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(this.T).addObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(this.T).addObserver(this, NotificationCenter.emojiLoaded);
        Activity activity2 = this.H;
        if (activity2 != activity && (activity2 == null || !this.F || (z3Var = this.G) == null || z3Var.f45047e == null)) {
            this.H = activity;
            this.f37379a = ApplicationLoader.applicationContext.getSharedPreferences("articles", 0).getInt("font_type", 0);
            r(this, false);
            this.f40396h0 = new Paint();
            this.f40397i0 = activity.getResources().getDrawable(R.drawable.layer_shadow);
            this.f40398j0 = new Paint();
            ArticleViewer$WindowView articleViewer$WindowView = new ArticleViewer$WindowView(this, activity);
            this.f40390b0 = articleViewer$WindowView;
            articleViewer$WindowView.setWillNotDraw(false);
            this.f40390b0.setClipChildren(true);
            this.f40390b0.setFocusable(false);
            n0 n0Var = new n0(this, activity, 0);
            this.f40391c0 = n0Var;
            this.f40390b0.addView(n0Var, i7.f6.e(-1, -1, 51));
            if (this.G == null) {
                this.f40390b0.setFitsSystemWindows(true);
                this.f40391c0.setOnApplyWindowInsetsListener(new org.telegram.ui.ActionBar.g3(1));
            }
            FrameLayout frameLayout = new FrameLayout(activity);
            this.L = frameLayout;
            frameLayout.setBackgroundColor(-16777216);
            this.L.setVisibility(4);
            this.f40390b0.addView(this.L, i7.f6.c(-1.0f, -1));
            e5.c cVar = new e5.c(activity);
            this.N = cVar;
            cVar.setVisibility(0);
            this.N.setBackgroundColor(-16777216);
            this.L.addView(this.N, i7.f6.e(-1, -1, 17));
            this.M = new TextureView(activity);
            this.f40404q0 = new q3[2];
            int i13 = 0;
            while (true) {
                q3[] q3VarArr = this.f40404q0;
                if (i13 >= q3VarArr.length) {
                    break;
                }
                q3 q3Var = new q3(this, activity);
                q3VarArr[i13] = q3Var;
                if (i13 == 0) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                q3Var.setVisibility(i12);
                this.f40391c0.addView(q3Var, i7.f6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
                q3Var.f41513b.setOnItemLongClickListener(new v(this));
                q3Var.f41513b.setOnItemClickListener(new kg.w(8, this, q3Var));
                i13++;
            }
            this.f40391c0.addView(new FrameLayout(activity), i7.f6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f40406s0.setColor(-16777216);
            this.f40407t0.setColor(-16777216);
            this.f40409v0.setColor(-14408666);
            this.f40408u0.setColor(-16777216);
            o0 o0Var = new o0(this, activity);
            this.f40392d0 = o0Var;
            if (this.G != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            o0Var.f44161a0 = z10;
            this.f40391c0.addView(o0Var, i7.f6.e(-1, -2, 48));
            this.f40392d0.setOnClickListener(new nh.r7(10, this, activity));
            this.f40392d0.U.addTextChangedListener(new p0(this, 0));
            org.telegram.ui.web.l lVar = new org.telegram.ui.web.l(activity);
            this.f40393e0 = lVar;
            lVar.setOpenProgress(0.0f);
            this.f40393e0.f44103w.j(new m3(this, 2));
            this.f40391c0.addView(this.f40393e0, i7.f6.c(-1.0f, -1));
            this.f40394f0 = new d0(this, 3);
            this.f40392d0.H.setOnClickListener(new u(this, 2));
            this.f40392d0.H.setOnLongClickListener(new w(this, 0));
            this.f40392d0.setMenuListener(new ih.b1(21, this, activity));
            this.f40392d0.K.setOnClickListener(new u(this, 3));
            bh.d dVar = new bh.d(this.H, 7);
            this.m0 = dVar;
            dVar.setOnTouchListener(new mh.d(3));
            this.m0.setWillNotDraw(false);
            this.m0.setTranslationY(AndroidUtilities.dp(51.0f));
            this.m0.setVisibility(4);
            this.m0.setFocusable(true);
            this.m0.setFocusableInTouchMode(true);
            this.m0.setClickable(true);
            this.m0.setPadding(0, AndroidUtilities.dp(3.0f), 0, 0);
            this.f40391c0.addView(this.m0, i7.f6.e(-1, 51, 80));
            new nh.w3(this.f40390b0, false, new t(this, 0));
            ImageView imageView = new ImageView(this.H);
            this.f40401n0 = imageView;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            this.f40401n0.setImageResource(R.drawable.msg_go_up);
            ImageView imageView2 = this.f40401n0;
            int i14 = org.telegram.ui.ActionBar.g6.G6;
            int w03 = org.telegram.ui.ActionBar.g6.w0(null, i14, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            imageView2.setColorFilter(new PorterDuffColorFilter(w03, mode));
            ImageView imageView3 = this.f40401n0;
            int i15 = org.telegram.ui.ActionBar.g6.f23452z8;
            imageView3.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, i15, false), 1, -1));
            this.m0.addView(this.f40401n0, i7.f6.d(48, 48.0f, 53, 0.0f, 0.0f, 48.0f, 0.0f));
            this.f40401n0.setOnClickListener(new u(this, 0));
            this.f40401n0.setContentDescription(LocaleController.getString(R.string.AccDescrSearchNext));
            ImageView imageView4 = new ImageView(this.H);
            this.f40402o0 = imageView4;
            imageView4.setScaleType(scaleType);
            this.f40402o0.setImageResource(R.drawable.msg_go_down);
            this.f40402o0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i14, false), mode));
            this.f40402o0.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, i15, false), 1, -1));
            this.m0.addView(this.f40402o0, i7.f6.d(48, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f40402o0.setOnClickListener(new u(this, 1));
            this.f40402o0.setContentDescription(LocaleController.getString(R.string.AccDescrSearchPrev));
            org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(this.H, true, true, true);
            this.f40403p0 = o6Var;
            o6Var.setScaleProperty(0.6f);
            this.f40403p0.b(0.4f, 350L, org.telegram.ui.Components.jr.h);
            this.f40403p0.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
            this.f40403p0.setTextSize(AndroidUtilities.dp(15.0f));
            this.f40403p0.setTypeface(AndroidUtilities.bold());
            this.f40403p0.setGravity(3);
            this.f40403p0.getDrawable().G = AndroidUtilities.displaySize.x;
            this.m0.addView(this.f40403p0, i7.f6.d(-2, -2.0f, 19, 18.0f, 0.0f, 108.0f, 0.0f));
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.f40389a0 = layoutParams;
            layoutParams.height = -1;
            layoutParams.format = -3;
            layoutParams.width = -1;
            layoutParams.gravity = 51;
            layoutParams.type = 98;
            layoutParams.softInputMode = 48;
            layoutParams.flags = 131072;
            if (this.G == null) {
                w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23009a7, true);
            } else {
                w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23009a7, false);
            }
            if (AndroidUtilities.computePerceivedBrightness(w02) >= 0.721f && Build.VERSION.SDK_INT >= 26) {
                i11 = 1808;
            } else {
                i11 = 1792;
            }
            this.f40408u0.setColor(w02);
            WindowManager.LayoutParams layoutParams2 = this.f40389a0;
            layoutParams2.systemUiVisibility = i11;
            layoutParams2.flags |= -2147417856;
            if (Build.VERSION.SDK_INT >= 28) {
                layoutParams2.layoutInDisplayCutoutMode = 1;
            }
            org.telegram.ui.Cells.k9 k9Var = new org.telegram.ui.Cells.k9();
            this.K0 = k9Var;
            k9Var.T(this.f40404q0[0].f41513b);
            if (MessagesController.getInstance(this.T).getTranslateController().isContextTranslateEnabled()) {
                this.K0.f25953l0 = new v(this);
            }
            org.telegram.ui.Cells.k9 k9Var2 = this.K0;
            k9Var2.E0 = this.f40404q0[0].d;
            k9Var2.D = new s0(this);
            this.f40391c0.addView(k9Var2.o(activity));
            n0 n0Var2 = this.f40391c0;
            lu0 lu0Var = new lu0(n0Var2, n0Var2);
            this.M0 = lu0Var;
            lu0Var.F = new v(this);
            lu0Var.E = new h(this, 1);
            this.f40396h0.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Pk, false));
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
        CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
        ag.y1 y1Var = new ag.y1(1, this, str);
        f3Var2.items = charSequenceArr;
        f3Var2.onClickListener = y1Var;
        f3Var2.setOnHideListener(new x(this, 0));
        a0(f3Var2);
    }

    @Override
    public final int a() {
        return org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23433y6, false);
    }

    public final void a0(org.telegram.ui.ActionBar.f3 f3Var) {
        if (this.H != null) {
            try {
                org.telegram.ui.ActionBar.f3 f3Var2 = this.f40395g0;
                if (f3Var2 != null) {
                    f3Var2.dismiss();
                    this.f40395g0 = null;
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            try {
                this.f40395g0 = f3Var;
                f3Var.setCanceledOnTouchOutside(true);
                this.f40395g0.setOnDismissListener(new x(this, 1));
                f3Var.show();
            } catch (Exception e11) {
                FileLog.e(e11);
            }
        }
    }

    @Override
    public final int b() {
        return org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false);
    }

    public final void b0(boolean z10) {
        AndroidUtilities.cancelRunOnUIThread(this.f40394f0);
        if (z10) {
            this.f40392d0.W.a(0.0f, false);
            this.f40392d0.W.a(0.3f, true);
            AndroidUtilities.runOnUIThread(this.f40394f0, 100L);
            return;
        }
        this.f40392d0.W.a(1.0f, true);
    }

    @Override
    public final void c(k4 k4Var, org.telegram.ui.Components.d01 d01Var) {
        String str;
        String str2;
        org.telegram.ui.Components.z80 z80Var;
        String lowerCase;
        if (d01Var != null && (str = d01Var.f27627b) != null) {
            org.telegram.ui.ActionBar.f3 f3Var = this.E;
            m0 m0Var = null;
            if (f3Var != null) {
                f3Var.dismiss();
                this.E = null;
            }
            int lastIndexOf = str.lastIndexOf(35);
            boolean z10 = false;
            if (lastIndexOf != -1) {
                if (!TextUtils.isEmpty(k4Var.A.cached_page.url)) {
                    lowerCase = k4Var.A.cached_page.url.toLowerCase();
                } else {
                    lowerCase = k4Var.A.url.toLowerCase();
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
                f3 f3Var2 = this.d;
                if (f3Var2 != null && (z80Var = this.f37380b) != null) {
                    m0Var = new m0(this, f3Var2, z80Var);
                }
                Q(str, str2, m0Var);
            }
        }
    }

    public final void c0() {
        LaunchActivity launchActivity;
        FrameLayout frameLayout;
        if (this.S && (launchActivity = LaunchActivity.C1) != null && !launchActivity.isFinishing()) {
            if (this.f40404q0[0].f()) {
                if (this.f40404q0[0].getWebView() != null) {
                    frameLayout = this.f40404q0[0].f41516f;
                } else {
                    return;
                }
            } else {
                q3 q3Var = this.f40404q0[0];
                TLRPC.WebPage webPage = q3Var.f41514c.A;
                frameLayout = q3Var;
                if (webPage == null) {
                    return;
                }
            }
            new org.telegram.ui.Components.tc(frameLayout, null).G(R.raw.chats_infotip, 4, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BrowserExternalRestricted), new d0(this, 10))).k(true);
        }
    }

    @Override
    public final boolean d(TL_iv.PageBlock pageBlock, k4 k4Var) {
        int indexOf;
        List list;
        org.telegram.ui.ActionBar.o2 o2Var = this.I;
        if (o2Var != null && o2Var.getParentActivity() != null) {
            if ((pageBlock instanceof TL_iv.pageBlockVideo) && !j4.g(k4Var.A, pageBlock)) {
                list = Collections.singletonList(pageBlock);
                indexOf = 0;
            } else {
                ArrayList arrayList = new ArrayList(k4Var.f39742f);
                indexOf = k4Var.f39742f.indexOf(pageBlock);
                list = arrayList;
            }
            PhotoViewer t12 = PhotoViewer.t1();
            t12.K2(null, this.I, null);
            if (t12.e2(null, null, null, null, null, null, null, indexOf, new j3(this, list), null, 0L, 0L, 0L, true, new s3(this, k4Var.A, list), null)) {
                n();
                return true;
            }
        }
        return false;
    }

    public final void d0(boolean z10) {
        float f9;
        this.m0.setVisibility(0);
        ValueAnimator valueAnimator = this.T0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.U0;
        if (z10) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f9);
        this.T0 = ofFloat;
        ofFloat.addUpdateListener(new s(this, 1));
        this.T0.addListener(new bg.z2(19, this, z10));
        this.T0.setDuration(320L);
        this.T0.setInterpolator(org.telegram.ui.Components.jr.h);
        this.T0.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        d1 d1Var;
        MessageObject messageObject;
        if (i10 == NotificationCenter.messagePlayingDidStart) {
            MessageObject messageObject2 = (MessageObject) objArr[0];
            if (this.f40404q0 != null) {
                int i12 = 0;
                while (true) {
                    q3[] q3VarArr = this.f40404q0;
                    if (i12 < q3VarArr.length) {
                        int childCount = q3VarArr[i12].f41513b.getChildCount();
                        for (int i13 = 0; i13 < childCount; i13++) {
                            View childAt = this.f40404q0[i12].f41513b.getChildAt(i13);
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
                if (this.f40404q0 != null) {
                    int i14 = 0;
                    while (true) {
                        q3[] q3VarArr2 = this.f40404q0;
                        if (i14 < q3VarArr2.length) {
                            int childCount2 = q3VarArr2[i14].f41513b.getChildCount();
                            int i15 = 0;
                            while (true) {
                                if (i15 < childCount2) {
                                    View childAt2 = this.f40404q0[i14].f41513b.getChildAt(i15);
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
            } else if (i10 == NotificationCenter.emojiLoaded && this.f40404q0 != null) {
                int i16 = 0;
                while (true) {
                    q3[] q3VarArr3 = this.f40404q0;
                    if (i16 < q3VarArr3.length) {
                        int childCount3 = q3VarArr3[i16].f41513b.getChildCount();
                        for (int i17 = 0; i17 < childCount3; i17++) {
                            View childAt3 = this.f40404q0[i16].f41513b.getChildAt(i17);
                            if (childAt3 instanceof y2) {
                                ((y2) childAt3).f44703e.invalidate();
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
        } else if (this.f40404q0 != null) {
            int i18 = 0;
            while (true) {
                q3[] q3VarArr4 = this.f40404q0;
                if (i18 < q3VarArr4.length) {
                    int childCount4 = q3VarArr4[i18].f41513b.getChildCount();
                    for (int i19 = 0; i19 < childCount4; i19++) {
                        View childAt4 = this.f40404q0[i18].f41513b.getChildAt(i19);
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
            if (((obj instanceof TLRPC.WebPage) && ((TLRPC.WebPage) obj).cached_page != null) || (obj instanceof d3)) {
                int i14 = 1;
                if (!z10 && i10 != 0) {
                    q3[] q3VarArr = this.f40404q0;
                    q3 q3Var = q3VarArr[1];
                    q3VarArr[1] = q3VarArr[0];
                    q3VarArr[0] = q3Var;
                    this.f40392d0.i();
                    this.V0.a(this.f40404q0[0].getBackgroundColor(), true);
                    this.W0.a(this.f40404q0[1].getBackgroundColor(), true);
                    z3 z3Var = this.G;
                    if (z3Var != null) {
                        z3Var.m();
                    }
                    int indexOfChild = this.f40391c0.indexOfChild(this.f40404q0[0]);
                    int indexOfChild2 = this.f40391c0.indexOfChild(this.f40404q0[1]);
                    if (i10 == 1) {
                        if (indexOfChild < indexOfChild2) {
                            this.f40391c0.removeView(this.f40404q0[0]);
                            this.f40391c0.addView(this.f40404q0[0], indexOfChild2);
                        }
                    } else if (indexOfChild2 < indexOfChild) {
                        this.f40391c0.removeView(this.f40404q0[0]);
                        this.f40391c0.addView(this.f40404q0[0], indexOfChild);
                    }
                    this.f40405r0 = new AnimatorSet();
                    this.f40404q0[0].setVisibility(0);
                    if (i10 == 1) {
                        i13 = 0;
                    } else {
                        i13 = 1;
                    }
                    q3 q3Var2 = this.f40404q0[i13];
                    if (this.G == null) {
                        color = 0;
                    } else {
                        color = this.f40396h0.getColor();
                    }
                    q3Var2.setBackgroundColor(color);
                    this.f40404q0[i13].setLayerType(2, null);
                    if (i10 == 1) {
                        this.f40404q0[0].setTranslationX(AndroidUtilities.displaySize.x);
                        this.f40405r0.playTogether(ObjectAnimator.ofFloat(this.f40404q0[0], View.TRANSLATION_X, AndroidUtilities.displaySize.x, 0.0f));
                    } else if (i10 == -1) {
                        this.f40404q0[0].setTranslationX(0.0f);
                        this.f40405r0.playTogether(ObjectAnimator.ofFloat(this.f40404q0[1], View.TRANSLATION_X, 0.0f, AndroidUtilities.displaySize.x));
                    }
                    this.f40405r0.setDuration(320L);
                    this.f40405r0.setInterpolator(org.telegram.ui.Components.jr.h);
                    this.f40405r0.addListener(new x0(this, i13, 0));
                    this.f40390b0.f24041f = true;
                    o0 o0Var = this.f40392d0;
                    q3 q3Var3 = this.f40404q0[0];
                    if (q3Var3 != null && SharedConfig.adaptableColorInBrowser) {
                        w02 = q3Var3.getBackgroundColor();
                    } else {
                        w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Pk, false);
                    }
                    o0Var.setMenuColors(w02);
                    o0 o0Var2 = this.f40392d0;
                    q3 q3Var4 = this.f40404q0[0];
                    if (q3Var4 != null && SharedConfig.adaptableColorInBrowser) {
                        w03 = q3Var4.getActionBarColor();
                    } else {
                        w03 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Pk, false);
                    }
                    o0Var2.d(w03, true);
                    o0 o0Var3 = this.f40392d0;
                    q3 q3Var5 = this.f40404q0[0];
                    if (q3Var5 != null && q3Var5.e()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    o0Var3.setIsTonsite(z11);
                    o0 o0Var4 = this.f40392d0;
                    q3 q3Var6 = this.f40404q0[0];
                    if (q3Var6 != null && q3Var6.d()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    o0Var4.setIsLocal(z12);
                    AnimatorSet animatorSet = this.f40405r0;
                    Objects.requireNonNull(animatorSet);
                    AndroidUtilities.runOnUIThread(new it0(animatorSet, 4));
                }
                if (!z10) {
                    this.K0.f(true);
                }
                k4 k4Var = this.f40404q0[z10 ? 1 : 0].f41514c;
                if (z10) {
                    obj = j7.l1.i(2, this.Z);
                }
                this.f40404q0[z10 ? 1 : 0].b();
                if (obj instanceof TLRPC.WebPage) {
                    TLRPC.WebPage webPage = (TLRPC.WebPage) obj;
                    this.f40404q0[z10 ? 1 : 0].setWeb(null);
                    this.f40404q0[z10 ? 1 : 0].setType(0);
                    TL_iv.Page page = webPage.cached_page;
                    k4Var.C = page.rtl;
                    k4Var.A = webPage;
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
                                        k4Var.B = (TL_iv.pageBlockChannel) pageBlock2;
                                    }
                                }
                            }
                        } else if (i15 == 1 && k4Var.B != null) {
                        }
                        if (i15 == size - 1) {
                            i12 = i15;
                        } else {
                            i12 = 0;
                        }
                        k4Var.F(k4Var, pageBlock, 0, 0, i12);
                    }
                    k4Var.l();
                    if (this.Z.size() != 1 && i10 != -1) {
                        f2.j0 j0Var = this.f40404q0[z10 ? 1 : 0].d;
                        z3 z3Var2 = this.G;
                        if (z3Var2 == null) {
                            i14 = 0;
                        }
                        if (z3Var2 != null) {
                            i11 = AndroidUtilities.dp(32.0f);
                        } else {
                            i11 = 0;
                        }
                        j0Var.h1(i14, i11);
                    } else {
                        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("articles", 0);
                        String str = "article" + webPage.f22545id;
                        int i16 = sharedPreferences.getInt(str, -1);
                        boolean z13 = sharedPreferences.getBoolean(str + "r", true);
                        Point point = AndroidUtilities.displaySize;
                        if (point.x <= point.y) {
                            i14 = 0;
                        }
                        if (z13 == i14) {
                            dp = sharedPreferences.getInt(str + "o", 0) - this.f40404q0[z10 ? 1 : 0].f41513b.getPaddingTop();
                        } else {
                            dp = AndroidUtilities.dp(10.0f);
                        }
                        if (i16 != -1) {
                            this.f40404q0[z10 ? 1 : 0].d.h1(i16, dp);
                        }
                    }
                } else if (obj instanceof d3) {
                    this.f40404q0[z10 ? 1 : 0].setType(1);
                    this.f40404q0[z10 ? 1 : 0].g();
                    this.f40404q0[z10 ? 1 : 0].setWeb((d3) obj);
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
        q3[] q3VarArr;
        q3 q3Var;
        float translationX;
        boolean z10;
        boolean z11;
        q3 q3Var2;
        float f9;
        boolean z12;
        boolean z13;
        if (this.f40392d0 != null && (q3Var = (q3VarArr = this.f40404q0)[0]) != null && q3VarArr[1] != null) {
            int visibility = q3Var.getVisibility();
            float f10 = 0.0f;
            if (visibility != 0) {
                translationX = 0.0f;
            } else {
                translationX = 1.0f - (this.f40404q0[0].getTranslationX() / this.f40404q0[0].getWidth());
            }
            float f11 = 1.0f - translationX;
            o0 o0Var = this.f40392d0;
            o0Var.d[0] = this.f40404q0[0].getProgress();
            o0Var.invalidate();
            o0 o0Var2 = this.f40392d0;
            o0Var2.d[1] = this.f40404q0[1].getProgress();
            o0Var2.invalidate();
            this.f40392d0.setTransitionProgress(f11);
            o0 o0Var3 = this.f40392d0;
            if (!o0Var3.S && !o0Var3.P) {
                ArticleViewer$WindowView articleViewer$WindowView = this.f40390b0;
                if (articleViewer$WindowView.f24040e || articleViewer$WindowView.f24041f) {
                    boolean J = J();
                    ArrayList arrayList = this.Z;
                    if (!J && arrayList.size() <= 1) {
                        this.f40392d0.L.f();
                        this.f40392d0.setBackButtonCached(false);
                    } else {
                        if (!this.f40404q0[0].f41519s && arrayList.size() <= 1) {
                            f9 = 0.0f;
                        } else {
                            f9 = 1.0f;
                        }
                        float lerp = AndroidUtilities.lerp(f9, (this.f40404q0[1].f41519s || arrayList.size() > 2) ? 1.0f : 1.0f, f11);
                        this.f40392d0.I.c(1.0f - lerp, false);
                        this.f40392d0.L.f();
                        o0 o0Var4 = this.f40392d0;
                        if (lerp > 0.5f) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        o0Var4.setBackButtonCached(z12);
                    }
                    this.f40392d0.setHasForward(this.f40404q0[0].v);
                    this.f40392d0.setIsLocal(this.f40404q0[0].d());
                    o0 o0Var5 = this.f40392d0;
                    if (this.f40404q0[0].getWebView() != null && this.f40404q0[0].getWebView().f44226b) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    o0Var5.setIsLoaded(z13);
                }
            }
            o0 o0Var6 = this.f40392d0;
            int actionBarColor = this.f40404q0[0].getActionBarColor();
            ArticleViewer$WindowView articleViewer$WindowView2 = this.f40390b0;
            if (!articleViewer$WindowView2.f24040e && !articleViewer$WindowView2.f24041f) {
                z10 = false;
            } else {
                z10 = true;
            }
            o0Var6.b(0, this.V0.a(actionBarColor, z10));
            o0 o0Var7 = this.f40392d0;
            int actionBarColor2 = this.f40404q0[1].getActionBarColor();
            ArticleViewer$WindowView articleViewer$WindowView3 = this.f40390b0;
            if (!articleViewer$WindowView3.f24040e && !articleViewer$WindowView3.f24041f) {
                z11 = false;
            } else {
                z11 = true;
            }
            o0Var7.b(1, this.W0.a(actionBarColor2, z11));
            this.f40392d0.d(i0.a.d(f11, this.f40404q0[0].getActionBarColor(), this.f40404q0[1].getActionBarColor()), false);
            o0 o0Var8 = this.f40392d0;
            if (translationX > 0.5f) {
                q3Var2 = this.f40404q0[0];
            } else {
                q3Var2 = this.f40404q0[1];
            }
            o0Var8.setMenuType(q3Var2.f41512a);
            z3 z3Var = this.G;
            if (z3Var != null) {
                z3Var.f45046c.invalidate();
                return;
            }
            ArticleViewer$WindowView articleViewer$WindowView4 = this.f40390b0;
            if (articleViewer$WindowView4 != null) {
                articleViewer$WindowView4.invalidate();
            }
        }
    }

    public final void g(int i10, String str) {
        U();
        org.telegram.ui.ActionBar.l3 l3Var = new org.telegram.ui.ActionBar.l3();
        l3Var.v = str;
        this.Z.add(l3Var);
        this.f40392d0.h(false);
        e0(i10, l3Var, false);
    }

    public final boolean h(TLRPC.WebPage webPage, String str, int i10) {
        U();
        this.Z.add(webPage);
        this.f40392d0.h(false);
        e0(i10, webPage, false);
        return V(str, false);
    }

    public final void h0() {
        int i10;
        int size;
        boolean z10;
        boolean z11;
        float f9;
        if (this.A == null && !this.f40404q0[0].f()) {
            return;
        }
        if (this.f40404q0[0].f()) {
            if (this.f40404q0[0].getWebView() == null) {
                i10 = 0;
            } else {
                i10 = this.f40404q0[0].getWebView().getSearchIndex();
            }
            if (this.f40404q0[0].getWebView() == null) {
                size = 0;
            } else {
                size = this.f40404q0[0].getWebView().getSearchCount();
            }
        } else {
            i10 = this.C;
            size = this.A.size();
        }
        ImageView imageView = this.f40401n0;
        if (size > 0 && i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        imageView.setEnabled(z10);
        ImageView imageView2 = this.f40402o0;
        if (size > 0 && i10 != size - 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        imageView2.setEnabled(z11);
        ImageView imageView3 = this.f40401n0;
        float f10 = 0.5f;
        if (imageView3.isEnabled()) {
            f9 = 1.0f;
        } else {
            f9 = 0.5f;
        }
        imageView3.setAlpha(f9);
        ImageView imageView4 = this.f40402o0;
        if (imageView4.isEnabled()) {
            f10 = 1.0f;
        }
        imageView4.setAlpha(f10);
        this.f40403p0.a();
        if (size < 0) {
            this.f40403p0.setText("");
        } else if (size == 0) {
            this.f40403p0.setText(LocaleController.getString(R.string.NoResult));
        } else if (size == 1) {
            this.f40403p0.setText(LocaleController.getString(R.string.OneResult));
        } else {
            this.f40403p0.setText(String.format(LocaleController.getPluralString("CountOfResults", size), Integer.valueOf(i10 + 1), Integer.valueOf(size)));
        }
    }

    public final void i0(boolean z10) {
        boolean z11;
        boolean z12 = false;
        this.f40392d0.g(0, this.f40404q0[0].getTitle(), z10);
        this.f40392d0.f(0, this.f40404q0[0].getSubtitle());
        o0 o0Var = this.f40392d0;
        if (this.f40404q0[0].f() && this.f40404q0[0].getWebView() != null && this.f40404q0[0].getWebView().A) {
            z11 = true;
        } else {
            z11 = false;
        }
        o0Var.e(0, z11);
        this.f40392d0.g(1, this.f40404q0[1].getTitle(), z10);
        this.f40392d0.f(1, this.f40404q0[1].getSubtitle());
        o0 o0Var2 = this.f40392d0;
        if (this.f40404q0[1].f() && this.f40404q0[1].getWebView() != null && this.f40404q0[1].getWebView().A) {
            z12 = true;
        }
        o0Var2.e(1, z12);
    }

    public final void k() {
        this.F0 = false;
        e3 e3Var = this.G0;
        if (e3Var != null) {
            this.f40390b0.removeCallbacks(e3Var);
            this.G0 = null;
        }
        e3 e3Var2 = this.H0;
        if (e3Var2 != null) {
            this.f40390b0.removeCallbacks(e3Var2);
            this.H0 = null;
        }
    }

    public final void m(org.telegram.messenger.b6 b6Var) {
        if (this.E0 == AndroidUtilities.dp(56.0f)) {
            if (b6Var != null) {
                b6Var.run();
                return;
            }
            return;
        }
        ValueAnimator duration = ValueAnimator.ofObject(new IntEvaluator(), Integer.valueOf(this.E0), Integer.valueOf(AndroidUtilities.dp(56.0f))).setDuration(180L);
        duration.setInterpolator(new DecelerateInterpolator());
        duration.addUpdateListener(new s(this, 0));
        duration.addListener(new u0(0, b6Var));
        if (b6Var != null) {
            duration.setDuration(duration.getDuration() / 2);
        }
        duration.start();
    }

    public final void n() {
        long j10;
        b3 b3Var;
        nh.v vVar = this.f40404q0[0].f41513b;
        if (vVar != null && this.S) {
            float measuredHeight = vVar.getMeasuredHeight() / 2.0f;
            Uri uri = null;
            float f9 = 0.0f;
            b3 b3Var2 = null;
            for (int i10 = 0; i10 < vVar.getChildCount(); i10++) {
                View childAt = vVar.getChildAt(i10);
                if (childAt instanceof b3) {
                    float measuredHeight2 = (childAt.getMeasuredHeight() / 2.0f) + childAt.getTop();
                    if (b3Var2 == null || Math.abs(measuredHeight - measuredHeight2) < Math.abs(measuredHeight - f9)) {
                        b3Var2 = (b3) childAt;
                        f9 = measuredHeight2;
                    }
                }
            }
            boolean z10 = PhotoViewer.t1().f35692f;
            if (z10 || ((b3Var = this.f37388x) != null && b3Var != b3Var2 && this.f37387w != null)) {
                VideoPlayerHolderBase videoPlayerHolderBase = this.f37387w;
                if (videoPlayerHolderBase != null) {
                    b3 b3Var3 = this.f37388x;
                    long j11 = b3Var3.H.video_id;
                    c3 a2 = c3.a(videoPlayerHolderBase, b3Var3);
                    b3Var3.c(a2);
                    this.f37389y.k(a2, j11);
                    b3 b3Var4 = this.f37388x;
                    c3 c3Var = b3Var4.I;
                    if (c3Var != null) {
                        Bitmap bitmap = c3Var.f36978b;
                        if (bitmap != null) {
                            b3Var4.f36665e.setImageBitmap(bitmap);
                        }
                        this.f37388x.e(false);
                    }
                    this.f37387w.release(null);
                }
                this.f37387w = null;
                this.f37388x = null;
            }
            if (!z10 && b3Var2 != null) {
                d70 d70Var = b3Var2.f36662a;
                if (b3Var2.K != null && d70Var.f37387w == null) {
                    d70Var.f37387w = new a3(b3Var2).with(b3Var2.f36667n);
                    TLRPC.Document document = b3Var2.K;
                    for (int i11 = 0; i11 < document.attributes.size(); i11++) {
                        if (document.attributes.get(i11) instanceof TLRPC.TL_documentAttributeVideo) {
                            TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) document.attributes.get(i11);
                            b3Var2.h.a(tL_documentAttributeVideo.f22399w / tL_documentAttributeVideo.h, 0);
                        }
                    }
                    TLRPC.WebPage webPage = b3Var2.f36663b.A;
                    if (webPage != null) {
                        uri = FileStreamLoadOperation.prepareUri(((m4) d70Var).T, document, webPage);
                    }
                    if (uri != null) {
                        VideoPlayerHolderBase videoPlayerHolderBase2 = d70Var.f37387w;
                        c3 c3Var2 = b3Var2.I;
                        if (c3Var2 == null) {
                            j10 = 0;
                        } else {
                            j10 = c3Var2.f36977a;
                        }
                        videoPlayerHolderBase2.seekTo(j10);
                        d70Var.f37387w.preparePlayer(uri, true, 1.0f);
                        d70Var.f37387w.play();
                    }
                }
                this.f37388x = b3Var2;
            }
        }
    }

    public final void o(boolean z10, boolean z11) {
        if (this.H != null && !this.P0 && this.R) {
            int i10 = 0;
            if (this.V != 0 && Math.abs(this.X - System.currentTimeMillis()) >= 500) {
                Runnable runnable = this.W;
                if (runnable != null) {
                    runnable.run();
                    this.W = null;
                }
                this.V = 0;
            }
            if (this.V == 0) {
                z3 z3Var = this.G;
                if (z3Var != null) {
                    z3Var.dismiss(false);
                    return;
                }
                if (this.L.getVisibility() == 0) {
                    if (this.K != null) {
                        this.L.setVisibility(4);
                        this.O.onCustomViewHidden();
                        this.L.removeView(this.K);
                        this.K = null;
                    } else {
                        org.telegram.ui.Components.s81 s81Var = this.A0;
                        if (s81Var != null && s81Var.P) {
                            s81Var.P = false;
                            s81Var.m();
                            s81Var.l(false);
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
                o0 o0Var = this.f40392d0;
                if (o0Var.P) {
                    o0Var.h(false);
                } else if (o0Var.S) {
                    o0Var.k(false);
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
                            Object j10 = com.google.android.recaptcha.internal.a.j(1, arrayList);
                            if (j10 instanceof d3) {
                                ((d3) j10).a();
                            }
                            if (j10 instanceof TLRPC.WebPage) {
                                org.telegram.ui.web.f2.o((TLRPC.WebPage) j10);
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
                    jf.s0 s0Var = this.Q0;
                    if (s0Var != null) {
                        s0Var.destroy();
                        this.Q0 = null;
                    }
                    this.I = null;
                    try {
                        org.telegram.ui.ActionBar.f3 f3Var = this.f40395g0;
                        if (f3Var != null) {
                            f3Var.dismiss();
                            this.f40395g0 = null;
                        }
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    ArticleViewer$WindowView articleViewer$WindowView = this.f40390b0;
                    Property property = View.ALPHA;
                    animatorSet.playTogether(ObjectAnimator.ofFloat(articleViewer$WindowView, property, 0.0f), ObjectAnimator.ofFloat(this.f40391c0, property, 0.0f), ObjectAnimator.ofFloat(this.f40390b0, View.TRANSLATION_X, 0.0f, AndroidUtilities.dp(56.0f)));
                    this.V = 2;
                    this.W = new d0(this, 7);
                    animatorSet.setDuration(150L);
                    animatorSet.setInterpolator(this.Y);
                    animatorSet.addListener(new nh.q5(this, 5));
                    this.X = System.currentTimeMillis();
                    this.f40391c0.setLayerType(2, null);
                    animatorSet.start();
                    while (true) {
                        a0.h hVar = this.f37389y;
                        if (i10 < hVar.m()) {
                            c3 c3Var = (c3) hVar.n(i10);
                            Bitmap bitmap = c3Var.f36978b;
                            if (bitmap != null) {
                                bitmap.recycle();
                                c3Var.f36978b = null;
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
            ArrayList arrayList = this.Z;
            if (i10 < arrayList.size()) {
                Object obj = arrayList.get(i10);
                if (obj instanceof d3) {
                    q3 q3Var = this.f40404q0[0];
                    if (q3Var != null && q3Var.F == obj) {
                        ((d3) obj).c(q3Var);
                    }
                    q3 q3Var2 = this.f40404q0[1];
                    if (q3Var2 != null && q3Var2.F == obj) {
                        ((d3) obj).c(q3Var2);
                    }
                    ((d3) obj).a();
                } else if (obj instanceof TLRPC.WebPage) {
                    org.telegram.ui.web.f2.o((TLRPC.WebPage) obj);
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
        if (this.H != null && (articleViewer$WindowView = this.f40390b0) != null) {
            if (this.G == null) {
                try {
                    if (articleViewer$WindowView.getParent() != null) {
                        ((WindowManager) this.H.getSystemService("window")).removeViewImmediate(this.f40390b0);
                    }
                    this.f40390b0 = null;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            for (int i10 = 0; i10 < this.J.size(); i10++) {
                ((w1) this.J.get(i10)).a(true);
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

    public m4(org.telegram.ui.ActionBar.o2 o2Var) {
        this.J = new ArrayList();
        this.U = 1;
        this.Y = new DecelerateInterpolator(1.5f);
        this.Z = new ArrayList();
        this.f40406s0 = new Paint();
        this.f40407t0 = new Paint();
        this.f40408u0 = new Paint();
        this.f40409v0 = new Paint();
        this.F0 = false;
        this.G0 = null;
        this.H0 = null;
        this.N0 = new AnimationNotificationsLocker(new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats});
        this.O0 = new n0[2];
        this.S0 = -1;
        d0 d0Var = new d0(this, 2);
        org.telegram.ui.Components.jr jrVar = org.telegram.ui.Components.jr.h;
        this.V0 = new org.telegram.ui.Components.f5(d0Var, 320L, jrVar);
        this.W0 = new org.telegram.ui.Components.f5(new d0(this, 4), 320L, jrVar);
        this.F = true;
        this.G = new z3(this, o2Var);
        Y(o2Var.getParentActivity(), o2Var);
    }
}
