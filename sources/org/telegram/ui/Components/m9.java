package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
public final class m9 extends View {
    public Bitmap f37171a;
    public Bitmap f37172b;
    public Paint f37173c;
    public int d;
    public int f37174e;
    public l9 f37175f;

    public int getRating() {
        return this.f37174e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        Bitmap bitmap;
        Paint paint = this.f37173c;
        for (int i10 = 0; i10 < this.d; i10++) {
            if (i10 < this.f37174e) {
                i7 = org.telegram.ui.ActionBar.j6.f29013m5;
            } else {
                i7 = org.telegram.ui.ActionBar.j6.f29145t5;
            }
            paint.setColor(org.telegram.ui.ActionBar.j6.x0(null, i7, false));
            if (i10 < this.f37174e) {
                bitmap = this.f37171a;
            } else {
                bitmap = this.f37172b;
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
        boolean z10 = false;
        for (int i11 = 0; i11 < this.d; i11++) {
            if (motionEvent.getX() > L && motionEvent.getX() < org.telegram.messenger.g0.L(48.0f) + L && this.f37174e != (i7 = i11 + 1)) {
                this.f37174e = i7;
                l9 l9Var = this.f37175f;
                if (l9Var != null) {
                    View view = ((org.telegram.ui.Components.voip.s1) l9Var).f40941a;
                    if (i7 > 0) {
                        z10 = true;
                    }
                    view.setEnabled(z10);
                    TextView textView = (TextView) view;
                    if (i7 < 4) {
                        i10 = 2131748250;
                    } else {
                        i10 = 2131745640;
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

    public void setOnRatingChangeListener(l9 l9Var) {
        this.f37175f = l9Var;
    }
}
