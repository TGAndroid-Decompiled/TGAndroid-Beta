package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.Property;
import android.view.animation.OvershootInterpolator;
import org.telegram.ui.ChatActivity;

public abstract class AnimationProperties {
    public static final ChatActivity.AnonymousClass5 CLIPPING_IMAGE_VIEW_PROGRESS;
    public static final ChatActivity.AnonymousClass5 CLIP_DIALOG_CELL_PROGRESS;
    public static final AnonymousClass1 COLOR_DRAWABLE_ALPHA;
    public static final ChatActivity.AnonymousClass5 IMAGE_RECEIVER_ALPHA;
    public static final AnonymousClass1 PAINT_ALPHA;
    public static final ChatActivity.AnonymousClass5 PHOTO_VIEWER_ANIMATION_VALUE;
    public static final AnonymousClass1 SHAPE_DRAWABLE_ALPHA;
    public static final OvershootInterpolator overshootInterpolator = new OvershootInterpolator(1.9f);

    public abstract class IntProperty extends Property {
        public final int $r8$classId;

        public IntProperty(String str, int i) {
            super(Integer.class, str);
            this.$r8$classId = i;
            switch (i) {
                case 1:
                    super(Float.class, str);
                    break;
                default:
                    break;
            }
        }

        @Override
        public final void set(Object obj, Object obj2) {
            switch (this.$r8$classId) {
                case 0:
                    setValue(((Integer) obj2).intValue(), obj);
                    break;
                default:
                    setValue(obj, ((Float) obj2).floatValue());
                    break;
            }
        }

        public abstract void setValue(int i, Object obj);

        public abstract void setValue(Object obj, float f);
    }

    static {
        String str = "alpha";
        final int i = 0;
        PAINT_ALPHA = new IntProperty(str) {
            @Override
            public final Object get(Object obj) {
                switch (i) {
                    case 0:
                        return Integer.valueOf(((Paint) obj).getAlpha());
                    case 1:
                        return Integer.valueOf(((Paint) obj).getColor());
                    case 2:
                        return Integer.valueOf(((Drawable) obj).getAlpha());
                    default:
                        return Integer.valueOf(((ShapeDrawable) obj).getPaint().getAlpha());
                }
            }

            @Override
            public final void setValue(int i2, Object obj) {
                switch (i) {
                    case 0:
                        ((Paint) obj).setAlpha(i2);
                        break;
                    case 1:
                        ((Paint) obj).setColor(i2);
                        break;
                    case 2:
                        ((Drawable) obj).setAlpha(i2);
                        break;
                    default:
                        ((ShapeDrawable) obj).getPaint().setAlpha(i2);
                        break;
                }
            }
        };
        final int i2 = 1;
        new IntProperty("color") {
            @Override
            public final Object get(Object obj) {
                switch (i2) {
                    case 0:
                        return Integer.valueOf(((Paint) obj).getAlpha());
                    case 1:
                        return Integer.valueOf(((Paint) obj).getColor());
                    case 2:
                        return Integer.valueOf(((Drawable) obj).getAlpha());
                    default:
                        return Integer.valueOf(((ShapeDrawable) obj).getPaint().getAlpha());
                }
            }

            @Override
            public final void setValue(int i3, Object obj) {
                switch (i2) {
                    case 0:
                        ((Paint) obj).setAlpha(i3);
                        break;
                    case 1:
                        ((Paint) obj).setColor(i3);
                        break;
                    case 2:
                        ((Drawable) obj).setAlpha(i3);
                        break;
                    default:
                        ((ShapeDrawable) obj).getPaint().setAlpha(i3);
                        break;
                }
            }
        };
        IMAGE_RECEIVER_ALPHA = new ChatActivity.AnonymousClass5("currentAlpha", 7);
        final int i3 = 2;
        COLOR_DRAWABLE_ALPHA = new IntProperty(str) {
            @Override
            public final Object get(Object obj) {
                switch (i3) {
                    case 0:
                        return Integer.valueOf(((Paint) obj).getAlpha());
                    case 1:
                        return Integer.valueOf(((Paint) obj).getColor());
                    case 2:
                        return Integer.valueOf(((Drawable) obj).getAlpha());
                    default:
                        return Integer.valueOf(((ShapeDrawable) obj).getPaint().getAlpha());
                }
            }

            @Override
            public final void setValue(int i4, Object obj) {
                switch (i3) {
                    case 0:
                        ((Paint) obj).setAlpha(i4);
                        break;
                    case 1:
                        ((Paint) obj).setColor(i4);
                        break;
                    case 2:
                        ((Drawable) obj).setAlpha(i4);
                        break;
                    default:
                        ((ShapeDrawable) obj).getPaint().setAlpha(i4);
                        break;
                }
            }
        };
        final int i4 = 3;
        SHAPE_DRAWABLE_ALPHA = new IntProperty(str) {
            @Override
            public final Object get(Object obj) {
                switch (i4) {
                    case 0:
                        return Integer.valueOf(((Paint) obj).getAlpha());
                    case 1:
                        return Integer.valueOf(((Paint) obj).getColor());
                    case 2:
                        return Integer.valueOf(((Drawable) obj).getAlpha());
                    default:
                        return Integer.valueOf(((ShapeDrawable) obj).getPaint().getAlpha());
                }
            }

            @Override
            public final void setValue(int i5, Object obj) {
                switch (i4) {
                    case 0:
                        ((Paint) obj).setAlpha(i5);
                        break;
                    case 1:
                        ((Paint) obj).setColor(i5);
                        break;
                    case 2:
                        ((Drawable) obj).setAlpha(i5);
                        break;
                    default:
                        ((ShapeDrawable) obj).getPaint().setAlpha(i5);
                        break;
                }
            }
        };
        CLIPPING_IMAGE_VIEW_PROGRESS = new ChatActivity.AnonymousClass5("animationProgress", 8);
        PHOTO_VIEWER_ANIMATION_VALUE = new ChatActivity.AnonymousClass5("animationValue", 9);
        CLIP_DIALOG_CELL_PROGRESS = new ChatActivity.AnonymousClass5("clipProgress", 10);
    }
}
