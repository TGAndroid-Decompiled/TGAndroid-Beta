package org.telegram.ui.Cells;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.i41;
public final class o3 {
    public boolean f31166a;
    public StaticLayout f31167b;
    public StaticLayout f31168c;
    public int d;
    public int f31169e;
    public float f31170f;
    public float f31171g;
    public float h;
    public float f31172i;

    public final void a(r1 r1Var) {
        TLRPC.Message message;
        String str;
        int parentWidth;
        String str2;
        SpannableStringBuilder e10 = fi.i7.e(new Object[0], 2131750863, false);
        fj messageObject = r1Var.getMessageObject();
        if (messageObject != null && (message = messageObject.f23965k) != null) {
            TLRPC.MessageMedia messageMedia = message.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaStory) {
                TLRPC.User c22 = mp.u1(r1Var.f31330a6).c2(Long.valueOf(((TLRPC.TL_messageMediaStory) messageMedia).user_id));
                if (c22 == null) {
                    str = "DELETED";
                } else {
                    str = c22.first_name;
                }
                if (org.telegram.messenger.g0.Q1()) {
                    parentWidth = org.telegram.messenger.g0.Q0();
                } else {
                    parentWidth = r1Var.getParentWidth();
                }
                int i7 = (int) (parentWidth * 0.4f);
                String M0 = gd.M0(2131750492, null);
                TextPaint textPaint = org.telegram.ui.ActionBar.n6.X2;
                int ceil = (int) Math.ceil(textPaint.measureText(M0 + " "));
                if (str == null) {
                    str = "";
                }
                String str3 = (String) TextUtils.ellipsize(str.replace('\n', ' '), org.telegram.ui.ActionBar.n6.Y2, i7 - ceil, TextUtils.TruncateAt.END);
                String M02 = gd.M0(2131750488, null);
                int indexOf = M02.indexOf("%1$s");
                String format = String.format(M02, str3);
                if (indexOf >= 0) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
                    spannableStringBuilder.setSpan(new i41(org.telegram.messenger.g0.o()), indexOf, str3.length() + indexOf, 33);
                    str2 = spannableStringBuilder;
                } else {
                    str2 = format;
                }
                TextPaint textPaint2 = org.telegram.ui.ActionBar.n6.Z2;
                int L = org.telegram.messenger.g0.L(10.0f);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                this.f31167b = new StaticLayout(e10, textPaint2, L + ((int) (textPaint2.measureText(e10, 0, e10.length()) + 1.0f)), alignment, 1.0f, 0.0f, false);
                this.f31168c = new StaticLayout(str2, textPaint2, org.telegram.messenger.g0.L(10.0f) + ((int) (textPaint2.measureText((CharSequence) str2, 0, str2.length()) + 1.0f)), alignment, 1.0f, 0.0f, false);
                this.f31169e = 0;
                this.h = org.telegram.messenger.g0.L(4.0f);
                this.f31172i = org.telegram.messenger.g0.L(12.0f);
                this.f31169e = (int) p5.c.e(this.h, 2.0f, org.telegram.messenger.g0.L(4.0f) + this.f31168c.getHeight() + org.telegram.messenger.g0.L(2.0f) + this.f31167b.getHeight() + org.telegram.messenger.g0.L(4.0f), this.f31169e);
                this.d = r1Var.getExtraTextX() + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(12.0f) + Math.max(this.f31167b.getWidth(), this.f31168c.getWidth());
                return;
            }
        }
        this.h = org.telegram.messenger.g0.L(4.0f);
        this.f31172i = org.telegram.messenger.g0.L(12.0f);
        this.f31169e = 0;
        this.d = 0;
    }
}
