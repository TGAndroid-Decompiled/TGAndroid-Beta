package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
public final class k9 extends View {
    public Bitmap f27694a;
    public Bitmap f27695b;
    public Paint f27696c;
    public int d;
    public int e;
    public j9 f27697f;

    public int getRating() {
        return this.e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        Bitmap bitmap;
        Paint paint = this.f27696c;
        for (int i11 = 0; i11 < this.d; i11++) {
            if (i11 < this.e) {
                i10 = org.telegram.ui.ActionBar.t6.f21094m5;
            } else {
                i10 = org.telegram.ui.ActionBar.t6.f21222t5;
            }
            paint.setColor(org.telegram.ui.ActionBar.t6.x0(null, i10, false));
            if (i11 < this.e) {
                bitmap = this.f27694a;
            } else {
                bitmap = this.f27695b;
            }
            canvas.drawBitmap(bitmap, org.telegram.messenger.i0.L(48.0f) * i11, 0.0f, paint);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = this.d;
        setMeasuredDimension(org.telegram.messenger.m5.D(16.0f, i12 - 1, org.telegram.messenger.i0.L(32.0f) * i12), org.telegram.messenger.i0.L(32.0f));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        int i11;
        float L = org.telegram.messenger.i0.L(-8.0f);
        boolean z10 = false;
        for (int i12 = 0; i12 < this.d; i12++) {
            if (motionEvent.getX() > L && motionEvent.getX() < org.telegram.messenger.i0.L(48.0f) + L && this.e != (i10 = i12 + 1)) {
                this.e = i10;
                j9 j9Var = this.f27697f;
                if (j9Var != null) {
                    View view = ((fe.a) j9Var).f7017a;
                    if (i10 > 0) {
                        z10 = true;
                    }
                    view.setEnabled(z10);
                    TextView textView = (TextView) view;
                    if (i10 < 4) {
                        i11 = 2131748267;
                    } else {
                        i11 = 2131745657;
                    }
                    textView.setText(org.telegram.messenger.cd.L0(i11, null).toUpperCase());
                }
                invalidate();
                return true;
            }
            L += org.telegram.messenger.i0.L(48.0f);
        }
        return true;
    }

    public void setOnRatingChangeListener(j9 j9Var) {
        this.f27697f = j9Var;
    }
}
