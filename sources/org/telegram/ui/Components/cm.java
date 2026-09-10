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
public final class cm extends hm {
    public final ChatAttachAlertPhotoLayout f22179b;

    public cm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        super(chatAttachAlertPhotoLayout);
        this.f22179b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final boolean A() {
        yi yiVar = this.f22179b.f26422b;
        if (yiVar != null && yiVar.f29356c0) {
            return true;
        }
        return false;
    }

    @Override
    public final void D() {
        boolean z10 = ChatAttachAlertPhotoLayout.f20983q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f22179b;
        chatAttachAlertPhotoLayout.m0();
        AndroidUtilities.runOnUIThread(new rg(this, 23), 150L);
        chatAttachAlertPhotoLayout.A(ChatAttachAlertPhotoLayout.f20985s1.size());
    }

    @Override
    public final org.telegram.ui.ev0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ut utVar;
        org.telegram.ui.ev0 closeIntoObject;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f22179b;
        yi yiVar = chatAttachAlertPhotoLayout.f26422b;
        if (z11 && (utVar = yiVar.R0) != null && (closeIntoObject = ((d50) utVar.f27744b).getCloseIntoObject()) != null) {
            return closeIntoObject;
        }
        org.telegram.ui.Cells.t5 L = ChatAttachAlertPhotoLayout.L(chatAttachAlertPhotoLayout, i10);
        if (L != null) {
            int[] iArr = new int[2];
            L.getImageView().getLocationInWindow(iArr);
            if (Build.VERSION.SDK_INT < 26) {
                iArr[0] = iArr[0] - yiVar.getLeftInset();
            }
            org.telegram.ui.ev0 ev0Var = new org.telegram.ui.ev0();
            ev0Var.f32617b = iArr[0];
            ev0Var.f32618c = iArr[1];
            ev0Var.d = chatAttachAlertPhotoLayout.E;
            ImageReceiver imageReceiver = L.getImageView().getImageReceiver();
            ev0Var.f32616a = imageReceiver;
            ev0Var.e = imageReceiver.getBitmapSafe();
            ev0Var.f32623k = L.getScale();
            ev0Var.f32621i = (int) yiVar.l1();
            L.g(false);
            return ev0Var;
        }
        return null;
    }

    @Override
    public final void F(boolean z10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f22179b;
        yi yiVar = chatAttachAlertPhotoLayout.f26422b;
        if (yiVar != null && yiVar.f29356c0 != z10) {
            yiVar.H1(z10, true);
            chatAttachAlertPhotoLayout.f20995d1.a(!chatAttachAlertPhotoLayout.f26422b.f29356c0, true);
        }
    }

    @Override
    public final void G() {
        yl ylVar = this.f22179b.E;
        int childCount = ylVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = ylVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.t5) {
                ((org.telegram.ui.Cells.t5) childAt).g(true);
            }
        }
    }

    @Override
    public final void W(int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f22179b;
        org.telegram.ui.Cells.t5 L = ChatAttachAlertPhotoLayout.L(chatAttachAlertPhotoLayout, i10);
        if (L != null) {
            L.getImageView().q(0, true);
            MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(i10);
            if (b02 != null) {
                if (b02.coverPath != null) {
                    L.getImageView().f(b02.coverPath, null, org.telegram.ui.ActionBar.j6.R4);
                } else if (b02.thumbPath != null) {
                    L.getImageView().f(b02.thumbPath, null, org.telegram.ui.ActionBar.j6.R4);
                } else if (b02.path != null) {
                    L.getImageView().p(b02.orientation, b02.invert, true);
                    if (b02.isVideo) {
                        w9 imageView = L.getImageView();
                        imageView.f("vthumb://" + b02.imageId + ":" + b02.path, null, org.telegram.ui.ActionBar.j6.R4);
                        return;
                    }
                    w9 imageView2 = L.getImageView();
                    imageView2.f("thumb://" + b02.imageId + ":" + b02.path, null, org.telegram.ui.ActionBar.j6.R4);
                } else {
                    L.getImageView().setImageDrawable(org.telegram.ui.ActionBar.j6.R4);
                }
            }
        }
    }

    @Override
    public final void Z(int i10) {
        org.telegram.ui.Cells.t5 L = ChatAttachAlertPhotoLayout.L(this.f22179b, i10);
        if (L != null) {
            L.g(true);
        }
    }

    @Override
    public final long a() {
        org.telegram.ui.ActionBar.p2 p2Var = this.f22179b.f26422b.f29366f0;
        if (p2Var instanceof org.telegram.ui.eo) {
            return ((org.telegram.ui.eo) p2Var).a();
        }
        return 0L;
    }

    @Override
    public final void d() {
        boolean z10 = ChatAttachAlertPhotoLayout.f20983q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f22179b;
        chatAttachAlertPhotoLayout.k0();
        chatAttachAlertPhotoLayout.p0(-1, true);
    }

    @Override
    public final void e(CharSequence charSequence) {
        CharSequence charSequence2;
        ArrayList<TLRPC.MessageEntity> arrayList;
        SpannableStringBuilder spannableStringBuilder;
        HashMap hashMap = ChatAttachAlertPhotoLayout.f20985s1;
        if (hashMap.size() > 0) {
            ArrayList arrayList2 = ChatAttachAlertPhotoLayout.f20986t1;
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
                this.f22179b.f26422b.m1().setText(y5.cloneSpans(charSequence2, 3));
            }
        }
    }

    @Override
    public final void i() {
        boolean z10 = ChatAttachAlertPhotoLayout.f20983q1;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        org.telegram.ui.Cells.t5 L = ChatAttachAlertPhotoLayout.L(this.f22179b, i10);
        if (L != null) {
            return L.getImageView().getImageReceiver().getBitmapSafe();
        }
        return null;
    }

    @Override
    public final boolean l() {
        yi yiVar = this.f22179b.f26422b;
        if (yiVar != null && (yiVar.f29366f0 instanceof org.telegram.ui.eo)) {
            return true;
        }
        return false;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f22179b;
        yi yiVar = chatAttachAlertPhotoLayout.f26422b;
        yiVar.f29408s2 = true;
        boolean z12 = ChatAttachAlertPhotoLayout.f20983q1;
        MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(i10);
        if (b02 != null) {
            b02.editedInfo = videoEditedInfo;
        }
        HashMap hashMap = ChatAttachAlertPhotoLayout.f20985s1;
        if (hashMap.isEmpty() && b02 != null) {
            chatAttachAlertPhotoLayout.Q(b02, -1);
        }
        if (!yiVar.b1(yiVar.m1().getText())) {
            yiVar.Y0();
            if (PhotoViewer.t1().f30150p7) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.f20986t1;
                if (!hashMap.isEmpty()) {
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        Object obj = hashMap.get(arrayList.get(i13));
                        if (obj instanceof MediaController.PhotoEntry) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                            if (i13 == 0) {
                                CharSequence[] charSequenceArr = {PhotoViewer.t1().f30158q7};
                                photoEntry.entities = MediaDataController.getInstance(UserConfig.selectedAccount).getEntities(charSequenceArr, false);
                                CharSequence charSequence = charSequenceArr[0];
                                photoEntry.caption = charSequence;
                                if (yiVar.b1(charSequence)) {
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
                yiVar.I1 = false;
            }
            PhotoViewer.t1();
            PhotoViewer.t1().O = false;
            PhotoViewer.t1().f30191u2 = false;
            d5.a0(yiVar.J1, yiVar.j1() + ChatAttachAlertPhotoLayout.f20985s1.size(), yiVar.n1(), new ul(this, z10, i11, z11));
        }
    }

    @Override
    public final boolean q() {
        yi yiVar = this.f22179b.f26422b;
        if (yiVar != null && yiVar.H1 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void s() {
        boolean z10 = ChatAttachAlertPhotoLayout.f20983q1;
        this.f22179b.p0(-1, false);
    }

    @Override
    public final boolean w() {
        MessageObject messageObject;
        yi yiVar = this.f22179b.f26422b;
        if (yiVar != null && (messageObject = yiVar.H1) != null && messageObject.needResendWhenEdit()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean z() {
        yi yiVar = this.f22179b.f26422b;
        if (!yiVar.F && !yiVar.H) {
            return true;
        }
        return false;
    }
}
