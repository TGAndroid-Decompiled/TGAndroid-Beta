package org.telegram.ui.Components;

import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class v41 implements Utilities.Callback2 {
    public final int f31153a;
    public final d51 f31154b;

    public v41(d51 d51Var, int i10) {
        this.f31153a = i10;
        this.f31154b = d51Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String string;
        String str;
        switch (this.f31153a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                t61 t61Var = (t61) obj2;
                final d51 d51Var = this.f31154b;
                String[] strArr = d51Var.f25423i0;
                arrayList.add(g61.B(null));
                t61Var.E = 1;
                t61Var.U();
                String str2 = d51Var.f25419e0;
                if (str2 != null) {
                    string = s41.A(s41.E(str2, null, null));
                } else {
                    string = LocaleController.getString(R.string.AIEditorOriginalText);
                }
                arrayList.add(x41.b(3, "", string, null, null));
                arrayList.add(b51.a(4, d51Var.f25415a0, d51Var.f25425k0, new ca(28, d51Var, t61Var), new w90() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        d51.R(d51.this, clickableSpan);
                    }
                }, null));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(s41.E(d51Var.f25420f0, null, null));
                if (d51Var.f25421g0 == 1 || strArr == null) {
                    str = "";
                } else {
                    str = a1.g.s(new StringBuilder(" ("), strArr[d51Var.f25421g0], ")");
                }
                sb2.append(str);
                arrayList.add(x41.b(5, "", s41.A(sb2.toString()), null, new u41(d51Var, 4)));
                arrayList.add(b51.a(6, d51Var.f25417c0, false, null, new w90() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        d51.R(d51.this, clickableSpan);
                    }
                }, null));
                t61Var.T();
                arrayList.add(g61.B(null));
                t61Var.U();
                arrayList.add(g61.c(1, R.drawable.msg_copy, LocaleController.getString(R.string.TranslateCopy)));
                t61Var.T();
                return;
            default:
                d51.S(this.f31154b, (TLRPC.TL_messages_translateResult) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
