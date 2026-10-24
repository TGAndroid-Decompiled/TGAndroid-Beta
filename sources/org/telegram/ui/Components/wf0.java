package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
public final class wf0 extends View {
    public int f32222a;
    public boolean f32223b;
    public boolean f32224c;
    public float d;
    public hl0 e;
    public Paint f32225f;
    public Paint h;
    public Paint f32226n;
    public TextPaint f32227r;
    public Path f32228s;
    public vf0 v;
    public cg0 f32229w;

    public final void a(int i10, MotionEvent motionEvent) {
        dg0 dg0Var;
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        if (i10 != 1) {
            if (i10 != 2) {
                if ((i10 == 3 || i10 == 4 || i10 == 5) && this.f32222a != 0) {
                    this.f32222a = 0;
                    return;
                }
                return;
            }
            float min = Math.min(2.0f, (this.d - y3) / 8.0f);
            cg0 cg0Var = this.f32229w;
            int i11 = cg0Var.f25308f;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            dg0Var = null;
                        } else {
                            dg0Var = cg0Var.d;
                        }
                    } else {
                        dg0Var = cg0Var.f25307c;
                    }
                } else {
                    dg0Var = cg0Var.f25306b;
                }
            } else {
                dg0Var = cg0Var.f25305a;
            }
            int i12 = this.f32222a;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            if (i12 == 5) {
                                dg0Var.e = Math.max(0.0f, Math.min(100.0f, dg0Var.e + min));
                            }
                        } else {
                            dg0Var.d = Math.max(0.0f, Math.min(100.0f, dg0Var.d + min));
                        }
                    } else {
                        dg0Var.f25729c = Math.max(0.0f, Math.min(100.0f, dg0Var.f25729c + min));
                    }
                } else {
                    dg0Var.f25728b = Math.max(0.0f, Math.min(100.0f, dg0Var.f25728b + min));
                }
            } else {
                dg0Var.f25727a = Math.max(0.0f, Math.min(100.0f, dg0Var.f25727a + min));
            }
            invalidate();
            vf0 vf0Var = this.v;
            if (vf0Var != null) {
                gg0 gg0Var = ((xf0) vf0Var).f32573a;
                gg0Var.g();
                c00 c00Var = gg0Var.f26670l0;
                if (c00Var != null) {
                    c00Var.d(false, false, false);
                }
            }
            this.d = y3;
        } else if (this.f32222a != 0) {
        } else {
            hl0 hl0Var = this.e;
            this.f32222a = (int) Math.floor(com.google.android.gms.internal.play_billing.k3.z(x10, hl0Var.f27075a, hl0Var.f27077c / 5.0f, 1.0f));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        dg0 dg0Var;
        int i10;
        String format;
        TextPaint textPaint = this.f32227r;
        Path path = this.f32228s;
        Paint paint = this.f32226n;
        cg0 cg0Var = this.f32229w;
        hl0 hl0Var = this.e;
        float f7 = hl0Var.f27077c / 5.0f;
        for (int i11 = 0; i11 < 4; i11++) {
            float f10 = hl0Var.f27075a;
            float f11 = i11 * f7;
            float f12 = f10 + f7 + f11;
            float f13 = hl0Var.f27076b;
            canvas.drawLine(f12, f13, f11 + f10 + f7, f13 + hl0Var.d, this.f32225f);
        }
        float f14 = hl0Var.f27075a;
        float f15 = hl0Var.f27076b;
        canvas.drawLine(f14, f15 + hl0Var.d, f14 + hl0Var.f27077c, f15, this.h);
        int i12 = cg0Var.f25308f;
        int i13 = 3;
        int i14 = 2;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        dg0Var = null;
                    } else {
                        paint.setColor(-13404165);
                        dg0Var = cg0Var.d;
                    }
                } else {
                    paint.setColor(-15667555);
                    dg0Var = cg0Var.f25307c;
                }
            } else {
                paint.setColor(-1229492);
                dg0Var = cg0Var.f25306b;
            }
        } else {
            paint.setColor(-1);
            dg0Var = cg0Var.f25305a;
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
                                format = String.format(Locale.US, "%.2f", Float.valueOf(dg0Var.e / 100.0f));
                            }
                        } else {
                            i10 = i14;
                            format = String.format(Locale.US, "%.2f", Float.valueOf(dg0Var.d / 100.0f));
                        }
                    } else {
                        i10 = i14;
                        format = String.format(Locale.US, "%.2f", Float.valueOf(dg0Var.f25729c / 100.0f));
                    }
                } else {
                    i10 = i14;
                    format = String.format(Locale.US, "%.2f", Float.valueOf(dg0Var.f25728b / 100.0f));
                }
            } else {
                i10 = i14;
                format = String.format(Locale.US, "%.2f", Float.valueOf(dg0Var.f25727a / 100.0f));
            }
            canvas.drawText(format, (i15 * f7) + com.google.android.gms.internal.play_billing.k3.z(f7, textPaint.measureText(format), 2.0f, hl0Var.f27075a), (hl0Var.f27076b + hl0Var.d) - AndroidUtilities.dp(4.0f), textPaint);
            i15++;
            i14 = i10;
            i13 = 3;
        }
        float[] a2 = dg0Var.a();
        invalidate();
        path.reset();
        for (int i16 = 0; i16 < a2.length / 2; i16++) {
            if (i16 == 0) {
                int i17 = i16 * 2;
                path.moveTo((a2[i17] * hl0Var.f27077c) + hl0Var.f27075a, ((1.0f - a2[i17 + 1]) * hl0Var.d) + hl0Var.f27076b);
            } else {
                int i18 = i16 * 2;
                path.lineTo((a2[i18] * hl0Var.f27077c) + hl0Var.f27075a, ((1.0f - a2[i18 + 1]) * hl0Var.d) + hl0Var.f27076b);
            }
        }
        canvas.drawPath(path, paint);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wf0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(vf0 vf0Var) {
        this.v = vf0Var;
    }
}
