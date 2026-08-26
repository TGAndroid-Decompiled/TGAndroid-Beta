package org.telegram.ui.Cells;

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
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import androidx.recyclerview.widget.DiffUtil;
import com.google.android.gms.internal.mlkit_language_id_common.zzhr;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline2;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController$$ExternalSyntheticOutline1;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda3;
import org.telegram.ui.AvatarSpan;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda356;
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
    public static boolean lastAutoDownload;
    public static long lastUpdateDownloadSettingsTime;
    public final AnimatedFloat animatedProgress;
    public final AnimatedFloat animatedReordering;
    public ValueAnimator animator;
    public boolean attached;
    public Text authorText;
    public final ImageReceiver blurImageReceiver;
    public final RectF bounds;
    public CanvasButton canvasButton;
    public boolean check2;
    public CheckBoxBase checkBoxBase;
    public float checkBoxProgress;
    public Path clipPath;
    public float crossfadeProgress;
    public float crossfadeToColumnsCount;
    public SharedPhotoVideoCell2 crossfadeView;
    public final int currentAccount;
    public MessageObject currentMessageObject;
    public int currentParentColumnsCount;
    public boolean drawVideoIcon;
    public boolean drawViews;
    public FlickerLoadingView globalGradientView;
    public GradientDrawable gradientDrawable;
    public boolean gradientDrawableLoading;
    public float highlightProgress;
    public float imageAlpha;
    public final ImageReceiver imageReceiver;
    public int imageReceiverColor;
    public final ImageReceiver imageReceiverFullSize;
    public float imageScale;
    public boolean isFirst;
    public boolean isLast;
    public boolean isSearchingHashtag;
    public boolean isStory;
    public boolean isStoryPinned;
    public boolean isStoryUploading;
    public boolean isTop;
    public SpoilerEffect mediaSpoilerEffect;
    public SpoilerEffect2 mediaSpoilerEffect2;
    public final Path path;
    public Bitmap privacyBitmap;
    public Paint privacyPaint;
    public int privacyType;
    public final Paint progressPaint;
    public final Path rectPath;
    public boolean reorder;
    public boolean reordering;
    public final Paint scrimPaint;
    public Text sensitiveText;
    public Text sensitiveTextShort;
    public Text sensitiveTextShort2;
    public Shaker shaker;
    public final SharedResources sharedResources;
    public boolean showLivePhoto;
    public boolean showVideoLayout;
    public float spoilerMaxRadius;
    public float spoilerRevealProgress;
    public float spoilerRevealX;
    public float spoilerRevealY;
    public int style;
    public StaticLayout videoInfoLayot;
    public String videoText;
    public final AnimatedFloat viewsAlpha;
    public final AnimatedTextView.AnimatedTextDrawable viewsText;

    public final class SharedResources {
        public final Paint backgroundPaint;
        public final Paint highlightPaint;
        public final SparseArray imageFilters;
        public final Drawable playDrawable;
        public final HashMap privacyBitmaps;
        public final TextPaint textPaint;
        public final Drawable viewDrawable;

        public SharedResources(Context context, Theme.ResourcesProvider resourcesProvider) {
            TextPaint textPaint = new TextPaint(1);
            this.textPaint = textPaint;
            Paint paint = new Paint();
            this.backgroundPaint = paint;
            this.highlightPaint = new Paint();
            this.imageFilters = new SparseArray();
            this.privacyBitmaps = new HashMap();
            textPaint.setTextSize(AndroidUtilities.dp(12.0f));
            textPaint.setColor(-1);
            textPaint.setTypeface(AndroidUtilities.bold());
            Drawable drawableMutate = context.getDrawable(R.drawable.play_mini_video).mutate();
            this.playDrawable = drawableMutate;
            drawableMutate.setBounds(0, 0, drawableMutate.getIntrinsicWidth(), drawableMutate.getIntrinsicHeight());
            Drawable drawableMutate2 = context.getDrawable(R.drawable.filled_views).mutate();
            this.viewDrawable = drawableMutate2;
            drawableMutate2.setBounds(0, 0, (int) (drawableMutate2.getIntrinsicWidth() * 0.7f), (int) (drawableMutate2.getIntrinsicHeight() * 0.7f));
            paint.setColor(Theme.getColor(Theme.key_sharedMedia_photoPlaceholder, resourcesProvider));
        }
    }

    public SharedPhotoVideoCell2(Context context, SharedResources sharedResources, int i) {
        super(context);
        this.imageReceiverColor = 0;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.imageReceiverFullSize = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver();
        this.imageReceiver = imageReceiver2;
        ImageReceiver imageReceiver3 = new ImageReceiver();
        this.blurImageReceiver = imageReceiver3;
        this.imageAlpha = 1.0f;
        this.imageScale = 1.0f;
        this.drawVideoIcon = true;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.viewsAlpha = new AnimatedFloat(this, 0L, 350L, cubicBezierInterpolator);
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(false, true, true, false);
        this.viewsText = animatedTextDrawable;
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
        imageReceiver2.setParentView(this);
        imageReceiver.setParentView(this);
        imageReceiver3.setParentView(this);
        imageReceiver2.setDelegate(new ChatActivity$$ExternalSyntheticLambda356(this, 6));
        animatedTextDrawable.setCallback(this);
        animatedTextDrawable.setTextSize(AndroidUtilities.dp(12.0f));
        TextPaint textPaint = animatedTextDrawable.textPaint;
        textPaint.setColor(-1);
        animatedTextDrawable.alpha = Color.alpha(-1);
        textPaint.setTypeface(AndroidUtilities.bold());
        animatedTextDrawable.overrideFullWidth = AndroidUtilities.displaySize.x;
        setWillNotDraw(false);
    }

    private float getPadding() {
        if (this.crossfadeProgress != 0.0f) {
            float f = this.crossfadeToColumnsCount;
            if (f == 9.0f || this.currentParentColumnsCount == 9) {
                if (f == 9.0f) {
                    return DiffUtil.m(1.0f, this.crossfadeProgress, AndroidUtilities.dpf2(2.0f), AndroidUtilities.dpf2(1.0f) * this.crossfadeProgress);
                }
                return DiffUtil.m(1.0f, this.crossfadeProgress, AndroidUtilities.dpf2(1.0f), AndroidUtilities.dpf2(2.0f) * this.crossfadeProgress);
            }
        }
        return this.currentParentColumnsCount == 9 ? AndroidUtilities.dpf2(1.0f) : AndroidUtilities.dpf2(2.0f);
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
            Context context = getContext();
            SharedResources sharedResources = this.sharedResources;
            Bitmap bitmap = (Bitmap) sharedResources.privacyBitmaps.get(Integer.valueOf(i2));
            if (bitmap == null) {
                Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), i2);
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
                sharedResources.privacyBitmaps.put(Integer.valueOf(i2), bitmapCreateBitmap2);
                bitmap = bitmapCreateBitmap2;
            }
            this.privacyBitmap = bitmap;
        }
        invalidate();
    }

    public final void customDraw(Canvas canvas, float f, float f2, float f3) {
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
            drawImpl(f4, 1.0f, f4, canvas, false);
        }
        if (zHasImageLoaded && f3 > 0.0f) {
            drawImpl(1.0f - f3, f3, 0.0f, canvas, true);
        }
        canvas.restore();
    }

    public final void drawAuthor(Canvas canvas, RectF rectF, float f) {
        if (this.isStory) {
            ImageReceiver imageReceiver = this.imageReceiver;
            if ((imageReceiver == null || imageReceiver.getVisible()) && this.isSearchingHashtag && this.authorText != null) {
                float fDp = AndroidUtilities.dp(5.33f);
                Text text = this.authorText;
                text.ellipsizeWidth = (int) (rectF.width() - (2.0f * fDp));
                text.vertPad = AndroidUtilities.dp(14.0f);
                text.paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.66f), Theme.multAlpha(0.4f * f, -16777216));
                text.draw(rectF.left + fDp, rectF.top + AndroidUtilities.dp(this.currentParentColumnsCount <= 2 ? 15.0f : 11.33f), 1.0f, Theme.multAlpha(f, -1), canvas);
            }
        }
    }

    public final void drawDuration(Canvas canvas, RectF rectF, float f) {
        String str;
        float fPow = f;
        if (this.showVideoLayout) {
            ImageReceiver imageReceiver = this.imageReceiver;
            if (imageReceiver == null || imageReceiver.getVisible()) {
                float fDp = (AndroidUtilities.dp(20.0f) * this.checkBoxProgress) + rectF.width();
                float fWidth = rectF.width() / fDp;
                if (fPow < 1.0f) {
                    fPow = (float) Math.pow(fPow, 8.0d);
                }
                canvas.save();
                canvas.translate(rectF.left, rectF.top);
                canvas.scale(fWidth, fWidth, 0.0f, rectF.height());
                canvas.clipRect(0.0f, 0.0f, rectF.width(), rectF.height());
                int i = this.currentParentColumnsCount;
                SharedResources sharedResources = this.sharedResources;
                if (i != 9 && this.videoInfoLayot == null && (str = this.videoText) != null) {
                    this.videoInfoLayot = new StaticLayout(this.videoText, sharedResources.textPaint, (int) Math.ceil(sharedResources.textPaint.measureText(str)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                } else if ((i >= 9 || this.videoText == null) && this.videoInfoLayot != null) {
                    this.videoInfoLayot = null;
                }
                boolean zViewsOnLeft = viewsOnLeft(fDp);
                int iDp = AndroidUtilities.dp(8.0f);
                StaticLayout staticLayout = this.videoInfoLayot;
                int width = iDp + (staticLayout != null ? staticLayout.getWidth() : 0) + (this.drawVideoIcon ? AndroidUtilities.dp(10.0f) : 0);
                canvas.translate(AndroidUtilities.dp(5.0f), (((rectF.height() + AndroidUtilities.dp(1.0f)) - AndroidUtilities.dp(17.0f)) - AndroidUtilities.dp(4.0f)) - (zViewsOnLeft ? AndroidUtilities.dp(22.0f) : 0));
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(0.0f, 0.0f, width, AndroidUtilities.dp(17.0f));
                int alpha = Theme.chat_timeBackgroundPaint.getAlpha();
                Theme.chat_timeBackgroundPaint.setAlpha((int) (alpha * fPow));
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), Theme.chat_timeBackgroundPaint);
                Theme.chat_timeBackgroundPaint.setAlpha(alpha);
                if (this.drawVideoIcon) {
                    canvas.save();
                    canvas.translate(this.videoInfoLayot == null ? AndroidUtilities.dp(5.0f) : AndroidUtilities.dp(4.0f), (AndroidUtilities.dp(17.0f) - sharedResources.playDrawable.getIntrinsicHeight()) / 2.0f);
                    int i2 = (int) (this.imageAlpha * 255.0f * fPow);
                    Drawable drawable = sharedResources.playDrawable;
                    drawable.setAlpha(i2);
                    drawable.draw(canvas);
                    canvas.restore();
                }
                if (this.videoInfoLayot != null) {
                    canvas.translate(AndroidUtilities.dp((this.drawVideoIcon ? 10 : 0) + 4), (AndroidUtilities.dp(17.0f) - this.videoInfoLayot.getHeight()) / 2.0f);
                    int alpha2 = sharedResources.textPaint.getAlpha();
                    TextPaint textPaint = sharedResources.textPaint;
                    textPaint.setAlpha((int) (alpha2 * fPow));
                    this.videoInfoLayot.draw(canvas);
                    textPaint.setAlpha(alpha2);
                }
                canvas.restore();
            }
        }
    }

    public final void drawImpl(float f, float f2, float f3, Canvas canvas, boolean z) {
        float f4;
        boolean z2;
        float f5;
        Canvas canvas2;
        float f6;
        float f7;
        ImageReceiver imageReceiver;
        float f8;
        SharedPhotoVideoCell2 sharedPhotoVideoCell2;
        float fDp;
        float fDp2;
        Drawable drawable;
        Canvas canvas3;
        int i;
        FlickerLoadingView flickerLoadingView;
        float padding = getPadding() * f;
        float f9 = this.isFirst ? padding : 0.0f;
        float f10 = this.animatedReordering.set(this.reordering);
        float measuredWidth = ((getMeasuredWidth() - f9) - padding) * this.imageScale;
        float measuredHeight = ((getMeasuredHeight() - 0.0f) - padding) * this.imageScale;
        ImageReceiver imageReceiver2 = z ? this.imageReceiverFullSize : this.imageReceiver;
        imageReceiver2.setAlpha(f2);
        if (this.crossfadeProgress > 0.5f && this.crossfadeToColumnsCount != 9.0f && this.currentParentColumnsCount != 9) {
            float f11 = f * 2.0f;
            measuredWidth -= f11;
            measuredHeight -= f11;
        }
        if ((this.currentMessageObject != null || this.style == 1) && imageReceiver2.hasBitmapImage() && imageReceiver2.getCurrentAlpha() == 1.0f && this.imageAlpha == 1.0f) {
            f4 = 1.0f;
            z2 = true;
            f5 = 0.0f;
        } else {
            if (getParent() == null || (flickerLoadingView = this.globalGradientView) == null) {
                f4 = 1.0f;
                z2 = true;
                f5 = 0.0f;
            } else {
                int measuredWidth2 = ((View) getParent()).getMeasuredWidth();
                int measuredHeight2 = getMeasuredHeight();
                float f12 = -getX();
                flickerLoadingView.parentWidth = measuredWidth2;
                flickerLoadingView.parentHeight = measuredHeight2;
                flickerLoadingView.parentXOffset = f12;
                this.globalGradientView.updateColors$1();
                this.globalGradientView.updateGradient();
                float f13 = (this.crossfadeProgress <= 0.5f || this.crossfadeToColumnsCount == 9.0f || this.currentParentColumnsCount == 9) ? 0.0f : 1.0f;
                float f14 = f9 + f13;
                float f15 = f13 + padding;
                f4 = 1.0f;
                z2 = true;
                f5 = 0.0f;
                canvas.drawRect(f14, f15, f14 + measuredWidth, f15 + measuredHeight, this.globalGradientView.getPaint());
            }
            invalidate();
        }
        float f16 = this.imageAlpha;
        if (f16 != f4) {
            canvas.saveLayerAlpha(0.0f, 0.0f, f9 + padding + measuredWidth, padding + f5 + measuredHeight, (int) (f16 * 255.0f), 31);
        } else {
            canvas.save();
        }
        CheckBoxBase checkBoxBase = this.checkBoxBase;
        SharedResources sharedResources = this.sharedResources;
        if (((checkBoxBase == null || !checkBoxBase.isChecked) && !PhotoViewer.isShowingImage(this.currentMessageObject)) || this.check2) {
            canvas2 = canvas;
            f6 = f9;
        } else {
            canvas2 = canvas;
            f6 = f9;
            canvas2.drawRect(f6, 0.0f, (f9 + measuredWidth) - padding, (measuredHeight + f5) - padding, sharedResources.backgroundPaint);
        }
        boolean z3 = this.isStory;
        ImageReceiver imageReceiver3 = this.blurImageReceiver;
        if (z3 && this.currentParentColumnsCount == z2) {
            float height = getHeight() * 0.72f;
            GradientDrawable gradientDrawable = this.gradientDrawable;
            if (gradientDrawable != null) {
                gradientDrawable.setBounds(0, 0, getWidth(), getHeight());
                this.gradientDrawable.draw(canvas2);
            } else if (!this.gradientDrawableLoading && imageReceiver2.getBitmap() != null) {
                this.gradientDrawableLoading = z2;
                Bitmap bitmap = imageReceiver2.getBitmap();
                boolean zIsDark = Theme.currentTheme.isDark();
                if (bitmap == null) {
                    int[] iArr = {0, 0};
                    if (this.gradientDrawableLoading) {
                        this.gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, iArr);
                        invalidate();
                        this.gradientDrawableLoading = false;
                    }
                } else {
                    int[] colorsSync = DominantColors.getColorsSync(bitmap, zIsDark);
                    if (this.gradientDrawableLoading) {
                        this.gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, colorsSync);
                        invalidate();
                        this.gradientDrawableLoading = false;
                    }
                }
            }
            imageReceiver2.setImageCoords((measuredWidth - height) / 2.0f, 0.0f, height, getHeight());
        } else if (this.checkBoxProgress > 0.0f) {
            float fDp3 = AndroidUtilities.dp(this.check2 ? 7.0f : 10.0f) * this.checkBoxProgress;
            float f17 = f6 + fDp3;
            float f18 = padding + fDp3;
            float f19 = fDp3 * 2.0f;
            float f20 = measuredWidth - f19;
            float f21 = measuredHeight - f19;
            imageReceiver2.setImageCoords(f17, f18, f20, f21);
            imageReceiver3.setImageCoords(f17, f18, f20, f21);
        } else {
            float f22 = (this.crossfadeProgress <= 0.5f || this.crossfadeToColumnsCount == 9.0f || this.currentParentColumnsCount == 9) ? 0.0f : 1.0f;
            float f23 = f6 + f22;
            float f24 = f22 + padding;
            imageReceiver2.setImageCoords(f23, f24, measuredWidth, measuredHeight);
            imageReceiver3.setImageCoords(f23, f24, measuredWidth, measuredHeight);
        }
        imageReceiver2.setRoundRadius(AndroidUtilities.lerp((this.isFirst && this.isTop) ? AndroidUtilities.dp(18.0f) : AndroidUtilities.dp(f4), AndroidUtilities.dp(8.0f), this.checkBoxProgress), AndroidUtilities.lerp((this.isLast && this.isTop) ? AndroidUtilities.dp(18.0f) : AndroidUtilities.dp(f4), AndroidUtilities.dp(8.0f), this.checkBoxProgress), AndroidUtilities.lerp(AndroidUtilities.dp(f4), AndroidUtilities.dp(8.0f), this.checkBoxProgress), AndroidUtilities.lerp(AndroidUtilities.dp(f4), AndroidUtilities.dp(8.0f), this.checkBoxProgress));
        if (this.check2) {
            canvas2.save();
            if (this.reorder || this.reordering) {
                canvas2.translate(imageReceiver2.getCenterX(), imageReceiver2.getCenterY());
                if (this.shaker == null) {
                    this.shaker = new Shaker(this);
                }
                this.shaker.concat(canvas2, Math.max(this.checkBoxProgress, f10));
                float f25 = f4 - (f10 * 0.075f);
                canvas2.scale(f25, f25);
                canvas2.translate(-imageReceiver2.getCenterX(), -imageReceiver2.getCenterY());
            }
        }
        if (PhotoViewer.isShowingImage(this.currentMessageObject)) {
            f7 = f10;
            measuredWidth = measuredWidth;
            imageReceiver = imageReceiver2;
            f8 = 0.075f;
            sharedPhotoVideoCell2 = this;
        } else {
            imageReceiver2.draw(canvas2);
            MessageObject messageObject = this.currentMessageObject;
            if (messageObject == null || !messageObject.hasMediaSpoilers() || this.currentMessageObject.isMediaSpoilersRevealedInSharedMedia) {
                f7 = f10;
                measuredWidth = measuredWidth;
                imageReceiver = imageReceiver2;
                f8 = 0.075f;
                sharedPhotoVideoCell2 = this;
            } else {
                canvas2.save();
                canvas2.clipRect(f6, 0.0f, (f6 + measuredWidth) - padding, (measuredHeight + 0.0f) - padding);
                if (this.spoilerRevealProgress != 0.0f) {
                    Path path = this.path;
                    path.rewind();
                    path.addCircle(this.spoilerRevealX, this.spoilerRevealY, this.spoilerMaxRadius * this.spoilerRevealProgress, Path.Direction.CW);
                    canvas2.clipPath(path, Region.Op.DIFFERENCE);
                }
                imageReceiver3.draw(canvas2);
                if (this.mediaSpoilerEffect2 != null) {
                    canvas2.clipRect(imageReceiver2.getImageX(), imageReceiver2.getImageY(), imageReceiver2.getImageX2(), imageReceiver2.getImageY2());
                    imageReceiver = imageReceiver2;
                    Canvas canvas4 = canvas2;
                    f7 = f10;
                    this.mediaSpoilerEffect2.draw(canvas4, this, (int) imageReceiver2.getImageWidth(), (int) imageReceiver2.getImageHeight(), 1.0f, false);
                    canvas3 = canvas4;
                    sharedPhotoVideoCell2 = this;
                } else {
                    imageReceiver = imageReceiver2;
                    canvas3 = canvas2;
                    sharedPhotoVideoCell2 = this;
                    f7 = f10;
                    if (sharedPhotoVideoCell2.mediaSpoilerEffect == null) {
                        sharedPhotoVideoCell2.mediaSpoilerEffect = new SpoilerEffect();
                    }
                    sharedPhotoVideoCell2.mediaSpoilerEffect.setColor(ColorUtils.setAlphaComponent(-1, (int) (Color.alpha(-1) * 0.325f)));
                    sharedPhotoVideoCell2.mediaSpoilerEffect.setBounds((int) imageReceiver.getImageX(), (int) imageReceiver.getImageY(), (int) imageReceiver.getImageX2(), (int) imageReceiver.getImageY2());
                    sharedPhotoVideoCell2.mediaSpoilerEffect.draw(canvas3);
                }
                canvas3.restore();
                if (sharedPhotoVideoCell2.currentMessageObject.isSensitive()) {
                    if (sharedPhotoVideoCell2.sensitiveText == null) {
                        f8 = 0.075f;
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(NotificationsController$$ExternalSyntheticOutline1.m(new StringBuilder("x "), R.string.MessageSensitiveContent));
                        spannableStringBuilder.setSpan(new ColoredImageSpan(R.drawable.filled_sensitive), 0, 1, 33);
                        sharedPhotoVideoCell2.sensitiveText = new Text(spannableStringBuilder, 14.0f, AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
                    } else {
                        f8 = 0.075f;
                    }
                    Text text = sharedPhotoVideoCell2.sensitiveText;
                    int i2 = 13;
                    if (measuredWidth < (AndroidUtilities.dp(13) * 2) + text.width) {
                        if (sharedPhotoVideoCell2.sensitiveTextShort == null) {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(NotificationsController$$ExternalSyntheticOutline1.m(new StringBuilder("x "), R.string.MessageSensitiveContentShort));
                            spannableStringBuilder2.setSpan(new ColoredImageSpan(R.drawable.filled_sensitive), 0, 1, 33);
                            sharedPhotoVideoCell2.sensitiveTextShort = new Text(spannableStringBuilder2, 14.0f, AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
                        }
                        text = sharedPhotoVideoCell2.sensitiveTextShort;
                    }
                    if (measuredWidth < (AndroidUtilities.dp(26) * 2) + text.width) {
                        if (sharedPhotoVideoCell2.sensitiveTextShort2 == null) {
                            sharedPhotoVideoCell2.sensitiveTextShort2 = new Text(new SpannableStringBuilder(LocaleController.getString(R.string.MessageSensitiveContentShort)), 13.0f, AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
                        }
                        text = sharedPhotoVideoCell2.sensitiveTextShort2;
                        i2 = 10;
                        i = 28;
                    } else {
                        i = 32;
                    }
                    float imageWidth = (imageReceiver.getImageWidth() / 2.0f) + imageReceiver.getImageX();
                    float imageHeight = (imageReceiver.getImageHeight() / 2.0f) + imageReceiver.getImageY();
                    float fDp4 = text.width + AndroidUtilities.dp(i2 + i2);
                    float fDp5 = AndroidUtilities.dp(i) / 2.0f;
                    Text text2 = text;
                    float fLerp = AndroidUtilities.lerp(0.8f, 1.0f, f4 - sharedPhotoVideoCell2.spoilerRevealProgress);
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f26 = fDp4 / 2.0f;
                    float f27 = f26 * fLerp;
                    float f28 = fDp5 * fLerp;
                    rectF.set(imageWidth - f27, imageHeight - f28, f27 + imageWidth, imageHeight + f28);
                    Path path2 = sharedPhotoVideoCell2.rectPath;
                    path2.reset();
                    path2.addRoundRect(rectF, fDp5, fDp5, Path.Direction.CW);
                    canvas3.save();
                    canvas3.clipPath(path2);
                    float alpha = imageReceiver3.getAlpha();
                    imageReceiver3.setAlpha((1.0f - sharedPhotoVideoCell2.spoilerRevealProgress) * alpha);
                    imageReceiver3.draw(canvas3);
                    imageReceiver3.setAlpha(alpha);
                    canvas3.restore();
                    Paint themePaint = Theme.getThemePaint("paintChatTimeBackground");
                    int alpha2 = themePaint.getAlpha();
                    themePaint.setAlpha((int) ImageReceiver$$ExternalSyntheticOutline2.m(1.0f, sharedPhotoVideoCell2.spoilerRevealProgress, alpha2, 0.35f));
                    canvas3.drawRoundRect(rectF, fDp5, fDp5, themePaint);
                    themePaint.setAlpha(alpha2);
                    canvas3.save();
                    canvas3.scale(fLerp, fLerp, imageWidth, imageHeight);
                    Canvas canvas5 = canvas3;
                    text2.draw(AndroidUtilities.dp(i2) + (imageWidth - f26), imageHeight, 1.0f - sharedPhotoVideoCell2.spoilerRevealProgress, -1, canvas5);
                    canvas2 = canvas5;
                    canvas2.restore();
                } else {
                    f8 = 0.075f;
                    canvas2 = canvas3;
                }
                sharedPhotoVideoCell2.invalidate();
            }
            if (!sharedPhotoVideoCell2.isSearchingHashtag) {
                float f29 = sharedPhotoVideoCell2.highlightProgress;
                if (f29 > 0.0f) {
                    sharedResources.highlightPaint.setColor(ColorUtils.setAlphaComponent(-16777216, (int) (f29 * 0.5f * 255.0f)));
                    canvas2.drawRect(imageReceiver.getDrawRegion(), sharedResources.highlightPaint);
                }
            }
        }
        if (sharedPhotoVideoCell2.isStoryUploading) {
            Paint paint = sharedPhotoVideoCell2.scrimPaint;
            paint.setColor(805306368);
            canvas2.drawRect(imageReceiver.getDrawRegion(), paint);
            Paint paint2 = sharedPhotoVideoCell2.progressPaint;
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setColor(-1);
            paint2.setStrokeWidth(AndroidUtilities.dp(3.0f));
            paint2.setStrokeJoin(Paint.Join.ROUND);
            paint2.setStrokeCap(Paint.Cap.ROUND);
            float fDp6 = AndroidUtilities.dp(18.0f);
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(imageReceiver.getCenterX() - fDp6, imageReceiver.getCenterY() - fDp6, imageReceiver.getCenterX() + fDp6, imageReceiver.getCenterY() + fDp6);
            float fCurrentTimeMillis = ((System.currentTimeMillis() % 1500) / 1500.0f) * 360.0f;
            MessageObject messageObject2 = sharedPhotoVideoCell2.currentMessageObject;
            canvas2.drawArc(rectF2, fCurrentTimeMillis, sharedPhotoVideoCell2.animatedProgress.set(AndroidUtilities.lerp(0.15f, 0.95f, messageObject2 != null ? messageObject2.getProgress() : 0.0f), false) * 360.0f, false, paint2);
            sharedPhotoVideoCell2.invalidate();
        }
        RectF rectF3 = sharedPhotoVideoCell2.bounds;
        rectF3.set(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        if (sharedPhotoVideoCell2.showLivePhoto && (drawable = Theme.chat_livePhoto) != null) {
            drawable.setBounds((int) (rectF3.left + AndroidUtilities.dp(8.0f)), (int) (rectF3.top + AndroidUtilities.dp(8.0f)), (int) ((Theme.chat_livePhoto.getIntrinsicWidth() * 0.75f) + rectF3.left + AndroidUtilities.dp(8.0f)), (int) ((Theme.chat_livePhoto.getIntrinsicHeight() * 0.75f) + rectF3.top + AndroidUtilities.dp(8.0f)));
            Theme.chat_livePhoto.draw(canvas2);
        }
        sharedPhotoVideoCell2.drawDuration(canvas2, rectF3, f3);
        sharedPhotoVideoCell2.drawViews(canvas2, rectF3, f3);
        if (sharedPhotoVideoCell2.isSearchingHashtag) {
            sharedPhotoVideoCell2.drawAuthor(canvas2, rectF3, f3);
        } else {
            sharedPhotoVideoCell2.drawPrivacy(canvas2, rectF3, f3);
        }
        if (sharedPhotoVideoCell2.check2) {
            canvas2.restore();
        }
        CheckBoxBase checkBoxBase2 = sharedPhotoVideoCell2.checkBoxBase;
        if (checkBoxBase2 != null && (sharedPhotoVideoCell2.style == 1 || checkBoxBase2.progress != 0.0f)) {
            canvas2.save();
            if (sharedPhotoVideoCell2.check2 && (sharedPhotoVideoCell2.reorder || sharedPhotoVideoCell2.reordering)) {
                canvas2.translate(imageReceiver.getCenterX(), imageReceiver.getCenterY());
                if (sharedPhotoVideoCell2.shaker == null) {
                    sharedPhotoVideoCell2.shaker = new Shaker(sharedPhotoVideoCell2);
                }
                float f30 = f7;
                sharedPhotoVideoCell2.shaker.concat(canvas2, Math.max(sharedPhotoVideoCell2.checkBoxProgress, f30) * 0.5f);
                float f31 = 1.0f - (f30 * f8);
                canvas2.scale(f31, f31);
                canvas2.translate(-imageReceiver.getCenterX(), -imageReceiver.getCenterY());
            }
            if (sharedPhotoVideoCell2.style == 1) {
                fDp = ((measuredWidth + AndroidUtilities.dp(2.0f)) - AndroidUtilities.dp(25.0f)) - AndroidUtilities.dp(4.0f);
                fDp2 = AndroidUtilities.dp(4.0f);
            } else if (sharedPhotoVideoCell2.check2) {
                fDp = (measuredWidth + AndroidUtilities.dp(2.0f)) - AndroidUtilities.dp((sharedPhotoVideoCell2.checkBoxProgress * 5.0f) + 22.0f);
                fDp2 = (AndroidUtilities.dp(5.0f) * sharedPhotoVideoCell2.checkBoxProgress) + AndroidUtilities.dp(-2.0f);
            } else {
                fDp = (measuredWidth + AndroidUtilities.dp(2.0f)) - AndroidUtilities.dp(25.0f);
                fDp2 = 0.0f;
            }
            canvas2.translate(fDp, fDp2);
            sharedPhotoVideoCell2.checkBoxBase.draw(canvas2);
            if (sharedPhotoVideoCell2.canvasButton != null) {
                RectF rectF4 = AndroidUtilities.rectTmp;
                rectF4.set(fDp, fDp2, sharedPhotoVideoCell2.checkBoxBase.bounds.width() + fDp, sharedPhotoVideoCell2.checkBoxBase.bounds.height() + fDp2);
                CanvasButton canvasButton = sharedPhotoVideoCell2.canvasButton;
                canvasButton.pathCreated = false;
                canvasButton.usingRectCount = 0;
                canvasButton.addRect(rectF4);
            }
            canvas2.restore();
        }
        canvas2.restore();
    }

    public final void drawPrivacy(Canvas canvas, RectF rectF, float f) {
        Bitmap bitmap;
        if (!this.isStory || (bitmap = this.privacyBitmap) == null || bitmap.isRecycled()) {
            return;
        }
        int iDp = AndroidUtilities.dp((rectF.width() / ((AndroidUtilities.dp(20.0f) * this.checkBoxProgress) + rectF.width())) * 17.33f);
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

    public final void drawViews(Canvas canvas, RectF rectF, float f) {
        if (this.isStory) {
            ImageReceiver imageReceiver = this.imageReceiver;
            if ((imageReceiver == null || imageReceiver.getVisible()) && this.currentParentColumnsCount < 5) {
                float fDp = (AndroidUtilities.dp(20.0f) * this.checkBoxProgress) + rectF.width();
                float fWidth = rectF.width() / fDp;
                boolean zViewsOnLeft = viewsOnLeft(fDp);
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
                canvas.scale(fWidth, fWidth, zViewsOnLeft ? 0.0f : rectF.width(), rectF.height());
                canvas.clipRect(0.0f, 0.0f, rectF.width(), rectF.height());
                float fDp2 = AndroidUtilities.dp(26.0f);
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.viewsText;
                float currentWidth = animatedTextDrawable.getCurrentWidth() + fDp2;
                canvas.translate(zViewsOnLeft ? AndroidUtilities.dp(5.0f) : (rectF.width() - AndroidUtilities.dp(5.0f)) - currentWidth, ((rectF.height() + AndroidUtilities.dp(1.0f)) - AndroidUtilities.dp(17.0f)) - AndroidUtilities.dp(4.0f));
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(0.0f, 0.0f, currentWidth, AndroidUtilities.dp(17.0f));
                int alpha = Theme.chat_timeBackgroundPaint.getAlpha();
                Theme.chat_timeBackgroundPaint.setAlpha((int) (alpha * fPow));
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), Theme.chat_timeBackgroundPaint);
                Theme.chat_timeBackgroundPaint.setAlpha(alpha);
                canvas.save();
                float fDp3 = AndroidUtilities.dp(3.0f);
                int iDp = AndroidUtilities.dp(17.0f);
                SharedResources sharedResources = this.sharedResources;
                canvas.translate(fDp3, (iDp - sharedResources.viewDrawable.getBounds().height()) / 2.0f);
                int i = (int) (this.imageAlpha * 255.0f * fPow);
                Drawable drawable = sharedResources.viewDrawable;
                drawable.setAlpha(i);
                drawable.draw(canvas);
                canvas.restore();
                canvas.translate(AndroidUtilities.dp(22.0f), 0.0f);
                animatedTextDrawable.setBounds(0, 0, (int) currentWidth, AndroidUtilities.dp(17.0f));
                animatedTextDrawable.alpha = (int) (fPow * 255.0f);
                animatedTextDrawable.draw(canvas);
                canvas.restore();
            }
        }
    }

    public View getCrossfadeView() {
        return this.crossfadeView;
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

    public final int getPrivacyType(MessageObject messageObject) {
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

    public int getStyle() {
        return this.style;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.attached = true;
        CheckBoxBase checkBoxBase = this.checkBoxBase;
        if (checkBoxBase != null) {
            checkBoxBase.attachedToWindow = true;
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

    public void onCheckBoxPressed() {
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attached = false;
        CheckBoxBase checkBoxBase = this.checkBoxBase;
        if (checkBoxBase != null) {
            checkBoxBase.attachedToWindow = false;
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

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawImpl(1.0f, 1.0f, 1.0f, canvas, false);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
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

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        boolean z = this.isStory;
        int i3 = z ? (int) (size * 1.25f) : size;
        if (z && this.currentParentColumnsCount == 1) {
            i3 /= 2;
        }
        setMeasuredDimension(size, i3);
        if (getMeasuredHeight() <= 0 || getMeasuredWidth() <= 0) {
            return;
        }
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject != null && messageObject.hasMediaSpoilers()) {
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

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        CanvasButton canvasButton = this.canvasButton;
        if (canvasButton == null || !canvasButton.checkTouchEvent(motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public final void setChecked(boolean z, boolean z2) {
        int i;
        CheckBoxBase checkBoxBase = this.checkBoxBase;
        if ((checkBoxBase != null && checkBoxBase.isChecked) == z) {
            return;
        }
        if (checkBoxBase == null) {
            CheckBoxBase checkBoxBase2 = new CheckBoxBase(null, this, 21);
            this.checkBoxBase = checkBoxBase2;
            checkBoxBase2.setColor(-1, Theme.key_sharedMedia_photoPlaceholder, Theme.key_checkboxCheck);
            if (this.check2 && (i = this.imageReceiverColor) != 0) {
                CheckBoxBase checkBoxBase3 = this.checkBoxBase;
                int iBlendOver = Theme.blendOver(i, Theme.multAlpha(0.25f, -1));
                if (checkBoxBase3.backgroundColor != iBlendOver) {
                    checkBoxBase3.backgroundColor = iBlendOver;
                    checkBoxBase3.invalidate();
                }
            }
            this.checkBoxBase.setDrawUnchecked(false);
            this.checkBoxBase.setBackgroundType(1);
            this.checkBoxBase.setBounds(0, 0, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
            if (this.attached) {
                this.checkBoxBase.attachedToWindow = true;
            }
        }
        this.checkBoxBase.setChecked(-1, z, z2);
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            this.animator = null;
            valueAnimator.cancel();
        }
        if (z2) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.checkBoxProgress, z ? 1.0f : 0.0f);
            this.animator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ChatActivity.AnonymousClass133(this, 3));
            this.animator.setDuration(200L);
            this.animator.addListener(new ChatActivity.AnonymousClass77(8, this, z));
            this.animator.start();
        } else {
            this.checkBoxProgress = z ? 1.0f : 0.0f;
        }
        invalidate();
    }

    public void setGradientView(FlickerLoadingView flickerLoadingView) {
        this.globalGradientView = flickerLoadingView;
    }

    public void setHighlightProgress(float f) {
        if (this.highlightProgress != f) {
            this.highlightProgress = f;
            invalidate();
        }
    }

    public final void setImageScale(float f, boolean z) {
        if (this.imageScale != f) {
            this.imageScale = f;
            if (z) {
                invalidate();
            }
        }
    }

    public final void setMessageObject(MessageObject messageObject, int i, boolean z) {
        boolean z2;
        long j;
        ImageLocation imageLocation;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        TLRPC.PhotoSize closestPhotoSizeWithSize2;
        ImageLocation forObject;
        long j2;
        int i2;
        long j3;
        int i3;
        BitmapDrawable bitmapDrawable;
        String str;
        TL_stories.StoryItem storyItem;
        long dialogId;
        AvatarSpan avatarSpan;
        float f;
        int i4;
        float f2;
        TL_stories.StoryViews storyViews;
        TLRPC.Document document;
        TLRPC.Photo photo;
        TLRPC.Photo photo2;
        TLRPC.Document document2;
        TL_stories.StoryItem storyItem2;
        int i5 = i;
        if (i5 < 1) {
            i5 = 1;
        }
        int i6 = this.currentParentColumnsCount;
        this.currentParentColumnsCount = i5;
        MessageObject messageObject2 = this.currentMessageObject;
        if (messageObject2 == null && messageObject == null) {
            return;
        }
        if (messageObject2 != null && messageObject != null && messageObject2.getId() == messageObject.getId()) {
            MessageObject messageObject3 = this.currentMessageObject;
            if ((messageObject3 != null ? messageObject3.uploadingStory : null) == messageObject.uploadingStory) {
                if ((messageObject3 != null ? messageObject3.parentStoriesList : null) == messageObject.parentStoriesList) {
                    TLRPC.MessageMedia messageMedia = (messageObject3 == null || (storyItem2 = messageObject3.storyItem) == null) ? null : storyItem2.media;
                    TL_stories.StoryItem storyItem3 = messageObject.storyItem;
                    TLRPC.MessageMedia messageMedia2 = storyItem3 == null ? null : storyItem3.media;
                    if (((messageMedia == null && messageMedia2 == null) || (messageMedia != null && messageMedia2 != null && ((document = messageMedia.document) == null ? !((photo = messageMedia.photo) == null || (photo2 = messageMedia2.photo) == null || photo2.id != photo.id) : !((document2 = messageMedia2.document) == null || document2.id != document.id)))) && i6 == i5) {
                        int i7 = this.privacyType;
                        if ((i7 == 100) == this.isStoryPinned && i7 == getPrivacyType(messageObject) && !z) {
                            return;
                        }
                    }
                }
            }
        }
        this.currentMessageObject = messageObject;
        this.isStory = messageObject != null && messageObject.isStory();
        MessageObject messageObject4 = this.currentMessageObject;
        this.isStoryUploading = (messageObject4 == null || messageObject4.uploadingStory == null) ? false : true;
        if (getMeasuredHeight() > 0 && getMeasuredWidth() > 0) {
            MessageObject messageObject5 = this.currentMessageObject;
            if (messageObject5 == null || !messageObject5.hasMediaSpoilers()) {
                SpoilerEffect2 spoilerEffect2 = this.mediaSpoilerEffect2;
                if (spoilerEffect2 != null) {
                    spoilerEffect2.detach(this);
                    this.mediaSpoilerEffect2 = null;
                }
            } else if (this.mediaSpoilerEffect2 == null) {
                this.mediaSpoilerEffect2 = SpoilerEffect2.getInstance(this);
            }
        }
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.viewsText;
        ImageReceiver imageReceiver = this.imageReceiverFullSize;
        ImageReceiver imageReceiver2 = this.imageReceiver;
        ImageReceiver imageReceiver3 = this.blurImageReceiver;
        AnimatedFloat animatedFloat = this.viewsAlpha;
        if (messageObject == null) {
            imageReceiver2.onDetachedFromWindow();
            imageReceiver.onDetachedFromWindow();
            imageReceiver3.onDetachedFromWindow();
            this.videoText = null;
            this.drawViews = false;
            animatedFloat.set(0.0f, true);
            animatedTextDrawable.setText("", false, true);
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
            imageReceiver2.onAttachedToWindow();
            imageReceiver.onAttachedToWindow();
            imageReceiver3.onAttachedToWindow();
        }
        ImageReceiver imageReceiver4 = z ? imageReceiver : imageReceiver2;
        int i8 = this.currentAccount;
        String restrictionReason = MessagesController.getInstance(i8).getRestrictionReason(messageObject.messageOwner.restriction_reason);
        int i9 = (int) ((AndroidUtilities.displaySize.x / i5) / AndroidUtilities.density);
        if (z) {
            i9 = (((int) (AndroidUtilities.displaySize.x / AndroidUtilities.density)) * 3) / 5;
        }
        SharedResources sharedResources = this.sharedResources;
        String str2 = (String) sharedResources.imageFilters.get(i9);
        if (str2 == null) {
            str2 = i9 + "_" + i9 + "_isc";
            sharedResources.imageFilters.put(i9, str2);
        }
        String str3 = str2;
        int photoSize = (i5 <= 2 || z) ? AndroidUtilities.getPhotoSize() : 320;
        this.videoText = null;
        this.videoInfoLayot = null;
        this.showVideoLayout = false;
        this.showLivePhoto = false;
        imageReceiver2.clearDecorators();
        imageReceiver.clearDecorators();
        if (!this.isStory || (storyViews = messageObject.storyItem.views) == null) {
            z2 = true;
            this.drawViews = false;
            animatedFloat.set(0.0f, true);
            animatedTextDrawable.setText("", false, true);
        } else {
            int i10 = storyViews.views_count;
            this.drawViews = i10 > 0;
            z2 = true;
            animatedTextDrawable.setText(AndroidUtilities.formatWholeNumber(i10, 0), false, true);
        }
        animatedFloat.set(this.drawViews ? 1.0f : 0.0f, z2);
        Object obj = messageObject.parentStoriesList != null ? messageObject.storyItem : messageObject;
        if (TextUtils.isEmpty(restrictionReason)) {
            TL_stories.StoryItem storyItem4 = messageObject.storyItem;
            if (storyItem4 == null || !(storyItem4.media instanceof TLRPC.TL_messageMediaUnsupported)) {
                StoriesController.UploadingStory uploadingStory = messageObject.uploadingStory;
                if (uploadingStory == null || (str = uploadingStory.firstFramePath) == null) {
                    TLRPC.Document document3 = messageObject.getDocument();
                    TLRPC.Photo photo3 = messageObject.getPhoto();
                    if (MessageObject.isVideoDocument(document3)) {
                        this.showVideoLayout = !messageObject.isLivePhoto();
                        this.showLivePhoto = messageObject.isLivePhoto();
                        if (i5 != 9 && !messageObject.isLivePhoto()) {
                            this.videoText = AndroidUtilities.formatShortDuration((int) messageObject.getDuration());
                        }
                        ImageLocation imageLocation2 = messageObject.mediaThumb;
                        if (imageLocation2 != null) {
                            BitmapDrawable bitmapDrawable2 = messageObject.strippedThumb;
                            if (bitmapDrawable2 != null) {
                                imageReceiver4.setImage(imageLocation2, str3, bitmapDrawable2, null, obj, 0);
                            } else {
                                imageReceiver4.setImage(imageLocation2, str3, messageObject.mediaSmallThumb, zzhr.m(str3, "_b"), null, 0L, null, obj, 0);
                            }
                        } else if (messageObject.hasVideoCover()) {
                            TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 50);
                            TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, photoSize, false, closestPhotoSizeWithSize3, this.isStory);
                            if (closestPhotoSizeWithSize4 == closestPhotoSizeWithSize3) {
                                closestPhotoSizeWithSize3 = null;
                            }
                            if (messageObject.strippedThumb != null) {
                                imageReceiver4.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize4, messageObject.photoThumbsObject), str3, null, null, messageObject.strippedThumb, closestPhotoSizeWithSize4 != null ? closestPhotoSizeWithSize4.size : 0L, null, obj, messageObject.shouldEncryptPhotoOrVideo() ? 2 : 1);
                            } else {
                                imageReceiver4.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize4, messageObject.photoThumbsObject), str3, ImageLocation.getForObject(closestPhotoSizeWithSize3, messageObject.photoThumbsObject), zzhr.m(str3, "_b"), closestPhotoSizeWithSize4 != null ? closestPhotoSizeWithSize4.size : 0L, null, obj, messageObject.shouldEncryptPhotoOrVideo() ? 2 : 1);
                            }
                        } else {
                            TLRPC.Document document4 = messageObject.getDocument();
                            TLRPC.PhotoSize closestPhotoSizeWithSize5 = FileLoader.getClosestPhotoSizeWithSize(document4.thumbs, 50);
                            j = 0;
                            TLRPC.PhotoSize closestPhotoSizeWithSize6 = FileLoader.getClosestPhotoSizeWithSize(document4.thumbs, photoSize, false, null, this.isStory);
                            TLRPC.PhotoSize photoSize2 = (closestPhotoSizeWithSize5 != closestPhotoSizeWithSize6 || this.isStory) ? closestPhotoSizeWithSize6 : null;
                            if (closestPhotoSizeWithSize5 != null) {
                                if (messageObject.strippedThumb != null) {
                                    imageReceiver4.setImage(ImageLocation.getForDocument(photoSize2, document4), str3, messageObject.strippedThumb, null, obj, 0);
                                } else {
                                    imageReceiver4.setImage(ImageLocation.getForDocument(photoSize2, document4), str3, ImageLocation.getForDocument(closestPhotoSizeWithSize5, document4), zzhr.m(str3, "_b"), null, 0L, null, obj, 0);
                                }
                            }
                        }
                    } else {
                        j = 0;
                        if (photo3 != null && !messageObject.photoThumbs.isEmpty()) {
                            if (messageObject.mediaExists) {
                                imageLocation = messageObject.mediaThumb;
                                if (imageLocation != null) {
                                    bitmapDrawable = messageObject.strippedThumb;
                                    if (bitmapDrawable != null) {
                                        imageReceiver4.setImage(imageLocation, str3, bitmapDrawable, null, obj, 0);
                                    } else {
                                        imageReceiver4.setImage(imageLocation, str3, messageObject.mediaSmallThumb, zzhr.m(str3, "_b"), null, 0L, null, obj, 0);
                                    }
                                } else {
                                    closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 50);
                                    closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, photoSize, false, closestPhotoSizeWithSize, this.isStory);
                                    if (closestPhotoSizeWithSize2 == closestPhotoSizeWithSize) {
                                        closestPhotoSizeWithSize = null;
                                    }
                                    if (messageObject.strippedThumb != null) {
                                        ImageLocation forObject2 = ImageLocation.getForObject(closestPhotoSizeWithSize2, messageObject.photoThumbsObject);
                                        BitmapDrawable bitmapDrawable3 = messageObject.strippedThumb;
                                        if (closestPhotoSizeWithSize2 != null) {
                                            j3 = closestPhotoSizeWithSize2.size;
                                        } else {
                                            j3 = 0;
                                        }
                                        if (messageObject.shouldEncryptPhotoOrVideo()) {
                                            i3 = 2;
                                        } else {
                                            i3 = 1;
                                        }
                                        imageReceiver4.setImage(forObject2, str3, null, null, bitmapDrawable3, j3, null, obj, i3);
                                    } else {
                                        ImageLocation forObject3 = ImageLocation.getForObject(closestPhotoSizeWithSize2, messageObject.photoThumbsObject);
                                        if (z) {
                                            forObject = null;
                                        } else {
                                            forObject = ImageLocation.getForObject(closestPhotoSizeWithSize, messageObject.photoThumbsObject);
                                        }
                                        String strM = zzhr.m(str3, "_b");
                                        if (closestPhotoSizeWithSize2 != null) {
                                            j2 = closestPhotoSizeWithSize2.size;
                                        } else {
                                            j2 = 0;
                                        }
                                        if (messageObject.shouldEncryptPhotoOrVideo()) {
                                            i2 = 2;
                                        } else {
                                            i2 = 1;
                                        }
                                        imageReceiver4.setImage(forObject3, str3, forObject, strM, j2, null, obj, i2);
                                    }
                                }
                            } else {
                                if (System.currentTimeMillis() - lastUpdateDownloadSettingsTime > 5000) {
                                    lastUpdateDownloadSettingsTime = System.currentTimeMillis();
                                    lastAutoDownload = DownloadController.getInstance(i8).canDownloadMedia(messageObject);
                                }
                                if (lastAutoDownload || this.isStory) {
                                    imageLocation = messageObject.mediaThumb;
                                    if (imageLocation != null) {
                                        bitmapDrawable = messageObject.strippedThumb;
                                        if (bitmapDrawable != null) {
                                            imageReceiver4.setImage(imageLocation, str3, bitmapDrawable, null, obj, 0);
                                        } else {
                                            imageReceiver4.setImage(imageLocation, str3, messageObject.mediaSmallThumb, zzhr.m(str3, "_b"), null, 0L, null, obj, 0);
                                        }
                                    } else {
                                        closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 50);
                                        closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, photoSize, false, closestPhotoSizeWithSize, this.isStory);
                                        if (closestPhotoSizeWithSize2 == closestPhotoSizeWithSize) {
                                            closestPhotoSizeWithSize = null;
                                        }
                                        if (messageObject.strippedThumb != null) {
                                            ImageLocation forObject4 = ImageLocation.getForObject(closestPhotoSizeWithSize2, messageObject.photoThumbsObject);
                                            BitmapDrawable bitmapDrawable4 = messageObject.strippedThumb;
                                            if (closestPhotoSizeWithSize2 != null) {
                                                j3 = closestPhotoSizeWithSize2.size;
                                            } else {
                                                j3 = 0;
                                            }
                                            if (messageObject.shouldEncryptPhotoOrVideo()) {
                                                i3 = 2;
                                            } else {
                                                i3 = 1;
                                            }
                                            imageReceiver4.setImage(forObject4, str3, null, null, bitmapDrawable4, j3, null, obj, i3);
                                        } else {
                                            ImageLocation forObject5 = ImageLocation.getForObject(closestPhotoSizeWithSize2, messageObject.photoThumbsObject);
                                            if (z) {
                                                forObject = null;
                                            } else {
                                                forObject = ImageLocation.getForObject(closestPhotoSizeWithSize, messageObject.photoThumbsObject);
                                            }
                                            String strM2 = zzhr.m(str3, "_b");
                                            if (closestPhotoSizeWithSize2 != null) {
                                                j2 = closestPhotoSizeWithSize2.size;
                                            } else {
                                                j2 = 0;
                                            }
                                            if (messageObject.shouldEncryptPhotoOrVideo()) {
                                                i2 = 2;
                                            } else {
                                                i2 = 1;
                                            }
                                            imageReceiver4.setImage(forObject5, str3, forObject, strM2, j2, null, obj, i2);
                                        }
                                    }
                                } else {
                                    BitmapDrawable bitmapDrawable5 = messageObject.strippedThumb;
                                    if (bitmapDrawable5 != null) {
                                        imageReceiver4.setImage(null, null, null, null, bitmapDrawable5, 0L, null, obj, 0);
                                    } else {
                                        imageReceiver4.setImage(null, null, ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 50), messageObject.photoThumbsObject), "b", null, 0L, null, obj, 0);
                                    }
                                }
                            }
                        }
                    }
                    if (imageReceiver3.getBitmap() != null) {
                        imageReceiver3.getBitmap().recycle();
                        imageReceiver3.setImageBitmap((Bitmap) null);
                    }
                    if (imageReceiver4.getBitmap() != null && this.currentMessageObject.hasMediaSpoilers() && !this.currentMessageObject.isMediaSpoilersRevealed) {
                        imageReceiver3.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver4.getBitmap()));
                    }
                    storyItem = messageObject.storyItem;
                    if (storyItem != null) {
                        imageReceiver4.addDecorator(new StoryWidgetsImageDecorator(storyItem));
                    }
                    setPrivacyType(getPrivacyType(messageObject));
                    if (this.isSearchingHashtag) {
                        dialogId = messageObject.getDialogId();
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                        spannableStringBuilder.append((CharSequence) MessagesController.getInstance(i8).getPeerName(dialogId));
                        if (i5 == 2) {
                            f = 16.0f;
                        } else {
                            f = 13.66f;
                        }
                        avatarSpan = new AvatarSpan(this, f, i8);
                        i4 = avatarSpan.currentAccount;
                        if (dialogId >= j) {
                            avatarSpan.setUser(MessagesController.getInstance(i4).getUser(Long.valueOf(dialogId)));
                        } else {
                            avatarSpan.setChat(MessagesController.getInstance(i4).getChat(Long.valueOf(-dialogId)));
                        }
                        spannableStringBuilder.setSpan(avatarSpan, 0, 1, 33);
                        if (i5 == 2) {
                            f2 = 14.0f;
                        } else {
                            f2 = 10.1666f;
                        }
                        this.authorText = new Text(spannableStringBuilder, f2, AndroidUtilities.bold());
                    }
                    updateAccessibilityDescription();
                    invalidate();
                }
                imageReceiver4.setImage(ImageLocation.getForPath(str), str3, null, null, obj, 0);
            } else {
                storyItem4.dialogId = messageObject.getDialogId();
                Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.msg_emoji_recent).mutate();
                drawableMutate.setColorFilter(new PorterDuffColorFilter(1090519039, PorterDuff.Mode.SRC_IN));
                imageReceiver4.setImageBitmap(new CombinedDrawable(new ColorDrawable(-13421773), drawableMutate));
            }
            j = 0;
            if (imageReceiver3.getBitmap() != null) {
                imageReceiver3.getBitmap().recycle();
                imageReceiver3.setImageBitmap((Bitmap) null);
            }
            if (imageReceiver4.getBitmap() != null) {
                imageReceiver3.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver4.getBitmap()));
            }
            storyItem = messageObject.storyItem;
            if (storyItem != null) {
                imageReceiver4.addDecorator(new StoryWidgetsImageDecorator(storyItem));
            }
            setPrivacyType(getPrivacyType(messageObject));
            if (this.isSearchingHashtag) {
                dialogId = messageObject.getDialogId();
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x ");
                spannableStringBuilder2.append((CharSequence) MessagesController.getInstance(i8).getPeerName(dialogId));
                if (i5 == 2) {
                    f = 16.0f;
                } else {
                    f = 13.66f;
                }
                avatarSpan = new AvatarSpan(this, f, i8);
                i4 = avatarSpan.currentAccount;
                if (dialogId >= j) {
                    avatarSpan.setUser(MessagesController.getInstance(i4).getUser(Long.valueOf(dialogId)));
                } else {
                    avatarSpan.setChat(MessagesController.getInstance(i4).getChat(Long.valueOf(-dialogId)));
                }
                spannableStringBuilder2.setSpan(avatarSpan, 0, 1, 33);
                if (i5 == 2) {
                    f2 = 14.0f;
                } else {
                    f2 = 10.1666f;
                }
                this.authorText = new Text(spannableStringBuilder2, f2, AndroidUtilities.bold());
            }
            updateAccessibilityDescription();
            invalidate();
        }
        j = 0;
        imageReceiver4.setImageBitmap(getContext().getDrawable(R.drawable.photo_placeholder_in));
        if (imageReceiver3.getBitmap() != null) {
            imageReceiver3.getBitmap().recycle();
            imageReceiver3.setImageBitmap((Bitmap) null);
        }
        if (imageReceiver4.getBitmap() != null) {
            imageReceiver3.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver4.getBitmap()));
        }
        storyItem = messageObject.storyItem;
        if (storyItem != null) {
            imageReceiver4.addDecorator(new StoryWidgetsImageDecorator(storyItem));
        }
        setPrivacyType(getPrivacyType(messageObject));
        if (this.isSearchingHashtag) {
            dialogId = messageObject.getDialogId();
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("x ");
            spannableStringBuilder3.append((CharSequence) MessagesController.getInstance(i8).getPeerName(dialogId));
            if (i5 == 2) {
                f = 16.0f;
            } else {
                f = 13.66f;
            }
            avatarSpan = new AvatarSpan(this, f, i8);
            i4 = avatarSpan.currentAccount;
            if (dialogId >= j) {
                avatarSpan.setUser(MessagesController.getInstance(i4).getUser(Long.valueOf(dialogId)));
            } else {
                avatarSpan.setChat(MessagesController.getInstance(i4).getChat(Long.valueOf(-dialogId)));
            }
            spannableStringBuilder3.setSpan(avatarSpan, 0, 1, 33);
            if (i5 == 2) {
                f2 = 14.0f;
            } else {
                f2 = 10.1666f;
            }
            this.authorText = new Text(spannableStringBuilder3, f2, AndroidUtilities.bold());
        }
        updateAccessibilityDescription();
        invalidate();
    }

    public void setReorder(boolean z) {
        this.reorder = z;
        invalidate();
    }

    public final void setReordering(boolean z, boolean z2) {
        if (this.reordering == z) {
            return;
        }
        this.reordering = z;
        if (!z2) {
            this.animatedReordering.force(z);
        }
        invalidate();
    }

    public void setStyle(int i) {
        if (this.style == i) {
            return;
        }
        this.style = i;
        if (i == 1) {
            CheckBoxBase checkBoxBase = new CheckBoxBase(null, this, 21);
            this.checkBoxBase = checkBoxBase;
            checkBoxBase.setColor(-1, Theme.key_sharedMedia_photoPlaceholder, Theme.key_checkboxCheck);
            this.checkBoxBase.setDrawUnchecked(true);
            this.checkBoxBase.setBackgroundType(0);
            this.checkBoxBase.setBounds(0, 0, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
            if (this.attached) {
                this.checkBoxBase.attachedToWindow = true;
            }
            CanvasButton canvasButton = new CanvasButton(this);
            this.canvasButton = canvasButton;
            canvasButton.delegate = new ArticleViewer$$ExternalSyntheticLambda3(this, 29);
        }
    }

    public final void setVideoText(String str, boolean z) {
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

    public final void startRevealMedia(float f, float f2) {
        this.spoilerRevealX = f;
        this.spoilerRevealY = f2;
        this.spoilerMaxRadius = (float) Math.sqrt(Math.pow(getHeight(), 2.0d) + Math.pow(getWidth(), 2.0d));
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration((long) MathUtils.clamp(this.spoilerMaxRadius * 0.3f, 250.0f, 550.0f));
        duration.setInterpolator(CubicBezierInterpolator.EASE_BOTH);
        duration.addUpdateListener(new BotButton$$ExternalSyntheticLambda0(this, 10));
        duration.addListener(new ArticleViewer.AnonymousClass25(this, 18));
        duration.start();
    }

    public final void updateAccessibilityDescription() {
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
            if (!messageObject.isLivePhoto()) {
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
            string = LocaleController.getString(R.string.AccDescrLivePhoto);
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

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return this.viewsText == drawable || super.verifyDrawable(drawable);
    }

    public final boolean viewsOnLeft(float f) {
        int width;
        if (this.isStory && this.currentParentColumnsCount < 5) {
            int iDp = AndroidUtilities.dp(26.0f) + ((int) this.viewsText.getCurrentWidth());
            if (this.showVideoLayout) {
                int iDp2 = AndroidUtilities.dp(8.0f);
                StaticLayout staticLayout = this.videoInfoLayot;
                width = iDp2 + (staticLayout != null ? staticLayout.getWidth() : 0) + (this.drawVideoIcon ? AndroidUtilities.dp(10.0f) : 0);
            } else {
                width = 0;
            }
            if (iDp + ((iDp <= 0 || width <= 0) ? 0 : AndroidUtilities.dp(8.0f)) + width > f) {
                return true;
            }
        }
        return false;
    }
}
