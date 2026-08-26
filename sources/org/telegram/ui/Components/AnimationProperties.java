package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.Property;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Cells.DialogCell;
import org.telegram.ui.PhotoViewer;

public class AnimationProperties {
    public static final Property<ClippingImageView, Float> CLIPPING_IMAGE_VIEW_PROGRESS;
    public static final Property<DialogCell, Float> CLIP_DIALOG_CELL_PROGRESS;
    public static final Property<Drawable, Integer> COLOR_DRAWABLE_ALPHA;
    public static final Property<Drawable, Integer> DRAWABLE_ALPHA;
    public static final Property<Paint, Integer> PAINT_ALPHA;
    public static final Property<PhotoViewer, Float> PHOTO_VIEWER_ANIMATION_VALUE;
    public static final Property<ShapeDrawable, Integer> SHAPE_DRAWABLE_ALPHA;
    public static OvershootInterpolator overshootInterpolator = new OvershootInterpolator(1.9f);
    public static final Property<Paint, Integer> PAINT_COLOR = new IntProperty<Paint>("color") {
        @Override
        public Integer get(Paint paint) {
            return Integer.valueOf(paint.getColor());
        }

        @Override
        public void setValue(Paint paint, int i) {
            paint.setColor(i);
        }
    };
    public static final Property<ImageReceiver, Float> IMAGE_RECEIVER_ALPHA = new FloatProperty<ImageReceiver>("currentAlpha") {
        @Override
        public Float get(ImageReceiver imageReceiver) {
            return Float.valueOf(imageReceiver.getCurrentAlpha());
        }

        @Override
        public void setValue(ImageReceiver imageReceiver, float f) {
            imageReceiver.setCurrentAlpha(f);
        }
    };

    public static abstract class FloatProperty<T> extends Property<T, Float> {
        public FloatProperty(String str) {
            super(Float.class, str);
        }

        public abstract void setValue(T t, float f);

        @Override
        public final void set(T t, Float f) {
            setValue(t, f.floatValue());
        }
    }

    public static abstract class IntProperty<T> extends Property<T, Integer> {
        public IntProperty(String str) {
            super(Integer.class, str);
        }

        public abstract void setValue(T t, int i);

        @Override
        public final void set(T t, Integer num) {
            setValue(t, num.intValue());
        }
    }

    static {
        String str = "alpha";
        PAINT_ALPHA = new IntProperty<Paint>(str) {
            @Override
            public Integer get(Paint paint) {
                return Integer.valueOf(paint.getAlpha());
            }

            @Override
            public void setValue(Paint paint, int i) {
                paint.setAlpha(i);
            }
        };
        IntProperty<Drawable> intProperty = new IntProperty<Drawable>(str) {
            @Override
            public Integer get(Drawable drawable) {
                return Integer.valueOf(drawable.getAlpha());
            }

            @Override
            public void setValue(Drawable drawable, int i) {
                drawable.setAlpha(i);
            }
        };
        DRAWABLE_ALPHA = intProperty;
        COLOR_DRAWABLE_ALPHA = intProperty;
        SHAPE_DRAWABLE_ALPHA = new IntProperty<ShapeDrawable>(str) {
            @Override
            public Integer get(ShapeDrawable shapeDrawable) {
                return Integer.valueOf(shapeDrawable.getPaint().getAlpha());
            }

            @Override
            public void setValue(ShapeDrawable shapeDrawable, int i) {
                shapeDrawable.getPaint().setAlpha(i);
            }
        };
        CLIPPING_IMAGE_VIEW_PROGRESS = new FloatProperty<ClippingImageView>("animationProgress") {
            @Override
            public Float get(ClippingImageView clippingImageView) {
                return Float.valueOf(clippingImageView.getAnimationProgress());
            }

            @Override
            public void setValue(ClippingImageView clippingImageView, float f) {
                clippingImageView.setAnimationProgress(f);
            }
        };
        PHOTO_VIEWER_ANIMATION_VALUE = new FloatProperty<PhotoViewer>("animationValue") {
            @Override
            public Float get(PhotoViewer photoViewer) {
                return Float.valueOf(photoViewer.getAnimationValue());
            }

            @Override
            public void setValue(PhotoViewer photoViewer, float f) {
                photoViewer.setAnimationValue(f);
            }
        };
        CLIP_DIALOG_CELL_PROGRESS = new FloatProperty<DialogCell>("clipProgress") {
            @Override
            public Float get(DialogCell dialogCell) {
                return Float.valueOf(dialogCell.getClipProgress());
            }

            @Override
            public void setValue(DialogCell dialogCell, float f) {
                dialogCell.setClipProgress(f);
            }
        };
    }
}
