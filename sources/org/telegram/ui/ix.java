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
public final class ix extends zt0 {
    public final boolean[] f38118a;
    public final cy f38119b;

    public ix(cy cyVar, boolean[] zArr) {
        this.f38119b = cyVar;
        this.f38118a = zArr;
    }

    @Override
    public final CharSequence C(int i10) {
        cy cyVar = this.f38119b;
        if (i10 >= 0 && i10 < cyVar.D2.size() && ((MediaController.PhotoEntry) cyVar.D2.get(i10)).isVideo) {
            return null;
        }
        return cy.p2(cyVar);
    }

    @Override
    public final void D() {
        int i10;
        cy cyVar = this.f38119b;
        org.telegram.ui.Components.jr0 jr0Var = cyVar.G2;
        if (jr0Var != null) {
            i10 = ((org.telegram.ui.ActionBar.n2) cyVar).currentAccount;
            jr0Var.i(i10, cyVar.D2);
        }
    }

    @Override
    public final ju0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Components.w9 w9Var;
        cy cyVar = this.f38119b;
        org.telegram.ui.Components.jr0 jr0Var = cyVar.G2;
        if (jr0Var != null) {
            w9Var = jr0Var.f(i10);
        } else {
            w9Var = null;
        }
        if (w9Var == null) {
            return null;
        }
        int[] iArr = new int[2];
        w9Var.getLocationInWindow(iArr);
        ju0 ju0Var = new ju0();
        ju0Var.f38344b = iArr[0];
        ju0Var.f38345c = iArr[1];
        ju0Var.d = cyVar.G2;
        ImageReceiver imageReceiver = w9Var.getImageReceiver();
        ju0Var.f38343a = imageReceiver;
        ju0Var.e = imageReceiver.getBitmapSafe();
        ju0Var.f38350k = w9Var.getScaleX();
        ju0Var.h = new int[]{AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f)};
        return ju0Var;
    }

    @Override
    public final int H() {
        ArrayList arrayList = this.f38119b.D2;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override
    public final boolean I() {
        return this.f38119b.l3();
    }

    @Override
    public final long a() {
        cy cyVar = this.f38119b;
        if (cyVar.I2.isEmpty()) {
            return 0L;
        }
        return ((Long) cyVar.I2.get(0)).longValue();
    }

    @Override
    public final boolean b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ix.b():boolean");
    }

    @Override
    public final CharSequence c0(int i10) {
        int i11;
        cy cyVar = this.f38119b;
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
        cy cyVar = this.f38119b;
        mw mwVar = cyVar.B1;
        if (mwVar != null) {
            mwVar.setFieldText(charSequence);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ix.h():boolean");
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        org.telegram.ui.Components.w9 w9Var;
        org.telegram.ui.Components.jr0 jr0Var = this.f38119b.G2;
        if (jr0Var != null) {
            w9Var = jr0Var.f(i10);
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
        cy cyVar = this.f38119b;
        ArrayList arrayList2 = cyVar.I2;
        if (cyVar.B1 != null && (arrayList = cyVar.D2) != null && !arrayList.isEmpty()) {
            mw mwVar = cyVar.B1;
            CharSequence charSequence = ((MediaController.PhotoEntry) cyVar.D2.get(0)).caption;
            if (charSequence == null) {
                charSequence = "";
            }
            mwVar.setFieldText(charSequence);
        }
        org.telegram.ui.Components.jr0 jr0Var = cyVar.G2;
        if (jr0Var != null) {
            i13 = ((org.telegram.ui.ActionBar.n2) cyVar).currentAccount;
            jr0Var.i(i13, cyVar.D2);
        }
        if ((!z10 || i11 != 0 || z11) && cyVar.C2 != null && !arrayList2.isEmpty()) {
            cyVar.J2 = z10;
            cyVar.K2 = i11;
            cyVar.M2 = z11;
            ArrayList arrayList3 = new ArrayList();
            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                arrayList3.add(MessagesStorage.TopicKey.of(((Long) arrayList2.get(i14)).longValue(), 0L));
            }
            PhotoViewer.t1().G0(true, false);
            cyVar.C2.w(cyVar, arrayList3, cyVar.B1.getFieldText(), false, z10, i11, i12, null);
            return;
        }
        PhotoViewer.t1().G0(true, false);
    }

    @Override
    public final void s() {
        mw mwVar;
        org.telegram.ui.Components.kd f12;
        PhotoViewer t12 = PhotoViewer.t1();
        CharSequence charSequence = null;
        if (t12.R1() && (f12 = t12.f1()) != null) {
            charSequence = f12.getText();
        }
        cy cyVar = this.f38119b;
        if (charSequence != null && (mwVar = cyVar.B1) != null) {
            mwVar.setFieldText(charSequence);
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
        return this.f38118a[i10];
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        return i10;
    }
}
