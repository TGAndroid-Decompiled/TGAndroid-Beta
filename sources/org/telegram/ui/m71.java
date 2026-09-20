package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class m71 implements TextWatcher {
    public final e01 f35624a = new e01(this, 16);
    public final t71 f35625b;

    public m71(t71 t71Var) {
        this.f35625b = t71Var;
    }

    public final void a() {
        boolean z10;
        boolean z11;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        t71 t71Var = this.f35625b;
        String obj = t71Var.f37667c0.getText().toString();
        tL_channelParticipantsSearch.f18327q = obj;
        s71 s71Var = t71Var.f37671g0;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = s71Var.f37325c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z10 = !TextUtils.equals(channelParticipantsFilter.f18327q, obj);
            z11 = false;
        } else {
            z10 = true;
            z11 = true;
        }
        s71Var.f37325c = tL_channelParticipantsSearch;
        if (z10) {
            if (z11) {
                s71Var.f37328r = false;
                if (s71Var.f37327n >= 0) {
                    ConnectionsManager.getInstance(s71Var.f37323a).cancelRequest(s71Var.f37327n, true);
                    s71Var.f37327n = -1;
                }
                s71Var.f37326f = false;
                s71Var.d.clear();
                s71Var.h = false;
            } else {
                s71Var.f37328r = true;
                s71Var.h = false;
            }
            s71Var.b();
        }
        org.telegram.ui.Components.k61 k61Var = t71Var.f37673i0;
        if (k61Var != null) {
            k61Var.N(true);
        }
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        e01 e01Var = this.f35624a;
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
