package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
public final class xf0 extends View {
    public int f32542a;
    public boolean f32543b;
    public boolean f32544c;
    public float d;
    public il0 e;
    public Paint f32545f;
    public Paint h;
    public Paint f32546n;
    public TextPaint f32547r;
    public Path f32548s;
    public wf0 v;
    public dg0 f32549w;

    public final void a(int i10, MotionEvent motionEvent) {
        eg0 eg0Var;
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        if (i10 != 1) {
            if (i10 != 2) {
                if ((i10 == 3 || i10 == 4 || i10 == 5) && this.f32542a != 0) {
                    this.f32542a = 0;
                    return;
                }
                return;
            }
            float min = Math.min(2.0f, (this.d - y3) / 8.0f);
            dg0 dg0Var = this.f32549w;
            int i11 = dg0Var.f25626f;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            eg0Var = null;
                        } else {
                            eg0Var = dg0Var.d;
                        }
                    } else {
                        eg0Var = dg0Var.f25625c;
                    }
                } else {
                    eg0Var = dg0Var.f25624b;
                }
            } else {
                eg0Var = dg0Var.f25623a;
            }
            int i12 = this.f32542a;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            if (i12 == 5) {
                                eg0Var.e = Math.max(0.0f, Math.min(100.0f, eg0Var.e + min));
                            }
                        } else {
                            eg0Var.d = Math.max(0.0f, Math.min(100.0f, eg0Var.d + min));
                        }
                    } else {
                        eg0Var.f25969c = Math.max(0.0f, Math.min(100.0f, eg0Var.f25969c + min));
                    }
                } else {
                    eg0Var.f25968b = Math.max(0.0f, Math.min(100.0f, eg0Var.f25968b + min));
                }
            } else {
                eg0Var.f25967a = Math.max(0.0f, Math.min(100.0f, eg0Var.f25967a + min));
            }
            invalidate();
            wf0 wf0Var = this.v;
            if (wf0Var != null) {
                hg0 hg0Var = ((yf0) wf0Var).f32910a;
                hg0Var.g();
                e00 e00Var = hg0Var.f26932l0;
                if (e00Var != null) {
                    e00Var.d(false, false, false);
                }
            }
            this.d = y3;
        } else if (this.f32542a != 0) {
        } else {
            il0 il0Var = this.e;
            this.f32542a = (int) Math.floor(com.google.android.gms.internal.play_billing.k3.z(x10, il0Var.f27364a, il0Var.f27366c / 5.0f, 1.0f));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        eg0 eg0Var;
        int i10;
        String format;
        TextPaint textPaint = this.f32547r;
        Path path = this.f32548s;
        Paint paint = this.f32546n;
        dg0 dg0Var = this.f32549w;
        il0 il0Var = this.e;
        float f7 = il0Var.f27366c / 5.0f;
        for (int i11 = 0; i11 < 4; i11++) {
            float f10 = il0Var.f27364a;
            float f11 = i11 * f7;
            float f12 = f10 + f7 + f11;
            float f13 = il0Var.f27365b;
            canvas.drawLine(f12, f13, f11 + f10 + f7, f13 + il0Var.d, this.f32545f);
        }
        float f14 = il0Var.f27364a;
        float f15 = il0Var.f27365b;
        canvas.drawLine(f14, f15 + il0Var.d, f14 + il0Var.f27366c, f15, this.h);
        int i12 = dg0Var.f25626f;
        int i13 = 3;
        int i14 = 2;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        eg0Var = null;
                    } else {
                        paint.setColor(-13404165);
                        eg0Var = dg0Var.d;
                    }
                } else {
                    paint.setColor(-15667555);
                    eg0Var = dg0Var.f25625c;
                }
            } else {
                paint.setColor(-1229492);
                eg0Var = dg0Var.f25624b;
            }
        } else {
            paint.setColor(-1);
            eg0Var = dg0Var.f25623a;
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
                                format = String.format(Locale.US, "%.2f", Float.valueOf(eg0Var.e / 100.0f));
                            }
                        } else {
                            i10 = i14;
                            format = String.format(Locale.US, "%.2f", Float.valueOf(eg0Var.d / 100.0f));
                        }
                    } else {
                        i10 = i14;
                        format = String.format(Locale.US, "%.2f", Float.valueOf(eg0Var.f25969c / 100.0f));
                    }
                } else {
                    i10 = i14;
                    format = String.format(Locale.US, "%.2f", Float.valueOf(eg0Var.f25968b / 100.0f));
                }
            } else {
                i10 = i14;
                format = String.format(Locale.US, "%.2f", Float.valueOf(eg0Var.f25967a / 100.0f));
            }
            canvas.drawText(format, (i15 * f7) + com.google.android.gms.internal.play_billing.k3.z(f7, textPaint.measureText(format), 2.0f, il0Var.f27364a), (il0Var.f27365b + il0Var.d) - AndroidUtilities.dp(4.0f), textPaint);
            i15++;
            i14 = i10;
            i13 = 3;
        }
        float[] a2 = eg0Var.a();
        invalidate();
        path.reset();
        for (int i16 = 0; i16 < a2.length / 2; i16++) {
            if (i16 == 0) {
                int i17 = i16 * 2;
                path.moveTo((a2[i17] * il0Var.f27366c) + il0Var.f27364a, ((1.0f - a2[i17 + 1]) * il0Var.d) + il0Var.f27365b);
            } else {
                int i18 = i16 * 2;
                path.lineTo((a2[i18] * il0Var.f27366c) + il0Var.f27364a, ((1.0f - a2[i18 + 1]) * il0Var.d) + il0Var.f27365b);
            }
        }
        canvas.drawPath(path, paint);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xf0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(wf0 wf0Var) {
        this.v = wf0Var;
    }
}
