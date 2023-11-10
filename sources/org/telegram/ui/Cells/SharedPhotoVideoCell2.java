package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import androidx.core.math.MathUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildConfig;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$PhotoSize;
import org.telegram.tgnet.TLRPC$TL_messageMediaPhoto;
import org.telegram.tgnet.TLRPC$TL_messageMediaUnsupported;
import org.telegram.tgnet.tl.TL_stories$StoryItem;
import org.telegram.tgnet.tl.TL_stories$StoryViews;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.CanvasButton;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.spoilers.SpoilerEffect;
import org.telegram.ui.Components.spoilers.SpoilerEffect2;
import org.telegram.ui.Stories.StoryWidgetsImageDecorator;
public class SharedPhotoVideoCell2 extends FrameLayout {
    static boolean lastAutoDownload;
    static long lastUpdateDownloadSettingsTime;
    ValueAnimator animator;
    private boolean attached;
    public ImageReceiver blurImageReceiver;
    private final RectF bounds;
    CanvasButton canvasButton;
    CheckBoxBase checkBoxBase;
    float checkBoxProgress;
    float crossfadeProgress;
    float crossfadeToColumnsCount;
    SharedPhotoVideoCell2 crossfadeView;
    int currentAccount;
    MessageObject currentMessageObject;
    int currentParentColumnsCount;
    boolean drawVideoIcon;
    boolean drawViews;
    FlickerLoadingView globalGradientView;
    private Drawable gradientDrawable;
    private boolean gradientDrawableLoading;
    float highlightProgress;
    float imageAlpha;
    public ImageReceiver imageReceiver;
    float imageScale;
    public boolean isFirst;
    public boolean isLast;
    public boolean isStory;
    private SpoilerEffect mediaSpoilerEffect;
    private SpoilerEffect2 mediaSpoilerEffect2;
    private Path path;
    SharedResources sharedResources;
    boolean showVideoLayout;
    private float spoilerMaxRadius;
    private float spoilerRevealProgress;
    private float spoilerRevealX;
    private float spoilerRevealY;
    public int storyId;
    private int style;
    StaticLayout videoInfoLayot;
    String videoText;
    AnimatedFloat viewsAlpha;
    AnimatedTextView.AnimatedTextDrawable viewsText;

    public void lambda$setStyle$1() {
    }

    public SharedPhotoVideoCell2(Context context, SharedResources sharedResources, int i) {
        super(context);
        this.imageReceiver = new ImageReceiver();
        this.blurImageReceiver = new ImageReceiver();
        this.imageAlpha = 1.0f;
        this.imageScale = 1.0f;
        this.drawVideoIcon = true;
        this.viewsAlpha = new AnimatedFloat(this, 0L, 350L, CubicBezierInterpolator.EASE_OUT_QUINT);
        this.viewsText = new AnimatedTextView.AnimatedTextDrawable(false, true, true);
        this.path = new Path();
        this.mediaSpoilerEffect = new SpoilerEffect();
        this.style = 0;
        this.bounds = new RectF();
        this.sharedResources = sharedResources;
        this.currentAccount = i;
        setChecked(false, false);
        this.imageReceiver.setParentView(this);
        this.blurImageReceiver.setParentView(this);
        this.imageReceiver.setDelegate(new ImageReceiver.ImageReceiverDelegate() {
            @Override
            public final void didSetImage(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
                SharedPhotoVideoCell2.this.lambda$new$0(imageReceiver, z, z2, z3);
            }

            @Override
            public void onAnimationReady(ImageReceiver imageReceiver) {
                ImageReceiver.ImageReceiverDelegate.CC.$default$onAnimationReady(this, imageReceiver);
            }
        });
        this.viewsText.setCallback(this);
        this.viewsText.setTextSize(AndroidUtilities.dp(12.0f));
        this.viewsText.setTextColor(-1);
        this.viewsText.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        this.viewsText.setOverrideFullWidth(AndroidUtilities.displaySize.x);
        setWillNotDraw(false);
    }

    public void lambda$new$0(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        MessageObject messageObject;
        if (!z || z2 || (messageObject = this.currentMessageObject) == null || !messageObject.hasMediaSpoilers() || this.imageReceiver.getBitmap() == null) {
            return;
        }
        if (this.blurImageReceiver.getBitmap() != null) {
            this.blurImageReceiver.getBitmap().recycle();
        }
        this.blurImageReceiver.setImageBitmap(Utilities.stackBlurBitmapMax(this.imageReceiver.getBitmap()));
    }

    public void setStyle(int i) {
        if (this.style == i) {
            return;
        }
        this.style = i;
        if (i == 1) {
            CheckBoxBase checkBoxBase = new CheckBoxBase(this, 21, null);
            this.checkBoxBase = checkBoxBase;
            checkBoxBase.setColor(-1, Theme.key_sharedMedia_photoPlaceholder, Theme.key_checkboxCheck);
            this.checkBoxBase.setDrawUnchecked(true);
            this.checkBoxBase.setBackgroundType(0);
            this.checkBoxBase.setBounds(0, 0, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
            if (this.attached) {
                this.checkBoxBase.onAttachedToWindow();
            }
            CanvasButton canvasButton = new CanvasButton(this);
            this.canvasButton = canvasButton;
            canvasButton.setDelegate(new Runnable() {
                @Override
                public final void run() {
                    SharedPhotoVideoCell2.this.lambda$setStyle$1();
                }
            });
        }
    }

    public void setMessageObject(MessageObject messageObject, int i) {
        TL_stories$StoryViews tL_stories$StoryViews;
        int i2 = this.currentParentColumnsCount;
        this.currentParentColumnsCount = i;
        MessageObject messageObject2 = this.currentMessageObject;
        if (messageObject2 == null && messageObject == null) {
            return;
        }
        if (messageObject2 == null || messageObject == null || messageObject2.getId() != messageObject.getId() || i2 != i) {
            this.currentMessageObject = messageObject;
            boolean z = true;
            this.isStory = messageObject != null && messageObject.isStory();
            updateSpoilers2();
            if (messageObject == null) {
                this.imageReceiver.onDetachedFromWindow();
                this.blurImageReceiver.onDetachedFromWindow();
                this.videoText = null;
                this.drawViews = false;
                this.viewsAlpha.set(0.0f, true);
                this.viewsText.setText(BuildConfig.APP_CENTER_HASH, false);
                this.videoInfoLayot = null;
                this.showVideoLayout = false;
                this.gradientDrawableLoading = false;
                this.gradientDrawable = null;
                return;
            }
            if (this.attached) {
                this.imageReceiver.onAttachedToWindow();
                this.blurImageReceiver.onAttachedToWindow();
            }
            String restrictionReason = MessagesController.getRestrictionReason(messageObject.messageOwner.restriction_reason);
            String filterString = this.sharedResources.getFilterString((int) ((AndroidUtilities.displaySize.x / i) / AndroidUtilities.density));
            int i3 = 320;
            if (i <= 2) {
                i3 = AndroidUtilities.getPhotoSize();
            }
            this.videoText = null;
            this.videoInfoLayot = null;
            this.showVideoLayout = false;
            this.imageReceiver.clearDecorators();
            if (this.isStory && (tL_stories$StoryViews = messageObject.storyItem.views) != null) {
                int i4 = tL_stories$StoryViews.views_count;
                this.drawViews = i4 > 0;
                this.viewsText.setText(AndroidUtilities.formatWholeNumber(i4, 0), false);
            } else {
                this.drawViews = false;
                this.viewsAlpha.set(0.0f, true);
                this.viewsText.setText(BuildConfig.APP_CENTER_HASH, false);
            }
            this.viewsAlpha.set(this.drawViews ? 1.0f : 0.0f, true);
            if (TextUtils.isEmpty(restrictionReason)) {
                TL_stories$StoryItem tL_stories$StoryItem = messageObject.storyItem;
                if (tL_stories$StoryItem != null && (tL_stories$StoryItem.media instanceof TLRPC$TL_messageMediaUnsupported)) {
                    tL_stories$StoryItem.dialogId = messageObject.getDialogId();
                    Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_emoji_recent).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(1090519039, PorterDuff.Mode.SRC_IN));
                    this.imageReceiver.setImageBitmap(new CombinedDrawable(new ColorDrawable(-13421773), mutate));
                } else if (messageObject.isVideo()) {
                    this.showVideoLayout = true;
                    if (i != 9) {
                        this.videoText = AndroidUtilities.formatShortDuration((int) messageObject.getDuration());
                    }
                    ImageLocation imageLocation = messageObject.mediaThumb;
                    if (imageLocation != null) {
                        BitmapDrawable bitmapDrawable = messageObject.strippedThumb;
                        if (bitmapDrawable != null) {
                            this.imageReceiver.setImage(imageLocation, filterString, bitmapDrawable, null, messageObject, 0);
                        } else {
                            this.imageReceiver.setImage(imageLocation, filterString, messageObject.mediaSmallThumb, filterString + "_b", null, 0L, null, messageObject, 0);
                        }
                    } else {
                        TLRPC$Document document = messageObject.getDocument();
                        TLRPC$PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 50);
                        TLRPC$PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, i3, false, null, this.isStory);
                        if (closestPhotoSizeWithSize == closestPhotoSizeWithSize2 && !this.isStory) {
                            closestPhotoSizeWithSize2 = null;
                        }
                        if (closestPhotoSizeWithSize != null) {
                            if (messageObject.strippedThumb != null) {
                                this.imageReceiver.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize2, document), filterString, messageObject.strippedThumb, null, messageObject, 0);
                            } else {
                                this.imageReceiver.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize2, document), filterString, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), filterString + "_b", null, 0L, null, messageObject, 0);
                            }
                        }
                    }
                } else if ((MessageObject.getMedia(messageObject.messageOwner) instanceof TLRPC$TL_messageMediaPhoto) && MessageObject.getMedia(messageObject.messageOwner).photo != null && !messageObject.photoThumbs.isEmpty()) {
                    if (messageObject.mediaExists || canAutoDownload(messageObject) || this.isStory) {
                        ImageLocation imageLocation2 = messageObject.mediaThumb;
                        if (imageLocation2 != null) {
                            BitmapDrawable bitmapDrawable2 = messageObject.strippedThumb;
                            if (bitmapDrawable2 != null) {
                                this.imageReceiver.setImage(imageLocation2, filterString, bitmapDrawable2, null, messageObject, 0);
                            } else {
                                this.imageReceiver.setImage(imageLocation2, filterString, messageObject.mediaSmallThumb, filterString + "_b", null, 0L, null, messageObject, 0);
                            }
                        } else {
                            TLRPC$PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 50);
                            TLRPC$PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, i3, false, closestPhotoSizeWithSize3, this.isStory);
                            if (closestPhotoSizeWithSize4 == closestPhotoSizeWithSize3) {
                                closestPhotoSizeWithSize3 = null;
                            }
                            if (messageObject.strippedThumb != null) {
                                this.imageReceiver.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize4, messageObject.photoThumbsObject), filterString, null, null, messageObject.strippedThumb, closestPhotoSizeWithSize4 != null ? closestPhotoSizeWithSize4.size : 0L, null, messageObject, messageObject.shouldEncryptPhotoOrVideo() ? 2 : 1);
                            } else {
                                this.imageReceiver.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize4, messageObject.photoThumbsObject), filterString, ImageLocation.getForObject(closestPhotoSizeWithSize3, messageObject.photoThumbsObject), filterString + "_b", closestPhotoSizeWithSize4 != null ? closestPhotoSizeWithSize4.size : 0L, null, messageObject, messageObject.shouldEncryptPhotoOrVideo() ? 2 : 1);
                            }
                        }
                    } else {
                        BitmapDrawable bitmapDrawable3 = messageObject.strippedThumb;
                        if (bitmapDrawable3 != null) {
                            this.imageReceiver.setImage(null, null, null, null, bitmapDrawable3, 0L, null, messageObject, 0);
                        } else {
                            this.imageReceiver.setImage(null, null, ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 50), messageObject.photoThumbsObject), "b", null, 0L, null, messageObject, 0);
                        }
                    }
                }
                z = false;
            }
            if (z) {
                this.imageReceiver.setImageBitmap(ContextCompat.getDrawable(getContext(), R.drawable.photo_placeholder_in));
            }
            if (this.blurImageReceiver.getBitmap() != null) {
                this.blurImageReceiver.getBitmap().recycle();
                this.blurImageReceiver.setImageBitmap((Bitmap) null);
            }
            if (this.imageReceiver.getBitmap() != null && this.currentMessageObject.hasMediaSpoilers() && !this.currentMessageObject.isMediaSpoilersRevealed) {
                this.blurImageReceiver.setImageBitmap(Utilities.stackBlurBitmapMax(this.imageReceiver.getBitmap()));
            }
            TL_stories$StoryItem tL_stories$StoryItem2 = messageObject.storyItem;
            if (tL_stories$StoryItem2 != null) {
                this.imageReceiver.addDecorator(new StoryWidgetsImageDecorator(tL_stories$StoryItem2));
            }
            invalidate();
        }
    }

    private boolean canAutoDownload(MessageObject messageObject) {
        if (System.currentTimeMillis() - lastUpdateDownloadSettingsTime > 5000) {
            lastUpdateDownloadSettingsTime = System.currentTimeMillis();
            lastAutoDownload = DownloadController.getInstance(this.currentAccount).canDownloadMedia(messageObject);
        }
        return lastAutoDownload;
    }

    public void setVideoText(String str, boolean z) {
        StaticLayout staticLayout;
        this.videoText = str;
        boolean z2 = str != null;
        this.showVideoLayout = z2;
        if (z2 && (staticLayout = this.videoInfoLayot) != null && !staticLayout.getText().toString().equals(str)) {
            this.videoInfoLayot = null;
        }
        this.drawVideoIcon = z;
    }

    private float getPadding() {
        float dpf2;
        float dpf22;
        float f;
        if (this.crossfadeProgress != 0.0f) {
            float f2 = this.crossfadeToColumnsCount;
            if (f2 == 9.0f || this.currentParentColumnsCount == 9) {
                if (f2 == 9.0f) {
                    dpf2 = AndroidUtilities.dpf2(0.5f) * this.crossfadeProgress;
                    dpf22 = AndroidUtilities.dpf2(1.0f);
                    f = this.crossfadeProgress;
                } else {
                    dpf2 = AndroidUtilities.dpf2(1.0f) * this.crossfadeProgress;
                    dpf22 = AndroidUtilities.dpf2(0.5f);
                    f = this.crossfadeProgress;
                }
                return dpf2 + (dpf22 * (1.0f - f));
            }
        }
        return this.currentParentColumnsCount == 9 ? AndroidUtilities.dpf2(0.5f) : AndroidUtilities.dpf2(1.0f);
    }

    @Override
    protected void onDraw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.SharedPhotoVideoCell2.onDraw(android.graphics.Canvas):void");
    }

    public void lambda$onDraw$2(int[] iArr) {
        if (this.gradientDrawableLoading) {
            this.gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, iArr);
            invalidate();
            this.gradientDrawableLoading = false;
        }
    }

    public void drawDuration(Canvas canvas, RectF rectF, float f) {
        int dp;
        String str;
        if (this.showVideoLayout) {
            ImageReceiver imageReceiver = this.imageReceiver;
            if (imageReceiver == null || imageReceiver.getVisible()) {
                if (f < 1.0f) {
                    f = (float) Math.pow(f, 8.0d);
                }
                canvas.save();
                canvas.translate(rectF.left, rectF.top);
                canvas.clipRect(0.0f, 0.0f, rectF.width(), rectF.height());
                int i = this.currentParentColumnsCount;
                if (i != 9 && this.videoInfoLayot == null && (str = this.videoText) != null) {
                    this.videoInfoLayot = new StaticLayout(this.videoText, this.sharedResources.textPaint, (int) Math.ceil(this.sharedResources.textPaint.measureText(str)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                } else if ((i >= 9 || this.videoText == null) && this.videoInfoLayot != null) {
                    this.videoInfoLayot = null;
                }
                if (this.videoInfoLayot == null) {
                    dp = AndroidUtilities.dp(8.0f);
                } else {
                    dp = AndroidUtilities.dp(4.0f) + this.videoInfoLayot.getWidth() + AndroidUtilities.dp(4.0f);
                }
                if (this.drawVideoIcon) {
                    dp += AndroidUtilities.dp(10.0f);
                }
                canvas.translate(AndroidUtilities.dp(5.0f), ((AndroidUtilities.dp(1.0f) + rectF.height()) - AndroidUtilities.dp(17.0f)) - AndroidUtilities.dp(4.0f));
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(0.0f, 0.0f, dp, AndroidUtilities.dp(17.0f));
                int alpha = Theme.chat_timeBackgroundPaint.getAlpha();
                Theme.chat_timeBackgroundPaint.setAlpha((int) (alpha * f));
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), Theme.chat_timeBackgroundPaint);
                Theme.chat_timeBackgroundPaint.setAlpha(alpha);
                if (this.drawVideoIcon) {
                    canvas.save();
                    canvas.translate(this.videoInfoLayot == null ? AndroidUtilities.dp(5.0f) : AndroidUtilities.dp(4.0f), (AndroidUtilities.dp(17.0f) - this.sharedResources.playDrawable.getIntrinsicHeight()) / 2.0f);
                    this.sharedResources.playDrawable.setAlpha((int) (this.imageAlpha * 255.0f * f));
                    this.sharedResources.playDrawable.draw(canvas);
                    canvas.restore();
                }
                if (this.videoInfoLayot != null) {
                    canvas.translate(AndroidUtilities.dp((this.drawVideoIcon ? 10 : 0) + 4), (AndroidUtilities.dp(17.0f) - this.videoInfoLayot.getHeight()) / 2.0f);
                    int alpha2 = this.sharedResources.textPaint.getAlpha();
                    this.sharedResources.textPaint.setAlpha((int) (alpha2 * f));
                    this.videoInfoLayot.draw(canvas);
                    this.sharedResources.textPaint.setAlpha(alpha2);
                }
                canvas.restore();
            }
        }
    }

    public void updateViews() {
        MessageObject messageObject;
        TL_stories$StoryItem tL_stories$StoryItem;
        TL_stories$StoryViews tL_stories$StoryViews;
        if (this.isStory && (messageObject = this.currentMessageObject) != null && (tL_stories$StoryItem = messageObject.storyItem) != null && (tL_stories$StoryViews = tL_stories$StoryItem.views) != null) {
            int i = tL_stories$StoryViews.views_count;
            this.drawViews = i > 0;
            this.viewsText.setText(AndroidUtilities.formatWholeNumber(i, 0), true);
            return;
        }
        this.drawViews = false;
        this.viewsText.setText(BuildConfig.APP_CENTER_HASH, false);
    }

    public void drawViews(Canvas canvas, RectF rectF, float f) {
        if (this.isStory) {
            ImageReceiver imageReceiver = this.imageReceiver;
            if ((imageReceiver == null || imageReceiver.getVisible()) && this.currentParentColumnsCount < 5) {
                float f2 = this.viewsAlpha.set(this.drawViews);
                float f3 = f * f2;
                if (f3 < 1.0f) {
                    f3 = (float) Math.pow(f3, 8.0d);
                }
                if (f2 <= 0.0f) {
                    return;
                }
                canvas.save();
                canvas.translate(rectF.left, rectF.top);
                canvas.clipRect(0.0f, 0.0f, rectF.width(), rectF.height());
                float dp = AndroidUtilities.dp(26.0f) + this.viewsText.getCurrentWidth();
                canvas.translate((rectF.width() - AndroidUtilities.dp(5.0f)) - dp, ((AndroidUtilities.dp(1.0f) + rectF.height()) - AndroidUtilities.dp(17.0f)) - AndroidUtilities.dp(4.0f));
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(0.0f, 0.0f, dp, AndroidUtilities.dp(17.0f));
                int alpha = Theme.chat_timeBackgroundPaint.getAlpha();
                Theme.chat_timeBackgroundPaint.setAlpha((int) (alpha * f3));
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), Theme.chat_timeBackgroundPaint);
                Theme.chat_timeBackgroundPaint.setAlpha(alpha);
                canvas.save();
                canvas.translate(AndroidUtilities.dp(3.0f), (AndroidUtilities.dp(17.0f) - this.sharedResources.viewDrawable.getBounds().height()) / 2.0f);
                this.sharedResources.viewDrawable.setAlpha((int) (this.imageAlpha * 255.0f * f3));
                this.sharedResources.viewDrawable.draw(canvas);
                canvas.restore();
                canvas.translate(AndroidUtilities.dp(22.0f), 0.0f);
                this.viewsText.setBounds(0, 0, (int) dp, AndroidUtilities.dp(17.0f));
                this.viewsText.setAlpha((int) (f3 * 255.0f));
                this.viewsText.draw(canvas);
                canvas.restore();
            }
        }
    }

    public boolean canRevealSpoiler() {
        MessageObject messageObject = this.currentMessageObject;
        return messageObject != null && messageObject.hasMediaSpoilers() && this.spoilerRevealProgress == 0.0f && !this.currentMessageObject.isMediaSpoilersRevealedInSharedMedia;
    }

    public void startRevealMedia(float f, float f2) {
        this.spoilerRevealX = f;
        this.spoilerRevealY = f2;
        this.spoilerMaxRadius = (float) Math.sqrt(Math.pow(getWidth(), 2.0d) + Math.pow(getHeight(), 2.0d));
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(MathUtils.clamp(this.spoilerMaxRadius * 0.3f, 250.0f, 550.0f));
        duration.setInterpolator(CubicBezierInterpolator.EASE_BOTH);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SharedPhotoVideoCell2.this.lambda$startRevealMedia$3(valueAnimator);
            }
        });
        duration.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                SharedPhotoVideoCell2 sharedPhotoVideoCell2 = SharedPhotoVideoCell2.this;
                sharedPhotoVideoCell2.currentMessageObject.isMediaSpoilersRevealedInSharedMedia = true;
                sharedPhotoVideoCell2.invalidate();
            }
        });
        duration.start();
    }

    public void lambda$startRevealMedia$3(ValueAnimator valueAnimator) {
        this.spoilerRevealProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.attached = true;
        CheckBoxBase checkBoxBase = this.checkBoxBase;
        if (checkBoxBase != null) {
            checkBoxBase.onAttachedToWindow();
        }
        if (this.currentMessageObject != null) {
            this.imageReceiver.onAttachedToWindow();
            this.blurImageReceiver.onAttachedToWindow();
        }
        SpoilerEffect2 spoilerEffect2 = this.mediaSpoilerEffect2;
        if (spoilerEffect2 != null) {
            if (spoilerEffect2.destroyed) {
                this.mediaSpoilerEffect2 = SpoilerEffect2.getInstance(this);
            } else {
                spoilerEffect2.attach(this);
            }
        }
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attached = false;
        CheckBoxBase checkBoxBase = this.checkBoxBase;
        if (checkBoxBase != null) {
            checkBoxBase.onDetachedFromWindow();
        }
        if (this.currentMessageObject != null) {
            this.imageReceiver.onDetachedFromWindow();
            this.blurImageReceiver.onDetachedFromWindow();
        }
        SpoilerEffect2 spoilerEffect2 = this.mediaSpoilerEffect2;
        if (spoilerEffect2 != null) {
            spoilerEffect2.detach(this);
        }
    }

    public void setGradientView(FlickerLoadingView flickerLoadingView) {
        this.globalGradientView = flickerLoadingView;
    }

    @Override
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        boolean z = this.isStory;
        int i3 = z ? (int) (size * 1.25f) : size;
        if (z && this.currentParentColumnsCount == 1) {
            i3 /= 2;
        }
        setMeasuredDimension(size, i3);
        updateSpoilers2();
    }

    private void updateSpoilers2() {
        if (getMeasuredHeight() <= 0 || getMeasuredWidth() <= 0) {
            return;
        }
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject != null && messageObject.hasMediaSpoilers() && SpoilerEffect2.supports()) {
            if (this.mediaSpoilerEffect2 == null) {
                this.mediaSpoilerEffect2 = SpoilerEffect2.getInstance(this);
                return;
            }
            return;
        }
        SpoilerEffect2 spoilerEffect2 = this.mediaSpoilerEffect2;
        if (spoilerEffect2 != null) {
            spoilerEffect2.detach(this);
            this.mediaSpoilerEffect2 = null;
        }
    }

    public int getMessageId() {
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject != null) {
            return messageObject.getId();
        }
        return 0;
    }

    public MessageObject getMessageObject() {
        return this.currentMessageObject;
    }

    public void setImageAlpha(float f, boolean z) {
        if (this.imageAlpha != f) {
            this.imageAlpha = f;
            if (z) {
                invalidate();
            }
        }
    }

    public void setImageScale(float f, boolean z) {
        if (this.imageScale != f) {
            this.imageScale = f;
            if (z) {
                invalidate();
            }
        }
    }

    public void setCrossfadeView(SharedPhotoVideoCell2 sharedPhotoVideoCell2, float f, int i) {
        this.crossfadeView = sharedPhotoVideoCell2;
        this.crossfadeProgress = f;
        this.crossfadeToColumnsCount = i;
    }

    public void drawCrossafadeImage(Canvas canvas) {
        if (this.crossfadeView != null) {
            canvas.save();
            canvas.translate(getX(), getY());
            this.crossfadeView.setImageScale(((getMeasuredWidth() - AndroidUtilities.dp(2.0f)) * this.imageScale) / (this.crossfadeView.getMeasuredWidth() - AndroidUtilities.dp(2.0f)), false);
            this.crossfadeView.draw(canvas);
            canvas.restore();
        }
    }

    public View getCrossfadeView() {
        return this.crossfadeView;
    }

    public void setChecked(final boolean z, boolean z2) {
        CheckBoxBase checkBoxBase = this.checkBoxBase;
        if ((checkBoxBase != null && checkBoxBase.isChecked()) == z) {
            return;
        }
        if (this.checkBoxBase == null) {
            CheckBoxBase checkBoxBase2 = new CheckBoxBase(this, 21, null);
            this.checkBoxBase = checkBoxBase2;
            checkBoxBase2.setColor(-1, Theme.key_sharedMedia_photoPlaceholder, Theme.key_checkboxCheck);
            this.checkBoxBase.setDrawUnchecked(false);
            this.checkBoxBase.setBackgroundType(1);
            this.checkBoxBase.setBounds(0, 0, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
            if (this.attached) {
                this.checkBoxBase.onAttachedToWindow();
            }
        }
        this.checkBoxBase.setChecked(z, z2);
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            this.animator = null;
            valueAnimator.cancel();
        }
        if (z2) {
            float[] fArr = new float[2];
            fArr[0] = this.checkBoxProgress;
            fArr[1] = z ? 1.0f : 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
            this.animator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    SharedPhotoVideoCell2.this.checkBoxProgress = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    SharedPhotoVideoCell2.this.invalidate();
                }
            });
            this.animator.setDuration(200L);
            this.animator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    ValueAnimator valueAnimator2 = SharedPhotoVideoCell2.this.animator;
                    if (valueAnimator2 == null || !valueAnimator2.equals(animator)) {
                        return;
                    }
                    SharedPhotoVideoCell2 sharedPhotoVideoCell2 = SharedPhotoVideoCell2.this;
                    sharedPhotoVideoCell2.checkBoxProgress = z ? 1.0f : 0.0f;
                    sharedPhotoVideoCell2.animator = null;
                }
            });
            this.animator.start();
        } else {
            this.checkBoxProgress = z ? 1.0f : 0.0f;
        }
        invalidate();
    }

    public void setHighlightProgress(float f) {
        if (this.highlightProgress != f) {
            this.highlightProgress = f;
            invalidate();
        }
    }

    public int getStyle() {
        return this.style;
    }

    public static class SharedResources {
        Drawable playDrawable;
        Drawable viewDrawable;
        TextPaint textPaint = new TextPaint(1);
        private Paint backgroundPaint = new Paint();
        Paint highlightPaint = new Paint();
        SparseArray<String> imageFilters = new SparseArray<>();

        public SharedResources(Context context, Theme.ResourcesProvider resourcesProvider) {
            this.textPaint.setTextSize(AndroidUtilities.dp(12.0f));
            this.textPaint.setColor(-1);
            this.textPaint.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            Drawable drawable = ContextCompat.getDrawable(context, R.drawable.play_mini_video);
            this.playDrawable = drawable;
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.playDrawable.getIntrinsicHeight());
            Drawable drawable2 = ContextCompat.getDrawable(context, R.drawable.filled_views);
            this.viewDrawable = drawable2;
            drawable2.setBounds(0, 0, (int) (drawable2.getIntrinsicWidth() * 0.7f), (int) (this.viewDrawable.getIntrinsicHeight() * 0.7f));
            this.backgroundPaint.setColor(Theme.getColor(Theme.key_sharedMedia_photoPlaceholder, resourcesProvider));
        }

        public String getFilterString(int i) {
            String str = this.imageFilters.get(i);
            if (str == null) {
                String str2 = i + "_" + i + "_isc";
                this.imageFilters.put(i, str2);
                return str2;
            }
            return str;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        CanvasButton canvasButton = this.canvasButton;
        if (canvasButton == null || !canvasButton.checkTouchEvent(motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override
    protected boolean verifyDrawable(Drawable drawable) {
        return this.viewsText == drawable || super.verifyDrawable(drawable);
    }
}
