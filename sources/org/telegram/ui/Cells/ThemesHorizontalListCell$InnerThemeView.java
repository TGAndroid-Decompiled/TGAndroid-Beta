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
import org.telegram.messenger.dd;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.jb0;
public class ThemesHorizontalListCell$InnerThemeView extends FrameLayout {
    public static final int f21642b0 = 0;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public boolean K;
    public ObjectAnimator L;
    public float M;
    public final ArgbEvaluator N;
    public Drawable O;
    public final Paint P;
    public BitmapShader Q;
    public boolean R;
    public final Matrix S;
    public Drawable T;
    public int U;
    public long V;
    public boolean W;
    public final RadioButton f21643a;
    public final ga f21644a0;
    public org.telegram.ui.ActionBar.s6 f21645b;
    public final RectF f21646c;
    public final Paint d;
    public Drawable e;
    public final TextPaint f21647f;
    public final Drawable h;
    public final Drawable f21648n;
    public boolean f21649r;
    public boolean f21650s;
    public float f21651w;
    public int f21652x;
    public int f21653y;

    public ThemesHorizontalListCell$InnerThemeView(ga gaVar, Context context) {
        super(context);
        this.f21644a0 = gaVar;
        this.f21646c = new RectF();
        this.d = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f21647f = textPaint;
        this.N = new ArgbEvaluator();
        this.P = new Paint(3);
        this.S = new Matrix();
        setWillNotDraw(false);
        this.h = context.getResources().getDrawable(2131231980).mutate();
        this.f21648n = i0.a.f(context, 2131231981);
        textPaint.setTextSize(org.telegram.messenger.i0.L(13.0f));
        RadioButton radioButton = new RadioButton(context);
        this.f21643a = radioButton;
        radioButton.setSize(org.telegram.messenger.i0.L(20.0f));
        addView(radioButton, w7.b6.d(22, 22.0f, 51, 27.0f, 75.0f, 0.0f, 0.0f));
    }

    public final void a() {
        int i10;
        org.telegram.ui.ActionBar.s6 s6Var = this.f21645b;
        if (s6Var.S && s6Var.Y == org.telegram.ui.ActionBar.t6.f21109n) {
            i10 = -1;
        } else {
            i10 = s6Var.Q;
        }
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.h.setColorFilter(new PorterDuffColorFilter(i10, mode));
        this.f21648n.setColorFilter(new PorterDuffColorFilter(this.f21645b.p(), mode));
        double[] dArr = null;
        if (this.f21645b.f20804b == null) {
            d(false);
            this.e = null;
        } else {
            this.e = getResources().getDrawable(2131232574).mutate();
            int o10 = this.f21645b.o();
            this.D = o10;
            this.I = o10;
        }
        this.Q = null;
        this.O = null;
        org.telegram.ui.ActionBar.s6 s6Var2 = this.f21645b;
        int i11 = s6Var2.M;
        if (i11 != 0 && s6Var2.N != 0) {
            int o11 = this.f21645b.o();
            org.telegram.ui.ActionBar.s6 s6Var3 = this.f21645b;
            jb0 jb0Var = new jb0(true, o11, s6Var3.M, s6Var3.N, s6Var3.O);
            jb0Var.v(org.telegram.messenger.i0.L(6.0f));
            this.O = jb0Var;
            dArr = org.telegram.messenger.i0.d3(Color.red(this.f21645b.o()), Color.green(this.f21645b.o()), Color.blue(this.f21645b.o()));
        } else if (i11 != 0) {
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{this.f21645b.o(), this.f21645b.M});
            gradientDrawable.setCornerRadius(org.telegram.messenger.i0.L(6.0f));
            this.O = gradientDrawable;
            dArr = org.telegram.messenger.i0.d3(Color.red(this.f21645b.o()), Color.green(this.f21645b.o()), Color.blue(this.f21645b.o()));
        } else if (s6Var2.P <= 0 && s6Var2.f20806c == null) {
            if (s6Var2.o() != 0) {
                dArr = org.telegram.messenger.i0.d3(Color.red(this.f21645b.o()), Color.green(this.f21645b.o()), Color.blue(this.f21645b.o()));
            }
        } else {
            org.telegram.ui.ActionBar.s6 s6Var4 = this.f21645b;
            Bitmap e12 = org.telegram.messenger.i0.e1(org.telegram.messenger.i0.L(76.0f), org.telegram.messenger.i0.L(97.0f), s6Var4.f20806c, s6Var4.f20804b, s6Var4.P);
            if (e12 != null) {
                this.O = new BitmapDrawable(e12);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(e12, tileMode, tileMode);
                this.Q = bitmapShader;
                this.P.setShader(bitmapShader);
                int[] q6 = org.telegram.messenger.i0.q(this.O);
                dArr = org.telegram.messenger.i0.d3(Color.red(q6[0]), Color.green(q6[0]), Color.blue(q6[0]));
            }
        }
        if (dArr != null && dArr[1] <= 0.10000000149011612d && dArr[2] >= 0.9599999785423279d) {
            this.R = true;
        } else {
            this.R = false;
        }
        if (this.f21645b.o() == 0 && this.f21645b.T && this.O == null) {
            jb0 S = org.telegram.ui.ActionBar.t6.S(100, 200);
            this.O = S;
            S.v(org.telegram.messenger.i0.L(6.0f));
        }
        invalidate();
    }

    public final int b(int i10, int i11) {
        float f7 = this.M;
        if (f7 == 1.0f) {
            return i11;
        }
        return ((Integer) this.N.evaluate(f7, Integer.valueOf(i10), Integer.valueOf(i11))).intValue();
    }

    public final boolean c() {
        char c10;
        int h;
        int intValue;
        String[] split;
        HashMap hashMap = this.f21644a0.f21940h3;
        org.telegram.ui.ActionBar.s6 s6Var = this.f21645b;
        if (s6Var == null || s6Var.f20804b == null) {
            return false;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(this.f21645b.f20804b));
            int i10 = 0;
            boolean z10 = false;
            while (true) {
                int read = fileInputStream.read(ga.f21936p3);
                char c11 = 65535;
                if (read == -1) {
                    break;
                }
                int i11 = i10;
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    if (i12 >= read) {
                        break;
                    }
                    byte[] bArr = ga.f21936p3;
                    if (bArr[i12] == 10) {
                        int i14 = i12 - i13;
                        int i15 = i14 + 1;
                        String str = new String(bArr, i13, i14, "UTF-8");
                        if (str.startsWith("WLS=")) {
                            String substring = str.substring(4);
                            Uri parse = Uri.parse(substring);
                            this.f21645b.e = parse.getQueryParameter("slug");
                            org.telegram.ui.ActionBar.s6 s6Var2 = this.f21645b;
                            File h10 = org.telegram.messenger.w0.h();
                            s6Var2.f20806c = new File(h10, Utilities.a(substring) + ".wp").getAbsolutePath();
                            String queryParameter = parse.getQueryParameter("mode");
                            if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                                int i16 = 0;
                                while (true) {
                                    if (i16 >= split.length) {
                                        break;
                                    } else if ("blur".equals(split[i16])) {
                                        this.f21645b.h = true;
                                        break;
                                    } else {
                                        i16++;
                                    }
                                }
                            }
                            if (!TextUtils.isEmpty(parse.getQueryParameter("pattern"))) {
                                try {
                                    String queryParameter2 = parse.getQueryParameter("bg_color");
                                    if (!TextUtils.isEmpty(queryParameter2)) {
                                        this.f21645b.f20817r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                        if (queryParameter2.length() >= 13 && org.telegram.messenger.i0.S1(queryParameter2.charAt(6))) {
                                            this.f21645b.f20818s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                        }
                                        if (queryParameter2.length() >= 20 && org.telegram.messenger.i0.S1(queryParameter2.charAt(13))) {
                                            this.f21645b.f20819w = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                        }
                                        if (queryParameter2.length() == 27 && org.telegram.messenger.i0.S1(queryParameter2.charAt(20))) {
                                            this.f21645b.f20820x = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                        }
                                    }
                                } catch (Exception unused) {
                                }
                                try {
                                    String queryParameter3 = parse.getQueryParameter("rotation");
                                    if (!TextUtils.isEmpty(queryParameter3)) {
                                        this.f21645b.f20821y = Utilities.z(queryParameter3).intValue();
                                    }
                                } catch (Exception unused2) {
                                }
                                String queryParameter4 = parse.getQueryParameter("intensity");
                                if (!TextUtils.isEmpty(queryParameter4)) {
                                    this.f21645b.D = Utilities.z(queryParameter4).intValue();
                                }
                                org.telegram.ui.ActionBar.s6 s6Var3 = this.f21645b;
                                if (s6Var3.D == 0) {
                                    s6Var3.D = 50;
                                }
                            }
                            c10 = 65535;
                        } else if (str.startsWith("WPS")) {
                            this.f21645b.P = i15 + i11;
                            z10 = true;
                            break;
                        } else {
                            int indexOf = str.indexOf(61);
                            c10 = 65535;
                            if (indexOf != -1 && ((h = org.telegram.ui.ActionBar.d5.h(str.substring(0, indexOf))) == org.telegram.ui.ActionBar.t6.f21191ra || h == org.telegram.ui.ActionBar.t6.f21140ob || h == org.telegram.ui.ActionBar.t6.Be || h == org.telegram.ui.ActionBar.t6.Ce || h == org.telegram.ui.ActionBar.t6.De || h == org.telegram.ui.ActionBar.t6.Ee)) {
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
                                if (h == org.telegram.ui.ActionBar.t6.f21191ra) {
                                    this.f21645b.Q = intValue;
                                } else if (h == org.telegram.ui.ActionBar.t6.f21140ob) {
                                    this.f21645b.R = intValue;
                                } else if (h == org.telegram.ui.ActionBar.t6.Be) {
                                    this.f21645b.L = intValue;
                                } else if (h == org.telegram.ui.ActionBar.t6.Ce) {
                                    this.f21645b.M = intValue;
                                } else if (h == org.telegram.ui.ActionBar.t6.De) {
                                    this.f21645b.N = intValue;
                                } else if (h == org.telegram.ui.ActionBar.t6.Ee) {
                                    this.f21645b.O = intValue;
                                }
                            }
                        }
                        i13 += i15;
                        i11 += i15;
                    } else {
                        c10 = c11;
                    }
                    i12++;
                    c11 = c10;
                }
                if (z10 || i10 == i11) {
                    break;
                }
                fileInputStream.getChannel().position(i11);
                i10 = i11;
            }
            fileInputStream.close();
        } catch (Throwable th2) {
            org.telegram.messenger.f8.g(th2, true);
        }
        org.telegram.ui.ActionBar.s6 s6Var4 = this.f21645b;
        if (s6Var4.f20806c != null && !s6Var4.f20810f && !new File(this.f21645b.f20806c).exists()) {
            if (hashMap.containsKey(this.f21645b)) {
                return false;
            }
            org.telegram.ui.ActionBar.s6 s6Var5 = this.f21645b;
            hashMap.put(s6Var5, s6Var5.e);
            TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
            TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
            org.telegram.ui.ActionBar.s6 s6Var6 = this.f21645b;
            tL_inputWallPaperSlug.slug = s6Var6.e;
            getwallpaper.wallpaper = tL_inputWallPaperSlug;
            ConnectionsManager.getInstance(s6Var6.E).sendRequest(getwallpaper, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    int i17 = ThemesHorizontalListCell$InnerThemeView.f21642b0;
                    org.telegram.messenger.i0.g3(new ea(0, ThemesHorizontalListCell$InnerThemeView.this, tLObject));
                }
            });
            return false;
        }
        this.f21645b.T = true;
        return true;
    }

    public final void d(boolean z10) {
        int i10;
        int i11;
        int i12;
        this.G = this.f21652x;
        this.H = this.f21653y;
        this.I = this.D;
        this.J = this.E;
        int i13 = 0;
        org.telegram.ui.ActionBar.r6 k10 = this.f21645b.k(false);
        if (k10 != null) {
            i13 = k10.f20733c;
            i11 = k10.e;
            if (i11 == 0) {
                i11 = i13;
            }
            i10 = (int) k10.f20737j;
            if (i10 == 0) {
                i10 = i13;
            }
        } else {
            i10 = 0;
            i11 = 0;
        }
        org.telegram.ui.ActionBar.s6 s6Var = this.f21645b;
        if (s6Var.S && s6Var.Y == org.telegram.ui.ActionBar.t6.f21109n) {
            i12 = -1;
        } else {
            i12 = s6Var.Q;
        }
        this.f21652x = org.telegram.ui.ActionBar.t6.C(s6Var, i13, i12);
        org.telegram.ui.ActionBar.s6 s6Var2 = this.f21645b;
        this.f21653y = org.telegram.ui.ActionBar.t6.C(s6Var2, i11, s6Var2.p());
        org.telegram.ui.ActionBar.s6 s6Var3 = this.f21645b;
        this.D = org.telegram.ui.ActionBar.t6.C(s6Var3, i10, s6Var3.o());
        this.E = this.f21653y;
        this.F = this.f21645b.Y;
        ObjectAnimator objectAnimator = this.L;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (z10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "accentState", 0.0f, 1.0f);
            this.L = ofFloat;
            ofFloat.setDuration(200L);
            this.L.start();
            return;
        }
        setAccentState(1.0f);
    }

    public float getAccentState() {
        return this.M;
    }

    @Override
    public final void onAttachedToWindow() {
        org.telegram.ui.ActionBar.s6 D0;
        boolean z10;
        TLRPC.TL_theme tL_theme;
        super.onAttachedToWindow();
        ga gaVar = this.f21644a0;
        if (gaVar.f21945m3 == 1) {
            D0 = org.telegram.ui.ActionBar.t6.J;
        } else {
            D0 = org.telegram.ui.ActionBar.t6.D0();
        }
        if (this.f21645b == D0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f21643a.a(z10, false);
        org.telegram.ui.ActionBar.s6 s6Var = this.f21645b;
        if (s6Var != null && (tL_theme = s6Var.F) != null && !s6Var.U) {
            if (!gaVar.f21939g3.containsKey(org.telegram.messenger.b8.r(null, tL_theme.document)) && !gaVar.f21940h3.containsKey(this.f21645b)) {
                this.f21645b.U = true;
                this.f21651w = 0.0f;
                c();
                a();
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        float f7;
        int i11;
        float f10;
        float f11;
        if (this.F != this.f21645b.Y) {
            d(true);
        }
        if (this.f21650s) {
            i10 = org.telegram.messenger.i0.L(22.0f);
        } else {
            i10 = 0;
        }
        int L = org.telegram.messenger.i0.L(11.0f);
        float f12 = i10;
        float f13 = L;
        float L2 = org.telegram.messenger.i0.L(97.0f) + L;
        RectF rectF = this.f21646c;
        rectF.set(f12, f13, org.telegram.messenger.i0.L(76.0f) + i10, L2);
        String n10 = this.f21645b.n();
        if (n10.toLowerCase().endsWith(".attheme")) {
            n10 = n10.substring(0, n10.lastIndexOf(46));
        }
        int measuredWidth = getMeasuredWidth();
        if (this.f21650s) {
            f7 = 10.0f;
        } else {
            f7 = 15.0f;
        }
        int L3 = measuredWidth - org.telegram.messenger.i0.L(f7);
        if (this.f21649r) {
            i11 = org.telegram.messenger.i0.L(7.0f);
        } else {
            i11 = 0;
        }
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint = this.f21647f;
        String charSequence = TextUtils.ellipsize(n10, textPaint, L3 - i11, truncateAt).toString();
        textPaint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false));
        canvas.drawText(charSequence, ((org.telegram.messenger.i0.L(76.0f) - ((int) Math.ceil(textPaint.measureText(charSequence)))) / 2) + i10, org.telegram.messenger.i0.L(131.0f), textPaint);
        org.telegram.ui.ActionBar.s6 s6Var = this.f21645b;
        TLRPC.TL_theme tL_theme = s6Var.F;
        Paint paint = this.d;
        RadioButton radioButton = this.f21643a;
        if (tL_theme != null && (tL_theme.document == null || !s6Var.U)) {
            f10 = 6.0f;
            f11 = 1.0f;
        } else {
            paint.setColor(b(this.I, this.D));
            boolean z10 = this.K;
            Drawable drawable = this.f21648n;
            Drawable drawable2 = this.h;
            if (z10) {
                f10 = 6.0f;
                f11 = 1.0f;
                int b10 = b(this.G, this.f21652x);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable2.setColorFilter(new PorterDuffColorFilter(b10, mode));
                drawable.setColorFilter(new PorterDuffColorFilter(b(this.H, this.f21653y), mode));
                this.K = false;
            } else {
                f10 = 6.0f;
                f11 = 1.0f;
            }
            Drawable drawable3 = this.O;
            if (drawable3 != null) {
                if (this.Q != null) {
                    BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable3;
                    float width = bitmapDrawable.getBitmap().getWidth();
                    float height = bitmapDrawable.getBitmap().getHeight();
                    float width2 = width / rectF.width();
                    float height2 = height / rectF.height();
                    Matrix matrix = this.S;
                    matrix.reset();
                    float min = f11 / Math.min(width2, height2);
                    float f14 = width / height2;
                    if (f14 > rectF.width()) {
                        matrix.setTranslate(f12 - ((f14 - rectF.width()) / 2.0f), f13);
                    } else {
                        matrix.setTranslate(f12, f13 - (((height / width2) - rectF.height()) / 2.0f));
                    }
                    matrix.preScale(min, min);
                    this.Q.setLocalMatrix(matrix);
                    canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(f10), org.telegram.messenger.i0.L(f10), this.P);
                } else {
                    drawable3.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                    this.O.draw(canvas);
                }
            } else {
                canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(f10), org.telegram.messenger.i0.L(f10), paint);
            }
            radioButton.b(1728053247, -1);
            org.telegram.ui.ActionBar.s6 s6Var2 = this.f21645b;
            if (s6Var2.X != 0) {
                if ("Day".equals(s6Var2.f20802a) || "Arctic Blue".equals(this.f21645b.f20802a)) {
                    radioButton.b(-5000269, b(this.J, this.E));
                    org.telegram.ui.ActionBar.t6.X1.setColor(733001146);
                    canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(f10), org.telegram.messenger.i0.L(f10), org.telegram.ui.ActionBar.t6.X1);
                }
            } else if (this.R) {
                radioButton.b(-5000269, s6Var2.p());
                org.telegram.ui.ActionBar.t6.X1.setColor(733001146);
                canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(f10), org.telegram.messenger.i0.L(f10), org.telegram.ui.ActionBar.t6.X1);
            }
            drawable2.setBounds(org.telegram.messenger.i0.L(f10) + i10, org.telegram.messenger.i0.L(22.0f), org.telegram.messenger.i0.L(49.0f) + i10, org.telegram.messenger.i0.L(36.0f));
            drawable2.draw(canvas);
            drawable.setBounds(org.telegram.messenger.i0.L(27.0f) + i10, org.telegram.messenger.i0.L(41.0f), org.telegram.messenger.i0.L(70.0f) + i10, org.telegram.messenger.i0.L(55.0f));
            drawable.draw(canvas);
            if (this.e != null && this.f21644a0.f21945m3 == 0) {
                int L4 = ((int) rectF.right) - org.telegram.messenger.i0.L(16.0f);
                int L5 = org.telegram.messenger.i0.L(f10) + ((int) rectF.top);
                Drawable drawable4 = this.e;
                drawable4.setBounds(L4, L5, drawable4.getIntrinsicWidth() + L4, this.e.getIntrinsicHeight() + L5);
                this.e.draw(canvas);
            }
        }
        org.telegram.ui.ActionBar.s6 s6Var3 = this.f21645b;
        TLRPC.TL_theme tL_theme2 = s6Var3.F;
        if (tL_theme2 != null && tL_theme2.document == null) {
            radioButton.setAlpha(0.0f);
            org.telegram.ui.ActionBar.t6.X1.setColor(733001146);
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(f10), org.telegram.messenger.i0.L(f10), org.telegram.ui.ActionBar.t6.X1);
            if (this.T != null) {
                int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.E6, false);
                if (this.U != x02) {
                    Drawable drawable5 = this.T;
                    this.U = x02;
                    org.telegram.ui.ActionBar.t6.C1(x02, drawable5);
                }
                int centerX = (int) (rectF.centerX() - (this.T.getIntrinsicWidth() / 2));
                int centerY = (int) (rectF.centerY() - (this.T.getIntrinsicHeight() / 2));
                Drawable drawable6 = this.T;
                drawable6.setBounds(centerX, centerY, drawable6.getIntrinsicWidth() + centerX, this.T.getIntrinsicHeight() + centerY);
                this.T.draw(canvas);
            }
        } else if ((tL_theme2 != null && !s6Var3.U) || this.f21651w > 0.0f) {
            radioButton.setAlpha(f11 - this.f21651w);
            paint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20873a7, false));
            paint.setAlpha((int) (this.f21651w * 255.0f));
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(f10), org.telegram.messenger.i0.L(f10), paint);
            if (this.T != null) {
                int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.E6, false);
                if (this.U != x03) {
                    Drawable drawable7 = this.T;
                    this.U = x03;
                    org.telegram.ui.ActionBar.t6.C1(x03, drawable7);
                }
                int centerX2 = (int) (rectF.centerX() - (this.T.getIntrinsicWidth() / 2));
                int centerY2 = (int) (rectF.centerY() - (this.T.getIntrinsicHeight() / 2));
                this.T.setAlpha((int) (this.f21651w * 255.0f));
                Drawable drawable8 = this.T;
                drawable8.setBounds(centerX2, centerY2, drawable8.getIntrinsicWidth() + centerX2, this.T.getIntrinsicHeight() + centerY2);
                this.T.draw(canvas);
            }
            if (this.f21645b.U) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long min2 = Math.min(17L, elapsedRealtime - this.V);
                this.V = elapsedRealtime;
                float f15 = this.f21651w - (((float) min2) / 180.0f);
                this.f21651w = f15;
                if (f15 < 0.0f) {
                    this.f21651w = 0.0f;
                }
                invalidate();
            }
        } else if (radioButton.getAlpha() != f11) {
            radioButton.setAlpha(f11);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String n10 = this.f21645b.n();
        if (n10.toLowerCase().endsWith(".attheme")) {
            n10 = n10.substring(0, n10.lastIndexOf(46));
        }
        accessibilityNodeInfo.setText(n10);
        accessibilityNodeInfo.setClassName(Button.class.getName());
        accessibilityNodeInfo.setChecked(this.f21643a.f24162f);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, dd.L0(2131754839, null)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13 = 22;
        if (this.f21649r) {
            i12 = 22;
        } else {
            i12 = 15;
        }
        int i14 = i12 + 76;
        if (!this.f21650s) {
            i13 = 0;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(i14 + i13), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(148.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.s6 s6Var;
        if (this.e != null && (s6Var = this.f21645b) != null && (s6Var.F == null || s6Var.U)) {
            ga gaVar = this.f21644a0;
            if (gaVar.f21945m3 == 0) {
                int action = motionEvent.getAction();
                if (action == 0 || action == 1) {
                    float x10 = motionEvent.getX();
                    float y3 = motionEvent.getY();
                    RectF rectF = this.f21646c;
                    if (x10 > rectF.centerX() && y3 < rectF.centerY() - org.telegram.messenger.i0.L(10.0f)) {
                        if (action == 0) {
                            this.W = true;
                        } else {
                            try {
                                performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                            gaVar.C1(this.f21645b);
                        }
                    }
                    if (action == 1) {
                        this.W = false;
                    }
                }
                return this.W;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAccentState(float f7) {
        this.M = f7;
        this.K = true;
        invalidate();
    }
}
