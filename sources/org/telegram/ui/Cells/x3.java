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
import org.telegram.messenger.ll;
public abstract class x3 extends FrameLayout {
    public org.telegram.ui.ActionBar.h5 f25938a;
    public org.telegram.ui.ActionBar.h5 f25939b;
    public ImageView f25940c;
    public ImageView d;
    public int f25941e;
    public boolean f25942f;
    public int h;
    public int f25943n;
    public Paint f25944r;

    public final void a(int i9, int i10) {
        org.telegram.ui.ActionBar.h5 h5Var = this.f25938a;
        h5Var.setTextColor(i10);
        h5Var.setTag(null);
        ImageView imageView = this.f25940c;
        imageView.setColorFilter(new PorterDuffColorFilter(i9, PorterDuff.Mode.MULTIPLY));
        imageView.setTag(null);
    }

    public final void b(int i9, String str, boolean z10) {
        this.f25938a.l(str, false);
        org.telegram.ui.ActionBar.h5 h5Var = this.f25939b;
        h5Var.l(null, false);
        ImageView imageView = this.f25940c;
        imageView.setImageResource(i9);
        imageView.setVisibility(0);
        h5Var.setVisibility(8);
        this.d.setVisibility(8);
        imageView.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        this.f25942f = z10;
        setWillNotDraw(!z10);
    }

    public org.telegram.ui.ActionBar.h5 getTextView() {
        return this.f25938a;
    }

    public ImageView getValueImageView() {
        return this.d;
    }

    public org.telegram.ui.ActionBar.h5 getValueTextView() {
        return this.f25939b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float dp;
        int i9;
        ImageView imageView = this.f25940c;
        if (this.f25942f) {
            float f11 = 20.0f;
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                if (imageView.getVisibility() == 0) {
                    f10 = 68.0f;
                } else {
                    f10 = 20.0f;
                }
                dp = AndroidUtilities.dp(f10);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                if (imageView.getVisibility() == 0) {
                    f11 = 68.0f;
                }
                i9 = AndroidUtilities.dp(f11);
            } else {
                i9 = 0;
            }
            canvas.drawLine(dp, measuredHeight, measuredWidth - i9, getMeasuredHeight() - 1, this.f25944r);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        CharSequence text = this.f25938a.getText();
        if (!TextUtils.isEmpty(text)) {
            CharSequence text2 = this.f25939b.getText();
            if (!TextUtils.isEmpty(text2)) {
                accessibilityNodeInfo.setText(((Object) text) + ": " + ((Object) text2));
                return;
            }
            accessibilityNodeInfo.setText(text);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int i13;
        float f10;
        int dp;
        int measuredWidth;
        int measuredWidth2;
        int i14 = this.f25943n;
        int i15 = this.f25941e;
        org.telegram.ui.ActionBar.h5 h5Var = this.f25938a;
        ImageView imageView = this.d;
        ImageView imageView2 = this.f25940c;
        int i16 = i12 - i10;
        int i17 = i11 - i9;
        org.telegram.ui.ActionBar.h5 h5Var2 = this.f25939b;
        int textHeight = (i16 - h5Var2.getTextHeight()) / 2;
        if (LocaleController.isRTL) {
            i13 = AndroidUtilities.dp(i15);
        } else {
            i13 = 0;
        }
        h5Var2.layout(i13, textHeight, h5Var2.getMeasuredWidth() + i13, h5Var2.getMeasuredHeight() + textHeight);
        int textHeight2 = (i16 - h5Var.getTextHeight()) / 2;
        if (LocaleController.isRTL) {
            int measuredWidth3 = getMeasuredWidth() - h5Var.getMeasuredWidth();
            if (imageView2.getVisibility() == 0) {
                i15 = this.h;
            }
            dp = measuredWidth3 - AndroidUtilities.dp(i15);
        } else {
            if (imageView2.getVisibility() == 0) {
                f10 = this.h;
            } else {
                f10 = i15;
            }
            dp = AndroidUtilities.dp(f10);
        }
        h5Var.layout(dp, textHeight2, h5Var.getMeasuredWidth() + dp, h5Var.getMeasuredHeight() + textHeight2);
        if (imageView2.getVisibility() == 0) {
            int dp2 = AndroidUtilities.dp(5.0f);
            if (!LocaleController.isRTL) {
                measuredWidth2 = AndroidUtilities.dp(i14);
            } else {
                measuredWidth2 = (i17 - imageView2.getMeasuredWidth()) - AndroidUtilities.dp(i14);
            }
            imageView2.layout(measuredWidth2, dp2, imageView2.getMeasuredWidth() + measuredWidth2, imageView2.getMeasuredHeight() + dp2);
        }
        if (imageView.getVisibility() == 0) {
            int measuredHeight = (i16 - imageView.getMeasuredHeight()) / 2;
            if (LocaleController.isRTL) {
                measuredWidth = AndroidUtilities.dp(23.0f);
            } else {
                measuredWidth = (i17 - imageView.getMeasuredWidth()) - AndroidUtilities.dp(23.0f);
            }
            imageView.layout(measuredWidth, measuredHeight, imageView.getMeasuredWidth() + measuredWidth, imageView.getMeasuredHeight() + measuredHeight);
        }
    }

    @Override
    public void onMeasure(int i9, int i10) {
        ImageView imageView = this.d;
        int size = View.MeasureSpec.getSize(i9);
        int dp = AndroidUtilities.dp(48.0f);
        org.telegram.ui.ActionBar.h5 h5Var = this.f25939b;
        int i11 = this.f25941e;
        h5Var.measure(ll.d(i11, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        this.f25938a.measure(View.MeasureSpec.makeMeasureSpec((size - AndroidUtilities.dp(i11 + 71)) - h5Var.getTextWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        ImageView imageView2 = this.f25940c;
        if (imageView2.getVisibility() == 0) {
            imageView2.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE));
        }
        if (imageView.getVisibility() == 0) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE));
        }
        setMeasuredDimension(size, AndroidUtilities.dp(50.0f) + (this.f25942f ? 1 : 0));
    }

    public void setOffsetFromImage(int i9) {
        this.h = i9;
    }

    public void setTextColor(int i9) {
        this.f25938a.setTextColor(i9);
    }
}
