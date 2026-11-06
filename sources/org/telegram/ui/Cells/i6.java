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
import org.telegram.ui.Components.RadioButton;
public class i6 extends FrameLayout {
    public final TextView f29306a;
    public final RadioButton f29307b;
    public boolean f29308c;

    public i6(Context context) {
        this(context, null);
    }

    public final void a(boolean z9, boolean z10) {
        this.f29307b.a(z9, z10);
    }

    public final void b(ArrayList arrayList, boolean z9) {
        float f10;
        float f11;
        super.setEnabled(z9);
        RadioButton radioButton = this.f29307b;
        TextView textView = this.f29306a;
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
        this.f29306a.setText(str);
        this.f29307b.a(z9, false);
        this.f29308c = z10;
        setWillNotDraw(!z10);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i7;
        if (this.f29308c) {
            if (hd.f22871a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(20.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (hd.f22871a0) {
                i7 = org.telegram.messenger.g0.L(20.0f);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f27971k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.RadioButton");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.f29307b.f31512f);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(50.0f) + (this.f29308c ? 1 : 0));
        int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - org.telegram.messenger.g0.L(34.0f);
        this.f29307b.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(22.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(22.0f), 1073741824));
        this.f29306a.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
    }

    public void setRadioIcon(Drawable drawable) {
        this.f29307b.setIcon(drawable);
    }

    public void setTextColor(int i7) {
        this.f29306a.setTextColor(i7);
    }

    public i6(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        TextView textView = new TextView(context);
        this.f29306a = textView;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, f6Var);
        org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((hd.f22871a0 ? 5 : 3) | 16);
        float f10 = 21;
        addView(textView, c8.ha.d(-1, -1.0f, (hd.f22871a0 ? 5 : 3) | 48, f10, 0.0f, f10, 0.0f));
        RadioButton radioButton = new RadioButton(context);
        this.f29307b = radioButton;
        radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
        org.telegram.ui.ActionBar.r6.P(radioButton, org.telegram.ui.ActionBar.k6.f27904g7, org.telegram.ui.ActionBar.k6.h7, f6Var);
        boolean z9 = hd.f22871a0;
        addView(radioButton, c8.ha.d(22, 22.0f, (z9 ? 3 : 5) | 48, z9 ? 22 : 0, 14.0f, z9 ? 0 : 22, 0.0f));
    }
}
