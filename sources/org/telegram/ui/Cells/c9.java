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
public final class c9 extends FrameLayout {
    public TextView f20927a;
    public TextView f20928b;
    public RadioButton f20929c;
    public boolean d;
    public int e;
    public float f20930f;
    public float h;
    public boolean f20931n;
    public int f20932r;

    static {
        new hh.g("animationProgress", 4);
    }

    public void setAnimationProgress(float f10) {
        this.f20930f = f10;
        Math.max(this.h, getMeasuredWidth() - this.h);
        AndroidUtilities.dp(40.0f);
        getMeasuredHeight();
    }

    public final void b(String str, String str2, boolean z4) {
        TextView textView = this.f20927a;
        textView.setText(str);
        TextView textView2 = this.f20928b;
        textView2.setText(str2);
        this.f20929c.a(false, false);
        this.d = z4;
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
        setWillNotDraw(!z4);
    }

    public final void c() {
        int i10;
        int i11;
        float f10;
        float f11;
        int i12;
        int i13;
        float f12;
        RadioButton radioButton = this.f20929c;
        TextView textView = this.f20928b;
        TextView textView2 = this.f20927a;
        int i14 = this.f20932r;
        boolean z4 = this.f20931n;
        boolean z10 = LocaleController.isRTL;
        if (z4 == z10) {
            return;
        }
        this.f20931n = z10;
        int i15 = 3;
        if (z10) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView2.setGravity(i10 | 16);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView2.getLayoutParams();
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        layoutParams.gravity = i11 | 48;
        float f13 = 64.0f;
        if (z11) {
            f10 = i14;
        } else {
            f10 = 64.0f;
        }
        layoutParams.leftMargin = AndroidUtilities.dp(f10);
        if (LocaleController.isRTL) {
            f11 = 64.0f;
        } else {
            f11 = i14;
        }
        layoutParams.rightMargin = AndroidUtilities.dp(f11);
        textView2.setLayoutParams(layoutParams);
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        textView.setGravity(i12);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) textView.getLayoutParams();
        boolean z12 = LocaleController.isRTL;
        if (z12) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        layoutParams2.gravity = i13 | 48;
        if (z12) {
            f12 = i14;
        } else {
            f12 = 64.0f;
        }
        layoutParams2.leftMargin = AndroidUtilities.dp(f12);
        if (!LocaleController.isRTL) {
            f13 = i14;
        }
        layoutParams2.rightMargin = AndroidUtilities.dp(f13);
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
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f20025k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i10;
        TextView textView = this.f20928b;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCheckable(true);
        RadioButton radioButton = this.f20929c;
        accessibilityNodeInfo.setChecked(radioButton.f23149f);
        if (radioButton.f23149f) {
            i10 = R.string.NotificationsOn;
        } else {
            i10 = R.string.NotificationsOff;
        }
        accessibilityNodeInfo.setContentDescription(LocaleController.getString(i10));
        StringBuilder sb = new StringBuilder();
        sb.append(this.f20927a.getText());
        if (!TextUtils.isEmpty(textView.getText())) {
            sb.append("\n");
            sb.append(textView.getText());
        }
        accessibilityNodeInfo.setContentDescription(sb);
        accessibilityNodeInfo.setClassName("android.widget.RadioButton");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f10;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.f20928b.getVisibility() == 0) {
            f10 = 64.0f;
        } else {
            f10 = this.e;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10) + (this.d ? 1 : 0), 1073741824));
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

    public void setChecked(boolean z4) {
        this.f20929c.a(z4, true);
    }

    public void setHeight(int i10) {
        this.e = i10;
    }

    @Override
    public void setPressed(boolean z4) {
        super.setPressed(z4);
    }

    public void setTypeface(Typeface typeface) {
        this.f20927a.setTypeface(typeface);
    }
}
