package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class q11 implements TextWatcher {
    public final pu0 f50439a = new pu0(this, 18);
    public final x11 f50440b;

    public q11(x11 x11Var) {
        this.f50440b = x11Var;
    }

    public final void a() {
        boolean z10;
        boolean z11;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        x11 x11Var = this.f50440b;
        String obj = x11Var.Y1.getText().toString();
        tL_channelParticipantsSearch.f28050q = obj;
        w11 w11Var = x11Var.f53070c2;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = w11Var.f52358c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z10 = !TextUtils.equals(channelParticipantsFilter.f28050q, obj);
            z11 = false;
        } else {
            z10 = true;
            z11 = true;
        }
        w11Var.f52358c = tL_channelParticipantsSearch;
        if (z10) {
            if (z11) {
                w11Var.f52362r = false;
                if (w11Var.f52361n >= 0) {
                    ConnectionsManager.getInstance(w11Var.f52356a).cancelRequest(w11Var.f52361n, true);
                    w11Var.f52361n = -1;
                }
                w11Var.f52360f = false;
                w11Var.d.clear();
                w11Var.h = false;
            } else {
                w11Var.f52362r = true;
                w11Var.h = false;
            }
            w11Var.b();
        }
        org.telegram.ui.Components.p41 p41Var = x11Var.f53071e2;
        if (p41Var != null) {
            p41Var.O(true);
        }
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        pu0 pu0Var = this.f50439a;
        if (length <= 0) {
            org.telegram.messenger.g0.r(pu0Var);
            a();
            return;
        }
        org.telegram.messenger.g0.r(pu0Var);
        org.telegram.messenger.g0.i3(pu0Var, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
