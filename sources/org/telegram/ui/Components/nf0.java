package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
public final class nf0 extends View {
    public int f26697a;
    public boolean f26698b;
    public boolean f26699c;
    public float d;
    public vk0 e;
    public Paint f26700f;
    public Paint h;
    public Paint f26701n;
    public TextPaint f26702r;
    public Path f26703s;
    public mf0 v;
    public sf0 f26704w;

    public final void a(int i10, MotionEvent motionEvent) {
        tf0 tf0Var;
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        if (i10 != 1) {
            if (i10 != 2) {
                if ((i10 == 3 || i10 == 4 || i10 == 5) && this.f26697a != 0) {
                    this.f26697a = 0;
                    return;
                }
                return;
            }
            float min = Math.min(2.0f, (this.d - y3) / 8.0f);
            sf0 sf0Var = this.f26704w;
            int i11 = sf0Var.f28250f;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            tf0Var = null;
                        } else {
                            tf0Var = sf0Var.d;
                        }
                    } else {
                        tf0Var = sf0Var.f28249c;
                    }
                } else {
                    tf0Var = sf0Var.f28248b;
                }
            } else {
                tf0Var = sf0Var.f28247a;
            }
            int i12 = this.f26697a;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            if (i12 == 5) {
                                tf0Var.e = Math.max(0.0f, Math.min(100.0f, tf0Var.e + min));
                            }
                        } else {
                            tf0Var.d = Math.max(0.0f, Math.min(100.0f, tf0Var.d + min));
                        }
                    } else {
                        tf0Var.f28502c = Math.max(0.0f, Math.min(100.0f, tf0Var.f28502c + min));
                    }
                } else {
                    tf0Var.f28501b = Math.max(0.0f, Math.min(100.0f, tf0Var.f28501b + min));
                }
            } else {
                tf0Var.f28500a = Math.max(0.0f, Math.min(100.0f, tf0Var.f28500a + min));
            }
            invalidate();
            mf0 mf0Var = this.v;
            if (mf0Var != null) {
                wf0 wf0Var = ((of0) mf0Var).f27076a;
                wf0Var.g();
                yz yzVar = wf0Var.f29917l0;
                if (yzVar != null) {
                    yzVar.e(false, false, false);
                }
            }
            this.d = y3;
        } else if (this.f26697a != 0) {
        } else {
            vk0 vk0Var = this.e;
            this.f26697a = (int) Math.floor(com.google.android.gms.internal.vision.e2.A(x10, vk0Var.f29132a, vk0Var.f29134c / 5.0f, 1.0f));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        tf0 tf0Var;
        String format;
        TextPaint textPaint = this.f26702r;
        Path path = this.f26703s;
        Paint paint = this.f26701n;
        sf0 sf0Var = this.f26704w;
        vk0 vk0Var = this.e;
        float f7 = vk0Var.f29134c / 5.0f;
        for (int i10 = 0; i10 < 4; i10++) {
            float f10 = vk0Var.f29132a;
            float f11 = i10 * f7;
            float f12 = f10 + f7 + f11;
            float f13 = vk0Var.f29133b;
            canvas.drawLine(f12, f13, f11 + f10 + f7, f13 + vk0Var.d, this.f26700f);
        }
        float f14 = vk0Var.f29132a;
        float f15 = vk0Var.f29133b;
        canvas.drawLine(f14, f15 + vk0Var.d, f14 + vk0Var.f29134c, f15, this.h);
        int i11 = sf0Var.f28250f;
        int i12 = 3;
        int i13 = 2;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        tf0Var = null;
                    } else {
                        paint.setColor(-13404165);
                        tf0Var = sf0Var.d;
                    }
                } else {
                    paint.setColor(-15667555);
                    tf0Var = sf0Var.f28249c;
                }
            } else {
                paint.setColor(-1229492);
                tf0Var = sf0Var.f28248b;
            }
        } else {
            paint.setColor(-1);
            tf0Var = sf0Var.f28247a;
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
                                format = String.format(Locale.US, "%.2f", Float.valueOf(tf0Var.e / 100.0f));
                            }
                        } else {
                            format = String.format(Locale.US, "%.2f", Float.valueOf(tf0Var.d / 100.0f));
                        }
                    } else {
                        format = String.format(Locale.US, "%.2f", Float.valueOf(tf0Var.f28502c / 100.0f));
                    }
                } else {
                    format = String.format(Locale.US, "%.2f", Float.valueOf(tf0Var.f28501b / 100.0f));
                }
            } else {
                format = String.format(Locale.US, "%.2f", Float.valueOf(tf0Var.f28500a / 100.0f));
            }
            canvas.drawText(format, (i14 * f7) + com.google.android.gms.internal.vision.e2.A(f7, textPaint.measureText(format), 2.0f, vk0Var.f29132a), (vk0Var.f29133b + vk0Var.d) - AndroidUtilities.dp(4.0f), textPaint);
            i14++;
            i12 = 3;
            i13 = 2;
        }
        float[] a2 = tf0Var.a();
        invalidate();
        path.reset();
        for (int i15 = 0; i15 < a2.length / 2; i15++) {
            if (i15 == 0) {
                int i16 = i15 * 2;
                path.moveTo((a2[i16] * vk0Var.f29134c) + vk0Var.f29132a, ((1.0f - a2[i16 + 1]) * vk0Var.d) + vk0Var.f29133b);
            } else {
                int i17 = i15 * 2;
                path.lineTo((a2[i17] * vk0Var.f29134c) + vk0Var.f29132a, ((1.0f - a2[i17 + 1]) * vk0Var.d) + vk0Var.f29133b);
            }
        }
        canvas.drawPath(path, paint);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.nf0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(mf0 mf0Var) {
        this.v = mf0Var;
    }
}
