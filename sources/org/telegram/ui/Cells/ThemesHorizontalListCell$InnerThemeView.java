package org.telegram.ui.Cells;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gd;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.bb0;
public class ThemesHorizontalListCell$InnerThemeView extends FrameLayout {
    public static final int f30340c0 = 0;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public boolean L;
    public ObjectAnimator M;
    public float N;
    public final ArgbEvaluator O;
    public Drawable P;
    public final Paint Q;
    public BitmapShader R;
    public boolean S;
    public final Matrix T;
    public Drawable U;
    public int V;
    public long W;
    public final RadioButton f30341a;
    public boolean f30342a0;
    public org.telegram.ui.ActionBar.m6 f30343b;
    public final ia f30344b0;
    public final RectF f30345c;
    public final Paint d;
    public Drawable f30346e;
    public final TextPaint f30347f;
    public final Drawable h;
    public final Drawable f30348n;
    public boolean f30349r;
    public boolean f30350s;
    public float f30351w;
    public int f30352x;
    public int f30353y;

    public ThemesHorizontalListCell$InnerThemeView(ia iaVar, Context context) {
        super(context);
        this.f30344b0 = iaVar;
        this.f30345c = new RectF();
        this.d = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f30347f = textPaint;
        this.O = new ArgbEvaluator();
        this.Q = new Paint(3);
        this.T = new Matrix();
        setWillNotDraw(false);
        this.h = context.getResources().getDrawable(2131231982).mutate();
        this.f30348n = i5.c.g(context, 2131231983);
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        RadioButton radioButton = new RadioButton(context);
        this.f30341a = radioButton;
        radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
        addView(radioButton, c8.ma.d(22, 22.0f, 51, 27.0f, 75.0f, 0.0f, 0.0f));
    }

    public final void a() {
        int i7;
        org.telegram.ui.ActionBar.m6 m6Var = this.f30343b;
        if (m6Var.T && m6Var.Z == org.telegram.ui.ActionBar.n6.f29570n) {
            i7 = -1;
        } else {
            i7 = m6Var.R;
        }
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.h.setColorFilter(new PorterDuffColorFilter(i7, mode));
        this.f30348n.setColorFilter(new PorterDuffColorFilter(this.f30343b.p(), mode));
        double[] dArr = null;
        if (this.f30343b.f29249b == null) {
            d(false);
            this.f30346e = null;
        } else {
            this.f30346e = getResources().getDrawable(2131232579).mutate();
            int o4 = this.f30343b.o();
            this.E = o4;
            this.J = o4;
        }
        this.R = null;
        this.P = null;
        org.telegram.ui.ActionBar.m6 m6Var2 = this.f30343b;
        int i10 = m6Var2.N;
        if (i10 != 0 && m6Var2.O != 0) {
            int o10 = this.f30343b.o();
            org.telegram.ui.ActionBar.m6 m6Var3 = this.f30343b;
            bb0 bb0Var = new bb0(true, o10, m6Var3.N, m6Var3.O, m6Var3.P);
            bb0Var.v(org.telegram.messenger.g0.L(6.0f));
            this.P = bb0Var;
            dArr = org.telegram.messenger.g0.d3(Color.red(this.f30343b.o()), Color.green(this.f30343b.o()), Color.blue(this.f30343b.o()));
        } else if (i10 != 0) {
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{this.f30343b.o(), this.f30343b.N});
            gradientDrawable.setCornerRadius(org.telegram.messenger.g0.L(6.0f));
            this.P = gradientDrawable;
            dArr = org.telegram.messenger.g0.d3(Color.red(this.f30343b.o()), Color.green(this.f30343b.o()), Color.blue(this.f30343b.o()));
        } else if (m6Var2.Q <= 0 && m6Var2.f29251c == null) {
            if (m6Var2.o() != 0) {
                dArr = org.telegram.messenger.g0.d3(Color.red(this.f30343b.o()), Color.green(this.f30343b.o()), Color.blue(this.f30343b.o()));
            }
        } else {
            org.telegram.ui.ActionBar.m6 m6Var4 = this.f30343b;
            Bitmap e12 = org.telegram.messenger.g0.e1(org.telegram.messenger.g0.L(76.0f), org.telegram.messenger.g0.L(97.0f), m6Var4.f29251c, m6Var4.f29249b, m6Var4.Q);
            if (e12 != null) {
                this.P = new BitmapDrawable(e12);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(e12, tileMode, tileMode);
                this.R = bitmapShader;
                this.Q.setShader(bitmapShader);
                int[] q10 = org.telegram.messenger.g0.q(this.P);
                dArr = org.telegram.messenger.g0.d3(Color.red(q10[0]), Color.green(q10[0]), Color.blue(q10[0]));
            }
        }
        if (dArr != null && dArr[1] <= 0.10000000149011612d && dArr[2] >= 0.9599999785423279d) {
            this.S = true;
        } else {
            this.S = false;
        }
        if (this.f30343b.o() == 0 && this.f30343b.U && this.P == null) {
            bb0 S = org.telegram.ui.ActionBar.n6.S(100, 200);
            this.P = S;
            S.v(org.telegram.messenger.g0.L(6.0f));
        }
        invalidate();
    }

    public final int b(int i7, int i10) {
        float f10 = this.N;
        if (f10 == 1.0f) {
            return i10;
        }
        return ((Integer) this.O.evaluate(f10, Integer.valueOf(i7), Integer.valueOf(i10))).intValue();
    }

    public final boolean c() {
        char c10;
        int h;
        int intValue;
        String[] split;
        HashMap hashMap = this.f30344b0.f30842i3;
        org.telegram.ui.ActionBar.m6 m6Var = this.f30343b;
        if (m6Var == null || m6Var.f29249b == null) {
            return false;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(this.f30343b.f29249b));
            int i7 = 0;
            boolean z10 = false;
            while (true) {
                int read = fileInputStream.read(ia.f30838q3);
                char c11 = 65535;
                if (read == -1) {
                    break;
                }
                int i10 = i7;
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    if (i11 >= read) {
                        break;
                    }
                    byte[] bArr = ia.f30838q3;
                    if (bArr[i11] == 10) {
                        int i13 = i11 - i12;
                        int i14 = i13 + 1;
                        String str = new String(bArr, i12, i13, "UTF-8");
                        if (str.startsWith("WLS=")) {
                            String substring = str.substring(4);
                            Uri parse = Uri.parse(substring);
                            this.f30343b.f29254e = parse.getQueryParameter("slug");
                            org.telegram.ui.ActionBar.m6 m6Var2 = this.f30343b;
                            File h7 = org.telegram.messenger.t0.h();
                            m6Var2.f29251c = new File(h7, Utilities.a(substring) + ".wp").getAbsolutePath();
                            String queryParameter = parse.getQueryParameter("mode");
                            if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                                int i15 = 0;
                                while (true) {
                                    if (i15 >= split.length) {
                                        break;
                                    } else if ("blur".equals(split[i15])) {
                                        this.f30343b.h = true;
                                        break;
                                    } else {
                                        i15++;
                                    }
                                }
                            }
                            if (!TextUtils.isEmpty(parse.getQueryParameter("pattern"))) {
                                try {
                                    String queryParameter2 = parse.getQueryParameter("bg_color");
                                    if (!TextUtils.isEmpty(queryParameter2)) {
                                        this.f30343b.f29264r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                        if (queryParameter2.length() >= 13 && org.telegram.messenger.g0.S1(queryParameter2.charAt(6))) {
                                            this.f30343b.f29265s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                        }
                                        if (queryParameter2.length() >= 20 && org.telegram.messenger.g0.S1(queryParameter2.charAt(13))) {
                                            this.f30343b.f29266w = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                        }
                                        if (queryParameter2.length() == 27 && org.telegram.messenger.g0.S1(queryParameter2.charAt(20))) {
                                            this.f30343b.f29267x = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                        }
                                    }
                                } catch (Exception unused) {
                                }
                                try {
                                    String queryParameter3 = parse.getQueryParameter("rotation");
                                    if (!TextUtils.isEmpty(queryParameter3)) {
                                        this.f30343b.f29268y = Utilities.z(queryParameter3).intValue();
                                    }
                                } catch (Exception unused2) {
                                }
                                String queryParameter4 = parse.getQueryParameter("intensity");
                                if (!TextUtils.isEmpty(queryParameter4)) {
                                    this.f30343b.E = Utilities.z(queryParameter4).intValue();
                                }
                                org.telegram.ui.ActionBar.m6 m6Var3 = this.f30343b;
                                if (m6Var3.E == 0) {
                                    m6Var3.E = 50;
                                }
                            }
                            c10 = 65535;
                        } else if (str.startsWith("WPS")) {
                            this.f30343b.Q = i14 + i10;
                            z10 = true;
                            break;
                        } else {
                            int indexOf = str.indexOf(61);
                            c10 = 65535;
                            if (indexOf != -1 && ((h = org.telegram.ui.ActionBar.w4.h(str.substring(0, indexOf))) == org.telegram.ui.ActionBar.n6.f29657ra || h == org.telegram.ui.ActionBar.n6.f29658rb || h == org.telegram.ui.ActionBar.n6.Ee || h == org.telegram.ui.ActionBar.n6.Fe || h == org.telegram.ui.ActionBar.n6.Ge || h == org.telegram.ui.ActionBar.n6.He)) {
                                String substring2 = str.substring(indexOf + 1);
                                if (substring2.length() > 0 && substring2.charAt(0) == '#') {
                                    try {
                                        intValue = Color.parseColor(substring2);
                                    } catch (Exception unused3) {
                                        intValue = Utilities.z(substring2).intValue();
                                    }
                                } else {
                                    intValue = Utilities.z(substring2).intValue();
                                }
                                if (h == org.telegram.ui.ActionBar.n6.f29657ra) {
                                    this.f30343b.R = intValue;
                                } else if (h == org.telegram.ui.ActionBar.n6.f29658rb) {
                                    this.f30343b.S = intValue;
                                } else if (h == org.telegram.ui.ActionBar.n6.Ee) {
                                    this.f30343b.M = intValue;
                                } else if (h == org.telegram.ui.ActionBar.n6.Fe) {
                                    this.f30343b.N = intValue;
                                } else if (h == org.telegram.ui.ActionBar.n6.Ge) {
                                    this.f30343b.O = intValue;
                                } else if (h == org.telegram.ui.ActionBar.n6.He) {
                                    this.f30343b.P = intValue;
                                }
                            }
                        }
                        i12 += i14;
                        i10 += i14;
                    } else {
                        c10 = c11;
                    }
                    i11++;
                    c11 = c10;
                }
                if (z10 || i7 == i10) {
                    break;
                }
                fileInputStream.getChannel().position(i10);
                i7 = i10;
            }
            fileInputStream.close();
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
        org.telegram.ui.ActionBar.m6 m6Var4 = this.f30343b;
        if (m6Var4.f29251c != null && !m6Var4.f29256f && !new File(this.f30343b.f29251c).exists()) {
            if (hashMap.containsKey(this.f30343b)) {
                return false;
            }
            org.telegram.ui.ActionBar.m6 m6Var5 = this.f30343b;
            hashMap.put(m6Var5, m6Var5.f29254e);
            TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
            TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
            org.telegram.ui.ActionBar.m6 m6Var6 = this.f30343b;
            tL_inputWallPaperSlug.slug = m6Var6.f29254e;
            getwallpaper.wallpaper = tL_inputWallPaperSlug;
            ConnectionsManager.getInstance(m6Var6.F).sendRequest(getwallpaper, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    int i16 = ThemesHorizontalListCell$InnerThemeView.f30340c0;
                    org.telegram.messenger.g0.g3(new ga(0, ThemesHorizontalListCell$InnerThemeView.this, tLObject));
                }
            });
            return false;
        }
        this.f30343b.U = true;
        return true;
    }

    public final void d(boolean z10) {
        int i7;
        int i10;
        int i11;
        this.H = this.f30352x;
        this.I = this.f30353y;
        this.J = this.E;
        this.K = this.F;
        int i12 = 0;
        org.telegram.ui.ActionBar.k6 k10 = this.f30343b.k(false);
        if (k10 != null) {
            i12 = k10.f29170c;
            i10 = k10.f29171e;
            if (i10 == 0) {
                i10 = i12;
            }
            i7 = (int) k10.f29175j;
            if (i7 == 0) {
                i7 = i12;
            }
        } else {
            i7 = 0;
            i10 = 0;
        }
        org.telegram.ui.ActionBar.m6 m6Var = this.f30343b;
        if (m6Var.T && m6Var.Z == org.telegram.ui.ActionBar.n6.f29570n) {
            i11 = -1;
        } else {
            i11 = m6Var.R;
        }
        this.f30352x = org.telegram.ui.ActionBar.n6.C(m6Var, i12, i11);
        org.telegram.ui.ActionBar.m6 m6Var2 = this.f30343b;
        this.f30353y = org.telegram.ui.ActionBar.n6.C(m6Var2, i10, m6Var2.p());
        org.telegram.ui.ActionBar.m6 m6Var3 = this.f30343b;
        this.E = org.telegram.ui.ActionBar.n6.C(m6Var3, i7, m6Var3.o());
        this.F = this.f30353y;
        this.G = this.f30343b.Z;
        ObjectAnimator objectAnimator = this.M;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (z10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "accentState", 0.0f, 1.0f);
            this.M = ofFloat;
            ofFloat.setDuration(200L);
            this.M.start();
            return;
        }
        setAccentState(1.0f);
    }

    public float getAccentState() {
        return this.N;
    }

    @Override
    public final void onAttachedToWindow() {
        org.telegram.ui.ActionBar.m6 D0;
        boolean z10;
        TLRPC.TL_theme tL_theme;
        super.onAttachedToWindow();
        ia iaVar = this.f30344b0;
        if (iaVar.f30846n3 == 1) {
            D0 = org.telegram.ui.ActionBar.n6.J;
        } else {
            D0 = org.telegram.ui.ActionBar.n6.D0();
        }
        if (this.f30343b == D0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f30341a.a(z10, false);
        org.telegram.ui.ActionBar.m6 m6Var = this.f30343b;
        if (m6Var != null && (tL_theme = m6Var.G) != null && !m6Var.V) {
            if (!iaVar.f30841h3.containsKey(org.telegram.messenger.w7.r(null, tL_theme.document)) && !iaVar.f30842i3.containsKey(this.f30343b)) {
                this.f30343b.V = true;
                this.f30351w = 0.0f;
                c();
                a();
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        float f10;
        int i10;
        float f11;
        float f12;
        if (this.G != this.f30343b.Z) {
            d(true);
        }
        if (this.f30350s) {
            i7 = org.telegram.messenger.g0.L(22.0f);
        } else {
            i7 = 0;
        }
        int L = org.telegram.messenger.g0.L(11.0f);
        float f13 = i7;
        float f14 = L;
        float L2 = org.telegram.messenger.g0.L(97.0f) + L;
        RectF rectF = this.f30345c;
        rectF.set(f13, f14, org.telegram.messenger.g0.L(76.0f) + i7, L2);
        String n10 = this.f30343b.n();
        if (n10.toLowerCase().endsWith(".attheme")) {
            n10 = n10.substring(0, n10.lastIndexOf(46));
        }
        int measuredWidth = getMeasuredWidth();
        if (this.f30350s) {
            f10 = 10.0f;
        } else {
            f10 = 15.0f;
        }
        int L3 = measuredWidth - org.telegram.messenger.g0.L(f10);
        if (this.f30349r) {
            i10 = org.telegram.messenger.g0.L(7.0f);
        } else {
            i10 = 0;
        }
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint = this.f30347f;
        String charSequence = TextUtils.ellipsize(n10, textPaint, L3 - i10, truncateAt).toString();
        textPaint.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G6, false));
        canvas.drawText(charSequence, ((org.telegram.messenger.g0.L(76.0f) - ((int) Math.ceil(textPaint.measureText(charSequence)))) / 2) + i7, org.telegram.messenger.g0.L(131.0f), textPaint);
        org.telegram.ui.ActionBar.m6 m6Var = this.f30343b;
        TLRPC.TL_theme tL_theme = m6Var.G;
        Paint paint = this.d;
        RadioButton radioButton = this.f30341a;
        if (tL_theme != null && (tL_theme.document == null || !m6Var.V)) {
            f11 = 6.0f;
            f12 = 1.0f;
        } else {
            paint.setColor(b(this.J, this.E));
            boolean z10 = this.L;
            Drawable drawable = this.f30348n;
            Drawable drawable2 = this.h;
            if (z10) {
                f11 = 6.0f;
                f12 = 1.0f;
                int b10 = b(this.H, this.f30352x);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable2.setColorFilter(new PorterDuffColorFilter(b10, mode));
                drawable.setColorFilter(new PorterDuffColorFilter(b(this.I, this.f30353y), mode));
                this.L = false;
            } else {
                f11 = 6.0f;
                f12 = 1.0f;
            }
            Drawable drawable3 = this.P;
            if (drawable3 != null) {
                if (this.R != null) {
                    BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable3;
                    float width = bitmapDrawable.getBitmap().getWidth();
                    float height = bitmapDrawable.getBitmap().getHeight();
                    float width2 = width / rectF.width();
                    float height2 = height / rectF.height();
                    Matrix matrix = this.T;
                    matrix.reset();
                    float min = f12 / Math.min(width2, height2);
                    float f15 = width / height2;
                    if (f15 > rectF.width()) {
                        matrix.setTranslate(f13 - ((f15 - rectF.width()) / 2.0f), f14);
                    } else {
                        matrix.setTranslate(f13, f14 - (((height / width2) - rectF.height()) / 2.0f));
                    }
                    matrix.preScale(min, min);
                    this.R.setLocalMatrix(matrix);
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11), this.Q);
                } else {
                    drawable3.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                    this.P.draw(canvas);
                }
            } else {
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11), paint);
            }
            radioButton.b(1728053247, -1);
            org.telegram.ui.ActionBar.m6 m6Var2 = this.f30343b;
            if (m6Var2.Y != 0) {
                if ("Day".equals(m6Var2.f29247a) || "Arctic Blue".equals(this.f30343b.f29247a)) {
                    radioButton.b(-5000269, b(this.K, this.F));
                    org.telegram.ui.ActionBar.n6.X1.setColor(733001146);
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11), org.telegram.ui.ActionBar.n6.X1);
                }
            } else if (this.S) {
                radioButton.b(-5000269, m6Var2.p());
                org.telegram.ui.ActionBar.n6.X1.setColor(733001146);
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11), org.telegram.ui.ActionBar.n6.X1);
            }
            drawable2.setBounds(org.telegram.messenger.g0.L(f11) + i7, org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(49.0f) + i7, org.telegram.messenger.g0.L(36.0f));
            drawable2.draw(canvas);
            drawable.setBounds(org.telegram.messenger.g0.L(27.0f) + i7, org.telegram.messenger.g0.L(41.0f), org.telegram.messenger.g0.L(70.0f) + i7, org.telegram.messenger.g0.L(55.0f));
            drawable.draw(canvas);
            if (this.f30346e != null && this.f30344b0.f30846n3 == 0) {
                int L4 = ((int) rectF.right) - org.telegram.messenger.g0.L(16.0f);
                int L5 = org.telegram.messenger.g0.L(f11) + ((int) rectF.top);
                Drawable drawable4 = this.f30346e;
                drawable4.setBounds(L4, L5, drawable4.getIntrinsicWidth() + L4, this.f30346e.getIntrinsicHeight() + L5);
                this.f30346e.draw(canvas);
            }
        }
        org.telegram.ui.ActionBar.m6 m6Var3 = this.f30343b;
        TLRPC.TL_theme tL_theme2 = m6Var3.G;
        if (tL_theme2 != null && tL_theme2.document == null) {
            radioButton.setAlpha(0.0f);
            org.telegram.ui.ActionBar.n6.X1.setColor(733001146);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11), org.telegram.ui.ActionBar.n6.X1);
            if (this.U != null) {
                int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.E6, false);
                if (this.V != x02) {
                    Drawable drawable5 = this.U;
                    this.V = x02;
                    org.telegram.ui.ActionBar.n6.C1(x02, drawable5);
                }
                int centerX = (int) (rectF.centerX() - (this.U.getIntrinsicWidth() / 2));
                int centerY = (int) (rectF.centerY() - (this.U.getIntrinsicHeight() / 2));
                Drawable drawable6 = this.U;
                drawable6.setBounds(centerX, centerY, drawable6.getIntrinsicWidth() + centerX, this.U.getIntrinsicHeight() + centerY);
                this.U.draw(canvas);
            }
        } else if ((tL_theme2 != null && !m6Var3.V) || this.f30351w > 0.0f) {
            radioButton.setAlpha(f12 - this.f30351w);
            paint.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29337a7, false));
            paint.setAlpha((int) (this.f30351w * 255.0f));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11), paint);
            if (this.U != null) {
                int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.E6, false);
                if (this.V != x03) {
                    Drawable drawable7 = this.U;
                    this.V = x03;
                    org.telegram.ui.ActionBar.n6.C1(x03, drawable7);
                }
                int centerX2 = (int) (rectF.centerX() - (this.U.getIntrinsicWidth() / 2));
                int centerY2 = (int) (rectF.centerY() - (this.U.getIntrinsicHeight() / 2));
                this.U.setAlpha((int) (this.f30351w * 255.0f));
                Drawable drawable8 = this.U;
                drawable8.setBounds(centerX2, centerY2, drawable8.getIntrinsicWidth() + centerX2, this.U.getIntrinsicHeight() + centerY2);
                this.U.draw(canvas);
            }
            if (this.f30343b.V) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long min2 = Math.min(17L, elapsedRealtime - this.W);
                this.W = elapsedRealtime;
                float f16 = this.f30351w - (((float) min2) / 180.0f);
                this.f30351w = f16;
                if (f16 < 0.0f) {
                    this.f30351w = 0.0f;
                }
                invalidate();
            }
        } else if (radioButton.getAlpha() != f12) {
            radioButton.setAlpha(f12);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String n10 = this.f30343b.n();
        if (n10.toLowerCase().endsWith(".attheme")) {
            n10 = n10.substring(0, n10.lastIndexOf(46));
        }
        accessibilityNodeInfo.setText(n10);
        accessibilityNodeInfo.setClassName(Button.class.getName());
        accessibilityNodeInfo.setChecked(this.f30341a.f33093f);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, gd.M0(2131754839, null)));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12 = 22;
        if (this.f30349r) {
            i11 = 22;
        } else {
            i11 = 15;
        }
        int i13 = i11 + 76;
        if (!this.f30350s) {
            i12 = 0;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(i13 + i12), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(148.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.m6 m6Var;
        if (this.f30346e != null && (m6Var = this.f30343b) != null && (m6Var.G == null || m6Var.V)) {
            ia iaVar = this.f30344b0;
            if (iaVar.f30846n3 == 0) {
                int action = motionEvent.getAction();
                if (action == 0 || action == 1) {
                    float x10 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    RectF rectF = this.f30345c;
                    if (x10 > rectF.centerX() && y10 < rectF.centerY() - org.telegram.messenger.g0.L(10.0f)) {
                        if (action == 0) {
                            this.f30342a0 = true;
                        } else {
                            try {
                                performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                            iaVar.C1(this.f30343b);
                        }
                    }
                    if (action == 1) {
                        this.f30342a0 = false;
                    }
                }
                return this.f30342a0;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAccentState(float f10) {
        this.N = f10;
        this.L = true;
        invalidate();
    }
}
