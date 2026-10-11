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
public final class om extends tm {
    public final ChatAttachAlertPhotoLayout f29428b;

    public om(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        super(chatAttachAlertPhotoLayout);
        this.f29428b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final boolean A() {
        yi yiVar = this.f29428b.f30161b;
        if (yiVar != null && yiVar.f33205c0) {
            return true;
        }
        return false;
    }

    @Override
    public final void D() {
        boolean z10 = ChatAttachAlertPhotoLayout.f24013q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29428b;
        chatAttachAlertPhotoLayout.m0();
        AndroidUtilities.runOnUIThread(new rg(this, 23), 150L);
        chatAttachAlertPhotoLayout.E(ChatAttachAlertPhotoLayout.f24015s1.size());
    }

    @Override
    public final org.telegram.ui.dv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        hu huVar;
        org.telegram.ui.dv0 closeIntoObject;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29428b;
        yi yiVar = chatAttachAlertPhotoLayout.f30161b;
        if (z11 && (huVar = yiVar.U0) != null && (closeIntoObject = ((m50) huVar.f27079b).getCloseIntoObject()) != null) {
            return closeIntoObject;
        }
        org.telegram.ui.Cells.t5 N = ChatAttachAlertPhotoLayout.N(chatAttachAlertPhotoLayout, i10);
        if (N != null) {
            int[] iArr = new int[2];
            N.getImageView().getLocationInWindow(iArr);
            if (Build.VERSION.SDK_INT < 26) {
                iArr[0] = iArr[0] - yiVar.getLeftInset();
            }
            org.telegram.ui.dv0 dv0Var = new org.telegram.ui.dv0();
            dv0Var.f37114b = iArr[0];
            dv0Var.f37115c = iArr[1];
            dv0Var.d = chatAttachAlertPhotoLayout.E;
            ImageReceiver imageReceiver = N.getImageView().getImageReceiver();
            dv0Var.f37113a = imageReceiver;
            dv0Var.f37116e = imageReceiver.getBitmapSafe();
            dv0Var.f37121k = N.getScale();
            dv0Var.f37119i = (int) yiVar.n1();
            N.g(false);
            return dv0Var;
        }
        return null;
    }

    @Override
    public final void F(boolean z10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29428b;
        yi yiVar = chatAttachAlertPhotoLayout.f30161b;
        if (yiVar != null && yiVar.f33205c0 != z10) {
            yiVar.K1(z10, true);
            chatAttachAlertPhotoLayout.f24025d1.a(!chatAttachAlertPhotoLayout.f30161b.f33205c0, true);
        }
    }

    @Override
    public final void G() {
        km kmVar = this.f29428b.E;
        int childCount = kmVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = kmVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.t5) {
                ((org.telegram.ui.Cells.t5) childAt).g(true);
            }
        }
    }

    @Override
    public final void W(int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29428b;
        org.telegram.ui.Cells.t5 N = ChatAttachAlertPhotoLayout.N(chatAttachAlertPhotoLayout, i10);
        if (N != null) {
            N.getImageView().q(0, true);
            MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(i10);
            if (b02 != null) {
                if (b02.coverPath != null) {
                    N.getImageView().f(b02.coverPath, null, org.telegram.ui.ActionBar.h6.R4);
                } else if (b02.thumbPath != null) {
                    N.getImageView().f(b02.thumbPath, null, org.telegram.ui.ActionBar.h6.R4);
                } else if (b02.path != null) {
                    N.getImageView().p(b02.orientation, b02.invert, true);
                    if (b02.isVideo) {
                        y9 imageView = N.getImageView();
                        imageView.f("vthumb://" + b02.imageId + ":" + b02.path, null, org.telegram.ui.ActionBar.h6.R4);
                        return;
                    }
                    y9 imageView2 = N.getImageView();
                    imageView2.f("thumb://" + b02.imageId + ":" + b02.path, null, org.telegram.ui.ActionBar.h6.R4);
                } else {
                    N.getImageView().setImageDrawable(org.telegram.ui.ActionBar.h6.R4);
                }
            }
        }
    }

    @Override
    public final void Z(int i10) {
        org.telegram.ui.Cells.t5 N = ChatAttachAlertPhotoLayout.N(this.f29428b, i10);
        if (N != null) {
            N.g(true);
        }
    }

    @Override
    public final long a() {
        org.telegram.ui.ActionBar.m2 m2Var = this.f29428b.f30161b.f33216f0;
        if (m2Var instanceof org.telegram.ui.zn) {
            return ((org.telegram.ui.zn) m2Var).a();
        }
        return 0L;
    }

    @Override
    public final void d() {
        boolean z10 = ChatAttachAlertPhotoLayout.f24013q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29428b;
        chatAttachAlertPhotoLayout.k0();
        chatAttachAlertPhotoLayout.p0(-1, true);
    }

    @Override
    public final void e(CharSequence charSequence) {
        CharSequence charSequence2;
        ArrayList<TLRPC.MessageEntity> arrayList;
        SpannableStringBuilder spannableStringBuilder;
        HashMap hashMap = ChatAttachAlertPhotoLayout.f24015s1;
        if (hashMap.size() > 0) {
            ArrayList arrayList2 = ChatAttachAlertPhotoLayout.f24016t1;
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
                this.f29428b.f30161b.o1().setText(b6.cloneSpans(charSequence2, 3));
            }
        }
    }

    @Override
    public final void i() {
        boolean z10 = ChatAttachAlertPhotoLayout.f24013q1;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        org.telegram.ui.Cells.t5 N = ChatAttachAlertPhotoLayout.N(this.f29428b, i10);
        if (N != null) {
            return N.getImageView().getImageReceiver().getBitmapSafe();
        }
        return null;
    }

    @Override
    public final boolean l() {
        yi yiVar = this.f29428b.f30161b;
        if (yiVar != null && (yiVar.f33216f0 instanceof org.telegram.ui.zn)) {
            return true;
        }
        return false;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29428b;
        yi yiVar = chatAttachAlertPhotoLayout.f30161b;
        yiVar.f33267v2 = true;
        boolean z12 = ChatAttachAlertPhotoLayout.f24013q1;
        MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(i10);
        if (b02 != null) {
            b02.editedInfo = videoEditedInfo;
        }
        HashMap hashMap = ChatAttachAlertPhotoLayout.f24015s1;
        if (hashMap.isEmpty() && b02 != null) {
            chatAttachAlertPhotoLayout.Q(b02, -1);
        }
        if (!yiVar.d1(yiVar.o1().getText())) {
            yiVar.a1();
            if (PhotoViewer.t1().f34033p7) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.f24016t1;
                if (!hashMap.isEmpty()) {
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        Object obj = hashMap.get(arrayList.get(i13));
                        if (obj instanceof MediaController.PhotoEntry) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                            if (i13 == 0) {
                                CharSequence[] charSequenceArr = {PhotoViewer.t1().f34041q7};
                                photoEntry.entities = MediaDataController.getInstance(UserConfig.selectedAccount).getEntities(charSequenceArr, false);
                                CharSequence charSequence = charSequenceArr[0];
                                photoEntry.caption = charSequence;
                                if (yiVar.d1(charSequence)) {
                                    return;
                                }
                            } else {
                                photoEntry.caption = null;
                            }
                        }
                    }
                }
            }
            if (yiVar != null) {
                yiVar.L1 = false;
            }
            PhotoViewer.t1();
            PhotoViewer.t1().O = false;
            PhotoViewer.t1().f34074u2 = false;
            g5.Z(yiVar.M1, yiVar.l1() + ChatAttachAlertPhotoLayout.f24015s1.size(), yiVar.p1(), new gm(this, z10, i11, z11));
        }
    }

    @Override
    public final boolean q() {
        yi yiVar = this.f29428b.f30161b;
        if (yiVar != null && yiVar.K1 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void s() {
        boolean z10 = ChatAttachAlertPhotoLayout.f24013q1;
        this.f29428b.p0(-1, false);
    }

    @Override
    public final boolean w() {
        MessageObject messageObject;
        yi yiVar = this.f29428b.f30161b;
        if (yiVar != null && (messageObject = yiVar.K1) != null && messageObject.needResendWhenEdit()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean z() {
        yi yiVar = this.f29428b.f30161b;
        if (!yiVar.F && !yiVar.H) {
            return true;
        }
        return false;
    }
}
