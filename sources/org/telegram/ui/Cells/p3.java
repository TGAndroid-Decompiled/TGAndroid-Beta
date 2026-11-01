package org.telegram.ui.Cells;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.dd;
import org.telegram.messenger.kj;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.y41;
public final class p3 {
    public boolean f22445a;
    public StaticLayout f22446b;
    public StaticLayout f22447c;
    public int d;
    public int e;
    public float f22448f;
    public float f22449g;
    public float h;
    public float f22450i;

    public final void a(q1 q1Var) {
        TLRPC.Message message;
        String str;
        int parentWidth;
        String str2;
        SpannableStringBuilder e = th.w5.e(new Object[0], 2131750875, false);
        kj messageObject = q1Var.getMessageObject();
        if (messageObject != null && (message = messageObject.f16690k) != null) {
            TLRPC.MessageMedia messageMedia = message.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaStory) {
                TLRPC.User Z1 = wp.r1(q1Var.Y5).Z1(Long.valueOf(((TLRPC.TL_messageMediaStory) messageMedia).user_id));
                if (Z1 == null) {
                    str = "DELETED";
                } else {
                    str = Z1.first_name;
                }
                if (org.telegram.messenger.i0.Q1()) {
                    parentWidth = org.telegram.messenger.i0.Q0();
                } else {
                    parentWidth = q1Var.getParentWidth();
                }
                int i10 = (int) (parentWidth * 0.4f);
                String L0 = dd.L0(2131750517, null);
                TextPaint textPaint = org.telegram.ui.ActionBar.t6.X2;
                int ceil = (int) Math.ceil(textPaint.measureText(L0 + " "));
                if (str == null) {
                    str = "";
                }
                String str3 = (String) TextUtils.ellipsize(str.replace('\n', ' '), org.telegram.ui.ActionBar.t6.Y2, i10 - ceil, TextUtils.TruncateAt.END);
                String L02 = dd.L0(2131750513, null);
                int indexOf = L02.indexOf("%1$s");
                String format = String.format(L02, str3);
                if (indexOf >= 0) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
                    spannableStringBuilder.setSpan(new y41(org.telegram.messenger.i0.o()), indexOf, str3.length() + indexOf, 33);
                    str2 = spannableStringBuilder;
                } else {
                    str2 = format;
                }
                TextPaint textPaint2 = org.telegram.ui.ActionBar.t6.Z2;
                int L = org.telegram.messenger.i0.L(10.0f);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                this.f22446b = new StaticLayout(e, textPaint2, L + ((int) (textPaint2.measureText(e, 0, e.length()) + 1.0f)), alignment, 1.0f, 0.0f, false);
                this.f22447c = new StaticLayout(str2, textPaint2, org.telegram.messenger.i0.L(10.0f) + ((int) (textPaint2.measureText((CharSequence) str2, 0, str2.length()) + 1.0f)), alignment, 1.0f, 0.0f, false);
                this.e = 0;
                this.h = org.telegram.messenger.i0.L(4.0f);
                this.f22450i = org.telegram.messenger.i0.L(12.0f);
                this.e = (int) sc.e.d(this.h, 2.0f, org.telegram.messenger.i0.L(4.0f) + this.f22447c.getHeight() + org.telegram.messenger.i0.L(2.0f) + this.f22446b.getHeight() + org.telegram.messenger.i0.L(4.0f), this.e);
                this.d = q1Var.getExtraTextX() + org.telegram.messenger.i0.L(20.0f) + org.telegram.messenger.i0.L(12.0f) + Math.max(this.f22446b.getWidth(), this.f22447c.getWidth());
                return;
            }
        }
        this.h = org.telegram.messenger.i0.L(4.0f);
        this.f22450i = org.telegram.messenger.i0.L(12.0f);
        this.e = 0;
        this.d = 0;
    }
}
