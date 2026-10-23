package org.telegram.ui;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class hn extends TextView implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.Cells.y f37881a;
    public int f37882b;
    public boolean f37883c;
    public final sn d;

    public hn(sn snVar, Activity activity) {
        super(activity);
        this.d = snVar;
        setSingleLine(true);
        setLines(1);
        setMaxLines(1);
        setEllipsize(TextUtils.TruncateAt.END);
        org.telegram.ui.ActionBar.r6.W(this, org.telegram.ui.ActionBar.k6.Sh, snVar.getResourceProvider());
        int themedColor = snVar.getThemedColor(org.telegram.ui.ActionBar.k6.Oh);
        this.f37882b = themedColor;
        org.telegram.ui.Cells.y e = org.telegram.ui.ActionBar.a6.e(new float[]{16.0f}, themedColor);
        this.f37881a = e;
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
            int themedColor = this.d.getThemedColor(org.telegram.ui.ActionBar.k6.Oh);
            if (themedColor == this.f37882b && this.f37883c == org.telegram.ui.ActionBar.k6.I.q()) {
                return;
            }
            Drawable background = getBackground();
            org.telegram.ui.Cells.y yVar = this.f37881a;
            if (background == yVar) {
                this.f37883c = org.telegram.ui.ActionBar.k6.I.q();
                org.telegram.ui.ActionBar.k6.E1(yVar, themedColor, false);
                org.telegram.ui.ActionBar.k6.E1(yVar, org.telegram.ui.ActionBar.a6.b(themedColor), true);
                this.f37882b = themedColor;
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
