package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
public final class af0 extends View {
    public int f24380a;
    public boolean f24381b;
    public boolean f24382c;
    public float d;
    public hk0 f24383e;
    public Paint f24384f;
    public Paint h;
    public Paint f24385n;
    public TextPaint f24386r;
    public Path f24387s;
    public ze0 v;
    public ff0 f24388w;

    public final void a(int i10, MotionEvent motionEvent) {
        gf0 gf0Var;
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        if (i10 != 1) {
            if (i10 != 2) {
                if ((i10 == 3 || i10 == 4 || i10 == 5) && this.f24380a != 0) {
                    this.f24380a = 0;
                    return;
                }
                return;
            }
            float min = Math.min(2.0f, (this.d - y3) / 8.0f);
            ff0 ff0Var = this.f24388w;
            int i11 = ff0Var.f26059f;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            gf0Var = null;
                        } else {
                            gf0Var = ff0Var.d;
                        }
                    } else {
                        gf0Var = ff0Var.f26057c;
                    }
                } else {
                    gf0Var = ff0Var.f26056b;
                }
            } else {
                gf0Var = ff0Var.f26055a;
            }
            int i12 = this.f24380a;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            if (i12 == 5) {
                                gf0Var.f26402e = Math.max(0.0f, Math.min(100.0f, gf0Var.f26402e + min));
                            }
                        } else {
                            gf0Var.d = Math.max(0.0f, Math.min(100.0f, gf0Var.d + min));
                        }
                    } else {
                        gf0Var.f26401c = Math.max(0.0f, Math.min(100.0f, gf0Var.f26401c + min));
                    }
                } else {
                    gf0Var.f26400b = Math.max(0.0f, Math.min(100.0f, gf0Var.f26400b + min));
                }
            } else {
                gf0Var.f26399a = Math.max(0.0f, Math.min(100.0f, gf0Var.f26399a + min));
            }
            invalidate();
            ze0 ze0Var = this.v;
            if (ze0Var != null) {
                jf0 jf0Var = ((bf0) ze0Var).f24720a;
                jf0Var.g();
                vz vzVar = jf0Var.f27510l0;
                if (vzVar != null) {
                    vzVar.e(false, false, false);
                }
            }
            this.d = y3;
        } else if (this.f24380a != 0) {
        } else {
            hk0 hk0Var = this.f24383e;
            this.f24380a = (int) Math.floor(com.google.android.gms.internal.vision.e2.A(x10, hk0Var.f26770a, hk0Var.f26772c / 5.0f, 1.0f));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        gf0 gf0Var;
        String format;
        TextPaint textPaint = this.f24386r;
        Path path = this.f24387s;
        Paint paint = this.f24385n;
        ff0 ff0Var = this.f24388w;
        hk0 hk0Var = this.f24383e;
        float f7 = hk0Var.f26772c / 5.0f;
        for (int i10 = 0; i10 < 4; i10++) {
            float f10 = hk0Var.f26770a;
            float f11 = i10 * f7;
            float f12 = f10 + f7 + f11;
            float f13 = hk0Var.f26771b;
            canvas.drawLine(f12, f13, f11 + f10 + f7, f13 + hk0Var.d, this.f24384f);
        }
        float f14 = hk0Var.f26770a;
        float f15 = hk0Var.f26771b;
        canvas.drawLine(f14, f15 + hk0Var.d, f14 + hk0Var.f26772c, f15, this.h);
        int i11 = ff0Var.f26059f;
        int i12 = 3;
        int i13 = 2;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        gf0Var = null;
                    } else {
                        paint.setColor(-13404165);
                        gf0Var = ff0Var.d;
                    }
                } else {
                    paint.setColor(-15667555);
                    gf0Var = ff0Var.f26057c;
                }
            } else {
                paint.setColor(-1229492);
                gf0Var = ff0Var.f26056b;
            }
        } else {
            paint.setColor(-1);
            gf0Var = ff0Var.f26055a;
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
                                format = String.format(Locale.US, "%.2f", Float.valueOf(gf0Var.f26402e / 100.0f));
                            }
                        } else {
                            format = String.format(Locale.US, "%.2f", Float.valueOf(gf0Var.d / 100.0f));
                        }
                    } else {
                        format = String.format(Locale.US, "%.2f", Float.valueOf(gf0Var.f26401c / 100.0f));
                    }
                } else {
                    format = String.format(Locale.US, "%.2f", Float.valueOf(gf0Var.f26400b / 100.0f));
                }
            } else {
                format = String.format(Locale.US, "%.2f", Float.valueOf(gf0Var.f26399a / 100.0f));
            }
            canvas.drawText(format, (i14 * f7) + com.google.android.gms.internal.vision.e2.A(f7, textPaint.measureText(format), 2.0f, hk0Var.f26770a), (hk0Var.f26771b + hk0Var.d) - AndroidUtilities.dp(4.0f), textPaint);
            i14++;
            i12 = 3;
            i13 = 2;
        }
        float[] a2 = gf0Var.a();
        invalidate();
        path.reset();
        for (int i15 = 0; i15 < a2.length / 2; i15++) {
            if (i15 == 0) {
                int i16 = i15 * 2;
                path.moveTo((a2[i16] * hk0Var.f26772c) + hk0Var.f26770a, ((1.0f - a2[i16 + 1]) * hk0Var.d) + hk0Var.f26771b);
            } else {
                int i17 = i15 * 2;
                path.lineTo((a2[i17] * hk0Var.f26772c) + hk0Var.f26770a, ((1.0f - a2[i17 + 1]) * hk0Var.d) + hk0Var.f26771b);
            }
        }
        canvas.drawPath(path, paint);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.af0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(ze0 ze0Var) {
        this.v = ze0Var;
    }
}
