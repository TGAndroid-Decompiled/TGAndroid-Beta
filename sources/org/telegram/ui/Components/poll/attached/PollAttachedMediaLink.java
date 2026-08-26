package org.telegram.ui.Components.poll.attached;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import com.google.common.base.Splitter;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.messenger.utils.DrawableUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.CircularProgressDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.poll.PollAttachButton;
import org.telegram.ui.Components.poll.PollAttachedMedia;

public final class PollAttachedMediaLink extends PollAttachedMedia implements Drawable.Callback, FactorAnimator.Target {
    public final BoolAnimator animatorHasImage;
    public final BoolAnimator animatorProgress;
    public PollAttachButton attachedTo;
    public final Drawable drawable;
    public final CircularProgressDrawable progressDrawable;
    public final String url;
    public TLRPC.WebPage webPage;
    public final Splitter colorFilterState = new Splitter((char) 0, 21);
    public final Paint paint = new Paint(1);

    public PollAttachedMediaLink(String str) {
        CircularProgressDrawable circularProgressDrawable = new CircularProgressDrawable(-1);
        this.progressDrawable = circularProgressDrawable;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.animatorProgress = new BoolAnimator(0, this, cubicBezierInterpolator, 320L, false);
        this.animatorHasImage = new BoolAnimator(0, this, cubicBezierInterpolator, 320L, false);
        this.url = str;
        this.imageReceiver.setRoundRadius(AndroidUtilities.dp(7.0f));
        this.drawable = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.media_link_24).mutate();
        circularProgressDrawable.setCallback(this);
        circularProgressDrawable.paint.setColor(Theme.getColor(null, Theme.key_pollCreateIcons, false));
        circularProgressDrawable.size = AndroidUtilities.dp(15.0f);
    }

    @Override
    public final void attach(View view) {
        ImageReceiver imageReceiver = this.imageReceiver;
        imageReceiver.setParentView(view);
        imageReceiver.onAttachedToWindow();
        this.attachedTo = (PollAttachButton) view;
    }

    @Override
    public final void detach() {
        this.imageReceiver.onDetachedFromWindow();
        this.attachedTo = null;
    }

    @Override
    public final void draw(Canvas canvas, int i, int i2) {
        ImageReceiver imageReceiver = this.imageReceiver;
        float f = i;
        float f2 = i2;
        imageReceiver.setImageCoords(0.0f, 0.0f, f, f2);
        imageReceiver.draw(canvas);
        CircularProgressDrawable circularProgressDrawable = this.progressDrawable;
        circularProgressDrawable.setBounds(0, 0, i, i2);
        Paint paint = this.paint;
        int color = Theme.getColor(null, Theme.key_windowBackgroundGray, false);
        BoolAnimator boolAnimator = this.animatorHasImage;
        paint.setColor(ColorUtils.blendARGB(boolAnimator.floatValue, color, 1073741824));
        canvas.drawRoundRect(0.0f, 0.0f, f, f2, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), paint);
        int iBlendARGB = ColorUtils.blendARGB(boolAnimator.floatValue, Theme.getColor(null, Theme.key_pollCreateIcons, false), -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        Splitter splitter = this.colorFilterState;
        splitter.getClass();
        if (((PorterDuffColorFilter) splitter.trimmer) == null || splitter.limit != iBlendARGB || ((PorterDuff.Mode) splitter.strategy) != mode) {
            splitter.trimmer = new PorterDuffColorFilter(iBlendARGB, mode);
            splitter.limit = iBlendARGB;
            splitter.strategy = mode;
        }
        PorterDuffColorFilter porterDuffColorFilter = (PorterDuffColorFilter) splitter.trimmer;
        Drawable drawable = this.drawable;
        drawable.setColorFilter(porterDuffColorFilter);
        int iDp = AndroidUtilities.dp(24.0f);
        int iDp2 = AndroidUtilities.dp(24.0f);
        Rect rect = DrawableUtils.tmpRect;
        DrawableUtils.setBounds(rect, f / 2.0f, f2 / 2.0f, iDp, iDp2, 17);
        drawable.setBounds(rect);
        BoolAnimator boolAnimator2 = this.animatorProgress;
        DrawableUtils.drawWithScale(canvas, drawable, 1.0f - boolAnimator2.floatValue);
        DrawableUtils.drawWithScale(canvas, circularProgressDrawable, boolAnimator2.floatValue);
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        PollAttachButton pollAttachButton = this.attachedTo;
        if (pollAttachButton != null) {
            pollAttachButton.invalidate();
        }
    }

    @Override
    public final void onFactorChangeFinished(float f, int i) {
    }

    @Override
    public final void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        PollAttachButton pollAttachButton = this.attachedTo;
        if (pollAttachButton != null) {
            pollAttachButton.invalidate();
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }
}
