package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class m71 implements TextWatcher {
    public final mz0 f39863a = new mz0(this, 17);
    public final t71 f39864b;

    public m71(t71 t71Var) {
        this.f39864b = t71Var;
    }

    public final void a() {
        boolean z10;
        boolean z11;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        t71 t71Var = this.f39864b;
        String obj = t71Var.f42143c0.getText().toString();
        tL_channelParticipantsSearch.f20067q = obj;
        s71 s71Var = t71Var.f42147g0;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = s71Var.f41661c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z10 = !TextUtils.equals(channelParticipantsFilter.f20067q, obj);
            z11 = false;
        } else {
            z10 = true;
            z11 = true;
        }
        s71Var.f41661c = tL_channelParticipantsSearch;
        if (z10) {
            if (z11) {
                s71Var.f41665r = false;
                if (s71Var.f41664n >= 0) {
                    ConnectionsManager.getInstance(s71Var.f41659a).cancelRequest(s71Var.f41664n, true);
                    s71Var.f41664n = -1;
                }
                s71Var.f41663f = false;
                s71Var.d.clear();
                s71Var.h = false;
            } else {
                s71Var.f41665r = true;
                s71Var.h = false;
            }
            s71Var.b();
        }
        org.telegram.ui.Components.d71 d71Var = t71Var.f42149i0;
        if (d71Var != null) {
            d71Var.N(true);
        }
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        mz0 mz0Var = this.f39863a;
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
