package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.Locale;
public final class xd0 extends View {
    public int f42006a;
    public boolean f42007b;
    public boolean f42008c;
    public float d;
    public aj0 f42009e;
    public Paint f42010f;
    public Paint h;
    public Paint f42011n;
    public TextPaint f42012r;
    public Path f42013s;
    public wd0 f42014w;
    public h2.c f42015x;

    public final void a(int i7, MotionEvent motionEvent) {
        ce0 ce0Var;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (i7 != 1) {
            if (i7 != 2) {
                if ((i7 == 3 || i7 == 4 || i7 == 5) && this.f42006a != 0) {
                    this.f42006a = 0;
                    return;
                }
                return;
            }
            float min = Math.min(2.0f, (this.d - y10) / 8.0f);
            h2.c cVar = this.f42015x;
            int i10 = cVar.f13724a;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            ce0Var = null;
                        } else {
                            ce0Var = (ce0) cVar.f13727e;
                        }
                    } else {
                        ce0Var = (ce0) cVar.d;
                    }
                } else {
                    ce0Var = (ce0) cVar.f13726c;
                }
            } else {
                ce0Var = (ce0) cVar.f13725b;
            }
            int i11 = this.f42006a;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 == 5) {
                                ce0Var.f34157e = org.telegram.messenger.o10.A(ce0Var.f34157e, min, 100.0f, 0.0f);
                            }
                        } else {
                            ce0Var.d = org.telegram.messenger.o10.A(ce0Var.d, min, 100.0f, 0.0f);
                        }
                    } else {
                        ce0Var.f34156c = org.telegram.messenger.o10.A(ce0Var.f34156c, min, 100.0f, 0.0f);
                    }
                } else {
                    ce0Var.f34155b = org.telegram.messenger.o10.A(ce0Var.f34155b, min, 100.0f, 0.0f);
                }
            } else {
                ce0Var.f34154a = org.telegram.messenger.o10.A(ce0Var.f34154a, min, 100.0f, 0.0f);
            }
            invalidate();
            wd0 wd0Var = this.f42014w;
            if (wd0Var != null) {
                ee0 ee0Var = ((yd0) wd0Var).f42398a;
                ee0Var.d();
                ez ezVar = ee0Var.m0;
                if (ezVar != null) {
                    ezVar.c(false, false, false);
                }
            }
            this.d = y10;
        } else if (this.f42006a != 0) {
        } else {
            aj0 aj0Var = this.f42009e;
            this.f42006a = (int) Math.floor(com.google.android.gms.internal.vision.e2.A(x10, aj0Var.f33496a, aj0Var.f33498c / 5.0f, 1.0f));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ce0 ce0Var;
        int i7;
        String format;
        TextPaint textPaint = this.f42012r;
        Path path = this.f42013s;
        Paint paint = this.f42011n;
        h2.c cVar = this.f42015x;
        aj0 aj0Var = this.f42009e;
        float f10 = aj0Var.f33498c / 5.0f;
        for (int i10 = 0; i10 < 4; i10++) {
            float f11 = aj0Var.f33496a;
            float f12 = i10 * f10;
            float f13 = f11 + f10 + f12;
            float f14 = aj0Var.f33497b;
            canvas.drawLine(f13, f14, f12 + f11 + f10, f14 + aj0Var.d, this.f42010f);
        }
        float f15 = aj0Var.f33496a;
        float f16 = aj0Var.f33497b;
        canvas.drawLine(f15, f16 + aj0Var.d, f15 + aj0Var.f33498c, f16, this.h);
        int i11 = cVar.f13724a;
        int i12 = 3;
        int i13 = 2;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        ce0Var = null;
                    } else {
                        paint.setColor(-13404165);
                        ce0Var = (ce0) cVar.f13727e;
                    }
                } else {
                    paint.setColor(-15667555);
                    ce0Var = (ce0) cVar.d;
                }
            } else {
                paint.setColor(-1229492);
                ce0Var = (ce0) cVar.f13726c;
            }
        } else {
            paint.setColor(-1);
            ce0Var = (ce0) cVar.f13725b;
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
                                format = String.format(Locale.US, "%.2f", Float.valueOf(ce0Var.f34157e / 100.0f));
                            }
                        } else {
                            i7 = i13;
                            format = String.format(Locale.US, "%.2f", Float.valueOf(ce0Var.d / 100.0f));
                        }
                    } else {
                        i7 = i13;
                        format = String.format(Locale.US, "%.2f", Float.valueOf(ce0Var.f34156c / 100.0f));
                    }
                } else {
                    i7 = i13;
                    format = String.format(Locale.US, "%.2f", Float.valueOf(ce0Var.f34155b / 100.0f));
                }
            } else {
                i7 = i13;
                format = String.format(Locale.US, "%.2f", Float.valueOf(ce0Var.f34154a / 100.0f));
            }
            canvas.drawText(format, (i14 * f10) + com.google.android.gms.internal.vision.e2.A(f10, textPaint.measureText(format), 2.0f, aj0Var.f33496a), (aj0Var.f33497b + aj0Var.d) - org.telegram.messenger.g0.L(4.0f), textPaint);
            i14++;
            i13 = i7;
            i12 = 3;
        }
        float[] a10 = ce0Var.a();
        invalidate();
        path.reset();
        for (int i15 = 0; i15 < a10.length / 2; i15++) {
            if (i15 == 0) {
                int i16 = i15 * 2;
                path.moveTo((a10[i16] * aj0Var.f33498c) + aj0Var.f33496a, ((1.0f - a10[i16 + 1]) * aj0Var.d) + aj0Var.f33497b);
            } else {
                int i17 = i15 * 2;
                path.lineTo((a10[i17] * aj0Var.f33498c) + aj0Var.f33496a, ((1.0f - a10[i17 + 1]) * aj0Var.d) + aj0Var.f33497b);
            }
        }
        canvas.drawPath(path, paint);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xd0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(wd0 wd0Var) {
        this.f42014w = wd0Var;
    }
}
