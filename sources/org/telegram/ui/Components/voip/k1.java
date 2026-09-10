package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import w7.a6;
public final class k1 extends FrameLayout {
    public final p1 f28211a;
    public final RectF f28212b;

    public k1(Context context, p1 p1Var) {
        super(context);
        this.f28212b = new RectF();
        this.f28211a = p1Var;
        p1Var.a(this);
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setText(LocaleController.getString(R.string.VoipRateCallTitle));
        textView.setTextSize(1, 15.0f);
        textView.setGravity(1);
        textView.setTypeface(AndroidUtilities.bold());
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        textView2.setTextColor(-1);
        textView2.setGravity(1);
        textView2.setText(LocaleController.getString(R.string.VoipRateCallDescription));
        addView(textView, a6.d(-1, -2.0f, 3, 0.0f, 24.0f, 0.0f, 0.0f));
        addView(textView2, a6.d(-1, -2.0f, 3, 0.0f, 50.0f, 0.0f, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF = this.f28212b;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        float x10 = ((View) getParent()).getX() + getX();
        float y3 = ((View) getParent()).getY() + getY();
        p1 p1Var = this.f28211a;
        p1Var.d(x10, y3);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), p1Var.b());
        super.dispatchDraw(canvas);
    }
}
