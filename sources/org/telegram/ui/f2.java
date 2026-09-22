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
public final class f2 extends FrameLayout implements org.telegram.ui.Cells.p9, d3 {
    public final u70 f33459a;
    public final f4 f33460b;
    public a3 f33461c;
    public final ii.a4 d;
    public final e2 e;
    public TL_iv.pageBlockPreformatted f33462f;
    public CharSequence h;

    public f2(Context context, final u70 u70Var, f4 f4Var) {
        super(context);
        this.f33459a = u70Var;
        this.f33460b = f4Var;
        ii.a4 a4Var = new ii.a4(context, u70Var);
        this.d = a4Var;
        a4Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        addView(a4Var, w7.x5.c(-2.0f, -1));
        e2 e2Var = new e2(this, context, u70Var, f4Var);
        this.e = e2Var;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        int dp = AndroidUtilities.dp(16.0f);
        layoutParams.rightMargin = dp;
        layoutParams.leftMargin = dp;
        int dp2 = AndroidUtilities.dp(12.0f);
        layoutParams.bottomMargin = dp2;
        layoutParams.topMargin = dp2;
        NotificationCenter.listenEmojiLoading(e2Var);
        a4Var.addView(e2Var, layoutParams);
        if (Build.VERSION.SDK_INT >= 23) {
            a4Var.setOnScrollChangeListener(new View.OnScrollChangeListener() {
                @Override
                public final void onScrollChange(View view, int i10, int i11, int i12, int i13) {
                    org.telegram.ui.Cells.q9 q9Var = ((h4) u70.this).O0;
                    if (q9Var != null && q9Var.y()) {
                        q9Var.x();
                    }
                }
            });
        }
        setWillNotDraw(false);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        a3 a3Var = this.f33461c;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        if (this.f33461c == null) {
            return -1;
        }
        int a2 = this.f33461c.a() + AndroidUtilities.dp(16.0f);
        this.f33459a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        if (this.f33461c == null) {
            return -1;
        }
        int b10 = this.f33461c.b() + AndroidUtilities.dp(16.0f);
        this.f33459a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        if (this.f33461c == null) {
            return -1;
        }
        int c10 = this.f33461c.c() + AndroidUtilities.dp(16.0f);
        this.f33459a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.vl.b(this);
    }

    @Override
    public final void invalidate() {
        this.e.invalidate();
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.f33461c;
        if (a3Var != null) {
            a3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.f33461c;
        if (a3Var != null) {
            a3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f33462f == null) {
            return;
        }
        canvas.drawRect(0.0f, AndroidUtilities.dp(8.0f), getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(8.0f), h4.f34059p1);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        a3 a3Var = this.f33461c;
        if (a3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(h4.i(R.string.AccDescrIVCode, h4.j(this.f33459a, this.f33460b, a3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        ii.a4 a4Var = this.d;
        a4Var.measure(makeMeasureSpec, makeMeasureSpec2);
        setMeasuredDimension(size, a4Var.getMeasuredHeight());
    }

    public void setBlock(TL_iv.pageBlockPreformatted pageblockpreformatted) {
        this.h = null;
        this.f33462f = pageblockpreformatted;
        this.d.setScrollX(0);
        this.e.requestLayout();
    }
}
