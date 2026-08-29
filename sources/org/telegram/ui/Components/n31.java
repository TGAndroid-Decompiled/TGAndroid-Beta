package org.telegram.ui.Components;

import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class n31 implements Utilities.Callback2 {
    public final int f30840a;
    public final v31 f30841b;

    public n31(v31 v31Var, int i10) {
        this.f30840a = i10;
        this.f30841b = v31Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String string;
        String str;
        switch (this.f30840a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                k51 k51Var = (k51) obj2;
                final v31 v31Var = this.f30841b;
                String[] strArr = v31Var.f33448e0;
                arrayList.add(w41.B(null));
                k51Var.A = 1;
                k51Var.U();
                String str2 = v31Var.f33444a0;
                if (str2 != null) {
                    string = k31.y(k31.D(str2, null, null));
                } else {
                    string = LocaleController.getString(R.string.AIEditorOriginalText);
                }
                arrayList.add(p31.b(3, "", string, null, null));
                arrayList.add(t31.a(4, v31Var.W, v31Var.f33450g0, new fi0(6, v31Var, k51Var), new x80() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        v31.Q(v31.this, clickableSpan);
                    }
                }, null));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(k31.D(v31Var.f33445b0, null, null));
                if (v31Var.f33446c0 == 1 || strArr == null) {
                    str = "";
                } else {
                    str = a4.w.q(new StringBuilder(" ("), strArr[v31Var.f33446c0], ")");
                }
                sb2.append(str);
                arrayList.add(p31.b(5, "", k31.y(sb2.toString()), null, new m31(v31Var, 4)));
                arrayList.add(t31.a(6, v31Var.Y, false, null, new x80() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        v31.Q(v31.this, clickableSpan);
                    }
                }, null));
                k51Var.T();
                arrayList.add(w41.B(null));
                k51Var.U();
                arrayList.add(w41.c(1, R.drawable.msg_copy, LocaleController.getString(R.string.TranslateCopy)));
                k51Var.T();
                return;
            default:
                v31.R(this.f30841b, (TLRPC.TL_messages_translateResult) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
