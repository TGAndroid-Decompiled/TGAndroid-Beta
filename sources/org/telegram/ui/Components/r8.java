package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class r8 {
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f32159a;
    public final org.telegram.ui.ActionBar.g1 f32160b;
    public final q8 f32161c;
    public long d;
    public final z90 e;

    public r8(android.content.Context r23, org.telegram.ui.Components.sh0 r24, final org.telegram.ui.Components.q8 r25, boolean r26, int r27, org.telegram.ui.ActionBar.u6 r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r8.<init>(android.content.Context, org.telegram.ui.Components.sh0, org.telegram.ui.Components.q8, boolean, int, org.telegram.ui.ActionBar.u6):void");
    }

    public final void a() {
        this.f32161c.dismiss();
        this.d = System.currentTimeMillis();
    }

    public final void b(int i10) {
        if (System.currentTimeMillis() - this.d < 200) {
            AndroidUtilities.runOnUIThread(new h2(this, i10, 2));
            return;
        }
        org.telegram.ui.ActionBar.g1 g1Var = this.f32160b;
        if (i10 == 0) {
            g1Var.setVisibility(8);
        } else {
            g1Var.setVisibility(0);
        }
    }
}
