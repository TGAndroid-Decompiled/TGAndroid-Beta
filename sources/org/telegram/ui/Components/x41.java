package org.telegram.ui.Components;

import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class x41 implements Utilities.Callback2 {
    public final int f32814a;
    public final f51 f32815b;

    public x41(f51 f51Var, int i10) {
        this.f32814a = i10;
        this.f32815b = f51Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String string;
        String str;
        switch (this.f32814a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                w61 w61Var = (w61) obj2;
                final f51 f51Var = this.f32815b;
                String[] strArr = f51Var.f26342i0;
                arrayList.add(h61.C(null));
                w61Var.E = 1;
                w61Var.U();
                String str2 = f51Var.f26338e0;
                if (str2 != null) {
                    string = u41.y(u41.C(str2, null, null));
                } else {
                    string = LocaleController.getString(R.string.AIEditorOriginalText);
                }
                arrayList.add(z41.b(3, "", string, null, null));
                arrayList.add(d51.a(4, f51Var.f26334a0, f51Var.f26344k0, new gt(18, f51Var, w61Var), new p90() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        f51.O(f51.this, clickableSpan);
                    }
                }, null));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(u41.C(f51Var.f26339f0, null, null));
                if (f51Var.f26340g0 == 1 || strArr == null) {
                    str = "";
                } else {
                    str = a4.a.t(new StringBuilder(" ("), strArr[f51Var.f26340g0], ")");
                }
                sb2.append(str);
                arrayList.add(z41.b(5, "", u41.y(sb2.toString()), null, new w41(f51Var, 4)));
                arrayList.add(d51.a(6, f51Var.f26336c0, false, null, new p90() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        f51.O(f51.this, clickableSpan);
                    }
                }, null));
                w61Var.T();
                arrayList.add(h61.C(null));
                w61Var.U();
                arrayList.add(h61.c(1, R.drawable.msg_copy, LocaleController.getString(R.string.TranslateCopy)));
                w61Var.T();
                return;
            default:
                f51.P(this.f32815b, (TLRPC.TL_messages_translateResult) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
