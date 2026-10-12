package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
public final class zf0 extends View {
    public int f31853a;
    public boolean f31854b;
    public boolean f31855c;
    public float d;
    public il0 e;
    public Paint f31856f;
    public Paint h;
    public Paint f31857n;
    public TextPaint f31858r;
    public Path f31859s;
    public yf0 v;
    public eg0 f31860w;

    public final void a(int i10, MotionEvent motionEvent) {
        fg0 fg0Var;
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        if (i10 != 1) {
            if (i10 != 2) {
                if ((i10 == 3 || i10 == 4 || i10 == 5) && this.f31853a != 0) {
                    this.f31853a = 0;
                    return;
                }
                return;
            }
            float min = Math.min(2.0f, (this.d - y3) / 8.0f);
            eg0 eg0Var = this.f31860w;
            int i11 = eg0Var.f24700f;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            fg0Var = null;
                        } else {
                            fg0Var = eg0Var.d;
                        }
                    } else {
                        fg0Var = eg0Var.f24699c;
                    }
                } else {
                    fg0Var = eg0Var.f24698b;
                }
            } else {
                fg0Var = eg0Var.f24697a;
            }
            int i12 = this.f31853a;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            if (i12 == 5) {
                                fg0Var.e = Math.max(0.0f, Math.min(100.0f, fg0Var.e + min));
                            }
                        } else {
                            fg0Var.d = Math.max(0.0f, Math.min(100.0f, fg0Var.d + min));
                        }
                    } else {
                        fg0Var.f25029c = Math.max(0.0f, Math.min(100.0f, fg0Var.f25029c + min));
                    }
                } else {
                    fg0Var.f25028b = Math.max(0.0f, Math.min(100.0f, fg0Var.f25028b + min));
                }
            } else {
                fg0Var.f25027a = Math.max(0.0f, Math.min(100.0f, fg0Var.f25027a + min));
            }
            invalidate();
            yf0 yf0Var = this.v;
            if (yf0Var != null) {
                ig0 ig0Var = ((ag0) yf0Var).f23551a;
                ig0Var.g();
                h00 h00Var = ig0Var.f25958l0;
                if (h00Var != null) {
                    h00Var.d(false, false, false);
                }
            }
            this.d = y3;
        } else if (this.f31853a != 0) {
        } else {
            il0 il0Var = this.e;
            this.f31853a = (int) Math.floor(com.google.android.gms.internal.play_billing.k3.z(x10, il0Var.f25990a, il0Var.f25992c / 5.0f, 1.0f));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        fg0 fg0Var;
        int i10;
        String format;
        TextPaint textPaint = this.f31858r;
        Path path = this.f31859s;
        Paint paint = this.f31857n;
        eg0 eg0Var = this.f31860w;
        il0 il0Var = this.e;
        float f7 = il0Var.f25992c / 5.0f;
        for (int i11 = 0; i11 < 4; i11++) {
            float f10 = il0Var.f25990a;
            float f11 = i11 * f7;
            float f12 = f10 + f7 + f11;
            float f13 = il0Var.f25991b;
            canvas.drawLine(f12, f13, f11 + f10 + f7, f13 + il0Var.d, this.f31856f);
        }
        float f14 = il0Var.f25990a;
        float f15 = il0Var.f25991b;
        canvas.drawLine(f14, f15 + il0Var.d, f14 + il0Var.f25992c, f15, this.h);
        int i12 = eg0Var.f24700f;
        int i13 = 3;
        int i14 = 2;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        fg0Var = null;
                    } else {
                        paint.setColor(-13404165);
                        fg0Var = eg0Var.d;
                    }
                } else {
                    paint.setColor(-15667555);
                    fg0Var = eg0Var.f24699c;
                }
            } else {
                paint.setColor(-1229492);
                fg0Var = eg0Var.f24698b;
            }
        } else {
            paint.setColor(-1);
            fg0Var = eg0Var.f24697a;
        }
        int i15 = 0;
        while (i15 < 5) {
            if (i15 != 0) {
                if (i15 != 1) {
                    if (i15 != i14) {
                        if (i15 != i13) {
                            if (i15 != 4) {
                                format = "";
                                i10 = i14;
                            } else {
                                i10 = i14;
                                format = String.format(Locale.US, "%.2f", Float.valueOf(fg0Var.e / 100.0f));
                            }
                        } else {
                            i10 = i14;
                            format = String.format(Locale.US, "%.2f", Float.valueOf(fg0Var.d / 100.0f));
                        }
                    } else {
                        i10 = i14;
                        format = String.format(Locale.US, "%.2f", Float.valueOf(fg0Var.f25029c / 100.0f));
                    }
                } else {
                    i10 = i14;
                    format = String.format(Locale.US, "%.2f", Float.valueOf(fg0Var.f25028b / 100.0f));
                }
            } else {
                i10 = i14;
                format = String.format(Locale.US, "%.2f", Float.valueOf(fg0Var.f25027a / 100.0f));
            }
            canvas.drawText(format, (i15 * f7) + com.google.android.gms.internal.play_billing.k3.z(f7, textPaint.measureText(format), 2.0f, il0Var.f25990a), (il0Var.f25991b + il0Var.d) - AndroidUtilities.dp(4.0f), textPaint);
            i15++;
            i14 = i10;
            i13 = 3;
        }
        float[] a2 = fg0Var.a();
        invalidate();
        path.reset();
        for (int i16 = 0; i16 < a2.length / 2; i16++) {
            if (i16 == 0) {
                int i17 = i16 * 2;
                path.moveTo((a2[i17] * il0Var.f25992c) + il0Var.f25990a, ((1.0f - a2[i17 + 1]) * il0Var.d) + il0Var.f25991b);
            } else {
                int i18 = i16 * 2;
                path.lineTo((a2[i18] * il0Var.f25992c) + il0Var.f25990a, ((1.0f - a2[i18 + 1]) * il0Var.d) + il0Var.f25991b);
            }
        }
        canvas.drawPath(path, paint);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zf0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(yf0 yf0Var) {
        this.v = yf0Var;
    }
}
