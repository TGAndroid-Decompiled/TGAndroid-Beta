package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class f71 implements TextWatcher {
    public final hz0 f36214a = new hz0(this, 17);
    public final m71 f36215b;

    public f71(m71 m71Var) {
        this.f36215b = m71Var;
    }

    public final void a() {
        boolean z10;
        boolean z11;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        m71 m71Var = this.f36215b;
        String obj = m71Var.f38461c0.getText().toString();
        tL_channelParticipantsSearch.f20041q = obj;
        l71 l71Var = m71Var.f38465g0;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = l71Var.f38191c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z10 = !TextUtils.equals(channelParticipantsFilter.f20041q, obj);
            z11 = false;
        } else {
            z10 = true;
            z11 = true;
        }
        l71Var.f38191c = tL_channelParticipantsSearch;
        if (z10) {
            if (z11) {
                l71Var.f38195r = false;
                if (l71Var.f38194n >= 0) {
                    ConnectionsManager.getInstance(l71Var.f38189a).cancelRequest(l71Var.f38194n, true);
                    l71Var.f38194n = -1;
                }
                l71Var.f38193f = false;
                l71Var.d.clear();
                l71Var.h = false;
            } else {
                l71Var.f38195r = true;
                l71Var.h = false;
            }
            l71Var.b();
        }
        org.telegram.ui.Components.u61 u61Var = m71Var.f38467i0;
        if (u61Var != null) {
            u61Var.N(true);
        }
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        hz0 hz0Var = this.f36214a;
        if (length <= 0) {
            AndroidUtilities.cancelRunOnUIThread(hz0Var);
            a();
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(hz0Var);
        AndroidUtilities.runOnUIThread(hz0Var, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
