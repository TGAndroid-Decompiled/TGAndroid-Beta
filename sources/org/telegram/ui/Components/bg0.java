package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
public final class bg0 extends View {
    public int f25003a;
    public boolean f25004b;
    public boolean f25005c;
    public float d;
    public ml0 f25006e;
    public Paint f25007f;
    public Paint h;
    public Paint f25008n;
    public TextPaint f25009r;
    public Path f25010s;
    public ag0 v;
    public gg0 f25011w;

    public final void a(int i10, MotionEvent motionEvent) {
        hg0 hg0Var;
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        if (i10 != 1) {
            if (i10 != 2) {
                if ((i10 == 3 || i10 == 4 || i10 == 5) && this.f25003a != 0) {
                    this.f25003a = 0;
                    return;
                }
                return;
            }
            float min = Math.min(2.0f, (this.d - y3) / 8.0f);
            gg0 gg0Var = this.f25011w;
            int i11 = gg0Var.f26695f;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            hg0Var = null;
                        } else {
                            hg0Var = gg0Var.d;
                        }
                    } else {
                        hg0Var = gg0Var.f26693c;
                    }
                } else {
                    hg0Var = gg0Var.f26692b;
                }
            } else {
                hg0Var = gg0Var.f26691a;
            }
            int i12 = this.f25003a;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            if (i12 == 5) {
                                hg0Var.f27067e = Math.max(0.0f, Math.min(100.0f, hg0Var.f27067e + min));
                            }
                        } else {
                            hg0Var.d = Math.max(0.0f, Math.min(100.0f, hg0Var.d + min));
                        }
                    } else {
                        hg0Var.f27066c = Math.max(0.0f, Math.min(100.0f, hg0Var.f27066c + min));
                    }
                } else {
                    hg0Var.f27065b = Math.max(0.0f, Math.min(100.0f, hg0Var.f27065b + min));
                }
            } else {
                hg0Var.f27064a = Math.max(0.0f, Math.min(100.0f, hg0Var.f27064a + min));
            }
            invalidate();
            ag0 ag0Var = this.v;
            if (ag0Var != null) {
                kg0 kg0Var = ((cg0) ag0Var).f25369a;
                kg0Var.g();
                l00 l00Var = kg0Var.f27987l0;
                if (l00Var != null) {
                    l00Var.e(false, false, false);
                }
            }
            this.d = y3;
        } else if (this.f25003a != 0) {
        } else {
            ml0 ml0Var = this.f25006e;
            this.f25003a = (int) Math.floor(com.google.android.gms.internal.vision.e2.z(x10, ml0Var.f28854a, ml0Var.f28856c / 5.0f, 1.0f));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        hg0 hg0Var;
        int i10;
        String format;
        TextPaint textPaint = this.f25009r;
        Path path = this.f25010s;
        Paint paint = this.f25008n;
        gg0 gg0Var = this.f25011w;
        ml0 ml0Var = this.f25006e;
        float f7 = ml0Var.f28856c / 5.0f;
        for (int i11 = 0; i11 < 4; i11++) {
            float f10 = ml0Var.f28854a;
            float f11 = i11 * f7;
            float f12 = f10 + f7 + f11;
            float f13 = ml0Var.f28855b;
            canvas.drawLine(f12, f13, f11 + f10 + f7, f13 + ml0Var.d, this.f25007f);
        }
        float f14 = ml0Var.f28854a;
        float f15 = ml0Var.f28855b;
        canvas.drawLine(f14, f15 + ml0Var.d, f14 + ml0Var.f28856c, f15, this.h);
        int i12 = gg0Var.f26695f;
        int i13 = 3;
        int i14 = 2;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        hg0Var = null;
                    } else {
                        paint.setColor(-13404165);
                        hg0Var = gg0Var.d;
                    }
                } else {
                    paint.setColor(-15667555);
                    hg0Var = gg0Var.f26693c;
                }
            } else {
                paint.setColor(-1229492);
                hg0Var = gg0Var.f26692b;
            }
        } else {
            paint.setColor(-1);
            hg0Var = gg0Var.f26691a;
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
                                format = String.format(Locale.US, "%.2f", Float.valueOf(hg0Var.f27067e / 100.0f));
                            }
                        } else {
                            i10 = i14;
                            format = String.format(Locale.US, "%.2f", Float.valueOf(hg0Var.d / 100.0f));
                        }
                    } else {
                        i10 = i14;
                        format = String.format(Locale.US, "%.2f", Float.valueOf(hg0Var.f27066c / 100.0f));
                    }
                } else {
                    i10 = i14;
                    format = String.format(Locale.US, "%.2f", Float.valueOf(hg0Var.f27065b / 100.0f));
                }
            } else {
                i10 = i14;
                format = String.format(Locale.US, "%.2f", Float.valueOf(hg0Var.f27064a / 100.0f));
            }
            canvas.drawText(format, (i15 * f7) + com.google.android.gms.internal.vision.e2.z(f7, textPaint.measureText(format), 2.0f, ml0Var.f28854a), (ml0Var.f28855b + ml0Var.d) - AndroidUtilities.dp(4.0f), textPaint);
            i15++;
            i14 = i10;
            i13 = 3;
        }
        float[] a2 = hg0Var.a();
        invalidate();
        path.reset();
        for (int i16 = 0; i16 < a2.length / 2; i16++) {
            if (i16 == 0) {
                int i17 = i16 * 2;
                path.moveTo((a2[i17] * ml0Var.f28856c) + ml0Var.f28854a, ((1.0f - a2[i17 + 1]) * ml0Var.d) + ml0Var.f28855b);
            } else {
                int i18 = i16 * 2;
                path.lineTo((a2[i18] * ml0Var.f28856c) + ml0Var.f28854a, ((1.0f - a2[i18 + 1]) * ml0Var.d) + ml0Var.f28855b);
            }
        }
        canvas.drawPath(path, paint);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bg0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(ag0 ag0Var) {
        this.v = ag0Var;
    }
}
