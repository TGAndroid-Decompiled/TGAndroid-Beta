package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
public final class he0 extends View {
    public int f29055a;
    public boolean f29056b;
    public boolean f29057c;
    public float d;
    public wj0 f29058e;
    public Paint f29059f;
    public Paint h;
    public Paint f29060n;
    public TextPaint f29061r;
    public Path f29062s;
    public ge0 v;
    public me0 f29063w;

    public final void a(int i9, MotionEvent motionEvent) {
        ne0 ne0Var;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (i9 != 1) {
            if (i9 != 2) {
                if ((i9 == 3 || i9 == 4 || i9 == 5) && this.f29055a != 0) {
                    this.f29055a = 0;
                    return;
                }
                return;
            }
            float min = Math.min(2.0f, (this.d - y10) / 8.0f);
            me0 me0Var = this.f29063w;
            int i10 = me0Var.f30806f;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            ne0Var = null;
                        } else {
                            ne0Var = me0Var.d;
                        }
                    } else {
                        ne0Var = me0Var.f30804c;
                    }
                } else {
                    ne0Var = me0Var.f30803b;
                }
            } else {
                ne0Var = me0Var.f30802a;
            }
            int i11 = this.f29055a;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 == 5) {
                                ne0Var.f31086e = Math.max(0.0f, Math.min(100.0f, ne0Var.f31086e + min));
                            }
                        } else {
                            ne0Var.d = Math.max(0.0f, Math.min(100.0f, ne0Var.d + min));
                        }
                    } else {
                        ne0Var.f31085c = Math.max(0.0f, Math.min(100.0f, ne0Var.f31085c + min));
                    }
                } else {
                    ne0Var.f31084b = Math.max(0.0f, Math.min(100.0f, ne0Var.f31084b + min));
                }
            } else {
                ne0Var.f31083a = Math.max(0.0f, Math.min(100.0f, ne0Var.f31083a + min));
            }
            invalidate();
            ge0 ge0Var = this.v;
            if (ge0Var != null) {
                qe0 qe0Var = ((ie0) ge0Var).f29422a;
                qe0Var.g();
                hz hzVar = qe0Var.f31902h0;
                if (hzVar != null) {
                    hzVar.e(false, false, false);
                }
            }
            this.d = y10;
        } else if (this.f29055a != 0) {
        } else {
            wj0 wj0Var = this.f29058e;
            this.f29055a = (int) Math.floor(e2.c.A(x10, wj0Var.f34233a, wj0Var.f34235c / 5.0f, 1.0f));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ne0 ne0Var;
        String format;
        TextPaint textPaint = this.f29061r;
        Path path = this.f29062s;
        Paint paint = this.f29060n;
        me0 me0Var = this.f29063w;
        wj0 wj0Var = this.f29058e;
        float f10 = wj0Var.f34235c / 5.0f;
        for (int i9 = 0; i9 < 4; i9++) {
            float f11 = wj0Var.f34233a;
            float f12 = i9 * f10;
            float f13 = f11 + f10 + f12;
            float f14 = wj0Var.f34234b;
            canvas.drawLine(f13, f14, f12 + f11 + f10, f14 + wj0Var.d, this.f29059f);
        }
        float f15 = wj0Var.f34233a;
        float f16 = wj0Var.f34234b;
        canvas.drawLine(f15, f16 + wj0Var.d, f15 + wj0Var.f34235c, f16, this.h);
        int i10 = me0Var.f30806f;
        int i11 = 3;
        int i12 = 2;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        ne0Var = null;
                    } else {
                        paint.setColor(-13404165);
                        ne0Var = me0Var.d;
                    }
                } else {
                    paint.setColor(-15667555);
                    ne0Var = me0Var.f30804c;
                }
            } else {
                paint.setColor(-1229492);
                ne0Var = me0Var.f30803b;
            }
        } else {
            paint.setColor(-1);
            ne0Var = me0Var.f30802a;
        }
        int i13 = 0;
        while (i13 < 5) {
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != i12) {
                        if (i13 != i11) {
                            if (i13 != 4) {
                                format = "";
                            } else {
                                format = String.format(Locale.US, "%.2f", Float.valueOf(ne0Var.f31086e / 100.0f));
                            }
                        } else {
                            format = String.format(Locale.US, "%.2f", Float.valueOf(ne0Var.d / 100.0f));
                        }
                    } else {
                        format = String.format(Locale.US, "%.2f", Float.valueOf(ne0Var.f31085c / 100.0f));
                    }
                } else {
                    format = String.format(Locale.US, "%.2f", Float.valueOf(ne0Var.f31084b / 100.0f));
                }
            } else {
                format = String.format(Locale.US, "%.2f", Float.valueOf(ne0Var.f31083a / 100.0f));
            }
            canvas.drawText(format, (i13 * f10) + e2.c.A(f10, textPaint.measureText(format), 2.0f, wj0Var.f34233a), (wj0Var.f34234b + wj0Var.d) - AndroidUtilities.dp(4.0f), textPaint);
            i13++;
            i11 = 3;
            i12 = 2;
        }
        float[] a2 = ne0Var.a();
        invalidate();
        path.reset();
        for (int i14 = 0; i14 < a2.length / 2; i14++) {
            if (i14 == 0) {
                int i15 = i14 * 2;
                path.moveTo((a2[i15] * wj0Var.f34235c) + wj0Var.f34233a, ((1.0f - a2[i15 + 1]) * wj0Var.d) + wj0Var.f34234b);
            } else {
                int i16 = i14 * 2;
                path.lineTo((a2[i16] * wj0Var.f34235c) + wj0Var.f34233a, ((1.0f - a2[i16 + 1]) * wj0Var.d) + wj0Var.f34234b);
            }
        }
        canvas.drawPath(path, paint);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.he0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(ge0 ge0Var) {
        this.v = ge0Var;
    }
}
