package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.Property;
import android.view.animation.OvershootInterpolator;
import org.telegram.ui.Cells.DialogCell;
import org.telegram.ui.PhotoViewer;

public abstract class AnimationProperties {
    public static final Property COLOR_DRAWABLE_ALPHA;
    public static final Property PAINT_ALPHA;
    public static final Property SHAPE_DRAWABLE_ALPHA;
    public static OvershootInterpolator overshootInterpolator = new OvershootInterpolator(1.9f);
    public static final Property PAINT_COLOR = new IntProperty("color") {
        @Override
        public Integer get(Paint paint) {
            return Integer.valueOf(paint.getColor());
        }

        @Override
        public void setValue(Paint paint, int i) {
            paint.setColor(i);
        }
    };
    public static final Property CLIPPING_IMAGE_VIEW_PROGRESS = new FloatProperty("animationProgress") {
        @Override
        public Float get(ClippingImageView clippingImageView) {
            return Float.valueOf(clippingImageView.getAnimationProgress());
        }

        @Override
        public void setValue(ClippingImageView clippingImageView, float f) {
            clippingImageView.setAnimationProgress(f);
        }
    };
    public static final Property PHOTO_VIEWER_ANIMATION_VALUE = new FloatProperty("animationValue") {
        @Override
        public Float get(PhotoViewer photoViewer) {
            return Float.valueOf(photoViewer.getAnimationValue());
        }

        @Override
        public void setValue(PhotoViewer photoViewer, float f) {
            photoViewer.setAnimationValue(f);
        }
    };
    public static final Property CLIP_DIALOG_CELL_PROGRESS = new FloatProperty("clipProgress") {
        @Override
        public Float get(DialogCell dialogCell) {
            return Float.valueOf(dialogCell.getClipProgress());
        }

        @Override
        public void setValue(DialogCell dialogCell, float f) {
            dialogCell.setClipProgress(f);
        }
    };

    public static abstract class FloatProperty extends Property {
        public FloatProperty(String str) {
            super(Float.class, str);
        }

        @Override
        public final void set(Object obj, Float f) {
            setValue(obj, f.floatValue());
        }

        public abstract void setValue(Object obj, float f);
    }

    public static abstract class IntProperty extends Property {
        public IntProperty(String str) {
            super(Integer.class, str);
        }

        @Override
        public final void set(Object obj, Integer num) {
            setValue(obj, num.intValue());
        }

        public abstract void setValue(Object obj, int i);
    }

    static {
        String str = "alpha";
        PAINT_ALPHA = new IntProperty(str) {
            @Override
            public Integer get(Paint paint) {
                return Integer.valueOf(paint.getAlpha());
            }

            @Override
            public void setValue(Paint paint, int i) {
                paint.setAlpha(i);
            }
        };
        COLOR_DRAWABLE_ALPHA = new IntProperty(str) {
            @Override
            public Integer get(ColorDrawable colorDrawable) {
                return Integer.valueOf(colorDrawable.getAlpha());
            }

            @Override
            public void setValue(ColorDrawable colorDrawable, int i) {
                colorDrawable.setAlpha(i);
            }
        };
        SHAPE_DRAWABLE_ALPHA = new IntProperty(str) {
            @Override
            public Integer get(ShapeDrawable shapeDrawable) {
                return Integer.valueOf(shapeDrawable.getPaint().getAlpha());
            }

            @Override
            public void setValue(ShapeDrawable shapeDrawable, int i) {
                shapeDrawable.getPaint().setAlpha(i);
            }
        };
    }
}
