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
import b8.mf;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.ui.Components.RadioButton;
public class h6 extends FrameLayout {
    public final TextView f29345a;
    public final RadioButton f29346b;
    public boolean f29347c;

    public h6(Context context) {
        this(context, null);
    }

    public final void a(boolean z10, boolean z11) {
        this.f29346b.a(z10, z11);
    }

    public final void b(ArrayList arrayList, boolean z10) {
        float f10;
        float f11;
        super.setEnabled(z10);
        RadioButton radioButton = this.f29346b;
        TextView textView = this.f29345a;
        float f12 = 0.5f;
        if (arrayList != null) {
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.5f;
            }
            float[] fArr = {f11};
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(textView, property, fArr));
            if (z10) {
                f12 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(radioButton, property, f12));
            return;
        }
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        textView.setAlpha(f10);
        if (z10) {
            f12 = 1.0f;
        }
        radioButton.setAlpha(f12);
    }

    public final void c(String str, boolean z10, boolean z11) {
        this.f29345a.setText(str);
        this.f29346b.a(z10, false);
        this.f29347c = z11;
        setWillNotDraw(!z11);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i3;
        if (this.f29347c) {
            if (bd.f21784a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(20.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (bd.f21784a0) {
                i3 = org.telegram.messenger.g0.L(20.0f);
            } else {
                i3 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i3, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f28002k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.RadioButton");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.f29346b.f31589f);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i3), org.telegram.messenger.g0.L(50.0f) + (this.f29347c ? 1 : 0));
        int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - org.telegram.messenger.g0.L(34.0f);
        this.f29346b.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(22.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(22.0f), 1073741824));
        this.f29345a.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
    }

    public void setRadioIcon(Drawable drawable) {
        this.f29346b.setIcon(drawable);
    }

    public void setTextColor(int i3) {
        this.f29345a.setTextColor(i3);
    }

    public h6(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        TextView textView = new TextView(context);
        this.f29345a = textView;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, e6Var);
        org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((bd.f21784a0 ? 5 : 3) | 16);
        float f10 = 21;
        addView(textView, mf.d(-1, -1.0f, (bd.f21784a0 ? 5 : 3) | 48, f10, 0.0f, f10, 0.0f));
        RadioButton radioButton = new RadioButton(context);
        this.f29346b = radioButton;
        radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
        org.telegram.ui.ActionBar.r6.P(radioButton, org.telegram.ui.ActionBar.k6.g7, org.telegram.ui.ActionBar.k6.h7, e6Var);
        boolean z10 = bd.f21784a0;
        addView(radioButton, mf.d(22, 22.0f, (z10 ? 3 : 5) | 48, z10 ? 22 : 0, 14.0f, z10 ? 0 : 22, 0.0f));
    }
}
