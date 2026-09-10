package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class q0 extends TextView {
    public final RectF f28353a;
    public final p1 f28354b;

    public q0(Activity activity, p1 p1Var) {
        super(activity);
        this.f28353a = new RectF();
        this.f28354b = p1Var;
        p1Var.a(this);
        setText(LocaleController.getString(R.string.VoipHideEmoji));
        setContentDescription(LocaleController.getString(R.string.VoipHideEmoji));
        setTextColor(-1);
        setTypeface(AndroidUtilities.bold());
        setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(4.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.f28353a;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        float x10 = ((View) getParent()).getX() + getX();
        float y3 = ((View) getParent()).getY() + getY();
        p1 p1Var = this.f28354b;
        p1Var.d(x10, y3);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), p1Var.b());
        super.onDraw(canvas);
    }
}
