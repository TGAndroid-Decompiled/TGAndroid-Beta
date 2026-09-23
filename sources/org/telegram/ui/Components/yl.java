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
public final class yl extends dm {
    public final ChatAttachAlertPhotoLayout f30309b;

    public yl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        super(chatAttachAlertPhotoLayout);
        this.f30309b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final boolean A() {
        wi wiVar = this.f30309b.f26744b;
        if (wiVar != null && wiVar.f29655c0) {
            return true;
        }
        return false;
    }

    @Override
    public final void D() {
        boolean z10 = ChatAttachAlertPhotoLayout.f21869q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30309b;
        chatAttachAlertPhotoLayout.m0();
        AndroidUtilities.runOnUIThread(new og(this, 23), 150L);
        chatAttachAlertPhotoLayout.A(ChatAttachAlertPhotoLayout.f21871s1.size());
    }

    @Override
    public final org.telegram.ui.wu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        rt rtVar;
        org.telegram.ui.wu0 closeIntoObject;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30309b;
        wi wiVar = chatAttachAlertPhotoLayout.f26744b;
        if (z11 && (rtVar = wiVar.R0) != null && (closeIntoObject = ((u40) rtVar.f27722b).getCloseIntoObject()) != null) {
            return closeIntoObject;
        }
        org.telegram.ui.Cells.t5 L = ChatAttachAlertPhotoLayout.L(chatAttachAlertPhotoLayout, i10);
        if (L != null) {
            int[] iArr = new int[2];
            L.getImageView().getLocationInWindow(iArr);
            if (Build.VERSION.SDK_INT < 26) {
                iArr[0] = iArr[0] - wiVar.getLeftInset();
            }
            org.telegram.ui.wu0 wu0Var = new org.telegram.ui.wu0();
            wu0Var.f39095b = iArr[0];
            wu0Var.f39096c = iArr[1];
            wu0Var.d = chatAttachAlertPhotoLayout.E;
            ImageReceiver imageReceiver = L.getImageView().getImageReceiver();
            wu0Var.f39094a = imageReceiver;
            wu0Var.e = imageReceiver.getBitmapSafe();
            wu0Var.f39101k = L.getScale();
            wu0Var.f39099i = (int) wiVar.l1();
            L.g(false);
            return wu0Var;
        }
        return null;
    }

    @Override
    public final void F(boolean z10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30309b;
        wi wiVar = chatAttachAlertPhotoLayout.f26744b;
        if (wiVar != null && wiVar.f29655c0 != z10) {
            wiVar.H1(z10, true);
            chatAttachAlertPhotoLayout.f21881d1.a(!chatAttachAlertPhotoLayout.f26744b.f29655c0, true);
        }
    }

    @Override
    public final void G() {
        ul ulVar = this.f30309b.E;
        int childCount = ulVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = ulVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.t5) {
                ((org.telegram.ui.Cells.t5) childAt).g(true);
            }
        }
    }

    @Override
    public final void W(int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30309b;
        org.telegram.ui.Cells.t5 L = ChatAttachAlertPhotoLayout.L(chatAttachAlertPhotoLayout, i10);
        if (L != null) {
            L.getImageView().q(0, true);
            MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(i10);
            if (b02 != null) {
                if (b02.coverPath != null) {
                    L.getImageView().f(b02.coverPath, null, org.telegram.ui.ActionBar.h6.R4);
                } else if (b02.thumbPath != null) {
                    L.getImageView().f(b02.thumbPath, null, org.telegram.ui.ActionBar.h6.R4);
                } else if (b02.path != null) {
                    L.getImageView().p(b02.orientation, b02.invert, true);
                    if (b02.isVideo) {
                        w9 imageView = L.getImageView();
                        imageView.f("vthumb://" + b02.imageId + ":" + b02.path, null, org.telegram.ui.ActionBar.h6.R4);
                        return;
                    }
                    w9 imageView2 = L.getImageView();
                    imageView2.f("thumb://" + b02.imageId + ":" + b02.path, null, org.telegram.ui.ActionBar.h6.R4);
                } else {
                    L.getImageView().setImageDrawable(org.telegram.ui.ActionBar.h6.R4);
                }
            }
        }
    }

    @Override
    public final void Z(int i10) {
        org.telegram.ui.Cells.t5 L = ChatAttachAlertPhotoLayout.L(this.f30309b, i10);
        if (L != null) {
            L.g(true);
        }
    }

    @Override
    public final long a() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f30309b.f26744b.f29665f0;
        if (n2Var instanceof org.telegram.ui.xn) {
            return ((org.telegram.ui.xn) n2Var).a();
        }
        return 0L;
    }

    @Override
    public final void d() {
        boolean z10 = ChatAttachAlertPhotoLayout.f21869q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30309b;
        chatAttachAlertPhotoLayout.k0();
        chatAttachAlertPhotoLayout.p0(-1, true);
    }

    @Override
    public final void e(CharSequence charSequence) {
        CharSequence charSequence2;
        ArrayList<TLRPC.MessageEntity> arrayList;
        SpannableStringBuilder spannableStringBuilder;
        HashMap hashMap = ChatAttachAlertPhotoLayout.f21871s1;
        if (hashMap.size() > 0) {
            ArrayList arrayList2 = ChatAttachAlertPhotoLayout.f21872t1;
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
                this.f30309b.f26744b.m1().setText(z5.cloneSpans(charSequence2, 3));
            }
        }
    }

    @Override
    public final void i() {
        boolean z10 = ChatAttachAlertPhotoLayout.f21869q1;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        org.telegram.ui.Cells.t5 L = ChatAttachAlertPhotoLayout.L(this.f30309b, i10);
        if (L != null) {
            return L.getImageView().getImageReceiver().getBitmapSafe();
        }
        return null;
    }

    @Override
    public final boolean l() {
        wi wiVar = this.f30309b.f26744b;
        if (wiVar != null && (wiVar.f29665f0 instanceof org.telegram.ui.xn)) {
            return true;
        }
        return false;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30309b;
        wi wiVar = chatAttachAlertPhotoLayout.f26744b;
        wiVar.f29707s2 = true;
        boolean z12 = ChatAttachAlertPhotoLayout.f21869q1;
        MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(i10);
        if (b02 != null) {
            b02.editedInfo = videoEditedInfo;
        }
        HashMap hashMap = ChatAttachAlertPhotoLayout.f21871s1;
        if (hashMap.isEmpty() && b02 != null) {
            chatAttachAlertPhotoLayout.Q(b02, -1);
        }
        if (!wiVar.b1(wiVar.m1().getText())) {
            wiVar.Y0();
            if (PhotoViewer.t1().f31009p7) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.f21872t1;
                if (!hashMap.isEmpty()) {
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        Object obj = hashMap.get(arrayList.get(i13));
                        if (obj instanceof MediaController.PhotoEntry) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                            if (i13 == 0) {
                                CharSequence[] charSequenceArr = {PhotoViewer.t1().f31017q7};
                                photoEntry.entities = MediaDataController.getInstance(UserConfig.selectedAccount).getEntities(charSequenceArr, false);
                                CharSequence charSequence = charSequenceArr[0];
                                photoEntry.caption = charSequence;
                                if (wiVar.b1(charSequence)) {
                                    return;
                                }
                            } else {
                                photoEntry.caption = null;
                            }
                        }
                    }
                }
            }
            if (wiVar != null) {
                wiVar.I1 = false;
            }
            PhotoViewer.t1();
            PhotoViewer.t1().O = false;
            PhotoViewer.t1().f31050u2 = false;
            e5.a0(wiVar.J1, wiVar.j1() + ChatAttachAlertPhotoLayout.f21871s1.size(), wiVar.n1(), new ql(this, z10, i11, z11));
        }
    }

    @Override
    public final boolean q() {
        wi wiVar = this.f30309b.f26744b;
        if (wiVar != null && wiVar.H1 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void s() {
        boolean z10 = ChatAttachAlertPhotoLayout.f21869q1;
        this.f30309b.p0(-1, false);
    }

    @Override
    public final boolean w() {
        MessageObject messageObject;
        wi wiVar = this.f30309b.f26744b;
        if (wiVar != null && (messageObject = wiVar.H1) != null && messageObject.needResendWhenEdit()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean z() {
        wi wiVar = this.f30309b.f26744b;
        if (!wiVar.F && !wiVar.H) {
            return true;
        }
        return false;
    }
}
