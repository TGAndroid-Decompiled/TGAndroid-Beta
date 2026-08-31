package org.telegram.ui.Components;

import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class z31 implements Utilities.Callback2 {
    public final int f33716a;
    public final h41 f33717b;

    public z31(h41 h41Var, int i10) {
        this.f33716a = i10;
        this.f33717b = h41Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String string;
        String str;
        switch (this.f33716a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                x51 x51Var = (x51) obj2;
                final h41 h41Var = this.f33717b;
                String[] strArr = h41Var.f27381f0;
                arrayList.add(j51.B(null));
                x51Var.B = 1;
                x51Var.U();
                String str2 = h41Var.f27377b0;
                if (str2 != null) {
                    string = w31.y(w31.D(str2, null, null));
                } else {
                    string = LocaleController.getString(R.string.AIEditorOriginalText);
                }
                arrayList.add(b41.b(3, "", string, null, null));
                arrayList.add(f41.a(4, h41Var.X, h41Var.f27383h0, new sx0(3, h41Var, x51Var), new f90() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        h41.Q(h41.this, clickableSpan);
                    }
                }, null));
                StringBuilder sb = new StringBuilder();
                sb.append(w31.D(h41Var.f27378c0, null, null));
                if (h41Var.f27379d0 == 1 || strArr == null) {
                    str = "";
                } else {
                    str = android.support.v4.media.a.r(new StringBuilder(" ("), strArr[h41Var.f27379d0], ")");
                }
                sb.append(str);
                arrayList.add(b41.b(5, "", w31.y(sb.toString()), null, new y31(h41Var, 4)));
                arrayList.add(f41.a(6, h41Var.Z, false, null, new f90() {
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
                h41.R(this.f33717b, (TLRPC.TL_messages_translateResult) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
