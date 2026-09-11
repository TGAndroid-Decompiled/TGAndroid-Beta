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
    public final v70 f36526a;
    public final g4 f36527b;
    public b3 f36528c;
    public final ji.z3 d;
    public final f2 f36529e;
    public TL_iv.pageBlockPreformatted f36530f;
    public CharSequence h;

    public g2(Context context, final v70 v70Var, g4 g4Var) {
        super(context);
        this.f36526a = v70Var;
        this.f36527b = g4Var;
        ji.z3 z3Var = new ji.z3(context, v70Var);
        this.d = z3Var;
        z3Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        addView(z3Var, w7.x5.c(-2.0f, -1));
        f2 f2Var = new f2(this, context, v70Var, g4Var);
        this.f36529e = f2Var;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        int dp = AndroidUtilities.dp(16.0f);
        layoutParams.rightMargin = dp;
        layoutParams.leftMargin = dp;
        int dp2 = AndroidUtilities.dp(12.0f);
        layoutParams.bottomMargin = dp2;
        layoutParams.topMargin = dp2;
        NotificationCenter.listenEmojiLoading(f2Var);
        z3Var.addView(f2Var, layoutParams);
        if (Build.VERSION.SDK_INT >= 23) {
            z3Var.setOnScrollChangeListener(new View.OnScrollChangeListener() {
                @Override
                public final void onScrollChange(View view, int i10, int i11, int i12, int i13) {
                    org.telegram.ui.Cells.q9 q9Var = ((i4) v70.this).O0;
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
        b3 b3Var = this.f36528c;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        if (this.f36528c == null) {
            return -1;
        }
        int a2 = this.f36528c.a() + AndroidUtilities.dp(16.0f);
        this.f36526a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        if (this.f36528c == null) {
            return -1;
        }
        int b10 = this.f36528c.b() + AndroidUtilities.dp(16.0f);
        this.f36526a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        if (this.f36528c == null) {
            return -1;
        }
        int c10 = this.f36528c.c() + AndroidUtilities.dp(16.0f);
        this.f36526a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.vl.b(this);
    }

    @Override
    public final void invalidate() {
        this.f36529e.invalidate();
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b3 b3Var = this.f36528c;
        if (b3Var != null) {
            b3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b3 b3Var = this.f36528c;
        if (b3Var != null) {
            b3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f36530f == null) {
            return;
        }
        canvas.drawRect(0.0f, AndroidUtilities.dp(8.0f), getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(8.0f), i4.f37201p1);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        b3 b3Var = this.f36528c;
        if (b3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(i4.i(R.string.AccDescrIVCode, i4.j(this.f36526a, this.f36527b, b3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        ji.z3 z3Var = this.d;
        z3Var.measure(makeMeasureSpec, makeMeasureSpec2);
        setMeasuredDimension(size, z3Var.getMeasuredHeight());
    }

    public void setBlock(TL_iv.pageBlockPreformatted pageblockpreformatted) {
        this.h = null;
        this.f36530f = pageblockpreformatted;
        this.d.setScrollX(0);
        this.f36529e.requestLayout();
    }
}
