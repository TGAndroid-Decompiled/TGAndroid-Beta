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
    public int f22400a;
    public boolean f22401b;
    public boolean f22402c;
    public float d;
    public ik0 e;
    public Paint f22403f;
    public Paint h;
    public Paint f22404n;
    public TextPaint f22405r;
    public Path f22406s;
    public ze0 v;
    public ff0 f22407w;

    public final void a(int i10, MotionEvent motionEvent) {
        gf0 gf0Var;
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        if (i10 != 1) {
            if (i10 != 2) {
                if ((i10 == 3 || i10 == 4 || i10 == 5) && this.f22400a != 0) {
                    this.f22400a = 0;
                    return;
                }
                return;
            }
            float min = Math.min(2.0f, (this.d - y3) / 8.0f);
            ff0 ff0Var = this.f22407w;
            int i11 = ff0Var.f23910f;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            gf0Var = null;
                        } else {
                            gf0Var = ff0Var.d;
                        }
                    } else {
                        gf0Var = ff0Var.f23909c;
                    }
                } else {
                    gf0Var = ff0Var.f23908b;
                }
            } else {
                gf0Var = ff0Var.f23907a;
            }
            int i12 = this.f22400a;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            if (i12 == 5) {
                                gf0Var.e = Math.max(0.0f, Math.min(100.0f, gf0Var.e + min));
                            }
                        } else {
                            gf0Var.d = Math.max(0.0f, Math.min(100.0f, gf0Var.d + min));
                        }
                    } else {
                        gf0Var.f24207c = Math.max(0.0f, Math.min(100.0f, gf0Var.f24207c + min));
                    }
                } else {
                    gf0Var.f24206b = Math.max(0.0f, Math.min(100.0f, gf0Var.f24206b + min));
                }
            } else {
                gf0Var.f24205a = Math.max(0.0f, Math.min(100.0f, gf0Var.f24205a + min));
            }
            invalidate();
            ze0 ze0Var = this.v;
            if (ze0Var != null) {
                jf0 jf0Var = ((bf0) ze0Var).f22725a;
                jf0Var.g();
                vz vzVar = jf0Var.f25250l0;
                if (vzVar != null) {
                    vzVar.e(false, false, false);
                }
            }
            this.d = y3;
        } else if (this.f22400a != 0) {
        } else {
            ik0 ik0Var = this.e;
            this.f22400a = (int) Math.floor(com.google.android.gms.internal.vision.e2.A(x10, ik0Var.f24953a, ik0Var.f24955c / 5.0f, 1.0f));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        gf0 gf0Var;
        String format;
        TextPaint textPaint = this.f22405r;
        Path path = this.f22406s;
        Paint paint = this.f22404n;
        ff0 ff0Var = this.f22407w;
        ik0 ik0Var = this.e;
        float f7 = ik0Var.f24955c / 5.0f;
        for (int i10 = 0; i10 < 4; i10++) {
            float f10 = ik0Var.f24953a;
            float f11 = i10 * f7;
            float f12 = f10 + f7 + f11;
            float f13 = ik0Var.f24954b;
            canvas.drawLine(f12, f13, f11 + f10 + f7, f13 + ik0Var.d, this.f22403f);
        }
        float f14 = ik0Var.f24953a;
        float f15 = ik0Var.f24954b;
        canvas.drawLine(f14, f15 + ik0Var.d, f14 + ik0Var.f24955c, f15, this.h);
        int i11 = ff0Var.f23910f;
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
                    gf0Var = ff0Var.f23909c;
                }
            } else {
                paint.setColor(-1229492);
                gf0Var = ff0Var.f23908b;
            }
        } else {
            paint.setColor(-1);
            gf0Var = ff0Var.f23907a;
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
                                format = String.format(Locale.US, "%.2f", Float.valueOf(gf0Var.e / 100.0f));
                            }
                        } else {
                            format = String.format(Locale.US, "%.2f", Float.valueOf(gf0Var.d / 100.0f));
                        }
                    } else {
                        format = String.format(Locale.US, "%.2f", Float.valueOf(gf0Var.f24207c / 100.0f));
                    }
                } else {
                    format = String.format(Locale.US, "%.2f", Float.valueOf(gf0Var.f24206b / 100.0f));
                }
            } else {
                format = String.format(Locale.US, "%.2f", Float.valueOf(gf0Var.f24205a / 100.0f));
            }
            canvas.drawText(format, (i14 * f7) + com.google.android.gms.internal.vision.e2.A(f7, textPaint.measureText(format), 2.0f, ik0Var.f24953a), (ik0Var.f24954b + ik0Var.d) - AndroidUtilities.dp(4.0f), textPaint);
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
                path.moveTo((a2[i16] * ik0Var.f24955c) + ik0Var.f24953a, ((1.0f - a2[i16 + 1]) * ik0Var.d) + ik0Var.f24954b);
            } else {
                int i17 = i15 * 2;
                path.lineTo((a2[i17] * ik0Var.f24955c) + ik0Var.f24953a, ((1.0f - a2[i17 + 1]) * ik0Var.d) + ik0Var.f24954b);
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
