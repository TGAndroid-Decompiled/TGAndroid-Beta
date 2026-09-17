package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class l71 implements TextWatcher {
    public final g01 f35471a = new g01(this, 16);
    public final s71 f35472b;

    public l71(s71 s71Var) {
        this.f35472b = s71Var;
    }

    public final void a() {
        boolean z10;
        boolean z11;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        s71 s71Var = this.f35472b;
        String obj = s71Var.f37403c0.getText().toString();
        tL_channelParticipantsSearch.f18120q = obj;
        r71 r71Var = s71Var.f37407g0;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = r71Var.f37107c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z10 = !TextUtils.equals(channelParticipantsFilter.f18120q, obj);
            z11 = false;
        } else {
            z10 = true;
            z11 = true;
        }
        r71Var.f37107c = tL_channelParticipantsSearch;
        if (z10) {
            if (z11) {
                r71Var.f37110r = false;
                if (r71Var.f37109n >= 0) {
                    ConnectionsManager.getInstance(r71Var.f37105a).cancelRequest(r71Var.f37109n, true);
                    r71Var.f37109n = -1;
                }
                r71Var.f37108f = false;
                r71Var.d.clear();
                r71Var.h = false;
            } else {
                r71Var.f37110r = true;
                r71Var.h = false;
            }
            r71Var.b();
        }
        org.telegram.ui.Components.x51 x51Var = s71Var.f37409i0;
        if (x51Var != null) {
            x51Var.N(true);
        }
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        g01 g01Var = this.f35471a;
        if (length <= 0) {
            AndroidUtilities.cancelRunOnUIThread(g01Var);
            a();
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(g01Var);
        AndroidUtilities.runOnUIThread(g01Var, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
