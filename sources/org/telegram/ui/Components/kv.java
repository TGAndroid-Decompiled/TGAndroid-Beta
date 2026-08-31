package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class kv implements Runnable {
    public final int f28461a;
    public final lv f28462b;

    public kv(lv lvVar, int i10) {
        this.f28461a = i10;
        this.f28462b = lvVar;
    }

    @Override
    public final void run() {
        switch (this.f28461a) {
            case 0:
                this.f28462b.f28834f.dismiss();
                return;
            default:
                ov ovVar = this.f28462b.f28834f;
                ovVar.dismiss();
                org.telegram.ui.ActionBar.p2 p2Var = ovVar.f29873c;
                if (p2Var != null && p2Var.getParentActivity() != null) {
                    org.telegram.messenger.y3.s(R.string.AddEmojiNotFound, qc.a0(p2Var), null);
                    return;
                }
                return;
        }
    }
}
