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
public final class cy extends wu0 {
    public final boolean[] f36579a;
    public final vy f36580b;

    public cy(vy vyVar, boolean[] zArr) {
        this.f36580b = vyVar;
        this.f36579a = zArr;
    }

    @Override
    public final CharSequence C(int i10) {
        vy vyVar = this.f36580b;
        if (i10 >= 0 && i10 < vyVar.D2.size() && ((MediaController.PhotoEntry) vyVar.D2.get(i10)).isVideo) {
            return null;
        }
        return vy.p2(vyVar);
    }

    @Override
    public final void D() {
        int i10;
        vy vyVar = this.f36580b;
        org.telegram.ui.Components.xr0 xr0Var = vyVar.G2;
        if (xr0Var != null) {
            i10 = ((org.telegram.ui.ActionBar.m2) vyVar).currentAccount;
            xr0Var.i(i10, vyVar.D2);
        }
    }

    @Override
    public final gv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Components.y9 y9Var;
        vy vyVar = this.f36580b;
        org.telegram.ui.Components.xr0 xr0Var = vyVar.G2;
        if (xr0Var != null) {
            y9Var = xr0Var.f(i10);
        } else {
            y9Var = null;
        }
        if (y9Var == null) {
            return null;
        }
        int[] iArr = new int[2];
        y9Var.getLocationInWindow(iArr);
        gv0 gv0Var = new gv0();
        gv0Var.f38148b = iArr[0];
        gv0Var.f38149c = iArr[1];
        gv0Var.d = vyVar.G2;
        ImageReceiver imageReceiver = y9Var.getImageReceiver();
        gv0Var.f38147a = imageReceiver;
        gv0Var.f38150e = imageReceiver.getBitmapSafe();
        gv0Var.f38155k = y9Var.getScaleX();
        gv0Var.h = new int[]{AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f)};
        return gv0Var;
    }

    @Override
    public final long a() {
        vy vyVar = this.f36580b;
        if (vyVar.I2.isEmpty()) {
            return 0L;
        }
        return ((Long) vyVar.I2.get(0)).longValue();
    }

    @Override
    public final boolean b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cy.b():boolean");
    }

    @Override
    public final CharSequence b0(int i10) {
        int i11;
        vy vyVar = this.f36580b;
        ArrayList arrayList = vyVar.D2;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = vyVar.D2.size();
            if (size == 1) {
                if (((MediaController.PhotoEntry) vyVar.D2.get(0)).isVideo) {
                    i11 = R.string.AttachVideo;
                } else {
                    i11 = R.string.AttachPhoto;
                }
                return LocaleController.getString(i11);
            }
            ArrayList arrayList2 = vyVar.D2;
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
        vy vyVar = this.f36580b;
        fx fxVar = vyVar.B1;
        if (fxVar != null) {
            fxVar.setFieldText(charSequence);
        }
        ArrayList arrayList = vyVar.D2;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cy.h():boolean");
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        org.telegram.ui.Components.y9 y9Var;
        org.telegram.ui.Components.xr0 xr0Var = this.f36580b.G2;
        if (xr0Var != null) {
            y9Var = xr0Var.f(i10);
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
        vy vyVar = this.f36580b;
        ArrayList arrayList2 = vyVar.I2;
        if (vyVar.B1 != null && (arrayList = vyVar.D2) != null && !arrayList.isEmpty()) {
            fx fxVar = vyVar.B1;
            CharSequence charSequence = ((MediaController.PhotoEntry) vyVar.D2.get(0)).caption;
            if (charSequence == null) {
                charSequence = "";
            }
            fxVar.setFieldText(charSequence);
        }
        org.telegram.ui.Components.xr0 xr0Var = vyVar.G2;
        if (xr0Var != null) {
            i13 = ((org.telegram.ui.ActionBar.m2) vyVar).currentAccount;
            xr0Var.i(i13, vyVar.D2);
        }
        if ((!z10 || i11 != 0) && vyVar.C2 != null && !arrayList2.isEmpty()) {
            vyVar.J2 = z10;
            vyVar.K2 = i11;
            ArrayList arrayList3 = new ArrayList();
            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                arrayList3.add(MessagesStorage.TopicKey.of(((Long) arrayList2.get(i14)).longValue(), 0L));
            }
            PhotoViewer.t1().G0(true, false);
            vyVar.C2.w(vyVar, arrayList3, vyVar.B1.getFieldText(), false, z10, i11, i12, null);
            return;
        }
        PhotoViewer.t1().G0(true, false);
    }

    @Override
    public final void s() {
        fx fxVar;
        org.telegram.ui.Components.od f12;
        PhotoViewer t12 = PhotoViewer.t1();
        CharSequence charSequence = null;
        if (t12.R1() && (f12 = t12.f1()) != null) {
            charSequence = f12.getText();
        }
        vy vyVar = this.f36580b;
        if (charSequence != null && (fxVar = vyVar.B1) != null) {
            fxVar.setFieldText(charSequence);
        }
        ArrayList arrayList = vyVar.D2;
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
        return this.f36579a[i10];
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        return i10;
    }
}
