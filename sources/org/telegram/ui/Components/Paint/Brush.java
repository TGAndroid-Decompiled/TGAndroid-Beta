package org.telegram.ui.Components.Paint;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public abstract class Brush {
    public static List<Brush> BRUSHES_LIST = Arrays.asList(new Radial(), new Arrow(), new Elliptical(), new Neon(), new Blurer(), new Eraser());

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

    public int getIconRes() {
        return 0;
    }

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
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return "brush";
            }
            return "compositeWithMask";
        }
        return "blitWithMask";
    }

    public float getSmoothThicknessRate() {
        return 1.0f;
    }

    public float getSpacing() {
        return 0.15f;
    }

    public boolean isEraser() {
        return false;
    }

    public int getStampResId() {
        return R.drawable.paint_radial_brush;
    }

    public Bitmap getStamp() {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = false;
        return BitmapFactory.decodeResource(ApplicationLoader.applicationContext.getResources(), getStampResId(), options);
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

    public static class Elliptical extends Brush {
        @Override
        public float getAlpha() {
            return 0.3f;
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
        public float getAngle() {
            return (float) Math.toRadians(0.0d);
        }

        @Override
        public int getStampResId() {
            return R.drawable.paint_elliptical_brush;
        }

        @Override
        public int getIconRes() {
            return R.raw.photo_marker;
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
        public float getPreviewScale() {
            return 0.2f;
        }

        @Override
        public float getScale() {
            return 1.45f;
        }

        @Override
        public String getShaderName(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return null;
                    }
                    return "brushLight";
                }
                return "compositeWithMaskLight";
            }
            return "blitWithMaskLight";
        }

        @Override
        public float getSpacing() {
            return 0.07f;
        }

        @Override
        public int getStampResId() {
            return R.drawable.paint_neon_brush;
        }

        @Override
        public int getIconRes() {
            return R.raw.photo_neon;
        }
    }

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
        public float getSmoothThicknessRate() {
            return 0.25f;
        }

        @Override
        public int getIconRes() {
            return R.raw.photo_arrow;
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
        public float getPreviewScale() {
            return 0.35f;
        }

        @Override
        public String getShaderName(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return null;
                    }
                    return "brush";
                }
                return "compositeWithMaskEraser";
            }
            return "blitWithMaskEraser";
        }

        @Override
        public boolean isEraser() {
            return true;
        }

        @Override
        public int getIconRes() {
            return R.raw.photo_eraser;
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
        public float getPreviewScale() {
            return 0.35f;
        }

        @Override
        public String getShaderName(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return null;
                    }
                    return "brush";
                }
                return "compositeWithMaskBlurer";
            }
            return "blitWithMaskBlurer";
        }

        @Override
        public int getIconRes() {
            return R.raw.photo_blur;
        }
    }

    public static abstract class Shape extends Brush {
        public static List<Shape> SHAPES_LIST = Arrays.asList(new Circle(), new Rectangle(), new Star(), new Bubble(), new Arrow());

        @Override
        public float getAlpha() {
            return 1.0f;
        }

        public int getFilledIconRes() {
            return 0;
        }

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

        public String getShapeName() {
            return null;
        }

        public int getShapeShaderType() {
            return 0;
        }

        public static Shape make(int i) {
            if (i < 0 || i > SHAPES_LIST.size()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Shape type must be in range from 0 to ");
                sb.append(SHAPES_LIST.size() - 1);
                sb.append(", but got ");
                sb.append(i);
                throw new IndexOutOfBoundsException(sb.toString());
            }
            return SHAPES_LIST.get(i);
        }

        public static class Circle extends Shape {
            @Override
            public int getShapeShaderType() {
                return 0;
            }

            @Override
            public String getShapeName() {
                return LocaleController.getString(R.string.PaintCircle);
            }

            @Override
            public int getIconRes() {
                return R.drawable.photo_circle;
            }

            @Override
            public int getFilledIconRes() {
                return R.drawable.photo_circle_fill;
            }
        }

        public static class Rectangle extends Shape {
            @Override
            public int getShapeShaderType() {
                return 1;
            }

            @Override
            public String getShapeName() {
                return LocaleController.getString(R.string.PaintRectangle);
            }

            @Override
            public int getIconRes() {
                return R.drawable.photo_rectangle;
            }

            @Override
            public int getFilledIconRes() {
                return R.drawable.photo_rectangle_fill;
            }
        }

        public static class Star extends Shape {
            @Override
            public int getShapeShaderType() {
                return 2;
            }

            @Override
            public String getShapeName() {
                return LocaleController.getString(R.string.PaintStar);
            }

            @Override
            public int getIconRes() {
                return R.drawable.photo_star;
            }

            @Override
            public int getFilledIconRes() {
                return R.drawable.photo_star_fill;
            }
        }

        public static class Bubble extends Shape {
            @Override
            public int getShapeShaderType() {
                return 3;
            }

            @Override
            public String getShapeName() {
                return LocaleController.getString(R.string.PaintBubble);
            }

            @Override
            public int getIconRes() {
                return R.drawable.msg_msgbubble;
            }

            @Override
            public int getFilledIconRes() {
                return R.drawable.msg_msgbubble2;
            }
        }

        public static class Arrow extends Shape {
            @Override
            public int getShapeShaderType() {
                return 4;
            }

            @Override
            public String getShapeName() {
                return LocaleController.getString(R.string.PaintArrow);
            }

            @Override
            public int getIconRes() {
                return R.drawable.photo_arrowshape;
            }

            @Override
            public int getFilledIconRes() {
                return R.drawable.photo_arrowshape;
            }
        }
    }
}
