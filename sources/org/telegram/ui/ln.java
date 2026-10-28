package org.telegram.ui;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class ln extends TextView implements org.telegram.ui.ActionBar.p6 {
    public final org.telegram.ui.Cells.y f41214a;
    public int f41215b;
    public boolean f41216c;
    public final wn d;

    public ln(wn wnVar, Activity activity) {
        super(activity);
        this.d = wnVar;
        setSingleLine(true);
        setLines(1);
        setMaxLines(1);
        setEllipsize(TextUtils.TruncateAt.END);
        org.telegram.ui.ActionBar.f7.V(this, org.telegram.ui.ActionBar.y6.Sh, wnVar.getResourceProvider());
        int themedColor = wnVar.getThemedColor(org.telegram.ui.ActionBar.y6.Oh);
        this.f41215b = themedColor;
        org.telegram.ui.Cells.y e = org.telegram.ui.ActionBar.o6.e(new float[]{16.0f}, themedColor);
        this.f41214a = e;
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
            if (themedColor == this.f41215b && this.f41216c == org.telegram.ui.ActionBar.y6.I.q()) {
                return;
            }
            Drawable background = getBackground();
            org.telegram.ui.Cells.y yVar = this.f41214a;
            if (background == yVar) {
                this.f41216c = org.telegram.ui.ActionBar.y6.I.q();
                org.telegram.ui.ActionBar.y6.E1(yVar, themedColor, false);
                org.telegram.ui.ActionBar.y6.E1(yVar, org.telegram.ui.ActionBar.o6.b(themedColor), true);
                this.f41215b = themedColor;
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
