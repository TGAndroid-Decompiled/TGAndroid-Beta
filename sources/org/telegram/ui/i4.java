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
public final class i4 extends i50 implements org.telegram.messenger.cs {
    public static Paint A1;
    public static Paint B1;
    public static Paint D1;
    public static TextPaint f46061i1;
    public static TextPaint f46062j1;
    public static TextPaint k1;
    public static TextPaint f46063l1;
    public static TextPaint m1;
    public static TextPaint f46064n1;
    public static TextPaint f46065o1;
    public static TextPaint f46066p1;
    public static Paint f46067q1;
    public static Paint f46068r1;
    public static Paint f46069s1;
    public static Paint f46070t1;
    public static Paint f46071u1;
    public static Paint f46072v1;
    public static Paint f46073w1;
    public static Paint f46074x1;
    public static Paint f46075y1;
    public static Paint f46076z1;
    public boolean A0;
    public final Paint B0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout C0;
    public TextView D0;
    public Rect E0;
    public org.telegram.ui.Components.d71 F0;
    public org.telegram.ui.Components.d71 G0;
    public int H0;
    public int I0;
    public int J0;
    public final boolean K;
    public int K0;
    public final u3 L;
    public boolean L0;
    public Activity M;
    public z2 M0;
    public org.telegram.ui.ActionBar.d2 N;
    public z2 N0;
    public final ArrayList O;
    public sf.b O0;
    public View P;
    public int P0;
    public FrameLayout Q;
    public org.telegram.ui.Cells.h9 Q0;
    public TextureView R;
    public org.telegram.ui.Cells.h9 R0;
    public l4 S;
    public vq0 S0;
    public WebChromeClient.CustomViewCallback T;
    public final g2.g T0;
    public WindowInsets U;
    public final l0[] U0;
    public boolean V;
    public boolean V0;
    public boolean W;
    public cg.u0 W0;
    public boolean X;
    public ai.e3 X0;
    public int Y;
    public int Y0;
    public int Z;
    public ValueAnimator Z0;
    public int f46077a0;
    public float f46078a1;
    public Runnable f46079b0;
    public final org.telegram.ui.Components.x4 f46080b1;
    public long f46081c0;
    public final org.telegram.ui.Components.x4 f46082c1;
    public final DecelerateInterpolator f46083d0;
    public final ArrayList f46084e0;
    public WindowManager.LayoutParams f46085f0;
    public ArticleViewer$WindowView f46086g0;
    public l0 f46087h0;
    public m0 f46088i0;
    public org.telegram.ui.web.l f46089j0;
    public b0 f46090k0;
    public org.telegram.ui.ActionBar.t2 f46091l0;
    public Paint m0;
    public Drawable f46092n0;
    public Paint f46093o0;
    public boolean f46094p0;
    public float f46095q0;
    public ai.d2 f46096r0;
    public ImageView f46097s0;
    public ImageView f46098t0;
    public org.telegram.ui.Components.h6 f46099u0;
    public l3[] f46100v0;
    public AnimatorSet f46101w0;
    public final Paint f46102x0;
    public final Paint f46103y0;
    public final Paint f46104z0;
    public static final HashSet f46056d1 = new HashSet();
    public static volatile i4 f46057e1 = null;
    public static final r0 f46058f1 = new r0("innerTranslationX", 0);
    public static final TextPaint f46059g1 = new TextPaint(1);
    public static final p3 f46060h1 = new p3();
    public static final WeakHashMap C1 = new WeakHashMap();

    public i4() {
        this.O = new ArrayList();
        this.Z = 1;
        this.f46083d0 = new DecelerateInterpolator(1.5f);
        this.f46084e0 = new ArrayList();
        this.f46102x0 = new Paint();
        this.f46103y0 = new Paint();
        this.f46104z0 = new Paint();
        this.B0 = new Paint();
        this.L0 = false;
        this.M0 = null;
        this.N0 = null;
        this.T0 = new g2.g(new int[]{org.telegram.messenger.hs.f23298s, org.telegram.messenger.hs.f23305t});
        this.U0 = new l0[2];
        this.Y0 = -1;
        b0 b0Var = new b0(this, 4);
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        this.f46080b1 = new org.telegram.ui.Components.x4(b0Var, 320L, xqVar);
        this.f46082c1 = new org.telegram.ui.Components.x4(new b0(this, 5), 320L, xqVar);
        this.K = false;
        this.L = null;
    }

    public static CharSequence A(i50 i50Var, TLRPC.WebPage webPage, View view, TL_iv.RichText richText, TL_iv.RichText richText2, TL_iv.PageBlock pageBlock, int i3) {
        org.telegram.ui.Components.py0 py0Var;
        org.telegram.ui.Components.py0 py0Var2;
        TextPaint textPaint = null;
        if (richText2 == null) {
            return null;
        }
        if (richText2 instanceof TL_iv.textFixed) {
            return A(i50Var, webPage, view, richText, ((TL_iv.textFixed) richText2).text, pageBlock, i3);
        }
        if (richText2 instanceof TL_iv.textItalic) {
            return A(i50Var, webPage, view, richText, ((TL_iv.textItalic) richText2).text, pageBlock, i3);
        }
        if (richText2 instanceof TL_iv.textBold) {
            return A(i50Var, webPage, view, richText, ((TL_iv.textBold) richText2).text, pageBlock, i3);
        }
        if (richText2 instanceof TL_iv.textUnderline) {
            return A(i50Var, webPage, view, richText, ((TL_iv.textUnderline) richText2).text, pageBlock, i3);
        }
        if (richText2 instanceof TL_iv.textStrike) {
            return A(i50Var, webPage, view, richText, ((TL_iv.textStrike) richText2).text, pageBlock, i3);
        }
        if (richText2 instanceof TL_iv.textEmail) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(A(i50Var, webPage, view, richText, ((TL_iv.textEmail) richText2).text, pageBlock, i3));
            MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), MetricAffectingSpan.class);
            if (spannableStringBuilder.length() != 0) {
                if (metricAffectingSpanArr == null || metricAffectingSpanArr.length == 0) {
                    textPaint = C(i50Var, richText, richText2, pageBlock);
                }
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.py0(textPaint, "mailto:" + D(richText2)), 0, spannableStringBuilder.length(), 33);
            }
            return spannableStringBuilder;
        }
        long j10 = 0;
        if (richText2 instanceof TL_iv.textUrl) {
            TL_iv.textUrl texturl = (TL_iv.textUrl) richText2;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(A(i50Var, webPage, view, richText, texturl.text, pageBlock, i3));
            MetricAffectingSpan[] metricAffectingSpanArr2 = (MetricAffectingSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), MetricAffectingSpan.class);
            if (metricAffectingSpanArr2 == null || metricAffectingSpanArr2.length == 0) {
                textPaint = C(i50Var, richText, richText2, pageBlock);
            }
            if (texturl.webpage_id != 0) {
                py0Var2 = new org.telegram.ui.Components.py0(textPaint, D(richText2));
            } else {
                py0Var2 = new org.telegram.ui.Components.py0(textPaint, D(richText2));
            }
            if (spannableStringBuilder2.length() != 0) {
                spannableStringBuilder2.setSpan(py0Var2, 0, spannableStringBuilder2.length(), 33);
            }
            return spannableStringBuilder2;
        } else if (richText2 instanceof TL_iv.textPlain) {
            return ((TL_iv.textPlain) richText2).text;
        } else {
            if (richText2 instanceof TL_iv.textAnchor) {
                TL_iv.textAnchor textanchor = (TL_iv.textAnchor) richText2;
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(A(i50Var, webPage, view, richText, textanchor.text, pageBlock, i3));
                String str = textanchor.name;
                ?? metricAffectingSpan = new MetricAffectingSpan();
                metricAffectingSpan.f38639a = str.toLowerCase();
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
                        TL_iv.RichText y9 = y(richText3);
                        boolean z10 = i3 >= 0 && (richText3 instanceof TL_iv.textUrl) && ((TL_iv.textUrl) richText3).webpage_id != j10;
                        if (z10 && spannableStringBuilder4.length() != 0 && spannableStringBuilder4.charAt(spannableStringBuilder4.length() - 1) != '\n') {
                            spannableStringBuilder4.append((CharSequence) " ");
                            spannableStringBuilder4.setSpan(new Object(), spannableStringBuilder4.length() - 1, spannableStringBuilder4.length(), 33);
                        }
                        CharSequence A = A(i50Var, webPage, view, richText, richText3, pageBlock, i3);
                        int B = B(y9);
                        int length = spannableStringBuilder4.length();
                        spannableStringBuilder4.append(A);
                        if (B != 0 && !(A instanceof SpannableStringBuilder)) {
                            if ((B & 8) == 0 && (B & 512) == 0) {
                                if (length != spannableStringBuilder4.length()) {
                                    TextPaint C = C(i50Var, richText, y9, pageBlock);
                                    ?? metricAffectingSpan2 = new MetricAffectingSpan();
                                    metricAffectingSpan2.f36984a = C;
                                    spannableStringBuilder4.setSpan(metricAffectingSpan2, length, spannableStringBuilder4.length(), 33);
                                }
                            } else {
                                String D = D(richText3);
                                if (D == null) {
                                    D = D(richText);
                                }
                                if ((B & 512) != 0) {
                                    py0Var = new org.telegram.ui.Components.py0(C(i50Var, richText, y9, pageBlock), D);
                                } else {
                                    py0Var = new org.telegram.ui.Components.py0(C(i50Var, richText, y9, pageBlock), D);
                                }
                                if (length != spannableStringBuilder4.length()) {
                                    spannableStringBuilder4.setSpan(py0Var, length, spannableStringBuilder4.length(), 33);
                                }
                            }
                        }
                        if (z10 && i10 != size - 1) {
                            spannableStringBuilder4.append((CharSequence) " ");
                            spannableStringBuilder4.setSpan(new Object(), spannableStringBuilder4.length() - 1, spannableStringBuilder4.length(), 33);
                        }
                        i10++;
                        j10 = 0;
                    }
                    return spannableStringBuilder4;
                } else if (richText2 instanceof TL_iv.textSubscript) {
                    return A(i50Var, webPage, view, richText, ((TL_iv.textSubscript) richText2).text, pageBlock, i3);
                } else {
                    if (richText2 instanceof TL_iv.textSuperscript) {
                        return A(i50Var, webPage, view, richText, ((TL_iv.textSuperscript) richText2).text, pageBlock, i3);
                    }
                    if (richText2 instanceof TL_iv.textMarked) {
                        SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(A(i50Var, webPage, view, richText, ((TL_iv.textMarked) richText2).text, pageBlock, i3));
                        MetricAffectingSpan[] metricAffectingSpanArr3 = (MetricAffectingSpan[]) spannableStringBuilder5.getSpans(0, spannableStringBuilder5.length(), MetricAffectingSpan.class);
                        if (spannableStringBuilder5.length() != 0) {
                            if (metricAffectingSpanArr3 == null || metricAffectingSpanArr3.length == 0) {
                                textPaint = C(i50Var, richText, richText2, pageBlock);
                            }
                            ?? metricAffectingSpan3 = new MetricAffectingSpan();
                            metricAffectingSpan3.f36651a = textPaint;
                            spannableStringBuilder5.setSpan(metricAffectingSpan3, 0, spannableStringBuilder5.length(), 33);
                        }
                        return spannableStringBuilder5;
                    } else if (richText2 instanceof TL_iv.textSpoiler) {
                        SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder(A(i50Var, webPage, view, richText, ((TL_iv.textSpoiler) richText2).text, pageBlock, i3));
                        if (spannableStringBuilder6.length() != 0) {
                            ?? obj = new Object();
                            obj.f38578a |= 256;
                            spannableStringBuilder6.setSpan(new org.telegram.ui.Components.uy0(obj, 0), 0, spannableStringBuilder6.length(), 33);
                        }
                        return spannableStringBuilder6;
                    } else if (richText2 instanceof TL_iv.textPhone) {
                        SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder(A(i50Var, webPage, view, richText, ((TL_iv.textPhone) richText2).text, pageBlock, i3));
                        MetricAffectingSpan[] metricAffectingSpanArr4 = (MetricAffectingSpan[]) spannableStringBuilder7.getSpans(0, spannableStringBuilder7.length(), MetricAffectingSpan.class);
                        if (spannableStringBuilder7.length() != 0) {
                            if (metricAffectingSpanArr4 == null || metricAffectingSpanArr4.length == 0) {
                                textPaint = C(i50Var, richText, richText2, pageBlock);
                            }
                            spannableStringBuilder7.setSpan(new org.telegram.ui.Components.py0(textPaint, "tel:" + D(richText2)), 0, spannableStringBuilder7.length(), 33);
                        }
                        return spannableStringBuilder7;
                    } else {
                        if (richText2 instanceof TL_iv.textImage) {
                            TL_iv.textImage textimage = (TL_iv.textImage) richText2;
                            TLRPC.Document a10 = e4.a(webPage, textimage.document_id);
                            TLRPC.Photo e10 = e4.e(webPage, textimage.photo_id);
                            if (a10 != null) {
                                SpannableStringBuilder spannableStringBuilder8 = new SpannableStringBuilder("*");
                                int L = org.telegram.messenger.g0.L(textimage.f27227w);
                                int L2 = org.telegram.messenger.g0.L(textimage.h);
                                int abs = Math.abs(i3);
                                if (L > abs) {
                                    L2 = (int) (L2 * (abs / L));
                                    L = abs;
                                }
                                if (view != null) {
                                    int i11 = org.telegram.ui.ActionBar.k6.f27878d6;
                                    ((i4) i50Var).getClass();
                                    boolean z11 = org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.x0(null, i11, false)) <= 0.705f;
                                    ?? replacementSpan = new ReplacementSpan();
                                    Locale locale = Locale.US;
                                    String str2 = L + "_" + L2 + "_i";
                                    replacementSpan.f36272b = L;
                                    replacementSpan.f36273c = L2;
                                    boolean z12 = z11;
                                    ImageReceiver imageReceiver = new ImageReceiver(view);
                                    replacementSpan.f36271a = imageReceiver;
                                    imageReceiver.K0 = true;
                                    if (z12) {
                                        imageReceiver.f21247h1 = new org.telegram.ui.Components.lf0(13);
                                    }
                                    imageReceiver.r0(org.telegram.messenger.ac.b(a10), str2, org.telegram.messenger.ac.c(org.telegram.messenger.w7.w(a10.thumbs, 90, false, null, false), a10), str2, null, -1L, null, webPage, 1);
                                    spannableStringBuilder8.setSpan(replacementSpan, 0, spannableStringBuilder8.length(), 33);
                                }
                                return spannableStringBuilder8;
                            } else if (e10 instanceof org.telegram.ui.web.t1) {
                                org.telegram.ui.web.t1 t1Var = (org.telegram.ui.web.t1) e10;
                                SpannableStringBuilder spannableStringBuilder9 = new SpannableStringBuilder("*");
                                int L3 = org.telegram.messenger.g0.L(textimage.f27227w);
                                int L4 = org.telegram.messenger.g0.L(textimage.h);
                                int abs2 = Math.abs(i3);
                                if (L3 > abs2) {
                                    L4 = (int) (L4 * (abs2 / L3));
                                    L3 = abs2;
                                }
                                if (view != null) {
                                    ?? replacementSpan2 = new ReplacementSpan();
                                    replacementSpan2.f36272b = L3;
                                    replacementSpan2.f36273c = L4;
                                    ImageReceiver imageReceiver2 = new ImageReceiver(view);
                                    replacementSpan2.f36271a = imageReceiver2;
                                    imageReceiver2.K0 = true;
                                    org.telegram.ui.web.u1.g(t1Var, imageReceiver2, new org.telegram.ui.Components.go(8));
                                    spannableStringBuilder9.setSpan(replacementSpan2, 0, spannableStringBuilder9.length(), 33);
                                }
                                return spannableStringBuilder9;
                            }
                        } else if (richText2 instanceof TL_iv.textMath) {
                            TL_iv.textMath textmath = (TL_iv.textMath) richText2;
                            if (textmath.bitmap == null && !textmath.tried) {
                                textmath.tried = true;
                                mi.q a11 = mi.q.a(textmath.source, org.telegram.messenger.g0.L(20.0f), true);
                                if (a11 != null) {
                                    textmath.f27228w = a11.f19825b;
                                    textmath.h = a11.f19826c;
                                    textmath.depth = a11.d;
                                    textmath.bitmap = a11.f19824a;
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
                                int i12 = textmath.f27228w;
                                int i13 = textmath.h;
                                int i14 = org.telegram.ui.ActionBar.k6.G6;
                                ((i4) i50Var).getClass();
                                spannableStringBuilder10.setSpan(new org.telegram.ui.Components.my0(view, bitmap, i12, i13, org.telegram.ui.ActionBar.k6.x0(null, i14, false), textmath.depth), 0, spannableStringBuilder10.length(), 33);
                                String str4 = textmath.source;
                                if (str4 != null && !str4.isEmpty()) {
                                    spannableStringBuilder10.setSpan(new org.telegram.ui.Cells.n9(textmath.source), 0, spannableStringBuilder10.length(), 33);
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

    public static android.text.TextPaint C(org.telegram.ui.i50 r21, org.telegram.tgnet.tl.TL_iv.RichText r22, org.telegram.tgnet.tl.TL_iv.RichText r23, org.telegram.tgnet.tl.TL_iv.PageBlock r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.i4.C(org.telegram.ui.i50, org.telegram.tgnet.tl.TL_iv$RichText, org.telegram.tgnet.tl.TL_iv$RichText, org.telegram.tgnet.tl.TL_iv$PageBlock):android.text.TextPaint");
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
        if (f46057e1 != null) {
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
        if (!(pageBlock instanceof x3) && !(pageBlock instanceof z3)) {
            return false;
        }
        return true;
    }

    public static boolean M(v3 v3Var) {
        boolean z10;
        TL_iv.PageBlock x10 = x(v3Var.f50369a);
        if (x10 instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) x10;
            if (!pageblockdetails.open) {
                pageblockdetails.open = true;
                return true;
            }
        } else if (x10 instanceof v3) {
            v3 v3Var2 = (v3) x10;
            TL_iv.PageBlock x11 = x(v3Var2.f50370b);
            if (x11 instanceof TL_iv.pageBlockDetails) {
                TL_iv.pageBlockDetails pageblockdetails2 = (TL_iv.pageBlockDetails) x11;
                if (!pageblockdetails2.open) {
                    pageblockdetails2.open = true;
                    z10 = true;
                    if (!M(v3Var2) || z10) {
                        return true;
                    }
                }
            }
            z10 = false;
            if (!M(v3Var2)) {
            }
            return true;
        }
        return false;
    }

    public static void R(i50 i50Var) {
        if (i50Var.f46111b != null || i50Var.f46114f != null) {
            View view = i50Var.f46114f;
            i50Var.f46112c.f(true);
            i50Var.f46111b = null;
            i50Var.d = null;
            i50Var.f46114f = null;
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

    public static void d(String str, int i3, FrameLayout frameLayout, u3 u3Var, org.telegram.ui.ActionBar.e6 e6Var) {
        String u10 = org.telegram.ui.web.w0.u(str);
        long e10 = org.telegram.messenger.h10.i(i3).e();
        org.telegram.messenger.yy.C(i3).r0(org.telegram.messenger.wy.a(e10, u10));
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
        org.telegram.messenger.hs.f(i3).k(org.telegram.messenger.hs.H1, new org.telegram.messenger.zi(i3, tL_message, false, false));
        new org.telegram.ui.Components.fc(frameLayout, e6Var).Q(2131624190, 36, org.telegram.messenger.g0.U2(org.telegram.messenger.bd.M0(2131742950, null), new ci.e3(u3Var, e10, 19))).k(true);
    }

    public static void e0(i50 i50Var) {
        TextPaint textPaint = f46065o1;
        if (textPaint != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
        }
        TextPaint textPaint2 = f46066p1;
        if (textPaint2 != null) {
            textPaint2.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
        }
        TextPaint textPaint3 = f46061i1;
        if (textPaint3 != null) {
            textPaint3.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
        }
        TextPaint textPaint4 = k1;
        if (textPaint4 != null) {
            textPaint4.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
        }
        TextPaint textPaint5 = f46063l1;
        if (textPaint5 != null) {
            textPaint5.setColor(-1);
        }
        TextPaint textPaint6 = m1;
        if (textPaint6 != null) {
            textPaint6.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
        }
        TextPaint textPaint7 = f46064n1;
        if (textPaint7 != null) {
            textPaint7.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28273y6, false));
        }
        TextPaint textPaint8 = f46062j1;
        if (textPaint8 != null) {
            textPaint8.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28273y6, false));
        }
        p(i50Var, true);
        p3 p3Var = f46060h1;
        p3.a(i50Var, p3Var.d);
        p3.a(i50Var, p3Var.f48433e);
        p3.a(i50Var, p3Var.f48435g);
        p3.a(i50Var, p3Var.f48434f);
        p3.a(i50Var, p3Var.h);
        p3.a(i50Var, p3Var.f48436i);
        p3.a(i50Var, p3Var.f48437j);
        p3.a(i50Var, p3Var.f48438k);
        p3.a(i50Var, p3Var.f48439l);
        p3.a(i50Var, p3Var.f48440m);
        p3.a(i50Var, p3Var.f48441n);
        p3.a(i50Var, p3Var.f48447t);
        p3.a(i50Var, p3Var.f48446s);
        p3.a(i50Var, p3Var.f48444q);
        p3.a(i50Var, p3Var.f48445r);
        p3.a(i50Var, p3Var.f48448u);
        p3.a(i50Var, p3Var.f48449w);
        p3.a(i50Var, p3Var.f48450x);
        p3.a(i50Var, p3Var.f48431b);
        p3.a(i50Var, p3Var.f48432c);
        p3.a(i50Var, p3Var.f48442o);
        p3.a(i50Var, p3Var.f48443p);
        p3.a(i50Var, p3Var.v);
        p3.a(i50Var, p3Var.f48451y);
        p3.a(i50Var, p3Var.f48452z);
        p3.a(i50Var, p3Var.A);
    }

    public static SpannableStringBuilder g(int i3, CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (charSequence != null) {
            spannableStringBuilder.append(charSequence);
        }
        if (spannableStringBuilder.length() > 0) {
            spannableStringBuilder.append((CharSequence) ", ");
        }
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.bd.M0(i3, null));
        return spannableStringBuilder;
    }

    public static CharSequence h(i50 i50Var, g4 g4Var, a3 a3Var) {
        StaticLayout staticLayout;
        if (a3Var != null && (staticLayout = a3Var.d) != null) {
            SpannableStringBuilder spannableStringBuilder = a3Var.E;
            if (spannableStringBuilder != null) {
                return spannableStringBuilder;
            }
            CharSequence text = staticLayout.getText();
            if (!(text instanceof Spannable)) {
                return text;
            }
            Spannable spannable = (Spannable) text;
            org.telegram.ui.Components.py0[] py0VarArr = (org.telegram.ui.Components.py0[]) spannable.getSpans(0, spannable.length(), org.telegram.ui.Components.py0.class);
            SpannableStringBuilder spannableStringBuilder2 = text;
            if (py0VarArr != null) {
                spannableStringBuilder2 = text;
                if (py0VarArr.length != 0) {
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannable);
                    for (org.telegram.ui.Components.py0 py0Var : py0VarArr) {
                        int spanStart = spannableStringBuilder3.getSpanStart(py0Var);
                        int spanEnd = spannableStringBuilder3.getSpanEnd(py0Var);
                        if (spanStart >= 0 && spanEnd > spanStart) {
                            spannableStringBuilder3.setSpan(new org.telegram.messenger.v(i50Var, g4Var, py0Var, 1), spanStart, spanEnd, 33);
                        }
                    }
                    a3Var.E = spannableStringBuilder3;
                    spannableStringBuilder2 = spannableStringBuilder3;
                }
            }
            return spannableStringBuilder2;
        }
        return null;
    }

    public static TL_iv.PageBlock h0(TL_iv.PageBlock pageBlock, v3 v3Var) {
        if (pageBlock instanceof x3) {
            x3 x3Var = (x3) pageBlock;
            x3 x3Var2 = new x3();
            x3Var2.f51704a = x3Var.f51704a;
            x3Var2.f51705b = x3Var.f51705b;
            x3Var2.f51706c = x3Var.f51706c;
            x3Var2.d = h0(x3Var.d, v3Var);
            return x3Var2;
        } else if (pageBlock instanceof z3) {
            z3 z3Var = (z3) pageBlock;
            z3 z3Var2 = new z3();
            z3Var2.f52516a = z3Var.f52516a;
            z3Var2.f52517b = z3Var.f52517b;
            z3Var2.f52518c = z3Var.f52518c;
            z3Var2.d = h0(z3Var.d, v3Var);
            return z3Var2;
        } else {
            return v3Var;
        }
    }

    public static boolean j(org.telegram.ui.i50 r25, org.telegram.ui.g4 r26, android.view.MotionEvent r27, android.view.View r28, org.telegram.ui.a3 r29, int r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.i4.j(org.telegram.ui.i50, org.telegram.ui.g4, android.view.MotionEvent, android.view.View, org.telegram.ui.a3, int, int):boolean");
    }

    public static org.telegram.ui.a3 n(org.telegram.ui.i50 r19, android.view.View r20, java.lang.CharSequence r21, org.telegram.tgnet.tl.TL_iv.RichText r22, int r23, int r24, org.telegram.tgnet.tl.TL_iv.PageBlock r25, android.text.Layout.Alignment r26, int r27, org.telegram.ui.g4 r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.i4.n(org.telegram.ui.i50, android.view.View, java.lang.CharSequence, org.telegram.tgnet.tl.TL_iv$RichText, int, int, org.telegram.tgnet.tl.TL_iv$PageBlock, android.text.Layout$Alignment, int, org.telegram.ui.g4):org.telegram.ui.a3");
    }

    public static a3 o(i50 i50Var, View view, CharSequence charSequence, TL_iv.RichText richText, int i3, int i10, TL_iv.PageBlock pageBlock, g4 g4Var) {
        return n(i50Var, view, charSequence, richText, i3, i10, pageBlock, Layout.Alignment.ALIGN_NORMAL, 0, g4Var);
    }

    public static void p(i50 i50Var, boolean z10) {
        int i3;
        if (f46069s1 == null) {
            f46069s1 = new Paint();
            f46068r1 = new Paint();
            Paint paint = new Paint(1);
            f46071u1 = paint;
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            f46071u1.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
            Paint paint2 = new Paint();
            f46072v1 = paint2;
            paint2.setStyle(style);
            f46072v1.setStrokeWidth(org.telegram.messenger.g0.L(1.0f) / 2.0f);
            f46073w1 = new Paint();
            f46074x1 = new Paint();
            f46075y1 = new Paint();
            f46076z1 = new Paint(1);
            A1 = new Paint(1);
            f46067q1 = new Paint();
            f46070t1 = new Paint();
            B1 = new Paint(1);
        } else if (!z10) {
            return;
        }
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27878d6, false);
        float green = Color.green(x02) * 0.7152f;
        float x10 = com.google.android.recaptcha.internal.a.x(Color.blue(x02), 0.0722f, green + (Color.red(x02) * 0.2126f), 255.0f);
        Paint paint3 = A1;
        if (x10 <= 0.705f) {
            i3 = -3041234;
        } else {
            i3 = -6551;
        }
        paint3.setColor(i3);
        Paint paint4 = f46076z1;
        int i10 = org.telegram.ui.ActionBar.k6.K6;
        paint4.setColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false) & 872415231);
        f46076z1.setPathEffect(org.telegram.ui.Components.n70.c());
        f46075y1.setColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false) & 872415231);
        f46075y1.setPathEffect(org.telegram.ui.Components.n70.c());
        Paint paint5 = f46072v1;
        int i11 = org.telegram.ui.ActionBar.k6.f28007k6;
        paint5.setColor(org.telegram.ui.ActionBar.k6.x0(null, i11, false));
        f46071u1.setColor(org.telegram.ui.ActionBar.k6.x0(null, i11, false));
        f46067q1.setColor(251658240);
        f46070t1.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27879d7, false));
        B1.setColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false) & 872415231);
        B1.setPathEffect(org.telegram.ui.Components.n70.c());
        int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.M6, false);
        int red = Color.red(x03);
        int green2 = Color.green(x03);
        int blue = Color.blue(x03);
        f46074x1.setColor(Color.argb(20, red, green2, blue));
        f46073w1.setColor(Color.argb(34, red, green2, blue));
        int x04 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        f46068r1.setColor(Color.argb(20, Color.red(x04), Color.green(x04), Color.blue(x04)));
        f46069s1.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Id, false));
    }

    public static void s(Canvas canvas, i50 i50Var, TL_iv.PageBlock pageBlock, int i3) {
        int i10;
        int L;
        int L2;
        if (pageBlock != null && i50Var != null && f46069s1 != null) {
            int i11 = 0;
            if (pageBlock.bottom) {
                i10 = org.telegram.messenger.g0.L(6.0f);
            } else {
                i10 = 0;
            }
            int i12 = i3 - i10;
            int i13 = pageBlock.quoteLevels;
            if (i13 == 0) {
                if (pageBlock.level > 0) {
                    canvas.drawRect(org.telegram.messenger.g0.L(18), 0.0f, org.telegram.messenger.g0.L(2.0f) + L2, i12, f46069s1);
                    return;
                }
                return;
            }
            while (i13 != 0) {
                if ((i13 & 1) != 0) {
                    canvas.drawRect(org.telegram.messenger.g0.L((i11 * 14) + 18), 0.0f, org.telegram.messenger.g0.L(2.0f) + L, i12, f46069s1);
                }
                i13 >>>= 1;
                i11++;
            }
        }
    }

    public static void t(org.telegram.ui.i50 r2, android.graphics.Canvas r3, org.telegram.ui.Cells.g9 r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.i4.t(org.telegram.ui.i50, android.graphics.Canvas, org.telegram.ui.Cells.g9, int):void");
    }

    public static TL_iv.RichText u(int i3, TL_iv.PageBlock pageBlock) {
        if (i3 == 2) {
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
            if (i3 == 0) {
                return pageblockembedpost.caption.text;
            }
            if (i3 == 1) {
                return pageblockembedpost.caption.credit;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
            TL_iv.pageBlockSlideshow pageblockslideshow = (TL_iv.pageBlockSlideshow) pageBlock;
            if (i3 == 0) {
                return pageblockslideshow.caption.text;
            }
            if (i3 == 1) {
                return pageblockslideshow.caption.credit;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            TL_iv.pageBlockPhoto pageblockphoto = (TL_iv.pageBlockPhoto) pageBlock;
            if (i3 == 0) {
                return pageblockphoto.caption.text;
            }
            if (i3 == 1) {
                return pageblockphoto.caption.credit;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockCollage) {
            TL_iv.pageBlockCollage pageblockcollage = (TL_iv.pageBlockCollage) pageBlock;
            if (i3 == 0) {
                return pageblockcollage.caption.text;
            }
            if (i3 == 1) {
                return pageblockcollage.caption.credit;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockEmbed) {
            TL_iv.pageBlockEmbed pageblockembed = (TL_iv.pageBlockEmbed) pageBlock;
            if (i3 == 0) {
                return pageblockembed.caption.text;
            }
            if (i3 == 1) {
                return pageblockembed.caption.credit;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            return ((TL_iv.pageBlockBlockquote) pageBlock).caption;
        } else {
            if (pageBlock instanceof TL_iv.pageBlockVideo) {
                TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
                if (i3 == 0) {
                    return pageblockvideo.caption.text;
                }
                if (i3 == 1) {
                    return pageblockvideo.caption.credit;
                }
            } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                return ((TL_iv.pageBlockPullquote) pageBlock).caption;
            } else {
                if (pageBlock instanceof TL_iv.pageBlockAudio) {
                    TL_iv.pageBlockAudio pageblockaudio = (TL_iv.pageBlockAudio) pageBlock;
                    if (i3 == 0) {
                        return pageblockaudio.caption.text;
                    }
                    if (i3 == 1) {
                        return pageblockaudio.caption.credit;
                    }
                } else if (pageBlock instanceof TL_iv.pageBlockCover) {
                    return u(i3, ((TL_iv.pageBlockCover) pageBlock).cover);
                } else {
                    if (pageBlock instanceof TL_iv.pageBlockMap) {
                        TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock;
                        if (i3 == 0) {
                            return pageblockmap.caption.text;
                        }
                        if (i3 == 1) {
                            return pageblockmap.caption.credit;
                        }
                    }
                }
            }
        }
        return null;
    }

    public static i4 v() {
        i4 i4Var;
        i4 i4Var2 = f46057e1;
        if (i4Var2 == null) {
            synchronized (i4.class) {
                try {
                    i4Var = f46057e1;
                    if (i4Var == null) {
                        i4Var = new i4();
                        f46057e1 = i4Var;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return i4Var;
        }
        return i4Var2;
    }

    public static View w(View view) {
        org.telegram.ui.Components.bj0 bj0Var;
        if (view instanceof w1) {
            org.telegram.ui.Components.bj0 bj0Var2 = ((w1) view).d;
            if (bj0Var2 != null) {
                return w(bj0Var2.f55540a);
            }
            return view;
        } else if ((view instanceof z1) && (bj0Var = ((z1) view).d) != null) {
            return w(bj0Var.f55540a);
        } else {
            return view;
        }
    }

    public static TL_iv.PageBlock x(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof x3) {
            TL_iv.PageBlock pageBlock2 = ((x3) pageBlock).d;
            if (pageBlock2 != null) {
                return x(pageBlock2);
            }
            return pageBlock2;
        } else if (pageBlock instanceof z3) {
            TL_iv.PageBlock pageBlock3 = ((z3) pageBlock).d;
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
            for (int i3 = 0; i3 < size; i3++) {
                sb2.append(z(richText.texts.get(i3)));
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
        ArrayList arrayList = this.f46084e0;
        int size = arrayList.size();
        u3 u3Var = this.L;
        boolean z11 = false;
        if (size <= 1) {
            ArticleViewer$WindowView articleViewer$WindowView = this.f46086g0;
            articleViewer$WindowView.f28899e = false;
            articleViewer$WindowView.d = false;
            l0 l0Var = this.f46087h0;
            if (u3Var != null) {
                x10 = u3Var.J * u3Var.f49951c.getWidth();
            } else {
                x10 = l0Var.getX();
            }
            AnimatorSet animatorSet = new AnimatorSet();
            float measuredWidth = l0Var.getMeasuredWidth() - x10;
            if (u3Var != null) {
                animatorSet.playTogether(u3Var.l(1.0f));
            } else {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.f46087h0, View.TRANSLATION_X, l0Var.getMeasuredWidth()), ObjectAnimator.ofFloat(this.f46086g0, f46058f1, l0Var.getMeasuredWidth()));
            }
            animatorSet.setDuration(Math.max((int) ((420.0f / l0Var.getMeasuredWidth()) * measuredWidth), 250));
            animatorSet.setInterpolator(org.telegram.ui.Components.xq.h);
            animatorSet.addListener(new t0(this));
            animatorSet.start();
            this.V0 = true;
            return;
        }
        ArticleViewer$WindowView articleViewer$WindowView2 = this.f46086g0;
        articleViewer$WindowView2.f28900f = true;
        articleViewer$WindowView2.f28899e = true;
        articleViewer$WindowView2.h = this.K0;
        this.f46100v0[1].setVisibility(0);
        this.f46100v0[1].setAlpha(1.0f);
        this.f46100v0[1].setTranslationX(0.0f);
        l3 l3Var = this.f46100v0[0];
        if (u3Var == null) {
            color = 0;
        } else {
            color = this.m0.getColor();
        }
        l3Var.setBackgroundColor(color);
        c0(-1, arrayList.get(arrayList.size() - 2), true);
        l3 l3Var2 = this.f46100v0[0];
        l3Var2.getX();
        AnimatorSet animatorSet2 = new AnimatorSet();
        l3Var2.getMeasuredWidth();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f46100v0[0], View.TRANSLATION_X, l3Var2.getMeasuredWidth()));
        animatorSet2.setDuration(420L);
        animatorSet2.setInterpolator(org.telegram.ui.Components.xq.h);
        animatorSet2.addListener(new u0(this));
        animatorSet2.start();
        m0 m0Var = this.f46088i0;
        l3 l3Var3 = this.f46100v0[0];
        if (l3Var3 != null && org.telegram.messenger.az.f21670v0) {
            x02 = l3Var3.getBackgroundColor();
        } else {
            x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Dl, false);
        }
        m0Var.setMenuColors(x02);
        m0 m0Var2 = this.f46088i0;
        l3 l3Var4 = this.f46100v0[0];
        if (l3Var4 != null && org.telegram.messenger.az.f21670v0) {
            x03 = l3Var4.getActionBarColor();
        } else {
            x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Dl, false);
        }
        m0Var2.d(x03, true);
        m0 m0Var3 = this.f46088i0;
        l3 l3Var5 = this.f46100v0[0];
        if (l3Var5 != null && l3Var5.e()) {
            z10 = true;
        } else {
            z10 = false;
        }
        m0Var3.setIsTonsite(z10);
        m0 m0Var4 = this.f46088i0;
        l3 l3Var6 = this.f46100v0[0];
        if (l3Var6 != null && l3Var6.d()) {
            z11 = true;
        }
        m0Var4.setIsLocal(z11);
        this.V0 = true;
    }

    public final void F(int i3) {
        int color;
        int x02;
        int x03;
        boolean z10;
        float x10;
        ArrayList arrayList = this.f46084e0;
        int size = arrayList.size();
        u3 u3Var = this.L;
        boolean z11 = false;
        if (size <= 1) {
            ArticleViewer$WindowView articleViewer$WindowView = this.f46086g0;
            articleViewer$WindowView.f28899e = false;
            articleViewer$WindowView.d = false;
            l0 l0Var = this.f46087h0;
            if (u3Var != null) {
                x10 = u3Var.J * u3Var.f49951c.getWidth();
            } else {
                x10 = l0Var.getX();
            }
            AnimatorSet animatorSet = new AnimatorSet();
            float measuredWidth = l0Var.getMeasuredWidth() - x10;
            if (u3Var != null) {
                animatorSet.playTogether(u3Var.l(1.0f));
            } else {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.f46087h0, View.TRANSLATION_X, l0Var.getMeasuredWidth()), ObjectAnimator.ofFloat(this.f46086g0, f46058f1, l0Var.getMeasuredWidth()));
            }
            animatorSet.setDuration(Math.max((int) ((420.0f / l0Var.getMeasuredWidth()) * measuredWidth), 250));
            animatorSet.setInterpolator(org.telegram.ui.Components.xq.h);
            animatorSet.addListener(new v0(this));
            animatorSet.start();
            this.V0 = true;
            return;
        }
        this.f46086g0.f28900f = true;
        this.f46100v0[1].setVisibility(0);
        this.f46100v0[1].setAlpha(1.0f);
        this.f46100v0[1].setTranslationX(0.0f);
        l3 l3Var = this.f46100v0[0];
        if (u3Var == null) {
            color = 0;
        } else {
            color = this.m0.getColor();
        }
        l3Var.setBackgroundColor(color);
        c0(-1, arrayList.get(i3), true);
        l3 l3Var2 = this.f46100v0[0];
        l3Var2.getX();
        AnimatorSet animatorSet2 = new AnimatorSet();
        l3Var2.getMeasuredWidth();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f46100v0[0], View.TRANSLATION_X, l3Var2.getMeasuredWidth()));
        animatorSet2.setDuration(420L);
        animatorSet2.setInterpolator(org.telegram.ui.Components.xq.h);
        animatorSet2.addListener(new w0(this, i3));
        animatorSet2.start();
        m0 m0Var = this.f46088i0;
        l3 l3Var3 = this.f46100v0[0];
        if (l3Var3 != null && org.telegram.messenger.az.f21670v0) {
            x02 = l3Var3.getBackgroundColor();
        } else {
            x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Dl, false);
        }
        m0Var.setMenuColors(x02);
        m0 m0Var2 = this.f46088i0;
        l3 l3Var4 = this.f46100v0[0];
        if (l3Var4 != null && org.telegram.messenger.az.f21670v0) {
            x03 = l3Var4.getActionBarColor();
        } else {
            x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Dl, false);
        }
        m0Var2.d(x03, true);
        m0 m0Var3 = this.f46088i0;
        l3 l3Var5 = this.f46100v0[0];
        if (l3Var5 != null && l3Var5.e()) {
            z10 = true;
        } else {
            z10 = false;
        }
        m0Var3.setIsTonsite(z10);
        m0 m0Var4 = this.f46088i0;
        l3 l3Var6 = this.f46100v0[0];
        if (l3Var6 != null && l3Var6.d()) {
            z11 = true;
        }
        m0Var4.setIsLocal(z11);
        this.V0 = true;
    }

    public final boolean H() {
        ArrayList arrayList = this.f46084e0;
        if (arrayList.size() <= 0 || !(arrayList.get(0) instanceof TLRPC.WebPage)) {
            return false;
        }
        return true;
    }

    public final void K() {
        this.W = false;
        int i3 = 0;
        while (true) {
            l3[] l3VarArr = this.f46100v0;
            if (i3 < l3VarArr.length) {
                l3VarArr[i3].b();
                i3++;
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
                ((r1) arrayList.get(i10)).a(false);
                i10++;
            } else {
                this.f46087h0.post(new b0(this, 0));
                org.telegram.messenger.hs.f(this.Y).k(org.telegram.messenger.hs.f23214d1, new Object[0]);
                return;
            }
        }
    }

    public final boolean L(org.telegram.messenger.zi ziVar, TLRPC.WebPage webPage, String str, String str2) {
        TLRPC.WebPage webPage2;
        boolean z10;
        int lastIndexOf;
        String substring;
        boolean z11;
        ?? r5;
        String str3;
        int i3;
        String lowerCase;
        TL_iv.Page page;
        if (this.M == null) {
            return false;
        }
        u3 u3Var = this.L;
        if (u3Var == null && this.W) {
            return false;
        }
        org.telegram.ui.ActionBar.d2 d2Var = this.N;
        if (d2Var != null && (d2Var.getParentLayout() instanceof ActionBarLayout)) {
            org.telegram.messenger.g0.v1((ActionBarLayout) this.N.getParentLayout());
        }
        if (ziVar != null) {
            if (webPage == null) {
                webPage2 = ziVar.f26868k.media.webpage;
            } else {
                webPage2 = webPage;
            }
            if (webPage2 != null && (page = webPage2.cached_page) != null && page.local != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            for (int i10 = 0; i10 < ziVar.f26868k.entities.size(); i10++) {
                TLRPC.MessageEntity messageEntity = ziVar.f26868k.entities.get(i10);
                if (messageEntity instanceof TLRPC.TL_messageEntityUrl) {
                    try {
                        String str4 = ziVar.f26868k.message;
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
        ArrayList arrayList = this.f46084e0;
        if (u3Var != null && !arrayList.isEmpty()) {
            z11 = z10;
            r5 = 1;
        } else {
            z11 = z10;
            r5 = 0;
        }
        if (r5 == 0) {
            arrayList.clear();
            this.f46087h0.setTranslationX(0.0f);
            if (u3Var != null) {
                u3Var.J = 0.0f;
                u3Var.f49951c.invalidate();
                u3Var.u();
                u3Var.r();
            }
            this.f46087h0.setTranslationY(0.0f);
            this.f46100v0[0].setTranslationY(0.0f);
            this.f46100v0[0].setTranslationX(0.0f);
            this.f46100v0[1].setTranslationX(0.0f);
            this.f46100v0[0].setAlpha(1.0f);
            this.f46086g0.setInnerTranslationX(0.0f);
            this.f46100v0[0].g();
            V(org.telegram.messenger.g0.L(56.0f));
        }
        if (u3Var != null && org.telegram.ui.web.w0.R0) {
            u3Var.f49949a.d();
        }
        if (webPage2 != null) {
            boolean f10 = f(webPage2, substring, r5);
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
                if (ziVar != null) {
                    i3 = ziVar.I1;
                } else {
                    i3 = org.telegram.messenger.h10.f22829t0;
                }
                int i12 = i3;
                ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getWebPage, new h0(this, i12, webPage2, ziVar, (boolean) r5, str3));
            }
        } else {
            e(r5, str2);
        }
        m0 m0Var = this.f46088i0;
        if (m0Var != null && r5 == 0) {
            m0Var.setIsLocal(this.f46100v0[0].d());
        }
        this.U = null;
        if (u3Var != null) {
            if (r5 == 0) {
                org.telegram.messenger.g0.E2(this.f46086g0);
                u3Var.d = this.f46086g0;
                u3Var.A();
                u3Var.f49951c.addView(this.f46086g0, b8.mf.c(-1.0f, -1));
            }
        } else if (!this.W) {
            WindowManager windowManager = (WindowManager) this.M.getSystemService("window");
            if (this.X) {
                try {
                    windowManager.removeView(this.f46086g0);
                } catch (Exception unused) {
                }
            }
            try {
                WindowManager.LayoutParams layoutParams = this.f46085f0;
                layoutParams.flags = -2013200384;
                if (Build.VERSION.SDK_INT >= 28) {
                    layoutParams.layoutInDisplayCutoutMode = 1;
                }
                this.f46086g0.setFocusable(false);
                this.f46087h0.setFocusable(false);
                windowManager.addView(this.f46086g0, this.f46085f0);
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
                return false;
            }
        } else {
            this.f46085f0.flags &= -17;
            ((WindowManager) this.M.getSystemService("window")).updateViewLayout(this.f46086g0, this.f46085f0);
        }
        this.W = true;
        this.f46077a0 = 1;
        if (r5 == 0) {
            if (u3Var != null) {
                if (r5 != 0) {
                    u3Var.f49949a.e();
                } else if (!u3Var.h) {
                    u3Var.q(u3Var.f49950b);
                    u3Var.o();
                }
            } else {
                this.f46086g0.setAlpha(0.0f);
                this.f46087h0.setAlpha(0.0f);
                AnimatorSet animatorSet = new AnimatorSet();
                ArticleViewer$WindowView articleViewer$WindowView = this.f46086g0;
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(articleViewer$WindowView, property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f46087h0, property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f46086g0, View.TRANSLATION_X, org.telegram.messenger.g0.L(56.0f), 0.0f));
                this.f46079b0 = new b0(this, 1);
                animatorSet.setDuration(150L);
                animatorSet.setInterpolator(this.f46083d0);
                animatorSet.addListener(new q0(this));
                this.f46081c0 = System.currentTimeMillis();
                org.telegram.messenger.g0.h3(new org.telegram.messenger.voip.l0(12, this, animatorSet));
            }
        }
        this.f46087h0.setLayerType(2, null);
        return true;
    }

    public final void N(long j10, TLRPC.User user) {
        if (user != null && (this.M instanceof LaunchActivity)) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f27150id);
            bundle.putString("botUser", "webpage" + j10);
            ((LaunchActivity) this.M).u0(new wm(bundle), false, true);
            m(false, true);
        }
    }

    public final void O(String str, String str2, k0 k0Var) {
        Activity activity = this.M;
        if (activity != null && !activity.isFinishing()) {
            l3 l3Var = this.f46100v0[0];
            if (l3Var != null && l3Var.d()) {
                String M0 = org.telegram.messenger.bd.M0(2131747790, null);
                int indexOf = M0.indexOf("%");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(String.format(M0, str));
                if (indexOf >= 0) {
                    spannableStringBuilder.setSpan(new URLSpan(str), indexOf, str.length() + indexOf, 33);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.M, null);
                String M02 = org.telegram.messenger.bd.M0(2131747787, null);
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                s1Var.S = M02;
                s1Var.U = spannableStringBuilder;
                s1Var.f28544i0 = false;
                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747825, null), new a1.d(this, str, str2, k0Var, 5));
                alertDialog$Builder.p();
                return;
            }
            P(str, str2, k0Var);
        }
    }

    public final void P(String str, String str2, sf.b bVar) {
        u3 u3Var;
        sf.b bVar2 = this.O0;
        if (bVar2 != null) {
            bVar2.a(false);
        }
        this.O0 = bVar;
        if (this.H0 != 0) {
            ConnectionsManager.getInstance(this.Y).cancelRequest(this.H0, false);
            this.H0 = 0;
        }
        boolean[] zArr = new boolean[1];
        if (sf.c.m(this.M, str, false)) {
            if (this.f46084e0.isEmpty() && (u3Var = this.L) != null) {
                u3Var.a(false);
                return;
            }
            return;
        }
        g0 g0Var = new g0(this, str, zArr, bVar);
        int i3 = this.J0 + 1;
        this.J0 = i3;
        Z(true);
        TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
        tL_messages_getWebPage.url = str;
        tL_messages_getWebPage.hash = 0;
        this.H0 = ConnectionsManager.getInstance(this.Y).sendRequest(tL_messages_getWebPage, new org.telegram.messenger.gx(this, i3, bVar, str2, g0Var, tL_messages_getWebPage));
        if (bVar != null) {
            bVar.f54708b = new ai.e3(this, i3, bVar, 28);
            bVar.d();
        }
    }

    public final void Q() {
        int x02;
        int x03;
        TextView textView = this.D0;
        if (textView != null) {
            int i3 = org.telegram.ui.ActionBar.k6.f27972i6;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i3, false), 2, -1);
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i3);
            textView.setBackground(h02);
            org.telegram.ui.ActionBar.r6.k(textView, h02, null, N, null);
            org.telegram.ui.ActionBar.r6.V(this.D0, org.telegram.ui.ActionBar.k6.E8, null);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.C0;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, null);
        }
        ImageView imageView = this.f46097s0;
        if (imageView != null) {
            org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.G6, null, PorterDuff.Mode.MULTIPLY);
            ImageView imageView2 = this.f46097s0;
            int i10 = org.telegram.ui.ActionBar.k6.f28292z8;
            org.telegram.ui.ActionBar.r6.R(imageView2, org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i10, false), 1, -1), null, org.telegram.ui.ActionBar.r6.N(i10), null);
        }
        ImageView imageView3 = this.f46098t0;
        if (imageView3 != null) {
            org.telegram.ui.ActionBar.r6.t(imageView3, org.telegram.ui.ActionBar.k6.G6, null, PorterDuff.Mode.MULTIPLY);
            ImageView imageView4 = this.f46098t0;
            int i11 = org.telegram.ui.ActionBar.k6.f28292z8;
            org.telegram.ui.ActionBar.r6.R(imageView4, org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i11, false), 1, -1), null, org.telegram.ui.ActionBar.r6.N(i11), null);
        }
        org.telegram.ui.Components.h6 h6Var = this.f46099u0;
        if (h6Var != null) {
            org.telegram.ui.ActionBar.r6.Z(h6Var, org.telegram.ui.ActionBar.k6.G6, null);
        }
        m0 m0Var = this.f46088i0;
        if (m0Var != null) {
            l3 l3Var = this.f46100v0[0];
            if (l3Var != null && org.telegram.messenger.az.f21670v0) {
                x02 = l3Var.getBackgroundColor();
            } else {
                x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Dl, false);
            }
            m0Var.setMenuColors(x02);
            m0 m0Var2 = this.f46088i0;
            l3 l3Var2 = this.f46100v0[0];
            if (l3Var2 != null && org.telegram.messenger.az.f21670v0) {
                x03 = l3Var2.getActionBarColor();
            } else {
                x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Dl, false);
            }
            m0Var2.d(x03, true);
        }
        this.m0.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Dl, false));
    }

    public final void S() {
        int L0;
        int i3;
        boolean z10 = false;
        l3 l3Var = this.f46100v0[0];
        if (l3Var.f47084c.F != null && (L0 = l3Var.d.L0()) != -1) {
            View m10 = this.f46100v0[0].d.m(L0);
            if (m10 != null) {
                i3 = m10.getTop();
            } else {
                i3 = 0;
            }
            String str = "article" + this.f46100v0[0].f47084c.F.f27156id;
            SharedPreferences.Editor putInt = org.telegram.messenger.t0.f25457b.getSharedPreferences("articles", 0).edit().putInt(str, L0).putInt(str + "o", i3);
            String q10 = t4.c.q(str, "r");
            Point point = org.telegram.messenger.g0.f22608q;
            if (point.x > point.y) {
                z10 = true;
            }
            putInt.putBoolean(q10, z10).commit();
        }
    }

    public final boolean T(String str, boolean z10) {
        String lowerCase;
        Integer num = 0;
        if (!TextUtils.isEmpty(str)) {
            String lowerCase2 = str.toLowerCase();
            Integer num2 = (Integer) this.f46100v0[0].f47084c.h.get(lowerCase2);
            if (num2 != null) {
                TL_iv.textAnchor textanchor = (TL_iv.textAnchor) this.f46100v0[0].f47084c.f45519r.get(lowerCase2);
                if (textanchor != null) {
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    if (!TextUtils.isEmpty(this.f46100v0[0].f47084c.F.cached_page.url)) {
                        lowerCase = this.f46100v0[0].f47084c.F.cached_page.url.toLowerCase();
                    } else {
                        lowerCase = this.f46100v0[0].f47084c.F.url.toLowerCase();
                    }
                    pageblockparagraph.text = org.telegram.ui.web.u1.d(textanchor.text, lowerCase, lowerCase2);
                    this.f46100v0[0].f47084c.getClass();
                    int I = g4.I(pageblockparagraph);
                    u4.d1 x10 = this.f46100v0[0].f47084c.x(null, I);
                    View view = x10.f55540a;
                    this.f46100v0[0].f47084c.H(I, x10, pageblockparagraph, 0, 0, false);
                    org.telegram.ui.ActionBar.t2 h = org.telegram.messenger.camera.q.h(this.M, false, 1, null);
                    h.f28619v0 = false;
                    h.f28621w0 = false;
                    LinearLayout linearLayout = new LinearLayout(this.M);
                    linearLayout.setOrientation(1);
                    org.telegram.ui.Cells.h9 h9Var = new org.telegram.ui.Cells.h9();
                    this.R0 = h9Var;
                    h9Var.S(linearLayout);
                    this.R0.D = new o0(this, 1);
                    int i3 = 5;
                    ci.ec ecVar = new ci.ec(this.M, 5);
                    ecVar.setTextSize(1, 16.0f);
                    ecVar.setTypeface(org.telegram.messenger.g0.o());
                    ecVar.setText(org.telegram.messenger.bd.M0(2131749200, null));
                    if (!this.f46100v0[0].f47084c.H) {
                        i3 = 3;
                    }
                    ecVar.setGravity(i3 | 16);
                    ecVar.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
                    ecVar.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
                    linearLayout.addView(ecVar, new LinearLayout.LayoutParams(-1, org.telegram.messenger.g0.L(48.0f) + 1));
                    view.setTag("bottomSheet");
                    linearLayout.addView(view, b8.mf.k(0.0f, 7.0f, 0.0f, 0.0f, -1, -2));
                    org.telegram.ui.Cells.t9 n4 = this.R0.n(this.M);
                    ai.c0 c0Var = new ai.c0(this, this.M, linearLayout, 8);
                    h.f28626z0 = new i0(this, 0);
                    c0Var.addView(linearLayout, -1, -2);
                    c0Var.addView(n4, -1, -2);
                    h.O = c0Var;
                    if (this.Q0.x()) {
                        this.Q0.f(false);
                    }
                    this.J = h;
                    Y(h);
                    return true;
                } else if (num2.intValue() >= 0 && num2.intValue() < this.f46100v0[0].f47084c.f45516e.size()) {
                    TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) this.f46100v0[0].f47084c.f45516e.get(num2.intValue());
                    TL_iv.PageBlock x11 = x(pageBlock);
                    if ((x11 instanceof v3) && M((v3) x11)) {
                        this.f46100v0[0].f47084c.M();
                        this.f46100v0[0].f47084c.f();
                    }
                    int indexOf = this.f46100v0[0].f47084c.d.indexOf(pageBlock);
                    if (indexOf != -1) {
                        num2 = Integer.valueOf(indexOf);
                    }
                    Integer num3 = (Integer) this.f46100v0[0].f47084c.f45518n.get(lowerCase2);
                    if (num3 != null) {
                        if (num3.intValue() == -1) {
                            this.f46100v0[0].f47084c.getClass();
                            int I2 = g4.I(pageBlock);
                            u4.d1 x12 = this.f46100v0[0].f47084c.x(null, I2);
                            this.f46100v0[0].f47084c.H(I2, x12, pageBlock, 0, 0, false);
                            x12.f55540a.measure(View.MeasureSpec.makeMeasureSpec(this.f46100v0[0].f47083b.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                            Integer num4 = (Integer) this.f46100v0[0].f47084c.f45518n.get(lowerCase2);
                            if (num4.intValue() != -1) {
                                num = num4;
                            }
                        } else {
                            num = num3;
                        }
                    }
                    if (this.f46100v0[0].f47084c.J) {
                        num2 = Integer.valueOf(num2.intValue() + 1);
                    }
                    if (z10) {
                        org.telegram.ui.Components.zt0 zt0Var = new org.telegram.ui.Components.zt0(this.f46100v0[0].getContext());
                        zt0Var.f55704a = num2.intValue();
                        zt0Var.f41110s = (-org.telegram.messenger.g0.L(56.0f)) - num.intValue();
                        this.f46100v0[0].d.w0(zt0Var);
                        return true;
                    }
                    this.f46100v0[0].d.h1(num2.intValue(), (-org.telegram.messenger.g0.L(56.0f)) - num.intValue());
                    return true;
                }
            }
        }
        return false;
    }

    public final void U(int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.i4.U(int):void");
    }

    public final void V(int i3) {
        m0 m0Var = this.f46088i0;
        if (m0Var != null && !m0Var.U && !m0Var.f50871a0) {
            int j10 = Utilities.j(i3, org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(24.0f));
            this.K0 = j10;
            this.f46088i0.setHeight(j10);
            this.Q0.f30693x = this.K0;
            int i10 = 0;
            while (true) {
                l3[] l3VarArr = this.f46100v0;
                if (i10 < l3VarArr.length) {
                    l3VarArr[i10].f47083b.setTopGlowOffset(this.K0);
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void W(Activity activity, org.telegram.ui.ActionBar.d2 d2Var) {
        cg.u0 u0Var;
        int i3;
        boolean z10;
        int x02;
        int i10;
        u3 u3Var;
        cg.u0 u0Var2 = this.W0;
        if (u0Var2 != null) {
            u0Var2.b();
            this.W0 = null;
        }
        LaunchActivity launchActivity = LaunchActivity.K1;
        if (launchActivity != null) {
            u0Var = new cg.u0(launchActivity, true);
        } else {
            u0Var = null;
        }
        this.W0 = u0Var;
        this.N = d2Var;
        if (!(d2Var instanceof gx)) {
            i3 = d2Var.getCurrentAccount();
        } else {
            i3 = org.telegram.messenger.h10.f22829t0;
        }
        this.Y = i3;
        org.telegram.messenger.hs.f(i3).c(this, org.telegram.messenger.hs.f23221e2);
        org.telegram.messenger.hs.f(this.Y).c(this, org.telegram.messenger.hs.f23227f2);
        org.telegram.messenger.hs.f(this.Y).c(this, org.telegram.messenger.hs.f23233g2);
        org.telegram.messenger.hs.f(this.Y).c(this, org.telegram.messenger.hs.f23239h2);
        org.telegram.messenger.hs.f(this.Y).c(this, org.telegram.messenger.hs.f23246i4);
        Activity activity2 = this.M;
        if (activity2 != activity && (activity2 == null || !this.K || (u3Var = this.L) == null || u3Var.f49952e == null)) {
            this.M = activity;
            this.f46110a = org.telegram.messenger.t0.f25457b.getSharedPreferences("articles", 0).getInt("font_type", 0);
            p(this, false);
            this.m0 = new Paint();
            this.f46092n0 = activity.getResources().getDrawable(2131231619);
            this.f46093o0 = new Paint();
            ArticleViewer$WindowView articleViewer$WindowView = new ArticleViewer$WindowView(this, activity);
            this.f46086g0 = articleViewer$WindowView;
            articleViewer$WindowView.setWillNotDraw(false);
            this.f46086g0.setClipChildren(true);
            this.f46086g0.setFocusable(false);
            l0 l0Var = new l0(0, activity, this);
            this.f46087h0 = l0Var;
            this.f46086g0.addView(l0Var, b8.mf.e(-1, -1, 51));
            if (this.L == null) {
                this.f46086g0.setFitsSystemWindows(true);
                this.f46087h0.setOnApplyWindowInsetsListener(new org.telegram.ui.ActionBar.u2(1));
            }
            FrameLayout frameLayout = new FrameLayout(activity);
            this.Q = frameLayout;
            frameLayout.setBackgroundColor(-16777216);
            this.Q.setVisibility(4);
            this.f46086g0.addView(this.Q, b8.mf.c(-1.0f, -1));
            l4 l4Var = new l4(activity);
            this.S = l4Var;
            l4Var.setVisibility(0);
            this.S.setBackgroundColor(-16777216);
            this.Q.addView(this.S, b8.mf.e(-1, -1, 17));
            this.R = new TextureView(activity);
            this.f46100v0 = new l3[2];
            int i11 = 0;
            while (true) {
                l3[] l3VarArr = this.f46100v0;
                int i12 = 8;
                if (i11 >= l3VarArr.length) {
                    break;
                }
                l3 l3Var = new l3(this, activity);
                l3VarArr[i11] = l3Var;
                if (i11 == 0) {
                    i12 = 0;
                }
                l3Var.setVisibility(i12);
                this.f46087h0.addView(l3Var, b8.mf.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
                l3Var.f47083b.setOnItemLongClickListener(new s(this));
                l3Var.f47083b.setOnItemClickListener(new mi.d4(12, this, l3Var));
                i11++;
            }
            this.f46087h0.addView(new FrameLayout(activity), b8.mf.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f46102x0.setColor(-16777216);
            this.f46103y0.setColor(-16777216);
            this.B0.setColor(-14408666);
            this.f46104z0.setColor(-16777216);
            m0 m0Var = new m0(this, activity);
            this.f46088i0 = m0Var;
            if (this.L != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            m0Var.f50880f0 = z10;
            this.f46087h0.addView(m0Var, b8.mf.e(-1, -2, 48));
            this.f46088i0.setOnClickListener(new org.telegram.messenger.video.g(7, this, activity));
            this.f46088i0.f50875c0.addTextChangedListener(new n0(this, 0));
            org.telegram.ui.web.l lVar = new org.telegram.ui.web.l(activity);
            this.f46089j0 = lVar;
            lVar.setOpenProgress(0.0f);
            this.f46089j0.f50934x.j(new h3(this, 2));
            this.f46087h0.addView(this.f46089j0, b8.mf.c(-1.0f, -1));
            this.f46090k0 = new b0(this, 3);
            this.f46088i0.M.setOnClickListener(new r(this, 2));
            this.f46088i0.M.setOnLongClickListener(new t(this, 0));
            this.f46088i0.setMenuListener(new mi.f(8, this, activity));
            this.f46088i0.P.setOnClickListener(new r(this, 3));
            ai.d2 d2Var2 = new ai.d2(this.M, 8);
            this.f46096r0 = d2Var2;
            d2Var2.setOnTouchListener(new fi.a(3));
            this.f46096r0.setWillNotDraw(false);
            this.f46096r0.setTranslationY(org.telegram.messenger.g0.L(51.0f));
            this.f46096r0.setVisibility(4);
            this.f46096r0.setFocusable(true);
            this.f46096r0.setFocusableInTouchMode(true);
            this.f46096r0.setClickable(true);
            this.f46096r0.setPadding(0, org.telegram.messenger.g0.L(3.0f), 0, 0);
            this.f46087h0.addView(this.f46096r0, b8.mf.e(-1, 51, 80));
            new gi.p3(this.f46086g0, false, new q(this, 0));
            ImageView imageView = new ImageView(this.M);
            this.f46097s0 = imageView;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            this.f46097s0.setImageResource(2131232174);
            ImageView imageView2 = this.f46097s0;
            int i13 = org.telegram.ui.ActionBar.k6.G6;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.r6.t(imageView2, i13, null, mode);
            ImageView imageView3 = this.f46097s0;
            int i14 = org.telegram.ui.ActionBar.k6.f28292z8;
            org.telegram.ui.ActionBar.r6.R(imageView3, org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i14, false), 1, -1), null, org.telegram.ui.ActionBar.r6.N(i14), null);
            this.f46096r0.addView(this.f46097s0, b8.mf.d(48, 48.0f, 53, 0.0f, 0.0f, 48.0f, 0.0f));
            this.f46097s0.setOnClickListener(new r(this, 0));
            this.f46097s0.setContentDescription(org.telegram.messenger.bd.M0(2131754779, null));
            ImageView imageView4 = new ImageView(this.M);
            this.f46098t0 = imageView4;
            imageView4.setScaleType(scaleType);
            this.f46098t0.setImageResource(2131232173);
            org.telegram.ui.ActionBar.r6.t(this.f46098t0, i13, null, mode);
            org.telegram.ui.ActionBar.r6.R(this.f46098t0, org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i14, false), 1, -1), null, org.telegram.ui.ActionBar.r6.N(i14), null);
            this.f46096r0.addView(this.f46098t0, b8.mf.d(48, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f46098t0.setOnClickListener(new r(this, 1));
            this.f46098t0.setContentDescription(org.telegram.messenger.bd.M0(2131754778, null));
            org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(this.M, true, true, true);
            this.f46099u0 = h6Var;
            h6Var.setScaleProperty(0.6f);
            this.f46099u0.b(0.4f, 350L, org.telegram.ui.Components.xq.h);
            org.telegram.ui.ActionBar.r6.Z(this.f46099u0, i13, null);
            this.f46099u0.setTextSize(org.telegram.messenger.g0.L(15.0f));
            this.f46099u0.setTypeface(org.telegram.messenger.g0.o());
            this.f46099u0.setGravity(3);
            this.f46099u0.getDrawable().M = org.telegram.messenger.g0.f22608q.x;
            this.f46096r0.addView(this.f46099u0, b8.mf.d(-2, -2.0f, 19, 18.0f, 0.0f, 108.0f, 0.0f));
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.f46085f0 = layoutParams;
            layoutParams.height = -1;
            layoutParams.format = -3;
            layoutParams.width = -1;
            layoutParams.gravity = 51;
            layoutParams.type = 98;
            layoutParams.softInputMode = 48;
            layoutParams.flags = 131072;
            if (this.L == null) {
                x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27824a7, true);
            } else {
                x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27824a7, false);
            }
            if (org.telegram.messenger.g0.B(x02) >= 0.721f && Build.VERSION.SDK_INT >= 26) {
                i10 = 1808;
            } else {
                i10 = 1792;
            }
            this.f46104z0.setColor(x02);
            this.A0 = true;
            WindowManager.LayoutParams layoutParams2 = this.f46085f0;
            layoutParams2.systemUiVisibility = i10;
            layoutParams2.flags |= -2147417856;
            if (Build.VERSION.SDK_INT >= 28) {
                layoutParams2.layoutInDisplayCutoutMode = 1;
            }
            org.telegram.ui.Cells.h9 h9Var = new org.telegram.ui.Cells.h9();
            this.Q0 = h9Var;
            h9Var.S(this.f46100v0[0].f47083b);
            if (org.telegram.messenger.hp.s1(this.Y).f23120s7.s()) {
                this.Q0.f30678k0 = new s(this);
            }
            org.telegram.ui.Cells.h9 h9Var2 = this.Q0;
            h9Var2.f29362z0 = this.f46100v0[0].d;
            h9Var2.D = new o0(this, 0);
            this.f46087h0.addView(h9Var2.n(activity));
            l0 l0Var2 = this.f46087h0;
            vq0 vq0Var = new vq0(l0Var2, l0Var2);
            this.S0 = vq0Var;
            vq0Var.F = new s(this);
            vq0Var.E = new f(this, 1);
            this.m0.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Dl, false));
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
        org.telegram.ui.ActionBar.t2 t2Var = this.J;
        if (t2Var != null) {
            t2Var.dismiss();
            this.J = null;
        }
        org.telegram.ui.ActionBar.t2 h = org.telegram.messenger.camera.q.h(this.M, false, 1, null);
        try {
            str2 = URLDecoder.decode(str.replaceAll("\\+", "%2b"), "UTF-8");
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            str2 = str;
        }
        h.P = str2;
        h.Q = false;
        h.R = true;
        CharSequence[] charSequenceArr = {org.telegram.messenger.bd.M0(2131747825, null), org.telegram.messenger.bd.M0(2131751767, null)};
        u uVar = new u(0, this, str);
        h.M = charSequenceArr;
        h.L = uVar;
        h.I0 = new v(this, 0);
        Y(h);
    }

    public final void Y(org.telegram.ui.ActionBar.t2 t2Var) {
        if (this.M != null) {
            try {
                org.telegram.ui.ActionBar.t2 t2Var2 = this.f46091l0;
                if (t2Var2 != null) {
                    t2Var2.dismiss();
                    this.f46091l0 = null;
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            try {
                this.f46091l0 = t2Var;
                t2Var.setCanceledOnTouchOutside(true);
                this.f46091l0.setOnDismissListener(new v(this, 1));
                t2Var.show();
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
        }
    }

    public final void Z(boolean z10) {
        org.telegram.messenger.g0.r(this.f46090k0);
        if (z10) {
            this.f46088i0.f50878e0.a(false, 0.0f);
            this.f46088i0.f50878e0.a(true, 0.3f);
            org.telegram.messenger.g0.i3(this.f46090k0, 100L);
            return;
        }
        this.f46088i0.f50878e0.a(true, 1.0f);
    }

    @Override
    public final void a(g4 g4Var, org.telegram.ui.Components.py0 py0Var) {
        String str;
        String str2;
        org.telegram.ui.Components.t70 t70Var;
        String lowerCase;
        if (py0Var != null && (str = py0Var.f37285b) != null) {
            org.telegram.ui.ActionBar.t2 t2Var = this.J;
            k0 k0Var = null;
            if (t2Var != null) {
                t2Var.dismiss();
                this.J = null;
            }
            int lastIndexOf = str.lastIndexOf(35);
            boolean z10 = false;
            if (lastIndexOf != -1) {
                if (!TextUtils.isEmpty(g4Var.F.cached_page.url)) {
                    lowerCase = g4Var.F.cached_page.url.toLowerCase();
                } else {
                    lowerCase = g4Var.F.url.toLowerCase();
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
                a3 a3Var = this.d;
                if (a3Var != null && (t70Var = this.f46111b) != null) {
                    k0Var = new k0(this, a3Var, t70Var);
                }
                O(str, str2, k0Var);
            }
        }
    }

    public final void a0() {
        LaunchActivity launchActivity;
        FrameLayout frameLayout;
        if (this.X && (launchActivity = LaunchActivity.K1) != null && !launchActivity.isFinishing()) {
            if (this.f46100v0[0].f()) {
                if (this.f46100v0[0].getWebView() != null) {
                    frameLayout = this.f46100v0[0].f47086f;
                } else {
                    return;
                }
            } else {
                l3 l3Var = this.f46100v0[0];
                TLRPC.WebPage webPage = l3Var.f47084c.F;
                frameLayout = l3Var;
                if (webPage == null) {
                    return;
                }
            }
            new org.telegram.ui.Components.fc(frameLayout, null).G(2131623981, 4, org.telegram.messenger.g0.U2(org.telegram.messenger.bd.M0(2131752874, null), new b0(this, 11))).k(true);
        }
    }

    @Override
    public final boolean b(TL_iv.PageBlock pageBlock, g4 g4Var) {
        int indexOf;
        List list;
        org.telegram.ui.ActionBar.d2 d2Var = this.N;
        if (d2Var != null && d2Var.getParentActivity() != null) {
            if ((pageBlock instanceof TL_iv.pageBlockVideo) && !e4.g(g4Var.F, pageBlock)) {
                list = Collections.singletonList(pageBlock);
                indexOf = 0;
            } else {
                ArrayList arrayList = new ArrayList(g4Var.f45517f);
                indexOf = g4Var.f45517f.indexOf(pageBlock);
                list = arrayList;
            }
            PhotoViewer v12 = PhotoViewer.v1();
            v12.N2(null, this.N, null);
            if (v12.h2(null, null, null, null, null, null, null, indexOf, new e3(this, list), null, 0L, 0L, 0L, true, new n3(this, g4Var.F, list), null)) {
                l();
                return true;
            }
        }
        return false;
    }

    public final void b0(boolean z10) {
        float f10;
        this.f46096r0.setVisibility(0);
        ValueAnimator valueAnimator = this.Z0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.f46078a1;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.Z0 = ofFloat;
        ofFloat.addUpdateListener(new p(this, 1));
        this.Z0.addListener(new dh.x(19, this, z10));
        this.Z0.setDuration(320L);
        this.Z0.setInterpolator(org.telegram.ui.Components.xq.h);
        this.Z0.start();
    }

    public final void c0(int i3, Object obj, boolean z10) {
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
            if (((obj instanceof TLRPC.WebPage) && ((TLRPC.WebPage) obj).cached_page != null) || (obj instanceof y2)) {
                int i13 = 1;
                if (!z10 && i3 != 0) {
                    l3[] l3VarArr = this.f46100v0;
                    l3 l3Var = l3VarArr[1];
                    l3VarArr[1] = l3VarArr[0];
                    l3VarArr[0] = l3Var;
                    this.f46088i0.i();
                    this.f46080b1.a(this.f46100v0[0].getBackgroundColor(), true);
                    this.f46082c1.a(this.f46100v0[1].getBackgroundColor(), true);
                    u3 u3Var = this.L;
                    if (u3Var != null) {
                        u3Var.z();
                    }
                    int indexOfChild = this.f46087h0.indexOfChild(this.f46100v0[0]);
                    int indexOfChild2 = this.f46087h0.indexOfChild(this.f46100v0[1]);
                    if (i3 == 1) {
                        if (indexOfChild < indexOfChild2) {
                            this.f46087h0.removeView(this.f46100v0[0]);
                            this.f46087h0.addView(this.f46100v0[0], indexOfChild2);
                        }
                    } else if (indexOfChild2 < indexOfChild) {
                        this.f46087h0.removeView(this.f46100v0[0]);
                        this.f46087h0.addView(this.f46100v0[0], indexOfChild);
                    }
                    this.f46101w0 = new AnimatorSet();
                    this.f46100v0[0].setVisibility(0);
                    if (i3 == 1) {
                        i12 = 0;
                    } else {
                        i12 = 1;
                    }
                    l3 l3Var2 = this.f46100v0[i12];
                    if (this.L == null) {
                        color = 0;
                    } else {
                        color = this.m0.getColor();
                    }
                    l3Var2.setBackgroundColor(color);
                    this.f46100v0[i12].setLayerType(2, null);
                    if (i3 == 1) {
                        l3 l3Var3 = this.f46100v0[0];
                        Point point = org.telegram.messenger.g0.f22608q;
                        l3Var3.setTranslationX(point.x);
                        this.f46101w0.playTogether(ObjectAnimator.ofFloat(this.f46100v0[0], View.TRANSLATION_X, point.x, 0.0f));
                    } else if (i3 == -1) {
                        this.f46100v0[0].setTranslationX(0.0f);
                        this.f46101w0.playTogether(ObjectAnimator.ofFloat(this.f46100v0[1], View.TRANSLATION_X, 0.0f, org.telegram.messenger.g0.f22608q.x));
                    }
                    this.f46101w0.setDuration(320L);
                    this.f46101w0.setInterpolator(org.telegram.ui.Components.xq.h);
                    this.f46101w0.addListener(new s0(this, i12, 0));
                    this.f46086g0.f28900f = true;
                    m0 m0Var = this.f46088i0;
                    l3 l3Var4 = this.f46100v0[0];
                    if (l3Var4 != null && org.telegram.messenger.az.f21670v0) {
                        x02 = l3Var4.getBackgroundColor();
                    } else {
                        x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Dl, false);
                    }
                    m0Var.setMenuColors(x02);
                    m0 m0Var2 = this.f46088i0;
                    l3 l3Var5 = this.f46100v0[0];
                    if (l3Var5 != null && org.telegram.messenger.az.f21670v0) {
                        x03 = l3Var5.getActionBarColor();
                    } else {
                        x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Dl, false);
                    }
                    m0Var2.d(x03, true);
                    m0 m0Var3 = this.f46088i0;
                    l3 l3Var6 = this.f46100v0[0];
                    if (l3Var6 != null && l3Var6.e()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    m0Var3.setIsTonsite(z11);
                    m0 m0Var4 = this.f46088i0;
                    l3 l3Var7 = this.f46100v0[0];
                    if (l3Var7 != null && l3Var7.d()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    m0Var4.setIsLocal(z12);
                    AnimatorSet animatorSet = this.f46101w0;
                    Objects.requireNonNull(animatorSet);
                    org.telegram.messenger.g0.h3(new xp0(animatorSet, 4));
                }
                if (!z10) {
                    this.Q0.f(true);
                }
                g4 g4Var = this.f46100v0[z10 ? 1 : 0].f47084c;
                if (z10) {
                    obj = k2.p1.h(2, this.f46084e0);
                }
                this.f46100v0[z10 ? 1 : 0].b();
                if (obj instanceof TLRPC.WebPage) {
                    TLRPC.WebPage webPage = (TLRPC.WebPage) obj;
                    this.f46100v0[z10 ? 1 : 0].setWeb(null);
                    this.f46100v0[z10 ? 1 : 0].setType(0);
                    TL_iv.Page page = webPage.cached_page;
                    g4Var.H = page.rtl;
                    g4Var.F = webPage;
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
                                        g4Var.G = (TL_iv.pageBlockChannel) pageBlock2;
                                    }
                                }
                            }
                        } else if (i14 == 1 && g4Var.G != null) {
                        }
                        if (i14 == size - 1) {
                            i11 = i14;
                        } else {
                            i11 = 0;
                        }
                        g4Var.F(g4Var, pageBlock, 0, 0, i11);
                    }
                    g4Var.f();
                    if (this.f46084e0.size() != 1 && i3 != -1) {
                        u4.b0 b0Var = this.f46100v0[z10 ? 1 : 0].d;
                        u3 u3Var2 = this.L;
                        if (u3Var2 == null) {
                            i13 = 0;
                        }
                        if (u3Var2 != null) {
                            i10 = org.telegram.messenger.g0.L(32.0f);
                        } else {
                            i10 = 0;
                        }
                        b0Var.h1(i13, i10);
                    } else {
                        SharedPreferences sharedPreferences = org.telegram.messenger.t0.f25457b.getSharedPreferences("articles", 0);
                        String str = "article" + webPage.f27156id;
                        int i15 = sharedPreferences.getInt(str, -1);
                        boolean z13 = sharedPreferences.getBoolean(str + "r", true);
                        Point point2 = org.telegram.messenger.g0.f22608q;
                        if (point2.x <= point2.y) {
                            i13 = 0;
                        }
                        if (z13 == i13) {
                            L = sharedPreferences.getInt(str + "o", 0) - this.f46100v0[z10 ? 1 : 0].f47083b.getPaddingTop();
                        } else {
                            L = org.telegram.messenger.g0.L(10.0f);
                        }
                        if (i15 != -1) {
                            this.f46100v0[z10 ? 1 : 0].d.h1(i15, L);
                        }
                    }
                } else if (obj instanceof y2) {
                    this.f46100v0[z10 ? 1 : 0].setType(1);
                    this.f46100v0[z10 ? 1 : 0].g();
                    this.f46100v0[z10 ? 1 : 0].setWeb((y2) obj);
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
        l3[] l3VarArr;
        l3 l3Var;
        float translationX;
        boolean z10;
        boolean z11;
        l3 l3Var2;
        float f10;
        boolean z12;
        boolean z13;
        if (this.f46088i0 != null && (l3Var = (l3VarArr = this.f46100v0)[0]) != null && l3VarArr[1] != null) {
            int visibility = l3Var.getVisibility();
            float f11 = 0.0f;
            if (visibility != 0) {
                translationX = 0.0f;
            } else {
                translationX = 1.0f - (this.f46100v0[0].getTranslationX() / this.f46100v0[0].getWidth());
            }
            float f12 = 1.0f - translationX;
            m0 m0Var = this.f46088i0;
            m0Var.d[0] = this.f46100v0[0].getProgress();
            m0Var.invalidate();
            m0 m0Var2 = this.f46088i0;
            m0Var2.d[1] = this.f46100v0[1].getProgress();
            m0Var2.invalidate();
            this.f46088i0.setTransitionProgress(f12);
            m0 m0Var3 = this.f46088i0;
            if (!m0Var3.f50871a0 && !m0Var3.U) {
                ArticleViewer$WindowView articleViewer$WindowView = this.f46086g0;
                if (articleViewer$WindowView.f28899e || articleViewer$WindowView.f28900f) {
                    boolean H = H();
                    ArrayList arrayList = this.f46084e0;
                    if (!H && arrayList.size() <= 1) {
                        this.f46088i0.Q.c();
                        this.f46088i0.setBackButtonCached(false);
                    } else {
                        if (!this.f46100v0[0].f47089s && arrayList.size() <= 1) {
                            f10 = 0.0f;
                        } else {
                            f10 = 1.0f;
                        }
                        if (this.f46100v0[1].f47089s || arrayList.size() > 2) {
                            f11 = 1.0f;
                        }
                        float T1 = org.telegram.messenger.g0.T1(f10, f11, f12);
                        this.f46088i0.N.c(false, 1.0f - T1);
                        this.f46088i0.Q.c();
                        m0 m0Var4 = this.f46088i0;
                        if (T1 > 0.5f) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        m0Var4.setBackButtonCached(z12);
                    }
                    this.f46088i0.setHasForward(this.f46100v0[0].f47090w);
                    this.f46088i0.setIsLocal(this.f46100v0[0].d());
                    m0 m0Var5 = this.f46088i0;
                    if (this.f46100v0[0].getWebView() != null && this.f46100v0[0].getWebView().f51022b) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    m0Var5.setIsLoaded(z13);
                }
            }
            m0 m0Var6 = this.f46088i0;
            int actionBarColor = this.f46100v0[0].getActionBarColor();
            ArticleViewer$WindowView articleViewer$WindowView2 = this.f46086g0;
            if (!articleViewer$WindowView2.f28899e && !articleViewer$WindowView2.f28900f) {
                z10 = false;
            } else {
                z10 = true;
            }
            m0Var6.b(0, this.f46080b1.a(actionBarColor, z10));
            m0 m0Var7 = this.f46088i0;
            int actionBarColor2 = this.f46100v0[1].getActionBarColor();
            ArticleViewer$WindowView articleViewer$WindowView3 = this.f46086g0;
            if (!articleViewer$WindowView3.f28899e && !articleViewer$WindowView3.f28900f) {
                z11 = false;
            } else {
                z11 = true;
            }
            m0Var7.b(1, this.f46082c1.a(actionBarColor2, z11));
            this.f46088i0.d(i0.a.f(f12, this.f46100v0[0].getActionBarColor(), this.f46100v0[1].getActionBarColor()), false);
            m0 m0Var8 = this.f46088i0;
            if (translationX > 0.5f) {
                l3Var2 = this.f46100v0[0];
            } else {
                l3Var2 = this.f46100v0[1];
            }
            m0Var8.setMenuType(l3Var2.f47082a);
            u3 u3Var = this.L;
            if (u3Var != null) {
                u3Var.f49951c.invalidate();
                return;
            }
            ArticleViewer$WindowView articleViewer$WindowView4 = this.f46086g0;
            if (articleViewer$WindowView4 != null) {
                articleViewer$WindowView4.invalidate();
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        y0 y0Var;
        org.telegram.messenger.zi messageObject;
        if (i3 == org.telegram.messenger.hs.f23239h2) {
            org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) objArr[0];
            if (this.f46100v0 != null) {
                int i11 = 0;
                while (true) {
                    l3[] l3VarArr = this.f46100v0;
                    if (i11 < l3VarArr.length) {
                        int childCount = l3VarArr[i11].f47083b.getChildCount();
                        for (int i12 = 0; i12 < childCount; i12++) {
                            View childAt = this.f46100v0[i11].f47083b.getChildAt(i12);
                            if (childAt instanceof y0) {
                                ((y0) childAt).a(true);
                            }
                        }
                        i11++;
                    } else {
                        return;
                    }
                }
            }
        } else if (i3 != org.telegram.messenger.hs.f23227f2 && i3 != org.telegram.messenger.hs.f23233g2) {
            if (i3 == org.telegram.messenger.hs.f23221e2) {
                Integer num = (Integer) objArr[0];
                if (this.f46100v0 != null) {
                    int i13 = 0;
                    while (true) {
                        l3[] l3VarArr2 = this.f46100v0;
                        if (i13 < l3VarArr2.length) {
                            int childCount2 = l3VarArr2[i13].f47083b.getChildCount();
                            int i14 = 0;
                            while (true) {
                                if (i14 < childCount2) {
                                    View childAt2 = this.f46100v0[i13].f47083b.getChildAt(i14);
                                    if ((childAt2 instanceof y0) && (messageObject = (y0Var = (y0) childAt2).getMessageObject()) != null && messageObject.f1() == num.intValue()) {
                                        org.telegram.messenger.zi ziVar2 = MediaController.B().f21348v0;
                                        if (ziVar2 != null) {
                                            messageObject.f26828b0 = ziVar2.f26828b0;
                                            messageObject.f26851g0 = ziVar2.f26851g0;
                                            messageObject.f26855h0 = ziVar2.f26855h0;
                                            y0Var.b();
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
            } else if (i3 == org.telegram.messenger.hs.f23246i4 && this.f46100v0 != null) {
                int i15 = 0;
                while (true) {
                    l3[] l3VarArr3 = this.f46100v0;
                    if (i15 < l3VarArr3.length) {
                        int childCount3 = l3VarArr3[i15].f47083b.getChildCount();
                        for (int i16 = 0; i16 < childCount3; i16++) {
                            View childAt3 = this.f46100v0[i15].f47083b.getChildAt(i16);
                            if (childAt3 instanceof t2) {
                                ((t2) childAt3).f49674e.invalidate();
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
        } else if (this.f46100v0 != null) {
            int i17 = 0;
            while (true) {
                l3[] l3VarArr4 = this.f46100v0;
                if (i17 < l3VarArr4.length) {
                    int childCount4 = l3VarArr4[i17].f47083b.getChildCount();
                    for (int i18 = 0; i18 < childCount4; i18++) {
                        View childAt4 = this.f46100v0[i17].f47083b.getChildAt(i18);
                        if (childAt4 instanceof y0) {
                            y0 y0Var2 = (y0) childAt4;
                            if (y0Var2.getMessageObject() != null) {
                                y0Var2.a(true);
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

    public final void e(int i3, String str) {
        S();
        org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3();
        a3Var.f27371x = str;
        this.f46084e0.add(a3Var);
        this.f46088i0.h(false);
        c0(i3, a3Var, false);
    }

    public final boolean f(TLRPC.WebPage webPage, String str, int i3) {
        S();
        this.f46084e0.add(webPage);
        this.f46088i0.h(false);
        c0(i3, webPage, false);
        return T(str, false);
    }

    public final void f0() {
        int i3;
        int size;
        boolean z10;
        boolean z11;
        float f10;
        if (this.F == null && !this.f46100v0[0].f()) {
            return;
        }
        if (this.f46100v0[0].f()) {
            if (this.f46100v0[0].getWebView() == null) {
                i3 = 0;
            } else {
                i3 = this.f46100v0[0].getWebView().getSearchIndex();
            }
            if (this.f46100v0[0].getWebView() == null) {
                size = 0;
            } else {
                size = this.f46100v0[0].getWebView().getSearchCount();
            }
        } else {
            i3 = this.H;
            size = this.F.size();
        }
        ImageView imageView = this.f46097s0;
        if (size > 0 && i3 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        imageView.setEnabled(z10);
        ImageView imageView2 = this.f46098t0;
        if (size > 0 && i3 != size - 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        imageView2.setEnabled(z11);
        ImageView imageView3 = this.f46097s0;
        float f11 = 0.5f;
        if (imageView3.isEnabled()) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        imageView3.setAlpha(f10);
        ImageView imageView4 = this.f46098t0;
        if (imageView4.isEnabled()) {
            f11 = 1.0f;
        }
        imageView4.setAlpha(f11);
        this.f46099u0.a();
        if (size < 0) {
            this.f46099u0.setText("");
        } else if (size == 0) {
            this.f46099u0.setText(org.telegram.messenger.bd.M0(2131748175, null));
        } else if (size == 1) {
            this.f46099u0.setText(org.telegram.messenger.bd.M0(2131747835, null));
        } else {
            this.f46099u0.setText(String.format(org.telegram.messenger.bd.K0(size, "CountOfResults"), Integer.valueOf(i3 + 1), Integer.valueOf(size)));
        }
    }

    public final void g0(boolean z10) {
        boolean z11;
        boolean z12 = false;
        this.f46088i0.g(0, this.f46100v0[0].getTitle(), z10);
        this.f46088i0.f(0, this.f46100v0[0].getSubtitle());
        m0 m0Var = this.f46088i0;
        if (this.f46100v0[0].f() && this.f46100v0[0].getWebView() != null && this.f46100v0[0].getWebView().F) {
            z11 = true;
        } else {
            z11 = false;
        }
        m0Var.e(0, z11);
        this.f46088i0.g(1, this.f46100v0[1].getTitle(), z10);
        this.f46088i0.f(1, this.f46100v0[1].getSubtitle());
        m0 m0Var2 = this.f46088i0;
        if (this.f46100v0[1].f() && this.f46100v0[1].getWebView() != null && this.f46100v0[1].getWebView().F) {
            z12 = true;
        }
        m0Var2.e(1, z12);
    }

    public final void i() {
        this.L0 = false;
        z2 z2Var = this.M0;
        if (z2Var != null) {
            this.f46086g0.removeCallbacks(z2Var);
            this.M0 = null;
        }
        z2 z2Var2 = this.N0;
        if (z2Var2 != null) {
            this.f46086g0.removeCallbacks(z2Var2);
            this.N0 = null;
        }
    }

    public final void k(org.telegram.messenger.ce ceVar) {
        if (this.K0 == org.telegram.messenger.g0.L(56.0f)) {
            if (ceVar != null) {
                ceVar.run();
                return;
            }
            return;
        }
        ValueAnimator duration = ValueAnimator.ofObject(new IntEvaluator(), Integer.valueOf(this.K0), Integer.valueOf(org.telegram.messenger.g0.L(56.0f))).setDuration(180L);
        duration.setInterpolator(new DecelerateInterpolator());
        duration.addUpdateListener(new p(this, 0));
        duration.addListener(new ii.v3(ceVar, 13));
        if (ceVar != null) {
            duration.setDuration(duration.getDuration() / 2);
        }
        duration.start();
    }

    public final void l() {
        long j10;
        w2 w2Var;
        gi.v vVar = this.f46100v0[0].f47083b;
        if (vVar != null && this.X) {
            float measuredHeight = vVar.getMeasuredHeight() / 2.0f;
            Uri uri = null;
            float f10 = 0.0f;
            w2 w2Var2 = null;
            for (int i3 = 0; i3 < vVar.getChildCount(); i3++) {
                View childAt = vVar.getChildAt(i3);
                if (childAt instanceof w2) {
                    float measuredHeight2 = (childAt.getMeasuredHeight() / 2.0f) + childAt.getTop();
                    if (w2Var2 == null || Math.abs(measuredHeight - measuredHeight2) < Math.abs(measuredHeight - f10)) {
                        w2Var2 = (w2) childAt;
                        f10 = measuredHeight2;
                    }
                }
            }
            boolean z10 = PhotoViewer.v1().f41419f;
            if (z10 || ((w2Var = this.f46120y) != null && w2Var != w2Var2 && this.f46119x != null)) {
                VideoPlayerHolderBase videoPlayerHolderBase = this.f46119x;
                if (videoPlayerHolderBase != null) {
                    w2 w2Var3 = this.f46120y;
                    long j11 = w2Var3.M.video_id;
                    x2 a10 = x2.a(videoPlayerHolderBase, w2Var3);
                    w2Var3.c(a10);
                    this.E.k(a10, j11);
                    w2 w2Var4 = this.f46120y;
                    x2 x2Var = w2Var4.N;
                    if (x2Var != null) {
                        Bitmap bitmap = x2Var.f51695b;
                        if (bitmap != null) {
                            w2Var4.f50671e.v0(bitmap);
                        }
                        this.f46120y.e(false);
                    }
                    this.f46119x.release(null);
                }
                this.f46119x = null;
                this.f46120y = null;
            }
            if (!z10 && w2Var2 != null) {
                i50 i50Var = w2Var2.f50668a;
                if (w2Var2.P != null && i50Var.f46119x == null) {
                    i50Var.f46119x = new v2(w2Var2).with(w2Var2.f50673n);
                    TLRPC.Document document = w2Var2.P;
                    for (int i10 = 0; i10 < document.attributes.size(); i10++) {
                        if (document.attributes.get(i10) instanceof TLRPC.TL_documentAttributeVideo) {
                            TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) document.attributes.get(i10);
                            w2Var2.h.a(tL_documentAttributeVideo.f27008w / tL_documentAttributeVideo.h, 0);
                        }
                    }
                    TLRPC.WebPage webPage = w2Var2.f50669b.F;
                    if (webPage != null) {
                        uri = org.telegram.messenger.s8.i(((i4) i50Var).Y, webPage, document);
                    }
                    if (uri != null) {
                        VideoPlayerHolderBase videoPlayerHolderBase2 = i50Var.f46119x;
                        x2 x2Var2 = w2Var2.N;
                        if (x2Var2 == null) {
                            j10 = 0;
                        } else {
                            j10 = x2Var2.f51694a;
                        }
                        videoPlayerHolderBase2.seekTo(j10);
                        i50Var.f46119x.preparePlayer(uri, true, 1.0f);
                        i50Var.f46119x.play();
                    }
                }
                this.f46120y = w2Var2;
            }
        }
    }

    public final void m(boolean z10, boolean z11) {
        if (this.M != null && !this.V0 && this.W) {
            int i3 = 0;
            if (this.f46077a0 != 0 && Math.abs(this.f46081c0 - System.currentTimeMillis()) >= 500) {
                Runnable runnable = this.f46079b0;
                if (runnable != null) {
                    runnable.run();
                    this.f46079b0 = null;
                }
                this.f46077a0 = 0;
            }
            if (this.f46077a0 == 0) {
                u3 u3Var = this.L;
                if (u3Var != null) {
                    u3Var.a(false);
                    return;
                }
                if (this.Q.getVisibility() == 0) {
                    if (this.P != null) {
                        this.Q.setVisibility(4);
                        this.T.onCustomViewHidden();
                        this.Q.removeView(this.P);
                        this.P = null;
                    } else {
                        org.telegram.ui.Components.d71 d71Var = this.G0;
                        if (d71Var != null && d71Var.U) {
                            d71Var.U = false;
                            d71Var.m();
                            d71Var.l(false);
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
                m0 m0Var = this.f46088i0;
                if (m0Var.U) {
                    m0Var.h(false);
                } else if (m0Var.f50871a0) {
                    m0Var.k(false);
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
                        ArrayList arrayList = this.f46084e0;
                        if (arrayList.size() >= 2) {
                            Object o10 = org.telegram.ui.Cells.f1.o(1, arrayList);
                            if (o10 instanceof y2) {
                                ((y2) o10).a();
                            }
                            if (o10 instanceof TLRPC.WebPage) {
                                org.telegram.ui.web.u1.o((TLRPC.WebPage) o10);
                            }
                            c0(-1, arrayList.get(arrayList.size() - 1), false);
                            return;
                        }
                    }
                    org.telegram.messenger.hs.f(this.Y).n(this, org.telegram.messenger.hs.f23221e2);
                    org.telegram.messenger.hs.f(this.Y).n(this, org.telegram.messenger.hs.f23227f2);
                    org.telegram.messenger.hs.f(this.Y).n(this, org.telegram.messenger.hs.f23233g2);
                    org.telegram.messenger.hs.f(this.Y).n(this, org.telegram.messenger.hs.f23239h2);
                    org.telegram.messenger.hs.f(this.Y).n(this, org.telegram.messenger.hs.f23246i4);
                    cg.u0 u0Var = this.W0;
                    if (u0Var != null) {
                        u0Var.b();
                        this.W0 = null;
                    }
                    this.N = null;
                    try {
                        org.telegram.ui.ActionBar.t2 t2Var = this.f46091l0;
                        if (t2Var != null) {
                            t2Var.dismiss();
                            this.f46091l0 = null;
                        }
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    ArticleViewer$WindowView articleViewer$WindowView = this.f46086g0;
                    Property property = View.ALPHA;
                    animatorSet.playTogether(ObjectAnimator.ofFloat(articleViewer$WindowView, property, 0.0f), ObjectAnimator.ofFloat(this.f46087h0, property, 0.0f), ObjectAnimator.ofFloat(this.f46086g0, View.TRANSLATION_X, 0.0f, org.telegram.messenger.g0.L(56.0f)));
                    this.f46077a0 = 2;
                    this.f46079b0 = new b0(this, 10);
                    animatorSet.setDuration(150L);
                    animatorSet.setInterpolator(this.f46083d0);
                    animatorSet.addListener(new ii.v3(this, 14));
                    this.f46081c0 = System.currentTimeMillis();
                    this.f46087h0.setLayerType(2, null);
                    animatorSet.start();
                    while (true) {
                        a0.h hVar = this.E;
                        if (i3 < hVar.m()) {
                            x2 x2Var = (x2) hVar.n(i3);
                            Bitmap bitmap = x2Var.f51695b;
                            if (bitmap != null) {
                                bitmap.recycle();
                                x2Var.f51695b = null;
                            }
                            i3++;
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
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f46084e0;
            if (i3 < arrayList.size()) {
                Object obj = arrayList.get(i3);
                if (obj instanceof y2) {
                    l3 l3Var = this.f46100v0[0];
                    if (l3Var != null && l3Var.L == obj) {
                        ((y2) obj).c(l3Var);
                    }
                    l3 l3Var2 = this.f46100v0[1];
                    if (l3Var2 != null && l3Var2.L == obj) {
                        ((y2) obj).c(l3Var2);
                    }
                    ((y2) obj).a();
                } else if (obj instanceof TLRPC.WebPage) {
                    org.telegram.ui.web.u1.o((TLRPC.WebPage) obj);
                }
                i3++;
            } else {
                arrayList.clear();
                r();
                return;
            }
        }
    }

    public final void r() {
        ArticleViewer$WindowView articleViewer$WindowView;
        if (this.M != null && (articleViewer$WindowView = this.f46086g0) != null) {
            if (this.L == null) {
                try {
                    if (articleViewer$WindowView.getParent() != null) {
                        ((WindowManager) this.M.getSystemService("window")).removeViewImmediate(this.f46086g0);
                    }
                    this.f46086g0 = null;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
            for (int i3 = 0; i3 < this.O.size(); i3++) {
                ((r1) this.O.get(i3)).a(true);
            }
            this.O.clear();
            try {
                this.M.getWindow().clearFlags(128);
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
            this.M = null;
            this.N = null;
            f46057e1 = null;
        }
    }

    public i4(org.telegram.ui.ActionBar.d2 d2Var) {
        this.O = new ArrayList();
        this.Z = 1;
        this.f46083d0 = new DecelerateInterpolator(1.5f);
        this.f46084e0 = new ArrayList();
        this.f46102x0 = new Paint();
        this.f46103y0 = new Paint();
        this.f46104z0 = new Paint();
        this.B0 = new Paint();
        this.L0 = false;
        this.M0 = null;
        this.N0 = null;
        this.T0 = new g2.g(new int[]{org.telegram.messenger.hs.f23298s, org.telegram.messenger.hs.f23305t});
        this.U0 = new l0[2];
        this.Y0 = -1;
        b0 b0Var = new b0(this, 4);
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        this.f46080b1 = new org.telegram.ui.Components.x4(b0Var, 320L, xqVar);
        this.f46082c1 = new org.telegram.ui.Components.x4(new b0(this, 5), 320L, xqVar);
        this.K = true;
        this.L = new u3(this, d2Var);
        W(d2Var.getParentActivity(), d2Var);
    }
}
