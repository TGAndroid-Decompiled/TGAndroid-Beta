package org.telegram.ui.Stories;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.Paint.Views.LocationMarker;
import org.telegram.ui.Components.Reactions.ReactionImageHolder;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Stories.recorder.Weather;

public class StoryWidgetsImageDecorator extends ImageReceiver.Decorator {
    ArrayList drawingObjects;
    float imageH;
    float imageW;
    float imageX;
    float imageY;

    public static abstract class DrawingObject {
        public abstract void draw(Canvas canvas, ImageReceiver imageReceiver, float f);

        public abstract void onAttachedToWindow(boolean z);

        public abstract void setParent(View view);
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
    protected void onDraw(Canvas canvas, ImageReceiver imageReceiver) {
        if (this.drawingObjects == null) {
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
        for (int i = 0; i < this.drawingObjects.size(); i++) {
            ((DrawingObject) this.drawingObjects.get(i)).draw(canvas, imageReceiver, alpha);
        }
        canvas.restore();
    }

    @Override
    public void onAttachedToWindow(ImageReceiver imageReceiver) {
        if (this.drawingObjects == null) {
            return;
        }
        for (int i = 0; i < this.drawingObjects.size(); i++) {
            ((DrawingObject) this.drawingObjects.get(i)).setParent(imageReceiver.getParentView());
            ((DrawingObject) this.drawingObjects.get(i)).onAttachedToWindow(true);
        }
    }

    @Override
    public void onDetachedFromWidnow() {
        if (this.drawingObjects == null) {
            return;
        }
        for (int i = 0; i < this.drawingObjects.size(); i++) {
            ((DrawingObject) this.drawingObjects.get(i)).onAttachedToWindow(false);
        }
    }

    public class ReactionWidget extends DrawingObject {
        private final ReactionImageHolder imageHolder;
        private final TL_stories.TL_mediaAreaSuggestedReaction mediaArea;
        private final StoryReactionWidgetBackground storyReactionWidgetBackground;

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
                storyReactionWidgetBackground.nextStyle();
            }
            reactionImageHolder.setStatic();
            reactionImageHolder.setVisibleReaction(ReactionsLayoutInBubble.VisibleReaction.fromTL(tL_mediaAreaSuggestedReaction.reaction));
        }

        @Override
        public void draw(Canvas canvas, ImageReceiver imageReceiver, float f) {
            Canvas canvas2;
            if (this.imageHolder.isLoaded()) {
                StoryWidgetsImageDecorator storyWidgetsImageDecorator = StoryWidgetsImageDecorator.this;
                double d = storyWidgetsImageDecorator.imageX;
                double d2 = storyWidgetsImageDecorator.imageW;
                TL_stories.MediaAreaCoordinates mediaAreaCoordinates = this.mediaArea.coordinates;
                float f2 = (float) (d + ((mediaAreaCoordinates.x * d2) / 100.0d));
                double d3 = storyWidgetsImageDecorator.imageY;
                double d4 = storyWidgetsImageDecorator.imageH;
                float f3 = (float) (d3 + ((mediaAreaCoordinates.y * d4) / 100.0d));
                float f4 = ((float) ((d2 * mediaAreaCoordinates.w) / 100.0d)) / 2.0f;
                float f5 = ((float) ((d4 * mediaAreaCoordinates.h) / 100.0d)) / 2.0f;
                this.storyReactionWidgetBackground.setBounds((int) (f2 - f4), (int) (f3 - f5), (int) (f4 + f2), (int) (f5 + f3));
                this.storyReactionWidgetBackground.setAlpha((int) (255.0f * f));
                canvas.save();
                double d5 = this.mediaArea.coordinates.rotation;
                if (d5 != 0.0d) {
                    canvas2 = canvas;
                    canvas2.rotate((float) d5, f2, f3);
                } else {
                    canvas2 = canvas;
                }
                Rect rect = AndroidUtilities.rectTmp2;
                float height = (this.storyReactionWidgetBackground.getBounds().height() * 0.61f) / 2.0f;
                rect.set((int) (this.storyReactionWidgetBackground.getBounds().centerX() - height), (int) (this.storyReactionWidgetBackground.getBounds().centerY() - height), (int) (this.storyReactionWidgetBackground.getBounds().centerX() + height), (int) (this.storyReactionWidgetBackground.getBounds().centerY() + height));
                this.storyReactionWidgetBackground.updateShadowLayer(1.0f);
                this.storyReactionWidgetBackground.draw(canvas2);
                this.imageHolder.setBounds(rect);
                this.imageHolder.setAlpha(f);
                this.imageHolder.setColor(this.storyReactionWidgetBackground.isDarkStyle() ? -1 : -16777216);
                this.imageHolder.draw(canvas2);
                canvas.restore();
            }
        }

        @Override
        public void onAttachedToWindow(boolean z) {
            this.imageHolder.onAttachedToWindow(z);
        }

        @Override
        public void setParent(View view) {
            this.imageHolder.setParent(view);
        }
    }

    public class WeatherWidget extends DrawingObject {
        private final LocationMarker marker;
        private final TL_stories.TL_mediaAreaWeather mediaArea;
        private View parentView;

        public WeatherWidget(TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather) {
            this.mediaArea = tL_mediaAreaWeather;
            Weather.State state = new Weather.State();
            state.emoji = tL_mediaAreaWeather.emoji;
            state.temperature = (float) tL_mediaAreaWeather.temperature_c;
            LocationMarker locationMarker = new LocationMarker(ApplicationLoader.applicationContext, 1, AndroidUtilities.density, 0) {
                @Override
                public void invalidate() {
                    if (WeatherWidget.this.parentView != null) {
                        WeatherWidget.this.parentView.invalidate();
                    }
                }
            };
            this.marker = locationMarker;
            locationMarker.setMaxWidth(AndroidUtilities.displaySize.x);
            locationMarker.setIsVideo(false);
            locationMarker.setCodeEmoji(UserConfig.selectedAccount, state.getEmoji());
            locationMarker.setText(state.getTemperature());
            locationMarker.setType(3, tL_mediaAreaWeather.color);
            locationMarker.setupLayout();
        }

        @Override
        public void draw(Canvas canvas, ImageReceiver imageReceiver, float f) {
            StoryWidgetsImageDecorator storyWidgetsImageDecorator = StoryWidgetsImageDecorator.this;
            double d = storyWidgetsImageDecorator.imageX;
            double d2 = storyWidgetsImageDecorator.imageW;
            TL_stories.MediaAreaCoordinates mediaAreaCoordinates = this.mediaArea.coordinates;
            float f2 = (float) (d + ((mediaAreaCoordinates.x * d2) / 100.0d));
            double d3 = storyWidgetsImageDecorator.imageY;
            double d4 = storyWidgetsImageDecorator.imageH;
            float f3 = (float) (d3 + ((mediaAreaCoordinates.y * d4) / 100.0d));
            float f4 = (float) ((d2 * mediaAreaCoordinates.w) / 100.0d);
            float f5 = (float) ((d4 * mediaAreaCoordinates.h) / 100.0d);
            canvas.save();
            canvas.translate(f2, f3);
            float min = Math.min(f4 / ((this.marker.getWidthInternal() - this.marker.getPaddingLeft()) - this.marker.getPaddingRight()), f5 / ((this.marker.getHeightInternal() - this.marker.getPaddingTop()) - this.marker.getPaddingBottom()));
            canvas.scale(min, min);
            double d5 = this.mediaArea.coordinates.rotation;
            if (d5 != 0.0d) {
                canvas.rotate((float) d5);
            }
            canvas.translate(((-r14) / 2.0f) - this.marker.getPaddingLeft(), ((-r0) / 2.0f) - this.marker.getPaddingTop());
            this.marker.drawInternal(canvas);
            canvas.restore();
        }

        @Override
        public void onAttachedToWindow(boolean z) {
            if (z) {
                this.marker.attachInternal();
            } else {
                this.marker.detachInternal();
            }
        }

        @Override
        public void setParent(View view) {
            this.parentView = view;
        }
    }
}
