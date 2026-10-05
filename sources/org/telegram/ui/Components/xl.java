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
public final class xl extends fm {
    public final boolean f32993b;
    public final ChatAttachAlertPhotoLayout f32994c;

    public xl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z10) {
        super(chatAttachAlertPhotoLayout);
        this.f32994c = chatAttachAlertPhotoLayout;
        this.f32993b = z10;
    }

    @Override
    public final void D() {
        boolean z10 = ChatAttachAlertPhotoLayout.f24025q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f32994c;
        chatAttachAlertPhotoLayout.m0();
        chatAttachAlertPhotoLayout.A(ChatAttachAlertPhotoLayout.f24027s1.size());
    }

    @Override
    public final void G() {
        wl wlVar = this.f32994c.E;
        int childCount = wlVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = wlVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.t5) {
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                t5Var.f23062a.getImageReceiver().setVisible(true, true);
                t5Var.g(true);
            }
        }
    }

    @Override
    public final boolean J() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f32994c;
        if (!chatAttachAlertPhotoLayout.f29741b.V) {
            int i10 = Settings.System.getInt(chatAttachAlertPhotoLayout.getContext().getContentResolver(), "accelerometer_rotation", 0);
            if (this.f32993b || i10 == 1) {
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
        boolean z10 = ChatAttachAlertPhotoLayout.f24025q1;
        this.f32994c.k0();
    }

    @Override
    public final boolean g() {
        if (this.f32994c.f29741b.S1 != 1) {
            return true;
        }
        return false;
    }

    @Override
    public final void i() {
        boolean z10 = ChatAttachAlertPhotoLayout.f24025q1;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        return null;
    }

    @Override
    public final void n() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f32994c;
        TextView textView = chatAttachAlertPhotoLayout.f24059p0;
        chatAttachAlertPhotoLayout.f24066t0 = false;
        if (ChatAttachAlertPhotoLayout.f24025q1) {
            xi xiVar = chatAttachAlertPhotoLayout.f29741b;
            xiVar.Z1.B1(0, true, true, 0, 0, 0L, xiVar.r1(), false, 0L);
            return;
        }
        if (!chatAttachAlertPhotoLayout.f24032b0) {
            chatAttachAlertPhotoLayout.h0(false);
        }
        textView.setVisibility(0);
        chatAttachAlertPhotoLayout.f24062r.setVisibility(0);
        textView.setAlpha(1.0f);
        chatAttachAlertPhotoLayout.y0(false);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        xi xiVar = this.f32994c.f29741b;
        ArrayList arrayList = ChatAttachAlertPhotoLayout.f24026r1;
        if (!arrayList.isEmpty() && !xiVar.V) {
            if (videoEditedInfo != null && i10 >= 0 && i10 < arrayList.size()) {
                ((MediaController.PhotoEntry) arrayList.get(i10)).editedInfo = videoEditedInfo;
            }
            org.telegram.ui.ActionBar.n2 n2Var = xiVar.f32910f0;
            if (!(n2Var instanceof org.telegram.ui.yn) || !((org.telegram.ui.yn) n2Var).v()) {
                int size = arrayList.size();
                for (int i13 = 0; i13 < size; i13++) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) ChatAttachAlertPhotoLayout.f24026r1.get(i13);
                    if (photoEntry.ttl <= 0) {
                        AndroidUtilities.addMediaToGallery(photoEntry.path);
                    }
                }
            }
            xiVar.Z0();
            PhotoViewer.t1();
            PhotoViewer.t1().O = false;
            PhotoViewer.t1().f34056u2 = false;
            e5.a0(xiVar.J1, xiVar.j1() + ChatAttachAlertPhotoLayout.f24027s1.size(), xiVar.n1(), new sl(this, z11, z10, i11));
        }
    }

    @Override
    public final boolean u() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f32994c;
        if (chatAttachAlertPhotoLayout.f24032b0 && chatAttachAlertPhotoLayout.P != null) {
            AndroidUtilities.runOnUIThread(new qg(this, 24), 1000L);
            chatAttachAlertPhotoLayout.f24052l0.b(0.0f, false);
            chatAttachAlertPhotoLayout.B0 = 0.0f;
            chatAttachAlertPhotoLayout.P.setZoom(0.0f);
            CameraController.getInstance().startPreview(chatAttachAlertPhotoLayout.P.getCameraSession());
        }
        if (chatAttachAlertPhotoLayout.f24066t0) {
            ArrayList arrayList = ChatAttachAlertPhotoLayout.f24026r1;
            if (arrayList.size() == 1) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) ChatAttachAlertPhotoLayout.f24026r1.get(i10);
                    new File(photoEntry.path).delete();
                    if (photoEntry.imagePath != null) {
                        new File(photoEntry.imagePath).delete();
                    }
                    if (photoEntry.thumbPath != null) {
                        new File(photoEntry.thumbPath).delete();
                    }
                }
                ChatAttachAlertPhotoLayout.f24026r1.clear();
                ChatAttachAlertPhotoLayout.f24028t1.clear();
                ChatAttachAlertPhotoLayout.f24027s1.clear();
                chatAttachAlertPhotoLayout.f24059p0.setVisibility(4);
                chatAttachAlertPhotoLayout.f24062r.setVisibility(8);
                chatAttachAlertPhotoLayout.G.l();
                chatAttachAlertPhotoLayout.v.l();
                chatAttachAlertPhotoLayout.f29741b.U1(0);
            }
        }
        return true;
    }

    @Override
    public final boolean z() {
        xi xiVar = this.f32994c.f29741b;
        if (!xiVar.F && !xiVar.H) {
            return true;
        }
        return false;
    }
}
