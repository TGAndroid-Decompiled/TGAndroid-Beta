package org.telegram.ui.Components;

import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class x31 implements Utilities.Callback2 {
    public final int f32445a;
    public final f41 f32446b;

    public x31(f41 f41Var, int i10) {
        this.f32445a = i10;
        this.f32446b = f41Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String string;
        String str;
        switch (this.f32445a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                v51 v51Var = (v51) obj2;
                final f41 f41Var = this.f32446b;
                String[] strArr = f41Var.f25937i0;
                arrayList.add(h51.B(null));
                v51Var.E = 1;
                v51Var.U();
                String str2 = f41Var.f25933e0;
                if (str2 != null) {
                    string = u31.y(u31.D(str2, null, null));
                } else {
                    string = LocaleController.getString(R.string.AIEditorOriginalText);
                }
                arrayList.add(z31.b(3, "", string, null, null));
                arrayList.add(d41.a(4, f41Var.f25929a0, f41Var.f25939k0, new ct(18, f41Var, v51Var), new c90() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        f41.Q(f41.this, clickableSpan);
                    }
                }, null));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(u31.D(f41Var.f25934f0, null, null));
                if (f41Var.f25935g0 == 1 || strArr == null) {
                    str = "";
                } else {
                    str = a4.a.s(new StringBuilder(" ("), strArr[f41Var.f25935g0], ")");
                }
                sb2.append(str);
                arrayList.add(z31.b(5, "", u31.y(sb2.toString()), null, new w31(f41Var, 4)));
                arrayList.add(d41.a(6, f41Var.f25931c0, false, null, new c90() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        f41.Q(f41.this, clickableSpan);
                    }
                }, null));
                v51Var.T();
                arrayList.add(h51.B(null));
                v51Var.U();
                arrayList.add(h51.c(1, R.drawable.msg_copy, LocaleController.getString(R.string.TranslateCopy)));
                v51Var.T();
                return;
            default:
                f41.R(this.f32446b, (TLRPC.TL_messages_translateResult) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
