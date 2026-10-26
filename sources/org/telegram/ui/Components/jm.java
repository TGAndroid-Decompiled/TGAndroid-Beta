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
public final class jm extends om {
    public final ChatAttachAlertPhotoLayout f29674b;

    public jm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        super(chatAttachAlertPhotoLayout);
        this.f29674b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final boolean A() {
        ti tiVar = this.f29674b.f30215b;
        if (tiVar != null && tiVar.f33011c0) {
            return true;
        }
        return false;
    }

    @Override
    public final void D() {
        boolean z10 = ChatAttachAlertPhotoLayout.f26015q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29674b;
        chatAttachAlertPhotoLayout.m0();
        AndroidUtilities.runOnUIThread(new pg(this, 24), 150L);
        chatAttachAlertPhotoLayout.D(ChatAttachAlertPhotoLayout.f26017s1.size());
    }

    @Override
    public final org.telegram.ui.qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        au auVar;
        org.telegram.ui.qu0 closeIntoObject;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29674b;
        ti tiVar = chatAttachAlertPhotoLayout.f30215b;
        if (z11 && (auVar = tiVar.U0) != null && (closeIntoObject = ((f50) auVar.f26619b).getCloseIntoObject()) != null) {
            return closeIntoObject;
        }
        org.telegram.ui.Cells.x5 N = ChatAttachAlertPhotoLayout.N(chatAttachAlertPhotoLayout, i10);
        if (N != null) {
            int[] iArr = new int[2];
            N.getImageView().getLocationInWindow(iArr);
            if (Build.VERSION.SDK_INT < 26) {
                iArr[0] = iArr[0] - tiVar.getLeftInset();
            }
            org.telegram.ui.qu0 qu0Var = new org.telegram.ui.qu0();
            qu0Var.f42920b = iArr[0];
            qu0Var.f42921c = iArr[1];
            qu0Var.d = chatAttachAlertPhotoLayout.E;
            ImageReceiver imageReceiver = N.getImageView().getImageReceiver();
            qu0Var.f42919a = imageReceiver;
            qu0Var.e = imageReceiver.getBitmapSafe();
            qu0Var.f42926k = N.getScale();
            qu0Var.f42924i = (int) tiVar.q1();
            N.g(false);
            return qu0Var;
        }
        return null;
    }

    @Override
    public final void F(boolean z10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29674b;
        ti tiVar = chatAttachAlertPhotoLayout.f30215b;
        if (tiVar != null && tiVar.f33011c0 != z10) {
            tiVar.N1(z10, true);
            chatAttachAlertPhotoLayout.f26027d1.a(!chatAttachAlertPhotoLayout.f30215b.f33011c0, true);
        }
    }

    @Override
    public final void G() {
        fm fmVar = this.f29674b.E;
        int childCount = fmVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = fmVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.x5) {
                ((org.telegram.ui.Cells.x5) childAt).g(true);
            }
        }
    }

    @Override
    public final void X(int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29674b;
        org.telegram.ui.Cells.x5 N = ChatAttachAlertPhotoLayout.N(chatAttachAlertPhotoLayout, i10);
        if (N != null) {
            N.getImageView().q(0, true);
            MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(i10);
            if (b02 != null) {
                if (b02.coverPath != null) {
                    N.getImageView().g(b02.coverPath, null, org.telegram.ui.ActionBar.y6.R4);
                } else if (b02.thumbPath != null) {
                    N.getImageView().g(b02.thumbPath, null, org.telegram.ui.ActionBar.y6.R4);
                } else if (b02.path != null) {
                    N.getImageView().p(b02.orientation, b02.invert, true);
                    if (b02.isVideo) {
                        y9 imageView = N.getImageView();
                        imageView.g("vthumb://" + b02.imageId + ":" + b02.path, null, org.telegram.ui.ActionBar.y6.R4);
                        return;
                    }
                    y9 imageView2 = N.getImageView();
                    imageView2.g("thumb://" + b02.imageId + ":" + b02.path, null, org.telegram.ui.ActionBar.y6.R4);
                } else {
                    N.getImageView().setImageDrawable(org.telegram.ui.ActionBar.y6.R4);
                }
            }
        }
    }

    @Override
    public final long a() {
        org.telegram.ui.ActionBar.r2 r2Var = this.f29674b.f30215b.f33021f0;
        if (r2Var instanceof org.telegram.ui.un) {
            return ((org.telegram.ui.un) r2Var).a();
        }
        return 0L;
    }

    @Override
    public final void a0(int i10) {
        org.telegram.ui.Cells.x5 N = ChatAttachAlertPhotoLayout.N(this.f29674b, i10);
        if (N != null) {
            N.g(true);
        }
    }

    @Override
    public final void d() {
        boolean z10 = ChatAttachAlertPhotoLayout.f26015q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29674b;
        chatAttachAlertPhotoLayout.k0();
        chatAttachAlertPhotoLayout.p0(-1, true);
    }

    @Override
    public final void e(CharSequence charSequence) {
        CharSequence charSequence2;
        ArrayList<TLRPC.MessageEntity> arrayList;
        SpannableStringBuilder spannableStringBuilder;
        HashMap hashMap = ChatAttachAlertPhotoLayout.f26017s1;
        if (hashMap.size() > 0) {
            ArrayList arrayList2 = ChatAttachAlertPhotoLayout.f26018t1;
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
                this.f29674b.f30215b.r1().setText(c6.cloneSpans(charSequence2, 3));
            }
        }
    }

    @Override
    public final void i() {
        boolean z10 = ChatAttachAlertPhotoLayout.f26015q1;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        org.telegram.ui.Cells.x5 N = ChatAttachAlertPhotoLayout.N(this.f29674b, i10);
        if (N != null) {
            return N.getImageView().getImageReceiver().getBitmapSafe();
        }
        return null;
    }

    @Override
    public final boolean l() {
        ti tiVar = this.f29674b.f30215b;
        if (tiVar != null && (tiVar.f33021f0 instanceof org.telegram.ui.un)) {
            return true;
        }
        return false;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29674b;
        ti tiVar = chatAttachAlertPhotoLayout.f30215b;
        tiVar.f33084y2 = true;
        boolean z12 = ChatAttachAlertPhotoLayout.f26015q1;
        MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(i10);
        if (b02 != null) {
            b02.editedInfo = videoEditedInfo;
        }
        HashMap hashMap = ChatAttachAlertPhotoLayout.f26017s1;
        if (hashMap.isEmpty() && b02 != null) {
            chatAttachAlertPhotoLayout.Q(b02, -1);
        }
        if (!tiVar.g1(tiVar.r1().getText())) {
            tiVar.e1();
            if (PhotoViewer.u1().f35749p7) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.f26018t1;
                if (!hashMap.isEmpty()) {
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        Object obj = hashMap.get(arrayList.get(i13));
                        if (obj instanceof MediaController.PhotoEntry) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                            if (i13 == 0) {
                                CharSequence[] charSequenceArr = {PhotoViewer.u1().f35757q7};
                                photoEntry.entities = MediaDataController.getInstance(UserConfig.selectedAccount).getEntities(charSequenceArr, false);
                                CharSequence charSequence = charSequenceArr[0];
                                photoEntry.caption = charSequence;
                                if (tiVar.g1(charSequence)) {
                                    return;
                                }
                            } else {
                                photoEntry.caption = null;
                            }
                        }
                    }
                }
            }
            if (tiVar != null) {
                tiVar.L1 = false;
            }
            PhotoViewer.u1();
            PhotoViewer.u1().O = false;
            PhotoViewer.u1().f35789u2 = false;
            g5.Z(tiVar.M1, tiVar.o1() + ChatAttachAlertPhotoLayout.f26017s1.size(), tiVar.s1(), new bm(this, z10, i11, z11));
        }
    }

    @Override
    public final boolean q() {
        ti tiVar = this.f29674b.f30215b;
        if (tiVar != null && tiVar.K1 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void s() {
        boolean z10 = ChatAttachAlertPhotoLayout.f26015q1;
        this.f29674b.p0(-1, false);
    }

    @Override
    public final boolean w() {
        MessageObject messageObject;
        ti tiVar = this.f29674b.f30215b;
        if (tiVar != null && (messageObject = tiVar.K1) != null && messageObject.needResendWhenEdit()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean z() {
        ti tiVar = this.f29674b.f30215b;
        if (!tiVar.F && !tiVar.H) {
            return true;
        }
        return false;
    }
}
