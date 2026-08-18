package org.telegram.ui.iv;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import ru.noties.jlatexmath.JLatexMathAndroid;
import ru.noties.jlatexmath.JLatexMathDrawable;

public final class Latex {
    private static volatile boolean sInitialized = false;
    public final Bitmap bitmap;
    public final int depth;
    public final int height;
    public final int width;

    private Latex(Bitmap bitmap, int i, int i2, int i3) {
        this.bitmap = bitmap;
        this.width = i;
        this.height = i2;
        this.depth = i3;
    }

    private static void ensureInitialized() {
        if (sInitialized) {
            return;
        }
        synchronized (Latex.class) {
            try {
                if (!sInitialized) {
                    JLatexMathAndroid.init(ApplicationLoader.applicationContext);
                    sInitialized = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Latex render(String str, float f, boolean z) {
        if (str != null && !str.isEmpty()) {
            try {
                ensureInitialized();
                JLatexMathDrawable jLatexMathDrawableBuild = JLatexMathDrawable.builder(str).textSize(f).build();
                int intrinsicWidth = jLatexMathDrawableBuild.getIntrinsicWidth();
                int intrinsicHeight = jLatexMathDrawableBuild.getIntrinsicHeight();
                if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ALPHA_8);
                    int iconDepth = 0;
                    jLatexMathDrawableBuild.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                    jLatexMathDrawableBuild.draw(new Canvas(bitmapCreateBitmap));
                    if (z) {
                        try {
                            iconDepth = jLatexMathDrawableBuild.icon().getIconDepth();
                        } catch (Throwable th) {
                            FileLog.e(th);
                        }
                    }
                    return new Latex(bitmapCreateBitmap, intrinsicWidth, intrinsicHeight, iconDepth);
                }
                return null;
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        return null;
    }
}
