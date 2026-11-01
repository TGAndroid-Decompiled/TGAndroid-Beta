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
public class zg0 extends FrameLayout {
    public final Paint f33152a;
    public final Path f33153b;
    public final yg0 f33154c;
    public float d;
    public float e;
    public float f33155f;
    public boolean h;
    public org.telegram.messenger.ls f33156n;

    public zg0(Context context) {
        super(context);
        float f7;
        Paint paint = new Paint(1);
        this.f33152a = paint;
        this.f33153b = new Path();
        paint.setColor(-16777216);
        if (Build.VERSION.SDK_INT >= 31 && org.telegram.messenger.uz.o() >= 1) {
            if (org.telegram.messenger.uz.o() == 2) {
                f7 = 1.0f;
            } else {
                f7 = 1.5f;
            }
            this.f33154c = new xg0(this, f7);
        } else {
            this.f33154c = new wg0(this);
        }
        setIntensity(15.0f);
        setBlurIntensity(0.0f);
        setWillNotDraw(false);
    }

    public static void a(zg0 zg0Var, Canvas canvas) {
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
        this.f33154c.b(new px(this, 13), canvas);
    }

    public float getAvatarEndScale() {
        float min;
        int L;
        org.telegram.messenger.ls lsVar = this.f33156n;
        if (lsVar == null) {
            return 0.8f;
        }
        if (lsVar.f16997c) {
            min = lsVar.e.width() - org.telegram.messenger.i0.L(2.0f);
            L = org.telegram.messenger.i0.L(100.0f);
        } else {
            min = Math.min(lsVar.e.width(), this.f33156n.e.height());
            L = org.telegram.messenger.i0.L(100.0f);
        }
        return Math.min(0.8f, min / L);
    }

    public float getHiddenAvatarSizeDp() {
        org.telegram.messenger.ls lsVar = this.f33156n;
        if (lsVar != null && lsVar.f16997c) {
            return (lsVar.e.width() * 0.5f) / org.telegram.messenger.i0.f16171p;
        }
        return 24.0f;
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        float f7;
        int i14;
        boolean z10;
        org.telegram.messenger.ls lsVar;
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
                        obj.f16995a = i17;
                        if (!trim.contains("C") && !trim.contains("S") && !trim.contains("Q")) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        obj.f16996b = z10;
                        if (rectF.width() <= org.telegram.messenger.i0.L(32.0f) || rectF.width() <= rectF.height()) {
                            z11 = true;
                        }
                        obj.f16997c = z11;
                        lsVar = obj;
                    } catch (Throwable th2) {
                        org.telegram.messenger.f8.e("Failed to parse notch info", th2);
                    }
                    this.f33156n = lsVar;
                    if ((lsVar != null && lsVar.f16995a != 17) || getWidth() > getHeight()) {
                        this.f33156n = null;
                    }
                    this.f33154c.d(i10, i11);
                }
            }
        }
        lsVar = null;
        this.f33156n = lsVar;
        if (lsVar != null) {
            this.f33156n = null;
            this.f33154c.d(i10, i11);
        }
        this.f33156n = null;
        this.f33154c.d(i10, i11);
    }

    public void setBlurIntensity(float f7) {
        this.f33155f = f7;
        this.f33154c.c(f7);
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
        this.f33154c.a(f7);
        invalidate();
    }

    public void setPullProgress(float f7) {
        this.e = f7;
        invalidate();
    }
}
