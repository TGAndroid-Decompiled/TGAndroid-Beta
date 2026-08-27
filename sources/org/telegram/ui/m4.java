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
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import android.text.style.URLSpan;
import android.util.Property;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewConfiguration;
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
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Stack;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Emoji;
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

    public static TextPaint f40311c1;

    public static TextPaint f40312d1;

    public static TextPaint f40313e1;

    public static TextPaint f40314f1;

    public static TextPaint f40315g1;

    public static TextPaint f40316h1;

    public static TextPaint f40317i1;

    public static TextPaint f40318j1;

    public static Paint f40319k1;
    public static Paint l1;

    public static Paint f40320m1;

    public static Paint f40321n1;

    public static Paint f40322o1;

    public static Paint f40323p1;

    public static Paint f40324q1;

    public static Paint f40325r1;

    public static Paint f40326s1;

    public static Paint f40327t1;

    public static Paint f40328u1;

    public static Paint f40329v1;

    public static Paint f40331x1;
    public org.telegram.ui.Components.i81 A0;
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
    public org.telegram.ui.ActionBar.n2 I;
    public we.d I0;
    public final ArrayList J;
    public int J0;
    public View K;
    public org.telegram.ui.Cells.j9 K0;
    public FrameLayout L;
    public org.telegram.ui.Cells.j9 L0;
    public TextureView M;
    public ou0 M0;
    public c5.c N;
    public final AnimationNotificationsLocker N0;
    public WebChromeClient.CustomViewCallback O;
    public final n0[] O0;
    public WindowInsets P;
    public boolean P0;
    public boolean Q;
    public gf.t0 Q0;
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

    public WindowManager.LayoutParams f40332a0;

    public ArticleViewer$WindowView f40333b0;

    public n0 f40334c0;

    public o0 f40335d0;

    public org.telegram.ui.web.l f40336e0;

    public d0 f40337f0;

    public org.telegram.ui.ActionBar.e3 f40338g0;

    public Paint f40339h0;

    public Drawable f40340i0;

    public Paint f40341j0;

    public boolean f40342k0;

    public float f40343l0;
    public ag.d m0;

    public ImageView f40344n0;

    public ImageView f40345o0;

    public org.telegram.ui.Components.j6 f40346p0;

    public q3[] f40347q0;

    public AnimatorSet f40348r0;

    public final Paint f40349s0;

    public final Paint f40350t0;

    public final Paint f40351u0;

    public final Paint f40352v0;

    public ActionBarPopupWindow$ActionBarPopupWindowLayout f40353w0;

    public TextView f40354x0;

    public Rect f40355y0;

    public org.telegram.ui.Components.i81 f40356z0;
    public static final HashSet X0 = new HashSet();
    public static volatile m4 Y0 = null;
    public static final w0 Z0 = new w0("innerTranslationX", 0);

    public static final TextPaint f40309a1 = new TextPaint(1);

    public static final u3 f40310b1 = new u3();

    public static final WeakHashMap f40330w1 = new WeakHashMap();

    public m4() {
        this.J = new ArrayList();
        this.U = 1;
        this.Y = new DecelerateInterpolator(1.5f);
        this.Z = new ArrayList();
        this.f40349s0 = new Paint();
        this.f40350t0 = new Paint();
        this.f40351u0 = new Paint();
        this.f40352v0 = new Paint();
        this.F0 = false;
        this.G0 = null;
        this.H0 = null;
        this.N0 = new AnimationNotificationsLocker(new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats});
        this.O0 = new n0[2];
        this.S0 = -1;
        d0 d0Var = new d0(this, 2);
        org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.h;
        this.V0 = new org.telegram.ui.Components.b5(d0Var, 320L, erVar);
        this.W0 = new org.telegram.ui.Components.b5(new d0(this, 4), 320L, erVar);
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
        }
        if (richText instanceof TL_iv.textSubscript) {
            return A(((TL_iv.textSubscript) richText).text);
        }
        if (richText instanceof TL_iv.textSuperscript) {
            return A(((TL_iv.textSuperscript) richText).text);
        }
        if (richText instanceof TL_iv.textMarked) {
            return A(((TL_iv.textMarked) richText).text);
        }
        if (richText instanceof TL_iv.textPhone) {
            return A(((TL_iv.textPhone) richText).text);
        }
        return richText instanceof TL_iv.textSpoiler ? A(((TL_iv.textSpoiler) richText).text) : richText;
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
        }
        if (richText instanceof TL_iv.textSubscript) {
            return B(((TL_iv.textSubscript) richText).text);
        }
        if (richText instanceof TL_iv.textSuperscript) {
            return B(((TL_iv.textSuperscript) richText).text);
        }
        if (richText instanceof TL_iv.textMarked) {
            return B(((TL_iv.textMarked) richText).text);
        }
        return richText instanceof TL_iv.textPhone ? B(((TL_iv.textPhone) richText).text) : "";
    }

    public static CharSequence C(d70 d70Var, TLRPC.WebPage webPage, View view, TL_iv.RichText richText, TL_iv.RichText richText2, TL_iv.PageBlock pageBlock, int i10) {
        TextPaint textPaintE;
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
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.tz0((metricAffectingSpanArr == null || metricAffectingSpanArr.length == 0) ? E(d70Var, richText, richText2, pageBlock) : null, "mailto:" + F(richText2)), 0, spannableStringBuilder.length(), 33);
            }
            return spannableStringBuilder;
        }
        long j10 = 0;
        if (richText2 instanceof TL_iv.textUrl) {
            TL_iv.textUrl texturl = (TL_iv.textUrl) richText2;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(C(d70Var, webPage, view, richText, texturl.text, pageBlock, i10));
            MetricAffectingSpan[] metricAffectingSpanArr2 = (MetricAffectingSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), MetricAffectingSpan.class);
            textPaintE = (metricAffectingSpanArr2 == null || metricAffectingSpanArr2.length == 0) ? E(d70Var, richText, richText2, pageBlock) : null;
            Object uz0Var = texturl.webpage_id != 0 ? new org.telegram.ui.Components.uz0(textPaintE, F(richText2)) : new org.telegram.ui.Components.tz0(textPaintE, F(richText2));
            if (spannableStringBuilder2.length() != 0) {
                spannableStringBuilder2.setSpan(uz0Var, 0, spannableStringBuilder2.length(), 33);
            }
            return spannableStringBuilder2;
        }
        if (richText2 instanceof TL_iv.textPlain) {
            return ((TL_iv.textPlain) richText2).text;
        }
        if (richText2 instanceof TL_iv.textAnchor) {
            TL_iv.textAnchor textanchor = (TL_iv.textAnchor) richText2;
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(C(d70Var, webPage, view, richText, textanchor.text, pageBlock, i10));
            String str = textanchor.name;
            org.telegram.ui.Components.z4 z4Var = new org.telegram.ui.Components.z4();
            z4Var.f35146a = str.toLowerCase();
            spannableStringBuilder3.setSpan(z4Var, 0, spannableStringBuilder3.length(), 17);
            return spannableStringBuilder3;
        }
        if (richText2 instanceof TL_iv.textEmpty) {
            return "";
        }
        if (richText2 instanceof TL_iv.textConcat) {
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
            int size = richText2.texts.size();
            int i11 = 0;
            while (i11 < size) {
                TL_iv.RichText richText3 = richText2.texts.get(i11);
                TL_iv.RichText richTextA = A(richText3);
                boolean z10 = i10 >= 0 && (richText3 instanceof TL_iv.textUrl) && ((TL_iv.textUrl) richText3).webpage_id != j10;
                if (z10 && spannableStringBuilder4.length() != 0 && spannableStringBuilder4.charAt(spannableStringBuilder4.length() - 1) != '\n') {
                    spannableStringBuilder4.append((CharSequence) " ");
                    spannableStringBuilder4.setSpan(new org.telegram.ui.Cells.l9(), spannableStringBuilder4.length() - 1, spannableStringBuilder4.length(), 33);
                }
                CharSequence charSequenceC = C(d70Var, webPage, view, richText, richText3, pageBlock, i10);
                int iD = D(richTextA);
                int length = spannableStringBuilder4.length();
                spannableStringBuilder4.append(charSequenceC);
                if (iD != 0 && !(charSequenceC instanceof SpannableStringBuilder)) {
                    if ((iD & 8) != 0 || (iD & 512) != 0) {
                        String strF = F(richText3);
                        if (strF == null) {
                            strF = F(richText);
                        }
                        Object uz0Var2 = (iD & 512) != 0 ? new org.telegram.ui.Components.uz0(E(d70Var, richText, richTextA, pageBlock), strF) : new org.telegram.ui.Components.tz0(E(d70Var, richText, richTextA, pageBlock), strF);
                        if (length != spannableStringBuilder4.length()) {
                            spannableStringBuilder4.setSpan(uz0Var2, length, spannableStringBuilder4.length(), 33);
                        }
                    } else if (length != spannableStringBuilder4.length()) {
                        TextPaint textPaintE2 = E(d70Var, richText, richTextA, pageBlock);
                        org.telegram.ui.Components.sz0 sz0Var = new org.telegram.ui.Components.sz0();
                        sz0Var.f32600a = textPaintE2;
                        spannableStringBuilder4.setSpan(sz0Var, length, spannableStringBuilder4.length(), 33);
                    }
                }
                if (z10 && i11 != size - 1) {
                    spannableStringBuilder4.append((CharSequence) " ");
                    spannableStringBuilder4.setSpan(new org.telegram.ui.Cells.l9(), spannableStringBuilder4.length() - 1, spannableStringBuilder4.length(), 33);
                }
                i11++;
                j10 = 0;
            }
            return spannableStringBuilder4;
        }
        if (richText2 instanceof TL_iv.textSubscript) {
            return C(d70Var, webPage, view, richText, ((TL_iv.textSubscript) richText2).text, pageBlock, i10);
        }
        if (richText2 instanceof TL_iv.textSuperscript) {
            return C(d70Var, webPage, view, richText, ((TL_iv.textSuperscript) richText2).text, pageBlock, i10);
        }
        if (richText2 instanceof TL_iv.textMarked) {
            SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(C(d70Var, webPage, view, richText, ((TL_iv.textMarked) richText2).text, pageBlock, i10));
            MetricAffectingSpan[] metricAffectingSpanArr3 = (MetricAffectingSpan[]) spannableStringBuilder5.getSpans(0, spannableStringBuilder5.length(), MetricAffectingSpan.class);
            if (spannableStringBuilder5.length() != 0) {
                textPaintE = (metricAffectingSpanArr3 == null || metricAffectingSpanArr3.length == 0) ? E(d70Var, richText, richText2, pageBlock) : null;
                org.telegram.ui.Components.rz0 rz0Var = new org.telegram.ui.Components.rz0();
                rz0Var.f32281a = textPaintE;
                spannableStringBuilder5.setSpan(rz0Var, 0, spannableStringBuilder5.length(), 33);
            }
            return spannableStringBuilder5;
        }
        if (richText2 instanceof TL_iv.textSpoiler) {
            SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder(C(d70Var, webPage, view, richText, ((TL_iv.textSpoiler) richText2).text, pageBlock, i10));
            if (spannableStringBuilder6.length() != 0) {
                org.telegram.ui.Components.xz0 xz0Var = new org.telegram.ui.Components.xz0();
                xz0Var.f34734a |= 256;
                spannableStringBuilder6.setSpan(new org.telegram.ui.Components.yz0(xz0Var, 0), 0, spannableStringBuilder6.length(), 33);
            }
            return spannableStringBuilder6;
        }
        if (richText2 instanceof TL_iv.textPhone) {
            SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder(C(d70Var, webPage, view, richText, ((TL_iv.textPhone) richText2).text, pageBlock, i10));
            MetricAffectingSpan[] metricAffectingSpanArr4 = (MetricAffectingSpan[]) spannableStringBuilder7.getSpans(0, spannableStringBuilder7.length(), MetricAffectingSpan.class);
            if (spannableStringBuilder7.length() != 0) {
                spannableStringBuilder7.setSpan(new org.telegram.ui.Components.tz0((metricAffectingSpanArr4 == null || metricAffectingSpanArr4.length == 0) ? E(d70Var, richText, richText2, pageBlock) : null, "tel:" + F(richText2)), 0, spannableStringBuilder7.length(), 33);
            }
            return spannableStringBuilder7;
        }
        if (richText2 instanceof TL_iv.textImage) {
            TL_iv.textImage textimage = (TL_iv.textImage) richText2;
            TLRPC.Document documentA = j4.a(webPage, textimage.document_id);
            TLRPC.Photo photoE = j4.e(webPage, textimage.photo_id);
            if (documentA != null) {
                SpannableStringBuilder spannableStringBuilder8 = new SpannableStringBuilder("*");
                int iDp = AndroidUtilities.dp(textimage.f22604w);
                int iDp2 = AndroidUtilities.dp(textimage.h);
                int iAbs = Math.abs(i10);
                if (iDp > iAbs) {
                    iDp2 = (int) (iDp2 * (iAbs / iDp));
                    iDp = iAbs;
                }
                if (view != null) {
                    int i12 = org.telegram.ui.ActionBar.g6.f23053d6;
                    ((m4) d70Var).getClass();
                    boolean z11 = AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.w0(null, i12, false)) <= 0.705f;
                    org.telegram.ui.Components.qz0 qz0Var = new org.telegram.ui.Components.qz0();
                    Locale locale = Locale.US;
                    String str2 = iDp + "_" + iDp2 + "_i";
                    qz0Var.f32010b = iDp;
                    qz0Var.f32011c = iDp2;
                    boolean z12 = z11;
                    ImageReceiver imageReceiver = new ImageReceiver(view);
                    qz0Var.f32009a = imageReceiver;
                    imageReceiver.setInvalidateAll(true);
                    if (z12) {
                        imageReceiver.setDelegate(new org.telegram.ui.Components.pc0(17));
                    }
                    imageReceiver.setImage(ImageLocation.getForDocument(documentA), str2, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(documentA.thumbs, 90), documentA), str2, -1L, null, webPage, 1);
                    spannableStringBuilder8.setSpan(qz0Var, 0, spannableStringBuilder8.length(), 33);
                }
                return spannableStringBuilder8;
            }
            if (photoE instanceof org.telegram.ui.web.d2) {
                org.telegram.ui.web.d2 d2Var = (org.telegram.ui.web.d2) photoE;
                SpannableStringBuilder spannableStringBuilder9 = new SpannableStringBuilder("*");
                int iDp3 = AndroidUtilities.dp(textimage.f22604w);
                int iDp4 = AndroidUtilities.dp(textimage.h);
                int iAbs2 = Math.abs(i10);
                if (iDp3 > iAbs2) {
                    iDp4 = (int) (iDp4 * (iAbs2 / iDp3));
                    iDp3 = iAbs2;
                }
                if (view != null) {
                    org.telegram.ui.Components.qz0 qz0Var2 = new org.telegram.ui.Components.qz0();
                    qz0Var2.f32010b = iDp3;
                    qz0Var2.f32011c = iDp4;
                    ImageReceiver imageReceiver2 = new ImageReceiver(view);
                    qz0Var2.f32009a = imageReceiver2;
                    imageReceiver2.setInvalidateAll(true);
                    org.telegram.ui.web.e2.g(d2Var, imageReceiver2, new org.telegram.ui.Components.gc(12));
                    spannableStringBuilder9.setSpan(qz0Var2, 0, spannableStringBuilder9.length(), 33);
                }
                return spannableStringBuilder9;
            }
        } else {
            if (!(richText2 instanceof TL_iv.textMath)) {
                return "not supported " + richText2;
            }
            TL_iv.textMath textmath = (TL_iv.textMath) richText2;
            if (textmath.bitmap == null && !textmath.tried) {
                textmath.tried = true;
                rh.q qVarA = rh.q.a(textmath.source, AndroidUtilities.dp(20.0f), true);
                if (qVarA != null) {
                    textmath.f22605w = qVarA.f47382b;
                    textmath.h = qVarA.f47383c;
                    textmath.depth = qVarA.d;
                    textmath.bitmap = qVarA.f47381a;
                }
            }
            if (textmath.bitmap != null) {
                SpannableStringBuilder spannableStringBuilder10 = new SpannableStringBuilder("￼");
                Bitmap bitmap = textmath.bitmap;
                int i13 = textmath.f22605w;
                int i14 = textmath.h;
                int i15 = org.telegram.ui.ActionBar.g6.G6;
                ((m4) d70Var).getClass();
                spannableStringBuilder10.setSpan(new org.telegram.ui.Components.qz0(view, bitmap, i13, i14, org.telegram.ui.ActionBar.g6.w0(null, i15, false), textmath.depth), 0, spannableStringBuilder10.length(), 33);
                String str3 = textmath.source;
                if (str3 != null && !str3.isEmpty()) {
                    spannableStringBuilder10.setSpan(new org.telegram.ui.Cells.p9(textmath.source), 0, spannableStringBuilder10.length(), 33);
                }
                return spannableStringBuilder10;
            }
            String str4 = textmath.source;
            if (str4 != null) {
                return str4;
            }
        }
        return "";
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
            return ((TL_iv.textUrl) richText).webpage_id != 0 ? D(richText.parentRichText) | 512 : D(richText.parentRichText) | 8;
        }
        if (richText instanceof TL_iv.textSubscript) {
            return D(richText.parentRichText) | 128;
        }
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

    public static TextPaint E(d70 d70Var, TL_iv.RichText richText, TL_iv.RichText richText2, TL_iv.PageBlock pageBlock) {
        int iB;
        int iDp;
        int iDp2;
        int iDp3;
        int iDp4;
        int iDp5;
        int iDp6;
        int iDp7;
        int iD = D(richText2);
        int iDp8 = AndroidUtilities.dp(14.0f);
        m4 m4Var = (m4) d70Var;
        m4Var.getClass();
        u3 u3Var = f40310b1;
        u3Var.getClass();
        SparseArray sparseArray = u3Var.f43100x;
        SparseArray sparseArray2 = u3Var.f43099w;
        SparseArray sparseArray3 = u3Var.f43097t;
        SparseArray sparseArray4 = u3Var.f43082c;
        SparseArray sparseArray5 = u3Var.f43081b;
        int iDp9 = AndroidUtilities.dp(SharedConfig.ivFontSize - 16);
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            TL_iv.RichText richText3 = ((TL_iv.pageBlockPhoto) pageBlock).caption.text;
            if (richText3 == richText2 || richText3 == richText) {
                iDp7 = AndroidUtilities.dp(14.0f);
                sparseArray4 = sparseArray5;
            } else {
                iDp7 = AndroidUtilities.dp(12.0f);
            }
            iDp8 = iDp7;
            iB = d70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockMap) {
            TL_iv.RichText richText4 = ((TL_iv.pageBlockMap) pageBlock).caption.text;
            if (richText4 == richText2 || richText4 == richText) {
                iDp6 = AndroidUtilities.dp(14.0f);
                sparseArray4 = sparseArray5;
            } else {
                iDp6 = AndroidUtilities.dp(12.0f);
            }
            iDp8 = iDp6;
            iB = d70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockTitle) {
            sparseArray4 = u3Var.d;
            iDp8 = AndroidUtilities.dp(23.0f);
            iB = d70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockKicker) {
            sparseArray4 = u3Var.f43083e;
            iDp8 = AndroidUtilities.dp(14.0f);
            iB = d70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockAuthorDate) {
            sparseArray4 = u3Var.f43092o;
            iDp8 = AndroidUtilities.dp(14.0f);
            iB = d70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockFooter) {
            sparseArray4 = u3Var.f43093p;
            iDp8 = AndroidUtilities.dp(14.0f);
            iB = d70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockSubtitle) {
            sparseArray4 = u3Var.f43085g;
            iDp8 = AndroidUtilities.dp(20.0f);
            iB = d70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeader) {
            sparseArray4 = u3Var.f43084f;
            iDp8 = AndroidUtilities.dp(20.0f);
            iB = d70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockSubheader) {
            sparseArray4 = u3Var.h;
            iDp8 = AndroidUtilities.dp(17.0f);
            iB = d70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading1) {
            sparseArray4 = u3Var.f43086i;
            iDp8 = AndroidUtilities.dp(18.0f);
            iB = d70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading2) {
            sparseArray4 = u3Var.f43087j;
            iDp8 = AndroidUtilities.dp(16.0f);
            iB = d70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading3) {
            sparseArray4 = u3Var.f43088k;
            iDp8 = AndroidUtilities.dp(15.0f);
            iB = d70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading4) {
            sparseArray4 = u3Var.f43089l;
            iDp8 = AndroidUtilities.dp(14.0f);
            iB = d70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading5) {
            sparseArray4 = u3Var.f43090m;
            iDp8 = AndroidUtilities.dp(13.0f);
            iB = d70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading6) {
            sparseArray4 = u3Var.f43091n;
            iDp8 = AndroidUtilities.dp(12.0f);
            iB = d70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) pageBlock;
            if (pageblockblockquote.text == richText) {
                iDp8 = AndroidUtilities.dp(15.0f);
                iB = d70Var.b();
            } else if (pageblockblockquote.caption == richText) {
                iDp8 = AndroidUtilities.dp(14.0f);
                iB = d70Var.a();
                sparseArray3 = sparseArray5;
            } else {
                iB = -65536;
                sparseArray3 = null;
            }
            sparseArray4 = sparseArray3;
        } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            TL_iv.pageBlockPullquote pageblockpullquote = (TL_iv.pageBlockPullquote) pageBlock;
            if (pageblockpullquote.text == richText) {
                iDp8 = AndroidUtilities.dp(15.0f);
                iB = d70Var.b();
            } else if (pageblockpullquote.caption == richText) {
                iDp8 = AndroidUtilities.dp(14.0f);
                iB = d70Var.a();
                sparseArray3 = sparseArray5;
            } else {
                iB = -65536;
                sparseArray3 = null;
            }
            sparseArray4 = sparseArray3;
        } else if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
            sparseArray4 = u3Var.f43096s;
            iDp8 = AndroidUtilities.dp(14.0f);
            iB = d70Var.b();
            iD |= 4;
        } else if (pageBlock instanceof TL_iv.pageBlockParagraph) {
            sparseArray4 = u3Var.f43094q;
            iDp8 = AndroidUtilities.dp(16.0f);
            iB = d70Var.b();
        } else if (L(pageBlock)) {
            sparseArray4 = u3Var.f43095r;
            iDp8 = AndroidUtilities.dp(16.0f);
            iB = d70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockEmbed) {
            TL_iv.RichText richText5 = ((TL_iv.pageBlockEmbed) pageBlock).caption.text;
            if (richText5 == richText2 || richText5 == richText) {
                iDp5 = AndroidUtilities.dp(14.0f);
                sparseArray4 = sparseArray5;
            } else {
                iDp5 = AndroidUtilities.dp(12.0f);
            }
            iDp8 = iDp5;
            iB = d70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
            TL_iv.RichText richText6 = ((TL_iv.pageBlockSlideshow) pageBlock).caption.text;
            if (richText6 == richText2 || richText6 == richText) {
                iDp4 = AndroidUtilities.dp(14.0f);
                sparseArray4 = sparseArray5;
            } else {
                iDp4 = AndroidUtilities.dp(12.0f);
            }
            iDp8 = iDp4;
            iB = d70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockCollage) {
            TL_iv.RichText richText7 = ((TL_iv.pageBlockCollage) pageBlock).caption.text;
            if (richText7 == richText2 || richText7 == richText) {
                iDp3 = AndroidUtilities.dp(14.0f);
                sparseArray4 = sparseArray5;
            } else {
                iDp3 = AndroidUtilities.dp(12.0f);
            }
            iDp8 = iDp3;
            iB = d70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockEmbedPost) {
            TL_iv.PageCaption pageCaption = ((TL_iv.pageBlockEmbedPost) pageBlock).caption;
            if (richText2 == pageCaption.text) {
                iDp8 = AndroidUtilities.dp(14.0f);
                iB = d70Var.a();
                sparseArray4 = sparseArray5;
            } else if (richText2 == pageCaption.credit) {
                iDp8 = AndroidUtilities.dp(12.0f);
                iB = d70Var.a();
            } else if (richText2 != null) {
                sparseArray4 = u3Var.f43098u;
                iDp8 = AndroidUtilities.dp(14.0f);
                iB = d70Var.b();
            } else {
                iB = -65536;
                sparseArray4 = null;
            }
        } else {
            if (pageBlock instanceof TL_iv.pageBlockVideo) {
                if (richText2 == ((TL_iv.pageBlockVideo) pageBlock).caption.text) {
                    iDp2 = AndroidUtilities.dp(14.0f);
                    sparseArray = sparseArray2;
                } else {
                    iDp2 = AndroidUtilities.dp(12.0f);
                }
                iDp8 = iDp2;
                iB = d70Var.b();
            } else if (pageBlock instanceof TL_iv.pageBlockAudio) {
                if (richText2 == ((TL_iv.pageBlockAudio) pageBlock).caption.text) {
                    iDp = AndroidUtilities.dp(14.0f);
                    sparseArray = sparseArray2;
                } else {
                    iDp = AndroidUtilities.dp(12.0f);
                }
                iDp8 = iDp;
                iB = d70Var.b();
            } else if (pageBlock instanceof TL_iv.pageBlockRelatedArticles) {
                sparseArray4 = u3Var.f43101y;
                iDp8 = AndroidUtilities.dp(15.0f);
                iB = d70Var.a();
            } else if (pageBlock instanceof TL_iv.pageBlockDetails) {
                sparseArray4 = u3Var.f43102z;
                iDp8 = AndroidUtilities.dp(15.0f);
                iB = d70Var.b();
            } else if (pageBlock instanceof TL_iv.pageBlockTable) {
                sparseArray4 = u3Var.A;
                iDp8 = AndroidUtilities.dp(15.0f);
                iB = d70Var.b();
            } else {
                iB = -65536;
                sparseArray4 = null;
            }
            sparseArray4 = sparseArray;
        }
        int i10 = iD & 256;
        if (i10 != 0 || (iD & 128) != 0) {
            iDp8 -= AndroidUtilities.dp(4.0f);
        }
        if (sparseArray4 == null) {
            if (u3Var.f43080a == null) {
                TextPaint textPaint = new TextPaint(1);
                u3Var.f43080a = textPaint;
                textPaint.setColor(-65536);
            }
            u3Var.f43080a.setTextSize(AndroidUtilities.dp(14.0f));
            return u3Var.f43080a;
        }
        TextPaint textPaint2 = (TextPaint) sparseArray4.get(iD);
        if (textPaint2 == null) {
            textPaint2 = new TextPaint(1);
            if ((iD & 4) != 0) {
                textPaint2.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
            } else if (pageBlock instanceof TL_iv.pageBlockRelatedArticles) {
                textPaint2.setTypeface(AndroidUtilities.bold());
            } else if (d70Var.f37284a != 1 && !(pageBlock instanceof TL_iv.pageBlockTitle) && !(pageBlock instanceof TL_iv.pageBlockKicker) && !(pageBlock instanceof TL_iv.pageBlockHeader) && !(pageBlock instanceof TL_iv.pageBlockSubtitle) && !(pageBlock instanceof TL_iv.pageBlockSubheader) && !K(pageBlock)) {
                int i11 = iD & 1;
                if (i11 != 0 && (iD & 2) != 0) {
                    textPaint2.setTypeface(AndroidUtilities.getTypeface("fonts/rmediumitalic.ttf"));
                } else if (i11 != 0) {
                    textPaint2.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
                } else if ((iD & 2) != 0) {
                    textPaint2.setTypeface(AndroidUtilities.getTypeface("fonts/ritalic.ttf"));
                }
            } else if ((pageBlock instanceof TL_iv.pageBlockTitle) || (pageBlock instanceof TL_iv.pageBlockHeader) || (pageBlock instanceof TL_iv.pageBlockSubtitle) || (pageBlock instanceof TL_iv.pageBlockSubheader) || K(pageBlock)) {
                textPaint2.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
            } else {
                int i12 = iD & 1;
                if (i12 != 0 && (iD & 2) != 0) {
                    textPaint2.setTypeface(Typeface.create("serif", 3));
                } else if (i12 != 0) {
                    textPaint2.setTypeface(Typeface.create("serif", 1));
                } else if ((iD & 2) != 0) {
                    textPaint2.setTypeface(Typeface.create("serif", 2));
                } else {
                    textPaint2.setTypeface(Typeface.create("serif", 0));
                }
            }
            if ((iD & 32) != 0) {
                textPaint2.setFlags(textPaint2.getFlags() | 16);
            }
            if ((iD & 16) != 0) {
                textPaint2.setFlags(textPaint2.getFlags() | 8);
            }
            if ((iD & 8) != 0 || (iD & 512) != 0) {
                textPaint2.setFlags(textPaint2.getFlags());
                m4Var.getClass();
                iB = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.J6, false);
            }
            if (i10 != 0) {
                textPaint2.baselineShift -= AndroidUtilities.dp(6.0f);
            } else if ((iD & 128) != 0) {
                textPaint2.baselineShift = AndroidUtilities.dp(2.0f) + textPaint2.baselineShift;
            }
            textPaint2.setColor(iB);
            sparseArray4.put(iD, textPaint2);
        }
        textPaint2.setTextSize(iDp8 + iDp9);
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
        return Y0 != null;
    }

    public static boolean K(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6);
    }

    public static boolean L(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof c4) || (pageBlock instanceof e4);
    }

    public static boolean O(a4 a4Var) {
        boolean z10;
        TL_iv.PageBlock pageBlockZ = z(a4Var.f36369a);
        if (pageBlockZ instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlockZ;
            if (!pageblockdetails.open) {
                pageblockdetails.open = true;
                return true;
            }
        } else if (pageBlockZ instanceof a4) {
            a4 a4Var2 = (a4) pageBlockZ;
            TL_iv.PageBlock pageBlockZ2 = z(a4Var2.f36370b);
            if (pageBlockZ2 instanceof TL_iv.pageBlockDetails) {
                TL_iv.pageBlockDetails pageblockdetails2 = (TL_iv.pageBlockDetails) pageBlockZ2;
                if (pageblockdetails2.open) {
                    z10 = false;
                } else {
                    pageblockdetails2.open = true;
                    z10 = true;
                }
            } else {
                z10 = false;
            }
            if (O(a4Var2) || z10) {
                return true;
            }
        }
        return false;
    }

    public static void T(d70 d70Var) {
        if (d70Var.f37285b == null && d70Var.f37288f == null) {
            return;
        }
        View view = d70Var.f37288f;
        d70Var.f37286c.d(true);
        d70Var.f37285b = null;
        d70Var.d = null;
        d70Var.f37288f = null;
        if (view != null) {
            view.invalidate();
        }
    }

    public static WindowInsets e(WindowInsets windowInsets) {
        return Build.VERSION.SDK_INT >= 30 ? WindowInsets.CONSUMED : windowInsets.consumeSystemWindowInsets();
    }

    public static void f(String str, int i10, FrameLayout frameLayout, z3 z3Var, org.telegram.ui.ActionBar.c6 c6Var) {
        String strS = org.telegram.ui.web.z0.s(str);
        long clientUserId = UserConfig.getInstance(i10).getClientUserId();
        SendMessagesHelper.getInstance(i10).sendMessage(SendMessagesHelper.SendMessageParams.of(strS, clientUserId));
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
        tL_message.peer_id = tL_peerUser;
        tL_peerUser.user_id = clientUserId;
        TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
        tL_message.from_id = tL_peerUser2;
        tL_peerUser2.user_id = clientUserId;
        tL_message.message = strS;
        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
        tL_message.media = tL_messageMediaWebPage;
        tL_messageMediaWebPage.webpage = new TLRPC.TL_webPage();
        TLRPC.WebPage webPage = tL_message.media.webpage;
        webPage.url = strS;
        webPage.display_url = strS;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.bookmarkAdded, new MessageObject(i10, tL_message, false, false));
        new org.telegram.ui.Components.mc(frameLayout, c6Var).Q(R.raw.saved_messages, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.WebBookmarkedToast), new cg.b2(z3Var, clientUserId, 20))).k(true);
    }

    public static void g0(m4 m4Var) {
        TextPaint textPaint = f40317i1;
        if (textPaint != null) {
            textPaint.setColor(m4Var.b());
        }
        TextPaint textPaint2 = f40318j1;
        if (textPaint2 != null) {
            textPaint2.setColor(m4Var.b());
        }
        TextPaint textPaint3 = f40311c1;
        if (textPaint3 != null) {
            textPaint3.setColor(m4Var.b());
        }
        TextPaint textPaint4 = f40313e1;
        if (textPaint4 != null) {
            textPaint4.setColor(m4Var.b());
        }
        TextPaint textPaint5 = f40314f1;
        if (textPaint5 != null) {
            textPaint5.setColor(-1);
        }
        TextPaint textPaint6 = f40315g1;
        if (textPaint6 != null) {
            textPaint6.setColor(m4Var.b());
        }
        TextPaint textPaint7 = f40316h1;
        if (textPaint7 != null) {
            textPaint7.setColor(m4Var.a());
        }
        TextPaint textPaint8 = f40312d1;
        if (textPaint8 != null) {
            textPaint8.setColor(m4Var.a());
        }
        r(m4Var, true);
        u3 u3Var = f40310b1;
        u3.a(m4Var, u3Var.d);
        u3.a(m4Var, u3Var.f43083e);
        u3.a(m4Var, u3Var.f43085g);
        u3.a(m4Var, u3Var.f43084f);
        u3.a(m4Var, u3Var.h);
        u3.a(m4Var, u3Var.f43086i);
        u3.a(m4Var, u3Var.f43087j);
        u3.a(m4Var, u3Var.f43088k);
        u3.a(m4Var, u3Var.f43089l);
        u3.a(m4Var, u3Var.f43090m);
        u3.a(m4Var, u3Var.f43091n);
        u3.a(m4Var, u3Var.f43097t);
        u3.a(m4Var, u3Var.f43096s);
        u3.a(m4Var, u3Var.f43094q);
        u3.a(m4Var, u3Var.f43095r);
        u3.a(m4Var, u3Var.f43098u);
        u3.a(m4Var, u3Var.f43099w);
        u3.a(m4Var, u3Var.f43100x);
        u3.a(m4Var, u3Var.f43081b);
        u3.a(m4Var, u3Var.f43082c);
        u3.a(m4Var, u3Var.f43092o);
        u3.a(m4Var, u3Var.f43093p);
        u3.a(m4Var, u3Var.v);
        u3.a(m4Var, u3Var.f43101y);
        u3.a(m4Var, u3Var.f43102z);
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
        CharSequence charSequence;
        if (f3Var == null || (staticLayout = f3Var.d) == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = f3Var.f37926y;
        if (spannableStringBuilder != null) {
            return spannableStringBuilder;
        }
        CharSequence text = staticLayout.getText();
        if (!(text instanceof Spannable)) {
            return text;
        }
        Spannable spannable = (Spannable) text;
        org.telegram.ui.Components.tz0[] tz0VarArr = (org.telegram.ui.Components.tz0[]) spannable.getSpans(0, spannable.length(), org.telegram.ui.Components.tz0.class);
        if (tz0VarArr != null && tz0VarArr.length != 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannable);
            for (org.telegram.ui.Components.tz0 tz0Var : tz0VarArr) {
                int spanStart = spannableStringBuilder2.getSpanStart(tz0Var);
                int spanEnd = spannableStringBuilder2.getSpanEnd(tz0Var);
                if (spanStart < 0) {
                    charSequence = text;
                    charSequence = text;
                } else if (spanEnd > spanStart) {
                    spannableStringBuilder2.setSpan(new r0(d70Var, k4Var, tz0Var, 0), spanStart, spanEnd, 33);
                }
            }
            charSequence = text;
            charSequence = text;
            f3Var.f37926y = spannableStringBuilder2;
            charSequence = spannableStringBuilder2;
        }
        charSequence = text;
        charSequence = text;
        charSequence = text;
        return charSequence;
    }

    public static TL_iv.PageBlock j0(TL_iv.PageBlock pageBlock, a4 a4Var) {
        if (pageBlock instanceof c4) {
            c4 c4Var = (c4) pageBlock;
            c4 c4Var2 = new c4();
            c4Var2.f36928a = c4Var.f36928a;
            c4Var2.f36929b = c4Var.f36929b;
            c4Var2.f36930c = c4Var.f36930c;
            c4Var2.d = j0(c4Var.d, a4Var);
            return c4Var2;
        }
        if (!(pageBlock instanceof e4)) {
            return a4Var;
        }
        e4 e4Var = (e4) pageBlock;
        e4 e4Var2 = new e4();
        e4Var2.f37613a = e4Var.f37613a;
        e4Var2.f37614b = e4Var.f37614b;
        e4Var2.f37615c = e4Var.f37615c;
        e4Var2.d = j0(e4Var.d, a4Var);
        return e4Var2;
    }

    public static boolean l(d70 d70Var, k4 k4Var, MotionEvent motionEvent, View view, f3 f3Var, int i10, int i11) {
        org.telegram.ui.Cells.j9 j9Var;
        m4 m4Var;
        Object obj;
        m4 m4Var2;
        org.telegram.ui.Cells.j9 j9Var2;
        org.telegram.ui.ActionBar.n1 n1Var;
        org.telegram.ui.Components.yz0[] yz0VarArr;
        boolean z10 = ((m4) d70Var).f40348r0 == null;
        org.telegram.ui.Components.m80 m80Var = d70Var.f37286c;
        if (!z10 || view == null) {
            return false;
        }
        m4 m4Var3 = (m4) d70Var;
        if (view.getTag() == null || view.getTag() != "bottomSheet" || (j9Var = m4Var3.L0) == null) {
            j9Var = m4Var3.K0;
        }
        if (j9Var != null && !j9Var.g0(view)) {
            return false;
        }
        d70Var.f37288f = view;
        if (f3Var != null) {
            StaticLayout staticLayout = f3Var.d;
            int x8 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (motionEvent.getAction() == 0) {
                int lineCount = staticLayout.getLineCount();
                float fMin = 2.1474836E9f;
                float fMax = 0.0f;
                for (int i12 = 0; i12 < lineCount; i12++) {
                    fMax = Math.max(staticLayout.getLineWidth(i12), fMax);
                    fMin = Math.min(staticLayout.getLineLeft(i12), fMin);
                }
                float f10 = x8;
                float f11 = i10 + fMin;
                if (f10 < f11 || f10 > f11 + fMax || y10 < i11 || y10 > staticLayout.getHeight() + i11) {
                    m4Var = m4Var3;
                    obj = "bottomSheet";
                } else {
                    d70Var.d = f3Var;
                    d70Var.f37287e = i11;
                    if (staticLayout.getText() instanceof Spannable) {
                        int i13 = x8 - i10;
                        int i14 = y10 - i11;
                        try {
                            int lineForVertical = staticLayout.getLineForVertical(i14);
                            float f12 = i13;
                            int offsetForHorizontal = staticLayout.getOffsetForHorizontal(lineForVertical, f12);
                            float lineLeft = staticLayout.getLineLeft(lineForVertical);
                            if (lineLeft > f12 || lineLeft + staticLayout.getLineWidth(lineForVertical) < f12) {
                                m4Var = m4Var3;
                                obj = "bottomSheet";
                            } else {
                                Spannable spannable = (Spannable) staticLayout.getText();
                                org.telegram.ui.Components.tz0[] tz0VarArr = (org.telegram.ui.Components.tz0[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, org.telegram.ui.Components.tz0.class);
                                if (tz0VarArr == null || tz0VarArr.length <= 0) {
                                    m4Var = m4Var3;
                                    obj = "bottomSheet";
                                } else {
                                    org.telegram.ui.Components.tz0 tz0Var = tz0VarArr[0];
                                    int spanStart = spannable.getSpanStart(tz0Var);
                                    m4Var = m4Var3;
                                    obj = "bottomSheet";
                                    int spanEnd = spannable.getSpanEnd(tz0Var);
                                    int i15 = 1;
                                    while (i15 < tz0VarArr.length) {
                                        try {
                                            org.telegram.ui.Components.tz0 tz0Var2 = tz0VarArr[i15];
                                            org.telegram.ui.Components.tz0[] tz0VarArr2 = tz0VarArr;
                                            int spanStart2 = spannable.getSpanStart(tz0Var2);
                                            int i16 = i15;
                                            int spanEnd2 = spannable.getSpanEnd(tz0Var2);
                                            if (spanStart > spanStart2 || spanEnd2 > spanEnd) {
                                                spanStart = spanStart2;
                                                tz0Var = tz0Var2;
                                                spanEnd = spanEnd2;
                                            }
                                            i15 = i16 + 1;
                                            tz0VarArr = tz0VarArr2;
                                        } catch (Exception e9) {
                                            e = e9;
                                            FileLog.e(e);
                                        }
                                    }
                                    org.telegram.ui.Components.q80 q80Var = d70Var.f37285b;
                                    if (q80Var == null || q80Var.f31841i != tz0Var) {
                                        if (q80Var != null) {
                                            m80Var.k(q80Var, true);
                                        }
                                        org.telegram.ui.Components.q80 q80Var2 = new org.telegram.ui.Components.q80(tz0Var, null, f10, y10, 0);
                                        d70Var.f37285b = q80Var2;
                                        q80Var2.d(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.K6, false) & 872415231);
                                        m80Var.a(d70Var.f37285b, d70Var.d);
                                        try {
                                            org.telegram.ui.Components.j80 j80VarB = d70Var.f37285b.b();
                                            j80VarB.d(staticLayout, spanStart, 0.0f);
                                            TextPaint textPaint = tz0Var.f32926a;
                                            int i17 = textPaint != null ? textPaint.baselineShift : 0;
                                            j80VarB.f29650o = i17 != 0 ? i17 + AndroidUtilities.dp(i17 > 0 ? 5.0f : -2.0f) : 0;
                                            staticLayout.getSelectionPath(spanStart, spanEnd, j80VarB);
                                            view.invalidate();
                                        } catch (Exception e10) {
                                            FileLog.e(e10);
                                        }
                                    }
                                }
                                ArrayList arrayList = f3Var.E;
                                if (arrayList != null && !arrayList.isEmpty() && (yz0VarArr = (org.telegram.ui.Components.yz0[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, org.telegram.ui.Components.yz0.class)) != null) {
                                    for (org.telegram.ui.Components.yz0 yz0Var : yz0VarArr) {
                                        if (yz0Var.c()) {
                                            Path path = new Path();
                                            ArrayList arrayList2 = f3Var.E;
                                            int size = arrayList2.size();
                                            int i18 = 0;
                                            while (i18 < size) {
                                                Object obj2 = arrayList2.get(i18);
                                                i18++;
                                                Rect bounds = ((eh.k) obj2).getBounds();
                                                path.addRect(bounds.left, bounds.top, bounds.right, bounds.bottom, Path.Direction.CW);
                                                path = path;
                                            }
                                            RectF rectF = new RectF();
                                            path.computeBounds(rectF, false);
                                            float fSqrt = (float) Math.sqrt((rectF.height() * rectF.height()) + (rectF.width() * rectF.width()));
                                            ((eh.k) f3Var.E.get(0)).f5525q = new f0(view, f3Var);
                                            ArrayList arrayList3 = f3Var.E;
                                            int size2 = arrayList3.size();
                                            int i19 = 0;
                                            while (i19 < size2) {
                                                Object obj3 = arrayList3.get(i19);
                                                i19++;
                                                ((eh.k) obj3).j(f12, i14, fSqrt, false);
                                            }
                                            view.invalidate();
                                            if (view.getParent() == null) {
                                                break;
                                            }
                                            view.getParent().requestDisallowInterceptTouchEvent(true);
                                            break;
                                        }
                                    }
                                }
                            }
                        } catch (Exception e11) {
                            e = e11;
                            m4Var = m4Var3;
                            obj = "bottomSheet";
                        }
                    } else {
                        m4Var = m4Var3;
                        obj = "bottomSheet";
                    }
                }
            } else {
                m4Var = m4Var3;
                obj = "bottomSheet";
                if (motionEvent.getAction() == 1) {
                    org.telegram.ui.Components.q80 q80Var3 = d70Var.f37285b;
                    if (q80Var3 != null) {
                        d70Var.c(k4Var, (org.telegram.ui.Components.tz0) q80Var3.f31841i);
                        T(d70Var);
                    }
                } else if (motionEvent.getAction() == 3 && ((n1Var = d70Var.D) == null || !n1Var.isShowing())) {
                    T(d70Var);
                }
            }
        } else {
            m4Var = m4Var3;
            obj = "bottomSheet";
        }
        if (motionEvent.getAction() == 0) {
            float x10 = motionEvent.getX();
            float y11 = motionEvent.getY();
            m4Var2 = m4Var;
            if (!m4Var2.F0) {
                m4Var2.F0 = true;
                if (m4Var2.H0 == null) {
                    m4Var2.H0 = new e3(m4Var2, 1);
                }
                if (view.getTag() == null || view.getTag() != obj || (j9Var2 = m4Var2.L0) == null) {
                    m4Var2.K0.l0(view, (int) x10, (int) y11);
                } else {
                    j9Var2.l0(view, (int) x10, (int) y11);
                }
                m4Var2.f40333b0.postDelayed(m4Var2.H0, ViewConfiguration.getTapTimeout());
            }
            if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
                m4Var2.k();
            }
            if (view instanceof p1) {
                if (d70Var.f37285b != null) {
                    return true;
                }
                return false;
            }
            if (d70Var.d != null) {
                return true;
            }
            return false;
        }
        m4Var2 = m4Var;
        if (motionEvent.getAction() != 0) {
            m4Var2.k();
        }
        if (view instanceof p1) {
            if (d70Var.f37285b != null) {
                return true;
            }
            return false;
        }
        if (d70Var.d != null) {
            return true;
        }
        return false;
    }

    public static f3 p(d70 d70Var, View view, CharSequence charSequence, TL_iv.RichText richText, int i10, int i11, TL_iv.PageBlock pageBlock, Layout.Alignment alignment, int i12, k4 k4Var) {
        int iDp;
        TLRPC.WebPage webPage;
        d70 d70Var2;
        CharSequence charSequenceC;
        TL_iv.PageBlock pageBlock2;
        int iDp2;
        TextPaint textPaintE;
        g4 g4Var;
        CharSequence charSequenceReplaceEmoji;
        TextPaint textPaint;
        ?? r10;
        CharSequence charSequence2;
        StaticLayout staticLayout;
        ?? r11;
        CharSequence text;
        boolean z10;
        ?? r12;
        ?? r13;
        f3 f3Var;
        View view2;
        TL_iv.RichText richText2;
        TL_iv.PageBlock pageBlock3;
        int i13;
        WeakHashMap weakHashMap;
        ArrayList arrayList;
        int i14;
        f3 f3Var2;
        Spanned spanned;
        ?? j80Var;
        ?? r14;
        org.telegram.ui.Components.rz0[] rz0VarArr;
        org.telegram.ui.Components.uz0[] uz0VarArr;
        org.telegram.ui.Components.z4[] z4VarArr;
        int lineCount;
        int i15;
        k4 k4Var2;
        String lowerCase;
        int i16;
        int iIndexOf;
        StaticLayout staticLayoutC;
        StaticLayout staticLayoutC2;
        if (charSequence != null) {
            if (i10 < 0) {
                iDp = AndroidUtilities.dp(10.0f);
            } else {
                iDp = i10;
            }
            if (charSequence != null) {
                d70Var2 = d70Var;
                charSequenceC = charSequence;
                pageBlock2 = pageBlock;
            } else {
                if (k4Var != null) {
                    webPage = k4Var.A;
                } else {
                    webPage = null;
                }
                d70Var2 = d70Var;
                charSequenceC = C(d70Var2, webPage, view, richText, richText, pageBlock, iDp);
                pageBlock2 = pageBlock;
            }
            if (!TextUtils.isEmpty(charSequenceC)) {
                iDp2 = AndroidUtilities.dp(SharedConfig.ivFontSize - 16);
                if ((pageBlock2 instanceof TL_iv.pageBlockEmbedPost) || richText != null) {
                    if (pageBlock2 instanceof TL_iv.pageBlockChannel) {
                        if (f40313e1 == null) {
                            TextPaint textPaint2 = new TextPaint(1);
                            f40313e1 = textPaint2;
                            textPaint2.setTypeface(AndroidUtilities.bold());
                            TextPaint textPaint3 = new TextPaint(1);
                            f40314f1 = textPaint3;
                            textPaint3.setTypeface(AndroidUtilities.bold());
                        }
                        f40313e1.setColor(d70Var2.b());
                        f40313e1.setTextSize(AndroidUtilities.dp(15.0f));
                        f40314f1.setColor(-1);
                        f40314f1.setTextSize(AndroidUtilities.dp(15.0f));
                        if (k4Var != null || k4Var.B == null) {
                            textPaintE = f40313e1;
                        } else {
                            textPaintE = f40314f1;
                        }
                    } else if (pageBlock2 instanceof g4) {
                        g4Var = (g4) pageBlock2;
                        if (charSequence == g4Var.f38307a.articles.get(g4Var.f38308b).title) {
                            if (f40315g1 == null) {
                                TextPaint textPaint4 = new TextPaint(1);
                                f40315g1 = textPaint4;
                                textPaint4.setTypeface(AndroidUtilities.bold());
                            }
                            f40315g1.setColor(d70Var2.b());
                            f40315g1.setTextSize(AndroidUtilities.dp(15.0f) + iDp2);
                            textPaintE = f40315g1;
                        } else {
                            if (f40316h1 == null) {
                                f40316h1 = new TextPaint(1);
                            }
                            f40316h1.setColor(d70Var2.a());
                            f40316h1.setTextSize(AndroidUtilities.dp(14.0f) + iDp2);
                            textPaintE = f40316h1;
                        }
                    } else if (L(pageBlock2) || charSequence == null) {
                        textPaintE = E(d70Var2, r3, r3, pageBlock2);
                    } else {
                        if (f40317i1 == null) {
                            TextPaint textPaint5 = new TextPaint(1);
                            f40317i1 = textPaint5;
                            textPaint5.setColor(d70Var2.b());
                        }
                        if (f40318j1 == null) {
                            TextPaint textPaint6 = new TextPaint(1);
                            f40318j1 = textPaint6;
                            textPaint6.setColor(d70Var2.b());
                        }
                        f40317i1.setTextSize(AndroidUtilities.dp(19.0f) + iDp2);
                        f40318j1.setTextSize(AndroidUtilities.dp(16.0f) + iDp2);
                        textPaintE = (!(pageBlock2 instanceof c4) || ((c4) pageBlock2).f36930c.f37250a.ordered) ? f40318j1 : f40317i1;
                    }
                } else if (((TL_iv.pageBlockEmbedPost) pageBlock2).author == charSequence) {
                    if (f40311c1 == null) {
                        TextPaint textPaint7 = new TextPaint(1);
                        f40311c1 = textPaint7;
                        textPaint7.setColor(d70Var2.b());
                    }
                    f40311c1.setTextSize(AndroidUtilities.dp(15.0f) + iDp2);
                    textPaintE = f40311c1;
                } else {
                    if (f40312d1 == null) {
                        TextPaint textPaint8 = new TextPaint(1);
                        f40312d1 = textPaint8;
                        textPaint8.setColor(d70Var2.a());
                    }
                    f40312d1.setTextSize(AndroidUtilities.dp(14.0f) + iDp2);
                    textPaintE = f40312d1;
                }
                charSequenceReplaceEmoji = Emoji.replaceEmoji(charSequenceC, textPaintE.getFontMetricsInt(), false, null, 2);
                if (i12 != 0) {
                    textPaint = textPaintE;
                    r10 = 1;
                    if (charSequenceReplaceEmoji.charAt(charSequenceReplaceEmoji.length() - 1) == '\n') {
                        charSequenceReplaceEmoji = charSequenceReplaceEmoji.subSequence(0, charSequenceReplaceEmoji.length() - 1);
                    }
                    if (pageBlock2 instanceof TL_iv.pageBlockPullquote) {
                        charSequence2 = charSequenceReplaceEmoji;
                        staticLayout = new StaticLayout(charSequence2, textPaint, iDp, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    } else {
                        charSequence2 = charSequenceReplaceEmoji;
                        staticLayout = new StaticLayout(charSequence2, textPaint, iDp, alignment, 1.0f, AndroidUtilities.dp(4.0f), false);
                    }
                    r11 = staticLayout;
                    charSequenceReplaceEmoji = charSequence2;
                } else if (pageBlock2 instanceof TL_iv.pageBlockPullquote) {
                    TextPaint textPaint9 = textPaintE;
                    r10 = 1;
                    staticLayoutC2 = org.telegram.ui.Components.tv0.c(charSequenceReplaceEmoji, textPaint9, iDp, Layout.Alignment.ALIGN_CENTER, 0.0f, false, TextUtils.TruncateAt.END, iDp, i12, true);
                } else {
                    TextPaint textPaint10 = textPaintE;
                    r10 = 1;
                    staticLayoutC = org.telegram.ui.Components.tv0.c(charSequenceReplaceEmoji, textPaint10, iDp, alignment, AndroidUtilities.dp(4.0f), false, TextUtils.TruncateAt.END, iDp, i12, true);
                }
                if (r11 != 0) {
                    r11 = staticLayoutC;
                    text = r11.getText();
                    if (i11 >= 0 && !d70Var2.A.isEmpty() && d70Var2.B != null && (k4Var2 = ((m4) d70Var2).f40347q0[0].f41497c) != null) {
                        r11 = staticLayoutC2;
                        lowerCase = charSequenceReplaceEmoji.toString().toLowerCase();
                        i16 = 0;
                        while (true) {
                            iIndexOf = lowerCase.indexOf(d70Var2.B, i16);
                            if (iIndexOf >= 0) {
                                break;
                            }
                            int length = d70Var2.B.length() + iIndexOf;
                            if (iIndexOf != 0 || AndroidUtilities.isPunctuationCharacter(lowerCase.charAt(iIndexOf - 1))) {
                                k4Var2.f39597y.put(d70Var2.B + pageBlock2 + r3 + iIndexOf, Integer.valueOf(r11.getLineTop(r11.getLineForOffset(iIndexOf)) + i11));
                            }
                            i16 = length;
                        }
                    }
                    r11 = staticLayoutC2;
                    r11 = staticLayoutC2;
                    r11 = staticLayoutC2;
                    r11 = staticLayoutC2;
                    z10 = text instanceof Spanned;
                    if (z10) {
                        spanned = (Spanned) text;
                        try {
                            z4VarArr = (org.telegram.ui.Components.z4[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.z4.class);
                            lineCount = r11.getLineCount();
                            if (z4VarArr != null && z4VarArr.length > 0) {
                                for (i15 = 0; i15 < z4VarArr.length; i15++) {
                                    if (lineCount <= r10) {
                                        k4Var.f39592n.put(z4VarArr[i15].f35146a, Integer.valueOf(i11));
                                    } else {
                                        HashMap map = k4Var.f39592n;
                                        org.telegram.ui.Components.z4 z4Var = z4VarArr[i15];
                                        map.put(z4Var.f35146a, Integer.valueOf(i11 + r11.getLineTop(r11.getLineForOffset(spanned.getSpanStart(z4Var)))));
                                    }
                                }
                            }
                        } catch (Exception unused) {
                        }
                        try {
                            uz0VarArr = (org.telegram.ui.Components.uz0[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.uz0.class);
                            if (uz0VarArr != null || uz0VarArr.length <= 0) {
                                j80Var = 0;
                            } else {
                                j80Var = new org.telegram.ui.Components.j80(0);
                                try {
                                    j80Var.f29649n = false;
                                    for (int i17 = 0; i17 < uz0VarArr.length; i17++) {
                                        int spanStart = spanned.getSpanStart(uz0VarArr[i17]);
                                        int spanEnd = spanned.getSpanEnd(uz0VarArr[i17]);
                                        j80Var.d(r11, spanStart, 0.0f);
                                        TextPaint textPaint11 = uz0VarArr[i17].f32926a;
                                        int i18 = textPaint11 != null ? textPaint11.baselineShift : 0;
                                        j80Var.f29650o = i18 != 0 ? i18 + AndroidUtilities.dp(i18 > 0 ? 5.0f : -2.0f) : 0;
                                        r11.getSelectionPath(spanStart, spanEnd, j80Var);
                                    }
                                    j80Var.f29649n = r10;
                                } catch (Exception unused2) {
                                }
                            }
                        } catch (Exception unused3) {
                        }
                        try {
                            rz0VarArr = (org.telegram.ui.Components.rz0[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.rz0.class);
                            if (rz0VarArr != null || rz0VarArr.length <= 0) {
                                r14 = 0;
                            } else {
                                ?? j80Var2 = new org.telegram.ui.Components.j80(0);
                                try {
                                    j80Var2.f29649n = false;
                                    for (int i19 = 0; i19 < rz0VarArr.length; i19++) {
                                        int spanStart2 = spanned.getSpanStart(rz0VarArr[i19]);
                                        int spanEnd2 = spanned.getSpanEnd(rz0VarArr[i19]);
                                        j80Var2.d(r11, spanStart2, 0.0f);
                                        TextPaint textPaint12 = rz0VarArr[i19].f32281a;
                                        int i20 = textPaint12 != null ? textPaint12.baselineShift : 0;
                                        j80Var2.f29650o = i20 != 0 ? i20 + AndroidUtilities.dp(i20 > 0 ? 5.0f : -2.0f) : 0;
                                        r11.getSelectionPath(spanStart2, spanEnd2, j80Var2);
                                    }
                                    j80Var2.f29649n = r10;
                                    r14 = j80Var2;
                                } catch (Exception unused4) {
                                    r14 = j80Var2;
                                }
                            }
                        } catch (Exception unused5) {
                        }
                        r12 = r14;
                        r13 = j80Var;
                    } else {
                        r12 = 0;
                        r13 = 0;
                    }
                    f3Var = new f3(d70Var2);
                    f3Var.d = r11;
                    f3Var.f37919e = r13;
                    f3Var.f37920f = r12;
                    f3Var.f37921n = pageBlock2;
                    f3Var.f37922r = r3;
                    f3Var.F = new Stack();
                    f3Var.E = new ArrayList();
                    f3Var.G = new AtomicReference();
                    if (z10) {
                        view2 = view;
                        richText2 = richText;
                        pageBlock3 = pageBlock;
                        i13 = 1;
                        eh.k.a(view2, r11, -1, -1, (Spanned) text, f3Var.F, f3Var.E, null);
                    } else {
                        view2 = view;
                        richText2 = r3;
                        pageBlock3 = pageBlock2;
                        i13 = 1;
                    }
                    if (view2 != null) {
                        weakHashMap = f40330w1;
                        arrayList = (ArrayList) weakHashMap.get(view2);
                        if (arrayList != null) {
                            i14 = 0;
                            while (i14 < arrayList.size()) {
                                f3Var2 = (f3) arrayList.get(i14);
                                if (f3Var2.f37921n == pageBlock3 || (richText2 != null && f3Var2.f37922r == richText2)) {
                                    f3Var2.detach(view2);
                                    arrayList.remove(i14);
                                    i14--;
                                }
                                i14 += i13;
                            }
                        }
                        if (richText2 != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                weakHashMap.put(view2, arrayList);
                            }
                            arrayList.add(f3Var);
                        }
                        if (view2.isAttachedToWindow()) {
                            f3Var.attach(view2);
                        }
                    }
                    return f3Var;
                }
            }
        } else if (richText != null) {
            if (richText instanceof TL_iv.textEmpty) {
                return null;
            }
            if (i10 < 0) {
                iDp = AndroidUtilities.dp(10.0f);
            } else {
                iDp = i10;
            }
            if (charSequence != null) {
                d70Var2 = d70Var;
                charSequenceC = charSequence;
                pageBlock2 = pageBlock;
            } else {
                if (k4Var != null) {
                    webPage = k4Var.A;
                } else {
                    webPage = null;
                }
                d70Var2 = d70Var;
                charSequenceC = C(d70Var2, webPage, view, richText, richText, pageBlock, iDp);
                pageBlock2 = pageBlock;
            }
            if (!TextUtils.isEmpty(charSequenceC)) {
                iDp2 = AndroidUtilities.dp(SharedConfig.ivFontSize - 16);
                if (pageBlock2 instanceof TL_iv.pageBlockEmbedPost) {
                    if (pageBlock2 instanceof TL_iv.pageBlockChannel) {
                        if (f40313e1 == null) {
                            TextPaint textPaint13 = new TextPaint(1);
                            f40313e1 = textPaint13;
                            textPaint13.setTypeface(AndroidUtilities.bold());
                            TextPaint textPaint14 = new TextPaint(1);
                            f40314f1 = textPaint14;
                            textPaint14.setTypeface(AndroidUtilities.bold());
                        }
                        f40313e1.setColor(d70Var2.b());
                        f40313e1.setTextSize(AndroidUtilities.dp(15.0f));
                        f40314f1.setColor(-1);
                        f40314f1.setTextSize(AndroidUtilities.dp(15.0f));
                        if (k4Var != null) {
                            textPaintE = f40313e1;
                        } else {
                            textPaintE = f40313e1;
                        }
                    } else if (pageBlock2 instanceof g4) {
                        g4Var = (g4) pageBlock2;
                        if (charSequence == g4Var.f38307a.articles.get(g4Var.f38308b).title) {
                            if (f40315g1 == null) {
                                TextPaint textPaint15 = new TextPaint(1);
                                f40315g1 = textPaint15;
                                textPaint15.setTypeface(AndroidUtilities.bold());
                            }
                            f40315g1.setColor(d70Var2.b());
                            f40315g1.setTextSize(AndroidUtilities.dp(15.0f) + iDp2);
                            textPaintE = f40315g1;
                        } else {
                            if (f40316h1 == null) {
                                f40316h1 = new TextPaint(1);
                            }
                            f40316h1.setColor(d70Var2.a());
                            f40316h1.setTextSize(AndroidUtilities.dp(14.0f) + iDp2);
                            textPaintE = f40316h1;
                        }
                    } else if (L(pageBlock2)) {
                        textPaintE = E(d70Var2, r3, r3, pageBlock2);
                    } else {
                        textPaintE = E(d70Var2, r3, r3, pageBlock2);
                    }
                } else if (pageBlock2 instanceof TL_iv.pageBlockChannel) {
                    if (f40313e1 == null) {
                        TextPaint textPaint16 = new TextPaint(1);
                        f40313e1 = textPaint16;
                        textPaint16.setTypeface(AndroidUtilities.bold());
                        TextPaint textPaint17 = new TextPaint(1);
                        f40314f1 = textPaint17;
                        textPaint17.setTypeface(AndroidUtilities.bold());
                    }
                    f40313e1.setColor(d70Var2.b());
                    f40313e1.setTextSize(AndroidUtilities.dp(15.0f));
                    f40314f1.setColor(-1);
                    f40314f1.setTextSize(AndroidUtilities.dp(15.0f));
                    if (k4Var != null) {
                        textPaintE = f40313e1;
                    } else {
                        textPaintE = f40313e1;
                    }
                } else if (pageBlock2 instanceof g4) {
                    g4Var = (g4) pageBlock2;
                    if (charSequence == g4Var.f38307a.articles.get(g4Var.f38308b).title) {
                        if (f40315g1 == null) {
                            TextPaint textPaint18 = new TextPaint(1);
                            f40315g1 = textPaint18;
                            textPaint18.setTypeface(AndroidUtilities.bold());
                        }
                        f40315g1.setColor(d70Var2.b());
                        f40315g1.setTextSize(AndroidUtilities.dp(15.0f) + iDp2);
                        textPaintE = f40315g1;
                    } else {
                        if (f40316h1 == null) {
                            f40316h1 = new TextPaint(1);
                        }
                        f40316h1.setColor(d70Var2.a());
                        f40316h1.setTextSize(AndroidUtilities.dp(14.0f) + iDp2);
                        textPaintE = f40316h1;
                    }
                } else if (L(pageBlock2)) {
                    textPaintE = E(d70Var2, r3, r3, pageBlock2);
                } else {
                    textPaintE = E(d70Var2, r3, r3, pageBlock2);
                }
                charSequenceReplaceEmoji = Emoji.replaceEmoji(charSequenceC, textPaintE.getFontMetricsInt(), false, null, 2);
                if (i12 != 0) {
                    textPaint = textPaintE;
                    r10 = 1;
                    if (charSequenceReplaceEmoji.charAt(charSequenceReplaceEmoji.length() - 1) == '\n') {
                        charSequenceReplaceEmoji = charSequenceReplaceEmoji.subSequence(0, charSequenceReplaceEmoji.length() - 1);
                    }
                    if (pageBlock2 instanceof TL_iv.pageBlockPullquote) {
                        charSequence2 = charSequenceReplaceEmoji;
                        staticLayout = new StaticLayout(charSequence2, textPaint, iDp, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    } else {
                        charSequence2 = charSequenceReplaceEmoji;
                        staticLayout = new StaticLayout(charSequence2, textPaint, iDp, alignment, 1.0f, AndroidUtilities.dp(4.0f), false);
                    }
                    r11 = staticLayout;
                    charSequenceReplaceEmoji = charSequence2;
                } else if (pageBlock2 instanceof TL_iv.pageBlockPullquote) {
                    TextPaint textPaint19 = textPaintE;
                    r10 = 1;
                    staticLayoutC2 = org.telegram.ui.Components.tv0.c(charSequenceReplaceEmoji, textPaint19, iDp, Layout.Alignment.ALIGN_CENTER, 0.0f, false, TextUtils.TruncateAt.END, iDp, i12, true);
                } else {
                    TextPaint textPaint110 = textPaintE;
                    r10 = 1;
                    staticLayoutC = org.telegram.ui.Components.tv0.c(charSequenceReplaceEmoji, textPaint110, iDp, alignment, AndroidUtilities.dp(4.0f), false, TextUtils.TruncateAt.END, iDp, i12, true);
                }
                if (r11 != 0) {
                    r11 = staticLayoutC;
                    text = r11.getText();
                    if (i11 >= 0) {
                        r11 = staticLayoutC2;
                        lowerCase = charSequenceReplaceEmoji.toString().toLowerCase();
                        i16 = 0;
                        while (true) {
                            iIndexOf = lowerCase.indexOf(d70Var2.B, i16);
                            if (iIndexOf >= 0) {
                                break;
                                break;
                            }
                            int length2 = d70Var2.B.length() + iIndexOf;
                            if (iIndexOf != 0) {
                                k4Var2.f39597y.put(d70Var2.B + pageBlock2 + r3 + iIndexOf, Integer.valueOf(r11.getLineTop(r11.getLineForOffset(iIndexOf)) + i11));
                            } else {
                                k4Var2.f39597y.put(d70Var2.B + pageBlock2 + r3 + iIndexOf, Integer.valueOf(r11.getLineTop(r11.getLineForOffset(iIndexOf)) + i11));
                            }
                            i16 = length2;
                        }
                    }
                    r11 = staticLayoutC2;
                    r11 = staticLayoutC2;
                    r11 = staticLayoutC2;
                    r11 = staticLayoutC2;
                    z10 = text instanceof Spanned;
                    if (z10) {
                        spanned = (Spanned) text;
                        z4VarArr = (org.telegram.ui.Components.z4[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.z4.class);
                        lineCount = r11.getLineCount();
                        if (z4VarArr != null) {
                            while (i15 < z4VarArr.length) {
                                if (lineCount <= r10) {
                                    k4Var.f39592n.put(z4VarArr[i15].f35146a, Integer.valueOf(i11));
                                } else {
                                    HashMap map2 = k4Var.f39592n;
                                    org.telegram.ui.Components.z4 z4Var2 = z4VarArr[i15];
                                    map2.put(z4Var2.f35146a, Integer.valueOf(i11 + r11.getLineTop(r11.getLineForOffset(spanned.getSpanStart(z4Var2)))));
                                }
                            }
                        }
                        uz0VarArr = (org.telegram.ui.Components.uz0[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.uz0.class);
                        if (uz0VarArr != null) {
                            j80Var = 0;
                        } else {
                            j80Var = 0;
                        }
                        rz0VarArr = (org.telegram.ui.Components.rz0[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.rz0.class);
                        if (rz0VarArr != null) {
                            r14 = 0;
                        } else {
                            r14 = 0;
                        }
                        r12 = r14;
                        r13 = j80Var;
                    } else {
                        r12 = 0;
                        r13 = 0;
                    }
                    f3Var = new f3(d70Var2);
                    f3Var.d = r11;
                    f3Var.f37919e = r13;
                    f3Var.f37920f = r12;
                    f3Var.f37921n = pageBlock2;
                    f3Var.f37922r = r3;
                    f3Var.F = new Stack();
                    f3Var.E = new ArrayList();
                    f3Var.G = new AtomicReference();
                    if (z10) {
                        view2 = view;
                        richText2 = richText;
                        pageBlock3 = pageBlock;
                        i13 = 1;
                        eh.k.a(view2, r11, -1, -1, (Spanned) text, f3Var.F, f3Var.E, null);
                    } else {
                        view2 = view;
                        richText2 = r3;
                        pageBlock3 = pageBlock2;
                        i13 = 1;
                    }
                    if (view2 != null) {
                        weakHashMap = f40330w1;
                        arrayList = (ArrayList) weakHashMap.get(view2);
                        if (arrayList != null) {
                            i14 = 0;
                            while (i14 < arrayList.size()) {
                                f3Var2 = (f3) arrayList.get(i14);
                                if (f3Var2.f37921n == pageBlock3) {
                                    f3Var2.detach(view2);
                                    arrayList.remove(i14);
                                    i14--;
                                } else {
                                    f3Var2.detach(view2);
                                    arrayList.remove(i14);
                                    i14--;
                                }
                                i14 += i13;
                            }
                        }
                        if (richText2 != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                weakHashMap.put(view2, arrayList);
                            }
                            arrayList.add(f3Var);
                        }
                        if (view2.isAttachedToWindow()) {
                            f3Var.attach(view2);
                        }
                    }
                    return f3Var;
                }
            }
        }
        r11 = staticLayoutC;
        r11 = staticLayoutC2;
        return null;
    }

    public static f3 q(d70 d70Var, View view, CharSequence charSequence, TL_iv.RichText richText, int i10, int i11, TL_iv.PageBlock pageBlock, k4 k4Var) {
        return p(d70Var, view, charSequence, richText, i10, i11, pageBlock, Layout.Alignment.ALIGN_NORMAL, 0, k4Var);
    }

    public static void r(m4 m4Var, boolean z10) {
        if (f40320m1 == null) {
            f40320m1 = new Paint();
            l1 = new Paint();
            Paint paint = new Paint(1);
            f40322o1 = paint;
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            f40322o1.setStrokeWidth(AndroidUtilities.dp(1.0f));
            Paint paint2 = new Paint();
            f40323p1 = paint2;
            paint2.setStyle(style);
            f40323p1.setStrokeWidth(AndroidUtilities.dp(1.0f) / 2.0f);
            f40324q1 = new Paint();
            f40325r1 = new Paint();
            f40326s1 = new Paint();
            f40327t1 = new Paint(1);
            f40328u1 = new Paint(1);
            f40319k1 = new Paint();
            f40321n1 = new Paint();
            f40329v1 = new Paint(1);
        } else if (!z10) {
            return;
        }
        int iW0 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false);
        f40328u1.setColor(com.google.android.recaptcha.internal.a.y((float) Color.blue(iW0), 0.0722f, (((float) Color.green(iW0)) * 0.7152f) + (((float) Color.red(iW0)) * 0.2126f), 255.0f) <= 0.705f ? -3041234 : -6551);
        Paint paint3 = f40327t1;
        int i10 = org.telegram.ui.ActionBar.g6.K6;
        paint3.setColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false) & 872415231);
        f40327t1.setPathEffect(org.telegram.ui.Components.j80.c());
        f40326s1.setColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false) & 872415231);
        f40326s1.setPathEffect(org.telegram.ui.Components.j80.c());
        Paint paint4 = f40323p1;
        int i11 = org.telegram.ui.ActionBar.g6.f23181k6;
        paint4.setColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        f40322o1.setColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        f40319k1.setColor(251658240);
        f40321n1.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23054d7, false));
        f40329v1.setColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false) & 872415231);
        f40329v1.setPathEffect(org.telegram.ui.Components.j80.c());
        int iW1 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.M6, false);
        int iRed = Color.red(iW1);
        int iGreen = Color.green(iW1);
        int iBlue = Color.blue(iW1);
        f40325r1.setColor(Color.argb(20, iRed, iGreen, iBlue));
        f40324q1.setColor(Color.argb(34, iRed, iGreen, iBlue));
        int iW2 = org.telegram.ui.ActionBar.g6.w0(null, i10, false);
        l1.setColor(Color.argb(20, Color.red(iW2), Color.green(iW2), Color.blue(iW2)));
        f40320m1.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Uc, false));
    }

    public static void u(Canvas canvas, d70 d70Var, TL_iv.PageBlock pageBlock, int i10) {
        if (pageBlock == null || d70Var == null || f40320m1 == null) {
            return;
        }
        int i11 = 0;
        int iDp = i10 - (pageBlock.bottom ? AndroidUtilities.dp(6.0f) : 0);
        int i12 = pageBlock.quoteLevels;
        if (i12 == 0) {
            if (pageBlock.level > 0) {
                int iDp2 = AndroidUtilities.dp(18);
                canvas.drawRect(iDp2, 0.0f, AndroidUtilities.dp(2.0f) + iDp2, iDp, f40320m1);
                return;
            }
            return;
        }
        while (i12 != 0) {
            if ((i12 & 1) != 0) {
                int iDp3 = AndroidUtilities.dp((i11 * 14) + 18);
                canvas.drawRect(iDp3, 0.0f, AndroidUtilities.dp(2.0f) + iDp3, iDp, f40320m1);
            }
            i12 >>>= 1;
            i11++;
        }
    }

    public static void v(d70 d70Var, Canvas canvas, org.telegram.ui.Cells.i9 i9Var, int i10) {
        org.telegram.ui.Cells.j9 j9Var;
        View view = (View) i9Var;
        m4 m4Var = (m4) d70Var;
        if (view != null) {
            m4Var.getClass();
            if (view.getTag() == null || view.getTag() != "bottomSheet" || (j9Var = m4Var.L0) == null) {
                j9Var = m4Var.K0;
            }
        } else {
            j9Var = m4Var.K0;
        }
        if (j9Var != null) {
            j9Var.a0(canvas, i9Var, i10);
        }
    }

    public static TL_iv.RichText w(int i10, TL_iv.PageBlock pageBlock) {
        if (i10 == 2) {
            TL_iv.RichText richTextW = w(0, pageBlock);
            if (richTextW instanceof TL_iv.textEmpty) {
                richTextW = null;
            }
            TL_iv.RichText richTextW2 = w(1, pageBlock);
            if (richTextW2 instanceof TL_iv.textEmpty) {
                richTextW2 = null;
            }
            if (richTextW != null && richTextW2 == null) {
                return richTextW;
            }
            if (richTextW == null && richTextW2 != null) {
                return richTextW2;
            }
            if (richTextW != null && richTextW2 != null) {
                TL_iv.textPlain textplain = new TL_iv.textPlain();
                textplain.text = " ";
                TL_iv.textConcat textconcat = new TL_iv.textConcat();
                textconcat.texts.add(richTextW);
                textconcat.texts.add(textplain);
                textconcat.texts.add(richTextW2);
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
        } else {
            if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                return ((TL_iv.pageBlockBlockquote) pageBlock).caption;
            }
            if (pageBlock instanceof TL_iv.pageBlockVideo) {
                TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
                if (i10 == 0) {
                    return pageblockvideo.caption.text;
                }
                if (i10 == 1) {
                    return pageblockvideo.caption.credit;
                }
            } else {
                if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                    return ((TL_iv.pageBlockPullquote) pageBlock).caption;
                }
                if (pageBlock instanceof TL_iv.pageBlockAudio) {
                    TL_iv.pageBlockAudio pageblockaudio = (TL_iv.pageBlockAudio) pageBlock;
                    if (i10 == 0) {
                        return pageblockaudio.caption.text;
                    }
                    if (i10 == 1) {
                        return pageblockaudio.caption.credit;
                    }
                } else {
                    if (pageBlock instanceof TL_iv.pageBlockCover) {
                        return w(i10, ((TL_iv.pageBlockCover) pageBlock).cover);
                    }
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
        if (m4Var2 != null) {
            return m4Var2;
        }
        synchronized (m4.class) {
            try {
                m4Var = Y0;
                if (m4Var == null) {
                    m4Var = new m4();
                    Y0 = m4Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return m4Var;
    }

    public static View y(View view) {
        org.telegram.ui.Components.lk0 lk0Var;
        if (!(view instanceof b2)) {
            return (!(view instanceof e2) || (lk0Var = ((e2) view).d) == null) ? view : y(lk0Var.f5789a);
        }
        org.telegram.ui.Components.lk0 lk0Var2 = ((b2) view).d;
        return lk0Var2 != null ? y(lk0Var2.f5789a) : view;
    }

    public static TL_iv.PageBlock z(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof c4) {
            TL_iv.PageBlock pageBlock2 = ((c4) pageBlock).d;
            return pageBlock2 != null ? z(pageBlock2) : pageBlock2;
        }
        if (!(pageBlock instanceof e4)) {
            return pageBlock;
        }
        TL_iv.PageBlock pageBlock3 = ((e4) pageBlock).d;
        return pageBlock3 != null ? z(pageBlock3) : pageBlock3;
    }

    public final void G() {
        ArrayList arrayList = this.Z;
        int size = arrayList.size();
        z3 z3Var = this.G;
        boolean z10 = false;
        if (size <= 1) {
            ArticleViewer$WindowView articleViewer$WindowView = this.f40333b0;
            articleViewer$WindowView.f24027e = false;
            articleViewer$WindowView.d = false;
            n0 n0Var = this.f40334c0;
            float width = z3Var != null ? z3Var.E * z3Var.f45005c.getWidth() : n0Var.getX();
            AnimatorSet animatorSet = new AnimatorSet();
            float measuredWidth = n0Var.getMeasuredWidth() - width;
            if (z3Var != null) {
                animatorSet.playTogether(z3Var.d(1.0f));
            } else {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.f40334c0, (Property<n0, Float>) View.TRANSLATION_X, n0Var.getMeasuredWidth()), ObjectAnimator.ofFloat(this.f40333b0, Z0, n0Var.getMeasuredWidth()));
            }
            animatorSet.setDuration(Math.max((int) ((420.0f / n0Var.getMeasuredWidth()) * measuredWidth), 250));
            animatorSet.setInterpolator(org.telegram.ui.Components.er.h);
            animatorSet.addListener(new y0(this));
            animatorSet.start();
            this.P0 = true;
            return;
        }
        ArticleViewer$WindowView articleViewer$WindowView2 = this.f40333b0;
        articleViewer$WindowView2.f24028f = true;
        articleViewer$WindowView2.f24027e = true;
        articleViewer$WindowView2.h = this.E0;
        this.f40347q0[1].setVisibility(0);
        this.f40347q0[1].setAlpha(1.0f);
        this.f40347q0[1].setTranslationX(0.0f);
        this.f40347q0[0].setBackgroundColor(z3Var == null ? 0 : this.f40339h0.getColor());
        e0(-1, arrayList.get(arrayList.size() - 2), true);
        q3 q3Var = this.f40347q0[0];
        q3Var.getX();
        AnimatorSet animatorSet2 = new AnimatorSet();
        q3Var.getMeasuredWidth();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f40347q0[0], (Property<q3, Float>) View.TRANSLATION_X, q3Var.getMeasuredWidth()));
        animatorSet2.setDuration(420L);
        animatorSet2.setInterpolator(org.telegram.ui.Components.er.h);
        animatorSet2.addListener(new z0(this));
        animatorSet2.start();
        o0 o0Var = this.f40335d0;
        q3 q3Var2 = this.f40347q0[0];
        o0Var.setMenuColors((q3Var2 == null || !SharedConfig.adaptableColorInBrowser) ? org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Pk, false) : q3Var2.getBackgroundColor());
        o0 o0Var2 = this.f40335d0;
        q3 q3Var3 = this.f40347q0[0];
        o0Var2.d((q3Var3 == null || !SharedConfig.adaptableColorInBrowser) ? org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Pk, false) : q3Var3.getActionBarColor(), true);
        o0 o0Var3 = this.f40335d0;
        q3 q3Var4 = this.f40347q0[0];
        o0Var3.setIsTonsite(q3Var4 != null && q3Var4.e());
        o0 o0Var4 = this.f40335d0;
        q3 q3Var5 = this.f40347q0[0];
        if (q3Var5 != null && q3Var5.d()) {
            z10 = true;
        }
        o0Var4.setIsLocal(z10);
        this.P0 = true;
    }

    public final void H(int i10) {
        ArrayList arrayList = this.Z;
        int size = arrayList.size();
        z3 z3Var = this.G;
        boolean z10 = false;
        if (size <= 1) {
            ArticleViewer$WindowView articleViewer$WindowView = this.f40333b0;
            articleViewer$WindowView.f24027e = false;
            articleViewer$WindowView.d = false;
            n0 n0Var = this.f40334c0;
            float width = z3Var != null ? z3Var.E * z3Var.f45005c.getWidth() : n0Var.getX();
            AnimatorSet animatorSet = new AnimatorSet();
            float measuredWidth = n0Var.getMeasuredWidth() - width;
            if (z3Var != null) {
                animatorSet.playTogether(z3Var.d(1.0f));
            } else {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.f40334c0, (Property<n0, Float>) View.TRANSLATION_X, n0Var.getMeasuredWidth()), ObjectAnimator.ofFloat(this.f40333b0, Z0, n0Var.getMeasuredWidth()));
            }
            animatorSet.setDuration(Math.max((int) ((420.0f / n0Var.getMeasuredWidth()) * measuredWidth), 250));
            animatorSet.setInterpolator(org.telegram.ui.Components.er.h);
            animatorSet.addListener(new a1(this));
            animatorSet.start();
            this.P0 = true;
            return;
        }
        this.f40333b0.f24028f = true;
        this.f40347q0[1].setVisibility(0);
        this.f40347q0[1].setAlpha(1.0f);
        this.f40347q0[1].setTranslationX(0.0f);
        this.f40347q0[0].setBackgroundColor(z3Var == null ? 0 : this.f40339h0.getColor());
        e0(-1, arrayList.get(i10), true);
        q3 q3Var = this.f40347q0[0];
        q3Var.getX();
        AnimatorSet animatorSet2 = new AnimatorSet();
        q3Var.getMeasuredWidth();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f40347q0[0], (Property<q3, Float>) View.TRANSLATION_X, q3Var.getMeasuredWidth()));
        animatorSet2.setDuration(420L);
        animatorSet2.setInterpolator(org.telegram.ui.Components.er.h);
        animatorSet2.addListener(new b1(this, i10));
        animatorSet2.start();
        o0 o0Var = this.f40335d0;
        q3 q3Var2 = this.f40347q0[0];
        o0Var.setMenuColors((q3Var2 == null || !SharedConfig.adaptableColorInBrowser) ? org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Pk, false) : q3Var2.getBackgroundColor());
        o0 o0Var2 = this.f40335d0;
        q3 q3Var3 = this.f40347q0[0];
        o0Var2.d((q3Var3 == null || !SharedConfig.adaptableColorInBrowser) ? org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Pk, false) : q3Var3.getActionBarColor(), true);
        o0 o0Var3 = this.f40335d0;
        q3 q3Var4 = this.f40347q0[0];
        o0Var3.setIsTonsite(q3Var4 != null && q3Var4.e());
        o0 o0Var4 = this.f40335d0;
        q3 q3Var5 = this.f40347q0[0];
        if (q3Var5 != null && q3Var5.d()) {
            z10 = true;
        }
        o0Var4.setIsLocal(z10);
        this.P0 = true;
    }

    public final boolean J() {
        ArrayList arrayList = this.Z;
        return arrayList.size() > 0 && (arrayList.get(0) instanceof TLRPC.WebPage);
    }

    public final void M() {
        this.R = false;
        int i10 = 0;
        while (true) {
            q3[] q3VarArr = this.f40347q0;
            if (i10 < q3VarArr.length) {
                q3VarArr[i10].b();
                i10++;
            } else {
                try {
                    break;
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
            }
        }
        this.H.getWindow().clearFlags(128);
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.J;
            if (i11 >= arrayList.size()) {
                this.f40334c0.post(new d0(this, 0));
                NotificationCenter.getInstance(this.T).lambda$postNotificationNameOnUIThread$1(NotificationCenter.articleClosed, new Object[0]);
                return;
            } else {
                ((w1) arrayList.get(i11)).a(false);
                i11++;
            }
        }
    }

    public final boolean N(MessageObject messageObject, TLRPC.WebPage webPage, String str, String str2) {
        String strSubstring;
        boolean z10;
        int iLastIndexOf;
        TL_iv.Page page;
        if (this.H == null) {
            return false;
        }
        z3 z3Var = this.G;
        if (z3Var == null && this.R) {
            return false;
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.I;
        if (n2Var != null && (n2Var.getParentLayout() instanceof ActionBarLayout)) {
            AndroidUtilities.hideKeyboard((ActionBarLayout) this.I.getParentLayout());
        }
        int i10 = 1;
        if (messageObject != null) {
            webPage = webPage == null ? messageObject.messageOwner.media.webpage : webPage;
            z10 = (webPage == null || (page = webPage.cached_page) == null || page.local == null) ? false : true;
            int i11 = 0;
            while (true) {
                if (i11 < messageObject.messageOwner.entities.size()) {
                    TLRPC.MessageEntity messageEntity = messageObject.messageOwner.entities.get(i11);
                    if (messageEntity instanceof TLRPC.TL_messageEntityUrl) {
                        try {
                            String str3 = messageObject.messageOwner.message;
                            int i12 = messageEntity.offset;
                            String lowerCase = str3.substring(i12, messageEntity.length + i12).toLowerCase();
                            String lowerCase2 = !TextUtils.isEmpty(webPage.cached_page.url) ? webPage.cached_page.url.toLowerCase() : webPage.url.toLowerCase();
                            if (lowerCase.contains(lowerCase2) || lowerCase2.contains(lowerCase)) {
                                int iLastIndexOf2 = lowerCase.lastIndexOf(35);
                                if (iLastIndexOf2 != -1) {
                                    strSubstring = lowerCase.substring(iLastIndexOf2 + 1);
                                    break;
                                }
                            }
                        } catch (Exception e9) {
                            FileLog.e(e9);
                        }
                    }
                    i11++;
                }
                strSubstring = null;
                break;
            }
        }
        strSubstring = (str == null || (iLastIndexOf = str.lastIndexOf(35)) == -1) ? null : str.substring(iLastIndexOf + 1);
        z10 = false;
        ArrayList arrayList = this.Z;
        ?? r10 = (z3Var == null || arrayList.isEmpty()) ? 0 : 1;
        if (r10 == 0) {
            arrayList.clear();
            this.f40334c0.setTranslationX(0.0f);
            if (z3Var != null) {
                z3Var.E = 0.0f;
                z3Var.f45005c.invalidate();
                z3Var.i();
                z3Var.h();
            }
            this.f40334c0.setTranslationY(0.0f);
            this.f40347q0[0].setTranslationY(0.0f);
            this.f40347q0[0].setTranslationX(0.0f);
            this.f40347q0[1].setTranslationX(0.0f);
            this.f40347q0[0].setAlpha(1.0f);
            this.f40333b0.setInnerTranslationX(0.0f);
            this.f40347q0[0].g();
            X(AndroidUtilities.dp(56.0f));
        }
        if (z3Var != null && org.telegram.ui.web.z0.I0) {
            z3Var.f45003a.lock();
        }
        if (webPage != null) {
            boolean zH = h(webPage, strSubstring, r10);
            if (!z10) {
                String str4 = (zH || strSubstring == null) ? null : strSubstring;
                TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
                tL_messages_getWebPage.url = webPage.url;
                TL_iv.Page page2 = webPage.cached_page;
                if ((page2 instanceof TL_iv.TL_pagePart_layer82) || page2.part) {
                    tL_messages_getWebPage.hash = 0;
                } else {
                    tL_messages_getWebPage.hash = webPage.hash;
                }
                int i13 = messageObject != null ? messageObject.currentAccount : UserConfig.selectedAccount;
                ConnectionsManager.getInstance(i13).sendRequest(tL_messages_getWebPage, new j0(this, i13, webPage, messageObject, (boolean) r10, str4));
            }
        } else {
            g(r10, str2);
        }
        o0 o0Var = this.f40335d0;
        if (o0Var != null && r10 == 0) {
            o0Var.setIsLocal(this.f40347q0[0].d());
        }
        this.P = null;
        if (z3Var != null) {
            if (r10 == 0) {
                AndroidUtilities.removeFromParent(this.f40333b0);
                z3Var.d = this.f40333b0;
                z3Var.n();
                z3Var.f45005c.addView(this.f40333b0, h7.z5.c(-1.0f, -1));
            }
        } else if (this.R) {
            this.f40332a0.flags &= -17;
            ((WindowManager) this.H.getSystemService("window")).updateViewLayout(this.f40333b0, this.f40332a0);
        } else {
            WindowManager windowManager = (WindowManager) this.H.getSystemService("window");
            if (this.S) {
                try {
                    windowManager.removeView(this.f40333b0);
                } catch (Exception unused) {
                }
            }
            try {
                WindowManager.LayoutParams layoutParams = this.f40332a0;
                layoutParams.flags = -2013200384;
                if (Build.VERSION.SDK_INT >= 28) {
                    layoutParams.layoutInDisplayCutoutMode = 1;
                }
                this.f40333b0.setFocusable(false);
                this.f40334c0.setFocusable(false);
                windowManager.addView(this.f40333b0, this.f40332a0);
            } catch (Exception e10) {
                FileLog.e(e10);
                return false;
            }
        }
        this.R = true;
        this.V = 1;
        if (r10 == 0) {
            if (z3Var == null) {
                this.f40333b0.setAlpha(0.0f);
                this.f40334c0.setAlpha(0.0f);
                AnimatorSet animatorSet = new AnimatorSet();
                ArticleViewer$WindowView articleViewer$WindowView = this.f40333b0;
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(articleViewer$WindowView, (Property<ArticleViewer$WindowView, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f40334c0, (Property<n0, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f40333b0, (Property<ArticleViewer$WindowView, Float>) View.TRANSLATION_X, AndroidUtilities.dp(56.0f), 0.0f));
                this.W = new d0(this, i10);
                animatorSet.setDuration(150L);
                animatorSet.setInterpolator(this.Y);
                animatorSet.addListener(new v0(this));
                this.X = System.currentTimeMillis();
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.l0(11, this, animatorSet));
            } else if (r10 != 0) {
                z3Var.f45003a.unlock();
            } else if (!z3Var.h) {
                z3Var.g(z3Var.f45004b);
                z3Var.f();
            }
        }
        this.f40334c0.setLayerType(2, null);
        return true;
    }

    public final void P(long j10, TLRPC.User user) {
        if (user == null || !(this.H instanceof LaunchActivity)) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.f22527id);
        bundle.putString("botUser", "webpage" + j10);
        ((LaunchActivity) this.H).q0(new rn(bundle), false, true);
        o(false, true);
    }

    public final void Q(String str, String str2, m0 m0Var) {
        Activity activity = this.H;
        if (activity == null || activity.isFinishing()) {
            return;
        }
        q3 q3Var = this.f40347q0[0];
        if (q3Var == null || !q3Var.d()) {
            R(str, str2, m0Var);
            return;
        }
        String string = LocaleController.getString(R.string.OpenUrlAlert2);
        int iIndexOf = string.indexOf("%");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(String.format(string, str));
        if (iIndexOf >= 0) {
            spannableStringBuilder.setSpan(new URLSpan(str), iIndexOf, str.length() + iIndexOf, 33);
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.H, 0, null);
        String string2 = LocaleController.getString(R.string.OpenUrlTitle);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        b2Var.N = string2;
        b2Var.P = spannableStringBuilder;
        b2Var.f22745b0 = false;
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Open), new a1.d(this, str, str2, m0Var, 5));
        alertDialog$Builder.o();
    }

    public final void R(String str, String str2, we.d dVar) {
        z3 z3Var;
        we.d dVar2 = this.I0;
        if (dVar2 != null) {
            dVar2.a(false);
        }
        this.I0 = dVar;
        if (this.B0 != 0) {
            ConnectionsManager.getInstance(this.T).cancelRequest(this.B0, false);
            this.B0 = 0;
        }
        boolean[] zArr = new boolean[1];
        if (we.e.l(this.H, str, false)) {
            if (!this.Z.isEmpty() || (z3Var = this.G) == null) {
                return;
            }
            z3Var.dismiss(false);
            return;
        }
        i0 i0Var = new i0(this, str, zArr, dVar);
        int i10 = this.D0 + 1;
        this.D0 = i10;
        b0(true);
        TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
        tL_messages_getWebPage.url = str;
        tL_messages_getWebPage.hash = 0;
        this.B0 = ConnectionsManager.getInstance(this.T).sendRequest(tL_messages_getWebPage, new org.telegram.messenger.di(this, i10, dVar, str2, i0Var, tL_messages_getWebPage));
        if (dVar != null) {
            dVar.f49293b = new d5.i(this, i10, dVar, 23);
            dVar.d();
        }
    }

    public final void S() {
        TextView textView = this.f40354x0;
        if (textView != null) {
            textView.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23144i6, false), 2, -1));
            this.f40354x0.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E8, false));
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f40353w0;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G8, false));
        }
        ImageView imageView = this.f40344n0;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false), PorterDuff.Mode.MULTIPLY));
            this.f40344n0.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23443z8, false), 1, -1));
        }
        ImageView imageView2 = this.f40345o0;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false), PorterDuff.Mode.MULTIPLY));
            this.f40345o0.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23443z8, false), 1, -1));
        }
        org.telegram.ui.Components.j6 j6Var = this.f40346p0;
        if (j6Var != null) {
            j6Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        }
        o0 o0Var = this.f40335d0;
        if (o0Var != null) {
            q3 q3Var = this.f40347q0[0];
            o0Var.setMenuColors((q3Var == null || !SharedConfig.adaptableColorInBrowser) ? org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Pk, false) : q3Var.getBackgroundColor());
            o0 o0Var2 = this.f40335d0;
            q3 q3Var2 = this.f40347q0[0];
            o0Var2.d((q3Var2 == null || !SharedConfig.adaptableColorInBrowser) ? org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Pk, false) : q3Var2.getActionBarColor(), true);
        }
        this.f40339h0.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Pk, false));
    }

    public final void U() {
        int iL0;
        q3 q3Var = this.f40347q0[0];
        if (q3Var.f41497c.A == null || (iL0 = q3Var.d.L0()) == -1) {
            return;
        }
        View viewM = this.f40347q0[0].d.m(iL0);
        int top = viewM != null ? viewM.getTop() : 0;
        SharedPreferences.Editor editorEdit = ApplicationLoader.applicationContext.getSharedPreferences("articles", 0).edit();
        String str = "article" + this.f40347q0[0].f41497c.A.f22533id;
        SharedPreferences.Editor editorPutInt = editorEdit.putInt(str, iL0).putInt(str + "o", top);
        String strL = s3.c.l(str, "r");
        Point point = AndroidUtilities.displaySize;
        editorPutInt.putBoolean(strL, point.x > point.y).commit();
    }

    public final boolean V(String str, boolean z10) {
        Integer num = 0;
        if (!TextUtils.isEmpty(str)) {
            String lowerCase = str.toLowerCase();
            Integer numValueOf = (Integer) this.f40347q0[0].f41497c.h.get(lowerCase);
            if (numValueOf != null) {
                TL_iv.textAnchor textanchor = (TL_iv.textAnchor) this.f40347q0[0].f41497c.f39593r.get(lowerCase);
                if (textanchor != null) {
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    pageblockparagraph.text = org.telegram.ui.web.e2.d(textanchor.text, !TextUtils.isEmpty(this.f40347q0[0].f41497c.A.cached_page.url) ? this.f40347q0[0].f41497c.A.cached_page.url.toLowerCase() : this.f40347q0[0].f41497c.A.url.toLowerCase(), lowerCase);
                    this.f40347q0[0].f41497c.getClass();
                    int I = k4.I(pageblockparagraph);
                    f2.o1 o1VarX = this.f40347q0[0].f41497c.x(null, I);
                    View view = o1VarX.f5789a;
                    this.f40347q0[0].f41497c.H(I, o1VarX, pageblockparagraph, 0, 0, false);
                    org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(this.H, null, false, false);
                    e3Var.fixNavigationBar();
                    e3Var.applyTopPadding = false;
                    e3Var.applyBottomPadding = false;
                    LinearLayout linearLayout = new LinearLayout(this.H);
                    linearLayout.setOrientation(1);
                    org.telegram.ui.Cells.j9 j9Var = new org.telegram.ui.Cells.j9();
                    this.L0 = j9Var;
                    j9Var.T(linearLayout);
                    this.L0.D = new jh.h2(this, 1);
                    cg.q qVar = new cg.q(this.H, 5);
                    qVar.setTextSize(1, 16.0f);
                    qVar.setTypeface(AndroidUtilities.bold());
                    qVar.setText(LocaleController.getString(R.string.InstantViewReference));
                    qVar.setGravity((this.f40347q0[0].f41497c.C ? 5 : 3) | 16);
                    qVar.setTextColor(b());
                    qVar.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                    linearLayout.addView(qVar, new LinearLayout.LayoutParams(-1, AndroidUtilities.dp(48.0f) + 1));
                    view.setTag("bottomSheet");
                    linearLayout.addView(view, h7.z5.k(0.0f, 7.0f, 0.0f, 0.0f, -1, -2));
                    org.telegram.ui.Cells.v9 v9VarO = this.L0.o(this.H);
                    ag.y1 y1Var = new ag.y1(this, this.H, linearLayout, 6);
                    e3Var.setDelegate(new k0(this, 0));
                    y1Var.addView(linearLayout, -1, -2);
                    y1Var.addView(v9VarO, -1, -2);
                    e3Var.customView = y1Var;
                    if (this.K0.y()) {
                        this.K0.f(false);
                    }
                    this.E = e3Var;
                    a0(e3Var);
                    return true;
                }
                if (numValueOf.intValue() >= 0 && numValueOf.intValue() < this.f40347q0[0].f41497c.f39590e.size()) {
                    TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) this.f40347q0[0].f41497c.f39590e.get(numValueOf.intValue());
                    TL_iv.PageBlock pageBlockZ = z(pageBlock);
                    if ((pageBlockZ instanceof a4) && O((a4) pageBlockZ)) {
                        this.f40347q0[0].f41497c.M();
                        this.f40347q0[0].f41497c.l();
                    }
                    int iIndexOf = this.f40347q0[0].f41497c.d.indexOf(pageBlock);
                    if (iIndexOf != -1) {
                        numValueOf = Integer.valueOf(iIndexOf);
                    }
                    Integer num2 = (Integer) this.f40347q0[0].f41497c.f39592n.get(lowerCase);
                    if (num2 != null) {
                        if (num2.intValue() == -1) {
                            this.f40347q0[0].f41497c.getClass();
                            int I2 = k4.I(pageBlock);
                            f2.o1 o1VarX2 = this.f40347q0[0].f41497c.x(null, I2);
                            this.f40347q0[0].f41497c.H(I2, o1VarX2, pageBlock, 0, 0, false);
                            o1VarX2.f5789a.measure(View.MeasureSpec.makeMeasureSpec(this.f40347q0[0].f41496b.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                            Integer num3 = (Integer) this.f40347q0[0].f41497c.f39592n.get(lowerCase);
                            if (num3.intValue() != -1) {
                                num = num3;
                            }
                        } else {
                            num = num2;
                        }
                    }
                    if (this.f40347q0[0].f41497c.D) {
                        numValueOf = Integer.valueOf(numValueOf.intValue() + 1);
                    }
                    if (!z10) {
                        this.f40347q0[0].d.h1(numValueOf.intValue(), (-AndroidUtilities.dp(56.0f)) - num.intValue());
                        return true;
                    }
                    l0 l0Var = new l0(this.f40347q0[0].getContext());
                    l0Var.f5731a = numValueOf.intValue();
                    l0Var.f29501s = (-AndroidUtilities.dp(56.0f)) - num.intValue();
                    this.f40347q0[0].d.w0(l0Var);
                    return true;
                }
            }
        }
        return false;
    }

    public final void W(int i10) {
        TL_iv.PageBlock pageBlock;
        a4 a4Var;
        TL_iv.PageBlock pageBlock2;
        if (i10 < 0 || i10 >= this.A.size()) {
            h0();
            return;
        }
        this.C = i10;
        h0();
        v3 v3Var = (v3) this.A.get(i10);
        TL_iv.PageBlock pageBlockZ = z(v3Var.f43338c);
        int size = this.f40347q0[0].f41497c.f39590e.size();
        for (int i11 = 0; i11 < size; i11++) {
            TL_iv.PageBlock pageBlock3 = (TL_iv.PageBlock) this.f40347q0[0].f41497c.f39590e.get(i11);
            if ((pageBlock3 instanceof a4) && ((pageBlock2 = (a4Var = (a4) pageBlock3).f36370b) == v3Var.f43338c || pageBlock2 == pageBlockZ)) {
                if (!O(a4Var)) {
                    break;
                }
                this.f40347q0[0].f41497c.M();
                this.f40347q0[0].f41497c.l();
                break;
            }
        }
        int size2 = this.f40347q0[0].f41497c.d.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size2) {
                i12 = -1;
                break;
            }
            TL_iv.PageBlock pageBlock4 = (TL_iv.PageBlock) this.f40347q0[0].f41497c.d.get(i12);
            TL_iv.PageBlock pageBlock5 = v3Var.f43338c;
            if (pageBlock4 == pageBlock5 || pageBlock4 == pageBlockZ || ((pageBlock4 instanceof a4) && ((pageBlock = ((a4) pageBlock4).f36370b) == pageBlock5 || pageBlock == pageBlockZ))) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 == -1) {
            return;
        }
        if ((pageBlockZ instanceof a4) && O((a4) pageBlockZ)) {
            this.f40347q0[0].f41497c.M();
            this.f40347q0[0].f41497c.l();
        }
        String str = this.B + v3Var.f43338c + v3Var.f43337b + v3Var.f43336a;
        Integer num = (Integer) this.f40347q0[0].f41497c.f39597y.get(str);
        if (num == null) {
            k4 k4Var = this.f40347q0[0].f41497c;
            TL_iv.PageBlock pageBlock6 = v3Var.f43338c;
            k4Var.getClass();
            int I = k4.I(pageBlock6);
            f2.o1 o1VarX = this.f40347q0[0].f41497c.x(null, I);
            this.f40347q0[0].f41497c.H(I, o1VarX, v3Var.f43338c, 0, 0, false);
            o1VarX.f5789a.measure(View.MeasureSpec.makeMeasureSpec(this.f40347q0[0].f41496b.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            num = (Integer) this.f40347q0[0].f41497c.f39597y.get(str);
            if (num == null) {
                num = 0;
            }
        }
        t0 t0Var = new t0(this.f40347q0[0].getContext());
        if (this.f40347q0[0].f41497c.D) {
            i12++;
        }
        t0Var.f5731a = i12;
        t0Var.f29501s = -(AndroidUtilities.dp(100.0f) + ((this.E0 - AndroidUtilities.dp(56.0f)) - num.intValue()));
        t0Var.f29502t = 1.2f;
        this.f40347q0[0].d.w0(t0Var);
        this.f40347q0[0].f41496b.f1();
    }

    public final void X(int i10) {
        o0 o0Var = this.f40335d0;
        if (o0Var == null || o0Var.P || o0Var.S) {
            return;
        }
        int iClamp = Utilities.clamp(i10, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(24.0f));
        this.E0 = iClamp;
        this.f40335d0.setHeight(iClamp);
        this.K0.f25897x = this.E0;
        int i11 = 0;
        while (true) {
            q3[] q3VarArr = this.f40347q0;
            if (i11 >= q3VarArr.length) {
                return;
            }
            q3VarArr[i11].f41496b.setTopGlowOffset(this.E0);
            i11++;
        }
    }

    public final void Y(Activity activity, org.telegram.ui.ActionBar.n2 n2Var) {
        z3 z3Var;
        gf.t0 t0Var = this.Q0;
        if (t0Var != null) {
            t0Var.destroy();
            this.Q0 = null;
        }
        LaunchActivity launchActivity = LaunchActivity.C1;
        this.Q0 = launchActivity != null ? new gf.t0(launchActivity, true) : null;
        this.I = n2Var;
        int currentAccount = !(n2Var instanceof ty) ? n2Var.getCurrentAccount() : UserConfig.selectedAccount;
        this.T = currentAccount;
        NotificationCenter.getInstance(currentAccount).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
        NotificationCenter.getInstance(this.T).addObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(this.T).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(this.T).addObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(this.T).addObserver(this, NotificationCenter.emojiLoaded);
        Activity activity2 = this.H;
        if (activity2 == activity || !(activity2 == null || !this.F || (z3Var = this.G) == null || z3Var.f45006e == null)) {
            g0(this);
            S();
            return;
        }
        this.H = activity;
        this.f37284a = ApplicationLoader.applicationContext.getSharedPreferences("articles", 0).getInt("font_type", 0);
        r(this, false);
        this.f40339h0 = new Paint();
        this.f40340i0 = activity.getResources().getDrawable(R.drawable.layer_shadow);
        this.f40341j0 = new Paint();
        ArticleViewer$WindowView articleViewer$WindowView = new ArticleViewer$WindowView(this, activity);
        this.f40333b0 = articleViewer$WindowView;
        articleViewer$WindowView.setWillNotDraw(false);
        this.f40333b0.setClipChildren(true);
        this.f40333b0.setFocusable(false);
        n0 n0Var = new n0(this, activity, 0);
        this.f40334c0 = n0Var;
        this.f40333b0.addView(n0Var, h7.z5.e(-1, -1, 51));
        if (this.G == null) {
            this.f40333b0.setFitsSystemWindows(true);
            this.f40334c0.setOnApplyWindowInsetsListener(new org.telegram.ui.ActionBar.f3(1));
        }
        FrameLayout frameLayout = new FrameLayout(activity);
        this.L = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        this.L.setVisibility(4);
        this.f40333b0.addView(this.L, h7.z5.c(-1.0f, -1));
        c5.c cVar = new c5.c(activity);
        this.N = cVar;
        cVar.setVisibility(0);
        this.N.setBackgroundColor(-16777216);
        this.L.addView(this.N, h7.z5.e(-1, -1, 17));
        this.M = new TextureView(activity);
        this.f40347q0 = new q3[2];
        int i10 = 0;
        while (true) {
            q3[] q3VarArr = this.f40347q0;
            if (i10 >= q3VarArr.length) {
                break;
            }
            q3 q3Var = new q3(this, activity);
            q3VarArr[i10] = q3Var;
            q3Var.setVisibility(i10 == 0 ? 0 : 8);
            this.f40334c0.addView(q3Var, h7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
            q3Var.f41496b.setOnItemLongClickListener(new u(this));
            q3Var.f41496b.setOnItemClickListener(new jh.z1(8, this, q3Var));
            i10++;
        }
        this.f40334c0.addView(new FrameLayout(activity), h7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        this.f40349s0.setColor(-16777216);
        this.f40350t0.setColor(-16777216);
        this.f40352v0.setColor(-14408666);
        this.f40351u0.setColor(-16777216);
        o0 o0Var = new o0(this, activity);
        this.f40335d0 = o0Var;
        o0Var.f43958a0 = this.G != null;
        this.f40334c0.addView(o0Var, h7.z5.e(-1, -2, 48));
        this.f40335d0.setOnClickListener(new nh.x1(10, this, activity));
        this.f40335d0.U.addTextChangedListener(new p0(this, 0));
        org.telegram.ui.web.l lVar = new org.telegram.ui.web.l(activity);
        this.f40336e0 = lVar;
        lVar.setOpenProgress(0.0f);
        this.f40336e0.f43900w.j(new m3(this, 2));
        this.f40334c0.addView(this.f40336e0, h7.z5.c(-1.0f, -1));
        this.f40337f0 = new d0(this, 3);
        this.f40335d0.H.setOnClickListener(new t(this, 2));
        this.f40335d0.H.setOnLongClickListener(new v(this, 0));
        this.f40335d0.setMenuListener(new gh.d1(28, this, activity));
        this.f40335d0.K.setOnClickListener(new t(this, 3));
        ag.d dVar = new ag.d(this.H, 5);
        this.m0 = dVar;
        dVar.setOnTouchListener(new kh.e(3));
        this.m0.setWillNotDraw(false);
        this.m0.setTranslationY(AndroidUtilities.dp(51.0f));
        this.m0.setVisibility(4);
        this.m0.setFocusable(true);
        this.m0.setFocusableInTouchMode(true);
        this.m0.setClickable(true);
        this.m0.setPadding(0, AndroidUtilities.dp(3.0f), 0, 0);
        this.f40334c0.addView(this.m0, h7.z5.e(-1, 51, 80));
        new lh.a4(this.f40333b0, false, new s(this, 0));
        ImageView imageView = new ImageView(this.H);
        this.f40344n0 = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        this.f40344n0.setImageResource(R.drawable.msg_go_up);
        ImageView imageView2 = this.f40344n0;
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        int iW0 = org.telegram.ui.ActionBar.g6.w0(null, i11, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView2.setColorFilter(new PorterDuffColorFilter(iW0, mode));
        ImageView imageView3 = this.f40344n0;
        int i12 = org.telegram.ui.ActionBar.g6.f23443z8;
        imageView3.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, i12, false), 1, -1));
        this.m0.addView(this.f40344n0, h7.z5.d(48, 48.0f, 53, 0.0f, 0.0f, 48.0f, 0.0f));
        this.f40344n0.setOnClickListener(new t(this, 0));
        this.f40344n0.setContentDescription(LocaleController.getString(R.string.AccDescrSearchNext));
        ImageView imageView4 = new ImageView(this.H);
        this.f40345o0 = imageView4;
        imageView4.setScaleType(scaleType);
        this.f40345o0.setImageResource(R.drawable.msg_go_down);
        this.f40345o0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i11, false), mode));
        this.f40345o0.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, i12, false), 1, -1));
        this.m0.addView(this.f40345o0, h7.z5.d(48, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        this.f40345o0.setOnClickListener(new t(this, 1));
        this.f40345o0.setContentDescription(LocaleController.getString(R.string.AccDescrSearchPrev));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(this.H, true, true, true);
        this.f40346p0 = j6Var;
        j6Var.setScaleProperty(0.6f);
        this.f40346p0.b(0.4f, 350L, org.telegram.ui.Components.er.h);
        this.f40346p0.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        this.f40346p0.setTextSize(AndroidUtilities.dp(15.0f));
        this.f40346p0.setTypeface(AndroidUtilities.bold());
        this.f40346p0.setGravity(3);
        this.f40346p0.getDrawable().G = AndroidUtilities.displaySize.x;
        this.m0.addView(this.f40346p0, h7.z5.d(-2, -2.0f, 19, 18.0f, 0.0f, 108.0f, 0.0f));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f40332a0 = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 51;
        layoutParams.type = 98;
        layoutParams.softInputMode = 48;
        layoutParams.flags = 131072;
        int iW1 = this.G == null ? org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f22999a7, true) : org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f22999a7, false);
        int i13 = (AndroidUtilities.computePerceivedBrightness(iW1) < 0.721f || Build.VERSION.SDK_INT < 26) ? 1792 : 1808;
        this.f40351u0.setColor(iW1);
        WindowManager.LayoutParams layoutParams2 = this.f40332a0;
        layoutParams2.systemUiVisibility = i13;
        layoutParams2.flags |= -2147417856;
        if (Build.VERSION.SDK_INT >= 28) {
            layoutParams2.layoutInDisplayCutoutMode = 1;
        }
        org.telegram.ui.Cells.j9 j9Var = new org.telegram.ui.Cells.j9();
        this.K0 = j9Var;
        j9Var.T(this.f40347q0[0].f41496b);
        if (MessagesController.getInstance(this.T).getTranslateController().isContextTranslateEnabled()) {
            this.K0.f25879l0 = new u(this);
        }
        org.telegram.ui.Cells.j9 j9Var2 = this.K0;
        j9Var2.E0 = this.f40347q0[0].d;
        j9Var2.D = new s0(this);
        this.f40334c0.addView(j9Var2.o(activity));
        n0 n0Var2 = this.f40334c0;
        ou0 ou0Var = new ou0(n0Var2, n0Var2);
        this.M0 = ou0Var;
        ou0Var.F = new u(this);
        ou0Var.E = new g(this, 1);
        this.f40339h0.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Pk, false));
        g0(this);
    }

    public final void Z(String str) {
        String strDecode;
        if (this.H == null) {
            return;
        }
        org.telegram.ui.ActionBar.e3 e3Var = this.E;
        if (e3Var != null) {
            e3Var.dismiss();
            this.E = null;
        }
        int i10 = 0;
        org.telegram.ui.ActionBar.e3 e3Var2 = new org.telegram.ui.ActionBar.e3(this.H, null, false, false);
        e3Var2.fixNavigationBar();
        try {
            strDecode = URLDecoder.decode(str.replaceAll("\\+", "%2b"), "UTF-8");
        } catch (Exception e9) {
            FileLog.e(e9);
            strDecode = str;
        }
        e3Var2.title = strDecode;
        e3Var2.bigTitle = false;
        e3Var2.multipleLinesTitle = true;
        CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
        w wVar = new w(i10, this, str);
        e3Var2.items = charSequenceArr;
        e3Var2.onClickListener = wVar;
        e3Var2.setOnHideListener(new x(this, i10));
        a0(e3Var2);
    }

    @Override
    public final int a() {
        return org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23423y6, false);
    }

    public final void a0(org.telegram.ui.ActionBar.e3 e3Var) {
        if (this.H == null) {
            return;
        }
        try {
            org.telegram.ui.ActionBar.e3 e3Var2 = this.f40338g0;
            if (e3Var2 != null) {
                e3Var2.dismiss();
                this.f40338g0 = null;
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        try {
            this.f40338g0 = e3Var;
            e3Var.setCanceledOnTouchOutside(true);
            this.f40338g0.setOnDismissListener(new x(this, 1));
            e3Var.show();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final int b() {
        return org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false);
    }

    public final void b0(boolean z10) {
        AndroidUtilities.cancelRunOnUIThread(this.f40337f0);
        if (!z10) {
            this.f40335d0.W.a(1.0f, true);
            return;
        }
        this.f40335d0.W.a(0.0f, false);
        this.f40335d0.W.a(0.3f, true);
        AndroidUtilities.runOnUIThread(this.f40337f0, 100L);
    }

    @Override
    public final void c(k4 k4Var, org.telegram.ui.Components.tz0 tz0Var) {
        String str;
        String strDecode;
        org.telegram.ui.Components.q80 q80Var;
        if (tz0Var == null || (str = tz0Var.f32927b) == null) {
            return;
        }
        org.telegram.ui.ActionBar.e3 e3Var = this.E;
        m0 m0Var = null;
        if (e3Var != null) {
            e3Var.dismiss();
            this.E = null;
        }
        int iLastIndexOf = str.lastIndexOf(35);
        boolean z10 = false;
        if (iLastIndexOf != -1) {
            String lowerCase = !TextUtils.isEmpty(k4Var.A.cached_page.url) ? k4Var.A.cached_page.url.toLowerCase() : k4Var.A.url.toLowerCase();
            try {
                strDecode = URLDecoder.decode(str.substring(iLastIndexOf + 1), "UTF-8");
            } catch (Exception unused) {
                strDecode = "";
            }
            if (iLastIndexOf == 0 || str.toLowerCase().contains(lowerCase)) {
                z10 = true;
                V(strDecode, true);
            }
        } else {
            strDecode = null;
        }
        if (z10) {
            return;
        }
        f3 f3Var = this.d;
        if (f3Var != null && (q80Var = this.f37285b) != null) {
            m0Var = new m0(this, f3Var, q80Var);
        }
        Q(str, strDecode, m0Var);
    }

    public final void c0() {
        LaunchActivity launchActivity;
        q3 q3Var;
        FrameLayout frameLayout;
        if (!this.S || (launchActivity = LaunchActivity.C1) == null || launchActivity.isFinishing()) {
            return;
        }
        if (!this.f40347q0[0].f()) {
            q3Var = this.f40347q0[0];
            if (q3Var.f41497c.A == null) {
                frameLayout = q3Var;
                return;
            }
        } else if (this.f40347q0[0].getWebView() == null) {
            return;
        } else {
            frameLayout = this.f40347q0[0].f41499f;
        }
        frameLayout = q3Var;
        new org.telegram.ui.Components.mc(frameLayout, null).G(R.raw.chats_infotip, 4, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BrowserExternalRestricted), new d0(this, 10))).k(true);
    }

    @Override
    public final boolean d(TL_iv.PageBlock pageBlock, k4 k4Var) {
        int iIndexOf;
        List listSingletonList;
        org.telegram.ui.ActionBar.n2 n2Var = this.I;
        if (n2Var != null && n2Var.getParentActivity() != null) {
            if (!(pageBlock instanceof TL_iv.pageBlockVideo) || j4.g(k4Var.A, pageBlock)) {
                ArrayList arrayList = new ArrayList(k4Var.f39591f);
                iIndexOf = k4Var.f39591f.indexOf(pageBlock);
                listSingletonList = arrayList;
            } else {
                listSingletonList = Collections.singletonList(pageBlock);
                iIndexOf = 0;
            }
            PhotoViewer photoViewerT1 = PhotoViewer.t1();
            photoViewerT1.K2(null, this.I, null);
            if (photoViewerT1.e2(null, null, null, null, null, null, null, iIndexOf, new j3(this, listSingletonList), null, 0L, 0L, 0L, true, new s3(this, k4Var.A, listSingletonList), null)) {
                n();
                return true;
            }
        }
        return false;
    }

    public final void d0(boolean z10) {
        this.m0.setVisibility(0);
        ValueAnimator valueAnimator = this.T0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.U0, z10 ? 1.0f : 0.0f);
        this.T0 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new r(this, 1));
        this.T0.addListener(new ag.x(20, this, z10));
        this.T0.setDuration(320L);
        this.T0.setInterpolator(org.telegram.ui.Components.er.h);
        this.T0.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        d1 d1Var;
        MessageObject messageObject;
        if (i10 == NotificationCenter.messagePlayingDidStart) {
            if (this.f40347q0 == null) {
                return;
            }
            int i12 = 0;
            while (true) {
                q3[] q3VarArr = this.f40347q0;
                if (i12 >= q3VarArr.length) {
                    return;
                }
                int childCount = q3VarArr[i12].f41496b.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = this.f40347q0[i12].f41496b.getChildAt(i13);
                    if (childAt instanceof d1) {
                        ((d1) childAt).a(true);
                    }
                }
                i12++;
            }
        } else if (i10 == NotificationCenter.messagePlayingDidReset || i10 == NotificationCenter.messagePlayingPlayStateChanged) {
            if (this.f40347q0 == null) {
                return;
            }
            int i14 = 0;
            while (true) {
                q3[] q3VarArr2 = this.f40347q0;
                if (i14 >= q3VarArr2.length) {
                    return;
                }
                int childCount2 = q3VarArr2[i14].f41496b.getChildCount();
                for (int i15 = 0; i15 < childCount2; i15++) {
                    View childAt2 = this.f40347q0[i14].f41496b.getChildAt(i15);
                    if (childAt2 instanceof d1) {
                        d1 d1Var2 = (d1) childAt2;
                        if (d1Var2.getMessageObject() != null) {
                            d1Var2.a(true);
                        }
                    }
                }
                i14++;
            }
        } else if (i10 == NotificationCenter.messagePlayingProgressDidChanged) {
            Integer num = (Integer) objArr[0];
            if (this.f40347q0 == null) {
                return;
            }
            int i16 = 0;
            while (true) {
                q3[] q3VarArr3 = this.f40347q0;
                if (i16 >= q3VarArr3.length) {
                    return;
                }
                int childCount3 = q3VarArr3[i16].f41496b.getChildCount();
                for (int i17 = 0; i17 < childCount3; i17++) {
                    View childAt3 = this.f40347q0[i16].f41496b.getChildAt(i17);
                    if ((childAt3 instanceof d1) && (messageObject = (d1Var = (d1) childAt3).getMessageObject()) != null && messageObject.getId() == num.intValue()) {
                        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                        if (playingMessageObject == null) {
                            break;
                        }
                        messageObject.audioProgress = playingMessageObject.audioProgress;
                        messageObject.audioProgressSec = playingMessageObject.audioProgressSec;
                        messageObject.audioPlayerDuration = playingMessageObject.audioPlayerDuration;
                        d1Var.b();
                        break;
                    }
                }
                i16++;
            }
        } else {
            if (i10 != NotificationCenter.emojiLoaded || this.f40347q0 == null) {
                return;
            }
            int i18 = 0;
            while (true) {
                q3[] q3VarArr4 = this.f40347q0;
                if (i18 >= q3VarArr4.length) {
                    return;
                }
                int childCount4 = q3VarArr4[i18].f41496b.getChildCount();
                for (int i19 = 0; i19 < childCount4; i19++) {
                    View childAt4 = this.f40347q0[i18].f41496b.getChildAt(i19);
                    if (childAt4 instanceof y2) {
                        ((y2) childAt4).f44680e.invalidate();
                    } else {
                        childAt4.invalidate();
                    }
                }
                i18++;
            }
        }
    }

    public final void e0(int i10, Object obj, boolean z10) {
        int iDp;
        if (obj != null) {
            if ((!(obj instanceof TLRPC.WebPage) || ((TLRPC.WebPage) obj).cached_page == null) && !(obj instanceof d3)) {
                return;
            }
            int i11 = 0;
            if (!z10 && i10 != 0) {
                q3[] q3VarArr = this.f40347q0;
                q3 q3Var = q3VarArr[1];
                q3VarArr[1] = q3VarArr[0];
                q3VarArr[0] = q3Var;
                this.f40335d0.i();
                this.V0.a(this.f40347q0[0].getBackgroundColor(), true);
                this.W0.a(this.f40347q0[1].getBackgroundColor(), true);
                z3 z3Var = this.G;
                if (z3Var != null) {
                    z3Var.m();
                }
                int iIndexOfChild = this.f40334c0.indexOfChild(this.f40347q0[0]);
                int iIndexOfChild2 = this.f40334c0.indexOfChild(this.f40347q0[1]);
                if (i10 == 1) {
                    if (iIndexOfChild < iIndexOfChild2) {
                        this.f40334c0.removeView(this.f40347q0[0]);
                        this.f40334c0.addView(this.f40347q0[0], iIndexOfChild2);
                    }
                } else if (iIndexOfChild2 < iIndexOfChild) {
                    this.f40334c0.removeView(this.f40347q0[0]);
                    this.f40334c0.addView(this.f40347q0[0], iIndexOfChild);
                }
                this.f40348r0 = new AnimatorSet();
                this.f40347q0[0].setVisibility(0);
                int i12 = i10 == 1 ? 0 : 1;
                this.f40347q0[i12].setBackgroundColor(this.G == null ? 0 : this.f40339h0.getColor());
                this.f40347q0[i12].setLayerType(2, null);
                if (i10 == 1) {
                    this.f40347q0[0].setTranslationX(AndroidUtilities.displaySize.x);
                    this.f40348r0.playTogether(ObjectAnimator.ofFloat(this.f40347q0[0], (Property<q3, Float>) View.TRANSLATION_X, AndroidUtilities.displaySize.x, 0.0f));
                } else if (i10 == -1) {
                    this.f40347q0[0].setTranslationX(0.0f);
                    this.f40348r0.playTogether(ObjectAnimator.ofFloat(this.f40347q0[1], (Property<q3, Float>) View.TRANSLATION_X, 0.0f, AndroidUtilities.displaySize.x));
                }
                this.f40348r0.setDuration(320L);
                this.f40348r0.setInterpolator(org.telegram.ui.Components.er.h);
                this.f40348r0.addListener(new x0(this, i12, i11));
                this.f40333b0.f24028f = true;
                o0 o0Var = this.f40335d0;
                q3 q3Var2 = this.f40347q0[0];
                o0Var.setMenuColors((q3Var2 == null || !SharedConfig.adaptableColorInBrowser) ? org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Pk, false) : q3Var2.getBackgroundColor());
                o0 o0Var2 = this.f40335d0;
                q3 q3Var3 = this.f40347q0[0];
                o0Var2.d((q3Var3 == null || !SharedConfig.adaptableColorInBrowser) ? org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Pk, false) : q3Var3.getActionBarColor(), true);
                o0 o0Var3 = this.f40335d0;
                q3 q3Var4 = this.f40347q0[0];
                o0Var3.setIsTonsite(q3Var4 != null && q3Var4.e());
                o0 o0Var4 = this.f40335d0;
                q3 q3Var5 = this.f40347q0[0];
                o0Var4.setIsLocal(q3Var5 != null && q3Var5.d());
                AnimatorSet animatorSet = this.f40348r0;
                Objects.requireNonNull(animatorSet);
                AndroidUtilities.runOnUIThread(new lt0(animatorSet, 4));
            }
            if (!z10) {
                this.K0.f(true);
            }
            k4 k4Var = this.f40347q0[z10 ? 1 : 0].f41497c;
            if (z10) {
                obj = i0.a.i(2, this.Z);
            }
            this.f40347q0[z10 ? 1 : 0].b();
            if (obj instanceof TLRPC.WebPage) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) obj;
                this.f40347q0[z10 ? 1 : 0].setWeb(null);
                this.f40347q0[z10 ? 1 : 0].setType(0);
                TL_iv.Page page = webPage.cached_page;
                k4Var.C = page.rtl;
                k4Var.A = webPage;
                int size = page.blocks.size();
                int i13 = 0;
                while (i13 < size) {
                    TL_iv.PageBlock pageBlock = webPage.cached_page.blocks.get(i13);
                    if (i13 == 0) {
                        pageBlock.first = true;
                        if (pageBlock instanceof TL_iv.pageBlockCover) {
                            TL_iv.pageBlockCover pageblockcover = (TL_iv.pageBlockCover) pageBlock;
                            TL_iv.RichText richTextW = w(0, pageblockcover);
                            TL_iv.RichText richTextW2 = w(1, pageblockcover);
                            if (((richTextW != null && !(richTextW instanceof TL_iv.textEmpty)) || (richTextW2 != null && !(richTextW2 instanceof TL_iv.textEmpty))) && size > 1) {
                                TL_iv.PageBlock pageBlock2 = webPage.cached_page.blocks.get(1);
                                if (pageBlock2 instanceof TL_iv.pageBlockChannel) {
                                    k4Var.B = (TL_iv.pageBlockChannel) pageBlock2;
                                }
                            }
                        }
                    } else {
                        if (i13 != 1 || k4Var.B == null) {
                        }
                        i13++;
                    }
                    k4Var.F(k4Var, pageBlock, 0, 0, i13 == size + (-1) ? i13 : 0);
                    i13++;
                }
                k4Var.l();
                if (this.Z.size() == 1 || i10 == -1) {
                    SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("articles", 0);
                    String str = "article" + webPage.f22533id;
                    int i14 = sharedPreferences.getInt(str, -1);
                    boolean z11 = sharedPreferences.getBoolean(str + "r", true);
                    Point point = AndroidUtilities.displaySize;
                    if (z11 == (point.x <= point.y ? 0 : 1)) {
                        iDp = sharedPreferences.getInt(str + "o", 0) - this.f40347q0[z10 ? 1 : 0].f41496b.getPaddingTop();
                    } else {
                        iDp = AndroidUtilities.dp(10.0f);
                    }
                    if (i14 != -1) {
                        this.f40347q0[z10 ? 1 : 0].d.h1(i14, iDp);
                    }
                } else {
                    f2.k0 k0Var = this.f40347q0[z10 ? 1 : 0].d;
                    z3 z3Var2 = this.G;
                    k0Var.h1(z3Var2 == null ? 0 : 1, z3Var2 != null ? AndroidUtilities.dp(32.0f) : 0);
                }
            } else if (obj instanceof d3) {
                this.f40347q0[z10 ? 1 : 0].setType(1);
                this.f40347q0[z10 ? 1 : 0].g();
                this.f40347q0[z10 ? 1 : 0].setWeb((d3) obj);
            }
            if (!z10) {
                m(null);
            }
            i0(false);
            f0();
        }
    }

    public final void f0() {
        q3[] q3VarArr;
        q3 q3Var;
        if (this.f40335d0 == null || (q3Var = (q3VarArr = this.f40347q0)[0]) == null || q3VarArr[1] == null) {
            return;
        }
        float translationX = q3Var.getVisibility() != 0 ? 0.0f : 1.0f - (this.f40347q0[0].getTranslationX() / this.f40347q0[0].getWidth());
        float f10 = 1.0f - translationX;
        o0 o0Var = this.f40335d0;
        o0Var.d[0] = this.f40347q0[0].getProgress();
        o0Var.invalidate();
        o0 o0Var2 = this.f40335d0;
        o0Var2.d[1] = this.f40347q0[1].getProgress();
        o0Var2.invalidate();
        this.f40335d0.setTransitionProgress(f10);
        o0 o0Var3 = this.f40335d0;
        if (!o0Var3.S && !o0Var3.P) {
            ArticleViewer$WindowView articleViewer$WindowView = this.f40333b0;
            if (articleViewer$WindowView.f24027e || articleViewer$WindowView.f24028f) {
                boolean zJ = J();
                ArrayList arrayList = this.Z;
                if (zJ || arrayList.size() > 1) {
                    float fLerp = AndroidUtilities.lerp((this.f40347q0[0].f41502s || arrayList.size() > 1) ? 1.0f : 0.0f, (this.f40347q0[1].f41502s || arrayList.size() > 2) ? 1.0f : 0.0f, f10);
                    this.f40335d0.I.c(1.0f - fLerp, false);
                    this.f40335d0.L.f();
                    this.f40335d0.setBackButtonCached(fLerp > 0.5f);
                } else {
                    this.f40335d0.L.f();
                    this.f40335d0.setBackButtonCached(false);
                }
                this.f40335d0.setHasForward(this.f40347q0[0].v);
                this.f40335d0.setIsLocal(this.f40347q0[0].d());
                this.f40335d0.setIsLoaded(this.f40347q0[0].getWebView() != null && this.f40347q0[0].getWebView().f44024b);
            }
        }
        o0 o0Var4 = this.f40335d0;
        int actionBarColor = this.f40347q0[0].getActionBarColor();
        ArticleViewer$WindowView articleViewer$WindowView2 = this.f40333b0;
        o0Var4.b(0, this.V0.a(actionBarColor, articleViewer$WindowView2.f24027e || articleViewer$WindowView2.f24028f));
        o0 o0Var5 = this.f40335d0;
        int actionBarColor2 = this.f40347q0[1].getActionBarColor();
        ArticleViewer$WindowView articleViewer$WindowView3 = this.f40333b0;
        o0Var5.b(1, this.W0.a(actionBarColor2, articleViewer$WindowView3.f24027e || articleViewer$WindowView3.f24028f));
        this.f40335d0.d(i0.b.d(f10, this.f40347q0[0].getActionBarColor(), this.f40347q0[1].getActionBarColor()), false);
        this.f40335d0.setMenuType((translationX > 0.5f ? this.f40347q0[0] : this.f40347q0[1]).f41495a);
        z3 z3Var = this.G;
        if (z3Var != null) {
            z3Var.f45005c.invalidate();
            return;
        }
        ArticleViewer$WindowView articleViewer$WindowView4 = this.f40333b0;
        if (articleViewer$WindowView4 != null) {
            articleViewer$WindowView4.invalidate();
        }
    }

    public final void g(int i10, String str) {
        U();
        d3 d3Var = new d3();
        d3Var.v = str;
        this.Z.add(d3Var);
        this.f40335d0.h(false);
        e0(i10, d3Var, false);
    }

    public final boolean h(TLRPC.WebPage webPage, String str, int i10) {
        U();
        this.Z.add(webPage);
        this.f40335d0.h(false);
        e0(i10, webPage, false);
        return V(str, false);
    }

    public final void h0() {
        int searchIndex;
        int size;
        if (this.A != null || this.f40347q0[0].f()) {
            if (this.f40347q0[0].f()) {
                searchIndex = this.f40347q0[0].getWebView() == null ? 0 : this.f40347q0[0].getWebView().getSearchIndex();
                size = this.f40347q0[0].getWebView() == null ? 0 : this.f40347q0[0].getWebView().getSearchCount();
            } else {
                searchIndex = this.C;
                size = this.A.size();
            }
            this.f40344n0.setEnabled(size > 0 && searchIndex != 0);
            this.f40345o0.setEnabled(size > 0 && searchIndex != size + (-1));
            ImageView imageView = this.f40344n0;
            imageView.setAlpha(imageView.isEnabled() ? 1.0f : 0.5f);
            ImageView imageView2 = this.f40345o0;
            imageView2.setAlpha(imageView2.isEnabled() ? 1.0f : 0.5f);
            this.f40346p0.a();
            if (size < 0) {
                this.f40346p0.setText("");
                return;
            }
            if (size == 0) {
                this.f40346p0.setText(LocaleController.getString(R.string.NoResult));
            } else if (size == 1) {
                this.f40346p0.setText(LocaleController.getString(R.string.OneResult));
            } else {
                this.f40346p0.setText(String.format(LocaleController.getPluralString("CountOfResults", size), Integer.valueOf(searchIndex + 1), Integer.valueOf(size)));
            }
        }
    }

    public final void i0(boolean z10) {
        boolean z11 = false;
        this.f40335d0.g(0, this.f40347q0[0].getTitle(), z10);
        this.f40335d0.f(0, this.f40347q0[0].getSubtitle());
        this.f40335d0.e(0, this.f40347q0[0].f() && this.f40347q0[0].getWebView() != null && this.f40347q0[0].getWebView().A);
        this.f40335d0.g(1, this.f40347q0[1].getTitle(), z10);
        this.f40335d0.f(1, this.f40347q0[1].getSubtitle());
        o0 o0Var = this.f40335d0;
        if (this.f40347q0[1].f() && this.f40347q0[1].getWebView() != null && this.f40347q0[1].getWebView().A) {
            z11 = true;
        }
        o0Var.e(1, z11);
    }

    public final void k() {
        this.F0 = false;
        e3 e3Var = this.G0;
        if (e3Var != null) {
            this.f40333b0.removeCallbacks(e3Var);
            this.G0 = null;
        }
        e3 e3Var2 = this.H0;
        if (e3Var2 != null) {
            this.f40333b0.removeCallbacks(e3Var2);
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
        int i10 = 0;
        ValueAnimator duration = ValueAnimator.ofObject(new IntEvaluator(), Integer.valueOf(this.E0), Integer.valueOf(AndroidUtilities.dp(56.0f))).setDuration(180L);
        duration.setInterpolator(new DecelerateInterpolator());
        duration.addUpdateListener(new r(this, i10));
        duration.addListener(new u0(i10, b6Var));
        if (b6Var != null) {
            duration.setDuration(duration.getDuration() / 2);
        }
        duration.start();
    }

    public final void n() {
        b3 b3Var;
        lh.w wVar = this.f40347q0[0].f41496b;
        if (wVar == null || !this.S) {
            return;
        }
        float measuredHeight = wVar.getMeasuredHeight() / 2.0f;
        float f10 = 0.0f;
        b3 b3Var2 = null;
        for (int i10 = 0; i10 < wVar.getChildCount(); i10++) {
            View childAt = wVar.getChildAt(i10);
            if (childAt instanceof b3) {
                float measuredHeight2 = (childAt.getMeasuredHeight() / 2.0f) + childAt.getTop();
                if (b3Var2 == null || Math.abs(measuredHeight - measuredHeight2) < Math.abs(measuredHeight - f10)) {
                    b3Var2 = (b3) childAt;
                    f10 = measuredHeight2;
                }
            }
        }
        boolean z10 = PhotoViewer.t1().f35629f;
        if (z10 || ((b3Var = this.f37293x) != null && b3Var != b3Var2 && this.f37292w != null)) {
            VideoPlayerHolderBase videoPlayerHolderBase = this.f37292w;
            if (videoPlayerHolderBase != null) {
                b3 b3Var3 = this.f37293x;
                long j10 = b3Var3.H.video_id;
                c3 c3VarA = c3.a(videoPlayerHolderBase, b3Var3);
                b3Var3.c(c3VarA);
                this.f37294y.k(c3VarA, j10);
                b3 b3Var4 = this.f37293x;
                c3 c3Var = b3Var4.I;
                if (c3Var != null) {
                    Bitmap bitmap = c3Var.f36927b;
                    if (bitmap != null) {
                        b3Var4.f36685e.setImageBitmap(bitmap);
                    }
                    this.f37293x.e(false);
                }
                this.f37292w.release(null);
            }
            this.f37292w = null;
            this.f37293x = null;
        }
        if (z10 || b3Var2 == null) {
            return;
        }
        d70 d70Var = b3Var2.f36682a;
        if (b3Var2.K != null && d70Var.f37292w == null) {
            d70Var.f37292w = new a3(b3Var2).with(b3Var2.f36687n);
            TLRPC.Document document = b3Var2.K;
            for (int i11 = 0; i11 < document.attributes.size(); i11++) {
                if (document.attributes.get(i11) instanceof TLRPC.TL_documentAttributeVideo) {
                    TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) document.attributes.get(i11);
                    b3Var2.h.a(tL_documentAttributeVideo.f22387w / tL_documentAttributeVideo.h, 0);
                }
            }
            TLRPC.WebPage webPage = b3Var2.f36683b.A;
            Uri uriPrepareUri = webPage != null ? FileStreamLoadOperation.prepareUri(((m4) d70Var).T, document, webPage) : null;
            if (uriPrepareUri != null) {
                VideoPlayerHolderBase videoPlayerHolderBase2 = d70Var.f37292w;
                c3 c3Var2 = b3Var2.I;
                videoPlayerHolderBase2.seekTo(c3Var2 == null ? 0L : c3Var2.f36926a);
                d70Var.f37292w.preparePlayer(uriPrepareUri, true, 1.0f);
                d70Var.f37292w.play();
            }
        }
        this.f37293x = b3Var2;
    }

    public final void o(boolean z10, boolean z11) {
        if (this.H == null || this.P0 || !this.R) {
            return;
        }
        int i10 = 0;
        if (this.V != 0 && Math.abs(this.X - System.currentTimeMillis()) >= 500) {
            Runnable runnable = this.W;
            if (runnable != null) {
                runnable.run();
                this.W = null;
            }
            this.V = 0;
        }
        if (this.V != 0) {
            return;
        }
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
                org.telegram.ui.Components.i81 i81Var = this.A0;
                if (i81Var != null && i81Var.P) {
                    i81Var.P = false;
                    i81Var.m();
                    i81Var.l(false);
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
        o0 o0Var = this.f40335d0;
        if (o0Var.P) {
            o0Var.h(false);
            return;
        }
        if (o0Var.S) {
            o0Var.k(false);
            return;
        }
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
                Object objK = com.google.android.recaptcha.internal.a.k(1, arrayList);
                if (objK instanceof d3) {
                    ((d3) objK).a();
                }
                if (objK instanceof TLRPC.WebPage) {
                    org.telegram.ui.web.e2.o((TLRPC.WebPage) objK);
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
        gf.t0 t0Var = this.Q0;
        if (t0Var != null) {
            t0Var.destroy();
            this.Q0 = null;
        }
        this.I = null;
        try {
            org.telegram.ui.ActionBar.e3 e3Var = this.f40338g0;
            if (e3Var != null) {
                e3Var.dismiss();
                this.f40338g0 = null;
            }
            while (true) {
                a0.h hVar = this.f37294y;
                if (i10 >= hVar.m()) {
                    hVar.b();
                    return;
                }
                c3 c3Var = (c3) hVar.n(i10);
                Bitmap bitmap = c3Var.f36927b;
                if (bitmap != null) {
                    bitmap.recycle();
                    c3Var.f36927b = null;
                }
                i10++;
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ArticleViewer$WindowView articleViewer$WindowView = this.f40333b0;
        Property property = View.ALPHA;
        animatorSet.playTogether(ObjectAnimator.ofFloat(articleViewer$WindowView, (Property<ArticleViewer$WindowView, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.f40334c0, (Property<n0, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.f40333b0, (Property<ArticleViewer$WindowView, Float>) View.TRANSLATION_X, 0.0f, AndroidUtilities.dp(56.0f)));
        this.V = 2;
        this.W = new d0(this, 7);
        animatorSet.setDuration(150L);
        animatorSet.setInterpolator(this.Y);
        animatorSet.addListener(new lh.h9(this, 5));
        this.X = System.currentTimeMillis();
        this.f40334c0.setLayerType(2, null);
        animatorSet.start();
    }

    public final void s() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.Z;
            if (i10 >= arrayList.size()) {
                arrayList.clear();
                t();
                return;
            }
            Object obj = arrayList.get(i10);
            if (obj instanceof d3) {
                q3 q3Var = this.f40347q0[0];
                if (q3Var != null && q3Var.F == obj) {
                    ((d3) obj).c(q3Var);
                }
                q3 q3Var2 = this.f40347q0[1];
                if (q3Var2 != null && q3Var2.F == obj) {
                    ((d3) obj).c(q3Var2);
                }
                ((d3) obj).a();
            } else if (obj instanceof TLRPC.WebPage) {
                org.telegram.ui.web.e2.o((TLRPC.WebPage) obj);
            }
            i10++;
        }
    }

    public final void t() {
        ArticleViewer$WindowView articleViewer$WindowView;
        if (this.H == null || (articleViewer$WindowView = this.f40333b0) == null) {
            return;
        }
        if (this.G == null) {
            try {
                if (articleViewer$WindowView.getParent() != null) {
                    ((WindowManager) this.H.getSystemService("window")).removeViewImmediate(this.f40333b0);
                }
                this.f40333b0 = null;
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }
        for (int i10 = 0; i10 < this.J.size(); i10++) {
            ((w1) this.J.get(i10)).a(true);
        }
        this.J.clear();
        try {
            this.H.getWindow().clearFlags(128);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        this.H = null;
        this.I = null;
        Y0 = null;
    }

    public m4(org.telegram.ui.ActionBar.n2 n2Var) {
        this.J = new ArrayList();
        this.U = 1;
        this.Y = new DecelerateInterpolator(1.5f);
        this.Z = new ArrayList();
        this.f40349s0 = new Paint();
        this.f40350t0 = new Paint();
        this.f40351u0 = new Paint();
        this.f40352v0 = new Paint();
        this.F0 = false;
        this.G0 = null;
        this.H0 = null;
        this.N0 = new AnimationNotificationsLocker(new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats});
        this.O0 = new n0[2];
        this.S0 = -1;
        d0 d0Var = new d0(this, 2);
        org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.h;
        this.V0 = new org.telegram.ui.Components.b5(d0Var, 320L, erVar);
        this.W0 = new org.telegram.ui.Components.b5(new d0(this, 4), 320L, erVar);
        this.F = true;
        this.G = new z3(this, n2Var);
        Y(n2Var.getParentActivity(), n2Var);
    }
}
