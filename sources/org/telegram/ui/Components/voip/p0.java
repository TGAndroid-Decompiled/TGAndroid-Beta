package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class p0 extends TextView {
    public final RectF f33919a;
    public final o1 f33920b;

    public p0(Activity activity, o1 o1Var) {
        super(activity);
        this.f33919a = new RectF();
        this.f33920b = o1Var;
        o1Var.a(this);
        setText(LocaleController.getString(R.string.VoipHideEmoji));
        setContentDescription(LocaleController.getString(R.string.VoipHideEmoji));
        setTextColor(-1);
        setTypeface(AndroidUtilities.bold());
        setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(4.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.f33919a;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        float x4 = ((View) getParent()).getX() + getX();
        float y8 = ((View) getParent()).getY() + getY();
        o1 o1Var = this.f33920b;
        o1Var.d(x4, y8);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), o1Var.b());
        super.onDraw(canvas);
    }
}
