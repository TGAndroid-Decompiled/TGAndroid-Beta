package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.widget.ImageView;
import androidx.core.graphics.ColorUtils;
import androidx.palette.graphics.Palette;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public class VoIPOverlayBackground extends ImageView {
    float blackoutProgress;
    boolean showBlackout;

    public VoIPOverlayBackground(Context context) {
        super(context);
        ColorUtils.setAlphaComponent(-16777216, R.styleable.AppCompatTheme_textAppearanceLargePopupMenu);
        setScaleType(ImageView.ScaleType.CENTER_CROP);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        float f = this.blackoutProgress;
        if (f == 1.0f) {
            canvas.drawColor(ColorUtils.setAlphaComponent(-16777216, R.styleable.AppCompatTheme_textAppearanceLargePopupMenu));
        } else if (f == 0.0f) {
            setImageAlpha(255);
            super.onDraw(canvas);
        } else {
            canvas.drawColor(ColorUtils.setAlphaComponent(-16777216, (int) (f * 102.0f)));
            setImageAlpha((int) ((1.0f - this.blackoutProgress) * 255.0f));
            super.onDraw(canvas);
        }
    }

    public void setBackground(final ImageReceiver.BitmapHolder bitmapHolder) {
        new Thread(new Runnable() {
            @Override
            public final void run() {
                VoIPOverlayBackground.this.lambda$setBackground$1(bitmapHolder);
            }
        }).start();
    }

    public void lambda$setBackground$1(final ImageReceiver.BitmapHolder bitmapHolder) {
        try {
            final Bitmap createBitmap = Bitmap.createBitmap(ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawBitmap(bitmapHolder.bitmap, (Rect) null, new Rect(0, 0, ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION), new Paint(2));
            Utilities.blurBitmap(createBitmap, 3, 0, createBitmap.getWidth(), createBitmap.getHeight(), createBitmap.getRowBytes());
            Palette generate = Palette.from(bitmapHolder.bitmap).generate();
            Paint paint = new Paint();
            paint.setColor((generate.getDarkMutedColor(-11242343) & 16777215) | 1140850688);
            canvas.drawColor(637534208);
            canvas.drawRect(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), paint);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    VoIPOverlayBackground.this.lambda$setBackground$0(createBitmap, bitmapHolder);
                }
            });
        } catch (Throwable unused) {
        }
    }

    public void lambda$setBackground$0(Bitmap bitmap, ImageReceiver.BitmapHolder bitmapHolder) {
        setImageBitmap(bitmap);
        bitmapHolder.release();
    }

    public void setShowBlackout(boolean z, boolean z2) {
        if (this.showBlackout == z) {
            return;
        }
        this.showBlackout = z;
        if (!z2) {
            this.blackoutProgress = z ? 1.0f : 0.0f;
            return;
        }
        float[] fArr = new float[2];
        fArr[0] = this.blackoutProgress;
        fArr[1] = z ? 1.0f : 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                VoIPOverlayBackground.this.lambda$setShowBlackout$2(valueAnimator);
            }
        });
        ofFloat.setDuration(150L).start();
    }

    public void lambda$setShowBlackout$2(ValueAnimator valueAnimator) {
        this.blackoutProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }
}
