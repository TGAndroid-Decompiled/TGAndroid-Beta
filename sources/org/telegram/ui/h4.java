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
public final class h4 extends l60 implements org.telegram.messenger.vs {
    public static Paint A1;
    public static Paint C1;
    public static TextPaint f37652h1;
    public static TextPaint f37653i1;
    public static TextPaint f37654j1;
    public static TextPaint f37655k1;
    public static TextPaint l1;
    public static TextPaint f37656m1;
    public static TextPaint f37657n1;
    public static TextPaint f37658o1;
    public static Paint f37659p1;
    public static Paint f37660q1;
    public static Paint f37661r1;
    public static Paint f37662s1;
    public static Paint f37663t1;
    public static Paint f37664u1;
    public static Paint f37665v1;
    public static Paint f37666w1;
    public static Paint f37667x1;
    public static Paint f37668y1;
    public static Paint f37669z1;
    public final Paint A0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout B0;
    public TextView C0;
    public Rect D0;
    public org.telegram.ui.Components.n81 E0;
    public org.telegram.ui.Components.n81 F0;
    public int G0;
    public int H0;
    public int I0;
    public final boolean J;
    public int J0;
    public final u3 K;
    public boolean K0;
    public Activity L;
    public y2 L0;
    public org.telegram.ui.ActionBar.k2 M;
    public y2 M0;
    public final ArrayList N;
    public gf.e N0;
    public View O;
    public int O0;
    public FrameLayout P;
    public org.telegram.ui.Cells.k9 P0;
    public TextureView Q;
    public org.telegram.ui.Cells.k9 Q0;
    public k4 R;
    public ps0 R0;
    public WebChromeClient.CustomViewCallback S;
    public final e2.f S0;
    public WindowInsets T;
    public final l0[] T0;
    public boolean U;
    public boolean U0;
    public boolean V;
    public z90 V0;
    public boolean W;
    public ag.o0 W0;
    public int X;
    public int X0;
    public int Y;
    public ValueAnimator Y0;
    public int Z;
    public float Z0;
    public Runnable f37670a0;
    public final org.telegram.ui.Components.w4 f37671a1;
    public long f37672b0;
    public final org.telegram.ui.Components.w4 f37673b1;
    public final DecelerateInterpolator f37674c0;
    public final ArrayList f37675d0;
    public WindowManager.LayoutParams f37676e0;
    public ArticleViewer$WindowView f37677f0;
    public l0 f37678g0;
    public m0 f37679h0;
    public org.telegram.ui.web.j f37680i0;
    public y f37681j0;
    public org.telegram.ui.ActionBar.z2 f37682k0;
    public Paint f37683l0;
    public Drawable m0;
    public Paint f37684n0;
    public boolean f37685o0;
    public float f37686p0;
    public org.telegram.ui.Cells.a5 f37687q0;
    public ImageView f37688r0;
    public ImageView f37689s0;
    public org.telegram.ui.Components.f6 f37690t0;
    public l3[] f37691u0;
    public AnimatorSet f37692v0;
    public final Paint f37693w0;
    public final Paint f37694x0;
    public final Paint f37695y0;
    public boolean f37696z0;
    public static final HashSet f37647c1 = new HashSet();
    public static volatile h4 f37648d1 = null;
    public static final s0 f37649e1 = new s0("innerTranslationX", 0);
    public static final TextPaint f37650f1 = new TextPaint(1);
    public static final p3 f37651g1 = new p3();
    public static final WeakHashMap B1 = new WeakHashMap();

    public h4() {
        this.N = new ArrayList();
        this.Y = 1;
        this.f37674c0 = new DecelerateInterpolator(1.5f);
        this.f37675d0 = new ArrayList();
        this.f37693w0 = new Paint();
        this.f37694x0 = new Paint();
        this.f37695y0 = new Paint();
        this.A0 = new Paint();
        this.K0 = false;
        this.L0 = null;
        this.M0 = null;
        this.S0 = new e2.f(new int[]{org.telegram.messenger.at.f14779s, org.telegram.messenger.at.f14786t});
        this.T0 = new l0[2];
        this.X0 = -1;
        y yVar = new y(this, 4);
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        this.f37671a1 = new org.telegram.ui.Components.w4(yVar, 320L, grVar);
        this.f37673b1 = new org.telegram.ui.Components.w4(new y(this, 5), 320L, grVar);
        this.J = false;
        this.K = null;
    }

    public static CharSequence A(l60 l60Var, TLRPC.WebPage webPage, View view, TL_iv.RichText richText, TL_iv.RichText richText2, TL_iv.PageBlock pageBlock, int i10) {
        org.telegram.ui.Components.vz0 vz0Var;
        org.telegram.ui.Components.vz0 vz0Var2;
        TextPaint textPaint = null;
        if (richText2 == null) {
            return null;
        }
        if (richText2 instanceof TL_iv.textFixed) {
            return A(l60Var, webPage, view, richText, ((TL_iv.textFixed) richText2).text, pageBlock, i10);
        }
        if (richText2 instanceof TL_iv.textItalic) {
            return A(l60Var, webPage, view, richText, ((TL_iv.textItalic) richText2).text, pageBlock, i10);
        }
        if (richText2 instanceof TL_iv.textBold) {
            return A(l60Var, webPage, view, richText, ((TL_iv.textBold) richText2).text, pageBlock, i10);
        }
        if (richText2 instanceof TL_iv.textUnderline) {
            return A(l60Var, webPage, view, richText, ((TL_iv.textUnderline) richText2).text, pageBlock, i10);
        }
        if (richText2 instanceof TL_iv.textStrike) {
            return A(l60Var, webPage, view, richText, ((TL_iv.textStrike) richText2).text, pageBlock, i10);
        }
        if (richText2 instanceof TL_iv.textEmail) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(A(l60Var, webPage, view, richText, ((TL_iv.textEmail) richText2).text, pageBlock, i10));
            MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), MetricAffectingSpan.class);
            if (spannableStringBuilder.length() != 0) {
                if (metricAffectingSpanArr == null || metricAffectingSpanArr.length == 0) {
                    textPaint = C(l60Var, richText, richText2, pageBlock);
                }
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.vz0(textPaint, "mailto:" + D(richText2)), 0, spannableStringBuilder.length(), 33);
            }
            return spannableStringBuilder;
        }
        long j10 = 0;
        if (richText2 instanceof TL_iv.textUrl) {
            TL_iv.textUrl texturl = (TL_iv.textUrl) richText2;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(A(l60Var, webPage, view, richText, texturl.text, pageBlock, i10));
            MetricAffectingSpan[] metricAffectingSpanArr2 = (MetricAffectingSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), MetricAffectingSpan.class);
            if (metricAffectingSpanArr2 == null || metricAffectingSpanArr2.length == 0) {
                textPaint = C(l60Var, richText, richText2, pageBlock);
            }
            if (texturl.webpage_id != 0) {
                vz0Var2 = new org.telegram.ui.Components.vz0(textPaint, D(richText2));
            } else {
                vz0Var2 = new org.telegram.ui.Components.vz0(textPaint, D(richText2));
            }
            if (spannableStringBuilder2.length() != 0) {
                spannableStringBuilder2.setSpan(vz0Var2, 0, spannableStringBuilder2.length(), 33);
            }
            return spannableStringBuilder2;
        } else if (richText2 instanceof TL_iv.textPlain) {
            return ((TL_iv.textPlain) richText2).text;
        } else {
            if (richText2 instanceof TL_iv.textAnchor) {
                TL_iv.textAnchor textanchor = (TL_iv.textAnchor) richText2;
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(A(l60Var, webPage, view, richText, textanchor.text, pageBlock, i10));
                String str = textanchor.name;
                ?? metricAffectingSpan = new MetricAffectingSpan();
                metricAffectingSpan.f30523a = str.toLowerCase();
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
                        TL_iv.RichText y3 = y(richText3);
                        boolean z10 = i10 >= 0 && (richText3 instanceof TL_iv.textUrl) && ((TL_iv.textUrl) richText3).webpage_id != j10;
                        if (z10 && spannableStringBuilder4.length() != 0 && spannableStringBuilder4.charAt(spannableStringBuilder4.length() - 1) != '\n') {
                            spannableStringBuilder4.append((CharSequence) " ");
                            spannableStringBuilder4.setSpan(new Object(), spannableStringBuilder4.length() - 1, spannableStringBuilder4.length(), 33);
                        }
                        CharSequence A = A(l60Var, webPage, view, richText, richText3, pageBlock, i10);
                        int B = B(y3);
                        int length = spannableStringBuilder4.length();
                        spannableStringBuilder4.append(A);
                        if (B != 0 && !(A instanceof SpannableStringBuilder)) {
                            if ((B & 8) == 0 && (B & 512) == 0) {
                                if (length != spannableStringBuilder4.length()) {
                                    TextPaint C = C(l60Var, richText, y3, pageBlock);
                                    ?? metricAffectingSpan2 = new MetricAffectingSpan();
                                    metricAffectingSpan2.f31127a = C;
                                    spannableStringBuilder4.setSpan(metricAffectingSpan2, length, spannableStringBuilder4.length(), 33);
                                }
                            } else {
                                String D = D(richText3);
                                if (D == null) {
                                    D = D(richText);
                                }
                                if ((B & 512) != 0) {
                                    vz0Var = new org.telegram.ui.Components.vz0(C(l60Var, richText, y3, pageBlock), D);
                                } else {
                                    vz0Var = new org.telegram.ui.Components.vz0(C(l60Var, richText, y3, pageBlock), D);
                                }
                                if (length != spannableStringBuilder4.length()) {
                                    spannableStringBuilder4.setSpan(vz0Var, length, spannableStringBuilder4.length(), 33);
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
                    return A(l60Var, webPage, view, richText, ((TL_iv.textSubscript) richText2).text, pageBlock, i10);
                } else {
                    if (richText2 instanceof TL_iv.textSuperscript) {
                        return A(l60Var, webPage, view, richText, ((TL_iv.textSuperscript) richText2).text, pageBlock, i10);
                    }
                    if (richText2 instanceof TL_iv.textMarked) {
                        SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(A(l60Var, webPage, view, richText, ((TL_iv.textMarked) richText2).text, pageBlock, i10));
                        MetricAffectingSpan[] metricAffectingSpanArr3 = (MetricAffectingSpan[]) spannableStringBuilder5.getSpans(0, spannableStringBuilder5.length(), MetricAffectingSpan.class);
                        if (spannableStringBuilder5.length() != 0) {
                            if (metricAffectingSpanArr3 == null || metricAffectingSpanArr3.length == 0) {
                                textPaint = C(l60Var, richText, richText2, pageBlock);
                            }
                            ?? metricAffectingSpan3 = new MetricAffectingSpan();
                            metricAffectingSpan3.f30782a = textPaint;
                            spannableStringBuilder5.setSpan(metricAffectingSpan3, 0, spannableStringBuilder5.length(), 33);
                        }
                        return spannableStringBuilder5;
                    } else if (richText2 instanceof TL_iv.textSpoiler) {
                        SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder(A(l60Var, webPage, view, richText, ((TL_iv.textSpoiler) richText2).text, pageBlock, i10));
                        if (spannableStringBuilder6.length() != 0) {
                            ?? obj = new Object();
                            obj.f33282a |= 256;
                            spannableStringBuilder6.setSpan(new org.telegram.ui.Components.a01(obj, 0), 0, spannableStringBuilder6.length(), 33);
                        }
                        return spannableStringBuilder6;
                    } else if (richText2 instanceof TL_iv.textPhone) {
                        SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder(A(l60Var, webPage, view, richText, ((TL_iv.textPhone) richText2).text, pageBlock, i10));
                        MetricAffectingSpan[] metricAffectingSpanArr4 = (MetricAffectingSpan[]) spannableStringBuilder7.getSpans(0, spannableStringBuilder7.length(), MetricAffectingSpan.class);
                        if (spannableStringBuilder7.length() != 0) {
                            if (metricAffectingSpanArr4 == null || metricAffectingSpanArr4.length == 0) {
                                textPaint = C(l60Var, richText, richText2, pageBlock);
                            }
                            spannableStringBuilder7.setSpan(new org.telegram.ui.Components.vz0(textPaint, "tel:" + D(richText2)), 0, spannableStringBuilder7.length(), 33);
                        }
                        return spannableStringBuilder7;
                    } else {
                        if (richText2 instanceof TL_iv.textImage) {
                            TL_iv.textImage textimage = (TL_iv.textImage) richText2;
                            TLRPC.Document a2 = e4.a(webPage, textimage.document_id);
                            TLRPC.Photo e = e4.e(webPage, textimage.photo_id);
                            if (a2 != null) {
                                SpannableStringBuilder spannableStringBuilder8 = new SpannableStringBuilder("*");
                                int L = org.telegram.messenger.i0.L(textimage.f20019w);
                                int L2 = org.telegram.messenger.i0.L(textimage.h);
                                int abs = Math.abs(i10);
                                if (L > abs) {
                                    L2 = (int) (L2 * (abs / L));
                                    L = abs;
                                }
                                if (view != null) {
                                    int i12 = org.telegram.ui.ActionBar.t6.f20930d6;
                                    ((h4) l60Var).getClass();
                                    boolean z11 = org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.x0(null, i12, false)) <= 0.705f;
                                    ?? replacementSpan = new ReplacementSpan();
                                    Locale locale = Locale.US;
                                    String str2 = L + "_" + L2 + "_i";
                                    replacementSpan.f30473b = L;
                                    replacementSpan.f30474c = L2;
                                    boolean z12 = z11;
                                    ImageReceiver imageReceiver = new ImageReceiver(view);
                                    replacementSpan.f30472a = imageReceiver;
                                    imageReceiver.J0 = true;
                                    if (z12) {
                                        imageReceiver.f14383g1 = new org.telegram.ui.Components.au(29);
                                    }
                                    imageReceiver.r0(org.telegram.messenger.jc.b(a2), str2, org.telegram.messenger.jc.c(org.telegram.messenger.b8.w(a2.thumbs, 90, false, null, false), a2), str2, null, -1L, null, webPage, 1);
                                    spannableStringBuilder8.setSpan(replacementSpan, 0, spannableStringBuilder8.length(), 33);
                                }
                                return spannableStringBuilder8;
                            } else if (e instanceof org.telegram.ui.web.x1) {
                                org.telegram.ui.web.x1 x1Var = (org.telegram.ui.web.x1) e;
                                SpannableStringBuilder spannableStringBuilder9 = new SpannableStringBuilder("*");
                                int L3 = org.telegram.messenger.i0.L(textimage.f20019w);
                                int L4 = org.telegram.messenger.i0.L(textimage.h);
                                int abs2 = Math.abs(i10);
                                if (L3 > abs2) {
                                    L4 = (int) (L4 * (abs2 / L3));
                                    L3 = abs2;
                                }
                                if (view != null) {
                                    ?? replacementSpan2 = new ReplacementSpan();
                                    replacementSpan2.f30473b = L3;
                                    replacementSpan2.f30474c = L4;
                                    ImageReceiver imageReceiver2 = new ImageReceiver(view);
                                    replacementSpan2.f30472a = imageReceiver2;
                                    imageReceiver2.J0 = true;
                                    org.telegram.ui.web.y1.g(x1Var, imageReceiver2, new org.telegram.messenger.sz(25));
                                    spannableStringBuilder9.setSpan(replacementSpan2, 0, spannableStringBuilder9.length(), 33);
                                }
                                return spannableStringBuilder9;
                            }
                        } else if (richText2 instanceof TL_iv.textMath) {
                            TL_iv.textMath textmath = (TL_iv.textMath) richText2;
                            if (textmath.bitmap == null && !textmath.tried) {
                                textmath.tried = true;
                                bi.u a10 = bi.u.a(textmath.source, org.telegram.messenger.i0.L(20.0f), true);
                                if (a10 != null) {
                                    textmath.f20020w = a10.f3370b;
                                    textmath.h = a10.f3371c;
                                    textmath.depth = a10.d;
                                    textmath.bitmap = a10.f3369a;
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
                                int i13 = textmath.f20020w;
                                int i14 = textmath.h;
                                int i15 = org.telegram.ui.ActionBar.t6.G6;
                                ((h4) l60Var).getClass();
                                spannableStringBuilder10.setSpan(new org.telegram.ui.Components.sz0(view, bitmap, i13, i14, org.telegram.ui.ActionBar.t6.x0(null, i15, false), textmath.depth), 0, spannableStringBuilder10.length(), 33);
                                String str4 = textmath.source;
                                if (str4 != null && !str4.isEmpty()) {
                                    spannableStringBuilder10.setSpan(new org.telegram.ui.Cells.p9(textmath.source), 0, spannableStringBuilder10.length(), 33);
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

    public static android.text.TextPaint C(org.telegram.ui.l60 r21, org.telegram.tgnet.tl.TL_iv.RichText r22, org.telegram.tgnet.tl.TL_iv.RichText r23, org.telegram.tgnet.tl.TL_iv.PageBlock r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.h4.C(org.telegram.ui.l60, org.telegram.tgnet.tl.TL_iv$RichText, org.telegram.tgnet.tl.TL_iv$RichText, org.telegram.tgnet.tl.TL_iv$PageBlock):android.text.TextPaint");
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
        if (f37648d1 != null) {
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
        TL_iv.PageBlock x10 = x(v3Var.f42398a);
        if (x10 instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) x10;
            if (!pageblockdetails.open) {
                pageblockdetails.open = true;
                return true;
            }
        } else if (x10 instanceof v3) {
            v3 v3Var2 = (v3) x10;
            TL_iv.PageBlock x11 = x(v3Var2.f42399b);
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

    public static void R(l60 l60Var) {
        if (l60Var.f39096b != null || l60Var.f39098f != null) {
            View view = l60Var.f39098f;
            l60Var.f39097c.f(true);
            l60Var.f39096b = null;
            l60Var.d = null;
            l60Var.f39098f = null;
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

    public static void d(String str, int i10, FrameLayout frameLayout, u3 u3Var, org.telegram.ui.ActionBar.p6 p6Var) {
        String u10 = org.telegram.ui.web.z0.u(str);
        long e = org.telegram.messenger.e20.i(i10).e();
        org.telegram.messenger.rz.C(i10).r0(org.telegram.messenger.pz.a(e, u10));
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
        tL_message.peer_id = tL_peerUser;
        tL_peerUser.user_id = e;
        TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
        tL_message.from_id = tL_peerUser2;
        tL_peerUser2.user_id = e;
        tL_message.message = u10;
        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
        tL_message.media = tL_messageMediaWebPage;
        tL_messageMediaWebPage.webpage = new TLRPC.TL_webPage();
        TLRPC.WebPage webPage = tL_message.media.webpage;
        webPage.url = u10;
        webPage.display_url = u10;
        org.telegram.messenger.at.f(i10).k(org.telegram.messenger.at.H1, new org.telegram.messenger.kj(i10, tL_message, false, false));
        new org.telegram.ui.Components.cc(frameLayout, p6Var).Q(2131624188, 36, org.telegram.messenger.i0.T2(org.telegram.messenger.dd.L0(2131742966, null), new bi.e(u3Var, e, 8))).k(true);
    }

    public static void e0(l60 l60Var) {
        TextPaint textPaint = f37657n1;
        if (textPaint != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false));
        }
        TextPaint textPaint2 = f37658o1;
        if (textPaint2 != null) {
            textPaint2.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false));
        }
        TextPaint textPaint3 = f37652h1;
        if (textPaint3 != null) {
            textPaint3.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false));
        }
        TextPaint textPaint4 = f37654j1;
        if (textPaint4 != null) {
            textPaint4.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false));
        }
        TextPaint textPaint5 = f37655k1;
        if (textPaint5 != null) {
            textPaint5.setColor(-1);
        }
        TextPaint textPaint6 = l1;
        if (textPaint6 != null) {
            textPaint6.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false));
        }
        TextPaint textPaint7 = f37656m1;
        if (textPaint7 != null) {
            textPaint7.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21312y6, false));
        }
        TextPaint textPaint8 = f37653i1;
        if (textPaint8 != null) {
            textPaint8.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21312y6, false));
        }
        p(l60Var, true);
        p3 p3Var = f37651g1;
        p3.a(l60Var, p3Var.d);
        p3.a(l60Var, p3Var.e);
        p3.a(l60Var, p3Var.f40335g);
        p3.a(l60Var, p3Var.f40334f);
        p3.a(l60Var, p3Var.h);
        p3.a(l60Var, p3Var.f40336i);
        p3.a(l60Var, p3Var.f40337j);
        p3.a(l60Var, p3Var.f40338k);
        p3.a(l60Var, p3Var.f40339l);
        p3.a(l60Var, p3Var.f40340m);
        p3.a(l60Var, p3Var.f40341n);
        p3.a(l60Var, p3Var.f40347t);
        p3.a(l60Var, p3Var.f40346s);
        p3.a(l60Var, p3Var.f40344q);
        p3.a(l60Var, p3Var.f40345r);
        p3.a(l60Var, p3Var.f40348u);
        p3.a(l60Var, p3Var.f40349w);
        p3.a(l60Var, p3Var.f40350x);
        p3.a(l60Var, p3Var.f40332b);
        p3.a(l60Var, p3Var.f40333c);
        p3.a(l60Var, p3Var.f40342o);
        p3.a(l60Var, p3Var.f40343p);
        p3.a(l60Var, p3Var.v);
        p3.a(l60Var, p3Var.f40351y);
        p3.a(l60Var, p3Var.f40352z);
        p3.a(l60Var, p3Var.A);
    }

    public static SpannableStringBuilder g(int i10, CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (charSequence != null) {
            spannableStringBuilder.append(charSequence);
        }
        if (spannableStringBuilder.length() > 0) {
            spannableStringBuilder.append((CharSequence) ", ");
        }
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.dd.L0(i10, null));
        return spannableStringBuilder;
    }

    public static CharSequence h(l60 l60Var, f4 f4Var, z2 z2Var) {
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
            org.telegram.ui.Components.vz0[] vz0VarArr = (org.telegram.ui.Components.vz0[]) spannable.getSpans(0, spannable.length(), org.telegram.ui.Components.vz0.class);
            SpannableStringBuilder spannableStringBuilder2 = text;
            if (vz0VarArr != null) {
                spannableStringBuilder2 = text;
                if (vz0VarArr.length != 0) {
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannable);
                    for (org.telegram.ui.Components.vz0 vz0Var : vz0VarArr) {
                        int spanStart = spannableStringBuilder3.getSpanStart(vz0Var);
                        int spanEnd = spannableStringBuilder3.getSpanEnd(vz0Var);
                        if (spanStart >= 0 && spanEnd > spanStart) {
                            spannableStringBuilder3.setSpan(new org.telegram.messenger.w(l60Var, f4Var, vz0Var, 1), spanStart, spanEnd, 33);
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

    public static TL_iv.PageBlock h0(TL_iv.PageBlock pageBlock, v3 v3Var) {
        if (pageBlock instanceof x3) {
            x3 x3Var = (x3) pageBlock;
            x3 x3Var2 = new x3();
            x3Var2.f43213a = x3Var.f43213a;
            x3Var2.f43214b = x3Var.f43214b;
            x3Var2.f43215c = x3Var.f43215c;
            x3Var2.d = h0(x3Var.d, v3Var);
            return x3Var2;
        } else if (pageBlock instanceof z3) {
            z3 z3Var = (z3) pageBlock;
            z3 z3Var2 = new z3();
            z3Var2.f43800a = z3Var.f43800a;
            z3Var2.f43801b = z3Var.f43801b;
            z3Var2.f43802c = z3Var.f43802c;
            z3Var2.d = h0(z3Var.d, v3Var);
            return z3Var2;
        } else {
            return v3Var;
        }
    }

    public static boolean j(org.telegram.ui.l60 r25, org.telegram.ui.f4 r26, android.view.MotionEvent r27, android.view.View r28, org.telegram.ui.z2 r29, int r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.h4.j(org.telegram.ui.l60, org.telegram.ui.f4, android.view.MotionEvent, android.view.View, org.telegram.ui.z2, int, int):boolean");
    }

    public static org.telegram.ui.z2 n(org.telegram.ui.l60 r19, android.view.View r20, java.lang.CharSequence r21, org.telegram.tgnet.tl.TL_iv.RichText r22, int r23, int r24, org.telegram.tgnet.tl.TL_iv.PageBlock r25, android.text.Layout.Alignment r26, int r27, org.telegram.ui.f4 r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.h4.n(org.telegram.ui.l60, android.view.View, java.lang.CharSequence, org.telegram.tgnet.tl.TL_iv$RichText, int, int, org.telegram.tgnet.tl.TL_iv$PageBlock, android.text.Layout$Alignment, int, org.telegram.ui.f4):org.telegram.ui.z2");
    }

    public static z2 o(l60 l60Var, View view, CharSequence charSequence, TL_iv.RichText richText, int i10, int i11, TL_iv.PageBlock pageBlock, f4 f4Var) {
        return n(l60Var, view, charSequence, richText, i10, i11, pageBlock, Layout.Alignment.ALIGN_NORMAL, 0, f4Var);
    }

    public static void p(l60 l60Var, boolean z10) {
        int i10;
        if (f37661r1 == null) {
            f37661r1 = new Paint();
            f37660q1 = new Paint();
            Paint paint = new Paint(1);
            f37663t1 = paint;
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            f37663t1.setStrokeWidth(org.telegram.messenger.i0.L(1.0f));
            Paint paint2 = new Paint();
            f37664u1 = paint2;
            paint2.setStyle(style);
            f37664u1.setStrokeWidth(org.telegram.messenger.i0.L(1.0f) / 2.0f);
            f37665v1 = new Paint();
            f37666w1 = new Paint();
            f37667x1 = new Paint();
            f37668y1 = new Paint(1);
            f37669z1 = new Paint(1);
            f37659p1 = new Paint();
            f37662s1 = new Paint();
            A1 = new Paint(1);
        } else if (!z10) {
            return;
        }
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20930d6, false);
        float green = Color.green(x02) * 0.7152f;
        float x10 = c3.i0.x(Color.blue(x02), 0.0722f, green + (Color.red(x02) * 0.2126f), 255.0f);
        Paint paint3 = f37669z1;
        if (x10 <= 0.705f) {
            i10 = -3041234;
        } else {
            i10 = -6551;
        }
        paint3.setColor(i10);
        Paint paint4 = f37668y1;
        int i11 = org.telegram.ui.ActionBar.t6.K6;
        paint4.setColor(org.telegram.ui.ActionBar.t6.x0(null, i11, false) & 872415231);
        f37668y1.setPathEffect(org.telegram.ui.Components.k80.c());
        f37667x1.setColor(org.telegram.ui.ActionBar.t6.x0(null, i11, false) & 872415231);
        f37667x1.setPathEffect(org.telegram.ui.Components.k80.c());
        Paint paint5 = f37664u1;
        int i12 = org.telegram.ui.ActionBar.t6.f21059k6;
        paint5.setColor(org.telegram.ui.ActionBar.t6.x0(null, i12, false));
        f37663t1.setColor(org.telegram.ui.ActionBar.t6.x0(null, i12, false));
        f37659p1.setColor(251658240);
        f37662s1.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20931d7, false));
        A1.setColor(org.telegram.ui.ActionBar.t6.x0(null, i11, false) & 872415231);
        A1.setPathEffect(org.telegram.ui.Components.k80.c());
        int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.M6, false);
        int red = Color.red(x03);
        int green2 = Color.green(x03);
        int blue = Color.blue(x03);
        f37666w1.setColor(Color.argb(20, red, green2, blue));
        f37665v1.setColor(Color.argb(34, red, green2, blue));
        int x04 = org.telegram.ui.ActionBar.t6.x0(null, i11, false);
        f37660q1.setColor(Color.argb(20, Color.red(x04), Color.green(x04), Color.blue(x04)));
        f37661r1.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Id, false));
    }

    public static void s(Canvas canvas, l60 l60Var, TL_iv.PageBlock pageBlock, int i10) {
        int i11;
        int L;
        int L2;
        if (pageBlock != null && l60Var != null && f37661r1 != null) {
            int i12 = 0;
            if (pageBlock.bottom) {
                i11 = org.telegram.messenger.i0.L(6.0f);
            } else {
                i11 = 0;
            }
            int i13 = i10 - i11;
            int i14 = pageBlock.quoteLevels;
            if (i14 == 0) {
                if (pageBlock.level > 0) {
                    canvas.drawRect(org.telegram.messenger.i0.L(18), 0.0f, org.telegram.messenger.i0.L(2.0f) + L2, i13, f37661r1);
                    return;
                }
                return;
            }
            while (i14 != 0) {
                if ((i14 & 1) != 0) {
                    canvas.drawRect(org.telegram.messenger.i0.L((i12 * 14) + 18), 0.0f, org.telegram.messenger.i0.L(2.0f) + L, i13, f37661r1);
                }
                i14 >>>= 1;
                i12++;
            }
        }
    }

    public static void t(org.telegram.ui.l60 r2, android.graphics.Canvas r3, org.telegram.ui.Cells.j9 r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.h4.t(org.telegram.ui.l60, android.graphics.Canvas, org.telegram.ui.Cells.j9, int):void");
    }

    public static TL_iv.RichText u(int i10, TL_iv.PageBlock pageBlock) {
        if (i10 == 2) {
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
                    return u(i10, ((TL_iv.pageBlockCover) pageBlock).cover);
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

    public static h4 v() {
        h4 h4Var;
        h4 h4Var2 = f37648d1;
        if (h4Var2 == null) {
            synchronized (h4.class) {
                try {
                    h4Var = f37648d1;
                    if (h4Var == null) {
                        h4Var = new h4();
                        f37648d1 = h4Var;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return h4Var;
        }
        return h4Var2;
    }

    public static View w(View view) {
        org.telegram.ui.Components.dk0 dk0Var;
        if (view instanceof w1) {
            org.telegram.ui.Components.dk0 dk0Var2 = ((w1) view).d;
            if (dk0Var2 != null) {
                return w(dk0Var2.f47909a);
            }
            return view;
        } else if ((view instanceof z1) && (dk0Var = ((z1) view).d) != null) {
            return w(dk0Var.f47909a);
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
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append(z(richText.texts.get(i10)));
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
        ArrayList arrayList = this.f37675d0;
        int size = arrayList.size();
        u3 u3Var = this.K;
        boolean z11 = false;
        if (size <= 1) {
            ArticleViewer$WindowView articleViewer$WindowView = this.f37677f0;
            articleViewer$WindowView.e = false;
            articleViewer$WindowView.d = false;
            l0 l0Var = this.f37678g0;
            if (u3Var != null) {
                x10 = u3Var.I * u3Var.f41775c.getWidth();
            } else {
                x10 = l0Var.getX();
            }
            AnimatorSet animatorSet = new AnimatorSet();
            float measuredWidth = l0Var.getMeasuredWidth() - x10;
            if (u3Var != null) {
                animatorSet.playTogether(u3Var.l(1.0f));
            } else {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.f37678g0, View.TRANSLATION_X, l0Var.getMeasuredWidth()), ObjectAnimator.ofFloat(this.f37677f0, f37649e1, l0Var.getMeasuredWidth()));
            }
            animatorSet.setDuration(Math.max((int) ((420.0f / l0Var.getMeasuredWidth()) * measuredWidth), 250));
            animatorSet.setInterpolator(org.telegram.ui.Components.gr.h);
            animatorSet.addListener(new u0(this));
            animatorSet.start();
            this.U0 = true;
            return;
        }
        ArticleViewer$WindowView articleViewer$WindowView2 = this.f37677f0;
        articleViewer$WindowView2.f21634f = true;
        articleViewer$WindowView2.e = true;
        articleViewer$WindowView2.h = this.J0;
        this.f37691u0[1].setVisibility(0);
        this.f37691u0[1].setAlpha(1.0f);
        this.f37691u0[1].setTranslationX(0.0f);
        l3 l3Var = this.f37691u0[0];
        if (u3Var == null) {
            color = 0;
        } else {
            color = this.f37683l0.getColor();
        }
        l3Var.setBackgroundColor(color);
        c0(-1, arrayList.get(arrayList.size() - 2), true);
        l3 l3Var2 = this.f37691u0[0];
        l3Var2.getX();
        AnimatorSet animatorSet2 = new AnimatorSet();
        l3Var2.getMeasuredWidth();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f37691u0[0], View.TRANSLATION_X, l3Var2.getMeasuredWidth()));
        animatorSet2.setDuration(420L);
        animatorSet2.setInterpolator(org.telegram.ui.Components.gr.h);
        animatorSet2.addListener(new v0(this));
        animatorSet2.start();
        m0 m0Var = this.f37679h0;
        l3 l3Var3 = this.f37691u0[0];
        if (l3Var3 != null && org.telegram.messenger.uz.f18558v0) {
            x02 = l3Var3.getBackgroundColor();
        } else {
            x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Dl, false);
        }
        m0Var.setMenuColors(x02);
        m0 m0Var2 = this.f37679h0;
        l3 l3Var4 = this.f37691u0[0];
        if (l3Var4 != null && org.telegram.messenger.uz.f18558v0) {
            x03 = l3Var4.getActionBarColor();
        } else {
            x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Dl, false);
        }
        m0Var2.d(x03, true);
        m0 m0Var3 = this.f37679h0;
        l3 l3Var5 = this.f37691u0[0];
        if (l3Var5 != null && l3Var5.e()) {
            z10 = true;
        } else {
            z10 = false;
        }
        m0Var3.setIsTonsite(z10);
        m0 m0Var4 = this.f37679h0;
        l3 l3Var6 = this.f37691u0[0];
        if (l3Var6 != null && l3Var6.d()) {
            z11 = true;
        }
        m0Var4.setIsLocal(z11);
        this.U0 = true;
    }

    public final void F(int i10) {
        int color;
        int x02;
        int x03;
        boolean z10;
        float x10;
        ArrayList arrayList = this.f37675d0;
        int size = arrayList.size();
        u3 u3Var = this.K;
        boolean z11 = false;
        if (size <= 1) {
            ArticleViewer$WindowView articleViewer$WindowView = this.f37677f0;
            articleViewer$WindowView.e = false;
            articleViewer$WindowView.d = false;
            l0 l0Var = this.f37678g0;
            if (u3Var != null) {
                x10 = u3Var.I * u3Var.f41775c.getWidth();
            } else {
                x10 = l0Var.getX();
            }
            AnimatorSet animatorSet = new AnimatorSet();
            float measuredWidth = l0Var.getMeasuredWidth() - x10;
            if (u3Var != null) {
                animatorSet.playTogether(u3Var.l(1.0f));
            } else {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.f37678g0, View.TRANSLATION_X, l0Var.getMeasuredWidth()), ObjectAnimator.ofFloat(this.f37677f0, f37649e1, l0Var.getMeasuredWidth()));
            }
            animatorSet.setDuration(Math.max((int) ((420.0f / l0Var.getMeasuredWidth()) * measuredWidth), 250));
            animatorSet.setInterpolator(org.telegram.ui.Components.gr.h);
            animatorSet.addListener(new w0(this));
            animatorSet.start();
            this.U0 = true;
            return;
        }
        this.f37677f0.f21634f = true;
        this.f37691u0[1].setVisibility(0);
        this.f37691u0[1].setAlpha(1.0f);
        this.f37691u0[1].setTranslationX(0.0f);
        l3 l3Var = this.f37691u0[0];
        if (u3Var == null) {
            color = 0;
        } else {
            color = this.f37683l0.getColor();
        }
        l3Var.setBackgroundColor(color);
        c0(-1, arrayList.get(i10), true);
        l3 l3Var2 = this.f37691u0[0];
        l3Var2.getX();
        AnimatorSet animatorSet2 = new AnimatorSet();
        l3Var2.getMeasuredWidth();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f37691u0[0], View.TRANSLATION_X, l3Var2.getMeasuredWidth()));
        animatorSet2.setDuration(420L);
        animatorSet2.setInterpolator(org.telegram.ui.Components.gr.h);
        animatorSet2.addListener(new x0(this, i10));
        animatorSet2.start();
        m0 m0Var = this.f37679h0;
        l3 l3Var3 = this.f37691u0[0];
        if (l3Var3 != null && org.telegram.messenger.uz.f18558v0) {
            x02 = l3Var3.getBackgroundColor();
        } else {
            x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Dl, false);
        }
        m0Var.setMenuColors(x02);
        m0 m0Var2 = this.f37679h0;
        l3 l3Var4 = this.f37691u0[0];
        if (l3Var4 != null && org.telegram.messenger.uz.f18558v0) {
            x03 = l3Var4.getActionBarColor();
        } else {
            x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Dl, false);
        }
        m0Var2.d(x03, true);
        m0 m0Var3 = this.f37679h0;
        l3 l3Var5 = this.f37691u0[0];
        if (l3Var5 != null && l3Var5.e()) {
            z10 = true;
        } else {
            z10 = false;
        }
        m0Var3.setIsTonsite(z10);
        m0 m0Var4 = this.f37679h0;
        l3 l3Var6 = this.f37691u0[0];
        if (l3Var6 != null && l3Var6.d()) {
            z11 = true;
        }
        m0Var4.setIsLocal(z11);
        this.U0 = true;
    }

    public final boolean H() {
        ArrayList arrayList = this.f37675d0;
        if (arrayList.size() <= 0 || !(arrayList.get(0) instanceof TLRPC.WebPage)) {
            return false;
        }
        return true;
    }

    public final void K() {
        this.V = false;
        int i10 = 0;
        while (true) {
            l3[] l3VarArr = this.f37691u0;
            if (i10 < l3VarArr.length) {
                l3VarArr[i10].b();
                i10++;
            } else {
                try {
                    break;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
            }
        }
        this.L.getWindow().clearFlags(128);
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.N;
            if (i11 < arrayList.size()) {
                ((r1) arrayList.get(i11)).a(false);
                i11++;
            } else {
                this.f37678g0.post(new y(this, 0));
                org.telegram.messenger.at.f(this.X).k(org.telegram.messenger.at.f14693d1, new Object[0]);
                return;
            }
        }
    }

    public final boolean L(org.telegram.messenger.kj kjVar, TLRPC.WebPage webPage, String str, String str2) {
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
        u3 u3Var = this.K;
        if (u3Var == null && this.V) {
            return false;
        }
        org.telegram.ui.ActionBar.k2 k2Var = this.M;
        if (k2Var != null && (k2Var.getParentLayout() instanceof ActionBarLayout)) {
            org.telegram.messenger.i0.v1((ActionBarLayout) this.M.getParentLayout());
        }
        if (kjVar != null) {
            if (webPage == null) {
                webPage2 = kjVar.f16690k.media.webpage;
            } else {
                webPage2 = webPage;
            }
            if (webPage2 != null && (page = webPage2.cached_page) != null && page.local != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            for (int i11 = 0; i11 < kjVar.f16690k.entities.size(); i11++) {
                TLRPC.MessageEntity messageEntity = kjVar.f16690k.entities.get(i11);
                if (messageEntity instanceof TLRPC.TL_messageEntityUrl) {
                    try {
                        String str4 = kjVar.f16690k.message;
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
                        org.telegram.messenger.f8.g(e, true);
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
        ArrayList arrayList = this.f37675d0;
        if (u3Var != null && !arrayList.isEmpty()) {
            z11 = z10;
            r52 = 1;
        } else {
            z11 = z10;
            r52 = 0;
        }
        if (r52 == 0) {
            arrayList.clear();
            this.f37678g0.setTranslationX(0.0f);
            if (u3Var != null) {
                u3Var.I = 0.0f;
                u3Var.f41775c.invalidate();
                u3Var.u();
                u3Var.r();
            }
            this.f37678g0.setTranslationY(0.0f);
            this.f37691u0[0].setTranslationY(0.0f);
            this.f37691u0[0].setTranslationX(0.0f);
            this.f37691u0[1].setTranslationX(0.0f);
            this.f37691u0[0].setAlpha(1.0f);
            this.f37677f0.setInnerTranslationX(0.0f);
            this.f37691u0[0].g();
            V(org.telegram.messenger.i0.L(56.0f));
        }
        if (u3Var != null && org.telegram.ui.web.z0.Q0) {
            u3Var.f41773a.d();
        }
        if (webPage2 != null) {
            boolean f7 = f(webPage2, substring, r52);
            if (!z11) {
                if (!f7 && substring != null) {
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
                if (kjVar != null) {
                    i10 = kjVar.I1;
                } else {
                    i10 = org.telegram.messenger.e20.f15506s0;
                }
                int i13 = i10;
                ConnectionsManager.getInstance(i13).sendRequest(tL_messages_getWebPage, new gf.a(this, i13, webPage2, kjVar, (boolean) r52, str3));
            }
        } else {
            e(r52, str2);
        }
        m0 m0Var = this.f37679h0;
        if (m0Var != null && r52 == 0) {
            m0Var.setIsLocal(this.f37691u0[0].d());
        }
        this.T = null;
        if (u3Var != null) {
            if (r52 == 0) {
                org.telegram.messenger.i0.E2(this.f37677f0);
                u3Var.d = this.f37677f0;
                u3Var.A();
                u3Var.f41775c.addView(this.f37677f0, w7.b6.c(-1.0f, -1));
            }
        } else if (!this.V) {
            WindowManager windowManager = (WindowManager) this.L.getSystemService("window");
            if (this.W) {
                try {
                    windowManager.removeView(this.f37677f0);
                } catch (Exception unused) {
                }
            }
            try {
                WindowManager.LayoutParams layoutParams = this.f37676e0;
                layoutParams.flags = -2013200384;
                if (Build.VERSION.SDK_INT >= 28) {
                    layoutParams.layoutInDisplayCutoutMode = 1;
                }
                this.f37677f0.setFocusable(false);
                this.f37678g0.setFocusable(false);
                windowManager.addView(this.f37677f0, this.f37676e0);
            } catch (Exception e7) {
                org.telegram.messenger.f8.g(e7, true);
                return false;
            }
        } else {
            this.f37676e0.flags &= -17;
            ((WindowManager) this.L.getSystemService("window")).updateViewLayout(this.f37677f0, this.f37676e0);
        }
        this.V = true;
        this.Z = 1;
        if (r52 == 0) {
            if (u3Var != null) {
                if (r52 != 0) {
                    u3Var.f41773a.e();
                } else if (!u3Var.h) {
                    u3Var.q(u3Var.f41774b);
                    u3Var.o();
                }
            } else {
                this.f37677f0.setAlpha(0.0f);
                this.f37678g0.setAlpha(0.0f);
                AnimatorSet animatorSet = new AnimatorSet();
                ArticleViewer$WindowView articleViewer$WindowView = this.f37677f0;
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(articleViewer$WindowView, property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f37678g0, property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f37677f0, View.TRANSLATION_X, org.telegram.messenger.i0.L(56.0f), 0.0f));
                this.f37670a0 = new y(this, 1);
                animatorSet.setDuration(150L);
                animatorSet.setInterpolator(this.f37674c0);
                animatorSet.addListener(new r0(this));
                this.f37672b0 = System.currentTimeMillis();
                org.telegram.messenger.i0.g3(new h0(1, this, animatorSet));
            }
        }
        this.f37678g0.setLayerType(2, null);
        return true;
    }

    public final void N(long j10, TLRPC.User user) {
        if (user != null && (this.L instanceof LaunchActivity)) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f19943id);
            bundle.putString("botUser", "webpage" + j10);
            ((LaunchActivity) this.L).u0(new un(bundle), false, true);
            m(false, true);
        }
    }

    public final void O(String str, String str2, k0 k0Var) {
        Activity activity = this.L;
        if (activity != null && !activity.isFinishing()) {
            l3 l3Var = this.f37691u0[0];
            if (l3Var != null && l3Var.d()) {
                String L0 = org.telegram.messenger.dd.L0(2131747798, null);
                int indexOf = L0.indexOf("%");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(String.format(L0, str));
                if (indexOf >= 0) {
                    spannableStringBuilder.setSpan(new URLSpan(str), indexOf, str.length() + indexOf, 33);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.L, null);
                String L02 = org.telegram.messenger.dd.L0(2131747795, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                x1Var.R = L02;
                x1Var.T = spannableStringBuilder;
                x1Var.f21487h0 = false;
                alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131747833, null), new a1.d(this, str, str2, k0Var, 2));
                alertDialog$Builder.p();
                return;
            }
            P(str, str2, k0Var);
        }
    }

    public final void P(String str, String str2, gf.e eVar) {
        u3 u3Var;
        gf.e eVar2 = this.N0;
        if (eVar2 != null) {
            eVar2.a(false);
        }
        this.N0 = eVar;
        if (this.G0 != 0) {
            ConnectionsManager.getInstance(this.X).cancelRequest(this.G0, false);
            this.G0 = 0;
        }
        boolean[] zArr = new boolean[1];
        if (gf.f.k(this.L, str, false)) {
            if (this.f37675d0.isEmpty() && (u3Var = this.K) != null) {
                u3Var.a(false);
                return;
            }
            return;
        }
        g0 g0Var = new g0(this, str, zArr, eVar);
        int i10 = this.I0 + 1;
        this.I0 = i10;
        Z(true);
        TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
        tL_messages_getWebPage.url = str;
        tL_messages_getWebPage.hash = 0;
        this.G0 = ConnectionsManager.getInstance(this.X).sendRequest(tL_messages_getWebPage, new org.telegram.messenger.zx(this, i10, eVar, str2, g0Var, tL_messages_getWebPage));
        if (eVar != null) {
            eVar.f7486b = new ag.o0(this, i10, eVar, 14);
            eVar.d();
        }
    }

    public final void Q() {
        int x02;
        int x03;
        TextView textView = this.C0;
        if (textView != null) {
            int i10 = org.telegram.ui.ActionBar.t6.f21021i6;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i10, false), 2, -1);
            org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i10);
            textView.setBackground(h02);
            org.telegram.ui.ActionBar.a7.k(textView, h02, null, N, null);
            org.telegram.ui.ActionBar.a7.V(this.C0, org.telegram.ui.ActionBar.t6.E8, null);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.B0;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, null);
        }
        ImageView imageView = this.f37688r0;
        if (imageView != null) {
            org.telegram.ui.ActionBar.a7.t(imageView, org.telegram.ui.ActionBar.t6.G6, null, PorterDuff.Mode.MULTIPLY);
            ImageView imageView2 = this.f37688r0;
            int i11 = org.telegram.ui.ActionBar.t6.f21333z8;
            org.telegram.ui.ActionBar.a7.R(imageView2, org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i11, false), 1, -1), null, org.telegram.ui.ActionBar.a7.N(i11), null);
        }
        ImageView imageView3 = this.f37689s0;
        if (imageView3 != null) {
            org.telegram.ui.ActionBar.a7.t(imageView3, org.telegram.ui.ActionBar.t6.G6, null, PorterDuff.Mode.MULTIPLY);
            ImageView imageView4 = this.f37689s0;
            int i12 = org.telegram.ui.ActionBar.t6.f21333z8;
            org.telegram.ui.ActionBar.a7.R(imageView4, org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i12, false), 1, -1), null, org.telegram.ui.ActionBar.a7.N(i12), null);
        }
        org.telegram.ui.Components.f6 f6Var = this.f37690t0;
        if (f6Var != null) {
            org.telegram.ui.ActionBar.a7.Z(f6Var, org.telegram.ui.ActionBar.t6.G6, null);
        }
        m0 m0Var = this.f37679h0;
        if (m0Var != null) {
            l3 l3Var = this.f37691u0[0];
            if (l3Var != null && org.telegram.messenger.uz.f18558v0) {
                x02 = l3Var.getBackgroundColor();
            } else {
                x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Dl, false);
            }
            m0Var.setMenuColors(x02);
            m0 m0Var2 = this.f37679h0;
            l3 l3Var2 = this.f37691u0[0];
            if (l3Var2 != null && org.telegram.messenger.uz.f18558v0) {
                x03 = l3Var2.getActionBarColor();
            } else {
                x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Dl, false);
            }
            m0Var2.d(x03, true);
        }
        this.f37683l0.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Dl, false));
    }

    public final void S() {
        int L0;
        int i10;
        boolean z10 = false;
        l3 l3Var = this.f37691u0[0];
        if (l3Var.f39062c.E != null && (L0 = l3Var.d.L0()) != -1) {
            View m10 = this.f37691u0[0].d.m(L0);
            if (m10 != null) {
                i10 = m10.getTop();
            } else {
                i10 = 0;
            }
            String str = "article" + this.f37691u0[0].f39062c.E.f19949id;
            SharedPreferences.Editor putInt = org.telegram.messenger.w0.f18945b.getSharedPreferences("articles", 0).edit().putInt(str, L0).putInt(str + "o", i10);
            String A = sc.e.A(str, "r");
            Point point = org.telegram.messenger.i0.f16172q;
            if (point.x > point.y) {
                z10 = true;
            }
            putInt.putBoolean(A, z10).commit();
        }
    }

    public final boolean T(String str, boolean z10) {
        String lowerCase;
        int i10;
        Integer num = 0;
        if (!TextUtils.isEmpty(str)) {
            String lowerCase2 = str.toLowerCase();
            Integer num2 = (Integer) this.f37691u0[0].f39062c.h.get(lowerCase2);
            if (num2 != null) {
                TL_iv.textAnchor textanchor = (TL_iv.textAnchor) this.f37691u0[0].f39062c.f36985r.get(lowerCase2);
                if (textanchor != null) {
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    if (!TextUtils.isEmpty(this.f37691u0[0].f39062c.E.cached_page.url)) {
                        lowerCase = this.f37691u0[0].f39062c.E.cached_page.url.toLowerCase();
                    } else {
                        lowerCase = this.f37691u0[0].f39062c.E.url.toLowerCase();
                    }
                    pageblockparagraph.text = org.telegram.ui.web.y1.d(textanchor.text, lowerCase, lowerCase2);
                    this.f37691u0[0].f39062c.getClass();
                    int I = f4.I(pageblockparagraph);
                    s4.c1 w9 = this.f37691u0[0].f39062c.w(null, I);
                    View view = w9.f47909a;
                    this.f37691u0[0].f39062c.H(I, w9, pageblockparagraph, 0, 0, false);
                    org.telegram.ui.ActionBar.z2 h = org.telegram.messenger.a30.h(this.L, false, 1, null);
                    h.f21617u0 = false;
                    h.f21618v0 = false;
                    LinearLayout linearLayout = new LinearLayout(this.L);
                    linearLayout.setOrientation(1);
                    org.telegram.ui.Cells.k9 k9Var = new org.telegram.ui.Cells.k9();
                    this.Q0 = k9Var;
                    k9Var.S(linearLayout);
                    this.Q0.D = new p0(this, 1);
                    ag.j3 j3Var = new ag.j3(this.L, 2);
                    j3Var.setTextSize(1, 16.0f);
                    j3Var.setTypeface(org.telegram.messenger.i0.o());
                    j3Var.setText(org.telegram.messenger.dd.L0(2131749201, null));
                    if (this.f37691u0[0].f39062c.G) {
                        i10 = 5;
                    } else {
                        i10 = 3;
                    }
                    j3Var.setGravity(i10 | 16);
                    j3Var.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false));
                    j3Var.setPadding(org.telegram.messenger.i0.L(18.0f), 0, org.telegram.messenger.i0.L(18.0f), 0);
                    linearLayout.addView(j3Var, new LinearLayout.LayoutParams(-1, org.telegram.messenger.i0.L(48.0f) + 1));
                    view.setTag("bottomSheet");
                    linearLayout.addView(view, w7.b6.k(0.0f, 7.0f, 0.0f, 0.0f, -1, -2));
                    org.telegram.ui.Cells.v9 n10 = this.Q0.n(this.L);
                    fg.i iVar = new fg.i(this, this.L, linearLayout, 5);
                    h.f21624y0 = new i0(this, 0);
                    iVar.addView(linearLayout, -1, -2);
                    iVar.addView(n10, -1, -2);
                    h.N = iVar;
                    if (this.P0.x()) {
                        this.P0.f(false);
                    }
                    this.I = h;
                    Y(h);
                    return true;
                } else if (num2.intValue() >= 0 && num2.intValue() < this.f37691u0[0].f39062c.e.size()) {
                    TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) this.f37691u0[0].f39062c.e.get(num2.intValue());
                    TL_iv.PageBlock x10 = x(pageBlock);
                    if ((x10 instanceof v3) && M((v3) x10)) {
                        this.f37691u0[0].f39062c.M();
                        this.f37691u0[0].f39062c.f();
                    }
                    int indexOf = this.f37691u0[0].f39062c.d.indexOf(pageBlock);
                    if (indexOf != -1) {
                        num2 = Integer.valueOf(indexOf);
                    }
                    Integer num3 = (Integer) this.f37691u0[0].f39062c.f36984n.get(lowerCase2);
                    if (num3 != null) {
                        if (num3.intValue() == -1) {
                            this.f37691u0[0].f39062c.getClass();
                            int I2 = f4.I(pageBlock);
                            s4.c1 w10 = this.f37691u0[0].f39062c.w(null, I2);
                            this.f37691u0[0].f39062c.H(I2, w10, pageBlock, 0, 0, false);
                            w10.f47909a.measure(View.MeasureSpec.makeMeasureSpec(this.f37691u0[0].f39061b.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                            Integer num4 = (Integer) this.f37691u0[0].f39062c.f36984n.get(lowerCase2);
                            if (num4.intValue() != -1) {
                                num = num4;
                            }
                        } else {
                            num = num3;
                        }
                    }
                    if (this.f37691u0[0].f39062c.I) {
                        num2 = Integer.valueOf(num2.intValue() + 1);
                    }
                    if (z10) {
                        org.telegram.ui.Components.ev0 ev0Var = new org.telegram.ui.Components.ev0(this.f37691u0[0].getContext());
                        ev0Var.f48056a = num2.intValue();
                        ev0Var.f25942s = (-org.telegram.messenger.i0.L(56.0f)) - num.intValue();
                        this.f37691u0[0].d.w0(ev0Var);
                        return true;
                    }
                    this.f37691u0[0].d.h1(num2.intValue(), (-org.telegram.messenger.i0.L(56.0f)) - num.intValue());
                    return true;
                }
            }
        }
        return false;
    }

    public final void U(int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.h4.U(int):void");
    }

    public final void V(int i10) {
        m0 m0Var = this.f37679h0;
        if (m0Var != null && !m0Var.T && !m0Var.W) {
            int j10 = Utilities.j(i10, org.telegram.messenger.i0.L(56.0f), org.telegram.messenger.i0.L(24.0f));
            this.J0 = j10;
            this.f37679h0.setHeight(j10);
            this.P0.f23446x = this.J0;
            int i11 = 0;
            while (true) {
                l3[] l3VarArr = this.f37691u0;
                if (i11 < l3VarArr.length) {
                    l3VarArr[i11].f39061b.setTopGlowOffset(this.J0);
                    i11++;
                } else {
                    return;
                }
            }
        }
    }

    public final void W(Activity activity, org.telegram.ui.ActionBar.k2 k2Var) {
        z90 z90Var;
        int i10;
        boolean z10;
        int x02;
        int i11;
        int i12;
        u3 u3Var;
        z90 z90Var2 = this.V0;
        if (z90Var2 != null) {
            z90Var2.b();
            this.V0 = null;
        }
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity != null) {
            z90Var = new z90(launchActivity, true);
        } else {
            z90Var = null;
        }
        this.V0 = z90Var;
        this.M = k2Var;
        if (!(k2Var instanceof ly)) {
            i10 = k2Var.getCurrentAccount();
        } else {
            i10 = org.telegram.messenger.e20.f15506s0;
        }
        this.X = i10;
        org.telegram.messenger.at.f(i10).c(this, org.telegram.messenger.at.f14700e2);
        org.telegram.messenger.at.f(this.X).c(this, org.telegram.messenger.at.f14706f2);
        org.telegram.messenger.at.f(this.X).c(this, org.telegram.messenger.at.f14712g2);
        org.telegram.messenger.at.f(this.X).c(this, org.telegram.messenger.at.f14718h2);
        org.telegram.messenger.at.f(this.X).c(this, org.telegram.messenger.at.f14726i4);
        Activity activity2 = this.L;
        if (activity2 != activity && (activity2 == null || !this.J || (u3Var = this.K) == null || u3Var.e == null)) {
            this.L = activity;
            this.f39095a = org.telegram.messenger.w0.f18945b.getSharedPreferences("articles", 0).getInt("font_type", 0);
            p(this, false);
            this.f37683l0 = new Paint();
            this.m0 = activity.getResources().getDrawable(2131231620);
            this.f37684n0 = new Paint();
            ArticleViewer$WindowView articleViewer$WindowView = new ArticleViewer$WindowView(this, activity);
            this.f37677f0 = articleViewer$WindowView;
            articleViewer$WindowView.setWillNotDraw(false);
            this.f37677f0.setClipChildren(true);
            this.f37677f0.setFocusable(false);
            l0 l0Var = new l0(this, activity, 0);
            this.f37678g0 = l0Var;
            this.f37677f0.addView(l0Var, w7.b6.e(-1, -1, 51));
            if (this.K == null) {
                this.f37677f0.setFitsSystemWindows(true);
                this.f37678g0.setOnApplyWindowInsetsListener(new org.telegram.ui.ActionBar.a3(1));
            }
            FrameLayout frameLayout = new FrameLayout(activity);
            this.P = frameLayout;
            frameLayout.setBackgroundColor(-16777216);
            this.P.setVisibility(4);
            this.f37677f0.addView(this.P, w7.b6.c(-1.0f, -1));
            k4 k4Var = new k4(activity);
            this.R = k4Var;
            k4Var.setVisibility(0);
            this.R.setBackgroundColor(-16777216);
            this.P.addView(this.R, w7.b6.e(-1, -1, 17));
            this.Q = new TextureView(activity);
            this.f37691u0 = new l3[2];
            int i13 = 0;
            while (true) {
                l3[] l3VarArr = this.f37691u0;
                if (i13 >= l3VarArr.length) {
                    break;
                }
                l3 l3Var = new l3(this, activity);
                l3VarArr[i13] = l3Var;
                if (i13 == 0) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                l3Var.setVisibility(i12);
                this.f37678g0.addView(l3Var, w7.b6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
                l3Var.f39061b.setOnItemLongClickListener(new r(this));
                l3Var.f39061b.setOnItemClickListener(new ng.d(2, this, l3Var));
                i13++;
            }
            this.f37678g0.addView(new FrameLayout(activity), w7.b6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f37693w0.setColor(-16777216);
            this.f37694x0.setColor(-16777216);
            this.A0.setColor(-14408666);
            this.f37695y0.setColor(-16777216);
            m0 m0Var = new m0(this, activity);
            this.f37679h0 = m0Var;
            if (this.K != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            m0Var.f42901e0 = z10;
            this.f37678g0.addView(m0Var, w7.b6.e(-1, -2, 48));
            this.f37679h0.setOnClickListener(new ag.t0(23, this, activity));
            this.f37679h0.f42897b0.addTextChangedListener(new n0(this, 0));
            org.telegram.ui.web.j jVar = new org.telegram.ui.web.j(activity);
            this.f37680i0 = jVar;
            jVar.setOpenProgress(0.0f);
            this.f37680i0.f42874x.j(new h3(this, 2));
            this.f37678g0.addView(this.f37680i0, w7.b6.c(-1.0f, -1));
            this.f37681j0 = new y(this, 3);
            this.f37679h0.L.setOnClickListener(new q(this, 2));
            this.f37679h0.L.setOnLongClickListener(new s(this, 0));
            this.f37679h0.setMenuListener(new ag.e0(11, this, activity));
            this.f37679h0.O.setOnClickListener(new q(this, 3));
            org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(this.L, 10);
            this.f37687q0 = a5Var;
            a5Var.setOnTouchListener(new org.telegram.ui.ActionBar.n2(2));
            this.f37687q0.setWillNotDraw(false);
            this.f37687q0.setTranslationY(org.telegram.messenger.i0.L(51.0f));
            this.f37687q0.setVisibility(4);
            this.f37687q0.setFocusable(true);
            this.f37687q0.setFocusableInTouchMode(true);
            this.f37687q0.setClickable(true);
            this.f37687q0.setPadding(0, org.telegram.messenger.i0.L(3.0f), 0, 0);
            this.f37678g0.addView(this.f37687q0, w7.b6.e(-1, 51, 80));
            new vh.r2(this.f37677f0, false, new p(this, 0));
            ImageView imageView = new ImageView(this.L);
            this.f37688r0 = imageView;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            this.f37688r0.setImageResource(2131232173);
            ImageView imageView2 = this.f37688r0;
            int i14 = org.telegram.ui.ActionBar.t6.G6;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.a7.t(imageView2, i14, null, mode);
            ImageView imageView3 = this.f37688r0;
            int i15 = org.telegram.ui.ActionBar.t6.f21333z8;
            org.telegram.ui.ActionBar.a7.R(imageView3, org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i15, false), 1, -1), null, org.telegram.ui.ActionBar.a7.N(i15), null);
            this.f37687q0.addView(this.f37688r0, w7.b6.d(48, 48.0f, 53, 0.0f, 0.0f, 48.0f, 0.0f));
            this.f37688r0.setOnClickListener(new q(this, 0));
            this.f37688r0.setContentDescription(org.telegram.messenger.dd.L0(2131754779, null));
            ImageView imageView4 = new ImageView(this.L);
            this.f37689s0 = imageView4;
            imageView4.setScaleType(scaleType);
            this.f37689s0.setImageResource(2131232172);
            org.telegram.ui.ActionBar.a7.t(this.f37689s0, i14, null, mode);
            org.telegram.ui.ActionBar.a7.R(this.f37689s0, org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i15, false), 1, -1), null, org.telegram.ui.ActionBar.a7.N(i15), null);
            this.f37687q0.addView(this.f37689s0, w7.b6.d(48, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f37689s0.setOnClickListener(new q(this, 1));
            this.f37689s0.setContentDescription(org.telegram.messenger.dd.L0(2131754778, null));
            org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(this.L, true, true, true);
            this.f37690t0 = f6Var;
            f6Var.setScaleProperty(0.6f);
            this.f37690t0.b(0.4f, 350L, org.telegram.ui.Components.gr.h);
            org.telegram.ui.ActionBar.a7.Z(this.f37690t0, i14, null);
            this.f37690t0.setTextSize(org.telegram.messenger.i0.L(15.0f));
            this.f37690t0.setTypeface(org.telegram.messenger.i0.o());
            this.f37690t0.setGravity(3);
            this.f37690t0.getDrawable().M = org.telegram.messenger.i0.f16172q.x;
            this.f37687q0.addView(this.f37690t0, w7.b6.d(-2, -2.0f, 19, 18.0f, 0.0f, 108.0f, 0.0f));
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.f37676e0 = layoutParams;
            layoutParams.height = -1;
            layoutParams.format = -3;
            layoutParams.width = -1;
            layoutParams.gravity = 51;
            layoutParams.type = 98;
            layoutParams.softInputMode = 48;
            layoutParams.flags = 131072;
            if (this.K == null) {
                x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20873a7, true);
            } else {
                x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20873a7, false);
            }
            if (org.telegram.messenger.i0.B(x02) >= 0.721f && Build.VERSION.SDK_INT >= 26) {
                i11 = 1808;
            } else {
                i11 = 1792;
            }
            this.f37695y0.setColor(x02);
            this.f37696z0 = true;
            WindowManager.LayoutParams layoutParams2 = this.f37676e0;
            layoutParams2.systemUiVisibility = i11;
            layoutParams2.flags |= -2147417856;
            if (Build.VERSION.SDK_INT >= 28) {
                layoutParams2.layoutInDisplayCutoutMode = 1;
            }
            org.telegram.ui.Cells.k9 k9Var = new org.telegram.ui.Cells.k9();
            this.P0 = k9Var;
            k9Var.S(this.f37691u0[0].f39061b);
            if (org.telegram.messenger.wp.r1(this.X).f19253t7.s()) {
                this.P0.f23431k0 = new r(this);
            }
            org.telegram.ui.Cells.k9 k9Var2 = this.P0;
            k9Var2.f22197z0 = this.f37691u0[0].d;
            k9Var2.D = new p0(this, 0);
            this.f37678g0.addView(k9Var2.n(activity));
            l0 l0Var2 = this.f37678g0;
            ps0 ps0Var = new ps0(l0Var2, l0Var2);
            this.R0 = ps0Var;
            ps0Var.F = new r(this);
            ps0Var.E = new e(this, 1);
            this.f37683l0.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Dl, false));
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
        org.telegram.ui.ActionBar.z2 z2Var = this.I;
        if (z2Var != null) {
            z2Var.dismiss();
            this.I = null;
        }
        org.telegram.ui.ActionBar.z2 h = org.telegram.messenger.a30.h(this.L, false, 1, null);
        try {
            str2 = URLDecoder.decode(str.replaceAll("\\+", "%2b"), "UTF-8");
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
            str2 = str;
        }
        h.O = str2;
        h.P = false;
        h.Q = true;
        CharSequence[] charSequenceArr = {org.telegram.messenger.dd.L0(2131747833, null), org.telegram.messenger.dd.L0(2131751767, null)};
        eg.j jVar = new eg.j(2, this, str);
        h.L = charSequenceArr;
        h.K = jVar;
        h.H0 = new t(this, 0);
        Y(h);
    }

    public final void Y(org.telegram.ui.ActionBar.z2 z2Var) {
        if (this.L != null) {
            try {
                org.telegram.ui.ActionBar.z2 z2Var2 = this.f37682k0;
                if (z2Var2 != null) {
                    z2Var2.dismiss();
                    this.f37682k0 = null;
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
            try {
                this.f37682k0 = z2Var;
                z2Var.setCanceledOnTouchOutside(true);
                this.f37682k0.setOnDismissListener(new t(this, 1));
                z2Var.show();
            } catch (Exception e7) {
                org.telegram.messenger.f8.g(e7, true);
            }
        }
    }

    public final void Z(boolean z10) {
        org.telegram.messenger.i0.r(this.f37681j0);
        if (z10) {
            this.f37679h0.f42900d0.a(false, 0.0f);
            this.f37679h0.f42900d0.a(true, 0.3f);
            org.telegram.messenger.i0.h3(this.f37681j0, 100L);
            return;
        }
        this.f37679h0.f42900d0.a(true, 1.0f);
    }

    @Override
    public final void a(f4 f4Var, org.telegram.ui.Components.vz0 vz0Var) {
        String str;
        String str2;
        org.telegram.ui.Components.q80 q80Var;
        String lowerCase;
        if (vz0Var != null && (str = vz0Var.f32031b) != null) {
            org.telegram.ui.ActionBar.z2 z2Var = this.I;
            k0 k0Var = null;
            if (z2Var != null) {
                z2Var.dismiss();
                this.I = null;
            }
            int lastIndexOf = str.lastIndexOf(35);
            boolean z10 = false;
            if (lastIndexOf != -1) {
                if (!TextUtils.isEmpty(f4Var.E.cached_page.url)) {
                    lowerCase = f4Var.E.cached_page.url.toLowerCase();
                } else {
                    lowerCase = f4Var.E.url.toLowerCase();
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
                z2 z2Var2 = this.d;
                if (z2Var2 != null && (q80Var = this.f39096b) != null) {
                    k0Var = new k0(this, z2Var2, q80Var);
                }
                O(str, str2, k0Var);
            }
        }
    }

    public final void a0() {
        LaunchActivity launchActivity;
        FrameLayout frameLayout;
        if (this.W && (launchActivity = LaunchActivity.I1) != null && !launchActivity.isFinishing()) {
            if (this.f37691u0[0].f()) {
                if (this.f37691u0[0].getWebView() != null) {
                    frameLayout = this.f37691u0[0].f39063f;
                } else {
                    return;
                }
            } else {
                l3 l3Var = this.f37691u0[0];
                TLRPC.WebPage webPage = l3Var.f39062c.E;
                frameLayout = l3Var;
                if (webPage == null) {
                    return;
                }
            }
            new org.telegram.ui.Components.cc(frameLayout, null).G(2131623981, 4, org.telegram.messenger.i0.T2(org.telegram.messenger.dd.L0(2131752874, null), new y(this, 11))).k(true);
        }
    }

    @Override
    public final boolean b(TL_iv.PageBlock pageBlock, f4 f4Var) {
        int indexOf;
        List list;
        org.telegram.ui.ActionBar.k2 k2Var = this.M;
        if (k2Var != null && k2Var.getParentActivity() != null) {
            if ((pageBlock instanceof TL_iv.pageBlockVideo) && !e4.g(f4Var.E, pageBlock)) {
                list = Collections.singletonList(pageBlock);
                indexOf = 0;
            } else {
                ArrayList arrayList = new ArrayList(f4Var.f36983f);
                indexOf = f4Var.f36983f.indexOf(pageBlock);
                list = arrayList;
            }
            PhotoViewer v12 = PhotoViewer.v1();
            v12.N2(null, this.M, null);
            if (v12.h2(null, null, null, null, null, null, null, indexOf, new d3(this, list), null, 0L, 0L, 0L, true, new n3(this, f4Var.E, list), null)) {
                l();
                return true;
            }
        }
        return false;
    }

    public final void b0(boolean z10) {
        float f7;
        this.f37687q0.setVisibility(0);
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
        ofFloat.addUpdateListener(new o(this, 1));
        this.Y0.addListener(new eg.m(5, this, z10));
        this.Y0.setDuration(320L);
        this.Y0.setInterpolator(org.telegram.ui.Components.gr.h);
        this.Y0.start();
    }

    public final void c0(int i10, Object obj, boolean z10) {
        int L;
        int i11;
        int i12;
        int i13;
        int color;
        int x02;
        int x03;
        boolean z11;
        boolean z12;
        if (obj != null) {
            if (((obj instanceof TLRPC.WebPage) && ((TLRPC.WebPage) obj).cached_page != null) || (obj instanceof x2)) {
                int i14 = 1;
                if (!z10 && i10 != 0) {
                    l3[] l3VarArr = this.f37691u0;
                    l3 l3Var = l3VarArr[1];
                    l3VarArr[1] = l3VarArr[0];
                    l3VarArr[0] = l3Var;
                    this.f37679h0.i();
                    this.f37671a1.a(this.f37691u0[0].getBackgroundColor(), true);
                    this.f37673b1.a(this.f37691u0[1].getBackgroundColor(), true);
                    u3 u3Var = this.K;
                    if (u3Var != null) {
                        u3Var.y();
                    }
                    int indexOfChild = this.f37678g0.indexOfChild(this.f37691u0[0]);
                    int indexOfChild2 = this.f37678g0.indexOfChild(this.f37691u0[1]);
                    if (i10 == 1) {
                        if (indexOfChild < indexOfChild2) {
                            this.f37678g0.removeView(this.f37691u0[0]);
                            this.f37678g0.addView(this.f37691u0[0], indexOfChild2);
                        }
                    } else if (indexOfChild2 < indexOfChild) {
                        this.f37678g0.removeView(this.f37691u0[0]);
                        this.f37678g0.addView(this.f37691u0[0], indexOfChild);
                    }
                    this.f37692v0 = new AnimatorSet();
                    this.f37691u0[0].setVisibility(0);
                    if (i10 == 1) {
                        i13 = 0;
                    } else {
                        i13 = 1;
                    }
                    l3 l3Var2 = this.f37691u0[i13];
                    if (this.K == null) {
                        color = 0;
                    } else {
                        color = this.f37683l0.getColor();
                    }
                    l3Var2.setBackgroundColor(color);
                    this.f37691u0[i13].setLayerType(2, null);
                    if (i10 == 1) {
                        l3 l3Var3 = this.f37691u0[0];
                        Point point = org.telegram.messenger.i0.f16172q;
                        l3Var3.setTranslationX(point.x);
                        this.f37692v0.playTogether(ObjectAnimator.ofFloat(this.f37691u0[0], View.TRANSLATION_X, point.x, 0.0f));
                    } else if (i10 == -1) {
                        this.f37691u0[0].setTranslationX(0.0f);
                        this.f37692v0.playTogether(ObjectAnimator.ofFloat(this.f37691u0[1], View.TRANSLATION_X, 0.0f, org.telegram.messenger.i0.f16172q.x));
                    }
                    this.f37692v0.setDuration(320L);
                    this.f37692v0.setInterpolator(org.telegram.ui.Components.gr.h);
                    this.f37692v0.addListener(new t0(this, i13, 0));
                    this.f37677f0.f21634f = true;
                    m0 m0Var = this.f37679h0;
                    l3 l3Var4 = this.f37691u0[0];
                    if (l3Var4 != null && org.telegram.messenger.uz.f18558v0) {
                        x02 = l3Var4.getBackgroundColor();
                    } else {
                        x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Dl, false);
                    }
                    m0Var.setMenuColors(x02);
                    m0 m0Var2 = this.f37679h0;
                    l3 l3Var5 = this.f37691u0[0];
                    if (l3Var5 != null && org.telegram.messenger.uz.f18558v0) {
                        x03 = l3Var5.getActionBarColor();
                    } else {
                        x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Dl, false);
                    }
                    m0Var2.d(x03, true);
                    m0 m0Var3 = this.f37679h0;
                    l3 l3Var6 = this.f37691u0[0];
                    if (l3Var6 != null && l3Var6.e()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    m0Var3.setIsTonsite(z11);
                    m0 m0Var4 = this.f37679h0;
                    l3 l3Var7 = this.f37691u0[0];
                    if (l3Var7 != null && l3Var7.d()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    m0Var4.setIsLocal(z12);
                    AnimatorSet animatorSet = this.f37692v0;
                    Objects.requireNonNull(animatorSet);
                    org.telegram.messenger.i0.g3(new qr0(animatorSet, 4));
                }
                if (!z10) {
                    this.P0.f(true);
                }
                f4 f4Var = this.f37691u0[z10 ? 1 : 0].f39062c;
                if (z10) {
                    obj = i0.a.g(2, this.f37675d0);
                }
                this.f37691u0[z10 ? 1 : 0].b();
                if (obj instanceof TLRPC.WebPage) {
                    TLRPC.WebPage webPage = (TLRPC.WebPage) obj;
                    this.f37691u0[z10 ? 1 : 0].setWeb(null);
                    this.f37691u0[z10 ? 1 : 0].setType(0);
                    TL_iv.Page page = webPage.cached_page;
                    f4Var.G = page.rtl;
                    f4Var.E = webPage;
                    int size = page.blocks.size();
                    for (int i15 = 0; i15 < size; i15++) {
                        TL_iv.PageBlock pageBlock = webPage.cached_page.blocks.get(i15);
                        if (i15 == 0) {
                            pageBlock.first = true;
                            if (pageBlock instanceof TL_iv.pageBlockCover) {
                                TL_iv.pageBlockCover pageblockcover = (TL_iv.pageBlockCover) pageBlock;
                                TL_iv.RichText u10 = u(0, pageblockcover);
                                TL_iv.RichText u11 = u(1, pageblockcover);
                                if (((u10 != null && !(u10 instanceof TL_iv.textEmpty)) || (u11 != null && !(u11 instanceof TL_iv.textEmpty))) && size > 1) {
                                    TL_iv.PageBlock pageBlock2 = webPage.cached_page.blocks.get(1);
                                    if (pageBlock2 instanceof TL_iv.pageBlockChannel) {
                                        f4Var.F = (TL_iv.pageBlockChannel) pageBlock2;
                                    }
                                }
                            }
                        } else if (i15 == 1 && f4Var.F != null) {
                        }
                        if (i15 == size - 1) {
                            i12 = i15;
                        } else {
                            i12 = 0;
                        }
                        f4Var.F(f4Var, pageBlock, 0, 0, i12);
                    }
                    f4Var.f();
                    if (this.f37675d0.size() != 1 && i10 != -1) {
                        s4.a0 a0Var = this.f37691u0[z10 ? 1 : 0].d;
                        u3 u3Var2 = this.K;
                        if (u3Var2 == null) {
                            i14 = 0;
                        }
                        if (u3Var2 != null) {
                            i11 = org.telegram.messenger.i0.L(32.0f);
                        } else {
                            i11 = 0;
                        }
                        a0Var.h1(i14, i11);
                    } else {
                        SharedPreferences sharedPreferences = org.telegram.messenger.w0.f18945b.getSharedPreferences("articles", 0);
                        String str = "article" + webPage.f19949id;
                        int i16 = sharedPreferences.getInt(str, -1);
                        boolean z13 = sharedPreferences.getBoolean(str + "r", true);
                        Point point2 = org.telegram.messenger.i0.f16172q;
                        if (point2.x <= point2.y) {
                            i14 = 0;
                        }
                        if (z13 == i14) {
                            L = sharedPreferences.getInt(str + "o", 0) - this.f37691u0[z10 ? 1 : 0].f39061b.getPaddingTop();
                        } else {
                            L = org.telegram.messenger.i0.L(10.0f);
                        }
                        if (i16 != -1) {
                            this.f37691u0[z10 ? 1 : 0].d.h1(i16, L);
                        }
                    }
                } else if (obj instanceof x2) {
                    this.f37691u0[z10 ? 1 : 0].setType(1);
                    this.f37691u0[z10 ? 1 : 0].g();
                    this.f37691u0[z10 ? 1 : 0].setWeb((x2) obj);
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
        float f7;
        boolean z12;
        boolean z13;
        if (this.f37679h0 != null && (l3Var = (l3VarArr = this.f37691u0)[0]) != null && l3VarArr[1] != null) {
            int visibility = l3Var.getVisibility();
            float f10 = 0.0f;
            if (visibility != 0) {
                translationX = 0.0f;
            } else {
                translationX = 1.0f - (this.f37691u0[0].getTranslationX() / this.f37691u0[0].getWidth());
            }
            float f11 = 1.0f - translationX;
            m0 m0Var = this.f37679h0;
            m0Var.d[0] = this.f37691u0[0].getProgress();
            m0Var.invalidate();
            m0 m0Var2 = this.f37679h0;
            m0Var2.d[1] = this.f37691u0[1].getProgress();
            m0Var2.invalidate();
            this.f37679h0.setTransitionProgress(f11);
            m0 m0Var3 = this.f37679h0;
            if (!m0Var3.W && !m0Var3.T) {
                ArticleViewer$WindowView articleViewer$WindowView = this.f37677f0;
                if (articleViewer$WindowView.e || articleViewer$WindowView.f21634f) {
                    boolean H = H();
                    ArrayList arrayList = this.f37675d0;
                    if (!H && arrayList.size() <= 1) {
                        this.f37679h0.P.c();
                        this.f37679h0.setBackButtonCached(false);
                    } else {
                        if (!this.f37691u0[0].f39066s && arrayList.size() <= 1) {
                            f7 = 0.0f;
                        } else {
                            f7 = 1.0f;
                        }
                        if (this.f37691u0[1].f39066s || arrayList.size() > 2) {
                            f10 = 1.0f;
                        }
                        float T1 = org.telegram.messenger.i0.T1(f7, f10, f11);
                        this.f37679h0.M.c(false, 1.0f - T1);
                        this.f37679h0.P.c();
                        m0 m0Var4 = this.f37679h0;
                        if (T1 > 0.5f) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        m0Var4.setBackButtonCached(z12);
                    }
                    this.f37679h0.setHasForward(this.f37691u0[0].f39067w);
                    this.f37679h0.setIsLocal(this.f37691u0[0].d());
                    m0 m0Var5 = this.f37679h0;
                    if (this.f37691u0[0].getWebView() != null && this.f37691u0[0].getWebView().f43011b) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    m0Var5.setIsLoaded(z13);
                }
            }
            m0 m0Var6 = this.f37679h0;
            int actionBarColor = this.f37691u0[0].getActionBarColor();
            ArticleViewer$WindowView articleViewer$WindowView2 = this.f37677f0;
            if (!articleViewer$WindowView2.e && !articleViewer$WindowView2.f21634f) {
                z10 = false;
            } else {
                z10 = true;
            }
            m0Var6.b(0, this.f37671a1.a(actionBarColor, z10));
            m0 m0Var7 = this.f37679h0;
            int actionBarColor2 = this.f37691u0[1].getActionBarColor();
            ArticleViewer$WindowView articleViewer$WindowView3 = this.f37677f0;
            if (!articleViewer$WindowView3.e && !articleViewer$WindowView3.f21634f) {
                z11 = false;
            } else {
                z11 = true;
            }
            m0Var7.b(1, this.f37673b1.a(actionBarColor2, z11));
            this.f37679h0.d(i0.b.f(f11, this.f37691u0[0].getActionBarColor(), this.f37691u0[1].getActionBarColor()), false);
            m0 m0Var8 = this.f37679h0;
            if (translationX > 0.5f) {
                l3Var2 = this.f37691u0[0];
            } else {
                l3Var2 = this.f37691u0[1];
            }
            m0Var8.setMenuType(l3Var2.f39060a);
            u3 u3Var = this.K;
            if (u3Var != null) {
                u3Var.f41775c.invalidate();
                return;
            }
            ArticleViewer$WindowView articleViewer$WindowView4 = this.f37677f0;
            if (articleViewer$WindowView4 != null) {
                articleViewer$WindowView4.invalidate();
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        z0 z0Var;
        org.telegram.messenger.kj messageObject;
        if (i10 == org.telegram.messenger.at.f14718h2) {
            org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) objArr[0];
            if (this.f37691u0 != null) {
                int i12 = 0;
                while (true) {
                    l3[] l3VarArr = this.f37691u0;
                    if (i12 < l3VarArr.length) {
                        int childCount = l3VarArr[i12].f39061b.getChildCount();
                        for (int i13 = 0; i13 < childCount; i13++) {
                            View childAt = this.f37691u0[i12].f39061b.getChildAt(i13);
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
        } else if (i10 != org.telegram.messenger.at.f14706f2 && i10 != org.telegram.messenger.at.f14712g2) {
            if (i10 == org.telegram.messenger.at.f14700e2) {
                Integer num = (Integer) objArr[0];
                if (this.f37691u0 != null) {
                    int i14 = 0;
                    while (true) {
                        l3[] l3VarArr2 = this.f37691u0;
                        if (i14 < l3VarArr2.length) {
                            int childCount2 = l3VarArr2[i14].f39061b.getChildCount();
                            int i15 = 0;
                            while (true) {
                                if (i15 < childCount2) {
                                    View childAt2 = this.f37691u0[i14].f39061b.getChildAt(i15);
                                    if ((childAt2 instanceof z0) && (messageObject = (z0Var = (z0) childAt2).getMessageObject()) != null && messageObject.f1() == num.intValue()) {
                                        org.telegram.messenger.kj kjVar2 = MediaController.B().f14483u0;
                                        if (kjVar2 != null) {
                                            messageObject.f16652b0 = kjVar2.f16652b0;
                                            messageObject.f16675g0 = kjVar2.f16675g0;
                                            messageObject.f16679h0 = kjVar2.f16679h0;
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
            } else if (i10 == org.telegram.messenger.at.f14726i4 && this.f37691u0 != null) {
                int i16 = 0;
                while (true) {
                    l3[] l3VarArr3 = this.f37691u0;
                    if (i16 < l3VarArr3.length) {
                        int childCount3 = l3VarArr3[i16].f39061b.getChildCount();
                        for (int i17 = 0; i17 < childCount3; i17++) {
                            View childAt3 = this.f37691u0[i16].f39061b.getChildAt(i17);
                            if (childAt3 instanceof s2) {
                                ((s2) childAt3).e.invalidate();
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
        } else if (this.f37691u0 != null) {
            int i18 = 0;
            while (true) {
                l3[] l3VarArr4 = this.f37691u0;
                if (i18 < l3VarArr4.length) {
                    int childCount4 = l3VarArr4[i18].f39061b.getChildCount();
                    for (int i19 = 0; i19 < childCount4; i19++) {
                        View childAt4 = this.f37691u0[i18].f39061b.getChildAt(i19);
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

    public final void e(int i10, String str) {
        S();
        org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3();
        h3Var.f20374x = str;
        this.f37675d0.add(h3Var);
        this.f37679h0.h(false);
        c0(i10, h3Var, false);
    }

    public final boolean f(TLRPC.WebPage webPage, String str, int i10) {
        S();
        this.f37675d0.add(webPage);
        this.f37679h0.h(false);
        c0(i10, webPage, false);
        return T(str, false);
    }

    public final void f0() {
        int i10;
        int size;
        boolean z10;
        boolean z11;
        float f7;
        if (this.E == null && !this.f37691u0[0].f()) {
            return;
        }
        if (this.f37691u0[0].f()) {
            if (this.f37691u0[0].getWebView() == null) {
                i10 = 0;
            } else {
                i10 = this.f37691u0[0].getWebView().getSearchIndex();
            }
            if (this.f37691u0[0].getWebView() == null) {
                size = 0;
            } else {
                size = this.f37691u0[0].getWebView().getSearchCount();
            }
        } else {
            i10 = this.G;
            size = this.E.size();
        }
        ImageView imageView = this.f37688r0;
        if (size > 0 && i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        imageView.setEnabled(z10);
        ImageView imageView2 = this.f37689s0;
        if (size > 0 && i10 != size - 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        imageView2.setEnabled(z11);
        ImageView imageView3 = this.f37688r0;
        float f10 = 0.5f;
        if (imageView3.isEnabled()) {
            f7 = 1.0f;
        } else {
            f7 = 0.5f;
        }
        imageView3.setAlpha(f7);
        ImageView imageView4 = this.f37689s0;
        if (imageView4.isEnabled()) {
            f10 = 1.0f;
        }
        imageView4.setAlpha(f10);
        this.f37690t0.a();
        if (size < 0) {
            this.f37690t0.setText("");
        } else if (size == 0) {
            this.f37690t0.setText(org.telegram.messenger.dd.L0(2131748183, null));
        } else if (size == 1) {
            this.f37690t0.setText(org.telegram.messenger.dd.L0(2131747843, null));
        } else {
            this.f37690t0.setText(String.format(org.telegram.messenger.dd.J0(size, "CountOfResults"), Integer.valueOf(i10 + 1), Integer.valueOf(size)));
        }
    }

    public final void g0(boolean z10) {
        boolean z11;
        boolean z12 = false;
        this.f37679h0.g(0, this.f37691u0[0].getTitle(), z10);
        this.f37679h0.f(0, this.f37691u0[0].getSubtitle());
        m0 m0Var = this.f37679h0;
        if (this.f37691u0[0].f() && this.f37691u0[0].getWebView() != null && this.f37691u0[0].getWebView().E) {
            z11 = true;
        } else {
            z11 = false;
        }
        m0Var.e(0, z11);
        this.f37679h0.g(1, this.f37691u0[1].getTitle(), z10);
        this.f37679h0.f(1, this.f37691u0[1].getSubtitle());
        m0 m0Var2 = this.f37679h0;
        if (this.f37691u0[1].f() && this.f37691u0[1].getWebView() != null && this.f37691u0[1].getWebView().E) {
            z12 = true;
        }
        m0Var2.e(1, z12);
    }

    public final void i() {
        this.K0 = false;
        y2 y2Var = this.L0;
        if (y2Var != null) {
            this.f37677f0.removeCallbacks(y2Var);
            this.L0 = null;
        }
        y2 y2Var2 = this.M0;
        if (y2Var2 != null) {
            this.f37677f0.removeCallbacks(y2Var2);
            this.M0 = null;
        }
    }

    public final void k(org.telegram.messenger.je jeVar) {
        if (this.J0 == org.telegram.messenger.i0.L(56.0f)) {
            if (jeVar != null) {
                jeVar.run();
                return;
            }
            return;
        }
        ValueAnimator duration = ValueAnimator.ofObject(new IntEvaluator(), Integer.valueOf(this.J0), Integer.valueOf(org.telegram.messenger.i0.L(56.0f))).setDuration(180L);
        duration.setInterpolator(new DecelerateInterpolator());
        duration.addUpdateListener(new o(this, 0));
        duration.addListener(new bg.e(jeVar, 23));
        if (jeVar != null) {
            duration.setDuration(duration.getDuration() / 2);
        }
        duration.start();
    }

    public final void l() {
        long j10;
        v2 v2Var;
        g3 g3Var = this.f37691u0[0].f39061b;
        if (g3Var != null && this.W) {
            float measuredHeight = g3Var.getMeasuredHeight() / 2.0f;
            Uri uri = null;
            float f7 = 0.0f;
            v2 v2Var2 = null;
            for (int i10 = 0; i10 < g3Var.getChildCount(); i10++) {
                View childAt = g3Var.getChildAt(i10);
                if (childAt instanceof v2) {
                    float measuredHeight2 = (childAt.getMeasuredHeight() / 2.0f) + childAt.getTop();
                    if (v2Var2 == null || Math.abs(measuredHeight - measuredHeight2) < Math.abs(measuredHeight - f7)) {
                        v2Var2 = (v2) childAt;
                        f7 = measuredHeight2;
                    }
                }
            }
            boolean z10 = PhotoViewer.v1().f33485f;
            if (z10 || ((v2Var = this.f39104y) != null && v2Var != v2Var2 && this.f39103x != null)) {
                VideoPlayerHolderBase videoPlayerHolderBase = this.f39103x;
                if (videoPlayerHolderBase != null) {
                    v2 v2Var3 = this.f39104y;
                    long j11 = v2Var3.L.video_id;
                    w2 a2 = w2.a(videoPlayerHolderBase, v2Var3);
                    v2Var3.c(a2);
                    this.D.k(a2, j11);
                    v2 v2Var4 = this.f39104y;
                    w2 w2Var = v2Var4.M;
                    if (w2Var != null) {
                        Bitmap bitmap = w2Var.f42662b;
                        if (bitmap != null) {
                            v2Var4.e.v0(bitmap);
                        }
                        this.f39104y.e(false);
                    }
                    this.f39103x.release(null);
                }
                this.f39103x = null;
                this.f39104y = null;
            }
            if (!z10 && v2Var2 != null) {
                l60 l60Var = v2Var2.f42387a;
                if (v2Var2.O != null && l60Var.f39103x == null) {
                    l60Var.f39103x = new u2(v2Var2).with(v2Var2.f42391n);
                    TLRPC.Document document = v2Var2.O;
                    for (int i11 = 0; i11 < document.attributes.size(); i11++) {
                        if (document.attributes.get(i11) instanceof TLRPC.TL_documentAttributeVideo) {
                            TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) document.attributes.get(i11);
                            v2Var2.h.a(tL_documentAttributeVideo.f19801w / tL_documentAttributeVideo.h, 0);
                        }
                    }
                    TLRPC.WebPage webPage = v2Var2.f42388b.E;
                    if (webPage != null) {
                        uri = org.telegram.messenger.x8.f(((h4) l60Var).X, webPage, document);
                    }
                    if (uri != null) {
                        VideoPlayerHolderBase videoPlayerHolderBase2 = l60Var.f39103x;
                        w2 w2Var2 = v2Var2.M;
                        if (w2Var2 == null) {
                            j10 = 0;
                        } else {
                            j10 = w2Var2.f42661a;
                        }
                        videoPlayerHolderBase2.seekTo(j10);
                        l60Var.f39103x.preparePlayer(uri, true, 1.0f);
                        l60Var.f39103x.play();
                    }
                }
                this.f39104y = v2Var2;
            }
        }
    }

    public final void m(boolean z10, boolean z11) {
        if (this.L != null && !this.U0 && this.V) {
            int i10 = 0;
            if (this.Z != 0 && Math.abs(this.f37672b0 - System.currentTimeMillis()) >= 500) {
                Runnable runnable = this.f37670a0;
                if (runnable != null) {
                    runnable.run();
                    this.f37670a0 = null;
                }
                this.Z = 0;
            }
            if (this.Z == 0) {
                u3 u3Var = this.K;
                if (u3Var != null) {
                    u3Var.a(false);
                    return;
                }
                if (this.P.getVisibility() == 0) {
                    if (this.O != null) {
                        this.P.setVisibility(4);
                        this.S.onCustomViewHidden();
                        this.P.removeView(this.O);
                        this.O = null;
                    } else {
                        org.telegram.ui.Components.n81 n81Var = this.F0;
                        if (n81Var != null && n81Var.T) {
                            n81Var.T = false;
                            n81Var.m();
                            n81Var.l(false);
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
                m0 m0Var = this.f37679h0;
                if (m0Var.T) {
                    m0Var.h(false);
                } else if (m0Var.W) {
                    m0Var.k(false);
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
                    if (z10 && !z11) {
                        ArrayList arrayList = this.f37675d0;
                        if (arrayList.size() >= 2) {
                            Object v = i0.a.v(1, arrayList);
                            if (v instanceof x2) {
                                ((x2) v).a();
                            }
                            if (v instanceof TLRPC.WebPage) {
                                org.telegram.ui.web.y1.o((TLRPC.WebPage) v);
                            }
                            c0(-1, arrayList.get(arrayList.size() - 1), false);
                            return;
                        }
                    }
                    org.telegram.messenger.at.f(this.X).n(this, org.telegram.messenger.at.f14700e2);
                    org.telegram.messenger.at.f(this.X).n(this, org.telegram.messenger.at.f14706f2);
                    org.telegram.messenger.at.f(this.X).n(this, org.telegram.messenger.at.f14712g2);
                    org.telegram.messenger.at.f(this.X).n(this, org.telegram.messenger.at.f14718h2);
                    org.telegram.messenger.at.f(this.X).n(this, org.telegram.messenger.at.f14726i4);
                    z90 z90Var = this.V0;
                    if (z90Var != null) {
                        z90Var.b();
                        this.V0 = null;
                    }
                    this.M = null;
                    try {
                        org.telegram.ui.ActionBar.z2 z2Var = this.f37682k0;
                        if (z2Var != null) {
                            z2Var.dismiss();
                            this.f37682k0 = null;
                        }
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    ArticleViewer$WindowView articleViewer$WindowView = this.f37677f0;
                    Property property = View.ALPHA;
                    animatorSet.playTogether(ObjectAnimator.ofFloat(articleViewer$WindowView, property, 0.0f), ObjectAnimator.ofFloat(this.f37678g0, property, 0.0f), ObjectAnimator.ofFloat(this.f37677f0, View.TRANSLATION_X, 0.0f, org.telegram.messenger.i0.L(56.0f)));
                    this.Z = 2;
                    this.f37670a0 = new y(this, 10);
                    animatorSet.setDuration(150L);
                    animatorSet.setInterpolator(this.f37674c0);
                    animatorSet.addListener(new bg.e(this, 24));
                    this.f37672b0 = System.currentTimeMillis();
                    this.f37678g0.setLayerType(2, null);
                    animatorSet.start();
                    while (true) {
                        a0.h hVar = this.D;
                        if (i10 < hVar.m()) {
                            w2 w2Var = (w2) hVar.n(i10);
                            Bitmap bitmap = w2Var.f42662b;
                            if (bitmap != null) {
                                bitmap.recycle();
                                w2Var.f42662b = null;
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

    public final void q() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f37675d0;
            if (i10 < arrayList.size()) {
                Object obj = arrayList.get(i10);
                if (obj instanceof x2) {
                    l3 l3Var = this.f37691u0[0];
                    if (l3Var != null && l3Var.K == obj) {
                        ((x2) obj).c(l3Var);
                    }
                    l3 l3Var2 = this.f37691u0[1];
                    if (l3Var2 != null && l3Var2.K == obj) {
                        ((x2) obj).c(l3Var2);
                    }
                    ((x2) obj).a();
                } else if (obj instanceof TLRPC.WebPage) {
                    org.telegram.ui.web.y1.o((TLRPC.WebPage) obj);
                }
                i10++;
            } else {
                arrayList.clear();
                r();
                return;
            }
        }
    }

    public final void r() {
        ArticleViewer$WindowView articleViewer$WindowView;
        if (this.L != null && (articleViewer$WindowView = this.f37677f0) != null) {
            if (this.K == null) {
                try {
                    if (articleViewer$WindowView.getParent() != null) {
                        ((WindowManager) this.L.getSystemService("window")).removeViewImmediate(this.f37677f0);
                    }
                    this.f37677f0 = null;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
            }
            for (int i10 = 0; i10 < this.N.size(); i10++) {
                ((r1) this.N.get(i10)).a(true);
            }
            this.N.clear();
            try {
                this.L.getWindow().clearFlags(128);
            } catch (Exception e7) {
                org.telegram.messenger.f8.g(e7, true);
            }
            this.L = null;
            this.M = null;
            f37648d1 = null;
        }
    }

    public h4(org.telegram.ui.ActionBar.k2 k2Var) {
        this.N = new ArrayList();
        this.Y = 1;
        this.f37674c0 = new DecelerateInterpolator(1.5f);
        this.f37675d0 = new ArrayList();
        this.f37693w0 = new Paint();
        this.f37694x0 = new Paint();
        this.f37695y0 = new Paint();
        this.A0 = new Paint();
        this.K0 = false;
        this.L0 = null;
        this.M0 = null;
        this.S0 = new e2.f(new int[]{org.telegram.messenger.at.f14779s, org.telegram.messenger.at.f14786t});
        this.T0 = new l0[2];
        this.X0 = -1;
        y yVar = new y(this, 4);
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        this.f37671a1 = new org.telegram.ui.Components.w4(yVar, 320L, grVar);
        this.f37673b1 = new org.telegram.ui.Components.w4(new y(this, 5), 320L, grVar);
        this.J = true;
        this.K = new u3(this, k2Var);
        W(k2Var.getParentActivity(), k2Var);
    }
}
