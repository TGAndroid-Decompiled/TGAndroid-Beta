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
public final class h2 extends FrameLayout implements org.telegram.ui.Cells.p9, f3 {
    public final s70 f34101a;
    public final h4 f34102b;
    public c3 f34103c;
    public final ii.b4 d;
    public final g2 e;
    public TL_iv.pageBlockPreformatted f34104f;
    public CharSequence h;

    public h2(Context context, final s70 s70Var, h4 h4Var) {
        super(context);
        this.f34101a = s70Var;
        this.f34102b = h4Var;
        ii.b4 b4Var = new ii.b4(context, s70Var);
        this.d = b4Var;
        b4Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        addView(b4Var, w7.y5.c(-2.0f, -1));
        g2 g2Var = new g2(this, context, s70Var, h4Var);
        this.e = g2Var;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        int dp = AndroidUtilities.dp(16.0f);
        layoutParams.rightMargin = dp;
        layoutParams.leftMargin = dp;
        int dp2 = AndroidUtilities.dp(12.0f);
        layoutParams.bottomMargin = dp2;
        layoutParams.topMargin = dp2;
        NotificationCenter.listenEmojiLoading(g2Var);
        b4Var.addView(g2Var, layoutParams);
        if (Build.VERSION.SDK_INT >= 23) {
            b4Var.setOnScrollChangeListener(new View.OnScrollChangeListener() {
                @Override
                public final void onScrollChange(View view, int i10, int i11, int i12, int i13) {
                    org.telegram.ui.Cells.q9 q9Var = ((j4) s70.this).O0;
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
        c3 c3Var = this.f34103c;
        if (c3Var != null) {
            arrayList.add(c3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        if (this.f34103c == null) {
            return -1;
        }
        int a2 = this.f34103c.a() + AndroidUtilities.dp(16.0f);
        this.f34101a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        if (this.f34103c == null) {
            return -1;
        }
        int b10 = this.f34103c.b() + AndroidUtilities.dp(16.0f);
        this.f34101a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        if (this.f34103c == null) {
            return -1;
        }
        int c10 = this.f34103c.c() + AndroidUtilities.dp(16.0f);
        this.f34101a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.qk.a(this);
    }

    @Override
    public final void invalidate() {
        this.e.invalidate();
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c3 c3Var = this.f34103c;
        if (c3Var != null) {
            c3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c3 c3Var = this.f34103c;
        if (c3Var != null) {
            c3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f34104f == null) {
            return;
        }
        canvas.drawRect(0.0f, AndroidUtilities.dp(8.0f), getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(8.0f), j4.f34596p1);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        c3 c3Var = this.f34103c;
        if (c3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(j4.i(R.string.AccDescrIVCode, j4.j(this.f34101a, this.f34102b, c3Var)));
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
        this.f34104f = pageblockpreformatted;
        this.d.setScrollX(0);
        this.e.requestLayout();
    }
}
