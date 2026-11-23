package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
public final class t9 extends View {
    public Bitmap f39871a;
    public Bitmap f39872b;
    public Paint f39873c;
    public int d;
    public int f39874e;
    public s9 f39875f;

    public int getRating() {
        return this.f39874e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        Bitmap bitmap;
        Paint paint = this.f39873c;
        for (int i10 = 0; i10 < this.d; i10++) {
            if (i10 < this.f39874e) {
                i7 = org.telegram.ui.ActionBar.n6.f29615m5;
            } else {
                i7 = org.telegram.ui.ActionBar.n6.f29747t5;
            }
            paint.setColor(org.telegram.ui.ActionBar.n6.x0(null, i7, false));
            if (i10 < this.f39874e) {
                bitmap = this.f39871a;
            } else {
                bitmap = this.f39872b;
            }
            canvas.drawBitmap(bitmap, org.telegram.messenger.g0.L(48.0f) * i10, 0.0f, paint);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11 = this.d;
        setMeasuredDimension(org.telegram.messenger.f3.D(16.0f, i11 - 1, org.telegram.messenger.g0.L(32.0f) * i11), org.telegram.messenger.g0.L(32.0f));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i7;
        int i10;
        float L = org.telegram.messenger.g0.L(-8.0f);
        boolean z10 = false;
        for (int i11 = 0; i11 < this.d; i11++) {
            if (motionEvent.getX() > L && motionEvent.getX() < org.telegram.messenger.g0.L(48.0f) + L && this.f39874e != (i7 = i11 + 1)) {
                this.f39874e = i7;
                s9 s9Var = this.f39875f;
                if (s9Var != null) {
                    View view = ((org.telegram.ui.Components.voip.s1) s9Var).f41221a;
                    if (i7 > 0) {
                        z10 = true;
                    }
                    view.setEnabled(z10);
                    TextView textView = (TextView) view;
                    if (i7 < 4) {
                        i10 = 2131748057;
                    } else {
                        i10 = 2131745444;
                    }
                    textView.setText(org.telegram.messenger.gd.N0(i10, null).toUpperCase());
                }
                invalidate();
                return true;
            }
            L += org.telegram.messenger.g0.L(48.0f);
        }
        return true;
    }

    public void setOnRatingChangeListener(s9 s9Var) {
        this.f39875f = s9Var;
    }
}
