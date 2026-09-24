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
public final class vl extends dm {
    public final boolean f29168b;
    public final ChatAttachAlertPhotoLayout f29169c;

    public vl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z10) {
        super(chatAttachAlertPhotoLayout);
        this.f29169c = chatAttachAlertPhotoLayout;
        this.f29168b = z10;
    }

    @Override
    public final void D() {
        boolean z10 = ChatAttachAlertPhotoLayout.f22106q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29169c;
        chatAttachAlertPhotoLayout.m0();
        chatAttachAlertPhotoLayout.A(ChatAttachAlertPhotoLayout.f22108s1.size());
    }

    @Override
    public final void G() {
        ul ulVar = this.f29169c.E;
        int childCount = ulVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = ulVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.t5) {
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                t5Var.f21184a.getImageReceiver().setVisible(true, true);
                t5Var.g(true);
            }
        }
    }

    @Override
    public final boolean J() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29169c;
        if (!chatAttachAlertPhotoLayout.f27083b.V) {
            int i10 = Settings.System.getInt(chatAttachAlertPhotoLayout.getContext().getContentResolver(), "accelerometer_rotation", 0);
            if (this.f29168b || i10 == 1) {
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
        boolean z10 = ChatAttachAlertPhotoLayout.f22106q1;
        this.f29169c.k0();
    }

    @Override
    public final boolean g() {
        if (this.f29169c.f27083b.S1 != 1) {
            return true;
        }
        return false;
    }

    @Override
    public final void i() {
        boolean z10 = ChatAttachAlertPhotoLayout.f22106q1;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        return null;
    }

    @Override
    public final void n() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29169c;
        TextView textView = chatAttachAlertPhotoLayout.f22140p0;
        chatAttachAlertPhotoLayout.f22147t0 = false;
        if (ChatAttachAlertPhotoLayout.f22106q1) {
            wi wiVar = chatAttachAlertPhotoLayout.f27083b;
            wiVar.Z1.B1(0, true, true, 0, 0, 0L, wiVar.s1(), false, 0L);
            return;
        }
        if (!chatAttachAlertPhotoLayout.f22113b0) {
            chatAttachAlertPhotoLayout.h0(false);
        }
        textView.setVisibility(0);
        chatAttachAlertPhotoLayout.f22143r.setVisibility(0);
        textView.setAlpha(1.0f);
        chatAttachAlertPhotoLayout.y0(false);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        wi wiVar = this.f29169c.f27083b;
        ArrayList arrayList = ChatAttachAlertPhotoLayout.f22107r1;
        if (!arrayList.isEmpty() && !wiVar.V) {
            if (videoEditedInfo != null && i10 >= 0 && i10 < arrayList.size()) {
                ((MediaController.PhotoEntry) arrayList.get(i10)).editedInfo = videoEditedInfo;
            }
            org.telegram.ui.ActionBar.m2 m2Var = wiVar.f29985f0;
            if (!(m2Var instanceof org.telegram.ui.wn) || !((org.telegram.ui.wn) m2Var).v()) {
                int size = arrayList.size();
                for (int i13 = 0; i13 < size; i13++) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) ChatAttachAlertPhotoLayout.f22107r1.get(i13);
                    if (photoEntry.ttl <= 0) {
                        AndroidUtilities.addMediaToGallery(photoEntry.path);
                    }
                }
            }
            wiVar.Y0();
            PhotoViewer.t1();
            PhotoViewer.t1().O = false;
            PhotoViewer.t1().f31351u2 = false;
            e5.a0(wiVar.J1, wiVar.j1() + ChatAttachAlertPhotoLayout.f22108s1.size(), wiVar.n1(), new ql(this, z11, z10, i11));
        }
    }

    @Override
    public final boolean u() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29169c;
        if (chatAttachAlertPhotoLayout.f22113b0 && chatAttachAlertPhotoLayout.P != null) {
            AndroidUtilities.runOnUIThread(new pg(this, 24), 1000L);
            chatAttachAlertPhotoLayout.f22133l0.b(0.0f, false);
            chatAttachAlertPhotoLayout.B0 = 0.0f;
            chatAttachAlertPhotoLayout.P.setZoom(0.0f);
            CameraController.getInstance().startPreview(chatAttachAlertPhotoLayout.P.getCameraSession());
        }
        if (chatAttachAlertPhotoLayout.f22147t0) {
            ArrayList arrayList = ChatAttachAlertPhotoLayout.f22107r1;
            if (arrayList.size() == 1) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) ChatAttachAlertPhotoLayout.f22107r1.get(i10);
                    new File(photoEntry.path).delete();
                    if (photoEntry.imagePath != null) {
                        new File(photoEntry.imagePath).delete();
                    }
                    if (photoEntry.thumbPath != null) {
                        new File(photoEntry.thumbPath).delete();
                    }
                }
                ChatAttachAlertPhotoLayout.f22107r1.clear();
                ChatAttachAlertPhotoLayout.f22109t1.clear();
                ChatAttachAlertPhotoLayout.f22108s1.clear();
                chatAttachAlertPhotoLayout.f22140p0.setVisibility(4);
                chatAttachAlertPhotoLayout.f22143r.setVisibility(8);
                chatAttachAlertPhotoLayout.G.l();
                chatAttachAlertPhotoLayout.v.l();
                chatAttachAlertPhotoLayout.f27083b.V1(0);
            }
        }
        return true;
    }

    @Override
    public final boolean z() {
        wi wiVar = this.f29169c.f27083b;
        if (!wiVar.F && !wiVar.H) {
            return true;
        }
        return false;
    }
}
