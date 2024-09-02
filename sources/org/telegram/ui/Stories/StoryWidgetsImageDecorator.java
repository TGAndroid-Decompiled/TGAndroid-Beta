package org.telegram.ui.Stories;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories$MediaAreaCoordinates;
import org.telegram.tgnet.tl.TL_stories$StoryItem;
import org.telegram.tgnet.tl.TL_stories$TL_mediaAreaSuggestedReaction;
import org.telegram.tgnet.tl.TL_stories$TL_mediaAreaWeather;
import org.telegram.ui.Components.Paint.Views.LocationMarker;
import org.telegram.ui.Components.Reactions.ReactionImageHolder;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Stories.recorder.Weather;

public class StoryWidgetsImageDecorator extends ImageReceiver.Decorator {
    ArrayList<DrawingObject> drawingObjects;
    float imageH;
    float imageW;
    float imageX;
    float imageY;

    public static abstract class DrawingObject {
        public abstract void draw(Canvas canvas, ImageReceiver imageReceiver, float f);

        public abstract void onAttachedToWindow(boolean z);

        public abstract void setParent(View view);
    }

    public StoryWidgetsImageDecorator(TL_stories$StoryItem tL_stories$StoryItem) {
        for (int i = 0; i < tL_stories$StoryItem.media_areas.size(); i++) {
            if (tL_stories$StoryItem.media_areas.get(i) instanceof TL_stories$TL_mediaAreaSuggestedReaction) {
                if (this.drawingObjects == null) {
                    this.drawingObjects = new ArrayList<>();
                }
                this.drawingObjects.add(new ReactionWidget((TL_stories$TL_mediaAreaSuggestedReaction) tL_stories$StoryItem.media_areas.get(i)));
            } else if (tL_stories$StoryItem.media_areas.get(i) instanceof TL_stories$TL_mediaAreaWeather) {
                if (this.drawingObjects == null) {
                    this.drawingObjects = new ArrayList<>();
                }
                this.drawingObjects.add(new WeatherWidget((TL_stories$TL_mediaAreaWeather) tL_stories$StoryItem.media_areas.get(i)));
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
            this.drawingObjects.get(i).draw(canvas, imageReceiver, alpha);
        }
        canvas.restore();
    }

    @Override
    public void onAttachedToWindow(ImageReceiver imageReceiver) {
        if (this.drawingObjects == null) {
            return;
        }
        for (int i = 0; i < this.drawingObjects.size(); i++) {
            this.drawingObjects.get(i).setParent(imageReceiver.getParentView());
            this.drawingObjects.get(i).onAttachedToWindow(true);
        }
    }

    @Override
    public void onDetachedFromWidnow() {
        if (this.drawingObjects == null) {
            return;
        }
        for (int i = 0; i < this.drawingObjects.size(); i++) {
            this.drawingObjects.get(i).onAttachedToWindow(false);
        }
    }

    public class ReactionWidget extends DrawingObject {
        private final ReactionImageHolder imageHolder;
        private final TL_stories$TL_mediaAreaSuggestedReaction mediaArea;
        private final StoryReactionWidgetBackground storyReactionWidgetBackground;

        public ReactionWidget(TL_stories$TL_mediaAreaSuggestedReaction tL_stories$TL_mediaAreaSuggestedReaction) {
            StoryReactionWidgetBackground storyReactionWidgetBackground = new StoryReactionWidgetBackground(null);
            this.storyReactionWidgetBackground = storyReactionWidgetBackground;
            ReactionImageHolder reactionImageHolder = new ReactionImageHolder(null);
            this.imageHolder = reactionImageHolder;
            this.mediaArea = tL_stories$TL_mediaAreaSuggestedReaction;
            if (tL_stories$TL_mediaAreaSuggestedReaction.flipped) {
                storyReactionWidgetBackground.setMirror(true, false);
            }
            if (tL_stories$TL_mediaAreaSuggestedReaction.dark) {
                storyReactionWidgetBackground.nextStyle();
            }
            reactionImageHolder.setStatic();
            reactionImageHolder.setVisibleReaction(ReactionsLayoutInBubble.VisibleReaction.fromTL(tL_stories$TL_mediaAreaSuggestedReaction.reaction));
        }

        @Override
        public void draw(Canvas canvas, ImageReceiver imageReceiver, float f) {
            if (this.imageHolder.isLoaded()) {
                StoryWidgetsImageDecorator storyWidgetsImageDecorator = StoryWidgetsImageDecorator.this;
                double d = storyWidgetsImageDecorator.imageX;
                float f2 = storyWidgetsImageDecorator.imageW;
                double d2 = f2;
                TL_stories$MediaAreaCoordinates tL_stories$MediaAreaCoordinates = this.mediaArea.coordinates;
                double d3 = tL_stories$MediaAreaCoordinates.x;
                Double.isNaN(d2);
                Double.isNaN(d);
                float f3 = (float) (d + ((d2 * d3) / 100.0d));
                double d4 = storyWidgetsImageDecorator.imageY;
                float f4 = storyWidgetsImageDecorator.imageH;
                double d5 = f4;
                double d6 = tL_stories$MediaAreaCoordinates.y;
                Double.isNaN(d5);
                Double.isNaN(d4);
                float f5 = (float) (d4 + ((d5 * d6) / 100.0d));
                double d7 = f2;
                double d8 = tL_stories$MediaAreaCoordinates.w;
                Double.isNaN(d7);
                float f6 = (float) ((d7 * d8) / 100.0d);
                double d9 = f4;
                double d10 = tL_stories$MediaAreaCoordinates.h;
                Double.isNaN(d9);
                float f7 = f6 / 2.0f;
                float f8 = ((float) ((d9 * d10) / 100.0d)) / 2.0f;
                this.storyReactionWidgetBackground.setBounds((int) (f3 - f7), (int) (f5 - f8), (int) (f7 + f3), (int) (f8 + f5));
                this.storyReactionWidgetBackground.setAlpha((int) (255.0f * f));
                canvas.save();
                double d11 = this.mediaArea.coordinates.rotation;
                if (d11 != 0.0d) {
                    canvas.rotate((float) d11, f3, f5);
                }
                Rect rect = AndroidUtilities.rectTmp2;
                float height = (this.storyReactionWidgetBackground.getBounds().height() * 0.61f) / 2.0f;
                rect.set((int) (this.storyReactionWidgetBackground.getBounds().centerX() - height), (int) (this.storyReactionWidgetBackground.getBounds().centerY() - height), (int) (this.storyReactionWidgetBackground.getBounds().centerX() + height), (int) (this.storyReactionWidgetBackground.getBounds().centerY() + height));
                this.storyReactionWidgetBackground.updateShadowLayer(1.0f);
                this.storyReactionWidgetBackground.draw(canvas);
                this.imageHolder.setBounds(rect);
                this.imageHolder.setAlpha(f);
                this.imageHolder.setColor(this.storyReactionWidgetBackground.isDarkStyle() ? -1 : -16777216);
                this.imageHolder.draw(canvas);
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
        private final TL_stories$TL_mediaAreaWeather mediaArea;
        private View parentView;

        public WeatherWidget(TL_stories$TL_mediaAreaWeather tL_stories$TL_mediaAreaWeather) {
            this.mediaArea = tL_stories$TL_mediaAreaWeather;
            Weather.State state = new Weather.State();
            state.emoji = tL_stories$TL_mediaAreaWeather.emoji;
            state.temperature = (float) tL_stories$TL_mediaAreaWeather.temperature_c;
            LocationMarker locationMarker = new LocationMarker(ApplicationLoader.applicationContext, 1, AndroidUtilities.density, 0, StoryWidgetsImageDecorator.this) {
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
            locationMarker.setType(0, tL_stories$TL_mediaAreaWeather.color);
            locationMarker.setupLayout();
        }

        @Override
        public void draw(Canvas canvas, ImageReceiver imageReceiver, float f) {
            StoryWidgetsImageDecorator storyWidgetsImageDecorator = StoryWidgetsImageDecorator.this;
            double d = storyWidgetsImageDecorator.imageX;
            float f2 = storyWidgetsImageDecorator.imageW;
            double d2 = f2;
            TL_stories$MediaAreaCoordinates tL_stories$MediaAreaCoordinates = this.mediaArea.coordinates;
            double d3 = tL_stories$MediaAreaCoordinates.x;
            Double.isNaN(d2);
            Double.isNaN(d);
            float f3 = (float) (d + ((d2 * d3) / 100.0d));
            double d4 = storyWidgetsImageDecorator.imageY;
            float f4 = storyWidgetsImageDecorator.imageH;
            double d5 = f4;
            double d6 = tL_stories$MediaAreaCoordinates.y;
            Double.isNaN(d5);
            Double.isNaN(d4);
            float f5 = (float) (d4 + ((d5 * d6) / 100.0d));
            double d7 = f2;
            double d8 = tL_stories$MediaAreaCoordinates.w;
            Double.isNaN(d7);
            float f6 = (float) ((d7 * d8) / 100.0d);
            double d9 = f4;
            double d10 = tL_stories$MediaAreaCoordinates.h;
            Double.isNaN(d9);
            canvas.save();
            canvas.translate(f3, f5);
            float min = Math.min(f6 / ((this.marker.getWidthInternal() - this.marker.getPaddingLeft()) - this.marker.getPaddingRight()), ((float) ((d9 * d10) / 100.0d)) / ((this.marker.getHeightInternal() - this.marker.getPaddingTop()) - this.marker.getPaddingBottom()));
            canvas.scale(min, min);
            double d11 = this.mediaArea.coordinates.rotation;
            if (d11 != 0.0d) {
                canvas.rotate((float) d11);
            }
            canvas.translate(((-r0) / 2.0f) - this.marker.getPaddingLeft(), ((-r1) / 2.0f) - this.marker.getPaddingTop());
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
