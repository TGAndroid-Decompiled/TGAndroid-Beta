package org.telegram.ui.Components.Paint;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public abstract class Brush {
    public static List BRUSHES_LIST = Arrays.asList(new Radial(), new Arrow(), new Elliptical(), new Neon(), new Blurer(), new Eraser());

    public static class Arrow extends Brush {
        @Override
        public int getDefaultColor() {
            return -30208;
        }

        @Override
        public float getDefaultWeight() {
            return 0.25f;
        }

        @Override
        public int getIconRes() {
            return R.raw.photo_arrow;
        }

        @Override
        public float getSmoothThicknessRate() {
            return 0.25f;
        }
    }

    public static class Blurer extends Brush {
        @Override
        public float getAlpha() {
            return 1.0f;
        }

        @Override
        public float getDefaultWeight() {
            return 1.0f;
        }

        @Override
        public int getIconRes() {
            return R.raw.photo_blur;
        }

        @Override
        public float getPreviewScale() {
            return 0.35f;
        }

        @Override
        public String getShaderName(int i) {
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

    public static class Elliptical extends Brush {
        @Override
        public float getAlpha() {
            return 0.3f;
        }

        @Override
        public float getAngle() {
            return (float) Math.toRadians(0.0d);
        }

        @Override
        public int getDefaultColor() {
            return -10742;
        }

        @Override
        public float getDefaultWeight() {
            return 0.5f;
        }

        @Override
        public int getIconRes() {
            return R.raw.photo_marker;
        }

        @Override
        public float getOverrideAlpha() {
            return 0.45f;
        }

        @Override
        public float getPreviewScale() {
            return 0.4f;
        }

        @Override
        public float getScale() {
            return 1.5f;
        }

        @Override
        public float getSpacing() {
            return 0.04f;
        }

        @Override
        public int getStampResId() {
            return R.drawable.paint_elliptical_brush;
        }
    }

    public static class Eraser extends Brush {
        @Override
        public float getAlpha() {
            return 1.0f;
        }

        @Override
        public float getDefaultWeight() {
            return 1.0f;
        }

        @Override
        public int getIconRes() {
            return R.raw.photo_eraser;
        }

        @Override
        public float getPreviewScale() {
            return 0.35f;
        }

        @Override
        public String getShaderName(int i) {
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

        @Override
        public boolean isEraser() {
            return true;
        }
    }

    public static class Neon extends Brush {
        @Override
        public float getAlpha() {
            return 0.7f;
        }

        @Override
        public int getDefaultColor() {
            return -13318311;
        }

        @Override
        public float getDefaultWeight() {
            return 0.5f;
        }

        @Override
        public int getIconRes() {
            return R.raw.photo_neon;
        }

        @Override
        public float getPreviewScale() {
            return 0.2f;
        }

        @Override
        public float getScale() {
            return 1.45f;
        }

        @Override
        public String getShaderName(int i) {
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
        public float getSpacing() {
            return 0.07f;
        }

        @Override
        public int getStampResId() {
            return R.drawable.paint_neon_brush;
        }
    }

    public static class Radial extends Brush {
        @Override
        public int getDefaultColor() {
            return -47814;
        }

        @Override
        public int getIconRes() {
            return R.raw.photo_pen;
        }
    }

    public static abstract class Shape extends Brush {
        public static List SHAPES_LIST = Arrays.asList(new Circle(), new Rectangle(), new Star(), new Bubble(), new Arrow());

        public static class Arrow extends Shape {
            @Override
            public int getFilledIconRes() {
                return R.drawable.photo_arrowshape;
            }

            @Override
            public int getIconRes() {
                return R.drawable.photo_arrowshape;
            }

            @Override
            public String getShapeName() {
                return LocaleController.getString(R.string.PaintArrow);
            }

            @Override
            public int getShapeShaderType() {
                return 4;
            }
        }

        public static class Bubble extends Shape {
            @Override
            public int getFilledIconRes() {
                return R.drawable.msg_msgbubble2;
            }

            @Override
            public int getIconRes() {
                return R.drawable.msg_msgbubble;
            }

            @Override
            public String getShapeName() {
                return LocaleController.getString(R.string.PaintBubble);
            }

            @Override
            public int getShapeShaderType() {
                return 3;
            }
        }

        public static class Circle extends Shape {
            @Override
            public int getFilledIconRes() {
                return R.drawable.photo_circle_fill;
            }

            @Override
            public int getIconRes() {
                return R.drawable.photo_circle;
            }

            @Override
            public String getShapeName() {
                return LocaleController.getString(R.string.PaintCircle);
            }

            @Override
            public int getShapeShaderType() {
                return 0;
            }
        }

        public static class Rectangle extends Shape {
            @Override
            public int getFilledIconRes() {
                return R.drawable.photo_rectangle_fill;
            }

            @Override
            public int getIconRes() {
                return R.drawable.photo_rectangle;
            }

            @Override
            public String getShapeName() {
                return LocaleController.getString(R.string.PaintRectangle);
            }

            @Override
            public int getShapeShaderType() {
                return 1;
            }
        }

        public static class Star extends Shape {
            @Override
            public int getFilledIconRes() {
                return R.drawable.photo_star_fill;
            }

            @Override
            public int getIconRes() {
                return R.drawable.photo_star;
            }

            @Override
            public String getShapeName() {
                return LocaleController.getString(R.string.PaintStar);
            }

            @Override
            public int getShapeShaderType() {
                return 2;
            }
        }

        public static Shape make(int i) {
            if (i >= 0 && i <= SHAPES_LIST.size()) {
                return (Shape) SHAPES_LIST.get(i);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Shape type must be in range from 0 to ");
            sb.append(SHAPES_LIST.size() - 1);
            sb.append(", but got ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        }

        @Override
        public float getAlpha() {
            return 1.0f;
        }

        public abstract int getFilledIconRes();

        @Override
        public String getShaderName(int i) {
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

    public Bitmap getStamp() {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = false;
        return BitmapFactory.decodeResource(ApplicationLoader.applicationContext.getResources(), getStampResId(), options);
    }

    public int getStampResId() {
        return R.drawable.paint_radial_brush;
    }

    public boolean isEraser() {
        return false;
    }
}
