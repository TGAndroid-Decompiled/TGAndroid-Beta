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
import org.telegram.messenger.sk;
import org.telegram.ui.Components.RadioButton;
public class k6 extends FrameLayout {
    public final TextView f21159a;
    public final RadioButton f21160b;
    public boolean f21161c;

    public k6(Context context) {
        this(context, null);
    }

    public final void a(boolean z10, boolean z11) {
        this.f21160b.a(z10, z11);
    }

    public final void b(ArrayList arrayList, boolean z10) {
        float f7;
        float f10;
        super.setEnabled(z10);
        RadioButton radioButton = this.f21160b;
        TextView textView = this.f21159a;
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
        this.f21159a.setText(str);
        this.f21160b.a(z10, false);
        this.f21161c = z11;
        setWillNotDraw(!z11);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        if (this.f21161c) {
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
            canvas.drawLine(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.f19722k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.RadioButton");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.f21160b.f22982f);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(50.0f) + (this.f21161c ? 1 : 0));
        int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - AndroidUtilities.dp(34.0f);
        this.f21160b.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(22.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(22.0f), 1073741824));
        this.f21159a.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
    }

    public void setRadioIcon(Drawable drawable) {
        this.f21160b.setIcon(drawable);
    }

    public void setTextColor(int i10) {
        this.f21159a.setTextColor(i10);
    }

    public k6(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        TextView textView = new TextView(context);
        this.f21159a = textView;
        sk.o(org.telegram.ui.ActionBar.g6.G6, c6Var, textView, 1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        float f7 = 21;
        addView(textView, w7.z5.a(-1.0f, f7, 0.0f, f7, 0.0f, -1, (LocaleController.isRTL ? 5 : 3) | 48));
        RadioButton radioButton = new RadioButton(context);
        this.f21160b = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        radioButton.b(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19655g7, c6Var), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19674h7, c6Var));
        boolean z10 = LocaleController.isRTL;
        addView(radioButton, w7.z5.a(22.0f, z10 ? 22 : 0, 14.0f, z10 ? 0 : 22, 0.0f, 22, (z10 ? 3 : 5) | 48));
    }
}
