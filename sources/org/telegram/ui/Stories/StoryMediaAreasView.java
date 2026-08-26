package org.telegram.ui.Stories;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.LineHeightSpan;
import android.text.style.RelativeSizeSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.BaseCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Paint.Views.LocationMarker;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.Shaker$$ExternalSyntheticLambda0;
import org.telegram.ui.EmojiAnimationsOverlay;
import org.telegram.ui.LocationActivity;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.Stories.recorder.StoryEntry;
import org.telegram.ui.Stories.recorder.Weather;
import org.telegram.ui.bots.BotAdView$$ExternalSyntheticLambda2;
import org.telegram.ui.bots.BotSensors$1$$ExternalSyntheticLambda0;

public abstract class StoryMediaAreasView extends FrameLayout implements View.OnClickListener {
    public final Path clipPath;
    public final Paint cutPaint;
    public HintView2 hintView;
    public final FrameLayout hintsContainer;
    public ArrayList lastMediaAreas;
    public AreaView lastSelectedArea;
    public final Matrix matrix;
    public Bitmap parentBitmap;
    public final AnimatedFloat parentHighlightAlpha;
    public final AnimatedFloat parentHighlightScaleAlpha;
    public final PeerStoriesView.AnonymousClass4 parentView;
    public final float[] point;
    public final Rect rect;
    public final RectF rectF;
    public final DarkThemeResourceProvider resourcesProvider;
    public AreaView selectedArea;
    public boolean shined;

    public final class AnonymousClass1 extends LocationActivity {
        @Override
        public final boolean disablePermissionCheck() {
            return true;
        }
    }

    public final class AnonymousClass2 implements LineHeightSpan {
        @Override
        public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
            fontMetricsInt.ascent -= AndroidUtilities.dp(2.0f);
            fontMetricsInt.top -= AndroidUtilities.dp(2.0f);
        }
    }

    public class AreaView extends View {
        public final ButtonBounce bounce;
        public final boolean bounceOnTap;
        public final Path clipPath;
        public LinearGradient gradient;
        public final Matrix gradientMatrix;
        public final Paint gradientPaint;
        public final AnimatedFloat highlightAlpha;
        public final TL_stories.MediaArea mediaArea;
        public final boolean ripple;
        public final BaseCell.RippleDrawableSafe rippleDrawable;
        public final boolean scaleOnTap;
        public final BotSensors$1$$ExternalSyntheticLambda0 shineRunnable;
        public boolean shining;
        public long startTime;
        public LinearGradient strokeGradient;
        public final Paint strokeGradientPaint;
        public final boolean supportsBounds;
        public final boolean supportsShining;

        public AreaView(Context context, FrameLayout frameLayout, TL_stories.MediaArea mediaArea) {
            super(context);
            boolean z = true;
            this.gradientPaint = new Paint(1);
            Paint paint = new Paint(1);
            this.strokeGradientPaint = paint;
            this.gradientMatrix = new Matrix();
            BaseCell.RippleDrawableSafe rippleDrawableSafeCreateSelectorDrawable = Theme.createSelectorDrawable(1174405119, 2, -1);
            this.rippleDrawable = rippleDrawableSafeCreateSelectorDrawable;
            this.bounce = new ButtonBounce(this);
            this.supportsBounds = false;
            this.supportsShining = false;
            this.shining = false;
            this.clipPath = new Path();
            this.shineRunnable = new BotSensors$1$$ExternalSyntheticLambda0(this, 10);
            this.mediaArea = mediaArea;
            boolean z2 = mediaArea instanceof TL_stories.TL_mediaAreaGeoPoint;
            this.supportsBounds = z2 || (mediaArea instanceof TL_stories.TL_mediaAreaVenue) || (mediaArea instanceof TL_stories.TL_mediaAreaUrl);
            this.supportsShining = z2 || (mediaArea instanceof TL_stories.TL_mediaAreaVenue);
            if (!z2 && !(mediaArea instanceof TL_stories.TL_mediaAreaVenue) && (mediaArea.coordinates.flags & 1) == 0) {
                z = false;
            }
            this.scaleOnTap = z;
            this.ripple = z;
            this.bounceOnTap = z;
            this.highlightAlpha = new AnimatedFloat(frameLayout, 0L, 120L, new LinearInterpolator());
            paint.setStyle(Paint.Style.STROKE);
            rippleDrawableSafeCreateSelectorDrawable.setCallback(this);
        }

        public void customDraw(Canvas canvas) {
        }

        @Override
        public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            ButtonBounce buttonBounce = this.bounce;
            BaseCell.RippleDrawableSafe rippleDrawableSafe = this.rippleDrawable;
            if (action == 0) {
                if (getParent() instanceof View) {
                    View view = (View) getParent();
                    Objects.requireNonNull(view);
                    buttonBounce.setAdditionalInvalidate(new Shaker$$ExternalSyntheticLambda0(view, 0));
                }
                buttonBounce.setPressed(true);
                rippleDrawableSafe.setHotspot(motionEvent.getX(), motionEvent.getY());
                rippleDrawableSafe.setState(new int[]{16842919, 16842910});
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                buttonBounce.setPressed(false);
                rippleDrawableSafe.setState(new int[0]);
            }
            super.dispatchTouchEvent(motionEvent);
            return true;
        }

        public final void drawAbove(Canvas canvas) {
            if (this.ripple) {
                float innerRadius = getInnerRadius();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                Path path = this.clipPath;
                path.rewind();
                path.addRoundRect(rectF, innerRadius, innerRadius, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                int width = getWidth();
                int height = getHeight();
                BaseCell.RippleDrawableSafe rippleDrawableSafe = this.rippleDrawable;
                rippleDrawableSafe.setBounds(0, 0, width, height);
                rippleDrawableSafe.draw(canvas);
                canvas.restore();
            }
        }

        public float getInnerRadius() {
            TL_stories.MediaArea mediaArea;
            TL_stories.MediaAreaCoordinates mediaAreaCoordinates;
            if (!(getParent() instanceof View) || (mediaArea = this.mediaArea) == null || (mediaAreaCoordinates = mediaArea.coordinates) == null) {
                return getMeasuredHeight() * 0.2f;
            }
            return (mediaAreaCoordinates.flags & 1) != 0 ? (float) (((mediaAreaCoordinates.radius / 100.0d) * ((double) getWidth())) / ((double) getScaleX())) : getMeasuredHeight() * 0.2f;
        }

        @Override
        public final void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            float innerRadius = getInnerRadius();
            drawAbove(canvas);
            if (this.supportsShining && this.shining && this.gradient != null) {
                float measuredWidth = getMeasuredWidth() * 0.7f;
                float fCurrentTimeMillis = (System.currentTimeMillis() - this.startTime) / 600.0f;
                float measuredWidth2 = ((getMeasuredWidth() + measuredWidth) * fCurrentTimeMillis) - measuredWidth;
                if (fCurrentTimeMillis >= 1.0f) {
                    this.shining = false;
                    return;
                }
                Matrix matrix = this.gradientMatrix;
                matrix.reset();
                matrix.postScale(measuredWidth / 40.0f, 1.0f);
                matrix.postTranslate(measuredWidth2, 0.0f);
                this.gradient.setLocalMatrix(matrix);
                Paint paint = this.gradientPaint;
                paint.setShader(this.gradient);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas.drawRoundRect(rectF, innerRadius, innerRadius, paint);
                this.strokeGradient.setLocalMatrix(matrix);
                Paint paint2 = this.strokeGradientPaint;
                paint2.setShader(this.strokeGradient);
                float fDpf2 = AndroidUtilities.dpf2(1.5f);
                paint2.setStrokeWidth(fDpf2);
                float f = fDpf2 / 2.0f;
                rectF.inset(f, f);
                float f2 = innerRadius - f;
                canvas.drawRoundRect(rectF, f2, f2, paint2);
                invalidate();
            }
        }

        @Override
        public final boolean verifyDrawable(Drawable drawable) {
            return drawable == this.rippleDrawable || super.verifyDrawable(drawable);
        }
    }

    public final class FitViewWidget extends FrameLayout {
        public final LocationMarker child;
        public final TL_stories.MediaArea mediaArea;

        public FitViewWidget(Context context, LocationMarker locationMarker, TL_stories.MediaArea mediaArea) {
            super(context);
            this.mediaArea = mediaArea;
            this.child = locationMarker;
            addView(locationMarker);
        }

        @Override
        public final void onMeasure(int i, int i2) {
            LocationMarker locationMarker = this.child;
            locationMarker.measure(i, i2);
            int measuredWidth = (locationMarker.getMeasuredWidth() - locationMarker.getPaddingLeft()) - locationMarker.getPaddingRight();
            int measuredHeight = (locationMarker.getMeasuredHeight() - locationMarker.getPaddingTop()) - locationMarker.getPaddingBottom();
            float f = measuredWidth;
            float f2 = f / 2.0f;
            locationMarker.setPivotX(locationMarker.getPaddingLeft() + f2);
            float f3 = measuredHeight;
            float f4 = f3 / 2.0f;
            locationMarker.setPivotY(locationMarker.getPaddingTop() + f4);
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            setMeasuredDimension(size, size2);
            float f5 = size;
            float f6 = size2;
            float fMin = Math.min(f5 / f, f6 / f3);
            locationMarker.setTranslationX((f5 / 2.0f) - (f2 + locationMarker.getPaddingLeft()));
            locationMarker.setTranslationY((f6 / 2.0f) - (f4 + locationMarker.getPaddingTop()));
            locationMarker.setScaleX(fMin);
            locationMarker.setScaleY(fMin);
        }
    }

    public StoryMediaAreasView(Context context, PeerStoriesView.AnonymousClass4 anonymousClass4, DarkThemeResourceProvider darkThemeResourceProvider) {
        super(context);
        this.lastSelectedArea = null;
        this.selectedArea = null;
        this.hintView = null;
        this.matrix = new Matrix();
        this.point = new float[2];
        this.rect = new Rect();
        this.rectF = new RectF();
        Paint paint = new Paint(1);
        this.cutPaint = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setColor(-1);
        this.clipPath = new Path();
        this.shined = false;
        this.parentView = anonymousClass4;
        this.resourcesProvider = darkThemeResourceProvider;
        this.parentHighlightAlpha = new AnimatedFloat(anonymousClass4, 0L, 120L, new LinearInterpolator());
        this.parentHighlightScaleAlpha = new AnimatedFloat(anonymousClass4, 0L, 360L, CubicBezierInterpolator.EASE_OUT_QUINT);
        setClipChildren(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.hintsContainer = frameLayout;
        addView(frameLayout);
        setLayerType(2, null);
    }

    public static ArrayList getMediaAreasFor(StoryEntry storyEntry) {
        if (storyEntry == null || storyEntry.mediaEntities == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < storyEntry.mediaEntities.size(); i++) {
            if (((VideoEditedInfo.MediaEntity) storyEntry.mediaEntities.get(i)).mediaArea instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                arrayList.add(((VideoEditedInfo.MediaEntity) storyEntry.mediaEntities.get(i)).mediaArea);
            }
        }
        return arrayList;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        Canvas canvas2;
        float f;
        FrameLayout frameLayout = this.hintsContainer;
        if (view == frameLayout) {
            AreaView areaView = this.selectedArea;
            float f2 = this.parentHighlightAlpha.set((areaView == null || !areaView.supportsBounds || areaView.scaleOnTap) ? false : true);
            AreaView areaView2 = this.selectedArea;
            boolean z = areaView2 != null && areaView2.scaleOnTap;
            float f3 = this.parentHighlightScaleAlpha.set(z);
            RectF rectF = this.rectF;
            if (f2 > 0.0f) {
                canvas2 = canvas;
                f = 0.0f;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                canvas2.drawColor(Theme.multAlpha(f2, 402653184));
                for (int i = 0; i < getChildCount(); i++) {
                    View childAt = getChildAt(i);
                    if (childAt != frameLayout) {
                        AnimatedFloat animatedFloat = ((AreaView) childAt).highlightAlpha;
                        AreaView areaView3 = this.selectedArea;
                        float f4 = animatedFloat.set(childAt == areaView3 && areaView3.supportsBounds);
                        if (f4 > 0.0f) {
                            canvas2.save();
                            rectF.set(childAt.getX(), childAt.getY(), childAt.getX() + childAt.getMeasuredWidth(), childAt.getY() + childAt.getMeasuredHeight());
                            canvas2.rotate(childAt.getRotation(), rectF.centerX(), rectF.centerY());
                            Paint paint = this.cutPaint;
                            paint.setAlpha((int) (f4 * 255.0f));
                            canvas2.drawRoundRect(rectF, rectF.height() * 0.2f, rectF.height() * 0.2f, paint);
                            canvas2.restore();
                        }
                    }
                }
                canvas2.restore();
            } else {
                canvas2 = canvas;
                f = 0.0f;
            }
            if ((z || f3 > f) && this.lastSelectedArea != null) {
                if (this.parentBitmap == null) {
                    this.parentBitmap = ((PeerStoriesView.AnonymousClass3) this).this$0.getPlayingBitmap();
                }
                if (this.parentBitmap != null) {
                    canvas2.drawColor(Theme.multAlpha(f3, 805306368));
                    canvas2.save();
                    Path path = this.clipPath;
                    path.rewind();
                    rectF.set(this.lastSelectedArea.getX(), this.lastSelectedArea.getY(), this.lastSelectedArea.getX() + this.lastSelectedArea.getMeasuredWidth(), this.lastSelectedArea.getY() + this.lastSelectedArea.getMeasuredHeight());
                    AreaView areaView4 = this.lastSelectedArea;
                    float fLerp = AndroidUtilities.lerp(1.0f, (areaView4.bounceOnTap ? areaView4.bounce.getScale(0.05f) : 1.0f) * 1.05f, f3);
                    canvas2.scale(fLerp, fLerp, rectF.centerX(), rectF.centerY());
                    canvas2.rotate(this.lastSelectedArea.getRotation(), rectF.centerX(), rectF.centerY());
                    AreaView areaView5 = this.lastSelectedArea;
                    TL_stories.MediaAreaCoordinates mediaAreaCoordinates = areaView5.mediaArea.coordinates;
                    float measuredWidth = (mediaAreaCoordinates.flags & 1) != 0 ? (float) ((mediaAreaCoordinates.radius / 100.0d) * ((double) areaView5.getMeasuredWidth())) : areaView5.getMeasuredHeight() * 0.2f;
                    path.addRoundRect(rectF, measuredWidth, measuredWidth, Path.Direction.CW);
                    canvas2.clipPath(path);
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(f, f, getWidth(), getHeight());
                    int width = this.parentBitmap.getWidth();
                    int height = this.parentBitmap.getHeight();
                    Rect rect = this.rect;
                    rect.set(0, 0, width, height);
                    canvas2.rotate(-this.lastSelectedArea.getRotation(), rectF.centerX(), rectF.centerY());
                    canvas2.drawBitmap(this.parentBitmap, rect, rectF2, (Paint) null);
                    canvas2.restore();
                    canvas2.save();
                    canvas2.translate(this.lastSelectedArea.getX(), this.lastSelectedArea.getY());
                    canvas2.rotate(this.lastSelectedArea.getRotation(), this.lastSelectedArea.getPivotX(), this.lastSelectedArea.getPivotY());
                    canvas2.scale(this.lastSelectedArea.getScaleX() * fLerp, this.lastSelectedArea.getScaleY() * fLerp, this.lastSelectedArea.getPivotX(), this.lastSelectedArea.getPivotY());
                    this.lastSelectedArea.drawAbove(canvas2);
                    canvas2.restore();
                }
            } else {
                Bitmap bitmap = this.parentBitmap;
                if (bitmap != null) {
                    bitmap.recycle();
                    this.parentBitmap = null;
                }
            }
            invalidate();
        } else if (view instanceof AreaView) {
            canvas.save();
            canvas.translate(view.getLeft(), view.getTop());
            canvas.concat(view.getMatrix());
            ((AreaView) view).customDraw(canvas);
            canvas.restore();
        }
        return super.drawChild(canvas, view, j);
    }

    public Bitmap getPlayingBitmap() {
        return null;
    }

    @Override
    public final void onClick(View view) {
        boolean z;
        SpannableString spannableString;
        float f;
        float f2;
        SpannableString spannableString2;
        float f3;
        float f4;
        int i;
        float f5;
        boolean z2;
        int i2;
        AreaView areaView;
        if (view instanceof AreaView) {
            if (view instanceof StoryReactionWidgetView) {
                StoryReactionWidgetView storyReactionWidgetView = (StoryReactionWidgetView) view;
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1 = ((PeerStoriesView.AnonymousClass3) this).this$0;
                if (!anonymousClass1.isSelf) {
                    PeerStoriesView.StoryItemHolder storyItemHolder = anonymousClass1.currentStory;
                    if (storyItemHolder.storyItem != null) {
                        ReactionsLayoutInBubble.VisibleReaction visibleReactionFromTL = ReactionsLayoutInBubble.VisibleReaction.fromTL(storyReactionWidgetView.mediaArea.reaction);
                        if (!visibleReactionFromTL.equals(ReactionsLayoutInBubble.VisibleReaction.fromTL(storyItemHolder.storyItem.sent_reaction))) {
                            anonymousClass1.likeStory(visibleReactionFromTL);
                        }
                    }
                }
                storyReactionWidgetView.performHapticFeedback(3);
                storyReactionWidgetView.holder.imageReceiver.startAnimation();
                anonymousClass1.emojiAnimationsOverlay.showAnimationForWidget(storyReactionWidgetView);
                return;
            }
            if (this.selectedArea == view) {
                AndroidUtilities.runOnUIThread(new BotSensors$1$$ExternalSyntheticLambda0(this, 9), 200L);
                TL_stories.MediaArea mediaArea = this.selectedArea.mediaArea;
                if (mediaArea instanceof TL_stories.TL_mediaAreaChannelPost) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", ((TL_stories.TL_mediaAreaChannelPost) this.selectedArea.mediaArea).channel_id);
                    bundle.putInt("message_id", ((TL_stories.TL_mediaAreaChannelPost) this.selectedArea.mediaArea).msg_id);
                    ChatActivity chatActivity = new ChatActivity(bundle);
                    StoryViewer storyViewer = ((PeerStoriesView.AnonymousClass3) this).val$storyViewer;
                    if (storyViewer != null) {
                        storyViewer.presentFragment(chatActivity);
                    }
                    this.selectedArea = null;
                    invalidate();
                    return;
                }
                if (mediaArea instanceof TL_stories.TL_mediaAreaUrl) {
                    Browser.openUrl(getContext(), ((TL_stories.TL_mediaAreaUrl) this.selectedArea.mediaArea).url);
                    this.selectedArea = null;
                    invalidate();
                    return;
                }
                if (mediaArea instanceof TL_stories.TL_mediaAreaStarGift) {
                    String str = ((TL_stories.TL_mediaAreaStarGift) mediaArea).slug;
                    Browser.openUrl(getContext(), "https://" + MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix + "/nft/" + str);
                    this.selectedArea = null;
                    invalidate();
                    return;
                }
                AnonymousClass1 anonymousClass2 = new AnonymousClass1(3);
                anonymousClass2.fromStories = true;
                anonymousClass2.searchStories(this.selectedArea.mediaArea);
                anonymousClass2.setResourceProvider(this.resourcesProvider);
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                TL_stories.MediaArea mediaArea2 = this.selectedArea.mediaArea;
                if (mediaArea2 instanceof TL_stories.TL_mediaAreaVenue) {
                    TL_stories.TL_mediaAreaVenue tL_mediaAreaVenue = (TL_stories.TL_mediaAreaVenue) mediaArea2;
                    TLRPC.TL_messageMediaVenue tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                    tL_messageMediaVenue.venue_id = tL_mediaAreaVenue.venue_id;
                    tL_messageMediaVenue.venue_type = tL_mediaAreaVenue.venue_type;
                    tL_messageMediaVenue.title = tL_mediaAreaVenue.title;
                    tL_messageMediaVenue.address = tL_mediaAreaVenue.address;
                    tL_messageMediaVenue.provider = tL_mediaAreaVenue.provider;
                    tL_messageMediaVenue.geo = tL_mediaAreaVenue.geo;
                    tL_message.media = tL_messageMediaVenue;
                } else if (!(mediaArea2 instanceof TL_stories.TL_mediaAreaGeoPoint)) {
                    this.selectedArea = null;
                    invalidate();
                    return;
                } else {
                    anonymousClass2.setInitialMaxZoom(true);
                    TL_stories.TL_mediaAreaGeoPoint tL_mediaAreaGeoPoint = (TL_stories.TL_mediaAreaGeoPoint) this.selectedArea.mediaArea;
                    TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                    tL_messageMediaGeo.geo = tL_mediaAreaGeoPoint.geo;
                    tL_message.media = tL_messageMediaGeo;
                }
                anonymousClass2.setSharingAllowed(false);
                anonymousClass2.setMessageObject(new MessageObject(UserConfig.selectedAccount, tL_message, false, false));
                StoryViewer storyViewer2 = ((PeerStoriesView.AnonymousClass3) this).val$storyViewer;
                if (storyViewer2 != null) {
                    storyViewer2.presentFragment(anonymousClass2);
                }
                this.selectedArea = null;
                invalidate();
                return;
            }
            AreaView areaView2 = (AreaView) view;
            this.lastSelectedArea = areaView2;
            this.selectedArea = areaView2;
            invalidate();
            HintView2 hintView2 = this.hintView;
            if (hintView2 != null) {
                hintView2.hide();
                this.hintView = null;
            }
            HintView2 duration = new HintView2(getContext(), 0).setSelectorColor(687865855).setJointPx(0.0f, this.selectedArea.getTranslationX() - AndroidUtilities.dp(8.0f)).setDuration(5000L);
            this.hintView = duration;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            TL_stories.MediaArea mediaArea3 = this.selectedArea.mediaArea;
            if (mediaArea3 instanceof TL_stories.TL_mediaAreaChannelPost) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StoryViewMessage));
            } else {
                if (!(mediaArea3 instanceof TL_stories.TL_mediaAreaStarGift)) {
                    if (mediaArea3 instanceof TL_stories.TL_mediaAreaUrl) {
                        duration.setMultilineText(true);
                        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StoryOpenLink));
                        spannableStringBuilder.append((CharSequence) "\n");
                        TL_stories.TL_mediaAreaUrl tL_mediaAreaUrl = (TL_stories.TL_mediaAreaUrl) this.selectedArea.mediaArea;
                        int length = spannableStringBuilder.length();
                        spannableStringBuilder.append(TextUtils.ellipsize(tL_mediaAreaUrl.url, this.hintView.getTextPaint(), AndroidUtilities.displaySize.x * 0.6f, TextUtils.TruncateAt.END));
                        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85f), length, spannableStringBuilder.length(), 33);
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(Theme.multAlpha(0.6f, -1)), length, spannableStringBuilder.length(), 33);
                        spannableStringBuilder.setSpan(new AnonymousClass2(), length, spannableStringBuilder.length(), 33);
                        duration.setInnerPadding(11.0f, 7.0f, 11.0f, 7.0f);
                        z = true;
                    } else {
                        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StoryViewLocation));
                    }
                    spannableString = new SpannableString(">");
                    ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.photos_arrow);
                    if (z) {
                        f = 1.0f;
                    } else {
                        f = 2.0f;
                    }
                    float fDp = AndroidUtilities.dp(f);
                    if (z) {
                        f2 = 0.0f;
                    } else {
                        f2 = 1.0f;
                    }
                    coloredImageSpan.translate(fDp, AndroidUtilities.dp(f2));
                    spannableString.setSpan(coloredImageSpan, 0, spannableString.length(), 33);
                    spannableString2 = new SpannableString("<");
                    ColoredImageSpan coloredImageSpan2 = new ColoredImageSpan(R.drawable.attach_arrow_right);
                    if (z) {
                        f3 = -1.0f;
                    } else {
                        f3 = -2.0f;
                    }
                    float fDp2 = AndroidUtilities.dp(f3);
                    if (z) {
                        f4 = 0.0f;
                    } else {
                        f4 = 1.0f;
                    }
                    coloredImageSpan2.translate(fDp2, AndroidUtilities.dp(f4));
                    coloredImageSpan2.setScale(-1.0f, 1.0f);
                    spannableString2.setSpan(coloredImageSpan2, 0, spannableString2.length(), 33);
                    if (AndroidUtilities.isRTL(spannableStringBuilder)) {
                        spannableString = spannableString2;
                    }
                    AndroidUtilities.replaceCharSequence(">", spannableStringBuilder, spannableString);
                    duration.setText(spannableStringBuilder);
                    duration.setOnHiddenListener(new StoryViewer$5$$ExternalSyntheticLambda0(16, this, duration));
                    if (z) {
                        i = 100;
                    } else {
                        i = 50;
                    }
                    f5 = i;
                    z2 = this.selectedArea.getTranslationY() - ((float) AndroidUtilities.dp(f5)) < ((float) AndroidUtilities.dp(100.0f));
                    if (z2) {
                        i2 = 1;
                    } else {
                        i2 = 3;
                    }
                    duration.setDirection(i2);
                    areaView = this.selectedArea;
                    if (areaView.mediaArea instanceof TL_stories.TL_mediaAreaChannelPost) {
                        if (z2) {
                            if ((this.selectedArea.getMeasuredHeight() / 2.0f) + areaView.getTranslationY() > getMeasuredHeight() - AndroidUtilities.dp(120.0f)) {
                                duration.setTranslationY(this.selectedArea.getTranslationY() - (this.selectedArea.getMeasuredHeight() / 3.0f));
                            } else if (z2) {
                                duration.setTranslationY((this.selectedArea.getMeasuredHeight() / 2.0f) + this.selectedArea.getTranslationY());
                            } else {
                                duration.setTranslationY((this.selectedArea.getTranslationY() - (this.selectedArea.getMeasuredHeight() / 2.0f)) - AndroidUtilities.dp(f5));
                            }
                        } else if ((areaView.getTranslationY() - (this.selectedArea.getMeasuredHeight() / 2.0f)) - AndroidUtilities.dp(f5) < AndroidUtilities.dp(120.0f)) {
                            duration.setTranslationY(this.selectedArea.getTranslationY() - (this.selectedArea.getMeasuredHeight() / 3.0f));
                        } else if (z2) {
                            duration.setTranslationY((this.selectedArea.getMeasuredHeight() / 2.0f) + this.selectedArea.getTranslationY());
                        } else {
                            duration.setTranslationY((this.selectedArea.getTranslationY() - (this.selectedArea.getMeasuredHeight() / 2.0f)) - AndroidUtilities.dp(f5));
                        }
                    } else if (z2) {
                        duration.setTranslationY((this.selectedArea.getMeasuredHeight() / 2.0f) + this.selectedArea.getTranslationY());
                    } else {
                        duration.setTranslationY((this.selectedArea.getTranslationY() - (this.selectedArea.getMeasuredHeight() / 2.0f)) - AndroidUtilities.dp(f5));
                    }
                    duration.setOnClickListener(new BotAdView$$ExternalSyntheticLambda2(this, 17));
                    duration.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                    this.hintsContainer.addView(duration, LayoutHelper.createFrame(-1, f5));
                    duration.show();
                    onHintVisible(true);
                }
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StoryViewGift));
            }
            z = false;
            spannableString = new SpannableString(">");
            ColoredImageSpan coloredImageSpan3 = new ColoredImageSpan(R.drawable.photos_arrow);
            if (z) {
                f = 1.0f;
            } else {
                f = 2.0f;
            }
            float fDp3 = AndroidUtilities.dp(f);
            if (z) {
                f2 = 0.0f;
            } else {
                f2 = 1.0f;
            }
            coloredImageSpan3.translate(fDp3, AndroidUtilities.dp(f2));
            spannableString.setSpan(coloredImageSpan3, 0, spannableString.length(), 33);
            spannableString2 = new SpannableString("<");
            ColoredImageSpan coloredImageSpan4 = new ColoredImageSpan(R.drawable.attach_arrow_right);
            if (z) {
                f3 = -1.0f;
            } else {
                f3 = -2.0f;
            }
            float fDp4 = AndroidUtilities.dp(f3);
            if (z) {
                f4 = 0.0f;
            } else {
                f4 = 1.0f;
            }
            coloredImageSpan4.translate(fDp4, AndroidUtilities.dp(f4));
            coloredImageSpan4.setScale(-1.0f, 1.0f);
            spannableString2.setSpan(coloredImageSpan4, 0, spannableString2.length(), 33);
            if (AndroidUtilities.isRTL(spannableStringBuilder)) {
                spannableString = spannableString2;
            }
            AndroidUtilities.replaceCharSequence(">", spannableStringBuilder, spannableString);
            duration.setText(spannableStringBuilder);
            duration.setOnHiddenListener(new StoryViewer$5$$ExternalSyntheticLambda0(16, this, duration));
            if (z) {
                i = 100;
            } else {
                i = 50;
            }
            f5 = i;
            if (this.selectedArea.getTranslationY() - ((float) AndroidUtilities.dp(f5)) < ((float) AndroidUtilities.dp(100.0f))) {
            }
            if (z2) {
                i2 = 1;
            } else {
                i2 = 3;
            }
            duration.setDirection(i2);
            areaView = this.selectedArea;
            if (areaView.mediaArea instanceof TL_stories.TL_mediaAreaChannelPost) {
                if (z2) {
                    duration.setTranslationY((this.selectedArea.getMeasuredHeight() / 2.0f) + this.selectedArea.getTranslationY());
                } else {
                    duration.setTranslationY((this.selectedArea.getTranslationY() - (this.selectedArea.getMeasuredHeight() / 2.0f)) - AndroidUtilities.dp(f5));
                }
            } else if (z2) {
                if ((this.selectedArea.getMeasuredHeight() / 2.0f) + areaView.getTranslationY() > getMeasuredHeight() - AndroidUtilities.dp(120.0f)) {
                    duration.setTranslationY(this.selectedArea.getTranslationY() - (this.selectedArea.getMeasuredHeight() / 3.0f));
                } else if (z2) {
                    duration.setTranslationY((this.selectedArea.getMeasuredHeight() / 2.0f) + this.selectedArea.getTranslationY());
                } else {
                    duration.setTranslationY((this.selectedArea.getTranslationY() - (this.selectedArea.getMeasuredHeight() / 2.0f)) - AndroidUtilities.dp(f5));
                }
            } else if ((areaView.getTranslationY() - (this.selectedArea.getMeasuredHeight() / 2.0f)) - AndroidUtilities.dp(f5) < AndroidUtilities.dp(120.0f)) {
                duration.setTranslationY(this.selectedArea.getTranslationY() - (this.selectedArea.getMeasuredHeight() / 3.0f));
            } else if (z2) {
                duration.setTranslationY((this.selectedArea.getMeasuredHeight() / 2.0f) + this.selectedArea.getTranslationY());
            } else {
                duration.setTranslationY((this.selectedArea.getTranslationY() - (this.selectedArea.getMeasuredHeight() / 2.0f)) - AndroidUtilities.dp(f5));
            }
            duration.setOnClickListener(new BotAdView$$ExternalSyntheticLambda2(this, 17));
            duration.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            this.hintsContainer.addView(duration, LayoutHelper.createFrame(-1, f5));
            duration.show();
            onHintVisible(true);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.parentBitmap;
        if (bitmap != null) {
            bitmap.recycle();
            this.parentBitmap = null;
        }
    }

    public abstract void onHintVisible(boolean z);

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt == this.hintsContainer) {
                childAt.layout(0, 0, i3 - i, i4 - i2);
            } else if (childAt instanceof AreaView) {
                AreaView areaView = (AreaView) childAt;
                int measuredWidth = areaView.getMeasuredWidth();
                int measuredHeight = areaView.getMeasuredHeight();
                areaView.layout((-measuredWidth) / 2, (-measuredHeight) / 2, measuredWidth / 2, measuredHeight / 2);
                TL_stories.MediaArea mediaArea = areaView.mediaArea;
                areaView.setTranslationX((float) ((mediaArea.coordinates.x / 100.0d) * ((double) getMeasuredWidth())));
                areaView.setTranslationY((float) ((mediaArea.coordinates.y / 100.0d) * ((double) getMeasuredHeight())));
                areaView.setRotation((float) mediaArea.coordinates.rotation);
            } else if (childAt instanceof FitViewWidget) {
                FitViewWidget fitViewWidget = (FitViewWidget) childAt;
                int measuredWidth2 = fitViewWidget.getMeasuredWidth();
                int measuredHeight2 = fitViewWidget.getMeasuredHeight();
                fitViewWidget.layout((-measuredWidth2) / 2, (-measuredHeight2) / 2, measuredWidth2 / 2, measuredHeight2 / 2);
                TL_stories.MediaArea mediaArea2 = fitViewWidget.mediaArea;
                fitViewWidget.setTranslationX((float) ((mediaArea2.coordinates.x / 100.0d) * ((double) getMeasuredWidth())));
                fitViewWidget.setTranslationY((float) ((mediaArea2.coordinates.y / 100.0d) * ((double) getMeasuredHeight())));
                fitViewWidget.setRotation((float) mediaArea2.coordinates.rotation);
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            FrameLayout frameLayout = this.hintsContainer;
            if (childAt == frameLayout) {
                frameLayout.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            } else if (childAt instanceof AreaView) {
                AreaView areaView = (AreaView) getChildAt(i3);
                areaView.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((areaView.mediaArea.coordinates.w / 100.0d) * ((double) size)), 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((areaView.mediaArea.coordinates.h / 100.0d) * ((double) size2)), 1073741824));
            } else if (childAt instanceof FitViewWidget) {
                FitViewWidget fitViewWidget = (FitViewWidget) getChildAt(i3);
                fitViewWidget.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((fitViewWidget.mediaArea.coordinates.w / 100.0d) * ((double) size)), 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((fitViewWidget.mediaArea.coordinates.h / 100.0d) * ((double) size2)), 1073741824));
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        HintView2 hintView2;
        if (getChildCount() == 0 || (hintView2 = this.hintView) == null || !hintView2.shown()) {
            return false;
        }
        if (motionEvent.getAction() == 1) {
            HintView2 hintView3 = this.hintView;
            if (hintView3 != null) {
                hintView3.hide();
                this.hintView = null;
            }
            this.selectedArea = null;
            invalidate();
            onHintVisible(false);
        }
        super.onTouchEvent(motionEvent);
        return true;
    }

    public final void set(TL_stories.StoryItem storyItem, EmojiAnimationsOverlay emojiAnimationsOverlay) {
        set(storyItem, storyItem != null ? storyItem.media_areas : null, emojiAnimationsOverlay);
    }

    public final void shine() {
        if (this.shined) {
            return;
        }
        this.shined = true;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof AreaView) {
                AreaView areaView = (AreaView) childAt;
                if (areaView.supportsShining) {
                    BotSensors$1$$ExternalSyntheticLambda0 botSensors$1$$ExternalSyntheticLambda0 = areaView.shineRunnable;
                    AndroidUtilities.cancelRunOnUIThread(botSensors$1$$ExternalSyntheticLambda0);
                    AndroidUtilities.runOnUIThread(botSensors$1$$ExternalSyntheticLambda0, 400L);
                }
            }
        }
    }

    public final void set(TL_stories.StoryItem storyItem, ArrayList arrayList, EmojiAnimationsOverlay emojiAnimationsOverlay) {
        View view;
        View areaView;
        ArrayList arrayList2 = this.lastMediaAreas;
        if (arrayList == arrayList2 && (arrayList == null || arrayList2 == null || arrayList.size() == this.lastMediaAreas.size())) {
            return;
        }
        HintView2 hintView2 = this.hintView;
        if (hintView2 != null) {
            hintView2.hide();
            this.hintView = null;
        }
        int i = 0;
        while (true) {
            int childCount = getChildCount();
            view = this.hintsContainer;
            if (i >= childCount) {
                break;
            }
            View childAt = getChildAt(i);
            if (childAt != view) {
                removeView(childAt);
                i--;
            }
            i++;
        }
        this.selectedArea = null;
        this.parentHighlightScaleAlpha.set(0.0f, true);
        invalidate();
        onHintVisible(false);
        this.lastMediaAreas = arrayList;
        if (arrayList == null) {
            return;
        }
        this.shined = false;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            TL_stories.MediaArea mediaArea = (TL_stories.MediaArea) arrayList.get(i2);
            if (mediaArea != null && mediaArea.coordinates != null) {
                if (mediaArea instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                    StoryReactionWidgetView storyReactionWidgetView = new StoryReactionWidgetView(getContext(), this, (TL_stories.TL_mediaAreaSuggestedReaction) mediaArea, emojiAnimationsOverlay);
                    if (storyItem != null) {
                        storyReactionWidgetView.setViews(storyItem.views, false);
                    }
                    ScaleStateListAnimator.apply(storyReactionWidgetView);
                    areaView = storyReactionWidgetView;
                } else if (mediaArea instanceof TL_stories.TL_mediaAreaWeather) {
                    TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = (TL_stories.TL_mediaAreaWeather) mediaArea;
                    Weather.State state = new Weather.State();
                    state.emoji = tL_mediaAreaWeather.emoji;
                    state.temperature = (float) tL_mediaAreaWeather.temperature_c;
                    LocationMarker locationMarker = new LocationMarker(getContext(), AndroidUtilities.density);
                    locationMarker.setMaxWidth(AndroidUtilities.displaySize.x);
                    locationMarker.setIsVideo(true);
                    locationMarker.setCodeEmoji(UserConfig.selectedAccount, state.emoji);
                    locationMarker.setText(state.getTemperature());
                    locationMarker.setType(3, tL_mediaAreaWeather.color);
                    areaView = new FitViewWidget(getContext(), locationMarker, mediaArea);
                } else {
                    areaView = new AreaView(getContext(), this.parentView, mediaArea);
                }
                areaView.setOnClickListener(this);
                addView(areaView);
                double d = mediaArea.coordinates.w;
            }
        }
        view.bringToFront();
    }
}
