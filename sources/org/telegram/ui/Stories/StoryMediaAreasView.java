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
import android.graphics.Shader;
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
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Paint.Views.LocationMarker;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.Shaker$$ExternalSyntheticLambda0;
import org.telegram.ui.EmojiAnimationsOverlay;
import org.telegram.ui.LocationActivity;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.Stories.recorder.StoryEntry;
import org.telegram.ui.Stories.recorder.Weather;

public abstract class StoryMediaAreasView extends FrameLayout implements View.OnClickListener {
    private final Path clipPath;
    private final Paint cutPaint;
    private HintView2 hintView;
    private final FrameLayout hintsContainer;
    private ArrayList lastMediaAreas;
    private AreaView lastSelectedArea;
    private boolean malicious;
    Matrix matrix;
    private Bitmap parentBitmap;
    public final AnimatedFloat parentHighlightAlpha;
    public final AnimatedFloat parentHighlightScaleAlpha;
    private View parentView;
    float[] point;
    private final float[] radii;
    private final Rect rect;
    private final RectF rectF;
    private Theme.ResourcesProvider resourcesProvider;
    private AreaView selectedArea;
    private boolean shined;

    protected Bitmap getPlayingBitmap() {
        return null;
    }

    protected abstract void onHintVisible(boolean z);

    protected abstract void presentFragment(BaseFragment baseFragment);

    public abstract void showEffect(StoryReactionWidgetView storyReactionWidgetView);

    public StoryMediaAreasView(Context context, View view, Theme.ResourcesProvider resourcesProvider) {
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
        this.radii = new float[8];
        this.shined = false;
        this.parentView = view;
        this.resourcesProvider = resourcesProvider;
        this.parentHighlightAlpha = new AnimatedFloat(view, 0L, 120L, new LinearInterpolator());
        this.parentHighlightScaleAlpha = new AnimatedFloat(view, 0L, 360L, CubicBezierInterpolator.EASE_OUT_QUINT);
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

    public void set(TL_stories.StoryItem storyItem, EmojiAnimationsOverlay emojiAnimationsOverlay) {
        set(storyItem, storyItem != null ? storyItem.media_areas : null, emojiAnimationsOverlay);
    }

    public void set(TL_stories.StoryItem storyItem, ArrayList arrayList, EmojiAnimationsOverlay emojiAnimationsOverlay) {
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
        while (i < getChildCount()) {
            View childAt = getChildAt(i);
            if (childAt != this.hintsContainer) {
                removeView(childAt);
                i--;
            }
            i++;
        }
        this.selectedArea = null;
        this.parentHighlightScaleAlpha.set(0.0f, true);
        invalidate();
        onHintVisible(false);
        this.malicious = false;
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
                    LocationMarker locationMarker = new LocationMarker(getContext(), 1, AndroidUtilities.density, 0);
                    locationMarker.setMaxWidth(AndroidUtilities.displaySize.x);
                    locationMarker.setIsVideo(true);
                    locationMarker.setCodeEmoji(UserConfig.selectedAccount, state.getEmoji());
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
        this.malicious = false;
        this.hintsContainer.bringToFront();
    }

    @Override
    protected void onMeasure(int i, int i2) {
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
    public void onClick(View view) {
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
                showEffect((StoryReactionWidgetView) view);
                return;
            }
            AreaView areaView2 = this.selectedArea;
            int i3 = 3;
            if (areaView2 == view) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        StoryMediaAreasView.$r8$lambda$wc8LwHVmh144RDVgKzunkNgkFJ8(this.f$0);
                    }
                }, 200L);
                TL_stories.MediaArea mediaArea = this.selectedArea.mediaArea;
                if (mediaArea instanceof TL_stories.TL_mediaAreaChannelPost) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", ((TL_stories.TL_mediaAreaChannelPost) this.selectedArea.mediaArea).channel_id);
                    bundle.putInt("message_id", ((TL_stories.TL_mediaAreaChannelPost) this.selectedArea.mediaArea).msg_id);
                    presentFragment(new ChatActivity(bundle));
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
                LocationActivity locationActivity = new LocationActivity(i3) {
                    @Override
                    protected boolean disablePermissionCheck() {
                        return true;
                    }
                };
                locationActivity.fromStories = true;
                locationActivity.searchStories(this.selectedArea.mediaArea);
                locationActivity.setResourceProvider(this.resourcesProvider);
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
                } else if (mediaArea2 instanceof TL_stories.TL_mediaAreaGeoPoint) {
                    locationActivity.setInitialMaxZoom(true);
                    TL_stories.TL_mediaAreaGeoPoint tL_mediaAreaGeoPoint = (TL_stories.TL_mediaAreaGeoPoint) this.selectedArea.mediaArea;
                    TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                    tL_messageMediaGeo.geo = tL_mediaAreaGeoPoint.geo;
                    tL_message.media = tL_messageMediaGeo;
                } else {
                    this.selectedArea = null;
                    invalidate();
                    return;
                }
                locationActivity.setSharingAllowed(false);
                locationActivity.setMessageObject(new MessageObject(UserConfig.selectedAccount, tL_message, false, false));
                presentFragment(locationActivity);
                this.selectedArea = null;
                invalidate();
                return;
            }
            if (areaView2 != null && this.malicious) {
                onClickAway();
                return;
            }
            AreaView areaView3 = (AreaView) view;
            this.lastSelectedArea = areaView3;
            this.selectedArea = areaView3;
            invalidate();
            HintView2 hintView2 = this.hintView;
            if (hintView2 != null) {
                hintView2.hide();
                this.hintView = null;
            }
            final HintView2 duration = new HintView2(getContext()).setSelectorColor(687865855).setJointPx(0.0f, this.selectedArea.getTranslationX() - AndroidUtilities.dp(8.0f)).setDuration(5000L);
            this.hintView = duration;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            TL_stories.MediaArea mediaArea3 = this.selectedArea.mediaArea;
            if (mediaArea3 instanceof TL_stories.TL_mediaAreaChannelPost) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StoryViewMessage));
            } else if (mediaArea3 instanceof TL_stories.TL_mediaAreaStarGift) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StoryViewGift));
            } else {
                if (mediaArea3 instanceof TL_stories.TL_mediaAreaUrl) {
                    duration.setMultilineText(true);
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StoryOpenLink));
                    spannableStringBuilder.append((CharSequence) "\n");
                    TL_stories.TL_mediaAreaUrl tL_mediaAreaUrl = (TL_stories.TL_mediaAreaUrl) this.selectedArea.mediaArea;
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append(TextUtils.ellipsize(tL_mediaAreaUrl.url, this.hintView.getTextPaint(), AndroidUtilities.displaySize.x * 0.6f, TextUtils.TruncateAt.END));
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85f), length, spannableStringBuilder.length(), 33);
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(Theme.multAlpha(-1, 0.6f)), length, spannableStringBuilder.length(), 33);
                    spannableStringBuilder.setSpan(new LineHeightSpan() {
                        @Override
                        public void chooseHeight(CharSequence charSequence, int i4, int i5, int i6, int i7, Paint.FontMetricsInt fontMetricsInt) {
                            fontMetricsInt.ascent -= AndroidUtilities.dp(2.0f);
                            fontMetricsInt.top -= AndroidUtilities.dp(2.0f);
                        }
                    }, length, spannableStringBuilder.length(), 33);
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
                duration.setOnHiddenListener(new Runnable() {
                    @Override
                    public final void run() {
                        StoryMediaAreasView.$r8$lambda$qdQ5l8e3zN3QaCKysaiqxcg4kAQ(this.f$0, duration);
                    }
                });
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
                if (!(areaView.mediaArea instanceof TL_stories.TL_mediaAreaChannelPost) && (!z2 ? (areaView.getTranslationY() - (this.selectedArea.getMeasuredHeight() / 2.0f)) - AndroidUtilities.dp(f5) >= AndroidUtilities.dp(120.0f) : areaView.getTranslationY() + (this.selectedArea.getMeasuredHeight() / 2.0f) <= getMeasuredHeight() - AndroidUtilities.dp(120.0f))) {
                    duration.setTranslationY(this.selectedArea.getTranslationY() - (this.selectedArea.getMeasuredHeight() / 3.0f));
                } else if (z2) {
                    duration.setTranslationY(this.selectedArea.getTranslationY() + (this.selectedArea.getMeasuredHeight() / 2.0f));
                } else {
                    duration.setTranslationY((this.selectedArea.getTranslationY() - (this.selectedArea.getMeasuredHeight() / 2.0f)) - AndroidUtilities.dp(f5));
                }
                duration.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view2) {
                        StoryMediaAreasView storyMediaAreasView = this.f$0;
                        storyMediaAreasView.onClick(storyMediaAreasView.selectedArea);
                    }
                });
                duration.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                this.hintsContainer.addView(duration, LayoutHelper.createFrame(-1, f5));
                duration.show();
                onHintVisible(true);
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
            duration.setOnHiddenListener(new Runnable() {
                @Override
                public final void run() {
                    StoryMediaAreasView.$r8$lambda$qdQ5l8e3zN3QaCKysaiqxcg4kAQ(this.f$0, duration);
                }
            });
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
            if (!(areaView.mediaArea instanceof TL_stories.TL_mediaAreaChannelPost)) {
                if (z2) {
                    duration.setTranslationY(this.selectedArea.getTranslationY() + (this.selectedArea.getMeasuredHeight() / 2.0f));
                } else {
                    duration.setTranslationY((this.selectedArea.getTranslationY() - (this.selectedArea.getMeasuredHeight() / 2.0f)) - AndroidUtilities.dp(f5));
                }
            } else if (z2) {
                duration.setTranslationY(this.selectedArea.getTranslationY() + (this.selectedArea.getMeasuredHeight() / 2.0f));
            } else {
                duration.setTranslationY((this.selectedArea.getTranslationY() - (this.selectedArea.getMeasuredHeight() / 2.0f)) - AndroidUtilities.dp(f5));
            }
            duration.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    StoryMediaAreasView storyMediaAreasView = this.f$0;
                    storyMediaAreasView.onClick(storyMediaAreasView.selectedArea);
                }
            });
            duration.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            this.hintsContainer.addView(duration, LayoutHelper.createFrame(-1, f5));
            duration.show();
            onHintVisible(true);
        }
    }

    public static void $r8$lambda$wc8LwHVmh144RDVgKzunkNgkFJ8(StoryMediaAreasView storyMediaAreasView) {
        HintView2 hintView2 = storyMediaAreasView.hintView;
        if (hintView2 != null) {
            hintView2.hide();
            storyMediaAreasView.hintView = null;
        }
        storyMediaAreasView.onHintVisible(false);
    }

    public static void $r8$lambda$qdQ5l8e3zN3QaCKysaiqxcg4kAQ(StoryMediaAreasView storyMediaAreasView, HintView2 hintView2) {
        storyMediaAreasView.hintsContainer.removeView(hintView2);
        if (hintView2 == storyMediaAreasView.hintView) {
            storyMediaAreasView.selectedArea = null;
            storyMediaAreasView.invalidate();
            storyMediaAreasView.onHintVisible(false);
        }
    }

    public void closeHint() {
        HintView2 hintView2 = this.hintView;
        if (hintView2 != null) {
            hintView2.hide();
            this.hintView = null;
        }
        this.selectedArea = null;
        invalidate();
        onHintVisible(false);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        HintView2 hintView2;
        if (getChildCount() == 0 || (hintView2 = this.hintView) == null || !hintView2.shown()) {
            return false;
        }
        if (motionEvent.getAction() == 1) {
            onClickAway();
        }
        super.onTouchEvent(motionEvent);
        return true;
    }

    private void onClickAway() {
        HintView2 hintView2 = this.hintView;
        if (hintView2 != null) {
            hintView2.hide();
            this.hintView = null;
        }
        this.selectedArea = null;
        invalidate();
        onHintVisible(false);
        if (this.malicious) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (childAt != this.hintsContainer) {
                    childAt.setClickable(false);
                }
            }
        }
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt == this.hintsContainer) {
                childAt.layout(0, 0, i3 - i, i4 - i2);
            } else if (childAt instanceof AreaView) {
                AreaView areaView = (AreaView) childAt;
                int measuredWidth = areaView.getMeasuredWidth();
                int measuredHeight = areaView.getMeasuredHeight();
                areaView.layout((-measuredWidth) / 2, (-measuredHeight) / 2, measuredWidth / 2, measuredHeight / 2);
                areaView.setTranslationX((float) ((areaView.mediaArea.coordinates.x / 100.0d) * ((double) getMeasuredWidth())));
                areaView.setTranslationY((float) ((areaView.mediaArea.coordinates.y / 100.0d) * ((double) getMeasuredHeight())));
                areaView.setRotation((float) areaView.mediaArea.coordinates.rotation);
            } else if (childAt instanceof FitViewWidget) {
                FitViewWidget fitViewWidget = (FitViewWidget) childAt;
                int measuredWidth2 = fitViewWidget.getMeasuredWidth();
                int measuredHeight2 = fitViewWidget.getMeasuredHeight();
                fitViewWidget.layout((-measuredWidth2) / 2, (-measuredHeight2) / 2, measuredWidth2 / 2, measuredHeight2 / 2);
                fitViewWidget.setTranslationX((float) ((fitViewWidget.mediaArea.coordinates.x / 100.0d) * ((double) getMeasuredWidth())));
                fitViewWidget.setTranslationY((float) ((fitViewWidget.mediaArea.coordinates.y / 100.0d) * ((double) getMeasuredHeight())));
                fitViewWidget.setRotation((float) fitViewWidget.mediaArea.coordinates.rotation);
            }
        }
    }

    @Override
    protected boolean drawChild(Canvas canvas, View view, long j) {
        if (view == this.hintsContainer) {
            drawHighlight(canvas);
        } else if (view instanceof AreaView) {
            canvas.save();
            canvas.translate(view.getLeft(), view.getTop());
            canvas.concat(view.getMatrix());
            ((AreaView) view).customDraw(canvas);
            canvas.restore();
        }
        return super.drawChild(canvas, view, j);
    }

    private void drawHighlight(Canvas canvas) {
        Canvas canvas2;
        float measuredHeight;
        AnimatedFloat animatedFloat = this.parentHighlightAlpha;
        AreaView areaView = this.selectedArea;
        float f = animatedFloat.set((areaView == null || !areaView.supportsBounds || this.selectedArea.scaleOnTap) ? false : true);
        AreaView areaView2 = this.selectedArea;
        boolean z = areaView2 != null && areaView2.scaleOnTap;
        float f2 = this.parentHighlightScaleAlpha.set(z);
        if (f > 0.0f) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
            canvas2.drawColor(Theme.multAlpha(402653184, f));
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (childAt != this.hintsContainer) {
                    AnimatedFloat animatedFloat2 = ((AreaView) childAt).highlightAlpha;
                    AreaView areaView3 = this.selectedArea;
                    float f3 = animatedFloat2.set(childAt == areaView3 && areaView3.supportsBounds);
                    if (f3 > 0.0f) {
                        canvas2.save();
                        this.rectF.set(childAt.getX(), childAt.getY(), childAt.getX() + childAt.getMeasuredWidth(), childAt.getY() + childAt.getMeasuredHeight());
                        canvas2.rotate(childAt.getRotation(), this.rectF.centerX(), this.rectF.centerY());
                        this.cutPaint.setAlpha((int) (f3 * 255.0f));
                        RectF rectF = this.rectF;
                        canvas2.drawRoundRect(rectF, rectF.height() * 0.2f, this.rectF.height() * 0.2f, this.cutPaint);
                        canvas2.restore();
                    }
                }
            }
            canvas2.restore();
        } else {
            canvas2 = canvas;
        }
        if ((z || f2 > 0.0f) && this.lastSelectedArea != null) {
            if (this.parentBitmap == null) {
                this.parentBitmap = getPlayingBitmap();
            }
            if (this.parentBitmap != null) {
                canvas2.drawColor(Theme.multAlpha(805306368, f2));
                canvas2.save();
                this.clipPath.rewind();
                this.rectF.set(this.lastSelectedArea.getX(), this.lastSelectedArea.getY(), this.lastSelectedArea.getX() + this.lastSelectedArea.getMeasuredWidth(), this.lastSelectedArea.getY() + this.lastSelectedArea.getMeasuredHeight());
                float fLerp = AndroidUtilities.lerp(1.0f, (this.lastSelectedArea.bounceOnTap ? this.lastSelectedArea.bounce.getScale(0.05f) : 1.0f) * 1.05f, f2);
                canvas2.scale(fLerp, fLerp, this.rectF.centerX(), this.rectF.centerY());
                canvas2.rotate(this.lastSelectedArea.getRotation(), this.rectF.centerX(), this.rectF.centerY());
                AreaView areaView4 = this.lastSelectedArea;
                TL_stories.MediaAreaCoordinates mediaAreaCoordinates = areaView4.mediaArea.coordinates;
                if ((mediaAreaCoordinates.flags & 1) != 0) {
                    measuredHeight = (float) ((mediaAreaCoordinates.radius / 100.0d) * ((double) areaView4.getMeasuredWidth()));
                } else {
                    measuredHeight = areaView4.getMeasuredHeight() * 0.2f;
                }
                this.clipPath.addRoundRect(this.rectF, measuredHeight, measuredHeight, Path.Direction.CW);
                canvas2.clipPath(this.clipPath);
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                this.rect.set(0, 0, this.parentBitmap.getWidth(), this.parentBitmap.getHeight());
                canvas2.rotate(-this.lastSelectedArea.getRotation(), this.rectF.centerX(), this.rectF.centerY());
                canvas2.drawBitmap(this.parentBitmap, this.rect, rectF2, (Paint) null);
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
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.parentBitmap;
        if (bitmap != null) {
            bitmap.recycle();
            this.parentBitmap = null;
        }
    }

    public void shine() {
        if (this.shined) {
            return;
        }
        this.shined = true;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof AreaView) {
                ((AreaView) childAt).shine();
            }
        }
    }

    public boolean hasSelected() {
        return this.selectedArea != null;
    }

    public boolean hasSelectedForScale() {
        AreaView areaView = this.selectedArea;
        if (areaView != null) {
            return areaView.scaleOnTap || this.selectedArea.supportsBounds;
        }
        return false;
    }

    public boolean hasAreaAboveAt(float f, float f2) {
        float f3;
        float f4;
        int i = 0;
        while (i < getChildCount()) {
            View childAt = getChildAt(i);
            if (childAt instanceof StoryReactionWidgetView) {
                f3 = f;
                f4 = f2;
                if (rotatedRectContainsPoint(childAt.getTranslationX(), childAt.getTranslationY(), childAt.getMeasuredWidth(), childAt.getMeasuredHeight(), childAt.getRotation(), f3, f4)) {
                    return true;
                }
            } else {
                f3 = f;
                f4 = f2;
            }
            i++;
            f = f3;
            f2 = f4;
        }
        return false;
    }

    private static boolean rotatedRectContainsPoint(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = f6 - f;
        double radians = Math.toRadians(-f5);
        double d = f8;
        double d2 = f7 - f2;
        float fCos = (float) ((Math.cos(radians) * d) - (Math.sin(radians) * d2));
        float fSin = (float) ((d * Math.sin(radians)) + (d2 * Math.cos(radians)));
        return fCos >= (-f3) / 2.0f && fCos <= f3 / 2.0f && fSin >= (-f4) / 2.0f && fSin <= f4 / 2.0f;
    }

    public void onStoryItemUpdated(TL_stories.StoryItem storyItem, boolean z) {
        if (storyItem == null) {
            return;
        }
        for (int i = 0; i < getChildCount(); i++) {
            if (getChildAt(i) instanceof StoryReactionWidgetView) {
                ((StoryReactionWidgetView) getChildAt(i)).setViews(storyItem.views, z);
            }
        }
    }

    public boolean hasClickableViews(float f, float f2) {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt != this.hintsContainer && (childAt instanceof StoryReactionWidgetView)) {
                childAt.getMatrix().invert(this.matrix);
                float[] fArr = this.point;
                fArr[0] = f;
                fArr[1] = f2;
                this.matrix.mapPoints(fArr);
                if (this.point[0] >= childAt.getLeft() && this.point[0] <= childAt.getRight() && this.point[1] >= childAt.getTop() && this.point[1] <= childAt.getBottom()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static class AreaView extends View {
        public final ButtonBounce bounce;
        private boolean bounceOnTap;
        private final Path clipPath;
        private LinearGradient gradient;
        private final Matrix gradientMatrix;
        private final Paint gradientPaint;
        public final AnimatedFloat highlightAlpha;
        public final TL_stories.MediaArea mediaArea;
        private boolean ripple;
        private final Drawable rippleDrawable;
        private boolean scaleOnTap;
        private final Runnable shineRunnable;
        private boolean shining;
        private long startTime;
        private LinearGradient strokeGradient;
        private final Paint strokeGradientPaint;
        private boolean supportsBounds;
        private boolean supportsShining;

        public void customDraw(Canvas canvas) {
        }

        public AreaView(Context context, View view, TL_stories.MediaArea mediaArea) {
            super(context);
            boolean z = true;
            this.gradientPaint = new Paint(1);
            Paint paint = new Paint(1);
            this.strokeGradientPaint = paint;
            this.gradientMatrix = new Matrix();
            Drawable drawableCreateSelectorDrawable = Theme.createSelectorDrawable(1174405119, 2);
            this.rippleDrawable = drawableCreateSelectorDrawable;
            this.bounce = new ButtonBounce(this);
            this.supportsBounds = false;
            this.supportsShining = false;
            this.shining = false;
            this.clipPath = new Path();
            this.shineRunnable = new Runnable() {
                @Override
                public final void run() {
                    this.f$0.shineInternal();
                }
            };
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
            this.highlightAlpha = new AnimatedFloat(view, 0L, 120L, new LinearInterpolator());
            paint.setStyle(Paint.Style.STROKE);
            drawableCreateSelectorDrawable.setCallback(this);
        }

        @Override
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                if (getParent() instanceof View) {
                    ButtonBounce buttonBounce = this.bounce;
                    View view = (View) getParent();
                    Objects.requireNonNull(view);
                    buttonBounce.setAdditionalInvalidate(new Shaker$$ExternalSyntheticLambda0(view));
                }
                this.bounce.setPressed(true);
                this.rippleDrawable.setHotspot(motionEvent.getX(), motionEvent.getY());
                this.rippleDrawable.setState(new int[]{16842919, 16842910});
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.bounce.setPressed(false);
                this.rippleDrawable.setState(new int[0]);
            }
            super.dispatchTouchEvent(motionEvent);
            return true;
        }

        public void drawAbove(Canvas canvas) {
            if (this.ripple) {
                float innerRadius = getInnerRadius();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                this.clipPath.rewind();
                this.clipPath.addRoundRect(rectF, innerRadius, innerRadius, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(this.clipPath);
                this.rippleDrawable.setBounds(0, 0, getWidth(), getHeight());
                this.rippleDrawable.draw(canvas);
                canvas.restore();
            }
        }

        @Override
        protected boolean verifyDrawable(Drawable drawable) {
            return drawable == this.rippleDrawable || super.verifyDrawable(drawable);
        }

        public float getInnerRadius() {
            TL_stories.MediaArea mediaArea;
            TL_stories.MediaAreaCoordinates mediaAreaCoordinates;
            if ((getParent() instanceof View) && (mediaArea = this.mediaArea) != null && (mediaAreaCoordinates = mediaArea.coordinates) != null) {
                if ((mediaAreaCoordinates.flags & 1) != 0) {
                    return (float) (((mediaAreaCoordinates.radius / 100.0d) * ((double) getWidth())) / ((double) getScaleX()));
                }
                return getMeasuredHeight() * 0.2f;
            }
            return getMeasuredHeight() * 0.2f;
        }

        @Override
        protected void onDraw(Canvas canvas) {
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
                this.gradientMatrix.reset();
                this.gradientMatrix.postScale(measuredWidth / 40.0f, 1.0f);
                this.gradientMatrix.postTranslate(measuredWidth2, 0.0f);
                this.gradient.setLocalMatrix(this.gradientMatrix);
                this.gradientPaint.setShader(this.gradient);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas.drawRoundRect(rectF, innerRadius, innerRadius, this.gradientPaint);
                this.strokeGradient.setLocalMatrix(this.gradientMatrix);
                this.strokeGradientPaint.setShader(this.strokeGradient);
                float fDpf2 = AndroidUtilities.dpf2(1.5f);
                this.strokeGradientPaint.setStrokeWidth(fDpf2);
                float f = fDpf2 / 2.0f;
                rectF.inset(f, f);
                float f2 = innerRadius - f;
                canvas.drawRoundRect(rectF, f2, f2, this.strokeGradientPaint);
                invalidate();
            }
        }

        public void shine() {
            if (this.supportsShining) {
                AndroidUtilities.cancelRunOnUIThread(this.shineRunnable);
                AndroidUtilities.runOnUIThread(this.shineRunnable, 400L);
            }
        }

        public void shineInternal() {
            if (this.supportsShining) {
                this.shining = true;
                this.startTime = System.currentTimeMillis();
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.gradient = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 771751935, 771751935, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                this.strokeGradient = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 553648127, 553648127, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                invalidate();
            }
        }
    }

    public static class FitViewWidget extends FrameLayout {
        public final View child;
        public final TL_stories.MediaArea mediaArea;

        public FitViewWidget(Context context, View view, TL_stories.MediaArea mediaArea) {
            super(context);
            this.mediaArea = mediaArea;
            this.child = view;
            addView(view);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            this.child.measure(i, i2);
            int measuredWidth = (this.child.getMeasuredWidth() - this.child.getPaddingLeft()) - this.child.getPaddingRight();
            int measuredHeight = (this.child.getMeasuredHeight() - this.child.getPaddingTop()) - this.child.getPaddingBottom();
            View view = this.child;
            float f = measuredWidth;
            float f2 = f / 2.0f;
            view.setPivotX(view.getPaddingLeft() + f2);
            View view2 = this.child;
            float f3 = measuredHeight;
            float f4 = f3 / 2.0f;
            view2.setPivotY(view2.getPaddingTop() + f4);
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            setMeasuredDimension(size, size2);
            float f5 = size;
            float f6 = size2;
            float fMin = Math.min(f5 / f, f6 / f3);
            View view3 = this.child;
            view3.setTranslationX((f5 / 2.0f) - (f2 + view3.getPaddingLeft()));
            View view4 = this.child;
            view4.setTranslationY((f6 / 2.0f) - (f4 + view4.getPaddingTop()));
            this.child.setScaleX(fMin);
            this.child.setScaleY(fMin);
        }
    }
}
