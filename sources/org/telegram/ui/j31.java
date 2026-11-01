package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class j31 implements TextWatcher {
    public final vv0 f38266a = new vv0(this, 20);
    public final q31 f38267b;

    public j31(q31 q31Var) {
        this.f38267b = q31Var;
    }

    public final void a() {
        boolean z10;
        boolean z11;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        q31 q31Var = this.f38267b;
        String obj = q31Var.U1.getText().toString();
        tL_channelParticipantsSearch.f19793q = obj;
        p31 p31Var = q31Var.Y1;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = p31Var.f40355c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z10 = !TextUtils.equals(channelParticipantsFilter.f19793q, obj);
            z11 = false;
        } else {
            z10 = true;
            z11 = true;
        }
        p31Var.f40355c = tL_channelParticipantsSearch;
        if (z10) {
            if (z11) {
                p31Var.f40358r = false;
                if (p31Var.f40357n >= 0) {
                    ConnectionsManager.getInstance(p31Var.f40353a).cancelRequest(p31Var.f40357n, true);
                    p31Var.f40357n = -1;
                }
                p31Var.f40356f = false;
                p31Var.d.clear();
                p31Var.h = false;
            } else {
                p31Var.f40358r = true;
                p31Var.h = false;
            }
            p31Var.b();
        }
        org.telegram.ui.Components.q51 q51Var = q31Var.a2;
        if (q51Var != null) {
            q51Var.O(true);
        }
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        vv0 vv0Var = this.f38266a;
        if (length <= 0) {
            org.telegram.messenger.i0.r(vv0Var);
            a();
            return;
        }
        org.telegram.messenger.i0.r(vv0Var);
        org.telegram.messenger.i0.h3(vv0Var, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
