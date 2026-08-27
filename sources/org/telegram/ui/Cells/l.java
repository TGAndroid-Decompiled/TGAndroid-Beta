package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;

public final class l extends FrameLayout {

    public final org.telegram.ui.Components.i6 f24607a;

    public final Paint f24608b;

    public final gf.q f24609c;
    public final Drawable d;

    public final int f24610e;

    public int f24611f;

    public l(Context context, int i10) {
        super(context);
        Paint paint = new Paint(1);
        this.f24608b = paint;
        this.f24609c = new gf.q(new ea(this, 1));
        this.f24610e = i10;
        this.d = context.getResources().getDrawable(R.drawable.filled_gift_sell_24).mutate();
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, false, false, false);
        this.f24607a = i6Var;
        i6Var.G = AndroidUtilities.displaySize.x;
        i6Var.setCallback(this);
        i6Var.u(AndroidUtilities.bold());
        i6Var.t(AndroidUtilities.dp(14.0f));
        i6Var.r(-1);
        i6Var.f29239b = 3;
        paint.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(72.0f), 0.0f, new int[]{-13460514, -10042885}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
    }

    public final void a(int i10) {
        this.f24611f = i10;
        if (isAttachedToWindow()) {
            long jMax = Math.max(0, i10 - ConnectionsManager.getInstance(this.f24610e).getCurrentTime());
            this.f24609c.a(jMax);
            b(jMax);
        }
    }

    public final void b(long j10) {
        org.telegram.ui.Components.i6 i6Var = this.f24607a;
        if (j10 == 0) {
            i6Var.q(LocaleController.getString(R.string.Gift2AuctionPriceView), true, true);
        } else {
            i6Var.q(j10 > 3600 ? AndroidUtilities.formatDuration((int) j10, false) : AndroidUtilities.formatDurationNoHours((int) j10, false), isAttachedToWindow(), true);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(14.0f);
        org.telegram.ui.Components.i6 i6Var = this.f24607a;
        int iD = measuredWidth - ((int) i6Var.d());
        int iDp = iD - AndroidUtilities.dp(30.0f);
        canvas.save();
        canvas.translate(iDp, 0.0f);
        canvas.drawRoundRect(0.0f, 0.0f, getWidth() - iDp, getHeight(), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), this.f24608b);
        canvas.restore();
        i6Var.setBounds(iD, 0, getMeasuredWidth() - AndroidUtilities.dp(8.0f), getMeasuredHeight() - AndroidUtilities.dp(1.0f));
        i6Var.draw(canvas);
        int iDp2 = AndroidUtilities.dp(-22.0f) + iD;
        int iDp3 = AndroidUtilities.dp(5.0f);
        int iDp4 = AndroidUtilities.dp(-4.0f) + iD;
        int iDp5 = AndroidUtilities.dp(23.0f);
        Drawable drawable = this.d;
        drawable.setBounds(iDp2, iDp3, iDp4, iDp5);
        drawable.draw(canvas);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(this.f24611f);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f24609c.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(172), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28), 1073741824));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.f24607a || super.verifyDrawable(drawable);
    }
}
