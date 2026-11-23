package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class qc1 extends View {
    public int f51256a;
    public final WallpapersListActivity f51257b;

    public qc1(WallpapersListActivity wallpapersListActivity, Context context) {
        super(context);
        this.f51257b = wallpapersListActivity;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        WallpapersListActivity wallpapersListActivity = this.f51257b;
        wallpapersListActivity.f45437s.setColor(this.f51256a);
        canvas.drawCircle(org.telegram.messenger.g0.L(25.0f), org.telegram.messenger.g0.L(31.0f), org.telegram.messenger.g0.L(18.0f), wallpapersListActivity.f45437s);
        if (this.f51256a == org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29381d6, false)) {
            canvas.drawCircle(org.telegram.messenger.g0.L(25.0f), org.telegram.messenger.g0.L(31.0f), org.telegram.messenger.g0.L(18.0f), wallpapersListActivity.f45438w);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(62.0f));
    }
}
