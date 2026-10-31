package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;
public final class n81 implements p81 {
    public final View f28714a;
    public final String f28715b;
    public final org.telegram.utils.twidget.w f28716c;
    public final org.telegram.ui.ActionBar.p6 d;
    public final Paint e = new Paint(1);
    public final Path f28717f = new Path();
    public q81 h;
    public int f28718n;
    public boolean f28719r;

    public n81(org.telegram.ui.Cells.h2 h2Var, int i10, TLRPC.BotInlineResult botInlineResult, org.telegram.ui.ActionBar.p6 p6Var) {
        this.f28714a = h2Var;
        this.d = p6Var;
        ConcurrentHashMap concurrentHashMap = org.telegram.utils.twidget.p.f44430a;
        TLRPC.TL_botInlineMessageWidget tL_botInlineMessageWidget = (TLRPC.TL_botInlineMessageWidget) botInlineResult.send_message;
        StringBuilder l4 = i0.a.l(i10, "tg-widget:preview/", "/");
        l4.append(botInlineResult.query_id);
        l4.append("/");
        l4.append(botInlineResult.f19791id);
        l4.append("/");
        l4.append(Arrays.hashCode(tL_botInlineMessageWidget.payload));
        String sb2 = l4.toString();
        ConcurrentHashMap concurrentHashMap2 = org.telegram.utils.twidget.p.f44430a;
        if (!concurrentHashMap2.containsKey(sb2)) {
            TLRPC.TL_messageMediaWidget tL_messageMediaWidget = new TLRPC.TL_messageMediaWidget();
            tL_messageMediaWidget.width = tL_botInlineMessageWidget.width;
            tL_messageMediaWidget.height = tL_botInlineMessageWidget.height;
            tL_messageMediaWidget.payload = tL_botInlineMessageWidget.payload;
            tL_messageMediaWidget.public_data = tL_botInlineMessageWidget.public_data;
            tL_messageMediaWidget.public_data_hash = tL_botInlineMessageWidget.public_data_hash;
            tL_messageMediaWidget.chat_data = tL_botInlineMessageWidget.chat_data;
            tL_messageMediaWidget.widget_id = tL_botInlineMessageWidget.widget_id;
            org.telegram.utils.twidget.m mVar = new org.telegram.utils.twidget.m(sb2, i10, 0L, 0, 0L, tL_messageMediaWidget, true);
            mVar.A = true;
            concurrentHashMap2.putIfAbsent(sb2, mVar);
        }
        this.f28715b = sb2;
        this.f28716c = org.telegram.utils.twidget.p.i(sb2);
    }

    public final void a(int i10) {
        org.telegram.utils.twidget.w wVar = this.f28716c;
        if (wVar != null && i10 > 0) {
            this.f28718n = i10;
            wVar.n(i10);
            if (!this.f28719r) {
                this.f28719r = true;
                wVar.l(org.telegram.utils.twidget.l0.a(this.d, true));
                if (this.h == null) {
                    this.h = new q81(this, org.telegram.messenger.i0.f16025p);
                }
                this.h.b(wVar);
                this.h.q(true);
                org.telegram.utils.twidget.p.s(wVar);
            }
        }
    }

    @Override
    public final void h() {
        this.f28714a.invalidate();
    }

    @Override
    public final void j() {
        View view = this.f28714a;
        view.requestLayout();
        view.invalidate();
    }

    @Override
    public final void b(boolean z10) {
    }

    @Override
    public final void f(String str) {
    }

    @Override
    public final void d() {
    }
}
