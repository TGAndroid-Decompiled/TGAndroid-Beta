package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class nj1 extends View {
    public int f38408a;
    public final WallpapersListActivity f38409b;

    public nj1(WallpapersListActivity wallpapersListActivity, Context context) {
        super(context);
        this.f38409b = wallpapersListActivity;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        WallpapersListActivity wallpapersListActivity = this.f38409b;
        wallpapersListActivity.f33695w.setColor(this.f38408a);
        canvas.drawCircle(AndroidUtilities.dp(25.0f), AndroidUtilities.dp(31.0f), AndroidUtilities.dp(18.0f), wallpapersListActivity.f33695w);
        if (this.f38408a == org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19601d6, false)) {
            canvas.drawCircle(AndroidUtilities.dp(25.0f), AndroidUtilities.dp(31.0f), AndroidUtilities.dp(18.0f), wallpapersListActivity.f33696x);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(AndroidUtilities.dp(50.0f), AndroidUtilities.dp(62.0f));
    }
}
