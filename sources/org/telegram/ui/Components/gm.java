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
public final class gm extends lm {
    public final ChatAttachAlertPhotoLayout f26727b;

    public gm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        super(chatAttachAlertPhotoLayout);
        this.f26727b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final boolean A() {
        ri riVar = this.f26727b.f27704b;
        if (riVar != null && riVar.f30136c0) {
            return true;
        }
        return false;
    }

    @Override
    public final void D() {
        boolean z10 = ChatAttachAlertPhotoLayout.f24223q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f26727b;
        chatAttachAlertPhotoLayout.m0();
        AndroidUtilities.runOnUIThread(new ng(this, 24), 150L);
        chatAttachAlertPhotoLayout.D(ChatAttachAlertPhotoLayout.f24225s1.size());
    }

    @Override
    public final org.telegram.ui.lu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        xt xtVar;
        org.telegram.ui.lu0 closeIntoObject;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f26727b;
        ri riVar = chatAttachAlertPhotoLayout.f27704b;
        if (z11 && (xtVar = riVar.U0) != null && (closeIntoObject = ((b50) xtVar.f32700b).getCloseIntoObject()) != null) {
            return closeIntoObject;
        }
        org.telegram.ui.Cells.s5 N = ChatAttachAlertPhotoLayout.N(chatAttachAlertPhotoLayout, i10);
        if (N != null) {
            int[] iArr = new int[2];
            N.getImageView().getLocationInWindow(iArr);
            if (Build.VERSION.SDK_INT < 26) {
                iArr[0] = iArr[0] - riVar.getLeftInset();
            }
            org.telegram.ui.lu0 lu0Var = new org.telegram.ui.lu0();
            lu0Var.f39382b = iArr[0];
            lu0Var.f39383c = iArr[1];
            lu0Var.d = chatAttachAlertPhotoLayout.E;
            ImageReceiver imageReceiver = N.getImageView().getImageReceiver();
            lu0Var.f39381a = imageReceiver;
            lu0Var.e = imageReceiver.getBitmapSafe();
            lu0Var.f39388k = N.getScale();
            lu0Var.f39386i = (int) riVar.q1();
            N.g(false);
            return lu0Var;
        }
        return null;
    }

    @Override
    public final void F(boolean z10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f26727b;
        ri riVar = chatAttachAlertPhotoLayout.f27704b;
        if (riVar != null && riVar.f30136c0 != z10) {
            riVar.O1(z10, true);
            chatAttachAlertPhotoLayout.f24235d1.a(!chatAttachAlertPhotoLayout.f27704b.f30136c0, true);
        }
    }

    @Override
    public final void G() {
        cm cmVar = this.f26727b.E;
        int childCount = cmVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = cmVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.s5) {
                ((org.telegram.ui.Cells.s5) childAt).g(true);
            }
        }
    }

    @Override
    public final void X(int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f26727b;
        org.telegram.ui.Cells.s5 N = ChatAttachAlertPhotoLayout.N(chatAttachAlertPhotoLayout, i10);
        if (N != null) {
            N.getImageView().q(0, true);
            MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(i10);
            if (b02 != null) {
                if (b02.coverPath != null) {
                    N.getImageView().g(b02.coverPath, null, org.telegram.ui.ActionBar.k6.R4);
                } else if (b02.thumbPath != null) {
                    N.getImageView().g(b02.thumbPath, null, org.telegram.ui.ActionBar.k6.R4);
                } else if (b02.path != null) {
                    N.getImageView().p(b02.orientation, b02.invert, true);
                    if (b02.isVideo) {
                        u9 imageView = N.getImageView();
                        imageView.g("vthumb://" + b02.imageId + ":" + b02.path, null, org.telegram.ui.ActionBar.k6.R4);
                        return;
                    }
                    u9 imageView2 = N.getImageView();
                    imageView2.g("thumb://" + b02.imageId + ":" + b02.path, null, org.telegram.ui.ActionBar.k6.R4);
                } else {
                    N.getImageView().setImageDrawable(org.telegram.ui.ActionBar.k6.R4);
                }
            }
        }
    }

    @Override
    public final long a() {
        org.telegram.ui.ActionBar.o2 o2Var = this.f26727b.f27704b.f30146f0;
        if (o2Var instanceof org.telegram.ui.sn) {
            return ((org.telegram.ui.sn) o2Var).a();
        }
        return 0L;
    }

    @Override
    public final void a0(int i10) {
        org.telegram.ui.Cells.s5 N = ChatAttachAlertPhotoLayout.N(this.f26727b, i10);
        if (N != null) {
            N.g(true);
        }
    }

    @Override
    public final void d() {
        boolean z10 = ChatAttachAlertPhotoLayout.f24223q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f26727b;
        chatAttachAlertPhotoLayout.k0();
        chatAttachAlertPhotoLayout.p0(-1, true);
    }

    @Override
    public final void e(CharSequence charSequence) {
        CharSequence charSequence2;
        ArrayList<TLRPC.MessageEntity> arrayList;
        SpannableStringBuilder spannableStringBuilder;
        HashMap hashMap = ChatAttachAlertPhotoLayout.f24225s1;
        if (hashMap.size() > 0) {
            ArrayList arrayList2 = ChatAttachAlertPhotoLayout.f24226t1;
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
                this.f26727b.f27704b.r1().setText(y5.cloneSpans(charSequence2, 3));
            }
        }
    }

    @Override
    public final void i() {
        boolean z10 = ChatAttachAlertPhotoLayout.f24223q1;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        org.telegram.ui.Cells.s5 N = ChatAttachAlertPhotoLayout.N(this.f26727b, i10);
        if (N != null) {
            return N.getImageView().getImageReceiver().getBitmapSafe();
        }
        return null;
    }

    @Override
    public final boolean l() {
        ri riVar = this.f26727b.f27704b;
        if (riVar != null && (riVar.f30146f0 instanceof org.telegram.ui.sn)) {
            return true;
        }
        return false;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f26727b;
        ri riVar = chatAttachAlertPhotoLayout.f27704b;
        riVar.f30209y2 = true;
        boolean z12 = ChatAttachAlertPhotoLayout.f24223q1;
        MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(i10);
        if (b02 != null) {
            b02.editedInfo = videoEditedInfo;
        }
        HashMap hashMap = ChatAttachAlertPhotoLayout.f24225s1;
        if (hashMap.isEmpty() && b02 != null) {
            chatAttachAlertPhotoLayout.Q(b02, -1);
        }
        if (!riVar.g1(riVar.r1().getText())) {
            riVar.d1();
            if (PhotoViewer.u1().f33684p7) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.f24226t1;
                if (!hashMap.isEmpty()) {
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        Object obj = hashMap.get(arrayList.get(i13));
                        if (obj instanceof MediaController.PhotoEntry) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                            if (i13 == 0) {
                                CharSequence[] charSequenceArr = {PhotoViewer.u1().f33692q7};
                                photoEntry.entities = MediaDataController.getInstance(UserConfig.selectedAccount).getEntities(charSequenceArr, false);
                                CharSequence charSequence = charSequenceArr[0];
                                photoEntry.caption = charSequence;
                                if (riVar.g1(charSequence)) {
                                    return;
                                }
                            } else {
                                photoEntry.caption = null;
                            }
                        }
                    }
                }
            }
            if (riVar != null) {
                riVar.L1 = false;
            }
            PhotoViewer.u1();
            PhotoViewer.u1().O = false;
            PhotoViewer.u1().f33725u2 = false;
            d5.Z(riVar.M1, riVar.o1() + ChatAttachAlertPhotoLayout.f24225s1.size(), riVar.s1(), new yl(this, z10, i11, z11));
        }
    }

    @Override
    public final boolean q() {
        ri riVar = this.f26727b.f27704b;
        if (riVar != null && riVar.K1 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void s() {
        boolean z10 = ChatAttachAlertPhotoLayout.f24223q1;
        this.f26727b.p0(-1, false);
    }

    @Override
    public final boolean w() {
        MessageObject messageObject;
        ri riVar = this.f26727b.f27704b;
        if (riVar != null && (messageObject = riVar.K1) != null && messageObject.needResendWhenEdit()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean z() {
        ri riVar = this.f26727b.f27704b;
        if (!riVar.F && !riVar.H) {
            return true;
        }
        return false;
    }
}
