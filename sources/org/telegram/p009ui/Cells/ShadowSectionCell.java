package org.telegram.p009ui.Cells;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C1072R;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Components.CombinedDrawable;

public class ShadowSectionCell extends View {
    private int size;

    public ShadowSectionCell(Context context) {
        this(context, 12, (Theme.ResourcesProvider) null);
    }

    public ShadowSectionCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        this(context, 12, resourcesProvider);
    }

    public ShadowSectionCell(Context context, int i) {
        this(context, i, (Theme.ResourcesProvider) null);
    }

    public ShadowSectionCell(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        setBackgroundDrawable(Theme.getThemedDrawable(context, C1072R.C1073drawable.greydivider, Theme.getColor("windowBackgroundGrayShadow", resourcesProvider)));
        this.size = i;
    }

    public ShadowSectionCell(Context context, int i, int i2) {
        this(context, i, i2, null);
    }

    public ShadowSectionCell(Context context, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        CombinedDrawable combinedDrawable = new CombinedDrawable(new ColorDrawable(i2), Theme.getThemedDrawable(context, C1072R.C1073drawable.greydivider, Theme.getColor("windowBackgroundGrayShadow", resourcesProvider)), 0, 0);
        combinedDrawable.setFullsize(true);
        setBackgroundDrawable(combinedDrawable);
        this.size = i;
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m35dp(this.size), 1073741824));
    }
}
