package org.telegram.ui.Cells;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.kk;
import org.telegram.ui.Components.RadioButton;
public class j6 extends FrameLayout {
    public final TextView f22481a;
    public final RadioButton f22482b;
    public boolean f22483c;

    public j6(Context context) {
        this(context, null);
    }

    public final void a(boolean z10, boolean z11) {
        this.f22482b.a(z10, z11);
    }

    public final void b(ArrayList arrayList, boolean z10) {
        float f7;
        float f10;
        super.setEnabled(z10);
        RadioButton radioButton = this.f22482b;
        TextView textView = this.f22481a;
        float f11 = 0.5f;
        if (arrayList != null) {
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.5f;
            }
            float[] fArr = {f10};
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(textView, property, fArr));
            if (z10) {
                f11 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(radioButton, property, f11));
            return;
        }
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.5f;
        }
        textView.setAlpha(f7);
        if (z10) {
            f11 = 1.0f;
        }
        radioButton.setAlpha(f11);
    }

    public final void c(String str, boolean z10, boolean z11) {
        this.f22481a.setText(str);
        this.f22482b.a(z10, false);
        this.f22483c = z11;
        setWillNotDraw(!z11);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        if (this.f22483c) {
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(20.0f);
            }
            float f7 = dp;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(20.0f);
            } else {
                i10 = 0;
            }
            canvas.drawLine(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.h6.f21108k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.RadioButton");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.f22482b.f24338f);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(50.0f) + (this.f22483c ? 1 : 0));
        int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - AndroidUtilities.dp(34.0f);
        this.f22482b.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(22.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(22.0f), 1073741824));
        this.f22481a.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
    }

    public void setRadioIcon(Drawable drawable) {
        this.f22482b.setIcon(drawable);
    }

    public void setTextColor(int i10) {
        this.f22481a.setTextColor(i10);
    }

    public j6(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        TextView textView = new TextView(context);
        this.f22481a = textView;
        kk.o(org.telegram.ui.ActionBar.h6.G6, d6Var, textView, 1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        float f7 = 21;
        addView(textView, w7.z5.d(-1, -1.0f, (LocaleController.isRTL ? 5 : 3) | 48, f7, 0.0f, f7, 0.0f));
        RadioButton radioButton = new RadioButton(context);
        this.f22482b = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        radioButton.b(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21041g7, d6Var), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21060h7, d6Var));
        boolean z10 = LocaleController.isRTL;
        addView(radioButton, w7.z5.d(22, 22.0f, (z10 ? 3 : 5) | 48, z10 ? 22 : 0, 14.0f, z10 ? 0 : 22, 0.0f));
    }
}
