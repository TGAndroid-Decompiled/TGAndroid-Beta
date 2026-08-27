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

public final class r9 extends View {

    public Bitmap f32108a;

    public Bitmap f32109b;

    public Paint f32110c;
    public int d;

    public int f32111e;

    public q9 f32112f;

    public int getRating() {
        return this.f32111e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.f32110c;
        int i10 = 0;
        while (i10 < this.d) {
            paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, i10 < this.f32111e ? org.telegram.ui.ActionBar.g6.f23214m5 : org.telegram.ui.ActionBar.g6.f23338t5, false));
            canvas.drawBitmap(i10 < this.f32111e ? this.f32108a : this.f32109b, AndroidUtilities.dp(48.0f) * i10, 0.0f, paint);
            i10++;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = this.d;
        setMeasuredDimension(org.telegram.messenger.y1.D(16.0f, i12 - 1, AndroidUtilities.dp(32.0f) * i12), AndroidUtilities.dp(32.0f));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        float fDp = AndroidUtilities.dp(-8.0f);
        for (int i11 = 0; i11 < this.d; i11++) {
            if (motionEvent.getX() > fDp && motionEvent.getX() < AndroidUtilities.dp(48.0f) + fDp && this.f32111e != (i10 = i11 + 1)) {
                this.f32111e = i10;
                q9 q9Var = this.f32112f;
                if (q9Var != null) {
                    View view = ((org.telegram.ui.Components.voip.t1) q9Var).f33908a;
                    view.setEnabled(i10 > 0);
                    ((TextView) view).setText(LocaleController.getString(i10 < 4 ? R.string.Next : R.string.Send).toUpperCase());
                }
                invalidate();
                return true;
            }
            fDp += AndroidUtilities.dp(48.0f);
        }
        return true;
    }

    public void setOnRatingChangeListener(q9 q9Var) {
        this.f32112f = q9Var;
    }
}
