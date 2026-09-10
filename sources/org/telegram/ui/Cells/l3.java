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
public final class l3 {
    public boolean f19475a;
    public StaticLayout f19476b;
    public StaticLayout f19477c;
    public int d;
    public int e;
    public float f19478f;
    public float f19479g;
    public float h;
    public float f19480i;

    public final void a(t1 t1Var) {
        TLRPC.Message message;
        String str;
        int parentWidth;
        String str2;
        SpannableStringBuilder e = zh.a6.e(R.string.ExpiredStory, false, new Object[0]);
        MessageObject messageObject = t1Var.getMessageObject();
        if (messageObject != null && (message = messageObject.messageOwner) != null) {
            TLRPC.MessageMedia messageMedia = message.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaStory) {
                TLRPC.User user = MessagesController.getInstance(t1Var.I7).getUser(Long.valueOf(((TLRPC.TL_messageMediaStory) messageMedia).user_id));
                if (user == null) {
                    str = "DELETED";
                } else {
                    str = user.first_name;
                }
                if (AndroidUtilities.isTablet()) {
                    parentWidth = AndroidUtilities.getMinTabletSide();
                } else {
                    parentWidth = t1Var.getParentWidth();
                }
                int i10 = (int) (parentWidth * 0.4f);
                String string = LocaleController.getString(R.string.From);
                TextPaint textPaint = org.telegram.ui.ActionBar.j6.X2;
                int ceil = (int) Math.ceil(textPaint.measureText(string + " "));
                if (str == null) {
                    str = "";
                }
                String str3 = (String) TextUtils.ellipsize(str.replace('\n', ' '), org.telegram.ui.ActionBar.j6.Y2, i10 - ceil, TextUtils.TruncateAt.END);
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
                TextPaint textPaint2 = org.telegram.ui.ActionBar.j6.Z2;
                int dp = AndroidUtilities.dp(10.0f);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                this.f19476b = new StaticLayout(e, textPaint2, dp + ((int) (textPaint2.measureText(e, 0, e.length()) + 1.0f)), alignment, 1.0f, 0.0f, false);
                this.f19477c = new StaticLayout(str2, textPaint2, AndroidUtilities.dp(10.0f) + ((int) (textPaint2.measureText((CharSequence) str2, 0, str2.length()) + 1.0f)), alignment, 1.0f, 0.0f, false);
                this.e = 0;
                this.h = AndroidUtilities.dp(4.0f);
                this.f19480i = AndroidUtilities.dp(12.0f);
                this.e = (int) r6.a(this.h, 2.0f, AndroidUtilities.dp(4.0f) + this.f19477c.getHeight() + AndroidUtilities.dp(2.0f) + this.f19476b.getHeight() + AndroidUtilities.dp(4.0f), this.e);
                this.d = t1Var.getExtraTextX() + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(12.0f) + Math.max(this.f19476b.getWidth(), this.f19477c.getWidth());
                return;
            }
        }
        this.h = AndroidUtilities.dp(4.0f);
        this.f19480i = AndroidUtilities.dp(12.0f);
        this.e = 0;
        this.d = 0;
    }
}
