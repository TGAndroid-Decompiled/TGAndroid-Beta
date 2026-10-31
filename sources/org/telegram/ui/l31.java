package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class l31 implements TextWatcher {
    public final wv0 f39047a = new wv0(this, 20);
    public final s31 f39048b;

    public l31(s31 s31Var) {
        this.f39048b = s31Var;
    }

    public final void a() {
        boolean z10;
        boolean z11;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        s31 s31Var = this.f39048b;
        String obj = s31Var.U1.getText().toString();
        tL_channelParticipantsSearch.f19792q = obj;
        r31 r31Var = s31Var.Y1;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = r31Var.f41127c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z10 = !TextUtils.equals(channelParticipantsFilter.f19792q, obj);
            z11 = false;
        } else {
            z10 = true;
            z11 = true;
        }
        r31Var.f41127c = tL_channelParticipantsSearch;
        if (z10) {
            if (z11) {
                r31Var.f41130r = false;
                if (r31Var.f41129n >= 0) {
                    ConnectionsManager.getInstance(r31Var.f41125a).cancelRequest(r31Var.f41129n, true);
                    r31Var.f41129n = -1;
                }
                r31Var.f41128f = false;
                r31Var.d.clear();
                r31Var.h = false;
            } else {
                r31Var.f41130r = true;
                r31Var.h = false;
            }
            r31Var.b();
        }
        org.telegram.ui.Components.p51 p51Var = s31Var.a2;
        if (p51Var != null) {
            p51Var.O(true);
        }
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        wv0 wv0Var = this.f39047a;
        if (length <= 0) {
            org.telegram.messenger.i0.r(wv0Var);
            a();
            return;
        }
        org.telegram.messenger.i0.r(wv0Var);
        org.telegram.messenger.i0.h3(wv0Var, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
