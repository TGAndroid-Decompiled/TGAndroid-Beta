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
public final class s9 extends View {
    public Bitmap f32400a;
    public Bitmap f32401b;
    public Paint f32402c;
    public int d;
    public int f32403e;
    public r9 f32404f;

    public int getRating() {
        return this.f32403e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i9;
        Bitmap bitmap;
        Paint paint = this.f32402c;
        for (int i10 = 0; i10 < this.d; i10++) {
            if (i10 < this.f32403e) {
                i9 = org.telegram.ui.ActionBar.f6.f23161m5;
            } else {
                i9 = org.telegram.ui.ActionBar.f6.f23284t5;
            }
            paint.setColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
            if (i10 < this.f32403e) {
                bitmap = this.f32400a;
            } else {
                bitmap = this.f32401b;
            }
            canvas.drawBitmap(bitmap, AndroidUtilities.dp(48.0f) * i10, 0.0f, paint);
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11 = this.d;
        setMeasuredDimension(org.telegram.messenger.l0.D(16.0f, i11 - 1, AndroidUtilities.dp(32.0f) * i11), AndroidUtilities.dp(32.0f));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i9;
        int i10;
        float dp = AndroidUtilities.dp(-8.0f);
        boolean z10 = false;
        for (int i11 = 0; i11 < this.d; i11++) {
            if (motionEvent.getX() > dp && motionEvent.getX() < AndroidUtilities.dp(48.0f) + dp && this.f32403e != (i9 = i11 + 1)) {
                this.f32403e = i9;
                r9 r9Var = this.f32404f;
                if (r9Var != null) {
                    View view = ((org.telegram.ui.Components.voip.t1) r9Var).f33858a;
                    if (i9 > 0) {
                        z10 = true;
                    }
                    view.setEnabled(z10);
                    TextView textView = (TextView) view;
                    if (i9 < 4) {
                        i10 = R.string.Next;
                    } else {
                        i10 = R.string.Send;
                    }
                    textView.setText(LocaleController.getString(i10).toUpperCase());
                }
                invalidate();
                return true;
            }
            dp += AndroidUtilities.dp(48.0f);
        }
        return true;
    }

    public void setOnRatingChangeListener(r9 r9Var) {
        this.f32404f = r9Var;
    }
}
