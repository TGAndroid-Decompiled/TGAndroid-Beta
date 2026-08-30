package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
public final class ef0 extends View {
    public int f24563a;
    public boolean f24564b;
    public boolean f24565c;
    public float d;
    public sk0 e;
    public Paint f24566f;
    public Paint h;
    public Paint f24567n;
    public TextPaint f24568r;
    public Path f24569s;
    public df0 v;
    public jf0 f24570w;

    public final void a(int i10, MotionEvent motionEvent) {
        kf0 kf0Var;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (i10 != 1) {
            if (i10 != 2) {
                if ((i10 == 3 || i10 == 4 || i10 == 5) && this.f24563a != 0) {
                    this.f24563a = 0;
                    return;
                }
                return;
            }
            float min = Math.min(2.0f, (this.d - y10) / 8.0f);
            jf0 jf0Var = this.f24570w;
            int i11 = jf0Var.f25972f;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            kf0Var = null;
                        } else {
                            kf0Var = jf0Var.d;
                        }
                    } else {
                        kf0Var = jf0Var.f25971c;
                    }
                } else {
                    kf0Var = jf0Var.f25970b;
                }
            } else {
                kf0Var = jf0Var.f25969a;
            }
            int i12 = this.f24563a;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            if (i12 == 5) {
                                kf0Var.e = Math.max(0.0f, Math.min(100.0f, kf0Var.e + min));
                            }
                        } else {
                            kf0Var.d = Math.max(0.0f, Math.min(100.0f, kf0Var.d + min));
                        }
                    } else {
                        kf0Var.f26262c = Math.max(0.0f, Math.min(100.0f, kf0Var.f26262c + min));
                    }
                } else {
                    kf0Var.f26261b = Math.max(0.0f, Math.min(100.0f, kf0Var.f26261b + min));
                }
            } else {
                kf0Var.f26260a = Math.max(0.0f, Math.min(100.0f, kf0Var.f26260a + min));
            }
            invalidate();
            df0 df0Var = this.v;
            if (df0Var != null) {
                nf0 nf0Var = ((ff0) df0Var).f24871a;
                nf0Var.g();
                vz vzVar = nf0Var.f27248i0;
                if (vzVar != null) {
                    vzVar.e(false, false, false);
                }
            }
            this.d = y10;
        } else if (this.f24563a != 0) {
        } else {
            sk0 sk0Var = this.e;
            this.f24563a = (int) Math.floor(e2.c.x(x10, sk0Var.f28722a, sk0Var.f28724c / 5.0f, 1.0f));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        kf0 kf0Var;
        String format;
        TextPaint textPaint = this.f24568r;
        Path path = this.f24569s;
        Paint paint = this.f24567n;
        jf0 jf0Var = this.f24570w;
        sk0 sk0Var = this.e;
        float f10 = sk0Var.f28724c / 5.0f;
        for (int i10 = 0; i10 < 4; i10++) {
            float f11 = sk0Var.f28722a;
            float f12 = i10 * f10;
            float f13 = f11 + f10 + f12;
            float f14 = sk0Var.f28723b;
            canvas.drawLine(f13, f14, f12 + f11 + f10, f14 + sk0Var.d, this.f24566f);
        }
        float f15 = sk0Var.f28722a;
        float f16 = sk0Var.f28723b;
        canvas.drawLine(f15, f16 + sk0Var.d, f15 + sk0Var.f28724c, f16, this.h);
        int i11 = jf0Var.f25972f;
        int i12 = 3;
        int i13 = 2;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        kf0Var = null;
                    } else {
                        paint.setColor(-13404165);
                        kf0Var = jf0Var.d;
                    }
                } else {
                    paint.setColor(-15667555);
                    kf0Var = jf0Var.f25971c;
                }
            } else {
                paint.setColor(-1229492);
                kf0Var = jf0Var.f25970b;
            }
        } else {
            paint.setColor(-1);
            kf0Var = jf0Var.f25969a;
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
                                format = String.format(Locale.US, "%.2f", Float.valueOf(kf0Var.e / 100.0f));
                            }
                        } else {
                            format = String.format(Locale.US, "%.2f", Float.valueOf(kf0Var.d / 100.0f));
                        }
                    } else {
                        format = String.format(Locale.US, "%.2f", Float.valueOf(kf0Var.f26262c / 100.0f));
                    }
                } else {
                    format = String.format(Locale.US, "%.2f", Float.valueOf(kf0Var.f26261b / 100.0f));
                }
            } else {
                format = String.format(Locale.US, "%.2f", Float.valueOf(kf0Var.f26260a / 100.0f));
            }
            canvas.drawText(format, (i14 * f10) + e2.c.x(f10, textPaint.measureText(format), 2.0f, sk0Var.f28722a), (sk0Var.f28723b + sk0Var.d) - AndroidUtilities.dp(4.0f), textPaint);
            i14++;
            i12 = 3;
            i13 = 2;
        }
        float[] a2 = kf0Var.a();
        invalidate();
        path.reset();
        for (int i15 = 0; i15 < a2.length / 2; i15++) {
            if (i15 == 0) {
                int i16 = i15 * 2;
                path.moveTo((a2[i16] * sk0Var.f28724c) + sk0Var.f28722a, ((1.0f - a2[i16 + 1]) * sk0Var.d) + sk0Var.f28723b);
            } else {
                int i17 = i15 * 2;
                path.lineTo((a2[i17] * sk0Var.f28724c) + sk0Var.f28722a, ((1.0f - a2[i17 + 1]) * sk0Var.d) + sk0Var.f28723b);
            }
        }
        canvas.drawPath(path, paint);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ef0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(df0 df0Var) {
        this.v = df0Var;
    }
}
