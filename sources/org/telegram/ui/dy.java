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
public final class dy extends vu0 {
    public final boolean[] f33235a;
    public final wy f33236b;

    public dy(wy wyVar, boolean[] zArr) {
        this.f33236b = wyVar;
        this.f33235a = zArr;
    }

    @Override
    public final CharSequence C(int i10) {
        wy wyVar = this.f33236b;
        if (i10 >= 0 && i10 < wyVar.D2.size() && ((MediaController.PhotoEntry) wyVar.D2.get(i10)).isVideo) {
            return null;
        }
        return wy.s2(wyVar);
    }

    @Override
    public final void D() {
        int i10;
        wy wyVar = this.f33236b;
        org.telegram.ui.Components.nq0 nq0Var = wyVar.G2;
        if (nq0Var != null) {
            i10 = ((org.telegram.ui.ActionBar.o2) wyVar).currentAccount;
            nq0Var.i(i10, wyVar.D2);
        }
    }

    @Override
    public final fv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Components.u9 u9Var;
        wy wyVar = this.f33236b;
        org.telegram.ui.Components.nq0 nq0Var = wyVar.G2;
        if (nq0Var != null) {
            u9Var = nq0Var.f(i10);
        } else {
            u9Var = null;
        }
        if (u9Var == null) {
            return null;
        }
        int[] iArr = new int[2];
        u9Var.getLocationInWindow(iArr);
        fv0 fv0Var = new fv0();
        fv0Var.f33764b = iArr[0];
        fv0Var.f33765c = iArr[1];
        fv0Var.d = wyVar.G2;
        ImageReceiver imageReceiver = u9Var.getImageReceiver();
        fv0Var.f33763a = imageReceiver;
        fv0Var.e = imageReceiver.getBitmapSafe();
        fv0Var.f33770k = u9Var.getScaleX();
        fv0Var.h = new int[]{AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f)};
        return fv0Var;
    }

    @Override
    public final long a() {
        wy wyVar = this.f33236b;
        if (wyVar.I2.isEmpty()) {
            return 0L;
        }
        return ((Long) wyVar.I2.get(0)).longValue();
    }

    @Override
    public final boolean b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dy.b():boolean");
    }

    @Override
    public final CharSequence b0(int i10) {
        int i11;
        wy wyVar = this.f33236b;
        ArrayList arrayList = wyVar.D2;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = wyVar.D2.size();
            if (size == 1) {
                if (((MediaController.PhotoEntry) wyVar.D2.get(0)).isVideo) {
                    i11 = R.string.AttachVideo;
                } else {
                    i11 = R.string.AttachPhoto;
                }
                return LocaleController.getString(i11);
            }
            ArrayList arrayList2 = wyVar.D2;
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
        wy wyVar = this.f33236b;
        gx gxVar = wyVar.B1;
        if (gxVar != null) {
            gxVar.setFieldText(charSequence);
        }
        ArrayList arrayList = wyVar.D2;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dy.h():boolean");
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        org.telegram.ui.Components.u9 u9Var;
        org.telegram.ui.Components.nq0 nq0Var = this.f33236b.G2;
        if (nq0Var != null) {
            u9Var = nq0Var.f(i10);
        } else {
            u9Var = null;
        }
        if (u9Var == null) {
            return null;
        }
        return u9Var.getImageReceiver().getBitmapSafe();
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        int i13;
        ArrayList arrayList;
        wy wyVar = this.f33236b;
        ArrayList arrayList2 = wyVar.I2;
        if (wyVar.B1 != null && (arrayList = wyVar.D2) != null && !arrayList.isEmpty()) {
            gx gxVar = wyVar.B1;
            CharSequence charSequence = ((MediaController.PhotoEntry) wyVar.D2.get(0)).caption;
            if (charSequence == null) {
                charSequence = "";
            }
            gxVar.setFieldText(charSequence);
        }
        org.telegram.ui.Components.nq0 nq0Var = wyVar.G2;
        if (nq0Var != null) {
            i13 = ((org.telegram.ui.ActionBar.o2) wyVar).currentAccount;
            nq0Var.i(i13, wyVar.D2);
        }
        if ((!z10 || i11 != 0) && wyVar.C2 != null && !arrayList2.isEmpty()) {
            wyVar.J2 = z10;
            wyVar.K2 = i11;
            ArrayList arrayList3 = new ArrayList();
            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                arrayList3.add(MessagesStorage.TopicKey.of(((Long) arrayList2.get(i14)).longValue(), 0L));
            }
            PhotoViewer.t1().G0(true, false);
            wyVar.C2.u(wyVar, arrayList3, wyVar.B1.getFieldText(), false, z10, i11, i12, null);
            return;
        }
        PhotoViewer.t1().G0(true, false);
    }

    @Override
    public final void s() {
        gx gxVar;
        org.telegram.ui.Components.jd f12;
        PhotoViewer t12 = PhotoViewer.t1();
        CharSequence charSequence = null;
        if (t12.Q1() && (f12 = t12.f1()) != null) {
            charSequence = f12.getText();
        }
        wy wyVar = this.f33236b;
        if (charSequence != null && (gxVar = wyVar.B1) != null) {
            gxVar.setFieldText(charSequence);
        }
        ArrayList arrayList = wyVar.D2;
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
        return this.f33235a[i10];
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        return i10;
    }
}
