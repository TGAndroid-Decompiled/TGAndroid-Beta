package org.telegram.ui;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class jn extends TextView implements org.telegram.ui.ActionBar.p6 {
    public final org.telegram.ui.Cells.y f40699a;
    public int f40700b;
    public boolean f40701c;
    public final un d;

    public jn(un unVar, Activity activity) {
        super(activity);
        this.d = unVar;
        setSingleLine(true);
        setLines(1);
        setMaxLines(1);
        setEllipsize(TextUtils.TruncateAt.END);
        org.telegram.ui.ActionBar.f7.V(this, org.telegram.ui.ActionBar.y6.Sh, unVar.getResourceProvider());
        int themedColor = unVar.getThemedColor(org.telegram.ui.ActionBar.y6.Oh);
        this.f40700b = themedColor;
        org.telegram.ui.Cells.y e = org.telegram.ui.ActionBar.o6.e(new float[]{16.0f}, themedColor);
        this.f40699a = e;
        setBackground(e);
        setTextSize(1, 14.0f);
        setTypeface(AndroidUtilities.bold());
        setGravity(17);
        setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), (int) (AndroidUtilities.displaySize.x * 0.45f)), Integer.MIN_VALUE), i11);
    }

    @Override
    public final void updateColors() {
        try {
            int themedColor = this.d.getThemedColor(org.telegram.ui.ActionBar.y6.Oh);
            if (themedColor == this.f40700b && this.f40701c == org.telegram.ui.ActionBar.y6.I.q()) {
                return;
            }
            Drawable background = getBackground();
            org.telegram.ui.Cells.y yVar = this.f40699a;
            if (background == yVar) {
                this.f40701c = org.telegram.ui.ActionBar.y6.I.q();
                org.telegram.ui.ActionBar.y6.E1(yVar, themedColor, false);
                org.telegram.ui.ActionBar.y6.E1(yVar, org.telegram.ui.ActionBar.o6.b(themedColor), true);
                this.f40700b = themedColor;
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
