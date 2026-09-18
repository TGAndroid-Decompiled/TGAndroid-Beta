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
public final class ay extends tu0 {
    public final boolean[] f32198a;
    public final uy f32199b;

    public ay(uy uyVar, boolean[] zArr) {
        this.f32199b = uyVar;
        this.f32198a = zArr;
    }

    @Override
    public final CharSequence C(int i10) {
        uy uyVar = this.f32199b;
        if (i10 >= 0 && i10 < uyVar.D2.size() && ((MediaController.PhotoEntry) uyVar.D2.get(i10)).isVideo) {
            return null;
        }
        return uy.s2(uyVar);
    }

    @Override
    public final void D() {
        int i10;
        uy uyVar = this.f32199b;
        org.telegram.ui.Components.ar0 ar0Var = uyVar.G2;
        if (ar0Var != null) {
            i10 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
            ar0Var.i(i10, uyVar.D2);
        }
    }

    @Override
    public final dv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Components.w9 w9Var;
        uy uyVar = this.f32199b;
        org.telegram.ui.Components.ar0 ar0Var = uyVar.G2;
        if (ar0Var != null) {
            w9Var = ar0Var.f(i10);
        } else {
            w9Var = null;
        }
        if (w9Var == null) {
            return null;
        }
        int[] iArr = new int[2];
        w9Var.getLocationInWindow(iArr);
        dv0 dv0Var = new dv0();
        dv0Var.f33093b = iArr[0];
        dv0Var.f33094c = iArr[1];
        dv0Var.d = uyVar.G2;
        ImageReceiver imageReceiver = w9Var.getImageReceiver();
        dv0Var.f33092a = imageReceiver;
        dv0Var.e = imageReceiver.getBitmapSafe();
        dv0Var.f33099k = w9Var.getScaleX();
        dv0Var.h = new int[]{AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f)};
        return dv0Var;
    }

    @Override
    public final long a() {
        uy uyVar = this.f32199b;
        if (uyVar.I2.isEmpty()) {
            return 0L;
        }
        return ((Long) uyVar.I2.get(0)).longValue();
    }

    @Override
    public final boolean b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ay.b():boolean");
    }

    @Override
    public final CharSequence b0(int i10) {
        int i11;
        uy uyVar = this.f32199b;
        ArrayList arrayList = uyVar.D2;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = uyVar.D2.size();
            if (size == 1) {
                if (((MediaController.PhotoEntry) uyVar.D2.get(0)).isVideo) {
                    i11 = R.string.AttachVideo;
                } else {
                    i11 = R.string.AttachPhoto;
                }
                return LocaleController.getString(i11);
            }
            ArrayList arrayList2 = uyVar.D2;
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
        uy uyVar = this.f32199b;
        ex exVar = uyVar.B1;
        if (exVar != null) {
            exVar.setFieldText(charSequence);
        }
        ArrayList arrayList = uyVar.D2;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ay.h():boolean");
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        org.telegram.ui.Components.w9 w9Var;
        org.telegram.ui.Components.ar0 ar0Var = this.f32199b.G2;
        if (ar0Var != null) {
            w9Var = ar0Var.f(i10);
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
        uy uyVar = this.f32199b;
        ArrayList arrayList2 = uyVar.I2;
        if (uyVar.B1 != null && (arrayList = uyVar.D2) != null && !arrayList.isEmpty()) {
            ex exVar = uyVar.B1;
            CharSequence charSequence = ((MediaController.PhotoEntry) uyVar.D2.get(0)).caption;
            if (charSequence == null) {
                charSequence = "";
            }
            exVar.setFieldText(charSequence);
        }
        org.telegram.ui.Components.ar0 ar0Var = uyVar.G2;
        if (ar0Var != null) {
            i13 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
            ar0Var.i(i13, uyVar.D2);
        }
        if ((!z10 || i11 != 0) && uyVar.C2 != null && !arrayList2.isEmpty()) {
            uyVar.J2 = z10;
            uyVar.K2 = i11;
            ArrayList arrayList3 = new ArrayList();
            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                arrayList3.add(MessagesStorage.TopicKey.of(((Long) arrayList2.get(i14)).longValue(), 0L));
            }
            PhotoViewer.t1().G0(true, false);
            uyVar.C2.u(uyVar, arrayList3, uyVar.B1.getFieldText(), false, z10, i11, i12, null);
            return;
        }
        PhotoViewer.t1().G0(true, false);
    }

    @Override
    public final void s() {
        ex exVar;
        org.telegram.ui.Components.kd f12;
        PhotoViewer t12 = PhotoViewer.t1();
        CharSequence charSequence = null;
        if (t12.Q1() && (f12 = t12.f1()) != null) {
            charSequence = f12.getText();
        }
        uy uyVar = this.f32199b;
        if (charSequence != null && (exVar = uyVar.B1) != null) {
            exVar.setFieldText(charSequence);
        }
        ArrayList arrayList = uyVar.D2;
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
        return this.f32198a[i10];
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        return i10;
    }
}
