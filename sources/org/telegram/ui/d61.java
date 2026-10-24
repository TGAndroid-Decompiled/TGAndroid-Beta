package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class d61 implements TextWatcher {
    public final ly0 f36487a = new ly0(this, 18);
    public final k61 f36488b;

    public d61(k61 k61Var) {
        this.f36488b = k61Var;
    }

    public final void a() {
        boolean z10;
        boolean z11;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        k61 k61Var = this.f36488b;
        String obj = k61Var.f38802c0.getText().toString();
        tL_channelParticipantsSearch.f20343q = obj;
        j61 j61Var = k61Var.f38806g0;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = j61Var.f38477c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z10 = !TextUtils.equals(channelParticipantsFilter.f20343q, obj);
            z11 = false;
        } else {
            z10 = true;
            z11 = true;
        }
        j61Var.f38477c = tL_channelParticipantsSearch;
        if (z10) {
            if (z11) {
                j61Var.f38480r = false;
                if (j61Var.f38479n >= 0) {
                    ConnectionsManager.getInstance(j61Var.f38475a).cancelRequest(j61Var.f38479n, true);
                    j61Var.f38479n = -1;
                }
                j61Var.f38478f = false;
                j61Var.d.clear();
                j61Var.h = false;
            } else {
                j61Var.f38480r = true;
                j61Var.h = false;
            }
            j61Var.b();
        }
        org.telegram.ui.Components.a71 a71Var = k61Var.f38808i0;
        if (a71Var != null) {
            a71Var.N(true);
        }
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        ly0 ly0Var = this.f36487a;
        if (length <= 0) {
            AndroidUtilities.cancelRunOnUIThread(ly0Var);
            a();
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(ly0Var);
        AndroidUtilities.runOnUIThread(ly0Var, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
