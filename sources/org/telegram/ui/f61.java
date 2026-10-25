package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class f61 implements TextWatcher {
    public final my0 f39280a = new my0(this, 19);
    public final m61 f39281b;

    public f61(m61 m61Var) {
        this.f39281b = m61Var;
    }

    public final void a() {
        boolean z10;
        boolean z11;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        m61 m61Var = this.f39281b;
        String obj = m61Var.f41472c0.getText().toString();
        tL_channelParticipantsSearch.f22026q = obj;
        l61 l61Var = m61Var.f41476g0;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = l61Var.f41150c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z10 = !TextUtils.equals(channelParticipantsFilter.f22026q, obj);
            z11 = false;
        } else {
            z10 = true;
            z11 = true;
        }
        l61Var.f41150c = tL_channelParticipantsSearch;
        if (z10) {
            if (z11) {
                l61Var.f41153r = false;
                if (l61Var.f41152n >= 0) {
                    ConnectionsManager.getInstance(l61Var.f41148a).cancelRequest(l61Var.f41152n, true);
                    l61Var.f41152n = -1;
                }
                l61Var.f41151f = false;
                l61Var.d.clear();
                l61Var.h = false;
            } else {
                l61Var.f41153r = true;
                l61Var.h = false;
            }
            l61Var.b();
        }
        org.telegram.ui.Components.j71 j71Var = m61Var.f41478i0;
        if (j71Var != null) {
            j71Var.O(true);
        }
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        my0 my0Var = this.f39280a;
        if (length <= 0) {
            AndroidUtilities.cancelRunOnUIThread(my0Var);
            a();
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(my0Var);
        AndroidUtilities.runOnUIThread(my0Var, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
