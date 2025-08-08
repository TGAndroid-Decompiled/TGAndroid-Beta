package org.telegram.ui.Components.quickforward;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.quickforward.BlurVisibilityDrawable;
import org.telegram.ui.Components.quickforward.QuickShareSelectorDrawable;

public class QuickShareAvatarCell implements ValueAnimator.AnimatorUpdateListener {
    private ValueAnimator alphaAnimator;
    private float bgX1;
    private float bgY;
    private BlurVisibilityDrawable blurredAvatarDrawable;
    private BlurVisibilityDrawable blurredTextDrawable;
    private Paint blurredTextPaint;
    private final ChatMessageCell cell;
    public final long dialogId;
    private final ImageReceiver imageReceiver;
    private final QuickShareSelectorDrawable parent;
    private ValueAnimator selectedAnimator;
    private StaticLayout textLayout;
    private final AvatarDrawable avatarDrawable = new AvatarDrawable();
    private final int currentAccount = UserConfig.selectedAccount;
    private float alphaFactor = 1.0f;
    private boolean alphaValue = true;
    private float selectedFactor = 0.0f;
    private boolean selectedValue = false;

    public QuickShareAvatarCell(QuickShareSelectorDrawable quickShareSelectorDrawable, long j) {
        this.imageReceiver = new ImageReceiver(quickShareSelectorDrawable.parent);
        this.parent = quickShareSelectorDrawable;
        ChatMessageCell chatMessageCell = quickShareSelectorDrawable.cell;
        this.cell = chatMessageCell;
        this.dialogId = j;
        setDialog(chatMessageCell, j);
    }

    private float fixX(float f, float f2, float f3, float f4) {
        float f5 = f2 / 2.0f;
        float f6 = f - f5;
        float f7 = f + f5;
        float f8 = f4 - f3;
        if (f2 <= f8) {
            return f6 < f3 ? f3 + f5 : f7 > f4 ? f4 - f5 : f;
        }
        float f9 = (f3 + f4) / 2.0f;
        float f10 = f2 - f8;
        float max = Math.max(0.0f, f3 - f6);
        float max2 = Math.max(0.0f, f7 - f4);
        float f11 = max + max2;
        if (f11 < 0.1f) {
            return f9;
        }
        return f9 + ((f10 / 2.0f) * ((max - max2) / f11));
    }

    public void draw(Canvas canvas, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, boolean z) {
        if (!z) {
            drawAvatarImpl(canvas, f5, f6, f7 + (AndroidUtilities.dp(2.0f) * this.selectedFactor), f8);
        }
        float f9 = this.selectedFactor;
        if (f9 <= 0.0f || this.textLayout == null) {
            return;
        }
        float f10 = (f9 * 0.15f) + 0.85f;
        canvas.save();
        canvas.scale(f10, f10, f5, f6);
        float f11 = this.selectedFactor * f8;
        float width = this.textLayout.getWidth() + (AndroidUtilities.dp(QuickShareSelectorDrawable.Sizes.TEXT_PADDING_INTERNAL) * 2);
        this.bgX1 = fixX(fixX(f5, width, f3, f4), width, f, f2) - (width / 2.0f);
        this.bgY = f6 - AndroidUtilities.dp(58.0f);
        if (this.blurredTextDrawable == null && !this.parent.isDestroyed()) {
            this.blurredTextPaint = this.parent.getBlurBitmapPaint();
            BlurVisibilityDrawable blurVisibilityDrawable = new BlurVisibilityDrawable(new BlurVisibilityDrawable.DrawRunnable() {
                @Override
                public final void draw(Canvas canvas2, int i) {
                    QuickShareAvatarCell.this.renderText(canvas2, i);
                }
            });
            this.blurredTextDrawable = blurVisibilityDrawable;
            blurVisibilityDrawable.render((int) width, AndroidUtilities.dp(21.0f), AndroidUtilities.dp(QuickShareSelectorDrawable.Sizes.TEXT_BLUR_RADIUS), 3.0f);
        }
        BlurVisibilityDrawable blurVisibilityDrawable2 = this.blurredTextDrawable;
        if (blurVisibilityDrawable2 != null) {
            float f12 = this.bgX1;
            float f13 = this.bgY;
            blurVisibilityDrawable2.setBounds((int) f12, (int) f13, (int) (f12 + width), (int) (f13 + AndroidUtilities.dp(21.0f)));
            this.blurredTextDrawable.setAlpha((int) (f11 * 255.0f));
            this.blurredTextDrawable.draw(canvas);
        }
        canvas.restore();
    }

    public void recycle() {
        BlurVisibilityDrawable blurVisibilityDrawable = this.blurredTextDrawable;
        if (blurVisibilityDrawable != null) {
            blurVisibilityDrawable.recycle();
        }
        BlurVisibilityDrawable blurVisibilityDrawable2 = this.blurredAvatarDrawable;
        if (blurVisibilityDrawable2 != null) {
            blurVisibilityDrawable2.recycle();
        }
    }

    public void drawBlurredAvatar(Canvas canvas, float f, float f2, float f3, float f4) {
        if (this.blurredAvatarDrawable == null) {
            BlurVisibilityDrawable blurVisibilityDrawable = new BlurVisibilityDrawable(new BlurVisibilityDrawable.DrawRunnable() {
                @Override
                public final void draw(Canvas canvas2, int i) {
                    QuickShareAvatarCell.this.renderAvatar(canvas2, i);
                }
            });
            this.blurredAvatarDrawable = blurVisibilityDrawable;
            blurVisibilityDrawable.render(AndroidUtilities.dp(QuickShareSelectorDrawable.Sizes.AVATAR), AndroidUtilities.dp(QuickShareSelectorDrawable.Sizes.AVATAR), AndroidUtilities.dp(QuickShareSelectorDrawable.Sizes.BLUR_RADIUS), 4.0f);
        }
        canvas.save();
        canvas.translate(f - f3, f2 - f3);
        canvas.scale(f3 / AndroidUtilities.dp(QuickShareSelectorDrawable.Sizes.AVATAR_RADIUS), f3 / AndroidUtilities.dp(QuickShareSelectorDrawable.Sizes.AVATAR_RADIUS));
        this.blurredAvatarDrawable.setAlpha((int) (f4 * 255.0f));
        this.blurredAvatarDrawable.draw(canvas);
        canvas.restore();
    }

    public void renderAvatar(Canvas canvas, int i) {
        float dp = AndroidUtilities.dp(QuickShareSelectorDrawable.Sizes.AVATAR_RADIUS);
        drawAvatarImpl(canvas, dp, dp, dp, i / 255.0f);
    }

    private void drawAvatarImpl(Canvas canvas, float f, float f2, float f3, float f4) {
        canvas.save();
        canvas.translate(f - f3, f2 - f3);
        canvas.scale(f3 / AndroidUtilities.dp(QuickShareSelectorDrawable.Sizes.AVATAR_RADIUS), f3 / AndroidUtilities.dp(QuickShareSelectorDrawable.Sizes.AVATAR_RADIUS));
        this.imageReceiver.setAlpha(((this.alphaFactor * 0.25f) + 0.75f) * f4);
        this.imageReceiver.draw(canvas);
        canvas.restore();
    }

    public void renderText(Canvas canvas, int i) {
        canvas.save();
        canvas.translate(-this.bgX1, -this.bgY);
        drawTextImpl(canvas, this.bgX1, this.bgY, i / 255.0f);
        canvas.restore();
    }

    private void drawTextImpl(Canvas canvas, float f, float f2, float f3) {
        RectF rectF = AndroidUtilities.rectTmp;
        float dp = AndroidUtilities.dp(21.0f) / 2.0f;
        rectF.set(f, f2, this.textLayout.getWidth() + f + (AndroidUtilities.dp(QuickShareSelectorDrawable.Sizes.TEXT_PADDING_INTERNAL) * 2), AndroidUtilities.dp(21.0f) + f2);
        boolean hasGradientService = this.cell.hasGradientService();
        Paint paint = this.blurredTextPaint;
        if (paint != null) {
            int alpha = paint.getAlpha();
            paint.setAlpha((int) (255.0f * f3));
            canvas.drawRoundRect(rectF, dp, dp, paint);
            paint.setAlpha(alpha);
        } else {
            ChatMessageCell chatMessageCell = this.cell;
            Point point = AndroidUtilities.displaySize;
            chatMessageCell.applyServiceShaderMatrix(point.x, point.y, 0.0f, 0.0f);
            Paint themedPaint = this.cell.getThemedPaint("paintChatActionBackground");
            int alpha2 = themedPaint.getAlpha();
            themedPaint.setAlpha((int) ((hasGradientService ? alpha2 : 229.5f) * f3));
            canvas.drawRoundRect(rectF, dp, dp, themedPaint);
            themedPaint.setAlpha(alpha2);
        }
        if (hasGradientService || paint != null) {
            int alpha3 = Theme.chat_actionBackgroundGradientDarkenPaint.getAlpha();
            Theme.chat_actionBackgroundGradientDarkenPaint.setAlpha((int) (alpha3 * f3));
            canvas.drawRoundRect(rectF, dp, dp, Theme.chat_actionBackgroundGradientDarkenPaint);
            Theme.chat_actionBackgroundGradientDarkenPaint.setAlpha(alpha3);
        }
        canvas.save();
        canvas.translate(f + AndroidUtilities.dp(QuickShareSelectorDrawable.Sizes.TEXT_PADDING_INTERNAL), f2 + ((AndroidUtilities.dp(21.0f) - this.textLayout.getHeight()) / 2.0f));
        int alpha4 = this.textLayout.getPaint().getAlpha();
        this.textLayout.getPaint().setAlpha((int) (alpha4 * f3));
        this.textLayout.draw(canvas);
        this.textLayout.getPaint().setAlpha(alpha4);
        canvas.restore();
    }

    @Override
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (valueAnimator == this.selectedAnimator) {
            this.selectedFactor = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        } else if (valueAnimator == this.alphaAnimator) {
            this.alphaFactor = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        }
        this.parent.invalidateSelf();
    }

    public void setSelected(boolean z, boolean z2) {
        if (this.selectedValue == z) {
            return;
        }
        ValueAnimator valueAnimator = this.selectedAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.selectedValue = z;
        if (z2) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.selectedFactor, z ? 1.0f : 0.0f);
            this.selectedAnimator = ofFloat;
            ofFloat.setDuration(180L);
            this.selectedAnimator.addUpdateListener(this);
            this.selectedAnimator.setInterpolator(QuickShareSelectorDrawable.Interpolators.DECELERATE_INTERPOLATOR);
            this.selectedAnimator.start();
            return;
        }
        this.selectedFactor = z ? 1.0f : 0.0f;
        this.parent.invalidateSelf();
    }

    public void setFullVisible(boolean z, boolean z2) {
        if (this.alphaValue == z) {
            return;
        }
        ValueAnimator valueAnimator = this.alphaAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.alphaValue = z;
        if (z2) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.alphaFactor, z ? 1.0f : 0.0f);
            this.alphaAnimator = ofFloat;
            ofFloat.setDuration(180L);
            this.alphaAnimator.addUpdateListener(this);
            this.alphaAnimator.setInterpolator(QuickShareSelectorDrawable.Interpolators.DECELERATE_INTERPOLATOR);
            this.alphaAnimator.start();
            return;
        }
        this.alphaFactor = z ? 1.0f : 0.0f;
        this.parent.invalidateSelf();
    }

    private void setDialog(ChatMessageCell chatMessageCell, long j) {
        String str;
        String str2;
        this.avatarDrawable.setScaleSize(1.0f);
        if (DialogObject.isUserDialog(j)) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j));
            this.avatarDrawable.setInfo(this.currentAccount, user);
            if (UserObject.isUserSelf(user)) {
                str2 = LocaleController.getString(R.string.SavedMessages);
                this.avatarDrawable.setAvatarType(1);
                this.avatarDrawable.setScaleSize(0.75f);
                this.imageReceiver.setImage(null, null, null, null, this.avatarDrawable, 0L, null, user, 0);
                this.imageReceiver.setRoundRadius(AndroidUtilities.dp(QuickShareSelectorDrawable.Sizes.AVATAR / 2.0f));
                this.imageReceiver.setImageCoords(0.0f, 0.0f, AndroidUtilities.dp(QuickShareSelectorDrawable.Sizes.AVATAR), AndroidUtilities.dp(QuickShareSelectorDrawable.Sizes.AVATAR));
                Paint themedPaint = chatMessageCell.getThemedPaint("paintChatActionText");
                if (str2 != null || themedPaint == null) {
                }
                int dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp((QuickShareSelectorDrawable.Sizes.TEXT_PADDING_INTERNAL * 2) + (QuickShareSelectorDrawable.Sizes.TEXT_PADDING_EXTERNAL * 2));
                TextPaint textPaint = new TextPaint(themedPaint);
                this.textLayout = new StaticLayout(TextUtils.ellipsize(str2, textPaint, dp, TextUtils.TruncateAt.END), textPaint, (int) Math.ceil(textPaint.measureText(r6, 0, r6.length())), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                return;
            }
            str = user != null ? ContactsController.formatName(user.first_name, user.last_name) : "";
            this.imageReceiver.setForUserOrChat(user, this.avatarDrawable);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j));
            str = chat != null ? chat.title : "";
            this.avatarDrawable.setInfo(this.currentAccount, chat);
            this.imageReceiver.setForUserOrChat(chat, this.avatarDrawable);
        }
        str2 = str;
        this.imageReceiver.setRoundRadius(AndroidUtilities.dp(QuickShareSelectorDrawable.Sizes.AVATAR / 2.0f));
        this.imageReceiver.setImageCoords(0.0f, 0.0f, AndroidUtilities.dp(QuickShareSelectorDrawable.Sizes.AVATAR), AndroidUtilities.dp(QuickShareSelectorDrawable.Sizes.AVATAR));
        Paint themedPaint2 = chatMessageCell.getThemedPaint("paintChatActionText");
        if (str2 != null) {
        }
    }
}
