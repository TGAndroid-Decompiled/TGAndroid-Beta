package org.telegram.ui.Cells;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.v31;
public final class n3 {
    public boolean f29608a;
    public StaticLayout f29609b;
    public StaticLayout f29610c;
    public int d;
    public int f29611e;
    public float f29612f;
    public float f29613g;
    public float h;
    public float f29614i;

    public final void a(q1 q1Var) {
        TLRPC.Message message;
        String str;
        int parentWidth;
        String str2;
        SpannableStringBuilder e10 = di.s7.e(new Object[0], 2131750874, false);
        ij messageObject = q1Var.getMessageObject();
        if (messageObject != null && (message = messageObject.f23262k) != null) {
            TLRPC.MessageMedia messageMedia = message.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaStory) {
                TLRPC.User a22 = qp.s1(q1Var.Z5).a2(Long.valueOf(((TLRPC.TL_messageMediaStory) messageMedia).user_id));
                if (a22 == null) {
                    str = "DELETED";
                } else {
                    str = a22.first_name;
                }
                if (org.telegram.messenger.g0.Q1()) {
                    parentWidth = org.telegram.messenger.g0.Q0();
                } else {
                    parentWidth = q1Var.getParentWidth();
                }
                int i7 = (int) (parentWidth * 0.4f);
                String M0 = id.M0(2131750508, null);
                TextPaint textPaint = org.telegram.ui.ActionBar.l6.X2;
                int ceil = (int) Math.ceil(textPaint.measureText(M0 + " "));
                if (str == null) {
                    str = "";
                }
                String str3 = (String) TextUtils.ellipsize(str.replace('\n', ' '), org.telegram.ui.ActionBar.l6.Y2, i7 - ceil, TextUtils.TruncateAt.END);
                String M02 = id.M0(2131750504, null);
                int indexOf = M02.indexOf("%1$s");
                String format = String.format(M02, str3);
                if (indexOf >= 0) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
                    spannableStringBuilder.setSpan(new v31(org.telegram.messenger.g0.o()), indexOf, str3.length() + indexOf, 33);
                    str2 = spannableStringBuilder;
                } else {
                    str2 = format;
                }
                TextPaint textPaint2 = org.telegram.ui.ActionBar.l6.Z2;
                int L = org.telegram.messenger.g0.L(10.0f);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                this.f29609b = new StaticLayout(e10, textPaint2, L + ((int) (textPaint2.measureText(e10, 0, e10.length()) + 1.0f)), alignment, 1.0f, 0.0f, false);
                this.f29610c = new StaticLayout(str2, textPaint2, org.telegram.messenger.g0.L(10.0f) + ((int) (textPaint2.measureText((CharSequence) str2, 0, str2.length()) + 1.0f)), alignment, 1.0f, 0.0f, false);
                this.f29611e = 0;
                this.h = org.telegram.messenger.g0.L(4.0f);
                this.f29614i = org.telegram.messenger.g0.L(12.0f);
                this.f29611e = (int) rf.b.d(this.h, 2.0f, org.telegram.messenger.g0.L(4.0f) + this.f29610c.getHeight() + org.telegram.messenger.g0.L(2.0f) + this.f29609b.getHeight() + org.telegram.messenger.g0.L(4.0f), this.f29611e);
                this.d = q1Var.getExtraTextX() + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(12.0f) + Math.max(this.f29609b.getWidth(), this.f29610c.getWidth());
                return;
            }
        }
        this.h = org.telegram.messenger.g0.L(4.0f);
        this.f29614i = org.telegram.messenger.g0.L(12.0f);
        this.f29611e = 0;
        this.d = 0;
    }
}
