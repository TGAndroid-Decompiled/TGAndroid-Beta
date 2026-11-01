package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class je1 extends View {
    public int f38375a;
    public final WallpapersListActivity f38376b;

    public je1(WallpapersListActivity wallpapersListActivity, Context context) {
        super(context);
        this.f38376b = wallpapersListActivity;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        WallpapersListActivity wallpapersListActivity = this.f38376b;
        wallpapersListActivity.f35493s.setColor(this.f38375a);
        canvas.drawCircle(org.telegram.messenger.i0.L(25.0f), org.telegram.messenger.i0.L(31.0f), org.telegram.messenger.i0.L(18.0f), wallpapersListActivity.f35493s);
        if (this.f38375a == org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20930d6, false)) {
            canvas.drawCircle(org.telegram.messenger.i0.L(25.0f), org.telegram.messenger.i0.L(31.0f), org.telegram.messenger.i0.L(18.0f), wallpapersListActivity.f35494w);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(org.telegram.messenger.i0.L(50.0f), org.telegram.messenger.i0.L(62.0f));
    }
}
