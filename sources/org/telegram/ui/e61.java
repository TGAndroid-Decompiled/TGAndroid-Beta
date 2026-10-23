package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class e61 implements TextWatcher {
    public final my0 f36829a = new my0(this, 18);
    public final l61 f36830b;

    public e61(l61 l61Var) {
        this.f36830b = l61Var;
    }

    public final void a() {
        boolean z10;
        boolean z11;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        l61 l61Var = this.f36830b;
        String obj = l61Var.f39142c0.getText().toString();
        tL_channelParticipantsSearch.f20342q = obj;
        k61 k61Var = l61Var.f39146g0;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = k61Var.f38834c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z10 = !TextUtils.equals(channelParticipantsFilter.f20342q, obj);
            z11 = false;
        } else {
            z10 = true;
            z11 = true;
        }
        k61Var.f38834c = tL_channelParticipantsSearch;
        if (z10) {
            if (z11) {
                k61Var.f38837r = false;
                if (k61Var.f38836n >= 0) {
                    ConnectionsManager.getInstance(k61Var.f38832a).cancelRequest(k61Var.f38836n, true);
                    k61Var.f38836n = -1;
                }
                k61Var.f38835f = false;
                k61Var.d.clear();
                k61Var.h = false;
            } else {
                k61Var.f38837r = true;
                k61Var.h = false;
            }
            k61Var.b();
        }
        org.telegram.ui.Components.b71 b71Var = l61Var.f39148i0;
        if (b71Var != null) {
            b71Var.N(true);
        }
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        my0 my0Var = this.f36829a;
        if (length <= 0) {
            AndroidUtilities.cancelRunOnUIThread(my0Var);
            a();
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(my0Var);
        AndroidUtilities.runOnUIThread(my0Var, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
