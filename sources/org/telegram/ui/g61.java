package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class g61 implements TextWatcher {
    public final ky0 f38473a = new ky0(this, 18);
    public final n61 f38474b;

    public g61(n61 n61Var) {
        this.f38474b = n61Var;
    }

    public final void a() {
        boolean z10;
        boolean z11;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        n61 n61Var = this.f38474b;
        String obj = n61Var.Y.getText().toString();
        tL_channelParticipantsSearch.f22391q = obj;
        m61 m61Var = n61Var.f40728c0;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = m61Var.f40470c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z10 = !TextUtils.equals(channelParticipantsFilter.f22391q, obj);
            z11 = false;
        } else {
            z10 = true;
            z11 = true;
        }
        m61Var.f40470c = tL_channelParticipantsSearch;
        if (z10) {
            if (z11) {
                m61Var.f40474r = false;
                if (m61Var.f40473n >= 0) {
                    ConnectionsManager.getInstance(m61Var.f40468a).cancelRequest(m61Var.f40473n, true);
                    m61Var.f40473n = -1;
                }
                m61Var.f40472f = false;
                m61Var.d.clear();
                m61Var.h = false;
            } else {
                m61Var.f40474r = true;
                m61Var.h = false;
            }
            m61Var.b();
        }
        org.telegram.ui.Components.k51 k51Var = n61Var.f40730e0;
        if (k51Var != null) {
            k51Var.N(true);
        }
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        ky0 ky0Var = this.f38473a;
        if (length <= 0) {
            AndroidUtilities.cancelRunOnUIThread(ky0Var);
            a();
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(ky0Var);
        AndroidUtilities.runOnUIThread(ky0Var, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
