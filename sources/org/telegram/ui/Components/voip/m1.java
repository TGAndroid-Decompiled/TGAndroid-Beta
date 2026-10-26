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
import org.telegram.ui.Components.gb1;
public final class m1 extends FrameLayout {
    public final r1 f33948a;
    public final RectF f33949b;

    public m1(Context context, r1 r1Var) {
        super(context);
        this.f33949b = new RectF();
        this.f33948a = r1Var;
        r1Var.a(this);
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
        addView(textView, gb1.h(-1, -2.0f, 3, 0.0f, 24.0f, 0.0f, 0.0f));
        addView(textView2, gb1.h(-1, -2.0f, 3, 0.0f, 50.0f, 0.0f, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF = this.f33949b;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        float x9 = ((View) getParent()).getX() + getX();
        float y3 = ((View) getParent()).getY() + getY();
        r1 r1Var = this.f33948a;
        r1Var.d(x9, y3);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), r1Var.b());
        super.dispatchDraw(canvas);
    }
}
