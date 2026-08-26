package org.telegram.ui.Components.chat;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.ui.ChatBackgroundDrawable;
import org.telegram.ui.Components.MotionBackgroundDrawable;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSource;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceBitmap;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceColor;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceWrapped;
import org.telegram.ui.Components.blur3.utils.BitmapMemoizedMetadata;
import org.telegram.ui.Stories.LivePlayer$$ExternalSyntheticLambda1;

public final class WallpaperBitmapProvider {
    public static final Rect tmpRect = new Rect();
    public final BlurredBackgroundSourceColor sourceColor = new BlurredBackgroundSourceColor();
    public final BlurredBackgroundSourceBitmap sourceBitmap = new BlurredBackgroundSourceBitmap();
    public final BitmapMemoizedMetadata blurredFromBitmap = new BitmapMemoizedMetadata(new LivePlayer$$ExternalSyntheticLambda1(18));
    public final BitmapMemoizedMetadata navbarColorFromBitmap = new BitmapMemoizedMetadata(new LivePlayer$$ExternalSyntheticLambda1(19));
    public final BitmapMemoizedMetadata statusBarColorFromBitmap = new BitmapMemoizedMetadata(new LivePlayer$$ExternalSyntheticLambda1(20));

    public final int getNavigationBarColor(BlurredBackgroundSource blurredBackgroundSource) {
        if (blurredBackgroundSource instanceof BlurredBackgroundSourceColor) {
            return ((BlurredBackgroundSourceColor) blurredBackgroundSource).paint.getColor();
        }
        if (blurredBackgroundSource instanceof BlurredBackgroundSourceBitmap) {
            return ((Integer) this.navbarColorFromBitmap.get(((BlurredBackgroundSourceBitmap) blurredBackgroundSource).bitmap)).intValue();
        }
        if (blurredBackgroundSource instanceof BlurredBackgroundSourceWrapped) {
            return getNavigationBarColor(((BlurredBackgroundSourceWrapped) blurredBackgroundSource).sourceInternal);
        }
        return 0;
    }

    public final int getStatusBarColor(BlurredBackgroundSource blurredBackgroundSource) {
        if (blurredBackgroundSource instanceof BlurredBackgroundSourceColor) {
            return ((BlurredBackgroundSourceColor) blurredBackgroundSource).paint.getColor();
        }
        if (blurredBackgroundSource instanceof BlurredBackgroundSourceBitmap) {
            return ((Integer) this.statusBarColorFromBitmap.get(((BlurredBackgroundSourceBitmap) blurredBackgroundSource).bitmap)).intValue();
        }
        if (blurredBackgroundSource instanceof BlurredBackgroundSourceWrapped) {
            return getStatusBarColor(((BlurredBackgroundSourceWrapped) blurredBackgroundSource).sourceInternal);
        }
        return 0;
    }

    public final BlurredBackgroundSource updateSourceFromBackgroundViewDrawable(Drawable drawable) {
        boolean z = drawable instanceof ColorDrawable;
        BlurredBackgroundSourceColor blurredBackgroundSourceColor = this.sourceColor;
        if (z) {
            blurredBackgroundSourceColor.paint.setColor(((ColorDrawable) drawable).getColor());
            return blurredBackgroundSourceColor;
        }
        boolean z2 = drawable instanceof MotionBackgroundDrawable;
        BlurredBackgroundSourceBitmap blurredBackgroundSourceBitmap = this.sourceBitmap;
        if (z2) {
            MotionBackgroundDrawable motionBackgroundDrawable = (MotionBackgroundDrawable) drawable;
            if (motionBackgroundDrawable.getIntensity() < 0) {
                blurredBackgroundSourceColor.paint.setColor(-16777216);
                return blurredBackgroundSourceColor;
            }
            blurredBackgroundSourceBitmap.setBitmap(motionBackgroundDrawable.getBitmap());
            return blurredBackgroundSourceBitmap;
        }
        boolean z3 = drawable instanceof BitmapDrawable;
        BitmapMemoizedMetadata bitmapMemoizedMetadata = this.blurredFromBitmap;
        if (z3) {
            blurredBackgroundSourceBitmap.setBitmap((Bitmap) bitmapMemoizedMetadata.get(((BitmapDrawable) drawable).getBitmap()));
            return blurredBackgroundSourceBitmap;
        }
        if (drawable instanceof ChatBackgroundDrawable) {
            return updateSourceFromBackgroundViewDrawable(((ChatBackgroundDrawable) drawable).getDrawable(false));
        }
        if (drawable != null) {
            blurredBackgroundSourceBitmap.getClass();
            float f = 120;
            float f2 = f / 1.0f;
            int iRound = Math.round(f2);
            int iRound2 = Math.round(f2);
            Bitmap bitmap = blurredBackgroundSourceBitmap.bitmapInternal;
            if (bitmap == null || bitmap.isRecycled() || blurredBackgroundSourceBitmap.bitmapInternal.getWidth() != iRound2 || blurredBackgroundSourceBitmap.bitmapInternal.getHeight() != iRound2) {
                blurredBackgroundSourceBitmap.bitmapInternal = Bitmap.createBitmap(iRound, iRound2, Bitmap.Config.ARGB_8888);
            } else {
                blurredBackgroundSourceBitmap.bitmapInternal.eraseColor(0);
            }
            Canvas canvas = new Canvas(blurredBackgroundSourceBitmap.bitmapInternal);
            canvas.scale(f / iRound, 160 / iRound2);
            Rect bounds = drawable.getBounds();
            Rect rect = tmpRect;
            rect.set(bounds);
            drawable.setBounds(0, 0, 120, 160);
            drawable.draw(canvas);
            drawable.setBounds(rect);
            blurredBackgroundSourceBitmap.setBitmap(blurredBackgroundSourceBitmap.bitmapInternal);
            blurredBackgroundSourceBitmap.bitmapInternal = null;
            blurredBackgroundSourceBitmap.setBitmap((Bitmap) bitmapMemoizedMetadata.get(blurredBackgroundSourceBitmap.bitmap));
        }
        return blurredBackgroundSourceBitmap;
    }
}
