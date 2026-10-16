package org.telegram.ui.Components;

import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class a51 implements Utilities.Callback2 {
    public final int f23130a;
    public final i51 f23131b;

    public a51(i51 i51Var, int i10) {
        this.f23130a = i10;
        this.f23131b = i51Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String string;
        String str;
        switch (this.f23130a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                a71 a71Var = (a71) obj2;
                final i51 i51Var = this.f23131b;
                String[] strArr = i51Var.f25516i0;
                arrayList.add(m61.B(null));
                a71Var.E = 1;
                a71Var.U();
                String str2 = i51Var.f25512e0;
                if (str2 != null) {
                    string = x41.B(x41.F(str2, null, null));
                } else {
                    string = LocaleController.getString(R.string.AIEditorOriginalText);
                }
                arrayList.add(c51.b(3, "", string, null, null));
                arrayList.add(g51.a(4, i51Var.f25508a0, i51Var.f25518k0, new rt(18, i51Var, a71Var), new ca0() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        i51.R(i51.this, clickableSpan);
                    }
                }, null));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(x41.F(i51Var.f25513f0, null, null));
                if (i51Var.f25514g0 == 1 || strArr == null) {
                    str = "";
                } else {
                    str = a1.g.s(new StringBuilder(" ("), strArr[i51Var.f25514g0], ")");
                }
                sb2.append(str);
                arrayList.add(c51.b(5, "", x41.B(sb2.toString()), null, new z41(i51Var, 4)));
                arrayList.add(g51.a(6, i51Var.f25510c0, false, null, new ca0() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        i51.R(i51.this, clickableSpan);
                    }
                }, null));
                a71Var.T();
                arrayList.add(m61.B(null));
                a71Var.U();
                arrayList.add(m61.c(1, R.drawable.msg_copy, LocaleController.getString(R.string.TranslateCopy)));
                a71Var.T();
                return;
            default:
                i51.S(this.f23131b, (TLRPC.TL_messages_translateResult) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
