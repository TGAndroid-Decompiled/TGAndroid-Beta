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
public class kg0 extends FrameLayout {
    public final Paint f36741a;
    public final Path f36742b;
    public final jg0 f36743c;
    public float d;
    public float f36744e;
    public float f36745f;
    public boolean h;
    public bi.d2 f36746n;

    public kg0(Context context) {
        super(context);
        float f10;
        Paint paint = new Paint(1);
        this.f36741a = paint;
        this.f36742b = new Path();
        paint.setColor(-16777216);
        if (Build.VERSION.SDK_INT >= 31 && org.telegram.messenger.bz.o() >= 1) {
            if (org.telegram.messenger.bz.o() == 2) {
                f10 = 1.0f;
            } else {
                f10 = 1.5f;
            }
            this.f36743c = new ig0(this, f10);
        } else {
            this.f36743c = new hg0(this);
        }
        setIntensity(15.0f);
        setBlurIntensity(0.0f);
        setWillNotDraw(false);
    }

    public static void a(kg0 kg0Var, Canvas canvas) {
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
        this.f36743c.c(new hy(this, 12), canvas);
    }

    public float getAvatarEndScale() {
        float min;
        int L;
        bi.d2 d2Var = this.f36746n;
        if (d2Var == null) {
            return 0.8f;
        }
        if (d2Var.f3457c) {
            min = ((RectF) d2Var.f3458e).width() - org.telegram.messenger.g0.L(2.0f);
            L = org.telegram.messenger.g0.L(100.0f);
        } else {
            min = Math.min(((RectF) d2Var.f3458e).width(), ((RectF) this.f36746n.f3458e).height());
            L = org.telegram.messenger.g0.L(100.0f);
        }
        return Math.min(0.8f, min / L);
    }

    public float getHiddenAvatarSizeDp() {
        bi.d2 d2Var = this.f36746n;
        if (d2Var != null && d2Var.f3457c) {
            return (((RectF) d2Var.f3458e).width() * 0.5f) / org.telegram.messenger.g0.f24225p;
        }
        return 24.0f;
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        float f10;
        int i13;
        boolean z10;
        bi.d2 d2Var;
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
                        trim = com.google.android.gms.internal.vision.e2.k(trim, 3, 0);
                    }
                    if (trim.contains("@bottom")) {
                        trim = trim.split("@bottom", 2)[0].trim();
                    }
                    try {
                        i0.d[] c10 = c8.m0.c(trim);
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
                        obj.f3458e = rectF;
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
                        obj.f3455a = i16;
                        if (!trim.contains("C") && !trim.contains("S") && !trim.contains("Q")) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        obj.f3456b = z10;
                        if (rectF.width() <= org.telegram.messenger.g0.L(32.0f) || rectF.width() <= rectF.height()) {
                            z11 = true;
                        }
                        obj.f3457c = z11;
                        d2Var = obj;
                    } catch (Throwable th2) {
                        org.telegram.messenger.a8.e("Failed to parse notch info", th2);
                    }
                    this.f36746n = d2Var;
                    if ((d2Var != null && d2Var.f3455a != 17) || getWidth() > getHeight()) {
                        this.f36746n = null;
                    }
                    this.f36743c.d(i7, i10);
                }
            }
        }
        d2Var = null;
        this.f36746n = d2Var;
        if (d2Var != null) {
            this.f36746n = null;
            this.f36743c.d(i7, i10);
        }
        this.f36746n = null;
        this.f36743c.d(i7, i10);
    }

    public void setBlurIntensity(float f10) {
        this.f36745f = f10;
        this.f36743c.b(f10);
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
        setBlurIntensity(Math.min((c8.m9.a(f10, 0.2f, 0.7f) - 0.2f) / 0.5f, 0.75f));
        int i7 = 0;
        if (f10 > 0.0f && f10 < 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        setGooeyEnabled(z10);
        if (f10 >= 1.0f) {
            i7 = 8;
        }
        setVisibility(i7);
    }

    public void setIntensity(float f10) {
        this.d = f10;
        this.f36743c.a(f10);
        invalidate();
    }

    public void setPullProgress(float f10) {
        this.f36744e = f10;
        invalidate();
    }
}
