package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
public final class mf0 extends View {
    public int f26411a;
    public boolean f26412b;
    public boolean f26413c;
    public float d;
    public uk0 e;
    public Paint f26414f;
    public Paint h;
    public Paint f26415n;
    public TextPaint f26416r;
    public Path f26417s;
    public lf0 v;
    public rf0 f26418w;

    public final void a(int i10, MotionEvent motionEvent) {
        sf0 sf0Var;
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        if (i10 != 1) {
            if (i10 != 2) {
                if ((i10 == 3 || i10 == 4 || i10 == 5) && this.f26411a != 0) {
                    this.f26411a = 0;
                    return;
                }
                return;
            }
            float min = Math.min(2.0f, (this.d - y3) / 8.0f);
            rf0 rf0Var = this.f26418w;
            int i11 = rf0Var.f27955f;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            sf0Var = null;
                        } else {
                            sf0Var = rf0Var.d;
                        }
                    } else {
                        sf0Var = rf0Var.f27954c;
                    }
                } else {
                    sf0Var = rf0Var.f27953b;
                }
            } else {
                sf0Var = rf0Var.f27952a;
            }
            int i12 = this.f26411a;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            if (i12 == 5) {
                                sf0Var.e = Math.max(0.0f, Math.min(100.0f, sf0Var.e + min));
                            }
                        } else {
                            sf0Var.d = Math.max(0.0f, Math.min(100.0f, sf0Var.d + min));
                        }
                    } else {
                        sf0Var.f28214c = Math.max(0.0f, Math.min(100.0f, sf0Var.f28214c + min));
                    }
                } else {
                    sf0Var.f28213b = Math.max(0.0f, Math.min(100.0f, sf0Var.f28213b + min));
                }
            } else {
                sf0Var.f28212a = Math.max(0.0f, Math.min(100.0f, sf0Var.f28212a + min));
            }
            invalidate();
            lf0 lf0Var = this.v;
            if (lf0Var != null) {
                vf0 vf0Var = ((nf0) lf0Var).f26759a;
                vf0Var.g();
                xz xzVar = vf0Var.f29070l0;
                if (xzVar != null) {
                    xzVar.e(false, false, false);
                }
            }
            this.d = y3;
        } else if (this.f26411a != 0) {
        } else {
            uk0 uk0Var = this.e;
            this.f26411a = (int) Math.floor(com.google.android.gms.internal.vision.e2.A(x10, uk0Var.f28825a, uk0Var.f28827c / 5.0f, 1.0f));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        sf0 sf0Var;
        String format;
        TextPaint textPaint = this.f26416r;
        Path path = this.f26417s;
        Paint paint = this.f26415n;
        rf0 rf0Var = this.f26418w;
        uk0 uk0Var = this.e;
        float f7 = uk0Var.f28827c / 5.0f;
        for (int i10 = 0; i10 < 4; i10++) {
            float f10 = uk0Var.f28825a;
            float f11 = i10 * f7;
            float f12 = f10 + f7 + f11;
            float f13 = uk0Var.f28826b;
            canvas.drawLine(f12, f13, f11 + f10 + f7, f13 + uk0Var.d, this.f26414f);
        }
        float f14 = uk0Var.f28825a;
        float f15 = uk0Var.f28826b;
        canvas.drawLine(f14, f15 + uk0Var.d, f14 + uk0Var.f28827c, f15, this.h);
        int i11 = rf0Var.f27955f;
        int i12 = 3;
        int i13 = 2;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        sf0Var = null;
                    } else {
                        paint.setColor(-13404165);
                        sf0Var = rf0Var.d;
                    }
                } else {
                    paint.setColor(-15667555);
                    sf0Var = rf0Var.f27954c;
                }
            } else {
                paint.setColor(-1229492);
                sf0Var = rf0Var.f27953b;
            }
        } else {
            paint.setColor(-1);
            sf0Var = rf0Var.f27952a;
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
                                format = String.format(Locale.US, "%.2f", Float.valueOf(sf0Var.e / 100.0f));
                            }
                        } else {
                            format = String.format(Locale.US, "%.2f", Float.valueOf(sf0Var.d / 100.0f));
                        }
                    } else {
                        format = String.format(Locale.US, "%.2f", Float.valueOf(sf0Var.f28214c / 100.0f));
                    }
                } else {
                    format = String.format(Locale.US, "%.2f", Float.valueOf(sf0Var.f28213b / 100.0f));
                }
            } else {
                format = String.format(Locale.US, "%.2f", Float.valueOf(sf0Var.f28212a / 100.0f));
            }
            canvas.drawText(format, (i14 * f7) + com.google.android.gms.internal.vision.e2.A(f7, textPaint.measureText(format), 2.0f, uk0Var.f28825a), (uk0Var.f28826b + uk0Var.d) - AndroidUtilities.dp(4.0f), textPaint);
            i14++;
            i12 = 3;
            i13 = 2;
        }
        float[] a2 = sf0Var.a();
        invalidate();
        path.reset();
        for (int i15 = 0; i15 < a2.length / 2; i15++) {
            if (i15 == 0) {
                int i16 = i15 * 2;
                path.moveTo((a2[i16] * uk0Var.f28827c) + uk0Var.f28825a, ((1.0f - a2[i16 + 1]) * uk0Var.d) + uk0Var.f28826b);
            } else {
                int i17 = i15 * 2;
                path.lineTo((a2[i17] * uk0Var.f28827c) + uk0Var.f28825a, ((1.0f - a2[i17 + 1]) * uk0Var.d) + uk0Var.f28826b);
            }
        }
        canvas.drawPath(path, paint);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mf0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(lf0 lf0Var) {
        this.v = lf0Var;
    }
}
