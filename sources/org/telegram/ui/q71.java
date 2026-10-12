package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class q71 implements TextWatcher {
    public final pz0 f41208a = new pz0(this, 17);
    public final x71 f41209b;

    public q71(x71 x71Var) {
        this.f41209b = x71Var;
    }

    public final void a() {
        boolean z10;
        boolean z11;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        x71 x71Var = this.f41209b;
        String obj = x71Var.f43795c0.getText().toString();
        tL_channelParticipantsSearch.f19802q = obj;
        w71 w71Var = x71Var.f43799g0;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = w71Var.f43081c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z10 = !TextUtils.equals(channelParticipantsFilter.f19802q, obj);
            z11 = false;
        } else {
            z10 = true;
            z11 = true;
        }
        w71Var.f43081c = tL_channelParticipantsSearch;
        if (z10) {
            if (z11) {
                w71Var.f43085r = false;
                if (w71Var.f43084n >= 0) {
                    ConnectionsManager.getInstance(w71Var.f43079a).cancelRequest(w71Var.f43084n, true);
                    w71Var.f43084n = -1;
                }
                w71Var.f43083f = false;
                w71Var.d.clear();
                w71Var.h = false;
            } else {
                w71Var.f43085r = true;
                w71Var.h = false;
            }
            w71Var.b();
        }
        org.telegram.ui.Components.h71 h71Var = x71Var.f43801i0;
        if (h71Var != null) {
            h71Var.N(true);
        }
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        pz0 pz0Var = this.f41208a;
        if (length <= 0) {
            AndroidUtilities.cancelRunOnUIThread(pz0Var);
            a();
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(pz0Var);
        AndroidUtilities.runOnUIThread(pz0Var, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
