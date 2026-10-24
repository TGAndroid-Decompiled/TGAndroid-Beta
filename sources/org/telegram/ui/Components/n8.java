package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class n8 {
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f28825a;
    public final org.telegram.ui.ActionBar.e1 f28826b;
    public final m8 f28827c;
    public long d;
    public final w90 e;

    public n8(android.content.Context r23, org.telegram.ui.Components.sh0 r24, final org.telegram.ui.Components.m8 r25, boolean r26, int r27, org.telegram.ui.ActionBar.g6 r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.n8.<init>(android.content.Context, org.telegram.ui.Components.sh0, org.telegram.ui.Components.m8, boolean, int, org.telegram.ui.ActionBar.g6):void");
    }

    public final void a() {
        this.f28827c.dismiss();
        this.d = System.currentTimeMillis();
    }

    public final void b(int i10) {
        if (System.currentTimeMillis() - this.d < 200) {
            AndroidUtilities.runOnUIThread(new c2(this, i10, 2));
            return;
        }
        org.telegram.ui.ActionBar.e1 e1Var = this.f28826b;
        if (i10 == 0) {
            e1Var.setVisibility(8);
        } else {
            e1Var.setVisibility(0);
        }
    }
}
