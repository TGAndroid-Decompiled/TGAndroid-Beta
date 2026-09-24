package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
public final class kf0 extends View {
    public int f25757a;
    public boolean f25758b;
    public boolean f25759c;
    public float d;
    public sk0 e;
    public Paint f25760f;
    public Paint h;
    public Paint f25761n;
    public TextPaint f25762r;
    public Path f25763s;
    public jf0 v;
    public pf0 f25764w;

    public final void a(int i10, MotionEvent motionEvent) {
        qf0 qf0Var;
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        if (i10 != 1) {
            if (i10 != 2) {
                if ((i10 == 3 || i10 == 4 || i10 == 5) && this.f25757a != 0) {
                    this.f25757a = 0;
                    return;
                }
                return;
            }
            float min = Math.min(2.0f, (this.d - y3) / 8.0f);
            pf0 pf0Var = this.f25764w;
            int i11 = pf0Var.f27321f;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            qf0Var = null;
                        } else {
                            qf0Var = pf0Var.d;
                        }
                    } else {
                        qf0Var = pf0Var.f27320c;
                    }
                } else {
                    qf0Var = pf0Var.f27319b;
                }
            } else {
                qf0Var = pf0Var.f27318a;
            }
            int i12 = this.f25757a;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            if (i12 == 5) {
                                qf0Var.e = Math.max(0.0f, Math.min(100.0f, qf0Var.e + min));
                            }
                        } else {
                            qf0Var.d = Math.max(0.0f, Math.min(100.0f, qf0Var.d + min));
                        }
                    } else {
                        qf0Var.f27601c = Math.max(0.0f, Math.min(100.0f, qf0Var.f27601c + min));
                    }
                } else {
                    qf0Var.f27600b = Math.max(0.0f, Math.min(100.0f, qf0Var.f27600b + min));
                }
            } else {
                qf0Var.f27599a = Math.max(0.0f, Math.min(100.0f, qf0Var.f27599a + min));
            }
            invalidate();
            jf0 jf0Var = this.v;
            if (jf0Var != null) {
                tf0 tf0Var = ((lf0) jf0Var).f26081a;
                tf0Var.g();
                wz wzVar = tf0Var.f28490l0;
                if (wzVar != null) {
                    wzVar.e(false, false, false);
                }
            }
            this.d = y3;
        } else if (this.f25757a != 0) {
        } else {
            sk0 sk0Var = this.e;
            this.f25757a = (int) Math.floor(com.google.android.gms.internal.vision.e2.A(x10, sk0Var.f28258a, sk0Var.f28260c / 5.0f, 1.0f));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        qf0 qf0Var;
        String format;
        TextPaint textPaint = this.f25762r;
        Path path = this.f25763s;
        Paint paint = this.f25761n;
        pf0 pf0Var = this.f25764w;
        sk0 sk0Var = this.e;
        float f7 = sk0Var.f28260c / 5.0f;
        for (int i10 = 0; i10 < 4; i10++) {
            float f10 = sk0Var.f28258a;
            float f11 = i10 * f7;
            float f12 = f10 + f7 + f11;
            float f13 = sk0Var.f28259b;
            canvas.drawLine(f12, f13, f11 + f10 + f7, f13 + sk0Var.d, this.f25760f);
        }
        float f14 = sk0Var.f28258a;
        float f15 = sk0Var.f28259b;
        canvas.drawLine(f14, f15 + sk0Var.d, f14 + sk0Var.f28260c, f15, this.h);
        int i11 = pf0Var.f27321f;
        int i12 = 3;
        int i13 = 2;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        qf0Var = null;
                    } else {
                        paint.setColor(-13404165);
                        qf0Var = pf0Var.d;
                    }
                } else {
                    paint.setColor(-15667555);
                    qf0Var = pf0Var.f27320c;
                }
            } else {
                paint.setColor(-1229492);
                qf0Var = pf0Var.f27319b;
            }
        } else {
            paint.setColor(-1);
            qf0Var = pf0Var.f27318a;
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
                                format = String.format(Locale.US, "%.2f", Float.valueOf(qf0Var.e / 100.0f));
                            }
                        } else {
                            format = String.format(Locale.US, "%.2f", Float.valueOf(qf0Var.d / 100.0f));
                        }
                    } else {
                        format = String.format(Locale.US, "%.2f", Float.valueOf(qf0Var.f27601c / 100.0f));
                    }
                } else {
                    format = String.format(Locale.US, "%.2f", Float.valueOf(qf0Var.f27600b / 100.0f));
                }
            } else {
                format = String.format(Locale.US, "%.2f", Float.valueOf(qf0Var.f27599a / 100.0f));
            }
            canvas.drawText(format, (i14 * f7) + com.google.android.gms.internal.vision.e2.A(f7, textPaint.measureText(format), 2.0f, sk0Var.f28258a), (sk0Var.f28259b + sk0Var.d) - AndroidUtilities.dp(4.0f), textPaint);
            i14++;
            i12 = 3;
            i13 = 2;
        }
        float[] a2 = qf0Var.a();
        invalidate();
        path.reset();
        for (int i15 = 0; i15 < a2.length / 2; i15++) {
            if (i15 == 0) {
                int i16 = i15 * 2;
                path.moveTo((a2[i16] * sk0Var.f28260c) + sk0Var.f28258a, ((1.0f - a2[i16 + 1]) * sk0Var.d) + sk0Var.f28259b);
            } else {
                int i17 = i15 * 2;
                path.lineTo((a2[i17] * sk0Var.f28260c) + sk0Var.f28258a, ((1.0f - a2[i17 + 1]) * sk0Var.d) + sk0Var.f28259b);
            }
        }
        canvas.drawPath(path, paint);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kf0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(jf0 jf0Var) {
        this.v = jf0Var;
    }
}
