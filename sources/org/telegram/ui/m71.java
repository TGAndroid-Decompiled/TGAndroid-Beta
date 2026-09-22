package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class m71 implements TextWatcher {
    public final e01 f35647a = new e01(this, 16);
    public final t71 f35648b;

    public m71(t71 t71Var) {
        this.f35648b = t71Var;
    }

    public final void a() {
        boolean z10;
        boolean z11;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        t71 t71Var = this.f35648b;
        String obj = t71Var.f37691c0.getText().toString();
        tL_channelParticipantsSearch.f18342q = obj;
        s71 s71Var = t71Var.f37695g0;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = s71Var.f37347c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z10 = !TextUtils.equals(channelParticipantsFilter.f18342q, obj);
            z11 = false;
        } else {
            z10 = true;
            z11 = true;
        }
        s71Var.f37347c = tL_channelParticipantsSearch;
        if (z10) {
            if (z11) {
                s71Var.f37350r = false;
                if (s71Var.f37349n >= 0) {
                    ConnectionsManager.getInstance(s71Var.f37345a).cancelRequest(s71Var.f37349n, true);
                    s71Var.f37349n = -1;
                }
                s71Var.f37348f = false;
                s71Var.d.clear();
                s71Var.h = false;
            } else {
                s71Var.f37350r = true;
                s71Var.h = false;
            }
            s71Var.b();
        }
        org.telegram.ui.Components.m61 m61Var = t71Var.f37697i0;
        if (m61Var != null) {
            m61Var.N(true);
        }
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        e01 e01Var = this.f35647a;
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
