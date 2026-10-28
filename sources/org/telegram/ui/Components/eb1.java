package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class eb1 implements tb1 {
    public final View f27812a;
    public final String f27813b;
    public final nb1 f27814c;
    public final org.telegram.ui.ActionBar.u6 d;
    public final Paint e = new Paint(1);
    public final Path f27815f = new Path();
    public ub1 h;
    public int f27816n;
    public boolean f27817r;

    public eb1(org.telegram.ui.Cells.d2 d2Var, int i10, TLRPC.BotInlineResult botInlineResult, org.telegram.ui.ActionBar.u6 u6Var) {
        this.f27812a = d2Var;
        this.d = u6Var;
        ConcurrentHashMap concurrentHashMap = jb1.f29624a;
        TLRPC.TL_botInlineMessageWidget tL_botInlineMessageWidget = (TLRPC.TL_botInlineMessageWidget) botInlineResult.send_message;
        StringBuilder k10 = ic.a.k(i10, "tg-widget:preview/", "/");
        k10.append(botInlineResult.query_id);
        k10.append("/");
        k10.append(botInlineResult.f22026id);
        k10.append("/");
        k10.append(Arrays.hashCode(tL_botInlineMessageWidget.payload));
        String sb2 = k10.toString();
        ConcurrentHashMap concurrentHashMap2 = jb1.f29624a;
        if (!concurrentHashMap2.containsKey(sb2)) {
            TLRPC.TL_messageMediaWidget tL_messageMediaWidget = new TLRPC.TL_messageMediaWidget();
            tL_messageMediaWidget.width = tL_botInlineMessageWidget.width;
            tL_messageMediaWidget.height = tL_botInlineMessageWidget.height;
            tL_messageMediaWidget.payload = tL_botInlineMessageWidget.payload;
            tL_messageMediaWidget.public_data = tL_botInlineMessageWidget.public_data;
            tL_messageMediaWidget.public_data_hash = tL_botInlineMessageWidget.public_data_hash;
            tL_messageMediaWidget.chat_data = tL_botInlineMessageWidget.chat_data;
            tL_messageMediaWidget.widget_id = tL_botInlineMessageWidget.widget_id;
            gb1 gb1Var = new gb1(sb2, i10, 0L, 0, tL_messageMediaWidget, true);
            gb1Var.f28531y = true;
            concurrentHashMap2.putIfAbsent(sb2, gb1Var);
        }
        this.f27813b = sb2;
        this.f27814c = jb1.i(sb2);
    }

    @Override
    public final void d() {
        this.f27812a.invalidate();
    }

    @Override
    public final void e() {
        View view = this.f27812a;
        view.requestLayout();
        view.invalidate();
    }

    public final void f(int i10) {
        nb1 nb1Var = this.f27814c;
        if (nb1Var != null && i10 > 0) {
            this.f27816n = i10;
            nb1Var.q(i10);
            if (!this.f27817r) {
                this.f27817r = true;
                nb1Var.o(ec1.a(this.d, true));
                if (this.h == null) {
                    this.h = new ub1(this, AndroidUtilities.density);
                }
                ub1 ub1Var = this.h;
                if (ub1Var.f33347p != nb1Var) {
                    ub1Var.q();
                    ub1Var.f33347p = nb1Var;
                    nb1Var.h = ub1Var;
                    nb1Var.p(ub1Var.f33348q);
                }
                this.h.p(true);
                jb1.r(nb1Var);
            }
        }
    }

    @Override
    public final void b() {
    }

    @Override
    public final void a(boolean z10) {
    }

    @Override
    public final void c(String str) {
    }
}
