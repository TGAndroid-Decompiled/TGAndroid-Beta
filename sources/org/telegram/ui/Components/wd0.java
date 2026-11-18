package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.Locale;
public final class wd0 extends View {
    public int f41692a;
    public boolean f41693b;
    public boolean f41694c;
    public float d;
    public yi0 f41695e;
    public Paint f41696f;
    public Paint h;
    public Paint f41697n;
    public TextPaint f41698r;
    public Path f41699s;
    public vd0 f41700w;
    public h2.c f41701x;

    public final void a(int i7, MotionEvent motionEvent) {
        be0 be0Var;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (i7 != 1) {
            if (i7 != 2) {
                if ((i7 == 3 || i7 == 4 || i7 == 5) && this.f41692a != 0) {
                    this.f41692a = 0;
                    return;
                }
                return;
            }
            float min = Math.min(2.0f, (this.d - y10) / 8.0f);
            h2.c cVar = this.f41701x;
            int i10 = cVar.f13732a;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            be0Var = null;
                        } else {
                            be0Var = (be0) cVar.f13735e;
                        }
                    } else {
                        be0Var = (be0) cVar.d;
                    }
                } else {
                    be0Var = (be0) cVar.f13734c;
                }
            } else {
                be0Var = (be0) cVar.f13733b;
            }
            int i11 = this.f41692a;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 == 5) {
                                be0Var.f33674e = org.telegram.messenger.n10.A(be0Var.f33674e, min, 100.0f, 0.0f);
                            }
                        } else {
                            be0Var.d = org.telegram.messenger.n10.A(be0Var.d, min, 100.0f, 0.0f);
                        }
                    } else {
                        be0Var.f33673c = org.telegram.messenger.n10.A(be0Var.f33673c, min, 100.0f, 0.0f);
                    }
                } else {
                    be0Var.f33672b = org.telegram.messenger.n10.A(be0Var.f33672b, min, 100.0f, 0.0f);
                }
            } else {
                be0Var.f33671a = org.telegram.messenger.n10.A(be0Var.f33671a, min, 100.0f, 0.0f);
            }
            invalidate();
            vd0 vd0Var = this.f41700w;
            if (vd0Var != null) {
                de0 de0Var = ((xd0) vd0Var).f41990a;
                de0Var.d();
                cz czVar = de0Var.m0;
                if (czVar != null) {
                    czVar.c(false, false, false);
                }
            }
            this.d = y10;
        } else if (this.f41692a != 0) {
        } else {
            yi0 yi0Var = this.f41695e;
            this.f41692a = (int) Math.floor(com.google.android.gms.internal.vision.e2.A(x10, yi0Var.f42503a, yi0Var.f42505c / 5.0f, 1.0f));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        be0 be0Var;
        int i7;
        String format;
        TextPaint textPaint = this.f41698r;
        Path path = this.f41699s;
        Paint paint = this.f41697n;
        h2.c cVar = this.f41701x;
        yi0 yi0Var = this.f41695e;
        float f10 = yi0Var.f42505c / 5.0f;
        for (int i10 = 0; i10 < 4; i10++) {
            float f11 = yi0Var.f42503a;
            float f12 = i10 * f10;
            float f13 = f11 + f10 + f12;
            float f14 = yi0Var.f42504b;
            canvas.drawLine(f13, f14, f12 + f11 + f10, f14 + yi0Var.d, this.f41696f);
        }
        float f15 = yi0Var.f42503a;
        float f16 = yi0Var.f42504b;
        canvas.drawLine(f15, f16 + yi0Var.d, f15 + yi0Var.f42505c, f16, this.h);
        int i11 = cVar.f13732a;
        int i12 = 3;
        int i13 = 2;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        be0Var = null;
                    } else {
                        paint.setColor(-13404165);
                        be0Var = (be0) cVar.f13735e;
                    }
                } else {
                    paint.setColor(-15667555);
                    be0Var = (be0) cVar.d;
                }
            } else {
                paint.setColor(-1229492);
                be0Var = (be0) cVar.f13734c;
            }
        } else {
            paint.setColor(-1);
            be0Var = (be0) cVar.f13733b;
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
                                format = String.format(Locale.US, "%.2f", Float.valueOf(be0Var.f33674e / 100.0f));
                            }
                        } else {
                            i7 = i13;
                            format = String.format(Locale.US, "%.2f", Float.valueOf(be0Var.d / 100.0f));
                        }
                    } else {
                        i7 = i13;
                        format = String.format(Locale.US, "%.2f", Float.valueOf(be0Var.f33673c / 100.0f));
                    }
                } else {
                    i7 = i13;
                    format = String.format(Locale.US, "%.2f", Float.valueOf(be0Var.f33672b / 100.0f));
                }
            } else {
                i7 = i13;
                format = String.format(Locale.US, "%.2f", Float.valueOf(be0Var.f33671a / 100.0f));
            }
            canvas.drawText(format, (i14 * f10) + com.google.android.gms.internal.vision.e2.A(f10, textPaint.measureText(format), 2.0f, yi0Var.f42503a), (yi0Var.f42504b + yi0Var.d) - org.telegram.messenger.g0.L(4.0f), textPaint);
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
                path.moveTo((a10[i16] * yi0Var.f42505c) + yi0Var.f42503a, ((1.0f - a10[i16 + 1]) * yi0Var.d) + yi0Var.f42504b);
            } else {
                int i17 = i15 * 2;
                path.lineTo((a10[i17] * yi0Var.f42505c) + yi0Var.f42503a, ((1.0f - a10[i17 + 1]) * yi0Var.d) + yi0Var.f42504b);
            }
        }
        canvas.drawPath(path, paint);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wd0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(vd0 vd0Var) {
        this.f41700w = vd0Var;
    }
}
