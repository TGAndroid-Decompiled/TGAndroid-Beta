package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class i61 implements TextWatcher {
    public final oy0 f40057a = new oy0(this, 19);
    public final p61 f40058b;

    public i61(p61 p61Var) {
        this.f40058b = p61Var;
    }

    public final void a() {
        boolean z10;
        boolean z11;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        p61 p61Var = this.f40058b;
        String obj = p61Var.f42318c0.getText().toString();
        tL_channelParticipantsSearch.f22027q = obj;
        o61 o61Var = p61Var.f42322g0;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = o61Var.f41996c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z10 = !TextUtils.equals(channelParticipantsFilter.f22027q, obj);
            z11 = false;
        } else {
            z10 = true;
            z11 = true;
        }
        o61Var.f41996c = tL_channelParticipantsSearch;
        if (z10) {
            if (z11) {
                o61Var.f41999r = false;
                if (o61Var.f41998n >= 0) {
                    ConnectionsManager.getInstance(o61Var.f41994a).cancelRequest(o61Var.f41998n, true);
                    o61Var.f41998n = -1;
                }
                o61Var.f41997f = false;
                o61Var.d.clear();
                o61Var.h = false;
            } else {
                o61Var.f41999r = true;
                o61Var.h = false;
            }
            o61Var.b();
        }
        org.telegram.ui.Components.k71 k71Var = p61Var.f42324i0;
        if (k71Var != null) {
            k71Var.O(true);
        }
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        oy0 oy0Var = this.f40057a;
        if (length <= 0) {
            AndroidUtilities.cancelRunOnUIThread(oy0Var);
            a();
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(oy0Var);
        AndroidUtilities.runOnUIThread(oy0Var, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
