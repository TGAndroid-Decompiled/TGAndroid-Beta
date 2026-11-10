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
import org.telegram.messenger.id;
import org.telegram.ui.Components.RadioButton;
public class i6 extends FrameLayout {
    public final TextView f29325a;
    public final RadioButton f29326b;
    public boolean f29327c;

    public i6(Context context) {
        this(context, null);
    }

    public final void a(boolean z9, boolean z10) {
        this.f29326b.a(z9, z10);
    }

    public final void b(ArrayList arrayList, boolean z9) {
        float f10;
        float f11;
        super.setEnabled(z9);
        RadioButton radioButton = this.f29326b;
        TextView textView = this.f29325a;
        float f12 = 0.5f;
        if (arrayList != null) {
            if (z9) {
                f11 = 1.0f;
            } else {
                f11 = 0.5f;
            }
            float[] fArr = {f11};
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(textView, property, fArr));
            if (z9) {
                f12 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(radioButton, property, f12));
            return;
        }
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        textView.setAlpha(f10);
        if (z9) {
            f12 = 1.0f;
        }
        radioButton.setAlpha(f12);
    }

    public final void c(String str, boolean z9, boolean z10) {
        this.f29325a.setText(str);
        this.f29326b.a(z9, false);
        this.f29327c = z10;
        setWillNotDraw(!z10);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i7;
        if (this.f29327c) {
            if (id.f23161a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(20.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (id.f23161a0) {
                i7 = org.telegram.messenger.g0.L(20.0f);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.m6.f28013k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.RadioButton");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.f29326b.f31533f);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(50.0f) + (this.f29327c ? 1 : 0));
        int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - org.telegram.messenger.g0.L(34.0f);
        this.f29326b.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(22.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(22.0f), 1073741824));
        this.f29325a.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
    }

    public void setRadioIcon(Drawable drawable) {
        this.f29326b.setIcon(drawable);
    }

    public void setTextColor(int i7) {
        this.f29325a.setTextColor(i7);
    }

    public i6(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        TextView textView = new TextView(context);
        this.f29325a = textView;
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.G6, h6Var);
        org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((id.f23161a0 ? 5 : 3) | 16);
        float f10 = 21;
        addView(textView, c8.ha.d(-1, -1.0f, (id.f23161a0 ? 5 : 3) | 48, f10, 0.0f, f10, 0.0f));
        RadioButton radioButton = new RadioButton(context);
        this.f29326b = radioButton;
        radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
        org.telegram.ui.ActionBar.t6.O(radioButton, org.telegram.ui.ActionBar.m6.f27946g7, org.telegram.ui.ActionBar.m6.h7, h6Var);
        boolean z9 = id.f23161a0;
        addView(radioButton, c8.ha.d(22, 22.0f, (z9 ? 3 : 5) | 48, z9 ? 22 : 0, 14.0f, z9 ? 0 : 22, 0.0f));
    }
}
