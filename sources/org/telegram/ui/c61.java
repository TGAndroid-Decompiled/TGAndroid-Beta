package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class c61 implements TextWatcher {
    public final sy0 f35801a = new sy0(this, 17);
    public final j61 f35802b;

    public c61(j61 j61Var) {
        this.f35802b = j61Var;
    }

    public final void a() {
        boolean z10;
        boolean z11;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        j61 j61Var = this.f35802b;
        String obj = j61Var.f38055c0.getText().toString();
        tL_channelParticipantsSearch.f20271q = obj;
        i61 i61Var = j61Var.f38059g0;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = i61Var.f37739c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z10 = !TextUtils.equals(channelParticipantsFilter.f20271q, obj);
            z11 = false;
        } else {
            z10 = true;
            z11 = true;
        }
        i61Var.f37739c = tL_channelParticipantsSearch;
        if (z10) {
            if (z11) {
                i61Var.f37742r = false;
                if (i61Var.f37741n >= 0) {
                    ConnectionsManager.getInstance(i61Var.f37737a).cancelRequest(i61Var.f37741n, true);
                    i61Var.f37741n = -1;
                }
                i61Var.f37740f = false;
                i61Var.d.clear();
                i61Var.h = false;
            } else {
                i61Var.f37742r = true;
                i61Var.h = false;
            }
            i61Var.b();
        }
        org.telegram.ui.Components.s61 s61Var = j61Var.f38061i0;
        if (s61Var != null) {
            s61Var.N(true);
        }
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        sy0 sy0Var = this.f35801a;
        if (length <= 0) {
            AndroidUtilities.cancelRunOnUIThread(sy0Var);
            a();
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(sy0Var);
        AndroidUtilities.runOnUIThread(sy0Var, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
