package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
public final class p9 extends View {
    public Bitmap f36944a;
    public Bitmap f36945b;
    public Paint f36946c;
    public int d;
    public int f36947e;
    public o9 f36948f;

    public int getRating() {
        return this.f36947e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        Bitmap bitmap;
        Paint paint = this.f36946c;
        for (int i10 = 0; i10 < this.d; i10++) {
            if (i10 < this.f36947e) {
                i7 = org.telegram.ui.ActionBar.k6.f28012m5;
            } else {
                i7 = org.telegram.ui.ActionBar.k6.f28144t5;
            }
            paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, i7, false));
            if (i10 < this.f36947e) {
                bitmap = this.f36944a;
            } else {
                bitmap = this.f36945b;
            }
            canvas.drawBitmap(bitmap, org.telegram.messenger.g0.L(48.0f) * i10, 0.0f, paint);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11 = this.d;
        setMeasuredDimension(org.telegram.messenger.k5.D(16.0f, i11 - 1, org.telegram.messenger.g0.L(32.0f) * i11), org.telegram.messenger.g0.L(32.0f));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i7;
        int i10;
        float L = org.telegram.messenger.g0.L(-8.0f);
        boolean z9 = false;
        for (int i11 = 0; i11 < this.d; i11++) {
            if (motionEvent.getX() > L && motionEvent.getX() < org.telegram.messenger.g0.L(48.0f) + L && this.f36947e != (i7 = i11 + 1)) {
                this.f36947e = i7;
                o9 o9Var = this.f36948f;
                if (o9Var != null) {
                    View view = ((org.telegram.ui.Components.voip.o1) o9Var).f39385a;
                    if (i7 > 0) {
                        z9 = true;
                    }
                    view.setEnabled(z9);
                    TextView textView = (TextView) view;
                    if (i7 < 4) {
                        i10 = 2131748249;
                    } else {
                        i10 = 2131745641;
                    }
                    textView.setText(org.telegram.messenger.hd.M0(i10, null).toUpperCase());
                }
                invalidate();
                return true;
            }
            L += org.telegram.messenger.g0.L(48.0f);
        }
        return true;
    }

    public void setOnRatingChangeListener(o9 o9Var) {
        this.f36948f = o9Var;
    }
}
