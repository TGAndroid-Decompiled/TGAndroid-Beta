package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class oq0 implements org.telegram.ui.Cells.w5 {
    public final pq0 f42268a;

    public oq0(pq0 pq0Var) {
        this.f42268a = pq0Var;
    }

    public final void a() {
        un unVar;
        TLRPC.Chat chat;
        rq0 rq0Var = this.f42268a.d;
        if (rq0Var.I && (unVar = rq0Var.U) != null && (chat = unVar.e) != null && !ChatObject.hasAdminRights(chat) && chat.slowmode_enabled && rq0Var.W != 2) {
            org.telegram.ui.Components.g5.t0(rq0Var, LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError), null);
            if (rq0Var.W == 1) {
                rq0Var.W = 2;
            }
        }
    }

    @Override
    public final void b(org.telegram.ui.Cells.x5 x5Var) {
        boolean z10;
        int intValue = ((Integer) x5Var.getTag()).intValue();
        rq0 rq0Var = this.f42268a.d;
        MediaController.AlbumEntry albumEntry = rq0Var.J;
        int i10 = -1;
        int i11 = 1;
        if (albumEntry != null) {
            MediaController.PhotoEntry photoEntry = albumEntry.photos.get(intValue);
            boolean containsKey = rq0Var.f43241b.containsKey(Integer.valueOf(photoEntry.imageId));
            z10 = !containsKey;
            if (!containsKey && rq0Var.H > 0 && rq0Var.f43241b.size() >= rq0Var.H) {
                a();
                return;
            }
            if (rq0Var.e && !containsKey) {
                i10 = rq0Var.f43243c.size();
            }
            x5Var.b(i10, z10, true);
            rq0Var.Z(intValue, photoEntry);
        } else {
            AndroidUtilities.hideKeyboard(rq0Var.getParentActivity().getCurrentFocus());
            MediaController.SearchImage searchImage = (MediaController.SearchImage) rq0Var.f43247f.get(intValue);
            boolean containsKey2 = rq0Var.f43241b.containsKey(searchImage.f19543id);
            z10 = !containsKey2;
            if (!containsKey2 && rq0Var.H > 0 && rq0Var.f43241b.size() >= rq0Var.H) {
                a();
                return;
            }
            if (rq0Var.e && !containsKey2) {
                i10 = rq0Var.f43243c.size();
            }
            x5Var.b(i10, z10, true);
            rq0Var.Z(intValue, searchImage);
        }
        if (!z10) {
            i11 = 2;
        }
        rq0Var.j0(i11);
        rq0Var.f43263s0.a();
    }
}
