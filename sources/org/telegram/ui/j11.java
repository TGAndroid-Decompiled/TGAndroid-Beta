package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class j11 implements TextWatcher {
    public final pu0 f46482a = new pu0(this, 17);
    public final q11 f46483b;

    public j11(q11 q11Var) {
        this.f46483b = q11Var;
    }

    public final void a() {
        boolean z10;
        boolean z11;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        q11 q11Var = this.f46483b;
        String obj = q11Var.V1.getText().toString();
        tL_channelParticipantsSearch.f27000q = obj;
        p11 p11Var = q11Var.Z1;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = p11Var.f48405c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z10 = !TextUtils.equals(channelParticipantsFilter.f27000q, obj);
            z11 = false;
        } else {
            z10 = true;
            z11 = true;
        }
        p11Var.f48405c = tL_channelParticipantsSearch;
        if (z10) {
            if (z11) {
                p11Var.f48409r = false;
                if (p11Var.f48408n >= 0) {
                    ConnectionsManager.getInstance(p11Var.f48403a).cancelRequest(p11Var.f48408n, true);
                    p11Var.f48408n = -1;
                }
                p11Var.f48407f = false;
                p11Var.d.clear();
                p11Var.h = false;
            } else {
                p11Var.f48409r = true;
                p11Var.h = false;
            }
            p11Var.b();
        }
        org.telegram.ui.Components.f41 f41Var = q11Var.f48731b2;
        if (f41Var != null) {
            f41Var.O(true);
        }
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        pu0 pu0Var = this.f46482a;
        if (length <= 0) {
            org.telegram.messenger.g0.r(pu0Var);
            a();
            return;
        }
        org.telegram.messenger.g0.r(pu0Var);
        org.telegram.messenger.g0.i3(pu0Var, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }
}
