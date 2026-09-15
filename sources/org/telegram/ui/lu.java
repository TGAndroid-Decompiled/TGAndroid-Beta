package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class lu implements org.telegram.ui.ActionBar.a2, ki.e {
    public final int f35558a;
    public final DataSettingsActivity f35559b;

    public lu(DataSettingsActivity dataSettingsActivity, int i10) {
        this.f35558a = i10;
        this.f35559b = dataSettingsActivity;
    }

    @Override
    public int e() {
        DataSettingsActivity dataSettingsActivity = this.f35559b;
        dataSettingsActivity.getClass();
        return dataSettingsActivity.getThemedColor(org.telegram.ui.ActionBar.i6.f18780a7);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f35558a) {
            case 0:
                DataSettingsActivity.V(this.f35559b);
                return;
            default:
                TLRPC.TL_messages_clearAllDrafts tL_messages_clearAllDrafts = new TLRPC.TL_messages_clearAllDrafts();
                DataSettingsActivity dataSettingsActivity = this.f35559b;
                dataSettingsActivity.getConnectionsManager().sendRequest(tL_messages_clearAllDrafts, new m(dataSettingsActivity, 6));
                return;
        }
    }
}
