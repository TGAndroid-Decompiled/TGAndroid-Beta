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
public final class kx extends cu0 {
    public final boolean[] f39083a;
    public final ey f39084b;

    public kx(ey eyVar, boolean[] zArr) {
        this.f39084b = eyVar;
        this.f39083a = zArr;
    }

    @Override
    public final CharSequence C(int i10) {
        ey eyVar = this.f39084b;
        if (i10 >= 0 && i10 < eyVar.D2.size() && ((MediaController.PhotoEntry) eyVar.D2.get(i10)).isVideo) {
            return null;
        }
        return ey.o2(eyVar);
    }

    @Override
    public final void D() {
        int i10;
        ey eyVar = this.f39084b;
        org.telegram.ui.Components.nr0 nr0Var = eyVar.G2;
        if (nr0Var != null) {
            i10 = ((org.telegram.ui.ActionBar.o2) eyVar).currentAccount;
            nr0Var.i(i10, eyVar.D2);
        }
    }

    @Override
    public final mu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Components.w9 w9Var;
        ey eyVar = this.f39084b;
        org.telegram.ui.Components.nr0 nr0Var = eyVar.G2;
        if (nr0Var != null) {
            w9Var = nr0Var.f(i10);
        } else {
            w9Var = null;
        }
        if (w9Var == null) {
            return null;
        }
        int[] iArr = new int[2];
        w9Var.getLocationInWindow(iArr);
        mu0 mu0Var = new mu0();
        mu0Var.f39693b = iArr[0];
        mu0Var.f39694c = iArr[1];
        mu0Var.d = eyVar.G2;
        ImageReceiver imageReceiver = w9Var.getImageReceiver();
        mu0Var.f39692a = imageReceiver;
        mu0Var.e = imageReceiver.getBitmapSafe();
        mu0Var.f39699k = w9Var.getScaleX();
        mu0Var.h = new int[]{AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f)};
        return mu0Var;
    }

    @Override
    public final int H() {
        ArrayList arrayList = this.f39084b.D2;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override
    public final boolean I() {
        return this.f39084b.k3();
    }

    @Override
    public final long a() {
        ey eyVar = this.f39084b;
        if (eyVar.I2.isEmpty()) {
            return 0L;
        }
        return ((Long) eyVar.I2.get(0)).longValue();
    }

    @Override
    public final boolean b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kx.b():boolean");
    }

    @Override
    public final CharSequence c0(int i10) {
        int i11;
        ey eyVar = this.f39084b;
        ArrayList arrayList = eyVar.D2;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = eyVar.D2.size();
            if (size == 1) {
                if (((MediaController.PhotoEntry) eyVar.D2.get(0)).isVideo) {
                    i11 = R.string.AttachVideo;
                } else {
                    i11 = R.string.AttachPhoto;
                }
                return LocaleController.getString(i11);
            }
            ArrayList arrayList2 = eyVar.D2;
            int size2 = arrayList2.size();
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (i14 < size2) {
                Object obj = arrayList2.get(i14);
                i14++;
                if (((MediaController.PhotoEntry) obj).isVideo) {
                    i12++;
                } else {
                    i13++;
                }
            }
            if (i12 == 0) {
                return LocaleController.formatPluralString("ShareSendPhotos", size, new Object[0]);
            }
            if (i13 == 0) {
                return LocaleController.formatPluralString("ShareSendVideos", size, new Object[0]);
            }
            return LocaleController.formatPluralString("ShareSendItems", size, new Object[0]);
        }
        return null;
    }

    @Override
    public final void e(CharSequence charSequence) {
        ey eyVar = this.f39084b;
        ow owVar = eyVar.B1;
        if (owVar != null) {
            owVar.setFieldText(charSequence);
        }
        ArrayList arrayList = eyVar.D2;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kx.h():boolean");
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        org.telegram.ui.Components.w9 w9Var;
        org.telegram.ui.Components.nr0 nr0Var = this.f39084b.G2;
        if (nr0Var != null) {
            w9Var = nr0Var.f(i10);
        } else {
            w9Var = null;
        }
        if (w9Var == null) {
            return null;
        }
        return w9Var.getImageReceiver().getBitmapSafe();
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        int i13;
        ArrayList arrayList;
        ey eyVar = this.f39084b;
        ArrayList arrayList2 = eyVar.I2;
        if (eyVar.B1 != null && (arrayList = eyVar.D2) != null && !arrayList.isEmpty()) {
            ow owVar = eyVar.B1;
            CharSequence charSequence = ((MediaController.PhotoEntry) eyVar.D2.get(0)).caption;
            if (charSequence == null) {
                charSequence = "";
            }
            owVar.setFieldText(charSequence);
        }
        org.telegram.ui.Components.nr0 nr0Var = eyVar.G2;
        if (nr0Var != null) {
            i13 = ((org.telegram.ui.ActionBar.o2) eyVar).currentAccount;
            nr0Var.i(i13, eyVar.D2);
        }
        if ((!z10 || i11 != 0 || z11) && eyVar.C2 != null && !arrayList2.isEmpty()) {
            eyVar.J2 = z10;
            eyVar.K2 = i11;
            eyVar.M2 = z11;
            ArrayList arrayList3 = new ArrayList();
            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                arrayList3.add(MessagesStorage.TopicKey.of(((Long) arrayList2.get(i14)).longValue(), 0L));
            }
            PhotoViewer.u1().H0(true, false);
            eyVar.C2.w(eyVar, arrayList3, eyVar.B1.getFieldText(), false, z10, i11, i12, null);
            return;
        }
        PhotoViewer.u1().H0(true, false);
    }

    @Override
    public final void s() {
        ow owVar;
        org.telegram.ui.Components.kd g12;
        PhotoViewer u12 = PhotoViewer.u1();
        CharSequence charSequence = null;
        if (u12.T1() && (g12 = u12.g1()) != null) {
            charSequence = g12.getText();
        }
        ey eyVar = this.f39084b;
        if (charSequence != null && (owVar = eyVar.B1) != null) {
            owVar.setFieldText(charSequence);
        }
        ArrayList arrayList = eyVar.D2;
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
    public final boolean x(int i10) {
        return this.f39083a[i10];
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        return i10;
    }
}
