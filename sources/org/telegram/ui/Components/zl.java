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
public final class zl extends hm {
    public final boolean f29717b;
    public final ChatAttachAlertPhotoLayout f29718c;

    public zl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z10) {
        super(chatAttachAlertPhotoLayout);
        this.f29718c = chatAttachAlertPhotoLayout;
        this.f29717b = z10;
    }

    @Override
    public final void D() {
        boolean z10 = ChatAttachAlertPhotoLayout.f20983q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29718c;
        chatAttachAlertPhotoLayout.m0();
        chatAttachAlertPhotoLayout.A(ChatAttachAlertPhotoLayout.f20985s1.size());
    }

    @Override
    public final void G() {
        yl ylVar = this.f29718c.E;
        int childCount = ylVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = ylVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.t5) {
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                t5Var.f20434a.getImageReceiver().setVisible(true, true);
                t5Var.g(true);
            }
        }
    }

    @Override
    public final boolean J() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29718c;
        if (!chatAttachAlertPhotoLayout.f26422b.V) {
            int i10 = Settings.System.getInt(chatAttachAlertPhotoLayout.getContext().getContentResolver(), "accelerometer_rotation", 0);
            if (this.f29717b || i10 == 1) {
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
        boolean z10 = ChatAttachAlertPhotoLayout.f20983q1;
        this.f29718c.k0();
    }

    @Override
    public final boolean g() {
        if (this.f29718c.f26422b.S1 != 1) {
            return true;
        }
        return false;
    }

    @Override
    public final void i() {
        boolean z10 = ChatAttachAlertPhotoLayout.f20983q1;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        return null;
    }

    @Override
    public final void n() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29718c;
        TextView textView = chatAttachAlertPhotoLayout.f21017p0;
        chatAttachAlertPhotoLayout.f21024t0 = false;
        if (ChatAttachAlertPhotoLayout.f20983q1) {
            yi yiVar = chatAttachAlertPhotoLayout.f26422b;
            yiVar.Z1.A1(0, true, true, 0, 0, 0L, yiVar.s1(), false, 0L);
            return;
        }
        if (!chatAttachAlertPhotoLayout.f20990b0) {
            chatAttachAlertPhotoLayout.h0(false);
        }
        textView.setVisibility(0);
        chatAttachAlertPhotoLayout.f21020r.setVisibility(0);
        textView.setAlpha(1.0f);
        chatAttachAlertPhotoLayout.y0(false);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        yi yiVar = this.f29718c.f26422b;
        ArrayList arrayList = ChatAttachAlertPhotoLayout.f20984r1;
        if (!arrayList.isEmpty() && !yiVar.V) {
            if (videoEditedInfo != null && i10 >= 0 && i10 < arrayList.size()) {
                ((MediaController.PhotoEntry) arrayList.get(i10)).editedInfo = videoEditedInfo;
            }
            org.telegram.ui.ActionBar.p2 p2Var = yiVar.f29366f0;
            if (!(p2Var instanceof org.telegram.ui.eo) || !((org.telegram.ui.eo) p2Var).u()) {
                int size = arrayList.size();
                for (int i13 = 0; i13 < size; i13++) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) ChatAttachAlertPhotoLayout.f20984r1.get(i13);
                    if (photoEntry.ttl <= 0) {
                        AndroidUtilities.addMediaToGallery(photoEntry.path);
                    }
                }
            }
            yiVar.Y0();
            PhotoViewer.t1();
            PhotoViewer.t1().O = false;
            PhotoViewer.t1().f30191u2 = false;
            d5.a0(yiVar.J1, yiVar.j1() + ChatAttachAlertPhotoLayout.f20985s1.size(), yiVar.n1(), new ul(this, z11, z10, i11));
        }
    }

    @Override
    public final boolean u() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29718c;
        if (chatAttachAlertPhotoLayout.f20990b0 && chatAttachAlertPhotoLayout.P != null) {
            AndroidUtilities.runOnUIThread(new rg(this, 24), 1000L);
            chatAttachAlertPhotoLayout.f21010l0.b(0.0f, false);
            chatAttachAlertPhotoLayout.B0 = 0.0f;
            chatAttachAlertPhotoLayout.P.setZoom(0.0f);
            CameraController.getInstance().startPreview(chatAttachAlertPhotoLayout.P.getCameraSession());
        }
        if (chatAttachAlertPhotoLayout.f21024t0) {
            ArrayList arrayList = ChatAttachAlertPhotoLayout.f20984r1;
            if (arrayList.size() == 1) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) ChatAttachAlertPhotoLayout.f20984r1.get(i10);
                    new File(photoEntry.path).delete();
                    if (photoEntry.imagePath != null) {
                        new File(photoEntry.imagePath).delete();
                    }
                    if (photoEntry.thumbPath != null) {
                        new File(photoEntry.thumbPath).delete();
                    }
                }
                ChatAttachAlertPhotoLayout.f20984r1.clear();
                ChatAttachAlertPhotoLayout.f20986t1.clear();
                ChatAttachAlertPhotoLayout.f20985s1.clear();
                chatAttachAlertPhotoLayout.f21017p0.setVisibility(4);
                chatAttachAlertPhotoLayout.f21020r.setVisibility(8);
                chatAttachAlertPhotoLayout.G.l();
                chatAttachAlertPhotoLayout.v.l();
                chatAttachAlertPhotoLayout.f26422b.V1(0);
            }
        }
        return true;
    }

    @Override
    public final boolean z() {
        yi yiVar = this.f29718c.f26422b;
        if (!yiVar.F && !yiVar.H) {
            return true;
        }
        return false;
    }
}
