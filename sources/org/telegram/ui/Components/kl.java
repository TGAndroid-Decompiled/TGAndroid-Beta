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

public final class kl extends pl {

    public final ChatAttachAlertPhotoLayout f30130b;

    public kl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        super(chatAttachAlertPhotoLayout);
        this.f30130b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final boolean A() {
        gi giVar = this.f30130b.f34900b;
        return giVar != null && giVar.Y;
    }

    @Override
    public final void D() {
        boolean z10 = ChatAttachAlertPhotoLayout.f26237m1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30130b;
        chatAttachAlertPhotoLayout.m0();
        AndroidUtilities.runOnUIThread(new bg(this, 23), 150L);
        chatAttachAlertPhotoLayout.C(ChatAttachAlertPhotoLayout.f26239o1.size());
    }

    @Override
    public final org.telegram.ui.cu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        bt btVar;
        org.telegram.ui.cu0 closeIntoObject;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30130b;
        gi giVar = chatAttachAlertPhotoLayout.f34900b;
        if (z11 && (btVar = giVar.N0) != null && (closeIntoObject = ((i40) btVar.f27209b).getCloseIntoObject()) != null) {
            return closeIntoObject;
        }
        org.telegram.ui.Cells.q5 q5VarL = ChatAttachAlertPhotoLayout.L(chatAttachAlertPhotoLayout, i10);
        if (q5VarL == null) {
            return null;
        }
        int[] iArr = new int[2];
        q5VarL.getImageView().getLocationInWindow(iArr);
        if (Build.VERSION.SDK_INT < 26) {
            iArr[0] = iArr[0] - giVar.getLeftInset();
        }
        org.telegram.ui.cu0 cu0Var = new org.telegram.ui.cu0();
        cu0Var.f37154b = iArr[0];
        cu0Var.f37155c = iArr[1];
        cu0Var.d = chatAttachAlertPhotoLayout.A;
        ImageReceiver imageReceiver = q5VarL.getImageView().getImageReceiver();
        cu0Var.f37153a = imageReceiver;
        cu0Var.f37156e = imageReceiver.getBitmapSafe();
        cu0Var.f37161k = q5VarL.getScale();
        cu0Var.f37159i = (int) giVar.l1();
        q5VarL.g(false);
        return cu0Var;
    }

    @Override
    public final void F(boolean z10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30130b;
        gi giVar = chatAttachAlertPhotoLayout.f34900b;
        if (giVar == null || giVar.Y == z10) {
            return;
        }
        giVar.H1(z10, true);
        chatAttachAlertPhotoLayout.Z0.a(!chatAttachAlertPhotoLayout.f34900b.Y, true);
    }

    @Override
    public final void G() {
        gl glVar = this.f30130b.A;
        int childCount = glVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = glVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.q5) {
                ((org.telegram.ui.Cells.q5) childAt).g(true);
            }
        }
    }

    @Override
    public final void W(int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30130b;
        org.telegram.ui.Cells.q5 q5VarL = ChatAttachAlertPhotoLayout.L(chatAttachAlertPhotoLayout, i10);
        if (q5VarL != null) {
            q5VarL.getImageView().q(0, true);
            MediaController.PhotoEntry photoEntryB0 = chatAttachAlertPhotoLayout.b0(i10);
            if (photoEntryB0 == null) {
                return;
            }
            if (photoEntryB0.coverPath != null) {
                q5VarL.getImageView().f(photoEntryB0.coverPath, null, org.telegram.ui.ActionBar.g6.R4);
                return;
            }
            if (photoEntryB0.thumbPath != null) {
                q5VarL.getImageView().f(photoEntryB0.thumbPath, null, org.telegram.ui.ActionBar.g6.R4);
                return;
            }
            if (photoEntryB0.path == null) {
                q5VarL.getImageView().setImageDrawable(org.telegram.ui.ActionBar.g6.R4);
                return;
            }
            q5VarL.getImageView().p(photoEntryB0.orientation, photoEntryB0.invert, true);
            if (photoEntryB0.isVideo) {
                q5VarL.getImageView().f("vthumb://" + photoEntryB0.imageId + ":" + photoEntryB0.path, null, org.telegram.ui.ActionBar.g6.R4);
                return;
            }
            q5VarL.getImageView().f("thumb://" + photoEntryB0.imageId + ":" + photoEntryB0.path, null, org.telegram.ui.ActionBar.g6.R4);
        }
    }

    @Override
    public final void Z(int i10) {
        org.telegram.ui.Cells.q5 q5VarL = ChatAttachAlertPhotoLayout.L(this.f30130b, i10);
        if (q5VarL != null) {
            q5VarL.g(true);
        }
    }

    @Override
    public final long a() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f30130b.f34900b.f28635b0;
        if (n2Var instanceof org.telegram.ui.rn) {
            return ((org.telegram.ui.rn) n2Var).a();
        }
        return 0L;
    }

    @Override
    public final void d() {
        boolean z10 = ChatAttachAlertPhotoLayout.f26237m1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30130b;
        chatAttachAlertPhotoLayout.k0();
        chatAttachAlertPhotoLayout.p0(-1, true);
    }

    @Override
    public final void e(CharSequence charSequence) {
        CharSequence charSequence2;
        ArrayList<TLRPC.MessageEntity> arrayList;
        HashMap map = ChatAttachAlertPhotoLayout.f26239o1;
        if (map.size() > 0) {
            ArrayList arrayList2 = ChatAttachAlertPhotoLayout.f26240p1;
            if (arrayList2.size() > 0) {
                Object obj = map.get(arrayList2.get(0));
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
                    CharSequence spannableStringBuilder = !(charSequence2 instanceof Spannable) ? new SpannableStringBuilder(charSequence2) : charSequence2;
                    MessageObject.addEntitiesToText(spannableStringBuilder, arrayList3, false, false, false, false);
                    charSequence2 = spannableStringBuilder;
                }
                this.f30130b.f34900b.m1().setText(t5.cloneSpans(charSequence2, 3));
            }
        }
    }

    @Override
    public final void i() {
        boolean z10 = ChatAttachAlertPhotoLayout.f26237m1;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        org.telegram.ui.Cells.q5 q5VarL = ChatAttachAlertPhotoLayout.L(this.f30130b, i10);
        if (q5VarL != null) {
            return q5VarL.getImageView().getImageReceiver().getBitmapSafe();
        }
        return null;
    }

    @Override
    public final boolean l() {
        gi giVar = this.f30130b.f34900b;
        return giVar != null && (giVar.f28635b0 instanceof org.telegram.ui.rn);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30130b;
        gi giVar = chatAttachAlertPhotoLayout.f34900b;
        giVar.f28678o2 = true;
        boolean z12 = ChatAttachAlertPhotoLayout.f26237m1;
        MediaController.PhotoEntry photoEntryB0 = chatAttachAlertPhotoLayout.b0(i10);
        if (photoEntryB0 != null) {
            photoEntryB0.editedInfo = videoEditedInfo;
        }
        HashMap map = ChatAttachAlertPhotoLayout.f26239o1;
        if (map.isEmpty() && photoEntryB0 != null) {
            chatAttachAlertPhotoLayout.Q(photoEntryB0, -1);
        }
        if (giVar.b1(giVar.m1().getText())) {
            return;
        }
        giVar.Y0();
        if (PhotoViewer.t1().f35690l7) {
            ArrayList arrayList = ChatAttachAlertPhotoLayout.f26240p1;
            if (!map.isEmpty()) {
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    Object obj = map.get(arrayList.get(i13));
                    if (obj instanceof MediaController.PhotoEntry) {
                        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                        if (i13 == 0) {
                            CharSequence[] charSequenceArr = {PhotoViewer.t1().f35698m7};
                            photoEntry.entities = MediaDataController.getInstance(UserConfig.selectedAccount).getEntities(charSequenceArr, false);
                            CharSequence charSequence = charSequenceArr[0];
                            photoEntry.caption = charSequence;
                            if (giVar.b1(charSequence)) {
                                return;
                            }
                        } else {
                            photoEntry.caption = null;
                        }
                    }
                }
            }
        }
        if (giVar != null) {
            giVar.E1 = false;
        }
        PhotoViewer.t1();
        PhotoViewer.t1().K = false;
        PhotoViewer.t1().f35729q2 = false;
        y4.a0(giVar.F1, giVar.j1() + ChatAttachAlertPhotoLayout.f26239o1.size(), giVar.n1(), new cl(this, z10, i11, z11));
    }

    @Override
    public final boolean q() {
        gi giVar = this.f30130b.f34900b;
        return (giVar == null || giVar.D1 == null) ? false : true;
    }

    @Override
    public final void s() {
        boolean z10 = ChatAttachAlertPhotoLayout.f26237m1;
        this.f30130b.p0(-1, false);
    }

    @Override
    public final boolean w() {
        MessageObject messageObject;
        gi giVar = this.f30130b.f34900b;
        return (giVar == null || (messageObject = giVar.D1) == null || !messageObject.needResendWhenEdit()) ? false : true;
    }

    @Override
    public final boolean z() {
        gi giVar = this.f30130b.f34900b;
        return (giVar.B || giVar.D) ? false : true;
    }
}
