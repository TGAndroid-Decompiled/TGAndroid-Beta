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
public final class ll extends tl {
    public final boolean f30468b;
    public final ChatAttachAlertPhotoLayout f30469c;

    public ll(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z10) {
        super(chatAttachAlertPhotoLayout);
        this.f30469c = chatAttachAlertPhotoLayout;
        this.f30468b = z10;
    }

    @Override
    public final void D() {
        boolean z10 = ChatAttachAlertPhotoLayout.f26241m1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30469c;
        chatAttachAlertPhotoLayout.l0();
        chatAttachAlertPhotoLayout.A(ChatAttachAlertPhotoLayout.f26243o1.size());
    }

    @Override
    public final void G() {
        kl klVar = this.f30469c.A;
        int childCount = klVar.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = klVar.getChildAt(i9);
            if (childAt instanceof org.telegram.ui.Cells.t5) {
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                t5Var.f25683a.getImageReceiver().setVisible(true, true);
                t5Var.g(true);
            }
        }
    }

    @Override
    public final boolean J() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30469c;
        if (!chatAttachAlertPhotoLayout.f27493b.R) {
            int i9 = Settings.System.getInt(chatAttachAlertPhotoLayout.getContext().getContentResolver(), "accelerometer_rotation", 0);
            if (this.f30468b || i9 == 1) {
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
        boolean z10 = ChatAttachAlertPhotoLayout.f26241m1;
        this.f30469c.j0();
    }

    @Override
    public final boolean g() {
        if (this.f30469c.f27493b.O1 != 1) {
            return true;
        }
        return false;
    }

    @Override
    public final void i() {
        boolean z10 = ChatAttachAlertPhotoLayout.f26241m1;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i9) {
        return null;
    }

    @Override
    public final void n() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30469c;
        TextView textView = chatAttachAlertPhotoLayout.f26268l0;
        chatAttachAlertPhotoLayout.f26272p0 = false;
        if (ChatAttachAlertPhotoLayout.f26241m1) {
            ki kiVar = chatAttachAlertPhotoLayout.f27493b;
            kiVar.V1.L(0, true, true, 0, 0, 0L, kiVar.s1(), false, 0L);
            return;
        }
        if (!chatAttachAlertPhotoLayout.U) {
            chatAttachAlertPhotoLayout.g0(false);
        }
        textView.setVisibility(0);
        chatAttachAlertPhotoLayout.f26274r.setVisibility(0);
        textView.setAlpha(1.0f);
        chatAttachAlertPhotoLayout.x0(false);
    }

    @Override
    public final void o(int i9, VideoEditedInfo videoEditedInfo, boolean z10, int i10, int i11, boolean z11) {
        ki kiVar = this.f30469c.f27493b;
        ArrayList arrayList = ChatAttachAlertPhotoLayout.f26242n1;
        if (!arrayList.isEmpty() && !kiVar.R) {
            if (videoEditedInfo != null && i9 >= 0 && i9 < arrayList.size()) {
                ((MediaController.PhotoEntry) arrayList.get(i9)).editedInfo = videoEditedInfo;
            }
            org.telegram.ui.ActionBar.o2 o2Var = kiVar.f30099b0;
            if (!(o2Var instanceof org.telegram.ui.qn) || !((org.telegram.ui.qn) o2Var).w()) {
                int size = arrayList.size();
                for (int i12 = 0; i12 < size; i12++) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) ChatAttachAlertPhotoLayout.f26242n1.get(i12);
                    if (photoEntry.ttl <= 0) {
                        AndroidUtilities.addMediaToGallery(photoEntry.path);
                    }
                }
            }
            kiVar.Y0();
            PhotoViewer.t1();
            PhotoViewer.t1().K = false;
            PhotoViewer.t1().f35725q2 = false;
            y4.a0(kiVar.F1, kiVar.j1() + ChatAttachAlertPhotoLayout.f26243o1.size(), kiVar.n1(), new gl(this, z11, z10, i10));
        }
    }

    @Override
    public final boolean u() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30469c;
        if (chatAttachAlertPhotoLayout.U && chatAttachAlertPhotoLayout.L != null) {
            AndroidUtilities.runOnUIThread(new fg(this, 24), 1000L);
            chatAttachAlertPhotoLayout.f26260h0.b(0.0f, false);
            chatAttachAlertPhotoLayout.f26284x0 = 0.0f;
            chatAttachAlertPhotoLayout.L.setZoom(0.0f);
            CameraController.getInstance().startPreview(chatAttachAlertPhotoLayout.L.getCameraSession());
        }
        if (chatAttachAlertPhotoLayout.f26272p0) {
            ArrayList arrayList = ChatAttachAlertPhotoLayout.f26242n1;
            if (arrayList.size() == 1) {
                int size = arrayList.size();
                for (int i9 = 0; i9 < size; i9++) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) ChatAttachAlertPhotoLayout.f26242n1.get(i9);
                    new File(photoEntry.path).delete();
                    if (photoEntry.imagePath != null) {
                        new File(photoEntry.imagePath).delete();
                    }
                    if (photoEntry.thumbPath != null) {
                        new File(photoEntry.thumbPath).delete();
                    }
                }
                ChatAttachAlertPhotoLayout.f26242n1.clear();
                ChatAttachAlertPhotoLayout.f26244p1.clear();
                ChatAttachAlertPhotoLayout.f26243o1.clear();
                chatAttachAlertPhotoLayout.f26268l0.setVisibility(4);
                chatAttachAlertPhotoLayout.f26274r.setVisibility(8);
                chatAttachAlertPhotoLayout.C.l();
                chatAttachAlertPhotoLayout.v.l();
                chatAttachAlertPhotoLayout.f27493b.V1(0);
            }
        }
        return true;
    }

    @Override
    public final boolean z() {
        ki kiVar = this.f30469c.f27493b;
        if (!kiVar.B && !kiVar.D) {
            return true;
        }
        return false;
    }
}
