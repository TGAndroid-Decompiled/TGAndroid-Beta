package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class jq0 implements org.telegram.ui.Cells.s5 {
    public final kq0 f38111a;

    public jq0(kq0 kq0Var) {
        this.f38111a = kq0Var;
    }

    public final void a() {
        xn xnVar;
        TLRPC.Chat chat;
        mq0 mq0Var = this.f38111a.d;
        if (mq0Var.F && (xnVar = mq0Var.R) != null && (chat = xnVar.f43143e) != null && !ChatObject.hasAdminRights(chat) && chat.slowmode_enabled && mq0Var.T != 2) {
            org.telegram.ui.Components.z4.u0(mq0Var, LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError), null);
            if (mq0Var.T == 1) {
                mq0Var.T = 2;
            }
        }
    }

    @Override
    public final void b(org.telegram.ui.Cells.t5 t5Var) {
        boolean z4;
        int intValue = ((Integer) t5Var.getTag()).intValue();
        mq0 mq0Var = this.f38111a.d;
        MediaController.AlbumEntry albumEntry = mq0Var.G;
        int i10 = -1;
        int i11 = 1;
        if (albumEntry != null) {
            MediaController.PhotoEntry photoEntry = albumEntry.photos.get(intValue);
            boolean containsKey = mq0Var.f39033b.containsKey(Integer.valueOf(photoEntry.imageId));
            z4 = !containsKey;
            if (!containsKey && mq0Var.E > 0 && mq0Var.f39033b.size() >= mq0Var.E) {
                a();
                return;
            }
            if (mq0Var.f39038e && !containsKey) {
                i10 = mq0Var.f39035c.size();
            }
            t5Var.b(i10, z4, true);
            mq0Var.Y(intValue, photoEntry);
        } else {
            AndroidUtilities.hideKeyboard(mq0Var.getParentActivity().getCurrentFocus());
            MediaController.SearchImage searchImage = (MediaController.SearchImage) mq0Var.f39040f.get(intValue);
            boolean containsKey2 = mq0Var.f39033b.containsKey(searchImage.f18051id);
            z4 = !containsKey2;
            if (!containsKey2 && mq0Var.E > 0 && mq0Var.f39033b.size() >= mq0Var.E) {
                a();
                return;
            }
            if (mq0Var.f39038e && !containsKey2) {
                i10 = mq0Var.f39035c.size();
            }
            t5Var.b(i10, z4, true);
            mq0Var.Y(intValue, searchImage);
        }
        if (!z4) {
            i11 = 2;
        }
        mq0Var.i0(i11);
        mq0Var.f39051p0.a();
    }
}
