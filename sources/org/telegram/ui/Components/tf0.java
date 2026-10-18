package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
public final class tf0 extends View {
    public int f30533a;
    public boolean f30534b;
    public boolean f30535c;
    public float d;
    public el0 e;
    public Paint f30536f;
    public Paint h;
    public Paint f30537n;
    public TextPaint f30538r;
    public Path f30539s;
    public sf0 v;
    public yf0 f30540w;

    public final void a(int i10, MotionEvent motionEvent) {
        zf0 zf0Var;
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        if (i10 != 1) {
            if (i10 != 2) {
                if ((i10 == 3 || i10 == 4 || i10 == 5) && this.f30533a != 0) {
                    this.f30533a = 0;
                    return;
                }
                return;
            }
            float min = Math.min(2.0f, (this.d - y3) / 8.0f);
            yf0 yf0Var = this.f30540w;
            int i11 = yf0Var.f32622f;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            zf0Var = null;
                        } else {
                            zf0Var = yf0Var.d;
                        }
                    } else {
                        zf0Var = yf0Var.f32621c;
                    }
                } else {
                    zf0Var = yf0Var.f32620b;
                }
            } else {
                zf0Var = yf0Var.f32619a;
            }
            int i12 = this.f30533a;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            if (i12 == 5) {
                                zf0Var.e = Math.max(0.0f, Math.min(100.0f, zf0Var.e + min));
                            }
                        } else {
                            zf0Var.d = Math.max(0.0f, Math.min(100.0f, zf0Var.d + min));
                        }
                    } else {
                        zf0Var.f32897c = Math.max(0.0f, Math.min(100.0f, zf0Var.f32897c + min));
                    }
                } else {
                    zf0Var.f32896b = Math.max(0.0f, Math.min(100.0f, zf0Var.f32896b + min));
                }
            } else {
                zf0Var.f32895a = Math.max(0.0f, Math.min(100.0f, zf0Var.f32895a + min));
            }
            invalidate();
            sf0 sf0Var = this.v;
            if (sf0Var != null) {
                cg0 cg0Var = ((uf0) sf0Var).f30977a;
                cg0Var.g();
                e00 e00Var = cg0Var.f25219l0;
                if (e00Var != null) {
                    e00Var.d(false, false, false);
                }
            }
            this.d = y3;
        } else if (this.f30533a != 0) {
        } else {
            el0 el0Var = this.e;
            this.f30533a = (int) Math.floor(com.google.android.gms.internal.play_billing.k3.z(x10, el0Var.f25956a, el0Var.f25958c / 5.0f, 1.0f));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        zf0 zf0Var;
        int i10;
        String format;
        TextPaint textPaint = this.f30538r;
        Path path = this.f30539s;
        Paint paint = this.f30537n;
        yf0 yf0Var = this.f30540w;
        el0 el0Var = this.e;
        float f7 = el0Var.f25958c / 5.0f;
        for (int i11 = 0; i11 < 4; i11++) {
            float f10 = el0Var.f25956a;
            float f11 = i11 * f7;
            float f12 = f10 + f7 + f11;
            float f13 = el0Var.f25957b;
            canvas.drawLine(f12, f13, f11 + f10 + f7, f13 + el0Var.d, this.f30536f);
        }
        float f14 = el0Var.f25956a;
        float f15 = el0Var.f25957b;
        canvas.drawLine(f14, f15 + el0Var.d, f14 + el0Var.f25958c, f15, this.h);
        int i12 = yf0Var.f32622f;
        int i13 = 3;
        int i14 = 2;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        zf0Var = null;
                    } else {
                        paint.setColor(-13404165);
                        zf0Var = yf0Var.d;
                    }
                } else {
                    paint.setColor(-15667555);
                    zf0Var = yf0Var.f32621c;
                }
            } else {
                paint.setColor(-1229492);
                zf0Var = yf0Var.f32620b;
            }
        } else {
            paint.setColor(-1);
            zf0Var = yf0Var.f32619a;
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
                                format = String.format(Locale.US, "%.2f", Float.valueOf(zf0Var.e / 100.0f));
                            }
                        } else {
                            i10 = i14;
                            format = String.format(Locale.US, "%.2f", Float.valueOf(zf0Var.d / 100.0f));
                        }
                    } else {
                        i10 = i14;
                        format = String.format(Locale.US, "%.2f", Float.valueOf(zf0Var.f32897c / 100.0f));
                    }
                } else {
                    i10 = i14;
                    format = String.format(Locale.US, "%.2f", Float.valueOf(zf0Var.f32896b / 100.0f));
                }
            } else {
                i10 = i14;
                format = String.format(Locale.US, "%.2f", Float.valueOf(zf0Var.f32895a / 100.0f));
            }
            canvas.drawText(format, (i15 * f7) + com.google.android.gms.internal.play_billing.k3.z(f7, textPaint.measureText(format), 2.0f, el0Var.f25956a), (el0Var.f25957b + el0Var.d) - AndroidUtilities.dp(4.0f), textPaint);
            i15++;
            i14 = i10;
            i13 = 3;
        }
        float[] a2 = zf0Var.a();
        invalidate();
        path.reset();
        for (int i16 = 0; i16 < a2.length / 2; i16++) {
            if (i16 == 0) {
                int i17 = i16 * 2;
                path.moveTo((a2[i17] * el0Var.f25958c) + el0Var.f25956a, ((1.0f - a2[i17 + 1]) * el0Var.d) + el0Var.f25957b);
            } else {
                int i18 = i16 * 2;
                path.lineTo((a2[i18] * el0Var.f25958c) + el0Var.f25956a, ((1.0f - a2[i18 + 1]) * el0Var.d) + el0Var.f25957b);
            }
        }
        canvas.drawPath(path, paint);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tf0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(sf0 sf0Var) {
        this.v = sf0Var;
    }
}
