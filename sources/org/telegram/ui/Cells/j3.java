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
import org.telegram.ui.Components.t41;
public final class j3 {
    public boolean f24531a;
    public StaticLayout f24532b;
    public StaticLayout f24533c;
    public int d;
    public int f24534e;
    public float f24535f;
    public float f24536g;
    public float h;
    public float f24537i;

    public final void a(s1 s1Var) {
        TLRPC.Message message;
        String str;
        int parentWidth;
        String str2;
        SpannableStringBuilder e10 = lh.l7.e(R.string.ExpiredStory, false, new Object[0]);
        MessageObject messageObject = s1Var.getMessageObject();
        if (messageObject != null && (message = messageObject.messageOwner) != null) {
            TLRPC.MessageMedia messageMedia = message.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaStory) {
                TLRPC.User user = MessagesController.getInstance(s1Var.E7).getUser(Long.valueOf(((TLRPC.TL_messageMediaStory) messageMedia).user_id));
                if (user == null) {
                    str = "DELETED";
                } else {
                    str = user.first_name;
                }
                if (AndroidUtilities.isTablet()) {
                    parentWidth = AndroidUtilities.getMinTabletSide();
                } else {
                    parentWidth = s1Var.getParentWidth();
                }
                int i10 = (int) (parentWidth * 0.4f);
                String string = LocaleController.getString(R.string.From);
                TextPaint textPaint = org.telegram.ui.ActionBar.g6.X2;
                int ceil = (int) Math.ceil(textPaint.measureText(string + " "));
                if (str == null) {
                    str = "";
                }
                String str3 = (String) TextUtils.ellipsize(str.replace('\n', ' '), org.telegram.ui.ActionBar.g6.Y2, i10 - ceil, TextUtils.TruncateAt.END);
                String string2 = LocaleController.getString(R.string.FromFormatted);
                int indexOf = string2.indexOf("%1$s");
                String format = String.format(string2, str3);
                if (indexOf >= 0) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
                    spannableStringBuilder.setSpan(new t41(AndroidUtilities.bold()), indexOf, str3.length() + indexOf, 33);
                    str2 = spannableStringBuilder;
                } else {
                    str2 = format;
                }
                TextPaint textPaint2 = org.telegram.ui.ActionBar.g6.Z2;
                int dp = AndroidUtilities.dp(10.0f);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                this.f24532b = new StaticLayout(e10, textPaint2, dp + ((int) (textPaint2.measureText(e10, 0, e10.length()) + 1.0f)), alignment, 1.0f, 0.0f, false);
                this.f24533c = new StaticLayout(str2, textPaint2, AndroidUtilities.dp(10.0f) + ((int) (textPaint2.measureText((CharSequence) str2, 0, str2.length()) + 1.0f)), alignment, 1.0f, 0.0f, false);
                this.f24534e = 0;
                this.h = AndroidUtilities.dp(4.0f);
                this.f24537i = AndroidUtilities.dp(12.0f);
                this.f24534e = (int) com.google.android.recaptcha.internal.a.d(this.h, 2.0f, AndroidUtilities.dp(4.0f) + this.f24533c.getHeight() + AndroidUtilities.dp(2.0f) + this.f24532b.getHeight() + AndroidUtilities.dp(4.0f), this.f24534e);
                this.d = s1Var.getExtraTextX() + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(12.0f) + Math.max(this.f24532b.getWidth(), this.f24533c.getWidth());
                return;
            }
        }
        this.h = AndroidUtilities.dp(4.0f);
        this.f24537i = AndroidUtilities.dp(12.0f);
        this.f24534e = 0;
        this.d = 0;
    }
}
