package org.telegram.ui.Components;

import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class b51 implements Utilities.Callback2 {
    public final int f24956a;
    public final k51 f24957b;

    public b51(k51 k51Var, int i10) {
        this.f24956a = i10;
        this.f24957b = k51Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String string;
        String str;
        switch (this.f24956a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                b71 b71Var = (b71) obj2;
                final k51 k51Var = this.f24957b;
                String[] strArr = k51Var.f27881i0;
                arrayList.add(m61.B(null));
                b71Var.F = 1;
                b71Var.U();
                String str2 = k51Var.f27877e0;
                if (str2 != null) {
                    string = y41.J(y41.N(str2, null, null));
                } else {
                    string = LocaleController.getString(R.string.AIEditorOriginalText);
                }
                arrayList.add(e51.b(3, "", string, null, null));
                arrayList.add(i51.a(4, k51Var.f27873a0, k51Var.f27883k0, new ca(29, k51Var, b71Var), new x90() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        k51.Q(k51.this, clickableSpan);
                    }
                }, null));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(y41.N(k51Var.f27878f0, null, null));
                if (k51Var.f27879g0 == 1 || strArr == null) {
                    str = "";
                } else {
                    str = a1.g.s(new StringBuilder(" ("), strArr[k51Var.f27879g0], ")");
                }
                sb2.append(str);
                arrayList.add(e51.b(5, "", y41.J(sb2.toString()), null, new a51(k51Var, 4)));
                arrayList.add(i51.a(6, k51Var.f27875c0, false, null, new x90() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        k51.Q(k51.this, clickableSpan);
                    }
                }, null));
                b71Var.T();
                arrayList.add(m61.B(null));
                b71Var.U();
                arrayList.add(m61.c(1, R.drawable.msg_copy, LocaleController.getString(R.string.TranslateCopy)));
                b71Var.T();
                return;
            default:
                k51.R(this.f24957b, (TLRPC.TL_messages_translateResult) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
