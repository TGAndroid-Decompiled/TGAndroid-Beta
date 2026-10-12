package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
public final class fg0 extends View {
    public int f26059a;
    public boolean f26060b;
    public boolean f26061c;
    public float d;
    public sl0 f26062e;
    public Paint f26063f;
    public Paint h;
    public Paint f26064n;
    public TextPaint f26065r;
    public Path f26066s;
    public eg0 v;
    public kg0 f26067w;

    public final void a(int i10, MotionEvent motionEvent) {
        lg0 lg0Var;
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        if (i10 != 1) {
            if (i10 != 2) {
                if ((i10 == 3 || i10 == 4 || i10 == 5) && this.f26059a != 0) {
                    this.f26059a = 0;
                    return;
                }
                return;
            }
            float min = Math.min(2.0f, (this.d - y3) / 8.0f);
            kg0 kg0Var = this.f26067w;
            int i11 = kg0Var.f27856f;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            lg0Var = null;
                        } else {
                            lg0Var = kg0Var.d;
                        }
                    } else {
                        lg0Var = kg0Var.f27854c;
                    }
                } else {
                    lg0Var = kg0Var.f27853b;
                }
            } else {
                lg0Var = kg0Var.f27852a;
            }
            int i12 = this.f26059a;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            if (i12 == 5) {
                                lg0Var.f28192e = Math.max(0.0f, Math.min(100.0f, lg0Var.f28192e + min));
                            }
                        } else {
                            lg0Var.d = Math.max(0.0f, Math.min(100.0f, lg0Var.d + min));
                        }
                    } else {
                        lg0Var.f28191c = Math.max(0.0f, Math.min(100.0f, lg0Var.f28191c + min));
                    }
                } else {
                    lg0Var.f28190b = Math.max(0.0f, Math.min(100.0f, lg0Var.f28190b + min));
                }
            } else {
                lg0Var.f28189a = Math.max(0.0f, Math.min(100.0f, lg0Var.f28189a + min));
            }
            invalidate();
            eg0 eg0Var = this.v;
            if (eg0Var != null) {
                og0 og0Var = ((gg0) eg0Var).f26433a;
                og0Var.g();
                o00 o00Var = og0Var.f29191l0;
                if (o00Var != null) {
                    o00Var.e(false, false, false);
                }
            }
            this.d = y3;
        } else if (this.f26059a != 0) {
        } else {
            sl0 sl0Var = this.f26062e;
            this.f26059a = (int) Math.floor(com.google.android.gms.internal.vision.e2.z(x10, sl0Var.f30587a, sl0Var.f30589c / 5.0f, 1.0f));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        lg0 lg0Var;
        int i10;
        String format;
        TextPaint textPaint = this.f26065r;
        Path path = this.f26066s;
        Paint paint = this.f26064n;
        kg0 kg0Var = this.f26067w;
        sl0 sl0Var = this.f26062e;
        float f7 = sl0Var.f30589c / 5.0f;
        for (int i11 = 0; i11 < 4; i11++) {
            float f10 = sl0Var.f30587a;
            float f11 = i11 * f7;
            float f12 = f10 + f7 + f11;
            float f13 = sl0Var.f30588b;
            canvas.drawLine(f12, f13, f11 + f10 + f7, f13 + sl0Var.d, this.f26063f);
        }
        float f14 = sl0Var.f30587a;
        float f15 = sl0Var.f30588b;
        canvas.drawLine(f14, f15 + sl0Var.d, f14 + sl0Var.f30589c, f15, this.h);
        int i12 = kg0Var.f27856f;
        int i13 = 3;
        int i14 = 2;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        lg0Var = null;
                    } else {
                        paint.setColor(-13404165);
                        lg0Var = kg0Var.d;
                    }
                } else {
                    paint.setColor(-15667555);
                    lg0Var = kg0Var.f27854c;
                }
            } else {
                paint.setColor(-1229492);
                lg0Var = kg0Var.f27853b;
            }
        } else {
            paint.setColor(-1);
            lg0Var = kg0Var.f27852a;
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
                                format = String.format(Locale.US, "%.2f", Float.valueOf(lg0Var.f28192e / 100.0f));
                            }
                        } else {
                            i10 = i14;
                            format = String.format(Locale.US, "%.2f", Float.valueOf(lg0Var.d / 100.0f));
                        }
                    } else {
                        i10 = i14;
                        format = String.format(Locale.US, "%.2f", Float.valueOf(lg0Var.f28191c / 100.0f));
                    }
                } else {
                    i10 = i14;
                    format = String.format(Locale.US, "%.2f", Float.valueOf(lg0Var.f28190b / 100.0f));
                }
            } else {
                i10 = i14;
                format = String.format(Locale.US, "%.2f", Float.valueOf(lg0Var.f28189a / 100.0f));
            }
            canvas.drawText(format, (i15 * f7) + com.google.android.gms.internal.vision.e2.z(f7, textPaint.measureText(format), 2.0f, sl0Var.f30587a), (sl0Var.f30588b + sl0Var.d) - AndroidUtilities.dp(4.0f), textPaint);
            i15++;
            i14 = i10;
            i13 = 3;
        }
        float[] a2 = lg0Var.a();
        invalidate();
        path.reset();
        for (int i16 = 0; i16 < a2.length / 2; i16++) {
            if (i16 == 0) {
                int i17 = i16 * 2;
                path.moveTo((a2[i17] * sl0Var.f30589c) + sl0Var.f30587a, ((1.0f - a2[i17 + 1]) * sl0Var.d) + sl0Var.f30588b);
            } else {
                int i18 = i16 * 2;
                path.lineTo((a2[i18] * sl0Var.f30589c) + sl0Var.f30587a, ((1.0f - a2[i18 + 1]) * sl0Var.d) + sl0Var.f30588b);
            }
        }
        canvas.drawPath(path, paint);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fg0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(eg0 eg0Var) {
        this.v = eg0Var;
    }
}
