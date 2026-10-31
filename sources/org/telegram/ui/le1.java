package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class le1 extends View {
    public int f39225a;
    public final WallpapersListActivity f39226b;

    public le1(WallpapersListActivity wallpapersListActivity, Context context) {
        super(context);
        this.f39226b = wallpapersListActivity;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        WallpapersListActivity wallpapersListActivity = this.f39226b;
        wallpapersListActivity.f35486s.setColor(this.f39225a);
        canvas.drawCircle(org.telegram.messenger.i0.L(25.0f), org.telegram.messenger.i0.L(31.0f), org.telegram.messenger.i0.L(18.0f), wallpapersListActivity.f35486s);
        if (this.f39225a == org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20929d6, false)) {
            canvas.drawCircle(org.telegram.messenger.i0.L(25.0f), org.telegram.messenger.i0.L(31.0f), org.telegram.messenger.i0.L(18.0f), wallpapersListActivity.f35487w);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(org.telegram.messenger.i0.L(50.0f), org.telegram.messenger.i0.L(62.0f));
    }
}
