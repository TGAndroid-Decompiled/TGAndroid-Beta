package org.telegram.ui.Components;

import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class z31 implements Utilities.Callback2 {
    public final int f30390a;
    public final h41 f30391b;

    public z31(h41 h41Var, int i10) {
        this.f30390a = i10;
        this.f30391b = h41Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String string;
        String str;
        switch (this.f30390a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                x51 x51Var = (x51) obj2;
                final h41 h41Var = this.f30391b;
                String[] strArr = h41Var.f24482i0;
                arrayList.add(j51.B(null));
                x51Var.E = 1;
                x51Var.U();
                String str2 = h41Var.f24478e0;
                if (str2 != null) {
                    string = w31.y(w31.E(str2, null, null));
                } else {
                    string = LocaleController.getString(R.string.AIEditorOriginalText);
                }
                arrayList.add(b41.b(3, "", string, null, null));
                arrayList.add(f41.a(4, h41Var.f24474a0, h41Var.f24484k0, new dt(18, h41Var, x51Var), new b90() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        h41.Q(h41.this, clickableSpan);
                    }
                }, null));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(w31.E(h41Var.f24479f0, null, null));
                if (h41Var.f24480g0 == 1 || strArr == null) {
                    str = "";
                } else {
                    str = a4.a.s(new StringBuilder(" ("), strArr[h41Var.f24480g0], ")");
                }
                sb2.append(str);
                arrayList.add(b41.b(5, "", w31.y(sb2.toString()), null, new y31(h41Var, 4)));
                arrayList.add(f41.a(6, h41Var.f24476c0, false, null, new b90() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        h41.Q(h41.this, clickableSpan);
                    }
                }, null));
                x51Var.T();
                arrayList.add(j51.B(null));
                x51Var.U();
                arrayList.add(j51.c(1, R.drawable.msg_copy, LocaleController.getString(R.string.TranslateCopy)));
                x51Var.T();
                return;
            default:
                h41.R(this.f30391b, (TLRPC.TL_messages_translateResult) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
