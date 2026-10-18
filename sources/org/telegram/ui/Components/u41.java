package org.telegram.ui.Components;

import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class u41 implements Utilities.Callback2 {
    public final int f30892a;
    public final c51 f30893b;

    public u41(c51 c51Var, int i10) {
        this.f30892a = i10;
        this.f30893b = c51Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String string;
        String str;
        switch (this.f30892a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                s61 s61Var = (s61) obj2;
                final c51 c51Var = this.f30893b;
                String[] strArr = c51Var.f25103i0;
                arrayList.add(f61.B(null));
                s61Var.E = 1;
                s61Var.U();
                String str2 = c51Var.f25099e0;
                if (str2 != null) {
                    string = r41.A(r41.F(str2, null, null));
                } else {
                    string = LocaleController.getString(R.string.AIEditorOriginalText);
                }
                arrayList.add(w41.b(3, "", string, null, null));
                arrayList.add(a51.a(4, c51Var.f25095a0, c51Var.f25105k0, new ca(28, c51Var, s61Var), new w90() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        c51.R(c51.this, clickableSpan);
                    }
                }, null));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(r41.F(c51Var.f25100f0, null, null));
                if (c51Var.f25101g0 == 1 || strArr == null) {
                    str = "";
                } else {
                    str = a1.g.s(new StringBuilder(" ("), strArr[c51Var.f25101g0], ")");
                }
                sb2.append(str);
                arrayList.add(w41.b(5, "", r41.A(sb2.toString()), null, new t41(c51Var, 4)));
                arrayList.add(a51.a(6, c51Var.f25097c0, false, null, new w90() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        c51.R(c51.this, clickableSpan);
                    }
                }, null));
                s61Var.T();
                arrayList.add(f61.B(null));
                s61Var.U();
                arrayList.add(f61.c(1, R.drawable.msg_copy, LocaleController.getString(R.string.TranslateCopy)));
                s61Var.T();
                return;
            default:
                c51.S(this.f30893b, (TLRPC.TL_messages_translateResult) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
