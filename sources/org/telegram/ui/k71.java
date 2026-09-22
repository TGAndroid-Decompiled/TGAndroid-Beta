package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class k71 implements TextWatcher {
    public final f01 f35076a = new f01(this, 16);
    public final r71 f35077b;

    public k71(r71 r71Var) {
        this.f35077b = r71Var;
    }

    public final void a() {
        boolean z10;
        boolean z11;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        r71 r71Var = this.f35077b;
        String obj = r71Var.f37053c0.getText().toString();
        tL_channelParticipantsSearch.f18108q = obj;
        q71 q71Var = r71Var.f37057g0;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = q71Var.f36785c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z10 = !TextUtils.equals(channelParticipantsFilter.f18108q, obj);
            z11 = false;
        } else {
            z10 = true;
            z11 = true;
        }
        q71Var.f36785c = tL_channelParticipantsSearch;
        if (z10) {
            if (z11) {
                q71Var.f36788r = false;
                if (q71Var.f36787n >= 0) {
                    ConnectionsManager.getInstance(q71Var.f36783a).cancelRequest(q71Var.f36787n, true);
                    q71Var.f36787n = -1;
                }
                q71Var.f36786f = false;
                q71Var.d.clear();
                q71Var.h = false;
            } else {
                q71Var.f36788r = true;
                q71Var.h = false;
            }
            q71Var.b();
        }
        org.telegram.ui.Components.w51 w51Var = r71Var.f37059i0;
        if (w51Var != null) {
            w51Var.N(true);
        }
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        f01 f01Var = this.f35076a;
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
