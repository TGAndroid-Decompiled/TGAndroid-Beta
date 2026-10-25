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
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.vh;
public abstract class b4 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public org.telegram.ui.ActionBar.b6 f23896a;
    public org.telegram.ui.ActionBar.b6 f23897b;
    public ImageView f23898c;
    public ImageView d;
    public int e;
    public boolean f23899f;
    public int h;
    public int f23900n;
    public Paint f23901r;

    public final void a(int i10, int i11) {
        org.telegram.ui.ActionBar.b6 b6Var = this.f23896a;
        org.telegram.ui.ActionBar.f7.r(b6Var);
        ImageView imageView = this.f23898c;
        org.telegram.ui.ActionBar.f7.r(imageView);
        b6Var.setTextColor(i11);
        b6Var.setTag(null);
        imageView.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
        imageView.setTag(null);
    }

    public final void b(int i10, String str, boolean z10) {
        this.f23896a.l(str, false);
        org.telegram.ui.ActionBar.b6 b6Var = this.f23897b;
        b6Var.l(null, false);
        ImageView imageView = this.f23898c;
        imageView.setImageResource(i10);
        imageView.setVisibility(0);
        b6Var.setVisibility(8);
        this.d.setVisibility(8);
        imageView.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        this.f23899f = z10;
        setWillNotDraw(!z10);
    }

    public org.telegram.ui.ActionBar.b6 getTextView() {
        return this.f23896a;
    }

    public ImageView getValueImageView() {
        return this.d;
    }

    public org.telegram.ui.ActionBar.b6 getValueTextView() {
        return this.f23897b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        float dp;
        int i10;
        ImageView imageView = this.f23898c;
        if (this.f23899f) {
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
            canvas.drawLine(f11, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, this.f23901r);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        CharSequence text = this.f23896a.getText();
        if (!TextUtils.isEmpty(text)) {
            CharSequence text2 = this.f23897b.getText();
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
        int i15 = this.f23900n;
        int i16 = this.e;
        org.telegram.ui.ActionBar.b6 b6Var = this.f23896a;
        ImageView imageView = this.d;
        ImageView imageView2 = this.f23898c;
        int i17 = i13 - i11;
        int i18 = i12 - i10;
        org.telegram.ui.ActionBar.b6 b6Var2 = this.f23897b;
        int textHeight = (i17 - b6Var2.getTextHeight()) / 2;
        if (LocaleController.isRTL) {
            i14 = AndroidUtilities.dp(i16);
        } else {
            i14 = 0;
        }
        b6Var2.layout(i14, textHeight, b6Var2.getMeasuredWidth() + i14, b6Var2.getMeasuredHeight() + textHeight);
        int textHeight2 = (i17 - b6Var.getTextHeight()) / 2;
        if (LocaleController.isRTL) {
            int measuredWidth3 = getMeasuredWidth() - b6Var.getMeasuredWidth();
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
        b6Var.layout(dp, textHeight2, b6Var.getMeasuredWidth() + dp, b6Var.getMeasuredHeight() + textHeight2);
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
        org.telegram.ui.ActionBar.b6 b6Var = this.f23897b;
        int i12 = this.e;
        b6Var.measure(vh.x(i12, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        this.f23896a.measure(View.MeasureSpec.makeMeasureSpec((size - AndroidUtilities.dp(i12 + 71)) - b6Var.getTextWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        ImageView imageView2 = this.f23898c;
        if (imageView2.getVisibility() == 0) {
            imageView2.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE));
        }
        if (imageView.getVisibility() == 0) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE));
        }
        setMeasuredDimension(size, AndroidUtilities.dp(50.0f) + (this.f23899f ? 1 : 0));
    }

    public void setOffsetFromImage(int i10) {
        this.h = i10;
    }

    public void setTextColor(int i10) {
        org.telegram.ui.ActionBar.b6 b6Var = this.f23896a;
        org.telegram.ui.ActionBar.f7.r(b6Var);
        b6Var.setTextColor(i10);
    }

    @Override
    public final void updateColors() {
        try {
            this.f23901r.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.gg, false));
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
