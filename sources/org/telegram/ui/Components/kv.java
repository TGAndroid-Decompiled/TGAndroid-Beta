package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class kv implements Runnable {
    public final int f28502a;
    public final lv f28503b;

    public kv(lv lvVar, int i10) {
        this.f28502a = i10;
        this.f28503b = lvVar;
    }

    @Override
    public final void run() {
        switch (this.f28502a) {
            case 0:
                this.f28503b.f28886f.dismiss();
                return;
            default:
                ov ovVar = this.f28503b.f28886f;
                ovVar.dismiss();
                org.telegram.ui.ActionBar.p2 p2Var = ovVar.f29899c;
                if (p2Var != null && p2Var.getParentActivity() != null) {
                    org.telegram.messenger.y3.s(R.string.AddEmojiNotFound, qc.a0(p2Var), null);
                    return;
                }
                return;
        }
    }
}
