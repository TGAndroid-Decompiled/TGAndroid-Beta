package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.internal.mlkit_vision_common.zzlf;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.CallLogActivity$$ExternalSyntheticLambda38;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda44;

public final class SharedPhotoVideoCell extends FrameLayout {
    public final Paint backgroundPaint;
    public final int currentAccount;
    public SharedPhotoVideoCellDelegate delegate;
    public boolean ignoreLayout;
    public final int[] indeces;
    public boolean isFirst;
    public int itemsCount;
    public final MessageObject[] messageObjects;
    public final PhotoVideoView[] photoVideoViews;
    public final int type;

    public final class PhotoVideoView extends FrameLayout {
        public AnimatorSet animator;
        public final CheckBox2 checkBox;
        public final FrameLayout container;
        public MessageObject currentMessageObject;
        public final BackupImageView imageView;
        public final View selector;
        public final PhotoAttachPhotoCell.AnonymousClass3 videoInfoContainer;
        public final TextView videoTextView;

        public PhotoVideoView(Context context) {
            super(context);
            setWillNotDraw(false);
            FrameLayout frameLayout = new FrameLayout(context);
            this.container = frameLayout;
            addView(frameLayout, LayoutHelper.createFrame(-1.0f, -1));
            BackupImageView backupImageView = new BackupImageView(context);
            this.imageView = backupImageView;
            backupImageView.getImageReceiver().setNeedsQualityThumb(true);
            backupImageView.getImageReceiver().setShouldGenerateQualityThumb(true);
            frameLayout.addView(backupImageView, LayoutHelper.createFrame(-1.0f, -1));
            PhotoAttachPhotoCell.AnonymousClass3 anonymousClass3 = new PhotoAttachPhotoCell.AnonymousClass3(context, 1);
            this.videoInfoContainer = anonymousClass3;
            anonymousClass3.setWillNotDraw(false);
            anonymousClass3.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), 0);
            frameLayout.addView(anonymousClass3, LayoutHelper.createFrame(-2, 17.0f, 83, 4.0f, 0.0f, 0.0f, 4.0f));
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.play_mini_video);
            anonymousClass3.addView(imageView, LayoutHelper.createFrame(-2, -2, 19));
            TextView textView = new TextView(context);
            this.videoTextView = textView;
            textView.setTextColor(-1);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextSize(1, 12.0f);
            textView.setImportantForAccessibility(2);
            anonymousClass3.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 19, 13.0f, -0.7f, 0.0f, 0.0f));
            View view = new View(context);
            this.selector = view;
            view.setBackgroundDrawable(Theme.getSelectorDrawable(false));
            addView(view, LayoutHelper.createFrame(-1.0f, -1));
            CheckBox2 checkBox2 = new CheckBox2(context, 21);
            this.checkBox = checkBox2;
            checkBox2.setVisibility(4);
            checkBox2.checkBoxBase.setColor(-1, Theme.key_sharedMedia_photoPlaceholder, Theme.key_checkboxCheck);
            checkBox2.setDrawUnchecked(false);
            checkBox2.setDrawBackgroundAsArc(1);
            addView(checkBox2, LayoutHelper.createFrame(24, 24.0f, 53, 0.0f, 1.0f, 1.0f, 0.0f));
        }

        @Override
        public final void clearAnimation() {
            super.clearAnimation();
            AnimatorSet animatorSet = this.animator;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.animator = null;
            }
        }

        @Override
        public final void onDraw(Canvas canvas) {
            if (!this.checkBox.checkBoxBase.isChecked) {
                BackupImageView backupImageView = this.imageView;
                if (backupImageView.getImageReceiver().hasBitmapImage() && backupImageView.getImageReceiver().getCurrentAlpha() == 1.0f && !PhotoViewer.isShowingImage(this.currentMessageObject)) {
                    return;
                }
            }
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), SharedPhotoVideoCell.this.backgroundPaint);
        }

        @Override
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            if (this.currentMessageObject.isLivePhoto()) {
                accessibilityNodeInfo.setText(LocaleController.getString(R.string.AttachLivePhoto));
            } else if (this.currentMessageObject.isVideo()) {
                StringBuilder sb = new StringBuilder();
                zzlf.m(R.string.AttachVideo, ", ", sb);
                sb.append(LocaleController.formatDuration((int) this.currentMessageObject.getDuration()));
                accessibilityNodeInfo.setText(sb.toString());
            } else {
                accessibilityNodeInfo.setText(LocaleController.getString(R.string.AttachPhoto));
            }
            if (this.checkBox.checkBoxBase.isChecked) {
                accessibilityNodeInfo.setCheckable(true);
                accessibilityNodeInfo.setChecked(true);
            }
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            this.selector.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
            return super.onTouchEvent(motionEvent);
        }

        public final void setChecked(boolean z) {
            CheckBox2 checkBox2 = this.checkBox;
            if (checkBox2.getVisibility() != 0) {
                checkBox2.setVisibility(0);
            }
            checkBox2.checkBoxBase.setChecked(-1, z, true);
            AnimatorSet animatorSet = this.animator;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.animator = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.animator = animatorSet2;
            FrameLayout frameLayout = this.container;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) View.SCALE_X, z ? 0.81f : 1.0f), ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) View.SCALE_Y, z ? 0.81f : 1.0f));
            this.animator.setDuration(200L);
            this.animator.addListener(new ArticleViewer.AnonymousClass25(this, 17));
            this.animator.start();
        }

        public void setMessageObject(MessageObject messageObject) {
            TLRPC.PhotoSize photoSize;
            this.currentMessageObject = messageObject;
            this.imageView.getImageReceiver().setVisible(!PhotoViewer.isShowingImage(messageObject), false);
            if (!TextUtils.isEmpty(MessagesController.getInstance(SharedPhotoVideoCell.this.currentAccount).getRestrictionReason(messageObject.messageOwner.restriction_reason))) {
                this.videoInfoContainer.setVisibility(4);
                this.imageView.setImageResource(R.drawable.photo_placeholder_in);
                return;
            }
            if (messageObject.isVideo()) {
                this.videoInfoContainer.setVisibility(0);
                this.videoTextView.setText(AndroidUtilities.formatShortDuration((int) messageObject.getDuration()));
                TLRPC.Document document = messageObject.getDocument();
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 50);
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 320);
                photoSize = closestPhotoSizeWithSize != closestPhotoSizeWithSize2 ? closestPhotoSizeWithSize2 : null;
                if (closestPhotoSizeWithSize == null) {
                    this.imageView.setImageResource(R.drawable.photo_placeholder_in);
                    return;
                } else if (messageObject.strippedThumb != null) {
                    this.imageView.setImage(ImageLocation.getForDocument(photoSize, document), "100_100", null, null, messageObject.strippedThumb, null, 0, messageObject);
                    return;
                } else {
                    this.imageView.setImage(ImageLocation.getForDocument(photoSize, document), "100_100", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "b", ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.photo_placeholder_in), null, 0, messageObject);
                    return;
                }
            }
            TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
            if (!(messageMedia instanceof TLRPC.TL_messageMediaPhoto) || messageMedia.photo == null || messageObject.photoThumbs.isEmpty()) {
                this.videoInfoContainer.setVisibility(4);
                this.imageView.setImageResource(R.drawable.photo_placeholder_in);
                return;
            }
            this.videoInfoContainer.setVisibility(4);
            TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 50);
            TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 320, false, closestPhotoSizeWithSize3, false);
            if (!messageObject.mediaExists && !DownloadController.getInstance(SharedPhotoVideoCell.this.currentAccount).canDownloadMedia(messageObject)) {
                BitmapDrawable bitmapDrawable = messageObject.strippedThumb;
                if (bitmapDrawable != null) {
                    this.imageView.setImage(null, null, null, null, bitmapDrawable, null, 0, messageObject);
                    return;
                } else {
                    this.imageView.setImage(null, null, ImageLocation.getForObject(closestPhotoSizeWithSize3, messageObject.photoThumbsObject), "b", ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.photo_placeholder_in), null, 0, messageObject);
                    return;
                }
            }
            photoSize = closestPhotoSizeWithSize4 != closestPhotoSizeWithSize3 ? closestPhotoSizeWithSize3 : null;
            if (messageObject.strippedThumb != null) {
                ImageReceiver imageReceiver = this.imageView.getImageReceiver();
                ImageLocation forObject = ImageLocation.getForObject(closestPhotoSizeWithSize4, messageObject.photoThumbsObject);
                long j = 0;
                BitmapDrawable bitmapDrawable2 = messageObject.strippedThumb;
                if (closestPhotoSizeWithSize4 != null) {
                    j = closestPhotoSizeWithSize4.size;
                }
                imageReceiver.setImage(forObject, "100_100", null, null, bitmapDrawable2, j, null, messageObject, messageObject.shouldEncryptPhotoOrVideo() ? 2 : 1);
                return;
            }
            long j2 = 0;
            ImageReceiver imageReceiver2 = this.imageView.getImageReceiver();
            ImageLocation forObject2 = ImageLocation.getForObject(closestPhotoSizeWithSize4, messageObject.photoThumbsObject);
            ImageLocation forObject3 = ImageLocation.getForObject(photoSize, messageObject.photoThumbsObject);
            if (closestPhotoSizeWithSize4 != null) {
                j2 = closestPhotoSizeWithSize4.size;
            }
            imageReceiver2.setImage(forObject2, "100_100", forObject3, "b", j2, null, messageObject, messageObject.shouldEncryptPhotoOrVideo() ? 2 : 1);
        }
    }

    public interface SharedPhotoVideoCellDelegate {
    }

    public SharedPhotoVideoCell(Context context) {
        super(context);
        Paint paint = new Paint();
        this.backgroundPaint = paint;
        this.currentAccount = UserConfig.selectedAccount;
        this.type = 1;
        paint.setColor(Theme.getColor(null, Theme.key_sharedMedia_photoPlaceholder, false));
        this.messageObjects = new MessageObject[6];
        this.photoVideoViews = new PhotoVideoView[6];
        this.indeces = new int[6];
        for (int i = 0; i < 6; i++) {
            this.photoVideoViews[i] = new PhotoVideoView(context);
            addView(this.photoVideoViews[i]);
            this.photoVideoViews[i].setVisibility(4);
            this.photoVideoViews[i].setTag(Integer.valueOf(i));
            this.photoVideoViews[i].setOnClickListener(new CallLogActivity$$ExternalSyntheticLambda38(this, 28));
            this.photoVideoViews[i].setOnLongClickListener(new PhotoViewer$$ExternalSyntheticLambda44(this, 3));
        }
    }

    public static int getItemSize(int i) {
        if (AndroidUtilities.isTablet()) {
            return (AndroidUtilities.dp(490.0f) - (AndroidUtilities.dp(2.0f) * (i - 1))) / i;
        }
        return (AndroidUtilities.displaySize.x - (AndroidUtilities.dp(2.0f) * (i - 1))) / i;
    }

    public SharedPhotoVideoCellDelegate getDelegate() {
        return this.delegate;
    }

    @Override
    public final void invalidate() {
        for (int i = 0; i < 6; i++) {
            this.photoVideoViews[i].invalidate();
        }
        super.invalidate();
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
        int iM$3 = this.type == 1 ? OKLCH.m$3(2.0f, this.itemsCount - 1, View.MeasureSpec.getSize(i)) / this.itemsCount : getItemSize(this.itemsCount);
        this.ignoreLayout = true;
        for (int i3 = 0; i3 < this.itemsCount; i3++) {
            View[] viewArr = this.photoVideoViews;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewArr[i3].getLayoutParams();
            layoutParams.topMargin = this.isFirst ? 0 : AndroidUtilities.dp(2.0f);
            layoutParams.leftMargin = (AndroidUtilities.dp(2.0f) + iM$3) * i3;
            if (i3 != this.itemsCount - 1) {
                layoutParams.width = iM$3;
            } else if (AndroidUtilities.isTablet()) {
                layoutParams.width = AndroidUtilities.dp(490.0f) - ((AndroidUtilities.dp(2.0f) + iM$3) * (this.itemsCount - 1));
            } else {
                layoutParams.width = AndroidUtilities.displaySize.x - ((AndroidUtilities.dp(2.0f) + iM$3) * (this.itemsCount - 1));
            }
            layoutParams.height = iM$3;
            layoutParams.gravity = 51;
            viewArr[i3].setLayoutParams(layoutParams);
        }
        this.ignoreLayout = false;
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((this.isFirst ? 0 : AndroidUtilities.dp(2.0f)) + iM$3, 1073741824));
    }

    @Override
    public final void requestLayout() {
        if (this.ignoreLayout) {
            return;
        }
        super.requestLayout();
    }

    public void setDelegate(SharedPhotoVideoCellDelegate sharedPhotoVideoCellDelegate) {
        this.delegate = sharedPhotoVideoCellDelegate;
    }

    public void setIsFirst(boolean z) {
        this.isFirst = z;
    }

    public void setItemsCount(int i) {
        int i2 = 0;
        while (true) {
            PhotoVideoView[] photoVideoViewArr = this.photoVideoViews;
            if (i2 >= photoVideoViewArr.length) {
                this.itemsCount = i;
                return;
            } else {
                photoVideoViewArr[i2].clearAnimation();
                photoVideoViewArr[i2].setVisibility(i2 < i ? 0 : 4);
                i2++;
            }
        }
    }
}
