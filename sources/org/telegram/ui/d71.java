package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class d71 implements TextWatcher {
    public final vz0 f33051a = new vz0(this, 16);
    public final k71 f33052b;

    public d71(k71 k71Var) {
        this.f33052b = k71Var;
    }

    public final void a() {
        boolean z10;
        boolean z11;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        k71 k71Var = this.f33052b;
        String obj = k71Var.f34963c0.getText().toString();
        tL_channelParticipantsSearch.f18335q = obj;
        j71 j71Var = k71Var.f34967g0;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = j71Var.f34679c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z10 = !TextUtils.equals(channelParticipantsFilter.f18335q, obj);
            z11 = false;
        } else {
            z10 = true;
            z11 = true;
        }
        j71Var.f34679c = tL_channelParticipantsSearch;
        if (z10) {
            if (z11) {
                j71Var.f34682r = false;
                if (j71Var.f34681n >= 0) {
                    ConnectionsManager.getInstance(j71Var.f34677a).cancelRequest(j71Var.f34681n, true);
                    j71Var.f34681n = -1;
                }
                j71Var.f34680f = false;
                j71Var.d.clear();
                j71Var.h = false;
            } else {
                j71Var.f34682r = true;
                j71Var.h = false;
            }
            j71Var.b();
        }
        org.telegram.ui.Components.j61 j61Var = k71Var.f34969i0;
        if (j61Var != null) {
            j61Var.N(true);
        }
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        vz0 vz0Var = this.f33051a;
        if (length <= 0) {
            AndroidUtilities.cancelRunOnUIThread(vz0Var);
            a();
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(vz0Var);
        AndroidUtilities.runOnUIThread(vz0Var, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
