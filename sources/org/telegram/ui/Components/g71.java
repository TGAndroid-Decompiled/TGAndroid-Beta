package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;
public final class g71 implements i71 {
    public final View f33887a;
    public final String f33888b;
    public final org.telegram.utils.twidget.u f33889c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final Paint f33890e = new Paint(1);
    public final Path f33891f = new Path();
    public j71 h;
    public int f33892n;
    public boolean f33893r;

    public g71(org.telegram.ui.Cells.h2 h2Var, int i7, TLRPC.BotInlineResult botInlineResult, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f33887a = h2Var;
        this.d = f6Var;
        ConcurrentHashMap concurrentHashMap = org.telegram.utils.twidget.p.f52850a;
        TLRPC.TL_botInlineMessageWidget tL_botInlineMessageWidget = (TLRPC.TL_botInlineMessageWidget) botInlineResult.send_message;
        StringBuilder n10 = jg.g.n(i7, "tg-widget:preview/", "/");
        n10.append(botInlineResult.query_id);
        n10.append("/");
        n10.append(botInlineResult.f26950id);
        n10.append("/");
        n10.append(Arrays.hashCode(tL_botInlineMessageWidget.payload));
        String sb2 = n10.toString();
        ConcurrentHashMap concurrentHashMap2 = org.telegram.utils.twidget.p.f52850a;
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
            mVar.f52841z = true;
            concurrentHashMap2.putIfAbsent(sb2, mVar);
        }
        this.f33888b = sb2;
        this.f33889c = org.telegram.utils.twidget.p.i(sb2);
    }

    public final void a(int i7) {
        org.telegram.utils.twidget.u uVar = this.f33889c;
        if (uVar != null && i7 > 0) {
            this.f33892n = i7;
            uVar.n(i7);
            if (!this.f33893r) {
                this.f33893r = true;
                uVar.l(org.telegram.utils.twidget.i0.a(this.d, true));
                if (this.h == null) {
                    this.h = new j71(this, org.telegram.messenger.g0.f22536p);
                }
                j71 j71Var = this.h;
                if (j71Var.f34913p != uVar) {
                    j71Var.q();
                    j71Var.f34913p = uVar;
                    uVar.h = j71Var;
                    uVar.m(j71Var.f34914q);
                }
                this.h.p(true);
                org.telegram.utils.twidget.p.s(uVar);
            }
        }
    }

    @Override
    public final void h() {
        this.f33887a.invalidate();
    }

    @Override
    public final void j() {
        View view = this.f33887a;
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
