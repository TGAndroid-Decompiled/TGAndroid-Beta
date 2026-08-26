package org.telegram.ui.Stories;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.Paint.Views.LocationMarker;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.Reactions.ReactionImageHolder;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Stories.recorder.Weather;

public final class StoryWidgetsImageDecorator extends ImageReceiver.Decorator {
    public final ArrayList drawingObjects;
    public float imageH;
    public float imageW;
    public float imageX;
    public float imageY;

    public abstract class DrawingObject {
        public abstract void draw(Canvas canvas, float f);

        public abstract void onAttachedToWindow(boolean z);

        public abstract void setParent(View view);
    }

    public final class ReactionWidget extends DrawingObject {
        public final ReactionImageHolder imageHolder;
        public final TL_stories.TL_mediaAreaSuggestedReaction mediaArea;
        public final StoryReactionWidgetBackground storyReactionWidgetBackground;

        public ReactionWidget(TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction) {
            StoryReactionWidgetBackground storyReactionWidgetBackground = new StoryReactionWidgetBackground(null);
            this.storyReactionWidgetBackground = storyReactionWidgetBackground;
            ReactionImageHolder reactionImageHolder = new ReactionImageHolder(null);
            this.imageHolder = reactionImageHolder;
            this.mediaArea = tL_mediaAreaSuggestedReaction;
            if (tL_mediaAreaSuggestedReaction.flipped) {
                storyReactionWidgetBackground.setMirror(true, false);
            }
            if (tL_mediaAreaSuggestedReaction.dark) {
                int i = storyReactionWidgetBackground.style + 1;
                storyReactionWidgetBackground.style = i;
                if (i >= 2) {
                    storyReactionWidgetBackground.style = 0;
                }
            }
            reactionImageHolder.isStatic = true;
            reactionImageHolder.setVisibleReaction(ReactionsLayoutInBubble.VisibleReaction.fromTL(tL_mediaAreaSuggestedReaction.reaction));
        }

        @Override
        public final void draw(Canvas canvas, float f) {
            ReactionImageHolder reactionImageHolder = this.imageHolder;
            AnimatedEmojiDrawable animatedEmojiDrawable = reactionImageHolder.animatedEmojiDrawable;
            ImageReceiver imageReceiver = animatedEmojiDrawable != null ? animatedEmojiDrawable.imageReceiver : reactionImageHolder.imageReceiver;
            if (imageReceiver != null && imageReceiver.hasImageSet() && imageReceiver.hasImageLoaded()) {
                RLottieDrawable lottieAnimation = imageReceiver.getLottieAnimation();
                if (lottieAnimation == null || !lottieAnimation.isGeneratingCache()) {
                    StoryWidgetsImageDecorator storyWidgetsImageDecorator = StoryWidgetsImageDecorator.this;
                    double d = storyWidgetsImageDecorator.imageX;
                    double d2 = storyWidgetsImageDecorator.imageW;
                    TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction = this.mediaArea;
                    TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaSuggestedReaction.coordinates;
                    float f2 = (float) (((mediaAreaCoordinates.x * d2) / 100.0d) + d);
                    double d3 = storyWidgetsImageDecorator.imageY;
                    double d4 = storyWidgetsImageDecorator.imageH;
                    float f3 = (float) (((mediaAreaCoordinates.y * d4) / 100.0d) + d3);
                    float f4 = ((float) ((d2 * mediaAreaCoordinates.w) / 100.0d)) / 2.0f;
                    float f5 = ((float) ((d4 * mediaAreaCoordinates.h) / 100.0d)) / 2.0f;
                    StoryReactionWidgetBackground storyReactionWidgetBackground = this.storyReactionWidgetBackground;
                    storyReactionWidgetBackground.setBounds((int) (f2 - f4), (int) (f3 - f5), (int) (f4 + f2), (int) (f5 + f3));
                    storyReactionWidgetBackground.alpha = (int) (255.0f * f);
                    canvas.save();
                    double d5 = tL_mediaAreaSuggestedReaction.coordinates.rotation;
                    if (d5 != 0.0d) {
                        canvas.rotate((float) d5, f2, f3);
                    }
                    float fHeight = storyReactionWidgetBackground.getBounds().height() * 0.61f;
                    Rect rect = AndroidUtilities.rectTmp2;
                    float f6 = fHeight / 2.0f;
                    rect.set((int) (storyReactionWidgetBackground.getBounds().centerX() - f6), (int) (storyReactionWidgetBackground.getBounds().centerY() - f6), (int) (storyReactionWidgetBackground.getBounds().centerX() + f6), (int) (storyReactionWidgetBackground.getBounds().centerY() + f6));
                    storyReactionWidgetBackground.updateShadowLayer(1.0f);
                    storyReactionWidgetBackground.draw(canvas);
                    reactionImageHolder.bounds.set(rect);
                    reactionImageHolder.alpha = f;
                    int i = storyReactionWidgetBackground.style == 1 ? -1 : -16777216;
                    if (reactionImageHolder.lastColorForFilter != i) {
                        reactionImageHolder.lastColorForFilter = i;
                        reactionImageHolder.colorFilter = new PorterDuffColorFilter(reactionImageHolder.lastColorForFilter, PorterDuff.Mode.SRC_ATOP);
                        View view = reactionImageHolder.parent;
                        if (view != null) {
                            view.invalidate();
                        }
                    }
                    reactionImageHolder.draw(canvas);
                    canvas.restore();
                }
            }
        }

        @Override
        public final void onAttachedToWindow(boolean z) {
            this.imageHolder.onAttachedToWindow(z);
        }

        @Override
        public final void setParent(View view) {
            ReactionImageHolder reactionImageHolder = this.imageHolder;
            if (reactionImageHolder.parent == view) {
                return;
            }
            if (!reactionImageHolder.attached) {
                reactionImageHolder.parent = view;
                return;
            }
            reactionImageHolder.onAttachedToWindow(false);
            reactionImageHolder.parent = view;
            reactionImageHolder.onAttachedToWindow(true);
        }
    }

    public final class WeatherWidget extends DrawingObject {
        public final AnonymousClass1 marker;
        public final TL_stories.TL_mediaAreaWeather mediaArea;
        public View parentView;

        public WeatherWidget(TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather) {
            this.mediaArea = tL_mediaAreaWeather;
            Weather.State state = new Weather.State();
            state.emoji = tL_mediaAreaWeather.emoji;
            state.temperature = (float) tL_mediaAreaWeather.temperature_c;
            ?? r0 = new LocationMarker(ApplicationLoader.applicationContext, AndroidUtilities.density) {
                @Override
                public final void invalidate() {
                    View view = WeatherWidget.this.parentView;
                    if (view != null) {
                        view.invalidate();
                    }
                }
            };
            this.marker = r0;
            r0.setMaxWidth(AndroidUtilities.displaySize.x);
            r0.setIsVideo(false);
            r0.setCodeEmoji(UserConfig.selectedAccount, state.emoji);
            r0.setText(state.getTemperature());
            r0.setType(3, tL_mediaAreaWeather.color);
            r0.setupLayout();
        }

        @Override
        public final void draw(Canvas canvas, float f) {
            StoryWidgetsImageDecorator storyWidgetsImageDecorator = StoryWidgetsImageDecorator.this;
            double d = storyWidgetsImageDecorator.imageX;
            double d2 = storyWidgetsImageDecorator.imageW;
            TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = this.mediaArea;
            TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaWeather.coordinates;
            float f2 = (float) (((mediaAreaCoordinates.x * d2) / 100.0d) + d);
            double d3 = storyWidgetsImageDecorator.imageY;
            double d4 = storyWidgetsImageDecorator.imageH;
            float f3 = (float) (((mediaAreaCoordinates.y * d4) / 100.0d) + d3);
            float f4 = (float) ((d2 * mediaAreaCoordinates.w) / 100.0d);
            float f5 = (float) ((d4 * mediaAreaCoordinates.h) / 100.0d);
            canvas.save();
            canvas.translate(f2, f3);
            AnonymousClass1 anonymousClass1 = this.marker;
            int widthInternal = (anonymousClass1.getWidthInternal() - anonymousClass1.getPaddingLeft()) - anonymousClass1.getPaddingRight();
            int heightInternal = (anonymousClass1.getHeightInternal() - anonymousClass1.getPaddingTop()) - anonymousClass1.getPaddingBottom();
            float fMin = Math.min(f4 / widthInternal, f5 / heightInternal);
            canvas.scale(fMin, fMin);
            double d5 = tL_mediaAreaWeather.coordinates.rotation;
            if (d5 != 0.0d) {
                canvas.rotate((float) d5);
            }
            canvas.translate(((-widthInternal) / 2.0f) - anonymousClass1.getPaddingLeft(), ((-heightInternal) / 2.0f) - anonymousClass1.getPaddingTop());
            anonymousClass1.drawInternal(canvas);
            canvas.restore();
        }

        @Override
        public final void onAttachedToWindow(boolean z) {
            AnonymousClass1 anonymousClass1 = this.marker;
            if (!z) {
                anonymousClass1.attachedToWindow = false;
                anonymousClass1.flagImageReceiver.onDetachedFromWindow();
                anonymousClass1.flagAnimatedImageReceiver.onDetachedFromWindow();
            } else {
                anonymousClass1.attachedToWindow = true;
                if (anonymousClass1.isVideo) {
                    anonymousClass1.flagAnimatedImageReceiver.onAttachedToWindow();
                } else {
                    anonymousClass1.flagImageReceiver.onAttachedToWindow();
                }
            }
        }

        @Override
        public final void setParent(View view) {
            this.parentView = view;
        }
    }

    public StoryWidgetsImageDecorator(TL_stories.StoryItem storyItem) {
        for (int i = 0; i < storyItem.media_areas.size(); i++) {
            if (storyItem.media_areas.get(i) instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                if (this.drawingObjects == null) {
                    this.drawingObjects = new ArrayList();
                }
                this.drawingObjects.add(new ReactionWidget((TL_stories.TL_mediaAreaSuggestedReaction) storyItem.media_areas.get(i)));
            } else if (storyItem.media_areas.get(i) instanceof TL_stories.TL_mediaAreaWeather) {
                if (this.drawingObjects == null) {
                    this.drawingObjects = new ArrayList();
                }
                this.drawingObjects.add(new WeatherWidget((TL_stories.TL_mediaAreaWeather) storyItem.media_areas.get(i)));
            }
        }
    }

    @Override
    public final void onAttachedToWindow(ImageReceiver imageReceiver) {
        ArrayList arrayList = this.drawingObjects;
        if (arrayList == null) {
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            ((DrawingObject) arrayList.get(i)).setParent(imageReceiver.getParentView());
            ((DrawingObject) arrayList.get(i)).onAttachedToWindow(true);
        }
    }

    @Override
    public final void onDetachedFromWidnow() {
        ArrayList arrayList = this.drawingObjects;
        if (arrayList == null) {
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            ((DrawingObject) arrayList.get(i)).onAttachedToWindow(false);
        }
    }

    @Override
    public final void onDraw(Canvas canvas, ImageReceiver imageReceiver) {
        ArrayList arrayList = this.drawingObjects;
        if (arrayList == null) {
            return;
        }
        float alpha = imageReceiver.getAlpha();
        float centerX = imageReceiver.getCenterX();
        float centerY = imageReceiver.getCenterY();
        float imageWidth = imageReceiver.getImageWidth();
        this.imageW = imageWidth;
        float f = (16.0f * imageWidth) / 9.0f;
        this.imageH = f;
        this.imageX = centerX - (imageWidth / 2.0f);
        this.imageY = centerY - (f / 2.0f);
        canvas.save();
        canvas.clipRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        for (int i = 0; i < arrayList.size(); i++) {
            ((DrawingObject) arrayList.get(i)).draw(canvas, alpha);
        }
        canvas.restore();
    }
}
