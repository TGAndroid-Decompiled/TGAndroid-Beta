package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class nc1 extends View {
    public int f48024a;
    public final WallpapersListActivity f48025b;

    public nc1(WallpapersListActivity wallpapersListActivity, Context context) {
        super(context);
        this.f48025b = wallpapersListActivity;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        WallpapersListActivity wallpapersListActivity = this.f48025b;
        wallpapersListActivity.f43494s.setColor(this.f48024a);
        canvas.drawCircle(org.telegram.messenger.g0.L(25.0f), org.telegram.messenger.g0.L(31.0f), org.telegram.messenger.g0.L(18.0f), wallpapersListActivity.f43494s);
        if (this.f48024a == org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27849d6, false)) {
            canvas.drawCircle(org.telegram.messenger.g0.L(25.0f), org.telegram.messenger.g0.L(31.0f), org.telegram.messenger.g0.L(18.0f), wallpapersListActivity.f43495w);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(62.0f));
    }
}
