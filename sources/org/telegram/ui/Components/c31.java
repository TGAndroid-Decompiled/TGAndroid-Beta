package org.telegram.ui.Components;

import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class c31 implements Utilities.Callback2 {
    public final int f27357a;
    public final k31 f27358b;

    public c31(k31 k31Var, int i9) {
        this.f27357a = i9;
        this.f27358b = k31Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String string;
        String str;
        switch (this.f27357a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                z41 z41Var = (z41) obj2;
                final k31 k31Var = this.f27358b;
                String[] strArr = k31Var.f29928e0;
                arrayList.add(l41.B(null));
                z41Var.A = 1;
                z41Var.U();
                String str2 = k31Var.f29924a0;
                if (str2 != null) {
                    string = z21.y(z21.D(str2, null, null));
                } else {
                    string = LocaleController.getString(R.string.AIEditorOriginalText);
                }
                arrayList.add(e31.b(3, "", string, null, null));
                arrayList.add(i31.a(4, k31Var.W, k31Var.f29930g0, new vh0(5, k31Var, z41Var), new k80() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        k31.P(k31.this, clickableSpan);
                    }
                }, null));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(z21.D(k31Var.f29925b0, null, null));
                if (k31Var.f29926c0 == 1 || strArr == null) {
                    str = "";
                } else {
                    str = aa.d.r(new StringBuilder(" ("), strArr[k31Var.f29926c0], ")");
                }
                sb2.append(str);
                arrayList.add(e31.b(5, "", z21.y(sb2.toString()), null, new b31(k31Var, 4)));
                arrayList.add(i31.a(6, k31Var.Y, false, null, new k80() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        k31.P(k31.this, clickableSpan);
                    }
                }, null));
                z41Var.T();
                arrayList.add(l41.B(null));
                z41Var.U();
                arrayList.add(l41.c(1, R.drawable.msg_copy, LocaleController.getString(R.string.TranslateCopy)));
                z41Var.T();
                return;
            default:
                k31.Q(this.f27358b, (TLRPC.TL_messages_translateResult) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
