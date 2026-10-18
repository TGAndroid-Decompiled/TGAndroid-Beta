package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class c61 implements TextWatcher {
    public final sy0 f35847a = new sy0(this, 17);
    public final j61 f35848b;

    public c61(j61 j61Var) {
        this.f35848b = j61Var;
    }

    public final void a() {
        boolean z10;
        boolean z11;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        j61 j61Var = this.f35848b;
        String obj = j61Var.f38073c0.getText().toString();
        tL_channelParticipantsSearch.f20278q = obj;
        i61 i61Var = j61Var.f38077g0;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = i61Var.f37777c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z10 = !TextUtils.equals(channelParticipantsFilter.f20278q, obj);
            z11 = false;
        } else {
            z10 = true;
            z11 = true;
        }
        i61Var.f37777c = tL_channelParticipantsSearch;
        if (z10) {
            if (z11) {
                i61Var.f37780r = false;
                if (i61Var.f37779n >= 0) {
                    ConnectionsManager.getInstance(i61Var.f37775a).cancelRequest(i61Var.f37779n, true);
                    i61Var.f37779n = -1;
                }
                i61Var.f37778f = false;
                i61Var.d.clear();
                i61Var.h = false;
            } else {
                i61Var.f37780r = true;
                i61Var.h = false;
            }
            i61Var.b();
        }
        org.telegram.ui.Components.s61 s61Var = j61Var.f38079i0;
        if (s61Var != null) {
            s61Var.N(true);
        }
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        sy0 sy0Var = this.f35847a;
        if (length <= 0) {
            AndroidUtilities.cancelRunOnUIThread(sy0Var);
            a();
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(sy0Var);
        AndroidUtilities.runOnUIThread(sy0Var, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
