package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.RadioButton;
public final class d9 extends FrameLayout {
    public TextView f24240a;
    public TextView f24241b;
    public RadioButton f24242c;
    public boolean d;
    public int f24243e;
    public float f24244f;
    public float h;
    public boolean f24245n;
    public int f24246r;

    static {
        new ch.g("animationProgress", 4);
    }

    public void setAnimationProgress(float f10) {
        this.f24244f = f10;
        Math.max(this.h, getMeasuredWidth() - this.h);
        AndroidUtilities.dp(40.0f);
        getMeasuredHeight();
    }

    public final void b(String str, String str2, boolean z10) {
        TextView textView = this.f24240a;
        textView.setText(str);
        TextView textView2 = this.f24241b;
        textView2.setText(str2);
        this.f24242c.a(false, false);
        this.d = z10;
        textView2.setVisibility(0);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setPadding(0, 0, 0, 0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.height = -2;
        layoutParams.topMargin = AndroidUtilities.dp(10.0f);
        textView.setLayoutParams(layoutParams);
        setWillNotDraw(!z10);
    }

    public final void c() {
        int i9;
        int i10;
        float f10;
        float f11;
        int i11;
        int i12;
        float f12;
        RadioButton radioButton = this.f24242c;
        TextView textView = this.f24241b;
        TextView textView2 = this.f24240a;
        int i13 = this.f24246r;
        boolean z10 = this.f24245n;
        boolean z11 = LocaleController.isRTL;
        if (z10 == z11) {
            return;
        }
        this.f24245n = z11;
        int i14 = 3;
        if (z11) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        textView2.setGravity(i9 | 16);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView2.getLayoutParams();
        boolean z12 = LocaleController.isRTL;
        if (z12) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        layoutParams.gravity = i10 | 48;
        float f13 = 64.0f;
        if (z12) {
            f10 = i13;
        } else {
            f10 = 64.0f;
        }
        layoutParams.leftMargin = AndroidUtilities.dp(f10);
        if (LocaleController.isRTL) {
            f11 = 64.0f;
        } else {
            f11 = i13;
        }
        layoutParams.rightMargin = AndroidUtilities.dp(f11);
        textView2.setLayoutParams(layoutParams);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView.setGravity(i11);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) textView.getLayoutParams();
        boolean z13 = LocaleController.isRTL;
        if (z13) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        layoutParams2.gravity = i12 | 48;
        if (z13) {
            f12 = i13;
        } else {
            f12 = 64.0f;
        }
        layoutParams2.leftMargin = AndroidUtilities.dp(f12);
        if (!LocaleController.isRTL) {
            f13 = i13;
        }
        layoutParams2.rightMargin = AndroidUtilities.dp(f13);
        textView.setLayoutParams(layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) radioButton.getLayoutParams();
        if (LocaleController.isRTL) {
            i14 = 5;
        }
        layoutParams3.gravity = i14 | 16;
        radioButton.setLayoutParams(layoutParams3);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i9;
        if (this.d) {
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(64.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i9 = AndroidUtilities.dp(64.0f);
            } else {
                i9 = 0;
            }
            canvas.drawLine(dp, measuredHeight, measuredWidth - i9, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.f6.f23121k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i9;
        TextView textView = this.f24241b;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCheckable(true);
        RadioButton radioButton = this.f24242c;
        accessibilityNodeInfo.setChecked(radioButton.f26508f);
        if (radioButton.f26508f) {
            i9 = R.string.NotificationsOn;
        } else {
            i9 = R.string.NotificationsOff;
        }
        accessibilityNodeInfo.setContentDescription(LocaleController.getString(i9));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f24240a.getText());
        if (!TextUtils.isEmpty(textView.getText())) {
            sb2.append("\n");
            sb2.append(textView.getText());
        }
        accessibilityNodeInfo.setContentDescription(sb2);
        accessibilityNodeInfo.setClassName("android.widget.RadioButton");
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        float f10;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824);
        if (this.f24241b.getVisibility() == 0) {
            f10 = 64.0f;
        } else {
            f10 = this.f24243e;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10) + (this.d ? 1 : 0), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.h = motionEvent.getX();
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public void setBackgroundColor(int i9) {
        clearAnimation();
        super.setBackgroundColor(i9);
    }

    public void setChecked(boolean z10) {
        this.f24242c.a(z10, true);
    }

    public void setHeight(int i9) {
        this.f24243e = i9;
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
    }

    public void setTypeface(Typeface typeface) {
        this.f24240a.setTypeface(typeface);
    }
}
