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
public final class hx extends iu0 {
    public final boolean[] f40006a;
    public final ey f40007b;

    public hx(ey eyVar, boolean[] zArr) {
        this.f40007b = eyVar;
        this.f40006a = zArr;
    }

    @Override
    public final CharSequence C(int i10) {
        ey eyVar = this.f40007b;
        if (i10 >= 0 && i10 < eyVar.D2.size() && ((MediaController.PhotoEntry) eyVar.D2.get(i10)).isVideo) {
            return null;
        }
        return ey.t2(eyVar);
    }

    @Override
    public final void D() {
        int i10;
        ey eyVar = this.f40007b;
        org.telegram.ui.Components.rr0 rr0Var = eyVar.G2;
        if (rr0Var != null) {
            i10 = ((org.telegram.ui.ActionBar.r2) eyVar).currentAccount;
            rr0Var.i(i10, eyVar.D2);
        }
    }

    @Override
    public final su0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Components.y9 y9Var;
        ey eyVar = this.f40007b;
        org.telegram.ui.Components.rr0 rr0Var = eyVar.G2;
        if (rr0Var != null) {
            y9Var = rr0Var.f(i10);
        } else {
            y9Var = null;
        }
        if (y9Var == null) {
            return null;
        }
        int[] iArr = new int[2];
        y9Var.getLocationInWindow(iArr);
        su0 su0Var = new su0();
        su0Var.f43407b = iArr[0];
        su0Var.f43408c = iArr[1];
        su0Var.d = eyVar.G2;
        ImageReceiver imageReceiver = y9Var.getImageReceiver();
        su0Var.f43406a = imageReceiver;
        su0Var.e = imageReceiver.getBitmapSafe();
        su0Var.f43413k = y9Var.getScaleX();
        su0Var.h = new int[]{AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f)};
        return su0Var;
    }

    @Override
    public final int H() {
        ArrayList arrayList = this.f40007b.D2;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override
    public final boolean I() {
        return this.f40007b.u3();
    }

    @Override
    public final long a() {
        ey eyVar = this.f40007b;
        if (eyVar.I2.isEmpty()) {
            return 0L;
        }
        return ((Long) eyVar.I2.get(0)).longValue();
    }

    @Override
    public final boolean b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hx.b():boolean");
    }

    @Override
    public final CharSequence c0(int i10) {
        int i11;
        ey eyVar = this.f40007b;
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
        ey eyVar = this.f40007b;
        lw lwVar = eyVar.B1;
        if (lwVar != null) {
            lwVar.setFieldText(charSequence);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hx.h():boolean");
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        org.telegram.ui.Components.y9 y9Var;
        org.telegram.ui.Components.rr0 rr0Var = this.f40007b.G2;
        if (rr0Var != null) {
            y9Var = rr0Var.f(i10);
        } else {
            y9Var = null;
        }
        if (y9Var == null) {
            return null;
        }
        return y9Var.getImageReceiver().getBitmapSafe();
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        int i13;
        ArrayList arrayList;
        ey eyVar = this.f40007b;
        ArrayList arrayList2 = eyVar.I2;
        if (eyVar.B1 != null && (arrayList = eyVar.D2) != null && !arrayList.isEmpty()) {
            lw lwVar = eyVar.B1;
            CharSequence charSequence = ((MediaController.PhotoEntry) eyVar.D2.get(0)).caption;
            if (charSequence == null) {
                charSequence = "";
            }
            lwVar.setFieldText(charSequence);
        }
        org.telegram.ui.Components.rr0 rr0Var = eyVar.G2;
        if (rr0Var != null) {
            i13 = ((org.telegram.ui.ActionBar.r2) eyVar).currentAccount;
            rr0Var.i(i13, eyVar.D2);
        }
        if ((!z10 || i11 != 0 || z11) && eyVar.C2 != null && !arrayList2.isEmpty()) {
            eyVar.J2 = z10;
            eyVar.K2 = i11;
            eyVar.M2 = z11;
            ArrayList arrayList3 = new ArrayList();
            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                arrayList3.add(MessagesStorage.TopicKey.of(((Long) arrayList2.get(i14)).longValue(), 0L));
            }
            PhotoViewer.v1().H0(true, false);
            eyVar.C2.v(eyVar, arrayList3, eyVar.B1.getFieldText(), false, z10, i11, i12, null);
            return;
        }
        PhotoViewer.v1().H0(true, false);
    }

    @Override
    public final void s() {
        lw lwVar;
        org.telegram.ui.Components.jd h12;
        PhotoViewer v12 = PhotoViewer.v1();
        CharSequence charSequence = null;
        if (v12.U1() && (h12 = v12.h1()) != null) {
            charSequence = h12.getText();
        }
        ey eyVar = this.f40007b;
        if (charSequence != null && (lwVar = eyVar.B1) != null) {
            lwVar.setFieldText(charSequence);
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
        return this.f40006a[i10];
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        return i10;
    }
}
