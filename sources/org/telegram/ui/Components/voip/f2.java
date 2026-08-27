package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;

public final class f2 extends FrameLayout {

    public String f33556a;

    public final ImageView f33557b;

    public final TextView f33558c;
    public boolean d;

    public final n1 f33559e;

    public final RectF f33560f;

    public f2(Context context, n1 n1Var, int i10) {
        super(context);
        this.f33560f = new RectF();
        setFocusable(true);
        setFocusableInTouchMode(true);
        this.f33559e = n1Var;
        n1Var.a(this);
        ImageView imageView = new ImageView(context);
        this.f33557b = imageView;
        addView(imageView, z5.d(24, 24.0f, 16, 8.0f, 2.0f, 8.0f, 2.0f));
        TextView textView = new TextView(context);
        this.f33558c = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 14.0f);
        addView(textView, z5.d(-2, -2.0f, 16, i10 == 0 ? 14.0f : 36.0f, 2.0f, 14.0f, 2.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        RectF rectF = this.f33560f;
        rectF.set(0.0f, 0.0f, width, height);
        float x8 = ((View) getParent()).getX() + getX();
        float y10 = ((View) getParent()).getY() + getY();
        n1 n1Var = this.f33559e;
        n1Var.d(x8, y10);
        Paint paintB = n1Var.f33745l;
        int alpha = (this.d ? paintB : n1Var.b()).getAlpha();
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), alpha, 31);
        (this.d ? paintB : n1Var.b()).setAlpha(255);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), this.d ? paintB : n1Var.b());
        if (!this.d) {
            paintB = n1Var.b();
        }
        paintB.setAlpha(alpha);
        if (n1Var.f33739e) {
            int alpha2 = ((Paint) n1Var.d.f4602a).getAlpha();
            ((Paint) n1Var.d.f4602a).setAlpha(255);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), (Paint) n1Var.d.f4602a);
            ((Paint) n1Var.d.f4602a).setAlpha(alpha2);
        }
        canvas.restore();
        super.dispatchDraw(canvas);
    }
}
