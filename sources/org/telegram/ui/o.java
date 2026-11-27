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
public final class o extends xi5 implements fn7 {
    public static Paint A1;
    public static Paint B1;
    public static Paint D1;
    public static TextPaint i1;
    public static TextPaint j1;
    public static TextPaint k1;
    public static TextPaint l1;
    public static TextPaint m1;
    public static TextPaint n1;
    public static TextPaint o1;
    public static TextPaint p1;
    public static Paint q1;
    public static Paint r1;
    public static Paint s1;
    public static Paint t1;
    public static Paint u1;
    public static Paint v1;
    public static Paint w1;
    public static Paint x1;
    public static Paint y1;
    public static Paint z1;
    public boolean A0;
    public final Paint B0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout C0;
    public TextView D0;
    public Rect E0;
    public hyc F0;
    public hyc G0;
    public int H0;
    public int I0;
    public int J0;
    public final boolean K;
    public int K0;
    public final tw L;
    public boolean L0;
    public Activity M;
    public bw M0;
    public org.telegram.ui.ActionBar.e N;
    public bw N0;
    public final ArrayList O;
    public wt O0;
    public View P;
    public int P0;
    public FrameLayout Q;
    public amb Q0;
    public TextureView R;
    public amb R0;
    public jx S;
    public de8 S0;
    public WebChromeClient.CustomViewCallback T;
    public final pn T0;
    public WindowInsets U;
    public final zc[] U0;
    public boolean V;
    public boolean V0;
    public boolean W;
    public e26 W0;
    public boolean X;
    public ze7 X0;
    public int Y;
    public int Y0;
    public int Z;
    public ValueAnimator Z0;
    public byte a0;
    public float a1;
    public Runnable b0;
    public final ll b1;
    public long c0;
    public final ll c1;
    public final DecelerateInterpolator d0;
    public final ArrayList e0;
    public WindowManager.LayoutParams f0;
    public ArticleViewer$WindowView g0;
    public a h0;
    public xt i0;
    public fb j0;
    public ys k0;
    public nx0 l0;
    public Paint m0;
    public Drawable n0;
    public Paint o0;
    public boolean p0;
    public float q0;
    public b6 r0;
    public ImageView s0;
    public ImageView t0;
    public in u0;
    public m[] v0;
    public AnimatorSet w0;
    public final Paint x0;
    public final Paint y0;
    public final Paint z0;
    public static final HashSet d1 = new HashSet();
    public static volatile o e1 = null;
    public static final b f1 = new rn("innerTranslationX", (byte) 0);
    public static final TextPaint g1 = new TextPaint(1);
    public static final ow h1 = new ow();
    public static final WeakHashMap C1 = new WeakHashMap();

    public o(org.telegram.ui.ActionBar.e eVar) {
        this.O = new ArrayList();
        this.Z = 1;
        this.d0 = new DecelerateInterpolator(1.5f);
        this.e0 = new ArrayList();
        this.x0 = new Paint();
        this.y0 = new Paint();
        this.z0 = new Paint();
        this.B0 = new Paint();
        this.L0 = false;
        this.M0 = null;
        this.N0 = null;
        this.T0 = new pn(new int[]{jn7.r, jn7.s});
        this.U0 = new zc[2];
        this.Y0 = -1;
        ys ysVar = new ys(this, (byte) 1);
        k43 k43Var = k43.h;
        this.b1 = new ll(ysVar, 320L, k43Var);
        this.c1 = new ll(new ys(this, (byte) 4), 320L, k43Var);
        this.K = true;
        this.L = new tw(this, eVar);
        W(eVar.getParentActivity(), eVar);
    }

    public static int A(TL_iv.RichText richText) {
        if (richText instanceof TL_iv.textFixed) {
            return A(richText.parentRichText) | 4;
        }
        if (richText instanceof TL_iv.textItalic) {
            return A(richText.parentRichText) | 2;
        }
        if (richText instanceof TL_iv.textBold) {
            return A(richText.parentRichText) | 1;
        }
        if (richText instanceof TL_iv.textUnderline) {
            return A(richText.parentRichText) | 16;
        }
        if (richText instanceof TL_iv.textStrike) {
            return A(richText.parentRichText) | 32;
        }
        if (richText instanceof TL_iv.textEmail) {
            return A(richText.parentRichText) | 8;
        }
        if (richText instanceof TL_iv.textPhone) {
            return A(richText.parentRichText) | 8;
        }
        if (richText instanceof TL_iv.textUrl) {
            int i = (((TL_iv.textUrl) richText).webpage_id > 0L ? 1 : (((TL_iv.textUrl) richText).webpage_id == 0L ? 0 : -1));
            TL_iv.RichText richText2 = richText.parentRichText;
            if (i != 0) {
                return A(richText2) | 512;
            }
            return A(richText2) | 8;
        } else if (richText instanceof TL_iv.textSubscript) {
            return A(richText.parentRichText) | 128;
        } else {
            if (richText instanceof TL_iv.textSuperscript) {
                return A(richText.parentRichText) | 256;
            }
            if (richText instanceof TL_iv.textMarked) {
                return A(richText.parentRichText) | 64;
            }
            if (richText != null) {
                return A(richText.parentRichText);
            }
            return 0;
        }
    }

    public static android.text.TextPaint B(defpackage.xi5 r21, org.telegram.tgnet.tl.TL_iv.RichText r22, org.telegram.tgnet.tl.TL_iv.RichText r23, org.telegram.tgnet.tl.TL_iv.PageBlock r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.o.B(xi5, org.telegram.tgnet.tl.TL_iv$RichText, org.telegram.tgnet.tl.TL_iv$RichText, org.telegram.tgnet.tl.TL_iv$PageBlock):android.text.TextPaint");
    }

    public static String C(TL_iv.RichText richText) {
        if (richText instanceof TL_iv.textFixed) {
            return C(((TL_iv.textFixed) richText).text);
        }
        if (richText instanceof TL_iv.textItalic) {
            return C(((TL_iv.textItalic) richText).text);
        }
        if (richText instanceof TL_iv.textBold) {
            return C(((TL_iv.textBold) richText).text);
        }
        if (richText instanceof TL_iv.textUnderline) {
            return C(((TL_iv.textUnderline) richText).text);
        }
        if (richText instanceof TL_iv.textStrike) {
            return C(((TL_iv.textStrike) richText).text);
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

    public static boolean F() {
        if (e1 != null) {
            return true;
        }
        return false;
    }

    public static boolean H(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockHeading1) && !(pageBlock instanceof TL_iv.pageBlockHeading2) && !(pageBlock instanceof TL_iv.pageBlockHeading3) && !(pageBlock instanceof TL_iv.pageBlockHeading4) && !(pageBlock instanceof TL_iv.pageBlockHeading5) && !(pageBlock instanceof TL_iv.pageBlockHeading6)) {
            return false;
        }
        return true;
    }

    public static boolean I(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof ww) && !(pageBlock instanceof yw)) {
            return false;
        }
        return true;
    }

    public static WindowInsets J(WindowInsets windowInsets) {
        if (Build.VERSION.SDK_INT >= 30) {
            return WindowInsets.CONSUMED;
        }
        return windowInsets.consumeSystemWindowInsets();
    }

    public static boolean M(uw uwVar) {
        boolean z;
        TL_iv.PageBlock w = w(uwVar.a);
        if (w instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) w;
            if (!pageblockdetails.open) {
                pageblockdetails.open = true;
                return true;
            }
        } else if (w instanceof uw) {
            uw uwVar2 = (uw) w;
            TL_iv.PageBlock w2 = w(uwVar2.b);
            if (w2 instanceof TL_iv.pageBlockDetails) {
                TL_iv.pageBlockDetails pageblockdetails2 = (TL_iv.pageBlockDetails) w2;
                if (!pageblockdetails2.open) {
                    pageblockdetails2.open = true;
                    z = true;
                    if (!M(uwVar2) || z) {
                        return true;
                    }
                }
            }
            z = false;
            if (!M(uwVar2)) {
            }
            return true;
        }
        return false;
    }

    public static void R(xi5 xi5Var) {
        if (xi5Var.b != null || xi5Var.f != null) {
            View view = xi5Var.f;
            xi5Var.c.e(true);
            xi5Var.b = null;
            xi5Var.d = null;
            xi5Var.f = null;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public static void c(String str, int i, FrameLayout frameLayout, tw twVar, vnb vnbVar) {
        String r = rv0.r(str);
        long e = yac.h(i).e();
        r7a.B(i).q0(p7a.a(e, r));
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
        tL_message.peer_id = tL_peerUser;
        tL_peerUser.user_id = e;
        TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
        tL_message.from_id = tL_peerUser2;
        tL_peerUser2.user_id = e;
        tL_message.message = r;
        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
        tL_message.media = tL_messageMediaWebPage;
        tL_messageMediaWebPage.webpage = new TLRPC.TL_webPage();
        TLRPC.WebPage webPage = tL_message.media.webpage;
        webPage.url = r;
        webPage.display_url = r;
        jn7.f(i).k(jn7.H1, new r47(i, tL_message, false, false));
        new d31(frameLayout, vnbVar).Q(2131624185, 36, hl.N2(ob6.M0(2131742571, null), -1, 0, new kt(twVar, e, (byte) 0), null)).k(true);
    }

    public static void e0(xi5 xi5Var) {
        TextPaint textPaint = o1;
        if (textPaint != null) {
            textPaint.setColor(aob.w0(null, aob.G6, false));
        }
        TextPaint textPaint2 = p1;
        if (textPaint2 != null) {
            textPaint2.setColor(aob.w0(null, aob.G6, false));
        }
        TextPaint textPaint3 = i1;
        if (textPaint3 != null) {
            textPaint3.setColor(aob.w0(null, aob.G6, false));
        }
        TextPaint textPaint4 = k1;
        if (textPaint4 != null) {
            textPaint4.setColor(aob.w0(null, aob.G6, false));
        }
        TextPaint textPaint5 = l1;
        if (textPaint5 != null) {
            textPaint5.setColor(-1);
        }
        TextPaint textPaint6 = m1;
        if (textPaint6 != null) {
            textPaint6.setColor(aob.w0(null, aob.G6, false));
        }
        TextPaint textPaint7 = n1;
        if (textPaint7 != null) {
            textPaint7.setColor(aob.w0(null, aob.y6, false));
        }
        TextPaint textPaint8 = j1;
        if (textPaint8 != null) {
            textPaint8.setColor(aob.w0(null, aob.y6, false));
        }
        o(xi5Var, true);
        ow owVar = h1;
        ow.a(xi5Var, owVar.d);
        ow.a(xi5Var, owVar.e);
        ow.a(xi5Var, owVar.g);
        ow.a(xi5Var, owVar.f);
        ow.a(xi5Var, owVar.h);
        ow.a(xi5Var, owVar.i);
        ow.a(xi5Var, owVar.j);
        ow.a(xi5Var, owVar.k);
        ow.a(xi5Var, owVar.l);
        ow.a(xi5Var, owVar.m);
        ow.a(xi5Var, owVar.n);
        ow.a(xi5Var, owVar.t);
        ow.a(xi5Var, owVar.s);
        ow.a(xi5Var, owVar.q);
        ow.a(xi5Var, owVar.r);
        ow.a(xi5Var, owVar.u);
        ow.a(xi5Var, owVar.w);
        ow.a(xi5Var, owVar.x);
        ow.a(xi5Var, owVar.b);
        ow.a(xi5Var, owVar.c);
        ow.a(xi5Var, owVar.o);
        ow.a(xi5Var, owVar.p);
        ow.a(xi5Var, owVar.v);
        ow.a(xi5Var, owVar.y);
        ow.a(xi5Var, owVar.z);
        ow.a(xi5Var, owVar.A);
    }

    public static SpannableStringBuilder f(int i, CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (charSequence != null) {
            spannableStringBuilder.append(charSequence);
        }
        if (spannableStringBuilder.length() > 0) {
            spannableStringBuilder.append((CharSequence) ", ");
        }
        spannableStringBuilder.append((CharSequence) ob6.M0(i, null));
        return spannableStringBuilder;
    }

    public static CharSequence g(xi5 xi5Var, ex exVar, cw cwVar) {
        StaticLayout staticLayout;
        if (cwVar != null && (staticLayout = cwVar.d) != null) {
            SpannableStringBuilder spannableStringBuilder = cwVar.E;
            if (spannableStringBuilder != null) {
                return spannableStringBuilder;
            }
            CharSequence text = staticLayout.getText();
            if (!(text instanceof Spannable)) {
                return text;
            }
            Spannable spannable = (Spannable) text;
            plb[] plbVarArr = (plb[]) spannable.getSpans(0, spannable.length(), plb.class);
            SpannableStringBuilder spannableStringBuilder2 = text;
            if (plbVarArr != null) {
                spannableStringBuilder2 = text;
                if (plbVarArr.length != 0) {
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannable);
                    for (plb plbVar : plbVarArr) {
                        int spanStart = spannableStringBuilder3.getSpanStart(plbVar);
                        int spanEnd = spannableStringBuilder3.getSpanEnd(plbVar);
                        if (spanStart >= 0 && spanEnd > spanStart) {
                            spannableStringBuilder3.setSpan(new uk(xi5Var, exVar, plbVar, (byte) 1), spanStart, spanEnd, 33);
                        }
                    }
                    cwVar.E = spannableStringBuilder3;
                    spannableStringBuilder2 = spannableStringBuilder3;
                }
            }
            return spannableStringBuilder2;
        }
        return null;
    }

    public static TL_iv.PageBlock h0(TL_iv.PageBlock pageBlock, uw uwVar) {
        if (pageBlock instanceof ww) {
            ww wwVar = (ww) pageBlock;
            ww wwVar2 = new ww();
            wwVar2.a = wwVar.a;
            wwVar2.b = wwVar.b;
            wwVar2.c = wwVar.c;
            wwVar2.d = h0(wwVar.d, uwVar);
            return wwVar2;
        } else if (pageBlock instanceof yw) {
            yw ywVar = (yw) pageBlock;
            yw ywVar2 = new yw();
            ywVar2.a = ywVar.a;
            ywVar2.b = ywVar.b;
            ywVar2.c = ywVar.c;
            ywVar2.d = h0(ywVar.d, uwVar);
            return ywVar2;
        } else {
            return uwVar;
        }
    }

    public static boolean i(defpackage.xi5 r25, defpackage.ex r26, android.view.MotionEvent r27, android.view.View r28, defpackage.cw r29, int r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.o.i(xi5, ex, android.view.MotionEvent, android.view.View, cw, int, int):boolean");
    }

    public static cw m(xi5 xi5Var, View view, CharSequence charSequence, TL_iv.RichText richText, int i, int i2, TL_iv.PageBlock pageBlock, ex exVar) {
        return n(xi5Var, view, charSequence, richText, i, i2, pageBlock, Layout.Alignment.ALIGN_NORMAL, 0, exVar);
    }

    public static defpackage.cw n(defpackage.xi5 r19, android.view.View r20, java.lang.CharSequence r21, org.telegram.tgnet.tl.TL_iv.RichText r22, int r23, int r24, org.telegram.tgnet.tl.TL_iv.PageBlock r25, android.text.Layout.Alignment r26, int r27, defpackage.ex r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.o.n(xi5, android.view.View, java.lang.CharSequence, org.telegram.tgnet.tl.TL_iv$RichText, int, int, org.telegram.tgnet.tl.TL_iv$PageBlock, android.text.Layout$Alignment, int, ex):cw");
    }

    public static void o(xi5 xi5Var, boolean z) {
        int i;
        if (s1 == null) {
            s1 = new Paint();
            r1 = new Paint();
            Paint paint = new Paint(1);
            u1 = paint;
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            u1.setStrokeWidth(hl.L(1.0f));
            Paint paint2 = new Paint();
            v1 = paint2;
            paint2.setStyle(style);
            v1.setStrokeWidth(hl.L(1.0f) / 2.0f);
            w1 = new Paint();
            x1 = new Paint();
            y1 = new Paint();
            z1 = new Paint(1);
            A1 = new Paint(1);
            q1 = new Paint();
            t1 = new Paint();
            B1 = new Paint(1);
        } else if (!z) {
            return;
        }
        int w0 = aob.w0(null, aob.d6, false);
        float green = Color.green(w0) * 0.7152f;
        float z2 = c00.z(Color.blue(w0), 0.0722f, green + (Color.red(w0) * 0.2126f), 255.0f);
        Paint paint3 = A1;
        if (z2 <= 0.705f) {
            i = -3041234;
        } else {
            i = -6551;
        }
        paint3.setColor(i);
        Paint paint4 = z1;
        int i2 = aob.K6;
        paint4.setColor(aob.w0(null, i2, false) & 872415231);
        z1.setPathEffect(f66.c());
        y1.setColor(aob.w0(null, i2, false) & 872415231);
        y1.setPathEffect(f66.c());
        Paint paint5 = v1;
        int i3 = aob.k6;
        paint5.setColor(aob.w0(null, i3, false));
        u1.setColor(aob.w0(null, i3, false));
        q1.setColor(251658240);
        t1.setColor(aob.w0(null, aob.d7, false));
        B1.setColor(aob.w0(null, i2, false) & 872415231);
        B1.setPathEffect(f66.c());
        int w02 = aob.w0(null, aob.M6, false);
        int red = Color.red(w02);
        int green2 = Color.green(w02);
        int blue = Color.blue(w02);
        x1.setColor(Color.argb(20, red, green2, blue));
        w1.setColor(Color.argb(34, red, green2, blue));
        int w03 = aob.w0(null, i2, false);
        r1.setColor(Color.argb(20, Color.red(w03), Color.green(w03), Color.blue(w03)));
        s1.setColor(aob.w0(null, aob.Ld, false));
    }

    public static void r(Canvas canvas, xi5 xi5Var, TL_iv.PageBlock pageBlock, int i) {
        int i2;
        int L;
        int L2;
        if (pageBlock != null && xi5Var != null && s1 != null) {
            int i3 = 0;
            if (pageBlock.bottom) {
                i2 = hl.L(6.0f);
            } else {
                i2 = 0;
            }
            int i4 = i - i2;
            int i5 = pageBlock.quoteLevels;
            if (i5 == 0) {
                if (pageBlock.level > 0) {
                    canvas.drawRect(hl.L(18.0f), 0.0f, hl.L(2.0f) + L2, i4, s1);
                    return;
                }
                return;
            }
            while (i5 != 0) {
                if ((i5 & 1) != 0) {
                    canvas.drawRect(hl.L((i3 * 14) + 18), 0.0f, hl.L(2.0f) + L, i4, s1);
                }
                i5 >>>= 1;
                i3++;
            }
        }
    }

    public static void s(defpackage.xi5 r2, android.graphics.Canvas r3, defpackage.zlb r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.o.s(xi5, android.graphics.Canvas, zlb, int):void");
    }

    public static TL_iv.RichText t(int i, TL_iv.PageBlock pageBlock) {
        if (i == 2) {
            TL_iv.RichText t = t(0, pageBlock);
            if (t instanceof TL_iv.textEmpty) {
                t = null;
            }
            TL_iv.RichText t2 = t(1, pageBlock);
            if (t2 instanceof TL_iv.textEmpty) {
                t2 = null;
            }
            if (t != null) {
                if (t2 == null) {
                    return t;
                }
                TL_iv.textPlain textplain = new TL_iv.textPlain();
                textplain.text = " ";
                TL_iv.textConcat textconcat = new TL_iv.textConcat();
                textconcat.texts.add(t);
                textconcat.texts.add(textplain);
                textconcat.texts.add(t2);
                return textconcat;
            } else if (t2 != null) {
                return t2;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockEmbedPost) {
            TL_iv.pageBlockEmbedPost pageblockembedpost = (TL_iv.pageBlockEmbedPost) pageBlock;
            if (i == 0) {
                return pageblockembedpost.caption.text;
            }
            if (i == 1) {
                return pageblockembedpost.caption.credit;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
            TL_iv.pageBlockSlideshow pageblockslideshow = (TL_iv.pageBlockSlideshow) pageBlock;
            if (i == 0) {
                return pageblockslideshow.caption.text;
            }
            if (i == 1) {
                return pageblockslideshow.caption.credit;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            TL_iv.pageBlockPhoto pageblockphoto = (TL_iv.pageBlockPhoto) pageBlock;
            if (i == 0) {
                return pageblockphoto.caption.text;
            }
            if (i == 1) {
                return pageblockphoto.caption.credit;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockCollage) {
            TL_iv.pageBlockCollage pageblockcollage = (TL_iv.pageBlockCollage) pageBlock;
            if (i == 0) {
                return pageblockcollage.caption.text;
            }
            if (i == 1) {
                return pageblockcollage.caption.credit;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockEmbed) {
            TL_iv.pageBlockEmbed pageblockembed = (TL_iv.pageBlockEmbed) pageBlock;
            if (i == 0) {
                return pageblockembed.caption.text;
            }
            if (i == 1) {
                return pageblockembed.caption.credit;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            return ((TL_iv.pageBlockBlockquote) pageBlock).caption;
        } else {
            if (pageBlock instanceof TL_iv.pageBlockVideo) {
                TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
                if (i == 0) {
                    return pageblockvideo.caption.text;
                }
                if (i == 1) {
                    return pageblockvideo.caption.credit;
                }
            } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                return ((TL_iv.pageBlockPullquote) pageBlock).caption;
            } else {
                if (pageBlock instanceof TL_iv.pageBlockAudio) {
                    TL_iv.pageBlockAudio pageblockaudio = (TL_iv.pageBlockAudio) pageBlock;
                    if (i == 0) {
                        return pageblockaudio.caption.text;
                    }
                    if (i == 1) {
                        return pageblockaudio.caption.credit;
                    }
                } else if (pageBlock instanceof TL_iv.pageBlockCover) {
                    return t(i, ((TL_iv.pageBlockCover) pageBlock).cover);
                } else {
                    if (pageBlock instanceof TL_iv.pageBlockMap) {
                        TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock;
                        if (i == 0) {
                            return pageblockmap.caption.text;
                        }
                        if (i == 1) {
                            return pageblockmap.caption.credit;
                        }
                    }
                }
            }
        }
        return null;
    }

    public static o u() {
        o oVar;
        o oVar2 = e1;
        if (oVar2 == null) {
            synchronized (o.class) {
                oVar = e1;
                if (oVar == null) {
                    oVar = new o();
                    e1 = oVar;
                }
            }
            return oVar;
        }
        return oVar2;
    }

    public static View v(View view) {
        n69 n69Var;
        if (view instanceof yu) {
            n69 n69Var2 = ((yu) view).d;
            if (n69Var2 != null) {
                return v(n69Var2.a);
            }
            return view;
        } else if ((view instanceof bv) && (n69Var = ((bv) view).d) != null) {
            return v(n69Var.a);
        } else {
            return view;
        }
    }

    public static TL_iv.PageBlock w(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof ww) {
            TL_iv.PageBlock pageBlock2 = ((ww) pageBlock).d;
            if (pageBlock2 != null) {
                return w(pageBlock2);
            }
            return pageBlock2;
        } else if (pageBlock instanceof yw) {
            TL_iv.PageBlock pageBlock3 = ((yw) pageBlock).d;
            if (pageBlock3 != null) {
                return w(pageBlock3);
            }
            return pageBlock3;
        } else {
            return pageBlock;
        }
    }

    public static TL_iv.RichText x(TL_iv.RichText richText) {
        if (richText == null) {
            return null;
        }
        if (richText instanceof TL_iv.textFixed) {
            return x(((TL_iv.textFixed) richText).text);
        }
        if (richText instanceof TL_iv.textItalic) {
            return x(((TL_iv.textItalic) richText).text);
        }
        if (richText instanceof TL_iv.textBold) {
            return x(((TL_iv.textBold) richText).text);
        }
        if (richText instanceof TL_iv.textUnderline) {
            return x(((TL_iv.textUnderline) richText).text);
        }
        if (richText instanceof TL_iv.textStrike) {
            return x(((TL_iv.textStrike) richText).text);
        }
        if (richText instanceof TL_iv.textEmail) {
            return x(((TL_iv.textEmail) richText).text);
        }
        if (richText instanceof TL_iv.textUrl) {
            return x(((TL_iv.textUrl) richText).text);
        }
        if (richText instanceof TL_iv.textAnchor) {
            x(((TL_iv.textAnchor) richText).text);
            return richText;
        } else if (richText instanceof TL_iv.textSubscript) {
            return x(((TL_iv.textSubscript) richText).text);
        } else {
            if (richText instanceof TL_iv.textSuperscript) {
                return x(((TL_iv.textSuperscript) richText).text);
            }
            if (richText instanceof TL_iv.textMarked) {
                return x(((TL_iv.textMarked) richText).text);
            }
            if (richText instanceof TL_iv.textPhone) {
                return x(((TL_iv.textPhone) richText).text);
            }
            if (richText instanceof TL_iv.textSpoiler) {
                return x(((TL_iv.textSpoiler) richText).text);
            }
            return richText;
        }
    }

    public static CharSequence y(TL_iv.RichText richText) {
        if (richText == null) {
            return "";
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
        if (richText instanceof TL_iv.textPlain) {
            return ((TL_iv.textPlain) richText).text;
        }
        if (richText instanceof TL_iv.textAnchor) {
            return y(((TL_iv.textAnchor) richText).text);
        }
        if (richText instanceof TL_iv.textEmpty) {
            return "";
        }
        if (richText instanceof TL_iv.textConcat) {
            StringBuilder sb = new StringBuilder();
            int size = richText.texts.size();
            for (int i = 0; i < size; i++) {
                sb.append(y(richText.texts.get(i)));
            }
            return sb;
        } else if (richText instanceof TL_iv.textSubscript) {
            return y(((TL_iv.textSubscript) richText).text);
        } else {
            if (richText instanceof TL_iv.textSuperscript) {
                return y(((TL_iv.textSuperscript) richText).text);
            }
            if (richText instanceof TL_iv.textMarked) {
                return y(((TL_iv.textMarked) richText).text);
            }
            if (!(richText instanceof TL_iv.textPhone)) {
                return "";
            }
            return y(((TL_iv.textPhone) richText).text);
        }
    }

    public static CharSequence z(xi5 xi5Var, TLRPC.WebPage webPage, View view, TL_iv.RichText richText, TL_iv.RichText richText2, TL_iv.PageBlock pageBlock, int i) {
        plb plbVar;
        plb plbVar2;
        TextPaint textPaint = null;
        if (richText2 == null) {
            return null;
        }
        if (richText2 instanceof TL_iv.textFixed) {
            return z(xi5Var, webPage, view, richText, ((TL_iv.textFixed) richText2).text, pageBlock, i);
        }
        if (richText2 instanceof TL_iv.textItalic) {
            return z(xi5Var, webPage, view, richText, ((TL_iv.textItalic) richText2).text, pageBlock, i);
        }
        if (richText2 instanceof TL_iv.textBold) {
            return z(xi5Var, webPage, view, richText, ((TL_iv.textBold) richText2).text, pageBlock, i);
        }
        if (richText2 instanceof TL_iv.textUnderline) {
            return z(xi5Var, webPage, view, richText, ((TL_iv.textUnderline) richText2).text, pageBlock, i);
        }
        if (richText2 instanceof TL_iv.textStrike) {
            return z(xi5Var, webPage, view, richText, ((TL_iv.textStrike) richText2).text, pageBlock, i);
        }
        if (richText2 instanceof TL_iv.textEmail) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(z(xi5Var, webPage, view, richText, ((TL_iv.textEmail) richText2).text, pageBlock, i));
            MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), MetricAffectingSpan.class);
            if (spannableStringBuilder.length() != 0) {
                if (metricAffectingSpanArr == null || metricAffectingSpanArr.length == 0) {
                    textPaint = B(xi5Var, richText, richText2, pageBlock);
                }
                spannableStringBuilder.setSpan(new plb(textPaint, "mailto:" + C(richText2)), 0, spannableStringBuilder.length(), 33);
            }
            return spannableStringBuilder;
        }
        long j = 0;
        if (richText2 instanceof TL_iv.textUrl) {
            TL_iv.textUrl texturl = (TL_iv.textUrl) richText2;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(z(xi5Var, webPage, view, richText, texturl.text, pageBlock, i));
            MetricAffectingSpan[] metricAffectingSpanArr2 = (MetricAffectingSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), MetricAffectingSpan.class);
            if (metricAffectingSpanArr2 == null || metricAffectingSpanArr2.length == 0) {
                textPaint = B(xi5Var, richText, richText2, pageBlock);
            }
            if (texturl.webpage_id != 0) {
                plbVar2 = new plb(textPaint, C(richText2));
            } else {
                plbVar2 = new plb(textPaint, C(richText2));
            }
            if (spannableStringBuilder2.length() != 0) {
                spannableStringBuilder2.setSpan(plbVar2, 0, spannableStringBuilder2.length(), 33);
            }
            return spannableStringBuilder2;
        } else if (richText2 instanceof TL_iv.textPlain) {
            return ((TL_iv.textPlain) richText2).text;
        } else {
            if (richText2 instanceof TL_iv.textAnchor) {
                TL_iv.textAnchor textanchor = (TL_iv.textAnchor) richText2;
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(z(xi5Var, webPage, view, richText, textanchor.text, pageBlock, i));
                String str = textanchor.name;
                ?? metricAffectingSpan = new MetricAffectingSpan();
                metricAffectingSpan.a = str.toLowerCase();
                spannableStringBuilder3.setSpan(metricAffectingSpan, 0, spannableStringBuilder3.length(), 17);
                return spannableStringBuilder3;
            }
            if (!(richText2 instanceof TL_iv.textEmpty)) {
                char c = '\n';
                int i2 = 1;
                if (richText2 instanceof TL_iv.textConcat) {
                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                    int size = richText2.texts.size();
                    int i3 = 0;
                    while (i3 < size) {
                        TL_iv.RichText richText3 = richText2.texts.get(i3);
                        TL_iv.RichText x = x(richText3);
                        int i4 = (i < 0 || !(richText3 instanceof TL_iv.textUrl) || ((TL_iv.textUrl) richText3).webpage_id == j) ? 0 : i2;
                        if (i4 != 0 && spannableStringBuilder4.length() != 0 && spannableStringBuilder4.charAt(spannableStringBuilder4.length() - i2) != c) {
                            spannableStringBuilder4.append((CharSequence) " ");
                            spannableStringBuilder4.setSpan(new Object(), spannableStringBuilder4.length() - i2, spannableStringBuilder4.length(), 33);
                        }
                        int i5 = i3;
                        int i6 = i2;
                        CharSequence z = z(xi5Var, webPage, view, richText, richText3, pageBlock, i);
                        int A = A(x);
                        int length = spannableStringBuilder4.length();
                        spannableStringBuilder4.append(z);
                        if (A != 0 && !(z instanceof SpannableStringBuilder)) {
                            if ((A & 8) == 0 && (A & 512) == 0) {
                                if (length != spannableStringBuilder4.length()) {
                                    TextPaint B = B(xi5Var, richText, x, pageBlock);
                                    ?? metricAffectingSpan2 = new MetricAffectingSpan();
                                    metricAffectingSpan2.a = B;
                                    spannableStringBuilder4.setSpan(metricAffectingSpan2, length, spannableStringBuilder4.length(), 33);
                                }
                            } else {
                                String C = C(richText3);
                                if (C == null) {
                                    C = C(richText);
                                }
                                if ((A & 512) != 0) {
                                    plbVar = new plb(B(xi5Var, richText, x, pageBlock), C);
                                } else {
                                    plbVar = new plb(B(xi5Var, richText, x, pageBlock), C);
                                }
                                if (length != spannableStringBuilder4.length()) {
                                    spannableStringBuilder4.setSpan(plbVar, length, spannableStringBuilder4.length(), 33);
                                }
                            }
                        }
                        if (i4 != 0 && i5 != size - 1) {
                            spannableStringBuilder4.append((CharSequence) " ");
                            spannableStringBuilder4.setSpan(new Object(), spannableStringBuilder4.length() - 1, spannableStringBuilder4.length(), 33);
                        }
                        i3 = i5 + 1;
                        i2 = i6;
                        c = '\n';
                        j = 0;
                    }
                    return spannableStringBuilder4;
                } else if (richText2 instanceof TL_iv.textSubscript) {
                    return z(xi5Var, webPage, view, richText, ((TL_iv.textSubscript) richText2).text, pageBlock, i);
                } else {
                    if (richText2 instanceof TL_iv.textSuperscript) {
                        return z(xi5Var, webPage, view, richText, ((TL_iv.textSuperscript) richText2).text, pageBlock, i);
                    }
                    if (richText2 instanceof TL_iv.textMarked) {
                        SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(z(xi5Var, webPage, view, richText, ((TL_iv.textMarked) richText2).text, pageBlock, i));
                        MetricAffectingSpan[] metricAffectingSpanArr3 = (MetricAffectingSpan[]) spannableStringBuilder5.getSpans(0, spannableStringBuilder5.length(), MetricAffectingSpan.class);
                        if (spannableStringBuilder5.length() != 0) {
                            if (metricAffectingSpanArr3 == null || metricAffectingSpanArr3.length == 0) {
                                textPaint = B(xi5Var, richText, richText2, pageBlock);
                            }
                            ?? metricAffectingSpan3 = new MetricAffectingSpan();
                            metricAffectingSpan3.a = textPaint;
                            spannableStringBuilder5.setSpan(metricAffectingSpan3, 0, spannableStringBuilder5.length(), 33);
                        }
                        return spannableStringBuilder5;
                    } else if (richText2 instanceof TL_iv.textSpoiler) {
                        SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder(z(xi5Var, webPage, view, richText, ((TL_iv.textSpoiler) richText2).text, pageBlock, i));
                        if (spannableStringBuilder6.length() != 0) {
                            ?? obj = new Object();
                            obj.a |= 256;
                            spannableStringBuilder6.setSpan(new smb(obj, 0), 0, spannableStringBuilder6.length(), 33);
                        }
                        return spannableStringBuilder6;
                    } else if (richText2 instanceof TL_iv.textPhone) {
                        SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder(z(xi5Var, webPage, view, richText, ((TL_iv.textPhone) richText2).text, pageBlock, i));
                        MetricAffectingSpan[] metricAffectingSpanArr4 = (MetricAffectingSpan[]) spannableStringBuilder7.getSpans(0, spannableStringBuilder7.length(), MetricAffectingSpan.class);
                        if (spannableStringBuilder7.length() != 0) {
                            if (metricAffectingSpanArr4 == null || metricAffectingSpanArr4.length == 0) {
                                textPaint = B(xi5Var, richText, richText2, pageBlock);
                            }
                            spannableStringBuilder7.setSpan(new plb(textPaint, "tel:" + C(richText2)), 0, spannableStringBuilder7.length(), 33);
                        }
                        return spannableStringBuilder7;
                    } else if (richText2 instanceof TL_iv.textImage) {
                        TL_iv.textImage textimage = (TL_iv.textImage) richText2;
                        TLRPC.Document a = dx.a(webPage, textimage.document_id);
                        TLRPC.Photo e = dx.e(webPage, textimage.photo_id);
                        if (a != null) {
                            SpannableStringBuilder spannableStringBuilder8 = new SpannableStringBuilder("*");
                            int L = hl.L(textimage.w);
                            int L2 = hl.L(textimage.h);
                            int abs = Math.abs(i);
                            if (L > abs) {
                                L2 = (int) (L2 * (abs / L));
                                L = abs;
                            }
                            if (view != null) {
                                int i7 = aob.d6;
                                ((o) xi5Var).getClass();
                                boolean z2 = hl.B(aob.w0(null, i7, false)) <= 0.705f;
                                ?? replacementSpan = new ReplacementSpan();
                                Locale locale = Locale.US;
                                String str2 = L + "_" + L2 + "_i";
                                replacementSpan.b = L;
                                replacementSpan.c = L2;
                                boolean z3 = z2;
                                ImageReceiver imageReceiver = new ImageReceiver(view);
                                replacementSpan.a = imageReceiver;
                                imageReceiver.K0 = true;
                                if (z3) {
                                    imageReceiver.h1 = new nhb((byte) 29);
                                }
                                imageReceiver.Z(jn5.b(a), str2, jn5.c(xb4.w(a.thumbs, 90, false, null, false), a), str2, null, -1L, null, webPage, 1);
                                spannableStringBuilder8.setSpan(replacementSpan, 0, spannableStringBuilder8.length(), 33);
                            }
                            return spannableStringBuilder8;
                        } else if (e instanceof qxc) {
                            qxc qxcVar = (qxc) e;
                            SpannableStringBuilder spannableStringBuilder9 = new SpannableStringBuilder("*");
                            int L3 = hl.L(textimage.w);
                            int L4 = hl.L(textimage.h);
                            int abs2 = Math.abs(i);
                            if (L3 > abs2) {
                                L4 = (int) (L4 * (abs2 / L3));
                                L3 = abs2;
                            }
                            if (view != null) {
                                ?? replacementSpan2 = new ReplacementSpan();
                                replacementSpan2.b = L3;
                                replacementSpan2.c = L4;
                                ImageReceiver imageReceiver2 = new ImageReceiver(view);
                                replacementSpan2.a = imageReceiver2;
                                imageReceiver2.K0 = true;
                                rxc.g(qxcVar, imageReceiver2, new kc((byte) 10));
                                spannableStringBuilder9.setSpan(replacementSpan2, 0, spannableStringBuilder9.length(), 33);
                            }
                            return spannableStringBuilder9;
                        }
                    } else if (richText2 instanceof TL_iv.textMath) {
                        TL_iv.textMath textmath = (TL_iv.textMath) richText2;
                        if (textmath.bitmap == null && !textmath.tried) {
                            textmath.tried = true;
                            qz5 a2 = qz5.a(textmath.source, hl.L(20.0f), true);
                            if (a2 != null) {
                                textmath.w = a2.b;
                                textmath.h = a2.c;
                                textmath.depth = a2.d;
                                textmath.bitmap = a2.a;
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
                            int i8 = textmath.w;
                            int i9 = textmath.h;
                            int i10 = aob.G6;
                            ((o) xi5Var).getClass();
                            spannableStringBuilder10.setSpan(new mlb(view, bitmap, i8, i9, aob.w0(null, i10, false), textmath.depth), 0, spannableStringBuilder10.length(), 33);
                            String str4 = textmath.source;
                            if (str4 != null && !str4.isEmpty()) {
                                spannableStringBuilder10.setSpan(new fmb(textmath.source), 0, spannableStringBuilder10.length(), 33);
                            }
                            return spannableStringBuilder10;
                        }
                    } else {
                        return "not supported " + richText2;
                    }
                }
            }
            return "";
        }
    }

    public final void D() {
        int color;
        int w0;
        int w02;
        boolean z;
        float x;
        ArrayList arrayList = this.e0;
        int size = arrayList.size();
        ArticleViewer$WindowView articleViewer$WindowView = this.g0;
        tw twVar = this.L;
        boolean z2 = false;
        if (size <= 1) {
            articleViewer$WindowView.e = false;
            articleViewer$WindowView.d = false;
            a aVar = this.h0;
            if (twVar != null) {
                x = twVar.J * twVar.c.getWidth();
            } else {
                x = aVar.getX();
            }
            AnimatorSet animatorSet = new AnimatorSet();
            float measuredWidth = aVar.getMeasuredWidth() - x;
            if (twVar != null) {
                animatorSet.playTogether(twVar.l(1.0f));
            } else {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.h0, View.TRANSLATION_X, aVar.getMeasuredWidth()), ObjectAnimator.ofFloat(this.g0, f1, aVar.getMeasuredWidth()));
            }
            animatorSet.setDuration(Math.max((int) ((420.0f / aVar.getMeasuredWidth()) * measuredWidth), 250));
            animatorSet.setInterpolator(k43.h);
            animatorSet.addListener(new d(this));
            animatorSet.start();
            this.V0 = true;
            return;
        }
        articleViewer$WindowView.f = true;
        articleViewer$WindowView.e = true;
        articleViewer$WindowView.h = this.K0;
        this.v0[1].setVisibility(0);
        this.v0[1].setAlpha(1.0f);
        this.v0[1].setTranslationX(0.0f);
        m mVar = this.v0[0];
        if (twVar == null) {
            color = 0;
        } else {
            color = this.m0.getColor();
        }
        mVar.setBackgroundColor(color);
        c0(-1, arrayList.get(arrayList.size() - 2), true);
        m mVar2 = this.v0[0];
        mVar2.getX();
        AnimatorSet animatorSet2 = new AnimatorSet();
        mVar2.getMeasuredWidth();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.v0[0], View.TRANSLATION_X, mVar2.getMeasuredWidth()));
        animatorSet2.setDuration(420L);
        animatorSet2.setInterpolator(k43.h);
        animatorSet2.addListener(new e(this));
        animatorSet2.start();
        xt xtVar = this.i0;
        m mVar3 = this.v0[0];
        if (mVar3 != null && xea.s0) {
            w0 = mVar3.getBackgroundColor();
        } else {
            w0 = aob.w0(null, aob.Gl, false);
        }
        xtVar.setMenuColors(w0);
        xt xtVar2 = this.i0;
        m mVar4 = this.v0[0];
        if (mVar4 != null && xea.s0) {
            w02 = mVar4.getActionBarColor();
        } else {
            w02 = aob.w0(null, aob.Gl, false);
        }
        xtVar2.d(w02, true);
        xt xtVar3 = this.i0;
        m mVar5 = this.v0[0];
        if (mVar5 != null && mVar5.d()) {
            z = true;
        } else {
            z = false;
        }
        xtVar3.setIsTonsite(z);
        xt xtVar4 = this.i0;
        m mVar6 = this.v0[0];
        if (mVar6 != null && mVar6.c()) {
            z2 = true;
        }
        xtVar4.setIsLocal(z2);
        this.V0 = true;
    }

    public final void E(int i) {
        int color;
        int w0;
        int w02;
        boolean z;
        float x;
        ArrayList arrayList = this.e0;
        int size = arrayList.size();
        ArticleViewer$WindowView articleViewer$WindowView = this.g0;
        tw twVar = this.L;
        boolean z2 = false;
        if (size <= 1) {
            articleViewer$WindowView.e = false;
            articleViewer$WindowView.d = false;
            a aVar = this.h0;
            if (twVar != null) {
                x = twVar.J * twVar.c.getWidth();
            } else {
                x = aVar.getX();
            }
            AnimatorSet animatorSet = new AnimatorSet();
            float measuredWidth = aVar.getMeasuredWidth() - x;
            if (twVar != null) {
                animatorSet.playTogether(twVar.l(1.0f));
            } else {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.h0, View.TRANSLATION_X, aVar.getMeasuredWidth()), ObjectAnimator.ofFloat(this.g0, f1, aVar.getMeasuredWidth()));
            }
            animatorSet.setDuration(Math.max((int) ((420.0f / aVar.getMeasuredWidth()) * measuredWidth), 250));
            animatorSet.setInterpolator(k43.h);
            animatorSet.addListener(new f(this));
            animatorSet.start();
            this.V0 = true;
            return;
        }
        articleViewer$WindowView.f = true;
        this.v0[1].setVisibility(0);
        this.v0[1].setAlpha(1.0f);
        this.v0[1].setTranslationX(0.0f);
        m mVar = this.v0[0];
        if (twVar == null) {
            color = 0;
        } else {
            color = this.m0.getColor();
        }
        mVar.setBackgroundColor(color);
        c0(-1, arrayList.get(i), true);
        m mVar2 = this.v0[0];
        mVar2.getX();
        AnimatorSet animatorSet2 = new AnimatorSet();
        mVar2.getMeasuredWidth();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.v0[0], View.TRANSLATION_X, mVar2.getMeasuredWidth()));
        animatorSet2.setDuration(420L);
        animatorSet2.setInterpolator(k43.h);
        animatorSet2.addListener(new g(this, i));
        animatorSet2.start();
        xt xtVar = this.i0;
        m mVar3 = this.v0[0];
        if (mVar3 != null && xea.s0) {
            w0 = mVar3.getBackgroundColor();
        } else {
            w0 = aob.w0(null, aob.Gl, false);
        }
        xtVar.setMenuColors(w0);
        xt xtVar2 = this.i0;
        m mVar4 = this.v0[0];
        if (mVar4 != null && xea.s0) {
            w02 = mVar4.getActionBarColor();
        } else {
            w02 = aob.w0(null, aob.Gl, false);
        }
        xtVar2.d(w02, true);
        xt xtVar3 = this.i0;
        m mVar5 = this.v0[0];
        if (mVar5 != null && mVar5.d()) {
            z = true;
        } else {
            z = false;
        }
        xtVar3.setIsTonsite(z);
        xt xtVar4 = this.i0;
        m mVar6 = this.v0[0];
        if (mVar6 != null && mVar6.c()) {
            z2 = true;
        }
        xtVar4.setIsLocal(z2);
        this.V0 = true;
    }

    public final boolean G() {
        ArrayList arrayList = this.e0;
        if (arrayList.size() <= 0 || !(arrayList.get(0) instanceof TLRPC.WebPage)) {
            return false;
        }
        return true;
    }

    public final void K() {
        this.W = false;
        int i = 0;
        while (true) {
            m[] mVarArr = this.v0;
            if (i < mVarArr.length) {
                mVarArr[i].a();
                i++;
            } else {
                try {
                    break;
                } catch (Exception e) {
                    cc4.g(e, true);
                }
            }
        }
        this.M.getWindow().clearFlags(128);
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.O;
            if (i2 < arrayList.size()) {
                ((j) arrayList.get(i2)).a(false);
                i2++;
            } else {
                this.h0.post(new ys(this, (byte) 11));
                jn7.f(this.Y).k(jn7.d1, new Object[0]);
                return;
            }
        }
    }

    public final boolean L(r47 r47Var, TLRPC.TL_webPage tL_webPage, String str, String str2) {
        TLRPC.TL_webPage tL_webPage2;
        boolean z;
        int lastIndexOf;
        String substring;
        boolean z2;
        ?? r5;
        String str3;
        int i;
        String lowerCase;
        TL_iv.Page page;
        if (this.M == null) {
            return false;
        }
        tw twVar = this.L;
        if (twVar == null && this.W) {
            return false;
        }
        org.telegram.ui.ActionBar.e eVar = this.N;
        if (eVar != null && (eVar.getParentLayout() instanceof ActionBarLayout)) {
            hl.t1((ActionBarLayout) this.N.getParentLayout());
        }
        if (r47Var != null) {
            if (tL_webPage == null) {
                tL_webPage2 = r47Var.k.media.webpage;
            } else {
                tL_webPage2 = tL_webPage;
            }
            if (tL_webPage2 != null && (page = tL_webPage2.cached_page) != null && page.local != null) {
                z = true;
            } else {
                z = false;
            }
            for (int i2 = 0; i2 < r47Var.k.entities.size(); i2++) {
                TLRPC.MessageEntity messageEntity = r47Var.k.entities.get(i2);
                if (messageEntity instanceof TLRPC.TL_messageEntityUrl) {
                    try {
                        String str4 = r47Var.k.message;
                        int i3 = messageEntity.offset;
                        String lowerCase2 = str4.substring(i3, messageEntity.length + i3).toLowerCase();
                        if (!TextUtils.isEmpty(tL_webPage2.cached_page.url)) {
                            lowerCase = tL_webPage2.cached_page.url.toLowerCase();
                        } else {
                            lowerCase = tL_webPage2.url.toLowerCase();
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
                        cc4.g(e, true);
                    }
                }
            }
            substring = null;
        } else if (str != null && (lastIndexOf = str.lastIndexOf(35)) != -1) {
            substring = str.substring(lastIndexOf + 1);
            tL_webPage2 = tL_webPage;
            z = false;
        } else {
            tL_webPage2 = tL_webPage;
            z = false;
            substring = null;
        }
        ArrayList arrayList = this.e0;
        if (twVar != null && !arrayList.isEmpty()) {
            z2 = z;
            r5 = 1;
        } else {
            z2 = z;
            r5 = 0;
        }
        if (r5 == 0) {
            arrayList.clear();
            this.h0.setTranslationX(0.0f);
            if (twVar != null) {
                twVar.J = 0.0f;
                twVar.c.invalidate();
                twVar.t();
                twVar.r();
            }
            this.h0.setTranslationY(0.0f);
            this.v0[0].setTranslationY(0.0f);
            this.v0[0].setTranslationX(0.0f);
            this.v0[1].setTranslationX(0.0f);
            this.v0[0].setAlpha(1.0f);
            this.g0.setInnerTranslationX(0.0f);
            this.v0[0].f();
            V(hl.L(56.0f));
        }
        if (twVar != null && rv0.R0) {
            twVar.a.d();
        }
        if (tL_webPage2 != null) {
            boolean e2 = e(tL_webPage2, substring, r5);
            if (!z2) {
                if (!e2 && substring != null) {
                    str3 = substring;
                } else {
                    str3 = null;
                }
                TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
                tL_messages_getWebPage.url = tL_webPage2.url;
                TL_iv.Page page2 = tL_webPage2.cached_page;
                if (!(page2 instanceof TL_iv.TL_pagePart_layer82) && !page2.part) {
                    tL_messages_getWebPage.hash = tL_webPage2.hash;
                } else {
                    tL_messages_getWebPage.hash = 0;
                }
                if (r47Var != null) {
                    i = r47Var.K1;
                } else {
                    i = yac.t0;
                }
                int i4 = i;
                ConnectionsManager.getInstance(i4).sendRequest(tL_messages_getWebPage, new ot((o) this, i4, tL_webPage2, r47Var, (boolean) r5, str3));
            }
        } else {
            d(r5, str2);
        }
        xt xtVar = this.i0;
        if (xtVar != null && r5 == 0) {
            xtVar.setIsLocal(this.v0[0].c());
        }
        this.U = null;
        if (twVar != null) {
            if (r5 == 0) {
                hl.B2(this.g0);
                twVar.d = this.g0;
                twVar.A();
                twVar.c.addView(this.g0, tre.c(-1.0f, -1));
            }
        } else if (!this.W) {
            WindowManager windowManager = (WindowManager) this.M.getSystemService("window");
            if (this.X) {
                try {
                    windowManager.removeView(this.g0);
                } catch (Exception unused) {
                }
            }
            try {
                WindowManager.LayoutParams layoutParams = this.f0;
                layoutParams.flags = -2013200384;
                if (Build.VERSION.SDK_INT >= 28) {
                    layoutParams.layoutInDisplayCutoutMode = 1;
                }
                this.g0.setFocusable(false);
                this.h0.setFocusable(false);
                windowManager.addView(this.g0, this.f0);
            } catch (Exception e3) {
                cc4.g(e3, true);
                return false;
            }
        } else {
            this.f0.flags &= -17;
            ((WindowManager) this.M.getSystemService("window")).updateViewLayout(this.g0, this.f0);
        }
        this.W = true;
        this.a0 = (byte) 1;
        if (r5 == 0) {
            if (twVar != null) {
                if (r5 != 0) {
                    twVar.a.e();
                } else if (!twVar.h) {
                    twVar.q(twVar.b);
                    twVar.o();
                }
            } else {
                this.g0.setAlpha(0.0f);
                this.h0.setAlpha(0.0f);
                AnimatorSet animatorSet = new AnimatorSet();
                ArticleViewer$WindowView articleViewer$WindowView = this.g0;
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(articleViewer$WindowView, property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.h0, property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.g0, View.TRANSLATION_X, hl.L(56.0f), 0.0f));
                this.b0 = new ys(this, (byte) 9);
                animatorSet.setDuration(150L);
                animatorSet.setInterpolator(this.d0);
                animatorSet.addListener(new bu(this));
                this.c0 = System.currentTimeMillis();
                hl.c3(new ve2(this, animatorSet, (byte) 26));
            }
        }
        this.h0.setLayerType(2, null);
        return true;
    }

    public final void N(long j, TLRPC.User user) {
        if (user != null && (this.M instanceof LaunchActivity)) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.id);
            bundle.putString("botUser", "webpage" + j);
            ((LaunchActivity) this.M).u0(new zu1(bundle), false, true);
            l(false, true);
        }
    }

    public final void O(String str, String str2, wt wtVar) {
        Activity activity = this.M;
        if (activity != null && !activity.isFinishing()) {
            m mVar = this.v0[0];
            if (mVar != null && mVar.c()) {
                String M0 = ob6.M0(2131747509, null);
                int indexOf = M0.indexOf("%");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(String.format(M0, str));
                if (indexOf >= 0) {
                    spannableStringBuilder.setSpan(new URLSpan(str), indexOf, str.length() + indexOf, 33);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, null, this.M);
                String M02 = ob6.M0(2131747506, null);
                id idVar = alertDialog$Builder.a;
                idVar.S = M02;
                idVar.U = spannableStringBuilder;
                idVar.i0 = false;
                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                alertDialog$Builder.j(ob6.M0(2131747544, null), new pt(this, str, str2, wtVar, (byte) 0));
                alertDialog$Builder.o();
                return;
            }
            P(str, str2, wtVar);
        }
    }

    public final void P(String str, String str2, wt wtVar) {
        tw twVar;
        wt wtVar2 = this.O0;
        if (wtVar2 != null) {
            wtVar2.a(false);
        }
        this.O0 = wtVar;
        if (this.H0 != 0) {
            ConnectionsManager.getInstance(this.Y).cancelRequest(this.H0, false);
            this.H0 = 0;
        }
        boolean[] zArr = new boolean[1];
        if (m01.n(this.M, str, false)) {
            if (this.e0.isEmpty() && (twVar = this.L) != null) {
                twVar.a(false);
                return;
            }
            return;
        }
        qt qtVar = new qt(this, str, zArr, wtVar);
        int i = this.J0 + 1;
        this.J0 = i;
        Z(true);
        TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
        tL_messages_getWebPage.url = str;
        tL_messages_getWebPage.hash = 0;
        this.H0 = ConnectionsManager.getInstance(this.Y).sendRequest(tL_messages_getWebPage, new rt(this, i, wtVar, str2, qtVar, tL_messages_getWebPage));
        if (wtVar != null) {
            wtVar.b = new ze7(this, i, wtVar, (byte) 5);
            wtVar.d();
        }
    }

    public final void Q() {
        int w0;
        int w02;
        TextView textView = this.D0;
        if (textView != null) {
            int i = aob.i6;
            hf0 f0 = aob.f0(aob.w0(null, i, false), 2, -1);
            uob M = yob.M(i);
            textView.setBackground(f0);
            yob.j(textView, f0, null, M, null);
            yob.X(this.D0, aob.E8, null);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.C0;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            yob.h(aob.G8, null, actionBarPopupWindow$ActionBarPopupWindowLayout);
        }
        ImageView imageView = this.s0;
        if (imageView != null) {
            yob.s(imageView, aob.G6, null, PorterDuff.Mode.MULTIPLY);
            ImageView imageView2 = this.s0;
            int i2 = aob.z8;
            yob.R(imageView2, aob.f0(aob.w0(null, i2, false), 1, -1), null, yob.M(i2), null);
        }
        ImageView imageView3 = this.t0;
        if (imageView3 != null) {
            yob.s(imageView3, aob.G6, null, PorterDuff.Mode.MULTIPLY);
            ImageView imageView4 = this.t0;
            int i3 = aob.z8;
            yob.R(imageView4, aob.f0(aob.w0(null, i3, false), 1, -1), null, yob.M(i3), null);
        }
        in inVar = this.u0;
        if (inVar != null) {
            yob.U(inVar, aob.G6, null);
        }
        xt xtVar = this.i0;
        if (xtVar != null) {
            m mVar = this.v0[0];
            if (mVar != null && xea.s0) {
                w0 = mVar.getBackgroundColor();
            } else {
                w0 = aob.w0(null, aob.Gl, false);
            }
            xtVar.setMenuColors(w0);
            xt xtVar2 = this.i0;
            m mVar2 = this.v0[0];
            if (mVar2 != null && xea.s0) {
                w02 = mVar2.getActionBarColor();
            } else {
                w02 = aob.w0(null, aob.Gl, false);
            }
            xtVar2.d(w02, true);
        }
        this.m0.setColor(aob.w0(null, aob.Gl, false));
    }

    public final void S() {
        int K0;
        int i;
        boolean z = false;
        m mVar = this.v0[0];
        if (mVar.c.F != null && (K0 = mVar.d.K0()) != -1) {
            View m = this.v0[0].d.m(K0);
            if (m != null) {
                i = m.getTop();
            } else {
                i = 0;
            }
            String str = "article" + this.v0[0].c.F.id;
            SharedPreferences.Editor putInt = org.telegram.messenger.a.b.getSharedPreferences("articles", 0).edit().putInt(str, K0).putInt(str.concat("o"), i);
            String concat = str.concat("r");
            Point point = hl.q;
            if (point.x > point.y) {
                z = true;
            }
            putInt.putBoolean(concat, z).commit();
        }
    }

    public final boolean T(String str, boolean z) {
        String lowerCase;
        int i;
        Integer num = 0;
        if (!TextUtils.isEmpty(str)) {
            String lowerCase2 = str.toLowerCase();
            Integer num2 = (Integer) this.v0[0].c.h.get(lowerCase2);
            if (num2 != null) {
                TL_iv.textAnchor textanchor = (TL_iv.textAnchor) this.v0[0].c.r.get(lowerCase2);
                if (textanchor != null) {
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    boolean isEmpty = TextUtils.isEmpty(this.v0[0].c.F.cached_page.url);
                    m[] mVarArr = this.v0;
                    if (!isEmpty) {
                        lowerCase = mVarArr[0].c.F.cached_page.url.toLowerCase();
                    } else {
                        lowerCase = mVarArr[0].c.F.url.toLowerCase();
                    }
                    pageblockparagraph.text = rxc.d(textanchor.text, lowerCase, lowerCase2);
                    this.v0[0].c.getClass();
                    int I = ex.I(pageblockparagraph);
                    f89 x = this.v0[0].c.x(null, I);
                    View view = x.a;
                    this.v0[0].c.H(I, x, pageblockparagraph, 0, 0, false);
                    nx0 i2 = ik8.i(this.M, false, 1, null);
                    i2.v0 = false;
                    i2.w0 = false;
                    LinearLayout linearLayout = new LinearLayout(this.M);
                    linearLayout.setOrientation(1);
                    amb ambVar = new amb();
                    this.R0 = ambVar;
                    ambVar.Q(linearLayout);
                    this.R0.D = new zt(this, (byte) 1);
                    xb xbVar = new xb(this.M, (byte) 11);
                    xbVar.setTextSize(1, 16.0f);
                    xbVar.setTypeface(hl.o());
                    xbVar.setText(ob6.M0(2131748946, null));
                    if (this.v0[0].c.H) {
                        i = 5;
                    } else {
                        i = 3;
                    }
                    xbVar.setGravity(i | 16);
                    xbVar.setTextColor(aob.w0(null, aob.G6, false));
                    xbVar.setPadding(hl.L(18.0f), 0, hl.L(18.0f), 0);
                    linearLayout.addView(xbVar, new LinearLayout.LayoutParams(-1, hl.L(48.0f) + 1));
                    view.setTag("bottomSheet");
                    linearLayout.addView(view, tre.k(0.0f, 7.0f, 0.0f, 0.0f, -1, -2));
                    lmb m = this.R0.m(this.M);
                    tt ttVar = new tt(this, this.M, linearLayout, (byte) 0);
                    i2.z0 = new ut(this, (byte) 0);
                    ttVar.addView(linearLayout, -1, -2);
                    ttVar.addView(m, -1, -2);
                    i2.O = ttVar;
                    if (this.Q0.w()) {
                        this.Q0.e(false);
                    }
                    this.J = i2;
                    Y(i2);
                    return true;
                } else if (num2.intValue() >= 0 && num2.intValue() < this.v0[0].c.e.size()) {
                    TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) this.v0[0].c.e.get(num2.intValue());
                    TL_iv.PageBlock w = w(pageBlock);
                    if ((w instanceof uw) && M((uw) w)) {
                        this.v0[0].c.M();
                        this.v0[0].c.f();
                    }
                    int indexOf = this.v0[0].c.d.indexOf(pageBlock);
                    if (indexOf != -1) {
                        num2 = Integer.valueOf(indexOf);
                    }
                    Integer num3 = (Integer) this.v0[0].c.n.get(lowerCase2);
                    if (num3 != null) {
                        if (num3.intValue() == -1) {
                            this.v0[0].c.getClass();
                            int I2 = ex.I(pageBlock);
                            f89 x2 = this.v0[0].c.x(null, I2);
                            this.v0[0].c.H(I2, x2, pageBlock, 0, 0, false);
                            x2.a.measure(View.MeasureSpec.makeMeasureSpec(this.v0[0].b.getMeasuredWidth(), 1073741824), 0);
                            Integer num4 = (Integer) this.v0[0].c.n.get(lowerCase2);
                            if (num4.intValue() != -1) {
                                num = num4;
                            }
                        } else {
                            num = num3;
                        }
                    }
                    if (this.v0[0].c.J) {
                        num2 = Integer.valueOf(num2.intValue() + 1);
                    }
                    if (z) {
                        rna rnaVar = new rna(this.v0[0].getContext());
                        rnaVar.a = num2.intValue();
                        rnaVar.s = (-hl.L(56.0f)) - num.intValue();
                        this.v0[0].d.v0(rnaVar);
                        return true;
                    }
                    this.v0[0].d.g1(num2.intValue(), (-hl.L(56.0f)) - num.intValue());
                    return true;
                }
            }
        }
        return false;
    }

    public final void U(int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.o.U(int):void");
    }

    public final void V(int i) {
        xt xtVar = this.i0;
        if (xtVar != null && !xtVar.U && !xtVar.a0) {
            int j = Utilities.j(i, hl.L(56.0f), hl.L(24.0f));
            this.K0 = j;
            this.i0.setHeight(j);
            this.Q0.x = this.K0;
            int i2 = 0;
            while (true) {
                m[] mVarArr = this.v0;
                if (i2 < mVarArr.length) {
                    mVarArr[i2].b.setTopGlowOffset(this.K0);
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public final void W(Activity activity, org.telegram.ui.ActionBar.e eVar) {
        int i;
        boolean z;
        int w0;
        int i2;
        int i3;
        tw twVar;
        e26 e26Var = this.W0;
        if (e26Var != null) {
            e26Var.a();
            this.W0 = null;
        }
        this.W0 = LaunchActivity.c0();
        this.N = eVar;
        if (!(eVar instanceof s24)) {
            i = eVar.getCurrentAccount();
        } else {
            i = yac.t0;
        }
        this.Y = i;
        jn7.f(i).b(this, jn7.e2);
        jn7.f(this.Y).b(this, jn7.f2);
        jn7.f(this.Y).b(this, jn7.g2);
        jn7.f(this.Y).b(this, jn7.h2);
        jn7.f(this.Y).b(this, jn7.l4);
        Activity activity2 = this.M;
        if (activity2 != activity && (activity2 == null || !this.K || (twVar = this.L) == null || twVar.e == null)) {
            this.M = activity;
            this.a = org.telegram.messenger.a.b.getSharedPreferences("articles", 0).getInt("font_type", 0);
            o(this, false);
            this.m0 = new Paint();
            this.n0 = activity.getResources().getDrawable(2131231623);
            this.o0 = new Paint();
            ArticleViewer$WindowView articleViewer$WindowView = new ArticleViewer$WindowView(this, activity);
            this.g0 = articleViewer$WindowView;
            articleViewer$WindowView.setWillNotDraw(false);
            this.g0.setClipChildren(true);
            this.g0.setFocusable(false);
            a aVar = new a(this, activity);
            this.h0 = aVar;
            this.g0.addView(aVar, tre.e(-1, -1, 51));
            if (this.L == null) {
                this.g0.setFitsSystemWindows(true);
                this.h0.setOnApplyWindowInsetsListener(new us((byte) 0));
            }
            FrameLayout frameLayout = new FrameLayout(activity);
            this.Q = frameLayout;
            frameLayout.setBackgroundColor(-16777216);
            this.Q.setVisibility(4);
            this.g0.addView(this.Q, tre.c(-1.0f, -1));
            jx jxVar = new jx(activity);
            this.S = jxVar;
            jxVar.setVisibility(0);
            this.S.setBackgroundColor(-16777216);
            this.Q.addView(this.S, tre.e(-1, -1, 17));
            this.R = new TextureView(activity);
            this.v0 = new m[2];
            int i4 = 0;
            while (true) {
                m[] mVarArr = this.v0;
                if (i4 >= mVarArr.length) {
                    break;
                }
                m mVar = new m(this, activity);
                mVarArr[i4] = mVar;
                if (i4 == 0) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
                mVar.setVisibility(i3);
                this.h0.addView(mVar, tre.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
                mVar.b.setOnItemLongClickListener(new xs(this));
                mVar.b.setOnItemClickListener(new defpackage.o(this, mVar, (byte) 14));
                i4++;
            }
            this.h0.addView(new FrameLayout(activity), tre.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
            this.x0.setColor(-16777216);
            this.y0.setColor(-16777216);
            this.B0.setColor(-14408666);
            this.z0.setColor(-16777216);
            xt xtVar = new xt(this, activity);
            this.i0 = xtVar;
            if (this.L != null) {
                z = true;
            } else {
                z = false;
            }
            xtVar.f0 = z;
            this.h0.addView(xtVar, tre.e(-1, -2, 48));
            this.i0.setOnClickListener(new defpackage.t(this, activity, (byte) 17));
            this.i0.c0.addTextChangedListener(new c7(this, (byte) 1));
            fb fbVar = new fb(activity);
            this.j0 = fbVar;
            fbVar.setOpenProgress(0.0f);
            this.j0.x.j(new defpackage.y(this, (byte) 3));
            this.h0.addView(this.j0, tre.c(-1.0f, -1));
            this.k0 = new ys(this, (byte) 0);
            this.i0.M.setOnClickListener(new ws(this, (byte) 2));
            this.i0.M.setOnLongClickListener(new zs(this, (byte) 0));
            this.i0.setMenuListener(new y0(this, activity, (byte) 1));
            this.i0.P.setOnClickListener(new ws(this, (byte) 3));
            b6 b6Var = new b6(this.M, (byte) 1);
            this.r0 = b6Var;
            b6Var.setOnTouchListener(new q8((byte) 14));
            this.r0.setWillNotDraw(false);
            this.r0.setTranslationY(hl.L(51.0f));
            this.r0.setVisibility(4);
            this.r0.setFocusable(true);
            this.r0.setFocusableInTouchMode(true);
            this.r0.setClickable(true);
            this.r0.setPadding(0, hl.L(3.0f), 0, 0);
            this.h0.addView(this.r0, tre.e(-1, 51, 80));
            new rx5(this.g0, false, new vs(this, (byte) 0));
            ImageView imageView = new ImageView(this.M);
            this.s0 = imageView;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            this.s0.setImageResource(2131232179);
            ImageView imageView2 = this.s0;
            int i5 = aob.G6;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            yob.s(imageView2, i5, null, mode);
            ImageView imageView3 = this.s0;
            int i6 = aob.z8;
            yob.R(imageView3, aob.f0(aob.w0(null, i6, false), 1, -1), null, yob.M(i6), null);
            this.r0.addView(this.s0, tre.d(48, 48.0f, 53, 0.0f, 0.0f, 48.0f, 0.0f));
            this.s0.setOnClickListener(new ws(this, (byte) 0));
            this.s0.setContentDescription(ob6.M0(2131754774, null));
            ImageView imageView4 = new ImageView(this.M);
            this.t0 = imageView4;
            imageView4.setScaleType(scaleType);
            this.t0.setImageResource(2131232178);
            yob.s(this.t0, i5, null, mode);
            yob.R(this.t0, aob.f0(aob.w0(null, i6, false), 1, -1), null, yob.M(i6), null);
            this.r0.addView(this.t0, tre.d(48, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
            this.t0.setOnClickListener(new ws(this, (byte) 1));
            this.t0.setContentDescription(ob6.M0(2131754773, null));
            in inVar = new in(this.M, true, true, true);
            this.u0 = inVar;
            inVar.setScaleProperty(0.6f);
            this.u0.b(0.4f, 350L, k43.h);
            yob.U(this.u0, i5, null);
            this.u0.setTextSize(hl.L(15.0f));
            this.u0.setTypeface(hl.o());
            this.u0.setGravity(3);
            this.u0.getDrawable().N = hl.q.x;
            this.r0.addView(this.u0, tre.d(-2, -2.0f, 19, 18.0f, 0.0f, 108.0f, 0.0f));
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.f0 = layoutParams;
            layoutParams.height = -1;
            layoutParams.format = -3;
            layoutParams.width = -1;
            layoutParams.gravity = 51;
            layoutParams.type = 98;
            layoutParams.softInputMode = 48;
            layoutParams.flags = 131072;
            if (this.L == null) {
                w0 = aob.w0(null, aob.a7, true);
            } else {
                w0 = aob.w0(null, aob.a7, false);
            }
            if (hl.B(w0) >= 0.721f && Build.VERSION.SDK_INT >= 26) {
                i2 = 1808;
            } else {
                i2 = 1792;
            }
            this.z0.setColor(w0);
            this.A0 = true;
            WindowManager.LayoutParams layoutParams2 = this.f0;
            layoutParams2.systemUiVisibility = i2;
            layoutParams2.flags |= -2147417856;
            if (Build.VERSION.SDK_INT >= 28) {
                layoutParams2.layoutInDisplayCutoutMode = 1;
            }
            amb ambVar = new amb();
            this.Q0 = ambVar;
            ambVar.Q(this.v0[0].b);
            if (uc7.s1(this.Y).i4.r()) {
                this.Q0.k0 = new xs(this);
            }
            amb ambVar2 = this.Q0;
            ambVar2.z0 = this.v0[0].d;
            ambVar2.D = new zt(this, (byte) 0);
            this.h0.addView(ambVar2.m(activity));
            a aVar2 = this.h0;
            de8 de8Var = new de8(aVar2, aVar2);
            this.S0 = de8Var;
            de8Var.F = new xs(this);
            de8Var.E = new z8d(this, (byte) 6);
            this.m0.setColor(aob.w0(null, aob.Gl, false));
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
        nx0 nx0Var = this.J;
        if (nx0Var != null) {
            nx0Var.dismiss();
            this.J = null;
        }
        nx0 i = ik8.i(this.M, false, 1, null);
        try {
            str2 = URLDecoder.decode(str.replaceAll("\\+", "%2b"), "UTF-8");
        } catch (Exception e) {
            cc4.g(e, true);
            str2 = str;
        }
        i.P = str2;
        i.Q = false;
        i.R = true;
        CharSequence[] charSequenceArr = {ob6.M0(2131747544, null), ob6.M0(2131751732, null)};
        oh ohVar = new oh(this, str, (byte) 1);
        i.M = charSequenceArr;
        i.L = ohVar;
        i.I0 = new lt(this, (byte) 1);
        Y(i);
    }

    public final void Y(nx0 nx0Var) {
        if (this.M != null) {
            try {
                nx0 nx0Var2 = this.l0;
                if (nx0Var2 != null) {
                    nx0Var2.dismiss();
                    this.l0 = null;
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
            try {
                this.l0 = nx0Var;
                nx0Var.setCanceledOnTouchOutside(true);
                this.l0.setOnDismissListener(new lt(this, (byte) 0));
                nx0Var.show();
            } catch (Exception e2) {
                cc4.g(e2, true);
            }
        }
    }

    public final void Z(boolean z) {
        hl.r(this.k0);
        xt xtVar = this.i0;
        if (z) {
            xtVar.e0.a(false, 0.0f);
            this.i0.e0.a(true, 0.3f);
            hl.d3(this.k0, 100L);
            return;
        }
        xtVar.e0.a(true, 1.0f);
    }

    @Override
    public final void a(ex exVar, plb plbVar) {
        String str;
        String str2;
        q66 q66Var;
        String lowerCase;
        if (plbVar != null && (str = plbVar.b) != null) {
            nx0 nx0Var = this.J;
            wt wtVar = null;
            if (nx0Var != null) {
                nx0Var.dismiss();
                this.J = null;
            }
            int lastIndexOf = str.lastIndexOf(35);
            boolean z = false;
            if (lastIndexOf != -1) {
                boolean isEmpty = TextUtils.isEmpty(exVar.F.cached_page.url);
                TLRPC.WebPage webPage = exVar.F;
                if (!isEmpty) {
                    lowerCase = webPage.cached_page.url.toLowerCase();
                } else {
                    lowerCase = webPage.url.toLowerCase();
                }
                try {
                    str2 = URLDecoder.decode(str.substring(lastIndexOf + 1), "UTF-8");
                } catch (Exception unused) {
                    str2 = "";
                }
                if (lastIndexOf == 0 || str.toLowerCase().contains(lowerCase)) {
                    z = true;
                    T(str2, true);
                }
            } else {
                str2 = null;
            }
            if (!z) {
                cw cwVar = this.d;
                if (cwVar != null && (q66Var = this.b) != null) {
                    wtVar = new wt(this, cwVar, q66Var);
                }
                O(str, str2, wtVar);
            }
        }
    }

    public final void a0() {
        LaunchActivity launchActivity;
        FrameLayout frameLayout;
        if (this.X && (launchActivity = LaunchActivity.H1) != null && !launchActivity.isFinishing()) {
            boolean e = this.v0[0].e();
            m[] mVarArr = this.v0;
            if (e) {
                if (mVarArr[0].getWebView() != null) {
                    frameLayout = this.v0[0].f;
                } else {
                    return;
                }
            } else {
                m mVar = mVarArr[0];
                TLRPC.WebPage webPage = mVar.c.F;
                frameLayout = mVar;
                if (webPage == null) {
                    return;
                }
            }
            new d31(frameLayout, null).G(2131623982, 4, hl.N2(ob6.M0(2131752855, null), -1, 0, new ys(this, (byte) 8), null)).k(true);
        }
    }

    @Override
    public final boolean b(ex exVar, TL_iv.PageBlock pageBlock) {
        int indexOf;
        List list;
        org.telegram.ui.ActionBar.e eVar = this.N;
        if (eVar != null && eVar.getParentActivity() != null) {
            if ((pageBlock instanceof TL_iv.pageBlockVideo) && !dx.g(exVar.F, pageBlock)) {
                list = Collections.singletonList(pageBlock);
                indexOf = 0;
            } else {
                ArrayList arrayList = new ArrayList(exVar.f);
                indexOf = exVar.f.indexOf(pageBlock);
                list = arrayList;
            }
            PhotoViewer q0 = PhotoViewer.q0();
            q0.T1(null, this.N, null);
            if (q0.m1(null, null, null, null, null, null, null, indexOf, new fw(this, list), null, 0L, 0L, 0L, true, new mw(this, exVar.F, list), null)) {
                k();
                return true;
            }
        }
        return false;
    }

    public final void b0(boolean z) {
        float f;
        this.r0.setVisibility(0);
        ValueAnimator valueAnimator = this.Z0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f2 = this.a1;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
        this.Z0 = ofFloat;
        ofFloat.addUpdateListener(new ht(this, (byte) 1));
        this.Z0.addListener(new z7((byte) 2, this, z));
        this.Z0.setDuration(320L);
        this.Z0.setInterpolator(k43.h);
        this.Z0.start();
    }

    public final void c0(int i, Object obj, boolean z) {
        int L;
        int i2;
        int i3;
        int i4;
        int color;
        int w0;
        int w02;
        boolean z2;
        boolean z3;
        if (obj != null) {
            if (((obj instanceof TLRPC.WebPage) && ((TLRPC.WebPage) obj).cached_page != null) || (obj instanceof aw)) {
                int i5 = 1;
                if (!z && i != 0) {
                    m[] mVarArr = this.v0;
                    m mVar = mVarArr[1];
                    mVarArr[1] = mVarArr[0];
                    mVarArr[0] = mVar;
                    this.i0.i();
                    this.b1.a(this.v0[0].getBackgroundColor(), true);
                    this.c1.a(this.v0[1].getBackgroundColor(), true);
                    tw twVar = this.L;
                    if (twVar != null) {
                        twVar.y();
                    }
                    int indexOfChild = this.h0.indexOfChild(this.v0[0]);
                    int indexOfChild2 = this.h0.indexOfChild(this.v0[1]);
                    if (i == 1) {
                        if (indexOfChild < indexOfChild2) {
                            this.h0.removeView(this.v0[0]);
                            this.h0.addView(this.v0[0], indexOfChild2);
                        }
                    } else if (indexOfChild2 < indexOfChild) {
                        this.h0.removeView(this.v0[0]);
                        this.h0.addView(this.v0[0], indexOfChild);
                    }
                    this.w0 = new AnimatorSet();
                    this.v0[0].setVisibility(0);
                    if (i == 1) {
                        i4 = 0;
                    } else {
                        i4 = 1;
                    }
                    m mVar2 = this.v0[i4];
                    if (this.L == null) {
                        color = 0;
                    } else {
                        color = this.m0.getColor();
                    }
                    mVar2.setBackgroundColor(color);
                    this.v0[i4].setLayerType(2, null);
                    if (i == 1) {
                        m mVar3 = this.v0[0];
                        Point point = hl.q;
                        mVar3.setTranslationX(point.x);
                        this.w0.playTogether(ObjectAnimator.ofFloat(this.v0[0], View.TRANSLATION_X, point.x, 0.0f));
                    } else if (i == -1) {
                        this.v0[0].setTranslationX(0.0f);
                        this.w0.playTogether(ObjectAnimator.ofFloat(this.v0[1], View.TRANSLATION_X, 0.0f, hl.q.x));
                    }
                    this.w0.setDuration(320L);
                    this.w0.setInterpolator(k43.h);
                    this.w0.addListener(new c(this, i4));
                    this.g0.f = true;
                    xt xtVar = this.i0;
                    m mVar4 = this.v0[0];
                    if (mVar4 != null && xea.s0) {
                        w0 = mVar4.getBackgroundColor();
                    } else {
                        w0 = aob.w0(null, aob.Gl, false);
                    }
                    xtVar.setMenuColors(w0);
                    xt xtVar2 = this.i0;
                    m mVar5 = this.v0[0];
                    if (mVar5 != null && xea.s0) {
                        w02 = mVar5.getActionBarColor();
                    } else {
                        w02 = aob.w0(null, aob.Gl, false);
                    }
                    xtVar2.d(w02, true);
                    xt xtVar3 = this.i0;
                    m mVar6 = this.v0[0];
                    if (mVar6 != null && mVar6.d()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    xtVar3.setIsTonsite(z2);
                    xt xtVar4 = this.i0;
                    m mVar7 = this.v0[0];
                    if (mVar7 != null && mVar7.c()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    xtVar4.setIsLocal(z3);
                    AnimatorSet animatorSet = this.w0;
                    Objects.requireNonNull(animatorSet);
                    hl.c3(new at(animatorSet, (byte) 0));
                }
                if (!z) {
                    this.Q0.e(true);
                }
                ex exVar = this.v0[z ? 1 : 0].c;
                if (z) {
                    obj = c00.g(2, this.e0);
                }
                this.v0[z ? 1 : 0].a();
                if (obj instanceof TLRPC.WebPage) {
                    TLRPC.WebPage webPage = (TLRPC.WebPage) obj;
                    this.v0[z ? 1 : 0].setWeb(null);
                    this.v0[z ? 1 : 0].setType(0);
                    TL_iv.Page page = webPage.cached_page;
                    exVar.H = page.rtl;
                    exVar.F = webPage;
                    int size = page.blocks.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        TL_iv.PageBlock pageBlock = webPage.cached_page.blocks.get(i6);
                        if (i6 == 0) {
                            pageBlock.first = true;
                            if (pageBlock instanceof TL_iv.pageBlockCover) {
                                TL_iv.pageBlockCover pageblockcover = (TL_iv.pageBlockCover) pageBlock;
                                TL_iv.RichText t = t(0, pageblockcover);
                                TL_iv.RichText t2 = t(1, pageblockcover);
                                if (((t != null && !(t instanceof TL_iv.textEmpty)) || (t2 != null && !(t2 instanceof TL_iv.textEmpty))) && size > 1) {
                                    TL_iv.PageBlock pageBlock2 = webPage.cached_page.blocks.get(1);
                                    if (pageBlock2 instanceof TL_iv.pageBlockChannel) {
                                        exVar.G = (TL_iv.pageBlockChannel) pageBlock2;
                                    }
                                }
                            }
                        } else if (i6 == 1 && exVar.G != null) {
                        }
                        if (i6 == size - 1) {
                            i3 = i6;
                        } else {
                            i3 = 0;
                        }
                        exVar.F(exVar, pageBlock, 0, 0, i3);
                    }
                    exVar.f();
                    if (this.e0.size() != 1 && i != -1) {
                        x46 x46Var = this.v0[z ? 1 : 0].d;
                        tw twVar2 = this.L;
                        if (twVar2 == null) {
                            i5 = 0;
                        }
                        if (twVar2 != null) {
                            i2 = hl.L(32.0f);
                        } else {
                            i2 = 0;
                        }
                        x46Var.g1(i5, i2);
                    } else {
                        SharedPreferences sharedPreferences = org.telegram.messenger.a.b.getSharedPreferences("articles", 0);
                        String str = "article" + webPage.id;
                        int i7 = sharedPreferences.getInt(str, -1);
                        boolean z4 = sharedPreferences.getBoolean(str.concat("r"), true);
                        Point point2 = hl.q;
                        if (point2.x <= point2.y) {
                            i5 = 0;
                        }
                        if (z4 == i5) {
                            L = sharedPreferences.getInt(str.concat("o"), 0) - this.v0[z ? 1 : 0].b.getPaddingTop();
                        } else {
                            L = hl.L(10.0f);
                        }
                        if (i7 != -1) {
                            this.v0[z ? 1 : 0].d.g1(i7, L);
                        }
                    }
                } else if (obj instanceof aw) {
                    this.v0[z ? 1 : 0].setType(1);
                    this.v0[z ? 1 : 0].f();
                    this.v0[z ? 1 : 0].setWeb((aw) obj);
                }
                if (!z) {
                    j(null);
                }
                g0(false);
                d0();
            }
        }
    }

    public final void d(int i, String str) {
        S();
        xx0 xx0Var = new xx0();
        xx0Var.x = str;
        this.e0.add(xx0Var);
        this.i0.h(false);
        c0(i, xx0Var, false);
    }

    public final void d0() {
        m[] mVarArr;
        m mVar;
        float translationX;
        boolean z;
        boolean z2;
        m mVar2;
        float f;
        boolean z3;
        boolean z4;
        if (this.i0 != null && (mVar = (mVarArr = this.v0)[0]) != null && mVarArr[1] != null) {
            int visibility = mVar.getVisibility();
            float f2 = 0.0f;
            if (visibility != 0) {
                translationX = 0.0f;
            } else {
                translationX = 1.0f - (this.v0[0].getTranslationX() / this.v0[0].getWidth());
            }
            float f3 = 1.0f - translationX;
            xt xtVar = this.i0;
            xtVar.d[0] = this.v0[0].getProgress();
            xtVar.invalidate();
            xt xtVar2 = this.i0;
            xtVar2.d[1] = this.v0[1].getProgress();
            xtVar2.invalidate();
            this.i0.setTransitionProgress(f3);
            xt xtVar3 = this.i0;
            if (!xtVar3.a0 && !xtVar3.U) {
                ArticleViewer$WindowView articleViewer$WindowView = this.g0;
                if (articleViewer$WindowView.e || articleViewer$WindowView.f) {
                    boolean G = G();
                    ArrayList arrayList = this.e0;
                    if (!G && arrayList.size() <= 1) {
                        this.i0.Q.c();
                        this.i0.setBackButtonCached(false);
                    } else {
                        if (!this.v0[0].s && arrayList.size() <= 1) {
                            f = 0.0f;
                        } else {
                            f = 1.0f;
                        }
                        if (this.v0[1].s || arrayList.size() > 2) {
                            f2 = 1.0f;
                        }
                        float R1 = hl.R1(f, f2, f3);
                        this.i0.N.c(false, 1.0f - R1);
                        this.i0.Q.c();
                        xt xtVar4 = this.i0;
                        if (R1 > 0.5f) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        xtVar4.setBackButtonCached(z3);
                    }
                    this.i0.setHasForward(this.v0[0].w);
                    this.i0.setIsLocal(this.v0[0].c());
                    xt xtVar5 = this.i0;
                    if (this.v0[0].getWebView() != null && this.v0[0].getWebView().b) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    xtVar5.setIsLoaded(z4);
                }
            }
            xt xtVar6 = this.i0;
            int actionBarColor = this.v0[0].getActionBarColor();
            ArticleViewer$WindowView articleViewer$WindowView2 = this.g0;
            if (!articleViewer$WindowView2.e && !articleViewer$WindowView2.f) {
                z = false;
            } else {
                z = true;
            }
            xtVar6.b(0, this.b1.a(actionBarColor, z));
            xt xtVar7 = this.i0;
            int actionBarColor2 = this.v0[1].getActionBarColor();
            ArticleViewer$WindowView articleViewer$WindowView3 = this.g0;
            if (!articleViewer$WindowView3.e && !articleViewer$WindowView3.f) {
                z2 = false;
            } else {
                z2 = true;
            }
            xtVar7.b(1, this.c1.a(actionBarColor2, z2));
            this.i0.d(vm2.f(f3, this.v0[0].getActionBarColor(), this.v0[1].getActionBarColor()), false);
            xt xtVar8 = this.i0;
            int i = (translationX > 0.5f ? 1 : (translationX == 0.5f ? 0 : -1));
            m[] mVarArr2 = this.v0;
            if (i > 0) {
                mVar2 = mVarArr2[0];
            } else {
                mVar2 = mVarArr2[1];
            }
            xtVar8.setMenuType(mVar2.a);
            tw twVar = this.L;
            if (twVar != null) {
                twVar.c.invalidate();
                return;
            }
            ArticleViewer$WindowView articleViewer$WindowView4 = this.g0;
            if (articleViewer$WindowView4 != null) {
                articleViewer$WindowView4.invalidate();
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        cu cuVar;
        r47 messageObject;
        if (i == jn7.h2) {
            r47 r47Var = (r47) objArr[0];
            if (this.v0 != null) {
                int i3 = 0;
                while (true) {
                    m[] mVarArr = this.v0;
                    if (i3 < mVarArr.length) {
                        int childCount = mVarArr[i3].b.getChildCount();
                        for (int i4 = 0; i4 < childCount; i4++) {
                            View childAt = this.v0[i3].b.getChildAt(i4);
                            if (childAt instanceof cu) {
                                ((cu) childAt).a(true);
                            }
                        }
                        i3++;
                    } else {
                        return;
                    }
                }
            }
        } else if (i != jn7.f2 && i != jn7.g2) {
            if (i == jn7.e2) {
                Integer num = (Integer) objArr[0];
                if (this.v0 != null) {
                    int i5 = 0;
                    while (true) {
                        m[] mVarArr2 = this.v0;
                        if (i5 < mVarArr2.length) {
                            int childCount2 = mVarArr2[i5].b.getChildCount();
                            int i6 = 0;
                            while (true) {
                                if (i6 < childCount2) {
                                    View childAt2 = this.v0[i5].b.getChildAt(i6);
                                    if ((childAt2 instanceof cu) && (messageObject = (cuVar = (cu) childAt2).getMessageObject()) != null && messageObject.e1() == num.intValue()) {
                                        r47 r47Var2 = MediaController.z().v0;
                                        if (r47Var2 != null) {
                                            messageObject.b0 = r47Var2.b0;
                                            messageObject.i0 = r47Var2.i0;
                                            messageObject.j0 = r47Var2.j0;
                                            cuVar.b();
                                        }
                                    } else {
                                        i6++;
                                    }
                                }
                            }
                            i5++;
                        } else {
                            return;
                        }
                    }
                }
            } else if (i == jn7.l4 && this.v0 != null) {
                int i7 = 0;
                while (true) {
                    m[] mVarArr3 = this.v0;
                    if (i7 < mVarArr3.length) {
                        int childCount3 = mVarArr3[i7].b.getChildCount();
                        for (int i8 = 0; i8 < childCount3; i8++) {
                            View childAt3 = this.v0[i7].b.getChildAt(i8);
                            if (childAt3 instanceof vv) {
                                ((vv) childAt3).e.invalidate();
                            } else {
                                childAt3.invalidate();
                            }
                        }
                        i7++;
                    } else {
                        return;
                    }
                }
            }
        } else if (this.v0 != null) {
            int i9 = 0;
            while (true) {
                m[] mVarArr4 = this.v0;
                if (i9 < mVarArr4.length) {
                    int childCount4 = mVarArr4[i9].b.getChildCount();
                    for (int i10 = 0; i10 < childCount4; i10++) {
                        View childAt4 = this.v0[i9].b.getChildAt(i10);
                        if (childAt4 instanceof cu) {
                            cu cuVar2 = (cu) childAt4;
                            if (cuVar2.getMessageObject() != null) {
                                cuVar2.a(true);
                            }
                        }
                    }
                    i9++;
                } else {
                    return;
                }
            }
        }
    }

    public final boolean e(TLRPC.WebPage webPage, String str, int i) {
        S();
        this.e0.add(webPage);
        this.i0.h(false);
        c0(i, webPage, false);
        return T(str, false);
    }

    public final void f0() {
        int i;
        int size;
        boolean z;
        boolean z2;
        float f;
        if (this.v0[0].e()) {
            if (this.v0[0].getWebView() == null) {
                i = 0;
            } else {
                i = this.v0[0].getWebView().getSearchIndex();
            }
            if (this.v0[0].getWebView() == null) {
                size = 0;
            } else {
                size = this.v0[0].getWebView().getSearchCount();
            }
        } else {
            i = this.H;
            size = this.F.size();
        }
        ImageView imageView = this.s0;
        if (size > 0 && i != 0) {
            z = true;
        } else {
            z = false;
        }
        imageView.setEnabled(z);
        ImageView imageView2 = this.t0;
        if (size > 0 && i != size - 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        imageView2.setEnabled(z2);
        ImageView imageView3 = this.s0;
        float f2 = 0.5f;
        if (imageView3.isEnabled()) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        imageView3.setAlpha(f);
        ImageView imageView4 = this.t0;
        if (imageView4.isEnabled()) {
            f2 = 1.0f;
        }
        imageView4.setAlpha(f2);
        this.u0.a();
        if (size < 0) {
            this.u0.setText("");
            return;
        }
        in inVar = this.u0;
        if (size == 0) {
            inVar.setText(ob6.M0(2131747898, null));
        } else if (size == 1) {
            inVar.setText(ob6.M0(2131747554, null));
        } else {
            inVar.setText(String.format(ob6.J0(size, "CountOfResults"), Integer.valueOf(i + 1), Integer.valueOf(size)));
        }
    }

    public final void g0(boolean z) {
        boolean z2;
        boolean z3 = false;
        this.i0.g(0, this.v0[0].getTitle(), z);
        this.i0.f(0, this.v0[0].getSubtitle());
        xt xtVar = this.i0;
        if (this.v0[0].e() && this.v0[0].getWebView() != null && this.v0[0].getWebView().F) {
            z2 = true;
        } else {
            z2 = false;
        }
        xtVar.e(0, z2);
        this.i0.g(1, this.v0[1].getTitle(), z);
        this.i0.f(1, this.v0[1].getSubtitle());
        xt xtVar2 = this.i0;
        if (this.v0[1].e() && this.v0[1].getWebView() != null && this.v0[1].getWebView().F) {
            z3 = true;
        }
        xtVar2.e(1, z3);
    }

    public final void h() {
        this.L0 = false;
        bw bwVar = this.M0;
        if (bwVar != null) {
            this.g0.removeCallbacks(bwVar);
            this.M0 = null;
        }
        bw bwVar2 = this.N0;
        if (bwVar2 != null) {
            this.g0.removeCallbacks(bwVar2);
            this.N0 = null;
        }
    }

    public final void j(dt dtVar) {
        if (this.K0 == hl.L(56.0f)) {
            if (dtVar != null) {
                dtVar.run();
                return;
            }
            return;
        }
        ValueAnimator duration = ValueAnimator.ofObject(new IntEvaluator(), Integer.valueOf(this.K0), Integer.valueOf(hl.L(56.0f))).setDuration(180L);
        duration.setInterpolator(new DecelerateInterpolator());
        duration.addUpdateListener(new ht(this, (byte) 0));
        duration.addListener(new h0(dtVar, (byte) 11));
        if (dtVar != null) {
            duration.setDuration(duration.getDuration() / 2);
        }
        duration.start();
    }

    public final void k() {
        long j;
        yv yvVar;
        iw iwVar = this.v0[0].b;
        if (iwVar != null && this.X) {
            float measuredHeight = iwVar.getMeasuredHeight() / 2.0f;
            Uri uri = null;
            float f = 0.0f;
            yv yvVar2 = null;
            for (int i = 0; i < iwVar.getChildCount(); i++) {
                View childAt = iwVar.getChildAt(i);
                if (childAt instanceof yv) {
                    float measuredHeight2 = (childAt.getMeasuredHeight() / 2.0f) + childAt.getTop();
                    if (yvVar2 == null || Math.abs(measuredHeight - measuredHeight2) < Math.abs(measuredHeight - f)) {
                        yvVar2 = (yv) childAt;
                        f = measuredHeight2;
                    }
                }
            }
            boolean z = PhotoViewer.q0().f;
            if (z || ((yvVar = this.y) != null && yvVar != yvVar2 && this.x != null)) {
                VideoPlayerHolderBase videoPlayerHolderBase = this.x;
                if (videoPlayerHolderBase != null) {
                    yv yvVar3 = this.y;
                    long j2 = yvVar3.M.video_id;
                    zv a = zv.a(videoPlayerHolderBase, yvVar3);
                    yvVar3.c(a);
                    this.E.k(j2, a);
                    yv yvVar4 = this.y;
                    zv zvVar = yvVar4.N;
                    if (zvVar != null) {
                        Bitmap bitmap = zvVar.b;
                        if (bitmap != null) {
                            yvVar4.e.f0(bitmap);
                        }
                        this.y.e(false);
                    }
                    this.x.release(null);
                }
                this.x = null;
                this.y = null;
            }
            if (!z && yvVar2 != null) {
                int i2 = yv.W;
                xi5 xi5Var = yvVar2.a;
                if (yvVar2.P != null && xi5Var.x == null) {
                    xi5Var.x = new xv(yvVar2).with(yvVar2.n);
                    TLRPC.Document document = yvVar2.P;
                    for (int i3 = 0; i3 < document.attributes.size(); i3++) {
                        if (document.attributes.get(i3) instanceof TLRPC.TL_documentAttributeVideo) {
                            TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) document.attributes.get(i3);
                            yvVar2.h.a(tL_documentAttributeVideo.w / tL_documentAttributeVideo.h, 0);
                        }
                    }
                    TLRPC.WebPage webPage = yvVar2.b.F;
                    if (webPage != null) {
                        uri = hd4.j(((o) xi5Var).Y, webPage, document);
                    }
                    if (uri != null) {
                        VideoPlayerHolderBase videoPlayerHolderBase2 = xi5Var.x;
                        zv zvVar2 = yvVar2.N;
                        if (zvVar2 == null) {
                            j = 0;
                        } else {
                            j = zvVar2.a;
                        }
                        videoPlayerHolderBase2.seekTo(j);
                        xi5Var.x.preparePlayer(uri, true, 1.0f);
                        xi5Var.x.play();
                    }
                }
                this.y = yvVar2;
            }
        }
    }

    public final void l(boolean z, boolean z2) {
        if (this.M != null && !this.V0 && this.W) {
            int i = 0;
            if (this.a0 != 0 && Math.abs(this.c0 - System.currentTimeMillis()) >= 500) {
                Runnable runnable = this.b0;
                if (runnable != null) {
                    runnable.run();
                    this.b0 = null;
                }
                this.a0 = (byte) 0;
            }
            if (this.a0 == 0) {
                tw twVar = this.L;
                if (twVar != null) {
                    twVar.a(false);
                    return;
                }
                if (this.Q.getVisibility() == 0) {
                    if (this.P != null) {
                        this.Q.setVisibility(4);
                        this.T.onCustomViewHidden();
                        this.Q.removeView(this.P);
                        this.P = null;
                    } else {
                        hyc hycVar = this.G0;
                        if (hycVar != null && hycVar.U) {
                            hycVar.U = false;
                            hycVar.m();
                            hycVar.l(false);
                        }
                    }
                    if (!z2) {
                        return;
                    }
                }
                if (this.Q0.w()) {
                    this.Q0.e(false);
                    return;
                }
                xt xtVar = this.i0;
                if (xtVar.U) {
                    xtVar.h(false);
                } else if (xtVar.a0) {
                    xtVar.k(false);
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
                    if (z && !z2) {
                        ArrayList arrayList = this.e0;
                        if (arrayList.size() >= 2) {
                            Object l = qd4.l(1, arrayList);
                            if (l instanceof aw) {
                                ((aw) l).a();
                            }
                            if (l instanceof TLRPC.WebPage) {
                                rxc.o((TLRPC.WebPage) l);
                            }
                            c0(-1, arrayList.get(arrayList.size() - 1), false);
                            return;
                        }
                    }
                    jn7.f(this.Y).n(this, jn7.e2);
                    jn7.f(this.Y).n(this, jn7.f2);
                    jn7.f(this.Y).n(this, jn7.g2);
                    jn7.f(this.Y).n(this, jn7.h2);
                    jn7.f(this.Y).n(this, jn7.l4);
                    e26 e26Var = this.W0;
                    if (e26Var != null) {
                        e26Var.a();
                        this.W0 = null;
                    }
                    this.N = null;
                    try {
                        nx0 nx0Var = this.l0;
                        if (nx0Var != null) {
                            nx0Var.dismiss();
                            this.l0 = null;
                        }
                    } catch (Exception e) {
                        cc4.g(e, true);
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    ArticleViewer$WindowView articleViewer$WindowView = this.g0;
                    Property property = View.ALPHA;
                    animatorSet.playTogether(ObjectAnimator.ofFloat(articleViewer$WindowView, property, 0.0f), ObjectAnimator.ofFloat(this.h0, property, 0.0f), ObjectAnimator.ofFloat(this.g0, View.TRANSLATION_X, 0.0f, hl.L(56.0f)));
                    this.a0 = (byte) 2;
                    this.b0 = new ys(this, (byte) 6);
                    animatorSet.setDuration(150L);
                    animatorSet.setInterpolator(this.d0);
                    animatorSet.addListener(new h0(this, (byte) 12));
                    this.c0 = System.currentTimeMillis();
                    this.h0.setLayerType(2, null);
                    animatorSet.start();
                    while (true) {
                        zh6 zh6Var = this.E;
                        if (i < zh6Var.m()) {
                            zv zvVar = (zv) zh6Var.n(i);
                            Bitmap bitmap = zvVar.b;
                            if (bitmap != null) {
                                bitmap.recycle();
                                zvVar.b = null;
                            }
                            i++;
                        } else {
                            zh6Var.b();
                            return;
                        }
                    }
                }
            }
        }
    }

    public final void p() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.e0;
            if (i < arrayList.size()) {
                Object obj = arrayList.get(i);
                if (obj instanceof aw) {
                    m mVar = this.v0[0];
                    if (mVar != null && mVar.L == obj) {
                        ((aw) obj).c(mVar);
                    }
                    m mVar2 = this.v0[1];
                    if (mVar2 != null && mVar2.L == obj) {
                        ((aw) obj).c(mVar2);
                    }
                    ((aw) obj).a();
                } else if (obj instanceof TLRPC.WebPage) {
                    rxc.o((TLRPC.WebPage) obj);
                }
                i++;
            } else {
                arrayList.clear();
                q();
                return;
            }
        }
    }

    public final void q() {
        ArticleViewer$WindowView articleViewer$WindowView;
        ArrayList arrayList;
        if (this.M != null && (articleViewer$WindowView = this.g0) != null) {
            if (this.L == null) {
                try {
                    if (articleViewer$WindowView.getParent() != null) {
                        ((WindowManager) this.M.getSystemService("window")).removeViewImmediate(this.g0);
                    }
                    this.g0 = null;
                } catch (Exception e) {
                    cc4.g(e, true);
                }
            }
            int i = 0;
            while (true) {
                int size = this.O.size();
                arrayList = this.O;
                if (i >= size) {
                    break;
                }
                ((j) arrayList.get(i)).a(true);
                i++;
            }
            arrayList.clear();
            try {
                this.M.getWindow().clearFlags(128);
            } catch (Exception e2) {
                cc4.g(e2, true);
            }
            this.M = null;
            this.N = null;
            e1 = null;
        }
    }

    public o() {
        this.O = new ArrayList();
        this.Z = 1;
        this.d0 = new DecelerateInterpolator(1.5f);
        this.e0 = new ArrayList();
        this.x0 = new Paint();
        this.y0 = new Paint();
        this.z0 = new Paint();
        this.B0 = new Paint();
        this.L0 = false;
        this.M0 = null;
        this.N0 = null;
        this.T0 = new pn(new int[]{jn7.r, jn7.s});
        this.U0 = new zc[2];
        this.Y0 = -1;
        ys ysVar = new ys(this, (byte) 1);
        k43 k43Var = k43.h;
        this.b1 = new ll(ysVar, 320L, k43Var);
        this.c1 = new ll(new ys(this, (byte) 4), 320L, k43Var);
        this.K = false;
        this.L = null;
    }
}
