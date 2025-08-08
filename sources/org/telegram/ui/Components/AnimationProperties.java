package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.Property;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Cells.DialogCell;
import org.telegram.ui.PhotoViewer;

public abstract class AnimationProperties {
    public static final Property COLOR_DRAWABLE_ALPHA;
    public static final Property PAINT_ALPHA;
    public static final Property SHAPE_DRAWABLE_ALPHA;
    public static OvershootInterpolator overshootInterpolator = new OvershootInterpolator(1.9f);
    public static final Property PAINT_COLOR = new IntProperty("color") {
        @Override
        public void setValue(Paint paint, int i) {
            paint.setColor(i);
        }

        @Override
        public Integer get(Paint paint) {
            return Integer.valueOf(paint.getColor());
        }
    };
    public static final Property IMAGE_RECEIVER_ALPHA = new FloatProperty("currentAlpha") {
        @Override
        public void setValue(ImageReceiver imageReceiver, float f) {
            imageReceiver.setCurrentAlpha(f);
        }

        @Override
        public Float get(ImageReceiver imageReceiver) {
            return Float.valueOf(imageReceiver.getCurrentAlpha());
        }
    };
    public static final Property CLIPPING_IMAGE_VIEW_PROGRESS = new FloatProperty("animationProgress") {
        @Override
        public void setValue(ClippingImageView clippingImageView, float f) {
            clippingImageView.setAnimationProgress(f);
        }

        @Override
        public Float get(ClippingImageView clippingImageView) {
            return Float.valueOf(clippingImageView.getAnimationProgress());
        }
    };
    public static final Property PHOTO_VIEWER_ANIMATION_VALUE = new FloatProperty("animationValue") {
        @Override
        public void setValue(PhotoViewer photoViewer, float f) {
            photoViewer.setAnimationValue(f);
        }

        @Override
        public Float get(PhotoViewer photoViewer) {
            return Float.valueOf(photoViewer.getAnimationValue());
        }
    };
    public static final Property CLIP_DIALOG_CELL_PROGRESS = new FloatProperty("clipProgress") {
        @Override
        public void setValue(DialogCell dialogCell, float f) {
            dialogCell.setClipProgress(f);
        }

        @Override
        public Float get(DialogCell dialogCell) {
            return Float.valueOf(dialogCell.getClipProgress());
        }
    };

    static {
        String str = "alpha";
        PAINT_ALPHA = new IntProperty(str) {
            @Override
            public void setValue(Paint paint, int i) {
                paint.setAlpha(i);
            }

            @Override
            public Integer get(Paint paint) {
                return Integer.valueOf(paint.getAlpha());
            }
        };
        COLOR_DRAWABLE_ALPHA = new IntProperty(str) {
            @Override
            public void setValue(ColorDrawable colorDrawable, int i) {
                colorDrawable.setAlpha(i);
            }

            @Override
            public Integer get(ColorDrawable colorDrawable) {
                return Integer.valueOf(colorDrawable.getAlpha());
            }
        };
        SHAPE_DRAWABLE_ALPHA = new IntProperty(str) {
            @Override
            public void setValue(ShapeDrawable shapeDrawable, int i) {
                shapeDrawable.getPaint().setAlpha(i);
            }

            @Override
            public Integer get(ShapeDrawable shapeDrawable) {
                return Integer.valueOf(shapeDrawable.getPaint().getAlpha());
            }
        };
    }

    public static abstract class FloatProperty extends Property {
        public abstract void setValue(Object obj, float f);

        public FloatProperty(String str) {
            super(Float.class, str);
        }

        @Override
        public final void set(Object obj, Float f) {
            setValue(obj, f.floatValue());
        }
    }

    public static abstract class IntProperty extends Property {
        public abstract void setValue(Object obj, int i);

        public IntProperty(String str) {
            super(Integer.class, str);
        }

        @Override
        public final void set(Object obj, Integer num) {
            setValue(obj, num.intValue());
        }
    }
}
