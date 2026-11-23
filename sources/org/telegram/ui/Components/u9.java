package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
public final class u9 extends View {
    public Bitmap f40278a;
    public Bitmap f40279b;
    public Paint f40280c;
    public int d;
    public int f40281e;
    public t9 f40282f;

    public int getRating() {
        return this.f40281e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        Bitmap bitmap;
        Paint paint = this.f40280c;
        for (int i10 = 0; i10 < this.d; i10++) {
            if (i10 < this.f40281e) {
                i7 = org.telegram.ui.ActionBar.m6.f29511m5;
            } else {
                i7 = org.telegram.ui.ActionBar.m6.f29643t5;
            }
            paint.setColor(org.telegram.ui.ActionBar.m6.x0(null, i7, false));
            if (i10 < this.f40281e) {
                bitmap = this.f40278a;
            } else {
                bitmap = this.f40279b;
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
            if (motionEvent.getX() > L && motionEvent.getX() < org.telegram.messenger.g0.L(48.0f) + L && this.f40281e != (i7 = i11 + 1)) {
                this.f40281e = i7;
                t9 t9Var = this.f40282f;
                if (t9Var != null) {
                    View view = ((org.telegram.ui.Components.voip.r1) t9Var).f41287a;
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
                    textView.setText(org.telegram.messenger.hd.N0(i10, null).toUpperCase());
                }
                invalidate();
                return true;
            }
            L += org.telegram.messenger.g0.L(48.0f);
        }
        return true;
    }

    public void setOnRatingChangeListener(t9 t9Var) {
        this.f40282f = t9Var;
    }
}
