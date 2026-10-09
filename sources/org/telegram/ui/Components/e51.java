package org.telegram.ui.Components;

import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class e51 implements Utilities.Callback2 {
    public final int f25958a;
    public final m51 f25959b;

    public e51(m51 m51Var, int i10) {
        this.f25958a = i10;
        this.f25959b = m51Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String string;
        String str;
        switch (this.f25958a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                c71 c71Var = (c71) obj2;
                final m51 m51Var = this.f25959b;
                String[] strArr = m51Var.f28701i0;
                arrayList.add(p61.B(null));
                c71Var.E = 1;
                c71Var.U();
                String str2 = m51Var.f28697e0;
                if (str2 != null) {
                    string = b51.B(b51.F(str2, null, null));
                } else {
                    string = LocaleController.getString(R.string.AIEditorOriginalText);
                }
                arrayList.add(g51.b(3, "", string, null, null));
                arrayList.add(k51.a(4, m51Var.f28693a0, m51Var.f28703k0, new ut(18, m51Var, c71Var), new da0() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        m51.R(m51.this, clickableSpan);
                    }
                }, null));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(b51.F(m51Var.f28698f0, null, null));
                if (m51Var.f28699g0 == 1 || strArr == null) {
                    str = "";
                } else {
                    str = a1.g.t(new StringBuilder(" ("), strArr[m51Var.f28699g0], ")");
                }
                sb2.append(str);
                arrayList.add(g51.b(5, "", b51.B(sb2.toString()), null, new d51(m51Var, 4)));
                arrayList.add(k51.a(6, m51Var.f28695c0, false, null, new da0() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        m51.R(m51.this, clickableSpan);
                    }
                }, null));
                c71Var.T();
                arrayList.add(p61.B(null));
                c71Var.U();
                arrayList.add(p61.c(1, R.drawable.msg_copy, LocaleController.getString(R.string.TranslateCopy)));
                c71Var.T();
                return;
            default:
                m51.S(this.f25959b, (TLRPC.TL_messages_translateResult) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
