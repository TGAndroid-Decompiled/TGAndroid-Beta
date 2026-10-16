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
public final class hm extends pm {
    public final boolean f25359b;
    public final ChatAttachAlertPhotoLayout f25360c;

    public hm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z10) {
        super(chatAttachAlertPhotoLayout);
        this.f25360c = chatAttachAlertPhotoLayout;
        this.f25359b = z10;
    }

    @Override
    public final void D() {
        boolean z10 = ChatAttachAlertPhotoLayout.f22718q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f25360c;
        chatAttachAlertPhotoLayout.m0();
        chatAttachAlertPhotoLayout.E(ChatAttachAlertPhotoLayout.f22720s1.size());
    }

    @Override
    public final void G() {
        gm gmVar = this.f25360c.E;
        int childCount = gmVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = gmVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.t5) {
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                t5Var.f21780a.getImageReceiver().setVisible(true, true);
                t5Var.g(true);
            }
        }
    }

    @Override
    public final boolean K() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f25360c;
        if (!chatAttachAlertPhotoLayout.f27360b.V) {
            int i10 = Settings.System.getInt(chatAttachAlertPhotoLayout.getContext().getContentResolver(), "accelerometer_rotation", 0);
            if (this.f25359b || i10 == 1) {
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
        boolean z10 = ChatAttachAlertPhotoLayout.f22718q1;
        this.f25360c.k0();
    }

    @Override
    public final boolean g() {
        if (this.f25360c.f27360b.V1 != 1) {
            return true;
        }
        return false;
    }

    @Override
    public final void i() {
        boolean z10 = ChatAttachAlertPhotoLayout.f22718q1;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        return null;
    }

    @Override
    public final void n() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f25360c;
        TextView textView = chatAttachAlertPhotoLayout.f22752p0;
        chatAttachAlertPhotoLayout.f22759t0 = false;
        if (ChatAttachAlertPhotoLayout.f22718q1) {
            vi viVar = chatAttachAlertPhotoLayout.f27360b;
            viVar.f29664c2.b0(0, true, true, 0, 0, 0L, viVar.u1(), false, 0L);
            return;
        }
        if (!chatAttachAlertPhotoLayout.f22725b0) {
            chatAttachAlertPhotoLayout.h0(false);
        }
        textView.setVisibility(0);
        chatAttachAlertPhotoLayout.f22755r.setVisibility(0);
        textView.setAlpha(1.0f);
        chatAttachAlertPhotoLayout.y0(false);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        vi viVar = this.f25360c.f27360b;
        ArrayList arrayList = ChatAttachAlertPhotoLayout.f22719r1;
        if (!arrayList.isEmpty() && !viVar.V) {
            if (videoEditedInfo != null && i10 >= 0 && i10 < arrayList.size()) {
                ((MediaController.PhotoEntry) arrayList.get(i10)).editedInfo = videoEditedInfo;
            }
            org.telegram.ui.ActionBar.m2 m2Var = viVar.f29672f0;
            if (!(m2Var instanceof org.telegram.ui.fo) || !((org.telegram.ui.fo) m2Var).x()) {
                int size = arrayList.size();
                for (int i13 = 0; i13 < size; i13++) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) ChatAttachAlertPhotoLayout.f22719r1.get(i13);
                    if (photoEntry.ttl <= 0) {
                        AndroidUtilities.addMediaToGallery(photoEntry.path);
                    }
                }
            }
            viVar.a1();
            PhotoViewer.t1();
            PhotoViewer.t1().O = false;
            PhotoViewer.t1().f32071u2 = false;
            g5.Z(viVar.M1, viVar.l1() + ChatAttachAlertPhotoLayout.f22720s1.size(), viVar.p1(), new cm(this, z11, z10, i11));
        }
    }

    @Override
    public final boolean u() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f25360c;
        if (chatAttachAlertPhotoLayout.f22725b0 && chatAttachAlertPhotoLayout.P != null) {
            AndroidUtilities.runOnUIThread(new qg(this, 24), 1000L);
            chatAttachAlertPhotoLayout.f22745l0.b(0.0f, false);
            chatAttachAlertPhotoLayout.B0 = 0.0f;
            chatAttachAlertPhotoLayout.P.setZoom(0.0f);
            CameraController.getInstance().startPreview(chatAttachAlertPhotoLayout.P.getCameraSession());
        }
        if (chatAttachAlertPhotoLayout.f22759t0) {
            ArrayList arrayList = ChatAttachAlertPhotoLayout.f22719r1;
            if (arrayList.size() == 1) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) ChatAttachAlertPhotoLayout.f22719r1.get(i10);
                    new File(photoEntry.path).delete();
                    if (photoEntry.imagePath != null) {
                        new File(photoEntry.imagePath).delete();
                    }
                    if (photoEntry.thumbPath != null) {
                        new File(photoEntry.thumbPath).delete();
                    }
                }
                ChatAttachAlertPhotoLayout.f22719r1.clear();
                ChatAttachAlertPhotoLayout.f22721t1.clear();
                ChatAttachAlertPhotoLayout.f22720s1.clear();
                chatAttachAlertPhotoLayout.f22752p0.setVisibility(4);
                chatAttachAlertPhotoLayout.f22755r.setVisibility(8);
                chatAttachAlertPhotoLayout.G.l();
                chatAttachAlertPhotoLayout.v.l();
                chatAttachAlertPhotoLayout.f27360b.Z1(0);
            }
        }
        return true;
    }

    @Override
    public final boolean z() {
        vi viVar = this.f25360c.f27360b;
        if (!viVar.F && !viVar.H) {
            return true;
        }
        return false;
    }
}
