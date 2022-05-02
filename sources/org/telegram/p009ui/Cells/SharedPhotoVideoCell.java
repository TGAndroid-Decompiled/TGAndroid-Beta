package org.telegram.p009ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.C0890R;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Components.BackupImageView;
import org.telegram.p009ui.Components.CheckBox2;
import org.telegram.p009ui.Components.LayoutHelper;
import org.telegram.p009ui.PhotoViewer;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$MessageMedia;
import org.telegram.tgnet.TLRPC$PhotoSize;
import org.telegram.tgnet.TLRPC$TL_messageMediaPhoto;

public class SharedPhotoVideoCell extends FrameLayout {
    private Paint backgroundPaint;
    private SharedPhotoVideoCellDelegate delegate;
    private boolean ignoreLayout;
    private boolean isFirst;
    private int itemsCount;
    private int type;
    private int currentAccount = UserConfig.selectedAccount;
    private MessageObject[] messageObjects = new MessageObject[6];
    private PhotoVideoView[] photoVideoViews = new PhotoVideoView[6];
    private int[] indeces = new int[6];

    public interface SharedPhotoVideoCellDelegate {
        void didClickItem(SharedPhotoVideoCell sharedPhotoVideoCell, int i, MessageObject messageObject, int i2);

        boolean didLongClickItem(SharedPhotoVideoCell sharedPhotoVideoCell, int i, MessageObject messageObject, int i2);
    }

    public SharedPhotoVideoCellDelegate getDelegate() {
        return this.delegate;
    }

    public class PhotoVideoView extends FrameLayout {
        private AnimatorSet animator;
        private CheckBox2 checkBox;
        private FrameLayout container;
        private MessageObject currentMessageObject;
        private BackupImageView imageView;
        private View selector;
        private FrameLayout videoInfoContainer;
        private TextView videoTextView;

        public PhotoVideoView(Context context) {
            super(context);
            setWillNotDraw(false);
            FrameLayout frameLayout = new FrameLayout(context);
            this.container = frameLayout;
            addView(frameLayout, LayoutHelper.createFrame(-1, -1.0f));
            BackupImageView backupImageView = new BackupImageView(context);
            this.imageView = backupImageView;
            backupImageView.getImageReceiver().setNeedsQualityThumb(true);
            this.imageView.getImageReceiver().setShouldGenerateQualityThumb(true);
            this.container.addView(this.imageView, LayoutHelper.createFrame(-1, -1.0f));
            FrameLayout frameLayout2 = new FrameLayout(this, context, SharedPhotoVideoCell.this) {
                private RectF rect = new RectF();

                @Override
                protected void onDraw(Canvas canvas) {
                    this.rect.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    canvas.drawRoundRect(this.rect, AndroidUtilities.m34dp(4.0f), AndroidUtilities.m34dp(4.0f), Theme.chat_timeBackgroundPaint);
                }
            };
            this.videoInfoContainer = frameLayout2;
            frameLayout2.setWillNotDraw(false);
            this.videoInfoContainer.setPadding(AndroidUtilities.m34dp(5.0f), 0, AndroidUtilities.m34dp(5.0f), 0);
            this.container.addView(this.videoInfoContainer, LayoutHelper.createFrame(-2, 17.0f, 83, 4.0f, 0.0f, 0.0f, 4.0f));
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(C0890R.C0891drawable.play_mini_video);
            this.videoInfoContainer.addView(imageView, LayoutHelper.createFrame(-2, -2, 19));
            TextView textView = new TextView(context);
            this.videoTextView = textView;
            textView.setTextColor(-1);
            this.videoTextView.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
            this.videoTextView.setTextSize(1, 12.0f);
            this.videoTextView.setImportantForAccessibility(2);
            this.videoInfoContainer.addView(this.videoTextView, LayoutHelper.createFrame(-2, -2.0f, 19, 13.0f, -0.7f, 0.0f, 0.0f));
            View view = new View(context);
            this.selector = view;
            view.setBackgroundDrawable(Theme.getSelectorDrawable(false));
            addView(this.selector, LayoutHelper.createFrame(-1, -1.0f));
            CheckBox2 checkBox2 = new CheckBox2(context, 21);
            this.checkBox = checkBox2;
            checkBox2.setVisibility(4);
            this.checkBox.setColor(null, "sharedMedia_photoPlaceholder", "checkboxCheck");
            this.checkBox.setDrawUnchecked(false);
            this.checkBox.setDrawBackgroundAsArc(1);
            addView(this.checkBox, LayoutHelper.createFrame(24, 24.0f, 53, 0.0f, 1.0f, 1.0f, 0.0f));
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (Build.VERSION.SDK_INT >= 21) {
                this.selector.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
            }
            return super.onTouchEvent(motionEvent);
        }

        public void setChecked(boolean z, boolean z2) {
            if (this.checkBox.getVisibility() != 0) {
                this.checkBox.setVisibility(0);
            }
            this.checkBox.setChecked(z, z2);
            AnimatorSet animatorSet = this.animator;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.animator = null;
            }
            float f = 1.0f;
            if (z2) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.animator = animatorSet2;
                Animator[] animatorArr = new Animator[2];
                FrameLayout frameLayout = this.container;
                Property property = View.SCALE_X;
                float[] fArr = new float[1];
                fArr[0] = z ? 0.81f : 1.0f;
                animatorArr[0] = ObjectAnimator.ofFloat(frameLayout, property, fArr);
                FrameLayout frameLayout2 = this.container;
                Property property2 = View.SCALE_Y;
                float[] fArr2 = new float[1];
                if (z) {
                    f = 0.81f;
                }
                fArr2[0] = f;
                animatorArr[1] = ObjectAnimator.ofFloat(frameLayout2, property2, fArr2);
                animatorSet2.playTogether(animatorArr);
                this.animator.setDuration(200L);
                this.animator.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        if (PhotoVideoView.this.animator != null && PhotoVideoView.this.animator.equals(animator)) {
                            PhotoVideoView.this.animator = null;
                        }
                    }

                    @Override
                    public void onAnimationCancel(Animator animator) {
                        if (PhotoVideoView.this.animator != null && PhotoVideoView.this.animator.equals(animator)) {
                            PhotoVideoView.this.animator = null;
                        }
                    }
                });
                this.animator.start();
                return;
            }
            this.container.setScaleX(z ? 0.85f : 1.0f);
            FrameLayout frameLayout3 = this.container;
            if (z) {
                f = 0.85f;
            }
            frameLayout3.setScaleY(f);
        }

        public void setMessageObject(MessageObject messageObject) {
            this.currentMessageObject = messageObject;
            this.imageView.getImageReceiver().setVisible(!PhotoViewer.isShowingImage(messageObject), false);
            if (!TextUtils.isEmpty(MessagesController.getRestrictionReason(messageObject.messageOwner.restriction_reason))) {
                this.videoInfoContainer.setVisibility(4);
                this.imageView.setImageResource(C0890R.C0891drawable.photo_placeholder_in);
                return;
            }
            TLRPC$PhotoSize tLRPC$PhotoSize = null;
            if (messageObject.isVideo()) {
                this.videoInfoContainer.setVisibility(0);
                this.videoTextView.setText(AndroidUtilities.formatShortDuration(messageObject.getDuration()));
                TLRPC$Document document = messageObject.getDocument();
                TLRPC$PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 50);
                TLRPC$PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 320);
                if (closestPhotoSizeWithSize != closestPhotoSizeWithSize2) {
                    tLRPC$PhotoSize = closestPhotoSizeWithSize2;
                }
                if (closestPhotoSizeWithSize == null) {
                    this.imageView.setImageResource(C0890R.C0891drawable.photo_placeholder_in);
                } else if (messageObject.strippedThumb != null) {
                    this.imageView.setImage(ImageLocation.getForDocument(tLRPC$PhotoSize, document), "100_100", (String) null, messageObject.strippedThumb, messageObject);
                } else {
                    this.imageView.setImage(ImageLocation.getForDocument(tLRPC$PhotoSize, document), "100_100", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "b", ApplicationLoader.applicationContext.getResources().getDrawable(C0890R.C0891drawable.photo_placeholder_in), null, null, 0, messageObject);
                }
            } else {
                TLRPC$MessageMedia tLRPC$MessageMedia = messageObject.messageOwner.media;
                if (!(tLRPC$MessageMedia instanceof TLRPC$TL_messageMediaPhoto) || tLRPC$MessageMedia.photo == null || messageObject.photoThumbs.isEmpty()) {
                    this.videoInfoContainer.setVisibility(4);
                    this.imageView.setImageResource(C0890R.C0891drawable.photo_placeholder_in);
                    return;
                }
                this.videoInfoContainer.setVisibility(4);
                TLRPC$PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 50);
                TLRPC$PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 320, false, closestPhotoSizeWithSize3, false);
                if (messageObject.mediaExists || DownloadController.getInstance(SharedPhotoVideoCell.this.currentAccount).canDownloadMedia(messageObject)) {
                    if (closestPhotoSizeWithSize4 != closestPhotoSizeWithSize3) {
                        tLRPC$PhotoSize = closestPhotoSizeWithSize3;
                    }
                    if (messageObject.strippedThumb != null) {
                        this.imageView.getImageReceiver().setImage(ImageLocation.getForObject(closestPhotoSizeWithSize4, messageObject.photoThumbsObject), "100_100", null, null, messageObject.strippedThumb, closestPhotoSizeWithSize4 != null ? closestPhotoSizeWithSize4.size : 0, null, messageObject, messageObject.shouldEncryptPhotoOrVideo() ? 2 : 1);
                    } else {
                        this.imageView.getImageReceiver().setImage(ImageLocation.getForObject(closestPhotoSizeWithSize4, messageObject.photoThumbsObject), "100_100", ImageLocation.getForObject(tLRPC$PhotoSize, messageObject.photoThumbsObject), "b", closestPhotoSizeWithSize4 != null ? closestPhotoSizeWithSize4.size : 0, null, messageObject, messageObject.shouldEncryptPhotoOrVideo() ? 2 : 1);
                    }
                } else {
                    BitmapDrawable bitmapDrawable = messageObject.strippedThumb;
                    if (bitmapDrawable != null) {
                        this.imageView.setImage(null, null, null, null, bitmapDrawable, null, null, 0, messageObject);
                    } else {
                        this.imageView.setImage(null, null, ImageLocation.getForObject(closestPhotoSizeWithSize3, messageObject.photoThumbsObject), "b", ApplicationLoader.applicationContext.getResources().getDrawable(C0890R.C0891drawable.photo_placeholder_in), null, null, 0, messageObject);
                    }
                }
            }
        }

        @Override
        public void clearAnimation() {
            super.clearAnimation();
            AnimatorSet animatorSet = this.animator;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.animator = null;
            }
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (this.checkBox.isChecked() || !this.imageView.getImageReceiver().hasBitmapImage() || this.imageView.getImageReceiver().getCurrentAlpha() != 1.0f || PhotoViewer.isShowingImage(this.currentMessageObject)) {
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), SharedPhotoVideoCell.this.backgroundPaint);
            }
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            if (this.currentMessageObject.isVideo()) {
                accessibilityNodeInfo.setText(LocaleController.getString("AttachVideo", C0890R.string.AttachVideo) + ", " + LocaleController.formatDuration(this.currentMessageObject.getDuration()));
            } else {
                accessibilityNodeInfo.setText(LocaleController.getString("AttachPhoto", C0890R.string.AttachPhoto));
            }
            if (this.checkBox.isChecked()) {
                accessibilityNodeInfo.setCheckable(true);
                accessibilityNodeInfo.setChecked(true);
            }
        }
    }

    public SharedPhotoVideoCell(Context context, int i) {
        super(context);
        Paint paint = new Paint();
        this.backgroundPaint = paint;
        this.type = i;
        paint.setColor(Theme.getColor("sharedMedia_photoPlaceholder"));
        for (int i2 = 0; i2 < 6; i2++) {
            this.photoVideoViews[i2] = new PhotoVideoView(context);
            addView(this.photoVideoViews[i2]);
            this.photoVideoViews[i2].setVisibility(4);
            this.photoVideoViews[i2].setTag(Integer.valueOf(i2));
            this.photoVideoViews[i2].setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    SharedPhotoVideoCell.this.lambda$new$0(view);
                }
            });
            this.photoVideoViews[i2].setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public final boolean onLongClick(View view) {
                    boolean lambda$new$1;
                    lambda$new$1 = SharedPhotoVideoCell.this.lambda$new$1(view);
                    return lambda$new$1;
                }
            });
        }
    }

    public void lambda$new$0(View view) {
        if (this.delegate != null) {
            int intValue = ((Integer) view.getTag()).intValue();
            this.delegate.didClickItem(this, this.indeces[intValue], this.messageObjects[intValue], intValue);
        }
    }

    public boolean lambda$new$1(View view) {
        if (this.delegate == null) {
            return false;
        }
        int intValue = ((Integer) view.getTag()).intValue();
        return this.delegate.didLongClickItem(this, this.indeces[intValue], this.messageObjects[intValue], intValue);
    }

    public void updateCheckboxColor() {
        for (int i = 0; i < 6; i++) {
            this.photoVideoViews[i].checkBox.invalidate();
        }
    }

    @Override
    public void invalidate() {
        for (int i = 0; i < 6; i++) {
            this.photoVideoViews[i].invalidate();
        }
        super.invalidate();
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void setDelegate(SharedPhotoVideoCellDelegate sharedPhotoVideoCellDelegate) {
        this.delegate = sharedPhotoVideoCellDelegate;
    }

    public void setItemsCount(int i) {
        int i2 = 0;
        while (true) {
            PhotoVideoView[] photoVideoViewArr = this.photoVideoViews;
            if (i2 < photoVideoViewArr.length) {
                photoVideoViewArr[i2].clearAnimation();
                this.photoVideoViews[i2].setVisibility(i2 < i ? 0 : 4);
                i2++;
            } else {
                this.itemsCount = i;
                return;
            }
        }
    }

    public BackupImageView getImageView(int i) {
        if (i >= this.itemsCount) {
            return null;
        }
        return this.photoVideoViews[i].imageView;
    }

    public MessageObject getMessageObject(int i) {
        if (i >= this.itemsCount) {
            return null;
        }
        return this.messageObjects[i];
    }

    public void setIsFirst(boolean z) {
        this.isFirst = z;
    }

    public void setChecked(int i, boolean z, boolean z2) {
        this.photoVideoViews[i].setChecked(z, z2);
    }

    public void setItem(int i, int i2, MessageObject messageObject) {
        this.messageObjects[i] = messageObject;
        this.indeces[i] = i2;
        if (messageObject != null) {
            this.photoVideoViews[i].setVisibility(0);
            this.photoVideoViews[i].setMessageObject(messageObject);
            return;
        }
        this.photoVideoViews[i].clearAnimation();
        this.photoVideoViews[i].setVisibility(4);
        this.messageObjects[i] = null;
    }

    @Override
    public void requestLayout() {
        if (!this.ignoreLayout) {
            super.requestLayout();
        }
    }

    @Override
    protected void onMeasure(int i, int i2) {
        int i3;
        if (this.type == 1) {
            i3 = (View.MeasureSpec.getSize(i) - ((this.itemsCount - 1) * AndroidUtilities.m34dp(2.0f))) / this.itemsCount;
        } else {
            i3 = getItemSize(this.itemsCount);
        }
        this.ignoreLayout = true;
        int i4 = 0;
        for (int i5 = 0; i5 < this.itemsCount; i5++) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.photoVideoViews[i5].getLayoutParams();
            layoutParams.topMargin = this.isFirst ? 0 : AndroidUtilities.m34dp(2.0f);
            layoutParams.leftMargin = (AndroidUtilities.m34dp(2.0f) + i3) * i5;
            if (i5 != this.itemsCount - 1) {
                layoutParams.width = i3;
            } else if (AndroidUtilities.isTablet()) {
                layoutParams.width = AndroidUtilities.m34dp(490.0f) - ((this.itemsCount - 1) * (AndroidUtilities.m34dp(2.0f) + i3));
            } else {
                layoutParams.width = AndroidUtilities.displaySize.x - ((this.itemsCount - 1) * (AndroidUtilities.m34dp(2.0f) + i3));
            }
            layoutParams.height = i3;
            layoutParams.gravity = 51;
            this.photoVideoViews[i5].setLayoutParams(layoutParams);
        }
        this.ignoreLayout = false;
        if (!this.isFirst) {
            i4 = AndroidUtilities.m34dp(2.0f);
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i4 + i3, 1073741824));
    }

    public static int getItemSize(int i) {
        if (AndroidUtilities.isTablet()) {
            return (AndroidUtilities.m34dp(490.0f) - ((i - 1) * AndroidUtilities.m34dp(2.0f))) / i;
        }
        return (AndroidUtilities.displaySize.x - ((i - 1) * AndroidUtilities.m34dp(2.0f))) / i;
    }
}
