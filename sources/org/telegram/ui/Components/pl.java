package org.telegram.ui.Components;

import android.provider.Settings;
import android.view.View;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.camera.CameraController;
import org.telegram.ui.PhotoViewer;
public final class pl extends xl {
    public final boolean f31704b;
    public final ChatAttachAlertPhotoLayout f31705c;

    public pl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z10) {
        super(chatAttachAlertPhotoLayout);
        this.f31705c = chatAttachAlertPhotoLayout;
        this.f31704b = z10;
    }

    @Override
    public final void D() {
        boolean z10 = ChatAttachAlertPhotoLayout.f26252m1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f31705c;
        chatAttachAlertPhotoLayout.m0();
        chatAttachAlertPhotoLayout.B(ChatAttachAlertPhotoLayout.f26254o1.size());
    }

    @Override
    public final void G() {
        ol olVar = this.f31705c.A;
        int childCount = olVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = olVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.r5) {
                org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) childAt;
                r5Var.f25215a.getImageReceiver().setVisible(true, true);
                r5Var.g(true);
            }
        }
    }

    @Override
    public final boolean J() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f31705c;
        if (!chatAttachAlertPhotoLayout.f28403b.R) {
            int i10 = Settings.System.getInt(chatAttachAlertPhotoLayout.getContext().getContentResolver(), "accelerometer_rotation", 0);
            if (this.f31704b || i10 == 1) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean S() {
        return false;
    }

    @Override
    public final void d() {
        boolean z10 = ChatAttachAlertPhotoLayout.f26252m1;
        this.f31705c.k0();
    }

    @Override
    public final boolean g() {
        if (this.f31705c.f28403b.O1 != 1) {
            return true;
        }
        return false;
    }

    @Override
    public final void i() {
        boolean z10 = ChatAttachAlertPhotoLayout.f26252m1;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        return null;
    }

    @Override
    public final void n() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f31705c;
        TextView textView = chatAttachAlertPhotoLayout.f26279l0;
        chatAttachAlertPhotoLayout.f26283p0 = false;
        if (ChatAttachAlertPhotoLayout.f26252m1) {
            ni niVar = chatAttachAlertPhotoLayout.f28403b;
            niVar.V1.B1(0, true, true, 0, 0, 0L, niVar.s1(), false, 0L);
            return;
        }
        if (!chatAttachAlertPhotoLayout.U) {
            chatAttachAlertPhotoLayout.h0(false);
        }
        textView.setVisibility(0);
        chatAttachAlertPhotoLayout.f26285r.setVisibility(0);
        textView.setAlpha(1.0f);
        chatAttachAlertPhotoLayout.y0(false);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        ni niVar = this.f31705c.f28403b;
        ArrayList arrayList = ChatAttachAlertPhotoLayout.f26253n1;
        if (!arrayList.isEmpty() && !niVar.R) {
            if (videoEditedInfo != null && i10 >= 0 && i10 < arrayList.size()) {
                ((MediaController.PhotoEntry) arrayList.get(i10)).editedInfo = videoEditedInfo;
            }
            org.telegram.ui.ActionBar.o2 o2Var = niVar.f30990b0;
            if (!(o2Var instanceof org.telegram.ui.tn) || !((org.telegram.ui.tn) o2Var).w()) {
                int size = arrayList.size();
                for (int i13 = 0; i13 < size; i13++) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) ChatAttachAlertPhotoLayout.f26253n1.get(i13);
                    if (photoEntry.ttl <= 0) {
                        AndroidUtilities.addMediaToGallery(photoEntry.path);
                    }
                }
            }
            niVar.Y0();
            PhotoViewer.t1();
            PhotoViewer.t1().K = false;
            PhotoViewer.t1().f35793q2 = false;
            c5.a0(niVar.F1, niVar.j1() + ChatAttachAlertPhotoLayout.f26254o1.size(), niVar.n1(), new kl(this, z11, z10, i11));
        }
    }

    @Override
    public final boolean u() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f31705c;
        if (chatAttachAlertPhotoLayout.U && chatAttachAlertPhotoLayout.L != null) {
            AndroidUtilities.runOnUIThread(new ig(this, 24), 1000L);
            chatAttachAlertPhotoLayout.f26271h0.b(0.0f, false);
            chatAttachAlertPhotoLayout.f26295x0 = 0.0f;
            chatAttachAlertPhotoLayout.L.setZoom(0.0f);
            CameraController.getInstance().startPreview(chatAttachAlertPhotoLayout.L.getCameraSession());
        }
        if (chatAttachAlertPhotoLayout.f26283p0) {
            ArrayList arrayList = ChatAttachAlertPhotoLayout.f26253n1;
            if (arrayList.size() == 1) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) ChatAttachAlertPhotoLayout.f26253n1.get(i10);
                    new File(photoEntry.path).delete();
                    if (photoEntry.imagePath != null) {
                        new File(photoEntry.imagePath).delete();
                    }
                    if (photoEntry.thumbPath != null) {
                        new File(photoEntry.thumbPath).delete();
                    }
                }
                ChatAttachAlertPhotoLayout.f26253n1.clear();
                ChatAttachAlertPhotoLayout.f26255p1.clear();
                ChatAttachAlertPhotoLayout.f26254o1.clear();
                chatAttachAlertPhotoLayout.f26279l0.setVisibility(4);
                chatAttachAlertPhotoLayout.f26285r.setVisibility(8);
                chatAttachAlertPhotoLayout.C.l();
                chatAttachAlertPhotoLayout.v.l();
                chatAttachAlertPhotoLayout.f28403b.V1(0);
            }
        }
        return true;
    }

    @Override
    public final boolean z() {
        ni niVar = this.f31705c.f28403b;
        if (!niVar.B && !niVar.D) {
            return true;
        }
        return false;
    }
}
