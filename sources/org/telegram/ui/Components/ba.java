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
public final class ba extends View {
    public Bitmap f24640a;
    public Bitmap f24641b;
    public Paint f24642c;
    public int d;
    public int f24643e;
    public aa f24644f;

    public int getRating() {
        return this.f24643e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        Bitmap bitmap;
        Paint paint = this.f24642c;
        for (int i11 = 0; i11 < this.d; i11++) {
            if (i11 < this.f24643e) {
                i10 = org.telegram.ui.ActionBar.j6.f20826m5;
            } else {
                i10 = org.telegram.ui.ActionBar.j6.f20953t5;
            }
            paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
            if (i11 < this.f24643e) {
                bitmap = this.f24640a;
            } else {
                bitmap = this.f24641b;
            }
            canvas.drawBitmap(bitmap, AndroidUtilities.dp(48.0f) * i11, 0.0f, paint);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = this.d;
        setMeasuredDimension(org.telegram.messenger.w1.D(16.0f, i12 - 1, AndroidUtilities.dp(32.0f) * i12), AndroidUtilities.dp(32.0f));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        int i11;
        float dp = AndroidUtilities.dp(-8.0f);
        boolean z10 = false;
        for (int i12 = 0; i12 < this.d; i12++) {
            if (motionEvent.getX() > dp && motionEvent.getX() < AndroidUtilities.dp(48.0f) + dp && this.f24643e != (i10 = i12 + 1)) {
                this.f24643e = i10;
                aa aaVar = this.f24644f;
                if (aaVar != null) {
                    View view = ((le.a) aaVar).f15364a;
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

    public void setOnRatingChangeListener(aa aaVar) {
        this.f24644f = aaVar;
    }
}
