package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
public final class o9 extends View {
    public Bitmap f36782a;
    public Bitmap f36783b;
    public Paint f36784c;
    public int d;
    public int f36785e;
    public n9 f36786f;

    public int getRating() {
        return this.f36785e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i3;
        Bitmap bitmap;
        Paint paint = this.f36784c;
        for (int i10 = 0; i10 < this.d; i10++) {
            if (i10 < this.f36785e) {
                i3 = org.telegram.ui.ActionBar.k6.f28042m5;
            } else {
                i3 = org.telegram.ui.ActionBar.k6.f28176t5;
            }
            paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, i3, false));
            if (i10 < this.f36785e) {
                bitmap = this.f36782a;
            } else {
                bitmap = this.f36783b;
            }
            canvas.drawBitmap(bitmap, org.telegram.messenger.g0.L(48.0f) * i10, 0.0f, paint);
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int i11 = this.d;
        setMeasuredDimension(org.telegram.messenger.k5.D(16.0f, i11 - 1, org.telegram.messenger.g0.L(32.0f) * i11), org.telegram.messenger.g0.L(32.0f));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i3;
        int i10;
        float L = org.telegram.messenger.g0.L(-8.0f);
        boolean z10 = false;
        for (int i11 = 0; i11 < this.d; i11++) {
            if (motionEvent.getX() > L && motionEvent.getX() < org.telegram.messenger.g0.L(48.0f) + L && this.f36785e != (i3 = i11 + 1)) {
                this.f36785e = i3;
                n9 n9Var = this.f36786f;
                if (n9Var != null) {
                    View view = ((org.telegram.ui.Components.voip.d1) n9Var).f39287a;
                    if (i3 > 0) {
                        z10 = true;
                    }
                    view.setEnabled(z10);
                    TextView textView = (TextView) view;
                    if (i3 < 4) {
                        i10 = 2131748258;
                    } else {
                        i10 = 2131745650;
                    }
                    textView.setText(org.telegram.messenger.bd.M0(i10, null).toUpperCase());
                }
                invalidate();
                return true;
            }
            L += org.telegram.messenger.g0.L(48.0f);
        }
        return true;
    }

    public void setOnRatingChangeListener(n9 n9Var) {
        this.f36786f = n9Var;
    }
}
