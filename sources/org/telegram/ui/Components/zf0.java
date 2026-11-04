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
public class zf0 extends FrameLayout {
    public final Paint f41034a;
    public final Path f41035b;
    public final yf0 f41036c;
    public float d;
    public float f41037e;
    public float f41038f;
    public boolean h;
    public org.telegram.messenger.tr f41039n;

    public zf0(Context context) {
        super(context);
        float f10;
        Paint paint = new Paint(1);
        this.f41034a = paint;
        this.f41035b = new Path();
        paint.setColor(-16777216);
        if (Build.VERSION.SDK_INT >= 31 && org.telegram.messenger.az.o() >= 1) {
            if (org.telegram.messenger.az.o() == 2) {
                f10 = 1.0f;
            } else {
                f10 = 1.5f;
            }
            this.f41036c = new xf0(this, f10);
        } else {
            this.f41036c = new wf0(this);
        }
        setIntensity(15.0f);
        setBlurIntensity(0.0f);
        setWillNotDraw(false);
    }

    public static void a(zf0 zf0Var, Canvas canvas) {
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
        this.f41036c.b(new zw(this, 13), canvas);
    }

    public float getAvatarEndScale() {
        float min;
        int L;
        org.telegram.messenger.tr trVar = this.f41039n;
        if (trVar == null) {
            return 0.8f;
        }
        if (trVar.f25585c) {
            min = trVar.f25586e.width() - org.telegram.messenger.g0.L(2.0f);
            L = org.telegram.messenger.g0.L(100.0f);
        } else {
            min = Math.min(trVar.f25586e.width(), this.f41039n.f25586e.height());
            L = org.telegram.messenger.g0.L(100.0f);
        }
        return Math.min(0.8f, min / L);
    }

    public float getHiddenAvatarSizeDp() {
        org.telegram.messenger.tr trVar = this.f41039n;
        if (trVar != null && trVar.f25585c) {
            return (trVar.f25586e.width() * 0.5f) / org.telegram.messenger.g0.f22607p;
        }
        return 24.0f;
    }

    @Override
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        float f10;
        int i13;
        boolean z10;
        org.telegram.messenger.tr trVar;
        super.onSizeChanged(i3, i10, i11, i12);
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
                    boolean z11 = false;
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
                        trim = com.google.android.recaptcha.internal.a.j(trim, 3, 0);
                    }
                    if (trim.contains("@bottom")) {
                        trim = trim.split("@bottom", 2)[0].trim();
                    }
                    try {
                        i0.d[] c2 = b8.rc.c(trim);
                        Path path = new Path();
                        i0.d.b(c2, path);
                        Matrix matrix = new Matrix();
                        if (endsWith) {
                            matrix.postScale(f11, f11);
                        }
                        matrix.postTranslate(f10, 0.0f);
                        path.transform(matrix);
                        obj.d = path;
                        RectF rectF = new RectF();
                        path.computeBounds(rectF, true);
                        obj.f25586e = rectF;
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
                        obj.f25583a = i16;
                        if (!trim.contains("C") && !trim.contains("S") && !trim.contains("Q")) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        obj.f25584b = z10;
                        if (rectF.width() <= org.telegram.messenger.g0.L(32.0f) || rectF.width() <= rectF.height()) {
                            z11 = true;
                        }
                        obj.f25585c = z11;
                        trVar = obj;
                    } catch (Throwable th2) {
                        org.telegram.messenger.a8.e("Failed to parse notch info", th2);
                    }
                    this.f41039n = trVar;
                    if ((trVar != null && trVar.f25583a != 17) || getWidth() > getHeight()) {
                        this.f41039n = null;
                    }
                    this.f41036c.d(i3, i10);
                }
            }
        }
        trVar = null;
        this.f41039n = trVar;
        if (trVar != null) {
            this.f41039n = null;
            this.f41036c.d(i3, i10);
        }
        this.f41039n = null;
        this.f41036c.d(i3, i10);
    }

    public void setBlurIntensity(float f10) {
        this.f41038f = f10;
        this.f41036c.c(f10);
        invalidate();
    }

    public void setGooeyEnabled(boolean z10) {
        if (this.h == z10) {
            return;
        }
        this.h = z10;
        invalidate();
    }

    public void setHideProgress(float f10) {
        boolean z10;
        setPullProgress(f10);
        setBlurIntensity(Math.min((b8.be.a(f10, 0.2f, 0.7f) - 0.2f) / 0.5f, 0.75f));
        int i3 = 0;
        if (f10 > 0.0f && f10 < 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        setGooeyEnabled(z10);
        if (f10 >= 1.0f) {
            i3 = 8;
        }
        setVisibility(i3);
    }

    public void setIntensity(float f10) {
        this.d = f10;
        this.f41036c.a(f10);
        invalidate();
    }

    public void setPullProgress(float f10) {
        this.f41037e = f10;
        invalidate();
    }
}
