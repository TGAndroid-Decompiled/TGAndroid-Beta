package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class j71 implements TextWatcher {
    public final e01 f34718a = new e01(this, 16);
    public final q71 f34719b;

    public j71(q71 q71Var) {
        this.f34719b = q71Var;
    }

    public final void a() {
        boolean z10;
        boolean z11;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        q71 q71Var = this.f34719b;
        String obj = q71Var.f36712c0.getText().toString();
        tL_channelParticipantsSearch.f18295q = obj;
        p71 p71Var = q71Var.f36716g0;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = p71Var.f36367c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z10 = !TextUtils.equals(channelParticipantsFilter.f18295q, obj);
            z11 = false;
        } else {
            z10 = true;
            z11 = true;
        }
        p71Var.f36367c = tL_channelParticipantsSearch;
        if (z10) {
            if (z11) {
                p71Var.f36370r = false;
                if (p71Var.f36369n >= 0) {
                    ConnectionsManager.getInstance(p71Var.f36365a).cancelRequest(p71Var.f36369n, true);
                    p71Var.f36369n = -1;
                }
                p71Var.f36368f = false;
                p71Var.d.clear();
                p71Var.h = false;
            } else {
                p71Var.f36370r = true;
                p71Var.h = false;
            }
            p71Var.b();
        }
        org.telegram.ui.Components.l61 l61Var = q71Var.f36718i0;
        if (l61Var != null) {
            l61Var.N(true);
        }
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        e01 e01Var = this.f34718a;
        if (length <= 0) {
            AndroidUtilities.cancelRunOnUIThread(e01Var);
            a();
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(e01Var);
        AndroidUtilities.runOnUIThread(e01Var, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
