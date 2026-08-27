package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

public final class d61 implements TextWatcher {

    public final ky0 f37280a = new ky0(this, 18);

    public final k61 f37281b;

    public d61(k61 k61Var) {
        this.f37281b = k61Var;
    }

    public final void a() {
        boolean z10;
        boolean z11;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        k61 k61Var = this.f37281b;
        String string = k61Var.Y.getText().toString();
        tL_channelParticipantsSearch.f22379q = string;
        j61 j61Var = k61Var.f39624c0;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = j61Var.f39271c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z10 = !TextUtils.equals(channelParticipantsFilter.f22379q, string);
            z11 = false;
        } else {
            z10 = true;
            z11 = true;
        }
        j61Var.f39271c = tL_channelParticipantsSearch;
        if (z10) {
            if (z11) {
                j61Var.f39275r = false;
                if (j61Var.f39274n >= 0) {
                    ConnectionsManager.getInstance(j61Var.f39269a).cancelRequest(j61Var.f39274n, true);
                    j61Var.f39274n = -1;
                }
                j61Var.f39273f = false;
                j61Var.d.clear();
                j61Var.h = false;
            } else {
                j61Var.f39275r = true;
                j61Var.h = false;
            }
            j61Var.b();
        }
        org.telegram.ui.Components.b51 b51Var = k61Var.f39626e0;
        if (b51Var != null) {
            b51Var.N(true);
        }
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        ky0 ky0Var = this.f37280a;
        if (length <= 0) {
            AndroidUtilities.cancelRunOnUIThread(ky0Var);
            a();
        } else {
            AndroidUtilities.cancelRunOnUIThread(ky0Var);
            AndroidUtilities.runOnUIThread(ky0Var, 300L);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
