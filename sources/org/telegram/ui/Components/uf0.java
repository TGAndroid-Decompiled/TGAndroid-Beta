package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
public final class uf0 extends View {
    public int f33385a;
    public boolean f33386b;
    public boolean f33387c;
    public float d;
    public hl0 e;
    public Paint f33388f;
    public Paint h;
    public Paint f33389n;
    public TextPaint f33390r;
    public Path f33391s;
    public tf0 v;
    public ag0 f33392w;

    public final void a(int i10, MotionEvent motionEvent) {
        bg0 bg0Var;
        float x9 = motionEvent.getX();
        float y3 = motionEvent.getY();
        if (i10 != 1) {
            if (i10 != 2) {
                if ((i10 == 3 || i10 == 4 || i10 == 5) && this.f33385a != 0) {
                    this.f33385a = 0;
                    return;
                }
                return;
            }
            float min = Math.min(2.0f, (this.d - y3) / 8.0f);
            ag0 ag0Var = this.f33392w;
            int i11 = ag0Var.f26500f;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            bg0Var = null;
                        } else {
                            bg0Var = ag0Var.d;
                        }
                    } else {
                        bg0Var = ag0Var.f26499c;
                    }
                } else {
                    bg0Var = ag0Var.f26498b;
                }
            } else {
                bg0Var = ag0Var.f26497a;
            }
            int i12 = this.f33385a;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            if (i12 == 5) {
                                bg0Var.e = org.telegram.messenger.vh.A(bg0Var.e, min, 100.0f, 0.0f);
                            }
                        } else {
                            bg0Var.d = org.telegram.messenger.vh.A(bg0Var.d, min, 100.0f, 0.0f);
                        }
                    } else {
                        bg0Var.f26850c = org.telegram.messenger.vh.A(bg0Var.f26850c, min, 100.0f, 0.0f);
                    }
                } else {
                    bg0Var.f26849b = org.telegram.messenger.vh.A(bg0Var.f26849b, min, 100.0f, 0.0f);
                }
            } else {
                bg0Var.f26848a = org.telegram.messenger.vh.A(bg0Var.f26848a, min, 100.0f, 0.0f);
            }
            invalidate();
            tf0 tf0Var = this.v;
            if (tf0Var != null) {
                eg0 eg0Var = ((vf0) tf0Var).f33642a;
                eg0Var.g();
                e00 e00Var = eg0Var.f27841l0;
                if (e00Var != null) {
                    e00Var.d(false, false, false);
                }
            }
            this.d = y3;
        } else if (this.f33385a != 0) {
        } else {
            hl0 hl0Var = this.e;
            this.f33385a = (int) Math.floor(c3.h0.B(x9, hl0Var.f29007a, hl0Var.f29009c / 5.0f, 1.0f));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        bg0 bg0Var;
        int i10;
        String format;
        TextPaint textPaint = this.f33390r;
        Path path = this.f33391s;
        Paint paint = this.f33389n;
        ag0 ag0Var = this.f33392w;
        hl0 hl0Var = this.e;
        float f7 = hl0Var.f29009c / 5.0f;
        for (int i11 = 0; i11 < 4; i11++) {
            float f10 = hl0Var.f29007a;
            float f11 = i11 * f7;
            float f12 = f10 + f7 + f11;
            float f13 = hl0Var.f29008b;
            canvas.drawLine(f12, f13, f11 + f10 + f7, f13 + hl0Var.d, this.f33388f);
        }
        float f14 = hl0Var.f29007a;
        float f15 = hl0Var.f29008b;
        canvas.drawLine(f14, f15 + hl0Var.d, f14 + hl0Var.f29009c, f15, this.h);
        int i12 = ag0Var.f26500f;
        int i13 = 3;
        int i14 = 2;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        bg0Var = null;
                    } else {
                        paint.setColor(-13404165);
                        bg0Var = ag0Var.d;
                    }
                } else {
                    paint.setColor(-15667555);
                    bg0Var = ag0Var.f26499c;
                }
            } else {
                paint.setColor(-1229492);
                bg0Var = ag0Var.f26498b;
            }
        } else {
            paint.setColor(-1);
            bg0Var = ag0Var.f26497a;
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
                                format = String.format(Locale.US, "%.2f", Float.valueOf(bg0Var.e / 100.0f));
                            }
                        } else {
                            i10 = i14;
                            format = String.format(Locale.US, "%.2f", Float.valueOf(bg0Var.d / 100.0f));
                        }
                    } else {
                        i10 = i14;
                        format = String.format(Locale.US, "%.2f", Float.valueOf(bg0Var.f26850c / 100.0f));
                    }
                } else {
                    i10 = i14;
                    format = String.format(Locale.US, "%.2f", Float.valueOf(bg0Var.f26849b / 100.0f));
                }
            } else {
                i10 = i14;
                format = String.format(Locale.US, "%.2f", Float.valueOf(bg0Var.f26848a / 100.0f));
            }
            canvas.drawText(format, (i15 * f7) + c3.h0.B(f7, textPaint.measureText(format), 2.0f, hl0Var.f29007a), (hl0Var.f29008b + hl0Var.d) - AndroidUtilities.dp(4.0f), textPaint);
            i15++;
            i14 = i10;
            i13 = 3;
        }
        float[] a2 = bg0Var.a();
        invalidate();
        path.reset();
        for (int i16 = 0; i16 < a2.length / 2; i16++) {
            if (i16 == 0) {
                int i17 = i16 * 2;
                path.moveTo((a2[i17] * hl0Var.f29009c) + hl0Var.f29007a, ((1.0f - a2[i17 + 1]) * hl0Var.d) + hl0Var.f29008b);
            } else {
                int i18 = i16 * 2;
                path.lineTo((a2[i18] * hl0Var.f29009c) + hl0Var.f29007a, ((1.0f - a2[i18 + 1]) * hl0Var.d) + hl0Var.f29008b);
            }
        }
        canvas.drawPath(path, paint);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.uf0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(tf0 tf0Var) {
        this.v = tf0Var;
    }
}
