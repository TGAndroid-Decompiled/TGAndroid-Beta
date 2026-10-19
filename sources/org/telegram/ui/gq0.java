package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class gq0 implements org.telegram.ui.Cells.r5 {
    public final hq0 f37413a;

    public gq0(hq0 hq0Var) {
        this.f37413a = hq0Var;
    }

    public final void a() {
        qn qnVar;
        TLRPC.Chat chat;
        jq0 jq0Var = this.f37413a.d;
        if (jq0Var.I && (qnVar = jq0Var.U) != null && (chat = qnVar.e) != null && !ChatObject.hasAdminRights(chat) && chat.slowmode_enabled && jq0Var.W != 2) {
            org.telegram.ui.Components.f5.t0(jq0Var, LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError), null);
            if (jq0Var.W == 1) {
                jq0Var.W = 2;
            }
        }
    }

    @Override
    public final void c(org.telegram.ui.Cells.s5 s5Var) {
        boolean z10;
        int intValue = ((Integer) s5Var.getTag()).intValue();
        jq0 jq0Var = this.f37413a.d;
        MediaController.AlbumEntry albumEntry = jq0Var.J;
        int i10 = -1;
        int i11 = 1;
        if (albumEntry != null) {
            MediaController.PhotoEntry photoEntry = albumEntry.photos.get(intValue);
            boolean containsKey = jq0Var.f38295b.containsKey(Integer.valueOf(photoEntry.imageId));
            z10 = !containsKey;
            if (!containsKey && jq0Var.H > 0 && jq0Var.f38295b.size() >= jq0Var.H) {
                a();
                return;
            }
            if (jq0Var.e && !containsKey) {
                i10 = jq0Var.f38297c.size();
            }
            s5Var.b(i10, z10, true);
            jq0Var.Y(intValue, photoEntry);
        } else {
            AndroidUtilities.hideKeyboard(jq0Var.getParentActivity().getCurrentFocus());
            MediaController.SearchImage searchImage = (MediaController.SearchImage) jq0Var.f38301f.get(intValue);
            boolean containsKey2 = jq0Var.f38295b.containsKey(searchImage.f17795id);
            z10 = !containsKey2;
            if (!containsKey2 && jq0Var.H > 0 && jq0Var.f38295b.size() >= jq0Var.H) {
                a();
                return;
            }
            if (jq0Var.e && !containsKey2) {
                i10 = jq0Var.f38297c.size();
            }
            s5Var.b(i10, z10, true);
            jq0Var.Y(intValue, searchImage);
        }
        if (!z10) {
            i11 = 2;
        }
        jq0Var.i0(i11);
        jq0Var.f38317s0.a();
    }
}
