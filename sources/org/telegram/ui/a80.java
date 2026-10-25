package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class a80 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final org.telegram.ui.ActionBar.b6 f37661a;
    public final org.telegram.ui.Components.m9 f37662b;
    public boolean f37663c;
    public int d;
    public final b80 e;

    public a80(b80 b80Var, Context context) {
        super(context);
        this.e = b80Var;
        int i10 = org.telegram.ui.ActionBar.y6.f23446i6;
        this.d = org.telegram.ui.ActionBar.y6.x0(null, i10, false);
        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(context);
        this.f37661a = b6Var;
        b6Var.setTextSize(16);
        b6Var.setEllipsizeByGradient(true);
        b6Var.setRightPadding(AndroidUtilities.dp(68.0f));
        org.telegram.ui.ActionBar.f7.Y(b6Var, org.telegram.ui.ActionBar.y6.f23462j5, null);
        addView(b6Var, org.telegram.ui.Components.gb1.h(0, -2.0f, 19, 19.0f, 0.0f, 19.0f, 0.0f));
        org.telegram.ui.Components.m9 m9Var = new org.telegram.ui.Components.m9(context, false);
        this.f37662b = m9Var;
        m9Var.f30457a.f30107a = true;
        m9Var.setStyle(11);
        m9Var.setAvatarsTextSize(AndroidUtilities.dp(22.0f));
        addView(m9Var, org.telegram.ui.Components.gb1.h(56, -1.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
        setBackground(org.telegram.ui.ActionBar.y6.Z(org.telegram.ui.ActionBar.y6.x0(null, i10, false), 0, 4));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
        }
        this.f37663c = true;
        org.telegram.ui.ActionBar.b6 b6Var = this.f37661a;
        b6Var.setVisibility(8);
        super.onMeasure(i10, i11);
        b6Var.setVisibility(0);
        b6Var.getLayoutParams().width = getMeasuredWidth();
        this.f37663c = false;
        this.e.g();
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f37663c) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void updateColors() {
        try {
            int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23446i6, false);
            if (x02 != this.d) {
                this.d = x02;
                org.telegram.ui.ActionBar.y6.E1(getBackground(), x02, true);
                invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
