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
public final class g2 extends FrameLayout implements org.telegram.ui.Cells.p9, e3 {
    public final p70 f33800a;
    public final g4 f33801b;
    public b3 f33802c;
    public final ii.b4 d;
    public final f2 e;
    public TL_iv.pageBlockPreformatted f33803f;
    public CharSequence h;

    public g2(Context context, final p70 p70Var, g4 g4Var) {
        super(context);
        this.f33800a = p70Var;
        this.f33801b = g4Var;
        ii.b4 b4Var = new ii.b4(context, p70Var);
        this.d = b4Var;
        b4Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        addView(b4Var, w7.y5.c(-2.0f, -1));
        f2 f2Var = new f2(this, context, p70Var, g4Var);
        this.e = f2Var;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        int dp = AndroidUtilities.dp(16.0f);
        layoutParams.rightMargin = dp;
        layoutParams.leftMargin = dp;
        int dp2 = AndroidUtilities.dp(12.0f);
        layoutParams.bottomMargin = dp2;
        layoutParams.topMargin = dp2;
        NotificationCenter.listenEmojiLoading(f2Var);
        b4Var.addView(f2Var, layoutParams);
        if (Build.VERSION.SDK_INT >= 23) {
            b4Var.setOnScrollChangeListener(new View.OnScrollChangeListener() {
                @Override
                public final void onScrollChange(View view, int i10, int i11, int i12, int i13) {
                    org.telegram.ui.Cells.q9 q9Var = ((i4) p70.this).O0;
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
        b3 b3Var = this.f33802c;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        if (this.f33802c == null) {
            return -1;
        }
        int a2 = this.f33802c.a() + AndroidUtilities.dp(16.0f);
        this.f33800a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        if (this.f33802c == null) {
            return -1;
        }
        int b10 = this.f33802c.b() + AndroidUtilities.dp(16.0f);
        this.f33800a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        if (this.f33802c == null) {
            return -1;
        }
        int c10 = this.f33802c.c() + AndroidUtilities.dp(16.0f);
        this.f33800a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.ok.a(this);
    }

    @Override
    public final void invalidate() {
        this.e.invalidate();
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b3 b3Var = this.f33802c;
        if (b3Var != null) {
            b3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b3 b3Var = this.f33802c;
        if (b3Var != null) {
            b3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f33803f == null) {
            return;
        }
        canvas.drawRect(0.0f, AndroidUtilities.dp(8.0f), getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(8.0f), i4.f34377p1);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        b3 b3Var = this.f33802c;
        if (b3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(i4.i(R.string.AccDescrIVCode, i4.j(this.f33800a, this.f33801b, b3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        ii.b4 b4Var = this.d;
        b4Var.measure(makeMeasureSpec, makeMeasureSpec2);
        setMeasuredDimension(size, b4Var.getMeasuredHeight());
    }

    public void setBlock(TL_iv.pageBlockPreformatted pageblockpreformatted) {
        this.h = null;
        this.f33803f = pageblockpreformatted;
        this.d.setScrollX(0);
        this.e.requestLayout();
    }
}
