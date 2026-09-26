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
    public int f26068a;
    public boolean f26069b;
    public boolean f26070c;
    public float d;
    public tk0 e;
    public Paint f26071f;
    public Paint h;
    public Paint f26072n;
    public TextPaint f26073r;
    public Path f26074s;
    public kf0 v;
    public qf0 f26075w;

    public final void a(int i10, MotionEvent motionEvent) {
        rf0 rf0Var;
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        if (i10 != 1) {
            if (i10 != 2) {
                if ((i10 == 3 || i10 == 4 || i10 == 5) && this.f26068a != 0) {
                    this.f26068a = 0;
                    return;
                }
                return;
            }
            float min = Math.min(2.0f, (this.d - y3) / 8.0f);
            qf0 qf0Var = this.f26075w;
            int i11 = qf0Var.f27666f;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            rf0Var = null;
                        } else {
                            rf0Var = qf0Var.d;
                        }
                    } else {
                        rf0Var = qf0Var.f27665c;
                    }
                } else {
                    rf0Var = qf0Var.f27664b;
                }
            } else {
                rf0Var = qf0Var.f27663a;
            }
            int i12 = this.f26068a;
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
                        rf0Var.f27905c = Math.max(0.0f, Math.min(100.0f, rf0Var.f27905c + min));
                    }
                } else {
                    rf0Var.f27904b = Math.max(0.0f, Math.min(100.0f, rf0Var.f27904b + min));
                }
            } else {
                rf0Var.f27903a = Math.max(0.0f, Math.min(100.0f, rf0Var.f27903a + min));
            }
            invalidate();
            kf0 kf0Var = this.v;
            if (kf0Var != null) {
                uf0 uf0Var = ((mf0) kf0Var).f26396a;
                uf0Var.g();
                xz xzVar = uf0Var.f28785l0;
                if (xzVar != null) {
                    xzVar.e(false, false, false);
                }
            }
            this.d = y3;
        } else if (this.f26068a != 0) {
        } else {
            tk0 tk0Var = this.e;
            this.f26068a = (int) Math.floor(com.google.android.gms.internal.vision.e2.A(x10, tk0Var.f28551a, tk0Var.f28553c / 5.0f, 1.0f));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        rf0 rf0Var;
        String format;
        TextPaint textPaint = this.f26073r;
        Path path = this.f26074s;
        Paint paint = this.f26072n;
        qf0 qf0Var = this.f26075w;
        tk0 tk0Var = this.e;
        float f7 = tk0Var.f28553c / 5.0f;
        for (int i10 = 0; i10 < 4; i10++) {
            float f10 = tk0Var.f28551a;
            float f11 = i10 * f7;
            float f12 = f10 + f7 + f11;
            float f13 = tk0Var.f28552b;
            canvas.drawLine(f12, f13, f11 + f10 + f7, f13 + tk0Var.d, this.f26071f);
        }
        float f14 = tk0Var.f28551a;
        float f15 = tk0Var.f28552b;
        canvas.drawLine(f14, f15 + tk0Var.d, f14 + tk0Var.f28553c, f15, this.h);
        int i11 = qf0Var.f27666f;
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
                    rf0Var = qf0Var.f27665c;
                }
            } else {
                paint.setColor(-1229492);
                rf0Var = qf0Var.f27664b;
            }
        } else {
            paint.setColor(-1);
            rf0Var = qf0Var.f27663a;
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
                        format = String.format(Locale.US, "%.2f", Float.valueOf(rf0Var.f27905c / 100.0f));
                    }
                } else {
                    format = String.format(Locale.US, "%.2f", Float.valueOf(rf0Var.f27904b / 100.0f));
                }
            } else {
                format = String.format(Locale.US, "%.2f", Float.valueOf(rf0Var.f27903a / 100.0f));
            }
            canvas.drawText(format, (i14 * f7) + com.google.android.gms.internal.vision.e2.A(f7, textPaint.measureText(format), 2.0f, tk0Var.f28551a), (tk0Var.f28552b + tk0Var.d) - AndroidUtilities.dp(4.0f), textPaint);
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
                path.moveTo((a2[i16] * tk0Var.f28553c) + tk0Var.f28551a, ((1.0f - a2[i16 + 1]) * tk0Var.d) + tk0Var.f28552b);
            } else {
                int i17 = i15 * 2;
                path.lineTo((a2[i17] * tk0Var.f28553c) + tk0Var.f28551a, ((1.0f - a2[i17 + 1]) * tk0Var.d) + tk0Var.f28552b);
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
