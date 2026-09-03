package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
public final class gf0 extends View {
    public int f27151a;
    public boolean f27152b;
    public boolean f27153c;
    public float d;
    public sk0 f27154e;
    public Paint f27155f;
    public Paint h;
    public Paint f27156n;
    public TextPaint f27157r;
    public Path f27158s;
    public ff0 v;
    public lf0 f27159w;

    public final void a(int i10, MotionEvent motionEvent) {
        mf0 mf0Var;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (i10 != 1) {
            if (i10 != 2) {
                if ((i10 == 3 || i10 == 4 || i10 == 5) && this.f27151a != 0) {
                    this.f27151a = 0;
                    return;
                }
                return;
            }
            float min = Math.min(2.0f, (this.d - y10) / 8.0f);
            lf0 lf0Var = this.f27159w;
            int i11 = lf0Var.f28733f;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            mf0Var = null;
                        } else {
                            mf0Var = lf0Var.d;
                        }
                    } else {
                        mf0Var = lf0Var.f28731c;
                    }
                } else {
                    mf0Var = lf0Var.f28730b;
                }
            } else {
                mf0Var = lf0Var.f28729a;
            }
            int i12 = this.f27151a;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            if (i12 == 5) {
                                mf0Var.f29040e = Math.max(0.0f, Math.min(100.0f, mf0Var.f29040e + min));
                            }
                        } else {
                            mf0Var.d = Math.max(0.0f, Math.min(100.0f, mf0Var.d + min));
                        }
                    } else {
                        mf0Var.f29039c = Math.max(0.0f, Math.min(100.0f, mf0Var.f29039c + min));
                    }
                } else {
                    mf0Var.f29038b = Math.max(0.0f, Math.min(100.0f, mf0Var.f29038b + min));
                }
            } else {
                mf0Var.f29037a = Math.max(0.0f, Math.min(100.0f, mf0Var.f29037a + min));
            }
            invalidate();
            ff0 ff0Var = this.v;
            if (ff0Var != null) {
                pf0 pf0Var = ((hf0) ff0Var).f27499a;
                pf0Var.g();
                xz xzVar = pf0Var.f30060i0;
                if (xzVar != null) {
                    xzVar.e(false, false, false);
                }
            }
            this.d = y10;
        } else if (this.f27151a != 0) {
        } else {
            sk0 sk0Var = this.f27154e;
            this.f27151a = (int) Math.floor(e2.c.x(x10, sk0Var.f31078a, sk0Var.f31080c / 5.0f, 1.0f));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        mf0 mf0Var;
        String format;
        TextPaint textPaint = this.f27157r;
        Path path = this.f27158s;
        Paint paint = this.f27156n;
        lf0 lf0Var = this.f27159w;
        sk0 sk0Var = this.f27154e;
        float f10 = sk0Var.f31080c / 5.0f;
        for (int i10 = 0; i10 < 4; i10++) {
            float f11 = sk0Var.f31078a;
            float f12 = i10 * f10;
            float f13 = f11 + f10 + f12;
            float f14 = sk0Var.f31079b;
            canvas.drawLine(f13, f14, f12 + f11 + f10, f14 + sk0Var.d, this.f27155f);
        }
        float f15 = sk0Var.f31078a;
        float f16 = sk0Var.f31079b;
        canvas.drawLine(f15, f16 + sk0Var.d, f15 + sk0Var.f31080c, f16, this.h);
        int i11 = lf0Var.f28733f;
        int i12 = 3;
        int i13 = 2;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        mf0Var = null;
                    } else {
                        paint.setColor(-13404165);
                        mf0Var = lf0Var.d;
                    }
                } else {
                    paint.setColor(-15667555);
                    mf0Var = lf0Var.f28731c;
                }
            } else {
                paint.setColor(-1229492);
                mf0Var = lf0Var.f28730b;
            }
        } else {
            paint.setColor(-1);
            mf0Var = lf0Var.f28729a;
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
                                format = String.format(Locale.US, "%.2f", Float.valueOf(mf0Var.f29040e / 100.0f));
                            }
                        } else {
                            format = String.format(Locale.US, "%.2f", Float.valueOf(mf0Var.d / 100.0f));
                        }
                    } else {
                        format = String.format(Locale.US, "%.2f", Float.valueOf(mf0Var.f29039c / 100.0f));
                    }
                } else {
                    format = String.format(Locale.US, "%.2f", Float.valueOf(mf0Var.f29038b / 100.0f));
                }
            } else {
                format = String.format(Locale.US, "%.2f", Float.valueOf(mf0Var.f29037a / 100.0f));
            }
            canvas.drawText(format, (i14 * f10) + e2.c.x(f10, textPaint.measureText(format), 2.0f, sk0Var.f31078a), (sk0Var.f31079b + sk0Var.d) - AndroidUtilities.dp(4.0f), textPaint);
            i14++;
            i12 = 3;
            i13 = 2;
        }
        float[] a2 = mf0Var.a();
        invalidate();
        path.reset();
        for (int i15 = 0; i15 < a2.length / 2; i15++) {
            if (i15 == 0) {
                int i16 = i15 * 2;
                path.moveTo((a2[i16] * sk0Var.f31080c) + sk0Var.f31078a, ((1.0f - a2[i16 + 1]) * sk0Var.d) + sk0Var.f31079b);
            } else {
                int i17 = i15 * 2;
                path.lineTo((a2[i17] * sk0Var.f31080c) + sk0Var.f31078a, ((1.0f - a2[i17 + 1]) * sk0Var.d) + sk0Var.f31079b);
            }
        }
        canvas.drawPath(path, paint);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gf0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(ff0 ff0Var) {
        this.v = ff0Var;
    }
}
