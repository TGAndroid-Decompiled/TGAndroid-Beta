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
    public final org.telegram.ui.Components.q6 f22413a;
    public final Paint f22414b;
    public final yf.n f22415c;
    public final Drawable d;
    public final int f22416e;
    public int f22417f;

    public l(Context context, int i10) {
        super(context);
        Paint paint = new Paint(1);
        this.f22414b = paint;
        this.f22415c = new yf.n(new ja(this, 1));
        this.f22416e = i10;
        this.d = context.getResources().getDrawable(R.drawable.filled_gift_sell_24).mutate();
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(false, false, false);
        this.f22413a = q6Var;
        q6Var.M = AndroidUtilities.displaySize.x;
        q6Var.setCallback(this);
        q6Var.x(AndroidUtilities.bold());
        q6Var.w(AndroidUtilities.dp(14.0f));
        q6Var.u(-1);
        q6Var.f30031b = 3;
        paint.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(72.0f), 0.0f, new int[]{-13460514, -10042885}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
    }

    public final void a(int i10) {
        this.f22417f = i10;
        if (isAttachedToWindow()) {
            long max = Math.max(0, i10 - ConnectionsManager.getInstance(this.f22416e).getCurrentTime());
            this.f22415c.a(max);
            b(max);
        }
    }

    public final void b(long j3) {
        String formatDurationNoHours;
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        org.telegram.ui.Components.q6 q6Var = this.f22413a;
        if (i10 == 0) {
            q6Var.t(LocaleController.getString(R.string.Gift2AuctionPriceView), true, true);
            return;
        }
        if (j3 > 3600) {
            formatDurationNoHours = AndroidUtilities.formatDuration((int) j3, false);
        } else {
            formatDurationNoHours = AndroidUtilities.formatDurationNoHours((int) j3, false);
        }
        q6Var.t(formatDurationNoHours, isAttachedToWindow(), true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(14.0f);
        org.telegram.ui.Components.q6 q6Var = this.f22413a;
        int c10 = measuredWidth - ((int) q6Var.c());
        int dp = c10 - AndroidUtilities.dp(30.0f);
        canvas.save();
        canvas.translate(dp, 0.0f);
        canvas.drawRoundRect(0.0f, 0.0f, getWidth() - dp, getHeight(), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), this.f22414b);
        canvas.restore();
        q6Var.setBounds(c10, 0, getMeasuredWidth() - AndroidUtilities.dp(8.0f), getMeasuredHeight() - AndroidUtilities.dp(1.0f));
        q6Var.draw(canvas);
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
        a(this.f22417f);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f22415c.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(172), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28), 1073741824));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f22413a && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
