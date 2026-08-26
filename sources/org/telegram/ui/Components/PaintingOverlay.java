package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.text.SpannableString;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.Paint.Views.EditTextOutline;

public final class PaintingOverlay extends FrameLayout {
    public BitmapDrawable backgroundDrawable;
    public boolean drawChildren;
    public boolean ignoreLayout;
    public HashMap mediaEntityViews;
    public Bitmap paintBitmap;

    public final class AnonymousClass1 extends EditTextOutline {
        @Override
        public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            return false;
        }
    }

    public PaintingOverlay(Context context) {
        super(context);
        this.drawChildren = true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (this.drawChildren) {
            return super.drawChild(canvas, view, j);
        }
        return false;
    }

    public Bitmap getBitmap() {
        return this.paintBitmap;
    }

    public Bitmap getThumb() {
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        float fMax = Math.max(measuredWidth / AndroidUtilities.dp(120.0f), measuredHeight / AndroidUtilities.dp(120.0f));
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (measuredWidth / fMax), (int) (measuredHeight / fMax), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        float f = 1.0f / fMax;
        canvas.scale(f, f);
        draw(canvas);
        return bitmapCreateBitmap;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth;
        int i5;
        int i6;
        int measuredHeight;
        if (this.mediaEntityViews != null) {
            int measuredWidth2 = getMeasuredWidth();
            int measuredHeight2 = getMeasuredHeight();
            int childCount = getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) this.mediaEntityViews.get(childAt);
                if (mediaEntity != null) {
                    int measuredWidth3 = childAt.getMeasuredWidth();
                    int measuredHeight3 = childAt.getMeasuredHeight();
                    if (childAt instanceof EditTextOutline) {
                        if (mediaEntity.customTextView) {
                            measuredWidth = ((int) (((mediaEntity.width / 2.0f) + mediaEntity.x) * measuredWidth2)) - (childAt.getMeasuredWidth() / 2);
                            i6 = (int) (((mediaEntity.height / 2.0f) + mediaEntity.y) * measuredHeight2);
                            measuredHeight = childAt.getMeasuredHeight() / 2;
                        } else {
                            measuredWidth = ((int) (measuredWidth2 * mediaEntity.textViewX)) - (childAt.getMeasuredWidth() / 2);
                            i6 = (int) (measuredHeight2 * mediaEntity.textViewY);
                            measuredHeight = childAt.getMeasuredHeight() / 2;
                        }
                        i5 = i6 - measuredHeight;
                    } else {
                        measuredWidth = (int) (measuredWidth2 * mediaEntity.x);
                        i5 = (int) (measuredHeight2 * mediaEntity.y);
                    }
                    childAt.layout(measuredWidth, i5, measuredWidth3 + measuredWidth, measuredHeight3 + i5);
                }
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        this.ignoreLayout = true;
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        if (this.mediaEntityViews != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) this.mediaEntityViews.get(childAt);
                if (mediaEntity != null) {
                    if (childAt instanceof EditTextOutline) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(mediaEntity.viewWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                        float measuredWidth2 = mediaEntity.customTextView ? (mediaEntity.width * getMeasuredWidth()) / mediaEntity.viewWidth : mediaEntity.scale * ((mediaEntity.textViewWidth * measuredWidth) / mediaEntity.viewWidth);
                        childAt.setScaleX(measuredWidth2);
                        childAt.setScaleY(measuredWidth2);
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec((int) (measuredWidth * mediaEntity.width), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (measuredHeight * mediaEntity.height), 1073741824));
                    }
                }
            }
        }
        this.ignoreLayout = false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.ignoreLayout) {
            return;
        }
        super.requestLayout();
    }

    public final void reset() {
        this.paintBitmap = null;
        this.backgroundDrawable = null;
        setBackground(null);
        HashMap map = this.mediaEntityViews;
        if (map != null) {
            map.clear();
        }
        removeAllViews();
    }

    @Override
    public void setAlpha(float f) {
        super.setAlpha(f);
        BitmapDrawable bitmapDrawable = this.backgroundDrawable;
        if (bitmapDrawable != null) {
            bitmapDrawable.setAlpha((int) (255.0f * f));
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != null && childAt.getParent() == this) {
                childAt.setAlpha(f);
            }
        }
    }

    public void setBitmap(Bitmap bitmap) {
        this.paintBitmap = bitmap;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
        this.backgroundDrawable = bitmapDrawable;
        setBackground(bitmapDrawable);
    }

    public final void setEntities(ArrayList arrayList, boolean z, boolean z2, boolean z3) {
        View view;
        setClipChildren(z3);
        reset();
        this.mediaEntityViews = new HashMap();
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        ?? r3 = 0;
        int i = 0;
        while (i < size) {
            VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) arrayList.get(i);
            byte b = mediaEntity.type;
            if (b == 0) {
                BackupImageView backupImageView = new BackupImageView(getContext());
                backupImageView.setLayerNum(12);
                backupImageView.setAspectFit(true);
                ImageReceiver imageReceiver = backupImageView.getImageReceiver();
                if (z) {
                    imageReceiver.setAllowDecodeSingleFrame(true);
                    imageReceiver.setAllowStartLottieAnimation(r3);
                    if (z2) {
                        imageReceiver.setDelegate(new ShareAlert$$ExternalSyntheticLambda15(13));
                    }
                }
                imageReceiver.setImage(ImageLocation.getForDocument(mediaEntity.document), null, null, null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(mediaEntity.document.thumbs, 90), mediaEntity.document), null, null, 0L, "webp", mediaEntity.parentObject, 1);
                if ((mediaEntity.subType & 2) != 0) {
                    backupImageView.setScaleX(-1.0f);
                }
                mediaEntity.view = backupImageView;
                view = backupImageView;
            } else if (b == 1) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(getContext());
                anonymousClass1.setBackgroundColor(r3);
                anonymousClass1.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
                anonymousClass1.setTextSize(r3, mediaEntity.fontSize);
                anonymousClass1.setTypeface(mediaEntity.textTypeface.getTypeface());
                SpannableString spannableString = new SpannableString(Emoji.replaceEmoji(mediaEntity.text, anonymousClass1.getPaint().getFontMetricsInt(), r3));
                ArrayList<VideoEditedInfo.EmojiEntity> arrayList2 = mediaEntity.entities;
                int size2 = arrayList2.size();
                int i2 = 0;
                while (i2 < size2) {
                    VideoEditedInfo.EmojiEntity emojiEntity = arrayList2.get(i2);
                    i2++;
                    VideoEditedInfo.EmojiEntity emojiEntity2 = emojiEntity;
                    AnimatedEmojiSpan animatedEmojiSpan = new AnimatedEmojiSpan(emojiEntity2.document_id, 1.2f, anonymousClass1.getPaint().getFontMetricsInt());
                    int i3 = emojiEntity2.offset;
                    spannableString.setSpan(animatedEmojiSpan, i3, emojiEntity2.length + i3, 33);
                }
                Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) spannableString.getSpans(0, spannableString.length(), Emoji.EmojiSpan.class);
                if (emojiSpanArr != null) {
                    for (Emoji.EmojiSpan emojiSpan : emojiSpanArr) {
                        emojiSpan.scale = 0.85f;
                    }
                }
                anonymousClass1.setText(spannableString);
                anonymousClass1.setGravity(17);
                int i4 = mediaEntity.textAlign;
                anonymousClass1.setGravity(i4 != 1 ? i4 != 2 ? 19 : 21 : 17);
                int i5 = Build.VERSION.SDK_INT;
                int i6 = mediaEntity.textAlign;
                anonymousClass1.setTextAlignment(i6 != 1 ? (i6 == 2 ? !LocaleController.isRTL : LocaleController.isRTL) ? 3 : 2 : 4);
                anonymousClass1.setHorizontallyScrolling(false);
                anonymousClass1.setImeOptions(268435456);
                anonymousClass1.setFocusableInTouchMode(true);
                anonymousClass1.setEnabled(false);
                anonymousClass1.setInputType(anonymousClass1.getInputType() | 16384);
                if (i5 >= 23) {
                    anonymousClass1.setBreakStrategy(0);
                }
                anonymousClass1.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                int i7 = mediaEntity.color;
                byte b2 = mediaEntity.subType;
                if (b2 == 0) {
                    anonymousClass1.setFrameColor(i7);
                    i7 = AndroidUtilities.computePerceivedBrightness(mediaEntity.color) >= 0.721f ? -16777216 : -1;
                } else if (b2 == 1) {
                    anonymousClass1.setFrameColor(AndroidUtilities.computePerceivedBrightness(i7) >= 0.25f ? -1728053248 : -1711276033);
                } else {
                    if (b2 == 2) {
                        anonymousClass1.setFrameColor(AndroidUtilities.computePerceivedBrightness(i7) >= 0.25f ? -16777216 : -1);
                    } else {
                        anonymousClass1.setFrameColor(0);
                    }
                    anonymousClass1.setTextColor(i7);
                    anonymousClass1.setCursorColor(i7);
                    anonymousClass1.setHandlesColor(i7);
                    anonymousClass1.setHighlightColor(Theme.multAlpha(0.4f, i7));
                    mediaEntity.view = anonymousClass1;
                    view = anonymousClass1;
                }
                anonymousClass1.setTextColor(i7);
                anonymousClass1.setCursorColor(i7);
                anonymousClass1.setHandlesColor(i7);
                anonymousClass1.setHighlightColor(Theme.multAlpha(0.4f, i7));
                mediaEntity.view = anonymousClass1;
                view = anonymousClass1;
            } else {
                view = null;
            }
            if (view != null) {
                addView(view);
                view.setRotation((float) ((((double) (-mediaEntity.rotation)) / 3.141592653589793d) * 180.0d));
                this.mediaEntityViews.put(view, mediaEntity);
            }
            i++;
            r3 = 0;
        }
    }

    public final void showAll() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setVisibility(0);
        }
        setBackground(this.backgroundDrawable);
    }
}
