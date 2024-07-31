package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.SnowflakesEffect;
public class VoIpSnowView extends View {
    private boolean isPaused;
    private SnowflakesEffect snowflakesEffect;

    public VoIpSnowView(Context context) {
        super(context);
        if (LiteMode.isEnabled(512) && Theme.getEventType() == 0) {
            this.snowflakesEffect = new SnowflakesEffect(0);
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
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
