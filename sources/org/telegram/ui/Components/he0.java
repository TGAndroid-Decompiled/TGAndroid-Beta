package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.Locale;
public final class he0 extends View {
    public int f26768a;
    public boolean f26769b;
    public boolean f26770c;
    public float d;
    public pj0 e;
    public Paint f26771f;
    public Paint h;
    public Paint f26772n;
    public TextPaint f26773r;
    public Path f26774s;
    public ge0 f26775w;
    public e2.c f26776x;

    public final void a(int i10, MotionEvent motionEvent) {
        me0 me0Var;
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        if (i10 != 1) {
            if (i10 != 2) {
                if ((i10 == 3 || i10 == 4 || i10 == 5) && this.f26768a != 0) {
                    this.f26768a = 0;
                    return;
                }
                return;
            }
            float min = Math.min(2.0f, (this.d - y3) / 8.0f);
            e2.c cVar = this.f26776x;
            int i11 = cVar.f6116a;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            me0Var = null;
                        } else {
                            me0Var = (me0) cVar.e;
                        }
                    } else {
                        me0Var = (me0) cVar.d;
                    }
                } else {
                    me0Var = (me0) cVar.f6118c;
                }
            } else {
                me0Var = (me0) cVar.f6117b;
            }
            int i12 = this.f26768a;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            if (i12 == 5) {
                                me0Var.e = org.telegram.messenger.a30.z(me0Var.e, min, 100.0f, 0.0f);
                            }
                        } else {
                            me0Var.d = org.telegram.messenger.a30.z(me0Var.d, min, 100.0f, 0.0f);
                        }
                    } else {
                        me0Var.f28465c = org.telegram.messenger.a30.z(me0Var.f28465c, min, 100.0f, 0.0f);
                    }
                } else {
                    me0Var.f28464b = org.telegram.messenger.a30.z(me0Var.f28464b, min, 100.0f, 0.0f);
                }
            } else {
                me0Var.f28463a = org.telegram.messenger.a30.z(me0Var.f28463a, min, 100.0f, 0.0f);
            }
            invalidate();
            ge0 ge0Var = this.f26775w;
            if (ge0Var != null) {
                oe0 oe0Var = ((ie0) ge0Var).f27087a;
                oe0Var.f();
                gz gzVar = oe0Var.f29112l0;
                if (gzVar != null) {
                    gzVar.c(false, false, false);
                }
            }
            this.d = y3;
        } else if (this.f26768a != 0) {
        } else {
            pj0 pj0Var = this.e;
            this.f26768a = (int) Math.floor(c3.i0.B(x10, pj0Var.f29439a, pj0Var.f29441c / 5.0f, 1.0f));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        me0 me0Var;
        int i10;
        String format;
        TextPaint textPaint = this.f26773r;
        Path path = this.f26774s;
        Paint paint = this.f26772n;
        e2.c cVar = this.f26776x;
        pj0 pj0Var = this.e;
        float f7 = pj0Var.f29441c / 5.0f;
        for (int i11 = 0; i11 < 4; i11++) {
            float f10 = pj0Var.f29439a;
            float f11 = i11 * f7;
            float f12 = f10 + f7 + f11;
            float f13 = pj0Var.f29440b;
            canvas.drawLine(f12, f13, f11 + f10 + f7, f13 + pj0Var.d, this.f26771f);
        }
        float f14 = pj0Var.f29439a;
        float f15 = pj0Var.f29440b;
        canvas.drawLine(f14, f15 + pj0Var.d, f14 + pj0Var.f29441c, f15, this.h);
        int i12 = cVar.f6116a;
        int i13 = 3;
        int i14 = 2;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        me0Var = null;
                    } else {
                        paint.setColor(-13404165);
                        me0Var = (me0) cVar.e;
                    }
                } else {
                    paint.setColor(-15667555);
                    me0Var = (me0) cVar.d;
                }
            } else {
                paint.setColor(-1229492);
                me0Var = (me0) cVar.f6118c;
            }
        } else {
            paint.setColor(-1);
            me0Var = (me0) cVar.f6117b;
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
                                format = String.format(Locale.US, "%.2f", Float.valueOf(me0Var.e / 100.0f));
                            }
                        } else {
                            i10 = i14;
                            format = String.format(Locale.US, "%.2f", Float.valueOf(me0Var.d / 100.0f));
                        }
                    } else {
                        i10 = i14;
                        format = String.format(Locale.US, "%.2f", Float.valueOf(me0Var.f28465c / 100.0f));
                    }
                } else {
                    i10 = i14;
                    format = String.format(Locale.US, "%.2f", Float.valueOf(me0Var.f28464b / 100.0f));
                }
            } else {
                i10 = i14;
                format = String.format(Locale.US, "%.2f", Float.valueOf(me0Var.f28463a / 100.0f));
            }
            canvas.drawText(format, (i15 * f7) + c3.i0.B(f7, textPaint.measureText(format), 2.0f, pj0Var.f29439a), (pj0Var.f29440b + pj0Var.d) - org.telegram.messenger.i0.L(4.0f), textPaint);
            i15++;
            i14 = i10;
            i13 = 3;
        }
        float[] a2 = me0Var.a();
        invalidate();
        path.reset();
        for (int i16 = 0; i16 < a2.length / 2; i16++) {
            if (i16 == 0) {
                int i17 = i16 * 2;
                path.moveTo((a2[i17] * pj0Var.f29441c) + pj0Var.f29439a, ((1.0f - a2[i17 + 1]) * pj0Var.d) + pj0Var.f29440b);
            } else {
                int i18 = i16 * 2;
                path.lineTo((a2[i18] * pj0Var.f29441c) + pj0Var.f29439a, ((1.0f - a2[i18 + 1]) * pj0Var.d) + pj0Var.f29440b);
            }
        }
        canvas.drawPath(path, paint);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.he0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(ge0 ge0Var) {
        this.f26775w = ge0Var;
    }
}
