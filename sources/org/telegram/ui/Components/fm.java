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
public final class fm extends nm {
    public final boolean f26275b;
    public final ChatAttachAlertPhotoLayout f26276c;

    public fm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z10) {
        super(chatAttachAlertPhotoLayout);
        this.f26276c = chatAttachAlertPhotoLayout;
        this.f26275b = z10;
    }

    @Override
    public final void D() {
        boolean z10 = ChatAttachAlertPhotoLayout.f24077q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f26276c;
        chatAttachAlertPhotoLayout.m0();
        chatAttachAlertPhotoLayout.D(ChatAttachAlertPhotoLayout.f24079s1.size());
    }

    @Override
    public final void G() {
        em emVar = this.f26276c.E;
        int childCount = emVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = emVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.s5) {
                org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                s5Var.f23003a.getImageReceiver().setVisible(true, true);
                s5Var.g(true);
            }
        }
    }

    @Override
    public final boolean K() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f26276c;
        if (!chatAttachAlertPhotoLayout.f28173b.V) {
            int i10 = Settings.System.getInt(chatAttachAlertPhotoLayout.getContext().getContentResolver(), "accelerometer_rotation", 0);
            if (this.f26275b || i10 == 1) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean T() {
        return false;
    }

    @Override
    public final void d() {
        boolean z10 = ChatAttachAlertPhotoLayout.f24077q1;
        this.f26276c.k0();
    }

    @Override
    public final boolean g() {
        if (this.f26276c.f28173b.V1 != 1) {
            return true;
        }
        return false;
    }

    @Override
    public final void i() {
        boolean z10 = ChatAttachAlertPhotoLayout.f24077q1;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        return null;
    }

    @Override
    public final void n() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f26276c;
        TextView textView = chatAttachAlertPhotoLayout.f24111p0;
        chatAttachAlertPhotoLayout.f24118t0 = false;
        if (ChatAttachAlertPhotoLayout.f24077q1) {
            ti tiVar = chatAttachAlertPhotoLayout.f28173b;
            tiVar.f30537c2.b0(0, true, true, 0, 0, 0L, tiVar.u1(), false, 0L);
            return;
        }
        if (!chatAttachAlertPhotoLayout.f24084b0) {
            chatAttachAlertPhotoLayout.h0(false);
        }
        textView.setVisibility(0);
        chatAttachAlertPhotoLayout.f24114r.setVisibility(0);
        textView.setAlpha(1.0f);
        chatAttachAlertPhotoLayout.y0(false);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        ti tiVar = this.f26276c.f28173b;
        ArrayList arrayList = ChatAttachAlertPhotoLayout.f24078r1;
        if (!arrayList.isEmpty() && !tiVar.V) {
            if (videoEditedInfo != null && i10 >= 0 && i10 < arrayList.size()) {
                ((MediaController.PhotoEntry) arrayList.get(i10)).editedInfo = videoEditedInfo;
            }
            org.telegram.ui.ActionBar.n2 n2Var = tiVar.f30545f0;
            if (!(n2Var instanceof org.telegram.ui.qn) || !((org.telegram.ui.qn) n2Var).x()) {
                int size = arrayList.size();
                for (int i13 = 0; i13 < size; i13++) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) ChatAttachAlertPhotoLayout.f24078r1.get(i13);
                    if (photoEntry.ttl <= 0) {
                        AndroidUtilities.addMediaToGallery(photoEntry.path);
                    }
                }
            }
            tiVar.a1();
            PhotoViewer.u1();
            PhotoViewer.u1().O = false;
            PhotoViewer.u1().f33421u2 = false;
            f5.Z(tiVar.M1, tiVar.l1() + ChatAttachAlertPhotoLayout.f24079s1.size(), tiVar.p1(), new am(this, z11, z10, i11));
        }
    }

    @Override
    public final boolean u() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f26276c;
        if (chatAttachAlertPhotoLayout.f24084b0 && chatAttachAlertPhotoLayout.P != null) {
            AndroidUtilities.runOnUIThread(new pg(this, 24), 1000L);
            chatAttachAlertPhotoLayout.f24104l0.b(0.0f, false);
            chatAttachAlertPhotoLayout.B0 = 0.0f;
            chatAttachAlertPhotoLayout.P.setZoom(0.0f);
            CameraController.getInstance().startPreview(chatAttachAlertPhotoLayout.P.getCameraSession());
        }
        if (chatAttachAlertPhotoLayout.f24118t0) {
            ArrayList arrayList = ChatAttachAlertPhotoLayout.f24078r1;
            if (arrayList.size() == 1) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) ChatAttachAlertPhotoLayout.f24078r1.get(i10);
                    new File(photoEntry.path).delete();
                    if (photoEntry.imagePath != null) {
                        new File(photoEntry.imagePath).delete();
                    }
                    if (photoEntry.thumbPath != null) {
                        new File(photoEntry.thumbPath).delete();
                    }
                }
                ChatAttachAlertPhotoLayout.f24078r1.clear();
                ChatAttachAlertPhotoLayout.f24080t1.clear();
                ChatAttachAlertPhotoLayout.f24079s1.clear();
                chatAttachAlertPhotoLayout.f24111p0.setVisibility(4);
                chatAttachAlertPhotoLayout.f24114r.setVisibility(8);
                chatAttachAlertPhotoLayout.G.l();
                chatAttachAlertPhotoLayout.v.l();
                chatAttachAlertPhotoLayout.f28173b.Z1(0);
            }
        }
        return true;
    }

    @Override
    public final boolean z() {
        ti tiVar = this.f26276c.f28173b;
        if (!tiVar.F && !tiVar.H) {
            return true;
        }
        return false;
    }
}
