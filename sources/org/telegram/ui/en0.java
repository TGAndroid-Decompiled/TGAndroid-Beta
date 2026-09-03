package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class en0 extends FrameLayout {
    public TextView f33830a;
    public TextView f33831b;
    public ImageView f33832c;
    public boolean d;

    public final void a(String str, boolean z4) {
        this.f33830a.setText(str);
        this.f33831b.setText("");
        this.d = z4;
        setWillNotDraw(!z4);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        if (this.d) {
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(20.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(20.0f);
            } else {
                i10 = 0;
            }
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f20000k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.d ? 1 : 0), 1073741824));
    }

    public void setChecked(boolean z4) {
        int i10;
        ImageView imageView = this.f33832c;
        if (z4) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        imageView.setVisibility(i10);
    }

    public void setNeedDivider(boolean z4) {
        this.d = z4;
        setWillNotDraw(!z4);
        invalidate();
    }

    public void setValue(CharSequence charSequence) {
        this.f33831b.setText(charSequence);
    }
}
