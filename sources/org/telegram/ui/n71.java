package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class n71 implements TextWatcher {
    public final nz0 f40096a = new nz0(this, 17);
    public final u71 f40097b;

    public n71(u71 u71Var) {
        this.f40097b = u71Var;
    }

    public final void a() {
        boolean z10;
        boolean z11;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        u71 u71Var = this.f40097b;
        String obj = u71Var.f42354c0.getText().toString();
        tL_channelParticipantsSearch.f20037q = obj;
        t71 t71Var = u71Var.f42358g0;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = t71Var.f41897c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z10 = !TextUtils.equals(channelParticipantsFilter.f20037q, obj);
            z11 = false;
        } else {
            z10 = true;
            z11 = true;
        }
        t71Var.f41897c = tL_channelParticipantsSearch;
        if (z10) {
            if (z11) {
                t71Var.f41901r = false;
                if (t71Var.f41900n >= 0) {
                    ConnectionsManager.getInstance(t71Var.f41895a).cancelRequest(t71Var.f41900n, true);
                    t71Var.f41900n = -1;
                }
                t71Var.f41899f = false;
                t71Var.d.clear();
                t71Var.h = false;
            } else {
                t71Var.f41901r = true;
                t71Var.h = false;
            }
            t71Var.b();
        }
        org.telegram.ui.Components.c71 c71Var = u71Var.f42360i0;
        if (c71Var != null) {
            c71Var.N(true);
        }
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        nz0 nz0Var = this.f40096a;
        if (length <= 0) {
            AndroidUtilities.cancelRunOnUIThread(nz0Var);
            a();
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(nz0Var);
        AndroidUtilities.runOnUIThread(nz0Var, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
