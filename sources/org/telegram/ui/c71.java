package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class c71 implements TextWatcher {
    public final xz0 f32283a = new xz0(this, 16);
    public final j71 f32284b;

    public c71(j71 j71Var) {
        this.f32284b = j71Var;
    }

    public final void a() {
        boolean z10;
        boolean z11;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        j71 j71Var = this.f32284b;
        String obj = j71Var.f34349c0.getText().toString();
        tL_channelParticipantsSearch.f18082q = obj;
        i71 i71Var = j71Var.f34353g0;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = i71Var.f34055c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z10 = !TextUtils.equals(channelParticipantsFilter.f18082q, obj);
            z11 = false;
        } else {
            z10 = true;
            z11 = true;
        }
        i71Var.f34055c = tL_channelParticipantsSearch;
        if (z10) {
            if (z11) {
                i71Var.f34058r = false;
                if (i71Var.f34057n >= 0) {
                    ConnectionsManager.getInstance(i71Var.f34053a).cancelRequest(i71Var.f34057n, true);
                    i71Var.f34057n = -1;
                }
                i71Var.f34056f = false;
                i71Var.d.clear();
                i71Var.h = false;
            } else {
                i71Var.f34058r = true;
                i71Var.h = false;
            }
            i71Var.b();
        }
        org.telegram.ui.Components.v51 v51Var = j71Var.f34355i0;
        if (v51Var != null) {
            v51Var.N(true);
        }
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        xz0 xz0Var = this.f32283a;
        if (length <= 0) {
            AndroidUtilities.cancelRunOnUIThread(xz0Var);
            a();
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(xz0Var);
        AndroidUtilities.runOnUIThread(xz0Var, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
