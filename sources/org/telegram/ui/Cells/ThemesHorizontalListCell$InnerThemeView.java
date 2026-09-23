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
import org.telegram.ui.Components.bc0;
public class ThemesHorizontalListCell$InnerThemeView extends FrameLayout {
    public static final int f19733b0 = 0;
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
    public final RadioButton f19734a;
    public final ra f19735a0;
    public org.telegram.ui.ActionBar.g6 f19736b;
    public final RectF f19737c;
    public final Paint d;
    public Drawable e;
    public final TextPaint f19738f;
    public final Drawable h;
    public final Drawable f19739n;
    public boolean f19740r;
    public boolean f19741s;
    public float v;
    public int f19742w;
    public int f19743x;
    public int f19744y;

    public ThemesHorizontalListCell$InnerThemeView(ra raVar, Context context) {
        super(context);
        this.f19735a0 = raVar;
        this.f19737c = new RectF();
        this.d = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f19738f = textPaint;
        this.N = new ArgbEvaluator();
        this.P = new Paint(3);
        this.S = new Matrix();
        setWillNotDraw(false);
        this.h = context.getResources().getDrawable(R.drawable.minibubble_in).mutate();
        this.f19739n = context.getResources().getDrawable(R.drawable.minibubble_out).mutate();
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        RadioButton radioButton = new RadioButton(context);
        this.f19734a = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        addView(radioButton, w7.x5.d(22, 22.0f, 51, 27.0f, 75.0f, 0.0f, 0.0f));
    }

    public final void a() {
        int i10;
        org.telegram.ui.ActionBar.g6 g6Var = this.f19736b;
        if (g6Var.S && g6Var.Y == org.telegram.ui.ActionBar.h6.f18966n) {
            i10 = -1;
        } else {
            i10 = g6Var.Q;
        }
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.h.setColorFilter(new PorterDuffColorFilter(i10, mode));
        this.f19739n.setColorFilter(new PorterDuffColorFilter(this.f19736b.p(), mode));
        double[] dArr = null;
        if (this.f19736b.f18684b == null) {
            d(false);
            this.e = null;
        } else {
            this.e = getResources().getDrawable(R.drawable.preview_dots).mutate();
            int o9 = this.f19736b.o();
            this.f19744y = o9;
            this.I = o9;
        }
        this.Q = null;
        this.O = null;
        org.telegram.ui.ActionBar.g6 g6Var2 = this.f19736b;
        int i11 = g6Var2.M;
        if (i11 != 0 && g6Var2.N != 0) {
            int o10 = this.f19736b.o();
            org.telegram.ui.ActionBar.g6 g6Var3 = this.f19736b;
            bc0 bc0Var = new bc0(true, o10, g6Var3.M, g6Var3.N, g6Var3.O);
            bc0Var.w(AndroidUtilities.dp(6.0f));
            this.O = bc0Var;
            dArr = AndroidUtilities.rgbToHsv(Color.red(this.f19736b.o()), Color.green(this.f19736b.o()), Color.blue(this.f19736b.o()));
        } else if (i11 != 0) {
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{this.f19736b.o(), this.f19736b.M});
            gradientDrawable.setCornerRadius(AndroidUtilities.dp(6.0f));
            this.O = gradientDrawable;
            dArr = AndroidUtilities.rgbToHsv(Color.red(this.f19736b.o()), Color.green(this.f19736b.o()), Color.blue(this.f19736b.o()));
        } else if (g6Var2.P <= 0 && g6Var2.f18686c == null) {
            if (g6Var2.o() != 0) {
                dArr = AndroidUtilities.rgbToHsv(Color.red(this.f19736b.o()), Color.green(this.f19736b.o()), Color.blue(this.f19736b.o()));
            }
        } else {
            org.telegram.ui.ActionBar.g6 g6Var4 = this.f19736b;
            Bitmap scaledBitmap = AndroidUtilities.getScaledBitmap(AndroidUtilities.dp(76.0f), AndroidUtilities.dp(97.0f), g6Var4.f18686c, g6Var4.f18684b, g6Var4.P);
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
        if (this.f19736b.o() == 0 && this.f19736b.T && this.O == null) {
            bc0 Q = org.telegram.ui.ActionBar.h6.Q(100, 200);
            this.O = Q;
            Q.w(AndroidUtilities.dp(6.0f));
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
        int s10;
        int intValue;
        String[] split;
        HashMap hashMap = this.f19735a0.f20778a3;
        org.telegram.ui.ActionBar.g6 g6Var = this.f19736b;
        if (g6Var == null || g6Var.f18684b == null) {
            return false;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(this.f19736b.f18684b));
            int i10 = 0;
            boolean z10 = false;
            while (true) {
                int read = fileInputStream.read(ra.f20777i3);
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
                    byte[] bArr = ra.f20777i3;
                    if (bArr[i12] == 10) {
                        int i14 = i12 - i13;
                        int i15 = i14 + 1;
                        String str = new String(bArr, i13, i14, "UTF-8");
                        if (str.startsWith("WLS=")) {
                            String substring = str.substring(4);
                            Uri parse = Uri.parse(substring);
                            this.f19736b.e = parse.getQueryParameter("slug");
                            org.telegram.ui.ActionBar.g6 g6Var2 = this.f19736b;
                            File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                            g6Var2.f18686c = new File(filesDirFixed, Utilities.MD5(substring) + ".wp").getAbsolutePath();
                            String queryParameter = parse.getQueryParameter("mode");
                            if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                                int i16 = 0;
                                while (true) {
                                    if (i16 >= split.length) {
                                        break;
                                    } else if ("blur".equals(split[i16])) {
                                        this.f19736b.h = true;
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
                                        this.f19736b.f18697r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                        if (queryParameter2.length() >= 13 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(6))) {
                                            this.f19736b.f18698s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                        }
                                        if (queryParameter2.length() >= 20 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(13))) {
                                            this.f19736b.v = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                        }
                                        if (queryParameter2.length() == 27 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(20))) {
                                            this.f19736b.f18699w = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                        }
                                    }
                                } catch (Exception unused) {
                                }
                                try {
                                    String queryParameter3 = parse.getQueryParameter("rotation");
                                    if (!TextUtils.isEmpty(queryParameter3)) {
                                        this.f19736b.f18700x = Utilities.parseInt((CharSequence) queryParameter3).intValue();
                                    }
                                } catch (Exception unused2) {
                                }
                                String queryParameter4 = parse.getQueryParameter("intensity");
                                if (!TextUtils.isEmpty(queryParameter4)) {
                                    this.f19736b.f18701y = Utilities.parseInt((CharSequence) queryParameter4).intValue();
                                }
                                org.telegram.ui.ActionBar.g6 g6Var3 = this.f19736b;
                                if (g6Var3.f18701y == 0) {
                                    g6Var3.f18701y = 50;
                                }
                            }
                        } else if (str.startsWith("WPS")) {
                            this.f19736b.P = i15 + i11;
                            z10 = true;
                            break;
                        } else {
                            int indexOf = str.indexOf(61);
                            if (indexOf != -1 && ((s10 = org.telegram.ui.ActionBar.f5.s(str.substring(0, indexOf))) == org.telegram.ui.ActionBar.h6.f19048ra || s10 == org.telegram.ui.ActionBar.h6.Aa || s10 == org.telegram.ui.ActionBar.h6.Nd || s10 == org.telegram.ui.ActionBar.h6.Od || s10 == org.telegram.ui.ActionBar.h6.Pd || s10 == org.telegram.ui.ActionBar.h6.Qd)) {
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
                                if (s10 == org.telegram.ui.ActionBar.h6.f19048ra) {
                                    this.f19736b.Q = intValue;
                                } else if (s10 == org.telegram.ui.ActionBar.h6.Aa) {
                                    this.f19736b.R = intValue;
                                } else if (s10 == org.telegram.ui.ActionBar.h6.Nd) {
                                    this.f19736b.L = intValue;
                                } else if (s10 == org.telegram.ui.ActionBar.h6.Od) {
                                    this.f19736b.M = intValue;
                                } else if (s10 == org.telegram.ui.ActionBar.h6.Pd) {
                                    this.f19736b.N = intValue;
                                } else if (s10 == org.telegram.ui.ActionBar.h6.Qd) {
                                    this.f19736b.O = intValue;
                                }
                            }
                        }
                        i13 += i15;
                        i11 += i15;
                    }
                    i12++;
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
        org.telegram.ui.ActionBar.g6 g6Var4 = this.f19736b;
        if (g6Var4.f18686c != null && !g6Var4.f18690f && !new File(this.f19736b.f18686c).exists()) {
            if (hashMap.containsKey(this.f19736b)) {
                return false;
            }
            org.telegram.ui.ActionBar.g6 g6Var5 = this.f19736b;
            hashMap.put(g6Var5, g6Var5.e);
            TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
            TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
            org.telegram.ui.ActionBar.g6 g6Var6 = this.f19736b;
            tL_inputWallPaperSlug.slug = g6Var6.e;
            getwallpaper.wallpaper = tL_inputWallPaperSlug;
            ConnectionsManager.getInstance(g6Var6.E).sendRequest(getwallpaper, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    int i17 = ThemesHorizontalListCell$InnerThemeView.f19733b0;
                    AndroidUtilities.runOnUIThread(new pa(0, ThemesHorizontalListCell$InnerThemeView.this, tLObject));
                }
            });
            return false;
        }
        this.f19736b.T = true;
        return true;
    }

    public final void d(boolean z10) {
        int i10;
        int i11;
        int i12;
        this.G = this.f19742w;
        this.H = this.f19743x;
        this.I = this.f19744y;
        this.J = this.E;
        int i13 = 0;
        org.telegram.ui.ActionBar.f6 k10 = this.f19736b.k(false);
        if (k10 != null) {
            i13 = k10.f18638c;
            i11 = k10.e;
            if (i11 == 0) {
                i11 = i13;
            }
            i10 = (int) k10.f18642j;
            if (i10 == 0) {
                i10 = i13;
            }
        } else {
            i10 = 0;
            i11 = 0;
        }
        org.telegram.ui.ActionBar.g6 g6Var = this.f19736b;
        if (g6Var.S && g6Var.Y == org.telegram.ui.ActionBar.h6.f18966n) {
            i12 = -1;
        } else {
            i12 = g6Var.Q;
        }
        this.f19742w = org.telegram.ui.ActionBar.h6.B(g6Var, i13, i12);
        org.telegram.ui.ActionBar.g6 g6Var2 = this.f19736b;
        this.f19743x = org.telegram.ui.ActionBar.h6.B(g6Var2, i11, g6Var2.p());
        org.telegram.ui.ActionBar.g6 g6Var3 = this.f19736b;
        this.f19744y = org.telegram.ui.ActionBar.h6.B(g6Var3, i10, g6Var3.o());
        this.E = this.f19743x;
        this.F = this.f19736b.Y;
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
        org.telegram.ui.ActionBar.g6 A0;
        boolean z10;
        TLRPC.TL_theme tL_theme;
        super.onAttachedToWindow();
        ra raVar = this.f19735a0;
        if (raVar.f20783f3 == 1) {
            A0 = org.telegram.ui.ActionBar.h6.J;
        } else {
            A0 = org.telegram.ui.ActionBar.h6.A0();
        }
        if (this.f19736b == A0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f19734a.a(z10, false);
        org.telegram.ui.ActionBar.g6 g6Var = this.f19736b;
        if (g6Var != null && (tL_theme = g6Var.F) != null && !g6Var.U) {
            if (!raVar.Z2.containsKey(FileLoader.getAttachFileName(tL_theme.document)) && !raVar.f20778a3.containsKey(this.f19736b)) {
                this.f19736b.U = true;
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
        if (this.F != this.f19736b.Y) {
            d(true);
        }
        if (this.f19741s) {
            i10 = AndroidUtilities.dp(22.0f);
        } else {
            i10 = 0;
        }
        int dp = AndroidUtilities.dp(11.0f);
        float f12 = i10;
        float f13 = dp;
        float dp2 = AndroidUtilities.dp(97.0f) + dp;
        RectF rectF = this.f19737c;
        rectF.set(f12, f13, AndroidUtilities.dp(76.0f) + i10, dp2);
        String n10 = this.f19736b.n();
        if (n10.toLowerCase().endsWith(".attheme")) {
            n10 = n10.substring(0, n10.lastIndexOf(46));
        }
        int measuredWidth = getMeasuredWidth();
        if (this.f19741s) {
            f7 = 10.0f;
        } else {
            f7 = 15.0f;
        }
        int dp3 = measuredWidth - AndroidUtilities.dp(f7);
        if (this.f19740r) {
            i11 = AndroidUtilities.dp(7.0f);
        } else {
            i11 = 0;
        }
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint = this.f19738f;
        String charSequence = TextUtils.ellipsize(n10, textPaint, dp3 - i11, truncateAt).toString();
        textPaint.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.G6, false));
        canvas.drawText(charSequence, ((AndroidUtilities.dp(76.0f) - ((int) Math.ceil(textPaint.measureText(charSequence)))) / 2) + i10, AndroidUtilities.dp(131.0f), textPaint);
        org.telegram.ui.ActionBar.g6 g6Var = this.f19736b;
        TLRPC.TL_theme tL_theme = g6Var.F;
        Paint paint = this.d;
        RadioButton radioButton = this.f19734a;
        if (tL_theme != null && (tL_theme.document == null || !g6Var.U)) {
            f10 = 6.0f;
            f11 = 1.0f;
        } else {
            paint.setColor(b(this.I, this.f19744y));
            boolean z10 = this.K;
            Drawable drawable = this.f19739n;
            Drawable drawable2 = this.h;
            if (z10) {
                f10 = 6.0f;
                f11 = 1.0f;
                int b10 = b(this.G, this.f19742w);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable2.setColorFilter(new PorterDuffColorFilter(b10, mode));
                drawable.setColorFilter(new PorterDuffColorFilter(b(this.H, this.f19743x), mode));
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
            org.telegram.ui.ActionBar.g6 g6Var2 = this.f19736b;
            if (g6Var2.X != 0) {
                if ("Day".equals(g6Var2.f18682a) || "Arctic Blue".equals(this.f19736b.f18682a)) {
                    radioButton.b(-5000269, b(this.J, this.E));
                    org.telegram.ui.ActionBar.h6.X1.setColor(733001146);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), org.telegram.ui.ActionBar.h6.X1);
                }
            } else if (this.R) {
                radioButton.b(-5000269, g6Var2.p());
                org.telegram.ui.ActionBar.h6.X1.setColor(733001146);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), org.telegram.ui.ActionBar.h6.X1);
            }
            drawable2.setBounds(AndroidUtilities.dp(f10) + i10, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(49.0f) + i10, AndroidUtilities.dp(36.0f));
            drawable2.draw(canvas);
            drawable.setBounds(AndroidUtilities.dp(27.0f) + i10, AndroidUtilities.dp(41.0f), AndroidUtilities.dp(70.0f) + i10, AndroidUtilities.dp(55.0f));
            drawable.draw(canvas);
            if (this.e != null && this.f19735a0.f20783f3 == 0) {
                int dp4 = ((int) rectF.right) - AndroidUtilities.dp(16.0f);
                int dp5 = AndroidUtilities.dp(f10) + ((int) rectF.top);
                Drawable drawable4 = this.e;
                drawable4.setBounds(dp4, dp5, drawable4.getIntrinsicWidth() + dp4, this.e.getIntrinsicHeight() + dp5);
                this.e.draw(canvas);
            }
        }
        org.telegram.ui.ActionBar.g6 g6Var3 = this.f19736b;
        TLRPC.TL_theme tL_theme2 = g6Var3.F;
        if (tL_theme2 != null && tL_theme2.document == null) {
            radioButton.setAlpha(0.0f);
            org.telegram.ui.ActionBar.h6.X1.setColor(733001146);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), org.telegram.ui.ActionBar.h6.X1);
            if (this.T != null) {
                int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.E6, false);
                if (this.U != w02) {
                    Drawable drawable5 = this.T;
                    this.U = w02;
                    org.telegram.ui.ActionBar.h6.w1(w02, drawable5);
                }
                int centerX = (int) (rectF.centerX() - (this.T.getIntrinsicWidth() / 2));
                int centerY = (int) (rectF.centerY() - (this.T.getIntrinsicHeight() / 2));
                Drawable drawable6 = this.T;
                drawable6.setBounds(centerX, centerY, drawable6.getIntrinsicWidth() + centerX, this.T.getIntrinsicHeight() + centerY);
                this.T.draw(canvas);
            }
        } else if ((tL_theme2 != null && !g6Var3.U) || this.v > 0.0f) {
            radioButton.setAlpha(f11 - this.v);
            paint.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18733a7, false));
            paint.setAlpha((int) (this.v * 255.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), paint);
            if (this.T != null) {
                int w03 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.E6, false);
                if (this.U != w03) {
                    Drawable drawable7 = this.T;
                    this.U = w03;
                    org.telegram.ui.ActionBar.h6.w1(w03, drawable7);
                }
                int centerX2 = (int) (rectF.centerX() - (this.T.getIntrinsicWidth() / 2));
                int centerY2 = (int) (rectF.centerY() - (this.T.getIntrinsicHeight() / 2));
                this.T.setAlpha((int) (this.v * 255.0f));
                Drawable drawable8 = this.T;
                drawable8.setBounds(centerX2, centerY2, drawable8.getIntrinsicWidth() + centerX2, this.T.getIntrinsicHeight() + centerY2);
                this.T.draw(canvas);
            }
            if (this.f19736b.U) {
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
            radioButton.setAlpha(1.0f);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String n10 = this.f19736b.n();
        if (n10.toLowerCase().endsWith(".attheme")) {
            n10 = n10.substring(0, n10.lastIndexOf(46));
        }
        accessibilityNodeInfo.setText(n10);
        accessibilityNodeInfo.setClassName(Button.class.getName());
        accessibilityNodeInfo.setChecked(this.f19734a.f22133f);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, LocaleController.getString(R.string.AccDescrMoreOptions)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13 = 22;
        if (this.f19740r) {
            i12 = 22;
        } else {
            i12 = 15;
        }
        int i14 = i12 + 76;
        if (!this.f19741s) {
            i13 = 0;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i14 + i13), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(148.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.g6 g6Var;
        if (this.e != null && (g6Var = this.f19736b) != null && (g6Var.F == null || g6Var.U)) {
            ra raVar = this.f19735a0;
            if (raVar.f20783f3 == 0) {
                int action = motionEvent.getAction();
                if (action == 0 || action == 1) {
                    float x10 = motionEvent.getX();
                    float y3 = motionEvent.getY();
                    RectF rectF = this.f19737c;
                    if (x10 > rectF.centerX() && y3 < rectF.centerY() - AndroidUtilities.dp(10.0f)) {
                        if (action == 0) {
                            this.W = true;
                        } else {
                            try {
                                performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                            raVar.z1(this.f19736b);
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
