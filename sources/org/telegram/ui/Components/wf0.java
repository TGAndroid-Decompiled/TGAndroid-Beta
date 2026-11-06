package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.util.DisplayMetrics;
import android.widget.FrameLayout;
public class wf0 extends FrameLayout {
    public final Paint f39951a;
    public final Path f39952b;
    public final vf0 f39953c;
    public float d;
    public float f39954e;
    public float f39955f;
    public boolean h;
    public org.telegram.messenger.bs f39956n;

    public wf0(Context context) {
        super(context);
        float f10;
        Paint paint = new Paint(1);
        this.f39951a = paint;
        this.f39952b = new Path();
        paint.setColor(-16777216);
        if (Build.VERSION.SDK_INT >= 31 && org.telegram.messenger.iz.o() >= 1) {
            if (org.telegram.messenger.iz.o() == 2) {
                f10 = 1.0f;
            } else {
                f10 = 1.5f;
            }
            this.f39953c = new uf0(this, f10);
        } else {
            this.f39953c = new tf0(this);
        }
        setIntensity(15.0f);
        setBlurIntensity(0.0f);
        setWillNotDraw(false);
    }

    public static void a(wf0 wf0Var, Canvas canvas) {
        canvas.save();
        canvas.translate(0.0f, org.telegram.messenger.g0.L(32.0f));
        super.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void draw(Canvas canvas) {
        if (!this.h) {
            super.draw(canvas);
            return;
        }
        this.f39953c.b(new ax(this, 13), canvas);
    }

    public float getAvatarEndScale() {
        float min;
        int L;
        org.telegram.messenger.bs bsVar = this.f39956n;
        if (bsVar == null) {
            return 0.8f;
        }
        if (bsVar.f21691c) {
            min = bsVar.f21692e.width() - org.telegram.messenger.g0.L(2.0f);
            L = org.telegram.messenger.g0.L(100.0f);
        } else {
            min = Math.min(bsVar.f21692e.width(), this.f39956n.f21692e.height());
            L = org.telegram.messenger.g0.L(100.0f);
        }
        return Math.min(0.8f, min / L);
    }

    public float getHiddenAvatarSizeDp() {
        org.telegram.messenger.bs bsVar = this.f39956n;
        if (bsVar != null && bsVar.f21691c) {
            return (bsVar.f21692e.width() * 0.5f) / org.telegram.messenger.g0.f22536p;
        }
        return 24.0f;
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        float f10;
        int i13;
        boolean z9;
        org.telegram.messenger.bs bsVar;
        super.onSizeChanged(i7, i10, i11, i12);
        Context context = getContext();
        if (Build.VERSION.SDK_INT >= 28) {
            ?? obj = new Object();
            int identifier = context.getResources().getIdentifier("config_mainBuiltInDisplayCutout", "string", "android");
            if (identifier != 0) {
                String string = context.getString(identifier);
                if (!string.isEmpty()) {
                    String trim = string.trim();
                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    int i14 = displayMetrics.widthPixels;
                    float f11 = displayMetrics.density;
                    int i15 = 3;
                    int i16 = 5;
                    boolean z10 = false;
                    if (trim.endsWith("@right")) {
                        f10 = i14;
                        trim = trim.substring(0, trim.length() - 6).trim();
                        i13 = 5;
                    } else if (trim.endsWith("@left")) {
                        trim = trim.substring(0, trim.length() - 5).trim();
                        f10 = 0.0f;
                        i13 = 3;
                    } else {
                        f10 = i14 / 2.0f;
                        i13 = 17;
                    }
                    boolean endsWith = trim.endsWith("@dp");
                    if (endsWith) {
                        trim = com.google.android.recaptcha.internal.a.k(trim, 3, 0);
                    }
                    if (trim.contains("@bottom")) {
                        trim = trim.split("@bottom", 2)[0].trim();
                    }
                    try {
                        i0.d[] c10 = c8.i0.c(trim);
                        Path path = new Path();
                        i0.d.b(c10, path);
                        Matrix matrix = new Matrix();
                        if (endsWith) {
                            matrix.postScale(f11, f11);
                        }
                        matrix.postTranslate(f10, 0.0f);
                        path.transform(matrix);
                        obj.d = path;
                        RectF rectF = new RectF();
                        path.computeBounds(rectF, true);
                        obj.f21692e = rectF;
                        DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
                        if (i13 != 17 && Math.abs(rectF.centerX() - (displayMetrics2.widthPixels / 2.0f)) <= org.telegram.messenger.g0.L(2.0f)) {
                            i13 = 17;
                        }
                        if (i13 != 17 || rectF.left >= displayMetrics2.widthPixels / 4.0f) {
                            i15 = i13;
                        }
                        if (i15 != 17 || rectF.right <= (displayMetrics2.widthPixels / 4.0f) * 3.0f) {
                            i16 = i15;
                        }
                        obj.f21689a = i16;
                        if (!trim.contains("C") && !trim.contains("S") && !trim.contains("Q")) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        obj.f21690b = z9;
                        if (rectF.width() <= org.telegram.messenger.g0.L(32.0f) || rectF.width() <= rectF.height()) {
                            z10 = true;
                        }
                        obj.f21691c = z10;
                        bsVar = obj;
                    } catch (Throwable th2) {
                        org.telegram.messenger.a8.e("Failed to parse notch info", th2);
                    }
                    this.f39956n = bsVar;
                    if ((bsVar != null && bsVar.f21689a != 17) || getWidth() > getHeight()) {
                        this.f39956n = null;
                    }
                    this.f39953c.d(i7, i10);
                }
            }
        }
        bsVar = null;
        this.f39956n = bsVar;
        if (bsVar != null) {
            this.f39956n = null;
            this.f39953c.d(i7, i10);
        }
        this.f39956n = null;
        this.f39953c.d(i7, i10);
    }

    public void setBlurIntensity(float f10) {
        this.f39955f = f10;
        this.f39953c.c(f10);
        invalidate();
    }

    public void setGooeyEnabled(boolean z9) {
        if (this.h == z9) {
            return;
        }
        this.h = z9;
        invalidate();
    }

    public void setHideProgress(float f10) {
        boolean z9;
        setPullProgress(f10);
        setBlurIntensity(Math.min((c8.j9.a(f10, 0.2f, 0.7f) - 0.2f) / 0.5f, 0.75f));
        int i7 = 0;
        if (f10 > 0.0f && f10 < 1.0f) {
            z9 = true;
        } else {
            z9 = false;
        }
        setGooeyEnabled(z9);
        if (f10 >= 1.0f) {
            i7 = 8;
        }
        setVisibility(i7);
    }

    public void setIntensity(float f10) {
        this.d = f10;
        this.f39953c.a(f10);
        invalidate();
    }

    public void setPullProgress(float f10) {
        this.f39954e = f10;
        invalidate();
    }
}
