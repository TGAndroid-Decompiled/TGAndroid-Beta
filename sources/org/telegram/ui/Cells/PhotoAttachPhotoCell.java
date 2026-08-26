package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import com.google.android.gms.internal.mlkit_vision_common.zzkm;
import com.google.android.gms.internal.mlkit_vision_common.zzlf;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.ColorPicker$$ExternalSyntheticLambda6;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.spoilers.SpoilerEffect;
import org.telegram.ui.Components.spoilers.SpoilerEffect2;
import org.telegram.ui.PhotoViewer;

public final class PhotoAttachPhotoCell extends FrameLayout {
    public static final Rect rect = new Rect();
    public boolean allowLivePhotos;
    public AnimatorSet animator;
    public AnimatorSet animatorSet;
    public final Paint backgroundPaint;
    public final CheckBox2 checkBox;
    public final FrameLayout checkFrame;
    public final AnonymousClass1 container;
    public Float crossfadeDuration;
    public PhotoAttachPhotoCellDelegate delegate;
    public ParentFastScrollDelegate fastScrollDelegate;
    public boolean hasSpoiler;
    public boolean highQuality;
    public final AnonymousClass2 imageView;
    public float imageViewCrossfadeProgress;
    public Bitmap imageViewCrossfadeSnapshot;
    public boolean isLast;
    public boolean isVertical;
    public int itemSize;
    public boolean itemSizeChanged;
    public SpannableString lock;
    public MediaController.PhotoEntry photoEntry;
    public boolean pressed;
    public final Theme.ResourcesProvider resourcesProvider;
    public MediaController.SearchImage searchEntry;
    public SpoilerEffect spoilerEffect;
    public SpoilerEffect2 spoilerEffect2;
    public SpannableString star;
    public long stars;
    public boolean starsSelectedMultiple;
    public final AnonymousClass3 videoInfoContainer;
    public final ImageView videoPlayImageView;
    public final TextView videoTextView;
    public final boolean zoomOnSelect;

    public final class AnonymousClass3 extends FrameLayout {
        public final int $r8$classId;
        public final RectF rect;

        public AnonymousClass3(Context context, int i) {
            super(context);
            this.$r8$classId = i;
            switch (i) {
                case 1:
                    super(context);
                    this.rect = new RectF();
                    break;
                default:
                    this.rect = new RectF();
                    break;
            }
        }

        @Override
        public final void onDraw(Canvas canvas) {
            switch (this.$r8$classId) {
                case 0:
                    RectF rectF = this.rect;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), Theme.chat_timeBackgroundPaint);
                    break;
                default:
                    RectF rectF2 = this.rect;
                    rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), Theme.chat_timeBackgroundPaint);
                    break;
            }
        }
    }

    public interface ParentFastScrollDelegate {
    }

    public interface PhotoAttachPhotoCellDelegate {
        void onCheckClick(PhotoAttachPhotoCell photoAttachPhotoCell);
    }

    public PhotoAttachPhotoCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.zoomOnSelect = true;
        this.backgroundPaint = new Paint();
        new Path();
        this.imageViewCrossfadeProgress = 1.0f;
        this.resourcesProvider = resourcesProvider;
        setWillNotDraw(false);
        ?? r5 = new FrameLayout(context) {
            @Override
            public final boolean drawChild(Canvas canvas, View view, long j) {
                MediaController.PhotoEntry photoEntry;
                float measuredWidth;
                float measuredHeight;
                int i;
                PhotoAttachPhotoCell photoAttachPhotoCell = PhotoAttachPhotoCell.this;
                if (photoAttachPhotoCell.spoilerEffect2 == null || view != photoAttachPhotoCell.imageView) {
                    return super.drawChild(canvas, view, j);
                }
                boolean zDrawChild = super.drawChild(canvas, view, j);
                if (photoAttachPhotoCell.hasSpoiler && ((photoEntry = photoAttachPhotoCell.photoEntry) == null || !photoEntry.isAttachSpoilerRevealed)) {
                    photoAttachPhotoCell.spoilerEffect2.draw(canvas, photoAttachPhotoCell.container, photoAttachPhotoCell.imageView.getMeasuredWidth(), photoAttachPhotoCell.imageView.getMeasuredHeight(), 1.0f, false);
                    MediaController.PhotoEntry photoEntry2 = photoAttachPhotoCell.photoEntry;
                    if (photoEntry2 != null && photoEntry2.starsAmount > 0) {
                        AnonymousClass2 anonymousClass2 = photoAttachPhotoCell.imageView;
                        if (anonymousClass2.blurText != null) {
                            Path path = anonymousClass2.blurTextClipPath;
                            if (path == null) {
                                anonymousClass2.blurTextClipPath = new Path();
                            } else {
                                path.rewind();
                            }
                            int i2 = anonymousClass2.width;
                            if (i2 == -1 || (i = anonymousClass2.height) == -1) {
                                measuredWidth = anonymousClass2.getMeasuredWidth();
                                measuredHeight = anonymousClass2.getMeasuredHeight();
                            } else {
                                measuredWidth = i2;
                                measuredHeight = i;
                            }
                            float fDp = anonymousClass2.blurText.width + AndroidUtilities.dp(18.0f);
                            float fDp2 = AndroidUtilities.dp(28.0f);
                            float f = (measuredWidth - fDp) / 2.0f;
                            float f2 = measuredHeight / 2.0f;
                            RectF rectF = AndroidUtilities.rectTmp;
                            float f3 = fDp2 / 2.0f;
                            rectF.set(f, f2 - f3, fDp + f, f2 + f3);
                            anonymousClass2.blurTextClipPath.addRoundRect(rectF, f3, f3, Path.Direction.CW);
                            canvas.save();
                            canvas.clipPath(anonymousClass2.blurTextClipPath);
                            ImageReceiver imageReceiver = anonymousClass2.blurImageReceiver;
                            if (imageReceiver != null && anonymousClass2.blurAllowed) {
                                imageReceiver.setColorFilter(anonymousClass2.blurTextBgColorFilter);
                                float alpha = anonymousClass2.blurImageReceiver.getAlpha();
                                anonymousClass2.blurImageReceiver.setAlpha(1.0f);
                                anonymousClass2.blurImageReceiver.draw(canvas);
                                anonymousClass2.blurImageReceiver.setAlpha(alpha);
                                anonymousClass2.blurImageReceiver.setColorFilter(null);
                            }
                            anonymousClass2.blurText.draw(AndroidUtilities.dp(9.0f) + f, f2, 1.0f, -1, canvas);
                            canvas.restore();
                        }
                    }
                    photoAttachPhotoCell.getClass();
                }
                return zDrawChild;
            }
        };
        this.container = r5;
        addView((View) r5, LayoutHelper.createFrame(80.0f, 80));
        ?? r7 = new BackupImageView(context) {
            public final Paint crossfadePaint = new Paint(1);
            public long lastUpdate;
            public Drawable livePhotoIcon;
            public Drawable livePhotoIconOff;

            @Override
            public final void onDraw(Canvas canvas) {
                Bitmap bitmap;
                MediaController.PhotoEntry photoEntry;
                Drawable drawable;
                MediaController.PhotoEntry photoEntry2;
                AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedEmojiDrawable;
                ImageReceiver imageReceiver = animatedEmojiDrawable != null ? animatedEmojiDrawable.imageReceiver : this.imageReceiver;
                if (imageReceiver == null) {
                    return;
                }
                if (this.width == -1 || this.height == -1) {
                    imageReceiver.setImageCoords(0.0f, 0.0f, getWidth(), getHeight());
                    this.blurImageReceiver.setImageCoords(0.0f, 0.0f, getWidth(), getHeight());
                } else {
                    float width = (getWidth() - this.width) / 2;
                    int height = getHeight();
                    int i = this.height;
                    imageReceiver.setImageCoords(width, (height - i) / 2, this.width, i);
                    ImageReceiver imageReceiver2 = this.blurImageReceiver;
                    float width2 = (getWidth() - this.width) / 2;
                    int height2 = getHeight();
                    int i2 = this.height;
                    imageReceiver2.setImageCoords(width2, (height2 - i2) / 2, this.width, i2);
                }
                imageReceiver.draw(canvas);
                PhotoAttachPhotoCell photoAttachPhotoCell = PhotoAttachPhotoCell.this;
                if (photoAttachPhotoCell.hasSpoiler && ((photoEntry2 = photoAttachPhotoCell.photoEntry) == null || !photoEntry2.isAttachSpoilerRevealed)) {
                    this.blurImageReceiver.draw(canvas);
                    if (photoAttachPhotoCell.spoilerEffect2 == null) {
                        if (photoAttachPhotoCell.spoilerEffect == null) {
                            SpoilerEffect spoilerEffect = new SpoilerEffect();
                            photoAttachPhotoCell.spoilerEffect = spoilerEffect;
                            spoilerEffect.setColor(ColorUtils.setAlphaComponent(-1, (int) (Color.alpha(-1) * 0.325f)));
                        }
                        photoAttachPhotoCell.spoilerEffect.setBounds(0, 0, getWidth(), getHeight());
                        photoAttachPhotoCell.spoilerEffect.draw(canvas);
                    }
                    invalidate();
                }
                float f = photoAttachPhotoCell.imageViewCrossfadeProgress;
                if (f != 1.0f && photoAttachPhotoCell.imageViewCrossfadeSnapshot != null) {
                    Paint paint = this.crossfadePaint;
                    paint.setAlpha((int) (CubicBezierInterpolator.DEFAULT.getInterpolation(1.0f - f) * 255.0f));
                    canvas.drawBitmap(photoAttachPhotoCell.imageViewCrossfadeSnapshot, 0.0f, 0.0f, paint);
                    long jMin = Math.min(16L, System.currentTimeMillis() - this.lastUpdate);
                    Float f2 = photoAttachPhotoCell.crossfadeDuration;
                    photoAttachPhotoCell.imageViewCrossfadeProgress = Math.min(1.0f, (jMin / (f2 == null ? 250.0f : f2.floatValue())) + photoAttachPhotoCell.imageViewCrossfadeProgress);
                    this.lastUpdate = System.currentTimeMillis();
                    invalidate();
                    if (photoAttachPhotoCell.spoilerEffect2 != null) {
                        photoAttachPhotoCell.container.invalidate();
                    }
                } else if (f == 1.0f && (bitmap = photoAttachPhotoCell.imageViewCrossfadeSnapshot) != null) {
                    bitmap.recycle();
                    photoAttachPhotoCell.imageViewCrossfadeSnapshot = null;
                    photoAttachPhotoCell.crossfadeDuration = null;
                    invalidate();
                }
                if (photoAttachPhotoCell.allowLivePhotos) {
                    ParentFastScrollDelegate parentFastScrollDelegate = photoAttachPhotoCell.fastScrollDelegate;
                    if ((parentFastScrollDelegate == null || !((ChatAttachAlertPhotoLayout.PhotoAttachAdapter) ((ColorPicker$$ExternalSyntheticLambda6) parentFastScrollDelegate).f$0).isInFastScroll) && (photoEntry = photoAttachPhotoCell.photoEntry) != null && photoEntry.isLivePhoto()) {
                        if (photoAttachPhotoCell.photoEntry.isUnalivePhoto()) {
                            if (this.livePhotoIconOff == null) {
                                this.livePhotoIconOff = getContext().getResources().getDrawable(R.drawable.media_live_off).mutate();
                            }
                            drawable = this.livePhotoIconOff;
                        } else {
                            if (this.livePhotoIcon == null) {
                                this.livePhotoIcon = getContext().getResources().getDrawable(R.drawable.media_live_on).mutate();
                            }
                            drawable = this.livePhotoIcon;
                        }
                        drawable.setBounds((int) (imageReceiver.getImageX() + AndroidUtilities.dp(8.0f)), (int) (imageReceiver.getImageY() + AndroidUtilities.dp(8.0f)), (int) (imageReceiver.getImageX() + AndroidUtilities.dp(30.0f)), (int) (imageReceiver.getImageY() + AndroidUtilities.dp(26.0f)));
                        drawable.draw(canvas);
                    }
                }
            }

            @Override
            public final void onMeasure(int i, int i2) {
                super.onMeasure(i, i2);
                PhotoAttachPhotoCell photoAttachPhotoCell = PhotoAttachPhotoCell.this;
                MediaController.PhotoEntry photoEntry = photoAttachPhotoCell.photoEntry;
                photoAttachPhotoCell.updateSpoilers2(photoEntry != null && photoEntry.hasSpoiler);
            }
        };
        this.imageView = r7;
        r7.setBlurAllowed(true);
        r5.addView(r7, LayoutHelper.createFrame(-1.0f, -1));
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(context, 0);
        this.videoInfoContainer = anonymousClass3;
        anonymousClass3.setWillNotDraw(false);
        anonymousClass3.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), 0);
        r5.addView(anonymousClass3, LayoutHelper.createFrame(-2, 17.0f, 83, 4.0f, 0.0f, 0.0f, 4.0f));
        ImageView imageView = new ImageView(context);
        this.videoPlayImageView = imageView;
        imageView.setImageResource(R.drawable.play_mini_video);
        anonymousClass3.addView(imageView, LayoutHelper.createFrame(-2, -2, 19));
        TextView textView = new TextView(context);
        this.videoTextView = textView;
        textView.setTextColor(-1);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        anonymousClass3.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 19, 13.0f, -0.7f, 0.0f, 0.0f));
        CheckBox2 checkBox2 = new CheckBox2(context, 24, resourcesProvider);
        this.checkBox = checkBox2;
        checkBox2.setDrawBackgroundAsArc(7);
        checkBox2.checkBoxBase.setColor(Theme.key_chat_attachCheckBoxBackground, Theme.key_chat_attachPhotoBackground, Theme.key_chat_attachCheckBoxCheck);
        addView(checkBox2, LayoutHelper.createFrame(26, 26.0f, 51, 52.0f, 4.0f, 0.0f, 0.0f));
        checkBox2.setVisibility(0);
        setFocusable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.checkFrame = frameLayout;
        addView(frameLayout, LayoutHelper.createFrame(42, 42.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        this.itemSize = AndroidUtilities.dp(80.0f);
    }

    @Override
    public final void clearAnimation() {
        super.clearAnimation();
        AnimatorSet animatorSet = this.animator;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.animator = null;
            CheckBox2 checkBox2 = this.checkBox;
            float f = checkBox2.checkBoxBase.isChecked ? 0.787f : 1.0f;
            AnonymousClass1 anonymousClass1 = this.container;
            anonymousClass1.setScaleX(f);
            anonymousClass1.setScaleY(checkBox2.checkBoxBase.isChecked ? 0.787f : 1.0f);
        }
    }

    public CheckBox2 getCheckBox() {
        return this.checkBox;
    }

    public FrameLayout getCheckFrame() {
        return this.checkFrame;
    }

    public BackupImageView getImageView() {
        return this.imageView;
    }

    public MediaController.PhotoEntry getPhotoEntry() {
        return this.photoEntry;
    }

    public float getScale() {
        return getScaleX();
    }

    public View getVideoInfoContainer() {
        return this.videoInfoContainer;
    }

    public final boolean isChecked() {
        return this.checkBox.checkBoxBase.isChecked;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        SpoilerEffect2 spoilerEffect2 = this.spoilerEffect2;
        if (spoilerEffect2 != null) {
            if (spoilerEffect2.destroyed) {
                this.spoilerEffect2 = SpoilerEffect2.getInstance(this);
            } else {
                spoilerEffect2.attach(this);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        SpoilerEffect2 spoilerEffect2 = this.spoilerEffect2;
        if (spoilerEffect2 != null) {
            spoilerEffect2.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        MediaController.PhotoEntry photoEntry;
        MediaController.SearchImage searchImage;
        boolean z = this.checkBox.checkBoxBase.isChecked;
        AnonymousClass2 anonymousClass2 = this.imageView;
        if (!z && getScaleX() == 1.0f && anonymousClass2.getImageReceiver().hasNotThumb() && anonymousClass2.getImageReceiver().getCurrentAlpha() == 1.0f && (((photoEntry = this.photoEntry) == null || !PhotoViewer.isShowingImage(photoEntry.path)) && ((searchImage = this.searchEntry) == null || !PhotoViewer.isShowingImage(searchImage.getPathToAttach())))) {
            return;
        }
        Paint paint = this.backgroundPaint;
        paint.setColor(Theme.getColor(Theme.key_chat_attachPhotoBackground, this.resourcesProvider));
        canvas.drawRect(0.0f, 0.0f, anonymousClass2.getMeasuredWidth(), anonymousClass2.getMeasuredHeight(), paint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb = new StringBuilder();
        MediaController.PhotoEntry photoEntry = this.photoEntry;
        if (photoEntry == null || !photoEntry.isLivePhoto()) {
            MediaController.PhotoEntry photoEntry2 = this.photoEntry;
            if (photoEntry2 == null || !photoEntry2.isVideo) {
                sb.append(LocaleController.getString(R.string.AttachPhoto));
            } else {
                StringBuilder sb2 = new StringBuilder();
                zzlf.m(R.string.AttachVideo, ", ", sb2);
                sb2.append(LocaleController.formatDuration(this.photoEntry.duration));
                sb.append(sb2.toString());
            }
        } else {
            sb.append(LocaleController.getString(R.string.AttachLivePhoto));
        }
        if (this.photoEntry != null) {
            sb.append(". ");
            sb.append(LocaleController.getInstance().getFormatterStats().format(this.photoEntry.dateTaken * 1000));
        }
        accessibilityNodeInfo.setText(sb);
        if (this.checkBox.checkBoxBase.isChecked) {
            accessibilityNodeInfo.setSelected(true);
        }
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_open_photo, LocaleController.getString(R.string.Open)));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        if (this.itemSizeChanged) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.itemSize, 1073741824), zzkm.m(2.0f, this.itemSize));
            return;
        }
        if (this.isVertical) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp((this.isLast ? 0 : 6) + 80), 1073741824));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp((this.isLast ? 0 : 6) + 80), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824));
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout = this.checkFrame;
        Rect rect2 = rect;
        frameLayout.getHitRect(rect2);
        boolean z = true;
        if (motionEvent.getAction() == 0) {
            if (rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                this.pressed = true;
                invalidate();
            }
            if (z) {
                return z;
            }
            return super.onTouchEvent(motionEvent);
        }
        if (this.pressed) {
            if (motionEvent.getAction() == 1) {
                getParent().requestDisallowInterceptTouchEvent(true);
                this.pressed = false;
                playSoundEffect(0);
                sendAccessibilityEvent(1);
                this.delegate.onCheckClick(this);
                invalidate();
            } else if (motionEvent.getAction() == 3) {
                this.pressed = false;
                invalidate();
            } else if (motionEvent.getAction() == 2 && !rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                this.pressed = false;
                invalidate();
            }
        }
        z = false;
        if (z) {
            return super.onTouchEvent(motionEvent);
        }
        return z;
    }

    @Override
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (i == R.id.acc_action_open_photo) {
            View view = (View) getParent();
            view.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, getLeft(), (getHeight() + getTop()) - 1, 0));
            view.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 1, getLeft(), (getHeight() + getTop()) - 1, 0));
        }
        return super.performAccessibilityAction(i, bundle);
    }

    public final void setChecked(int i, boolean z, boolean z2) {
        boolean z3 = false;
        this.checkBox.checkBoxBase.setChecked(i, z, z2);
        if (this.itemSizeChanged) {
            AnimatorSet animatorSet = this.animator;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.animator = null;
            }
            AnonymousClass1 anonymousClass1 = this.container;
            if (z2) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.animator = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(anonymousClass1, (Property<AnonymousClass1, Float>) View.SCALE_X, z ? 0.787f : 1.0f), ObjectAnimator.ofFloat(anonymousClass1, (Property<AnonymousClass1, Float>) View.SCALE_Y, z ? 0.787f : 1.0f));
                this.animator.setDuration(200L);
                this.animator.addListener(new ChatActivity.AnonymousClass77(7, this, z));
                this.animator.start();
            } else {
                anonymousClass1.setScaleX(z ? 0.787f : 1.0f);
                anonymousClass1.setScaleY(z ? 0.787f : 1.0f);
            }
        }
        MediaController.PhotoEntry photoEntry = this.photoEntry;
        if (photoEntry != null && photoEntry.isHighQuality() && isChecked()) {
            z3 = true;
        }
        setHighQuality(z3);
    }

    public void setDelegate(PhotoAttachPhotoCellDelegate photoAttachPhotoCellDelegate) {
        this.delegate = photoAttachPhotoCellDelegate;
    }

    public void setFastScrollDelegate(ParentFastScrollDelegate parentFastScrollDelegate) {
        this.fastScrollDelegate = parentFastScrollDelegate;
    }

    public void setHasSpoiler(boolean z) {
        setHasSpoiler(z, null);
    }

    public void setHighQuality(boolean z) {
        boolean z2 = z && isChecked();
        if (this.highQuality != z2) {
            this.highQuality = z2;
            MediaController.PhotoEntry photoEntry = this.photoEntry;
            if (photoEntry != null) {
                boolean z3 = photoEntry.isVideo;
                ImageView imageView = this.videoPlayImageView;
                AnonymousClass3 anonymousClass3 = this.videoInfoContainer;
                TextView textView = this.videoTextView;
                if (z3 && !photoEntry.isLivePhoto()) {
                    this.imageView.imageReceiver.setOrientation(0, true);
                    anonymousClass3.setVisibility(0);
                    imageView.setVisibility(0);
                    ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = AndroidUtilities.dp(13.0f);
                    textView.setText(AndroidUtilities.formatShortDuration(this.photoEntry.duration));
                    return;
                }
                if (!this.photoEntry.isHighQuality()) {
                    imageView.setVisibility(8);
                    anonymousClass3.setVisibility(4);
                } else {
                    anonymousClass3.setVisibility(0);
                    imageView.setVisibility(8);
                    ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = AndroidUtilities.dp(0.0f);
                    textView.setText(LocaleController.getString(R.string.ShortHighQuality));
                }
            }
        }
    }

    public void setIsVertical(boolean z) {
        this.isVertical = z;
    }

    public void setItemSize(int i) {
        this.itemSize = i;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        int i2 = this.itemSize;
        layoutParams.height = i2;
        layoutParams.width = i2;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.checkFrame.getLayoutParams();
        layoutParams2.gravity = 53;
        layoutParams2.leftMargin = 0;
        CheckBox2 checkBox2 = this.checkBox;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) checkBox2.getLayoutParams();
        layoutParams3.gravity = 53;
        layoutParams3.leftMargin = 0;
        int iDp = AndroidUtilities.dp(5.0f);
        layoutParams3.topMargin = iDp;
        layoutParams3.rightMargin = iDp;
        checkBox2.setDrawBackgroundAsArc(6);
        this.itemSizeChanged = true;
    }

    public void setNum(int i) {
        this.checkBox.setNum(i);
    }

    public void setOnCheckClickListener(View.OnClickListener onClickListener) {
        this.checkFrame.setOnClickListener(onClickListener);
    }

    public final void setPhotoEntry(MediaController.PhotoEntry photoEntry, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = false;
        this.pressed = false;
        this.photoEntry = photoEntry;
        this.isLast = z3;
        this.allowLivePhotos = z4;
        boolean z6 = photoEntry.isVideo;
        ImageView imageView = this.videoPlayImageView;
        TextView textView = this.videoTextView;
        AnonymousClass3 anonymousClass3 = this.videoInfoContainer;
        AnonymousClass2 anonymousClass2 = this.imageView;
        if (z6 && !photoEntry.isLivePhoto()) {
            anonymousClass2.imageReceiver.setOrientation(0, true);
            anonymousClass3.setVisibility(0);
            imageView.setVisibility(0);
            ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = AndroidUtilities.dp(13.0f);
            textView.setText(AndroidUtilities.formatShortDuration(this.photoEntry.duration));
        } else if (this.photoEntry.isHighQuality() && isChecked()) {
            anonymousClass3.setVisibility(0);
            imageView.setVisibility(8);
            ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = AndroidUtilities.dp(0.0f);
            textView.setText(LocaleController.getString(R.string.ShortHighQuality));
        } else {
            imageView.setVisibility(8);
            anonymousClass3.setVisibility(4);
        }
        MediaController.PhotoEntry photoEntry2 = this.photoEntry;
        String str = photoEntry2.coverPath;
        if (str != null) {
            anonymousClass2.setImage(str, null, Theme.chat_attachEmptyDrawable);
        } else {
            String str2 = photoEntry2.thumbPath;
            if (str2 != null) {
                anonymousClass2.setImage(str2, null, Theme.chat_attachEmptyDrawable);
            } else if (photoEntry2.path == null) {
                anonymousClass2.setImageDrawable(Theme.chat_attachEmptyDrawable);
            } else if (!photoEntry2.isVideo || photoEntry2.isLivePhoto()) {
                MediaController.PhotoEntry photoEntry3 = this.photoEntry;
                anonymousClass2.imageReceiver.setOrientation(photoEntry3.orientation, photoEntry3.invert, true);
                anonymousClass2.setImage("thumb://" + this.photoEntry.imageId + ":" + this.photoEntry.path, null, Theme.chat_attachEmptyDrawable);
            } else {
                anonymousClass2.setImage("vthumb://" + this.photoEntry.imageId + ":" + this.photoEntry.path, null, Theme.chat_attachEmptyDrawable);
            }
        }
        boolean z7 = z2 && PhotoViewer.isShowingImage(this.photoEntry.path);
        anonymousClass2.getImageReceiver().setVisible(!z7, true);
        this.checkBox.setAlpha(z7 ? 0.0f : 1.0f);
        anonymousClass3.setAlpha(z7 ? 0.0f : 1.0f);
        requestLayout();
        setHasSpoiler(photoEntry.hasSpoiler);
        if (photoEntry.isHighQuality() && isChecked()) {
            z5 = true;
        }
        setHighQuality(z5);
        setStarsPrice(photoEntry.starsAmount, z);
    }

    public final void setStarsPrice(long j, boolean z) {
        SpannableStringBuilder spannableStringBuilder;
        if (z == this.starsSelectedMultiple && j == this.stars) {
            return;
        }
        this.stars = j;
        this.starsSelectedMultiple = z;
        if (j > 0) {
            spannableStringBuilder = new SpannableStringBuilder();
            if (this.star == null) {
                this.star = new SpannableString("⭐");
                ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.star_small_inner);
                coloredImageSpan.setScale(0.7f, 0.7f);
                SpannableString spannableString = this.star;
                spannableString.setSpan(coloredImageSpan, 0, spannableString.length(), 33);
            }
            spannableStringBuilder.append((CharSequence) this.star);
            spannableStringBuilder.append((CharSequence) "\u2009");
            if (z) {
                if (this.lock == null) {
                    this.lock = new SpannableString("l");
                    ColoredImageSpan coloredImageSpan2 = new ColoredImageSpan(R.drawable.msg_mini_lock2);
                    SpannableString spannableString2 = this.lock;
                    spannableString2.setSpan(coloredImageSpan2, 0, spannableString2.length(), 33);
                }
                spannableStringBuilder.append((CharSequence) this.lock);
            } else {
                spannableStringBuilder.append((CharSequence) Long.toString(j));
            }
        } else {
            spannableStringBuilder = null;
        }
        AnonymousClass2 anonymousClass2 = this.imageView;
        anonymousClass2.setBlurredText(spannableStringBuilder);
        anonymousClass2.invalidate();
        invalidate();
    }

    public final void showCheck(boolean z) {
        CheckBox2 checkBox2 = this.checkBox;
        if (z && checkBox2.getAlpha() == 1.0f) {
            return;
        }
        if (z || checkBox2.getAlpha() != 0.0f) {
            AnimatorSet animatorSet = this.animatorSet;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.animatorSet = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.animatorSet = animatorSet2;
            animatorSet2.setInterpolator(new DecelerateInterpolator());
            this.animatorSet.setDuration(180L);
            AnimatorSet animatorSet3 = this.animatorSet;
            float[] fArr = {z ? 1.0f : 0.0f};
            AnonymousClass3 anonymousClass3 = this.videoInfoContainer;
            Property property = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(anonymousClass3, (Property<AnonymousClass3, Float>) property, fArr), ObjectAnimator.ofFloat(checkBox2, (Property<CheckBox2, Float>) property, z ? 1.0f : 0.0f));
            this.animatorSet.addListener(new ArticleViewer.AnonymousClass25(this, 14));
            this.animatorSet.start();
        }
    }

    public final void updateSpoilers2(boolean z) {
        AnonymousClass2 anonymousClass2;
        AnonymousClass1 anonymousClass1 = this.container;
        if (anonymousClass1 == null || (anonymousClass2 = this.imageView) == null || anonymousClass2.getMeasuredHeight() <= 0 || anonymousClass2.getMeasuredWidth() <= 0) {
            return;
        }
        if (z) {
            if (this.spoilerEffect2 == null) {
                this.spoilerEffect2 = SpoilerEffect2.getInstance(anonymousClass1);
            }
        } else {
            SpoilerEffect2 spoilerEffect2 = this.spoilerEffect2;
            if (spoilerEffect2 != null) {
                spoilerEffect2.detach(this);
                this.spoilerEffect2 = null;
            }
        }
    }

    public final void setHasSpoiler(boolean z, Float f) {
        if (this.hasSpoiler != z) {
            boolean zIsLaidOut = isLaidOut();
            AnonymousClass2 anonymousClass2 = this.imageView;
            if (zIsLaidOut) {
                Bitmap bitmap = this.imageViewCrossfadeSnapshot;
                this.imageViewCrossfadeSnapshot = AndroidUtilities.snapshotView(anonymousClass2);
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this.imageViewCrossfadeProgress = 0.0f;
            } else {
                Bitmap bitmap2 = this.imageViewCrossfadeSnapshot;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                    this.imageViewCrossfadeSnapshot = null;
                }
                this.imageViewCrossfadeProgress = 1.0f;
            }
            this.hasSpoiler = z;
            this.crossfadeDuration = f;
            anonymousClass2.setHasBlur(z);
            anonymousClass2.invalidate();
            if (z) {
                updateSpoilers2(z);
            }
        }
    }

    public final void setPhotoEntry(MediaController.SearchImage searchImage) {
        this.pressed = false;
        this.searchEntry = searchImage;
        this.isLast = false;
        Drawable drawable = this.zoomOnSelect ? Theme.chat_attachEmptyDrawable : getResources().getDrawable(R.drawable.nophotos);
        TLRPC.PhotoSize photoSize = searchImage.thumbPhotoSize;
        AnonymousClass2 anonymousClass2 = this.imageView;
        if (photoSize != null) {
            anonymousClass2.setImage(ImageLocation.getForPhoto(photoSize, searchImage.photo), null, drawable, searchImage);
        } else {
            TLRPC.PhotoSize photoSize2 = searchImage.photoSize;
            if (photoSize2 != null) {
                anonymousClass2.setImage(ImageLocation.getForPhoto(photoSize2, searchImage.photo), "80_80", drawable, searchImage);
            } else {
                String str = searchImage.thumbPath;
                if (str != null) {
                    anonymousClass2.setImage(str, null, drawable);
                } else if (!TextUtils.isEmpty(searchImage.thumbUrl)) {
                    ImageLocation forPath = ImageLocation.getForPath(searchImage.thumbUrl);
                    if (searchImage.type == 1 && searchImage.thumbUrl.endsWith("mp4")) {
                        forPath.imageType = 2;
                    }
                    anonymousClass2.setImage(forPath, null, drawable, searchImage);
                } else {
                    TLRPC.Document document = searchImage.document;
                    if (document != null) {
                        MessageObject.getDocumentVideoThumb(document);
                        TLRPC.VideoSize documentVideoThumb = MessageObject.getDocumentVideoThumb(searchImage.document);
                        if (documentVideoThumb != null) {
                            anonymousClass2.imageReceiver.setImage(ImageLocation.getForDocument(documentVideoThumb, searchImage.document), null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(searchImage.document.thumbs, 90), searchImage.document), "52_52", null, -1L, null, searchImage, 1);
                            anonymousClass2.onNewImageSet();
                        } else {
                            anonymousClass2.setImage(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(searchImage.document.thumbs, 320), searchImage.document), null, drawable, searchImage);
                        }
                    } else {
                        anonymousClass2.setImageDrawable(drawable);
                    }
                }
            }
        }
        boolean zIsShowingImage = PhotoViewer.isShowingImage(searchImage.getPathToAttach());
        anonymousClass2.getImageReceiver().setVisible(!zIsShowingImage, true);
        this.checkBox.setAlpha(zIsShowingImage ? 0.0f : 1.0f);
        this.videoInfoContainer.setAlpha(zIsShowingImage ? 0.0f : 1.0f);
        requestLayout();
        setHasSpoiler(false);
        setHighQuality(false);
        setStarsPrice(0L, false);
    }
}
