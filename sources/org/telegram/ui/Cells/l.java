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
    public final org.telegram.ui.Components.m6 f20366a;
    public final Paint f20367b;
    public final yf.n f20368c;
    public final Drawable d;
    public final int e;
    public int f20369f;

    public l(Context context, int i10) {
        super(context);
        Paint paint = new Paint(1);
        this.f20367b = paint;
        this.f20368c = new yf.n(new ma(this, 1));
        this.e = i10;
        this.d = context.getResources().getDrawable(R.drawable.filled_gift_sell_24).mutate();
        org.telegram.ui.Components.m6 m6Var = new org.telegram.ui.Components.m6(false, false, false, false);
        this.f20366a = m6Var;
        m6Var.G = AndroidUtilities.displaySize.x;
        m6Var.setCallback(this);
        m6Var.u(AndroidUtilities.bold());
        m6Var.t(AndroidUtilities.dp(14.0f));
        m6Var.r(-1);
        m6Var.f26085b = 3;
        paint.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(72.0f), 0.0f, new int[]{-13460514, -10042885}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
    }

    public final void a(int i10) {
        this.f20369f = i10;
        if (isAttachedToWindow()) {
            long max = Math.max(0, i10 - ConnectionsManager.getInstance(this.e).getCurrentTime());
            this.f20368c.a(max);
            b(max);
        }
    }

    public final void b(long j3) {
        String formatDurationNoHours;
        org.telegram.ui.Components.m6 m6Var = this.f20366a;
        if (j3 == 0) {
            m6Var.q(LocaleController.getString(R.string.Gift2AuctionPriceView), true, true);
            return;
        }
        if (j3 > 3600) {
            formatDurationNoHours = AndroidUtilities.formatDuration((int) j3, false);
        } else {
            formatDurationNoHours = AndroidUtilities.formatDurationNoHours((int) j3, false);
        }
        m6Var.q(formatDurationNoHours, isAttachedToWindow(), true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(14.0f);
        org.telegram.ui.Components.m6 m6Var = this.f20366a;
        int d = measuredWidth - ((int) m6Var.d());
        int dp = d - AndroidUtilities.dp(30.0f);
        canvas.save();
        canvas.translate(dp, 0.0f);
        canvas.drawRoundRect(0.0f, 0.0f, getWidth() - dp, getHeight(), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), this.f20367b);
        canvas.restore();
        m6Var.setBounds(d, 0, getMeasuredWidth() - AndroidUtilities.dp(8.0f), getMeasuredHeight() - AndroidUtilities.dp(1.0f));
        m6Var.draw(canvas);
        int dp2 = AndroidUtilities.dp(-22.0f) + d;
        int dp3 = AndroidUtilities.dp(5.0f);
        int dp4 = AndroidUtilities.dp(-4.0f) + d;
        int dp5 = AndroidUtilities.dp(23.0f);
        Drawable drawable = this.d;
        drawable.setBounds(dp2, dp3, dp4, dp5);
        drawable.draw(canvas);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(this.f20369f);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f20368c.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(172), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28), 1073741824));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f20366a && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
