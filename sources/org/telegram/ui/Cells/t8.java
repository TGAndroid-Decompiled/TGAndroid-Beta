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
import org.telegram.messenger.hd;
import org.telegram.messenger.o10;
import org.telegram.ui.Components.op;
public final class t8 extends FrameLayout {
    public final TextView f31880a;
    public final TextView f31881b;
    public final op f31882c;
    public boolean d;
    public boolean f31883e;
    public int f31884f;
    public float h;
    public float f31885n;

    static {
        new p8("animationProgress", 1);
    }

    public t8(Context context) {
        super(context);
        int i7;
        int i10;
        float f10;
        float f11;
        int i11;
        int i12;
        float f12;
        float f13;
        this.f31884f = 50;
        TextView textView = new TextView(context);
        this.f31880a = textView;
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.G6, null);
        o10.q(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        if (hd.f24444a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        textView.setGravity(i7 | 16);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        boolean z10 = hd.f24444a0;
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
        addView(textView, c8.ma.d(-1, -1.0f, i13, f10, 0.0f, f11, 0.0f));
        TextView textView2 = new TextView(context);
        this.f31881b = textView2;
        org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.f29792z6, null);
        textView2.setTextSize(1, 13.0f);
        if (hd.f24444a0) {
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
        boolean z11 = hd.f24444a0;
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
        addView(textView2, c8.ma.d(-2, -2.0f, i14, f12, 36.0f, f13, 0.0f));
        op opVar = new op(21, context, null);
        this.f31882c = opVar;
        opVar.setDrawUnchecked(true);
        opVar.setDrawBackgroundAsArc(10);
        opVar.setDuration(100L);
        opVar.b(org.telegram.ui.ActionBar.m6.h7, org.telegram.ui.ActionBar.m6.f29491j7, org.telegram.ui.ActionBar.m6.f29511k7);
        addView(opVar, c8.ma.d(20, 20.0f, (hd.f24444a0 ? 5 : 3) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        setClipChildren(false);
    }

    public void setAnimationProgress(float f10) {
        this.h = f10;
        Math.max(this.f31885n, getMeasuredWidth() - this.f31885n);
        org.telegram.messenger.g0.L(40.0f);
        getMeasuredHeight();
    }

    public final void b(String str, String str2, boolean z10, boolean z11) {
        TextView textView = this.f31880a;
        textView.setText(str);
        TextView textView2 = this.f31881b;
        textView2.setText(str2);
        this.d = z11;
        textView2.setVisibility(0);
        this.f31883e = z10;
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
        int i7;
        if (this.d) {
            if (hd.f24444a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(64.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (hd.f24444a0) {
                i7 = org.telegram.messenger.g0.L(64.0f);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.m6.f29504k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.checkbox");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.f31882c.f38321a.f32874q);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f31880a.getText());
        TextView textView = this.f31881b;
        if (textView != null) {
            sb2.append("\n");
            sb2.append(textView.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        if (this.f31883e) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            return;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824);
        if (this.f31881b.getVisibility() == 0) {
            f10 = 64.0f;
        } else {
            f10 = this.f31884f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f10) + (this.d ? 1 : 0), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.f31885n = motionEvent.getX();
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public void setBackgroundColor(int i7) {
        clearAnimation();
        super.setBackgroundColor(i7);
    }

    public void setChecked(boolean z10) {
        this.f31882c.a(z10, true);
    }

    public void setHeight(int i7) {
        this.f31884f = i7;
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
    }

    public void setTypeface(Typeface typeface) {
        this.f31880a.setTypeface(typeface);
    }
}
