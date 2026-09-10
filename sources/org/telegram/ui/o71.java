package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class o71 implements TextWatcher {
    public final k01 f35410a = new k01(this, 16);
    public final v71 f35411b;

    public o71(v71 v71Var) {
        this.f35411b = v71Var;
    }

    public final void a() {
        boolean z10;
        boolean z11;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        v71 v71Var = this.f35411b;
        String obj = v71Var.f37436c0.getText().toString();
        tL_channelParticipantsSearch.f17194q = obj;
        u71 u71Var = v71Var.f37440g0;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = u71Var.f37144c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z10 = !TextUtils.equals(channelParticipantsFilter.f17194q, obj);
            z11 = false;
        } else {
            z10 = true;
            z11 = true;
        }
        u71Var.f37144c = tL_channelParticipantsSearch;
        if (z10) {
            if (z11) {
                u71Var.f37147r = false;
                if (u71Var.f37146n >= 0) {
                    ConnectionsManager.getInstance(u71Var.f37142a).cancelRequest(u71Var.f37146n, true);
                    u71Var.f37146n = -1;
                }
                u71Var.f37145f = false;
                u71Var.d.clear();
                u71Var.h = false;
            } else {
                u71Var.f37147r = true;
                u71Var.h = false;
            }
            u71Var.b();
        }
        org.telegram.ui.Components.j61 j61Var = v71Var.f37442i0;
        if (j61Var != null) {
            j61Var.N(true);
        }
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        k01 k01Var = this.f35410a;
        if (length <= 0) {
            AndroidUtilities.cancelRunOnUIThread(k01Var);
            a();
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(k01Var);
        AndroidUtilities.runOnUIThread(k01Var, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
