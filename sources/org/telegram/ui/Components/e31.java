package org.telegram.ui.Components;

import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

public final class e31 implements Utilities.Callback2 {

    public final int f27943a;

    public final m31 f27944b;

    public e31(m31 m31Var, int i10) {
        this.f27943a = i10;
        this.f27944b = m31Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f27943a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                b51 b51Var = (b51) obj2;
                final m31 m31Var = this.f27944b;
                String[] strArr = m31Var.f30549e0;
                arrayList.add(n41.B(null));
                b51Var.A = 1;
                b51Var.U();
                String str = m31Var.f30545a0;
                arrayList.add(g31.b(3, "", str != null ? b31.z(b31.E(str, null, null)) : LocaleController.getString(R.string.AIEditorOriginalText), null, null));
                arrayList.add(k31.a(4, m31Var.W, m31Var.f30551g0, new xh0(6, m31Var, b51Var), new o80() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        m31.Q(m31Var, clickableSpan);
                    }
                }, null));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(b31.E(m31Var.f30546b0, null, null));
                sb2.append((m31Var.f30547c0 == 1 || strArr == null) ? "" : a9.p.p(new StringBuilder(" ("), strArr[m31Var.f30547c0], ")"));
                arrayList.add(g31.b(5, "", b31.z(sb2.toString()), null, new d31(m31Var, 4)));
                arrayList.add(k31.a(6, m31Var.Y, false, null, new o80() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        m31.Q(m31Var, clickableSpan);
                    }
                }, null));
                b51Var.T();
                arrayList.add(n41.B(null));
                b51Var.U();
                arrayList.add(n41.c(1, R.drawable.msg_copy, LocaleController.getString(R.string.TranslateCopy)));
                b51Var.T();
                break;
            default:
                m31.R(this.f27944b, (TLRPC.TL_messages_translateResult) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }
}
