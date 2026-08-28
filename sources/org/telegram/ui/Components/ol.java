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
public final class ol extends tl {
    public final ChatAttachAlertPhotoLayout f31408b;

    public ol(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        super(chatAttachAlertPhotoLayout);
        this.f31408b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final boolean A() {
        ki kiVar = this.f31408b.f27493b;
        if (kiVar != null && kiVar.Y) {
            return true;
        }
        return false;
    }

    @Override
    public final void D() {
        boolean z10 = ChatAttachAlertPhotoLayout.f26241m1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f31408b;
        chatAttachAlertPhotoLayout.l0();
        AndroidUtilities.runOnUIThread(new fg(this, 23), 150L);
        chatAttachAlertPhotoLayout.A(ChatAttachAlertPhotoLayout.f26243o1.size());
    }

    @Override
    public final org.telegram.ui.bu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i9, boolean z10, boolean z11) {
        ct ctVar;
        org.telegram.ui.bu0 closeIntoObject;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f31408b;
        ki kiVar = chatAttachAlertPhotoLayout.f27493b;
        if (z11 && (ctVar = kiVar.N0) != null && (closeIntoObject = ((d40) ctVar.f27564b).getCloseIntoObject()) != null) {
            return closeIntoObject;
        }
        org.telegram.ui.Cells.t5 K = ChatAttachAlertPhotoLayout.K(chatAttachAlertPhotoLayout, i9);
        if (K != null) {
            int[] iArr = new int[2];
            K.getImageView().getLocationInWindow(iArr);
            if (Build.VERSION.SDK_INT < 26) {
                iArr[0] = iArr[0] - kiVar.getLeftInset();
            }
            org.telegram.ui.bu0 bu0Var = new org.telegram.ui.bu0();
            bu0Var.f36979b = iArr[0];
            bu0Var.f36980c = iArr[1];
            bu0Var.d = chatAttachAlertPhotoLayout.A;
            ImageReceiver imageReceiver = K.getImageView().getImageReceiver();
            bu0Var.f36978a = imageReceiver;
            bu0Var.f36981e = imageReceiver.getBitmapSafe();
            bu0Var.f36986k = K.getScale();
            bu0Var.f36984i = (int) kiVar.l1();
            K.g(false);
            return bu0Var;
        }
        return null;
    }

    @Override
    public final void F(boolean z10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f31408b;
        ki kiVar = chatAttachAlertPhotoLayout.f27493b;
        if (kiVar != null && kiVar.Y != z10) {
            kiVar.H1(z10, true);
            chatAttachAlertPhotoLayout.Z0.a(!chatAttachAlertPhotoLayout.f27493b.Y, true);
        }
    }

    @Override
    public final void G() {
        kl klVar = this.f31408b.A;
        int childCount = klVar.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = klVar.getChildAt(i9);
            if (childAt instanceof org.telegram.ui.Cells.t5) {
                ((org.telegram.ui.Cells.t5) childAt).g(true);
            }
        }
    }

    @Override
    public final void W(int i9) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f31408b;
        org.telegram.ui.Cells.t5 K = ChatAttachAlertPhotoLayout.K(chatAttachAlertPhotoLayout, i9);
        if (K != null) {
            K.getImageView().q(0, true);
            MediaController.PhotoEntry a02 = chatAttachAlertPhotoLayout.a0(i9);
            if (a02 != null) {
                if (a02.coverPath != null) {
                    K.getImageView().f(a02.coverPath, null, org.telegram.ui.ActionBar.f6.R4);
                } else if (a02.thumbPath != null) {
                    K.getImageView().f(a02.thumbPath, null, org.telegram.ui.ActionBar.f6.R4);
                } else if (a02.path != null) {
                    K.getImageView().p(a02.orientation, a02.invert, true);
                    if (a02.isVideo) {
                        o9 imageView = K.getImageView();
                        imageView.f("vthumb://" + a02.imageId + ":" + a02.path, null, org.telegram.ui.ActionBar.f6.R4);
                        return;
                    }
                    o9 imageView2 = K.getImageView();
                    imageView2.f("thumb://" + a02.imageId + ":" + a02.path, null, org.telegram.ui.ActionBar.f6.R4);
                } else {
                    K.getImageView().setImageDrawable(org.telegram.ui.ActionBar.f6.R4);
                }
            }
        }
    }

    @Override
    public final void Z(int i9) {
        org.telegram.ui.Cells.t5 K = ChatAttachAlertPhotoLayout.K(this.f31408b, i9);
        if (K != null) {
            K.g(true);
        }
    }

    @Override
    public final long a() {
        org.telegram.ui.ActionBar.o2 o2Var = this.f31408b.f27493b.f30099b0;
        if (o2Var instanceof org.telegram.ui.qn) {
            return ((org.telegram.ui.qn) o2Var).a();
        }
        return 0L;
    }

    @Override
    public final void d() {
        boolean z10 = ChatAttachAlertPhotoLayout.f26241m1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f31408b;
        chatAttachAlertPhotoLayout.j0();
        chatAttachAlertPhotoLayout.o0(-1, true);
    }

    @Override
    public final void e(CharSequence charSequence) {
        CharSequence charSequence2;
        ArrayList<TLRPC.MessageEntity> arrayList;
        SpannableStringBuilder spannableStringBuilder;
        HashMap hashMap = ChatAttachAlertPhotoLayout.f26243o1;
        if (hashMap.size() > 0) {
            ArrayList arrayList2 = ChatAttachAlertPhotoLayout.f26244p1;
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
                this.f31408b.f27493b.m1().setText(t5.cloneSpans(charSequence2, 3));
            }
        }
    }

    @Override
    public final void i() {
        boolean z10 = ChatAttachAlertPhotoLayout.f26241m1;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i9) {
        org.telegram.ui.Cells.t5 K = ChatAttachAlertPhotoLayout.K(this.f31408b, i9);
        if (K != null) {
            return K.getImageView().getImageReceiver().getBitmapSafe();
        }
        return null;
    }

    @Override
    public final boolean l() {
        ki kiVar = this.f31408b.f27493b;
        if (kiVar != null && (kiVar.f30099b0 instanceof org.telegram.ui.qn)) {
            return true;
        }
        return false;
    }

    @Override
    public final void o(int i9, VideoEditedInfo videoEditedInfo, boolean z10, int i10, int i11, boolean z11) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f31408b;
        ki kiVar = chatAttachAlertPhotoLayout.f27493b;
        kiVar.f30142o2 = true;
        boolean z12 = ChatAttachAlertPhotoLayout.f26241m1;
        MediaController.PhotoEntry a02 = chatAttachAlertPhotoLayout.a0(i9);
        if (a02 != null) {
            a02.editedInfo = videoEditedInfo;
        }
        HashMap hashMap = ChatAttachAlertPhotoLayout.f26243o1;
        if (hashMap.isEmpty() && a02 != null) {
            chatAttachAlertPhotoLayout.P(a02, -1);
        }
        if (!kiVar.b1(kiVar.m1().getText())) {
            kiVar.Y0();
            if (PhotoViewer.t1().f35687l7) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.f26244p1;
                if (!hashMap.isEmpty()) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        Object obj = hashMap.get(arrayList.get(i12));
                        if (obj instanceof MediaController.PhotoEntry) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                            if (i12 == 0) {
                                CharSequence[] charSequenceArr = {PhotoViewer.t1().f35695m7};
                                photoEntry.entities = MediaDataController.getInstance(UserConfig.selectedAccount).getEntities(charSequenceArr, false);
                                CharSequence charSequence = charSequenceArr[0];
                                photoEntry.caption = charSequence;
                                if (kiVar.b1(charSequence)) {
                                    return;
                                }
                            } else {
                                photoEntry.caption = null;
                            }
                        }
                    }
                }
            }
            if (kiVar != null) {
                kiVar.E1 = false;
            }
            PhotoViewer.t1();
            PhotoViewer.t1().K = false;
            PhotoViewer.t1().f35725q2 = false;
            y4.a0(kiVar.F1, kiVar.j1() + ChatAttachAlertPhotoLayout.f26243o1.size(), kiVar.n1(), new gl(this, z10, i10, z11));
        }
    }

    @Override
    public final boolean q() {
        ki kiVar = this.f31408b.f27493b;
        if (kiVar != null && kiVar.D1 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void s() {
        boolean z10 = ChatAttachAlertPhotoLayout.f26241m1;
        this.f31408b.o0(-1, false);
    }

    @Override
    public final boolean w() {
        MessageObject messageObject;
        ki kiVar = this.f31408b.f27493b;
        if (kiVar != null && (messageObject = kiVar.D1) != null && messageObject.needResendWhenEdit()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean z() {
        ki kiVar = this.f31408b.f27493b;
        if (!kiVar.B && !kiVar.D) {
            return true;
        }
        return false;
    }
}
