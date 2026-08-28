package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class jx extends rt0 {
    public final boolean[] f39643a;
    public final dy f39644b;

    public jx(dy dyVar, boolean[] zArr) {
        this.f39644b = dyVar;
        this.f39643a = zArr;
    }

    @Override
    public final CharSequence C(int i9) {
        dy dyVar = this.f39644b;
        if (i9 >= 0 && i9 < dyVar.f37756z2.size() && ((MediaController.PhotoEntry) dyVar.f37756z2.get(i9)).isVideo) {
            return null;
        }
        return dy.s2(dyVar);
    }

    @Override
    public final void D() {
        int i9;
        dy dyVar = this.f39644b;
        org.telegram.ui.Components.wp0 wp0Var = dyVar.C2;
        if (wp0Var != null) {
            i9 = ((org.telegram.ui.ActionBar.o2) dyVar).currentAccount;
            wp0Var.i(i9, dyVar.f37756z2);
        }
    }

    @Override
    public final bu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i9, boolean z10, boolean z11) {
        org.telegram.ui.Components.o9 o9Var;
        dy dyVar = this.f39644b;
        org.telegram.ui.Components.wp0 wp0Var = dyVar.C2;
        if (wp0Var != null) {
            o9Var = wp0Var.f(i9);
        } else {
            o9Var = null;
        }
        if (o9Var == null) {
            return null;
        }
        int[] iArr = new int[2];
        o9Var.getLocationInWindow(iArr);
        bu0 bu0Var = new bu0();
        bu0Var.f36979b = iArr[0];
        bu0Var.f36980c = iArr[1];
        bu0Var.d = dyVar.C2;
        ImageReceiver imageReceiver = o9Var.getImageReceiver();
        bu0Var.f36978a = imageReceiver;
        bu0Var.f36981e = imageReceiver.getBitmapSafe();
        bu0Var.f36986k = o9Var.getScaleX();
        bu0Var.h = new int[]{AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f)};
        return bu0Var;
    }

    @Override
    public final long a() {
        dy dyVar = this.f39644b;
        if (dyVar.E2.isEmpty()) {
            return 0L;
        }
        return ((Long) dyVar.E2.get(0)).longValue();
    }

    @Override
    public final boolean b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jx.b():boolean");
    }

    @Override
    public final CharSequence b0(int i9) {
        int i10;
        dy dyVar = this.f39644b;
        ArrayList arrayList = dyVar.f37756z2;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = dyVar.f37756z2.size();
            if (size == 1) {
                if (((MediaController.PhotoEntry) dyVar.f37756z2.get(0)).isVideo) {
                    i10 = R.string.AttachVideo;
                } else {
                    i10 = R.string.AttachPhoto;
                }
                return LocaleController.getString(i10);
            }
            ArrayList arrayList2 = dyVar.f37756z2;
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
            if (i12 == 0) {
                return LocaleController.formatPluralString("ShareSendVideos", size, new Object[0]);
            }
            return LocaleController.formatPluralString("ShareSendItems", size, new Object[0]);
        }
        return null;
    }

    @Override
    public final void e(CharSequence charSequence) {
        dy dyVar = this.f39644b;
        ow owVar = dyVar.f37746x1;
        if (owVar != null) {
            owVar.setFieldText(charSequence);
        }
        ArrayList arrayList = dyVar.f37756z2;
        if (arrayList != null) {
            int size = arrayList.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayList.get(i9);
                i9++;
                ((MediaController.PhotoEntry) obj).caption = charSequence;
            }
        }
    }

    @Override
    public final boolean h() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jx.h():boolean");
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i9) {
        org.telegram.ui.Components.o9 o9Var;
        org.telegram.ui.Components.wp0 wp0Var = this.f39644b.C2;
        if (wp0Var != null) {
            o9Var = wp0Var.f(i9);
        } else {
            o9Var = null;
        }
        if (o9Var == null) {
            return null;
        }
        return o9Var.getImageReceiver().getBitmapSafe();
    }

    @Override
    public final void o(int i9, VideoEditedInfo videoEditedInfo, boolean z10, int i10, int i11, boolean z11) {
        int i12;
        ArrayList arrayList;
        dy dyVar = this.f39644b;
        ArrayList arrayList2 = dyVar.E2;
        if (dyVar.f37746x1 != null && (arrayList = dyVar.f37756z2) != null && !arrayList.isEmpty()) {
            ow owVar = dyVar.f37746x1;
            CharSequence charSequence = ((MediaController.PhotoEntry) dyVar.f37756z2.get(0)).caption;
            if (charSequence == null) {
                charSequence = "";
            }
            owVar.setFieldText(charSequence);
        }
        org.telegram.ui.Components.wp0 wp0Var = dyVar.C2;
        if (wp0Var != null) {
            i12 = ((org.telegram.ui.ActionBar.o2) dyVar).currentAccount;
            wp0Var.i(i12, dyVar.f37756z2);
        }
        if ((!z10 || i10 != 0) && dyVar.f37752y2 != null && !arrayList2.isEmpty()) {
            dyVar.F2 = z10;
            dyVar.G2 = i10;
            ArrayList arrayList3 = new ArrayList();
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                arrayList3.add(MessagesStorage.TopicKey.of(((Long) arrayList2.get(i13)).longValue(), 0L));
            }
            PhotoViewer.t1().F0(true, false);
            dyVar.f37752y2.v(dyVar, arrayList3, dyVar.f37746x1.getFieldText(), false, z10, i10, i11, null);
            return;
        }
        PhotoViewer.t1().F0(true, false);
    }

    @Override
    public final void s() {
        ow owVar;
        org.telegram.ui.Components.ad f12;
        PhotoViewer t12 = PhotoViewer.t1();
        CharSequence charSequence = null;
        if (t12.Q1() && (f12 = t12.f1()) != null) {
            charSequence = f12.getText();
        }
        dy dyVar = this.f39644b;
        if (charSequence != null && (owVar = dyVar.f37746x1) != null) {
            owVar.setFieldText(charSequence);
        }
        ArrayList arrayList = dyVar.f37756z2;
        if (arrayList != null) {
            int size = arrayList.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayList.get(i9);
                i9++;
                ((MediaController.PhotoEntry) obj).caption = charSequence;
            }
        }
    }

    @Override
    public final boolean x(int i9) {
        return this.f39643a[i9];
    }

    @Override
    public final int k(int i9, VideoEditedInfo videoEditedInfo) {
        return i9;
    }
}
