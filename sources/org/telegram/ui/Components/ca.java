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
    public Bitmap f25248a;
    public Bitmap f25249b;
    public Paint f25250c;
    public int d;
    public int f25251e;
    public ba f25252f;

    public int getRating() {
        return this.f25251e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        Bitmap bitmap;
        Paint paint = this.f25250c;
        for (int i11 = 0; i11 < this.d; i11++) {
            if (i11 < this.f25251e) {
                i10 = org.telegram.ui.ActionBar.i6.f20965m5;
            } else {
                i10 = org.telegram.ui.ActionBar.i6.f21095t5;
            }
            paint.setColor(org.telegram.ui.ActionBar.i6.x0(null, i10, false));
            if (i11 < this.f25251e) {
                bitmap = this.f25248a;
            } else {
                bitmap = this.f25249b;
            }
            canvas.drawBitmap(bitmap, AndroidUtilities.dp(48.0f) * i11, 0.0f, paint);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = this.d;
        setMeasuredDimension(org.telegram.messenger.q.D(16.0f, i12 - 1, AndroidUtilities.dp(32.0f) * i12), AndroidUtilities.dp(32.0f));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        int i11;
        float dp = AndroidUtilities.dp(-8.0f);
        boolean z10 = false;
        for (int i12 = 0; i12 < this.d; i12++) {
            if (motionEvent.getX() > dp && motionEvent.getX() < AndroidUtilities.dp(48.0f) + dp && this.f25251e != (i10 = i12 + 1)) {
                this.f25251e = i10;
                ba baVar = this.f25252f;
                if (baVar != null) {
                    View view = ((me.a) baVar).f16337a;
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
        this.f25252f = baVar;
    }
}
