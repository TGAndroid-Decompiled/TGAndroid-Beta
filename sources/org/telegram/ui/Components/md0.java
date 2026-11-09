package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.Locale;
public final class md0 extends View {
    public int f36070a;
    public boolean f36071b;
    public boolean f36072c;
    public float d;
    public li0 f36073e;
    public Paint f36074f;
    public Paint h;
    public Paint f36075n;
    public TextPaint f36076r;
    public Path f36077s;
    public ld0 f36078w;
    public h2.c f36079x;

    public final void a(int i7, MotionEvent motionEvent) {
        rd0 rd0Var;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (i7 != 1) {
            if (i7 != 2) {
                if ((i7 == 3 || i7 == 4 || i7 == 5) && this.f36070a != 0) {
                    this.f36070a = 0;
                    return;
                }
                return;
            }
            float min = Math.min(2.0f, (this.d - y10) / 8.0f);
            h2.c cVar = this.f36079x;
            int i10 = cVar.f14057a;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            rd0Var = null;
                        } else {
                            rd0Var = (rd0) cVar.f14060e;
                        }
                    } else {
                        rd0Var = (rd0) cVar.d;
                    }
                } else {
                    rd0Var = (rd0) cVar.f14059c;
                }
            } else {
                rd0Var = (rd0) cVar.f14058b;
            }
            int i11 = this.f36070a;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 == 5) {
                                rd0Var.f37680e = org.telegram.messenger.camera.q.z(rd0Var.f37680e, min, 100.0f, 0.0f);
                            }
                        } else {
                            rd0Var.d = org.telegram.messenger.camera.q.z(rd0Var.d, min, 100.0f, 0.0f);
                        }
                    } else {
                        rd0Var.f37679c = org.telegram.messenger.camera.q.z(rd0Var.f37679c, min, 100.0f, 0.0f);
                    }
                } else {
                    rd0Var.f37678b = org.telegram.messenger.camera.q.z(rd0Var.f37678b, min, 100.0f, 0.0f);
                }
            } else {
                rd0Var.f37677a = org.telegram.messenger.camera.q.z(rd0Var.f37677a, min, 100.0f, 0.0f);
            }
            invalidate();
            ld0 ld0Var = this.f36078w;
            if (ld0Var != null) {
                td0 td0Var = ((nd0) ld0Var).f36349a;
                td0Var.d();
                sy syVar = td0Var.f38370l0;
                if (syVar != null) {
                    syVar.c(false, false, false);
                }
            }
            this.d = y10;
        } else if (this.f36070a != 0) {
        } else {
            li0 li0Var = this.f36073e;
            this.f36070a = (int) Math.floor(com.google.android.recaptcha.internal.a.A(x10, li0Var.f35751a, li0Var.f35753c / 5.0f, 1.0f));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        rd0 rd0Var;
        int i7;
        String format;
        TextPaint textPaint = this.f36076r;
        Path path = this.f36077s;
        Paint paint = this.f36075n;
        h2.c cVar = this.f36079x;
        li0 li0Var = this.f36073e;
        float f10 = li0Var.f35753c / 5.0f;
        for (int i10 = 0; i10 < 4; i10++) {
            float f11 = li0Var.f35751a;
            float f12 = i10 * f10;
            float f13 = f11 + f10 + f12;
            float f14 = li0Var.f35752b;
            canvas.drawLine(f13, f14, f12 + f11 + f10, f14 + li0Var.d, this.f36074f);
        }
        float f15 = li0Var.f35751a;
        float f16 = li0Var.f35752b;
        canvas.drawLine(f15, f16 + li0Var.d, f15 + li0Var.f35753c, f16, this.h);
        int i11 = cVar.f14057a;
        int i12 = 3;
        int i13 = 2;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        rd0Var = null;
                    } else {
                        paint.setColor(-13404165);
                        rd0Var = (rd0) cVar.f14060e;
                    }
                } else {
                    paint.setColor(-15667555);
                    rd0Var = (rd0) cVar.d;
                }
            } else {
                paint.setColor(-1229492);
                rd0Var = (rd0) cVar.f14059c;
            }
        } else {
            paint.setColor(-1);
            rd0Var = (rd0) cVar.f14058b;
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
                                format = String.format(Locale.US, "%.2f", Float.valueOf(rd0Var.f37680e / 100.0f));
                            }
                        } else {
                            i7 = i13;
                            format = String.format(Locale.US, "%.2f", Float.valueOf(rd0Var.d / 100.0f));
                        }
                    } else {
                        i7 = i13;
                        format = String.format(Locale.US, "%.2f", Float.valueOf(rd0Var.f37679c / 100.0f));
                    }
                } else {
                    i7 = i13;
                    format = String.format(Locale.US, "%.2f", Float.valueOf(rd0Var.f37678b / 100.0f));
                }
            } else {
                i7 = i13;
                format = String.format(Locale.US, "%.2f", Float.valueOf(rd0Var.f37677a / 100.0f));
            }
            canvas.drawText(format, (i14 * f10) + com.google.android.recaptcha.internal.a.A(f10, textPaint.measureText(format), 2.0f, li0Var.f35751a), (li0Var.f35752b + li0Var.d) - org.telegram.messenger.g0.L(4.0f), textPaint);
            i14++;
            i13 = i7;
            i12 = 3;
        }
        float[] a10 = rd0Var.a();
        invalidate();
        path.reset();
        for (int i15 = 0; i15 < a10.length / 2; i15++) {
            if (i15 == 0) {
                int i16 = i15 * 2;
                path.moveTo((a10[i16] * li0Var.f35753c) + li0Var.f35751a, ((1.0f - a10[i16 + 1]) * li0Var.d) + li0Var.f35752b);
            } else {
                int i17 = i15 * 2;
                path.lineTo((a10[i17] * li0Var.f35753c) + li0Var.f35751a, ((1.0f - a10[i17 + 1]) * li0Var.d) + li0Var.f35752b);
            }
        }
        canvas.drawPath(path, paint);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.md0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(ld0 ld0Var) {
        this.f36078w = ld0Var;
    }
}
