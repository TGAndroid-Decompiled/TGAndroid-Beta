package org.telegram.ui.Components.quickforward;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.gms.internal.mlkit_language_id_common.zzir;
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
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.AvatarDrawable;

public final class QuickShareAvatarCell implements ValueAnimator.AnimatorUpdateListener {
    public ValueAnimator alphaAnimator;
    public float alphaFactor;
    public boolean alphaValue;
    public float bgX1;
    public float bgY;
    public BlurVisibilityDrawable blurredAvatarDrawable;
    public BlurVisibilityDrawable blurredTextDrawable;
    public Paint blurredTextPaint;
    public final ChatMessageCell cell;
    public final long dialogId;
    public final ImageReceiver imageReceiver;
    public final QuickShareSelectorDrawable parent;
    public ValueAnimator selectedAnimator;
    public float selectedFactor;
    public boolean selectedValue;
    public final StaticLayout textLayout;

    public QuickShareAvatarCell(QuickShareSelectorDrawable quickShareSelectorDrawable, long j) {
        ImageReceiver imageReceiver;
        String name;
        String string;
        AvatarDrawable avatarDrawable = new AvatarDrawable();
        int i = UserConfig.selectedAccount;
        this.alphaFactor = 1.0f;
        this.alphaValue = true;
        this.selectedFactor = 0.0f;
        this.selectedValue = false;
        ImageReceiver imageReceiver2 = new ImageReceiver(quickShareSelectorDrawable.parent);
        this.imageReceiver = imageReceiver2;
        this.parent = quickShareSelectorDrawable;
        ChatMessageCell chatMessageCell = quickShareSelectorDrawable.cell;
        this.cell = chatMessageCell;
        this.dialogId = j;
        avatarDrawable.setScaleSize(1.0f);
        if (DialogObject.isUserDialog(j)) {
            TLRPC.User user = MessagesController.getInstance(i).getUser(Long.valueOf(j));
            avatarDrawable.setInfo(i, user);
            if (UserObject.isUserSelf(user)) {
                string = LocaleController.getString(R.string.SavedMessages);
                avatarDrawable.setAvatarType(1);
                avatarDrawable.setScaleSize(0.75f);
                imageReceiver = imageReceiver2;
                imageReceiver.setImage(null, null, null, null, avatarDrawable, 0L, null, user, 0);
            } else {
                imageReceiver = imageReceiver2;
                name = user != null ? ContactsController.formatName(user.first_name, user.last_name) : "";
                imageReceiver.setForUserOrChat(user, avatarDrawable);
            }
            float f = 42;
            imageReceiver.setRoundRadius(AndroidUtilities.dp(f / 2.0f));
            imageReceiver.setImageCoords(0.0f, 0.0f, AndroidUtilities.dp(f), AndroidUtilities.dp(f));
            Paint themedPaint = chatMessageCell.getThemedPaint("paintChatActionText");
            if (string != null || themedPaint == null) {
            }
            int iDp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(48);
            TextPaint textPaint = new TextPaint(themedPaint);
            CharSequence charSequenceEllipsize = TextUtils.ellipsize(string, textPaint, iDp, TextUtils.TruncateAt.END);
            this.textLayout = new StaticLayout(charSequenceEllipsize, textPaint, (int) Math.ceil(textPaint.measureText(charSequenceEllipsize, 0, charSequenceEllipsize.length())), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            return;
        }
        imageReceiver = imageReceiver2;
        TLRPC.Chat chat = MessagesController.getInstance(i).getChat(Long.valueOf(-j));
        name = chat != null ? chat.title : "";
        avatarDrawable.setInfo(i, chat);
        imageReceiver.setForUserOrChat(chat, avatarDrawable);
        string = name;
        float f2 = 42;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(f2 / 2.0f));
        imageReceiver.setImageCoords(0.0f, 0.0f, AndroidUtilities.dp(f2), AndroidUtilities.dp(f2));
        Paint themedPaint2 = chatMessageCell.getThemedPaint("paintChatActionText");
        if (string != null) {
        }
    }

    public static float fixX(float f, float f2, float f3, float f4) {
        float f5 = f2 / 2.0f;
        float f6 = f - f5;
        float f7 = f + f5;
        float f8 = f4 - f3;
        if (f2 <= f8) {
            if (f6 < f3) {
                return f3 + f5;
            }
            return f7 > f4 ? f4 - f5 : f;
        }
        float f9 = (f3 + f4) / 2.0f;
        float f10 = f2 - f8;
        float fMax = Math.max(0.0f, f3 - f6);
        float fMax2 = Math.max(0.0f, f7 - f4);
        float f11 = fMax + fMax2;
        return f11 < 0.1f ? f9 : zzir.m(f10, 2.0f, (fMax - fMax2) / f11, f9);
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (valueAnimator == this.selectedAnimator) {
            this.selectedFactor = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        } else if (valueAnimator == this.alphaAnimator) {
            this.alphaFactor = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        }
        this.parent.invalidateSelf();
    }
}
