package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
public final class i2 extends FrameLayout implements org.telegram.ui.Cells.l9, g3 {
    public final o70 f37721a;
    public final j4 f37722b;
    public d3 f37723c;
    public final g2 d;
    public final h2 f37724e;
    public TL_iv.pageBlockPreformatted f37725f;
    public CharSequence h;

    public i2(Context context, final o70 o70Var, j4 j4Var) {
        super(context);
        this.f37721a = o70Var;
        this.f37722b = j4Var;
        g2 g2Var = new g2(context, o70Var);
        this.d = g2Var;
        g2Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        addView(g2Var, k7.c6.c(-2.0f, -1));
        h2 h2Var = new h2(this, context, o70Var, j4Var);
        this.f37724e = h2Var;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        int dp = AndroidUtilities.dp(16.0f);
        layoutParams.rightMargin = dp;
        layoutParams.leftMargin = dp;
        int dp2 = AndroidUtilities.dp(12.0f);
        layoutParams.bottomMargin = dp2;
        layoutParams.topMargin = dp2;
        NotificationCenter.listenEmojiLoading(h2Var);
        g2Var.addView(h2Var, layoutParams);
        if (Build.VERSION.SDK_INT >= 23) {
            g2Var.setOnScrollChangeListener(new View.OnScrollChangeListener() {
                @Override
                public final void onScrollChange(View view, int i10, int i11, int i12, int i13) {
                    org.telegram.ui.Cells.m9 m9Var = ((l4) o70.this).L0;
                    if (m9Var != null && m9Var.y()) {
                        m9Var.x();
                    }
                }
            });
        }
        setWillNotDraw(false);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d3 d3Var = this.f37723c;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        if (this.f37723c == null) {
            return -1;
        }
        int a2 = this.f37723c.a() + AndroidUtilities.dp(16.0f);
        this.f37721a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        if (this.f37723c == null) {
            return -1;
        }
        int b10 = this.f37723c.b() + AndroidUtilities.dp(16.0f);
        this.f37721a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        if (this.f37723c == null) {
            return -1;
        }
        int c3 = this.f37723c.c() + AndroidUtilities.dp(16.0f);
        this.f37721a.getClass();
        return AndroidUtilities.dp(18) + c3;
    }

    public int getMinWidth() {
        return b.b(this);
    }

    @Override
    public final void invalidate() {
        this.f37724e.invalidate();
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d3 d3Var = this.f37723c;
        if (d3Var != null) {
            d3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d3 d3Var = this.f37723c;
        if (d3Var != null) {
            d3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f37725f == null) {
            return;
        }
        canvas.drawRect(0.0f, AndroidUtilities.dp(8.0f), getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(8.0f), l4.f38590m1);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        d3 d3Var = this.f37723c;
        if (d3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(l4.i(R.string.AccDescrIVCode, l4.j(this.f37721a, this.f37722b, d3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        g2 g2Var = this.d;
        g2Var.measure(makeMeasureSpec, makeMeasureSpec2);
        setMeasuredDimension(size, g2Var.getMeasuredHeight());
    }

    public void setBlock(TL_iv.pageBlockPreformatted pageblockpreformatted) {
        this.h = null;
        this.f37725f = pageblockpreformatted;
        this.d.setScrollX(0);
        this.f37724e.requestLayout();
    }
}
