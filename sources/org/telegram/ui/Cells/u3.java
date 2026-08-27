package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.rl;

public abstract class u3 extends FrameLayout {

    public org.telegram.ui.ActionBar.h5 f25697a;

    public org.telegram.ui.ActionBar.h5 f25698b;

    public ImageView f25699c;
    public ImageView d;

    public int f25700e;

    public boolean f25701f;
    public int h;

    public int f25702n;

    public Paint f25703r;

    public final void a(int i10, int i11) {
        org.telegram.ui.ActionBar.h5 h5Var = this.f25697a;
        h5Var.setTextColor(i11);
        h5Var.setTag(null);
        ImageView imageView = this.f25699c;
        imageView.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
        imageView.setTag(null);
    }

    public final void b(int i10, String str, boolean z10) {
        this.f25697a.l(str, false);
        org.telegram.ui.ActionBar.h5 h5Var = this.f25698b;
        h5Var.l(null, false);
        ImageView imageView = this.f25699c;
        imageView.setImageResource(i10);
        imageView.setVisibility(0);
        h5Var.setVisibility(8);
        this.d.setVisibility(8);
        imageView.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        this.f25701f = z10;
        setWillNotDraw(!z10);
    }

    public org.telegram.ui.ActionBar.h5 getTextView() {
        return this.f25697a;
    }

    public ImageView getValueImageView() {
        return this.d;
    }

    public org.telegram.ui.ActionBar.h5 getValueTextView() {
        return this.f25698b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float fDp;
        int iDp;
        ImageView imageView = this.f25699c;
        if (this.f25701f) {
            if (LocaleController.isRTL) {
                fDp = 0.0f;
            } else {
                fDp = AndroidUtilities.dp(imageView.getVisibility() == 0 ? 68.0f : 20.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                iDp = AndroidUtilities.dp(imageView.getVisibility() == 0 ? 68.0f : 20.0f);
            } else {
                iDp = 0;
            }
            canvas.drawLine(fDp, measuredHeight, measuredWidth - iDp, getMeasuredHeight() - 1, this.f25703r);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        CharSequence text = this.f25697a.getText();
        if (TextUtils.isEmpty(text)) {
            return;
        }
        CharSequence text2 = this.f25698b.getText();
        if (TextUtils.isEmpty(text2)) {
            accessibilityNodeInfo.setText(text);
            return;
        }
        accessibilityNodeInfo.setText(((Object) text) + ": " + ((Object) text2));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int iDp;
        int i14 = this.f25702n;
        int i15 = this.f25700e;
        org.telegram.ui.ActionBar.h5 h5Var = this.f25697a;
        ImageView imageView = this.d;
        ImageView imageView2 = this.f25699c;
        int i16 = i13 - i11;
        int i17 = i12 - i10;
        org.telegram.ui.ActionBar.h5 h5Var2 = this.f25698b;
        int textHeight = (i16 - h5Var2.getTextHeight()) / 2;
        int iDp2 = LocaleController.isRTL ? AndroidUtilities.dp(i15) : 0;
        h5Var2.layout(iDp2, textHeight, h5Var2.getMeasuredWidth() + iDp2, h5Var2.getMeasuredHeight() + textHeight);
        int textHeight2 = (i16 - h5Var.getTextHeight()) / 2;
        if (LocaleController.isRTL) {
            int measuredWidth = getMeasuredWidth() - h5Var.getMeasuredWidth();
            if (imageView2.getVisibility() == 0) {
                i15 = this.h;
            }
            iDp = measuredWidth - AndroidUtilities.dp(i15);
        } else {
            iDp = AndroidUtilities.dp(imageView2.getVisibility() == 0 ? this.h : i15);
        }
        h5Var.layout(iDp, textHeight2, h5Var.getMeasuredWidth() + iDp, h5Var.getMeasuredHeight() + textHeight2);
        if (imageView2.getVisibility() == 0) {
            int iDp3 = AndroidUtilities.dp(5.0f);
            int iDp4 = !LocaleController.isRTL ? AndroidUtilities.dp(i14) : (i17 - imageView2.getMeasuredWidth()) - AndroidUtilities.dp(i14);
            imageView2.layout(iDp4, iDp3, imageView2.getMeasuredWidth() + iDp4, imageView2.getMeasuredHeight() + iDp3);
        }
        if (imageView.getVisibility() == 0) {
            int measuredHeight = (i16 - imageView.getMeasuredHeight()) / 2;
            int iDp5 = LocaleController.isRTL ? AndroidUtilities.dp(23.0f) : (i17 - imageView.getMeasuredWidth()) - AndroidUtilities.dp(23.0f);
            imageView.layout(iDp5, measuredHeight, imageView.getMeasuredWidth() + iDp5, imageView.getMeasuredHeight() + measuredHeight);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        ImageView imageView = this.d;
        int size = View.MeasureSpec.getSize(i10);
        int iDp = AndroidUtilities.dp(48.0f);
        org.telegram.ui.ActionBar.h5 h5Var = this.f25698b;
        int i12 = this.f25700e;
        h5Var.measure(rl.d(i12, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        this.f25697a.measure(View.MeasureSpec.makeMeasureSpec((size - AndroidUtilities.dp(i12 + 71)) - h5Var.getTextWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        ImageView imageView2 = this.f25699c;
        if (imageView2.getVisibility() == 0) {
            imageView2.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(iDp, Integer.MIN_VALUE));
        }
        if (imageView.getVisibility() == 0) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(iDp, Integer.MIN_VALUE));
        }
        setMeasuredDimension(size, AndroidUtilities.dp(50.0f) + (this.f25701f ? 1 : 0));
    }

    public void setOffsetFromImage(int i10) {
        this.h = i10;
    }

    public void setTextColor(int i10) {
        this.f25697a.setTextColor(i10);
    }
}
