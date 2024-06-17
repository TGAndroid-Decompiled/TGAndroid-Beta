package org.telegram.ui.Components;

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
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.Paint.Views.EditTextOutline;

public class PaintingOverlay extends FrameLayout {
    private Drawable backgroundDrawable;
    public boolean drawChildren;
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
        this.drawChildren = true;
    }

    public void setData(String str, ArrayList<VideoEditedInfo.MediaEntity> arrayList, boolean z, boolean z2, boolean z3) {
        setEntities(arrayList, z, z2, z3);
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
    protected boolean drawChild(Canvas canvas, View view, long j) {
        if (this.drawChildren) {
            return super.drawChild(canvas, view, j);
        }
        return false;
    }

    @Override
    protected void onMeasure(int i, int i2) {
        float f;
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
                        if (mediaEntity.customTextView) {
                            f = (mediaEntity.width * getMeasuredWidth()) / mediaEntity.viewWidth;
                        } else {
                            f = mediaEntity.scale * ((mediaEntity.textViewWidth * measuredWidth) / mediaEntity.viewWidth);
                        }
                        childAt.setScaleX(f);
                        childAt.setScaleY(f);
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
        int i7;
        int measuredHeight;
        if (this.mediaEntityViews != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight2 = getMeasuredHeight();
            int childCount = getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = getChildAt(i8);
                VideoEditedInfo.MediaEntity mediaEntity = this.mediaEntityViews.get(childAt);
                if (mediaEntity != null) {
                    int measuredWidth2 = childAt.getMeasuredWidth();
                    int measuredHeight3 = childAt.getMeasuredHeight();
                    if (childAt instanceof EditTextOutline) {
                        if (mediaEntity.customTextView) {
                            i5 = ((int) (measuredWidth * (mediaEntity.x + (mediaEntity.width / 2.0f)))) - (childAt.getMeasuredWidth() / 2);
                            i7 = (int) (measuredHeight2 * (mediaEntity.y + (mediaEntity.height / 2.0f)));
                            measuredHeight = childAt.getMeasuredHeight() / 2;
                        } else {
                            i5 = ((int) (measuredWidth * mediaEntity.textViewX)) - (childAt.getMeasuredWidth() / 2);
                            i7 = (int) (measuredHeight2 * mediaEntity.textViewY);
                            measuredHeight = childAt.getMeasuredHeight() / 2;
                        }
                        i6 = i7 - measuredHeight;
                    } else {
                        i5 = (int) (measuredWidth * mediaEntity.x);
                        i6 = (int) (measuredHeight2 * mediaEntity.y);
                    }
                    childAt.layout(i5, i6, measuredWidth2 + i5, measuredHeight3 + i6);
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

    public void setEntities(ArrayList<VideoEditedInfo.MediaEntity> arrayList, boolean z, boolean z2, boolean z3) {
        int i;
        setClipChildren(z3);
        reset();
        this.mediaEntityViews = new HashMap<>();
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            VideoEditedInfo.MediaEntity mediaEntity = arrayList.get(i2);
            BackupImageView backupImageView = null;
            byte b = mediaEntity.type;
            if (b == 0) {
                BackupImageView backupImageView2 = new BackupImageView(getContext());
                backupImageView2.setLayerNum(12);
                backupImageView2.setAspectFit(true);
                ImageReceiver imageReceiver = backupImageView2.getImageReceiver();
                if (z) {
                    imageReceiver.setAllowDecodeSingleFrame(true);
                    imageReceiver.setAllowStartLottieAnimation(false);
                    if (z2) {
                        imageReceiver.setDelegate(new ImageReceiver.ImageReceiverDelegate() {
                            @Override
                            public final void didSetImage(ImageReceiver imageReceiver2, boolean z4, boolean z5, boolean z6) {
                                PaintingOverlay.lambda$setEntities$0(imageReceiver2, z4, z5, z6);
                            }

                            @Override
                            public void didSetImageBitmap(int i3, String str, Drawable drawable) {
                                ImageReceiver.ImageReceiverDelegate.CC.$default$didSetImageBitmap(this, i3, str, drawable);
                            }

                            @Override
                            public void onAnimationReady(ImageReceiver imageReceiver2) {
                                ImageReceiver.ImageReceiverDelegate.CC.$default$onAnimationReady(this, imageReceiver2);
                            }
                        });
                    }
                }
                imageReceiver.setImage(ImageLocation.getForDocument(mediaEntity.document), null, null, null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(mediaEntity.document.thumbs, 90), mediaEntity.document), null, null, 0L, "webp", mediaEntity.parentObject, 1);
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
                };
                editTextOutline.setBackgroundColor(0);
                editTextOutline.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
                editTextOutline.setTextSize(0, mediaEntity.fontSize);
                editTextOutline.setTypeface(mediaEntity.textTypeface.getTypeface());
                SpannableString spannableString = new SpannableString(Emoji.replaceEmoji((CharSequence) mediaEntity.text, editTextOutline.getPaint().getFontMetricsInt(), (int) (editTextOutline.getTextSize() * 0.8f), false));
                Iterator<VideoEditedInfo.EmojiEntity> it = mediaEntity.entities.iterator();
                while (it.hasNext()) {
                    VideoEditedInfo.EmojiEntity next = it.next();
                    AnimatedEmojiSpan animatedEmojiSpan = new AnimatedEmojiSpan(next.document_id, editTextOutline.getPaint().getFontMetricsInt());
                    int i3 = next.offset;
                    spannableString.setSpan(animatedEmojiSpan, i3, next.length + i3, 33);
                }
                Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) spannableString.getSpans(0, spannableString.length(), Emoji.EmojiSpan.class);
                if (emojiSpanArr != null) {
                    for (Emoji.EmojiSpan emojiSpan : emojiSpanArr) {
                        emojiSpan.scale = 0.85f;
                    }
                }
                editTextOutline.setText(spannableString);
                editTextOutline.setGravity(17);
                int i4 = mediaEntity.textAlign;
                editTextOutline.setGravity(i4 != 1 ? i4 != 2 ? 19 : 21 : 17);
                int i5 = Build.VERSION.SDK_INT;
                if (i5 >= 17) {
                    int i6 = mediaEntity.textAlign;
                    if (i6 != 1) {
                        i = 3;
                        if (i6 == 2 ? LocaleController.isRTL : !LocaleController.isRTL) {
                            i = 2;
                        }
                    } else {
                        i = 4;
                    }
                    editTextOutline.setTextAlignment(i);
                }
                editTextOutline.setHorizontallyScrolling(false);
                editTextOutline.setImeOptions(268435456);
                editTextOutline.setFocusableInTouchMode(true);
                editTextOutline.setEnabled(false);
                editTextOutline.setInputType(editTextOutline.getInputType() | LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM);
                if (i5 >= 23) {
                    editTextOutline.setBreakStrategy(0);
                }
                editTextOutline.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                int i7 = mediaEntity.color;
                byte b2 = mediaEntity.subType;
                if (b2 == 0) {
                    editTextOutline.setFrameColor(i7);
                    i7 = AndroidUtilities.computePerceivedBrightness(mediaEntity.color) >= 0.721f ? -16777216 : -1;
                } else if (b2 == 1) {
                    editTextOutline.setFrameColor(AndroidUtilities.computePerceivedBrightness(i7) >= 0.25f ? -1728053248 : -1711276033);
                } else if (b2 == 2) {
                    editTextOutline.setFrameColor(AndroidUtilities.computePerceivedBrightness(i7) < 0.25f ? -1 : -16777216);
                } else {
                    editTextOutline.setFrameColor(0);
                }
                editTextOutline.setTextColor(i7);
                editTextOutline.setCursorColor(i7);
                editTextOutline.setHandlesColor(i7);
                editTextOutline.setHighlightColor(Theme.multAlpha(i7, 0.4f));
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
        float max = Math.max(measuredWidth / AndroidUtilities.dp(120.0f), measuredHeight / AndroidUtilities.dp(120.0f));
        Bitmap createBitmap = Bitmap.createBitmap((int) (measuredWidth / max), (int) (measuredHeight / max), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float f = 1.0f / max;
        canvas.scale(f, f);
        draw(canvas);
        return createBitmap;
    }
}
