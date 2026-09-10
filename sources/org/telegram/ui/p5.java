package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class p5 extends View {
    public final int f35682a = 0;
    public final org.telegram.ui.Components.zp f35683b;

    public p5(Context context) {
        super(context);
        this.f35683b = new org.telegram.ui.Components.zp(AndroidUtilities.dp(36.0f), AndroidUtilities.dp(2.0f), -13522392);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f35682a) {
            case 0:
                int width = getWidth();
                int height = getHeight();
                org.telegram.ui.Components.zp zpVar = this.f35683b;
                zpVar.setBounds(0, 0, width, height);
                zpVar.setAlpha(255);
                zpVar.draw(canvas);
                invalidate();
                super.onDraw(canvas);
                return;
            default:
                int dp = AndroidUtilities.dp(1.0f);
                org.telegram.ui.Components.zp zpVar2 = this.f35683b;
                zpVar2.setBounds(dp, dp, (getWidth() - dp) - dp, (getHeight() - dp) - dp);
                zpVar2.draw(canvas);
                invalidate();
                return;
        }
    }

    public p5(Activity activity) {
        super(activity);
        this.f35683b = new org.telegram.ui.Components.zp(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18090m5, false));
    }
}
