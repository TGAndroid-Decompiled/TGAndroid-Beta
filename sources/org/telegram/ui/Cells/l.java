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
    public final org.telegram.ui.Components.r6 f21471a;
    public final Paint f21472b;
    public final zf.o f21473c;
    public final Drawable d;
    public final int e;
    public int f21474f;

    public l(Context context, int i10) {
        super(context);
        Paint paint = new Paint(1);
        this.f21472b = paint;
        this.f21473c = new zf.o(new ja(this, 1));
        this.e = i10;
        this.d = context.getResources().getDrawable(R.drawable.filled_gift_sell_24).mutate();
        org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(false, false, false);
        this.f21471a = r6Var;
        r6Var.M = AndroidUtilities.displaySize.x;
        r6Var.setCallback(this);
        r6Var.x(AndroidUtilities.bold());
        r6Var.w(AndroidUtilities.dp(14.0f));
        r6Var.u(-1);
        r6Var.f28748b = 3;
        paint.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(72.0f), 0.0f, new int[]{-13460514, -10042885}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
    }

    public final void a(int i10) {
        this.f21474f = i10;
        if (isAttachedToWindow()) {
            long max = Math.max(0, i10 - ConnectionsManager.getInstance(this.e).getCurrentTime());
            this.f21473c.a(max);
            b(max);
        }
    }

    public final void b(long j10) {
        String formatDurationNoHours;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        org.telegram.ui.Components.r6 r6Var = this.f21471a;
        if (i10 == 0) {
            r6Var.t(LocaleController.getString(R.string.Gift2AuctionPriceView), true, true);
            return;
        }
        if (j10 > 3600) {
            formatDurationNoHours = AndroidUtilities.formatDuration((int) j10, false);
        } else {
            formatDurationNoHours = AndroidUtilities.formatDurationNoHours((int) j10, false);
        }
        r6Var.t(formatDurationNoHours, isAttachedToWindow(), true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(14.0f);
        org.telegram.ui.Components.r6 r6Var = this.f21471a;
        int c10 = measuredWidth - ((int) r6Var.c());
        int dp = c10 - AndroidUtilities.dp(30.0f);
        canvas.save();
        canvas.translate(dp, 0.0f);
        canvas.drawRoundRect(0.0f, 0.0f, getWidth() - dp, getHeight(), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), this.f21472b);
        canvas.restore();
        r6Var.setBounds(c10, 0, getMeasuredWidth() - AndroidUtilities.dp(8.0f), getMeasuredHeight() - AndroidUtilities.dp(1.0f));
        r6Var.draw(canvas);
        int dp2 = AndroidUtilities.dp(-22.0f) + c10;
        int dp3 = AndroidUtilities.dp(5.0f);
        int dp4 = AndroidUtilities.dp(-4.0f) + c10;
        int dp5 = AndroidUtilities.dp(23.0f);
        Drawable drawable = this.d;
        drawable.setBounds(dp2, dp3, dp4, dp5);
        drawable.draw(canvas);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(this.f21474f);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f21473c.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(172), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28), 1073741824));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f21471a && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
