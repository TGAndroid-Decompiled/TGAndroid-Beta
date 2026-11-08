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
import org.telegram.messenger.id;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.qa0;
public class ThemesHorizontalListCell$InnerThemeView extends FrameLayout {
    public static final int f28851b0 = 0;
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
    public final RadioButton f28852a;
    public final ga f28853a0;
    public org.telegram.ui.ActionBar.j6 f28854b;
    public final RectF f28855c;
    public final Paint d;
    public Drawable f28856e;
    public final TextPaint f28857f;
    public final Drawable h;
    public final Drawable f28858n;
    public boolean f28859r;
    public boolean f28860s;
    public float f28861w;
    public int f28862x;
    public int f28863y;

    public ThemesHorizontalListCell$InnerThemeView(ga gaVar, Context context) {
        super(context);
        this.f28853a0 = gaVar;
        this.f28855c = new RectF();
        this.d = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f28857f = textPaint;
        this.N = new ArgbEvaluator();
        this.P = new Paint(3);
        this.S = new Matrix();
        setWillNotDraw(false);
        this.h = context.getResources().getDrawable(2131231981).mutate();
        this.f28858n = jg.g.h(context, 2131231982);
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        RadioButton radioButton = new RadioButton(context);
        this.f28852a = radioButton;
        radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
        addView(radioButton, c8.ha.d(22, 22.0f, 51, 27.0f, 75.0f, 0.0f, 0.0f));
    }

    public final void a() {
        int i7;
        org.telegram.ui.ActionBar.j6 j6Var = this.f28854b;
        if (j6Var.S && j6Var.Y == org.telegram.ui.ActionBar.k6.f28028n) {
            i7 = -1;
        } else {
            i7 = j6Var.Q;
        }
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.h.setColorFilter(new PorterDuffColorFilter(i7, mode));
        this.f28858n.setColorFilter(new PorterDuffColorFilter(this.f28854b.p(), mode));
        double[] dArr = null;
        if (this.f28854b.f27631b == null) {
            d(false);
            this.f28856e = null;
        } else {
            this.f28856e = getResources().getDrawable(2131232577).mutate();
            int o4 = this.f28854b.o();
            this.D = o4;
            this.I = o4;
        }
        this.Q = null;
        this.O = null;
        org.telegram.ui.ActionBar.j6 j6Var2 = this.f28854b;
        int i10 = j6Var2.M;
        if (i10 != 0 && j6Var2.N != 0) {
            int o10 = this.f28854b.o();
            org.telegram.ui.ActionBar.j6 j6Var3 = this.f28854b;
            qa0 qa0Var = new qa0(true, o10, j6Var3.M, j6Var3.N, j6Var3.O);
            qa0Var.v(org.telegram.messenger.g0.L(6.0f));
            this.O = qa0Var;
            dArr = org.telegram.messenger.g0.e3(Color.red(this.f28854b.o()), Color.green(this.f28854b.o()), Color.blue(this.f28854b.o()));
        } else if (i10 != 0) {
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{this.f28854b.o(), this.f28854b.M});
            gradientDrawable.setCornerRadius(org.telegram.messenger.g0.L(6.0f));
            this.O = gradientDrawable;
            dArr = org.telegram.messenger.g0.e3(Color.red(this.f28854b.o()), Color.green(this.f28854b.o()), Color.blue(this.f28854b.o()));
        } else if (j6Var2.P <= 0 && j6Var2.f27633c == null) {
            if (j6Var2.o() != 0) {
                dArr = org.telegram.messenger.g0.e3(Color.red(this.f28854b.o()), Color.green(this.f28854b.o()), Color.blue(this.f28854b.o()));
            }
        } else {
            org.telegram.ui.ActionBar.j6 j6Var4 = this.f28854b;
            Bitmap e12 = org.telegram.messenger.g0.e1(org.telegram.messenger.g0.L(76.0f), org.telegram.messenger.g0.L(97.0f), j6Var4.f27633c, j6Var4.f27631b, j6Var4.P);
            if (e12 != null) {
                this.O = new BitmapDrawable(e12);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(e12, tileMode, tileMode);
                this.Q = bitmapShader;
                this.P.setShader(bitmapShader);
                int[] q10 = org.telegram.messenger.g0.q(this.O);
                dArr = org.telegram.messenger.g0.e3(Color.red(q10[0]), Color.green(q10[0]), Color.blue(q10[0]));
            }
        }
        if (dArr != null && dArr[1] <= 0.10000000149011612d && dArr[2] >= 0.9599999785423279d) {
            this.R = true;
        } else {
            this.R = false;
        }
        if (this.f28854b.o() == 0 && this.f28854b.T && this.O == null) {
            qa0 S = org.telegram.ui.ActionBar.k6.S(100, 200);
            this.O = S;
            S.v(org.telegram.messenger.g0.L(6.0f));
        }
        invalidate();
    }

    public final int b(int i7, int i10) {
        float f10 = this.M;
        if (f10 == 1.0f) {
            return i10;
        }
        return ((Integer) this.N.evaluate(f10, Integer.valueOf(i7), Integer.valueOf(i10))).intValue();
    }

    public final boolean c() {
        char c10;
        int h;
        int intValue;
        String[] split;
        HashMap hashMap = this.f28853a0.f29219h3;
        org.telegram.ui.ActionBar.j6 j6Var = this.f28854b;
        if (j6Var == null || j6Var.f27631b == null) {
            return false;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(this.f28854b.f27631b));
            int i7 = 0;
            boolean z9 = false;
            while (true) {
                int read = fileInputStream.read(ga.f29215p3);
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
                    byte[] bArr = ga.f29215p3;
                    if (bArr[i11] == 10) {
                        int i13 = i11 - i12;
                        int i14 = i13 + 1;
                        String str = new String(bArr, i12, i13, "UTF-8");
                        if (str.startsWith("WLS=")) {
                            String substring = str.substring(4);
                            Uri parse = Uri.parse(substring);
                            this.f28854b.f27636e = parse.getQueryParameter("slug");
                            org.telegram.ui.ActionBar.j6 j6Var2 = this.f28854b;
                            File h7 = org.telegram.messenger.t0.h();
                            j6Var2.f27633c = new File(h7, Utilities.a(substring) + ".wp").getAbsolutePath();
                            String queryParameter = parse.getQueryParameter("mode");
                            if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                                int i15 = 0;
                                while (true) {
                                    if (i15 >= split.length) {
                                        break;
                                    } else if ("blur".equals(split[i15])) {
                                        this.f28854b.h = true;
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
                                        this.f28854b.f27645r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                        if (queryParameter2.length() >= 13 && org.telegram.messenger.g0.S1(queryParameter2.charAt(6))) {
                                            this.f28854b.f27646s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                        }
                                        if (queryParameter2.length() >= 20 && org.telegram.messenger.g0.S1(queryParameter2.charAt(13))) {
                                            this.f28854b.f27647w = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                        }
                                        if (queryParameter2.length() == 27 && org.telegram.messenger.g0.S1(queryParameter2.charAt(20))) {
                                            this.f28854b.f27648x = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                        }
                                    }
                                } catch (Exception unused) {
                                }
                                try {
                                    String queryParameter3 = parse.getQueryParameter("rotation");
                                    if (!TextUtils.isEmpty(queryParameter3)) {
                                        this.f28854b.f27649y = Utilities.z(queryParameter3).intValue();
                                    }
                                } catch (Exception unused2) {
                                }
                                String queryParameter4 = parse.getQueryParameter("intensity");
                                if (!TextUtils.isEmpty(queryParameter4)) {
                                    this.f28854b.D = Utilities.z(queryParameter4).intValue();
                                }
                                org.telegram.ui.ActionBar.j6 j6Var3 = this.f28854b;
                                if (j6Var3.D == 0) {
                                    j6Var3.D = 50;
                                }
                            }
                            c10 = 65535;
                        } else if (str.startsWith("WPS")) {
                            this.f28854b.P = i14 + i10;
                            z9 = true;
                            break;
                        } else {
                            int indexOf = str.indexOf(61);
                            c10 = 65535;
                            if (indexOf != -1 && ((h = org.telegram.ui.ActionBar.u4.h(str.substring(0, indexOf))) == org.telegram.ui.ActionBar.k6.f28115ra || h == org.telegram.ui.ActionBar.k6.f28057ob || h == org.telegram.ui.ActionBar.k6.Be || h == org.telegram.ui.ActionBar.k6.Ce || h == org.telegram.ui.ActionBar.k6.De || h == org.telegram.ui.ActionBar.k6.Ee)) {
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
                                if (h == org.telegram.ui.ActionBar.k6.f28115ra) {
                                    this.f28854b.Q = intValue;
                                } else if (h == org.telegram.ui.ActionBar.k6.f28057ob) {
                                    this.f28854b.R = intValue;
                                } else if (h == org.telegram.ui.ActionBar.k6.Be) {
                                    this.f28854b.L = intValue;
                                } else if (h == org.telegram.ui.ActionBar.k6.Ce) {
                                    this.f28854b.M = intValue;
                                } else if (h == org.telegram.ui.ActionBar.k6.De) {
                                    this.f28854b.N = intValue;
                                } else if (h == org.telegram.ui.ActionBar.k6.Ee) {
                                    this.f28854b.O = intValue;
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
                if (z9 || i7 == i10) {
                    break;
                }
                fileInputStream.getChannel().position(i10);
                i7 = i10;
            }
            fileInputStream.close();
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
        org.telegram.ui.ActionBar.j6 j6Var4 = this.f28854b;
        if (j6Var4.f27633c != null && !j6Var4.f27638f && !new File(this.f28854b.f27633c).exists()) {
            if (hashMap.containsKey(this.f28854b)) {
                return false;
            }
            org.telegram.ui.ActionBar.j6 j6Var5 = this.f28854b;
            hashMap.put(j6Var5, j6Var5.f27636e);
            TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
            TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
            org.telegram.ui.ActionBar.j6 j6Var6 = this.f28854b;
            tL_inputWallPaperSlug.slug = j6Var6.f27636e;
            getwallpaper.wallpaper = tL_inputWallPaperSlug;
            ConnectionsManager.getInstance(j6Var6.E).sendRequest(getwallpaper, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    int i16 = ThemesHorizontalListCell$InnerThemeView.f28851b0;
                    org.telegram.messenger.g0.h3(new ea(0, ThemesHorizontalListCell$InnerThemeView.this, tLObject));
                }
            });
            return false;
        }
        this.f28854b.T = true;
        return true;
    }

    public final void d(boolean z9) {
        int i7;
        int i10;
        int i11;
        this.G = this.f28862x;
        this.H = this.f28863y;
        this.I = this.D;
        this.J = this.E;
        int i12 = 0;
        org.telegram.ui.ActionBar.h6 k10 = this.f28854b.k(false);
        if (k10 != null) {
            i12 = k10.f27521c;
            i10 = k10.f27522e;
            if (i10 == 0) {
                i10 = i12;
            }
            i7 = (int) k10.f27526j;
            if (i7 == 0) {
                i7 = i12;
            }
        } else {
            i7 = 0;
            i10 = 0;
        }
        org.telegram.ui.ActionBar.j6 j6Var = this.f28854b;
        if (j6Var.S && j6Var.Y == org.telegram.ui.ActionBar.k6.f28028n) {
            i11 = -1;
        } else {
            i11 = j6Var.Q;
        }
        this.f28862x = org.telegram.ui.ActionBar.k6.C(j6Var, i12, i11);
        org.telegram.ui.ActionBar.j6 j6Var2 = this.f28854b;
        this.f28863y = org.telegram.ui.ActionBar.k6.C(j6Var2, i10, j6Var2.p());
        org.telegram.ui.ActionBar.j6 j6Var3 = this.f28854b;
        this.D = org.telegram.ui.ActionBar.k6.C(j6Var3, i7, j6Var3.o());
        this.E = this.f28863y;
        this.F = this.f28854b.Y;
        ObjectAnimator objectAnimator = this.L;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (z9) {
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
        org.telegram.ui.ActionBar.j6 D0;
        boolean z9;
        TLRPC.TL_theme tL_theme;
        super.onAttachedToWindow();
        ga gaVar = this.f28853a0;
        if (gaVar.f29223m3 == 1) {
            D0 = org.telegram.ui.ActionBar.k6.J;
        } else {
            D0 = org.telegram.ui.ActionBar.k6.D0();
        }
        if (this.f28854b == D0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f28852a.a(z9, false);
        org.telegram.ui.ActionBar.j6 j6Var = this.f28854b;
        if (j6Var != null && (tL_theme = j6Var.F) != null && !j6Var.U) {
            if (!gaVar.f29218g3.containsKey(org.telegram.messenger.w7.r(null, tL_theme.document)) && !gaVar.f29219h3.containsKey(this.f28854b)) {
                this.f28854b.U = true;
                this.f28861w = 0.0f;
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
        if (this.F != this.f28854b.Y) {
            d(true);
        }
        if (this.f28860s) {
            i7 = org.telegram.messenger.g0.L(22.0f);
        } else {
            i7 = 0;
        }
        int L = org.telegram.messenger.g0.L(11.0f);
        float f13 = i7;
        float f14 = L;
        float L2 = org.telegram.messenger.g0.L(97.0f) + L;
        RectF rectF = this.f28855c;
        rectF.set(f13, f14, org.telegram.messenger.g0.L(76.0f) + i7, L2);
        String n10 = this.f28854b.n();
        if (n10.toLowerCase().endsWith(".attheme")) {
            n10 = n10.substring(0, n10.lastIndexOf(46));
        }
        int measuredWidth = getMeasuredWidth();
        if (this.f28860s) {
            f10 = 10.0f;
        } else {
            f10 = 15.0f;
        }
        int L3 = measuredWidth - org.telegram.messenger.g0.L(f10);
        if (this.f28859r) {
            i10 = org.telegram.messenger.g0.L(7.0f);
        } else {
            i10 = 0;
        }
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint = this.f28857f;
        String charSequence = TextUtils.ellipsize(n10, textPaint, L3 - i10, truncateAt).toString();
        textPaint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
        canvas.drawText(charSequence, ((org.telegram.messenger.g0.L(76.0f) - ((int) Math.ceil(textPaint.measureText(charSequence)))) / 2) + i7, org.telegram.messenger.g0.L(131.0f), textPaint);
        org.telegram.ui.ActionBar.j6 j6Var = this.f28854b;
        TLRPC.TL_theme tL_theme = j6Var.F;
        Paint paint = this.d;
        RadioButton radioButton = this.f28852a;
        if (tL_theme != null && (tL_theme.document == null || !j6Var.U)) {
            f11 = 6.0f;
            f12 = 1.0f;
        } else {
            paint.setColor(b(this.I, this.D));
            boolean z9 = this.K;
            Drawable drawable = this.f28858n;
            Drawable drawable2 = this.h;
            if (z9) {
                f11 = 6.0f;
                f12 = 1.0f;
                int b10 = b(this.G, this.f28862x);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable2.setColorFilter(new PorterDuffColorFilter(b10, mode));
                drawable.setColorFilter(new PorterDuffColorFilter(b(this.H, this.f28863y), mode));
                this.K = false;
            } else {
                f11 = 6.0f;
                f12 = 1.0f;
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
                    float min = f12 / Math.min(width2, height2);
                    float f15 = width / height2;
                    if (f15 > rectF.width()) {
                        matrix.setTranslate(f13 - ((f15 - rectF.width()) / 2.0f), f14);
                    } else {
                        matrix.setTranslate(f13, f14 - (((height / width2) - rectF.height()) / 2.0f));
                    }
                    matrix.preScale(min, min);
                    this.Q.setLocalMatrix(matrix);
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11), this.P);
                } else {
                    drawable3.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                    this.O.draw(canvas);
                }
            } else {
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11), paint);
            }
            radioButton.b(1728053247, -1);
            org.telegram.ui.ActionBar.j6 j6Var2 = this.f28854b;
            if (j6Var2.X != 0) {
                if ("Day".equals(j6Var2.f27629a) || "Arctic Blue".equals(this.f28854b.f27629a)) {
                    radioButton.b(-5000269, b(this.J, this.E));
                    org.telegram.ui.ActionBar.k6.X1.setColor(733001146);
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11), org.telegram.ui.ActionBar.k6.X1);
                }
            } else if (this.R) {
                radioButton.b(-5000269, j6Var2.p());
                org.telegram.ui.ActionBar.k6.X1.setColor(733001146);
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11), org.telegram.ui.ActionBar.k6.X1);
            }
            drawable2.setBounds(org.telegram.messenger.g0.L(f11) + i7, org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(49.0f) + i7, org.telegram.messenger.g0.L(36.0f));
            drawable2.draw(canvas);
            drawable.setBounds(org.telegram.messenger.g0.L(27.0f) + i7, org.telegram.messenger.g0.L(41.0f), org.telegram.messenger.g0.L(70.0f) + i7, org.telegram.messenger.g0.L(55.0f));
            drawable.draw(canvas);
            if (this.f28856e != null && this.f28853a0.f29223m3 == 0) {
                int L4 = ((int) rectF.right) - org.telegram.messenger.g0.L(16.0f);
                int L5 = org.telegram.messenger.g0.L(f11) + ((int) rectF.top);
                Drawable drawable4 = this.f28856e;
                drawable4.setBounds(L4, L5, drawable4.getIntrinsicWidth() + L4, this.f28856e.getIntrinsicHeight() + L5);
                this.f28856e.draw(canvas);
            }
        }
        org.telegram.ui.ActionBar.j6 j6Var3 = this.f28854b;
        TLRPC.TL_theme tL_theme2 = j6Var3.F;
        if (tL_theme2 != null && tL_theme2.document == null) {
            radioButton.setAlpha(0.0f);
            org.telegram.ui.ActionBar.k6.X1.setColor(733001146);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11), org.telegram.ui.ActionBar.k6.X1);
            if (this.T != null) {
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.E6, false);
                if (this.U != x02) {
                    Drawable drawable5 = this.T;
                    this.U = x02;
                    org.telegram.ui.ActionBar.k6.C1(x02, drawable5);
                }
                int centerX = (int) (rectF.centerX() - (this.T.getIntrinsicWidth() / 2));
                int centerY = (int) (rectF.centerY() - (this.T.getIntrinsicHeight() / 2));
                Drawable drawable6 = this.T;
                drawable6.setBounds(centerX, centerY, drawable6.getIntrinsicWidth() + centerX, this.T.getIntrinsicHeight() + centerY);
                this.T.draw(canvas);
            }
        } else if ((tL_theme2 != null && !j6Var3.U) || this.f28861w > 0.0f) {
            radioButton.setAlpha(f12 - this.f28861w);
            paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27796a7, false));
            paint.setAlpha((int) (this.f28861w * 255.0f));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11), paint);
            if (this.T != null) {
                int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.E6, false);
                if (this.U != x03) {
                    Drawable drawable7 = this.T;
                    this.U = x03;
                    org.telegram.ui.ActionBar.k6.C1(x03, drawable7);
                }
                int centerX2 = (int) (rectF.centerX() - (this.T.getIntrinsicWidth() / 2));
                int centerY2 = (int) (rectF.centerY() - (this.T.getIntrinsicHeight() / 2));
                this.T.setAlpha((int) (this.f28861w * 255.0f));
                Drawable drawable8 = this.T;
                drawable8.setBounds(centerX2, centerY2, drawable8.getIntrinsicWidth() + centerX2, this.T.getIntrinsicHeight() + centerY2);
                this.T.draw(canvas);
            }
            if (this.f28854b.U) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long min2 = Math.min(17L, elapsedRealtime - this.V);
                this.V = elapsedRealtime;
                float f16 = this.f28861w - (((float) min2) / 180.0f);
                this.f28861w = f16;
                if (f16 < 0.0f) {
                    this.f28861w = 0.0f;
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
        String n10 = this.f28854b.n();
        if (n10.toLowerCase().endsWith(".attheme")) {
            n10 = n10.substring(0, n10.lastIndexOf(46));
        }
        accessibilityNodeInfo.setText(n10);
        accessibilityNodeInfo.setClassName(Button.class.getName());
        accessibilityNodeInfo.setChecked(this.f28852a.f31517f);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, id.M0(2131754839, null)));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12 = 22;
        if (this.f28859r) {
            i11 = 22;
        } else {
            i11 = 15;
        }
        int i13 = i11 + 76;
        if (!this.f28860s) {
            i12 = 0;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(i13 + i12), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(148.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.j6 j6Var;
        if (this.f28856e != null && (j6Var = this.f28854b) != null && (j6Var.F == null || j6Var.U)) {
            ga gaVar = this.f28853a0;
            if (gaVar.f29223m3 == 0) {
                int action = motionEvent.getAction();
                if (action == 0 || action == 1) {
                    float x10 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    RectF rectF = this.f28855c;
                    if (x10 > rectF.centerX() && y10 < rectF.centerY() - org.telegram.messenger.g0.L(10.0f)) {
                        if (action == 0) {
                            this.W = true;
                        } else {
                            try {
                                performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                            gaVar.C1(this.f28854b);
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

    public void setAccentState(float f10) {
        this.M = f10;
        this.K = true;
        invalidate();
    }
}
