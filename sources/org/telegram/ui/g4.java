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
public final class g4 extends q50 implements org.telegram.messenger.ls {
    public static Paint A1;
    public static Paint C1;
    public static TextPaint f45864h1;
    public static TextPaint f45865i1;
    public static TextPaint f45866j1;
    public static TextPaint f45867k1;
    public static TextPaint l1;
    public static TextPaint f45868m1;
    public static TextPaint n1;
    public static TextPaint f45869o1;
    public static Paint f45870p1;
    public static Paint f45871q1;
    public static Paint f45872r1;
    public static Paint f45873s1;
    public static Paint f45874t1;
    public static Paint f45875u1;
    public static Paint f45876v1;
    public static Paint f45877w1;
    public static Paint f45878x1;
    public static Paint f45879y1;
    public static Paint f45880z1;
    public final Paint A0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout B0;
    public TextView C0;
    public Rect D0;
    public org.telegram.ui.Components.m71 E0;
    public org.telegram.ui.Components.m71 F0;
    public int G0;
    public int H0;
    public int I0;
    public final boolean J;
    public int J0;
    public final t3 K;
    public boolean K0;
    public Activity L;
    public y2 L0;
    public org.telegram.ui.ActionBar.f2 M;
    public y2 M0;
    public final ArrayList N;
    public vf.b N0;
    public View O;
    public int O0;
    public FrameLayout P;
    public org.telegram.ui.Cells.i9 P0;
    public TextureView Q;
    public org.telegram.ui.Cells.i9 Q0;
    public j4 R;
    public hr0 R0;
    public WebChromeClient.CustomViewCallback S;
    public final h2.f S0;
    public WindowInsets T;
    public final k0[] T0;
    public boolean U;
    public boolean U0;
    public boolean V;
    public bg.v0 V0;
    public boolean W;
    public ai.e0 W0;
    public int X;
    public int X0;
    public int Y;
    public ValueAnimator Y0;
    public int Z;
    public float Z0;
    public Runnable f45881a0;
    public final org.telegram.ui.Components.z4 f45882a1;
    public long f45883b0;
    public final org.telegram.ui.Components.z4 f45884b1;
    public final DecelerateInterpolator f45885c0;
    public final ArrayList f45886d0;
    public WindowManager.LayoutParams f45887e0;
    public ArticleViewer$WindowView f45888f0;
    public k0 f45889g0;
    public l0 f45890h0;
    public org.telegram.ui.web.j f45891i0;
    public a0 f45892j0;
    public org.telegram.ui.ActionBar.v2 f45893k0;
    public Paint f45894l0;
    public Drawable m0;
    public Paint f45895n0;
    public boolean f45896o0;
    public float f45897p0;
    public di.b4 f45898q0;
    public ImageView f45899r0;
    public ImageView f45900s0;
    public org.telegram.ui.Components.j6 f45901t0;
    public k3[] f45902u0;
    public AnimatorSet f45903v0;
    public final Paint f45904w0;
    public final Paint f45905x0;
    public final Paint f45906y0;
    public boolean f45907z0;
    public static final HashSet f45859c1 = new HashSet();
    public static volatile g4 f45860d1 = null;
    public static final q0 f45861e1 = new q0("innerTranslationX", 0);
    public static final TextPaint f45862f1 = new TextPaint(1);
    public static final o3 f45863g1 = new o3();
    public static final WeakHashMap B1 = new WeakHashMap();

    public g4() {
        this.N = new ArrayList();
        this.Y = 1;
        this.f45885c0 = new DecelerateInterpolator(1.5f);
        this.f45886d0 = new ArrayList();
        this.f45904w0 = new Paint();
        this.f45905x0 = new Paint();
        this.f45906y0 = new Paint();
        this.A0 = new Paint();
        this.K0 = false;
        this.L0 = null;
        this.M0 = null;
        this.S0 = new h2.f(new int[]{org.telegram.messenger.qs.f25070s, org.telegram.messenger.qs.f25076t});
        this.T0 = new k0[2];
        this.X0 = -1;
        a0 a0Var = new a0(this, 4);
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        this.f45882a1 = new org.telegram.ui.Components.z4(a0Var, 320L, xqVar);
        this.f45884b1 = new org.telegram.ui.Components.z4(new a0(this, 5), 320L, xqVar);
        this.J = false;
        this.K = null;
    }

    public static CharSequence A(q50 q50Var, TLRPC.WebPage webPage, View view, TL_iv.RichText richText, TL_iv.RichText richText2, TL_iv.PageBlock pageBlock, int i7) {
        org.telegram.ui.Components.ry0 ry0Var;
        org.telegram.ui.Components.ry0 ry0Var2;
        TextPaint textPaint = null;
        if (richText2 == null) {
            return null;
        }
        if (richText2 instanceof TL_iv.textFixed) {
            return A(q50Var, webPage, view, richText, ((TL_iv.textFixed) richText2).text, pageBlock, i7);
        }
        if (richText2 instanceof TL_iv.textItalic) {
            return A(q50Var, webPage, view, richText, ((TL_iv.textItalic) richText2).text, pageBlock, i7);
        }
        if (richText2 instanceof TL_iv.textBold) {
            return A(q50Var, webPage, view, richText, ((TL_iv.textBold) richText2).text, pageBlock, i7);
        }
        if (richText2 instanceof TL_iv.textUnderline) {
            return A(q50Var, webPage, view, richText, ((TL_iv.textUnderline) richText2).text, pageBlock, i7);
        }
        if (richText2 instanceof TL_iv.textStrike) {
            return A(q50Var, webPage, view, richText, ((TL_iv.textStrike) richText2).text, pageBlock, i7);
        }
        if (richText2 instanceof TL_iv.textEmail) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(A(q50Var, webPage, view, richText, ((TL_iv.textEmail) richText2).text, pageBlock, i7));
            MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), MetricAffectingSpan.class);
            if (spannableStringBuilder.length() != 0) {
                if (metricAffectingSpanArr == null || metricAffectingSpanArr.length == 0) {
                    textPaint = C(q50Var, richText, richText2, pageBlock);
                }
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.ry0(textPaint, "mailto:" + D(richText2)), 0, spannableStringBuilder.length(), 33);
            }
            return spannableStringBuilder;
        }
        long j3 = 0;
        if (richText2 instanceof TL_iv.textUrl) {
            TL_iv.textUrl texturl = (TL_iv.textUrl) richText2;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(A(q50Var, webPage, view, richText, texturl.text, pageBlock, i7));
            MetricAffectingSpan[] metricAffectingSpanArr2 = (MetricAffectingSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), MetricAffectingSpan.class);
            if (metricAffectingSpanArr2 == null || metricAffectingSpanArr2.length == 0) {
                textPaint = C(q50Var, richText, richText2, pageBlock);
            }
            if (texturl.webpage_id != 0) {
                ry0Var2 = new org.telegram.ui.Components.ry0(textPaint, D(richText2));
            } else {
                ry0Var2 = new org.telegram.ui.Components.ry0(textPaint, D(richText2));
            }
            if (spannableStringBuilder2.length() != 0) {
                spannableStringBuilder2.setSpan(ry0Var2, 0, spannableStringBuilder2.length(), 33);
            }
            return spannableStringBuilder2;
        } else if (richText2 instanceof TL_iv.textPlain) {
            return ((TL_iv.textPlain) richText2).text;
        } else {
            if (richText2 instanceof TL_iv.textAnchor) {
                TL_iv.textAnchor textanchor = (TL_iv.textAnchor) richText2;
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(A(q50Var, webPage, view, richText, textanchor.text, pageBlock, i7));
                String str = textanchor.name;
                ?? metricAffectingSpan = new MetricAffectingSpan();
                metricAffectingSpan.f39899a = str.toLowerCase();
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
                        boolean z9 = i7 >= 0 && (richText3 instanceof TL_iv.textUrl) && ((TL_iv.textUrl) richText3).webpage_id != j3;
                        if (z9 && spannableStringBuilder4.length() != 0 && spannableStringBuilder4.charAt(spannableStringBuilder4.length() - 1) != '\n') {
                            spannableStringBuilder4.append((CharSequence) " ");
                            spannableStringBuilder4.setSpan(new Object(), spannableStringBuilder4.length() - 1, spannableStringBuilder4.length(), 33);
                        }
                        CharSequence A = A(q50Var, webPage, view, richText, richText3, pageBlock, i7);
                        int B = B(y10);
                        int length = spannableStringBuilder4.length();
                        spannableStringBuilder4.append(A);
                        if (B != 0 && !(A instanceof SpannableStringBuilder)) {
                            if ((B & 8) == 0 && (B & 512) == 0) {
                                if (length != spannableStringBuilder4.length()) {
                                    TextPaint C = C(q50Var, richText, y10, pageBlock);
                                    ?? metricAffectingSpan2 = new MetricAffectingSpan();
                                    metricAffectingSpan2.f37501a = C;
                                    spannableStringBuilder4.setSpan(metricAffectingSpan2, length, spannableStringBuilder4.length(), 33);
                                }
                            } else {
                                String D = D(richText3);
                                if (D == null) {
                                    D = D(richText);
                                }
                                if ((B & 512) != 0) {
                                    ry0Var = new org.telegram.ui.Components.ry0(C(q50Var, richText, y10, pageBlock), D);
                                } else {
                                    ry0Var = new org.telegram.ui.Components.ry0(C(q50Var, richText, y10, pageBlock), D);
                                }
                                if (length != spannableStringBuilder4.length()) {
                                    spannableStringBuilder4.setSpan(ry0Var, length, spannableStringBuilder4.length(), 33);
                                }
                            }
                        }
                        if (z9 && i10 != size - 1) {
                            spannableStringBuilder4.append((CharSequence) " ");
                            spannableStringBuilder4.setSpan(new Object(), spannableStringBuilder4.length() - 1, spannableStringBuilder4.length(), 33);
                        }
                        i10++;
                        j3 = 0;
                    }
                    return spannableStringBuilder4;
                } else if (richText2 instanceof TL_iv.textSubscript) {
                    return A(q50Var, webPage, view, richText, ((TL_iv.textSubscript) richText2).text, pageBlock, i7);
                } else {
                    if (richText2 instanceof TL_iv.textSuperscript) {
                        return A(q50Var, webPage, view, richText, ((TL_iv.textSuperscript) richText2).text, pageBlock, i7);
                    }
                    if (richText2 instanceof TL_iv.textMarked) {
                        SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(A(q50Var, webPage, view, richText, ((TL_iv.textMarked) richText2).text, pageBlock, i7));
                        MetricAffectingSpan[] metricAffectingSpanArr3 = (MetricAffectingSpan[]) spannableStringBuilder5.getSpans(0, spannableStringBuilder5.length(), MetricAffectingSpan.class);
                        if (spannableStringBuilder5.length() != 0) {
                            if (metricAffectingSpanArr3 == null || metricAffectingSpanArr3.length == 0) {
                                textPaint = C(q50Var, richText, richText2, pageBlock);
                            }
                            ?? metricAffectingSpan3 = new MetricAffectingSpan();
                            metricAffectingSpan3.f37128a = textPaint;
                            spannableStringBuilder5.setSpan(metricAffectingSpan3, 0, spannableStringBuilder5.length(), 33);
                        }
                        return spannableStringBuilder5;
                    } else if (richText2 instanceof TL_iv.textSpoiler) {
                        SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder(A(q50Var, webPage, view, richText, ((TL_iv.textSpoiler) richText2).text, pageBlock, i7));
                        if (spannableStringBuilder6.length() != 0) {
                            ?? obj = new Object();
                            obj.f39836a |= 256;
                            spannableStringBuilder6.setSpan(new org.telegram.ui.Components.wy0(obj, 0), 0, spannableStringBuilder6.length(), 33);
                        }
                        return spannableStringBuilder6;
                    } else if (richText2 instanceof TL_iv.textPhone) {
                        SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder(A(q50Var, webPage, view, richText, ((TL_iv.textPhone) richText2).text, pageBlock, i7));
                        MetricAffectingSpan[] metricAffectingSpanArr4 = (MetricAffectingSpan[]) spannableStringBuilder7.getSpans(0, spannableStringBuilder7.length(), MetricAffectingSpan.class);
                        if (spannableStringBuilder7.length() != 0) {
                            if (metricAffectingSpanArr4 == null || metricAffectingSpanArr4.length == 0) {
                                textPaint = C(q50Var, richText, richText2, pageBlock);
                            }
                            spannableStringBuilder7.setSpan(new org.telegram.ui.Components.ry0(textPaint, "tel:" + D(richText2)), 0, spannableStringBuilder7.length(), 33);
                        }
                        return spannableStringBuilder7;
                    } else {
                        if (richText2 instanceof TL_iv.textImage) {
                            TL_iv.textImage textimage = (TL_iv.textImage) richText2;
                            TLRPC.Document a10 = d4.a(webPage, textimage.document_id);
                            TLRPC.Photo e10 = d4.e(webPage, textimage.photo_id);
                            if (a10 != null) {
                                SpannableStringBuilder spannableStringBuilder8 = new SpannableStringBuilder("*");
                                int L = org.telegram.messenger.g0.L(textimage.f27182w);
                                int L2 = org.telegram.messenger.g0.L(textimage.h);
                                int abs = Math.abs(i7);
                                if (L > abs) {
                                    L2 = (int) (L2 * (abs / L));
                                    L = abs;
                                }
                                if (view != null) {
                                    int i11 = org.telegram.ui.ActionBar.l6.f27865d6;
                                    ((g4) q50Var).getClass();
                                    boolean z10 = org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.l6.x0(null, i11, false)) <= 0.705f;
                                    ?? replacementSpan = new ReplacementSpan();
                                    Locale locale = Locale.US;
                                    String str2 = L + "_" + L2 + "_i";
                                    replacementSpan.f36832b = L;
                                    replacementSpan.f36833c = L2;
                                    boolean z11 = z10;
                                    ImageReceiver imageReceiver = new ImageReceiver(view);
                                    replacementSpan.f36831a = imageReceiver;
                                    imageReceiver.J0 = true;
                                    if (z11) {
                                        imageReceiver.f21195g1 = new org.telegram.ui.Components.jl0(12);
                                    }
                                    imageReceiver.r0(org.telegram.messenger.hc.b(a10), str2, org.telegram.messenger.hc.c(org.telegram.messenger.w7.w(a10.thumbs, 90, false, null, false), a10), str2, null, -1L, null, webPage, 1);
                                    spannableStringBuilder8.setSpan(replacementSpan, 0, spannableStringBuilder8.length(), 33);
                                }
                                return spannableStringBuilder8;
                            } else if (e10 instanceof org.telegram.ui.web.v1) {
                                org.telegram.ui.web.v1 v1Var = (org.telegram.ui.web.v1) e10;
                                SpannableStringBuilder spannableStringBuilder9 = new SpannableStringBuilder("*");
                                int L3 = org.telegram.messenger.g0.L(textimage.f27182w);
                                int L4 = org.telegram.messenger.g0.L(textimage.h);
                                int abs2 = Math.abs(i7);
                                if (L3 > abs2) {
                                    L4 = (int) (L4 * (abs2 / L3));
                                    L3 = abs2;
                                }
                                if (view != null) {
                                    ?? replacementSpan2 = new ReplacementSpan();
                                    replacementSpan2.f36832b = L3;
                                    replacementSpan2.f36833c = L4;
                                    ImageReceiver imageReceiver2 = new ImageReceiver(view);
                                    replacementSpan2.f36831a = imageReceiver2;
                                    imageReceiver2.J0 = true;
                                    org.telegram.ui.web.w1.g(v1Var, imageReceiver2, new org.telegram.ui.Components.vs(6));
                                    spannableStringBuilder9.setSpan(replacementSpan2, 0, spannableStringBuilder9.length(), 33);
                                }
                                return spannableStringBuilder9;
                            }
                        } else if (richText2 instanceof TL_iv.textMath) {
                            TL_iv.textMath textmath = (TL_iv.textMath) richText2;
                            if (textmath.bitmap == null && !textmath.tried) {
                                textmath.tried = true;
                                li.q a11 = li.q.a(textmath.source, org.telegram.messenger.g0.L(20.0f), true);
                                if (a11 != null) {
                                    textmath.f27183w = a11.f18782b;
                                    textmath.h = a11.f18783c;
                                    textmath.depth = a11.d;
                                    textmath.bitmap = a11.f18781a;
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
                                int i12 = textmath.f27183w;
                                int i13 = textmath.h;
                                int i14 = org.telegram.ui.ActionBar.l6.G6;
                                ((g4) q50Var).getClass();
                                spannableStringBuilder10.setSpan(new org.telegram.ui.Components.oy0(view, bitmap, i12, i13, org.telegram.ui.ActionBar.l6.x0(null, i14, false), textmath.depth), 0, spannableStringBuilder10.length(), 33);
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

    public static android.text.TextPaint C(org.telegram.ui.q50 r21, org.telegram.tgnet.tl.TL_iv.RichText r22, org.telegram.tgnet.tl.TL_iv.RichText r23, org.telegram.tgnet.tl.TL_iv.PageBlock r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g4.C(org.telegram.ui.q50, org.telegram.tgnet.tl.TL_iv$RichText, org.telegram.tgnet.tl.TL_iv$RichText, org.telegram.tgnet.tl.TL_iv$PageBlock):android.text.TextPaint");
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
        if (f45860d1 != null) {
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
        boolean z9;
        TL_iv.PageBlock x10 = x(u3Var.f50284a);
        if (x10 instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) x10;
            if (!pageblockdetails.open) {
                pageblockdetails.open = true;
                return true;
            }
        } else if (x10 instanceof u3) {
            u3 u3Var2 = (u3) x10;
            TL_iv.PageBlock x11 = x(u3Var2.f50285b);
            if (x11 instanceof TL_iv.pageBlockDetails) {
                TL_iv.pageBlockDetails pageblockdetails2 = (TL_iv.pageBlockDetails) x11;
                if (!pageblockdetails2.open) {
                    pageblockdetails2.open = true;
                    z9 = true;
                    if (!M(u3Var2) || z9) {
                        return true;
                    }
                }
            }
            z9 = false;
            if (!M(u3Var2)) {
            }
            return true;
        }
        return false;
    }

    public static void R(q50 q50Var) {
        if (q50Var.f48918b != null || q50Var.f48921f != null) {
            View view = q50Var.f48921f;
            q50Var.f48919c.f(true);
            q50Var.f48918b = null;
            q50Var.d = null;
            q50Var.f48921f = null;
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

    public static void d(String str, int i7, FrameLayout frameLayout, t3 t3Var, org.telegram.ui.ActionBar.g6 g6Var) {
        String u10 = org.telegram.ui.web.x0.u(str);
        long e10 = org.telegram.messenger.p10.i(i7).e();
        org.telegram.messenger.gz.C(i7).r0(org.telegram.messenger.ez.a(e10, u10));
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
        org.telegram.messenger.qs.f(i7).k(org.telegram.messenger.qs.H1, new org.telegram.messenger.ij(i7, tL_message, false, false));
        new org.telegram.ui.Components.hc(frameLayout, g6Var).Q(2131624190, 36, org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131742940, null), new bi.r3(t3Var, e10, 19))).k(true);
    }

    public static void e0(q50 q50Var) {
        TextPaint textPaint = n1;
        if (textPaint != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.G6, false));
        }
        TextPaint textPaint2 = f45869o1;
        if (textPaint2 != null) {
            textPaint2.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.G6, false));
        }
        TextPaint textPaint3 = f45864h1;
        if (textPaint3 != null) {
            textPaint3.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.G6, false));
        }
        TextPaint textPaint4 = f45866j1;
        if (textPaint4 != null) {
            textPaint4.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.G6, false));
        }
        TextPaint textPaint5 = f45867k1;
        if (textPaint5 != null) {
            textPaint5.setColor(-1);
        }
        TextPaint textPaint6 = l1;
        if (textPaint6 != null) {
            textPaint6.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.G6, false));
        }
        TextPaint textPaint7 = f45868m1;
        if (textPaint7 != null) {
            textPaint7.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28257y6, false));
        }
        TextPaint textPaint8 = f45865i1;
        if (textPaint8 != null) {
            textPaint8.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28257y6, false));
        }
        p(q50Var, true);
        o3 o3Var = f45863g1;
        o3.a(q50Var, o3Var.d);
        o3.a(q50Var, o3Var.f48310e);
        o3.a(q50Var, o3Var.f48312g);
        o3.a(q50Var, o3Var.f48311f);
        o3.a(q50Var, o3Var.h);
        o3.a(q50Var, o3Var.f48313i);
        o3.a(q50Var, o3Var.f48314j);
        o3.a(q50Var, o3Var.f48315k);
        o3.a(q50Var, o3Var.f48316l);
        o3.a(q50Var, o3Var.f48317m);
        o3.a(q50Var, o3Var.f48318n);
        o3.a(q50Var, o3Var.f48324t);
        o3.a(q50Var, o3Var.f48323s);
        o3.a(q50Var, o3Var.f48321q);
        o3.a(q50Var, o3Var.f48322r);
        o3.a(q50Var, o3Var.f48325u);
        o3.a(q50Var, o3Var.f48326w);
        o3.a(q50Var, o3Var.f48327x);
        o3.a(q50Var, o3Var.f48308b);
        o3.a(q50Var, o3Var.f48309c);
        o3.a(q50Var, o3Var.f48319o);
        o3.a(q50Var, o3Var.f48320p);
        o3.a(q50Var, o3Var.v);
        o3.a(q50Var, o3Var.f48328y);
        o3.a(q50Var, o3Var.f48329z);
        o3.a(q50Var, o3Var.A);
    }

    public static SpannableStringBuilder g(int i7, CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (charSequence != null) {
            spannableStringBuilder.append(charSequence);
        }
        if (spannableStringBuilder.length() > 0) {
            spannableStringBuilder.append((CharSequence) ", ");
        }
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.id.M0(i7, null));
        return spannableStringBuilder;
    }

    public static CharSequence h(q50 q50Var, e4 e4Var, z2 z2Var) {
        StaticLayout staticLayout;
        if (z2Var != null && (staticLayout = z2Var.d) != null) {
            SpannableStringBuilder spannableStringBuilder = z2Var.D;
            if (spannableStringBuilder != null) {
                return spannableStringBuilder;
            }
            CharSequence text = staticLayout.getText();
            if (!(text instanceof Spannable)) {
                return text;
            }
            Spannable spannable = (Spannable) text;
            org.telegram.ui.Components.ry0[] ry0VarArr = (org.telegram.ui.Components.ry0[]) spannable.getSpans(0, spannable.length(), org.telegram.ui.Components.ry0.class);
            SpannableStringBuilder spannableStringBuilder2 = text;
            if (ry0VarArr != null) {
                spannableStringBuilder2 = text;
                if (ry0VarArr.length != 0) {
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannable);
                    for (org.telegram.ui.Components.ry0 ry0Var : ry0VarArr) {
                        int spanStart = spannableStringBuilder3.getSpanStart(ry0Var);
                        int spanEnd = spannableStringBuilder3.getSpanEnd(ry0Var);
                        if (spanStart >= 0 && spanEnd > spanStart) {
                            spannableStringBuilder3.setSpan(new org.telegram.messenger.v(q50Var, e4Var, ry0Var, 1), spanStart, spanEnd, 33);
                        }
                    }
                    z2Var.D = spannableStringBuilder3;
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
            w3Var2.f50839a = w3Var.f50839a;
            w3Var2.f50840b = w3Var.f50840b;
            w3Var2.f50841c = w3Var.f50841c;
            w3Var2.d = h0(w3Var.d, u3Var);
            return w3Var2;
        } else if (pageBlock instanceof y3) {
            y3 y3Var = (y3) pageBlock;
            y3 y3Var2 = new y3();
            y3Var2.f51830a = y3Var.f51830a;
            y3Var2.f51831b = y3Var.f51831b;
            y3Var2.f51832c = y3Var.f51832c;
            y3Var2.d = h0(y3Var.d, u3Var);
            return y3Var2;
        } else {
            return u3Var;
        }
    }

    public static boolean j(org.telegram.ui.q50 r25, org.telegram.ui.e4 r26, android.view.MotionEvent r27, android.view.View r28, org.telegram.ui.z2 r29, int r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g4.j(org.telegram.ui.q50, org.telegram.ui.e4, android.view.MotionEvent, android.view.View, org.telegram.ui.z2, int, int):boolean");
    }

    public static org.telegram.ui.z2 n(org.telegram.ui.q50 r19, android.view.View r20, java.lang.CharSequence r21, org.telegram.tgnet.tl.TL_iv.RichText r22, int r23, int r24, org.telegram.tgnet.tl.TL_iv.PageBlock r25, android.text.Layout.Alignment r26, int r27, org.telegram.ui.e4 r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g4.n(org.telegram.ui.q50, android.view.View, java.lang.CharSequence, org.telegram.tgnet.tl.TL_iv$RichText, int, int, org.telegram.tgnet.tl.TL_iv$PageBlock, android.text.Layout$Alignment, int, org.telegram.ui.e4):org.telegram.ui.z2");
    }

    public static z2 o(q50 q50Var, View view, CharSequence charSequence, TL_iv.RichText richText, int i7, int i10, TL_iv.PageBlock pageBlock, e4 e4Var) {
        return n(q50Var, view, charSequence, richText, i7, i10, pageBlock, Layout.Alignment.ALIGN_NORMAL, 0, e4Var);
    }

    public static void p(q50 q50Var, boolean z9) {
        int i7;
        if (f45872r1 == null) {
            f45872r1 = new Paint();
            f45871q1 = new Paint();
            Paint paint = new Paint(1);
            f45874t1 = paint;
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            f45874t1.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
            Paint paint2 = new Paint();
            f45875u1 = paint2;
            paint2.setStyle(style);
            f45875u1.setStrokeWidth(org.telegram.messenger.g0.L(1.0f) / 2.0f);
            f45876v1 = new Paint();
            f45877w1 = new Paint();
            f45878x1 = new Paint();
            f45879y1 = new Paint(1);
            f45880z1 = new Paint(1);
            f45870p1 = new Paint();
            f45873s1 = new Paint();
            A1 = new Paint(1);
        } else if (!z9) {
            return;
        }
        int x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27865d6, false);
        float green = Color.green(x02) * 0.7152f;
        float y10 = com.google.android.recaptcha.internal.a.y(Color.blue(x02), 0.0722f, green + (Color.red(x02) * 0.2126f), 255.0f);
        Paint paint3 = f45880z1;
        if (y10 <= 0.705f) {
            i7 = -3041234;
        } else {
            i7 = -6551;
        }
        paint3.setColor(i7);
        Paint paint4 = f45879y1;
        int i10 = org.telegram.ui.ActionBar.l6.K6;
        paint4.setColor(org.telegram.ui.ActionBar.l6.x0(null, i10, false) & 872415231);
        f45879y1.setPathEffect(org.telegram.ui.Components.s70.c());
        f45878x1.setColor(org.telegram.ui.ActionBar.l6.x0(null, i10, false) & 872415231);
        f45878x1.setPathEffect(org.telegram.ui.Components.s70.c());
        Paint paint5 = f45875u1;
        int i11 = org.telegram.ui.ActionBar.l6.f27994k6;
        paint5.setColor(org.telegram.ui.ActionBar.l6.x0(null, i11, false));
        f45874t1.setColor(org.telegram.ui.ActionBar.l6.x0(null, i11, false));
        f45870p1.setColor(251658240);
        f45873s1.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27866d7, false));
        A1.setColor(org.telegram.ui.ActionBar.l6.x0(null, i10, false) & 872415231);
        A1.setPathEffect(org.telegram.ui.Components.s70.c());
        int x03 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.M6, false);
        int red = Color.red(x03);
        int green2 = Color.green(x03);
        int blue = Color.blue(x03);
        f45877w1.setColor(Color.argb(20, red, green2, blue));
        f45876v1.setColor(Color.argb(34, red, green2, blue));
        int x04 = org.telegram.ui.ActionBar.l6.x0(null, i10, false);
        f45871q1.setColor(Color.argb(20, Color.red(x04), Color.green(x04), Color.blue(x04)));
        f45872r1.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Id, false));
    }

    public static void s(Canvas canvas, q50 q50Var, TL_iv.PageBlock pageBlock, int i7) {
        int i10;
        int L;
        int L2;
        if (pageBlock != null && q50Var != null && f45872r1 != null) {
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
                    canvas.drawRect(org.telegram.messenger.g0.L(18), 0.0f, org.telegram.messenger.g0.L(2.0f) + L2, i12, f45872r1);
                    return;
                }
                return;
            }
            while (i13 != 0) {
                if ((i13 & 1) != 0) {
                    canvas.drawRect(org.telegram.messenger.g0.L((i11 * 14) + 18), 0.0f, org.telegram.messenger.g0.L(2.0f) + L, i12, f45872r1);
                }
                i13 >>>= 1;
                i11++;
            }
        }
    }

    public static void t(org.telegram.ui.q50 r2, android.graphics.Canvas r3, org.telegram.ui.Cells.h9 r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g4.t(org.telegram.ui.q50, android.graphics.Canvas, org.telegram.ui.Cells.h9, int):void");
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
        g4 g4Var2 = f45860d1;
        if (g4Var2 == null) {
            synchronized (g4.class) {
                try {
                    g4Var = f45860d1;
                    if (g4Var == null) {
                        g4Var = new g4();
                        f45860d1 = g4Var;
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
        org.telegram.ui.Components.yi0 yi0Var;
        if (view instanceof v1) {
            org.telegram.ui.Components.yi0 yi0Var2 = ((v1) view).d;
            if (yi0Var2 != null) {
                return w(yi0Var2.f57056a);
            }
            return view;
        } else if ((view instanceof y1) && (yi0Var = ((y1) view).d) != null) {
            return w(yi0Var.f57056a);
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
        boolean z9;
        float x10;
        ArrayList arrayList = this.f45886d0;
        int size = arrayList.size();
        t3 t3Var = this.K;
        boolean z10 = false;
        if (size <= 1) {
            ArticleViewer$WindowView articleViewer$WindowView = this.f45888f0;
            articleViewer$WindowView.f28846e = false;
            articleViewer$WindowView.d = false;
            k0 k0Var = this.f45889g0;
            if (t3Var != null) {
                x10 = t3Var.I * t3Var.f50047c.getWidth();
            } else {
                x10 = k0Var.getX();
            }
            AnimatorSet animatorSet = new AnimatorSet();
            float measuredWidth = k0Var.getMeasuredWidth() - x10;
            if (t3Var != null) {
                animatorSet.playTogether(t3Var.l(1.0f));
            } else {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.f45889g0, View.TRANSLATION_X, k0Var.getMeasuredWidth()), ObjectAnimator.ofFloat(this.f45888f0, f45861e1, k0Var.getMeasuredWidth()));
            }
            animatorSet.setDuration(Math.max((int) ((420.0f / k0Var.getMeasuredWidth()) * measuredWidth), 250));
            animatorSet.setInterpolator(org.telegram.ui.Components.xq.h);
            animatorSet.addListener(new s0(this));
            animatorSet.start();
            this.U0 = true;
            return;
        }
        ArticleViewer$WindowView articleViewer$WindowView2 = this.f45888f0;
        articleViewer$WindowView2.f28847f = true;
        articleViewer$WindowView2.f28846e = true;
        articleViewer$WindowView2.h = this.J0;
        this.f45902u0[1].setVisibility(0);
        this.f45902u0[1].setAlpha(1.0f);
        this.f45902u0[1].setTranslationX(0.0f);
        k3 k3Var = this.f45902u0[0];
        if (t3Var == null) {
            color = 0;
        } else {
            color = this.f45894l0.getColor();
        }
        k3Var.setBackgroundColor(color);
        c0(-1, arrayList.get(arrayList.size() - 2), true);
        k3 k3Var2 = this.f45902u0[0];
        k3Var2.getX();
        AnimatorSet animatorSet2 = new AnimatorSet();
        k3Var2.getMeasuredWidth();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f45902u0[0], View.TRANSLATION_X, k3Var2.getMeasuredWidth()));
        animatorSet2.setDuration(420L);
        animatorSet2.setInterpolator(org.telegram.ui.Components.xq.h);
        animatorSet2.addListener(new t0(this));
        animatorSet2.start();
        l0 l0Var = this.f45890h0;
        k3 k3Var3 = this.f45902u0[0];
        if (k3Var3 != null && org.telegram.messenger.iz.f23443v0) {
            x02 = k3Var3.getBackgroundColor();
        } else {
            x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Dl, false);
        }
        l0Var.setMenuColors(x02);
        l0 l0Var2 = this.f45890h0;
        k3 k3Var4 = this.f45902u0[0];
        if (k3Var4 != null && org.telegram.messenger.iz.f23443v0) {
            x03 = k3Var4.getActionBarColor();
        } else {
            x03 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Dl, false);
        }
        l0Var2.d(x03, true);
        l0 l0Var3 = this.f45890h0;
        k3 k3Var5 = this.f45902u0[0];
        if (k3Var5 != null && k3Var5.e()) {
            z9 = true;
        } else {
            z9 = false;
        }
        l0Var3.setIsTonsite(z9);
        l0 l0Var4 = this.f45890h0;
        k3 k3Var6 = this.f45902u0[0];
        if (k3Var6 != null && k3Var6.d()) {
            z10 = true;
        }
        l0Var4.setIsLocal(z10);
        this.U0 = true;
    }

    public final void F(int i7) {
        int color;
        int x02;
        int x03;
        boolean z9;
        float x10;
        ArrayList arrayList = this.f45886d0;
        int size = arrayList.size();
        t3 t3Var = this.K;
        boolean z10 = false;
        if (size <= 1) {
            ArticleViewer$WindowView articleViewer$WindowView = this.f45888f0;
            articleViewer$WindowView.f28846e = false;
            articleViewer$WindowView.d = false;
            k0 k0Var = this.f45889g0;
            if (t3Var != null) {
                x10 = t3Var.I * t3Var.f50047c.getWidth();
            } else {
                x10 = k0Var.getX();
            }
            AnimatorSet animatorSet = new AnimatorSet();
            float measuredWidth = k0Var.getMeasuredWidth() - x10;
            if (t3Var != null) {
                animatorSet.playTogether(t3Var.l(1.0f));
            } else {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.f45889g0, View.TRANSLATION_X, k0Var.getMeasuredWidth()), ObjectAnimator.ofFloat(this.f45888f0, f45861e1, k0Var.getMeasuredWidth()));
            }
            animatorSet.setDuration(Math.max((int) ((420.0f / k0Var.getMeasuredWidth()) * measuredWidth), 250));
            animatorSet.setInterpolator(org.telegram.ui.Components.xq.h);
            animatorSet.addListener(new u0(this));
            animatorSet.start();
            this.U0 = true;
            return;
        }
        this.f45888f0.f28847f = true;
        this.f45902u0[1].setVisibility(0);
        this.f45902u0[1].setAlpha(1.0f);
        this.f45902u0[1].setTranslationX(0.0f);
        k3 k3Var = this.f45902u0[0];
        if (t3Var == null) {
            color = 0;
        } else {
            color = this.f45894l0.getColor();
        }
        k3Var.setBackgroundColor(color);
        c0(-1, arrayList.get(i7), true);
        k3 k3Var2 = this.f45902u0[0];
        k3Var2.getX();
        AnimatorSet animatorSet2 = new AnimatorSet();
        k3Var2.getMeasuredWidth();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f45902u0[0], View.TRANSLATION_X, k3Var2.getMeasuredWidth()));
        animatorSet2.setDuration(420L);
        animatorSet2.setInterpolator(org.telegram.ui.Components.xq.h);
        animatorSet2.addListener(new v0(this, i7));
        animatorSet2.start();
        l0 l0Var = this.f45890h0;
        k3 k3Var3 = this.f45902u0[0];
        if (k3Var3 != null && org.telegram.messenger.iz.f23443v0) {
            x02 = k3Var3.getBackgroundColor();
        } else {
            x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Dl, false);
        }
        l0Var.setMenuColors(x02);
        l0 l0Var2 = this.f45890h0;
        k3 k3Var4 = this.f45902u0[0];
        if (k3Var4 != null && org.telegram.messenger.iz.f23443v0) {
            x03 = k3Var4.getActionBarColor();
        } else {
            x03 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Dl, false);
        }
        l0Var2.d(x03, true);
        l0 l0Var3 = this.f45890h0;
        k3 k3Var5 = this.f45902u0[0];
        if (k3Var5 != null && k3Var5.e()) {
            z9 = true;
        } else {
            z9 = false;
        }
        l0Var3.setIsTonsite(z9);
        l0 l0Var4 = this.f45890h0;
        k3 k3Var6 = this.f45902u0[0];
        if (k3Var6 != null && k3Var6.d()) {
            z10 = true;
        }
        l0Var4.setIsLocal(z10);
        this.U0 = true;
    }

    public final boolean H() {
        ArrayList arrayList = this.f45886d0;
        if (arrayList.size() <= 0 || !(arrayList.get(0) instanceof TLRPC.WebPage)) {
            return false;
        }
        return true;
    }

    public final void K() {
        this.V = false;
        int i7 = 0;
        while (true) {
            k3[] k3VarArr = this.f45902u0;
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
        this.L.getWindow().clearFlags(128);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.N;
            if (i10 < arrayList.size()) {
                ((q1) arrayList.get(i10)).a(false);
                i10++;
            } else {
                this.f45889g0.post(new a0(this, 0));
                org.telegram.messenger.qs.f(this.X).k(org.telegram.messenger.qs.f24986d1, new Object[0]);
                return;
            }
        }
    }

    public final boolean L(org.telegram.messenger.ij ijVar, TLRPC.WebPage webPage, String str, String str2) {
        TLRPC.WebPage webPage2;
        boolean z9;
        int lastIndexOf;
        String substring;
        boolean z10;
        ?? r52;
        String str3;
        int i7;
        String lowerCase;
        TL_iv.Page page;
        if (this.L == null) {
            return false;
        }
        t3 t3Var = this.K;
        if (t3Var == null && this.V) {
            return false;
        }
        org.telegram.ui.ActionBar.f2 f2Var = this.M;
        if (f2Var != null && (f2Var.getParentLayout() instanceof ActionBarLayout)) {
            org.telegram.messenger.g0.v1((ActionBarLayout) this.M.getParentLayout());
        }
        if (ijVar != null) {
            if (webPage == null) {
                webPage2 = ijVar.f23262k.media.webpage;
            } else {
                webPage2 = webPage;
            }
            if (webPage2 != null && (page = webPage2.cached_page) != null && page.local != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            for (int i10 = 0; i10 < ijVar.f23262k.entities.size(); i10++) {
                TLRPC.MessageEntity messageEntity = ijVar.f23262k.entities.get(i10);
                if (messageEntity instanceof TLRPC.TL_messageEntityUrl) {
                    try {
                        String str4 = ijVar.f23262k.message;
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
            z9 = false;
        } else {
            webPage2 = webPage;
            z9 = false;
            substring = null;
        }
        ArrayList arrayList = this.f45886d0;
        if (t3Var != null && !arrayList.isEmpty()) {
            z10 = z9;
            r52 = 1;
        } else {
            z10 = z9;
            r52 = 0;
        }
        if (r52 == 0) {
            arrayList.clear();
            this.f45889g0.setTranslationX(0.0f);
            if (t3Var != null) {
                t3Var.I = 0.0f;
                t3Var.f50047c.invalidate();
                t3Var.u();
                t3Var.r();
            }
            this.f45889g0.setTranslationY(0.0f);
            this.f45902u0[0].setTranslationY(0.0f);
            this.f45902u0[0].setTranslationX(0.0f);
            this.f45902u0[1].setTranslationX(0.0f);
            this.f45902u0[0].setAlpha(1.0f);
            this.f45888f0.setInnerTranslationX(0.0f);
            this.f45902u0[0].g();
            V(org.telegram.messenger.g0.L(56.0f));
        }
        if (t3Var != null && org.telegram.ui.web.x0.Q0) {
            t3Var.f50045a.d();
        }
        if (webPage2 != null) {
            boolean f10 = f(webPage2, substring, r52);
            if (!z10) {
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
                if (ijVar != null) {
                    i7 = ijVar.I1;
                } else {
                    i7 = org.telegram.messenger.p10.f24470s0;
                }
                int i12 = i7;
                ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getWebPage, new g0(this, i12, webPage2, ijVar, (boolean) r52, str3));
            }
        } else {
            e(r52, str2);
        }
        l0 l0Var = this.f45890h0;
        if (l0Var != null && r52 == 0) {
            l0Var.setIsLocal(this.f45902u0[0].d());
        }
        this.T = null;
        if (t3Var != null) {
            if (r52 == 0) {
                org.telegram.messenger.g0.E2(this.f45888f0);
                t3Var.d = this.f45888f0;
                t3Var.A();
                t3Var.f50047c.addView(this.f45888f0, c8.ha.c(-1.0f, -1));
            }
        } else if (!this.V) {
            WindowManager windowManager = (WindowManager) this.L.getSystemService("window");
            if (this.W) {
                try {
                    windowManager.removeView(this.f45888f0);
                } catch (Exception unused) {
                }
            }
            try {
                WindowManager.LayoutParams layoutParams = this.f45887e0;
                layoutParams.flags = -2013200384;
                if (Build.VERSION.SDK_INT >= 28) {
                    layoutParams.layoutInDisplayCutoutMode = 1;
                }
                this.f45888f0.setFocusable(false);
                this.f45889g0.setFocusable(false);
                windowManager.addView(this.f45888f0, this.f45887e0);
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
                return false;
            }
        } else {
            this.f45887e0.flags &= -17;
            ((WindowManager) this.L.getSystemService("window")).updateViewLayout(this.f45888f0, this.f45887e0);
        }
        this.V = true;
        this.Z = 1;
        if (r52 == 0) {
            if (t3Var != null) {
                if (r52 != 0) {
                    t3Var.f50045a.e();
                } else if (!t3Var.h) {
                    t3Var.q(t3Var.f50046b);
                    t3Var.o();
                }
            } else {
                this.f45888f0.setAlpha(0.0f);
                this.f45889g0.setAlpha(0.0f);
                AnimatorSet animatorSet = new AnimatorSet();
                ArticleViewer$WindowView articleViewer$WindowView = this.f45888f0;
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(articleViewer$WindowView, property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f45889g0, property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f45888f0, View.TRANSLATION_X, org.telegram.messenger.g0.L(56.0f), 0.0f));
                this.f45881a0 = new a0(this, 1);
                animatorSet.setDuration(150L);
                animatorSet.setInterpolator(this.f45885c0);
                animatorSet.addListener(new p0(this));
                this.f45883b0 = System.currentTimeMillis();
                org.telegram.messenger.g0.h3(new org.telegram.ui.ActionBar.p(7, this, animatorSet));
            }
        }
        this.f45889g0.setLayerType(2, null);
        return true;
    }

    public final void N(long j3, TLRPC.User user) {
        if (user != null && (this.L instanceof LaunchActivity)) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f27105id);
            bundle.putString("botUser", "webpage" + j3);
            ((LaunchActivity) this.L).u0(new cn(bundle), false, true);
            m(false, true);
        }
    }

    public final void O(String str, String str2, j0 j0Var) {
        Activity activity = this.L;
        if (activity != null && !activity.isFinishing()) {
            k3 k3Var = this.f45902u0[0];
            if (k3Var != null && k3Var.d()) {
                String M0 = org.telegram.messenger.id.M0(2131747782, null);
                int indexOf = M0.indexOf("%");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(String.format(M0, str));
                if (indexOf >= 0) {
                    spannableStringBuilder.setSpan(new URLSpan(str), indexOf, str.length() + indexOf, 33);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.L, null);
                String M02 = org.telegram.messenger.id.M0(2131747779, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                u1Var.R = M02;
                u1Var.T = spannableStringBuilder;
                u1Var.f28561h0 = false;
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747817, null), new a1.d(this, str, str2, j0Var, 6));
                alertDialog$Builder.p();
                return;
            }
            P(str, str2, j0Var);
        }
    }

    public final void P(String str, String str2, vf.b bVar) {
        t3 t3Var;
        vf.b bVar2 = this.N0;
        if (bVar2 != null) {
            bVar2.a(false);
        }
        this.N0 = bVar;
        if (this.G0 != 0) {
            ConnectionsManager.getInstance(this.X).cancelRequest(this.G0, false);
            this.G0 = 0;
        }
        boolean[] zArr = new boolean[1];
        if (vf.c.m(this.L, str, false)) {
            if (this.f45886d0.isEmpty() && (t3Var = this.K) != null) {
                t3Var.a(false);
                return;
            }
            return;
        }
        f0 f0Var = new f0(this, str, zArr, bVar);
        int i7 = this.I0 + 1;
        this.I0 = i7;
        Z(true);
        TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
        tL_messages_getWebPage.url = str;
        tL_messages_getWebPage.hash = 0;
        this.G0 = ConnectionsManager.getInstance(this.X).sendRequest(tL_messages_getWebPage, new org.telegram.messenger.nx(this, i7, bVar, str2, f0Var, tL_messages_getWebPage));
        if (bVar != null) {
            bVar.f57336b = new ai.e0(this, i7, bVar, 27);
            bVar.d();
        }
    }

    public final void Q() {
        int x02;
        int x03;
        TextView textView = this.C0;
        if (textView != null) {
            int i7 = org.telegram.ui.ActionBar.l6.f27957i6;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.l6.h0(org.telegram.ui.ActionBar.l6.x0(null, i7, false), 2, -1);
            org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i7);
            textView.setBackground(h02);
            org.telegram.ui.ActionBar.s6.j(textView, h02, null, M, null);
            org.telegram.ui.ActionBar.s6.U(this.C0, org.telegram.ui.ActionBar.l6.E8, null);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.B0;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, null);
        }
        ImageView imageView = this.f45899r0;
        if (imageView != null) {
            org.telegram.ui.ActionBar.s6.s(imageView, org.telegram.ui.ActionBar.l6.G6, null, PorterDuff.Mode.MULTIPLY);
            ImageView imageView2 = this.f45899r0;
            int i10 = org.telegram.ui.ActionBar.l6.f28277z8;
            org.telegram.ui.ActionBar.s6.Q(imageView2, org.telegram.ui.ActionBar.l6.h0(org.telegram.ui.ActionBar.l6.x0(null, i10, false), 1, -1), null, org.telegram.ui.ActionBar.s6.M(i10), null);
        }
        ImageView imageView3 = this.f45900s0;
        if (imageView3 != null) {
            org.telegram.ui.ActionBar.s6.s(imageView3, org.telegram.ui.ActionBar.l6.G6, null, PorterDuff.Mode.MULTIPLY);
            ImageView imageView4 = this.f45900s0;
            int i11 = org.telegram.ui.ActionBar.l6.f28277z8;
            org.telegram.ui.ActionBar.s6.Q(imageView4, org.telegram.ui.ActionBar.l6.h0(org.telegram.ui.ActionBar.l6.x0(null, i11, false), 1, -1), null, org.telegram.ui.ActionBar.s6.M(i11), null);
        }
        org.telegram.ui.Components.j6 j6Var = this.f45901t0;
        if (j6Var != null) {
            org.telegram.ui.ActionBar.s6.Y(j6Var, org.telegram.ui.ActionBar.l6.G6, null);
        }
        l0 l0Var = this.f45890h0;
        if (l0Var != null) {
            k3 k3Var = this.f45902u0[0];
            if (k3Var != null && org.telegram.messenger.iz.f23443v0) {
                x02 = k3Var.getBackgroundColor();
            } else {
                x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Dl, false);
            }
            l0Var.setMenuColors(x02);
            l0 l0Var2 = this.f45890h0;
            k3 k3Var2 = this.f45902u0[0];
            if (k3Var2 != null && org.telegram.messenger.iz.f23443v0) {
                x03 = k3Var2.getActionBarColor();
            } else {
                x03 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Dl, false);
            }
            l0Var2.d(x03, true);
        }
        this.f45894l0.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Dl, false));
    }

    public final void S() {
        int L0;
        int i7;
        boolean z9 = false;
        k3 k3Var = this.f45902u0[0];
        if (k3Var.f47168c.E != null && (L0 = k3Var.d.L0()) != -1) {
            View m10 = this.f45902u0[0].d.m(L0);
            if (m10 != null) {
                i7 = m10.getTop();
            } else {
                i7 = 0;
            }
            String str = "article" + this.f45902u0[0].f47168c.E.f27111id;
            SharedPreferences.Editor putInt = org.telegram.messenger.t0.f25566b.getSharedPreferences("articles", 0).edit().putInt(str, L0).putInt(str + "o", i7);
            String r10 = rf.b.r(str, "r");
            Point point = org.telegram.messenger.g0.f22563q;
            if (point.x > point.y) {
                z9 = true;
            }
            putInt.putBoolean(r10, z9).commit();
        }
    }

    public final boolean T(String str, boolean z9) {
        String lowerCase;
        Integer num = 0;
        if (!TextUtils.isEmpty(str)) {
            String lowerCase2 = str.toLowerCase();
            Integer num2 = (Integer) this.f45902u0[0].f47168c.h.get(lowerCase2);
            if (num2 != null) {
                TL_iv.textAnchor textanchor = (TL_iv.textAnchor) this.f45902u0[0].f47168c.f45177r.get(lowerCase2);
                if (textanchor != null) {
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    if (!TextUtils.isEmpty(this.f45902u0[0].f47168c.E.cached_page.url)) {
                        lowerCase = this.f45902u0[0].f47168c.E.cached_page.url.toLowerCase();
                    } else {
                        lowerCase = this.f45902u0[0].f47168c.E.url.toLowerCase();
                    }
                    pageblockparagraph.text = org.telegram.ui.web.w1.d(textanchor.text, lowerCase, lowerCase2);
                    this.f45902u0[0].f47168c.getClass();
                    int I = e4.I(pageblockparagraph);
                    v4.d1 x10 = this.f45902u0[0].f47168c.x(null, I);
                    View view = x10.f57056a;
                    this.f45902u0[0].f47168c.H(I, x10, pageblockparagraph, 0, 0, false);
                    org.telegram.ui.ActionBar.v2 h = org.telegram.messenger.camera.q.h(this.L, false, 1, null);
                    h.f28655u0 = false;
                    h.f28656v0 = false;
                    LinearLayout linearLayout = new LinearLayout(this.L);
                    linearLayout.setOrientation(1);
                    org.telegram.ui.Cells.i9 i9Var = new org.telegram.ui.Cells.i9();
                    this.Q0 = i9Var;
                    i9Var.S(linearLayout);
                    this.Q0.D = new n0(this, 1);
                    int i7 = 5;
                    bi.md mdVar = new bi.md(this.L, 5);
                    mdVar.setTextSize(1, 16.0f);
                    mdVar.setTypeface(org.telegram.messenger.g0.o());
                    mdVar.setText(org.telegram.messenger.id.M0(2131749192, null));
                    if (!this.f45902u0[0].f47168c.G) {
                        i7 = 3;
                    }
                    mdVar.setGravity(i7 | 16);
                    mdVar.setTextColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.G6, false));
                    mdVar.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
                    linearLayout.addView(mdVar, new LinearLayout.LayoutParams(-1, org.telegram.messenger.g0.L(48.0f) + 1));
                    view.setTag("bottomSheet");
                    linearLayout.addView(view, c8.ha.k(0.0f, 7.0f, 0.0f, 0.0f, -1, -2));
                    org.telegram.ui.Cells.u9 n10 = this.Q0.n(this.L);
                    bi.x5 x5Var = new bi.x5(this, this.L, linearLayout, 7);
                    h.f28662y0 = new h0(this, 0);
                    x5Var.addView(linearLayout, -1, -2);
                    x5Var.addView(n10, -1, -2);
                    h.N = x5Var;
                    if (this.P0.x()) {
                        this.P0.f(false);
                    }
                    this.I = h;
                    Y(h);
                    return true;
                } else if (num2.intValue() >= 0 && num2.intValue() < this.f45902u0[0].f47168c.f45174e.size()) {
                    TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) this.f45902u0[0].f47168c.f45174e.get(num2.intValue());
                    TL_iv.PageBlock x11 = x(pageBlock);
                    if ((x11 instanceof u3) && M((u3) x11)) {
                        this.f45902u0[0].f47168c.M();
                        this.f45902u0[0].f47168c.f();
                    }
                    int indexOf = this.f45902u0[0].f47168c.d.indexOf(pageBlock);
                    if (indexOf != -1) {
                        num2 = Integer.valueOf(indexOf);
                    }
                    Integer num3 = (Integer) this.f45902u0[0].f47168c.f45176n.get(lowerCase2);
                    if (num3 != null) {
                        if (num3.intValue() == -1) {
                            this.f45902u0[0].f47168c.getClass();
                            int I2 = e4.I(pageBlock);
                            v4.d1 x12 = this.f45902u0[0].f47168c.x(null, I2);
                            this.f45902u0[0].f47168c.H(I2, x12, pageBlock, 0, 0, false);
                            x12.f57056a.measure(View.MeasureSpec.makeMeasureSpec(this.f45902u0[0].f47167b.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                            Integer num4 = (Integer) this.f45902u0[0].f47168c.f45176n.get(lowerCase2);
                            if (num4.intValue() != -1) {
                                num = num4;
                            }
                        } else {
                            num = num3;
                        }
                    }
                    if (this.f45902u0[0].f47168c.I) {
                        num2 = Integer.valueOf(num2.intValue() + 1);
                    }
                    if (z9) {
                        org.telegram.ui.Components.cu0 cu0Var = new org.telegram.ui.Components.cu0(this.f45902u0[0].getContext());
                        cu0Var.f57225a = num2.intValue();
                        cu0Var.f32761s = (-org.telegram.messenger.g0.L(56.0f)) - num.intValue();
                        this.f45902u0[0].d.w0(cu0Var);
                        return true;
                    }
                    this.f45902u0[0].d.h1(num2.intValue(), (-org.telegram.messenger.g0.L(56.0f)) - num.intValue());
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
        l0 l0Var = this.f45890h0;
        if (l0Var != null && !l0Var.T && !l0Var.W) {
            int j3 = Utilities.j(i7, org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(24.0f));
            this.J0 = j3;
            this.f45890h0.setHeight(j3);
            this.P0.f30686x = this.J0;
            int i10 = 0;
            while (true) {
                k3[] k3VarArr = this.f45902u0;
                if (i10 < k3VarArr.length) {
                    k3VarArr[i10].f47167b.setTopGlowOffset(this.J0);
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void W(Activity activity, org.telegram.ui.ActionBar.f2 f2Var) {
        bg.v0 v0Var;
        int i7;
        boolean z9;
        int x02;
        int i10;
        int i11;
        t3 t3Var;
        bg.v0 v0Var2 = this.V0;
        if (v0Var2 != null) {
            v0Var2.b();
            this.V0 = null;
        }
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            v0Var = new bg.v0(launchActivity, true);
        } else {
            v0Var = null;
        }
        this.V0 = v0Var;
        this.M = f2Var;
        if (!(f2Var instanceof lx)) {
            i7 = f2Var.getCurrentAccount();
        } else {
            i7 = org.telegram.messenger.p10.f24470s0;
        }
        this.X = i7;
        org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.f24992e2);
        org.telegram.messenger.qs.f(this.X).c(this, org.telegram.messenger.qs.f24998f2);
        org.telegram.messenger.qs.f(this.X).c(this, org.telegram.messenger.qs.f25004g2);
        org.telegram.messenger.qs.f(this.X).c(this, org.telegram.messenger.qs.f25010h2);
        org.telegram.messenger.qs.f(this.X).c(this, org.telegram.messenger.qs.f25018i4);
        Activity activity2 = this.L;
        if (activity2 != activity && (activity2 == null || !this.J || (t3Var = this.K) == null || t3Var.f50048e == null)) {
            this.L = activity;
            this.f48917a = org.telegram.messenger.t0.f25566b.getSharedPreferences("articles", 0).getInt("font_type", 0);
            p(this, false);
            this.f45894l0 = new Paint();
            this.m0 = activity.getResources().getDrawable(2131231619);
            this.f45895n0 = new Paint();
            ArticleViewer$WindowView articleViewer$WindowView = new ArticleViewer$WindowView(this, activity);
            this.f45888f0 = articleViewer$WindowView;
            articleViewer$WindowView.setWillNotDraw(false);
            this.f45888f0.setClipChildren(true);
            this.f45888f0.setFocusable(false);
            k0 k0Var = new k0(0, activity, this);
            this.f45889g0 = k0Var;
            this.f45888f0.addView(k0Var, c8.ha.e(-1, -1, 51));
            if (this.K == null) {
                this.f45888f0.setFitsSystemWindows(true);
                this.f45889g0.setOnApplyWindowInsetsListener(new org.telegram.ui.ActionBar.w2(1));
            }
            FrameLayout frameLayout = new FrameLayout(activity);
            this.P = frameLayout;
            frameLayout.setBackgroundColor(-16777216);
            this.P.setVisibility(4);
            this.f45888f0.addView(this.P, c8.ha.c(-1.0f, -1));
            j4 j4Var = new j4(activity);
            this.R = j4Var;
            j4Var.setVisibility(0);
            this.R.setBackgroundColor(-16777216);
            this.P.addView(this.R, c8.ha.e(-1, -1, 17));
            this.Q = new TextureView(activity);
            this.f45902u0 = new k3[2];
            int i12 = 0;
            while (true) {
                k3[] k3VarArr = this.f45902u0;
                if (i12 >= k3VarArr.length) {
                    break;
                }
                k3 k3Var = new k3(this, activity);
                k3VarArr[i12] = k3Var;
                if (i12 == 0) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                k3Var.setVisibility(i11);
                this.f45889g0.addView(k3Var, c8.ha.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
                k3Var.f47167b.setOnItemLongClickListener(new s(this));
                k3Var.f47167b.setOnItemClickListener(new ni.c(2, this, k3Var));
                i12++;
            }
            this.f45889g0.addView(new FrameLayout(activity), c8.ha.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f45904w0.setColor(-16777216);
            this.f45905x0.setColor(-16777216);
            this.A0.setColor(-14408666);
            this.f45906y0.setColor(-16777216);
            l0 l0Var = new l0(this, activity);
            this.f45890h0 = l0Var;
            if (this.K != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            l0Var.f51175e0 = z9;
            this.f45889g0.addView(l0Var, c8.ha.e(-1, -2, 48));
            this.f45890h0.setOnClickListener(new org.telegram.ui.ActionBar.l1(1, this, activity));
            this.f45890h0.f51170b0.addTextChangedListener(new m0(this, 0));
            org.telegram.ui.web.j jVar = new org.telegram.ui.web.j(activity);
            this.f45891i0 = jVar;
            jVar.setOpenProgress(0.0f);
            this.f45891i0.f51154x.j(new g3(this, 2));
            this.f45889g0.addView(this.f45891i0, c8.ha.c(-1.0f, -1));
            this.f45892j0 = new a0(this, 3);
            this.f45890h0.L.setOnClickListener(new r(this, 2));
            this.f45890h0.L.setOnLongClickListener(new t(this, 0));
            this.f45890h0.setMenuListener(new org.telegram.messenger.voip.k(4, this, activity));
            this.f45890h0.O.setOnClickListener(new r(this, 3));
            di.b4 b4Var = new di.b4(this.L, 6);
            this.f45898q0 = b4Var;
            b4Var.setOnTouchListener(new ei.b(3));
            this.f45898q0.setWillNotDraw(false);
            this.f45898q0.setTranslationY(org.telegram.messenger.g0.L(51.0f));
            this.f45898q0.setVisibility(4);
            this.f45898q0.setFocusable(true);
            this.f45898q0.setFocusableInTouchMode(true);
            this.f45898q0.setClickable(true);
            this.f45898q0.setPadding(0, org.telegram.messenger.g0.L(3.0f), 0, 0);
            this.f45889g0.addView(this.f45898q0, c8.ha.e(-1, 51, 80));
            new fi.q3(this.f45888f0, false, new q(this, 0));
            ImageView imageView = new ImageView(this.L);
            this.f45899r0 = imageView;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            this.f45899r0.setImageResource(2131232174);
            ImageView imageView2 = this.f45899r0;
            int i13 = org.telegram.ui.ActionBar.l6.G6;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.s6.s(imageView2, i13, null, mode);
            ImageView imageView3 = this.f45899r0;
            int i14 = org.telegram.ui.ActionBar.l6.f28277z8;
            org.telegram.ui.ActionBar.s6.Q(imageView3, org.telegram.ui.ActionBar.l6.h0(org.telegram.ui.ActionBar.l6.x0(null, i14, false), 1, -1), null, org.telegram.ui.ActionBar.s6.M(i14), null);
            this.f45898q0.addView(this.f45899r0, c8.ha.d(48, 48.0f, 53, 0.0f, 0.0f, 48.0f, 0.0f));
            this.f45899r0.setOnClickListener(new r(this, 0));
            this.f45899r0.setContentDescription(org.telegram.messenger.id.M0(2131754779, null));
            ImageView imageView4 = new ImageView(this.L);
            this.f45900s0 = imageView4;
            imageView4.setScaleType(scaleType);
            this.f45900s0.setImageResource(2131232173);
            org.telegram.ui.ActionBar.s6.s(this.f45900s0, i13, null, mode);
            org.telegram.ui.ActionBar.s6.Q(this.f45900s0, org.telegram.ui.ActionBar.l6.h0(org.telegram.ui.ActionBar.l6.x0(null, i14, false), 1, -1), null, org.telegram.ui.ActionBar.s6.M(i14), null);
            this.f45898q0.addView(this.f45900s0, c8.ha.d(48, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f45900s0.setOnClickListener(new r(this, 1));
            this.f45900s0.setContentDescription(org.telegram.messenger.id.M0(2131754778, null));
            org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(this.L, true, true, true);
            this.f45901t0 = j6Var;
            j6Var.setScaleProperty(0.6f);
            this.f45901t0.b(0.4f, 350L, org.telegram.ui.Components.xq.h);
            org.telegram.ui.ActionBar.s6.Y(this.f45901t0, i13, null);
            this.f45901t0.setTextSize(org.telegram.messenger.g0.L(15.0f));
            this.f45901t0.setTypeface(org.telegram.messenger.g0.o());
            this.f45901t0.setGravity(3);
            this.f45901t0.getDrawable().M = org.telegram.messenger.g0.f22563q.x;
            this.f45898q0.addView(this.f45901t0, c8.ha.d(-2, -2.0f, 19, 18.0f, 0.0f, 108.0f, 0.0f));
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.f45887e0 = layoutParams;
            layoutParams.height = -1;
            layoutParams.format = -3;
            layoutParams.width = -1;
            layoutParams.gravity = 51;
            layoutParams.type = 98;
            layoutParams.softInputMode = 48;
            layoutParams.flags = 131072;
            if (this.K == null) {
                x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27809a7, true);
            } else {
                x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27809a7, false);
            }
            if (org.telegram.messenger.g0.B(x02) >= 0.721f && Build.VERSION.SDK_INT >= 26) {
                i10 = 1808;
            } else {
                i10 = 1792;
            }
            this.f45906y0.setColor(x02);
            this.f45907z0 = true;
            WindowManager.LayoutParams layoutParams2 = this.f45887e0;
            layoutParams2.systemUiVisibility = i10;
            layoutParams2.flags |= -2147417856;
            if (Build.VERSION.SDK_INT >= 28) {
                layoutParams2.layoutInDisplayCutoutMode = 1;
            }
            org.telegram.ui.Cells.i9 i9Var = new org.telegram.ui.Cells.i9();
            this.P0 = i9Var;
            i9Var.S(this.f45902u0[0].f47167b);
            if (org.telegram.messenger.qp.s1(this.X).f24896s7.s()) {
                this.P0.f30671k0 = new s(this);
            }
            org.telegram.ui.Cells.i9 i9Var2 = this.P0;
            i9Var2.f29331z0 = this.f45902u0[0].d;
            i9Var2.D = new n0(this, 0);
            this.f45889g0.addView(i9Var2.n(activity));
            k0 k0Var2 = this.f45889g0;
            hr0 hr0Var = new hr0(k0Var2, k0Var2);
            this.R0 = hr0Var;
            hr0Var.F = new s(this);
            hr0Var.E = new f(this, 1);
            this.f45894l0.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Dl, false));
            e0(this);
            return;
        }
        e0(this);
        Q();
    }

    public final void X(String str) {
        String str2;
        if (this.L == null) {
            return;
        }
        org.telegram.ui.ActionBar.v2 v2Var = this.I;
        if (v2Var != null) {
            v2Var.dismiss();
            this.I = null;
        }
        org.telegram.ui.ActionBar.v2 h = org.telegram.messenger.camera.q.h(this.L, false, 1, null);
        try {
            str2 = URLDecoder.decode(str.replaceAll("\\+", "%2b"), "UTF-8");
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            str2 = str;
        }
        h.O = str2;
        h.P = false;
        h.Q = true;
        CharSequence[] charSequenceArr = {org.telegram.messenger.id.M0(2131747817, null), org.telegram.messenger.id.M0(2131751767, null)};
        og.j jVar = new og.j(1, this, str);
        h.L = charSequenceArr;
        h.K = jVar;
        h.H0 = new u(this, 0);
        Y(h);
    }

    public final void Y(org.telegram.ui.ActionBar.v2 v2Var) {
        if (this.L != null) {
            try {
                org.telegram.ui.ActionBar.v2 v2Var2 = this.f45893k0;
                if (v2Var2 != null) {
                    v2Var2.dismiss();
                    this.f45893k0 = null;
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            try {
                this.f45893k0 = v2Var;
                v2Var.setCanceledOnTouchOutside(true);
                this.f45893k0.setOnDismissListener(new u(this, 1));
                v2Var.show();
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
        }
    }

    public final void Z(boolean z9) {
        org.telegram.messenger.g0.r(this.f45892j0);
        if (z9) {
            this.f45890h0.f51173d0.a(false, 0.0f);
            this.f45890h0.f51173d0.a(true, 0.3f);
            org.telegram.messenger.g0.i3(this.f45892j0, 100L);
            return;
        }
        this.f45890h0.f51173d0.a(true, 1.0f);
    }

    @Override
    public final void a(e4 e4Var, org.telegram.ui.Components.ry0 ry0Var) {
        String str;
        String str2;
        org.telegram.ui.Components.y70 y70Var;
        String lowerCase;
        if (ry0Var != null && (str = ry0Var.f37842b) != null) {
            org.telegram.ui.ActionBar.v2 v2Var = this.I;
            j0 j0Var = null;
            if (v2Var != null) {
                v2Var.dismiss();
                this.I = null;
            }
            int lastIndexOf = str.lastIndexOf(35);
            boolean z9 = false;
            if (lastIndexOf != -1) {
                if (!TextUtils.isEmpty(e4Var.E.cached_page.url)) {
                    lowerCase = e4Var.E.cached_page.url.toLowerCase();
                } else {
                    lowerCase = e4Var.E.url.toLowerCase();
                }
                try {
                    str2 = URLDecoder.decode(str.substring(lastIndexOf + 1), "UTF-8");
                } catch (Exception unused) {
                    str2 = "";
                }
                if (lastIndexOf == 0 || str.toLowerCase().contains(lowerCase)) {
                    z9 = true;
                    T(str2, true);
                }
            } else {
                str2 = null;
            }
            if (!z9) {
                z2 z2Var = this.d;
                if (z2Var != null && (y70Var = this.f48918b) != null) {
                    j0Var = new j0(this, z2Var, y70Var);
                }
                O(str, str2, j0Var);
            }
        }
    }

    public final void a0() {
        LaunchActivity launchActivity;
        FrameLayout frameLayout;
        if (this.W && (launchActivity = LaunchActivity.G1) != null && !launchActivity.isFinishing()) {
            if (this.f45902u0[0].f()) {
                if (this.f45902u0[0].getWebView() != null) {
                    frameLayout = this.f45902u0[0].f47170f;
                } else {
                    return;
                }
            } else {
                k3 k3Var = this.f45902u0[0];
                TLRPC.WebPage webPage = k3Var.f47168c.E;
                frameLayout = k3Var;
                if (webPage == null) {
                    return;
                }
            }
            new org.telegram.ui.Components.hc(frameLayout, null).G(2131623981, 4, org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131752874, null), new a0(this, 11))).k(true);
        }
    }

    @Override
    public final boolean b(TL_iv.PageBlock pageBlock, e4 e4Var) {
        int indexOf;
        List list;
        org.telegram.ui.ActionBar.f2 f2Var = this.M;
        if (f2Var != null && f2Var.getParentActivity() != null) {
            if ((pageBlock instanceof TL_iv.pageBlockVideo) && !d4.g(e4Var.E, pageBlock)) {
                list = Collections.singletonList(pageBlock);
                indexOf = 0;
            } else {
                ArrayList arrayList = new ArrayList(e4Var.f45175f);
                indexOf = e4Var.f45175f.indexOf(pageBlock);
                list = arrayList;
            }
            PhotoViewer p12 = PhotoViewer.p1();
            p12.H2(null, this.M, null);
            if (p12.c2(null, null, null, null, null, null, null, indexOf, new d3(this, list), null, 0L, 0L, 0L, true, new m3(this, e4Var.E, list), null)) {
                l();
                return true;
            }
        }
        return false;
    }

    public final void b0(boolean z9) {
        float f10;
        this.f45898q0.setVisibility(0);
        ValueAnimator valueAnimator = this.Y0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.Z0;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.Y0 = ofFloat;
        ofFloat.addUpdateListener(new p(this, 1));
        this.Y0.addListener(new ch.y(19, this, z9));
        this.Y0.setDuration(320L);
        this.Y0.setInterpolator(org.telegram.ui.Components.xq.h);
        this.Y0.start();
    }

    public final void c0(int i7, Object obj, boolean z9) {
        int L;
        int i10;
        int i11;
        int i12;
        int color;
        int x02;
        int x03;
        boolean z10;
        boolean z11;
        if (obj != null) {
            if (((obj instanceof TLRPC.WebPage) && ((TLRPC.WebPage) obj).cached_page != null) || (obj instanceof x2)) {
                int i13 = 1;
                if (!z9 && i7 != 0) {
                    k3[] k3VarArr = this.f45902u0;
                    k3 k3Var = k3VarArr[1];
                    k3VarArr[1] = k3VarArr[0];
                    k3VarArr[0] = k3Var;
                    this.f45890h0.i();
                    this.f45882a1.a(this.f45902u0[0].getBackgroundColor(), true);
                    this.f45884b1.a(this.f45902u0[1].getBackgroundColor(), true);
                    t3 t3Var = this.K;
                    if (t3Var != null) {
                        t3Var.z();
                    }
                    int indexOfChild = this.f45889g0.indexOfChild(this.f45902u0[0]);
                    int indexOfChild2 = this.f45889g0.indexOfChild(this.f45902u0[1]);
                    if (i7 == 1) {
                        if (indexOfChild < indexOfChild2) {
                            this.f45889g0.removeView(this.f45902u0[0]);
                            this.f45889g0.addView(this.f45902u0[0], indexOfChild2);
                        }
                    } else if (indexOfChild2 < indexOfChild) {
                        this.f45889g0.removeView(this.f45902u0[0]);
                        this.f45889g0.addView(this.f45902u0[0], indexOfChild);
                    }
                    this.f45903v0 = new AnimatorSet();
                    this.f45902u0[0].setVisibility(0);
                    if (i7 == 1) {
                        i12 = 0;
                    } else {
                        i12 = 1;
                    }
                    k3 k3Var2 = this.f45902u0[i12];
                    if (this.K == null) {
                        color = 0;
                    } else {
                        color = this.f45894l0.getColor();
                    }
                    k3Var2.setBackgroundColor(color);
                    this.f45902u0[i12].setLayerType(2, null);
                    if (i7 == 1) {
                        k3 k3Var3 = this.f45902u0[0];
                        Point point = org.telegram.messenger.g0.f22563q;
                        k3Var3.setTranslationX(point.x);
                        this.f45903v0.playTogether(ObjectAnimator.ofFloat(this.f45902u0[0], View.TRANSLATION_X, point.x, 0.0f));
                    } else if (i7 == -1) {
                        this.f45902u0[0].setTranslationX(0.0f);
                        this.f45903v0.playTogether(ObjectAnimator.ofFloat(this.f45902u0[1], View.TRANSLATION_X, 0.0f, org.telegram.messenger.g0.f22563q.x));
                    }
                    this.f45903v0.setDuration(320L);
                    this.f45903v0.setInterpolator(org.telegram.ui.Components.xq.h);
                    this.f45903v0.addListener(new r0(this, i12, 0));
                    this.f45888f0.f28847f = true;
                    l0 l0Var = this.f45890h0;
                    k3 k3Var4 = this.f45902u0[0];
                    if (k3Var4 != null && org.telegram.messenger.iz.f23443v0) {
                        x02 = k3Var4.getBackgroundColor();
                    } else {
                        x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Dl, false);
                    }
                    l0Var.setMenuColors(x02);
                    l0 l0Var2 = this.f45890h0;
                    k3 k3Var5 = this.f45902u0[0];
                    if (k3Var5 != null && org.telegram.messenger.iz.f23443v0) {
                        x03 = k3Var5.getActionBarColor();
                    } else {
                        x03 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Dl, false);
                    }
                    l0Var2.d(x03, true);
                    l0 l0Var3 = this.f45890h0;
                    k3 k3Var6 = this.f45902u0[0];
                    if (k3Var6 != null && k3Var6.e()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    l0Var3.setIsTonsite(z10);
                    l0 l0Var4 = this.f45890h0;
                    k3 k3Var7 = this.f45902u0[0];
                    if (k3Var7 != null && k3Var7.d()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    l0Var4.setIsLocal(z11);
                    AnimatorSet animatorSet = this.f45903v0;
                    Objects.requireNonNull(animatorSet);
                    org.telegram.messenger.g0.h3(new iq0(animatorSet, 4));
                }
                if (!z9) {
                    this.P0.f(true);
                }
                e4 e4Var = this.f45902u0[z9 ? 1 : 0].f47168c;
                if (z9) {
                    obj = jg.g.i(2, this.f45886d0);
                }
                this.f45902u0[z9 ? 1 : 0].b();
                if (obj instanceof TLRPC.WebPage) {
                    TLRPC.WebPage webPage = (TLRPC.WebPage) obj;
                    this.f45902u0[z9 ? 1 : 0].setWeb(null);
                    this.f45902u0[z9 ? 1 : 0].setType(0);
                    TL_iv.Page page = webPage.cached_page;
                    e4Var.G = page.rtl;
                    e4Var.E = webPage;
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
                                        e4Var.F = (TL_iv.pageBlockChannel) pageBlock2;
                                    }
                                }
                            }
                        } else if (i14 == 1 && e4Var.F != null) {
                        }
                        if (i14 == size - 1) {
                            i11 = i14;
                        } else {
                            i11 = 0;
                        }
                        e4Var.F(e4Var, pageBlock, 0, 0, i11);
                    }
                    e4Var.f();
                    if (this.f45886d0.size() != 1 && i7 != -1) {
                        v4.b0 b0Var = this.f45902u0[z9 ? 1 : 0].d;
                        t3 t3Var2 = this.K;
                        if (t3Var2 == null) {
                            i13 = 0;
                        }
                        if (t3Var2 != null) {
                            i10 = org.telegram.messenger.g0.L(32.0f);
                        } else {
                            i10 = 0;
                        }
                        b0Var.h1(i13, i10);
                    } else {
                        SharedPreferences sharedPreferences = org.telegram.messenger.t0.f25566b.getSharedPreferences("articles", 0);
                        String str = "article" + webPage.f27111id;
                        int i15 = sharedPreferences.getInt(str, -1);
                        boolean z12 = sharedPreferences.getBoolean(str + "r", true);
                        Point point2 = org.telegram.messenger.g0.f22563q;
                        if (point2.x <= point2.y) {
                            i13 = 0;
                        }
                        if (z12 == i13) {
                            L = sharedPreferences.getInt(str + "o", 0) - this.f45902u0[z9 ? 1 : 0].f47167b.getPaddingTop();
                        } else {
                            L = org.telegram.messenger.g0.L(10.0f);
                        }
                        if (i15 != -1) {
                            this.f45902u0[z9 ? 1 : 0].d.h1(i15, L);
                        }
                    }
                } else if (obj instanceof x2) {
                    this.f45902u0[z9 ? 1 : 0].setType(1);
                    this.f45902u0[z9 ? 1 : 0].g();
                    this.f45902u0[z9 ? 1 : 0].setWeb((x2) obj);
                }
                if (!z9) {
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
        boolean z9;
        boolean z10;
        k3 k3Var2;
        float f10;
        boolean z11;
        boolean z12;
        if (this.f45890h0 != null && (k3Var = (k3VarArr = this.f45902u0)[0]) != null && k3VarArr[1] != null) {
            int visibility = k3Var.getVisibility();
            float f11 = 0.0f;
            if (visibility != 0) {
                translationX = 0.0f;
            } else {
                translationX = 1.0f - (this.f45902u0[0].getTranslationX() / this.f45902u0[0].getWidth());
            }
            float f12 = 1.0f - translationX;
            l0 l0Var = this.f45890h0;
            l0Var.d[0] = this.f45902u0[0].getProgress();
            l0Var.invalidate();
            l0 l0Var2 = this.f45890h0;
            l0Var2.d[1] = this.f45902u0[1].getProgress();
            l0Var2.invalidate();
            this.f45890h0.setTransitionProgress(f12);
            l0 l0Var3 = this.f45890h0;
            if (!l0Var3.W && !l0Var3.T) {
                ArticleViewer$WindowView articleViewer$WindowView = this.f45888f0;
                if (articleViewer$WindowView.f28846e || articleViewer$WindowView.f28847f) {
                    boolean H = H();
                    ArrayList arrayList = this.f45886d0;
                    if (!H && arrayList.size() <= 1) {
                        this.f45890h0.P.c();
                        this.f45890h0.setBackButtonCached(false);
                    } else {
                        if (!this.f45902u0[0].f47173s && arrayList.size() <= 1) {
                            f10 = 0.0f;
                        } else {
                            f10 = 1.0f;
                        }
                        if (this.f45902u0[1].f47173s || arrayList.size() > 2) {
                            f11 = 1.0f;
                        }
                        float T1 = org.telegram.messenger.g0.T1(f10, f11, f12);
                        this.f45890h0.M.c(false, 1.0f - T1);
                        this.f45890h0.P.c();
                        l0 l0Var4 = this.f45890h0;
                        if (T1 > 0.5f) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        l0Var4.setBackButtonCached(z11);
                    }
                    this.f45890h0.setHasForward(this.f45902u0[0].f47174w);
                    this.f45890h0.setIsLocal(this.f45902u0[0].d());
                    l0 l0Var5 = this.f45890h0;
                    if (this.f45902u0[0].getWebView() != null && this.f45902u0[0].getWebView().f51295b) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    l0Var5.setIsLoaded(z12);
                }
            }
            l0 l0Var6 = this.f45890h0;
            int actionBarColor = this.f45902u0[0].getActionBarColor();
            ArticleViewer$WindowView articleViewer$WindowView2 = this.f45888f0;
            if (!articleViewer$WindowView2.f28846e && !articleViewer$WindowView2.f28847f) {
                z9 = false;
            } else {
                z9 = true;
            }
            l0Var6.b(0, this.f45882a1.a(actionBarColor, z9));
            l0 l0Var7 = this.f45890h0;
            int actionBarColor2 = this.f45902u0[1].getActionBarColor();
            ArticleViewer$WindowView articleViewer$WindowView3 = this.f45888f0;
            if (!articleViewer$WindowView3.f28846e && !articleViewer$WindowView3.f28847f) {
                z10 = false;
            } else {
                z10 = true;
            }
            l0Var7.b(1, this.f45884b1.a(actionBarColor2, z10));
            this.f45890h0.d(i0.a.f(f12, this.f45902u0[0].getActionBarColor(), this.f45902u0[1].getActionBarColor()), false);
            l0 l0Var8 = this.f45890h0;
            if (translationX > 0.5f) {
                k3Var2 = this.f45902u0[0];
            } else {
                k3Var2 = this.f45902u0[1];
            }
            l0Var8.setMenuType(k3Var2.f47166a);
            t3 t3Var = this.K;
            if (t3Var != null) {
                t3Var.f50047c.invalidate();
                return;
            }
            ArticleViewer$WindowView articleViewer$WindowView4 = this.f45888f0;
            if (articleViewer$WindowView4 != null) {
                articleViewer$WindowView4.invalidate();
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        x0 x0Var;
        org.telegram.messenger.ij messageObject;
        if (i7 == org.telegram.messenger.qs.f25010h2) {
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) objArr[0];
            if (this.f45902u0 != null) {
                int i11 = 0;
                while (true) {
                    k3[] k3VarArr = this.f45902u0;
                    if (i11 < k3VarArr.length) {
                        int childCount = k3VarArr[i11].f47167b.getChildCount();
                        for (int i12 = 0; i12 < childCount; i12++) {
                            View childAt = this.f45902u0[i11].f47167b.getChildAt(i12);
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
        } else if (i7 != org.telegram.messenger.qs.f24998f2 && i7 != org.telegram.messenger.qs.f25004g2) {
            if (i7 == org.telegram.messenger.qs.f24992e2) {
                Integer num = (Integer) objArr[0];
                if (this.f45902u0 != null) {
                    int i13 = 0;
                    while (true) {
                        k3[] k3VarArr2 = this.f45902u0;
                        if (i13 < k3VarArr2.length) {
                            int childCount2 = k3VarArr2[i13].f47167b.getChildCount();
                            int i14 = 0;
                            while (true) {
                                if (i14 < childCount2) {
                                    View childAt2 = this.f45902u0[i13].f47167b.getChildAt(i14);
                                    if ((childAt2 instanceof x0) && (messageObject = (x0Var = (x0) childAt2).getMessageObject()) != null && messageObject.e1() == num.intValue()) {
                                        org.telegram.messenger.ij ijVar2 = MediaController.B().f21295u0;
                                        if (ijVar2 != null) {
                                            messageObject.f23222b0 = ijVar2.f23222b0;
                                            messageObject.f23245g0 = ijVar2.f23245g0;
                                            messageObject.f23249h0 = ijVar2.f23249h0;
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
            } else if (i7 == org.telegram.messenger.qs.f25018i4 && this.f45902u0 != null) {
                int i15 = 0;
                while (true) {
                    k3[] k3VarArr3 = this.f45902u0;
                    if (i15 < k3VarArr3.length) {
                        int childCount3 = k3VarArr3[i15].f47167b.getChildCount();
                        for (int i16 = 0; i16 < childCount3; i16++) {
                            View childAt3 = this.f45902u0[i15].f47167b.getChildAt(i16);
                            if (childAt3 instanceof s2) {
                                ((s2) childAt3).f49724e.invalidate();
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
        } else if (this.f45902u0 != null) {
            int i17 = 0;
            while (true) {
                k3[] k3VarArr4 = this.f45902u0;
                if (i17 < k3VarArr4.length) {
                    int childCount4 = k3VarArr4[i17].f47167b.getChildCount();
                    for (int i18 = 0; i18 < childCount4; i18++) {
                        View childAt4 = this.f45902u0[i17].f47167b.getChildAt(i18);
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
        org.telegram.ui.ActionBar.c3 c3Var = new org.telegram.ui.ActionBar.c3();
        c3Var.f27386x = str;
        this.f45886d0.add(c3Var);
        this.f45890h0.h(false);
        c0(i7, c3Var, false);
    }

    public final boolean f(TLRPC.WebPage webPage, String str, int i7) {
        S();
        this.f45886d0.add(webPage);
        this.f45890h0.h(false);
        c0(i7, webPage, false);
        return T(str, false);
    }

    public final void f0() {
        int i7;
        int size;
        boolean z9;
        boolean z10;
        float f10;
        if (this.E == null && !this.f45902u0[0].f()) {
            return;
        }
        if (this.f45902u0[0].f()) {
            if (this.f45902u0[0].getWebView() == null) {
                i7 = 0;
            } else {
                i7 = this.f45902u0[0].getWebView().getSearchIndex();
            }
            if (this.f45902u0[0].getWebView() == null) {
                size = 0;
            } else {
                size = this.f45902u0[0].getWebView().getSearchCount();
            }
        } else {
            i7 = this.G;
            size = this.E.size();
        }
        ImageView imageView = this.f45899r0;
        if (size > 0 && i7 != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        imageView.setEnabled(z9);
        ImageView imageView2 = this.f45900s0;
        if (size > 0 && i7 != size - 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        imageView2.setEnabled(z10);
        ImageView imageView3 = this.f45899r0;
        float f11 = 0.5f;
        if (imageView3.isEnabled()) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        imageView3.setAlpha(f10);
        ImageView imageView4 = this.f45900s0;
        if (imageView4.isEnabled()) {
            f11 = 1.0f;
        }
        imageView4.setAlpha(f11);
        this.f45901t0.a();
        if (size < 0) {
            this.f45901t0.setText("");
        } else if (size == 0) {
            this.f45901t0.setText(org.telegram.messenger.id.M0(2131748167, null));
        } else if (size == 1) {
            this.f45901t0.setText(org.telegram.messenger.id.M0(2131747827, null));
        } else {
            this.f45901t0.setText(String.format(org.telegram.messenger.id.K0(size, "CountOfResults"), Integer.valueOf(i7 + 1), Integer.valueOf(size)));
        }
    }

    public final void g0(boolean z9) {
        boolean z10;
        boolean z11 = false;
        this.f45890h0.g(0, this.f45902u0[0].getTitle(), z9);
        this.f45890h0.f(0, this.f45902u0[0].getSubtitle());
        l0 l0Var = this.f45890h0;
        if (this.f45902u0[0].f() && this.f45902u0[0].getWebView() != null && this.f45902u0[0].getWebView().E) {
            z10 = true;
        } else {
            z10 = false;
        }
        l0Var.e(0, z10);
        this.f45890h0.g(1, this.f45902u0[1].getTitle(), z9);
        this.f45890h0.f(1, this.f45902u0[1].getSubtitle());
        l0 l0Var2 = this.f45890h0;
        if (this.f45902u0[1].f() && this.f45902u0[1].getWebView() != null && this.f45902u0[1].getWebView().E) {
            z11 = true;
        }
        l0Var2.e(1, z11);
    }

    public final void i() {
        this.K0 = false;
        y2 y2Var = this.L0;
        if (y2Var != null) {
            this.f45888f0.removeCallbacks(y2Var);
            this.L0 = null;
        }
        y2 y2Var2 = this.M0;
        if (y2Var2 != null) {
            this.f45888f0.removeCallbacks(y2Var2);
            this.M0 = null;
        }
    }

    public final void k(org.telegram.messenger.ie ieVar) {
        if (this.J0 == org.telegram.messenger.g0.L(56.0f)) {
            if (ieVar != null) {
                ieVar.run();
                return;
            }
            return;
        }
        ValueAnimator duration = ValueAnimator.ofObject(new IntEvaluator(), Integer.valueOf(this.J0), Integer.valueOf(org.telegram.messenger.g0.L(56.0f))).setDuration(180L);
        duration.setInterpolator(new DecelerateInterpolator());
        duration.addUpdateListener(new p(this, 0));
        duration.addListener(new m.a(ieVar, 12));
        if (ieVar != null) {
            duration.setDuration(duration.getDuration() / 2);
        }
        duration.start();
    }

    public final void l() {
        long j3;
        v2 v2Var;
        fi.v vVar = this.f45902u0[0].f47167b;
        if (vVar != null && this.W) {
            float measuredHeight = vVar.getMeasuredHeight() / 2.0f;
            Uri uri = null;
            float f10 = 0.0f;
            v2 v2Var2 = null;
            for (int i7 = 0; i7 < vVar.getChildCount(); i7++) {
                View childAt = vVar.getChildAt(i7);
                if (childAt instanceof v2) {
                    float measuredHeight2 = (childAt.getMeasuredHeight() / 2.0f) + childAt.getTop();
                    if (v2Var2 == null || Math.abs(measuredHeight - measuredHeight2) < Math.abs(measuredHeight - f10)) {
                        v2Var2 = (v2) childAt;
                        f10 = measuredHeight2;
                    }
                }
            }
            boolean z9 = PhotoViewer.p1().f41400f;
            if (z9 || ((v2Var = this.f48927y) != null && v2Var != v2Var2 && this.f48926x != null)) {
                VideoPlayerHolderBase videoPlayerHolderBase = this.f48926x;
                if (videoPlayerHolderBase != null) {
                    v2 v2Var3 = this.f48927y;
                    long j10 = v2Var3.L.video_id;
                    w2 a10 = w2.a(videoPlayerHolderBase, v2Var3);
                    v2Var3.c(a10);
                    this.D.k(a10, j10);
                    v2 v2Var4 = this.f48927y;
                    w2 w2Var = v2Var4.M;
                    if (w2Var != null) {
                        Bitmap bitmap = w2Var.f50834b;
                        if (bitmap != null) {
                            v2Var4.f50549e.v0(bitmap);
                        }
                        this.f48927y.e(false);
                    }
                    this.f48926x.release(null);
                }
                this.f48926x = null;
                this.f48927y = null;
            }
            if (!z9 && v2Var2 != null) {
                q50 q50Var = v2Var2.f50546a;
                if (v2Var2.O != null && q50Var.f48926x == null) {
                    q50Var.f48926x = new u2(v2Var2).with(v2Var2.f50551n);
                    TLRPC.Document document = v2Var2.O;
                    for (int i10 = 0; i10 < document.attributes.size(); i10++) {
                        if (document.attributes.get(i10) instanceof TLRPC.TL_documentAttributeVideo) {
                            TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) document.attributes.get(i10);
                            v2Var2.h.a(tL_documentAttributeVideo.f26963w / tL_documentAttributeVideo.h, 0);
                        }
                    }
                    TLRPC.WebPage webPage = v2Var2.f50547b.E;
                    if (webPage != null) {
                        uri = org.telegram.messenger.s8.f(((g4) q50Var).X, webPage, document);
                    }
                    if (uri != null) {
                        VideoPlayerHolderBase videoPlayerHolderBase2 = q50Var.f48926x;
                        w2 w2Var2 = v2Var2.M;
                        if (w2Var2 == null) {
                            j3 = 0;
                        } else {
                            j3 = w2Var2.f50833a;
                        }
                        videoPlayerHolderBase2.seekTo(j3);
                        q50Var.f48926x.preparePlayer(uri, true, 1.0f);
                        q50Var.f48926x.play();
                    }
                }
                this.f48927y = v2Var2;
            }
        }
    }

    public final void m(boolean z9, boolean z10) {
        if (this.L != null && !this.U0 && this.V) {
            int i7 = 0;
            if (this.Z != 0 && Math.abs(this.f45883b0 - System.currentTimeMillis()) >= 500) {
                Runnable runnable = this.f45881a0;
                if (runnable != null) {
                    runnable.run();
                    this.f45881a0 = null;
                }
                this.Z = 0;
            }
            if (this.Z == 0) {
                t3 t3Var = this.K;
                if (t3Var != null) {
                    t3Var.a(false);
                    return;
                }
                if (this.P.getVisibility() == 0) {
                    if (this.O != null) {
                        this.P.setVisibility(4);
                        this.S.onCustomViewHidden();
                        this.P.removeView(this.O);
                        this.O = null;
                    } else {
                        org.telegram.ui.Components.m71 m71Var = this.F0;
                        if (m71Var != null && m71Var.T) {
                            m71Var.T = false;
                            m71Var.m();
                            m71Var.l(false);
                        }
                    }
                    if (!z10) {
                        return;
                    }
                }
                if (this.P0.x()) {
                    this.P0.f(false);
                    return;
                }
                l0 l0Var = this.f45890h0;
                if (l0Var.T) {
                    l0Var.h(false);
                } else if (l0Var.W) {
                    l0Var.k(false);
                } else {
                    if (this.G0 != 0) {
                        ConnectionsManager.getInstance(this.X).cancelRequest(this.G0, true);
                        this.G0 = 0;
                        Z(false);
                    }
                    if (this.H0 != 0) {
                        ConnectionsManager.getInstance(this.X).cancelRequest(this.H0, true);
                        this.H0 = 0;
                        Z(false);
                    }
                    S();
                    if (z9 && !z10) {
                        ArrayList arrayList = this.f45886d0;
                        if (arrayList.size() >= 2) {
                            Object k10 = org.telegram.ui.Cells.f1.k(1, arrayList);
                            if (k10 instanceof x2) {
                                ((x2) k10).a();
                            }
                            if (k10 instanceof TLRPC.WebPage) {
                                org.telegram.ui.web.w1.o((TLRPC.WebPage) k10);
                            }
                            c0(-1, arrayList.get(arrayList.size() - 1), false);
                            return;
                        }
                    }
                    org.telegram.messenger.qs.f(this.X).n(this, org.telegram.messenger.qs.f24992e2);
                    org.telegram.messenger.qs.f(this.X).n(this, org.telegram.messenger.qs.f24998f2);
                    org.telegram.messenger.qs.f(this.X).n(this, org.telegram.messenger.qs.f25004g2);
                    org.telegram.messenger.qs.f(this.X).n(this, org.telegram.messenger.qs.f25010h2);
                    org.telegram.messenger.qs.f(this.X).n(this, org.telegram.messenger.qs.f25018i4);
                    bg.v0 v0Var = this.V0;
                    if (v0Var != null) {
                        v0Var.b();
                        this.V0 = null;
                    }
                    this.M = null;
                    try {
                        org.telegram.ui.ActionBar.v2 v2Var = this.f45893k0;
                        if (v2Var != null) {
                            v2Var.dismiss();
                            this.f45893k0 = null;
                        }
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    ArticleViewer$WindowView articleViewer$WindowView = this.f45888f0;
                    Property property = View.ALPHA;
                    animatorSet.playTogether(ObjectAnimator.ofFloat(articleViewer$WindowView, property, 0.0f), ObjectAnimator.ofFloat(this.f45889g0, property, 0.0f), ObjectAnimator.ofFloat(this.f45888f0, View.TRANSLATION_X, 0.0f, org.telegram.messenger.g0.L(56.0f)));
                    this.Z = 2;
                    this.f45881a0 = new a0(this, 10);
                    animatorSet.setDuration(150L);
                    animatorSet.setInterpolator(this.f45885c0);
                    animatorSet.addListener(new m.a(this, 13));
                    this.f45883b0 = System.currentTimeMillis();
                    this.f45889g0.setLayerType(2, null);
                    animatorSet.start();
                    while (true) {
                        a0.h hVar = this.D;
                        if (i7 < hVar.m()) {
                            w2 w2Var = (w2) hVar.n(i7);
                            Bitmap bitmap = w2Var.f50834b;
                            if (bitmap != null) {
                                bitmap.recycle();
                                w2Var.f50834b = null;
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
            ArrayList arrayList = this.f45886d0;
            if (i7 < arrayList.size()) {
                Object obj = arrayList.get(i7);
                if (obj instanceof x2) {
                    k3 k3Var = this.f45902u0[0];
                    if (k3Var != null && k3Var.K == obj) {
                        ((x2) obj).c(k3Var);
                    }
                    k3 k3Var2 = this.f45902u0[1];
                    if (k3Var2 != null && k3Var2.K == obj) {
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
        if (this.L != null && (articleViewer$WindowView = this.f45888f0) != null) {
            if (this.K == null) {
                try {
                    if (articleViewer$WindowView.getParent() != null) {
                        ((WindowManager) this.L.getSystemService("window")).removeViewImmediate(this.f45888f0);
                    }
                    this.f45888f0 = null;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
            for (int i7 = 0; i7 < this.N.size(); i7++) {
                ((q1) this.N.get(i7)).a(true);
            }
            this.N.clear();
            try {
                this.L.getWindow().clearFlags(128);
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
            this.L = null;
            this.M = null;
            f45860d1 = null;
        }
    }

    public g4(org.telegram.ui.ActionBar.f2 f2Var) {
        this.N = new ArrayList();
        this.Y = 1;
        this.f45885c0 = new DecelerateInterpolator(1.5f);
        this.f45886d0 = new ArrayList();
        this.f45904w0 = new Paint();
        this.f45905x0 = new Paint();
        this.f45906y0 = new Paint();
        this.A0 = new Paint();
        this.K0 = false;
        this.L0 = null;
        this.M0 = null;
        this.S0 = new h2.f(new int[]{org.telegram.messenger.qs.f25070s, org.telegram.messenger.qs.f25076t});
        this.T0 = new k0[2];
        this.X0 = -1;
        a0 a0Var = new a0(this, 4);
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        this.f45882a1 = new org.telegram.ui.Components.z4(a0Var, 320L, xqVar);
        this.f45884b1 = new org.telegram.ui.Components.z4(new a0(this, 5), 320L, xqVar);
        this.J = true;
        this.K = new t3(this, f2Var);
        W(f2Var.getParentActivity(), f2Var);
    }
}
