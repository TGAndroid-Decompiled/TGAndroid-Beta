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
import org.telegram.messenger.a30;
import org.telegram.messenger.dd;
import org.telegram.ui.Components.ep;
public final class u8 extends FrameLayout {
    public final TextView f23146a;
    public final TextView f23147b;
    public final ep f23148c;
    public boolean d;
    public boolean e;
    public int f23149f;
    public float h;
    public float f23150n;

    static {
        new mh.g("animationProgress", 3);
    }

    public u8(Context context) {
        super(context);
        int i10;
        int i11;
        float f7;
        float f10;
        int i12;
        int i13;
        float f11;
        float f12;
        this.f23149f = 50;
        TextView textView = new TextView(context);
        this.f23146a = textView;
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.G6, null);
        a30.o(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        if (dd.X) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 16);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        boolean z10 = dd.X;
        if (z10) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i14 = i11 | 48;
        if (z10) {
            f7 = 21;
        } else {
            f7 = 64.0f;
        }
        if (z10) {
            f10 = 64.0f;
        } else {
            f10 = 21;
        }
        addView(textView, w7.b6.d(-1, -1.0f, i14, f7, 0.0f, f10, 0.0f));
        TextView textView2 = new TextView(context);
        this.f23147b = textView2;
        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.f21331z6, null);
        textView2.setTextSize(1, 13.0f);
        if (dd.X) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        textView2.setGravity(i12);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setPadding(0, 0, 0, 0);
        textView2.setEllipsize(truncateAt);
        boolean z11 = dd.X;
        if (z11) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        int i15 = i13 | 48;
        if (z11) {
            f11 = 21;
        } else {
            f11 = 64.0f;
        }
        if (z11) {
            f12 = 64.0f;
        } else {
            f12 = 21;
        }
        addView(textView2, w7.b6.d(-2, -2.0f, i15, f11, 36.0f, f12, 0.0f));
        ep epVar = new ep(21, context, null);
        this.f23148c = epVar;
        epVar.setDrawUnchecked(true);
        epVar.setDrawBackgroundAsArc(10);
        epVar.setDuration(100L);
        epVar.b(org.telegram.ui.ActionBar.t6.f21004h7, org.telegram.ui.ActionBar.t6.f21040j7, org.telegram.ui.ActionBar.t6.f21060k7);
        addView(epVar, w7.b6.d(20, 20.0f, (dd.X ? 5 : 3) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        setClipChildren(false);
    }

    public void setAnimationProgress(float f7) {
        this.h = f7;
        Math.max(this.f23150n, getMeasuredWidth() - this.f23150n);
        org.telegram.messenger.i0.L(40.0f);
        getMeasuredHeight();
    }

    public final void b(String str, String str2, boolean z10, boolean z11) {
        TextView textView = this.f23146a;
        textView.setText(str);
        TextView textView2 = this.f23147b;
        textView2.setText(str2);
        this.d = z11;
        textView2.setVisibility(0);
        this.e = z10;
        if (z10) {
            textView2.setLines(0);
            textView2.setMaxLines(0);
            textView2.setSingleLine(false);
            textView2.setEllipsize(null);
            textView2.setPadding(0, 0, 0, org.telegram.messenger.i0.L(11.0f));
        } else {
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setPadding(0, 0, 0, 0);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.height = -2;
        layoutParams.topMargin = org.telegram.messenger.i0.L(10.0f);
        textView.setLayoutParams(layoutParams);
        setWillNotDraw(!z11);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i10;
        if (this.d) {
            if (dd.X) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.i0.L(64.0f);
            }
            float f7 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (dd.X) {
                i10 = org.telegram.messenger.i0.L(64.0f);
            } else {
                i10 = 0;
            }
            canvas.drawLine(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.f21053k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.checkbox");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.f23148c.f25895a.f23920q);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f23146a.getText());
        TextView textView = this.f23147b;
        if (textView != null) {
            sb2.append("\n");
            sb2.append(textView.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        if (this.e) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            return;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.f23147b.getVisibility() == 0) {
            f7 = 64.0f;
        } else {
            f7 = this.f23149f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(f7) + (this.d ? 1 : 0), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.f23150n = motionEvent.getX();
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public void setBackgroundColor(int i10) {
        clearAnimation();
        super.setBackgroundColor(i10);
    }

    public void setChecked(boolean z10) {
        this.f23148c.a(z10, true);
    }

    public void setHeight(int i10) {
        this.f23149f = i10;
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
    }

    public void setTypeface(Typeface typeface) {
        this.f23146a.setTypeface(typeface);
    }
}
