package org.telegram.p009ui.Cells;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C0952R;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Components.CombinedDrawable;

public class ShadowSectionCell extends View {
    private int size;

    public ShadowSectionCell(Context context) {
        this(context, 12);
    }

    public ShadowSectionCell(Context context, int i) {
        super(context);
        setBackgroundDrawable(Theme.getThemedDrawable(context, (int) C0952R.C0953drawable.greydivider, "windowBackgroundGrayShadow"));
        this.size = i;
    }

    public ShadowSectionCell(Context context, int i, int i2) {
        super(context);
        CombinedDrawable combinedDrawable = new CombinedDrawable(new ColorDrawable(i2), Theme.getThemedDrawable(context, (int) C0952R.C0953drawable.greydivider, "windowBackgroundGrayShadow"), 0, 0);
        combinedDrawable.setFullsize(true);
        setBackgroundDrawable(combinedDrawable);
        this.size = i;
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(this.size), 1073741824));
    }
}
