package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
public final class f2 extends FrameLayout implements org.telegram.ui.Cells.r9, e3 {
    public final h70 f39236a;
    public final h4 f39237b;
    public a3 f39238c;
    public final li.z3 d;
    public final e2 e;
    public TL_iv.pageBlockPreformatted f39239f;
    public CharSequence h;

    public f2(Context context, final h70 h70Var, h4 h4Var) {
        super(context);
        this.f39236a = h70Var;
        this.f39237b = h4Var;
        li.z3 z3Var = new li.z3(context, h70Var);
        this.d = z3Var;
        z3Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        addView(z3Var, org.telegram.ui.Components.gb1.g(-2.0f, -1));
        e2 e2Var = new e2(this, context, h70Var, h4Var);
        this.e = e2Var;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        int dp = AndroidUtilities.dp(16.0f);
        layoutParams.rightMargin = dp;
        layoutParams.leftMargin = dp;
        int dp2 = AndroidUtilities.dp(12.0f);
        layoutParams.bottomMargin = dp2;
        layoutParams.topMargin = dp2;
        NotificationCenter.listenEmojiLoading(e2Var);
        z3Var.addView(e2Var, layoutParams);
        z3Var.setOnScrollChangeListener(new View.OnScrollChangeListener() {
            @Override
            public final void onScrollChange(View view, int i10, int i11, int i12, int i13) {
                org.telegram.ui.Cells.s9 s9Var = ((j4) h70.this).P0;
                if (s9Var != null && s9Var.x()) {
                    s9Var.w();
                }
            }
        });
        setWillNotDraw(false);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        a3 a3Var = this.f39238c;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        if (this.f39238c == null) {
            return -1;
        }
        int a2 = this.f39238c.a() + AndroidUtilities.dp(16.0f);
        this.f39236a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        if (this.f39238c == null) {
            return -1;
        }
        int b10 = this.f39238c.b() + AndroidUtilities.dp(16.0f);
        this.f39236a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        if (this.f39238c == null) {
            return -1;
        }
        int c10 = this.f39238c.c() + AndroidUtilities.dp(16.0f);
        this.f39236a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return d3.b(this);
    }

    @Override
    public final void invalidate() {
        this.e.invalidate();
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.f39238c;
        if (a3Var != null) {
            a3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.f39238c;
        if (a3Var != null) {
            a3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f39239f == null) {
            return;
        }
        canvas.drawRect(0.0f, AndroidUtilities.dp(8.0f), getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(8.0f), j4.f40415q1);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        a3 a3Var = this.f39238c;
        if (a3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(j4.i(R.string.AccDescrIVCode, j4.j(this.f39236a, this.f39237b, a3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        li.z3 z3Var = this.d;
        z3Var.measure(makeMeasureSpec, makeMeasureSpec2);
        setMeasuredDimension(size, z3Var.getMeasuredHeight());
    }

    public void setBlock(TL_iv.pageBlockPreformatted pageblockpreformatted) {
        this.h = null;
        this.f39239f = pageblockpreformatted;
        this.d.setScrollX(0);
        this.e.requestLayout();
    }
}
