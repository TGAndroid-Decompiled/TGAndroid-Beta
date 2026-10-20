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
    public int f30914a;
    public boolean f30915b;
    public boolean f30916c;
    public float d;
    public fl0 e;
    public Paint f30917f;
    public Paint h;
    public Paint f30918n;
    public TextPaint f30919r;
    public Path f30920s;
    public tf0 v;
    public zf0 f30921w;

    public final void a(int i10, MotionEvent motionEvent) {
        ag0 ag0Var;
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        if (i10 != 1) {
            if (i10 != 2) {
                if ((i10 == 3 || i10 == 4 || i10 == 5) && this.f30914a != 0) {
                    this.f30914a = 0;
                    return;
                }
                return;
            }
            float min = Math.min(2.0f, (this.d - y3) / 8.0f);
            zf0 zf0Var = this.f30921w;
            int i11 = zf0Var.f32891f;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            ag0Var = null;
                        } else {
                            ag0Var = zf0Var.d;
                        }
                    } else {
                        ag0Var = zf0Var.f32890c;
                    }
                } else {
                    ag0Var = zf0Var.f32889b;
                }
            } else {
                ag0Var = zf0Var.f32888a;
            }
            int i12 = this.f30914a;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            if (i12 == 5) {
                                ag0Var.e = Math.max(0.0f, Math.min(100.0f, ag0Var.e + min));
                            }
                        } else {
                            ag0Var.d = Math.max(0.0f, Math.min(100.0f, ag0Var.d + min));
                        }
                    } else {
                        ag0Var.f24591c = Math.max(0.0f, Math.min(100.0f, ag0Var.f24591c + min));
                    }
                } else {
                    ag0Var.f24590b = Math.max(0.0f, Math.min(100.0f, ag0Var.f24590b + min));
                }
            } else {
                ag0Var.f24589a = Math.max(0.0f, Math.min(100.0f, ag0Var.f24589a + min));
            }
            invalidate();
            tf0 tf0Var = this.v;
            if (tf0Var != null) {
                dg0 dg0Var = ((vf0) tf0Var).f31229a;
                dg0Var.g();
                e00 e00Var = dg0Var.f25479l0;
                if (e00Var != null) {
                    e00Var.d(false, false, false);
                }
            }
            this.d = y3;
        } else if (this.f30914a != 0) {
        } else {
            fl0 fl0Var = this.e;
            this.f30914a = (int) Math.floor(com.google.android.gms.internal.play_billing.k3.z(x10, fl0Var.f26272a, fl0Var.f26274c / 5.0f, 1.0f));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ag0 ag0Var;
        int i10;
        String format;
        TextPaint textPaint = this.f30919r;
        Path path = this.f30920s;
        Paint paint = this.f30918n;
        zf0 zf0Var = this.f30921w;
        fl0 fl0Var = this.e;
        float f7 = fl0Var.f26274c / 5.0f;
        for (int i11 = 0; i11 < 4; i11++) {
            float f10 = fl0Var.f26272a;
            float f11 = i11 * f7;
            float f12 = f10 + f7 + f11;
            float f13 = fl0Var.f26273b;
            canvas.drawLine(f12, f13, f11 + f10 + f7, f13 + fl0Var.d, this.f30917f);
        }
        float f14 = fl0Var.f26272a;
        float f15 = fl0Var.f26273b;
        canvas.drawLine(f14, f15 + fl0Var.d, f14 + fl0Var.f26274c, f15, this.h);
        int i12 = zf0Var.f32891f;
        int i13 = 3;
        int i14 = 2;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        ag0Var = null;
                    } else {
                        paint.setColor(-13404165);
                        ag0Var = zf0Var.d;
                    }
                } else {
                    paint.setColor(-15667555);
                    ag0Var = zf0Var.f32890c;
                }
            } else {
                paint.setColor(-1229492);
                ag0Var = zf0Var.f32889b;
            }
        } else {
            paint.setColor(-1);
            ag0Var = zf0Var.f32888a;
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
                                format = String.format(Locale.US, "%.2f", Float.valueOf(ag0Var.e / 100.0f));
                            }
                        } else {
                            i10 = i14;
                            format = String.format(Locale.US, "%.2f", Float.valueOf(ag0Var.d / 100.0f));
                        }
                    } else {
                        i10 = i14;
                        format = String.format(Locale.US, "%.2f", Float.valueOf(ag0Var.f24591c / 100.0f));
                    }
                } else {
                    i10 = i14;
                    format = String.format(Locale.US, "%.2f", Float.valueOf(ag0Var.f24590b / 100.0f));
                }
            } else {
                i10 = i14;
                format = String.format(Locale.US, "%.2f", Float.valueOf(ag0Var.f24589a / 100.0f));
            }
            canvas.drawText(format, (i15 * f7) + com.google.android.gms.internal.play_billing.k3.z(f7, textPaint.measureText(format), 2.0f, fl0Var.f26272a), (fl0Var.f26273b + fl0Var.d) - AndroidUtilities.dp(4.0f), textPaint);
            i15++;
            i14 = i10;
            i13 = 3;
        }
        float[] a2 = ag0Var.a();
        invalidate();
        path.reset();
        for (int i16 = 0; i16 < a2.length / 2; i16++) {
            if (i16 == 0) {
                int i17 = i16 * 2;
                path.moveTo((a2[i17] * fl0Var.f26274c) + fl0Var.f26272a, ((1.0f - a2[i17 + 1]) * fl0Var.d) + fl0Var.f26273b);
            } else {
                int i18 = i16 * 2;
                path.lineTo((a2[i18] * fl0Var.f26274c) + fl0Var.f26272a, ((1.0f - a2[i18 + 1]) * fl0Var.d) + fl0Var.f26273b);
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
