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
public final class ca extends View {
    public Bitmap f24886a;
    public Bitmap f24887b;
    public Paint f24888c;
    public int d;
    public int f24889e;
    public ba f24890f;

    public int getRating() {
        return this.f24889e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        Bitmap bitmap;
        Paint paint = this.f24888c;
        for (int i11 = 0; i11 < this.d; i11++) {
            if (i11 < this.f24889e) {
                i10 = org.telegram.ui.ActionBar.h6.f20724m5;
            } else {
                i10 = org.telegram.ui.ActionBar.h6.f20856t5;
            }
            paint.setColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
            if (i11 < this.f24889e) {
                bitmap = this.f24886a;
            } else {
                bitmap = this.f24887b;
            }
            canvas.drawBitmap(bitmap, AndroidUtilities.dp(48.0f) * i11, 0.0f, paint);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = this.d;
        setMeasuredDimension(org.telegram.messenger.v0.D(16.0f, i12 - 1, AndroidUtilities.dp(32.0f) * i12), AndroidUtilities.dp(32.0f));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        int i11;
        float dp = AndroidUtilities.dp(-8.0f);
        boolean z10 = false;
        for (int i12 = 0; i12 < this.d; i12++) {
            if (motionEvent.getX() > dp && motionEvent.getX() < AndroidUtilities.dp(48.0f) + dp && this.f24889e != (i10 = i12 + 1)) {
                this.f24889e = i10;
                ba baVar = this.f24890f;
                if (baVar != null) {
                    View view = ((me.a) baVar).f16084a;
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

    public void setOnRatingChangeListener(ba baVar) {
        this.f24890f = baVar;
    }
}
