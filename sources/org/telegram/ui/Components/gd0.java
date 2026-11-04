package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.Locale;
public final class gd0 extends View {
    public int f34060a;
    public boolean f34061b;
    public boolean f34062c;
    public float d;
    public ni0 f34063e;
    public Paint f34064f;
    public Paint h;
    public Paint f34065n;
    public TextPaint f34066r;
    public Path f34067s;
    public fd0 f34068w;
    public g2.d f34069x;

    public final void a(int i3, MotionEvent motionEvent) {
        ld0 ld0Var;
        float x10 = motionEvent.getX();
        float y9 = motionEvent.getY();
        if (i3 != 1) {
            if (i3 != 2) {
                if ((i3 == 3 || i3 == 4 || i3 == 5) && this.f34060a != 0) {
                    this.f34060a = 0;
                    return;
                }
                return;
            }
            float min = Math.min(2.0f, (this.d - y9) / 8.0f);
            g2.d dVar = this.f34069x;
            int i10 = dVar.f11818a;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            ld0Var = null;
                        } else {
                            ld0Var = (ld0) dVar.f11821e;
                        }
                    } else {
                        ld0Var = (ld0) dVar.d;
                    }
                } else {
                    ld0Var = (ld0) dVar.f11820c;
                }
            } else {
                ld0Var = (ld0) dVar.f11819b;
            }
            int i11 = this.f34060a;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 == 5) {
                                ld0Var.f35710e = org.telegram.messenger.camera.q.z(ld0Var.f35710e, min, 100.0f, 0.0f);
                            }
                        } else {
                            ld0Var.d = org.telegram.messenger.camera.q.z(ld0Var.d, min, 100.0f, 0.0f);
                        }
                    } else {
                        ld0Var.f35709c = org.telegram.messenger.camera.q.z(ld0Var.f35709c, min, 100.0f, 0.0f);
                    }
                } else {
                    ld0Var.f35708b = org.telegram.messenger.camera.q.z(ld0Var.f35708b, min, 100.0f, 0.0f);
                }
            } else {
                ld0Var.f35707a = org.telegram.messenger.camera.q.z(ld0Var.f35707a, min, 100.0f, 0.0f);
            }
            invalidate();
            fd0 fd0Var = this.f34068w;
            if (fd0Var != null) {
                nd0 nd0Var = ((hd0) fd0Var).f34370a;
                nd0Var.d();
                py pyVar = nd0Var.m0;
                if (pyVar != null) {
                    pyVar.c(false, false, false);
                }
            }
            this.d = y9;
        } else if (this.f34060a != 0) {
        } else {
            ni0 ni0Var = this.f34063e;
            this.f34060a = (int) Math.floor(com.google.android.recaptcha.internal.a.z(x10, ni0Var.f36563a, ni0Var.f36565c / 5.0f, 1.0f));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ld0 ld0Var;
        int i3;
        String format;
        TextPaint textPaint = this.f34066r;
        Path path = this.f34067s;
        Paint paint = this.f34065n;
        g2.d dVar = this.f34069x;
        ni0 ni0Var = this.f34063e;
        float f10 = ni0Var.f36565c / 5.0f;
        for (int i10 = 0; i10 < 4; i10++) {
            float f11 = ni0Var.f36563a;
            float f12 = i10 * f10;
            float f13 = f11 + f10 + f12;
            float f14 = ni0Var.f36564b;
            canvas.drawLine(f13, f14, f12 + f11 + f10, f14 + ni0Var.d, this.f34064f);
        }
        float f15 = ni0Var.f36563a;
        float f16 = ni0Var.f36564b;
        canvas.drawLine(f15, f16 + ni0Var.d, f15 + ni0Var.f36565c, f16, this.h);
        int i11 = dVar.f11818a;
        int i12 = 3;
        int i13 = 2;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        ld0Var = null;
                    } else {
                        paint.setColor(-13404165);
                        ld0Var = (ld0) dVar.f11821e;
                    }
                } else {
                    paint.setColor(-15667555);
                    ld0Var = (ld0) dVar.d;
                }
            } else {
                paint.setColor(-1229492);
                ld0Var = (ld0) dVar.f11820c;
            }
        } else {
            paint.setColor(-1);
            ld0Var = (ld0) dVar.f11819b;
        }
        int i14 = 0;
        while (i14 < 5) {
            if (i14 != 0) {
                if (i14 != 1) {
                    if (i14 != i13) {
                        if (i14 != i12) {
                            if (i14 != 4) {
                                format = "";
                                i3 = i13;
                            } else {
                                i3 = i13;
                                format = String.format(Locale.US, "%.2f", Float.valueOf(ld0Var.f35710e / 100.0f));
                            }
                        } else {
                            i3 = i13;
                            format = String.format(Locale.US, "%.2f", Float.valueOf(ld0Var.d / 100.0f));
                        }
                    } else {
                        i3 = i13;
                        format = String.format(Locale.US, "%.2f", Float.valueOf(ld0Var.f35709c / 100.0f));
                    }
                } else {
                    i3 = i13;
                    format = String.format(Locale.US, "%.2f", Float.valueOf(ld0Var.f35708b / 100.0f));
                }
            } else {
                i3 = i13;
                format = String.format(Locale.US, "%.2f", Float.valueOf(ld0Var.f35707a / 100.0f));
            }
            canvas.drawText(format, (i14 * f10) + com.google.android.recaptcha.internal.a.z(f10, textPaint.measureText(format), 2.0f, ni0Var.f36563a), (ni0Var.f36564b + ni0Var.d) - org.telegram.messenger.g0.L(4.0f), textPaint);
            i14++;
            i13 = i3;
            i12 = 3;
        }
        float[] a10 = ld0Var.a();
        invalidate();
        path.reset();
        for (int i15 = 0; i15 < a10.length / 2; i15++) {
            if (i15 == 0) {
                int i16 = i15 * 2;
                path.moveTo((a10[i16] * ni0Var.f36565c) + ni0Var.f36563a, ((1.0f - a10[i16 + 1]) * ni0Var.d) + ni0Var.f36564b);
            } else {
                int i17 = i15 * 2;
                path.lineTo((a10[i17] * ni0Var.f36565c) + ni0Var.f36563a, ((1.0f - a10[i17 + 1]) * ni0Var.d) + ni0Var.f36564b);
            }
        }
        canvas.drawPath(path, paint);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gd0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(fd0 fd0Var) {
        this.f34068w = fd0Var;
    }
}
