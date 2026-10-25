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
public final class da extends View {
    public Bitmap f27455a;
    public Bitmap f27456b;
    public Paint f27457c;
    public int d;
    public int e;
    public ca f27458f;

    public int getRating() {
        return this.e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        Bitmap bitmap;
        Paint paint = this.f27457c;
        for (int i11 = 0; i11 < this.d; i11++) {
            if (i11 < this.e) {
                i10 = org.telegram.ui.ActionBar.y6.f23517m5;
            } else {
                i10 = org.telegram.ui.ActionBar.y6.f23651t5;
            }
            paint.setColor(org.telegram.ui.ActionBar.y6.x0(null, i10, false));
            if (i11 < this.e) {
                bitmap = this.f27455a;
            } else {
                bitmap = this.f27456b;
            }
            canvas.drawBitmap(bitmap, AndroidUtilities.dp(48.0f) * i11, 0.0f, paint);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = this.d;
        setMeasuredDimension(org.telegram.messenger.vh.b(16.0f, i12 - 1, AndroidUtilities.dp(32.0f) * i12), AndroidUtilities.dp(32.0f));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        int i11;
        float dp = AndroidUtilities.dp(-8.0f);
        boolean z10 = false;
        for (int i12 = 0; i12 < this.d; i12++) {
            if (motionEvent.getX() > dp && motionEvent.getX() < AndroidUtilities.dp(48.0f) + dp && this.e != (i10 = i12 + 1)) {
                this.e = i10;
                ca caVar = this.f27458f;
                if (caVar != null) {
                    View view = ((oe.a) caVar).f19323a;
                    if (i10 > 0) {
                        z10 = true;
                    }
                    view.setEnabled(z10);
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

    public void setOnRatingChangeListener(ca caVar) {
        this.f27458f = caVar;
    }
}
