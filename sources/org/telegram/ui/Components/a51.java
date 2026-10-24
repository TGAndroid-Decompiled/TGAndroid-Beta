package org.telegram.ui.Components;

import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class a51 implements Utilities.Callback2 {
    public final int f24631a;
    public final j51 f24632b;

    public a51(j51 j51Var, int i10) {
        this.f24631a = i10;
        this.f24632b = j51Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String string;
        String str;
        switch (this.f24631a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                a71 a71Var = (a71) obj2;
                final j51 j51Var = this.f24632b;
                String[] strArr = j51Var.f27572i0;
                arrayList.add(l61.B(null));
                a71Var.F = 1;
                a71Var.U();
                String str2 = j51Var.f27568e0;
                if (str2 != null) {
                    string = x41.J(x41.N(str2, null, null));
                } else {
                    string = LocaleController.getString(R.string.AIEditorOriginalText);
                }
                arrayList.add(d51.b(3, "", string, null, null));
                arrayList.add(h51.a(4, j51Var.f27564a0, j51Var.f27574k0, new aa(29, j51Var, a71Var), new v90() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        j51.Q(j51.this, clickableSpan);
                    }
                }, null));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(x41.N(j51Var.f27569f0, null, null));
                if (j51Var.f27570g0 == 1 || strArr == null) {
                    str = "";
                } else {
                    str = a1.g.s(new StringBuilder(" ("), strArr[j51Var.f27570g0], ")");
                }
                sb2.append(str);
                arrayList.add(d51.b(5, "", x41.J(sb2.toString()), null, new z41(j51Var, 4)));
                arrayList.add(h51.a(6, j51Var.f27566c0, false, null, new v90() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        j51.Q(j51.this, clickableSpan);
                    }
                }, null));
                a71Var.T();
                arrayList.add(l61.B(null));
                a71Var.U();
                arrayList.add(l61.c(1, R.drawable.msg_copy, LocaleController.getString(R.string.TranslateCopy)));
                a71Var.T();
                return;
            default:
                j51.R(this.f24632b, (TLRPC.TL_messages_translateResult) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
