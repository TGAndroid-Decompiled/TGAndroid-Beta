package org.telegram.ui.Components;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;
public final class vl extends am {
    public final ChatAttachAlertPhotoLayout f31904b;

    public vl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        super(chatAttachAlertPhotoLayout);
        this.f31904b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final boolean A() {
        mi miVar = this.f31904b.f26590b;
        if (miVar != null && miVar.Z) {
            return true;
        }
        return false;
    }

    @Override
    public final void D() {
        boolean z4 = ChatAttachAlertPhotoLayout.f24738n1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f31904b;
        chatAttachAlertPhotoLayout.m0();
        AndroidUtilities.runOnUIThread(new fg(this, 23), 150L);
        chatAttachAlertPhotoLayout.B(ChatAttachAlertPhotoLayout.f24740p1.size());
    }

    @Override
    public final org.telegram.ui.qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        ot otVar;
        org.telegram.ui.qu0 closeIntoObject;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f31904b;
        mi miVar = chatAttachAlertPhotoLayout.f26590b;
        if (z10 && (otVar = miVar.O0) != null && (closeIntoObject = ((x40) otVar.f29880b).getCloseIntoObject()) != null) {
            return closeIntoObject;
        }
        org.telegram.ui.Cells.t5 K = ChatAttachAlertPhotoLayout.K(chatAttachAlertPhotoLayout, i10);
        if (K != null) {
            int[] iArr = new int[2];
            K.getImageView().getLocationInWindow(iArr);
            if (Build.VERSION.SDK_INT < 26) {
                iArr[0] = iArr[0] - miVar.getLeftInset();
            }
            org.telegram.ui.qu0 qu0Var = new org.telegram.ui.qu0();
            qu0Var.f40679b = iArr[0];
            qu0Var.f40680c = iArr[1];
            qu0Var.d = chatAttachAlertPhotoLayout.B;
            ImageReceiver imageReceiver = K.getImageView().getImageReceiver();
            qu0Var.f40678a = imageReceiver;
            qu0Var.f40681e = imageReceiver.getBitmapSafe();
            qu0Var.f40686k = K.getScale();
            qu0Var.f40684i = (int) miVar.l1();
            K.g(false);
            return qu0Var;
        }
        return null;
    }

    @Override
    public final void F(boolean z4) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f31904b;
        mi miVar = chatAttachAlertPhotoLayout.f26590b;
        if (miVar != null && miVar.Z != z4) {
            miVar.H1(z4, true);
            chatAttachAlertPhotoLayout.f24744a1.a(!chatAttachAlertPhotoLayout.f26590b.Z, true);
        }
    }

    @Override
    public final void G() {
        ql qlVar = this.f31904b.B;
        int childCount = qlVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = qlVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.t5) {
                ((org.telegram.ui.Cells.t5) childAt).g(true);
            }
        }
    }

    @Override
    public final void W(int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f31904b;
        org.telegram.ui.Cells.t5 K = ChatAttachAlertPhotoLayout.K(chatAttachAlertPhotoLayout, i10);
        if (K != null) {
            K.getImageView().q(0, true);
            MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(i10);
            if (b02 != null) {
                if (b02.coverPath != null) {
                    K.getImageView().f(b02.coverPath, null, org.telegram.ui.ActionBar.k6.R4);
                } else if (b02.thumbPath != null) {
                    K.getImageView().f(b02.thumbPath, null, org.telegram.ui.ActionBar.k6.R4);
                } else if (b02.path != null) {
                    K.getImageView().p(b02.orientation, b02.invert, true);
                    if (b02.isVideo) {
                        p9 imageView = K.getImageView();
                        imageView.f("vthumb://" + b02.imageId + ":" + b02.path, null, org.telegram.ui.ActionBar.k6.R4);
                        return;
                    }
                    p9 imageView2 = K.getImageView();
                    imageView2.f("thumb://" + b02.imageId + ":" + b02.path, null, org.telegram.ui.ActionBar.k6.R4);
                } else {
                    K.getImageView().setImageDrawable(org.telegram.ui.ActionBar.k6.R4);
                }
            }
        }
    }

    @Override
    public final void Z(int i10) {
        org.telegram.ui.Cells.t5 K = ChatAttachAlertPhotoLayout.K(this.f31904b, i10);
        if (K != null) {
            K.g(true);
        }
    }

    @Override
    public final long a() {
        org.telegram.ui.ActionBar.p2 p2Var = this.f31904b.f26590b.f29058c0;
        if (p2Var instanceof org.telegram.ui.xn) {
            return ((org.telegram.ui.xn) p2Var).a();
        }
        return 0L;
    }

    @Override
    public final void d() {
        boolean z4 = ChatAttachAlertPhotoLayout.f24738n1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f31904b;
        chatAttachAlertPhotoLayout.k0();
        chatAttachAlertPhotoLayout.p0(-1, true);
    }

    @Override
    public final void e(CharSequence charSequence) {
        CharSequence charSequence2;
        ArrayList<TLRPC.MessageEntity> arrayList;
        SpannableStringBuilder spannableStringBuilder;
        HashMap hashMap = ChatAttachAlertPhotoLayout.f24740p1;
        if (hashMap.size() > 0) {
            ArrayList arrayList2 = ChatAttachAlertPhotoLayout.f24741q1;
            if (arrayList2.size() > 0) {
                Object obj = hashMap.get(arrayList2.get(0));
                if (obj instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                    charSequence2 = photoEntry.caption;
                    arrayList = photoEntry.entities;
                } else {
                    charSequence2 = null;
                    arrayList = null;
                }
                if (obj instanceof MediaController.SearchImage) {
                    MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                    charSequence2 = searchImage.caption;
                    arrayList = searchImage.entities;
                }
                ArrayList<TLRPC.MessageEntity> arrayList3 = arrayList;
                if (charSequence2 != null && arrayList3 != null) {
                    if (!(charSequence2 instanceof Spannable)) {
                        spannableStringBuilder = new SpannableStringBuilder(charSequence2);
                    } else {
                        spannableStringBuilder = charSequence2;
                    }
                    MessageObject.addEntitiesToText(spannableStringBuilder, arrayList3, false, false, false, false);
                    charSequence2 = spannableStringBuilder;
                }
                this.f31904b.f26590b.m1().setText(u5.cloneSpans(charSequence2, 3));
            }
        }
    }

    @Override
    public final void i() {
        boolean z4 = ChatAttachAlertPhotoLayout.f24738n1;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        org.telegram.ui.Cells.t5 K = ChatAttachAlertPhotoLayout.K(this.f31904b, i10);
        if (K != null) {
            return K.getImageView().getImageReceiver().getBitmapSafe();
        }
        return null;
    }

    @Override
    public final boolean l() {
        mi miVar = this.f31904b.f26590b;
        if (miVar != null && (miVar.f29058c0 instanceof org.telegram.ui.xn)) {
            return true;
        }
        return false;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z4, int i11, int i12, boolean z10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f31904b;
        mi miVar = chatAttachAlertPhotoLayout.f26590b;
        miVar.f29100p2 = true;
        boolean z11 = ChatAttachAlertPhotoLayout.f24738n1;
        MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(i10);
        if (b02 != null) {
            b02.editedInfo = videoEditedInfo;
        }
        HashMap hashMap = ChatAttachAlertPhotoLayout.f24740p1;
        if (hashMap.isEmpty() && b02 != null) {
            chatAttachAlertPhotoLayout.Q(b02, -1);
        }
        if (!miVar.b1(miVar.m1().getText())) {
            miVar.Y0();
            if (PhotoViewer.t1().f34335m7) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.f24741q1;
                if (!hashMap.isEmpty()) {
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        Object obj = hashMap.get(arrayList.get(i13));
                        if (obj instanceof MediaController.PhotoEntry) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                            if (i13 == 0) {
                                CharSequence[] charSequenceArr = {PhotoViewer.t1().f34345n7};
                                photoEntry.entities = MediaDataController.getInstance(UserConfig.selectedAccount).getEntities(charSequenceArr, false);
                                CharSequence charSequence = charSequenceArr[0];
                                photoEntry.caption = charSequence;
                                if (miVar.b1(charSequence)) {
                                    return;
                                }
                            } else {
                                photoEntry.caption = null;
                            }
                        }
                    }
                }
            }
            if (miVar != null) {
                miVar.F1 = false;
            }
            PhotoViewer.t1();
            PhotoViewer.t1().L = false;
            PhotoViewer.t1().f34377r2 = false;
            z4.a0(miVar.G1, miVar.j1() + ChatAttachAlertPhotoLayout.f24740p1.size(), miVar.n1(), new ll(this, z4, i11, z10));
        }
    }

    @Override
    public final boolean q() {
        mi miVar = this.f31904b.f26590b;
        if (miVar != null && miVar.E1 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void s() {
        boolean z4 = ChatAttachAlertPhotoLayout.f24738n1;
        this.f31904b.p0(-1, false);
    }

    @Override
    public final boolean w() {
        MessageObject messageObject;
        mi miVar = this.f31904b.f26590b;
        if (miVar != null && (messageObject = miVar.E1) != null && messageObject.needResendWhenEdit()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean z() {
        mi miVar = this.f31904b.f26590b;
        if (!miVar.C && !miVar.E) {
            return true;
        }
        return false;
    }
}
