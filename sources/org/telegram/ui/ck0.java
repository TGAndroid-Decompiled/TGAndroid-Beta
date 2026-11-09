package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
public final class ck0 extends FrameLayout {
    public TextView f44352a;
    public TextView f44353b;
    public ImageView f44354c;
    public boolean d;

    public final void a(String str, boolean z9) {
        this.f44352a.setText(str);
        this.f44353b.setText("");
        this.d = z9;
        setWillNotDraw(!z9);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i7;
        if (this.d) {
            if (org.telegram.messenger.id.f23157a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(20.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (org.telegram.messenger.id.f23157a0) {
                i7 = org.telegram.messenger.g0.L(20.0f);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.l6.f27988k0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(64.0f) + (this.d ? 1 : 0), 1073741824));
    }

    public void setChecked(boolean z9) {
        int i7;
        ImageView imageView = this.f44354c;
        if (z9) {
            i7 = 0;
        } else {
            i7 = 4;
        }
        imageView.setVisibility(i7);
    }

    public void setNeedDivider(boolean z9) {
        this.d = z9;
        setWillNotDraw(!z9);
        invalidate();
    }

    public void setValue(CharSequence charSequence) {
        this.f44353b.setText(charSequence);
    }
}
