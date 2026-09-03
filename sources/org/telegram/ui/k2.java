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
public final class k2 extends FrameLayout implements org.telegram.ui.Cells.k9, i3 {
    public final p70 f35404a;
    public final l4 f35405b;
    public f3 f35406c;
    public final i2 d;
    public final j2 e;
    public TL_iv.pageBlockPreformatted f35407f;
    public CharSequence h;

    public k2(Context context, final p70 p70Var, l4 l4Var) {
        super(context);
        this.f35404a = p70Var;
        this.f35405b = l4Var;
        i2 i2Var = new i2(context, p70Var);
        this.d = i2Var;
        i2Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        addView(i2Var, k7.b6.c(-2.0f, -1));
        j2 j2Var = new j2(this, context, p70Var, l4Var);
        this.e = j2Var;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        int dp = AndroidUtilities.dp(16.0f);
        layoutParams.rightMargin = dp;
        layoutParams.leftMargin = dp;
        int dp2 = AndroidUtilities.dp(12.0f);
        layoutParams.bottomMargin = dp2;
        layoutParams.topMargin = dp2;
        NotificationCenter.listenEmojiLoading(j2Var);
        i2Var.addView(j2Var, layoutParams);
        if (Build.VERSION.SDK_INT >= 23) {
            i2Var.setOnScrollChangeListener(new View.OnScrollChangeListener() {
                @Override
                public final void onScrollChange(View view, int i10, int i11, int i12, int i13) {
                    org.telegram.ui.Cells.l9 l9Var = ((n4) p70.this).L0;
                    if (l9Var != null && l9Var.y()) {
                        l9Var.x();
                    }
                }
            });
        }
        setWillNotDraw(false);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.f35406c;
        if (f3Var != null) {
            arrayList.add(f3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        if (this.f35406c == null) {
            return -1;
        }
        int a2 = this.f35406c.a() + AndroidUtilities.dp(16.0f);
        this.f35404a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        if (this.f35406c == null) {
            return -1;
        }
        int b10 = this.f35406c.b() + AndroidUtilities.dp(16.0f);
        this.f35404a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        if (this.f35406c == null) {
            return -1;
        }
        int c3 = this.f35406c.c() + AndroidUtilities.dp(16.0f);
        this.f35404a.getClass();
        return AndroidUtilities.dp(18) + c3;
    }

    public int getMinWidth() {
        return b.b(this);
    }

    @Override
    public final void invalidate() {
        this.e.invalidate();
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f3 f3Var = this.f35406c;
        if (f3Var != null) {
            f3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f3 f3Var = this.f35406c;
        if (f3Var != null) {
            f3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f35407f == null) {
            return;
        }
        canvas.drawRect(0.0f, AndroidUtilities.dp(8.0f), getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(8.0f), n4.f36346m1);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        f3 f3Var = this.f35406c;
        if (f3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(n4.i(R.string.AccDescrIVCode, n4.j(this.f35404a, this.f35405b, f3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        i2 i2Var = this.d;
        i2Var.measure(makeMeasureSpec, makeMeasureSpec2);
        setMeasuredDimension(size, i2Var.getMeasuredHeight());
    }

    public void setBlock(TL_iv.pageBlockPreformatted pageblockpreformatted) {
        this.h = null;
        this.f35407f = pageblockpreformatted;
        this.d.setScrollX(0);
        this.e.requestLayout();
    }
}
