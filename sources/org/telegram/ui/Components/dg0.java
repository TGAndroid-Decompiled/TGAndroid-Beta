package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
public final class dg0 extends View {
    public int f25592a;
    public boolean f25593b;
    public boolean f25594c;
    public float d;
    public ol0 f25595e;
    public Paint f25596f;
    public Paint h;
    public Paint f25597n;
    public TextPaint f25598r;
    public Path f25599s;
    public cg0 v;
    public ig0 f25600w;

    public final void a(int i10, MotionEvent motionEvent) {
        jg0 jg0Var;
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        if (i10 != 1) {
            if (i10 != 2) {
                if ((i10 == 3 || i10 == 4 || i10 == 5) && this.f25592a != 0) {
                    this.f25592a = 0;
                    return;
                }
                return;
            }
            float min = Math.min(2.0f, (this.d - y3) / 8.0f);
            ig0 ig0Var = this.f25600w;
            int i11 = ig0Var.f27319f;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            jg0Var = null;
                        } else {
                            jg0Var = ig0Var.d;
                        }
                    } else {
                        jg0Var = ig0Var.f27317c;
                    }
                } else {
                    jg0Var = ig0Var.f27316b;
                }
            } else {
                jg0Var = ig0Var.f27315a;
            }
            int i12 = this.f25592a;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            if (i12 == 5) {
                                jg0Var.f27683e = Math.max(0.0f, Math.min(100.0f, jg0Var.f27683e + min));
                            }
                        } else {
                            jg0Var.d = Math.max(0.0f, Math.min(100.0f, jg0Var.d + min));
                        }
                    } else {
                        jg0Var.f27682c = Math.max(0.0f, Math.min(100.0f, jg0Var.f27682c + min));
                    }
                } else {
                    jg0Var.f27681b = Math.max(0.0f, Math.min(100.0f, jg0Var.f27681b + min));
                }
            } else {
                jg0Var.f27680a = Math.max(0.0f, Math.min(100.0f, jg0Var.f27680a + min));
            }
            invalidate();
            cg0 cg0Var = this.v;
            if (cg0Var != null) {
                mg0 mg0Var = ((eg0) cg0Var).f26009a;
                mg0Var.g();
                m00 m00Var = mg0Var.f28685l0;
                if (m00Var != null) {
                    m00Var.e(false, false, false);
                }
            }
            this.d = y3;
        } else if (this.f25592a != 0) {
        } else {
            ol0 ol0Var = this.f25595e;
            this.f25592a = (int) Math.floor(com.google.android.gms.internal.vision.e2.z(x10, ol0Var.f29425a, ol0Var.f29427c / 5.0f, 1.0f));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        jg0 jg0Var;
        int i10;
        String format;
        TextPaint textPaint = this.f25598r;
        Path path = this.f25599s;
        Paint paint = this.f25597n;
        ig0 ig0Var = this.f25600w;
        ol0 ol0Var = this.f25595e;
        float f7 = ol0Var.f29427c / 5.0f;
        for (int i11 = 0; i11 < 4; i11++) {
            float f10 = ol0Var.f29425a;
            float f11 = i11 * f7;
            float f12 = f10 + f7 + f11;
            float f13 = ol0Var.f29426b;
            canvas.drawLine(f12, f13, f11 + f10 + f7, f13 + ol0Var.d, this.f25596f);
        }
        float f14 = ol0Var.f29425a;
        float f15 = ol0Var.f29426b;
        canvas.drawLine(f14, f15 + ol0Var.d, f14 + ol0Var.f29427c, f15, this.h);
        int i12 = ig0Var.f27319f;
        int i13 = 3;
        int i14 = 2;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        jg0Var = null;
                    } else {
                        paint.setColor(-13404165);
                        jg0Var = ig0Var.d;
                    }
                } else {
                    paint.setColor(-15667555);
                    jg0Var = ig0Var.f27317c;
                }
            } else {
                paint.setColor(-1229492);
                jg0Var = ig0Var.f27316b;
            }
        } else {
            paint.setColor(-1);
            jg0Var = ig0Var.f27315a;
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
                                format = String.format(Locale.US, "%.2f", Float.valueOf(jg0Var.f27683e / 100.0f));
                            }
                        } else {
                            i10 = i14;
                            format = String.format(Locale.US, "%.2f", Float.valueOf(jg0Var.d / 100.0f));
                        }
                    } else {
                        i10 = i14;
                        format = String.format(Locale.US, "%.2f", Float.valueOf(jg0Var.f27682c / 100.0f));
                    }
                } else {
                    i10 = i14;
                    format = String.format(Locale.US, "%.2f", Float.valueOf(jg0Var.f27681b / 100.0f));
                }
            } else {
                i10 = i14;
                format = String.format(Locale.US, "%.2f", Float.valueOf(jg0Var.f27680a / 100.0f));
            }
            canvas.drawText(format, (i15 * f7) + com.google.android.gms.internal.vision.e2.z(f7, textPaint.measureText(format), 2.0f, ol0Var.f29425a), (ol0Var.f29426b + ol0Var.d) - AndroidUtilities.dp(4.0f), textPaint);
            i15++;
            i14 = i10;
            i13 = 3;
        }
        float[] a2 = jg0Var.a();
        invalidate();
        path.reset();
        for (int i16 = 0; i16 < a2.length / 2; i16++) {
            if (i16 == 0) {
                int i17 = i16 * 2;
                path.moveTo((a2[i17] * ol0Var.f29427c) + ol0Var.f29425a, ((1.0f - a2[i17 + 1]) * ol0Var.d) + ol0Var.f29426b);
            } else {
                int i18 = i16 * 2;
                path.lineTo((a2[i18] * ol0Var.f29427c) + ol0Var.f29425a, ((1.0f - a2[i18 + 1]) * ol0Var.d) + ol0Var.f29426b);
            }
        }
        canvas.drawPath(path, paint);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.dg0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(cg0 cg0Var) {
        this.v = cg0Var;
    }
}
