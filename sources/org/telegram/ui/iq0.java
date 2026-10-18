package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class iq0 implements org.telegram.ui.Cells.r5 {
    public final jq0 f37973a;

    public iq0(jq0 jq0Var) {
        this.f37973a = jq0Var;
    }

    public final void a() {
        sn snVar;
        TLRPC.Chat chat;
        lq0 lq0Var = this.f37973a.d;
        if (lq0Var.I && (snVar = lq0Var.U) != null && (chat = snVar.e) != null && !ChatObject.hasAdminRights(chat) && chat.slowmode_enabled && lq0Var.W != 2) {
            org.telegram.ui.Components.f5.t0(lq0Var, LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError), null);
            if (lq0Var.W == 1) {
                lq0Var.W = 2;
            }
        }
    }

    @Override
    public final void c(org.telegram.ui.Cells.s5 s5Var) {
        boolean z10;
        int intValue = ((Integer) s5Var.getTag()).intValue();
        lq0 lq0Var = this.f37973a.d;
        MediaController.AlbumEntry albumEntry = lq0Var.J;
        int i10 = -1;
        int i11 = 1;
        if (albumEntry != null) {
            MediaController.PhotoEntry photoEntry = albumEntry.photos.get(intValue);
            boolean containsKey = lq0Var.f38913b.containsKey(Integer.valueOf(photoEntry.imageId));
            z10 = !containsKey;
            if (!containsKey && lq0Var.H > 0 && lq0Var.f38913b.size() >= lq0Var.H) {
                a();
                return;
            }
            if (lq0Var.e && !containsKey) {
                i10 = lq0Var.f38915c.size();
            }
            s5Var.b(i10, z10, true);
            lq0Var.Y(intValue, photoEntry);
        } else {
            AndroidUtilities.hideKeyboard(lq0Var.getParentActivity().getCurrentFocus());
            MediaController.SearchImage searchImage = (MediaController.SearchImage) lq0Var.f38919f.get(intValue);
            boolean containsKey2 = lq0Var.f38913b.containsKey(searchImage.f17796id);
            z10 = !containsKey2;
            if (!containsKey2 && lq0Var.H > 0 && lq0Var.f38913b.size() >= lq0Var.H) {
                a();
                return;
            }
            if (lq0Var.e && !containsKey2) {
                i10 = lq0Var.f38915c.size();
            }
            s5Var.b(i10, z10, true);
            lq0Var.Y(intValue, searchImage);
        }
        if (!z10) {
            i11 = 2;
        }
        lq0Var.i0(i11);
        lq0Var.f38935s0.a();
    }
}
