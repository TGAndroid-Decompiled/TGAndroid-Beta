package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ai1 extends View {
    public int f37811a;
    public final WallpapersListActivity f37812b;

    public ai1(WallpapersListActivity wallpapersListActivity, Context context) {
        super(context);
        this.f37812b = wallpapersListActivity;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        WallpapersListActivity wallpapersListActivity = this.f37812b;
        wallpapersListActivity.f37596s.setColor(this.f37811a);
        canvas.drawCircle(AndroidUtilities.dp(25.0f), AndroidUtilities.dp(31.0f), AndroidUtilities.dp(18.0f), wallpapersListActivity.f37596s);
        if (this.f37811a == org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23354d6, false)) {
            canvas.drawCircle(AndroidUtilities.dp(25.0f), AndroidUtilities.dp(31.0f), AndroidUtilities.dp(18.0f), wallpapersListActivity.v);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(AndroidUtilities.dp(50.0f), AndroidUtilities.dp(62.0f));
    }
}
