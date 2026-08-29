package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
public final class ve0 extends View {
    public int f33538a;
    public boolean f33539b;
    public boolean f33540c;
    public float d;
    public hk0 f33541e;
    public Paint f33542f;
    public Paint h;
    public Paint f33543n;
    public TextPaint f33544r;
    public Path f33545s;
    public ue0 v;
    public af0 f33546w;

    public final void a(int i10, MotionEvent motionEvent) {
        bf0 bf0Var;
        float x4 = motionEvent.getX();
        float y8 = motionEvent.getY();
        if (i10 != 1) {
            if (i10 != 2) {
                if ((i10 == 3 || i10 == 4 || i10 == 5) && this.f33538a != 0) {
                    this.f33538a = 0;
                    return;
                }
                return;
            }
            float min = Math.min(2.0f, (this.d - y8) / 8.0f);
            af0 af0Var = this.f33546w;
            int i11 = af0Var.f26765f;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            bf0Var = null;
                        } else {
                            bf0Var = af0Var.d;
                        }
                    } else {
                        bf0Var = af0Var.f26763c;
                    }
                } else {
                    bf0Var = af0Var.f26762b;
                }
            } else {
                bf0Var = af0Var.f26761a;
            }
            int i12 = this.f33538a;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            if (i12 == 5) {
                                bf0Var.f27069e = Math.max(0.0f, Math.min(100.0f, bf0Var.f27069e + min));
                            }
                        } else {
                            bf0Var.d = Math.max(0.0f, Math.min(100.0f, bf0Var.d + min));
                        }
                    } else {
                        bf0Var.f27068c = Math.max(0.0f, Math.min(100.0f, bf0Var.f27068c + min));
                    }
                } else {
                    bf0Var.f27067b = Math.max(0.0f, Math.min(100.0f, bf0Var.f27067b + min));
                }
            } else {
                bf0Var.f27066a = Math.max(0.0f, Math.min(100.0f, bf0Var.f27066a + min));
            }
            invalidate();
            ue0 ue0Var = this.v;
            if (ue0Var != null) {
                ef0 ef0Var = ((we0) ue0Var).f34394a;
                ef0Var.g();
                qz qzVar = ef0Var.f28034h0;
                if (qzVar != null) {
                    qzVar.e(false, false, false);
                }
            }
            this.d = y8;
        } else if (this.f33538a != 0) {
        } else {
            hk0 hk0Var = this.f33541e;
            this.f33538a = (int) Math.floor(com.google.android.recaptcha.internal.a.A(x4, hk0Var.f29195a, hk0Var.f29197c / 5.0f, 1.0f));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        bf0 bf0Var;
        String format;
        TextPaint textPaint = this.f33544r;
        Path path = this.f33545s;
        Paint paint = this.f33543n;
        af0 af0Var = this.f33546w;
        hk0 hk0Var = this.f33541e;
        float f9 = hk0Var.f29197c / 5.0f;
        for (int i10 = 0; i10 < 4; i10++) {
            float f10 = hk0Var.f29195a;
            float f11 = i10 * f9;
            float f12 = f10 + f9 + f11;
            float f13 = hk0Var.f29196b;
            canvas.drawLine(f12, f13, f11 + f10 + f9, f13 + hk0Var.d, this.f33542f);
        }
        float f14 = hk0Var.f29195a;
        float f15 = hk0Var.f29196b;
        canvas.drawLine(f14, f15 + hk0Var.d, f14 + hk0Var.f29197c, f15, this.h);
        int i11 = af0Var.f26765f;
        int i12 = 3;
        int i13 = 2;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        bf0Var = null;
                    } else {
                        paint.setColor(-13404165);
                        bf0Var = af0Var.d;
                    }
                } else {
                    paint.setColor(-15667555);
                    bf0Var = af0Var.f26763c;
                }
            } else {
                paint.setColor(-1229492);
                bf0Var = af0Var.f26762b;
            }
        } else {
            paint.setColor(-1);
            bf0Var = af0Var.f26761a;
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
                                format = String.format(Locale.US, "%.2f", Float.valueOf(bf0Var.f27069e / 100.0f));
                            }
                        } else {
                            format = String.format(Locale.US, "%.2f", Float.valueOf(bf0Var.d / 100.0f));
                        }
                    } else {
                        format = String.format(Locale.US, "%.2f", Float.valueOf(bf0Var.f27068c / 100.0f));
                    }
                } else {
                    format = String.format(Locale.US, "%.2f", Float.valueOf(bf0Var.f27067b / 100.0f));
                }
            } else {
                format = String.format(Locale.US, "%.2f", Float.valueOf(bf0Var.f27066a / 100.0f));
            }
            canvas.drawText(format, (i14 * f9) + com.google.android.recaptcha.internal.a.A(f9, textPaint.measureText(format), 2.0f, hk0Var.f29195a), (hk0Var.f29196b + hk0Var.d) - AndroidUtilities.dp(4.0f), textPaint);
            i14++;
            i12 = 3;
            i13 = 2;
        }
        float[] a2 = bf0Var.a();
        invalidate();
        path.reset();
        for (int i15 = 0; i15 < a2.length / 2; i15++) {
            if (i15 == 0) {
                int i16 = i15 * 2;
                path.moveTo((a2[i16] * hk0Var.f29197c) + hk0Var.f29195a, ((1.0f - a2[i16 + 1]) * hk0Var.d) + hk0Var.f29196b);
            } else {
                int i17 = i15 * 2;
                path.lineTo((a2[i17] * hk0Var.f29197c) + hk0Var.f29195a, ((1.0f - a2[i17 + 1]) * hk0Var.d) + hk0Var.f29196b);
            }
        }
        canvas.drawPath(path, paint);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ve0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(ue0 ue0Var) {
        this.v = ue0Var;
    }
}
