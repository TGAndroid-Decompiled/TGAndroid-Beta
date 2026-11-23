package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.Locale;
public final class wd0 extends View {
    public int f41610a;
    public boolean f41611b;
    public boolean f41612c;
    public float d;
    public aj0 f41613e;
    public Paint f41614f;
    public Paint h;
    public Paint f41615n;
    public TextPaint f41616r;
    public Path f41617s;
    public vd0 f41618w;
    public h2.c f41619x;

    public final void a(int i7, MotionEvent motionEvent) {
        be0 be0Var;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (i7 != 1) {
            if (i7 != 2) {
                if ((i7 == 3 || i7 == 4 || i7 == 5) && this.f41610a != 0) {
                    this.f41610a = 0;
                    return;
                }
                return;
            }
            float min = Math.min(2.0f, (this.d - y10) / 8.0f);
            h2.c cVar = this.f41619x;
            int i10 = cVar.f13724a;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            be0Var = null;
                        } else {
                            be0Var = (be0) cVar.f13727e;
                        }
                    } else {
                        be0Var = (be0) cVar.d;
                    }
                } else {
                    be0Var = (be0) cVar.f13726c;
                }
            } else {
                be0Var = (be0) cVar.f13725b;
            }
            int i11 = this.f41610a;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 == 5) {
                                be0Var.f33747e = org.telegram.messenger.m10.A(be0Var.f33747e, min, 100.0f, 0.0f);
                            }
                        } else {
                            be0Var.d = org.telegram.messenger.m10.A(be0Var.d, min, 100.0f, 0.0f);
                        }
                    } else {
                        be0Var.f33746c = org.telegram.messenger.m10.A(be0Var.f33746c, min, 100.0f, 0.0f);
                    }
                } else {
                    be0Var.f33745b = org.telegram.messenger.m10.A(be0Var.f33745b, min, 100.0f, 0.0f);
                }
            } else {
                be0Var.f33744a = org.telegram.messenger.m10.A(be0Var.f33744a, min, 100.0f, 0.0f);
            }
            invalidate();
            vd0 vd0Var = this.f41618w;
            if (vd0Var != null) {
                de0 de0Var = ((xd0) vd0Var).f41986a;
                de0Var.d();
                bz bzVar = de0Var.m0;
                if (bzVar != null) {
                    bzVar.c(false, false, false);
                }
            }
            this.d = y10;
        } else if (this.f41610a != 0) {
        } else {
            aj0 aj0Var = this.f41613e;
            this.f41610a = (int) Math.floor(com.google.android.gms.internal.vision.e2.A(x10, aj0Var.f33482a, aj0Var.f33484c / 5.0f, 1.0f));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        be0 be0Var;
        int i7;
        String format;
        TextPaint textPaint = this.f41616r;
        Path path = this.f41617s;
        Paint paint = this.f41615n;
        h2.c cVar = this.f41619x;
        aj0 aj0Var = this.f41613e;
        float f10 = aj0Var.f33484c / 5.0f;
        for (int i10 = 0; i10 < 4; i10++) {
            float f11 = aj0Var.f33482a;
            float f12 = i10 * f10;
            float f13 = f11 + f10 + f12;
            float f14 = aj0Var.f33483b;
            canvas.drawLine(f13, f14, f12 + f11 + f10, f14 + aj0Var.d, this.f41614f);
        }
        float f15 = aj0Var.f33482a;
        float f16 = aj0Var.f33483b;
        canvas.drawLine(f15, f16 + aj0Var.d, f15 + aj0Var.f33484c, f16, this.h);
        int i11 = cVar.f13724a;
        int i12 = 3;
        int i13 = 2;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        be0Var = null;
                    } else {
                        paint.setColor(-13404165);
                        be0Var = (be0) cVar.f13727e;
                    }
                } else {
                    paint.setColor(-15667555);
                    be0Var = (be0) cVar.d;
                }
            } else {
                paint.setColor(-1229492);
                be0Var = (be0) cVar.f13726c;
            }
        } else {
            paint.setColor(-1);
            be0Var = (be0) cVar.f13725b;
        }
        int i14 = 0;
        while (i14 < 5) {
            if (i14 != 0) {
                if (i14 != 1) {
                    if (i14 != i13) {
                        if (i14 != i12) {
                            if (i14 != 4) {
                                format = "";
                                i7 = i13;
                            } else {
                                i7 = i13;
                                format = String.format(Locale.US, "%.2f", Float.valueOf(be0Var.f33747e / 100.0f));
                            }
                        } else {
                            i7 = i13;
                            format = String.format(Locale.US, "%.2f", Float.valueOf(be0Var.d / 100.0f));
                        }
                    } else {
                        i7 = i13;
                        format = String.format(Locale.US, "%.2f", Float.valueOf(be0Var.f33746c / 100.0f));
                    }
                } else {
                    i7 = i13;
                    format = String.format(Locale.US, "%.2f", Float.valueOf(be0Var.f33745b / 100.0f));
                }
            } else {
                i7 = i13;
                format = String.format(Locale.US, "%.2f", Float.valueOf(be0Var.f33744a / 100.0f));
            }
            canvas.drawText(format, (i14 * f10) + com.google.android.gms.internal.vision.e2.A(f10, textPaint.measureText(format), 2.0f, aj0Var.f33482a), (aj0Var.f33483b + aj0Var.d) - org.telegram.messenger.g0.L(4.0f), textPaint);
            i14++;
            i13 = i7;
            i12 = 3;
        }
        float[] a10 = be0Var.a();
        invalidate();
        path.reset();
        for (int i15 = 0; i15 < a10.length / 2; i15++) {
            if (i15 == 0) {
                int i16 = i15 * 2;
                path.moveTo((a10[i16] * aj0Var.f33484c) + aj0Var.f33482a, ((1.0f - a10[i16 + 1]) * aj0Var.d) + aj0Var.f33483b);
            } else {
                int i17 = i15 * 2;
                path.lineTo((a10[i17] * aj0Var.f33484c) + aj0Var.f33482a, ((1.0f - a10[i17 + 1]) * aj0Var.d) + aj0Var.f33483b);
            }
        }
        canvas.drawPath(path, paint);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wd0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(vd0 vd0Var) {
        this.f41618w = vd0Var;
    }
}
