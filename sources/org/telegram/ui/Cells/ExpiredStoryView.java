package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC$Message;
import org.telegram.tgnet.TLRPC$MessageMedia;
import org.telegram.tgnet.TLRPC$TL_messageMediaStory;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Stories.StoriesUtilities;

public class ExpiredStoryView {
    int height;
    float horizontalPadding;
    StaticLayout subtitleLayout;
    float textX;
    float textY;
    StaticLayout titleLayout;
    float verticalPadding;
    public boolean visible;
    int width;

    public void measure(ChatMessageCell chatMessageCell) {
        TLRPC$Message tLRPC$Message;
        int parentWidth;
        String str;
        CharSequence createExpiredStoryString = StoriesUtilities.createExpiredStoryString();
        MessageObject messageObject = chatMessageCell.getMessageObject();
        if (messageObject != null && (tLRPC$Message = messageObject.messageOwner) != null) {
            TLRPC$MessageMedia tLRPC$MessageMedia = tLRPC$Message.media;
            if (tLRPC$MessageMedia instanceof TLRPC$TL_messageMediaStory) {
                TLRPC$User user = MessagesController.getInstance(chatMessageCell.currentAccount).getUser(Long.valueOf(((TLRPC$TL_messageMediaStory) tLRPC$MessageMedia).user_id));
                String str2 = user == null ? "DELETED" : user.first_name;
                if (AndroidUtilities.isTablet()) {
                    parentWidth = AndroidUtilities.getMinTabletSide();
                } else {
                    parentWidth = chatMessageCell.getParentWidth();
                }
                int i = (int) (parentWidth * 0.4f);
                String string = LocaleController.getString("From", R.string.From);
                TextPaint textPaint = Theme.chat_forwardNamePaint;
                int ceil = (int) Math.ceil(textPaint.measureText(string + " "));
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = (String) TextUtils.ellipsize(str2.replace('\n', ' '), Theme.chat_replyNamePaint, i - ceil, TextUtils.TruncateAt.END);
                String string2 = LocaleController.getString("FromFormatted", R.string.FromFormatted);
                int indexOf = string2.indexOf("%1$s");
                String format = String.format(string2, str3);
                if (indexOf >= 0) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
                    spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.bold()), indexOf, str3.length() + indexOf, 33);
                    str = spannableStringBuilder;
                } else {
                    str = format;
                }
                TextPaint textPaint2 = Theme.chat_replyTextPaint;
                int measureText = ((int) (textPaint2.measureText(createExpiredStoryString, 0, createExpiredStoryString.length()) + 1.0f)) + AndroidUtilities.dp(10.0f);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                this.titleLayout = new StaticLayout(createExpiredStoryString, textPaint2, measureText, alignment, 1.0f, 0.0f, false);
                this.subtitleLayout = new StaticLayout(str, textPaint2, ((int) (textPaint2.measureText((CharSequence) str, 0, str.length()) + 1.0f)) + AndroidUtilities.dp(10.0f), alignment, 1.0f, 0.0f, false);
                this.height = 0;
                this.verticalPadding = AndroidUtilities.dp(4.0f);
                this.horizontalPadding = AndroidUtilities.dp(12.0f);
                this.height = (int) (this.height + AndroidUtilities.dp(4.0f) + this.titleLayout.getHeight() + AndroidUtilities.dp(2.0f) + this.subtitleLayout.getHeight() + AndroidUtilities.dp(4.0f) + (this.verticalPadding * 2.0f));
                this.width = Math.max(this.titleLayout.getWidth(), this.subtitleLayout.getWidth()) + AndroidUtilities.dp(12.0f) + AndroidUtilities.dp(20.0f) + chatMessageCell.getExtraTextX();
                return;
            }
        }
        this.verticalPadding = AndroidUtilities.dp(4.0f);
        this.horizontalPadding = AndroidUtilities.dp(12.0f);
        this.height = 0;
        this.width = 0;
    }

    public void draw(Canvas canvas, ChatMessageCell chatMessageCell) {
        float dp = AndroidUtilities.dp(8.0f) + this.verticalPadding;
        this.textY = dp;
        if (chatMessageCell.pinnedTop) {
            this.textY = dp - AndroidUtilities.dp(2.0f);
        }
        RectF rectF = AndroidUtilities.rectTmp;
        if (chatMessageCell.getMessageObject().isOutOwner()) {
            this.textX = (((((-(chatMessageCell.timeWidth + AndroidUtilities.dp(12.0f))) + chatMessageCell.getExtraTextX()) + chatMessageCell.getMeasuredWidth()) - this.width) + AndroidUtilities.dp(24.0f)) - this.horizontalPadding;
            rectF.set((chatMessageCell.getMeasuredWidth() - this.width) - this.horizontalPadding, this.verticalPadding, chatMessageCell.getMeasuredWidth() - this.horizontalPadding, chatMessageCell.getMeasuredHeight() - this.verticalPadding);
        } else {
            float dp2 = chatMessageCell.isAvatarVisible ? AndroidUtilities.dp(48.0f) : 0.0f;
            this.textX = this.horizontalPadding + dp2 + AndroidUtilities.dp(12.0f);
            float f = dp2 + this.horizontalPadding;
            rectF.set(f, this.verticalPadding, this.width + f, chatMessageCell.getMeasuredHeight() - this.verticalPadding);
        }
        if (chatMessageCell.getMessageObject().isOutOwner()) {
            Theme.chat_replyTextPaint.setColor(chatMessageCell.getThemedColor(Theme.key_chat_outReplyNameText));
        } else {
            Theme.chat_replyTextPaint.setColor(chatMessageCell.getThemedColor(Theme.key_chat_inReplyNameText));
        }
        canvas.save();
        canvas.translate(this.textX, this.textY);
        StaticLayout staticLayout = this.titleLayout;
        if (staticLayout != null) {
            staticLayout.draw(canvas);
            canvas.translate(0.0f, this.titleLayout.getHeight() + AndroidUtilities.dp(2.0f));
        }
        StaticLayout staticLayout2 = this.subtitleLayout;
        if (staticLayout2 != null) {
            staticLayout2.draw(canvas);
        }
        canvas.restore();
    }
}
