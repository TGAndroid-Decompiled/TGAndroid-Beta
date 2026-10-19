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
import org.telegram.messenger.kk;
public abstract class w3 extends FrameLayout {
    public org.telegram.ui.ActionBar.j5 f23757a;
    public org.telegram.ui.ActionBar.j5 f23758b;
    public ImageView f23759c;
    public ImageView d;
    public int e;
    public boolean f23760f;
    public int h;
    public int f23761n;
    public Paint f23762r;

    public final void a(int i10, int i11) {
        org.telegram.ui.ActionBar.j5 j5Var = this.f23757a;
        j5Var.setTextColor(i11);
        j5Var.setTag(null);
        ImageView imageView = this.f23759c;
        imageView.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
        imageView.setTag(null);
    }

    public final void b(int i10, String str, boolean z10) {
        this.f23757a.l(str, false);
        org.telegram.ui.ActionBar.j5 j5Var = this.f23758b;
        j5Var.l(null, false);
        ImageView imageView = this.f23759c;
        imageView.setImageResource(i10);
        imageView.setVisibility(0);
        j5Var.setVisibility(8);
        this.d.setVisibility(8);
        imageView.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        this.f23760f = z10;
        setWillNotDraw(!z10);
    }

    public org.telegram.ui.ActionBar.j5 getTextView() {
        return this.f23757a;
    }

    public ImageView getValueImageView() {
        return this.d;
    }

    public org.telegram.ui.ActionBar.j5 getValueTextView() {
        return this.f23758b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        float dp;
        int i10;
        ImageView imageView = this.f23759c;
        if (this.f23760f) {
            float f10 = 20.0f;
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                if (imageView.getVisibility() == 0) {
                    f7 = 68.0f;
                } else {
                    f7 = 20.0f;
                }
                dp = AndroidUtilities.dp(f7);
            }
            float f11 = dp;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                if (imageView.getVisibility() == 0) {
                    f10 = 68.0f;
                }
                i10 = AndroidUtilities.dp(f10);
            } else {
                i10 = 0;
            }
            canvas.drawLine(f11, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, this.f23762r);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        CharSequence text = this.f23757a.getText();
        if (!TextUtils.isEmpty(text)) {
            CharSequence text2 = this.f23758b.getText();
            if (!TextUtils.isEmpty(text2)) {
                accessibilityNodeInfo.setText(((Object) text) + ": " + ((Object) text2));
                return;
            }
            accessibilityNodeInfo.setText(text);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        float f7;
        int dp;
        int measuredWidth;
        int measuredWidth2;
        int i15 = this.f23761n;
        int i16 = this.e;
        org.telegram.ui.ActionBar.j5 j5Var = this.f23757a;
        ImageView imageView = this.d;
        ImageView imageView2 = this.f23759c;
        int i17 = i13 - i11;
        int i18 = i12 - i10;
        org.telegram.ui.ActionBar.j5 j5Var2 = this.f23758b;
        int textHeight = (i17 - j5Var2.getTextHeight()) / 2;
        if (LocaleController.isRTL) {
            i14 = AndroidUtilities.dp(i16);
        } else {
            i14 = 0;
        }
        j5Var2.layout(i14, textHeight, j5Var2.getMeasuredWidth() + i14, j5Var2.getMeasuredHeight() + textHeight);
        int textHeight2 = (i17 - j5Var.getTextHeight()) / 2;
        if (LocaleController.isRTL) {
            int measuredWidth3 = getMeasuredWidth() - j5Var.getMeasuredWidth();
            if (imageView2.getVisibility() == 0) {
                i16 = this.h;
            }
            dp = measuredWidth3 - AndroidUtilities.dp(i16);
        } else {
            if (imageView2.getVisibility() == 0) {
                f7 = this.h;
            } else {
                f7 = i16;
            }
            dp = AndroidUtilities.dp(f7);
        }
        j5Var.layout(dp, textHeight2, j5Var.getMeasuredWidth() + dp, j5Var.getMeasuredHeight() + textHeight2);
        if (imageView2.getVisibility() == 0) {
            int dp2 = AndroidUtilities.dp(5.0f);
            if (!LocaleController.isRTL) {
                measuredWidth2 = AndroidUtilities.dp(i15);
            } else {
                measuredWidth2 = (i18 - imageView2.getMeasuredWidth()) - AndroidUtilities.dp(i15);
            }
            imageView2.layout(measuredWidth2, dp2, imageView2.getMeasuredWidth() + measuredWidth2, imageView2.getMeasuredHeight() + dp2);
        }
        if (imageView.getVisibility() == 0) {
            int measuredHeight = (i17 - imageView.getMeasuredHeight()) / 2;
            if (LocaleController.isRTL) {
                measuredWidth = AndroidUtilities.dp(23.0f);
            } else {
                measuredWidth = (i18 - imageView.getMeasuredWidth()) - AndroidUtilities.dp(23.0f);
            }
            imageView.layout(measuredWidth, measuredHeight, imageView.getMeasuredWidth() + measuredWidth, imageView.getMeasuredHeight() + measuredHeight);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        ImageView imageView = this.d;
        int size = View.MeasureSpec.getSize(i10);
        int dp = AndroidUtilities.dp(48.0f);
        org.telegram.ui.ActionBar.j5 j5Var = this.f23758b;
        int i12 = this.e;
        j5Var.measure(kk.c(i12, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        this.f23757a.measure(View.MeasureSpec.makeMeasureSpec((size - AndroidUtilities.dp(i12 + 71)) - j5Var.getTextWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        ImageView imageView2 = this.f23759c;
        if (imageView2.getVisibility() == 0) {
            imageView2.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE));
        }
        if (imageView.getVisibility() == 0) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE));
        }
        setMeasuredDimension(size, AndroidUtilities.dp(50.0f) + (this.f23760f ? 1 : 0));
    }

    public void setOffsetFromImage(int i10) {
        this.h = i10;
    }

    public void setTextColor(int i10) {
        this.f23757a.setTextColor(i10);
    }
}
