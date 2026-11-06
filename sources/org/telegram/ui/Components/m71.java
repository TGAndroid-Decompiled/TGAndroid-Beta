package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;
public final class m71 implements o71 {
    public final View f35904a;
    public final String f35905b;
    public final org.telegram.utils.twidget.u f35906c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final Paint f35907e = new Paint(1);
    public final Path f35908f = new Path();
    public p71 h;
    public int f35909n;
    public boolean f35910r;

    public m71(org.telegram.ui.Cells.h2 h2Var, int i7, TLRPC.BotInlineResult botInlineResult, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f35904a = h2Var;
        this.d = f6Var;
        ConcurrentHashMap concurrentHashMap = org.telegram.utils.twidget.p.f52874a;
        TLRPC.TL_botInlineMessageWidget tL_botInlineMessageWidget = (TLRPC.TL_botInlineMessageWidget) botInlineResult.send_message;
        StringBuilder n10 = jg.g.n(i7, "tg-widget:preview/", "/");
        n10.append(botInlineResult.query_id);
        n10.append("/");
        n10.append(botInlineResult.f26951id);
        n10.append("/");
        n10.append(Arrays.hashCode(tL_botInlineMessageWidget.payload));
        String sb2 = n10.toString();
        ConcurrentHashMap concurrentHashMap2 = org.telegram.utils.twidget.p.f52874a;
        if (!concurrentHashMap2.containsKey(sb2)) {
            TLRPC.TL_messageMediaWidget tL_messageMediaWidget = new TLRPC.TL_messageMediaWidget();
            tL_messageMediaWidget.width = tL_botInlineMessageWidget.width;
            tL_messageMediaWidget.height = tL_botInlineMessageWidget.height;
            tL_messageMediaWidget.payload = tL_botInlineMessageWidget.payload;
            tL_messageMediaWidget.public_data = tL_botInlineMessageWidget.public_data;
            tL_messageMediaWidget.public_data_hash = tL_botInlineMessageWidget.public_data_hash;
            tL_messageMediaWidget.chat_data = tL_botInlineMessageWidget.chat_data;
            tL_messageMediaWidget.widget_id = tL_botInlineMessageWidget.widget_id;
            org.telegram.utils.twidget.m mVar = new org.telegram.utils.twidget.m(sb2, i7, 0L, 0, 0L, tL_messageMediaWidget, true);
            mVar.f52865z = true;
            concurrentHashMap2.putIfAbsent(sb2, mVar);
        }
        this.f35905b = sb2;
        this.f35906c = org.telegram.utils.twidget.p.i(sb2);
    }

    public final void a(int i7) {
        org.telegram.utils.twidget.u uVar = this.f35906c;
        if (uVar != null && i7 > 0) {
            this.f35909n = i7;
            uVar.n(i7);
            if (!this.f35910r) {
                this.f35910r = true;
                uVar.l(org.telegram.utils.twidget.i0.a(this.d, true));
                if (this.h == null) {
                    this.h = new p71(this, org.telegram.messenger.g0.f22543p);
                }
                p71 p71Var = this.h;
                if (p71Var.f36801p != uVar) {
                    p71Var.q();
                    p71Var.f36801p = uVar;
                    uVar.h = p71Var;
                    uVar.m(p71Var.f36802q);
                }
                this.h.p(true);
                org.telegram.utils.twidget.p.s(uVar);
            }
        }
    }

    @Override
    public final void h() {
        this.f35904a.invalidate();
    }

    @Override
    public final void j() {
        View view = this.f35904a;
        view.requestLayout();
        view.invalidate();
    }

    @Override
    public final void b(boolean z9) {
    }

    @Override
    public final void f(String str) {
    }

    @Override
    public final void d() {
    }
}
