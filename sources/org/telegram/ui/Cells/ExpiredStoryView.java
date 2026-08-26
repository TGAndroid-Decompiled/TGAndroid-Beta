package org.telegram.ui.Cells;

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
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Stories.StoriesUtilities;

public final class ExpiredStoryView {
    public int height;
    public float horizontalPadding;
    public StaticLayout subtitleLayout;
    public float textX;
    public float textY;
    public StaticLayout titleLayout;
    public float verticalPadding;
    public boolean visible;
    public int width;

    public final void measure(ChatMessageCell chatMessageCell) {
        TLRPC.Message message;
        CharSequence charSequence;
        SpannableStringBuilder spannableStringBuilderCreateExpiredStoryString = StoriesUtilities.createExpiredStoryString(R.string.ExpiredStory, false, new Object[0]);
        MessageObject messageObject = chatMessageCell.getMessageObject();
        if (messageObject != null && (message = messageObject.messageOwner) != null) {
            TLRPC.MessageMedia messageMedia = message.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaStory) {
                TLRPC.User user = MessagesController.getInstance(chatMessageCell.currentAccount).getUser(Long.valueOf(((TLRPC.TL_messageMediaStory) messageMedia).user_id));
                String str = user == null ? "DELETED" : user.first_name;
                int minTabletSide = (int) ((AndroidUtilities.isTablet() ? AndroidUtilities.getMinTabletSide() : chatMessageCell.getParentWidth()) * 0.4f);
                String string = LocaleController.getString(R.string.From);
                int iCeil = (int) Math.ceil(Theme.chat_forwardNamePaint.measureText(string + " "));
                if (str == null) {
                    str = "";
                }
                String str2 = (String) TextUtils.ellipsize(str.replace('\n', ' '), Theme.chat_replyNamePaint, minTabletSide - iCeil, TextUtils.TruncateAt.END);
                String string2 = LocaleController.getString(R.string.FromFormatted);
                int iIndexOf = string2.indexOf("%1$s");
                String str3 = String.format(string2, str2);
                if (iIndexOf >= 0) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str3);
                    spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.bold()), iIndexOf, str2.length() + iIndexOf, 33);
                    charSequence = spannableStringBuilder;
                } else {
                    charSequence = str3;
                }
                TextPaint textPaint = Theme.chat_replyTextPaint;
                int iDp = AndroidUtilities.dp(10.0f) + ((int) (textPaint.measureText(spannableStringBuilderCreateExpiredStoryString, 0, spannableStringBuilderCreateExpiredStoryString.length()) + 1.0f));
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                this.titleLayout = new StaticLayout(spannableStringBuilderCreateExpiredStoryString, textPaint, iDp, alignment, 1.0f, 0.0f, false);
                this.subtitleLayout = new StaticLayout(charSequence, textPaint, AndroidUtilities.dp(10.0f) + ((int) (textPaint.measureText(charSequence, 0, charSequence.length()) + 1.0f)), alignment, 1.0f, 0.0f, false);
                this.height = 0;
                this.verticalPadding = AndroidUtilities.dp(4.0f);
                this.horizontalPadding = AndroidUtilities.dp(12.0f);
                this.height = (int) OKLCH.m(this.verticalPadding, 2.0f, AndroidUtilities.dp(4.0f) + this.subtitleLayout.getHeight() + AndroidUtilities.dp(2.0f) + this.titleLayout.getHeight() + AndroidUtilities.dp(4.0f), this.height);
                this.width = chatMessageCell.getExtraTextX() + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(12.0f) + Math.max(this.titleLayout.getWidth(), this.subtitleLayout.getWidth());
                return;
            }
        }
        this.verticalPadding = AndroidUtilities.dp(4.0f);
        this.horizontalPadding = AndroidUtilities.dp(12.0f);
        this.height = 0;
        this.width = 0;
    }
}
