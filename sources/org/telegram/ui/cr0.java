package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class cr0 implements org.telegram.ui.Cells.s5 {
    public final dr0 f34771a;

    public cr0(dr0 dr0Var) {
        this.f34771a = dr0Var;
    }

    public final void a() {
        fo foVar;
        TLRPC.Chat chat;
        fr0 fr0Var = this.f34771a.d;
        if (fr0Var.I && (foVar = fr0Var.U) != null && (chat = foVar.e) != null && !ChatObject.hasAdminRights(chat) && chat.slowmode_enabled && fr0Var.W != 2) {
            org.telegram.ui.Components.g5.t0(fr0Var, LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError), null);
            if (fr0Var.W == 1) {
                fr0Var.W = 2;
            }
        }
    }

    @Override
    public final void c(org.telegram.ui.Cells.t5 t5Var) {
        boolean z10;
        int intValue = ((Integer) t5Var.getTag()).intValue();
        fr0 fr0Var = this.f34771a.d;
        MediaController.AlbumEntry albumEntry = fr0Var.J;
        int i10 = -1;
        int i11 = 1;
        if (albumEntry != null) {
            MediaController.PhotoEntry photoEntry = albumEntry.photos.get(intValue);
            boolean containsKey = fr0Var.f35913b.containsKey(Integer.valueOf(photoEntry.imageId));
            z10 = !containsKey;
            if (!containsKey && fr0Var.H > 0 && fr0Var.f35913b.size() >= fr0Var.H) {
                a();
                return;
            }
            if (fr0Var.e && !containsKey) {
                i10 = fr0Var.f35915c.size();
            }
            t5Var.b(i10, z10, true);
            fr0Var.Y(intValue, photoEntry);
        } else {
            AndroidUtilities.hideKeyboard(fr0Var.getParentActivity().getCurrentFocus());
            MediaController.SearchImage searchImage = (MediaController.SearchImage) fr0Var.f35919f.get(intValue);
            boolean containsKey2 = fr0Var.f35913b.containsKey(searchImage.f16394id);
            z10 = !containsKey2;
            if (!containsKey2 && fr0Var.H > 0 && fr0Var.f35913b.size() >= fr0Var.H) {
                a();
                return;
            }
            if (fr0Var.e && !containsKey2) {
                i10 = fr0Var.f35915c.size();
            }
            t5Var.b(i10, z10, true);
            fr0Var.Y(intValue, searchImage);
        }
        if (!z10) {
            i11 = 2;
        }
        fr0Var.i0(i11);
        fr0Var.f35935s0.a();
    }
}
