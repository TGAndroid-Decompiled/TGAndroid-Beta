package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;
public final class e71 implements g71 {
    public final View f33303a;
    public final String f33304b;
    public final org.telegram.utils.twidget.u f33305c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final Paint f33306e = new Paint(1);
    public final Path f33307f = new Path();
    public h71 h;
    public int f33308n;
    public boolean f33309r;

    public e71(org.telegram.ui.Cells.h2 h2Var, int i3, TLRPC.BotInlineResult botInlineResult, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f33303a = h2Var;
        this.d = e6Var;
        ConcurrentHashMap concurrentHashMap = org.telegram.utils.twidget.p.f52941a;
        TLRPC.TL_botInlineMessageWidget tL_botInlineMessageWidget = (TLRPC.TL_botInlineMessageWidget) botInlineResult.send_message;
        StringBuilder m10 = k2.p1.m(i3, "tg-widget:preview/", "/");
        m10.append(botInlineResult.query_id);
        m10.append("/");
        m10.append(botInlineResult.f26999id);
        m10.append("/");
        m10.append(Arrays.hashCode(tL_botInlineMessageWidget.payload));
        String sb2 = m10.toString();
        ConcurrentHashMap concurrentHashMap2 = org.telegram.utils.twidget.p.f52941a;
        if (!concurrentHashMap2.containsKey(sb2)) {
            TLRPC.TL_messageMediaWidget tL_messageMediaWidget = new TLRPC.TL_messageMediaWidget();
            tL_messageMediaWidget.width = tL_botInlineMessageWidget.width;
            tL_messageMediaWidget.height = tL_botInlineMessageWidget.height;
            tL_messageMediaWidget.payload = tL_botInlineMessageWidget.payload;
            tL_messageMediaWidget.public_data = tL_botInlineMessageWidget.public_data;
            tL_messageMediaWidget.public_data_hash = tL_botInlineMessageWidget.public_data_hash;
            tL_messageMediaWidget.chat_data = tL_botInlineMessageWidget.chat_data;
            tL_messageMediaWidget.widget_id = tL_botInlineMessageWidget.widget_id;
            org.telegram.utils.twidget.m mVar = new org.telegram.utils.twidget.m(sb2, i3, 0L, 0, 0L, tL_messageMediaWidget, true);
            mVar.f52932z = true;
            concurrentHashMap2.putIfAbsent(sb2, mVar);
        }
        this.f33304b = sb2;
        this.f33305c = org.telegram.utils.twidget.p.i(sb2);
    }

    public final void a(int i3) {
        org.telegram.utils.twidget.u uVar = this.f33305c;
        if (uVar != null && i3 > 0) {
            this.f33308n = i3;
            uVar.n(i3);
            if (!this.f33309r) {
                this.f33309r = true;
                uVar.l(org.telegram.utils.twidget.i0.a(this.d, true));
                if (this.h == null) {
                    this.h = new h71(this, org.telegram.messenger.g0.f22607p);
                }
                h71 h71Var = this.h;
                if (h71Var.f34331p != uVar) {
                    h71Var.q();
                    h71Var.f34331p = uVar;
                    uVar.h = h71Var;
                    uVar.m(h71Var.f34332q);
                }
                this.h.p(true);
                org.telegram.utils.twidget.p.s(uVar);
            }
        }
    }

    @Override
    public final void h() {
        this.f33303a.invalidate();
    }

    @Override
    public final void j() {
        View view = this.f33303a;
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
