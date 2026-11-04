package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.ui.Components.wo;
public final class r8 extends FrameLayout {
    public final TextView f30284a;
    public final TextView f30285b;
    public final wo f30286c;
    public boolean d;
    public boolean f30287e;
    public int f30288f;
    public float h;
    public float f30289n;

    static {
        new n8("animationProgress", 1);
    }

    public r8(Context context) {
        super(context);
        int i3;
        int i10;
        float f10;
        float f11;
        int i11;
        int i12;
        float f12;
        float f13;
        this.f30288f = 50;
        TextView textView = new TextView(context);
        this.f30284a = textView;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, null);
        org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        if (bd.f21784a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        textView.setGravity(i3 | 16);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        boolean z10 = bd.f21784a0;
        if (z10) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i13 = i10 | 48;
        if (z10) {
            f10 = 21;
        } else {
            f10 = 64.0f;
        }
        if (z10) {
            f11 = 64.0f;
        } else {
            f11 = 21;
        }
        addView(textView, mf.d(-1, -1.0f, i13, f10, 0.0f, f11, 0.0f));
        TextView textView2 = new TextView(context);
        this.f30285b = textView2;
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f28290z6, null);
        textView2.setTextSize(1, 13.0f);
        if (bd.f21784a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView2.setGravity(i11);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setPadding(0, 0, 0, 0);
        textView2.setEllipsize(truncateAt);
        boolean z11 = bd.f21784a0;
        if (z11) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        int i14 = i12 | 48;
        if (z11) {
            f12 = 21;
        } else {
            f12 = 64.0f;
        }
        if (z11) {
            f13 = 64.0f;
        } else {
            f13 = 21;
        }
        addView(textView2, mf.d(-2, -2.0f, i14, f12, 36.0f, f13, 0.0f));
        wo woVar = new wo(21, context, null);
        this.f30286c = woVar;
        woVar.setDrawUnchecked(true);
        woVar.setDrawBackgroundAsArc(10);
        woVar.setDuration(100L);
        woVar.b(org.telegram.ui.ActionBar.k6.h7, org.telegram.ui.ActionBar.k6.f27990j7, org.telegram.ui.ActionBar.k6.f28008k7);
        addView(woVar, mf.d(20, 20.0f, (bd.f21784a0 ? 5 : 3) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        setClipChildren(false);
    }

    public void setAnimationProgress(float f10) {
        this.h = f10;
        Math.max(this.f30289n, getMeasuredWidth() - this.f30289n);
        org.telegram.messenger.g0.L(40.0f);
        getMeasuredHeight();
    }

    public final void b(String str, String str2, boolean z10, boolean z11) {
        TextView textView = this.f30284a;
        textView.setText(str);
        TextView textView2 = this.f30285b;
        textView2.setText(str2);
        this.d = z11;
        textView2.setVisibility(0);
        this.f30287e = z10;
        if (z10) {
            textView2.setLines(0);
            textView2.setMaxLines(0);
            textView2.setSingleLine(false);
            textView2.setEllipsize(null);
            textView2.setPadding(0, 0, 0, org.telegram.messenger.g0.L(11.0f));
        } else {
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setPadding(0, 0, 0, 0);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.height = -2;
        layoutParams.topMargin = org.telegram.messenger.g0.L(10.0f);
        textView.setLayoutParams(layoutParams);
        setWillNotDraw(!z11);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i3;
        if (this.d) {
            if (bd.f21784a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(64.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (bd.f21784a0) {
                i3 = org.telegram.messenger.g0.L(64.0f);
            } else {
                i3 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i3, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f28002k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.checkbox");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.f30286c.f40035a.f31334q);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f30284a.getText());
        TextView textView = this.f30285b;
        if (textView != null) {
            sb2.append("\n");
            sb2.append(textView.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        float f10;
        if (this.f30287e) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            return;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824);
        if (this.f30285b.getVisibility() == 0) {
            f10 = 64.0f;
        } else {
            f10 = this.f30288f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f10) + (this.d ? 1 : 0), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.f30289n = motionEvent.getX();
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public void setBackgroundColor(int i3) {
        clearAnimation();
        super.setBackgroundColor(i3);
    }

    public void setChecked(boolean z10) {
        this.f30286c.a(z10, true);
    }

    public void setHeight(int i3) {
        this.f30288f = i3;
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
    }

    public void setTypeface(Typeface typeface) {
        this.f30284a.setTypeface(typeface);
    }
}
