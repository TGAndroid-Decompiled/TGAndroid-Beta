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
public class yg0 extends FrameLayout {
    public final Paint f32731a;
    public final Path f32732b;
    public final xg0 f32733c;
    public float d;
    public float e;
    public float f32734f;
    public boolean h;
    public org.telegram.messenger.ks f32735n;

    public yg0(Context context) {
        super(context);
        float f7;
        Paint paint = new Paint(1);
        this.f32731a = paint;
        this.f32732b = new Path();
        paint.setColor(-16777216);
        if (Build.VERSION.SDK_INT >= 31 && org.telegram.messenger.tz.o() >= 1) {
            if (org.telegram.messenger.tz.o() == 2) {
                f7 = 1.0f;
            } else {
                f7 = 1.5f;
            }
            this.f32733c = new wg0(this, f7);
        } else {
            this.f32733c = new vg0(this);
        }
        setIntensity(15.0f);
        setBlurIntensity(0.0f);
        setWillNotDraw(false);
    }

    public static void a(yg0 yg0Var, Canvas canvas) {
        canvas.save();
        canvas.translate(0.0f, org.telegram.messenger.i0.L(32.0f));
        super.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void draw(Canvas canvas) {
        if (!this.h) {
            super.draw(canvas);
            return;
        }
        this.f32733c.b(new px(this, 13), canvas);
    }

    public float getAvatarEndScale() {
        float min;
        int L;
        org.telegram.messenger.ks ksVar = this.f32735n;
        if (ksVar == null) {
            return 0.8f;
        }
        if (ksVar.f16632c) {
            min = ksVar.e.width() - org.telegram.messenger.i0.L(2.0f);
            L = org.telegram.messenger.i0.L(100.0f);
        } else {
            min = Math.min(ksVar.e.width(), this.f32735n.e.height());
            L = org.telegram.messenger.i0.L(100.0f);
        }
        return Math.min(0.8f, min / L);
    }

    public float getHiddenAvatarSizeDp() {
        org.telegram.messenger.ks ksVar = this.f32735n;
        if (ksVar != null && ksVar.f16632c) {
            return (ksVar.e.width() * 0.5f) / org.telegram.messenger.i0.f16025p;
        }
        return 24.0f;
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        float f7;
        int i14;
        boolean z10;
        org.telegram.messenger.ks ksVar;
        super.onSizeChanged(i10, i11, i12, i13);
        Context context = getContext();
        if (Build.VERSION.SDK_INT >= 28) {
            ?? obj = new Object();
            int identifier = context.getResources().getIdentifier("config_mainBuiltInDisplayCutout", "string", "android");
            if (identifier != 0) {
                String string = context.getString(identifier);
                if (!string.isEmpty()) {
                    String trim = string.trim();
                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    int i15 = displayMetrics.widthPixels;
                    float f10 = displayMetrics.density;
                    int i16 = 3;
                    int i17 = 5;
                    boolean z11 = false;
                    if (trim.endsWith("@right")) {
                        f7 = i15;
                        trim = trim.substring(0, trim.length() - 6).trim();
                        i14 = 5;
                    } else if (trim.endsWith("@left")) {
                        trim = trim.substring(0, trim.length() - 5).trim();
                        f7 = 0.0f;
                        i14 = 3;
                    } else {
                        f7 = i15 / 2.0f;
                        i14 = 17;
                    }
                    boolean endsWith = trim.endsWith("@dp");
                    if (endsWith) {
                        trim = c3.i0.m(3, 0, trim);
                    }
                    if (trim.contains("@bottom")) {
                        trim = trim.split("@bottom", 2)[0].trim();
                    }
                    try {
                        i0.e[] c10 = v7.w7.c(trim);
                        Path path = new Path();
                        i0.e.b(c10, path);
                        Matrix matrix = new Matrix();
                        if (endsWith) {
                            matrix.postScale(f10, f10);
                        }
                        matrix.postTranslate(f7, 0.0f);
                        path.transform(matrix);
                        obj.d = path;
                        RectF rectF = new RectF();
                        path.computeBounds(rectF, true);
                        obj.e = rectF;
                        DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
                        if (i14 != 17 && Math.abs(rectF.centerX() - (displayMetrics2.widthPixels / 2.0f)) <= org.telegram.messenger.i0.L(2.0f)) {
                            i14 = 17;
                        }
                        if (i14 != 17 || rectF.left >= displayMetrics2.widthPixels / 4.0f) {
                            i16 = i14;
                        }
                        if (i16 != 17 || rectF.right <= (displayMetrics2.widthPixels / 4.0f) * 3.0f) {
                            i17 = i16;
                        }
                        obj.f16630a = i17;
                        if (!trim.contains("C") && !trim.contains("S") && !trim.contains("Q")) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        obj.f16631b = z10;
                        if (rectF.width() <= org.telegram.messenger.i0.L(32.0f) || rectF.width() <= rectF.height()) {
                            z11 = true;
                        }
                        obj.f16632c = z11;
                        ksVar = obj;
                    } catch (Throwable th2) {
                        org.telegram.messenger.f8.e("Failed to parse notch info", th2);
                    }
                    this.f32735n = ksVar;
                    if ((ksVar != null && ksVar.f16630a != 17) || getWidth() > getHeight()) {
                        this.f32735n = null;
                    }
                    this.f32733c.d(i10, i11);
                }
            }
        }
        ksVar = null;
        this.f32735n = ksVar;
        if (ksVar != null) {
            this.f32735n = null;
            this.f32733c.d(i10, i11);
        }
        this.f32735n = null;
        this.f32733c.d(i10, i11);
    }

    public void setBlurIntensity(float f7) {
        this.f32734f = f7;
        this.f32733c.c(f7);
        invalidate();
    }

    public void setGooeyEnabled(boolean z10) {
        if (this.h == z10) {
            return;
        }
        this.h = z10;
        invalidate();
    }

    public void setHideProgress(float f7) {
        boolean z10;
        setPullProgress(f7);
        setBlurIntensity(Math.min((w7.u.a(f7, 0.2f, 0.7f) - 0.2f) / 0.5f, 0.75f));
        int i10 = 0;
        if (f7 > 0.0f && f7 < 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        setGooeyEnabled(z10);
        if (f7 >= 1.0f) {
            i10 = 8;
        }
        setVisibility(i10);
    }

    public void setIntensity(float f7) {
        this.d = f7;
        this.f32733c.a(f7);
        invalidate();
    }

    public void setPullProgress(float f7) {
        this.e = f7;
        invalidate();
    }
}
