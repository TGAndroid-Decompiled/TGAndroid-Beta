package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class d71 implements TextWatcher {
    public final hz0 f35708a = new hz0(this, 17);
    public final k71 f35709b;

    public d71(k71 k71Var) {
        this.f35709b = k71Var;
    }

    public final void a() {
        boolean z10;
        boolean z11;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        k71 k71Var = this.f35709b;
        String obj = k71Var.f37873c0.getText().toString();
        tL_channelParticipantsSearch.f20046q = obj;
        j71 j71Var = k71Var.f37877g0;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = j71Var.f37596c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z10 = !TextUtils.equals(channelParticipantsFilter.f20046q, obj);
            z11 = false;
        } else {
            z10 = true;
            z11 = true;
        }
        j71Var.f37596c = tL_channelParticipantsSearch;
        if (z10) {
            if (z11) {
                j71Var.f37600r = false;
                if (j71Var.f37599n >= 0) {
                    ConnectionsManager.getInstance(j71Var.f37594a).cancelRequest(j71Var.f37599n, true);
                    j71Var.f37599n = -1;
                }
                j71Var.f37598f = false;
                j71Var.d.clear();
                j71Var.h = false;
            } else {
                j71Var.f37600r = true;
                j71Var.h = false;
            }
            j71Var.b();
        }
        org.telegram.ui.Components.w61 w61Var = k71Var.f37879i0;
        if (w61Var != null) {
            w61Var.N(true);
        }
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        hz0 hz0Var = this.f35708a;
        if (length <= 0) {
            AndroidUtilities.cancelRunOnUIThread(hz0Var);
            a();
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(hz0Var);
        AndroidUtilities.runOnUIThread(hz0Var, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
