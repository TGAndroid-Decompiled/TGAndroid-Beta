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
import org.telegram.messenger.cd;
import org.telegram.messenger.z20;
import org.telegram.ui.Components.RadioButton;
public class m6 extends FrameLayout {
    public final TextView f22311a;
    public final RadioButton f22312b;
    public boolean f22313c;

    public m6(Context context) {
        this(context, null);
    }

    public final void a(boolean z10, boolean z11) {
        this.f22312b.a(z10, z11);
    }

    public final void b(ArrayList arrayList, boolean z10) {
        float f7;
        float f10;
        super.setEnabled(z10);
        RadioButton radioButton = this.f22312b;
        TextView textView = this.f22311a;
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
        this.f22311a.setText(str);
        this.f22312b.a(z10, false);
        this.f22313c = z11;
        setWillNotDraw(!z11);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i10;
        if (this.f22313c) {
            if (cd.X) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.i0.L(20.0f);
            }
            float f7 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (cd.X) {
                i10 = org.telegram.messenger.i0.L(20.0f);
            } else {
                i10 = 0;
            }
            canvas.drawLine(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.f21052k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.RadioButton");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.f22312b.f24161f);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.i0.L(50.0f) + (this.f22313c ? 1 : 0));
        int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - org.telegram.messenger.i0.L(34.0f);
        this.f22312b.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(22.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(22.0f), 1073741824));
        this.f22311a.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
    }

    public void setRadioIcon(Drawable drawable) {
        this.f22312b.setIcon(drawable);
    }

    public void setTextColor(int i10) {
        this.f22311a.setTextColor(i10);
    }

    public m6(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        TextView textView = new TextView(context);
        this.f22311a = textView;
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.G6, p6Var);
        z20.o(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((cd.X ? 5 : 3) | 16);
        float f7 = 21;
        addView(textView, w7.b6.d(-1, -1.0f, (cd.X ? 5 : 3) | 48, f7, 0.0f, f7, 0.0f));
        RadioButton radioButton = new RadioButton(context);
        this.f22312b = radioButton;
        radioButton.setSize(org.telegram.messenger.i0.L(20.0f));
        org.telegram.ui.ActionBar.a7.P(radioButton, org.telegram.ui.ActionBar.t6.f20986g7, org.telegram.ui.ActionBar.t6.f21003h7, p6Var);
        boolean z10 = cd.X;
        addView(radioButton, w7.b6.d(22, 22.0f, (z10 ? 3 : 5) | 48, z10 ? 22 : 0, 14.0f, z10 ? 0 : 22, 0.0f));
    }
}
