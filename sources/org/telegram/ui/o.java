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
public final class o extends ui5 implements jm7 {
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
    public tvc F0;
    public tvc G0;
    public int H0;
    public int I0;
    public int J0;
    public final boolean K;
    public int K0;
    public final sx L;
    public boolean L0;
    public Activity M;
    public ax M0;
    public org.telegram.ui.ActionBar.d N;
    public ax N0;
    public final ArrayList O;
    public vu O0;
    public View P;
    public int P0;
    public FrameLayout Q;
    public gkb Q0;
    public TextureView R;
    public gkb R0;
    public jy S;
    public pc8 S0;
    public WebChromeClient.CustomViewCallback T;
    public final po T0;
    public WindowInsets U;
    public final yd[] U0;
    public boolean V;
    public boolean V0;
    public boolean W;
    public a26 W0;
    public boolean X;
    public wc7 X0;
    public int Y;
    public int Y0;
    public int Z;
    public ValueAnimator Z0;
    public byte a0;
    public float a1;
    public Runnable b0;
    public final km b1;
    public long c0;
    public final km c1;
    public final DecelerateInterpolator d0;
    public final ArrayList e0;
    public WindowManager.LayoutParams f0;
    public ArticleViewer$WindowView g0;
    public a h0;
    public wu i0;
    public eb j0;
    public ut k0;
    public my0 l0;
    public Paint m0;
    public Drawable n0;
    public Paint o0;
    public boolean p0;
    public float q0;
    public a6 r0;
    public ImageView s0;
    public ImageView t0;
    public io u0;
    public m[] v0;
    public AnimatorSet w0;
    public final Paint x0;
    public final Paint y0;
    public final Paint z0;
    public static final HashSet d1 = new HashSet();
    public static volatile o e1 = null;
    public static final b f1 = new ro("innerTranslationX", (byte) 0);
    public static final TextPaint g1 = new TextPaint(1);
    public static final nx h1 = new nx();
    public static final WeakHashMap C1 = new WeakHashMap();

    public o(org.telegram.ui.ActionBar.d dVar) {
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
        this.T0 = new po(new int[]{nm7.r, nm7.s});
        this.U0 = new yd[2];
        this.Y0 = -1;
        ut utVar = new ut(this, (byte) 2);
        d53 d53Var = d53.h;
        this.b1 = new km(utVar, 320L, d53Var);
        this.c1 = new km(new ut(this, (byte) 3), 320L, d53Var);
        this.K = true;
        this.L = new sx(this, dVar);
        W(dVar.getParentActivity(), dVar);
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

    public static android.text.TextPaint B(defpackage.ui5 r21, org.telegram.tgnet.tl.TL_iv.RichText r22, org.telegram.tgnet.tl.TL_iv.RichText r23, org.telegram.tgnet.tl.TL_iv.PageBlock r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.o.B(ui5, org.telegram.tgnet.tl.TL_iv$RichText, org.telegram.tgnet.tl.TL_iv$RichText, org.telegram.tgnet.tl.TL_iv$PageBlock):android.text.TextPaint");
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
        if (!(pageBlock instanceof vx) && !(pageBlock instanceof xx)) {
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

    public static boolean M(tx txVar) {
        boolean z;
        TL_iv.PageBlock w = w(txVar.a);
        if (w instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) w;
            if (!pageblockdetails.open) {
                pageblockdetails.open = true;
                return true;
            }
        } else if (w instanceof tx) {
            tx txVar2 = (tx) w;
            TL_iv.PageBlock w2 = w(txVar2.b);
            if (w2 instanceof TL_iv.pageBlockDetails) {
                TL_iv.pageBlockDetails pageblockdetails2 = (TL_iv.pageBlockDetails) w2;
                if (!pageblockdetails2.open) {
                    pageblockdetails2.open = true;
                    z = true;
                    if (!M(txVar2) || z) {
                        return true;
                    }
                }
            }
            z = false;
            if (!M(txVar2)) {
            }
            return true;
        }
        return false;
    }

    public static void R(ui5 ui5Var) {
        if (ui5Var.b != null || ui5Var.f != null) {
            View view = ui5Var.f;
            ui5Var.c.e(true);
            ui5Var.b = null;
            ui5Var.d = null;
            ui5Var.f = null;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public static void c(String str, int i, FrameLayout frameLayout, sx sxVar, ylb ylbVar) {
        String r = qw0.r(str);
        long e = z8c.h(i).e();
        a6a.B(i).q0(y5a.a(e, r));
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
        nm7.f(i).k(nm7.H1, new k47(i, tL_message, false, false));
        new c41(frameLayout, ylbVar).Q(2131624185, 36, gm.N2(jb6.M0(2131742603, null), -1, 0, new fu(sxVar, e, (byte) 0), null)).k(true);
    }

    public static void e0(ui5 ui5Var) {
        TextPaint textPaint = o1;
        if (textPaint != null) {
            textPaint.setColor(cmb.w0(null, cmb.F6, false));
        }
        TextPaint textPaint2 = p1;
        if (textPaint2 != null) {
            textPaint2.setColor(cmb.w0(null, cmb.F6, false));
        }
        TextPaint textPaint3 = i1;
        if (textPaint3 != null) {
            textPaint3.setColor(cmb.w0(null, cmb.F6, false));
        }
        TextPaint textPaint4 = k1;
        if (textPaint4 != null) {
            textPaint4.setColor(cmb.w0(null, cmb.F6, false));
        }
        TextPaint textPaint5 = l1;
        if (textPaint5 != null) {
            textPaint5.setColor(-1);
        }
        TextPaint textPaint6 = m1;
        if (textPaint6 != null) {
            textPaint6.setColor(cmb.w0(null, cmb.F6, false));
        }
        TextPaint textPaint7 = n1;
        if (textPaint7 != null) {
            textPaint7.setColor(cmb.w0(null, cmb.x6, false));
        }
        TextPaint textPaint8 = j1;
        if (textPaint8 != null) {
            textPaint8.setColor(cmb.w0(null, cmb.x6, false));
        }
        o(ui5Var, true);
        nx nxVar = h1;
        nx.a(ui5Var, nxVar.d);
        nx.a(ui5Var, nxVar.e);
        nx.a(ui5Var, nxVar.g);
        nx.a(ui5Var, nxVar.f);
        nx.a(ui5Var, nxVar.h);
        nx.a(ui5Var, nxVar.i);
        nx.a(ui5Var, nxVar.j);
        nx.a(ui5Var, nxVar.k);
        nx.a(ui5Var, nxVar.l);
        nx.a(ui5Var, nxVar.m);
        nx.a(ui5Var, nxVar.n);
        nx.a(ui5Var, nxVar.t);
        nx.a(ui5Var, nxVar.s);
        nx.a(ui5Var, nxVar.q);
        nx.a(ui5Var, nxVar.r);
        nx.a(ui5Var, nxVar.u);
        nx.a(ui5Var, nxVar.w);
        nx.a(ui5Var, nxVar.x);
        nx.a(ui5Var, nxVar.b);
        nx.a(ui5Var, nxVar.c);
        nx.a(ui5Var, nxVar.o);
        nx.a(ui5Var, nxVar.p);
        nx.a(ui5Var, nxVar.v);
        nx.a(ui5Var, nxVar.y);
        nx.a(ui5Var, nxVar.z);
        nx.a(ui5Var, nxVar.A);
    }

    public static SpannableStringBuilder f(int i, CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (charSequence != null) {
            spannableStringBuilder.append(charSequence);
        }
        if (spannableStringBuilder.length() > 0) {
            spannableStringBuilder.append((CharSequence) ", ");
        }
        spannableStringBuilder.append((CharSequence) jb6.M0(i, null));
        return spannableStringBuilder;
    }

    public static CharSequence g(ui5 ui5Var, ey eyVar, bx bxVar) {
        StaticLayout staticLayout;
        if (bxVar != null && (staticLayout = bxVar.d) != null) {
            SpannableStringBuilder spannableStringBuilder = bxVar.E;
            if (spannableStringBuilder != null) {
                return spannableStringBuilder;
            }
            CharSequence text = staticLayout.getText();
            if (!(text instanceof Spannable)) {
                return text;
            }
            Spannable spannable = (Spannable) text;
            vjb[] vjbVarArr = (vjb[]) spannable.getSpans(0, spannable.length(), vjb.class);
            SpannableStringBuilder spannableStringBuilder2 = text;
            if (vjbVarArr != null) {
                spannableStringBuilder2 = text;
                if (vjbVarArr.length != 0) {
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannable);
                    for (vjb vjbVar : vjbVarArr) {
                        int spanStart = spannableStringBuilder3.getSpanStart(vjbVar);
                        int spanEnd = spannableStringBuilder3.getSpanEnd(vjbVar);
                        if (spanStart >= 0 && spanEnd > spanStart) {
                            spannableStringBuilder3.setSpan(new tl(ui5Var, eyVar, vjbVar, (byte) 1), spanStart, spanEnd, 33);
                        }
                    }
                    bxVar.E = spannableStringBuilder3;
                    spannableStringBuilder2 = spannableStringBuilder3;
                }
            }
            return spannableStringBuilder2;
        }
        return null;
    }

    public static TL_iv.PageBlock h0(TL_iv.PageBlock pageBlock, tx txVar) {
        if (pageBlock instanceof vx) {
            vx vxVar = (vx) pageBlock;
            vx vxVar2 = new vx();
            vxVar2.a = vxVar.a;
            vxVar2.b = vxVar.b;
            vxVar2.c = vxVar.c;
            vxVar2.d = h0(vxVar.d, txVar);
            return vxVar2;
        } else if (pageBlock instanceof xx) {
            xx xxVar = (xx) pageBlock;
            xx xxVar2 = new xx();
            xxVar2.a = xxVar.a;
            xxVar2.b = xxVar.b;
            xxVar2.c = xxVar.c;
            xxVar2.d = h0(xxVar.d, txVar);
            return xxVar2;
        } else {
            return txVar;
        }
    }

    public static boolean i(defpackage.ui5 r25, defpackage.ey r26, android.view.MotionEvent r27, android.view.View r28, defpackage.bx r29, int r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.o.i(ui5, ey, android.view.MotionEvent, android.view.View, bx, int, int):boolean");
    }

    public static bx m(ui5 ui5Var, View view, CharSequence charSequence, TL_iv.RichText richText, int i, int i2, TL_iv.PageBlock pageBlock, ey eyVar) {
        return n(ui5Var, view, charSequence, richText, i, i2, pageBlock, Layout.Alignment.ALIGN_NORMAL, 0, eyVar);
    }

    public static defpackage.bx n(defpackage.ui5 r19, android.view.View r20, java.lang.CharSequence r21, org.telegram.tgnet.tl.TL_iv.RichText r22, int r23, int r24, org.telegram.tgnet.tl.TL_iv.PageBlock r25, android.text.Layout.Alignment r26, int r27, defpackage.ey r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.o.n(ui5, android.view.View, java.lang.CharSequence, org.telegram.tgnet.tl.TL_iv$RichText, int, int, org.telegram.tgnet.tl.TL_iv$PageBlock, android.text.Layout$Alignment, int, ey):bx");
    }

    public static void o(ui5 ui5Var, boolean z) {
        int i;
        if (s1 == null) {
            s1 = new Paint();
            r1 = new Paint();
            Paint paint = new Paint(1);
            u1 = paint;
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            u1.setStrokeWidth(gm.L(1.0f));
            Paint paint2 = new Paint();
            v1 = paint2;
            paint2.setStyle(style);
            v1.setStrokeWidth(gm.L(1.0f) / 2.0f);
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
        int w0 = cmb.w0(null, cmb.c6, false);
        float green = Color.green(w0) * 0.7152f;
        float y = b10.y(Color.blue(w0), 0.0722f, green + (Color.red(w0) * 0.2126f), 255.0f);
        Paint paint3 = A1;
        if (y <= 0.705f) {
            i = -3041234;
        } else {
            i = -6551;
        }
        paint3.setColor(i);
        Paint paint4 = z1;
        int i2 = cmb.J6;
        paint4.setColor(cmb.w0(null, i2, false) & 872415231);
        z1.setPathEffect(b66.c());
        y1.setColor(cmb.w0(null, i2, false) & 872415231);
        y1.setPathEffect(b66.c());
        Paint paint5 = v1;
        int i3 = cmb.j6;
        paint5.setColor(cmb.w0(null, i3, false));
        u1.setColor(cmb.w0(null, i3, false));
        q1.setColor(251658240);
        t1.setColor(cmb.w0(null, cmb.c7, false));
        B1.setColor(cmb.w0(null, i2, false) & 872415231);
        B1.setPathEffect(b66.c());
        int w02 = cmb.w0(null, cmb.L6, false);
        int red = Color.red(w02);
        int green2 = Color.green(w02);
        int blue = Color.blue(w02);
        x1.setColor(Color.argb(20, red, green2, blue));
        w1.setColor(Color.argb(34, red, green2, blue));
        int w03 = cmb.w0(null, i2, false);
        r1.setColor(Color.argb(20, Color.red(w03), Color.green(w03), Color.blue(w03)));
        s1.setColor(cmb.w0(null, cmb.Kd, false));
    }

    public static void r(Canvas canvas, ui5 ui5Var, TL_iv.PageBlock pageBlock, int i) {
        int i2;
        int L;
        int L2;
        if (pageBlock != null && ui5Var != null && s1 != null) {
            int i3 = 0;
            if (pageBlock.bottom) {
                i2 = gm.L(6.0f);
            } else {
                i2 = 0;
            }
            int i4 = i - i2;
            int i5 = pageBlock.quoteLevels;
            if (i5 == 0) {
                if (pageBlock.level > 0) {
                    canvas.drawRect(gm.L(18.0f), 0.0f, gm.L(2.0f) + L2, i4, s1);
                    return;
                }
                return;
            }
            while (i5 != 0) {
                if ((i5 & 1) != 0) {
                    canvas.drawRect(gm.L((i3 * 14) + 18), 0.0f, gm.L(2.0f) + L, i4, s1);
                }
                i5 >>>= 1;
                i3++;
            }
        }
    }

    public static void s(defpackage.ui5 r2, android.graphics.Canvas r3, defpackage.fkb r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.o.s(ui5, android.graphics.Canvas, fkb, int):void");
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
        b59 b59Var;
        if (view instanceof xv) {
            b59 b59Var2 = ((xv) view).d;
            if (b59Var2 != null) {
                return v(b59Var2.a);
            }
            return view;
        } else if ((view instanceof aw) && (b59Var = ((aw) view).d) != null) {
            return v(b59Var.a);
        } else {
            return view;
        }
    }

    public static TL_iv.PageBlock w(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof vx) {
            TL_iv.PageBlock pageBlock2 = ((vx) pageBlock).d;
            if (pageBlock2 != null) {
                return w(pageBlock2);
            }
            return pageBlock2;
        } else if (pageBlock instanceof xx) {
            TL_iv.PageBlock pageBlock3 = ((xx) pageBlock).d;
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

    public static CharSequence z(ui5 ui5Var, TLRPC.WebPage webPage, View view, TL_iv.RichText richText, TL_iv.RichText richText2, TL_iv.PageBlock pageBlock, int i) {
        vjb vjbVar;
        vjb vjbVar2;
        TextPaint textPaint = null;
        if (richText2 == null) {
            return null;
        }
        if (richText2 instanceof TL_iv.textFixed) {
            return z(ui5Var, webPage, view, richText, ((TL_iv.textFixed) richText2).text, pageBlock, i);
        }
        if (richText2 instanceof TL_iv.textItalic) {
            return z(ui5Var, webPage, view, richText, ((TL_iv.textItalic) richText2).text, pageBlock, i);
        }
        if (richText2 instanceof TL_iv.textBold) {
            return z(ui5Var, webPage, view, richText, ((TL_iv.textBold) richText2).text, pageBlock, i);
        }
        if (richText2 instanceof TL_iv.textUnderline) {
            return z(ui5Var, webPage, view, richText, ((TL_iv.textUnderline) richText2).text, pageBlock, i);
        }
        if (richText2 instanceof TL_iv.textStrike) {
            return z(ui5Var, webPage, view, richText, ((TL_iv.textStrike) richText2).text, pageBlock, i);
        }
        if (richText2 instanceof TL_iv.textEmail) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(z(ui5Var, webPage, view, richText, ((TL_iv.textEmail) richText2).text, pageBlock, i));
            MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), MetricAffectingSpan.class);
            if (spannableStringBuilder.length() != 0) {
                if (metricAffectingSpanArr == null || metricAffectingSpanArr.length == 0) {
                    textPaint = B(ui5Var, richText, richText2, pageBlock);
                }
                spannableStringBuilder.setSpan(new vjb(textPaint, "mailto:" + C(richText2)), 0, spannableStringBuilder.length(), 33);
            }
            return spannableStringBuilder;
        }
        long j = 0;
        if (richText2 instanceof TL_iv.textUrl) {
            TL_iv.textUrl texturl = (TL_iv.textUrl) richText2;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(z(ui5Var, webPage, view, richText, texturl.text, pageBlock, i));
            MetricAffectingSpan[] metricAffectingSpanArr2 = (MetricAffectingSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), MetricAffectingSpan.class);
            if (metricAffectingSpanArr2 == null || metricAffectingSpanArr2.length == 0) {
                textPaint = B(ui5Var, richText, richText2, pageBlock);
            }
            if (texturl.webpage_id != 0) {
                vjbVar2 = new vjb(textPaint, C(richText2));
            } else {
                vjbVar2 = new vjb(textPaint, C(richText2));
            }
            if (spannableStringBuilder2.length() != 0) {
                spannableStringBuilder2.setSpan(vjbVar2, 0, spannableStringBuilder2.length(), 33);
            }
            return spannableStringBuilder2;
        } else if (richText2 instanceof TL_iv.textPlain) {
            return ((TL_iv.textPlain) richText2).text;
        } else {
            if (richText2 instanceof TL_iv.textAnchor) {
                TL_iv.textAnchor textanchor = (TL_iv.textAnchor) richText2;
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(z(ui5Var, webPage, view, richText, textanchor.text, pageBlock, i));
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
                        CharSequence z = z(ui5Var, webPage, view, richText, richText3, pageBlock, i);
                        int A = A(x);
                        int length = spannableStringBuilder4.length();
                        spannableStringBuilder4.append(z);
                        if (A != 0 && !(z instanceof SpannableStringBuilder)) {
                            if ((A & 8) == 0 && (A & 512) == 0) {
                                if (length != spannableStringBuilder4.length()) {
                                    TextPaint B = B(ui5Var, richText, x, pageBlock);
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
                                    vjbVar = new vjb(B(ui5Var, richText, x, pageBlock), C);
                                } else {
                                    vjbVar = new vjb(B(ui5Var, richText, x, pageBlock), C);
                                }
                                if (length != spannableStringBuilder4.length()) {
                                    spannableStringBuilder4.setSpan(vjbVar, length, spannableStringBuilder4.length(), 33);
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
                    return z(ui5Var, webPage, view, richText, ((TL_iv.textSubscript) richText2).text, pageBlock, i);
                } else {
                    if (richText2 instanceof TL_iv.textSuperscript) {
                        return z(ui5Var, webPage, view, richText, ((TL_iv.textSuperscript) richText2).text, pageBlock, i);
                    }
                    if (richText2 instanceof TL_iv.textMarked) {
                        SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(z(ui5Var, webPage, view, richText, ((TL_iv.textMarked) richText2).text, pageBlock, i));
                        MetricAffectingSpan[] metricAffectingSpanArr3 = (MetricAffectingSpan[]) spannableStringBuilder5.getSpans(0, spannableStringBuilder5.length(), MetricAffectingSpan.class);
                        if (spannableStringBuilder5.length() != 0) {
                            if (metricAffectingSpanArr3 == null || metricAffectingSpanArr3.length == 0) {
                                textPaint = B(ui5Var, richText, richText2, pageBlock);
                            }
                            ?? metricAffectingSpan3 = new MetricAffectingSpan();
                            metricAffectingSpan3.a = textPaint;
                            spannableStringBuilder5.setSpan(metricAffectingSpan3, 0, spannableStringBuilder5.length(), 33);
                        }
                        return spannableStringBuilder5;
                    } else if (richText2 instanceof TL_iv.textSpoiler) {
                        SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder(z(ui5Var, webPage, view, richText, ((TL_iv.textSpoiler) richText2).text, pageBlock, i));
                        if (spannableStringBuilder6.length() != 0) {
                            ?? obj = new Object();
                            obj.a |= 256;
                            spannableStringBuilder6.setSpan(new xkb(obj, 0), 0, spannableStringBuilder6.length(), 33);
                        }
                        return spannableStringBuilder6;
                    } else if (richText2 instanceof TL_iv.textPhone) {
                        SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder(z(ui5Var, webPage, view, richText, ((TL_iv.textPhone) richText2).text, pageBlock, i));
                        MetricAffectingSpan[] metricAffectingSpanArr4 = (MetricAffectingSpan[]) spannableStringBuilder7.getSpans(0, spannableStringBuilder7.length(), MetricAffectingSpan.class);
                        if (spannableStringBuilder7.length() != 0) {
                            if (metricAffectingSpanArr4 == null || metricAffectingSpanArr4.length == 0) {
                                textPaint = B(ui5Var, richText, richText2, pageBlock);
                            }
                            spannableStringBuilder7.setSpan(new vjb(textPaint, "tel:" + C(richText2)), 0, spannableStringBuilder7.length(), 33);
                        }
                        return spannableStringBuilder7;
                    } else if (richText2 instanceof TL_iv.textImage) {
                        TL_iv.textImage textimage = (TL_iv.textImage) richText2;
                        TLRPC.Document a = dy.a(webPage, textimage.document_id);
                        TLRPC.Photo e = dy.e(webPage, textimage.photo_id);
                        if (a != null) {
                            SpannableStringBuilder spannableStringBuilder8 = new SpannableStringBuilder("*");
                            int L = gm.L(textimage.w);
                            int L2 = gm.L(textimage.h);
                            int abs = Math.abs(i);
                            if (L > abs) {
                                L2 = (int) (L2 * (abs / L));
                                L = abs;
                            }
                            if (view != null) {
                                int i7 = cmb.c6;
                                ((o) ui5Var).getClass();
                                boolean z2 = gm.B(cmb.w0(null, i7, false)) <= 0.705f;
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
                                    imageReceiver.h1 = new rjb((byte) 0);
                                }
                                imageReceiver.Z(gn5.b(a), str2, gn5.c(bc4.w(a.thumbs, 90, false, null, false), a), str2, null, -1L, null, webPage, 1);
                                spannableStringBuilder8.setSpan(replacementSpan, 0, spannableStringBuilder8.length(), 33);
                            }
                            return spannableStringBuilder8;
                        } else if (e instanceof cvc) {
                            cvc cvcVar = (cvc) e;
                            SpannableStringBuilder spannableStringBuilder9 = new SpannableStringBuilder("*");
                            int L3 = gm.L(textimage.w);
                            int L4 = gm.L(textimage.h);
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
                                dvc.g(cvcVar, imageReceiver2, new jd((byte) 10));
                                spannableStringBuilder9.setSpan(replacementSpan2, 0, spannableStringBuilder9.length(), 33);
                            }
                            return spannableStringBuilder9;
                        }
                    } else if (richText2 instanceof TL_iv.textMath) {
                        TL_iv.textMath textmath = (TL_iv.textMath) richText2;
                        if (textmath.bitmap == null && !textmath.tried) {
                            textmath.tried = true;
                            lz5 a2 = lz5.a(textmath.source, gm.L(20.0f), true);
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
                            int i10 = cmb.F6;
                            ((o) ui5Var).getClass();
                            spannableStringBuilder10.setSpan(new sjb(view, bitmap, i8, i9, cmb.w0(null, i10, false), textmath.depth), 0, spannableStringBuilder10.length(), 33);
                            String str4 = textmath.source;
                            if (str4 != null && !str4.isEmpty()) {
                                spannableStringBuilder10.setSpan(new lkb(textmath.source), 0, spannableStringBuilder10.length(), 33);
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
        sx sxVar = this.L;
        boolean z2 = false;
        if (size <= 1) {
            articleViewer$WindowView.e = false;
            articleViewer$WindowView.d = false;
            a aVar = this.h0;
            if (sxVar != null) {
                x = sxVar.J * sxVar.c.getWidth();
            } else {
                x = aVar.getX();
            }
            AnimatorSet animatorSet = new AnimatorSet();
            float measuredWidth = aVar.getMeasuredWidth() - x;
            if (sxVar != null) {
                animatorSet.playTogether(sxVar.l(1.0f));
            } else {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.h0, View.TRANSLATION_X, aVar.getMeasuredWidth()), ObjectAnimator.ofFloat(this.g0, f1, aVar.getMeasuredWidth()));
            }
            animatorSet.setDuration(Math.max((int) ((420.0f / aVar.getMeasuredWidth()) * measuredWidth), 250));
            animatorSet.setInterpolator(d53.h);
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
        if (sxVar == null) {
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
        animatorSet2.setInterpolator(d53.h);
        animatorSet2.addListener(new e(this));
        animatorSet2.start();
        wu wuVar = this.i0;
        m mVar3 = this.v0[0];
        if (mVar3 != null && gda.s0) {
            w0 = mVar3.getBackgroundColor();
        } else {
            w0 = cmb.w0(null, cmb.Fl, false);
        }
        wuVar.setMenuColors(w0);
        wu wuVar2 = this.i0;
        m mVar4 = this.v0[0];
        if (mVar4 != null && gda.s0) {
            w02 = mVar4.getActionBarColor();
        } else {
            w02 = cmb.w0(null, cmb.Fl, false);
        }
        wuVar2.d(w02, true);
        wu wuVar3 = this.i0;
        m mVar5 = this.v0[0];
        if (mVar5 != null && mVar5.d()) {
            z = true;
        } else {
            z = false;
        }
        wuVar3.setIsTonsite(z);
        wu wuVar4 = this.i0;
        m mVar6 = this.v0[0];
        if (mVar6 != null && mVar6.c()) {
            z2 = true;
        }
        wuVar4.setIsLocal(z2);
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
        sx sxVar = this.L;
        boolean z2 = false;
        if (size <= 1) {
            articleViewer$WindowView.e = false;
            articleViewer$WindowView.d = false;
            a aVar = this.h0;
            if (sxVar != null) {
                x = sxVar.J * sxVar.c.getWidth();
            } else {
                x = aVar.getX();
            }
            AnimatorSet animatorSet = new AnimatorSet();
            float measuredWidth = aVar.getMeasuredWidth() - x;
            if (sxVar != null) {
                animatorSet.playTogether(sxVar.l(1.0f));
            } else {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.h0, View.TRANSLATION_X, aVar.getMeasuredWidth()), ObjectAnimator.ofFloat(this.g0, f1, aVar.getMeasuredWidth()));
            }
            animatorSet.setDuration(Math.max((int) ((420.0f / aVar.getMeasuredWidth()) * measuredWidth), 250));
            animatorSet.setInterpolator(d53.h);
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
        if (sxVar == null) {
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
        animatorSet2.setInterpolator(d53.h);
        animatorSet2.addListener(new g(this, i));
        animatorSet2.start();
        wu wuVar = this.i0;
        m mVar3 = this.v0[0];
        if (mVar3 != null && gda.s0) {
            w0 = mVar3.getBackgroundColor();
        } else {
            w0 = cmb.w0(null, cmb.Fl, false);
        }
        wuVar.setMenuColors(w0);
        wu wuVar2 = this.i0;
        m mVar4 = this.v0[0];
        if (mVar4 != null && gda.s0) {
            w02 = mVar4.getActionBarColor();
        } else {
            w02 = cmb.w0(null, cmb.Fl, false);
        }
        wuVar2.d(w02, true);
        wu wuVar3 = this.i0;
        m mVar5 = this.v0[0];
        if (mVar5 != null && mVar5.d()) {
            z = true;
        } else {
            z = false;
        }
        wuVar3.setIsTonsite(z);
        wu wuVar4 = this.i0;
        m mVar6 = this.v0[0];
        if (mVar6 != null && mVar6.c()) {
            z2 = true;
        }
        wuVar4.setIsLocal(z2);
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
                    fc4.g(e, true);
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
                this.h0.post(new ut(this, (byte) 6));
                nm7.f(this.Y).k(nm7.d1, new Object[0]);
                return;
            }
        }
    }

    public final boolean L(k47 k47Var, TLRPC.TL_webPage tL_webPage, String str, String str2) {
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
        sx sxVar = this.L;
        if (sxVar == null && this.W) {
            return false;
        }
        org.telegram.ui.ActionBar.d dVar = this.N;
        if (dVar != null && (dVar.getParentLayout() instanceof ActionBarLayout)) {
            gm.t1((ActionBarLayout) this.N.getParentLayout());
        }
        if (k47Var != null) {
            if (tL_webPage == null) {
                tL_webPage2 = k47Var.k.media.webpage;
            } else {
                tL_webPage2 = tL_webPage;
            }
            if (tL_webPage2 != null && (page = tL_webPage2.cached_page) != null && page.local != null) {
                z = true;
            } else {
                z = false;
            }
            for (int i2 = 0; i2 < k47Var.k.entities.size(); i2++) {
                TLRPC.MessageEntity messageEntity = k47Var.k.entities.get(i2);
                if (messageEntity instanceof TLRPC.TL_messageEntityUrl) {
                    try {
                        String str4 = k47Var.k.message;
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
                        fc4.g(e, true);
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
        if (sxVar != null && !arrayList.isEmpty()) {
            z2 = z;
            r5 = 1;
        } else {
            z2 = z;
            r5 = 0;
        }
        if (r5 == 0) {
            arrayList.clear();
            this.h0.setTranslationX(0.0f);
            if (sxVar != null) {
                sxVar.J = 0.0f;
                sxVar.c.invalidate();
                sxVar.u();
                sxVar.r();
            }
            this.h0.setTranslationY(0.0f);
            this.v0[0].setTranslationY(0.0f);
            this.v0[0].setTranslationX(0.0f);
            this.v0[1].setTranslationX(0.0f);
            this.v0[0].setAlpha(1.0f);
            this.g0.setInnerTranslationX(0.0f);
            this.v0[0].f();
            V(gm.L(56.0f));
        }
        if (sxVar != null && qw0.R0) {
            sxVar.a.d();
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
                if (k47Var != null) {
                    i = k47Var.K1;
                } else {
                    i = z8c.t0;
                }
                int i4 = i;
                ConnectionsManager.getInstance(i4).sendRequest(tL_messages_getWebPage, new ru((o) this, i4, tL_webPage2, k47Var, (boolean) r5, str3));
            }
        } else {
            d(r5, str2);
        }
        wu wuVar = this.i0;
        if (wuVar != null && r5 == 0) {
            wuVar.setIsLocal(this.v0[0].c());
        }
        this.U = null;
        if (sxVar != null) {
            if (r5 == 0) {
                gm.B2(this.g0);
                sxVar.d = this.g0;
                sxVar.A();
                sxVar.c.addView(this.g0, qoe.c(-1.0f, -1));
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
                fc4.g(e3, true);
                return false;
            }
        } else {
            this.f0.flags &= -17;
            ((WindowManager) this.M.getSystemService("window")).updateViewLayout(this.g0, this.f0);
        }
        this.W = true;
        this.a0 = (byte) 1;
        if (r5 == 0) {
            if (sxVar != null) {
                if (r5 != 0) {
                    sxVar.a.e();
                } else if (!sxVar.h) {
                    sxVar.q(sxVar.b);
                    sxVar.o();
                }
            } else {
                this.g0.setAlpha(0.0f);
                this.h0.setAlpha(0.0f);
                AnimatorSet animatorSet = new AnimatorSet();
                ArticleViewer$WindowView articleViewer$WindowView = this.g0;
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(articleViewer$WindowView, property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.h0, property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.g0, View.TRANSLATION_X, gm.L(56.0f), 0.0f));
                this.b0 = new ut(this, (byte) 11);
                animatorSet.setDuration(150L);
                animatorSet.setInterpolator(this.d0);
                animatorSet.addListener(new av(this));
                this.c0 = System.currentTimeMillis();
                gm.c3(new pf2(this, animatorSet, (byte) 27));
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
            ((LaunchActivity) this.M).u0(new yv1(bundle), false, true);
            l(false, true);
        }
    }

    public final void O(String str, String str2, vu vuVar) {
        Activity activity = this.M;
        if (activity != null && !activity.isFinishing()) {
            m mVar = this.v0[0];
            if (mVar != null && mVar.c()) {
                String M0 = jb6.M0(2131747515, null);
                int indexOf = M0.indexOf("%");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(String.format(M0, str));
                if (indexOf >= 0) {
                    spannableStringBuilder.setSpan(new URLSpan(str), indexOf, str.length() + indexOf, 33);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, null, this.M);
                String M02 = jb6.M0(2131747512, null);
                he heVar = alertDialog$Builder.a;
                heVar.S = M02;
                heVar.U = spannableStringBuilder;
                heVar.i0 = false;
                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                alertDialog$Builder.j(jb6.M0(2131747550, null), new lu(this, str, str2, vuVar, (byte) 0));
                alertDialog$Builder.o();
                return;
            }
            P(str, str2, vuVar);
        }
    }

    public final void P(String str, String str2, vu vuVar) {
        sx sxVar;
        vu vuVar2 = this.O0;
        if (vuVar2 != null) {
            vuVar2.a(false);
        }
        this.O0 = vuVar;
        if (this.H0 != 0) {
            ConnectionsManager.getInstance(this.Y).cancelRequest(this.H0, false);
            this.H0 = 0;
        }
        boolean[] zArr = new boolean[1];
        if (l11.n(this.M, str, false)) {
            if (this.e0.isEmpty() && (sxVar = this.L) != null) {
                sxVar.a(false);
                return;
            }
            return;
        }
        nu nuVar = new nu(this, str, zArr, vuVar);
        int i = this.J0 + 1;
        this.J0 = i;
        Z(true);
        TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
        tL_messages_getWebPage.url = str;
        tL_messages_getWebPage.hash = 0;
        this.H0 = ConnectionsManager.getInstance(this.Y).sendRequest(tL_messages_getWebPage, new ou(this, i, vuVar, str2, nuVar, tL_messages_getWebPage));
        if (vuVar != null) {
            vuVar.b = new wc7(this, i, vuVar, (byte) 4);
            vuVar.d();
        }
    }

    public final void Q() {
        int w0;
        int w02;
        TextView textView = this.D0;
        if (textView != null) {
            int i = cmb.h6;
            fg0 f0 = cmb.f0(cmb.w0(null, i, false), 2, -1);
            wmb M = anb.M(i);
            textView.setBackground(f0);
            anb.j(textView, f0, null, M, null);
            anb.X(this.D0, cmb.D8, null);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.C0;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            anb.h(cmb.F8, null, actionBarPopupWindow$ActionBarPopupWindowLayout);
        }
        ImageView imageView = this.s0;
        if (imageView != null) {
            anb.s(imageView, cmb.F6, null, PorterDuff.Mode.MULTIPLY);
            ImageView imageView2 = this.s0;
            int i2 = cmb.y8;
            anb.R(imageView2, cmb.f0(cmb.w0(null, i2, false), 1, -1), null, anb.M(i2), null);
        }
        ImageView imageView3 = this.t0;
        if (imageView3 != null) {
            anb.s(imageView3, cmb.F6, null, PorterDuff.Mode.MULTIPLY);
            ImageView imageView4 = this.t0;
            int i3 = cmb.y8;
            anb.R(imageView4, cmb.f0(cmb.w0(null, i3, false), 1, -1), null, anb.M(i3), null);
        }
        io ioVar = this.u0;
        if (ioVar != null) {
            anb.U(ioVar, cmb.F6, null);
        }
        wu wuVar = this.i0;
        if (wuVar != null) {
            m mVar = this.v0[0];
            if (mVar != null && gda.s0) {
                w0 = mVar.getBackgroundColor();
            } else {
                w0 = cmb.w0(null, cmb.Fl, false);
            }
            wuVar.setMenuColors(w0);
            wu wuVar2 = this.i0;
            m mVar2 = this.v0[0];
            if (mVar2 != null && gda.s0) {
                w02 = mVar2.getActionBarColor();
            } else {
                w02 = cmb.w0(null, cmb.Fl, false);
            }
            wuVar2.d(w02, true);
        }
        this.m0.setColor(cmb.w0(null, cmb.Fl, false));
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
            Point point = gm.q;
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
                    pageblockparagraph.text = dvc.d(textanchor.text, lowerCase, lowerCase2);
                    this.v0[0].c.getClass();
                    int I = ey.I(pageblockparagraph);
                    u69 x = this.v0[0].c.x(null, I);
                    View view = x.a;
                    this.v0[0].c.H(I, x, pageblockparagraph, 0, 0, false);
                    my0 i2 = wi8.i(this.M, false, 1, null);
                    i2.v0 = false;
                    i2.w0 = false;
                    LinearLayout linearLayout = new LinearLayout(this.M);
                    linearLayout.setOrientation(1);
                    gkb gkbVar = new gkb();
                    this.R0 = gkbVar;
                    gkbVar.Q(linearLayout);
                    this.R0.D = new yu(this, (byte) 1);
                    wb wbVar = new wb(this.M, (byte) 11);
                    wbVar.setTextSize(1, 16.0f);
                    wbVar.setTypeface(gm.o());
                    wbVar.setText(jb6.M0(2131748949, null));
                    if (this.v0[0].c.H) {
                        i = 5;
                    } else {
                        i = 3;
                    }
                    wbVar.setGravity(i | 16);
                    wbVar.setTextColor(cmb.w0(null, cmb.F6, false));
                    wbVar.setPadding(gm.L(18.0f), 0, gm.L(18.0f), 0);
                    linearLayout.addView(wbVar, new LinearLayout.LayoutParams(-1, gm.L(48.0f) + 1));
                    view.setTag("bottomSheet");
                    linearLayout.addView(view, qoe.k(0.0f, 7.0f, 0.0f, 0.0f, -1, -2));
                    rkb m = this.R0.m(this.M);
                    su suVar = new su(this, this.M, linearLayout, (byte) 0);
                    i2.z0 = new tu(this, (byte) 0);
                    suVar.addView(linearLayout, -1, -2);
                    suVar.addView(m, -1, -2);
                    i2.O = suVar;
                    if (this.Q0.w()) {
                        this.Q0.e(false);
                    }
                    this.J = i2;
                    Y(i2);
                    return true;
                } else if (num2.intValue() >= 0 && num2.intValue() < this.v0[0].c.e.size()) {
                    TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) this.v0[0].c.e.get(num2.intValue());
                    TL_iv.PageBlock w = w(pageBlock);
                    if ((w instanceof tx) && M((tx) w)) {
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
                            int I2 = ey.I(pageBlock);
                            u69 x2 = this.v0[0].c.x(null, I2);
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
                        yla ylaVar = new yla(this.v0[0].getContext());
                        ylaVar.a = num2.intValue();
                        ylaVar.s = (-gm.L(56.0f)) - num.intValue();
                        this.v0[0].d.v0(ylaVar);
                        return true;
                    }
                    this.v0[0].d.g1(num2.intValue(), (-gm.L(56.0f)) - num.intValue());
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
        wu wuVar = this.i0;
        if (wuVar != null && !wuVar.U && !wuVar.a0) {
            int j = Utilities.j(i, gm.L(56.0f), gm.L(24.0f));
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

    public final void W(Activity activity, org.telegram.ui.ActionBar.d dVar) {
        int i;
        boolean z;
        int w0;
        int i2;
        int i3;
        sx sxVar;
        a26 a26Var = this.W0;
        if (a26Var != null) {
            a26Var.a();
            this.W0 = null;
        }
        this.W0 = LaunchActivity.c0();
        this.N = dVar;
        if (!(dVar instanceof i34)) {
            i = dVar.getCurrentAccount();
        } else {
            i = z8c.t0;
        }
        this.Y = i;
        nm7.f(i).b(this, nm7.e2);
        nm7.f(this.Y).b(this, nm7.f2);
        nm7.f(this.Y).b(this, nm7.g2);
        nm7.f(this.Y).b(this, nm7.h2);
        nm7.f(this.Y).b(this, nm7.m4);
        Activity activity2 = this.M;
        if (activity2 != activity && (activity2 == null || !this.K || (sxVar = this.L) == null || sxVar.e == null)) {
            this.M = activity;
            this.a = org.telegram.messenger.a.b.getSharedPreferences("articles", 0).getInt("font_type", 0);
            o(this, false);
            this.m0 = new Paint();
            this.n0 = activity.getResources().getDrawable(2131231624);
            this.o0 = new Paint();
            ArticleViewer$WindowView articleViewer$WindowView = new ArticleViewer$WindowView(this, activity);
            this.g0 = articleViewer$WindowView;
            articleViewer$WindowView.setWillNotDraw(false);
            this.g0.setClipChildren(true);
            this.g0.setFocusable(false);
            a aVar = new a(this, activity);
            this.h0 = aVar;
            this.g0.addView(aVar, qoe.e(-1, -1, 51));
            if (this.L == null) {
                this.g0.setFitsSystemWindows(true);
                this.h0.setOnApplyWindowInsetsListener(new wt((byte) 0));
            }
            FrameLayout frameLayout = new FrameLayout(activity);
            this.Q = frameLayout;
            frameLayout.setBackgroundColor(-16777216);
            this.Q.setVisibility(4);
            this.g0.addView(this.Q, qoe.c(-1.0f, -1));
            jy jyVar = new jy(activity);
            this.S = jyVar;
            jyVar.setVisibility(0);
            this.S.setBackgroundColor(-16777216);
            this.Q.addView(this.S, qoe.e(-1, -1, 17));
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
                this.h0.addView(mVar, qoe.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
                mVar.b.setOnItemLongClickListener(new zt(this));
                mVar.b.setOnItemClickListener(new defpackage.o(this, mVar, (byte) 14));
                i4++;
            }
            this.h0.addView(new FrameLayout(activity), qoe.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
            this.x0.setColor(-16777216);
            this.y0.setColor(-16777216);
            this.B0.setColor(-14408666);
            this.z0.setColor(-16777216);
            wu wuVar = new wu(this, activity);
            this.i0 = wuVar;
            if (this.L != null) {
                z = true;
            } else {
                z = false;
            }
            wuVar.f0 = z;
            this.h0.addView(wuVar, qoe.e(-1, -2, 48));
            this.i0.setOnClickListener(new defpackage.t(this, activity, (byte) 17));
            this.i0.c0.addTextChangedListener(new b7(this, (byte) 2));
            eb ebVar = new eb(activity);
            this.j0 = ebVar;
            ebVar.setOpenProgress(0.0f);
            this.j0.x.j(new defpackage.y(this, (byte) 4));
            this.h0.addView(this.j0, qoe.c(-1.0f, -1));
            this.k0 = new ut(this, (byte) 1);
            this.i0.M.setOnClickListener(new yt(this, (byte) 2));
            this.i0.M.setOnLongClickListener(new au(this, (byte) 0));
            this.i0.setMenuListener(new x0(this, activity, (byte) 2));
            this.i0.P.setOnClickListener(new yt(this, (byte) 3));
            a6 a6Var = new a6(this.M, (byte) 1);
            this.r0 = a6Var;
            a6Var.setOnTouchListener(new p8((byte) 14));
            this.r0.setWillNotDraw(false);
            this.r0.setTranslationY(gm.L(51.0f));
            this.r0.setVisibility(4);
            this.r0.setFocusable(true);
            this.r0.setFocusableInTouchMode(true);
            this.r0.setClickable(true);
            this.r0.setPadding(0, gm.L(3.0f), 0, 0);
            this.h0.addView(this.r0, qoe.e(-1, 51, 80));
            new mx5(this.g0, false, new xt(this, (byte) 0));
            ImageView imageView = new ImageView(this.M);
            this.s0 = imageView;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            this.s0.setImageResource(2131232180);
            ImageView imageView2 = this.s0;
            int i5 = cmb.F6;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            anb.s(imageView2, i5, null, mode);
            ImageView imageView3 = this.s0;
            int i6 = cmb.y8;
            anb.R(imageView3, cmb.f0(cmb.w0(null, i6, false), 1, -1), null, anb.M(i6), null);
            this.r0.addView(this.s0, qoe.d(48, 48.0f, 53, 0.0f, 0.0f, 48.0f, 0.0f));
            this.s0.setOnClickListener(new yt(this, (byte) 0));
            this.s0.setContentDescription(jb6.M0(2131754778, null));
            ImageView imageView4 = new ImageView(this.M);
            this.t0 = imageView4;
            imageView4.setScaleType(scaleType);
            this.t0.setImageResource(2131232179);
            anb.s(this.t0, i5, null, mode);
            anb.R(this.t0, cmb.f0(cmb.w0(null, i6, false), 1, -1), null, anb.M(i6), null);
            this.r0.addView(this.t0, qoe.d(48, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
            this.t0.setOnClickListener(new yt(this, (byte) 1));
            this.t0.setContentDescription(jb6.M0(2131754777, null));
            io ioVar = new io(this.M, true, true, true);
            this.u0 = ioVar;
            ioVar.setScaleProperty(0.6f);
            this.u0.b(0.4f, 350L, d53.h);
            anb.U(this.u0, i5, null);
            this.u0.setTextSize(gm.L(15.0f));
            this.u0.setTypeface(gm.o());
            this.u0.setGravity(3);
            this.u0.getDrawable().N = gm.q.x;
            this.r0.addView(this.u0, qoe.d(-2, -2.0f, 19, 18.0f, 0.0f, 108.0f, 0.0f));
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
                w0 = cmb.w0(null, cmb.Z6, true);
            } else {
                w0 = cmb.w0(null, cmb.Z6, false);
            }
            if (gm.B(w0) >= 0.721f && Build.VERSION.SDK_INT >= 26) {
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
            gkb gkbVar = new gkb();
            this.Q0 = gkbVar;
            gkbVar.Q(this.v0[0].b);
            if (oc7.r1(this.Y).i4.r()) {
                this.Q0.k0 = new zt(this);
            }
            gkb gkbVar2 = this.Q0;
            gkbVar2.z0 = this.v0[0].d;
            gkbVar2.D = new yu(this, (byte) 0);
            this.h0.addView(gkbVar2.m(activity));
            a aVar2 = this.h0;
            pc8 pc8Var = new pc8(aVar2, aVar2);
            this.S0 = pc8Var;
            pc8Var.F = new zt(this);
            pc8Var.E = new k6d(this, (byte) 6);
            this.m0.setColor(cmb.w0(null, cmb.Fl, false));
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
        my0 my0Var = this.J;
        if (my0Var != null) {
            my0Var.dismiss();
            this.J = null;
        }
        my0 i = wi8.i(this.M, false, 1, null);
        try {
            str2 = URLDecoder.decode(str.replaceAll("\\+", "%2b"), "UTF-8");
        } catch (Exception e) {
            fc4.g(e, true);
            str2 = str;
        }
        i.P = str2;
        i.Q = false;
        i.R = true;
        CharSequence[] charSequenceArr = {jb6.M0(2131747550, null), jb6.M0(2131751704, null)};
        ff ffVar = new ff(this, str, (byte) 1);
        i.M = charSequenceArr;
        i.L = ffVar;
        i.I0 = new bu(this, (byte) 0);
        Y(i);
    }

    public final void Y(my0 my0Var) {
        if (this.M != null) {
            try {
                my0 my0Var2 = this.l0;
                if (my0Var2 != null) {
                    my0Var2.dismiss();
                    this.l0 = null;
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
            try {
                this.l0 = my0Var;
                my0Var.setCanceledOnTouchOutside(true);
                this.l0.setOnDismissListener(new bu(this, (byte) 1));
                my0Var.show();
            } catch (Exception e2) {
                fc4.g(e2, true);
            }
        }
    }

    public final void Z(boolean z) {
        gm.r(this.k0);
        wu wuVar = this.i0;
        if (z) {
            wuVar.e0.a(false, 0.0f);
            this.i0.e0.a(true, 0.3f);
            gm.d3(this.k0, 100L);
            return;
        }
        wuVar.e0.a(true, 1.0f);
    }

    @Override
    public final void a(ey eyVar, vjb vjbVar) {
        String str;
        String str2;
        m66 m66Var;
        String lowerCase;
        if (vjbVar != null && (str = vjbVar.b) != null) {
            my0 my0Var = this.J;
            vu vuVar = null;
            if (my0Var != null) {
                my0Var.dismiss();
                this.J = null;
            }
            int lastIndexOf = str.lastIndexOf(35);
            boolean z = false;
            if (lastIndexOf != -1) {
                boolean isEmpty = TextUtils.isEmpty(eyVar.F.cached_page.url);
                TLRPC.WebPage webPage = eyVar.F;
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
                bx bxVar = this.d;
                if (bxVar != null && (m66Var = this.b) != null) {
                    vuVar = new vu(this, bxVar, m66Var);
                }
                O(str, str2, vuVar);
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
            new c41(frameLayout, null).G(2131623982, 4, gm.N2(jb6.M0(2131752827, null), -1, 0, new ut(this, (byte) 10), null)).k(true);
        }
    }

    @Override
    public final boolean b(ey eyVar, TL_iv.PageBlock pageBlock) {
        int indexOf;
        List list;
        org.telegram.ui.ActionBar.d dVar = this.N;
        if (dVar != null && dVar.getParentActivity() != null) {
            if ((pageBlock instanceof TL_iv.pageBlockVideo) && !dy.g(eyVar.F, pageBlock)) {
                list = Collections.singletonList(pageBlock);
                indexOf = 0;
            } else {
                ArrayList arrayList = new ArrayList(eyVar.f);
                indexOf = eyVar.f.indexOf(pageBlock);
                list = arrayList;
            }
            PhotoViewer r0 = PhotoViewer.r0();
            r0.T1(null, this.N, null);
            if (r0.m1(null, null, null, null, null, null, null, indexOf, new ex(this, list), null, 0L, 0L, 0L, true, new lx(this, eyVar.F, list), null)) {
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
        ofFloat.addUpdateListener(new vt(this, (byte) 1));
        this.Z0.addListener(new y7((byte) 2, this, z));
        this.Z0.setDuration(320L);
        this.Z0.setInterpolator(d53.h);
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
            if (((obj instanceof TLRPC.WebPage) && ((TLRPC.WebPage) obj).cached_page != null) || (obj instanceof zw)) {
                int i5 = 1;
                if (!z && i != 0) {
                    m[] mVarArr = this.v0;
                    m mVar = mVarArr[1];
                    mVarArr[1] = mVarArr[0];
                    mVarArr[0] = mVar;
                    this.i0.i();
                    this.b1.a(this.v0[0].getBackgroundColor(), true);
                    this.c1.a(this.v0[1].getBackgroundColor(), true);
                    sx sxVar = this.L;
                    if (sxVar != null) {
                        sxVar.z();
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
                        Point point = gm.q;
                        mVar3.setTranslationX(point.x);
                        this.w0.playTogether(ObjectAnimator.ofFloat(this.v0[0], View.TRANSLATION_X, point.x, 0.0f));
                    } else if (i == -1) {
                        this.v0[0].setTranslationX(0.0f);
                        this.w0.playTogether(ObjectAnimator.ofFloat(this.v0[1], View.TRANSLATION_X, 0.0f, gm.q.x));
                    }
                    this.w0.setDuration(320L);
                    this.w0.setInterpolator(d53.h);
                    this.w0.addListener(new c(this, i4));
                    this.g0.f = true;
                    wu wuVar = this.i0;
                    m mVar4 = this.v0[0];
                    if (mVar4 != null && gda.s0) {
                        w0 = mVar4.getBackgroundColor();
                    } else {
                        w0 = cmb.w0(null, cmb.Fl, false);
                    }
                    wuVar.setMenuColors(w0);
                    wu wuVar2 = this.i0;
                    m mVar5 = this.v0[0];
                    if (mVar5 != null && gda.s0) {
                        w02 = mVar5.getActionBarColor();
                    } else {
                        w02 = cmb.w0(null, cmb.Fl, false);
                    }
                    wuVar2.d(w02, true);
                    wu wuVar3 = this.i0;
                    m mVar6 = this.v0[0];
                    if (mVar6 != null && mVar6.d()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    wuVar3.setIsTonsite(z2);
                    wu wuVar4 = this.i0;
                    m mVar7 = this.v0[0];
                    if (mVar7 != null && mVar7.c()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    wuVar4.setIsLocal(z3);
                    AnimatorSet animatorSet = this.w0;
                    Objects.requireNonNull(animatorSet);
                    gm.c3(new pu(animatorSet, (byte) 0));
                }
                if (!z) {
                    this.Q0.e(true);
                }
                ey eyVar = this.v0[z ? 1 : 0].c;
                if (z) {
                    obj = b10.f(2, this.e0);
                }
                this.v0[z ? 1 : 0].a();
                if (obj instanceof TLRPC.WebPage) {
                    TLRPC.WebPage webPage = (TLRPC.WebPage) obj;
                    this.v0[z ? 1 : 0].setWeb(null);
                    this.v0[z ? 1 : 0].setType(0);
                    TL_iv.Page page = webPage.cached_page;
                    eyVar.H = page.rtl;
                    eyVar.F = webPage;
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
                                        eyVar.G = (TL_iv.pageBlockChannel) pageBlock2;
                                    }
                                }
                            }
                        } else if (i6 == 1 && eyVar.G != null) {
                        }
                        if (i6 == size - 1) {
                            i3 = i6;
                        } else {
                            i3 = 0;
                        }
                        eyVar.F(eyVar, pageBlock, 0, 0, i3);
                    }
                    eyVar.f();
                    if (this.e0.size() != 1 && i != -1) {
                        u46 u46Var = this.v0[z ? 1 : 0].d;
                        sx sxVar2 = this.L;
                        if (sxVar2 == null) {
                            i5 = 0;
                        }
                        if (sxVar2 != null) {
                            i2 = gm.L(32.0f);
                        } else {
                            i2 = 0;
                        }
                        u46Var.g1(i5, i2);
                    } else {
                        SharedPreferences sharedPreferences = org.telegram.messenger.a.b.getSharedPreferences("articles", 0);
                        String str = "article" + webPage.id;
                        int i7 = sharedPreferences.getInt(str, -1);
                        boolean z4 = sharedPreferences.getBoolean(str.concat("r"), true);
                        Point point2 = gm.q;
                        if (point2.x <= point2.y) {
                            i5 = 0;
                        }
                        if (z4 == i5) {
                            L = sharedPreferences.getInt(str.concat("o"), 0) - this.v0[z ? 1 : 0].b.getPaddingTop();
                        } else {
                            L = gm.L(10.0f);
                        }
                        if (i7 != -1) {
                            this.v0[z ? 1 : 0].d.g1(i7, L);
                        }
                    }
                } else if (obj instanceof zw) {
                    this.v0[z ? 1 : 0].setType(1);
                    this.v0[z ? 1 : 0].f();
                    this.v0[z ? 1 : 0].setWeb((zw) obj);
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
        wy0 wy0Var = new wy0();
        wy0Var.x = str;
        this.e0.add(wy0Var);
        this.i0.h(false);
        c0(i, wy0Var, false);
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
            wu wuVar = this.i0;
            wuVar.d[0] = this.v0[0].getProgress();
            wuVar.invalidate();
            wu wuVar2 = this.i0;
            wuVar2.d[1] = this.v0[1].getProgress();
            wuVar2.invalidate();
            this.i0.setTransitionProgress(f3);
            wu wuVar3 = this.i0;
            if (!wuVar3.a0 && !wuVar3.U) {
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
                        float R1 = gm.R1(f, f2, f3);
                        this.i0.N.c(false, 1.0f - R1);
                        this.i0.Q.c();
                        wu wuVar4 = this.i0;
                        if (R1 > 0.5f) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        wuVar4.setBackButtonCached(z3);
                    }
                    this.i0.setHasForward(this.v0[0].w);
                    this.i0.setIsLocal(this.v0[0].c());
                    wu wuVar5 = this.i0;
                    if (this.v0[0].getWebView() != null && this.v0[0].getWebView().b) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    wuVar5.setIsLoaded(z4);
                }
            }
            wu wuVar6 = this.i0;
            int actionBarColor = this.v0[0].getActionBarColor();
            ArticleViewer$WindowView articleViewer$WindowView2 = this.g0;
            if (!articleViewer$WindowView2.e && !articleViewer$WindowView2.f) {
                z = false;
            } else {
                z = true;
            }
            wuVar6.b(0, this.b1.a(actionBarColor, z));
            wu wuVar7 = this.i0;
            int actionBarColor2 = this.v0[1].getActionBarColor();
            ArticleViewer$WindowView articleViewer$WindowView3 = this.g0;
            if (!articleViewer$WindowView3.e && !articleViewer$WindowView3.f) {
                z2 = false;
            } else {
                z2 = true;
            }
            wuVar7.b(1, this.c1.a(actionBarColor2, z2));
            this.i0.d(on2.f(f3, this.v0[0].getActionBarColor(), this.v0[1].getActionBarColor()), false);
            wu wuVar8 = this.i0;
            int i = (translationX > 0.5f ? 1 : (translationX == 0.5f ? 0 : -1));
            m[] mVarArr2 = this.v0;
            if (i > 0) {
                mVar2 = mVarArr2[0];
            } else {
                mVar2 = mVarArr2[1];
            }
            wuVar8.setMenuType(mVar2.a);
            sx sxVar = this.L;
            if (sxVar != null) {
                sxVar.c.invalidate();
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
        bv bvVar;
        k47 messageObject;
        if (i == nm7.h2) {
            k47 k47Var = (k47) objArr[0];
            if (this.v0 != null) {
                int i3 = 0;
                while (true) {
                    m[] mVarArr = this.v0;
                    if (i3 < mVarArr.length) {
                        int childCount = mVarArr[i3].b.getChildCount();
                        for (int i4 = 0; i4 < childCount; i4++) {
                            View childAt = this.v0[i3].b.getChildAt(i4);
                            if (childAt instanceof bv) {
                                ((bv) childAt).a(true);
                            }
                        }
                        i3++;
                    } else {
                        return;
                    }
                }
            }
        } else if (i != nm7.f2 && i != nm7.g2) {
            if (i == nm7.e2) {
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
                                    if ((childAt2 instanceof bv) && (messageObject = (bvVar = (bv) childAt2).getMessageObject()) != null && messageObject.e1() == num.intValue()) {
                                        k47 k47Var2 = MediaController.w().v0;
                                        if (k47Var2 != null) {
                                            messageObject.b0 = k47Var2.b0;
                                            messageObject.i0 = k47Var2.i0;
                                            messageObject.j0 = k47Var2.j0;
                                            bvVar.b();
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
            } else if (i == nm7.m4 && this.v0 != null) {
                int i7 = 0;
                while (true) {
                    m[] mVarArr3 = this.v0;
                    if (i7 < mVarArr3.length) {
                        int childCount3 = mVarArr3[i7].b.getChildCount();
                        for (int i8 = 0; i8 < childCount3; i8++) {
                            View childAt3 = this.v0[i7].b.getChildAt(i8);
                            if (childAt3 instanceof uw) {
                                ((uw) childAt3).e.invalidate();
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
                        if (childAt4 instanceof bv) {
                            bv bvVar2 = (bv) childAt4;
                            if (bvVar2.getMessageObject() != null) {
                                bvVar2.a(true);
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
        io ioVar = this.u0;
        if (size == 0) {
            ioVar.setText(jb6.M0(2131747901, null));
        } else if (size == 1) {
            ioVar.setText(jb6.M0(2131747560, null));
        } else {
            ioVar.setText(String.format(jb6.J0(size, "CountOfResults"), Integer.valueOf(i + 1), Integer.valueOf(size)));
        }
    }

    public final void g0(boolean z) {
        boolean z2;
        boolean z3 = false;
        this.i0.g(0, this.v0[0].getTitle(), z);
        this.i0.f(0, this.v0[0].getSubtitle());
        wu wuVar = this.i0;
        if (this.v0[0].e() && this.v0[0].getWebView() != null && this.v0[0].getWebView().F) {
            z2 = true;
        } else {
            z2 = false;
        }
        wuVar.e(0, z2);
        this.i0.g(1, this.v0[1].getTitle(), z);
        this.i0.f(1, this.v0[1].getSubtitle());
        wu wuVar2 = this.i0;
        if (this.v0[1].e() && this.v0[1].getWebView() != null && this.v0[1].getWebView().F) {
            z3 = true;
        }
        wuVar2.e(1, z3);
    }

    public final void h() {
        this.L0 = false;
        ax axVar = this.M0;
        if (axVar != null) {
            this.g0.removeCallbacks(axVar);
            this.M0 = null;
        }
        ax axVar2 = this.N0;
        if (axVar2 != null) {
            this.g0.removeCallbacks(axVar2);
            this.N0 = null;
        }
    }

    public final void j(eu euVar) {
        if (this.K0 == gm.L(56.0f)) {
            if (euVar != null) {
                euVar.run();
                return;
            }
            return;
        }
        ValueAnimator duration = ValueAnimator.ofObject(new IntEvaluator(), Integer.valueOf(this.K0), Integer.valueOf(gm.L(56.0f))).setDuration(180L);
        duration.setInterpolator(new DecelerateInterpolator());
        duration.addUpdateListener(new vt(this, (byte) 0));
        duration.addListener(new g0(euVar, (byte) 13));
        if (euVar != null) {
            duration.setDuration(duration.getDuration() / 2);
        }
        duration.start();
    }

    public final void k() {
        long j;
        xw xwVar;
        hx hxVar = this.v0[0].b;
        if (hxVar != null && this.X) {
            float measuredHeight = hxVar.getMeasuredHeight() / 2.0f;
            Uri uri = null;
            float f = 0.0f;
            xw xwVar2 = null;
            for (int i = 0; i < hxVar.getChildCount(); i++) {
                View childAt = hxVar.getChildAt(i);
                if (childAt instanceof xw) {
                    float measuredHeight2 = (childAt.getMeasuredHeight() / 2.0f) + childAt.getTop();
                    if (xwVar2 == null || Math.abs(measuredHeight - measuredHeight2) < Math.abs(measuredHeight - f)) {
                        xwVar2 = (xw) childAt;
                        f = measuredHeight2;
                    }
                }
            }
            boolean z = PhotoViewer.r0().f;
            if (z || ((xwVar = this.y) != null && xwVar != xwVar2 && this.x != null)) {
                VideoPlayerHolderBase videoPlayerHolderBase = this.x;
                if (videoPlayerHolderBase != null) {
                    xw xwVar3 = this.y;
                    long j2 = xwVar3.M.video_id;
                    yw a = yw.a(videoPlayerHolderBase, xwVar3);
                    xwVar3.c(a);
                    this.E.k(a, j2);
                    xw xwVar4 = this.y;
                    yw ywVar = xwVar4.N;
                    if (ywVar != null) {
                        Bitmap bitmap = ywVar.b;
                        if (bitmap != null) {
                            xwVar4.e.f0(bitmap);
                        }
                        this.y.e(false);
                    }
                    this.x.release(null);
                }
                this.x = null;
                this.y = null;
            }
            if (!z && xwVar2 != null) {
                int i2 = xw.W;
                ui5 ui5Var = xwVar2.a;
                if (xwVar2.P != null && ui5Var.x == null) {
                    ui5Var.x = new ww(xwVar2).with(xwVar2.n);
                    TLRPC.Document document = xwVar2.P;
                    for (int i3 = 0; i3 < document.attributes.size(); i3++) {
                        if (document.attributes.get(i3) instanceof TLRPC.TL_documentAttributeVideo) {
                            TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) document.attributes.get(i3);
                            xwVar2.h.a(tL_documentAttributeVideo.w / tL_documentAttributeVideo.h, 0);
                        }
                    }
                    TLRPC.WebPage webPage = xwVar2.b.F;
                    if (webPage != null) {
                        uri = kd4.j(((o) ui5Var).Y, webPage, document);
                    }
                    if (uri != null) {
                        VideoPlayerHolderBase videoPlayerHolderBase2 = ui5Var.x;
                        yw ywVar2 = xwVar2.N;
                        if (ywVar2 == null) {
                            j = 0;
                        } else {
                            j = ywVar2.a;
                        }
                        videoPlayerHolderBase2.seekTo(j);
                        ui5Var.x.preparePlayer(uri, true, 1.0f);
                        ui5Var.x.play();
                    }
                }
                this.y = xwVar2;
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
                sx sxVar = this.L;
                if (sxVar != null) {
                    sxVar.a(false);
                    return;
                }
                if (this.Q.getVisibility() == 0) {
                    if (this.P != null) {
                        this.Q.setVisibility(4);
                        this.T.onCustomViewHidden();
                        this.Q.removeView(this.P);
                        this.P = null;
                    } else {
                        tvc tvcVar = this.G0;
                        if (tvcVar != null && tvcVar.U) {
                            tvcVar.U = false;
                            tvcVar.m();
                            tvcVar.l(false);
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
                wu wuVar = this.i0;
                if (wuVar.U) {
                    wuVar.h(false);
                } else if (wuVar.a0) {
                    wuVar.k(false);
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
                            Object m = td4.m(1, arrayList);
                            if (m instanceof zw) {
                                ((zw) m).a();
                            }
                            if (m instanceof TLRPC.WebPage) {
                                dvc.o((TLRPC.WebPage) m);
                            }
                            c0(-1, arrayList.get(arrayList.size() - 1), false);
                            return;
                        }
                    }
                    nm7.f(this.Y).n(this, nm7.e2);
                    nm7.f(this.Y).n(this, nm7.f2);
                    nm7.f(this.Y).n(this, nm7.g2);
                    nm7.f(this.Y).n(this, nm7.h2);
                    nm7.f(this.Y).n(this, nm7.m4);
                    a26 a26Var = this.W0;
                    if (a26Var != null) {
                        a26Var.a();
                        this.W0 = null;
                    }
                    this.N = null;
                    try {
                        my0 my0Var = this.l0;
                        if (my0Var != null) {
                            my0Var.dismiss();
                            this.l0 = null;
                        }
                    } catch (Exception e) {
                        fc4.g(e, true);
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    ArticleViewer$WindowView articleViewer$WindowView = this.g0;
                    Property property = View.ALPHA;
                    animatorSet.playTogether(ObjectAnimator.ofFloat(articleViewer$WindowView, property, 0.0f), ObjectAnimator.ofFloat(this.h0, property, 0.0f), ObjectAnimator.ofFloat(this.g0, View.TRANSLATION_X, 0.0f, gm.L(56.0f)));
                    this.a0 = (byte) 2;
                    this.b0 = new ut(this, (byte) 9);
                    animatorSet.setDuration(150L);
                    animatorSet.setInterpolator(this.d0);
                    animatorSet.addListener(new g0(this, (byte) 14));
                    this.c0 = System.currentTimeMillis();
                    this.h0.setLayerType(2, null);
                    animatorSet.start();
                    while (true) {
                        vh6 vh6Var = this.E;
                        if (i < vh6Var.m()) {
                            yw ywVar = (yw) vh6Var.n(i);
                            Bitmap bitmap = ywVar.b;
                            if (bitmap != null) {
                                bitmap.recycle();
                                ywVar.b = null;
                            }
                            i++;
                        } else {
                            vh6Var.b();
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
                if (obj instanceof zw) {
                    m mVar = this.v0[0];
                    if (mVar != null && mVar.L == obj) {
                        ((zw) obj).c(mVar);
                    }
                    m mVar2 = this.v0[1];
                    if (mVar2 != null && mVar2.L == obj) {
                        ((zw) obj).c(mVar2);
                    }
                    ((zw) obj).a();
                } else if (obj instanceof TLRPC.WebPage) {
                    dvc.o((TLRPC.WebPage) obj);
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
                    fc4.g(e, true);
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
                fc4.g(e2, true);
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
        this.T0 = new po(new int[]{nm7.r, nm7.s});
        this.U0 = new yd[2];
        this.Y0 = -1;
        ut utVar = new ut(this, (byte) 2);
        d53 d53Var = d53.h;
        this.b1 = new km(utVar, 320L, d53Var);
        this.c1 = new km(new ut(this, (byte) 3), 320L, d53Var);
        this.K = false;
        this.L = null;
    }
}
