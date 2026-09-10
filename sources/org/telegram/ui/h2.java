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
public final class h2 extends FrameLayout implements org.telegram.ui.Cells.r9, f3 {
    public final t70 f33244a;
    public final h4 f33245b;
    public c3 f33246c;
    public final hi.d4 d;
    public final g2 e;
    public TL_iv.pageBlockPreformatted f33247f;
    public CharSequence h;

    public h2(Context context, final t70 t70Var, h4 h4Var) {
        super(context);
        this.f33244a = t70Var;
        this.f33245b = h4Var;
        hi.d4 d4Var = new hi.d4(context, t70Var);
        this.d = d4Var;
        d4Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        addView(d4Var, w7.a6.c(-2.0f, -1));
        g2 g2Var = new g2(this, context, t70Var, h4Var);
        this.e = g2Var;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        int dp = AndroidUtilities.dp(16.0f);
        layoutParams.rightMargin = dp;
        layoutParams.leftMargin = dp;
        int dp2 = AndroidUtilities.dp(12.0f);
        layoutParams.bottomMargin = dp2;
        layoutParams.topMargin = dp2;
        NotificationCenter.listenEmojiLoading(g2Var);
        d4Var.addView(g2Var, layoutParams);
        if (Build.VERSION.SDK_INT >= 23) {
            d4Var.setOnScrollChangeListener(new View.OnScrollChangeListener() {
                @Override
                public final void onScrollChange(View view, int i10, int i11, int i12, int i13) {
                    org.telegram.ui.Cells.s9 s9Var = ((j4) t70.this).O0;
                    if (s9Var != null && s9Var.y()) {
                        s9Var.x();
                    }
                }
            });
        }
        setWillNotDraw(false);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        c3 c3Var = this.f33246c;
        if (c3Var != null) {
            arrayList.add(c3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        if (this.f33246c == null) {
            return -1;
        }
        int a2 = this.f33246c.a() + AndroidUtilities.dp(16.0f);
        this.f33244a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        if (this.f33246c == null) {
            return -1;
        }
        int b10 = this.f33246c.b() + AndroidUtilities.dp(16.0f);
        this.f33244a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        if (this.f33246c == null) {
            return -1;
        }
        int c10 = this.f33246c.c() + AndroidUtilities.dp(16.0f);
        this.f33244a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.em.b(this);
    }

    @Override
    public final void invalidate() {
        this.e.invalidate();
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c3 c3Var = this.f33246c;
        if (c3Var != null) {
            c3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c3 c3Var = this.f33246c;
        if (c3Var != null) {
            c3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f33247f == null) {
            return;
        }
        canvas.drawRect(0.0f, AndroidUtilities.dp(8.0f), getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(8.0f), j4.f33889p1);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        c3 c3Var = this.f33246c;
        if (c3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(j4.i(R.string.AccDescrIVCode, j4.j(this.f33244a, this.f33245b, c3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        hi.d4 d4Var = this.d;
        d4Var.measure(makeMeasureSpec, makeMeasureSpec2);
        setMeasuredDimension(size, d4Var.getMeasuredHeight());
    }

    public void setBlock(TL_iv.pageBlockPreformatted pageblockpreformatted) {
        this.h = null;
        this.f33247f = pageblockpreformatted;
        this.d.setScrollX(0);
        this.e.requestLayout();
    }
}
