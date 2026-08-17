package org.telegram.ui.Gifts;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.messenger.utils.DrawableUtils;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.blur3.utils.NinePatchBuilder;

public class GiftMessageDrawable extends Drawable {
    private boolean alwaysUseAvatarAnimator;
    private final BoolAnimator animatorAvatarVisible;
    private final AvatarDrawable avatarDrawable;
    private final int avatarLeftPadding;
    private final int avatarRadius;
    private final ImageReceiver avatarReceiver;
    private final int avatarSize;
    private NinePatchDrawable bubble;
    private NinePatchDrawable bubbleBorder;
    private AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans;
    private final float firstBaselineTop;
    private boolean hasAvatar;
    private final float lastBaselineBottom;
    private int lastMeasuredWidth;
    private int measuredHeight;
    private int measuredWidth;
    private CharSequence message;
    private final int minHeight;
    private View parentView;
    private float textDrawX;
    private float textDrawY;
    private StaticLayout textLayout;
    private final int textPaddingH;
    private final TextPaint textPaint;

    @Override
    public int getOpacity() {
        return -3;
    }

    @Override
    public void setAlpha(int i) {
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public GiftMessageDrawable() {
        TextPaint textPaint = new TextPaint(1);
        this.textPaint = textPaint;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.avatarReceiver = imageReceiver;
        this.avatarDrawable = new AvatarDrawable();
        int iDp = AndroidUtilities.dp(10.66f);
        this.avatarRadius = iDp;
        this.avatarSize = iDp * 2;
        this.avatarLeftPadding = AndroidUtilities.dp(4.0f);
        this.firstBaselineTop = AndroidUtilities.dpf2(15.33f);
        this.lastBaselineBottom = AndroidUtilities.dpf2(7.33f);
        this.textPaddingH = AndroidUtilities.dp(8.0f);
        this.minHeight = (int) AndroidUtilities.dpf2(22.66f);
        this.animatorAvatarVisible = new BoolAnimator(0, new FactorAnimator.Target() {
            @Override
            public void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
                FactorAnimator.Target.CC.$default$onFactorChangeFinished(this, i, f, factorAnimator);
            }

            @Override
            public final void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
                this.f$0.lambda$new$0(i, f, f2, factorAnimator);
            }
        }, CubicBezierInterpolator.EASE_OUT_QUINT, 320L, true);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setColor(-1);
        imageReceiver.setRoundRadius(iDp);
    }

    private void ensureNinePatches() {
        if (this.bubble == null) {
            this.bubble = createBubbleNinePatch(R.drawable.gift_message_bubble_24);
        }
        if (this.bubbleBorder == null) {
            this.bubbleBorder = createBubbleBorderNinePatch(R.drawable.gift_message_bubble_border_24);
        }
    }

    public TextPaint getTextPaint() {
        return this.textPaint;
    }

    public void setParentView(View view) {
        this.parentView = view;
        this.avatarReceiver.setParentView(view);
    }

    public void setMessage(CharSequence charSequence) {
        this.message = charSequence;
        this.lastMeasuredWidth = -1;
    }

    public void setUser(TLObject tLObject) {
        boolean z = tLObject != null;
        this.hasAvatar = z;
        if (z) {
            this.avatarDrawable.setInfo(tLObject);
            if (tLObject instanceof TLRPC.User) {
                this.avatarReceiver.setImage(ImageLocation.getForUser((TLRPC.User) tLObject, 1), "48_48", this.avatarDrawable, null, null, 0);
            } else if (tLObject instanceof TLRPC.Chat) {
                this.avatarReceiver.setImage(ImageLocation.getForChat((TLRPC.Chat) tLObject, 1), "48_48", this.avatarDrawable, null, null, 0);
            } else {
                this.avatarReceiver.setImageBitmap(this.avatarDrawable);
            }
        }
        this.lastMeasuredWidth = -1;
    }

    public void attach() {
        this.avatarReceiver.onAttachedToWindow();
    }

    public void detach() {
        this.avatarReceiver.onDetachedFromWindow();
        AnimatedEmojiSpan.release((View) null, this.emojiGroupedSpans);
        this.emojiGroupedSpans = null;
    }

    private int getTextLeftPadding() {
        return ((this.hasAvatar || this.alwaysUseAvatarAnimator) ? this.avatarLeftPadding + this.avatarSize : 0) + this.textPaddingH;
    }

    public int getLineCount() {
        StaticLayout staticLayout = this.textLayout;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    public int measure(int i) {
        int iCeil;
        ensureNinePatches();
        if (i == this.lastMeasuredWidth && this.textLayout != null) {
            return this.measuredHeight;
        }
        this.lastMeasuredWidth = i;
        int textLeftPadding = getTextLeftPadding();
        int i2 = (i - textLeftPadding) - this.textPaddingH;
        if (i2 <= 0 || TextUtils.isEmpty(this.message)) {
            this.textLayout = null;
            int i3 = this.minHeight;
            this.measuredWidth = i3;
            this.measuredHeight = i3;
            return i3;
        }
        StaticLayout staticLayout = new StaticLayout(this.message, this.textPaint, i2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        int lineCount = staticLayout.getLineCount();
        float fMax = 0.0f;
        float fMax2 = 0.0f;
        for (int i4 = 0; i4 < lineCount; i4++) {
            fMax2 = Math.max(fMax2, staticLayout.getLineWidth(i4));
        }
        if (lineCount > 1 && (iCeil = (int) Math.ceil(fMax2)) < i2) {
            StaticLayout staticLayout2 = new StaticLayout(this.message, this.textPaint, iCeil, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            if (staticLayout2.getLineCount() == lineCount) {
                for (int i5 = 0; i5 < staticLayout2.getLineCount(); i5++) {
                    fMax = Math.max(fMax, staticLayout2.getLineWidth(i5));
                }
                staticLayout = staticLayout2;
                fMax2 = fMax;
            }
        }
        this.textLayout = staticLayout;
        this.textDrawX = textLeftPadding;
        this.measuredWidth = ((int) Math.ceil(fMax2)) + textLeftPadding + this.textPaddingH;
        int lineCount2 = this.textLayout.getLineCount() - 1;
        float lineBaseline = this.textLayout.getLineBaseline(0);
        int iMax = Math.max(this.minHeight, (int) Math.ceil(this.firstBaselineTop + (this.textLayout.getLineBaseline(lineCount2) - lineBaseline) + this.lastBaselineBottom));
        this.measuredHeight = iMax;
        this.textDrawY = this.firstBaselineTop - lineBaseline;
        return iMax;
    }

    @Override
    public int getMinimumWidth() {
        return this.measuredWidth;
    }

    @Override
    public int getMinimumHeight() {
        return this.measuredHeight;
    }

    public void lambda$new$0(int i, float f, float f2, FactorAnimator factorAnimator) {
        invalidateSelf();
    }

    @Override
    public void draw(Canvas canvas) {
        float f;
        ensureNinePatches();
        Rect bounds = getBounds();
        canvas.save();
        if (this.alwaysUseAvatarAnimator) {
            float floatValue = this.animatorAvatarVisible.getFloatValue();
            canvas.translate(((-(this.avatarLeftPadding + this.avatarSize)) / 2.0f) * (1.0f - floatValue), 0.0f);
            f = floatValue;
        } else {
            f = this.hasAvatar ? 1.0f : 0.0f;
        }
        DrawableUtils.setBoundsIncreasePadding(this.bubble, bounds.left + (this.hasAvatar ? this.avatarLeftPadding + this.avatarSize : 0), bounds.top, bounds.right, bounds.bottom);
        this.bubble.draw(canvas);
        DrawableUtils.setBoundsIncreasePadding(this.bubbleBorder, bounds.left + (this.hasAvatar ? this.avatarLeftPadding + this.avatarSize : 0), bounds.top, bounds.right, bounds.bottom);
        this.bubbleBorder.draw(canvas);
        if (this.textLayout != null) {
            canvas.save();
            canvas.translate(bounds.left + this.textDrawX, bounds.top + this.textDrawY);
            this.textLayout.draw(canvas);
            View view = this.parentView;
            if (view != null && (this.message instanceof Spanned)) {
                AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpansUpdate = AnimatedEmojiSpan.update(0, view, false, this.emojiGroupedSpans, this.textLayout);
                this.emojiGroupedSpans = emojiGroupedSpansUpdate;
                AnimatedEmojiSpan.drawAnimatedEmojis(canvas, this.textLayout, emojiGroupedSpansUpdate, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, null);
            }
            canvas.restore();
        }
        if (f > 0.0f) {
            int i = bounds.left;
            int i2 = bounds.bottom;
            int i3 = this.avatarSize;
            float f2 = i2 - i3;
            float f3 = i3;
            this.avatarReceiver.setImageCoords(i, f2, f3, f3);
            canvas.save();
            canvas.scale(f, f, this.avatarReceiver.getCenterX(), this.avatarReceiver.getCenterY());
            this.avatarReceiver.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    private static NinePatchDrawable createBubbleNinePatch(int i) throws Resources.NotFoundException {
        Drawable drawable = ApplicationLoader.applicationContext.getResources().getDrawable(i);
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.draw(canvas);
        int i2 = (intrinsicHeight * 4) / 144;
        return NinePatchBuilder.createNinePatch(bitmapCreateBitmap, new Rect((intrinsicWidth * 27) / 168, i2, (intrinsicWidth * 5) / 168, i2), (intrinsicWidth * 94) / 168, (intrinsicHeight * 71) / 144);
    }

    private static NinePatchDrawable createBubbleBorderNinePatch(int i) throws Resources.NotFoundException {
        Drawable drawable = ApplicationLoader.applicationContext.getResources().getDrawable(i);
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.draw(canvas);
        Paint paint = new Paint(1);
        float f = intrinsicWidth;
        float f2 = intrinsicHeight;
        paint.setShader(new LinearGradient(f, 0.0f, 0.0f, f2, new int[]{1090519039, -805306369, 1090519039}, (float[]) null, Shader.TileMode.CLAMP));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.MULTIPLY));
        canvas.drawRect(0.0f, 0.0f, f, f2, paint);
        int i2 = (intrinsicHeight * 4) / 144;
        return NinePatchBuilder.createNinePatch(bitmapCreateBitmap, new Rect((intrinsicWidth * 27) / 168, i2, (intrinsicWidth * 5) / 168, i2), (intrinsicWidth * 94) / 168, (intrinsicHeight * 71) / 144);
    }
}
