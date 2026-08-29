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
public final class lx extends pt0 {
    public final boolean[] f40321a;
    public final fy f40322b;

    public lx(fy fyVar, boolean[] zArr) {
        this.f40322b = fyVar;
        this.f40321a = zArr;
    }

    @Override
    public final CharSequence C(int i10) {
        fy fyVar = this.f40322b;
        if (i10 >= 0 && i10 < fyVar.f38383z2.size() && ((MediaController.PhotoEntry) fyVar.f38383z2.get(i10)).isVideo) {
            return null;
        }
        return fy.s2(fyVar);
    }

    @Override
    public final void D() {
        int i10;
        fy fyVar = this.f40322b;
        org.telegram.ui.Components.iq0 iq0Var = fyVar.C2;
        if (iq0Var != null) {
            i10 = ((org.telegram.ui.ActionBar.o2) fyVar).currentAccount;
            iq0Var.i(i10, fyVar.f38383z2);
        }
    }

    @Override
    public final zt0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Components.t9 t9Var;
        fy fyVar = this.f40322b;
        org.telegram.ui.Components.iq0 iq0Var = fyVar.C2;
        if (iq0Var != null) {
            t9Var = iq0Var.f(i10);
        } else {
            t9Var = null;
        }
        if (t9Var == null) {
            return null;
        }
        int[] iArr = new int[2];
        t9Var.getLocationInWindow(iArr);
        zt0 zt0Var = new zt0();
        zt0Var.f45317b = iArr[0];
        zt0Var.f45318c = iArr[1];
        zt0Var.d = fyVar.C2;
        ImageReceiver imageReceiver = t9Var.getImageReceiver();
        zt0Var.f45316a = imageReceiver;
        zt0Var.f45319e = imageReceiver.getBitmapSafe();
        zt0Var.f45324k = t9Var.getScaleX();
        zt0Var.h = new int[]{AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f)};
        return zt0Var;
    }

    @Override
    public final long a() {
        fy fyVar = this.f40322b;
        if (fyVar.E2.isEmpty()) {
            return 0L;
        }
        return ((Long) fyVar.E2.get(0)).longValue();
    }

    @Override
    public final boolean b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lx.b():boolean");
    }

    @Override
    public final CharSequence b0(int i10) {
        int i11;
        fy fyVar = this.f40322b;
        ArrayList arrayList = fyVar.f38383z2;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = fyVar.f38383z2.size();
            if (size == 1) {
                if (((MediaController.PhotoEntry) fyVar.f38383z2.get(0)).isVideo) {
                    i11 = R.string.AttachVideo;
                } else {
                    i11 = R.string.AttachPhoto;
                }
                return LocaleController.getString(i11);
            }
            ArrayList arrayList2 = fyVar.f38383z2;
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
        fy fyVar = this.f40322b;
        qw qwVar = fyVar.f38373x1;
        if (qwVar != null) {
            qwVar.setFieldText(charSequence);
        }
        ArrayList arrayList = fyVar.f38383z2;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lx.h():boolean");
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        org.telegram.ui.Components.t9 t9Var;
        org.telegram.ui.Components.iq0 iq0Var = this.f40322b.C2;
        if (iq0Var != null) {
            t9Var = iq0Var.f(i10);
        } else {
            t9Var = null;
        }
        if (t9Var == null) {
            return null;
        }
        return t9Var.getImageReceiver().getBitmapSafe();
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        int i13;
        ArrayList arrayList;
        fy fyVar = this.f40322b;
        ArrayList arrayList2 = fyVar.E2;
        if (fyVar.f38373x1 != null && (arrayList = fyVar.f38383z2) != null && !arrayList.isEmpty()) {
            qw qwVar = fyVar.f38373x1;
            CharSequence charSequence = ((MediaController.PhotoEntry) fyVar.f38383z2.get(0)).caption;
            if (charSequence == null) {
                charSequence = "";
            }
            qwVar.setFieldText(charSequence);
        }
        org.telegram.ui.Components.iq0 iq0Var = fyVar.C2;
        if (iq0Var != null) {
            i13 = ((org.telegram.ui.ActionBar.o2) fyVar).currentAccount;
            iq0Var.i(i13, fyVar.f38383z2);
        }
        if ((!z10 || i11 != 0) && fyVar.f38379y2 != null && !arrayList2.isEmpty()) {
            fyVar.F2 = z10;
            fyVar.G2 = i11;
            ArrayList arrayList3 = new ArrayList();
            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                arrayList3.add(MessagesStorage.TopicKey.of(((Long) arrayList2.get(i14)).longValue(), 0L));
            }
            PhotoViewer.t1().G0(true, false);
            fyVar.f38379y2.v(fyVar, arrayList3, fyVar.f38373x1.getFieldText(), false, z10, i11, i12, null);
            return;
        }
        PhotoViewer.t1().G0(true, false);
    }

    @Override
    public final void s() {
        qw qwVar;
        org.telegram.ui.Components.ed f12;
        PhotoViewer t12 = PhotoViewer.t1();
        CharSequence charSequence = null;
        if (t12.Q1() && (f12 = t12.f1()) != null) {
            charSequence = f12.getText();
        }
        fy fyVar = this.f40322b;
        if (charSequence != null && (qwVar = fyVar.f38373x1) != null) {
            qwVar.setFieldText(charSequence);
        }
        ArrayList arrayList = fyVar.f38383z2;
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
        return this.f40321a[i10];
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        return i10;
    }
}
