package org.telegram.p009ui.Components.Paint;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.C1010R;

public interface Brush {
    float getAlpha();

    float getAngle();

    float getScale();

    float getSpacing();

    Bitmap getStamp();

    boolean isLightSaber();

    public static class Radial implements Brush {
        @Override
        public float getAlpha() {
            return 0.85f;
        }

        @Override
        public float getAngle() {
            return 0.0f;
        }

        @Override
        public float getScale() {
            return 1.0f;
        }

        @Override
        public float getSpacing() {
            return 0.15f;
        }

        @Override
        public boolean isLightSaber() {
            return false;
        }

        @Override
        public Bitmap getStamp() {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inScaled = false;
            return BitmapFactory.decodeResource(ApplicationLoader.applicationContext.getResources(), C1010R.C1011drawable.paint_radial_brush, options);
        }
    }

    public static class Elliptical implements Brush {
        @Override
        public float getAlpha() {
            return 0.3f;
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
        public boolean isLightSaber() {
            return false;
        }

        @Override
        public float getAngle() {
            return (float) Math.toRadians(125.0d);
        }

        @Override
        public Bitmap getStamp() {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inScaled = false;
            return BitmapFactory.decodeResource(ApplicationLoader.applicationContext.getResources(), C1010R.C1011drawable.paint_elliptical_brush, options);
        }
    }

    public static class Neon implements Brush {
        @Override
        public float getAlpha() {
            return 0.7f;
        }

        @Override
        public float getAngle() {
            return 0.0f;
        }

        @Override
        public float getScale() {
            return 1.45f;
        }

        @Override
        public float getSpacing() {
            return 0.07f;
        }

        @Override
        public boolean isLightSaber() {
            return true;
        }

        @Override
        public Bitmap getStamp() {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inScaled = false;
            return BitmapFactory.decodeResource(ApplicationLoader.applicationContext.getResources(), C1010R.C1011drawable.paint_neon_brush, options);
        }
    }

    public static class Arrow implements Brush {
        @Override
        public float getAlpha() {
            return 0.85f;
        }

        @Override
        public float getAngle() {
            return 0.0f;
        }

        @Override
        public float getScale() {
            return 1.0f;
        }

        @Override
        public float getSpacing() {
            return 0.15f;
        }

        @Override
        public boolean isLightSaber() {
            return false;
        }

        @Override
        public Bitmap getStamp() {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inScaled = false;
            return BitmapFactory.decodeResource(ApplicationLoader.applicationContext.getResources(), C1010R.C1011drawable.paint_radial_brush, options);
        }
    }
}
