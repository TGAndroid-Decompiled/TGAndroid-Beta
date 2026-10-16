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
import w7.z5;
public final class j1 extends FrameLayout {
    public final o1 f29919a;
    public final RectF f29920b;

    public j1(Context context, o1 o1Var) {
        super(context);
        this.f29920b = new RectF();
        this.f29919a = o1Var;
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
        addView(textView, z5.a(-2.0f, 0.0f, 24.0f, 0.0f, 0.0f, -1, 3));
        addView(textView2, z5.a(-2.0f, 0.0f, 50.0f, 0.0f, 0.0f, -1, 3));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF = this.f29920b;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        float x10 = ((View) getParent()).getX() + getX();
        float y3 = ((View) getParent()).getY() + getY();
        o1 o1Var = this.f29919a;
        o1Var.d(x10, y3);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), o1Var.b());
        super.dispatchDraw(canvas);
    }
}
