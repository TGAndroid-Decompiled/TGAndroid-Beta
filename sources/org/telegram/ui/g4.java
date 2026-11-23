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
import android.graphics.Rect;
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
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class g4 extends p50 implements org.telegram.messenger.fs {
    public static Paint A1;
    public static Paint B1;
    public static Paint D1;
    public static TextPaint f48045i1;
    public static TextPaint f48046j1;
    public static TextPaint f48047k1;
    public static TextPaint l1;
    public static TextPaint f48048m1;
    public static TextPaint n1;
    public static TextPaint f48049o1;
    public static TextPaint f48050p1;
    public static Paint f48051q1;
    public static Paint f48052r1;
    public static Paint f48053s1;
    public static Paint f48054t1;
    public static Paint f48055u1;
    public static Paint f48056v1;
    public static Paint f48057w1;
    public static Paint f48058x1;
    public static Paint f48059y1;
    public static Paint f48060z1;
    public boolean A0;
    public final Paint B0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout C0;
    public TextView D0;
    public Rect E0;
    public org.telegram.ui.Components.a81 F0;
    public org.telegram.ui.Components.a81 G0;
    public int H0;
    public int I0;
    public int J0;
    public final boolean K;
    public int K0;
    public final t3 L;
    public boolean L0;
    public Activity M;
    public y2 M0;
    public org.telegram.ui.ActionBar.g2 N;
    public y2 N0;
    public final ArrayList O;
    public vf.b O0;
    public View P;
    public int P0;
    public FrameLayout Q;
    public org.telegram.ui.Cells.i9 Q0;
    public TextureView R;
    public org.telegram.ui.Cells.i9 R0;
    public j4 S;
    public fr0 S0;
    public WebChromeClient.CustomViewCallback T;
    public final h2.f T0;
    public WindowInsets U;
    public final k0[] U0;
    public boolean V;
    public boolean V0;
    public boolean W;
    public bg.v0 W0;
    public boolean X;
    public ai.e1 X0;
    public int Y;
    public int Y0;
    public int Z;
    public ValueAnimator Z0;
    public int f48061a0;
    public float f48062a1;
    public Runnable f48063b0;
    public final org.telegram.ui.Components.f5 f48064b1;
    public long f48065c0;
    public final org.telegram.ui.Components.f5 f48066c1;
    public final DecelerateInterpolator f48067d0;
    public final ArrayList f48068e0;
    public WindowManager.LayoutParams f48069f0;
    public ArticleViewer$WindowView f48070g0;
    public k0 f48071h0;
    public l0 f48072i0;
    public org.telegram.ui.web.k f48073j0;
    public z f48074k0;
    public org.telegram.ui.ActionBar.w2 f48075l0;
    public Paint m0;
    public Drawable f48076n0;
    public Paint f48077o0;
    public boolean f48078p0;
    public float f48079q0;
    public bi.v2 f48080r0;
    public ImageView f48081s0;
    public ImageView f48082t0;
    public org.telegram.ui.Components.n6 f48083u0;
    public k3[] f48084v0;
    public AnimatorSet f48085w0;
    public final Paint f48086x0;
    public final Paint f48087y0;
    public final Paint f48088z0;
    public static final HashSet f48040d1 = new HashSet();
    public static volatile g4 f48041e1 = null;
    public static final q0 f48042f1 = new q0("innerTranslationX", 0);
    public static final TextPaint f48043g1 = new TextPaint(1);
    public static final o3 f48044h1 = new o3();
    public static final WeakHashMap C1 = new WeakHashMap();

    public g4() {
        this.O = new ArrayList();
        this.Z = 1;
        this.f48067d0 = new DecelerateInterpolator(1.5f);
        this.f48068e0 = new ArrayList();
        this.f48086x0 = new Paint();
        this.f48087y0 = new Paint();
        this.f48088z0 = new Paint();
        this.B0 = new Paint();
        this.L0 = false;
        this.M0 = null;
        this.N0 = null;
        this.T0 = new h2.f(new int[]{org.telegram.messenger.ks.f25283s, org.telegram.messenger.ks.f25289t});
        this.U0 = new k0[2];
        this.Y0 = -1;
        z zVar = new z(this, 4);
        org.telegram.ui.Components.kr krVar = org.telegram.ui.Components.kr.h;
        this.f48064b1 = new org.telegram.ui.Components.f5(zVar, 320L, krVar);
        this.f48066c1 = new org.telegram.ui.Components.f5(new z(this, 5), 320L, krVar);
        this.K = false;
        this.L = null;
    }

    public static CharSequence A(p50 p50Var, TLRPC.WebPage webPage, View view, TL_iv.RichText richText, TL_iv.RichText richText2, TL_iv.PageBlock pageBlock, int i7) {
        org.telegram.ui.Components.az0 az0Var;
        org.telegram.ui.Components.az0 az0Var2;
        TextPaint textPaint = null;
        if (richText2 == null) {
            return null;
        }
        if (richText2 instanceof TL_iv.textFixed) {
            return A(p50Var, webPage, view, richText, ((TL_iv.textFixed) richText2).text, pageBlock, i7);
        }
        if (richText2 instanceof TL_iv.textItalic) {
            return A(p50Var, webPage, view, richText, ((TL_iv.textItalic) richText2).text, pageBlock, i7);
        }
        if (richText2 instanceof TL_iv.textBold) {
            return A(p50Var, webPage, view, richText, ((TL_iv.textBold) richText2).text, pageBlock, i7);
        }
        if (richText2 instanceof TL_iv.textUnderline) {
            return A(p50Var, webPage, view, richText, ((TL_iv.textUnderline) richText2).text, pageBlock, i7);
        }
        if (richText2 instanceof TL_iv.textStrike) {
            return A(p50Var, webPage, view, richText, ((TL_iv.textStrike) richText2).text, pageBlock, i7);
        }
        if (richText2 instanceof TL_iv.textEmail) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(A(p50Var, webPage, view, richText, ((TL_iv.textEmail) richText2).text, pageBlock, i7));
            MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), MetricAffectingSpan.class);
            if (spannableStringBuilder.length() != 0) {
                if (metricAffectingSpanArr == null || metricAffectingSpanArr.length == 0) {
                    textPaint = C(p50Var, richText, richText2, pageBlock);
                }
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.az0(textPaint, "mailto:" + D(richText2)), 0, spannableStringBuilder.length(), 33);
            }
            return spannableStringBuilder;
        }
        long j3 = 0;
        if (richText2 instanceof TL_iv.textUrl) {
            TL_iv.textUrl texturl = (TL_iv.textUrl) richText2;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(A(p50Var, webPage, view, richText, texturl.text, pageBlock, i7));
            MetricAffectingSpan[] metricAffectingSpanArr2 = (MetricAffectingSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), MetricAffectingSpan.class);
            if (metricAffectingSpanArr2 == null || metricAffectingSpanArr2.length == 0) {
                textPaint = C(p50Var, richText, richText2, pageBlock);
            }
            if (texturl.webpage_id != 0) {
                az0Var2 = new org.telegram.ui.Components.az0(textPaint, D(richText2));
            } else {
                az0Var2 = new org.telegram.ui.Components.az0(textPaint, D(richText2));
            }
            if (spannableStringBuilder2.length() != 0) {
                spannableStringBuilder2.setSpan(az0Var2, 0, spannableStringBuilder2.length(), 33);
            }
            return spannableStringBuilder2;
        } else if (richText2 instanceof TL_iv.textPlain) {
            return ((TL_iv.textPlain) richText2).text;
        } else {
            if (richText2 instanceof TL_iv.textAnchor) {
                TL_iv.textAnchor textanchor = (TL_iv.textAnchor) richText2;
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(A(p50Var, webPage, view, richText, textanchor.text, pageBlock, i7));
                String str = textanchor.name;
                ?? metricAffectingSpan = new MetricAffectingSpan();
                metricAffectingSpan.f33927a = str.toLowerCase();
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
                        TL_iv.RichText y10 = y(richText3);
                        boolean z10 = i7 >= 0 && (richText3 instanceof TL_iv.textUrl) && ((TL_iv.textUrl) richText3).webpage_id != j3;
                        if (z10 && spannableStringBuilder4.length() != 0 && spannableStringBuilder4.charAt(spannableStringBuilder4.length() - 1) != '\n') {
                            spannableStringBuilder4.append((CharSequence) " ");
                            spannableStringBuilder4.setSpan(new Object(), spannableStringBuilder4.length() - 1, spannableStringBuilder4.length(), 33);
                        }
                        CharSequence A = A(p50Var, webPage, view, richText, richText3, pageBlock, i7);
                        int B = B(y10);
                        int length = spannableStringBuilder4.length();
                        spannableStringBuilder4.append(A);
                        if (B != 0 && !(A instanceof SpannableStringBuilder)) {
                            if ((B & 8) == 0 && (B & 512) == 0) {
                                if (length != spannableStringBuilder4.length()) {
                                    TextPaint C = C(p50Var, richText, y10, pageBlock);
                                    ?? metricAffectingSpan2 = new MetricAffectingSpan();
                                    metricAffectingSpan2.f43083a = C;
                                    spannableStringBuilder4.setSpan(metricAffectingSpan2, length, spannableStringBuilder4.length(), 33);
                                }
                            } else {
                                String D = D(richText3);
                                if (D == null) {
                                    D = D(richText);
                                }
                                if ((B & 512) != 0) {
                                    az0Var = new org.telegram.ui.Components.az0(C(p50Var, richText, y10, pageBlock), D);
                                } else {
                                    az0Var = new org.telegram.ui.Components.az0(C(p50Var, richText, y10, pageBlock), D);
                                }
                                if (length != spannableStringBuilder4.length()) {
                                    spannableStringBuilder4.setSpan(az0Var, length, spannableStringBuilder4.length(), 33);
                                }
                            }
                        }
                        if (z10 && i10 != size - 1) {
                            spannableStringBuilder4.append((CharSequence) " ");
                            spannableStringBuilder4.setSpan(new Object(), spannableStringBuilder4.length() - 1, spannableStringBuilder4.length(), 33);
                        }
                        i10++;
                        j3 = 0;
                    }
                    return spannableStringBuilder4;
                } else if (richText2 instanceof TL_iv.textSubscript) {
                    return A(p50Var, webPage, view, richText, ((TL_iv.textSubscript) richText2).text, pageBlock, i7);
                } else {
                    if (richText2 instanceof TL_iv.textSuperscript) {
                        return A(p50Var, webPage, view, richText, ((TL_iv.textSuperscript) richText2).text, pageBlock, i7);
                    }
                    if (richText2 instanceof TL_iv.textMarked) {
                        SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(A(p50Var, webPage, view, richText, ((TL_iv.textMarked) richText2).text, pageBlock, i7));
                        MetricAffectingSpan[] metricAffectingSpanArr3 = (MetricAffectingSpan[]) spannableStringBuilder5.getSpans(0, spannableStringBuilder5.length(), MetricAffectingSpan.class);
                        if (spannableStringBuilder5.length() != 0) {
                            if (metricAffectingSpanArr3 == null || metricAffectingSpanArr3.length == 0) {
                                textPaint = C(p50Var, richText, richText2, pageBlock);
                            }
                            ?? metricAffectingSpan3 = new MetricAffectingSpan();
                            metricAffectingSpan3.f42588a = textPaint;
                            spannableStringBuilder5.setSpan(metricAffectingSpan3, 0, spannableStringBuilder5.length(), 33);
                        }
                        return spannableStringBuilder5;
                    } else if (richText2 instanceof TL_iv.textSpoiler) {
                        SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder(A(p50Var, webPage, view, richText, ((TL_iv.textSpoiler) richText2).text, pageBlock, i7));
                        if (spannableStringBuilder6.length() != 0) {
                            ?? obj = new Object();
                            obj.f34924a |= 256;
                            spannableStringBuilder6.setSpan(new org.telegram.ui.Components.fz0(obj, 0), 0, spannableStringBuilder6.length(), 33);
                        }
                        return spannableStringBuilder6;
                    } else if (richText2 instanceof TL_iv.textPhone) {
                        SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder(A(p50Var, webPage, view, richText, ((TL_iv.textPhone) richText2).text, pageBlock, i7));
                        MetricAffectingSpan[] metricAffectingSpanArr4 = (MetricAffectingSpan[]) spannableStringBuilder7.getSpans(0, spannableStringBuilder7.length(), MetricAffectingSpan.class);
                        if (spannableStringBuilder7.length() != 0) {
                            if (metricAffectingSpanArr4 == null || metricAffectingSpanArr4.length == 0) {
                                textPaint = C(p50Var, richText, richText2, pageBlock);
                            }
                            spannableStringBuilder7.setSpan(new org.telegram.ui.Components.az0(textPaint, "tel:" + D(richText2)), 0, spannableStringBuilder7.length(), 33);
                        }
                        return spannableStringBuilder7;
                    } else {
                        if (richText2 instanceof TL_iv.textImage) {
                            TL_iv.textImage textimage = (TL_iv.textImage) richText2;
                            TLRPC.Document a10 = d4.a(webPage, textimage.document_id);
                            TLRPC.Photo e10 = d4.e(webPage, textimage.photo_id);
                            if (a10 != null) {
                                SpannableStringBuilder spannableStringBuilder8 = new SpannableStringBuilder("*");
                                int L = org.telegram.messenger.g0.L(textimage.f28718w);
                                int L2 = org.telegram.messenger.g0.L(textimage.h);
                                int abs = Math.abs(i7);
                                if (L > abs) {
                                    L2 = (int) (L2 * (abs / L));
                                    L = abs;
                                }
                                if (view != null) {
                                    int i11 = org.telegram.ui.ActionBar.n6.f29451d6;
                                    ((g4) p50Var).getClass();
                                    boolean z11 = org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.x0(null, i11, false)) <= 0.705f;
                                    ?? replacementSpan = new ReplacementSpan();
                                    Locale locale = Locale.US;
                                    String str2 = L + "_" + L2 + "_i";
                                    replacementSpan.f42247b = L;
                                    replacementSpan.f42248c = L2;
                                    boolean z12 = z11;
                                    ImageReceiver imageReceiver = new ImageReceiver(view);
                                    replacementSpan.f42246a = imageReceiver;
                                    imageReceiver.K0 = true;
                                    if (z12) {
                                        imageReceiver.f22737h1 = new org.telegram.ui.Components.ub0(19);
                                    }
                                    imageReceiver.s0(org.telegram.messenger.fc.b(a10), str2, org.telegram.messenger.fc.c(org.telegram.messenger.w7.w(a10.thumbs, 90, false, null, false), a10), str2, null, -1L, null, webPage, 1);
                                    spannableStringBuilder8.setSpan(replacementSpan, 0, spannableStringBuilder8.length(), 33);
                                }
                                return spannableStringBuilder8;
                            } else if (e10 instanceof org.telegram.ui.web.v1) {
                                org.telegram.ui.web.v1 v1Var = (org.telegram.ui.web.v1) e10;
                                SpannableStringBuilder spannableStringBuilder9 = new SpannableStringBuilder("*");
                                int L3 = org.telegram.messenger.g0.L(textimage.f28718w);
                                int L4 = org.telegram.messenger.g0.L(textimage.h);
                                int abs2 = Math.abs(i7);
                                if (L3 > abs2) {
                                    L4 = (int) (L4 * (abs2 / L3));
                                    L3 = abs2;
                                }
                                if (view != null) {
                                    ?? replacementSpan2 = new ReplacementSpan();
                                    replacementSpan2.f42247b = L3;
                                    replacementSpan2.f42248c = L4;
                                    ImageReceiver imageReceiver2 = new ImageReceiver(view);
                                    replacementSpan2.f42246a = imageReceiver2;
                                    imageReceiver2.K0 = true;
                                    org.telegram.ui.web.w1.g(v1Var, imageReceiver2, new org.telegram.ui.Components.ne(12));
                                    spannableStringBuilder9.setSpan(replacementSpan2, 0, spannableStringBuilder9.length(), 33);
                                }
                                return spannableStringBuilder9;
                            }
                        } else if (richText2 instanceof TL_iv.textMath) {
                            TL_iv.textMath textmath = (TL_iv.textMath) richText2;
                            if (textmath.bitmap == null && !textmath.tried) {
                                textmath.tried = true;
                                oi.q a11 = oi.q.a(textmath.source, org.telegram.messenger.g0.L(20.0f), true);
                                if (a11 != null) {
                                    textmath.f28719w = a11.f22385b;
                                    textmath.h = a11.f22386c;
                                    textmath.depth = a11.d;
                                    textmath.bitmap = a11.f22384a;
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
                                int i12 = textmath.f28719w;
                                int i13 = textmath.h;
                                int i14 = org.telegram.ui.ActionBar.n6.G6;
                                ((g4) p50Var).getClass();
                                spannableStringBuilder10.setSpan(new org.telegram.ui.Components.xy0(view, bitmap, i12, i13, org.telegram.ui.ActionBar.n6.x0(null, i14, false), textmath.depth), 0, spannableStringBuilder10.length(), 33);
                                String str4 = textmath.source;
                                if (str4 != null && !str4.isEmpty()) {
                                    spannableStringBuilder10.setSpan(new org.telegram.ui.Cells.o9(textmath.source), 0, spannableStringBuilder10.length(), 33);
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

    public static int B(TL_iv.RichText richText) {
        if (richText instanceof TL_iv.textFixed) {
            return B(richText.parentRichText) | 4;
        }
        if (richText instanceof TL_iv.textItalic) {
            return B(richText.parentRichText) | 2;
        }
        if (richText instanceof TL_iv.textBold) {
            return B(richText.parentRichText) | 1;
        }
        if (richText instanceof TL_iv.textUnderline) {
            return B(richText.parentRichText) | 16;
        }
        if (richText instanceof TL_iv.textStrike) {
            return B(richText.parentRichText) | 32;
        }
        if (richText instanceof TL_iv.textEmail) {
            return B(richText.parentRichText) | 8;
        }
        if (richText instanceof TL_iv.textPhone) {
            return B(richText.parentRichText) | 8;
        }
        if (richText instanceof TL_iv.textUrl) {
            if (((TL_iv.textUrl) richText).webpage_id != 0) {
                return B(richText.parentRichText) | 512;
            }
            return B(richText.parentRichText) | 8;
        } else if (richText instanceof TL_iv.textSubscript) {
            return B(richText.parentRichText) | 128;
        } else {
            if (richText instanceof TL_iv.textSuperscript) {
                return B(richText.parentRichText) | 256;
            }
            if (richText instanceof TL_iv.textMarked) {
                return B(richText.parentRichText) | 64;
            }
            if (richText != null) {
                return B(richText.parentRichText);
            }
            return 0;
        }
    }

    public static android.text.TextPaint C(org.telegram.ui.p50 r21, org.telegram.tgnet.tl.TL_iv.RichText r22, org.telegram.tgnet.tl.TL_iv.RichText r23, org.telegram.tgnet.tl.TL_iv.PageBlock r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g4.C(org.telegram.ui.p50, org.telegram.tgnet.tl.TL_iv$RichText, org.telegram.tgnet.tl.TL_iv$RichText, org.telegram.tgnet.tl.TL_iv$PageBlock):android.text.TextPaint");
    }

    public static String D(TL_iv.RichText richText) {
        if (richText instanceof TL_iv.textFixed) {
            return D(((TL_iv.textFixed) richText).text);
        }
        if (richText instanceof TL_iv.textItalic) {
            return D(((TL_iv.textItalic) richText).text);
        }
        if (richText instanceof TL_iv.textBold) {
            return D(((TL_iv.textBold) richText).text);
        }
        if (richText instanceof TL_iv.textUnderline) {
            return D(((TL_iv.textUnderline) richText).text);
        }
        if (richText instanceof TL_iv.textStrike) {
            return D(((TL_iv.textStrike) richText).text);
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

    public static boolean G() {
        if (f48041e1 != null) {
            return true;
        }
        return false;
    }

    public static boolean I(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockHeading1) && !(pageBlock instanceof TL_iv.pageBlockHeading2) && !(pageBlock instanceof TL_iv.pageBlockHeading3) && !(pageBlock instanceof TL_iv.pageBlockHeading4) && !(pageBlock instanceof TL_iv.pageBlockHeading5) && !(pageBlock instanceof TL_iv.pageBlockHeading6)) {
            return false;
        }
        return true;
    }

    public static boolean J(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof w3) && !(pageBlock instanceof y3)) {
            return false;
        }
        return true;
    }

    public static boolean M(u3 u3Var) {
        boolean z10;
        TL_iv.PageBlock x10 = x(u3Var.f52523a);
        if (x10 instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) x10;
            if (!pageblockdetails.open) {
                pageblockdetails.open = true;
                return true;
            }
        } else if (x10 instanceof u3) {
            u3 u3Var2 = (u3) x10;
            TL_iv.PageBlock x11 = x(u3Var2.f52524b);
            if (x11 instanceof TL_iv.pageBlockDetails) {
                TL_iv.pageBlockDetails pageblockdetails2 = (TL_iv.pageBlockDetails) x11;
                if (!pageblockdetails2.open) {
                    pageblockdetails2.open = true;
                    z10 = true;
                    if (!M(u3Var2) || z10) {
                        return true;
                    }
                }
            }
            z10 = false;
            if (!M(u3Var2)) {
            }
            return true;
        }
        return false;
    }

    public static void R(p50 p50Var) {
        if (p50Var.f50839b != null || p50Var.f50842f != null) {
            View view = p50Var.f50842f;
            p50Var.f50840c.f(true);
            p50Var.f50839b = null;
            p50Var.d = null;
            p50Var.f50842f = null;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public static WindowInsets c(WindowInsets windowInsets) {
        if (Build.VERSION.SDK_INT >= 30) {
            return WindowInsets.CONSUMED;
        }
        return windowInsets.consumeSystemWindowInsets();
    }

    public static void d(String str, int i7, FrameLayout frameLayout, t3 t3Var, org.telegram.ui.ActionBar.i6 i6Var) {
        String u10 = org.telegram.ui.web.v0.u(str);
        long e10 = org.telegram.messenger.i10.i(i7).e();
        org.telegram.messenger.zy.C(i7).r0(org.telegram.messenger.xy.a(e10, u10));
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
        tL_message.peer_id = tL_peerUser;
        tL_peerUser.user_id = e10;
        TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
        tL_message.from_id = tL_peerUser2;
        tL_peerUser2.user_id = e10;
        tL_message.message = u10;
        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
        tL_message.media = tL_messageMediaWebPage;
        tL_messageMediaWebPage.webpage = new TLRPC.TL_webPage();
        TLRPC.WebPage webPage = tL_message.media.webpage;
        webPage.url = u10;
        webPage.display_url = u10;
        org.telegram.messenger.ks.f(i7).k(org.telegram.messenger.ks.H1, new org.telegram.messenger.fj(i7, tL_message, false, false));
        new org.telegram.ui.Components.kc(frameLayout, i6Var).Q(2131624191, 36, org.telegram.messenger.g0.T2(org.telegram.messenger.gd.N0(2131742669, null), new bi.e4(t3Var, e10, 20))).k(true);
    }

    public static void e0(p50 p50Var) {
        TextPaint textPaint = f48049o1;
        if (textPaint != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G6, false));
        }
        TextPaint textPaint2 = f48050p1;
        if (textPaint2 != null) {
            textPaint2.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G6, false));
        }
        TextPaint textPaint3 = f48045i1;
        if (textPaint3 != null) {
            textPaint3.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G6, false));
        }
        TextPaint textPaint4 = f48047k1;
        if (textPaint4 != null) {
            textPaint4.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G6, false));
        }
        TextPaint textPaint5 = l1;
        if (textPaint5 != null) {
            textPaint5.setColor(-1);
        }
        TextPaint textPaint6 = f48048m1;
        if (textPaint6 != null) {
            textPaint6.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G6, false));
        }
        TextPaint textPaint7 = n1;
        if (textPaint7 != null) {
            textPaint7.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29843y6, false));
        }
        TextPaint textPaint8 = f48046j1;
        if (textPaint8 != null) {
            textPaint8.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29843y6, false));
        }
        p(p50Var, true);
        o3 o3Var = f48044h1;
        o3.a(p50Var, o3Var.d);
        o3.a(p50Var, o3Var.f50495e);
        o3.a(p50Var, o3Var.f50497g);
        o3.a(p50Var, o3Var.f50496f);
        o3.a(p50Var, o3Var.h);
        o3.a(p50Var, o3Var.f50498i);
        o3.a(p50Var, o3Var.f50499j);
        o3.a(p50Var, o3Var.f50500k);
        o3.a(p50Var, o3Var.f50501l);
        o3.a(p50Var, o3Var.f50502m);
        o3.a(p50Var, o3Var.f50503n);
        o3.a(p50Var, o3Var.f50509t);
        o3.a(p50Var, o3Var.f50508s);
        o3.a(p50Var, o3Var.f50506q);
        o3.a(p50Var, o3Var.f50507r);
        o3.a(p50Var, o3Var.f50510u);
        o3.a(p50Var, o3Var.f50511w);
        o3.a(p50Var, o3Var.f50512x);
        o3.a(p50Var, o3Var.f50493b);
        o3.a(p50Var, o3Var.f50494c);
        o3.a(p50Var, o3Var.f50504o);
        o3.a(p50Var, o3Var.f50505p);
        o3.a(p50Var, o3Var.v);
        o3.a(p50Var, o3Var.f50513y);
        o3.a(p50Var, o3Var.f50514z);
        o3.a(p50Var, o3Var.A);
    }

    public static SpannableStringBuilder g(int i7, CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (charSequence != null) {
            spannableStringBuilder.append(charSequence);
        }
        if (spannableStringBuilder.length() > 0) {
            spannableStringBuilder.append((CharSequence) ", ");
        }
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.gd.N0(i7, null));
        return spannableStringBuilder;
    }

    public static CharSequence h(p50 p50Var, e4 e4Var, z2 z2Var) {
        StaticLayout staticLayout;
        if (z2Var != null && (staticLayout = z2Var.d) != null) {
            SpannableStringBuilder spannableStringBuilder = z2Var.E;
            if (spannableStringBuilder != null) {
                return spannableStringBuilder;
            }
            CharSequence text = staticLayout.getText();
            if (!(text instanceof Spannable)) {
                return text;
            }
            Spannable spannable = (Spannable) text;
            org.telegram.ui.Components.az0[] az0VarArr = (org.telegram.ui.Components.az0[]) spannable.getSpans(0, spannable.length(), org.telegram.ui.Components.az0.class);
            SpannableStringBuilder spannableStringBuilder2 = text;
            if (az0VarArr != null) {
                spannableStringBuilder2 = text;
                if (az0VarArr.length != 0) {
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannable);
                    for (org.telegram.ui.Components.az0 az0Var : az0VarArr) {
                        int spanStart = spannableStringBuilder3.getSpanStart(az0Var);
                        int spanEnd = spannableStringBuilder3.getSpanEnd(az0Var);
                        if (spanStart >= 0 && spanEnd > spanStart) {
                            spannableStringBuilder3.setSpan(new org.telegram.messenger.v(p50Var, e4Var, az0Var, 1), spanStart, spanEnd, 33);
                        }
                    }
                    z2Var.E = spannableStringBuilder3;
                    spannableStringBuilder2 = spannableStringBuilder3;
                }
            }
            return spannableStringBuilder2;
        }
        return null;
    }

    public static TL_iv.PageBlock h0(TL_iv.PageBlock pageBlock, u3 u3Var) {
        if (pageBlock instanceof w3) {
            w3 w3Var = (w3) pageBlock;
            w3 w3Var2 = new w3();
            w3Var2.f53092a = w3Var.f53092a;
            w3Var2.f53093b = w3Var.f53093b;
            w3Var2.f53094c = w3Var.f53094c;
            w3Var2.d = h0(w3Var.d, u3Var);
            return w3Var2;
        } else if (pageBlock instanceof y3) {
            y3 y3Var = (y3) pageBlock;
            y3 y3Var2 = new y3();
            y3Var2.f54167a = y3Var.f54167a;
            y3Var2.f54168b = y3Var.f54168b;
            y3Var2.f54169c = y3Var.f54169c;
            y3Var2.d = h0(y3Var.d, u3Var);
            return y3Var2;
        } else {
            return u3Var;
        }
    }

    public static boolean j(org.telegram.ui.p50 r25, org.telegram.ui.e4 r26, android.view.MotionEvent r27, android.view.View r28, org.telegram.ui.z2 r29, int r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g4.j(org.telegram.ui.p50, org.telegram.ui.e4, android.view.MotionEvent, android.view.View, org.telegram.ui.z2, int, int):boolean");
    }

    public static org.telegram.ui.z2 n(org.telegram.ui.p50 r19, android.view.View r20, java.lang.CharSequence r21, org.telegram.tgnet.tl.TL_iv.RichText r22, int r23, int r24, org.telegram.tgnet.tl.TL_iv.PageBlock r25, android.text.Layout.Alignment r26, int r27, org.telegram.ui.e4 r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g4.n(org.telegram.ui.p50, android.view.View, java.lang.CharSequence, org.telegram.tgnet.tl.TL_iv$RichText, int, int, org.telegram.tgnet.tl.TL_iv$PageBlock, android.text.Layout$Alignment, int, org.telegram.ui.e4):org.telegram.ui.z2");
    }

    public static z2 o(p50 p50Var, View view, CharSequence charSequence, TL_iv.RichText richText, int i7, int i10, TL_iv.PageBlock pageBlock, e4 e4Var) {
        return n(p50Var, view, charSequence, richText, i7, i10, pageBlock, Layout.Alignment.ALIGN_NORMAL, 0, e4Var);
    }

    public static void p(p50 p50Var, boolean z10) {
        int i7;
        if (f48053s1 == null) {
            f48053s1 = new Paint();
            f48052r1 = new Paint();
            Paint paint = new Paint(1);
            f48055u1 = paint;
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            f48055u1.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
            Paint paint2 = new Paint();
            f48056v1 = paint2;
            paint2.setStyle(style);
            f48056v1.setStrokeWidth(org.telegram.messenger.g0.L(1.0f) / 2.0f);
            f48057w1 = new Paint();
            f48058x1 = new Paint();
            f48059y1 = new Paint();
            f48060z1 = new Paint(1);
            A1 = new Paint(1);
            f48051q1 = new Paint();
            f48054t1 = new Paint();
            B1 = new Paint(1);
        } else if (!z10) {
            return;
        }
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29451d6, false);
        float green = Color.green(x02) * 0.7152f;
        float y10 = com.google.android.gms.internal.vision.e2.y(Color.blue(x02), 0.0722f, green + (Color.red(x02) * 0.2126f), 255.0f);
        Paint paint3 = A1;
        if (y10 <= 0.705f) {
            i7 = -3041234;
        } else {
            i7 = -6551;
        }
        paint3.setColor(i7);
        Paint paint4 = f48060z1;
        int i10 = org.telegram.ui.ActionBar.n6.K6;
        paint4.setColor(org.telegram.ui.ActionBar.n6.x0(null, i10, false) & 872415231);
        f48060z1.setPathEffect(org.telegram.ui.Components.e80.c());
        f48059y1.setColor(org.telegram.ui.ActionBar.n6.x0(null, i10, false) & 872415231);
        f48059y1.setPathEffect(org.telegram.ui.Components.e80.c());
        Paint paint5 = f48056v1;
        int i11 = org.telegram.ui.ActionBar.n6.f29580k6;
        paint5.setColor(org.telegram.ui.ActionBar.n6.x0(null, i11, false));
        f48055u1.setColor(org.telegram.ui.ActionBar.n6.x0(null, i11, false));
        f48051q1.setColor(251658240);
        f48054t1.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29452d7, false));
        B1.setColor(org.telegram.ui.ActionBar.n6.x0(null, i10, false) & 872415231);
        B1.setPathEffect(org.telegram.ui.Components.e80.c());
        int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.M6, false);
        int red = Color.red(x03);
        int green2 = Color.green(x03);
        int blue = Color.blue(x03);
        f48058x1.setColor(Color.argb(20, red, green2, blue));
        f48057w1.setColor(Color.argb(34, red, green2, blue));
        int x04 = org.telegram.ui.ActionBar.n6.x0(null, i10, false);
        f48052r1.setColor(Color.argb(20, Color.red(x04), Color.green(x04), Color.blue(x04)));
        f48053s1.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ld, false));
    }

    public static void s(Canvas canvas, p50 p50Var, TL_iv.PageBlock pageBlock, int i7) {
        int i10;
        int L;
        int L2;
        if (pageBlock != null && p50Var != null && f48053s1 != null) {
            int i11 = 0;
            if (pageBlock.bottom) {
                i10 = org.telegram.messenger.g0.L(6.0f);
            } else {
                i10 = 0;
            }
            int i12 = i7 - i10;
            int i13 = pageBlock.quoteLevels;
            if (i13 == 0) {
                if (pageBlock.level > 0) {
                    canvas.drawRect(org.telegram.messenger.g0.L(18), 0.0f, org.telegram.messenger.g0.L(2.0f) + L2, i12, f48053s1);
                    return;
                }
                return;
            }
            while (i13 != 0) {
                if ((i13 & 1) != 0) {
                    canvas.drawRect(org.telegram.messenger.g0.L((i11 * 14) + 18), 0.0f, org.telegram.messenger.g0.L(2.0f) + L, i12, f48053s1);
                }
                i13 >>>= 1;
                i11++;
            }
        }
    }

    public static void t(org.telegram.ui.p50 r2, android.graphics.Canvas r3, org.telegram.ui.Cells.h9 r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g4.t(org.telegram.ui.p50, android.graphics.Canvas, org.telegram.ui.Cells.h9, int):void");
    }

    public static TL_iv.RichText u(int i7, TL_iv.PageBlock pageBlock) {
        if (i7 == 2) {
            TL_iv.RichText u10 = u(0, pageBlock);
            if (u10 instanceof TL_iv.textEmpty) {
                u10 = null;
            }
            TL_iv.RichText u11 = u(1, pageBlock);
            if (u11 instanceof TL_iv.textEmpty) {
                u11 = null;
            }
            if (u10 != null && u11 == null) {
                return u10;
            }
            if (u10 == null && u11 != null) {
                return u11;
            }
            if (u10 != null && u11 != null) {
                TL_iv.textPlain textplain = new TL_iv.textPlain();
                textplain.text = " ";
                TL_iv.textConcat textconcat = new TL_iv.textConcat();
                textconcat.texts.add(u10);
                textconcat.texts.add(textplain);
                textconcat.texts.add(u11);
                return textconcat;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockEmbedPost) {
            TL_iv.pageBlockEmbedPost pageblockembedpost = (TL_iv.pageBlockEmbedPost) pageBlock;
            if (i7 == 0) {
                return pageblockembedpost.caption.text;
            }
            if (i7 == 1) {
                return pageblockembedpost.caption.credit;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
            TL_iv.pageBlockSlideshow pageblockslideshow = (TL_iv.pageBlockSlideshow) pageBlock;
            if (i7 == 0) {
                return pageblockslideshow.caption.text;
            }
            if (i7 == 1) {
                return pageblockslideshow.caption.credit;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            TL_iv.pageBlockPhoto pageblockphoto = (TL_iv.pageBlockPhoto) pageBlock;
            if (i7 == 0) {
                return pageblockphoto.caption.text;
            }
            if (i7 == 1) {
                return pageblockphoto.caption.credit;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockCollage) {
            TL_iv.pageBlockCollage pageblockcollage = (TL_iv.pageBlockCollage) pageBlock;
            if (i7 == 0) {
                return pageblockcollage.caption.text;
            }
            if (i7 == 1) {
                return pageblockcollage.caption.credit;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockEmbed) {
            TL_iv.pageBlockEmbed pageblockembed = (TL_iv.pageBlockEmbed) pageBlock;
            if (i7 == 0) {
                return pageblockembed.caption.text;
            }
            if (i7 == 1) {
                return pageblockembed.caption.credit;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            return ((TL_iv.pageBlockBlockquote) pageBlock).caption;
        } else {
            if (pageBlock instanceof TL_iv.pageBlockVideo) {
                TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
                if (i7 == 0) {
                    return pageblockvideo.caption.text;
                }
                if (i7 == 1) {
                    return pageblockvideo.caption.credit;
                }
            } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                return ((TL_iv.pageBlockPullquote) pageBlock).caption;
            } else {
                if (pageBlock instanceof TL_iv.pageBlockAudio) {
                    TL_iv.pageBlockAudio pageblockaudio = (TL_iv.pageBlockAudio) pageBlock;
                    if (i7 == 0) {
                        return pageblockaudio.caption.text;
                    }
                    if (i7 == 1) {
                        return pageblockaudio.caption.credit;
                    }
                } else if (pageBlock instanceof TL_iv.pageBlockCover) {
                    return u(i7, ((TL_iv.pageBlockCover) pageBlock).cover);
                } else {
                    if (pageBlock instanceof TL_iv.pageBlockMap) {
                        TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock;
                        if (i7 == 0) {
                            return pageblockmap.caption.text;
                        }
                        if (i7 == 1) {
                            return pageblockmap.caption.credit;
                        }
                    }
                }
            }
        }
        return null;
    }

    public static g4 v() {
        g4 g4Var;
        g4 g4Var2 = f48041e1;
        if (g4Var2 == null) {
            synchronized (g4.class) {
                try {
                    g4Var = f48041e1;
                    if (g4Var == null) {
                        g4Var = new g4();
                        f48041e1 = g4Var;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return g4Var;
        }
        return g4Var2;
    }

    public static View w(View view) {
        org.telegram.ui.Components.mj0 mj0Var;
        if (view instanceof v1) {
            org.telegram.ui.Components.mj0 mj0Var2 = ((v1) view).d;
            if (mj0Var2 != null) {
                return w(mj0Var2.f59245a);
            }
            return view;
        } else if ((view instanceof y1) && (mj0Var = ((y1) view).d) != null) {
            return w(mj0Var.f59245a);
        } else {
            return view;
        }
    }

    public static TL_iv.PageBlock x(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof w3) {
            TL_iv.PageBlock pageBlock2 = ((w3) pageBlock).d;
            if (pageBlock2 != null) {
                return x(pageBlock2);
            }
            return pageBlock2;
        } else if (pageBlock instanceof y3) {
            TL_iv.PageBlock pageBlock3 = ((y3) pageBlock).d;
            if (pageBlock3 != null) {
                return x(pageBlock3);
            }
            return pageBlock3;
        } else {
            return pageBlock;
        }
    }

    public static TL_iv.RichText y(TL_iv.RichText richText) {
        if (richText == null) {
            return null;
        }
        if (richText instanceof TL_iv.textFixed) {
            return y(((TL_iv.textFixed) richText).text);
        }
        if (richText instanceof TL_iv.textItalic) {
            return y(((TL_iv.textItalic) richText).text);
        }
        if (richText instanceof TL_iv.textBold) {
            return y(((TL_iv.textBold) richText).text);
        }
        if (richText instanceof TL_iv.textUnderline) {
            return y(((TL_iv.textUnderline) richText).text);
        }
        if (richText instanceof TL_iv.textStrike) {
            return y(((TL_iv.textStrike) richText).text);
        }
        if (richText instanceof TL_iv.textEmail) {
            return y(((TL_iv.textEmail) richText).text);
        }
        if (richText instanceof TL_iv.textUrl) {
            return y(((TL_iv.textUrl) richText).text);
        }
        if (richText instanceof TL_iv.textAnchor) {
            y(((TL_iv.textAnchor) richText).text);
            return richText;
        } else if (richText instanceof TL_iv.textSubscript) {
            return y(((TL_iv.textSubscript) richText).text);
        } else {
            if (richText instanceof TL_iv.textSuperscript) {
                return y(((TL_iv.textSuperscript) richText).text);
            }
            if (richText instanceof TL_iv.textMarked) {
                return y(((TL_iv.textMarked) richText).text);
            }
            if (richText instanceof TL_iv.textPhone) {
                return y(((TL_iv.textPhone) richText).text);
            }
            if (richText instanceof TL_iv.textSpoiler) {
                return y(((TL_iv.textSpoiler) richText).text);
            }
            return richText;
        }
    }

    public static CharSequence z(TL_iv.RichText richText) {
        if (richText == null) {
            return "";
        }
        if (richText instanceof TL_iv.textFixed) {
            return z(((TL_iv.textFixed) richText).text);
        }
        if (richText instanceof TL_iv.textItalic) {
            return z(((TL_iv.textItalic) richText).text);
        }
        if (richText instanceof TL_iv.textBold) {
            return z(((TL_iv.textBold) richText).text);
        }
        if (richText instanceof TL_iv.textUnderline) {
            return z(((TL_iv.textUnderline) richText).text);
        }
        if (richText instanceof TL_iv.textStrike) {
            return z(((TL_iv.textStrike) richText).text);
        }
        if (richText instanceof TL_iv.textEmail) {
            return z(((TL_iv.textEmail) richText).text);
        }
        if (richText instanceof TL_iv.textUrl) {
            return z(((TL_iv.textUrl) richText).text);
        }
        if (richText instanceof TL_iv.textPlain) {
            return ((TL_iv.textPlain) richText).text;
        }
        if (richText instanceof TL_iv.textAnchor) {
            return z(((TL_iv.textAnchor) richText).text);
        }
        if (richText instanceof TL_iv.textEmpty) {
            return "";
        }
        if (richText instanceof TL_iv.textConcat) {
            StringBuilder sb2 = new StringBuilder();
            int size = richText.texts.size();
            for (int i7 = 0; i7 < size; i7++) {
                sb2.append(z(richText.texts.get(i7)));
            }
            return sb2;
        } else if (richText instanceof TL_iv.textSubscript) {
            return z(((TL_iv.textSubscript) richText).text);
        } else {
            if (richText instanceof TL_iv.textSuperscript) {
                return z(((TL_iv.textSuperscript) richText).text);
            }
            if (richText instanceof TL_iv.textMarked) {
                return z(((TL_iv.textMarked) richText).text);
            }
            if (!(richText instanceof TL_iv.textPhone)) {
                return "";
            }
            return z(((TL_iv.textPhone) richText).text);
        }
    }

    public final void E() {
        int color;
        int x02;
        int x03;
        boolean z10;
        float x10;
        ArrayList arrayList = this.f48068e0;
        int size = arrayList.size();
        t3 t3Var = this.L;
        boolean z11 = false;
        if (size <= 1) {
            ArticleViewer$WindowView articleViewer$WindowView = this.f48070g0;
            articleViewer$WindowView.f30420e = false;
            articleViewer$WindowView.d = false;
            k0 k0Var = this.f48071h0;
            if (t3Var != null) {
                x10 = t3Var.J * t3Var.f52222c.getWidth();
            } else {
                x10 = k0Var.getX();
            }
            AnimatorSet animatorSet = new AnimatorSet();
            float measuredWidth = k0Var.getMeasuredWidth() - x10;
            if (t3Var != null) {
                animatorSet.playTogether(t3Var.l(1.0f));
            } else {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.f48071h0, View.TRANSLATION_X, k0Var.getMeasuredWidth()), ObjectAnimator.ofFloat(this.f48070g0, f48042f1, k0Var.getMeasuredWidth()));
            }
            animatorSet.setDuration(Math.max((int) ((420.0f / k0Var.getMeasuredWidth()) * measuredWidth), 250));
            animatorSet.setInterpolator(org.telegram.ui.Components.kr.h);
            animatorSet.addListener(new s0(this));
            animatorSet.start();
            this.V0 = true;
            return;
        }
        ArticleViewer$WindowView articleViewer$WindowView2 = this.f48070g0;
        articleViewer$WindowView2.f30421f = true;
        articleViewer$WindowView2.f30420e = true;
        articleViewer$WindowView2.h = this.K0;
        this.f48084v0[1].setVisibility(0);
        this.f48084v0[1].setAlpha(1.0f);
        this.f48084v0[1].setTranslationX(0.0f);
        k3 k3Var = this.f48084v0[0];
        if (t3Var == null) {
            color = 0;
        } else {
            color = this.m0.getColor();
        }
        k3Var.setBackgroundColor(color);
        c0(-1, arrayList.get(arrayList.size() - 2), true);
        k3 k3Var2 = this.f48084v0[0];
        k3Var2.getX();
        AnimatorSet animatorSet2 = new AnimatorSet();
        k3Var2.getMeasuredWidth();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f48084v0[0], View.TRANSLATION_X, k3Var2.getMeasuredWidth()));
        animatorSet2.setDuration(420L);
        animatorSet2.setInterpolator(org.telegram.ui.Components.kr.h);
        animatorSet2.addListener(new t0(this));
        animatorSet2.start();
        l0 l0Var = this.f48072i0;
        k3 k3Var3 = this.f48084v0[0];
        if (k3Var3 != null && org.telegram.messenger.bz.f23328v0) {
            x02 = k3Var3.getBackgroundColor();
        } else {
            x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Gl, false);
        }
        l0Var.setMenuColors(x02);
        l0 l0Var2 = this.f48072i0;
        k3 k3Var4 = this.f48084v0[0];
        if (k3Var4 != null && org.telegram.messenger.bz.f23328v0) {
            x03 = k3Var4.getActionBarColor();
        } else {
            x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Gl, false);
        }
        l0Var2.d(x03, true);
        l0 l0Var3 = this.f48072i0;
        k3 k3Var5 = this.f48084v0[0];
        if (k3Var5 != null && k3Var5.e()) {
            z10 = true;
        } else {
            z10 = false;
        }
        l0Var3.setIsTonsite(z10);
        l0 l0Var4 = this.f48072i0;
        k3 k3Var6 = this.f48084v0[0];
        if (k3Var6 != null && k3Var6.d()) {
            z11 = true;
        }
        l0Var4.setIsLocal(z11);
        this.V0 = true;
    }

    public final void F(int i7) {
        int color;
        int x02;
        int x03;
        boolean z10;
        float x10;
        ArrayList arrayList = this.f48068e0;
        int size = arrayList.size();
        t3 t3Var = this.L;
        boolean z11 = false;
        if (size <= 1) {
            ArticleViewer$WindowView articleViewer$WindowView = this.f48070g0;
            articleViewer$WindowView.f30420e = false;
            articleViewer$WindowView.d = false;
            k0 k0Var = this.f48071h0;
            if (t3Var != null) {
                x10 = t3Var.J * t3Var.f52222c.getWidth();
            } else {
                x10 = k0Var.getX();
            }
            AnimatorSet animatorSet = new AnimatorSet();
            float measuredWidth = k0Var.getMeasuredWidth() - x10;
            if (t3Var != null) {
                animatorSet.playTogether(t3Var.l(1.0f));
            } else {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.f48071h0, View.TRANSLATION_X, k0Var.getMeasuredWidth()), ObjectAnimator.ofFloat(this.f48070g0, f48042f1, k0Var.getMeasuredWidth()));
            }
            animatorSet.setDuration(Math.max((int) ((420.0f / k0Var.getMeasuredWidth()) * measuredWidth), 250));
            animatorSet.setInterpolator(org.telegram.ui.Components.kr.h);
            animatorSet.addListener(new u0(this));
            animatorSet.start();
            this.V0 = true;
            return;
        }
        this.f48070g0.f30421f = true;
        this.f48084v0[1].setVisibility(0);
        this.f48084v0[1].setAlpha(1.0f);
        this.f48084v0[1].setTranslationX(0.0f);
        k3 k3Var = this.f48084v0[0];
        if (t3Var == null) {
            color = 0;
        } else {
            color = this.m0.getColor();
        }
        k3Var.setBackgroundColor(color);
        c0(-1, arrayList.get(i7), true);
        k3 k3Var2 = this.f48084v0[0];
        k3Var2.getX();
        AnimatorSet animatorSet2 = new AnimatorSet();
        k3Var2.getMeasuredWidth();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f48084v0[0], View.TRANSLATION_X, k3Var2.getMeasuredWidth()));
        animatorSet2.setDuration(420L);
        animatorSet2.setInterpolator(org.telegram.ui.Components.kr.h);
        animatorSet2.addListener(new v0(this, i7));
        animatorSet2.start();
        l0 l0Var = this.f48072i0;
        k3 k3Var3 = this.f48084v0[0];
        if (k3Var3 != null && org.telegram.messenger.bz.f23328v0) {
            x02 = k3Var3.getBackgroundColor();
        } else {
            x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Gl, false);
        }
        l0Var.setMenuColors(x02);
        l0 l0Var2 = this.f48072i0;
        k3 k3Var4 = this.f48084v0[0];
        if (k3Var4 != null && org.telegram.messenger.bz.f23328v0) {
            x03 = k3Var4.getActionBarColor();
        } else {
            x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Gl, false);
        }
        l0Var2.d(x03, true);
        l0 l0Var3 = this.f48072i0;
        k3 k3Var5 = this.f48084v0[0];
        if (k3Var5 != null && k3Var5.e()) {
            z10 = true;
        } else {
            z10 = false;
        }
        l0Var3.setIsTonsite(z10);
        l0 l0Var4 = this.f48072i0;
        k3 k3Var6 = this.f48084v0[0];
        if (k3Var6 != null && k3Var6.d()) {
            z11 = true;
        }
        l0Var4.setIsLocal(z11);
        this.V0 = true;
    }

    public final boolean H() {
        ArrayList arrayList = this.f48068e0;
        if (arrayList.size() <= 0 || !(arrayList.get(0) instanceof TLRPC.WebPage)) {
            return false;
        }
        return true;
    }

    public final void K() {
        this.W = false;
        int i7 = 0;
        while (true) {
            k3[] k3VarArr = this.f48084v0;
            if (i7 < k3VarArr.length) {
                k3VarArr[i7].b();
                i7++;
            } else {
                try {
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
        }
        this.M.getWindow().clearFlags(128);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.O;
            if (i10 < arrayList.size()) {
                ((q1) arrayList.get(i10)).a(false);
                i10++;
            } else {
                this.f48071h0.post(new z(this, 0));
                org.telegram.messenger.ks.f(this.Y).k(org.telegram.messenger.ks.f25199d1, new Object[0]);
                return;
            }
        }
    }

    public final boolean L(org.telegram.messenger.fj fjVar, TLRPC.WebPage webPage, String str, String str2) {
        TLRPC.WebPage webPage2;
        boolean z10;
        int lastIndexOf;
        String substring;
        boolean z11;
        ?? r52;
        String str3;
        int i7;
        String lowerCase;
        TL_iv.Page page;
        if (this.M == null) {
            return false;
        }
        t3 t3Var = this.L;
        if (t3Var == null && this.W) {
            return false;
        }
        org.telegram.ui.ActionBar.g2 g2Var = this.N;
        if (g2Var != null && (g2Var.getParentLayout() instanceof ActionBarLayout)) {
            org.telegram.messenger.g0.v1((ActionBarLayout) this.N.getParentLayout());
        }
        if (fjVar != null) {
            if (webPage == null) {
                webPage2 = fjVar.f24073k.media.webpage;
            } else {
                webPage2 = webPage;
            }
            if (webPage2 != null && (page = webPage2.cached_page) != null && page.local != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            for (int i10 = 0; i10 < fjVar.f24073k.entities.size(); i10++) {
                TLRPC.MessageEntity messageEntity = fjVar.f24073k.entities.get(i10);
                if (messageEntity instanceof TLRPC.TL_messageEntityUrl) {
                    try {
                        String str4 = fjVar.f24073k.message;
                        int i11 = messageEntity.offset;
                        String lowerCase2 = str4.substring(i11, messageEntity.length + i11).toLowerCase();
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
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
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
        ArrayList arrayList = this.f48068e0;
        if (t3Var != null && !arrayList.isEmpty()) {
            z11 = z10;
            r52 = 1;
        } else {
            z11 = z10;
            r52 = 0;
        }
        if (r52 == 0) {
            arrayList.clear();
            this.f48071h0.setTranslationX(0.0f);
            if (t3Var != null) {
                t3Var.J = 0.0f;
                t3Var.f52222c.invalidate();
                t3Var.u();
                t3Var.r();
            }
            this.f48071h0.setTranslationY(0.0f);
            this.f48084v0[0].setTranslationY(0.0f);
            this.f48084v0[0].setTranslationX(0.0f);
            this.f48084v0[1].setTranslationX(0.0f);
            this.f48084v0[0].setAlpha(1.0f);
            this.f48070g0.setInnerTranslationX(0.0f);
            this.f48084v0[0].g();
            V(org.telegram.messenger.g0.L(56.0f));
        }
        if (t3Var != null && org.telegram.ui.web.v0.R0) {
            t3Var.f52220a.d();
        }
        if (webPage2 != null) {
            boolean f10 = f(webPage2, substring, r52);
            if (!z11) {
                if (!f10 && substring != null) {
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
                if (fjVar != null) {
                    i7 = fjVar.K1;
                } else {
                    i7 = org.telegram.messenger.i10.f24637t0;
                }
                int i12 = i7;
                ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getWebPage, new g0(this, i12, webPage2, fjVar, (boolean) r52, str3));
            }
        } else {
            e(r52, str2);
        }
        l0 l0Var = this.f48072i0;
        if (l0Var != null && r52 == 0) {
            l0Var.setIsLocal(this.f48084v0[0].d());
        }
        this.U = null;
        if (t3Var != null) {
            if (r52 == 0) {
                org.telegram.messenger.g0.E2(this.f48070g0);
                t3Var.d = this.f48070g0;
                t3Var.A();
                t3Var.f52222c.addView(this.f48070g0, c8.na.c(-1.0f, -1));
            }
        } else if (!this.W) {
            WindowManager windowManager = (WindowManager) this.M.getSystemService("window");
            if (this.X) {
                try {
                    windowManager.removeView(this.f48070g0);
                } catch (Exception unused) {
                }
            }
            try {
                WindowManager.LayoutParams layoutParams = this.f48069f0;
                layoutParams.flags = -2013200384;
                if (Build.VERSION.SDK_INT >= 28) {
                    layoutParams.layoutInDisplayCutoutMode = 1;
                }
                this.f48070g0.setFocusable(false);
                this.f48071h0.setFocusable(false);
                windowManager.addView(this.f48070g0, this.f48069f0);
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
                return false;
            }
        } else {
            this.f48069f0.flags &= -17;
            ((WindowManager) this.M.getSystemService("window")).updateViewLayout(this.f48070g0, this.f48069f0);
        }
        this.W = true;
        this.f48061a0 = 1;
        if (r52 == 0) {
            if (t3Var != null) {
                if (r52 != 0) {
                    t3Var.f52220a.e();
                } else if (!t3Var.h) {
                    t3Var.q(t3Var.f52221b);
                    t3Var.o();
                }
            } else {
                this.f48070g0.setAlpha(0.0f);
                this.f48071h0.setAlpha(0.0f);
                AnimatorSet animatorSet = new AnimatorSet();
                ArticleViewer$WindowView articleViewer$WindowView = this.f48070g0;
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(articleViewer$WindowView, property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f48071h0, property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f48070g0, View.TRANSLATION_X, org.telegram.messenger.g0.L(56.0f), 0.0f));
                this.f48063b0 = new z(this, 1);
                animatorSet.setDuration(150L);
                animatorSet.setInterpolator(this.f48067d0);
                animatorSet.addListener(new p0(this));
                this.f48065c0 = System.currentTimeMillis();
                org.telegram.messenger.g0.g3(new n2.c0(26, this, animatorSet));
            }
        }
        this.f48071h0.setLayerType(2, null);
        return true;
    }

    public final void N(long j3, TLRPC.User user) {
        if (user != null && (this.M instanceof LaunchActivity)) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f28641id);
            bundle.putString("botUser", "webpage" + j3);
            ((LaunchActivity) this.M).u0(new bn(bundle), false, true);
            m(false, true);
        }
    }

    public final void O(String str, String str2, j0 j0Var) {
        Activity activity = this.M;
        if (activity != null && !activity.isFinishing()) {
            k3 k3Var = this.f48084v0[0];
            if (k3Var != null && k3Var.d()) {
                String N0 = org.telegram.messenger.gd.N0(2131747588, null);
                int indexOf = N0.indexOf("%");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(String.format(N0, str));
                if (indexOf >= 0) {
                    spannableStringBuilder.setSpan(new URLSpan(str), indexOf, str.length() + indexOf, 33);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.M, null);
                String N02 = org.telegram.messenger.gd.N0(2131747585, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                t1Var.S = N02;
                t1Var.U = spannableStringBuilder;
                t1Var.f30089i0 = false;
                alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131747623, null), new a1.d(this, str, str2, j0Var, 6));
                alertDialog$Builder.p();
                return;
            }
            P(str, str2, j0Var);
        }
    }

    public final void P(String str, String str2, vf.b bVar) {
        t3 t3Var;
        vf.b bVar2 = this.O0;
        if (bVar2 != null) {
            bVar2.a(false);
        }
        this.O0 = bVar;
        if (this.H0 != 0) {
            ConnectionsManager.getInstance(this.Y).cancelRequest(this.H0, false);
            this.H0 = 0;
        }
        boolean[] zArr = new boolean[1];
        if (vf.c.m(this.M, str, false)) {
            if (this.f48068e0.isEmpty() && (t3Var = this.L) != null) {
                t3Var.a(false);
                return;
            }
            return;
        }
        e0 e0Var = new e0(this, str, zArr, bVar);
        int i7 = this.J0 + 1;
        this.J0 = i7;
        Z(true);
        TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
        tL_messages_getWebPage.url = str;
        tL_messages_getWebPage.hash = 0;
        this.H0 = ConnectionsManager.getInstance(this.Y).sendRequest(tL_messages_getWebPage, new org.telegram.messenger.gx(this, i7, bVar, str2, e0Var, tL_messages_getWebPage));
        if (bVar != null) {
            bVar.f59502b = new f0(this, i7, bVar, 0);
            bVar.d();
        }
    }

    public final void Q() {
        int x02;
        int x03;
        TextView textView = this.D0;
        if (textView != null) {
            int i7 = org.telegram.ui.ActionBar.n6.f29543i6;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.x0(null, i7, false), 2, -1);
            org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i7);
            textView.setBackground(h02);
            org.telegram.ui.ActionBar.u6.j(textView, h02, null, M, null);
            org.telegram.ui.ActionBar.u6.U(this.D0, org.telegram.ui.ActionBar.n6.E8, null);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.C0;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, null);
        }
        ImageView imageView = this.f48081s0;
        if (imageView != null) {
            org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.G6, null, PorterDuff.Mode.MULTIPLY);
            ImageView imageView2 = this.f48081s0;
            int i10 = org.telegram.ui.ActionBar.n6.f29864z8;
            org.telegram.ui.ActionBar.u6.Q(imageView2, org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.x0(null, i10, false), 1, -1), null, org.telegram.ui.ActionBar.u6.M(i10), null);
        }
        ImageView imageView3 = this.f48082t0;
        if (imageView3 != null) {
            org.telegram.ui.ActionBar.u6.s(imageView3, org.telegram.ui.ActionBar.n6.G6, null, PorterDuff.Mode.MULTIPLY);
            ImageView imageView4 = this.f48082t0;
            int i11 = org.telegram.ui.ActionBar.n6.f29864z8;
            org.telegram.ui.ActionBar.u6.Q(imageView4, org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.x0(null, i11, false), 1, -1), null, org.telegram.ui.ActionBar.u6.M(i11), null);
        }
        org.telegram.ui.Components.n6 n6Var = this.f48083u0;
        if (n6Var != null) {
            org.telegram.ui.ActionBar.u6.Y(n6Var, org.telegram.ui.ActionBar.n6.G6, null);
        }
        l0 l0Var = this.f48072i0;
        if (l0Var != null) {
            k3 k3Var = this.f48084v0[0];
            if (k3Var != null && org.telegram.messenger.bz.f23328v0) {
                x02 = k3Var.getBackgroundColor();
            } else {
                x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Gl, false);
            }
            l0Var.setMenuColors(x02);
            l0 l0Var2 = this.f48072i0;
            k3 k3Var2 = this.f48084v0[0];
            if (k3Var2 != null && org.telegram.messenger.bz.f23328v0) {
                x03 = k3Var2.getActionBarColor();
            } else {
                x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Gl, false);
            }
            l0Var2.d(x03, true);
        }
        this.m0.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Gl, false));
    }

    public final void S() {
        int L0;
        int i7;
        boolean z10 = false;
        k3 k3Var = this.f48084v0[0];
        if (k3Var.f49289c.F != null && (L0 = k3Var.d.L0()) != -1) {
            View m10 = this.f48084v0[0].d.m(L0);
            if (m10 != null) {
                i7 = m10.getTop();
            } else {
                i7 = 0;
            }
            String str = "article" + this.f48084v0[0].f49289c.F.f28647id;
            SharedPreferences.Editor putInt = org.telegram.messenger.t0.f27013b.getSharedPreferences("articles", 0).edit().putInt(str, L0).putInt(str + "o", i7);
            String v = p5.c.v(str, "r");
            Point point = org.telegram.messenger.g0.f24226q;
            if (point.x > point.y) {
                z10 = true;
            }
            putInt.putBoolean(v, z10).commit();
        }
    }

    public final boolean T(String str, boolean z10) {
        String lowerCase;
        Integer num = 0;
        if (!TextUtils.isEmpty(str)) {
            String lowerCase2 = str.toLowerCase();
            Integer num2 = (Integer) this.f48084v0[0].f49289c.h.get(lowerCase2);
            if (num2 != null) {
                TL_iv.textAnchor textanchor = (TL_iv.textAnchor) this.f48084v0[0].f49289c.f47316r.get(lowerCase2);
                if (textanchor != null) {
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    if (!TextUtils.isEmpty(this.f48084v0[0].f49289c.F.cached_page.url)) {
                        lowerCase = this.f48084v0[0].f49289c.F.cached_page.url.toLowerCase();
                    } else {
                        lowerCase = this.f48084v0[0].f49289c.F.url.toLowerCase();
                    }
                    pageblockparagraph.text = org.telegram.ui.web.w1.d(textanchor.text, lowerCase, lowerCase2);
                    this.f48084v0[0].f49289c.getClass();
                    int I = e4.I(pageblockparagraph);
                    v4.f1 x10 = this.f48084v0[0].f49289c.x(null, I);
                    View view = x10.f59245a;
                    this.f48084v0[0].f49289c.H(I, x10, pageblockparagraph, 0, 0, false);
                    org.telegram.ui.ActionBar.w2 j3 = org.telegram.messenger.m10.j(this.M, false, 1, null);
                    j3.f30262v0 = false;
                    j3.f30264w0 = false;
                    LinearLayout linearLayout = new LinearLayout(this.M);
                    linearLayout.setOrientation(1);
                    org.telegram.ui.Cells.i9 i9Var = new org.telegram.ui.Cells.i9();
                    this.R0 = i9Var;
                    i9Var.S(linearLayout);
                    this.R0.D = new n0(this, 1);
                    int i7 = 5;
                    di.xb xbVar = new di.xb(this.M, 5);
                    xbVar.setTextSize(1, 16.0f);
                    xbVar.setTypeface(org.telegram.messenger.g0.o());
                    xbVar.setText(org.telegram.messenger.gd.N0(2131748999, null));
                    if (!this.f48084v0[0].f49289c.H) {
                        i7 = 3;
                    }
                    xbVar.setGravity(i7 | 16);
                    xbVar.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G6, false));
                    xbVar.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
                    linearLayout.addView(xbVar, new LinearLayout.LayoutParams(-1, org.telegram.messenger.g0.L(48.0f) + 1));
                    view.setTag("bottomSheet");
                    linearLayout.addView(view, c8.na.k(0.0f, 7.0f, 0.0f, 0.0f, -1, -2));
                    org.telegram.ui.Cells.u9 n10 = this.R0.n(this.M);
                    ai.h0 h0Var = new ai.h0(this, this.M, linearLayout, 10);
                    j3.f30269z0 = new h0(this, 0);
                    h0Var.addView(linearLayout, -1, -2);
                    h0Var.addView(n10, -1, -2);
                    j3.O = h0Var;
                    if (this.Q0.x()) {
                        this.Q0.f(false);
                    }
                    this.J = j3;
                    Y(j3);
                    return true;
                } else if (num2.intValue() >= 0 && num2.intValue() < this.f48084v0[0].f49289c.f47313e.size()) {
                    TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) this.f48084v0[0].f49289c.f47313e.get(num2.intValue());
                    TL_iv.PageBlock x11 = x(pageBlock);
                    if ((x11 instanceof u3) && M((u3) x11)) {
                        this.f48084v0[0].f49289c.M();
                        this.f48084v0[0].f49289c.f();
                    }
                    int indexOf = this.f48084v0[0].f49289c.d.indexOf(pageBlock);
                    if (indexOf != -1) {
                        num2 = Integer.valueOf(indexOf);
                    }
                    Integer num3 = (Integer) this.f48084v0[0].f49289c.f47315n.get(lowerCase2);
                    if (num3 != null) {
                        if (num3.intValue() == -1) {
                            this.f48084v0[0].f49289c.getClass();
                            int I2 = e4.I(pageBlock);
                            v4.f1 x12 = this.f48084v0[0].f49289c.x(null, I2);
                            this.f48084v0[0].f49289c.H(I2, x12, pageBlock, 0, 0, false);
                            x12.f59245a.measure(View.MeasureSpec.makeMeasureSpec(this.f48084v0[0].f49288b.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                            Integer num4 = (Integer) this.f48084v0[0].f49289c.f47315n.get(lowerCase2);
                            if (num4.intValue() != -1) {
                                num = num4;
                            }
                        } else {
                            num = num3;
                        }
                    }
                    if (this.f48084v0[0].f49289c.J) {
                        num2 = Integer.valueOf(num2.intValue() + 1);
                    }
                    if (z10) {
                        org.telegram.ui.Components.lu0 lu0Var = new org.telegram.ui.Components.lu0(this.f48084v0[0].getContext());
                        lu0Var.f59190a = num2.intValue();
                        lu0Var.f37227s = (-org.telegram.messenger.g0.L(56.0f)) - num.intValue();
                        this.f48084v0[0].d.w0(lu0Var);
                        return true;
                    }
                    this.f48084v0[0].d.h1(num2.intValue(), (-org.telegram.messenger.g0.L(56.0f)) - num.intValue());
                    return true;
                }
            }
        }
        return false;
    }

    public final void U(int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g4.U(int):void");
    }

    public final void V(int i7) {
        l0 l0Var = this.f48072i0;
        if (l0Var != null && !l0Var.U && !l0Var.f53410a0) {
            int j3 = Utilities.j(i7, org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(24.0f));
            this.K0 = j3;
            this.f48072i0.setHeight(j3);
            this.Q0.f32291x = this.K0;
            int i10 = 0;
            while (true) {
                k3[] k3VarArr = this.f48084v0;
                if (i10 < k3VarArr.length) {
                    k3VarArr[i10].f49288b.setTopGlowOffset(this.K0);
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void W(Activity activity, org.telegram.ui.ActionBar.g2 g2Var) {
        bg.v0 v0Var;
        int i7;
        boolean z10;
        int x02;
        int i10;
        t3 t3Var;
        bg.v0 v0Var2 = this.W0;
        if (v0Var2 != null) {
            v0Var2.a();
            this.W0 = null;
        }
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null) {
            v0Var = new bg.v0(launchActivity, true);
        } else {
            v0Var = null;
        }
        this.W0 = v0Var;
        this.N = g2Var;
        if (!(g2Var instanceof nx)) {
            i7 = g2Var.getCurrentAccount();
        } else {
            i7 = org.telegram.messenger.i10.f24637t0;
        }
        this.Y = i7;
        org.telegram.messenger.ks.f(i7).c(this, org.telegram.messenger.ks.f25205e2);
        org.telegram.messenger.ks.f(this.Y).c(this, org.telegram.messenger.ks.f25211f2);
        org.telegram.messenger.ks.f(this.Y).c(this, org.telegram.messenger.ks.f25217g2);
        org.telegram.messenger.ks.f(this.Y).c(this, org.telegram.messenger.ks.f25223h2);
        org.telegram.messenger.ks.f(this.Y).c(this, org.telegram.messenger.ks.f25247l4);
        Activity activity2 = this.M;
        if (activity2 != activity && (activity2 == null || !this.K || (t3Var = this.L) == null || t3Var.f52223e == null)) {
            this.M = activity;
            this.f50838a = org.telegram.messenger.t0.f27013b.getSharedPreferences("articles", 0).getInt("font_type", 0);
            p(this, false);
            this.m0 = new Paint();
            this.f48076n0 = activity.getResources().getDrawable(2131231623);
            this.f48077o0 = new Paint();
            ArticleViewer$WindowView articleViewer$WindowView = new ArticleViewer$WindowView(this, activity);
            this.f48070g0 = articleViewer$WindowView;
            articleViewer$WindowView.setWillNotDraw(false);
            this.f48070g0.setClipChildren(true);
            this.f48070g0.setFocusable(false);
            k0 k0Var = new k0(0, activity, this);
            this.f48071h0 = k0Var;
            this.f48070g0.addView(k0Var, c8.na.e(-1, -1, 51));
            if (this.L == null) {
                this.f48070g0.setFitsSystemWindows(true);
                this.f48071h0.setOnApplyWindowInsetsListener(new org.telegram.ui.ActionBar.x2(1));
            }
            FrameLayout frameLayout = new FrameLayout(activity);
            this.Q = frameLayout;
            frameLayout.setBackgroundColor(-16777216);
            this.Q.setVisibility(4);
            this.f48070g0.addView(this.Q, c8.na.c(-1.0f, -1));
            j4 j4Var = new j4(activity);
            this.S = j4Var;
            j4Var.setVisibility(0);
            this.S.setBackgroundColor(-16777216);
            this.Q.addView(this.S, c8.na.e(-1, -1, 17));
            this.R = new TextureView(activity);
            this.f48084v0 = new k3[2];
            int i11 = 0;
            while (true) {
                k3[] k3VarArr = this.f48084v0;
                int i12 = 8;
                if (i11 >= k3VarArr.length) {
                    break;
                }
                k3 k3Var = new k3(this, activity);
                k3VarArr[i11] = k3Var;
                if (i11 == 0) {
                    i12 = 0;
                }
                k3Var.setVisibility(i12);
                this.f48071h0.addView(k3Var, c8.na.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
                k3Var.f49288b.setOnItemLongClickListener(new s(this));
                k3Var.f49288b.setOnItemClickListener(new oi.f0(4, this, k3Var));
                i11++;
            }
            this.f48071h0.addView(new FrameLayout(activity), c8.na.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f48086x0.setColor(-16777216);
            this.f48087y0.setColor(-16777216);
            this.B0.setColor(-14408666);
            this.f48088z0.setColor(-16777216);
            l0 l0Var = new l0(this, activity);
            this.f48072i0 = l0Var;
            if (this.L != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            l0Var.f53419f0 = z10;
            this.f48071h0.addView(l0Var, c8.na.e(-1, -2, 48));
            this.f48072i0.setOnClickListener(new oi.i1(3, this, activity));
            this.f48072i0.f53414c0.addTextChangedListener(new m0(this, 0));
            org.telegram.ui.web.k kVar = new org.telegram.ui.web.k(activity);
            this.f48073j0 = kVar;
            kVar.setOpenProgress(0.0f);
            this.f48073j0.f53454x.j(new g3(this, 2));
            this.f48071h0.addView(this.f48073j0, c8.na.c(-1.0f, -1));
            this.f48074k0 = new z(this, 3);
            this.f48072i0.M.setOnClickListener(new r(this, 2));
            this.f48072i0.M.setOnLongClickListener(new t(this, 0));
            this.f48072i0.setMenuListener(new ki.n2(9, this, activity));
            this.f48072i0.P.setOnClickListener(new r(this, 3));
            bi.v2 v2Var = new bi.v2(this.M, 8);
            this.f48080r0 = v2Var;
            v2Var.setOnTouchListener(new gi.a(3));
            this.f48080r0.setWillNotDraw(false);
            this.f48080r0.setTranslationY(org.telegram.messenger.g0.L(51.0f));
            this.f48080r0.setVisibility(4);
            this.f48080r0.setFocusable(true);
            this.f48080r0.setFocusableInTouchMode(true);
            this.f48080r0.setClickable(true);
            this.f48080r0.setPadding(0, org.telegram.messenger.g0.L(3.0f), 0, 0);
            this.f48071h0.addView(this.f48080r0, c8.na.e(-1, 51, 80));
            new hi.x3(this.f48070g0, false, new q(this, 0));
            ImageView imageView = new ImageView(this.M);
            this.f48081s0 = imageView;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            this.f48081s0.setImageResource(2131232179);
            ImageView imageView2 = this.f48081s0;
            int i13 = org.telegram.ui.ActionBar.n6.G6;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.u6.s(imageView2, i13, null, mode);
            ImageView imageView3 = this.f48081s0;
            int i14 = org.telegram.ui.ActionBar.n6.f29864z8;
            org.telegram.ui.ActionBar.u6.Q(imageView3, org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.x0(null, i14, false), 1, -1), null, org.telegram.ui.ActionBar.u6.M(i14), null);
            this.f48080r0.addView(this.f48081s0, c8.na.d(48, 48.0f, 53, 0.0f, 0.0f, 48.0f, 0.0f));
            this.f48081s0.setOnClickListener(new r(this, 0));
            this.f48081s0.setContentDescription(org.telegram.messenger.gd.N0(2131754778, null));
            ImageView imageView4 = new ImageView(this.M);
            this.f48082t0 = imageView4;
            imageView4.setScaleType(scaleType);
            this.f48082t0.setImageResource(2131232178);
            org.telegram.ui.ActionBar.u6.s(this.f48082t0, i13, null, mode);
            org.telegram.ui.ActionBar.u6.Q(this.f48082t0, org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.x0(null, i14, false), 1, -1), null, org.telegram.ui.ActionBar.u6.M(i14), null);
            this.f48080r0.addView(this.f48082t0, c8.na.d(48, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f48082t0.setOnClickListener(new r(this, 1));
            this.f48082t0.setContentDescription(org.telegram.messenger.gd.N0(2131754777, null));
            org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(this.M, true, true, true);
            this.f48083u0 = n6Var;
            n6Var.setScaleProperty(0.6f);
            this.f48083u0.b(0.4f, 350L, org.telegram.ui.Components.kr.h);
            org.telegram.ui.ActionBar.u6.Y(this.f48083u0, i13, null);
            this.f48083u0.setTextSize(org.telegram.messenger.g0.L(15.0f));
            this.f48083u0.setTypeface(org.telegram.messenger.g0.o());
            this.f48083u0.setGravity(3);
            this.f48083u0.getDrawable().N = org.telegram.messenger.g0.f24226q.x;
            this.f48080r0.addView(this.f48083u0, c8.na.d(-2, -2.0f, 19, 18.0f, 0.0f, 108.0f, 0.0f));
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.f48069f0 = layoutParams;
            layoutParams.height = -1;
            layoutParams.format = -3;
            layoutParams.width = -1;
            layoutParams.gravity = 51;
            layoutParams.type = 98;
            layoutParams.softInputMode = 48;
            layoutParams.flags = 131072;
            if (this.L == null) {
                x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29394a7, true);
            } else {
                x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29394a7, false);
            }
            if (org.telegram.messenger.g0.B(x02) >= 0.721f && Build.VERSION.SDK_INT >= 26) {
                i10 = 1808;
            } else {
                i10 = 1792;
            }
            this.f48088z0.setColor(x02);
            this.A0 = true;
            WindowManager.LayoutParams layoutParams2 = this.f48069f0;
            layoutParams2.systemUiVisibility = i10;
            layoutParams2.flags |= -2147417856;
            if (Build.VERSION.SDK_INT >= 28) {
                layoutParams2.layoutInDisplayCutoutMode = 1;
            }
            org.telegram.ui.Cells.i9 i9Var = new org.telegram.ui.Cells.i9();
            this.Q0 = i9Var;
            i9Var.S(this.f48084v0[0].f49288b);
            if (org.telegram.messenger.mp.u1(this.Y).f25882v7.s()) {
                this.Q0.f32276k0 = new s(this);
            }
            org.telegram.ui.Cells.i9 i9Var2 = this.Q0;
            i9Var2.f30933z0 = this.f48084v0[0].d;
            i9Var2.D = new n0(this, 0);
            this.f48071h0.addView(i9Var2.n(activity));
            k0 k0Var2 = this.f48071h0;
            fr0 fr0Var = new fr0(k0Var2, k0Var2);
            this.S0 = fr0Var;
            fr0Var.F = new s(this);
            fr0Var.E = new f(this, 1);
            this.m0.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Gl, false));
            e0(this);
            return;
        }
        e0(this);
        Q();
    }

    public final void X(String str) {
        String str2;
        if (this.M == null) {
            return;
        }
        org.telegram.ui.ActionBar.w2 w2Var = this.J;
        if (w2Var != null) {
            w2Var.dismiss();
            this.J = null;
        }
        org.telegram.ui.ActionBar.w2 j3 = org.telegram.messenger.m10.j(this.M, false, 1, null);
        try {
            str2 = URLDecoder.decode(str.replaceAll("\\+", "%2b"), "UTF-8");
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            str2 = str;
        }
        j3.P = str2;
        j3.Q = false;
        j3.R = true;
        CharSequence[] charSequenceArr = {org.telegram.messenger.gd.N0(2131747623, null), org.telegram.messenger.gd.N0(2131751755, null)};
        og.j jVar = new og.j(1, this, str);
        j3.M = charSequenceArr;
        j3.L = jVar;
        j3.I0 = new u(this, 0);
        Y(j3);
    }

    public final void Y(org.telegram.ui.ActionBar.w2 w2Var) {
        if (this.M != null) {
            try {
                org.telegram.ui.ActionBar.w2 w2Var2 = this.f48075l0;
                if (w2Var2 != null) {
                    w2Var2.dismiss();
                    this.f48075l0 = null;
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            try {
                this.f48075l0 = w2Var;
                w2Var.setCanceledOnTouchOutside(true);
                this.f48075l0.setOnDismissListener(new u(this, 1));
                w2Var.show();
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
        }
    }

    public final void Z(boolean z10) {
        org.telegram.messenger.g0.r(this.f48074k0);
        if (z10) {
            this.f48072i0.f53417e0.a(false, 0.0f);
            this.f48072i0.f53417e0.a(true, 0.3f);
            org.telegram.messenger.g0.h3(this.f48074k0, 100L);
            return;
        }
        this.f48072i0.f53417e0.a(true, 1.0f);
    }

    @Override
    public final void a(e4 e4Var, org.telegram.ui.Components.az0 az0Var) {
        String str;
        String str2;
        org.telegram.ui.Components.k80 k80Var;
        String lowerCase;
        if (az0Var != null && (str = az0Var.f33586b) != null) {
            org.telegram.ui.ActionBar.w2 w2Var = this.J;
            j0 j0Var = null;
            if (w2Var != null) {
                w2Var.dismiss();
                this.J = null;
            }
            int lastIndexOf = str.lastIndexOf(35);
            boolean z10 = false;
            if (lastIndexOf != -1) {
                if (!TextUtils.isEmpty(e4Var.F.cached_page.url)) {
                    lowerCase = e4Var.F.cached_page.url.toLowerCase();
                } else {
                    lowerCase = e4Var.F.url.toLowerCase();
                }
                try {
                    str2 = URLDecoder.decode(str.substring(lastIndexOf + 1), "UTF-8");
                } catch (Exception unused) {
                    str2 = "";
                }
                if (lastIndexOf == 0 || str.toLowerCase().contains(lowerCase)) {
                    z10 = true;
                    T(str2, true);
                }
            } else {
                str2 = null;
            }
            if (!z10) {
                z2 z2Var = this.d;
                if (z2Var != null && (k80Var = this.f50839b) != null) {
                    j0Var = new j0(this, z2Var, k80Var);
                }
                O(str, str2, j0Var);
            }
        }
    }

    public final void a0() {
        LaunchActivity launchActivity;
        FrameLayout frameLayout;
        if (this.X && (launchActivity = LaunchActivity.H1) != null && !launchActivity.isFinishing()) {
            if (this.f48084v0[0].f()) {
                if (this.f48084v0[0].getWebView() != null) {
                    frameLayout = this.f48084v0[0].f49291f;
                } else {
                    return;
                }
            } else {
                k3 k3Var = this.f48084v0[0];
                TLRPC.WebPage webPage = k3Var.f49289c.F;
                frameLayout = k3Var;
                if (webPage == null) {
                    return;
                }
            }
            new org.telegram.ui.Components.kc(frameLayout, null).G(2131623982, 4, org.telegram.messenger.g0.T2(org.telegram.messenger.gd.N0(2131752862, null), new z(this, 11))).k(true);
        }
    }

    @Override
    public final boolean b(TL_iv.PageBlock pageBlock, e4 e4Var) {
        int indexOf;
        List list;
        org.telegram.ui.ActionBar.g2 g2Var = this.N;
        if (g2Var != null && g2Var.getParentActivity() != null) {
            if ((pageBlock instanceof TL_iv.pageBlockVideo) && !d4.g(e4Var.F, pageBlock)) {
                list = Collections.singletonList(pageBlock);
                indexOf = 0;
            } else {
                ArrayList arrayList = new ArrayList(e4Var.f47314f);
                indexOf = e4Var.f47314f.indexOf(pageBlock);
                list = arrayList;
            }
            PhotoViewer p12 = PhotoViewer.p1();
            p12.J2(null, this.N, null);
            if (p12.e2(null, null, null, null, null, null, null, indexOf, new d3(this, list), null, 0L, 0L, 0L, true, new m3(this, e4Var.F, list), null)) {
                l();
                return true;
            }
        }
        return false;
    }

    public final void b0(boolean z10) {
        float f10;
        this.f48080r0.setVisibility(0);
        ValueAnimator valueAnimator = this.Z0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.f48062a1;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.Z0 = ofFloat;
        ofFloat.addUpdateListener(new p(this, 1));
        this.Z0.addListener(new bi.j7(20, this, z10));
        this.Z0.setDuration(320L);
        this.Z0.setInterpolator(org.telegram.ui.Components.kr.h);
        this.Z0.start();
    }

    public final void c0(int i7, Object obj, boolean z10) {
        int L;
        int i10;
        int i11;
        int i12;
        int color;
        int x02;
        int x03;
        boolean z11;
        boolean z12;
        if (obj != null) {
            if (((obj instanceof TLRPC.WebPage) && ((TLRPC.WebPage) obj).cached_page != null) || (obj instanceof x2)) {
                int i13 = 1;
                if (!z10 && i7 != 0) {
                    k3[] k3VarArr = this.f48084v0;
                    k3 k3Var = k3VarArr[1];
                    k3VarArr[1] = k3VarArr[0];
                    k3VarArr[0] = k3Var;
                    this.f48072i0.i();
                    this.f48064b1.a(this.f48084v0[0].getBackgroundColor(), true);
                    this.f48066c1.a(this.f48084v0[1].getBackgroundColor(), true);
                    t3 t3Var = this.L;
                    if (t3Var != null) {
                        t3Var.z();
                    }
                    int indexOfChild = this.f48071h0.indexOfChild(this.f48084v0[0]);
                    int indexOfChild2 = this.f48071h0.indexOfChild(this.f48084v0[1]);
                    if (i7 == 1) {
                        if (indexOfChild < indexOfChild2) {
                            this.f48071h0.removeView(this.f48084v0[0]);
                            this.f48071h0.addView(this.f48084v0[0], indexOfChild2);
                        }
                    } else if (indexOfChild2 < indexOfChild) {
                        this.f48071h0.removeView(this.f48084v0[0]);
                        this.f48071h0.addView(this.f48084v0[0], indexOfChild);
                    }
                    this.f48085w0 = new AnimatorSet();
                    this.f48084v0[0].setVisibility(0);
                    if (i7 == 1) {
                        i12 = 0;
                    } else {
                        i12 = 1;
                    }
                    k3 k3Var2 = this.f48084v0[i12];
                    if (this.L == null) {
                        color = 0;
                    } else {
                        color = this.m0.getColor();
                    }
                    k3Var2.setBackgroundColor(color);
                    this.f48084v0[i12].setLayerType(2, null);
                    if (i7 == 1) {
                        k3 k3Var3 = this.f48084v0[0];
                        Point point = org.telegram.messenger.g0.f24226q;
                        k3Var3.setTranslationX(point.x);
                        this.f48085w0.playTogether(ObjectAnimator.ofFloat(this.f48084v0[0], View.TRANSLATION_X, point.x, 0.0f));
                    } else if (i7 == -1) {
                        this.f48084v0[0].setTranslationX(0.0f);
                        this.f48085w0.playTogether(ObjectAnimator.ofFloat(this.f48084v0[1], View.TRANSLATION_X, 0.0f, org.telegram.messenger.g0.f24226q.x));
                    }
                    this.f48085w0.setDuration(320L);
                    this.f48085w0.setInterpolator(org.telegram.ui.Components.kr.h);
                    this.f48085w0.addListener(new r0(this, i12, 0));
                    this.f48070g0.f30421f = true;
                    l0 l0Var = this.f48072i0;
                    k3 k3Var4 = this.f48084v0[0];
                    if (k3Var4 != null && org.telegram.messenger.bz.f23328v0) {
                        x02 = k3Var4.getBackgroundColor();
                    } else {
                        x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Gl, false);
                    }
                    l0Var.setMenuColors(x02);
                    l0 l0Var2 = this.f48072i0;
                    k3 k3Var5 = this.f48084v0[0];
                    if (k3Var5 != null && org.telegram.messenger.bz.f23328v0) {
                        x03 = k3Var5.getActionBarColor();
                    } else {
                        x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Gl, false);
                    }
                    l0Var2.d(x03, true);
                    l0 l0Var3 = this.f48072i0;
                    k3 k3Var6 = this.f48084v0[0];
                    if (k3Var6 != null && k3Var6.e()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    l0Var3.setIsTonsite(z11);
                    l0 l0Var4 = this.f48072i0;
                    k3 k3Var7 = this.f48084v0[0];
                    if (k3Var7 != null && k3Var7.d()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    l0Var4.setIsLocal(z12);
                    AnimatorSet animatorSet = this.f48085w0;
                    Objects.requireNonNull(animatorSet);
                    org.telegram.messenger.g0.g3(new hq0(animatorSet, 4));
                }
                if (!z10) {
                    this.Q0.f(true);
                }
                e4 e4Var = this.f48084v0[z10 ? 1 : 0].f49289c;
                if (z10) {
                    obj = i5.c.h(2, this.f48068e0);
                }
                this.f48084v0[z10 ? 1 : 0].b();
                if (obj instanceof TLRPC.WebPage) {
                    TLRPC.WebPage webPage = (TLRPC.WebPage) obj;
                    this.f48084v0[z10 ? 1 : 0].setWeb(null);
                    this.f48084v0[z10 ? 1 : 0].setType(0);
                    TL_iv.Page page = webPage.cached_page;
                    e4Var.H = page.rtl;
                    e4Var.F = webPage;
                    int size = page.blocks.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        TL_iv.PageBlock pageBlock = webPage.cached_page.blocks.get(i14);
                        if (i14 == 0) {
                            pageBlock.first = true;
                            if (pageBlock instanceof TL_iv.pageBlockCover) {
                                TL_iv.pageBlockCover pageblockcover = (TL_iv.pageBlockCover) pageBlock;
                                TL_iv.RichText u10 = u(0, pageblockcover);
                                TL_iv.RichText u11 = u(1, pageblockcover);
                                if (((u10 != null && !(u10 instanceof TL_iv.textEmpty)) || (u11 != null && !(u11 instanceof TL_iv.textEmpty))) && size > 1) {
                                    TL_iv.PageBlock pageBlock2 = webPage.cached_page.blocks.get(1);
                                    if (pageBlock2 instanceof TL_iv.pageBlockChannel) {
                                        e4Var.G = (TL_iv.pageBlockChannel) pageBlock2;
                                    }
                                }
                            }
                        } else if (i14 == 1 && e4Var.G != null) {
                        }
                        if (i14 == size - 1) {
                            i11 = i14;
                        } else {
                            i11 = 0;
                        }
                        e4Var.F(e4Var, pageBlock, 0, 0, i11);
                    }
                    e4Var.f();
                    if (this.f48068e0.size() != 1 && i7 != -1) {
                        v4.c0 c0Var = this.f48084v0[z10 ? 1 : 0].d;
                        t3 t3Var2 = this.L;
                        if (t3Var2 == null) {
                            i13 = 0;
                        }
                        if (t3Var2 != null) {
                            i10 = org.telegram.messenger.g0.L(32.0f);
                        } else {
                            i10 = 0;
                        }
                        c0Var.h1(i13, i10);
                    } else {
                        SharedPreferences sharedPreferences = org.telegram.messenger.t0.f27013b.getSharedPreferences("articles", 0);
                        String str = "article" + webPage.f28647id;
                        int i15 = sharedPreferences.getInt(str, -1);
                        boolean z13 = sharedPreferences.getBoolean(str + "r", true);
                        Point point2 = org.telegram.messenger.g0.f24226q;
                        if (point2.x <= point2.y) {
                            i13 = 0;
                        }
                        if (z13 == i13) {
                            L = sharedPreferences.getInt(str + "o", 0) - this.f48084v0[z10 ? 1 : 0].f49288b.getPaddingTop();
                        } else {
                            L = org.telegram.messenger.g0.L(10.0f);
                        }
                        if (i15 != -1) {
                            this.f48084v0[z10 ? 1 : 0].d.h1(i15, L);
                        }
                    }
                } else if (obj instanceof x2) {
                    this.f48084v0[z10 ? 1 : 0].setType(1);
                    this.f48084v0[z10 ? 1 : 0].g();
                    this.f48084v0[z10 ? 1 : 0].setWeb((x2) obj);
                }
                if (!z10) {
                    k(null);
                }
                g0(false);
                d0();
            }
        }
    }

    public final void d0() {
        k3[] k3VarArr;
        k3 k3Var;
        float translationX;
        boolean z10;
        boolean z11;
        k3 k3Var2;
        float f10;
        boolean z12;
        boolean z13;
        if (this.f48072i0 != null && (k3Var = (k3VarArr = this.f48084v0)[0]) != null && k3VarArr[1] != null) {
            int visibility = k3Var.getVisibility();
            float f11 = 0.0f;
            if (visibility != 0) {
                translationX = 0.0f;
            } else {
                translationX = 1.0f - (this.f48084v0[0].getTranslationX() / this.f48084v0[0].getWidth());
            }
            float f12 = 1.0f - translationX;
            l0 l0Var = this.f48072i0;
            l0Var.d[0] = this.f48084v0[0].getProgress();
            l0Var.invalidate();
            l0 l0Var2 = this.f48072i0;
            l0Var2.d[1] = this.f48084v0[1].getProgress();
            l0Var2.invalidate();
            this.f48072i0.setTransitionProgress(f12);
            l0 l0Var3 = this.f48072i0;
            if (!l0Var3.f53410a0 && !l0Var3.U) {
                ArticleViewer$WindowView articleViewer$WindowView = this.f48070g0;
                if (articleViewer$WindowView.f30420e || articleViewer$WindowView.f30421f) {
                    boolean H = H();
                    ArrayList arrayList = this.f48068e0;
                    if (!H && arrayList.size() <= 1) {
                        this.f48072i0.Q.c();
                        this.f48072i0.setBackButtonCached(false);
                    } else {
                        if (!this.f48084v0[0].f49294s && arrayList.size() <= 1) {
                            f10 = 0.0f;
                        } else {
                            f10 = 1.0f;
                        }
                        if (this.f48084v0[1].f49294s || arrayList.size() > 2) {
                            f11 = 1.0f;
                        }
                        float T1 = org.telegram.messenger.g0.T1(f10, f11, f12);
                        this.f48072i0.N.c(false, 1.0f - T1);
                        this.f48072i0.Q.c();
                        l0 l0Var4 = this.f48072i0;
                        if (T1 > 0.5f) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        l0Var4.setBackButtonCached(z12);
                    }
                    this.f48072i0.setHasForward(this.f48084v0[0].f49295w);
                    this.f48072i0.setIsLocal(this.f48084v0[0].d());
                    l0 l0Var5 = this.f48072i0;
                    if (this.f48084v0[0].getWebView() != null && this.f48084v0[0].getWebView().f53532b) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    l0Var5.setIsLoaded(z13);
                }
            }
            l0 l0Var6 = this.f48072i0;
            int actionBarColor = this.f48084v0[0].getActionBarColor();
            ArticleViewer$WindowView articleViewer$WindowView2 = this.f48070g0;
            if (!articleViewer$WindowView2.f30420e && !articleViewer$WindowView2.f30421f) {
                z10 = false;
            } else {
                z10 = true;
            }
            l0Var6.b(0, this.f48064b1.a(actionBarColor, z10));
            l0 l0Var7 = this.f48072i0;
            int actionBarColor2 = this.f48084v0[1].getActionBarColor();
            ArticleViewer$WindowView articleViewer$WindowView3 = this.f48070g0;
            if (!articleViewer$WindowView3.f30420e && !articleViewer$WindowView3.f30421f) {
                z11 = false;
            } else {
                z11 = true;
            }
            l0Var7.b(1, this.f48066c1.a(actionBarColor2, z11));
            this.f48072i0.d(i0.a.f(f12, this.f48084v0[0].getActionBarColor(), this.f48084v0[1].getActionBarColor()), false);
            l0 l0Var8 = this.f48072i0;
            if (translationX > 0.5f) {
                k3Var2 = this.f48084v0[0];
            } else {
                k3Var2 = this.f48084v0[1];
            }
            l0Var8.setMenuType(k3Var2.f49287a);
            t3 t3Var = this.L;
            if (t3Var != null) {
                t3Var.f52222c.invalidate();
                return;
            }
            ArticleViewer$WindowView articleViewer$WindowView4 = this.f48070g0;
            if (articleViewer$WindowView4 != null) {
                articleViewer$WindowView4.invalidate();
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        x0 x0Var;
        org.telegram.messenger.fj messageObject;
        if (i7 == org.telegram.messenger.ks.f25223h2) {
            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) objArr[0];
            if (this.f48084v0 != null) {
                int i11 = 0;
                while (true) {
                    k3[] k3VarArr = this.f48084v0;
                    if (i11 < k3VarArr.length) {
                        int childCount = k3VarArr[i11].f49288b.getChildCount();
                        for (int i12 = 0; i12 < childCount; i12++) {
                            View childAt = this.f48084v0[i11].f49288b.getChildAt(i12);
                            if (childAt instanceof x0) {
                                ((x0) childAt).a(true);
                            }
                        }
                        i11++;
                    } else {
                        return;
                    }
                }
            }
        } else if (i7 != org.telegram.messenger.ks.f25211f2 && i7 != org.telegram.messenger.ks.f25217g2) {
            if (i7 == org.telegram.messenger.ks.f25205e2) {
                Integer num = (Integer) objArr[0];
                if (this.f48084v0 != null) {
                    int i13 = 0;
                    while (true) {
                        k3[] k3VarArr2 = this.f48084v0;
                        if (i13 < k3VarArr2.length) {
                            int childCount2 = k3VarArr2[i13].f49288b.getChildCount();
                            int i14 = 0;
                            while (true) {
                                if (i14 < childCount2) {
                                    View childAt2 = this.f48084v0[i13].f49288b.getChildAt(i14);
                                    if ((childAt2 instanceof x0) && (messageObject = (x0Var = (x0) childAt2).getMessageObject()) != null && messageObject.e1() == num.intValue()) {
                                        org.telegram.messenger.fj fjVar2 = MediaController.B().f22838v0;
                                        if (fjVar2 != null) {
                                            messageObject.f24033b0 = fjVar2.f24033b0;
                                            messageObject.f24065i0 = fjVar2.f24065i0;
                                            messageObject.f24070j0 = fjVar2.f24070j0;
                                            x0Var.b();
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
            } else if (i7 == org.telegram.messenger.ks.f25247l4 && this.f48084v0 != null) {
                int i15 = 0;
                while (true) {
                    k3[] k3VarArr3 = this.f48084v0;
                    if (i15 < k3VarArr3.length) {
                        int childCount3 = k3VarArr3[i15].f49288b.getChildCount();
                        for (int i16 = 0; i16 < childCount3; i16++) {
                            View childAt3 = this.f48084v0[i15].f49288b.getChildAt(i16);
                            if (childAt3 instanceof s2) {
                                ((s2) childAt3).f51939e.invalidate();
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
        } else if (this.f48084v0 != null) {
            int i17 = 0;
            while (true) {
                k3[] k3VarArr4 = this.f48084v0;
                if (i17 < k3VarArr4.length) {
                    int childCount4 = k3VarArr4[i17].f49288b.getChildCount();
                    for (int i18 = 0; i18 < childCount4; i18++) {
                        View childAt4 = this.f48084v0[i17].f49288b.getChildAt(i18);
                        if (childAt4 instanceof x0) {
                            x0 x0Var2 = (x0) childAt4;
                            if (x0Var2.getMessageObject() != null) {
                                x0Var2.a(true);
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

    public final void e(int i7, String str) {
        S();
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3();
        e3Var.f28972x = str;
        this.f48068e0.add(e3Var);
        this.f48072i0.h(false);
        c0(i7, e3Var, false);
    }

    public final boolean f(TLRPC.WebPage webPage, String str, int i7) {
        S();
        this.f48068e0.add(webPage);
        this.f48072i0.h(false);
        c0(i7, webPage, false);
        return T(str, false);
    }

    public final void f0() {
        int i7;
        int size;
        boolean z10;
        boolean z11;
        float f10;
        if (this.F == null && !this.f48084v0[0].f()) {
            return;
        }
        if (this.f48084v0[0].f()) {
            if (this.f48084v0[0].getWebView() == null) {
                i7 = 0;
            } else {
                i7 = this.f48084v0[0].getWebView().getSearchIndex();
            }
            if (this.f48084v0[0].getWebView() == null) {
                size = 0;
            } else {
                size = this.f48084v0[0].getWebView().getSearchCount();
            }
        } else {
            i7 = this.H;
            size = this.F.size();
        }
        ImageView imageView = this.f48081s0;
        if (size > 0 && i7 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        imageView.setEnabled(z10);
        ImageView imageView2 = this.f48082t0;
        if (size > 0 && i7 != size - 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        imageView2.setEnabled(z11);
        ImageView imageView3 = this.f48081s0;
        float f11 = 0.5f;
        if (imageView3.isEnabled()) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        imageView3.setAlpha(f10);
        ImageView imageView4 = this.f48082t0;
        if (imageView4.isEnabled()) {
            f11 = 1.0f;
        }
        imageView4.setAlpha(f11);
        this.f48083u0.a();
        if (size < 0) {
            this.f48083u0.setText("");
        } else if (size == 0) {
            this.f48083u0.setText(org.telegram.messenger.gd.N0(2131747974, null));
        } else if (size == 1) {
            this.f48083u0.setText(org.telegram.messenger.gd.N0(2131747633, null));
        } else {
            this.f48083u0.setText(String.format(org.telegram.messenger.gd.K0(size, "CountOfResults"), Integer.valueOf(i7 + 1), Integer.valueOf(size)));
        }
    }

    public final void g0(boolean z10) {
        boolean z11;
        boolean z12 = false;
        this.f48072i0.g(0, this.f48084v0[0].getTitle(), z10);
        this.f48072i0.f(0, this.f48084v0[0].getSubtitle());
        l0 l0Var = this.f48072i0;
        if (this.f48084v0[0].f() && this.f48084v0[0].getWebView() != null && this.f48084v0[0].getWebView().F) {
            z11 = true;
        } else {
            z11 = false;
        }
        l0Var.e(0, z11);
        this.f48072i0.g(1, this.f48084v0[1].getTitle(), z10);
        this.f48072i0.f(1, this.f48084v0[1].getSubtitle());
        l0 l0Var2 = this.f48072i0;
        if (this.f48084v0[1].f() && this.f48084v0[1].getWebView() != null && this.f48084v0[1].getWebView().F) {
            z12 = true;
        }
        l0Var2.e(1, z12);
    }

    public final void i() {
        this.L0 = false;
        y2 y2Var = this.M0;
        if (y2Var != null) {
            this.f48070g0.removeCallbacks(y2Var);
            this.M0 = null;
        }
        y2 y2Var2 = this.N0;
        if (y2Var2 != null) {
            this.f48070g0.removeCallbacks(y2Var2);
            this.N0 = null;
        }
    }

    public final void k(org.telegram.messenger.ee eeVar) {
        if (this.K0 == org.telegram.messenger.g0.L(56.0f)) {
            if (eeVar != null) {
                eeVar.run();
                return;
            }
            return;
        }
        ValueAnimator duration = ValueAnimator.ofObject(new IntEvaluator(), Integer.valueOf(this.K0), Integer.valueOf(org.telegram.messenger.g0.L(56.0f))).setDuration(180L);
        duration.setInterpolator(new DecelerateInterpolator());
        duration.addUpdateListener(new p(this, 0));
        duration.addListener(new ki.n3(eeVar, 13));
        if (eeVar != null) {
            duration.setDuration(duration.getDuration() / 2);
        }
        duration.start();
    }

    public final void l() {
        long j3;
        v2 v2Var;
        hi.e0 e0Var = this.f48084v0[0].f49288b;
        if (e0Var != null && this.X) {
            float measuredHeight = e0Var.getMeasuredHeight() / 2.0f;
            Uri uri = null;
            float f10 = 0.0f;
            v2 v2Var2 = null;
            for (int i7 = 0; i7 < e0Var.getChildCount(); i7++) {
                View childAt = e0Var.getChildAt(i7);
                if (childAt instanceof v2) {
                    float measuredHeight2 = (childAt.getMeasuredHeight() / 2.0f) + childAt.getTop();
                    if (v2Var2 == null || Math.abs(measuredHeight - measuredHeight2) < Math.abs(measuredHeight - f10)) {
                        v2Var2 = (v2) childAt;
                        f10 = measuredHeight2;
                    }
                }
            }
            boolean z10 = PhotoViewer.p1().f43333f;
            if (z10 || ((v2Var = this.f50848y) != null && v2Var != v2Var2 && this.f50847x != null)) {
                VideoPlayerHolderBase videoPlayerHolderBase = this.f50847x;
                if (videoPlayerHolderBase != null) {
                    v2 v2Var3 = this.f50848y;
                    long j10 = v2Var3.M.video_id;
                    w2 a10 = w2.a(videoPlayerHolderBase, v2Var3);
                    v2Var3.c(a10);
                    this.E.k(a10, j10);
                    v2 v2Var4 = this.f50848y;
                    w2 w2Var = v2Var4.N;
                    if (w2Var != null) {
                        Bitmap bitmap = w2Var.f53086b;
                        if (bitmap != null) {
                            v2Var4.f52788e.w0(bitmap);
                        }
                        this.f50848y.e(false);
                    }
                    this.f50847x.release(null);
                }
                this.f50847x = null;
                this.f50848y = null;
            }
            if (!z10 && v2Var2 != null) {
                p50 p50Var = v2Var2.f52785a;
                if (v2Var2.P != null && p50Var.f50847x == null) {
                    p50Var.f50847x = new u2(v2Var2).with(v2Var2.f52790n);
                    TLRPC.Document document = v2Var2.P;
                    for (int i10 = 0; i10 < document.attributes.size(); i10++) {
                        if (document.attributes.get(i10) instanceof TLRPC.TL_documentAttributeVideo) {
                            TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) document.attributes.get(i10);
                            v2Var2.h.a(tL_documentAttributeVideo.f28499w / tL_documentAttributeVideo.h, 0);
                        }
                    }
                    TLRPC.WebPage webPage = v2Var2.f52786b.F;
                    if (webPage != null) {
                        uri = org.telegram.messenger.r8.f(((g4) p50Var).Y, webPage, document);
                    }
                    if (uri != null) {
                        VideoPlayerHolderBase videoPlayerHolderBase2 = p50Var.f50847x;
                        w2 w2Var2 = v2Var2.N;
                        if (w2Var2 == null) {
                            j3 = 0;
                        } else {
                            j3 = w2Var2.f53085a;
                        }
                        videoPlayerHolderBase2.seekTo(j3);
                        p50Var.f50847x.preparePlayer(uri, true, 1.0f);
                        p50Var.f50847x.play();
                    }
                }
                this.f50848y = v2Var2;
            }
        }
    }

    public final void m(boolean z10, boolean z11) {
        if (this.M != null && !this.V0 && this.W) {
            int i7 = 0;
            if (this.f48061a0 != 0 && Math.abs(this.f48065c0 - System.currentTimeMillis()) >= 500) {
                Runnable runnable = this.f48063b0;
                if (runnable != null) {
                    runnable.run();
                    this.f48063b0 = null;
                }
                this.f48061a0 = 0;
            }
            if (this.f48061a0 == 0) {
                t3 t3Var = this.L;
                if (t3Var != null) {
                    t3Var.a(false);
                    return;
                }
                if (this.Q.getVisibility() == 0) {
                    if (this.P != null) {
                        this.Q.setVisibility(4);
                        this.T.onCustomViewHidden();
                        this.Q.removeView(this.P);
                        this.P = null;
                    } else {
                        org.telegram.ui.Components.a81 a81Var = this.G0;
                        if (a81Var != null && a81Var.U) {
                            a81Var.U = false;
                            a81Var.m();
                            a81Var.l(false);
                        }
                    }
                    if (!z11) {
                        return;
                    }
                }
                if (this.Q0.x()) {
                    this.Q0.f(false);
                    return;
                }
                l0 l0Var = this.f48072i0;
                if (l0Var.U) {
                    l0Var.h(false);
                } else if (l0Var.f53410a0) {
                    l0Var.k(false);
                } else {
                    if (this.H0 != 0) {
                        ConnectionsManager.getInstance(this.Y).cancelRequest(this.H0, true);
                        this.H0 = 0;
                        Z(false);
                    }
                    if (this.I0 != 0) {
                        ConnectionsManager.getInstance(this.Y).cancelRequest(this.I0, true);
                        this.I0 = 0;
                        Z(false);
                    }
                    S();
                    if (z10 && !z11) {
                        ArrayList arrayList = this.f48068e0;
                        if (arrayList.size() >= 2) {
                            Object g10 = p5.c.g(1, arrayList);
                            if (g10 instanceof x2) {
                                ((x2) g10).a();
                            }
                            if (g10 instanceof TLRPC.WebPage) {
                                org.telegram.ui.web.w1.o((TLRPC.WebPage) g10);
                            }
                            c0(-1, arrayList.get(arrayList.size() - 1), false);
                            return;
                        }
                    }
                    org.telegram.messenger.ks.f(this.Y).n(this, org.telegram.messenger.ks.f25205e2);
                    org.telegram.messenger.ks.f(this.Y).n(this, org.telegram.messenger.ks.f25211f2);
                    org.telegram.messenger.ks.f(this.Y).n(this, org.telegram.messenger.ks.f25217g2);
                    org.telegram.messenger.ks.f(this.Y).n(this, org.telegram.messenger.ks.f25223h2);
                    org.telegram.messenger.ks.f(this.Y).n(this, org.telegram.messenger.ks.f25247l4);
                    bg.v0 v0Var = this.W0;
                    if (v0Var != null) {
                        v0Var.a();
                        this.W0 = null;
                    }
                    this.N = null;
                    try {
                        org.telegram.ui.ActionBar.w2 w2Var = this.f48075l0;
                        if (w2Var != null) {
                            w2Var.dismiss();
                            this.f48075l0 = null;
                        }
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    ArticleViewer$WindowView articleViewer$WindowView = this.f48070g0;
                    Property property = View.ALPHA;
                    animatorSet.playTogether(ObjectAnimator.ofFloat(articleViewer$WindowView, property, 0.0f), ObjectAnimator.ofFloat(this.f48071h0, property, 0.0f), ObjectAnimator.ofFloat(this.f48070g0, View.TRANSLATION_X, 0.0f, org.telegram.messenger.g0.L(56.0f)));
                    this.f48061a0 = 2;
                    this.f48063b0 = new z(this, 10);
                    animatorSet.setDuration(150L);
                    animatorSet.setInterpolator(this.f48067d0);
                    animatorSet.addListener(new ki.n3(this, 14));
                    this.f48065c0 = System.currentTimeMillis();
                    this.f48071h0.setLayerType(2, null);
                    animatorSet.start();
                    while (true) {
                        a0.h hVar = this.E;
                        if (i7 < hVar.m()) {
                            w2 w2Var2 = (w2) hVar.n(i7);
                            Bitmap bitmap = w2Var2.f53086b;
                            if (bitmap != null) {
                                bitmap.recycle();
                                w2Var2.f53086b = null;
                            }
                            i7++;
                        } else {
                            hVar.b();
                            return;
                        }
                    }
                }
            }
        }
    }

    public final void q() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f48068e0;
            if (i7 < arrayList.size()) {
                Object obj = arrayList.get(i7);
                if (obj instanceof x2) {
                    k3 k3Var = this.f48084v0[0];
                    if (k3Var != null && k3Var.L == obj) {
                        ((x2) obj).c(k3Var);
                    }
                    k3 k3Var2 = this.f48084v0[1];
                    if (k3Var2 != null && k3Var2.L == obj) {
                        ((x2) obj).c(k3Var2);
                    }
                    ((x2) obj).a();
                } else if (obj instanceof TLRPC.WebPage) {
                    org.telegram.ui.web.w1.o((TLRPC.WebPage) obj);
                }
                i7++;
            } else {
                arrayList.clear();
                r();
                return;
            }
        }
    }

    public final void r() {
        ArticleViewer$WindowView articleViewer$WindowView;
        if (this.M != null && (articleViewer$WindowView = this.f48070g0) != null) {
            if (this.L == null) {
                try {
                    if (articleViewer$WindowView.getParent() != null) {
                        ((WindowManager) this.M.getSystemService("window")).removeViewImmediate(this.f48070g0);
                    }
                    this.f48070g0 = null;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
            for (int i7 = 0; i7 < this.O.size(); i7++) {
                ((q1) this.O.get(i7)).a(true);
            }
            this.O.clear();
            try {
                this.M.getWindow().clearFlags(128);
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
            this.M = null;
            this.N = null;
            f48041e1 = null;
        }
    }

    public g4(org.telegram.ui.ActionBar.g2 g2Var) {
        this.O = new ArrayList();
        this.Z = 1;
        this.f48067d0 = new DecelerateInterpolator(1.5f);
        this.f48068e0 = new ArrayList();
        this.f48086x0 = new Paint();
        this.f48087y0 = new Paint();
        this.f48088z0 = new Paint();
        this.B0 = new Paint();
        this.L0 = false;
        this.M0 = null;
        this.N0 = null;
        this.T0 = new h2.f(new int[]{org.telegram.messenger.ks.f25283s, org.telegram.messenger.ks.f25289t});
        this.U0 = new k0[2];
        this.Y0 = -1;
        z zVar = new z(this, 4);
        org.telegram.ui.Components.kr krVar = org.telegram.ui.Components.kr.h;
        this.f48064b1 = new org.telegram.ui.Components.f5(zVar, 320L, krVar);
        this.f48066c1 = new org.telegram.ui.Components.f5(new z(this, 5), 320L, krVar);
        this.K = true;
        this.L = new t3(this, g2Var);
        W(g2Var.getParentActivity(), g2Var);
    }
}
