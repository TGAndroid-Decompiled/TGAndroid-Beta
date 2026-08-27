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

public final class hl extends pl {

    public final boolean f29054b;

    public final ChatAttachAlertPhotoLayout f29055c;

    public hl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z10) {
        super(chatAttachAlertPhotoLayout);
        this.f29055c = chatAttachAlertPhotoLayout;
        this.f29054b = z10;
    }

    @Override
    public final void D() {
        boolean z10 = ChatAttachAlertPhotoLayout.f26237m1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29055c;
        chatAttachAlertPhotoLayout.m0();
        chatAttachAlertPhotoLayout.C(ChatAttachAlertPhotoLayout.f26239o1.size());
    }

    @Override
    public final void G() {
        gl glVar = this.f29055c.A;
        int childCount = glVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = glVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.q5) {
                org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                q5Var.f25053a.getImageReceiver().setVisible(true, true);
                q5Var.g(true);
            }
        }
    }

    @Override
    public final boolean J() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29055c;
        if (!chatAttachAlertPhotoLayout.f34900b.R) {
            int i10 = Settings.System.getInt(chatAttachAlertPhotoLayout.getContext().getContentResolver(), "accelerometer_rotation", 0);
            if (this.f29054b || i10 == 1) {
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
        boolean z10 = ChatAttachAlertPhotoLayout.f26237m1;
        this.f29055c.k0();
    }

    @Override
    public final boolean g() {
        return this.f29055c.f34900b.O1 != 1;
    }

    @Override
    public final void i() {
        boolean z10 = ChatAttachAlertPhotoLayout.f26237m1;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        return null;
    }

    @Override
    public final void n() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29055c;
        TextView textView = chatAttachAlertPhotoLayout.f26264l0;
        chatAttachAlertPhotoLayout.f26268p0 = false;
        if (ChatAttachAlertPhotoLayout.f26237m1) {
            gi giVar = chatAttachAlertPhotoLayout.f34900b;
            giVar.V1.n0(0, true, true, 0, 0, 0L, giVar.s1(), false, 0L);
            return;
        }
        if (!chatAttachAlertPhotoLayout.U) {
            chatAttachAlertPhotoLayout.h0(false);
        }
        textView.setVisibility(0);
        chatAttachAlertPhotoLayout.f26270r.setVisibility(0);
        textView.setAlpha(1.0f);
        chatAttachAlertPhotoLayout.y0(false);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        gi giVar = this.f29055c.f34900b;
        ArrayList arrayList = ChatAttachAlertPhotoLayout.f26238n1;
        if (arrayList.isEmpty() || giVar.R) {
            return;
        }
        if (videoEditedInfo != null && i10 >= 0 && i10 < arrayList.size()) {
            ((MediaController.PhotoEntry) arrayList.get(i10)).editedInfo = videoEditedInfo;
        }
        org.telegram.ui.ActionBar.n2 n2Var = giVar.f28635b0;
        if (!(n2Var instanceof org.telegram.ui.rn) || !((org.telegram.ui.rn) n2Var).x()) {
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) ChatAttachAlertPhotoLayout.f26238n1.get(i13);
                if (photoEntry.ttl <= 0) {
                    AndroidUtilities.addMediaToGallery(photoEntry.path);
                }
            }
        }
        giVar.Y0();
        PhotoViewer.t1();
        PhotoViewer.t1().K = false;
        PhotoViewer.t1().f35729q2 = false;
        y4.a0(giVar.F1, giVar.j1() + ChatAttachAlertPhotoLayout.f26239o1.size(), giVar.n1(), new cl(this, z11, z10, i11));
    }

    @Override
    public final boolean u() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29055c;
        if (chatAttachAlertPhotoLayout.U && chatAttachAlertPhotoLayout.L != null) {
            AndroidUtilities.runOnUIThread(new bg(this, 24), 1000L);
            chatAttachAlertPhotoLayout.f26256h0.b(0.0f, false);
            chatAttachAlertPhotoLayout.f26280x0 = 0.0f;
            chatAttachAlertPhotoLayout.L.setZoom(0.0f);
            CameraController.getInstance().startPreview(chatAttachAlertPhotoLayout.L.getCameraSession());
        }
        if (chatAttachAlertPhotoLayout.f26268p0) {
            ArrayList arrayList = ChatAttachAlertPhotoLayout.f26238n1;
            if (arrayList.size() == 1) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) ChatAttachAlertPhotoLayout.f26238n1.get(i10);
                    new File(photoEntry.path).delete();
                    if (photoEntry.imagePath != null) {
                        new File(photoEntry.imagePath).delete();
                    }
                    if (photoEntry.thumbPath != null) {
                        new File(photoEntry.thumbPath).delete();
                    }
                }
                ChatAttachAlertPhotoLayout.f26238n1.clear();
                ChatAttachAlertPhotoLayout.f26240p1.clear();
                ChatAttachAlertPhotoLayout.f26239o1.clear();
                chatAttachAlertPhotoLayout.f26264l0.setVisibility(4);
                chatAttachAlertPhotoLayout.f26270r.setVisibility(8);
                chatAttachAlertPhotoLayout.C.l();
                chatAttachAlertPhotoLayout.v.l();
                chatAttachAlertPhotoLayout.f34900b.V1(0);
            }
        }
        return true;
    }

    @Override
    public final boolean z() {
        gi giVar = this.f29055c.f34900b;
        return (giVar.B || giVar.D) ? false : true;
    }
}
