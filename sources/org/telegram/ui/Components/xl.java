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
public final class xl extends cm {
    public final ChatAttachAlertPhotoLayout f32604b;

    public xl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        super(chatAttachAlertPhotoLayout);
        this.f32604b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final boolean A() {
        vi viVar = this.f32604b.f28753b;
        if (viVar != null && viVar.f31268c0) {
            return true;
        }
        return false;
    }

    @Override
    public final void D() {
        boolean z10 = ChatAttachAlertPhotoLayout.f23831q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f32604b;
        chatAttachAlertPhotoLayout.m0();
        AndroidUtilities.runOnUIThread(new pg(this, 23), 150L);
        chatAttachAlertPhotoLayout.B(ChatAttachAlertPhotoLayout.f23833s1.size());
    }

    @Override
    public final org.telegram.ui.cv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ot otVar;
        org.telegram.ui.cv0 closeIntoObject;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f32604b;
        vi viVar = chatAttachAlertPhotoLayout.f28753b;
        if (z11 && (otVar = viVar.R0) != null && (closeIntoObject = ((t40) otVar.f29180b).getCloseIntoObject()) != null) {
            return closeIntoObject;
        }
        org.telegram.ui.Cells.s5 L = ChatAttachAlertPhotoLayout.L(chatAttachAlertPhotoLayout, i10);
        if (L != null) {
            int[] iArr = new int[2];
            L.getImageView().getLocationInWindow(iArr);
            if (Build.VERSION.SDK_INT < 26) {
                iArr[0] = iArr[0] - viVar.getLeftInset();
            }
            org.telegram.ui.cv0 cv0Var = new org.telegram.ui.cv0();
            cv0Var.f35541b = iArr[0];
            cv0Var.f35542c = iArr[1];
            cv0Var.d = chatAttachAlertPhotoLayout.E;
            ImageReceiver imageReceiver = L.getImageView().getImageReceiver();
            cv0Var.f35540a = imageReceiver;
            cv0Var.f35543e = imageReceiver.getBitmapSafe();
            cv0Var.f35548k = L.getScale();
            cv0Var.f35546i = (int) viVar.l1();
            L.g(false);
            return cv0Var;
        }
        return null;
    }

    @Override
    public final void F(boolean z10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f32604b;
        vi viVar = chatAttachAlertPhotoLayout.f28753b;
        if (viVar != null && viVar.f31268c0 != z10) {
            viVar.H1(z10, true);
            chatAttachAlertPhotoLayout.f23843d1.a(!chatAttachAlertPhotoLayout.f28753b.f31268c0, true);
        }
    }

    @Override
    public final void G() {
        tl tlVar = this.f32604b.E;
        int childCount = tlVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = tlVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.s5) {
                ((org.telegram.ui.Cells.s5) childAt).g(true);
            }
        }
    }

    @Override
    public final void W(int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f32604b;
        org.telegram.ui.Cells.s5 L = ChatAttachAlertPhotoLayout.L(chatAttachAlertPhotoLayout, i10);
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
                        x9 imageView = L.getImageView();
                        imageView.f("vthumb://" + b02.imageId + ":" + b02.path, null, org.telegram.ui.ActionBar.j6.R4);
                        return;
                    }
                    x9 imageView2 = L.getImageView();
                    imageView2.f("thumb://" + b02.imageId + ":" + b02.path, null, org.telegram.ui.ActionBar.j6.R4);
                } else {
                    L.getImageView().setImageDrawable(org.telegram.ui.ActionBar.j6.R4);
                }
            }
        }
    }

    @Override
    public final void Z(int i10) {
        org.telegram.ui.Cells.s5 L = ChatAttachAlertPhotoLayout.L(this.f32604b, i10);
        if (L != null) {
            L.g(true);
        }
    }

    @Override
    public final long a() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f32604b.f28753b.f31279f0;
        if (n2Var instanceof org.telegram.ui.co) {
            return ((org.telegram.ui.co) n2Var).a();
        }
        return 0L;
    }

    @Override
    public final void d() {
        boolean z10 = ChatAttachAlertPhotoLayout.f23831q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f32604b;
        chatAttachAlertPhotoLayout.k0();
        chatAttachAlertPhotoLayout.p0(-1, true);
    }

    @Override
    public final void e(CharSequence charSequence) {
        CharSequence charSequence2;
        ArrayList<TLRPC.MessageEntity> arrayList;
        SpannableStringBuilder spannableStringBuilder;
        HashMap hashMap = ChatAttachAlertPhotoLayout.f23833s1;
        if (hashMap.size() > 0) {
            ArrayList arrayList2 = ChatAttachAlertPhotoLayout.f23834t1;
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
                this.f32604b.f28753b.m1().setText(z5.cloneSpans(charSequence2, 3));
            }
        }
    }

    @Override
    public final void i() {
        boolean z10 = ChatAttachAlertPhotoLayout.f23831q1;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        org.telegram.ui.Cells.s5 L = ChatAttachAlertPhotoLayout.L(this.f32604b, i10);
        if (L != null) {
            return L.getImageView().getImageReceiver().getBitmapSafe();
        }
        return null;
    }

    @Override
    public final boolean l() {
        vi viVar = this.f32604b.f28753b;
        if (viVar != null && (viVar.f31279f0 instanceof org.telegram.ui.co)) {
            return true;
        }
        return false;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f32604b;
        vi viVar = chatAttachAlertPhotoLayout.f28753b;
        viVar.f31321s2 = true;
        boolean z12 = ChatAttachAlertPhotoLayout.f23831q1;
        MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(i10);
        if (b02 != null) {
            b02.editedInfo = videoEditedInfo;
        }
        HashMap hashMap = ChatAttachAlertPhotoLayout.f23833s1;
        if (hashMap.isEmpty() && b02 != null) {
            chatAttachAlertPhotoLayout.Q(b02, -1);
        }
        if (!viVar.b1(viVar.m1().getText())) {
            viVar.Y0();
            if (PhotoViewer.t1().f33650p7) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.f23834t1;
                if (!hashMap.isEmpty()) {
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        Object obj = hashMap.get(arrayList.get(i13));
                        if (obj instanceof MediaController.PhotoEntry) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                            if (i13 == 0) {
                                CharSequence[] charSequenceArr = {PhotoViewer.t1().f33658q7};
                                photoEntry.entities = MediaDataController.getInstance(UserConfig.selectedAccount).getEntities(charSequenceArr, false);
                                CharSequence charSequence = charSequenceArr[0];
                                photoEntry.caption = charSequence;
                                if (viVar.b1(charSequence)) {
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
                viVar.I1 = false;
            }
            PhotoViewer.t1();
            PhotoViewer.t1().O = false;
            PhotoViewer.t1().f33691u2 = false;
            e5.a0(viVar.J1, viVar.j1() + ChatAttachAlertPhotoLayout.f23833s1.size(), viVar.n1(), new pl(this, z10, i11, z11));
        }
    }

    @Override
    public final boolean q() {
        vi viVar = this.f32604b.f28753b;
        if (viVar != null && viVar.H1 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void s() {
        boolean z10 = ChatAttachAlertPhotoLayout.f23831q1;
        this.f32604b.p0(-1, false);
    }

    @Override
    public final boolean w() {
        MessageObject messageObject;
        vi viVar = this.f32604b.f28753b;
        if (viVar != null && (messageObject = viVar.H1) != null && messageObject.needResendWhenEdit()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean z() {
        vi viVar = this.f32604b.f28753b;
        if (!viVar.F && !viVar.H) {
            return true;
        }
        return false;
    }
}
