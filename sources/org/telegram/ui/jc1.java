package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class jc1 extends View {
    public int f46599a;
    public final WallpapersListActivity f46600b;

    public jc1(WallpapersListActivity wallpapersListActivity, Context context) {
        super(context);
        this.f46600b = wallpapersListActivity;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        WallpapersListActivity wallpapersListActivity = this.f46600b;
        wallpapersListActivity.f43538s.setColor(this.f46599a);
        canvas.drawCircle(org.telegram.messenger.g0.L(25.0f), org.telegram.messenger.g0.L(31.0f), org.telegram.messenger.g0.L(18.0f), wallpapersListActivity.f43538s);
        if (this.f46599a == org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27878d6, false)) {
            canvas.drawCircle(org.telegram.messenger.g0.L(25.0f), org.telegram.messenger.g0.L(31.0f), org.telegram.messenger.g0.L(18.0f), wallpapersListActivity.f43539w);
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        setMeasuredDimension(org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(62.0f));
    }
}
