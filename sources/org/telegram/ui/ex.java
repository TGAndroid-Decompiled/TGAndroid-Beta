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
public final class ex extends gu0 {
    public final boolean[] f39193a;
    public final cy f39194b;

    public ex(cy cyVar, boolean[] zArr) {
        this.f39194b = cyVar;
        this.f39193a = zArr;
    }

    @Override
    public final CharSequence C(int i10) {
        cy cyVar = this.f39194b;
        if (i10 >= 0 && i10 < cyVar.D2.size() && ((MediaController.PhotoEntry) cyVar.D2.get(i10)).isVideo) {
            return null;
        }
        return cy.t2(cyVar);
    }

    @Override
    public final void D() {
        int i10;
        cy cyVar = this.f39194b;
        org.telegram.ui.Components.qr0 qr0Var = cyVar.G2;
        if (qr0Var != null) {
            i10 = ((org.telegram.ui.ActionBar.r2) cyVar).currentAccount;
            qr0Var.i(i10, cyVar.D2);
        }
    }

    @Override
    public final qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Components.y9 y9Var;
        cy cyVar = this.f39194b;
        org.telegram.ui.Components.qr0 qr0Var = cyVar.G2;
        if (qr0Var != null) {
            y9Var = qr0Var.f(i10);
        } else {
            y9Var = null;
        }
        if (y9Var == null) {
            return null;
        }
        int[] iArr = new int[2];
        y9Var.getLocationInWindow(iArr);
        qu0 qu0Var = new qu0();
        qu0Var.f42920b = iArr[0];
        qu0Var.f42921c = iArr[1];
        qu0Var.d = cyVar.G2;
        ImageReceiver imageReceiver = y9Var.getImageReceiver();
        qu0Var.f42919a = imageReceiver;
        qu0Var.e = imageReceiver.getBitmapSafe();
        qu0Var.f42926k = y9Var.getScaleX();
        qu0Var.h = new int[]{AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f)};
        return qu0Var;
    }

    @Override
    public final int H() {
        ArrayList arrayList = this.f39194b.D2;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override
    public final boolean I() {
        return this.f39194b.u3();
    }

    @Override
    public final long a() {
        cy cyVar = this.f39194b;
        if (cyVar.I2.isEmpty()) {
            return 0L;
        }
        return ((Long) cyVar.I2.get(0)).longValue();
    }

    @Override
    public final boolean b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ex.b():boolean");
    }

    @Override
    public final CharSequence c0(int i10) {
        int i11;
        cy cyVar = this.f39194b;
        ArrayList arrayList = cyVar.D2;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = cyVar.D2.size();
            if (size == 1) {
                if (((MediaController.PhotoEntry) cyVar.D2.get(0)).isVideo) {
                    i11 = R.string.AttachVideo;
                } else {
                    i11 = R.string.AttachPhoto;
                }
                return LocaleController.getString(i11);
            }
            ArrayList arrayList2 = cyVar.D2;
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
        cy cyVar = this.f39194b;
        jw jwVar = cyVar.B1;
        if (jwVar != null) {
            jwVar.setFieldText(charSequence);
        }
        ArrayList arrayList = cyVar.D2;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ex.h():boolean");
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        org.telegram.ui.Components.y9 y9Var;
        org.telegram.ui.Components.qr0 qr0Var = this.f39194b.G2;
        if (qr0Var != null) {
            y9Var = qr0Var.f(i10);
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
        cy cyVar = this.f39194b;
        ArrayList arrayList2 = cyVar.I2;
        if (cyVar.B1 != null && (arrayList = cyVar.D2) != null && !arrayList.isEmpty()) {
            jw jwVar = cyVar.B1;
            CharSequence charSequence = ((MediaController.PhotoEntry) cyVar.D2.get(0)).caption;
            if (charSequence == null) {
                charSequence = "";
            }
            jwVar.setFieldText(charSequence);
        }
        org.telegram.ui.Components.qr0 qr0Var = cyVar.G2;
        if (qr0Var != null) {
            i13 = ((org.telegram.ui.ActionBar.r2) cyVar).currentAccount;
            qr0Var.i(i13, cyVar.D2);
        }
        if ((!z10 || i11 != 0 || z11) && cyVar.C2 != null && !arrayList2.isEmpty()) {
            cyVar.J2 = z10;
            cyVar.K2 = i11;
            cyVar.M2 = z11;
            ArrayList arrayList3 = new ArrayList();
            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                arrayList3.add(MessagesStorage.TopicKey.of(((Long) arrayList2.get(i14)).longValue(), 0L));
            }
            PhotoViewer.u1().H0(true, false);
            cyVar.C2.v(cyVar, arrayList3, cyVar.B1.getFieldText(), false, z10, i11, i12, null);
            return;
        }
        PhotoViewer.u1().H0(true, false);
    }

    @Override
    public final void s() {
        jw jwVar;
        org.telegram.ui.Components.jd g12;
        PhotoViewer u12 = PhotoViewer.u1();
        CharSequence charSequence = null;
        if (u12.T1() && (g12 = u12.g1()) != null) {
            charSequence = g12.getText();
        }
        cy cyVar = this.f39194b;
        if (charSequence != null && (jwVar = cyVar.B1) != null) {
            jwVar.setFieldText(charSequence);
        }
        ArrayList arrayList = cyVar.D2;
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
        return this.f39193a[i10];
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        return i10;
    }
}
