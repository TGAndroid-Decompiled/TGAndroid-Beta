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
import org.telegram.messenger.a30;
import org.telegram.messenger.dd;
import org.telegram.ui.Components.RadioButton;
public class m6 extends FrameLayout {
    public final TextView f22312a;
    public final RadioButton f22313b;
    public boolean f22314c;

    public m6(Context context) {
        this(context, null);
    }

    public final void a(boolean z10, boolean z11) {
        this.f22313b.a(z10, z11);
    }

    public final void b(ArrayList arrayList, boolean z10) {
        float f7;
        float f10;
        super.setEnabled(z10);
        RadioButton radioButton = this.f22313b;
        TextView textView = this.f22312a;
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
        this.f22312a.setText(str);
        this.f22313b.a(z10, false);
        this.f22314c = z11;
        setWillNotDraw(!z11);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i10;
        if (this.f22314c) {
            if (dd.X) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.i0.L(20.0f);
            }
            float f7 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (dd.X) {
                i10 = org.telegram.messenger.i0.L(20.0f);
            } else {
                i10 = 0;
            }
            canvas.drawLine(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.f21053k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.RadioButton");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.f22313b.f24162f);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.i0.L(50.0f) + (this.f22314c ? 1 : 0));
        int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - org.telegram.messenger.i0.L(34.0f);
        this.f22313b.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(22.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(22.0f), 1073741824));
        this.f22312a.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
    }

    public void setRadioIcon(Drawable drawable) {
        this.f22313b.setIcon(drawable);
    }

    public void setTextColor(int i10) {
        this.f22312a.setTextColor(i10);
    }

    public m6(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        TextView textView = new TextView(context);
        this.f22312a = textView;
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.G6, p6Var);
        a30.o(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((dd.X ? 5 : 3) | 16);
        float f7 = 21;
        addView(textView, w7.b6.d(-1, -1.0f, (dd.X ? 5 : 3) | 48, f7, 0.0f, f7, 0.0f));
        RadioButton radioButton = new RadioButton(context);
        this.f22313b = radioButton;
        radioButton.setSize(org.telegram.messenger.i0.L(20.0f));
        org.telegram.ui.ActionBar.a7.P(radioButton, org.telegram.ui.ActionBar.t6.f20987g7, org.telegram.ui.ActionBar.t6.f21004h7, p6Var);
        boolean z10 = dd.X;
        addView(radioButton, w7.b6.d(22, 22.0f, (z10 ? 3 : 5) | 48, z10 ? 22 : 0, 14.0f, z10 ? 0 : 22, 0.0f));
    }
}
