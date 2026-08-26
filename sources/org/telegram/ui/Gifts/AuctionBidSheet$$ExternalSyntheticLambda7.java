package org.telegram.ui.Gifts;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Stars.StarsIntroActivity;

public final class AuctionBidSheet$$ExternalSyntheticLambda7 implements View.OnClickListener {
    public final int $r8$classId;
    public final Context f$0;
    public final Theme.ResourcesProvider f$1;

    public AuctionBidSheet$$ExternalSyntheticLambda7(Context context, Theme.ResourcesProvider resourcesProvider, int i) {
        this.$r8$classId = i;
        this.f$0 = context;
        this.f$1 = resourcesProvider;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                new StarsIntroActivity.StarsOptionsSheet(this.f$0, this.f$1).show();
                break;
            default:
                new StarsIntroActivity.StarsOptionsSheet(this.f$0, this.f$1).show();
                break;
        }
    }
}
