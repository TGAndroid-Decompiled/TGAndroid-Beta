package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
public final class gf0 extends View {
    public int f27173a;
    public boolean f27174b;
    public boolean f27175c;
    public float d;
    public tk0 f27176e;
    public Paint f27177f;
    public Paint h;
    public Paint f27178n;
    public TextPaint f27179r;
    public Path f27180s;
    public ff0 v;
    public lf0 f27181w;

    public final void a(int i10, MotionEvent motionEvent) {
        mf0 mf0Var;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (i10 != 1) {
            if (i10 != 2) {
                if ((i10 == 3 || i10 == 4 || i10 == 5) && this.f27173a != 0) {
                    this.f27173a = 0;
                    return;
                }
                return;
            }
            float min = Math.min(2.0f, (this.d - y10) / 8.0f);
            lf0 lf0Var = this.f27181w;
            int i11 = lf0Var.f28710f;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            mf0Var = null;
                        } else {
                            mf0Var = lf0Var.d;
                        }
                    } else {
                        mf0Var = lf0Var.f28708c;
                    }
                } else {
                    mf0Var = lf0Var.f28707b;
                }
            } else {
                mf0Var = lf0Var.f28706a;
            }
            int i12 = this.f27173a;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            if (i12 == 5) {
                                mf0Var.f29022e = Math.max(0.0f, Math.min(100.0f, mf0Var.f29022e + min));
                            }
                        } else {
                            mf0Var.d = Math.max(0.0f, Math.min(100.0f, mf0Var.d + min));
                        }
                    } else {
                        mf0Var.f29021c = Math.max(0.0f, Math.min(100.0f, mf0Var.f29021c + min));
                    }
                } else {
                    mf0Var.f29020b = Math.max(0.0f, Math.min(100.0f, mf0Var.f29020b + min));
                }
            } else {
                mf0Var.f29019a = Math.max(0.0f, Math.min(100.0f, mf0Var.f29019a + min));
            }
            invalidate();
            ff0 ff0Var = this.v;
            if (ff0Var != null) {
                pf0 pf0Var = ((hf0) ff0Var).f27482a;
                pf0Var.g();
                xz xzVar = pf0Var.f30047i0;
                if (xzVar != null) {
                    xzVar.e(false, false, false);
                }
            }
            this.d = y10;
        } else if (this.f27173a != 0) {
        } else {
            tk0 tk0Var = this.f27176e;
            this.f27173a = (int) Math.floor(e2.c.x(x10, tk0Var.f31355a, tk0Var.f31357c / 5.0f, 1.0f));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        mf0 mf0Var;
        String format;
        TextPaint textPaint = this.f27179r;
        Path path = this.f27180s;
        Paint paint = this.f27178n;
        lf0 lf0Var = this.f27181w;
        tk0 tk0Var = this.f27176e;
        float f10 = tk0Var.f31357c / 5.0f;
        for (int i10 = 0; i10 < 4; i10++) {
            float f11 = tk0Var.f31355a;
            float f12 = i10 * f10;
            float f13 = f11 + f10 + f12;
            float f14 = tk0Var.f31356b;
            canvas.drawLine(f13, f14, f12 + f11 + f10, f14 + tk0Var.d, this.f27177f);
        }
        float f15 = tk0Var.f31355a;
        float f16 = tk0Var.f31356b;
        canvas.drawLine(f15, f16 + tk0Var.d, f15 + tk0Var.f31357c, f16, this.h);
        int i11 = lf0Var.f28710f;
        int i12 = 3;
        int i13 = 2;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        mf0Var = null;
                    } else {
                        paint.setColor(-13404165);
                        mf0Var = lf0Var.d;
                    }
                } else {
                    paint.setColor(-15667555);
                    mf0Var = lf0Var.f28708c;
                }
            } else {
                paint.setColor(-1229492);
                mf0Var = lf0Var.f28707b;
            }
        } else {
            paint.setColor(-1);
            mf0Var = lf0Var.f28706a;
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
                                format = String.format(Locale.US, "%.2f", Float.valueOf(mf0Var.f29022e / 100.0f));
                            }
                        } else {
                            format = String.format(Locale.US, "%.2f", Float.valueOf(mf0Var.d / 100.0f));
                        }
                    } else {
                        format = String.format(Locale.US, "%.2f", Float.valueOf(mf0Var.f29021c / 100.0f));
                    }
                } else {
                    format = String.format(Locale.US, "%.2f", Float.valueOf(mf0Var.f29020b / 100.0f));
                }
            } else {
                format = String.format(Locale.US, "%.2f", Float.valueOf(mf0Var.f29019a / 100.0f));
            }
            canvas.drawText(format, (i14 * f10) + e2.c.x(f10, textPaint.measureText(format), 2.0f, tk0Var.f31355a), (tk0Var.f31356b + tk0Var.d) - AndroidUtilities.dp(4.0f), textPaint);
            i14++;
            i12 = 3;
            i13 = 2;
        }
        float[] a2 = mf0Var.a();
        invalidate();
        path.reset();
        for (int i15 = 0; i15 < a2.length / 2; i15++) {
            if (i15 == 0) {
                int i16 = i15 * 2;
                path.moveTo((a2[i16] * tk0Var.f31357c) + tk0Var.f31355a, ((1.0f - a2[i16 + 1]) * tk0Var.d) + tk0Var.f31356b);
            } else {
                int i17 = i15 * 2;
                path.lineTo((a2[i17] * tk0Var.f31357c) + tk0Var.f31355a, ((1.0f - a2[i17 + 1]) * tk0Var.d) + tk0Var.f31356b);
            }
        }
        canvas.drawPath(path, paint);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gf0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(ff0 ff0Var) {
        this.v = ff0Var;
    }
}
