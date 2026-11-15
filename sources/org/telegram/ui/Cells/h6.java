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
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.ui.Components.RadioButton;
public class h6 extends FrameLayout {
    public final TextView f30404a;
    public final RadioButton f30405b;
    public boolean f30406c;

    public h6(Context context) {
        this(context, null);
    }

    public final void a(boolean z10, boolean z11) {
        this.f30405b.a(z10, z11);
    }

    public final void b(ArrayList arrayList, boolean z10) {
        float f10;
        float f11;
        super.setEnabled(z10);
        RadioButton radioButton = this.f30405b;
        TextView textView = this.f30404a;
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
        this.f30404a.setText(str);
        this.f30405b.a(z10, false);
        this.f30406c = z11;
        setWillNotDraw(!z11);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i7;
        if (this.f30406c) {
            if (hd.f24104a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(20.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (hd.f24104a0) {
                i7 = org.telegram.messenger.g0.L(20.0f);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f28972k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.RadioButton");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.f30405b.f32696f);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(50.0f) + (this.f30406c ? 1 : 0));
        int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - org.telegram.messenger.g0.L(34.0f);
        this.f30405b.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(22.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(22.0f), 1073741824));
        this.f30404a.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
    }

    public void setRadioIcon(Drawable drawable) {
        this.f30405b.setIcon(drawable);
    }

    public void setTextColor(int i7) {
        this.f30404a.setTextColor(i7);
    }

    public h6(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        TextView textView = new TextView(context);
        this.f30404a = textView;
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.G6, e6Var);
        i20.p(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((hd.f24104a0 ? 5 : 3) | 16);
        float f10 = 21;
        addView(textView, c8.ja.d(-1, -1.0f, (hd.f24104a0 ? 5 : 3) | 48, f10, 0.0f, f10, 0.0f));
        RadioButton radioButton = new RadioButton(context);
        this.f30405b = radioButton;
        radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
        org.telegram.ui.ActionBar.q6.O(radioButton, org.telegram.ui.ActionBar.j6.f28905g7, org.telegram.ui.ActionBar.j6.h7, e6Var);
        boolean z10 = hd.f24104a0;
        addView(radioButton, c8.ja.d(22, 22.0f, (z10 ? 3 : 5) | 48, z10 ? 22 : 0, 14.0f, z10 ? 0 : 22, 0.0f));
    }
}
