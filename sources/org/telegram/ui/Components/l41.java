package org.telegram.ui.Components;

import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class l41 implements Utilities.Callback2 {
    public final int f26010a;
    public final t41 f26011b;

    public l41(t41 t41Var, int i10) {
        this.f26010a = i10;
        this.f26011b = t41Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String string;
        String str;
        switch (this.f26010a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                j61 j61Var = (j61) obj2;
                final t41 t41Var = this.f26011b;
                String[] strArr = t41Var.f28408i0;
                arrayList.add(v51.B(null));
                j61Var.E = 1;
                j61Var.U();
                String str2 = t41Var.f28404e0;
                if (str2 != null) {
                    string = i41.y(i41.E(str2, null, null));
                } else {
                    string = LocaleController.getString(R.string.AIEditorOriginalText);
                }
                arrayList.add(n41.b(3, "", string, null, null));
                arrayList.add(r41.a(4, t41Var.f28400a0, t41Var.f28410k0, new et(18, t41Var, j61Var), new m90() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        t41.Q(t41.this, clickableSpan);
                    }
                }, null));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i41.E(t41Var.f28405f0, null, null));
                if (t41Var.f28406g0 == 1 || strArr == null) {
                    str = "";
                } else {
                    str = a4.a.t(new StringBuilder(" ("), strArr[t41Var.f28406g0], ")");
                }
                sb2.append(str);
                arrayList.add(n41.b(5, "", i41.y(sb2.toString()), null, new k41(t41Var, 4)));
                arrayList.add(r41.a(6, t41Var.f28402c0, false, null, new m90() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        t41.Q(t41.this, clickableSpan);
                    }
                }, null));
                j61Var.T();
                arrayList.add(v51.B(null));
                j61Var.U();
                arrayList.add(v51.c(1, R.drawable.msg_copy, LocaleController.getString(R.string.TranslateCopy)));
                j61Var.T();
                return;
            default:
                t41.R(this.f26011b, (TLRPC.TL_messages_translateResult) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
