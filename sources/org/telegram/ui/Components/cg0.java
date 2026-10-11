package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
public final class cg0 extends View {
    public int f25347a;
    public boolean f25348b;
    public boolean f25349c;
    public float d;
    public nl0 f25350e;
    public Paint f25351f;
    public Paint h;
    public Paint f25352n;
    public TextPaint f25353r;
    public Path f25354s;
    public bg0 v;
    public hg0 f25355w;

    public final void a(int i10, MotionEvent motionEvent) {
        ig0 ig0Var;
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        if (i10 != 1) {
            if (i10 != 2) {
                if ((i10 == 3 || i10 == 4 || i10 == 5) && this.f25347a != 0) {
                    this.f25347a = 0;
                    return;
                }
                return;
            }
            float min = Math.min(2.0f, (this.d - y3) / 8.0f);
            hg0 hg0Var = this.f25355w;
            int i11 = hg0Var.f27096f;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            ig0Var = null;
                        } else {
                            ig0Var = hg0Var.d;
                        }
                    } else {
                        ig0Var = hg0Var.f27094c;
                    }
                } else {
                    ig0Var = hg0Var.f27093b;
                }
            } else {
                ig0Var = hg0Var.f27092a;
            }
            int i12 = this.f25347a;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            if (i12 == 5) {
                                ig0Var.f27444e = Math.max(0.0f, Math.min(100.0f, ig0Var.f27444e + min));
                            }
                        } else {
                            ig0Var.d = Math.max(0.0f, Math.min(100.0f, ig0Var.d + min));
                        }
                    } else {
                        ig0Var.f27443c = Math.max(0.0f, Math.min(100.0f, ig0Var.f27443c + min));
                    }
                } else {
                    ig0Var.f27442b = Math.max(0.0f, Math.min(100.0f, ig0Var.f27442b + min));
                }
            } else {
                ig0Var.f27441a = Math.max(0.0f, Math.min(100.0f, ig0Var.f27441a + min));
            }
            invalidate();
            bg0 bg0Var = this.v;
            if (bg0Var != null) {
                lg0 lg0Var = ((dg0) bg0Var).f25770a;
                lg0Var.g();
                m00 m00Var = lg0Var.f28395l0;
                if (m00Var != null) {
                    m00Var.e(false, false, false);
                }
            }
            this.d = y3;
        } else if (this.f25347a != 0) {
        } else {
            nl0 nl0Var = this.f25350e;
            this.f25347a = (int) Math.floor(com.google.android.gms.internal.vision.e2.z(x10, nl0Var.f29188a, nl0Var.f29190c / 5.0f, 1.0f));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ig0 ig0Var;
        int i10;
        String format;
        TextPaint textPaint = this.f25353r;
        Path path = this.f25354s;
        Paint paint = this.f25352n;
        hg0 hg0Var = this.f25355w;
        nl0 nl0Var = this.f25350e;
        float f7 = nl0Var.f29190c / 5.0f;
        for (int i11 = 0; i11 < 4; i11++) {
            float f10 = nl0Var.f29188a;
            float f11 = i11 * f7;
            float f12 = f10 + f7 + f11;
            float f13 = nl0Var.f29189b;
            canvas.drawLine(f12, f13, f11 + f10 + f7, f13 + nl0Var.d, this.f25351f);
        }
        float f14 = nl0Var.f29188a;
        float f15 = nl0Var.f29189b;
        canvas.drawLine(f14, f15 + nl0Var.d, f14 + nl0Var.f29190c, f15, this.h);
        int i12 = hg0Var.f27096f;
        int i13 = 3;
        int i14 = 2;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        ig0Var = null;
                    } else {
                        paint.setColor(-13404165);
                        ig0Var = hg0Var.d;
                    }
                } else {
                    paint.setColor(-15667555);
                    ig0Var = hg0Var.f27094c;
                }
            } else {
                paint.setColor(-1229492);
                ig0Var = hg0Var.f27093b;
            }
        } else {
            paint.setColor(-1);
            ig0Var = hg0Var.f27092a;
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
                                format = String.format(Locale.US, "%.2f", Float.valueOf(ig0Var.f27444e / 100.0f));
                            }
                        } else {
                            i10 = i14;
                            format = String.format(Locale.US, "%.2f", Float.valueOf(ig0Var.d / 100.0f));
                        }
                    } else {
                        i10 = i14;
                        format = String.format(Locale.US, "%.2f", Float.valueOf(ig0Var.f27443c / 100.0f));
                    }
                } else {
                    i10 = i14;
                    format = String.format(Locale.US, "%.2f", Float.valueOf(ig0Var.f27442b / 100.0f));
                }
            } else {
                i10 = i14;
                format = String.format(Locale.US, "%.2f", Float.valueOf(ig0Var.f27441a / 100.0f));
            }
            canvas.drawText(format, (i15 * f7) + com.google.android.gms.internal.vision.e2.z(f7, textPaint.measureText(format), 2.0f, nl0Var.f29188a), (nl0Var.f29189b + nl0Var.d) - AndroidUtilities.dp(4.0f), textPaint);
            i15++;
            i14 = i10;
            i13 = 3;
        }
        float[] a2 = ig0Var.a();
        invalidate();
        path.reset();
        for (int i16 = 0; i16 < a2.length / 2; i16++) {
            if (i16 == 0) {
                int i17 = i16 * 2;
                path.moveTo((a2[i17] * nl0Var.f29190c) + nl0Var.f29188a, ((1.0f - a2[i17 + 1]) * nl0Var.d) + nl0Var.f29189b);
            } else {
                int i18 = i16 * 2;
                path.lineTo((a2[i18] * nl0Var.f29190c) + nl0Var.f29188a, ((1.0f - a2[i18 + 1]) * nl0Var.d) + nl0Var.f29189b);
            }
        }
        canvas.drawPath(path, paint);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cg0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(bg0 bg0Var) {
        this.v = bg0Var;
    }
}
