package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class b71 implements TextWatcher {
    public final sz0 f32762a = new sz0(this, 16);
    public final i71 f32763b;

    public b71(i71 i71Var) {
        this.f32763b = i71Var;
    }

    public final void a() {
        boolean z4;
        boolean z10;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        i71 i71Var = this.f32763b;
        String obj = i71Var.Z.getText().toString();
        tL_channelParticipantsSearch.f19158q = obj;
        h71 h71Var = i71Var.f34824d0;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = h71Var.f34593c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z4 = !TextUtils.equals(channelParticipantsFilter.f19158q, obj);
            z10 = false;
        } else {
            z4 = true;
            z10 = true;
        }
        h71Var.f34593c = tL_channelParticipantsSearch;
        if (z4) {
            if (z10) {
                h71Var.f34596r = false;
                if (h71Var.f34595n >= 0) {
                    ConnectionsManager.getInstance(h71Var.f34591a).cancelRequest(h71Var.f34595n, true);
                    h71Var.f34595n = -1;
                }
                h71Var.f34594f = false;
                h71Var.d.clear();
                h71Var.h = false;
            } else {
                h71Var.f34596r = true;
                h71Var.h = false;
            }
            h71Var.b();
        }
        org.telegram.ui.Components.w51 w51Var = i71Var.f34826f0;
        if (w51Var != null) {
            w51Var.N(true);
        }
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        sz0 sz0Var = this.f32762a;
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
