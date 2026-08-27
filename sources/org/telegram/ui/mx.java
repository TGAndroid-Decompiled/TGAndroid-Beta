package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

public final class mx extends st0 {

    public final boolean[] f40607a;

    public final gy f40608b;

    public mx(gy gyVar, boolean[] zArr) {
        this.f40608b = gyVar;
        this.f40607a = zArr;
    }

    @Override
    public final CharSequence C(int i10) {
        gy gyVar = this.f40608b;
        if (i10 < 0 || i10 >= gyVar.f38625z2.size() || !((MediaController.PhotoEntry) gyVar.f38625z2.get(i10)).isVideo) {
            return gy.s2(gyVar);
        }
        return null;
    }

    @Override
    public final void D() {
        gy gyVar = this.f40608b;
        org.telegram.ui.Components.xp0 xp0Var = gyVar.C2;
        if (xp0Var != null) {
            xp0Var.i(((org.telegram.ui.ActionBar.n2) gyVar).currentAccount, gyVar.f38625z2);
        }
    }

    @Override
    public final cu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        gy gyVar = this.f40608b;
        org.telegram.ui.Components.xp0 xp0Var = gyVar.C2;
        org.telegram.ui.Components.n9 n9VarF = xp0Var != null ? xp0Var.f(i10) : null;
        if (n9VarF == null) {
            return null;
        }
        int[] iArr = new int[2];
        n9VarF.getLocationInWindow(iArr);
        cu0 cu0Var = new cu0();
        cu0Var.f37154b = iArr[0];
        cu0Var.f37155c = iArr[1];
        cu0Var.d = gyVar.C2;
        ImageReceiver imageReceiver = n9VarF.getImageReceiver();
        cu0Var.f37153a = imageReceiver;
        cu0Var.f37156e = imageReceiver.getBitmapSafe();
        cu0Var.f37161k = n9VarF.getScaleX();
        cu0Var.h = new int[]{AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f)};
        return cu0Var;
    }

    @Override
    public final long a() {
        gy gyVar = this.f40608b;
        if (gyVar.E2.isEmpty()) {
            return 0L;
        }
        return ((Long) gyVar.E2.get(0)).longValue();
    }

    @Override
    public final boolean b() {
        gy gyVar = this.f40608b;
        if (gyVar.E2.isEmpty()) {
            return false;
        }
        ArrayList arrayList = gyVar.E2;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            long jLongValue = ((Long) obj).longValue();
            if (DialogObject.isEncryptedDialog(jLongValue) || gyVar.getMessagesController().getSendPaidMessagesStars(jLongValue) > 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final CharSequence b0(int i10) {
        gy gyVar = this.f40608b;
        ArrayList arrayList = gyVar.f38625z2;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        int size = gyVar.f38625z2.size();
        if (size == 1) {
            return LocaleController.getString(((MediaController.PhotoEntry) gyVar.f38625z2.get(0)).isVideo ? R.string.AttachVideo : R.string.AttachPhoto);
        }
        ArrayList arrayList2 = gyVar.f38625z2;
        int size2 = arrayList2.size();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i13 < size2) {
            Object obj = arrayList2.get(i13);
            i13++;
            if (((MediaController.PhotoEntry) obj).isVideo) {
                i11++;
            } else {
                i12++;
            }
        }
        if (i11 == 0) {
            return LocaleController.formatPluralString("ShareSendPhotos", size, new Object[0]);
        }
        return i12 == 0 ? LocaleController.formatPluralString("ShareSendVideos", size, new Object[0]) : LocaleController.formatPluralString("ShareSendItems", size, new Object[0]);
    }

    @Override
    public final void e(CharSequence charSequence) {
        gy gyVar = this.f40608b;
        rw rwVar = gyVar.f38615x1;
        if (rwVar != null) {
            rwVar.setFieldText(charSequence);
        }
        ArrayList arrayList = gyVar.f38625z2;
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((MediaController.PhotoEntry) obj).caption = charSequence;
            }
        }
    }

    @Override
    public final boolean h() {
        TLRPC.User user;
        gy gyVar = this.f40608b;
        if (gyVar.E2.isEmpty()) {
            return false;
        }
        MessagesController messagesController = gyVar.getMessagesController();
        ArrayList arrayList = gyVar.E2;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Long l10 = (Long) obj;
            if (!DialogObject.isUserDialog(l10.longValue()) || (user = messagesController.getUser(l10)) == null || user.bot || UserObject.isUserSelf(user)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        org.telegram.ui.Components.xp0 xp0Var = this.f40608b.C2;
        org.telegram.ui.Components.n9 n9VarF = xp0Var != null ? xp0Var.f(i10) : null;
        if (n9VarF != null) {
            return n9VarF.getImageReceiver().getBitmapSafe();
        }
        return null;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        ArrayList arrayList;
        gy gyVar = this.f40608b;
        ArrayList arrayList2 = gyVar.E2;
        if (gyVar.f38615x1 != null && (arrayList = gyVar.f38625z2) != null && !arrayList.isEmpty()) {
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) gyVar.f38625z2.get(0);
            rw rwVar = gyVar.f38615x1;
            CharSequence charSequence = photoEntry.caption;
            if (charSequence == null) {
                charSequence = "";
            }
            rwVar.setFieldText(charSequence);
        }
        org.telegram.ui.Components.xp0 xp0Var = gyVar.C2;
        if (xp0Var != null) {
            xp0Var.i(((org.telegram.ui.ActionBar.n2) gyVar).currentAccount, gyVar.f38625z2);
        }
        if ((z10 && i11 == 0) || gyVar.f38621y2 == null || arrayList2.isEmpty()) {
            PhotoViewer.t1().G0(true, false);
            return;
        }
        gyVar.F2 = z10;
        gyVar.G2 = i11;
        ArrayList arrayList3 = new ArrayList();
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            arrayList3.add(MessagesStorage.TopicKey.of(((Long) arrayList2.get(i13)).longValue(), 0L));
        }
        PhotoViewer.t1().G0(true, false);
        gyVar.f38621y2.w(gyVar, arrayList3, gyVar.f38615x1.getFieldText(), false, z10, i11, i12, null);
    }

    @Override
    public final void s() {
        rw rwVar;
        org.telegram.ui.Components.xc xcVarF1;
        PhotoViewer photoViewerT1 = PhotoViewer.t1();
        CharSequence text = null;
        if (photoViewerT1.Q1() && (xcVarF1 = photoViewerT1.f1()) != null) {
            text = xcVarF1.getText();
        }
        gy gyVar = this.f40608b;
        if (text != null && (rwVar = gyVar.f38615x1) != null) {
            rwVar.setFieldText(text);
        }
        ArrayList arrayList = gyVar.f38625z2;
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((MediaController.PhotoEntry) obj).caption = text;
            }
        }
    }

    @Override
    public final boolean x(int i10) {
        return this.f40607a[i10];
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        return i10;
    }
}
