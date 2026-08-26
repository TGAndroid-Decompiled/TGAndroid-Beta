package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.gms.internal.mlkit_vision_common.zzle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.PhotoCropView;

public final class SuggestUserPhotoView extends View {
    public final Drawable arrowDrawable;
    public final AvatarDrawable avatarDrawable;
    public PhotoViewer.FrameLayoutDrawer containterView;
    public final ImageReceiver currentPhoto;
    public final ImageReceiver newPhoto;
    public final Path path;
    public PhotoCropView photoCropView;

    public SuggestUserPhotoView(Context context) {
        super(context);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.currentPhoto = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.newPhoto = imageReceiver2;
        AvatarDrawable avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
        this.avatarDrawable = avatarDrawable;
        this.path = new Path();
        int i = UserConfig.selectedAccount;
        avatarDrawable.setInfo(i, UserConfig.getInstance(i).getCurrentUser());
        imageReceiver.setForUserOrChat(UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser(), avatarDrawable);
        imageReceiver2.setForUserOrChat(UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser(), avatarDrawable);
        Drawable drawable = context.getDrawable(R.drawable.msg_arrow_avatar);
        this.arrowDrawable = drawable;
        drawable.setAlpha(100);
    }

    @Override
    public final void draw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() >> 1;
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(30.0f);
        int iDp = measuredWidth - AndroidUtilities.dp(46.0f);
        int iDp2 = AndroidUtilities.dp(46.0f) + measuredWidth;
        ImageReceiver imageReceiver = this.currentPhoto;
        imageReceiver.setImageCoords(iDp - AndroidUtilities.dp(30.0f), measuredHeight - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        this.newPhoto.setImageCoords(iDp2 - AndroidUtilities.dp(30.0f), measuredHeight - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        Drawable drawable = this.arrowDrawable;
        drawable.setBounds(zzle.m(measuredWidth, drawable), measuredHeight - (drawable.getIntrinsicHeight() / 2), (drawable.getIntrinsicWidth() / 2) + measuredWidth, (drawable.getIntrinsicHeight() / 2) + measuredHeight);
        drawable.draw(canvas);
        Path path = this.path;
        path.reset();
        path.addCircle(iDp2, measuredHeight, AndroidUtilities.dp(30.0f), Path.Direction.CW);
        imageReceiver.draw(canvas);
        if (this.containterView != null) {
            float top = 0.0f - this.photoCropView.getTop();
            float left = 0.0f - this.photoCropView.getLeft();
            float fDp = AndroidUtilities.dp(60.0f);
            CropAreaView cropAreaView = this.photoCropView.cropView.areaView;
            float f = fDp / cropAreaView.size;
            float f2 = top - cropAreaView.top;
            float f3 = left - cropAreaView.left;
            canvas.save();
            canvas.clipPath(path);
            canvas.scale(f, f, 0.0f, 0.0f);
            canvas.translate(f3, f2);
            canvas.translate((iDp2 - AndroidUtilities.dp(30.0f)) / f, (measuredHeight - AndroidUtilities.dp(30.0f)) / f);
            PhotoViewer.getInstance().skipLastFrameDraw = true;
            this.containterView.draw(canvas);
            PhotoViewer.getInstance().skipLastFrameDraw = false;
            canvas.restore();
        }
        super.draw(canvas);
        this.containterView.invalidate();
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.currentPhoto.onAttachedToWindow();
        this.newPhoto.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.currentPhoto.onDetachedFromWindow();
        this.newPhoto.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        this.currentPhoto.setRoundRadius(AndroidUtilities.dp(30.0f));
        this.newPhoto.setRoundRadius(AndroidUtilities.dp(30.0f));
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(86.0f), 1073741824));
    }
}
