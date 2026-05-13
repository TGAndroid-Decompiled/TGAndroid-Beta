package org.telegram.ui.Components.poll.attached;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.ClipRoundedDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.poll.PollAttachedMedia;

public class PollAttachedMediaLocation extends PollAttachedMedia {
    public final TLRPC.MessageMedia media;

    public PollAttachedMediaLocation(TLRPC.MessageMedia messageMedia) {
        this.media = messageMedia;
        this.imageReceiver.setRoundRadius(AndroidUtilities.dp(7.0f));
        setupImageReceiver(this.imageReceiver);
    }

    private void setupImageReceiver(ImageReceiver imageReceiver) {
        TLRPC.GeoPoint geoPoint = this.media.geo;
        if (geoPoint == null) {
            imageReceiver.clearImage();
        } else {
            imageReceiver.setImage(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(geoPoint, 38, 38, 13, Math.min(2, (int) Math.ceil(AndroidUtilities.density)))), (String) null, (ImageLocation) null, (String) null, (Drawable) null, (Object) null, 0);
        }
    }

    @Override
    protected void draw(Canvas canvas, int i, int i2) {
        this.imageReceiver.setImageCoords(0.0f, 0.0f, i, i2);
        this.imageReceiver.draw(canvas);
    }

    public Drawable createMessagePreviewDrawable(View view) {
        final ImageReceiver imageReceiver = new ImageReceiver(view);
        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(R.raw.map_placeholder, Theme.key_chat_outLocationIcon, (Theme.isCurrentThemeDark() ? 3 : 6) * 0.12f);
        svgThumb.setAspectCenter(true);
        svgThumb.setColorKey(Theme.key_chat_inLocationIcon);
        imageReceiver.setImage(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(this.media.geo, 300, 168, 15, Math.min(2, (int) Math.ceil(AndroidUtilities.density)))), (String) null, (ImageLocation) null, (String) null, new ClipRoundedDrawable(svgThumb), (Object) null, 0);
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            @Override
            public void onViewAttachedToWindow(View view2) {
                imageReceiver.onAttachedToWindow();
            }

            @Override
            public void onViewDetachedFromWindow(View view2) {
                imageReceiver.onDetachedFromWindow();
            }
        });
        imageReceiver.setRoundRadius(AndroidUtilities.dp(14.0f));
        final Drawable drawableMutate = view.getContext().getResources().getDrawable(R.drawable.map_pin).mutate();
        return new Drawable() {
            @Override
            public int getOpacity() {
                return 0;
            }

            @Override
            public void setColorFilter(ColorFilter colorFilter) {
            }

            @Override
            public void draw(Canvas canvas) {
                imageReceiver.draw(canvas);
                int intrinsicWidth = (int) (drawableMutate.getIntrinsicWidth() * 0.8f);
                int intrinsicHeight = (int) (drawableMutate.getIntrinsicHeight() * 0.8f);
                int imageX = (int) (imageReceiver.getImageX() + ((imageReceiver.getImageWidth() - intrinsicWidth) / 2.0f));
                int imageY = (int) ((imageReceiver.getImageY() + ((imageReceiver.getImageHeight() / 2.0f) - intrinsicHeight)) - (AndroidUtilities.dp(16.0f) * (1.0f - CubicBezierInterpolator.EASE_OUT_BACK.getInterpolation(imageReceiver.getCurrentAlpha()))));
                drawableMutate.setAlpha((int) (Math.min(1.0f, imageReceiver.getCurrentAlpha() * 5.0f) * 255.0f * imageReceiver.getAlpha()));
                drawableMutate.setBounds(imageX, imageY, intrinsicWidth + imageX, intrinsicHeight + imageY);
                drawableMutate.draw(canvas);
            }

            @Override
            public void setAlpha(int i) {
                imageReceiver.setAlpha(i / 255.0f);
            }

            @Override
            public int getAlpha() {
                return (int) (imageReceiver.getAlpha() * 255.0f);
            }

            @Override
            protected void onBoundsChange(Rect rect) {
                imageReceiver.setImageCoords(rect.left + AndroidUtilities.dp(2.0f), rect.top + AndroidUtilities.dp(2.0f), (rect.right - AndroidUtilities.dp(2.0f)) - (rect.left + AndroidUtilities.dp(2.0f)), (rect.bottom - AndroidUtilities.dp(2.0f)) - (rect.top + AndroidUtilities.dp(2.0f)));
            }
        };
    }
}
