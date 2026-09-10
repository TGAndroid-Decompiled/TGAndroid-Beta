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
public final class h9 extends FrameLayout {
    public TextView f19278a;
    public TextView f19279b;
    public RadioButton f19280c;
    public boolean d;
    public int e;
    public float f19281f;
    public float h;
    public boolean f19282n;
    public int f19283r;

    static {
        new u8("animationProgress", 2);
    }

    public void setAnimationProgress(float f7) {
        this.f19281f = f7;
        Math.max(this.h, getMeasuredWidth() - this.h);
        AndroidUtilities.dp(40.0f);
        getMeasuredHeight();
    }

    public final void b(String str, String str2, boolean z10) {
        TextView textView = this.f19278a;
        textView.setText(str);
        TextView textView2 = this.f19279b;
        textView2.setText(str2);
        this.f19280c.a(false, false);
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
        int i10;
        int i11;
        float f7;
        float f10;
        int i12;
        int i13;
        float f11;
        RadioButton radioButton = this.f19280c;
        TextView textView = this.f19279b;
        TextView textView2 = this.f19278a;
        int i14 = this.f19283r;
        boolean z10 = this.f19282n;
        boolean z11 = LocaleController.isRTL;
        if (z10 == z11) {
            return;
        }
        this.f19282n = z11;
        int i15 = 3;
        if (z11) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView2.setGravity(i10 | 16);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView2.getLayoutParams();
        boolean z12 = LocaleController.isRTL;
        if (z12) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        layoutParams.gravity = i11 | 48;
        float f12 = 64.0f;
        if (z12) {
            f7 = i14;
        } else {
            f7 = 64.0f;
        }
        layoutParams.leftMargin = AndroidUtilities.dp(f7);
        if (LocaleController.isRTL) {
            f10 = 64.0f;
        } else {
            f10 = i14;
        }
        layoutParams.rightMargin = AndroidUtilities.dp(f10);
        textView2.setLayoutParams(layoutParams);
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        textView.setGravity(i12);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) textView.getLayoutParams();
        boolean z13 = LocaleController.isRTL;
        if (z13) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        layoutParams2.gravity = i13 | 48;
        if (z13) {
            f11 = i14;
        } else {
            f11 = 64.0f;
        }
        layoutParams2.leftMargin = AndroidUtilities.dp(f11);
        if (!LocaleController.isRTL) {
            f12 = i14;
        }
        layoutParams2.rightMargin = AndroidUtilities.dp(f12);
        textView.setLayoutParams(layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) radioButton.getLayoutParams();
        if (LocaleController.isRTL) {
            i15 = 5;
        }
        layoutParams3.gravity = i15 | 16;
        radioButton.setLayoutParams(layoutParams3);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        if (this.d) {
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(64.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(64.0f);
            } else {
                i10 = 0;
            }
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f18049k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i10;
        TextView textView = this.f19279b;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCheckable(true);
        RadioButton radioButton = this.f19280c;
        accessibilityNodeInfo.setChecked(radioButton.f21247f);
        if (radioButton.f21247f) {
            i10 = R.string.NotificationsOn;
        } else {
            i10 = R.string.NotificationsOff;
        }
        accessibilityNodeInfo.setContentDescription(LocaleController.getString(i10));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f19278a.getText());
        if (!TextUtils.isEmpty(textView.getText())) {
            sb2.append("\n");
            sb2.append(textView.getText());
        }
        accessibilityNodeInfo.setContentDescription(sb2);
        accessibilityNodeInfo.setClassName("android.widget.RadioButton");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.f19279b.getVisibility() == 0) {
            f7 = 64.0f;
        } else {
            f7 = this.e;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7) + (this.d ? 1 : 0), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.h = motionEvent.getX();
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public void setBackgroundColor(int i10) {
        clearAnimation();
        super.setBackgroundColor(i10);
    }

    public void setChecked(boolean z10) {
        this.f19280c.a(z10, true);
    }

    public void setHeight(int i10) {
        this.e = i10;
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
    }

    public void setTypeface(Typeface typeface) {
        this.f19278a.setTypeface(typeface);
    }
}
