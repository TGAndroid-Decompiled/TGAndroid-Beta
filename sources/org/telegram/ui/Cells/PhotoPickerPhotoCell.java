package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.internal.mlkit_vision_common.zzko;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.GradientProtectionDrawable;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.BoostsActivity;
import org.telegram.ui.BoostsActivity$$ExternalSyntheticLambda4;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.Premium.PremiumGradient;
import org.telegram.ui.Components.poll.sheets.CountrySelectBottomSheet;

public final class PhotoPickerPhotoCell extends FrameLayout {
    public final CheckBox2 checkBox;
    public final FrameLayout checkFrame;
    public int extraWidth;
    public final BackupImageView imageView;
    public int itemWidth;
    public final AnonymousClass1 videoInfoContainer;
    public final TextView videoTextView;

    public PhotoPickerPhotoCell(Context context) {
        super(context);
        new Paint();
        setWillNotDraw(false);
        BackupImageView backupImageView = new BackupImageView(context);
        this.imageView = backupImageView;
        backupImageView.setRoundRadius(AndroidUtilities.dp(4.0f));
        addView(backupImageView, LayoutHelper.createFrame(-1, -1.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.checkFrame = frameLayout;
        addView(frameLayout, LayoutHelper.createFrame(42, 42, 53));
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(context);
        this.videoInfoContainer = anonymousClass1;
        anonymousClass1.setWillNotDraw(false);
        anonymousClass1.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        addView(anonymousClass1, LayoutHelper.createFrame(-1, 16, 83));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.ic_video);
        anonymousClass1.addView(imageView, LayoutHelper.createFrame(-2, -2, 19));
        TextView textView = new TextView(context);
        this.videoTextView = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        anonymousClass1.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 19, 18.0f, -0.7f, 0.0f, 0.0f));
        CheckBox2 checkBox2 = new CheckBox2(context, 24);
        this.checkBox = checkBox2;
        checkBox2.setDrawBackgroundAsArc(11);
        checkBox2.setColor(Theme.key_chat_attachCheckBoxBackground, Theme.key_chat_attachPhotoBackground, Theme.key_chat_attachCheckBoxCheck);
        addView(checkBox2, LayoutHelper.createFrame(26, 26.0f, 51, 55.0f, 4.0f, 0.0f, 0.0f));
        checkBox2.setVisibility(0);
        setFocusable(true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.checkBox.setColor(Theme.key_chat_attachCheckBoxBackground, Theme.key_chat_attachPhotoBackground, Theme.key_chat_attachCheckBoxCheck);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.itemWidth + this.extraWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(this.itemWidth, 1073741824));
    }

    public void setImage(MediaController.PhotoEntry photoEntry) {
        Drawable drawable = getResources().getDrawable(R.drawable.nophotos);
        String str = photoEntry.thumbPath;
        BackupImageView backupImageView = this.imageView;
        if (str != null) {
            backupImageView.setImage(str, null, drawable);
            return;
        }
        if (photoEntry.path == null) {
            backupImageView.setImageDrawable(drawable);
            return;
        }
        backupImageView.setOrientation(photoEntry.orientation, photoEntry.invert, true);
        boolean zIsLivePhoto = photoEntry.isLivePhoto();
        AnonymousClass1 anonymousClass1 = this.videoInfoContainer;
        if (zIsLivePhoto) {
            anonymousClass1.setVisibility(4);
            setContentDescription(LocaleController.getString(R.string.AttachLivePhoto));
            backupImageView.setImage("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, drawable);
            return;
        }
        if (!photoEntry.isVideo) {
            anonymousClass1.setVisibility(4);
            setContentDescription(LocaleController.getString(R.string.AttachPhoto));
            backupImageView.setImage("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, drawable);
            return;
        }
        anonymousClass1.setVisibility(0);
        this.videoTextView.setText(AndroidUtilities.formatShortDuration(photoEntry.duration));
        StringBuilder sb = new StringBuilder();
        zzko.m(R.string.AttachVideo, ", ", sb);
        sb.append(LocaleController.formatDuration(photoEntry.duration));
        setContentDescription(sb.toString());
        backupImageView.setImage("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, drawable);
    }

    public void setNum(int i) {
        this.checkBox.setNum(i);
    }

    public final class AnonymousClass1 extends FrameLayout {
        public final int $r8$classId = 0;
        public final Object paint;
        public final Object path;
        public final Object radii;
        public final Object rect;

        public AnonymousClass1(Context context) {
            super(context);
            this.path = new Path();
            this.radii = new float[8];
            this.rect = new RectF();
            this.paint = new Paint(1);
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            ValueAnimator valueAnimator;
            ValueAnimator valueAnimator2;
            switch (this.$r8$classId) {
                case 1:
                    LimitPreviewView limitPreviewView = (LimitPreviewView) this.rect;
                    boolean z = limitPreviewView.isBoostsStyle;
                    Paint paint = (Paint) this.paint;
                    Theme.ResourcesProvider resourcesProvider = (Theme.ResourcesProvider) this.radii;
                    if (!z) {
                        paint.setColor(Theme.getColor(Theme.key_windowBackgroundGray, resourcesProvider));
                    } else if (limitPreviewView.isStatistic || limitPreviewView.isRatingStyle) {
                        paint.setColor(Theme.getColor(Theme.key_listSelector, resourcesProvider));
                    } else {
                        paint.setColor(Theme.getColor(Theme.key_graySection, resourcesProvider));
                    }
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    LimitPreviewView.DarkGradientProvider darkGradientProvider = limitPreviewView.darkGradientProvider;
                    if (darkGradientProvider != null) {
                        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), ((BoostsActivity) ((BoostsActivity$$ExternalSyntheticLambda4) darkGradientProvider).f$0).setDarkGradientLocation(getX() + ((ViewGroup) getParent()).getX(), getY() + ((ViewGroup) getParent()).getY()));
                    } else {
                        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
                    }
                    canvas.save();
                    if (!limitPreviewView.isBoostsStyle) {
                        canvas.clipRect(limitPreviewView.width1, 0, getMeasuredWidth(), getMeasuredHeight());
                    }
                    Paint mainGradientPaint = limitPreviewView.isRatingStyle ? limitPreviewView.ratingPaint : limitPreviewView.darkGradientProvider != null ? (Paint) this.path : PremiumGradient.getInstance().getMainGradientPaint();
                    ViewGroup viewGroup = limitPreviewView.parentVideForGradient;
                    if (viewGroup != null) {
                        PremiumGradient.PremiumGradientTools premiumGradientTools = limitPreviewView.staticGradient;
                        if (premiumGradientTools != null) {
                            mainGradientPaint = premiumGradientTools.paint;
                            premiumGradientTools.gradientMatrixLinear(limitPreviewView.gradientTotalHeight, -limitPreviewView.gradientYOffset);
                        } else {
                            float y = 0.0f;
                            for (View view = this; view != viewGroup; view = (View) view.getParent()) {
                                y += view.getY();
                            }
                            PremiumGradient.getInstance().mainGradient.gradientMatrix(0, 0, viewGroup.getMeasuredWidth(), viewGroup.getMeasuredHeight(), limitPreviewView.getGlobalXOffset() - getLeft(), -y);
                        }
                    } else {
                        PremiumGradient.getInstance().mainGradient.gradientMatrix(0, 0, limitPreviewView.getMeasuredWidth(), limitPreviewView.getMeasuredHeight(), limitPreviewView.getGlobalXOffset() - getLeft(), -getTop());
                    }
                    int alpha = mainGradientPaint.getAlpha();
                    if (limitPreviewView.animateArrowFadeOut && (valueAnimator2 = limitPreviewView.arrowAnimator) != null) {
                        mainGradientPaint.setAlpha((int) ((1.0f - ((Float) valueAnimator2.getAnimatedValue()).floatValue()) * alpha));
                    } else if (limitPreviewView.animateArrowFadeIn && (valueAnimator = limitPreviewView.arrowAnimator) != null) {
                        mainGradientPaint.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * alpha));
                    }
                    if (limitPreviewView.isBoostsStyle) {
                        if (limitPreviewView.isRatingNegative || limitPreviewView.drawFromRight) {
                            AndroidUtilities.rectTmp.set(limitPreviewView.width1, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                        } else {
                            AndroidUtilities.rectTmp.set(0.0f, 0.0f, limitPreviewView.width1, getMeasuredHeight());
                        }
                    }
                    canvas.drawRoundRect(AndroidUtilities.rectTmp, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), mainGradientPaint);
                    mainGradientPaint.setAlpha(alpha);
                    canvas.restore();
                    if (limitPreviewView.staticGradient == null && limitPreviewView.invalidationEnabled) {
                        invalidate();
                    }
                    super.dispatchDraw(canvas);
                    break;
                case 2:
                    Paint paint2 = (Paint) this.paint;
                    paint2.setColor(Theme.getColor(Theme.key_sheet_scrollUp, (Theme.ResourcesProvider) this.radii));
                    float fDp = AndroidUtilities.dp(18.0f);
                    float height = getHeight() / 2.0f;
                    LimitReachedBottomSheet.BoostFeatureCell boostFeatureCell = (LimitReachedBottomSheet.BoostFeatureCell) this.rect;
                    canvas.drawLine(fDp, height, boostFeatureCell.levelTextView.getLeft() - AndroidUtilities.dp(20.0f), getHeight() / 2.0f, paint2);
                    canvas.drawLine(AndroidUtilities.dp(20.0f) + boostFeatureCell.levelTextView.getRight(), getHeight() / 2.0f, getWidth() - AndroidUtilities.dp(18.0f), getHeight() / 2.0f, paint2);
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(boostFeatureCell.levelTextView.getLeft() - AndroidUtilities.dp(15.0f), ((boostFeatureCell.levelTextView.getBottom() + boostFeatureCell.levelTextView.getTop()) - AndroidUtilities.dp(30.0f)) / 2.0f, AndroidUtilities.dp(15.0f) + boostFeatureCell.levelTextView.getRight(), (AndroidUtilities.dp(30.0f) + (boostFeatureCell.levelTextView.getBottom() + boostFeatureCell.levelTextView.getTop())) / 2.0f);
                    canvas.save();
                    canvas.translate(rectF2.left, rectF2.top);
                    rectF2.set(0.0f, 0.0f, rectF2.width(), rectF2.height());
                    PremiumGradient.PremiumGradientTools premiumGradientTools2 = (PremiumGradient.PremiumGradientTools) this.path;
                    premiumGradientTools2.gradientMatrix(rectF2);
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), premiumGradientTools2.paint);
                    canvas.restore();
                    super.dispatchDraw(canvas);
                    break;
                default:
                    super.dispatchDraw(canvas);
                    break;
            }
        }

        @Override
        public boolean drawChild(Canvas canvas, View view, long j) {
            switch (this.$r8$classId) {
                case 3:
                    boolean zDrawChild = super.drawChild(canvas, view, j);
                    CountrySelectBottomSheet countrySelectBottomSheet = (CountrySelectBottomSheet) this.paint;
                    int i = (int) countrySelectBottomSheet.animatorSelectorContainerHeight.factor;
                    if (view == countrySelectBottomSheet.spansContainer && i > 0) {
                        int iDp = AndroidUtilities.dp(40.0f);
                        int width = getWidth();
                        int iDp2 = AndroidUtilities.dp(48.0f);
                        GradientProtectionDrawable gradientProtectionDrawable = (GradientProtectionDrawable) this.path;
                        gradientProtectionDrawable.setBounds(0, iDp, width, iDp2);
                        int i2 = Theme.key_dialogBackground;
                        Theme.ResourcesProvider resourcesProvider = (Theme.ResourcesProvider) this.rect;
                        gradientProtectionDrawable.setColor(Theme.getColor(i2, resourcesProvider));
                        gradientProtectionDrawable.draw(canvas);
                        int iDp3 = AndroidUtilities.dp(48.0f) + i;
                        int iDp4 = iDp3 - AndroidUtilities.dp(8.0f);
                        int width2 = getWidth();
                        GradientProtectionDrawable gradientProtectionDrawable2 = (GradientProtectionDrawable) this.radii;
                        gradientProtectionDrawable2.setBounds(0, iDp4, width2, iDp3);
                        gradientProtectionDrawable2.setColor(Theme.getColor(i2, resourcesProvider));
                        gradientProtectionDrawable2.draw(canvas);
                    }
                    return zDrawChild;
                default:
                    return super.drawChild(canvas, view, j);
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
            switch (this.$r8$classId) {
                case 0:
                    RectF rectF = (RectF) this.rect;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    float[] fArr = (float[]) this.radii;
                    fArr[3] = 0.0f;
                    fArr[2] = 0.0f;
                    fArr[1] = 0.0f;
                    fArr[0] = 0.0f;
                    float fDp = AndroidUtilities.dp(4.0f);
                    fArr[7] = fDp;
                    fArr[6] = fDp;
                    fArr[5] = fDp;
                    fArr[4] = fDp;
                    Path path = (Path) this.path;
                    path.reset();
                    path.addRoundRect(rectF, fArr, Path.Direction.CW);
                    path.close();
                    Paint paint = (Paint) this.paint;
                    paint.setColor(2130706432);
                    canvas.drawPath(path, paint);
                    break;
                default:
                    super.onDraw(canvas);
                    break;
            }
        }

        @Override
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            switch (this.$r8$classId) {
                case 1:
                    if (getChildCount() != 2) {
                        super.onLayout(z, i, i2, i3, i4);
                    } else {
                        View childAt = getChildAt(0);
                        View childAt2 = getChildAt(1);
                        int measuredWidth = childAt.getMeasuredWidth();
                        int i5 = i4 - i2;
                        childAt.layout(0, 0, measuredWidth, i5);
                        childAt2.layout(measuredWidth, 0, i3 - i, i5);
                    }
                    break;
                default:
                    super.onLayout(z, i, i2, i3, i4);
                    break;
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
            switch (this.$r8$classId) {
                case 1:
                    if (getChildCount() != 2) {
                        super.onMeasure(i, i2);
                    } else {
                        int size = View.MeasureSpec.getSize(i);
                        int size2 = View.MeasureSpec.getSize(i2);
                        LimitPreviewView limitPreviewView = (LimitPreviewView) this.rect;
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
                        LimitPreviewView.TextViewHolder textViewHolder = limitPreviewView.defaultLayout;
                        textViewHolder.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        int measuredWidth = textViewHolder.getMeasuredWidth();
                        int iDp = AndroidUtilities.dp(24.0f);
                        AnimatedTextView animatedTextView = limitPreviewView.defaultText;
                        int measuredWidth2 = animatedTextView.getMeasuredWidth() + iDp;
                        TextView textView = limitPreviewView.defaultCount;
                        int iMax = Math.max(measuredWidth, measuredWidth2 + (textView.getVisibility() == 0 ? textView.getMeasuredWidth() + AndroidUtilities.dp(24.0f) : 0));
                        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
                        int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
                        LimitPreviewView.TextViewHolder textViewHolder2 = limitPreviewView.premiumLayout;
                        textViewHolder2.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
                        boolean z = limitPreviewView.isBoostsStyle;
                        AnimatedTextView animatedTextView2 = limitPreviewView.premiumCount;
                        if (z) {
                            float f = limitPreviewView.percent;
                            Theme.ResourcesProvider resourcesProvider = (Theme.ResourcesProvider) this.radii;
                            if (f == 0.0f) {
                                limitPreviewView.width1 = 0;
                                if (!limitPreviewView.animateArrowFadeIn && !limitPreviewView.animateArrowFadeOut) {
                                    animatedTextView2.setTextColor((!limitPreviewView.isRatingNegative && limitPreviewView.darkGradientProvider == null) ? Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider) : -1);
                                    animatedTextView.setTextColor(limitPreviewView.darkGradientProvider == null ? Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider) : -1);
                                }
                            } else if (f < 1.0f) {
                                float measuredWidth3 = limitPreviewView.isRatingNegative ? 0.0f : textViewHolder.getMeasuredWidth() - AndroidUtilities.dp(8.0f);
                                limitPreviewView.width1 = (int) ((((size - measuredWidth3) - (limitPreviewView.isRatingNegative ? 0.0f : textViewHolder2.getMeasuredWidth() - AndroidUtilities.dp(8.0f))) * limitPreviewView.percent) + measuredWidth3);
                                if (!limitPreviewView.animateArrowFadeIn && !limitPreviewView.animateArrowFadeOut) {
                                    animatedTextView2.setTextColor((!limitPreviewView.isRatingNegative && limitPreviewView.darkGradientProvider == null) ? Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider) : -1);
                                    animatedTextView.setTextColor(-1);
                                }
                            } else {
                                limitPreviewView.width1 = size;
                                if (!limitPreviewView.animateArrowFadeIn && !limitPreviewView.animateArrowFadeOut) {
                                    animatedTextView2.setTextColor(-1);
                                    animatedTextView.setTextColor(-1);
                                }
                            }
                        } else {
                            int iClamp = (int) Utilities.clamp(size * limitPreviewView.percent, size - Math.max(textViewHolder2.getMeasuredWidth(), (limitPreviewView.premiumText.getMeasuredWidth() + AndroidUtilities.dp(24.0f)) + (animatedTextView2.getVisibility() == 0 ? animatedTextView2.getMeasuredWidth() + AndroidUtilities.dp(24.0f) : 0)), iMax);
                            limitPreviewView.width1 = iClamp;
                            textViewHolder.measure(View.MeasureSpec.makeMeasureSpec(iClamp, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                            textViewHolder2.measure(View.MeasureSpec.makeMeasureSpec(size - limitPreviewView.width1, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                        }
                        setMeasuredDimension(size, size2);
                    }
                    break;
                default:
                    super.onMeasure(i, i2);
                    break;
            }
        }

        public AnonymousClass1(Context context, Theme.ResourcesProvider resourcesProvider, CountrySelectBottomSheet countrySelectBottomSheet) {
            super(context);
            this.paint = countrySelectBottomSheet;
            this.rect = resourcesProvider;
            this.path = new GradientProtectionDrawable(2);
            this.radii = new GradientProtectionDrawable(8);
        }

        public AnonymousClass1(LimitPreviewView limitPreviewView, Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.rect = limitPreviewView;
            this.radii = resourcesProvider;
            this.paint = new Paint();
            Paint paint = new Paint();
            this.path = paint;
            paint.setColor(-1);
        }

        public AnonymousClass1(LimitReachedBottomSheet.BoostFeatureCell boostFeatureCell, Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.rect = boostFeatureCell;
            this.radii = resourcesProvider;
            this.path = new PremiumGradient.PremiumGradientTools(Theme.key_premiumGradient1, Theme.key_premiumGradient2, -1, -1, resourcesProvider);
            Paint paint = new Paint(1);
            this.paint = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(1.0f);
        }
    }

    public void setImage(MediaController.SearchImage searchImage) {
        Drawable drawable = getResources().getDrawable(R.drawable.nophotos);
        TLRPC.PhotoSize photoSize = searchImage.thumbPhotoSize;
        BackupImageView backupImageView = this.imageView;
        if (photoSize != null) {
            backupImageView.setImage(ImageLocation.getForPhoto(photoSize, searchImage.photo), (String) null, drawable, searchImage);
            return;
        }
        TLRPC.PhotoSize photoSize2 = searchImage.photoSize;
        if (photoSize2 != null) {
            backupImageView.setImage(ImageLocation.getForPhoto(photoSize2, searchImage.photo), "80_80", drawable, searchImage);
            return;
        }
        String str = searchImage.thumbPath;
        if (str != null) {
            backupImageView.setImage(str, null, drawable);
            return;
        }
        String str2 = searchImage.thumbUrl;
        if (str2 != null && str2.length() > 0) {
            backupImageView.setImage(searchImage.thumbUrl, null, drawable);
        } else if (MessageObject.isDocumentHasThumb(searchImage.document)) {
            backupImageView.setImage(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(searchImage.document.thumbs, 320), searchImage.document), (String) null, drawable, searchImage);
        } else {
            backupImageView.setImageDrawable(drawable);
        }
    }
}
