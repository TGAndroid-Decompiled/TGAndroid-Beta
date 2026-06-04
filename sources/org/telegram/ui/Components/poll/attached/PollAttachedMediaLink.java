package org.telegram.ui.Components.poll.attached;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.R;
import org.telegram.messenger.utils.DrawableUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.CircularProgressDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.PorterDuffColorFilterState;
import org.telegram.ui.Components.poll.PollAttachedMedia;

public class PollAttachedMediaLink extends PollAttachedMedia implements Drawable.Callback, FactorAnimator.Target {
    private final BoolAnimator animatorHasImage;
    private final BoolAnimator animatorProgress;
    private View attachedTo;
    private final Drawable drawable;
    private final CircularProgressDrawable progressDrawable;
    public final String url;
    private TLRPC.WebPage webPage;
    private final PorterDuffColorFilterState colorFilterState = new PorterDuffColorFilterState();
    private final Paint paint = new Paint(1);

    @Override
    public void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
        FactorAnimator.Target.CC.$default$onFactorChangeFinished(this, i, f, factorAnimator);
    }

    @Override
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    @Override
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    public PollAttachedMediaLink(String str) {
        CircularProgressDrawable circularProgressDrawable = new CircularProgressDrawable();
        this.progressDrawable = circularProgressDrawable;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.animatorProgress = new BoolAnimator(0, this, cubicBezierInterpolator, 320L);
        this.animatorHasImage = new BoolAnimator(0, this, cubicBezierInterpolator, 320L);
        this.url = str;
        this.imageReceiver.setRoundRadius(AndroidUtilities.dp(7.0f));
        this.drawable = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.media_link_24).mutate();
        circularProgressDrawable.setCallback(this);
        circularProgressDrawable.setColor(Theme.getColor(Theme.key_pollCreateIcons));
        circularProgressDrawable.size = AndroidUtilities.dp(15.0f);
    }

    public TLRPC.WebPage getWebPage() {
        return this.webPage;
    }

    public void setWebPage(TLRPC.WebPage webPage, boolean z, boolean z2) {
        TLRPC.Photo photo;
        this.animatorProgress.setValue(z || (webPage instanceof TLRPC.TL_webPagePending), z2);
        this.webPage = webPage;
        if (webPage != null && (photo = webPage.photo) != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 40);
            this.imageReceiver.setImage(ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(webPage.photo.sizes, AndroidUtilities.dp(36.0f), false, closestPhotoSizeWithSize, true), webPage.photo), "48_48", ImageLocation.getForObject(closestPhotoSizeWithSize, webPage.photo), "48_48_b", 0L, null, webPage, 1);
            this.animatorHasImage.setValue(true, z2);
        } else {
            this.animatorHasImage.setValue(false, z2);
            this.imageReceiver.clearImage();
        }
    }

    @Override
    public void attach(View view) {
        super.attach(view);
        this.attachedTo = view;
    }

    @Override
    public void detach() {
        super.detach();
        this.attachedTo = null;
    }

    @Override
    protected void draw(Canvas canvas, int i, int i2) {
        float f = i;
        float f2 = i2;
        this.imageReceiver.setImageCoords(0.0f, 0.0f, f, f2);
        this.imageReceiver.draw(canvas);
        this.progressDrawable.setBounds(0, 0, i, i2);
        this.paint.setColor(ColorUtils.blendARGB(Theme.getColor(Theme.key_windowBackgroundGray), 1073741824, this.animatorHasImage.getFloatValue()));
        canvas.drawRoundRect(0.0f, 0.0f, f, f2, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), this.paint);
        this.drawable.setColorFilter(this.colorFilterState.get(ColorUtils.blendARGB(Theme.getColor(Theme.key_pollCreateIcons), -1, this.animatorHasImage.getFloatValue()), PorterDuff.Mode.SRC_IN));
        DrawableUtils.setBounds(this.drawable, f / 2.0f, f2 / 2.0f, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), 17);
        DrawableUtils.drawWithScale(canvas, this.drawable, 1.0f - this.animatorProgress.getFloatValue());
        DrawableUtils.drawWithScale(canvas, this.progressDrawable, this.animatorProgress.getFloatValue());
    }

    @Override
    public void invalidateDrawable(Drawable drawable) {
        View view = this.attachedTo;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        View view = this.attachedTo;
        if (view != null) {
            view.invalidate();
        }
    }
}
