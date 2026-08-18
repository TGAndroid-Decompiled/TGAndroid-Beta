package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.AvatarSpan;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.CanvasButton;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.Shaker;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Components.spoilers.SpoilerEffect;
import org.telegram.ui.Components.spoilers.SpoilerEffect2;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoryWidgetsImageDecorator;
import org.telegram.ui.Stories.recorder.DominantColors;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;

public class SharedPhotoVideoCell2 extends FrameLayout {
    static boolean lastAutoDownload;
    static long lastUpdateDownloadSettingsTime;
    private final AnimatedFloat animatedProgress;
    private final AnimatedFloat animatedReordering;
    ValueAnimator animator;
    private boolean attached;
    private Text authorText;
    public ImageReceiver blurImageReceiver;
    private final RectF bounds;
    CanvasButton canvasButton;
    private boolean check2;
    CheckBoxBase checkBoxBase;
    float checkBoxProgress;
    private Path clipPath;
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
    public int imageReceiverColor;
    public ImageReceiver imageReceiverFullSize;
    float imageScale;
    public boolean isFirst;
    public boolean isLast;
    public boolean isSearchingHashtag;
    public boolean isStory;
    public boolean isStoryPinned;
    public boolean isStoryUploading;
    public boolean isTop;
    private SpoilerEffect mediaSpoilerEffect;
    private SpoilerEffect2 mediaSpoilerEffect2;
    private Path path;
    private Bitmap privacyBitmap;
    private Paint privacyPaint;
    private int privacyType;
    private final Paint progressPaint;
    private final Path rectPath;
    private boolean reorder;
    private boolean reordering;
    private final Paint scrimPaint;
    private Text sensitiveText;
    private Text sensitiveTextShort;
    private Text sensitiveTextShort2;
    private Shaker shaker;
    SharedResources sharedResources;
    boolean showLivePhoto;
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

    public void setCheck2() {
        this.check2 = true;
    }

    public void setReorder(boolean z) {
        this.reorder = z;
        invalidate();
    }

    public SharedPhotoVideoCell2(Context context, SharedResources sharedResources, int i) {
        super(context);
        this.imageReceiverColor = 0;
        this.imageReceiverFullSize = new ImageReceiver();
        this.imageReceiver = new ImageReceiver();
        this.blurImageReceiver = new ImageReceiver();
        this.imageAlpha = 1.0f;
        this.imageScale = 1.0f;
        this.drawVideoIcon = true;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.viewsAlpha = new AnimatedFloat(this, 0L, 350L, cubicBezierInterpolator);
        this.viewsText = new AnimatedTextView.AnimatedTextDrawable(false, true, true);
        this.path = new Path();
        this.rectPath = new Path();
        this.style = 0;
        this.scrimPaint = new Paint(1);
        this.progressPaint = new Paint(1);
        this.animatedProgress = new AnimatedFloat(this, 0L, 200L, cubicBezierInterpolator);
        this.bounds = new RectF();
        this.animatedReordering = new AnimatedFloat(this, 0L, 320L, cubicBezierInterpolator);
        this.sharedResources = sharedResources;
        this.currentAccount = i;
        setChecked(false, false);
        this.imageReceiver.setParentView(this);
        this.imageReceiverFullSize.setParentView(this);
        this.blurImageReceiver.setParentView(this);
        this.imageReceiver.setDelegate(new ImageReceiver.ImageReceiverDelegate() {
            @Override
            public final void didSetImage(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
                this.f$0.lambda$new$0(imageReceiver, z, z2, z3);
            }

            @Override
            public void didSetImageBitmap(int i2, String str, Drawable drawable) {
                ImageReceiver.ImageReceiverDelegate.CC.$default$didSetImageBitmap(this, i2, str, drawable);
            }

            @Override
            public void onAnimationReady(ImageReceiver imageReceiver) {
                ImageReceiver.ImageReceiverDelegate.CC.$default$onAnimationReady(this, imageReceiver);
            }
        });
        this.viewsText.setCallback(this);
        this.viewsText.setTextSize(AndroidUtilities.dp(12.0f));
        this.viewsText.setTextColor(-1);
        this.viewsText.setTypeface(AndroidUtilities.bold());
        this.viewsText.setOverrideFullWidth(AndroidUtilities.displaySize.x);
        setWillNotDraw(false);
    }

    public void lambda$new$0(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        MessageObject messageObject;
        if (z && !z2 && (messageObject = this.currentMessageObject) != null && messageObject.hasMediaSpoilers() && this.imageReceiver.getBitmap() != null) {
            if (this.blurImageReceiver.getBitmap() != null) {
                this.blurImageReceiver.getBitmap().recycle();
            }
            this.blurImageReceiver.setImageBitmap(Utilities.stackBlurBitmapMax(this.imageReceiver.getBitmap()));
        }
        if (!z || z2 || !this.check2 || this.imageReceiver.getBitmap() == null) {
            return;
        }
        int dominantColor = AndroidUtilities.getDominantColor(this.imageReceiver.getBitmap());
        this.imageReceiverColor = dominantColor;
        CheckBoxBase checkBoxBase = this.checkBoxBase;
        if (checkBoxBase != null) {
            checkBoxBase.setBackgroundColor(Theme.blendOver(dominantColor, Theme.multAlpha(-1, 0.25f)));
        }
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
                    this.f$0.lambda$setStyle$1();
                }
            });
        }
    }

    private TLRPC.MessageMedia getStoryMedia(MessageObject messageObject) {
        TL_stories.StoryItem storyItem;
        if (messageObject == null || (storyItem = messageObject.storyItem) == null) {
            return null;
        }
        return storyItem.media;
    }

    private boolean mediaEqual(TLRPC.MessageMedia messageMedia, TLRPC.MessageMedia messageMedia2) {
        TLRPC.Photo photo;
        if (messageMedia == null && messageMedia2 == null) {
            return true;
        }
        if (messageMedia != null && messageMedia2 != null) {
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                TLRPC.Document document2 = messageMedia2.document;
                return document2 != null && document2.id == document.id;
            }
            TLRPC.Photo photo2 = messageMedia.photo;
            return (photo2 == null || (photo = messageMedia2.photo) == null || photo.id != photo2.id) ? false : true;
        }
        return false;
    }

    private int getPrivacyType(MessageObject messageObject) {
        TL_stories.StoryItem storyItem;
        if (this.isStoryPinned) {
            return 100;
        }
        if (!this.isStory || messageObject == null || (storyItem = messageObject.storyItem) == null) {
            return -1;
        }
        if (storyItem.parsedPrivacy == null) {
            storyItem.parsedPrivacy = new StoryPrivacyBottomSheet.StoryPrivacy(this.currentAccount, storyItem.privacy);
        }
        int i = messageObject.storyItem.parsedPrivacy.type;
        if (i == 2 || i == 1 || i == 3) {
            return i;
        }
        return -1;
    }

    public void setMessageObject(MessageObject messageObject, int i) {
        setMessageObject(messageObject, i, false);
    }

    public void initFullSizeReceiver() {
        setMessageObject(this.currentMessageObject, this.currentParentColumnsCount, true);
    }

    private void setMessageObject(MessageObject messageObject, int i, boolean z) {
        int i2;
        String str;
        TL_stories.StoryItem storyItem;
        int i3;
        float f;
        float f2;
        TL_stories.StoryViews storyViews;
        int i4 = i;
        if (i4 < 1) {
            i4 = 1;
        }
        int i5 = this.currentParentColumnsCount;
        this.currentParentColumnsCount = i4;
        MessageObject messageObject2 = this.currentMessageObject;
        if (messageObject2 == null && messageObject == null) {
            return;
        }
        if (messageObject2 != null && messageObject != null && messageObject2.getId() == messageObject.getId()) {
            MessageObject messageObject3 = this.currentMessageObject;
            if ((messageObject3 != null ? messageObject3.uploadingStory : null) == messageObject.uploadingStory) {
                if ((messageObject3 != null ? messageObject3.parentStoriesList : null) == messageObject.parentStoriesList && mediaEqual(getStoryMedia(messageObject3), getStoryMedia(messageObject)) && i5 == i4) {
                    int i6 = this.privacyType;
                    if ((i6 == 100) == this.isStoryPinned && i6 == getPrivacyType(messageObject) && !z) {
                        return;
                    }
                }
            }
        }
        this.currentMessageObject = messageObject;
        this.isStory = messageObject != null && messageObject.isStory();
        MessageObject messageObject4 = this.currentMessageObject;
        this.isStoryUploading = (messageObject4 == null || messageObject4.uploadingStory == null) ? false : true;
        updateSpoilers2();
        if (messageObject == null) {
            this.imageReceiver.onDetachedFromWindow();
            this.imageReceiverFullSize.onDetachedFromWindow();
            this.blurImageReceiver.onDetachedFromWindow();
            this.videoText = null;
            this.drawViews = false;
            this.viewsAlpha.set(0.0f, true);
            this.viewsText.setText("", false);
            this.videoInfoLayot = null;
            this.showVideoLayout = false;
            this.showLivePhoto = false;
            this.gradientDrawableLoading = false;
            this.gradientDrawable = null;
            this.privacyType = -1;
            this.privacyBitmap = null;
            this.authorText = null;
            updateAccessibilityDescription();
            return;
        }
        if (this.attached) {
            this.imageReceiver.onAttachedToWindow();
            this.imageReceiverFullSize.onAttachedToWindow();
            this.blurImageReceiver.onAttachedToWindow();
        }
        ImageReceiver imageReceiver = z ? this.imageReceiverFullSize : this.imageReceiver;
        String restrictionReason = MessagesController.getInstance(this.currentAccount).getRestrictionReason(messageObject.messageOwner.restriction_reason);
        int i7 = (int) ((AndroidUtilities.displaySize.x / i4) / AndroidUtilities.density);
        if (z) {
            i7 = (((int) (AndroidUtilities.displaySize.x / AndroidUtilities.density)) * 3) / 5;
        }
        String filterString = this.sharedResources.getFilterString(i7);
        int photoSize = (i4 <= 2 || z) ? AndroidUtilities.getPhotoSize() : 320;
        this.videoText = null;
        this.videoInfoLayot = null;
        this.showVideoLayout = false;
        this.showLivePhoto = false;
        this.imageReceiver.clearDecorators();
        this.imageReceiverFullSize.clearDecorators();
        if (this.isStory && (storyViews = messageObject.storyItem.views) != null) {
            int i8 = storyViews.views_count;
            this.drawViews = i8 > 0;
            this.viewsText.setText(AndroidUtilities.formatWholeNumber(i8, 0), false);
        } else {
            this.drawViews = false;
            this.viewsAlpha.set(0.0f, true);
            this.viewsText.setText("", false);
        }
        this.viewsAlpha.set(this.drawViews ? 1.0f : 0.0f, true);
        Object obj = messageObject.parentStoriesList != null ? messageObject.storyItem : messageObject;
        if (TextUtils.isEmpty(restrictionReason)) {
            TL_stories.StoryItem storyItem2 = messageObject.storyItem;
            if (storyItem2 != null && (storyItem2.media instanceof TLRPC.TL_messageMediaUnsupported)) {
                storyItem2.dialogId = messageObject.getDialogId();
                Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.msg_emoji_recent).mutate();
                drawableMutate.setColorFilter(new PorterDuffColorFilter(1090519039, PorterDuff.Mode.SRC_IN));
                imageReceiver.setImageBitmap(new CombinedDrawable(new ColorDrawable(-13421773), drawableMutate));
            } else {
                StoriesController.UploadingStory uploadingStory = messageObject.uploadingStory;
                if (uploadingStory != null && (str = uploadingStory.firstFramePath) != null) {
                    imageReceiver.setImage(ImageLocation.getForPath(str), filterString, null, null, obj, 0);
                } else {
                    i2 = 2;
                    TLRPC.Document document = messageObject.getDocument();
                    TLRPC.Photo photo = messageObject.getPhoto();
                    if (MessageObject.isVideoDocument(document)) {
                        this.showVideoLayout = !messageObject.isLivePhoto();
                        this.showLivePhoto = messageObject.isLivePhoto();
                        if (i4 != 9 && !messageObject.isLivePhoto()) {
                            this.videoText = AndroidUtilities.formatShortDuration((int) messageObject.getDuration());
                        }
                        ImageLocation imageLocation = messageObject.mediaThumb;
                        if (imageLocation != null) {
                            BitmapDrawable bitmapDrawable = messageObject.strippedThumb;
                            if (bitmapDrawable != null) {
                                imageReceiver.setImage(imageLocation, filterString, bitmapDrawable, null, obj, 0);
                            } else {
                                imageReceiver.setImage(imageLocation, filterString, messageObject.mediaSmallThumb, filterString + "_b", null, 0L, null, obj, 0);
                            }
                        } else if (messageObject.hasVideoCover()) {
                            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 50);
                            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, photoSize, false, closestPhotoSizeWithSize, this.isStory);
                            if (closestPhotoSizeWithSize2 == closestPhotoSizeWithSize) {
                                closestPhotoSizeWithSize = null;
                            }
                            if (messageObject.strippedThumb != null) {
                                imageReceiver.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize2, messageObject.photoThumbsObject), filterString, null, null, messageObject.strippedThumb, closestPhotoSizeWithSize2 != null ? closestPhotoSizeWithSize2.size : 0L, null, obj, messageObject.shouldEncryptPhotoOrVideo() ? 2 : 1);
                            } else {
                                imageReceiver.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize2, messageObject.photoThumbsObject), filterString, ImageLocation.getForObject(closestPhotoSizeWithSize, messageObject.photoThumbsObject), filterString + "_b", closestPhotoSizeWithSize2 != null ? closestPhotoSizeWithSize2.size : 0L, null, obj, messageObject.shouldEncryptPhotoOrVideo() ? 2 : 1);
                            }
                        } else {
                            TLRPC.Document document2 = messageObject.getDocument();
                            TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(document2.thumbs, 50);
                            TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(document2.thumbs, photoSize, false, null, this.isStory);
                            if (closestPhotoSizeWithSize3 == closestPhotoSizeWithSize4 && !this.isStory) {
                                closestPhotoSizeWithSize4 = null;
                            }
                            if (closestPhotoSizeWithSize3 != null) {
                                if (messageObject.strippedThumb != null) {
                                    imageReceiver.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize4, document2), filterString, messageObject.strippedThumb, null, obj, 0);
                                } else {
                                    imageReceiver.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize4, document2), filterString, ImageLocation.getForDocument(closestPhotoSizeWithSize3, document2), filterString + "_b", null, 0L, null, obj, 0);
                                }
                            }
                        }
                    } else {
                        i4 = i4;
                        if (photo != null && !messageObject.photoThumbs.isEmpty()) {
                            if (messageObject.mediaExists || canAutoDownload(messageObject) || this.isStory) {
                                ImageLocation imageLocation2 = messageObject.mediaThumb;
                                if (imageLocation2 != null) {
                                    BitmapDrawable bitmapDrawable2 = messageObject.strippedThumb;
                                    if (bitmapDrawable2 != null) {
                                        imageReceiver.setImage(imageLocation2, filterString, bitmapDrawable2, null, obj, 0);
                                    } else {
                                        imageReceiver.setImage(imageLocation2, filterString, messageObject.mediaSmallThumb, filterString + "_b", null, 0L, null, obj, 0);
                                    }
                                } else {
                                    TLRPC.PhotoSize closestPhotoSizeWithSize5 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 50);
                                    TLRPC.PhotoSize closestPhotoSizeWithSize6 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, photoSize, false, closestPhotoSizeWithSize5, this.isStory);
                                    if (closestPhotoSizeWithSize6 == closestPhotoSizeWithSize5) {
                                        closestPhotoSizeWithSize5 = null;
                                    }
                                    if (messageObject.strippedThumb != null) {
                                        imageReceiver.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize6, messageObject.photoThumbsObject), filterString, null, null, messageObject.strippedThumb, closestPhotoSizeWithSize6 != null ? closestPhotoSizeWithSize6.size : 0L, null, obj, messageObject.shouldEncryptPhotoOrVideo() ? 2 : 1);
                                    } else {
                                        imageReceiver.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize6, messageObject.photoThumbsObject), filterString, z ? null : ImageLocation.getForObject(closestPhotoSizeWithSize5, messageObject.photoThumbsObject), filterString + "_b", closestPhotoSizeWithSize6 != null ? closestPhotoSizeWithSize6.size : 0L, null, obj, messageObject.shouldEncryptPhotoOrVideo() ? 2 : 1);
                                    }
                                }
                            } else {
                                BitmapDrawable bitmapDrawable3 = messageObject.strippedThumb;
                                if (bitmapDrawable3 != null) {
                                    imageReceiver.setImage(null, null, null, null, bitmapDrawable3, 0L, null, obj, 0);
                                } else {
                                    imageReceiver.setImage(null, null, ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 50), messageObject.photoThumbsObject), "b", null, 0L, null, obj, 0);
                                }
                            }
                        }
                    }
                }
                if (this.blurImageReceiver.getBitmap() != null) {
                    this.blurImageReceiver.getBitmap().recycle();
                    this.blurImageReceiver.setImageBitmap((Bitmap) null);
                }
                if (imageReceiver.getBitmap() != null && this.currentMessageObject.hasMediaSpoilers() && !this.currentMessageObject.isMediaSpoilersRevealed) {
                    this.blurImageReceiver.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver.getBitmap()));
                }
                storyItem = messageObject.storyItem;
                if (storyItem != null) {
                    imageReceiver.addDecorator(new StoryWidgetsImageDecorator(storyItem));
                }
                setPrivacyType(getPrivacyType(messageObject));
                if (this.isSearchingHashtag) {
                    long dialogId = messageObject.getDialogId();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                    spannableStringBuilder.append((CharSequence) MessagesController.getInstance(this.currentAccount).getPeerName(dialogId));
                    int i9 = this.currentAccount;
                    i3 = i4;
                    if (i3 == i2) {
                        f = 16.0f;
                    } else {
                        f = 13.66f;
                    }
                    AvatarSpan avatarSpan = new AvatarSpan(this, i9, f);
                    avatarSpan.setDialogId(dialogId);
                    spannableStringBuilder.setSpan(avatarSpan, 0, 1, 33);
                    if (i3 == i2) {
                        f2 = 14.0f;
                    } else {
                        f2 = 10.1666f;
                    }
                    this.authorText = new Text(spannableStringBuilder, f2, AndroidUtilities.bold());
                }
                updateAccessibilityDescription();
                invalidate();
            }
            i4 = i4;
            i2 = 2;
            if (this.blurImageReceiver.getBitmap() != null) {
                this.blurImageReceiver.getBitmap().recycle();
                this.blurImageReceiver.setImageBitmap((Bitmap) null);
            }
            if (imageReceiver.getBitmap() != null) {
                this.blurImageReceiver.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver.getBitmap()));
            }
            storyItem = messageObject.storyItem;
            if (storyItem != null) {
                imageReceiver.addDecorator(new StoryWidgetsImageDecorator(storyItem));
            }
            setPrivacyType(getPrivacyType(messageObject));
            if (this.isSearchingHashtag) {
                long dialogId2 = messageObject.getDialogId();
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x ");
                spannableStringBuilder2.append((CharSequence) MessagesController.getInstance(this.currentAccount).getPeerName(dialogId2));
                int i10 = this.currentAccount;
                i3 = i4;
                if (i3 == i2) {
                    f = 16.0f;
                } else {
                    f = 13.66f;
                }
                AvatarSpan avatarSpan2 = new AvatarSpan(this, i10, f);
                avatarSpan2.setDialogId(dialogId2);
                spannableStringBuilder2.setSpan(avatarSpan2, 0, 1, 33);
                if (i3 == i2) {
                    f2 = 14.0f;
                } else {
                    f2 = 10.1666f;
                }
                this.authorText = new Text(spannableStringBuilder2, f2, AndroidUtilities.bold());
            }
            updateAccessibilityDescription();
            invalidate();
        }
        i4 = i4;
        i2 = 2;
        imageReceiver.setImageBitmap(ContextCompat.getDrawable(getContext(), R.drawable.photo_placeholder_in));
        if (this.blurImageReceiver.getBitmap() != null) {
            this.blurImageReceiver.getBitmap().recycle();
            this.blurImageReceiver.setImageBitmap((Bitmap) null);
        }
        if (imageReceiver.getBitmap() != null) {
            this.blurImageReceiver.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver.getBitmap()));
        }
        storyItem = messageObject.storyItem;
        if (storyItem != null) {
            imageReceiver.addDecorator(new StoryWidgetsImageDecorator(storyItem));
        }
        setPrivacyType(getPrivacyType(messageObject));
        if (this.isSearchingHashtag) {
            long dialogId3 = messageObject.getDialogId();
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("x ");
            spannableStringBuilder3.append((CharSequence) MessagesController.getInstance(this.currentAccount).getPeerName(dialogId3));
            int i11 = this.currentAccount;
            i3 = i4;
            if (i3 == i2) {
                f = 16.0f;
            } else {
                f = 13.66f;
            }
            AvatarSpan avatarSpan3 = new AvatarSpan(this, i11, f);
            avatarSpan3.setDialogId(dialogId3);
            spannableStringBuilder3.setSpan(avatarSpan3, 0, 1, 33);
            if (i3 == i2) {
                f2 = 14.0f;
            } else {
                f2 = 10.1666f;
            }
            this.authorText = new Text(spannableStringBuilder3, f2, AndroidUtilities.bold());
        }
        updateAccessibilityDescription();
        invalidate();
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        try {
            if (this.currentMessageObject != null) {
                accessibilityNodeInfo.setEnabled(true);
                accessibilityNodeInfo.setClickable(true);
                accessibilityNodeInfo.addAction(16);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    private void updateAccessibilityDescription() {
        String string;
        double duration;
        int i;
        TL_stories.StoryItem storyItem;
        TL_stories.StoryViews storyViews;
        try {
            MessageObject messageObject = this.currentMessageObject;
            if (messageObject == null) {
                setContentDescription(null);
                return;
            }
            boolean zIsStory = messageObject.isStory();
            StringBuilder sb = new StringBuilder();
            if (zIsStory && this.isStoryPinned) {
                sb.append(LocaleController.getString(R.string.AccDescrStoryPinned));
            }
            if (messageObject.isLivePhoto()) {
                string = LocaleController.getString(R.string.AccDescrLivePhoto);
            } else {
                if (messageObject.isRoundVideo()) {
                    string = LocaleController.getString(R.string.AccDescrRoundVideo);
                    duration = messageObject.getDuration();
                } else {
                    if (!messageObject.isVideo() && !messageObject.isVideoStory()) {
                        string = LocaleController.getString(R.string.AttachPhoto);
                    }
                    string = LocaleController.getString(R.string.AttachVideo);
                    duration = messageObject.getDuration();
                }
                i = (int) duration;
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(string);
                if (i > 0) {
                    sb.append(", ");
                    sb.append(LocaleController.formatDuration(i));
                }
                if (zIsStory && (storyItem = messageObject.storyItem) != null) {
                    storyViews = storyItem.views;
                    if (storyViews != null && storyViews.views_count > 0) {
                        sb.append(", ");
                        sb.append(LocaleController.formatPluralString("Views", messageObject.storyItem.views.views_count, new Object[0]));
                    }
                    if (messageObject.storyItem.date > 0) {
                        sb.append(", ");
                        sb.append(LocaleController.formatString(R.string.AccDescrPostedDate, LocaleController.formatDateAudio(messageObject.storyItem.date, false)));
                    }
                }
                setContentDescription(sb.toString());
            }
            i = 0;
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(string);
            if (i > 0) {
                sb.append(", ");
                sb.append(LocaleController.formatDuration(i));
            }
            if (zIsStory) {
                storyViews = storyItem.views;
                if (storyViews != null) {
                    sb.append(", ");
                    sb.append(LocaleController.formatPluralString("Views", messageObject.storyItem.views.views_count, new Object[0]));
                }
                if (messageObject.storyItem.date > 0) {
                    sb.append(", ");
                    sb.append(LocaleController.formatString(R.string.AccDescrPostedDate, LocaleController.formatDateAudio(messageObject.storyItem.date, false)));
                }
            }
            setContentDescription(sb.toString());
        } catch (Exception e) {
            FileLog.e(e);
            try {
                setContentDescription(null);
            } catch (Exception unused) {
            }
        }
    }

    private void setPrivacyType(int i) {
        int i2;
        if (this.privacyType == i) {
            return;
        }
        this.privacyType = i;
        this.privacyBitmap = null;
        if (i == 1) {
            i2 = R.drawable.msg_stories_closefriends;
        } else if (i == 2) {
            i2 = R.drawable.msg_folders_private;
        } else if (i != 3) {
            i2 = i != 100 ? 0 : R.drawable.msg_pin_mini;
        } else {
            i2 = R.drawable.msg_folders_groups;
        }
        if (i2 != 0) {
            this.privacyBitmap = this.sharedResources.getPrivacyBitmap(getContext(), i2);
        }
        invalidate();
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
        this.showLivePhoto = false;
        if (z2 && (staticLayout = this.videoInfoLayot) != null && !staticLayout.getText().toString().equals(str)) {
            this.videoInfoLayot = null;
        }
        this.drawVideoIcon = z;
    }

    private float getPadding() {
        float fDpf2;
        float fDpf3;
        float f;
        if (this.crossfadeProgress != 0.0f) {
            float f2 = this.crossfadeToColumnsCount;
            if (f2 == 9.0f || this.currentParentColumnsCount == 9) {
                if (f2 == 9.0f) {
                    fDpf2 = AndroidUtilities.dpf2(1.0f) * this.crossfadeProgress;
                    fDpf3 = AndroidUtilities.dpf2(2.0f);
                    f = this.crossfadeProgress;
                } else {
                    fDpf2 = AndroidUtilities.dpf2(2.0f) * this.crossfadeProgress;
                    fDpf3 = AndroidUtilities.dpf2(1.0f);
                    f = this.crossfadeProgress;
                }
                return fDpf2 + (fDpf3 * (1.0f - f));
            }
        }
        return this.currentParentColumnsCount == 9 ? AndroidUtilities.dpf2(1.0f) : AndroidUtilities.dpf2(2.0f);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawImpl(canvas, false, 1.0f, 1.0f, 1.0f);
    }

    private void drawImpl(Canvas canvas, boolean z, float f, float f2, float f3) {
        float f4;
        float f5;
        float f6;
        int i;
        int iDp;
        float f7;
        int iDp2;
        int i2;
        CheckBoxBase checkBoxBase;
        float fDp;
        float fDp2;
        Drawable drawable;
        MessageObject messageObject;
        float progress;
        MessageObject messageObject2;
        float f8;
        int i3;
        FlickerLoadingView flickerLoadingView;
        float padding = getPadding() * f;
        float f9 = this.isFirst ? padding : 0.0f;
        float f10 = this.animatedReordering.set(this.reordering);
        float measuredWidth = ((getMeasuredWidth() - f9) - padding) * this.imageScale;
        float measuredHeight = ((getMeasuredHeight() - 0.0f) - padding) * this.imageScale;
        ImageReceiver imageReceiver = z ? this.imageReceiverFullSize : this.imageReceiver;
        imageReceiver.setAlpha(f2);
        if (this.crossfadeProgress > 0.5f && this.crossfadeToColumnsCount != 9.0f && this.currentParentColumnsCount != 9) {
            float f11 = f * 2.0f;
            measuredWidth -= f11;
            measuredHeight -= f11;
        }
        float f12 = measuredWidth;
        float f13 = measuredHeight;
        if ((this.currentMessageObject != null || this.style == 1) && imageReceiver.hasBitmapImage() && imageReceiver.getCurrentAlpha() == 1.0f && this.imageAlpha == 1.0f) {
            f13 = f13;
            f4 = 1.0f;
        } else {
            if (getParent() == null || (flickerLoadingView = this.globalGradientView) == null) {
                f4 = 1.0f;
            } else {
                flickerLoadingView.setParentSize(((View) getParent()).getMeasuredWidth(), getMeasuredHeight(), -getX());
                this.globalGradientView.updateColors();
                this.globalGradientView.updateGradient();
                float f14 = (this.crossfadeProgress <= 0.5f || this.crossfadeToColumnsCount == 9.0f || this.currentParentColumnsCount == 9) ? 0.0f : 1.0f;
                float f15 = f9 + f14;
                float f16 = padding + f14;
                f4 = 1.0f;
                canvas.drawRect(f15, f16, f15 + f12, f16 + f13, this.globalGradientView.getPaint());
            }
            invalidate();
        }
        float f17 = this.imageAlpha;
        if (f17 != f4) {
            float f18 = f13;
            f5 = f18;
            canvas.saveLayerAlpha(0.0f, 0.0f, f9 + padding + f12, padding + 0.0f + f18, (int) (f17 * 255.0f), 31);
        } else {
            f5 = f13;
            canvas.save();
        }
        CheckBoxBase checkBoxBase2 = this.checkBoxBase;
        if (((checkBoxBase2 != null && checkBoxBase2.isChecked()) || PhotoViewer.isShowingImage(this.currentMessageObject)) && !this.check2) {
            canvas.drawRect(f9, 0.0f, (f9 + f12) - padding, (f5 + 0.0f) - padding, this.sharedResources.backgroundPaint);
        }
        if (this.isStory) {
            i = 1;
            if (this.currentParentColumnsCount == 1) {
                float height = getHeight() * 0.72f;
                Drawable drawable2 = this.gradientDrawable;
                if (drawable2 == null) {
                    if (!this.gradientDrawableLoading && imageReceiver.getBitmap() != null) {
                        this.gradientDrawableLoading = true;
                        DominantColors.getColors(false, imageReceiver.getBitmap(), Theme.isCurrentThemeDark(), new Utilities.Callback() {
                            @Override
                            public final void run(Object obj) {
                                this.f$0.lambda$drawImpl$2((int[]) obj);
                            }
                        });
                    }
                } else {
                    drawable2.setBounds(0, 0, getWidth(), getHeight());
                    this.gradientDrawable.draw(canvas);
                }
                imageReceiver.setImageCoords((f12 - height) / 2.0f, 0.0f, height, getHeight());
            } else {
                f6 = 0.0f;
            }
            if (this.isFirst || !this.isTop) {
                iDp = AndroidUtilities.dp(1.0f);
            } else {
                iDp = AndroidUtilities.dp(18.0f);
            }
            int iLerp = AndroidUtilities.lerp(iDp, AndroidUtilities.dp(8.0f), this.checkBoxProgress);
            if (this.isLast || !this.isTop) {
                f7 = 1.0f;
                iDp2 = AndroidUtilities.dp(1.0f);
            } else {
                iDp2 = AndroidUtilities.dp(18.0f);
                f7 = 1.0f;
            }
            imageReceiver.setRoundRadius(iLerp, AndroidUtilities.lerp(iDp2, AndroidUtilities.dp(8.0f), this.checkBoxProgress), AndroidUtilities.lerp(AndroidUtilities.dp(f7), AndroidUtilities.dp(8.0f), this.checkBoxProgress), AndroidUtilities.lerp(AndroidUtilities.dp(f7), AndroidUtilities.dp(8.0f), this.checkBoxProgress));
            if (this.check2) {
                canvas.save();
                if (!this.reorder || this.reordering) {
                    canvas.translate(imageReceiver.getCenterX(), imageReceiver.getCenterY());
                    if (this.shaker == null) {
                        this.shaker = new Shaker(this);
                    }
                    this.shaker.concat(canvas, Math.max(this.checkBoxProgress, f10));
                    float f19 = 1.0f - (f10 * 0.075f);
                    canvas.scale(f19, f19);
                    canvas.translate(-imageReceiver.getCenterX(), -imageReceiver.getCenterY());
                }
            }
            if (PhotoViewer.isShowingImage(this.currentMessageObject)) {
                f12 = f12;
                f10 = f10;
                i2 = -1;
            } else {
                imageReceiver.draw(canvas);
                messageObject2 = this.currentMessageObject;
                if (messageObject2 == null && messageObject2.hasMediaSpoilers() && !this.currentMessageObject.isMediaSpoilersRevealedInSharedMedia) {
                    canvas.save();
                    canvas.clipRect(f9, 0.0f, (f9 + f12) - padding, (f5 + 0.0f) - padding);
                    if (this.spoilerRevealProgress != 0.0f) {
                        this.path.rewind();
                        this.path.addCircle(this.spoilerRevealX, this.spoilerRevealY, this.spoilerMaxRadius * this.spoilerRevealProgress, Path.Direction.CW);
                        canvas.clipPath(this.path, Region.Op.DIFFERENCE);
                    }
                    this.blurImageReceiver.draw(canvas);
                    if (this.mediaSpoilerEffect2 != null) {
                        canvas.clipRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
                        this.mediaSpoilerEffect2.draw(canvas, this, (int) imageReceiver.getImageWidth(), (int) imageReceiver.getImageHeight());
                    } else {
                        if (this.mediaSpoilerEffect == null) {
                            this.mediaSpoilerEffect = new SpoilerEffect();
                        }
                        this.mediaSpoilerEffect.setColor(ColorUtils.setAlphaComponent(-1, (int) (Color.alpha(-1) * 0.325f)));
                        this.mediaSpoilerEffect.setBounds((int) imageReceiver.getImageX(), (int) imageReceiver.getImageY(), (int) imageReceiver.getImageX2(), (int) imageReceiver.getImageY2());
                        this.mediaSpoilerEffect.draw(canvas);
                    }
                    canvas.restore();
                    if (this.currentMessageObject.isSensitive()) {
                        if (this.sensitiveText == null) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x " + LocaleController.getString(R.string.MessageSensitiveContent));
                            spannableStringBuilder.setSpan(new ColoredImageSpan(R.drawable.filled_sensitive), 0, i, 33);
                            this.sensitiveText = new Text(spannableStringBuilder, 14.0f, AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
                        }
                        Text text = this.sensitiveText;
                        int i4 = 13;
                        if (f12 < (AndroidUtilities.dp(13) * 2) + text.getCurrentWidth()) {
                            if (this.sensitiveTextShort == null) {
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x " + LocaleController.getString(R.string.MessageSensitiveContentShort));
                                spannableStringBuilder2.setSpan(new ColoredImageSpan(R.drawable.filled_sensitive), 0, i, 33);
                                this.sensitiveTextShort = new Text(spannableStringBuilder2, 14.0f, AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
                            }
                            text = this.sensitiveTextShort;
                        }
                        if (f12 < (AndroidUtilities.dp(26) * 2) + text.getCurrentWidth()) {
                            if (this.sensitiveTextShort2 == null) {
                                this.sensitiveTextShort2 = new Text(new SpannableStringBuilder(LocaleController.getString(R.string.MessageSensitiveContentShort)), 13.0f, AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
                            }
                            text = this.sensitiveTextShort2;
                            i4 = 10;
                            i3 = 28;
                        } else {
                            i3 = 32;
                        }
                        float imageX = imageReceiver.getImageX() + (imageReceiver.getImageWidth() / 2.0f);
                        float imageY = imageReceiver.getImageY() + (imageReceiver.getImageHeight() / 2.0f);
                        float currentWidth = text.getCurrentWidth() + AndroidUtilities.dp(i4 + i4);
                        float fDp3 = AndroidUtilities.dp(i3) / 2.0f;
                        float fLerp = AndroidUtilities.lerp(0.8f, 1.0f, 1.0f - this.spoilerRevealProgress);
                        RectF rectF = AndroidUtilities.rectTmp;
                        float f20 = currentWidth / 2.0f;
                        float f21 = f20 * fLerp;
                        float f22 = fDp3 * fLerp;
                        rectF.set(imageX - f21, imageY - f22, f21 + imageX, imageY + f22);
                        this.rectPath.reset();
                        this.rectPath.addRoundRect(rectF, fDp3, fDp3, Path.Direction.CW);
                        canvas.save();
                        canvas.clipPath(this.rectPath);
                        float alpha = this.blurImageReceiver.getAlpha();
                        this.blurImageReceiver.setAlpha((1.0f - this.spoilerRevealProgress) * alpha);
                        this.blurImageReceiver.draw(canvas);
                        this.blurImageReceiver.setAlpha(alpha);
                        canvas.restore();
                        Paint themePaint = Theme.getThemePaint("paintChatTimeBackground");
                        int alpha2 = themePaint.getAlpha();
                        themePaint.setAlpha((int) (alpha2 * (1.0f - this.spoilerRevealProgress) * 0.35f));
                        canvas.drawRoundRect(rectF, fDp3, fDp3, themePaint);
                        themePaint.setAlpha(alpha2);
                        canvas.save();
                        canvas.scale(fLerp, fLerp, imageX, imageY);
                        i2 = -1;
                        text.draw(canvas, (imageX - f20) + AndroidUtilities.dp(i4), imageY, -1, 1.0f - this.spoilerRevealProgress);
                        canvas.restore();
                    } else {
                        i2 = -1;
                    }
                    invalidate();
                } else {
                    f12 = f12;
                    f10 = f10;
                    i2 = -1;
                }
                if (!this.isSearchingHashtag) {
                    f8 = this.highlightProgress;
                    if (f8 > 0.0f) {
                        this.sharedResources.highlightPaint.setColor(ColorUtils.setAlphaComponent(-16777216, (int) (f8 * 0.5f * 255.0f)));
                        canvas.drawRect(imageReceiver.getDrawRegion(), this.sharedResources.highlightPaint);
                    }
                }
            }
            if (this.isStoryUploading) {
                this.scrimPaint.setColor(805306368);
                canvas.drawRect(imageReceiver.getDrawRegion(), this.scrimPaint);
                this.progressPaint.setStyle(Paint.Style.STROKE);
                this.progressPaint.setColor(i2);
                this.progressPaint.setStrokeWidth(AndroidUtilities.dp(3.0f));
                this.progressPaint.setStrokeJoin(Paint.Join.ROUND);
                this.progressPaint.setStrokeCap(Paint.Cap.ROUND);
                float fDp4 = AndroidUtilities.dp(18.0f);
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(imageReceiver.getCenterX() - fDp4, imageReceiver.getCenterY() - fDp4, imageReceiver.getCenterX() + fDp4, imageReceiver.getCenterY() + fDp4);
                float fCurrentTimeMillis = ((System.currentTimeMillis() % 1500) / 1500.0f) * 360.0f;
                AnimatedFloat animatedFloat = this.animatedProgress;
                messageObject = this.currentMessageObject;
                if (messageObject != null) {
                    progress = messageObject.getProgress();
                } else {
                    progress = 0.0f;
                }
                canvas.drawArc(rectF2, fCurrentTimeMillis, animatedFloat.set(AndroidUtilities.lerp(0.15f, 0.95f, progress)) * 360.0f, false, this.progressPaint);
                invalidate();
            }
            this.bounds.set(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
            if (this.showLivePhoto && (drawable = Theme.chat_livePhoto) != null) {
                drawable.setBounds((int) (this.bounds.left + AndroidUtilities.dp(8.0f)), (int) (this.bounds.top + AndroidUtilities.dp(8.0f)), (int) (this.bounds.left + AndroidUtilities.dp(8.0f) + (Theme.chat_livePhoto.getIntrinsicWidth() * 0.75f)), (int) (this.bounds.top + AndroidUtilities.dp(8.0f) + (Theme.chat_livePhoto.getIntrinsicHeight() * 0.75f)));
                Theme.chat_livePhoto.draw(canvas);
            }
            drawDuration(canvas, this.bounds, f3);
            drawViews(canvas, this.bounds, f3);
            if (!this.isSearchingHashtag) {
                drawPrivacy(canvas, this.bounds, f3);
            } else {
                drawAuthor(canvas, this.bounds, f3);
            }
            if (this.check2) {
                canvas.restore();
            }
            checkBoxBase = this.checkBoxBase;
            if (checkBoxBase != null && (this.style == 1 || checkBoxBase.getProgress() != 0.0f)) {
                canvas.save();
                if (this.check2 && (this.reorder || this.reordering)) {
                    canvas.translate(imageReceiver.getCenterX(), imageReceiver.getCenterY());
                    if (this.shaker == null) {
                        this.shaker = new Shaker(this);
                    }
                    float f23 = f10;
                    this.shaker.concat(canvas, Math.max(this.checkBoxProgress, f23) * 0.5f);
                    float f24 = 1.0f - (f23 * 0.075f);
                    canvas.scale(f24, f24);
                    canvas.translate(-imageReceiver.getCenterX(), -imageReceiver.getCenterY());
                }
                if (this.style == 1) {
                    fDp = ((f12 + AndroidUtilities.dp(2.0f)) - AndroidUtilities.dp(25.0f)) - AndroidUtilities.dp(4.0f);
                    fDp2 = AndroidUtilities.dp(4.0f);
                } else if (this.check2) {
                    fDp = (f12 + AndroidUtilities.dp(2.0f)) - AndroidUtilities.dp((this.checkBoxProgress * 5.0f) + 22.0f);
                    fDp2 = AndroidUtilities.dp(-2.0f) + (AndroidUtilities.dp(5.0f) * this.checkBoxProgress);
                } else {
                    fDp = (f12 + AndroidUtilities.dp(2.0f)) - AndroidUtilities.dp(25.0f);
                    fDp2 = 0.0f;
                }
                canvas.translate(fDp, fDp2);
                this.checkBoxBase.draw(canvas);
                if (this.canvasButton != null) {
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    rectF3.set(fDp, fDp2, this.checkBoxBase.bounds.width() + fDp, this.checkBoxBase.bounds.height() + fDp2);
                    this.canvasButton.setRect(rectF3);
                }
                canvas.restore();
            }
            canvas.restore();
        }
        f6 = 0.0f;
        i = 1;
        if (this.checkBoxProgress > f6) {
            float fDp5 = AndroidUtilities.dp(this.check2 ? 7.0f : 10.0f) * this.checkBoxProgress;
            float f25 = f9 + fDp5;
            float f26 = padding + fDp5;
            float f27 = fDp5 * 2.0f;
            float f28 = f12 - f27;
            float f29 = f5 - f27;
            imageReceiver.setImageCoords(f25, f26, f28, f29);
            this.blurImageReceiver.setImageCoords(f25, f26, f28, f29);
        } else {
            float f30 = (this.crossfadeProgress <= 0.5f || this.crossfadeToColumnsCount == 9.0f || this.currentParentColumnsCount == 9) ? 0.0f : 1.0f;
            float f31 = f9 + f30;
            float f32 = f30 + padding;
            imageReceiver.setImageCoords(f31, f32, f12, f5);
            this.blurImageReceiver.setImageCoords(f31, f32, f12, f5);
        }
        if (this.isFirst) {
            iDp = AndroidUtilities.dp(1.0f);
        } else {
            iDp = AndroidUtilities.dp(1.0f);
        }
        int iLerp2 = AndroidUtilities.lerp(iDp, AndroidUtilities.dp(8.0f), this.checkBoxProgress);
        if (this.isLast) {
            f7 = 1.0f;
            iDp2 = AndroidUtilities.dp(1.0f);
        } else {
            f7 = 1.0f;
            iDp2 = AndroidUtilities.dp(1.0f);
        }
        imageReceiver.setRoundRadius(iLerp2, AndroidUtilities.lerp(iDp2, AndroidUtilities.dp(8.0f), this.checkBoxProgress), AndroidUtilities.lerp(AndroidUtilities.dp(f7), AndroidUtilities.dp(8.0f), this.checkBoxProgress), AndroidUtilities.lerp(AndroidUtilities.dp(f7), AndroidUtilities.dp(8.0f), this.checkBoxProgress));
        if (this.check2) {
            canvas.save();
            if (!this.reorder) {
                canvas.translate(imageReceiver.getCenterX(), imageReceiver.getCenterY());
                if (this.shaker == null) {
                    this.shaker = new Shaker(this);
                }
                this.shaker.concat(canvas, Math.max(this.checkBoxProgress, f10));
                float f110 = 1.0f - (f10 * 0.075f);
                canvas.scale(f110, f110);
                canvas.translate(-imageReceiver.getCenterX(), -imageReceiver.getCenterY());
            } else {
                canvas.translate(imageReceiver.getCenterX(), imageReceiver.getCenterY());
                if (this.shaker == null) {
                    this.shaker = new Shaker(this);
                }
                this.shaker.concat(canvas, Math.max(this.checkBoxProgress, f10));
                float f111 = 1.0f - (f10 * 0.075f);
                canvas.scale(f111, f111);
                canvas.translate(-imageReceiver.getCenterX(), -imageReceiver.getCenterY());
            }
        }
        if (PhotoViewer.isShowingImage(this.currentMessageObject)) {
            imageReceiver.draw(canvas);
            messageObject2 = this.currentMessageObject;
            if (messageObject2 == null) {
                f12 = f12;
                f10 = f10;
                i2 = -1;
            } else {
                f12 = f12;
                f10 = f10;
                i2 = -1;
            }
            if (!this.isSearchingHashtag) {
                f8 = this.highlightProgress;
                if (f8 > 0.0f) {
                    this.sharedResources.highlightPaint.setColor(ColorUtils.setAlphaComponent(-16777216, (int) (f8 * 0.5f * 255.0f)));
                    canvas.drawRect(imageReceiver.getDrawRegion(), this.sharedResources.highlightPaint);
                }
            }
        } else {
            f12 = f12;
            f10 = f10;
            i2 = -1;
        }
        if (this.isStoryUploading) {
            this.scrimPaint.setColor(805306368);
            canvas.drawRect(imageReceiver.getDrawRegion(), this.scrimPaint);
            this.progressPaint.setStyle(Paint.Style.STROKE);
            this.progressPaint.setColor(i2);
            this.progressPaint.setStrokeWidth(AndroidUtilities.dp(3.0f));
            this.progressPaint.setStrokeJoin(Paint.Join.ROUND);
            this.progressPaint.setStrokeCap(Paint.Cap.ROUND);
            float fDp6 = AndroidUtilities.dp(18.0f);
            RectF rectF4 = AndroidUtilities.rectTmp;
            rectF4.set(imageReceiver.getCenterX() - fDp6, imageReceiver.getCenterY() - fDp6, imageReceiver.getCenterX() + fDp6, imageReceiver.getCenterY() + fDp6);
            float fCurrentTimeMillis2 = ((System.currentTimeMillis() % 1500) / 1500.0f) * 360.0f;
            AnimatedFloat animatedFloat2 = this.animatedProgress;
            messageObject = this.currentMessageObject;
            if (messageObject != null) {
                progress = messageObject.getProgress();
            } else {
                progress = 0.0f;
            }
            canvas.drawArc(rectF4, fCurrentTimeMillis2, animatedFloat2.set(AndroidUtilities.lerp(0.15f, 0.95f, progress)) * 360.0f, false, this.progressPaint);
            invalidate();
        }
        this.bounds.set(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        if (this.showLivePhoto) {
            drawable.setBounds((int) (this.bounds.left + AndroidUtilities.dp(8.0f)), (int) (this.bounds.top + AndroidUtilities.dp(8.0f)), (int) (this.bounds.left + AndroidUtilities.dp(8.0f) + (Theme.chat_livePhoto.getIntrinsicWidth() * 0.75f)), (int) (this.bounds.top + AndroidUtilities.dp(8.0f) + (Theme.chat_livePhoto.getIntrinsicHeight() * 0.75f)));
            Theme.chat_livePhoto.draw(canvas);
        }
        drawDuration(canvas, this.bounds, f3);
        drawViews(canvas, this.bounds, f3);
        if (!this.isSearchingHashtag) {
            drawPrivacy(canvas, this.bounds, f3);
        } else {
            drawAuthor(canvas, this.bounds, f3);
        }
        if (this.check2) {
            canvas.restore();
        }
        checkBoxBase = this.checkBoxBase;
        if (checkBoxBase != null) {
            canvas.save();
            if (this.check2) {
                canvas.translate(imageReceiver.getCenterX(), imageReceiver.getCenterY());
                if (this.shaker == null) {
                    this.shaker = new Shaker(this);
                }
                float f210 = f10;
                this.shaker.concat(canvas, Math.max(this.checkBoxProgress, f210) * 0.5f);
                float f211 = 1.0f - (f210 * 0.075f);
                canvas.scale(f211, f211);
                canvas.translate(-imageReceiver.getCenterX(), -imageReceiver.getCenterY());
            }
            if (this.style == 1) {
                fDp = ((f12 + AndroidUtilities.dp(2.0f)) - AndroidUtilities.dp(25.0f)) - AndroidUtilities.dp(4.0f);
                fDp2 = AndroidUtilities.dp(4.0f);
            } else if (this.check2) {
                fDp = (f12 + AndroidUtilities.dp(2.0f)) - AndroidUtilities.dp((this.checkBoxProgress * 5.0f) + 22.0f);
                fDp2 = AndroidUtilities.dp(-2.0f) + (AndroidUtilities.dp(5.0f) * this.checkBoxProgress);
            } else {
                fDp = (f12 + AndroidUtilities.dp(2.0f)) - AndroidUtilities.dp(25.0f);
                fDp2 = 0.0f;
            }
            canvas.translate(fDp, fDp2);
            this.checkBoxBase.draw(canvas);
            if (this.canvasButton != null) {
                RectF rectF5 = AndroidUtilities.rectTmp;
                rectF5.set(fDp, fDp2, this.checkBoxBase.bounds.width() + fDp, this.checkBoxBase.bounds.height() + fDp2);
                this.canvasButton.setRect(rectF5);
            }
            canvas.restore();
        }
        canvas.restore();
    }

    public void lambda$drawImpl$2(int[] iArr) {
        if (this.gradientDrawableLoading) {
            this.gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, iArr);
            invalidate();
            this.gradientDrawableLoading = false;
        }
    }

    public void customDraw(View view, Canvas canvas, float f, float f2, float f3) {
        canvas.save();
        if (this.clipPath == null) {
            this.clipPath = new Path();
        }
        this.clipPath.rewind();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, f, f2);
        float fDp = AndroidUtilities.dp(12.0f) * f3;
        this.clipPath.addRoundRect(rectF, fDp, fDp, Path.Direction.CW);
        this.clipPath.close();
        canvas.clipPath(this.clipPath);
        canvas.scale(f / getWidth(), f2 / getHeight());
        boolean zHasImageLoaded = this.imageReceiverFullSize.hasImageLoaded();
        if (!zHasImageLoaded || f3 < 1.0f) {
            float f4 = 1.0f - f3;
            drawImpl(canvas, false, f4, 1.0f, f4);
        }
        if (zHasImageLoaded && f3 > 0.0f) {
            drawImpl(canvas, true, 1.0f - f3, f3, 0.0f);
        }
        canvas.restore();
    }

    public void drawDuration(Canvas canvas, RectF rectF, float f) {
        String str;
        float fPow = f;
        if (this.showVideoLayout) {
            ImageReceiver imageReceiver = this.imageReceiver;
            if (imageReceiver == null || imageReceiver.getVisible()) {
                float fWidth = rectF.width() + (AndroidUtilities.dp(20.0f) * this.checkBoxProgress);
                float fWidth2 = rectF.width() / fWidth;
                if (fPow < 1.0f) {
                    fPow = (float) Math.pow(fPow, 8.0d);
                }
                canvas.save();
                canvas.translate(rectF.left, rectF.top);
                canvas.scale(fWidth2, fWidth2, 0.0f, rectF.height());
                canvas.clipRect(0.0f, 0.0f, rectF.width(), rectF.height());
                int i = this.currentParentColumnsCount;
                if (i != 9 && this.videoInfoLayot == null && (str = this.videoText) != null) {
                    this.videoInfoLayot = new StaticLayout(this.videoText, this.sharedResources.textPaint, (int) Math.ceil(this.sharedResources.textPaint.measureText(str)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                } else if ((i >= 9 || this.videoText == null) && this.videoInfoLayot != null) {
                    this.videoInfoLayot = null;
                }
                boolean zViewsOnLeft = viewsOnLeft(fWidth);
                int iDp = AndroidUtilities.dp(8.0f);
                StaticLayout staticLayout = this.videoInfoLayot;
                int width = iDp + (staticLayout != null ? staticLayout.getWidth() : 0) + (this.drawVideoIcon ? AndroidUtilities.dp(10.0f) : 0);
                canvas.translate(AndroidUtilities.dp(5.0f), (((AndroidUtilities.dp(1.0f) + rectF.height()) - AndroidUtilities.dp(17.0f)) - AndroidUtilities.dp(4.0f)) - (zViewsOnLeft ? AndroidUtilities.dp(22.0f) : 0));
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(0.0f, 0.0f, width, AndroidUtilities.dp(17.0f));
                int alpha = Theme.chat_timeBackgroundPaint.getAlpha();
                Theme.chat_timeBackgroundPaint.setAlpha((int) (alpha * fPow));
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), Theme.chat_timeBackgroundPaint);
                Theme.chat_timeBackgroundPaint.setAlpha(alpha);
                if (this.drawVideoIcon) {
                    canvas.save();
                    canvas.translate(this.videoInfoLayot == null ? AndroidUtilities.dp(5.0f) : AndroidUtilities.dp(4.0f), (AndroidUtilities.dp(17.0f) - this.sharedResources.playDrawable.getIntrinsicHeight()) / 2.0f);
                    this.sharedResources.playDrawable.setAlpha((int) (this.imageAlpha * 255.0f * fPow));
                    this.sharedResources.playDrawable.draw(canvas);
                    canvas.restore();
                }
                if (this.videoInfoLayot != null) {
                    canvas.translate(AndroidUtilities.dp((this.drawVideoIcon ? 10 : 0) + 4), (AndroidUtilities.dp(17.0f) - this.videoInfoLayot.getHeight()) / 2.0f);
                    int alpha2 = this.sharedResources.textPaint.getAlpha();
                    this.sharedResources.textPaint.setAlpha((int) (alpha2 * fPow));
                    this.videoInfoLayot.draw(canvas);
                    this.sharedResources.textPaint.setAlpha(alpha2);
                }
                canvas.restore();
            }
        }
    }

    public void updateViews() {
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        TL_stories.StoryViews storyViews;
        if (this.isStory && (messageObject = this.currentMessageObject) != null && (storyItem = messageObject.storyItem) != null && (storyViews = storyItem.views) != null) {
            int i = storyViews.views_count;
            this.drawViews = i > 0;
            this.viewsText.setText(AndroidUtilities.formatWholeNumber(i, 0), true);
        } else {
            this.drawViews = false;
            this.viewsText.setText("", false);
        }
    }

    public boolean viewsOnLeft(float f) {
        int width;
        if (!this.isStory || this.currentParentColumnsCount >= 5) {
            return false;
        }
        int iDp = AndroidUtilities.dp(26.0f) + ((int) this.viewsText.getCurrentWidth());
        if (this.showVideoLayout) {
            int iDp2 = AndroidUtilities.dp(8.0f);
            StaticLayout staticLayout = this.videoInfoLayot;
            width = iDp2 + (staticLayout != null ? staticLayout.getWidth() : 0) + (this.drawVideoIcon ? AndroidUtilities.dp(10.0f) : 0);
        } else {
            width = 0;
        }
        return ((float) ((iDp + ((iDp <= 0 || width <= 0) ? 0 : AndroidUtilities.dp(8.0f))) + width)) > f;
    }

    public void drawPrivacy(Canvas canvas, RectF rectF, float f) {
        Bitmap bitmap;
        if (!this.isStory || (bitmap = this.privacyBitmap) == null || bitmap.isRecycled()) {
            return;
        }
        int iDp = AndroidUtilities.dp((rectF.width() / (rectF.width() + (AndroidUtilities.dp(20.0f) * this.checkBoxProgress))) * 17.33f);
        canvas.save();
        float f2 = iDp;
        canvas.translate((rectF.right - f2) - AndroidUtilities.dp(5.66f), rectF.top + AndroidUtilities.dp(5.66f));
        if (this.privacyPaint == null) {
            this.privacyPaint = new Paint(3);
        }
        this.privacyPaint.setAlpha((int) (f * 255.0f));
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(0.0f, 0.0f, f2, f2);
        canvas.drawBitmap(this.privacyBitmap, (Rect) null, rectF2, this.privacyPaint);
        canvas.restore();
    }

    public void drawAuthor(Canvas canvas, RectF rectF, float f) {
        if (this.isStory) {
            ImageReceiver imageReceiver = this.imageReceiver;
            if ((imageReceiver == null || imageReceiver.getVisible()) && this.isSearchingHashtag && this.authorText != null) {
                float fDp = AndroidUtilities.dp(5.33f);
                this.authorText.ellipsize((int) (rectF.width() - (2.0f * fDp))).setVerticalClipPadding(AndroidUtilities.dp(14.0f)).setShadow(0.4f * f).draw(canvas, rectF.left + fDp, rectF.top + AndroidUtilities.dp(this.currentParentColumnsCount <= 2 ? 15.0f : 11.33f), Theme.multAlpha(-1, f), 1.0f);
            }
        }
    }

    public void drawViews(Canvas canvas, RectF rectF, float f) {
        if (this.isStory) {
            ImageReceiver imageReceiver = this.imageReceiver;
            if ((imageReceiver == null || imageReceiver.getVisible()) && this.currentParentColumnsCount < 5) {
                float fWidth = rectF.width() + (AndroidUtilities.dp(20.0f) * this.checkBoxProgress);
                float fWidth2 = rectF.width() / fWidth;
                boolean zViewsOnLeft = viewsOnLeft(fWidth);
                float f2 = this.viewsAlpha.set(this.drawViews);
                float fPow = f * f2;
                if (fPow < 1.0f) {
                    fPow = (float) Math.pow(fPow, 8.0d);
                }
                if (f2 <= 0.0f) {
                    return;
                }
                canvas.save();
                canvas.translate(rectF.left, rectF.top);
                canvas.scale(fWidth2, fWidth2, zViewsOnLeft ? 0.0f : rectF.width(), rectF.height());
                canvas.clipRect(0.0f, 0.0f, rectF.width(), rectF.height());
                float fDp = AndroidUtilities.dp(26.0f) + this.viewsText.getCurrentWidth();
                canvas.translate(zViewsOnLeft ? AndroidUtilities.dp(5.0f) : (rectF.width() - AndroidUtilities.dp(5.0f)) - fDp, ((AndroidUtilities.dp(1.0f) + rectF.height()) - AndroidUtilities.dp(17.0f)) - AndroidUtilities.dp(4.0f));
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(0.0f, 0.0f, fDp, AndroidUtilities.dp(17.0f));
                int alpha = Theme.chat_timeBackgroundPaint.getAlpha();
                Theme.chat_timeBackgroundPaint.setAlpha((int) (alpha * fPow));
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), Theme.chat_timeBackgroundPaint);
                Theme.chat_timeBackgroundPaint.setAlpha(alpha);
                canvas.save();
                canvas.translate(AndroidUtilities.dp(3.0f), (AndroidUtilities.dp(17.0f) - this.sharedResources.viewDrawable.getBounds().height()) / 2.0f);
                this.sharedResources.viewDrawable.setAlpha((int) (this.imageAlpha * 255.0f * fPow));
                this.sharedResources.viewDrawable.draw(canvas);
                canvas.restore();
                canvas.translate(AndroidUtilities.dp(22.0f), 0.0f);
                this.viewsText.setBounds(0, 0, (int) fDp, AndroidUtilities.dp(17.0f));
                this.viewsText.setAlpha((int) (fPow * 255.0f));
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
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration((long) MathUtils.clamp(this.spoilerMaxRadius * 0.3f, 250.0f, 550.0f));
        duration.setInterpolator(CubicBezierInterpolator.EASE_BOTH);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f$0.lambda$startRevealMedia$3(valueAnimator);
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
            this.imageReceiverFullSize.onAttachedToWindow();
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
            this.imageReceiverFullSize.onDetachedFromWindow();
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
            }
        } else {
            SpoilerEffect2 spoilerEffect2 = this.mediaSpoilerEffect2;
            if (spoilerEffect2 != null) {
                spoilerEffect2.detach(this);
                this.mediaSpoilerEffect2 = null;
            }
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
        int i;
        CheckBoxBase checkBoxBase = this.checkBoxBase;
        if ((checkBoxBase != null && checkBoxBase.isChecked()) == z) {
            return;
        }
        if (this.checkBoxBase == null) {
            CheckBoxBase checkBoxBase2 = new CheckBoxBase(this, 21, null);
            this.checkBoxBase = checkBoxBase2;
            checkBoxBase2.setColor(-1, Theme.key_sharedMedia_photoPlaceholder, Theme.key_checkboxCheck);
            if (this.check2 && (i = this.imageReceiverColor) != 0) {
                this.checkBoxBase.setBackgroundColor(Theme.blendOver(i, Theme.multAlpha(-1, 0.25f)));
            }
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
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.checkBoxProgress, z ? 1.0f : 0.0f);
            this.animator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
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
        SparseArray imageFilters = new SparseArray();
        private final HashMap privacyBitmaps = new HashMap();

        public SharedResources(Context context, Theme.ResourcesProvider resourcesProvider) {
            this.textPaint.setTextSize(AndroidUtilities.dp(12.0f));
            this.textPaint.setColor(-1);
            this.textPaint.setTypeface(AndroidUtilities.bold());
            Drawable drawableMutate = ContextCompat.getDrawable(context, R.drawable.play_mini_video).mutate();
            this.playDrawable = drawableMutate;
            drawableMutate.setBounds(0, 0, drawableMutate.getIntrinsicWidth(), this.playDrawable.getIntrinsicHeight());
            Drawable drawableMutate2 = ContextCompat.getDrawable(context, R.drawable.filled_views).mutate();
            this.viewDrawable = drawableMutate2;
            drawableMutate2.setBounds(0, 0, (int) (drawableMutate2.getIntrinsicWidth() * 0.7f), (int) (this.viewDrawable.getIntrinsicHeight() * 0.7f));
            this.backgroundPaint.setColor(Theme.getColor(Theme.key_sharedMedia_photoPlaceholder, resourcesProvider));
        }

        public String getFilterString(int i) {
            String str = (String) this.imageFilters.get(i);
            if (str != null) {
                return str;
            }
            String str2 = i + "_" + i + "_isc";
            this.imageFilters.put(i, str2);
            return str2;
        }

        public Bitmap getPrivacyBitmap(Context context, int i) {
            Bitmap bitmap = (Bitmap) this.privacyBitmaps.get(Integer.valueOf(i));
            if (bitmap != null) {
                return bitmap;
            }
            Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), i);
            int width = bitmapDecodeResource.getWidth();
            int height = bitmapDecodeResource.getHeight();
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, config);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Paint paint = new Paint(3);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            paint.setColorFilter(new PorterDuffColorFilter(-10461088, mode));
            canvas.drawBitmap(bitmapDecodeResource, 0.0f, 0.0f, paint);
            Utilities.stackBlurBitmap(bitmapCreateBitmap, AndroidUtilities.dp(1.0f));
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapDecodeResource.getWidth(), bitmapDecodeResource.getHeight(), config);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            canvas2.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, paint);
            canvas2.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, paint);
            canvas2.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, paint);
            paint.setColorFilter(new PorterDuffColorFilter(-1, mode));
            canvas2.drawBitmap(bitmapDecodeResource, 0.0f, 0.0f, paint);
            bitmapCreateBitmap.recycle();
            bitmapDecodeResource.recycle();
            this.privacyBitmaps.put(Integer.valueOf(i), bitmapCreateBitmap2);
            return bitmapCreateBitmap2;
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

    public void setReordering(boolean z, boolean z2) {
        if (this.reordering == z) {
            return;
        }
        this.reordering = z;
        if (!z2) {
            this.animatedReordering.force(z);
        }
        invalidate();
    }
}
