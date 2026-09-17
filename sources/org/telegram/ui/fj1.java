package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class fj1 extends View {
    public int f36449a;
    public final WallpapersListActivity f36450b;

    public fj1(WallpapersListActivity wallpapersListActivity, Context context) {
        super(context);
        this.f36450b = wallpapersListActivity;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        WallpapersListActivity wallpapersListActivity = this.f36450b;
        wallpapersListActivity.f34298w.setColor(this.f36449a);
        canvas.drawCircle(AndroidUtilities.dp(25.0f), AndroidUtilities.dp(31.0f), AndroidUtilities.dp(18.0f), wallpapersListActivity.f34298w);
        if (this.f36449a == org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20691d6, false)) {
            canvas.drawCircle(AndroidUtilities.dp(25.0f), AndroidUtilities.dp(31.0f), AndroidUtilities.dp(18.0f), wallpapersListActivity.f34299x);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(AndroidUtilities.dp(50.0f), AndroidUtilities.dp(62.0f));
    }
}
