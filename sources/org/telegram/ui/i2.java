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
public final class i2 extends FrameLayout implements org.telegram.ui.Cells.n9, g3 {
    public final z70 f37010a;
    public final i4 f37011b;
    public d3 f37012c;
    public final ji.b4 d;
    public final h2 e;
    public TL_iv.pageBlockPreformatted f37013f;
    public CharSequence h;

    public i2(Context context, final z70 z70Var, i4 i4Var) {
        super(context);
        this.f37010a = z70Var;
        this.f37011b = i4Var;
        ji.b4 b4Var = new ji.b4(context, z70Var);
        this.d = b4Var;
        b4Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        addView(b4Var, w7.a6.d(-2.0f, -1));
        h2 h2Var = new h2(this, context, z70Var, i4Var);
        this.e = h2Var;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        int dp = AndroidUtilities.dp(16.0f);
        layoutParams.rightMargin = dp;
        layoutParams.leftMargin = dp;
        int dp2 = AndroidUtilities.dp(12.0f);
        layoutParams.bottomMargin = dp2;
        layoutParams.topMargin = dp2;
        NotificationCenter.listenEmojiLoading(h2Var);
        b4Var.addView(h2Var, layoutParams);
        b4Var.setOnScrollChangeListener(new View.OnScrollChangeListener() {
            @Override
            public final void onScrollChange(View view, int i10, int i11, int i12, int i13) {
                org.telegram.ui.Cells.o9 o9Var = ((k4) z70.this).O0;
                if (o9Var != null && o9Var.x()) {
                    o9Var.w();
                }
            }
        });
        setWillNotDraw(false);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d3 d3Var = this.f37012c;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        if (this.f37012c == null) {
            return -1;
        }
        int a2 = this.f37012c.a() + AndroidUtilities.dp(16.0f);
        this.f37010a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        if (this.f37012c == null) {
            return -1;
        }
        int b10 = this.f37012c.b() + AndroidUtilities.dp(16.0f);
        this.f37010a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        if (this.f37012c == null) {
            return -1;
        }
        int c10 = this.f37012c.c() + AndroidUtilities.dp(16.0f);
        this.f37010a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.yh.a(this);
    }

    @Override
    public final void invalidate() {
        this.e.invalidate();
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d3 d3Var = this.f37012c;
        if (d3Var != null) {
            d3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d3 d3Var = this.f37012c;
        if (d3Var != null) {
            d3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f37013f == null) {
            return;
        }
        canvas.drawRect(0.0f, AndroidUtilities.dp(8.0f), getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(8.0f), k4.f37526p1);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        d3 d3Var = this.f37012c;
        if (d3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(k4.i(R.string.AccDescrIVCode, k4.j(this.f37010a, this.f37011b, d3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        ji.b4 b4Var = this.d;
        b4Var.measure(makeMeasureSpec, makeMeasureSpec2);
        setMeasuredDimension(size, b4Var.getMeasuredHeight());
    }

    public void setBlock(TL_iv.pageBlockPreformatted pageblockpreformatted) {
        this.h = null;
        this.f37013f = pageblockpreformatted;
        this.d.setScrollX(0);
        this.e.requestLayout();
    }
}
