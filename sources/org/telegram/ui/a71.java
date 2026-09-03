package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class a71 implements TextWatcher {
    public final sz0 f35054a = new sz0(this, 16);
    public final h71 f35055b;

    public a71(h71 h71Var) {
        this.f35055b = h71Var;
    }

    public final void a() {
        boolean z4;
        boolean z10;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        h71 h71Var = this.f35055b;
        String obj = h71Var.Z.getText().toString();
        tL_channelParticipantsSearch.f20844q = obj;
        g71 g71Var = h71Var.f37245d0;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = g71Var.f37006c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z4 = !TextUtils.equals(channelParticipantsFilter.f20844q, obj);
            z10 = false;
        } else {
            z4 = true;
            z10 = true;
        }
        g71Var.f37006c = tL_channelParticipantsSearch;
        if (z4) {
            if (z10) {
                g71Var.f37010r = false;
                if (g71Var.f37009n >= 0) {
                    ConnectionsManager.getInstance(g71Var.f37004a).cancelRequest(g71Var.f37009n, true);
                    g71Var.f37009n = -1;
                }
                g71Var.f37008f = false;
                g71Var.d.clear();
                g71Var.h = false;
            } else {
                g71Var.f37010r = true;
                g71Var.h = false;
            }
            g71Var.b();
        }
        org.telegram.ui.Components.w51 w51Var = h71Var.f37247f0;
        if (w51Var != null) {
            w51Var.N(true);
        }
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        sz0 sz0Var = this.f35054a;
        if (length <= 0) {
            AndroidUtilities.cancelRunOnUIThread(sz0Var);
            a();
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(sz0Var);
        AndroidUtilities.runOnUIThread(sz0Var, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
