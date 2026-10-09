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
import org.telegram.ui.Components.cd0;
public class ThemesHorizontalListCell$InnerThemeView extends FrameLayout {
    public static final int f21760b0 = 0;
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
    public final RadioButton f21761a;
    public final na f21762a0;
    public org.telegram.ui.ActionBar.h6 f21763b;
    public final RectF f21764c;
    public final Paint d;
    public Drawable f21765e;
    public final TextPaint f21766f;
    public final Drawable h;
    public final Drawable f21767n;
    public boolean f21768r;
    public boolean f21769s;
    public float v;
    public int f21770w;
    public int f21771x;
    public int f21772y;

    public ThemesHorizontalListCell$InnerThemeView(na naVar, Context context) {
        super(context);
        this.f21762a0 = naVar;
        this.f21764c = new RectF();
        this.d = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f21766f = textPaint;
        this.N = new ArgbEvaluator();
        this.P = new Paint(3);
        this.S = new Matrix();
        setWillNotDraw(false);
        this.h = context.getResources().getDrawable(R.drawable.minibubble_in).mutate();
        this.f21767n = context.getResources().getDrawable(R.drawable.minibubble_out).mutate();
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        RadioButton radioButton = new RadioButton(context);
        this.f21761a = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        addView(radioButton, w7.x5.a(22.0f, 27.0f, 75.0f, 0.0f, 0.0f, 22, 51));
    }

    public final void a() {
        int i10;
        org.telegram.ui.ActionBar.h6 h6Var = this.f21763b;
        if (h6Var.S && h6Var.Y == org.telegram.ui.ActionBar.i6.f20975n) {
            i10 = -1;
        } else {
            i10 = h6Var.Q;
        }
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.h.setColorFilter(new PorterDuffColorFilter(i10, mode));
        this.f21767n.setColorFilter(new PorterDuffColorFilter(this.f21763b.p(), mode));
        double[] dArr = null;
        if (this.f21763b.f20705b == null) {
            d(false);
            this.f21765e = null;
        } else {
            this.f21765e = getResources().getDrawable(R.drawable.preview_dots).mutate();
            int o9 = this.f21763b.o();
            this.f21772y = o9;
            this.I = o9;
        }
        this.Q = null;
        this.O = null;
        org.telegram.ui.ActionBar.h6 h6Var2 = this.f21763b;
        int i11 = h6Var2.M;
        if (i11 != 0 && h6Var2.N != 0) {
            int o10 = this.f21763b.o();
            org.telegram.ui.ActionBar.h6 h6Var3 = this.f21763b;
            cd0 cd0Var = new cd0(true, o10, h6Var3.M, h6Var3.N, h6Var3.O);
            cd0Var.w(AndroidUtilities.dp(6.0f));
            this.O = cd0Var;
            dArr = AndroidUtilities.rgbToHsv(Color.red(this.f21763b.o()), Color.green(this.f21763b.o()), Color.blue(this.f21763b.o()));
        } else if (i11 != 0) {
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{this.f21763b.o(), this.f21763b.M});
            gradientDrawable.setCornerRadius(AndroidUtilities.dp(6.0f));
            this.O = gradientDrawable;
            dArr = AndroidUtilities.rgbToHsv(Color.red(this.f21763b.o()), Color.green(this.f21763b.o()), Color.blue(this.f21763b.o()));
        } else if (h6Var2.P <= 0 && h6Var2.f20707c == null) {
            if (h6Var2.o() != 0) {
                dArr = AndroidUtilities.rgbToHsv(Color.red(this.f21763b.o()), Color.green(this.f21763b.o()), Color.blue(this.f21763b.o()));
            }
        } else {
            org.telegram.ui.ActionBar.h6 h6Var4 = this.f21763b;
            Bitmap scaledBitmap = AndroidUtilities.getScaledBitmap(AndroidUtilities.dp(76.0f), AndroidUtilities.dp(97.0f), h6Var4.f20707c, h6Var4.f20705b, h6Var4.P);
            if (scaledBitmap != null) {
                this.O = new BitmapDrawable(scaledBitmap);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(scaledBitmap, tileMode, tileMode);
                this.Q = bitmapShader;
                this.P.setShader(bitmapShader);
                int[] calcDrawableColor = AndroidUtilities.calcDrawableColor(this.O);
                dArr = AndroidUtilities.rgbToHsv(Color.red(calcDrawableColor[0]), Color.green(calcDrawableColor[0]), Color.blue(calcDrawableColor[0]));
            }
        }
        if (dArr != null && dArr[1] <= 0.10000000149011612d && dArr[2] >= 0.9599999785423279d) {
            this.R = true;
        } else {
            this.R = false;
        }
        if (this.f21763b.o() == 0 && this.f21763b.T && this.O == null) {
            cd0 R = org.telegram.ui.ActionBar.i6.R(100, 200);
            this.O = R;
            R.w(AndroidUtilities.dp(6.0f));
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
        int s10;
        int intValue;
        String[] split;
        HashMap hashMap = this.f21762a0.Y2;
        org.telegram.ui.ActionBar.h6 h6Var = this.f21763b;
        if (h6Var == null || h6Var.f20705b == null) {
            return false;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(this.f21763b.f20705b));
            int i10 = 0;
            boolean z10 = false;
            while (true) {
                int read = fileInputStream.read(na.f22549g3);
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
                    byte[] bArr = na.f22549g3;
                    if (bArr[i12] == 10) {
                        int i14 = i12 - i13;
                        int i15 = i14 + 1;
                        String str = new String(bArr, i13, i14, "UTF-8");
                        if (str.startsWith("WLS=")) {
                            String substring = str.substring(4);
                            Uri parse = Uri.parse(substring);
                            this.f21763b.f20710e = parse.getQueryParameter("slug");
                            org.telegram.ui.ActionBar.h6 h6Var2 = this.f21763b;
                            File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                            h6Var2.f20707c = new File(filesDirFixed, Utilities.MD5(substring) + ".wp").getAbsolutePath();
                            String queryParameter = parse.getQueryParameter("mode");
                            if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                                int i16 = 0;
                                while (true) {
                                    if (i16 >= split.length) {
                                        break;
                                    } else if ("blur".equals(split[i16])) {
                                        this.f21763b.h = true;
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
                                        this.f21763b.f20719r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                        if (queryParameter2.length() >= 13 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(6))) {
                                            this.f21763b.f20720s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                        }
                                        if (queryParameter2.length() >= 20 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(13))) {
                                            this.f21763b.v = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                        }
                                        if (queryParameter2.length() == 27 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(20))) {
                                            this.f21763b.f20721w = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                        }
                                    }
                                } catch (Exception unused) {
                                }
                                try {
                                    String queryParameter3 = parse.getQueryParameter("rotation");
                                    if (!TextUtils.isEmpty(queryParameter3)) {
                                        this.f21763b.f20722x = Utilities.parseInt((CharSequence) queryParameter3).intValue();
                                    }
                                } catch (Exception unused2) {
                                }
                                String queryParameter4 = parse.getQueryParameter("intensity");
                                if (!TextUtils.isEmpty(queryParameter4)) {
                                    this.f21763b.f20723y = Utilities.parseInt((CharSequence) queryParameter4).intValue();
                                }
                                org.telegram.ui.ActionBar.h6 h6Var3 = this.f21763b;
                                if (h6Var3.f20723y == 0) {
                                    h6Var3.f20723y = 50;
                                }
                            }
                            c10 = 65535;
                        } else if (str.startsWith("WPS")) {
                            this.f21763b.P = i15 + i11;
                            z10 = true;
                            break;
                        } else {
                            int indexOf = str.indexOf(61);
                            c10 = 65535;
                            if (indexOf != -1 && ((s10 = org.telegram.ui.ActionBar.g5.s(str.substring(0, indexOf))) == org.telegram.ui.ActionBar.i6.f21059ra || s10 == org.telegram.ui.ActionBar.i6.Aa || s10 == org.telegram.ui.ActionBar.i6.Nd || s10 == org.telegram.ui.ActionBar.i6.Od || s10 == org.telegram.ui.ActionBar.i6.Pd || s10 == org.telegram.ui.ActionBar.i6.Qd)) {
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
                                if (s10 == org.telegram.ui.ActionBar.i6.f21059ra) {
                                    this.f21763b.Q = intValue;
                                } else if (s10 == org.telegram.ui.ActionBar.i6.Aa) {
                                    this.f21763b.R = intValue;
                                } else if (s10 == org.telegram.ui.ActionBar.i6.Nd) {
                                    this.f21763b.L = intValue;
                                } else if (s10 == org.telegram.ui.ActionBar.i6.Od) {
                                    this.f21763b.M = intValue;
                                } else if (s10 == org.telegram.ui.ActionBar.i6.Pd) {
                                    this.f21763b.N = intValue;
                                } else if (s10 == org.telegram.ui.ActionBar.i6.Qd) {
                                    this.f21763b.O = intValue;
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
            FileLog.e(th2);
        }
        org.telegram.ui.ActionBar.h6 h6Var4 = this.f21763b;
        if (h6Var4.f20707c != null && !h6Var4.f20712f && !new File(this.f21763b.f20707c).exists()) {
            if (hashMap.containsKey(this.f21763b)) {
                return false;
            }
            org.telegram.ui.ActionBar.h6 h6Var5 = this.f21763b;
            hashMap.put(h6Var5, h6Var5.f20710e);
            TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
            TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
            org.telegram.ui.ActionBar.h6 h6Var6 = this.f21763b;
            tL_inputWallPaperSlug.slug = h6Var6.f20710e;
            getwallpaper.wallpaper = tL_inputWallPaperSlug;
            ConnectionsManager.getInstance(h6Var6.E).sendRequest(getwallpaper, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    int i17 = ThemesHorizontalListCell$InnerThemeView.f21760b0;
                    AndroidUtilities.runOnUIThread(new la(0, ThemesHorizontalListCell$InnerThemeView.this, tLObject));
                }
            });
            return false;
        }
        this.f21763b.T = true;
        return true;
    }

    public final void d(boolean z10) {
        int i10;
        int i11;
        int i12;
        this.G = this.f21770w;
        this.H = this.f21771x;
        this.I = this.f21772y;
        this.J = this.E;
        int i13 = 0;
        org.telegram.ui.ActionBar.g6 k10 = this.f21763b.k(false);
        if (k10 != null) {
            i13 = k10.f20655c;
            i11 = k10.f20656e;
            if (i11 == 0) {
                i11 = i13;
            }
            i10 = (int) k10.f20660j;
            if (i10 == 0) {
                i10 = i13;
            }
        } else {
            i10 = 0;
            i11 = 0;
        }
        org.telegram.ui.ActionBar.h6 h6Var = this.f21763b;
        if (h6Var.S && h6Var.Y == org.telegram.ui.ActionBar.i6.f20975n) {
            i12 = -1;
        } else {
            i12 = h6Var.Q;
        }
        this.f21770w = org.telegram.ui.ActionBar.i6.B(h6Var, i13, i12);
        org.telegram.ui.ActionBar.h6 h6Var2 = this.f21763b;
        this.f21771x = org.telegram.ui.ActionBar.i6.B(h6Var2, i11, h6Var2.p());
        org.telegram.ui.ActionBar.h6 h6Var3 = this.f21763b;
        this.f21772y = org.telegram.ui.ActionBar.i6.B(h6Var3, i10, h6Var3.o());
        this.E = this.f21771x;
        this.F = this.f21763b.Y;
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
        org.telegram.ui.ActionBar.h6 B0;
        boolean z10;
        TLRPC.TL_theme tL_theme;
        super.onAttachedToWindow();
        na naVar = this.f21762a0;
        if (naVar.f22553d3 == 1) {
            B0 = org.telegram.ui.ActionBar.i6.J;
        } else {
            B0 = org.telegram.ui.ActionBar.i6.B0();
        }
        if (this.f21763b == B0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f21761a.a(z10, false);
        org.telegram.ui.ActionBar.h6 h6Var = this.f21763b;
        if (h6Var != null && (tL_theme = h6Var.F) != null && !h6Var.U) {
            if (!naVar.X2.containsKey(FileLoader.getAttachFileName(tL_theme.document)) && !naVar.Y2.containsKey(this.f21763b)) {
                this.f21763b.U = true;
                this.v = 0.0f;
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
        if (this.F != this.f21763b.Y) {
            d(true);
        }
        if (this.f21769s) {
            i10 = AndroidUtilities.dp(22.0f);
        } else {
            i10 = 0;
        }
        int dp = AndroidUtilities.dp(11.0f);
        float f12 = i10;
        float f13 = dp;
        float dp2 = AndroidUtilities.dp(97.0f) + dp;
        RectF rectF = this.f21764c;
        rectF.set(f12, f13, AndroidUtilities.dp(76.0f) + i10, dp2);
        String n10 = this.f21763b.n();
        if (n10.toLowerCase().endsWith(".attheme")) {
            n10 = n10.substring(0, n10.lastIndexOf(46));
        }
        int measuredWidth = getMeasuredWidth();
        if (this.f21769s) {
            f7 = 10.0f;
        } else {
            f7 = 15.0f;
        }
        int dp3 = measuredWidth - AndroidUtilities.dp(f7);
        if (this.f21768r) {
            i11 = AndroidUtilities.dp(7.0f);
        } else {
            i11 = 0;
        }
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint = this.f21766f;
        String charSequence = TextUtils.ellipsize(n10, textPaint, dp3 - i11, truncateAt).toString();
        textPaint.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.G6, false));
        canvas.drawText(charSequence, ((AndroidUtilities.dp(76.0f) - ((int) Math.ceil(textPaint.measureText(charSequence)))) / 2) + i10, AndroidUtilities.dp(131.0f), textPaint);
        org.telegram.ui.ActionBar.h6 h6Var = this.f21763b;
        TLRPC.TL_theme tL_theme = h6Var.F;
        Paint paint = this.d;
        RadioButton radioButton = this.f21761a;
        if (tL_theme != null && (tL_theme.document == null || !h6Var.U)) {
            f10 = 6.0f;
            f11 = 1.0f;
        } else {
            paint.setColor(b(this.I, this.f21772y));
            boolean z10 = this.K;
            Drawable drawable = this.f21767n;
            Drawable drawable2 = this.h;
            if (z10) {
                f10 = 6.0f;
                f11 = 1.0f;
                int b10 = b(this.G, this.f21770w);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable2.setColorFilter(new PorterDuffColorFilter(b10, mode));
                drawable.setColorFilter(new PorterDuffColorFilter(b(this.H, this.f21771x), mode));
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
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), this.P);
                } else {
                    drawable3.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                    this.O.draw(canvas);
                }
            } else {
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), paint);
            }
            radioButton.b(1728053247, -1);
            org.telegram.ui.ActionBar.h6 h6Var2 = this.f21763b;
            if (h6Var2.X != 0) {
                if ("Day".equals(h6Var2.f20703a) || "Arctic Blue".equals(this.f21763b.f20703a)) {
                    radioButton.b(-5000269, b(this.J, this.E));
                    org.telegram.ui.ActionBar.i6.X1.setColor(733001146);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), org.telegram.ui.ActionBar.i6.X1);
                }
            } else if (this.R) {
                radioButton.b(-5000269, h6Var2.p());
                org.telegram.ui.ActionBar.i6.X1.setColor(733001146);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), org.telegram.ui.ActionBar.i6.X1);
            }
            drawable2.setBounds(AndroidUtilities.dp(f10) + i10, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(49.0f) + i10, AndroidUtilities.dp(36.0f));
            drawable2.draw(canvas);
            drawable.setBounds(AndroidUtilities.dp(27.0f) + i10, AndroidUtilities.dp(41.0f), AndroidUtilities.dp(70.0f) + i10, AndroidUtilities.dp(55.0f));
            drawable.draw(canvas);
            if (this.f21765e != null && this.f21762a0.f22553d3 == 0) {
                int dp4 = ((int) rectF.right) - AndroidUtilities.dp(16.0f);
                int dp5 = AndroidUtilities.dp(f10) + ((int) rectF.top);
                Drawable drawable4 = this.f21765e;
                drawable4.setBounds(dp4, dp5, drawable4.getIntrinsicWidth() + dp4, this.f21765e.getIntrinsicHeight() + dp5);
                this.f21765e.draw(canvas);
            }
        }
        org.telegram.ui.ActionBar.h6 h6Var3 = this.f21763b;
        TLRPC.TL_theme tL_theme2 = h6Var3.F;
        if (tL_theme2 != null && tL_theme2.document == null) {
            radioButton.setAlpha(0.0f);
            org.telegram.ui.ActionBar.i6.X1.setColor(733001146);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), org.telegram.ui.ActionBar.i6.X1);
            if (this.T != null) {
                int x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.E6, false);
                if (this.U != x02) {
                    Drawable drawable5 = this.T;
                    this.U = x02;
                    org.telegram.ui.ActionBar.i6.x1(x02, drawable5);
                }
                int centerX = (int) (rectF.centerX() - (this.T.getIntrinsicWidth() / 2));
                int centerY = (int) (rectF.centerY() - (this.T.getIntrinsicHeight() / 2));
                Drawable drawable6 = this.T;
                drawable6.setBounds(centerX, centerY, drawable6.getIntrinsicWidth() + centerX, this.T.getIntrinsicHeight() + centerY);
                this.T.draw(canvas);
            }
        } else if ((tL_theme2 != null && !h6Var3.U) || this.v > 0.0f) {
            radioButton.setAlpha(f11 - this.v);
            paint.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20741a7, false));
            paint.setAlpha((int) (this.v * 255.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), paint);
            if (this.T != null) {
                int x03 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.E6, false);
                if (this.U != x03) {
                    Drawable drawable7 = this.T;
                    this.U = x03;
                    org.telegram.ui.ActionBar.i6.x1(x03, drawable7);
                }
                int centerX2 = (int) (rectF.centerX() - (this.T.getIntrinsicWidth() / 2));
                int centerY2 = (int) (rectF.centerY() - (this.T.getIntrinsicHeight() / 2));
                this.T.setAlpha((int) (this.v * 255.0f));
                Drawable drawable8 = this.T;
                drawable8.setBounds(centerX2, centerY2, drawable8.getIntrinsicWidth() + centerX2, this.T.getIntrinsicHeight() + centerY2);
                this.T.draw(canvas);
            }
            if (this.f21763b.U) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long min2 = Math.min(17L, elapsedRealtime - this.V);
                this.V = elapsedRealtime;
                float f15 = this.v - (((float) min2) / 180.0f);
                this.v = f15;
                if (f15 < 0.0f) {
                    this.v = 0.0f;
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
        String n10 = this.f21763b.n();
        if (n10.toLowerCase().endsWith(".attheme")) {
            n10 = n10.substring(0, n10.lastIndexOf(46));
        }
        accessibilityNodeInfo.setText(n10);
        accessibilityNodeInfo.setClassName(Button.class.getName());
        accessibilityNodeInfo.setChecked(this.f21761a.f24300f);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, LocaleController.getString(R.string.AccDescrMoreOptions)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13 = 22;
        if (this.f21768r) {
            i12 = 22;
        } else {
            i12 = 15;
        }
        int i14 = i12 + 76;
        if (!this.f21769s) {
            i13 = 0;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i14 + i13), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(148.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.h6 h6Var;
        if (this.f21765e != null && (h6Var = this.f21763b) != null && (h6Var.F == null || h6Var.U)) {
            na naVar = this.f21762a0;
            if (naVar.f22553d3 == 0) {
                int action = motionEvent.getAction();
                if (action == 0 || action == 1) {
                    float x10 = motionEvent.getX();
                    float y3 = motionEvent.getY();
                    RectF rectF = this.f21764c;
                    if (x10 > rectF.centerX() && y3 < rectF.centerY() - AndroidUtilities.dp(10.0f)) {
                        if (action == 0) {
                            this.W = true;
                        } else {
                            try {
                                performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                            naVar.A1(this.f21763b);
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
