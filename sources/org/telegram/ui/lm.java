package org.telegram.ui;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.HashSet;
public final class lm extends TextView implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.Cells.y f47359a;
    public int f47360b;
    public boolean f47361c;
    public final wm d;

    public lm(wm wmVar, Activity activity) {
        super(activity);
        this.d = wmVar;
        setSingleLine(true);
        setLines(1);
        setMaxLines(1);
        setEllipsize(TextUtils.TruncateAt.END);
        org.telegram.ui.ActionBar.r6.V(this, org.telegram.ui.ActionBar.k6.Gi, wmVar.getResourceProvider());
        int themedColor = wmVar.getThemedColor(org.telegram.ui.ActionBar.k6.Ci);
        this.f47360b = themedColor;
        org.telegram.ui.Cells.y e10 = org.telegram.ui.ActionBar.y5.e(themedColor, 16.0f);
        this.f47359a = e10;
        setBackground(e10);
        setTextSize(1, 14.0f);
        setTypeface(org.telegram.messenger.g0.o());
        setGravity(17);
        setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i3), (int) (org.telegram.messenger.g0.f22608q.x * 0.45f)), Integer.MIN_VALUE), i10);
    }

    @Override
    public final void updateColors() {
        try {
            int themedColor = this.d.getThemedColor(org.telegram.ui.ActionBar.k6.Ci);
            if (themedColor == this.f47360b && this.f47361c == org.telegram.ui.ActionBar.k6.I.q()) {
                return;
            }
            Drawable background = getBackground();
            org.telegram.ui.Cells.y yVar = this.f47359a;
            if (background == yVar) {
                this.f47361c = org.telegram.ui.ActionBar.k6.I.q();
                org.telegram.ui.ActionBar.k6.H1(yVar, themedColor, false);
                org.telegram.ui.ActionBar.k6.H1(yVar, org.telegram.ui.ActionBar.y5.b(themedColor), true);
                this.f47360b = themedColor;
                invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
