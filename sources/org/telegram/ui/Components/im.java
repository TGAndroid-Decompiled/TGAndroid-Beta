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
public final class im extends qm {
    public final boolean f25993b;
    public final ChatAttachAlertPhotoLayout f25994c;

    public im(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z10) {
        super(chatAttachAlertPhotoLayout);
        this.f25994c = chatAttachAlertPhotoLayout;
        this.f25993b = z10;
    }

    @Override
    public final void D() {
        boolean z10 = ChatAttachAlertPhotoLayout.f23018q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f25994c;
        chatAttachAlertPhotoLayout.m0();
        chatAttachAlertPhotoLayout.E(ChatAttachAlertPhotoLayout.f23020s1.size());
    }

    @Override
    public final void G() {
        hm hmVar = this.f25994c.E;
        int childCount = hmVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = hmVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.t5) {
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                t5Var.f22085a.getImageReceiver().setVisible(true, true);
                t5Var.g(true);
            }
        }
    }

    @Override
    public final boolean J() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f25994c;
        if (!chatAttachAlertPhotoLayout.f27671b.V) {
            int i10 = Settings.System.getInt(chatAttachAlertPhotoLayout.getContext().getContentResolver(), "accelerometer_rotation", 0);
            if (this.f25993b || i10 == 1) {
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
        boolean z10 = ChatAttachAlertPhotoLayout.f23018q1;
        this.f25994c.k0();
    }

    @Override
    public final boolean g() {
        if (this.f25994c.f27671b.V1 != 1) {
            return true;
        }
        return false;
    }

    @Override
    public final void i() {
        boolean z10 = ChatAttachAlertPhotoLayout.f23018q1;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        return null;
    }

    @Override
    public final void n() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f25994c;
        TextView textView = chatAttachAlertPhotoLayout.f23052p0;
        chatAttachAlertPhotoLayout.f23059t0 = false;
        if (ChatAttachAlertPhotoLayout.f23018q1) {
            vi viVar = chatAttachAlertPhotoLayout.f27671b;
            viVar.f29993c2.g0(0, true, true, 0, 0, 0L, viVar.u1(), false, 0L);
            return;
        }
        if (!chatAttachAlertPhotoLayout.f23025b0) {
            chatAttachAlertPhotoLayout.h0(false);
        }
        textView.setVisibility(0);
        chatAttachAlertPhotoLayout.f23055r.setVisibility(0);
        textView.setAlpha(1.0f);
        chatAttachAlertPhotoLayout.y0(false);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        vi viVar = this.f25994c.f27671b;
        ArrayList arrayList = ChatAttachAlertPhotoLayout.f23019r1;
        if (!arrayList.isEmpty() && !viVar.V) {
            if (videoEditedInfo != null && i10 >= 0 && i10 < arrayList.size()) {
                ((MediaController.PhotoEntry) arrayList.get(i10)).editedInfo = videoEditedInfo;
            }
            org.telegram.ui.ActionBar.m2 m2Var = viVar.f30001f0;
            if (!(m2Var instanceof org.telegram.ui.fo) || !((org.telegram.ui.fo) m2Var).x()) {
                int size = arrayList.size();
                for (int i13 = 0; i13 < size; i13++) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) ChatAttachAlertPhotoLayout.f23019r1.get(i13);
                    if (photoEntry.ttl <= 0) {
                        AndroidUtilities.addMediaToGallery(photoEntry.path);
                    }
                }
            }
            viVar.a1();
            PhotoViewer.t1();
            PhotoViewer.t1().O = false;
            PhotoViewer.t1().f32369u2 = false;
            g5.Z(viVar.M1, viVar.l1() + ChatAttachAlertPhotoLayout.f23020s1.size(), viVar.p1(), new dm(this, z11, z10, i11));
        }
    }

    @Override
    public final boolean u() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f25994c;
        if (chatAttachAlertPhotoLayout.f23025b0 && chatAttachAlertPhotoLayout.P != null) {
            AndroidUtilities.runOnUIThread(new qg(this, 24), 1000L);
            chatAttachAlertPhotoLayout.f23045l0.b(0.0f, false);
            chatAttachAlertPhotoLayout.B0 = 0.0f;
            chatAttachAlertPhotoLayout.P.setZoom(0.0f);
            CameraController.getInstance().startPreview(chatAttachAlertPhotoLayout.P.getCameraSession());
        }
        if (chatAttachAlertPhotoLayout.f23059t0) {
            ArrayList arrayList = ChatAttachAlertPhotoLayout.f23019r1;
            if (arrayList.size() == 1) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) ChatAttachAlertPhotoLayout.f23019r1.get(i10);
                    new File(photoEntry.path).delete();
                    if (photoEntry.imagePath != null) {
                        new File(photoEntry.imagePath).delete();
                    }
                    if (photoEntry.thumbPath != null) {
                        new File(photoEntry.thumbPath).delete();
                    }
                }
                ChatAttachAlertPhotoLayout.f23019r1.clear();
                ChatAttachAlertPhotoLayout.f23021t1.clear();
                ChatAttachAlertPhotoLayout.f23020s1.clear();
                chatAttachAlertPhotoLayout.f23052p0.setVisibility(4);
                chatAttachAlertPhotoLayout.f23055r.setVisibility(8);
                chatAttachAlertPhotoLayout.G.l();
                chatAttachAlertPhotoLayout.v.l();
                chatAttachAlertPhotoLayout.f27671b.Z1(0);
            }
        }
        return true;
    }

    @Override
    public final boolean z() {
        vi viVar = this.f25994c.f27671b;
        if (!viVar.F && !viVar.H) {
            return true;
        }
        return false;
    }
}
