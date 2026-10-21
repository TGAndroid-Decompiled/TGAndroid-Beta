package org.telegram.ui.Components;

import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class w41 implements Utilities.Callback2 {
    public final int f31967a;
    public final e51 f31968b;

    public w41(e51 e51Var, int i10) {
        this.f31967a = i10;
        this.f31968b = e51Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String string;
        String str;
        switch (this.f31967a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                u61 u61Var = (u61) obj2;
                final e51 e51Var = this.f31968b;
                String[] strArr = e51Var.f25738i0;
                arrayList.add(h61.B(null));
                u61Var.E = 1;
                u61Var.U();
                String str2 = e51Var.f25734e0;
                if (str2 != null) {
                    string = t41.A(t41.E(str2, null, null));
                } else {
                    string = LocaleController.getString(R.string.AIEditorOriginalText);
                }
                arrayList.add(y41.b(3, "", string, null, null));
                arrayList.add(c51.a(4, e51Var.f25730a0, e51Var.f25740k0, new ca(28, e51Var, u61Var), new w90() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        e51.R(e51.this, clickableSpan);
                    }
                }, null));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(t41.E(e51Var.f25735f0, null, null));
                if (e51Var.f25736g0 == 1 || strArr == null) {
                    str = "";
                } else {
                    str = a1.g.s(new StringBuilder(" ("), strArr[e51Var.f25736g0], ")");
                }
                sb2.append(str);
                arrayList.add(y41.b(5, "", t41.A(sb2.toString()), null, new v41(e51Var, 4)));
                arrayList.add(c51.a(6, e51Var.f25732c0, false, null, new w90() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        e51.R(e51.this, clickableSpan);
                    }
                }, null));
                u61Var.T();
                arrayList.add(h61.B(null));
                u61Var.U();
                arrayList.add(h61.c(1, R.drawable.msg_copy, LocaleController.getString(R.string.TranslateCopy)));
                u61Var.T();
                return;
            default:
                e51.S(this.f31968b, (TLRPC.TL_messages_translateResult) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
