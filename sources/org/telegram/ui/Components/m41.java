package org.telegram.ui.Components;

import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class m41 implements Utilities.Callback2 {
    public final int f26312a;
    public final u41 f26313b;

    public m41(u41 u41Var, int i10) {
        this.f26312a = i10;
        this.f26313b = u41Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String string;
        String str;
        switch (this.f26312a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                k61 k61Var = (k61) obj2;
                final u41 u41Var = this.f26313b;
                String[] strArr = u41Var.f28703i0;
                arrayList.add(w51.B(null));
                k61Var.E = 1;
                k61Var.U();
                String str2 = u41Var.f28699e0;
                if (str2 != null) {
                    string = j41.y(j41.E(str2, null, null));
                } else {
                    string = LocaleController.getString(R.string.AIEditorOriginalText);
                }
                arrayList.add(o41.b(3, "", string, null, null));
                arrayList.add(s41.a(4, u41Var.f28695a0, u41Var.f28705k0, new ft(18, u41Var, k61Var), new n90() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        u41.Q(u41.this, clickableSpan);
                    }
                }, null));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(j41.E(u41Var.f28700f0, null, null));
                if (u41Var.f28701g0 == 1 || strArr == null) {
                    str = "";
                } else {
                    str = a4.a.t(new StringBuilder(" ("), strArr[u41Var.f28701g0], ")");
                }
                sb2.append(str);
                arrayList.add(o41.b(5, "", j41.y(sb2.toString()), null, new l41(u41Var, 4)));
                arrayList.add(s41.a(6, u41Var.f28697c0, false, null, new n90() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        u41.Q(u41.this, clickableSpan);
                    }
                }, null));
                k61Var.T();
                arrayList.add(w51.B(null));
                k61Var.U();
                arrayList.add(w51.c(1, R.drawable.msg_copy, LocaleController.getString(R.string.TranslateCopy)));
                k61Var.T();
                return;
            default:
                u41.R(this.f26313b, (TLRPC.TL_messages_translateResult) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
