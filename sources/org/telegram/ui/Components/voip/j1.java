package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class j1 extends FrameLayout {
    public final o1 f33771a;
    public final RectF f33772b;

    public j1(Context context, o1 o1Var) {
        super(context);
        this.f33772b = new RectF();
        this.f33771a = o1Var;
        o1Var.a(this);
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
        addView(textView, f6.d(-1, -2.0f, 3, 0.0f, 24.0f, 0.0f, 0.0f));
        addView(textView2, f6.d(-1, -2.0f, 3, 0.0f, 50.0f, 0.0f, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF = this.f33772b;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        float x4 = ((View) getParent()).getX() + getX();
        float y8 = ((View) getParent()).getY() + getY();
        o1 o1Var = this.f33771a;
        o1Var.d(x4, y8);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), o1Var.b());
        super.dispatchDraw(canvas);
    }
}
