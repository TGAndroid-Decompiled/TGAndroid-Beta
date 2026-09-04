package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class m71 implements TextWatcher {
    public final f01 f38588a = new f01(this, 16);
    public final t71 f38589b;

    public m71(t71 t71Var) {
        this.f38589b = t71Var;
    }

    public final void a() {
        boolean z10;
        boolean z11;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        t71 t71Var = this.f38589b;
        String obj = t71Var.f40650c0.getText().toString();
        tL_channelParticipantsSearch.f19868q = obj;
        s71 s71Var = t71Var.f40654g0;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = s71Var.f40337c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z10 = !TextUtils.equals(channelParticipantsFilter.f19868q, obj);
            z11 = false;
        } else {
            z10 = true;
            z11 = true;
        }
        s71Var.f40337c = tL_channelParticipantsSearch;
        if (z10) {
            if (z11) {
                s71Var.f40341r = false;
                if (s71Var.f40340n >= 0) {
                    ConnectionsManager.getInstance(s71Var.f40335a).cancelRequest(s71Var.f40340n, true);
                    s71Var.f40340n = -1;
                }
                s71Var.f40339f = false;
                s71Var.d.clear();
                s71Var.h = false;
            } else {
                s71Var.f40341r = true;
                s71Var.h = false;
            }
            s71Var.b();
        }
        org.telegram.ui.Components.v51 v51Var = t71Var.f40656i0;
        if (v51Var != null) {
            v51Var.N(true);
        }
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        f01 f01Var = this.f38588a;
        if (length <= 0) {
            AndroidUtilities.cancelRunOnUIThread(f01Var);
            a();
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(f01Var);
        AndroidUtilities.runOnUIThread(f01Var, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
