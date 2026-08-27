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

public final class k2 extends FrameLayout implements org.telegram.ui.Cells.i9, i3 {

    public final d70 f39573a;

    public final k4 f39574b;

    public f3 f39575c;
    public final i2 d;

    public final j2 f39576e;

    public TL_iv.pageBlockPreformatted f39577f;
    public CharSequence h;

    public k2(Context context, final d70 d70Var, k4 k4Var) {
        super(context);
        this.f39573a = d70Var;
        this.f39574b = k4Var;
        i2 i2Var = new i2(context, d70Var);
        this.d = i2Var;
        i2Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        addView(i2Var, h7.z5.c(-2.0f, -1));
        j2 j2Var = new j2(this, context, d70Var, k4Var);
        this.f39576e = j2Var;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        int iDp = AndroidUtilities.dp(16.0f);
        layoutParams.rightMargin = iDp;
        layoutParams.leftMargin = iDp;
        int iDp2 = AndroidUtilities.dp(12.0f);
        layoutParams.bottomMargin = iDp2;
        layoutParams.topMargin = iDp2;
        NotificationCenter.listenEmojiLoading(j2Var);
        i2Var.addView(j2Var, layoutParams);
        if (Build.VERSION.SDK_INT >= 23) {
            i2Var.setOnScrollChangeListener(new View.OnScrollChangeListener() {
                @Override
                public final void onScrollChange(View view, int i10, int i11, int i12, int i13) {
                    org.telegram.ui.Cells.j9 j9Var = ((m4) d70Var).K0;
                    if (j9Var == null || !j9Var.y()) {
                        return;
                    }
                    j9Var.x();
                }
            });
        }
        setWillNotDraw(false);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.f39575c;
        if (f3Var != null) {
            arrayList.add(f3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        if (this.f39575c == null) {
            return -1;
        }
        int iA = this.f39575c.a() + AndroidUtilities.dp(16.0f);
        this.f39573a.getClass();
        return iA - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        if (this.f39575c == null) {
            return -1;
        }
        int iB = this.f39575c.b() + AndroidUtilities.dp(16.0f);
        this.f39573a.getClass();
        return AndroidUtilities.dp(18) + iB;
    }

    @Override
    public int getLastLineBoundRight() {
        if (this.f39575c == null) {
            return -1;
        }
        int iC = this.f39575c.c() + AndroidUtilities.dp(16.0f);
        this.f39573a.getClass();
        return AndroidUtilities.dp(18) + iC;
    }

    public int getMinWidth() {
        return org.telegram.messenger.rl.b(this);
    }

    @Override
    public final void invalidate() {
        this.f39576e.invalidate();
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f3 f3Var = this.f39575c;
        if (f3Var != null) {
            f3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f3 f3Var = this.f39575c;
        if (f3Var != null) {
            f3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f39577f == null) {
            return;
        }
        canvas.drawRect(0.0f, AndroidUtilities.dp(8.0f), getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(8.0f), m4.l1);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        f3 f3Var = this.f39575c;
        if (f3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(m4.i(R.string.AccDescrIVCode, m4.j(this.f39573a, this.f39574b, f3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        i2 i2Var = this.d;
        i2Var.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        setMeasuredDimension(size, i2Var.getMeasuredHeight());
    }

    public void setBlock(TL_iv.pageBlockPreformatted pageblockpreformatted) {
        this.h = null;
        this.f39577f = pageblockpreformatted;
        this.d.setScrollX(0);
        this.f39576e.requestLayout();
    }
}
