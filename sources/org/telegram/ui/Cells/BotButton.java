package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.animation.OvershootInterpolator;
import androidx.recyclerview.widget.DiffUtil;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.LoadingDrawable;
import org.telegram.ui.Components.Text;

public final class BotButton {
    public AnimatedEmojiDrawable animatedEmojiDrawable;
    public TL_keyboard.KeyboardInlineButton button;
    public BotInlineKeyboard.ButtonCustom buttonCustom;
    public BotInlineKeyboard.Button buttonImpl;
    public int height;
    public Drawable iconDrawable;
    public final Runnable invalidateRunnable;
    public boolean isInviteButton;
    public boolean isLocked;
    public boolean isSeparator;
    public LoadingDrawable loadingDrawable;
    public int positionFlags;
    public ValueAnimator pressAnimator;
    public float pressT;
    public boolean pressed;
    public BaseCell.RippleDrawableSafe selectorDrawable;
    public Text title;
    public float width;
    public float x;
    public int y;
    public final Path path = new Path();
    public final Paint paint = new Paint(1);
    public final RectF loadingRect = new RectF();
    public final float[] radii = new float[8];

    public abstract class AnonymousClass2 {
        public static final int[] $SwitchMap$org$telegram$messenger$BotInlineKeyboard$BackgroundColor;

        static {
            int[] iArr = new int[BotInlineKeyboard.BackgroundColor.values().length];
            $SwitchMap$org$telegram$messenger$BotInlineKeyboard$BackgroundColor = iArr;
            try {
                iArr[BotInlineKeyboard.BackgroundColor.DANGER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$telegram$messenger$BotInlineKeyboard$BackgroundColor[BotInlineKeyboard.BackgroundColor.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$telegram$messenger$BotInlineKeyboard$BackgroundColor[BotInlineKeyboard.BackgroundColor.PRIMARY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public BotButton(Runnable runnable) {
        this.invalidateRunnable = runnable;
    }

    public final float getPressScale() {
        if (this.pressed) {
            float f = this.pressT;
            if (f != 1.0f) {
                float fMin = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f;
                this.pressT = fMin;
                this.pressT = Utilities.clamp(fMin, 1.0f, 0.0f);
                this.invalidateRunnable.run();
            }
        }
        return DiffUtil.m(1.0f, this.pressT, 0.04f, 0.96f);
    }

    public final void setPressed(boolean z) {
        ValueAnimator valueAnimator;
        int i = 0;
        if (this.pressed != z) {
            this.pressed = z;
            this.invalidateRunnable.run();
            if (z && (valueAnimator = this.pressAnimator) != null) {
                valueAnimator.removeAllListeners();
                this.pressAnimator.cancel();
            }
            if (z) {
                return;
            }
            float f = this.pressT;
            if (f != 0.0f) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, 0.0f);
                this.pressAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new BotButton$$ExternalSyntheticLambda0(this, i));
                this.pressAnimator.addListener(new ArticleViewer.AnonymousClass25(this, 12));
                this.pressAnimator.setInterpolator(new OvershootInterpolator(2.0f));
                this.pressAnimator.setDuration(350L);
                this.pressAnimator.start();
            }
        }
    }
}
