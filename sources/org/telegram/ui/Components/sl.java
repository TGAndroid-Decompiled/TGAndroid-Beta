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
public final class sl extends xl {
    public final ChatAttachAlertPhotoLayout f32686b;

    public sl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        super(chatAttachAlertPhotoLayout);
        this.f32686b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final boolean A() {
        ni niVar = this.f32686b.f28403b;
        if (niVar != null && niVar.Y) {
            return true;
        }
        return false;
    }

    @Override
    public final void D() {
        boolean z10 = ChatAttachAlertPhotoLayout.f26252m1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f32686b;
        chatAttachAlertPhotoLayout.m0();
        AndroidUtilities.runOnUIThread(new ig(this, 23), 150L);
        chatAttachAlertPhotoLayout.B(ChatAttachAlertPhotoLayout.f26254o1.size());
    }

    @Override
    public final org.telegram.ui.zt0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        jt jtVar;
        org.telegram.ui.zt0 closeIntoObject;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f32686b;
        ni niVar = chatAttachAlertPhotoLayout.f28403b;
        if (z11 && (jtVar = niVar.N0) != null && (closeIntoObject = ((r40) jtVar.f29818b).getCloseIntoObject()) != null) {
            return closeIntoObject;
        }
        org.telegram.ui.Cells.r5 K = ChatAttachAlertPhotoLayout.K(chatAttachAlertPhotoLayout, i10);
        if (K != null) {
            int[] iArr = new int[2];
            K.getImageView().getLocationInWindow(iArr);
            if (Build.VERSION.SDK_INT < 26) {
                iArr[0] = iArr[0] - niVar.getLeftInset();
            }
            org.telegram.ui.zt0 zt0Var = new org.telegram.ui.zt0();
            zt0Var.f45317b = iArr[0];
            zt0Var.f45318c = iArr[1];
            zt0Var.d = chatAttachAlertPhotoLayout.A;
            ImageReceiver imageReceiver = K.getImageView().getImageReceiver();
            zt0Var.f45316a = imageReceiver;
            zt0Var.f45319e = imageReceiver.getBitmapSafe();
            zt0Var.f45324k = K.getScale();
            zt0Var.f45322i = (int) niVar.l1();
            K.g(false);
            return zt0Var;
        }
        return null;
    }

    @Override
    public final void F(boolean z10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f32686b;
        ni niVar = chatAttachAlertPhotoLayout.f28403b;
        if (niVar != null && niVar.Y != z10) {
            niVar.H1(z10, true);
            chatAttachAlertPhotoLayout.Z0.a(!chatAttachAlertPhotoLayout.f28403b.Y, true);
        }
    }

    @Override
    public final void G() {
        ol olVar = this.f32686b.A;
        int childCount = olVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = olVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.r5) {
                ((org.telegram.ui.Cells.r5) childAt).g(true);
            }
        }
    }

    @Override
    public final void W(int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f32686b;
        org.telegram.ui.Cells.r5 K = ChatAttachAlertPhotoLayout.K(chatAttachAlertPhotoLayout, i10);
        if (K != null) {
            K.getImageView().q(0, true);
            MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(i10);
            if (b02 != null) {
                if (b02.coverPath != null) {
                    K.getImageView().f(b02.coverPath, null, org.telegram.ui.ActionBar.g6.R4);
                } else if (b02.thumbPath != null) {
                    K.getImageView().f(b02.thumbPath, null, org.telegram.ui.ActionBar.g6.R4);
                } else if (b02.path != null) {
                    K.getImageView().p(b02.orientation, b02.invert, true);
                    if (b02.isVideo) {
                        t9 imageView = K.getImageView();
                        imageView.f("vthumb://" + b02.imageId + ":" + b02.path, null, org.telegram.ui.ActionBar.g6.R4);
                        return;
                    }
                    t9 imageView2 = K.getImageView();
                    imageView2.f("thumb://" + b02.imageId + ":" + b02.path, null, org.telegram.ui.ActionBar.g6.R4);
                } else {
                    K.getImageView().setImageDrawable(org.telegram.ui.ActionBar.g6.R4);
                }
            }
        }
    }

    @Override
    public final void Z(int i10) {
        org.telegram.ui.Cells.r5 K = ChatAttachAlertPhotoLayout.K(this.f32686b, i10);
        if (K != null) {
            K.g(true);
        }
    }

    @Override
    public final long a() {
        org.telegram.ui.ActionBar.o2 o2Var = this.f32686b.f28403b.f30990b0;
        if (o2Var instanceof org.telegram.ui.tn) {
            return ((org.telegram.ui.tn) o2Var).a();
        }
        return 0L;
    }

    @Override
    public final void d() {
        boolean z10 = ChatAttachAlertPhotoLayout.f26252m1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f32686b;
        chatAttachAlertPhotoLayout.k0();
        chatAttachAlertPhotoLayout.p0(-1, true);
    }

    @Override
    public final void e(CharSequence charSequence) {
        CharSequence charSequence2;
        ArrayList<TLRPC.MessageEntity> arrayList;
        SpannableStringBuilder spannableStringBuilder;
        HashMap hashMap = ChatAttachAlertPhotoLayout.f26254o1;
        if (hashMap.size() > 0) {
            ArrayList arrayList2 = ChatAttachAlertPhotoLayout.f26255p1;
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
                this.f32686b.f28403b.m1().setText(y5.cloneSpans(charSequence2, 3));
            }
        }
    }

    @Override
    public final void i() {
        boolean z10 = ChatAttachAlertPhotoLayout.f26252m1;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        org.telegram.ui.Cells.r5 K = ChatAttachAlertPhotoLayout.K(this.f32686b, i10);
        if (K != null) {
            return K.getImageView().getImageReceiver().getBitmapSafe();
        }
        return null;
    }

    @Override
    public final boolean l() {
        ni niVar = this.f32686b.f28403b;
        if (niVar != null && (niVar.f30990b0 instanceof org.telegram.ui.tn)) {
            return true;
        }
        return false;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f32686b;
        ni niVar = chatAttachAlertPhotoLayout.f28403b;
        niVar.f31033o2 = true;
        boolean z12 = ChatAttachAlertPhotoLayout.f26252m1;
        MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(i10);
        if (b02 != null) {
            b02.editedInfo = videoEditedInfo;
        }
        HashMap hashMap = ChatAttachAlertPhotoLayout.f26254o1;
        if (hashMap.isEmpty() && b02 != null) {
            chatAttachAlertPhotoLayout.Q(b02, -1);
        }
        if (!niVar.b1(niVar.m1().getText())) {
            niVar.Y0();
            if (PhotoViewer.t1().f35753l7) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.f26255p1;
                if (!hashMap.isEmpty()) {
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        Object obj = hashMap.get(arrayList.get(i13));
                        if (obj instanceof MediaController.PhotoEntry) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                            if (i13 == 0) {
                                CharSequence[] charSequenceArr = {PhotoViewer.t1().f35761m7};
                                photoEntry.entities = MediaDataController.getInstance(UserConfig.selectedAccount).getEntities(charSequenceArr, false);
                                CharSequence charSequence = charSequenceArr[0];
                                photoEntry.caption = charSequence;
                                if (niVar.b1(charSequence)) {
                                    return;
                                }
                            } else {
                                photoEntry.caption = null;
                            }
                        }
                    }
                }
            }
            if (niVar != null) {
                niVar.E1 = false;
            }
            PhotoViewer.t1();
            PhotoViewer.t1().K = false;
            PhotoViewer.t1().f35793q2 = false;
            c5.a0(niVar.F1, niVar.j1() + ChatAttachAlertPhotoLayout.f26254o1.size(), niVar.n1(), new kl(this, z10, i11, z11));
        }
    }

    @Override
    public final boolean q() {
        ni niVar = this.f32686b.f28403b;
        if (niVar != null && niVar.D1 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void s() {
        boolean z10 = ChatAttachAlertPhotoLayout.f26252m1;
        this.f32686b.p0(-1, false);
    }

    @Override
    public final boolean w() {
        MessageObject messageObject;
        ni niVar = this.f32686b.f28403b;
        if (niVar != null && (messageObject = niVar.D1) != null && messageObject.needResendWhenEdit()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean z() {
        ni niVar = this.f32686b.f28403b;
        if (!niVar.B && !niVar.D) {
            return true;
        }
        return false;
    }
}
