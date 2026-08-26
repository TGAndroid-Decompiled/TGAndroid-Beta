package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.ClippingImageView;
import org.telegram.ui.Components.PhotoCropView;

public final class PhotoViewer$$ExternalSyntheticLambda49 implements AlertsCreator.ScheduleDatePickerDelegate, AlertDialog.OnButtonClickListener, OnApplyWindowInsetsListener, ImageReceiver.ImageReceiverDelegate {
    public final PhotoViewer f$0;

    public PhotoViewer$$ExternalSyntheticLambda49(PhotoViewer photoViewer) {
        this.f$0 = photoViewer;
    }

    @Override
    public void didSelectDate(int i, int i2, boolean z) throws Throwable {
        this.f$0.sendPressed(z, i, i2, false, false, false);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        PhotoViewer.PhotoViewerProvider photoViewerProvider;
        int i;
        Bitmap bitmap;
        int i2;
        PhotoViewer photoViewer = this.f$0;
        if (imageReceiver == photoViewer.centerImage && z && !z2) {
            if (!photoViewer.isCurrentVideo && ((photoViewer.currentEditMode == 1 || (i2 = photoViewer.sendPhotoType) == 1 || i2 == 11) && photoViewer.photoCropView != null && (bitmap = imageReceiver.getBitmap()) != null)) {
                PhotoCropView photoCropView = photoViewer.photoCropView;
                int orientation = imageReceiver.getOrientation();
                int i3 = photoViewer.sendPhotoType;
                photoCropView.setBitmap(bitmap, orientation, (i3 == 1 || i3 == 11) ? false : true, true, photoViewer.cropTransform, null, null);
            }
            if (photoViewer.paintingOverlay.getVisibility() == 0) {
                photoViewer.containerView.requestLayout();
            }
            photoViewer.detectFaces$1();
        }
        if (imageReceiver != photoViewer.centerImage || !z || (photoViewerProvider = photoViewer.placeProvider) == null || !photoViewerProvider.scaleToFill() || photoViewer.ignoreDidSetImage || (i = photoViewer.sendPhotoType) == 1 || i == 11) {
            return;
        }
        if (photoViewer.wasLayout) {
            photoViewer.setScaleToFill();
        } else {
            photoViewer.dontResetZoomOnFirstLayout = true;
        }
    }

    @Override
    public void didSetImageBitmap(int i, String str, Drawable drawable) {
        ImageReceiver.ImageReceiverDelegate.CC.$default$didSetImageBitmap(this, i, str, drawable);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        ImageReceiver.ImageReceiverDelegate.CC.$default$onAnimationReady(this, imageReceiver);
    }

    @Override
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        PhotoViewer photoViewer = this.f$0;
        photoViewer.getClass();
        Rect rect = photoViewer.insets;
        Rect rect2 = new Rect(rect);
        Insets defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(windowInsetsCompat, false);
        int i = defaultWindowInsets.left;
        int i2 = defaultWindowInsets.bottom;
        int i3 = defaultWindowInsets.top;
        int i4 = defaultWindowInsets.right;
        rect.set(i, i3, i4, i2);
        if (!rect2.equals(rect)) {
            int i5 = photoViewer.animationInProgress;
            if (i5 == 1 || i5 == 3) {
                ClippingImageView clippingImageView = photoViewer.animatingImageView;
                clippingImageView.setTranslationX(clippingImageView.getTranslationX() - rect.left);
                photoViewer.animationValues[0][2] = photoViewer.animatingImageView.getTranslationX();
            }
            LoginActivity.AnonymousClass4 anonymousClass4 = photoViewer.windowView;
            if (anonymousClass4 != null) {
                anonymousClass4.requestLayout();
            }
        }
        View view2 = photoViewer.navigationBar;
        if (view2 != null) {
            photoViewer.navigationBarHeight = rect.bottom;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
            int i6 = photoViewer.navigationBarHeight;
            marginLayoutParams.height = i6;
            marginLayoutParams.bottomMargin = (-i6) / 2;
            photoViewer.navigationBar.setLayoutParams(marginLayoutParams);
        }
        photoViewer.containerView.setPadding(defaultWindowInsets.left, 0, i4, 0);
        if (photoViewer.actionBar != null) {
            PhotoViewer$$ExternalSyntheticLambda16 photoViewer$$ExternalSyntheticLambda16 = photoViewer.updateContainerFlagsRunnable;
            AndroidUtilities.cancelRunOnUIThread(photoViewer$$ExternalSyntheticLambda16);
            if (photoViewer.isVisible && photoViewer.animationInProgress == 0) {
                AndroidUtilities.runOnUIThread(photoViewer$$ExternalSyntheticLambda16, 200L);
            }
        }
        return WindowInsetsCompat.CONSUMED;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        this.f$0.switchToEditMode(0);
    }
}
