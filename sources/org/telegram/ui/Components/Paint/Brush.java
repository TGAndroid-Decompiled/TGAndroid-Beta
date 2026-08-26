package org.telegram.ui.Components.Paint;

import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public abstract class Brush {
    public static final List BRUSHES_LIST = Arrays.asList(new Radial(), new Arrow(), new Elliptical(), new Neon(), new Blurer(), new Eraser());

    public final class Arrow extends Brush {
        @Override
        public final int getDefaultColor() {
            return -30208;
        }

        @Override
        public final float getDefaultWeight() {
            return 0.25f;
        }

        @Override
        public final int getIconRes() {
            return R.raw.photo_arrow;
        }

        @Override
        public final float getSmoothThicknessRate() {
            return 0.25f;
        }
    }

    public final class Blurer extends Brush {
        @Override
        public final float getAlpha() {
            return 1.0f;
        }

        @Override
        public final float getDefaultWeight() {
            return 1.0f;
        }

        @Override
        public final int getIconRes() {
            return R.raw.photo_blur;
        }

        @Override
        public final float getPreviewScale() {
            return 0.35f;
        }

        @Override
        public final String getShaderName(int i) {
            if (i == 0) {
                return "blitWithMaskBlurer";
            }
            if (i == 1) {
                return "compositeWithMaskBlurer";
            }
            if (i != 2) {
                return null;
            }
            return "brush";
        }
    }

    public final class Elliptical extends Brush {
        @Override
        public final float getAlpha() {
            return 0.3f;
        }

        @Override
        public final float getAngle() {
            return (float) Math.toRadians(0.0d);
        }

        @Override
        public final int getDefaultColor() {
            return -10742;
        }

        @Override
        public final float getDefaultWeight() {
            return 0.5f;
        }

        @Override
        public final int getIconRes() {
            return R.raw.photo_marker;
        }

        @Override
        public final float getOverrideAlpha() {
            return 0.45f;
        }

        @Override
        public final float getPreviewScale() {
            return 0.4f;
        }

        @Override
        public final float getScale() {
            return 1.5f;
        }

        @Override
        public final float getSpacing() {
            return 0.04f;
        }

        @Override
        public final int getStampResId() {
            return R.drawable.paint_elliptical_brush;
        }
    }

    public final class Eraser extends Brush {
        @Override
        public final float getAlpha() {
            return 1.0f;
        }

        @Override
        public final float getDefaultWeight() {
            return 1.0f;
        }

        @Override
        public final int getIconRes() {
            return R.raw.photo_eraser;
        }

        @Override
        public final float getPreviewScale() {
            return 0.35f;
        }

        @Override
        public final String getShaderName(int i) {
            if (i == 0) {
                return "blitWithMaskEraser";
            }
            if (i == 1) {
                return "compositeWithMaskEraser";
            }
            if (i != 2) {
                return null;
            }
            return "brush";
        }
    }

    public final class Neon extends Brush {
        @Override
        public final float getAlpha() {
            return 0.7f;
        }

        @Override
        public final int getDefaultColor() {
            return -13318311;
        }

        @Override
        public final float getDefaultWeight() {
            return 0.5f;
        }

        @Override
        public final int getIconRes() {
            return R.raw.photo_neon;
        }

        @Override
        public final float getPreviewScale() {
            return 0.2f;
        }

        @Override
        public final float getScale() {
            return 1.45f;
        }

        @Override
        public final String getShaderName(int i) {
            if (i == 0) {
                return "blitWithMaskLight";
            }
            if (i == 1) {
                return "compositeWithMaskLight";
            }
            if (i != 2) {
                return null;
            }
            return "brushLight";
        }

        @Override
        public final float getSpacing() {
            return 0.07f;
        }

        @Override
        public final int getStampResId() {
            return R.drawable.paint_neon_brush;
        }
    }

    public final class Radial extends Brush {
        @Override
        public final int getDefaultColor() {
            return -47814;
        }

        @Override
        public final int getIconRes() {
            return R.raw.photo_pen;
        }
    }

    public abstract class Shape extends Brush {
        public static final List SHAPES_LIST = Arrays.asList(new Circle(), new Rectangle(), new Star(), new Bubble(), new Arrow());

        public final class Arrow extends Shape {
            @Override
            public final int getFilledIconRes() {
                return R.drawable.photo_arrowshape;
            }

            @Override
            public final int getIconRes() {
                return R.drawable.photo_arrowshape;
            }

            @Override
            public final String getShapeName() {
                return LocaleController.getString(R.string.PaintArrow);
            }

            @Override
            public final int getShapeShaderType() {
                return 4;
            }
        }

        public final class Bubble extends Shape {
            @Override
            public final int getFilledIconRes() {
                return R.drawable.msg_msgbubble2;
            }

            @Override
            public final int getIconRes() {
                return R.drawable.msg_msgbubble;
            }

            @Override
            public final String getShapeName() {
                return LocaleController.getString(R.string.PaintBubble);
            }

            @Override
            public final int getShapeShaderType() {
                return 3;
            }
        }

        public final class Circle extends Shape {
            @Override
            public final int getFilledIconRes() {
                return R.drawable.photo_circle_fill;
            }

            @Override
            public final int getIconRes() {
                return R.drawable.photo_circle;
            }

            @Override
            public final String getShapeName() {
                return LocaleController.getString(R.string.PaintCircle);
            }

            @Override
            public final int getShapeShaderType() {
                return 0;
            }
        }

        public final class Rectangle extends Shape {
            @Override
            public final int getFilledIconRes() {
                return R.drawable.photo_rectangle_fill;
            }

            @Override
            public final int getIconRes() {
                return R.drawable.photo_rectangle;
            }

            @Override
            public final String getShapeName() {
                return LocaleController.getString(R.string.PaintRectangle);
            }

            @Override
            public final int getShapeShaderType() {
                return 1;
            }
        }

        public final class Star extends Shape {
            @Override
            public final int getFilledIconRes() {
                return R.drawable.photo_star_fill;
            }

            @Override
            public final int getIconRes() {
                return R.drawable.photo_star;
            }

            @Override
            public final String getShapeName() {
                return LocaleController.getString(R.string.PaintStar);
            }

            @Override
            public final int getShapeShaderType() {
                return 2;
            }
        }

        @Override
        public final float getAlpha() {
            return 1.0f;
        }

        public abstract int getFilledIconRes();

        @Override
        public final String getShaderName(int i) {
            if (i == 0 || i == 1) {
                return "shape";
            }
            if (i != 2) {
                return null;
            }
            return "brush";
        }

        public abstract String getShapeName();

        public abstract int getShapeShaderType();
    }

    public float getAlpha() {
        return 0.85f;
    }

    public float getAngle() {
        return 0.0f;
    }

    public int getDefaultColor() {
        return -16777216;
    }

    public float getDefaultWeight() {
        return 0.25f;
    }

    public abstract int getIconRes();

    public float getOverrideAlpha() {
        return 1.0f;
    }

    public float getPreviewScale() {
        return 0.4f;
    }

    public float getScale() {
        return 1.0f;
    }

    public String getShaderName(int i) {
        if (i == 0) {
            return "blitWithMask";
        }
        if (i == 1) {
            return "compositeWithMask";
        }
        if (i != 2) {
            return null;
        }
        return "brush";
    }

    public float getSmoothThicknessRate() {
        return 1.0f;
    }

    public float getSpacing() {
        return 0.15f;
    }

    public int getStampResId() {
        return R.drawable.paint_radial_brush;
    }
}
