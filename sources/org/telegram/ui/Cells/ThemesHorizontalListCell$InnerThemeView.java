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
import org.telegram.ui.Components.nb0;

class ThemesHorizontalListCell$InnerThemeView extends FrameLayout {
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
    public final ia T;

    public final RadioButton f24035a;

    public org.telegram.ui.ActionBar.f6 f24036b;

    public final RectF f24037c;
    public final Paint d;

    public Drawable f24038e;

    public final TextPaint f24039f;
    public final Drawable h;

    public final Drawable f24040n;

    public boolean f24041r;

    public boolean f24042s;
    public float v;

    public int f24043w;

    public int f24044x;

    public int f24045y;

    public ThemesHorizontalListCell$InnerThemeView(ia iaVar, Context context) {
        super(context);
        this.T = iaVar;
        this.f24037c = new RectF();
        this.d = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f24039f = textPaint;
        this.J = new ArgbEvaluator();
        this.L = new Paint(3);
        this.O = new Matrix();
        setWillNotDraw(false);
        this.h = context.getResources().getDrawable(R.drawable.minibubble_in).mutate();
        this.f24040n = context.getResources().getDrawable(R.drawable.minibubble_out).mutate();
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        RadioButton radioButton = new RadioButton(context);
        this.f24035a = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        addView(radioButton, h7.z5.d(22, 22.0f, 51, 27.0f, 75.0f, 0.0f, 0.0f));
    }

    public final void a() {
        org.telegram.ui.ActionBar.f6 f6Var = this.f24036b;
        int i10 = (f6Var.O && f6Var.U == org.telegram.ui.ActionBar.g6.f23227n) ? -1 : f6Var.M;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.h.setColorFilter(new PorterDuffColorFilter(i10, mode));
        this.f24040n.setColorFilter(new PorterDuffColorFilter(this.f24036b.p(), mode));
        double[] dArrRgbToHsv = null;
        if (this.f24036b.f22943b == null) {
            d(false);
            this.f24038e = null;
        } else {
            this.f24038e = getResources().getDrawable(R.drawable.preview_dots).mutate();
            int iO = this.f24036b.o();
            this.f24045y = iO;
            this.E = iO;
        }
        this.M = null;
        this.K = null;
        org.telegram.ui.ActionBar.f6 f6Var2 = this.f24036b;
        int i11 = f6Var2.I;
        if (i11 != 0 && f6Var2.J != 0) {
            int iO2 = this.f24036b.o();
            org.telegram.ui.ActionBar.f6 f6Var3 = this.f24036b;
            nb0 nb0Var = new nb0(true, iO2, f6Var3.I, f6Var3.J, f6Var3.K);
            nb0Var.w(AndroidUtilities.dp(6.0f));
            this.K = nb0Var;
            dArrRgbToHsv = AndroidUtilities.rgbToHsv(Color.red(this.f24036b.o()), Color.green(this.f24036b.o()), Color.blue(this.f24036b.o()));
        } else if (i11 != 0) {
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{this.f24036b.o(), this.f24036b.I});
            gradientDrawable.setCornerRadius(AndroidUtilities.dp(6.0f));
            this.K = gradientDrawable;
            dArrRgbToHsv = AndroidUtilities.rgbToHsv(Color.red(this.f24036b.o()), Color.green(this.f24036b.o()), Color.blue(this.f24036b.o()));
        } else if (f6Var2.L > 0 || f6Var2.f22945c != null) {
            float fDp = AndroidUtilities.dp(76.0f);
            float fDp2 = AndroidUtilities.dp(97.0f);
            org.telegram.ui.ActionBar.f6 f6Var4 = this.f24036b;
            Bitmap scaledBitmap = AndroidUtilities.getScaledBitmap(fDp, fDp2, f6Var4.f22945c, f6Var4.f22943b, f6Var4.L);
            if (scaledBitmap != null) {
                this.K = new BitmapDrawable(scaledBitmap);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(scaledBitmap, tileMode, tileMode);
                this.M = bitmapShader;
                this.L.setShader(bitmapShader);
                int[] iArrCalcDrawableColor = AndroidUtilities.calcDrawableColor(this.K);
                dArrRgbToHsv = AndroidUtilities.rgbToHsv(Color.red(iArrCalcDrawableColor[0]), Color.green(iArrCalcDrawableColor[0]), Color.blue(iArrCalcDrawableColor[0]));
            }
        } else if (f6Var2.o() != 0) {
            dArrRgbToHsv = AndroidUtilities.rgbToHsv(Color.red(this.f24036b.o()), Color.green(this.f24036b.o()), Color.blue(this.f24036b.o()));
        }
        if (dArrRgbToHsv == null || dArrRgbToHsv[1] > 0.10000000149011612d || dArrRgbToHsv[2] < 0.9599999785423279d) {
            this.N = false;
        } else {
            this.N = true;
        }
        if (this.f24036b.o() == 0 && this.f24036b.P && this.K == null) {
            nb0 nb0VarQ = org.telegram.ui.ActionBar.g6.Q(100, 200);
            this.K = nb0VarQ;
            nb0VarQ.w(AndroidUtilities.dp(6.0f));
        }
        invalidate();
    }

    public final int b(int i10, int i11) {
        float f10 = this.I;
        if (f10 == 1.0f) {
            return i11;
        }
        return ((Integer) this.J.evaluate(f10, Integer.valueOf(i10), Integer.valueOf(i11))).intValue();
    }

    public final boolean c() {
        org.telegram.ui.ActionBar.f6 f6Var;
        int iS;
        int iIntValue;
        String[] strArrSplit;
        HashMap map = this.T.W2;
        org.telegram.ui.ActionBar.f6 f6Var2 = this.f24036b;
        if (f6Var2 == null || f6Var2.f22943b == null) {
            return false;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(this.f24036b.f22943b));
            int i10 = 0;
            boolean z10 = false;
            while (true) {
                try {
                    int i11 = fileInputStream.read(ia.f24500e3);
                    if (i11 == -1) {
                        break;
                    }
                    int i12 = i10;
                    int i13 = 0;
                    for (int i14 = 0; i14 < i11; i14++) {
                        byte[] bArr = ia.f24500e3;
                        if (bArr[i14] == 10) {
                            int i15 = i14 - i13;
                            int i16 = i15 + 1;
                            String str = new String(bArr, i13, i15, "UTF-8");
                            if (!str.startsWith("WLS=")) {
                                if (str.startsWith("WPS")) {
                                    this.f24036b.L = i16 + i12;
                                    z10 = true;
                                    break;
                                }
                                int iIndexOf = str.indexOf(61);
                                if (iIndexOf != -1 && ((iS = org.telegram.ui.ActionBar.e5.s(str.substring(0, iIndexOf))) == org.telegram.ui.ActionBar.g6.f23305ra || iS == org.telegram.ui.ActionBar.g6.Aa || iS == org.telegram.ui.ActionBar.g6.Nd || iS == org.telegram.ui.ActionBar.g6.Od || iS == org.telegram.ui.ActionBar.g6.Pd || iS == org.telegram.ui.ActionBar.g6.Qd)) {
                                    String strSubstring = str.substring(iIndexOf + 1);
                                    if (strSubstring.length() <= 0 || strSubstring.charAt(0) != '#') {
                                        iIntValue = Utilities.parseInt((CharSequence) strSubstring).intValue();
                                    } else {
                                        try {
                                            iIntValue = Color.parseColor(strSubstring);
                                        } catch (Exception unused) {
                                            iIntValue = Utilities.parseInt((CharSequence) strSubstring).intValue();
                                        }
                                    }
                                    if (iS == org.telegram.ui.ActionBar.g6.f23305ra) {
                                        this.f24036b.M = iIntValue;
                                    } else if (iS == org.telegram.ui.ActionBar.g6.Aa) {
                                        this.f24036b.N = iIntValue;
                                    } else if (iS == org.telegram.ui.ActionBar.g6.Nd) {
                                        this.f24036b.H = iIntValue;
                                    } else if (iS == org.telegram.ui.ActionBar.g6.Od) {
                                        this.f24036b.I = iIntValue;
                                    } else if (iS == org.telegram.ui.ActionBar.g6.Pd) {
                                        this.f24036b.J = iIntValue;
                                    } else if (iS == org.telegram.ui.ActionBar.g6.Qd) {
                                        this.f24036b.K = iIntValue;
                                    }
                                }
                                FileLog.e(th);
                                f6Var = this.f24036b;
                                if (f6Var.f22945c != null || f6Var.f22950f || new File(this.f24036b.f22945c).exists()) {
                                    this.f24036b.P = true;
                                    return true;
                                }
                                if (map.containsKey(this.f24036b)) {
                                    return false;
                                }
                                org.telegram.ui.ActionBar.f6 f6Var3 = this.f24036b;
                                map.put(f6Var3, f6Var3.f22948e);
                                TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                                TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                                org.telegram.ui.ActionBar.f6 f6Var4 = this.f24036b;
                                tL_inputWallPaperSlug.slug = f6Var4.f22948e;
                                getwallpaper.wallpaper = tL_inputWallPaperSlug;
                                ConnectionsManager.getInstance(f6Var4.A).sendRequest(getwallpaper, new RequestDelegate() {
                                    @Override
                                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                        int i17 = ThemesHorizontalListCell$InnerThemeView.U;
                                        AndroidUtilities.runOnUIThread(new ga(0, this.f24357a, tLObject));
                                    }
                                });
                                return false;
                            }
                            String strSubstring2 = str.substring(4);
                            Uri uri = Uri.parse(strSubstring2);
                            this.f24036b.f22948e = uri.getQueryParameter("slug");
                            this.f24036b.f22945c = new File(ApplicationLoader.getFilesDirFixed(), Utilities.MD5(strSubstring2) + ".wp").getAbsolutePath();
                            String queryParameter = uri.getQueryParameter("mode");
                            if (queryParameter != null && (strArrSplit = queryParameter.toLowerCase().split(" ")) != null && strArrSplit.length > 0) {
                                for (String str2 : strArrSplit) {
                                    if ("blur".equals(str2)) {
                                        this.f24036b.h = true;
                                        break;
                                    }
                                }
                            }
                            if (!TextUtils.isEmpty(uri.getQueryParameter("pattern"))) {
                                try {
                                    String queryParameter2 = uri.getQueryParameter("bg_color");
                                    if (!TextUtils.isEmpty(queryParameter2)) {
                                        this.f24036b.f22953r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                        if (queryParameter2.length() >= 13 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(6))) {
                                            this.f24036b.f22954s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                        }
                                        if (queryParameter2.length() >= 20 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(13))) {
                                            this.f24036b.v = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                        }
                                        if (queryParameter2.length() == 27 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(20))) {
                                            this.f24036b.f22955w = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                        }
                                    }
                                } catch (Exception unused2) {
                                }
                                try {
                                    String queryParameter3 = uri.getQueryParameter("rotation");
                                    if (!TextUtils.isEmpty(queryParameter3)) {
                                        this.f24036b.f22956x = Utilities.parseInt((CharSequence) queryParameter3).intValue();
                                    }
                                } catch (Exception unused3) {
                                }
                                String queryParameter4 = uri.getQueryParameter("intensity");
                                if (!TextUtils.isEmpty(queryParameter4)) {
                                    this.f24036b.f22957y = Utilities.parseInt((CharSequence) queryParameter4).intValue();
                                }
                                org.telegram.ui.ActionBar.f6 f6Var5 = this.f24036b;
                                if (f6Var5.f22957y == 0) {
                                    f6Var5.f22957y = 50;
                                }
                            }
                            i13 += i16;
                            i12 += i16;
                        }
                    }
                    if (z10 || i10 == i12) {
                        break;
                        break;
                    }
                    fileInputStream.getChannel().position(i12);
                    i10 = i12;
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            fileInputStream.close();
        } catch (Throwable th3) {
            FileLog.e(th3);
        }
        f6Var = this.f24036b;
        if (f6Var.f22945c != null) {
        }
        this.f24036b.P = true;
        return true;
    }

    public final void d(boolean z10) {
        int i10;
        int i11;
        this.C = this.f24043w;
        this.D = this.f24044x;
        this.E = this.f24045y;
        this.F = this.A;
        int i12 = 0;
        org.telegram.ui.ActionBar.e6 e6VarK = this.f24036b.k(false);
        if (e6VarK != null) {
            i12 = e6VarK.f22885c;
            i11 = e6VarK.f22886e;
            if (i11 == 0) {
                i11 = i12;
            }
            i10 = (int) e6VarK.f22890j;
            if (i10 == 0) {
                i10 = i12;
            }
        } else {
            i10 = 0;
            i11 = 0;
        }
        org.telegram.ui.ActionBar.f6 f6Var = this.f24036b;
        this.f24043w = org.telegram.ui.ActionBar.g6.B(f6Var, i12, (f6Var.O && f6Var.U == org.telegram.ui.ActionBar.g6.f23227n) ? -1 : f6Var.M);
        org.telegram.ui.ActionBar.f6 f6Var2 = this.f24036b;
        this.f24044x = org.telegram.ui.ActionBar.g6.B(f6Var2, i11, f6Var2.p());
        org.telegram.ui.ActionBar.f6 f6Var3 = this.f24036b;
        this.f24045y = org.telegram.ui.ActionBar.g6.B(f6Var3, i10, f6Var3.o());
        this.A = this.f24044x;
        this.B = this.f24036b.U;
        ObjectAnimator objectAnimator = this.H;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (!z10) {
            setAccentState(1.0f);
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "accentState", 0.0f, 1.0f);
        this.H = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(200L);
        this.H.start();
    }

    public float getAccentState() {
        return this.I;
    }

    @Override
    public final void onAttachedToWindow() {
        TLRPC.TL_theme tL_theme;
        super.onAttachedToWindow();
        ia iaVar = this.T;
        this.f24035a.a(this.f24036b == (iaVar.f24501b3 == 1 ? org.telegram.ui.ActionBar.g6.J : org.telegram.ui.ActionBar.g6.A0()), false);
        org.telegram.ui.ActionBar.f6 f6Var = this.f24036b;
        if (f6Var == null || (tL_theme = f6Var.B) == null || f6Var.Q) {
            return;
        }
        if (iaVar.V2.containsKey(FileLoader.getAttachFileName(tL_theme.document)) || iaVar.W2.containsKey(this.f24036b)) {
            return;
        }
        this.f24036b.Q = true;
        this.v = 0.0f;
        c();
        a();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        if (this.B != this.f24036b.U) {
            d(true);
        }
        int iDp = this.f24042s ? AndroidUtilities.dp(22.0f) : 0;
        int iDp2 = AndroidUtilities.dp(11.0f);
        float f12 = iDp;
        float f13 = iDp2;
        float fDp = AndroidUtilities.dp(76.0f) + iDp;
        float fDp2 = AndroidUtilities.dp(97.0f) + iDp2;
        RectF rectF = this.f24037c;
        rectF.set(f12, f13, fDp, fDp2);
        String strN = this.f24036b.n();
        if (strN.toLowerCase().endsWith(".attheme")) {
            strN = strN.substring(0, strN.lastIndexOf(46));
        }
        float measuredWidth = (getMeasuredWidth() - AndroidUtilities.dp(this.f24042s ? 10.0f : 15.0f)) - (this.f24041r ? AndroidUtilities.dp(7.0f) : 0);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint = this.f24039f;
        String string = TextUtils.ellipsize(strN, textPaint, measuredWidth, truncateAt).toString();
        int iCeil = (int) Math.ceil(textPaint.measureText(string));
        textPaint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        canvas.drawText(string, ((AndroidUtilities.dp(76.0f) - iCeil) / 2) + iDp, AndroidUtilities.dp(131.0f), textPaint);
        org.telegram.ui.ActionBar.f6 f6Var = this.f24036b;
        TLRPC.TL_theme tL_theme = f6Var.B;
        Paint paint = this.d;
        RadioButton radioButton = this.f24035a;
        if (tL_theme == null || (tL_theme.document != null && f6Var.Q)) {
            paint.setColor(b(this.E, this.f24045y));
            boolean z10 = this.G;
            Drawable drawable = this.f24040n;
            Drawable drawable2 = this.h;
            if (z10) {
                f10 = 6.0f;
                f11 = 1.0f;
                int iB = b(this.C, this.f24043w);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable2.setColorFilter(new PorterDuffColorFilter(iB, mode));
                drawable.setColorFilter(new PorterDuffColorFilter(b(this.D, this.f24044x), mode));
                this.G = false;
            } else {
                f10 = 6.0f;
                f11 = 1.0f;
            }
            Drawable drawable3 = this.K;
            if (drawable3 == null) {
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), paint);
            } else if (this.M != null) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable3;
                float width = bitmapDrawable.getBitmap().getWidth();
                float height = bitmapDrawable.getBitmap().getHeight();
                float fWidth = width / rectF.width();
                float fHeight = height / rectF.height();
                Matrix matrix = this.O;
                matrix.reset();
                float fMin = f11 / Math.min(fWidth, fHeight);
                float f14 = width / fHeight;
                if (f14 > rectF.width()) {
                    matrix.setTranslate(f12 - ((f14 - rectF.width()) / 2.0f), f13);
                } else {
                    matrix.setTranslate(f12, f13 - (((height / fWidth) - rectF.height()) / 2.0f));
                }
                matrix.preScale(fMin, fMin);
                this.M.setLocalMatrix(matrix);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), this.L);
            } else {
                drawable3.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                this.K.draw(canvas);
            }
            radioButton.b(1728053247, -1);
            org.telegram.ui.ActionBar.f6 f6Var2 = this.f24036b;
            if (f6Var2.T != 0) {
                if ("Day".equals(f6Var2.f22941a) || "Arctic Blue".equals(this.f24036b.f22941a)) {
                    radioButton.b(-5000269, b(this.F, this.A));
                    org.telegram.ui.ActionBar.g6.X1.setColor(733001146);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), org.telegram.ui.ActionBar.g6.X1);
                }
            } else if (this.N) {
                radioButton.b(-5000269, f6Var2.p());
                org.telegram.ui.ActionBar.g6.X1.setColor(733001146);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), org.telegram.ui.ActionBar.g6.X1);
            }
            drawable2.setBounds(AndroidUtilities.dp(f10) + iDp, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(49.0f) + iDp, AndroidUtilities.dp(36.0f));
            drawable2.draw(canvas);
            drawable.setBounds(AndroidUtilities.dp(27.0f) + iDp, AndroidUtilities.dp(41.0f), AndroidUtilities.dp(70.0f) + iDp, AndroidUtilities.dp(55.0f));
            drawable.draw(canvas);
            if (this.f24038e != null && this.T.f24501b3 == 0) {
                int iDp3 = ((int) rectF.right) - AndroidUtilities.dp(16.0f);
                int iDp4 = AndroidUtilities.dp(f10) + ((int) rectF.top);
                Drawable drawable4 = this.f24038e;
                drawable4.setBounds(iDp3, iDp4, drawable4.getIntrinsicWidth() + iDp3, this.f24038e.getIntrinsicHeight() + iDp4);
                this.f24038e.draw(canvas);
            }
        } else {
            f10 = 6.0f;
            f11 = 1.0f;
        }
        org.telegram.ui.ActionBar.f6 f6Var3 = this.f24036b;
        TLRPC.TL_theme tL_theme2 = f6Var3.B;
        if (tL_theme2 != null && tL_theme2.document == null) {
            radioButton.setAlpha(0.0f);
            org.telegram.ui.ActionBar.g6.X1.setColor(733001146);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), org.telegram.ui.ActionBar.g6.X1);
            if (this.P != null) {
                int iW0 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E6, false);
                if (this.Q != iW0) {
                    Drawable drawable5 = this.P;
                    this.Q = iW0;
                    org.telegram.ui.ActionBar.g6.w1(iW0, drawable5);
                }
                int iCenterX = (int) (rectF.centerX() - (this.P.getIntrinsicWidth() / 2));
                int iCenterY = (int) (rectF.centerY() - (this.P.getIntrinsicHeight() / 2));
                Drawable drawable6 = this.P;
                drawable6.setBounds(iCenterX, iCenterY, drawable6.getIntrinsicWidth() + iCenterX, this.P.getIntrinsicHeight() + iCenterY);
                this.P.draw(canvas);
                return;
            }
            return;
        }
        if ((tL_theme2 == null || f6Var3.Q) && this.v <= 0.0f) {
            if (radioButton.getAlpha() != f11) {
                radioButton.setAlpha(1.0f);
                return;
            }
            return;
        }
        radioButton.setAlpha(f11 - this.v);
        paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f22999a7, false));
        paint.setAlpha((int) (this.v * 255.0f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), paint);
        if (this.P != null) {
            int iW1 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E6, false);
            if (this.Q != iW1) {
                Drawable drawable7 = this.P;
                this.Q = iW1;
                org.telegram.ui.ActionBar.g6.w1(iW1, drawable7);
            }
            int iCenterX2 = (int) (rectF.centerX() - (this.P.getIntrinsicWidth() / 2));
            int iCenterY2 = (int) (rectF.centerY() - (this.P.getIntrinsicHeight() / 2));
            this.P.setAlpha((int) (this.v * 255.0f));
            Drawable drawable8 = this.P;
            drawable8.setBounds(iCenterX2, iCenterY2, drawable8.getIntrinsicWidth() + iCenterX2, this.P.getIntrinsicHeight() + iCenterY2);
            this.P.draw(canvas);
        }
        if (this.f24036b.Q) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long jMin = Math.min(17L, jElapsedRealtime - this.R);
            this.R = jElapsedRealtime;
            float f15 = this.v - (jMin / 180.0f);
            this.v = f15;
            if (f15 < 0.0f) {
                this.v = 0.0f;
            }
            invalidate();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String strN = this.f24036b.n();
        if (strN.toLowerCase().endsWith(".attheme")) {
            strN = strN.substring(0, strN.lastIndexOf(46));
        }
        accessibilityNodeInfo.setText(strN);
        accessibilityNodeInfo.setClassName(Button.class.getName());
        accessibilityNodeInfo.setChecked(this.f24035a.f26504f);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, LocaleController.getString(R.string.AccDescrMoreOptions)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp((this.f24041r ? 22 : 15) + 76 + (this.f24042s ? 22 : 0)), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(148.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.f6 f6Var;
        if (this.f24038e != null && (f6Var = this.f24036b) != null && (f6Var.B == null || f6Var.Q)) {
            ia iaVar = this.T;
            if (iaVar.f24501b3 == 0) {
                int action = motionEvent.getAction();
                if (action == 0 || action == 1) {
                    float x8 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    RectF rectF = this.f24037c;
                    if (x8 > rectF.centerX() && y10 < rectF.centerY() - AndroidUtilities.dp(10.0f)) {
                        if (action == 0) {
                            this.S = true;
                        } else {
                            try {
                                performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                            iaVar.z1(this.f24036b);
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
