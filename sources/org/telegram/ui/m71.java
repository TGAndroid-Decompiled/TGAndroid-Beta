package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class m71 implements TextWatcher {
    public final mz0 f39829a = new mz0(this, 17);
    public final t71 f39830b;

    public m71(t71 t71Var) {
        this.f39830b = t71Var;
    }

    public final void a() {
        boolean z10;
        boolean z11;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        t71 t71Var = this.f39830b;
        String obj = t71Var.f42109c0.getText().toString();
        tL_channelParticipantsSearch.f20031q = obj;
        s71 s71Var = t71Var.f42113g0;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = s71Var.f41627c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z10 = !TextUtils.equals(channelParticipantsFilter.f20031q, obj);
            z11 = false;
        } else {
            z10 = true;
            z11 = true;
        }
        s71Var.f41627c = tL_channelParticipantsSearch;
        if (z10) {
            if (z11) {
                s71Var.f41631r = false;
                if (s71Var.f41630n >= 0) {
                    ConnectionsManager.getInstance(s71Var.f41625a).cancelRequest(s71Var.f41630n, true);
                    s71Var.f41630n = -1;
                }
                s71Var.f41629f = false;
                s71Var.d.clear();
                s71Var.h = false;
            } else {
                s71Var.f41631r = true;
                s71Var.h = false;
            }
            s71Var.b();
        }
        org.telegram.ui.Components.e71 e71Var = t71Var.f42115i0;
        if (e71Var != null) {
            e71Var.N(true);
        }
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        mz0 mz0Var = this.f39829a;
        if (length <= 0) {
            AndroidUtilities.cancelRunOnUIThread(mz0Var);
            a();
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(mz0Var);
        AndroidUtilities.runOnUIThread(mz0Var, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
