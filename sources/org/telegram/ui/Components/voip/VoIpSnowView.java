package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import java.util.Calendar;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.SnowflakesEffect;

public final class VoIpSnowView extends View {
    public boolean isPaused;
    public final SnowflakesEffect snowflakesEffect;

    public VoIpSnowView(Context context) {
        super(context);
        if (LiteMode.isEnabled(512)) {
            int i = Theme.default_shadow_color;
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis());
            int i2 = calendar.get(2);
            int i3 = calendar.get(5);
            calendar.get(12);
            calendar.get(11);
            if ((i2 != 11 || i3 < 24 || i3 > 31) && !(i2 == 0 && i3 == 1)) {
                return;
            }
            this.snowflakesEffect = new SnowflakesEffect(0);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        SnowflakesEffect snowflakesEffect;
        if (this.isPaused || (snowflakesEffect = this.snowflakesEffect) == null) {
            return;
        }
        snowflakesEffect.onDraw(this, canvas);
    }

    public void setState(boolean z) {
        this.isPaused = z;
        invalidate();
    }
}
