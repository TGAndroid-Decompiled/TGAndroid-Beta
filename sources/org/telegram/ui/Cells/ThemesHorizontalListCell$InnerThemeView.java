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
import org.telegram.ui.Components.jb0;
public class ThemesHorizontalListCell$InnerThemeView extends FrameLayout {
    public static final int U = 0;
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public boolean G;
    public ObjectAnimator H;
    public float I;
    public final ArgbEvaluator J;
    public Drawable K;
    public final Paint L;
    public BitmapShader M;
    public boolean N;
    public final Matrix O;
    public Drawable P;
    public int Q;
    public long R;
    public boolean S;
    public final ma T;
    public final RadioButton f24028a;
    public org.telegram.ui.ActionBar.e6 f24029b;
    public final RectF f24030c;
    public final Paint d;
    public Drawable f24031e;
    public final TextPaint f24032f;
    public final Drawable h;
    public final Drawable f24033n;
    public boolean f24034r;
    public boolean f24035s;
    public float v;
    public int f24036w;
    public int f24037x;
    public int f24038y;

    public ThemesHorizontalListCell$InnerThemeView(ma maVar, Context context) {
        super(context);
        this.T = maVar;
        this.f24030c = new RectF();
        this.d = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f24032f = textPaint;
        this.J = new ArgbEvaluator();
        this.L = new Paint(3);
        this.O = new Matrix();
        setWillNotDraw(false);
        this.h = context.getResources().getDrawable(R.drawable.minibubble_in).mutate();
        this.f24033n = context.getResources().getDrawable(R.drawable.minibubble_out).mutate();
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        RadioButton radioButton = new RadioButton(context);
        this.f24028a = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        addView(radioButton, g7.e6.d(22, 22.0f, 51, 27.0f, 75.0f, 0.0f, 0.0f));
    }

    public final void a() {
        int i9;
        org.telegram.ui.ActionBar.e6 e6Var = this.f24029b;
        if (e6Var.O && e6Var.U == org.telegram.ui.ActionBar.f6.f23172n) {
            i9 = -1;
        } else {
            i9 = e6Var.M;
        }
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.h.setColorFilter(new PorterDuffColorFilter(i9, mode));
        this.f24033n.setColorFilter(new PorterDuffColorFilter(this.f24029b.p(), mode));
        double[] dArr = null;
        if (this.f24029b.f22908b == null) {
            d(false);
            this.f24031e = null;
        } else {
            this.f24031e = getResources().getDrawable(R.drawable.preview_dots).mutate();
            int o6 = this.f24029b.o();
            this.f24038y = o6;
            this.E = o6;
        }
        this.M = null;
        this.K = null;
        org.telegram.ui.ActionBar.e6 e6Var2 = this.f24029b;
        int i10 = e6Var2.I;
        if (i10 != 0 && e6Var2.J != 0) {
            int o9 = this.f24029b.o();
            org.telegram.ui.ActionBar.e6 e6Var3 = this.f24029b;
            jb0 jb0Var = new jb0(true, o9, e6Var3.I, e6Var3.J, e6Var3.K);
            jb0Var.w(AndroidUtilities.dp(6.0f));
            this.K = jb0Var;
            dArr = AndroidUtilities.rgbToHsv(Color.red(this.f24029b.o()), Color.green(this.f24029b.o()), Color.blue(this.f24029b.o()));
        } else if (i10 != 0) {
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{this.f24029b.o(), this.f24029b.I});
            gradientDrawable.setCornerRadius(AndroidUtilities.dp(6.0f));
            this.K = gradientDrawable;
            dArr = AndroidUtilities.rgbToHsv(Color.red(this.f24029b.o()), Color.green(this.f24029b.o()), Color.blue(this.f24029b.o()));
        } else if (e6Var2.L <= 0 && e6Var2.f22910c == null) {
            if (e6Var2.o() != 0) {
                dArr = AndroidUtilities.rgbToHsv(Color.red(this.f24029b.o()), Color.green(this.f24029b.o()), Color.blue(this.f24029b.o()));
            }
        } else {
            org.telegram.ui.ActionBar.e6 e6Var4 = this.f24029b;
            Bitmap scaledBitmap = AndroidUtilities.getScaledBitmap(AndroidUtilities.dp(76.0f), AndroidUtilities.dp(97.0f), e6Var4.f22910c, e6Var4.f22908b, e6Var4.L);
            if (scaledBitmap != null) {
                this.K = new BitmapDrawable(scaledBitmap);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(scaledBitmap, tileMode, tileMode);
                this.M = bitmapShader;
                this.L.setShader(bitmapShader);
                int[] calcDrawableColor = AndroidUtilities.calcDrawableColor(this.K);
                dArr = AndroidUtilities.rgbToHsv(Color.red(calcDrawableColor[0]), Color.green(calcDrawableColor[0]), Color.blue(calcDrawableColor[0]));
            }
        }
        if (dArr != null && dArr[1] <= 0.10000000149011612d && dArr[2] >= 0.9599999785423279d) {
            this.N = true;
        } else {
            this.N = false;
        }
        if (this.f24029b.o() == 0 && this.f24029b.P && this.K == null) {
            jb0 Q = org.telegram.ui.ActionBar.f6.Q(100, 200);
            this.K = Q;
            Q.w(AndroidUtilities.dp(6.0f));
        }
        invalidate();
    }

    public final int b(int i9, int i10) {
        float f10 = this.I;
        if (f10 == 1.0f) {
            return i10;
        }
        return ((Integer) this.J.evaluate(f10, Integer.valueOf(i9), Integer.valueOf(i10))).intValue();
    }

    public final boolean c() {
        int s10;
        int intValue;
        String[] split;
        HashMap hashMap = this.T.W2;
        org.telegram.ui.ActionBar.e6 e6Var = this.f24029b;
        if (e6Var == null || e6Var.f22908b == null) {
            return false;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(this.f24029b.f22908b));
            int i9 = 0;
            boolean z10 = false;
            while (true) {
                int read = fileInputStream.read(ma.f24719e3);
                if (read == -1) {
                    break;
                }
                int i10 = i9;
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    if (i11 >= read) {
                        break;
                    }
                    byte[] bArr = ma.f24719e3;
                    if (bArr[i11] == 10) {
                        int i13 = i11 - i12;
                        int i14 = i13 + 1;
                        String str = new String(bArr, i12, i13, "UTF-8");
                        if (str.startsWith("WLS=")) {
                            String substring = str.substring(4);
                            Uri parse = Uri.parse(substring);
                            this.f24029b.f22913e = parse.getQueryParameter("slug");
                            org.telegram.ui.ActionBar.e6 e6Var2 = this.f24029b;
                            File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                            e6Var2.f22910c = new File(filesDirFixed, Utilities.MD5(substring) + ".wp").getAbsolutePath();
                            String queryParameter = parse.getQueryParameter("mode");
                            if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                                int i15 = 0;
                                while (true) {
                                    if (i15 >= split.length) {
                                        break;
                                    } else if ("blur".equals(split[i15])) {
                                        this.f24029b.h = true;
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
                                        this.f24029b.f22918r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                        if (queryParameter2.length() >= 13 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(6))) {
                                            this.f24029b.f22919s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                        }
                                        if (queryParameter2.length() >= 20 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(13))) {
                                            this.f24029b.v = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                        }
                                        if (queryParameter2.length() == 27 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(20))) {
                                            this.f24029b.f22920w = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                        }
                                    }
                                } catch (Exception unused) {
                                }
                                try {
                                    String queryParameter3 = parse.getQueryParameter("rotation");
                                    if (!TextUtils.isEmpty(queryParameter3)) {
                                        this.f24029b.f22921x = Utilities.parseInt((CharSequence) queryParameter3).intValue();
                                    }
                                } catch (Exception unused2) {
                                }
                                String queryParameter4 = parse.getQueryParameter("intensity");
                                if (!TextUtils.isEmpty(queryParameter4)) {
                                    this.f24029b.f22922y = Utilities.parseInt((CharSequence) queryParameter4).intValue();
                                }
                                org.telegram.ui.ActionBar.e6 e6Var3 = this.f24029b;
                                if (e6Var3.f22922y == 0) {
                                    e6Var3.f22922y = 50;
                                }
                            }
                        } else if (str.startsWith("WPS")) {
                            this.f24029b.L = i14 + i10;
                            z10 = true;
                            break;
                        } else {
                            int indexOf = str.indexOf(61);
                            if (indexOf != -1 && ((s10 = org.telegram.ui.ActionBar.e5.s(str.substring(0, indexOf))) == org.telegram.ui.ActionBar.f6.f23252ra || s10 == org.telegram.ui.ActionBar.f6.Aa || s10 == org.telegram.ui.ActionBar.f6.Nd || s10 == org.telegram.ui.ActionBar.f6.Od || s10 == org.telegram.ui.ActionBar.f6.Pd || s10 == org.telegram.ui.ActionBar.f6.Qd)) {
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
                                if (s10 == org.telegram.ui.ActionBar.f6.f23252ra) {
                                    this.f24029b.M = intValue;
                                } else if (s10 == org.telegram.ui.ActionBar.f6.Aa) {
                                    this.f24029b.N = intValue;
                                } else if (s10 == org.telegram.ui.ActionBar.f6.Nd) {
                                    this.f24029b.H = intValue;
                                } else if (s10 == org.telegram.ui.ActionBar.f6.Od) {
                                    this.f24029b.I = intValue;
                                } else if (s10 == org.telegram.ui.ActionBar.f6.Pd) {
                                    this.f24029b.J = intValue;
                                } else if (s10 == org.telegram.ui.ActionBar.f6.Qd) {
                                    this.f24029b.K = intValue;
                                }
                            }
                        }
                        i12 += i14;
                        i10 += i14;
                    }
                    i11++;
                }
                if (z10 || i9 == i10) {
                    break;
                }
                fileInputStream.getChannel().position(i10);
                i9 = i10;
            }
            fileInputStream.close();
        } catch (Throwable th) {
            FileLog.e(th);
        }
        org.telegram.ui.ActionBar.e6 e6Var4 = this.f24029b;
        if (e6Var4.f22910c != null && !e6Var4.f22915f && !new File(this.f24029b.f22910c).exists()) {
            if (hashMap.containsKey(this.f24029b)) {
                return false;
            }
            org.telegram.ui.ActionBar.e6 e6Var5 = this.f24029b;
            hashMap.put(e6Var5, e6Var5.f22913e);
            TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
            TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
            org.telegram.ui.ActionBar.e6 e6Var6 = this.f24029b;
            tL_inputWallPaperSlug.slug = e6Var6.f22913e;
            getwallpaper.wallpaper = tL_inputWallPaperSlug;
            ConnectionsManager.getInstance(e6Var6.A).sendRequest(getwallpaper, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    int i16 = ThemesHorizontalListCell$InnerThemeView.U;
                    AndroidUtilities.runOnUIThread(new ka(0, ThemesHorizontalListCell$InnerThemeView.this, tLObject));
                }
            });
            return false;
        }
        this.f24029b.P = true;
        return true;
    }

    public final void d(boolean z10) {
        int i9;
        int i10;
        int i11;
        this.C = this.f24036w;
        this.D = this.f24037x;
        this.E = this.f24038y;
        this.F = this.A;
        int i12 = 0;
        org.telegram.ui.ActionBar.d6 k10 = this.f24029b.k(false);
        if (k10 != null) {
            i12 = k10.f22868c;
            i10 = k10.f22869e;
            if (i10 == 0) {
                i10 = i12;
            }
            i9 = (int) k10.f22873j;
            if (i9 == 0) {
                i9 = i12;
            }
        } else {
            i9 = 0;
            i10 = 0;
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.f24029b;
        if (e6Var.O && e6Var.U == org.telegram.ui.ActionBar.f6.f23172n) {
            i11 = -1;
        } else {
            i11 = e6Var.M;
        }
        this.f24036w = org.telegram.ui.ActionBar.f6.B(e6Var, i12, i11);
        org.telegram.ui.ActionBar.e6 e6Var2 = this.f24029b;
        this.f24037x = org.telegram.ui.ActionBar.f6.B(e6Var2, i10, e6Var2.p());
        org.telegram.ui.ActionBar.e6 e6Var3 = this.f24029b;
        this.f24038y = org.telegram.ui.ActionBar.f6.B(e6Var3, i9, e6Var3.o());
        this.A = this.f24037x;
        this.B = this.f24029b.U;
        ObjectAnimator objectAnimator = this.H;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (z10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "accentState", 0.0f, 1.0f);
            this.H = ofFloat;
            ofFloat.setDuration(200L);
            this.H.start();
            return;
        }
        setAccentState(1.0f);
    }

    public float getAccentState() {
        return this.I;
    }

    @Override
    public final void onAttachedToWindow() {
        org.telegram.ui.ActionBar.e6 A0;
        boolean z10;
        TLRPC.TL_theme tL_theme;
        super.onAttachedToWindow();
        ma maVar = this.T;
        if (maVar.f24720b3 == 1) {
            A0 = org.telegram.ui.ActionBar.f6.J;
        } else {
            A0 = org.telegram.ui.ActionBar.f6.A0();
        }
        if (this.f24029b == A0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f24028a.a(z10, false);
        org.telegram.ui.ActionBar.e6 e6Var = this.f24029b;
        if (e6Var != null && (tL_theme = e6Var.B) != null && !e6Var.Q) {
            if (!maVar.V2.containsKey(FileLoader.getAttachFileName(tL_theme.document)) && !maVar.W2.containsKey(this.f24029b)) {
                this.f24029b.Q = true;
                this.v = 0.0f;
                c();
                a();
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i9;
        float f10;
        int i10;
        float f11;
        float f12;
        if (this.B != this.f24029b.U) {
            d(true);
        }
        if (this.f24035s) {
            i9 = AndroidUtilities.dp(22.0f);
        } else {
            i9 = 0;
        }
        int dp = AndroidUtilities.dp(11.0f);
        float f13 = i9;
        float f14 = dp;
        float dp2 = AndroidUtilities.dp(97.0f) + dp;
        RectF rectF = this.f24030c;
        rectF.set(f13, f14, AndroidUtilities.dp(76.0f) + i9, dp2);
        String n10 = this.f24029b.n();
        if (n10.toLowerCase().endsWith(".attheme")) {
            n10 = n10.substring(0, n10.lastIndexOf(46));
        }
        int measuredWidth = getMeasuredWidth();
        if (this.f24035s) {
            f10 = 10.0f;
        } else {
            f10 = 15.0f;
        }
        int dp3 = measuredWidth - AndroidUtilities.dp(f10);
        if (this.f24034r) {
            i10 = AndroidUtilities.dp(7.0f);
        } else {
            i10 = 0;
        }
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint = this.f24032f;
        String charSequence = TextUtils.ellipsize(n10, textPaint, dp3 - i10, truncateAt).toString();
        textPaint.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
        canvas.drawText(charSequence, ((AndroidUtilities.dp(76.0f) - ((int) Math.ceil(textPaint.measureText(charSequence)))) / 2) + i9, AndroidUtilities.dp(131.0f), textPaint);
        org.telegram.ui.ActionBar.e6 e6Var = this.f24029b;
        TLRPC.TL_theme tL_theme = e6Var.B;
        Paint paint = this.d;
        RadioButton radioButton = this.f24028a;
        if (tL_theme != null && (tL_theme.document == null || !e6Var.Q)) {
            f11 = 6.0f;
            f12 = 1.0f;
        } else {
            paint.setColor(b(this.E, this.f24038y));
            boolean z10 = this.G;
            Drawable drawable = this.f24033n;
            Drawable drawable2 = this.h;
            if (z10) {
                f11 = 6.0f;
                f12 = 1.0f;
                int b10 = b(this.C, this.f24036w);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable2.setColorFilter(new PorterDuffColorFilter(b10, mode));
                drawable.setColorFilter(new PorterDuffColorFilter(b(this.D, this.f24037x), mode));
                this.G = false;
            } else {
                f11 = 6.0f;
                f12 = 1.0f;
            }
            Drawable drawable3 = this.K;
            if (drawable3 != null) {
                if (this.M != null) {
                    BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable3;
                    float width = bitmapDrawable.getBitmap().getWidth();
                    float height = bitmapDrawable.getBitmap().getHeight();
                    float width2 = width / rectF.width();
                    float height2 = height / rectF.height();
                    Matrix matrix = this.O;
                    matrix.reset();
                    float min = f12 / Math.min(width2, height2);
                    float f15 = width / height2;
                    if (f15 > rectF.width()) {
                        matrix.setTranslate(f13 - ((f15 - rectF.width()) / 2.0f), f14);
                    } else {
                        matrix.setTranslate(f13, f14 - (((height / width2) - rectF.height()) / 2.0f));
                    }
                    matrix.preScale(min, min);
                    this.M.setLocalMatrix(matrix);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(f11), AndroidUtilities.dp(f11), this.L);
                } else {
                    drawable3.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                    this.K.draw(canvas);
                }
            } else {
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(f11), AndroidUtilities.dp(f11), paint);
            }
            radioButton.b(1728053247, -1);
            org.telegram.ui.ActionBar.e6 e6Var2 = this.f24029b;
            if (e6Var2.T != 0) {
                if ("Day".equals(e6Var2.f22906a) || "Arctic Blue".equals(this.f24029b.f22906a)) {
                    radioButton.b(-5000269, b(this.F, this.A));
                    org.telegram.ui.ActionBar.f6.X1.setColor(733001146);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(f11), AndroidUtilities.dp(f11), org.telegram.ui.ActionBar.f6.X1);
                }
            } else if (this.N) {
                radioButton.b(-5000269, e6Var2.p());
                org.telegram.ui.ActionBar.f6.X1.setColor(733001146);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(f11), AndroidUtilities.dp(f11), org.telegram.ui.ActionBar.f6.X1);
            }
            drawable2.setBounds(AndroidUtilities.dp(f11) + i9, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(49.0f) + i9, AndroidUtilities.dp(36.0f));
            drawable2.draw(canvas);
            drawable.setBounds(AndroidUtilities.dp(27.0f) + i9, AndroidUtilities.dp(41.0f), AndroidUtilities.dp(70.0f) + i9, AndroidUtilities.dp(55.0f));
            drawable.draw(canvas);
            if (this.f24031e != null && this.T.f24720b3 == 0) {
                int dp4 = ((int) rectF.right) - AndroidUtilities.dp(16.0f);
                int dp5 = AndroidUtilities.dp(f11) + ((int) rectF.top);
                Drawable drawable4 = this.f24031e;
                drawable4.setBounds(dp4, dp5, drawable4.getIntrinsicWidth() + dp4, this.f24031e.getIntrinsicHeight() + dp5);
                this.f24031e.draw(canvas);
            }
        }
        org.telegram.ui.ActionBar.e6 e6Var3 = this.f24029b;
        TLRPC.TL_theme tL_theme2 = e6Var3.B;
        if (tL_theme2 != null && tL_theme2.document == null) {
            radioButton.setAlpha(0.0f);
            org.telegram.ui.ActionBar.f6.X1.setColor(733001146);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(f11), AndroidUtilities.dp(f11), org.telegram.ui.ActionBar.f6.X1);
            if (this.P != null) {
                int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.E6, false);
                if (this.Q != w02) {
                    Drawable drawable5 = this.P;
                    this.Q = w02;
                    org.telegram.ui.ActionBar.f6.w1(w02, drawable5);
                }
                int centerX = (int) (rectF.centerX() - (this.P.getIntrinsicWidth() / 2));
                int centerY = (int) (rectF.centerY() - (this.P.getIntrinsicHeight() / 2));
                Drawable drawable6 = this.P;
                drawable6.setBounds(centerX, centerY, drawable6.getIntrinsicWidth() + centerX, this.P.getIntrinsicHeight() + centerY);
                this.P.draw(canvas);
            }
        } else if ((tL_theme2 != null && !e6Var3.Q) || this.v > 0.0f) {
            radioButton.setAlpha(f12 - this.v);
            paint.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f22947a7, false));
            paint.setAlpha((int) (this.v * 255.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(f11), AndroidUtilities.dp(f11), paint);
            if (this.P != null) {
                int w03 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.E6, false);
                if (this.Q != w03) {
                    Drawable drawable7 = this.P;
                    this.Q = w03;
                    org.telegram.ui.ActionBar.f6.w1(w03, drawable7);
                }
                int centerX2 = (int) (rectF.centerX() - (this.P.getIntrinsicWidth() / 2));
                int centerY2 = (int) (rectF.centerY() - (this.P.getIntrinsicHeight() / 2));
                this.P.setAlpha((int) (this.v * 255.0f));
                Drawable drawable8 = this.P;
                drawable8.setBounds(centerX2, centerY2, drawable8.getIntrinsicWidth() + centerX2, this.P.getIntrinsicHeight() + centerY2);
                this.P.draw(canvas);
            }
            if (this.f24029b.Q) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long min2 = Math.min(17L, elapsedRealtime - this.R);
                this.R = elapsedRealtime;
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
        String n10 = this.f24029b.n();
        if (n10.toLowerCase().endsWith(".attheme")) {
            n10 = n10.substring(0, n10.lastIndexOf(46));
        }
        accessibilityNodeInfo.setText(n10);
        accessibilityNodeInfo.setClassName(Button.class.getName());
        accessibilityNodeInfo.setChecked(this.f24028a.f26508f);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, LocaleController.getString(R.string.AccDescrMoreOptions)));
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11;
        int i12 = 22;
        if (this.f24034r) {
            i11 = 22;
        } else {
            i11 = 15;
        }
        int i13 = i11 + 76;
        if (!this.f24035s) {
            i12 = 0;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i13 + i12), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(148.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.e6 e6Var;
        if (this.f24031e != null && (e6Var = this.f24029b) != null && (e6Var.B == null || e6Var.Q)) {
            ma maVar = this.T;
            if (maVar.f24720b3 == 0) {
                int action = motionEvent.getAction();
                if (action == 0 || action == 1) {
                    float x10 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    RectF rectF = this.f24030c;
                    if (x10 > rectF.centerX() && y10 < rectF.centerY() - AndroidUtilities.dp(10.0f)) {
                        if (action == 0) {
                            this.S = true;
                        } else {
                            try {
                                performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                            maVar.z1(this.f24029b);
                        }
                    }
                    if (action == 1) {
                        this.S = false;
                    }
                }
                return this.S;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAccentState(float f10) {
        this.I = f10;
        this.G = true;
        invalidate();
    }
}
