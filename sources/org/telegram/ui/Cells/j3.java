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
import org.telegram.ui.Components.k41;

public final class j3 {

    public boolean f24518a;

    public StaticLayout f24519b;

    public StaticLayout f24520c;
    public int d;

    public int f24521e;

    public float f24522f;

    public float f24523g;
    public float h;

    public float f24524i;

    public final void a(s1 s1Var) {
        TLRPC.Message message;
        CharSequence charSequence;
        SpannableStringBuilder spannableStringBuilderE = jh.l7.e(R.string.ExpiredStory, false, new Object[0]);
        MessageObject messageObject = s1Var.getMessageObject();
        if (messageObject != null && (message = messageObject.messageOwner) != null) {
            TLRPC.MessageMedia messageMedia = message.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaStory) {
                TLRPC.User user = MessagesController.getInstance(s1Var.E7).getUser(Long.valueOf(((TLRPC.TL_messageMediaStory) messageMedia).user_id));
                String str = user == null ? "DELETED" : user.first_name;
                int minTabletSide = (int) ((AndroidUtilities.isTablet() ? AndroidUtilities.getMinTabletSide() : s1Var.getParentWidth()) * 0.4f);
                String string = LocaleController.getString(R.string.From);
                int iCeil = (int) Math.ceil(org.telegram.ui.ActionBar.g6.X2.measureText(string + " "));
                if (str == null) {
                    str = "";
                }
                String str2 = (String) TextUtils.ellipsize(str.replace('\n', ' '), org.telegram.ui.ActionBar.g6.Y2, minTabletSide - iCeil, TextUtils.TruncateAt.END);
                String string2 = LocaleController.getString(R.string.FromFormatted);
                int iIndexOf = string2.indexOf("%1$s");
                String str3 = String.format(string2, str2);
                if (iIndexOf >= 0) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str3);
                    spannableStringBuilder.setSpan(new k41(AndroidUtilities.bold()), iIndexOf, str2.length() + iIndexOf, 33);
                    charSequence = spannableStringBuilder;
                } else {
                    charSequence = str3;
                }
                TextPaint textPaint = org.telegram.ui.ActionBar.g6.Z2;
                int iDp = AndroidUtilities.dp(10.0f) + ((int) (textPaint.measureText(spannableStringBuilderE, 0, spannableStringBuilderE.length()) + 1.0f));
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                this.f24519b = new StaticLayout(spannableStringBuilderE, textPaint, iDp, alignment, 1.0f, 0.0f, false);
                this.f24520c = new StaticLayout(charSequence, textPaint, AndroidUtilities.dp(10.0f) + ((int) (textPaint.measureText(charSequence, 0, charSequence.length()) + 1.0f)), alignment, 1.0f, 0.0f, false);
                this.f24521e = 0;
                this.h = AndroidUtilities.dp(4.0f);
                this.f24524i = AndroidUtilities.dp(12.0f);
                this.f24521e = (int) com.google.android.recaptcha.internal.a.d(this.h, 2.0f, AndroidUtilities.dp(4.0f) + this.f24520c.getHeight() + AndroidUtilities.dp(2.0f) + this.f24519b.getHeight() + AndroidUtilities.dp(4.0f), this.f24521e);
                this.d = s1Var.getExtraTextX() + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(12.0f) + Math.max(this.f24519b.getWidth(), this.f24520c.getWidth());
                return;
            }
        }
        this.h = AndroidUtilities.dp(4.0f);
        this.f24524i = AndroidUtilities.dp(12.0f);
        this.f24521e = 0;
        this.d = 0;
    }
}
