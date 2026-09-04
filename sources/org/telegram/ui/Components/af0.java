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
    public int f24353a;
    public boolean f24354b;
    public boolean f24355c;
    public float d;
    public hk0 f24356e;
    public Paint f24357f;
    public Paint h;
    public Paint f24358n;
    public TextPaint f24359r;
    public Path f24360s;
    public ze0 v;
    public ff0 f24361w;

    public final void a(int i10, MotionEvent motionEvent) {
        gf0 gf0Var;
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        if (i10 != 1) {
            if (i10 != 2) {
                if ((i10 == 3 || i10 == 4 || i10 == 5) && this.f24353a != 0) {
                    this.f24353a = 0;
                    return;
                }
                return;
            }
            float min = Math.min(2.0f, (this.d - y3) / 8.0f);
            ff0 ff0Var = this.f24361w;
            int i11 = ff0Var.f26032f;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            gf0Var = null;
                        } else {
                            gf0Var = ff0Var.d;
                        }
                    } else {
                        gf0Var = ff0Var.f26030c;
                    }
                } else {
                    gf0Var = ff0Var.f26029b;
                }
            } else {
                gf0Var = ff0Var.f26028a;
            }
            int i12 = this.f24353a;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            if (i12 == 5) {
                                gf0Var.f26375e = Math.max(0.0f, Math.min(100.0f, gf0Var.f26375e + min));
                            }
                        } else {
                            gf0Var.d = Math.max(0.0f, Math.min(100.0f, gf0Var.d + min));
                        }
                    } else {
                        gf0Var.f26374c = Math.max(0.0f, Math.min(100.0f, gf0Var.f26374c + min));
                    }
                } else {
                    gf0Var.f26373b = Math.max(0.0f, Math.min(100.0f, gf0Var.f26373b + min));
                }
            } else {
                gf0Var.f26372a = Math.max(0.0f, Math.min(100.0f, gf0Var.f26372a + min));
            }
            invalidate();
            ze0 ze0Var = this.v;
            if (ze0Var != null) {
                jf0 jf0Var = ((bf0) ze0Var).f24693a;
                jf0Var.g();
                vz vzVar = jf0Var.f27483l0;
                if (vzVar != null) {
                    vzVar.e(false, false, false);
                }
            }
            this.d = y3;
        } else if (this.f24353a != 0) {
        } else {
            hk0 hk0Var = this.f24356e;
            this.f24353a = (int) Math.floor(com.google.android.gms.internal.vision.e2.A(x10, hk0Var.f26743a, hk0Var.f26745c / 5.0f, 1.0f));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        gf0 gf0Var;
        String format;
        TextPaint textPaint = this.f24359r;
        Path path = this.f24360s;
        Paint paint = this.f24358n;
        ff0 ff0Var = this.f24361w;
        hk0 hk0Var = this.f24356e;
        float f7 = hk0Var.f26745c / 5.0f;
        for (int i10 = 0; i10 < 4; i10++) {
            float f10 = hk0Var.f26743a;
            float f11 = i10 * f7;
            float f12 = f10 + f7 + f11;
            float f13 = hk0Var.f26744b;
            canvas.drawLine(f12, f13, f11 + f10 + f7, f13 + hk0Var.d, this.f24357f);
        }
        float f14 = hk0Var.f26743a;
        float f15 = hk0Var.f26744b;
        canvas.drawLine(f14, f15 + hk0Var.d, f14 + hk0Var.f26745c, f15, this.h);
        int i11 = ff0Var.f26032f;
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
                    gf0Var = ff0Var.f26030c;
                }
            } else {
                paint.setColor(-1229492);
                gf0Var = ff0Var.f26029b;
            }
        } else {
            paint.setColor(-1);
            gf0Var = ff0Var.f26028a;
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
                                format = String.format(Locale.US, "%.2f", Float.valueOf(gf0Var.f26375e / 100.0f));
                            }
                        } else {
                            format = String.format(Locale.US, "%.2f", Float.valueOf(gf0Var.d / 100.0f));
                        }
                    } else {
                        format = String.format(Locale.US, "%.2f", Float.valueOf(gf0Var.f26374c / 100.0f));
                    }
                } else {
                    format = String.format(Locale.US, "%.2f", Float.valueOf(gf0Var.f26373b / 100.0f));
                }
            } else {
                format = String.format(Locale.US, "%.2f", Float.valueOf(gf0Var.f26372a / 100.0f));
            }
            canvas.drawText(format, (i14 * f7) + com.google.android.gms.internal.vision.e2.A(f7, textPaint.measureText(format), 2.0f, hk0Var.f26743a), (hk0Var.f26744b + hk0Var.d) - AndroidUtilities.dp(4.0f), textPaint);
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
                path.moveTo((a2[i16] * hk0Var.f26745c) + hk0Var.f26743a, ((1.0f - a2[i16 + 1]) * hk0Var.d) + hk0Var.f26744b);
            } else {
                int i17 = i15 * 2;
                path.lineTo((a2[i17] * hk0Var.f26745c) + hk0Var.f26743a, ((1.0f - a2[i17 + 1]) * hk0Var.d) + hk0Var.f26744b);
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
