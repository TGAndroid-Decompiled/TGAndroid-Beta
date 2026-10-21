package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class a61 implements TextWatcher {
    public final qy0 f35289a = new qy0(this, 17);
    public final h61 f35290b;

    public a61(h61 h61Var) {
        this.f35290b = h61Var;
    }

    public final void a() {
        boolean z10;
        boolean z11;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        h61 h61Var = this.f35290b;
        String obj = h61Var.f37508c0.getText().toString();
        tL_channelParticipantsSearch.f20275q = obj;
        g61 g61Var = h61Var.f37512g0;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = g61Var.f37203c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z10 = !TextUtils.equals(channelParticipantsFilter.f20275q, obj);
            z11 = false;
        } else {
            z10 = true;
            z11 = true;
        }
        g61Var.f37203c = tL_channelParticipantsSearch;
        if (z10) {
            if (z11) {
                g61Var.f37206r = false;
                if (g61Var.f37205n >= 0) {
                    ConnectionsManager.getInstance(g61Var.f37201a).cancelRequest(g61Var.f37205n, true);
                    g61Var.f37205n = -1;
                }
                g61Var.f37204f = false;
                g61Var.d.clear();
                g61Var.h = false;
            } else {
                g61Var.f37206r = true;
                g61Var.h = false;
            }
            g61Var.b();
        }
        org.telegram.ui.Components.u61 u61Var = h61Var.f37514i0;
        if (u61Var != null) {
            u61Var.N(true);
        }
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        qy0 qy0Var = this.f35289a;
        if (length <= 0) {
            AndroidUtilities.cancelRunOnUIThread(qy0Var);
            a();
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(qy0Var);
        AndroidUtilities.runOnUIThread(qy0Var, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
