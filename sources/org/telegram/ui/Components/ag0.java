package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
public final class ag0 extends View {
    public int f23233a;
    public boolean f23234b;
    public boolean f23235c;
    public float d;
    public il0 e;
    public Paint f23236f;
    public Paint h;
    public Paint f23237n;
    public TextPaint f23238r;
    public Path f23239s;
    public zf0 v;
    public fg0 f23240w;

    public final void a(int i10, MotionEvent motionEvent) {
        gg0 gg0Var;
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        if (i10 != 1) {
            if (i10 != 2) {
                if ((i10 == 3 || i10 == 4 || i10 == 5) && this.f23233a != 0) {
                    this.f23233a = 0;
                    return;
                }
                return;
            }
            float min = Math.min(2.0f, (this.d - y3) / 8.0f);
            fg0 fg0Var = this.f23240w;
            int i11 = fg0Var.f24728f;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            gg0Var = null;
                        } else {
                            gg0Var = fg0Var.d;
                        }
                    } else {
                        gg0Var = fg0Var.f24727c;
                    }
                } else {
                    gg0Var = fg0Var.f24726b;
                }
            } else {
                gg0Var = fg0Var.f24725a;
            }
            int i12 = this.f23233a;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            if (i12 == 5) {
                                gg0Var.e = Math.max(0.0f, Math.min(100.0f, gg0Var.e + min));
                            }
                        } else {
                            gg0Var.d = Math.max(0.0f, Math.min(100.0f, gg0Var.d + min));
                        }
                    } else {
                        gg0Var.f24962c = Math.max(0.0f, Math.min(100.0f, gg0Var.f24962c + min));
                    }
                } else {
                    gg0Var.f24961b = Math.max(0.0f, Math.min(100.0f, gg0Var.f24961b + min));
                }
            } else {
                gg0Var.f24960a = Math.max(0.0f, Math.min(100.0f, gg0Var.f24960a + min));
            }
            invalidate();
            zf0 zf0Var = this.v;
            if (zf0Var != null) {
                jg0 jg0Var = ((bg0) zf0Var).f23451a;
                jg0Var.g();
                h00 h00Var = jg0Var.f26009l0;
                if (h00Var != null) {
                    h00Var.d(false, false, false);
                }
            }
            this.d = y3;
        } else if (this.f23233a != 0) {
        } else {
            il0 il0Var = this.e;
            this.f23233a = (int) Math.floor(com.google.android.gms.internal.play_billing.k3.z(x10, il0Var.f25653a, il0Var.f25655c / 5.0f, 1.0f));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        gg0 gg0Var;
        int i10;
        String format;
        TextPaint textPaint = this.f23238r;
        Path path = this.f23239s;
        Paint paint = this.f23237n;
        fg0 fg0Var = this.f23240w;
        il0 il0Var = this.e;
        float f7 = il0Var.f25655c / 5.0f;
        for (int i11 = 0; i11 < 4; i11++) {
            float f10 = il0Var.f25653a;
            float f11 = i11 * f7;
            float f12 = f10 + f7 + f11;
            float f13 = il0Var.f25654b;
            canvas.drawLine(f12, f13, f11 + f10 + f7, f13 + il0Var.d, this.f23236f);
        }
        float f14 = il0Var.f25653a;
        float f15 = il0Var.f25654b;
        canvas.drawLine(f14, f15 + il0Var.d, f14 + il0Var.f25655c, f15, this.h);
        int i12 = fg0Var.f24728f;
        int i13 = 3;
        int i14 = 2;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        gg0Var = null;
                    } else {
                        paint.setColor(-13404165);
                        gg0Var = fg0Var.d;
                    }
                } else {
                    paint.setColor(-15667555);
                    gg0Var = fg0Var.f24727c;
                }
            } else {
                paint.setColor(-1229492);
                gg0Var = fg0Var.f24726b;
            }
        } else {
            paint.setColor(-1);
            gg0Var = fg0Var.f24725a;
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
                                format = String.format(Locale.US, "%.2f", Float.valueOf(gg0Var.e / 100.0f));
                            }
                        } else {
                            i10 = i14;
                            format = String.format(Locale.US, "%.2f", Float.valueOf(gg0Var.d / 100.0f));
                        }
                    } else {
                        i10 = i14;
                        format = String.format(Locale.US, "%.2f", Float.valueOf(gg0Var.f24962c / 100.0f));
                    }
                } else {
                    i10 = i14;
                    format = String.format(Locale.US, "%.2f", Float.valueOf(gg0Var.f24961b / 100.0f));
                }
            } else {
                i10 = i14;
                format = String.format(Locale.US, "%.2f", Float.valueOf(gg0Var.f24960a / 100.0f));
            }
            canvas.drawText(format, (i15 * f7) + com.google.android.gms.internal.play_billing.k3.z(f7, textPaint.measureText(format), 2.0f, il0Var.f25653a), (il0Var.f25654b + il0Var.d) - AndroidUtilities.dp(4.0f), textPaint);
            i15++;
            i14 = i10;
            i13 = 3;
        }
        float[] a2 = gg0Var.a();
        invalidate();
        path.reset();
        for (int i16 = 0; i16 < a2.length / 2; i16++) {
            if (i16 == 0) {
                int i17 = i16 * 2;
                path.moveTo((a2[i17] * il0Var.f25655c) + il0Var.f25653a, ((1.0f - a2[i17 + 1]) * il0Var.d) + il0Var.f25654b);
            } else {
                int i18 = i16 * 2;
                path.lineTo((a2[i18] * il0Var.f25655c) + il0Var.f25653a, ((1.0f - a2[i18 + 1]) * il0Var.d) + il0Var.f25654b);
            }
        }
        canvas.drawPath(path, paint);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ag0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(zf0 zf0Var) {
        this.v = zf0Var;
    }
}
