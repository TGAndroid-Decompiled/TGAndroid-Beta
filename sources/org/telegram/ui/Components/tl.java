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
public final class tl extends yl {
    public final ChatAttachAlertPhotoLayout f28995b;

    public tl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        super(chatAttachAlertPhotoLayout);
        this.f28995b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final boolean A() {
        li liVar = this.f28995b.f24282b;
        if (liVar != null && liVar.Z) {
            return true;
        }
        return false;
    }

    @Override
    public final void D() {
        boolean z4 = ChatAttachAlertPhotoLayout.f22867n1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28995b;
        chatAttachAlertPhotoLayout.m0();
        AndroidUtilities.runOnUIThread(new fg(this, 23), 150L);
        chatAttachAlertPhotoLayout.B(ChatAttachAlertPhotoLayout.f22869p1.size());
    }

    @Override
    public final org.telegram.ui.qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        lt ltVar;
        org.telegram.ui.qu0 closeIntoObject;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28995b;
        li liVar = chatAttachAlertPhotoLayout.f24282b;
        if (z10 && (ltVar = liVar.O0) != null && (closeIntoObject = ((w40) ltVar.f26873b).getCloseIntoObject()) != null) {
            return closeIntoObject;
        }
        org.telegram.ui.Cells.s5 K = ChatAttachAlertPhotoLayout.K(chatAttachAlertPhotoLayout, i10);
        if (K != null) {
            int[] iArr = new int[2];
            K.getImageView().getLocationInWindow(iArr);
            if (Build.VERSION.SDK_INT < 26) {
                iArr[0] = iArr[0] - liVar.getLeftInset();
            }
            org.telegram.ui.qu0 qu0Var = new org.telegram.ui.qu0();
            qu0Var.f37488b = iArr[0];
            qu0Var.f37489c = iArr[1];
            qu0Var.d = chatAttachAlertPhotoLayout.B;
            ImageReceiver imageReceiver = K.getImageView().getImageReceiver();
            qu0Var.f37487a = imageReceiver;
            qu0Var.e = imageReceiver.getBitmapSafe();
            qu0Var.f37494k = K.getScale();
            qu0Var.f37492i = (int) liVar.l1();
            K.g(false);
            return qu0Var;
        }
        return null;
    }

    @Override
    public final void F(boolean z4) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28995b;
        li liVar = chatAttachAlertPhotoLayout.f24282b;
        if (liVar != null && liVar.Z != z4) {
            liVar.H1(z4, true);
            chatAttachAlertPhotoLayout.f22873a1.a(!chatAttachAlertPhotoLayout.f24282b.Z, true);
        }
    }

    @Override
    public final void G() {
        ol olVar = this.f28995b.B;
        int childCount = olVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = olVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.s5) {
                ((org.telegram.ui.Cells.s5) childAt).g(true);
            }
        }
    }

    @Override
    public final void W(int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28995b;
        org.telegram.ui.Cells.s5 K = ChatAttachAlertPhotoLayout.K(chatAttachAlertPhotoLayout, i10);
        if (K != null) {
            K.getImageView().q(0, true);
            MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(i10);
            if (b02 != null) {
                if (b02.coverPath != null) {
                    K.getImageView().f(b02.coverPath, null, org.telegram.ui.ActionBar.j6.R4);
                } else if (b02.thumbPath != null) {
                    K.getImageView().f(b02.thumbPath, null, org.telegram.ui.ActionBar.j6.R4);
                } else if (b02.path != null) {
                    K.getImageView().p(b02.orientation, b02.invert, true);
                    if (b02.isVideo) {
                        p9 imageView = K.getImageView();
                        imageView.f("vthumb://" + b02.imageId + ":" + b02.path, null, org.telegram.ui.ActionBar.j6.R4);
                        return;
                    }
                    p9 imageView2 = K.getImageView();
                    imageView2.f("thumb://" + b02.imageId + ":" + b02.path, null, org.telegram.ui.ActionBar.j6.R4);
                } else {
                    K.getImageView().setImageDrawable(org.telegram.ui.ActionBar.j6.R4);
                }
            }
        }
    }

    @Override
    public final void Z(int i10) {
        org.telegram.ui.Cells.s5 K = ChatAttachAlertPhotoLayout.K(this.f28995b, i10);
        if (K != null) {
            K.g(true);
        }
    }

    @Override
    public final long a() {
        org.telegram.ui.ActionBar.p2 p2Var = this.f28995b.f24282b.f26685c0;
        if (p2Var instanceof org.telegram.ui.zn) {
            return ((org.telegram.ui.zn) p2Var).a();
        }
        return 0L;
    }

    @Override
    public final void d() {
        boolean z4 = ChatAttachAlertPhotoLayout.f22867n1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28995b;
        chatAttachAlertPhotoLayout.k0();
        chatAttachAlertPhotoLayout.p0(-1, true);
    }

    @Override
    public final void e(CharSequence charSequence) {
        CharSequence charSequence2;
        ArrayList<TLRPC.MessageEntity> arrayList;
        SpannableStringBuilder spannableStringBuilder;
        HashMap hashMap = ChatAttachAlertPhotoLayout.f22869p1;
        if (hashMap.size() > 0) {
            ArrayList arrayList2 = ChatAttachAlertPhotoLayout.f22870q1;
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
                this.f28995b.f24282b.m1().setText(u5.cloneSpans(charSequence2, 3));
            }
        }
    }

    @Override
    public final void i() {
        boolean z4 = ChatAttachAlertPhotoLayout.f22867n1;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        org.telegram.ui.Cells.s5 K = ChatAttachAlertPhotoLayout.K(this.f28995b, i10);
        if (K != null) {
            return K.getImageView().getImageReceiver().getBitmapSafe();
        }
        return null;
    }

    @Override
    public final boolean l() {
        li liVar = this.f28995b.f24282b;
        if (liVar != null && (liVar.f26685c0 instanceof org.telegram.ui.zn)) {
            return true;
        }
        return false;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z4, int i11, int i12, boolean z10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28995b;
        li liVar = chatAttachAlertPhotoLayout.f24282b;
        liVar.f26726p2 = true;
        boolean z11 = ChatAttachAlertPhotoLayout.f22867n1;
        MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(i10);
        if (b02 != null) {
            b02.editedInfo = videoEditedInfo;
        }
        HashMap hashMap = ChatAttachAlertPhotoLayout.f22869p1;
        if (hashMap.isEmpty() && b02 != null) {
            chatAttachAlertPhotoLayout.Q(b02, -1);
        }
        if (!liVar.b1(liVar.m1().getText())) {
            liVar.Y0();
            if (PhotoViewer.t1().f31783m7) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.f22870q1;
                if (!hashMap.isEmpty()) {
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        Object obj = hashMap.get(arrayList.get(i13));
                        if (obj instanceof MediaController.PhotoEntry) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                            if (i13 == 0) {
                                CharSequence[] charSequenceArr = {PhotoViewer.t1().f31793n7};
                                photoEntry.entities = MediaDataController.getInstance(UserConfig.selectedAccount).getEntities(charSequenceArr, false);
                                CharSequence charSequence = charSequenceArr[0];
                                photoEntry.caption = charSequence;
                                if (liVar.b1(charSequence)) {
                                    return;
                                }
                            } else {
                                photoEntry.caption = null;
                            }
                        }
                    }
                }
            }
            if (liVar != null) {
                liVar.F1 = false;
            }
            PhotoViewer.t1();
            PhotoViewer.t1().L = false;
            PhotoViewer.t1().f31825r2 = false;
            z4.a0(liVar.G1, liVar.j1() + ChatAttachAlertPhotoLayout.f22869p1.size(), liVar.n1(), new jl(this, z4, i11, z10));
        }
    }

    @Override
    public final boolean q() {
        li liVar = this.f28995b.f24282b;
        if (liVar != null && liVar.E1 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void s() {
        boolean z4 = ChatAttachAlertPhotoLayout.f22867n1;
        this.f28995b.p0(-1, false);
    }

    @Override
    public final boolean w() {
        MessageObject messageObject;
        li liVar = this.f28995b.f24282b;
        if (liVar != null && (messageObject = liVar.E1) != null && messageObject.needResendWhenEdit()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean z() {
        li liVar = this.f28995b.f24282b;
        if (!liVar.C && !liVar.E) {
            return true;
        }
        return false;
    }
}
