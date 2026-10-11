package org.telegram.ui.Components;

import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class f51 implements Utilities.Callback2 {
    public final int f26319a;
    public final n51 f26320b;

    public f51(n51 n51Var, int i10) {
        this.f26319a = i10;
        this.f26320b = n51Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String string;
        String str;
        switch (this.f26319a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                d71 d71Var = (d71) obj2;
                final n51 n51Var = this.f26320b;
                String[] strArr = n51Var.f29043i0;
                arrayList.add(q61.B(null));
                d71Var.E = 1;
                d71Var.U();
                String str2 = n51Var.f29039e0;
                if (str2 != null) {
                    string = c51.B(c51.F(str2, null, null));
                } else {
                    string = LocaleController.getString(R.string.AIEditorOriginalText);
                }
                arrayList.add(h51.b(3, "", string, null, null));
                arrayList.add(l51.a(4, n51Var.f29035a0, n51Var.f29045k0, new vt(18, n51Var, d71Var), new da0() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        n51.R(n51.this, clickableSpan);
                    }
                }, null));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(c51.F(n51Var.f29040f0, null, null));
                if (n51Var.f29041g0 == 1 || strArr == null) {
                    str = "";
                } else {
                    str = a1.g.t(new StringBuilder(" ("), strArr[n51Var.f29041g0], ")");
                }
                sb2.append(str);
                arrayList.add(h51.b(5, "", c51.B(sb2.toString()), null, new e51(n51Var, 4)));
                arrayList.add(l51.a(6, n51Var.f29037c0, false, null, new da0() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        n51.R(n51.this, clickableSpan);
                    }
                }, null));
                d71Var.T();
                arrayList.add(q61.B(null));
                d71Var.U();
                arrayList.add(q61.c(1, R.drawable.msg_copy, LocaleController.getString(R.string.TranslateCopy)));
                d71Var.T();
                return;
            default:
                n51.S(this.f26320b, (TLRPC.TL_messages_translateResult) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
