package org.telegram.p009ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableString;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.p009ui.Components.Paint.Views.EditTextOutline;

public class PaintingOverlay extends FrameLayout {
    private Drawable backgroundDrawable;
    private boolean ignoreLayout;
    private HashMap<View, VideoEditedInfo.MediaEntity> mediaEntityViews;
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
        setEntities(arrayList, z, z2);
        if (str != null) {
            this.paintBitmap = BitmapFactory.decodeFile(str);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(this.paintBitmap);
            this.backgroundDrawable = bitmapDrawable;
            setBackground(bitmapDrawable);
            return;
        }
        this.paintBitmap = null;
        this.backgroundDrawable = null;
        setBackground(null);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        this.ignoreLayout = true;
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        if (this.mediaEntityViews != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                VideoEditedInfo.MediaEntity mediaEntity = this.mediaEntityViews.get(childAt);
                if (mediaEntity != null) {
                    if (childAt instanceof EditTextOutline) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(mediaEntity.viewWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                        float f = (mediaEntity.textViewWidth * measuredWidth) / mediaEntity.viewWidth;
                        childAt.setScaleX(mediaEntity.scale * f);
                        childAt.setScaleY(mediaEntity.scale * f);
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec((int) (measuredWidth * mediaEntity.width), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (measuredHeight * mediaEntity.height), 1073741824));
                    }
                }
            }
        }
        this.ignoreLayout = false;
    }

    @Override
    public void requestLayout() {
        if (this.ignoreLayout) {
            return;
        }
        super.requestLayout();
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (this.mediaEntityViews != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            int childCount = getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                VideoEditedInfo.MediaEntity mediaEntity = this.mediaEntityViews.get(childAt);
                if (mediaEntity != null) {
                    if (childAt instanceof EditTextOutline) {
                        i5 = ((int) (measuredWidth * mediaEntity.textViewX)) - (childAt.getMeasuredWidth() / 2);
                        i6 = ((int) (measuredHeight * mediaEntity.textViewY)) - (childAt.getMeasuredHeight() / 2);
                    } else {
                        i5 = (int) (measuredWidth * mediaEntity.f834x);
                        i6 = (int) (measuredHeight * mediaEntity.f835y);
                    }
                    childAt.layout(i5, i6, childAt.getMeasuredWidth() + i5, childAt.getMeasuredHeight() + i6);
                }
            }
        }
    }

    public void reset() {
        this.paintBitmap = null;
        this.backgroundDrawable = null;
        setBackground(null);
        HashMap<View, VideoEditedInfo.MediaEntity> hashMap = this.mediaEntityViews;
        if (hashMap != null) {
            hashMap.clear();
        }
        removeAllViews();
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
        reset();
        this.mediaEntityViews = new HashMap<>();
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            VideoEditedInfo.MediaEntity mediaEntity = arrayList.get(i);
            BackupImageView backupImageView = null;
            byte b = mediaEntity.type;
            int i2 = 2;
            if (b == 0) {
                BackupImageView backupImageView2 = new BackupImageView(getContext());
                backupImageView2.setAspectFit(true);
                ImageReceiver imageReceiver = backupImageView2.getImageReceiver();
                if (z) {
                    imageReceiver.setAllowDecodeSingleFrame(true);
                    imageReceiver.setAllowStartLottieAnimation(false);
                    if (z2) {
                        imageReceiver.setDelegate(PaintingOverlay$$ExternalSyntheticLambda0.INSTANCE);
                    }
                }
                imageReceiver.setImage(ImageLocation.getForDocument(mediaEntity.document), (String) null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(mediaEntity.document.thumbs, 90), mediaEntity.document), (String) null, "webp", mediaEntity.parentObject, 1);
                if ((mediaEntity.subType & 2) != 0) {
                    backupImageView2.setScaleX(-1.0f);
                }
                mediaEntity.view = backupImageView2;
                backupImageView = backupImageView2;
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

                    {
                        this.animatedEmojiOffsetX = AndroidUtilities.m36dp(8.0f);
                    }
                };
                editTextOutline.setBackgroundColor(0);
                editTextOutline.setPadding(AndroidUtilities.m36dp(7.0f), AndroidUtilities.m36dp(7.0f), AndroidUtilities.m36dp(7.0f), AndroidUtilities.m36dp(7.0f));
                editTextOutline.setTextSize(0, mediaEntity.fontSize);
                editTextOutline.setTypeface(mediaEntity.textTypeface.getTypeface());
                SpannableString spannableString = new SpannableString(Emoji.replaceEmoji(mediaEntity.text, editTextOutline.getPaint().getFontMetricsInt(), (int) (editTextOutline.getTextSize() * 0.8f), false));
                Iterator<VideoEditedInfo.EmojiEntity> it = mediaEntity.entities.iterator();
                while (it.hasNext()) {
                    VideoEditedInfo.EmojiEntity next = it.next();
                    AnimatedEmojiSpan animatedEmojiSpan = new AnimatedEmojiSpan(next.document_id, editTextOutline.getPaint().getFontMetricsInt());
                    int i3 = next.offset;
                    spannableString.setSpan(animatedEmojiSpan, i3, next.length + i3, 33);
                }
                editTextOutline.setText(spannableString);
                editTextOutline.setGravity(17);
                int i4 = mediaEntity.textAlign;
                editTextOutline.setGravity(i4 != 1 ? i4 != 2 ? 19 : 21 : 17);
                int i5 = Build.VERSION.SDK_INT;
                if (i5 >= 17) {
                    int i6 = mediaEntity.textAlign;
                    if (i6 == 1) {
                        i2 = 4;
                    } else if (i6 == 2 ? !LocaleController.isRTL : LocaleController.isRTL) {
                        i2 = 3;
                    }
                    editTextOutline.setTextAlignment(i2);
                }
                editTextOutline.setHorizontallyScrolling(false);
                editTextOutline.setImeOptions(268435456);
                editTextOutline.setFocusableInTouchMode(true);
                editTextOutline.setEnabled(false);
                editTextOutline.setInputType(editTextOutline.getInputType() | 16384);
                if (i5 >= 23) {
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
                backupImageView = editTextOutline;
            }
            if (backupImageView != null) {
                addView(backupImageView);
                double d = -mediaEntity.rotation;
                Double.isNaN(d);
                backupImageView.setRotation((float) ((d / 3.141592653589793d) * 180.0d));
                this.mediaEntityViews.put(backupImageView, mediaEntity);
            }
        }
    }

    public static void lambda$setEntities$0(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        RLottieDrawable lottieAnimation;
        if (!z || z2 || (lottieAnimation = imageReceiver.getLottieAnimation()) == null) {
            return;
        }
        lottieAnimation.start();
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
            drawable.setAlpha((int) (255.0f * f));
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != null && childAt.getParent() == this) {
                childAt.setAlpha(f);
            }
        }
    }

    public Bitmap getThumb() {
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        float max = Math.max(measuredWidth / AndroidUtilities.m36dp(120.0f), measuredHeight / AndroidUtilities.m36dp(120.0f));
        Bitmap createBitmap = Bitmap.createBitmap((int) (measuredWidth / max), (int) (measuredHeight / max), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float f = 1.0f / max;
        canvas.scale(f, f);
        draw(canvas);
        return createBitmap;
    }
}
