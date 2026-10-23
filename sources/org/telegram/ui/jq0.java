package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class jq0 implements org.telegram.ui.Cells.r5 {
    public final kq0 f38627a;

    public jq0(kq0 kq0Var) {
        this.f38627a = kq0Var;
    }

    public final void a() {
        sn snVar;
        TLRPC.Chat chat;
        mq0 mq0Var = this.f38627a.d;
        if (mq0Var.I && (snVar = mq0Var.U) != null && (chat = snVar.e) != null && !ChatObject.hasAdminRights(chat) && chat.slowmode_enabled && mq0Var.W != 2) {
            org.telegram.ui.Components.f5.u0(mq0Var, LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError), null);
            if (mq0Var.W == 1) {
                mq0Var.W = 2;
            }
        }
    }

    @Override
    public final void b(org.telegram.ui.Cells.s5 s5Var) {
        boolean z10;
        int intValue = ((Integer) s5Var.getTag()).intValue();
        mq0 mq0Var = this.f38627a.d;
        MediaController.AlbumEntry albumEntry = mq0Var.J;
        int i10 = -1;
        int i11 = 1;
        if (albumEntry != null) {
            MediaController.PhotoEntry photoEntry = albumEntry.photos.get(intValue);
            boolean containsKey = mq0Var.f39645b.containsKey(Integer.valueOf(photoEntry.imageId));
            z10 = !containsKey;
            if (!containsKey && mq0Var.H > 0 && mq0Var.f39645b.size() >= mq0Var.H) {
                a();
                return;
            }
            if (mq0Var.e && !containsKey) {
                i10 = mq0Var.f39647c.size();
            }
            s5Var.b(i10, z10, true);
            mq0Var.Y(intValue, photoEntry);
        } else {
            AndroidUtilities.hideKeyboard(mq0Var.getParentActivity().getCurrentFocus());
            MediaController.SearchImage searchImage = (MediaController.SearchImage) mq0Var.f39651f.get(intValue);
            boolean containsKey2 = mq0Var.f39645b.containsKey(searchImage.f17856id);
            z10 = !containsKey2;
            if (!containsKey2 && mq0Var.H > 0 && mq0Var.f39645b.size() >= mq0Var.H) {
                a();
                return;
            }
            if (mq0Var.e && !containsKey2) {
                i10 = mq0Var.f39647c.size();
            }
            s5Var.b(i10, z10, true);
            mq0Var.Y(intValue, searchImage);
        }
        if (!z10) {
            i11 = 2;
        }
        mq0Var.i0(i11);
        mq0Var.f39667s0.a();
    }
}
