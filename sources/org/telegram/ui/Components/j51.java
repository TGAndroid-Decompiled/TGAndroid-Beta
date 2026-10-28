package org.telegram.ui.Components;

import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class j51 implements Utilities.Callback2 {
    public final int f29518a;
    public final s51 f29519b;

    public j51(s51 s51Var, int i10) {
        this.f29518a = i10;
        this.f29519b = s51Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String string;
        String str;
        switch (this.f29518a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                k71 k71Var = (k71) obj2;
                final s51 s51Var = this.f29519b;
                String[] strArr = s51Var.f32483i0;
                arrayList.add(u61.C(null));
                k71Var.F = 1;
                k71Var.V();
                String str2 = s51Var.f32479e0;
                if (str2 != null) {
                    string = g51.J(g51.N(str2, null, null));
                } else {
                    string = LocaleController.getString(R.string.AIEditorOriginalText);
                }
                arrayList.add(m51.b(3, "", string, null, null));
                arrayList.add(q51.a(4, s51Var.f32475a0, s51Var.f32485k0, new ga(29, s51Var, k71Var), new z90() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        s51.Q(s51.this, clickableSpan);
                    }
                }, null));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(g51.N(s51Var.f32480f0, null, null));
                if (s51Var.f32481g0 == 1 || strArr == null) {
                    str = "";
                } else {
                    str = a1.g.s(new StringBuilder(" ("), strArr[s51Var.f32481g0], ")");
                }
                sb2.append(str);
                arrayList.add(m51.b(5, "", g51.J(sb2.toString()), null, new i51(s51Var, 4)));
                arrayList.add(q51.a(6, s51Var.f32477c0, false, null, new z90() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        s51.Q(s51.this, clickableSpan);
                    }
                }, null));
                k71Var.U();
                arrayList.add(u61.C(null));
                k71Var.V();
                arrayList.add(u61.c(1, R.drawable.msg_copy, LocaleController.getString(R.string.TranslateCopy)));
                k71Var.U();
                return;
            default:
                s51.R(this.f29519b, (TLRPC.TL_messages_translateResult) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
