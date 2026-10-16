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
public final class fy extends zu0 {
    public final boolean[] f36019a;
    public final yy f36020b;

    public fy(yy yyVar, boolean[] zArr) {
        this.f36020b = yyVar;
        this.f36019a = zArr;
    }

    @Override
    public final CharSequence C(int i10) {
        yy yyVar = this.f36020b;
        if (i10 >= 0 && i10 < yyVar.D2.size() && ((MediaController.PhotoEntry) yyVar.D2.get(i10)).isVideo) {
            return null;
        }
        return yy.p2(yyVar);
    }

    @Override
    public final void D() {
        int i10;
        yy yyVar = this.f36020b;
        org.telegram.ui.Components.nr0 nr0Var = yyVar.G2;
        if (nr0Var != null) {
            i10 = ((org.telegram.ui.ActionBar.m2) yyVar).currentAccount;
            nr0Var.i(i10, yyVar.D2);
        }
    }

    @Override
    public final jv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Components.z9 z9Var;
        yy yyVar = this.f36020b;
        org.telegram.ui.Components.nr0 nr0Var = yyVar.G2;
        if (nr0Var != null) {
            z9Var = nr0Var.f(i10);
        } else {
            z9Var = null;
        }
        if (z9Var == null) {
            return null;
        }
        int[] iArr = new int[2];
        z9Var.getLocationInWindow(iArr);
        jv0 jv0Var = new jv0();
        jv0Var.f37146b = iArr[0];
        jv0Var.f37147c = iArr[1];
        jv0Var.d = yyVar.G2;
        ImageReceiver imageReceiver = z9Var.getImageReceiver();
        jv0Var.f37145a = imageReceiver;
        jv0Var.e = imageReceiver.getBitmapSafe();
        jv0Var.f37152k = z9Var.getScaleX();
        jv0Var.h = new int[]{AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f)};
        return jv0Var;
    }

    @Override
    public final int H() {
        ArrayList arrayList = this.f36020b.D2;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override
    public final boolean I() {
        return this.f36020b.l3();
    }

    @Override
    public final long a() {
        yy yyVar = this.f36020b;
        if (yyVar.I2.isEmpty()) {
            return 0L;
        }
        return ((Long) yyVar.I2.get(0)).longValue();
    }

    @Override
    public final boolean b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fy.b():boolean");
    }

    @Override
    public final CharSequence c0(int i10) {
        int i11;
        yy yyVar = this.f36020b;
        ArrayList arrayList = yyVar.D2;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = yyVar.D2.size();
            if (size == 1) {
                if (((MediaController.PhotoEntry) yyVar.D2.get(0)).isVideo) {
                    i11 = R.string.AttachVideo;
                } else {
                    i11 = R.string.AttachPhoto;
                }
                return LocaleController.getString(i11);
            }
            ArrayList arrayList2 = yyVar.D2;
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
        yy yyVar = this.f36020b;
        ix ixVar = yyVar.B1;
        if (ixVar != null) {
            ixVar.setFieldText(charSequence);
        }
        ArrayList arrayList = yyVar.D2;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fy.h():boolean");
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        org.telegram.ui.Components.z9 z9Var;
        org.telegram.ui.Components.nr0 nr0Var = this.f36020b.G2;
        if (nr0Var != null) {
            z9Var = nr0Var.f(i10);
        } else {
            z9Var = null;
        }
        if (z9Var == null) {
            return null;
        }
        return z9Var.getImageReceiver().getBitmapSafe();
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        int i13;
        ArrayList arrayList;
        yy yyVar = this.f36020b;
        ArrayList arrayList2 = yyVar.I2;
        if (yyVar.B1 != null && (arrayList = yyVar.D2) != null && !arrayList.isEmpty()) {
            ix ixVar = yyVar.B1;
            CharSequence charSequence = ((MediaController.PhotoEntry) yyVar.D2.get(0)).caption;
            if (charSequence == null) {
                charSequence = "";
            }
            ixVar.setFieldText(charSequence);
        }
        org.telegram.ui.Components.nr0 nr0Var = yyVar.G2;
        if (nr0Var != null) {
            i13 = ((org.telegram.ui.ActionBar.m2) yyVar).currentAccount;
            nr0Var.i(i13, yyVar.D2);
        }
        if ((!z10 || i11 != 0 || z11) && yyVar.C2 != null && !arrayList2.isEmpty()) {
            yyVar.J2 = z10;
            yyVar.K2 = i11;
            yyVar.M2 = z11;
            ArrayList arrayList3 = new ArrayList();
            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                arrayList3.add(MessagesStorage.TopicKey.of(((Long) arrayList2.get(i14)).longValue(), 0L));
            }
            PhotoViewer.t1().G0(true, false);
            yyVar.C2.w(yyVar, arrayList3, yyVar.B1.getFieldText(), false, z10, i11, i12, null);
            return;
        }
        PhotoViewer.t1().G0(true, false);
    }

    @Override
    public final void s() {
        ix ixVar;
        org.telegram.ui.Components.md f12;
        PhotoViewer t12 = PhotoViewer.t1();
        CharSequence charSequence = null;
        if (t12.R1() && (f12 = t12.f1()) != null) {
            charSequence = f12.getText();
        }
        yy yyVar = this.f36020b;
        if (charSequence != null && (ixVar = yyVar.B1) != null) {
            ixVar.setFieldText(charSequence);
        }
        ArrayList arrayList = yyVar.D2;
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
        return this.f36019a[i10];
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        return i10;
    }
}
