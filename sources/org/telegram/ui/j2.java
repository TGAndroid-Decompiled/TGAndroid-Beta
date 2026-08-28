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
public final class j2 extends FrameLayout implements org.telegram.ui.Cells.m9, h3 {
    public final a70 f39341a;
    public final j4 f39342b;
    public e3 f39343c;
    public final h2 d;
    public final i2 f39344e;
    public TL_iv.pageBlockPreformatted f39345f;
    public CharSequence h;

    public j2(Context context, final a70 a70Var, j4 j4Var) {
        super(context);
        this.f39341a = a70Var;
        this.f39342b = j4Var;
        h2 h2Var = new h2(context, a70Var);
        this.d = h2Var;
        h2Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        addView(h2Var, g7.e6.c(-2.0f, -1));
        i2 i2Var = new i2(this, context, a70Var, j4Var);
        this.f39344e = i2Var;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        int dp = AndroidUtilities.dp(16.0f);
        layoutParams.rightMargin = dp;
        layoutParams.leftMargin = dp;
        int dp2 = AndroidUtilities.dp(12.0f);
        layoutParams.bottomMargin = dp2;
        layoutParams.topMargin = dp2;
        NotificationCenter.listenEmojiLoading(i2Var);
        h2Var.addView(i2Var, layoutParams);
        if (Build.VERSION.SDK_INT >= 23) {
            h2Var.setOnScrollChangeListener(new View.OnScrollChangeListener() {
                @Override
                public final void onScrollChange(View view, int i9, int i10, int i11, int i12) {
                    org.telegram.ui.Cells.n9 n9Var = ((l4) a70.this).K0;
                    if (n9Var != null && n9Var.y()) {
                        n9Var.x();
                    }
                }
            });
        }
        setWillNotDraw(false);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        e3 e3Var = this.f39343c;
        if (e3Var != null) {
            arrayList.add(e3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        if (this.f39343c == null) {
            return -1;
        }
        int a2 = this.f39343c.a() + AndroidUtilities.dp(16.0f);
        this.f39341a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        if (this.f39343c == null) {
            return -1;
        }
        int b10 = this.f39343c.b() + AndroidUtilities.dp(16.0f);
        this.f39341a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        if (this.f39343c == null) {
            return -1;
        }
        int c10 = this.f39343c.c() + AndroidUtilities.dp(16.0f);
        this.f39341a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.ll.b(this);
    }

    @Override
    public final void invalidate() {
        this.f39344e.invalidate();
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        e3 e3Var = this.f39343c;
        if (e3Var != null) {
            e3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e3 e3Var = this.f39343c;
        if (e3Var != null) {
            e3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f39345f == null) {
            return;
        }
        canvas.drawRect(0.0f, AndroidUtilities.dp(8.0f), getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(8.0f), l4.l1);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        e3 e3Var = this.f39343c;
        if (e3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(l4.i(R.string.AccDescrIVCode, l4.j(this.f39341a, this.f39342b, e3Var)));
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        h2 h2Var = this.d;
        h2Var.measure(makeMeasureSpec, makeMeasureSpec2);
        setMeasuredDimension(size, h2Var.getMeasuredHeight());
    }

    public void setBlock(TL_iv.pageBlockPreformatted pageblockpreformatted) {
        this.h = null;
        this.f39345f = pageblockpreformatted;
        this.d.setScrollX(0);
        this.f39344e.requestLayout();
    }
}
