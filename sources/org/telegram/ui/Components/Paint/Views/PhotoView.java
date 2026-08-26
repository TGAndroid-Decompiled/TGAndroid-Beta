package org.telegram.ui.Components.Paint.Views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DiffUtil;
import com.google.android.gms.internal.mlkit_vision_common.zzig;
import com.google.firebase.crashlytics.internal.settings.Settings;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.segmentation.subject.SubjectSegmenterOptions;
import com.google.mlkit.vision.segmentation.subject.internal.zzd;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ProfileGooeyView$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.RectOld;
import org.telegram.ui.Components.Size;
import org.telegram.ui.Components.voip.RateCallLayout$$ExternalSyntheticLambda1;
import org.telegram.ui.Stories.recorder.StoryEntry;

public final class PhotoView extends EntityView {
    public final int anchor;
    public final Size baseSize;
    public final Bitmap bitmap;
    public final Rect bitmapDst;
    public final Paint bitmapPaint;
    public final Rect bitmapSrc;
    public final ChatActivity.AnonymousClass60 containerView;
    public MediaController.CropState crop;
    public final AnimatedFloat mirrorT;
    public boolean mirrored;
    public final TLObject object;
    public final int orientation;
    public final String path;
    public boolean segmented;
    public final AnimatedFloat segmentedT;
    public boolean segmentingLoaded;
    public boolean segmentingLoading;

    public PhotoView(Context context, PointF pointF, Size size, String str, int i) {
        super(context, pointF);
        this.anchor = -1;
        this.mirrored = false;
        this.segmented = false;
        new Rect();
        new RectF();
        new Paint(3);
        this.bitmapSrc = new Rect();
        this.bitmapDst = new Rect();
        this.bitmapPaint = new Paint(3);
        setRotation(0.0f);
        setScale(1.0f);
        this.path = str;
        this.baseSize = size;
        ChatActivity.AnonymousClass60 anonymousClass60 = new ChatActivity.AnonymousClass60(this, context);
        this.containerView = anonymousClass60;
        addView(anonymousClass60, LayoutHelper.createFrame(-1.0f, -1));
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.mirrorT = new AnimatedFloat(anonymousClass60, 0L, 500L, cubicBezierInterpolator);
        this.segmentedT = new AnimatedFloat(anonymousClass60, 0L, 350L, cubicBezierInterpolator);
        this.orientation = i;
        Bitmap scaledBitmap = StoryEntry.getScaledBitmap(new ProfileGooeyView$$ExternalSyntheticLambda0(str, 6), 1920, 1920, 0, false);
        this.bitmap = scaledBitmap;
        if (scaledBitmap != null) {
            segmentImage(scaledBitmap);
        }
        updatePosition();
    }

    private String getImageFilter() {
        Point point = AndroidUtilities.displaySize;
        int iRound = Math.round((Math.min(point.x, point.y) * 0.8f) / AndroidUtilities.density);
        return DiffUtil.m(iRound, iRound, "_");
    }

    @Override
    public final EntityView.SelectionView createSelectionView() {
        return new LinkView.TextViewSelectionView(this, getContext());
    }

    public int getAnchor() {
        return this.anchor;
    }

    public Size getBaseSize() {
        return this.baseSize;
    }

    public int getContentHeight() {
        Bitmap bitmap = this.bitmap;
        if (bitmap == null) {
            return 1;
        }
        return bitmap.getHeight();
    }

    public int getContentWidth() {
        Bitmap bitmap = this.bitmap;
        if (bitmap == null) {
            return 1;
        }
        return bitmap.getWidth();
    }

    public int getOrientation() {
        return this.orientation;
    }

    public Bitmap getSegmentedOutBitmap() {
        return null;
    }

    @Override
    public RectOld getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new RectOld();
        }
        float scaleX = viewGroup.getScaleX();
        float fDp = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float fDp2 = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float fDp3 = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        getMeasuredHeight();
        getScale();
        AndroidUtilities.dp(64.0f);
        float fM$1 = OKLCH.m$1(fDp, 2.0f, getPositionX(), scaleX);
        return new RectOld(fM$1, OKLCH.m$1(fDp2, 2.0f, getPositionY(), scaleX), ((fDp3 * scaleX) + fM$1) - fM$1, fDp2 * scaleX);
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
        ChatActivity.AnonymousClass60 anonymousClass60 = this.containerView;
        if (anonymousClass60 != null) {
            anonymousClass60.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        Size size = this.baseSize;
        float f = size.width;
        float f2 = size.height;
        MediaController.CropState cropState = this.crop;
        if (cropState != null) {
            f *= cropState.cropPw;
            f2 *= cropState.cropPh;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) f, 1073741824), View.MeasureSpec.makeMeasureSpec((int) f2, 1073741824));
    }

    public final void segmentImage(Bitmap bitmap) {
        if (this.segmentingLoaded || this.segmentingLoading || Build.VERSION.SDK_INT < 24) {
            return;
        }
        Settings.FeatureFlagData featureFlagData = new Settings.FeatureFlagData();
        featureFlagData.collectReports = true;
        zzd client = zzig.getClient(new SubjectSegmenterOptions(featureFlagData));
        this.segmentingLoading = true;
        client.processBase(InputImage.fromBitmap(bitmap, this.orientation)).addOnSuccessListener(new ProfileGooeyView$$ExternalSyntheticLambda0(this, 7)).addOnFailureListener(new RateCallLayout$$ExternalSyntheticLambda1(8, this, bitmap));
    }

    @Override
    public final void updatePosition() {
        Size size = this.baseSize;
        float f = size.width / 2.0f;
        float f2 = size.height / 2.0f;
        MediaController.CropState cropState = this.crop;
        if (cropState != null) {
            f *= cropState.cropPw;
            f2 *= cropState.cropPh;
        }
        setX(getPositionX() - f);
        setY(getPositionY() - f2);
        EntityView.SelectionView selectionView = this.selectionView;
        if (selectionView != null) {
            selectionView.updatePosition();
        }
    }

    public PhotoView(Context context, PointF pointF, Size size, TLObject tLObject) {
        super(context, pointF);
        this.anchor = -1;
        this.mirrored = false;
        this.segmented = false;
        new Rect();
        new RectF();
        new Paint(3);
        this.bitmapSrc = new Rect();
        this.bitmapDst = new Rect();
        this.bitmapPaint = new Paint(3);
        setRotation(0.0f);
        setScale(1.0f);
        this.object = tLObject;
        this.baseSize = size;
        ChatActivity.AnonymousClass60 anonymousClass60 = new ChatActivity.AnonymousClass60(this, context);
        this.containerView = anonymousClass60;
        addView(anonymousClass60, LayoutHelper.createFrame(-1.0f, -1));
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.mirrorT = new AnimatedFloat(anonymousClass60, 0L, 500L, cubicBezierInterpolator);
        this.segmentedT = new AnimatedFloat(anonymousClass60, 0L, 350L, cubicBezierInterpolator);
        updatePosition();
    }
}
