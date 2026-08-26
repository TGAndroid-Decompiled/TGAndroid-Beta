package org.telegram.ui;

import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Charts.view_data.LineViewData;
import org.telegram.ui.Stories.DarkThemeResourceProvider;

public final class PhotoViewer$$ExternalSyntheticLambda149 implements View.OnLongClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public PhotoViewer$$ExternalSyntheticLambda149(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                return ((PhotoViewer) this.f$0).lambda$openAdsMenu$160((DarkThemeResourceProvider) this.f$1, view);
            case 1:
                return ((StatisticActivity.BaseChartCell.CheckBoxHolder) this.f$0).lambda$setData$1((LineViewData) this.f$1, view);
            default:
                return ((ProfileActivity) this.f$0).lambda$createActionBar$5((ImageView) this.f$1, view);
        }
    }
}
