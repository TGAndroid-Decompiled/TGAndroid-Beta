package org.telegram.ui.Components;

import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class o41 implements Utilities.Callback2 {
    public final int f26984a;
    public final w41 f26985b;

    public o41(w41 w41Var, int i10) {
        this.f26984a = i10;
        this.f26985b = w41Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String string;
        String str;
        switch (this.f26984a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                m61 m61Var = (m61) obj2;
                final w41 w41Var = this.f26985b;
                String[] strArr = w41Var.f29925i0;
                arrayList.add(y51.B(null));
                m61Var.E = 1;
                m61Var.U();
                String str2 = w41Var.f29921e0;
                if (str2 != null) {
                    string = l41.y(l41.D(str2, null, null));
                } else {
                    string = LocaleController.getString(R.string.AIEditorOriginalText);
                }
                arrayList.add(q41.b(3, "", string, null, null));
                arrayList.add(u41.a(4, w41Var.f29917a0, w41Var.f29927k0, new dt(18, w41Var, m61Var), new m90() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        w41.Q(w41.this, clickableSpan);
                    }
                }, null));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(l41.D(w41Var.f29922f0, null, null));
                if (w41Var.f29923g0 == 1 || strArr == null) {
                    str = "";
                } else {
                    str = a4.a.s(new StringBuilder(" ("), strArr[w41Var.f29923g0], ")");
                }
                sb2.append(str);
                arrayList.add(q41.b(5, "", l41.y(sb2.toString()), null, new n41(w41Var, 4)));
                arrayList.add(u41.a(6, w41Var.f29919c0, false, null, new m90() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        w41.Q(w41.this, clickableSpan);
                    }
                }, null));
                m61Var.T();
                arrayList.add(y51.B(null));
                m61Var.U();
                arrayList.add(y51.c(1, R.drawable.msg_copy, LocaleController.getString(R.string.TranslateCopy)));
                m61Var.T();
                return;
            default:
                w41.R(this.f26985b, (TLRPC.TL_messages_translateResult) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
