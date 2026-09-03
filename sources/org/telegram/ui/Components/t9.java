package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class t9 extends View {
    public Bitmap f31305a;
    public Bitmap f31306b;
    public Paint f31307c;
    public int d;
    public int f31308e;
    public s9 f31309f;

    public int getRating() {
        return this.f31308e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        Bitmap bitmap;
        Paint paint = this.f31307c;
        for (int i11 = 0; i11 < this.d; i11++) {
            if (i11 < this.f31308e) {
                i10 = org.telegram.ui.ActionBar.k6.f21822m5;
            } else {
                i10 = org.telegram.ui.ActionBar.k6.f21946t5;
            }
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
            if (i11 < this.f31308e) {
                bitmap = this.f31305a;
            } else {
                bitmap = this.f31306b;
            }
            canvas.drawBitmap(bitmap, AndroidUtilities.dp(48.0f) * i11, 0.0f, paint);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = this.d;
        setMeasuredDimension(org.telegram.messenger.y3.D(16.0f, i12 - 1, AndroidUtilities.dp(32.0f) * i12), AndroidUtilities.dp(32.0f));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        int i11;
        float dp = AndroidUtilities.dp(-8.0f);
        boolean z4 = false;
        for (int i12 = 0; i12 < this.d; i12++) {
            if (motionEvent.getX() > dp && motionEvent.getX() < AndroidUtilities.dp(48.0f) + dp && this.f31308e != (i10 = i12 + 1)) {
                this.f31308e = i10;
                s9 s9Var = this.f31309f;
                if (s9Var != null) {
                    View view = ((org.telegram.ui.Components.voip.u1) s9Var).f32402a;
                    if (i10 > 0) {
                        z4 = true;
                    }
                    view.setEnabled(z4);
                    TextView textView = (TextView) view;
                    if (i10 < 4) {
                        i11 = R.string.Next;
                    } else {
                        i11 = R.string.Send;
                    }
                    textView.setText(LocaleController.getString(i11).toUpperCase());
                }
                invalidate();
                return true;
            }
            dp += AndroidUtilities.dp(48.0f);
        }
        return true;
    }

    public void setOnRatingChangeListener(s9 s9Var) {
        this.f31309f = s9Var;
    }
}
