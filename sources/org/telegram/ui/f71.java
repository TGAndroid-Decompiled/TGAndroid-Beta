package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class f71 implements TextWatcher {
    public final xz0 f33449a = new xz0(this, 16);
    public final m71 f33450b;

    public f71(m71 m71Var) {
        this.f33450b = m71Var;
    }

    public final void a() {
        boolean z10;
        boolean z11;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        m71 m71Var = this.f33450b;
        String obj = m71Var.f35539c0.getText().toString();
        tL_channelParticipantsSearch.f18328q = obj;
        l71 l71Var = m71Var.f35543g0;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = l71Var.f35275c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z10 = !TextUtils.equals(channelParticipantsFilter.f18328q, obj);
            z11 = false;
        } else {
            z10 = true;
            z11 = true;
        }
        l71Var.f35275c = tL_channelParticipantsSearch;
        if (z10) {
            if (z11) {
                l71Var.f35278r = false;
                if (l71Var.f35277n >= 0) {
                    ConnectionsManager.getInstance(l71Var.f35273a).cancelRequest(l71Var.f35277n, true);
                    l71Var.f35277n = -1;
                }
                l71Var.f35276f = false;
                l71Var.d.clear();
                l71Var.h = false;
            } else {
                l71Var.f35278r = true;
                l71Var.h = false;
            }
            l71Var.b();
        }
        org.telegram.ui.Components.l61 l61Var = m71Var.f35545i0;
        if (l61Var != null) {
            l61Var.N(true);
        }
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        xz0 xz0Var = this.f33449a;
        if (length <= 0) {
            AndroidUtilities.cancelRunOnUIThread(xz0Var);
            a();
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(xz0Var);
        AndroidUtilities.runOnUIThread(xz0Var, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
