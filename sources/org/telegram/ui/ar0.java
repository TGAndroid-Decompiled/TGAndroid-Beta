package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class ar0 implements org.telegram.ui.Cells.s5 {
    public final br0 f35958a;

    public ar0(br0 br0Var) {
        this.f35958a = br0Var;
    }

    public final void a() {
        eo eoVar;
        TLRPC.Chat chat;
        dr0 dr0Var = this.f35958a.d;
        if (dr0Var.I && (eoVar = dr0Var.U) != null && (chat = eoVar.f37246e) != null && !ChatObject.hasAdminRights(chat) && chat.slowmode_enabled && dr0Var.W != 2) {
            org.telegram.ui.Components.g5.t0(dr0Var, LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError), null);
            if (dr0Var.W == 1) {
                dr0Var.W = 2;
            }
        }
    }

    @Override
    public final void b(org.telegram.ui.Cells.t5 t5Var) {
        boolean z10;
        int intValue = ((Integer) t5Var.getTag()).intValue();
        dr0 dr0Var = this.f35958a.d;
        MediaController.AlbumEntry albumEntry = dr0Var.J;
        int i10 = -1;
        int i11 = 1;
        if (albumEntry != null) {
            MediaController.PhotoEntry photoEntry = albumEntry.photos.get(intValue);
            boolean containsKey = dr0Var.f36871b.containsKey(Integer.valueOf(photoEntry.imageId));
            z10 = !containsKey;
            if (!containsKey && dr0Var.H > 0 && dr0Var.f36871b.size() >= dr0Var.H) {
                a();
                return;
            }
            if (dr0Var.f36876e && !containsKey) {
                i10 = dr0Var.f36873c.size();
            }
            t5Var.b(i10, z10, true);
            dr0Var.Y(intValue, photoEntry);
        } else {
            AndroidUtilities.hideKeyboard(dr0Var.getParentActivity().getCurrentFocus());
            MediaController.SearchImage searchImage = (MediaController.SearchImage) dr0Var.f36878f.get(intValue);
            boolean containsKey2 = dr0Var.f36871b.containsKey(searchImage.f16998id);
            z10 = !containsKey2;
            if (!containsKey2 && dr0Var.H > 0 && dr0Var.f36871b.size() >= dr0Var.H) {
                a();
                return;
            }
            if (dr0Var.f36876e && !containsKey2) {
                i10 = dr0Var.f36873c.size();
            }
            t5Var.b(i10, z10, true);
            dr0Var.Y(intValue, searchImage);
        }
        if (!z10) {
            i11 = 2;
        }
        dr0Var.i0(i11);
        dr0Var.f36894s0.a();
    }
}
