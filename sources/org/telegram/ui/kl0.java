package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
public final class kl0 extends FrameLayout {
    public TextView f38883a;
    public TextView f38884b;
    public ImageView f38885c;
    public boolean d;

    public final void a(String str, boolean z10) {
        this.f38883a.setText(str);
        this.f38884b.setText("");
        this.d = z10;
        setWillNotDraw(!z10);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i10;
        if (this.d) {
            if (org.telegram.messenger.cd.X) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.i0.L(20.0f);
            }
            float f7 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (org.telegram.messenger.cd.X) {
                i10 = org.telegram.messenger.i0.L(20.0f);
            } else {
                i10 = 0;
            }
            canvas.drawLine(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.f21052k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(64.0f) + (this.d ? 1 : 0), 1073741824));
    }

    public void setChecked(boolean z10) {
        int i10;
        ImageView imageView = this.f38885c;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        imageView.setVisibility(i10);
    }

    public void setNeedDivider(boolean z10) {
        this.d = z10;
        setWillNotDraw(!z10);
        invalidate();
    }

    public void setValue(CharSequence charSequence) {
        this.f38884b.setText(charSequence);
    }
}
