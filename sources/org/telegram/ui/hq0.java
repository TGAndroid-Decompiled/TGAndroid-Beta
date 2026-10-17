package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class hq0 implements org.telegram.ui.Cells.r5 {
    public final iq0 f37613a;

    public hq0(iq0 iq0Var) {
        this.f37613a = iq0Var;
    }

    public final void a() {
        sn snVar;
        TLRPC.Chat chat;
        kq0 kq0Var = this.f37613a.d;
        if (kq0Var.I && (snVar = kq0Var.U) != null && (chat = snVar.e) != null && !ChatObject.hasAdminRights(chat) && chat.slowmode_enabled && kq0Var.W != 2) {
            org.telegram.ui.Components.f5.t0(kq0Var, LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError), null);
            if (kq0Var.W == 1) {
                kq0Var.W = 2;
            }
        }
    }

    @Override
    public final void c(org.telegram.ui.Cells.s5 s5Var) {
        boolean z10;
        int intValue = ((Integer) s5Var.getTag()).intValue();
        kq0 kq0Var = this.f37613a.d;
        MediaController.AlbumEntry albumEntry = kq0Var.J;
        int i10 = -1;
        int i11 = 1;
        if (albumEntry != null) {
            MediaController.PhotoEntry photoEntry = albumEntry.photos.get(intValue);
            boolean containsKey = kq0Var.f38639b.containsKey(Integer.valueOf(photoEntry.imageId));
            z10 = !containsKey;
            if (!containsKey && kq0Var.H > 0 && kq0Var.f38639b.size() >= kq0Var.H) {
                a();
                return;
            }
            if (kq0Var.e && !containsKey) {
                i10 = kq0Var.f38641c.size();
            }
            s5Var.b(i10, z10, true);
            kq0Var.Y(intValue, photoEntry);
        } else {
            AndroidUtilities.hideKeyboard(kq0Var.getParentActivity().getCurrentFocus());
            MediaController.SearchImage searchImage = (MediaController.SearchImage) kq0Var.f38645f.get(intValue);
            boolean containsKey2 = kq0Var.f38639b.containsKey(searchImage.f17789id);
            z10 = !containsKey2;
            if (!containsKey2 && kq0Var.H > 0 && kq0Var.f38639b.size() >= kq0Var.H) {
                a();
                return;
            }
            if (kq0Var.e && !containsKey2) {
                i10 = kq0Var.f38641c.size();
            }
            s5Var.b(i10, z10, true);
            kq0Var.Y(intValue, searchImage);
        }
        if (!z10) {
            i11 = 2;
        }
        kq0Var.i0(i11);
        kq0Var.f38661s0.a();
    }
}
