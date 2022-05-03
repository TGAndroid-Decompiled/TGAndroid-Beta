package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Components.Paint.Views.EditTextOutline;

public class PaintingOverlay extends FrameLayout {
    private Drawable backgroundDrawable;
    private boolean ignoreLayout;
    private ArrayList<VideoEditedInfo.MediaEntity> mediaEntities;
    private Bitmap paintBitmap;

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public PaintingOverlay(Context context) {
        super(context);
    }

    public void setData(String str, ArrayList<VideoEditedInfo.MediaEntity> arrayList, boolean z, boolean z2) {
        if (str != null) {
            this.paintBitmap = BitmapFactory.decodeFile(str);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(this.paintBitmap);
            this.backgroundDrawable = bitmapDrawable;
            setBackground(bitmapDrawable);
        } else {
            this.paintBitmap = null;
            this.backgroundDrawable = null;
            setBackground(null);
        }
        setEntities(arrayList, z, z2);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        this.ignoreLayout = true;
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        if (this.mediaEntities != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            int size = this.mediaEntities.size();
            for (int i3 = 0; i3 < size; i3++) {
                VideoEditedInfo.MediaEntity mediaEntity = this.mediaEntities.get(i3);
                View view = mediaEntity.view;
                if (view != null) {
                    if (view instanceof EditTextOutline) {
                        view.measure(View.MeasureSpec.makeMeasureSpec(mediaEntity.viewWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                        float f = (mediaEntity.textViewWidth * measuredWidth) / mediaEntity.viewWidth;
                        mediaEntity.view.setScaleX(mediaEntity.scale * f);
                        mediaEntity.view.setScaleY(mediaEntity.scale * f);
                    } else {
                        view.measure(View.MeasureSpec.makeMeasureSpec((int) (measuredWidth * mediaEntity.width), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (measuredHeight * mediaEntity.height), 1073741824));
                    }
                }
            }
        }
        this.ignoreLayout = false;
    }

    @Override
    public void requestLayout() {
        if (!this.ignoreLayout) {
            super.requestLayout();
        }
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (this.mediaEntities != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            int size = this.mediaEntities.size();
            for (int i7 = 0; i7 < size; i7++) {
                VideoEditedInfo.MediaEntity mediaEntity = this.mediaEntities.get(i7);
                View view = mediaEntity.view;
                if (view != null) {
                    if (view instanceof EditTextOutline) {
                        i5 = ((int) (measuredWidth * mediaEntity.textViewX)) - (view.getMeasuredWidth() / 2);
                        i6 = ((int) (measuredHeight * mediaEntity.textViewY)) - (mediaEntity.view.getMeasuredHeight() / 2);
                    } else {
                        i5 = (int) (measuredWidth * mediaEntity.x);
                        i6 = (int) (measuredHeight * mediaEntity.y);
                    }
                    View view2 = mediaEntity.view;
                    view2.layout(i5, i6, view2.getMeasuredWidth() + i5, mediaEntity.view.getMeasuredHeight() + i6);
                }
            }
        }
    }

    public void showAll() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setVisibility(0);
        }
        setBackground(this.backgroundDrawable);
    }

    public void hideEntities() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setVisibility(4);
        }
    }

    public void hideBitmap() {
        setBackground(null);
    }

    public void setEntities(ArrayList<VideoEditedInfo.MediaEntity> arrayList, boolean z, boolean z2) {
        this.mediaEntities = arrayList;
        removeAllViews();
        if (!(arrayList == null || arrayList.isEmpty())) {
            int size = this.mediaEntities.size();
            for (int i = 0; i < size; i++) {
                VideoEditedInfo.MediaEntity mediaEntity = this.mediaEntities.get(i);
                byte b = mediaEntity.type;
                if (b == 0) {
                    BackupImageView backupImageView = new BackupImageView(getContext());
                    backupImageView.setAspectFit(true);
                    ImageReceiver imageReceiver = backupImageView.getImageReceiver();
                    if (z) {
                        imageReceiver.setAllowDecodeSingleFrame(true);
                        imageReceiver.setAllowStartLottieAnimation(false);
                        if (z2) {
                            imageReceiver.setDelegate(PaintingOverlay$$ExternalSyntheticLambda0.INSTANCE);
                        }
                    }
                    imageReceiver.setImage(ImageLocation.getForDocument(mediaEntity.document), (String) null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(mediaEntity.document.thumbs, 90), mediaEntity.document), (String) null, "webp", mediaEntity.parentObject, 1);
                    if ((mediaEntity.subType & 2) != 0) {
                        backupImageView.setScaleX(-1.0f);
                    }
                    mediaEntity.view = backupImageView;
                } else if (b == 1) {
                    EditTextOutline editTextOutline = new EditTextOutline(this, getContext()) {
                        @Override
                        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                            return false;
                        }

                        @Override
                        public boolean onTouchEvent(MotionEvent motionEvent) {
                            return false;
                        }
                    };
                    editTextOutline.setBackgroundColor(0);
                    editTextOutline.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
                    editTextOutline.setTextSize(0, mediaEntity.fontSize);
                    editTextOutline.setText(mediaEntity.text);
                    editTextOutline.setTypeface(null, 1);
                    editTextOutline.setGravity(17);
                    editTextOutline.setHorizontallyScrolling(false);
                    editTextOutline.setImeOptions(268435456);
                    editTextOutline.setFocusableInTouchMode(true);
                    editTextOutline.setEnabled(false);
                    editTextOutline.setInputType(editTextOutline.getInputType() | 16384);
                    if (Build.VERSION.SDK_INT >= 23) {
                        editTextOutline.setBreakStrategy(0);
                    }
                    byte b2 = mediaEntity.subType;
                    if ((b2 & 1) != 0) {
                        editTextOutline.setTextColor(-1);
                        editTextOutline.setStrokeColor(mediaEntity.color);
                        editTextOutline.setFrameColor(0);
                        editTextOutline.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                    } else if ((b2 & 4) != 0) {
                        editTextOutline.setTextColor(-16777216);
                        editTextOutline.setStrokeColor(0);
                        editTextOutline.setFrameColor(mediaEntity.color);
                        editTextOutline.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                    } else {
                        editTextOutline.setTextColor(mediaEntity.color);
                        editTextOutline.setStrokeColor(0);
                        editTextOutline.setFrameColor(0);
                        editTextOutline.setShadowLayer(5.0f, 0.0f, 1.0f, 1711276032);
                    }
                    mediaEntity.view = editTextOutline;
                }
                addView(mediaEntity.view);
                View view = mediaEntity.view;
                double d = -mediaEntity.rotation;
                Double.isNaN(d);
                view.setRotation((float) ((d / 3.141592653589793d) * 180.0d));
            }
        }
    }

    public static void lambda$setEntities$0(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        RLottieDrawable lottieAnimation;
        if (z && !z2 && (lottieAnimation = imageReceiver.getLottieAnimation()) != null) {
            lottieAnimation.start();
        }
    }

    public void setBitmap(Bitmap bitmap) {
        this.paintBitmap = bitmap;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
        this.backgroundDrawable = bitmapDrawable;
        setBackground(bitmapDrawable);
    }

    public Bitmap getBitmap() {
        return this.paintBitmap;
    }

    @Override
    public void setAlpha(float f) {
        super.setAlpha(f);
        Drawable drawable = this.backgroundDrawable;
        if (drawable != null) {
            drawable.setAlpha((int) (f * 255.0f));
        }
    }

    public Bitmap getThumb() {
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        float max = Math.max(measuredWidth / AndroidUtilities.dp(120.0f), measuredHeight / AndroidUtilities.dp(120.0f));
        Bitmap createBitmap = Bitmap.createBitmap((int) (measuredWidth / max), (int) (measuredHeight / max), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float f = 1.0f / max;
        canvas.scale(f, f);
        draw(canvas);
        return createBitmap;
    }
}
