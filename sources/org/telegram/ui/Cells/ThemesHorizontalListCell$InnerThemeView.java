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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.fc0;
public class ThemesHorizontalListCell$InnerThemeView extends FrameLayout {
    public static final int V = 0;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public ObjectAnimator I;
    public float J;
    public final ArgbEvaluator K;
    public Drawable L;
    public final Paint M;
    public BitmapShader N;
    public boolean O;
    public final Matrix P;
    public Drawable Q;
    public int R;
    public long S;
    public boolean T;
    public final la U;
    public final RadioButton f22518a;
    public org.telegram.ui.ActionBar.j6 f22519b;
    public final RectF f22520c;
    public final Paint d;
    public Drawable f22521e;
    public final TextPaint f22522f;
    public final Drawable h;
    public final Drawable f22523n;
    public boolean f22524r;
    public boolean f22525s;
    public float v;
    public int f22526w;
    public int f22527x;
    public int f22528y;

    public ThemesHorizontalListCell$InnerThemeView(la laVar, Context context) {
        super(context);
        this.U = laVar;
        this.f22520c = new RectF();
        this.d = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f22522f = textPaint;
        this.K = new ArgbEvaluator();
        this.M = new Paint(3);
        this.P = new Matrix();
        setWillNotDraw(false);
        this.h = context.getResources().getDrawable(R.drawable.minibubble_in).mutate();
        this.f22523n = context.getResources().getDrawable(R.drawable.minibubble_out).mutate();
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        RadioButton radioButton = new RadioButton(context);
        this.f22518a = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        addView(radioButton, k7.c6.d(22, 22.0f, 51, 27.0f, 75.0f, 0.0f, 0.0f));
    }

    public final void a() {
        int i10;
        org.telegram.ui.ActionBar.j6 j6Var = this.f22519b;
        if (j6Var.P && j6Var.V == org.telegram.ui.ActionBar.k6.f21832n) {
            i10 = -1;
        } else {
            i10 = j6Var.N;
        }
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.h.setColorFilter(new PorterDuffColorFilter(i10, mode));
        this.f22523n.setColorFilter(new PorterDuffColorFilter(this.f22519b.p(), mode));
        double[] dArr = null;
        if (this.f22519b.f21505b == null) {
            d(false);
            this.f22521e = null;
        } else {
            this.f22521e = getResources().getDrawable(R.drawable.preview_dots).mutate();
            int o10 = this.f22519b.o();
            this.f22528y = o10;
            this.F = o10;
        }
        this.N = null;
        this.L = null;
        org.telegram.ui.ActionBar.j6 j6Var2 = this.f22519b;
        int i11 = j6Var2.J;
        if (i11 != 0 && j6Var2.K != 0) {
            int o11 = this.f22519b.o();
            org.telegram.ui.ActionBar.j6 j6Var3 = this.f22519b;
            fc0 fc0Var = new fc0(true, o11, j6Var3.J, j6Var3.K, j6Var3.L);
            fc0Var.w(AndroidUtilities.dp(6.0f));
            this.L = fc0Var;
            dArr = AndroidUtilities.rgbToHsv(Color.red(this.f22519b.o()), Color.green(this.f22519b.o()), Color.blue(this.f22519b.o()));
        } else if (i11 != 0) {
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{this.f22519b.o(), this.f22519b.J});
            gradientDrawable.setCornerRadius(AndroidUtilities.dp(6.0f));
            this.L = gradientDrawable;
            dArr = AndroidUtilities.rgbToHsv(Color.red(this.f22519b.o()), Color.green(this.f22519b.o()), Color.blue(this.f22519b.o()));
        } else if (j6Var2.M <= 0 && j6Var2.f21507c == null) {
            if (j6Var2.o() != 0) {
                dArr = AndroidUtilities.rgbToHsv(Color.red(this.f22519b.o()), Color.green(this.f22519b.o()), Color.blue(this.f22519b.o()));
            }
        } else {
            org.telegram.ui.ActionBar.j6 j6Var4 = this.f22519b;
            Bitmap scaledBitmap = AndroidUtilities.getScaledBitmap(AndroidUtilities.dp(76.0f), AndroidUtilities.dp(97.0f), j6Var4.f21507c, j6Var4.f21505b, j6Var4.M);
            if (scaledBitmap != null) {
                this.L = new BitmapDrawable(scaledBitmap);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(scaledBitmap, tileMode, tileMode);
                this.N = bitmapShader;
                this.M.setShader(bitmapShader);
                int[] calcDrawableColor = AndroidUtilities.calcDrawableColor(this.L);
                dArr = AndroidUtilities.rgbToHsv(Color.red(calcDrawableColor[0]), Color.green(calcDrawableColor[0]), Color.blue(calcDrawableColor[0]));
            }
        }
        if (dArr != null && dArr[1] <= 0.10000000149011612d && dArr[2] >= 0.9599999785423279d) {
            this.O = true;
        } else {
            this.O = false;
        }
        if (this.f22519b.o() == 0 && this.f22519b.Q && this.L == null) {
            fc0 Q = org.telegram.ui.ActionBar.k6.Q(100, 200);
            this.L = Q;
            Q.w(AndroidUtilities.dp(6.0f));
        }
        invalidate();
    }

    public final int b(int i10, int i11) {
        float f10 = this.J;
        if (f10 == 1.0f) {
            return i11;
        }
        return ((Integer) this.K.evaluate(f10, Integer.valueOf(i10), Integer.valueOf(i11))).intValue();
    }

    public final boolean c() {
        int s6;
        int intValue;
        String[] split;
        HashMap hashMap = this.U.X2;
        org.telegram.ui.ActionBar.j6 j6Var = this.f22519b;
        if (j6Var == null || j6Var.f21505b == null) {
            return false;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(this.f22519b.f21505b));
            int i10 = 0;
            boolean z4 = false;
            while (true) {
                int read = fileInputStream.read(la.f23135f3);
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
                    byte[] bArr = la.f23135f3;
                    if (bArr[i12] == 10) {
                        int i14 = i12 - i13;
                        int i15 = i14 + 1;
                        String str = new String(bArr, i13, i14, "UTF-8");
                        if (str.startsWith("WLS=")) {
                            String substring = str.substring(4);
                            Uri parse = Uri.parse(substring);
                            this.f22519b.f21510e = parse.getQueryParameter("slug");
                            org.telegram.ui.ActionBar.j6 j6Var2 = this.f22519b;
                            File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                            j6Var2.f21507c = new File(filesDirFixed, Utilities.MD5(substring) + ".wp").getAbsolutePath();
                            String queryParameter = parse.getQueryParameter("mode");
                            if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                                int i16 = 0;
                                while (true) {
                                    if (i16 >= split.length) {
                                        break;
                                    } else if ("blur".equals(split[i16])) {
                                        this.f22519b.h = true;
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
                                        this.f22519b.f21516r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                        if (queryParameter2.length() >= 13 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(6))) {
                                            this.f22519b.f21517s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                        }
                                        if (queryParameter2.length() >= 20 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(13))) {
                                            this.f22519b.v = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                        }
                                        if (queryParameter2.length() == 27 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(20))) {
                                            this.f22519b.f21518w = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                        }
                                    }
                                } catch (Exception unused) {
                                }
                                try {
                                    String queryParameter3 = parse.getQueryParameter("rotation");
                                    if (!TextUtils.isEmpty(queryParameter3)) {
                                        this.f22519b.f21519x = Utilities.parseInt((CharSequence) queryParameter3).intValue();
                                    }
                                } catch (Exception unused2) {
                                }
                                String queryParameter4 = parse.getQueryParameter("intensity");
                                if (!TextUtils.isEmpty(queryParameter4)) {
                                    this.f22519b.f21520y = Utilities.parseInt((CharSequence) queryParameter4).intValue();
                                }
                                org.telegram.ui.ActionBar.j6 j6Var3 = this.f22519b;
                                if (j6Var3.f21520y == 0) {
                                    j6Var3.f21520y = 50;
                                }
                            }
                        } else if (str.startsWith("WPS")) {
                            this.f22519b.M = i15 + i11;
                            z4 = true;
                            break;
                        } else {
                            int indexOf = str.indexOf(61);
                            if (indexOf != -1 && ((s6 = org.telegram.ui.ActionBar.i5.s(str.substring(0, indexOf))) == org.telegram.ui.ActionBar.k6.f21916ra || s6 == org.telegram.ui.ActionBar.k6.Aa || s6 == org.telegram.ui.ActionBar.k6.Nd || s6 == org.telegram.ui.ActionBar.k6.Od || s6 == org.telegram.ui.ActionBar.k6.Pd || s6 == org.telegram.ui.ActionBar.k6.Qd)) {
                                String substring2 = str.substring(indexOf + 1);
                                if (substring2.length() > 0 && substring2.charAt(0) == '#') {
                                    try {
                                        intValue = Color.parseColor(substring2);
                                    } catch (Exception unused3) {
                                        intValue = Utilities.parseInt((CharSequence) substring2).intValue();
                                    }
                                } else {
                                    intValue = Utilities.parseInt((CharSequence) substring2).intValue();
                                }
                                if (s6 == org.telegram.ui.ActionBar.k6.f21916ra) {
                                    this.f22519b.N = intValue;
                                } else if (s6 == org.telegram.ui.ActionBar.k6.Aa) {
                                    this.f22519b.O = intValue;
                                } else if (s6 == org.telegram.ui.ActionBar.k6.Nd) {
                                    this.f22519b.I = intValue;
                                } else if (s6 == org.telegram.ui.ActionBar.k6.Od) {
                                    this.f22519b.J = intValue;
                                } else if (s6 == org.telegram.ui.ActionBar.k6.Pd) {
                                    this.f22519b.K = intValue;
                                } else if (s6 == org.telegram.ui.ActionBar.k6.Qd) {
                                    this.f22519b.L = intValue;
                                }
                            }
                        }
                        i13 += i15;
                        i11 += i15;
                    }
                    i12++;
                }
                if (z4 || i10 == i11) {
                    break;
                }
                fileInputStream.getChannel().position(i11);
                i10 = i11;
            }
            fileInputStream.close();
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
        org.telegram.ui.ActionBar.j6 j6Var4 = this.f22519b;
        if (j6Var4.f21507c != null && !j6Var4.f21512f && !new File(this.f22519b.f21507c).exists()) {
            if (hashMap.containsKey(this.f22519b)) {
                return false;
            }
            org.telegram.ui.ActionBar.j6 j6Var5 = this.f22519b;
            hashMap.put(j6Var5, j6Var5.f21510e);
            TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
            TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
            org.telegram.ui.ActionBar.j6 j6Var6 = this.f22519b;
            tL_inputWallPaperSlug.slug = j6Var6.f21510e;
            getwallpaper.wallpaper = tL_inputWallPaperSlug;
            ConnectionsManager.getInstance(j6Var6.B).sendRequest(getwallpaper, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    int i17 = ThemesHorizontalListCell$InnerThemeView.V;
                    AndroidUtilities.runOnUIThread(new ja(0, ThemesHorizontalListCell$InnerThemeView.this, tLObject));
                }
            });
            return false;
        }
        this.f22519b.Q = true;
        return true;
    }

    public final void d(boolean z4) {
        int i10;
        int i11;
        int i12;
        this.D = this.f22526w;
        this.E = this.f22527x;
        this.F = this.f22528y;
        this.G = this.B;
        int i13 = 0;
        org.telegram.ui.ActionBar.i6 k10 = this.f22519b.k(false);
        if (k10 != null) {
            i13 = k10.f21469c;
            i11 = k10.f21470e;
            if (i11 == 0) {
                i11 = i13;
            }
            i10 = (int) k10.f21474j;
            if (i10 == 0) {
                i10 = i13;
            }
        } else {
            i10 = 0;
            i11 = 0;
        }
        org.telegram.ui.ActionBar.j6 j6Var = this.f22519b;
        if (j6Var.P && j6Var.V == org.telegram.ui.ActionBar.k6.f21832n) {
            i12 = -1;
        } else {
            i12 = j6Var.N;
        }
        this.f22526w = org.telegram.ui.ActionBar.k6.B(j6Var, i13, i12);
        org.telegram.ui.ActionBar.j6 j6Var2 = this.f22519b;
        this.f22527x = org.telegram.ui.ActionBar.k6.B(j6Var2, i11, j6Var2.p());
        org.telegram.ui.ActionBar.j6 j6Var3 = this.f22519b;
        this.f22528y = org.telegram.ui.ActionBar.k6.B(j6Var3, i10, j6Var3.o());
        this.B = this.f22527x;
        this.C = this.f22519b.V;
        ObjectAnimator objectAnimator = this.I;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (z4) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "accentState", 0.0f, 1.0f);
            this.I = ofFloat;
            ofFloat.setDuration(200L);
            this.I.start();
            return;
        }
        setAccentState(1.0f);
    }

    public float getAccentState() {
        return this.J;
    }

    @Override
    public final void onAttachedToWindow() {
        org.telegram.ui.ActionBar.j6 A0;
        boolean z4;
        TLRPC.TL_theme tL_theme;
        super.onAttachedToWindow();
        la laVar = this.U;
        if (laVar.c3 == 1) {
            A0 = org.telegram.ui.ActionBar.k6.J;
        } else {
            A0 = org.telegram.ui.ActionBar.k6.A0();
        }
        if (this.f22519b == A0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f22518a.a(z4, false);
        org.telegram.ui.ActionBar.j6 j6Var = this.f22519b;
        if (j6Var != null && (tL_theme = j6Var.C) != null && !j6Var.R) {
            if (!laVar.W2.containsKey(FileLoader.getAttachFileName(tL_theme.document)) && !laVar.X2.containsKey(this.f22519b)) {
                this.f22519b.R = true;
                this.v = 0.0f;
                c();
                a();
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        float f10;
        int i11;
        float f11;
        float f12;
        if (this.C != this.f22519b.V) {
            d(true);
        }
        if (this.f22525s) {
            i10 = AndroidUtilities.dp(22.0f);
        } else {
            i10 = 0;
        }
        int dp = AndroidUtilities.dp(11.0f);
        float f13 = i10;
        float f14 = dp;
        float dp2 = AndroidUtilities.dp(97.0f) + dp;
        RectF rectF = this.f22520c;
        rectF.set(f13, f14, AndroidUtilities.dp(76.0f) + i10, dp2);
        String n10 = this.f22519b.n();
        if (n10.toLowerCase().endsWith(".attheme")) {
            n10 = n10.substring(0, n10.lastIndexOf(46));
        }
        int measuredWidth = getMeasuredWidth();
        if (this.f22525s) {
            f10 = 10.0f;
        } else {
            f10 = 15.0f;
        }
        int dp3 = measuredWidth - AndroidUtilities.dp(f10);
        if (this.f22524r) {
            i11 = AndroidUtilities.dp(7.0f);
        } else {
            i11 = 0;
        }
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint = this.f22522f;
        String charSequence = TextUtils.ellipsize(n10, textPaint, dp3 - i11, truncateAt).toString();
        textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.G6, false));
        canvas.drawText(charSequence, ((AndroidUtilities.dp(76.0f) - ((int) Math.ceil(textPaint.measureText(charSequence)))) / 2) + i10, AndroidUtilities.dp(131.0f), textPaint);
        org.telegram.ui.ActionBar.j6 j6Var = this.f22519b;
        TLRPC.TL_theme tL_theme = j6Var.C;
        Paint paint = this.d;
        RadioButton radioButton = this.f22518a;
        if (tL_theme != null && (tL_theme.document == null || !j6Var.R)) {
            f11 = 6.0f;
            f12 = 1.0f;
        } else {
            paint.setColor(b(this.F, this.f22528y));
            boolean z4 = this.H;
            Drawable drawable = this.f22523n;
            Drawable drawable2 = this.h;
            if (z4) {
                f11 = 6.0f;
                f12 = 1.0f;
                int b10 = b(this.D, this.f22526w);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable2.setColorFilter(new PorterDuffColorFilter(b10, mode));
                drawable.setColorFilter(new PorterDuffColorFilter(b(this.E, this.f22527x), mode));
                this.H = false;
            } else {
                f11 = 6.0f;
                f12 = 1.0f;
            }
            Drawable drawable3 = this.L;
            if (drawable3 != null) {
                if (this.N != null) {
                    BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable3;
                    float width = bitmapDrawable.getBitmap().getWidth();
                    float height = bitmapDrawable.getBitmap().getHeight();
                    float width2 = width / rectF.width();
                    float height2 = height / rectF.height();
                    Matrix matrix = this.P;
                    matrix.reset();
                    float min = f12 / Math.min(width2, height2);
                    float f15 = width / height2;
                    if (f15 > rectF.width()) {
                        matrix.setTranslate(f13 - ((f15 - rectF.width()) / 2.0f), f14);
                    } else {
                        matrix.setTranslate(f13, f14 - (((height / width2) - rectF.height()) / 2.0f));
                    }
                    matrix.preScale(min, min);
                    this.N.setLocalMatrix(matrix);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(f11), AndroidUtilities.dp(f11), this.M);
                } else {
                    drawable3.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                    this.L.draw(canvas);
                }
            } else {
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(f11), AndroidUtilities.dp(f11), paint);
            }
            radioButton.b(1728053247, -1);
            org.telegram.ui.ActionBar.j6 j6Var2 = this.f22519b;
            if (j6Var2.U != 0) {
                if ("Day".equals(j6Var2.f21503a) || "Arctic Blue".equals(this.f22519b.f21503a)) {
                    radioButton.b(-5000269, b(this.G, this.B));
                    org.telegram.ui.ActionBar.k6.X1.setColor(733001146);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(f11), AndroidUtilities.dp(f11), org.telegram.ui.ActionBar.k6.X1);
                }
            } else if (this.O) {
                radioButton.b(-5000269, j6Var2.p());
                org.telegram.ui.ActionBar.k6.X1.setColor(733001146);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(f11), AndroidUtilities.dp(f11), org.telegram.ui.ActionBar.k6.X1);
            }
            drawable2.setBounds(AndroidUtilities.dp(f11) + i10, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(49.0f) + i10, AndroidUtilities.dp(36.0f));
            drawable2.draw(canvas);
            drawable.setBounds(AndroidUtilities.dp(27.0f) + i10, AndroidUtilities.dp(41.0f), AndroidUtilities.dp(70.0f) + i10, AndroidUtilities.dp(55.0f));
            drawable.draw(canvas);
            if (this.f22521e != null && this.U.c3 == 0) {
                int dp4 = ((int) rectF.right) - AndroidUtilities.dp(16.0f);
                int dp5 = AndroidUtilities.dp(f11) + ((int) rectF.top);
                Drawable drawable4 = this.f22521e;
                drawable4.setBounds(dp4, dp5, drawable4.getIntrinsicWidth() + dp4, this.f22521e.getIntrinsicHeight() + dp5);
                this.f22521e.draw(canvas);
            }
        }
        org.telegram.ui.ActionBar.j6 j6Var3 = this.f22519b;
        TLRPC.TL_theme tL_theme2 = j6Var3.C;
        if (tL_theme2 != null && tL_theme2.document == null) {
            radioButton.setAlpha(0.0f);
            org.telegram.ui.ActionBar.k6.X1.setColor(733001146);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(f11), AndroidUtilities.dp(f11), org.telegram.ui.ActionBar.k6.X1);
            if (this.Q != null) {
                int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.E6, false);
                if (this.R != w02) {
                    Drawable drawable5 = this.Q;
                    this.R = w02;
                    org.telegram.ui.ActionBar.k6.w1(w02, drawable5);
                }
                int centerX = (int) (rectF.centerX() - (this.Q.getIntrinsicWidth() / 2));
                int centerY = (int) (rectF.centerY() - (this.Q.getIntrinsicHeight() / 2));
                Drawable drawable6 = this.Q;
                drawable6.setBounds(centerX, centerY, drawable6.getIntrinsicWidth() + centerX, this.Q.getIntrinsicHeight() + centerY);
                this.Q.draw(canvas);
            }
        } else if ((tL_theme2 != null && !j6Var3.R) || this.v > 0.0f) {
            radioButton.setAlpha(f12 - this.v);
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21605a7, false));
            paint.setAlpha((int) (this.v * 255.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(f11), AndroidUtilities.dp(f11), paint);
            if (this.Q != null) {
                int w03 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.E6, false);
                if (this.R != w03) {
                    Drawable drawable7 = this.Q;
                    this.R = w03;
                    org.telegram.ui.ActionBar.k6.w1(w03, drawable7);
                }
                int centerX2 = (int) (rectF.centerX() - (this.Q.getIntrinsicWidth() / 2));
                int centerY2 = (int) (rectF.centerY() - (this.Q.getIntrinsicHeight() / 2));
                this.Q.setAlpha((int) (this.v * 255.0f));
                Drawable drawable8 = this.Q;
                drawable8.setBounds(centerX2, centerY2, drawable8.getIntrinsicWidth() + centerX2, this.Q.getIntrinsicHeight() + centerY2);
                this.Q.draw(canvas);
            }
            if (this.f22519b.R) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long min2 = Math.min(17L, elapsedRealtime - this.S);
                this.S = elapsedRealtime;
                float f16 = this.v - (((float) min2) / 180.0f);
                this.v = f16;
                if (f16 < 0.0f) {
                    this.v = 0.0f;
                }
                invalidate();
            }
        } else if (radioButton.getAlpha() != f12) {
            radioButton.setAlpha(1.0f);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String n10 = this.f22519b.n();
        if (n10.toLowerCase().endsWith(".attheme")) {
            n10 = n10.substring(0, n10.lastIndexOf(46));
        }
        accessibilityNodeInfo.setText(n10);
        accessibilityNodeInfo.setClassName(Button.class.getName());
        accessibilityNodeInfo.setChecked(this.f22518a.f25006f);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, LocaleController.getString(R.string.AccDescrMoreOptions)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13 = 22;
        if (this.f22524r) {
            i12 = 22;
        } else {
            i12 = 15;
        }
        int i14 = i12 + 76;
        if (!this.f22525s) {
            i13 = 0;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i14 + i13), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(148.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.j6 j6Var;
        if (this.f22521e != null && (j6Var = this.f22519b) != null && (j6Var.C == null || j6Var.R)) {
            la laVar = this.U;
            if (laVar.c3 == 0) {
                int action = motionEvent.getAction();
                if (action == 0 || action == 1) {
                    float x10 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    RectF rectF = this.f22520c;
                    if (x10 > rectF.centerX() && y10 < rectF.centerY() - AndroidUtilities.dp(10.0f)) {
                        if (action == 0) {
                            this.T = true;
                        } else {
                            try {
                                performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                            laVar.z1(this.f22519b);
                        }
                    }
                    if (action == 1) {
                        this.T = false;
                    }
                }
                return this.T;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAccentState(float f10) {
        this.J = f10;
        this.H = true;
        invalidate();
    }
}
