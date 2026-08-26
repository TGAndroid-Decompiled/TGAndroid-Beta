package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Stars.StarsIntroActivity;

public final class StakedDiceSheet$$ExternalSyntheticLambda3 implements View.OnClickListener {
    public final int $r8$classId;
    public final Context f$0;
    public final Theme.ResourcesProvider f$1;

    public StakedDiceSheet$$ExternalSyntheticLambda3(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
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
            case 1:
                new StarsIntroActivity.StarsOptionsSheet(this.f$0, this.f$1).show();
                break;
            default:
                new StarsIntroActivity.StarsOptionsSheet(this.f$0, this.f$1).show();
                break;
        }
    }
}
