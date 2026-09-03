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
public final class rl extends am {
    public final boolean f30806b;
    public final ChatAttachAlertPhotoLayout f30807c;

    public rl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z4) {
        super(chatAttachAlertPhotoLayout);
        this.f30807c = chatAttachAlertPhotoLayout;
        this.f30806b = z4;
    }

    @Override
    public final void D() {
        boolean z4 = ChatAttachAlertPhotoLayout.f24738n1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30807c;
        chatAttachAlertPhotoLayout.m0();
        chatAttachAlertPhotoLayout.B(ChatAttachAlertPhotoLayout.f24740p1.size());
    }

    @Override
    public final void G() {
        ql qlVar = this.f30807c.B;
        int childCount = qlVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = qlVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.t5) {
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                t5Var.f24151a.getImageReceiver().setVisible(true, true);
                t5Var.g(true);
            }
        }
    }

    @Override
    public final boolean J() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30807c;
        if (!chatAttachAlertPhotoLayout.f26590b.S) {
            int i10 = Settings.System.getInt(chatAttachAlertPhotoLayout.getContext().getContentResolver(), "accelerometer_rotation", 0);
            if (this.f30806b || i10 == 1) {
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
        boolean z4 = ChatAttachAlertPhotoLayout.f24738n1;
        this.f30807c.k0();
    }

    @Override
    public final boolean g() {
        if (this.f30807c.f26590b.P1 != 1) {
            return true;
        }
        return false;
    }

    @Override
    public final void i() {
        boolean z4 = ChatAttachAlertPhotoLayout.f24738n1;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        return null;
    }

    @Override
    public final void n() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30807c;
        TextView textView = chatAttachAlertPhotoLayout.m0;
        chatAttachAlertPhotoLayout.f24771q0 = false;
        if (ChatAttachAlertPhotoLayout.f24738n1) {
            mi miVar = chatAttachAlertPhotoLayout.f26590b;
            miVar.W1.I1(0, true, true, 0, 0, 0L, miVar.s1(), false, 0L);
            return;
        }
        if (!chatAttachAlertPhotoLayout.V) {
            chatAttachAlertPhotoLayout.h0(false);
        }
        textView.setVisibility(0);
        chatAttachAlertPhotoLayout.f24772r.setVisibility(0);
        textView.setAlpha(1.0f);
        chatAttachAlertPhotoLayout.y0(false);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z4, int i11, int i12, boolean z10) {
        mi miVar = this.f30807c.f26590b;
        ArrayList arrayList = ChatAttachAlertPhotoLayout.f24739o1;
        if (!arrayList.isEmpty() && !miVar.S) {
            if (videoEditedInfo != null && i10 >= 0 && i10 < arrayList.size()) {
                ((MediaController.PhotoEntry) arrayList.get(i10)).editedInfo = videoEditedInfo;
            }
            org.telegram.ui.ActionBar.p2 p2Var = miVar.f29058c0;
            if (!(p2Var instanceof org.telegram.ui.xn) || !((org.telegram.ui.xn) p2Var).w()) {
                int size = arrayList.size();
                for (int i13 = 0; i13 < size; i13++) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) ChatAttachAlertPhotoLayout.f24739o1.get(i13);
                    if (photoEntry.ttl <= 0) {
                        AndroidUtilities.addMediaToGallery(photoEntry.path);
                    }
                }
            }
            miVar.Y0();
            PhotoViewer.t1();
            PhotoViewer.t1().L = false;
            PhotoViewer.t1().f34377r2 = false;
            z4.a0(miVar.G1, miVar.j1() + ChatAttachAlertPhotoLayout.f24740p1.size(), miVar.n1(), new ll(this, z10, z4, i11));
        }
    }

    @Override
    public final boolean u() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30807c;
        if (chatAttachAlertPhotoLayout.V && chatAttachAlertPhotoLayout.M != null) {
            AndroidUtilities.runOnUIThread(new fg(this, 24), 1000L);
            chatAttachAlertPhotoLayout.f24759i0.b(0.0f, false);
            chatAttachAlertPhotoLayout.f24784y0 = 0.0f;
            chatAttachAlertPhotoLayout.M.setZoom(0.0f);
            CameraController.getInstance().startPreview(chatAttachAlertPhotoLayout.M.getCameraSession());
        }
        if (chatAttachAlertPhotoLayout.f24771q0) {
            ArrayList arrayList = ChatAttachAlertPhotoLayout.f24739o1;
            if (arrayList.size() == 1) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) ChatAttachAlertPhotoLayout.f24739o1.get(i10);
                    new File(photoEntry.path).delete();
                    if (photoEntry.imagePath != null) {
                        new File(photoEntry.imagePath).delete();
                    }
                    if (photoEntry.thumbPath != null) {
                        new File(photoEntry.thumbPath).delete();
                    }
                }
                ChatAttachAlertPhotoLayout.f24739o1.clear();
                ChatAttachAlertPhotoLayout.f24741q1.clear();
                ChatAttachAlertPhotoLayout.f24740p1.clear();
                chatAttachAlertPhotoLayout.m0.setVisibility(4);
                chatAttachAlertPhotoLayout.f24772r.setVisibility(8);
                chatAttachAlertPhotoLayout.D.l();
                chatAttachAlertPhotoLayout.v.l();
                chatAttachAlertPhotoLayout.f26590b.V1(0);
            }
        }
        return true;
    }

    @Override
    public final boolean z() {
        mi miVar = this.f30807c.f26590b;
        if (!miVar.C && !miVar.E) {
            return true;
        }
        return false;
    }
}
