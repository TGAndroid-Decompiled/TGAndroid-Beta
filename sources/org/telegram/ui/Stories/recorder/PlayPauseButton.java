package org.telegram.ui.Stories.recorder;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.PlayPauseDrawable;
import org.telegram.ui.Components.Premium.PremiumGradient;
import org.telegram.ui.community.CommunityEditActivity;

public final class PlayPauseButton extends View {
    public final int $r8$classId = 0;
    public final Paint circlePaint;
    public final Object drawable;

    public PlayPauseButton(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.circlePaint = paint;
        PlayPauseDrawable playPauseDrawable = new PlayPauseDrawable(10);
        this.drawable = playPauseDrawable;
        paint.setColor(-1);
        paint.setShadowLayer(1.0f, 0.0f, 0.0f, 419430400);
        paint.setStyle(Paint.Style.STROKE);
        playPauseDrawable.setCallback(this);
        playPauseDrawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.$r8$classId) {
            case 0:
                Paint paint = this.circlePaint;
                paint.setStrokeWidth(AndroidUtilities.dpf2(1.66f));
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(10.0f), paint);
                int iDp = AndroidUtilities.dp(10.0f);
                int iDp2 = AndroidUtilities.dp(10.0f);
                PlayPauseDrawable playPauseDrawable = (PlayPauseDrawable) this.drawable;
                playPauseDrawable.setBounds(0, 0, iDp, iDp2);
                canvas.save();
                canvas.translate((getWidth() - AndroidUtilities.dp(10.0f)) / 2.0f, (getHeight() - AndroidUtilities.dp(10.0f)) / 2.0f);
                playPauseDrawable.draw(canvas);
                canvas.restore();
                break;
            case 1:
                float measuredWidth = getMeasuredWidth() / 2.0f;
                float measuredHeight = getMeasuredHeight() / 2.0f;
                canvas.drawCircle(measuredWidth, measuredHeight, getMeasuredWidth() / 2.0f, this.circlePaint);
                PremiumGradient.getInstance().mainGradient.gradientMatrix(0, 0, getMeasuredWidth(), getMeasuredHeight(), -AndroidUtilities.dp(10.0f), 0.0f);
                canvas.drawCircle(measuredWidth, measuredHeight, (getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(2.0f), PremiumGradient.getInstance().getMainGradientPaint());
                float fDp = AndroidUtilities.dp(18.0f) / 2.0f;
                int i = (int) (measuredWidth - fDp);
                int i2 = (int) (measuredHeight - fDp);
                int i3 = (int) (measuredWidth + fDp);
                int i4 = (int) (measuredHeight + fDp);
                Drawable drawable = (Drawable) this.drawable;
                drawable.setBounds(i, i2, i3, i4);
                drawable.draw(canvas);
                break;
            default:
                CommunityEditActivity communityEditActivity = (CommunityEditActivity) this.drawable;
                BackupImageView backupImageView = communityEditActivity.avatarImage;
                if (backupImageView != null && backupImageView.getImageReceiver().hasNotThumb()) {
                    Paint paint2 = this.circlePaint;
                    paint2.setColor(1426063360);
                    paint2.setAlpha((int) (communityEditActivity.avatarImage.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), paint2);
                    break;
                }
                break;
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        switch (this.$r8$classId) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
                break;
            default:
                super.onMeasure(i, i2);
                break;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.$r8$classId) {
            case 0:
                return drawable == ((PlayPauseDrawable) this.drawable) || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public PlayPauseButton(Context context, Paint paint, Drawable drawable) {
        super(context);
        this.circlePaint = paint;
        this.drawable = drawable;
    }

    public PlayPauseButton(CommunityEditActivity communityEditActivity, Context context) {
        super(context);
        this.drawable = communityEditActivity;
        this.circlePaint = new Paint(1);
    }
}
