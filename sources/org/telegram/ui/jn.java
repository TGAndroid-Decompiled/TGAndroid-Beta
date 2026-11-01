package org.telegram.ui;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.HashSet;
public final class jn extends TextView implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.Cells.y f38473a;
    public int f38474b;
    public boolean f38475c;
    public final un d;

    public jn(un unVar, Activity activity) {
        super(activity);
        this.d = unVar;
        setSingleLine(true);
        setLines(1);
        setMaxLines(1);
        setEllipsize(TextUtils.TruncateAt.END);
        org.telegram.ui.ActionBar.a7.V(this, org.telegram.ui.ActionBar.t6.Gi, unVar.getResourceProvider());
        int themedColor = unVar.getThemedColor(org.telegram.ui.ActionBar.t6.Ci);
        this.f38474b = themedColor;
        org.telegram.ui.Cells.y e = org.telegram.ui.ActionBar.j6.e(themedColor, 16.0f);
        this.f38473a = e;
        setBackground(e);
        setTextSize(1, 14.0f);
        setTypeface(org.telegram.messenger.i0.o());
        setGravity(17);
        setPadding(org.telegram.messenger.i0.L(14.0f), 0, org.telegram.messenger.i0.L(14.0f), 0);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), (int) (org.telegram.messenger.i0.f16172q.x * 0.45f)), Integer.MIN_VALUE), i11);
    }

    @Override
    public final void updateColors() {
        try {
            int themedColor = this.d.getThemedColor(org.telegram.ui.ActionBar.t6.Ci);
            if (themedColor == this.f38474b && this.f38475c == org.telegram.ui.ActionBar.t6.I.q()) {
                return;
            }
            Drawable background = getBackground();
            org.telegram.ui.Cells.y yVar = this.f38473a;
            if (background == yVar) {
                this.f38475c = org.telegram.ui.ActionBar.t6.I.q();
                org.telegram.ui.ActionBar.t6.H1(yVar, themedColor, false);
                org.telegram.ui.ActionBar.t6.H1(yVar, org.telegram.ui.ActionBar.j6.b(themedColor), true);
                this.f38474b = themedColor;
                invalidate();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
