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
public final class am extends fm {
    public final ChatAttachAlertPhotoLayout f24641b;

    public am(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        super(chatAttachAlertPhotoLayout);
        this.f24641b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final boolean A() {
        xi xiVar = this.f24641b.f29741b;
        if (xiVar != null && xiVar.f32899c0) {
            return true;
        }
        return false;
    }

    @Override
    public final void D() {
        boolean z10 = ChatAttachAlertPhotoLayout.f24025q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f24641b;
        chatAttachAlertPhotoLayout.m0();
        AndroidUtilities.runOnUIThread(new qg(this, 23), 150L);
        chatAttachAlertPhotoLayout.A(ChatAttachAlertPhotoLayout.f24027s1.size());
    }

    @Override
    public final org.telegram.ui.yu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        tt ttVar;
        org.telegram.ui.yu0 closeIntoObject;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f24641b;
        xi xiVar = chatAttachAlertPhotoLayout.f29741b;
        if (z11 && (ttVar = xiVar.R0) != null && (closeIntoObject = ((x40) ttVar.f31238b).getCloseIntoObject()) != null) {
            return closeIntoObject;
        }
        org.telegram.ui.Cells.t5 J = ChatAttachAlertPhotoLayout.J(chatAttachAlertPhotoLayout, i10);
        if (J != null) {
            int[] iArr = new int[2];
            J.getImageView().getLocationInWindow(iArr);
            if (Build.VERSION.SDK_INT < 26) {
                iArr[0] = iArr[0] - xiVar.getLeftInset();
            }
            org.telegram.ui.yu0 yu0Var = new org.telegram.ui.yu0();
            yu0Var.f43621b = iArr[0];
            yu0Var.f43622c = iArr[1];
            yu0Var.d = chatAttachAlertPhotoLayout.E;
            ImageReceiver imageReceiver = J.getImageView().getImageReceiver();
            yu0Var.f43620a = imageReceiver;
            yu0Var.f43623e = imageReceiver.getBitmapSafe();
            yu0Var.f43628k = J.getScale();
            yu0Var.f43626i = (int) xiVar.l1();
            J.g(false);
            return yu0Var;
        }
        return null;
    }

    @Override
    public final void F(boolean z10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f24641b;
        xi xiVar = chatAttachAlertPhotoLayout.f29741b;
        if (xiVar != null && xiVar.f32899c0 != z10) {
            xiVar.G1(z10, true);
            chatAttachAlertPhotoLayout.f24037d1.a(!chatAttachAlertPhotoLayout.f29741b.f32899c0, true);
        }
    }

    @Override
    public final void G() {
        wl wlVar = this.f24641b.E;
        int childCount = wlVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = wlVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.t5) {
                ((org.telegram.ui.Cells.t5) childAt).g(true);
            }
        }
    }

    @Override
    public final void W(int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f24641b;
        org.telegram.ui.Cells.t5 J = ChatAttachAlertPhotoLayout.J(chatAttachAlertPhotoLayout, i10);
        if (J != null) {
            J.getImageView().q(0, true);
            MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(i10);
            if (b02 != null) {
                if (b02.coverPath != null) {
                    J.getImageView().f(b02.coverPath, null, org.telegram.ui.ActionBar.i6.R4);
                } else if (b02.thumbPath != null) {
                    J.getImageView().f(b02.thumbPath, null, org.telegram.ui.ActionBar.i6.R4);
                } else if (b02.path != null) {
                    J.getImageView().p(b02.orientation, b02.invert, true);
                    if (b02.isVideo) {
                        w9 imageView = J.getImageView();
                        imageView.f("vthumb://" + b02.imageId + ":" + b02.path, null, org.telegram.ui.ActionBar.i6.R4);
                        return;
                    }
                    w9 imageView2 = J.getImageView();
                    imageView2.f("thumb://" + b02.imageId + ":" + b02.path, null, org.telegram.ui.ActionBar.i6.R4);
                } else {
                    J.getImageView().setImageDrawable(org.telegram.ui.ActionBar.i6.R4);
                }
            }
        }
    }

    @Override
    public final void Z(int i10) {
        org.telegram.ui.Cells.t5 J = ChatAttachAlertPhotoLayout.J(this.f24641b, i10);
        if (J != null) {
            J.g(true);
        }
    }

    @Override
    public final long a() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f24641b.f29741b.f32910f0;
        if (n2Var instanceof org.telegram.ui.yn) {
            return ((org.telegram.ui.yn) n2Var).a();
        }
        return 0L;
    }

    @Override
    public final void d() {
        boolean z10 = ChatAttachAlertPhotoLayout.f24025q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f24641b;
        chatAttachAlertPhotoLayout.k0();
        chatAttachAlertPhotoLayout.p0(-1, true);
    }

    @Override
    public final void e(CharSequence charSequence) {
        CharSequence charSequence2;
        ArrayList<TLRPC.MessageEntity> arrayList;
        SpannableStringBuilder spannableStringBuilder;
        HashMap hashMap = ChatAttachAlertPhotoLayout.f24027s1;
        if (hashMap.size() > 0) {
            ArrayList arrayList2 = ChatAttachAlertPhotoLayout.f24028t1;
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
                this.f24641b.f29741b.m1().setText(z5.cloneSpans(charSequence2, 3));
            }
        }
    }

    @Override
    public final void i() {
        boolean z10 = ChatAttachAlertPhotoLayout.f24025q1;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        org.telegram.ui.Cells.t5 J = ChatAttachAlertPhotoLayout.J(this.f24641b, i10);
        if (J != null) {
            return J.getImageView().getImageReceiver().getBitmapSafe();
        }
        return null;
    }

    @Override
    public final boolean l() {
        xi xiVar = this.f24641b.f29741b;
        if (xiVar != null && (xiVar.f32910f0 instanceof org.telegram.ui.yn)) {
            return true;
        }
        return false;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f24641b;
        xi xiVar = chatAttachAlertPhotoLayout.f29741b;
        xiVar.f32952s2 = true;
        boolean z12 = ChatAttachAlertPhotoLayout.f24025q1;
        MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(i10);
        if (b02 != null) {
            b02.editedInfo = videoEditedInfo;
        }
        HashMap hashMap = ChatAttachAlertPhotoLayout.f24027s1;
        if (hashMap.isEmpty() && b02 != null) {
            chatAttachAlertPhotoLayout.O(b02, -1);
        }
        if (!xiVar.b1(xiVar.m1().getText())) {
            xiVar.Z0();
            if (PhotoViewer.t1().f34015p7) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.f24028t1;
                if (!hashMap.isEmpty()) {
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        Object obj = hashMap.get(arrayList.get(i13));
                        if (obj instanceof MediaController.PhotoEntry) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                            if (i13 == 0) {
                                CharSequence[] charSequenceArr = {PhotoViewer.t1().f34023q7};
                                photoEntry.entities = MediaDataController.getInstance(UserConfig.selectedAccount).getEntities(charSequenceArr, false);
                                CharSequence charSequence = charSequenceArr[0];
                                photoEntry.caption = charSequence;
                                if (xiVar.b1(charSequence)) {
                                    return;
                                }
                            } else {
                                photoEntry.caption = null;
                            }
                        }
                    }
                }
            }
            if (xiVar != null) {
                xiVar.I1 = false;
            }
            PhotoViewer.t1();
            PhotoViewer.t1().O = false;
            PhotoViewer.t1().f34056u2 = false;
            e5.a0(xiVar.J1, xiVar.j1() + ChatAttachAlertPhotoLayout.f24027s1.size(), xiVar.n1(), new sl(this, z10, i11, z11));
        }
    }

    @Override
    public final boolean q() {
        xi xiVar = this.f24641b.f29741b;
        if (xiVar != null && xiVar.H1 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void s() {
        boolean z10 = ChatAttachAlertPhotoLayout.f24025q1;
        this.f24641b.p0(-1, false);
    }

    @Override
    public final boolean w() {
        MessageObject messageObject;
        xi xiVar = this.f24641b.f29741b;
        if (xiVar != null && (messageObject = xiVar.H1) != null && messageObject.needResendWhenEdit()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean z() {
        xi xiVar = this.f24641b.f29741b;
        if (!xiVar.F && !xiVar.H) {
            return true;
        }
        return false;
    }
}
