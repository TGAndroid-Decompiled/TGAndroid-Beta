package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
public final class lf0 extends View {
    public int f26094a;
    public boolean f26095b;
    public boolean f26096c;
    public float d;
    public uk0 e;
    public Paint f26097f;
    public Paint h;
    public Paint f26098n;
    public TextPaint f26099r;
    public Path f26100s;
    public kf0 v;
    public qf0 f26101w;

    public final void a(int i10, MotionEvent motionEvent) {
        rf0 rf0Var;
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        if (i10 != 1) {
            if (i10 != 2) {
                if ((i10 == 3 || i10 == 4 || i10 == 5) && this.f26094a != 0) {
                    this.f26094a = 0;
                    return;
                }
                return;
            }
            float min = Math.min(2.0f, (this.d - y3) / 8.0f);
            qf0 qf0Var = this.f26101w;
            int i11 = qf0Var.f27555f;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            rf0Var = null;
                        } else {
                            rf0Var = qf0Var.d;
                        }
                    } else {
                        rf0Var = qf0Var.f27554c;
                    }
                } else {
                    rf0Var = qf0Var.f27553b;
                }
            } else {
                rf0Var = qf0Var.f27552a;
            }
            int i12 = this.f26094a;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            if (i12 == 5) {
                                rf0Var.e = Math.max(0.0f, Math.min(100.0f, rf0Var.e + min));
                            }
                        } else {
                            rf0Var.d = Math.max(0.0f, Math.min(100.0f, rf0Var.d + min));
                        }
                    } else {
                        rf0Var.f27946c = Math.max(0.0f, Math.min(100.0f, rf0Var.f27946c + min));
                    }
                } else {
                    rf0Var.f27945b = Math.max(0.0f, Math.min(100.0f, rf0Var.f27945b + min));
                }
            } else {
                rf0Var.f27944a = Math.max(0.0f, Math.min(100.0f, rf0Var.f27944a + min));
            }
            invalidate();
            kf0 kf0Var = this.v;
            if (kf0Var != null) {
                uf0 uf0Var = ((mf0) kf0Var).f26444a;
                uf0Var.g();
                vz vzVar = uf0Var.f28738l0;
                if (vzVar != null) {
                    vzVar.e(false, false, false);
                }
            }
            this.d = y3;
        } else if (this.f26094a != 0) {
        } else {
            uk0 uk0Var = this.e;
            this.f26094a = (int) Math.floor(com.google.android.gms.internal.vision.e2.A(x10, uk0Var.f28794a, uk0Var.f28796c / 5.0f, 1.0f));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        rf0 rf0Var;
        String format;
        TextPaint textPaint = this.f26099r;
        Path path = this.f26100s;
        Paint paint = this.f26098n;
        qf0 qf0Var = this.f26101w;
        uk0 uk0Var = this.e;
        float f7 = uk0Var.f28796c / 5.0f;
        for (int i10 = 0; i10 < 4; i10++) {
            float f10 = uk0Var.f28794a;
            float f11 = i10 * f7;
            float f12 = f10 + f7 + f11;
            float f13 = uk0Var.f28795b;
            canvas.drawLine(f12, f13, f11 + f10 + f7, f13 + uk0Var.d, this.f26097f);
        }
        float f14 = uk0Var.f28794a;
        float f15 = uk0Var.f28795b;
        canvas.drawLine(f14, f15 + uk0Var.d, f14 + uk0Var.f28796c, f15, this.h);
        int i11 = qf0Var.f27555f;
        int i12 = 3;
        int i13 = 2;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        rf0Var = null;
                    } else {
                        paint.setColor(-13404165);
                        rf0Var = qf0Var.d;
                    }
                } else {
                    paint.setColor(-15667555);
                    rf0Var = qf0Var.f27554c;
                }
            } else {
                paint.setColor(-1229492);
                rf0Var = qf0Var.f27553b;
            }
        } else {
            paint.setColor(-1);
            rf0Var = qf0Var.f27552a;
        }
        int i14 = 0;
        while (i14 < 5) {
            if (i14 != 0) {
                if (i14 != 1) {
                    if (i14 != i13) {
                        if (i14 != i12) {
                            if (i14 != 4) {
                                format = "";
                            } else {
                                format = String.format(Locale.US, "%.2f", Float.valueOf(rf0Var.e / 100.0f));
                            }
                        } else {
                            format = String.format(Locale.US, "%.2f", Float.valueOf(rf0Var.d / 100.0f));
                        }
                    } else {
                        format = String.format(Locale.US, "%.2f", Float.valueOf(rf0Var.f27946c / 100.0f));
                    }
                } else {
                    format = String.format(Locale.US, "%.2f", Float.valueOf(rf0Var.f27945b / 100.0f));
                }
            } else {
                format = String.format(Locale.US, "%.2f", Float.valueOf(rf0Var.f27944a / 100.0f));
            }
            canvas.drawText(format, (i14 * f7) + com.google.android.gms.internal.vision.e2.A(f7, textPaint.measureText(format), 2.0f, uk0Var.f28794a), (uk0Var.f28795b + uk0Var.d) - AndroidUtilities.dp(4.0f), textPaint);
            i14++;
            i12 = 3;
            i13 = 2;
        }
        float[] a2 = rf0Var.a();
        invalidate();
        path.reset();
        for (int i15 = 0; i15 < a2.length / 2; i15++) {
            if (i15 == 0) {
                int i16 = i15 * 2;
                path.moveTo((a2[i16] * uk0Var.f28796c) + uk0Var.f28794a, ((1.0f - a2[i16 + 1]) * uk0Var.d) + uk0Var.f28795b);
            } else {
                int i17 = i15 * 2;
                path.lineTo((a2[i17] * uk0Var.f28796c) + uk0Var.f28794a, ((1.0f - a2[i17 + 1]) * uk0Var.d) + uk0Var.f28795b);
            }
        }
        canvas.drawPath(path, paint);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lf0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(kf0 kf0Var) {
        this.v = kf0Var;
    }
}
