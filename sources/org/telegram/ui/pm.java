package org.telegram.ui;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.HashSet;
public final class pm extends TextView implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.Cells.y f50321a;
    public int f50322b;
    public boolean f50323c;
    public final an d;

    public pm(an anVar, Activity activity) {
        super(activity);
        this.d = anVar;
        setSingleLine(true);
        setLines(1);
        setMaxLines(1);
        setEllipsize(TextUtils.TruncateAt.END);
        org.telegram.ui.ActionBar.q6.U(this, org.telegram.ui.ActionBar.j6.Ji, anVar.getResourceProvider());
        int themedColor = anVar.getThemedColor(org.telegram.ui.ActionBar.j6.Fi);
        this.f50322b = themedColor;
        org.telegram.ui.Cells.y e10 = org.telegram.ui.ActionBar.y5.e(themedColor, 16.0f);
        this.f50321a = e10;
        setBackground(e10);
        setTextSize(1, 14.0f);
        setTypeface(org.telegram.messenger.g0.o());
        setGravity(17);
        setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i7), (int) (org.telegram.messenger.g0.f23609q.x * 0.45f)), Integer.MIN_VALUE), i10);
    }

    @Override
    public final void updateColors() {
        try {
            int themedColor = this.d.getThemedColor(org.telegram.ui.ActionBar.j6.Fi);
            if (themedColor == this.f50322b && this.f50323c == org.telegram.ui.ActionBar.j6.I.q()) {
                return;
            }
            Drawable background = getBackground();
            org.telegram.ui.Cells.y yVar = this.f50321a;
            if (background == yVar) {
                this.f50323c = org.telegram.ui.ActionBar.j6.I.q();
                org.telegram.ui.ActionBar.j6.H1(yVar, themedColor, false);
                org.telegram.ui.ActionBar.j6.H1(yVar, org.telegram.ui.ActionBar.y5.b(themedColor), true);
                this.f50322b = themedColor;
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
