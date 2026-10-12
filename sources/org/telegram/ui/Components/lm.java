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
public final class lm extends qm {
    public final ChatAttachAlertPhotoLayout f27069b;

    public lm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        super(chatAttachAlertPhotoLayout);
        this.f27069b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final boolean A() {
        vi viVar = this.f27069b.f27671b;
        if (viVar != null && viVar.f29991c0) {
            return true;
        }
        return false;
    }

    @Override
    public final void D() {
        boolean z10 = ChatAttachAlertPhotoLayout.f23018q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f27069b;
        chatAttachAlertPhotoLayout.m0();
        AndroidUtilities.runOnUIThread(new qg(this, 23), 150L);
        chatAttachAlertPhotoLayout.E(ChatAttachAlertPhotoLayout.f23020s1.size());
    }

    @Override
    public final org.telegram.ui.kv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        du duVar;
        org.telegram.ui.kv0 closeIntoObject;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f27069b;
        vi viVar = chatAttachAlertPhotoLayout.f27671b;
        if (z11 && (duVar = viVar.U0) != null && (closeIntoObject = ((h50) duVar.f24493b).getCloseIntoObject()) != null) {
            return closeIntoObject;
        }
        org.telegram.ui.Cells.t5 N = ChatAttachAlertPhotoLayout.N(chatAttachAlertPhotoLayout, i10);
        if (N != null) {
            int[] iArr = new int[2];
            N.getImageView().getLocationInWindow(iArr);
            if (Build.VERSION.SDK_INT < 26) {
                iArr[0] = iArr[0] - viVar.getLeftInset();
            }
            org.telegram.ui.kv0 kv0Var = new org.telegram.ui.kv0();
            kv0Var.f37752b = iArr[0];
            kv0Var.f37753c = iArr[1];
            kv0Var.d = chatAttachAlertPhotoLayout.E;
            ImageReceiver imageReceiver = N.getImageView().getImageReceiver();
            kv0Var.f37751a = imageReceiver;
            kv0Var.e = imageReceiver.getBitmapSafe();
            kv0Var.f37758k = N.getScale();
            kv0Var.f37756i = (int) viVar.n1();
            N.g(false);
            return kv0Var;
        }
        return null;
    }

    @Override
    public final void F(boolean z10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f27069b;
        vi viVar = chatAttachAlertPhotoLayout.f27671b;
        if (viVar != null && viVar.f29991c0 != z10) {
            viVar.K1(z10, true);
            chatAttachAlertPhotoLayout.f23030d1.a(!chatAttachAlertPhotoLayout.f27671b.f29991c0, true);
        }
    }

    @Override
    public final void G() {
        hm hmVar = this.f27069b.E;
        int childCount = hmVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = hmVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.t5) {
                ((org.telegram.ui.Cells.t5) childAt).g(true);
            }
        }
    }

    @Override
    public final void W(int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f27069b;
        org.telegram.ui.Cells.t5 N = ChatAttachAlertPhotoLayout.N(chatAttachAlertPhotoLayout, i10);
        if (N != null) {
            N.getImageView().q(0, true);
            MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(i10);
            if (b02 != null) {
                if (b02.coverPath != null) {
                    N.getImageView().f(b02.coverPath, null, org.telegram.ui.ActionBar.g6.R4);
                } else if (b02.thumbPath != null) {
                    N.getImageView().f(b02.thumbPath, null, org.telegram.ui.ActionBar.g6.R4);
                } else if (b02.path != null) {
                    N.getImageView().p(b02.orientation, b02.invert, true);
                    if (b02.isVideo) {
                        z9 imageView = N.getImageView();
                        imageView.f("vthumb://" + b02.imageId + ":" + b02.path, null, org.telegram.ui.ActionBar.g6.R4);
                        return;
                    }
                    z9 imageView2 = N.getImageView();
                    imageView2.f("thumb://" + b02.imageId + ":" + b02.path, null, org.telegram.ui.ActionBar.g6.R4);
                } else {
                    N.getImageView().setImageDrawable(org.telegram.ui.ActionBar.g6.R4);
                }
            }
        }
    }

    @Override
    public final void Z(int i10) {
        org.telegram.ui.Cells.t5 N = ChatAttachAlertPhotoLayout.N(this.f27069b, i10);
        if (N != null) {
            N.g(true);
        }
    }

    @Override
    public final long a() {
        org.telegram.ui.ActionBar.m2 m2Var = this.f27069b.f27671b.f30001f0;
        if (m2Var instanceof org.telegram.ui.fo) {
            return ((org.telegram.ui.fo) m2Var).a();
        }
        return 0L;
    }

    @Override
    public final void d() {
        boolean z10 = ChatAttachAlertPhotoLayout.f23018q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f27069b;
        chatAttachAlertPhotoLayout.k0();
        chatAttachAlertPhotoLayout.p0(-1, true);
    }

    @Override
    public final void e(CharSequence charSequence) {
        CharSequence charSequence2;
        ArrayList<TLRPC.MessageEntity> arrayList;
        SpannableStringBuilder spannableStringBuilder;
        HashMap hashMap = ChatAttachAlertPhotoLayout.f23020s1;
        if (hashMap.size() > 0) {
            ArrayList arrayList2 = ChatAttachAlertPhotoLayout.f23021t1;
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
                this.f27069b.f27671b.o1().setText(b6.cloneSpans(charSequence2, 3));
            }
        }
    }

    @Override
    public final void i() {
        boolean z10 = ChatAttachAlertPhotoLayout.f23018q1;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        org.telegram.ui.Cells.t5 N = ChatAttachAlertPhotoLayout.N(this.f27069b, i10);
        if (N != null) {
            return N.getImageView().getImageReceiver().getBitmapSafe();
        }
        return null;
    }

    @Override
    public final boolean l() {
        vi viVar = this.f27069b.f27671b;
        if (viVar != null && (viVar.f30001f0 instanceof org.telegram.ui.fo)) {
            return true;
        }
        return false;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f27069b;
        vi viVar = chatAttachAlertPhotoLayout.f27671b;
        viVar.f30052v2 = true;
        boolean z12 = ChatAttachAlertPhotoLayout.f23018q1;
        MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(i10);
        if (b02 != null) {
            b02.editedInfo = videoEditedInfo;
        }
        HashMap hashMap = ChatAttachAlertPhotoLayout.f23020s1;
        if (hashMap.isEmpty() && b02 != null) {
            chatAttachAlertPhotoLayout.Q(b02, -1);
        }
        if (!viVar.d1(viVar.o1().getText())) {
            viVar.a1();
            if (PhotoViewer.t1().f32328p7) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.f23021t1;
                if (!hashMap.isEmpty()) {
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        Object obj = hashMap.get(arrayList.get(i13));
                        if (obj instanceof MediaController.PhotoEntry) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                            if (i13 == 0) {
                                CharSequence[] charSequenceArr = {PhotoViewer.t1().f32336q7};
                                photoEntry.entities = MediaDataController.getInstance(UserConfig.selectedAccount).getEntities(charSequenceArr, false);
                                CharSequence charSequence = charSequenceArr[0];
                                photoEntry.caption = charSequence;
                                if (viVar.d1(charSequence)) {
                                    return;
                                }
                            } else {
                                photoEntry.caption = null;
                            }
                        }
                    }
                }
            }
            if (viVar != null) {
                viVar.L1 = false;
            }
            PhotoViewer.t1();
            PhotoViewer.t1().O = false;
            PhotoViewer.t1().f32369u2 = false;
            g5.Z(viVar.M1, viVar.l1() + ChatAttachAlertPhotoLayout.f23020s1.size(), viVar.p1(), new dm(this, z10, i11, z11));
        }
    }

    @Override
    public final boolean q() {
        vi viVar = this.f27069b.f27671b;
        if (viVar != null && viVar.K1 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void s() {
        boolean z10 = ChatAttachAlertPhotoLayout.f23018q1;
        this.f27069b.p0(-1, false);
    }

    @Override
    public final boolean w() {
        MessageObject messageObject;
        vi viVar = this.f27069b.f27671b;
        if (viVar != null && (messageObject = viVar.K1) != null && messageObject.needResendWhenEdit()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean z() {
        vi viVar = this.f27069b.f27671b;
        if (!viVar.F && !viVar.H) {
            return true;
        }
        return false;
    }
}
