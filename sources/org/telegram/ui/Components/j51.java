package org.telegram.ui.Components;

import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class j51 implements Utilities.Callback2 {
    public final int f27375a;
    public final r51 f27376b;

    public j51(r51 r51Var, int i10) {
        this.f27375a = i10;
        this.f27376b = r51Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String string;
        String str;
        switch (this.f27375a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                h71 h71Var = (h71) obj2;
                final r51 r51Var = this.f27376b;
                String[] strArr = r51Var.f30049i0;
                arrayList.add(u61.B(null));
                h71Var.E = 1;
                h71Var.U();
                String str2 = r51Var.f30045e0;
                if (str2 != null) {
                    string = g51.A(g51.F(str2, null, null));
                } else {
                    string = LocaleController.getString(R.string.AIEditorOriginalText);
                }
                arrayList.add(l51.b(3, "", string, null, null));
                arrayList.add(p51.a(4, r51Var.f30041a0, r51Var.f30051k0, new wt(18, r51Var, h71Var), new ha0() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        r51.R(r51.this, clickableSpan);
                    }
                }, null));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(g51.F(r51Var.f30046f0, null, null));
                if (r51Var.f30047g0 == 1 || strArr == null) {
                    str = "";
                } else {
                    str = a1.g.t(new StringBuilder(" ("), strArr[r51Var.f30047g0], ")");
                }
                sb2.append(str);
                arrayList.add(l51.b(5, "", g51.A(sb2.toString()), null, new i51(r51Var, 4)));
                arrayList.add(p51.a(6, r51Var.f30043c0, false, null, new ha0() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        r51.R(r51.this, clickableSpan);
                    }
                }, null));
                h71Var.T();
                arrayList.add(u61.B(null));
                h71Var.U();
                arrayList.add(u61.c(1, R.drawable.msg_copy, LocaleController.getString(R.string.TranslateCopy)));
                h71Var.T();
                return;
            default:
                r51.S(this.f27376b, (TLRPC.TL_messages_translateResult) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
