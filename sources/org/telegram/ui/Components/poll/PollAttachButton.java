package org.telegram.ui.Components.poll;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import me.vkryl.android.animator.BoolAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.CubicBezierInterpolator;

public final class PollAttachButton extends View {
    public final BoolAnimator animatorHasMedia;
    public final Drawable attachDrawable;
    public PollAttachedMedia attachedMedia;
    public final Theme.ResourcesProvider resourcesProvider;
    public final int size;

    public PollAttachButton(Context context, Theme.ResourcesProvider resourcesProvider, int i) {
        super(context);
        this.animatorHasMedia = new BoolAnimator(this, CubicBezierInterpolator.EASE_OUT_QUINT, 380L);
        this.resourcesProvider = resourcesProvider;
        this.size = i;
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.outline_poll_attach_24).mutate();
        this.attachDrawable = drawableMutate;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_pollCreateIcons, false), PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        PollAttachedMedia pollAttachedMedia = this.attachedMedia;
        if (pollAttachedMedia != null) {
            pollAttachedMedia.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        PollAttachedMedia pollAttachedMedia = this.attachedMedia;
        if (pollAttachedMedia != null) {
            pollAttachedMedia.detach();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float f = this.animatorHasMedia.floatValue;
        if (f < 1.0f) {
            canvas.save();
            float f2 = 1.0f - f;
            canvas.scale(f2, f2, width, height);
            this.attachDrawable.draw(canvas);
            canvas.restore();
        }
        if (f > 0.0f) {
            float f3 = this.size;
            int iDp = AndroidUtilities.dp(f3);
            int width2 = (getWidth() - iDp) / 2;
            int height2 = (getHeight() - iDp) / 2;
            canvas.save();
            canvas.translate(width2, height2);
            canvas.scale(f, f, AndroidUtilities.dp(f3) / 2.0f, AndroidUtilities.dp(f3) / 2.0f);
            PollAttachedMedia pollAttachedMedia = this.attachedMedia;
            if (pollAttachedMedia != null) {
                pollAttachedMedia.draw(canvas, AndroidUtilities.dp(f3), AndroidUtilities.dp(f3));
            }
            canvas.restore();
        }
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int iDp = AndroidUtilities.dp(24.0f);
        int i5 = (i - iDp) / 2;
        int i6 = (i2 - iDp) / 2;
        this.attachDrawable.setBounds(i5, i6, i5 + iDp, iDp + i6);
    }

    public final void setAttachedMedia(PollAttachedMedia pollAttachedMedia, boolean z) {
        PollAttachedMedia pollAttachedMedia2;
        PollAttachedMedia pollAttachedMedia3;
        this.animatorHasMedia.setValue(pollAttachedMedia != null, z);
        if (isAttachedToWindow() && (pollAttachedMedia3 = this.attachedMedia) != null) {
            pollAttachedMedia3.detach();
        }
        this.attachedMedia = pollAttachedMedia;
        if (!isAttachedToWindow() || (pollAttachedMedia2 = this.attachedMedia) == null) {
            return;
        }
        pollAttachedMedia2.attach(this);
    }
}
