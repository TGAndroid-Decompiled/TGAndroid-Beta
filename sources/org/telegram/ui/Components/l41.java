package org.telegram.ui.Components;

import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class l41 implements Utilities.Callback2 {
    public final int f24874a;
    public final t41 f24875b;

    public l41(t41 t41Var, int i10) {
        this.f24874a = i10;
        this.f24875b = t41Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String string;
        String str;
        switch (this.f24874a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                j61 j61Var = (j61) obj2;
                final t41 t41Var = this.f24875b;
                String[] strArr = t41Var.f27323i0;
                arrayList.add(v51.B(null));
                j61Var.E = 1;
                j61Var.U();
                String str2 = t41Var.f27319e0;
                if (str2 != null) {
                    string = i41.y(i41.D(str2, null, null));
                } else {
                    string = LocaleController.getString(R.string.AIEditorOriginalText);
                }
                arrayList.add(n41.b(3, "", string, null, null));
                arrayList.add(r41.a(4, t41Var.f27315a0, t41Var.f27325k0, new u10(15, t41Var, j61Var), new l90() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        t41.Q(t41.this, clickableSpan);
                    }
                }, null));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i41.D(t41Var.f27320f0, null, null));
                if (t41Var.f27321g0 == 1 || strArr == null) {
                    str = "";
                } else {
                    str = a4.a.s(new StringBuilder(" ("), strArr[t41Var.f27321g0], ")");
                }
                sb2.append(str);
                arrayList.add(n41.b(5, "", i41.y(sb2.toString()), null, new k41(t41Var, 4)));
                arrayList.add(r41.a(6, t41Var.f27317c0, false, null, new l90() {
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
                t41.R(this.f24875b, (TLRPC.TL_messages_translateResult) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
