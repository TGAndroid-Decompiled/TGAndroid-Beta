package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
public final class vf0 extends View {
    public int f33708a;
    public boolean f33709b;
    public boolean f33710c;
    public float d;
    public il0 e;
    public Paint f33711f;
    public Paint h;
    public Paint f33712n;
    public TextPaint f33713r;
    public Path f33714s;
    public uf0 v;
    public bg0 f33715w;

    public final void a(int i10, MotionEvent motionEvent) {
        cg0 cg0Var;
        float x9 = motionEvent.getX();
        float y3 = motionEvent.getY();
        if (i10 != 1) {
            if (i10 != 2) {
                if ((i10 == 3 || i10 == 4 || i10 == 5) && this.f33708a != 0) {
                    this.f33708a = 0;
                    return;
                }
                return;
            }
            float min = Math.min(2.0f, (this.d - y3) / 8.0f);
            bg0 bg0Var = this.f33715w;
            int i11 = bg0Var.f26830f;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            cg0Var = null;
                        } else {
                            cg0Var = bg0Var.d;
                        }
                    } else {
                        cg0Var = bg0Var.f26829c;
                    }
                } else {
                    cg0Var = bg0Var.f26828b;
                }
            } else {
                cg0Var = bg0Var.f26827a;
            }
            int i12 = this.f33708a;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            if (i12 == 5) {
                                cg0Var.e = org.telegram.messenger.wh.A(cg0Var.e, min, 100.0f, 0.0f);
                            }
                        } else {
                            cg0Var.d = org.telegram.messenger.wh.A(cg0Var.d, min, 100.0f, 0.0f);
                        }
                    } else {
                        cg0Var.f27157c = org.telegram.messenger.wh.A(cg0Var.f27157c, min, 100.0f, 0.0f);
                    }
                } else {
                    cg0Var.f27156b = org.telegram.messenger.wh.A(cg0Var.f27156b, min, 100.0f, 0.0f);
                }
            } else {
                cg0Var.f27155a = org.telegram.messenger.wh.A(cg0Var.f27155a, min, 100.0f, 0.0f);
            }
            invalidate();
            uf0 uf0Var = this.v;
            if (uf0Var != null) {
                fg0 fg0Var = ((wf0) uf0Var).f34507a;
                fg0Var.g();
                e00 e00Var = fg0Var.f28136l0;
                if (e00Var != null) {
                    e00Var.d(false, false, false);
                }
            }
            this.d = y3;
        } else if (this.f33708a != 0) {
        } else {
            il0 il0Var = this.e;
            this.f33708a = (int) Math.floor(c3.h0.B(x9, il0Var.f29381a, il0Var.f29383c / 5.0f, 1.0f));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        cg0 cg0Var;
        int i10;
        String format;
        TextPaint textPaint = this.f33713r;
        Path path = this.f33714s;
        Paint paint = this.f33712n;
        bg0 bg0Var = this.f33715w;
        il0 il0Var = this.e;
        float f7 = il0Var.f29383c / 5.0f;
        for (int i11 = 0; i11 < 4; i11++) {
            float f10 = il0Var.f29381a;
            float f11 = i11 * f7;
            float f12 = f10 + f7 + f11;
            float f13 = il0Var.f29382b;
            canvas.drawLine(f12, f13, f11 + f10 + f7, f13 + il0Var.d, this.f33711f);
        }
        float f14 = il0Var.f29381a;
        float f15 = il0Var.f29382b;
        canvas.drawLine(f14, f15 + il0Var.d, f14 + il0Var.f29383c, f15, this.h);
        int i12 = bg0Var.f26830f;
        int i13 = 3;
        int i14 = 2;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        cg0Var = null;
                    } else {
                        paint.setColor(-13404165);
                        cg0Var = bg0Var.d;
                    }
                } else {
                    paint.setColor(-15667555);
                    cg0Var = bg0Var.f26829c;
                }
            } else {
                paint.setColor(-1229492);
                cg0Var = bg0Var.f26828b;
            }
        } else {
            paint.setColor(-1);
            cg0Var = bg0Var.f26827a;
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
                                format = String.format(Locale.US, "%.2f", Float.valueOf(cg0Var.e / 100.0f));
                            }
                        } else {
                            i10 = i14;
                            format = String.format(Locale.US, "%.2f", Float.valueOf(cg0Var.d / 100.0f));
                        }
                    } else {
                        i10 = i14;
                        format = String.format(Locale.US, "%.2f", Float.valueOf(cg0Var.f27157c / 100.0f));
                    }
                } else {
                    i10 = i14;
                    format = String.format(Locale.US, "%.2f", Float.valueOf(cg0Var.f27156b / 100.0f));
                }
            } else {
                i10 = i14;
                format = String.format(Locale.US, "%.2f", Float.valueOf(cg0Var.f27155a / 100.0f));
            }
            canvas.drawText(format, (i15 * f7) + c3.h0.B(f7, textPaint.measureText(format), 2.0f, il0Var.f29381a), (il0Var.f29382b + il0Var.d) - AndroidUtilities.dp(4.0f), textPaint);
            i15++;
            i14 = i10;
            i13 = 3;
        }
        float[] a2 = cg0Var.a();
        invalidate();
        path.reset();
        for (int i16 = 0; i16 < a2.length / 2; i16++) {
            if (i16 == 0) {
                int i17 = i16 * 2;
                path.moveTo((a2[i17] * il0Var.f29383c) + il0Var.f29381a, ((1.0f - a2[i17 + 1]) * il0Var.d) + il0Var.f29382b);
            } else {
                int i18 = i16 * 2;
                path.lineTo((a2[i18] * il0Var.f29383c) + il0Var.f29381a, ((1.0f - a2[i18 + 1]) * il0Var.d) + il0Var.f29382b);
            }
        }
        canvas.drawPath(path, paint);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vf0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(uf0 uf0Var) {
        this.v = uf0Var;
    }
}
