package org.telegram.ui.Components;

import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class g51 implements Utilities.Callback2 {
    public final int f26609a;
    public final o51 f26610b;

    public g51(o51 o51Var, int i10) {
        this.f26609a = i10;
        this.f26610b = o51Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String string;
        String str;
        switch (this.f26609a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                e71 e71Var = (e71) obj2;
                final o51 o51Var = this.f26610b;
                String[] strArr = o51Var.f29269i0;
                arrayList.add(r61.B(null));
                e71Var.E = 1;
                e71Var.U();
                String str2 = o51Var.f29265e0;
                if (str2 != null) {
                    string = d51.B(d51.F(str2, null, null));
                } else {
                    string = LocaleController.getString(R.string.AIEditorOriginalText);
                }
                arrayList.add(i51.b(3, "", string, null, null));
                arrayList.add(m51.a(4, o51Var.f29261a0, o51Var.f29271k0, new vt(18, o51Var, e71Var), new ea0() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        o51.R(o51.this, clickableSpan);
                    }
                }, null));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(d51.F(o51Var.f29266f0, null, null));
                if (o51Var.f29267g0 == 1 || strArr == null) {
                    str = "";
                } else {
                    str = a1.g.t(new StringBuilder(" ("), strArr[o51Var.f29267g0], ")");
                }
                sb2.append(str);
                arrayList.add(i51.b(5, "", d51.B(sb2.toString()), null, new f51(o51Var, 4)));
                arrayList.add(m51.a(6, o51Var.f29263c0, false, null, new ea0() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        o51.R(o51.this, clickableSpan);
                    }
                }, null));
                e71Var.T();
                arrayList.add(r61.B(null));
                e71Var.U();
                arrayList.add(r61.c(1, R.drawable.msg_copy, LocaleController.getString(R.string.TranslateCopy)));
                e71Var.T();
                return;
            default:
                o51.S(this.f26610b, (TLRPC.TL_messages_translateResult) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
