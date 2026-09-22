package org.telegram.ui.Components;

import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class y31 implements Utilities.Callback2 {
    public final int f30149a;
    public final g41 f30150b;

    public y31(g41 g41Var, int i10) {
        this.f30149a = i10;
        this.f30150b = g41Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String string;
        String str;
        switch (this.f30149a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                w51 w51Var = (w51) obj2;
                final g41 g41Var = this.f30150b;
                String[] strArr = g41Var.f24188i0;
                arrayList.add(i51.B(null));
                w51Var.E = 1;
                w51Var.U();
                String str2 = g41Var.f24184e0;
                if (str2 != null) {
                    string = v31.y(v31.E(str2, null, null));
                } else {
                    string = LocaleController.getString(R.string.AIEditorOriginalText);
                }
                arrayList.add(a41.b(3, "", string, null, null));
                arrayList.add(e41.a(4, g41Var.f24180a0, g41Var.f24190k0, new dt(18, g41Var, w51Var), new b90() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        g41.Q(g41.this, clickableSpan);
                    }
                }, null));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(v31.E(g41Var.f24185f0, null, null));
                if (g41Var.f24186g0 == 1 || strArr == null) {
                    str = "";
                } else {
                    str = a4.a.t(new StringBuilder(" ("), strArr[g41Var.f24186g0], ")");
                }
                sb2.append(str);
                arrayList.add(a41.b(5, "", v31.y(sb2.toString()), null, new x31(g41Var, 4)));
                arrayList.add(e41.a(6, g41Var.f24182c0, false, null, new b90() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        g41.Q(g41.this, clickableSpan);
                    }
                }, null));
                w51Var.T();
                arrayList.add(i51.B(null));
                w51Var.U();
                arrayList.add(i51.c(1, R.drawable.msg_copy, LocaleController.getString(R.string.TranslateCopy)));
                w51Var.T();
                return;
            default:
                g41.R(this.f30150b, (TLRPC.TL_messages_translateResult) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
