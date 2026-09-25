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
import org.telegram.ui.Components.s51;
public final class m3 {
    public boolean f20633a;
    public StaticLayout f20634b;
    public StaticLayout f20635c;
    public int d;
    public int e;
    public float f20636f;
    public float f20637g;
    public float h;
    public float f20638i;

    public final void a(u1 u1Var) {
        TLRPC.Message message;
        String str;
        int parentWidth;
        String str2;
        SpannableStringBuilder e = ai.ia.e(R.string.ExpiredStory, false, new Object[0]);
        MessageObject messageObject = u1Var.getMessageObject();
        if (messageObject != null && (message = messageObject.messageOwner) != null) {
            TLRPC.MessageMedia messageMedia = message.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaStory) {
                TLRPC.User user = MessagesController.getInstance(u1Var.I7).getUser(Long.valueOf(((TLRPC.TL_messageMediaStory) messageMedia).user_id));
                if (user == null) {
                    str = "DELETED";
                } else {
                    str = user.first_name;
                }
                if (AndroidUtilities.isTablet()) {
                    parentWidth = AndroidUtilities.getMinTabletSide();
                } else {
                    parentWidth = u1Var.getParentWidth();
                }
                int i10 = (int) (parentWidth * 0.4f);
                String string = LocaleController.getString(R.string.From);
                TextPaint textPaint = org.telegram.ui.ActionBar.h6.X2;
                int ceil = (int) Math.ceil(textPaint.measureText(string + " "));
                if (str == null) {
                    str = "";
                }
                String str3 = (String) TextUtils.ellipsize(str.replace('\n', ' '), org.telegram.ui.ActionBar.h6.Y2, i10 - ceil, TextUtils.TruncateAt.END);
                String string2 = LocaleController.getString(R.string.FromFormatted);
                int indexOf = string2.indexOf("%1$s");
                String format = String.format(string2, str3);
                if (indexOf >= 0) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
                    spannableStringBuilder.setSpan(new s51(AndroidUtilities.bold()), indexOf, str3.length() + indexOf, 33);
                    str2 = spannableStringBuilder;
                } else {
                    str2 = format;
                }
                TextPaint textPaint2 = org.telegram.ui.ActionBar.h6.Z2;
                int dp = AndroidUtilities.dp(10.0f);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                this.f20634b = new StaticLayout(e, textPaint2, dp + ((int) (textPaint2.measureText(e, 0, e.length()) + 1.0f)), alignment, 1.0f, 0.0f, false);
                this.f20635c = new StaticLayout(str2, textPaint2, AndroidUtilities.dp(10.0f) + ((int) (textPaint2.measureText((CharSequence) str2, 0, str2.length()) + 1.0f)), alignment, 1.0f, 0.0f, false);
                this.e = 0;
                this.h = AndroidUtilities.dp(4.0f);
                this.f20638i = AndroidUtilities.dp(12.0f);
                this.e = (int) c1.b(this.h, 2.0f, AndroidUtilities.dp(4.0f) + this.f20635c.getHeight() + AndroidUtilities.dp(2.0f) + this.f20634b.getHeight() + AndroidUtilities.dp(4.0f), this.e);
                this.d = u1Var.getExtraTextX() + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(12.0f) + Math.max(this.f20634b.getWidth(), this.f20635c.getWidth());
                return;
            }
        }
        this.h = AndroidUtilities.dp(4.0f);
        this.f20638i = AndroidUtilities.dp(12.0f);
        this.e = 0;
        this.d = 0;
    }
}
