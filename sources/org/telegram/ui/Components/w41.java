package org.telegram.ui.Components;

import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class w41 implements Utilities.Callback2 {
    public final int f32470a;
    public final e51 f32471b;

    public w41(e51 e51Var, int i10) {
        this.f32470a = i10;
        this.f32471b = e51Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String string;
        String str;
        switch (this.f32470a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                u61 u61Var = (u61) obj2;
                final e51 e51Var = this.f32471b;
                String[] strArr = e51Var.f25933i0;
                arrayList.add(g61.B(null));
                u61Var.E = 1;
                u61Var.U();
                String str2 = e51Var.f25929e0;
                if (str2 != null) {
                    string = t41.y(t41.C(str2, null, null));
                } else {
                    string = LocaleController.getString(R.string.AIEditorOriginalText);
                }
                arrayList.add(y41.b(3, "", string, null, null));
                arrayList.add(c51.a(4, e51Var.f25925a0, e51Var.f25935k0, new gt(18, e51Var, u61Var), new p90() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        e51.O(e51.this, clickableSpan);
                    }
                }, null));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(t41.C(e51Var.f25930f0, null, null));
                if (e51Var.f25931g0 == 1 || strArr == null) {
                    str = "";
                } else {
                    str = a4.a.t(new StringBuilder(" ("), strArr[e51Var.f25931g0], ")");
                }
                sb2.append(str);
                arrayList.add(y41.b(5, "", t41.y(sb2.toString()), null, new v41(e51Var, 4)));
                arrayList.add(c51.a(6, e51Var.f25927c0, false, null, new p90() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        e51.O(e51.this, clickableSpan);
                    }
                }, null));
                u61Var.T();
                arrayList.add(g61.B(null));
                u61Var.U();
                arrayList.add(g61.c(1, R.drawable.msg_copy, LocaleController.getString(R.string.TranslateCopy)));
                u61Var.T();
                return;
            default:
                e51.P(this.f32471b, (TLRPC.TL_messages_translateResult) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
