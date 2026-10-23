package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class p8 {
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f29466a;
    public final org.telegram.ui.ActionBar.e1 f29467b;
    public final o8 f29468c;
    public long d;
    public final y90 e;

    public p8(android.content.Context r23, org.telegram.ui.Components.th0 r24, final org.telegram.ui.Components.o8 r25, boolean r26, int r27, org.telegram.ui.ActionBar.g6 r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p8.<init>(android.content.Context, org.telegram.ui.Components.th0, org.telegram.ui.Components.o8, boolean, int, org.telegram.ui.ActionBar.g6):void");
    }

    public final void a() {
        this.f29468c.dismiss();
        this.d = System.currentTimeMillis();
    }

    public final void b(int i10) {
        if (System.currentTimeMillis() - this.d < 200) {
            AndroidUtilities.runOnUIThread(new d2(this, i10, 2));
            return;
        }
        org.telegram.ui.ActionBar.e1 e1Var = this.f29467b;
        if (i10 == 0) {
            e1Var.setVisibility(8);
        } else {
            e1Var.setVisibility(0);
        }
    }
}
