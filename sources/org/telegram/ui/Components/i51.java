package org.telegram.ui.Components;

import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class i51 implements Utilities.Callback2 {
    public final int f29195a;
    public final r51 f29196b;

    public i51(r51 r51Var, int i10) {
        this.f29195a = i10;
        this.f29196b = r51Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String string;
        String str;
        switch (this.f29195a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                j71 j71Var = (j71) obj2;
                final r51 r51Var = this.f29196b;
                String[] strArr = r51Var.f32113i0;
                arrayList.add(t61.C(null));
                j71Var.F = 1;
                j71Var.V();
                String str2 = r51Var.f32109e0;
                if (str2 != null) {
                    string = f51.J(f51.N(str2, null, null));
                } else {
                    string = LocaleController.getString(R.string.AIEditorOriginalText);
                }
                arrayList.add(l51.b(3, "", string, null, null));
                arrayList.add(p51.a(4, r51Var.f32105a0, r51Var.f32115k0, new ga(29, r51Var, j71Var), new y90() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        r51.Q(r51.this, clickableSpan);
                    }
                }, null));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(f51.N(r51Var.f32110f0, null, null));
                if (r51Var.f32111g0 == 1 || strArr == null) {
                    str = "";
                } else {
                    str = a1.g.s(new StringBuilder(" ("), strArr[r51Var.f32111g0], ")");
                }
                sb2.append(str);
                arrayList.add(l51.b(5, "", f51.J(sb2.toString()), null, new h51(r51Var, 4)));
                arrayList.add(p51.a(6, r51Var.f32107c0, false, null, new y90() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        r51.Q(r51.this, clickableSpan);
                    }
                }, null));
                j71Var.U();
                arrayList.add(t61.C(null));
                j71Var.V();
                arrayList.add(t61.c(1, R.drawable.msg_copy, LocaleController.getString(R.string.TranslateCopy)));
                j71Var.U();
                return;
            default:
                r51.R(this.f29196b, (TLRPC.TL_messages_translateResult) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
