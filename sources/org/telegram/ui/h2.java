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
public final class h2 extends FrameLayout implements org.telegram.ui.Cells.n9, f3 {
    public final f70 f37710a;
    public final i4 f37711b;
    public c3 f37712c;
    public final ki.a4 d;
    public final g2 e;
    public TL_iv.pageBlockPreformatted f37713f;
    public CharSequence h;

    public h2(Context context, final f70 f70Var, i4 i4Var) {
        super(context);
        this.f37710a = f70Var;
        this.f37711b = i4Var;
        ki.a4 a4Var = new ki.a4(context, f70Var);
        this.d = a4Var;
        a4Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        addView(a4Var, w7.z5.c(-2.0f, -1));
        g2 g2Var = new g2(this, context, f70Var, i4Var);
        this.e = g2Var;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        int dp = AndroidUtilities.dp(16.0f);
        layoutParams.rightMargin = dp;
        layoutParams.leftMargin = dp;
        int dp2 = AndroidUtilities.dp(12.0f);
        layoutParams.bottomMargin = dp2;
        layoutParams.topMargin = dp2;
        NotificationCenter.listenEmojiLoading(g2Var);
        a4Var.addView(g2Var, layoutParams);
        a4Var.setOnScrollChangeListener(new View.OnScrollChangeListener() {
            @Override
            public final void onScrollChange(View view, int i10, int i11, int i12, int i13) {
                org.telegram.ui.Cells.o9 o9Var = ((k4) f70.this).P0;
                if (o9Var != null && o9Var.x()) {
                    o9Var.w();
                }
            }
        });
        setWillNotDraw(false);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        c3 c3Var = this.f37712c;
        if (c3Var != null) {
            arrayList.add(c3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        if (this.f37712c == null) {
            return -1;
        }
        int a2 = this.f37712c.a() + AndroidUtilities.dp(16.0f);
        this.f37710a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        if (this.f37712c == null) {
            return -1;
        }
        int b10 = this.f37712c.b() + AndroidUtilities.dp(16.0f);
        this.f37710a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        if (this.f37712c == null) {
            return -1;
        }
        int c10 = this.f37712c.c() + AndroidUtilities.dp(16.0f);
        this.f37710a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.sl.a(this);
    }

    @Override
    public final void invalidate() {
        this.e.invalidate();
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c3 c3Var = this.f37712c;
        if (c3Var != null) {
            c3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c3 c3Var = this.f37712c;
        if (c3Var != null) {
            c3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f37713f == null) {
            return;
        }
        canvas.drawRect(0.0f, AndroidUtilities.dp(8.0f), getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(8.0f), k4.f38774q1);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        c3 c3Var = this.f37712c;
        if (c3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(k4.i(R.string.AccDescrIVCode, k4.j(this.f37710a, this.f37711b, c3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        ki.a4 a4Var = this.d;
        a4Var.measure(makeMeasureSpec, makeMeasureSpec2);
        setMeasuredDimension(size, a4Var.getMeasuredHeight());
    }

    public void setBlock(TL_iv.pageBlockPreformatted pageblockpreformatted) {
        this.h = null;
        this.f37713f = pageblockpreformatted;
        this.d.setScrollX(0);
        this.e.requestLayout();
    }
}
