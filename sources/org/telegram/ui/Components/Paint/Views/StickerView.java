package org.telegram.ui.Components.Paint.Views;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.AnimatedFileDrawable;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RectOld;
import org.telegram.ui.Components.Size;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda6;
import org.telegram.ui.TON.TONIntroActivity;

public class StickerView extends EntityView {
    public final int anchor;
    public final Size baseSize;
    public final ImageReceiver centerImage;
    public final TONIntroActivity.AnonymousClass2 containerView;
    public final AnimatedFloat mirrorT;
    public boolean mirrored;
    public final Object parentObject;
    public final TLRPC.Document sticker;

    public StickerView(Context context, PointF pointF, float f, float f2, Size size, TLRPC.Document document, Object obj) {
        super(context, pointF);
        this.anchor = -1;
        this.mirrored = false;
        this.centerImage = new ImageReceiver();
        setRotation(f);
        setScale(f2);
        this.sticker = document;
        this.baseSize = size;
        this.parentObject = obj;
        for (int i = 0; i < document.attributes.size(); i++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                TLRPC.TL_maskCoords tL_maskCoords = documentAttribute.mask_coords;
                if (tL_maskCoords == null) {
                    break;
                }
                this.anchor = tL_maskCoords.n;
                break;
            }
        }
        TONIntroActivity.AnonymousClass2 anonymousClass2 = new TONIntroActivity.AnonymousClass2(this, context);
        this.containerView = anonymousClass2;
        addView(anonymousClass2, LayoutHelper.createFrame(-1, -1.0f));
        this.mirrorT = new AnimatedFloat(anonymousClass2, 0L, 500L, CubicBezierInterpolator.EASE_OUT_QUINT);
        this.centerImage.setAspectFit(true);
        this.centerImage.setInvalidateAll(true);
        this.centerImage.setParentView(anonymousClass2);
        this.centerImage.setImage(ImageLocation.getForDocument(document), (String) null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), (String) null, "webp", obj, 1);
        this.centerImage.setDelegate(new GiftSheet$$ExternalSyntheticLambda6(this, 1));
        updatePosition();
    }

    @Override
    public final EntityView.SelectionView createSelectionView() {
        return new RoundView.RoundViewSelectionView(this, getContext());
    }

    public void didSetAnimatedSticker(RLottieDrawable rLottieDrawable) {
    }

    public int getAnchor() {
        return this.anchor;
    }

    public Size getBaseSize() {
        return this.baseSize;
    }

    public long getDuration() {
        ImageReceiver imageReceiver = this.centerImage;
        RLottieDrawable lottieAnimation = imageReceiver.getLottieAnimation();
        if (lottieAnimation != null) {
            return lottieAnimation.getDuration();
        }
        AnimatedFileDrawable animation = imageReceiver.getAnimation();
        if (animation != null) {
            return animation.getDurationMs();
        }
        return 0L;
    }

    public Object getParentObject() {
        return this.parentObject;
    }

    @Override
    public RectOld getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new RectOld();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.5f) * getMeasuredWidth();
        float f = scale / 2.0f;
        float f2 = scale * scaleX;
        return new RectOld((getPositionX() - f) * scaleX, (getPositionY() - f) * scaleX, f2, f2);
    }

    public TLRPC.Document getSticker() {
        return this.sticker;
    }

    public final boolean isMirrored() {
        return this.mirrored;
    }

    public final void mirror(boolean z) {
        boolean z2 = !this.mirrored;
        this.mirrored = z2;
        if (!z) {
            this.mirrorT.set(z2, true);
        }
        this.containerView.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.centerImage.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.centerImage.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        Size size = this.baseSize;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) size.width, 1073741824), View.MeasureSpec.makeMeasureSpec((int) size.height, 1073741824));
    }

    @Override
    public final void updatePosition() {
        Size size = this.baseSize;
        float f = size.width / 2.0f;
        float f2 = size.height / 2.0f;
        setX(getPositionX() - f);
        setY(getPositionY() - f2);
        EntityView.SelectionView selectionView = this.selectionView;
        if (selectionView != null) {
            selectionView.updatePosition();
        }
    }

    public StickerView(Context context, StickerView stickerView, PointF pointF) {
        this(context, pointF, stickerView.getRotation(), stickerView.getScale(), stickerView.baseSize, stickerView.sticker, stickerView.parentObject);
        if (stickerView.mirrored) {
            mirror(false);
        }
    }
}
