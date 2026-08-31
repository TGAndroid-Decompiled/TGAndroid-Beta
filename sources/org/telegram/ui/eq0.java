package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class eq0 implements org.telegram.ui.Cells.s5 {
    public final fq0 f36664a;

    public eq0(fq0 fq0Var) {
        this.f36664a = fq0Var;
    }

    public final void a() {
        xn xnVar;
        TLRPC.Chat chat;
        hq0 hq0Var = this.f36664a.d;
        if (hq0Var.F && (xnVar = hq0Var.R) != null && (chat = xnVar.f43165e) != null && !ChatObject.hasAdminRights(chat) && chat.slowmode_enabled && hq0Var.T != 2) {
            org.telegram.ui.Components.z4.u0(hq0Var, LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError), null);
            if (hq0Var.T == 1) {
                hq0Var.T = 2;
            }
        }
    }

    @Override
    public final void b(org.telegram.ui.Cells.t5 t5Var) {
        boolean z4;
        int intValue = ((Integer) t5Var.getTag()).intValue();
        hq0 hq0Var = this.f36664a.d;
        MediaController.AlbumEntry albumEntry = hq0Var.G;
        int i10 = -1;
        int i11 = 1;
        if (albumEntry != null) {
            MediaController.PhotoEntry photoEntry = albumEntry.photos.get(intValue);
            boolean containsKey = hq0Var.f37573b.containsKey(Integer.valueOf(photoEntry.imageId));
            z4 = !containsKey;
            if (!containsKey && hq0Var.E > 0 && hq0Var.f37573b.size() >= hq0Var.E) {
                a();
                return;
            }
            if (hq0Var.f37578e && !containsKey) {
                i10 = hq0Var.f37575c.size();
            }
            t5Var.b(i10, z4, true);
            hq0Var.Y(intValue, photoEntry);
        } else {
            AndroidUtilities.hideKeyboard(hq0Var.getParentActivity().getCurrentFocus());
            MediaController.SearchImage searchImage = (MediaController.SearchImage) hq0Var.f37580f.get(intValue);
            boolean containsKey2 = hq0Var.f37573b.containsKey(searchImage.f18049id);
            z4 = !containsKey2;
            if (!containsKey2 && hq0Var.E > 0 && hq0Var.f37573b.size() >= hq0Var.E) {
                a();
                return;
            }
            if (hq0Var.f37578e && !containsKey2) {
                i10 = hq0Var.f37575c.size();
            }
            t5Var.b(i10, z4, true);
            hq0Var.Y(intValue, searchImage);
        }
        if (!z4) {
            i11 = 2;
        }
        hq0Var.i0(i11);
        hq0Var.f37591p0.a();
    }
}
