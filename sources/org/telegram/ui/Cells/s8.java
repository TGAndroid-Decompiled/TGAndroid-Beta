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
import org.telegram.messenger.id;
import org.telegram.ui.Components.wo;
public final class s8 extends FrameLayout {
    public final TextView f30297a;
    public final TextView f30298b;
    public final wo f30299c;
    public boolean d;
    public boolean f30300e;
    public int f30301f;
    public float h;
    public float f30302n;

    static {
        new o8("animationProgress", 1);
    }

    public s8(Context context) {
        super(context);
        int i7;
        int i10;
        float f10;
        float f11;
        int i11;
        int i12;
        float f12;
        float f13;
        this.f30301f = 50;
        TextView textView = new TextView(context);
        this.f30297a = textView;
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.G6, null);
        org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        if (id.f23161a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        textView.setGravity(i7 | 16);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        boolean z9 = id.f23161a0;
        if (z9) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i13 = i10 | 48;
        if (z9) {
            f10 = 21;
        } else {
            f10 = 64.0f;
        }
        if (z9) {
            f11 = 64.0f;
        } else {
            f11 = 21;
        }
        addView(textView, c8.ha.d(-1, -1.0f, i13, f10, 0.0f, f11, 0.0f));
        TextView textView2 = new TextView(context);
        this.f30298b = textView2;
        org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.f28300z6, null);
        textView2.setTextSize(1, 13.0f);
        if (id.f23161a0) {
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
        boolean z10 = id.f23161a0;
        if (z10) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        int i14 = i12 | 48;
        if (z10) {
            f12 = 21;
        } else {
            f12 = 64.0f;
        }
        if (z10) {
            f13 = 64.0f;
        } else {
            f13 = 21;
        }
        addView(textView2, c8.ha.d(-2, -2.0f, i14, f12, 36.0f, f13, 0.0f));
        wo woVar = new wo(21, context, null);
        this.f30299c = woVar;
        woVar.setDrawUnchecked(true);
        woVar.setDrawBackgroundAsArc(10);
        woVar.setDuration(100L);
        woVar.b(org.telegram.ui.ActionBar.m6.h7, org.telegram.ui.ActionBar.m6.f28000j7, org.telegram.ui.ActionBar.m6.f28020k7);
        addView(woVar, c8.ha.d(20, 20.0f, (id.f23161a0 ? 5 : 3) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        setClipChildren(false);
    }

    public void setAnimationProgress(float f10) {
        this.h = f10;
        Math.max(this.f30302n, getMeasuredWidth() - this.f30302n);
        org.telegram.messenger.g0.L(40.0f);
        getMeasuredHeight();
    }

    public final void b(String str, String str2, boolean z9, boolean z10) {
        TextView textView = this.f30297a;
        textView.setText(str);
        TextView textView2 = this.f30298b;
        textView2.setText(str2);
        this.d = z10;
        textView2.setVisibility(0);
        this.f30300e = z9;
        if (z9) {
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
        setWillNotDraw(!z10);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i7;
        if (this.d) {
            if (id.f23161a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(64.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (id.f23161a0) {
                i7 = org.telegram.messenger.g0.L(64.0f);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.m6.f28013k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.checkbox");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.f30299c.f40026a.f31279q);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f30297a.getText());
        TextView textView = this.f30298b;
        if (textView != null) {
            sb2.append("\n");
            sb2.append(textView.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        if (this.f30300e) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            return;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824);
        if (this.f30298b.getVisibility() == 0) {
            f10 = 64.0f;
        } else {
            f10 = this.f30301f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f10) + (this.d ? 1 : 0), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.f30302n = motionEvent.getX();
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public void setBackgroundColor(int i7) {
        clearAnimation();
        super.setBackgroundColor(i7);
    }

    public void setChecked(boolean z9) {
        this.f30299c.a(z9, true);
    }

    public void setHeight(int i7) {
        this.f30301f = i7;
    }

    @Override
    public void setPressed(boolean z9) {
        super.setPressed(z9);
    }

    public void setTypeface(Typeface typeface) {
        this.f30297a.setTypeface(typeface);
    }
}
