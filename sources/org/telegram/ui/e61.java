package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class e61 implements TextWatcher {
    public final ky0 f37832a = new ky0(this, 18);
    public final l61 f37833b;

    public e61(l61 l61Var) {
        this.f37833b = l61Var;
    }

    public final void a() {
        boolean z10;
        boolean z11;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        l61 l61Var = this.f37833b;
        String obj = l61Var.Y.getText().toString();
        tL_channelParticipantsSearch.f22379q = obj;
        k61 k61Var = l61Var.f40066c0;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = k61Var.f39754c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z10 = !TextUtils.equals(channelParticipantsFilter.f22379q, obj);
            z11 = false;
        } else {
            z10 = true;
            z11 = true;
        }
        k61Var.f39754c = tL_channelParticipantsSearch;
        if (z10) {
            if (z11) {
                k61Var.f39758r = false;
                if (k61Var.f39757n >= 0) {
                    ConnectionsManager.getInstance(k61Var.f39752a).cancelRequest(k61Var.f39757n, true);
                    k61Var.f39757n = -1;
                }
                k61Var.f39756f = false;
                k61Var.d.clear();
                k61Var.h = false;
            } else {
                k61Var.f39758r = true;
                k61Var.h = false;
            }
            k61Var.b();
        }
        org.telegram.ui.Components.z41 z41Var = l61Var.f40068e0;
        if (z41Var != null) {
            z41Var.N(true);
        }
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        ky0 ky0Var = this.f37832a;
        if (length <= 0) {
            AndroidUtilities.cancelRunOnUIThread(ky0Var);
            a();
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(ky0Var);
        AndroidUtilities.runOnUIThread(ky0Var, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
