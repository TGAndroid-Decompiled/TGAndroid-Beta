package org.telegram.ui.Components;

import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class n41 implements Utilities.Callback2 {
    public final int f26611a;
    public final v41 f26612b;

    public n41(v41 v41Var, int i10) {
        this.f26611a = i10;
        this.f26612b = v41Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String string;
        String str;
        switch (this.f26611a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                l61 l61Var = (l61) obj2;
                final v41 v41Var = this.f26612b;
                String[] strArr = v41Var.f28923i0;
                arrayList.add(x51.B(null));
                l61Var.E = 1;
                l61Var.U();
                String str2 = v41Var.f28919e0;
                if (str2 != null) {
                    string = k41.y(k41.E(str2, null, null));
                } else {
                    string = LocaleController.getString(R.string.AIEditorOriginalText);
                }
                arrayList.add(p41.b(3, "", string, null, null));
                arrayList.add(t41.a(4, v41Var.f28915a0, v41Var.f28925k0, new dt(18, v41Var, l61Var), new k90() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        v41.Q(v41.this, clickableSpan);
                    }
                }, null));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(k41.E(v41Var.f28920f0, null, null));
                if (v41Var.f28921g0 == 1 || strArr == null) {
                    str = "";
                } else {
                    str = a4.a.s(new StringBuilder(" ("), strArr[v41Var.f28921g0], ")");
                }
                sb2.append(str);
                arrayList.add(p41.b(5, "", k41.y(sb2.toString()), null, new m41(v41Var, 4)));
                arrayList.add(t41.a(6, v41Var.f28917c0, false, null, new k90() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        v41.Q(v41.this, clickableSpan);
                    }
                }, null));
                l61Var.T();
                arrayList.add(x51.B(null));
                l61Var.U();
                arrayList.add(x51.c(1, R.drawable.msg_copy, LocaleController.getString(R.string.TranslateCopy)));
                l61Var.T();
                return;
            default:
                v41.R(this.f26612b, (TLRPC.TL_messages_translateResult) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
