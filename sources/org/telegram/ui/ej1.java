package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ej1 extends View {
    public int f33419a;
    public final WallpapersListActivity f33420b;

    public ej1(WallpapersListActivity wallpapersListActivity, Context context) {
        super(context);
        this.f33420b = wallpapersListActivity;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        WallpapersListActivity wallpapersListActivity = this.f33420b;
        wallpapersListActivity.f31649s.setColor(this.f33419a);
        canvas.drawCircle(AndroidUtilities.dp(25.0f), AndroidUtilities.dp(31.0f), AndroidUtilities.dp(18.0f), wallpapersListActivity.f31649s);
        if (this.f33419a == org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18862d6, false)) {
            canvas.drawCircle(AndroidUtilities.dp(25.0f), AndroidUtilities.dp(31.0f), AndroidUtilities.dp(18.0f), wallpapersListActivity.v);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(AndroidUtilities.dp(50.0f), AndroidUtilities.dp(62.0f));
    }
}
